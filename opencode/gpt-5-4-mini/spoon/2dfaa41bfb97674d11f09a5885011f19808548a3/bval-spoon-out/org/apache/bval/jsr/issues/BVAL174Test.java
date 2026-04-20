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
import jakarta.validation.UnexpectedTypeException;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.metadata.MethodDescriptor;
import org.apache.bval.jsr.ApacheValidationProvider;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
public class BVAL174Test {
    private jakarta.validation.Validator getValidator() {
        return jakarta.validation.Validation.byProvider(org.apache.bval.jsr.ApacheValidationProvider.class).configure().buildValidatorFactory().getValidator();
    }

    @org.junit.Test(expected = jakarta.validation.UnexpectedTypeException.class)
    public void testValidateReturnValue() throws java.lang.NoSuchMethodException {
        jakarta.validation.Validator validator = getValidator();
        org.apache.bval.jsr.issues.BVAL174 service = new org.apache.bval.jsr.issues.BVAL174();
        java.lang.reflect.Method getMovie = service.getClass().getMethod("getMovie");
        java.lang.reflect.Method addMovie = service.getClass().getMethod("addMovie", java.lang.String.class);
        jakarta.validation.metadata.MethodDescriptor getMovieConstraints = validator.getConstraintsForClass(service.getClass()).getConstraintsForMethod(getMovie.getName(), getMovie.getParameterTypes());
        org.junit.Assert.assertTrue(getMovieConstraints == null);
        jakarta.validation.metadata.MethodDescriptor addMovieConstraints = validator.getConstraintsForClass(service.getClass()).getConstraintsForMethod(addMovie.getName(), addMovie.getParameterTypes());
        org.junit.Assert.assertTrue(addMovieConstraints == null);
    }
}
