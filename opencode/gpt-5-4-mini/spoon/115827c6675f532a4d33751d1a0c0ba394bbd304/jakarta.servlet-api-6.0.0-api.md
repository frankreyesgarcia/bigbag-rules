# API Specification: jakarta.servlet:jakarta.servlet-api 6.0.0

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public abstract interface `jakarta.servlet.AsyncContext`

**Fields:**
- `public final static java.lang.String ASYNC_CONTEXT_PATH`
- `public final static java.lang.String ASYNC_MAPPING`
- `public final static java.lang.String ASYNC_PATH_INFO`
- `public final static java.lang.String ASYNC_QUERY_STRING`
- `public final static java.lang.String ASYNC_REQUEST_URI`
- `public final static java.lang.String ASYNC_SERVLET_PATH`

**Methods:**
- `public abstract void addListener(jakarta.servlet.AsyncListener p0)`
- `public abstract void addListener(jakarta.servlet.AsyncListener p0, jakarta.servlet.ServletRequest p1, jakarta.servlet.ServletResponse p2)`
- `public abstract void complete()`
- `public abstract <T extends jakarta.servlet.AsyncListener> T createListener(java.lang.Class p0) throws jakarta.servlet.ServletException`
- `public abstract void dispatch()`
- `public abstract void dispatch(jakarta.servlet.ServletContext p0, java.lang.String p1)`
- `public abstract void dispatch(java.lang.String p0)`
- `public abstract jakarta.servlet.ServletRequest getRequest()`
- `public abstract jakarta.servlet.ServletResponse getResponse()`
- `public abstract long getTimeout()`
- `public abstract boolean hasOriginalRequestAndResponse()`
- `public abstract void setTimeout(long p0)`
- `public abstract void start(java.lang.Runnable p0)`

---

## public class `jakarta.servlet.AsyncEvent`

**Constructors:**
- `public AsyncEvent(jakarta.servlet.AsyncContext p0)`
- `public AsyncEvent(jakarta.servlet.AsyncContext p0, jakarta.servlet.ServletRequest p1, jakarta.servlet.ServletResponse p2)`
- `public AsyncEvent(jakarta.servlet.AsyncContext p0, jakarta.servlet.ServletRequest p1, jakarta.servlet.ServletResponse p2, java.lang.Throwable p3)`
- `public AsyncEvent(jakarta.servlet.AsyncContext p0, java.lang.Throwable p1)`

**Methods:**
- `public jakarta.servlet.AsyncContext getAsyncContext()`
- `public jakarta.servlet.ServletRequest getSuppliedRequest()`
- `public jakarta.servlet.ServletResponse getSuppliedResponse()`
- `public java.lang.Throwable getThrowable()`

---

## public abstract interface `jakarta.servlet.AsyncListener`
implements `java.util.EventListener`  

**Methods:**
- `public abstract void onComplete(jakarta.servlet.AsyncEvent p0) throws java.io.IOException`
- `public abstract void onError(jakarta.servlet.AsyncEvent p0) throws java.io.IOException`
- `public abstract void onStartAsync(jakarta.servlet.AsyncEvent p0) throws java.io.IOException`
- `public abstract void onTimeout(jakarta.servlet.AsyncEvent p0) throws java.io.IOException`

---

## public final enum `jakarta.servlet.DispatcherType`
extends `java.lang.Enum`  

**Fields:**
- `public final static jakarta.servlet.DispatcherType ASYNC`
- `public final static jakarta.servlet.DispatcherType ERROR`
- `public final static jakarta.servlet.DispatcherType FORWARD`
- `public final static jakarta.servlet.DispatcherType INCLUDE`
- `public final static jakarta.servlet.DispatcherType REQUEST`

---

## public abstract interface `jakarta.servlet.Filter`

**Methods:**
- `public default void destroy()`
- `public abstract void doFilter(jakarta.servlet.ServletRequest p0, jakarta.servlet.ServletResponse p1, jakarta.servlet.FilterChain p2) throws jakarta.servlet.ServletException, java.io.IOException`
- `public default void init(jakarta.servlet.FilterConfig p0) throws jakarta.servlet.ServletException`

---

## public abstract interface `jakarta.servlet.FilterChain`

**Methods:**
- `public abstract void doFilter(jakarta.servlet.ServletRequest p0, jakarta.servlet.ServletResponse p1) throws jakarta.servlet.ServletException, java.io.IOException`

---

## public abstract interface `jakarta.servlet.FilterConfig`

**Methods:**
- `public abstract java.lang.String getFilterName()`
- `public abstract java.lang.String getInitParameter(java.lang.String p0)`
- `public abstract java.util.Enumeration getInitParameterNames()`
- `public abstract jakarta.servlet.ServletContext getServletContext()`

---

## public abstract interface `jakarta.servlet.FilterRegistration`
implements `jakarta.servlet.Registration`  

**Methods:**
- `public abstract void addMappingForServletNames(java.util.EnumSet p0, boolean p1, java.lang.String... p2)`
- `public abstract void addMappingForUrlPatterns(java.util.EnumSet p0, boolean p1, java.lang.String... p2)`
- `public abstract java.util.Collection getServletNameMappings()`
- `public abstract java.util.Collection getUrlPatternMappings()`

---

## public abstract static interface `jakarta.servlet.FilterRegistration$Dynamic`
implements `jakarta.servlet.FilterRegistration`, `jakarta.servlet.Registration$Dynamic`  

---

## public abstract class `jakarta.servlet.GenericFilter`
implements `jakarta.servlet.FilterConfig`, `jakarta.servlet.Filter`, `java.io.Serializable`  

**Constructors:**
- `public GenericFilter()`

**Methods:**
- `public jakarta.servlet.FilterConfig getFilterConfig()`
- `public java.lang.String getFilterName()`
- `public java.lang.String getInitParameter(java.lang.String p0)`
- `public java.util.Enumeration getInitParameterNames()`
- `public jakarta.servlet.ServletContext getServletContext()`
- `public void init() throws jakarta.servlet.ServletException`
- `public void init(jakarta.servlet.FilterConfig p0) throws jakarta.servlet.ServletException`

---

## public abstract class `jakarta.servlet.GenericServlet`
implements `jakarta.servlet.ServletConfig`, `jakarta.servlet.Servlet`, `java.io.Serializable`  

**Constructors:**
- `public GenericServlet()`

**Methods:**
- `public void destroy()`
- `public java.lang.String getInitParameter(java.lang.String p0)`
- `public java.util.Enumeration getInitParameterNames()`
- `public jakarta.servlet.ServletConfig getServletConfig()`
- `public jakarta.servlet.ServletContext getServletContext()`
- `public java.lang.String getServletInfo()`
- `public java.lang.String getServletName()`
- `public void init() throws jakarta.servlet.ServletException`
- `public void init(jakarta.servlet.ServletConfig p0) throws jakarta.servlet.ServletException`
- `public void log(java.lang.String p0)`
- `public void log(java.lang.String p0, java.lang.Throwable p1)`
- `public abstract void service(jakarta.servlet.ServletRequest p0, jakarta.servlet.ServletResponse p1) throws jakarta.servlet.ServletException, java.io.IOException`

