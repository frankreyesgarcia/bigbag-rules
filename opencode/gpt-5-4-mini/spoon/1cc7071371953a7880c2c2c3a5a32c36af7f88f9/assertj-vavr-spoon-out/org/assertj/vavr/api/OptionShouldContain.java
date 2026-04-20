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
import org.assertj.core.error.BasicErrorMessageFactory;
/**
 * Build error message when an {@link Option}
 * should contain a specific value.
 *
 * @author Grzegorz Piwowarek
 */
class OptionShouldContain extends org.assertj.core.error.BasicErrorMessageFactory {
    private static final java.lang.String EXPECTING_TO_CONTAIN = "%nExpecting:%n  <%s>%nto contain:%n  <%s>%nbut did not.";

    private static final java.lang.String EXPECTING_TO_CONTAIN_SAME = "%nExpecting:%n  <%s>%nto contain the instance (i.e. compared with ==):%n  <%s>%nbut did not.";

    private OptionShouldContain(java.lang.String message, java.lang.Object actual, java.lang.Object expected) {
        super(message, actual, expected);
    }

    private OptionShouldContain(java.lang.Object expected) {
        super("%nExpecting Option to contain:%n  <%s>%nbut was empty.", expected);
    }

    /**
     * Indicates that the provided {@link io.vavr.control.Option} does not contain the provided argument.
     *
     * @param <VALUE>
     * 		the type of the value contained in the {@link Option}.
     * @param option
     * 		the {@link Option} which contains a value.
     * @param expectedValue
     * 		the value we expect to be in the provided {@link Option}.
     * @return a error message factory
     */
    static <VALUE> org.assertj.vavr.api.OptionShouldContain shouldContain(io.vavr.control.Option<VALUE> option, VALUE expectedValue) {
        return option.isDefined() ? new org.assertj.vavr.api.OptionShouldContain(org.assertj.vavr.api.OptionShouldContain.EXPECTING_TO_CONTAIN, option, expectedValue) : org.assertj.vavr.api.OptionShouldContain.shouldContain(expectedValue);
    }

    /**
     * Indicates that the provided {@link io.vavr.control.Option} does not contain the provided argument (judging by reference
     * equality).
     *
     * @param <VALUE>
     * 		the type of the value contained in the {@link Option}.
     * @param option
     * 		the {@link Option} which contains a value.
     * @param expectedValue
     * 		the value we expect to be in the provided {@link Option}.
     * @return a error message factory
     */
    static <VALUE> org.assertj.vavr.api.OptionShouldContain shouldContainSame(io.vavr.control.Option<VALUE> option, VALUE expectedValue) {
        return option.isDefined() ? new org.assertj.vavr.api.OptionShouldContain(org.assertj.vavr.api.OptionShouldContain.EXPECTING_TO_CONTAIN_SAME, option, expectedValue) : org.assertj.vavr.api.OptionShouldContain.shouldContain(expectedValue);
    }

    /**
     * Indicates that an {@link io.vavr.control.Option} is empty so it doesn't contain the expected value.
     *
     * @param expectedValue
     * 		the value we expect to be in an {@link Option}.
     * @return a error message factory.
     */
    static org.assertj.vavr.api.OptionShouldContain shouldContain(java.lang.Object expectedValue) {
        return new org.assertj.vavr.api.OptionShouldContain(expectedValue);
    }
}
