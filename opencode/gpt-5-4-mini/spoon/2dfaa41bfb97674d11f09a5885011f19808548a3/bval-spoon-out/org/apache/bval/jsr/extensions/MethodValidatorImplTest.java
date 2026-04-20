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
package org.apache.bval.jsr.extensions;
import jakarta.validation.Valid;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.executable.ExecutableValidator;
import org.apache.bval.jsr.ApacheValidationProvider;
import org.apache.bval.jsr.ValidatorImpl;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
/**
 * MethodValidatorImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>11/11/2009</pre>
 */
@java.lang.SuppressWarnings({ "unchecked", "rawtypes" })
public class MethodValidatorImplTest {
    @org.junit.Test
    public void testUnwrap() {
        jakarta.validation.Validator v = getValidator();
        org.apache.bval.jsr.ValidatorImpl cv = v.unwrap(org.apache.bval.jsr.ValidatorImpl.class);
        org.junit.Assert.assertSame(v, cv);
        org.junit.Assert.assertSame(v, v.unwrap(jakarta.validation.Validator.class));
        org.junit.Assert.assertNotNull(v.forExecutables());
    }

    @org.junit.Test
    public void testValidateMethodParameters() throws java.lang.NoSuchMethodException {
        org.apache.bval.jsr.extensions.ExampleMethodService service = new org.apache.bval.jsr.extensions.ExampleMethodService();
        jakarta.validation.executable.ExecutableValidator mv = getValidator().unwrap(jakarta.validation.executable.ExecutableValidator.class);
        java.lang.reflect.Method method = service.getClass().getMethod("concat", java.lang.String.class, java.lang.String.class);
        java.lang.String[] params = new java.lang.String[]{ "Hello ", "world" };
        org.junit.Assert.assertTrue(mv.validateParameters(service, method, params).isEmpty());
        params[0] = "";
        org.junit.Assert.assertEquals(1, mv.validateParameters(service, method, params).size());
        params[1] = null;
        org.junit.Assert.assertEquals(2, mv.validateParameters(service, method, params).size());
    }

    @org.junit.Test
    public void testValidateMoreMethodParameters() throws java.lang.NoSuchMethodException {
        org.apache.bval.jsr.extensions.ExampleMethodService service = new org.apache.bval.jsr.extensions.ExampleMethodService();
        jakarta.validation.executable.ExecutableValidator mv = getValidator().unwrap(jakarta.validation.executable.ExecutableValidator.class);
        java.lang.reflect.Method saveMethod = service.getClass().getMethod("save", java.lang.String.class);
        java.lang.String[] saveParams = new java.lang.String[1];
        saveParams[0] = "abcd";
        org.junit.Assert.assertTrue(mv.validateParameters(service, saveMethod, saveParams).isEmpty());
        saveParams[0] = "zzzz";
        org.junit.Assert.assertEquals(1, mv.validateParameters(service, saveMethod, saveParams).size());
        java.lang.reflect.Method echoMethod = service.getClass().getMethod("echo", java.lang.String.class);
        java.lang.String[] echoParams = new java.lang.String[1];
        echoParams[0] = "hello";
        org.junit.Assert.assertTrue(mv.validateParameters(service, echoMethod, echoParams).isEmpty());
        echoParams[0] = "h";
        org.junit.Assert.assertEquals(1, mv.validateParameters(service, echoMethod, echoParams).size());
        echoParams[0] = null;
        org.junit.Assert.assertEquals(1, mv.validateParameters(service, echoMethod, echoParams).size());
    }

