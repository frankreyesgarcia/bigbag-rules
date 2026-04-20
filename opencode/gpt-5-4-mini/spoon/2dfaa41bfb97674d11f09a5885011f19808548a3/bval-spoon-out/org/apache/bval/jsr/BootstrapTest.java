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
import jakarta.validation.Configuration;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.ConstraintValidatorFactory;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.ValidationException;
import jakarta.validation.ValidationProviderResolver;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.bootstrap.ProviderSpecificBootstrap;
import jakarta.validation.spi.ValidationProvider;
import org.apache.bval.constraints.NotNullValidator;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
/**
 * Description: <br/>
 */
public class BootstrapTest {
    @org.junit.Rule
    public org.junit.rules.ExpectedException thrown = org.junit.rules.ExpectedException.none();

    @org.junit.Test
    public void testDirectBootstrap() {
        jakarta.validation.Validator validator = org.apache.bval.jsr.ApacheValidatorFactory.getDefault().getValidator();
        org.junit.Assert.assertNotNull(validator);
        org.junit.Assert.assertTrue(org.apache.bval.jsr.ApacheValidatorFactory.getDefault() == org.apache.bval.jsr.ApacheValidatorFactory.getDefault());
    }

    @org.junit.Test
    public void testEverydayBootstrap() {
        org.apache.bval.jsr.ApacheValidatorFactory factory = ((org.apache.bval.jsr.ApacheValidatorFactory) (jakarta.validation.Validation.buildDefaultValidatorFactory()));
        jakarta.validation.Validator validator = factory.getValidator();
        org.junit.Assert.assertNotNull(validator);
        // each call to Validation.getValidationBuilder() returns a new builder
        // with new state
        org.apache.bval.jsr.ApacheValidatorFactory factory2 = ((org.apache.bval.jsr.ApacheValidatorFactory) (jakarta.validation.Validation.buildDefaultValidatorFactory()));
        org.junit.Assert.assertTrue(factory2 != factory);
        org.junit.Assert.assertTrue(factory2.getMessageInterpolator() != factory.getMessageInterpolator());
    }

    @org.junit.Test
    public void testLocalizedMessageInterpolatorFactory() {
        jakarta.validation.Configuration<?> builder = jakarta.validation.Validation.byDefaultProvider().configure();
        // changing the builder allows to create different factories
        org.apache.bval.jsr.DefaultMessageInterpolator interpolator = new org.apache.bval.jsr.DefaultMessageInterpolator();
        builder.messageInterpolator(interpolator);
        org.apache.bval.jsr.ApacheValidatorFactory factory = ((org.apache.bval.jsr.ApacheValidatorFactory) (builder.buildValidatorFactory()));
        ((org.apache.bval.jsr.DefaultMessageInterpolator) (factory.getMessageInterpolator())).setLocale(java.util.Locale.ENGLISH);
        // now factory's message resolver is using the english locale
    }

    /**
     * some tests based on RI tested behaviors to ensure our implementation
     * works as the reference implementation
     */
    @org.junit.Test
    public void testCustomConstraintFactory() {
        jakarta.validation.Configuration<?> builder = jakarta.validation.Validation.byDefaultProvider().configure();
        assertDefaultBuilderAndFactory(builder);
        jakarta.validation.ValidatorFactory factory = builder.buildValidatorFactory();
        jakarta.validation.Validator validator = factory.getValidator();
        org.apache.bval.jsr.example.Customer customer = new org.apache.bval.jsr.example.Customer();
        customer.setFirstName("John");
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.Customer>> ConstraintViolations = validator.validate(customer);
        org.junit.Assert.assertFalse(ConstraintViolations.isEmpty());
        builder = jakarta.validation.Validation.byDefaultProvider().configure();
        builder.constraintValidatorFactory(new jakarta.validation.ConstraintValidatorFactory() {
            @java.lang.Override
            public <T extends jakarta.validation.ConstraintValidator<?, ?>> T getInstance(java.lang.Class<T> key) {
                if (key == org.apache.bval.constraints.NotNullValidator.class) {
                    @java.lang.SuppressWarnings("unchecked")
                    final T result = ((T) (new org.apache.bval.jsr.BootstrapTest.BadlyBehavedNotNullValidator()));
                    return result;
                }
                return new org.apache.bval.jsr.DefaultConstraintValidatorFactory().getInstance(key);
            }

            @java.lang.Override
            public void releaseInstance(jakarta.validation.ConstraintValidator<?, ?> instance) {
                // no-op
            }
        });
        factory = builder.buildValidatorFactory();
        validator = factory.getValidator();
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.Customer>> ConstraintViolations2 = validator.validate(customer);
        org.junit.Assert.assertTrue("Wrong number of constraints", ConstraintViolations.size() > ConstraintViolations2.size());
    }

