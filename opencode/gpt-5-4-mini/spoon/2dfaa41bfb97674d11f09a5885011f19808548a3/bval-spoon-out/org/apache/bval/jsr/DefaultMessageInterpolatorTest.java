/* Licensed to the Apache Software Foundation (ASF) under one or more
contributor license agreements. See the NOTICE file distributed with this
work for additional information regarding copyright ownership. The ASF
licenses this file to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
License for the specific language governing permissions and limitations under
the License.
 */
package org.apache.bval.jsr;
import jakarta.el.ExpressionFactory;
import jakarta.validation.MessageInterpolator;
import jakarta.validation.Validator;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.metadata.ConstraintDescriptor;
import org.apache.bval.constraints.NotEmpty;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Mockito;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeThat;
import static org.junit.Assume.assumeTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;
/**
 * MessageResolverImpl Tester.
 */
@org.junit.runner.RunWith(org.junit.runners.Parameterized.class)
public class DefaultMessageInterpolatorTest {
    @org.junit.runners.Parameterized.Parameters(name = "{0}")
    public static java.util.List<java.lang.Object[]> generateParameters() {
        return java.util.Arrays.asList(new java.lang.Object[]{ "default", null }, new java.lang.Object[]{ "ri", "org.glassfish.expressly.ExpressionFactoryImpl" }, new java.lang.Object[]{ "tomcat", "org.apache.el.ExpressionFactoryImpl" }, new java.lang.Object[]{ "invalid", "java.lang.String" });
    }

    @org.junit.AfterClass
    public static void cleanup() {
        java.lang.System.clearProperty(jakarta.el.ExpressionFactory.class.getName());
    }

    private static java.util.function.Predicate<jakarta.validation.metadata.ConstraintDescriptor<?>> forConstraintType(java.lang.Class<? extends java.lang.annotation.Annotation> type) {
        return d -> java.util.Objects.equals(type, d.getAnnotation().annotationType());
    }

    private java.lang.String elImpl;

    private java.lang.String elFactory;

    private org.apache.bval.jsr.DefaultMessageInterpolator interpolator;

    private jakarta.validation.Validator validator;

    private boolean elAvailable;

    private java.lang.ClassLoader originalClassLoader;

    public DefaultMessageInterpolatorTest(java.lang.String elImpl, java.lang.String elFactory) {
        this.elImpl = elImpl;
        this.elFactory = elFactory;
    }

    @org.junit.Before
    public void setUp() throws java.lang.Exception {
        // store and replace CCL to sidestep EL factory caching
        originalClassLoader = java.lang.Thread.currentThread().getContextClassLoader();
        java.lang.Thread.currentThread().setContextClassLoader(new java.net.URLClassLoader(new java.net.URL[]{  }, originalClassLoader));
        try {
            if (elFactory == null) {
                java.lang.System.clearProperty(jakarta.el.ExpressionFactory.class.getName());
            } else {
                java.lang.Class<?> elFactoryClass = java.lang.Class.forName(elFactory);
                java.lang.System.setProperty(jakarta.el.ExpressionFactory.class.getName(), elFactory);
                java.lang.Class<? extends jakarta.el.ExpressionFactory> usedImpl = ((org.apache.bval.jsr.DelegateExpressionFactory) (jakarta.el.ExpressionFactory.newInstance())).getWrapped().getClass();
                org.junit.Assert.assertTrue(elFactoryClass == usedImpl);
            }
            elAvailable = true;
        } catch (java.lang.Exception e) {
            elAvailable = false;
        }
        interpolator = new DefaultMessageInterpolator();
        interpolator.setLocale(java.util.Locale.ENGLISH);
        validator = ApacheValidatorFactory.getDefault().getValidator();
    }

    @org.junit.After
    public void tearDownEL() {
        org.junit.Assume.assumeTrue(originalClassLoader != null);
        java.lang.Thread.currentThread().setContextClassLoader(originalClassLoader);
    }

    @org.junit.Test
    public void testInterpolateFromValidationResources() {
        java.lang.String msg = interpolator.interpolate("{validator.creditcard}", context("12345678", () -> validator.getConstraintsForClass(org.apache.bval.jsr.example.PreferredGuest.class).getConstraintsForProperty("guestCreditCardNumber").getConstraintDescriptors().stream().filter(org.apache.bval.jsr.DefaultMessageInterpolatorTest.forConstraintType(jakarta.validation.constraints.Digits.class)).findFirst().orElseThrow(() -> new java.lang.AssertionError("expected constraint missing"))));
        org.junit.Assert.assertEquals("credit card is not valid", msg);
    }

