# API Specification: io.dropwizard:dropwizard-core 4.0.0

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public abstract class `io.dropwizard.core.Application`<T extends io.dropwizard.core.Configuration>

**Constructors:**
- `protected Application()`

**Methods:**
- `protected void addDefaultCommands(io.dropwizard.core.setup.Bootstrap p0)`
- `protected ch.qos.logback.classic.Level bootstrapLogLevel()`
- `protected void bootstrapLogging()`
- `public java.lang.Class getConfigurationClass()`
- `public java.lang.String getName()`
- `public void initialize(io.dropwizard.core.setup.Bootstrap p0)`
- `protected void onFatalError(java.lang.Throwable p0)`
- `public abstract void run(T p0, io.dropwizard.core.setup.Environment p1) throws java.lang.Exception`
- `public void run(java.lang.String... p0) throws java.lang.Exception`

---

## public class `io.dropwizard.core.Configuration`

**Constructors:**
- `public Configuration()`

**Methods:**
- `public io.dropwizard.core.setup.AdminFactory getAdminFactory()`
- `public java.util.Optional getHealthFactory()`
- `public synchronized io.dropwizard.logging.common.LoggingFactory getLoggingFactory()`
- `public io.dropwizard.metrics.common.MetricsFactory getMetricsFactory()`
- `public io.dropwizard.core.server.ServerFactory getServerFactory()`
- `public void setAdminFactory(io.dropwizard.core.setup.AdminFactory p0)`
- `public void setHealthFactory(io.dropwizard.health.HealthFactory p0)`
- `public synchronized void setLoggingFactory(io.dropwizard.logging.common.LoggingFactory p0)`
- `public void setMetricsFactory(io.dropwizard.metrics.common.MetricsFactory p0)`
- `public void setServerFactory(io.dropwizard.core.server.ServerFactory p0)`
- `public java.lang.String toString()`

---

## public abstract interface `io.dropwizard.core.ConfiguredBundle`<T extends java.lang.Object>

**Methods:**
- `public default void initialize(io.dropwizard.core.setup.Bootstrap p0)`
- `public default void run(T p0, io.dropwizard.core.setup.Environment p1) throws java.lang.Exception`

---

## public class `io.dropwizard.core.cli.CheckCommand`<T extends io.dropwizard.core.Configuration>
extends `io.dropwizard.core.cli.ConfiguredCommand`  

**Constructors:**
- `public CheckCommand(io.dropwizard.core.Application p0)`

**Methods:**
- `protected java.lang.Class getConfigurationClass()`
- `public void onError(io.dropwizard.core.cli.Cli p0, net.sourceforge.argparse4j.inf.Namespace p1, java.lang.Throwable p2)`
- `protected void run(io.dropwizard.core.setup.Bootstrap p0, net.sourceforge.argparse4j.inf.Namespace p1, T p2) throws java.lang.Exception`

---

## public class `io.dropwizard.core.cli.Cli`

**Constructors:**
- `public Cli(io.dropwizard.util.JarLocation p0, io.dropwizard.core.setup.Bootstrap p1, java.io.OutputStream p2, java.io.OutputStream p3)`

**Methods:**
- `public java.io.PrintWriter getStdErr()`
- `public java.io.PrintWriter getStdOut()`
- `public java.util.Optional run(java.lang.String... p0)`

---

## public abstract class `io.dropwizard.core.cli.Command`

**Constructors:**
- `protected Command(java.lang.String p0, java.lang.String p1)`

**Methods:**
- `public abstract void configure(net.sourceforge.argparse4j.inf.Subparser p0)`
- `public final java.lang.String getDescription()`
- `public final java.lang.String getName()`
- `public void onError(io.dropwizard.core.cli.Cli p0, net.sourceforge.argparse4j.inf.Namespace p1, java.lang.Throwable p2)`
- `public abstract void run(io.dropwizard.core.setup.Bootstrap p0, net.sourceforge.argparse4j.inf.Namespace p1) throws java.lang.Exception`

---

## public abstract class `io.dropwizard.core.cli.ConfiguredCommand`<T extends io.dropwizard.core.Configuration>
extends `io.dropwizard.core.cli.Command`  

