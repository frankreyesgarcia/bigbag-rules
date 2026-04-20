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
import org.jclouds.googlecomputeengine.domain.Address;
import org.jclouds.googlecomputeengine.domain.Address.Status;
import org.jclouds.googlecomputeengine.internal.BaseGoogleComputeEngineParseTest;
import com.google.common.collect.ImmutableList;
import javax.ws.rs.Consumes;
import org.testng.annotations.Test;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
@Test(groups = "unit", testName = "ParseAddressTest")
public class ParseAddressTest extends BaseGoogleComputeEngineParseTest<Address> {
    @Override
    public String resource() {
        return "/address_get.json";
    }

    @Override
    @Consumes(APPLICATION_JSON)
    public Address expected() {
        return expected(BASE_URL);
    }

    @Consumes(APPLICATION_JSON)
    public Address expected(String baseUrl) {
        return // d
        // id
        // selfLink
        // name
        // creationTimestamp
        // description
        // status
        // users
        // region
        // address
        Address.create("4439373783165447583", URI.create(baseUrl + "/party/regions/us-central1/addresses/test-ip1"), "test-ip1", parse("2013-07-26T13:57:20.204-07:00"), "", Status.IN_USE, ImmutableList.of(URI.create(baseUrl + "/party/regions/us-central1-a/forwardingRules/test-forwarding-rule")), URI.create(baseUrl + "/party/regions/us-central1"), "173.255.115.190");
    }
}
