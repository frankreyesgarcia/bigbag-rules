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
import java.net.URI;
import org.jclouds.googlecloudstorage.domain.DomainResourceReferences.StorageClass;
import org.jclouds.googlecloudstorage.domain.GoogleCloudStorageObject;
import org.jclouds.googlecloudstorage.domain.Owner;
import org.jclouds.googlecloudstorage.internal.BaseGoogleCloudStorageParseTest;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import org.testng.annotations.Test;
@Test(groups = "unit", testName = "ParseGoogleCloudStorageObject")
public class ParseGoogleCloudStorageObject extends BaseGoogleCloudStorageParseTest<GoogleCloudStorageObject> {
    @Override
    public String resource() {
        return "/object_get.json";
    }

    @Override
    @Consumes(MediaType.APPLICATION_JSON)
    public GoogleCloudStorageObject expected() {
        return // id
        // selfLink
        // etag
        // name
        // bucket
        // generation
        // metageneration
        // contentType
        // updated
        // timeDeleted
        // storageClass
        // size,
        // md5Hash
        // mediaLink
        // metadata
        // contentEncoding
        // contentDisposition,
        // contentLanguage
        // cacheControl
        // acl
        // owner,
        // crc32c,
        GoogleCloudStorageObject.create("test/file_name/1000", URI.create("https://www.googleapis.com/storage/v1/b/test/o/file_name"), "etag", "file_name", "test", ((long) (1000)), ((long) (8)), "application/x-tar", parse("2014-09-27T00:01:44.819"), null, StorageClass.STANDARD, ((long) (1000)), "md5Hash", URI.create("https://www.googleapis.com/download/storage/v1/b/test/o/file_name?generation=1000&alt=media"), null, null, null, null, null, null, Owner.create("entity", "entityId"), "crc32c", null);// componentCount

    }
}