    @org.junit.Test
    public void testValidateConstructorParameters() throws java.lang.NoSuchMethodException {
        org.apache.bval.jsr.extensions.ExampleMethodService service = new org.apache.bval.jsr.extensions.ExampleMethodService();
        jakarta.validation.executable.ExecutableValidator mv = getValidator().unwrap(jakarta.validation.executable.ExecutableValidator.class);
        java.lang.reflect.Constructor constructor = service.getClass().getConstructor(java.lang.String.class, java.lang.String.class);
        java.lang.String[] params = new java.lang.String[]{ "Hello ", "world" };
        org.junit.Assert.assertTrue(mv.<org.apache.bval.jsr.extensions.ExampleMethodService>validateConstructorParameters(constructor, params).isEmpty());
        params[0] = "";
        org.junit.Assert.assertEquals(1, mv.validateConstructorParameters(constructor, params).size());
        params[1] = null;
        org.junit.Assert.assertEquals(2, mv.validateConstructorParameters(constructor, params).size());
    }

    @org.junit.Test
    public void testValidateReturnValue() throws java.lang.NoSuchMethodException {
        org.apache.bval.jsr.extensions.ExampleMethodService service = new org.apache.bval.jsr.extensions.ExampleMethodService();
        jakarta.validation.executable.ExecutableValidator mv = getValidator().unwrap(jakarta.validation.executable.ExecutableValidator.class);
        java.lang.reflect.Method method = service.getClass().getMethod("concat", java.lang.String.class, java.lang.String.class);
        org.junit.Assert.assertTrue(mv.validateReturnValue(service, method, "test").isEmpty());
        org.junit.Assert.assertEquals(1, mv.validateReturnValue(service, method, "").size());
    }

    @org.junit.Test
    public void testValidateMoreReturnValue() throws java.lang.NoSuchMethodException {
        org.apache.bval.jsr.extensions.ExampleMethodService service = new org.apache.bval.jsr.extensions.ExampleMethodService();
        jakarta.validation.executable.ExecutableValidator mv = getValidator().unwrap(jakarta.validation.executable.ExecutableValidator.class);
        java.lang.reflect.Method echoMethod = service.getClass().getMethod("echo", java.lang.String.class);
        java.lang.String returnedValue = "a too long string";
        org.junit.Assert.assertEquals(1, mv.validateReturnValue(service, echoMethod, returnedValue).size());
        returnedValue = null;
        org.junit.Assert.assertEquals(1, mv.validateReturnValue(service, echoMethod, returnedValue).size());
        returnedValue = "valid";
        org.junit.Assert.assertTrue(mv.validateReturnValue(service, echoMethod, returnedValue).isEmpty());
    }

    @org.junit.Test
    public void testValidateValidParam() throws java.lang.NoSuchMethodException {
        org.apache.bval.jsr.extensions.ExampleMethodService service = new org.apache.bval.jsr.extensions.ExampleMethodService();
        jakarta.validation.executable.ExecutableValidator mv = getValidator().unwrap(jakarta.validation.executable.ExecutableValidator.class);
        java.lang.reflect.Method personOp1 = service.getClass().getMethod("personOp1", org.apache.bval.jsr.extensions.ExampleMethodService.Person.class);
        // Validate with invalid person
        org.apache.bval.jsr.extensions.ExampleMethodService.Person p = new org.apache.bval.jsr.extensions.ExampleMethodService.Person();
        org.junit.Assert.assertEquals("Expected 1 violation", 1, mv.validateParameters(service, personOp1, new java.lang.Object[]{ p }).size());
        // validate with valid person
        p.name = "valid name";
        org.junit.Assert.assertTrue("No violations expected", mv.validateParameters(service, personOp1, new java.lang.Object[]{ p }).isEmpty());
        // validate with null person
        org.junit.Assert.assertTrue("No violations expected", mv.validateParameters(service, personOp1, new java.lang.Object[]{ null }).isEmpty());
    }

