# API Specification: jakarta.mvc:jakarta.mvc-api 2.0.1

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public abstract interface `jakarta.mvc.Controller`
annotations: @jakarta.ws.rs.NameBinding, @java.lang.annotation.Documented, @java.lang.annotation.Inherited, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.mvc.Models`
implements `java.lang.Iterable<java.lang.String>`  

**Methods:**
- `public abstract java.util.Map asMap()`
- `public abstract java.lang.Object get(java.lang.String p0)`
- `public abstract <T extends java.lang.Object> T get(java.lang.String p0, java.lang.Class p1)`
- `public abstract jakarta.mvc.Models put(java.lang.String p0, java.lang.Object p1)`

---

## public abstract interface `jakarta.mvc.MvcContext`

**Methods:**
- `public abstract java.lang.String getBasePath()`
- `public abstract jakarta.ws.rs.core.Configuration getConfig()`
- `public abstract jakarta.mvc.security.Csrf getCsrf()`
- `public abstract jakarta.mvc.security.Encoders getEncoders()`
- `public abstract java.util.Locale getLocale()`
- `public abstract java.net.URI uri(java.lang.String p0)`
- `public abstract java.net.URI uri(java.lang.String p0, java.util.Map p1)`
- `public abstract jakarta.ws.rs.core.UriBuilder uriBuilder(java.lang.String p0)`

---

## public abstract interface `jakarta.mvc.RedirectScoped`
annotations: @jakarta.enterprise.context.NormalScope, @java.lang.annotation.Documented, @java.lang.annotation.Inherited, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.mvc.UriRef`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.mvc.View`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Inherited, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.mvc.binding.BindingError`
implements `jakarta.mvc.binding.ParamError`  

**Methods:**
- `public abstract java.lang.String getSubmittedValue()`

---

## public abstract interface `jakarta.mvc.binding.BindingResult`

**Methods:**
- `public abstract java.util.Set getAllErrors()`
- `public abstract java.util.List getAllMessages()`
- `public abstract java.util.Set getErrors(java.lang.String p0)`
- `public abstract boolean isFailed()`

---

## public abstract interface `jakarta.mvc.binding.MvcBinding`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.mvc.binding.ParamError`

**Methods:**
- `public abstract java.lang.String getMessage()`
- `public abstract java.lang.String getParamName()`

---

## public abstract interface `jakarta.mvc.binding.ValidationError`
implements `jakarta.mvc.binding.ParamError`  

**Methods:**
- `public abstract jakarta.validation.ConstraintViolation getViolation()`

---

## public abstract interface `jakarta.mvc.engine.ViewEngine`

**Fields:**
- `public final static java.lang.String DEFAULT_VIEW_FOLDER`
- `public final static int PRIORITY_APPLICATION`
- `public final static int PRIORITY_BUILTIN`
- `public final static int PRIORITY_FRAMEWORK`
- `public final static java.lang.String VIEW_FOLDER`

**Methods:**
- `public abstract void processView(jakarta.mvc.engine.ViewEngineContext p0) throws jakarta.mvc.engine.ViewEngineException`
- `public abstract boolean supports(java.lang.String p0)`

---

## public abstract interface `jakarta.mvc.engine.ViewEngineContext`

**Methods:**
- `public abstract jakarta.ws.rs.core.Configuration getConfiguration()`
- `public abstract java.util.Locale getLocale()`
- `public abstract jakarta.ws.rs.core.MediaType getMediaType()`
- `public abstract jakarta.mvc.Models getModels()`
- `public abstract java.io.OutputStream getOutputStream()`
- `public abstract <T extends java.lang.Object> T getRequest(java.lang.Class p0)`
- `public abstract jakarta.ws.rs.container.ResourceInfo getResourceInfo()`
- `public abstract <T extends java.lang.Object> T getResponse(java.lang.Class p0)`
- `public abstract jakarta.ws.rs.core.MultivaluedMap getResponseHeaders()`
- `public abstract jakarta.ws.rs.core.UriInfo getUriInfo()`
- `public abstract java.lang.String getView()`

