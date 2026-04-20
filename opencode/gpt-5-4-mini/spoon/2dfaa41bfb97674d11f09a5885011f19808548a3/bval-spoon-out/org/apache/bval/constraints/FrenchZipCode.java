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
import jakarta.validation.ReportAsSingleViolation;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
/**
 * Description: example for composed constraint.
 * not implemented! simple dummy implementation for tests only! <br/>
 */
@org.apache.bval.constraints.NotEmpty
@jakarta.validation.constraints.NotNull
@jakarta.validation.constraints.Size(min = 4, max = 5, message = "Zipcode should be of size {value}")
@jakarta.validation.Constraint(validatedBy = org.apache.bval.constraints.FrenchZipcodeValidator.class)
@jakarta.validation.ReportAsSingleViolation
@java.lang.annotation.Documented
@java.lang.annotation.Target({ java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD })
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface FrenchZipCode {
    @jakarta.validation.OverridesAttribute.List({ @jakarta.validation.OverridesAttribute(constraint = jakarta.validation.constraints.Size.class, name = "min"), @jakarta.validation.OverridesAttribute(constraint = jakarta.validation.constraints.Size.class, name = "max") })
    int size() default 6;

    @jakarta.validation.OverridesAttribute(constraint = jakarta.validation.constraints.Size.class, name = "message")
    java.lang.String sizeMessage() default "{error.zipcode.size}";

    java.lang.String message() default "Wrong zipcode";

    java.lang.Class<?>[] groups() default {  };

    java.lang.Class<? extends jakarta.validation.Payload>[] payload() default {  };
}
