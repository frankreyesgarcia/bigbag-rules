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
package org.apache.bval.constraints;
import jakarta.validation.Constraint;
import jakarta.validation.OverridesAttribute;
import jakarta.validation.Payload;
import jakarta.validation.constraints.Pattern;
/**
 * test a constraint WITHOUT an own ConstraintValidator implementation.
 * the validations, that must be processed are in the combined constraints only!!
 * the @Constraint annotation is nevertheless required so that the framework searches
 * for combined constraints.
 */
@jakarta.validation.constraints.Pattern.List({ @jakarta.validation.constraints.Pattern(regexp = "[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}"), @jakarta.validation.constraints.Pattern(regexp = ".*?COMPANY.*?") })
@jakarta.validation.Constraint(validatedBy = {  })
@java.lang.annotation.Documented
@java.lang.annotation.Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.PARAMETER })
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface CompanyEmail {
    java.lang.String message() default "Not an email of COMPANY";

    @jakarta.validation.OverridesAttribute(constraint = jakarta.validation.constraints.Pattern.class, name = "message", constraintIndex = 0)
    java.lang.String emailMessage() default "Not an email";

    @jakarta.validation.OverridesAttribute(constraint = jakarta.validation.constraints.Pattern.class, name = "message", constraintIndex = 1)
    java.lang.String agimatecMessage() default "Not COMPANY";

    java.lang.Class<?>[] groups() default {  };

    java.lang.Class<? extends jakarta.validation.Payload>[] payload() default {  };

    @java.lang.annotation.Target({ java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.PARAMETER })
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.annotation.Documented
    @interface List {
        org.apache.bval.constraints.CompanyEmail[] value();
    }
}
