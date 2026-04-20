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
import org.jclouds.googlecomputeengine.domain.KeyValuePair;
import org.jclouds.googlecomputeengine.domain.Route;
import org.jclouds.googlecomputeengine.domain.Warning;
import org.jclouds.googlecomputeengine.internal.BaseGoogleComputeEngineParseTest;
import com.google.common.collect.ImmutableList;
import javax.ws.rs.Consumes;
import org.testng.annotations.Test;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
@Test(groups = "unit", testName = "ParseRouteTest")
public class ParseRouteTest extends BaseGoogleComputeEngineParseTest<Route> {
    @Override
    public String resource() {
        return "/route_get.json";
    }

    @Override
    @Consumes(APPLICATION_JSON)
    public Route expected() {
        return expected(BASE_URL);
    }

    @Consumes(APPLICATION_JSON)
    public Route expected(String baseUrl) {
        return // 
        // id
        // creationTimestamp
        // selfLink
        // name
        // description
        // network
        // tags
        // destRange
        // priority
        // nextHopInstance
        // nextHopIp
        // nextHopNetwork
        // nextHopGateway
        // warnings
        // nextHopVpnTunnel
        Route.create("7241926205630356071", parse("2013-07-08T14:40:38.502-07:00"), URI.create(baseUrl + "/party/global/routes/default-route-c99ebfbed0e1f375"), "default-route-c99ebfbed0e1f375", "Default route to the virtual network.", URI.create(baseUrl + "/party/global/networks/default"), ImmutableList.of("fooTag", "barTag"), "10.240.0.0/16", 1000, null, null, URI.create(baseUrl + "/party/global/networks/default"), null, ImmutableList.of(Warning.create("NO_RESULTS_ON_PAGE", "This is an example warning", ImmutableList.of(KeyValuePair.create("scope", "There are no results for scope 'zones/asia-east1-b' on this page.")))), null);
    }
}
