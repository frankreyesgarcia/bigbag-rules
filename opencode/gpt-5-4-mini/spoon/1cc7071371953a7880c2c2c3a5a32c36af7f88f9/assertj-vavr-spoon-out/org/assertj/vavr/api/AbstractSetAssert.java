/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.collection.Set;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.EnumerableAssert;
abstract class AbstractSetAssert<SELF extends org.assertj.vavr.api.AbstractSetAssert<SELF, ACTUAL, ELEMENT, ELEMENT_ASSERT>, ACTUAL extends io.vavr.collection.Set<? extends ELEMENT>, ELEMENT, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> extends org.assertj.vavr.api.AbstractTraversableAssert<SELF, ACTUAL, ELEMENT, ELEMENT_ASSERT> implements org.assertj.core.api.EnumerableAssert<SELF, ELEMENT> {
    AbstractSetAssert(ACTUAL actual, java.lang.Class<?> selfType) {
        super(actual, selfType);
    }
}
