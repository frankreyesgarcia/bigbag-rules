# API Specification: jakarta.interceptor:jakarta.interceptor-api 2.0.0

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public abstract interface `jakarta.interceptor.AroundConstruct`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.interceptor.AroundInvoke`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.interceptor.AroundTimeout`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.interceptor.ExcludeClassInterceptors`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.interceptor.ExcludeDefaultInterceptors`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.interceptor.Interceptor`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public static class `jakarta.interceptor.Interceptor$Priority`

**Fields:**
- `public final static int APPLICATION`
- `public final static int LIBRARY_AFTER`
- `public final static int LIBRARY_BEFORE`
- `public final static int PLATFORM_AFTER`
- `public final static int PLATFORM_BEFORE`

---

## public abstract interface `jakarta.interceptor.InterceptorBinding`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.interceptor.Interceptors`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.interceptor.InvocationContext`

**Methods:**
- `public abstract java.lang.reflect.Constructor getConstructor()`
- `public abstract java.util.Map getContextData()`
- `public abstract java.lang.reflect.Method getMethod()`
- `public abstract java.lang.Object[] getParameters()`
- `public abstract java.lang.Object getTarget()`
- `public abstract java.lang.Object getTimer()`
- `public abstract java.lang.Object proceed() throws java.lang.Exception`
- `public abstract void setParameters(java.lang.Object[] p0)`

---

