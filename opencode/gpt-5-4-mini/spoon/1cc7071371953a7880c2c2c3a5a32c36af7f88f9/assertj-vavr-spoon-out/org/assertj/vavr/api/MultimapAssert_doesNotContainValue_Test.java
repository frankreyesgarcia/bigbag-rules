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
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.error.ShouldNotBeNull.shouldNotBeNull;
class MultimapAssert_doesNotContainValue_Test {
    @org.junit.jupiter.api.Test
    void should_pass_if_Multimap_does_not_contain_given_value() {
        io.vavr.collection.Multimap<java.lang.String, java.lang.String> actual = io.vavr.collection.HashMultimap.withSeq().of("key1", "value1", "key2", "value2");
        org.assertj.vavr.api.VavrAssertions.assertThat(actual).doesNotContainValue("value4");
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_Multimap_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((Multimap<java.lang.String, java.lang.String>) (null))).doesNotContainValue("value")).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.error.ShouldNotBeNull.shouldNotBeNull().create());
    }

    @org.junit.jupiter.api.Test
    void should_pass_if_Multimap_does_not_contain_null_value() {
        io.vavr.collection.Multimap<java.lang.String, java.lang.String> actual = io.vavr.collection.HashMultimap.withSeq().of("key", "value");
        org.assertj.vavr.api.VavrAssertions.assertThat(actual).doesNotContainValue(null);
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_Multimap_contains_a_given_value() {
        io.vavr.collection.Multimap<java.lang.String, java.lang.String> actual = io.vavr.collection.HashMultimap.withSeq().of("key-1", "value-1", "key-2", "value-2");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).doesNotContainValue("value-1")).isInstanceOf(java.lang.AssertionError.class).hasMessage(((("\n" + "Expecting actual:\n") + "  HashMultimap[List]((key-1, value-1), (key-2, value-2))\n") + "not to contain value:\n") + "  \"value-1\"");
    }
}
