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
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.groups.Default;
import jakarta.validation.metadata.BeanDescriptor;
import jakarta.validation.metadata.ConstraintDescriptor;
import jakarta.validation.metadata.ElementDescriptor;
import jakarta.validation.metadata.ElementDescriptor.ConstraintFinder;
import jakarta.validation.metadata.PropertyDescriptor;
import jakarta.validation.metadata.Scope;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
/**
 * Tests the implementation of {@link BeanDescriptor} and its dependent
 * interfaces.
 *
 * @author Carlos Vara
 */
public class BeanDescriptorTest extends org.apache.bval.jsr.ValidationTestBase {
    /**
     * Check that groups(), message() and payload() are always in the
     * attributes.
     */
    @org.junit.Test
    public void testMandatoryAttributesPresentInConstraintDescriptor() {
        java.util.Set<jakarta.validation.metadata.ConstraintDescriptor<?>> nameDescriptors = validator.getConstraintsForClass(org.apache.bval.jsr.BeanDescriptorTest.Form.class).getConstraintsForProperty("name").getConstraintDescriptors();
        org.junit.Assert.assertEquals("Incorrect number of descriptors", 1, nameDescriptors.size());
        jakarta.validation.metadata.ConstraintDescriptor<?> nameDescriptor = nameDescriptors.iterator().next();
        org.junit.Assert.assertTrue("groups attribute not present", nameDescriptor.getAttributes().containsKey("groups"));
        org.junit.Assert.assertTrue("payload attribute not present", nameDescriptor.getAttributes().containsKey("payload"));
        org.junit.Assert.assertTrue("message attribute not present", nameDescriptor.getAttributes().containsKey("message"));
    }

    /**
     * Check that the groups() attribute value has the correct value when
     * inheriting groups.
     */
    @org.junit.Test
    public void testCorrectValueForInheritedGroupsAttribute() {
        java.util.Set<jakarta.validation.metadata.ConstraintDescriptor<?>> passwordDescriptors = validator.getConstraintsForClass(org.apache.bval.jsr.BeanDescriptorTest.Account.class).getConstraintsForProperty("password").getConstraintDescriptors();
        org.junit.Assert.assertEquals("Incorrect number of descriptors", 1, passwordDescriptors.size());
        jakarta.validation.metadata.ConstraintDescriptor<?> passwordDescriptor = passwordDescriptors.iterator().next();
        org.junit.Assert.assertEquals("Incorrect number of composing constraints", 1, passwordDescriptor.getComposingConstraints().size());
        jakarta.validation.metadata.ConstraintDescriptor<?> notNullDescriptor = passwordDescriptor.getComposingConstraints().iterator().next();
        // Check that the groups value containts Group1.class
        java.lang.Class<?>[] notNullGroups = ((java.lang.Class<?>[]) (notNullDescriptor.getAttributes().get("groups")));
        boolean found = false;
        for (java.lang.Class<?> group : notNullGroups) {
            if (group == org.apache.bval.jsr.BeanDescriptorTest.Group1.class) {
                found = true;
                break;
            }
        }
        org.junit.Assert.assertTrue("Group1 not present in groups attribute", found);
    }

    /**
     * Check that the groups() attribute value contains the correct interface as
     * implicit group when the constraint is defined in that interface instead
     * of the queried class.
     */
    @org.junit.Test
    public void testImplicitGroupIsPresent() {
        java.util.Set<jakarta.validation.metadata.ConstraintDescriptor<?>> nameDescriptors = validator.getConstraintsForClass(org.apache.bval.jsr.BeanDescriptorTest.Woman.class).getConstraintsForProperty("name").getConstraintDescriptors();
        org.junit.Assert.assertEquals("Incorrect number of descriptors", 1, nameDescriptors.size());
        jakarta.validation.metadata.ConstraintDescriptor<?> notNullDescriptor = nameDescriptors.iterator().next();
        // Check that the groups attribute value contains the implicit group
        // Person and the Default group
        java.lang.Class<?>[] notNullGroups = ((java.lang.Class<?>[]) (notNullDescriptor.getAttributes().get("groups")));
        org.junit.Assert.assertEquals("Incorrect number of groups", 2, notNullGroups.length);
        org.junit.Assert.assertTrue("Default group not present", notNullGroups[0].equals(jakarta.validation.groups.Default.class) || notNullGroups[1].equals(jakarta.validation.groups.Default.class));
        org.junit.Assert.assertTrue("Implicit group not present", notNullGroups[0].equals(org.apache.bval.jsr.BeanDescriptorTest.Person.class) || notNullGroups[1].equals(org.apache.bval.jsr.BeanDescriptorTest.Person.class));
    }

