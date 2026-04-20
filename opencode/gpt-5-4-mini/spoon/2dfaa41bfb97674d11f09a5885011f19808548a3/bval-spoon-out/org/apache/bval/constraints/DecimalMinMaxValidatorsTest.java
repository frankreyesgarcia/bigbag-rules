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
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
/**
 * Description: <br>
 * User: roman.stumm<br>
 * Date: 06.04.2010<br>
 * Time: 13:45:09<br>
 */
public class DecimalMinMaxValidatorsTest extends org.apache.bval.jsr.ValidationTestBase {
    @jakarta.validation.constraints.DecimalMin("922392239223.06")
    public double dmin;

    @jakarta.validation.constraints.DecimalMax("922392239223.09")
    public double dmax;

    @org.junit.Test
    public void testDecimalMinValue() {
        this.dmin = 9.2239223922305E11;
        this.dmax = 9.2239223922308E11;
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.constraints.DecimalMinMaxValidatorsTest>> res = validator.validate(this);
        org.junit.Assert.assertFalse("Min validation failed", res.isEmpty());
    }

    @org.junit.Test
    public void testDecimalMaxValue() {
        this.dmin = java.lang.Double.MAX_VALUE;
        this.dmax = 9.223922392231E11;
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.constraints.DecimalMinMaxValidatorsTest>> res = validator.validate(this);
        org.junit.Assert.assertFalse("Max validation failed", res.isEmpty());
    }
}
