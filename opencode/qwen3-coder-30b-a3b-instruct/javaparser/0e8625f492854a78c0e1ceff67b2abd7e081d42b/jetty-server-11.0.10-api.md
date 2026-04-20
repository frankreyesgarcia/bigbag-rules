# API Specification: org.eclipse.jetty:jetty-server 11.0.10

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public abstract class `org.eclipse.jetty.server.AbstractConnectionFactory`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.util.component.ContainerLifeCycle`  
implements `org.eclipse.jetty.server.ConnectionFactory`  

**Constructors:**
- `protected AbstractConnectionFactory(java.lang.String p0)`
- `protected AbstractConnectionFactory(java.lang.String... p0)`

**Methods:**
- `protected org.eclipse.jetty.io.AbstractConnection configure(org.eclipse.jetty.io.AbstractConnection p0, org.eclipse.jetty.server.Connector p1, org.eclipse.jetty.io.EndPoint p2)`
- `protected java.lang.String findNextProtocol(org.eclipse.jetty.server.Connector p0)`
- `protected static java.lang.String findNextProtocol(org.eclipse.jetty.server.Connector p0, java.lang.String p1)`
- `public static org.eclipse.jetty.server.ConnectionFactory[] getFactories(org.eclipse.jetty.util.ssl.SslContextFactory$Server p0, org.eclipse.jetty.server.ConnectionFactory... p1)`
- `public int getInputBufferSize()`
- `public java.lang.String getProtocol()`
- `public java.util.List getProtocols()`
- `public void setInputBufferSize(int p0)`
- `public java.lang.String toString()`

---

## public abstract class `org.eclipse.jetty.server.AbstractConnector`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.util.component.ContainerLifeCycle`  
implements `org.eclipse.jetty.server.Connector`, `org.eclipse.jetty.util.component.Dumpable`  

**Constructors:**
- `public AbstractConnector(org.eclipse.jetty.server.Server p0, java.util.concurrent.Executor p1, org.eclipse.jetty.util.thread.Scheduler p2, org.eclipse.jetty.io.ByteBufferPool p3, int p4, org.eclipse.jetty.server.ConnectionFactory... p5)`

**Fields:**
- `protected final static org.slf4j.Logger LOG`

**Methods:**
- `protected abstract void accept(int p0) throws java.io.IOException, java.lang.InterruptedException`
- `public void addConnectionFactory(org.eclipse.jetty.server.ConnectionFactory p0)`
- `public void addFirstConnectionFactory(org.eclipse.jetty.server.ConnectionFactory p0)`
- `public void addIfAbsentConnectionFactory(org.eclipse.jetty.server.ConnectionFactory p0)`
- `public void clearConnectionFactories()`
- `protected void doStart() throws java.lang.Exception`
- `protected void doStop() throws java.lang.Exception`
- `public int getAcceptorPriorityDelta()`
- `public int getAcceptors()`
- `public org.eclipse.jetty.io.ByteBufferPool getByteBufferPool()`
- `public java.util.Collection getConnectedEndPoints()`
- `public java.util.Collection getConnectionFactories()`
- `public <T extends java.lang.Object> T getConnectionFactory(java.lang.Class p0)`
- `public org.eclipse.jetty.server.ConnectionFactory getConnectionFactory(java.lang.String p0)`
- `public org.eclipse.jetty.server.ConnectionFactory getDefaultConnectionFactory()`
- `public java.lang.String getDefaultProtocol()`
- `public java.util.concurrent.Executor getExecutor()`
- `public org.eclipse.jetty.server.HttpChannel$Listener getHttpChannelListeners()`
- `public long getIdleTimeout()`
- `public java.lang.String getName()`
- `public java.util.List getProtocols()`
- `public org.eclipse.jetty.util.thread.Scheduler getScheduler()`
- `public org.eclipse.jetty.server.Server getServer()`
- `public long getShutdownIdleTimeout()`
- `protected boolean handleAcceptFailure(java.lang.Throwable p0)`
- `protected void interruptAcceptors()`
- `public boolean isAccepting()`
- `public boolean isShutdown()`
- `public void join() throws java.lang.InterruptedException`
- `public void join(long p0) throws java.lang.InterruptedException`
- `protected void onEndPointClosed(org.eclipse.jetty.io.EndPoint p0)`
- `protected void onEndPointOpened(org.eclipse.jetty.io.EndPoint p0)`
- `public org.eclipse.jetty.server.ConnectionFactory removeConnectionFactory(java.lang.String p0)`
- `public void setAccepting(boolean p0)`
- `public void setAcceptorPriorityDelta(int p0)`
- `public void setConnectionFactories(java.util.Collection p0)`
- `public void setDefaultProtocol(java.lang.String p0)`
- `public void setIdleTimeout(long p0)`
- `public void setName(java.lang.String p0)`
- `public void setShutdownIdleTimeout(long p0)`
- `public java.util.concurrent.CompletableFuture shutdown()`
- `public java.lang.String toString()`

---

## public abstract class `org.eclipse.jetty.server.AbstractNetworkConnector`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.server.AbstractConnector`  
implements `org.eclipse.jetty.server.NetworkConnector`  

**Constructors:**
- `public AbstractNetworkConnector(org.eclipse.jetty.server.Server p0, java.util.concurrent.Executor p1, org.eclipse.jetty.util.thread.Scheduler p2, org.eclipse.jetty.io.ByteBufferPool p3, int p4, org.eclipse.jetty.server.ConnectionFactory... p5)`

**Methods:**
- `public void close()`
- `protected void doStart() throws java.lang.Exception`
- `protected void doStop() throws java.lang.Exception`
- `public java.lang.String getHost()`
- `public int getLocalPort()`
- `public int getPort()`
- `protected boolean handleAcceptFailure(java.lang.Throwable p0)`
- `public void open() throws java.io.IOException`
- `public void setHost(java.lang.String p0)`
- `public void setPort(int p0)`
- `public java.util.concurrent.CompletableFuture shutdown()`
- `public java.lang.String toString()`

---

## public class `org.eclipse.jetty.server.AcceptRateLimit`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.util.component.AbstractLifeCycle`  
implements `java.lang.Runnable`, `org.eclipse.jetty.io.SelectorManager$AcceptListener`  

**Constructors:**
- `public AcceptRateLimit(int p0, long p1, java.util.concurrent.TimeUnit p2, org.eclipse.jetty.server.Connector... p3)`
- `public AcceptRateLimit(int p0, long p1, java.util.concurrent.TimeUnit p2, org.eclipse.jetty.server.Server p3)`

**Methods:**
- `protected void age(long p0, java.util.concurrent.TimeUnit p1)`
- `protected void doStart() throws java.lang.Exception`
- `protected void doStop() throws java.lang.Exception`
- `public int getAcceptRateLimit()`
- `public long getMaxRate()`
- `public long getPeriod()`
- `public int getRate()`
- `public java.util.concurrent.TimeUnit getUnits()`
- `protected void limit()`
- `public void onAccepting(java.nio.channels.SelectableChannel p0)`
- `public void reset()`
- `public void run()`
- `protected void unlimit()`

---

## public class `org.eclipse.jetty.server.AllowedResourceAliasChecker`
extends `org.eclipse.jetty.util.component.AbstractLifeCycle`  
implements `org.eclipse.jetty.server.handler.ContextHandler$AliasCheck`  

**Constructors:**
- `public AllowedResourceAliasChecker(org.eclipse.jetty.server.handler.ContextHandler p0)`

**Fields:**
- `protected final static java.nio.file.LinkOption[] FOLLOW_LINKS`
- `protected final static java.nio.file.LinkOption[] NO_FOLLOW_LINKS`
- `protected java.nio.file.Path _base`

**Methods:**
- `protected boolean check(java.lang.String p0, java.nio.file.Path p1)`
- `public boolean check(java.lang.String p0, org.eclipse.jetty.util.resource.Resource p1)`
- `protected void doStart() throws java.lang.Exception`
- `protected void doStop() throws java.lang.Exception`
- `protected org.eclipse.jetty.server.handler.ContextHandler getContextHandler()`
- `protected java.nio.file.Path getPath(org.eclipse.jetty.util.resource.Resource p0)`
- `protected void initialize()`
- `protected boolean isAllowed(java.nio.file.Path p0)`
- `protected boolean isSameFile(java.nio.file.Path p0, java.nio.file.Path p1)`
- `public java.lang.String toString()`

---

## public class `org.eclipse.jetty.server.AsyncContextEvent`
extends `jakarta.servlet.AsyncEvent`  
implements `java.lang.Runnable`  

**Constructors:**
- `public AsyncContextEvent(org.eclipse.jetty.server.handler.ContextHandler$Context p0, org.eclipse.jetty.server.AsyncContextState p1, org.eclipse.jetty.server.HttpChannelState p2, org.eclipse.jetty.server.Request p3, jakarta.servlet.ServletRequest p4, jakarta.servlet.ServletResponse p5)`
- `public AsyncContextEvent(org.eclipse.jetty.server.handler.ContextHandler$Context p0, org.eclipse.jetty.server.AsyncContextState p1, org.eclipse.jetty.server.HttpChannelState p2, org.eclipse.jetty.server.Request p3, jakarta.servlet.ServletRequest p4, jakarta.servlet.ServletResponse p5, org.eclipse.jetty.http.HttpURI p6)`

**Methods:**
- `public void addThrowable(java.lang.Throwable p0)`
- `public void cancelTimeoutTask()`
- `public void completed()`
- `public jakarta.servlet.AsyncContext getAsyncContext()`
- `public org.eclipse.jetty.http.HttpURI getBaseURI()`
- `public org.eclipse.jetty.server.handler.ContextHandler$Context getContext()`
- `public jakarta.servlet.ServletContext getDispatchContext()`
- `public java.lang.String getDispatchPath()`
- `public org.eclipse.jetty.server.HttpChannelState getHttpChannelState()`
- `public jakarta.servlet.ServletContext getServletContext()`
- `public jakarta.servlet.ServletContext getSuspendedContext()`
- `public java.lang.Throwable getThrowable()`
- `public boolean hasTimeoutTask()`
- `public void run()`
- `public void setDispatchContext(jakarta.servlet.ServletContext p0)`
- `public void setDispatchPath(java.lang.String p0)`
- `public void setTimeoutTask(org.eclipse.jetty.util.thread.Scheduler$Task p0)`

---

## public class `org.eclipse.jetty.server.AsyncContextState`
implements `jakarta.servlet.AsyncContext`  

**Constructors:**
- `public AsyncContextState(org.eclipse.jetty.server.HttpChannelState p0)`

**Methods:**
- `public void addListener(jakarta.servlet.AsyncListener p0)`
- `public void addListener(jakarta.servlet.AsyncListener p0, jakarta.servlet.ServletRequest p1, jakarta.servlet.ServletResponse p2)`
- `public void complete()`
- `public <T extends jakarta.servlet.AsyncListener> T createListener(java.lang.Class p0) throws jakarta.servlet.ServletException`
- `public void dispatch()`
- `public void dispatch(jakarta.servlet.ServletContext p0, java.lang.String p1)`
- `public void dispatch(java.lang.String p0)`
- `public org.eclipse.jetty.server.HttpChannel getHttpChannel()`
- `public org.eclipse.jetty.server.HttpChannelState getHttpChannelState()`
- `public jakarta.servlet.ServletRequest getRequest()`
- `public jakarta.servlet.ServletResponse getResponse()`
- `public long getTimeout()`
- `public boolean hasOriginalRequestAndResponse()`
- `public void reset()`
- `public void setTimeout(long p0)`
- `public void start(java.lang.Runnable p0)`

---

## public static class `org.eclipse.jetty.server.AsyncContextState$WrappedAsyncListener`
implements `jakarta.servlet.AsyncListener`  

**Constructors:**
- `public WrappedAsyncListener(jakarta.servlet.AsyncListener p0, jakarta.servlet.ServletRequest p1, jakarta.servlet.ServletResponse p2)`

**Methods:**
- `public jakarta.servlet.AsyncListener getListener()`
- `public void onComplete(jakarta.servlet.AsyncEvent p0) throws java.io.IOException`
- `public void onError(jakarta.servlet.AsyncEvent p0) throws java.io.IOException`
- `public void onStartAsync(jakarta.servlet.AsyncEvent p0) throws java.io.IOException`
- `public void onTimeout(jakarta.servlet.AsyncEvent p0) throws java.io.IOException`

---

## public class `org.eclipse.jetty.server.AsyncRequestLogWriter`
extends `org.eclipse.jetty.server.RequestLogWriter`  

**Constructors:**
- `public AsyncRequestLogWriter()`
- `public AsyncRequestLogWriter(java.lang.String p0)`
- `public AsyncRequestLogWriter(java.lang.String p0, java.util.concurrent.BlockingQueue p1)`

**Methods:**
- `protected void doStart() throws java.lang.Exception`
- `protected void doStop() throws java.lang.Exception`
- `public void write(java.lang.String p0) throws java.io.IOException`

---

## public abstract interface `org.eclipse.jetty.server.Authentication`

**Fields:**
- `public final static org.eclipse.jetty.server.Authentication NOT_CHECKED`
- `public final static org.eclipse.jetty.server.Authentication SEND_CONTINUE`
- `public final static org.eclipse.jetty.server.Authentication SEND_FAILURE`
- `public final static org.eclipse.jetty.server.Authentication SEND_SUCCESS`
- `public final static org.eclipse.jetty.server.Authentication UNAUTHENTICATED`

---

## public abstract static interface `org.eclipse.jetty.server.Authentication$Challenge`
implements `org.eclipse.jetty.server.Authentication$ResponseSent`  

---

## public abstract static interface `org.eclipse.jetty.server.Authentication$Deferred`
implements `org.eclipse.jetty.server.Authentication$LoginAuthentication`, `org.eclipse.jetty.server.Authentication$LogoutAuthentication`  

**Methods:**
- `public abstract org.eclipse.jetty.server.Authentication authenticate(jakarta.servlet.ServletRequest p0)`
- `public abstract org.eclipse.jetty.server.Authentication authenticate(jakarta.servlet.ServletRequest p0, jakarta.servlet.ServletResponse p1)`

---

## public static class `org.eclipse.jetty.server.Authentication$Failed`
extends `org.eclipse.jetty.server.QuietServletException`  

**Constructors:**
- `public Failed(java.lang.String p0)`

---

## public abstract static interface `org.eclipse.jetty.server.Authentication$Failure`
implements `org.eclipse.jetty.server.Authentication$ResponseSent`  

---

## public abstract static interface `org.eclipse.jetty.server.Authentication$LoginAuthentication`
implements `org.eclipse.jetty.server.Authentication`  

**Methods:**
- `public abstract org.eclipse.jetty.server.Authentication login(java.lang.String p0, java.lang.Object p1, jakarta.servlet.ServletRequest p2)`

---

## public abstract static interface `org.eclipse.jetty.server.Authentication$LogoutAuthentication`
implements `org.eclipse.jetty.server.Authentication`  

**Methods:**
- `public abstract org.eclipse.jetty.server.Authentication logout(jakarta.servlet.ServletRequest p0)`

---

## public abstract static interface `org.eclipse.jetty.server.Authentication$NonAuthenticated`
implements `org.eclipse.jetty.server.Authentication$LoginAuthentication`  

---

## public abstract static interface `org.eclipse.jetty.server.Authentication$ResponseSent`
implements `org.eclipse.jetty.server.Authentication`  

---

## public abstract static interface `org.eclipse.jetty.server.Authentication$SendSuccess`
implements `org.eclipse.jetty.server.Authentication$ResponseSent`  

---

## public abstract static interface `org.eclipse.jetty.server.Authentication$User`
implements `org.eclipse.jetty.server.Authentication$LogoutAuthentication`  

**Methods:**
- `public abstract java.lang.String getAuthMethod()`
- `public abstract org.eclipse.jetty.server.UserIdentity getUserIdentity()`
- `public abstract boolean isUserInRole(org.eclipse.jetty.server.UserIdentity$Scope p0, java.lang.String p1)`

---

## public abstract static interface `org.eclipse.jetty.server.Authentication$Wrapped`
implements `org.eclipse.jetty.server.Authentication`  

**Methods:**
- `public abstract jakarta.servlet.http.HttpServletRequest getHttpServletRequest()`
- `public abstract jakarta.servlet.http.HttpServletResponse getHttpServletResponse()`

---

## public class `org.eclipse.jetty.server.CachedContentFactory`
implements `org.eclipse.jetty.http.HttpContent$ContentFactory`  

**Constructors:**
- `public CachedContentFactory(org.eclipse.jetty.server.CachedContentFactory p0, org.eclipse.jetty.util.resource.ResourceFactory p1, org.eclipse.jetty.http.MimeTypes p2, boolean p3, boolean p4, org.eclipse.jetty.http.CompressedContentFormat[] p5)`

**Methods:**
- `public void flushCache()`
- `public int getCachedFiles()`
- `public int getCachedSize()`
- `public org.eclipse.jetty.http.HttpContent getContent(java.lang.String p0, int p1) throws java.io.IOException`
- `protected java.nio.ByteBuffer getDirectBuffer(org.eclipse.jetty.util.resource.Resource p0)`
- `protected java.nio.ByteBuffer getIndirectBuffer(org.eclipse.jetty.util.resource.Resource p0)`
- `protected java.nio.ByteBuffer getMappedBuffer(org.eclipse.jetty.util.resource.Resource p0)`
- `public int getMaxCacheSize()`
- `public int getMaxCachedFileSize()`
- `public int getMaxCachedFiles()`
- `protected boolean isCacheable(org.eclipse.jetty.util.resource.Resource p0)`
- `public boolean isUseFileMappedBuffer()`
- `public void setMaxCacheSize(int p0)`
- `public void setMaxCachedFileSize(int p0)`
- `public void setMaxCachedFiles(int p0)`
- `public java.lang.String toString()`

---

## public class `org.eclipse.jetty.server.CachedContentFactory$CachedHttpContent`
implements `org.eclipse.jetty.http.HttpContent`  

**Methods:**
- `public java.lang.String getCharacterEncoding()`
- `public org.eclipse.jetty.http.HttpField getContentEncoding()`
- `public java.lang.String getContentEncodingValue()`
- `public org.eclipse.jetty.http.HttpField getContentLength()`
- `public long getContentLengthValue()`
- `public org.eclipse.jetty.http.HttpField getContentType()`
- `public java.lang.String getContentTypeValue()`
- `public java.nio.ByteBuffer getDirectBuffer()`
- `public org.eclipse.jetty.http.HttpField getETag()`
- `public java.lang.String getETagValue()`
- `public java.nio.ByteBuffer getIndirectBuffer()`
- `public java.io.InputStream getInputStream() throws java.io.IOException`
- `public java.lang.String getKey()`
- `public org.eclipse.jetty.http.HttpField getLastModified()`
- `public java.lang.String getLastModifiedValue()`
- `public org.eclipse.jetty.http.MimeTypes$Type getMimeType()`
- `public java.util.Map getPrecompressedContents()`
- `public java.nio.channels.ReadableByteChannel getReadableByteChannel() throws java.io.IOException`
- `public org.eclipse.jetty.util.resource.Resource getResource()`
- `protected void invalidate()`
- `public boolean isCached()`
- `public void release()`
- `public java.lang.String toString()`

---

## public class `org.eclipse.jetty.server.CachedContentFactory$CachedPrecompressedHttpContent`
extends `org.eclipse.jetty.http.PrecompressedHttpContent`  

**Methods:**
- `public org.eclipse.jetty.http.HttpField getETag()`
- `public java.lang.String getETagValue()`
- `public boolean isValid()`
- `public java.lang.String toString()`

---

## public class `org.eclipse.jetty.server.ClassLoaderDump`
implements `org.eclipse.jetty.util.component.Dumpable`  

**Constructors:**
- `public ClassLoaderDump(java.lang.ClassLoader p0)`

**Methods:**
- `public java.lang.String dump()`
- `public void dump(java.lang.Appendable p0, java.lang.String p1) throws java.io.IOException`

---

## public abstract interface `org.eclipse.jetty.server.ConnectionFactory`

**Methods:**
- `public abstract java.lang.String getProtocol()`
- `public abstract java.util.List getProtocols()`
- `public abstract org.eclipse.jetty.io.Connection newConnection(org.eclipse.jetty.server.Connector p0, org.eclipse.jetty.io.EndPoint p1)`

---

## public abstract static interface `org.eclipse.jetty.server.ConnectionFactory$Configuring`
implements `org.eclipse.jetty.server.ConnectionFactory`  

**Methods:**
- `public abstract void configure(org.eclipse.jetty.server.Connector p0)`

---

## public abstract static interface `org.eclipse.jetty.server.ConnectionFactory$Detecting`
implements `org.eclipse.jetty.server.ConnectionFactory`  

**Methods:**
- `public abstract org.eclipse.jetty.server.ConnectionFactory$Detecting$Detection detect(java.nio.ByteBuffer p0)`

---

## public final static enum `org.eclipse.jetty.server.ConnectionFactory$Detecting$Detection`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.eclipse.jetty.server.ConnectionFactory$Detecting$Detection NEED_MORE_BYTES`
- `public final static org.eclipse.jetty.server.ConnectionFactory$Detecting$Detection NOT_RECOGNIZED`
- `public final static org.eclipse.jetty.server.ConnectionFactory$Detecting$Detection RECOGNIZED`

---

## public abstract static interface `org.eclipse.jetty.server.ConnectionFactory$Upgrading`
implements `org.eclipse.jetty.server.ConnectionFactory`  

**Methods:**
- `public abstract org.eclipse.jetty.io.Connection upgradeConnection(org.eclipse.jetty.server.Connector p0, org.eclipse.jetty.io.EndPoint p1, org.eclipse.jetty.http.MetaData$Request p2, org.eclipse.jetty.http.HttpFields$Mutable p3) throws org.eclipse.jetty.http.BadMessageException`

---

## public class `org.eclipse.jetty.server.ConnectionLimit`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.util.component.AbstractLifeCycle`  
implements `org.eclipse.jetty.io.Connection$Listener`, `org.eclipse.jetty.io.SelectorManager$AcceptListener`  

**Constructors:**
- `public ConnectionLimit(int p0, org.eclipse.jetty.server.Connector... p1)`
- `public ConnectionLimit(int p0, org.eclipse.jetty.server.Server p1)`

**Methods:**
- `protected void check()`
- `protected void doStart() throws java.lang.Exception`
- `protected void doStop() throws java.lang.Exception`
- `public int getConnections()`
- `public long getIdleTimeout()`
- `public int getMaxConnections()`
- `protected void limit()`
- `public void onAcceptFailed(java.nio.channels.SelectableChannel p0, java.lang.Throwable p1)`
- `public void onAccepted(java.nio.channels.SelectableChannel p0)`
- `public void onAccepting(java.nio.channels.SelectableChannel p0)`
- `public void onClosed(org.eclipse.jetty.io.Connection p0)`
- `public void onOpened(org.eclipse.jetty.io.Connection p0)`
- `public void setIdleTimeout(long p0)`
- `public void setMaxConnections(int p0)`
- `protected void unlimit()`

---

## public abstract interface `org.eclipse.jetty.server.Connector`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
implements `org.eclipse.jetty.util.component.Container`, `org.eclipse.jetty.util.component.Graceful`, `org.eclipse.jetty.util.component.LifeCycle`  

**Methods:**
- `public abstract org.eclipse.jetty.io.ByteBufferPool getByteBufferPool()`
- `public abstract java.util.Collection getConnectedEndPoints()`
- `public abstract java.util.Collection getConnectionFactories()`
- `public abstract <T extends java.lang.Object> T getConnectionFactory(java.lang.Class p0)`
- `public abstract org.eclipse.jetty.server.ConnectionFactory getConnectionFactory(java.lang.String p0)`
- `public abstract org.eclipse.jetty.server.ConnectionFactory getDefaultConnectionFactory()`
- `public abstract java.util.concurrent.Executor getExecutor()`
- `public abstract long getIdleTimeout()`
- `public abstract java.lang.String getName()`
- `public abstract java.util.List getProtocols()`
- `public abstract org.eclipse.jetty.util.thread.Scheduler getScheduler()`
- `public abstract org.eclipse.jetty.server.Server getServer()`
- `public abstract java.lang.Object getTransport()`

---

## public abstract interface `org.eclipse.jetty.server.ContentProducer`

**Methods:**
- `public abstract int available()`
- `public abstract void checkMinDataRate()`
- `public abstract boolean consumeAll()`
- `public abstract org.eclipse.jetty.server.HttpInput$Interceptor getInterceptor()`
- `public abstract long getRawContentArrived()`
- `public abstract boolean hasContent()`
- `public abstract boolean isError()`
- `public abstract boolean isReady()`
- `public abstract org.eclipse.jetty.util.thread.AutoLock lock()`
- `public abstract org.eclipse.jetty.server.HttpInput$Content nextContent()`
- `public abstract boolean onContentProducible()`
- `public abstract void reclaim(org.eclipse.jetty.server.HttpInput$Content p0)`
- `public abstract void recycle()`
- `public abstract void reopen()`
- `public abstract void setInterceptor(org.eclipse.jetty.server.HttpInput$Interceptor p0)`

---

## public class `org.eclipse.jetty.server.Cookies`
extends `org.eclipse.jetty.http.CookieCutter`  

**Constructors:**
- `public Cookies()`
- `public Cookies(org.eclipse.jetty.http.CookieCompliance p0, org.eclipse.jetty.http.ComplianceViolation$Listener p1)`

**Fields:**
- `protected final static org.slf4j.Logger LOG`
- `protected final java.util.List _cookieList`
- `protected final java.util.List _rawFields`

**Methods:**
- `protected void addCookie(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, java.lang.String p5)`
- `public void addCookieField(java.lang.String p0)`
- `public jakarta.servlet.http.Cookie[] getCookies()`
- `public void reset()`
- `public void setCookies(jakarta.servlet.http.Cookie[] p0)`

---

## public class `org.eclipse.jetty.server.CustomRequestLog`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.util.component.ContainerLifeCycle`  
implements `org.eclipse.jetty.server.RequestLog`  

**Constructors:**
- `public CustomRequestLog()`
- `public CustomRequestLog(java.lang.String p0)`
- `public CustomRequestLog(java.lang.String p0, java.lang.String p1)`
- `public CustomRequestLog(org.eclipse.jetty.server.RequestLog$Writer p0, java.lang.String p1)`

**Fields:**
- `public final static java.lang.String DEFAULT_DATE_FORMAT`
- `public final static java.lang.String EXTENDED_NCSA_FORMAT`
- `protected final static org.slf4j.Logger LOG`
- `public final static java.lang.String NCSA_FORMAT`

**Methods:**
- `protected void doStart() throws java.lang.Exception`
- `protected static java.lang.String getAuthentication(org.eclipse.jetty.server.Request p0, boolean p1)`
- `public java.lang.String getFormatString()`
- `public java.lang.String[] getIgnorePaths()`
- `public org.eclipse.jetty.server.RequestLog$Writer getWriter()`
- `public void log(org.eclipse.jetty.server.Request p0, org.eclipse.jetty.server.Response p1)`
- `public void setFilter(java.util.function.BiPredicate p0)`
- `public void setIgnorePaths(java.lang.String[] p0)`

---

## public class `org.eclipse.jetty.server.DebugListener`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.util.component.AbstractLifeCycle`  
implements `jakarta.servlet.ServletContextListener`  

**Constructors:**
- `public DebugListener()`
- `public DebugListener(boolean p0, boolean p1, boolean p2)`
- `public DebugListener(java.io.OutputStream p0, boolean p1, boolean p2, boolean p3)`

**Methods:**
- `public void contextDestroyed(jakarta.servlet.ServletContextEvent p0)`
- `public void contextInitialized(jakarta.servlet.ServletContextEvent p0)`
- `protected java.lang.String findContextName(jakarta.servlet.ServletContext p0)`
- `protected java.lang.String findRequestName(jakarta.servlet.ServletRequest p0)`
- `public boolean isDumpContext()`
- `public boolean isRenameThread()`
- `public boolean isShowHeaders()`
- `protected void log(java.lang.String p0, java.lang.Object... p1)`
- `public void setDumpContext(boolean p0)`
- `public void setRenameThread(boolean p0)`
- `public void setShowHeaders(boolean p0)`

---

## public class `org.eclipse.jetty.server.DetectorConnectionFactory`
extends `org.eclipse.jetty.server.AbstractConnectionFactory`  
implements `org.eclipse.jetty.server.ConnectionFactory$Detecting`  

**Constructors:**
- `public DetectorConnectionFactory(org.eclipse.jetty.server.ConnectionFactory$Detecting... p0)`

**Methods:**
- `public org.eclipse.jetty.server.ConnectionFactory$Detecting$Detection detect(java.nio.ByteBuffer p0)`
- `public org.eclipse.jetty.io.Connection newConnection(org.eclipse.jetty.server.Connector p0, org.eclipse.jetty.io.EndPoint p1)`
- `protected void nextProtocol(org.eclipse.jetty.server.Connector p0, org.eclipse.jetty.io.EndPoint p1, java.nio.ByteBuffer p2) throws java.lang.IllegalStateException`
- `protected static void upgradeToConnectionFactory(org.eclipse.jetty.server.ConnectionFactory p0, org.eclipse.jetty.server.Connector p1, org.eclipse.jetty.io.EndPoint p2) throws java.lang.IllegalStateException`

---

## public class `org.eclipse.jetty.server.Dispatcher`
implements `jakarta.servlet.RequestDispatcher`  

**Constructors:**
- `public Dispatcher(org.eclipse.jetty.server.handler.ContextHandler p0, java.lang.String p1) throws java.lang.IllegalStateException`
- `public Dispatcher(org.eclipse.jetty.server.handler.ContextHandler p0, org.eclipse.jetty.http.HttpURI p1, java.lang.String p2)`

**Fields:**
- `public final static java.lang.String __FORWARD_PREFIX`
- `public final static java.lang.String __INCLUDE_PREFIX`

**Methods:**
- `public void error(jakarta.servlet.ServletRequest p0, jakarta.servlet.ServletResponse p1) throws jakarta.servlet.ServletException, java.io.IOException`
- `public void forward(jakarta.servlet.ServletRequest p0, jakarta.servlet.ServletResponse p1) throws jakarta.servlet.ServletException, java.io.IOException`
- `protected void forward(jakarta.servlet.ServletRequest p0, jakarta.servlet.ServletResponse p1, jakarta.servlet.DispatcherType p2) throws jakarta.servlet.ServletException, java.io.IOException`
- `public void include(jakarta.servlet.ServletRequest p0, jakarta.servlet.ServletResponse p1) throws jakarta.servlet.ServletException, java.io.IOException`
- `public java.lang.String toString()`

---

## public class `org.eclipse.jetty.server.EncodingHttpWriter`
extends `org.eclipse.jetty.server.HttpWriter`  

**Constructors:**
- `public EncodingHttpWriter(org.eclipse.jetty.server.HttpOutput p0, java.lang.String p1)`