---

## public class `jakarta.servlet.HttpConstraintElement`

**Constructors:**
- `public HttpConstraintElement()`
- `public HttpConstraintElement(jakarta.servlet.annotation.ServletSecurity$EmptyRoleSemantic p0)`
- `public HttpConstraintElement(jakarta.servlet.annotation.ServletSecurity$EmptyRoleSemantic p0, jakarta.servlet.annotation.ServletSecurity$TransportGuarantee p1, java.lang.String... p2)`
- `public HttpConstraintElement(jakarta.servlet.annotation.ServletSecurity$TransportGuarantee p0, java.lang.String... p1)`

**Methods:**
- `public jakarta.servlet.annotation.ServletSecurity$EmptyRoleSemantic getEmptyRoleSemantic()`
- `public java.lang.String[] getRolesAllowed()`
- `public jakarta.servlet.annotation.ServletSecurity$TransportGuarantee getTransportGuarantee()`

---

## public class `jakarta.servlet.HttpMethodConstraintElement`
extends `jakarta.servlet.HttpConstraintElement`  

**Constructors:**
- `public HttpMethodConstraintElement(java.lang.String p0)`
- `public HttpMethodConstraintElement(java.lang.String p0, jakarta.servlet.HttpConstraintElement p1)`

**Methods:**
- `public java.lang.String getMethodName()`

---

## public class `jakarta.servlet.MultipartConfigElement`

**Constructors:**
- `public MultipartConfigElement(jakarta.servlet.annotation.MultipartConfig p0)`
- `public MultipartConfigElement(java.lang.String p0)`
- `public MultipartConfigElement(java.lang.String p0, long p1, long p2, int p3)`

**Methods:**
- `public int getFileSizeThreshold()`
- `public java.lang.String getLocation()`
- `public long getMaxFileSize()`
- `public long getMaxRequestSize()`

---

## public abstract interface `jakarta.servlet.ReadListener`
implements `java.util.EventListener`  

**Methods:**
- `public abstract void onAllDataRead() throws java.io.IOException`
- `public abstract void onDataAvailable() throws java.io.IOException`
- `public abstract void onError(java.lang.Throwable p0)`

---

## public abstract interface `jakarta.servlet.Registration`

**Methods:**
- `public abstract java.lang.String getClassName()`
- `public abstract java.lang.String getInitParameter(java.lang.String p0)`
- `public abstract java.util.Map getInitParameters()`
- `public abstract java.lang.String getName()`
- `public abstract boolean setInitParameter(java.lang.String p0, java.lang.String p1)`
- `public abstract java.util.Set setInitParameters(java.util.Map p0)`

---

## public abstract static interface `jakarta.servlet.Registration$Dynamic`
implements `jakarta.servlet.Registration`  

**Methods:**
- `public abstract void setAsyncSupported(boolean p0)`

---

## public abstract interface `jakarta.servlet.RequestDispatcher`

**Fields:**
- `public final static java.lang.String ERROR_EXCEPTION`
- `public final static java.lang.String ERROR_EXCEPTION_TYPE`
- `public final static java.lang.String ERROR_MESSAGE`
- `public final static java.lang.String ERROR_REQUEST_URI`
- `public final static java.lang.String ERROR_SERVLET_NAME`
- `public final static java.lang.String ERROR_STATUS_CODE`
- `public final static java.lang.String FORWARD_CONTEXT_PATH`
- `public final static java.lang.String FORWARD_MAPPING`
- `public final static java.lang.String FORWARD_PATH_INFO`
- `public final static java.lang.String FORWARD_QUERY_STRING`
- `public final static java.lang.String FORWARD_REQUEST_URI`
- `public final static java.lang.String FORWARD_SERVLET_PATH`
- `public final static java.lang.String INCLUDE_CONTEXT_PATH`
- `public final static java.lang.String INCLUDE_MAPPING`
- `public final static java.lang.String INCLUDE_PATH_INFO`
- `public final static java.lang.String INCLUDE_QUERY_STRING`
- `public final static java.lang.String INCLUDE_REQUEST_URI`
- `public final static java.lang.String INCLUDE_SERVLET_PATH`

**Methods:**
- `public abstract void forward(jakarta.servlet.ServletRequest p0, jakarta.servlet.ServletResponse p1) throws jakarta.servlet.ServletException, java.io.IOException`
- `public abstract void include(jakarta.servlet.ServletRequest p0, jakarta.servlet.ServletResponse p1) throws jakarta.servlet.ServletException, java.io.IOException`

---

## public abstract interface `jakarta.servlet.Servlet`

**Methods:**
- `public abstract void destroy()`
- `public abstract jakarta.servlet.ServletConfig getServletConfig()`
- `public abstract java.lang.String getServletInfo()`
- `public abstract void init(jakarta.servlet.ServletConfig p0) throws jakarta.servlet.ServletException`
- `public abstract void service(jakarta.servlet.ServletRequest p0, jakarta.servlet.ServletResponse p1) throws jakarta.servlet.ServletException, java.io.IOException`

---

## public abstract interface `jakarta.servlet.ServletConfig`

**Methods:**
- `public abstract java.lang.String getInitParameter(java.lang.String p0)`
- `public abstract java.util.Enumeration getInitParameterNames()`
- `public abstract jakarta.servlet.ServletContext getServletContext()`
- `public abstract java.lang.String getServletName()`

---

## public abstract interface `jakarta.servlet.ServletConnection`

**Methods:**
- `public abstract java.lang.String getConnectionId()`
- `public abstract java.lang.String getProtocol()`
- `public abstract java.lang.String getProtocolConnectionId()`
- `public abstract boolean isSecure()`

---

## public abstract interface `jakarta.servlet.ServletContainerInitializer`

**Methods:**
- `public abstract void onStartup(java.util.Set p0, jakarta.servlet.ServletContext p1) throws jakarta.servlet.ServletException`

---

## public abstract interface `jakarta.servlet.ServletContext`

**Fields:**
- `public final static java.lang.String ORDERED_LIBS`
- `public final static java.lang.String TEMPDIR`

