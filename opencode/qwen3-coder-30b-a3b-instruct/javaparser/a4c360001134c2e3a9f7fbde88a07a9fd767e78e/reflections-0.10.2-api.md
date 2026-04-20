# API Specification: org.reflections:reflections 0.10.2

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public abstract interface `org.reflections.Configuration`

**Methods:**
- `public abstract java.lang.ClassLoader[] getClassLoaders()`
- `public abstract java.util.function.Predicate getInputsFilter()`
- `public abstract java.util.Set getScanners()`
- `public abstract java.util.Set getUrls()`
- `public abstract boolean isParallel()`
- `public abstract boolean shouldExpandSuperTypes()`

---

## public abstract class `org.reflections.ReflectionUtils`
extends `org.reflections.util.ReflectionUtilsPredicates`  

**Constructors:**
- `public ReflectionUtils()`

**Fields:**
- `public final static org.reflections.util.UtilQueryBuilder AnnotationTypes`
- `public final static org.reflections.util.UtilQueryBuilder Annotations`
- `public final static org.reflections.util.UtilQueryBuilder Constructors`
- `public final static org.reflections.util.UtilQueryBuilder Fields`
- `public final static org.reflections.util.UtilQueryBuilder Interfaces`
- `public final static org.reflections.util.UtilQueryBuilder Methods`
- `public final static org.reflections.util.UtilQueryBuilder Resources`
- `public final static org.reflections.util.UtilQueryBuilder SuperClass`
- `public final static org.reflections.util.UtilQueryBuilder SuperTypes`
- `public final static java.util.function.Predicate notObjectMethod`

**Methods:**
- `public static <T extends java.lang.reflect.AnnotatedElement> org.reflections.util.UtilQueryBuilder extendType()`
- `public static <C extends java.lang.Object, T extends java.lang.Object> java.util.Set get(org.reflections.util.QueryFunction p0)`
- `public static <T extends java.lang.Object> java.util.Set get(org.reflections.util.QueryFunction p0, java.util.function.Predicate... p1)`
- `public static <T extends java.lang.reflect.AnnotatedElement> java.util.Set getAllAnnotations(T p0, java.util.function.Predicate... p1)`
- `public static java.util.Set getAllConstructors(java.lang.Class p0, java.util.function.Predicate... p1)`
- `public static java.util.Set getAllFields(java.lang.Class p0, java.util.function.Predicate... p1)`
- `public static java.util.Set getAllMethods(java.lang.Class p0, java.util.function.Predicate... p1)`
- `public static java.util.Set getAllSuperTypes(java.lang.Class p0, java.util.function.Predicate... p1)`
- `public static <T extends java.lang.reflect.AnnotatedElement> java.util.Set getAnnotations(T p0, java.util.function.Predicate... p1)`
- `public static java.util.Set getConstructors(java.lang.Class p0, java.util.function.Predicate... p1)`
- `public static java.util.Set getFields(java.lang.Class p0, java.util.function.Predicate... p1)`
- `public static java.util.Set getMethods(java.lang.Class p0, java.util.function.Predicate... p1)`
- `public static java.util.Set getSuperTypes(java.lang.Class p0)`
- `public static java.lang.Object invoke(java.lang.reflect.Method p0, java.lang.Object p1, java.lang.Object... p2)`
- `public static java.lang.annotation.Annotation toAnnotation(java.util.Map p0)`
- `public static <T extends java.lang.annotation.Annotation> T toAnnotation(java.util.Map p0, java.lang.Class p1)`
- `public static java.util.Map toMap(java.lang.annotation.Annotation p0)`
- `public static java.util.Map toMap(java.lang.annotation.Annotation p0, java.lang.reflect.AnnotatedElement p1)`

---

## public class `org.reflections.Reflections`
implements `org.reflections.util.NameHelper`  

**Constructors:**
- `protected Reflections()`
- `public Reflections(java.lang.Object... p0)`
- `public Reflections(java.lang.String p0, org.reflections.scanners.Scanner... p1)`
- `public Reflections(org.reflections.Configuration p0)`
- `public Reflections(org.reflections.Store p0)`

**Fields:**
- `protected final transient org.reflections.Configuration configuration`
- `public final static org.slf4j.Logger log`
- `protected final org.reflections.Store store`

