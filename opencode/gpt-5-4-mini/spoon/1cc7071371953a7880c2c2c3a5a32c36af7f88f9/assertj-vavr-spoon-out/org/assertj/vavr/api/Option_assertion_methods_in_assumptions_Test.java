/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.control.Option;
import static org.assertj.core.api.Assertions.assertThat;
public class Option_assertion_methods_in_assumptions_Test extends org.assertj.vavr.api.BaseAssumptionsTest {
    private static final io.vavr.control.Option<java.lang.String> ARAGORN = io.vavr.control.Option.some("aragorn");

    public static java.util.stream.Stream<org.assertj.vavr.api.AssumptionRunner<?>> provideAssumptionsRunners() {
        return java.util.stream.Stream.of(org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Option_assertion_methods_in_assumptions_Test.ARAGORN, value -> assumeThat(value).contains("aragorn"), value -> assumeThat(value).contains("frodo")), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Option_assertion_methods_in_assumptions_Test.ARAGORN, value -> assumeThat(value).containsInstanceOf(java.lang.String.class), value -> assumeThat(value).containsInstanceOf(java.lang.Integer.class)), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Option_assertion_methods_in_assumptions_Test.ARAGORN, value -> assumeThat(value).containsSame("aragorn"), value -> assumeThat(value).containsSame(new java.lang.String("aragorn"))), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Option_assertion_methods_in_assumptions_Test.ARAGORN, value -> assumeThat(value).flatMap(val -> io.vavr.control.Option.some(val.toUpperCase())).contains("ARAGORN"), value -> assumeThat(value).flatMap(val -> io.vavr.control.Option.some(val.toUpperCase())).contains("aragorn")), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Option_assertion_methods_in_assumptions_Test.ARAGORN, value -> assumeThat(value).map(java.lang.String::toUpperCase).contains("ARAGORN"), value -> assumeThat(value).map(java.lang.String::toUpperCase).contains("aragorn")), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Option_assertion_methods_in_assumptions_Test.ARAGORN, value -> assumeThat(value).hasValueSatisfying(str -> assertThat(str).isLowerCase()), value -> assumeThat(value).hasValueSatisfying(str -> assertThat(str).isUpperCase())), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Option_assertion_methods_in_assumptions_Test.ARAGORN, value -> assumeThat(value).hasValueSatisfying(new org.assertj.vavr.api.TestCondition<>(true)), value -> assumeThat(value).hasValueSatisfying(new org.assertj.vavr.api.TestCondition<>(false))));
    }
}
