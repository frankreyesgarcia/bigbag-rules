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
import jakarta.validation.Constraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.ConstraintValidatorFactory;
import jakarta.validation.Payload;
import jakarta.validation.Validation;
import jakarta.validation.ValidationException;
import jakarta.validation.Validator;
import org.apache.bval.jsr.CustomConstraintValidatorFactoryTest.GoodPerson.GoodPersonValidator;
import org.junit.Test;
/**
 * Checks that overriding the default {@link ConstraintValidatorFactory} works
 * as expected.
 *
 * @author Carlos Vara
 */
public class CustomConstraintValidatorFactoryTest {
    /**
     * If the custom ConstraintValidatorFactory returns <code>null</code> for a
     * valid {@link ConstraintValidatorFactory#getInstance(Class)} call, a
     * validation exception should be thrown.
     */
    @org.junit.Test(expected = jakarta.validation.ValidationException.class)
    public void testValidationExceptionWhenFactoryReturnsNullValidator() {
        jakarta.validation.ConstraintValidatorFactory customFactory = new jakarta.validation.ConstraintValidatorFactory() {
            @java.lang.Override
            public <T extends jakarta.validation.ConstraintValidator<?, ?>> T getInstance(java.lang.Class<T> key) {
                return null;// always return null

            }

            @java.lang.Override
            public void releaseInstance(jakarta.validation.ConstraintValidator<?, ?> instance) {
                // no-op
            }
        };
        // Create a validator with this factory
        org.apache.bval.jsr.ApacheValidatorConfiguration customConfig = jakarta.validation.Validation.byProvider(org.apache.bval.jsr.ApacheValidationProvider.class).configure().constraintValidatorFactory(customFactory);
        jakarta.validation.Validator validator = customConfig.buildValidatorFactory().getValidator();
        validator.validate(new org.apache.bval.jsr.CustomConstraintValidatorFactoryTest.Person());
    }

    @org.apache.bval.jsr.CustomConstraintValidatorFactoryTest.GoodPerson
    public static class Person {}

    @jakarta.validation.Constraint(validatedBy = { org.apache.bval.jsr.CustomConstraintValidatorFactoryTest.GoodPerson.GoodPersonValidator.class })
    @java.lang.annotation.Target({ java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.TYPE })
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.annotation.Documented
    public static @interface GoodPerson {
        java.lang.String message() default "Not a good person";

        java.lang.Class<?>[] groups() default {  };

        java.lang.Class<? extends jakarta.validation.Payload>[] payload() default {  };

        public static class GoodPersonValidator implements jakarta.validation.ConstraintValidator<org.apache.bval.jsr.CustomConstraintValidatorFactoryTest.GoodPerson, org.apache.bval.jsr.CustomConstraintValidatorFactoryTest.Person> {
            @java.lang.Override
            public void initialize(org.apache.bval.jsr.CustomConstraintValidatorFactoryTest.GoodPerson constraintAnnotation) {
            }

            @java.lang.Override
            public boolean isValid(org.apache.bval.jsr.CustomConstraintValidatorFactoryTest.Person value, jakarta.validation.ConstraintValidatorContext context) {
                return true;
            }
        }
    }
}
