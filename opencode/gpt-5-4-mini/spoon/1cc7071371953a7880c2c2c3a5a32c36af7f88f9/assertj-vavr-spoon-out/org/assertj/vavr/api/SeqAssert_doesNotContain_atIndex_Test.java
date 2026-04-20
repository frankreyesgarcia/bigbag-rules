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
import static org.assertj.core.data.Index.atIndex;
import static org.assertj.core.error.ShouldNotContainAtIndex.shouldNotContainAtIndex;
import static org.assertj.core.util.FailureMessages.actualIsNull;
class SeqAssert_doesNotContain_atIndex_Test {
    @org.junit.jupiter.api.Test
    void should_pass_if_List_does_not_contain_provided_value_at_given_index() {
        final java.lang.String value = "something";
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.collection.List.of(value)).doesNotContain("nothing", org.assertj.core.data.Index.atIndex(0));
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_List_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((List<java.lang.String>) (null))).doesNotContain("something", atIndex(0))).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.util.FailureMessages.actualIsNull());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_given_index_is_greater_than_list_size() {
        final io.vavr.collection.Seq<java.lang.String> actual = io.vavr.collection.List.of("something");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).doesNotContain(null, atIndex(2))).isInstanceOf(java.lang.IndexOutOfBoundsException.class).hasMessage("Index should be between <0> and <0> (inclusive) but was:\n <2>");
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_List_contains_provided_element_at_given_index() {
        io.vavr.collection.Seq<java.lang.String> actual = io.vavr.collection.List.of("a", "b", "c");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).doesNotContain("a", atIndex(0))).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.error.ShouldNotContainAtIndex.shouldNotContainAtIndex(actual, "a", org.assertj.core.data.Index.atIndex(0)).create());
    }
}
