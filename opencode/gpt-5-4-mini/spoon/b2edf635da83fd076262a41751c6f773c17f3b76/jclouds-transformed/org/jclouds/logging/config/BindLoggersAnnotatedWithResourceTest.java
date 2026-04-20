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
package org.jclouds.logging.config;
import java.lang.reflect.Field;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import org.jclouds.logging.Logger;
import org.jclouds.logging.jdk.JDKLogger;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import javax.annotation.Resource;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static com.google.inject.matcher.Matchers.any;
import static org.easymock.EasyMock.createMock;
import static org.testng.Assert.assertEquals;
@Test
public class BindLoggersAnnotatedWithResourceTest {
    private BindLoggersAnnotatedWithResource blawr;

    public static class A {
        @Resource
        private Logger logger = Logger.NULL;
    }

    private static class B {
        @Resource
        private Logger logger = Logger.NULL;

        @Resource
        @Named("blogger")
        private Logger blogger = Logger.NULL;
    }

    @BeforeMethod
    void createBlawr() {
        blawr = new BindLoggersAnnotatedWithResource(new JDKLogger.JDKLoggerFactory());
    }

    @Test
    void testHear() {
        Injector i = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                bindListener(any(), blawr);
            }
        });
        assertEquals(i.getInstance(BindLoggersAnnotatedWithResourceTest.A.class).logger.getCategory(), getClass().getName() + "$A");
        assertEquals(i.getInstance(BindLoggersAnnotatedWithResourceTest.B.class).logger.getCategory(), getClass().getName() + "$B");
        assertEquals(i.getInstance(BindLoggersAnnotatedWithResourceTest.B.class).blogger.getCategory(), "blogger");
    }

    @Test
    public void testAssignLoggerToField() throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Logger logger = createMock(Logger.class);
        A a = new A();
        Field field = BindLoggersAnnotatedWithResourceTest.A.class.getDeclaredField("logger");
        AssignLoggerToField<A> assigner = new AssignLoggerToField<A>(logger, field);
        assigner.afterInjection(a);
        assert field.get(a).equals(logger);
    }

    @Test
    public void testLoggerFieldsAnnotatedWithResource() throws SecurityException, NoSuchFieldException {
        LoggerFieldsAnnotatedWithResource predicate = new LoggerFieldsAnnotatedWithResource();
        assert predicate.apply(BindLoggersAnnotatedWithResourceTest.A.class.getDeclaredField("logger"));
    }

    public static class C {
        @Inject
        private Logger logger = Logger.NULL;
    }

    @Test
    public void testLoggerFieldsAnnotatedWithInjectReturnsNull() throws SecurityException, NoSuchFieldException {
        LoggerFieldsAnnotatedWithResource predicate = new LoggerFieldsAnnotatedWithResource();
        assert !predicate.apply(BindLoggersAnnotatedWithResourceTest.C.class.getDeclaredField("logger"));
    }

    public static class D {
        @Resource
        private Logger logger = Logger.NULL;

        @Resource
        private Logger blogger;
    }

    @Test
    public void testGetLoggerFieldsAnnotatedWithResourceNoLogger() {
        Set<Field> fields = blawr.getLoggerFieldsAnnotatedWithResource(this.getClass());
        assertEquals(fields.size(), 0);
    }

    @Test
    public void testGetLoggerFieldsAnnotatedWithResourceOneLogger() {
        Set<Field> fields = blawr.getLoggerFieldsAnnotatedWithResource(BindLoggersAnnotatedWithResourceTest.A.class);
        assertEquals(fields.size(), 1);
    }

    @Test
    public void testGetLoggerFieldsAnnotatedWithResourceTwoLoggers() {
        Set<Field> fields = blawr.getLoggerFieldsAnnotatedWithResource(BindLoggersAnnotatedWithResourceTest.D.class);
        assertEquals(fields.size(), 2);
    }
}
