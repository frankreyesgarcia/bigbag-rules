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
import jakarta.validation.Constraint;
import jakarta.validation.ConstraintDefinitionException;
import jakarta.validation.Payload;
import jakarta.validation.constraints.Min;
import jakarta.validation.metadata.BeanDescriptor;
import jakarta.validation.metadata.ConstraintDescriptor;
import org.apache.bval.constraints.NotNullValidator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Checks the correct parsing of constraint definitions.
 *
 * @author Carlos Vara
 */
public class ConstraintDefinitionsTest extends org.apache.bval.jsr.ValidationTestBase {
    /**
     * Checks the correct parsing of a constraint with an array of constraints
     * as attributes.
     */
    @org.junit.Test
    public void testCustomAttributes() {
        jakarta.validation.metadata.BeanDescriptor constraints = validator.getConstraintsForClass(org.apache.bval.jsr.ConstraintDefinitionsTest.Person.class);
        java.util.Set<jakarta.validation.metadata.ConstraintDescriptor<?>> ageConstraints = constraints.getConstraintsForProperty("age").getConstraintDescriptors();
        org.junit.Assert.assertEquals("There should be 2 constraints in 'age'", ageConstraints.size(), 2);
        for (jakarta.validation.metadata.ConstraintDescriptor<?> cd : ageConstraints) {
            org.junit.Assert.assertEquals("Annotation should be @Min", cd.getAnnotation().annotationType().getName(), jakarta.validation.constraints.Min.class.getName());
        }
    }

    /**
     * Checks that a {@link ConstraintDefinitionException} is thrown when
     * parsing a constraint definition with no <code>groups()</code> method.
     */
    @org.junit.Test(expected = jakarta.validation.ConstraintDefinitionException.class)
    public void testNoGroupsConstraint() {
        validator.validate(new org.apache.bval.jsr.ConstraintDefinitionsTest.NoGroups());
    }

    /**
     * Checks that a {@link ConstraintDefinitionException} is thrown when
     * parsing a constraint definition with an invalid <code>groups()</code>
     * method.
     */
    @org.junit.Test(expected = jakarta.validation.ConstraintDefinitionException.class)
    public void testInvalidDefaultGroupsConstraint() {
        validator.validate(new org.apache.bval.jsr.ConstraintDefinitionsTest.InvalidGroups());
    }

    /**
     * Checks that a {@link ConstraintDefinitionException} is thrown when
     * parsing a constraint definition with no <code>payload()</code> method.
     */
    @org.junit.Test(expected = jakarta.validation.ConstraintDefinitionException.class)
    public void testNoPayloadConstraint() {
        validator.validate(new org.apache.bval.jsr.ConstraintDefinitionsTest.NoPayload());
    }

    /**
     * Checks that a {@link ConstraintDefinitionException} is thrown when
     * parsing a constraint definition with an invalid <code>payload()</code>
     * method.
     */
    @org.junit.Test(expected = jakarta.validation.ConstraintDefinitionException.class)
    public void testInvalidDefaultPayloadConstraint() {
        validator.validate(new org.apache.bval.jsr.ConstraintDefinitionsTest.InvalidPayload());
    }

    /**
     * Checks that a {@link ConstraintDefinitionException} is thrown when
     * parsing a constraint definition with no <code>message()</code> method.
     */
    @org.junit.Test(expected = jakarta.validation.ConstraintDefinitionException.class)
    public void testNoMessageConstraint() {
        validator.validate(new org.apache.bval.jsr.ConstraintDefinitionsTest.NoMessage());
    }

    /**
     * Checks that a {@link ConstraintDefinitionException} is thrown when
     * parsing a constraint definition with an invalid <code>message()</code>
     * method.
     */
    @org.junit.Test(expected = jakarta.validation.ConstraintDefinitionException.class)
    public void testInvalidDefaultMessageConstraint() {
        validator.validate(new org.apache.bval.jsr.ConstraintDefinitionsTest.InvalidMessage());
    }

    /**
     * Checks that a {@link ConstraintDefinitionException} is thrown when
     * parsing a constraint definition with a method starting with 'valid'.
     */
    @org.junit.Test(expected = jakarta.validation.ConstraintDefinitionException.class)
    public void testInvalidAttributeConstraint() {
        validator.validate(new org.apache.bval.jsr.ConstraintDefinitionsTest.InvalidAttribute());
    }

    public static class Person {
        @org.apache.bval.jsr.ConstraintDefinitionsTest.MinList({ @jakarta.validation.constraints.Min(20), @jakarta.validation.constraints.Min(30) })
        public java.lang.Integer age;
    }

