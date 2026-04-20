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
import io.vavr.collection.List;
import io.vavr.collection.Multimap;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.error.ShouldHaveSameSizeAs.shouldHaveSameSizeAs;
import static org.assertj.core.error.ShouldNotBeNull.shouldNotBeNull;
class MultimapAssert_hasSameSizeAs_Iterable_Test {
    @org.junit.jupiter.api.Test
    void should_pass_if_Multimap_has_same_size_as_given_iterable() {
        java.lang.Iterable<java.lang.String> iterable = io.vavr.collection.List.of("single element");
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.collection.HashMultimap.withSeq().of("key", "value")).hasSameSizeAs(iterable);
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_Multimap_is_null() {
        java.lang.Iterable<java.lang.String> iterable = io.vavr.collection.List.of("single element");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((Multimap<java.lang.String, java.lang.String>) (null))).hasSameSizeAs(iterable)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.error.ShouldNotBeNull.shouldNotBeNull().create());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_Multimap_is_not_of_expected_size() {
        final io.vavr.collection.Multimap<java.lang.Object, java.lang.Object> actual = io.vavr.collection.HashMultimap.withSeq().empty();
        java.lang.Iterable<java.lang.String> iterable = io.vavr.collection.List.of("single element");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).hasSameSizeAs(iterable)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.error.ShouldHaveSameSizeAs.shouldHaveSameSizeAs(actual, iterable, 0, 1).create());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_iterable_to_compare_with_is_null() {
        final io.vavr.collection.Multimap<java.lang.Object, java.lang.Object> actual = io.vavr.collection.HashMultimap.withSeq().empty();
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).hasSameSizeAs(null)).isInstanceOf(java.lang.NullPointerException.class).hasMessage("The other Iterable to compare actual size with should not be null");
    }
}
