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
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotNull;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
/**
 * Description: test that payload information can be retrieved
 * from error reports via the ConstraintDescriptor either accessed
 * through the ConstraintViolation objects<br/>
 */
public class PayloadTest extends org.apache.bval.jsr.ValidationTestBase {
    static class Severity {
        static class Info implements jakarta.validation.Payload {}

        static class Error implements jakarta.validation.Payload {}
    }

    static class Address {
        private java.lang.String zipCode;

        private java.lang.String city;

        Address(java.lang.String zipCode, java.lang.String city) {
            this.zipCode = zipCode;
            this.city = city;
        }

        @jakarta.validation.constraints.NotNull(message = "would be nice if we had one", payload = org.apache.bval.jsr.PayloadTest.Severity.Info.class)
        public java.lang.String getZipCode() {
            return zipCode;
        }

        @jakarta.validation.constraints.NotNull(message = "the city is mandatory", payload = org.apache.bval.jsr.PayloadTest.Severity.Error.class)
        public java.lang.String getCity() {
            return city;
        }
    }

    @org.junit.Test
    public void testPayload() {
        org.apache.bval.jsr.PayloadTest.Address address = new org.apache.bval.jsr.PayloadTest.Address(null, null);
        final java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.PayloadTest.Address>> violations = validator.validate(address);
        org.junit.Assert.assertEquals(2, violations.size());
        final jakarta.validation.ConstraintViolation<?> zipViolation = org.apache.bval.jsr.util.TestUtils.getViolation(violations, "zipCode");
        org.junit.Assert.assertNotNull(zipViolation);
        org.junit.Assert.assertEquals(1, zipViolation.getConstraintDescriptor().getPayload().size());
        org.junit.Assert.assertTrue(zipViolation.getConstraintDescriptor().getPayload().contains(org.apache.bval.jsr.PayloadTest.Severity.Info.class));
        final jakarta.validation.ConstraintViolation<?> cityViolation = org.apache.bval.jsr.util.TestUtils.getViolation(violations, "city");
        org.junit.Assert.assertNotNull(cityViolation);
        org.junit.Assert.assertEquals(1, cityViolation.getConstraintDescriptor().getPayload().size());
        org.junit.Assert.assertTrue(cityViolation.getConstraintDescriptor().getPayload().contains(org.apache.bval.jsr.PayloadTest.Severity.Error.class));
    }
}
