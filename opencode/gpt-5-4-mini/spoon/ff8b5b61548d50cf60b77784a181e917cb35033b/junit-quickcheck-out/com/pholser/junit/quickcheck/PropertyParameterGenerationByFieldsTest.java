/* The MIT License

Copyright (c) 2010-2021 Paul R. Holser, Jr.

Permission is hereby granted, free of charge, to any person obtaining
a copy of this software and associated documentation files (the
"Software"), to deal in the Software without restriction, including
without limitation the rights to use, copy, modify, merge, publish,
distribute, sublicense, and/or sell copies of the Software, and to
permit persons to whom the Software is furnished to do so, subject to
the following conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.pholser.junit.quickcheck;
import com.pholser.junit.quickcheck.test.generator.AFoo;
import com.pholser.junit.quickcheck.test.generator.AFoo.Same;
import com.pholser.junit.quickcheck.test.generator.AnInt;
import com.pholser.junit.quickcheck.test.generator.Between;
import com.pholser.junit.quickcheck.test.generator.Box;
import com.pholser.junit.quickcheck.test.generator.Foo;
import com.pholser.junit.quickcheck.test.generator.X;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import com.pholser.junit.quickcheck.generator.Fields;
import com.pholser.junit.quickcheck.internal.ReflectionException;
import com.pholser.junit.quickcheck.internal.Zilch;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.Test;
import org.junit.experimental.results.PrintableResult;
import org.junit.runner.RunWith;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.experimental.results.PrintableResult.testResult;
import static org.junit.experimental.results.ResultMatchers.hasSingleFailureContaining;
import static org.junit.experimental.results.ResultMatchers.isSuccessful;
public class PropertyParameterGenerationByFieldsTest {
    @Test
    public void autoGeneration() {
        assertThat(testResult(PropertyParameterGenerationByFieldsTest.AutoGeneration.class), isSuccessful());
    }

    @RunWith(JUnitQuickcheck.class)
    public static class AutoGeneration {
        public static class P {
            public Zilch z;

            public Foo f;

            public Box<Foo> b;
        }

        @Property
        public void shouldHold(@From(Fields.class)
        P p) {
        }
    }

    @Test
    public void autoGenerationOnGenericType() {
        assertThat(testResult(PropertyParameterGenerationByFieldsTest.AutoGenerationOnGenericType.class), isSuccessful());
    }

    @RunWith(JUnitQuickcheck.class)
    public static class AutoGenerationOnGenericType {
        @Property
        public void shouldHold(@From(Fields.class)
        FakeList<Foo> list) {
        }
    }

    public static class FakeList<T> {}

    @Test
    public void autoGenerationOnPrimitiveType() {
        PrintableResult result = testResult(PropertyParameterGenerationByFieldsTest.AutoGenerationOnPrimitiveType.class);
        assertThat(result, hasSingleFailureContaining(ReflectionException.class.getName()));
        assertThat(result, hasSingleFailureContaining(InstantiationException.class.getName()));
    }

    @RunWith(JUnitQuickcheck.class)
    public static class AutoGenerationOnPrimitiveType {
        @Property
        public void shouldHold(@From(Fields.class)
        int i) {
        }
    }

    @Test
    public void autoGenerationOnPrimitiveWrapperType() {
        PrintableResult result = testResult(PropertyParameterGenerationByFieldsTest.AutoGenerationOnPrimitiveWrapperType.class);
        assertThat(result, hasSingleFailureContaining(ReflectionException.class.getName()));
        assertThat(result, hasSingleFailureContaining(InstantiationException.class.getName()));
    }

    @RunWith(JUnitQuickcheck.class)
    public static class AutoGenerationOnPrimitiveWrapperType {
        @Property
        public void shouldHold(@From(Fields.class)
        Float f) {
        }
    }

    @Test
    public void autoGenerationWithAnnotations() {
        assertThat(testResult(PropertyParameterGenerationByFieldsTest.AutoGenerationWithAnnotations.class), isSuccessful());
    }

    @RunWith(JUnitQuickcheck.class)
    public static class AutoGenerationWithAnnotations {
        public static class P {
            @From(AnInt.class)
            @Between(min = 2, max = 4)
            public int i;
        }

        @Property
        public void shouldHold(@From(Fields.class)
        PropertyParameterGenerationByFieldsTest.AutoGenerationWithAnnotations.P p) {
            assertThat(p.i, allOf(greaterThanOrEqualTo(2), lessThanOrEqualTo(4)));
        }
    }

    @Test
    public void autoGenerationWithAggregateAnnotation() {
        assertThat(testResult(PropertyParameterGenerationByFieldsTest.AutoGenerationWithAggregateAnnotations.class), isSuccessful());
    }

    @RunWith(JUnitQuickcheck.class)
    public static class AutoGenerationWithAggregateAnnotations {
        @Target({ PARAMETER, FIELD, ANNOTATION_TYPE, TYPE_USE })
        @Retention(RUNTIME)
        @From(AnInt.class)
        @Between(min = 1, max = 5)
        public @interface Small {}

        public static class P {
            @Small
            public int i;
        }

        @Property
        public void shouldHold(@From(Fields.class)
        PropertyParameterGenerationByFieldsTest.AutoGenerationWithAggregateAnnotations.P p) {
            assertThat(p.i, allOf(greaterThanOrEqualTo(1), lessThanOrEqualTo(5)));
        }
    }

    @Test
    public void autoGenerationWithAnnotationsOnTypeUsesInFields() {
        assertThat(testResult(PropertyParameterGenerationByFieldsTest.AutoGenerationWithAnnotationsOnTypeUsesInFields.class), isSuccessful());
    }

    @RunWith(JUnitQuickcheck.class)
    public static class AutoGenerationWithAnnotationsOnTypeUsesInFields {
        public static class P {
            public Box<@X
            Foo> box;
        }

        @Property
        public void shouldHold(@From(Fields.class)
        PropertyParameterGenerationByFieldsTest.AutoGenerationWithAnnotationsOnTypeUsesInFields.P p) {
            assertFalse(p.box.marked());
            assertTrue(p.box.contents().marked());
        }
    }

    @Test
    public void autoGenerationWithAggregateAnnotationsOnTypeUsesInFields() {
        assertThat(testResult(PropertyParameterGenerationByFieldsTest.AutoGenerationWithAggregateAnnotationsOnTypeUsesInFields.class), isSuccessful());
    }

    @RunWith(JUnitQuickcheck.class)
    public static class AutoGenerationWithAggregateAnnotationsOnTypeUsesInFields {
        @Target({ PARAMETER, FIELD, ANNOTATION_TYPE, TYPE_USE })
        @Retention(RUNTIME)
        @X
        @Same(2)
        public @interface MarkTwo {}

        public static class P {
            public Box<@MarkTwo
            Foo> box;
        }

        @Property
        public void shouldHold(@From(Fields.class)
        PropertyParameterGenerationByFieldsTest.AutoGenerationWithAggregateAnnotationsOnTypeUsesInFields.P p) {
            assertFalse(p.box.marked());
            assertTrue(p.box.contents().marked());
            assertEquals(2, p.box.contents().i());
        }
    }

    public static class Tuple3<A, B, C> {
        public A first;

        public B second;

        public C third;
    }

    @Test
    public void autoGenerationWithUnresolvedTypeVariablesInFields() {
        assertThat(testResult(PropertyParameterGenerationByFieldsTest.AutoGenerationWithUnresolvedTypeVariablesInFields.class), isSuccessful());
    }

    @RunWith(JUnitQuickcheck.class)
    public static class AutoGenerationWithUnresolvedTypeVariablesInFields<A, B, C> {
        @Property
        public void shouldHold(@From(Fields.class)
        Tuple3<A, B, C> t) {
        }
    }

    @Test
    public void autoGenerationWithFinalFields() {
        assertThat(testResult(PropertyParameterGenerationByFieldsTest.AutoGenerationWithFinalFields.class), isSuccessful());
    }

    @RunWith(JUnitQuickcheck.class)
    public static class AutoGenerationWithFinalFields {
        public static class Hamster {
            private static final Foo F = new Foo(12, false);
        }

        @Property
        public void holds(@From(Fields.class)
        Hamster h) {
        }
    }
}
