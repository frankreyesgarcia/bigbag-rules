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
import io.vavr.collection.*;
import io.vavr.control.Either;
import io.vavr.control.Option;
import io.vavr.control.Try;
import io.vavr.control.Validation;
import org.assertj.core.util.CheckReturnValue;
/**
 * Entry point for assertion methods for different Vavr types. Each method in this class is a static factory for a
 * type-specific assertion object.
 *
 * @author Grzegorz Piwowarek
 */
@org.assertj.core.util.CheckReturnValue
public final class VavrAssertions {
    private VavrAssertions() {
    }

    /**
     * Creates assertion for {@link io.vavr.control.Either}.
     *
     * @param <LEFT>
     * 		the type of a value contained on left by <code>actual {@link Either}</code>.
     * @param <RIGHT>
     * 		the type of a value contained on right by <code>actual {@link Either}</code>.
     * @param actual
     * 		the actual value.
     * @return the created assertion object.
     */
    @org.assertj.core.util.CheckReturnValue
    public static <LEFT, RIGHT> org.assertj.vavr.api.EitherAssert<LEFT, RIGHT> assertThat(io.vavr.control.Either<LEFT, RIGHT> actual) {
        return new org.assertj.vavr.api.EitherAssert<>(actual);
    }

    /**
     * Creates assertion for {@link Lazy}.
     *
     * @param <VALUE>
     * 		the type of a value contained by <code>actual {@link Lazy}</code>.
     * @param actual
     * 		the actual value.
     * @return the created assertion object.
     */
    @org.assertj.core.util.CheckReturnValue
    public static <VALUE> org.assertj.vavr.api.LazyAssert<VALUE> assertThat(io.vavr.Lazy<VALUE> actual) {
        return new org.assertj.vavr.api.LazyAssert<>(actual);
    }

    /**
     * Creates assertion for {@link io.vavr.control.Option}.
     *
     * @param <VALUE>
     * 		the type of a value contained by <code>actual {@link Option}</code>.
     * @param actual
     * 		the actual value.
     * @return the created assertion object.
     */
    @org.assertj.core.util.CheckReturnValue
    public static <VALUE> org.assertj.vavr.api.OptionAssert<VALUE> assertThat(io.vavr.control.Option<VALUE> actual) {
        return new org.assertj.vavr.api.OptionAssert<>(actual);
    }

    /**
     * Creates assertion for {@link io.vavr.control.Try}.
     *
     * @param <VALUE>
     * 		the type of a value contained by <code>actual {@link Try}</code>.
     * @param actual
     * 		the actual value.
     * @return the created assertion object.
     */
    @org.assertj.core.util.CheckReturnValue
    public static <VALUE> org.assertj.vavr.api.TryAssert<VALUE> assertThat(io.vavr.control.Try<VALUE> actual) {
        return new org.assertj.vavr.api.TryAssert<>(actual);
    }

    /**
     * Creates assertion for {@link io.vavr.collection.List}.
     *
     * @param <VALUE>
     * 		the type of elements contained by <code>actual {@link List}</code>.
     * @param actual
     * 		the actual value.
     * @return the created assertion object.
     */
    @org.assertj.core.util.CheckReturnValue
    public static <VALUE> org.assertj.vavr.api.SeqAssert<VALUE> assertThat(Seq<VALUE> actual) {
        return new org.assertj.vavr.api.SeqAssert<>(actual);
    }

    /**
     * Creates assertion for {@link io.vavr.control.Validation}.
     *
     * @param <INVALID>
     * 		type of the value in the case of the invalid {@link Validation}.
     * @param <VALID>
     * 		type of the value in the case of the valid {@link Validation}.
     * @param actual
     * 		the actual value.
     * @return the created assertion object.
     */
    @org.assertj.core.util.CheckReturnValue
    public static <INVALID, VALID> org.assertj.vavr.api.ValidationAssert<INVALID, VALID> assertThat(io.vavr.control.Validation<INVALID, VALID> actual) {
        return new org.assertj.vavr.api.ValidationAssert<>(actual);
    }

    /**
     * Creates assertion for {@link io.vavr.collection.Set}.
     *
     * @param <VALUE>
     * 		the type of elements contained by <code> actual {@link Set}</code>.
     * @param actual
     * 		the actual value.
     * @return the created assertion object.
     */
    @org.assertj.core.util.CheckReturnValue
    public static <VALUE> org.assertj.vavr.api.SetAssert<VALUE> assertThat(Set<VALUE> actual) {
        return new org.assertj.vavr.api.SetAssert<>(actual);
    }

    /**
     * Creates assertion for {@link io.vavr.collection.Map}.
     *
     * @param <KEY>
     * 		key type of the {@link Map}.
     * @param <VALUE>
     * 		value type of the {@link Map}.
     * @param actual
     * 		the actual value.
     * @return the created assertion object.
     */
    @org.assertj.core.util.CheckReturnValue
    public static <KEY, VALUE> org.assertj.vavr.api.MapAssert<KEY, VALUE> assertThat(Map<KEY, VALUE> actual) {
        return new org.assertj.vavr.api.MapAssert<>(actual);
    }

    /**
     * Creates assertion for {@link io.vavr.collection.Multimap}.
     *
     * @param <KEY>
     * 		key type of the {@link Multimap}.
     * @param <VALUE>
     * 		value type of the {@link Multimap}.
     * @param actual
     * 		the actual value.
     * @return the created assertion object.
     */
    @org.assertj.core.util.CheckReturnValue
    public static <KEY, VALUE> org.assertj.vavr.api.MultimapAssert<KEY, VALUE> assertThat(Multimap<KEY, VALUE> actual) {
        return new org.assertj.vavr.api.MultimapAssert<>(actual);
    }
}
