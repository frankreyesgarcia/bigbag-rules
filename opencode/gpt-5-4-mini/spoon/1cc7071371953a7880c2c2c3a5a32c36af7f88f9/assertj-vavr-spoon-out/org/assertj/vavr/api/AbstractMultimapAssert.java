/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.collection.Multimap;
import org.assertj.core.api.Condition;
import org.assertj.core.api.EnumerableAssert;
import org.assertj.core.internal.ComparatorBasedComparisonStrategy;
import org.assertj.core.internal.ComparisonStrategy;
import org.assertj.core.internal.StandardComparisonStrategy;
import static org.assertj.core.error.ShouldBeEmpty.shouldBeEmpty;
import static org.assertj.core.error.ShouldBeNullOrEmpty.shouldBeNullOrEmpty;
import static org.assertj.core.error.ShouldHaveSameSizeAs.shouldHaveSameSizeAs;
import static org.assertj.core.error.ShouldHaveSize.shouldHaveSize;
import static org.assertj.core.error.ShouldHaveSizeBetween.shouldHaveSizeBetween;
import static org.assertj.core.error.ShouldHaveSizeGreaterThan.shouldHaveSizeGreaterThan;
import static org.assertj.core.error.ShouldHaveSizeGreaterThanOrEqualTo.shouldHaveSizeGreaterThanOrEqualTo;
import static org.assertj.core.error.ShouldHaveSizeLessThan.shouldHaveSizeLessThan;
import static org.assertj.core.error.ShouldHaveSizeLessThanOrEqualTo.shouldHaveSizeLessThanOrEqualTo;
import static org.assertj.core.error.ShouldNotBeEmpty.shouldNotBeEmpty;
import static org.assertj.core.util.Arrays.array;
import static org.assertj.core.util.IterableUtil.sizeOf;
import static org.assertj.core.util.Preconditions.checkNotNull;
abstract class AbstractMultimapAssert<SELF extends org.assertj.vavr.api.AbstractMultimapAssert<SELF, ACTUAL, KEY, VALUE>, ACTUAL extends io.vavr.collection.Multimap<KEY, VALUE>, KEY, VALUE> extends org.assertj.vavr.api.AbstractValueAssert<SELF, ACTUAL> implements org.assertj.core.api.EnumerableAssert<SELF, io.vavr.Tuple2<? extends KEY, ? extends VALUE>> {
    private final org.assertj.vavr.internal.Multimaps multimaps = org.assertj.vavr.internal.Multimaps.instance();

    private org.assertj.core.internal.ComparisonStrategy elementComparisonStrategy;

    AbstractMultimapAssert(ACTUAL actual, java.lang.Class<?> selfType) {
        super(actual, selfType);
        this.elementComparisonStrategy = org.assertj.core.internal.StandardComparisonStrategy.instance();
    }

    /**
     * Verifies that the actual multimap contains the given entries, in any order.
     * <p>This assertion succeeds if both actual multimap and given entries are empty.</p>
     *
     * @param entries
     * 		the given entries.
     * @return {@code this} assertion object.
     * @throws NullPointerException
     * 		if the given argument is {@code null}.
     * @throws NullPointerException
     * 		if any of the entries in the given array is {@code null}.
     * @throws AssertionError
     * 		if the actual multimap is not empty and the given argument is an empty array.
     * @throws AssertionError
     * 		if the actual multimap is {@code null}.
     * @throws AssertionError
     * 		if the actual multimap does not contain the given entries.
     */
    public SELF contains(@java.lang.SuppressWarnings("unchecked")
    io.vavr.Tuple2<KEY, VALUE>... entries) {
        multimaps.assertContains(info, actual, entries);
        return myself;
    }

