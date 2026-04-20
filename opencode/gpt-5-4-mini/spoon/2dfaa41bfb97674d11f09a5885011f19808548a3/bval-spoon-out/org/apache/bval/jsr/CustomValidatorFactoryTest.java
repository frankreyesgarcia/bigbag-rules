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
import jakarta.validation.ClockProvider;
import jakarta.validation.ConstraintValidatorFactory;
import jakarta.validation.MessageInterpolator;
import jakarta.validation.ParameterNameProvider;
import jakarta.validation.TraversableResolver;
import jakarta.validation.Validation;
import jakarta.validation.ValidationException;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorContext;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.spi.ConfigurationState;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.hamcrest.CoreMatchers.isA;
/**
 * Test the ability to force a particular {@link ValidatorFactory}
 * implementation class.
 */
public class CustomValidatorFactoryTest {
    public static class CustomValidatorFactory extends org.apache.bval.jsr.ApacheValidatorFactory {
        /**
         * Create a new CustomValidatorFactory instance.
         *
         * @param configurationState
         */
        public CustomValidatorFactory(jakarta.validation.spi.ConfigurationState configurationState) {
            super(configurationState);
        }
    }

    public static class IncompatibleValidatorFactory implements jakarta.validation.ValidatorFactory {
        @java.lang.Override
        public jakarta.validation.ConstraintValidatorFactory getConstraintValidatorFactory() {
            return null;
        }

        @java.lang.Override
        public jakarta.validation.ParameterNameProvider getParameterNameProvider() {
            return null;
        }

        @java.lang.Override
        public jakarta.validation.MessageInterpolator getMessageInterpolator() {
            return null;
        }

        @java.lang.Override
        public jakarta.validation.TraversableResolver getTraversableResolver() {
            return null;
        }

        @java.lang.Override
        public jakarta.validation.Validator getValidator() {
            return null;
        }

        @java.lang.Override
        public <T> T unwrap(java.lang.Class<T> type) {
            return null;
        }

        @java.lang.Override
        public void close() {
        }

        @java.lang.Override
        public jakarta.validation.ValidatorContext usingContext() {
            return null;
        }

        @java.lang.Override
        public jakarta.validation.ClockProvider getClockProvider() {
            return null;
        }
    }

    public static class NotAValidatorFactory {
        public NotAValidatorFactory(jakarta.validation.spi.ConfigurationState configurationState) {
        }
    }

    @org.junit.Rule
    public org.junit.rules.ExpectedException thrown = org.junit.rules.ExpectedException.none();

    @org.junit.Test
    public void testDefaultValidatorFactory() {
        jakarta.validation.Validation.byProvider(org.apache.bval.jsr.ApacheValidationProvider.class).configure().buildValidatorFactory().unwrap(org.apache.bval.jsr.ApacheValidatorFactory.class);
    }

    @org.junit.Test
    public void testNoSuchType() {
        thrown.expect(jakarta.validation.ValidationException.class);
        thrown.expectCause(org.hamcrest.CoreMatchers.isA(java.lang.ClassNotFoundException.class));
        jakarta.validation.Validation.byProvider(org.apache.bval.jsr.ApacheValidationProvider.class).configure().addProperty(ApacheValidatorConfiguration.Properties.VALIDATOR_FACTORY_CLASSNAME, "no.such.type").buildValidatorFactory();
    }

    @org.junit.Test
    public void testCustomValidatorFactory() {
        doTest(org.apache.bval.jsr.CustomValidatorFactoryTest.CustomValidatorFactory.class, null);
    }

    @org.junit.Test
    public void testInvalidType() {
        doTest(org.apache.bval.jsr.CustomValidatorFactoryTest.NotAValidatorFactory.class, java.lang.ClassCastException.class);
        doTest(org.apache.bval.jsr.CustomValidatorFactoryTest.NotAValidatorFactory.class, java.lang.ClassCastException.class);
    }

    @org.junit.Test
    public void testUnsupportedValidatorFactoryType() {
        doTest(org.apache.bval.jsr.CustomValidatorFactoryTest.IncompatibleValidatorFactory.class, java.lang.NoSuchMethodException.class);
    }

    private void doTest(java.lang.Class<?> validatorFactoryType, java.lang.Class<? extends java.lang.Exception> expectedFailureCause) {
        if (expectedFailureCause != null) {
            thrown.expect(jakarta.validation.ValidationException.class);
            thrown.expectCause(org.hamcrest.CoreMatchers.isA(expectedFailureCause));
        }
        jakarta.validation.Validation.byProvider(org.apache.bval.jsr.ApacheValidationProvider.class).configure().addProperty(ApacheValidatorConfiguration.Properties.VALIDATOR_FACTORY_CLASSNAME, validatorFactoryType.getName()).buildValidatorFactory().unwrap(validatorFactoryType);
    }
}
