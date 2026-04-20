/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.Lazy;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.util.FailureMessages.actualIsNull;
class LazyAssert_isEvaluated_Test {
    @org.junit.jupiter.api.Test
    void should_pass_when_Lazy_is_evaluated() {
        io.vavr.Lazy<java.lang.Double> lazy = io.vavr.Lazy.of(java.lang.Math::random);
        lazy.get();
        org.assertj.vavr.api.VavrAssertions.assertThat(lazy).isEvaluated();
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_Lazy_is_not_evaluated() {
        io.vavr.Lazy<java.lang.Double> lazy = io.vavr.Lazy.of(java.lang.Math::random);
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(lazy).isEvaluated()).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.vavr.api.LazyShouldBeEvaluated.shouldBeEvaluated().create());
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_Lazy_is_null() {
        io.vavr.Lazy<java.lang.Double> lazy = null;
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(lazy).isEvaluated()).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.util.FailureMessages.actualIsNull());
    }
}
