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
/**
 *
 * @author Hardy Ferentschik
 * @author Roman Stumm
 */
public class DefaultGroupSequenceTest {
    @org.junit.Test
    public void testAssertDefaultGroupSequenceIsExpandableWithDefaultAtEndOfSequence() {
        // create a dummy sequence
        org.apache.bval.jsr.groups.Group a = new org.apache.bval.jsr.groups.Group(org.apache.bval.jsr.groups.GroupA.class);
        org.apache.bval.jsr.groups.Group b = new org.apache.bval.jsr.groups.Group(org.apache.bval.jsr.groups.GroupB.class);
        org.apache.bval.jsr.groups.Group c = new org.apache.bval.jsr.groups.Group(org.apache.bval.jsr.groups.GroupC.class);
        org.apache.bval.jsr.groups.Group defaultGroup = new org.apache.bval.jsr.groups.Group(jakarta.validation.groups.Default.class);
        java.util.List<org.apache.bval.jsr.groups.Group> sequence = new java.util.ArrayList<org.apache.bval.jsr.groups.Group>();
        sequence.add(a);
        sequence.add(b);
        sequence.add(c);
        sequence.add(defaultGroup);
        org.apache.bval.jsr.groups.Groups chain = new org.apache.bval.jsr.groups.Groups();
        chain.insertSequence(sequence);
        // create test default sequence
        java.util.List<org.apache.bval.jsr.groups.Group> defaultSequence = new java.util.ArrayList<org.apache.bval.jsr.groups.Group>();
        defaultSequence.add(Group.DEFAULT);
        defaultSequence.add(new org.apache.bval.jsr.groups.Group(org.apache.bval.jsr.groups.GroupA.class));
        try {
            chain.assertDefaultGroupSequenceIsExpandable(defaultSequence);
            org.junit.Assert.fail();
        } catch (jakarta.validation.GroupDefinitionException e) {
            // success
        }
        defaultSequence.clear();
        defaultSequence.add(new org.apache.bval.jsr.groups.Group(org.apache.bval.jsr.groups.GroupA.class));
        defaultSequence.add(new org.apache.bval.jsr.groups.Group(jakarta.validation.groups.Default.class));
        try {
            chain.assertDefaultGroupSequenceIsExpandable(defaultSequence);
            org.junit.Assert.fail();
        } catch (jakarta.validation.GroupDefinitionException e) {
            // success
        }
        defaultSequence.clear();
        defaultSequence.add(Group.DEFAULT);
        defaultSequence.add(new org.apache.bval.jsr.groups.Group(org.apache.bval.jsr.groups.GroupC.class));
        try {
            chain.assertDefaultGroupSequenceIsExpandable(defaultSequence);
            org.junit.Assert.fail();
        } catch (jakarta.validation.GroupDefinitionException e) {
            // success
        }
        defaultSequence.clear();
        defaultSequence.add(new org.apache.bval.jsr.groups.Group(org.apache.bval.jsr.groups.GroupC.class));
        defaultSequence.add(Group.DEFAULT);
        chain.assertDefaultGroupSequenceIsExpandable(defaultSequence);
    }

    @org.junit.Test
    public void testAssertDefaulGroupSequenceIsExpandableWithDefaultAtBeginningOfSequence() {
        // create a dummy sequence
        org.apache.bval.jsr.groups.Group a = new org.apache.bval.jsr.groups.Group(org.apache.bval.jsr.groups.GroupA.class);
        org.apache.bval.jsr.groups.Group b = new org.apache.bval.jsr.groups.Group(org.apache.bval.jsr.groups.GroupB.class);
        org.apache.bval.jsr.groups.Group c = new org.apache.bval.jsr.groups.Group(org.apache.bval.jsr.groups.GroupC.class);
        org.apache.bval.jsr.groups.Group defaultGroup = new org.apache.bval.jsr.groups.Group(jakarta.validation.groups.Default.class);
        java.util.List<org.apache.bval.jsr.groups.Group> sequence = new java.util.ArrayList<org.apache.bval.jsr.groups.Group>();
        sequence.add(defaultGroup);
        sequence.add(a);
        sequence.add(b);
        sequence.add(c);
        org.apache.bval.jsr.groups.Groups chain = new org.apache.bval.jsr.groups.Groups();
        chain.insertSequence(sequence);
        // create test default sequence
        java.util.List<org.apache.bval.jsr.groups.Group> defaultSequence = new java.util.ArrayList<org.apache.bval.jsr.groups.Group>();
        defaultSequence.add(Group.DEFAULT);
        defaultSequence.add(new org.apache.bval.jsr.groups.Group(org.apache.bval.jsr.groups.GroupA.class));
        chain.assertDefaultGroupSequenceIsExpandable(defaultSequence);
        defaultSequence.clear();
        defaultSequence.add(new org.apache.bval.jsr.groups.Group(org.apache.bval.jsr.groups.GroupA.class));
        defaultSequence.add(Group.DEFAULT);
        try {
            chain.assertDefaultGroupSequenceIsExpandable(defaultSequence);
            org.junit.Assert.fail();
        } catch (jakarta.validation.GroupDefinitionException e) {
            // success
        }
        defaultSequence.clear();
        defaultSequence.add(Group.DEFAULT);
        defaultSequence.add(new org.apache.bval.jsr.groups.Group(org.apache.bval.jsr.groups.GroupC.class));
        try {
            chain.assertDefaultGroupSequenceIsExpandable(defaultSequence);
            org.junit.Assert.fail();
        } catch (jakarta.validation.GroupDefinitionException e) {
            // success
        }
        defaultSequence.clear();
        defaultSequence.add(new org.apache.bval.jsr.groups.Group(org.apache.bval.jsr.groups.GroupC.class));
        defaultSequence.add(Group.DEFAULT);
        try {
            chain.assertDefaultGroupSequenceIsExpandable(defaultSequence);
            org.junit.Assert.fail();
        } catch (jakarta.validation.GroupDefinitionException e) {
            // success
        }
    }
}
