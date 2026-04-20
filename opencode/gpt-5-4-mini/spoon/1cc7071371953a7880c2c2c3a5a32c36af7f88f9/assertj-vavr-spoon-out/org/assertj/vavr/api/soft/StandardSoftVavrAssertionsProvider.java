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
import io.vavr.collection.Map;
import io.vavr.collection.Multimap;
import io.vavr.collection.Seq;
import io.vavr.collection.Set;
import io.vavr.control.Either;
import io.vavr.control.Option;
import io.vavr.control.Try;
import io.vavr.control.Validation;
import org.assertj.core.api.StandardSoftAssertionsProvider;
import org.assertj.core.util.CheckReturnValue;
public interface StandardSoftVavrAssertionsProvider extends org.assertj.core.api.StandardSoftAssertionsProvider {
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
    @java.lang.SuppressWarnings("unchecked")
    default <LEFT, RIGHT> org.assertj.vavr.api.EitherAssert<LEFT, RIGHT> assertThat(io.vavr.control.Either<LEFT, RIGHT> actual) {
        return proxy(org.assertj.vavr.api.EitherAssert.class, io.vavr.control.Either.class, actual);
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
    @java.lang.SuppressWarnings("unchecked")
    default <VALUE> org.assertj.vavr.api.LazyAssert<VALUE> assertThat(io.vavr.Lazy<VALUE> actual) {
        return proxy(org.assertj.vavr.api.LazyAssert.class, io.vavr.Lazy.class, actual);
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
    @java.lang.SuppressWarnings("unchecked")
    default <VALUE> org.assertj.vavr.api.OptionAssert<VALUE> assertThat(io.vavr.control.Option<VALUE> actual) {
        return proxy(org.assertj.vavr.api.OptionAssert.class, io.vavr.control.Option.class, actual);
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
    @java.lang.SuppressWarnings("unchecked")
    default <VALUE> org.assertj.vavr.api.TryAssert<VALUE> assertThat(io.vavr.control.Try<VALUE> actual) {
        return proxy(org.assertj.vavr.api.TryAssert.class, io.vavr.control.Try.class, actual);
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
    @java.lang.SuppressWarnings("unchecked")
    default <VALUE> org.assertj.vavr.api.SeqAssert<VALUE> assertThat(io.vavr.collection.Seq<VALUE> actual) {
        return proxy(org.assertj.vavr.api.SeqAssert.class, io.vavr.collection.Seq.class, actual);
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
    @java.lang.SuppressWarnings("unchecked")
    default <INVALID, VALID> org.assertj.vavr.api.ValidationAssert<INVALID, VALID> assertThat(io.vavr.control.Validation<INVALID, VALID> actual) {
        return proxy(org.assertj.vavr.api.ValidationAssert.class, io.vavr.control.Validation.class, actual);
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
    @java.lang.SuppressWarnings("unchecked")
    default <VALUE> org.assertj.vavr.api.SetAssert<VALUE> assertThat(io.vavr.collection.Set<VALUE> actual) {
        return proxy(org.assertj.vavr.api.SetAssert.class, io.vavr.collection.Set.class, actual);
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
    @java.lang.SuppressWarnings("unchecked")
    default <KEY, VALUE> org.assertj.vavr.api.MapAssert<KEY, VALUE> assertThat(io.vavr.collection.Map<KEY, VALUE> actual) {
        return proxy(org.assertj.vavr.api.MapAssert.class, io.vavr.collection.Map.class, actual);
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
    @java.lang.SuppressWarnings("unchecked")
    default <KEY, VALUE> org.assertj.vavr.api.MultimapAssert<KEY, VALUE> assertThat(io.vavr.collection.Multimap<KEY, VALUE> actual) {
        return proxy(org.assertj.vavr.api.MultimapAssert.class, io.vavr.collection.Multimap.class, actual);
    }
}
