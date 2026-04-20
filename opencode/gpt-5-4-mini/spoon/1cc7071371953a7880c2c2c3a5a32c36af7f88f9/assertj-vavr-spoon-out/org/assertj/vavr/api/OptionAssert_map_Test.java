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
import static io.vavr.API.Some;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.util.FailureMessages.actualIsNull;
class OptionAssert_map_Test {
    @org.junit.jupiter.api.Test
    void should_fail_when_Option_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((Option<java.lang.String>) (null))).map(java.lang.String::length)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.util.FailureMessages.actualIsNull());
    }

    @org.junit.jupiter.api.Test
    void should_pass_when_Option_is_empty() {
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.control.Option.<java.lang.String>none()).map(java.lang.String::length).isEmpty();
    }

    @org.junit.jupiter.api.Test
    void should_pass_when_Option_contains_a_value() {
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.control.Option.of("42")).map(java.lang.String::length).contains(2);
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.control.Option.of("42")).map(s -> null).isEqualTo(io.vavr.API.Some(null));
    }
}
