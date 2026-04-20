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
import jakarta.validation.ConstraintViolation;
import jakarta.validation.OverridesAttribute;
import jakarta.validation.Payload;
import jakarta.validation.ReportAsSingleViolation;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import jakarta.validation.metadata.ConstraintDescriptor;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
/**
 * Checks that groups are correctly inherited from the root constraint to its
 * compositing constraints.
 *
 * @author Carlos Vara
 */
public class ConstraintCompositionTest extends org.apache.bval.jsr.ValidationTestBase {
    /**
     * Check correct group inheritance on constraint composition on a 1 level
     * hierarchy.
     */
    @org.junit.Test
    public void test1LevelInheritance() {
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.ConstraintCompositionTest.Person>> violations = validator.validate(new org.apache.bval.jsr.ConstraintCompositionTest.Person());
        org.junit.Assert.assertEquals("Wrong number of violations detected", 1, violations.size());
        java.lang.String msg = violations.iterator().next().getMessage();
        org.junit.Assert.assertEquals("Incorrect violation message", "A person needs a non null name", msg);
        violations = validator.validate(new org.apache.bval.jsr.ConstraintCompositionTest.Person(), org.apache.bval.jsr.ConstraintCompositionTest.Group1.class);
        org.junit.Assert.assertEquals("Wrong number of violations detected", 0, violations.size());
    }

    /**
     * Check correct group inheritance on constraint composition on a 2 level
     * hierarchy.
     */
    @org.junit.Test
    public void test2LevelInheritance() {
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.ConstraintCompositionTest.Man>> violations = validator.validate(new org.apache.bval.jsr.ConstraintCompositionTest.Man());
        org.junit.Assert.assertEquals("Wrong number of violations detected", 0, violations.size());
        violations = validator.validate(new org.apache.bval.jsr.ConstraintCompositionTest.Man(), org.apache.bval.jsr.ConstraintCompositionTest.Group1.class);
        org.junit.Assert.assertEquals("Wrong number of violations detected", 1, violations.size());
        java.lang.String msg = violations.iterator().next().getMessage();
        org.junit.Assert.assertEquals("Incorrect violation message", "A person needs a non null name", msg);
    }

    /**
     * Checks that the groups() value of the constraint annotations are
     * correctly set to the inherited ones.
     */
    @org.junit.Test
    public void testAnnotationGroupsAreInherited() {
        // Check that the groups() value is right when querying the metadata
        jakarta.validation.metadata.ConstraintDescriptor<?> manNameDesc = validator.getConstraintsForClass(org.apache.bval.jsr.ConstraintCompositionTest.Man.class).getConstraintsForProperty("name").getConstraintDescriptors().iterator().next();
        jakarta.validation.metadata.ConstraintDescriptor<?> personNameDesc = manNameDesc.getComposingConstraints().iterator().next();
        jakarta.validation.metadata.ConstraintDescriptor<?> notNullDesc = personNameDesc.getComposingConstraints().iterator().next();
        org.junit.Assert.assertEquals("There should only be 1 group", 1, manNameDesc.getGroups().size());
        org.junit.Assert.assertTrue("Group1 should be present", manNameDesc.getGroups().contains(org.apache.bval.jsr.ConstraintCompositionTest.Group1.class));
        org.junit.Assert.assertEquals("There should only be 1 group", 1, personNameDesc.getGroups().size());
        org.junit.Assert.assertTrue("Group1 should be present", personNameDesc.getGroups().contains(org.apache.bval.jsr.ConstraintCompositionTest.Group1.class));
        org.junit.Assert.assertEquals("There should only be 1 group", 1, personNameDesc.getGroups().size());
        org.junit.Assert.assertTrue("Group1 should be present", notNullDesc.getGroups().contains(org.apache.bval.jsr.ConstraintCompositionTest.Group1.class));
        // Check that the groups() value is right when accessing it from an
        // error
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.ConstraintCompositionTest.Man>> violations = validator.validate(new org.apache.bval.jsr.ConstraintCompositionTest.Man(), org.apache.bval.jsr.ConstraintCompositionTest.Group1.class);
        java.util.Set<java.lang.Class<?>> notNullGroups = violations.iterator().next().getConstraintDescriptor().getGroups();
        org.junit.Assert.assertEquals("There should only be 1 group", 1, notNullGroups.size());
        org.junit.Assert.assertTrue("Group1 should be the only group", notNullGroups.contains(org.apache.bval.jsr.ConstraintCompositionTest.Group1.class));
    }

