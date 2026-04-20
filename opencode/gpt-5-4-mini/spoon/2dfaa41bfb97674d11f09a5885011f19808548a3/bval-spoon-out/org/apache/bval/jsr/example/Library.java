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
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
/**
 * Description: <br/>
 */
public class Library {
    @jakarta.validation.constraints.NotNull
    private java.lang.String libraryName;

    @jakarta.validation.Valid
    private final java.util.Map<java.lang.String, org.apache.bval.jsr.example.Book> taggedBooks = new java.util.HashMap<java.lang.String, org.apache.bval.jsr.example.Book>();

    private org.apache.bval.jsr.example.Person[] persons;

    public java.lang.String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(java.lang.String libraryName) {
        this.libraryName = libraryName;
    }

    public java.util.Map<java.lang.String, org.apache.bval.jsr.example.Book> getTaggedBooks() {
        return taggedBooks;
    }

    public org.apache.bval.jsr.example.Person[] getPersons() {
        return persons;
    }

    public void setPersons(org.apache.bval.jsr.example.Person[] persons) {
        this.persons = persons;
    }

    @jakarta.validation.Valid
    public java.util.List<org.apache.bval.jsr.example.Employee> getEmployees() {
        if (persons == null)
            return java.util.Collections.emptyList();

        java.util.ArrayList<org.apache.bval.jsr.example.Employee> emps = new java.util.ArrayList<org.apache.bval.jsr.example.Employee>(persons.length);
        for (org.apache.bval.jsr.example.Person each : persons) {
            if (each instanceof org.apache.bval.jsr.example.Employee)
                emps.add(((org.apache.bval.jsr.example.Employee) (each)));

        }
        return emps;
    }
}
