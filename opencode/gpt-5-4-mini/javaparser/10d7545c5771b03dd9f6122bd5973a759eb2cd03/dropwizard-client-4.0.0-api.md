# API Specification: io.dropwizard:dropwizard-client 4.0.0

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public class `io.dropwizard.client.ConfiguredCloseableHttpClient`

**Methods:**
- `public org.apache.hc.client5.http.impl.classic.CloseableHttpClient getClient()`
- `public org.apache.hc.client5.http.config.RequestConfig getDefaultRequestConfig()`

---

## public class `io.dropwizard.client.DropwizardApacheConnector`
implements `org.glassfish.jersey.client.spi.Connector`  

**Constructors:**
- `public DropwizardApacheConnector(org.apache.hc.client5.http.impl.classic.CloseableHttpClient p0, org.apache.hc.client5.http.config.RequestConfig p1, boolean p2)`

**Methods:**
- `public org.glassfish.jersey.client.ClientResponse apply(org.glassfish.jersey.client.ClientRequest p0)`
- `public java.util.concurrent.Future apply(org.glassfish.jersey.client.ClientRequest p0, org.glassfish.jersey.client.spi.AsyncConnectorCallback p1)`
- `public void close()`
- `protected org.apache.hc.core5.http.HttpEntity getHttpEntity(org.glassfish.jersey.client.ClientRequest p0)`
- `public java.lang.String getName()`

---

## public class `io.dropwizard.client.DropwizardSSLConnectionSocketFactory`

**Constructors:**
- `public DropwizardSSLConnectionSocketFactory(io.dropwizard.client.ssl.TlsConfiguration p0)`
- `public DropwizardSSLConnectionSocketFactory(io.dropwizard.client.ssl.TlsConfiguration p0, javax.net.ssl.HostnameVerifier p1)`

**Methods:**
- `public org.apache.hc.client5.http.ssl.SSLConnectionSocketFactory getSocketFactory() throws org.apache.hc.core5.ssl.SSLInitializationException`

---

## public class `io.dropwizard.client.HttpClientBuilder`

**Constructors:**
- `public HttpClientBuilder(com.codahale.metrics.MetricRegistry p0)`
- `public HttpClientBuilder(io.dropwizard.core.setup.Environment p0)`

**Methods:**
- `public org.apache.hc.client5.http.impl.classic.CloseableHttpClient build(java.lang.String p0)`
- `protected com.codahale.metrics.httpclient5.InstrumentedHttpClientConnectionManager configureConnectionManager(com.codahale.metrics.httpclient5.InstrumentedHttpClientConnectionManager p0)`
- `protected org.apache.hc.client5.http.auth.Credentials configureCredentials(io.dropwizard.client.proxy.AuthConfiguration p0)`
- `protected org.apache.hc.client5.http.impl.classic.HttpClientBuilder createBuilder()`
- `protected io.dropwizard.client.ConfiguredCloseableHttpClient createClient(org.apache.hc.client5.http.impl.classic.HttpClientBuilder p0, com.codahale.metrics.httpclient5.InstrumentedHttpClientConnectionManager p1, java.lang.String p2)`
- `protected com.codahale.metrics.httpclient5.InstrumentedHttpClientConnectionManager createConnectionManager(org.apache.hc.core5.http.config.Registry p0, java.lang.String p1)`
- `protected org.apache.hc.core5.http.impl.io.HttpRequestExecutor createRequestExecutor(java.lang.String p0)`
- `protected java.lang.String createUserAgent(java.lang.String p0)`
- `protected org.apache.hc.client5.http.impl.classic.HttpClientBuilder customizeBuilder(org.apache.hc.client5.http.impl.classic.HttpClientBuilder p0)`
- `public io.dropwizard.client.HttpClientBuilder disableContentCompression(boolean p0)`
- `public io.dropwizard.client.HttpClientBuilder name(java.lang.String p0)`
- `public io.dropwizard.client.HttpClientBuilder using(com.codahale.metrics.httpclient5.HttpClientMetricNameStrategy p0)`
- `public io.dropwizard.client.HttpClientBuilder using(io.dropwizard.client.HttpClientConfiguration p0)`
- `public io.dropwizard.client.HttpClientBuilder using(java.util.List p0)`
- `public io.dropwizard.client.HttpClientBuilder using(javax.net.ssl.HostnameVerifier p0)`
- `public io.dropwizard.client.HttpClientBuilder using(org.apache.hc.client5.http.DnsResolver p0)`
- `public io.dropwizard.client.HttpClientBuilder using(org.apache.hc.client5.http.HttpRequestRetryStrategy p0)`
- `public io.dropwizard.client.HttpClientBuilder using(org.apache.hc.client5.http.auth.CredentialsStore p0)`
- `public io.dropwizard.client.HttpClientBuilder using(org.apache.hc.client5.http.protocol.RedirectStrategy p0)`
- `public io.dropwizard.client.HttpClientBuilder using(org.apache.hc.client5.http.routing.HttpRoutePlanner p0)`
- `public io.dropwizard.client.HttpClientBuilder using(org.apache.hc.core5.http.config.Registry p0)`
- `public io.dropwizard.client.HttpClientBuilder using(org.apache.hc.core5.http.protocol.HttpProcessor p0)`

