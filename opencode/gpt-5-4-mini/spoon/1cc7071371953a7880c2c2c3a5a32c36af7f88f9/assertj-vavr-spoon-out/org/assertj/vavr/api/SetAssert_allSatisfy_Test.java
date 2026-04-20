/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.collection.HashSet;
import io.vavr.collection.Set;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.error.ShouldNotBeNull.shouldNotBeNull;
public class SetAssert_allSatisfy_Test {
    private static final java.util.function.Consumer<java.lang.String> EMPTY_CONSUMER = element -> {
    };

    @org.junit.jupiter.api.Test
    void should_pass_if_Set_is_empty() {
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.collection.HashSet.<java.lang.String>empty()).allSatisfy(org.assertj.vavr.api.SetAssert_allSatisfy_Test.EMPTY_CONSUMER);
    }

    @org.junit.jupiter.api.Test
    void should_pass_if_all_Set_entries_satisfy_consumer() {
        final io.vavr.collection.Set<java.lang.String> actual = io.vavr.collection.HashSet.of("value1", "value2");
        org.assertj.vavr.api.VavrAssertions.assertThat(actual).allSatisfy(element -> {
            assertThat(element).startsWith("value");
        });
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_consumer_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(io.vavr.collection.HashSet.empty()).allSatisfy(null)).isInstanceOf(java.lang.NullPointerException.class).hasMessage("The Consumer<T> expressing the assertions requirements must not be null");
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_Set_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((Set<java.lang.String>) (null))).allSatisfy(EMPTY_CONSUMER)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.error.ShouldNotBeNull.shouldNotBeNull().create());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_all_Set_elements_do_not_satisfy_consumer() {
        final io.vavr.collection.Set<java.lang.String> actual = io.vavr.collection.HashSet.of("value1", "value2");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).allSatisfy(element -> {
            assertThat(element).isEqualTo("value1");
        })).isInstanceOf(java.lang.AssertionError.class).hasMessage(((((((("\n" + "Expecting all elements of:\n") + "  HashSet(value1, value2)\n") + "to satisfy given requirements, but these elements did not:\n") + "\n") + "\"value2\"\n") + "error: \n") + "expected: \"value1\"\n") + " but was: \"value2\"");
    }
}
