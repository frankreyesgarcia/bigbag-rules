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
import com.pholser.junit.quickcheck.test.generator.ABox;
import com.pholser.junit.quickcheck.test.generator.AFoo;
import com.pholser.junit.quickcheck.test.generator.AFoo.Same;
import com.pholser.junit.quickcheck.test.generator.AnotherBox;
import com.pholser.junit.quickcheck.test.generator.Box;
import com.pholser.junit.quickcheck.test.generator.Foo;
import com.pholser.junit.quickcheck.test.generator.X;
import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.internal.ReflectionException;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.experimental.results.PrintableResult.testResult;
import static org.junit.experimental.results.ResultMatchers.hasSingleFailureContaining;
import static org.junit.experimental.results.ResultMatchers.isSuccessful;
public class ComposedObjectsTest {
    @Test
    public void askingForGeneratorsByType() {
        assertThat(testResult(ComposedObjectsTest.GeneratorsByType.class), isSuccessful());
    }

    @RunWith(JUnitQuickcheck.class)
    public static class GeneratorsByType {
        static class A {
            Foo foo;
        }

        public static class MakeA extends Generator<A> {
            public MakeA() {
                super(ComposedObjectsTest.GeneratorsByType.A.class);
            }

            @Override
            public A generate(SourceOfRandomness random, GenerationStatus status) {
                A a = new A();
                a.foo = gen().type(Foo.class).generate(random, status);
                return a;
            }
        }

        @Property
        public void holds(@From(ComposedObjectsTest.GeneratorsByType.MakeA.class)
        A a) {
        }
    }

    @Test
    public void askingForGeneratorsForIndividualFields() {
        assertThat(testResult(ComposedObjectsTest.IndividualFields.class), isSuccessful());
    }

    @RunWith(JUnitQuickcheck.class)
    public static class IndividualFields {
        static class A {
            @X
            Foo foo;

            @X
            Box<@Same(3)
            Foo> boxOfFoo;
        }

        public static class MakeA extends Generator<ComposedObjectsTest.IndividualFields.A> {
            public MakeA() {
                super(ComposedObjectsTest.IndividualFields.A.class);
            }

            @SuppressWarnings("unchecked")
            @Override
            public ComposedObjectsTest.IndividualFields.A generate(SourceOfRandomness random, GenerationStatus status) {
                ComposedObjectsTest.IndividualFields.A a = new ComposedObjectsTest.IndividualFields.A();
                a.foo = ((Foo) (gen().field(ComposedObjectsTest.IndividualFields.A.class, "foo").generate(random, status)));
                a.boxOfFoo = ((Box<Foo>) (gen().field(ComposedObjectsTest.IndividualFields.A.class, "boxOfFoo").generate(random, status)));
                return a;
            }
        }

        @Property
        public void holds(@From(ComposedObjectsTest.IndividualFields.MakeA.class)
        ComposedObjectsTest.IndividualFields.A a) {
            assertTrue(a.foo.marked());
            assertTrue(a.boxOfFoo.marked());
            assertFalse(a.boxOfFoo.contents().marked());
            assertEquals(3, a.boxOfFoo.contents().i());
        }
    }

    @Test
    public void askingForGeneratorsForAllFieldsOfClassAtOnce() {
        assertThat(testResult(ComposedObjectsTest.AllFieldsAtOnce.class), isSuccessful());
    }

    @RunWith(JUnitQuickcheck.class)
    public static class AllFieldsAtOnce {
        public static class B {
            Foo foo;

            @From(ABox.class)
            Box<@X
            @From(AnotherBox.class)
            Box<@X
            Foo>> boxOfBoxOfFoo;
        }

        public static class A {
            B b;
        }

        public static class MakeA extends Generator<ComposedObjectsTest.AllFieldsAtOnce.A> {
            public MakeA() {
                super(ComposedObjectsTest.AllFieldsAtOnce.A.class);
            }

