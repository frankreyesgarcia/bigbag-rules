# API Specification: com.jcabi:jcabi-aspects 0.25.1

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public abstract interface `com.jcabi.aspects.Async`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.jcabi.aspects.Cacheable`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `com.jcabi.aspects.Cacheable$Flush`
annotations: @java.lang.Deprecated, @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `com.jcabi.aspects.Cacheable$FlushAfter`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `com.jcabi.aspects.Cacheable$FlushBefore`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public final class `com.jcabi.aspects.FakeValidationProvider`
implements `javax.validation.spi.ValidationProvider<com.jcabi.aspects.FakeValidationProvider$FakeConfiguration>`  

**Constructors:**
- `public FakeValidationProvider()`

**Methods:**
- `public javax.validation.ValidatorFactory buildValidatorFactory(javax.validation.spi.ConfigurationState p0)`
- `public javax.validation.Configuration createGenericConfiguration(javax.validation.spi.BootstrapState p0)`
- `public com.jcabi.aspects.FakeValidationProvider$FakeConfiguration createSpecializedConfiguration(javax.validation.spi.BootstrapState p0)`

---

## public abstract interface `com.jcabi.aspects.Immutable`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `com.jcabi.aspects.Immutable$Array`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.jcabi.aspects.LogExceptions`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.jcabi.aspects.Loggable`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

**Fields:**
- `public final static int DEBUG`
- `public final static int ERROR`
- `public final static int INFO`
- `public final static int TRACE`
- `public final static int WARN`

---

## public abstract static interface `com.jcabi.aspects.Loggable$Quiet`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.jcabi.aspects.Parallel`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.jcabi.aspects.Quietly`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.jcabi.aspects.RetryOnFailure`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.jcabi.aspects.ScheduleWithFixedDelay`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.jcabi.aspects.Timeable`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

**Fields:**
- `public final static int DEFAULT_LIMIT`

---

## public abstract interface `com.jcabi.aspects.UnitedThrow`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public static class `com.jcabi.aspects.UnitedThrow$None`
extends `java.lang.Throwable`  

**Constructors:**
- `public None()`

---

## public final class `com.jcabi.aspects.aj.ExceptionsLogger`
annotations: @com.jcabi.aspects.Immutable, @org.aspectj.lang.annotation.Aspect  

**Constructors:**
- `public ExceptionsLogger()`

**Methods:**
- `public static com.jcabi.aspects.aj.ExceptionsLogger aspectOf()`
- `public static boolean hasAspect()`
- `public java.lang.Object wrap(org.aspectj.lang.ProceedingJoinPoint p0) throws java.lang.Throwable`

---

## public final class `com.jcabi.aspects.aj.ImmutabilityChecker`
annotations: @org.aspectj.lang.annotation.Aspect  

**Constructors:**
- `public ImmutabilityChecker()`

**Methods:**
- `public void after(org.aspectj.lang.JoinPoint p0)`
- `public static com.jcabi.aspects.aj.ImmutabilityChecker aspectOf()`
- `public static boolean hasAspect()`

---

## public final class `com.jcabi.aspects.aj.MethodAsyncRunner`
annotations: @org.aspectj.lang.annotation.Aspect  

**Constructors:**
- `public MethodAsyncRunner()`

**Methods:**
- `public static com.jcabi.aspects.aj.MethodAsyncRunner aspectOf()`
- `public static boolean hasAspect()`
- `public java.lang.Object wrap(org.aspectj.lang.ProceedingJoinPoint p0)`

---

## public final class `com.jcabi.aspects.aj.MethodCacher`
annotations: @org.aspectj.lang.annotation.Aspect  

**Constructors:**
- `public MethodCacher()`

**Methods:**
- `public static com.jcabi.aspects.aj.MethodCacher aspectOf()`
- `public java.lang.Object cache(org.aspectj.lang.ProceedingJoinPoint p0) throws java.lang.Throwable`
- `public java.lang.Object flush(org.aspectj.lang.ProceedingJoinPoint p0) throws java.lang.Throwable`
- `public static boolean hasAspect()`
- `public void postflush(org.aspectj.lang.JoinPoint p0)`
- `public void preflush(org.aspectj.lang.JoinPoint p0)`

---

## public final class `com.jcabi.aspects.aj.MethodInterrupter`
annotations: @org.aspectj.lang.annotation.Aspect  

**Constructors:**
- `public MethodInterrupter()`

**Methods:**
- `public static com.jcabi.aspects.aj.MethodInterrupter aspectOf()`
- `public static boolean hasAspect()`
- `public java.lang.Object wrap(org.aspectj.lang.ProceedingJoinPoint p0) throws java.lang.Throwable`

---

