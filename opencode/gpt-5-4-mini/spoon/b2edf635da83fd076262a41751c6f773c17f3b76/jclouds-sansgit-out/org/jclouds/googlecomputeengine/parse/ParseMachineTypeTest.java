/* Licensed to the Apache Software Foundation (ASF) under one or more
contributor license agreements.  See the NOTICE file distributed with
this work for additional information regarding copyright ownership.
The ASF licenses this file to You under the Apache License, Version 2.0
(the "License"); you may not use this file except in compliance with
the License.  You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package org.jclouds.googlecomputeengine.parse;
import java.net.URI;
import org.jclouds.googlecomputeengine.domain.MachineType;
import org.jclouds.googlecomputeengine.domain.MachineType.ScratchDisk;
import org.jclouds.googlecomputeengine.internal.BaseGoogleComputeEngineParseTest;
import com.google.common.collect.ImmutableList;
import javax.ws.rs.Consumes;
import org.testng.annotations.Test;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
@Test(groups = "unit", testName = "ParseMachineTypeTest")
public class ParseMachineTypeTest extends BaseGoogleComputeEngineParseTest<MachineType> {
    @Override
    public String resource() {
        return "/machinetype.json";
    }

    @Override
    @Consumes(APPLICATION_JSON)
    public MachineType expected() {
        return expected(BASE_URL);
    }

    @Consumes(APPLICATION_JSON)
    public MachineType expected(String baseUrl) {
        return // 
        // id
        // creationTimestamp
        // selfLink
        // name
        // description
        // guestCpus
        // memoryMb
        // imageSpaceGb
        // scratchDisks
        // maximumPersistentDisks
        // maximumPersistentDisksSizeGb
        // zone
        // deprecated
        MachineType.create("12907738072351752276", parse("2012-06-07T20:48:14.670"), URI.create(baseUrl + "/party/zones/us-central1-a/machineTypes/n1-standard-1"), "n1-standard-1", "1 vCPU, 3.75 GB RAM, and a 10 GB ephemeral root disk", 1, 3840, null, ImmutableList.of(ScratchDisk.create(1770), ScratchDisk.create(1770)), 16, 128, "us-central1-a", null);
    }
}