            @Override
            public ComposedObjectsTest.AllFieldsAtOnce.A generate(SourceOfRandomness random, GenerationStatus status) {
                ComposedObjectsTest.AllFieldsAtOnce.A a = new ComposedObjectsTest.AllFieldsAtOnce.A();
                a.b = gen().fieldsOf(ComposedObjectsTest.AllFieldsAtOnce.B.class).generate(random, status);
                return a;
            }
        }

        @Property
        public void holds(@From(ComposedObjectsTest.AllFieldsAtOnce.MakeA.class)
        ComposedObjectsTest.AllFieldsAtOnce.A a) {
            assertFalse(a.b.foo.marked());
            assertFalse(a.b.boxOfBoxOfFoo.marked());
            assertTrue(a.b.boxOfBoxOfFoo.contents().marked());
            assertTrue(a.b.boxOfBoxOfFoo.contents().contents().marked());
        }
    }

    @Test
    public void askingForGeneratorsByConstructor() {
        assertThat(testResult(ComposedObjectsTest.ByConstructor.class), isSuccessful());
    }

    @RunWith(JUnitQuickcheck.class)
    public static class ByConstructor {
        public static class B {
            final Foo foo;

            final Box<@X
            Box<@X
            Foo>> boxOfBoxOfFoo;

            public B(@Same(6)
            Foo foo, Box<@X
            Box<@X
            @Same(7)
            Foo>> boxOfBoxOfFoo) {
                this.foo = foo;
                this.boxOfBoxOfFoo = boxOfBoxOfFoo;
            }
        }

        public static class A {
            ComposedObjectsTest.ByConstructor.B b;
        }

        public static class MakeA extends Generator<ComposedObjectsTest.ByConstructor.A> {
            public MakeA() {
                super(ComposedObjectsTest.ByConstructor.A.class);
            }

            @Override
            public ComposedObjectsTest.ByConstructor.A generate(SourceOfRandomness random, GenerationStatus status) {
                ComposedObjectsTest.ByConstructor.A a = new ComposedObjectsTest.ByConstructor.A();
                a.b = gen().constructor(ComposedObjectsTest.ByConstructor.B.class, Foo.class, Box.class).generate(random, status);
                return a;
            }
        }

        @Property
        public void holds(@From(ComposedObjectsTest.ByConstructor.MakeA.class)
        ComposedObjectsTest.ByConstructor.A a) {
            assertFalse(a.b.foo.marked());
            assertFalse(a.b.boxOfBoxOfFoo.marked());
            assertTrue(a.b.boxOfBoxOfFoo.contents().marked());
            assertTrue(a.b.boxOfBoxOfFoo.contents().contents().marked());
        }
    }

    @Test
    public void askingForGeneratorsByUnrecognizedConstructor() {
        assertThat(testResult(ComposedObjectsTest.UnrecognizedConstructor.class), hasSingleFailureContaining(ReflectionException.class.getName()));
    }

    @RunWith(JUnitQuickcheck.class)
    public static class UnrecognizedConstructor {
        public static class B {
            final Foo foo;

            final Box<@X
            Box<@X
            Foo>> boxOfBoxOfFoo;

            public B(@Same(6)
            Foo foo, Box<@X
            Box<@X
            @Same(7)
            Foo>> boxOfBoxOfFoo) {
                this.foo = foo;
                this.boxOfBoxOfFoo = boxOfBoxOfFoo;
            }
        }

        public static class A {
            ComposedObjectsTest.UnrecognizedConstructor.B b;
        }

        public static class MakeA extends Generator<ComposedObjectsTest.UnrecognizedConstructor.A> {
            public MakeA() {
                super(ComposedObjectsTest.UnrecognizedConstructor.A.class);
            }

            @Override
            public ComposedObjectsTest.UnrecognizedConstructor.A generate(SourceOfRandomness random, GenerationStatus status) {
                ComposedObjectsTest.UnrecognizedConstructor.A a = new ComposedObjectsTest.UnrecognizedConstructor.A();
                a.b = gen().constructor(ComposedObjectsTest.UnrecognizedConstructor.B.class, int.class).generate(random, status);
                return a;
            }
        }

