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
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.error.ShouldBeSorted.shouldHaveComparableElementsAccordingToGivenComparator;
import static org.assertj.core.util.FailureMessages.actualIsNull;
class SeqAssert_isSorted_Test {
    private static final java.util.Comparator<java.lang.Object> LIST_ELEMENT_COMPARATOR = (s1, s2) -> {
        if (s1 == null)
            return s2 == null ? 0 : 1;

        if (s2 == null)
            return -1;

        java.lang.Comparable c1 = ((java.lang.Comparable) (s1));
        java.lang.Comparable c2 = ((java.lang.Comparable) (s2));
        return c1.compareTo(c2);
    };

    @org.junit.jupiter.api.Test
    void should_pass_if_List_contains_element_sorted_in_comparator_order() {
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.collection.List.of("some", "something", "thing")).isSorted();
    }

    @org.junit.jupiter.api.Test
    void should_pass_if_List_is_empty() {
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.collection.List.of()).isSorted();
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_List_is_sorted_not_in_comparator_order() {
        final io.vavr.collection.Seq<java.lang.String> values = io.vavr.collection.List.of("some", "thing", "something");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(values).usingElementComparator(LIST_ELEMENT_COMPARATOR).isSorted()).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.vavr.api.SeqShouldBeSorted.shouldBeSortedAccordingToGivenComparator(1, values, org.assertj.vavr.api.SeqAssert_isSorted_Test.LIST_ELEMENT_COMPARATOR).create());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_List_contains_no_comparable_elements() {
        final io.vavr.collection.Seq<org.assertj.vavr.api.SeqAssert_isSorted_Test.Foo> values = io.vavr.collection.List.of(new org.assertj.vavr.api.SeqAssert_isSorted_Test.Foo("some"), new org.assertj.vavr.api.SeqAssert_isSorted_Test.Foo("thing"), new org.assertj.vavr.api.SeqAssert_isSorted_Test.Foo("something"));
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(values).usingElementComparator(LIST_ELEMENT_COMPARATOR).isSorted()).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.error.ShouldBeSorted.shouldHaveComparableElementsAccordingToGivenComparator(values, org.assertj.vavr.api.SeqAssert_isSorted_Test.LIST_ELEMENT_COMPARATOR).create());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_List_is_not_sorted() {
        final io.vavr.collection.Seq<java.lang.Integer> values = io.vavr.collection.List.of(0, 1, 3, 2, 9);
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(values).isSorted()).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.vavr.api.SeqShouldBeSorted.shouldBeSorted(2, values).create());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_elements_cannot_be_compared() {
        final io.vavr.collection.Seq<org.assertj.vavr.api.SeqAssert_isSorted_Test.Foo> values = io.vavr.collection.List.of(new org.assertj.vavr.api.SeqAssert_isSorted_Test.Foo("some"), new org.assertj.vavr.api.SeqAssert_isSorted_Test.Foo("thing"));
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(values).isSorted()).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.vavr.api.SeqShouldBeSorted.shouldHaveMutuallyComparableElements(values).create());
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_List_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((List<java.lang.String>) (null))).isSorted()).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.util.FailureMessages.actualIsNull());
    }

    private static class Foo {
        private final java.lang.String value;

        Foo(java.lang.String value) {
            this.value = value;
        }

        java.lang.String getValue() {
            return value;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return ("Foo{value='" + value) + "'}";
        }
    }
}
