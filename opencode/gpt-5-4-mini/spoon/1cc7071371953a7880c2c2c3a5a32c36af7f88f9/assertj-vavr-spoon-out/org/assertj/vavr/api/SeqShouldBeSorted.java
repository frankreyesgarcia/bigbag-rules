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
import org.assertj.core.error.BasicErrorMessageFactory;
import org.assertj.core.error.ErrorMessageFactory;
/**
 * Creates an error message indicating that an assertion that verifies a sequence of elements is sorted failed.
 *
 * @author Michał Chmielarz
 */
class SeqShouldBeSorted extends org.assertj.core.error.BasicErrorMessageFactory {
    static <T> org.assertj.core.error.ErrorMessageFactory shouldBeSorted(int i, io.vavr.collection.Seq<? extends T> group) {
        return new org.assertj.vavr.api.SeqShouldBeSorted("%nsequence is not sorted because element %s:%n <%s>%nis not less or equal than element %s:%n <%s>%nsequence was:%n <%s>", i, group.get(i), i + 1, group.get(i + 1), group);
    }

    static org.assertj.core.error.ErrorMessageFactory shouldHaveMutuallyComparableElements(java.lang.Object actual) {
        return new org.assertj.vavr.api.SeqShouldBeSorted("%nsome elements are not mutually comparable in sequence:%n<%s>", actual);
    }

    static <T> org.assertj.core.error.ErrorMessageFactory shouldBeSortedAccordingToGivenComparator(int i, io.vavr.collection.Seq<? extends T> actual, java.util.Comparator<?> comparator) {
        return new org.assertj.vavr.api.SeqShouldBeSorted("%nsequence is not sorted according to %s comparator because element %s:%n <%s>%nis not less or equal than element %s:%n <%s>%nsequence was:%n <%s>", comparator, i, actual.get(i), i + 1, actual.get(i + 1), actual);
    }

    private SeqShouldBeSorted(java.lang.String format, java.lang.Object... arguments) {
        super(format, arguments);
    }
}
