/* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Copyright 2017-2022 the original author or authors.
 */
package org.assertj.vavr.api;
import org.assertj.core.error.BasicErrorMessageFactory;
/**
 * Build error message when a value should be present in an {@link io.vavr.control.Try}.
 *
 * @author Grzegorz Piwowarek
 */
class TryShouldBeSuccess extends org.assertj.core.error.BasicErrorMessageFactory {
    private TryShouldBeSuccess(java.lang.Class<? extends java.lang.Throwable> clazz, java.lang.String message, java.lang.StackTraceElement[] stackTrace) {
        super(java.lang.String.format((("%nExpecting Try to be a Success, but was a Failure:" + "%n- exception class: %s") + "%n- message: %s") + "%n- stack trace:\n%s", clazz.getName(), message, org.assertj.vavr.api.TryShouldBeSuccess.asString(stackTrace)));
    }

    private static java.lang.String asString(java.lang.StackTraceElement[] stackTrace) {
        java.io.StringWriter s = new java.io.StringWriter();
        for (java.lang.StackTraceElement traceElement : stackTrace)
            s.append("\tat ").append(java.lang.String.valueOf(traceElement)).append("\n");

        return s.toString();
    }

    /**
     * Indicates that a value should be present in an empty {@link io.vavr.control.Try}.
     *
     * @return a error message factory.
     * @throws java.lang.NullPointerException
     * 		if Try is null.
     */
    static org.assertj.vavr.api.TryShouldBeSuccess shouldBeSuccess(java.lang.Class<? extends java.lang.Throwable> clazz, java.lang.String message, java.lang.StackTraceElement[] stackTrace) {
        return new org.assertj.vavr.api.TryShouldBeSuccess(clazz, message, stackTrace);
    }
}