**Methods:**
- `public abstract jakarta.servlet.FilterRegistration$Dynamic addFilter(java.lang.String p0, jakarta.servlet.Filter p1)`
- `public abstract jakarta.servlet.FilterRegistration$Dynamic addFilter(java.lang.String p0, java.lang.Class p1)`
- `public abstract jakarta.servlet.FilterRegistration$Dynamic addFilter(java.lang.String p0, java.lang.String p1)`
- `public abstract jakarta.servlet.ServletRegistration$Dynamic addJspFile(java.lang.String p0, java.lang.String p1)`
- `public abstract <T extends java.util.EventListener> void addListener(T p0)`
- `public abstract void addListener(java.lang.Class p0)`
- `public abstract void addListener(java.lang.String p0)`
- `public abstract jakarta.servlet.ServletRegistration$Dynamic addServlet(java.lang.String p0, jakarta.servlet.Servlet p1)`
- `public abstract jakarta.servlet.ServletRegistration$Dynamic addServlet(java.lang.String p0, java.lang.Class p1)`
- `public abstract jakarta.servlet.ServletRegistration$Dynamic addServlet(java.lang.String p0, java.lang.String p1)`
- `public abstract <T extends jakarta.servlet.Filter> T createFilter(java.lang.Class p0) throws jakarta.servlet.ServletException`
- `public abstract <T extends java.util.EventListener> T createListener(java.lang.Class p0) throws jakarta.servlet.ServletException`
- `public abstract <T extends jakarta.servlet.Servlet> T createServlet(java.lang.Class p0) throws jakarta.servlet.ServletException`
- `public abstract void declareRoles(java.lang.String... p0)`
- `public abstract java.lang.Object getAttribute(java.lang.String p0)`
- `public abstract java.util.Enumeration getAttributeNames()`
- `public abstract java.lang.ClassLoader getClassLoader()`
- `public abstract jakarta.servlet.ServletContext getContext(java.lang.String p0)`
- `public abstract java.lang.String getContextPath()`
- `public abstract java.util.Set getDefaultSessionTrackingModes()`
- `public abstract int getEffectiveMajorVersion()`
- `public abstract int getEffectiveMinorVersion()`
- `public abstract java.util.Set getEffectiveSessionTrackingModes()`
- `public abstract jakarta.servlet.FilterRegistration getFilterRegistration(java.lang.String p0)`
- `public abstract java.util.Map getFilterRegistrations()`
- `public abstract java.lang.String getInitParameter(java.lang.String p0)`
- `public abstract java.util.Enumeration getInitParameterNames()`
- `public abstract jakarta.servlet.descriptor.JspConfigDescriptor getJspConfigDescriptor()`
- `public abstract int getMajorVersion()`
- `public abstract java.lang.String getMimeType(java.lang.String p0)`
- `public abstract int getMinorVersion()`
- `public abstract jakarta.servlet.RequestDispatcher getNamedDispatcher(java.lang.String p0)`
- `public abstract java.lang.String getRealPath(java.lang.String p0)`
- `public abstract java.lang.String getRequestCharacterEncoding()`
- `public abstract jakarta.servlet.RequestDispatcher getRequestDispatcher(java.lang.String p0)`
- `public abstract java.net.URL getResource(java.lang.String p0) throws java.net.MalformedURLException`
- `public abstract java.io.InputStream getResourceAsStream(java.lang.String p0)`
- `public abstract java.util.Set getResourcePaths(java.lang.String p0)`
- `public abstract java.lang.String getResponseCharacterEncoding()`
- `public abstract java.lang.String getServerInfo()`
- `public abstract java.lang.String getServletContextName()`
- `public abstract jakarta.servlet.ServletRegistration getServletRegistration(java.lang.String p0)`
- `public abstract java.util.Map getServletRegistrations()`
- `public abstract jakarta.servlet.SessionCookieConfig getSessionCookieConfig()`
- `public abstract int getSessionTimeout()`
- `public abstract java.lang.String getVirtualServerName()`
- `public abstract void log(java.lang.String p0)`
- `public abstract void log(java.lang.String p0, java.lang.Throwable p1)`
- `public abstract void removeAttribute(java.lang.String p0)`
- `public abstract void setAttribute(java.lang.String p0, java.lang.Object p1)`
- `public abstract boolean setInitParameter(java.lang.String p0, java.lang.String p1)`
- `public abstract void setRequestCharacterEncoding(java.lang.String p0)`
- `public abstract void setResponseCharacterEncoding(java.lang.String p0)`
- `public abstract void setSessionTimeout(int p0)`
- `public abstract void setSessionTrackingModes(java.util.Set p0)`

---

## public class `jakarta.servlet.ServletContextAttributeEvent`
extends `jakarta.servlet.ServletContextEvent`  

**Constructors:**
- `public ServletContextAttributeEvent(jakarta.servlet.ServletContext p0, java.lang.String p1, java.lang.Object p2)`

**Methods:**
- `public java.lang.String getName()`
- `public java.lang.Object getValue()`

---

## public abstract interface `jakarta.servlet.ServletContextAttributeListener`
implements `java.util.EventListener`  

**Methods:**
- `public default void attributeAdded(jakarta.servlet.ServletContextAttributeEvent p0)`
- `public default void attributeRemoved(jakarta.servlet.ServletContextAttributeEvent p0)`
- `public default void attributeReplaced(jakarta.servlet.ServletContextAttributeEvent p0)`

---

## public class `jakarta.servlet.ServletContextEvent`
extends `java.util.EventObject`  

**Constructors:**
- `public ServletContextEvent(jakarta.servlet.ServletContext p0)`

**Methods:**
- `public jakarta.servlet.ServletContext getServletContext()`

---

## public abstract interface `jakarta.servlet.ServletContextListener`
implements `java.util.EventListener`  

**Methods:**
- `public default void contextDestroyed(jakarta.servlet.ServletContextEvent p0)`
- `public default void contextInitialized(jakarta.servlet.ServletContextEvent p0)`

---

## public class `jakarta.servlet.ServletException`
extends `java.lang.Exception`  

**Constructors:**
- `public ServletException()`
- `public ServletException(java.lang.String p0)`
- `public ServletException(java.lang.String p0, java.lang.Throwable p1)`
- `public ServletException(java.lang.Throwable p0)`

**Methods:**
- `public java.lang.Throwable getRootCause()`

---

## public abstract class `jakarta.servlet.ServletInputStream`
extends `java.io.InputStream`  

**Constructors:**
- `protected ServletInputStream()`

**Methods:**
- `public abstract boolean isFinished()`
- `public abstract boolean isReady()`
- `public int readLine(byte[] p0, int p1, int p2) throws java.io.IOException`
- `public abstract void setReadListener(jakarta.servlet.ReadListener p0)`

---

## public abstract class `jakarta.servlet.ServletOutputStream`
extends `java.io.OutputStream`  

**Constructors:**
- `protected ServletOutputStream()`

**Methods:**
- `public abstract boolean isReady()`
- `public void print(boolean p0) throws java.io.IOException`
- `public void print(char p0) throws java.io.IOException`
- `public void print(double p0) throws java.io.IOException`
- `public void print(float p0) throws java.io.IOException`
- `public void print(int p0) throws java.io.IOException`
- `public void print(java.lang.String p0) throws java.io.IOException`
- `public void print(long p0) throws java.io.IOException`
- `public void println() throws java.io.IOException`
- `public void println(boolean p0) throws java.io.IOException`
- `public void println(char p0) throws java.io.IOException`
- `public void println(double p0) throws java.io.IOException`
- `public void println(float p0) throws java.io.IOException`
- `public void println(int p0) throws java.io.IOException`
- `public void println(java.lang.String p0) throws java.io.IOException`
- `public void println(long p0) throws java.io.IOException`
- `public abstract void setWriteListener(jakarta.servlet.WriteListener p0)`

---

## public abstract interface `jakarta.servlet.ServletRegistration`
implements `jakarta.servlet.Registration`  

