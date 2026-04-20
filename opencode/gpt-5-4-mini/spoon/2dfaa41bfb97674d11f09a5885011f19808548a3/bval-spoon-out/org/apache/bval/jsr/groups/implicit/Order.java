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
package org.apache.bval.jsr.groups.implicit;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
/**
 * Represents an order in the system
 */
public class Order implements org.apache.bval.jsr.groups.implicit.Auditable {
    private java.lang.String creationDate;

    private java.lang.String lastUpdate;

    private java.lang.String lastModifier;

    private java.lang.String lastReader;

    private java.lang.String orderNumber;

    @java.lang.Override
    public java.lang.String getCreationDate() {
        return this.creationDate;
    }

    @java.lang.Override
    public java.lang.String getLastUpdate() {
        return this.lastUpdate;
    }

    @java.lang.Override
    public java.lang.String getLastModifier() {
        return this.lastModifier;
    }

    @java.lang.Override
    public java.lang.String getLastReader() {
        return this.lastReader;
    }

    @jakarta.validation.constraints.NotNull
    @jakarta.validation.constraints.Size(min = 10, max = 10)
    public java.lang.String getOrderNumber() {
        return this.orderNumber;
    }

    public void setCreationDate(java.lang.String creationDate) {
        this.creationDate = creationDate;
    }

    public void setLastUpdate(java.lang.String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void setLastModifier(java.lang.String lastModifier) {
        this.lastModifier = lastModifier;
    }

    public void setLastReader(java.lang.String lastReader) {
        this.lastReader = lastReader;
    }

    public void setOrderNumber(java.lang.String orderNumber) {
        this.orderNumber = orderNumber;
    }
}
