/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.control.Validation;
public class Validation_assertion_methods_in_assumptions_Test extends org.assertj.vavr.api.BaseAssumptionsTest {
    private static final io.vavr.control.Validation<java.lang.String, java.lang.String> MERRY = io.vavr.control.Validation.valid("merry");

    private static final io.vavr.control.Validation<java.lang.String, java.lang.String> ORC = io.vavr.control.Validation.invalid("orc");

    public static java.util.stream.Stream<org.assertj.vavr.api.AssumptionRunner<?>> provideAssumptionsRunners() {
        return java.util.stream.Stream.of(org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Validation_assertion_methods_in_assumptions_Test.MERRY, value -> assumeThat(value).isValid(), value -> assumeThat(value).isInvalid()), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Validation_assertion_methods_in_assumptions_Test.MERRY, value -> assumeThat(value).containsValid("merry"), value -> assumeThat(value).containsValid("aragorn")), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Validation_assertion_methods_in_assumptions_Test.MERRY, value -> assumeThat(value).containsValidInstanceOf(java.lang.String.class), value -> assumeThat(value).containsValidInstanceOf(java.lang.Integer.class)), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Validation_assertion_methods_in_assumptions_Test.MERRY, value -> assumeThat(value).containsValidSame("merry"), value -> assumeThat(value).containsValidSame(new java.lang.String("merry"))), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Validation_assertion_methods_in_assumptions_Test.ORC, value -> assumeThat(value).isInvalid(), value -> assumeThat(value).isValid()), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Validation_assertion_methods_in_assumptions_Test.ORC, value -> assumeThat(value).containsInvalid("orc"), value -> assumeThat(value).containsInvalid("sauron")), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Validation_assertion_methods_in_assumptions_Test.ORC, value -> assumeThat(value).containsInvalidInstanceOf(java.lang.String.class), value -> assumeThat(value).containsInvalidInstanceOf(java.lang.Integer.class)), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Validation_assertion_methods_in_assumptions_Test.ORC, value -> assumeThat(value).containsInvalidSame("orc"), value -> assumeThat(value).containsInvalidSame(new java.lang.String("orc"))));
    }
}