**Methods:**
- `public abstract java.util.Set addMapping(java.lang.String... p0)`
- `public abstract java.util.Collection getMappings()`
- `public abstract java.lang.String getRunAsRole()`

---

## public abstract static interface `jakarta.servlet.ServletRegistration$Dynamic`
implements `jakarta.servlet.Registration$Dynamic`, `jakarta.servlet.ServletRegistration`  

**Methods:**
- `public abstract void setLoadOnStartup(int p0)`
- `public abstract void setMultipartConfig(jakarta.servlet.MultipartConfigElement p0)`
- `public abstract void setRunAsRole(java.lang.String p0)`
- `public abstract java.util.Set setServletSecurity(jakarta.servlet.ServletSecurityElement p0)`

---

## public abstract interface `jakarta.servlet.ServletRequest`

**Methods:**
- `public abstract jakarta.servlet.AsyncContext getAsyncContext()`
- `public abstract java.lang.Object getAttribute(java.lang.String p0)`
- `public abstract java.util.Enumeration getAttributeNames()`
- `public abstract java.lang.String getCharacterEncoding()`
- `public abstract int getContentLength()`
- `public abstract long getContentLengthLong()`
- `public abstract java.lang.String getContentType()`
- `public abstract jakarta.servlet.DispatcherType getDispatcherType()`
- `public abstract jakarta.servlet.ServletInputStream getInputStream() throws java.io.IOException`
- `public abstract java.lang.String getLocalAddr()`
- `public abstract java.lang.String getLocalName()`
- `public abstract int getLocalPort()`
- `public abstract java.util.Locale getLocale()`
- `public abstract java.util.Enumeration getLocales()`
- `public abstract java.lang.String getParameter(java.lang.String p0)`
- `public abstract java.util.Map getParameterMap()`
- `public abstract java.util.Enumeration getParameterNames()`
- `public abstract java.lang.String[] getParameterValues(java.lang.String p0)`
- `public abstract java.lang.String getProtocol()`
- `public abstract java.lang.String getProtocolRequestId()`
- `public abstract java.io.BufferedReader getReader() throws java.io.IOException`
- `public abstract java.lang.String getRemoteAddr()`
- `public abstract java.lang.String getRemoteHost()`
- `public abstract int getRemotePort()`
- `public abstract jakarta.servlet.RequestDispatcher getRequestDispatcher(java.lang.String p0)`
- `public abstract java.lang.String getRequestId()`
- `public abstract java.lang.String getScheme()`
- `public abstract java.lang.String getServerName()`
- `public abstract int getServerPort()`
- `public abstract jakarta.servlet.ServletConnection getServletConnection()`
- `public abstract jakarta.servlet.ServletContext getServletContext()`
- `public abstract boolean isAsyncStarted()`
- `public abstract boolean isAsyncSupported()`
- `public abstract boolean isSecure()`
- `public abstract void removeAttribute(java.lang.String p0)`
- `public abstract void setAttribute(java.lang.String p0, java.lang.Object p1)`
- `public abstract void setCharacterEncoding(java.lang.String p0) throws java.io.UnsupportedEncodingException`
- `public abstract jakarta.servlet.AsyncContext startAsync() throws java.lang.IllegalStateException`
- `public abstract jakarta.servlet.AsyncContext startAsync(jakarta.servlet.ServletRequest p0, jakarta.servlet.ServletResponse p1) throws java.lang.IllegalStateException`

---

## public class `jakarta.servlet.ServletRequestAttributeEvent`
extends `jakarta.servlet.ServletRequestEvent`  

**Constructors:**
- `public ServletRequestAttributeEvent(jakarta.servlet.ServletContext p0, jakarta.servlet.ServletRequest p1, java.lang.String p2, java.lang.Object p3)`

**Methods:**
- `public java.lang.String getName()`
- `public java.lang.Object getValue()`

---

## public abstract interface `jakarta.servlet.ServletRequestAttributeListener`
implements `java.util.EventListener`  

**Methods:**
- `public default void attributeAdded(jakarta.servlet.ServletRequestAttributeEvent p0)`
- `public default void attributeRemoved(jakarta.servlet.ServletRequestAttributeEvent p0)`
- `public default void attributeReplaced(jakarta.servlet.ServletRequestAttributeEvent p0)`

---

## public class `jakarta.servlet.ServletRequestEvent`
extends `java.util.EventObject`  

**Constructors:**
- `public ServletRequestEvent(jakarta.servlet.ServletContext p0, jakarta.servlet.ServletRequest p1)`

**Methods:**
- `public jakarta.servlet.ServletContext getServletContext()`
- `public jakarta.servlet.ServletRequest getServletRequest()`

---

## public abstract interface `jakarta.servlet.ServletRequestListener`
implements `java.util.EventListener`  

**Methods:**
- `public default void requestDestroyed(jakarta.servlet.ServletRequestEvent p0)`
- `public default void requestInitialized(jakarta.servlet.ServletRequestEvent p0)`

---

## public class `jakarta.servlet.ServletRequestWrapper`
implements `jakarta.servlet.ServletRequest`  

**Constructors:**
- `public ServletRequestWrapper(jakarta.servlet.ServletRequest p0)`

**Methods:**
- `public jakarta.servlet.AsyncContext getAsyncContext()`
- `public java.lang.Object getAttribute(java.lang.String p0)`
- `public java.util.Enumeration getAttributeNames()`
- `public java.lang.String getCharacterEncoding()`
- `public int getContentLength()`
- `public long getContentLengthLong()`
- `public java.lang.String getContentType()`
- `public jakarta.servlet.DispatcherType getDispatcherType()`
- `public jakarta.servlet.ServletInputStream getInputStream() throws java.io.IOException`
- `public java.lang.String getLocalAddr()`
- `public java.lang.String getLocalName()`
- `public int getLocalPort()`
- `public java.util.Locale getLocale()`
- `public java.util.Enumeration getLocales()`
- `public java.lang.String getParameter(java.lang.String p0)`
- `public java.util.Map getParameterMap()`
- `public java.util.Enumeration getParameterNames()`
- `public java.lang.String[] getParameterValues(java.lang.String p0)`
- `public java.lang.String getProtocol()`
- `public java.lang.String getProtocolRequestId()`
- `public java.io.BufferedReader getReader() throws java.io.IOException`
- `public java.lang.String getRemoteAddr()`
- `public java.lang.String getRemoteHost()`
- `public int getRemotePort()`
- `public jakarta.servlet.ServletRequest getRequest()`
- `public jakarta.servlet.RequestDispatcher getRequestDispatcher(java.lang.String p0)`
- `public java.lang.String getRequestId()`
- `public java.lang.String getScheme()`
- `public java.lang.String getServerName()`
- `public int getServerPort()`
- `public jakarta.servlet.ServletConnection getServletConnection()`
- `public jakarta.servlet.ServletContext getServletContext()`
- `public boolean isAsyncStarted()`
- `public boolean isAsyncSupported()`
- `public boolean isSecure()`
- `public boolean isWrapperFor(jakarta.servlet.ServletRequest p0)`
- `public boolean isWrapperFor(java.lang.Class p0)`
- `public void removeAttribute(java.lang.String p0)`
- `public void setAttribute(java.lang.String p0, java.lang.Object p1)`
- `public void setCharacterEncoding(java.lang.String p0) throws java.io.UnsupportedEncodingException`
- `public void setRequest(jakarta.servlet.ServletRequest p0)`
- `public jakarta.servlet.AsyncContext startAsync() throws java.lang.IllegalStateException`
- `public jakarta.servlet.AsyncContext startAsync(jakarta.servlet.ServletRequest p0, jakarta.servlet.ServletResponse p1) throws java.lang.IllegalStateException`

