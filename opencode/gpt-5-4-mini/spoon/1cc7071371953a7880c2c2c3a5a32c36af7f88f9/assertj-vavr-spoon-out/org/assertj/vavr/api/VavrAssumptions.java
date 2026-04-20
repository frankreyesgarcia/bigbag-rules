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
import io.vavr.collection.Map;
import io.vavr.collection.Multimap;
import io.vavr.collection.Seq;
import io.vavr.collection.Set;
import io.vavr.control.Either;
import io.vavr.control.Option;
import io.vavr.control.Try;
import io.vavr.control.Validation;
import org.assertj.core.internal.bytebuddy.ByteBuddy;
import org.assertj.core.internal.bytebuddy.TypeCache;
import org.assertj.core.internal.bytebuddy.TypeCache.SimpleKey;
import org.assertj.core.internal.bytebuddy.dynamic.scaffold.TypeValidation;
import org.assertj.core.internal.bytebuddy.implementation.Implementation;
import org.assertj.core.internal.bytebuddy.implementation.MethodDelegation;
import org.assertj.core.internal.bytebuddy.implementation.auxiliary.AuxiliaryType;
import org.assertj.core.internal.bytebuddy.implementation.bind.annotation.RuntimeType;
import org.assertj.core.internal.bytebuddy.implementation.bind.annotation.SuperCall;
import org.assertj.core.internal.bytebuddy.implementation.bind.annotation.This;
import org.assertj.core.util.CheckReturnValue;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.any;
import static org.assertj.core.util.Arrays.array;
public class VavrAssumptions {
    /**
     * This NamingStrategy takes the original class's name and adds a suffix to distinguish it.
     * The default is ByteBuddy but for debugging purposes, it makes sense to add AssertJ as a name.
     */
    private static final net.bytebuddy.ByteBuddy BYTE_BUDDY = new net.bytebuddy.ByteBuddy().with(net.bytebuddy.dynamic.scaffold.TypeValidation.DISABLED).with(new net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy.SuffixingRandom("Assertj$Assumptions"));

    private static final net.bytebuddy.implementation.Implementation ASSUMPTION = net.bytebuddy.implementation.MethodDelegation.to(org.assertj.vavr.api.VavrAssumptions.AssumptionMethodInterceptor.class);

    private static final net.bytebuddy.TypeCache CACHE = new net.bytebuddy.TypeCache.WithInlineExpunction<>(TypeCache.Sort.SOFT);

    private static final class AssumptionMethodInterceptor {
        @net.bytebuddy.implementation.bind.annotation.RuntimeType
        public static java.lang.Object intercept(@net.bytebuddy.implementation.bind.annotation.This
        org.assertj.vavr.api.AbstractVavrAssert<?, ?> assertion, @net.bytebuddy.implementation.bind.annotation.SuperCall
        java.util.concurrent.Callable<java.lang.Object> proxy) throws java.lang.Exception {
            try {
                java.lang.Object result = proxy.call();
                if ((result != assertion) && (result instanceof org.assertj.vavr.api.AbstractVavrAssert)) {
                    final org.assertj.vavr.api.AbstractVavrAssert<?, ?> assumption = org.assertj.vavr.api.VavrAssumptions.asAssumption(((org.assertj.vavr.api.AbstractVavrAssert<?, ?>) (result)));
                    return assumption.withAssertionState(assertion);
                }
                return result;
            } catch (java.lang.AssertionError e) {
                throw org.assertj.vavr.api.VavrAssumptions.assumptionNotMet(e);
            }
        }
    }

    /**
     * Creates a new instance of <code>{@link EitherAssert}</code> assumption.
     *
     * @param <LEFT>
     * 		type of the left value contained in the {@link Either}.
     * @param <RIGHT>
     * 		type of the right value contained in the {@link Either}.
     * @param actual
     * 		the actual value.
     * @return the created assumption for assertion object.
     */
    @org.assertj.core.util.CheckReturnValue
    @java.lang.SuppressWarnings("unchecked")
    public static <LEFT, RIGHT> org.assertj.vavr.api.EitherAssert<LEFT, RIGHT> assumeThat(io.vavr.control.Either<LEFT, RIGHT> actual) {
        return org.assertj.vavr.api.VavrAssumptions.asAssumption(org.assertj.vavr.api.EitherAssert.class, io.vavr.control.Either.class, actual);
    }

