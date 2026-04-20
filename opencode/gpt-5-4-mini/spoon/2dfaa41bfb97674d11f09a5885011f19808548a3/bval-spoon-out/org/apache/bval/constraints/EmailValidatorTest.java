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
package org.apache.bval.constraints;
import jakarta.validation.Validator;
import org.apache.bval.jsr.ApacheValidatorFactory;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
/**
 * EmailValidator Tester.
 *
 * @author Roman Stumm
 * @version 1.0
 * @since <pre>10/14/2008</pre>
 */
public class EmailValidatorTest {
    public static class EmailAddressBuilder {
        @org.apache.bval.constraints.Email
        private java.lang.StringBuilder buffer = new java.lang.StringBuilder();

        /**
         * Get the buffer.
         *
         * @return StringBuilder
         */
        public java.lang.StringBuilder getBuffer() {
            return buffer;
        }
    }

    private jakarta.validation.Validator validator;

    @org.junit.Before
    public void setUp() throws java.lang.Exception {
        validator = org.apache.bval.jsr.ApacheValidatorFactory.getDefault().getValidator();
    }

    @org.junit.Test
    public void testEmail() {
        org.apache.bval.jsr.example.Customer customer = new org.apache.bval.jsr.example.Customer();
        customer.setCustomerId("id-1");
        customer.setFirstName("Mary");
        customer.setLastName("Do");
        customer.setPassword("12345");
        org.junit.Assert.assertTrue(validator.validate(customer).isEmpty());
        customer.setEmailAddress("some@invalid@address");
        org.junit.Assert.assertEquals(1, validator.validate(customer).size());
        customer.setEmailAddress("some.valid-012345@address_at-test.org");
        org.junit.Assert.assertTrue(validator.validate(customer).isEmpty());
        customer.setEmailAddress("permit^circumflex^aka^caret@address_at-test.org");
        org.junit.Assert.assertTrue(validator.validate(customer).isEmpty());
    }

    @org.junit.Test
    public void testEmailCharSequence() {
        org.apache.bval.constraints.EmailValidatorTest.EmailAddressBuilder emailAddressBuilder = new org.apache.bval.constraints.EmailValidatorTest.EmailAddressBuilder();
        org.junit.Assert.assertTrue(validator.validate(emailAddressBuilder).isEmpty());
        emailAddressBuilder.getBuffer().append("foo");
        org.junit.Assert.assertEquals(1, validator.validate(emailAddressBuilder).size());
        emailAddressBuilder.getBuffer().append('@');
        org.junit.Assert.assertEquals(1, validator.validate(emailAddressBuilder).size());
        emailAddressBuilder.getBuffer().append("bar");
        org.junit.Assert.assertTrue(validator.validate(emailAddressBuilder).isEmpty());
        emailAddressBuilder.getBuffer().append('.');
        org.junit.Assert.assertEquals(1, validator.validate(emailAddressBuilder).size());
        emailAddressBuilder.getBuffer().append("baz");
        org.junit.Assert.assertTrue(validator.validate(emailAddressBuilder).isEmpty());
    }
}
