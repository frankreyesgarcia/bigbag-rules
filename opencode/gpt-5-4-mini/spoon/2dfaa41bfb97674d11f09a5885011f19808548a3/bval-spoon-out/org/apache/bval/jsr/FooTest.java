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
import jakarta.validation.constraints.NotNull;
import org.junit.Before;
import org.junit.Test;
/**
 * Description: <br/>
 */
public class FooTest extends org.apache.bval.jsr.ValidationTestBase {
    @jakarta.validation.Valid
    private java.util.Collection<org.apache.bval.jsr.FooTest.Foo> foos = new java.util.ArrayList<org.apache.bval.jsr.FooTest.Foo>();

    @org.junit.Before
    public void setup() {
        foos.add(new org.apache.bval.jsr.FooTest.Foo("foo1"));
        foos.add(null);
        foos.add(new org.apache.bval.jsr.FooTest.Foo("foo3"));
    }

    public static class Foo {
        @jakarta.validation.constraints.NotNull
        public java.lang.String bar;

        public Foo(java.lang.String bar) {
            this.bar = bar;
        }
    }

    @org.junit.Test
    public void testValidation() {
        org.apache.bval.jsr.FooTest t = new org.apache.bval.jsr.FooTest();
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.FooTest>> errors = validator.validate(t);
        java.lang.System.out.println("got errors:");
        for (jakarta.validation.ConstraintViolation<?> error : errors) {
            java.lang.System.out.println(error.getPropertyPath());
        }
    }
}
