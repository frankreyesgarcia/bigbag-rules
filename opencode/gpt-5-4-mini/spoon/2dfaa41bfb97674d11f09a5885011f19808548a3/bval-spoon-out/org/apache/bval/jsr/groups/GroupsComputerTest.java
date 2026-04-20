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
import jakarta.validation.GroupDefinitionException;
import jakarta.validation.ValidationException;
import jakarta.validation.groups.Default;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * GroupListComputer Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>04/09/2009</pre>
 */
public class GroupsComputerTest {
    org.apache.bval.jsr.groups.GroupsComputer groupsComputer;

    @org.junit.Before
    public void setUp() throws java.lang.Exception {
        groupsComputer = new org.apache.bval.jsr.groups.GroupsComputer();
    }

    @org.junit.Test(expected = jakarta.validation.ValidationException.class)
    public void testComputeGroupsNotAnInterface() {
        groupsComputer.computeGroups(java.util.Collections.singleton(java.lang.String.class));
    }

    @org.junit.Test(expected = java.lang.IllegalArgumentException.class)
    public void testGroupChainForNull() {
        groupsComputer.computeGroups(((java.lang.Class<?>[]) (null)));
    }

    @org.junit.Test
    public void testGroupChainForEmptySet() {
        org.junit.Assert.assertEquals(java.util.Collections.singleton(Group.DEFAULT), groupsComputer.computeGroups(new java.util.HashSet<java.lang.Class<?>>()).getGroups());
    }

    @org.junit.Test(expected = jakarta.validation.GroupDefinitionException.class)
    public void testCyclicGroupSequences() {
        groupsComputer.computeGroups(java.util.Collections.singleton(org.apache.bval.jsr.groups.CyclicGroupSequence1.class));
    }

    @org.junit.Test(expected = jakarta.validation.GroupDefinitionException.class)
    public void testCyclicGroupSequence() {
        groupsComputer.computeGroups(java.util.Collections.singleton(org.apache.bval.jsr.groups.CyclicGroupSequence.class));
    }

    @org.junit.Test
    public void testGroupDuplicates() {
        java.util.Set<java.lang.Class<?>> groups = new java.util.HashSet<java.lang.Class<?>>();
        groups.add(org.apache.bval.jsr.example.First.class);
        groups.add(org.apache.bval.jsr.example.Second.class);
        groups.add(org.apache.bval.jsr.example.Last.class);
        org.apache.bval.jsr.groups.Groups chain = groupsComputer.computeGroups(groups);
        org.junit.Assert.assertEquals(3, chain.getGroups().size());
        groups.clear();
        groups.add(org.apache.bval.jsr.example.First.class);
        groups.add(org.apache.bval.jsr.example.First.class);
        chain = groupsComputer.computeGroups(groups);
        org.junit.Assert.assertEquals(1, chain.getGroups().size());
        groups.clear();
        groups.add(org.apache.bval.jsr.example.First.class);
        groups.add(org.apache.bval.jsr.example.Last.class);
        groups.add(org.apache.bval.jsr.example.First.class);
        chain = groupsComputer.computeGroups(groups);
        org.junit.Assert.assertEquals(2, chain.getGroups().size());
    }

    @org.junit.Test
    public void testSequenceResolution() {
        java.util.Set<java.lang.Class<?>> groups = new java.util.HashSet<java.lang.Class<?>>();
        groups.add(org.apache.bval.jsr.example.Address.Complete.class);
        org.apache.bval.jsr.groups.Groups chain = groupsComputer.computeGroups(groups);
        java.util.Iterator<org.apache.bval.jsr.groups.Group.Sequence> sequences = chain.getSequences().iterator();
        java.util.Iterator<org.apache.bval.jsr.groups.Group> sequence = sequences.next().getGroups().iterator();
        org.junit.Assert.assertEquals(jakarta.validation.groups.Default.class, sequence.next().getGroup());
        org.junit.Assert.assertEquals(org.apache.bval.jsr.example.Address.HighLevelCoherence.class, sequence.next().getGroup());
    }
}
