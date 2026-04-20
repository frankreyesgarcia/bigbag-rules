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
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.util.FailureMessages.actualIsNull;
class EitherAssert_hasRightValueSatisfying_Test {
    @org.junit.jupiter.api.Test
    void should_fail_when_either_is_null() {
        io.vavr.control.Either<java.lang.Integer, java.lang.String> actual = null;
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).hasRightValueSatisfying(it -> {
        })).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.util.FailureMessages.actualIsNull());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_either_is_left() {
        io.vavr.control.Either<java.lang.Integer, java.lang.String> actual = io.vavr.control.Either.left(42);
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).hasRightValueSatisfying(it -> {
        })).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.vavr.api.EitherShouldBeRight.shouldBeRight(actual).create());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_consumer_fails() {
        io.vavr.control.Either<java.lang.Integer, java.lang.String> actual = io.vavr.control.Either.right("something");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).hasRightValueSatisfying(it -> assertThat(it).isEqualTo("something else"))).isInstanceOf(java.lang.AssertionError.class).hasMessage(java.lang.String.format("%nexpected: \"something else\"%n but was: \"something\""));
    }

    @org.junit.jupiter.api.Test
    void should_pass_if_consumer_passes() {
        io.vavr.control.Either<java.lang.Integer, java.lang.String> actual = io.vavr.control.Either.right("something");
        org.assertj.vavr.api.VavrAssertions.assertThat(actual).hasRightValueSatisfying(it -> assertThat(it).isEqualTo("something"));
    }
}
