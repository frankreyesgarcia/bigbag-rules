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
import org.assertj.core.api.Condition;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.error.ShouldBe.shouldBe;
import static org.assertj.core.util.FailureMessages.actualIsNull;
class OptionAssert_hasValueSatisfying_Condition_Test {
    private org.assertj.core.api.Condition<java.lang.String> passingCondition = new org.assertj.vavr.api.TestCondition<>(true);

    private org.assertj.core.api.Condition<java.lang.String> notPassingCondition = new org.assertj.vavr.api.TestCondition<>();

    @org.junit.jupiter.api.Test
    void should_fail_when_option_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((Option<java.lang.String>) (null))).hasValueSatisfying(passingCondition)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.util.FailureMessages.actualIsNull());
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_option_is_empty() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(io.vavr.control.Option.<java.lang.String>none()).hasValueSatisfying(passingCondition)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.vavr.api.OptionShouldBePresent.shouldBePresent().create());
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_condition_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(io.vavr.control.Option.of("something")).hasValueSatisfying(((Condition<java.lang.String>) (null)))).isInstanceOf(java.lang.NullPointerException.class).hasMessage("The condition to evaluate should not be null");
    }

    @org.junit.jupiter.api.Test
    void should_pass_when_condition_is_met() {
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.control.Option.of("something")).hasValueSatisfying(passingCondition);
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_condition_is_not_met() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(io.vavr.control.Option.of("something")).hasValueSatisfying(notPassingCondition)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.error.ShouldBe.shouldBe("something", notPassingCondition).create());
    }
}
