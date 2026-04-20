/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.internal;
import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.collection.*;
import io.vavr.control.Option;
import org.assertj.core.api.AssertionInfo;
import org.assertj.core.api.Condition;
import org.assertj.core.internal.Conditions;
import org.assertj.core.internal.Failures;
import org.assertj.core.internal.Objects;
import static io.vavr.Predicates.not;
import static org.assertj.core.error.ElementsShouldBe.elementsShouldBe;
import static org.assertj.core.error.ShouldContain.shouldContain;
import static org.assertj.core.error.ShouldContainAnyOf.shouldContainAnyOf;
import static org.assertj.core.error.ShouldContainExactly.elementsDifferAtIndex;
import static org.assertj.core.error.ShouldContainExactly.shouldContainExactly;
import static org.assertj.core.error.ShouldContainKeys.shouldContainKeys;
import static org.assertj.core.error.ShouldContainOnly.shouldContainOnly;
import static org.assertj.core.error.ShouldContainOnlyKeys.shouldContainOnlyKeys;
import static org.assertj.core.error.ShouldContainValue.shouldContainValue;
import static org.assertj.core.error.ShouldContainValues.shouldContainValues;
import static org.assertj.core.error.ShouldNotContain.shouldNotContain;
import static org.assertj.core.error.ShouldNotContainKeys.shouldNotContainKeys;
import static org.assertj.core.error.ShouldNotContainValue.shouldNotContainValue;
import static org.assertj.core.internal.Arrays.assertIsArray;
import static org.assertj.core.internal.CommonValidations.failIfEmptySinceActualIsNotEmpty;
import static org.assertj.core.internal.CommonValidations.hasSameSizeAsCheck;
import static org.assertj.core.util.Objects.areEqual;
import static org.assertj.core.util.Preconditions.checkArgument;
import static org.assertj.core.util.Preconditions.checkNotNull;
public final class Multimaps {
    private static final org.assertj.vavr.internal.Multimaps INSTANCE = new org.assertj.vavr.internal.Multimaps();

    private org.assertj.core.internal.Failures failures = org.assertj.core.internal.Failures.instance();

    private org.assertj.core.internal.Conditions conditions = org.assertj.core.internal.Conditions.instance();

    private Multimaps() {
    }

    public static org.assertj.vavr.internal.Multimaps instance() {
        return org.assertj.vavr.internal.Multimaps.INSTANCE;
    }

    /**
     * Verifies that the given {@code Multimap} contains the value for given {@code key} that satisfy given {@code valueCondition}.
     *
     * @param <K>
     * 		key type
     * @param <V>
     * 		value type
     * @param info
     * 		contains information about the assertion
     * @param actual
     * 		the given {@code Multimap}
     * @param key
     * 		the given key to check
     * @param valueCondition
     * 		the given condition for check value
     * @throws NullPointerException
     * 		if the given values is {@code null}
     * @throws AssertionError
     * 		if the actual map is {@code null}
     * @throws AssertionError
     * 		if the actual map does not contain the given {@code key}
     * @throws AssertionError
     * 		if the actual map contains the given key, but value does not match the given {@code valueCondition}
     */
    @java.lang.SuppressWarnings("unchecked")
    public <K, V> void assertHasEntrySatisfying(org.assertj.core.api.AssertionInfo info, Multimap<K, V> actual, K key, org.assertj.core.api.Condition<? super V> valueCondition) {
        conditions.assertIsNotNull(valueCondition);
        assertContainsKeys(info, actual, key);
        io.vavr.control.Option<Traversable<V>> value = actual.get(key);
        value.getOrElse(List.empty()).filter(valueCondition::matches).getOrElseThrow(() -> failures.failure(info, elementsShouldBe(actual, value, valueCondition)));
    }

    public <K, V> void assertContainsAnyOf(org.assertj.core.api.AssertionInfo info, Multimap<K, V> actual, io.vavr.Tuple2<K, V>[] entries) {
        doCommonContainsCheck(info, actual, entries);
        if (actual.isEmpty() && (entries.length == 0))
            return;

        org.assertj.core.internal.CommonValidations.failIfEmptySinceActualIsNotEmpty(entries);
        for (io.vavr.Tuple2<? extends K, ? extends V> entry : entries) {
            if (containsEntry(actual, entry))
                return;

        }
        throw failures.failure(info, org.assertj.core.error.ShouldContainAnyOf.shouldContainAnyOf(actual, entries));
    }

