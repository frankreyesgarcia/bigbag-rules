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
class OptionAssert_contains_Test {
    @org.junit.jupiter.api.Test
    void should_fail_when_option_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((Option<java.lang.String>) (null))).contains("something")).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.util.FailureMessages.actualIsNull());
    }

    @org.junit.jupiter.api.Test
    void should_pass_if_option_contains_expected_value() {
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.control.Option.of("something")).contains("something");
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_option_does_not_contain_expected_value() {
        io.vavr.control.Option<java.lang.String> actual = io.vavr.control.Option.of("not-expected");
        java.lang.String expectedValue = "something";
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).contains(expectedValue)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.vavr.api.OptionShouldContain.shouldContain(actual, expectedValue).create());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_option_is_empty() {
        java.lang.String expectedValue = "something";
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(io.vavr.control.Option.none()).contains(expectedValue)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.vavr.api.OptionShouldContain.shouldContain(expectedValue).create());
    }
}