**Methods:**
- `public static org.reflections.Reflections collect()`
- `public org.reflections.Reflections collect(java.io.File p0, org.reflections.serializers.Serializer p1)`
- `public org.reflections.Reflections collect(java.io.InputStream p0, org.reflections.serializers.Serializer p1)`
- `public static org.reflections.Reflections collect(java.lang.String p0, java.util.function.Predicate p1)`
- `public static org.reflections.Reflections collect(java.lang.String p0, java.util.function.Predicate p1, org.reflections.serializers.Serializer p2)`
- `public void expandSuperTypes(java.util.Map p0, java.util.Map p1)`
- `public <T extends java.lang.Object> java.util.Set get(org.reflections.util.QueryFunction p0)`
- `public java.util.Set getAll(org.reflections.scanners.Scanner p0)`
- `public java.util.Set getAllTypes()`
- `public org.reflections.Configuration getConfiguration()`
- `public java.util.Set getConstructorsAnnotatedWith(java.lang.Class p0)`
- `public java.util.Set getConstructorsAnnotatedWith(java.lang.annotation.Annotation p0)`
- `public java.util.Set getConstructorsWithParameter(java.lang.reflect.AnnotatedElement p0)`
- `public java.util.Set getConstructorsWithSignature(java.lang.Class... p0)`
- `public java.util.Set getFieldsAnnotatedWith(java.lang.Class p0)`
- `public java.util.Set getFieldsAnnotatedWith(java.lang.annotation.Annotation p0)`
- `public java.util.List getMemberParameterNames(java.lang.reflect.Member p0)`
- `public java.util.Collection getMemberUsage(java.lang.reflect.Member p0)`
- `public java.util.Set getMethodsAnnotatedWith(java.lang.Class p0)`
- `public java.util.Set getMethodsAnnotatedWith(java.lang.annotation.Annotation p0)`
- `public java.util.Set getMethodsReturn(java.lang.Class p0)`
- `public java.util.Set getMethodsWithParameter(java.lang.reflect.AnnotatedElement p0)`
- `public java.util.Set getMethodsWithSignature(java.lang.Class... p0)`
- `public java.util.Set getResources(java.lang.String p0)`
- `public java.util.Set getResources(java.util.regex.Pattern p0)`
- `public org.reflections.Store getStore()`
- `public <T extends java.lang.Object> java.util.Set getSubTypesOf(java.lang.Class p0)`
- `public java.util.Set getTypesAnnotatedWith(java.lang.Class p0)`
- `public java.util.Set getTypesAnnotatedWith(java.lang.Class p0, boolean p1)`
- `public java.util.Set getTypesAnnotatedWith(java.lang.annotation.Annotation p0)`
- `public java.util.Set getTypesAnnotatedWith(java.lang.annotation.Annotation p0, boolean p1)`
- `public org.reflections.Reflections merge(org.reflections.Reflections p0)`
- `public java.io.File save(java.lang.String p0)`
- `public java.io.File save(java.lang.String p0, org.reflections.serializers.Serializer p1)`
- `protected java.util.Map scan()`

---

## public class `org.reflections.ReflectionsException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public ReflectionsException(java.lang.String p0)`
- `public ReflectionsException(java.lang.String p0, java.lang.Throwable p1)`
- `public ReflectionsException(java.lang.Throwable p0)`

---

## public class `org.reflections.Store`
extends `java.util.HashMap`  

**Constructors:**
- `public Store()`
- `public Store(java.util.Map p0)`

---

## public class `org.reflections.scanners.FieldAnnotationsScanner`
annotations: @java.lang.Deprecated  
extends `org.reflections.scanners.AbstractScanner`  

**Constructors:**
- `public FieldAnnotationsScanner()`

---

## public class `org.reflections.scanners.MemberUsageScanner`
implements `org.reflections.scanners.Scanner`  

**Constructors:**
- `public MemberUsageScanner()`
- `public MemberUsageScanner(java.lang.ClassLoader[] p0)`

**Methods:**
- `public org.reflections.scanners.Scanner filterResultsBy(java.util.function.Predicate p0)`
- `public static java.lang.String parameterNames(javassist.bytecode.MethodInfo p0)`
- `public java.util.List scan(javassist.bytecode.ClassFile p0)`

---

## public class `org.reflections.scanners.MethodAnnotationsScanner`
annotations: @java.lang.Deprecated  
extends `org.reflections.scanners.AbstractScanner`  

**Constructors:**
- `public MethodAnnotationsScanner()`

---

## public class `org.reflections.scanners.MethodParameterNamesScanner`
implements `org.reflections.scanners.Scanner`  

**Constructors:**
- `public MethodParameterNamesScanner()`

**Methods:**
- `public java.util.List scan(javassist.bytecode.ClassFile p0)`

---