---

## public abstract interface `jakarta.servlet.ServletResponse`

**Methods:**
- `public abstract void flushBuffer() throws java.io.IOException`
- `public abstract int getBufferSize()`
- `public abstract java.lang.String getCharacterEncoding()`
- `public abstract java.lang.String getContentType()`
- `public abstract java.util.Locale getLocale()`
- `public abstract jakarta.servlet.ServletOutputStream getOutputStream() throws java.io.IOException`
- `public abstract java.io.PrintWriter getWriter() throws java.io.IOException`
- `public abstract boolean isCommitted()`
- `public abstract void reset()`
- `public abstract void resetBuffer()`
- `public abstract void setBufferSize(int p0)`
- `public abstract void setCharacterEncoding(java.lang.String p0)`
- `public abstract void setContentLength(int p0)`
- `public abstract void setContentLengthLong(long p0)`
- `public abstract void setContentType(java.lang.String p0)`
- `public abstract void setLocale(java.util.Locale p0)`

---

## public class `jakarta.servlet.ServletResponseWrapper`
implements `jakarta.servlet.ServletResponse`  

**Constructors:**
- `public ServletResponseWrapper(jakarta.servlet.ServletResponse p0)`

**Methods:**
- `public void flushBuffer() throws java.io.IOException`
- `public int getBufferSize()`
- `public java.lang.String getCharacterEncoding()`
- `public java.lang.String getContentType()`
- `public java.util.Locale getLocale()`
- `public jakarta.servlet.ServletOutputStream getOutputStream() throws java.io.IOException`
- `public jakarta.servlet.ServletResponse getResponse()`
- `public java.io.PrintWriter getWriter() throws java.io.IOException`
- `public boolean isCommitted()`
- `public boolean isWrapperFor(jakarta.servlet.ServletResponse p0)`
- `public boolean isWrapperFor(java.lang.Class p0)`
- `public void reset()`
- `public void resetBuffer()`
- `public void setBufferSize(int p0)`
- `public void setCharacterEncoding(java.lang.String p0)`
- `public void setContentLength(int p0)`
- `public void setContentLengthLong(long p0)`
- `public void setContentType(java.lang.String p0)`
- `public void setLocale(java.util.Locale p0)`
- `public void setResponse(jakarta.servlet.ServletResponse p0)`

---

## public class `jakarta.servlet.ServletSecurityElement`
extends `jakarta.servlet.HttpConstraintElement`  

**Constructors:**
- `public ServletSecurityElement()`
- `public ServletSecurityElement(jakarta.servlet.HttpConstraintElement p0)`
- `public ServletSecurityElement(jakarta.servlet.HttpConstraintElement p0, java.util.Collection p1)`
- `public ServletSecurityElement(jakarta.servlet.annotation.ServletSecurity p0)`
- `public ServletSecurityElement(java.util.Collection p0)`

**Methods:**
- `public java.util.Collection getHttpMethodConstraints()`
- `public java.util.Collection getMethodNames()`

---

## public abstract interface `jakarta.servlet.SessionCookieConfig`

**Methods:**
- `public abstract java.lang.String getAttribute(java.lang.String p0)`
- `public abstract java.util.Map getAttributes()`
- `public abstract java.lang.String getComment()`
- `public abstract java.lang.String getDomain()`
- `public abstract int getMaxAge()`
- `public abstract java.lang.String getName()`
- `public abstract java.lang.String getPath()`
- `public abstract boolean isHttpOnly()`
- `public abstract boolean isSecure()`
- `public abstract void setAttribute(java.lang.String p0, java.lang.String p1)`
- `public abstract void setComment(java.lang.String p0)`
- `public abstract void setDomain(java.lang.String p0)`
- `public abstract void setHttpOnly(boolean p0)`
- `public abstract void setMaxAge(int p0)`
- `public abstract void setName(java.lang.String p0)`
- `public abstract void setPath(java.lang.String p0)`
- `public abstract void setSecure(boolean p0)`

---

## public final enum `jakarta.servlet.SessionTrackingMode`
extends `java.lang.Enum`  

**Fields:**
- `public final static jakarta.servlet.SessionTrackingMode COOKIE`
- `public final static jakarta.servlet.SessionTrackingMode SSL`
- `public final static jakarta.servlet.SessionTrackingMode URL`

---

## public class `jakarta.servlet.UnavailableException`
extends `jakarta.servlet.ServletException`  

**Constructors:**
- `public UnavailableException(java.lang.String p0)`
- `public UnavailableException(java.lang.String p0, int p1)`

**Methods:**
- `public int getUnavailableSeconds()`
- `public boolean isPermanent()`

---

## public abstract interface `jakarta.servlet.WriteListener`
implements `java.util.EventListener`  

**Methods:**
- `public abstract void onError(java.lang.Throwable p0)`
- `public abstract void onWritePossible() throws java.io.IOException`

---

## public abstract interface `jakarta.servlet.annotation.HandlesTypes`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.servlet.annotation.HttpConstraint`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention  

---

## public abstract interface `jakarta.servlet.annotation.HttpMethodConstraint`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention  

---

## public abstract interface `jakarta.servlet.annotation.MultipartConfig`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.servlet.annotation.ServletSecurity`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Inherited, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public final static enum `jakarta.servlet.annotation.ServletSecurity$EmptyRoleSemantic`
extends `java.lang.Enum`  

**Fields:**
- `public final static jakarta.servlet.annotation.ServletSecurity$EmptyRoleSemantic DENY`
- `public final static jakarta.servlet.annotation.ServletSecurity$EmptyRoleSemantic PERMIT`

---

## public final static enum `jakarta.servlet.annotation.ServletSecurity$TransportGuarantee`
extends `java.lang.Enum`  

**Fields:**
- `public final static jakarta.servlet.annotation.ServletSecurity$TransportGuarantee CONFIDENTIAL`
- `public final static jakarta.servlet.annotation.ServletSecurity$TransportGuarantee NONE`

---

## public abstract interface `jakarta.servlet.annotation.WebFilter`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.servlet.annotation.WebInitParam`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.servlet.annotation.WebListener`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.servlet.annotation.WebServlet`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.servlet.descriptor.JspConfigDescriptor`

**Methods:**
- `public abstract java.util.Collection getJspPropertyGroups()`
- `public abstract java.util.Collection getTaglibs()`

---

