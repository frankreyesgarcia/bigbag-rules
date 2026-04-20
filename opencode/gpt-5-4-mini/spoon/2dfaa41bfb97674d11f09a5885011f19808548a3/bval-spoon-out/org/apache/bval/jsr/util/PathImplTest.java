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
package org.apache.bval.jsr.util;
import jakarta.validation.Path;
import jakarta.validation.ValidationException;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
/**
 * PathImpl Tester.
 *
 * @version 1.0
 * @since <pre>10/01/2009</pre>
 */
public class PathImplTest {
    @org.junit.Test
    public void testParsing() {
        java.lang.String property = "order[3].deliveryAddress.addressline[1]";
        jakarta.validation.Path path = org.apache.bval.jsr.util.PathImpl.createPathFromString(property);
        org.junit.Assert.assertEquals(property, path.toString());
        java.util.Iterator<jakarta.validation.Path.Node> propIter = path.iterator();
        org.junit.Assert.assertTrue(propIter.hasNext());
        jakarta.validation.Path.Node elem = propIter.next();
        org.junit.Assert.assertFalse(elem.isInIterable());
        org.junit.Assert.assertEquals("order", elem.getName());
        org.junit.Assert.assertTrue(propIter.hasNext());
        elem = propIter.next();
        org.junit.Assert.assertTrue(elem.isInIterable());
        org.junit.Assert.assertEquals(new java.lang.Integer(3), elem.getIndex());
        org.junit.Assert.assertEquals("deliveryAddress", elem.getName());
        org.junit.Assert.assertTrue(propIter.hasNext());
        elem = propIter.next();
        org.junit.Assert.assertFalse(elem.isInIterable());
        org.junit.Assert.assertEquals(null, elem.getIndex());
        org.junit.Assert.assertEquals("addressline", elem.getName());
        org.junit.Assert.assertTrue(propIter.hasNext());
        elem = propIter.next();
        org.junit.Assert.assertTrue(elem.isInIterable());
        org.junit.Assert.assertEquals(new java.lang.Integer(1), elem.getIndex());
        org.junit.Assert.assertNull(elem.getName());
        org.junit.Assert.assertFalse(propIter.hasNext());
    }

    @org.junit.Test
    public void testParseMapBasedProperty() {
        java.lang.String property = "order[foo].deliveryAddress";
        jakarta.validation.Path path = org.apache.bval.jsr.util.PathImpl.createPathFromString(property);
        java.util.Iterator<jakarta.validation.Path.Node> propIter = path.iterator();
        org.junit.Assert.assertTrue(propIter.hasNext());
        jakarta.validation.Path.Node elem = propIter.next();
        org.junit.Assert.assertFalse(elem.isInIterable());
        org.junit.Assert.assertEquals("order", elem.getName());
        org.junit.Assert.assertTrue(propIter.hasNext());
        elem = propIter.next();
        org.junit.Assert.assertTrue(elem.isInIterable());
        org.junit.Assert.assertEquals("foo", elem.getKey());
        org.junit.Assert.assertEquals("deliveryAddress", elem.getName());
        org.junit.Assert.assertFalse(propIter.hasNext());
    }

    // some of the examples from the 1.0 bean validation spec, section 4.2
    @org.junit.Test
    public void testSpecExamples() {
        java.lang.String fourthAuthor = "authors[3]";
        jakarta.validation.Path path = org.apache.bval.jsr.util.PathImpl.createPathFromString(fourthAuthor);
        java.util.Iterator<jakarta.validation.Path.Node> propIter = path.iterator();
        org.junit.Assert.assertTrue(propIter.hasNext());
        jakarta.validation.Path.Node elem = propIter.next();
        org.junit.Assert.assertFalse(elem.isInIterable());
        org.junit.Assert.assertEquals("authors", elem.getName());
        org.junit.Assert.assertTrue(propIter.hasNext());
        elem = propIter.next();
        org.junit.Assert.assertTrue(elem.isInIterable());
        org.junit.Assert.assertEquals(3, elem.getIndex().intValue());
        org.junit.Assert.assertNull(elem.getName());
        org.junit.Assert.assertFalse(propIter.hasNext());
        java.lang.String firstAuthorCompany = "authors[0].company";
        path = org.apache.bval.jsr.util.PathImpl.createPathFromString(firstAuthorCompany);
        propIter = path.iterator();
        org.junit.Assert.assertTrue(propIter.hasNext());
        elem = propIter.next();
        org.junit.Assert.assertFalse(elem.isInIterable());
        org.junit.Assert.assertEquals("authors", elem.getName());
        org.junit.Assert.assertTrue(propIter.hasNext());
        elem = propIter.next();
        org.junit.Assert.assertTrue(elem.isInIterable());
        org.junit.Assert.assertEquals(0, elem.getIndex().intValue());
        org.junit.Assert.assertEquals("company", elem.getName());
        org.junit.Assert.assertFalse(propIter.hasNext());
    }