    /**
     * Asserts that the given {@code Multimap} contains the given entries, in any order.
     *
     * @param <K>
     * 		key type
     * @param <V>
     * 		value type
     * @param info
     * 		contains information about the assertion
     * @param actual
     * 		the given {@code Multimap}
     * @param entries
     * 		the entries that are expected to be in the given {@code Multimap}
     * @throws NullPointerException
     * 		if the array of entries is {@code null}
     * @throws IllegalArgumentException
     * 		if the array of entries is empty
     * @throws NullPointerException
     * 		if any of the entries in the given array is {@code null}
     * @throws AssertionError
     * 		if the given {@code Multimap} is {@code null}
     * @throws AssertionError
     * 		if the given {@code Multimap} does not contain the given entries
     */
    public <K, V> void assertContains(org.assertj.core.api.AssertionInfo info, Multimap<K, V> actual, io.vavr.Tuple2<K, V>[] entries) {
        doCommonContainsCheck(info, actual, entries);
        if (actual.isEmpty() && (entries.length == 0))
            return;

        org.assertj.core.internal.CommonValidations.failIfEmptySinceActualIsNotEmpty(entries);
        final Set<io.vavr.Tuple2<K, V>> notFound = Array.of(entries).filter(org.assertj.vavr.internal.Multimaps.entryNotPresentIn(actual)).toSet();
        if (org.assertj.vavr.internal.Multimaps.isNotEmpty(notFound)) {
            throw failures.failure(info, org.assertj.core.error.ShouldContain.shouldContain(actual, entries, notFound));
        }
    }

    /**
     * Asserts that the given {@code Multimap} contains the given entries only.
     *
     * @param <K>
     * 		key type
     * @param <V>
     * 		value type
     * @param info
     * 		contains information about the assertion
     * @param actual
     * 		the given {@code Multimap}
     * @param entries
     * 		the entries that are expected to only be in the given {@code Multimap}
     * @throws AssertionError
     * 		if the array of entries is {@code null}
     * @throws AssertionError
     * 		if the array of entries is empty
     * @throws NullPointerException
     * 		if any of the entries in the given array is {@code null}
     * @throws AssertionError
     * 		if the given {@code Multimap} is {@code null}
     * @throws AssertionError
     * 		if the given {@code Multimap} contains any of the given entries
     */
    public <K, V> void assertContainsOnly(org.assertj.core.api.AssertionInfo info, Multimap<K, V> actual, java.lang.Iterable<io.vavr.Tuple2<K, V>> entries) {
        org.assertj.vavr.internal.Multimaps.assertNotNull(info, actual);
        org.assertj.vavr.internal.Multimaps.failIfNull(entries);
        if (actual.isEmpty() && (!entries.iterator().hasNext()))
            return;

        org.assertj.vavr.internal.Multimaps.failIfEmpty(entries);
        Multimap<K, V> expected = HashMultimap.withSeq().ofEntries(entries);
        Multimap<K, V> notExpected = actual.filter(org.assertj.vavr.internal.Multimaps.entryNotPresentIn(expected));
        if (org.assertj.vavr.internal.Multimaps.isNotEmpty(notExpected)) {
            Multimap<K, V> notFound = expected.filter(org.assertj.vavr.internal.Multimaps.entryNotPresentIn(actual));
            throw failures.failure(info, org.assertj.core.error.ShouldContainOnly.shouldContainOnly(actual, expected, notFound, notExpected));
        }
    }