    /**
     * Checks that the payload() value of the constraint annotations are
     * correctly set to the inherited ones.
     */
    @org.junit.Test
    public void testAnnotationPayloadsAreInherited() {
        // Check that the payload() value is right when querying the metadata
        jakarta.validation.metadata.ConstraintDescriptor<?> manNameDesc = validator.getConstraintsForClass(org.apache.bval.jsr.ConstraintCompositionTest.Man.class).getConstraintsForProperty("name").getConstraintDescriptors().iterator().next();
        jakarta.validation.metadata.ConstraintDescriptor<?> personNameDesc = manNameDesc.getComposingConstraints().iterator().next();
        jakarta.validation.metadata.ConstraintDescriptor<?> notNullDesc = personNameDesc.getComposingConstraints().iterator().next();
        org.junit.Assert.assertEquals("There should only be 1 payload class", 1, manNameDesc.getPayload().size());
        org.junit.Assert.assertTrue("Payload1 should be present", manNameDesc.getPayload().contains(org.apache.bval.jsr.ConstraintCompositionTest.Payload1.class));
        org.junit.Assert.assertEquals("There should only be 1 payload class", 1, personNameDesc.getPayload().size());
        org.junit.Assert.assertTrue("Payload1 should be present", personNameDesc.getPayload().contains(org.apache.bval.jsr.ConstraintCompositionTest.Payload1.class));
        org.junit.Assert.assertEquals("There should only be 1 payload class", 1, personNameDesc.getPayload().size());
        org.junit.Assert.assertTrue("Payload1 should be present", notNullDesc.getPayload().contains(org.apache.bval.jsr.ConstraintCompositionTest.Payload1.class));
        // Check that the payload() value is right when accessing it from an
        // error
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.ConstraintCompositionTest.Man>> violations = validator.validate(new org.apache.bval.jsr.ConstraintCompositionTest.Man(), org.apache.bval.jsr.ConstraintCompositionTest.Group1.class);
        java.util.Set<java.lang.Class<? extends jakarta.validation.Payload>> notNullPayload = violations.iterator().next().getConstraintDescriptor().getPayload();
        org.junit.Assert.assertEquals("There should only be 1 payload class", 1, notNullPayload.size());
        org.junit.Assert.assertTrue("Payload1 should be the only payload", notNullPayload.contains(org.apache.bval.jsr.ConstraintCompositionTest.Payload1.class));
    }

    /**
     * Checks that {@link OverridesAttribute#constraintIndex()} parsing and
     * applying works.
     */
    @org.junit.Test
    public void testIndexedOverridesAttributes() {
        org.apache.bval.jsr.ConstraintCompositionTest.Person p = new org.apache.bval.jsr.ConstraintCompositionTest.Person();
        p.name = "valid";
        // With a valid id, no errors expected
        p.id = "1234";
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.ConstraintCompositionTest.Person>> constraintViolations = validator.validate(p);
        org.junit.Assert.assertTrue("No violations should be reported on valid id", constraintViolations.isEmpty());
        // With a short id, only 1 error expected
        p.id = "1";
        constraintViolations = validator.validate(p);
        org.junit.Assert.assertEquals("Only 1 violation expected", 1, constraintViolations.size());
        jakarta.validation.ConstraintViolation<org.apache.bval.jsr.ConstraintCompositionTest.Person> violation = constraintViolations.iterator().next();
        org.junit.Assert.assertEquals("Wrong violation", "Id is too short", violation.getMessage());
        // With a long id, only 1 error expected
        p.id = "loooooong id";
        constraintViolations = validator.validate(p);
        org.junit.Assert.assertEquals("Only 1 violation expected", 1, constraintViolations.size());
        violation = constraintViolations.iterator().next();
        org.junit.Assert.assertEquals("Wrong violation", "Id is too long", violation.getMessage());
    }

