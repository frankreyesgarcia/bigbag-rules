/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.collection.HashMap;
import io.vavr.collection.Map;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.error.ShouldNotBeNull.shouldNotBeNull;
class MapAssert_doesNotContainKeys_Test {
    @org.junit.jupiter.api.Test
    void should_pass_if_Map_does_not_contain_given_keys() {
        final io.vavr.collection.Map<java.lang.String, java.lang.String> actual = io.vavr.collection.HashMap.of("key1", "value1", "key2", "value2");
        org.assertj.vavr.api.VavrAssertions.assertThat(actual).doesNotContainKeys("key3", "key4");
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_Map_is_null() {
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((Map<java.lang.String, java.lang.String>) (null))).doesNotContainKeys("key")).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.error.ShouldNotBeNull.shouldNotBeNull().create());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_keys_parameter_is_null() {
        final io.vavr.collection.Map<java.lang.String, java.lang.String> actual = io.vavr.collection.HashMap.of("key", "value");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).doesNotContainKeys(((java.lang.String[]) (null)))).isInstanceOf(java.lang.NullPointerException.class).hasMessage("The array of keys to look for should not be null");
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_keys_parameter_is_empty() {
        final io.vavr.collection.Map<java.lang.String, java.lang.String> actual = io.vavr.collection.HashMap.of("key", "value");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).doesNotContainKeys(new java.lang.String[0])).isInstanceOf(java.lang.IllegalArgumentException.class).hasMessage("The array of keys to look for should not be empty");
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_Map_contains_different_keys() {
        final io.vavr.collection.Map<java.lang.String, java.lang.String> actual = io.vavr.collection.HashMap.of("key-1", "value-1", "key-2", "value-2");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).doesNotContainKeys("key-1", "key-3")).isInstanceOf(java.lang.AssertionError.class).hasMessage(((("\n" + "Expecting actual:\n") + "  HashMap((key-1, value-1), (key-2, value-2))\n") + "not to contain key:\n") + "  \"key-1\"");
    }
}
