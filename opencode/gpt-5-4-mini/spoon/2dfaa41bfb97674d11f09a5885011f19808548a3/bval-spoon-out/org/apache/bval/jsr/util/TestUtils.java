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
package org.apache.bval.jsr.util;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.metadata.ConstraintDescriptor;
import jakarta.validation.metadata.ElementDescriptor.ConstraintFinder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
/**
 * Description: <br/>
 */
public class TestUtils {
    /**
     *
     * @param violations
     * @param propertyPath
     * 		- string format of a propertyPath
     * @return the constraintViolation with the propertyPath's string
    representation given
     */
    public static <T> jakarta.validation.ConstraintViolation<T> getViolation(java.util.Set<jakarta.validation.ConstraintViolation<T>> violations, java.lang.String propertyPath) {
        for (jakarta.validation.ConstraintViolation<T> each : violations) {
            if (each.getPropertyPath().toString().equals(propertyPath)) {
                return each;
            }
        }
        return null;
    }

    /**
     *
     * @param violations
     * @param propertyPath
     * @return count of violations
     */
    public static <T> int countViolations(java.util.Set<jakarta.validation.ConstraintViolation<T>> violations, java.lang.String propertyPath) {
        int result = 0;
        for (jakarta.validation.ConstraintViolation<T> each : violations) {
            if (each.getPropertyPath().toString().equals(propertyPath)) {
                result++;
            }
        }
        return result;
    }

    /**
     *
     * @param <T>
     * @param violations
     * @param message
     * @return the constraint violation with the specified message found, if any
     */
    public static <T> jakarta.validation.ConstraintViolation<T> getViolationWithMessage(java.util.Set<jakarta.validation.ConstraintViolation<T>> violations, java.lang.String message) {
        for (jakarta.validation.ConstraintViolation<T> each : violations) {
            if (each.getMessage().equals(message)) {
                return each;
            }
        }
        return null;
    }

    /**
     * assume set addition either does nothing, returning false per collection
     * contract, or throws an Exception; in either case size should remain
     * unchanged
     *
     * @param collection
     */
    public static void failOnModifiable(java.util.Collection<?> collection, java.lang.String description) {
        int size = collection.size();
        try {
            org.junit.Assert.assertFalse(java.lang.String.format("should not permit modification to %s", description), collection.add(null));
        } catch (java.lang.Exception e) {
            // okay
        }
        org.junit.Assert.assertEquals("constraint descriptor set size changed", size, collection.size());
    }

    /**
     * Assert that the specified ConstraintFinder provides constraints of each of the specified types.
     *
     * @param constraintFinder
     * @param types
     */
    public static void assertConstraintTypesFound(jakarta.validation.metadata.ElementDescriptor.ConstraintFinder constraintFinder, java.lang.Class<? extends java.lang.annotation.Annotation>... types) {
        outer : for (java.lang.Class<? extends java.lang.annotation.Annotation> type : types) {
            for (jakarta.validation.metadata.ConstraintDescriptor<?> descriptor : constraintFinder.getConstraintDescriptors()) {
                if (descriptor.getAnnotation().annotationType().equals(type)) {
                    continue outer;
                }
            }
            org.junit.Assert.fail(java.lang.String.format("Missing expected constraint descriptor of type %s", type));
        }
    }
}
