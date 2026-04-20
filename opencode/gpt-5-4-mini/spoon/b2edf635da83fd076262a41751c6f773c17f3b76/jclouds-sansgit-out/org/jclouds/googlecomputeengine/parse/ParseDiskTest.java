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
import org.jclouds.googlecomputeengine.domain.Disk;
import org.jclouds.googlecomputeengine.domain.Disk.Status;
import org.jclouds.googlecomputeengine.internal.BaseGoogleComputeEngineParseTest;
import javax.ws.rs.Consumes;
import org.testng.annotations.Test;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
@Test(groups = "unit", testName = "ParseDiskTest")
public class ParseDiskTest extends BaseGoogleComputeEngineParseTest<Disk> {
    @Override
    public String resource() {
        return "/disk_get.json";
    }

    @Override
    @Consumes(APPLICATION_JSON)
    public Disk expected() {
        return expected(BASE_URL);
    }

    @Consumes(APPLICATION_JSON)
    public Disk expected(String baseUrl) {
        return // 
        // id
        // creationTimestamp
        // zone
        // status
        // name
        // description
        // sizeGb
        // sourceSnapshot
        // sourceSnapshotId
        // selfLink
        // sourceImage
        // sourceImageId
        // type
        // license
        Disk.create("13050421646334304115", parse("2012-11-25T01:38:48.306"), URI.create(baseUrl + "/party/zones/us-central1-a"), Status.READY, "testimage1", null, 1, null, null, URI.create(baseUrl + "/party/zones/us-central1-a/disks/testimage1"), null, null, URI.create(baseUrl + "/studied-point-720/zones/us-central1-a/diskTypes/pd-standard"), null);
    }
}
