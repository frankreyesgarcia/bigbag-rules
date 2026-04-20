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
import jakarta.validation.constraints.Size;
import org.apache.bval.constraints.NotEmpty;
@jakarta.validation.GroupSequence({ org.apache.bval.jsr.example.First.class, org.apache.bval.jsr.example.Author.class, org.apache.bval.jsr.example.Last.class })
public class Author {
    @org.apache.bval.constraints.NotEmpty(groups = org.apache.bval.jsr.example.Last.class)
    private java.lang.String firstName;

    @org.apache.bval.constraints.NotEmpty(groups = org.apache.bval.jsr.example.First.class)
    private java.lang.String lastName;

    @jakarta.validation.constraints.Size(max = 40, groups = org.apache.bval.jsr.example.First.class)
    private java.lang.String company;

    @jakarta.validation.Valid
    private java.util.List<org.apache.bval.jsr.example.Address> addresses;

    public java.util.List<org.apache.bval.jsr.example.Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(java.util.List<org.apache.bval.jsr.example.Address> addresses) {
        this.addresses = addresses;
    }

    public java.lang.String getFirstName() {
        return firstName;
    }

    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }

    public java.lang.String getLastName() {
        return lastName;
    }

    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }

    public java.lang.String getCompany() {
        return company;
    }

    public void setCompany(java.lang.String company) {
        this.company = company;
    }
}