    /**
     * Verifies that the actual multimap contains at least one of the given entries.
     *
     * @param entries
     * 		the given entries.
     * @return {@code this} assertion object.
     * @throws NullPointerException
     * 		if the given argument is {@code null}.
     * @throws NullPointerException
     * 		if any of the entries in the given array is {@code null}.
     * @throws AssertionError
     * 		if the actual multimap is not empty and the given argument is an empty array.
     * @throws AssertionError
     * 		if the actual multimap is {@code null}.
     * @throws AssertionError
     * 		if the actual multimap does not contain any of the given entries.
     */
    public SELF containsAnyOf(@java.lang.SuppressWarnings("unchecked")
    io.vavr.Tuple2<KEY, VALUE>... entries) {
        multimaps.assertContainsAnyOf(info, actual, entries);
        return myself;
    }

    /**
     * Verifies that the actual multimap contains all entries of the given iterable, in any order.
     *
     * @param other
     * 		the iterable with the given entries.
     * @return {@code this} assertion object.
     * @throws NullPointerException
     * 		if the given argument is {@code null}.
     * @throws NullPointerException
     * 		if any of the entries in the given iterable is {@code null}.
     * @throws AssertionError
     * 		if the actual multimap is not empty and the given argument is an empty iterable.
     * @throws AssertionError
     * 		if the actual multimap is {@code null}.
     * @throws AssertionError
     * 		if the actual multimap does not contain the given entries.
     */
    @java.lang.SuppressWarnings("unchecked")
    public SELF containsAllEntriesOf(java.lang.Iterable<io.vavr.Tuple2<KEY, VALUE>> other) {
        final io.vavr.Tuple2<KEY, VALUE>[] entries = java.util.stream.StreamSupport.stream(other.spliterator(), false).toArray(io.vavr.Tuple2[]::new);
        multimaps.assertContains(info, actual, entries);
        return myself;
    }

    public SELF containsOnly(java.lang.Iterable<io.vavr.Tuple2<KEY, VALUE>> entries) {
        org.assertj.vavr.api.AbstractMultimapAssert.isNotNull();
        multimaps.assertContainsOnly(info, actual, entries);
        return myself;
    }

    /**
     * Verifies that the actual multimap contains only the given entries and nothing else, <b>in order</b>.<br>
     * This assertion should only be used with maps that have a consistent iteration order (i.e. don't use it with
     * {@link io.vavr.collection.HashMultimap}, prefer {@link #containsOnly} methods in that case).
     *
     * @param entries
     * 		the given entries.
     * @return {@code this} assertions object.
     * @throws NullPointerException
     * 		if the given entries array is {@code null}.
     * @throws AssertionError
     * 		if the actual multimap is {@code null}.
     * @throws IllegalArgumentException
     * 		if the given entries array is empty.
     * @throws AssertionError
     * 		if the actual multimap does not contain the given entries with same order, i.e. the actual multimap
     * 		contains some or none of the given entries, or the actual multimap contains more entries than the given ones
     * 		or entries are the same but the order is not.
     */
    public SELF containsExactly(@java.lang.SuppressWarnings("unchecked")
    io.vavr.Tuple2<? extends KEY, ? extends VALUE>... entries) {
        multimaps.assertContainsExactly(info, actual, entries);
        return myself;
    }

    /**
     * Verifies that all the actual multimap entries satisfy the given {@code entryRequirements}.
     * If the actual multimap is empty, this assertion succeeds as there is nothing to check.
     *
     * @param entryRequirements
     * 		the given requirements that each entry must satisfy.
     * @return {@code this} assertion object.
     * @throws NullPointerException
     * 		if the given entryRequirements {@link BiConsumer} is {@code null}.
     * @throws AssertionError
     * 		if the actual multimap is {@code null}.
     * @throws AssertionError
     * 		if one or more entries don't satisfy the given requirements.
     */
    public SELF allSatisfy(java.util.function.BiConsumer<? super KEY, ? super VALUE> entryRequirements) {
        org.assertj.vavr.api.AbstractMultimapAssert.checkNotNull(entryRequirements, "The BiConsumer<K, V> expressing the assertions requirements must not be null");
        org.assertj.vavr.api.AbstractMultimapAssert.isNotNull();
        actual.forEach(entry -> entryRequirements.accept(entry._1, entry._2));
        return myself;
    }

