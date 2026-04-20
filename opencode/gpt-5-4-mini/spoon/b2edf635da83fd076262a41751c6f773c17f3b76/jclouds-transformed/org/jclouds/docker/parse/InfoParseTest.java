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
package org.jclouds.docker.parse;
import java.util.List;
import org.jclouds.docker.domain.Info;
import org.jclouds.docker.internal.BaseDockerParseTest;
import com.google.common.collect.ImmutableList;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import org.testng.annotations.Test;
@Test(groups = "unit")
public class InfoParseTest extends BaseDockerParseTest<Info> {
    @Override
    public String resource() {
        return "/info.json";
    }

    @Override
    @Consumes(MediaType.APPLICATION_JSON)
    public Info expected() {
        return // containers
        // debug
        // driver
        // driverStatus
        // ExecutionDriver
        // IPv4Forwarding
        // Images
        // IndexServerAddress
        // InitPath
        // InitSha1
        // KernelVersion
        // MemoryLimit
        // NEventsListener
        // NFd
        // NGoroutines
        // OperatingSystem
        // SwapLimit
        // DockerRootDir
        // Labels
        // MemTotal
        // NCPU
        // ID
        // name
        Info.create(0, true, "aufs", ImmutableList.<List<String>>of(ImmutableList.of("Root Dir", "/mnt/sda1/var/lib/docker/aufs"), ImmutableList.of("Dirs", "46")), "native-0.2", true, 46, "https://index.docker.io/v1/", "/usr/local/bin/docker", "", "3.16.7-tinycore64", true, 0, 10, 11, "Boot2Docker 1.4.1 (TCL 5.4); master : 86f7ec8 - Tue Dec 16 23:11:29 UTC 2014", true, "/mnt/sda1/var/lib/docker", null, 2105585664, 8, "7V5Y:IQ2M:HWIL:AZJV:HKRD:Q7OZ:3EQA:ZHMO:4LAD:OSIY:YBAA:BSX6", "boot2docker");
    }
}
