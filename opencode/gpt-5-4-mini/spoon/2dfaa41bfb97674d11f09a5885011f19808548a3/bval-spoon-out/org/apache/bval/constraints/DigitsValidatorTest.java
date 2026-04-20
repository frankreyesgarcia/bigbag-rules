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
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
/**
 * DigitsConstraintValidator Tester.
 *
 * @author <Authors name>
 * @since <pre>02/03/2009</pre>
 * @version 1.0
 */
public class DigitsValidatorTest {
    @org.junit.Test
    public void testValidateNumber() {
        org.apache.bval.constraints.DigitsValidatorForNumber validator = new org.apache.bval.constraints.DigitsValidatorForNumber();
        validator.setFractional(4);
        validator.setIntegral(2);
        org.junit.Assert.assertFalse(validator.isValid(new java.math.BigDecimal("100.1234"), null));
        org.junit.Assert.assertFalse(validator.isValid(new java.math.BigDecimal("99.12345"), null));
        org.junit.Assert.assertTrue(validator.isValid(new java.math.BigDecimal("99.1234"), null));
        org.junit.Assert.assertFalse(validator.isValid(java.lang.Double.valueOf(100.1234), null));
        org.junit.Assert.assertFalse(validator.isValid(java.lang.Double.valueOf(99.12345), null));
        org.junit.Assert.assertTrue(validator.isValid(java.lang.Double.valueOf(99.1234), null));
        org.junit.Assert.assertTrue(validator.isValid(java.lang.Double.valueOf(99.1234), null));
        org.junit.Assert.assertTrue(validator.isValid(new java.math.BigDecimal("99.123400"), null));
    }

    @org.junit.Test
    public void testValidateString() {
        org.apache.bval.constraints.DigitsValidatorForString validator = new org.apache.bval.constraints.DigitsValidatorForString();
        validator.setFractional(4);
        validator.setIntegral(2);
        org.junit.Assert.assertFalse(validator.isValid("100.12345", null));
        org.junit.Assert.assertTrue(validator.isValid("99.1234", null));
    }

    @org.junit.Test
    public void testValidateNumber2() {
        org.apache.bval.constraints.DigitsValidatorForNumber validator = new org.apache.bval.constraints.DigitsValidatorForNumber();
        validator.setFractional(4);
        validator.setIntegral(2);
        org.junit.Assert.assertFalse(validator.isValid(java.lang.Long.valueOf("100"), null));
        org.junit.Assert.assertTrue(validator.isValid(java.lang.Long.valueOf("99"), null));
    }

    @org.junit.Test
    public void testValidateString2() {
        org.apache.bval.constraints.DigitsValidatorForString validator = new org.apache.bval.constraints.DigitsValidatorForString();
        validator.setFractional(0);
        validator.setIntegral(2);
        org.junit.Assert.assertFalse(validator.isValid("99.5", null));
        org.junit.Assert.assertTrue(validator.isValid("99", null));
    }
}
