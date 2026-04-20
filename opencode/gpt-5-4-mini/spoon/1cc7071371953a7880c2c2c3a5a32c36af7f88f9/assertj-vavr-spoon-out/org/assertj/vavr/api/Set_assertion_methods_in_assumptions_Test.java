/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.collection.Array;
import io.vavr.collection.HashSet;
import io.vavr.collection.List;
import io.vavr.collection.Set;
import static org.assertj.core.api.Assertions.assertThat;
public class Set_assertion_methods_in_assumptions_Test extends org.assertj.vavr.api.BaseAssumptionsTest {
    private static final java.lang.String FRODO = "frodo";

    private static final java.lang.String GIMLI = "gimli";

    private static final java.lang.String LEGOLAS = "legolas";

    private static final io.vavr.collection.Set<java.lang.String> CHARACTERS = io.vavr.collection.HashSet.of(org.assertj.vavr.api.Set_assertion_methods_in_assumptions_Test.FRODO, org.assertj.vavr.api.Set_assertion_methods_in_assumptions_Test.GIMLI);

    private static final java.util.function.Consumer<java.lang.String> OK_CONSUMER = value -> org.assertj.core.api.Assertions.assertThat(value).isLowerCase();

    private static final java.util.function.Consumer<java.lang.String> FAIL_CONSUMER = value -> org.assertj.core.api.Assertions.assertThat(value).isUpperCase();

    public static java.util.stream.Stream<org.assertj.vavr.api.AssumptionRunner<?>> provideAssumptionsRunners() {
        return java.util.stream.Stream.of(org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Set_assertion_methods_in_assumptions_Test.CHARACTERS, value -> assumeThat(value).allSatisfy(OK_CONSUMER), value -> assumeThat(value).allSatisfy(FAIL_CONSUMER)), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Set_assertion_methods_in_assumptions_Test.CHARACTERS, value -> assumeThat(value).containsAnyOf(FRODO), value -> assumeThat(value).containsAnyOf(LEGOLAS)), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Set_assertion_methods_in_assumptions_Test.CHARACTERS, value -> assumeThat(value).contains(FRODO), value -> assumeThat(value).contains(LEGOLAS)), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Set_assertion_methods_in_assumptions_Test.CHARACTERS, value -> assumeThat(value).containsAll(io.vavr.collection.List.of(FRODO, GIMLI)), value -> assumeThat(value).containsAll(io.vavr.collection.List.of(FRODO, LEGOLAS))), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Set_assertion_methods_in_assumptions_Test.CHARACTERS, value -> assumeThat(value).containsExactly(GIMLI, FRODO), value -> assumeThat(value).containsExactly(FRODO)), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Set_assertion_methods_in_assumptions_Test.CHARACTERS, value -> assumeThat(value).doesNotContain(LEGOLAS), value -> assumeThat(value).doesNotContain(FRODO)), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Set_assertion_methods_in_assumptions_Test.CHARACTERS, value -> assumeThat(value).hasSameSizeAs(new java.lang.String[]{ "frodo", "gimli" }), value -> assumeThat(value).hasSameSizeAs(new java.lang.String[]{ "frodo" })), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Set_assertion_methods_in_assumptions_Test.CHARACTERS, value -> assumeThat(value).hasSameSizeAs(io.vavr.collection.Array.of(FRODO, GIMLI)), value -> assumeThat(value).hasSameSizeAs(io.vavr.collection.Array.of(FRODO))), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Set_assertion_methods_in_assumptions_Test.CHARACTERS, value -> assumeThat(value).hasSize(2), value -> assumeThat(value).hasSize(1)));
    }
}
