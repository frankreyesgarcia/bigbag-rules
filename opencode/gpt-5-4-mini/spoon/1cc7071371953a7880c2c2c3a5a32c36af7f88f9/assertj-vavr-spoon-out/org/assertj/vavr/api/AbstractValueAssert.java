/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.api.WritableAssertionInfo;
import org.assertj.core.internal.Objects;
class AbstractValueAssert<SELF extends org.assertj.vavr.api.AbstractValueAssert<SELF, ACTUAL>, ACTUAL> extends org.assertj.core.api.AbstractObjectAssert<SELF, ACTUAL> implements org.assertj.vavr.api.AbstractVavrAssert<SELF, ACTUAL> {
    private org.assertj.core.internal.Objects objects = org.assertj.core.internal.Objects.instance();

    AbstractValueAssert(ACTUAL actual, java.lang.Class<?> selfType) {
        super(actual, selfType);
    }

    public ACTUAL actual() {
        return actual;
    }

    @java.lang.Override
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

    private void propagateAssertionInfoFrom(org.assertj.vavr.api.AbstractVavrAssert assertInstance) {
        this.info.useRepresentation(assertInstance.info().representation());
        this.info.description(assertInstance.info().description());
        this.info.overridingErrorMessage(assertInstance.info().overridingErrorMessage());
    }
}
