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
class TryAssert_isFailure_Test {
    @org.junit.jupiter.api.Test
    void should_fail_when_try_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((Try<java.lang.String>) (null))).isFailure()).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.util.FailureMessages.actualIsNull());
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_try_is_success() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(io.vavr.control.Try.success("OK")).isFailure()).isInstanceOf(java.lang.AssertionError.class).hasMessage("\nExpecting Try to be a Failure, but wasn't");
    }

    @org.junit.jupiter.api.Test
    void should_pass_when_try_is_failure() {
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.control.Try.failure(new java.lang.NullPointerException())).isFailure();
    }
}
