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
import jakarta.validation.constraints.NotNull;
import org.apache.bval.constraints.Email;
public class Customer implements org.apache.bval.jsr.example.Person {
    private java.lang.String firstName;

    private java.lang.String middleName;

    private java.lang.String lastName;

    @jakarta.validation.constraints.NotNull
    private java.lang.String customerId;

    @org.apache.bval.constraints.Password(robustness = 5)
    private java.lang.String password;

    @org.apache.bval.constraints.Email
    private java.lang.String emailAddress;

    public java.lang.String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @java.lang.Override
    public java.lang.String getFirstName() {
        return firstName;
    }

    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }

    @java.lang.Override
    public java.lang.String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(java.lang.String middleName) {
        this.middleName = middleName;
    }

    @java.lang.Override
    public java.lang.String getLastName() {
        return lastName;
    }

    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }

    public java.lang.String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }

    public java.lang.String getPassword() {
        return password;
    }

    public void setPassword(java.lang.String password) {
        this.password = password;
    }
}