## public class `org.reflections.scanners.MethodParameterScanner`
annotations: @java.lang.Deprecated  
extends `org.reflections.scanners.AbstractScanner`  

**Constructors:**
- `public MethodParameterScanner()`

---

## public class `org.reflections.scanners.ResourcesScanner`
annotations: @java.lang.Deprecated  
extends `org.reflections.scanners.AbstractScanner`  

**Constructors:**
- `public ResourcesScanner()`

---

## public abstract interface `org.reflections.scanners.Scanner`

**Methods:**
- `public default boolean acceptsInput(java.lang.String p0)`
- `public default java.util.List entries(java.lang.String p0, java.lang.String p1)`
- `public default java.util.List entries(java.lang.String p0, java.util.Collection p1)`
- `public default java.util.List entries(java.util.Collection p0, java.lang.String p1)`
- `public default java.util.Map$Entry entry(java.lang.String p0, java.lang.String p1)`
- `public default java.lang.String index()`
- `public abstract java.util.List scan(javassist.bytecode.ClassFile p0)`
- `public default java.util.List scan(org.reflections.vfs.Vfs$File p0)`

---

## public abstract sealed enum `org.reflections.scanners.Scanners`
extends `java.lang.Enum`  
implements `org.reflections.scanners.Scanner`, `org.reflections.util.NameHelper`, `org.reflections.util.QueryBuilder`  

**Fields:**
- `public final static org.reflections.scanners.Scanners ConstructorsAnnotated`
- `public final static org.reflections.scanners.Scanners ConstructorsParameter`
- `public final static org.reflections.scanners.Scanners ConstructorsSignature`
- `public final static org.reflections.scanners.Scanners FieldsAnnotated`
- `public final static org.reflections.scanners.Scanners MethodsAnnotated`
- `public final static org.reflections.scanners.Scanners MethodsParameter`
- `public final static org.reflections.scanners.Scanners MethodsReturn`
- `public final static org.reflections.scanners.Scanners MethodsSignature`
- `public final static org.reflections.scanners.Scanners Resources`
- `public final static org.reflections.scanners.Scanners SubTypes`
- `public final static org.reflections.scanners.Scanners TypesAnnotated`

**Methods:**
- `public org.reflections.scanners.Scanners filterResultsBy(java.util.function.Predicate p0)`
- `public java.lang.String index()`
- `public final java.util.List scan(javassist.bytecode.ClassFile p0)`

---

## public class `org.reflections.scanners.SubTypesScanner`
annotations: @java.lang.Deprecated  
extends `org.reflections.scanners.AbstractScanner`  

**Constructors:**
- `public SubTypesScanner()`
- `public SubTypesScanner(boolean p0)`

**Methods:**
- `public java.util.List scan(javassist.bytecode.ClassFile p0)`

---

## public class `org.reflections.scanners.TypeAnnotationsScanner`
annotations: @java.lang.Deprecated  
extends `org.reflections.scanners.AbstractScanner`  

**Constructors:**
- `public TypeAnnotationsScanner()`

---

## public class `org.reflections.scanners.TypeElementsScanner`
implements `org.reflections.scanners.Scanner`  

**Constructors:**
- `public TypeElementsScanner()`

**Methods:**
- `public org.reflections.scanners.TypeElementsScanner filterResultsBy(java.util.function.Predicate p0)`
- `public org.reflections.scanners.TypeElementsScanner includeAnnotations()`
- `public org.reflections.scanners.TypeElementsScanner includeAnnotations(boolean p0)`
- `public org.reflections.scanners.TypeElementsScanner includeFields()`
- `public org.reflections.scanners.TypeElementsScanner includeFields(boolean p0)`
- `public org.reflections.scanners.TypeElementsScanner includeMethods()`
- `public org.reflections.scanners.TypeElementsScanner includeMethods(boolean p0)`
- `public org.reflections.scanners.TypeElementsScanner publicOnly()`
- `public org.reflections.scanners.TypeElementsScanner publicOnly(boolean p0)`
- `public java.util.List scan(javassist.bytecode.ClassFile p0)`

---

## public class `org.reflections.serializers.JavaCodeSerializer`
implements `org.reflections.serializers.Serializer`  

**Constructors:**
- `public JavaCodeSerializer()`