    /**
     * Verifies that the actual multimap contains a value for the given {@code key} that satisfies the given {@code valueCondition}.
     *
     * @param key
     * 		the given key to check.
     * @param valueCondition
     * 		the given condition for check value.
     * @return {@code this} assertion object.
     * @throws NullPointerException
     * 		if the given values is {@code null}.
     * @throws AssertionError
     * 		if the actual multimap is {@code null}.
     * @throws AssertionError
     * 		if the actual multimap does not contain the given {@code key}.
     * @throws AssertionError
     * 		if the actual multimap contains the given key, but value does not match the given {@code valueCondition}.
     */
    public SELF hasEntrySatisfying(KEY key, org.assertj.core.api.Condition<? super VALUE> valueCondition) {
        multimaps.assertHasEntrySatisfying(info, actual, key, valueCondition);
        return myself;
    }

    /**
     * Verifies that the actual multimap contains the given entry.
     *
     * @param key
     * 		the given key to check.
     * @param value
     * 		the given value to check.
     * @return {@code this} assertion object.
     * @throws AssertionError
     * 		if the actual multimap is {@code null}.
     * @throws AssertionError
     * 		if the actual multimap does not contain the given entries.
     */
    public SELF containsEntry(KEY key, VALUE value) {
        multimaps.assertContains(info, actual, org.assertj.core.util.Arrays.array(io.vavr.Tuple.of(key, value)));
        return myself;
    }

    /**
     * Verifies that the actual multimap does not contain the given entries.
     *
     * @param entries
     * 		the given entries.
     * @return {@code this} assertion object.
     * @throws NullPointerException
     * 		if the given argument is {@code null}.
     * @throws IllegalArgumentException
     * 		if the given argument is an empty array.
     * @throws AssertionError
     * 		if the actual multimap is {@code null}.
     * @throws AssertionError
     * 		if the actual multimap contains any of the given entries.
     */
    public SELF doesNotContain(io.vavr.Tuple2<KEY, VALUE>... entries) {
        multimaps.assertDoesNotContain(info, actual, entries);
        return myself;
    }

    /**
     * Verifies that the actual multimap does not contain the given entry.
     *
     * @param key
     * 		key of the entry.
     * @param value
     * 		value of the entry.
     * @return {@code this} assertion object.
     * @throws NullPointerException
     * 		if the given argument is {@code null}.
     * @throws IllegalArgumentException
     * 		if the given argument is an empty array.
     * @throws AssertionError
     * 		if the actual multimap is {@code null}.
     * @throws AssertionError
     * 		if the actual multimap contains any of the given entries.
     */
    public SELF doesNotContainEntry(KEY key, VALUE value) {
        multimaps.assertDoesNotContain(info, actual, org.assertj.core.util.Arrays.array(io.vavr.Tuple.of(key, value)));
        return myself;
    }

    /**
     * Verifies that the actual multimap contains the given key.
     *
     * @param key
     * 		the given key.
     * @return {@code this} assertions object.
     * @throws AssertionError
     * 		if the actual multimap is {@code null}.
     * @throws AssertionError
     * 		if the actual multimap does not contain the given key.
     */
    @java.lang.SuppressWarnings("unchecked")
    public SELF containsKey(KEY key) {
        return containsKeys(key);
    }

    /**
     * Verifies that the actual multimap contains the given keys.
     *
     * @param keys
     * 		the given keys.
     * @return {@code this} assertions object.
     * @throws AssertionError
     * 		if the actual multimap is {@code null}.
     * @throws AssertionError
     * 		if the actual multimap does not contain the given key.
     * @throws IllegalArgumentException
     * 		if the given argument is an empty array.
     * @throws NullPointerException
     * 		if the array of keys is {@code null}.
     */
    public SELF containsKeys(@java.lang.SuppressWarnings("unchecked")
    KEY... keys) {
        multimaps.assertContainsKeys(info, actual, keys);
        return myself;
    }

