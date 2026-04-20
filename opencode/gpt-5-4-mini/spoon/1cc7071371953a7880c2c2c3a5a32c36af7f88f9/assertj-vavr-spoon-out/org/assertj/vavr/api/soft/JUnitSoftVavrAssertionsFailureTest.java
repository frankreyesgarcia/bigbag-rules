/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api.soft;
import io.vavr.control.Either;
import org.junit.Test;
import org.junit.runners.model.Statement;
import org.opentest4j.MultipleFailuresError;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowableOfType;
import static org.mockito.Mockito.mock;
public class JUnitSoftVavrAssertionsFailureTest {
    // @Rule
    public final org.assertj.vavr.api.soft.JUnitSoftVavrAssertions softly = new org.assertj.vavr.api.soft.JUnitSoftVavrAssertions();

    @org.junit.Test
    public void should_rule_for_soft_assertion_work() {
        // GIVEN
        io.vavr.control.Either<java.lang.String, java.lang.Object> actual = io.vavr.control.Either.left("something");
        softly.assertThat(actual).as("contains").containsOnLeft("else");
        softly.assertThat(actual).as("is").isLeft();
        softly.assertThat(actual).as("instance").containsLeftInstanceOf(java.lang.Long.class);
        // WHEN simulating the rule
        org.opentest4j.MultipleFailuresError multipleFailuresError = org.assertj.core.api.Assertions.catchThrowableOfType(() -> softly.apply(mock(org.junit.runners.model.Statement.class), null).evaluate(), org.opentest4j.MultipleFailuresError.class);
        // THEN
        java.util.List<java.lang.Throwable> failures = multipleFailuresError.getFailures();
        org.assertj.core.api.Assertions.assertThat(failures).hasSize(2);
        org.assertj.core.api.Assertions.assertThat(failures.get(0)).hasMessageStartingWith(java.lang.String.format("[contains] %nExpecting:%n  <Left(something)>%nto contain:%n  <\"else\">%nbut did not."));
        org.assertj.core.api.Assertions.assertThat(failures.get(1)).hasMessageStartingWith(java.lang.String.format((((("[instance] %nExpecting:%n" + " <Left>%n") + "to contain a value that is an instance of:%n") + " <java.lang.Long>%n") + "but did contain an instance of:%n") + " <java.lang.String>"));
    }
}
