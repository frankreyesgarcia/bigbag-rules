/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.Lazy;
/**
 * Assertions for {@link Lazy}.
 *
 * @param <SELF>
 * 		the "self" type of this assertion class.
 * @param <VALUE>
 * 		type of the value contained in the {@link Lazy}.
 */
abstract class AbstractLazyAssert<SELF extends org.assertj.vavr.api.AbstractLazyAssert<SELF, VALUE>, VALUE> extends org.assertj.vavr.api.AbstractValueAssert<SELF, io.vavr.Lazy<VALUE>> {
    AbstractLazyAssert(io.vavr.Lazy<VALUE> actual, java.lang.Class<?> selfType) {
        super(actual, selfType);
    }

    /**
     * Verifies that the actual {@link Lazy} is evaluated.
     *
     * @return this assertion object.
     */
    public SELF isEvaluated() {
        org.assertj.vavr.api.AbstractLazyAssert.isNotNull();
        if (!actual.isEvaluated())
            org.assertj.vavr.api.AbstractLazyAssert.throwAssertionError(org.assertj.vavr.api.LazyShouldBeEvaluated.shouldBeEvaluated());

        return myself;
    }

    /**
     * Verifies that the actual {@link Lazy} is not evaluated.
     *
     * @return this assertion object.
     */
    public SELF isNotEvaluated() {
        org.assertj.vavr.api.AbstractLazyAssert.isNotNull();
        if (actual.isEvaluated())
            throwAssertionError(org.assertj.vavr.api.LazyShouldBeNotEvaluated.shouldBeNotEvaluated(actual));

        return myself;
    }
}
