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
import org.jclouds.date.internal.SimpleDateFormatDateService;
import org.jclouds.googlecomputeengine.domain.ForwardingRule;
import org.jclouds.googlecomputeengine.domain.ForwardingRule.IPProtocol;
import org.jclouds.googlecomputeengine.internal.BaseGoogleComputeEngineParseTest;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
public class ParseGlobalForwardingRuleTest extends BaseGoogleComputeEngineParseTest<ForwardingRule> {
    @Override
    public String resource() {
        return "/global_forwarding_rule_get.json";
    }

    @Override
    @Consumes(MediaType.APPLICATION_JSON)
    public ForwardingRule expected() {
        return // id
        // selfLink
        // name
        // description
        // creationTimestamp
        // region
        // IPAddress
        // IPProtocol
        // portRange
        // Target
        ForwardingRule.create("8192211304399313984", URI.create("https://www.googleapis.com/compute/v1/projects/myproject/global/forwardingRules/jclouds-test"), "jclouds-test", "tcp forwarding rule", new SimpleDateFormatDateService().iso8601DateParse("2014-07-18T09:47:30.826-07:00"), null, "107.178.255.156", IPProtocol.TCP, "80-80", URI.create("https://www.googleapis.com/compute/v1/projects/myproject/global/targetHttpProxies/jclouds-test"));
    }
}