    @org.junit.Test
    public void testInterpolateFromDefaultResources() {
        java.lang.String msg = interpolator.interpolate("{org.apache.bval.constraints.NotEmpty.message}", context("", () -> validator.getConstraintsForClass(org.apache.bval.jsr.example.Author.class).getConstraintsForProperty("lastName").getConstraintDescriptors().stream().filter(org.apache.bval.jsr.DefaultMessageInterpolatorTest.forConstraintType(org.apache.bval.constraints.NotEmpty.class)).findFirst().orElseThrow(() -> new java.lang.AssertionError("expected constraint missing"))));
        org.junit.Assert.assertEquals("may not be empty", msg);
    }

    /**
     * Checks that strings containing special characters are correctly
     * substituted when interpolating.
     */
    @org.junit.Test
    public void testReplacementWithSpecialChars() {
        // Try to interpolate an annotation attribute containing $
        java.lang.String idNumberResult = this.interpolator.interpolate("Id number should match {regexp}", context("12345678", () -> validator.getConstraintsForClass(org.apache.bval.jsr.DefaultMessageInterpolatorTest.Person.class).getConstraintsForProperty("idNumber").getConstraintDescriptors().stream().filter(org.apache.bval.jsr.DefaultMessageInterpolatorTest.forConstraintType(jakarta.validation.constraints.Pattern.class)).findFirst().orElseThrow(() -> new java.lang.AssertionError("expected constraint missing"))));
        org.junit.Assert.assertEquals("Incorrect message interpolation when $ is in an attribute", "Id number should match ....$", idNumberResult);
        // Try to interpolate an annotation attribute containing \
        java.lang.String otherIdResult = this.interpolator.interpolate("Other id should match {regexp}", context("12345678", () -> validator.getConstraintsForClass(org.apache.bval.jsr.DefaultMessageInterpolatorTest.Person.class).getConstraintsForProperty("otherId").getConstraintDescriptors().stream().filter(org.apache.bval.jsr.DefaultMessageInterpolatorTest.forConstraintType(jakarta.validation.constraints.Pattern.class)).findFirst().orElseThrow(() -> new java.lang.AssertionError("expected constraint missing"))));
        org.junit.Assert.assertEquals("Incorrect message interpolation when \\ is in an attribute value", "Other id should match .\\n", otherIdResult);
    }

    @org.junit.Test
    public void testRecursiveInterpolation() {
        java.lang.String msg = this.interpolator.interpolate("{recursive.interpolation.1}", context("12345678", () -> validator.getConstraintsForClass(org.apache.bval.jsr.DefaultMessageInterpolatorTest.Person.class).getConstraintsForProperty("idNumber").getConstraintDescriptors().stream().filter(org.apache.bval.jsr.DefaultMessageInterpolatorTest.forConstraintType(jakarta.validation.constraints.Pattern.class)).findFirst().orElseThrow(() -> new java.lang.AssertionError("expected constraint missing"))));
        org.junit.Assert.assertEquals("must match \"....$\"", msg);
    }

    @org.junit.Test
    public void testNoELAvailable() {
        org.junit.Assume.assumeThat(elImpl, org.hamcrest.CoreMatchers.equalTo("invalid"));
        org.junit.Assert.assertFalse(elAvailable);
        ApacheMessageContext context = context("12345678", () -> validator.getConstraintsForClass(org.apache.bval.jsr.DefaultMessageInterpolatorTest.Person.class).getConstraintsForProperty("idNumber").getConstraintDescriptors().stream().filter(org.apache.bval.jsr.DefaultMessageInterpolatorTest.forConstraintType(jakarta.validation.constraints.Pattern.class)).findFirst().orElseThrow(() -> new java.lang.AssertionError("expected constraint missing")));
        org.mockito.Mockito.when(context.getConfigurationProperty(ApacheValidatorConfiguration.Properties.CUSTOM_TEMPLATE_EXPRESSION_EVALUATION)).thenAnswer(invocation -> java.lang.Boolean.toString(true));
        org.junit.Assert.assertEquals("${regexp.charAt(4)}", interpolator.interpolate("${regexp.charAt(4)}", context));
    }

