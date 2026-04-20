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
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.util.FailureMessages.actualIsNull;
class OptionAssert_contains_usingValueComparator_Test {
    private static final java.util.Comparator<org.assertj.vavr.api.OptionAssert_contains_usingValueComparator_Test.Foo> FOO_COMPARATOR = java.util.Comparator.comparing(o -> o.getValue().toLowerCase());

    @org.junit.jupiter.api.Test
    void should_fail_when_option_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((Option<org.assertj.vavr.api.Foo>) (null))).usingValueComparator(FOO_COMPARATOR).contains(new org.assertj.vavr.api.Foo("something"))).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.util.FailureMessages.actualIsNull());
    }

    @org.junit.jupiter.api.Test
    void should_pass_if_option_contains_expected_value() {
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.control.Option.of(new org.assertj.vavr.api.OptionAssert_contains_usingValueComparator_Test.Foo("something"))).usingValueComparator(org.assertj.vavr.api.OptionAssert_contains_usingValueComparator_Test.FOO_COMPARATOR).contains(new org.assertj.vavr.api.OptionAssert_contains_usingValueComparator_Test.Foo("SoMething"));
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_option_does_not_contain_expected_value() {
        io.vavr.control.Option<org.assertj.vavr.api.OptionAssert_contains_usingValueComparator_Test.Foo> actual = io.vavr.control.Option.of(new org.assertj.vavr.api.OptionAssert_contains_usingValueComparator_Test.Foo("something"));
        org.assertj.vavr.api.OptionAssert_contains_usingValueComparator_Test.Foo expectedValue = new org.assertj.vavr.api.OptionAssert_contains_usingValueComparator_Test.Foo("something else");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).usingValueComparator(FOO_COMPARATOR).contains(expectedValue)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.vavr.api.OptionShouldContain.shouldContain(actual, expectedValue).create());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_option_is_empty() {
        org.assertj.vavr.api.OptionAssert_contains_usingValueComparator_Test.Foo expectedValue = new org.assertj.vavr.api.OptionAssert_contains_usingValueComparator_Test.Foo("test");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(io.vavr.control.Option.<org.assertj.vavr.api.Foo>none()).usingValueComparator(FOO_COMPARATOR).contains(expectedValue)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.vavr.api.OptionShouldContain.shouldContain(expectedValue).create());
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