**Constructors:**
- `protected ConfiguredCommand(java.lang.String p0, java.lang.String p1)`

**Methods:**
- `protected net.sourceforge.argparse4j.inf.Argument addFileArgument(net.sourceforge.argparse4j.inf.Subparser p0)`
- `protected void cleanup()`
- `protected void cleanupAsynchronously()`
- `public void configure(net.sourceforge.argparse4j.inf.Subparser p0)`
- `public T getConfiguration()`
- `protected java.lang.Class getConfigurationClass()`
- `public void run(io.dropwizard.core.setup.Bootstrap p0, net.sourceforge.argparse4j.inf.Namespace p1) throws java.lang.Exception`
- `protected abstract void run(io.dropwizard.core.setup.Bootstrap p0, net.sourceforge.argparse4j.inf.Namespace p1, T p2) throws java.lang.Exception`

---

## public abstract class `io.dropwizard.core.cli.EnvironmentCommand`<T extends io.dropwizard.core.Configuration>
extends `io.dropwizard.core.cli.ConfiguredCommand`  

**Constructors:**
- `protected EnvironmentCommand(io.dropwizard.core.Application p0, java.lang.String p1, java.lang.String p2)`

**Methods:**
- `public io.dropwizard.core.setup.Environment getEnvironment()`
- `protected void run(io.dropwizard.core.setup.Bootstrap p0, net.sourceforge.argparse4j.inf.Namespace p1, T p2) throws java.lang.Exception`
- `protected abstract void run(io.dropwizard.core.setup.Environment p0, net.sourceforge.argparse4j.inf.Namespace p1, T p2) throws java.lang.Exception`

---

## public class `io.dropwizard.core.cli.ServerCommand`<T extends io.dropwizard.core.Configuration>
extends `io.dropwizard.core.cli.EnvironmentCommand`  

**Constructors:**
- `public ServerCommand(io.dropwizard.core.Application p0)`
- `protected ServerCommand(io.dropwizard.core.Application p0, java.lang.String p1, java.lang.String p2)`

**Methods:**
- `protected java.lang.Class getConfigurationClass()`
- `protected void run(io.dropwizard.core.setup.Environment p0, net.sourceforge.argparse4j.inf.Namespace p1, T p2) throws java.lang.Exception`

---

## public abstract class `io.dropwizard.core.server.AbstractServerFactory`
implements `io.dropwizard.core.server.ServerFactory`  

**Constructors:**
- `public AbstractServerFactory()`

