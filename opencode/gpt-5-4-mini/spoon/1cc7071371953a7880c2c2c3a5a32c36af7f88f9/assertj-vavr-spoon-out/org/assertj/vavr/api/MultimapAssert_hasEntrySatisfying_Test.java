/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.collection.HashMultimap;
import io.vavr.collection.Multimap;
import org.assertj.core.api.Condition;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.error.ShouldNotBeNull.shouldNotBeNull;
@java.lang.SuppressWarnings("unchecked")
class MultimapAssert_hasEntrySatisfying_Test {
    private org.assertj.core.api.Condition<java.lang.String> passingCondition = new org.assertj.vavr.api.TestCondition<>(true);

    private org.assertj.core.api.Condition<java.lang.String> notPassingCondition = new org.assertj.vavr.api.TestCondition<>();

    @org.junit.jupiter.api.Test
    void should_pass_if_Multimap_contains_entry_satisfying_condition() {
        io.vavr.collection.Multimap<java.lang.String, java.lang.String> actual = io.vavr.collection.HashMultimap.withSeq().of("key1", "value1", "key2", "value2");
        org.assertj.vavr.api.VavrAssertions.assertThat(actual).hasEntrySatisfying("key1", passingCondition);
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_Multimap_is_empty() {
        io.vavr.collection.Multimap<java.lang.String, java.lang.String> actual = io.vavr.collection.HashMultimap.withSeq().empty();
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).hasEntrySatisfying("key1", passingCondition)).isInstanceOf(java.lang.AssertionError.class).hasMessage((("\nExpecting actual:\n" + "  HashMultimap[List]()\n") + "to contain key:\n") + "  \"key1\"");
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_Multimap_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((Multimap<java.lang.String, java.lang.String>) (null))).hasEntrySatisfying("key1", passingCondition)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.error.ShouldNotBeNull.shouldNotBeNull().create());
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_Multimap_does_not_contain_given_key() {
        io.vavr.collection.Multimap<java.lang.String, java.lang.String> actual = io.vavr.collection.HashMultimap.withSeq().of("key1", "value1", "key2", "value2");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).hasEntrySatisfying("key3", passingCondition)).isInstanceOf(java.lang.AssertionError.class).hasMessage((("\nExpecting actual:\n" + "  HashMultimap[List]((key1, value1), (key2, value2))\n") + "to contain key:\n") + "  \"key3\"");
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_condition_is_null() {
        io.vavr.collection.Multimap<java.lang.String, java.lang.String> actual = io.vavr.collection.HashMultimap.withSeq().of("key1", "value1", "key2", "value2");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).hasEntrySatisfying("key1", null)).isInstanceOf(java.lang.NullPointerException.class).hasMessage("The condition to evaluate should not be null");
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_Multimap_does_not_contain_entry_satisfying_condition() {
        io.vavr.collection.Multimap<java.lang.String, java.lang.String> actual = io.vavr.collection.HashMultimap.withSeq().of("key1", "value1", "key3", "value3");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).hasEntrySatisfying("key1", notPassingCondition)).isInstanceOf(java.lang.AssertionError.class).hasMessage("\nExpecting elements:\n  Some(List(value1))\nof\n  HashMultimap[List]((key1, value1), (key3, value3))\nto be TestCondition");
    }
}
