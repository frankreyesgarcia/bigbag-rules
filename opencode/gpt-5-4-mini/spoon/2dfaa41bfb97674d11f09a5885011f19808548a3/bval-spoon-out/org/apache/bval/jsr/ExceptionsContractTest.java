/* Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.
 */
package org.apache.bval.jsr;
import jakarta.validation.ValidationException;
import jakarta.validation.Validator;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.metadata.BeanDescriptor;
import org.junit.Test;
/**
 * Several checks to validate that the implementations of {@link Validator} and
 * {@link BeanDescriptor} throw the correct exceptions as per the spec.
 *
 * @author Carlos Vara
 */
public class ExceptionsContractTest extends org.apache.bval.jsr.ValidationTestBase {
    /**
     * Checks that the correct exception is thrown when validating a bean whose
     * getter throws an exception.
     */
    @org.junit.Test(expected = jakarta.validation.ValidationException.class)
    public void testExceptionThrowingBean() {
        validator.validate(new org.apache.bval.jsr.ExceptionsContractTest.ExceptionThrowingBean());
    }

    /**
     * Checks that an {@link IllegalArgumentException} is thrown when passing
     * <code>null</code> as group array.
     */
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testValidateNullGroup() {
        validator.validate(new java.lang.String(), ((java.lang.Class<?>[]) (null)));
    }

    /**
     * Checks that an {@link IllegalArgumentException} is thrown when passing a
     * {@code null} property name.
     */
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testValidateNullPropertyName() {
        validator.validateProperty(new org.apache.bval.jsr.ExceptionsContractTest.Person(), null);
    }

    /**
     * Checks that an {@link IllegalArgumentException} is thrown when passing an
     * empty property name.
     */
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testValidateEmptyPropertyName() {
        validator.validateProperty(new org.apache.bval.jsr.ExceptionsContractTest.Person(), "");
    }

    /**
     * Checks that an {@link IllegalArgumentException} is thrown when passing an
     * invalid property name.
     */
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testValidateInvalidPropertyName() {
        validator.validateProperty(new org.apache.bval.jsr.ExceptionsContractTest.Person(), "surname");
    }

    /**
     * Checks that an {@link IllegalArgumentException} is thrown when trying to
     * validate a property on a null object.
     */
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testValidatePropertyOnNullBean() {
        validator.validateProperty(null, "class");
    }

    /**
     * Checks that an {@link IllegalArgumentException} is thrown when passing
     * <code>null</code> as group array in a
     * {@link Validator#validateProperty(Object, String, Class...)} call.
     */
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testValidatePropertyNullGroup() {
        validator.validateProperty(new org.apache.bval.jsr.ExceptionsContractTest.Person(), "name", ((java.lang.Class<?>[]) (null)));
    }

    /**
     * Checks that an {@link IllegalArgumentException} is thrown when calling
     * {@link Validator#validateValue(Class, String, Object, Class...)} with a
     * <code>null</code> class.
     */
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testValidateValueOnNullClass() {
        validator.validateValue(null, "class", java.lang.Object.class);
    }

    /**
     * Checks that an {@link IllegalArgumentException} is thrown when passing a
     * {@code null} property name to
     * {@link Validator#validateValue(Class, String, Object, Class...)}.
     */
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testValidateValueNullPropertyName() {
        validator.validateValue(org.apache.bval.jsr.ExceptionsContractTest.Person.class, null, "John");
    }

    /**
     * Checks that an {@link IllegalArgumentException} is thrown when passing an
     * empty property name to
     * {@link Validator#validateValue(Class, String, Object, Class...)}.
     */
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testValidateValueEmptyPropertyName() {
        validator.validateValue(org.apache.bval.jsr.ExceptionsContractTest.Person.class, "", "John");
    }

    /**
     * Checks that an {@link IllegalArgumentException} is thrown when passing an
     * invalid property name to
     * {@link Validator#validateValue(Class, String, Object, Class...)}.
     */
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testValidateValueInvalidPropertyName() {
        validator.validateValue(org.apache.bval.jsr.ExceptionsContractTest.Person.class, "unexistant", "John");
    }

    /**
     * Checks that an {@link IllegalArgumentException} is thrown when calling
     * {@link Validator#validateValue(Class, String, Object, Class...)} with a
     * <code>null</code> group array.
     */
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testValidateValueNullGroup() {
        validator.validateValue(org.apache.bval.jsr.ExceptionsContractTest.Person.class, "name", "John", ((java.lang.Class<?>[]) (null)));
    }

    /**
     * Enforces the "not a valid object property" part of the {@link IllegalArgumentException}
     * declaration on {@link Validator#validateValue(Class, String, Object, Class...)}
     */
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testValidateIncompatibleValue() {
        validator.validateValue(org.apache.bval.jsr.ExceptionsContractTest.Person.class, "name", 666);
    }

    /**
     * Enforces the "not a valid object property" part of the {@link IllegalArgumentException}
     * declaration on {@link Validator#validateValue(Class, String, Object, Class...)}
     */
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testValidateIncompatiblePrimitiveValue() {
        validator.validateValue(org.apache.bval.jsr.ExceptionsContractTest.Person.class, "age", null);
    }

    /**
     * Checks that an {@link IllegalArgumentException} is thrown when calling
     * {@link BeanDescriptor#getConstraintsForProperty(String)} with an invalid
     * property name.
     */
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testGetConstraintsForNullProperty() {
        jakarta.validation.metadata.BeanDescriptor personDescriptor = validator.getConstraintsForClass(org.apache.bval.jsr.ExceptionsContractTest.Person.class);
        personDescriptor.getConstraintsForProperty(null);
    }

    /**
     * Checks that an {@link IllegalArgumentException} is thrown when calling
     * {@link BeanDescriptor#getConstraintsForProperty(String)} with an invalid
     * property name.
     */
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testGetConstraintsForEmptyProperty() {
        jakarta.validation.metadata.BeanDescriptor personDescriptor = validator.getConstraintsForClass(org.apache.bval.jsr.ExceptionsContractTest.Person.class);
        personDescriptor.getConstraintsForProperty("");
    }

    public static class ExceptionThrowingBean {
        @jakarta.validation.constraints.NotNull
        public java.lang.String getValue() {
            throw new java.lang.IllegalStateException();
        }
    }

    public static class Person {
        @jakarta.validation.constraints.NotNull
        public java.lang.String name;

        @jakarta.validation.constraints.Min(0)
        public int age;
    }
}
