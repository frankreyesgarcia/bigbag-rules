/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.collection.HashSet;
import io.vavr.collection.Set;
import io.vavr.collection.SortedSet;
import org.assertj.core.api.AssertFactory;
import org.assertj.core.api.ObjectAssert;
import org.assertj.core.api.ObjectAssertFactory;
public class SetAssert<ELEMENT> extends org.assertj.vavr.api.AbstractSetAssert<org.assertj.vavr.api.SetAssert<ELEMENT>, io.vavr.collection.Set<ELEMENT>, ELEMENT, org.assertj.core.api.ObjectAssert<ELEMENT>> {
    private final org.assertj.core.api.AssertFactory<ELEMENT, org.assertj.core.api.ObjectAssert<ELEMENT>> assertFactory;

    SetAssert(io.vavr.collection.Set<ELEMENT> set) {
        super(set, org.assertj.vavr.api.SetAssert.class);
        this.assertFactory = new org.assertj.core.api.ObjectAssertFactory<>();
        if (set instanceof io.vavr.collection.SortedSet) {
            java.util.Comparator<ELEMENT> comparator = ((io.vavr.collection.SortedSet<ELEMENT>) (set)).comparator();
            if (comparator != null) {
                org.assertj.vavr.api.SetAssert.usingElementComparator(comparator);
            }
        }
    }

    @java.lang.Override
    protected org.assertj.core.api.ObjectAssert<ELEMENT> toAssert(ELEMENT value, java.lang.String description) {
        return assertFactory.createAssert(value).as(description);
    }

    @java.lang.Override
    protected org.assertj.vavr.api.SetAssert<ELEMENT> newAbstractIterableAssert(java.lang.Iterable<? extends ELEMENT> iterable) {
        return new org.assertj.vavr.api.SetAssert<>(io.vavr.collection.HashSet.ofAll(iterable));
    }
}
