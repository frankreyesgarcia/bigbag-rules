/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.control.Option;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
class OptionAssert_containsInstanceOf_Test {
    @org.junit.jupiter.api.Test
    void should_fail_if_option_is_empty() {
        io.vavr.control.Option<java.lang.Object> actual = io.vavr.control.Option.none();
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsInstanceOf(java.lang.Object.class)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.vavr.api.OptionShouldBePresent.shouldBePresent().create());
    }

    @org.junit.jupiter.api.Test
    void should_pass_if_option_contains_required_type() {
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.control.Option.of("something")).containsInstanceOf(java.lang.String.class).containsInstanceOf(java.lang.Object.class);
    }

    @org.junit.jupiter.api.Test
    void should_pass_if_option_contains_required_type_subclass() {
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.control.Option.of(new org.assertj.vavr.api.OptionAssert_containsInstanceOf_Test.SubClass())).containsInstanceOf(org.assertj.vavr.api.OptionAssert_containsInstanceOf_Test.ParentClass.class);
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_option_contains_other_type_than_required() {
        io.vavr.control.Option<org.assertj.vavr.api.OptionAssert_containsInstanceOf_Test.ParentClass> actual = io.vavr.control.Option.of(new org.assertj.vavr.api.OptionAssert_containsInstanceOf_Test.ParentClass());
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsInstanceOf(org.assertj.vavr.api.OtherClass.class)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.vavr.api.OptionShouldContainInstanceOf.shouldContainInstanceOf(actual, org.assertj.vavr.api.OptionAssert_containsInstanceOf_Test.OtherClass.class).create());
    }

    private static class ParentClass {}

    private static class SubClass extends org.assertj.vavr.api.OptionAssert_containsInstanceOf_Test.ParentClass {}

    private static class OtherClass {}
}
