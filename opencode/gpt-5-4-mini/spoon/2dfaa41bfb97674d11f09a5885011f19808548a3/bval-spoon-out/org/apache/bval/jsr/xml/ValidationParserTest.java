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
package org.apache.bval.jsr.xml;
import jakarta.validation.BootstrapConfiguration;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.ValidationException;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.apache.bval.jsr.ApacheValidationProvider;
import org.apache.bval.jsr.ApacheValidatorConfiguration;
import org.apache.bval.jsr.ConfigurationImpl;
import org.apache.bval.jsr.resolver.SimpleTraversableResolver;
import org.apache.bval.util.reflection.Reflection;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;
/**
 * ValidationParser Tester.
 */
public class ValidationParserTest implements org.apache.bval.jsr.ApacheValidatorConfiguration.Properties {
    @org.junit.Rule
    public org.junit.rules.ExpectedException thrown = org.junit.rules.ExpectedException.none();

    private org.apache.bval.jsr.xml.ValidationParser validationParser;

    @org.junit.Before
    public void setup() {
        validationParser = new org.apache.bval.jsr.xml.ValidationParser(org.apache.bval.util.reflection.Reflection.loaderFromThreadOrClass(org.apache.bval.jsr.xml.ValidationParserTest.class));
    }

    @org.junit.Test
    public void testGetInputStream() throws java.io.IOException {
        org.junit.Assert.assertNotNull(validationParser.getInputStream("sample-validation.xml"));
        // make sure there are duplicate resources on the classpath before the next checks:
        final java.util.Enumeration<java.net.URL> resources = org.apache.bval.util.reflection.Reflection.loaderFromClassOrThread(org.apache.bval.jsr.xml.ValidationParser.class).getResources("META-INF/MANIFEST.MF");
        org.junit.Assume.assumeTrue(resources.hasMoreElements());
        resources.nextElement();
        org.junit.Assume.assumeTrue(resources.hasMoreElements());
    }

    @org.junit.Test
    public void testGetNonUniqueInputStream() throws java.io.IOException {
        thrown.expect(jakarta.validation.ValidationException.class);
        thrown.expectMessage("More than ");
        validationParser.getInputStream("META-INF/MANIFEST.MF");// this is available in multiple jars hopefully

    }

    @org.junit.Test
    public void testParse() {
        org.apache.bval.jsr.ConfigurationImpl config = new org.apache.bval.jsr.ConfigurationImpl(null, new org.apache.bval.jsr.ApacheValidationProvider());
        final jakarta.validation.BootstrapConfiguration configuration = validationParser.processValidationConfig("sample-validation.xml", config);
        org.junit.Assert.assertEquals("org.apache.bval.jsr.xml.TestMessageInterpolator", configuration.getMessageInterpolatorClassName());
    }

    @org.junit.Test
    public void testParseV11() {
        org.apache.bval.jsr.ConfigurationImpl config = new org.apache.bval.jsr.ConfigurationImpl(null, new org.apache.bval.jsr.ApacheValidationProvider());
        final jakarta.validation.BootstrapConfiguration configuration = validationParser.processValidationConfig("sample-validation11.xml", config);
        org.junit.Assert.assertEquals("org.apache.bval.jsr.xml.TestMessageInterpolator", configuration.getMessageInterpolatorClassName());
    }

    @org.junit.Test
    public void testParseV20() {
        org.apache.bval.jsr.ConfigurationImpl config = new org.apache.bval.jsr.ConfigurationImpl(null, new org.apache.bval.jsr.ApacheValidationProvider());
        final jakarta.validation.BootstrapConfiguration configuration = validationParser.processValidationConfig("sample-validation2.xml", config);
        org.junit.Assert.assertEquals("org.apache.bval.jsr.xml.TestMessageInterpolator", configuration.getMessageInterpolatorClassName());
    }

    @org.junit.Test
    public void testParseV30() {
        org.apache.bval.jsr.ConfigurationImpl config = new org.apache.bval.jsr.ConfigurationImpl(null, new org.apache.bval.jsr.ApacheValidationProvider());
        final jakarta.validation.BootstrapConfiguration configuration = validationParser.processValidationConfig("sample-validation3.xml", config);
        org.junit.Assert.assertEquals("org.apache.bval.jsr.xml.TestMessageInterpolator", configuration.getMessageInterpolatorClassName());
    }

    @org.junit.Test
    public void testConfigureFromXml() {
        jakarta.validation.ValidatorFactory factory = getFactory();
        org.junit.Assert.assertThat(factory.getMessageInterpolator(), org.hamcrest.CoreMatchers.instanceOf(org.apache.bval.jsr.xml.TestMessageInterpolator.class));
        org.junit.Assert.assertThat(factory.getConstraintValidatorFactory(), org.hamcrest.CoreMatchers.instanceOf(org.apache.bval.jsr.xml.TestConstraintValidatorFactory.class));
        org.junit.Assert.assertThat(factory.getTraversableResolver(), org.hamcrest.CoreMatchers.instanceOf(org.apache.bval.jsr.resolver.SimpleTraversableResolver.class));
        org.junit.Assert.assertNotNull(factory.getValidator());
    }

    private jakarta.validation.ValidatorFactory getFactory() {
        org.apache.bval.jsr.ApacheValidatorConfiguration config = jakarta.validation.Validation.byProvider(org.apache.bval.jsr.ApacheValidationProvider.class).configure();
        config.addProperty(org.apache.bval.jsr.xml.VALIDATION_XML_PATH, "sample-validation.xml");
        return config.buildValidatorFactory();
    }

    @org.junit.Test
    public void testXmlEntitySample() {
        org.apache.bval.jsr.example.XmlEntitySampleBean bean = new org.apache.bval.jsr.example.XmlEntitySampleBean();
        bean.setFirstName("tooooooooooooooooooooooooooo long");
        bean.setValueCode("illegal");
        jakarta.validation.Validator validator = getFactory().getValidator();
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.XmlEntitySampleBean>> results = validator.validate(bean);
        org.junit.Assert.assertFalse(results.isEmpty());
        org.junit.Assert.assertEquals(3, results.size());
        bean.setZipCode("123");
        bean.setValueCode("20");
        bean.setFirstName("valid");
        results = validator.validate(bean);
        org.junit.Assert.assertTrue(results.isEmpty());
    }
}
