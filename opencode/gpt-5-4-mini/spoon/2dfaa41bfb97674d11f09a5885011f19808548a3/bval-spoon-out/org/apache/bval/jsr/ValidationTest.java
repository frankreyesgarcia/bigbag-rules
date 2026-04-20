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
package org.apache.bval.jsr;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.groups.Default;
import jakarta.validation.metadata.BeanDescriptor;
import jakarta.validation.metadata.ConstraintDescriptor;
import jakarta.validation.metadata.PropertyDescriptor;
import org.apache.bval.constraints.NotEmptyValidatorForCharSequence;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
/**
 * Description: <br/>
 */
public class ValidationTest extends org.apache.bval.jsr.ValidationTestBase {
    @org.junit.Before
    public void testCache() {
        org.apache.bval.jsr.ValidationTestBase.factory.getValidator().getConstraintsForClass(org.apache.bval.jsr.example.AccessTestBusinessObject.class);
        org.apache.bval.jsr.ValidationTestBase.factory.getValidator().getConstraintsForClass(org.apache.bval.jsr.example.AccessTestBusinessObject.class);
    }

    // per spec, fields should after all be validated on subclasses
    @org.junit.Test
    @org.junit.Ignore
    public void testAccessStrategies_field_method() {
        org.apache.bval.jsr.example.AccessTestBusinessObject o1 = new org.apache.bval.jsr.example.AccessTestBusinessObject("1");
        org.junit.Assert.assertTrue(validator.validate(o1).isEmpty());
        org.apache.bval.jsr.example.AccessTestBusinessObjectSub o2 = new org.apache.bval.jsr.example.AccessTestBusinessObjectSub("3");
        org.junit.Assert.assertTrue(validator.validate(o2).isEmpty());
        o2 = new org.apache.bval.jsr.example.AccessTestBusinessObjectSub("1");
        org.junit.Assert.assertEquals(1, validator.validate(o2).size());
        // assert, that getvar2() and getVar2() are both validated with their
        // getter method
        o2 = new org.apache.bval.jsr.example.AccessTestBusinessObjectSub("3");
        o2.setVar2("1");
        o2.setvar2("2");
        org.junit.Assert.assertEquals(2, validator.validate(o2).size());
        o2.setvar2("5");
        o2.setVar2("6");
        org.junit.Assert.assertTrue(validator.validate(o2).isEmpty());
        o2.setvar2("5");
        o2.setVar2("-1");
        org.junit.Assert.assertEquals(1, validator.validate(o2).size());
    }

    @org.junit.Test
    public void testAccessStrategies_on_children() {
        org.apache.bval.jsr.example.AccessTestBusinessObject o1 = new org.apache.bval.jsr.example.AccessTestBusinessObject("1");
        org.apache.bval.jsr.example.AccessTestBusinessObject o2 = new org.apache.bval.jsr.example.AccessTestBusinessObject("2");
        o1.next(o2);
        // assert, that field access 'next' is used and not getNext() is called!!!
        org.junit.Assert.assertEquals(1, validator.validate(o1).size());
        o2 = new org.apache.bval.jsr.example.AccessTestBusinessObject("1");
        o1.next(o2);
        org.junit.Assert.assertTrue(validator.validate(o1).isEmpty());
        // assert that toBeIgnored not validated, because not annotated with @Valid
        o1.setToBeIgnored(new org.apache.bval.jsr.example.AccessTestBusinessObject("99"));
        org.junit.Assert.assertTrue(validator.validate(o1).isEmpty());
        o1.setNext(new org.apache.bval.jsr.example.AccessTestBusinessObject("99"));
        org.junit.Assert.assertEquals(1, validator.validate(o1).size());
    }

    @org.junit.Test
    public void testBook() {
        org.apache.bval.jsr.example.Author author = new org.apache.bval.jsr.example.Author();
        author.setLastName("Baudelaire");
        author.setFirstName("");
        org.apache.bval.jsr.example.Book book = new org.apache.bval.jsr.example.Book();
        book.setAuthor(author);
        book.setSubtitle("12345678900125678901234578901234567890");
        // NotEmpty failure on the title field
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.Book>> errors = validator.validate(book, org.apache.bval.jsr.example.Book.All.class);
        org.junit.Assert.assertFalse(errors.isEmpty());
        book.setTitle("Les fleurs du mal");
        author.setCompany("Some random publisher with a very very very long name");
        // author.firstName fails to pass the NotEmpty constraint
        // author.company fails to pass the Size constraint
    }