## public final class `com.jcabi.aspects.aj.MethodLogger`
annotations: @org.aspectj.lang.annotation.Aspect  

**Constructors:**
- `public MethodLogger()`

**Methods:**
- `public static com.jcabi.aspects.aj.MethodLogger aspectOf()`
- `public static boolean hasAspect()`
- `public java.lang.Object wrapClass(org.aspectj.lang.ProceedingJoinPoint p0) throws java.lang.Throwable`
- `public java.lang.Object wrapMethod(org.aspectj.lang.ProceedingJoinPoint p0) throws java.lang.Throwable`

---

## public final class `com.jcabi.aspects.aj.MethodScheduler`
annotations: @org.aspectj.lang.annotation.Aspect  

**Constructors:**
- `public MethodScheduler()`

**Methods:**
- `public static com.jcabi.aspects.aj.MethodScheduler aspectOf()`
- `public void close(org.aspectj.lang.JoinPoint p0)`
- `public static boolean hasAspect()`
- `public void instantiate(org.aspectj.lang.JoinPoint p0)`

---

## public final class `com.jcabi.aspects.aj.MethodValidator`
annotations: @org.aspectj.lang.annotation.Aspect  

**Constructors:**
- `public MethodValidator()`

**Methods:**
- `public void after(org.aspectj.lang.JoinPoint p0, java.lang.Object p1)`
- `public static com.jcabi.aspects.aj.MethodValidator aspectOf()`
- `public void beforeCtor(org.aspectj.lang.JoinPoint p0)`
- `public void beforeMethod(org.aspectj.lang.JoinPoint p0)`
- `public static boolean hasAspect()`

---

## public final class `com.jcabi.aspects.aj.Parallelizer`
annotations: @com.jcabi.aspects.Immutable, @org.aspectj.lang.annotation.Aspect  

**Constructors:**
- `public Parallelizer()`

**Methods:**
- `public static com.jcabi.aspects.aj.Parallelizer aspectOf()`
- `public static boolean hasAspect()`
- `public java.lang.Object wrap(org.aspectj.lang.ProceedingJoinPoint p0) throws com.jcabi.aspects.aj.Parallelizer$ParallelException`

---

## public final class `com.jcabi.aspects.aj.QuietExceptionsLogger`
annotations: @com.jcabi.aspects.Immutable, @org.aspectj.lang.annotation.Aspect  

**Constructors:**
- `public QuietExceptionsLogger()`

**Methods:**
- `public static com.jcabi.aspects.aj.QuietExceptionsLogger aspectOf()`
- `public static boolean hasAspect()`
- `public java.lang.Object wrap(org.aspectj.lang.ProceedingJoinPoint p0)`

---

## public final class `com.jcabi.aspects.aj.Repeater`
annotations: @com.jcabi.aspects.Immutable, @org.aspectj.lang.annotation.Aspect  

**Constructors:**
- `public Repeater()`

**Methods:**
- `public static com.jcabi.aspects.aj.Repeater aspectOf()`
- `public static boolean hasAspect()`
- `public java.lang.Object wrap(org.aspectj.lang.ProceedingJoinPoint p0) throws java.lang.Throwable`

---

## public final class `com.jcabi.aspects.aj.SingleException`
annotations: @com.jcabi.aspects.Immutable, @org.aspectj.lang.annotation.Aspect  

**Constructors:**
- `public SingleException()`

**Methods:**
- `public static com.jcabi.aspects.aj.SingleException aspectOf()`
- `public static boolean hasAspect()`
- `public java.lang.Object wrap(org.aspectj.lang.ProceedingJoinPoint p0) throws java.lang.Throwable`

---

## public final class `com.jcabi.aspects.apt.AsyncReturnTypeProcessor`
annotations: @javax.annotation.processing.SupportedAnnotationTypes, @javax.annotation.processing.SupportedSourceVersion  
extends `javax.annotation.processing.AbstractProcessor`  

**Constructors:**
- `public AsyncReturnTypeProcessor()`

**Methods:**
- `public boolean process(java.util.Set p0, javax.annotation.processing.RoundEnvironment p1)`

---

## public final class `com.jcabi.aspects.apt.QuietlyReturnTypeProcessor`
annotations: @javax.annotation.processing.SupportedAnnotationTypes, @javax.annotation.processing.SupportedSourceVersion  
extends `javax.annotation.processing.AbstractProcessor`  

**Constructors:**
- `public QuietlyReturnTypeProcessor()`

**Methods:**
- `public boolean process(java.util.Set p0, javax.annotation.processing.RoundEnvironment p1)`

---

## public final enum `com.jcabi.aspects.version.Version`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.jcabi.aspects.version.Version CURRENT`

**Methods:**
- `public java.lang.String buildNumber()`
- `public java.lang.String projectVersion()`

---

