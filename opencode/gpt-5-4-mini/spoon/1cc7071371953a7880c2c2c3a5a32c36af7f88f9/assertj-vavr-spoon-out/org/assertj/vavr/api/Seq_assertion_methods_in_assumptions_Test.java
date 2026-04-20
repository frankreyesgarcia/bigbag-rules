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
import org.assertj.core.api.Condition;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Index.atIndex;
public class Seq_assertion_methods_in_assumptions_Test extends org.assertj.vavr.api.BaseAssumptionsTest {
    private static final io.vavr.collection.Seq<java.lang.String> NAMES = io.vavr.collection.List.of("bilbo", "frodo", "gandalf");

    private static final org.assertj.core.api.Condition<java.lang.String> FRODO_CONDITION = new org.assertj.core.api.Condition<>(str -> str.equals("frodo"), "contains frodo");

    private static final java.util.function.Consumer<java.lang.String> FRODO_CONSUMER = str -> org.assertj.core.api.Assertions.assertThat(str).isEqualTo("frodo");

    public static java.util.stream.Stream<org.assertj.vavr.api.AssumptionRunner<?>> provideAssumptionsRunners() {
        return java.util.stream.Stream.of(org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Seq_assertion_methods_in_assumptions_Test.NAMES, value -> assumeThat(value).has(FRODO_CONDITION, atIndex(1)), value -> assumeThat(value).has(FRODO_CONDITION, atIndex(0))), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Seq_assertion_methods_in_assumptions_Test.NAMES, value -> assumeThat(value).satisfies(FRODO_CONSUMER, atIndex(1)), value -> assumeThat(value).satisfies(FRODO_CONSUMER, atIndex(0))), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Seq_assertion_methods_in_assumptions_Test.NAMES, value -> assumeThat(value).contains("frodo", atIndex(1)), value -> assumeThat(value).contains("frodo", atIndex(0))), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Seq_assertion_methods_in_assumptions_Test.NAMES, value -> assumeThat(value).doesNotContain("frodo", atIndex(0)), value -> assumeThat(value).doesNotContain("frodo", atIndex(1))), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Seq_assertion_methods_in_assumptions_Test.NAMES, value -> assumeThat(value).isSortedAccordingTo(java.util.Comparator.naturalOrder()), value -> assumeThat(value).isSortedAccordingTo(java.util.Comparator.reverseOrder())));
    }
}
