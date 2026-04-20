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
import io.vavr.collection.LinkedHashMap;
import io.vavr.collection.Map;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.error.ShouldNotBeNull.shouldNotBeNull;
@java.lang.SuppressWarnings("unchecked")
class MapAssert_containsExactly_Test {
    private static final io.vavr.Tuple2<java.lang.String, java.lang.String> ENTRY1 = io.vavr.Tuple.of("key1", "value1");

    private static final io.vavr.Tuple2<java.lang.String, java.lang.String> ENTRY2 = io.vavr.Tuple.of("key2", "value2");

    private static final io.vavr.Tuple2<java.lang.String, java.lang.String> ENTRY3 = io.vavr.Tuple.of("key3", "value3");

    @org.junit.jupiter.api.Test
    void should_pass_if_Map_contains_given_entries_in_order() {
        final io.vavr.collection.Map<java.lang.String, java.lang.String> actual = io.vavr.collection.LinkedHashMap.of("key1", "value1", "key2", "value2", "key3", "value3");
        org.assertj.vavr.api.VavrAssertions.assertThat(actual).containsExactly(org.assertj.vavr.api.MapAssert_containsExactly_Test.ENTRY1, org.assertj.vavr.api.MapAssert_containsExactly_Test.ENTRY2, org.assertj.vavr.api.MapAssert_containsExactly_Test.ENTRY3);
    }

    @org.junit.jupiter.api.Test
    void should_pass_if_Map_and_entries_parameter_are_empty() {
        final io.vavr.Tuple2<java.lang.String, java.lang.String>[] entries = new io.vavr.Tuple2[0];
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.collection.LinkedHashMap.<java.lang.String, java.lang.String>empty()).containsExactly(entries);
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_Map_is_not_empty_and_entries_is_an_empty_array() {
        final io.vavr.collection.Map<java.lang.String, java.lang.String> actual = io.vavr.collection.LinkedHashMap.of("key1", "value1", "key3", "value3");
        final io.vavr.Tuple2<java.lang.String, java.lang.String>[] entries = new io.vavr.Tuple2[]{  };
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsExactly(entries)).isInstanceOf(java.lang.IllegalArgumentException.class).hasMessage("The array of entries to look for should not be empty");
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_entries_parameter_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(io.vavr.collection.LinkedHashMap.<java.lang.String, java.lang.String>empty()).containsExactly(((Tuple2<java.lang.String, java.lang.String>[]) (null)))).isInstanceOf(java.lang.NullPointerException.class).hasMessage("The array of entries to look for should not be null");
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_Map_and_entries_have_different_sizes() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(io.vavr.collection.LinkedHashMap.<java.lang.String, java.lang.String>empty()).containsExactly(ENTRY1)).isInstanceOf(java.lang.AssertionError.class).hasMessage((((((("\nActual and expected should have same size but actual size is:\n" + "  0\n") + "while expected size is:\n") + "  1\n") + "Actual was:\n") + "  LinkedHashMap()\n") + "Expected was:\n") + "  [(key1, value1)]");
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_one_of_entries_is_null() {
        final io.vavr.collection.Map<java.lang.String, java.lang.String> actual = io.vavr.collection.LinkedHashMap.of("key1", "value1", "key3", "value3");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsExactly(ENTRY1, null)).isInstanceOf(java.lang.NullPointerException.class).hasMessage("One of expected entries is null");
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_Map_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((Map<java.lang.String, java.lang.String>) (null))).containsExactly(ENTRY1)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.error.ShouldNotBeNull.shouldNotBeNull().create());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_Map_does_not_contain_all_entries() {
        final io.vavr.collection.Map<java.lang.String, java.lang.String> actual = io.vavr.collection.LinkedHashMap.of("key1", "value1", "key3", "value3");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsExactly(ENTRY1, ENTRY2)).isInstanceOf(java.lang.AssertionError.class).hasMessage((((((("\nExpecting actual:\n" + "  LinkedHashMap((key1, value1), (key3, value3))\n") + "to contain exactly (and in same order):\n") + "  List((key1, value1), (key2, value2))\n") + "but some elements were not found:\n") + "  LinkedHashMap((key2, value2))\n") + "and others were not expected:\n") + "  LinkedHashMap((key3, value3))\n");
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_Map_does_not_contain_all_entries_in_same_order() {
        final io.vavr.collection.Map<java.lang.String, java.lang.String> actual = io.vavr.collection.LinkedHashMap.of("key1", "value1", "key3", "value3");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsExactly(ENTRY3, ENTRY1)).isInstanceOf(java.lang.AssertionError.class).hasMessage((("\nActual and expected have the same elements but not in the same order, at index 0 actual element was:\n" + "  (key1, value1)\n") + "whereas expected element was:\n") + "  (key3, value3)\n");
    }
}
