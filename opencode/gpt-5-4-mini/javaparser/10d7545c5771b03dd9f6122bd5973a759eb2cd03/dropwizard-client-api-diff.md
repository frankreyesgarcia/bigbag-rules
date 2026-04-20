# Breaking Changes: io.dropwizard:dropwizard-client 2.1.5 → 4.0.0
Total: 57 (binary-breaking: 45, source-breaking: 47)

## io.dropwizard.client.ConfiguredCloseableHttpClient

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `io.dropwizard.client.ConfiguredCloseableHttpClient.getClient()`
+ NEW RETURN TYPE: `io.dropwizard.client.ConfiguredCloseableHttpClient.getClient()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `io.dropwizard.client.ConfiguredCloseableHttpClient.getDefaultRequestConfig()`
+ NEW RETURN TYPE: `io.dropwizard.client.ConfiguredCloseableHttpClient.getDefaultRequestConfig()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `io.dropwizard.client.ConfiguredCloseableHttpClient.getClient()`
+ NEW RETURN TYPE: `io.dropwizard.client.ConfiguredCloseableHttpClient.getClient()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `io.dropwizard.client.ConfiguredCloseableHttpClient.getDefaultRequestConfig()`
+ NEW RETURN TYPE: `io.dropwizard.client.ConfiguredCloseableHttpClient.getDefaultRequestConfig()`

## io.dropwizard.client.DropwizardApacheConnector

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `io.dropwizard.client.DropwizardApacheConnector.<init>(org.apache.http.impl.client.CloseableHttpClient,org.apache.http.client.config.RequestConfig,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `io.dropwizard.client.DropwizardApacheConnector.getHttpEntity(org.glassfish.jersey.client.ClientRequest)`
+ NEW RETURN TYPE: `io.dropwizard.client.DropwizardApacheConnector.getHttpEntity(org.glassfish.jersey.client.ClientRequest)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `io.dropwizard.client.DropwizardApacheConnector.getHttpEntity(org.glassfish.jersey.client.ClientRequest)`
+ NEW RETURN TYPE: `io.dropwizard.client.DropwizardApacheConnector.getHttpEntity(org.glassfish.jersey.client.ClientRequest)`

## io.dropwizard.client.DropwizardSSLConnectionSocketFactory

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `io.dropwizard.client.DropwizardSSLConnectionSocketFactory.getSocketFactory()`
+ NEW RETURN TYPE: `io.dropwizard.client.DropwizardSSLConnectionSocketFactory.getSocketFactory()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `io.dropwizard.client.DropwizardSSLConnectionSocketFactory.getSocketFactory()`
+ NEW RETURN TYPE: `io.dropwizard.client.DropwizardSSLConnectionSocketFactory.getSocketFactory()`

## io.dropwizard.client.HttpClientBuilder

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `io.dropwizard.client.HttpClientBuilder.<init>(io.dropwizard.setup.Environment)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `io.dropwizard.client.HttpClientBuilder.using(java.util.List<? extends org.apache.http.Header>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.HttpClientBuilder.configureConnectionManager(com.codahale.metrics.httpclient.InstrumentedHttpClientConnectionManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.HttpClientBuilder.createClient(org.apache.http.impl.client.HttpClientBuilder,com.codahale.metrics.httpclient.InstrumentedHttpClientConnectionManager,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.HttpClientBuilder.createConnectionManager(org.apache.http.config.Registry<org.apache.http.conn.socket.ConnectionSocketFactory>,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.HttpClientBuilder.customizeBuilder(org.apache.http.impl.client.HttpClientBuilder)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.HttpClientBuilder.using(com.codahale.metrics.httpclient.HttpClientMetricNameStrategy)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.HttpClientBuilder.using(org.apache.http.client.CredentialsProvider)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.HttpClientBuilder.using(org.apache.http.client.HttpRequestRetryHandler)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.HttpClientBuilder.using(org.apache.http.client.RedirectStrategy)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.HttpClientBuilder.using(org.apache.http.client.ServiceUnavailableRetryStrategy)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.HttpClientBuilder.using(org.apache.http.config.Registry<org.apache.http.conn.socket.ConnectionSocketFactory>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.HttpClientBuilder.using(org.apache.http.conn.DnsResolver)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.HttpClientBuilder.using(org.apache.http.conn.routing.HttpRoutePlanner)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.HttpClientBuilder.using(org.apache.http.protocol.HttpProcessor)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `io.dropwizard.client.HttpClientBuilder.build(java.lang.String)`
+ NEW RETURN TYPE: `io.dropwizard.client.HttpClientBuilder.build(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `io.dropwizard.client.HttpClientBuilder.configureCredentials(io.dropwizard.client.proxy.AuthConfiguration)`
+ NEW RETURN TYPE: `io.dropwizard.client.HttpClientBuilder.configureCredentials(io.dropwizard.client.proxy.AuthConfiguration)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `io.dropwizard.client.HttpClientBuilder.createBuilder()`
+ NEW RETURN TYPE: `io.dropwizard.client.HttpClientBuilder.createBuilder()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `io.dropwizard.client.HttpClientBuilder.createRequestExecutor(java.lang.String)`
+ NEW RETURN TYPE: `io.dropwizard.client.HttpClientBuilder.createRequestExecutor(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `io.dropwizard.client.HttpClientBuilder.build(java.lang.String)`
+ NEW RETURN TYPE: `io.dropwizard.client.HttpClientBuilder.build(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `io.dropwizard.client.HttpClientBuilder.configureCredentials(io.dropwizard.client.proxy.AuthConfiguration)`
+ NEW RETURN TYPE: `io.dropwizard.client.HttpClientBuilder.configureCredentials(io.dropwizard.client.proxy.AuthConfiguration)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `io.dropwizard.client.HttpClientBuilder.createBuilder()`
+ NEW RETURN TYPE: `io.dropwizard.client.HttpClientBuilder.createBuilder()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `io.dropwizard.client.HttpClientBuilder.createRequestExecutor(java.lang.String)`
+ NEW RETURN TYPE: `io.dropwizard.client.HttpClientBuilder.createRequestExecutor(java.lang.String)`

## io.dropwizard.client.HttpClientConfiguration

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.HttpClientConfiguration.isNormalizeUriEnabled()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.HttpClientConfiguration.setNormalizeUriEnabled(boolean)`

## io.dropwizard.client.JerseyClientBuilder

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `io.dropwizard.client.JerseyClientBuilder.<init>(io.dropwizard.setup.Environment)`

### FORMAL_TYPE_PARAMETER_CHANGED [binary ✓ | source ✗]
- FORMAL TYPE PARAMETER CHANGED: `io.dropwizard.client.JerseyClientBuilder.buildRx(java.lang.String,java.lang.Class<RX>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.JerseyClientBuilder.using(com.codahale.metrics.httpclient.HttpClientMetricNameStrategy)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.JerseyClientBuilder.using(io.dropwizard.setup.Environment)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.JerseyClientBuilder.using(javax.validation.Validator)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.JerseyClientBuilder.using(org.apache.http.client.CredentialsProvider)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.JerseyClientBuilder.using(org.apache.http.client.HttpRequestRetryHandler)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.JerseyClientBuilder.using(org.apache.http.client.ServiceUnavailableRetryStrategy)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.JerseyClientBuilder.using(org.apache.http.config.Registry<org.apache.http.conn.socket.ConnectionSocketFactory>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.JerseyClientBuilder.using(org.apache.http.conn.DnsResolver)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.JerseyClientBuilder.using(org.apache.http.conn.routing.HttpRoutePlanner)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `io.dropwizard.client.JerseyClientBuilder.build(java.lang.String)`
+ NEW RETURN TYPE: `io.dropwizard.client.JerseyClientBuilder.build(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `io.dropwizard.client.JerseyClientBuilder.buildRx(java.lang.String,java.lang.Class<RX>)`
+ NEW RETURN TYPE: `io.dropwizard.client.JerseyClientBuilder.buildRx(java.lang.String,java.lang.Class<RX>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `io.dropwizard.client.JerseyClientBuilder.build(java.lang.String)`
+ NEW RETURN TYPE: `io.dropwizard.client.JerseyClientBuilder.build(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `io.dropwizard.client.JerseyClientBuilder.buildRx(java.lang.String,java.lang.Class<RX>)`
+ NEW RETURN TYPE: `io.dropwizard.client.JerseyClientBuilder.buildRx(java.lang.String,java.lang.Class<RX>)`

## io.dropwizard.client.JerseyClientConfiguration

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.HttpClientConfiguration.isNormalizeUriEnabled()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.HttpClientConfiguration.setNormalizeUriEnabled(boolean)`

## io.dropwizard.client.JerseyIgnoreRequestUserAgentHeaderFilter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.JerseyIgnoreRequestUserAgentHeaderFilter.filter(javax.ws.rs.client.ClientRequestContext)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `io.dropwizard.client.JerseyIgnoreRequestUserAgentHeaderFilter`

## io.dropwizard.client.proxy.NonProxyListProxyRoutePlanner

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `io.dropwizard.client.proxy.NonProxyListProxyRoutePlanner.<init>(org.apache.http.HttpHost,java.util.List<java.lang.String>)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `io.dropwizard.client.proxy.NonProxyListProxyRoutePlanner.<init>(org.apache.http.HttpHost,org.apache.http.conn.SchemePortResolver,java.util.List<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `io.dropwizard.client.proxy.NonProxyListProxyRoutePlanner.determineProxy(org.apache.http.HttpHost,org.apache.http.HttpRequest,org.apache.http.protocol.HttpContext)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `io.dropwizard.client.proxy.NonProxyListProxyRoutePlanner`

