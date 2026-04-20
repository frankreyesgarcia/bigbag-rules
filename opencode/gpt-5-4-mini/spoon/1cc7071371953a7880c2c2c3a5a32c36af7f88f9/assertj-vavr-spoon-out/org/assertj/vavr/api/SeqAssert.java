/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.collection.List;
import io.vavr.collection.Seq;
import org.assertj.core.api.AssertFactory;
import org.assertj.core.api.ObjectAssert;
import org.assertj.core.api.ObjectAssertFactory;
public class SeqAssert<ELEMENT> extends org.assertj.vavr.api.AbstractSeqAssert<org.assertj.vavr.api.SeqAssert<ELEMENT>, io.vavr.collection.Seq<ELEMENT>, ELEMENT, org.assertj.core.api.ObjectAssert<ELEMENT>> {
    private final org.assertj.core.api.AssertFactory<ELEMENT, org.assertj.core.api.ObjectAssert<ELEMENT>> assertFactory;

    SeqAssert(io.vavr.collection.Seq<ELEMENT> actual) {
        super(actual, org.assertj.vavr.api.SeqAssert.class);
        this.assertFactory = new org.assertj.core.api.ObjectAssertFactory<>();
    }

    @java.lang.Override
    protected org.assertj.core.api.ObjectAssert<ELEMENT> toAssert(ELEMENT value, java.lang.String description) {
        return assertFactory.createAssert(value).as(description);
    }

    @java.lang.Override
    protected org.assertj.vavr.api.SeqAssert<ELEMENT> newAbstractIterableAssert(java.lang.Iterable<? extends ELEMENT> iterable) {
        return new org.assertj.vavr.api.SeqAssert<>(io.vavr.collection.List.ofAll(iterable));
    }
}
