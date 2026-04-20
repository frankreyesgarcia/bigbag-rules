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
import jakarta.validation.constraints.Size;
/**
 * Description: <br/>
 */
public class SizeTestEntity {
    @jakarta.validation.constraints.Size(max = 2)
    public java.util.Map<java.lang.String, java.lang.String> map;

    @jakarta.validation.constraints.Size(max = 2)
    public java.util.Collection<java.lang.String> coll;

    @jakarta.validation.constraints.Size(max = 2)
    public java.lang.String text;

    @jakarta.validation.constraints.Size(max = 2)
    public java.lang.Object[] oa;

    @jakarta.validation.constraints.Size(max = 2)
    public byte[] ba;

    @jakarta.validation.constraints.Size(max = 2)
    public int[] it;

    @jakarta.validation.constraints.Size(max = 2)
    public java.lang.Integer[] oa2;

    @jakarta.validation.constraints.Size(max = 2)
    public boolean[] boa;

    @jakarta.validation.constraints.Size(max = 2)
    public char[] ca;

    @jakarta.validation.constraints.Size(max = 2)
    public double[] da;

    @jakarta.validation.constraints.Size(max = 2)
    public float[] fa;

    @jakarta.validation.constraints.Size(max = 2)
    public long[] la;

    @jakarta.validation.constraints.Size(max = 2)
    public short[] sa;
}
