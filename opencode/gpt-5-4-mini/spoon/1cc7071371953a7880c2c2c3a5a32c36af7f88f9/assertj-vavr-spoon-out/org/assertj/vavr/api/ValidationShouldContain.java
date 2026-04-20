/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.control.Validation;
import org.assertj.core.error.BasicErrorMessageFactory;
/**
 * Build error message when an {@link Validation} should contain a specific value.
 *
 * @author Michał Chmielarz
 */
class ValidationShouldContain extends org.assertj.core.error.BasicErrorMessageFactory {
    private static final java.lang.String EXPECTING_TO_CONTAIN = "%nExpecting:%n  <%s>%nto contain:%n  <%s>%nbut did not.";

    private static final java.lang.String EXPECTING_TO_CONTAIN_SAME = "%nExpecting:%n  <%s>%nto contain the instance (i.e. compared with ==):%n  <%s>%nbut did not.";

    private static final java.lang.String EXPECTING_TO_CONTAIN_BUT_IS_INVALID = "%nExpecting:%n  <%s>%nto contain valid value:%n  <%s>%nbut was invalid.";

    private static final java.lang.String EXPECTING_TO_CONTAIN_BUT_IS_VALID = "%nExpecting:%n  <%s>%nto contain invalid value:%n  <%s>%nbut was valid.";

    private ValidationShouldContain(java.lang.String message, java.lang.Object actual, java.lang.Object expected) {
        super(message, actual, expected);
    }

    private ValidationShouldContain(java.lang.String format, java.lang.Object... arguments) {
        super(format, arguments);
    }

    /**
     * Indicates that the provided valid {@link Validation} does not contain the provided argument as value.
     *
     * @param validation
     * 		the {@link Validation} which contains a value.
     * @param expectedValue
     * 		the value we expect to be in the provided in valid {@link Validation}.
     * @param <INVALID>
     * 		type of the value in the case of the invalid {@link Validation}.
     * @param <VALID>
     * 		type of the value in the case of the valid {@link Validation}.
     * @return an error message factory
     */
    static <INVALID, VALID> org.assertj.vavr.api.ValidationShouldContain shouldContainValid(io.vavr.control.Validation<INVALID, VALID> validation, VALID expectedValue) {
        return validation.isValid() ? new org.assertj.vavr.api.ValidationShouldContain(org.assertj.vavr.api.ValidationShouldContain.EXPECTING_TO_CONTAIN, validation, expectedValue) : org.assertj.vavr.api.ValidationShouldContain.shouldContainButIsInvalid(validation, expectedValue);
    }

    /**
     * Indicates that the provided invalid {@link Validation} does not contain the provided argument as error value.
     *
     * @param validation
     * 		the {@link Validation} which contains a value.
     * @param expectedErrorValue
     * 		the value we expect to be in the provided in invalid {@link Validation}.
     * @param <INVALID>
     * 		type of the value in the case of the invalid {@link Validation}.
     * @param <VALID>
     * 		type of the value in the case of the valid {@link Validation}.
     * @return an error message factory
     */
    static <INVALID, VALID> org.assertj.vavr.api.ValidationShouldContain shouldContainInvalid(io.vavr.control.Validation<INVALID, VALID> validation, INVALID expectedErrorValue) {
        return validation.isInvalid() ? new org.assertj.vavr.api.ValidationShouldContain(org.assertj.vavr.api.ValidationShouldContain.EXPECTING_TO_CONTAIN, validation, expectedErrorValue) : org.assertj.vavr.api.ValidationShouldContain.shouldContainButIsValid(validation, expectedErrorValue);
    }

    /**
     * Indicates that the provided {@link Validation} does not contain the provided argument (judging by reference
     * equality).
     *
     * @param validation
     * 		the {@link Validation} which contains a value.
     * @param expectedValue
     * 		the value we expect to be in the provided valid {@link Validation}.
     * @param <INVALID>
     * 		type of the value in the case of the invalid {@link Validation}.
     * @param <VALID>
     * 		type of the value in the case of the valid {@link Validation}.
     * @return an error message factory
     */
    static <INVALID, VALID> org.assertj.vavr.api.ValidationShouldContain shouldContainValidSame(io.vavr.control.Validation<INVALID, VALID> validation, VALID expectedValue) {
        return validation.isValid() ? new org.assertj.vavr.api.ValidationShouldContain(org.assertj.vavr.api.ValidationShouldContain.EXPECTING_TO_CONTAIN_SAME, validation, expectedValue) : org.assertj.vavr.api.ValidationShouldContain.shouldContainButIsInvalid(validation, expectedValue);
    }

    /**
     * Indicates that the provided {@link Validation} does not contain the provided argument (judging by reference
     * equality).
     *
     * @param validation
     * 		the {@link Validation} which contains a value.
     * @param expectedErrorValue
     * 		the value we expect to be in the provided invalid {@link Validation}.
     * @param <INVALID>
     * 		type of the value in the case of the invalid {@link Validation}.
     * @param <VALID>
     * 		type of the value in the case of the valid {@link Validation}.
     * @return an error message factory
     */
    static <INVALID, VALID> org.assertj.vavr.api.ValidationShouldContain shouldContainInvalidSame(io.vavr.control.Validation<INVALID, VALID> validation, VALID expectedErrorValue) {
        return validation.isInvalid() ? new org.assertj.vavr.api.ValidationShouldContain(org.assertj.vavr.api.ValidationShouldContain.EXPECTING_TO_CONTAIN_SAME, validation, expectedErrorValue) : org.assertj.vavr.api.ValidationShouldContain.shouldContainButIsValid(validation, expectedErrorValue);
    }

    /**
     * Indicates that an {@link Validation} is invalid so it doesn't contain the expected valid value.
     *
     * @param validation
     * 		the {@link Validation} which contains a value.
     * @param expectedValidValue
     * 		the valid value we expect to be in an {@link Validation}.
     * @return an error message factory.
     */
    static org.assertj.vavr.api.ValidationShouldContain shouldContainButIsInvalid(io.vavr.control.Validation<?, ?> validation, java.lang.Object expectedValidValue) {
        return new org.assertj.vavr.api.ValidationShouldContain(org.assertj.vavr.api.ValidationShouldContain.EXPECTING_TO_CONTAIN_BUT_IS_INVALID, validation, expectedValidValue);
    }

    /**
     * Indicates that an {@link Validation} is valid so it doesn't contain the expected error value.
     *
     * @param validation
     * 		the {@link Validation} which contains a value.
     * @param expectedErrorValue
     * 		the error value we expect to be in an {@link Validation}.
     * @return an error message factory.
     */
    static org.assertj.vavr.api.ValidationShouldContain shouldContainButIsValid(io.vavr.control.Validation<?, ?> validation, java.lang.Object expectedErrorValue) {
        return new org.assertj.vavr.api.ValidationShouldContain(org.assertj.vavr.api.ValidationShouldContain.EXPECTING_TO_CONTAIN_BUT_IS_VALID, validation, expectedErrorValue);
    }
}
