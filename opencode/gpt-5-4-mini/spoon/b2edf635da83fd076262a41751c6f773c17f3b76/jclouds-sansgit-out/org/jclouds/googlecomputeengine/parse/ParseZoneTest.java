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
import org.jclouds.googlecomputeengine.domain.Zone;
import org.jclouds.googlecomputeengine.internal.BaseGoogleComputeEngineParseTest;
import com.google.common.collect.ImmutableList;
import javax.ws.rs.Consumes;
import org.testng.annotations.Test;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
@Test(groups = "unit", testName = "ParseZoneTest")
public class ParseZoneTest extends BaseGoogleComputeEngineParseTest<Zone> {
    @Override
    public String resource() {
        return "/zone_get.json";
    }

    @Override
    @Consumes(APPLICATION_JSON)
    public Zone expected() {
        return expected(BASE_URL);
    }

    @Consumes(APPLICATION_JSON)
    public Zone expected(String baseUrl) {
        return // 
        // id
        // creationTimestamp
        // selfLink
        // name
        // description
        // status
        // 
        // deprecated
        // region
        // availableMachineTypes
        Zone.create("13020128040171887099", parse("2012-10-19T16:42:54.131"), URI.create(baseUrl + "/party/zones/us-central1-a"), "us-central1-a", "us-central1-a", Zone.Status.DOWN, // maintenanceWindows
        ImmutableList.of(// 
        // name
        // description
        // beginTime
        // endTime)
        Zone.MaintenanceWindow.create("2012-11-10-planned-outage", "maintenance zone", parse("2012-11-10T20:00:00.000"), parse("2012-12-02T20:00:00.000"))), null, "us-central1", null);
    }
}
