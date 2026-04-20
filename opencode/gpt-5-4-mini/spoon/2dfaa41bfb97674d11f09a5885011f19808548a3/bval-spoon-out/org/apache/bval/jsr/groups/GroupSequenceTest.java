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
package org.apache.bval.jsr.groups;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.GroupDefinitionException;
import jakarta.validation.GroupSequence;
import jakarta.validation.constraints.NotNull;
import org.apache.bval.jsr.ApacheValidatorFactory;
import org.apache.bval.jsr.descriptor.BeanD;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
/**
 * Description: test of group sequence behavior<br/>
 */
public class GroupSequenceTest extends org.apache.bval.jsr.ValidationTestBase {
    @org.junit.Test(expected = jakarta.validation.GroupDefinitionException.class)
    public void testGroupSequence1() {
        org.apache.bval.jsr.ApacheValidatorFactory.getDefault().usingContext().getValidator().getConstraintsForClass(org.apache.bval.jsr.groups.GInterface1.class);
    }

    @org.junit.Test
    public void testGroupSequence2() {
        org.apache.bval.jsr.descriptor.BeanD<?> bean = ((org.apache.bval.jsr.descriptor.BeanD<?>) (org.apache.bval.jsr.ApacheValidatorFactory.getDefault().usingContext().getValidator().getConstraintsForClass(org.apache.bval.jsr.groups.GClass1.class)));
        org.junit.Assert.assertEquals(org.apache.bval.jsr.groups.Group.of(org.apache.bval.jsr.groups.GClass1.class), bean.getGroupStrategy());
    }

    @org.junit.Test
    public void testGroupSequence3() {
        org.apache.bval.jsr.descriptor.BeanD<?> bean = ((org.apache.bval.jsr.descriptor.BeanD<?>) (org.apache.bval.jsr.ApacheValidatorFactory.getDefault().usingContext().getValidator().getConstraintsForClass(org.apache.bval.jsr.groups.GClass2.class)));
        class TestPredicate implements java.util.function.Predicate<org.apache.bval.jsr.groups.GroupStrategy> {
            final java.util.List<org.apache.bval.jsr.groups.GroupStrategy> strategies = new java.util.ArrayList<>();

            @java.lang.Override
            public boolean test(org.apache.bval.jsr.groups.GroupStrategy t) {
                return strategies.add(t);
            }
        }
        final TestPredicate p = new TestPredicate();
        bean.getGroupStrategy().applyTo(p);
        org.apache.bval.jsr.groups.Group g1 = org.apache.bval.jsr.groups.Group.of(org.apache.bval.jsr.groups.GClass1.class);
        org.apache.bval.jsr.groups.Group g2 = org.apache.bval.jsr.groups.Group.of(org.apache.bval.jsr.groups.GClass2.class);
        org.junit.Assert.assertEquals(java.util.Arrays.asList(g1, org.apache.bval.jsr.groups.GroupStrategy.simple(g1, g2)), p.strategies);
    }

    @org.junit.Test
    public void testGroupSequence4() {
        org.apache.bval.jsr.descriptor.BeanD<?> bean = ((org.apache.bval.jsr.descriptor.BeanD<?>) (org.apache.bval.jsr.ApacheValidatorFactory.getDefault().usingContext().getValidator().getConstraintsForClass(org.apache.bval.jsr.groups.GClass3.class)));
        org.junit.Assert.assertEquals(org.apache.bval.jsr.groups.Group.sequence(org.apache.bval.jsr.groups.Group.of(org.apache.bval.jsr.groups.GClass3.class), org.apache.bval.jsr.groups.Group.of(org.apache.bval.jsr.groups.GClass1.class)), bean.getGroupStrategy());
    }

