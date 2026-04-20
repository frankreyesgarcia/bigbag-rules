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
import static org.assertj.core.error.ShouldBeAnArray.shouldBeAnArray;
import static org.assertj.core.error.ShouldHaveSameSizeAs.shouldHaveSameSizeAs;
import static org.assertj.core.error.ShouldNotBeNull.shouldNotBeNull;
class MapAssert_hasSameSizeAs_Array_Test {
    @org.junit.jupiter.api.Test
    void should_pass_if_Map_has_same_size_as_given_array() {
        java.lang.String[] array = new java.lang.String[]{ "single element" };
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.collection.HashMap.of("key", "value")).hasSameSizeAs(array);
    }

    @org.junit.jupiter.api.Test
    void should_fail_when_Map_is_null() {
        java.lang.String[] array = new java.lang.String[]{ "single element" };
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(((Map<java.lang.String, java.lang.String>) (null))).hasSameSizeAs(array)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.error.ShouldNotBeNull.shouldNotBeNull().create());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_Map_is_not_of_expected_size() {
        final io.vavr.collection.HashMap<java.lang.Object, java.lang.Object> actual = io.vavr.collection.HashMap.empty();
        java.lang.String[] array = new java.lang.String[]{ "single element" };
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).hasSameSizeAs(array)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.error.ShouldHaveSameSizeAs.shouldHaveSameSizeAs(actual, array, 0, 1).create());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_array_to_compare_with_is_null() {
        java.lang.String[] array = null;
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(io.vavr.collection.HashMap.empty()).hasSameSizeAs(array)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.error.ShouldBeAnArray.shouldBeAnArray(array).create());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_comparing_Map_size_with_non_array_type() {
        final io.vavr.collection.HashMap<java.lang.Object, java.lang.Object> actual = io.vavr.collection.HashMap.empty();
        java.lang.Object object = null;
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).hasSameSizeAs(object)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.error.ShouldBeAnArray.shouldBeAnArray(object).create());
    }
}
