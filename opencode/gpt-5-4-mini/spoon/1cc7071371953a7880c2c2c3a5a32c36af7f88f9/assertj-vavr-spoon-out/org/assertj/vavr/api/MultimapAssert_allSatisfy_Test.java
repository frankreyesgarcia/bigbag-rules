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
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.error.ShouldNotBeNull.shouldNotBeNull;
class MultimapAssert_allSatisfy_Test {
    private static final java.util.function.BiConsumer<java.lang.String, java.lang.String> EMPTY_CONSUMER = (key, value) -> {
    };

    @org.junit.jupiter.api.Test
    void should_pass_if_Multimap_is_empty() {
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.collection.HashMultimap.withSeq().<java.lang.String, java.lang.String>empty()).allSatisfy(org.assertj.vavr.api.MultimapAssert_allSatisfy_Test.EMPTY_CONSUMER);
    }

    @org.junit.jupiter.api.Test
    void should_pass_if_all_Multimap_entries_satisfy_consumer() {
        io.vavr.collection.Multimap<java.lang.String, java.lang.String> actual = io.vavr.collection.HashMultimap.withSeq().of("key1", "value1", "key2", "value2");
        org.assertj.vavr.api.VavrAssertions.assertThat(actual).allSatisfy((key, value) -> {
            assertThat(key).startsWith("key");
            assertThat(value).startsWith("value");
        });
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_consumer_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(io.vavr.collection.HashMultimap.withSeq().<java.lang.String, java.lang.String>empty()).allSatisfy(null)).isInstanceOf(java.lang.NullPointerException.class).hasMessage("The BiConsumer<K, V> expressing the assertions requirements must not be null");
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_Multimap_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((Multimap<java.lang.String, java.lang.String>) (null))).allSatisfy(EMPTY_CONSUMER)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.error.ShouldNotBeNull.shouldNotBeNull().create());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_all_Multimap_entries_do_not_satisfy_consumer() {
        io.vavr.collection.Multimap<java.lang.String, java.lang.String> actual = io.vavr.collection.HashMultimap.withSeq().of("key1", "value1", "key2", "value2");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).allSatisfy((key, value) -> {
            assertThat(key).isEqualTo("key1");
        })).isInstanceOf(java.lang.AssertionError.class).hasMessage("\nexpected: \"key1\"\n but was: \"key2\"");
    }
}
