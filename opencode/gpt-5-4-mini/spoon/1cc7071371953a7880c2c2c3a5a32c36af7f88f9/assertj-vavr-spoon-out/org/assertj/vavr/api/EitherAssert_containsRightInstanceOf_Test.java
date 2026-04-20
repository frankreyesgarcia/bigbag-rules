/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.control.Either;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.util.FailureMessages.actualIsNull;
class EitherAssert_containsRightInstanceOf_Test {
    @org.junit.jupiter.api.Test
    void should_fail_if_either_is_null() {
        io.vavr.control.Either<java.lang.Object, java.lang.Object> actual = null;
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsRightInstanceOf(java.lang.Object.class)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.core.util.FailureMessages.actualIsNull());
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_either_is_left() {
        io.vavr.control.Either<java.lang.String, java.lang.Object> actual = io.vavr.control.Either.left("some");
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsRightInstanceOf(java.lang.Object.class)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.vavr.api.EitherShouldBeRight.shouldBeRight(actual).create());
    }

    @org.junit.jupiter.api.Test
    void should_pass_if_either_contains_required_type_on_right() {
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.control.Either.right("something")).containsRightInstanceOf(java.lang.String.class).containsRightInstanceOf(java.lang.Object.class);
    }

    @org.junit.jupiter.api.Test
    void should_pass_if_either_contains_required_type_subclass_on_right() {
        org.assertj.vavr.api.VavrAssertions.assertThat(io.vavr.control.Either.right(new org.assertj.vavr.api.EitherAssert_containsRightInstanceOf_Test.SubClass())).containsRightInstanceOf(org.assertj.vavr.api.EitherAssert_containsRightInstanceOf_Test.ParentClass.class);
    }

    @org.junit.jupiter.api.Test
    void should_fail_if_either_contains_other_type_on_right_than_required() {
        io.vavr.control.Either<java.lang.Object, org.assertj.vavr.api.EitherAssert_containsRightInstanceOf_Test.ParentClass> actual = io.vavr.control.Either.right(new org.assertj.vavr.api.EitherAssert_containsRightInstanceOf_Test.ParentClass());
        org.assertj.core.api.Assertions.assertThatThrownBy(() -> assertThat(actual).containsRightInstanceOf(org.assertj.vavr.api.OtherClass.class)).isInstanceOf(java.lang.AssertionError.class).hasMessage(org.assertj.vavr.api.EitherShouldContainInstanceOf.shouldContainOnRightInstanceOf(actual, org.assertj.vavr.api.EitherAssert_containsRightInstanceOf_Test.OtherClass.class).create());
    }

    private static class ParentClass {}

    private static class SubClass extends org.assertj.vavr.api.EitherAssert_containsRightInstanceOf_Test.ParentClass {}

    private static class OtherClass {}
}