    /**
     * test: - dynamic resolution of associated object types. - inheritance of validation constraints - complex
     * valiation, different groups, nested object net
     */
    @org.junit.Test
    public void testValidAnnotation() {
        org.apache.bval.jsr.example.Author a = new org.apache.bval.jsr.example.Author();
        a.setAddresses(new java.util.ArrayList<org.apache.bval.jsr.example.Address>());
        org.apache.bval.jsr.example.BusinessAddress adr = new org.apache.bval.jsr.example.BusinessAddress();
        adr.setCountry(new org.apache.bval.jsr.example.Country());
        adr.setAddressline1("line1");
        adr.setAddressline2("line2");
        adr.setZipCode("1234567890123456789");
        a.getAddresses().add(adr);
        a.setFirstName("Karl");
        a.setLastName("May");
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.Author>> found = validator.validate(a, jakarta.validation.groups.Default.class, org.apache.bval.jsr.example.First.class, org.apache.bval.jsr.example.Last.class);
        org.junit.Assert.assertTrue(!found.isEmpty());
        org.junit.Assert.assertEquals(4, found.size());
        adr.setCity("Berlin");
        adr.setZipCode("12345");
        adr.setCompany("apache");
        found = validator.validate(a, jakarta.validation.groups.Default.class, org.apache.bval.jsr.example.First.class, org.apache.bval.jsr.example.Last.class);
        org.junit.Assert.assertEquals(1, found.size());
        jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.Author> ic = found.iterator().next();
        org.junit.Assert.assertEquals("addresses[0].country.name", ic.getPropertyPath().toString());
    }

    @org.junit.Test
    public void testPropertyPathWithIndex() {
        org.apache.bval.jsr.example.Author a = new org.apache.bval.jsr.example.Author();
        a.setAddresses(new java.util.ArrayList<org.apache.bval.jsr.example.Address>());
        org.apache.bval.jsr.example.Address adr = new org.apache.bval.jsr.example.Address();
        adr.setAddressline1("adr1");
        adr.setCity("Santiago");
        a.getAddresses().add(adr);
        adr = new org.apache.bval.jsr.example.Address();
        adr.setAddressline1("adr2");
        adr.setCity("Havanna");
        a.getAddresses().add(adr);
        adr = new org.apache.bval.jsr.example.Address();
        adr.setAddressline1("adr3");
        adr.setCity("Trinidad");
        a.getAddresses().add(adr);
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.Author>> constraints = validator.validate(a);
        org.junit.Assert.assertFalse(constraints.isEmpty());
        org.apache.bval.jsr.ValidationTest.assertPropertyPath("addresses[0].country", constraints);
        org.apache.bval.jsr.ValidationTest.assertPropertyPath("addresses[1].country", constraints);
        org.apache.bval.jsr.ValidationTest.assertPropertyPath("addresses[2].country", constraints);
    }

    /**
     * Check correct path reporting when validating a set of beans.
     */
    @org.junit.Test
    public void testPropertyPathOnSet() {
        org.apache.bval.jsr.example.Continent c = new org.apache.bval.jsr.example.Continent();
        c.name = "c1";
        org.apache.bval.jsr.example.Country country = new org.apache.bval.jsr.example.Country();
        country.setISO2Code("xx");
        country.setISO3Code("xxx");
        country.setName(null);
        c.countries.add(country);
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.Continent>> constraints = validator.validate(c);
        org.junit.Assert.assertEquals("Incorrect number of violations detected", 1, constraints.size());
        org.apache.bval.jsr.ValidationTest.assertPropertyPath("countries[].name", constraints);
    }

    private static <T> void assertPropertyPath(java.lang.String propertyPath, java.util.Set<jakarta.validation.ConstraintViolation<T>> constraints) {
        for (jakarta.validation.ConstraintViolation<T> each : constraints) {
            if (each.getPropertyPath().toString().equals(propertyPath)) {
                return;
            }
        }
        org.junit.Assert.fail((propertyPath + " not found in ") + constraints);
    }

