/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.collection.Traversable;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.AbstractIterableAssert;
import org.assertj.core.api.WritableAssertionInfo;
import org.assertj.core.internal.Objects;
abstract class AbstractTraversableAssert<SELF extends org.assertj.vavr.api.AbstractTraversableAssert<SELF, ACTUAL, ELEMENT, ELEMENT_ASSERT>, ACTUAL extends io.vavr.collection.Traversable<? extends ELEMENT>, ELEMENT, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> extends org.assertj.core.api.AbstractIterableAssert<SELF, ACTUAL, ELEMENT, ELEMENT_ASSERT> implements org.assertj.vavr.api.AbstractVavrAssert<SELF, ACTUAL> {
    private org.assertj.core.internal.Objects objects = org.assertj.core.internal.Objects.instance();

    AbstractTraversableAssert(ACTUAL actual, java.lang.Class<?> selfType) {
        super(actual, selfType);
    }

    public SELF containsExactlyInAnyOrder(io.vavr.collection.Traversable<ELEMENT> values) {
        this.iterables.assertContainsExactlyInAnyOrder(this.info, this.actual, values.toJavaArray());
        return myself;
    }

    public ACTUAL actual() {
        return actual;
    }

    public SELF withAssertionState(@java.lang.SuppressWarnings("rawtypes")
    org.assertj.vavr.api.AbstractVavrAssert assertInstance) {
        this.objects = assertInstance.objects();
        propagateAssertionInfoFrom(assertInstance);
        return myself;
    }

    @java.lang.Override
    public org.assertj.core.internal.Objects objects() {
        return objects;
    }

    @java.lang.Override
    public org.assertj.core.api.WritableAssertionInfo info() {
        return info;
    }

    private void propagateAssertionInfoFrom(org.assertj.vavr.api.AbstractVavrAssert<?, ?> assertInstance) {
        this.info.useRepresentation(assertInstance.info().representation());
        this.info.description(assertInstance.info().description());
        this.info.overridingErrorMessage(assertInstance.info().overridingErrorMessage());
    }
}