**Methods:**
- `protected void addAnnotations(java.util.List p0, java.util.List p1)`
- `protected void addClass(java.util.List p0, java.lang.String p1)`
- `protected void addFields(java.util.List p0, java.util.List p1)`
- `protected void addMethods(java.util.List p0, java.util.List p1, java.util.List p2)`
- `protected void addPackages(java.util.List p0, int p1)`
- `protected void indentClose(java.util.List p0)`
- `protected int indentOpen(java.util.List p0, java.util.List p1)`
- `public org.reflections.Reflections read(java.io.InputStream p0)`
- `public java.io.File save(org.reflections.Reflections p0, java.lang.String p1)`

---

## public class `org.reflections.serializers.JsonSerializer`
implements `org.reflections.serializers.Serializer`  

**Constructors:**
- `public JsonSerializer()`

**Methods:**
- `public org.reflections.Reflections read(java.io.InputStream p0)`
- `public java.io.File save(org.reflections.Reflections p0, java.lang.String p1)`

---

## public abstract interface `org.reflections.serializers.Serializer`

**Methods:**
- `public static java.io.File prepareFile(java.lang.String p0)`
- `public abstract org.reflections.Reflections read(java.io.InputStream p0)`
- `public abstract java.io.File save(org.reflections.Reflections p0, java.lang.String p1)`

---

## public class `org.reflections.serializers.XmlSerializer`
implements `org.reflections.serializers.Serializer`  

**Constructors:**
- `public XmlSerializer()`

**Methods:**
- `public org.reflections.Reflections read(java.io.InputStream p0)`
- `public java.io.File save(org.reflections.Reflections p0, java.lang.String p1)`

---

## public class `org.reflections.util.AnnotationMergeCollector`
implements `java.util.stream.Collector<java.lang.annotation.Annotation,java.util.Map<java.lang.String,java.lang.Object>,java.util.Map<java.lang.String,java.lang.Object>>`  

**Constructors:**
- `public AnnotationMergeCollector()`
- `public AnnotationMergeCollector(java.lang.reflect.AnnotatedElement p0)`
- `public AnnotationMergeCollector(java.lang.reflect.AnnotatedElement p0, java.util.function.BiFunction p1)`

**Methods:**
- `public java.util.function.BiConsumer accumulator()`
- `public java.util.Set characteristics()`
- `public java.util.function.BinaryOperator combiner()`
- `public java.util.function.Function finisher()`
- `public java.util.function.Supplier supplier()`

---

## public abstract class `org.reflections.util.ClasspathHelper`

**Constructors:**
- `public ClasspathHelper()`

**Methods:**
- `public static java.lang.ClassLoader[] classLoaders(java.lang.ClassLoader... p0)`
- `public static java.lang.String cleanPath(java.net.URL p0)`
- `public static java.lang.ClassLoader contextClassLoader()`
- `public static java.net.URL forClass(java.lang.Class p0, java.lang.ClassLoader... p1)`
- `public static java.util.Collection forClassLoader()`
- `public static java.util.Collection forClassLoader(java.lang.ClassLoader... p0)`
- `public static java.util.Collection forJavaClassPath()`
- `public static java.util.Collection forManifest()`
- `public static java.util.Collection forManifest(java.lang.Iterable p0)`
- `public static java.util.Collection forManifest(java.net.URL p0)`
- `public static java.util.Collection forPackage(java.lang.String p0, java.lang.ClassLoader... p1)`
- `public static java.util.Collection forResource(java.lang.String p0, java.lang.ClassLoader... p1)`
- `public static java.net.URL forWebInfClasses(javax.servlet.ServletContext p0)`
- `public static java.util.Collection forWebInfLib(javax.servlet.ServletContext p0)`
- `public static java.lang.ClassLoader staticClassLoader()`

---

## public class `org.reflections.util.ConfigurationBuilder`
implements `org.reflections.Configuration`  

**Constructors:**
- `public ConfigurationBuilder()`

**Fields:**
- `public final static java.util.function.Predicate DEFAULT_INPUTS_FILTER`
- `public final static java.util.Set DEFAULT_SCANNERS`

