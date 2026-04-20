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
package org.apache.bval.jsr.issues;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.Payload;
public class BVAL174 {
    @org.apache.bval.jsr.issues.BVAL174.Audience("movies")
    public java.lang.String getMovie() {
        return "";
    }

    @org.apache.bval.jsr.issues.BVAL174.Audience("movies")
    public void addMovie(java.lang.String newMovie) {
    }

    @java.lang.annotation.Documented
    @jakarta.validation.Constraint(validatedBy = { org.apache.bval.jsr.issues.BVAL174.Audience.Constraint.class })
    @java.lang.annotation.Target({ java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.ANNOTATION_TYPE })
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface Audience {
        java.lang.String value();

        java.lang.Class<?>[] groups() default {  };

        java.lang.String message() default "The 'aud' claim must contain '{value}'";

        java.lang.Class<? extends jakarta.validation.Payload>[] payload() default {  };

        class Constraint implements jakarta.validation.ConstraintValidator<org.apache.bval.jsr.issues.BVAL174.Audience, org.apache.bval.jsr.issues.BVAL174.JsonWebToken> {
            private org.apache.bval.jsr.issues.BVAL174.Audience audience;

            @java.lang.Override
            public void initialize(final org.apache.bval.jsr.issues.BVAL174.Audience constraint) {
                this.audience = constraint;
            }

            @java.lang.Override
            public boolean isValid(final org.apache.bval.jsr.issues.BVAL174.JsonWebToken value, final jakarta.validation.ConstraintValidatorContext context) {
                final java.util.Set<java.lang.String> audience = value.getAudience();
                return (audience != null) && audience.contains(this.audience.value());
            }
        }
    }

    public class JsonWebToken {
        public java.util.Set<java.lang.String> getAudience() {
            return null;
        }
    }
}
