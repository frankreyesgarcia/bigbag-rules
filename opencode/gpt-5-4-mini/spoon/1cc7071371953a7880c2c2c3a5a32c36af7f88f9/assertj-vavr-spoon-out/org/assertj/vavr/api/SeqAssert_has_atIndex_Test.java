/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.collection.List;
import io.vavr.collection.Seq;
import org.assertj.core.api.Condition;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.data.Index.atIndex;
import static org.assertj.core.util.FailureMessages.actualIsNull;
class SeqAssert_has_atIndex_Test {
    private final org.assertj.core.api.Condition<java.lang.String> condition = new org.assertj.core.api.Condition<>(str -> str.startsWith("some"), "starts with some");

    @org.junit.jupiter.api.Test
    void should_pass_if_List_has_at_given_index_value_fulfilling_provided_condition() {
        final java.lang.String value = "something";
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.collection.List.of(value)).has(condition, org.assertj.core.data.Index.atIndex(0));
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_List_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((List<java.lang.String>) (null))).has(condition, atIndex(0))).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.util.FailureMessages.actualIsNull());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_given_index_is_greater_than_list_size() {
        final io.vavr.collection.Seq<java.lang.String> actual = io.vavr.collection.List.of("something");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).has(condition, atIndex(2))).isInstanceOf(java.lang.IndexOutOfBoundsException.class).hasMessage("Index should be between <0> and <0> (inclusive) but was:\n <2>");
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_condition_is_null() {
        final io.vavr.collection.Seq<java.lang.String> actual = io.vavr.collection.List.of("something");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).has(null, atIndex(0))).isInstanceOf(java.lang.NullPointerException.class).hasMessage("The condition to evaluate should not be null");
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_List_has_at_given_index_element_not_matching_given_condition() {
        final io.vavr.collection.Seq<java.lang.String> actual = io.vavr.collection.List.of("a", "b");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).has(condition, atIndex(1))).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.vavr.api.SeqShouldHaveAtIndex.shouldHaveAtIndex(actual, condition, org.assertj.core.data.Index.atIndex(1), "b").create());
    }
}