## public abstract interface `jakarta.servlet.descriptor.JspPropertyGroupDescriptor`

**Methods:**
- `public abstract java.lang.String getBuffer()`
- `public abstract java.lang.String getDefaultContentType()`
- `public abstract java.lang.String getDeferredSyntaxAllowedAsLiteral()`
- `public abstract java.lang.String getElIgnored()`
- `public abstract java.lang.String getErrorOnELNotFound()`
- `public abstract java.lang.String getErrorOnUndeclaredNamespace()`
- `public abstract java.util.Collection getIncludeCodas()`
- `public abstract java.util.Collection getIncludePreludes()`
- `public abstract java.lang.String getIsXml()`
- `public abstract java.lang.String getPageEncoding()`
- `public abstract java.lang.String getScriptingInvalid()`
- `public abstract java.lang.String getTrimDirectiveWhitespaces()`
- `public abstract java.util.Collection getUrlPatterns()`

---

## public abstract interface `jakarta.servlet.descriptor.TaglibDescriptor`

**Methods:**
- `public abstract java.lang.String getTaglibLocation()`
- `public abstract java.lang.String getTaglibURI()`

---

## public class `jakarta.servlet.http.Cookie`
implements `java.io.Serializable`, `java.lang.Cloneable`  

**Constructors:**
- `public Cookie(java.lang.String p0, java.lang.String p1)`

