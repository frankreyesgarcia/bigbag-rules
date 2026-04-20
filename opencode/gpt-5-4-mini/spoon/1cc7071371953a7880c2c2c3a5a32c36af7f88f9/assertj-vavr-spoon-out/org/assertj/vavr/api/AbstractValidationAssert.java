/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.control.Validation;
import org.assertj.core.api.Assertions;
import org.assertj.core.internal.ComparatorBasedComparisonStrategy;
import org.assertj.core.internal.ComparisonStrategy;
import org.assertj.core.internal.FieldByFieldComparator;
import org.assertj.core.internal.StandardComparisonStrategy;
import org.assertj.core.util.CheckReturnValue;
import static org.assertj.core.util.Preconditions.checkArgument;
/**
 * Assertions for {@link Validation}.
 *
 * @param <SELF>
 * 		the "self" type of this assertion class.
 * @param <INVALID>
 * 		type of the value in the case of the invalid {@link Validation}.
 * @param <VALID>
 * 		type of the value in the case of the valid {@link Validation}.
 * @author Michał Chmielarz
 */
abstract class AbstractValidationAssert<SELF extends org.assertj.vavr.api.AbstractValidationAssert<SELF, INVALID, VALID>, INVALID, VALID> extends org.assertj.vavr.api.AbstractValueAssert<SELF, io.vavr.control.Validation<INVALID, VALID>> {
    private org.assertj.core.internal.ComparisonStrategy validationValueComparisonStrategy;

    AbstractValidationAssert(io.vavr.control.Validation<INVALID, VALID> actual, java.lang.Class<?> selfType) {
        super(actual, selfType);
        this.validationValueComparisonStrategy = org.assertj.core.internal.StandardComparisonStrategy.instance();
    }

    /**
     * Verifies that the actual {@link Validation} is invalid.
     *
     * @return this assertion object.
     */
    public SELF isInvalid() {
        assertIsInvalid();
        return myself;
    }

    /**
     * Verifies that the actual {@link Validation} is valid.
     *
     * @return this assertion object.
     */
    public SELF isValid() {
        assertIsValid();
        return myself;
    }

    /**
     * Verifies that the actual {@link Validation} is {@link Validation.Valid}
     * and contains the given value.
     *
     * @param expectedValue
     * 		the expected value inside the {@link Validation}.
     * @return this assertion object.
     */
    public SELF containsValid(VALID expectedValue) {
        assertIsValid();
        if (!validationValueComparisonStrategy.areEqual(actual.get(), expectedValue))
            throwAssertionError(org.assertj.vavr.api.ValidationShouldContain.shouldContainValid(actual, expectedValue));

        return myself;
    }

    /**
     * Verifies that the actual {@link Validation} is {@link Validation.Invalid}
     * and contains the given error value.
     *
     * @param expectedErrorValue
     * 		the expected error value inside the {@link Validation}.
     * @return this assertion object.
     */
    public SELF containsInvalid(INVALID expectedErrorValue) {
        assertIsInvalid();
        checkNotNull(expectedErrorValue);
        if (!validationValueComparisonStrategy.areEqual(actual.getError(), expectedErrorValue))
            throwAssertionError(org.assertj.vavr.api.ValidationShouldContain.shouldContainInvalid(actual, expectedErrorValue));

        return myself;
    }

    /**
     * Verifies that the actual valid {@link Validation} contains the instance given as an argument.
     *
     * @param expectedValue
     * 		the expected value inside the {@link Validation}.
     * @return this assertion object.
     */
    public SELF containsValidSame(VALID expectedValue) {
        assertIsValid();
        if (actual.get() != expectedValue)
            throwAssertionError(org.assertj.vavr.api.ValidationShouldContain.shouldContainValidSame(actual, expectedValue));

        return myself;
    }