    @org.junit.Test
    public void testGroups() {
        org.apache.bval.jsr.example.Author author = new org.apache.bval.jsr.example.Author();
        author.setLastName("");
        author.setFirstName("");
        org.apache.bval.jsr.example.Book book = new org.apache.bval.jsr.example.Book();
        book.setTitle("");
        book.setAuthor(author);
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.Book>> constraintViolations = validator.validate(book, org.apache.bval.jsr.example.First.class, org.apache.bval.jsr.example.Second.class, org.apache.bval.jsr.example.Last.class);
        org.junit.Assert.assertEquals("Wrong number of constraints", 3, constraintViolations.size());
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolation(constraintViolations, "title"));
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolation(constraintViolations, "author.firstName"));
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolation(constraintViolations, "author.lastName"));
        author.setFirstName("Gavin");
        author.setLastName("King");
        constraintViolations = validator.validate(book, org.apache.bval.jsr.example.First.class, org.apache.bval.jsr.example.Second.class, org.apache.bval.jsr.example.Last.class);
        jakarta.validation.ConstraintViolation<?> constraintViolation = constraintViolations.iterator().next();
        org.junit.Assert.assertEquals(1, constraintViolations.size());
        org.junit.Assert.assertEquals("must not be empty", constraintViolation.getMessage());
        org.junit.Assert.assertEquals(book, constraintViolation.getRootBean());
        org.junit.Assert.assertEquals(book.getTitle(), constraintViolation.getInvalidValue());
        org.junit.Assert.assertEquals("title", constraintViolation.getPropertyPath().toString());
        book.setTitle("My fault");
        book.setSubtitle("confessions of a president - a book for a nice price");
        constraintViolations = validator.validate(book, org.apache.bval.jsr.example.First.class, org.apache.bval.jsr.example.Second.class, org.apache.bval.jsr.example.Last.class);
        org.junit.Assert.assertEquals(1, constraintViolations.size());
        constraintViolation = constraintViolations.iterator().next();
        org.junit.Assert.assertEquals("size must be between 0 and 30", constraintViolation.getMessage());
        org.junit.Assert.assertEquals(book, constraintViolation.getRootBean());
        org.junit.Assert.assertEquals(book.getSubtitle(), constraintViolation.getInvalidValue());
        org.junit.Assert.assertEquals("subtitle", constraintViolation.getPropertyPath().toString());
        book.setSubtitle("Capitalism in crisis");
        author.setCompany("1234567890ß9876543212578909876542245678987432");
        constraintViolations = validator.validate(book);
        constraintViolation = constraintViolations.iterator().next();
        org.junit.Assert.assertEquals(1, constraintViolations.size());
        org.junit.Assert.assertEquals("size must be between 0 and 40", constraintViolation.getMessage());
        org.junit.Assert.assertEquals(book, constraintViolation.getRootBean());
        org.junit.Assert.assertEquals(author.getCompany(), constraintViolation.getInvalidValue());
        org.junit.Assert.assertEquals("author.company", constraintViolation.getPropertyPath().toString());
        author.setCompany("apache");
        constraintViolations = validator.validate(book, org.apache.bval.jsr.example.First.class, org.apache.bval.jsr.example.Second.class, org.apache.bval.jsr.example.Last.class);
        org.junit.Assert.assertEquals(0, constraintViolations.size());
    }

    @org.junit.Test
    public void testGroupSequence() {
        org.apache.bval.jsr.example.Author author = new org.apache.bval.jsr.example.Author();
        author.setLastName("");
        author.setFirstName("");
        org.apache.bval.jsr.example.Book book = new org.apache.bval.jsr.example.Book();
        book.setAuthor(author);
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.Book>> constraintViolations = validator.validate(book, org.apache.bval.jsr.example.Book.All.class);
        org.junit.Assert.assertEquals(2, constraintViolations.size());
        author.setFirstName("Kelvin");
        author.setLastName("Cline");
        constraintViolations = validator.validate(book, org.apache.bval.jsr.example.Book.All.class);
        jakarta.validation.ConstraintViolation<?> constraintViolation = constraintViolations.iterator().next();
        org.junit.Assert.assertEquals(1, constraintViolations.size());
        org.junit.Assert.assertEquals("must not be empty", constraintViolation.getMessage());
        org.junit.Assert.assertEquals(book, constraintViolation.getRootBean());
        org.junit.Assert.assertEquals(book.getTitle(), constraintViolation.getInvalidValue());
        org.junit.Assert.assertEquals("title", constraintViolation.getPropertyPath().toString());
        book.setTitle("247307892430798789024389798789");
        book.setSubtitle("f43u rlök fjöq3liu opiur ölw3kj rölkj d");
        constraintViolations = validator.validate(book, org.apache.bval.jsr.example.Book.All.class);
        org.junit.Assert.assertEquals(1, constraintViolations.size());
    }

    /**
     * Check that when there is one constraint failure in one of the groups in
     * a sequence, validation stops.
     * JSR-303: 3.4.3
     */
    @org.junit.Test
    public void testValidationStopsWhenFailuresOnGroup() {
        // Validate Dummy with its redefined Default group
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.groups.GroupSequenceTest.Dummy>> violations = validator.validate(new org.apache.bval.jsr.groups.GroupSequenceTest.Dummy());
        org.junit.Assert.assertEquals("Only 1 violation expected", 1, violations.size());
        jakarta.validation.ConstraintViolation<org.apache.bval.jsr.groups.GroupSequenceTest.Dummy> violation = violations.iterator().next();
        org.junit.Assert.assertEquals("Group1 should be evaluated first", "field1", violation.getPropertyPath().toString());
    }

    @jakarta.validation.GroupSequence({ org.apache.bval.jsr.groups.GroupSequenceTest.Dummy.Group1.class, org.apache.bval.jsr.groups.GroupSequenceTest.Dummy.class })
    public static class Dummy {
        @jakarta.validation.constraints.NotNull(groups = org.apache.bval.jsr.groups.GroupSequenceTest.Dummy.Group1.class)
        public java.lang.String field1;

        @jakarta.validation.constraints.NotNull
        public java.lang.String field2;

        interface Group1 {}
    }
}
