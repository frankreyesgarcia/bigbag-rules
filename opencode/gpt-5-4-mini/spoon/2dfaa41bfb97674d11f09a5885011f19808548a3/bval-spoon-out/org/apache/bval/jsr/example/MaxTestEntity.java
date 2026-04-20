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
package org.apache.bval.jsr.example;
import jakarta.validation.constraints.Max;
/**
 * Description: <br/>
 */
public class MaxTestEntity {
    @jakarta.validation.constraints.Max(100)
    private java.lang.String text;

    private java.lang.String property;

    @jakarta.validation.constraints.Max(300)
    private long longValue;

    private java.math.BigDecimal decimalValue;

    public java.lang.String getText() {
        return text;
    }

    @jakarta.validation.constraints.Max(200)
    public java.lang.String getProperty() {
        return property;
    }

    public long getLongValue() {
        return longValue;
    }

    @jakarta.validation.constraints.Max(400)
    public java.math.BigDecimal getDecimalValue() {
        return decimalValue;
    }

    public void setText(java.lang.String text) {
        this.text = text;
    }

    public void setProperty(java.lang.String property) {
        this.property = property;
    }

    public void setLongValue(long longValue) {
        this.longValue = longValue;
    }

    public void setDecimalValue(java.math.BigDecimal decimalValue) {
        this.decimalValue = decimalValue;
    }
}
