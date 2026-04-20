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
 * Build error message when an {@link Validation} should be valid.
 *
 * @author Michał Chmielarz
 */
class ValidationShouldBeValid extends org.assertj.core.error.BasicErrorMessageFactory {
    private ValidationShouldBeValid(io.vavr.control.Validation<?, ?> actual) {
        super("%nExpecting a Validation to be valid but was invalid <%s>.", actual.getError());
    }

    static org.assertj.vavr.api.ValidationShouldBeValid shouldBeValid(io.vavr.control.Validation<?, ?> actual) {
        return new org.assertj.vavr.api.ValidationShouldBeValid(actual);
    }
}
