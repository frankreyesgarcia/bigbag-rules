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
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Payload;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
/**
 * <a href="https://issues.apache.org/jira/browse/BVAL-111">https://issues.apache.org/jira/browse/BVAL-111</a>
 * was a serious regression that resulted in BVal's bypassing the context-specific {@link ConstraintValidatorFactory},
 * rather using the instance available from the {@link ValidatorFactory}.  Thus any solutions to e.g. inject
 * collaborators into {@link ConstraintValidator} implementations would fail.
 */
public class ContextConstraintValidatorFactoryTest extends org.apache.bval.jsr.ValidationTestBase {
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.annotation.Target({ java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD })
    @jakarta.validation.Constraint(validatedBy = { org.apache.bval.jsr.ContextConstraintValidatorFactoryTest.Contrived.Validator.class })
    public @interface Contrived {
        java.lang.String message() default "{org.apache.bval.constraints.Contrived.message}";

        java.lang.Class<?>[] groups() default {  };

        java.lang.Class<? extends jakarta.validation.Payload>[] payload() default {  };

        public static class Validator implements jakarta.validation.ConstraintValidator<org.apache.bval.jsr.ContextConstraintValidatorFactoryTest.Contrived, java.lang.Object> {
            private java.lang.Object requiredCollaborator;

            public java.lang.Object getRequiredCollaborator() {
                return requiredCollaborator;
            }

            public void setRequiredCollaborator(java.lang.Object requiredCollaborator) {
                this.requiredCollaborator = requiredCollaborator;
            }

            @java.lang.Override
            public void initialize(org.apache.bval.jsr.ContextConstraintValidatorFactoryTest.Contrived constraintAnnotation) {
            }

            @java.lang.Override
            public boolean isValid(java.lang.Object value, jakarta.validation.ConstraintValidatorContext context) {
                getRequiredCollaborator().toString();
                return true;
            }
        }
    }

    @org.apache.bval.jsr.ContextConstraintValidatorFactoryTest.Contrived
    public static class Example {}

    @java.lang.Override
    protected jakarta.validation.Validator createValidator() {
        final jakarta.validation.ConstraintValidatorFactory constraintValidatorFactory = new jakarta.validation.ConstraintValidatorFactory() {
            @java.lang.Override
            public <T extends jakarta.validation.ConstraintValidator<?, ?>> T getInstance(java.lang.Class<T> key) {
                if (key.equals(org.apache.bval.jsr.ContextConstraintValidatorFactoryTest.Contrived.Validator.class)) {
                    final org.apache.bval.jsr.ContextConstraintValidatorFactoryTest.Contrived.Validator result = new org.apache.bval.jsr.ContextConstraintValidatorFactoryTest.Contrived.Validator();
                    result.setRequiredCollaborator(new java.lang.Object());
                    @java.lang.SuppressWarnings("unchecked")
                    final T t = ((T) (result));
                    return t;
                }
                return null;
            }

            @java.lang.Override
            public void releaseInstance(jakarta.validation.ConstraintValidator<?, ?> instance) {
                // no-op
            }
        };
        return org.apache.bval.jsr.ValidationTestBase.factory.usingContext().constraintValidatorFactory(constraintValidatorFactory).getValidator();
    }

    @org.junit.Test
    public void testContextBoundConstraintValidatorFactory() {
        final java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.ContextConstraintValidatorFactoryTest.Example>> violations = validator.validate(new org.apache.bval.jsr.ContextConstraintValidatorFactoryTest.Example());
        org.junit.Assert.assertTrue(violations.isEmpty());
    }
}
