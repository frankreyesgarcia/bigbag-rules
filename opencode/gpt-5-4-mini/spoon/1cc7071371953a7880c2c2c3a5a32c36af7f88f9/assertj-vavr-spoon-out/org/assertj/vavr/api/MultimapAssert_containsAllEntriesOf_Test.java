/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.collection.*;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.error.ShouldNotBeNull.shouldNotBeNull;
@java.lang.SuppressWarnings("unchecked")
class MultimapAssert_containsAllEntriesOf_Test {
    private static final io.vavr.Tuple2<java.lang.String, java.lang.String> ENTRY1 = io.vavr.Tuple.of("key1", "value1");

    private static final io.vavr.Tuple2<java.lang.String, java.lang.String> ENTRY2 = io.vavr.Tuple.of("key2", "value2");

    @org.junit.jupiter.api.Test
    void should_pass_if_Multimap_contains_all_entries() {
        Multimap<java.lang.String, java.lang.String> actual = HashMultimap.withSeq().of("key1", "value1", "key2", "value2", "key3", "value3");
        org.assertj.vavr.api.VavrAssertions.assertThat(actual).containsAllEntriesOf(List.of(org.assertj.vavr.api.MultimapAssert_containsAllEntriesOf_Test.ENTRY1, org.assertj.vavr.api.MultimapAssert_containsAllEntriesOf_Test.ENTRY2));
    }

    @org.junit.jupiter.api.Test
    void should_pass_if_Multimap_and_entries_parameter_are_empty() {
        org.assertj.vavr.api.VavrAssertions.assertThat(HashMultimap.withSeq().<java.lang.String, java.lang.String>empty()).containsAllEntriesOf(List.empty());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_Multimap_is_not_empty_and_entries_is_an_empty_array() {
        Multimap<java.lang.String, java.lang.String> actual = HashMultimap.withSeq().of("key1", "value1", "key3", "value3");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsAllEntriesOf(List.empty())).isInstanceOf(java.lang.AssertionError.class).hasMessage("actual is not empty while group of values to look for is.");
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_entries_parameter_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(HashMultimap.withSeq().<java.lang.String, java.lang.String>empty()).containsAllEntriesOf(null)).isInstanceOf(java.lang.NullPointerException.class);
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_one_of_entries_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(HashMultimap.withSeq().<java.lang.String, java.lang.String>empty()).containsAllEntriesOf(List.of(ENTRY1, null))).isInstanceOf(java.lang.NullPointerException.class);
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_Multimapis_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((Multimap<java.lang.String, java.lang.String>) (null))).containsAllEntriesOf(List.of(ENTRY1))).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.error.ShouldNotBeNull.shouldNotBeNull().create());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_Multimap_does_not_contain_all_entries() {
        Multimap<java.lang.String, java.lang.String> actual = HashMultimap.withSeq().of("key1", "value1", "key3", "value3");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsAllEntriesOf(List.of(ENTRY1, ENTRY2))).isInstanceOf(java.lang.AssertionError.class).hasMessage("\nExpecting HashMultimap:\n  HashMultimap[List]((key1, value1), (key3, value3))\nto contain:\n  [(key1, value1), (key2, value2)]\nbut could not find the following element(s):\n  HashSet((key2, value2))\n");
    }
}
