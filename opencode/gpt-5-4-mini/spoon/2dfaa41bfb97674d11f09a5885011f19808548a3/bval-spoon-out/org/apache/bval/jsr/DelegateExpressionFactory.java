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
import jakarta.el.*;
/**
 * EL5.0 ExpressionFactory lookups the ServiceLoader before the system property
 * In our tests we have at least 2 EL impls and DefaultMessageInterpolatorTest needs a replaceable ExpressionFactory
 * So this a wrapper, which checks the system property first and then asking the ServiceLoader
 */
public class DelegateExpressionFactory extends ExpressionFactory {
    public DelegateExpressionFactory() {
    }

    @java.lang.Override
    public org.apache.bval.jsr.ValueExpression createValueExpression(ELContext context, java.lang.String expression, java.lang.Class<?> expectedType) {
        return getWrapped().createValueExpression(context, expression, expectedType);
    }

    @java.lang.Override
    public org.apache.bval.jsr.ValueExpression createValueExpression(java.lang.Object instance, java.lang.Class<?> expectedType) {
        return getWrapped().createValueExpression(instance, expectedType);
    }

    @java.lang.Override
    public org.apache.bval.jsr.MethodExpression createMethodExpression(ELContext context, java.lang.String expression, java.lang.Class<?> expectedReturnType, java.lang.Class<?>[] expectedParamTypes) {
        return getWrapped().createMethodExpression(context, expression, expectedReturnType, expectedParamTypes);
    }

    @java.lang.Override
    public <T> T coerceToType(java.lang.Object obj, java.lang.Class<T> targetType) {
        return getWrapped().coerceToType(obj, targetType);
    }

    @java.lang.Override
    public org.apache.bval.jsr.ELResolver getStreamELResolver() {
        return getWrapped().getStreamELResolver();
    }

    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.reflect.Method> getInitFunctionMap() {
        return getWrapped().getInitFunctionMap();
    }

    public org.apache.bval.jsr.ExpressionFactory getWrapped() {
        java.lang.String systemProperty = java.lang.System.getProperty(org.apache.bval.jsr.ExpressionFactory.class.getName());
        if (systemProperty != null) {
            try {
                return ((ExpressionFactory) (java.lang.Class.forName(systemProperty).getConstructor().newInstance()));
            } catch (java.lang.Exception e) {
                return null;
            }
        }
        try {
            java.util.ServiceLoader<ExpressionFactory> serviceLoader = java.util.ServiceLoader.load(org.apache.bval.jsr.ExpressionFactory.class, java.lang.Thread.currentThread().getContextClassLoader());
            java.util.Iterator<ExpressionFactory> iter = serviceLoader.iterator();
            while (iter.hasNext()) {
                ExpressionFactory service = iter.next();
                if ((service != null) && (service.getClass() != this.getClass())) {
                    return service;
                }
            } 
        } catch (java.lang.Exception ex) {
        }
        return null;
    }
}