    /**
     * Creates a new instance of <code>{@link LazyAssert}</code> assumption.
     *
     * @param <VALUE>
     * 		type of the value contained in the {@link Lazy}.
     * @param actual
     * 		the actual value.
     * @return the created assumption for assertion object.
     */
    @org.assertj.core.util.CheckReturnValue
    @java.lang.SuppressWarnings("unchecked")
    public static <VALUE> org.assertj.vavr.api.LazyAssert<VALUE> assumeThat(io.vavr.Lazy<VALUE> actual) {
        return org.assertj.vavr.api.VavrAssumptions.asAssumption(org.assertj.vavr.api.LazyAssert.class, io.vavr.Lazy.class, actual);
    }

    /**
     * Creates a new instance of <code>{@link MapAssert}</code> assumption.
     *
     * @param <K>
     * 		the type of keys in the map.
     * @param <V>
     * 		the type of values in the map.
     * @param actual
     * 		the actual value.
     * @return the created assumption for assertion object.
     */
    @org.assertj.core.util.CheckReturnValue
    @java.lang.SuppressWarnings("unchecked")
    public static <K, V> org.assertj.vavr.api.MapAssert<K, V> assumeThat(io.vavr.collection.Map<K, V> actual) {
        return org.assertj.vavr.api.VavrAssumptions.asAssumption(org.assertj.vavr.api.MapAssert.class, io.vavr.collection.Map.class, actual);
    }

    /**
     * Creates a new instance of <code>{@link MultimapAssert}</code> assumption.
     *
     * @param <K>
     * 		the type of keys in the multimap.
     * @param <V>
     * 		the type of values in the multimap.
     * @param actual
     * 		the actual value.
     * @return the created assumption for assertion object.
     */
    @org.assertj.core.util.CheckReturnValue
    @java.lang.SuppressWarnings("unchecked")
    public static <K, V> org.assertj.vavr.api.MultimapAssert<K, V> assumeThat(io.vavr.collection.Multimap<K, V> actual) {
        return org.assertj.vavr.api.VavrAssumptions.asAssumption(org.assertj.vavr.api.MultimapAssert.class, io.vavr.collection.Multimap.class, actual);
    }

    /**
     * Creates a new instance of <code>{@link OptionAssert}</code> assumption.
     *
     * @param <VALUE>
     * 		type of the value contained in the {@link Option}.
     * @param actual
     * 		the actual value.
     * @return the created assumption for assertion object.
     */
    @org.assertj.core.util.CheckReturnValue
    @java.lang.SuppressWarnings("unchecked")
    public static <VALUE> org.assertj.vavr.api.OptionAssert<VALUE> assumeThat(io.vavr.control.Option<VALUE> actual) {
        return org.assertj.vavr.api.VavrAssumptions.asAssumption(org.assertj.vavr.api.OptionAssert.class, io.vavr.control.Option.class, actual);
    }

    /**
     * Creates a new instance of <code>{@link SetAssert}</code> assumption.
     *
     * @param <ELEMENT>
     * 		type of elements contained in the {@link Set}.
     * @param actual
     * 		the actual value.
     * @return the created assumption for assertion object.
     */
    @org.assertj.core.util.CheckReturnValue
    @java.lang.SuppressWarnings("unchecked")
    public static <ELEMENT> org.assertj.vavr.api.SetAssert<ELEMENT> assumeThat(io.vavr.collection.Set<ELEMENT> actual) {
        return org.assertj.vavr.api.VavrAssumptions.asAssumption(org.assertj.vavr.api.SetAssert.class, io.vavr.collection.Set.class, actual);
    }

