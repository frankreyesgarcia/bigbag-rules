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
import static org.assertj.core.error.ShouldBeEmpty.shouldBeEmpty;
class MultimapAssert_isNullOrEmpty_Test {
    @org.junit.jupiter.api.Test
    void should_pass_if_Multimap_is_empty() {
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.collection.HashMultimap.withSeq().empty()).isNullOrEmpty();
    }

    @org.junit.jupiter.api.Test
    void should_pass_when_Multimap_is_null() {
        org.assertj.vavr.api.VavrAssertions.assertThat(((io.vavr.collection.Multimap<java.lang.String, java.lang.String>) (null))).isNullOrEmpty();
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_Multimap_is_not_empty() {
        final io.vavr.collection.Multimap<java.lang.String, java.lang.String> actual = io.vavr.collection.HashMultimap.withSeq().of("key", "value");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).isEmpty()).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.error.ShouldBeEmpty.shouldBeEmpty(actual).create());
    }
}
