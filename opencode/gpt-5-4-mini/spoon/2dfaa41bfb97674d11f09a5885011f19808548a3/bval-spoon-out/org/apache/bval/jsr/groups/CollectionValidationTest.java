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
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.apache.bval.jsr.DefaultMessageInterpolator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
/**
 * Description: <br/>
 */
public class CollectionValidationTest {
    static jakarta.validation.ValidatorFactory factory;

    static {
        factory = jakarta.validation.Validation.buildDefaultValidatorFactory();
        ((org.apache.bval.jsr.DefaultMessageInterpolator) (factory.getMessageInterpolator())).setLocale(java.util.Locale.ENGLISH);
    }

    /**
     * Validator instance to test
     */
    protected jakarta.validation.Validator validator;

    /**
     * {@inheritDoc }
     */
    @org.junit.Before
    public void setUp() throws java.lang.Exception {
        validator = createValidator();
    }

    /**
     * Create the validator instance.
     *
     * @return Validator
     */
    protected jakarta.validation.Validator createValidator() {
        return org.apache.bval.jsr.groups.CollectionValidationTest.factory.getValidator();
    }

    @org.junit.Test
    public void testValidateList() {
        org.apache.bval.jsr.example.Author author = new org.apache.bval.jsr.example.Author();
        author.setFirstName("Peter");
        author.setLastName("Ford");
        author.setCompany("IBM");
        author.setAddresses(new java.util.ArrayList<org.apache.bval.jsr.example.Address>());
        org.apache.bval.jsr.example.Address adr1;
        org.apache.bval.jsr.example.Address adr2;
        org.apache.bval.jsr.example.Address adr3;
        adr1 = new org.apache.bval.jsr.example.Address();
        adr1.setCountry(new org.apache.bval.jsr.example.Country());
        adr1.getCountry().setName("Germany");
        adr1.setCity("Bonn");
        adr1.setAddressline1("Strasse 1");
        adr2 = new org.apache.bval.jsr.example.Address();
        adr2.setCountry(new org.apache.bval.jsr.example.Country());
        adr2.getCountry().setName("Cuba");
        adr2.setCity("Habana");
        adr2.setAddressline1("Calle 2");
        adr3 = new org.apache.bval.jsr.example.Address();
        adr3.setCountry(new org.apache.bval.jsr.example.Country());
        adr3.getCountry().setName("USA");
        adr3.setCity("San Francisco");
        adr3.setAddressline1("Street 3");
        author.getAddresses().add(adr1);
        author.getAddresses().add(adr2);
        author.getAddresses().add(adr3);
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.Author>> violations;
        violations = validator.validate(author);
        org.junit.Assert.assertEquals(0, violations.size());
        adr2.setCity(null);// violate not null

        adr3.setAddressline1(null);// violate not null

        violations = validator.validate(author);
        org.junit.Assert.assertEquals(2, violations.size());
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolation(violations, "addresses[1].city"));
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolation(violations, "addresses[2].addressline1"));
    }

    @org.junit.Test
    public void testValidateMapAndRedefinedDefaultGroupOnNonRootBean() {
        org.apache.bval.jsr.example.Library lib = new org.apache.bval.jsr.example.Library();
        lib.setLibraryName("Leibnitz Bibliothek");
        org.apache.bval.jsr.example.Book book1;
        org.apache.bval.jsr.example.Book book2;
        org.apache.bval.jsr.example.Book book3;
        book1 = new org.apache.bval.jsr.example.Book();
        book1.setTitle("History of time");
        book1.setSubtitle("How it really works");
        org.apache.bval.jsr.example.Author hawking = new org.apache.bval.jsr.example.Author();
        hawking.setFirstName("Stephen");
        hawking.setLastName("Hawking");
        hawking.setAddresses(new java.util.ArrayList<org.apache.bval.jsr.example.Address>(1));
        org.apache.bval.jsr.example.Address adr = new org.apache.bval.jsr.example.Address();
        adr.setAddressline1("Street 1");
        adr.setCity("London");
        adr.setCountry(new org.apache.bval.jsr.example.Country());
        adr.getCountry().setName("England");
        hawking.getAddresses().add(adr);
        book1.setAuthor(hawking);
        book2 = new org.apache.bval.jsr.example.Book();
        org.apache.bval.jsr.example.Author castro = new org.apache.bval.jsr.example.Author();
        castro.setFirstName("Fidel");
        castro.setLastName("Castro Ruz");
        book2.setAuthor(castro);
        book2.setTitle("My life");
        book3 = new org.apache.bval.jsr.example.Book();
        book3.setTitle("World best jokes");
        org.apache.bval.jsr.example.Author someone = new org.apache.bval.jsr.example.Author();
        someone.setFirstName("John");
        someone.setLastName("Do");
        book3.setAuthor(someone);
        lib.getTaggedBooks().put("science", book1);
        lib.getTaggedBooks().put("politics", book2);
        lib.getTaggedBooks().put("humor", book3);
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.Library>> violations;
        violations = validator.validate(lib);
        org.junit.Assert.assertTrue(violations.isEmpty());
        book2.setTitle(null);
        book3.getAuthor().setFirstName("");// violate NotEmpty validation

        book1.getAuthor().getAddresses().get(0).setCity(null);
        /* This, by the way, tests redefined default group sequence behavior on
        non-root-beans (Library.Book)!!
         */
        violations = validator.validate(lib);
        org.junit.Assert.assertEquals("redefined default group of Book not correctly validated from Library", 3, violations.size());
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolation(violations, "taggedBooks[politics].title"));
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolation(violations, "taggedBooks[humor].author.firstName"));
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolation(violations, "taggedBooks[science].author.addresses[0].city"));
    }

    @org.junit.Test
    public void testValidateArray() {
        org.apache.bval.jsr.example.Library lib = new org.apache.bval.jsr.example.Library();
        lib.setLibraryName("Unibibliothek");
        lib.setPersons(new org.apache.bval.jsr.example.Person[3]);
        lib.getPersons()[0] = new org.apache.bval.jsr.example.Employee("Marcel", "Reich-Ranicki");
        lib.getPersons()[1] = new org.apache.bval.jsr.example.Employee("Elke", "Heidenreich");
        lib.getPersons()[2] = new org.apache.bval.jsr.example.Customer();// not validated, because only

        // getEmployees() is @Valid
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.Library>> violations;
        violations = validator.validate(lib);
        org.junit.Assert.assertTrue(violations.isEmpty());
        ((org.apache.bval.jsr.example.Employee) (lib.getPersons()[1])).setFirstName("");// violate NotEmpty

        // constraint
        violations = validator.validate(lib);
        org.junit.Assert.assertEquals(1, violations.size());
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolation(violations, "employees[1].firstName"));
    }
}
