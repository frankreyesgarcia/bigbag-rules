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
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
/**
 * Description: <br/>
 * User: roman.stumm <br/>
 * Date: 01.04.2008 <br/>
 * Time: 12:02:06 <br/>
 */
// test that Password is validated although only combined constraints exists, no own implementation
@org.apache.bval.constraints.NotEmpty
@jakarta.validation.constraints.NotNull
@jakarta.validation.constraints.Size(min = 4, max = 5)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@jakarta.validation.Constraint(validatedBy = {  })
public @interface Password {
    java.lang.Class<?>[] groups() default {  };

    java.lang.String message() default "Wrong password";

    int robustness() default 8;

    java.lang.Class<? extends jakarta.validation.Payload>[] payload() default {  };
}
