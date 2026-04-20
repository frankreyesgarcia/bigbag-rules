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
import org.jclouds.googlecloud.domain.ForwardingListPage;
import org.jclouds.googlecloud.domain.ListPage;
import org.jclouds.googlecomputeengine.domain.Zone;
import org.jclouds.googlecomputeengine.internal.BaseGoogleComputeEngineParseTest;
import com.google.common.collect.ImmutableList;
import javax.ws.rs.Consumes;
import org.testng.annotations.Test;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
@Test(groups = "unit", testName = "ParseZoneListTest")
public class ParseZoneListTest extends BaseGoogleComputeEngineParseTest<ListPage<Zone>> {
    @Override
    public String resource() {
        return "/zone_list.json";
    }

    @Override
    @Consumes(APPLICATION_JSON)
    public ListPage<Zone> expected() {
        return expected(BASE_URL);
    }

    @Consumes(APPLICATION_JSON)
    public ListPage<Zone> expected(String baseUrl) {
        Zone zone1 = new ParseZoneTest().expected(baseUrl);
        Zone zone2 = // 
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
        Zone.create("13024414164050619686", parse("2012-10-24T20:13:19.271"), URI.create(baseUrl + "/party/zones/us-central1-b"), "us-central1-b", "us-central1-b", Zone.Status.UP, // maintenanceWindows
        ImmutableList.of(// 
        // name
        // description
        // beginTime
        // endTime)
        Zone.MaintenanceWindow.create("2013-02-17-planned-outage", "maintenance zone", parse("2013-02-17T08:00:00.000"), parse("2013-03-03T08:00:00.000"))), null, "us-central1", null);
        return // 
        // items
        // nextPageToken
        ForwardingListPage.create(ImmutableList.of(zone1, zone2), null);
    }
}