    /**
     * Verifies that the actual multimap contains only the given keys and nothing else, in any order.
     *
     * @param keys
     * 		the given keys that should be in the actual multimap.
     * @return {@code this} assertions object.
     * @throws AssertionError
     * 		if the actual multimap is {@code null}.
     * @throws AssertionError
     * 		if the actual multimap does not contain the given keys, i.e. the actual multimap contains some or none
     * 		of the given keys, or the actual multimap contains more entries than the given ones.
     * @throws NullPointerException
     * 		if the array of keys is {@code null}.
     * @throws IllegalArgumentException
     * 		if the given argument is an empty array.
     */
    public SELF containsOnlyKeys(KEY... keys) {
        multimaps.assertContainsOnlyKeys(info, actual, keys);
        return myself;
    }

    /**
     * Verifies that the actual multimap does not contain the given key.
     *
     * @param key
     * 		the given key.
     * @return {@code this} assertions object.
     * @throws AssertionError
     * 		if the actual multimap is {@code null}.
     * @throws AssertionError
     * 		if the actual multimap contains the given key.
     */
    @java.lang.SuppressWarnings("unchecked")
    public SELF doesNotContainKey(KEY key) {
        return doesNotContainKeys(key);
    }

    /**
     * Verifies that the actual multimap does not contain the given keys.
     *
     * @param keys
     * 		the given keys.
     * @return {@code this} assertions object.
     * @throws AssertionError
     * 		if the actual multimap is {@code null}.
     * @throws AssertionError
     * 		if the actual multimap contains the given key.
     * @throws IllegalArgumentException
     * 		if the given argument is an empty array.
     * @throws NullPointerException
     * 		if the array of keys is {@code null}.
     */
    public SELF doesNotContainKeys(@java.lang.SuppressWarnings("unchecked")
    KEY... keys) {
        multimaps.assertDoesNotContainKeys(info, actual, keys);
        return myself;
    }

    /**
     * Verifies that the actual multimap contains the given value.
     *
     * @param value
     * 		the value to look for.
     * @return {@code this} assertions object.
     * @throws AssertionError
     * 		if the actual multimap is {@code null}.
     * @throws AssertionError
     * 		if the actual multimap does not contain the given value.
     */
    public SELF containsValue(VALUE value) {
        multimaps.assertContainsValue(info, actual, value);
        return myself;
    }

    /**
     * Verifies that the actual multimap contains the given values.
     *
     * @param values
     * 		the values to look for in the actual map.
     * @return {@code this} assertions object.
     * @throws AssertionError
     * 		if the actual multimap is {@code null}.
     * @throws AssertionError
     * 		if the actual multimap does not contain the given values.
     */
    public SELF containsValues(@java.lang.SuppressWarnings("unchecked")
    VALUE... values) {
        multimaps.assertContainsValues(info, actual, values);
        return myself;
    }

    /**
     * Verifies that the actual multimap does not contain the given value.
     *
     * @param value
     * 		the value to look for.
     * @return {@code this} assertions object.
     * @throws AssertionError
     * 		if the actual multimap is {@code null}.
     * @throws AssertionError
     * 		if the actual multimap contains the given value.
     */
    public SELF doesNotContainValue(VALUE value) {
        multimaps.assertDoesNotContainValue(info, actual, value);
        return myself;
    }

    /**
     * Verifies that the actual multimap does not contain the given values.
     *
     * @param values
     * 		the values to look for in the actual map.
     * @return {@code this} assertions object.
     * @throws AssertionError
     * 		if the actual multimap is {@code null}.
     * @throws AssertionError
     * 		if the actual multimap contains the given values.
     */
    public SELF doesNotContainValues(@java.lang.SuppressWarnings("unchecked")
    VALUE... values) {
        multimaps.assertDoesNotContainValues(info, actual, values);
        return myself;
    }

    @java.lang.Override
    public void isNullOrEmpty() {
        if ((actual != null) && (!actual.isEmpty()))
            throwAssertionError(org.assertj.core.error.ShouldBeNullOrEmpty.shouldBeNullOrEmpty(actual));

    }

    @java.lang.Override
    public void isEmpty() {
        org.assertj.vavr.api.AbstractMultimapAssert.isNotNull();
        if (!actual.isEmpty())
            throwAssertionError(org.assertj.core.error.ShouldBeEmpty.shouldBeEmpty(actual));

    }