**Methods:**
- `public void write(char[] p0, int p1, int p2) throws java.io.IOException`

---

## public class `org.eclipse.jetty.server.ForwardedRequestCustomizer`
implements `org.eclipse.jetty.server.HttpConfiguration$Customizer`  

**Constructors:**
- `public ForwardedRequestCustomizer()`

**Methods:**
- `public void customize(org.eclipse.jetty.server.Connector p0, org.eclipse.jetty.server.HttpConfiguration p1, org.eclipse.jetty.server.Request p2)`
- `public java.lang.String getForcedHost()`
- `public java.lang.String getForwardedCipherSuiteHeader()`
- `public java.lang.String getForwardedForHeader()`
- `public java.lang.String getForwardedHeader()`
- `public java.lang.String getForwardedHostHeader()`
- `public java.lang.String getForwardedHttpsHeader()`
- `public boolean getForwardedPortAsAuthority()`
- `public java.lang.String getForwardedPortHeader()`
- `public java.lang.String getForwardedProtoHeader()`
- `public java.lang.String getForwardedServerHeader()`
- `public java.lang.String getForwardedSslSessionIdHeader()`
- `public java.lang.String getHostHeader()`
- `protected static java.lang.String getLeftMost(java.lang.String p0)`
- `public boolean getProxyAsAuthority()`
- `protected static int getSecurePort(org.eclipse.jetty.server.HttpConfiguration p0)`
- `public boolean isSslIsSecure()`
- `protected void onError(org.eclipse.jetty.http.HttpField p0, java.lang.Throwable p1)`
- `public void setForcedHost(java.lang.String p0)`
- `public void setForwardedCipherSuiteHeader(java.lang.String p0)`
- `public void setForwardedForHeader(java.lang.String p0)`
- `public void setForwardedHeader(java.lang.String p0)`
- `public void setForwardedHostHeader(java.lang.String p0)`
- `public void setForwardedHttpsHeader(java.lang.String p0)`
- `public void setForwardedOnly(boolean p0)`
- `public void setForwardedPortAsAuthority(boolean p0)`
- `public void setForwardedPortHeader(java.lang.String p0)`
- `public void setForwardedProtoHeader(java.lang.String p0)`
- `public void setForwardedServerHeader(java.lang.String p0)`
- `public void setForwardedSslSessionIdHeader(java.lang.String p0)`
- `public void setHostHeader(java.lang.String p0)`
- `public void setProxyAsAuthority(boolean p0)`
- `public void setSslIsSecure(boolean p0)`
- `public java.lang.String toString()`

---

## public final static enum `org.eclipse.jetty.server.ForwardedRequestCustomizer$Source`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.eclipse.jetty.server.ForwardedRequestCustomizer$Source FORCED`
- `public final static org.eclipse.jetty.server.ForwardedRequestCustomizer$Source FORWARDED`
- `public final static org.eclipse.jetty.server.ForwardedRequestCustomizer$Source UNSET`
- `public final static org.eclipse.jetty.server.ForwardedRequestCustomizer$Source XFORWARDED_FOR`
- `public final static org.eclipse.jetty.server.ForwardedRequestCustomizer$Source XFORWARDED_HOST`
- `public final static org.eclipse.jetty.server.ForwardedRequestCustomizer$Source XFORWARDED_PORT`
- `public final static org.eclipse.jetty.server.ForwardedRequestCustomizer$Source XFORWARDED_PROTO`
- `public final static org.eclipse.jetty.server.ForwardedRequestCustomizer$Source XFORWARDED_SERVER`
- `public final static org.eclipse.jetty.server.ForwardedRequestCustomizer$Source XPROXIED_HTTPS`

---

## public abstract interface `org.eclipse.jetty.server.Handler`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
implements `org.eclipse.jetty.util.component.Destroyable`, `org.eclipse.jetty.util.component.LifeCycle`  

**Methods:**
- `public abstract void destroy()`
- `public abstract org.eclipse.jetty.server.Server getServer()`
- `public abstract void handle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `public abstract void setServer(org.eclipse.jetty.server.Server p0)`

---

## public abstract interface `org.eclipse.jetty.server.HandlerContainer`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
implements `org.eclipse.jetty.util.component.LifeCycle`  

**Methods:**
- `public abstract <T extends org.eclipse.jetty.server.Handler> T getChildHandlerByClass(java.lang.Class p0)`
- `public abstract org.eclipse.jetty.server.Handler[] getChildHandlers()`
- `public abstract org.eclipse.jetty.server.Handler[] getChildHandlersByClass(java.lang.Class p0)`
- `public abstract org.eclipse.jetty.server.Handler[] getHandlers()`

---

## public class `org.eclipse.jetty.server.HomeBaseWarning`

**Constructors:**
- `public HomeBaseWarning()`

---

## public class `org.eclipse.jetty.server.HostHeaderCustomizer`
implements `org.eclipse.jetty.server.HttpConfiguration$Customizer`  

**Constructors:**
- `public HostHeaderCustomizer()`
- `public HostHeaderCustomizer(java.lang.String p0)`
- `public HostHeaderCustomizer(java.lang.String p0, int p1)`

**Methods:**
- `public void customize(org.eclipse.jetty.server.Connector p0, org.eclipse.jetty.server.HttpConfiguration p1, org.eclipse.jetty.server.Request p2)`

---

## public abstract class `org.eclipse.jetty.server.HttpChannel`
implements `java.lang.Runnable`, `org.eclipse.jetty.server.HttpOutput$Interceptor`  

**Constructors:**
- `public HttpChannel(org.eclipse.jetty.server.Connector p0, org.eclipse.jetty.server.HttpConfiguration p1, org.eclipse.jetty.io.EndPoint p2, org.eclipse.jetty.server.HttpTransport p3)`

**Fields:**
- `public static org.eclipse.jetty.server.HttpChannel$Listener NOOP_LISTENER`

**Methods:**
- `public void abort(java.lang.Throwable p0)`
- `public boolean addListener(org.eclipse.jetty.server.HttpChannel$Listener p0)`
- `public void addRequestLog(org.eclipse.jetty.server.RequestLog p0)`
- `protected boolean checkAndPrepareUpgrade()`
- `protected void commit(org.eclipse.jetty.http.MetaData$Response p0)`
- `public void continue100(int p0) throws java.io.IOException`
- `public void ensureConsumeAllOrNotPersistent()`
- `protected abstract boolean eof()`
- `protected void execute(java.lang.Runnable p0)`
- `public abstract boolean failAllContent(java.lang.Throwable p0)`
- `public abstract boolean failed(java.lang.Throwable p0)`
- `protected java.lang.String formatAddrOrHost(java.lang.String p0)`
- `public org.eclipse.jetty.io.ByteBufferPool getByteBufferPool()`
- `public long getBytesWritten()`
- `public org.eclipse.jetty.http.MetaData$Response getCommittedMetaData()`
- `public org.eclipse.jetty.io.Connection getConnection()`
- `public org.eclipse.jetty.server.Connector getConnector()`
- `public org.eclipse.jetty.io.EndPoint getEndPoint()`
- `public org.eclipse.jetty.server.HttpConfiguration getHttpConfiguration()`
- `public org.eclipse.jetty.server.HttpTransport getHttpTransport()`
- `public long getIdleTimeout()`
- `public java.net.InetSocketAddress getLocalAddress()`
- `public java.lang.String getLocalName()`
- `public int getLocalPort()`
- `public org.eclipse.jetty.server.HttpOutput$Interceptor getNextInterceptor()`
- `public java.net.InetSocketAddress getRemoteAddress()`
- `public org.eclipse.jetty.server.Request getRequest()`
- `public org.eclipse.jetty.server.RequestLog getRequestLog()`
- `public long getRequests()`
- `public org.eclipse.jetty.server.Response getResponse()`
- `public org.eclipse.jetty.util.thread.Scheduler getScheduler()`
- `public org.eclipse.jetty.server.Server getServer()`
- `public org.eclipse.jetty.util.HostPort getServerAuthority()`
- `public org.eclipse.jetty.server.HttpChannelState getState()`
- `public java.util.List getTransientListeners()`
- `public org.eclipse.jetty.io.EndPoint getTunnellingEndPoint()`
- `public boolean handle()`
- `protected void handleException(java.lang.Throwable p0)`
- `public boolean isCommitted()`
- `public boolean isExpecting100Continue()`
- `public boolean isExpecting102Processing()`
- `public boolean isPersistent()`
- `public boolean isRequestCompleted()`
- `public boolean isResponseCompleted()`
- `public boolean isSendError()`
- `public boolean isTunnellingSupported()`
- `public boolean isUseInputDirectByteBuffers()`
- `public boolean isUseOutputDirectByteBuffers()`
- `public abstract boolean needContent()`
- `protected org.eclipse.jetty.server.HttpOutput newHttpOutput()`
- `public void onBadMessage(org.eclipse.jetty.http.BadMessageException p0)`
- `public void onCompleted()`
- `public boolean onContent(org.eclipse.jetty.server.HttpInput$Content p0)`
- `public boolean onContentComplete()`
- `public void onRequest(org.eclipse.jetty.http.MetaData$Request p0)`
- `public boolean onRequestComplete()`
- `public void onTrailers(org.eclipse.jetty.http.HttpFields p0)`
- `public abstract org.eclipse.jetty.server.HttpInput$Content produceContent()`
- `public void recycle()`
- `public boolean removeListener(org.eclipse.jetty.server.HttpChannel$Listener p0)`
- `public void resetBuffer()`
- `public void run()`
- `public boolean sendErrorOrAbort(java.lang.String p0)`
- `public boolean sendResponse(org.eclipse.jetty.http.MetaData$Response p0, java.nio.ByteBuffer p1, boolean p2) throws java.io.IOException`
- `protected boolean sendResponse(org.eclipse.jetty.http.MetaData$Response p0, java.nio.ByteBuffer p1, boolean p2, org.eclipse.jetty.util.Callback p3)`
- `public void sendResponseAndComplete()`
- `public void setIdleTimeout(long p0)`
- `public void setRequestLog(org.eclipse.jetty.server.RequestLog p0)`
- `public java.lang.String toString()`
- `protected java.lang.Throwable unwrap(java.lang.Throwable p0, java.lang.Class... p1)`
- `public void write(java.nio.ByteBuffer p0, boolean p1, org.eclipse.jetty.util.Callback p2)`

---

## public abstract static interface `org.eclipse.jetty.server.HttpChannel$Listener`
implements `java.util.EventListener`  

**Methods:**
- `public default void onAfterDispatch(org.eclipse.jetty.server.Request p0)`
- `public default void onBeforeDispatch(org.eclipse.jetty.server.Request p0)`
- `public default void onComplete(org.eclipse.jetty.server.Request p0)`
- `public default void onDispatchFailure(org.eclipse.jetty.server.Request p0, java.lang.Throwable p1)`
- `public default void onRequestBegin(org.eclipse.jetty.server.Request p0)`
- `public default void onRequestContent(org.eclipse.jetty.server.Request p0, java.nio.ByteBuffer p1)`
- `public default void onRequestContentEnd(org.eclipse.jetty.server.Request p0)`
- `public default void onRequestEnd(org.eclipse.jetty.server.Request p0)`
- `public default void onRequestFailure(org.eclipse.jetty.server.Request p0, java.lang.Throwable p1)`
- `public default void onRequestTrailers(org.eclipse.jetty.server.Request p0)`
- `public default void onResponseBegin(org.eclipse.jetty.server.Request p0)`
- `public default void onResponseCommit(org.eclipse.jetty.server.Request p0)`
- `public default void onResponseContent(org.eclipse.jetty.server.Request p0, java.nio.ByteBuffer p1)`
- `public default void onResponseEnd(org.eclipse.jetty.server.Request p0)`
- `public default void onResponseFailure(org.eclipse.jetty.server.Request p0, java.lang.Throwable p1)`

---

## public static class `org.eclipse.jetty.server.HttpChannel$TransientListeners`
annotations: @java.lang.Deprecated  
implements `org.eclipse.jetty.server.HttpChannel$Listener`  

**Constructors:**
- `public TransientListeners()`

**Methods:**
- `public void onAfterDispatch(org.eclipse.jetty.server.Request p0)`
- `public void onBeforeDispatch(org.eclipse.jetty.server.Request p0)`
- `public void onComplete(org.eclipse.jetty.server.Request p0)`
- `public void onDispatchFailure(org.eclipse.jetty.server.Request p0, java.lang.Throwable p1)`
- `public void onRequestBegin(org.eclipse.jetty.server.Request p0)`
- `public void onRequestContent(org.eclipse.jetty.server.Request p0, java.nio.ByteBuffer p1)`
- `public void onRequestContentEnd(org.eclipse.jetty.server.Request p0)`
- `public void onRequestEnd(org.eclipse.jetty.server.Request p0)`
- `public void onRequestFailure(org.eclipse.jetty.server.Request p0, java.lang.Throwable p1)`
- `public void onRequestTrailers(org.eclipse.jetty.server.Request p0)`
- `public void onResponseBegin(org.eclipse.jetty.server.Request p0)`
- `public void onResponseCommit(org.eclipse.jetty.server.Request p0)`
- `public void onResponseContent(org.eclipse.jetty.server.Request p0, java.nio.ByteBuffer p1)`
- `public void onResponseEnd(org.eclipse.jetty.server.Request p0)`
- `public void onResponseFailure(org.eclipse.jetty.server.Request p0, java.lang.Throwable p1)`

---

## public class `org.eclipse.jetty.server.HttpChannelListeners`
implements `org.eclipse.jetty.server.HttpChannel$Listener`  

**Constructors:**
- `public HttpChannelListeners(java.util.Collection p0)`

**Fields:**
- `public static org.eclipse.jetty.server.HttpChannel$Listener NOOP`

**Methods:**
- `public void onAfterDispatch(org.eclipse.jetty.server.Request p0)`
- `public void onBeforeDispatch(org.eclipse.jetty.server.Request p0)`
- `public void onComplete(org.eclipse.jetty.server.Request p0)`
- `public void onDispatchFailure(org.eclipse.jetty.server.Request p0, java.lang.Throwable p1)`
- `public void onRequestBegin(org.eclipse.jetty.server.Request p0)`
- `public void onRequestContent(org.eclipse.jetty.server.Request p0, java.nio.ByteBuffer p1)`
- `public void onRequestContentEnd(org.eclipse.jetty.server.Request p0)`
- `public void onRequestEnd(org.eclipse.jetty.server.Request p0)`
- `public void onRequestFailure(org.eclipse.jetty.server.Request p0, java.lang.Throwable p1)`
- `public void onRequestTrailers(org.eclipse.jetty.server.Request p0)`
- `public void onResponseBegin(org.eclipse.jetty.server.Request p0)`
- `public void onResponseCommit(org.eclipse.jetty.server.Request p0)`
- `public void onResponseContent(org.eclipse.jetty.server.Request p0, java.nio.ByteBuffer p1)`
- `public void onResponseEnd(org.eclipse.jetty.server.Request p0)`
- `public void onResponseFailure(org.eclipse.jetty.server.Request p0, java.lang.Throwable p1)`

---

## public class `org.eclipse.jetty.server.HttpChannelOverHttp`
extends `org.eclipse.jetty.server.HttpChannel`  
implements `org.eclipse.jetty.http.ComplianceViolation$Listener`, `org.eclipse.jetty.http.HttpParser$RequestHandler`  

**Constructors:**
- `public HttpChannelOverHttp(org.eclipse.jetty.server.HttpConnection p0, org.eclipse.jetty.server.Connector p1, org.eclipse.jetty.server.HttpConfiguration p2, org.eclipse.jetty.io.EndPoint p3, org.eclipse.jetty.server.HttpTransport p4)`

**Methods:**
- `public void abort(java.lang.Throwable p0)`
- `public void badMessage(org.eclipse.jetty.http.BadMessageException p0)`
- `protected boolean checkAndPrepareUpgrade()`
- `public boolean content(java.nio.ByteBuffer p0)`
- `public boolean contentComplete()`
- `public void continue100(int p0) throws java.io.IOException`
- `public void earlyEOF()`
- `protected boolean eof()`
- `public boolean failAllContent(java.lang.Throwable p0)`
- `public boolean failed(java.lang.Throwable p0)`
- `public org.eclipse.jetty.io.EndPoint getTunnellingEndPoint()`
- `protected void handleException(java.lang.Throwable p0)`
- `public boolean headerComplete()`
- `public boolean isExpecting100Continue()`
- `public boolean isExpecting102Processing()`
- `public boolean isTunnellingSupported()`
- `public boolean isUseOutputDirectByteBuffers()`
- `public boolean messageComplete()`
- `public boolean needContent()`
- `public void onComplianceViolation(org.eclipse.jetty.http.ComplianceViolation$Mode p0, org.eclipse.jetty.http.ComplianceViolation p1, java.lang.String p2)`
- `public void parsedHeader(org.eclipse.jetty.http.HttpField p0)`
- `public void parsedTrailer(org.eclipse.jetty.http.HttpField p0)`
- `public org.eclipse.jetty.server.HttpInput$Content produceContent()`
- `public void recycle()`
- `public void servletUpgrade()`
- `public void startRequest(java.lang.String p0, java.lang.String p1, org.eclipse.jetty.http.HttpVersion p2)`

---

## public class `org.eclipse.jetty.server.HttpChannelState`

**Constructors:**
- `protected HttpChannelState(org.eclipse.jetty.server.HttpChannel p0)`

**Methods:**
- `public boolean abortResponse()`
- `public void addListener(jakarta.servlet.AsyncListener p0)`
- `public void asyncError(java.lang.Throwable p0)`
- `protected void cancelTimeout()`
- `protected void cancelTimeout(org.eclipse.jetty.server.AsyncContextEvent p0)`
- `public boolean commitResponse()`
- `public void complete()`
- `public boolean completeResponse()`
- `protected void completed(java.lang.Throwable p0)`
- `protected void completing()`
- `public void dispatch(jakarta.servlet.ServletContext p0, java.lang.String p1)`
- `public org.eclipse.jetty.server.AsyncContextEvent getAsyncContextEvent()`
- `public java.lang.Object getAttribute(java.lang.String p0)`
- `public org.eclipse.jetty.server.Request getBaseRequest()`
- `public org.eclipse.jetty.server.handler.ContextHandler getContextHandler()`
- `public org.eclipse.jetty.server.HttpChannel getHttpChannel()`
- `public jakarta.servlet.ServletResponse getServletResponse()`
- `public jakarta.servlet.ServletResponse getServletResponse(org.eclipse.jetty.server.AsyncContextEvent p0)`
- `public org.eclipse.jetty.server.HttpChannelState$State getState()`
- `public java.lang.String getStatusString()`
- `public long getTimeout()`
- `public org.eclipse.jetty.server.HttpChannelState$Action handling()`
- `public boolean hasListener(jakarta.servlet.AsyncListener p0)`
- `public boolean isAsync()`
- `public boolean isAsyncStarted()`
- `public boolean isExpired()`
- `public boolean isIdle()`
- `public boolean isInitial()`
- `public boolean isInputUnready()`
- `public boolean isResponseCommitted()`
- `public boolean isResponseCompleted()`
- `public boolean isSendError()`
- `public boolean isSuspended()`
- `public void onContentAdded()`
- `protected void onError(java.lang.Throwable p0)`
- `public boolean onReadEof()`
- `public void onReadIdle()`
- `public boolean onReadReady()`
- `public void onReadUnready()`
- `protected void onTimeout()`
- `public boolean onWritePossible()`
- `public boolean partialResponse()`
- `protected void recycle()`
- `public void removeAttribute(java.lang.String p0)`
- `protected void scheduleDispatch()`
- `public void sendError(int p0, java.lang.String p1)`
- `public void setAttribute(java.lang.String p0, java.lang.Object p1)`
- `public void setTimeout(long p0)`
- `public void startAsync(org.eclipse.jetty.server.AsyncContextEvent p0)`
- `protected void timeout()`
- `public java.lang.String toString()`
- `protected org.eclipse.jetty.server.HttpChannelState$Action unhandle()`
- `public void upgrade()`

---

## public final static enum `org.eclipse.jetty.server.HttpChannelState$Action`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.eclipse.jetty.server.HttpChannelState$Action ASYNC_DISPATCH`
- `public final static org.eclipse.jetty.server.HttpChannelState$Action ASYNC_ERROR`
- `public final static org.eclipse.jetty.server.HttpChannelState$Action ASYNC_TIMEOUT`
- `public final static org.eclipse.jetty.server.HttpChannelState$Action COMPLETE`
- `public final static org.eclipse.jetty.server.HttpChannelState$Action DISPATCH`
- `public final static org.eclipse.jetty.server.HttpChannelState$Action READ_CALLBACK`
- `public final static org.eclipse.jetty.server.HttpChannelState$Action SEND_ERROR`
- `public final static org.eclipse.jetty.server.HttpChannelState$Action TERMINATED`
- `public final static org.eclipse.jetty.server.HttpChannelState$Action WAIT`
- `public final static org.eclipse.jetty.server.HttpChannelState$Action WRITE_CALLBACK`

---

## public final static enum `org.eclipse.jetty.server.HttpChannelState$State`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.eclipse.jetty.server.HttpChannelState$State HANDLING`
- `public final static org.eclipse.jetty.server.HttpChannelState$State IDLE`
- `public final static org.eclipse.jetty.server.HttpChannelState$State UPGRADED`
- `public final static org.eclipse.jetty.server.HttpChannelState$State WAITING`
- `public final static org.eclipse.jetty.server.HttpChannelState$State WOKEN`

---

## public class `org.eclipse.jetty.server.HttpConfiguration`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
implements `org.eclipse.jetty.util.component.Dumpable`  

**Constructors:**
- `public HttpConfiguration()`
- `public HttpConfiguration(org.eclipse.jetty.server.HttpConfiguration p0)`

**Fields:**
- `public final static java.lang.String SERVER_VERSION`

**Methods:**
- `public void addCustomizer(org.eclipse.jetty.server.HttpConfiguration$Customizer p0)`
- `public void addFormEncodedMethod(java.lang.String p0)`
- `public java.lang.String dump()`
- `public void dump(java.lang.Appendable p0, java.lang.String p1) throws java.io.IOException`
- `public <T extends java.lang.Object> T getCustomizer(java.lang.Class p0)`
- `public java.util.List getCustomizers()`
- `public java.util.Set getFormEncodedMethods()`
- `public int getHeaderCacheSize()`
- `public org.eclipse.jetty.http.HttpCompliance getHttpCompliance()`
- `public long getIdleTimeout()`
- `public java.net.SocketAddress getLocalAddress()`
- `public int getMaxErrorDispatches()`
- `public long getMinRequestDataRate()`
- `public long getMinResponseDataRate()`
- `public org.eclipse.jetty.server.MultiPartFormDataCompliance getMultipartFormDataCompliance()`
- `public int getOutputAggregationSize()`
- `public int getOutputBufferSize()`
- `public org.eclipse.jetty.http.CookieCompliance getRequestCookieCompliance()`
- `public int getRequestHeaderSize()`
- `public org.eclipse.jetty.http.CookieCompliance getResponseCookieCompliance()`
- `public int getResponseHeaderSize()`
- `public int getSecurePort()`
- `public java.lang.String getSecureScheme()`
- `public boolean getSendDateHeader()`
- `public boolean getSendServerVersion()`
- `public boolean getSendXPoweredBy()`
- `public org.eclipse.jetty.util.HostPort getServerAuthority()`
- `public org.eclipse.jetty.http.UriCompliance getUriCompliance()`
- `public boolean isDelayDispatchUntilContent()`
- `public boolean isFormEncodedMethod(java.lang.String p0)`
- `public boolean isHeaderCacheCaseSensitive()`
- `public boolean isNotifyRemoteAsyncErrors()`
- `public boolean isPersistentConnectionsEnabled()`
- `public boolean isRelativeRedirectAllowed()`
- `public boolean isUseInputDirectByteBuffers()`
- `public boolean isUseOutputDirectByteBuffers()`
- `public void setCustomizers(java.util.List p0)`
- `public void setDelayDispatchUntilContent(boolean p0)`
- `public void setFormEncodedMethods(java.lang.String... p0)`
- `public void setHeaderCacheCaseSensitive(boolean p0)`
- `public void setHeaderCacheSize(int p0)`
- `public void setHttpCompliance(org.eclipse.jetty.http.HttpCompliance p0)`
- `public void setIdleTimeout(long p0)`
- `public void setLocalAddress(java.net.SocketAddress p0)`
- `public void setMaxErrorDispatches(int p0)`
- `public void setMinRequestDataRate(long p0)`
- `public void setMinResponseDataRate(long p0)`
- `public void setMultiPartFormDataCompliance(org.eclipse.jetty.server.MultiPartFormDataCompliance p0)`
- `public void setNotifyRemoteAsyncErrors(boolean p0)`
- `public void setOutputAggregationSize(int p0)`
- `public void setOutputBufferSize(int p0)`
- `public void setPersistentConnectionsEnabled(boolean p0)`
- `public void setRelativeRedirectAllowed(boolean p0)`
- `public void setRequestCookieCompliance(org.eclipse.jetty.http.CookieCompliance p0)`
- `public void setRequestHeaderSize(int p0)`
- `public void setResponseCookieCompliance(org.eclipse.jetty.http.CookieCompliance p0)`
- `public void setResponseHeaderSize(int p0)`
- `public void setSecurePort(int p0)`
- `public void setSecureScheme(java.lang.String p0)`
- `public void setSendDateHeader(boolean p0)`
- `public void setSendServerVersion(boolean p0)`
- `public void setSendXPoweredBy(boolean p0)`
- `public void setServerAuthority(org.eclipse.jetty.util.HostPort p0)`
- `public void setUriCompliance(org.eclipse.jetty.http.UriCompliance p0)`
- `public void setUseInputDirectByteBuffers(boolean p0)`
- `public void setUseOutputDirectByteBuffers(boolean p0)`
- `public java.lang.String toString()`
- `public void writePoweredBy(java.lang.Appendable p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException`

---

## public abstract static interface `org.eclipse.jetty.server.HttpConfiguration$ConnectionFactory`

**Methods:**
- `public abstract org.eclipse.jetty.server.HttpConfiguration getHttpConfiguration()`

---

## public abstract static interface `org.eclipse.jetty.server.HttpConfiguration$Customizer`

**Methods:**
- `public abstract void customize(org.eclipse.jetty.server.Connector p0, org.eclipse.jetty.server.HttpConfiguration p1, org.eclipse.jetty.server.Request p2)`

---

## public class `org.eclipse.jetty.server.HttpConnection`
extends `org.eclipse.jetty.io.AbstractConnection`  
implements `java.lang.Runnable`, `org.eclipse.jetty.io.Connection$UpgradeFrom`, `org.eclipse.jetty.io.Connection$UpgradeTo`, `org.eclipse.jetty.io.WriteFlusher$Listener`, `org.eclipse.jetty.server.HttpTransport`  

**Constructors:**
- `public HttpConnection(org.eclipse.jetty.server.HttpConfiguration p0, org.eclipse.jetty.server.Connector p1, org.eclipse.jetty.io.EndPoint p2, boolean p3)`

**Fields:**
- `public final static org.eclipse.jetty.http.HttpField CONNECTION_CLOSE`

**Methods:**
- `public void abort(java.lang.Throwable p0)`
- `public void asyncReadFillInterested()`
- `public long getBytesIn()`
- `public long getBytesOut()`
- `public org.eclipse.jetty.server.Connector getConnector()`
- `public static org.eclipse.jetty.server.HttpConnection getCurrentConnection()`
- `public org.eclipse.jetty.http.HttpGenerator getGenerator()`
- `public org.eclipse.jetty.server.HttpChannel getHttpChannel()`
- `public org.eclipse.jetty.server.HttpConfiguration getHttpConfiguration()`
- `public long getMessagesIn()`
- `public long getMessagesOut()`
- `public org.eclipse.jetty.http.HttpParser getParser()`
- `public org.eclipse.jetty.server.Server getServer()`
- `public boolean isPushSupported()`
- `public boolean isRecordHttpComplianceViolations()`
- `public boolean isRequestBufferEmpty()`
- `public boolean isUseInputDirectByteBuffers()`
- `public boolean isUseOutputDirectByteBuffers()`
- `protected org.eclipse.jetty.server.HttpChannelOverHttp newHttpChannel()`
- `protected org.eclipse.jetty.http.HttpGenerator newHttpGenerator()`
- `protected org.eclipse.jetty.http.HttpParser newHttpParser(org.eclipse.jetty.http.HttpCompliance p0)`
- `protected org.eclipse.jetty.http.HttpParser$RequestHandler newRequestHandler()`
- `public void onClose(java.lang.Throwable p0)`
- `public void onCompleted()`
- `protected void onFillInterestedFailed(java.lang.Throwable p0)`
- `public void onFillable()`
- `public void onFlushed(long p0) throws java.io.IOException`
- `public void onOpen()`
- `protected boolean onReadTimeout(java.lang.Throwable p0)`
- `public java.nio.ByteBuffer onUpgradeFrom()`
- `public void onUpgradeTo(java.nio.ByteBuffer p0)`
- `public void push(org.eclipse.jetty.http.MetaData$Request p0)`
- `public void run()`
- `public void send(org.eclipse.jetty.http.MetaData$Request p0, org.eclipse.jetty.http.MetaData$Response p1, java.nio.ByteBuffer p2, boolean p3, org.eclipse.jetty.util.Callback p4)`
- `protected static org.eclipse.jetty.server.HttpConnection setCurrentConnection(org.eclipse.jetty.server.HttpConnection p0)`
- `public void setUseInputDirectByteBuffers(boolean p0)`
- `public void setUseOutputDirectByteBuffers(boolean p0)`
- `public java.lang.String toConnectionString()`

---

## public class `org.eclipse.jetty.server.HttpConnectionFactory`
extends `org.eclipse.jetty.server.AbstractConnectionFactory`  
implements `org.eclipse.jetty.server.HttpConfiguration$ConnectionFactory`  

**Constructors:**
- `public HttpConnectionFactory()`
- `public HttpConnectionFactory(org.eclipse.jetty.server.HttpConfiguration p0)`

**Methods:**
- `public org.eclipse.jetty.server.HttpConfiguration getHttpConfiguration()`
- `public boolean isRecordHttpComplianceViolations()`
- `public boolean isUseInputDirectByteBuffers()`
- `public boolean isUseOutputDirectByteBuffers()`
- `public org.eclipse.jetty.io.Connection newConnection(org.eclipse.jetty.server.Connector p0, org.eclipse.jetty.io.EndPoint p1)`
- `public void setRecordHttpComplianceViolations(boolean p0)`
- `public void setUseInputDirectByteBuffers(boolean p0)`
- `public void setUseOutputDirectByteBuffers(boolean p0)`

---

## public class `org.eclipse.jetty.server.HttpInput`
extends `jakarta.servlet.ServletInputStream`  
implements `java.lang.Runnable`  

**Constructors:**
- `public HttpInput(org.eclipse.jetty.server.HttpChannelState p0)`

