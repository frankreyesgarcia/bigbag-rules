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
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.UnexpectedTypeException;
import jakarta.validation.constraints.Max;
import jakarta.validation.metadata.BeanDescriptor;
import jakarta.validation.metadata.ConstraintDescriptor;
import jakarta.validation.metadata.ElementDescriptor;
import jakarta.validation.metadata.PropertyDescriptor;
import org.apache.bval.constraints.SizeValidator;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
/**
 * Description: <br/>
 */
public class Jsr303Test extends org.apache.bval.jsr.ValidationTestBase {
    @org.junit.Rule
    public org.junit.rules.ExpectedException thrown = org.junit.rules.ExpectedException.none();

    @org.junit.Test
    public void testPropertyDescriptorHasConstraints() {
        jakarta.validation.metadata.BeanDescriptor cons = validator.getConstraintsForClass(org.apache.bval.jsr.example.Book.class);
        org.junit.Assert.assertTrue(cons.getConstraintsForProperty("author").hasConstraints());
        org.junit.Assert.assertTrue(cons.getConstraintsForProperty("title").hasConstraints());
        org.junit.Assert.assertTrue(cons.getConstraintsForProperty("uselessField").hasConstraints());
        // cons.getConstraintsForProperty("unconstraintField") == null without
        // Introspector
        // cons.getConstraintsForProperty("unconstraintField") != null with
        // Introspector
        org.junit.Assert.assertTrue((cons.getConstraintsForProperty("unconstraintField") == null) || (!cons.getConstraintsForProperty("unconstraintField").hasConstraints()));
        org.junit.Assert.assertNull(cons.getConstraintsForProperty("unknownField"));
    }

