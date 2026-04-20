# Breaking Changes: org.eclipse.jetty:jetty-server 8.1.11.v20130520 → 11.0.10
Total: 770 (binary-breaking: 666, source-breaking: 733)

## org.eclipse.jetty.server.AbstractConnector

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.eclipse.jetty.server.AbstractConnector.<init>()`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.eclipse.jetty.server.AbstractConnector._buffers`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.eclipse.jetty.server.AbstractConnector._lowResourceMaxIdleTime`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.eclipse.jetty.server.AbstractConnector._maxIdleTime`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.eclipse.jetty.server.AbstractConnector._soLingerTime`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.checkForwardedHeaders(org.eclipse.jetty.io.EndPoint,org.eclipse.jetty.server.Request)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.configure(java.net.Socket)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.connectionClosed(org.eclipse.jetty.io.Connection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.connectionOpened(org.eclipse.jetty.io.Connection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.connectionUpgraded(org.eclipse.jetty.io.Connection,org.eclipse.jetty.io.Connection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.customize(org.eclipse.jetty.io.EndPoint,org.eclipse.jetty.server.Request)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getAcceptQueueSize()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getAcceptorPriorityOffset()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getConfidentialPort()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getConfidentialScheme()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getConnections()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getConnectionsDurationMax()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getConnectionsDurationMean()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getConnectionsDurationStdDev()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getConnectionsDurationTotal()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getConnectionsOpen()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getConnectionsOpenMax()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getConnectionsRequestsMax()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getConnectionsRequestsMean()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getConnectionsRequestsStdDev()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getForwardedCipherSuiteHeader()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getForwardedForHeader()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getForwardedHostHeader()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getForwardedProtoHeader()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getForwardedServerHeader()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getForwardedSslSessionIdHeader()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getHost()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getHostHeader()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getIntegralPort()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getIntegralScheme()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getLeftMostFieldValue(org.eclipse.jetty.http.HttpFields,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getLowResourceMaxIdleTime()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getLowResourcesMaxIdleTime()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getMaxBuffers()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getMaxIdleTime()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getPort()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getRequestBufferSize()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getRequestBufferType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getRequestBuffers()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getRequestHeaderSize()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getRequestHeaderType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getRequests()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getResolveNames()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getResponseBufferSize()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getResponseBufferType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getResponseBuffers()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getResponseHeaderSize()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getResponseHeaderType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getReuseAddress()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getSoLingerTime()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getStatsOn()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getStatsOnMs()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getThreadPool()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.isConfidential(org.eclipse.jetty.server.Request)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.isForwarded()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.isIntegral(org.eclipse.jetty.server.Request)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.isLowResources()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.persist(org.eclipse.jetty.io.EndPoint)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setAcceptQueueSize(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setAcceptorPriorityOffset(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setAcceptors(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setConfidentialPort(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setConfidentialScheme(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setForwarded(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setForwardedCipherSuiteHeader(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setForwardedForHeader(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setForwardedHostHeader(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setForwardedProtoHeader(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setForwardedServerHeader(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setForwardedSslSessionIdHeader(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setHost(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setHostHeader(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setIntegralPort(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setIntegralScheme(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setLowResourceMaxIdleTime(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setLowResourcesMaxIdleTime(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setMaxBuffers(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setMaxIdleTime(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setPort(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setRequestBufferSize(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setRequestBuffers(org.eclipse.jetty.io.Buffers)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setRequestHeaderSize(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setResolveNames(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setResponseBufferSize(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setResponseBuffers(org.eclipse.jetty.io.Buffers)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setResponseHeaderSize(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setReuseAddress(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setServer(org.eclipse.jetty.server.Server)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setSoLingerTime(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setStatsOn(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setThreadPool(org.eclipse.jetty.util.thread.ThreadPool)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.statsReset()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.stopAccept(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.close()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getConnection()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getLocalPort()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.open()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.AbstractConnector`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.Connector.getTransport()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.AbstractConnector`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.AbstractConnector`

## org.eclipse.jetty.server.AbstractHttpConnection

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.AbstractHttpConnection`

## org.eclipse.jetty.server.AbstractHttpConnection$Output

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.AbstractHttpConnection$Output`

## org.eclipse.jetty.server.AbstractHttpConnection$OutputWriter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.AbstractHttpConnection$OutputWriter`

## org.eclipse.jetty.server.AsyncContinuation

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.AsyncContinuation`

## org.eclipse.jetty.server.AsyncContinuation$AsyncEventState

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.AsyncContinuation$AsyncEventState`

## org.eclipse.jetty.server.AsyncContinuation$AsyncTimeout

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.AsyncContinuation$AsyncTimeout`

## org.eclipse.jetty.server.AsyncHttpConnection

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.AsyncHttpConnection`

## org.eclipse.jetty.server.AsyncNCSARequestLog

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.AsyncNCSARequestLog`

## org.eclipse.jetty.server.Authentication$Deferred

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Authentication$Deferred.authenticate(javax.servlet.ServletRequest)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Authentication$Deferred.authenticate(javax.servlet.ServletRequest,javax.servlet.ServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Authentication$Deferred.login(java.lang.String,java.lang.Object,javax.servlet.ServletRequest)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.Authentication$Deferred`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.Authentication$Deferred.authenticate(jakarta.servlet.ServletRequest)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.Authentication$Deferred`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.Authentication$LoginAuthentication.login(java.lang.String,java.lang.Object,jakarta.servlet.ServletRequest)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.Authentication$Deferred`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.Authentication$LogoutAuthentication.logout(jakarta.servlet.ServletRequest)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.Authentication$Deferred`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.Authentication$Deferred.authenticate(jakarta.servlet.ServletRequest,jakarta.servlet.ServletResponse)`

## org.eclipse.jetty.server.Authentication$User

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Authentication$User.logout()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.Authentication$User`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.Authentication$LogoutAuthentication.logout(jakarta.servlet.ServletRequest)`