    @org.junit.Test
    public void testDisallowCustomTemplateExpressionEvaluationByDefault() {
        org.junit.Assume.assumeTrue(elAvailable);
        org.junit.Assert.assertEquals("${regexp.charAt(4)}", interpolator.interpolate("${regexp.charAt(4)}", context("12345678", () -> validator.getConstraintsForClass(org.apache.bval.jsr.DefaultMessageInterpolatorTest.Person.class).getConstraintsForProperty("idNumber").getConstraintDescriptors().stream().filter(org.apache.bval.jsr.DefaultMessageInterpolatorTest.forConstraintType(jakarta.validation.constraints.Pattern.class)).findFirst().orElseThrow(() -> new java.lang.AssertionError("expected constraint missing")))));
    }

    @org.junit.Test
    public void testExpressionLanguageEvaluation() {
        org.junit.Assume.assumeTrue(elAvailable);
        final jakarta.validation.MessageInterpolator.Context context = context("12345678", () -> validator.getConstraintsForClass(org.apache.bval.jsr.DefaultMessageInterpolatorTest.Person.class).getConstraintsForProperty("anotherValue").getConstraintDescriptors().stream().filter(org.apache.bval.jsr.DefaultMessageInterpolatorTest.forConstraintType(jakarta.validation.constraints.Pattern.class)).findFirst().orElseThrow(() -> new java.lang.AssertionError("expected constraint missing")));
        org.junit.Assert.assertEquals("Another value should match ....$", interpolator.interpolate(context.getConstraintDescriptor().getMessageTemplate(), context));
    }

    @org.junit.Test
    public void testMixedEvaluation() {
        org.junit.Assume.assumeTrue(elAvailable);
        final jakarta.validation.MessageInterpolator.Context context = context("12345678", () -> validator.getConstraintsForClass(org.apache.bval.jsr.DefaultMessageInterpolatorTest.Person.class).getConstraintsForProperty("mixedMessageValue").getConstraintDescriptors().stream().filter(org.apache.bval.jsr.DefaultMessageInterpolatorTest.forConstraintType(jakarta.validation.constraints.Pattern.class)).findFirst().orElseThrow(() -> new java.lang.AssertionError("expected constraint missing")));
        org.junit.Assert.assertEquals("Mixed message value of length 8 should match ....$", interpolator.interpolate(context.getConstraintDescriptor().getMessageTemplate(), context));
    }

    @org.junit.Test
    public void testELEscapingTomcatJuel() {
        org.junit.Assume.assumeTrue(elAvailable);
        org.junit.Assume.assumeThat(elImpl, org.hamcrest.CoreMatchers.anyOf(org.hamcrest.CoreMatchers.equalTo("tomcat")));
        // not so much a test as an illustration that the specified EL implementations are seemingly confused by leading
        // backslashes and treats the whole expression as literal. We could skip any literal text before the first
        // non-escaped $, but that would only expose us to inconsistency for composite expressions containing more
        // than one component EL expression
        ApacheMessageContext context = context("12345678", () -> validator.getConstraintsForClass(org.apache.bval.jsr.DefaultMessageInterpolatorTest.Person.class).getConstraintsForProperty("idNumber").getConstraintDescriptors().stream().filter(org.apache.bval.jsr.DefaultMessageInterpolatorTest.forConstraintType(jakarta.validation.constraints.Pattern.class)).findFirst().orElseThrow(() -> new java.lang.AssertionError("expected constraint missing")));
        org.mockito.Mockito.when(context.getConfigurationProperty(ApacheValidatorConfiguration.Properties.CUSTOM_TEMPLATE_EXPRESSION_EVALUATION)).thenAnswer(invocation -> java.lang.Boolean.toString(true));
        org.junit.Assert.assertEquals("${regexp.charAt(4)}", interpolator.interpolate("\\${regexp.charAt(4)}", context));
        org.junit.Assert.assertEquals("${regexp.charAt(4)}", interpolator.interpolate("\\\\${regexp.charAt(4)}", context));
    }

