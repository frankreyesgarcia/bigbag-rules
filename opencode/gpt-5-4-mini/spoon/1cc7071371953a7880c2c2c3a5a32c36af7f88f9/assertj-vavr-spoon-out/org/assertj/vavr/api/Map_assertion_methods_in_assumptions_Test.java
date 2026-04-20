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
import io.vavr.collection.Array;
import io.vavr.collection.HashMap;
import io.vavr.collection.List;
import io.vavr.collection.Map;
import static org.assertj.core.api.Assertions.assertThat;
public class Map_assertion_methods_in_assumptions_Test extends org.assertj.vavr.api.BaseAssumptionsTest {
    private static final io.vavr.collection.Map<java.lang.String, java.lang.String> RACES = io.vavr.collection.HashMap.of("frodo", "hobbit", "gimli", "dwarf");

    private static final java.util.function.BiConsumer<java.lang.String, java.lang.String> OK_CONSUMER = (key, value) -> org.assertj.core.api.Assertions.assertThat(key).isLowerCase();

    private static final java.util.function.BiConsumer<java.lang.String, java.lang.String> FAIL_CONSUMER = (key, value) -> org.assertj.core.api.Assertions.assertThat(key).isUpperCase();

    private static final io.vavr.Tuple2<java.lang.String, java.lang.String> FRODO = io.vavr.Tuple.of("frodo", "hobbit");

    private static final io.vavr.Tuple2<java.lang.String, java.lang.String> GIMLI = io.vavr.Tuple.of("gimli", "dwarf");

    private static final io.vavr.Tuple2<java.lang.String, java.lang.String> LEGOLAS = io.vavr.Tuple.of("legolas", "elf");

    public static java.util.stream.Stream<org.assertj.vavr.api.AssumptionRunner<?>> provideAssumptionsRunners() {
        return java.util.stream.Stream.of(org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Map_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).allSatisfy(OK_CONSUMER), value -> assumeThat(value).allSatisfy(FAIL_CONSUMER)), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Map_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).containsAnyOf(FRODO), value -> assumeThat(value).containsAnyOf(LEGOLAS)), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Map_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).contains(FRODO), value -> assumeThat(value).contains(LEGOLAS)), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Map_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).containsAllEntriesOf(io.vavr.collection.List.of(FRODO, GIMLI)), value -> assumeThat(value).containsAllEntriesOf(io.vavr.collection.List.of(FRODO, LEGOLAS))), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Map_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).containsEntry("frodo", "hobbit"), value -> assumeThat(value).containsEntry("legolas", "elf")), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Map_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).containsExactly(GIMLI, FRODO), value -> assumeThat(value).containsExactly(FRODO)), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Map_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).containsKey("frodo"), value -> assumeThat(value).containsKey("aragorn")), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Map_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).containsKeys("frodo", "gimli"), value -> assumeThat(value).containsKeys("aragorn", "legolas")), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Map_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).containsOnly(io.vavr.collection.List.of(FRODO, GIMLI)), value -> assumeThat(value).containsOnly(io.vavr.collection.List.of(GIMLI, LEGOLAS))), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Map_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).containsOnlyKeys("frodo", "gimli"), value -> assumeThat(value).containsOnlyKeys("aragorn", "legolas")), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Map_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).containsValue("hobbit"), value -> assumeThat(value).containsValue("man")), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Map_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).containsValues("hobbit", "dwarf"), value -> assumeThat(value).containsValues("man", "elf")), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Map_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).doesNotContainEntry("legolas", "elf"), value -> assumeThat(value).doesNotContainEntry("frodo", "hobbit")), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Map_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).doesNotContain(LEGOLAS), value -> assumeThat(value).doesNotContain(FRODO)), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Map_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).hasSameSizeAs(new java.lang.String[]{ "frodo", "gimli" }), value -> assumeThat(value).hasSameSizeAs(new java.lang.String[]{ "frodo" })), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Map_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).hasSameSizeAs(io.vavr.collection.Array.of(FRODO, GIMLI)), value -> assumeThat(value).hasSameSizeAs(io.vavr.collection.Array.of(FRODO))), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Map_assertion_methods_in_assumptions_Test.RACES, value -> assumeThat(value).hasSize(2), value -> assumeThat(value).hasSize(1)));
    }
}
