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
import jakarta.validation.Validation;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.constraints.NotNull;
import org.junit.Test;
public class LiskovTest {
    @org.junit.Test
    public void testBVal167() {
        try (final jakarta.validation.ValidatorFactory factory = jakarta.validation.Validation.buildDefaultValidatorFactory()) {
            factory.getValidator().getConstraintsForClass(org.apache.bval.jsr.LiskovTest.Impl.class);
        }
    }

    public interface Api {
        java.lang.String read(@jakarta.validation.constraints.NotNull
        java.lang.String key);
    }

    public interface Api2 extends org.apache.bval.jsr.LiskovTest.Api {
        @java.lang.Override
        java.lang.String read(java.lang.String key);
    }

    public abstract static class Base implements org.apache.bval.jsr.LiskovTest.Api {
        @java.lang.Override
        public java.lang.String read(final java.lang.String key) {
            return null;
        }
    }

    public static class Impl extends org.apache.bval.jsr.LiskovTest.Base implements org.apache.bval.jsr.LiskovTest.Api2 {}
}
