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
package org.apache.bval.jsr.groups.implicit;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.apache.bval.jsr.ApacheValidatorFactory;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
/**
 * Description: test spec chapter 3.4.4. Implicit grouping<br/>
 */
public class ImplicitGroupingTest {
    private jakarta.validation.Validator validator;

    @org.junit.Before
    public void setUp() {
        validator = org.apache.bval.jsr.ApacheValidatorFactory.getDefault().getValidator();
    }

    @org.junit.Test
    public void testValidateImplicitGrouping() {
        org.apache.bval.jsr.groups.implicit.Order order = new org.apache.bval.jsr.groups.implicit.Order();
        // When an Order object is validated on the Default group, ...
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.groups.implicit.Order>> violations = validator.validate(order);
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolation(violations, "creationDate"));
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolation(violations, "lastUpdate"));
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolation(violations, "lastModifier"));
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolation(violations, "lastReader"));
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolation(violations, "orderNumber"));
        org.junit.Assert.assertEquals(5, violations.size());
        // When an Order object is validated on the Auditable group, ...
        /* Only the constraints present on Auditable (and any of its super interfaces)
        and belonging to the Default group are validated
        when the group Auditable is requested.
         */
        violations = validator.validate(order, org.apache.bval.jsr.groups.implicit.Auditable.class);
        org.junit.Assert.assertEquals("Implicit grouping not correctly implemented", 4, violations.size());
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolation(violations, "creationDate"));
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolation(violations, "lastUpdate"));
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolation(violations, "lastModifier"));
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolation(violations, "lastReader"));
    }
}
