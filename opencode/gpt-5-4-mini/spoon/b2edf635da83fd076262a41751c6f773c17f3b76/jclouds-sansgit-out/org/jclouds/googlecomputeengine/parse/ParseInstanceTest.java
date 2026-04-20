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
import org.jclouds.googlecomputeengine.domain.AttachDisk;
import org.jclouds.googlecomputeengine.domain.AttachDisk.DiskInterface;
import org.jclouds.googlecomputeengine.domain.Instance;
import org.jclouds.googlecomputeengine.domain.Instance.AttachedDisk;
import org.jclouds.googlecomputeengine.domain.Instance.NetworkInterface;
import org.jclouds.googlecomputeengine.domain.Instance.ServiceAccount;
import org.jclouds.googlecomputeengine.domain.Metadata;
import org.jclouds.googlecomputeengine.domain.Tags;
import org.jclouds.googlecomputeengine.internal.BaseGoogleComputeEngineParseTest;
import com.google.common.collect.ImmutableList;
import javax.ws.rs.Consumes;
import org.jclouds.googlecomputeengine.domain.Instance.Scheduling.OnHostMaintenance;
import org.testng.annotations.Test;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
@Test(groups = "unit", testName = "ParseInstanceTest")
public class ParseInstanceTest extends BaseGoogleComputeEngineParseTest<Instance> {
    @Override
    public String resource() {
        return "/instance_get.json";
    }

    @Override
    @Consumes(APPLICATION_JSON)
    public Instance expected() {
        return expected(BASE_URL);
    }

    @Consumes(APPLICATION_JSON)
    public Instance expected(String baseUrl) {
        return // 
        // id
        // creationTimestamp
        // selfLink
        // name
        // description
        // tags
        // machineType
        // status
        // statusMessage
        // zone
        // canIpForward
        // networkInterfaces
        // disks
        // metadata
        // serviceAccounts
        // scheduling
        Instance.create("13051190678907570425", parse("2012-11-25T23:48:20.758"), URI.create(baseUrl + "/party/zones/us-central1-a/instances/test-0"), "test-0", "desc", Tags.create("abcd", ImmutableList.of("aTag", "Group-port-42")), URI.create(baseUrl + "/party/zones/us-central1-a/machineTypes/n1-standard-1"), Instance.Status.RUNNING, null, URI.create(baseUrl + "/party/zones/us-central1-a"), true, ImmutableList.of(// 
        // name
        // network
        // networkIP
        // accessConfigs
        NetworkInterface.create("nic0", URI.create(baseUrl + "/party/global/networks/default"), "10.240.121.115", null)), ImmutableList.of(// 
        // index
        // type
        // mode
        // source
        // deviceName
        // autoDelete
        // boot
        // initializeParams
        // licenses
        // interface
        AttachedDisk.create(0, AttachedDisk.Type.PERSISTENT, AttachedDisk.Mode.READ_WRITE, URI.create(baseUrl + "/party/zones/us-central1-a/disks/test"), "test", false, true, // diskName
        // diskSizeGb
        // sourceImage
        // diskType
        AttachDisk.InitializeParams.create("test", Long.parseLong("100", 10), URI.create(baseUrl + "/debian-cloud/global/images/debian-7-wheezy-v20140718"), URI.create(baseUrl + "/party/zones/us-central1-a/diskTypes/pd-standard")), ImmutableList.of(baseUrl + "/suse-cloud/global/licenses/sles-12"), DiskInterface.NVME)), Metadata.create("efgh").put("aKey", "aValue").put("jclouds-delete-boot-disk", "true"), ImmutableList.of(ServiceAccount.create("default", ImmutableList.of("myscope"))), Instance.Scheduling.create(OnHostMaintenance.MIGRATE, false, false));
    }
}