    /**
     * Verifies that the actual {@code Multimap} contains only the given entries and nothing else, <b>in order</b>.<br>
     * This assertion should only be used with {@code Multimap} that have a consistent iteration order (i.e. don't use it with
     * {@link io.vavr.collection.HashMultimap}).
     *
     * @param <K>
     * 		key type
     * @param <V>
     * 		value type
     * @param info
     * 		contains information about the assertion
     * @param actual
     * 		the given {@code Multimap}
     * @param entries
     * 		the given entries
     * @throws NullPointerException
     * 		if the given entries array is {@code null}
     * @throws AssertionError
     * 		if the actual map is {@code null}
     * @throws IllegalArgumentException
     * 		if the given entries array is empty
     * @throws AssertionError
     * 		if the actual {@code Multimap} does not contain the given entries with same order, i.e. the actual {@code Multimap}
     * 		contains some or none of the given entries, or the actual {@code Multimap} contains more entries than the given ones
     * 		or entries are the same but the order is not
     */
    public <K, V> void assertContainsExactly(org.assertj.core.api.AssertionInfo info, Multimap<K, V> actual, @java.lang.SuppressWarnings("unchecked")
    io.vavr.Tuple2<? extends K, ? extends V>... entries) {
        doCommonContainsCheck(info, actual, entries);
        if (actual.isEmpty() && (entries.length == 0))
            return;

        org.assertj.vavr.internal.Multimaps.failIfEmpty(entries);
        assertHasSameSizeAs(info, actual, entries);
        final Multimap<K, V> expectedEntries = org.assertj.vavr.internal.Multimaps.asLinkedMultimap(entries);
        final Multimap<K, V> notExpected = actual.filter(entry -> !expectedEntries.contains(entry));
        final Multimap<K, V> notFound = expectedEntries.filter(entry -> !actual.contains(entry));
        if (notExpected.isEmpty() && notFound.isEmpty()) {
            // check entries order
            int index = 0;
            for (K keyFromActual : actual.keySet()) {
                if (org.assertj.vavr.internal.Multimaps.areNotEqual(keyFromActual, entries[index]._1)) {
                    io.vavr.Tuple2<K, Traversable<V>> actualEntry = io.vavr.Tuple.of(keyFromActual, actual.get(keyFromActual).get());
                    throw failures.failure(info, org.assertj.core.error.ShouldContainExactly.elementsDifferAtIndex(actualEntry, entries[index], index));
                }
                index++;
            }
            // all entries are in the same order.
            return;
        }
        throw failures.failure(info, org.assertj.core.error.ShouldContainExactly.shouldContainExactly(actual, List.of(entries), notFound, notExpected));
    }

    /**
     * Asserts that the given {@code Multimap} does not contain the given entries.
     *
     * @param <K>
     * 		key type
     * @param <V>
     * 		value type
     * @param info
     * 		contains information about the assertion
     * @param actual
     * 		the given {@code Multimap}
     * @param entries
     * 		the entries that are expected to be in the given {@code Multimap}
     * @throws NullPointerException
     * 		if the array of entries is {@code null}
     * @throws IllegalArgumentException
     * 		if the array of entries is empty
     * @throws NullPointerException
     * 		if any of the entries in the given array is {@code null}
     * @throws AssertionError
     * 		if the given {@code Multimap} is {@code null}
     * @throws AssertionError
     * 		if the given {@code Multimap} contains any of the given entries
     */
    public <K, V> void assertDoesNotContain(org.assertj.core.api.AssertionInfo info, Multimap<K, V> actual, io.vavr.Tuple2<K, V>[] entries) {
        org.assertj.vavr.internal.Multimaps.failIfNullOrEmpty(entries);
        org.assertj.vavr.internal.Multimaps.assertNotNull(info, actual);
        org.assertj.core.internal.CommonValidations.failIfEmptySinceActualIsNotEmpty(entries);
        final Set<io.vavr.Tuple2<K, V>> found = Array.of(entries).filter(actual::contains).toSet();
        if (org.assertj.vavr.internal.Multimaps.isNotEmpty(found)) {
            throw failures.failure(info, org.assertj.core.error.ShouldNotContain.shouldNotContain(actual, entries, found));
        }
    }

    /**
     * Verifies that the actual {@code Multimap} contains the given keys.
     *
     * @param <K>
     * 		key type
     * @param <V>
     * 		value type
     * @param info
     * 		contains information about the assertion
     * @param actual
     * 		the given {@code Multimap}
     * @param keys
     * 		the given keys
     * @throws NullPointerException
     * 		if the array of keys is {@code null}
     * @throws IllegalArgumentException
     * 		if the array of keys is empty
     * @throws AssertionError
     * 		if the given {@code Multimap} is {@code null}
     * @throws AssertionError
     * 		if the given {@code Multimap} does not contain the given keys
     */
    public <K, V> void assertContainsKeys(org.assertj.core.api.AssertionInfo info, Multimap<K, V> actual, @java.lang.SuppressWarnings("unchecked")
    K... keys) {
        doCommonContainsCheck(info, actual, keys);
        if (doCommonEmptinessChecks(actual, keys))
            return;

        Set<K> expected = HashSet.of(keys);
        Set<K> notFound = expected.filter(org.assertj.vavr.internal.Multimaps.keyNotPresentIn(actual.keySet()));
        if (org.assertj.vavr.internal.Multimaps.isNotEmpty(notFound)) {
            throw failures.failure(info, org.assertj.core.error.ShouldContainKeys.shouldContainKeys(actual, notFound.toJavaSet()));
        }
    }