**Methods:**
- `protected org.eclipse.jetty.server.Handler addRequestLog(org.eclipse.jetty.server.Server p0, org.eclipse.jetty.server.Handler p1, java.lang.String p2)`
- `protected org.eclipse.jetty.server.Handler addStatsHandler(org.eclipse.jetty.server.Handler p0)`
- `protected org.eclipse.jetty.server.Handler buildGzipHandler(org.eclipse.jetty.server.Handler p0)`
- `protected org.eclipse.jetty.server.Server buildServer(io.dropwizard.lifecycle.setup.LifecycleEnvironment p0, org.eclipse.jetty.util.thread.ThreadPool p1)`
- `protected org.eclipse.jetty.setuid.SetUIDListener buildSetUIDListener()`
- `protected org.eclipse.jetty.server.Handler createAdminServlet(org.eclipse.jetty.server.Server p0, io.dropwizard.jetty.MutableServletContextHandler p1, com.codahale.metrics.MetricRegistry p2, com.codahale.metrics.health.HealthCheckRegistry p3, io.dropwizard.core.setup.AdminEnvironment p4)`
- `protected org.eclipse.jetty.server.Handler createAppServlet(org.eclipse.jetty.server.Server p0, io.dropwizard.jersey.setup.JerseyEnvironment p1, com.fasterxml.jackson.databind.ObjectMapper p2, jakarta.validation.Validator p3, io.dropwizard.jetty.MutableServletContextHandler p4, jakarta.servlet.Servlet p5, com.codahale.metrics.MetricRegistry p6)`
- `protected org.eclipse.jetty.util.thread.ThreadPool createThreadPool(com.codahale.metrics.MetricRegistry p0)`
- `public java.util.Set getAllowedMethods()`
- `public java.lang.Boolean getDetailedJsonProcessingExceptionMapper()`
- `public boolean getDumpAfterStart()`
- `public boolean getDumpBeforeStop()`
- `public boolean getEnableThreadNameFilter()`
- `public java.lang.Integer getGid()`
- `public java.lang.String getGroup()`
- `public io.dropwizard.jetty.GzipHandlerFactory getGzipFilterFactory()`
- `public io.dropwizard.util.Duration getIdleThreadTimeout()`
- `public java.util.Optional getJerseyRootPath()`
- `public int getMaxQueuedRequests()`
- `public int getMaxThreads()`
- `public java.lang.String getMetricPrefix()`
- `public int getMinThreads()`
- `public java.lang.Integer getNofileHardLimit()`
- `public java.lang.Integer getNofileSoftLimit()`
- `public java.lang.Boolean getRegisterDefaultExceptionMappers()`
- `public synchronized io.dropwizard.request.logging.RequestLogFactory getRequestLogFactory()`
- `public com.codahale.metrics.annotation.ResponseMeteredLevel getResponseMeteredLevel()`
- `public io.dropwizard.jetty.ServerPushFilterFactory getServerPush()`
- `public io.dropwizard.util.Duration getShutdownGracePeriod()`
- `public java.lang.Boolean getStartsAsRoot()`
- `public java.lang.Integer getUid()`
- `public java.lang.String getUmask()`
- `public java.lang.String getUser()`
- `public boolean isThreadPoolSizedCorrectly()`
- `protected void printBanner(java.lang.String p0)`
- `public void setAllowedMethods(java.util.Set p0)`
- `public void setDetailedJsonProcessingExceptionMapper(java.lang.Boolean p0)`
- `public void setDumpAfterStart(boolean p0)`
- `public void setDumpBeforeStop(boolean p0)`
- `public void setEnableThreadNameFilter(boolean p0)`
- `public void setGid(java.lang.Integer p0)`
- `public void setGroup(java.lang.String p0)`
- `public void setGzipFilterFactory(io.dropwizard.jetty.GzipHandlerFactory p0)`
- `public void setIdleThreadTimeout(io.dropwizard.util.Duration p0)`
- `public void setJerseyRootPath(java.lang.String p0)`
- `public void setMaxQueuedRequests(int p0)`
- `public void setMaxThreads(int p0)`
- `public void setMinThreads(int p0)`
- `public void setNofileHardLimit(java.lang.Integer p0)`
- `public void setNofileSoftLimit(java.lang.Integer p0)`
- `public void setRegisterDefaultExceptionMappers(java.lang.Boolean p0)`
- `public synchronized void setRequestLogFactory(io.dropwizard.request.logging.RequestLogFactory p0)`
- `public void setServerPush(io.dropwizard.jetty.ServerPushFilterFactory p0)`
- `public void setShutdownGracePeriod(io.dropwizard.util.Duration p0)`
- `public void setStartsAsRoot(java.lang.Boolean p0)`
- `public void setUid(java.lang.Integer p0)`
- `public void setUmask(java.lang.String p0)`
- `public void setUser(java.lang.String p0)`

---

## public class `io.dropwizard.core.server.DefaultServerFactory`
annotations: @com.fasterxml.jackson.annotation.JsonTypeName  
extends `io.dropwizard.core.server.AbstractServerFactory`  

**Constructors:**
- `public DefaultServerFactory()`

