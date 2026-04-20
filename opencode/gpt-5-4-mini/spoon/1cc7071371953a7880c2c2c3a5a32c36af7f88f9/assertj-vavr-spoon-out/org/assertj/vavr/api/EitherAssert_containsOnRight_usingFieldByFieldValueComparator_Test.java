/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.control.Either;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.util.FailureMessages.actualIsNull;
class EitherAssert_containsOnRight_usingFieldByFieldValueComparator_Test {
    @org.junit.jupiter.api.Test
    void should_fail_when_either_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((Either<java.lang.String, org.assertj.vavr.api.Foo>) (null))).usingFieldByFieldValueComparator().containsOnRight(new org.assertj.vavr.api.Foo("something"))).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.util.FailureMessages.actualIsNull());
    }

    @org.junit.jupiter.api.Test
    void should_pass_if_right_sided_either_contains_expected_value() {
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.control.Either.right(new org.assertj.vavr.api.EitherAssert_containsOnRight_usingFieldByFieldValueComparator_Test.Foo("something"))).usingFieldByFieldValueComparator().containsOnRight(new org.assertj.vavr.api.EitherAssert_containsOnRight_usingFieldByFieldValueComparator_Test.Foo("something"));
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_right_sided_either_does_not_contain_expected_value() {
        io.vavr.control.Either<java.lang.String, org.assertj.vavr.api.EitherAssert_containsOnRight_usingFieldByFieldValueComparator_Test.Foo> actual = io.vavr.control.Either.right(new org.assertj.vavr.api.EitherAssert_containsOnRight_usingFieldByFieldValueComparator_Test.Foo("something"));
        org.assertj.vavr.api.EitherAssert_containsOnRight_usingFieldByFieldValueComparator_Test.Foo expectedValue = new org.assertj.vavr.api.EitherAssert_containsOnRight_usingFieldByFieldValueComparator_Test.Foo("something else");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).usingFieldByFieldValueComparator().containsOnRight(expectedValue)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.vavr.api.EitherShouldContain.shouldContainOnRight(actual, expectedValue).create());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_either_is_left_sided() {
        org.assertj.vavr.api.EitherAssert_containsOnRight_usingFieldByFieldValueComparator_Test.Foo expectedValue = new org.assertj.vavr.api.EitherAssert_containsOnRight_usingFieldByFieldValueComparator_Test.Foo("test");
        final io.vavr.control.Either<org.assertj.vavr.api.EitherAssert_containsOnRight_usingFieldByFieldValueComparator_Test.Foo, java.lang.Object> actual = io.vavr.control.Either.left(new org.assertj.vavr.api.EitherAssert_containsOnRight_usingFieldByFieldValueComparator_Test.Foo("something else"));
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).usingFieldByFieldValueComparator().containsOnRight(expectedValue)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.vavr.api.EitherShouldBeRight.shouldBeRight(actual).create());
    }

    private static class Foo {
        private final java.lang.String value;

        Foo(java.lang.String value) {
            this.value = value;
        }

        @java.lang.SuppressWarnings("unused")
        java.lang.String getValue() {
            return value;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return ((("Foo{" + "value='") + value) + '\'') + '}';
        }
    }
}
