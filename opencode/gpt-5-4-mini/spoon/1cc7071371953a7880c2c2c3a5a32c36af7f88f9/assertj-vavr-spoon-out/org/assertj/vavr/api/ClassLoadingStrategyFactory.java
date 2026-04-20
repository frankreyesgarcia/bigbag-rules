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
import org.assertj.core.internal.bytebuddy.dynamic.loading.ClassInjector;
import org.assertj.core.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy;
class ClassLoadingStrategyFactory {
    private static final java.lang.invoke.MethodHandles.Lookup LOOKUP = java.lang.invoke.MethodHandles.lookup();

    private static final java.lang.reflect.Method PRIVATE_LOOKUP_IN = io.vavr.control.Try.of(() -> java.lang.invoke.MethodHandles.class.getMethod("privateLookupIn", java.lang.Class.class, java.lang.invoke.MethodHandles.Lookup.class)).getOrElse(((java.lang.reflect.Method) (null)));

    static net.bytebuddy.dynamic.loading.ClassLoadingStrategy classLoadingStrategy(java.lang.Class<?> assertClass) {
        if (net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.isAvailable()) {
            return ClassLoadingStrategy.Default.INJECTION;
        } else if (net.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.isAvailable() && (org.assertj.vavr.api.ClassLoadingStrategyFactory.PRIVATE_LOOKUP_IN != null)) {
            try {
                return net.bytebuddy.dynamic.loading.ClassLoadingStrategy.UsingLookup.of(org.assertj.vavr.api.ClassLoadingStrategyFactory.PRIVATE_LOOKUP_IN.invoke(null, assertClass, org.assertj.vavr.api.ClassLoadingStrategyFactory.LOOKUP));
            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalStateException("Could not access package of " + assertClass, e);
            }
        } else {
            throw new java.lang.IllegalStateException("No code generation strategy available");
        }
    }
}