---

## public class `io.dropwizard.client.HttpClientConfiguration`

**Constructors:**
- `public HttpClientConfiguration()`

**Methods:**
- `public io.dropwizard.util.Duration getConnectionRequestTimeout()`
- `public io.dropwizard.util.Duration getConnectionTimeout()`
- `public io.dropwizard.util.Duration getKeepAlive()`
- `public int getMaxConnections()`
- `public int getMaxConnectionsPerRoute()`
- `public io.dropwizard.client.proxy.ProxyConfiguration getProxyConfiguration()`
- `public int getRetries()`
- `public io.dropwizard.util.Duration getTimeToLive()`
- `public io.dropwizard.util.Duration getTimeout()`
- `public io.dropwizard.client.ssl.TlsConfiguration getTlsConfiguration()`
- `public java.util.Optional getUserAgent()`
- `public io.dropwizard.util.Duration getValidateAfterInactivityPeriod()`
- `public boolean isCookiesEnabled()`
- `public void setConnectionRequestTimeout(io.dropwizard.util.Duration p0)`
- `public void setConnectionTimeout(io.dropwizard.util.Duration p0)`
- `public void setCookiesEnabled(boolean p0)`
- `public void setKeepAlive(io.dropwizard.util.Duration p0)`
- `public void setMaxConnections(int p0)`
- `public void setMaxConnectionsPerRoute(int p0)`
- `public void setProxyConfiguration(io.dropwizard.client.proxy.ProxyConfiguration p0)`
- `public void setRetries(int p0)`
- `public void setTimeToLive(io.dropwizard.util.Duration p0)`
- `public void setTimeout(io.dropwizard.util.Duration p0)`
- `public void setTlsConfiguration(io.dropwizard.client.ssl.TlsConfiguration p0)`
- `public void setUserAgent(java.util.Optional p0)`
- `public void setValidateAfterInactivityPeriod(io.dropwizard.util.Duration p0)`

---

## public class `io.dropwizard.client.JerseyClientBuilder`

**Constructors:**
- `public JerseyClientBuilder(com.codahale.metrics.MetricRegistry p0)`
- `public JerseyClientBuilder(io.dropwizard.core.setup.Environment p0)`

