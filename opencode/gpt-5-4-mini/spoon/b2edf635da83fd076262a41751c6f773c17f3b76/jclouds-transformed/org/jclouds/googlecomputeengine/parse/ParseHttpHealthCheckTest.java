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
import org.jclouds.googlecomputeengine.domain.HttpHealthCheck;
import org.jclouds.googlecomputeengine.internal.BaseGoogleComputeEngineParseTest;
import javax.ws.rs.Consumes;
import org.testng.annotations.Test;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
@Test(groups = "unit", testName = "ParseHttpHealthCheckTest")
public class ParseHttpHealthCheckTest extends BaseGoogleComputeEngineParseTest<HttpHealthCheck> {
    @Override
    public String resource() {
        return "/httphealthcheck_get.json";
    }

    @Override
    @Consumes(APPLICATION_JSON)
    public HttpHealthCheck expected() {
        return expected(BASE_URL);
    }

    @Consumes(APPLICATION_JSON)
    public HttpHealthCheck expected(String baseUrl) {
        return // 
        // id
        // selfLink
        // creationTimestamp
        // name
        // description
        // host
        // requestPath
        // port
        // checkIntervalSec
        // timeoutSec
        // unhealthyThreshold
        // healthyThreshold
        HttpHealthCheck.create("2761502483700014319", URI.create(baseUrl + "/party-gce/global/httpHealthChecks/http-health-check-api-live-test"), parse("2014-01-14T05:55:54.910-08:00"), "http-health-check-api-live-test", "Test Health Check", null, "/", 80, 5, 5, 2, 2);
    }
}