    /**
     * Verifies that the actual invalid {@link Validation} contains the instance given as an argument.
     *
     * @param expectedErrorValue
     * 		the expected value inside the {@link Validation}.
     * @return this assertion object.
     */
    public SELF containsInvalidSame(VALID expectedErrorValue) {
        assertIsInvalid();
        checkNotNull(expectedErrorValue);
        if (actual.getError() != expectedErrorValue)
            throwAssertionError(org.assertj.vavr.api.ValidationShouldContain.shouldContainInvalidSame(actual, expectedErrorValue));

        return myself;
    }

    /**
     * Verifies that the actual valid {@link Validation} contains a value that is an instance of the argument.
     *
     * @param clazz
     * 		the expected class of the value inside the valid {@link Validation}.
     * @return this assertion object.
     */
    public SELF containsValidInstanceOf(java.lang.Class<?> clazz) {
        assertIsValid();
        if (!clazz.isInstance(actual.get()))
            throwAssertionError(org.assertj.vavr.api.ValidationShouldContainInstanceOf.shouldContainValidInstanceOf(actual, clazz));

        return myself;
    }

    /**
     * Verifies that the actual invalid {@link Validation} contains a value that is an instance of the argument.
     *
     * @param clazz
     * 		the expected class of the value inside the invalid {@link Validation}.
     * @return this assertion object.
     */
    public SELF containsInvalidInstanceOf(java.lang.Class<?> clazz) {
        assertIsInvalid();
        if (!clazz.isInstance(actual.getError()))
            throwAssertionError(org.assertj.vavr.api.ValidationShouldContainInstanceOf.shouldContainInvalidInstanceOf(actual, clazz));

        return myself;
    }

    /**
     * Use given custom comparator instead of relying on actual type A <code>equals</code> method to compare the
     * {@link Validation} value's object for incoming assertion checks.
     *
     * @param customComparator
     * 		the comparator to use for incoming assertion checks.
     * @return {@code this} assertion object.
     * @throws NullPointerException
     * 		if the given comparator is {@code null}.
     */
    @org.assertj.core.util.CheckReturnValue
    public SELF usingValueComparator(java.util.Comparator<?> customComparator) {
        validationValueComparisonStrategy = new org.assertj.core.internal.ComparatorBasedComparisonStrategy(customComparator);
        return myself;
    }

    /**
     * Use field/property by field/property comparison (including inherited fields/properties) instead of relying on
     * actual type A <code>equals</code> method to compare the {@link Validation} value's object for incoming assertion
     * checks. Private fields are included but this can be disabled using
     * {@link Assertions#setAllowExtractingPrivateFields(boolean)}.
     *
     * @return {@code this} assertion object.
     */
    @org.assertj.core.util.CheckReturnValue
    public SELF usingFieldByFieldValueComparator() {
        return usingValueComparator(new org.assertj.core.internal.FieldByFieldComparator());
    }

    /**
     * Revert to standard comparison for incoming assertion {@link Validation} value checks.
     * <p>
     * This method should be used to disable a custom comparison strategy set by calling
     * {@link #usingValueComparator(Comparator)}.
     *
     * @return {@code this} assertion object.
     */
    @org.assertj.core.util.CheckReturnValue
    public SELF usingDefaultRightValueComparator() {
        // fall back to default strategy to compare actual with other objects.
        validationValueComparisonStrategy = org.assertj.core.internal.StandardComparisonStrategy.instance();
        return myself;
    }

    private void assertIsInvalid() {
        org.assertj.vavr.api.AbstractValidationAssert.isNotNull();
        if (actual.isValid())
            throwAssertionError(org.assertj.vavr.api.ValidationShouldBeInvalid.shouldBeInvalid(actual));

    }

    private void assertIsValid() {
        org.assertj.vavr.api.AbstractValidationAssert.isNotNull();
        if (actual.isInvalid())
            throwAssertionError(org.assertj.vavr.api.ValidationShouldBeValid.shouldBeValid(actual));

    }

    private void checkNotNull(java.lang.Object expectedValue) {
        org.assertj.vavr.api.AbstractValidationAssert.checkArgument(expectedValue != null, "The expected value should not be <null>.");
    }
}