        @Property
        public void holds(@From(ComposedObjectsTest.UnrecognizedConstructor.MakeA.class)
        ComposedObjectsTest.UnrecognizedConstructor.A a) {
        }
    }

    @Test
    public void askingForArrayGenerator() {
        assertThat(testResult(ComposedObjectsTest.AskingForArrayGenerator.class), isSuccessful());
    }

    @RunWith(JUnitQuickcheck.class)
    public static class AskingForArrayGenerator {
        static class A {
            Foo[][] foos;
        }

        public static class MakeA extends Generator<ComposedObjectsTest.AskingForArrayGenerator.A> {
            public MakeA() {
                super(ComposedObjectsTest.AskingForArrayGenerator.A.class);
            }

            @Override
            public ComposedObjectsTest.AskingForArrayGenerator.A generate(SourceOfRandomness random, GenerationStatus status) {
                ComposedObjectsTest.AskingForArrayGenerator.A a = new ComposedObjectsTest.AskingForArrayGenerator.A();
                a.foos = gen().type(Foo[][].class).generate(random, status);
                return a;
            }
        }

        @Property
        public void holds(@From(ComposedObjectsTest.AskingForArrayGenerator.MakeA.class)
        ComposedObjectsTest.AskingForArrayGenerator.A a) {
        }
    }

    @Test
    public void askingForRawComponentizedType() {
        assertThat(testResult(ComposedObjectsTest.RawComponentizedType.class), isSuccessful());
    }

    @RunWith(JUnitQuickcheck.class)
    public static class RawComponentizedType {
        static class A {
            Box b;
        }

        public static class MakeA extends Generator<ComposedObjectsTest.RawComponentizedType.A> {
            public MakeA() {
                super(ComposedObjectsTest.RawComponentizedType.A.class);
            }

            @Override
            public ComposedObjectsTest.RawComponentizedType.A generate(SourceOfRandomness random, GenerationStatus status) {
                ComposedObjectsTest.RawComponentizedType.A a = new ComposedObjectsTest.RawComponentizedType.A();
                a.b = gen().type(Box.class, Object.class).generate(random, status);
                return a;
            }
        }

        @Property
        public void holds(@From(ComposedObjectsTest.RawComponentizedType.MakeA.class)
        ComposedObjectsTest.RawComponentizedType.A a) {
        }
    }

    @Test
    public void askingForArrayOfRawComponentizedType() {
        assertThat(testResult(ComposedObjectsTest.ArrayOfRawComponentizedType.class), isSuccessful());
    }

    @RunWith(JUnitQuickcheck.class)
    public static class ArrayOfRawComponentizedType {
        static class A {
            Box[] b;
        }

        public static class MakeA extends Generator<ComposedObjectsTest.ArrayOfRawComponentizedType.A> {
            public MakeA() {
                super(ComposedObjectsTest.ArrayOfRawComponentizedType.A.class);
            }

            @Override
            public ComposedObjectsTest.ArrayOfRawComponentizedType.A generate(SourceOfRandomness random, GenerationStatus status) {
                ComposedObjectsTest.ArrayOfRawComponentizedType.A a = new ComposedObjectsTest.ArrayOfRawComponentizedType.A();
                a.b = gen().type(Box[].class).generate(random, status);
                return a;
            }
        }

        @Property
        public void holds(@From(ComposedObjectsTest.ArrayOfRawComponentizedType.MakeA.class)
        ComposedObjectsTest.ArrayOfRawComponentizedType.A a) {
        }
    }

    @Test
    public void askingForParameterizedComponentizedType() {
        assertThat(testResult(ComposedObjectsTest.ParameterizedComponentizedType.class), isSuccessful());
    }

    @RunWith(JUnitQuickcheck.class)
    public static class ParameterizedComponentizedType {
        static class A {
            Box<Foo> b;
        }

