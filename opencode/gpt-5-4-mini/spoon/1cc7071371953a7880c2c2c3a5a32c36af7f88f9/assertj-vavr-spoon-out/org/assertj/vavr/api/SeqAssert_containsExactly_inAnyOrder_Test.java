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
import io.vavr.collection.List;
import io.vavr.collection.Seq;
import io.vavr.collection.Set;
import io.vavr.collection.Traversable;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.util.FailureMessages.actualIsNull;
class SeqAssert_containsExactly_inAnyOrder_Test {
    @org.junit.jupiter.api.Test
    void should_pass_if_List_contains_exactly_elements_in_any_order() {
        final io.vavr.collection.Set<java.lang.String> expectedInAnyOrder = io.vavr.collection.HashSet.of("other", "and", "else", "something");
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.collection.List.of("something", "else", "and", "other")).containsExactlyInAnyOrder(expectedInAnyOrder);
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_List_is_null() {
        final io.vavr.collection.Set<java.lang.String> expectedInAnyOrder = io.vavr.collection.HashSet.of("other", "and", "else", "something");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((List<java.lang.String>) (null))).containsExactlyInAnyOrder(expectedInAnyOrder)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.util.FailureMessages.actualIsNull());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_list_contains_not_all_expected_elements() {
        final io.vavr.collection.Set<java.lang.String> expectedInAnyOrder = io.vavr.collection.HashSet.of("other", "and", "else", "something");
        final io.vavr.collection.Seq<java.lang.String> actual = io.vavr.collection.List.of("something", "else");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsExactlyInAnyOrder(expectedInAnyOrder)).isInstanceOf(java.lang.AssertionError.class).hasMessage("\nExpecting actual:\n  List(something, else)\nto contain exactly in any order:\n  [\"other\", \"and\", \"else\", \"something\"]\nbut could not find the following elements:\n  [\"other\", \"and\"]\n");
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_list_contains_more_than_expected_elements() {
        final io.vavr.collection.Set<java.lang.String> expectedInAnyOrder = io.vavr.collection.HashSet.of("something", "else");
        final io.vavr.collection.Seq<java.lang.String> actual = io.vavr.collection.List.of("something", "else", "more");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsExactlyInAnyOrder(expectedInAnyOrder)).isInstanceOf(java.lang.AssertionError.class).hasMessage("\nExpecting actual:\n  List(something, else, more)\nto contain exactly in any order:\n  [\"else\", \"something\"]\nbut the following elements were unexpected:\n  [\"more\"]\n");
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_expected_elements_param_is_null() {
        final io.vavr.collection.Seq<java.lang.String> actual = io.vavr.collection.List.of("something");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsExactlyInAnyOrder(((Traversable<java.lang.String>) (null)))).isInstanceOf(java.lang.NullPointerException.class);
    }
}
