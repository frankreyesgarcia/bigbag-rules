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
class EitherAssert_containsRight_Test {
    @org.junit.jupiter.api.Test
    void should_fail_when_either_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((Either<java.lang.String, java.lang.String>) (null))).containsOnRight("something")).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.util.FailureMessages.actualIsNull());
    }

    @org.junit.jupiter.api.Test
    void should_pass_if_either_contains_expected_value_on_right_side() {
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.control.Either.right("something")).containsOnRight("something");
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_either_does_not_contain_expected_value_on_right_side() {
        io.vavr.control.Either<java.lang.String, java.lang.String> actual = io.vavr.control.Either.right("something");
        java.lang.String expectedValue = "nothing";
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsOnRight(expectedValue)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.vavr.api.EitherShouldContain.shouldContainOnRight(actual, expectedValue).create());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_either_is_left() {
        io.vavr.control.Either<java.lang.String, java.lang.String> actual = io.vavr.control.Either.left("nothing");
        java.lang.String expectedValue = "something";
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsOnRight(expectedValue)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.vavr.api.EitherShouldBeRight.shouldBeRight(actual).create());
    }
}
