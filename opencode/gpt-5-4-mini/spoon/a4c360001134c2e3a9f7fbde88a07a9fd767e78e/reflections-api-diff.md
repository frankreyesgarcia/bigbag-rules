# Breaking Changes: org.reflections:reflections 0.9.9 → 0.10.2
Total: 247 (binary-breaking: 219, source-breaking: 226)

## org.reflections.Configuration

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Configuration.getExecutorService()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Configuration.getMetadataAdapter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Configuration.getSerializer()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.reflections.Configuration.getInputsFilter()`
+ NEW RETURN TYPE: `org.reflections.Configuration.getInputsFilter()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.reflections.Configuration.getInputsFilter()`
+ NEW RETURN TYPE: `org.reflections.Configuration.getInputsFilter()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.reflections.Configuration`
+ MUST NOW IMPLEMENT: `org.reflections.Configuration.shouldExpandSuperTypes()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.reflections.Configuration`
+ MUST NOW IMPLEMENT: `org.reflections.Configuration.isParallel()`

## org.reflections.ReflectionUtils

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.reflections.ReflectionUtils.includeObject`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.ReflectionUtils.forName(java.lang.String,java.lang.ClassLoader[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.ReflectionUtils.forNames(java.lang.Iterable<java.lang.String>,java.lang.ClassLoader[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.ReflectionUtils.getAll(java.util.Set<T>,com.google.common.base.Predicate<? super T>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.ReflectionUtils.getAllAnnotations(T,com.google.common.base.Predicate<java.lang.annotation.Annotation>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.ReflectionUtils.getAllConstructors(java.lang.Class<? extends java.lang.Object>,com.google.common.base.Predicate<? super java.lang.reflect.Constructor>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.ReflectionUtils.getAllFields(java.lang.Class<? extends java.lang.Object>,com.google.common.base.Predicate<? super java.lang.reflect.Field>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.ReflectionUtils.getAllMethods(java.lang.Class<? extends java.lang.Object>,com.google.common.base.Predicate<? super java.lang.reflect.Method>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.ReflectionUtils.getAllSuperTypes(java.lang.Class<? extends java.lang.Object>,com.google.common.base.Predicate<? super java.lang.Class<? extends java.lang.Object>>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.ReflectionUtils.getAnnotations(T,com.google.common.base.Predicate<java.lang.annotation.Annotation>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.ReflectionUtils.getConstructors(java.lang.Class<? extends java.lang.Object>,com.google.common.base.Predicate<? super java.lang.reflect.Constructor>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.ReflectionUtils.getFields(java.lang.Class<? extends java.lang.Object>,com.google.common.base.Predicate<? super java.lang.reflect.Field>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.ReflectionUtils.getMethods(java.lang.Class<? extends java.lang.Object>,com.google.common.base.Predicate<? super java.lang.reflect.Method>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.ReflectionUtils.withReturnTypeAssignableTo(java.lang.Class<T>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.reflections.ReflectionUtils.withAnnotation(java.lang.Class<? extends java.lang.annotation.Annotation>)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withAnnotation(java.lang.Class<? extends java.lang.annotation.Annotation>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.reflections.ReflectionUtils.withAnnotation(java.lang.annotation.Annotation)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withAnnotation(java.lang.annotation.Annotation)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.reflections.ReflectionUtils.withAnnotations(java.lang.Class<? extends java.lang.annotation.Annotation>[])`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withAnnotations(java.lang.Class<? extends java.lang.annotation.Annotation>[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.reflections.ReflectionUtils.withAnnotations(java.lang.annotation.Annotation[])`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withAnnotations(java.lang.annotation.Annotation[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.reflections.ReflectionUtils.withAnyParameterAnnotation(java.lang.Class<? extends java.lang.annotation.Annotation>)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withAnyParameterAnnotation(java.lang.Class<? extends java.lang.annotation.Annotation>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.reflections.ReflectionUtils.withAnyParameterAnnotation(java.lang.annotation.Annotation)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withAnyParameterAnnotation(java.lang.annotation.Annotation)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.reflections.ReflectionUtils.withClassModifier(int)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withClassModifier(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.reflections.ReflectionUtils.withModifier(int)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withModifier(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.reflections.ReflectionUtils.withName(java.lang.String)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withName(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.reflections.ReflectionUtils.withParameters(java.lang.Class<? extends java.lang.Object>[])`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withParameters(java.lang.Class<? extends java.lang.Object>[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.reflections.ReflectionUtils.withParametersAssignableTo(java.lang.Class[])`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withParametersAssignableTo(java.lang.Class[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.reflections.ReflectionUtils.withParametersCount(int)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withParametersCount(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.reflections.ReflectionUtils.withPattern(java.lang.String)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withPattern(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.reflections.ReflectionUtils.withPrefix(java.lang.String)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withPrefix(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.reflections.ReflectionUtils.withReturnType(java.lang.Class<T>)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withReturnType(java.lang.Class<T>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.reflections.ReflectionUtils.withType(java.lang.Class<T>)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withType(java.lang.Class<T>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.reflections.ReflectionUtils.withTypeAssignableTo(java.lang.Class<T>)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withTypeAssignableTo(java.lang.Class<T>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.reflections.ReflectionUtils.withAnnotation(java.lang.Class<? extends java.lang.annotation.Annotation>)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withAnnotation(java.lang.Class<? extends java.lang.annotation.Annotation>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.reflections.ReflectionUtils.withAnnotation(java.lang.annotation.Annotation)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withAnnotation(java.lang.annotation.Annotation)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.reflections.ReflectionUtils.withAnnotations(java.lang.Class<? extends java.lang.annotation.Annotation>[])`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withAnnotations(java.lang.Class<? extends java.lang.annotation.Annotation>[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.reflections.ReflectionUtils.withAnnotations(java.lang.annotation.Annotation[])`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withAnnotations(java.lang.annotation.Annotation[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.reflections.ReflectionUtils.withAnyParameterAnnotation(java.lang.Class<? extends java.lang.annotation.Annotation>)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withAnyParameterAnnotation(java.lang.Class<? extends java.lang.annotation.Annotation>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.reflections.ReflectionUtils.withAnyParameterAnnotation(java.lang.annotation.Annotation)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withAnyParameterAnnotation(java.lang.annotation.Annotation)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.reflections.ReflectionUtils.withClassModifier(int)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withClassModifier(int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.reflections.ReflectionUtils.withModifier(int)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withModifier(int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.reflections.ReflectionUtils.withName(java.lang.String)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withName(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.reflections.ReflectionUtils.withParameters(java.lang.Class<? extends java.lang.Object>[])`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withParameters(java.lang.Class<? extends java.lang.Object>[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.reflections.ReflectionUtils.withParametersAssignableTo(java.lang.Class[])`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withParametersAssignableTo(java.lang.Class[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.reflections.ReflectionUtils.withParametersCount(int)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withParametersCount(int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.reflections.ReflectionUtils.withPattern(java.lang.String)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withPattern(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.reflections.ReflectionUtils.withPrefix(java.lang.String)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withPrefix(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.reflections.ReflectionUtils.withReturnType(java.lang.Class<T>)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withReturnType(java.lang.Class<T>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.reflections.ReflectionUtils.withType(java.lang.Class<T>)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withType(java.lang.Class<T>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.reflections.ReflectionUtils.withTypeAssignableTo(java.lang.Class<T>)`
+ NEW RETURN TYPE: `org.reflections.util.ReflectionUtilsPredicates.withTypeAssignableTo(java.lang.Class<T>)`

## org.reflections.Reflections

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.reflections.Reflections.log`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.reflections.Reflections.store`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.reflections.Reflections.getMethodsReturn(java.lang.Class)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Reflections.collect(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Reflections.collect(java.io.InputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Reflections.collect(java.lang.String,com.google.common.base.Predicate<java.lang.String>,org.reflections.serializers.Serializer[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Reflections.getAllAnnotated(java.lang.Iterable<java.lang.String>,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Reflections.getConstructorParamNames(java.lang.reflect.Constructor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Reflections.getConstructorUsage(java.lang.reflect.Constructor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Reflections.getConstructorsMatchParams(java.lang.Class<? extends java.lang.Object>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Reflections.getConstructorsWithAnyParamAnnotated(java.lang.Class<? extends java.lang.annotation.Annotation>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Reflections.getConstructorsWithAnyParamAnnotated(java.lang.annotation.Annotation)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Reflections.getFieldUsage(java.lang.reflect.Field)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Reflections.getMethodParamNames(java.lang.reflect.Method)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Reflections.getMethodUsage(java.lang.reflect.Method)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Reflections.getMethodsMatchParams(java.lang.Class<? extends java.lang.Object>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Reflections.getMethodsWithAnyParamAnnotated(java.lang.Class<? extends java.lang.annotation.Annotation>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Reflections.getMethodsWithAnyParamAnnotated(java.lang.annotation.Annotation)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Reflections.getResources(com.google.common.base.Predicate<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Reflections.scan(java.net.URL)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.reflections.Reflections.scan()`
+ NEW RETURN TYPE: `org.reflections.Reflections.scan()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.reflections.Reflections.scan()`
+ NEW RETURN TYPE: `org.reflections.Reflections.scan()`

## org.reflections.Store

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.reflections.Store.<init>(org.reflections.Configuration)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Store.get(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Store.get(java.lang.String,java.lang.Iterable<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Store.get(java.lang.String,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Store.getAll(java.lang.String,java.lang.Iterable<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Store.getAll(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.Store.getOrCreate(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.reflections.Store.keySet()`
+ NEW RETURN TYPE: `java.util.HashMap.keySet()`

## org.reflections.adapters.JavaReflectionAdapter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.reflections.adapters.JavaReflectionAdapter`

## org.reflections.adapters.JavassistAdapter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.reflections.adapters.JavassistAdapter`

## org.reflections.adapters.MetadataAdapter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.reflections.adapters.MetadataAdapter`

## org.reflections.scanners.AbstractScanner

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.reflections.scanners.AbstractScanner`

## org.reflections.scanners.FieldAnnotationsScanner

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.acceptResult(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.filterResultsBy(com.google.common.base.Predicate<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getConfiguration()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getMetadataAdapter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getResultFilter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getStore()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.scan(org.reflections.vfs.Vfs$File,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setConfiguration(org.reflections.Configuration)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setResultFilter(com.google.common.base.Predicate<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setStore(com.google.common.collect.Multimap<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.FieldAnnotationsScanner.scan(java.lang.Object)`

## org.reflections.scanners.MemberUsageScanner

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.acceptResult(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.filterResultsBy(com.google.common.base.Predicate<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getConfiguration()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getMetadataAdapter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getResultFilter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getStore()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.scan(org.reflections.vfs.Vfs$File,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setConfiguration(org.reflections.Configuration)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setResultFilter(com.google.common.base.Predicate<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setStore(com.google.common.collect.Multimap<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.MemberUsageScanner.scan(java.lang.Object)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.reflections.scanners.MemberUsageScanner`

## org.reflections.scanners.MethodAnnotationsScanner

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.acceptResult(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.filterResultsBy(com.google.common.base.Predicate<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getConfiguration()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getMetadataAdapter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getResultFilter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getStore()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.scan(org.reflections.vfs.Vfs$File,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setConfiguration(org.reflections.Configuration)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setResultFilter(com.google.common.base.Predicate<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setStore(com.google.common.collect.Multimap<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.MethodAnnotationsScanner.scan(java.lang.Object)`

## org.reflections.scanners.MethodParameterNamesScanner

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.acceptResult(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.filterResultsBy(com.google.common.base.Predicate<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getConfiguration()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getMetadataAdapter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getResultFilter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getStore()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.scan(org.reflections.vfs.Vfs$File,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setConfiguration(org.reflections.Configuration)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setResultFilter(com.google.common.base.Predicate<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setStore(com.google.common.collect.Multimap<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.MethodParameterNamesScanner.scan(java.lang.Object)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.reflections.scanners.MethodParameterNamesScanner`

## org.reflections.scanners.MethodParameterScanner

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.acceptResult(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.filterResultsBy(com.google.common.base.Predicate<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getConfiguration()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getMetadataAdapter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getResultFilter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getStore()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.scan(org.reflections.vfs.Vfs$File,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setConfiguration(org.reflections.Configuration)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setResultFilter(com.google.common.base.Predicate<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setStore(com.google.common.collect.Multimap<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.MethodParameterScanner.scan(java.lang.Object)`

## org.reflections.scanners.ResourcesScanner

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.acceptResult(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.filterResultsBy(com.google.common.base.Predicate<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getConfiguration()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getMetadataAdapter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getResultFilter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getStore()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setConfiguration(org.reflections.Configuration)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setResultFilter(com.google.common.base.Predicate<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setStore(com.google.common.collect.Multimap<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.ResourcesScanner.scan(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.ResourcesScanner.scan(org.reflections.vfs.Vfs$File,java.lang.Object)`

## org.reflections.scanners.Scanner

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.Scanner.acceptResult(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.Scanner.filterResultsBy(com.google.common.base.Predicate<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.Scanner.getStore()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.Scanner.scan(org.reflections.vfs.Vfs$File,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.Scanner.setConfiguration(org.reflections.Configuration)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.Scanner.setStore(com.google.common.collect.Multimap<java.lang.String,java.lang.String>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.reflections.scanners.Scanner`
+ MUST NOW IMPLEMENT: `org.reflections.scanners.Scanner.scan(javassist.bytecode.ClassFile)`

## org.reflections.scanners.SubTypesScanner

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.acceptResult(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.filterResultsBy(com.google.common.base.Predicate<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getConfiguration()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getMetadataAdapter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getResultFilter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getStore()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.scan(org.reflections.vfs.Vfs$File,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setConfiguration(org.reflections.Configuration)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setResultFilter(com.google.common.base.Predicate<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setStore(com.google.common.collect.Multimap<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.SubTypesScanner.scan(java.lang.Object)`

## org.reflections.scanners.TypeAnnotationsScanner

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.acceptResult(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.filterResultsBy(com.google.common.base.Predicate<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getConfiguration()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getMetadataAdapter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getResultFilter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getStore()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.scan(org.reflections.vfs.Vfs$File,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setConfiguration(org.reflections.Configuration)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setResultFilter(com.google.common.base.Predicate<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setStore(com.google.common.collect.Multimap<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.TypeAnnotationsScanner.scan(java.lang.Object)`

## org.reflections.scanners.TypeElementsScanner

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.acceptResult(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.filterResultsBy(com.google.common.base.Predicate<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getConfiguration()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getMetadataAdapter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getResultFilter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.getStore()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.scan(org.reflections.vfs.Vfs$File,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setConfiguration(org.reflections.Configuration)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setResultFilter(com.google.common.base.Predicate<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.AbstractScanner.setStore(com.google.common.collect.Multimap<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.scanners.TypeElementsScanner.scan(java.lang.Object)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.reflections.scanners.TypeElementsScanner`

## org.reflections.scanners.TypesScanner

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.reflections.scanners.TypesScanner`

## org.reflections.serializers.JavaCodeSerializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.serializers.JavaCodeSerializer.resolveAnnotation(java.lang.Class)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.serializers.JavaCodeSerializer.resolveClass(java.lang.Class)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.serializers.JavaCodeSerializer.resolveClassOf(java.lang.Class)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.serializers.JavaCodeSerializer.resolveField(java.lang.Class)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.serializers.JavaCodeSerializer.resolveMethod(java.lang.Class)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.serializers.JavaCodeSerializer.toString(org.reflections.Reflections)`

## org.reflections.serializers.JavaCodeSerializer1

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.reflections.serializers.JavaCodeSerializer1`

## org.reflections.serializers.JavassistSerializer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.reflections.serializers.JavassistSerializer`

## org.reflections.serializers.JsonSerializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.serializers.JsonSerializer.toString(org.reflections.Reflections)`

## org.reflections.serializers.Serializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.serializers.Serializer.toString(org.reflections.Reflections)`

## org.reflections.serializers.XmlSerializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.serializers.XmlSerializer.toString(org.reflections.Reflections)`

## org.reflections.util.ConfigurationBuilder

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.reflections.util.ConfigurationBuilder.metadataAdapter`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.util.ConfigurationBuilder.addClassLoader(java.lang.ClassLoader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.util.ConfigurationBuilder.addClassLoaders(java.util.Collection<java.lang.ClassLoader>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.util.ConfigurationBuilder.filterInputsBy(com.google.common.base.Predicate<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.util.ConfigurationBuilder.getExecutorService()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.util.ConfigurationBuilder.getMetadataAdapter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.util.ConfigurationBuilder.getSerializer()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.util.ConfigurationBuilder.setExecutorService(java.util.concurrent.ExecutorService)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.util.ConfigurationBuilder.setInputsFilter(com.google.common.base.Predicate<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.util.ConfigurationBuilder.setMetadataAdapter(org.reflections.adapters.MetadataAdapter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.util.ConfigurationBuilder.setSerializer(org.reflections.serializers.Serializer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.util.ConfigurationBuilder.useParallelExecutor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.util.ConfigurationBuilder.useParallelExecutor(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.reflections.util.ConfigurationBuilder.getInputsFilter()`
+ NEW RETURN TYPE: `org.reflections.util.ConfigurationBuilder.getInputsFilter()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.reflections.util.ConfigurationBuilder.setClassLoaders(java.lang.ClassLoader[])`
+ NEW RETURN TYPE: `org.reflections.util.ConfigurationBuilder.setClassLoaders(java.lang.ClassLoader[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.reflections.util.ConfigurationBuilder.getInputsFilter()`
+ NEW RETURN TYPE: `org.reflections.util.ConfigurationBuilder.getInputsFilter()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.reflections.util.ConfigurationBuilder.setClassLoaders(java.lang.ClassLoader[])`
+ NEW RETURN TYPE: `org.reflections.util.ConfigurationBuilder.setClassLoaders(java.lang.ClassLoader[])`

## org.reflections.util.FilterBuilder

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.util.FilterBuilder.add(com.google.common.base.Predicate<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.util.FilterBuilder.apply(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.util.FilterBuilder.excludePackage(java.lang.Class<? extends java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.util.FilterBuilder.includePackage(java.lang.Class<? extends java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.util.FilterBuilder.includePackage(java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.util.FilterBuilder.parse(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.util.FilterBuilder.prefix(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.reflections.util.FilterBuilder`
+ MUST NOW IMPLEMENT: `java.util.function.Predicate.test(T)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.reflections.util.FilterBuilder`

## org.reflections.util.FilterBuilder$Exclude

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.reflections.util.FilterBuilder$Exclude`

## org.reflections.util.FilterBuilder$Include

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.reflections.util.FilterBuilder$Include`

## org.reflections.util.FilterBuilder$Matcher

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.reflections.util.FilterBuilder$Matcher`

## org.reflections.util.Utils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.reflections.util.Utils`

## org.reflections.vfs.CommonsVfs2UrlType

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.reflections.vfs.CommonsVfs2UrlType`

## org.reflections.vfs.CommonsVfs2UrlType$Dir

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.reflections.vfs.CommonsVfs2UrlType$Dir`

## org.reflections.vfs.CommonsVfs2UrlType$File

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.reflections.vfs.CommonsVfs2UrlType$File`

## org.reflections.vfs.JarInputFile

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.reflections.vfs.JarInputFile.openInputStream()`

## org.reflections.vfs.Vfs

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.vfs.Vfs.findFiles(java.util.Collection<java.net.URL>,com.google.common.base.Predicate<org.reflections.vfs.Vfs$File>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.reflections.vfs.Vfs.findFiles(java.util.Collection<java.net.URL>,java.lang.String,com.google.common.base.Predicate<java.lang.String>)`

## org.reflections.vfs.Vfs$DefaultUrlTypes

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.reflections.vfs.Vfs$DefaultUrlTypes.commons_vfs2`