**Methods:**
- `public org.eclipse.jetty.server.Server build(io.dropwizard.core.setup.Environment p0)`
- `public void configure(io.dropwizard.core.setup.Environment p0)`
- `public java.util.List getAdminConnectors()`
- `public java.lang.String getAdminContextPath()`
- `public int getAdminMaxThreads()`
- `public int getAdminMinThreads()`
- `public java.util.List getApplicationConnectors()`
- `public java.lang.String getApplicationContextPath()`
- `public void setAdminConnectors(java.util.List p0)`
- `public void setAdminContextPath(java.lang.String p0)`
- `public void setAdminMaxThreads(int p0)`
- `public void setAdminMinThreads(int p0)`
- `public void setApplicationConnectors(java.util.List p0)`
- `public void setApplicationContextPath(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public abstract interface `io.dropwizard.core.server.ServerFactory`
annotations: @com.fasterxml.jackson.annotation.JsonTypeInfo  
implements `io.dropwizard.jackson.Discoverable`  

**Methods:**
- `public abstract org.eclipse.jetty.server.Server build(io.dropwizard.core.setup.Environment p0)`
- `public abstract void configure(io.dropwizard.core.setup.Environment p0)`

---

## public class `io.dropwizard.core.server.SimpleServerFactory`
annotations: @com.fasterxml.jackson.annotation.JsonTypeName  
extends `io.dropwizard.core.server.AbstractServerFactory`  

**Constructors:**
- `public SimpleServerFactory()`

**Methods:**
- `public org.eclipse.jetty.server.Server build(io.dropwizard.core.setup.Environment p0)`
- `public void configure(io.dropwizard.core.setup.Environment p0)`
- `public java.lang.String getAdminContextPath()`
- `public java.lang.String getApplicationContextPath()`
- `public io.dropwizard.jetty.ConnectorFactory getConnector()`
- `public void setAdminContextPath(java.lang.String p0)`
- `public void setApplicationContextPath(java.lang.String p0)`
- `public void setConnector(io.dropwizard.jetty.ConnectorFactory p0)`

---

## public class `io.dropwizard.core.setup.AdminEnvironment`
extends `io.dropwizard.jetty.setup.ServletEnvironment`  

**Constructors:**
- `public AdminEnvironment(io.dropwizard.jetty.MutableServletContextHandler p0, com.codahale.metrics.health.HealthCheckRegistry p1, com.codahale.metrics.MetricRegistry p2, io.dropwizard.core.setup.AdminFactory p3)`

**Methods:**
- `public void addTask(io.dropwizard.servlets.tasks.Task p0)`
- `public boolean isHealthCheckServletEnabled()`

---

## public class `io.dropwizard.core.setup.AdminFactory`

**Constructors:**
- `public AdminFactory()`

**Methods:**
- `public io.dropwizard.core.setup.HealthCheckConfiguration getHealthChecks()`
- `public io.dropwizard.servlets.tasks.TaskConfiguration getTasks()`
- `public void setHealthChecks(io.dropwizard.core.setup.HealthCheckConfiguration p0)`
- `public void setTasks(io.dropwizard.servlets.tasks.TaskConfiguration p0)`
- `public java.lang.String toString()`

---

## public class `io.dropwizard.core.setup.Bootstrap`<T extends io.dropwizard.core.Configuration>

**Constructors:**
- `public Bootstrap(io.dropwizard.core.Application p0)`

**Methods:**
- `public void addBundle(io.dropwizard.core.ConfiguredBundle p0)`
- `public void addCommand(io.dropwizard.core.cli.Command p0)`
- `public void addCommand(io.dropwizard.core.cli.ConfiguredCommand p0)`
- `public io.dropwizard.core.Application getApplication()`
- `public java.lang.ClassLoader getClassLoader()`
- `public java.util.List getCommands()`
- `public io.dropwizard.configuration.ConfigurationFactoryFactory getConfigurationFactoryFactory()`
- `public io.dropwizard.configuration.ConfigurationSourceProvider getConfigurationSourceProvider()`
- `public com.codahale.metrics.health.HealthCheckRegistry getHealthCheckRegistry()`
- `public com.codahale.metrics.jmx.JmxReporter getJmxReporter()`
- `public com.codahale.metrics.MetricRegistry getMetricRegistry()`
- `public com.fasterxml.jackson.databind.ObjectMapper getObjectMapper()`
- `public jakarta.validation.ValidatorFactory getValidatorFactory()`
- `public void registerMetrics()`
- `public void run(T p0, io.dropwizard.core.setup.Environment p1) throws java.lang.Exception`
- `public void setClassLoader(java.lang.ClassLoader p0)`
- `public void setConfigurationFactoryFactory(io.dropwizard.configuration.ConfigurationFactoryFactory p0)`
- `public void setConfigurationSourceProvider(io.dropwizard.configuration.ConfigurationSourceProvider p0)`
- `public void setHealthCheckRegistry(com.codahale.metrics.health.HealthCheckRegistry p0)`
- `public void setMetricRegistry(com.codahale.metrics.MetricRegistry p0)`
- `public void setObjectMapper(com.fasterxml.jackson.databind.ObjectMapper p0)`
- `public void setValidatorFactory(jakarta.validation.ValidatorFactory p0)`

---

## public class `io.dropwizard.core.setup.Environment`

**Constructors:**
- `public Environment(java.lang.String p0)`
- `public Environment(java.lang.String p0, com.fasterxml.jackson.databind.ObjectMapper p1, jakarta.validation.ValidatorFactory p2, com.codahale.metrics.MetricRegistry p3, java.lang.ClassLoader p4, com.codahale.metrics.health.HealthCheckRegistry p5, io.dropwizard.core.Configuration p6)`

**Methods:**
- `public io.dropwizard.core.setup.AdminEnvironment admin()`
- `public io.dropwizard.jetty.MutableServletContextHandler getAdminContext()`
- `public io.dropwizard.jetty.MutableServletContextHandler getApplicationContext()`
- `public java.util.concurrent.ExecutorService getHealthCheckExecutorService()`
- `public jakarta.servlet.Servlet getJerseyServletContainer()`
- `public java.lang.String getName()`
- `public com.fasterxml.jackson.databind.ObjectMapper getObjectMapper()`
- `public jakarta.validation.Validator getValidator()`
- `public io.dropwizard.health.HealthEnvironment health()`
- `public com.codahale.metrics.health.HealthCheckRegistry healthChecks()`
- `public io.dropwizard.jersey.setup.JerseyEnvironment jersey()`
- `public io.dropwizard.lifecycle.setup.LifecycleEnvironment lifecycle()`
- `public com.codahale.metrics.MetricRegistry metrics()`
- `public io.dropwizard.jetty.setup.ServletEnvironment servlets()`
- `public void setValidator(jakarta.validation.Validator p0)`

---

## public class `io.dropwizard.core.setup.ExceptionMapperBinder`
extends `org.glassfish.jersey.internal.inject.AbstractBinder`  

**Constructors:**
- `public ExceptionMapperBinder(boolean p0)`

**Methods:**
- `protected void configure()`
- `public boolean isShowDetails()`

---

## public class `io.dropwizard.core.setup.HealthCheckConfiguration`

**Constructors:**
- `public HealthCheckConfiguration()`

**Methods:**
- `public int getMaxThreads()`
- `public int getMinThreads()`
- `public int getWorkQueueSize()`
- `public boolean isServletEnabled()`
- `public void setMaxThreads(int p0)`
- `public void setMinThreads(int p0)`
- `public void setServletEnabled(boolean p0)`
- `public void setWorkQueueSize(int p0)`
- `public java.lang.String toString()`

---

## public class `io.dropwizard.core.sslreload.SslReloadBundle`
implements `io.dropwizard.core.ConfiguredBundle<io.dropwizard.core.Configuration>`  

**Constructors:**
- `public SslReloadBundle()`

**Methods:**
- `public void run(io.dropwizard.core.Configuration p0, io.dropwizard.core.setup.Environment p1)`

---

## public class `io.dropwizard.core.sslreload.SslReloadTask`
extends `io.dropwizard.servlets.tasks.Task`  

**Constructors:**
- `protected SslReloadTask()`

**Methods:**
- `public void execute(java.util.Map p0, java.io.PrintWriter p1) throws java.lang.Exception`
- `public java.util.Collection getReloaders()`
- `public void setReloaders(java.util.Collection p0)`

---

## public class `io.dropwizard.core.validation.InjectValidatorFeature`
implements `jakarta.ws.rs.core.Feature`  

**Constructors:**
- `public InjectValidatorFeature(jakarta.validation.ValidatorFactory p0)`

**Methods:**
- `public boolean configure(jakarta.ws.rs.core.FeatureContext p0)`

---