**Methods:**
- `public org.reflections.util.ConfigurationBuilder addClassLoaders(java.lang.ClassLoader... p0)`
- `public org.reflections.util.ConfigurationBuilder addScanners(org.reflections.scanners.Scanner... p0)`
- `public org.reflections.util.ConfigurationBuilder addUrls(java.net.URL... p0)`
- `public org.reflections.util.ConfigurationBuilder addUrls(java.util.Collection p0)`
- `public static org.reflections.util.ConfigurationBuilder build(java.lang.Object... p0)`
- `public org.reflections.util.ConfigurationBuilder filterInputsBy(java.util.function.Predicate p0)`
- `public org.reflections.util.ConfigurationBuilder forPackage(java.lang.String p0, java.lang.ClassLoader... p1)`
- `public org.reflections.util.ConfigurationBuilder forPackages(java.lang.String... p0)`
- `public java.lang.ClassLoader[] getClassLoaders()`
- `public java.util.function.Predicate getInputsFilter()`
- `public java.util.Set getScanners()`
- `public java.util.Set getUrls()`
- `public boolean isParallel()`
- `public org.reflections.util.ConfigurationBuilder setClassLoaders(java.lang.ClassLoader[] p0)`
- `public org.reflections.util.ConfigurationBuilder setExpandSuperTypes(boolean p0)`
- `public org.reflections.util.ConfigurationBuilder setInputsFilter(java.util.function.Predicate p0)`
- `public org.reflections.util.ConfigurationBuilder setParallel(boolean p0)`
- `public org.reflections.util.ConfigurationBuilder setScanners(org.reflections.scanners.Scanner... p0)`
- `public org.reflections.util.ConfigurationBuilder setUrls(java.net.URL... p0)`
- `public org.reflections.util.ConfigurationBuilder setUrls(java.util.Collection p0)`
- `public boolean shouldExpandSuperTypes()`

---

## public class `org.reflections.util.FilterBuilder`
implements `java.util.function.Predicate<java.lang.String>`  

**Constructors:**
- `public FilterBuilder()`