    /**
     * Check that the groups() attribute value does not contain the implicit
     * interface group when querying the interface directly.
     */
    @org.junit.Test
    public void testNoImplicitGroupWhenQueryingInterfaceDirectly() {
        java.util.Set<jakarta.validation.metadata.ConstraintDescriptor<?>> nameDescriptors = validator.getConstraintsForClass(org.apache.bval.jsr.BeanDescriptorTest.Person.class).getConstraintsForProperty("name").getConstraintDescriptors();
        org.junit.Assert.assertEquals("Incorrect number of descriptors", 1, nameDescriptors.size());
        jakarta.validation.metadata.ConstraintDescriptor<?> notNullDescriptor = nameDescriptors.iterator().next();
        // Check that only the default group is present
        java.lang.Class<?>[] notNullGroups = ((java.lang.Class<?>[]) (notNullDescriptor.getAttributes().get("groups")));
        org.junit.Assert.assertEquals("Incorrect number of groups", 1, notNullGroups.length);
        org.junit.Assert.assertTrue("Default group not present", notNullGroups[0].equals(jakarta.validation.groups.Default.class));
    }

    /**
     * Check that the implementations of
     * {@link ElementDescriptor#getElementClass()} work as defined in the spec.
     */
    @org.junit.Test
    public void testElementDescriptorGetElementClass() {
        jakarta.validation.metadata.BeanDescriptor beanDescriptor = validator.getConstraintsForClass(org.apache.bval.jsr.BeanDescriptorTest.Person.class);
        org.junit.Assert.assertEquals("Incorrect class returned", org.apache.bval.jsr.BeanDescriptorTest.Person.class, beanDescriptor.getElementClass());
        jakarta.validation.metadata.PropertyDescriptor nameDescriptor = beanDescriptor.getConstraintsForProperty("name");
        org.junit.Assert.assertEquals("Incorrect class returned", java.lang.String.class, nameDescriptor.getElementClass());
    }

    /**
     * Check the correct behavior of
     * {@link ConstraintFinder#lookingAt(jakarta.validation.metadata.Scope)}.
     */
    @org.junit.Test
    public void testConstraintFinderLookingAt() {
        jakarta.validation.metadata.PropertyDescriptor nameDescriptor = validator.getConstraintsForClass(org.apache.bval.jsr.BeanDescriptorTest.Woman.class).getConstraintsForProperty("name");
        java.util.Set<jakarta.validation.metadata.ConstraintDescriptor<?>> constraints = nameDescriptor.findConstraints().lookingAt(jakarta.validation.metadata.Scope.HIERARCHY).getConstraintDescriptors();
        org.junit.Assert.assertEquals("Incorrect number of descriptors", 1, constraints.size());
        constraints = nameDescriptor.findConstraints().lookingAt(jakarta.validation.metadata.Scope.LOCAL_ELEMENT).getConstraintDescriptors();
        org.junit.Assert.assertEquals("Incorrect number of descriptors", 0, constraints.size());
        org.apache.bval.jsr.util.TestUtils.failOnModifiable(constraints, "constraintFinder constraintDescriptors");
        // verify that changes to one ConstraintFinder don't affect the base:
        constraints = nameDescriptor.getConstraintDescriptors();
        org.junit.Assert.assertEquals("Incorrect number of descriptors", 1, constraints.size());
    }

    @org.junit.Test
    public void testDescriptorCaching() {
        // constrained
        final jakarta.validation.metadata.BeanDescriptor personDescriptor = validator.getConstraintsForClass(org.apache.bval.jsr.BeanDescriptorTest.Person.class);
        org.junit.Assert.assertNotNull(personDescriptor);
        org.junit.Assert.assertSame(personDescriptor, validator.getConstraintsForClass(org.apache.bval.jsr.BeanDescriptorTest.Person.class));
        // unconstrained
        final jakarta.validation.metadata.BeanDescriptor objectDescriptor = validator.getConstraintsForClass(java.lang.Object.class);
        org.junit.Assert.assertNotNull(objectDescriptor);
        org.junit.Assert.assertSame(objectDescriptor, validator.getConstraintsForClass(java.lang.Object.class));
    }

    public static class Form {
        @jakarta.validation.constraints.NotNull
        public java.lang.String name;
    }

    public static class Account {
        @org.apache.bval.jsr.BeanDescriptorTest.Password(groups = { org.apache.bval.jsr.BeanDescriptorTest.Group1.class })
        public java.lang.String password;
    }

    @jakarta.validation.constraints.NotNull(groups = {  })
    @jakarta.validation.Constraint(validatedBy = {  })
    @java.lang.annotation.Documented
    @java.lang.annotation.Target({ java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.TYPE })
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public static @interface Password {
        java.lang.String message() default "Invalid password";

        java.lang.Class<?>[] groups() default {  };

        java.lang.Class<? extends jakarta.validation.Payload>[] payload() default {  };
    }

    public static interface Group1 {}

    public static class Woman implements org.apache.bval.jsr.BeanDescriptorTest.Person {
        private java.lang.String name;

        @java.lang.Override
        public java.lang.String getName() {
            return this.name;
        }

        public void setName(java.lang.String name) {
            this.name = name;
        }
    }

    public static interface Person {
        @jakarta.validation.constraints.NotNull
        java.lang.String getName();
    }
}