        public static class MakeA extends Generator<ComposedObjectsTest.ParameterizedComponentizedType.A> {
            public MakeA() {
                super(ComposedObjectsTest.ParameterizedComponentizedType.A.class);
            }

            @SuppressWarnings("unchecked")
            @Override
            public ComposedObjectsTest.ParameterizedComponentizedType.A generate(SourceOfRandomness random, GenerationStatus status) {
                ComposedObjectsTest.ParameterizedComponentizedType.A a = new ComposedObjectsTest.ParameterizedComponentizedType.A();
                a.b = gen().type(Box.class, Foo.class).generate(random, status);
                return a;
            }
        }

        @Property
        public void holds(@From(ComposedObjectsTest.ParameterizedComponentizedType.MakeA.class)
        ComposedObjectsTest.ParameterizedComponentizedType.A a) {
        }
    }

    @Test
    public void askingToMakeASpecificKindOfGenerator() {
        assertThat(testResult(ComposedObjectsTest.SpecificGenerator.class), isSuccessful());
    }

    @RunWith(JUnitQuickcheck.class)
    public static class SpecificGenerator {
        @X
        public static class AnXBox extends ABox {}

        static class A {
            Box<Foo> boxOfFoos;
        }

        public static class MakeA extends Generator<ComposedObjectsTest.SpecificGenerator.A> {
            public MakeA() {
                super(ComposedObjectsTest.SpecificGenerator.A.class);
            }

            @SuppressWarnings("unchecked")
            @Override
            public ComposedObjectsTest.SpecificGenerator.A generate(SourceOfRandomness random, GenerationStatus status) {
                ComposedObjectsTest.SpecificGenerator.A a = new ComposedObjectsTest.SpecificGenerator.A();
                AnXBox make = gen().make(ComposedObjectsTest.SpecificGenerator.AnXBox.class, gen().type(Foo.class));
                a.boxOfFoos = ((Box<Foo>) (make.generate(random, status)));
                return a;
            }
        }

        @Property
        public void holds(@From(ComposedObjectsTest.SpecificGenerator.MakeA.class)
        ComposedObjectsTest.SpecificGenerator.A a) {
            assertTrue(a.boxOfFoos.marked());
        }
    }

    @Test
    public void specificKindOfGeneratorWithMissingComponents() {
        assertThat(testResult(ComposedObjectsTest.SpecificGeneratorWithMissingComponents.class), hasSingleFailureContaining("IllegalArgumentException: Needed 1 components"));
    }

    @RunWith(JUnitQuickcheck.class)
    public static class SpecificGeneratorWithMissingComponents {
        @X
        public static class AnXBox extends ABox {}

        static class A {
            Box<Foo> boxOfFoos;
        }

        public static class MakeA extends Generator<ComposedObjectsTest.SpecificGeneratorWithMissingComponents.A> {
            public MakeA() {
                super(ComposedObjectsTest.SpecificGeneratorWithMissingComponents.A.class);
            }

            @SuppressWarnings("unchecked")
            @Override
            public ComposedObjectsTest.SpecificGeneratorWithMissingComponents.A generate(SourceOfRandomness random, GenerationStatus status) {
                ComposedObjectsTest.SpecificGeneratorWithMissingComponents.A a = new ComposedObjectsTest.SpecificGeneratorWithMissingComponents.A();
                ComposedObjectsTest.SpecificGeneratorWithMissingComponents.AnXBox make = gen().make(ComposedObjectsTest.SpecificGeneratorWithMissingComponents.AnXBox.class);
                a.boxOfFoos = ((Box<Foo>) (make.generate(random, status)));
                return a;
            }
        }

        @Property
        public void holds(@From(ComposedObjectsTest.SpecificGeneratorWithMissingComponents.MakeA.class)
        ComposedObjectsTest.SpecificGeneratorWithMissingComponents.A a) {
            assertTrue(a.boxOfFoos.marked());
        }
    }
}
