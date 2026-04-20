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
package org.apache.bval.jsr.groups.redefining;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.GroupDefinitionException;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
/**
 * Description: test Redefining the Default group for a class (spec. chapter 3.4.3)<br/>
 */
public class RedefiningDefaultGroupTest extends org.apache.bval.jsr.ValidationTestBase {
    /**
     * when an address object is validated for the group Default,
     * all constraints belonging to the group Default and hosted on Address are evaluated
     */
    @org.junit.Test
    public void testValidateDefaultGroup() {
        org.apache.bval.jsr.groups.redefining.Address address = new org.apache.bval.jsr.groups.redefining.Address();
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.groups.redefining.Address>> violations = validator.validate(address);
        org.junit.Assert.assertEquals(3, violations.size());
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolation(violations, "street1"));
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolation(violations, "zipCode"));
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolation(violations, "city"));
        address.setStreet1("Elmstreet");
        address.setZipCode("1234");
        address.setCity("Gotham City");
        violations = validator.validate(address);
        org.junit.Assert.assertTrue(violations.isEmpty());
        violations = validator.validate(address, org.apache.bval.jsr.groups.redefining.Address.HighLevelCoherence.class);
        org.junit.Assert.assertTrue(violations.isEmpty());
        address.setCity("error");
        violations = validator.validate(address, org.apache.bval.jsr.groups.redefining.Address.HighLevelCoherence.class);
        org.junit.Assert.assertEquals(1, violations.size());
        /**
         * If none fails, all HighLevelCoherence constraints present on Address are evaluated.
         *
         * In other words, when validating the Default group for Address,
         * the group sequence defined on the Address class is used.
         */
        violations = validator.validate(address);
        org.junit.Assert.assertEquals("redefined default group for Address must also validate HighLevelCoherence", 1, violations.size());
    }

    @org.junit.Test
    public void testValidateProperty() {
        org.apache.bval.jsr.groups.redefining.Address address = new org.apache.bval.jsr.groups.redefining.Address();
        address.setStreet1("");
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.groups.redefining.Address>> violations = validator.validateProperty(address, "street1");
        // prove that ExtraCareful group was validated:
        org.junit.Assert.assertEquals(1, violations.size());
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolation(violations, "street1"));
    }

    @org.junit.Test
    public void testValidateValue() {
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.groups.redefining.Address>> violations = validator.validateValue(org.apache.bval.jsr.groups.redefining.Address.class, "street1", "");
        // prove that ExtraCareful group was validated:
        org.junit.Assert.assertEquals(1, violations.size());
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolation(violations, "street1"));
    }

    @org.junit.Test(expected = jakarta.validation.GroupDefinitionException.class)
    public void testRaiseGroupDefinitionException() {
        validator.validate(new org.apache.bval.jsr.groups.redefining.InvalidRedefinedDefaultGroupAddress());
    }
}
