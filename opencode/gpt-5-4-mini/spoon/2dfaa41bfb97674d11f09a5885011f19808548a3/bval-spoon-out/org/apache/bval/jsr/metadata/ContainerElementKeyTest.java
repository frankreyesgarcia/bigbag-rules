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
package org.apache.bval.jsr.metadata;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
public class ContainerElementKeyTest {
    public abstract static class HasList {
        public java.util.List<java.lang.String> strings;
    }

    public abstract static class BoundListType implements java.util.List<java.lang.String> {}

    private java.lang.reflect.Field stringsField;

    @org.junit.Before
    public void setup() throws java.lang.Exception {
        stringsField = org.apache.bval.jsr.metadata.ContainerElementKeyTest.HasList.class.getField("strings");
    }

    @org.junit.Test
    public void testBasic() {
        final org.apache.bval.jsr.metadata.ContainerElementKey containerElementKey = new org.apache.bval.jsr.metadata.ContainerElementKey(stringsField.getAnnotatedType(), java.lang.Integer.valueOf(0));
        org.junit.Assert.assertEquals(java.util.List.class, containerElementKey.getContainerClass());
        org.junit.Assert.assertEquals(0, containerElementKey.getTypeArgumentIndex().intValue());
        org.junit.Assert.assertEquals(java.lang.String.class, containerElementKey.getAnnotatedType().getType());
    }

    @org.junit.Test
    public void testAssignableKeys() {
        final org.apache.bval.jsr.metadata.ContainerElementKey containerElementKey = new org.apache.bval.jsr.metadata.ContainerElementKey(stringsField.getAnnotatedType(), java.lang.Integer.valueOf(0));
        final java.util.Iterator<org.apache.bval.jsr.metadata.ContainerElementKey> iterator = containerElementKey.getAssignableKeys().iterator();
        {
            org.junit.Assert.assertTrue(iterator.hasNext());
            final org.apache.bval.jsr.metadata.ContainerElementKey assignableKey = iterator.next();
            org.junit.Assert.assertEquals(java.util.Collection.class, assignableKey.getContainerClass());
            org.junit.Assert.assertEquals(0, assignableKey.getTypeArgumentIndex().intValue());
            org.junit.Assert.assertTrue(assignableKey.getAnnotatedType().getType() instanceof java.lang.reflect.TypeVariable<?>);
        }
        {
            org.junit.Assert.assertTrue(iterator.hasNext());
            final org.apache.bval.jsr.metadata.ContainerElementKey assignableKey = iterator.next();
            org.junit.Assert.assertEquals(java.lang.Iterable.class, assignableKey.getContainerClass());
            org.junit.Assert.assertEquals(0, assignableKey.getTypeArgumentIndex().intValue());
            org.junit.Assert.assertTrue(assignableKey.getAnnotatedType().getType() instanceof java.lang.reflect.TypeVariable<?>);
        }
        org.junit.Assert.assertFalse(iterator.hasNext());
    }

    @org.junit.Test
    public void testAssignableKeysWithExplicitBinding() {
        final org.apache.bval.jsr.metadata.ContainerElementKey containerElementKey = new org.apache.bval.jsr.metadata.ContainerElementKey(org.apache.bval.jsr.metadata.ContainerElementKeyTest.BoundListType.class, null);
        final java.util.Iterator<org.apache.bval.jsr.metadata.ContainerElementKey> iterator = containerElementKey.getAssignableKeys().iterator();
        {
            org.junit.Assert.assertTrue(iterator.hasNext());
            final org.apache.bval.jsr.metadata.ContainerElementKey assignableKey = iterator.next();
            org.junit.Assert.assertEquals(java.util.List.class, assignableKey.getContainerClass());
            org.junit.Assert.assertEquals(0, assignableKey.getTypeArgumentIndex().intValue());
        }
        {
            org.junit.Assert.assertTrue(iterator.hasNext());
            final org.apache.bval.jsr.metadata.ContainerElementKey assignableKey = iterator.next();
            org.junit.Assert.assertEquals(java.util.Collection.class, assignableKey.getContainerClass());
            org.junit.Assert.assertEquals(0, assignableKey.getTypeArgumentIndex().intValue());
        }
        {
            org.junit.Assert.assertTrue(iterator.hasNext());
            final org.apache.bval.jsr.metadata.ContainerElementKey assignableKey = iterator.next();
            org.junit.Assert.assertEquals(java.lang.Iterable.class, assignableKey.getContainerClass());
            org.junit.Assert.assertEquals(0, assignableKey.getTypeArgumentIndex().intValue());
            org.junit.Assert.assertTrue(assignableKey.getAnnotatedType().getType() instanceof java.lang.reflect.TypeVariable<?>);
        }
        org.junit.Assert.assertFalse(iterator.hasNext());
    }

    @org.junit.Test
    public void testTypeVariableInheritance() {
        final org.apache.bval.jsr.metadata.ContainerElementKey containerElementKey = new org.apache.bval.jsr.metadata.ContainerElementKey(stringsField.getAnnotatedType(), java.lang.Integer.valueOf(0));
        org.junit.Assert.assertTrue(containerElementKey.represents(java.util.List.class.getTypeParameters()[0]));
        org.junit.Assert.assertTrue(containerElementKey.represents(java.util.Collection.class.getTypeParameters()[0]));
        org.junit.Assert.assertTrue(containerElementKey.represents(java.lang.Iterable.class.getTypeParameters()[0]));
    }
}