**Methods:**
- `public jakarta.ws.rs.client.Client build(java.lang.String p0)`
- `public <RX extends jakarta.ws.rs.client.RxInvokerProvider<? extends java.lang.Object>> jakarta.ws.rs.client.Client buildRx(java.lang.String p0, java.lang.Class p1)`
- `protected io.dropwizard.client.DropwizardApacheConnector createDropwizardApacheConnector(io.dropwizard.client.ConfiguredCloseableHttpClient p0)`
- `public io.dropwizard.client.JerseyClientBuilder name(java.lang.String p0)`
- `public void setApacheHttpClientBuilder(io.dropwizard.client.HttpClientBuilder p0)`
- `public io.dropwizard.client.JerseyClientBuilder using(com.codahale.metrics.httpclient5.HttpClientMetricNameStrategy p0)`
- `public io.dropwizard.client.JerseyClientBuilder using(com.fasterxml.jackson.databind.ObjectMapper p0)`
- `public io.dropwizard.client.JerseyClientBuilder using(io.dropwizard.client.JerseyClientConfiguration p0)`
- `public io.dropwizard.client.JerseyClientBuilder using(io.dropwizard.core.setup.Environment p0)`
- `public io.dropwizard.client.JerseyClientBuilder using(jakarta.validation.Validator p0)`
- `public io.dropwizard.client.JerseyClientBuilder using(java.util.concurrent.ExecutorService p0)`
- `public io.dropwizard.client.JerseyClientBuilder using(java.util.concurrent.ExecutorService p0, com.fasterxml.jackson.databind.ObjectMapper p1)`
- `public io.dropwizard.client.JerseyClientBuilder using(javax.net.ssl.HostnameVerifier p0)`
- `public io.dropwizard.client.JerseyClientBuilder using(org.apache.hc.client5.http.DnsResolver p0)`
- `public io.dropwizard.client.JerseyClientBuilder using(org.apache.hc.client5.http.HttpRequestRetryStrategy p0)`
- `public io.dropwizard.client.JerseyClientBuilder using(org.apache.hc.client5.http.auth.CredentialsStore p0)`
- `public io.dropwizard.client.JerseyClientBuilder using(org.apache.hc.client5.http.routing.HttpRoutePlanner p0)`
- `public io.dropwizard.client.JerseyClientBuilder using(org.apache.hc.core5.http.config.Registry p0)`
- `public io.dropwizard.client.JerseyClientBuilder using(org.glassfish.jersey.client.spi.ConnectorProvider p0)`
- `public io.dropwizard.client.JerseyClientBuilder withProperty(java.lang.String p0, java.lang.Object p1)`
- `public io.dropwizard.client.JerseyClientBuilder withProvider(java.lang.Class p0)`
- `public io.dropwizard.client.JerseyClientBuilder withProvider(java.lang.Object p0)`

---

## public class `io.dropwizard.client.JerseyClientConfiguration`
extends `io.dropwizard.client.HttpClientConfiguration`  

**Constructors:**
- `public JerseyClientConfiguration()`

**Methods:**
- `public int getMaxThreads()`
- `public int getMinThreads()`
- `public int getWorkQueueSize()`
- `public boolean isChunkedEncodingEnabled()`
- `public boolean isCompressionConfigurationValid()`
- `public boolean isGzipEnabled()`
- `public boolean isGzipEnabledForRequests()`
- `public boolean isThreadPoolSizedCorrectly()`
- `public void setChunkedEncodingEnabled(boolean p0)`
- `public void setGzipEnabled(boolean p0)`
- `public void setGzipEnabledForRequests(boolean p0)`
- `public void setMaxThreads(int p0)`
- `public void setMinThreads(int p0)`
- `public void setWorkQueueSize(int p0)`

---

## public class `io.dropwizard.client.JerseyIgnoreRequestUserAgentHeaderFilter`
annotations: @jakarta.ws.rs.ext.Provider  
implements `jakarta.ws.rs.client.ClientRequestFilter`  

**Constructors:**
- `public JerseyIgnoreRequestUserAgentHeaderFilter()`

**Methods:**
- `public void filter(jakarta.ws.rs.client.ClientRequestContext p0) throws java.io.IOException`

---

## public class `io.dropwizard.client.proxy.AuthConfiguration`

**Constructors:**
- `public AuthConfiguration()`
- `public AuthConfiguration(java.lang.String p0, java.lang.String p1)`
- `public AuthConfiguration(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6)`

**Fields:**
- `public final static java.lang.String BASIC_AUTH_SCHEME`
- `public final static java.lang.String NTLM_AUTH_SCHEME`
- `public final static java.lang.String NT_CREDS`
- `public final static java.lang.String USERNAME_PASSWORD_CREDS`