    @org.junit.Test
    public void testCustomResolverAndType() {
        jakarta.validation.ValidationProviderResolver resolver = new jakarta.validation.ValidationProviderResolver() {
            @java.lang.Override
            public java.util.List<jakarta.validation.spi.ValidationProvider<?>> getValidationProviders() {
                java.util.List<jakarta.validation.spi.ValidationProvider<?>> list = new java.util.ArrayList<jakarta.validation.spi.ValidationProvider<?>>(1);
                list.add(new org.apache.bval.jsr.ApacheValidationProvider());
                return list;
            }
        };
        org.apache.bval.jsr.ApacheValidatorConfiguration builder = jakarta.validation.Validation.byProvider(org.apache.bval.jsr.ApacheValidationProvider.class).providerResolver(resolver).configure();
        assertDefaultBuilderAndFactory(builder);
    }

    @org.junit.Test
    public void testCustomResolver() {
        jakarta.validation.ValidationProviderResolver resolver = new jakarta.validation.ValidationProviderResolver() {
            @java.lang.Override
            public java.util.List<jakarta.validation.spi.ValidationProvider<?>> getValidationProviders() {
                return java.util.Collections.<jakarta.validation.spi.ValidationProvider<?>>singletonList(new org.apache.bval.jsr.ApacheValidationProvider());
            }
        };
        jakarta.validation.Configuration<?> builder = jakarta.validation.Validation.byDefaultProvider().providerResolver(resolver).configure();
        assertDefaultBuilderAndFactory(builder);
    }

    private void assertDefaultBuilderAndFactory(jakarta.validation.Configuration<?> builder) {
        org.junit.Assert.assertNotNull(builder);
        org.junit.Assert.assertTrue(builder instanceof org.apache.bval.jsr.ConfigurationImpl);
        jakarta.validation.ValidatorFactory factory = builder.buildValidatorFactory();
        org.junit.Assert.assertNotNull(factory);
        org.junit.Assert.assertTrue(factory instanceof org.apache.bval.jsr.ApacheValidatorFactory);
    }

    @org.junit.Test
    public void testFailingCustomResolver() {
        jakarta.validation.ValidationProviderResolver resolver = new jakarta.validation.ValidationProviderResolver() {
            @java.lang.Override
            public java.util.List<jakarta.validation.spi.ValidationProvider<?>> getValidationProviders() {
                return java.util.Collections.emptyList();
            }
        };
        jakarta.validation.bootstrap.ProviderSpecificBootstrap<org.apache.bval.jsr.ApacheValidatorConfiguration> type = jakarta.validation.Validation.byProvider(org.apache.bval.jsr.ApacheValidationProvider.class);
        final jakarta.validation.bootstrap.ProviderSpecificBootstrap<org.apache.bval.jsr.ApacheValidatorConfiguration> specializedBuilderFactory = type.providerResolver(resolver);
        thrown.expect(jakarta.validation.ValidationException.class);
        thrown.expectMessage("provider");
        thrown.expectMessage(org.apache.bval.jsr.ApacheValidationProvider.class.getName());
        specializedBuilderFactory.configure();
    }

    class BadlyBehavedNotNullValidator extends org.apache.bval.constraints.NotNullValidator {
        @java.lang.Override
        public boolean isValid(java.lang.Object object, jakarta.validation.ConstraintValidatorContext context) {
            return true;
        }
    }
}