    /**
     * Asserts that the given {@code Multimap} contains the given keys, in any order.
     *
     * @param <K>
     * 		key type
     * @param <V>
     * 		value type
     * @param info
     * 		contains information about the assertion
     * @param actual
     * 		the given {@code Multimap}
     * @param keys
     * 		the keys that are expected to be in the given {@code Multimap}
     * @throws NullPointerException
     * 		if the array of keys is {@code null}
     * @throws IllegalArgumentException
     * 		if the array of keys is empty
     * @throws AssertionError
     * 		if the given {@code Multimap} is {@code null}
     * @throws AssertionError
     * 		if the given {@code Multimap} does not contain the given keys
     */
    public <K, V> void assertContainsOnlyKeys(org.assertj.core.api.AssertionInfo info, Multimap<K, V> actual, K[] keys) {
        doCommonContainsCheck(info, actual, keys);
        if (doCommonEmptinessChecks(actual, keys))
            return;

        Set<K> expected = HashSet.of(keys);
        Set<K> notExpected = actual.keySet().filter(org.assertj.vavr.internal.Multimaps.keyNotPresentIn(expected));
        if (org.assertj.vavr.internal.Multimaps.isNotEmpty(notExpected)) {
            Set<K> notFound = expected.filter(org.assertj.vavr.internal.Multimaps.keyNotPresentIn(actual.keySet()));
            throw failures.failure(info, org.assertj.core.error.ShouldContainOnlyKeys.shouldContainOnlyKeys(actual, expected, notFound, notExpected));
        }
    }

    /**
     * Verifies that the actual {@code Multimap} does not contain the given keys.
     *
     * @param <K>
     * 		key type
     * @param <V>
     * 		value type
     * @param info
     * 		contains information about the assertion
     * @param actual
     * 		the given {@code Multimap}
     * @param keys
     * 		the given keys
     * @throws NullPointerException
     * 		if the array of keys is {@code null}
     * @throws IllegalArgumentException
     * 		if the array of keys is empty
     * @throws AssertionError
     * 		if the given {@code Multimap} is {@code null}
     * @throws AssertionError
     * 		if the given {@code Multimap} contains the given keys
     */
    public <K, V> void assertDoesNotContainKeys(org.assertj.core.api.AssertionInfo info, Multimap<K, V> actual, @java.lang.SuppressWarnings("unchecked")
    K... keys) {
        doCommonContainsCheck(info, actual, keys);
        if (doCommonEmptinessChecks(actual, keys))
            return;

        Set<K> expected = HashSet.of(keys);
        Set<K> found = expected.filter(org.assertj.vavr.internal.Multimaps.keyPresentIn(actual.keySet()));
        if (org.assertj.vavr.internal.Multimaps.isNotEmpty(found)) {
            throw failures.failure(info, org.assertj.core.error.ShouldNotContainKeys.shouldNotContainKeys(actual, found.toJavaSet()));
        }
    }

    /**
     * Verifies that the actual {@code Multimap} contains the given value.
     *
     * @param <K>
     * 		key type
     * @param <V>
     * 		value type
     * @param info
     * 		contains information about the assertion
     * @param actual
     * 		the given {@code Multimap}
     * @param value
     * 		the given value
     * @throws AssertionError
     * 		if the actual {@code Multimap} is {@code null}
     * @throws AssertionError
     * 		if the actual {@code Multimap} does not contain the given value
     */
    public <K, V> void assertContainsValue(org.assertj.core.api.AssertionInfo info, Multimap<K, V> actual, V value) {
        org.assertj.vavr.internal.Multimaps.assertNotNull(info, actual);
        if (!actual.containsValue(value))
            throw failures.failure(info, org.assertj.core.error.ShouldContainValue.shouldContainValue(actual, value));

    }

