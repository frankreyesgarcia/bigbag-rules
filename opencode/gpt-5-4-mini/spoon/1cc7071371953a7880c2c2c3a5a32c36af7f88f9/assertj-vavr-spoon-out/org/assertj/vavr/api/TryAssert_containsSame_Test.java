/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.control.Try;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.util.FailureMessages.actualIsNull;
class TryAssert_containsSame_Test {
    @org.junit.jupiter.api.Test
    void should_fail_when_try_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((Try<java.lang.String>) (null))).containsSame("")).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.util.FailureMessages.actualIsNull());
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_expected_value_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(io.vavr.control.Try.success("some value")).containsSame(null)).isInstanceOf(java.lang.AssertionError.class).hasMessage("\nExpecting:\n  <Success(some value)>\nto contain the instance (i.e. compared with ==):\n  <null>\nbut did not.");
    }

    @org.junit.jupiter.api.Test
    void should_pass_when_null_success_try_checked_on_containing_same_value() {
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.control.Try.success(null)).containsSame(null);
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_success_try_contains_not_the_same_value() {
        final java.lang.String actual = "OK";
        final java.lang.String expected = new java.lang.String(actual);
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(io.vavr.control.Try.success(actual)).containsSame(expected)).isInstanceOf(java.lang.AssertionError.class).hasMessage("\nExpecting:\n  <Success(OK)>\nto contain the instance (i.e. compared with ==):\n  <\"OK\">\nbut did not.");
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_success_try_contains_different_value() {
        final java.lang.String actual = "OK";
        final java.lang.String expected = "different";
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(io.vavr.control.Try.success(actual)).containsSame(expected)).isInstanceOf(java.lang.AssertionError.class).hasMessage("\nExpecting:\n  <Success(OK)>\nto contain the instance (i.e. compared with ==):\n  <\"different\">\nbut did not.");
    }

    @org.junit.jupiter.api.Test
    void should_pass_when_success_try_contains_the_same_value() {
        final java.lang.String value = "OK";
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.control.Try.success(value)).containsSame(value);
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_try_is_a_failure() {
        final java.lang.NullPointerException exception = new java.lang.NullPointerException();
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(io.vavr.control.Try.failure(exception)).containsSame(exception)).isInstanceOf(java.lang.AssertionError.class).hasMessageStartingWith("\nExpecting Try to contain:\n  <java.lang.NullPointerException");
    }
}
