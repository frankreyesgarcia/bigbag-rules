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
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
/**
 * Check correct behaviour of {@link MinValidatorForNumber} and
 * {@link MaxValidatorForNumber} on boundary values.
 * <p/>
 * The chosen numbers: 9223372036854775806l and 9223372036854775807l cast to the
 * same double value.
 *
 * @author Carlos Vara
 */
public class MinMaxValidatorsForNumberTest {
    @jakarta.validation.constraints.Min(9223372036854775807L)
    public long min;

    @jakarta.validation.constraints.Max(9223372036854775806L)
    public long max;

    @org.junit.Test
    public void testMinBoundaryValue() {
        jakarta.validation.Validator v = jakarta.validation.Validation.buildDefaultValidatorFactory().getValidator();
        this.min = 9223372036854775806L;
        this.max = 0L;
        // Current min value is smaller, should fail, but it doesn't
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.constraints.MinMaxValidatorsForNumberTest>> res = v.validate(this);
        org.junit.Assert.assertFalse("Min validation failed", res.isEmpty());
    }

    @org.junit.Test
    public void testMaxBoundaryValue() {
        jakarta.validation.Validator v = jakarta.validation.Validation.buildDefaultValidatorFactory().getValidator();
        this.min = java.lang.Long.MAX_VALUE;
        this.max = 9223372036854775807L;
        // Current max value is bigger, should fail, but it doesn't
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.constraints.MinMaxValidatorsForNumberTest>> res = v.validate(this);
        org.junit.Assert.assertFalse("Max validation failed", res.isEmpty());
    }
}
