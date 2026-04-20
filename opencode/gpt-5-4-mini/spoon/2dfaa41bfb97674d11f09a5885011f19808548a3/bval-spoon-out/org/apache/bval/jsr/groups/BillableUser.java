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
package org.apache.bval.jsr.groups;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.groups.Default;
/**
 * User representation
 * Example 3.2. Assign groups to constraints.
 */
public class BillableUser {
    @jakarta.validation.constraints.NotNull
    private java.lang.String firstname;

    @jakarta.validation.constraints.NotNull(groups = jakarta.validation.groups.Default.class)
    private java.lang.String lastname;

    @jakarta.validation.constraints.NotNull(groups = { org.apache.bval.jsr.groups.Billable.class, org.apache.bval.jsr.groups.BuyInOneClick.class })
    private org.apache.bval.jsr.groups.BillableCreditCard defaultCreditCard;

    public java.lang.String getFirstname() {
        return firstname;
    }

    public void setFirstname(java.lang.String firstname) {
        this.firstname = firstname;
    }

    public java.lang.String getLastname() {
        return lastname;
    }

    public void setLastname(java.lang.String lastname) {
        this.lastname = lastname;
    }

    public org.apache.bval.jsr.groups.BillableCreditCard getDefaultCreditCard() {
        return defaultCreditCard;
    }

    public void setDefaultCreditCard(org.apache.bval.jsr.groups.BillableCreditCard defaultCreditCard) {
        this.defaultCreditCard = defaultCreditCard;
    }
}
