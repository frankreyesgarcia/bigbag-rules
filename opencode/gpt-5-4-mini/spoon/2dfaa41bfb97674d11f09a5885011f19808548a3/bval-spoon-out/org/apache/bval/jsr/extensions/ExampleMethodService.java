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
package org.apache.bval.jsr.extensions;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.apache.bval.constraints.NotEmpty;
/**
 * Description: class with annotated methods to demonstrate
 * method-level-validation<br/>
 */
public class ExampleMethodService {
    public ExampleMethodService() {
    }

    public ExampleMethodService(@jakarta.validation.constraints.NotNull
    @org.apache.bval.constraints.NotEmpty
    java.lang.String s1, @jakarta.validation.constraints.NotNull
    java.lang.String s2) {
    }

    @jakarta.validation.constraints.NotNull
    @org.apache.bval.constraints.NotEmpty
    public java.lang.String concat(@jakarta.validation.constraints.NotNull
    @org.apache.bval.constraints.NotEmpty
    java.lang.String s1, @jakarta.validation.constraints.NotNull
    java.lang.String s2) {
        return s1 + s2;
    }

    public void save(@jakarta.validation.constraints.Pattern(regexp = "[a-f0-9]{4}")
    java.lang.String data) {
        return;
    }

    @jakarta.validation.constraints.NotNull
    @jakarta.validation.constraints.Size(min = 3, max = 10)
    public java.lang.String echo(@jakarta.validation.constraints.NotNull
    @jakarta.validation.constraints.Size(min = 3, max = 10)
    java.lang.String str) {
        return str;
    }

    public void personOp1(@jakarta.validation.Valid
    org.apache.bval.jsr.extensions.ExampleMethodService.Person p) {
        return;
    }

    public void personOp2(@jakarta.validation.constraints.NotNull
    @jakarta.validation.Valid
    org.apache.bval.jsr.extensions.ExampleMethodService.Person p) {
        return;
    }

    public static class Person {
        @jakarta.validation.constraints.NotNull
        java.lang.String name;
    }
}
