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
import org.jclouds.googlecomputeengine.domain.UrlMapValidateResult;
import org.jclouds.googlecomputeengine.internal.BaseGoogleComputeEngineParseTest;
import com.google.common.collect.ImmutableList;
import javax.ws.rs.Consumes;
import org.jclouds.googlecomputeengine.domain.UrlMapValidateResult.UrlMapValidateResultInternal.TestFailure;
import org.testng.annotations.Test;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
@Test(groups = "unit")
public class ParseUrlMapValidateTest extends BaseGoogleComputeEngineParseTest<UrlMapValidateResult> {
    @Override
    public String resource() {
        return "/url_map_validate.json";
    }

    @Override
    @Consumes(APPLICATION_JSON)
    public UrlMapValidateResult expected() {
        return expected(BASE_URL);
    }

    @Consumes(APPLICATION_JSON)
    public UrlMapValidateResult expected(String baseUrl) {
        return // loadSucceded
        // loadError
        // testPassed
        UrlMapValidateResult.create(false, ImmutableList.of("jclouds-test"), false, ImmutableList.of(// host
        // path
        // expectedService
        // actualService
        TestFailure.create("jclouds-test", "/test/path", URI.create(baseUrl + "/myproject/global/backendServices/jclouds-test"), URI.create(baseUrl + "/myproject/global/backendServices/jclouds-test-2"))));// testFailures)

    }
}