---

## public class `jakarta.mvc.engine.ViewEngineException`
extends `java.lang.Exception`  

**Constructors:**
- `public ViewEngineException(java.lang.String p0)`
- `public ViewEngineException(java.lang.String p0, java.lang.Throwable p1)`
- `public ViewEngineException(java.lang.Throwable p0)`

---

## public abstract interface `jakarta.mvc.event.AfterControllerEvent`
implements `jakarta.mvc.event.MvcEvent`  

**Methods:**
- `public abstract jakarta.ws.rs.container.ResourceInfo getResourceInfo()`
- `public abstract jakarta.ws.rs.core.UriInfo getUriInfo()`

---

## public abstract interface `jakarta.mvc.event.AfterProcessViewEvent`
implements `jakarta.mvc.event.MvcEvent`  

**Methods:**
- `public abstract java.lang.Class getEngine()`
- `public abstract java.lang.String getView()`

---

## public abstract interface `jakarta.mvc.event.BeforeControllerEvent`
implements `jakarta.mvc.event.MvcEvent`  

**Methods:**
- `public abstract jakarta.ws.rs.container.ResourceInfo getResourceInfo()`
- `public abstract jakarta.ws.rs.core.UriInfo getUriInfo()`

---

## public abstract interface `jakarta.mvc.event.BeforeProcessViewEvent`
implements `jakarta.mvc.event.MvcEvent`  

**Methods:**
- `public abstract java.lang.Class getEngine()`
- `public abstract java.lang.String getView()`

---

## public abstract interface `jakarta.mvc.event.ControllerRedirectEvent`
implements `jakarta.mvc.event.MvcEvent`  

**Methods:**
- `public abstract java.net.URI getLocation()`
- `public abstract jakarta.ws.rs.container.ResourceInfo getResourceInfo()`
- `public abstract jakarta.ws.rs.core.UriInfo getUriInfo()`

---

## public abstract interface `jakarta.mvc.event.MvcEvent`

---

## public abstract interface `jakarta.mvc.locale.LocaleResolver`

**Methods:**
- `public abstract java.util.Locale resolveLocale(jakarta.mvc.locale.LocaleResolverContext p0)`

---

## public abstract interface `jakarta.mvc.locale.LocaleResolverContext`

**Methods:**
- `public abstract java.util.List getAcceptableLanguages()`
- `public abstract jakarta.ws.rs.core.Configuration getConfiguration()`
- `public abstract jakarta.ws.rs.core.Cookie getCookie(java.lang.String p0)`
- `public abstract java.lang.String getHeaderString(java.lang.String p0)`
- `public abstract jakarta.ws.rs.core.Request getRequest()`
- `public abstract jakarta.ws.rs.core.UriInfo getUriInfo()`

---

## public abstract interface `jakarta.mvc.security.Csrf`

**Fields:**
- `public final static java.lang.String CSRF_HEADER_NAME`
- `public final static java.lang.String CSRF_PROTECTION`
- `public final static java.lang.String DEFAULT_CSRF_HEADER_NAME`

**Methods:**
- `public abstract java.lang.String getName()`
- `public abstract java.lang.String getToken()`

---

## public final static enum `jakarta.mvc.security.Csrf$CsrfOptions`
extends `java.lang.Enum`  

**Fields:**
- `public final static jakarta.mvc.security.Csrf$CsrfOptions EXPLICIT`
- `public final static jakarta.mvc.security.Csrf$CsrfOptions IMPLICIT`
- `public final static jakarta.mvc.security.Csrf$CsrfOptions OFF`

---

## public abstract interface `jakarta.mvc.security.CsrfProtected`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Inherited, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public class `jakarta.mvc.security.CsrfValidationException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public CsrfValidationException(java.lang.String p0)`

---

## public abstract interface `jakarta.mvc.security.Encoders`

**Methods:**
- `public abstract java.lang.String html(java.lang.String p0)`
- `public abstract java.lang.String js(java.lang.String p0)`

---

