/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
class BaseAssumptionRunner<T> extends org.assertj.vavr.api.AssumptionRunner<T> {
    protected final T actual;

    private java.util.function.Consumer<T> failingAssumption;

    private java.util.function.Consumer<T> passingAssumption;

    BaseAssumptionRunner() {
        this.actual = null;
    }

    static <T> org.assertj.vavr.api.AssumptionRunner<T> assumptionRunner(T actual, java.util.function.Consumer<T> passingAssumption, java.util.function.Consumer<T> failingAssumption) {
        return new org.assertj.vavr.api.BaseAssumptionRunner<>(actual, passingAssumption, failingAssumption);
    }

    BaseAssumptionRunner(T actual, java.util.function.Consumer<T> passingAssumption, java.util.function.Consumer<T> failingAssumption) {
        this.actual = actual;
        this.passingAssumption = passingAssumption;
        this.failingAssumption = failingAssumption;
    }

    @java.lang.Override
    protected void runFailingAssumption() {
        failingAssumption.accept(actual);
    }

    @java.lang.Override
    protected void runPassingAssumption() {
        passingAssumption.accept(actual);
    }
}
