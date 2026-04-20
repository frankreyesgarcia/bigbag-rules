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
package org.apache.bval.jsr.groups.redefining;
import jakarta.validation.GroupSequence;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
/**
 * Example 3.6. Redefining Default group for Address:
 * To redefine Default for a class, place a @GroupSequence annotation on the class ;
 * this sequence expresses the sequence of groups that does
 * substitute Default for this class.
 */
@jakarta.validation.GroupSequence({ org.apache.bval.jsr.groups.redefining.Address.class, org.apache.bval.jsr.groups.redefining.Address.HighLevelCoherence.class, org.apache.bval.jsr.groups.redefining.Address.ExtraCareful.class })
@org.apache.bval.constraints.ZipCodeCityCoherence(groups = org.apache.bval.jsr.groups.redefining.Address.HighLevelCoherence.class)
public class Address implements org.apache.bval.jsr.example.ZipCodeCityCarrier {
    /**
     * check coherence on the overall object
     * Needs basic checking to be green first
     */
    public interface HighLevelCoherence {}

    /**
     * Extra-careful validation group.
     */
    public interface ExtraCareful {}

    @jakarta.validation.constraints.NotNull
    @jakarta.validation.constraints.Size(max = 50, min = 1, groups = org.apache.bval.jsr.groups.redefining.Address.ExtraCareful.class)
    private java.lang.String street1;

    @jakarta.validation.constraints.NotNull
    private java.lang.String zipCode;

    @jakarta.validation.constraints.NotNull
    @jakarta.validation.constraints.Size(max = 30)
    private java.lang.String city;

    public java.lang.String getStreet1() {
        return street1;
    }

    public void setStreet1(java.lang.String street1) {
        this.street1 = street1;
    }

    @java.lang.Override
    public java.lang.String getZipCode() {
        return zipCode;
    }

    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }

    @java.lang.Override
    public java.lang.String getCity() {
        return city;
    }

    public void setCity(java.lang.String city) {
        this.city = city;
    }
}
