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
class MapAssert_isNotEqualTo_Test {
    @org.junit.jupiter.api.Test
    void should_pass_if_Map_is_not_equal_to() {
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.collection.HashMap.of("key1", "value2", "key2", "value2")).isNotEqualTo(io.vavr.collection.HashMap.of("otherKey1", "value2", "key2", "value2"));
    }

    @org.junit.jupiter.api.Test
    void should_pass_when_Map_is_null() {
        final io.vavr.collection.Map<java.lang.String, java.lang.String> actual = null;
        final io.vavr.collection.Map<java.lang.String, java.lang.String> expected = io.vavr.collection.HashMap.of("a", "b");
        org.assertj.vavr.api.VavrAssertions.assertThat(actual).isNotEqualTo(expected);
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_Map_is_equal_to() {
        final io.vavr.collection.Map<java.lang.Object, java.lang.Object> actual = io.vavr.collection.HashMap.of("key1", "value2", "key2", "value2");
        final io.vavr.collection.Map<java.lang.Object, java.lang.Object> expected = actual;
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).isNotEqualTo(expected)).isInstanceOf(java.lang.AssertionError.class).hasMessage(((("\n" + "Expecting actual:\n") + "  HashMap((key1, value2), (key2, value2))\n") + "not to be equal to:\n") + "  HashMap((key1, value2), (key2, value2))\n");
    }
}
