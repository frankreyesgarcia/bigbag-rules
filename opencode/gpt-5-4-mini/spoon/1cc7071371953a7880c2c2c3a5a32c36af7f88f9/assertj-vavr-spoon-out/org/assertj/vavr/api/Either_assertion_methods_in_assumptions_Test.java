/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.control.Either;
public class Either_assertion_methods_in_assumptions_Test extends org.assertj.vavr.api.BaseAssumptionsTest {
    private static final java.lang.String IT_S_GOOD = "It's good";

    private static final java.lang.String BAD_ONE = "Bad one";

    public static java.util.stream.Stream<org.assertj.vavr.api.AssumptionRunner<?>> provideAssumptionsRunners() {
        return java.util.stream.Stream.of(org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(io.vavr.control.Either.right(org.assertj.vavr.api.Either_assertion_methods_in_assumptions_Test.IT_S_GOOD), value -> assumeThat(value).isRight(), value -> assumeThat(value).isLeft()), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(io.vavr.control.Either.right(org.assertj.vavr.api.Either_assertion_methods_in_assumptions_Test.IT_S_GOOD), value -> assumeThat(value).containsOnRight(IT_S_GOOD), value -> assumeThat(value).containsOnRight(BAD_ONE)), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(io.vavr.control.Either.right(org.assertj.vavr.api.Either_assertion_methods_in_assumptions_Test.IT_S_GOOD), value -> assumeThat(value).containsRightSame(IT_S_GOOD), value -> assumeThat(value).containsRightSame(new java.lang.String("It's good"))), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(io.vavr.control.Either.right(org.assertj.vavr.api.Either_assertion_methods_in_assumptions_Test.IT_S_GOOD), value -> assumeThat(value).containsRightInstanceOf(java.lang.String.class), value -> assumeThat(value).containsRightInstanceOf(java.lang.Integer.class)), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(io.vavr.control.Either.left(org.assertj.vavr.api.Either_assertion_methods_in_assumptions_Test.BAD_ONE), value -> assumeThat(value).isLeft(), value -> assumeThat(value).isRight()), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(io.vavr.control.Either.left(org.assertj.vavr.api.Either_assertion_methods_in_assumptions_Test.BAD_ONE), value -> assumeThat(value).containsOnLeft(BAD_ONE), value -> assumeThat(value).containsOnLeft(IT_S_GOOD)), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(io.vavr.control.Either.left(org.assertj.vavr.api.Either_assertion_methods_in_assumptions_Test.BAD_ONE), value -> assumeThat(value).containsLeftSame(BAD_ONE), value -> assumeThat(value).containsLeftSame(new java.lang.String("Bad one"))), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(io.vavr.control.Either.left(org.assertj.vavr.api.Either_assertion_methods_in_assumptions_Test.BAD_ONE), value -> assumeThat(value).containsLeftInstanceOf(java.lang.String.class), value -> assumeThat(value).containsLeftInstanceOf(java.lang.Integer.class)));
    }
}
