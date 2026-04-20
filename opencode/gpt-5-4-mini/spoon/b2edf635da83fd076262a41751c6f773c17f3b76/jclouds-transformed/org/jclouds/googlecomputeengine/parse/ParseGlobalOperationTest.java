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
import org.jclouds.googlecomputeengine.domain.Operation;
import org.jclouds.googlecomputeengine.internal.BaseGoogleComputeEngineParseTest;
import javax.ws.rs.Consumes;
import org.testng.annotations.Test;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
@Test(groups = "unit", testName = "ParseGlobalOperationTest")
public class ParseGlobalOperationTest extends BaseGoogleComputeEngineParseTest<Operation> {
    @Override
    public String resource() {
        return "/global_operation.json";
    }

    @Override
    @Consumes(APPLICATION_JSON)
    public Operation expected() {
        return expected(BASE_URL);
    }

    @Consumes(APPLICATION_JSON)
    public Operation expected(String baseUrl) {
        return // 
        // id
        // creationTimestamp
        // name
        // description
        // targetLink
        // targetId
        // clientOperationId
        // status
        // statusMessage
        // user
        // progress
        // insertTime
        // startTime
        // endTime
        // httpErrorStatusCode
        // httpErrorMessage
        // operationType
        // errors
        // warnings
        // region
        // zone
        Operation.create("13053095055850848306", parse("2013-07-26T13:57:20.204-07:00"), URI.create(baseUrl + "/party/global/operations/operation-1354084865060"), "operation-1354084865060", null, URI.create(baseUrl + "/party/global/firewalls/jclouds-test-delete"), "13053094017547040099", null, Operation.Status.DONE, null, "user@developer.gserviceaccount.com", 100, parse("2012-11-28T06:41:05.060"), parse("2012-11-28T06:41:05.142"), parse("2012-11-28T06:41:06.142"), null, null, "insert", null, null, null, null);
    }
}