    @java.lang.annotation.Target({ java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.ANNOTATION_TYPE })
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.annotation.Documented
    public static @interface MinList {
        jakarta.validation.constraints.Min[] value();
    }

    public static class NoGroups {
        @org.apache.bval.jsr.ConstraintDefinitionsTest.NoGroupsConstraint
        public java.lang.String prop;
    }

    @java.lang.annotation.Target({ java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.ANNOTATION_TYPE })
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.annotation.Documented
    @jakarta.validation.Constraint(validatedBy = { org.apache.bval.constraints.NotNullValidator.class })
    public static @interface NoGroupsConstraint {
        java.lang.String message() default "def msg";

        java.lang.Class<? extends jakarta.validation.Payload>[] payload() default {  };
    }

    public static class InvalidGroups {
        @org.apache.bval.jsr.ConstraintDefinitionsTest.InvalidGroupsConstraint
        public java.lang.String prop;
    }

    @java.lang.annotation.Target({ java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.ANNOTATION_TYPE })
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.annotation.Documented
    @jakarta.validation.Constraint(validatedBy = { org.apache.bval.constraints.NotNullValidator.class })
    public static @interface InvalidGroupsConstraint {
        java.lang.String message() default "def msg";

        java.lang.String[] groups() default { "Group1" };

        java.lang.Class<? extends jakarta.validation.Payload>[] payload() default {  };
    }

    public static class NoPayload {
        @org.apache.bval.jsr.ConstraintDefinitionsTest.NoPayloadConstraint
        public java.lang.String prop;
    }

    @java.lang.annotation.Target({ java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.ANNOTATION_TYPE })
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.annotation.Documented
    @jakarta.validation.Constraint(validatedBy = { org.apache.bval.constraints.NotNullValidator.class })
    public static @interface NoPayloadConstraint {
        java.lang.String message() default "def msg";

        java.lang.String[] groups() default {  };
    }

    public static class InvalidPayload {
        @org.apache.bval.jsr.ConstraintDefinitionsTest.InvalidPayloadConstraint
        public java.lang.String prop;
    }

    @java.lang.annotation.Target({ java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.ANNOTATION_TYPE })
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.annotation.Documented
    @jakarta.validation.Constraint(validatedBy = { org.apache.bval.constraints.NotNullValidator.class })
    public static @interface InvalidPayloadConstraint {
        java.lang.String message() default "def msg";

        java.lang.String[] groups() default {  };

        java.lang.Class<? extends jakarta.validation.Payload>[] payload() default { org.apache.bval.jsr.ConstraintDefinitionsTest.InvalidPayloadConstraint.Payload1.class };

        public static class Payload1 implements jakarta.validation.Payload {}
    }

    public static class NoMessage {
        @org.apache.bval.jsr.ConstraintDefinitionsTest.NoMessageConstraint
        public java.lang.String prop;
    }

    @java.lang.annotation.Target({ java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.ANNOTATION_TYPE })
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.annotation.Documented
    @jakarta.validation.Constraint(validatedBy = { org.apache.bval.constraints.NotNullValidator.class })
    public static @interface NoMessageConstraint {
        java.lang.String[] groups() default {  };

        java.lang.Class<? extends jakarta.validation.Payload>[] payload() default {  };
    }

    public static class InvalidMessage {
        @org.apache.bval.jsr.ConstraintDefinitionsTest.InvalidMessageConstraint(message = 2)
        public java.lang.String prop;
    }

    @java.lang.annotation.Target({ java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.ANNOTATION_TYPE })
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.annotation.Documented
    @jakarta.validation.Constraint(validatedBy = { org.apache.bval.constraints.NotNullValidator.class })
    public static @interface InvalidMessageConstraint {
        int message();

        java.lang.String[] groups() default {  };

        java.lang.Class<? extends jakarta.validation.Payload>[] payload() default {  };
    }

    public static class InvalidAttribute {
        @org.apache.bval.jsr.ConstraintDefinitionsTest.InvalidAttributeConstraint
        public java.lang.String prop;
    }

    @java.lang.annotation.Target({ java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.ANNOTATION_TYPE })
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.annotation.Documented
    @jakarta.validation.Constraint(validatedBy = { org.apache.bval.constraints.NotNullValidator.class })
    public static @interface InvalidAttributeConstraint {
        java.lang.String message() default "def msg";

        java.lang.String[] groups() default {  };

        java.lang.Class<? extends jakarta.validation.Payload>[] payload() default {  };

        java.lang.String validValue() default "1";
    }
}
