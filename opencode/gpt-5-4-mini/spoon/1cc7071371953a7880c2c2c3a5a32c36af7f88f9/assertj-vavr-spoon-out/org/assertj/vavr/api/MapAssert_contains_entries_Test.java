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
import io.vavr.collection.HashMap;
import io.vavr.collection.Map;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.error.ShouldNotBeNull.shouldNotBeNull;
@java.lang.SuppressWarnings("unchecked")
class MapAssert_contains_entries_Test {
    private static final io.vavr.Tuple2<java.lang.String, java.lang.String> ENTRY1 = io.vavr.Tuple.of("key1", "value1");

    private static final io.vavr.Tuple2<java.lang.String, java.lang.String> ENTRY2 = io.vavr.Tuple.of("key2", "value2");

    @org.junit.jupiter.api.Test
    void should_pass_if_Map_contains_all_entries() {
        final io.vavr.collection.Map<java.lang.String, java.lang.String> actual = io.vavr.collection.HashMap.of("key1", "value1", "key2", "value2", "key3", "value3");
        org.assertj.vavr.api.VavrAssertions.assertThat(actual).contains(org.assertj.vavr.api.MapAssert_contains_entries_Test.ENTRY1, org.assertj.vavr.api.MapAssert_contains_entries_Test.ENTRY2);
    }

    @org.junit.jupiter.api.Test
    void should_pass_if_Map_and_entries_parameter_are_empty() {
        final io.vavr.Tuple2<java.lang.String, java.lang.String>[] entries = new io.vavr.Tuple2[0];
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.collection.HashMap.<java.lang.String, java.lang.String>empty()).contains(entries);
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_Map_is_not_empty_and_entries_is_an_empty_array() {
        final io.vavr.collection.Map<java.lang.String, java.lang.String> actual = io.vavr.collection.HashMap.of("key1", "value1", "key3", "value3");
        final io.vavr.Tuple2<java.lang.String, java.lang.String>[] entries = new io.vavr.Tuple2[]{  };
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).contains(entries)).isInstanceOf(java.lang.AssertionError.class).hasMessage("actual is not empty while group of values to look for is.");
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_entries_parameter_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(io.vavr.collection.HashMap.<java.lang.String, java.lang.String>empty()).contains(((Tuple2<java.lang.String, java.lang.String>[]) (null)))).isInstanceOf(java.lang.NullPointerException.class).hasMessage("The array of entries to look for should not be null");
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_one_of_entries_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(io.vavr.collection.HashMap.<java.lang.String, java.lang.String>empty()).contains(ENTRY1, null)).isInstanceOf(java.lang.NullPointerException.class);
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_Map_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((Map<java.lang.String, java.lang.String>) (null))).contains(ENTRY1)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.error.ShouldNotBeNull.shouldNotBeNull().create());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_Map_does_not_contain_all_entries() {
        final io.vavr.collection.Map<java.lang.String, java.lang.String> actual = io.vavr.collection.HashMap.of("key1", "value1", "key3", "value3");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).contains(ENTRY1, ENTRY2)).isInstanceOf(java.lang.AssertionError.class).hasMessage("\nExpecting HashMap:\n  HashMap((key1, value1), (key3, value3))\nto contain:\n  [(key1, value1), (key2, value2)]\nbut could not find the following element(s):\n  HashSet((key2, value2))\n");
    }
}
