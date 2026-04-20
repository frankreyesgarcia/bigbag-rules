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
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.util.FailureMessages.actualIsNull;
class OptionAssert_hasValueSatisfying_Test {
    @org.junit.jupiter.api.Test
    void should_fail_when_option_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((Option<java.lang.String>) (null))).hasValueSatisfying(s -> {
        })).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.util.FailureMessages.actualIsNull());
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_option_is_empty() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(io.vavr.control.Option.none()).hasValueSatisfying(o -> {
        })).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.vavr.api.OptionShouldBePresent.shouldBePresent().create());
    }

    @org.junit.jupiter.api.Test
    void should_pass_when_consumer_passes() {
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.control.Option.of("something")).hasValueSatisfying(s -> assertThat(s).isEqualTo("something").startsWith("some").endsWith("thing"));
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.control.Option.of(10)).hasValueSatisfying(i -> assertThat(i).isGreaterThan(9));
    }

    @org.junit.jupiter.api.Test
    void should_fail_from_consumer() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(io.vavr.control.Option.of("something else")).hasValueSatisfying(s -> assertThat(s).isEqualTo("something"))).isInstanceOf(java.lang.AssertionError.class).hasMessage("\nexpected: \"something\"\n but was: \"something else\"");
    }
}