**Methods:**
- `public java.lang.Object clone()`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getAttribute(java.lang.String p0)`
- `public java.util.Map getAttributes()`
- `public java.lang.String getComment()`
- `public java.lang.String getDomain()`
- `public int getMaxAge()`
- `public java.lang.String getName()`
- `public java.lang.String getPath()`
- `public boolean getSecure()`
- `public java.lang.String getValue()`
- `public int getVersion()`
- `public int hashCode()`
- `public boolean isHttpOnly()`
- `public void setAttribute(java.lang.String p0, java.lang.String p1)`
- `public void setComment(java.lang.String p0)`
- `public void setDomain(java.lang.String p0)`
- `public void setHttpOnly(boolean p0)`
- `public void setMaxAge(int p0)`
- `public void setPath(java.lang.String p0)`
- `public void setSecure(boolean p0)`
- `public void setValue(java.lang.String p0)`
- `public void setVersion(int p0)`
- `public java.lang.String toString()`

---

## public abstract class `jakarta.servlet.http.HttpFilter`
extends `jakarta.servlet.GenericFilter`  

**Constructors:**
- `public HttpFilter()`

**Methods:**
- `public void doFilter(jakarta.servlet.ServletRequest p0, jakarta.servlet.ServletResponse p1, jakarta.servlet.FilterChain p2) throws jakarta.servlet.ServletException, java.io.IOException`
- `protected void doFilter(jakarta.servlet.http.HttpServletRequest p0, jakarta.servlet.http.HttpServletResponse p1, jakarta.servlet.FilterChain p2) throws jakarta.servlet.ServletException, java.io.IOException`

---

## public abstract class `jakarta.servlet.http.HttpServlet`
extends `jakarta.servlet.GenericServlet`  

**Constructors:**
- `public HttpServlet()`

**Fields:**
- `public final static java.lang.String LEGACY_DO_HEAD`

**Methods:**
- `protected void doDelete(jakarta.servlet.http.HttpServletRequest p0, jakarta.servlet.http.HttpServletResponse p1) throws jakarta.servlet.ServletException, java.io.IOException`
- `protected void doGet(jakarta.servlet.http.HttpServletRequest p0, jakarta.servlet.http.HttpServletResponse p1) throws jakarta.servlet.ServletException, java.io.IOException`
- `protected void doHead(jakarta.servlet.http.HttpServletRequest p0, jakarta.servlet.http.HttpServletResponse p1) throws jakarta.servlet.ServletException, java.io.IOException`
- `protected void doOptions(jakarta.servlet.http.HttpServletRequest p0, jakarta.servlet.http.HttpServletResponse p1) throws jakarta.servlet.ServletException, java.io.IOException`
- `protected void doPost(jakarta.servlet.http.HttpServletRequest p0, jakarta.servlet.http.HttpServletResponse p1) throws jakarta.servlet.ServletException, java.io.IOException`
- `protected void doPut(jakarta.servlet.http.HttpServletRequest p0, jakarta.servlet.http.HttpServletResponse p1) throws jakarta.servlet.ServletException, java.io.IOException`
- `protected void doTrace(jakarta.servlet.http.HttpServletRequest p0, jakarta.servlet.http.HttpServletResponse p1) throws jakarta.servlet.ServletException, java.io.IOException`
- `protected long getLastModified(jakarta.servlet.http.HttpServletRequest p0)`
- `public void init(jakarta.servlet.ServletConfig p0) throws jakarta.servlet.ServletException`
- `public void service(jakarta.servlet.ServletRequest p0, jakarta.servlet.ServletResponse p1) throws jakarta.servlet.ServletException, java.io.IOException`
- `protected void service(jakarta.servlet.http.HttpServletRequest p0, jakarta.servlet.http.HttpServletResponse p1) throws jakarta.servlet.ServletException, java.io.IOException`

---

## public abstract interface `jakarta.servlet.http.HttpServletMapping`

**Methods:**
- `public abstract jakarta.servlet.http.MappingMatch getMappingMatch()`
- `public abstract java.lang.String getMatchValue()`
- `public abstract java.lang.String getPattern()`
- `public abstract java.lang.String getServletName()`

---

## public abstract interface `jakarta.servlet.http.HttpServletRequest`
implements `jakarta.servlet.ServletRequest`  

**Fields:**
- `public final static java.lang.String BASIC_AUTH`
- `public final static java.lang.String CLIENT_CERT_AUTH`
- `public final static java.lang.String DIGEST_AUTH`
- `public final static java.lang.String FORM_AUTH`

**Methods:**
- `public abstract boolean authenticate(jakarta.servlet.http.HttpServletResponse p0) throws jakarta.servlet.ServletException, java.io.IOException`
- `public abstract java.lang.String changeSessionId()`
- `public abstract java.lang.String getAuthType()`
- `public abstract java.lang.String getContextPath()`
- `public abstract jakarta.servlet.http.Cookie[] getCookies()`
- `public abstract long getDateHeader(java.lang.String p0)`
- `public abstract java.lang.String getHeader(java.lang.String p0)`
- `public abstract java.util.Enumeration getHeaderNames()`
- `public abstract java.util.Enumeration getHeaders(java.lang.String p0)`
- `public default jakarta.servlet.http.HttpServletMapping getHttpServletMapping()`
- `public abstract int getIntHeader(java.lang.String p0)`
- `public abstract java.lang.String getMethod()`
- `public abstract jakarta.servlet.http.Part getPart(java.lang.String p0) throws jakarta.servlet.ServletException, java.io.IOException`
- `public abstract java.util.Collection getParts() throws jakarta.servlet.ServletException, java.io.IOException`
- `public abstract java.lang.String getPathInfo()`
- `public abstract java.lang.String getPathTranslated()`
- `public abstract java.lang.String getQueryString()`
- `public abstract java.lang.String getRemoteUser()`
- `public abstract java.lang.String getRequestURI()`
- `public abstract java.lang.StringBuffer getRequestURL()`
- `public abstract java.lang.String getRequestedSessionId()`
- `public abstract java.lang.String getServletPath()`
- `public abstract jakarta.servlet.http.HttpSession getSession()`
- `public abstract jakarta.servlet.http.HttpSession getSession(boolean p0)`
- `public default java.util.Map getTrailerFields()`
- `public abstract java.security.Principal getUserPrincipal()`
- `public abstract boolean isRequestedSessionIdFromCookie()`
- `public abstract boolean isRequestedSessionIdFromURL()`
- `public abstract boolean isRequestedSessionIdValid()`
- `public default boolean isTrailerFieldsReady()`
- `public abstract boolean isUserInRole(java.lang.String p0)`
- `public abstract void login(java.lang.String p0, java.lang.String p1) throws jakarta.servlet.ServletException`
- `public abstract void logout() throws jakarta.servlet.ServletException`
- `public default jakarta.servlet.http.PushBuilder newPushBuilder()`
- `public abstract <T extends jakarta.servlet.http.HttpUpgradeHandler> T upgrade(java.lang.Class p0) throws jakarta.servlet.ServletException, java.io.IOException`

---

## public class `jakarta.servlet.http.HttpServletRequestWrapper`
extends `jakarta.servlet.ServletRequestWrapper`  
implements `jakarta.servlet.http.HttpServletRequest`  

**Constructors:**
- `public HttpServletRequestWrapper(jakarta.servlet.http.HttpServletRequest p0)`

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
- `public jakarta.servlet.http.HttpServletMapping getHttpServletMapping()`
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
- `public java.util.Map getTrailerFields()`
- `public java.security.Principal getUserPrincipal()`
- `public boolean isRequestedSessionIdFromCookie()`
- `public boolean isRequestedSessionIdFromURL()`
- `public boolean isRequestedSessionIdValid()`
- `public boolean isTrailerFieldsReady()`
- `public boolean isUserInRole(java.lang.String p0)`
- `public void login(java.lang.String p0, java.lang.String p1) throws jakarta.servlet.ServletException`
- `public void logout() throws jakarta.servlet.ServletException`
- `public jakarta.servlet.http.PushBuilder newPushBuilder()`
- `public <T extends jakarta.servlet.http.HttpUpgradeHandler> T upgrade(java.lang.Class p0) throws jakarta.servlet.ServletException, java.io.IOException`

---

## public abstract interface `jakarta.servlet.http.HttpServletResponse`
implements `jakarta.servlet.ServletResponse`  

**Fields:**
- `public final static int SC_ACCEPTED`
- `public final static int SC_BAD_GATEWAY`
- `public final static int SC_BAD_REQUEST`
- `public final static int SC_CONFLICT`
- `public final static int SC_CONTINUE`
- `public final static int SC_CREATED`
- `public final static int SC_EXPECTATION_FAILED`
- `public final static int SC_FORBIDDEN`
- `public final static int SC_FOUND`
- `public final static int SC_GATEWAY_TIMEOUT`
- `public final static int SC_GONE`
- `public final static int SC_HTTP_VERSION_NOT_SUPPORTED`
- `public final static int SC_INTERNAL_SERVER_ERROR`
- `public final static int SC_LENGTH_REQUIRED`
- `public final static int SC_METHOD_NOT_ALLOWED`
- `public final static int SC_MOVED_PERMANENTLY`
- `public final static int SC_MOVED_TEMPORARILY`
- `public final static int SC_MULTIPLE_CHOICES`
- `public final static int SC_NON_AUTHORITATIVE_INFORMATION`
- `public final static int SC_NOT_ACCEPTABLE`
- `public final static int SC_NOT_FOUND`
- `public final static int SC_NOT_IMPLEMENTED`
- `public final static int SC_NOT_MODIFIED`
- `public final static int SC_NO_CONTENT`
- `public final static int SC_OK`
- `public final static int SC_PARTIAL_CONTENT`
- `public final static int SC_PAYMENT_REQUIRED`
- `public final static int SC_PRECONDITION_FAILED`
- `public final static int SC_PROXY_AUTHENTICATION_REQUIRED`
- `public final static int SC_REQUESTED_RANGE_NOT_SATISFIABLE`
- `public final static int SC_REQUEST_ENTITY_TOO_LARGE`
- `public final static int SC_REQUEST_TIMEOUT`
- `public final static int SC_REQUEST_URI_TOO_LONG`
- `public final static int SC_RESET_CONTENT`
- `public final static int SC_SEE_OTHER`
- `public final static int SC_SERVICE_UNAVAILABLE`
- `public final static int SC_SWITCHING_PROTOCOLS`
- `public final static int SC_TEMPORARY_REDIRECT`
- `public final static int SC_UNAUTHORIZED`
- `public final static int SC_UNSUPPORTED_MEDIA_TYPE`
- `public final static int SC_USE_PROXY`

**Methods:**
- `public abstract void addCookie(jakarta.servlet.http.Cookie p0)`
- `public abstract void addDateHeader(java.lang.String p0, long p1)`
- `public abstract void addHeader(java.lang.String p0, java.lang.String p1)`
- `public abstract void addIntHeader(java.lang.String p0, int p1)`
- `public abstract boolean containsHeader(java.lang.String p0)`
- `public abstract java.lang.String encodeRedirectURL(java.lang.String p0)`
- `public abstract java.lang.String encodeURL(java.lang.String p0)`
- `public abstract java.lang.String getHeader(java.lang.String p0)`
- `public abstract java.util.Collection getHeaderNames()`
- `public abstract java.util.Collection getHeaders(java.lang.String p0)`
- `public abstract int getStatus()`
- `public default java.util.function.Supplier getTrailerFields()`
- `public abstract void sendError(int p0) throws java.io.IOException`
- `public abstract void sendError(int p0, java.lang.String p1) throws java.io.IOException`
- `public abstract void sendRedirect(java.lang.String p0) throws java.io.IOException`
- `public abstract void setDateHeader(java.lang.String p0, long p1)`
- `public abstract void setHeader(java.lang.String p0, java.lang.String p1)`
- `public abstract void setIntHeader(java.lang.String p0, int p1)`
- `public abstract void setStatus(int p0)`
- `public default void setTrailerFields(java.util.function.Supplier p0)`

---

## public class `jakarta.servlet.http.HttpServletResponseWrapper`
extends `jakarta.servlet.ServletResponseWrapper`  
implements `jakarta.servlet.http.HttpServletResponse`  

**Constructors:**
- `public HttpServletResponseWrapper(jakarta.servlet.http.HttpServletResponse p0)`

**Methods:**
- `public void addCookie(jakarta.servlet.http.Cookie p0)`
- `public void addDateHeader(java.lang.String p0, long p1)`
- `public void addHeader(java.lang.String p0, java.lang.String p1)`
- `public void addIntHeader(java.lang.String p0, int p1)`
- `public boolean containsHeader(java.lang.String p0)`
- `public java.lang.String encodeRedirectURL(java.lang.String p0)`
- `public java.lang.String encodeURL(java.lang.String p0)`
- `public java.lang.String getHeader(java.lang.String p0)`
- `public java.util.Collection getHeaderNames()`
- `public java.util.Collection getHeaders(java.lang.String p0)`
- `public int getStatus()`
- `public java.util.function.Supplier getTrailerFields()`
- `public void sendError(int p0) throws java.io.IOException`
- `public void sendError(int p0, java.lang.String p1) throws java.io.IOException`
- `public void sendRedirect(java.lang.String p0) throws java.io.IOException`
- `public void setDateHeader(java.lang.String p0, long p1)`
- `public void setHeader(java.lang.String p0, java.lang.String p1)`
- `public void setIntHeader(java.lang.String p0, int p1)`
- `public void setStatus(int p0)`
- `public void setTrailerFields(java.util.function.Supplier p0)`

---

## public abstract interface `jakarta.servlet.http.HttpSession`

**Methods:**
- `public abstract java.lang.Object getAttribute(java.lang.String p0)`
- `public abstract java.util.Enumeration getAttributeNames()`
- `public abstract long getCreationTime()`
- `public abstract java.lang.String getId()`
- `public abstract long getLastAccessedTime()`
- `public abstract int getMaxInactiveInterval()`
- `public abstract jakarta.servlet.ServletContext getServletContext()`
- `public abstract void invalidate()`
- `public abstract boolean isNew()`
- `public abstract void removeAttribute(java.lang.String p0)`
- `public abstract void setAttribute(java.lang.String p0, java.lang.Object p1)`
- `public abstract void setMaxInactiveInterval(int p0)`

---

## public abstract interface `jakarta.servlet.http.HttpSessionActivationListener`
implements `java.util.EventListener`  

**Methods:**
- `public default void sessionDidActivate(jakarta.servlet.http.HttpSessionEvent p0)`
- `public default void sessionWillPassivate(jakarta.servlet.http.HttpSessionEvent p0)`

---

## public abstract interface `jakarta.servlet.http.HttpSessionAttributeListener`
implements `java.util.EventListener`  

**Methods:**
- `public default void attributeAdded(jakarta.servlet.http.HttpSessionBindingEvent p0)`
- `public default void attributeRemoved(jakarta.servlet.http.HttpSessionBindingEvent p0)`
- `public default void attributeReplaced(jakarta.servlet.http.HttpSessionBindingEvent p0)`

---

## public class `jakarta.servlet.http.HttpSessionBindingEvent`
extends `jakarta.servlet.http.HttpSessionEvent`  

**Constructors:**
- `public HttpSessionBindingEvent(jakarta.servlet.http.HttpSession p0, java.lang.String p1)`
- `public HttpSessionBindingEvent(jakarta.servlet.http.HttpSession p0, java.lang.String p1, java.lang.Object p2)`

**Methods:**
- `public java.lang.String getName()`
- `public java.lang.Object getValue()`

---

## public abstract interface `jakarta.servlet.http.HttpSessionBindingListener`
implements `java.util.EventListener`  

**Methods:**
- `public default void valueBound(jakarta.servlet.http.HttpSessionBindingEvent p0)`
- `public default void valueUnbound(jakarta.servlet.http.HttpSessionBindingEvent p0)`

---

## public class `jakarta.servlet.http.HttpSessionEvent`
extends `java.util.EventObject`  

**Constructors:**
- `public HttpSessionEvent(jakarta.servlet.http.HttpSession p0)`

**Methods:**
- `public jakarta.servlet.http.HttpSession getSession()`

---

## public abstract interface `jakarta.servlet.http.HttpSessionIdListener`
implements `java.util.EventListener`  

**Methods:**
- `public abstract void sessionIdChanged(jakarta.servlet.http.HttpSessionEvent p0, java.lang.String p1)`

---

## public abstract interface `jakarta.servlet.http.HttpSessionListener`
implements `java.util.EventListener`  

**Methods:**
- `public default void sessionCreated(jakarta.servlet.http.HttpSessionEvent p0)`
- `public default void sessionDestroyed(jakarta.servlet.http.HttpSessionEvent p0)`

---

## public abstract interface `jakarta.servlet.http.HttpUpgradeHandler`

**Methods:**
- `public abstract void destroy()`
- `public abstract void init(jakarta.servlet.http.WebConnection p0)`

---

## public final enum `jakarta.servlet.http.MappingMatch`
extends `java.lang.Enum`  

**Fields:**
- `public final static jakarta.servlet.http.MappingMatch CONTEXT_ROOT`
- `public final static jakarta.servlet.http.MappingMatch DEFAULT`
- `public final static jakarta.servlet.http.MappingMatch EXACT`
- `public final static jakarta.servlet.http.MappingMatch EXTENSION`
- `public final static jakarta.servlet.http.MappingMatch PATH`

---

## public abstract interface `jakarta.servlet.http.Part`

**Methods:**
- `public abstract void delete() throws java.io.IOException`
- `public abstract java.lang.String getContentType()`
- `public abstract java.lang.String getHeader(java.lang.String p0)`
- `public abstract java.util.Collection getHeaderNames()`
- `public abstract java.util.Collection getHeaders(java.lang.String p0)`
- `public abstract java.io.InputStream getInputStream() throws java.io.IOException`
- `public abstract java.lang.String getName()`
- `public abstract long getSize()`
- `public abstract java.lang.String getSubmittedFileName()`
- `public abstract void write(java.lang.String p0) throws java.io.IOException`

---

## public abstract interface `jakarta.servlet.http.PushBuilder`

**Methods:**
- `public abstract jakarta.servlet.http.PushBuilder addHeader(java.lang.String p0, java.lang.String p1)`
- `public abstract java.lang.String getHeader(java.lang.String p0)`
- `public abstract java.util.Set getHeaderNames()`
- `public abstract java.lang.String getMethod()`
- `public abstract java.lang.String getPath()`
- `public abstract java.lang.String getQueryString()`
- `public abstract java.lang.String getSessionId()`
- `public abstract jakarta.servlet.http.PushBuilder method(java.lang.String p0)`
- `public abstract jakarta.servlet.http.PushBuilder path(java.lang.String p0)`
- `public abstract void push()`
- `public abstract jakarta.servlet.http.PushBuilder queryString(java.lang.String p0)`
- `public abstract jakarta.servlet.http.PushBuilder removeHeader(java.lang.String p0)`
- `public abstract jakarta.servlet.http.PushBuilder sessionId(java.lang.String p0)`
- `public abstract jakarta.servlet.http.PushBuilder setHeader(java.lang.String p0, java.lang.String p1)`

---

## public abstract interface `jakarta.servlet.http.WebConnection`
implements `java.lang.AutoCloseable`  

**Methods:**
- `public abstract jakarta.servlet.ServletInputStream getInputStream() throws java.io.IOException`
- `public abstract jakarta.servlet.ServletOutputStream getOutputStream() throws java.io.IOException`

---

