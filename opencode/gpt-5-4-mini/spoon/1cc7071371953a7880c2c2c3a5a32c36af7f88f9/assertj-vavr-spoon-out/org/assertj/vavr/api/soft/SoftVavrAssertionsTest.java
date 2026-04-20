/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api.soft;
import io.vavr.Lazy;
import io.vavr.collection.List;
import io.vavr.control.Option;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.opentest4j.MultipleFailuresError;
import static org.junit.jupiter.api.Assertions.fail;
class SoftVavrAssertionsTest {
    @org.junit.jupiter.api.Test
    void all_assertions_should_pass() {
        org.assertj.vavr.api.soft.SoftVavrAssertions softly = new org.assertj.vavr.api.soft.SoftVavrAssertions();
        softly.assertThat(io.vavr.control.Option.some("value")).contains("value");
        softly.assertThat(io.vavr.collection.List.of(1, 2)).containsOnly(1, 2);
        softly.assertAll();
    }

    @org.junit.jupiter.api.Test
    void should_be_able_to_catch_exceptions_thrown_by_all_proxied_methods() {
        org.assertj.core.api.Assertions.setRemoveAssertJRelatedElementsFromStackTrace(false);
        // required to check error message in catch section
        io.vavr.Lazy<java.lang.Double> evaluated = io.vavr.Lazy.of(java.lang.Math::random);
        java.lang.Double evaluatedVal = evaluated.get();
        try {
            org.assertj.vavr.api.soft.SoftVavrAssertions softly = new org.assertj.vavr.api.soft.SoftVavrAssertions();
            org.assertj.vavr.api.soft.SoftVavrAssertionsHelper.runSoftlyAssertions(evaluated, softly);
            softly.assertAll();
        } catch (org.opentest4j.MultipleFailuresError e) {
            org.assertj.vavr.api.soft.SoftVavrAssertionsHelper.verifyErrors(evaluatedVal, e);
            return;
        }
        org.junit.jupiter.api.Assertions.fail("Should not reach here");
    }
}
