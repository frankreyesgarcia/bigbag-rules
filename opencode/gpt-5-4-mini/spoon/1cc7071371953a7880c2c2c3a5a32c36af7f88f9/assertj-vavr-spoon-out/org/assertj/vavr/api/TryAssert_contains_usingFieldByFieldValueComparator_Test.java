/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.control.Option;
import io.vavr.control.Try;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.util.FailureMessages.actualIsNull;
class TryAssert_contains_usingFieldByFieldValueComparator_Test {
    @org.junit.jupiter.api.Test
    void should_fail_when_try_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((Option<org.assertj.vavr.api.Foo>) (null))).usingFieldByFieldValueComparator().contains(new org.assertj.vavr.api.Foo("something"))).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.util.FailureMessages.actualIsNull());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_expected_value_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(io.vavr.control.Try.success(new org.assertj.vavr.api.Foo("something"))).usingFieldByFieldValueComparator().contains(null)).isInstanceOf(java.lang.AssertionError.class).hasMessage("\nExpecting:\n  <Success(Foo{value='something'})>\nto contain:\n  <null>\nbut did not.");
    }

    @org.junit.jupiter.api.Test
    void should_pass_if_successful_try_contains_expected_value() {
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.control.Try.success(new org.assertj.vavr.api.TryAssert_contains_usingFieldByFieldValueComparator_Test.Foo("something"))).usingFieldByFieldValueComparator().contains(new org.assertj.vavr.api.TryAssert_contains_usingFieldByFieldValueComparator_Test.Foo("something"));
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_successful_try_does_not_contain_expected_value() {
        io.vavr.control.Try<org.assertj.vavr.api.TryAssert_contains_usingFieldByFieldValueComparator_Test.Foo> actual = io.vavr.control.Try.success(new org.assertj.vavr.api.TryAssert_contains_usingFieldByFieldValueComparator_Test.Foo("something"));
        org.assertj.vavr.api.TryAssert_contains_usingFieldByFieldValueComparator_Test.Foo expectedValue = new org.assertj.vavr.api.TryAssert_contains_usingFieldByFieldValueComparator_Test.Foo("something else");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).usingFieldByFieldValueComparator().contains(expectedValue)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.vavr.api.TryShouldContain.shouldContain(actual, expectedValue).create());
    }

    private static class Foo {
        private final java.lang.String value;

        Foo(java.lang.String value) {
            this.value = value;
        }

        java.lang.String getValue() {
            return value;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return ("Foo{value='" + value) + "'}";
        }
    }
}