    /**
     * Verifies that the actual {@code Multimap} contains the given values.
     *
     * @param <K>
     * 		key type
     * @param <V>
     * 		value type
     * @param info
     * 		contains information about the assertion
     * @param actual
     * 		the given {@code Multimap}
     * @param values
     * 		the given values
     * @throws AssertionError
     * 		if the actual {@code Multimap} is {@code null}
     * @throws AssertionError
     * 		if the actual {@code Multimap} does not contain the given values
     * @throws NullPointerException
     * 		if values vararg is {@code null}
     */
    public <K, V> void assertContainsValues(org.assertj.core.api.AssertionInfo info, Multimap<K, V> actual, @java.lang.SuppressWarnings("unchecked")
    V... values) {
        org.assertj.vavr.internal.Multimaps.assertNotNull(info, actual);
        org.assertj.core.util.Preconditions.checkNotNull(values, "The array of values to look for should not be null");
        if (actual.isEmpty() && (values.length == 0))
            return;

        Set<V> expected = HashSet.of(values);
        Set<V> notFound = expected.filter(org.assertj.vavr.internal.Multimaps.valueNotPresentIn(actual.values()));
        if (org.assertj.vavr.internal.Multimaps.isNotEmpty(notFound))
            throw failures.failure(info, org.assertj.core.error.ShouldContainValues.shouldContainValues(actual, notFound.toJavaSet()));

    }

    /**
     * Verifies that the actual {@code Multimap} does not contain the given value.
     *
     * @param <K>
     * 		key type
     * @param <V>
     * 		value type
     * @param info
     * 		contains information about the assertion
     * @param actual
     * 		the given {@code Multimap}
     * @param value
     * 		the given value
     * @throws AssertionError
     * 		if the actual {@code Multimap} is {@code null}
     * @throws AssertionError
     * 		if the actual {@code Multimap} contains the given value
     */
    public <K, V> void assertDoesNotContainValue(org.assertj.core.api.AssertionInfo info, Multimap<K, V> actual, V value) {
        org.assertj.vavr.internal.Multimaps.assertNotNull(info, actual);
        if (actual.containsValue(value))
            throw failures.failure(info, org.assertj.core.error.ShouldNotContainValue.shouldNotContainValue(actual, value));

    }

    /**
     * Verifies that the actual {@code Multimap} does not contain the given values.
     *
     * @param <K>
     * 		key type
     * @param <V>
     * 		value type
     * @param info
     * 		contains information about the assertion
     * @param actual
     * 		the given {@code Multimap}
     * @param values
     * 		the given values
     * @throws AssertionError
     * 		if the actual {@code Multimap} is {@code null}
     * @throws AssertionError
     * 		if the actual {@code Multimap} contains the given values
     * @throws NullPointerException
     * 		if values vararg is {@code null}
     */
    public <K, V> void assertDoesNotContainValues(org.assertj.core.api.AssertionInfo info, Multimap<K, V> actual, @java.lang.SuppressWarnings("unchecked")
    V... values) {
        org.assertj.vavr.internal.Multimaps.assertNotNull(info, actual);
        org.assertj.core.util.Preconditions.checkNotNull(values, "The array of values to look for should not be null");
        if (actual.isEmpty() && (values.length == 0))
            return;

        Set<V> expected = HashSet.of(values);
        Set<V> found = expected.filter(org.assertj.vavr.internal.Multimaps.valuePresentIn(actual.values()));
        if (org.assertj.vavr.internal.Multimaps.isNotEmpty(found))
            throw failures.failure(info, org.assertj.vavr.api.ShouldNotContainValues.shouldNotContainValues(actual, found.toJavaSet()));

    }

    /**
     * Asserts that the number of entries in the given {@code Multimap} has the same size as the other array.
     *
     * @param info
     * 		contains information about the assertion
     * @param multimap
     * 		the given {@code Multimap}
     * @param other
     * 		the group to compare
     * @throws AssertionError
     * 		if the given {@code Multimap} is {@code null}
     * @throws AssertionError
     * 		if the given array is {@code null}
     * @throws AssertionError
     * 		if the number of entries in the given {@code Multimap} does not have the same size
     */
    public void assertHasSameSizeAs(org.assertj.core.api.AssertionInfo info, Multimap<?, ?> multimap, java.lang.Object other) {
        org.assertj.vavr.internal.Multimaps.assertNotNull(info, multimap);
        org.assertj.core.internal.Arrays.assertIsArray(info, other);
        org.assertj.core.internal.CommonValidations.hasSameSizeAsCheck(info, multimap, other, multimap.size());
    }

    private <K, V> void doCommonContainsCheck(org.assertj.core.api.AssertionInfo info, Multimap<K, V> actual, io.vavr.Tuple2<? extends K, ? extends V>[] entries) {
        org.assertj.vavr.internal.Multimaps.assertNotNull(info, actual);
        org.assertj.vavr.internal.Multimaps.failIfNull(entries);
    }

    private <K, V> void doCommonContainsCheck(org.assertj.core.api.AssertionInfo info, Multimap<K, V> actual, K[] keys) {
        org.assertj.vavr.internal.Multimaps.assertNotNull(info, actual);
        org.assertj.vavr.internal.Multimaps.failIfNull(keys);
    }

