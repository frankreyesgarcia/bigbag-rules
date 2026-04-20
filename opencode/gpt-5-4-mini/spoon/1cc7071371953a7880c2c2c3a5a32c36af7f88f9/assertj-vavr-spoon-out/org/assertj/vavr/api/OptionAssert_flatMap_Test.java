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
class OptionAssert_flatMap_Test {
    private static final java.util.function.Function<java.lang.String, io.vavr.control.Option<java.lang.String>> UPPER_CASE_OPTIONAL_STRING = s -> s == null ? io.vavr.control.Option.none() : io.vavr.control.Option.of(s.toUpperCase());

    @org.junit.jupiter.api.Test
    void should_fail_when_option_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((Option<java.lang.String>) (null))).flatMap(UPPER_CASE_OPTIONAL_STRING)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.util.FailureMessages.actualIsNull());
    }

    @org.junit.jupiter.api.Test
    void should_pass_when_option_is_empty() {
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.control.Option.<java.lang.String>none()).flatMap(org.assertj.vavr.api.OptionAssert_flatMap_Test.UPPER_CASE_OPTIONAL_STRING).isEmpty();
    }

    @org.junit.jupiter.api.Test
    void should_pass_when_option_contains_a_value() {
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.control.Option.of("present")).contains("present").flatMap(org.assertj.vavr.api.OptionAssert_flatMap_Test.UPPER_CASE_OPTIONAL_STRING).contains("PRESENT");
    }
}