## org.eclipse.jetty.server.Authentication$Wrapped

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.Authentication$Wrapped.getHttpServletRequest()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Authentication$Wrapped.getHttpServletRequest()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.Authentication$Wrapped.getHttpServletResponse()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Authentication$Wrapped.getHttpServletResponse()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.Authentication$Wrapped.getHttpServletRequest()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Authentication$Wrapped.getHttpServletRequest()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.Authentication$Wrapped.getHttpServletResponse()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Authentication$Wrapped.getHttpServletResponse()`

## org.eclipse.jetty.server.BlockingHttpConnection

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.BlockingHttpConnection`

## org.eclipse.jetty.server.Connector

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.close()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.customize(org.eclipse.jetty.io.EndPoint,org.eclipse.jetty.server.Request)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getConfidentialPort()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getConfidentialScheme()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getConnection()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getConnections()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getConnectionsDurationMax()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getConnectionsDurationMean()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getConnectionsDurationStdDev()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getConnectionsDurationTotal()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getConnectionsOpen()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getConnectionsOpenMax()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getConnectionsRequestsMax()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getConnectionsRequestsMean()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getConnectionsRequestsStdDev()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getHost()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getIntegralPort()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getIntegralScheme()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getLocalPort()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getLowResourceMaxIdleTime()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getMaxIdleTime()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getPort()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getRequestBufferSize()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getRequestBuffers()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getRequestHeaderSize()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getRequests()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getResolveNames()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getResponseBufferSize()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getResponseBuffers()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getResponseHeaderSize()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getStatsOn()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.getStatsOnMs()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.isConfidential(org.eclipse.jetty.server.Request)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.isIntegral(org.eclipse.jetty.server.Request)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.isLowResources()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.open()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.persist(org.eclipse.jetty.io.EndPoint)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.setHost(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.setLowResourceMaxIdleTime(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.setMaxIdleTime(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.setPort(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.setRequestBufferSize(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.setRequestHeaderSize(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.setResponseBufferSize(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.setResponseHeaderSize(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.setServer(org.eclipse.jetty.server.Server)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.setStatsOn(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Connector.statsReset()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.Connector`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.Connector.getConnectionFactories()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.Connector`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.Connector.getByteBufferPool()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.Connector`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.Connector.getDefaultConnectionFactory()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.Connector`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.Connector.getProtocols()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.Connector`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.Connector.getIdleTimeout()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.Connector`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.Connector.getConnectedEndPoints()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.Connector`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.Connector.getTransport()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.Connector`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.Connector.getConnectionFactory(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.Connector`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.Connector.getScheduler()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.Connector`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.Connector.getExecutor()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.Connector`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.Connector.getConnectionFactory(java.lang.Class<T>)`

## org.eclipse.jetty.server.CookieCutter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.CookieCutter`

## org.eclipse.jetty.server.Dispatcher

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.eclipse.jetty.server.Dispatcher.<init>(org.eclipse.jetty.server.handler.ContextHandler,java.lang.String,java.lang.String,java.lang.String)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.eclipse.jetty.server.Dispatcher.__JSP_FILE`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Dispatcher.error(javax.servlet.ServletRequest,javax.servlet.ServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Dispatcher.forward(javax.servlet.ServletRequest,javax.servlet.ServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Dispatcher.forward(javax.servlet.ServletRequest,javax.servlet.ServletResponse,javax.servlet.DispatcherType)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Dispatcher.include(javax.servlet.ServletRequest,javax.servlet.ServletResponse)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.Dispatcher`

## org.eclipse.jetty.server.Handler

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Handler.handle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.Handler`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.Handler.handle(java.lang.String,org.eclipse.jetty.server.Request,jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)`

## org.eclipse.jetty.server.HttpInput

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.eclipse.jetty.server.HttpInput.<init>(org.eclipse.jetty.server.AbstractHttpConnection)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.eclipse.jetty.server.HttpInput._connection`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.eclipse.jetty.server.HttpInput._parser`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.eclipse.jetty.server.HttpInput.available()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.HttpInput`

## org.eclipse.jetty.server.HttpOutput

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.eclipse.jetty.server.HttpOutput.<init>(org.eclipse.jetty.server.AbstractHttpConnection)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.eclipse.jetty.server.HttpOutput._connection`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.eclipse.jetty.server.HttpOutput._generator`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.HttpOutput.getMaxIdleTime()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.HttpOutput.write(byte[])`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.HttpOutput`

## org.eclipse.jetty.server.HttpWriter

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.eclipse.jetty.server.HttpWriter`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.HttpWriter.setCharacterEncoding(java.lang.String)`

## org.eclipse.jetty.server.InclusiveByteRange

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.eclipse.jetty.server.InclusiveByteRange.satisfiableRanges(java.util.Enumeration,long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.InclusiveByteRange.getFirst(long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.InclusiveByteRange.getLast(long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.InclusiveByteRange.getSize(long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.InclusiveByteRange.satisfiableRanges(java.util.Enumeration,long)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.InclusiveByteRange.satisfiableRanges(java.util.Enumeration<java.lang.String>,long)`

## org.eclipse.jetty.server.LocalConnector

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.eclipse.jetty.server.LocalConnector.<init>()`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.eclipse.jetty.server.AbstractConnector._buffers`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.eclipse.jetty.server.AbstractConnector._lowResourceMaxIdleTime`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.eclipse.jetty.server.AbstractConnector._maxIdleTime`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.eclipse.jetty.server.AbstractConnector._soLingerTime`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.eclipse.jetty.server.LocalConnector.accept(int)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.eclipse.jetty.server.LocalConnector.executeRequest(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.checkForwardedHeaders(org.eclipse.jetty.io.EndPoint,org.eclipse.jetty.server.Request)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.configure(java.net.Socket)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.connectionClosed(org.eclipse.jetty.io.Connection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.connectionOpened(org.eclipse.jetty.io.Connection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.connectionUpgraded(org.eclipse.jetty.io.Connection,org.eclipse.jetty.io.Connection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.customize(org.eclipse.jetty.io.EndPoint,org.eclipse.jetty.server.Request)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getAcceptQueueSize()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getAcceptorPriorityOffset()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getConfidentialPort()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getConfidentialScheme()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getConnections()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getConnectionsDurationMax()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getConnectionsDurationMean()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getConnectionsDurationStdDev()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getConnectionsDurationTotal()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getConnectionsOpen()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getConnectionsOpenMax()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getConnectionsRequestsMax()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getConnectionsRequestsMean()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getConnectionsRequestsStdDev()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getForwardedCipherSuiteHeader()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getForwardedForHeader()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getForwardedHostHeader()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getForwardedProtoHeader()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getForwardedServerHeader()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getForwardedSslSessionIdHeader()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getHost()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getHostHeader()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getIntegralPort()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getIntegralScheme()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getLeftMostFieldValue(org.eclipse.jetty.http.HttpFields,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getLowResourceMaxIdleTime()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getLowResourcesMaxIdleTime()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getMaxBuffers()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getMaxIdleTime()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getPort()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getRequestBufferSize()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getRequestBufferType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getRequestBuffers()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getRequestHeaderSize()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getRequestHeaderType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getRequests()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getResolveNames()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getResponseBufferSize()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getResponseBufferType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getResponseBuffers()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getResponseHeaderSize()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getResponseHeaderType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getReuseAddress()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getSoLingerTime()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getStatsOn()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getStatsOnMs()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.getThreadPool()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.isConfidential(org.eclipse.jetty.server.Request)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.isForwarded()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.isIntegral(org.eclipse.jetty.server.Request)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.isLowResources()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.persist(org.eclipse.jetty.io.EndPoint)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setAcceptQueueSize(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setAcceptorPriorityOffset(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setAcceptors(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setConfidentialPort(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setConfidentialScheme(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setForwarded(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setForwardedCipherSuiteHeader(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setForwardedForHeader(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setForwardedHostHeader(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setForwardedProtoHeader(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setForwardedServerHeader(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setForwardedSslSessionIdHeader(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setHost(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setHostHeader(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setIntegralPort(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setIntegralScheme(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setLowResourceMaxIdleTime(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setLowResourcesMaxIdleTime(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setMaxBuffers(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setMaxIdleTime(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setPort(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setRequestBufferSize(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setRequestBuffers(org.eclipse.jetty.io.Buffers)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setRequestHeaderSize(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setResolveNames(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setResponseBufferSize(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setResponseBuffers(org.eclipse.jetty.io.Buffers)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setResponseHeaderSize(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setReuseAddress(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setServer(org.eclipse.jetty.server.Server)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setSoLingerTime(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setStatsOn(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.setThreadPool(org.eclipse.jetty.util.thread.ThreadPool)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.statsReset()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.AbstractConnector.stopAccept(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.LocalConnector.close()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.LocalConnector.getConnection()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.LocalConnector.getLocalPort()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.LocalConnector.getResponses(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.LocalConnector.getResponses(java.lang.String,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.LocalConnector.getResponses(org.eclipse.jetty.io.ByteArrayBuffer,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.LocalConnector.open()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.LocalConnector.executeRequest(java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.LocalConnector.executeRequest(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.LocalConnector.executeRequest(java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.LocalConnector.executeRequest(java.lang.String)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.LocalConnector`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.LocalConnector`

## org.eclipse.jetty.server.NCSARequestLog

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.NCSARequestLog`

## org.eclipse.jetty.server.Request

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.eclipse.jetty.server.Request.<init>()`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.eclipse.jetty.server.Request.<init>(org.eclipse.jetty.server.AbstractHttpConnection)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.eclipse.jetty.server.Request.__MULTIPART_CONTEXT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.eclipse.jetty.server.Request.__MULTIPART_INPUT_STREAM`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.eclipse.jetty.server.Request._async`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.eclipse.jetty.server.Request._connection`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.authenticate(javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.extractParameters()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.getAsyncContinuation()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.getConnection()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.getDispatchTime()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.getParameters()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.getRequest(javax.servlet.http.HttpServletRequest)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.getSessionManager()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.getTimeStampBuffer()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.getUri()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.mergeQueryString(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.recoverNewSession(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.saveNewSession(java.lang.Object,javax.servlet.http.HttpSession)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.setAsyncSupported(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.setConnection(org.eclipse.jetty.server.AbstractHttpConnection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.setContext(org.eclipse.jetty.server.handler.ContextHandler$Context)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.setContextPath(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.setCookies(javax.servlet.http.Cookie[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.setDispatchTime(long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.setDispatcherType(javax.servlet.DispatcherType)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.setParameters(org.eclipse.jetty.util.MultiMap<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.setPathInfo(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.setProtocol(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.setQueryString(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.setRemoteAddr(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.setRemoteHost(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.setRequestURI(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.setScheme(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.setServerName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.setServerPort(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.setServletPath(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.setSession(javax.servlet.http.HttpSession)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.setSessionManager(org.eclipse.jetty.server.SessionManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.setUri(org.eclipse.jetty.http.HttpURI)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Request.startAsync(javax.servlet.ServletRequest,javax.servlet.ServletResponse)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.Request.getAsyncContext()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getAsyncContext()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.Request.getAttributeNames()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getAttributeNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.Request.getCookies()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getCookies()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.Request.getDispatcherType()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getDispatcherType()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.Request.getHeaderNames()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getHeaderNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.Request.getHeaders(java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getHeaders(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.Request.getInputStream()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getInputStream()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.Request.getLocales()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getLocales()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.Request.getParameterMap()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getParameterMap()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.Request.getParameterNames()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getParameterNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.Request.getPart(java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getPart(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.Request.getParts()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getParts()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.Request.getRequestDispatcher(java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getRequestDispatcher(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.Request.getServletContext()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getServletContext()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.Request.getServletResponse()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getServletResponse()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.Request.getSession()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getSession()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.Request.getSession(boolean)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getSession(boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.Request.startAsync()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.startAsync()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.Request.getAsyncContext()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getAsyncContext()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.Request.getCookies()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getCookies()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.Request.getDispatcherType()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getDispatcherType()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.Request.getInputStream()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getInputStream()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.Request.getPart(java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getPart(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.Request.getRequestDispatcher(java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getRequestDispatcher(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.Request.getServletContext()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getServletContext()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.Request.getServletResponse()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getServletResponse()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.Request.getSession()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getSession()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.Request.getSession(boolean)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.getSession(boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.Request.startAsync()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Request.startAsync()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.Request`

## org.eclipse.jetty.server.Request$MultiPartCleanerListener

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.Request$MultiPartCleanerListener`

## org.eclipse.jetty.server.RequestLog

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.RequestLog`

## org.eclipse.jetty.server.ResourceCache

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.ResourceCache`

## org.eclipse.jetty.server.ResourceCache$Content

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.ResourceCache$Content`

## org.eclipse.jetty.server.Response

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.eclipse.jetty.server.Response.<init>(org.eclipse.jetty.server.AbstractHttpConnection)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.eclipse.jetty.server.Response.HTTP_ONLY_COMMENT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.eclipse.jetty.server.Response.NONE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.eclipse.jetty.server.Response.STREAM`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.eclipse.jetty.server.Response.WRITER`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Response.addCookie(javax.servlet.http.Cookie)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Response.complete()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Response.fwdReset()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Response.getResponse(javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Response.isOutputing()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Response.reset(boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.Response.getHttpFields()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Response.getHttpFields()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.Response.getOutputStream()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Response.getOutputStream()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.Response.getHttpFields()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Response.getHttpFields()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.Response.getOutputStream()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Response.getOutputStream()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.Response`

## org.eclipse.jetty.server.Server

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Server.addBean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Server.addLifeCycle(org.eclipse.jetty.util.component.LifeCycle)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Server.getContainer()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Server.getGracefulShutdown()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Server.getMaxCookieVersion()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Server.getSendDateHeader()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Server.getSendServerVersion()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Server.handle(org.eclipse.jetty.server.AbstractHttpConnection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Server.handleAsync(org.eclipse.jetty.server.AbstractHttpConnection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Server.isUncheckedPrintWriter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Server.removeBean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Server.removeLifeCycle(org.eclipse.jetty.util.component.LifeCycle)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Server.setGracefulShutdown(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Server.setMaxCookieVersion(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Server.setSendDateHeader(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Server.setSendServerVersion(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Server.setThreadPool(org.eclipse.jetty.util.thread.ThreadPool)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Server.setUncheckedPrintWriter(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandler.dumpThis(java.lang.Appendable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.expandHandler(org.eclipse.jetty.server.Handler,java.lang.Object,java.lang.Class<org.eclipse.jetty.server.Handler>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerWrapper.expandChildren(java.lang.Object,java.lang.Class)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerWrapper.getNestedHandlerByClass(java.lang.Class<H>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerWrapper.handle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.Server.getAttributeNames()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.Server.getAttributeNames()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.Server`

## org.eclipse.jetty.server.Server$Graceful

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.Server$Graceful`

## org.eclipse.jetty.server.ServletRequestHttpWrapper

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.eclipse.jetty.server.ServletRequestHttpWrapper.<init>(javax.servlet.ServletRequest)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.ServletRequestHttpWrapper.authenticate(javax.servlet.http.HttpServletResponse)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.ServletRequestHttpWrapper.getCookies()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.ServletRequestHttpWrapper.getCookies()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.ServletRequestHttpWrapper.getHeaderNames()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.ServletRequestHttpWrapper.getHeaderNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.ServletRequestHttpWrapper.getHeaders(java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.ServletRequestHttpWrapper.getHeaders(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.ServletRequestHttpWrapper.getPart(java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.ServletRequestHttpWrapper.getPart(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.ServletRequestHttpWrapper.getParts()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.ServletRequestHttpWrapper.getParts()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.ServletRequestHttpWrapper.getSession()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.ServletRequestHttpWrapper.getSession()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.ServletRequestHttpWrapper.getSession(boolean)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.ServletRequestHttpWrapper.getSession(boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.ServletRequestHttpWrapper.getCookies()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.ServletRequestHttpWrapper.getCookies()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.ServletRequestHttpWrapper.getPart(java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.ServletRequestHttpWrapper.getPart(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.ServletRequestHttpWrapper.getSession()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.ServletRequestHttpWrapper.getSession()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.ServletRequestHttpWrapper.getSession(boolean)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.ServletRequestHttpWrapper.getSession(boolean)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.ServletRequestHttpWrapper`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.ServletRequestHttpWrapper`

## org.eclipse.jetty.server.ServletResponseHttpWrapper

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.eclipse.jetty.server.ServletResponseHttpWrapper.<init>(javax.servlet.ServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.ServletResponseHttpWrapper.addCookie(javax.servlet.http.Cookie)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.ServletResponseHttpWrapper`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.ServletResponseHttpWrapper`

## org.eclipse.jetty.server.SessionIdManager

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.SessionIdManager.addSession(javax.servlet.http.HttpSession)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.SessionIdManager.getClusterId(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.SessionIdManager.getNodeId(java.lang.String,javax.servlet.http.HttpServletRequest)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.SessionIdManager.idInUse(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.SessionIdManager.newSessionId(javax.servlet.http.HttpServletRequest,long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.SessionIdManager.removeSession(javax.servlet.http.HttpSession)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.SessionIdManager`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.SessionIdManager.getExtendedId(java.lang.String,jakarta.servlet.http.HttpServletRequest)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.SessionIdManager`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.SessionIdManager.getSessionHandlers()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.SessionIdManager`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.SessionIdManager.expireAll(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.SessionIdManager`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.SessionIdManager.setSessionHouseKeeper(org.eclipse.jetty.server.session.HouseKeeper)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.SessionIdManager`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.SessionIdManager.getSessionHouseKeeper()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.SessionIdManager`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.SessionIdManager.newSessionId(jakarta.servlet.http.HttpServletRequest,long)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.SessionIdManager`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.SessionIdManager.getId(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.SessionIdManager`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.SessionIdManager.renewSessionId(java.lang.String,java.lang.String,jakarta.servlet.http.HttpServletRequest)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.SessionIdManager`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.SessionIdManager.isIdInUse(java.lang.String)`

## org.eclipse.jetty.server.SessionManager

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.SessionManager`

## org.eclipse.jetty.server.ShutdownMonitor

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.ShutdownMonitor.getServerSocket()`

## org.eclipse.jetty.server.ShutdownMonitor$ShutdownMonitorThread

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.ShutdownMonitor$ShutdownMonitorThread`

## org.eclipse.jetty.server.UserIdentity$Scope

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.UserIdentity$Scope`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.UserIdentity$Scope.getContextHandler()`

## org.eclipse.jetty.server.bio.SocketConnector

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.bio.SocketConnector`

## org.eclipse.jetty.server.bio.SocketConnector$ConnectorEndPoint

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.bio.SocketConnector$ConnectorEndPoint`

## org.eclipse.jetty.server.handler.AbstractHandler

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Handler.handle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandler.dumpThis(java.lang.Appendable)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.handler.AbstractHandler`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.handler.AbstractHandler.handle(java.lang.String,org.eclipse.jetty.server.Request,jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.handler.AbstractHandler`

## org.eclipse.jetty.server.handler.AbstractHandlerContainer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.Handler.handle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandler.dumpThis(java.lang.Appendable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.dump(java.lang.Appendable,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.expandChildren(java.lang.Object,java.lang.Class<? extends java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.expandHandler(org.eclipse.jetty.server.Handler,java.lang.Object,java.lang.Class<org.eclipse.jetty.server.Handler>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.handler.AbstractHandlerContainer`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.handler.AbstractHandler.handle(java.lang.String,org.eclipse.jetty.server.Request,jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.handler.AbstractHandlerContainer`

## org.eclipse.jetty.server.handler.ConnectHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.handler.ConnectHandler`

## org.eclipse.jetty.server.handler.ConnectHandler$ClientToProxyConnection

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.handler.ConnectHandler$ClientToProxyConnection`

## org.eclipse.jetty.server.handler.ConnectHandler$ProxyToServerConnection

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.handler.ConnectHandler$ProxyToServerConnection`

## org.eclipse.jetty.server.handler.ContextHandler

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandler.dumpThis(java.lang.Appendable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.expandHandler(org.eclipse.jetty.server.Handler,java.lang.Object,java.lang.Class<org.eclipse.jetty.server.Handler>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.callContextDestroyed(javax.servlet.ServletContextListener,javax.servlet.ServletContextEvent)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.callContextInitialized(javax.servlet.ServletContextListener,javax.servlet.ServletContextEvent)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.checkContext(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.checkManagedAttribute(java.lang.String,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.doHandle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.doScope(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.getConnectorNames()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.getEventListeners()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.isAliases()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.restrictEventListener(java.util.EventListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.setAliases(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.setConnectorNames(java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.setEventListeners(java.util.EventListener[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.setLogger(org.eclipse.jetty.util.log.Logger)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.setManagedAttribute(java.lang.String,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.setShutdown(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerWrapper.expandChildren(java.lang.Object,java.lang.Class)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerWrapper.getNestedHandlerByClass(java.lang.Class<H>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ScopedHandler.handle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ScopedHandler.never()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ScopedHandler.nextHandle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ScopedHandler.nextScope(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler.addEventListener(java.util.EventListener)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler.addEventListener(java.util.EventListener)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler.getAttributeNames()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler.getAttributeNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler.getInitParameterNames()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler.getInitParameterNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler.getLogger()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler.getLogger()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.handler.ContextHandler.addEventListener(java.util.EventListener)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler.addEventListener(java.util.EventListener)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.handler.ContextHandler.getLogger()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler.getLogger()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.handler.ContextHandler`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.handler.ContextHandler`

## org.eclipse.jetty.server.handler.ContextHandler$ApprovePathPrefixAliases

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.handler.ContextHandler$ApprovePathPrefixAliases`

## org.eclipse.jetty.server.handler.ContextHandler$ApproveSameSuffixAliases

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.handler.ContextHandler$ApproveSameSuffixAliases`

## org.eclipse.jetty.server.handler.ContextHandler$Context

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.eclipse.jetty.server.handler.ContextHandler$Context._majorVersion`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.eclipse.jetty.server.handler.ContextHandler$Context._minorVersion`

### FORMAL_TYPE_PARAMETER_CHANGED [binary ✓ | source ✗]
- FORMAL TYPE PARAMETER CHANGED: `org.eclipse.jetty.server.handler.ContextHandler$Context.createFilter(java.lang.Class<T>)`

### FORMAL_TYPE_PARAMETER_CHANGED [binary ✓ | source ✗]
- FORMAL TYPE PARAMETER CHANGED: `org.eclipse.jetty.server.handler.ContextHandler$Context.createServlet(java.lang.Class<T>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.eclipse.jetty.server.handler.ContextHandler$Context.addFilter(java.lang.String,java.lang.Class<? extends javax.servlet.Filter>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.eclipse.jetty.server.handler.ContextHandler$Context.addServlet(java.lang.String,java.lang.Class<? extends javax.servlet.Servlet>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.eclipse.jetty.server.handler.ContextHandler$Context.setSessionTrackingModes(java.util.Set<javax.servlet.SessionTrackingMode>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler$Context.addFilter(java.lang.String,javax.servlet.Filter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler$Context.addServlet(java.lang.String,javax.servlet.Servlet)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler$Context.setJspConfigDescriptor(javax.servlet.descriptor.JspConfigDescriptor)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler$Context.addFilter(java.lang.String,java.lang.Class<? extends javax.servlet.Filter>)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$StaticContext.addFilter(java.lang.String,java.lang.Class<? extends jakarta.servlet.Filter>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler$Context.addFilter(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$StaticContext.addFilter(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler$Context.addServlet(java.lang.String,java.lang.Class<? extends javax.servlet.Servlet>)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$StaticContext.addServlet(java.lang.String,java.lang.Class<? extends jakarta.servlet.Servlet>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler$Context.addServlet(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$StaticContext.addServlet(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler$Context.getAttributeNames()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$Context.getAttributeNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler$Context.getContext(java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$Context.getContext(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler$Context.getDefaultSessionTrackingModes()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$StaticContext.getDefaultSessionTrackingModes()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler$Context.getEffectiveSessionTrackingModes()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$StaticContext.getEffectiveSessionTrackingModes()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler$Context.getFilterRegistration(java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$StaticContext.getFilterRegistration(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler$Context.getFilterRegistrations()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$StaticContext.getFilterRegistrations()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler$Context.getInitParameterNames()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$Context.getInitParameterNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler$Context.getJspConfigDescriptor()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$Context.getJspConfigDescriptor()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler$Context.getNamedDispatcher(java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$StaticContext.getNamedDispatcher(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler$Context.getRequestDispatcher(java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$Context.getRequestDispatcher(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler$Context.getResourcePaths(java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$Context.getResourcePaths(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler$Context.getServlet(java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$StaticContext.getServlet(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler$Context.getServletNames()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$StaticContext.getServletNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler$Context.getServletRegistration(java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$StaticContext.getServletRegistration(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler$Context.getServletRegistrations()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$StaticContext.getServletRegistrations()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler$Context.getServlets()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$StaticContext.getServlets()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler$Context.getSessionCookieConfig()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$StaticContext.getSessionCookieConfig()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.handler.ContextHandler$Context.addFilter(java.lang.String,java.lang.Class<? extends javax.servlet.Filter>)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$StaticContext.addFilter(java.lang.String,java.lang.Class<? extends jakarta.servlet.Filter>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.handler.ContextHandler$Context.addFilter(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$StaticContext.addFilter(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.handler.ContextHandler$Context.addServlet(java.lang.String,java.lang.Class<? extends javax.servlet.Servlet>)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$StaticContext.addServlet(java.lang.String,java.lang.Class<? extends jakarta.servlet.Servlet>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.handler.ContextHandler$Context.addServlet(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$StaticContext.addServlet(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.handler.ContextHandler$Context.getContext(java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$Context.getContext(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.handler.ContextHandler$Context.getFilterRegistration(java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$StaticContext.getFilterRegistration(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.handler.ContextHandler$Context.getJspConfigDescriptor()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$Context.getJspConfigDescriptor()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.handler.ContextHandler$Context.getNamedDispatcher(java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$StaticContext.getNamedDispatcher(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.handler.ContextHandler$Context.getRequestDispatcher(java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$Context.getRequestDispatcher(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.handler.ContextHandler$Context.getServlet(java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$StaticContext.getServlet(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.handler.ContextHandler$Context.getServletRegistration(java.lang.String)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$StaticContext.getServletRegistration(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.handler.ContextHandler$Context.getSessionCookieConfig()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler$StaticContext.getSessionCookieConfig()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.handler.ContextHandler$Context`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.handler.ContextHandler$Context`

## org.eclipse.jetty.server.handler.ContextHandlerCollection

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandler.dumpThis(java.lang.Appendable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.dump(java.lang.Appendable,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.expandHandler(org.eclipse.jetty.server.Handler,java.lang.Object,java.lang.Class<org.eclipse.jetty.server.Handler>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandlerCollection.addContext(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandlerCollection.getContextClass()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandlerCollection.handle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandlerCollection.setContextClass(java.lang.Class)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerCollection.expandChildren(java.lang.Object,java.lang.Class)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerCollection.isParallelStart()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerCollection.setParallelStart(boolean)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.handler.ContextHandlerCollection`

## org.eclipse.jetty.server.handler.DebugHandler

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandler.dumpThis(java.lang.Appendable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.dump(java.lang.Appendable,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.expandHandler(org.eclipse.jetty.server.Handler,java.lang.Object,java.lang.Class<org.eclipse.jetty.server.Handler>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.DebugHandler.handle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerWrapper.expandChildren(java.lang.Object,java.lang.Class)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerWrapper.getNestedHandlerByClass(java.lang.Class<H>)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.handler.DebugHandler`

## org.eclipse.jetty.server.handler.DefaultHandler

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandler.dumpThis(java.lang.Appendable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.DefaultHandler.handle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.handler.DefaultHandler`

## org.eclipse.jetty.server.handler.ErrorHandler

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandler.dumpThis(java.lang.Appendable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ErrorHandler.handle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ErrorHandler.handleErrorPage(javax.servlet.http.HttpServletRequest,java.io.Writer,int,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ErrorHandler.writeErrorPage(javax.servlet.http.HttpServletRequest,java.io.Writer,int,java.lang.String,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ErrorHandler.writeErrorPageBody(javax.servlet.http.HttpServletRequest,java.io.Writer,int,java.lang.String,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ErrorHandler.writeErrorPageHead(javax.servlet.http.HttpServletRequest,java.io.Writer,int,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ErrorHandler.writeErrorPageMessage(javax.servlet.http.HttpServletRequest,java.io.Writer,int,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ErrorHandler.writeErrorPageStacks(javax.servlet.http.HttpServletRequest,java.io.Writer)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.handler.ErrorHandler`

## org.eclipse.jetty.server.handler.GzipHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.handler.GzipHandler`

## org.eclipse.jetty.server.handler.HandlerCollection

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.eclipse.jetty.server.handler.HandlerCollection.<init>(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandler.dumpThis(java.lang.Appendable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.dump(java.lang.Appendable,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.expandHandler(org.eclipse.jetty.server.Handler,java.lang.Object,java.lang.Class<org.eclipse.jetty.server.Handler>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerCollection.expandChildren(java.lang.Object,java.lang.Class)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerCollection.handle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerCollection.isParallelStart()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerCollection.setParallelStart(boolean)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.handler.HandlerCollection`

## org.eclipse.jetty.server.handler.HandlerList

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandler.dumpThis(java.lang.Appendable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.dump(java.lang.Appendable,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.expandHandler(org.eclipse.jetty.server.Handler,java.lang.Object,java.lang.Class<org.eclipse.jetty.server.Handler>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerCollection.expandChildren(java.lang.Object,java.lang.Class)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerCollection.isParallelStart()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerCollection.setParallelStart(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerList.handle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.handler.HandlerList`

## org.eclipse.jetty.server.handler.HandlerWrapper

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandler.dumpThis(java.lang.Appendable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.dump(java.lang.Appendable,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.expandHandler(org.eclipse.jetty.server.Handler,java.lang.Object,java.lang.Class<org.eclipse.jetty.server.Handler>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerWrapper.expandChildren(java.lang.Object,java.lang.Class)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerWrapper.getNestedHandlerByClass(java.lang.Class<H>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerWrapper.handle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.handler.HandlerWrapper`

## org.eclipse.jetty.server.handler.HotSwapHandler

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandler.dumpThis(java.lang.Appendable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.dump(java.lang.Appendable,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.expandHandler(org.eclipse.jetty.server.Handler,java.lang.Object,java.lang.Class<org.eclipse.jetty.server.Handler>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HotSwapHandler.expandChildren(java.lang.Object,java.lang.Class)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HotSwapHandler.handle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.handler.HotSwapHandler`

## org.eclipse.jetty.server.handler.IPAccessHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.handler.IPAccessHandler`

## org.eclipse.jetty.server.handler.MovedContextHandler

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandler.dumpThis(java.lang.Appendable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.expandHandler(org.eclipse.jetty.server.Handler,java.lang.Object,java.lang.Class<org.eclipse.jetty.server.Handler>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.callContextDestroyed(javax.servlet.ServletContextListener,javax.servlet.ServletContextEvent)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.callContextInitialized(javax.servlet.ServletContextListener,javax.servlet.ServletContextEvent)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.checkContext(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.checkManagedAttribute(java.lang.String,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.doHandle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.doScope(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.getConnectorNames()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.getEventListeners()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.isAliases()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.restrictEventListener(java.util.EventListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.setAliases(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.setConnectorNames(java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.setEventListeners(java.util.EventListener[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.setLogger(org.eclipse.jetty.util.log.Logger)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.setManagedAttribute(java.lang.String,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ContextHandler.setShutdown(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerWrapper.expandChildren(java.lang.Object,java.lang.Class)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerWrapper.getNestedHandlerByClass(java.lang.Class<H>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ScopedHandler.handle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ScopedHandler.never()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ScopedHandler.nextHandle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ScopedHandler.nextScope(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler.addEventListener(java.util.EventListener)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler.addEventListener(java.util.EventListener)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler.getAttributeNames()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler.getAttributeNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler.getInitParameterNames()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler.getInitParameterNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.handler.ContextHandler.getLogger()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler.getLogger()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.handler.ContextHandler.addEventListener(java.util.EventListener)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler.addEventListener(java.util.EventListener)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.handler.ContextHandler.getLogger()`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.handler.ContextHandler.getLogger()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.handler.MovedContextHandler`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.handler.MovedContextHandler`

## org.eclipse.jetty.server.handler.ProxyHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.handler.ProxyHandler`

## org.eclipse.jetty.server.handler.RequestLogHandler

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandler.dumpThis(java.lang.Appendable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.dump(java.lang.Appendable,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.expandHandler(org.eclipse.jetty.server.Handler,java.lang.Object,java.lang.Class<org.eclipse.jetty.server.Handler>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerWrapper.expandChildren(java.lang.Object,java.lang.Class)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerWrapper.getNestedHandlerByClass(java.lang.Class<H>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.RequestLogHandler.handle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.handler.RequestLogHandler`

## org.eclipse.jetty.server.handler.ResourceHandler

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.eclipse.jetty.server.handler.ResourceHandler.getResource(java.lang.String)`
+ NOW THROWS: `org.eclipse.jetty.server.handler.ResourceHandler.getResource(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandler.dumpThis(java.lang.Appendable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.dump(java.lang.Appendable,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.expandHandler(org.eclipse.jetty.server.Handler,java.lang.Object,java.lang.Class<org.eclipse.jetty.server.Handler>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerWrapper.expandChildren(java.lang.Object,java.lang.Class)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerWrapper.getNestedHandlerByClass(java.lang.Class<H>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ResourceHandler.doDirectory(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse,org.eclipse.jetty.util.resource.Resource)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ResourceHandler.doResponseHeaders(javax.servlet.http.HttpServletResponse,org.eclipse.jetty.util.resource.Resource,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ResourceHandler.getResource(javax.servlet.http.HttpServletRequest)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ResourceHandler.getWelcome(org.eclipse.jetty.util.resource.Resource)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ResourceHandler.handle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ResourceHandler.isAliases()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ResourceHandler.setAliases(boolean)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.handler.ResourceHandler`

## org.eclipse.jetty.server.handler.ScopedHandler

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandler.dumpThis(java.lang.Appendable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.dump(java.lang.Appendable,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.expandHandler(org.eclipse.jetty.server.Handler,java.lang.Object,java.lang.Class<org.eclipse.jetty.server.Handler>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerWrapper.expandChildren(java.lang.Object,java.lang.Class)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerWrapper.getNestedHandlerByClass(java.lang.Class<H>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ScopedHandler.doHandle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ScopedHandler.doScope(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ScopedHandler.handle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ScopedHandler.never()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ScopedHandler.nextHandle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ScopedHandler.nextScope(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.eclipse.jetty.server.handler.ScopedHandler`
+ MUST NOW IMPLEMENT: `org.eclipse.jetty.server.handler.ScopedHandler.doHandle(java.lang.String,org.eclipse.jetty.server.Request,jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.handler.ScopedHandler`

## org.eclipse.jetty.server.handler.ShutdownHandler

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.eclipse.jetty.server.handler.ShutdownHandler.<init>(org.eclipse.jetty.server.Server,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandler.dumpThis(java.lang.Appendable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ShutdownHandler.getRemoteAddr(javax.servlet.http.HttpServletRequest)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ShutdownHandler.handle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.handler.ShutdownHandler`

## org.eclipse.jetty.server.handler.StatisticsHandler

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandler.dumpThis(java.lang.Appendable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.dump(java.lang.Appendable,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.expandHandler(org.eclipse.jetty.server.Handler,java.lang.Object,java.lang.Class<org.eclipse.jetty.server.Handler>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerWrapper.expandChildren(java.lang.Object,java.lang.Class)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerWrapper.getNestedHandlerByClass(java.lang.Class<H>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.StatisticsHandler.getResumes()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.StatisticsHandler.getSuspends()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.StatisticsHandler.getSuspendsActive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.StatisticsHandler.getSuspendsActiveMax()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.StatisticsHandler.handle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.handler.StatisticsHandler`

## org.eclipse.jetty.server.handler.jmx.AbstractHandlerMBean

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.handler.jmx.AbstractHandlerMBean`

## org.eclipse.jetty.server.handler.jmx.ContextHandlerMBean

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.handler.jmx.ContextHandlerMBean`

## org.eclipse.jetty.server.jmx.ServerMBean

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.jmx.ServerMBean`

## org.eclipse.jetty.server.nio.AbstractNIOConnector

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.nio.AbstractNIOConnector`

## org.eclipse.jetty.server.nio.BlockingChannelConnector

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.nio.BlockingChannelConnector`

## org.eclipse.jetty.server.nio.InheritedChannelConnector

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.nio.InheritedChannelConnector`

## org.eclipse.jetty.server.nio.NIOConnector

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.nio.NIOConnector`

## org.eclipse.jetty.server.nio.NetworkTrafficSelectChannelConnector

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.nio.NetworkTrafficSelectChannelConnector`

## org.eclipse.jetty.server.nio.SelectChannelConnector

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.nio.SelectChannelConnector`

## org.eclipse.jetty.server.session.AbstractSession

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.session.AbstractSession`

## org.eclipse.jetty.server.session.AbstractSessionIdManager

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.session.AbstractSessionIdManager`

## org.eclipse.jetty.server.session.AbstractSessionManager

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.session.AbstractSessionManager`

## org.eclipse.jetty.server.session.AbstractSessionManager$SessionIf

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.session.AbstractSessionManager$SessionIf`

## org.eclipse.jetty.server.session.HashSessionIdManager

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.session.HashSessionIdManager`

## org.eclipse.jetty.server.session.HashSessionManager

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.session.HashSessionManager`

## org.eclipse.jetty.server.session.HashSessionManager$ClassLoadingObjectInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.session.HashSessionManager$ClassLoadingObjectInputStream`

## org.eclipse.jetty.server.session.HashedSession

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.session.HashedSession`

## org.eclipse.jetty.server.session.JDBCSessionIdManager

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.session.JDBCSessionIdManager`

## org.eclipse.jetty.server.session.JDBCSessionIdManager$DatabaseAdaptor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.session.JDBCSessionIdManager$DatabaseAdaptor`

## org.eclipse.jetty.server.session.JDBCSessionManager

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.session.JDBCSessionManager`

## org.eclipse.jetty.server.session.JDBCSessionManager$ClassLoadingObjectInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.session.JDBCSessionManager$ClassLoadingObjectInputStream`

## org.eclipse.jetty.server.session.JDBCSessionManager$Session

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.session.JDBCSessionManager$Session`

## org.eclipse.jetty.server.session.SessionHandler

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.eclipse.jetty.server.session.SessionHandler.<init>(org.eclipse.jetty.server.SessionManager)`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.eclipse.jetty.server.session.SessionHandler.DEFAULT_TRACKING`
+ NEW FIELD: `org.eclipse.jetty.server.session.SessionHandler.DEFAULT_TRACKING`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandler.dumpThis(java.lang.Appendable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.dump(java.lang.Appendable,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.AbstractHandlerContainer.expandHandler(org.eclipse.jetty.server.Handler,java.lang.Object,java.lang.Class<org.eclipse.jetty.server.Handler>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerWrapper.expandChildren(java.lang.Object,java.lang.Class)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.HandlerWrapper.getNestedHandlerByClass(java.lang.Class<H>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ScopedHandler.handle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ScopedHandler.never()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ScopedHandler.nextHandle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.handler.ScopedHandler.nextScope(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.session.SessionHandler.checkRequestedSessionId(org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.session.SessionHandler.clearEventListeners()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.session.SessionHandler.doHandle(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.session.SessionHandler.doScope(java.lang.String,org.eclipse.jetty.server.Request,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.session.SessionHandler.getSessionManager()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.eclipse.jetty.server.session.SessionHandler.setSessionManager(org.eclipse.jetty.server.SessionManager)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.eclipse.jetty.server.session.SessionHandler.addEventListener(java.util.EventListener)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.session.SessionHandler.addEventListener(java.util.EventListener)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.eclipse.jetty.server.session.SessionHandler.addEventListener(java.util.EventListener)`
+ NEW RETURN TYPE: `org.eclipse.jetty.server.session.SessionHandler.addEventListener(java.util.EventListener)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.eclipse.jetty.server.session.SessionHandler`

## org.eclipse.jetty.server.session.jmx.AbstractSessionManagerMBean

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.session.jmx.AbstractSessionManagerMBean`

## org.eclipse.jetty.server.ssl.ServletSSL

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.ssl.ServletSSL`

## org.eclipse.jetty.server.ssl.SslCertificates

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.ssl.SslCertificates`

## org.eclipse.jetty.server.ssl.SslConnector

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.ssl.SslConnector`

## org.eclipse.jetty.server.ssl.SslSelectChannelConnector

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.ssl.SslSelectChannelConnector`

## org.eclipse.jetty.server.ssl.SslSocketConnector

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.ssl.SslSocketConnector`

## org.eclipse.jetty.server.ssl.SslSocketConnector$SslConnectorEndPoint

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.eclipse.jetty.server.ssl.SslSocketConnector$SslConnectorEndPoint`

