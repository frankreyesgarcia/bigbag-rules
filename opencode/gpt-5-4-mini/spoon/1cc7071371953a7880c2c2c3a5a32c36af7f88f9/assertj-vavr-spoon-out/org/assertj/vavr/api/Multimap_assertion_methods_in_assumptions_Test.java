/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.collection.*;
import static org.assertj.core.api.Assertions.assertThat;
public class Multimap_assertion_methods_in_assumptions_Test extends org.assertj.vavr.api.BaseAssumptionsTest {
    private static final org.assertj.vavr.api.Multimap<java.lang.String, java.lang.String> RACES = HashMultimap.withSeq().of("hobbit", "frodo", "dwarf", "gimli");

    private static final java.util.function.BiConsumer<java.lang.String, java.lang.String> OK_CONSUMER = (key, value) -> org.assertj.core.api.Assertions.assertThat(key).isLowerCase();

    private static final java.util.function.BiConsumer<java.lang.String, java.lang.String> FAIL_CONSUMER = (key, value) -> org.assertj.core.api.Assertions.assertThat(key).isUpperCase();

    private static final io.vavr.Tuple2<java.lang.String, java.lang.String> FRODO = io.vavr.Tuple.of("hobbit", "frodo");

    private static final io.vavr.Tuple2<java.lang.String, java.lang.String> GIMLI = io.vavr.Tuple.of("dwarf", "gimli");

    private static final io.vavr.Tuple2<java.lang.String, java.lang.String> LEGOLAS = io.vavr.Tuple.of("elf", "legolas");

    public static java.util.stream.Stream<org.assertj.vavr.api.AssumptionRunner<?>> provideAssumptionsRunners() {
        return java.util.stream.Stream.of(org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Multimap_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).allSatisfy(OK_CONSUMER), value -> assumeThat(value).allSatisfy(FAIL_CONSUMER)), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Multimap_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).containsAnyOf(FRODO), value -> assumeThat(value).containsAnyOf(LEGOLAS)), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Multimap_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).contains(FRODO), value -> assumeThat(value).contains(LEGOLAS)), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Multimap_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).containsAllEntriesOf(List.of(FRODO, GIMLI)), value -> assumeThat(value).containsAllEntriesOf(List.of(FRODO, LEGOLAS))), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Multimap_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).containsEntry("hobbit", "frodo"), value -> assumeThat(value).containsEntry("elf", "legolas")), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Multimap_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).containsExactly(GIMLI, FRODO), value -> assumeThat(value).containsExactly(FRODO)), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Multimap_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).containsKey("hobbit"), value -> assumeThat(value).containsKey("man")), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Multimap_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).containsKeys("hobbit", "dwarf"), value -> assumeThat(value).containsKeys("man", "elf")), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Multimap_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).containsOnly(List.of(FRODO, GIMLI)), value -> assumeThat(value).containsOnly(List.of(GIMLI, LEGOLAS))), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Multimap_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).containsOnlyKeys("hobbit", "dwarf"), value -> assumeThat(value).containsOnlyKeys("man", "elf")), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Multimap_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).containsValue("frodo"), value -> assumeThat(value).containsValue("aragorn")), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Multimap_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).containsValues("frodo", "gimli"), value -> assumeThat(value).containsValues("aragorn", "legolas")), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Multimap_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).doesNotContainEntry("elf", "legolas"), value -> assumeThat(value).doesNotContainEntry("hobbit", "frodo")), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Multimap_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).doesNotContain(LEGOLAS), value -> assumeThat(value).doesNotContain(FRODO)), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Multimap_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).hasSameSizeAs(new java.lang.String[]{ "frodo", "gimli" }), value -> assumeThat(value).hasSameSizeAs(new java.lang.String[]{ "frodo" })), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Multimap_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).hasSameSizeAs(Array.of(FRODO, GIMLI)), value -> assumeThat(value).hasSameSizeAs(Array.of(FRODO))), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Multimap_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).hasSize(2), value -> assumeThat(value).hasSize(1)));
    }
}