    /**
     * Creates a new instance of <code>{@link SeqAssert}</code> assumption.
     *
     * @param <ELEMENT>
     * 		type of elements contained in the {@link Seq}.
     * @param actual
     * 		the actual value.
     * @return the created assumption for assertion object.
     */
    @org.assertj.core.util.CheckReturnValue
    @java.lang.SuppressWarnings("unchecked")
    public static <ELEMENT> org.assertj.vavr.api.SeqAssert<ELEMENT> assumeThat(io.vavr.collection.Seq<ELEMENT> actual) {
        return org.assertj.vavr.api.VavrAssumptions.asAssumption(org.assertj.vavr.api.SeqAssert.class, io.vavr.collection.Seq.class, actual);
    }

    /**
     * Creates a new instance of <code>{@link TryAssert}</code> assumption.
     *
     * @param <VALUE>
     * 		type of the value contained in the {@link io.vavr.control.Try}.
     * @param actual
     * 		the actual value.
     * @return the created assumption for assertion object.
     */
    @org.assertj.core.util.CheckReturnValue
    @java.lang.SuppressWarnings("unchecked")
    public static <VALUE> org.assertj.vavr.api.TryAssert<VALUE> assumeThat(io.vavr.control.Try<VALUE> actual) {
        return org.assertj.vavr.api.VavrAssumptions.asAssumption(org.assertj.vavr.api.TryAssert.class, io.vavr.control.Try.class, actual);
    }

    /**
     * Creates a new instance of <code>{@link ValidationAssert}</code> assumption.
     *
     * @param <INVALID>
     * 		type of the value in the case of the invalid {@link Validation}.
     * @param <VALID>
     * 		type of the value in the case of the valid {@link Validation}.
     * @param actual
     * 		the actual value.
     * @return the created assumption for assertion object.
     */
    @org.assertj.core.util.CheckReturnValue
    @java.lang.SuppressWarnings("unchecked")
    public static <INVALID, VALID> org.assertj.vavr.api.ValidationAssert<INVALID, VALID> assumeThat(io.vavr.control.Validation<INVALID, VALID> actual) {
        return org.assertj.vavr.api.VavrAssumptions.asAssumption(org.assertj.vavr.api.ValidationAssert.class, io.vavr.control.Validation.class, actual);
    }

    private static <ASSERTION, ACTUAL> ASSERTION asAssumption(java.lang.Class<ASSERTION> assertionType, java.lang.Class<ACTUAL> actualType, java.lang.Object actual) {
        return org.assertj.vavr.api.VavrAssumptions.asAssumption(assertionType, org.assertj.core.util.Arrays.array(actualType), org.assertj.core.util.Arrays.array(actual));
    }

    private static <ASSERTION> ASSERTION asAssumption(java.lang.Class<ASSERTION> assertionType, java.lang.Class<?>[] constructorTypes, java.lang.Object... constructorParams) {
        try {
            java.lang.Class<? extends ASSERTION> type = org.assertj.vavr.api.VavrAssumptions.createAssumptionClass(assertionType);
            java.lang.reflect.Constructor<? extends ASSERTION> constructor = type.getConstructor(constructorTypes);
            return constructor.newInstance(constructorParams);
        } catch (java.lang.NoSuchMethodException | java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException | java.lang.InstantiationException e) {
            throw new java.lang.RuntimeException("Cannot create assumption instance", e);
        }
    }

    @java.lang.SuppressWarnings("unchecked")
    private static <ASSERTION> java.lang.Class<? extends ASSERTION> createAssumptionClass(java.lang.Class<ASSERTION> assertClass) {
        net.bytebuddy.TypeCache.SimpleKey cacheKey = new net.bytebuddy.TypeCache.SimpleKey(assertClass);
        return ((java.lang.Class<ASSERTION>) (org.assertj.vavr.api.VavrAssumptions.CACHE.findOrInsert(org.assertj.vavr.api.VavrAssumptions.class.getClassLoader(), cacheKey, () -> generateAssumptionClass(assertClass))));
    }

    private static <ASSERTION> java.lang.Class<? extends ASSERTION> generateAssumptionClass(java.lang.Class<ASSERTION> assertionType) {
        return org.assertj.vavr.api.VavrAssumptions.BYTE_BUDDY.subclass(assertionType).method(net.bytebuddy.matcher.ElementMatchers.any()).intercept(org.assertj.vavr.api.VavrAssumptions.ASSUMPTION).make().load(org.assertj.vavr.api.VavrAssumptions.class.getClassLoader(), org.assertj.vavr.api.ClassLoadingStrategyFactory.classLoadingStrategy(assertionType)).getLoaded();
    }

