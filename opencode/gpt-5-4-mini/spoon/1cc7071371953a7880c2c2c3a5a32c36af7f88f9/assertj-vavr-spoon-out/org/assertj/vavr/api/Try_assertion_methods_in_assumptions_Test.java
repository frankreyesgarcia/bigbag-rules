/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.control.Try;
import static org.assertj.core.api.Assertions.assertThat;
public class Try_assertion_methods_in_assumptions_Test extends org.assertj.vavr.api.BaseAssumptionsTest {
    private static final io.vavr.control.Try<java.lang.String> GIMLI = io.vavr.control.Try.success("gimli");

    private static final io.vavr.control.Try<java.lang.String> SAURON_HAS_THE_RING = io.vavr.control.Try.failure(new java.lang.IllegalStateException("Sauron has The Ring"));

    public static java.util.stream.Stream<org.assertj.vavr.api.AssumptionRunner<?>> provideAssumptionsRunners() {
        return java.util.stream.Stream.of(org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Try_assertion_methods_in_assumptions_Test.GIMLI, value -> assumeThat(value).isSuccess(), value -> assumeThat(value).isFailure()), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Try_assertion_methods_in_assumptions_Test.GIMLI, value -> assumeThat(value).contains("gimli"), value -> assumeThat(value).contains("aragorn")), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Try_assertion_methods_in_assumptions_Test.GIMLI, value -> assumeThat(value).containsInstanceOf(java.lang.String.class), value -> assumeThat(value).containsInstanceOf(java.lang.Integer.class)), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Try_assertion_methods_in_assumptions_Test.GIMLI, value -> assumeThat(value).containsSame("gimli"), value -> assumeThat(value).containsSame(new java.lang.String("gimli"))), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Try_assertion_methods_in_assumptions_Test.SAURON_HAS_THE_RING, value -> assumeThat(value).failBecauseOf(java.lang.IllegalStateException.class), value -> assumeThat(value).failBecauseOf(java.lang.NullPointerException.class)), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Try_assertion_methods_in_assumptions_Test.SAURON_HAS_THE_RING, value -> assumeThat(value).failReasonHasMessage("Sauron has The Ring"), value -> assumeThat(value).failReasonHasMessage("Gandalf The Grey")), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Try_assertion_methods_in_assumptions_Test.GIMLI, value -> assumeThat(value).hasValueSatisfying(new org.assertj.vavr.api.TestCondition<>(true)), value -> assumeThat(value).hasValueSatisfying(new org.assertj.vavr.api.TestCondition<>(false))), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Try_assertion_methods_in_assumptions_Test.GIMLI, value -> assumeThat(value).hasValueSatisfying(str -> assertThat(str).isLowerCase()), value -> assumeThat(value).hasValueSatisfying(str -> assertThat(str).isUpperCase())));
    }
}
