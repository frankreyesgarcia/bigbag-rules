/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.Tuple2;
import io.vavr.collection.HashMap;
import io.vavr.collection.List;
import io.vavr.collection.Map;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.error.ShouldNotBeNull.shouldNotBeNull;
class MapAssert_containsOnly_Test {
    @org.junit.jupiter.api.Test
    void should_pass_if_Map_contains_only_given_entries() {
        final io.vavr.collection.Map<java.lang.String, java.lang.String> actual = io.vavr.collection.HashMap.of("key", "value");
        org.assertj.vavr.api.VavrAssertions.assertThat(actual).containsOnly(io.vavr.collection.List.of(io.vavr.collection.Map.entry("key", "value")));
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_Map_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((Map<java.lang.String, java.lang.String>) (null))).containsOnly(io.vavr.collection.List.of(io.vavr.collection.Map.entry("key", "value")))).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.error.ShouldNotBeNull.shouldNotBeNull().create());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_entries_parameter_is_null() {
        final io.vavr.collection.Map<java.lang.String, java.lang.String> actual = io.vavr.collection.HashMap.of("key", "value");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsOnly(null)).isInstanceOf(java.lang.NullPointerException.class).hasMessage("The entries to look for should not be null");
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_entries_parameter_is_empty_but_actual_Map_is_not() {
        final io.vavr.collection.Map<java.lang.String, java.lang.String> actual = io.vavr.collection.HashMap.of("key", "value");
        final java.lang.Iterable<io.vavr.Tuple2<java.lang.String, java.lang.String>> entries = io.vavr.collection.List.empty();
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsOnly(entries)).isInstanceOf(java.lang.IllegalArgumentException.class).hasMessage("The entries to look for should not be empty");
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_one_of_entries_is_null() {
        final io.vavr.collection.Map<java.lang.String, java.lang.String> actual = io.vavr.collection.HashMap.of("key", "value");
        final io.vavr.collection.List<io.vavr.Tuple2<java.lang.String, java.lang.String>> entries = io.vavr.collection.List.empty();
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsOnly(entries.append(null))).isInstanceOf(java.lang.NullPointerException.class);
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_Map_contains_more_than_given_entries() {
        final io.vavr.collection.Map<java.lang.String, java.lang.String> actual = io.vavr.collection.HashMap.of("key-1", "value-1", "key-2", "value-2");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsOnly(io.vavr.collection.HashMap.of("key-1", "value-1"))).isInstanceOf(java.lang.AssertionError.class).hasMessage(((((("\n" + "Expecting HashMap:\n") + "  HashMap((key-1, value-1), (key-2, value-2))\n") + "to contain only:\n") + "  HashMap((key-1, value-1))\n") + "but the following element(s) were unexpected:\n") + "  HashMap((key-2, value-2))\n");
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_Map_has_same_size_but_contains_different_entries() {
        final io.vavr.collection.Map<java.lang.String, java.lang.String> actual = io.vavr.collection.HashMap.of("key-1", "value-1", "key-2", "value-2");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsOnly(io.vavr.collection.HashMap.of("key-1", "value-1", "key-3", "value-3"))).isInstanceOf(java.lang.AssertionError.class).hasMessage(((((((("\n" + "Expecting HashMap:\n") + "  HashMap((key-1, value-1), (key-2, value-2))\n") + "to contain only:\n") + "  HashMap((key-1, value-1), (key-3, value-3))\n") + "element(s) not found:\n") + "  HashMap((key-3, value-3))\n") + "and element(s) not expected:\n") + "  HashMap((key-2, value-2))\n");
    }
}