    @org.junit.Test
    public void testValidateValue() {
        org.junit.Assert.assertTrue(validator.validateValue(org.apache.bval.jsr.example.Book.class, "subtitle", "123456789098765432").isEmpty());
        org.junit.Assert.assertFalse(validator.validateValue(org.apache.bval.jsr.example.Book.class, "subtitle", "123456789098765432123412345678909876543212341234564567890987654321234", org.apache.bval.jsr.example.Second.class).isEmpty());
        // tests for issue 22: validation of a field without any constraints
        org.junit.Assert.assertTrue(validator.validateValue(org.apache.bval.jsr.example.Book.class, "unconstraintField", 4).isEmpty());
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testUnknownProperty() {
        // tests for issue 22: validation of unknown field cause
        // ValidationException
        validator.validateValue(org.apache.bval.jsr.example.Book.class, "unknownProperty", 4);
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    @org.junit.Ignore
    public void testValidateNonCascadedRealNestedProperty() {
        validator.validateValue(org.apache.bval.jsr.example.IllustratedBook.class, "illustrator.firstName", "Edgar");
    }

    @org.junit.Test
    public void testMetadataAPI_Book() {
        org.junit.Assert.assertNotNull(validator.getConstraintsForClass(org.apache.bval.jsr.example.Book.class));
        // not necessary for implementation correctness, but we'll test
        // nevertheless:
        org.junit.Assert.assertSame(validator.getConstraintsForClass(org.apache.bval.jsr.example.Book.class), validator.getConstraintsForClass(org.apache.bval.jsr.example.Book.class));
        jakarta.validation.metadata.BeanDescriptor bc = validator.getConstraintsForClass(org.apache.bval.jsr.example.Book.class);
        org.junit.Assert.assertEquals(org.apache.bval.jsr.example.Book.class, bc.getElementClass());
        org.junit.Assert.assertNotNull(bc.getConstraintDescriptors());
        org.apache.bval.jsr.util.TestUtils.failOnModifiable(bc.getConstraintDescriptors(), "beanDescriptor constraintDescriptors");
    }

    @org.junit.Test
    public void testMetadataAPI_Engine() {
        jakarta.validation.metadata.ElementDescriptor desc = validator.getConstraintsForClass(org.apache.bval.jsr.example.Engine.class).getConstraintsForProperty("serialNumber");
        org.junit.Assert.assertNotNull(desc);
        org.junit.Assert.assertEquals(java.lang.String.class, desc.getElementClass());
    }

    @org.junit.Test
    public void testMetadataAPI_Address() {
        org.junit.Assert.assertFalse(validator.getConstraintsForClass(org.apache.bval.jsr.example.Address.class).getConstraintDescriptors().isEmpty());
        java.util.Set<jakarta.validation.metadata.PropertyDescriptor> props = validator.getConstraintsForClass(org.apache.bval.jsr.example.Address.class).getConstrainedProperties();
        org.apache.bval.jsr.util.TestUtils.failOnModifiable(props, "beanDescriptor constrainedProperties");
        java.util.Set<java.lang.String> propNames = new java.util.HashSet<java.lang.String>(props.size());
        for (jakarta.validation.metadata.PropertyDescriptor each : props) {
            org.apache.bval.jsr.util.TestUtils.failOnModifiable(each.getConstraintDescriptors(), "propertyDescriptor constraintDescriptors");
            propNames.add(each.getPropertyName());
        }
        org.junit.Assert.assertTrue(propNames.contains("addressline1"));// annotated at

        // field level
        org.junit.Assert.assertTrue(propNames.contains("addressline2"));
        org.junit.Assert.assertTrue(propNames.contains("zipCode"));
        org.junit.Assert.assertTrue(propNames.contains("country"));
        org.junit.Assert.assertTrue(propNames.contains("city"));// annotated at method

        // level
        org.junit.Assert.assertEquals(5, props.size());
        jakarta.validation.metadata.ElementDescriptor desc = validator.getConstraintsForClass(org.apache.bval.jsr.example.Address.class).getConstraintsForProperty("addressline1");
        org.junit.Assert.assertNotNull(desc);
        boolean found = false;
        for (jakarta.validation.metadata.ConstraintDescriptor<?> each : desc.getConstraintDescriptors()) {
            if (each.getConstraintValidatorClasses().contains(SizeValidator.ForCharSequence.class)) {
                org.junit.Assert.assertTrue(each.getAttributes().containsKey("max"));
                org.junit.Assert.assertEquals(30, each.getAttributes().get("max"));
                found = true;
            }
        }
        org.junit.Assert.assertTrue(found);
    }

    @org.junit.Test
    public void testValidateMultiValuedConstraints() {
        org.apache.bval.jsr.example.Engine engine = new org.apache.bval.jsr.example.Engine();
        engine.serialNumber = "abcd-defg-0123";
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.Engine>> violations;
        violations = validator.validate(engine);
        org.junit.Assert.assertEquals(0, violations.size());
        engine.serialNumber = "!)/(/()";
        violations = validator.validate(engine);
        org.junit.Assert.assertEquals(2, violations.size());
        for (java.lang.String msg : java.util.Arrays.asList("must contain alphabetical characters only", "must match ....-....-....")) {
            org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolationWithMessage(violations, msg));
        }
    }

    @org.junit.Test
    public void testConstraintValidatorResolutionAlgorithm() {
        org.apache.bval.jsr.example.MaxTestEntity entity = new org.apache.bval.jsr.example.MaxTestEntity();
        entity.setText("101");
        entity.setProperty("201");
        entity.setLongValue(301);
        entity.setDecimalValue(new java.math.BigDecimal(401));
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.MaxTestEntity>> violations = validator.validate(entity);
        org.junit.Assert.assertEquals(4, violations.size());
    }

    @org.junit.Test
    public void testConstraintValidatorResolutionAlgorithm2() {
        thrown.expect(jakarta.validation.UnexpectedTypeException.class);
        thrown.expectMessage(java.lang.String.format("No compliant %s %s found for annotated element of type %s", jakarta.validation.constraints.Max.class.getName(), jakarta.validation.ConstraintValidator.class.getSimpleName(), java.lang.Object.class.getName()));
        org.apache.bval.jsr.example.NoValidatorTestEntity entity2 = new org.apache.bval.jsr.example.NoValidatorTestEntity();
        validator.validate(entity2);
    }

    @org.junit.Test
    public void testSizeValidation() {
        org.apache.bval.jsr.example.SizeTestEntity en = new org.apache.bval.jsr.example.SizeTestEntity();
        en.ba = new byte[3];
        en.ca = new char[3];
        en.boa = new boolean[3];
        en.coll = java.util.Arrays.asList("1", "2", "3");
        en.da = new double[3];
        en.fa = new float[3];
        en.it = new int[3];
        en.la = new long[3];
        en.map = new java.util.HashMap<java.lang.String, java.lang.String>();
        en.map.put("1", "1");
        en.map.put("3", "3");
        en.map.put("2", "2");
        en.oa = new java.lang.Integer[3];
        en.oa2 = new java.lang.Integer[3];
        en.sa = new short[3];
        en.text = "123";
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.SizeTestEntity>> vi = validator.validate(en);
        org.junit.Assert.assertEquals(13, vi.size());
    }

    /**
     * JSR-303 Section 5.1.c, IllegalArgumentException should be thrown
     */
    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testGetConstraintsForNullClass() {
        validator.getConstraintsForClass(null);
    }
}
