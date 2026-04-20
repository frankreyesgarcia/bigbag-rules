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
import jakarta.validation.GroupSequence;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.groups.Default;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Additional tests to check the correct processing of {@link GroupSequence}s
 * by the validator.
 *
 * @author Carlos Vara
 */
public class GroupSequenceIsolationTest extends org.apache.bval.jsr.ValidationTestBase {
    /**
     * When validating the {@link Default} group in a bean whose class doesn't
     * define a {@link GroupSequence}, all the classes in the hierarchy must be
     * checked for group sequence definitions and they must be evaluated in
     * order for the constraints defined on those classes.
     */
    @org.junit.Test
    public void testGroupSequencesInHierarchyClasses() {
        org.apache.bval.jsr.groups.GroupSequenceIsolationTest.HolderWithNoGS h = new org.apache.bval.jsr.groups.GroupSequenceIsolationTest.HolderWithNoGS();
        org.junit.Assert.assertEquals(org.apache.bval.jsr.groups.GroupSequenceIsolationTest.set("a2", "b2"), org.apache.bval.jsr.groups.GroupSequenceIsolationTest.violationPaths(validator.validate(h)));
        h.b2 = "good";
        org.junit.Assert.assertEquals(org.apache.bval.jsr.groups.GroupSequenceIsolationTest.set("a2"), org.apache.bval.jsr.groups.GroupSequenceIsolationTest.violationPaths(validator.validate(h)));
        h.a2 = "good";
        org.junit.Assert.assertEquals(org.apache.bval.jsr.groups.GroupSequenceIsolationTest.set("b1"), org.apache.bval.jsr.groups.GroupSequenceIsolationTest.violationPaths(validator.validate(h)));
    }

    /**
     * When validating the {@link Default} group in a bean whose class defines
     * a group sequence, that group sequence is used for all the constraints.
     */
    @org.junit.Test
    public void testGroupSequenceOfBeanClass() {
        org.apache.bval.jsr.groups.GroupSequenceIsolationTest.HolderWithGS h = new org.apache.bval.jsr.groups.GroupSequenceIsolationTest.HolderWithGS();
        org.junit.Assert.assertEquals(java.util.Collections.singleton("a1"), org.apache.bval.jsr.groups.GroupSequenceIsolationTest.violationPaths(validator.validate(h)));
        h.a1 = "good";
        org.junit.Assert.assertEquals(org.apache.bval.jsr.groups.GroupSequenceIsolationTest.set("a2", "b2"), org.apache.bval.jsr.groups.GroupSequenceIsolationTest.violationPaths(validator.validate(h)));
        h.a2 = "good";
        h.b2 = "good";
        org.junit.Assert.assertEquals(java.util.Collections.singleton("b1"), org.apache.bval.jsr.groups.GroupSequenceIsolationTest.violationPaths(validator.validate(h)));
    }

    @java.lang.SafeVarargs
    private static <T> java.util.Set<T> set(T... elements) {
        return new java.util.HashSet<T>(java.util.Arrays.asList(elements));
    }

    private static java.util.Set<java.lang.String> violationPaths(java.util.Set<? extends jakarta.validation.ConstraintViolation<?>> violations) {
        if ((violations == null) || violations.isEmpty()) {
            return java.util.Collections.emptySet();
        }
        final java.util.Set<java.lang.String> result = new java.util.LinkedHashSet<java.lang.String>(violations.size());
        for (jakarta.validation.ConstraintViolation<?> constraintViolation : violations) {
            result.add(constraintViolation.getPropertyPath().toString());
        }
        return result;
    }

    @jakarta.validation.GroupSequence({ org.apache.bval.jsr.groups.GroupSequenceIsolationTest.GroupA1.class, org.apache.bval.jsr.groups.GroupSequenceIsolationTest.A.class })
    public static class A {
        @jakarta.validation.constraints.NotNull(groups = { org.apache.bval.jsr.groups.GroupSequenceIsolationTest.GroupA1.class })
        public java.lang.String a1;

        @jakarta.validation.constraints.NotNull
        public java.lang.String a2;
    }

    public interface GroupA1 {}

    @jakarta.validation.GroupSequence({ org.apache.bval.jsr.groups.GroupSequenceIsolationTest.B.class, org.apache.bval.jsr.groups.GroupSequenceIsolationTest.GroupB1.class })
    public static class B extends org.apache.bval.jsr.groups.GroupSequenceIsolationTest.A {
        @jakarta.validation.constraints.NotNull(groups = { org.apache.bval.jsr.groups.GroupSequenceIsolationTest.GroupB1.class })
        public java.lang.String b1;

        @jakarta.validation.constraints.NotNull
        public java.lang.String b2;
    }

    public interface GroupB1 {}

    // No group sequence definition
    public static class HolderWithNoGS extends org.apache.bval.jsr.groups.GroupSequenceIsolationTest.B {}

    @jakarta.validation.GroupSequence({ org.apache.bval.jsr.groups.GroupSequenceIsolationTest.GroupA1.class, org.apache.bval.jsr.groups.GroupSequenceIsolationTest.HolderWithGS.class, org.apache.bval.jsr.groups.GroupSequenceIsolationTest.GroupB1.class })
    public static class HolderWithGS extends org.apache.bval.jsr.groups.GroupSequenceIsolationTest.B {}
}