**Methods:**
- `public void addInterceptor(org.eclipse.jetty.server.HttpInput$Interceptor p0)`
- `public int available()`
- `public boolean consumeAll()`
- `public long getContentConsumed()`
- `public long getContentReceived()`
- `public org.eclipse.jetty.server.HttpInput$Interceptor getInterceptor()`
- `public boolean hasContent()`
- `public boolean isAsync()`
- `public boolean isError()`
- `public boolean isFinished()`
- `public boolean isReady()`
- `public boolean onContentProducible()`
- `public int read() throws java.io.IOException`
- `public int read(byte[] p0, int p1, int p2) throws java.io.IOException`
- `public int read(java.nio.ByteBuffer p0) throws java.io.IOException`
- `public void recycle()`
- `public void reopen()`
- `public void run()`
- `public void setInterceptor(org.eclipse.jetty.server.HttpInput$Interceptor p0)`
- `public void setReadListener(jakarta.servlet.ReadListener p0)`
- `public java.lang.String toString()`

---

## public static class `org.eclipse.jetty.server.HttpInput$Content`
implements `org.eclipse.jetty.util.Callback`  

**Constructors:**
- `public Content(java.nio.ByteBuffer p0)`

**Fields:**
- `protected final java.nio.ByteBuffer _content`

**Methods:**
- `public int get(byte[] p0, int p1, int p2)`
- `public java.nio.ByteBuffer getByteBuffer()`
- `public java.lang.Throwable getError()`
- `public org.eclipse.jetty.util.thread.Invocable$InvocationType getInvocationType()`
- `public boolean hasContent()`
- `public boolean isEmpty()`
- `public boolean isEof()`
- `public boolean isSpecial()`
- `public int remaining()`
- `public int skip(int p0)`
- `public java.lang.String toString()`

---

## public final static class `org.eclipse.jetty.server.HttpInput$EofContent`
extends `org.eclipse.jetty.server.HttpInput$SpecialContent`  

**Constructors:**
- `public EofContent()`

**Methods:**
- `public boolean isEof()`
- `public java.lang.String toString()`

---

## public final static class `org.eclipse.jetty.server.HttpInput$ErrorContent`
extends `org.eclipse.jetty.server.HttpInput$SpecialContent`  

**Constructors:**
- `public ErrorContent(java.lang.Throwable p0)`

**Methods:**
- `public java.lang.Throwable getError()`
- `public java.lang.String toString()`

---

## public abstract static interface `org.eclipse.jetty.server.HttpInput$Interceptor`

**Methods:**
- `public abstract org.eclipse.jetty.server.HttpInput$Content readFrom(org.eclipse.jetty.server.HttpInput$Content p0)`

---

## public abstract static class `org.eclipse.jetty.server.HttpInput$SpecialContent`
extends `org.eclipse.jetty.server.HttpInput$Content`  

**Constructors:**
- `public SpecialContent()`

**Methods:**
- `public final int get(byte[] p0, int p1, int p2)`
- `public final java.nio.ByteBuffer getByteBuffer()`
- `public final boolean hasContent()`
- `public final boolean isEmpty()`
- `public final boolean isSpecial()`
- `public final int remaining()`
- `public final int skip(int p0)`

---

## public static class `org.eclipse.jetty.server.HttpInput$WrappingContent`
extends `org.eclipse.jetty.server.HttpInput$Content`  

**Constructors:**
- `public WrappingContent(org.eclipse.jetty.server.HttpInput$Content p0, boolean p1)`

**Methods:**
- `public void failed(java.lang.Throwable p0)`
- `public org.eclipse.jetty.util.thread.Invocable$InvocationType getInvocationType()`
- `public boolean isEof()`
- `public void succeeded()`

---

## public class `org.eclipse.jetty.server.HttpOutput`
extends `jakarta.servlet.ServletOutputStream`  
implements `java.lang.Runnable`  

**Constructors:**
- `public HttpOutput(org.eclipse.jetty.server.HttpChannel p0)`

**Methods:**
- `protected org.eclipse.jetty.util.SharedBlockingCallback$Blocker acquireWriteBlockingCallback() throws java.io.IOException`
- `public void close() throws java.io.IOException`
- `public void complete(org.eclipse.jetty.util.Callback p0)`
- `public void completed(java.lang.Throwable p0)`
- `public void flush() throws java.io.IOException`
- `public java.nio.ByteBuffer getBuffer()`
- `public int getBufferSize()`
- `public org.eclipse.jetty.server.HttpChannel getHttpChannel()`
- `public org.eclipse.jetty.server.HttpOutput$Interceptor getInterceptor()`
- `public long getWritten()`
- `public boolean isAsync()`
- `public boolean isClosed()`
- `public boolean isReady()`
- `public boolean isWritten()`
- `public void onFlushed(long p0) throws java.io.IOException`
- `public void print(java.lang.String p0) throws java.io.IOException`
- `public void println(java.lang.String p0) throws java.io.IOException`
- `public void recycle()`
- `public void reopen()`
- `public void resetBuffer()`
- `public void run()`
- `public void sendContent(java.io.InputStream p0) throws java.io.IOException`
- `public void sendContent(java.io.InputStream p0, org.eclipse.jetty.util.Callback p1)`
- `public void sendContent(java.nio.ByteBuffer p0) throws java.io.IOException`
- `public void sendContent(java.nio.ByteBuffer p0, org.eclipse.jetty.util.Callback p1)`
- `public void sendContent(java.nio.channels.ReadableByteChannel p0) throws java.io.IOException`
- `public void sendContent(java.nio.channels.ReadableByteChannel p0, org.eclipse.jetty.util.Callback p1)`
- `public void sendContent(org.eclipse.jetty.http.HttpContent p0) throws java.io.IOException`
- `public void sendContent(org.eclipse.jetty.http.HttpContent p0, org.eclipse.jetty.util.Callback p1)`
- `public void setBufferSize(int p0)`
- `public void setInterceptor(org.eclipse.jetty.server.HttpOutput$Interceptor p0)`
- `public void setWriteListener(jakarta.servlet.WriteListener p0)`
- `public void softClose()`
- `public java.lang.String toString()`
- `public void write(byte[] p0, int p1, int p2) throws java.io.IOException`
- `public void write(int p0) throws java.io.IOException`
- `public void write(java.nio.ByteBuffer p0) throws java.io.IOException`

---

## public abstract static interface `org.eclipse.jetty.server.HttpOutput$Interceptor`

**Methods:**
- `public abstract org.eclipse.jetty.server.HttpOutput$Interceptor getNextInterceptor()`
- `public default void resetBuffer() throws java.lang.IllegalStateException`
- `public abstract void write(java.nio.ByteBuffer p0, boolean p1, org.eclipse.jetty.util.Callback p2)`

---

## public abstract interface `org.eclipse.jetty.server.HttpTransport`

**Fields:**
- `public final static java.lang.String UPGRADE_CONNECTION_ATTRIBUTE`

**Methods:**
- `public abstract void abort(java.lang.Throwable p0)`
- `public abstract boolean isPushSupported()`
- `public abstract void onCompleted()`
- `public abstract void push(org.eclipse.jetty.http.MetaData$Request p0)`
- `public abstract void send(org.eclipse.jetty.http.MetaData$Request p0, org.eclipse.jetty.http.MetaData$Response p1, java.nio.ByteBuffer p2, boolean p3, org.eclipse.jetty.util.Callback p4)`

---

## public abstract class `org.eclipse.jetty.server.HttpWriter`
extends `java.io.Writer`  

**Constructors:**
- `public HttpWriter(org.eclipse.jetty.server.HttpOutput p0)`

**Fields:**
- `public final static int MAX_OUTPUT_CHARS`

**Methods:**
- `public void close() throws java.io.IOException`
- `public void complete(org.eclipse.jetty.util.Callback p0)`
- `public void flush() throws java.io.IOException`
- `public void write(char[] p0, int p1, int p2) throws java.io.IOException`
- `public void write(java.lang.String p0, int p1, int p2) throws java.io.IOException`

---

## public class `org.eclipse.jetty.server.InclusiveByteRange`

**Constructors:**
- `public InclusiveByteRange(long p0, long p1)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public long getFirst()`
- `public long getLast()`
- `public long getSize()`
- `public int hashCode()`
- `public static java.util.List satisfiableRanges(java.util.Enumeration p0, long p1)`
- `public static java.lang.String to416HeaderRangeString(long p0)`
- `public java.lang.String toHeaderRangeString(long p0)`
- `public java.lang.String toString()`

---

## public class `org.eclipse.jetty.server.Iso88591HttpWriter`
extends `org.eclipse.jetty.server.HttpWriter`  

**Constructors:**
- `public Iso88591HttpWriter(org.eclipse.jetty.server.HttpOutput p0)`

**Methods:**
- `public void write(char[] p0, int p1, int p2) throws java.io.IOException`

---

## public class `org.eclipse.jetty.server.LocalConnector`
extends `org.eclipse.jetty.server.AbstractConnector`  

**Constructors:**
- `public LocalConnector(org.eclipse.jetty.server.Server p0)`
- `public LocalConnector(org.eclipse.jetty.server.Server p0, java.util.concurrent.Executor p1, org.eclipse.jetty.util.thread.Scheduler p2, org.eclipse.jetty.io.ByteBufferPool p3, int p4, org.eclipse.jetty.server.ConnectionFactory... p5)`
- `public LocalConnector(org.eclipse.jetty.server.Server p0, org.eclipse.jetty.server.ConnectionFactory p1)`
- `public LocalConnector(org.eclipse.jetty.server.Server p0, org.eclipse.jetty.server.ConnectionFactory p1, org.eclipse.jetty.util.ssl.SslContextFactory$Server p2)`
- `public LocalConnector(org.eclipse.jetty.server.Server p0, org.eclipse.jetty.util.ssl.SslContextFactory$Server p1)`

**Methods:**
- `protected void accept(int p0) throws java.lang.InterruptedException`
- `public org.eclipse.jetty.server.LocalConnector$LocalEndPoint connect()`
- `public org.eclipse.jetty.server.LocalConnector$LocalEndPoint executeRequest(java.lang.String p0)`
- `public java.lang.String getResponse(java.lang.String p0) throws java.lang.Exception`
- `public java.lang.String getResponse(java.lang.String p0, boolean p1, long p2, java.util.concurrent.TimeUnit p3) throws java.lang.Exception`
- `public java.lang.String getResponse(java.lang.String p0, long p1, java.util.concurrent.TimeUnit p2) throws java.lang.Exception`
- `public java.nio.ByteBuffer getResponse(java.nio.ByteBuffer p0) throws java.lang.Exception`
- `public java.nio.ByteBuffer getResponse(java.nio.ByteBuffer p0, boolean p1, long p2, java.util.concurrent.TimeUnit p3) throws java.lang.Exception`
- `public java.nio.ByteBuffer getResponse(java.nio.ByteBuffer p0, long p1, java.util.concurrent.TimeUnit p2) throws java.lang.Exception`
- `public java.lang.Object getTransport()`

---

## public class `org.eclipse.jetty.server.LocalConnector$LocalEndPoint`
extends `org.eclipse.jetty.io.ByteArrayEndPoint`  

**Constructors:**
- `public LocalEndPoint()`

**Methods:**
- `public void doShutdownOutput()`
- `protected void execute(java.lang.Runnable p0)`
- `public java.lang.String getResponse() throws java.lang.Exception`
- `public java.lang.String getResponse(boolean p0, long p1, java.util.concurrent.TimeUnit p2) throws java.lang.Exception`
- `public java.nio.ByteBuffer getResponseData()`
- `public void onClose(java.lang.Throwable p0)`
- `public java.nio.ByteBuffer waitForResponse(boolean p0, long p1, java.util.concurrent.TimeUnit p2) throws java.lang.Exception`
- `public void waitUntilClosed()`
- `public void waitUntilClosedOrIdleFor(long p0, java.util.concurrent.TimeUnit p1)`

---

## public class `org.eclipse.jetty.server.LowResourceMonitor`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.util.component.ContainerLifeCycle`  

**Constructors:**
- `public LowResourceMonitor(org.eclipse.jetty.server.Server p0)`

**Fields:**
- `protected final org.eclipse.jetty.server.Server _server`

**Methods:**
- `public void addLowResourceCheck(org.eclipse.jetty.server.LowResourceMonitor$LowResourceCheck p0)`
- `protected void clearLowResources()`
- `protected void doStart() throws java.lang.Exception`
- `protected void doStop() throws java.lang.Exception`
- `protected boolean enableLowOnResources(boolean p0, boolean p1)`
- `public java.util.Set getLowResourceChecks()`
- `public int getLowResourcesIdleTimeout()`
- `public java.lang.String getLowResourcesReasons()`
- `public long getLowResourcesStarted()`
- `public int getMaxLowResourcesTime()`
- `public long getMaxMemory()`
- `public boolean getMonitorThreads()`
- `public java.util.Collection getMonitoredConnectors()`
- `protected org.eclipse.jetty.server.Connector[] getMonitoredOrServerConnectors()`
- `public int getPeriod()`
- `public java.lang.String getReasons()`
- `public boolean isAcceptingInLowResources()`
- `public boolean isLowOnResources()`
- `protected java.lang.String low(java.lang.String p0, java.lang.String p1)`
- `protected void monitor()`
- `public void setAcceptingInLowResources(boolean p0)`
- `public void setLowResourceChecks(java.util.Set p0)`
- `protected void setLowResources()`
- `public void setLowResourcesIdleTimeout(int p0)`
- `protected void setLowResourcesReasons(java.lang.String p0)`
- `public void setLowResourcesStarted(long p0)`
- `public void setMaxLowResourcesTime(int p0)`
- `public void setMaxMemory(long p0)`
- `public void setMonitorThreads(boolean p0)`
- `public void setMonitoredConnectors(java.util.Collection p0)`
- `public void setPeriod(int p0)`
- `protected void setReasons(java.lang.String p0)`

---

## public class `org.eclipse.jetty.server.LowResourceMonitor$ConnectorsThreadPoolLowResourceCheck`
implements `org.eclipse.jetty.server.LowResourceMonitor$LowResourceCheck`  

**Constructors:**
- `public ConnectorsThreadPoolLowResourceCheck()`

**Methods:**
- `public java.lang.String getReason()`
- `public boolean isLowOnResources()`
- `public java.lang.String toString()`

---

## public abstract static interface `org.eclipse.jetty.server.LowResourceMonitor$LowResourceCheck`

**Methods:**
- `public abstract java.lang.String getReason()`
- `public abstract boolean isLowOnResources()`

---

## public class `org.eclipse.jetty.server.LowResourceMonitor$MainThreadPoolLowResourceCheck`
implements `org.eclipse.jetty.server.LowResourceMonitor$LowResourceCheck`  

**Constructors:**
- `public MainThreadPoolLowResourceCheck()`

**Methods:**
- `public java.lang.String getReason()`
- `public boolean isLowOnResources()`
- `public java.lang.String toString()`

---

## public class `org.eclipse.jetty.server.LowResourceMonitor$MaxConnectionsLowResourceCheck`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
implements `org.eclipse.jetty.server.LowResourceMonitor$LowResourceCheck`  

**Constructors:**
- `public MaxConnectionsLowResourceCheck(int p0)`

**Methods:**
- `public java.lang.String getReason()`
- `public boolean isLowOnResources()`
- `public java.lang.String toString()`

---

## public class `org.eclipse.jetty.server.LowResourceMonitor$MemoryLowResourceCheck`
implements `org.eclipse.jetty.server.LowResourceMonitor$LowResourceCheck`  

**Constructors:**
- `public MemoryLowResourceCheck(long p0)`

**Methods:**
- `public long getMaxMemory()`
- `public java.lang.String getReason()`
- `public boolean isLowOnResources()`
- `public void setMaxMemory(long p0)`
- `public java.lang.String toString()`

---

## public final enum `org.eclipse.jetty.server.MultiPartFormDataCompliance`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.eclipse.jetty.server.MultiPartFormDataCompliance LEGACY`
- `public final static org.eclipse.jetty.server.MultiPartFormDataCompliance RFC7578`

---

## public class `org.eclipse.jetty.server.MultiPartFormInputStream`

**Constructors:**
- `public MultiPartFormInputStream(java.io.InputStream p0, java.lang.String p1, jakarta.servlet.MultipartConfigElement p2, java.io.File p3)`

**Methods:**
- `public void deleteParts()`
- `public int getBufferSize()`
- `public java.util.EnumSet getNonComplianceWarnings()`
- `public jakarta.servlet.http.Part getPart(java.lang.String p0) throws java.io.IOException`
- `public java.util.Collection getParts() throws java.io.IOException`
- `public boolean isDeleteOnExit()`
- `public boolean isEmpty()`
- `public boolean isWriteFilesWithFilenames()`
- `protected void parse()`
- `public void setBufferSize(int p0)`
- `public void setDeleteOnExit(boolean p0)`
- `public void setWriteFilesWithFilenames(boolean p0)`
- `protected void throwIfError() throws java.io.IOException`

---

## public class `org.eclipse.jetty.server.MultiPartFormInputStream$MultiPart`
implements `jakarta.servlet.http.Part`  

**Constructors:**
- `public MultiPart(java.lang.String p0, java.lang.String p1)`

**Fields:**
- `protected org.eclipse.jetty.util.ByteArrayOutputStream2 _bout`
- `protected java.lang.String _contentType`
- `protected java.io.File _file`
- `protected java.lang.String _filename`
- `protected org.eclipse.jetty.util.MultiMap _headers`
- `protected java.lang.String _name`
- `protected java.io.OutputStream _out`
- `protected long _size`
- `protected boolean _temporary`

**Methods:**
- `public void cleanUp() throws java.io.IOException`
- `protected void close() throws java.io.IOException`
- `protected void createFile() throws java.io.IOException`
- `public void delete() throws java.io.IOException`
- `public byte[] getBytes()`
- `public java.lang.String getContentDispositionFilename()`
- `public java.lang.String getContentType()`
- `public java.io.File getFile()`
- `public java.lang.String getHeader(java.lang.String p0)`
- `public java.util.Collection getHeaderNames()`
- `public java.util.Collection getHeaders(java.lang.String p0)`
- `public java.io.InputStream getInputStream() throws java.io.IOException`
- `public java.lang.String getName()`
- `public long getSize()`
- `public java.lang.String getSubmittedFileName()`
- `protected void open() throws java.io.IOException`
- `protected void setContentType(java.lang.String p0)`
- `protected void setHeaders(org.eclipse.jetty.util.MultiMap p0)`
- `public java.lang.String toString()`
- `protected void write(byte[] p0, int p1, int p2) throws java.io.IOException`
- `protected void write(int p0) throws java.io.IOException`
- `public void write(java.lang.String p0) throws java.io.IOException`

---

## public class `org.eclipse.jetty.server.MultiPartInputStreamParser`
annotations: @java.lang.Deprecated  

**Constructors:**
- `public MultiPartInputStreamParser(java.io.InputStream p0, java.lang.String p1, jakarta.servlet.MultipartConfigElement p2, java.io.File p3)`

**Fields:**
- `public final static org.eclipse.jetty.util.MultiMap EMPTY_MAP`
- `public final static jakarta.servlet.MultipartConfigElement __DEFAULT_MULTIPART_CONFIG`
- `protected jakarta.servlet.MultipartConfigElement _config`
- `protected java.lang.String _contentType`
- `protected java.io.File _contextTmpDir`
- `protected java.lang.Exception _err`
- `protected java.io.InputStream _in`
- `protected boolean _parsed`
- `protected org.eclipse.jetty.util.MultiMap _parts`
- `protected java.io.File _tmpDir`
- `protected boolean _writeFilesWithFilenames`

**Methods:**
- `public void deleteParts()`
- `public java.util.EnumSet getNonComplianceWarnings()`
- `public java.util.Collection getParsedParts()`
- `public jakarta.servlet.http.Part getPart(java.lang.String p0) throws java.io.IOException`
- `public java.util.Collection getParts() throws java.io.IOException`
- `public boolean isDeleteOnExit()`
- `public boolean isWriteFilesWithFilenames()`
- `protected void parse()`
- `public void setDeleteOnExit(boolean p0)`
- `public void setWriteFilesWithFilenames(boolean p0)`
- `protected void throwIfError() throws java.io.IOException`

---

## public class `org.eclipse.jetty.server.MultiPartInputStreamParser$MultiPart`
implements `jakarta.servlet.http.Part`  

**Constructors:**
- `public MultiPart(java.lang.String p0, java.lang.String p1) throws java.io.IOException`

**Fields:**
- `protected org.eclipse.jetty.util.ByteArrayOutputStream2 _bout`
- `protected java.lang.String _contentType`
- `protected java.io.File _file`
- `protected java.lang.String _filename`
- `protected org.eclipse.jetty.util.MultiMap _headers`
- `protected java.lang.String _name`
- `protected java.io.OutputStream _out`
- `protected long _size`
- `protected boolean _temporary`

**Methods:**
- `public void cleanUp() throws java.io.IOException`
- `protected void close() throws java.io.IOException`
- `protected void createFile() throws java.io.IOException`
- `public void delete() throws java.io.IOException`
- `public byte[] getBytes()`
- `public java.lang.String getContentDispositionFilename()`
- `public java.lang.String getContentType()`
- `public java.io.File getFile()`
- `public java.lang.String getHeader(java.lang.String p0)`
- `public java.util.Collection getHeaderNames()`
- `public java.util.Collection getHeaders(java.lang.String p0)`
- `public java.io.InputStream getInputStream() throws java.io.IOException`
- `public java.lang.String getName()`
- `public long getSize()`
- `public java.lang.String getSubmittedFileName()`
- `protected void open() throws java.io.IOException`
- `protected void setContentType(java.lang.String p0)`
- `protected void setHeaders(org.eclipse.jetty.util.MultiMap p0)`
- `public java.lang.String toString()`
- `protected void write(byte[] p0, int p1, int p2) throws java.io.IOException`
- `protected void write(int p0) throws java.io.IOException`
- `public void write(java.lang.String p0) throws java.io.IOException`

---

## public class `org.eclipse.jetty.server.MultiPartParser`

**Constructors:**
- `public MultiPartParser(org.eclipse.jetty.server.MultiPartParser$Handler p0, java.lang.String p1)`

**Fields:**
- `public final static org.slf4j.Logger LOG`

**Methods:**
- `public org.eclipse.jetty.server.MultiPartParser$Handler getHandler()`
- `public org.eclipse.jetty.server.MultiPartParser$State getState()`
- `public boolean isState(org.eclipse.jetty.server.MultiPartParser$State p0)`
- `public boolean parse(java.nio.ByteBuffer p0, boolean p1)`
- `protected boolean parseMimePartHeaders(java.nio.ByteBuffer p0)`
- `protected boolean parseOctetContent(java.nio.ByteBuffer p0)`
- `public void reset()`
- `public java.lang.String toString()`

---

## public final static enum `org.eclipse.jetty.server.MultiPartParser$FieldState`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.eclipse.jetty.server.MultiPartParser$FieldState AFTER_NAME`
- `public final static org.eclipse.jetty.server.MultiPartParser$FieldState FIELD`
- `public final static org.eclipse.jetty.server.MultiPartParser$FieldState IN_NAME`
- `public final static org.eclipse.jetty.server.MultiPartParser$FieldState IN_VALUE`
- `public final static org.eclipse.jetty.server.MultiPartParser$FieldState VALUE`

---

## public abstract static interface `org.eclipse.jetty.server.MultiPartParser$Handler`

**Methods:**
- `public default boolean content(java.nio.ByteBuffer p0, boolean p1)`
- `public default void earlyEOF()`
- `public default boolean headerComplete()`
- `public default boolean messageComplete()`
- `public default void parsedField(java.lang.String p0, java.lang.String p1)`
- `public default void startPart()`

---

## public final static enum `org.eclipse.jetty.server.MultiPartParser$State`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.eclipse.jetty.server.MultiPartParser$State BODY_PART`
- `public final static org.eclipse.jetty.server.MultiPartParser$State DELIMITER`
- `public final static org.eclipse.jetty.server.MultiPartParser$State DELIMITER_CLOSE`
- `public final static org.eclipse.jetty.server.MultiPartParser$State DELIMITER_PADDING`
- `public final static org.eclipse.jetty.server.MultiPartParser$State END`
- `public final static org.eclipse.jetty.server.MultiPartParser$State EPILOGUE`
- `public final static org.eclipse.jetty.server.MultiPartParser$State FIRST_OCTETS`
- `public final static org.eclipse.jetty.server.MultiPartParser$State OCTETS`
- `public final static org.eclipse.jetty.server.MultiPartParser$State PREAMBLE`

---

## public abstract interface `org.eclipse.jetty.server.MultiParts`
implements `java.io.Closeable`  

**Methods:**
- `public abstract org.eclipse.jetty.server.handler.ContextHandler$Context getContext()`
- `public abstract java.util.EnumSet getNonComplianceWarnings()`
- `public abstract jakarta.servlet.http.Part getPart(java.lang.String p0) throws java.io.IOException`
- `public abstract java.util.Collection getParts() throws java.io.IOException`
- `public abstract boolean isEmpty()`

---

## public static class `org.eclipse.jetty.server.MultiParts$MultiPartsHttpParser`
implements `org.eclipse.jetty.server.MultiParts`  

**Constructors:**
- `public MultiPartsHttpParser(java.io.InputStream p0, java.lang.String p1, jakarta.servlet.MultipartConfigElement p2, java.io.File p3, org.eclipse.jetty.server.Request p4) throws java.io.IOException`

**Methods:**
- `public void close()`
- `public org.eclipse.jetty.server.handler.ContextHandler$Context getContext()`
- `public java.util.EnumSet getNonComplianceWarnings()`
- `public jakarta.servlet.http.Part getPart(java.lang.String p0) throws java.io.IOException`
- `public java.util.Collection getParts() throws java.io.IOException`
- `public boolean isEmpty()`

---

## public static class `org.eclipse.jetty.server.MultiParts$MultiPartsUtilParser`
implements `org.eclipse.jetty.server.MultiParts`  

**Constructors:**
- `public MultiPartsUtilParser(java.io.InputStream p0, java.lang.String p1, jakarta.servlet.MultipartConfigElement p2, java.io.File p3, org.eclipse.jetty.server.Request p4) throws java.io.IOException`

**Methods:**
- `public void close()`
- `public org.eclipse.jetty.server.handler.ContextHandler$Context getContext()`
- `public java.util.EnumSet getNonComplianceWarnings()`
- `public jakarta.servlet.http.Part getPart(java.lang.String p0) throws java.io.IOException`
- `public java.util.Collection getParts() throws java.io.IOException`
- `public boolean isEmpty()`

---

## public final static enum `org.eclipse.jetty.server.MultiParts$NonCompliance`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.eclipse.jetty.server.MultiParts$NonCompliance BASE64_TRANSFER_ENCODING`
- `public final static org.eclipse.jetty.server.MultiParts$NonCompliance CR_LINE_TERMINATION`
- `public final static org.eclipse.jetty.server.MultiParts$NonCompliance LF_LINE_TERMINATION`
- `public final static org.eclipse.jetty.server.MultiParts$NonCompliance NO_CRLF_AFTER_PREAMBLE`
- `public final static org.eclipse.jetty.server.MultiParts$NonCompliance QUOTED_PRINTABLE_TRANSFER_ENCODING`
- `public final static org.eclipse.jetty.server.MultiParts$NonCompliance TRANSFER_ENCODING`

**Methods:**
- `public java.lang.String getURL()`

---

## public abstract class `org.eclipse.jetty.server.NegotiatingServerConnection`
extends `org.eclipse.jetty.io.AbstractConnection`  

**Constructors:**
- `protected NegotiatingServerConnection(org.eclipse.jetty.server.Connector p0, org.eclipse.jetty.io.EndPoint p1, javax.net.ssl.SSLEngine p2, java.util.List p3, java.lang.String p4)`

**Methods:**
- `public void close()`
- `public org.eclipse.jetty.server.Connector getConnector()`
- `public java.lang.String getDefaultProtocol()`
- `public java.lang.String getProtocol()`
- `public java.util.List getProtocols()`
- `public javax.net.ssl.SSLEngine getSSLEngine()`
- `public void onFillable()`
- `public void onOpen()`
- `protected void setProtocol(java.lang.String p0)`

---

## public abstract static interface `org.eclipse.jetty.server.NegotiatingServerConnection$CipherDiscriminator`

**Methods:**
- `public abstract boolean isAcceptable(java.lang.String p0, java.lang.String p1, java.lang.String p2)`

---

## public abstract class `org.eclipse.jetty.server.NegotiatingServerConnectionFactory`
extends `org.eclipse.jetty.server.AbstractConnectionFactory`  

**Constructors:**
- `public NegotiatingServerConnectionFactory(java.lang.String p0, java.lang.String... p1)`