    /**
     * Checks that errors are reported correctly when using
     * {@link ReportAsSingleViolation}.
     */
    @org.junit.Test
    public void testReportAsAsingleViolation() {
        org.apache.bval.jsr.ConstraintCompositionTest.Code c = new org.apache.bval.jsr.ConstraintCompositionTest.Code();
        c.code = "very invalid code";
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.ConstraintCompositionTest.Code>> constraintViolations = validator.validate(c);
        // Only 1 error expected
        org.junit.Assert.assertEquals("Only 1 violation expected", 1, constraintViolations.size());
        jakarta.validation.ConstraintViolation<org.apache.bval.jsr.ConstraintCompositionTest.Code> violation = constraintViolations.iterator().next();
        org.junit.Assert.assertEquals("Wrong violation message", "Invalid code", violation.getMessage());
        org.junit.Assert.assertEquals("Wrong violation type", org.apache.bval.jsr.ConstraintCompositionTest.ElevenDigitsCode.class, ((java.lang.annotation.Annotation) (violation.getConstraintDescriptor().getAnnotation())).annotationType());
    }

    public static class Person {
        @org.apache.bval.jsr.ConstraintCompositionTest.PersonName
        java.lang.String name;

        @org.apache.bval.jsr.ConstraintCompositionTest.PersonId
        java.lang.String id;
    }

    public static class Man {
        @org.apache.bval.jsr.ConstraintCompositionTest.ManName(groups = { org.apache.bval.jsr.ConstraintCompositionTest.Group1.class }, payload = { org.apache.bval.jsr.ConstraintCompositionTest.Payload1.class })
        java.lang.String name;
    }

    public static class Code {
        @org.apache.bval.jsr.ConstraintCompositionTest.ElevenDigitsCode
        java.lang.String code;
    }

    @jakarta.validation.constraints.NotNull(message = "A person needs a non null name", groups = { org.apache.bval.jsr.ConstraintCompositionTest.Group1.class }, payload = {  })
    @jakarta.validation.Constraint(validatedBy = {  })
    @java.lang.annotation.Documented
    @java.lang.annotation.Target({ java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.TYPE })
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public static @interface PersonName {
        java.lang.String message() default "Wrong person name";

        java.lang.Class<?>[] groups() default {  };

        java.lang.Class<? extends jakarta.validation.Payload>[] payload() default {  };
    }

    @org.apache.bval.jsr.ConstraintCompositionTest.PersonName(groups = { org.apache.bval.jsr.ConstraintCompositionTest.Group2.class }, payload = { org.apache.bval.jsr.ConstraintCompositionTest.Payload1.class, org.apache.bval.jsr.ConstraintCompositionTest.Payload2.class })
    @jakarta.validation.Constraint(validatedBy = {  })
    @java.lang.annotation.Documented
    @java.lang.annotation.Target({ java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.TYPE })
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public static @interface ManName {
        java.lang.String message() default "Wrong man name";

        java.lang.Class<?>[] groups() default {  };

        java.lang.Class<? extends jakarta.validation.Payload>[] payload() default {  };
    }

    @jakarta.validation.constraints.Size.List({ @jakarta.validation.constraints.Size(min = 3, max = 3, message = "Id is too short"), @jakarta.validation.constraints.Size(min = 5, max = 5, message = "Id is too long") })
    @jakarta.validation.Constraint(validatedBy = {  })
    @java.lang.annotation.Documented
    @java.lang.annotation.Target({ java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.TYPE })
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public static @interface PersonId {
        java.lang.String message() default "Wrong person id";

        java.lang.Class<?>[] groups() default {  };

        java.lang.Class<? extends jakarta.validation.Payload>[] payload() default {  };

        @jakarta.validation.OverridesAttribute(constraint = jakarta.validation.constraints.Size.class, constraintIndex = 0, name = "max")
        int maxSize() default 1000;

        @jakarta.validation.OverridesAttribute(constraint = jakarta.validation.constraints.Size.class, constraintIndex = 1, name = "min")
        int minSize() default 0;
    }

    @jakarta.validation.constraints.Size(min = 11, max = 11)
    @jakarta.validation.constraints.Pattern(regexp = "\\d*")
    @jakarta.validation.Constraint(validatedBy = {  })
    @jakarta.validation.ReportAsSingleViolation
    @java.lang.annotation.Documented
    @java.lang.annotation.Target({ java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.TYPE })
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public static @interface ElevenDigitsCode {
        java.lang.String message() default "Invalid code";

        java.lang.Class<?>[] groups() default {  };

        java.lang.Class<? extends jakarta.validation.Payload>[] payload() default {  };
    }

    public static interface Group1 {}

    public static interface Group2 {}

    public static class Payload1 implements jakarta.validation.Payload {}

    public static class Payload2 implements jakarta.validation.Payload {}
}
