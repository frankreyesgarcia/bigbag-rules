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
import jakarta.validation.ConstraintDefinitionException;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotNull;
import org.junit.Test;
/**
 * Checks the correct behavior of the validator resolution algorithm.
 *
 * @author Carlos Vara
 */
public class ValidatorResolutionTest extends org.apache.bval.jsr.ValidationTestBase {
    /**
     * Check that a {@link ConstraintDefinitionException} is thrown when the
     * only available validator is associated with a different annotation type.
     */
    @org.junit.Test(expected = jakarta.validation.ConstraintDefinitionException.class)
    public void testInvalidValidator() {
        validator.validate(new org.apache.bval.jsr.ValidatorResolutionTest.Person());
    }

    public static class Person {
        @org.apache.bval.jsr.ValidatorResolutionTest.PersonName
        public java.lang.String name;
    }

    @jakarta.validation.Constraint(validatedBy = { org.apache.bval.jsr.ValidatorResolutionTest.InvalidPersonNameValidator.class })
    @java.lang.annotation.Documented
    @java.lang.annotation.Target({ java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.TYPE })
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public static @interface PersonName {
        java.lang.String message() default "Wrong person name";

        java.lang.Class<?>[] groups() default {  };

        java.lang.Class<? extends jakarta.validation.Payload>[] payload() default {  };
    }

    public static class InvalidPersonNameValidator implements jakarta.validation.ConstraintValidator<jakarta.validation.constraints.NotNull, java.lang.String> {
        @java.lang.Override
        public void initialize(jakarta.validation.constraints.NotNull constraintAnnotation) {
            // Nothing
        }

        @java.lang.Override
        public boolean isValid(java.lang.String value, jakarta.validation.ConstraintValidatorContext context) {
            return true;
        }
    }
}
