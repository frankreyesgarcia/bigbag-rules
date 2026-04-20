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
import jakarta.validation.constraints.Size;
import jakarta.validation.metadata.ConstraintDescriptor;
import jakarta.validation.metadata.ElementDescriptor;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
/**
 * Description: <br/>
 */
public class ComposedConstraintsTest extends org.apache.bval.jsr.ValidationTestBase {
    @org.junit.Test
    public void testMetaDataAPI_ComposedConstraints() {
        jakarta.validation.metadata.ElementDescriptor ed = validator.getConstraintsForClass(org.apache.bval.jsr.example.FrenchAddress.class).getConstraintsForProperty("zipCode");
        org.junit.Assert.assertEquals(1, ed.getConstraintDescriptors().size());
        for (jakarta.validation.metadata.ConstraintDescriptor<?> cd : ed.getConstraintDescriptors()) {
            org.junit.Assert.assertTrue(cd.isReportAsSingleViolation());
            org.junit.Assert.assertEquals(3, cd.getComposingConstraints().size());
            org.junit.Assert.assertTrue("no composing constraints found!!", !cd.getComposingConstraints().isEmpty());
            processConstraintDescriptor(cd);// check all constraints on zip code

        }
    }

    private void processConstraintDescriptor(jakarta.validation.metadata.ConstraintDescriptor<?> cd) {
        // Size.class is understood by the tool
        if (jakarta.validation.constraints.Size.class.equals(cd.getAnnotation().annotationType())) {
            jakarta.validation.constraints.Size.class.cast(cd.getAnnotation());
        }
        for (jakarta.validation.metadata.ConstraintDescriptor<?> composingCd : cd.getComposingConstraints()) {
            // check composing constraints recursively
            processConstraintDescriptor(composingCd);
        }
    }

    @org.junit.Test
    public void testValidateComposed() {
        org.apache.bval.jsr.example.FrenchAddress adr = new org.apache.bval.jsr.example.FrenchAddress();
        {
            java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.FrenchAddress>> findings = validator.validate(adr);
            org.junit.Assert.assertEquals(1, findings.size());// with @ReportAsSingleConstraintViolation

            jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.FrenchAddress> finding = findings.iterator().next();
            org.junit.Assert.assertEquals("Wrong zipcode", finding.getMessage());
        }
        adr.setZipCode("1234567");
        org.junit.Assert.assertTrue(validator.validate(adr).isEmpty());
        adr.setZipCode("1234567234567");
        org.junit.Assert.assertEquals(1, validator.validate(adr).size());
        adr.setZipCode2(null);
        org.junit.Assert.assertEquals(2, validator.validate(adr).size());
    }

    @org.junit.Test
    public void testOverridesAttributeConstraintIndex() {
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.CompanyAddress>> findings = validator.validate(new org.apache.bval.jsr.example.CompanyAddress("invalid-string"));
        org.junit.Assert.assertEquals(2, findings.size());// without @ReportAsSingleConstraintViolation

        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolationWithMessage(findings, "Not COMPANY"));
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolationWithMessage(findings, "Not an email"));
        findings = validator.validate(new org.apache.bval.jsr.example.CompanyAddress("JOHN_DO@WEB.DE"));
        org.junit.Assert.assertEquals(1, findings.size());
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolationWithMessage(findings, "Not COMPANY"));
        findings = validator.validate(new org.apache.bval.jsr.example.CompanyAddress("JOHN_DO@COMPANY.DE"));
        org.junit.Assert.assertTrue(findings.isEmpty());
    }
}
