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
import java.util.List;
import org.jclouds.date.internal.SimpleDateFormatDateService;
import org.jclouds.googlecomputeengine.domain.UrlMap;
import org.jclouds.googlecomputeengine.domain.UrlMap.HostRule;
import org.jclouds.googlecomputeengine.domain.UrlMap.PathMatcher;
import org.jclouds.googlecomputeengine.domain.UrlMap.UrlMapTest;
import org.jclouds.googlecomputeengine.internal.BaseGoogleComputeEngineParseTest;
import com.google.common.collect.ImmutableList;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import org.jclouds.googlecomputeengine.domain.UrlMap.PathMatcher.PathRule;
import org.testng.annotations.Test;
@Test(groups = "unit")
public class ParseUrlMapTest extends BaseGoogleComputeEngineParseTest<UrlMap> {
    @Override
    public String resource() {
        return "/url_map_get.json";
    }

    @Override
    @Consumes(MediaType.APPLICATION_JSON)
    public UrlMap expected() {
        return expected(BASE_URL);
    }

    @Consumes(MediaType.APPLICATION_JSON)
    public UrlMap expected(String baseUrl) {
        URI service = URI.create(baseUrl + "/myproject/global/backendServices/jclouds-test");
        List<HostRule> hostRules = ImmutableList.of(// description
        // hosts
        HostRule.create(null, ImmutableList.of("jclouds-test"), "path"));// pathMatcher

        List<PathMatcher> pathMatchers = ImmutableList.of(// name
        // description
        // defaultService
        PathMatcher.create("path", null, service, ImmutableList.of(// paths
        // service
        PathRule.create(ImmutableList.of("/"), service))));// pathRules

        List<UrlMapTest> urlMapTests = ImmutableList.of(// description
        // host
        // path
        UrlMapTest.create(null, "jclouds-test", "/test/path", service));// service

        return // id
        // creationTimestamp
        // selfLink
        // name
        // description
        // hostRules
        // pathMatchers
        // urlMapTests
        // defaultService
        UrlMap.create("13741966667737398119", new SimpleDateFormatDateService().iso8601DateParse("2014-07-23T12:39:50.022-07:00"), URI.create(baseUrl + "/myproject/global/urlMaps/jclouds-test"), "jclouds-test", "Sample url map", hostRules, pathMatchers, urlMapTests, service, "EDmhvJucpz4=");// fingerprint

    }
}