    @org.junit.Test
    public void testPropertyPathRecursive() {
        org.apache.bval.jsr.example.RecursiveFoo foo1 = new org.apache.bval.jsr.example.RecursiveFoo();// root

        org.apache.bval.jsr.example.RecursiveFoo foo11 = new org.apache.bval.jsr.example.RecursiveFoo();
        foo1.getFoos().add(foo11);// foos[0]

        org.apache.bval.jsr.example.RecursiveFoo foo12 = new org.apache.bval.jsr.example.RecursiveFoo();
        foo1.getFoos().add(foo12);// foos[1]

        org.apache.bval.jsr.example.RecursiveFoo foo2 = new org.apache.bval.jsr.example.RecursiveFoo();
        foo11.getFoos().add(foo2);// foos[0].foos[0]

        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.RecursiveFoo>> constraints = validator.validate(foo1);
        org.apache.bval.jsr.ValidationTest.assertPropertyPath("foos[0].foos[0].foos", constraints);
        org.apache.bval.jsr.ValidationTest.assertPropertyPath("foos[1].foos", constraints);
    }

    @org.junit.Test
    public void testNullElementInCollection() {
        org.apache.bval.jsr.example.RecursiveFoo foo = new org.apache.bval.jsr.example.RecursiveFoo();
        foo.getFoos().add(new org.apache.bval.jsr.example.RecursiveFoo());
        foo.getFoos().add(null);
        org.junit.Assert.assertFalse(validator.validate(foo).isEmpty());
        // check that no nullpointer exception gets thrown
    }

    @org.junit.Test
    public void testGroups() {
        final org.apache.bval.jsr.example.Author author = new org.apache.bval.jsr.example.Author();
        author.setFirstName("Wile");
        author.setLastName("Coyote");
        author.setCompany("ACME");
        final org.apache.bval.jsr.example.Book book = new org.apache.bval.jsr.example.Book();
        book.setTitle("");
        book.setAuthor(author);
        boolean foundTitleConstraint = false;
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.Book>> constraintViolations = validator.validate(book, org.apache.bval.jsr.example.Book.All.class);
        org.junit.Assert.assertEquals(1, constraintViolations.size());
        // assuming an english locale, the interpolated message is returned
        for (jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.Book> constraintViolation : constraintViolations) {
            if (org.apache.bval.jsr.example.Book.class.equals(constraintViolation.getRootBean().getClass())) {
                org.junit.Assert.assertEquals("must not be empty", constraintViolation.getMessage());
                org.junit.Assert.assertSame(book, constraintViolation.getRootBean());
                // the offending property
                if ("title".equals(constraintViolation.getPropertyPath().toString())) {
                    foundTitleConstraint = true;
                    // the offending value
                    org.junit.Assert.assertEquals(book.getTitle(), constraintViolation.getInvalidValue());
                }
            }
        }
        org.junit.Assert.assertTrue(foundTitleConstraint);
    }