    @org.junit.Test
    public void testNull() {
        org.junit.Assert.assertEquals(org.apache.bval.jsr.util.PathImpl.createPathFromString(null), org.apache.bval.jsr.util.PathImpl.create());
        org.junit.Assert.assertEquals("", org.apache.bval.jsr.util.PathImpl.create().toString());
        jakarta.validation.Path path = org.apache.bval.jsr.util.PathImpl.create();
        jakarta.validation.Path.Node node = path.iterator().next();
        org.junit.Assert.assertEquals(null, node.getName());
    }

    @org.junit.Test(expected = jakarta.validation.ValidationException.class)
    public void testUnbalancedBraces() {
        org.apache.bval.jsr.util.PathImpl.createPathFromString("foo[.bar");
    }

    @org.junit.Test(expected = jakarta.validation.ValidationException.class)
    public void testIndexInMiddleOfProperty() {
        org.apache.bval.jsr.util.PathImpl.createPathFromString("f[1]oo.bar");
    }

    @org.junit.Test(expected = jakarta.validation.ValidationException.class)
    public void testTrailingPathSeparator() {
        org.apache.bval.jsr.util.PathImpl.createPathFromString("foo.bar.");
    }

    @org.junit.Test(expected = jakarta.validation.ValidationException.class)
    public void testLeadingPathSeparator() {
        org.apache.bval.jsr.util.PathImpl.createPathFromString(".foo.bar");
    }

    @org.junit.Test
    public void testEmptyString() {
        jakarta.validation.Path path = org.apache.bval.jsr.util.PathImpl.createPathFromString("");
        org.junit.Assert.assertEquals(null, path.iterator().next().getName());
    }

    @org.junit.Test
    public void testToString() {
        org.apache.bval.jsr.util.PathImpl path = org.apache.bval.jsr.util.PathImpl.create();
        path.addNode(new org.apache.bval.jsr.util.NodeImpl.PropertyNodeImpl("firstName"));
        org.junit.Assert.assertEquals("firstName", path.toString());
        path = org.apache.bval.jsr.util.PathImpl.create();
        path.getLeafNode().setIndex(2);
        org.junit.Assert.assertEquals("[2]", path.toString());
        path.addNode(new org.apache.bval.jsr.util.NodeImpl.PropertyNodeImpl("firstName"));
        org.junit.Assert.assertEquals("[2].firstName", path.toString());
    }

    @org.junit.Test
    public void testAddRemoveNodes() {
        org.apache.bval.jsr.util.PathImpl path = org.apache.bval.jsr.util.PathImpl.createPathFromString("");
        org.junit.Assert.assertTrue(path.isRootPath());
        org.junit.Assert.assertEquals(1, countNodes(path));
        path.addNode(new org.apache.bval.jsr.util.NodeImpl.PropertyNodeImpl("foo"));
        org.junit.Assert.assertFalse(path.isRootPath());
        org.junit.Assert.assertEquals(1, countNodes(path));
        path.removeLeafNode();
        org.junit.Assert.assertTrue(path.isRootPath());
        org.junit.Assert.assertEquals(1, countNodes(path));
    }

    private int countNodes(jakarta.validation.Path path) {
        int result = 0;
        for (java.util.Iterator<jakarta.validation.Path.Node> iter = path.iterator(); iter.hasNext();) {
            iter.next();
            result++;
        }
        return result;
    }
}
