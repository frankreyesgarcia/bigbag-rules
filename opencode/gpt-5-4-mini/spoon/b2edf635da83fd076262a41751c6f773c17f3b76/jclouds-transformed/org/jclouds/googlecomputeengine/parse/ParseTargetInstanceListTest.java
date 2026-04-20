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
import org.jclouds.googlecomputeengine.domain.TargetInstance;
import org.jclouds.googlecomputeengine.internal.BaseGoogleComputeEngineParseTest;
import com.google.common.collect.ImmutableList;
import javax.ws.rs.Consumes;
import org.testng.annotations.Test;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
@Test(groups = "unit", testName = "ParseTargetInstanceListTest")
public class ParseTargetInstanceListTest extends BaseGoogleComputeEngineParseTest<ListPage<TargetInstance>> {
    @Override
    public String resource() {
        return "/target_instance_list.json";
    }

    @Override
    @Consumes(APPLICATION_JSON)
    public ListPage<TargetInstance> expected() {
        return expected(BASE_URL);
    }

    public ListPage<TargetInstance> expected(String baseURL) {
        return // 
        // items
        // nextPageToken
        ForwardingListPage.create(ImmutableList.of(new ParseTargetInstanceTest().expected(baseURL), // id
        // creationTimestamp
        // name
        // description
        // zone
        // natPolicy
        // instance
        // selfLink
        TargetInstance.create("7362436693678237415", "2014-11-20T17:35:17.268-08:00", "target-instance-2", null, URI.create(baseURL + "/party/zones/us-central1-a"), "NO_NAT", URI.create(baseURL + "/party/zones/us-central1-a/instances/test-3"), URI.create(baseURL + "/party/zones/us-central1-a/targetInstances/target-instance-2"))), null);
    }
}
