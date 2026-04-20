/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.collection.Seq;
import org.assertj.core.api.Condition;
import org.assertj.core.data.Index;
import org.assertj.core.error.BasicErrorMessageFactory;
import org.assertj.core.error.ErrorMessageFactory;
/**
 * Builds error message when a given condition is not met at specified index in actual {@link io.vavr.collection.Seq}
 *
 * @author Michał Chmielarz
 */
class SeqShouldHaveAtIndex extends org.assertj.core.error.BasicErrorMessageFactory {
    private <T> SeqShouldHaveAtIndex(io.vavr.collection.Seq<? extends T> actual, org.assertj.core.api.Condition<? super T> condition, org.assertj.core.data.Index index, T found) {
        super("%nExpecting:%n <%s>%nat index <%s> to have:%n <%s>%nin:%n <%s>%n", found, index.value, condition, actual);
    }

    static <T> org.assertj.core.error.ErrorMessageFactory shouldHaveAtIndex(io.vavr.collection.Seq<? extends T> actual, org.assertj.core.api.Condition<? super T> condition, org.assertj.core.data.Index index, T found) {
        return new org.assertj.vavr.api.SeqShouldHaveAtIndex(actual, condition, index, found);
    }
}
