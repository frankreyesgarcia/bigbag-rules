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
import jakarta.validation.GroupSequence;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.groups.Default;
@org.apache.bval.constraints.ZipCodeCityCoherence
public class Address implements org.apache.bval.jsr.example.ZipCodeCityCarrier {
    @jakarta.validation.constraints.NotNull
    @jakarta.validation.constraints.Size(max = 30)
    private java.lang.String addressline1;

    @jakarta.validation.constraints.Size(max = 30)
    private java.lang.String addressline2;

    @jakarta.validation.constraints.Size(max = 11)
    private java.lang.String zipCode;

    @jakarta.validation.constraints.NotNull
    @jakarta.validation.Valid
    private org.apache.bval.jsr.example.Country country;

    private java.lang.String city;

    public java.lang.String getAddressline1() {
        return addressline1;
    }

    public void setAddressline1(java.lang.String addressline1) {
        this.addressline1 = addressline1;
    }

    public java.lang.String getAddressline2() {
        return addressline2;
    }

    public void setAddressline2(java.lang.String addressline2) {
        this.addressline2 = addressline2;
    }

    @java.lang.Override
    public java.lang.String getZipCode() {
        return zipCode;
    }

    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }

    @java.lang.Override
    @jakarta.validation.constraints.Size(max = 30)
    @jakarta.validation.constraints.NotNull
    public java.lang.String getCity() {
        return city;
    }

    public void setCity(java.lang.String city) {
        this.city = city;
    }

    public org.apache.bval.jsr.example.Country getCountry() {
        return country;
    }

    public void setCountry(org.apache.bval.jsr.example.Country country) {
        this.country = country;
    }

    /**
     * Check coherence on the overall object
     * Needs basic checking to be green first
     */
    public interface HighLevelCoherence {}

    /**
     * Check both basic constraints and high level ones.
     * High level constraints are not checked if basic constraints fail.
     */
    @jakarta.validation.GroupSequence({ jakarta.validation.groups.Default.class, org.apache.bval.jsr.example.Address.HighLevelCoherence.class })
    public interface Complete {}
}