    private static java.lang.RuntimeException assumptionNotMet(java.lang.AssertionError assertionError) throws java.lang.ReflectiveOperationException {
        java.lang.Class<?> assumptionClass = org.assertj.vavr.api.VavrAssumptions.getAssumptionClass("org.junit.AssumptionViolatedException");
        if (assumptionClass != null)
            return org.assertj.vavr.api.VavrAssumptions.assumptionNotMet(assumptionClass, assertionError);

        assumptionClass = org.assertj.vavr.api.VavrAssumptions.getAssumptionClass("org.opentest4j.TestAbortedException");
        if (assumptionClass != null)
            return org.assertj.vavr.api.VavrAssumptions.assumptionNotMet(assumptionClass, assertionError);

        assumptionClass = org.assertj.vavr.api.VavrAssumptions.getAssumptionClass("org.testng.SkipException");
        if (assumptionClass != null)
            return org.assertj.vavr.api.VavrAssumptions.assumptionNotMet(assumptionClass, assertionError);

        throw new java.lang.IllegalStateException("Assumptions require JUnit, opentest4j or TestNG on the classpath");
    }

    private static java.lang.Class<?> getAssumptionClass(java.lang.String className) {
        try {
            return java.lang.Class.forName(className);
        } catch (java.lang.ClassNotFoundException e) {
            return null;
        }
    }

    private static java.lang.RuntimeException assumptionNotMet(java.lang.Class<?> exceptionClass, java.lang.AssertionError e) throws java.lang.ReflectiveOperationException {
        return ((java.lang.RuntimeException) (exceptionClass.getConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance("assumption was not met due to: " + e.getMessage(), e)));
    }

    // for method that change the object under test (e.g. extracting)
    private static org.assertj.vavr.api.AbstractVavrAssert<?, ?> asAssumption(org.assertj.vavr.api.AbstractVavrAssert<?, ?> assertion) {
        // @format:off
        java.lang.Object actual = assertion.actual();
        if (assertion instanceof org.assertj.vavr.api.LazyAssert)
            return org.assertj.vavr.api.VavrAssumptions.asAssumption(org.assertj.vavr.api.LazyAssert.class, io.vavr.Lazy.class, actual);

        if (assertion instanceof org.assertj.vavr.api.EitherAssert)
            return org.assertj.vavr.api.VavrAssumptions.asAssumption(org.assertj.vavr.api.EitherAssert.class, io.vavr.control.Either.class, actual);

        if (assertion instanceof org.assertj.vavr.api.MapAssert)
            return org.assertj.vavr.api.VavrAssumptions.asAssumption(org.assertj.vavr.api.MapAssert.class, io.vavr.collection.Map.class, actual);

        if (assertion instanceof org.assertj.vavr.api.OptionAssert)
            return org.assertj.vavr.api.VavrAssumptions.asAssumption(org.assertj.vavr.api.OptionAssert.class, io.vavr.control.Option.class, actual);

        if (assertion instanceof org.assertj.vavr.api.SeqAssert)
            return org.assertj.vavr.api.VavrAssumptions.asAssumption(org.assertj.vavr.api.SeqAssert.class, io.vavr.collection.Seq.class, actual);

        if (assertion instanceof org.assertj.vavr.api.TryAssert)
            return org.assertj.vavr.api.VavrAssumptions.asAssumption(org.assertj.vavr.api.TryAssert.class, io.vavr.control.Try.class, actual);

        if (assertion instanceof org.assertj.vavr.api.ValidationAssert)
            return org.assertj.vavr.api.VavrAssumptions.asAssumption(org.assertj.vavr.api.ValidationAssert.class, io.vavr.control.Validation.class, actual);

        // @format:on
        // should not arrive here
        throw new java.lang.IllegalArgumentException("Unsupported assumption creation for " + assertion.getClass());
    }
}