**Methods:**
- `public java.lang.String getAuthScheme()`
- `public java.lang.String getCredentialType()`
- `public java.lang.String getDomain()`
- `public java.lang.String getHostname()`
- `public java.lang.String getPassword()`
- `public java.lang.String getRealm()`
- `public java.lang.String getUsername()`
- `public void setAuthScheme(java.lang.String p0)`
- `public void setCredentialType(java.lang.String p0)`
- `public void setDomain(java.lang.String p0)`
- `public void setHostname(java.lang.String p0)`
- `public void setPassword(java.lang.String p0)`
- `public void setRealm(java.lang.String p0)`
- `public void setUsername(java.lang.String p0)`

---

## public class `io.dropwizard.client.proxy.NonProxyListProxyRoutePlanner`
extends `org.apache.hc.client5.http.impl.routing.DefaultProxyRoutePlanner`  

**Constructors:**
- `public NonProxyListProxyRoutePlanner(org.apache.hc.core5.http.HttpHost p0, java.util.List p1)`
- `public NonProxyListProxyRoutePlanner(org.apache.hc.core5.http.HttpHost p0, org.apache.hc.client5.http.SchemePortResolver p1, java.util.List p2)`

**Methods:**
- `protected org.apache.hc.core5.http.HttpHost determineProxy(org.apache.hc.core5.http.HttpHost p0, org.apache.hc.core5.http.protocol.HttpContext p1) throws org.apache.hc.core5.http.HttpException`
- `protected java.util.List getNonProxyHostPatterns()`

---

## public class `io.dropwizard.client.proxy.ProxyConfiguration`

**Constructors:**
- `public ProxyConfiguration()`
- `public ProxyConfiguration(java.lang.String p0)`
- `public ProxyConfiguration(java.lang.String p0, int p1)`
- `public ProxyConfiguration(java.lang.String p0, int p1, java.lang.String p2, io.dropwizard.client.proxy.AuthConfiguration p3)`

**Methods:**
- `public io.dropwizard.client.proxy.AuthConfiguration getAuth()`
- `public java.lang.String getHost()`
- `public java.util.List getNonProxyHosts()`
- `public java.lang.Integer getPort()`
- `public java.lang.String getScheme()`
- `public void setAuth(io.dropwizard.client.proxy.AuthConfiguration p0)`
- `public void setHost(java.lang.String p0)`
- `public void setNonProxyHosts(java.util.List p0)`
- `public void setPort(java.lang.Integer p0)`
- `public void setScheme(java.lang.String p0)`

---

## public class `io.dropwizard.client.ssl.TlsConfiguration`

**Constructors:**
- `public TlsConfiguration()`

**Methods:**
- `public java.lang.String getCertAlias()`
- `public java.lang.String getKeyStorePassword()`
- `public java.io.File getKeyStorePath()`
- `public java.lang.String getKeyStoreProvider()`
- `public java.lang.String getKeyStoreType()`
- `public java.lang.String getProtocol()`
- `public java.lang.String getProvider()`
- `public java.util.List getSupportedCiphers()`
- `public java.util.List getSupportedProtocols()`
- `public java.lang.String getTrustStorePassword()`
- `public java.io.File getTrustStorePath()`
- `public java.lang.String getTrustStoreProvider()`
- `public java.lang.String getTrustStoreType()`
- `public boolean isTrustSelfSignedCertificates()`
- `public boolean isValidKeyStorePassword()`
- `public boolean isValidTrustStorePassword()`
- `public boolean isVerifyHostname()`
- `public void setCertAlias(java.lang.String p0)`
- `public void setKeyStorePassword(java.lang.String p0)`
- `public void setKeyStorePath(java.io.File p0)`
- `public void setKeyStoreProvider(java.lang.String p0)`
- `public void setKeyStoreType(java.lang.String p0)`
- `public void setProtocol(java.lang.String p0)`
- `public void setProvider(java.lang.String p0)`
- `public void setSupportedCiphers(java.util.List p0)`
- `public void setSupportedProtocols(java.util.List p0)`
- `public void setTrustSelfSignedCertificates(boolean p0)`
- `public void setTrustStorePassword(java.lang.String p0)`
- `public void setTrustStorePath(java.io.File p0)`
- `public void setTrustStoreProvider(java.lang.String p0)`
- `public void setTrustStoreType(java.lang.String p0)`
- `public void setVerifyHostname(boolean p0)`

---