    /**
     * Example 2.14. Using the fluent API to build custom constraint violations. test that: the
     * {@link org.apache.bval.constraints.ZipCodeCityCoherenceValidator} adds custom messages to the context and
     * suppresses the default message
     */
    @org.junit.Test
    public void testConstraintValidatorContextFluentAPI() {
        org.apache.bval.jsr.example.Address ad = new org.apache.bval.jsr.example.Address();
        ad.setCity("error");
        ad.setZipCode("error");
        ad.setAddressline1("something");
        ad.setCountry(new org.apache.bval.jsr.example.Country());
        ad.getCountry().setName("something");
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.Address>> violations = validator.validate(ad);
        org.junit.Assert.assertEquals(2, violations.size());
        for (jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.Address> each : violations) {
            org.junit.Assert.assertTrue(each.getMessage().endsWith(" not OK"));
        }
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolation(violations, "city"));
        org.junit.Assert.assertNotNull(org.apache.bval.jsr.util.TestUtils.getViolation(violations, ""));
    }

    @org.junit.Test
    public void testValidateNestedPropertyPath() throws java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.IllegalAccessException {
        final java.lang.String propPath = "addresses[0].country.ISO2Code";
        org.apache.bval.jsr.example.Author author = new org.apache.bval.jsr.example.Author();
        author.setAddresses(new java.util.ArrayList<org.apache.bval.jsr.example.Address>());
        org.apache.bval.jsr.example.Address adr = new org.apache.bval.jsr.example.Address();
        author.getAddresses().add(adr);
        org.apache.bval.jsr.example.Country country = new org.apache.bval.jsr.example.Country();
        adr.setCountry(country);
        country.setISO2Code("too_long");
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.Author>> iv = validator.validateProperty(author, propPath);
        org.junit.Assert.assertEquals(1, iv.size());
        jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.Author> vio = iv.iterator().next();
        org.junit.Assert.assertEquals(propPath, vio.getPropertyPath().toString());
        org.junit.Assert.assertSame(author, vio.getRootBean());
        org.junit.Assert.assertSame(author.getAddresses().get(0).getCountry(), vio.getLeafBean());
        country.setISO2Code("23");
        iv = validator.validateProperty(author, propPath);
        org.junit.Assert.assertTrue(iv.isEmpty());
        iv = validator.validateValue(org.apache.bval.jsr.example.Author.class, propPath, "345");
        org.junit.Assert.assertEquals(1, iv.size());
        vio = iv.iterator().next();
        org.junit.Assert.assertEquals(propPath, vio.getPropertyPath().toString());
        org.junit.Assert.assertNull(vio.getRootBean());
        org.junit.Assert.assertNull(vio.getLeafBean());
        org.junit.Assert.assertTrue(validator.validateValue(org.apache.bval.jsr.example.Author.class, propPath, "34").isEmpty());
    }

    @org.junit.Test
    public void testValidateCascadingNestedBean() throws java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.IllegalAccessException {
        final java.lang.String propPath = "addresses[0]";
        org.apache.bval.jsr.CascadingPropertyValidator v = validator.unwrap(org.apache.bval.jsr.CascadingPropertyValidator.class);
        org.apache.bval.jsr.example.Author author = new org.apache.bval.jsr.example.Author();
        author.setAddresses(new java.util.ArrayList<org.apache.bval.jsr.example.Address>());
        org.apache.bval.jsr.example.Address adr = new org.apache.bval.jsr.example.Address();
        author.getAddresses().add(adr);
        org.apache.bval.jsr.example.Country country = new org.apache.bval.jsr.example.Country();
        adr.setCity("dark");
        adr.setCountry(country);
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.Author>> iv = v.validateProperty(author, propPath);
        org.junit.Assert.assertEquals(1, iv.size());// null address line 1 (no cascade)

        country.setISO2Code("too_long");
        iv = v.validateProperty(author, propPath, true);
        org.junit.Assert.assertEquals(3, iv.size());// null address line 1 + null

        // country.name + too long
        // country.iso2code
        country.setISO2Code("23");
        iv = v.validateProperty(author, propPath, true);
        org.junit.Assert.assertEquals(2, iv.size());// null address line 1 + null

        // country.name, country.iso2code
        // fixed
        org.apache.bval.jsr.example.Address value = new org.apache.bval.jsr.example.Address();
        value.setCity("whatever");
        value.setAddressline1("1 address line");
        iv = v.validateValue(org.apache.bval.jsr.example.Author.class, propPath, value, true);
        org.junit.Assert.assertEquals(1, iv.size());// null country

        value.setCountry(new org.apache.bval.jsr.example.Country());
        iv = v.validateValue(org.apache.bval.jsr.example.Author.class, propPath, value, true);
        org.junit.Assert.assertEquals(1, iv.size());// null country.name

        value.getCountry().setName("NWO");
        iv = v.validateValue(org.apache.bval.jsr.example.Author.class, propPath, value, true);
        org.junit.Assert.assertEquals(0, iv.size());
    }

    @org.junit.Test
    public void testValidateCascadingNestedProperty() throws java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.IllegalAccessException {
        final java.lang.String propPath = "addresses[0].country";
        org.apache.bval.jsr.CascadingPropertyValidator v = validator.unwrap(org.apache.bval.jsr.CascadingPropertyValidator.class);
        org.apache.bval.jsr.example.Author author = new org.apache.bval.jsr.example.Author();
        author.setAddresses(new java.util.ArrayList<org.apache.bval.jsr.example.Address>());
        org.apache.bval.jsr.example.Address adr = new org.apache.bval.jsr.example.Address();
        author.getAddresses().add(adr);
        org.apache.bval.jsr.example.Country country = new org.apache.bval.jsr.example.Country();
        adr.setCity("dark");
        adr.setCountry(country);
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.Author>> iv = v.validateProperty(author, propPath);
        org.junit.Assert.assertEquals(0, iv.size());
        country.setISO2Code("too_long");
        iv = v.validateProperty(author, propPath, true);
        org.junit.Assert.assertEquals(2, iv.size());
        // country.name + too long
        // country.iso2code
        country.setISO2Code("23");
        iv = v.validateProperty(author, propPath, true);
        org.junit.Assert.assertEquals(1, iv.size());
        // country.name, country.iso2code
        org.apache.bval.jsr.example.Country value = null;
        iv = v.validateValue(org.apache.bval.jsr.example.Author.class, propPath, value, true);
        org.junit.Assert.assertEquals(1, iv.size());// null country

        value = new org.apache.bval.jsr.example.Country();
        iv = v.validateValue(org.apache.bval.jsr.example.Author.class, propPath, value, true);
        org.junit.Assert.assertEquals(1, iv.size());// null country.name

        value.setName("NWO");
        iv = v.validateValue(org.apache.bval.jsr.example.Author.class, propPath, value, true);
        org.junit.Assert.assertEquals(0, iv.size());
    }

    @org.junit.Test
    public void testValidateCascadingNestedTipProperty() {
        final java.lang.String propPath = "addresses[0].country.name";
        org.apache.bval.jsr.CascadingPropertyValidator v = validator.unwrap(org.apache.bval.jsr.CascadingPropertyValidator.class);
        org.apache.bval.jsr.example.Author author = new org.apache.bval.jsr.example.Author();
        author.setAddresses(new java.util.ArrayList<org.apache.bval.jsr.example.Address>());
        org.apache.bval.jsr.example.Address adr = new org.apache.bval.jsr.example.Address();
        author.getAddresses().add(adr);
        org.apache.bval.jsr.example.Country country = new org.apache.bval.jsr.example.Country();
        adr.setCity("dark");
        adr.setCountry(country);
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.Author>> iv = v.validateProperty(author, propPath);
        org.junit.Assert.assertEquals(1, iv.size());
        iv = v.validateProperty(author, propPath, true);
        org.junit.Assert.assertEquals(1, iv.size());
    }

    @org.junit.Test
    public void testValidateCascadingKeyedElement() throws java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.IllegalAccessException {
        final java.lang.String propPath = "[foo]";
        org.apache.bval.jsr.CascadingPropertyValidator v = validator.unwrap(org.apache.bval.jsr.CascadingPropertyValidator.class);
        final org.apache.bval.jsr.example.Address adr = new org.apache.bval.jsr.example.Address();
        @java.lang.SuppressWarnings("serial")
        java.lang.Object map = new java.util.HashMap<java.lang.String, org.apache.bval.jsr.example.Address>() {
            {
                put("foo", adr);
            }
        };
        org.apache.bval.jsr.example.Country country = new org.apache.bval.jsr.example.Country();
        adr.setCity("dark");
        adr.setCountry(country);
        java.util.Set<jakarta.validation.ConstraintViolation<java.lang.Object>> iv = v.validateProperty(map, propPath);
        org.junit.Assert.assertEquals(1, iv.size());// null address line 1 (no cascade)

        country.setISO2Code("too_long");
        iv = v.validateProperty(map, propPath, true);
        org.junit.Assert.assertEquals(3, iv.size());// null address line 1 + null

        // country.name + too long
        // country.iso2code
        country.setISO2Code("23");
        iv = v.validateProperty(map, propPath, true);
        org.junit.Assert.assertEquals(2, iv.size());// null address line 1 + null

        // country.name, country.iso2code
        // fixed
        org.apache.bval.jsr.example.Address value = new org.apache.bval.jsr.example.Address();
        value.setCity("whatever");
        value.setAddressline1("1 address line");
        java.util.Set<?> iv2 = v.validateValue(map.getClass(), propPath, value, true);
        org.junit.Assert.assertEquals(1, iv2.size());// null country

        value.setCountry(new org.apache.bval.jsr.example.Country());
        iv2 = v.validateValue(map.getClass(), propPath, value, true);
        org.junit.Assert.assertEquals(1, iv2.size());// null country.name

        value.getCountry().setName("NWO");
        iv2 = v.validateValue(map.getClass(), propPath, value, true);
        org.junit.Assert.assertEquals(0, iv2.size());
    }

    @java.lang.SuppressWarnings("unchecked")
    @org.junit.Test
    public void testValidateCascadingKeyedGenericElement() throws java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.IllegalAccessException {
        final java.lang.String propPath = "[foo]";
        org.apache.bval.jsr.CascadingPropertyValidator v = validator.unwrap(org.apache.bval.jsr.CascadingPropertyValidator.class);
        final org.apache.bval.jsr.example.Address adr = new org.apache.bval.jsr.example.Address();
        java.lang.Object map = new java.util.HashMap<java.lang.String, org.apache.bval.jsr.example.Address>();
        ((java.util.Map<java.lang.String, org.apache.bval.jsr.example.Address>) (map)).put("foo", adr);
        org.apache.bval.jsr.example.Country country = new org.apache.bval.jsr.example.Country();
        adr.setCity("dark");
        adr.setCountry(country);
        java.util.Set<?> iv = v.validateProperty(map, propPath);
        org.junit.Assert.assertEquals(1, iv.size());// null address line 1 (no cascade)

        country.setISO2Code("too_long");
        iv = v.validateProperty(map, propPath, true);
        org.junit.Assert.assertEquals(3, iv.size());// null address line 1 + null

        // country.name + too long
        // country.iso2code
        country.setISO2Code("23");
        iv = v.validateProperty(map, propPath, true);
        org.junit.Assert.assertEquals(2, iv.size());// null address line 1 + null

        // country.name, country.iso2code
        // fixed
        org.apache.bval.jsr.example.Address value = new org.apache.bval.jsr.example.Address();
        value.setCity("whatever");
        value.setAddressline1("1 address line");
        java.util.Set<?> iv2 = v.validateValue(java.util.Map.class, propPath, value, true);
        org.junit.Assert.assertEquals(1, iv2.size());// null country

        value.setCountry(new org.apache.bval.jsr.example.Country());
        iv2 = v.validateValue(java.util.Map.class, propPath, value, true);
        org.junit.Assert.assertEquals(1, iv2.size());// null country.name

        value.getCountry().setName("NWO");
        iv2 = v.validateValue(java.util.Map.class, propPath, value, true);
        org.junit.Assert.assertEquals(0, iv2.size());
    }

    @org.junit.Test
    public void testValidateCascadingIndexedElement() throws java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.IllegalAccessException {
        final java.lang.String propPath = "[0]";
        org.apache.bval.jsr.CascadingPropertyValidator v = validator.unwrap(org.apache.bval.jsr.CascadingPropertyValidator.class);
        org.apache.bval.jsr.example.Address value = new org.apache.bval.jsr.example.Address();
        value.setCity("whatever");
        value.setAddressline1("1 address line");
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.Address[]>> iv;
        org.apache.bval.jsr.example.Address[] array = new org.apache.bval.jsr.example.Address[]{ value };
        iv = v.validateProperty(array, propPath, true);
        org.junit.Assert.assertEquals(1, iv.size());// null country

        value.setCountry(new org.apache.bval.jsr.example.Country());
        iv = v.validateProperty(array, propPath, true);
        org.junit.Assert.assertEquals(1, iv.size());// null country.name

        value.getCountry().setName("NWO");
        iv = v.validateProperty(array, propPath, true);
        org.junit.Assert.assertEquals(0, iv.size());
        value = new org.apache.bval.jsr.example.Address();
        value.setCity("whatever");
        value.setAddressline1("1 address line");
        java.util.Set<?> iv2;
        iv2 = v.validateValue(array.getClass(), propPath, value, true);
        org.junit.Assert.assertEquals(1, iv2.size());// null country

        value.setCountry(new org.apache.bval.jsr.example.Country());
        iv2 = v.validateValue(array.getClass(), propPath, value, true);
        org.junit.Assert.assertEquals(1, iv2.size());// null country.name

        value.getCountry().setName("NWO");
        iv2 = v.validateValue(array.getClass(), propPath, value, true);
        org.junit.Assert.assertEquals(0, iv2.size());
    }

    @org.junit.Test
    public void testValidateCascadingIndexedGenericElement() throws java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.IllegalAccessException {
        final java.lang.String propPath = "[0]";
        org.apache.bval.jsr.CascadingPropertyValidator v = validator.unwrap(org.apache.bval.jsr.CascadingPropertyValidator.class);
        org.apache.bval.jsr.example.Address value = new org.apache.bval.jsr.example.Address();
        value.setCity("whatever");
        value.setAddressline1("1 address line");
        java.util.Set<?> iv;
        java.lang.Object list = java.util.Collections.singletonList(value);
        iv = v.validateProperty(list, propPath, true);
        org.junit.Assert.assertEquals(1, iv.size());// null country

        value.setCountry(new org.apache.bval.jsr.example.Country());
        iv = v.validateProperty(list, propPath, true);
        org.junit.Assert.assertEquals(1, iv.size());// null country.name

        value.getCountry().setName("NWO");
        iv = v.validateProperty(list, propPath, true);
        org.junit.Assert.assertEquals(0, iv.size());
        value = new org.apache.bval.jsr.example.Address();
        value.setCity("whatever");
        value.setAddressline1("1 address line");
        java.util.Set<?> iv2;
        iv2 = v.validateValue(java.util.List.class, propPath, value, true);
        org.junit.Assert.assertEquals(1, iv2.size());// null country

        value.setCountry(new org.apache.bval.jsr.example.Country());
        iv2 = v.validateValue(java.util.List.class, propPath, value, true);
        org.junit.Assert.assertEquals(1, iv2.size());// null country.name

        value.getCountry().setName("NWO");
        iv2 = v.validateValue(java.util.List.class, propPath, value, true);
        org.junit.Assert.assertEquals(0, iv2.size());
    }

    public interface Foo {}

    public static class FooAddress extends org.apache.bval.jsr.example.Address {
        /**
         * {@inheritDoc }
         */
        @java.lang.Override
        @jakarta.validation.constraints.NotNull(groups = org.apache.bval.jsr.ValidationTest.Foo.class)
        public java.lang.String getCity() {
            return super.getCity();
        }
    }

    @org.junit.Test
    public void testValidateCascadingPropertyWithMultipleGroupsIgnoresSiblingProperties() {
        final java.lang.String propPath = "addresses[0].country";
        org.apache.bval.jsr.CascadingPropertyValidator v = validator.unwrap(org.apache.bval.jsr.CascadingPropertyValidator.class);
        org.apache.bval.jsr.example.Author author = new org.apache.bval.jsr.example.Author();
        author.setAddresses(new java.util.ArrayList<org.apache.bval.jsr.example.Address>());
        org.apache.bval.jsr.example.Address adr = new org.apache.bval.jsr.ValidationTest.FooAddress();
        author.getAddresses().add(adr);
        org.apache.bval.jsr.example.Country country = new org.apache.bval.jsr.example.Country();
        adr.setCountry(country);
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.example.Author>> iv = v.validateProperty(author, propPath, true, jakarta.validation.groups.Default.class, org.apache.bval.jsr.ValidationTest.Foo.class);
        org.junit.Assert.assertEquals(1, iv.size());
    }

    @org.junit.Test
    public void testMetadataAPI() {
        jakarta.validation.metadata.BeanDescriptor bookBeanDescriptor = validator.getConstraintsForClass(org.apache.bval.jsr.example.Book.class);
        // expect no constraints on Book's Class-Level
        org.junit.Assert.assertFalse(bookBeanDescriptor.hasConstraints());
        // but there are constraints on Book's Property-Level
        org.junit.Assert.assertTrue(bookBeanDescriptor.isBeanConstrained());
        org.junit.Assert.assertTrue(bookBeanDescriptor.getConstraintDescriptors().isEmpty());// no

        // constraint
        // more specifically "author" and "title"
        org.junit.Assert.assertEquals(4, bookBeanDescriptor.getConstrainedProperties().size());
        // not a property
        org.junit.Assert.assertNull(bookBeanDescriptor.getConstraintsForProperty("doesNotExist"));
        // property with no constraint
        org.junit.Assert.assertNull(bookBeanDescriptor.getConstraintsForProperty("description"));
        jakarta.validation.metadata.PropertyDescriptor propertyDescriptor = bookBeanDescriptor.getConstraintsForProperty("title");
        org.junit.Assert.assertEquals(1, propertyDescriptor.getConstraintDescriptors().size());
        org.junit.Assert.assertEquals("title", propertyDescriptor.getPropertyName());
        // assuming the implementation returns the NotEmpty constraint first
        java.util.Iterator<jakarta.validation.metadata.ConstraintDescriptor<?>> iter = propertyDescriptor.getConstraintDescriptors().iterator();
        jakarta.validation.metadata.ConstraintDescriptor<?> constraintDescriptor = null;
        while (iter.hasNext()) {
            constraintDescriptor = iter.next();
            if (constraintDescriptor.getAnnotation().annotationType().equals(jakarta.validation.constraints.NotEmpty.class)) {
                break;
            }
        } 
        org.junit.Assert.assertNotNull(constraintDescriptor);
        org.junit.Assert.assertEquals(1, constraintDescriptor.getGroups().size());// "first"

        org.junit.Assert.assertTrue(constraintDescriptor.getConstraintValidatorClasses().contains(org.apache.bval.constraints.NotEmptyValidatorForCharSequence.class));
        // assuming the implementation returns the Size constraint first
        propertyDescriptor = bookBeanDescriptor.getConstraintsForProperty("subtitle");
        java.util.Iterator<jakarta.validation.metadata.ConstraintDescriptor<?>> iterator = propertyDescriptor.getConstraintDescriptors().iterator();
        constraintDescriptor = iterator.next();
        org.junit.Assert.assertTrue(constraintDescriptor.getAnnotation().annotationType().equals(jakarta.validation.constraints.Size.class));
        org.junit.Assert.assertEquals(30, ((java.lang.Integer) (constraintDescriptor.getAttributes().get("max"))).intValue());
        org.junit.Assert.assertEquals(1, constraintDescriptor.getGroups().size());
        propertyDescriptor = bookBeanDescriptor.getConstraintsForProperty("author");
        org.junit.Assert.assertEquals(1, propertyDescriptor.getConstraintDescriptors().size());
        org.junit.Assert.assertTrue(propertyDescriptor.isCascaded());
        org.junit.Assert.assertNull(bookBeanDescriptor.getConstraintsForProperty("unconstraintField"));
    }

    @org.junit.Test
    public void testKeyedMetadata() {
        @java.lang.SuppressWarnings("serial")
        jakarta.validation.metadata.BeanDescriptor beanDescriptor = validator.getConstraintsForClass(new java.util.HashMap<java.lang.String, java.lang.Object>() {}.getClass());
        org.junit.Assert.assertNotNull(beanDescriptor);
        org.junit.Assert.assertFalse(beanDescriptor.isBeanConstrained());
        org.junit.Assert.assertNull(beanDescriptor.getConstraintsForProperty("[foo]"));
    }

    @org.junit.Test
    public void testGenericKeyedMetadata() {
        jakarta.validation.metadata.BeanDescriptor beanDescriptor = validator.getConstraintsForClass(java.util.Map.class);
        org.junit.Assert.assertNotNull(beanDescriptor);
        org.junit.Assert.assertFalse(beanDescriptor.isBeanConstrained());
        org.junit.Assert.assertNull(beanDescriptor.getConstraintsForProperty("[foo]"));
    }

    @org.junit.Test
    public void testIndexedMetadata() {
        jakarta.validation.metadata.BeanDescriptor beanDescriptor = validator.getConstraintsForClass(java.lang.reflect.Array.newInstance(org.apache.bval.jsr.example.Author.class, 0).getClass());
        org.junit.Assert.assertNotNull(beanDescriptor);
        org.junit.Assert.assertFalse(beanDescriptor.isBeanConstrained());
        org.junit.Assert.assertNull(beanDescriptor.getConstraintsForProperty("[0]"));
    }

    @org.junit.Test
    public void testGenericIndexedMetadata() {
        jakarta.validation.metadata.BeanDescriptor beanDescriptor = validator.getConstraintsForClass(java.util.List.class);
        org.junit.Assert.assertNotNull(beanDescriptor);
        org.junit.Assert.assertFalse(beanDescriptor.isBeanConstrained());
        org.junit.Assert.assertNull(beanDescriptor.getConstraintsForProperty("[0]"));
    }

    @org.junit.Test
    public void testValidateClassImplementingCloneable() {
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.ValidationTest.TestCloneableClass>> errors = validator.validate(new org.apache.bval.jsr.ValidationTest.TestCloneableClass());
        org.junit.Assert.assertTrue(errors.isEmpty());
    }

    @org.junit.Test
    public void testValidatePrimitiveBooleanPropertyNameIssue149() {
        java.util.Set<jakarta.validation.ConstraintViolation<org.apache.bval.jsr.ValidationTest.Issue149Subject>> violations = validator.validate(new org.apache.bval.jsr.ValidationTest.Issue149Subject());
        org.junit.Assert.assertEquals(1, violations.size());
        jakarta.validation.ConstraintViolation<org.apache.bval.jsr.ValidationTest.Issue149Subject> violation = violations.iterator().next();
        org.junit.Assert.assertEquals("false", violation.getMessage());
        org.junit.Assert.assertEquals("booleanFalse", violation.getPropertyPath().toString());
    }

    public static class Issue149Subject {
        @jakarta.validation.constraints.AssertTrue(message = "true")
        public boolean isBooleanTrue() {
            return true;
        }

        @jakarta.validation.constraints.AssertTrue(message = "false")
        public boolean isBooleanFalse() {
            return false;
        }
    }

    private static class TestCloneableClass implements java.lang.Cloneable {}
}
