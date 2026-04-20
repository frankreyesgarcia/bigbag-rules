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
package org.jclouds.googlecloudstorage.parse;
import java.util.Arrays;
import org.jclouds.date.internal.SimpleDateFormatDateService;
import org.jclouds.googlecloud.domain.ForwardingListPage;
import org.jclouds.googlecloud.domain.ListPage;
import org.jclouds.googlecloudstorage.domain.Bucket;
import org.jclouds.googlecloudstorage.domain.DomainResourceReferences.Location;
import org.jclouds.googlecloudstorage.domain.DomainResourceReferences.StorageClass;
import org.jclouds.googlecloudstorage.domain.Owner;
import org.jclouds.googlecloudstorage.internal.BaseGoogleCloudStorageParseTest;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
public class NoAclBucketListTest extends BaseGoogleCloudStorageParseTest<ListPage<Bucket>> {
    private Bucket item1 = // id
    // name
    // projectNumber
    // timeCreated
    // metageneration
    // acl
    // defaultObjectAcl
    // owner
    // location
    // website
    // logging
    // versioning
    // cors
    // lifeCycle
    // storageClass
    Bucket.create("bhashbucket", "bhashbucket", 1082289308625L, new SimpleDateFormatDateService().iso8601DateParse("2014-06-02T19:19:41.112z"), 99L, null, null, Owner.create("project-owners-1082289308625", null), Location.US, null, null, null, null, null, StorageClass.STANDARD);

    @Override
    public String resource() {
        return "/no_acl_bucket_list.json";
    }

    @Override
    @Consumes(MediaType.APPLICATION_JSON)
    public ListPage<Bucket> expected() {
        return ForwardingListPage.create(Arrays.asList(item1), "bhashbucket");
    }
}
