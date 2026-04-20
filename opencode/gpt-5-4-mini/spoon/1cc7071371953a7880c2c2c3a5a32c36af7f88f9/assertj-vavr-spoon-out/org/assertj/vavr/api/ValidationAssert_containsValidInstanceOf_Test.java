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
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.util.FailureMessages.actualIsNull;
class ValidationAssert_containsValidInstanceOf_Test {
    @org.junit.jupiter.api.Test
    void should_fail_if_validation_is_null() {
        io.vavr.control.Validation<java.lang.Object, java.lang.Object> actual = null;
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsValidInstanceOf(java.lang.Object.class)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.util.FailureMessages.actualIsNull());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_validation_is_invalid() {
        io.vavr.control.Validation<java.lang.String, java.lang.Object> actual = io.vavr.control.Validation.invalid("some");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsValidInstanceOf(java.lang.Object.class)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.vavr.api.ValidationShouldBeValid.shouldBeValid(actual).create());
    }

    @org.junit.jupiter.api.Test
    void should_pass_if_validation_contains_valid_value_of_required_type() {
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.control.Validation.valid("something")).containsValidInstanceOf(java.lang.String.class).containsValidInstanceOf(java.lang.Object.class);
    }

    @org.junit.jupiter.api.Test
    void should_pass_if_validation_contains_required_type_subclass() {
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.control.Validation.valid(new org.assertj.vavr.api.ValidationAssert_containsValidInstanceOf_Test.SubClass())).containsValidInstanceOf(org.assertj.vavr.api.ValidationAssert_containsValidInstanceOf_Test.ParentClass.class);
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_validation_contains_other_type_than_required() {
        io.vavr.control.Validation<java.lang.Object, org.assertj.vavr.api.ValidationAssert_containsValidInstanceOf_Test.ParentClass> actual = io.vavr.control.Validation.valid(new org.assertj.vavr.api.ValidationAssert_containsValidInstanceOf_Test.ParentClass());
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsValidInstanceOf(org.assertj.vavr.api.OtherClass.class)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.vavr.api.ValidationShouldContainInstanceOf.shouldContainValidInstanceOf(actual, org.assertj.vavr.api.ValidationAssert_containsValidInstanceOf_Test.OtherClass.class).create());
    }

    private static class ParentClass {}

    private static class SubClass extends org.assertj.vavr.api.ValidationAssert_containsValidInstanceOf_Test.ParentClass {}

    private static class OtherClass {}
}