    @org.junit.Test
    public void testValidateNotNullValidParam() throws java.lang.NoSuchMethodException {
        org.apache.bval.jsr.extensions.ExampleMethodService service = new org.apache.bval.jsr.extensions.ExampleMethodService();
        jakarta.validation.executable.ExecutableValidator mv = getValidator().unwrap(jakarta.validation.executable.ExecutableValidator.class);
        java.lang.reflect.Method personOp2 = service.getClass().getMethod("personOp2", org.apache.bval.jsr.extensions.ExampleMethodService.Person.class);
        // Validate with null person
        org.junit.Assert.assertEquals("Expected 1 violation", 1, mv.validateParameters(service, personOp2, new java.lang.Object[]{ null }).size());
        // Validate with invalid person
        org.apache.bval.jsr.extensions.ExampleMethodService.Person p = new org.apache.bval.jsr.extensions.ExampleMethodService.Person();
        org.junit.Assert.assertEquals("Expected 1 violation", 1, mv.validateParameters(service, personOp2, new java.lang.Object[]{ p }).size());
        // validate with valid person
        p.name = "valid name";
        org.junit.Assert.assertTrue("No violations expected", mv.validateParameters(service, personOp2, new java.lang.Object[]{ p }).isEmpty());
    }

    /**
     * Validate a method defined in an interface using the following
     * combinations:
     * <ul>
     * <li>impl.class + impl.method</li>
     * <li>interface.class + interface.method</li>
     * <li>impl.class + interface.method</li>
     * <li>interface.class + impl.method</li>
     * </ul>
     */
    @org.junit.Test
    @org.junit.Ignore("violates Liskov principle, forbidden by the spec - 4.5.5")
    public void validateImplementedMethod() throws java.lang.NoSuchMethodException {
        org.apache.bval.jsr.extensions.MethodValidatorImplTest.UserMethodsImpl um = new org.apache.bval.jsr.extensions.MethodValidatorImplTest.UserMethodsImpl();
        jakarta.validation.executable.ExecutableValidator mv = getValidator().unwrap(jakarta.validation.executable.ExecutableValidator.class);
        java.lang.reflect.Method classMethod = um.getClass().getMethod("findUser", java.lang.String.class, java.lang.String.class, java.lang.Integer.class);
        org.apache.bval.jsr.extensions.MethodValidatorImplTest.UserMethods.class.getMethod("findUser", java.lang.String.class, java.lang.String.class, java.lang.Integer.class);
        org.junit.Assert.assertEquals("Invalid number of violations", 2, mv.validateParameters(um, classMethod, new java.lang.Object[]{ "", "valid", null }).size());
    }

    @org.junit.Test
    public void testBVal158() throws java.lang.NoSuchMethodException {
        org.apache.bval.jsr.extensions.MethodValidatorImplTest.TypeWithPseudoAccessor target = new org.apache.bval.jsr.extensions.MethodValidatorImplTest.TypeWithPseudoAccessor();
        java.lang.reflect.Method m = org.apache.bval.jsr.extensions.MethodValidatorImplTest.TypeWithPseudoAccessor.class.getMethod("getAll");
        org.junit.Assert.assertTrue(getValidator().forExecutables().validateParameters(target, m, new java.lang.Object[]{  }).isEmpty());
    }

    public static interface UserMethods {
        void findUser(java.lang.String param1, java.lang.String param2, java.lang.Integer param3);
    }

    public static class UserMethodsImpl implements org.apache.bval.jsr.extensions.MethodValidatorImplTest.UserMethods {
        @java.lang.Override
        public void findUser(@jakarta.validation.constraints.Size(min = 1)
        java.lang.String param1, @jakarta.validation.constraints.NotNull
        java.lang.String param2, @jakarta.validation.constraints.NotNull
        java.lang.Integer param3) {
            return;
        }
    }

    public static class TypeWithPseudoAccessor {
        @jakarta.validation.Valid
        @jakarta.validation.constraints.NotNull
        public java.util.List<java.lang.Object> getAll() {
            throw new java.lang.IllegalStateException();
        }
    }

    private jakarta.validation.Validator getValidator() {
        return jakarta.validation.Validation.byProvider(org.apache.bval.jsr.ApacheValidationProvider.class).configure().buildValidatorFactory().getValidator();
    }
}
