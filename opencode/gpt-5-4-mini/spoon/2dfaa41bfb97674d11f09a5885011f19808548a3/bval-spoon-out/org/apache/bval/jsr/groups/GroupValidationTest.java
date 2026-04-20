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
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
/**
 * Description: test features from spec chapter 3.4 group and group sequence
 * <br/>
 */
public class GroupValidationTest extends org.apache.bval.jsr.ValidationTestBase {
    /**
     * test spec: @NotNull on firstname and on lastname are validated when the
     * Default group is validated.
     */
    @org.junit.Test
    public void testValidateFirstNameLastNameWithDefaultGroup() {
        org.apache.bval.jsr.groups.BillableUser user = new org.apache.bval.jsr.groups.BillableUser();
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.groups.BillableUser>> violations = validator.validate(user);
        org.junit.Assert.assertEquals(2, violations.size());
        jakarta.validation.ConstraintViolation<?> violation = org.apache.bval.jsr.util.TestUtils.getViolation(violations, "firstname");
        org.junit.Assert.assertNotNull(violation);
        org.junit.Assert.assertEquals(user, violation.getRootBean());
        violation = org.apache.bval.jsr.util.TestUtils.getViolation(violations, "lastname");
        org.junit.Assert.assertNotNull(violation);
        org.junit.Assert.assertEquals(user, violation.getRootBean());
    }

    /**
     * test spec: @NotNull is checked on defaultCreditCard when either the
     * Billable or BuyInOneClick group is validated.
     */
    @org.junit.Test
    public void testValidateDefaultCreditCardInBillableGroup() {
        org.apache.bval.jsr.groups.BillableUser user = new org.apache.bval.jsr.groups.BillableUser();
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.groups.BillableUser>> violations = validator.validate(user, org.apache.bval.jsr.groups.Billable.class);
        org.junit.Assert.assertEquals(1, violations.size());
        jakarta.validation.ConstraintViolation<?> violation = org.apache.bval.jsr.util.TestUtils.getViolation(violations, "defaultCreditCard");
        org.junit.Assert.assertNotNull(violation);
        org.junit.Assert.assertEquals(user, violation.getRootBean());
    }

    @org.junit.Test
    public void testValidateDefaultCreditCardInBillableAndByInOneClickGroup() {
        org.apache.bval.jsr.groups.BillableUser user = new org.apache.bval.jsr.groups.BillableUser();
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.groups.BillableUser>> violations = validator.validate(user, org.apache.bval.jsr.groups.BuyInOneClick.class, org.apache.bval.jsr.groups.Billable.class);
        org.junit.Assert.assertEquals(1, violations.size());
        jakarta.validation.ConstraintViolation<?> violation = org.apache.bval.jsr.util.TestUtils.getViolation(violations, "defaultCreditCard");
        org.junit.Assert.assertNotNull(violation);
        org.junit.Assert.assertEquals(user, violation.getRootBean());
    }
}
