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
import org.assertj.core.error.BasicErrorMessageFactory;
/**
 * Build error message when an {@link Either} should contain a value being an instance of a specific class.
 *
 * @author Michał Chmielarz
 */
class EitherShouldContainInstanceOf extends org.assertj.core.error.BasicErrorMessageFactory {
    private static final java.lang.String EXPECTING_TO_CONTAIN_BUT_IS_LEFT = "%nExpecting:%n  <%s>%nto contain on right side:%n  <%s>%nbut was left-sided.";

    private static final java.lang.String EXPECTING_TO_CONTAIN_BUT_IS_RIGHT = "%nExpecting:%n  <%s>%nto contain on left side:%n  <%s>%nbut was right-sided.";

    private static final java.lang.String EXPECTING_TO_CONTAIN_DIFFERENT_INSTANCE = "%nExpecting:%n <%s>%nto contain a value that is an instance of:%n <%s>%nbut did contain an instance of:%n <%s>";

    private EitherShouldContainInstanceOf(java.lang.String message) {
        super(message);
    }

    /**
     * Indicates that a value should be present in a right-sided {@link io.vavr.control.Either}.
     *
     * @param value
     * 		Either to be checked.
     * @param expectedClazz
     * 		expected class of a right value
     * @return an error message factory.
     * @throws java.lang.NullPointerException
     * 		if either is null.
     */
    static org.assertj.vavr.api.EitherShouldContainInstanceOf shouldContainOnRightInstanceOf(java.lang.Object value, java.lang.Class<?> expectedClazz) {
        io.vavr.control.Either<?, ?> either = ((io.vavr.control.Either<?, ?>) (value));
        if (either.isRight()) {
            return new org.assertj.vavr.api.EitherShouldContainInstanceOf(java.lang.String.format(org.assertj.vavr.api.EitherShouldContainInstanceOf.EXPECTING_TO_CONTAIN_DIFFERENT_INSTANCE, either.getClass().getSimpleName(), expectedClazz.getName(), either.get().getClass().getName()));
        }
        return new org.assertj.vavr.api.EitherShouldContainInstanceOf(java.lang.String.format(org.assertj.vavr.api.EitherShouldContainInstanceOf.EXPECTING_TO_CONTAIN_BUT_IS_LEFT, either.getClass().getSimpleName(), expectedClazz.getName()));
    }

    /**
     * Indicates that a value should be present in a left-sided {@link io.vavr.control.Either}.
     *
     * @param value
     * 		Either to be checked.
     * @param expectedClazz
     * 		expected class of a left value
     * @return an error message factory.
     * @throws java.lang.NullPointerException
     * 		if either is null.
     */
    static org.assertj.vavr.api.EitherShouldContainInstanceOf shouldContainOnLeftInstanceOf(java.lang.Object value, java.lang.Class<?> expectedClazz) {
        io.vavr.control.Either<?, ?> either = ((io.vavr.control.Either<?, ?>) (value));
        if (either.isLeft()) {
            return new org.assertj.vavr.api.EitherShouldContainInstanceOf(java.lang.String.format(org.assertj.vavr.api.EitherShouldContainInstanceOf.EXPECTING_TO_CONTAIN_DIFFERENT_INSTANCE, either.getClass().getSimpleName(), expectedClazz.getName(), either.getLeft().getClass().getName()));
        }
        return new org.assertj.vavr.api.EitherShouldContainInstanceOf(java.lang.String.format(org.assertj.vavr.api.EitherShouldContainInstanceOf.EXPECTING_TO_CONTAIN_BUT_IS_RIGHT, either.getClass().getSimpleName(), expectedClazz.getName()));
    }
}
