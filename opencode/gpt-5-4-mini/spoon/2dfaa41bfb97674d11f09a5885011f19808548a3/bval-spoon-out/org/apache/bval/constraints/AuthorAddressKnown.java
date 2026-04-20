/* Licensed to the Apache Software Foundation (ASF) under one or more
 contributor license agreements.  See the NOTICE file distributed with
 this work for additional information regarding copyright ownership.
 The ASF licenses this file to You under the Apache License, Version 2.0
 (the "License"); you may not use this file except in compliance with
 the License.  You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package org.apache.bval.constraints;
import jakarta.validation.Constraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.Payload;
/**
 *
 * @version $Rev: 999729 $ $Date: 2010-09-21 21:37:54 -0500 (Tue, 21 Sep 2010) $
 */
@java.lang.annotation.Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD })
@jakarta.validation.Constraint(validatedBy = org.apache.bval.constraints.AuthorAddressKnown.Validator.class)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface AuthorAddressKnown {
    java.lang.String message() default "{org.apache.bval.constraints.AuthorAddressKnown.message}";

    java.lang.Class<?>[] groups() default {  };

    java.lang.Class<? extends jakarta.validation.Payload>[] payload() default {  };

    public static class Validator implements jakarta.validation.ConstraintValidator<org.apache.bval.constraints.AuthorAddressKnown, org.apache.bval.jsr.example.Author> {
        /**
         * {@inheritDoc }
         */
        @java.lang.Override
        public void initialize(org.apache.bval.constraints.AuthorAddressKnown constraintAnnotation) {
        }

        /**
         * {@inheritDoc }
         */
        @java.lang.Override
        public boolean isValid(org.apache.bval.jsr.example.Author value, jakarta.validation.ConstraintValidatorContext context) {
            if (value.getAddresses() == null) {
                return false;
            }
            for (org.apache.bval.jsr.example.Address address : value.getAddresses()) {
                if (address != null) {
                    return true;
                }
            }
            return false;
        }
    }
}
