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
package org.jclouds.docker.compute.functions;
import java.util.Date;
import org.jclouds.compute.domain.Image;
import org.jclouds.docker.domain.Config;
import com.google.common.collect.ImmutableList;
import org.easymock.EasyMock;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.testng.Assert.assertEquals;
/**
 * Unit tests for the {@link org.jclouds.docker.compute.functions.ImageToImage} class.
 */
@Test(groups = "unit", testName = "ImageToImageTest")
public class ImageToImageTest {
    private static final org.jclouds.docker.domain.Image IMAGE_EMPTY_REPOTAGS = // id
    // parent
    // created
    // container
    // dockerVersion
    // architecture
    // os
    // size
    // virtualSize
    // repoTags
    org.jclouds.docker.domain.Image.create("id", "author", "comment", Config.builder().image("imageId").build(), Config.builder().image("imageId").build(), "parent", new Date(), "containerId", "1.3.1", "x86_64", "os", 0L, 0L, ImmutableList.<String>of());

    private static final org.jclouds.docker.domain.Image IMAGE_REPOTAG_WITH_PORT = // id
    // parent
    // created
    // container
    // dockerVersion
    // architecture
    // os
    // size
    // virtualSize
    // repoTags
    org.jclouds.docker.domain.Image.create("id", "author", "comment", Config.builder().image("imageId").build(), Config.builder().image("imageId").build(), "parent", new Date(), "containerId", "1.3.1", "x86_64", "os", 0L, 0L, ImmutableList.of("registry.company.example:8888/a/b/c/d:latest"));

    private ImageToImage function;

    private org.jclouds.docker.domain.Image image;

    @BeforeMethod
    public void setup() {
        image = // id
        // parent
        // created
        // container
        // dockerVersion
        // architecture
        // os
        // size
        // virtualSize
        // repoTags
        org.jclouds.docker.domain.Image.create("id", "author", "comment", Config.builder().image("imageId").build(), Config.builder().image("imageId").build(), "parent", new Date(), "containerId", "1.3.1", "x86_64", "os", 0L, 0L, ImmutableList.of("repoTag1:version"));
        function = new ImageToImage();
    }

    public void testImageToImage() {
        org.jclouds.docker.domain.Image mockImage = mockImage();
        Image image = function.apply(mockImage);
        verify(mockImage);
        assertEquals(mockImage.id(), image.getId().toString());
    }

    public void testEmptyRepoTags() {
        Image image = function.apply(IMAGE_EMPTY_REPOTAGS);
        assertEquals(image.getId(), "id");
        assertEquals(image.getDescription(), "<none>");
        assertEquals(image.getOperatingSystem().getVersion(), "<none>");
        assertEquals(image.getName(), "<none>");
    }

    public void testRepoTagWithHostPort() {
        Image image = function.apply(IMAGE_REPOTAG_WITH_PORT);
        assertEquals(image.getDescription(), "registry.company.example:8888/a/b/c/d:latest");
        assertEquals(image.getOperatingSystem().getVersion(), "latest");
        assertEquals(image.getName(), "registry.company.example:8888/a/b/c/d");
    }

    private org.jclouds.docker.domain.Image mockImage() {
        org.jclouds.docker.domain.Image mockImage = EasyMock.createMock(org.jclouds.docker.domain.Image.class);
        expect(mockImage.id()).andReturn(image.id()).anyTimes();
        expect(mockImage.repoTags()).andReturn(image.repoTags()).anyTimes();
        expect(mockImage.architecture()).andReturn(image.architecture()).anyTimes();
        replay(mockImage);
        return mockImage;
    }
}