    private <K, V> boolean doCommonEmptinessChecks(Multimap<K, V> actual, K[] keys) {
        if (actual.isEmpty() && (keys.length == 0)) {
            return true;
        }
        org.assertj.vavr.internal.Multimaps.failIfEmpty(keys);
        return false;
    }

    private static <K, V> org.assertj.vavr.internal.Multimap<K, V> asLinkedMultimap(io.vavr.Tuple2<? extends K, ? extends V>[] entries) {
        if (entries.length != org.assertj.vavr.internal.Multimaps.nonNullEntries(Array.of(entries)).length()) {
            throw new java.lang.NullPointerException("One of expected entries is null");
        } else {
            return LinkedHashMultimap.withSeq().ofEntries(entries);
        }
    }

    private static <K, V> org.assertj.vavr.internal.Traversable<io.vavr.Tuple2<? extends K, ? extends V>> nonNullEntries(Traversable<io.vavr.Tuple2<? extends K, ? extends V>> entries) {
        return entries.filter(java.util.Objects::nonNull);
    }

    private <K, V> boolean containsEntry(Multimap<K, V> actual, io.vavr.Tuple2<? extends K, ? extends V> entry) {
        org.assertj.core.util.Preconditions.checkNotNull(entry, "Entry to look for should not be null");
        return actual.containsKey(entry._1) && actual.get(entry._1).get().contains(entry._2);
    }

    private static <K> boolean areNotEqual(K actualKey, K expectedKey) {
        return !org.assertj.core.util.Objects.areEqual(actualKey, expectedKey);
    }

    private static <K, V> void failIfNullOrEmpty(io.vavr.Tuple2<? extends K, ? extends V>[] entries) {
        org.assertj.vavr.internal.Multimaps.failIfNull(entries);
        org.assertj.vavr.internal.Multimaps.failIfEmpty(entries);
    }

    private static <K, V> void failIfNull(java.lang.Iterable<io.vavr.Tuple2<K, V>> entries) {
        org.assertj.core.util.Preconditions.checkNotNull(entries, "The entries should not be null");
    }

    private static <K> void failIfNull(K[] keys) {
        org.assertj.core.util.Preconditions.checkNotNull(keys, "The array of keys to look for should not be null");
    }

    private static <K, V> void failIfNull(io.vavr.Tuple2<? extends K, ? extends V>[] entries) {
        org.assertj.core.util.Preconditions.checkNotNull(entries, "The array of entries should not be null");
    }

    private static <K, V> void failIfEmpty(java.lang.Iterable<io.vavr.Tuple2<K, V>> entries) {
        org.assertj.core.util.Preconditions.checkArgument(entries.iterator().hasNext(), "The entries should not be empty");
    }

    private static <K, V> void failIfEmpty(io.vavr.Tuple2<? extends K, ? extends V>[] entries) {
        org.assertj.core.util.Preconditions.checkArgument(entries.length > 0, "The array of entries to look for should not be empty");
    }

    private static <K> void failIfEmpty(K[] keys) {
        org.assertj.core.util.Preconditions.checkArgument(keys.length > 0, "The array of keys to look for should not be empty");
    }

    private static void assertNotNull(org.assertj.core.api.AssertionInfo info, Multimap<?, ?> actual) {
        org.assertj.core.internal.Objects.instance().assertNotNull(info, actual);
    }

    private static <K, V> java.util.function.Predicate<io.vavr.Tuple2<K, V>> entryNotPresentIn(Multimap<K, V> map) {
        return tuple -> !map.contains(tuple);
    }

    private static <K> java.util.function.Predicate<K> keyNotPresentIn(Set<K> elements) {
        return io.vavr.Predicates.not(org.assertj.vavr.internal.Multimaps.keyPresentIn(elements));
    }

    private static <K> java.util.function.Predicate<K> keyPresentIn(Set<K> elements) {
        return elements::contains;
    }

    private static <V> java.util.function.Predicate<V> valueNotPresentIn(Traversable<V> elements) {
        return io.vavr.Predicates.not(org.assertj.vavr.internal.Multimaps.valuePresentIn(elements));
    }

    private static <V> java.util.function.Predicate<V> valuePresentIn(Traversable<V> elements) {
        return elements::contains;
    }

    private static boolean isNotEmpty(Traversable traversable) {
        return !traversable.isEmpty();
    }
}
