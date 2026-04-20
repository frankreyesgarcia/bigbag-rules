/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import io.vavr.Lazy;
public class Lazy_assertion_methods_in_assumptions_Test extends org.assertj.vavr.api.BaseAssumptionsTest {
    public static java.util.stream.Stream<org.assertj.vavr.api.AssumptionRunner<?>> provideAssumptionsRunners() {
        return java.util.stream.Stream.of(org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Lazy_assertion_methods_in_assumptions_Test.evaluated(java.lang.Math::random), value -> assumeThat(value).isEvaluated(), value -> assumeThat(value).isNotEvaluated()), org.assertj.vavr.api.BaseAssumptionRunner.assumptionRunner(org.assertj.vavr.api.Lazy_assertion_methods_in_assumptions_Test.notEvaluated(java.lang.Math::random), value -> assumeThat(value).isNotEvaluated(), value -> assumeThat(value).isEvaluated()));
    }

    private static io.vavr.Lazy<java.lang.Double> evaluated(java.util.function.Supplier<java.lang.Double> random) {
        final io.vavr.Lazy<java.lang.Double> evaluated = io.vavr.Lazy.of(random);
        evaluated.get();
        return evaluated;
    }

    private static io.vavr.Lazy<java.lang.Double> notEvaluated(java.util.function.Supplier<java.lang.Double> random) {
        return io.vavr.Lazy.of(random);
    }
}