    @java.lang.Override
    public SELF isNotEmpty() {
        org.assertj.vavr.api.AbstractMultimapAssert.isNotNull();
        if (actual.isEmpty())
            throwAssertionError(org.assertj.vavr.api.AbstractMultimapAssert.shouldNotBeEmpty());

        return myself;
    }

    @java.lang.Override
    public SELF hasSize(int expectedSize) {
        org.assertj.vavr.api.AbstractMultimapAssert.isNotNull();
        if (actual.size() != expectedSize)
            throwAssertionError(org.assertj.core.error.ShouldHaveSize.shouldHaveSize(actual, actual.size(), expectedSize));

        return myself;
    }

    @java.lang.Override
    public SELF hasSizeGreaterThan(int boundary) {
        org.assertj.vavr.api.AbstractMultimapAssert.isNotNull();
        if (actual.size() <= boundary)
            throwAssertionError(org.assertj.core.error.ShouldHaveSizeGreaterThan.shouldHaveSizeGreaterThan(actual, actual.size(), boundary));

        return myself;
    }

    @java.lang.Override
    public SELF hasSizeGreaterThanOrEqualTo(int boundary) {
        org.assertj.vavr.api.AbstractMultimapAssert.isNotNull();
        if (actual.size() < boundary)
            throwAssertionError(org.assertj.core.error.ShouldHaveSizeGreaterThanOrEqualTo.shouldHaveSizeGreaterThanOrEqualTo(actual, actual.size(), boundary));

        return myself;
    }

    @java.lang.Override
    public SELF hasSizeLessThan(int boundary) {
        org.assertj.vavr.api.AbstractMultimapAssert.isNotNull();
        if (actual.size() >= boundary)
            throwAssertionError(org.assertj.core.error.ShouldHaveSizeLessThan.shouldHaveSizeLessThan(actual, actual.size(), boundary));

        return myself;
    }

    @java.lang.Override
    public SELF hasSizeLessThanOrEqualTo(int boundary) {
        org.assertj.vavr.api.AbstractMultimapAssert.isNotNull();
        if (actual.size() > boundary)
            throwAssertionError(org.assertj.core.error.ShouldHaveSizeLessThanOrEqualTo.shouldHaveSizeLessThanOrEqualTo(actual, actual.size(), boundary));

        return myself;
    }

    @java.lang.Override
    public SELF hasSizeBetween(int lowerBoundary, int higherBoundary) {
        org.assertj.vavr.api.AbstractMultimapAssert.isNotNull();
        if ((actual.size() > higherBoundary) || (actual.size() < lowerBoundary)) {
            throwAssertionError(org.assertj.core.error.ShouldHaveSizeBetween.shouldHaveSizeBetween(actual, actual.size(), lowerBoundary, higherBoundary));
        }
        return myself;
    }

    @java.lang.Override
    public SELF hasSameSizeAs(java.lang.Iterable<?> other) {
        org.assertj.vavr.api.AbstractMultimapAssert.isNotNull();
        org.assertj.vavr.api.AbstractMultimapAssert.checkNotNull(other, "The other Iterable to compare actual size with should not be null");
        final long expectedSize = org.assertj.vavr.api.AbstractMultimapAssert.sizeOf(other);
        if (actual.size() != expectedSize)
            throwAssertionError(org.assertj.core.error.ShouldHaveSameSizeAs.shouldHaveSameSizeAs(actual, other, actual.size(), expectedSize));

        return myself;
    }

    @java.lang.Override
    public SELF hasSameSizeAs(java.lang.Object array) {
        multimaps.assertHasSameSizeAs(info, actual, array);
        return myself;
    }

    @java.lang.Override
    public SELF usingElementComparator(java.util.Comparator<? super io.vavr.Tuple2<? extends KEY, ? extends VALUE>> customComparator) {
        elementComparisonStrategy = new org.assertj.core.internal.ComparatorBasedComparisonStrategy(customComparator);
        return myself;
    }

    @java.lang.Override
    public SELF usingDefaultElementComparator() {
        elementComparisonStrategy = org.assertj.core.internal.StandardComparisonStrategy.instance();
        return myself;
    }
}
