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
class MultimapAssert_containsOnly_Test {
    @org.junit.jupiter.api.Test
    void should_pass_if_Multimap_contains_only_given_entries() {
        final Multimap<java.lang.String, java.lang.String> actual = HashMultimap.withSeq().of("key", "value");
        org.assertj.vavr.api.VavrAssertions.assertThat(actual).containsOnly(List.of(io.vavr.Tuple.of("key", "value")));
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_Multimap_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((Multimap<java.lang.String, java.lang.String>) (null))).containsOnly(List.of(io.vavr.Tuple.of("key", "value")))).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.error.ShouldNotBeNull.shouldNotBeNull().create());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_entries_parameter_is_null() {
        final Multimap<java.lang.String, java.lang.String> actual = HashMultimap.withSeq().of("key", "value");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsOnly(null)).isInstanceOf(java.lang.NullPointerException.class).hasMessage("The entries should not be null");
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_entries_parameter_is_empty_but_actual_Map_is_not() {
        final Multimap<java.lang.String, java.lang.String> actual = HashMultimap.withSeq().of("key", "value");
        final java.lang.Iterable<io.vavr.Tuple2<java.lang.String, java.lang.String>> entries = List.empty();
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsOnly(entries)).isInstanceOf(java.lang.IllegalArgumentException.class).hasMessage("The entries should not be empty");
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_one_of_entries_is_null() {
        final Multimap<java.lang.String, java.lang.String> actual = HashMultimap.withSeq().of("key", "value");
        final List<io.vavr.Tuple2<java.lang.String, java.lang.String>> entries = List.empty();
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsOnly(entries.append(null))).isInstanceOf(java.lang.NullPointerException.class);
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_Multimap_contains_more_than_given_entries() {
        final Multimap<java.lang.String, java.lang.String> actual = HashMultimap.withSeq().of("key-1", "value-1", "key-2", "value-2");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsOnly(HashMultimap.withSeq().of("key-1", "value-1"))).isInstanceOf(java.lang.AssertionError.class).hasMessage(((((("\n" + "Expecting HashMultimap:\n") + "  HashMultimap[List]((key-1, value-1), (key-2, value-2))\n") + "to contain only:\n") + "  HashMultimap[List]((key-1, value-1))\n") + "but the following element(s) were unexpected:\n") + "  HashMultimap[List]((key-2, value-2))\n");
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_Multimap_has_same_size_but_contains_different_entries() {
        final Multimap<java.lang.String, java.lang.String> actual = HashMultimap.withSeq().of("key-1", "value-1", "key-2", "value-2");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsOnly(HashMultimap.withSeq().of("key-1", "value-1", "key-3", "value-3"))).isInstanceOf(java.lang.AssertionError.class).hasMessage(((((((("\n" + "Expecting HashMultimap:\n") + "  HashMultimap[List]((key-1, value-1), (key-2, value-2))\n") + "to contain only:\n") + "  HashMultimap[List]((key-1, value-1), (key-3, value-3))\n") + "element(s) not found:\n") + "  HashMultimap[List]((key-3, value-3))\n") + "and element(s) not expected:\n") + "  HashMultimap[List]((key-2, value-2))\n");
    }
}