**Methods:**
- `public java.lang.String getDefaultProtocol()`
- `public java.util.List getNegotiatedProtocols()`
- `public org.eclipse.jetty.io.Connection newConnection(org.eclipse.jetty.server.Connector p0, org.eclipse.jetty.io.EndPoint p1)`
- `protected abstract org.eclipse.jetty.io.AbstractConnection newServerConnection(org.eclipse.jetty.server.Connector p0, org.eclipse.jetty.io.EndPoint p1, javax.net.ssl.SSLEngine p2, java.util.List p3, java.lang.String p4)`
- `public void setDefaultProtocol(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public abstract interface `org.eclipse.jetty.server.NetworkConnector`
implements `java.io.Closeable`, `org.eclipse.jetty.server.Connector`  

**Methods:**
- `public abstract void close()`
- `public abstract java.lang.String getHost()`
- `public abstract int getLocalPort()`
- `public abstract int getPort()`
- `public abstract boolean isOpen()`
- `public abstract void open() throws java.io.IOException`

---

## public class `org.eclipse.jetty.server.NetworkTrafficServerConnector`
extends `org.eclipse.jetty.server.ServerConnector`  

**Constructors:**
- `public NetworkTrafficServerConnector(org.eclipse.jetty.server.Server p0)`
- `public NetworkTrafficServerConnector(org.eclipse.jetty.server.Server p0, java.util.concurrent.Executor p1, org.eclipse.jetty.util.thread.Scheduler p2, org.eclipse.jetty.io.ByteBufferPool p3, int p4, int p5, org.eclipse.jetty.server.ConnectionFactory... p6)`
- `public NetworkTrafficServerConnector(org.eclipse.jetty.server.Server p0, org.eclipse.jetty.server.ConnectionFactory p1)`
- `public NetworkTrafficServerConnector(org.eclipse.jetty.server.Server p0, org.eclipse.jetty.server.ConnectionFactory p1, org.eclipse.jetty.util.ssl.SslContextFactory$Server p2)`
- `public NetworkTrafficServerConnector(org.eclipse.jetty.server.Server p0, org.eclipse.jetty.util.ssl.SslContextFactory$Server p1)`

**Methods:**
- `public org.eclipse.jetty.io.NetworkTrafficListener getNetworkTrafficListener()`
- `protected org.eclipse.jetty.io.SocketChannelEndPoint newEndPoint(java.nio.channels.SocketChannel p0, org.eclipse.jetty.io.ManagedSelector p1, java.nio.channels.SelectionKey p2)`
- `public void setNetworkTrafficListener(org.eclipse.jetty.io.NetworkTrafficListener p0)`

---

## public class `org.eclipse.jetty.server.OptionalSslConnectionFactory`
annotations: @java.lang.Deprecated  
extends `org.eclipse.jetty.server.DetectorConnectionFactory`  

**Constructors:**
- `public OptionalSslConnectionFactory(org.eclipse.jetty.server.SslConnectionFactory p0, java.lang.String p1)`

**Methods:**
- `protected void nextProtocol(org.eclipse.jetty.server.Connector p0, org.eclipse.jetty.io.EndPoint p1, java.nio.ByteBuffer p2)`
- `protected void otherProtocol(java.nio.ByteBuffer p0, org.eclipse.jetty.io.EndPoint p1)`

---

## public class `org.eclipse.jetty.server.ProxyConnectionFactory`
extends `org.eclipse.jetty.server.DetectorConnectionFactory`  

**Constructors:**
- `public ProxyConnectionFactory()`
- `public ProxyConnectionFactory(java.lang.String p0)`

**Fields:**
- `public final static java.lang.String TLS_VERSION`

**Methods:**
- `public int getMaxProxyHeader()`
- `public void setMaxProxyHeader(int p0)`

---

## public static class `org.eclipse.jetty.server.ProxyConnectionFactory$ProxyEndPoint`
extends `org.eclipse.jetty.util.AttributesMap`  
implements `org.eclipse.jetty.io.EndPoint$Wrapper`, `org.eclipse.jetty.io.EndPoint`  

**Constructors:**
- `public ProxyEndPoint(org.eclipse.jetty.io.EndPoint p0, java.net.InetSocketAddress p1, java.net.InetSocketAddress p2)`
- `public ProxyEndPoint(org.eclipse.jetty.io.EndPoint p0, java.net.SocketAddress p1, java.net.SocketAddress p2)`

**Methods:**
- `public void close(java.lang.Throwable p0)`
- `public int fill(java.nio.ByteBuffer p0) throws java.io.IOException`
- `public void fillInterested(org.eclipse.jetty.util.Callback p0) throws java.nio.channels.ReadPendingException`
- `public boolean flush(java.nio.ByteBuffer... p0) throws java.io.IOException`
- `public org.eclipse.jetty.io.Connection getConnection()`
- `public long getCreatedTimeStamp()`
- `public long getIdleTimeout()`
- `public java.net.InetSocketAddress getLocalAddress()`
- `public java.net.SocketAddress getLocalSocketAddress()`
- `public java.net.InetSocketAddress getRemoteAddress()`
- `public java.net.SocketAddress getRemoteSocketAddress()`
- `public byte[] getTLV(int p0)`
- `public java.lang.Object getTransport()`
- `public boolean isFillInterested()`
- `public boolean isInputShutdown()`
- `public boolean isOpen()`
- `public boolean isOutputShutdown()`
- `public void onClose(java.lang.Throwable p0)`
- `public void onOpen()`
- `public void setConnection(org.eclipse.jetty.io.Connection p0)`
- `public void setIdleTimeout(long p0)`
- `public void shutdownOutput()`
- `public java.lang.String toString()`
- `public boolean tryFillInterested(org.eclipse.jetty.util.Callback p0)`
- `public org.eclipse.jetty.io.EndPoint unwrap()`
- `public void upgrade(org.eclipse.jetty.io.Connection p0)`
- `public void write(org.eclipse.jetty.util.Callback p0, java.nio.ByteBuffer... p1) throws java.nio.channels.WritePendingException`

---

## public class `org.eclipse.jetty.server.ProxyCustomizer`
implements `org.eclipse.jetty.server.HttpConfiguration$Customizer`  

**Constructors:**
- `public ProxyCustomizer()`

**Fields:**
- `public final static java.lang.String LOCAL_ADDRESS_ATTRIBUTE_NAME`
- `public final static java.lang.String LOCAL_PORT_ATTRIBUTE_NAME`
- `public final static java.lang.String REMOTE_ADDRESS_ATTRIBUTE_NAME`
- `public final static java.lang.String REMOTE_PORT_ATTRIBUTE_NAME`

**Methods:**
- `public void customize(org.eclipse.jetty.server.Connector p0, org.eclipse.jetty.server.HttpConfiguration p1, org.eclipse.jetty.server.Request p2)`

---

## public class `org.eclipse.jetty.server.PushBuilderImpl`
implements `jakarta.servlet.http.PushBuilder`  

**Constructors:**
- `public PushBuilderImpl(org.eclipse.jetty.server.Request p0, org.eclipse.jetty.http.HttpFields p1, java.lang.String p2, java.lang.String p3, java.lang.String p4)`

**Methods:**
- `public jakarta.servlet.http.PushBuilder addHeader(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String getHeader(java.lang.String p0)`
- `public java.util.Set getHeaderNames()`
- `public java.lang.String getMethod()`
- `public java.lang.String getPath()`
- `public java.lang.String getQueryString()`
- `public java.lang.String getSessionId()`
- `public jakarta.servlet.http.PushBuilder method(java.lang.String p0)`
- `public jakarta.servlet.http.PushBuilder path(java.lang.String p0)`
- `public void push()`
- `public jakarta.servlet.http.PushBuilder queryString(java.lang.String p0)`
- `public jakarta.servlet.http.PushBuilder removeHeader(java.lang.String p0)`
- `public jakarta.servlet.http.PushBuilder sessionId(java.lang.String p0)`
- `public jakarta.servlet.http.PushBuilder setHeader(java.lang.String p0, java.lang.String p1)`

---

## public class `org.eclipse.jetty.server.QuietServletException`
extends `jakarta.servlet.ServletException`  
implements `org.eclipse.jetty.io.QuietException`  

**Constructors:**
- `public QuietServletException()`
- `public QuietServletException(java.lang.String p0)`
- `public QuietServletException(java.lang.String p0, java.lang.Throwable p1)`
- `public QuietServletException(java.lang.Throwable p0)`

---

## public class `org.eclipse.jetty.server.Request`
implements `jakarta.servlet.http.HttpServletRequest`  

**Constructors:**
- `public Request(org.eclipse.jetty.server.HttpChannel p0, org.eclipse.jetty.server.HttpInput p1)`

**Fields:**
- `public final static java.lang.String __MULTIPART_CONFIG_ELEMENT`

**Methods:**
- `public void addEventListener(java.util.EventListener p0)`
- `public boolean authenticate(jakarta.servlet.http.HttpServletResponse p0) throws jakarta.servlet.ServletException, java.io.IOException`
- `public java.lang.String changeSessionId()`
- `public void enterSession(jakarta.servlet.http.HttpSession p0)`
- `public void extractFormParameters(org.eclipse.jetty.util.MultiMap p0)`
- `public jakarta.servlet.AsyncContext getAsyncContext()`
- `public java.lang.Object getAttribute(java.lang.String p0)`
- `public java.util.Enumeration getAttributeNames()`
- `public org.eclipse.jetty.util.Attributes getAttributes()`
- `public java.lang.String getAuthType()`
- `public org.eclipse.jetty.server.Authentication getAuthentication()`
- `public static org.eclipse.jetty.server.Request getBaseRequest(jakarta.servlet.ServletRequest p0)`
- `public java.lang.String getCharacterEncoding()`
- `public org.eclipse.jetty.http.ComplianceViolation$Listener getComplianceViolationListener()`
- `public int getContentLength()`
- `public long getContentLengthLong()`
- `public long getContentRead()`
- `public java.lang.String getContentType()`
- `public org.eclipse.jetty.server.handler.ContextHandler$Context getContext()`
- `public java.lang.String getContextPath()`
- `public jakarta.servlet.http.Cookie[] getCookies()`
- `public long getDateHeader(java.lang.String p0)`
- `public jakarta.servlet.DispatcherType getDispatcherType()`
- `public org.eclipse.jetty.server.handler.ContextHandler$Context getErrorContext()`
- `public java.lang.String getHeader(java.lang.String p0)`
- `public java.util.Enumeration getHeaderNames()`
- `public java.util.Enumeration getHeaders(java.lang.String p0)`
- `public org.eclipse.jetty.server.HttpChannel getHttpChannel()`
- `public org.eclipse.jetty.server.HttpChannelState getHttpChannelState()`
- `public org.eclipse.jetty.http.HttpFields getHttpFields()`
- `public org.eclipse.jetty.server.HttpInput getHttpInput()`
- `public jakarta.servlet.http.HttpServletMapping getHttpServletMapping()`
- `public org.eclipse.jetty.http.HttpURI getHttpURI()`
- `public org.eclipse.jetty.http.HttpVersion getHttpVersion()`
- `public int getInputState()`
- `public jakarta.servlet.ServletInputStream getInputStream() throws java.io.IOException`
- `public int getIntHeader(java.lang.String p0)`
- `public java.lang.String getLocalAddr()`
- `public java.lang.String getLocalName()`
- `public int getLocalPort()`
- `public java.util.Locale getLocale()`
- `public java.util.Enumeration getLocales()`
- `public org.eclipse.jetty.http.MetaData$Request getMetaData()`
- `public java.lang.String getMethod()`
- `public java.lang.String getOriginalURI()`
- `public java.lang.String getParameter(java.lang.String p0)`
- `public java.util.Map getParameterMap()`
- `public java.util.Enumeration getParameterNames()`
- `public java.lang.String[] getParameterValues(java.lang.String p0)`
- `public jakarta.servlet.http.Part getPart(java.lang.String p0) throws jakarta.servlet.ServletException, java.io.IOException`
- `public java.util.Collection getParts() throws jakarta.servlet.ServletException, java.io.IOException`
- `public java.lang.String getPathInContext()`
- `public java.lang.String getPathInfo()`
- `public java.lang.String getPathTranslated()`
- `public java.lang.String getProtocol()`
- `public java.lang.String getQueryEncoding()`
- `public org.eclipse.jetty.util.MultiMap getQueryParameters()`
- `public java.lang.String getQueryString()`
- `public java.io.BufferedReader getReader() throws java.io.IOException`
- `public java.lang.String getRealPath(java.lang.String p0)`
- `public java.lang.String getRemoteAddr()`
- `public java.lang.String getRemoteHost()`
- `public java.net.InetSocketAddress getRemoteInetSocketAddress()`
- `public int getRemotePort()`
- `public java.lang.String getRemoteUser()`
- `public jakarta.servlet.RequestDispatcher getRequestDispatcher(java.lang.String p0)`
- `public java.lang.String getRequestURI()`
- `public java.lang.StringBuffer getRequestURL()`
- `public java.lang.String getRequestedSessionId()`
- `public org.eclipse.jetty.server.UserIdentity getResolvedUserIdentity()`
- `public org.eclipse.jetty.server.Response getResponse()`
- `public java.lang.StringBuilder getRootURL()`
- `public java.lang.String getScheme()`
- `public java.lang.String getServerName()`
- `public int getServerPort()`
- `public jakarta.servlet.ServletContext getServletContext()`
- `public java.lang.String getServletName()`
- `public java.lang.String getServletPath()`
- `public org.eclipse.jetty.server.ServletPathMapping getServletPathMapping()`
- `public jakarta.servlet.ServletResponse getServletResponse()`
- `public jakarta.servlet.http.HttpSession getSession()`
- `public jakarta.servlet.http.HttpSession getSession(boolean p0)`
- `public jakarta.servlet.http.HttpSession getSession(org.eclipse.jetty.server.session.SessionHandler p0)`
- `public org.eclipse.jetty.server.session.SessionHandler getSessionHandler()`
- `public long getTimeStamp()`
- `public java.util.Map getTrailerFields()`
- `public org.eclipse.jetty.http.HttpFields getTrailerHttpFields()`
- `public org.eclipse.jetty.server.UserIdentity getUserIdentity()`
- `public org.eclipse.jetty.server.UserIdentity$Scope getUserIdentityScope()`
- `public java.security.Principal getUserPrincipal()`
- `public boolean hasMetaData()`
- `public boolean isAsyncStarted()`
- `public boolean isAsyncSupported()`
- `public boolean isHandled()`
- `public boolean isHead()`
- `public boolean isPush()`
- `public boolean isPushSupported()`
- `public boolean isRequestedSessionIdFromCookie()`
- `public boolean isRequestedSessionIdFromURL()`
- `public boolean isRequestedSessionIdFromUrl()`
- `public boolean isRequestedSessionIdValid()`
- `public boolean isSecure()`
- `public boolean isUserInRole(java.lang.String p0)`
- `public void login(java.lang.String p0, java.lang.String p1) throws jakarta.servlet.ServletException`
- `public void logout() throws jakarta.servlet.ServletException`
- `public void mergeQueryParameters(java.lang.String p0, java.lang.String p1)`
- `public jakarta.servlet.http.PushBuilder newPushBuilder()`
- `public void onCompleted()`
- `public void onResponseCommit()`
- `protected void recycle()`
- `public void removeAttribute(java.lang.String p0)`
- `public void removeEventListener(java.util.EventListener p0)`
- `public void resetParameters()`
- `public void setAsyncAttributes()`
- `public void setAsyncSupported(boolean p0, java.lang.Object p1)`
- `public void setAttribute(java.lang.String p0, java.lang.Object p1)`
- `public void setAttributes(org.eclipse.jetty.util.Attributes p0)`
- `public void setAuthentication(org.eclipse.jetty.server.Authentication p0)`
- `public void setCharacterEncoding(java.lang.String p0) throws java.io.UnsupportedEncodingException`
- `public void setCharacterEncodingUnchecked(java.lang.String p0)`
- `public void setContentParameters(org.eclipse.jetty.util.MultiMap p0)`
- `public void setContentType(java.lang.String p0)`
- `public void setContext(org.eclipse.jetty.server.handler.ContextHandler$Context p0, java.lang.String p1)`
- `public void setCookies(jakarta.servlet.http.Cookie[] p0)`
- `public void setDispatcherType(jakarta.servlet.DispatcherType p0)`
- `public void setHandled(boolean p0)`
- `public void setHttpFields(org.eclipse.jetty.http.HttpFields p0)`
- `public void setHttpURI(org.eclipse.jetty.http.HttpURI p0)`
- `public void setMetaData(org.eclipse.jetty.http.MetaData$Request p0)`
- `public void setMethod(java.lang.String p0)`
- `public void setQueryEncoding(java.lang.String p0)`
- `public void setQueryParameters(org.eclipse.jetty.util.MultiMap p0)`
- `public void setRemoteAddr(java.net.InetSocketAddress p0)`
- `public void setRequestedSessionId(java.lang.String p0)`
- `public void setRequestedSessionIdFromCookie(boolean p0)`
- `public void setSecure(boolean p0)`
- `public void setServletPathMapping(org.eclipse.jetty.server.ServletPathMapping p0)`
- `public void setSession(jakarta.servlet.http.HttpSession p0)`
- `public void setSessionHandler(org.eclipse.jetty.server.session.SessionHandler p0)`
- `public void setTimeStamp(long p0)`
- `public void setTrailerHttpFields(org.eclipse.jetty.http.HttpFields p0)`
- `public void setUserIdentityScope(org.eclipse.jetty.server.UserIdentity$Scope p0)`
- `public jakarta.servlet.AsyncContext startAsync() throws java.lang.IllegalStateException`
- `public jakarta.servlet.AsyncContext startAsync(jakarta.servlet.ServletRequest p0, jakarta.servlet.ServletResponse p1) throws java.lang.IllegalStateException`
- `public boolean takeNewContext()`
- `public java.lang.String toString()`
- `public static jakarta.servlet.http.HttpServletRequest unwrap(jakarta.servlet.ServletRequest p0)`
- `public <T extends jakarta.servlet.http.HttpUpgradeHandler> T upgrade(java.lang.Class p0) throws jakarta.servlet.ServletException, java.io.IOException`

---

## public abstract interface `org.eclipse.jetty.server.RequestLog`

**Methods:**
- `public abstract void log(org.eclipse.jetty.server.Request p0, org.eclipse.jetty.server.Response p1)`

---

## public static class `org.eclipse.jetty.server.RequestLog$Collection`
implements `org.eclipse.jetty.server.RequestLog`  

**Constructors:**
- `public Collection(org.eclipse.jetty.server.RequestLog... p0)`

**Methods:**
- `public void log(org.eclipse.jetty.server.Request p0, org.eclipse.jetty.server.Response p1)`

---

## public abstract static interface `org.eclipse.jetty.server.RequestLog$Writer`

**Methods:**
- `public abstract void write(java.lang.String p0) throws java.io.IOException`

---

## public class `org.eclipse.jetty.server.RequestLogWriter`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.util.component.AbstractLifeCycle`  
implements `org.eclipse.jetty.server.RequestLog$Writer`  

**Constructors:**
- `public RequestLogWriter()`
- `public RequestLogWriter(java.lang.String p0)`

**Methods:**
- `protected void doStart() throws java.lang.Exception`
- `protected void doStop() throws java.lang.Exception`
- `public java.lang.String getDatedFilename()`
- `public java.lang.String getFileName()`
- `public java.lang.String getFilenameDateFormat()`
- `public int getRetainDays()`
- `public java.lang.String getTimeZone()`
- `public boolean isAppend()`
- `public void setAppend(boolean p0)`
- `public void setFilename(java.lang.String p0)`
- `public void setFilenameDateFormat(java.lang.String p0)`
- `public void setRetainDays(int p0)`
- `public void setTimeZone(java.lang.String p0)`
- `public void write(java.lang.String p0) throws java.io.IOException`

---

## public class `org.eclipse.jetty.server.ResourceContentFactory`
implements `org.eclipse.jetty.http.HttpContent$ContentFactory`  

**Constructors:**
- `public ResourceContentFactory(org.eclipse.jetty.util.resource.ResourceFactory p0, org.eclipse.jetty.http.MimeTypes p1, org.eclipse.jetty.http.CompressedContentFormat[] p2)`

**Methods:**
- `public org.eclipse.jetty.http.HttpContent getContent(java.lang.String p0, int p1) throws java.io.IOException`
- `public java.lang.String toString()`

---

## public class `org.eclipse.jetty.server.ResourceService`

**Constructors:**
- `public ResourceService()`

**Methods:**
- `public boolean doGet(jakarta.servlet.http.HttpServletRequest p0, jakarta.servlet.http.HttpServletResponse p1) throws jakarta.servlet.ServletException, java.io.IOException`
- `public org.eclipse.jetty.http.HttpField getCacheControl()`
- `public org.eclipse.jetty.http.HttpContent$ContentFactory getContentFactory()`
- `public int getEncodingCacheSize()`
- `public java.util.List getGzipEquivalentFileExtensions()`
- `public org.eclipse.jetty.http.CompressedContentFormat[] getPrecompressedFormats()`
- `public org.eclipse.jetty.server.ResourceService$WelcomeFactory getWelcomeFactory()`
- `public boolean isAcceptRanges()`
- `public boolean isDirAllowed()`
- `public boolean isEtags()`
- `protected boolean isGzippedContent(java.lang.String p0)`
- `public boolean isPathInfoOnly()`
- `public boolean isRedirectWelcome()`
- `protected void notFound(jakarta.servlet.http.HttpServletRequest p0, jakarta.servlet.http.HttpServletResponse p1) throws java.io.IOException`
- `protected boolean passConditionalHeaders(jakarta.servlet.http.HttpServletRequest p0, jakarta.servlet.http.HttpServletResponse p1, org.eclipse.jetty.http.HttpContent p2) throws java.io.IOException`
- `protected void putHeaders(jakarta.servlet.http.HttpServletResponse p0, org.eclipse.jetty.http.HttpContent p1, long p2)`
- `protected boolean sendData(jakarta.servlet.http.HttpServletRequest p0, jakarta.servlet.http.HttpServletResponse p1, boolean p2, org.eclipse.jetty.http.HttpContent p3, java.util.Enumeration p4) throws java.io.IOException`
- `protected void sendDirectory(jakarta.servlet.http.HttpServletRequest p0, jakarta.servlet.http.HttpServletResponse p1, org.eclipse.jetty.util.resource.Resource p2, java.lang.String p3) throws java.io.IOException`
- `protected void sendStatus(jakarta.servlet.http.HttpServletResponse p0, int p1, java.util.function.Supplier p2) throws java.io.IOException`
- `protected void sendWelcome(org.eclipse.jetty.http.HttpContent p0, java.lang.String p1, boolean p2, boolean p3, jakarta.servlet.http.HttpServletRequest p4, jakarta.servlet.http.HttpServletResponse p5) throws jakarta.servlet.ServletException, java.io.IOException`
- `public void setAcceptRanges(boolean p0)`
- `public void setCacheControl(org.eclipse.jetty.http.HttpField p0)`
- `public void setContentFactory(org.eclipse.jetty.http.HttpContent$ContentFactory p0)`
- `public void setDirAllowed(boolean p0)`
- `public void setEncodingCacheSize(int p0)`
- `public void setEtags(boolean p0)`
- `public void setGzipEquivalentFileExtensions(java.util.List p0)`
- `public void setPathInfoOnly(boolean p0)`
- `public void setPrecompressedFormats(org.eclipse.jetty.http.CompressedContentFormat[] p0)`
- `public void setRedirectWelcome(boolean p0)`
- `public void setWelcomeFactory(org.eclipse.jetty.server.ResourceService$WelcomeFactory p0)`

---

## public abstract static interface `org.eclipse.jetty.server.ResourceService$WelcomeFactory`

**Methods:**
- `public abstract java.lang.String getWelcomeFile(java.lang.String p0) throws java.io.IOException`

---

## public class `org.eclipse.jetty.server.Response`
implements `jakarta.servlet.http.HttpServletResponse`  

**Constructors:**
- `public Response(org.eclipse.jetty.server.HttpChannel p0, org.eclipse.jetty.server.HttpOutput p1)`

**Fields:**
- `public final static int NO_CONTENT_LENGTH`
- `public final static java.lang.String SET_INCLUDE_HEADER_PREFIX`
- `public final static int USE_KNOWN_CONTENT_LENGTH`

**Methods:**
- `public void addCookie(jakarta.servlet.http.Cookie p0)`
- `public void addCookie(org.eclipse.jetty.http.HttpCookie p0)`
- `public void addDateHeader(java.lang.String p0, long p1)`
- `public void addHeader(java.lang.String p0, java.lang.String p1)`
- `public void addIntHeader(java.lang.String p0, int p1)`
- `public void closeOutput() throws java.io.IOException`
- `public void completeOutput() throws java.io.IOException`
- `public void completeOutput(org.eclipse.jetty.util.Callback p0)`
- `public boolean containsHeader(java.lang.String p0)`
- `public java.lang.String encodeRedirectURL(java.lang.String p0)`
- `public java.lang.String encodeRedirectUrl(java.lang.String p0)`
- `public java.lang.String encodeURL(java.lang.String p0)`
- `public java.lang.String encodeUrl(java.lang.String p0)`
- `public void errorClose()`
- `public void flushBuffer() throws java.io.IOException`
- `public int getBufferSize()`
- `public java.lang.String getCharacterEncoding()`
- `public org.eclipse.jetty.http.MetaData$Response getCommittedMetaData()`
- `public long getContentCount()`
- `public long getContentLength()`
- `public java.lang.String getContentType()`
- `public java.lang.String getHeader(java.lang.String p0)`
- `public java.util.Collection getHeaderNames()`
- `public java.util.Collection getHeaders(java.lang.String p0)`
- `public org.eclipse.jetty.server.HttpChannel getHttpChannel()`
- `public org.eclipse.jetty.http.HttpFields$Mutable getHttpFields()`
- `public org.eclipse.jetty.server.HttpOutput getHttpOutput()`
- `public java.util.Locale getLocale()`
- `public long getLongContentLength()`
- `public jakarta.servlet.ServletOutputStream getOutputStream() throws java.io.IOException`
- `public java.lang.String getReason()`
- `public int getStatus()`
- `public java.util.function.Supplier getTrailerFields()`
- `public java.util.function.Supplier getTrailers()`
- `public java.io.PrintWriter getWriter() throws java.io.IOException`
- `public void include()`
- `public void included()`
- `public boolean isAllContentWritten(long p0)`
- `public boolean isCommitted()`
- `public boolean isContentComplete(long p0)`
- `public boolean isIncluding()`
- `public boolean isStreaming()`
- `public boolean isWriting()`
- `public boolean isWritingOrStreaming()`
- `protected org.eclipse.jetty.http.MetaData$Response newResponseMetaData()`
- `public static void putHeaders(jakarta.servlet.http.HttpServletResponse p0, org.eclipse.jetty.http.HttpContent p1, long p2, boolean p3)`
- `public void putHeaders(org.eclipse.jetty.http.HttpContent p0, long p1, boolean p2)`
- `protected void recycle()`
- `public void reopen()`
- `public void replaceCookie(org.eclipse.jetty.http.HttpCookie p0)`
- `public void reset()`
- `public void resetBuffer()`
- `public void resetContent()`
- `public void resetForForward()`
- `public void sendEarlyHint() throws java.io.IOException`
- `public void sendError(int p0) throws java.io.IOException`
- `public void sendError(int p0, java.lang.String p1) throws java.io.IOException`
- `public void sendProcessing() throws java.io.IOException`
- `public void sendRedirect(int p0, java.lang.String p1) throws java.io.IOException`
- `public void sendRedirect(int p0, java.lang.String p1, boolean p2) throws java.io.IOException`
- `public void sendRedirect(java.lang.String p0) throws java.io.IOException`
- `public void sendRedirect(java.lang.String p0, boolean p1) throws java.io.IOException`
- `public void setBufferSize(int p0)`
- `public void setCharacterEncoding(java.lang.String p0)`
- `public void setContentLength(int p0)`
- `public void setContentLengthLong(long p0)`
- `public void setContentType(java.lang.String p0)`
- `public void setDateHeader(java.lang.String p0, long p1)`
- `public void setHeader(java.lang.String p0, java.lang.String p1)`
- `public void setHeader(org.eclipse.jetty.http.HttpHeader p0, java.lang.String p1)`
- `public void setIntHeader(java.lang.String p0, int p1)`
- `public void setLocale(java.util.Locale p0)`
- `public void setLongContentLength(long p0)`
- `public void setStatus(int p0)`
- `public void setStatus(int p0, java.lang.String p1)`
- `public void setStatusWithReason(int p0, java.lang.String p1)`
- `public void setTrailerFields(java.util.function.Supplier p0)`
- `public void setTrailers(java.util.function.Supplier p0)`
- `public java.lang.String toString()`
- `public static jakarta.servlet.http.HttpServletResponse unwrap(jakarta.servlet.ServletResponse p0)`

---

## public final static enum `org.eclipse.jetty.server.Response$OutputType`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.eclipse.jetty.server.Response$OutputType NONE`
- `public final static org.eclipse.jetty.server.Response$OutputType STREAM`
- `public final static org.eclipse.jetty.server.Response$OutputType WRITER`

---

## public class `org.eclipse.jetty.server.ResponseWriter`
extends `java.io.PrintWriter`  

**Constructors:**
- `public ResponseWriter(org.eclipse.jetty.server.HttpWriter p0, java.util.Locale p1, java.lang.String p2)`

**Methods:**
- `public boolean checkError()`
- `protected void clearError()`
- `public void close()`
- `public void complete(org.eclipse.jetty.util.Callback p0)`
- `public void flush()`
- `public java.io.PrintWriter format(java.lang.String p0, java.lang.Object... p1)`
- `public java.io.PrintWriter format(java.util.Locale p0, java.lang.String p1, java.lang.Object... p2)`
- `public boolean isFor(java.util.Locale p0, java.lang.String p1)`
- `public void print(boolean p0)`
- `public void print(char p0)`
- `public void print(char[] p0)`
- `public void print(double p0)`
- `public void print(float p0)`
- `public void print(int p0)`
- `public void print(java.lang.Object p0)`
- `public void print(java.lang.String p0)`
- `public void print(long p0)`
- `public java.io.PrintWriter printf(java.lang.String p0, java.lang.Object... p1)`
- `public java.io.PrintWriter printf(java.util.Locale p0, java.lang.String p1, java.lang.Object... p2)`
- `public void println()`
- `public void println(boolean p0)`
- `public void println(char p0)`
- `public void println(char[] p0)`
- `public void println(double p0)`
- `public void println(float p0)`
- `public void println(int p0)`
- `public void println(java.lang.Object p0)`
- `public void println(java.lang.String p0)`
- `public void println(long p0)`
- `protected void reopen()`
- `protected void setError()`
- `public void write(char[] p0)`
- `public void write(char[] p0, int p1, int p2)`
- `public void write(int p0)`
- `public void write(java.lang.String p0)`
- `public void write(java.lang.String p0, int p1, int p2)`

---

## public class `org.eclipse.jetty.server.SameFileAliasChecker`
annotations: @java.lang.Deprecated  
implements `org.eclipse.jetty.server.handler.ContextHandler$AliasCheck`  

**Constructors:**
- `public SameFileAliasChecker()`

**Methods:**
- `public boolean check(java.lang.String p0, org.eclipse.jetty.util.resource.Resource p1)`

---

## public class `org.eclipse.jetty.server.SecureRequestCustomizer`
implements `org.eclipse.jetty.server.HttpConfiguration$Customizer`  

**Constructors:**
- `public SecureRequestCustomizer()`
- `public SecureRequestCustomizer(boolean p0)`
- `public SecureRequestCustomizer(boolean p0, boolean p1, long p2, boolean p3)`
- `public SecureRequestCustomizer(boolean p0, long p1, boolean p2)`

**Fields:**
- `public final static java.lang.String JAKARTA_SERVLET_REQUEST_CIPHER_SUITE`
- `public final static java.lang.String JAKARTA_SERVLET_REQUEST_KEY_SIZE`
- `public final static java.lang.String JAKARTA_SERVLET_REQUEST_SSL_SESSION_ID`
- `public final static java.lang.String JAKARTA_SERVLET_REQUEST_X_509_CERTIFICATE`
- `public final static java.lang.String X509_CERT`

**Methods:**
- `protected void customize(javax.net.ssl.SSLEngine p0, org.eclipse.jetty.server.Request p1)`
- `public void customize(org.eclipse.jetty.server.Connector p0, org.eclipse.jetty.server.HttpConfiguration p1, org.eclipse.jetty.server.Request p2)`
- `protected void customizeSecure(org.eclipse.jetty.server.Request p0)`
- `public java.lang.String getSslSessionAttribute()`
- `public long getStsMaxAge()`
- `public boolean isSniHostCheck()`
- `public boolean isSniRequired()`
- `public boolean isStsIncludeSubDomains()`
- `public void setSniHostCheck(boolean p0)`
- `public void setSniRequired(boolean p0)`
- `public void setSslSessionAttribute(java.lang.String p0)`
- `public void setStsIncludeSubDomains(boolean p0)`
- `public void setStsMaxAge(long p0)`
- `public void setStsMaxAge(long p0, java.util.concurrent.TimeUnit p1)`
- `public java.lang.String toString()`

---

## public class `org.eclipse.jetty.server.Server`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.server.handler.HandlerWrapper`  
implements `org.eclipse.jetty.util.Attributes`  

**Constructors:**
- `public Server()`
- `public Server(int p0)`
- `public Server(java.net.InetSocketAddress p0)`
- `public Server(org.eclipse.jetty.util.thread.ThreadPool p0)`

**Methods:**
- `public void addBeanToAllConnectors(java.lang.Object p0)`
- `public void addConnector(org.eclipse.jetty.server.Connector p0)`
- `public void clearAttributes()`
- `protected void doStart() throws java.lang.Exception`
- `protected void doStop() throws java.lang.Exception`
- `public void dump(java.lang.Appendable p0, java.lang.String p1) throws java.io.IOException`
- `public java.lang.Object getAttribute(java.lang.String p0)`
- `public java.util.Set getAttributeNameSet()`
- `public java.util.Enumeration getAttributeNames()`
- `public org.eclipse.jetty.server.Connector[] getConnectors()`
- `public org.eclipse.jetty.http.HttpField getDateField()`
- `public org.eclipse.jetty.server.handler.ErrorHandler getErrorHandler()`
- `public org.eclipse.jetty.server.RequestLog getRequestLog()`
- `public org.eclipse.jetty.server.SessionIdManager getSessionIdManager()`
- `public boolean getStopAtShutdown()`
- `public long getStopTimeout()`
- `public org.eclipse.jetty.util.thread.ThreadPool getThreadPool()`
- `public java.net.URI getURI()`
- `public static java.lang.String getVersion()`
- `public void handle(org.eclipse.jetty.server.HttpChannel p0) throws jakarta.servlet.ServletException, java.io.IOException`
- `public void handleAsync(org.eclipse.jetty.server.HttpChannel p0) throws jakarta.servlet.ServletException, java.io.IOException`
- `protected void handleOptions(org.eclipse.jetty.server.Request p0, org.eclipse.jetty.server.Response p1) throws java.io.IOException`
- `public boolean isDryRun()`
- `public boolean isDumpAfterStart()`
- `public boolean isDumpBeforeStop()`
- `public void join() throws java.lang.InterruptedException`
- `public static void main(java.lang.String... p0) throws java.lang.Exception`
- `public void removeAttribute(java.lang.String p0)`
- `public void removeConnector(org.eclipse.jetty.server.Connector p0)`
- `public void setAttribute(java.lang.String p0, java.lang.Object p1)`
- `public void setConnectors(org.eclipse.jetty.server.Connector[] p0)`
- `public void setDryRun(boolean p0)`
- `public void setDumpAfterStart(boolean p0)`
- `public void setDumpBeforeStop(boolean p0)`
- `public void setErrorHandler(org.eclipse.jetty.server.handler.ErrorHandler p0)`
- `public void setRequestLog(org.eclipse.jetty.server.RequestLog p0)`
- `public void setSessionIdManager(org.eclipse.jetty.server.SessionIdManager p0)`
- `public void setStopAtShutdown(boolean p0)`
- `public void setStopTimeout(long p0)`
- `protected void start(org.eclipse.jetty.util.component.LifeCycle p0) throws java.lang.Exception`
- `public java.lang.String toString()`

---

## public class `org.eclipse.jetty.server.ServerConnectionStatistics`
annotations: @java.lang.Deprecated  
extends `org.eclipse.jetty.io.ConnectionStatistics`  

**Constructors:**
- `public ServerConnectionStatistics()`

**Methods:**
- `public static void addToAllConnectors(org.eclipse.jetty.server.Server p0)`

---

## public class `org.eclipse.jetty.server.ServerConnector`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.server.AbstractNetworkConnector`  

**Constructors:**
- `public ServerConnector(org.eclipse.jetty.server.Server p0)`
- `public ServerConnector(org.eclipse.jetty.server.Server p0, int p1, int p2)`
- `public ServerConnector(org.eclipse.jetty.server.Server p0, int p1, int p2, org.eclipse.jetty.server.ConnectionFactory... p3)`
- `public ServerConnector(org.eclipse.jetty.server.Server p0, int p1, int p2, org.eclipse.jetty.util.ssl.SslContextFactory$Server p3)`
- `public ServerConnector(org.eclipse.jetty.server.Server p0, java.util.concurrent.Executor p1, org.eclipse.jetty.util.thread.Scheduler p2, org.eclipse.jetty.io.ByteBufferPool p3, int p4, int p5, org.eclipse.jetty.server.ConnectionFactory... p6)`
- `public ServerConnector(org.eclipse.jetty.server.Server p0, org.eclipse.jetty.server.ConnectionFactory... p1)`
- `public ServerConnector(org.eclipse.jetty.server.Server p0, org.eclipse.jetty.util.ssl.SslContextFactory$Server p1)`
- `public ServerConnector(org.eclipse.jetty.server.Server p0, org.eclipse.jetty.util.ssl.SslContextFactory$Server p1, org.eclipse.jetty.server.ConnectionFactory... p2)`

**Methods:**
- `public void accept(int p0) throws java.io.IOException`
- `public void close()`
- `protected void doStart() throws java.lang.Exception`
- `protected void doStop() throws java.lang.Exception`
- `public int getAcceptQueueSize()`
- `public int getAcceptedReceiveBufferSize()`
- `public int getAcceptedSendBufferSize()`
- `public boolean getAcceptedTcpNoDelay()`
- `public int getLocalPort()`
- `public boolean getReuseAddress()`
- `public org.eclipse.jetty.io.SelectorManager getSelectorManager()`
- `public java.lang.Object getTransport()`
- `public boolean isInheritChannel()`
- `public boolean isOpen()`
- `public boolean isReusePort()`
- `protected org.eclipse.jetty.io.SocketChannelEndPoint newEndPoint(java.nio.channels.SocketChannel p0, org.eclipse.jetty.io.ManagedSelector p1, java.nio.channels.SelectionKey p2) throws java.io.IOException`
- `protected org.eclipse.jetty.io.SelectorManager newSelectorManager(java.util.concurrent.Executor p0, org.eclipse.jetty.util.thread.Scheduler p1, int p2)`
- `public void open() throws java.io.IOException`
- `public void open(java.nio.channels.ServerSocketChannel p0) throws java.io.IOException`
- `protected java.nio.channels.ServerSocketChannel openAcceptChannel() throws java.io.IOException`
- `public void setAcceptQueueSize(int p0)`
- `public void setAcceptedReceiveBufferSize(int p0)`
- `public void setAcceptedSendBufferSize(int p0)`
- `public void setAcceptedTcpNoDelay(boolean p0)`
- `public void setAccepting(boolean p0)`
- `public void setInheritChannel(boolean p0)`
- `public void setReuseAddress(boolean p0)`
- `public void setReusePort(boolean p0)`

---

## protected class `org.eclipse.jetty.server.ServerConnector$ServerConnectorManager`
extends `org.eclipse.jetty.io.SelectorManager`  

**Constructors:**
- `public ServerConnectorManager(java.util.concurrent.Executor p0, org.eclipse.jetty.util.thread.Scheduler p1, int p2)`

**Methods:**
- `protected void accepted(java.nio.channels.SelectableChannel p0) throws java.io.IOException`
- `protected void endPointClosed(org.eclipse.jetty.io.EndPoint p0)`
- `protected void endPointOpened(org.eclipse.jetty.io.EndPoint p0)`
- `public org.eclipse.jetty.io.Connection newConnection(java.nio.channels.SelectableChannel p0, org.eclipse.jetty.io.EndPoint p1, java.lang.Object p2) throws java.io.IOException`
- `protected org.eclipse.jetty.io.SocketChannelEndPoint newEndPoint(java.nio.channels.SelectableChannel p0, org.eclipse.jetty.io.ManagedSelector p1, java.nio.channels.SelectionKey p2) throws java.io.IOException`
- `public java.lang.String toString()`

---

## public class `org.eclipse.jetty.server.ServletAttributes`
implements `org.eclipse.jetty.util.Attributes`  

**Constructors:**
- `public ServletAttributes()`

**Methods:**
- `public void clearAttributes()`
- `public java.lang.Object getAttribute(java.lang.String p0)`
- `public java.util.Set getAttributeNameSet()`
- `public void removeAttribute(java.lang.String p0)`
- `public void setAsyncAttributes(java.lang.String p0, java.lang.String p1, java.lang.String p2, org.eclipse.jetty.server.ServletPathMapping p3, java.lang.String p4)`
- `public void setAttribute(java.lang.String p0, java.lang.Object p1)`

---

## public class `org.eclipse.jetty.server.ServletPathMapping`
implements `jakarta.servlet.http.HttpServletMapping`  

**Constructors:**
- `public ServletPathMapping(org.eclipse.jetty.http.pathmap.PathSpec p0, java.lang.String p1, java.lang.String p2)`
- `public ServletPathMapping(org.eclipse.jetty.http.pathmap.PathSpec p0, java.lang.String p1, java.lang.String p2, org.eclipse.jetty.http.pathmap.MatchedPath p3)`

**Methods:**
- `public jakarta.servlet.http.MappingMatch getMappingMatch()`
- `public java.lang.String getMatchValue()`
- `public java.lang.String getPathInfo()`
- `public java.lang.String getPattern()`
- `public java.lang.String getServletName()`
- `public java.lang.String getServletPath()`
- `public java.lang.String toString()`

---

## public class `org.eclipse.jetty.server.ServletRequestHttpWrapper`
extends `jakarta.servlet.ServletRequestWrapper`  
implements `jakarta.servlet.http.HttpServletRequest`  

**Constructors:**
- `public ServletRequestHttpWrapper(jakarta.servlet.ServletRequest p0)`

**Methods:**
- `public boolean authenticate(jakarta.servlet.http.HttpServletResponse p0) throws jakarta.servlet.ServletException, java.io.IOException`
- `public java.lang.String changeSessionId()`
- `public java.lang.String getAuthType()`
- `public java.lang.String getContextPath()`
- `public jakarta.servlet.http.Cookie[] getCookies()`
- `public long getDateHeader(java.lang.String p0)`
- `public java.lang.String getHeader(java.lang.String p0)`
- `public java.util.Enumeration getHeaderNames()`
- `public java.util.Enumeration getHeaders(java.lang.String p0)`
- `public int getIntHeader(java.lang.String p0)`
- `public java.lang.String getMethod()`
- `public jakarta.servlet.http.Part getPart(java.lang.String p0) throws jakarta.servlet.ServletException, java.io.IOException`
- `public java.util.Collection getParts() throws jakarta.servlet.ServletException, java.io.IOException`
- `public java.lang.String getPathInfo()`
- `public java.lang.String getPathTranslated()`
- `public java.lang.String getQueryString()`
- `public java.lang.String getRemoteUser()`
- `public java.lang.String getRequestURI()`
- `public java.lang.StringBuffer getRequestURL()`
- `public java.lang.String getRequestedSessionId()`
- `public java.lang.String getServletPath()`
- `public jakarta.servlet.http.HttpSession getSession()`
- `public jakarta.servlet.http.HttpSession getSession(boolean p0)`
- `public java.security.Principal getUserPrincipal()`
- `public boolean isRequestedSessionIdFromCookie()`
- `public boolean isRequestedSessionIdFromURL()`
- `public boolean isRequestedSessionIdFromUrl()`
- `public boolean isRequestedSessionIdValid()`
- `public boolean isUserInRole(java.lang.String p0)`
- `public void login(java.lang.String p0, java.lang.String p1) throws jakarta.servlet.ServletException`
- `public void logout() throws jakarta.servlet.ServletException`
- `public <T extends jakarta.servlet.http.HttpUpgradeHandler> T upgrade(java.lang.Class p0) throws jakarta.servlet.ServletException, java.io.IOException`

---

## public class `org.eclipse.jetty.server.ServletResponseHttpWrapper`
extends `jakarta.servlet.ServletResponseWrapper`  
implements `jakarta.servlet.http.HttpServletResponse`  

**Constructors:**
- `public ServletResponseHttpWrapper(jakarta.servlet.ServletResponse p0)`

**Methods:**
- `public void addCookie(jakarta.servlet.http.Cookie p0)`
- `public void addDateHeader(java.lang.String p0, long p1)`
- `public void addHeader(java.lang.String p0, java.lang.String p1)`
- `public void addIntHeader(java.lang.String p0, int p1)`
- `public boolean containsHeader(java.lang.String p0)`
- `public java.lang.String encodeRedirectURL(java.lang.String p0)`
- `public java.lang.String encodeRedirectUrl(java.lang.String p0)`
- `public java.lang.String encodeURL(java.lang.String p0)`
- `public java.lang.String encodeUrl(java.lang.String p0)`
- `public java.lang.String getHeader(java.lang.String p0)`
- `public java.util.Collection getHeaderNames()`
- `public java.util.Collection getHeaders(java.lang.String p0)`
- `public int getStatus()`
- `public void sendError(int p0) throws java.io.IOException`
- `public void sendError(int p0, java.lang.String p1) throws java.io.IOException`
- `public void sendRedirect(java.lang.String p0) throws java.io.IOException`
- `public void setDateHeader(java.lang.String p0, long p1)`
- `public void setHeader(java.lang.String p0, java.lang.String p1)`
- `public void setIntHeader(java.lang.String p0, int p1)`
- `public void setStatus(int p0)`
- `public void setStatus(int p0, java.lang.String p1)`

---

## public abstract interface `org.eclipse.jetty.server.SessionIdManager`
implements `org.eclipse.jetty.util.component.LifeCycle`  

**Methods:**
- `public abstract void expireAll(java.lang.String p0)`
- `public abstract java.lang.String getExtendedId(java.lang.String p0, jakarta.servlet.http.HttpServletRequest p1)`
- `public abstract java.lang.String getId(java.lang.String p0)`
- `public abstract java.util.Set getSessionHandlers()`
- `public abstract org.eclipse.jetty.server.session.HouseKeeper getSessionHouseKeeper()`
- `public abstract java.lang.String getWorkerName()`
- `public abstract void invalidateAll(java.lang.String p0)`
- `public abstract boolean isIdInUse(java.lang.String p0)`
- `public abstract java.lang.String newSessionId(jakarta.servlet.http.HttpServletRequest p0, long p1)`
- `public abstract java.lang.String renewSessionId(java.lang.String p0, java.lang.String p1, jakarta.servlet.http.HttpServletRequest p2)`
- `public abstract void setSessionHouseKeeper(org.eclipse.jetty.server.session.HouseKeeper p0)`

---

## public class `org.eclipse.jetty.server.ShutdownMonitor`

**Methods:**
- `public void await() throws java.lang.InterruptedException`
- `public static void deregister(org.eclipse.jetty.util.component.LifeCycle p0)`
- `public static org.eclipse.jetty.server.ShutdownMonitor getInstance()`
- `public java.lang.String getKey()`
- `public int getPort()`
- `public boolean isExitVm()`
- `public static boolean isRegistered(org.eclipse.jetty.util.component.LifeCycle p0)`
- `public static void register(org.eclipse.jetty.util.component.LifeCycle... p0)`
- `public void setDebug(boolean p0)`
- `public void setExitVm(boolean p0)`
- `public void setKey(java.lang.String p0)`
- `public void setPort(int p0)`
- `public void start() throws java.lang.Exception`
- `public java.lang.String toString()`

---

## public class `org.eclipse.jetty.server.Slf4jRequestLogWriter`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.util.component.AbstractLifeCycle`  
implements `org.eclipse.jetty.server.RequestLog$Writer`  

**Constructors:**
- `public Slf4jRequestLogWriter()`

**Methods:**
- `protected void doStart() throws java.lang.Exception`
- `public java.lang.String getLoggerName()`
- `protected boolean isEnabled()`
- `public void setLoggerName(java.lang.String p0)`
- `public void write(java.lang.String p0) throws java.io.IOException`

---

## public class `org.eclipse.jetty.server.SocketCustomizationListener`
implements `org.eclipse.jetty.io.Connection$Listener`  

**Constructors:**
- `public SocketCustomizationListener()`
- `public SocketCustomizationListener(boolean p0)`

**Methods:**
- `protected void customize(java.net.Socket p0, java.lang.Class p1, boolean p2)`
- `public void onClosed(org.eclipse.jetty.io.Connection p0)`
- `public void onOpened(org.eclipse.jetty.io.Connection p0)`

---

## public class `org.eclipse.jetty.server.SslConnectionFactory`
extends `org.eclipse.jetty.server.AbstractConnectionFactory`  
implements `org.eclipse.jetty.server.ConnectionFactory$Configuring`, `org.eclipse.jetty.server.ConnectionFactory$Detecting`  

**Constructors:**
- `public SslConnectionFactory()`
- `public SslConnectionFactory(java.lang.String p0)`
- `public SslConnectionFactory(org.eclipse.jetty.util.ssl.SslContextFactory$Server p0, java.lang.String p1)`

**Methods:**
- `protected org.eclipse.jetty.io.AbstractConnection configure(org.eclipse.jetty.io.AbstractConnection p0, org.eclipse.jetty.server.Connector p1, org.eclipse.jetty.io.EndPoint p2)`
- `public void configure(org.eclipse.jetty.server.Connector p0)`
- `public org.eclipse.jetty.server.ConnectionFactory$Detecting$Detection detect(java.nio.ByteBuffer p0)`
- `protected void doStart() throws java.lang.Exception`
- `public java.lang.String getNextProtocol()`
- `public org.eclipse.jetty.util.ssl.SslContextFactory$Server getSslContextFactory()`
- `public boolean isDirectBuffersForDecryption()`
- `public boolean isDirectBuffersForEncryption()`
- `public boolean isEnsureSecureRequestCustomizer()`
- `public org.eclipse.jetty.io.Connection newConnection(org.eclipse.jetty.server.Connector p0, org.eclipse.jetty.io.EndPoint p1)`
- `protected org.eclipse.jetty.io.ssl.SslConnection newSslConnection(org.eclipse.jetty.server.Connector p0, org.eclipse.jetty.io.EndPoint p1, javax.net.ssl.SSLEngine p2)`
- `public void setDirectBuffersForDecryption(boolean p0)`
- `public void setDirectBuffersForEncryption(boolean p0)`
- `public void setEnsureSecureRequestCustomizer(boolean p0)`
- `public java.lang.String toString()`

---

## public class `org.eclipse.jetty.server.SymlinkAllowedResourceAliasChecker`
extends `org.eclipse.jetty.server.AllowedResourceAliasChecker`  

**Constructors:**
- `public SymlinkAllowedResourceAliasChecker(org.eclipse.jetty.server.handler.ContextHandler p0)`

**Methods:**
- `protected boolean check(java.lang.String p0, java.nio.file.Path p1)`

---

## public abstract interface `org.eclipse.jetty.server.UserIdentity`

**Fields:**
- `public final static org.eclipse.jetty.server.UserIdentity UNAUTHENTICATED_IDENTITY`

**Methods:**
- `public abstract javax.security.auth.Subject getSubject()`
- `public abstract java.security.Principal getUserPrincipal()`
- `public abstract boolean isUserInRole(java.lang.String p0, org.eclipse.jetty.server.UserIdentity$Scope p1)`

---

## public abstract static interface `org.eclipse.jetty.server.UserIdentity$Scope`

**Methods:**
- `public abstract org.eclipse.jetty.server.handler.ContextHandler getContextHandler()`
- `public abstract java.lang.String getContextPath()`
- `public abstract java.lang.String getName()`
- `public abstract java.util.Map getRoleRefMap()`

---

## public abstract static interface `org.eclipse.jetty.server.UserIdentity$UnauthenticatedUserIdentity`
implements `org.eclipse.jetty.server.UserIdentity`  

---

## public class `org.eclipse.jetty.server.Utf8HttpWriter`
extends `org.eclipse.jetty.server.HttpWriter`  

**Constructors:**
- `public Utf8HttpWriter(org.eclipse.jetty.server.HttpOutput p0)`

**Methods:**
- `public void write(char[] p0, int p1, int p2) throws java.io.IOException`

---

## public abstract class `org.eclipse.jetty.server.handler.AbstractHandler`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.util.component.ContainerLifeCycle`  
implements `org.eclipse.jetty.server.Handler`  

**Constructors:**
- `public AbstractHandler()`

**Methods:**
- `public void destroy()`
- `protected void doError(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `protected void doStart() throws java.lang.Exception`
- `protected void doStop() throws java.lang.Exception`
- `public org.eclipse.jetty.server.Server getServer()`
- `public abstract void handle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `public void setServer(org.eclipse.jetty.server.Server p0)`

---

## public abstract static class `org.eclipse.jetty.server.handler.AbstractHandler$ErrorDispatchHandler`
annotations: @java.lang.Deprecated  
extends `org.eclipse.jetty.server.handler.AbstractHandler`  

**Constructors:**
- `public ErrorDispatchHandler()`

**Methods:**
- `protected abstract void doNonErrorHandle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `public final void handle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`

---

## public abstract class `org.eclipse.jetty.server.handler.AbstractHandlerContainer`
extends `org.eclipse.jetty.server.handler.AbstractHandler`  
implements `org.eclipse.jetty.server.HandlerContainer`  

**Constructors:**
- `public AbstractHandlerContainer()`

**Methods:**
- `protected void expandChildren(java.util.List p0, java.lang.Class p1)`
- `protected void expandHandler(org.eclipse.jetty.server.Handler p0, java.util.List p1, java.lang.Class p2)`
- `public static <T extends org.eclipse.jetty.server.HandlerContainer> T findContainerOf(org.eclipse.jetty.server.HandlerContainer p0, java.lang.Class p1, org.eclipse.jetty.server.Handler p2)`
- `public <T extends org.eclipse.jetty.server.Handler> T getChildHandlerByClass(java.lang.Class p0)`
- `public org.eclipse.jetty.server.Handler[] getChildHandlers()`
- `public org.eclipse.jetty.server.Handler[] getChildHandlersByClass(java.lang.Class p0)`
- `public void setServer(org.eclipse.jetty.server.Server p0)`

---

## public class `org.eclipse.jetty.server.handler.AllowSymLinkAliasChecker`
annotations: @java.lang.Deprecated  
implements `org.eclipse.jetty.server.handler.ContextHandler$AliasCheck`  

**Constructors:**
- `public AllowSymLinkAliasChecker()`

**Methods:**
- `public boolean check(java.lang.String p0, org.eclipse.jetty.util.resource.Resource p1)`

---

## public class `org.eclipse.jetty.server.handler.AsyncDelayHandler`
extends `org.eclipse.jetty.server.handler.HandlerWrapper`  

**Constructors:**
- `public AsyncDelayHandler()`

**Fields:**
- `public final static java.lang.String AHW_ATTR`

**Methods:**
- `protected void delayHandling(org.eclipse.jetty.server.Request p0, jakarta.servlet.AsyncContext p1)`
- `protected void endHandling(org.eclipse.jetty.server.Request p0)`
- `public void handle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `protected boolean startHandling(org.eclipse.jetty.server.Request p0, boolean p1)`

---

## public class `org.eclipse.jetty.server.handler.BufferedResponseHandler`
extends `org.eclipse.jetty.server.handler.HandlerWrapper`  

**Constructors:**
- `public BufferedResponseHandler()`

**Methods:**
- `public org.eclipse.jetty.util.IncludeExclude getMethodIncludeExclude()`
- `public org.eclipse.jetty.util.IncludeExclude getMimeIncludeExclude()`
- `public org.eclipse.jetty.util.IncludeExclude getPathIncludeExclude()`
- `public void handle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `protected boolean isMimeTypeBufferable(java.lang.String p0)`
- `protected boolean isPathBufferable(java.lang.String p0)`
- `protected org.eclipse.jetty.server.handler.BufferedResponseHandler$BufferedInterceptor newBufferedInterceptor(org.eclipse.jetty.server.HttpChannel p0, org.eclipse.jetty.server.HttpOutput$Interceptor p1)`
- `protected boolean shouldBuffer(org.eclipse.jetty.server.HttpChannel p0, boolean p1)`

---

## protected abstract static interface `org.eclipse.jetty.server.handler.BufferedResponseHandler$BufferedInterceptor`
implements `org.eclipse.jetty.server.HttpOutput$Interceptor`  

---

## public class `org.eclipse.jetty.server.handler.ContextHandler`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.server.handler.ScopedHandler`  
implements `org.eclipse.jetty.util.Attributes`, `org.eclipse.jetty.util.component.Graceful`  

**Constructors:**
- `public ContextHandler()`
- `public ContextHandler(java.lang.String p0)`
- `public ContextHandler(org.eclipse.jetty.server.HandlerContainer p0, java.lang.String p1)`
- `protected ContextHandler(org.eclipse.jetty.server.handler.ContextHandler$Context p0)`
- `protected ContextHandler(org.eclipse.jetty.server.handler.ContextHandler$Context p0, org.eclipse.jetty.server.HandlerContainer p1, java.lang.String p2)`

**Fields:**
- `public final static int DEFAULT_LISTENER_TYPE_INDEX`
- `public final static int DEFAULT_MAX_FORM_CONTENT_SIZE`
- `public final static int DEFAULT_MAX_FORM_KEYS`
- `public final static int EXTENDED_LISTENER_TYPE_INDEX`
- `public final static java.lang.String MANAGED_ATTRIBUTES`
- `public final static java.lang.String MAX_FORM_CONTENT_SIZE_KEY`
- `public final static java.lang.String MAX_FORM_KEYS_KEY`
- `public final static java.lang.Class[] SERVLET_LISTENER_TYPES`
- `public final static int SERVLET_MAJOR_VERSION`
- `public final static int SERVLET_MINOR_VERSION`
- `protected org.eclipse.jetty.server.handler.ContextHandler$ContextStatus _contextStatus`
- `protected org.eclipse.jetty.server.handler.ContextHandler$Context _scontext`

**Methods:**
- `public void addAliasCheck(org.eclipse.jetty.server.handler.ContextHandler$AliasCheck p0)`
- `public boolean addEventListener(java.util.EventListener p0)`
- `public void addLocaleEncoding(java.lang.String p0, java.lang.String p1)`
- `protected void addProgrammaticListener(java.util.EventListener p0)`
- `public void addVirtualHosts(java.lang.String[] p0)`
- `protected void callContextDestroyed(jakarta.servlet.ServletContextListener p0, jakarta.servlet.ServletContextEvent p1)`
- `protected void callContextInitialized(jakarta.servlet.ServletContextListener p0, jakarta.servlet.ServletContextEvent p1)`
- `public boolean checkAlias(java.lang.String p0, org.eclipse.jetty.util.resource.Resource p1)`
- `public boolean checkContext(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletResponse p2) throws java.io.IOException`
- `public boolean checkContextPath(java.lang.String p0)`
- `public boolean checkVirtualHost(org.eclipse.jetty.server.Request p0)`
- `public void clearAliasChecks()`
- `public void clearAttributes()`
- `public void contextDestroyed() throws java.lang.Exception`
- `public void contextInitialized() throws java.lang.Exception`
- `public void doHandle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `public void doScope(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `protected void doStart() throws java.lang.Exception`
- `protected void doStop() throws java.lang.Exception`
- `public void dump(java.lang.Appendable p0, java.lang.String p1) throws java.io.IOException`
- `protected void enterScope(org.eclipse.jetty.server.Request p0, java.lang.Object p1)`
- `protected void exitScope(org.eclipse.jetty.server.Request p0)`
- `public java.util.List getAliasChecks()`
- `public boolean getAllowNullPathInfo()`
- `public java.lang.Object getAttribute(java.lang.String p0)`
- `public java.util.Set getAttributeNameSet()`
- `public java.util.Enumeration getAttributeNames()`
- `public org.eclipse.jetty.util.Attributes getAttributes()`
- `public org.eclipse.jetty.util.resource.Resource getBaseResource()`
- `public java.lang.ClassLoader getClassLoader()`
- `public java.lang.String getClassPath()`
- `public static org.eclipse.jetty.server.handler.ContextHandler getContextHandler(jakarta.servlet.ServletContext p0)`
- `public java.lang.String getContextPath()`
- `public java.lang.String getContextPathEncoded()`
- `public static org.eclipse.jetty.server.handler.ContextHandler$Context getCurrentContext()`
- `public java.lang.String getDefaultRequestCharacterEncoding()`
- `public java.lang.String getDefaultResponseCharacterEncoding()`
- `public java.lang.String getDisplayName()`
- `public org.eclipse.jetty.server.handler.ErrorHandler getErrorHandler()`
- `public java.lang.String getInitParameter(java.lang.String p0)`
- `public java.util.Enumeration getInitParameterNames()`
- `public java.util.Map getInitParams()`
- `public java.lang.String getLocaleEncoding(java.lang.String p0)`
- `public java.lang.String getLocaleEncoding(java.util.Locale p0)`
- `public java.util.Map getLocaleEncodings()`
- `public org.slf4j.Logger getLogger()`
- `public int getMaxFormContentSize()`
- `public int getMaxFormKeys()`
- `public org.eclipse.jetty.http.MimeTypes getMimeTypes()`
- `public java.lang.String[] getProtectedTargets()`
- `public java.lang.String getRequestContextPath()`
- `public org.eclipse.jetty.util.resource.Resource getResource(java.lang.String p0) throws java.net.MalformedURLException`
- `public java.lang.String getResourceBase()`
- `public java.util.Set getResourcePaths(java.lang.String p0)`
- `public static java.lang.String getServerInfo()`
- `public org.eclipse.jetty.server.handler.ContextHandler$Context getServletContext()`
- `public java.lang.String[] getVirtualHosts()`
- `public java.lang.String[] getWelcomeFiles()`
- `public void handle(java.lang.Runnable p0)`
- `public void handle(org.eclipse.jetty.server.Request p0, java.lang.Runnable p1)`
- `public boolean isAvailable()`
- `public boolean isCompactPath()`
- `public boolean isContextPathDefault()`
- `public boolean isDurableListener(java.util.EventListener p0)`
- `public boolean isProgrammaticListener(java.util.EventListener p0)`
- `public boolean isProtectedTarget(java.lang.String p0)`
- `public boolean isShutdown()`
- `public boolean isUsingSecurityManager()`
- `public java.lang.Class loadClass(java.lang.String p0) throws java.lang.ClassNotFoundException`
- `public org.eclipse.jetty.util.resource.Resource newResource(java.lang.String p0) throws java.io.IOException`
- `public org.eclipse.jetty.util.resource.Resource newResource(java.net.URI p0) throws java.io.IOException`
- `public org.eclipse.jetty.util.resource.Resource newResource(java.net.URL p0) throws java.io.IOException`
- `public void removeAttribute(java.lang.String p0)`
- `public boolean removeEventListener(java.util.EventListener p0)`
- `public void removeVirtualHosts(java.lang.String[] p0)`
- `protected void requestDestroyed(org.eclipse.jetty.server.Request p0, jakarta.servlet.http.HttpServletRequest p1)`
- `protected void requestInitialized(org.eclipse.jetty.server.Request p0, jakarta.servlet.http.HttpServletRequest p1)`
- `public void setAliasChecks(java.util.List p0)`
- `public void setAllowNullPathInfo(boolean p0)`
- `public void setAttribute(java.lang.String p0, java.lang.Object p1)`
- `public void setAttributes(org.eclipse.jetty.util.Attributes p0)`
- `public void setAvailable(boolean p0)`
- `public void setBaseResource(org.eclipse.jetty.util.resource.Resource p0)`
- `public void setClassLoader(java.lang.ClassLoader p0)`
- `public void setCompactPath(boolean p0)`
- `public void setContextPath(java.lang.String p0)`
- `public void setDefaultContextPath(java.lang.String p0)`
- `public void setDefaultRequestCharacterEncoding(java.lang.String p0)`
- `public void setDefaultResponseCharacterEncoding(java.lang.String p0)`
- `public void setDisplayName(java.lang.String p0)`
- `public void setErrorHandler(org.eclipse.jetty.server.handler.ErrorHandler p0)`
- `public java.lang.String setInitParameter(java.lang.String p0, java.lang.String p1)`
- `public void setLogger(org.slf4j.Logger p0)`
- `public void setMaxFormContentSize(int p0)`
- `public void setMaxFormKeys(int p0)`
- `public void setMimeTypes(org.eclipse.jetty.http.MimeTypes p0)`
- `public void setProtectedTargets(java.lang.String[] p0)`
- `public void setResourceBase(java.lang.String p0)`
- `public void setServer(org.eclipse.jetty.server.Server p0)`
- `public static void setServerInfo(java.lang.String p0)`
- `public void setUsingSecurityManager(boolean p0)`
- `public void setVirtualHosts(java.lang.String[] p0)`
- `public void setWelcomeFiles(java.lang.String[] p0)`
- `public java.util.concurrent.CompletableFuture shutdown()`
- `protected void startContext() throws java.lang.Exception`
- `protected void stopContext() throws java.lang.Exception`
- `public java.lang.String toString()`

---

## public abstract static interface `org.eclipse.jetty.server.handler.ContextHandler$AliasCheck`

**Methods:**
- `public abstract boolean check(java.lang.String p0, org.eclipse.jetty.util.resource.Resource p1)`

---

## public static class `org.eclipse.jetty.server.handler.ContextHandler$ApproveAliases`
annotations: @java.lang.Deprecated  
implements `org.eclipse.jetty.server.handler.ContextHandler$AliasCheck`  

**Constructors:**
- `public ApproveAliases()`

**Methods:**
- `public boolean check(java.lang.String p0, org.eclipse.jetty.util.resource.Resource p1)`

---

## public static class `org.eclipse.jetty.server.handler.ContextHandler$ApproveNonExistentDirectoryAliases`
annotations: @java.lang.Deprecated  
implements `org.eclipse.jetty.server.handler.ContextHandler$AliasCheck`  

**Constructors:**
- `public ApproveNonExistentDirectoryAliases()`

**Methods:**
- `public boolean check(java.lang.String p0, org.eclipse.jetty.util.resource.Resource p1)`

---

## public final static enum `org.eclipse.jetty.server.handler.ContextHandler$Availability`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.eclipse.jetty.server.handler.ContextHandler$Availability AVAILABLE`
- `public final static org.eclipse.jetty.server.handler.ContextHandler$Availability SHUTDOWN`
- `public final static org.eclipse.jetty.server.handler.ContextHandler$Availability STARTING`
- `public final static org.eclipse.jetty.server.handler.ContextHandler$Availability STOPPED`
- `public final static org.eclipse.jetty.server.handler.ContextHandler$Availability UNAVAILABLE`

---

## public class `org.eclipse.jetty.server.handler.ContextHandler$Context`
extends `org.eclipse.jetty.server.handler.ContextHandler$StaticContext`  

**Constructors:**
- `protected Context()`

**Fields:**
- `protected boolean _enabled`
- `protected boolean _extendedListenerTypes`

**Methods:**
- `public <T extends java.util.EventListener> void addListener(T p0)`
- `public void addListener(java.lang.Class p0)`
- `public void addListener(java.lang.String p0)`
- `public void checkListener(java.lang.Class p0) throws java.lang.IllegalStateException`
- `public void declareRoles(java.lang.String... p0)`
- `public java.lang.Object getAttribute(java.lang.String p0)`
- `public java.util.Enumeration getAttributeNames()`
- `public java.lang.ClassLoader getClassLoader()`
- `public jakarta.servlet.ServletContext getContext(java.lang.String p0)`
- `public org.eclipse.jetty.server.handler.ContextHandler getContextHandler()`
- `public java.lang.String getContextPath()`
- `public java.lang.String getInitParameter(java.lang.String p0)`
- `public java.util.Enumeration getInitParameterNames()`
- `public jakarta.servlet.descriptor.JspConfigDescriptor getJspConfigDescriptor()`
- `public java.lang.String getMimeType(java.lang.String p0)`
- `public java.lang.String getRealPath(java.lang.String p0)`
- `public jakarta.servlet.RequestDispatcher getRequestDispatcher(java.lang.String p0)`
- `public java.net.URL getResource(java.lang.String p0) throws java.net.MalformedURLException`
- `public java.io.InputStream getResourceAsStream(java.lang.String p0)`
- `public java.util.Set getResourcePaths(java.lang.String p0)`
- `public java.lang.String getServletContextName()`
- `public java.lang.String getVirtualServerName()`
- `public boolean isEnabled()`
- `public boolean isExtendedListenerTypes()`
- `public void log(java.lang.Exception p0, java.lang.String p1)`
- `public void log(java.lang.String p0)`
- `public void log(java.lang.String p0, java.lang.Throwable p1)`
- `public void removeAttribute(java.lang.String p0)`
- `public void setAttribute(java.lang.String p0, java.lang.Object p1)`
- `public void setEnabled(boolean p0)`
- `public void setExtendedListenerTypes(boolean p0)`
- `public boolean setInitParameter(java.lang.String p0, java.lang.String p1)`
- `public void setJspConfigDescriptor(jakarta.servlet.descriptor.JspConfigDescriptor p0)`
- `public java.lang.String toString()`

---

## public abstract static interface `org.eclipse.jetty.server.handler.ContextHandler$ContextScopeListener`
implements `java.util.EventListener`  

**Methods:**
- `public abstract void enterScope(org.eclipse.jetty.server.handler.ContextHandler$Context p0, org.eclipse.jetty.server.Request p1, java.lang.Object p2)`
- `public abstract void exitScope(org.eclipse.jetty.server.handler.ContextHandler$Context p0, org.eclipse.jetty.server.Request p1)`

---

## public final static enum `org.eclipse.jetty.server.handler.ContextHandler$ContextStatus`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.eclipse.jetty.server.handler.ContextHandler$ContextStatus DESTROYED`
- `public final static org.eclipse.jetty.server.handler.ContextHandler$ContextStatus INITIALIZED`
- `public final static org.eclipse.jetty.server.handler.ContextHandler$ContextStatus NOTSET`

---

## public static class `org.eclipse.jetty.server.handler.ContextHandler$StaticContext`
extends `org.eclipse.jetty.util.AttributesMap`  
implements `jakarta.servlet.ServletContext`  

**Constructors:**
- `public StaticContext()`

**Methods:**
- `public jakarta.servlet.FilterRegistration$Dynamic addFilter(java.lang.String p0, jakarta.servlet.Filter p1)`
- `public jakarta.servlet.FilterRegistration$Dynamic addFilter(java.lang.String p0, java.lang.Class p1)`
- `public jakarta.servlet.FilterRegistration$Dynamic addFilter(java.lang.String p0, java.lang.String p1)`
- `public jakarta.servlet.ServletRegistration$Dynamic addJspFile(java.lang.String p0, java.lang.String p1)`
- `public <T extends java.util.EventListener> void addListener(T p0)`
- `public void addListener(java.lang.Class p0)`
- `public void addListener(java.lang.String p0)`
- `public jakarta.servlet.ServletRegistration$Dynamic addServlet(java.lang.String p0, jakarta.servlet.Servlet p1)`
- `public jakarta.servlet.ServletRegistration$Dynamic addServlet(java.lang.String p0, java.lang.Class p1)`
- `public jakarta.servlet.ServletRegistration$Dynamic addServlet(java.lang.String p0, java.lang.String p1)`
- `public <T extends jakarta.servlet.Filter> T createFilter(java.lang.Class p0) throws jakarta.servlet.ServletException`
- `public <T extends java.lang.Object> T createInstance(java.lang.Class p0) throws jakarta.servlet.ServletException`
- `public <T extends java.util.EventListener> T createListener(java.lang.Class p0) throws jakarta.servlet.ServletException`
- `public <T extends jakarta.servlet.Servlet> T createServlet(java.lang.Class p0) throws jakarta.servlet.ServletException`
- `public void declareRoles(java.lang.String... p0)`
- `public java.lang.ClassLoader getClassLoader()`
- `public jakarta.servlet.ServletContext getContext(java.lang.String p0)`
- `public java.lang.String getContextPath()`
- `public java.util.Set getDefaultSessionTrackingModes()`
- `public int getEffectiveMajorVersion()`
- `public int getEffectiveMinorVersion()`
- `public java.util.Set getEffectiveSessionTrackingModes()`
- `public jakarta.servlet.FilterRegistration getFilterRegistration(java.lang.String p0)`
- `public java.util.Map getFilterRegistrations()`
- `public java.lang.String getInitParameter(java.lang.String p0)`
- `public java.util.Enumeration getInitParameterNames()`
- `public jakarta.servlet.descriptor.JspConfigDescriptor getJspConfigDescriptor()`
- `public int getMajorVersion()`
- `public java.lang.String getMimeType(java.lang.String p0)`
- `public int getMinorVersion()`
- `public jakarta.servlet.RequestDispatcher getNamedDispatcher(java.lang.String p0)`
- `public java.lang.String getRealPath(java.lang.String p0)`
- `public java.lang.String getRequestCharacterEncoding()`
- `public jakarta.servlet.RequestDispatcher getRequestDispatcher(java.lang.String p0)`
- `public java.net.URL getResource(java.lang.String p0) throws java.net.MalformedURLException`
- `public java.io.InputStream getResourceAsStream(java.lang.String p0)`
- `public java.util.Set getResourcePaths(java.lang.String p0)`
- `public java.lang.String getResponseCharacterEncoding()`
- `public java.lang.String getServerInfo()`
- `public jakarta.servlet.Servlet getServlet(java.lang.String p0) throws jakarta.servlet.ServletException`
- `public java.lang.String getServletContextName()`
- `public java.util.Enumeration getServletNames()`
- `public jakarta.servlet.ServletRegistration getServletRegistration(java.lang.String p0)`
- `public java.util.Map getServletRegistrations()`
- `public java.util.Enumeration getServlets()`
- `public jakarta.servlet.SessionCookieConfig getSessionCookieConfig()`
- `public int getSessionTimeout()`
- `public java.lang.String getVirtualServerName()`
- `public void log(java.lang.Exception p0, java.lang.String p1)`
- `public void log(java.lang.String p0)`
- `public void log(java.lang.String p0, java.lang.Throwable p1)`
- `public void setEffectiveMajorVersion(int p0)`
- `public void setEffectiveMinorVersion(int p0)`
- `public boolean setInitParameter(java.lang.String p0, java.lang.String p1)`
- `public void setRequestCharacterEncoding(java.lang.String p0)`
- `public void setResponseCharacterEncoding(java.lang.String p0)`
- `public void setSessionTimeout(int p0)`
- `public void setSessionTrackingModes(java.util.Set p0)`

---

## public class `org.eclipse.jetty.server.handler.ContextHandlerCollection`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.server.handler.HandlerCollection`  

**Constructors:**
- `public ContextHandlerCollection()`
- `public ContextHandlerCollection(org.eclipse.jetty.server.handler.ContextHandler... p0)`

**Methods:**
- `public void deployHandler(org.eclipse.jetty.server.Handler p0, org.eclipse.jetty.util.Callback p1)`
- `public void handle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `public void mapContexts()`
- `protected org.eclipse.jetty.server.handler.HandlerCollection$Handlers newHandlers(org.eclipse.jetty.server.Handler[] p0)`
- `public void undeployHandler(org.eclipse.jetty.server.Handler p0, org.eclipse.jetty.util.Callback p1)`

---

## public class `org.eclipse.jetty.server.handler.DebugHandler`
extends `org.eclipse.jetty.server.handler.HandlerWrapper`  
implements `org.eclipse.jetty.io.Connection$Listener`  

**Constructors:**
- `public DebugHandler()`

**Methods:**
- `protected void doStart() throws java.lang.Exception`
- `protected void doStop() throws java.lang.Exception`
- `public java.io.OutputStream getOutputStream()`
- `public void handle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `public void onClosed(org.eclipse.jetty.io.Connection p0)`
- `public void onOpened(org.eclipse.jetty.io.Connection p0)`
- `public void setOutputStream(java.io.OutputStream p0)`

---

## public class `org.eclipse.jetty.server.handler.DefaultHandler`
extends `org.eclipse.jetty.server.handler.AbstractHandler`  

**Constructors:**
- `public DefaultHandler()`

**Methods:**
- `public boolean getServeIcon()`
- `public boolean getShowContexts()`
- `public void handle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `public void setServeIcon(boolean p0)`
- `public void setShowContexts(boolean p0)`

---

## public class `org.eclipse.jetty.server.handler.ErrorHandler`
extends `org.eclipse.jetty.server.handler.AbstractHandler`  

**Constructors:**
- `public ErrorHandler()`

**Fields:**
- `public final static java.lang.String ERROR_CHARSET`
- `public final static java.lang.String ERROR_CONTEXT`
- `public final static java.lang.String ERROR_PAGE`

**Methods:**
- `public java.nio.ByteBuffer badMessageError(int p0, java.lang.String p1, org.eclipse.jetty.http.HttpFields$Mutable p2)`
- `public boolean errorPageForMethod(java.lang.String p0)`
- `protected void generateAcceptableResponse(org.eclipse.jetty.server.Request p0, jakarta.servlet.http.HttpServletRequest p1, jakarta.servlet.http.HttpServletResponse p2, int p3, java.lang.String p4) throws java.io.IOException`
- `protected void generateAcceptableResponse(org.eclipse.jetty.server.Request p0, jakarta.servlet.http.HttpServletRequest p1, jakarta.servlet.http.HttpServletResponse p2, int p3, java.lang.String p4, java.lang.String p5) throws java.io.IOException`
- `protected java.io.Writer getAcceptableWriter(org.eclipse.jetty.server.Request p0, jakarta.servlet.http.HttpServletRequest p1, jakarta.servlet.http.HttpServletResponse p2) throws java.io.IOException`
- `public java.lang.String getCacheControl()`
- `public static org.eclipse.jetty.server.handler.ErrorHandler getErrorHandler(org.eclipse.jetty.server.Server p0, org.eclipse.jetty.server.handler.ContextHandler p1)`
- `public boolean getShowMessageInTitle()`
- `public void handle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `protected void handleErrorPage(jakarta.servlet.http.HttpServletRequest p0, java.io.Writer p1, int p2, java.lang.String p3) throws java.io.IOException`
- `public boolean isShowServlet()`
- `public boolean isShowStacks()`
- `public void setCacheControl(java.lang.String p0)`
- `public void setShowMessageInTitle(boolean p0)`
- `public void setShowServlet(boolean p0)`
- `public void setShowStacks(boolean p0)`
- `protected void write(java.io.Writer p0, java.lang.String p1) throws java.io.IOException`
- `protected void writeErrorPage(jakarta.servlet.http.HttpServletRequest p0, java.io.Writer p1, int p2, java.lang.String p3, boolean p4) throws java.io.IOException`
- `protected void writeErrorPageBody(jakarta.servlet.http.HttpServletRequest p0, java.io.Writer p1, int p2, java.lang.String p3, boolean p4) throws java.io.IOException`
- `protected void writeErrorPageHead(jakarta.servlet.http.HttpServletRequest p0, java.io.Writer p1, int p2, java.lang.String p3) throws java.io.IOException`
- `protected void writeErrorPageMessage(jakarta.servlet.http.HttpServletRequest p0, java.io.Writer p1, int p2, java.lang.String p3, java.lang.String p4) throws java.io.IOException`
- `protected void writeErrorPageStacks(jakarta.servlet.http.HttpServletRequest p0, java.io.Writer p1) throws java.io.IOException`

---

## public abstract static interface `org.eclipse.jetty.server.handler.ErrorHandler$ErrorPageMapper`

**Methods:**
- `public abstract java.lang.String getErrorPage(jakarta.servlet.http.HttpServletRequest p0)`

---

## public class `org.eclipse.jetty.server.handler.FileBufferedResponseHandler`
extends `org.eclipse.jetty.server.handler.BufferedResponseHandler`  

**Constructors:**
- `public FileBufferedResponseHandler()`

**Methods:**
- `public java.nio.file.Path getTempDir()`
- `protected org.eclipse.jetty.server.handler.BufferedResponseHandler$BufferedInterceptor newBufferedInterceptor(org.eclipse.jetty.server.HttpChannel p0, org.eclipse.jetty.server.HttpOutput$Interceptor p1)`
- `public void setTempDir(java.nio.file.Path p0)`

---

## public class `org.eclipse.jetty.server.handler.HandlerCollection`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.server.handler.AbstractHandlerContainer`  

**Constructors:**
- `public HandlerCollection()`
- `public HandlerCollection(boolean p0, org.eclipse.jetty.server.Handler... p1)`
- `public HandlerCollection(org.eclipse.jetty.server.Handler... p0)`

**Fields:**
- `protected final java.util.concurrent.atomic.AtomicReference _handlers`

**Methods:**
- `public void addHandler(org.eclipse.jetty.server.Handler p0)`
- `public void destroy()`
- `protected void expandChildren(java.util.List p0, java.lang.Class p1)`
- `public org.eclipse.jetty.server.Handler[] getHandlers()`
- `public void handle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `protected org.eclipse.jetty.server.handler.HandlerCollection$Handlers newHandlers(org.eclipse.jetty.server.Handler[] p0)`
- `public void prependHandler(org.eclipse.jetty.server.Handler p0)`
- `public void removeHandler(org.eclipse.jetty.server.Handler p0)`
- `public void setHandlers(org.eclipse.jetty.server.Handler[] p0)`
- `protected boolean updateHandlers(org.eclipse.jetty.server.handler.HandlerCollection$Handlers p0, org.eclipse.jetty.server.handler.HandlerCollection$Handlers p1)`

---

## protected static class `org.eclipse.jetty.server.handler.HandlerCollection$Handlers`

**Constructors:**
- `protected Handlers(org.eclipse.jetty.server.Handler[] p0)`

**Methods:**
- `public org.eclipse.jetty.server.Handler[] getHandlers()`

---

## public class `org.eclipse.jetty.server.handler.HandlerList`
extends `org.eclipse.jetty.server.handler.HandlerCollection`  

**Constructors:**
- `public HandlerList()`
- `public HandlerList(org.eclipse.jetty.server.Handler... p0)`

**Methods:**
- `public void handle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`

---

## public class `org.eclipse.jetty.server.handler.HandlerWrapper`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.server.handler.AbstractHandlerContainer`  

**Constructors:**
- `public HandlerWrapper()`

**Fields:**
- `protected org.eclipse.jetty.server.Handler _handler`

**Methods:**
- `public void destroy()`
- `protected void expandChildren(java.util.List p0, java.lang.Class p1)`
- `public org.eclipse.jetty.server.Handler getHandler()`
- `public org.eclipse.jetty.server.Handler[] getHandlers()`
- `public void handle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `public void insertHandler(org.eclipse.jetty.server.handler.HandlerWrapper p0)`
- `public void setHandler(org.eclipse.jetty.server.Handler p0)`

---

## public class `org.eclipse.jetty.server.handler.HotSwapHandler`
extends `org.eclipse.jetty.server.handler.AbstractHandlerContainer`  

**Constructors:**
- `public HotSwapHandler()`

**Methods:**
- `public void destroy()`
- `protected void doStart() throws java.lang.Exception`
- `protected void doStop() throws java.lang.Exception`
- `protected void expandChildren(java.util.List p0, java.lang.Class p1)`
- `public org.eclipse.jetty.server.Handler getHandler()`
- `public org.eclipse.jetty.server.Handler[] getHandlers()`
- `public void handle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `public void setHandler(org.eclipse.jetty.server.Handler p0)`

---

## public class `org.eclipse.jetty.server.handler.IdleTimeoutHandler`
extends `org.eclipse.jetty.server.handler.HandlerWrapper`  

**Constructors:**
- `public IdleTimeoutHandler()`

**Methods:**
- `public long getIdleTimeoutMs()`
- `public void handle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `public boolean isApplyToAsync()`
- `public void setApplyToAsync(boolean p0)`
- `public void setIdleTimeoutMs(long p0)`

---

## public class `org.eclipse.jetty.server.handler.InetAccessHandler`
extends `org.eclipse.jetty.server.handler.HandlerWrapper`  

**Constructors:**
- `public InetAccessHandler()`

**Methods:**
- `public void clear()`
- `public void dump(java.lang.Appendable p0, java.lang.String p1) throws java.io.IOException`
- `public void exclude(java.lang.String p0)`
- `public void exclude(java.lang.String p0, java.lang.String p1, org.eclipse.jetty.http.pathmap.PathSpec p2)`
- `public void exclude(java.lang.String... p0)`
- `public void excludeConnector(java.lang.String p0)`
- `public void excludeConnectors(java.lang.String... p0)`
- `public void handle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `public void include(java.lang.String p0)`
- `public void include(java.lang.String p0, java.lang.String p1, org.eclipse.jetty.http.pathmap.PathSpec p2)`
- `public void include(java.lang.String... p0)`
- `public void includeConnector(java.lang.String p0)`
- `public void includeConnectors(java.lang.String... p0)`
- `protected boolean isAllowed(java.net.InetAddress p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2)`

---

## public class `org.eclipse.jetty.server.handler.InetAccessSet`
extends `java.util.AbstractSet`  
implements `java.util.Set<org.eclipse.jetty.server.handler.InetAccessSet$PatternTuple>`, `java.util.function.Predicate<org.eclipse.jetty.server.handler.InetAccessSet$AccessTuple>`  

**Constructors:**
- `public InetAccessSet()`

**Methods:**
- `public boolean add(org.eclipse.jetty.server.handler.InetAccessSet$PatternTuple p0)`
- `public java.util.Iterator iterator()`
- `public boolean remove(java.lang.Object p0)`
- `public int size()`
- `public boolean test(org.eclipse.jetty.server.handler.InetAccessSet$AccessTuple p0)`

---

## public class `org.eclipse.jetty.server.handler.ManagedAttributeListener`
implements `jakarta.servlet.ServletContextAttributeListener`, `jakarta.servlet.ServletContextListener`  

**Constructors:**
- `public ManagedAttributeListener(org.eclipse.jetty.server.handler.ContextHandler p0, java.lang.String... p1)`

**Methods:**
- `public void attributeAdded(jakarta.servlet.ServletContextAttributeEvent p0)`
- `public void attributeRemoved(jakarta.servlet.ServletContextAttributeEvent p0)`
- `public void attributeReplaced(jakarta.servlet.ServletContextAttributeEvent p0)`
- `public void contextDestroyed(jakarta.servlet.ServletContextEvent p0)`
- `public void contextInitialized(jakarta.servlet.ServletContextEvent p0)`
- `protected void updateBean(java.lang.String p0, java.lang.Object p1, java.lang.Object p2)`

---

## public class `org.eclipse.jetty.server.handler.MovedContextHandler`
extends `org.eclipse.jetty.server.handler.ContextHandler`  

**Constructors:**
- `public MovedContextHandler()`
- `public MovedContextHandler(org.eclipse.jetty.server.HandlerContainer p0, java.lang.String p1, java.lang.String p2)`

**Methods:**
- `public java.lang.String getExpires()`
- `public java.lang.String getNewContextURL()`
- `public boolean isDiscardPathInfo()`
- `public boolean isDiscardQuery()`
- `public boolean isPermanent()`
- `public void setDiscardPathInfo(boolean p0)`
- `public void setDiscardQuery(boolean p0)`
- `public void setExpires(java.lang.String p0)`
- `public void setNewContextURL(java.lang.String p0)`
- `public void setPermanent(boolean p0)`

---

## public class `org.eclipse.jetty.server.handler.RequestLogHandler`
extends `org.eclipse.jetty.server.handler.HandlerWrapper`  

**Constructors:**
- `public RequestLogHandler()`

**Methods:**
- `public org.eclipse.jetty.server.RequestLog getRequestLog()`
- `public void handle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `public void setRequestLog(org.eclipse.jetty.server.RequestLog p0)`

---

## public class `org.eclipse.jetty.server.handler.ResourceHandler`
extends `org.eclipse.jetty.server.handler.HandlerWrapper`  
implements `org.eclipse.jetty.server.ResourceService$WelcomeFactory`, `org.eclipse.jetty.util.resource.ResourceFactory`  

**Constructors:**
- `public ResourceHandler()`
- `public ResourceHandler(org.eclipse.jetty.server.ResourceService p0)`

**Methods:**
- `public void doStart() throws java.lang.Exception`
- `public org.eclipse.jetty.util.resource.Resource getBaseResource()`
- `public java.lang.String getCacheControl()`
- `public static org.eclipse.jetty.util.resource.Resource getDefaultStylesheet()`
- `public java.util.List getGzipEquivalentFileExtensions()`
- `public org.eclipse.jetty.http.MimeTypes getMimeTypes()`
- `public org.eclipse.jetty.http.CompressedContentFormat[] getPrecompressedFormats()`
- `public org.eclipse.jetty.util.resource.Resource getResource(java.lang.String p0) throws java.io.IOException`
- `public java.lang.String getResourceBase()`
- `public org.eclipse.jetty.util.resource.Resource getStylesheet()`
- `public java.lang.String getWelcomeFile(java.lang.String p0) throws java.io.IOException`
- `public java.lang.String[] getWelcomeFiles()`
- `public void handle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `public boolean isAcceptRanges()`
- `public boolean isDirAllowed()`
- `public boolean isDirectoriesListed()`
- `public boolean isEtags()`
- `public boolean isPathInfoOnly()`
- `public boolean isRedirectWelcome()`
- `public void setAcceptRanges(boolean p0)`
- `public void setBaseResource(org.eclipse.jetty.util.resource.Resource p0)`
- `public void setCacheControl(java.lang.String p0)`
- `public void setDirAllowed(boolean p0)`
- `public void setDirectoriesListed(boolean p0)`
- `public void setEtags(boolean p0)`
- `public void setGzipEquivalentFileExtensions(java.util.List p0)`
- `public void setMimeTypes(org.eclipse.jetty.http.MimeTypes p0)`
- `public void setPathInfoOnly(boolean p0)`
- `public void setPrecompressedFormats(org.eclipse.jetty.http.CompressedContentFormat[] p0)`
- `public void setRedirectWelcome(boolean p0)`
- `public void setResourceBase(java.lang.String p0)`
- `public void setStylesheet(java.lang.String p0)`
- `public void setWelcomeFiles(java.lang.String[] p0)`

---

## public abstract class `org.eclipse.jetty.server.handler.ScopedHandler`
extends `org.eclipse.jetty.server.handler.HandlerWrapper`  

**Constructors:**
- `public ScopedHandler()`

**Fields:**
- `protected org.eclipse.jetty.server.handler.ScopedHandler _nextScope`
- `protected org.eclipse.jetty.server.handler.ScopedHandler _outerScope`

**Methods:**
- `public abstract void doHandle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `public void doScope(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `protected void doStart() throws java.lang.Exception`
- `public final void handle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `public final void nextHandle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `public final void nextScope(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`

---

## public class `org.eclipse.jetty.server.handler.SecuredRedirectHandler`
extends `org.eclipse.jetty.server.handler.HandlerWrapper`  

**Constructors:**
- `public SecuredRedirectHandler()`
- `public SecuredRedirectHandler(int p0)`

**Methods:**
- `public void handle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`

---

## public class `org.eclipse.jetty.server.handler.ShutdownHandler`
extends `org.eclipse.jetty.server.handler.HandlerWrapper`  

**Constructors:**
- `public ShutdownHandler(java.lang.String p0)`
- `public ShutdownHandler(java.lang.String p0, boolean p1, boolean p2)`

**Methods:**
- `protected void doShutdown(org.eclipse.jetty.server.Request p0, jakarta.servlet.http.HttpServletResponse p1) throws java.io.IOException`
- `protected void doStart() throws java.lang.Exception`
- `public java.lang.String getShutdownToken()`
- `public void handle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `public boolean isExitJvm()`
- `public boolean isSendShutdownAtStart()`
- `public void sendShutdown() throws java.io.IOException`
- `public void setExitJvm(boolean p0)`
- `public void setSendShutdownAtStart(boolean p0)`

---

## public class `org.eclipse.jetty.server.handler.StatisticsHandler`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.server.handler.HandlerWrapper`  
implements `org.eclipse.jetty.util.component.Graceful`  

**Constructors:**
- `public StatisticsHandler()`

**Methods:**
- `protected void doStart() throws java.lang.Exception`
- `protected void doStop() throws java.lang.Exception`
- `public int getAsyncDispatches()`
- `public int getAsyncRequests()`
- `public int getAsyncRequestsWaiting()`
- `public int getAsyncRequestsWaitingMax()`
- `public int getDispatched()`
- `public int getDispatchedActive()`
- `public int getDispatchedActiveMax()`
- `public long getDispatchedTimeMax()`
- `public double getDispatchedTimeMean()`
- `public double getDispatchedTimeStdDev()`
- `public long getDispatchedTimeTotal()`
- `public int getErrors()`
- `public int getExpires()`
- `public boolean getGracefulShutdownWaitsForRequests()`
- `public long getRequestTimeMax()`
- `public double getRequestTimeMean()`
- `public double getRequestTimeStdDev()`
- `public long getRequestTimeTotal()`
- `public int getRequests()`
- `public int getRequestsActive()`
- `public int getRequestsActiveMax()`
- `public int getResponses1xx()`
- `public int getResponses2xx()`
- `public int getResponses3xx()`
- `public int getResponses4xx()`
- `public int getResponses5xx()`
- `public long getResponsesBytesTotal()`
- `public int getResponsesThrown()`
- `public long getStatsOnMs()`
- `public void handle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `public boolean isShutdown()`
- `public void setGracefulShutdownWaitsForRequests(boolean p0)`
- `public java.util.concurrent.CompletableFuture shutdown()`
- `public void statsReset()`
- `public java.lang.String toStatsHTML()`
- `public java.lang.String toString()`
- `protected void updateResponse(org.eclipse.jetty.server.Request p0, boolean p1)`

---

## public class `org.eclipse.jetty.server.handler.ThreadLimitHandler`
extends `org.eclipse.jetty.server.handler.HandlerWrapper`  

**Constructors:**
- `public ThreadLimitHandler()`
- `public ThreadLimitHandler(java.lang.String p0)`
- `public ThreadLimitHandler(java.lang.String p0, boolean p1)`

**Methods:**
- `protected void doStart() throws java.lang.Exception`
- `public void exclude(java.lang.String p0)`
- `protected java.lang.String getRemoteIP(org.eclipse.jetty.server.Request p0)`
- `public int getThreadLimit()`
- `protected int getThreadLimit(java.lang.String p0)`
- `public void handle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `public void include(java.lang.String p0)`
- `public boolean isEnabled()`
- `public void setEnabled(boolean p0)`
- `public void setThreadLimit(int p0)`

---

## public abstract interface `org.eclipse.jetty.server.handler.gzip.GzipFactory`

**Methods:**
- `public abstract org.eclipse.jetty.util.compression.CompressionPool$Entry getDeflaterEntry(org.eclipse.jetty.server.Request p0, long p1)`
- `public abstract boolean isMimeTypeGzipable(java.lang.String p0)`

---

## public class `org.eclipse.jetty.server.handler.gzip.GzipHandler`
extends `org.eclipse.jetty.server.handler.HandlerWrapper`  
implements `org.eclipse.jetty.server.handler.gzip.GzipFactory`  

**Constructors:**
- `public GzipHandler()`

**Fields:**
- `public final static int BREAK_EVEN_GZIP_SIZE`
- `public final static int DEFAULT_MIN_GZIP_SIZE`
- `public final static java.lang.String DEFLATE`
- `public final static java.util.EnumSet ETAG_HEADERS`
- `public final static java.lang.String GZIP`
- `public final static java.lang.String GZIP_HANDLER_ETAGS`

**Methods:**
- `public void addExcludedInflationPaths(java.lang.String... p0)`
- `public void addExcludedMethods(java.lang.String... p0)`
- `public void addExcludedMimeTypes(java.lang.String... p0)`
- `public void addExcludedPaths(java.lang.String... p0)`
- `public void addIncludedInflationPaths(java.lang.String... p0)`
- `public void addIncludedMethods(java.lang.String... p0)`
- `public void addIncludedMimeTypes(java.lang.String... p0)`
- `public void addIncludedPaths(java.lang.String... p0)`
- `protected void doStart() throws java.lang.Exception`
- `protected void doStop() throws java.lang.Exception`
- `public org.eclipse.jetty.util.compression.CompressionPool$Entry getDeflaterEntry(org.eclipse.jetty.server.Request p0, long p1)`
- `public org.eclipse.jetty.util.compression.DeflaterPool getDeflaterPool()`
- `public int getDeflaterPoolCapacity()`
- `public java.util.EnumSet getDispatcherTypes()`
- `public java.lang.String[] getExcludedInflationPaths()`
- `public java.lang.String getExcludedMethodList()`
- `public java.lang.String[] getExcludedMethods()`
- `public java.lang.String[] getExcludedMimeTypes()`
- `public java.lang.String[] getExcludedPaths()`
- `public java.lang.String[] getIncludedInflationPaths()`
- `public java.lang.String getIncludedMethodList()`
- `public java.lang.String[] getIncludedMethods()`
- `public java.lang.String[] getIncludedMimeTypes()`
- `public java.lang.String[] getIncludedPaths()`
- `public int getInflateBufferSize()`
- `public org.eclipse.jetty.util.compression.InflaterPool getInflaterPool()`
- `public int getInflaterPoolCapacity()`
- `public int getMinGzipSize()`
- `public org.eclipse.jetty.http.HttpField getVary()`
- `protected org.eclipse.jetty.http.HttpField getVaryField()`
- `public void handle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `public boolean isMimeTypeGzipable(java.lang.String p0)`
- `protected boolean isPathGzipable(java.lang.String p0)`
- `protected boolean isPathInflatable(java.lang.String p0)`
- `public boolean isSyncFlush()`
- `public void setDeflaterPool(org.eclipse.jetty.util.compression.DeflaterPool p0)`
- `public void setDeflaterPoolCapacity(int p0)`
- `public void setDispatcherTypes(jakarta.servlet.DispatcherType... p0)`
- `public void setDispatcherTypes(java.lang.String... p0)`
- `public void setDispatcherTypes(java.util.EnumSet p0)`
- `public void setExcludedInflatePaths(java.lang.String... p0)`
- `public void setExcludedMethodList(java.lang.String p0)`
- `public void setExcludedMethods(java.lang.String... p0)`
- `public void setExcludedMimeTypes(java.lang.String... p0)`
- `public void setExcludedMimeTypesList(java.lang.String p0)`
- `public void setExcludedPaths(java.lang.String... p0)`
- `public void setIncludedInflatePaths(java.lang.String... p0)`
- `public void setIncludedMethodList(java.lang.String p0)`
- `public void setIncludedMethods(java.lang.String... p0)`
- `public void setIncludedMimeTypes(java.lang.String... p0)`
- `public void setIncludedMimeTypesList(java.lang.String p0)`
- `public void setIncludedPaths(java.lang.String... p0)`
- `public void setInflateBufferSize(int p0)`
- `public void setInflaterPool(org.eclipse.jetty.util.compression.InflaterPool p0)`
- `public void setInflaterPoolCapacity(int p0)`
- `public void setMinGzipSize(int p0)`
- `public void setSyncFlush(boolean p0)`
- `public void setVary(org.eclipse.jetty.http.HttpField p0)`
- `public java.lang.String toString()`

---

## public class `org.eclipse.jetty.server.handler.gzip.GzipHttpInputInterceptor`
implements `org.eclipse.jetty.server.HttpInput$Interceptor`, `org.eclipse.jetty.util.component.Destroyable`  

**Constructors:**
- `public GzipHttpInputInterceptor(org.eclipse.jetty.util.compression.InflaterPool p0, org.eclipse.jetty.io.ByteBufferPool p1, int p2)`
- `public GzipHttpInputInterceptor(org.eclipse.jetty.util.compression.InflaterPool p0, org.eclipse.jetty.io.ByteBufferPool p1, int p2, boolean p3)`

**Methods:**
- `public void destroy()`
- `public org.eclipse.jetty.server.HttpInput$Content readFrom(org.eclipse.jetty.server.HttpInput$Content p0)`

---

## public class `org.eclipse.jetty.server.handler.gzip.GzipHttpOutputInterceptor`
implements `org.eclipse.jetty.server.HttpOutput$Interceptor`  

**Constructors:**
- `public GzipHttpOutputInterceptor(org.eclipse.jetty.server.handler.gzip.GzipFactory p0, org.eclipse.jetty.http.HttpField p1, int p2, org.eclipse.jetty.server.HttpChannel p3, org.eclipse.jetty.server.HttpOutput$Interceptor p4, boolean p5)`
- `public GzipHttpOutputInterceptor(org.eclipse.jetty.server.handler.gzip.GzipFactory p0, org.eclipse.jetty.http.HttpField p1, org.eclipse.jetty.server.HttpChannel p2, org.eclipse.jetty.server.HttpOutput$Interceptor p3, boolean p4)`
- `public GzipHttpOutputInterceptor(org.eclipse.jetty.server.handler.gzip.GzipFactory p0, org.eclipse.jetty.server.HttpChannel p1, org.eclipse.jetty.server.HttpOutput$Interceptor p2, boolean p3)`

**Fields:**
- `public static org.slf4j.Logger LOG`
- `public final static org.eclipse.jetty.http.HttpField VARY_ACCEPT_ENCODING`

**Methods:**
- `protected void commit(java.nio.ByteBuffer p0, boolean p1, org.eclipse.jetty.util.Callback p2)`
- `public org.eclipse.jetty.server.HttpOutput$Interceptor getNextInterceptor()`
- `public boolean mightCompress()`
- `public void noCompression()`
- `public void write(java.nio.ByteBuffer p0, boolean p1, org.eclipse.jetty.util.Callback p2)`

---

## public abstract class `org.eclipse.jetty.server.session.AbstractSessionCache`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.util.component.ContainerLifeCycle`  
implements `org.eclipse.jetty.server.session.SessionCache`  

**Constructors:**
- `public AbstractSessionCache(org.eclipse.jetty.server.session.SessionHandler p0)`

**Fields:**
- `protected org.eclipse.jetty.server.session.SessionContext _context`
- `protected int _evictionPolicy`
- `protected boolean _flushOnResponseCommit`
- `protected final org.eclipse.jetty.server.session.SessionHandler _handler`
- `protected boolean _invalidateOnShutdown`
- `protected boolean _removeUnloadableSessions`
- `protected boolean _saveOnCreate`
- `protected boolean _saveOnInactiveEviction`
- `protected org.eclipse.jetty.server.session.SessionDataStore _sessionDataStore`

**Methods:**
- `public void add(java.lang.String p0, org.eclipse.jetty.server.session.Session p1) throws java.lang.Exception`
- `public java.util.Set checkExpiration(java.util.Set p0)`
- `public void checkInactiveSession(org.eclipse.jetty.server.session.Session p0)`
- `public void commit(org.eclipse.jetty.server.session.Session p0) throws java.lang.Exception`
- `public boolean contains(java.lang.String p0) throws java.lang.Exception`
- `public org.eclipse.jetty.server.session.Session delete(java.lang.String p0) throws java.lang.Exception`
- `protected abstract org.eclipse.jetty.server.session.Session doComputeIfAbsent(java.lang.String p0, java.util.function.Function p1)`
- `public abstract org.eclipse.jetty.server.session.Session doDelete(java.lang.String p0)`
- `protected abstract org.eclipse.jetty.server.session.Session doGet(java.lang.String p0)`
- `protected abstract org.eclipse.jetty.server.session.Session doPutIfAbsent(java.lang.String p0, org.eclipse.jetty.server.session.Session p1)`
- `protected abstract boolean doReplace(java.lang.String p0, org.eclipse.jetty.server.session.Session p1, org.eclipse.jetty.server.session.Session p2)`
- `protected void doStart() throws java.lang.Exception`
- `protected void doStop() throws java.lang.Exception`
- `public boolean exists(java.lang.String p0) throws java.lang.Exception`
- `public org.eclipse.jetty.server.session.Session get(java.lang.String p0) throws java.lang.Exception`
- `protected org.eclipse.jetty.server.session.Session getAndEnter(java.lang.String p0, boolean p1) throws java.lang.Exception`
- `public int getEvictionPolicy()`
- `public org.eclipse.jetty.server.session.SessionDataStore getSessionDataStore()`
- `public org.eclipse.jetty.server.session.SessionHandler getSessionHandler()`
- `public void initialize(org.eclipse.jetty.server.session.SessionContext p0)`
- `public boolean isFlushOnResponseCommit()`
- `public boolean isInvalidateOnShutdown()`
- `public boolean isRemoveUnloadableSessions()`
- `public boolean isSaveOnCreate()`
- `public boolean isSaveOnInactiveEviction()`
- `public org.eclipse.jetty.server.session.Session newSession(jakarta.servlet.http.HttpServletRequest p0, java.lang.String p1, long p2, long p3)`
- `public abstract org.eclipse.jetty.server.session.Session newSession(jakarta.servlet.http.HttpServletRequest p0, org.eclipse.jetty.server.session.SessionData p1)`
- `public abstract org.eclipse.jetty.server.session.Session newSession(org.eclipse.jetty.server.session.SessionData p0)`
- `public void put(java.lang.String p0, org.eclipse.jetty.server.session.Session p1) throws java.lang.Exception`
- `public void release(java.lang.String p0, org.eclipse.jetty.server.session.Session p1) throws java.lang.Exception`
- `public org.eclipse.jetty.server.session.Session renewSessionId(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws java.lang.Exception`
- `protected void renewSessionId(org.eclipse.jetty.server.session.Session p0, java.lang.String p1, java.lang.String p2) throws java.lang.Exception`
- `public void setEvictionPolicy(int p0)`
- `public void setFlushOnResponseCommit(boolean p0)`
- `public void setInvalidateOnShutdown(boolean p0)`
- `public void setRemoveUnloadableSessions(boolean p0)`
- `public void setSaveOnCreate(boolean p0)`
- `public void setSaveOnInactiveEviction(boolean p0)`
- `public void setSessionDataStore(org.eclipse.jetty.server.session.SessionDataStore p0)`
- `public java.lang.String toString()`

---

## public abstract class `org.eclipse.jetty.server.session.AbstractSessionCacheFactory`
implements `org.eclipse.jetty.server.session.SessionCacheFactory`  

**Constructors:**
- `public AbstractSessionCacheFactory()`

**Methods:**
- `public int getEvictionPolicy()`
- `public org.eclipse.jetty.server.session.SessionCache getSessionCache(org.eclipse.jetty.server.session.SessionHandler p0)`
- `public boolean isFlushOnResponseCommit()`
- `public boolean isInvalidateOnShutdown()`
- `public boolean isRemoveUnloadableSessions()`
- `public boolean isSaveOnCreate()`
- `public boolean isSaveOnInactiveEvict()`
- `public abstract org.eclipse.jetty.server.session.SessionCache newSessionCache(org.eclipse.jetty.server.session.SessionHandler p0)`
- `public void setEvictionPolicy(int p0)`
- `public void setFlushOnResponseCommit(boolean p0)`
- `public void setInvalidateOnShutdown(boolean p0)`
- `public void setRemoveUnloadableSessions(boolean p0)`
- `public void setSaveOnCreate(boolean p0)`
- `public void setSaveOnInactiveEvict(boolean p0)`

---

## public abstract class `org.eclipse.jetty.server.session.AbstractSessionDataStore`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.util.component.ContainerLifeCycle`  
implements `org.eclipse.jetty.server.session.SessionDataStore`  

**Constructors:**
- `public AbstractSessionDataStore()`

**Fields:**
- `public final static int DEFAULT_GRACE_PERIOD_SEC`
- `public final static int DEFAULT_SAVE_PERIOD_SEC`
- `protected org.eclipse.jetty.server.session.SessionContext _context`
- `protected int _gracePeriodSec`
- `protected long _lastExpiryCheckTime`
- `protected long _lastOrphanSweepTime`
- `protected int _savePeriodSec`

**Methods:**
- `protected void checkStarted() throws java.lang.IllegalStateException`
- `public void cleanOrphans(long p0)`
- `public abstract java.util.Set doCheckExpired(java.util.Set p0, long p1)`
- `public abstract void doCleanOrphans(long p0)`
- `public abstract boolean doExists(java.lang.String p0) throws java.lang.Exception`
- `public abstract java.util.Set doGetExpired(long p0)`
- `public abstract org.eclipse.jetty.server.session.SessionData doLoad(java.lang.String p0) throws java.lang.Exception`
- `protected void doStart() throws java.lang.Exception`
- `public abstract void doStore(java.lang.String p0, org.eclipse.jetty.server.session.SessionData p1, long p2) throws java.lang.Exception`
- `public boolean exists(java.lang.String p0) throws java.lang.Exception`
- `public java.util.Set getExpired(java.util.Set p0)`
- `public int getGracePeriodSec()`
- `public int getSavePeriodSec()`
- `public void initialize(org.eclipse.jetty.server.session.SessionContext p0) throws java.lang.Exception`
- `public org.eclipse.jetty.server.session.SessionData load(java.lang.String p0) throws java.lang.Exception`
- `public org.eclipse.jetty.server.session.SessionData newSessionData(java.lang.String p0, long p1, long p2, long p3, long p4)`
- `public void setGracePeriodSec(int p0)`
- `public void setSavePeriodSec(int p0)`
- `public void store(java.lang.String p0, org.eclipse.jetty.server.session.SessionData p1) throws java.lang.Exception`
- `public java.lang.String toString()`

---

## public abstract class `org.eclipse.jetty.server.session.AbstractSessionDataStoreFactory`
implements `org.eclipse.jetty.server.session.SessionDataStoreFactory`  

**Constructors:**
- `public AbstractSessionDataStoreFactory()`

**Methods:**
- `public int getGracePeriodSec()`
- `public int getSavePeriodSec()`
- `public void setGracePeriodSec(int p0)`
- `public void setSavePeriodSec(int p0)`

---

## public class `org.eclipse.jetty.server.session.CachingSessionDataStore`
extends `org.eclipse.jetty.util.component.ContainerLifeCycle`  
implements `org.eclipse.jetty.server.session.SessionDataStore`  

**Constructors:**
- `public CachingSessionDataStore(org.eclipse.jetty.server.session.SessionDataMap p0, org.eclipse.jetty.server.session.SessionDataStore p1)`

**Fields:**
- `protected org.eclipse.jetty.server.session.SessionDataMap _cache`
- `protected org.eclipse.jetty.server.session.SessionDataStore _store`

**Methods:**
- `public boolean delete(java.lang.String p0) throws java.lang.Exception`
- `protected void doStart() throws java.lang.Exception`
- `protected void doStop() throws java.lang.Exception`
- `public boolean exists(java.lang.String p0) throws java.lang.Exception`
- `public java.util.Set getExpired(java.util.Set p0)`
- `public org.eclipse.jetty.server.session.SessionDataMap getSessionDataMap()`
- `public org.eclipse.jetty.server.session.SessionDataStore getSessionStore()`
- `public void initialize(org.eclipse.jetty.server.session.SessionContext p0) throws java.lang.Exception`
- `public boolean isPassivating()`
- `public org.eclipse.jetty.server.session.SessionData load(java.lang.String p0) throws java.lang.Exception`
- `public org.eclipse.jetty.server.session.SessionData newSessionData(java.lang.String p0, long p1, long p2, long p3, long p4)`
- `public void store(java.lang.String p0, org.eclipse.jetty.server.session.SessionData p1) throws java.lang.Exception`

---

## public class `org.eclipse.jetty.server.session.CachingSessionDataStoreFactory`
extends `org.eclipse.jetty.server.session.AbstractSessionDataStoreFactory`  

**Constructors:**
- `public CachingSessionDataStoreFactory()`

**Fields:**
- `protected org.eclipse.jetty.server.session.SessionDataMapFactory _mapFactory`
- `protected org.eclipse.jetty.server.session.SessionDataStoreFactory _sessionStoreFactory`

**Methods:**
- `public org.eclipse.jetty.server.session.SessionDataMapFactory getMapFactory()`
- `public org.eclipse.jetty.server.session.SessionDataStore getSessionDataStore(org.eclipse.jetty.server.session.SessionHandler p0) throws java.lang.Exception`
- `public void setSessionDataMapFactory(org.eclipse.jetty.server.session.SessionDataMapFactory p0)`
- `public void setSessionStoreFactory(org.eclipse.jetty.server.session.SessionDataStoreFactory p0)`

---

## public class `org.eclipse.jetty.server.session.DatabaseAdaptor`

**Constructors:**
- `public DatabaseAdaptor()`

**Fields:**
- `protected java.lang.String _blobType`
- `protected java.lang.String _longType`
- `protected java.lang.String _stringType`

**Methods:**
- `public void adaptTo(java.sql.DatabaseMetaData p0) throws java.sql.SQLException`
- `public java.lang.String convertIdentifier(java.lang.String p0)`
- `public java.io.InputStream getBlobInputStream(java.sql.ResultSet p0, java.lang.String p1) throws java.sql.SQLException`
- `public java.lang.String getBlobType()`
- `protected java.sql.Connection getConnection() throws java.sql.SQLException`
- `public java.lang.String getConnectionUrl()`
- `public java.lang.String getDBName()`
- `public javax.sql.DataSource getDatasource()`
- `public java.lang.String getDatasourceName()`
- `public java.sql.Driver getDriver()`
- `public java.lang.String getDriverClassName()`
- `public java.lang.String getLongType()`
- `public java.lang.String getStringType()`
- `public void initialize() throws java.lang.Exception`
- `public boolean isEmptyStringNull()`
- `public boolean isRowIdReserved()`
- `public void setBlobType(java.lang.String p0)`
- `public void setDatasource(javax.sql.DataSource p0)`
- `public void setDatasourceName(java.lang.String p0)`
- `public void setDriverInfo(java.lang.String p0, java.lang.String p1)`
- `public void setDriverInfo(java.sql.Driver p0, java.lang.String p1)`
- `public void setLongType(java.lang.String p0)`
- `public void setStringType(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public class `org.eclipse.jetty.server.session.DefaultSessionCache`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.server.session.AbstractSessionCache`  

**Constructors:**
- `public DefaultSessionCache(org.eclipse.jetty.server.session.SessionHandler p0)`
- `public DefaultSessionCache(org.eclipse.jetty.server.session.SessionHandler p0, java.util.concurrent.ConcurrentMap p1)`

**Methods:**
- `protected org.eclipse.jetty.server.session.Session doComputeIfAbsent(java.lang.String p0, java.util.function.Function p1)`
- `public org.eclipse.jetty.server.session.Session doDelete(java.lang.String p0)`
- `public org.eclipse.jetty.server.session.Session doGet(java.lang.String p0)`
- `public org.eclipse.jetty.server.session.Session doPutIfAbsent(java.lang.String p0, org.eclipse.jetty.server.session.Session p1)`
- `public boolean doReplace(java.lang.String p0, org.eclipse.jetty.server.session.Session p1, org.eclipse.jetty.server.session.Session p2)`
- `public long getSessionsCurrent()`
- `public long getSessionsMax()`
- `public long getSessionsTotal()`
- `public org.eclipse.jetty.server.session.Session newSession(jakarta.servlet.http.HttpServletRequest p0, org.eclipse.jetty.server.session.SessionData p1)`
- `public org.eclipse.jetty.server.session.Session newSession(org.eclipse.jetty.server.session.SessionData p0)`
- `public void resetStats()`
- `public void shutdown()`

---

## public class `org.eclipse.jetty.server.session.DefaultSessionCacheFactory`
extends `org.eclipse.jetty.server.session.AbstractSessionCacheFactory`  

**Constructors:**
- `public DefaultSessionCacheFactory()`

**Methods:**
- `public org.eclipse.jetty.server.session.SessionCache newSessionCache(org.eclipse.jetty.server.session.SessionHandler p0)`

---

## public class `org.eclipse.jetty.server.session.DefaultSessionIdManager`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.util.component.ContainerLifeCycle`  
implements `org.eclipse.jetty.server.SessionIdManager`  

**Constructors:**
- `public DefaultSessionIdManager(org.eclipse.jetty.server.Server p0)`
- `public DefaultSessionIdManager(org.eclipse.jetty.server.Server p0, java.util.Random p1)`

**Fields:**
- `protected final static java.util.concurrent.atomic.AtomicLong COUNTER`
- `public final static java.lang.String __NEW_SESSION_ID`
- `protected org.eclipse.jetty.server.session.HouseKeeper _houseKeeper`
- `protected boolean _ownHouseKeeper`
- `protected java.util.Random _random`
- `protected long _reseed`
- `protected org.eclipse.jetty.server.Server _server`
- `protected boolean _weakRandom`
- `protected java.lang.String _workerAttr`
- `protected java.lang.String _workerName`

**Methods:**
- `protected void doStart() throws java.lang.Exception`
- `protected void doStop() throws java.lang.Exception`
- `public void expireAll(java.lang.String p0)`
- `public java.lang.String getExtendedId(java.lang.String p0, jakarta.servlet.http.HttpServletRequest p1)`
- `public java.lang.String getId(java.lang.String p0)`
- `public java.util.Random getRandom()`
- `public long getReseed()`
- `public org.eclipse.jetty.server.Server getServer()`
- `public java.util.Set getSessionHandlers()`
- `public org.eclipse.jetty.server.session.HouseKeeper getSessionHouseKeeper()`
- `public java.lang.String getWorkerName()`
- `public void initRandom()`
- `public void invalidateAll(java.lang.String p0)`
- `public boolean isIdInUse(java.lang.String p0)`
- `public java.lang.String newSessionId(jakarta.servlet.http.HttpServletRequest p0, long p1)`
- `public java.lang.String newSessionId(long p0)`
- `public java.lang.String renewSessionId(java.lang.String p0, java.lang.String p1, jakarta.servlet.http.HttpServletRequest p2)`
- `public void setRandom(java.util.Random p0)`
- `public void setReseed(long p0)`
- `public void setServer(org.eclipse.jetty.server.Server p0)`
- `public void setSessionHouseKeeper(org.eclipse.jetty.server.session.HouseKeeper p0)`
- `public void setWorkerName(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public class `org.eclipse.jetty.server.session.FileSessionDataStore`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.server.session.AbstractSessionDataStore`  

**Constructors:**
- `public FileSessionDataStore()`

**Fields:**
- `protected java.lang.String _contextString`
- `protected boolean _deleteUnrestorableFiles`
- `protected long _lastSweepTime`
- `protected java.util.Map _sessionFileMap`
- `protected java.io.File _storeDir`

**Methods:**
- `public boolean delete(java.lang.String p0) throws java.lang.Exception`
- `public boolean deleteFile(java.lang.String p0) throws java.lang.Exception`
- `public java.util.Set doCheckExpired(java.util.Set p0, long p1)`
- `public void doCleanOrphans(long p0)`
- `public boolean doExists(java.lang.String p0) throws java.lang.Exception`
- `public java.util.Set doGetExpired(long p0)`
- `public org.eclipse.jetty.server.session.SessionData doLoad(java.lang.String p0) throws java.lang.Exception`
- `protected void doStart() throws java.lang.Exception`
- `protected void doStop() throws java.lang.Exception`
- `public void doStore(java.lang.String p0, org.eclipse.jetty.server.session.SessionData p1, long p2) throws java.lang.Exception`
- `protected java.lang.String getContextFromFilename(java.lang.String p0)`
- `protected long getExpiryFromFilename(java.lang.String p0)`
- `protected java.lang.String getIdFromFilename(java.lang.String p0)`
- `protected java.lang.String getIdWithContext(java.lang.String p0)`
- `protected java.lang.String getIdWithContextAndExpiry(org.eclipse.jetty.server.session.SessionData p0)`
- `protected java.lang.String getIdWithContextFromFilename(java.lang.String p0)`
- `public java.io.File getStoreDir()`
- `public void initialize(org.eclipse.jetty.server.session.SessionContext p0) throws java.lang.Exception`
- `public void initializeStore() throws java.lang.Exception`
- `public boolean isDeleteUnrestorableFiles()`
- `protected boolean isOurContextSessionFilename(java.lang.String p0)`
- `public boolean isPassivating()`
- `protected boolean isSessionFilename(java.lang.String p0)`
- `protected org.eclipse.jetty.server.session.SessionData load(java.io.InputStream p0, java.lang.String p1) throws java.lang.Exception`
- `protected void save(java.io.OutputStream p0, java.lang.String p1, org.eclipse.jetty.server.session.SessionData p2) throws java.io.IOException`
- `public void setDeleteUnrestorableFiles(boolean p0)`
- `public void setStoreDir(java.io.File p0)`
- `protected void sweepDisk(long p0)`
- `protected void sweepFile(long p0, java.nio.file.Path p1)`
- `public java.lang.String toString()`

---

## public class `org.eclipse.jetty.server.session.FileSessionDataStoreFactory`
extends `org.eclipse.jetty.server.session.AbstractSessionDataStoreFactory`  

**Constructors:**
- `public FileSessionDataStoreFactory()`

**Methods:**
- `public org.eclipse.jetty.server.session.SessionDataStore getSessionDataStore(org.eclipse.jetty.server.session.SessionHandler p0)`
- `public java.io.File getStoreDir()`
- `public boolean isDeleteUnrestorableFiles()`
- `public void setDeleteUnrestorableFiles(boolean p0)`
- `public void setStoreDir(java.io.File p0)`

---

## public class `org.eclipse.jetty.server.session.HouseKeeper`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.util.component.AbstractLifeCycle`  

**Constructors:**
- `public HouseKeeper()`

**Fields:**
- `public final static long DEFAULT_PERIOD_MS`
- `protected boolean _ownScheduler`
- `protected org.eclipse.jetty.server.session.HouseKeeper$Runner _runner`
- `protected org.eclipse.jetty.util.thread.Scheduler _scheduler`
- `protected org.eclipse.jetty.server.SessionIdManager _sessionIdManager`
- `protected org.eclipse.jetty.util.thread.Scheduler$Task _task`

**Methods:**
- `protected void doStart() throws java.lang.Exception`
- `protected void doStop() throws java.lang.Exception`
- `public long getIntervalSec()`
- `public void scavenge()`
- `public void setIntervalSec(long p0) throws java.lang.Exception`
- `public void setSessionIdManager(org.eclipse.jetty.server.SessionIdManager p0)`
- `protected void startScavenging() throws java.lang.Exception`
- `protected void stopScavenging() throws java.lang.Exception`
- `public java.lang.String toString()`

---

## protected class `org.eclipse.jetty.server.session.HouseKeeper$Runner`
implements `java.lang.Runnable`  

**Constructors:**
- `protected Runner()`

**Methods:**
- `public void run()`

---

## public class `org.eclipse.jetty.server.session.JDBCSessionDataStore`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.server.session.AbstractSessionDataStore`  

**Constructors:**
- `public JDBCSessionDataStore()`

**Fields:**
- `public final static java.lang.String NULL_CONTEXT_PATH`
- `protected org.eclipse.jetty.server.session.DatabaseAdaptor _dbAdaptor`
- `protected boolean _initialized`
- `protected boolean _schemaProvided`
- `protected org.eclipse.jetty.server.session.JDBCSessionDataStore$SessionTableSchema _sessionTableSchema`

**Methods:**
- `public boolean delete(java.lang.String p0) throws java.lang.Exception`
- `public java.util.Set doCheckExpired(java.util.Set p0, long p1)`
- `public void doCleanOrphans(long p0)`
- `public boolean doExists(java.lang.String p0) throws java.lang.Exception`
- `public java.util.Set doGetExpired(long p0)`
- `protected void doInsert(java.lang.String p0, org.eclipse.jetty.server.session.SessionData p1) throws java.lang.Exception`
- `public org.eclipse.jetty.server.session.SessionData doLoad(java.lang.String p0) throws java.lang.Exception`
- `protected void doStart() throws java.lang.Exception`
- `protected void doStop() throws java.lang.Exception`
- `public void doStore(java.lang.String p0, org.eclipse.jetty.server.session.SessionData p1, long p2) throws java.lang.Exception`
- `protected void doUpdate(java.lang.String p0, org.eclipse.jetty.server.session.SessionData p1) throws java.lang.Exception`
- `public void initialize() throws java.lang.Exception`
- `public boolean isPassivating()`
- `public void setDatabaseAdaptor(org.eclipse.jetty.server.session.DatabaseAdaptor p0)`
- `public void setSessionTableSchema(org.eclipse.jetty.server.session.JDBCSessionDataStore$SessionTableSchema p0)`

---

## public static class `org.eclipse.jetty.server.session.JDBCSessionDataStore$SessionTableSchema`

**Constructors:**
- `public SessionTableSchema()`

**Fields:**
- `public final static java.lang.String INFERRED`
- `public final static int MAX_INTERVAL_NOT_SET`
- `protected java.lang.String _accessTimeColumn`
- `protected java.lang.String _catalogName`
- `protected java.lang.String _contextPathColumn`
- `protected java.lang.String _cookieTimeColumn`
- `protected java.lang.String _createTimeColumn`
- `protected org.eclipse.jetty.server.session.DatabaseAdaptor _dbAdaptor`
- `protected java.lang.String _expiryTimeColumn`
- `protected java.lang.String _idColumn`
- `protected java.lang.String _lastAccessTimeColumn`
- `protected java.lang.String _lastNodeColumn`
- `protected java.lang.String _lastSavedTimeColumn`
- `protected java.lang.String _mapColumn`
- `protected java.lang.String _maxIntervalColumn`
- `protected java.lang.String _schemaName`
- `protected java.lang.String _tableName`
- `protected java.lang.String _virtualHostColumn`

**Methods:**
- `public java.lang.String getAccessTimeColumn()`
- `public java.lang.String getAlterTableForMaxIntervalAsString()`
- `public java.lang.String getCatalogName()`
- `public java.sql.PreparedStatement getCheckSessionExistsStatement(java.sql.Connection p0, org.eclipse.jetty.server.session.SessionContext p1) throws java.sql.SQLException`
- `public java.sql.PreparedStatement getCleanOrphansStatement(java.sql.Connection p0, long p1) throws java.lang.Exception`
- `public java.lang.String getContextPathColumn()`
- `public java.lang.String getCookieTimeColumn()`
- `public java.lang.String getCreateIndexOverExpiryStatementAsString(java.lang.String p0)`
- `public java.lang.String getCreateIndexOverSessionStatementAsString(java.lang.String p0)`
- `public java.lang.String getCreateStatementAsString()`
- `public java.lang.String getCreateTimeColumn()`
- `public java.sql.PreparedStatement getDeleteStatement(java.sql.Connection p0, java.lang.String p1, org.eclipse.jetty.server.session.SessionContext p2) throws java.lang.Exception`
- `public java.sql.PreparedStatement getExpiredSessionsStatement(java.sql.Connection p0, java.lang.String p1, java.lang.String p2, long p3) throws java.sql.SQLException`
- `public java.lang.String getExpiryTimeColumn()`
- `public java.lang.String getIdColumn()`
- `public java.lang.String getInsertSessionStatementAsString()`
- `public java.lang.String getLastAccessTimeColumn()`
- `public java.lang.String getLastNodeColumn()`
- `public java.lang.String getLastSavedTimeColumn()`
- `public java.sql.PreparedStatement getLoadStatement(java.sql.Connection p0, java.lang.String p1, org.eclipse.jetty.server.session.SessionContext p2) throws java.sql.SQLException`
- `public java.lang.String getMapColumn()`
- `public java.lang.String getMaxIntervalColumn()`
- `public java.sql.PreparedStatement getMyExpiredSessionsStatement(java.sql.Connection p0, org.eclipse.jetty.server.session.SessionContext p1, long p2) throws java.sql.SQLException`
- `public java.lang.String getSchemaName()`
- `public java.lang.String getTableName()`
- `public java.sql.PreparedStatement getUpdateSessionStatement(java.sql.Connection p0, java.lang.String p1, org.eclipse.jetty.server.session.SessionContext p2) throws java.sql.SQLException`
- `public java.sql.PreparedStatement getUpdateStatement(java.sql.Connection p0, java.lang.String p1, org.eclipse.jetty.server.session.SessionContext p2) throws java.sql.SQLException`
- `public java.lang.String getVirtualHostColumn()`
- `public void prepareTables() throws java.sql.SQLException`
- `public void setAccessTimeColumn(java.lang.String p0)`
- `public void setCatalogName(java.lang.String p0)`
- `public void setContextPathColumn(java.lang.String p0)`
- `public void setCookieTimeColumn(java.lang.String p0)`
- `public void setCreateTimeColumn(java.lang.String p0)`
- `protected void setDatabaseAdaptor(org.eclipse.jetty.server.session.DatabaseAdaptor p0)`
- `public void setExpiryTimeColumn(java.lang.String p0)`
- `public void setIdColumn(java.lang.String p0)`
- `public void setLastAccessTimeColumn(java.lang.String p0)`
- `public void setLastNodeColumn(java.lang.String p0)`
- `public void setLastSavedTimeColumn(java.lang.String p0)`
- `public void setMapColumn(java.lang.String p0)`
- `public void setMaxIntervalColumn(java.lang.String p0)`
- `public void setSchemaName(java.lang.String p0)`
- `public void setTableName(java.lang.String p0)`
- `public void setVirtualHostColumn(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public class `org.eclipse.jetty.server.session.JDBCSessionDataStoreFactory`
extends `org.eclipse.jetty.server.session.AbstractSessionDataStoreFactory`  

**Constructors:**
- `public JDBCSessionDataStoreFactory()`

**Methods:**
- `public org.eclipse.jetty.server.session.SessionDataStore getSessionDataStore(org.eclipse.jetty.server.session.SessionHandler p0)`
- `public void setDatabaseAdaptor(org.eclipse.jetty.server.session.DatabaseAdaptor p0)`
- `public void setSessionTableSchema(org.eclipse.jetty.server.session.JDBCSessionDataStore$SessionTableSchema p0)`

---

## public class `org.eclipse.jetty.server.session.NullSessionCache`
extends `org.eclipse.jetty.server.session.AbstractSessionCache`  

**Constructors:**
- `public NullSessionCache(org.eclipse.jetty.server.session.SessionHandler p0)`

**Methods:**
- `protected org.eclipse.jetty.server.session.Session doComputeIfAbsent(java.lang.String p0, java.util.function.Function p1)`
- `public org.eclipse.jetty.server.session.Session doDelete(java.lang.String p0)`
- `public org.eclipse.jetty.server.session.Session doGet(java.lang.String p0)`
- `public org.eclipse.jetty.server.session.Session doPutIfAbsent(java.lang.String p0, org.eclipse.jetty.server.session.Session p1)`
- `public boolean doReplace(java.lang.String p0, org.eclipse.jetty.server.session.Session p1, org.eclipse.jetty.server.session.Session p2)`
- `public org.eclipse.jetty.server.session.Session newSession(jakarta.servlet.http.HttpServletRequest p0, org.eclipse.jetty.server.session.SessionData p1)`
- `public org.eclipse.jetty.server.session.Session newSession(org.eclipse.jetty.server.session.SessionData p0)`
- `public void setEvictionPolicy(int p0)`
- `public void shutdown()`

---

## public class `org.eclipse.jetty.server.session.NullSessionCacheFactory`
extends `org.eclipse.jetty.server.session.AbstractSessionCacheFactory`  

**Constructors:**
- `public NullSessionCacheFactory()`

**Methods:**
- `public int getEvictionPolicy()`
- `public boolean isInvalidateOnShutdown()`
- `public boolean isSaveOnInactiveEvict()`
- `public org.eclipse.jetty.server.session.SessionCache newSessionCache(org.eclipse.jetty.server.session.SessionHandler p0)`
- `public void setEvictionPolicy(int p0)`
- `public void setInvalidateOnShutdown(boolean p0)`
- `public void setSaveOnInactiveEvict(boolean p0)`

---

## public class `org.eclipse.jetty.server.session.NullSessionDataStore`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.server.session.AbstractSessionDataStore`  

**Constructors:**
- `public NullSessionDataStore()`

**Methods:**
- `public boolean delete(java.lang.String p0) throws java.lang.Exception`
- `public java.util.Set doCheckExpired(java.util.Set p0, long p1)`
- `public void doCleanOrphans(long p0)`
- `public boolean doExists(java.lang.String p0)`
- `public java.util.Set doGetExpired(long p0)`
- `public org.eclipse.jetty.server.session.SessionData doLoad(java.lang.String p0) throws java.lang.Exception`
- `public void doStore(java.lang.String p0, org.eclipse.jetty.server.session.SessionData p1, long p2) throws java.lang.Exception`
- `public boolean isPassivating()`
- `public org.eclipse.jetty.server.session.SessionData newSessionData(java.lang.String p0, long p1, long p2, long p3, long p4)`

---

## public class `org.eclipse.jetty.server.session.NullSessionDataStoreFactory`
extends `org.eclipse.jetty.server.session.AbstractSessionDataStoreFactory`  

**Constructors:**
- `public NullSessionDataStoreFactory()`

**Methods:**
- `public org.eclipse.jetty.server.session.SessionDataStore getSessionDataStore(org.eclipse.jetty.server.session.SessionHandler p0) throws java.lang.Exception`

---

## public class `org.eclipse.jetty.server.session.Session`
implements `org.eclipse.jetty.server.session.SessionHandler$SessionIf`  

**Constructors:**
- `public Session(org.eclipse.jetty.server.session.SessionHandler p0, jakarta.servlet.http.HttpServletRequest p1, org.eclipse.jetty.server.session.SessionData p2)`
- `public Session(org.eclipse.jetty.server.session.SessionHandler p0, org.eclipse.jetty.server.session.SessionData p1)`

**Fields:**
- `public final static java.lang.String SESSION_CREATED_SECURE`
- `protected java.lang.String _extendedId`
- `protected final org.eclipse.jetty.server.session.SessionHandler _handler`
- `protected boolean _idChanged`
- `protected org.eclipse.jetty.util.thread.AutoLock _lock`
- `protected boolean _newSession`
- `protected long _requests`
- `protected boolean _resident`
- `protected final org.eclipse.jetty.server.session.SessionData _sessionData`
- `protected final org.eclipse.jetty.server.session.Session$SessionInactivityTimer _sessionInactivityTimer`
- `protected org.eclipse.jetty.server.session.Session$State _state`
- `protected java.util.concurrent.locks.Condition _stateChangeCompleted`

**Methods:**
- `protected boolean access(long p0)`
- `protected boolean beginInvalidate()`
- `public void bindValue(java.lang.String p0, java.lang.Object p1)`
- `public long calculateInactivityTimeout(long p0)`
- `protected void callSessionAttributeListeners(java.lang.String p0, java.lang.Object p1, java.lang.Object p2)`
- `protected void checkValidForRead() throws java.lang.IllegalStateException`
- `protected void checkValidForWrite() throws java.lang.IllegalStateException`
- `protected void complete()`
- `protected void cookieSet()`
- `public void didActivate()`
- `protected void finishInvalidate() throws java.lang.IllegalStateException`
- `public java.lang.Object getAttribute(java.lang.String p0)`
- `public java.util.Enumeration getAttributeNames()`
- `public int getAttributes()`
- `public java.lang.String getContextPath()`
- `public long getCookieSetTime()`
- `public long getCreationTime() throws java.lang.IllegalStateException`
- `public java.lang.String getExtendedId()`
- `public java.lang.String getId()`
- `public long getLastAccessedTime()`
- `public int getMaxInactiveInterval()`
- `public java.util.Set getNames()`
- `public long getRequests()`
- `public jakarta.servlet.ServletContext getServletContext()`
- `public org.eclipse.jetty.server.session.Session getSession()`
- `public jakarta.servlet.http.HttpSessionContext getSessionContext()`
- `protected org.eclipse.jetty.server.session.SessionData getSessionData()`
- `public org.eclipse.jetty.server.session.SessionHandler getSessionHandler()`
- `public java.lang.String getVHost()`
- `public java.lang.Object getValue(java.lang.String p0)`
- `public java.lang.String[] getValueNames() throws java.lang.IllegalStateException`
- `public void invalidate()`
- `protected boolean isExpiredAt(long p0)`
- `public boolean isIdChanged()`
- `protected boolean isIdleLongerThan(int p0)`
- `public boolean isInvalid()`
- `public boolean isNew() throws java.lang.IllegalStateException`
- `public boolean isResident()`
- `public boolean isValid()`
- `public org.eclipse.jetty.util.thread.AutoLock lock()`
- `public void putValue(java.lang.String p0, java.lang.Object p1)`
- `public void removeAttribute(java.lang.String p0)`
- `public void removeValue(java.lang.String p0)`
- `public void renewId(jakarta.servlet.http.HttpServletRequest p0)`
- `public void setAttribute(java.lang.String p0, java.lang.Object p1)`
- `public void setExtendedId(java.lang.String p0)`
- `public void setIdChanged(boolean p0)`
- `public void setMaxInactiveInterval(int p0)`
- `public void setResident(boolean p0)`
- `public java.lang.String toString()`
- `public void unbindValue(java.lang.String p0, java.lang.Object p1)`
- `protected void use()`
- `public void willPassivate()`

---

## public final static enum `org.eclipse.jetty.server.session.Session$IdState`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.eclipse.jetty.server.session.Session$IdState CHANGING`
- `public final static org.eclipse.jetty.server.session.Session$IdState SET`

---

## public class `org.eclipse.jetty.server.session.Session$SessionInactivityTimer`

**Constructors:**
- `public SessionInactivityTimer()`

**Fields:**
- `protected final org.eclipse.jetty.io.CyclicTimeout _timer`

**Methods:**
- `public void cancel()`
- `public void destroy()`
- `public void schedule(long p0)`

---

## public final static enum `org.eclipse.jetty.server.session.Session$State`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.eclipse.jetty.server.session.Session$State CHANGING`
- `public final static org.eclipse.jetty.server.session.Session$State INVALID`
- `public final static org.eclipse.jetty.server.session.Session$State INVALIDATING`
- `public final static org.eclipse.jetty.server.session.Session$State VALID`

---

## public abstract interface `org.eclipse.jetty.server.session.SessionCache`
implements `org.eclipse.jetty.util.component.LifeCycle`  

**Fields:**
- `public final static int EVICT_ON_INACTIVITY`
- `public final static int EVICT_ON_SESSION_EXIT`
- `public final static int NEVER_EVICT`

**Methods:**
- `public abstract void add(java.lang.String p0, org.eclipse.jetty.server.session.Session p1) throws java.lang.Exception`
- `public abstract java.util.Set checkExpiration(java.util.Set p0)`
- `public abstract void checkInactiveSession(org.eclipse.jetty.server.session.Session p0)`
- `public abstract void commit(org.eclipse.jetty.server.session.Session p0) throws java.lang.Exception`
- `public abstract boolean contains(java.lang.String p0) throws java.lang.Exception`
- `public abstract org.eclipse.jetty.server.session.Session delete(java.lang.String p0) throws java.lang.Exception`
- `public abstract boolean exists(java.lang.String p0) throws java.lang.Exception`
- `public abstract org.eclipse.jetty.server.session.Session get(java.lang.String p0) throws java.lang.Exception`
- `public abstract int getEvictionPolicy()`
- `public abstract org.eclipse.jetty.server.session.SessionDataStore getSessionDataStore()`
- `public abstract org.eclipse.jetty.server.session.SessionHandler getSessionHandler()`
- `public abstract void initialize(org.eclipse.jetty.server.session.SessionContext p0)`
- `public abstract boolean isFlushOnResponseCommit()`
- `public abstract boolean isInvalidateOnShutdown()`
- `public abstract boolean isRemoveUnloadableSessions()`
- `public abstract boolean isSaveOnCreate()`
- `public abstract boolean isSaveOnInactiveEviction()`
- `public abstract org.eclipse.jetty.server.session.Session newSession(jakarta.servlet.http.HttpServletRequest p0, java.lang.String p1, long p2, long p3)`
- `public abstract org.eclipse.jetty.server.session.Session newSession(org.eclipse.jetty.server.session.SessionData p0)`
- `public abstract void put(java.lang.String p0, org.eclipse.jetty.server.session.Session p1) throws java.lang.Exception`
- `public abstract void release(java.lang.String p0, org.eclipse.jetty.server.session.Session p1) throws java.lang.Exception`
- `public abstract org.eclipse.jetty.server.session.Session renewSessionId(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws java.lang.Exception`
- `public abstract void setEvictionPolicy(int p0)`
- `public abstract void setFlushOnResponseCommit(boolean p0)`
- `public abstract void setInvalidateOnShutdown(boolean p0)`
- `public abstract void setRemoveUnloadableSessions(boolean p0)`
- `public abstract void setSaveOnCreate(boolean p0)`
- `public abstract void setSaveOnInactiveEviction(boolean p0)`
- `public abstract void setSessionDataStore(org.eclipse.jetty.server.session.SessionDataStore p0)`
- `public abstract void shutdown()`

---

## public abstract interface `org.eclipse.jetty.server.session.SessionCacheFactory`

**Methods:**
- `public abstract org.eclipse.jetty.server.session.SessionCache getSessionCache(org.eclipse.jetty.server.session.SessionHandler p0)`

---

## public class `org.eclipse.jetty.server.session.SessionContext`

**Constructors:**
- `public SessionContext(java.lang.String p0, org.eclipse.jetty.server.handler.ContextHandler$Context p1)`

**Fields:**
- `public final static java.lang.String NULL_VHOST`

**Methods:**
- `public java.lang.String getCanonicalContextPath()`
- `public org.eclipse.jetty.server.handler.ContextHandler$Context getContext()`
- `public org.eclipse.jetty.server.session.SessionHandler getSessionHandler()`
- `public java.lang.String getVhost()`
- `public java.lang.String getWorkerName()`
- `public void run(java.lang.Runnable p0)`
- `public java.lang.String toString()`

---

## public class `org.eclipse.jetty.server.session.SessionData`
implements `java.io.Serializable`  

**Constructors:**
- `public SessionData(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, long p4, long p5, long p6)`
- `public SessionData(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, long p4, long p5, long p6, java.util.Map p7)`

**Fields:**
- `protected long _accessed`
- `protected java.util.Map _attributes`
- `protected java.lang.String _contextPath`
- `protected long _cookieSet`
- `protected long _created`
- `protected boolean _dirty`
- `protected long _expiry`
- `protected java.lang.String _id`
- `protected long _lastAccessed`
- `protected java.lang.String _lastNode`
- `protected long _lastSaved`
- `protected long _maxInactiveMs`
- `protected boolean _metaDataDirty`
- `protected java.lang.String _vhost`

**Methods:**
- `public void calcAndSetExpiry()`
- `public void calcAndSetExpiry(long p0)`
- `public long calcExpiry()`
- `public long calcExpiry(long p0)`
- `public void clean()`
- `public void clearAllAttributes()`
- `public void copy(org.eclipse.jetty.server.session.SessionData p0)`
- `public static void deserializeAttributes(org.eclipse.jetty.server.session.SessionData p0, java.io.ObjectInputStream p1) throws java.io.IOException, java.lang.ClassNotFoundException`
- `public long getAccessed()`
- `public java.util.Map getAllAttributes()`
- `public java.lang.Object getAttribute(java.lang.String p0)`
- `public java.lang.String getContextPath()`
- `public long getCookieSet()`
- `public long getCreated()`
- `public long getExpiry()`
- `public java.lang.String getId()`
- `public java.util.Set getKeys()`
- `public long getLastAccessed()`
- `public java.lang.String getLastNode()`
- `public long getLastSaved()`
- `public long getMaxInactiveMs()`
- `public java.lang.String getVhost()`
- `public boolean isDirty()`
- `public boolean isExpiredAt(long p0)`
- `public boolean isMetaDataDirty()`
- `public void putAllAttributes(java.util.Map p0)`
- `public static void serializeAttributes(org.eclipse.jetty.server.session.SessionData p0, java.io.ObjectOutputStream p1) throws java.io.IOException`
- `public void setAccessed(long p0)`
- `public java.lang.Object setAttribute(java.lang.String p0, java.lang.Object p1)`
- `public void setContextPath(java.lang.String p0)`
- `public void setCookieSet(long p0)`
- `public void setCreated(long p0)`
- `public void setDirty(boolean p0)`
- `public void setDirty(java.lang.String p0)`
- `public void setExpiry(long p0)`
- `public void setId(java.lang.String p0)`
- `public void setLastAccessed(long p0)`
- `public void setLastNode(java.lang.String p0)`
- `public void setLastSaved(long p0)`
- `public void setMaxInactiveMs(long p0)`
- `public void setMetaDataDirty(boolean p0)`
- `public void setVhost(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public abstract interface `org.eclipse.jetty.server.session.SessionDataMap`
implements `org.eclipse.jetty.util.component.LifeCycle`  

**Methods:**
- `public abstract boolean delete(java.lang.String p0) throws java.lang.Exception`
- `public abstract void initialize(org.eclipse.jetty.server.session.SessionContext p0) throws java.lang.Exception`
- `public abstract org.eclipse.jetty.server.session.SessionData load(java.lang.String p0) throws java.lang.Exception`
- `public abstract void store(java.lang.String p0, org.eclipse.jetty.server.session.SessionData p1) throws java.lang.Exception`

---

## public abstract interface `org.eclipse.jetty.server.session.SessionDataMapFactory`

**Methods:**
- `public abstract org.eclipse.jetty.server.session.SessionDataMap getSessionDataMap()`

---

## public abstract interface `org.eclipse.jetty.server.session.SessionDataStore`
implements `org.eclipse.jetty.server.session.SessionDataMap`  

**Methods:**
- `public abstract boolean exists(java.lang.String p0) throws java.lang.Exception`
- `public abstract java.util.Set getExpired(java.util.Set p0)`
- `public abstract boolean isPassivating()`
- `public abstract org.eclipse.jetty.server.session.SessionData newSessionData(java.lang.String p0, long p1, long p2, long p3, long p4)`

---

## public abstract interface `org.eclipse.jetty.server.session.SessionDataStoreFactory`

**Methods:**
- `public abstract org.eclipse.jetty.server.session.SessionDataStore getSessionDataStore(org.eclipse.jetty.server.session.SessionHandler p0) throws java.lang.Exception`

---

## public class `org.eclipse.jetty.server.session.SessionHandler`
annotations: @org.eclipse.jetty.util.annotation.ManagedObject  
extends `org.eclipse.jetty.server.handler.ScopedHandler`  

**Constructors:**
- `public SessionHandler()`

**Fields:**
- `public final static java.util.Set DEFAULT_SESSION_TRACKING_MODES`
- `public final static java.util.EnumSet DEFAULT_TRACKING`
- `public final static java.lang.Class[] SESSION_LISTENER_TYPES`
- `public final static java.lang.String __CheckRemoteSessionEncoding`
- `public final static java.lang.String __DefaultSessionCookie`
- `public final static java.lang.String __DefaultSessionDomain`
- `public final static java.lang.String __DefaultSessionIdPathParameterName`
- `public final static java.lang.String __MaxAgeProperty`
- `public final static java.lang.String __SessionCookieProperty`
- `public final static java.lang.String __SessionDomainProperty`
- `public final static java.lang.String __SessionIdPathParameterNameProperty`
- `public final static java.lang.String __SessionPathProperty`
- `protected java.util.Set _candidateSessionIdsForExpiry`
- `protected boolean _checkingRemoteSessionIdEncoding`
- `protected org.eclipse.jetty.server.handler.ContextHandler$Context _context`
- `protected int _dftMaxIdleSecs`
- `protected boolean _httpOnly`
- `protected java.lang.ClassLoader _loader`
- `protected int _maxCookieAge`
- `protected boolean _ownScheduler`
- `protected int _refreshCookieAge`
- `protected org.eclipse.jetty.util.thread.Scheduler _scheduler`
- `protected boolean _secureCookies`
- `protected boolean _secureRequestOnly`
- `protected final java.util.List _sessionAttributeListeners`
- `protected org.eclipse.jetty.server.session.SessionCache _sessionCache`
- `protected java.lang.String _sessionComment`
- `protected org.eclipse.jetty.server.session.SessionContext _sessionContext`
- `protected java.lang.String _sessionCookie`
- `protected java.lang.String _sessionDomain`
- `protected final java.util.List _sessionIdListeners`
- `protected org.eclipse.jetty.server.SessionIdManager _sessionIdManager`
- `protected java.lang.String _sessionIdPathParameterName`
- `protected java.lang.String _sessionIdPathParameterNamePrefix`
- `protected final java.util.List _sessionListeners`
- `protected java.lang.String _sessionPath`
- `protected final org.eclipse.jetty.util.statistic.SampleStatistic _sessionTimeStats`
- `public java.util.Set _sessionTrackingModes`
- `protected final org.eclipse.jetty.util.statistic.CounterStatistic _sessionsCreatedStats`
- `protected boolean _usingCookies`
- `protected boolean _usingURLs`

**Methods:**
- `public org.eclipse.jetty.http.HttpCookie access(jakarta.servlet.http.HttpSession p0, boolean p1)`
- `public boolean addEventListener(java.util.EventListener p0)`
- `protected void callSessionCreatedListeners(org.eclipse.jetty.server.session.Session p0)`
- `protected void callSessionDestroyedListeners(org.eclipse.jetty.server.session.Session p0)`
- `protected void callSessionIdListeners(org.eclipse.jetty.server.session.Session p0, java.lang.String p1)`
- `protected void checkRequestedSessionId(org.eclipse.jetty.server.Request p0, jakarta.servlet.http.HttpServletRequest p1)`
- `public void commit(jakarta.servlet.http.HttpSession p0)`
- `public void complete(jakarta.servlet.http.HttpSession p0)`
- `public void doHandle(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `public void doScope(java.lang.String p0, org.eclipse.jetty.server.Request p1, jakarta.servlet.http.HttpServletRequest p2, jakarta.servlet.http.HttpServletResponse p3) throws jakarta.servlet.ServletException, java.io.IOException`
- `public void doSessionAttributeListeners(org.eclipse.jetty.server.session.Session p0, java.lang.String p1, java.lang.Object p2, java.lang.Object p3)`
- `protected void doStart() throws java.lang.Exception`
- `protected void doStop() throws java.lang.Exception`
- `public java.util.Set getDefaultSessionTrackingModes()`
- `public java.util.Set getEffectiveSessionTrackingModes()`
- `public java.lang.String getExtendedId(jakarta.servlet.http.HttpSession p0)`
- `public boolean getHttpOnly()`
- `protected jakarta.servlet.http.HttpSession getHttpSession(java.lang.String p0)`
- `public java.lang.String getId(jakarta.servlet.http.HttpSession p0)`
- `public int getMaxCookieAge()`
- `public int getMaxInactiveInterval()`
- `public int getRefreshCookieAge()`
- `public org.eclipse.jetty.http.HttpCookie$SameSite getSameSite()`
- `public org.eclipse.jetty.util.thread.Scheduler getScheduler()`
- `public boolean getSecureCookies()`
- `public org.eclipse.jetty.server.session.Session getSession(java.lang.String p0)`
- `public org.eclipse.jetty.server.session.SessionCache getSessionCache()`
- `public java.lang.String getSessionCookie()`
- `public org.eclipse.jetty.http.HttpCookie getSessionCookie(jakarta.servlet.http.HttpSession p0, java.lang.String p1, boolean p2)`
- `public jakarta.servlet.SessionCookieConfig getSessionCookieConfig()`
- `public static java.lang.String getSessionCookieName(jakarta.servlet.SessionCookieConfig p0)`
- `public java.lang.String getSessionDomain()`
- `public org.eclipse.jetty.server.SessionIdManager getSessionIdManager()`
- `public java.lang.String getSessionIdPathParameterName()`
- `public java.lang.String getSessionIdPathParameterNamePrefix()`
- `public java.lang.String getSessionPath()`
- `public long getSessionTimeMax()`
- `public double getSessionTimeMean()`
- `public double getSessionTimeStdDev()`
- `public long getSessionTimeTotal()`
- `public int getSessionsCreated()`
- `public void invalidate(java.lang.String p0)`
- `public boolean isCheckingRemoteSessionIdEncoding()`
- `public boolean isIdInUse(java.lang.String p0) throws java.lang.Exception`
- `public boolean isSecureRequestOnly()`
- `public boolean isUsingCookies()`
- `public boolean isUsingURLs()`
- `public boolean isValid(jakarta.servlet.http.HttpSession p0)`
- `public jakarta.servlet.http.HttpSession newHttpSession(jakarta.servlet.http.HttpServletRequest p0)`
- `protected void recordSessionTime(org.eclipse.jetty.server.session.Session p0)`
- `public boolean removeEventListener(java.util.EventListener p0)`
- `public org.eclipse.jetty.server.session.Session removeSession(java.lang.String p0, boolean p1)`
- `public void renewSessionId(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3)`
- `public void scavenge()`
- `public void sessionInactivityTimerExpired(org.eclipse.jetty.server.session.Session p0, long p1)`
- `public void setCheckingRemoteSessionIdEncoding(boolean p0)`
- `public void setHttpOnly(boolean p0)`
- `public void setMaxInactiveInterval(int p0)`
- `public void setRefreshCookieAge(int p0)`
- `public void setSameSite(org.eclipse.jetty.http.HttpCookie$SameSite p0)`
- `public void setSecureRequestOnly(boolean p0)`
- `public void setSessionCache(org.eclipse.jetty.server.session.SessionCache p0)`
- `public void setSessionCookie(java.lang.String p0)`
- `public void setSessionIdManager(org.eclipse.jetty.server.SessionIdManager p0)`
- `public void setSessionIdPathParameterName(java.lang.String p0)`
- `public void setSessionTrackingModes(java.util.Set p0)`
- `public void setUsingCookies(boolean p0)`
- `protected void shutdownSessions() throws java.lang.Exception`
- `public void statsReset()`
- `public java.lang.String toString()`

---

## public final class `org.eclipse.jetty.server.session.SessionHandler$CookieConfig`
implements `jakarta.servlet.SessionCookieConfig`  

**Constructors:**
- `public CookieConfig()`

**Methods:**
- `public java.lang.String getComment()`
- `public java.lang.String getDomain()`
- `public int getMaxAge()`
- `public java.lang.String getName()`
- `public java.lang.String getPath()`
- `public boolean isHttpOnly()`
- `public boolean isSecure()`
- `public void setComment(java.lang.String p0)`
- `public void setDomain(java.lang.String p0)`
- `public void setHttpOnly(boolean p0)`
- `public void setMaxAge(int p0)`
- `public void setName(java.lang.String p0)`
- `public void setPath(java.lang.String p0)`
- `public void setSecure(boolean p0)`

---

## public abstract static interface `org.eclipse.jetty.server.session.SessionHandler$SessionIf`
implements `jakarta.servlet.http.HttpSession`  

**Methods:**
- `public abstract org.eclipse.jetty.server.session.Session getSession()`

---

## public class `org.eclipse.jetty.server.session.UnreadableSessionDataException`
extends `java.lang.Exception`  

**Constructors:**
- `public UnreadableSessionDataException(java.lang.String p0, org.eclipse.jetty.server.session.SessionContext p1, java.lang.Throwable p2)`

**Methods:**
- `public java.lang.String getId()`
- `public org.eclipse.jetty.server.session.SessionContext getSessionContext()`

---

## public class `org.eclipse.jetty.server.session.UnwriteableSessionDataException`
extends `java.lang.Exception`  

**Constructors:**
- `public UnwriteableSessionDataException(java.lang.String p0, org.eclipse.jetty.server.session.SessionContext p1, java.lang.Throwable p2)`

**Methods:**
- `public java.lang.String getId()`
- `public org.eclipse.jetty.server.session.SessionContext getSessionContext()`

---

