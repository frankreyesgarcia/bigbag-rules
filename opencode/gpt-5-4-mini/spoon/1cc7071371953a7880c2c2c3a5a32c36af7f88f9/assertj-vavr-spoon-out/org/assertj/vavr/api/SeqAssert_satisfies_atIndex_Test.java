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
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.data.Index.atIndex;
import static org.assertj.core.util.FailureMessages.actualIsNull;
class SeqAssert_satisfies_atIndex_Test {
    static final java.util.function.Consumer<java.lang.String> CONDITION_TO_SATISFY = str -> org.assertj.vavr.api.VavrAssertions.assertThat(str).startsWith("something");

    @org.junit.jupiter.api.Test
    void should_pass_if_List_satisfy_condition_at_given_index() {
        final java.lang.String value = "something";
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.collection.List.of(value)).satisfies(org.assertj.vavr.api.SeqAssert_satisfies_atIndex_Test.CONDITION_TO_SATISFY, org.assertj.core.data.Index.atIndex(0));
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_List_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((List<java.lang.String>) (null))).satisfies(CONDITION_TO_SATISFY, atIndex(0))).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.util.FailureMessages.actualIsNull());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_given_index_is_greater_than_list_size() {
        final io.vavr.collection.Seq<java.lang.String> actual = io.vavr.collection.List.of("something");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).satisfies(CONDITION_TO_SATISFY, atIndex(2))).isInstanceOf(java.lang.IndexOutOfBoundsException.class).hasMessage("Index should be between <0> and <0> (inclusive) but was:\n <2>");
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_condition_to_satisfy_is_null() {
        final io.vavr.collection.Seq<java.lang.String> actual = io.vavr.collection.List.of("something");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).satisfies(null, atIndex(0))).isInstanceOf(java.lang.NullPointerException.class).hasMessage("The Consumer expressing the assertions requirements must not be null");
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_List_does_not_satisfies_condition_at_given_index() {
        final io.vavr.collection.Seq<java.lang.String> actual = io.vavr.collection.List.of("a", "b", "c");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).satisfies(CONDITION_TO_SATISFY, atIndex(0))).isInstanceOf(java.lang.AssertionError.class).hasMessage("\nExpecting actual:\n  \"a\"\nto start with:\n  \"something\"\n");
    }
}