**Methods:**
- `public org.reflections.util.FilterBuilder add(java.util.function.Predicate p0)`
- `public boolean equals(java.lang.Object p0)`
- `public org.reflections.util.FilterBuilder exclude(java.lang.String p0)`
- `public org.reflections.util.FilterBuilder excludePackage(java.lang.String p0)`
- `public org.reflections.util.FilterBuilder excludePattern(java.lang.String p0)`
- `public int hashCode()`
- `public org.reflections.util.FilterBuilder include(java.lang.String p0)`
- `public org.reflections.util.FilterBuilder includePackage(java.lang.String p0)`
- `public org.reflections.util.FilterBuilder includePattern(java.lang.String p0)`
- `public static org.reflections.util.FilterBuilder parsePackages(java.lang.String p0)`
- `public boolean test(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public class `org.reflections.util.JavassistHelper`

**Constructors:**
- `public JavassistHelper()`

**Fields:**
- `public static boolean includeInvisibleTag`

**Methods:**
- `public static java.lang.String fieldName(javassist.bytecode.ClassFile p0, javassist.bytecode.FieldInfo p1)`
- `public static java.util.List getAnnotations(java.util.function.Function p0)`
- `public static java.util.stream.Stream getConstructors(javassist.bytecode.ClassFile p0)`
- `public static java.util.stream.Stream getMethods(javassist.bytecode.ClassFile p0)`
- `public static java.util.List getParameters(javassist.bytecode.MethodInfo p0)`
- `public static java.util.List getParametersAnnotations(javassist.bytecode.MethodInfo p0)`
- `public static java.lang.String getReturnType(javassist.bytecode.MethodInfo p0)`
- `public static boolean isPublic(java.lang.Object p0)`
- `public static java.lang.String methodName(javassist.bytecode.ClassFile p0, javassist.bytecode.MethodInfo p1)`

---

## public abstract interface `org.reflections.util.NameHelper`

**Fields:**
- `public final static java.util.List primitiveDescriptors`
- `public final static java.util.List primitiveNames`
- `public final static java.util.List primitiveTypes`

**Methods:**
- `public default java.lang.Class forClass(java.lang.String p0, java.lang.ClassLoader... p1)`
- `public default java.lang.reflect.Constructor forConstructor(java.lang.String p0, java.lang.ClassLoader... p1) throws org.reflections.ReflectionsException`
- `public default <T extends java.lang.reflect.AnnotatedElement> T forElement(java.lang.String p0, java.lang.Class p1, java.lang.ClassLoader[] p2)`
- `public default java.lang.reflect.Field forField(java.lang.String p0, java.lang.ClassLoader... p1)`
- `public default java.lang.reflect.Member forMember(java.lang.String p0, java.lang.ClassLoader... p1) throws org.reflections.ReflectionsException`
- `public default java.lang.reflect.Method forMethod(java.lang.String p0, java.lang.ClassLoader... p1) throws org.reflections.ReflectionsException`
- `public default <T extends java.lang.Object> T forName(java.lang.String p0, java.lang.Class p1, java.lang.ClassLoader... p2)`
- `public default <T extends java.lang.Object> java.util.Collection forNames(java.util.Collection p0, java.lang.Class p1, java.lang.ClassLoader... p2)`
- `public default java.util.Collection forNames(java.util.Collection p0, java.lang.ClassLoader... p1)`
- `public default java.lang.String toName(java.lang.Class p0)`
- `public default java.lang.String toName(java.lang.reflect.AnnotatedElement p0)`
- `public default java.lang.String toName(java.lang.reflect.Constructor p0)`
- `public default java.lang.String toName(java.lang.reflect.Field p0)`
- `public default java.lang.String toName(java.lang.reflect.Method p0)`
- `public default java.util.Collection toNames(java.lang.reflect.AnnotatedElement... p0)`
- `public default java.util.Collection toNames(java.util.Collection p0)`

---

## public abstract interface `org.reflections.util.QueryBuilder`
implements `org.reflections.util.NameHelper`  

**Methods:**
- `public default org.reflections.util.QueryFunction get(java.lang.String p0)`
- `public default org.reflections.util.QueryFunction get(java.lang.reflect.AnnotatedElement p0)`
- `public default org.reflections.util.QueryFunction get(java.util.Collection p0)`
- `public default org.reflections.util.QueryFunction getAll(java.util.Collection p0)`
- `public default org.reflections.util.QueryFunction getAllIncluding(java.lang.String p0)`
- `public default org.reflections.util.QueryFunction getAllIncluding(java.util.Collection p0)`
- `public default java.lang.String index()`
- `public default org.reflections.util.QueryFunction of(java.lang.String p0)`
- `public default org.reflections.util.QueryFunction of(java.lang.reflect.AnnotatedElement... p0)`
- `public default org.reflections.util.QueryFunction of(java.util.Collection p0)`
- `public default org.reflections.util.QueryFunction of(java.util.Set p0)`
- `public default <T extends java.lang.Object> org.reflections.util.QueryFunction of(org.reflections.util.QueryFunction p0)`
- `public default org.reflections.util.QueryFunction with(java.lang.String p0)`
- `public default org.reflections.util.QueryFunction with(java.lang.reflect.AnnotatedElement... p0)`
- `public default org.reflections.util.QueryFunction with(java.util.Collection p0)`
- `public default org.reflections.util.QueryFunction with(java.util.Set p0)`

---

## public abstract interface `org.reflections.util.QueryFunction`<C extends java.lang.Object, T extends java.lang.Object>
implements `java.util.function.Function<C,java.util.Set<T>>`, `org.reflections.util.NameHelper`  

**Methods:**
- `public default <R extends java.lang.Object> org.reflections.util.QueryFunction add(org.reflections.util.QueryFunction p0)`
- `public abstract java.util.Set apply(C p0)`
- `public default <R extends java.lang.Object> org.reflections.util.QueryFunction as()`
- `public default <R extends java.lang.Object> org.reflections.util.QueryFunction as(java.lang.Class p0, java.lang.ClassLoader... p1)`
- `public default <R extends java.lang.Object> org.reflections.util.QueryFunction asClass(java.lang.ClassLoader... p0)`
- `public default org.reflections.util.QueryFunction asString()`
- `public static <C extends java.lang.Object, T extends java.lang.Object> org.reflections.util.QueryFunction empty()`
- `public default org.reflections.util.QueryFunction filter(java.util.function.Predicate p0)`
- `public default <R extends java.lang.Object> org.reflections.util.QueryFunction flatMap(java.util.function.Function p0)`
- `public default <R extends java.lang.Object> org.reflections.util.QueryFunction getAll(java.util.function.Function p0, java.util.function.Function p1)`
- `public default org.reflections.util.QueryFunction getAll(java.util.function.Function p0)`
- `public default <R extends java.lang.Object> org.reflections.util.QueryFunction map(java.util.function.Function p0)`
- `public static <C extends java.lang.Object, T extends java.lang.Object> org.reflections.util.QueryFunction set(java.util.Collection p0)`
- `public static <C extends java.lang.Object, T extends java.lang.Object> org.reflections.util.QueryFunction single(T p0)`

---

## public class `org.reflections.util.ReflectionUtilsPredicates`

**Constructors:**
- `public ReflectionUtilsPredicates()`

**Methods:**
- `public static boolean isAssignable(java.lang.Class[] p0, java.lang.Class[] p1)`
- `public static <T extends java.lang.reflect.AnnotatedElement> java.util.function.Predicate withAnnotation(java.lang.Class p0)`
- `public static <T extends java.lang.reflect.AnnotatedElement> java.util.function.Predicate withAnnotation(java.lang.annotation.Annotation p0)`
- `public static <T extends java.lang.reflect.AnnotatedElement> java.util.function.Predicate withAnnotations(java.lang.Class... p0)`
- `public static <T extends java.lang.reflect.AnnotatedElement> java.util.function.Predicate withAnnotations(java.lang.annotation.Annotation... p0)`
- `public static java.util.function.Predicate withAnyParameterAnnotation(java.lang.Class p0)`
- `public static java.util.function.Predicate withAnyParameterAnnotation(java.lang.annotation.Annotation p0)`
- `public static java.util.function.Predicate withClassModifier(int p0)`
- `public static <T extends java.lang.reflect.Member> java.util.function.Predicate withInterface()`
- `public static <T extends java.lang.reflect.Member> java.util.function.Predicate withModifier(int p0)`
- `public static <T extends java.lang.reflect.Member> java.util.function.Predicate withName(java.lang.String p0)`
- `public static <T extends java.lang.Object> java.util.function.Predicate withNamePrefix(java.lang.String p0)`
- `public static java.util.function.Predicate withParameters(java.lang.Class... p0)`
- `public static java.util.function.Predicate withParametersAssignableFrom(java.lang.Class... p0)`
- `public static java.util.function.Predicate withParametersAssignableTo(java.lang.Class... p0)`
- `public static java.util.function.Predicate withParametersCount(int p0)`
- `public static <T extends java.lang.reflect.AnnotatedElement> java.util.function.Predicate withPattern(java.lang.String p0)`
- `public static <T extends java.lang.reflect.Member> java.util.function.Predicate withPrefix(java.lang.String p0)`
- `public static <T extends java.lang.reflect.Member> java.util.function.Predicate withPublic()`
- `public static <T extends java.lang.Object> java.util.function.Predicate withReturnType(java.lang.Class p0)`
- `public static <T extends java.lang.Object> java.util.function.Predicate withReturnTypeAssignableFrom(java.lang.Class p0)`
- `public static <T extends java.lang.reflect.Member> java.util.function.Predicate withStatic()`
- `public static <T extends java.lang.Object> java.util.function.Predicate withType(java.lang.Class p0)`
- `public static <T extends java.lang.Object> java.util.function.Predicate withTypeAssignableTo(java.lang.Class p0)`

---

## public abstract interface `org.reflections.util.UtilQueryBuilder`<F extends java.lang.Object, E extends java.lang.Object>

**Methods:**
- `public abstract org.reflections.util.QueryFunction get(F p0)`
- `public default org.reflections.util.QueryFunction of(F p0)`
- `public default org.reflections.util.QueryFunction of(F p0, java.util.function.Predicate p1)`
- `public default <T extends java.lang.Object> org.reflections.util.QueryFunction of(org.reflections.util.QueryFunction p0)`

---

## public class `org.reflections.vfs.JarInputDir`
implements `org.reflections.vfs.Vfs$Dir`  

**Constructors:**
- `public JarInputDir(java.net.URL p0)`

**Methods:**
- `public void close()`
- `public java.lang.Iterable getFiles()`
- `public java.lang.String getPath()`

---

## public class `org.reflections.vfs.JarInputFile`
implements `org.reflections.vfs.Vfs$File`  

**Constructors:**
- `public JarInputFile(java.util.zip.ZipEntry p0, org.reflections.vfs.JarInputDir p1, long p2, long p3)`

**Methods:**
- `public java.lang.String getName()`
- `public java.lang.String getRelativePath()`
- `public java.io.InputStream openInputStream()`

---

## public class `org.reflections.vfs.JbossDir`
implements `org.reflections.vfs.Vfs$Dir`  

**Methods:**
- `public static org.reflections.vfs.Vfs$Dir createDir(java.net.URL p0) throws java.lang.Exception`
- `public java.lang.Iterable getFiles()`
- `public java.lang.String getPath()`

---

## public class `org.reflections.vfs.JbossFile`
implements `org.reflections.vfs.Vfs$File`  

**Constructors:**
- `public JbossFile(org.reflections.vfs.JbossDir p0, org.jboss.vfs.VirtualFile p1)`

**Methods:**
- `public java.lang.String getName()`
- `public java.lang.String getRelativePath()`
- `public java.io.InputStream openInputStream() throws java.io.IOException`

---

## public class `org.reflections.vfs.SystemDir`
implements `org.reflections.vfs.Vfs$Dir`  

**Constructors:**
- `public SystemDir(java.io.File p0)`

**Methods:**
- `public java.lang.Iterable getFiles()`
- `public java.lang.String getPath()`

---

## public class `org.reflections.vfs.SystemFile`
implements `org.reflections.vfs.Vfs$File`  

**Constructors:**
- `public SystemFile(org.reflections.vfs.SystemDir p0, java.io.File p1)`

**Methods:**
- `public java.lang.String getName()`
- `public java.lang.String getRelativePath()`
- `public java.io.InputStream openInputStream()`
- `public java.lang.String toString()`

---

## public class `org.reflections.vfs.UrlTypeVFS`
implements `org.reflections.vfs.Vfs$UrlType`  

**Constructors:**
- `public UrlTypeVFS()`

**Fields:**
- `public final static java.lang.String[] REPLACE_EXTENSION`

**Methods:**
- `public java.net.URL adaptURL(java.net.URL p0) throws java.net.MalformedURLException`
- `public org.reflections.vfs.Vfs$Dir createDir(java.net.URL p0)`
- `public boolean matches(java.net.URL p0)`

---

## public abstract class `org.reflections.vfs.Vfs`

**Constructors:**
- `public Vfs()`

**Methods:**
- `public static void addDefaultURLTypes(org.reflections.vfs.Vfs$UrlType p0)`
- `public static java.lang.Iterable findFiles(java.util.Collection p0, java.lang.String p1, java.util.function.Predicate p2)`
- `public static java.lang.Iterable findFiles(java.util.Collection p0, java.util.function.Predicate p1)`
- `public static org.reflections.vfs.Vfs$Dir fromURL(java.net.URL p0)`
- `public static org.reflections.vfs.Vfs$Dir fromURL(java.net.URL p0, java.util.List p1)`
- `public static org.reflections.vfs.Vfs$Dir fromURL(java.net.URL p0, org.reflections.vfs.Vfs$UrlType... p1)`
- `public static java.util.List getDefaultUrlTypes()`
- `public static java.io.File getFile(java.net.URL p0)`
- `public static void setDefaultURLTypes(java.util.List p0)`

---

## public abstract sealed static enum `org.reflections.vfs.Vfs$DefaultUrlTypes`
extends `java.lang.Enum`  
implements `org.reflections.vfs.Vfs$UrlType`  

**Fields:**
- `public final static org.reflections.vfs.Vfs$DefaultUrlTypes bundle`
- `public final static org.reflections.vfs.Vfs$DefaultUrlTypes directory`
- `public final static org.reflections.vfs.Vfs$DefaultUrlTypes jarFile`
- `public final static org.reflections.vfs.Vfs$DefaultUrlTypes jarInputStream`
- `public final static org.reflections.vfs.Vfs$DefaultUrlTypes jarUrl`
- `public final static org.reflections.vfs.Vfs$DefaultUrlTypes jboss_vfs`
- `public final static org.reflections.vfs.Vfs$DefaultUrlTypes jboss_vfsfile`

---

## public abstract static interface `org.reflections.vfs.Vfs$Dir`

**Methods:**
- `public default void close()`
- `public abstract java.lang.Iterable getFiles()`
- `public abstract java.lang.String getPath()`

---

## public abstract static interface `org.reflections.vfs.Vfs$File`

**Methods:**
- `public abstract java.lang.String getName()`
- `public abstract java.lang.String getRelativePath()`
- `public abstract java.io.InputStream openInputStream() throws java.io.IOException`

---

## public abstract static interface `org.reflections.vfs.Vfs$UrlType`

**Methods:**
- `public abstract org.reflections.vfs.Vfs$Dir createDir(java.net.URL p0) throws java.lang.Exception`
- `public abstract boolean matches(java.net.URL p0) throws java.lang.Exception`

---

## public class `org.reflections.vfs.ZipDir`
implements `org.reflections.vfs.Vfs$Dir`  

**Constructors:**
- `public ZipDir(java.util.jar.JarFile p0)`

**Methods:**
- `public void close()`
- `public java.lang.Iterable getFiles()`
- `public java.lang.String getPath()`
- `public java.lang.String toString()`

---

## public class `org.reflections.vfs.ZipFile`
implements `org.reflections.vfs.Vfs$File`  

**Constructors:**
- `public ZipFile(org.reflections.vfs.ZipDir p0, java.util.zip.ZipEntry p1)`

**Methods:**
- `public java.lang.String getName()`
- `public java.lang.String getRelativePath()`
- `public java.io.InputStream openInputStream() throws java.io.IOException`
- `public java.lang.String toString()`

---