    @org.junit.Test
    public void testELEscapingRI() {
        org.junit.Assume.assumeTrue(elAvailable);
        org.junit.Assume.assumeThat(elImpl, org.hamcrest.CoreMatchers.equalTo("ri"));
        ApacheMessageContext context = context("12345678", () -> validator.getConstraintsForClass(org.apache.bval.jsr.DefaultMessageInterpolatorTest.Person.class).getConstraintsForProperty("idNumber").getConstraintDescriptors().stream().filter(org.apache.bval.jsr.DefaultMessageInterpolatorTest.forConstraintType(jakarta.validation.constraints.Pattern.class)).findFirst().orElseThrow(() -> new java.lang.AssertionError("expected constraint missing")));
        org.mockito.Mockito.when(context.getConfigurationProperty(ApacheValidatorConfiguration.Properties.CUSTOM_TEMPLATE_EXPRESSION_EVALUATION)).thenAnswer(invocation -> java.lang.Boolean.toString(true));
        org.junit.Assert.assertEquals("returns literal", "${regexp.charAt(4)}", interpolator.interpolate("\\${regexp.charAt(4)}", context));
        org.junit.Assert.assertEquals("returns literal \\ followed by $, later interpreted as an escape sequence", "$", interpolator.interpolate("\\\\${regexp.charAt(4)}", context));
        org.junit.Assert.assertEquals("returns literal \\ followed by .", "\\.", interpolator.interpolate("\\\\${regexp.charAt(3)}", context));
    }

    @org.junit.Test
    public void testEscapedELPattern() {
        org.junit.Assert.assertEquals("$must match \"....$\"", interpolator.interpolate("\\${jakarta.validation.constraints.Pattern.message}", context("12345678", () -> validator.getConstraintsForClass(org.apache.bval.jsr.DefaultMessageInterpolatorTest.Person.class).getConstraintsForProperty("idNumber").getConstraintDescriptors().stream().filter(org.apache.bval.jsr.DefaultMessageInterpolatorTest.forConstraintType(jakarta.validation.constraints.Pattern.class)).findFirst().orElseThrow(() -> new java.lang.AssertionError("expected constraint missing")))));
        org.junit.Assert.assertEquals("$must match \"....$\"", interpolator.interpolate("\\${jakarta.validation.constraints.Pattern.message}", context("12345678", () -> validator.getConstraintsForClass(org.apache.bval.jsr.DefaultMessageInterpolatorTest.Person.class).getConstraintsForProperty("idNumber").getConstraintDescriptors().stream().filter(org.apache.bval.jsr.DefaultMessageInterpolatorTest.forConstraintType(jakarta.validation.constraints.Pattern.class)).findFirst().orElseThrow(() -> new java.lang.AssertionError("expected constraint missing")))));
        org.junit.Assert.assertEquals("\\$must match \"....$\"", interpolator.interpolate("\\\\\\${jakarta.validation.constraints.Pattern.message}", context("12345678", () -> validator.getConstraintsForClass(org.apache.bval.jsr.DefaultMessageInterpolatorTest.Person.class).getConstraintsForProperty("idNumber").getConstraintDescriptors().stream().filter(org.apache.bval.jsr.DefaultMessageInterpolatorTest.forConstraintType(jakarta.validation.constraints.Pattern.class)).findFirst().orElseThrow(() -> new java.lang.AssertionError("expected constraint missing")))));
    }

    @java.lang.SuppressWarnings("unchecked")
    private org.apache.bval.jsr.ApacheMessageContext context(java.lang.Object validatedValue, java.util.function.Supplier<jakarta.validation.metadata.ConstraintDescriptor<?>> descriptor) {
        final ApacheMessageContext result = org.mockito.Mockito.mock(org.apache.bval.jsr.ApacheMessageContext.class);
        org.mockito.Mockito.when(result.unwrap(org.mockito.Mockito.any(java.lang.Class.class))).thenAnswer(invocation -> invocation.getArgumentAt(0, java.lang.Class.class).cast(result));
        org.mockito.Mockito.when(result.getValidatedValue()).thenReturn(validatedValue);
        org.mockito.Mockito.when(result.getConstraintDescriptor()).thenAnswer(invocation -> descriptor.get());
        return result;
    }

    public static class Person {
        @jakarta.validation.constraints.Pattern(message = "Id number should match {regexp}", regexp = "....$")
        public java.lang.String idNumber;

        @jakarta.validation.constraints.Pattern(message = "Other id should match {regexp}", regexp = ".\\n")
        public java.lang.String otherId;

        @jakarta.validation.constraints.Pattern(message = "Another value should match ${regexp.intern()}", regexp = "....$")
        public java.lang.String anotherValue;

        @jakarta.validation.constraints.Pattern(message = "Mixed message value of length ${validatedValue.length()} should match {regexp}", regexp = "....$")
        public java.lang.String mixedMessageValue;
    }
}
