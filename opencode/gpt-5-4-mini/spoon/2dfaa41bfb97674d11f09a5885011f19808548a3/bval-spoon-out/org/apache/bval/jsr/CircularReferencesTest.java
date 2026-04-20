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
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Checks that circular references in the bean graph are correctly detected when
 * validating.
 *
 * @author Carlos Vara
 */
public class CircularReferencesTest extends org.apache.bval.jsr.ValidationTestBase {
    /**
     * Checks that validation correctly stops when finding a circular
     * dependency.
     */
    @org.junit.Test
    public void testAutoreferringBean() {
        org.apache.bval.jsr.CircularReferencesTest.Person p1 = new org.apache.bval.jsr.CircularReferencesTest.Person();
        p1.name = "too-long-name";
        p1.sibling = p1;
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.CircularReferencesTest.Person>> violations = validator.validate(p1);
        org.junit.Assert.assertEquals("Only 1 violation should be reported", 1, violations.size());
        jakarta.validation.ConstraintViolation<org.apache.bval.jsr.CircularReferencesTest.Person> violation = violations.iterator().next();
        org.junit.Assert.assertEquals("Incorrect violation path", "name", violation.getPropertyPath().toString());
    }

    /**
     * Checks that a bean is always validated when appearing in non-circular
     * paths inside the bean graph.
     */
    @org.junit.Test
    public void testNonCircularArrayOfSameBean() {
        org.apache.bval.jsr.CircularReferencesTest.Boss boss = new org.apache.bval.jsr.CircularReferencesTest.Boss();
        org.apache.bval.jsr.CircularReferencesTest.Person p1 = new org.apache.bval.jsr.CircularReferencesTest.Person();
        p1.name = "too-long-name";
        boss.employees = new org.apache.bval.jsr.CircularReferencesTest.Person[]{ p1, p1, p1, p1 };
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.CircularReferencesTest.Boss>> violations = validator.validate(boss);
        org.junit.Assert.assertEquals("A total of 4 violations should be reported", 4, violations.size());
    }

    public static class Person {
        @jakarta.validation.Valid
        public org.apache.bval.jsr.CircularReferencesTest.Person sibling;

        @jakarta.validation.constraints.Size(max = 10)
        public java.lang.String name;
    }

    public static class Boss {
        @jakarta.validation.Valid
        public org.apache.bval.jsr.CircularReferencesTest.Person[] employees;
    }
}
