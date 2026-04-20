# Breaking Changes: com.fasterxml.jackson.core:jackson-databind 2.9.10.5 → 2.13.4.1
Total: 245 (binary-breaking: 191, source-breaking: 229)

## com.fasterxml.jackson.databind.AnnotationIntrospector

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.AnnotationIntrospector.findPropertiesToIgnore(com.fasterxml.jackson.databind.introspect.Annotated)`

## com.fasterxml.jackson.databind.BeanDescription

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.fasterxml.jackson.databind.BeanDescription`
+ MUST NOW IMPLEMENT: `com.fasterxml.jackson.databind.BeanDescription.getFactoryMethodsWithMode()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.fasterxml.jackson.databind.BeanDescription`
+ MUST NOW IMPLEMENT: `com.fasterxml.jackson.databind.BeanDescription.getConstructorsWithMode()`

## com.fasterxml.jackson.databind.DatabindContext

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `com.fasterxml.jackson.databind.DatabindContext.constructSpecializedType(com.fasterxml.jackson.databind.JavaType,java.lang.Class<? extends java.lang.Object>)`

## com.fasterxml.jackson.databind.DeserializationConfig

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.fasterxml.jackson.databind.DeserializationConfig.initialize(com.fasterxml.jackson.core.JsonParser)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.DeserializationConfig.initialize(com.fasterxml.jackson.core.JsonParser)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.fasterxml.jackson.databind.DeserializationConfig.initialize(com.fasterxml.jackson.core.JsonParser)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.DeserializationConfig.initialize(com.fasterxml.jackson.core.JsonParser)`

## com.fasterxml.jackson.databind.ObjectMapper

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `com.fasterxml.jackson.databind.ObjectMapper.readTree(java.lang.String)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `com.fasterxml.jackson.databind.ObjectMapper.readValue(java.lang.String,com.fasterxml.jackson.core.type.TypeReference)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `com.fasterxml.jackson.databind.ObjectMapper.readValue(java.lang.String,com.fasterxml.jackson.databind.JavaType)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `com.fasterxml.jackson.databind.ObjectMapper.readValue(java.lang.String,java.lang.Class<T>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `com.fasterxml.jackson.databind.ObjectMapper.convertValue(java.lang.Object,com.fasterxml.jackson.core.type.TypeReference<? extends java.lang.Object>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `com.fasterxml.jackson.databind.ObjectMapper.readValue(byte[],com.fasterxml.jackson.core.type.TypeReference)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `com.fasterxml.jackson.databind.ObjectMapper.readValue(byte[],int,int,com.fasterxml.jackson.core.type.TypeReference)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `com.fasterxml.jackson.databind.ObjectMapper.readValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.TypeReference<? extends java.lang.Object>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `com.fasterxml.jackson.databind.ObjectMapper.readValue(java.io.File,com.fasterxml.jackson.core.type.TypeReference)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `com.fasterxml.jackson.databind.ObjectMapper.readValue(java.io.InputStream,com.fasterxml.jackson.core.type.TypeReference)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `com.fasterxml.jackson.databind.ObjectMapper.readValue(java.io.Reader,com.fasterxml.jackson.core.type.TypeReference)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `com.fasterxml.jackson.databind.ObjectMapper.readValue(java.lang.String,com.fasterxml.jackson.core.type.TypeReference)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `com.fasterxml.jackson.databind.ObjectMapper.readValue(java.net.URL,com.fasterxml.jackson.core.type.TypeReference)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `com.fasterxml.jackson.databind.ObjectMapper.readValues(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.TypeReference<? extends java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.ObjectMapper._initForReading(com.fasterxml.jackson.core.JsonParser)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.ObjectMapper._unwrapAndDeserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.ObjectMapper.getJsonFactory()`

## com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver(com.fasterxml.jackson.databind.cfg.MapperConfig<? extends java.lang.Object>,com.fasterxml.jackson.databind.JavaType,java.util.Collection<com.fasterxml.jackson.databind.jsontype.NamedType>,boolean,boolean)`

## com.fasterxml.jackson.databind.ObjectReader

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `com.fasterxml.jackson.databind.ObjectReader._reportUnkownFormat(com.fasterxml.jackson.databind.deser.DataFormatReaders,com.fasterxml.jackson.databind.deser.DataFormatReaders$Match)`
+ NOW THROWS: `com.fasterxml.jackson.databind.ObjectReader._reportUnkownFormat(com.fasterxml.jackson.databind.deser.DataFormatReaders,com.fasterxml.jackson.databind.deser.DataFormatReaders$Match)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `com.fasterxml.jackson.databind.ObjectReader.readTree(java.lang.String)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `com.fasterxml.jackson.databind.ObjectReader.readValue(java.lang.String)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `com.fasterxml.jackson.databind.ObjectReader.readValue(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.TypeReference<? extends java.lang.Object>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `com.fasterxml.jackson.databind.ObjectReader.readValues(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.core.type.TypeReference<? extends java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.ObjectReader._unwrapAndDeserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>)`

## com.fasterxml.jackson.databind.ObjectWriter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.ObjectWriter._configAndWriteValue(com.fasterxml.jackson.core.JsonGenerator,java.lang.Object)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.fasterxml.jackson.databind.ObjectWriter._configureGenerator(com.fasterxml.jackson.core.JsonGenerator)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.ObjectWriter._configureGenerator(com.fasterxml.jackson.core.JsonGenerator)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.fasterxml.jackson.databind.ObjectWriter._configureGenerator(com.fasterxml.jackson.core.JsonGenerator)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.ObjectWriter._configureGenerator(com.fasterxml.jackson.core.JsonGenerator)`

## com.fasterxml.jackson.databind.SerializerProvider

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.SerializerProvider.getSerializationView()`

## com.fasterxml.jackson.databind.cfg.BaseSettings

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.fasterxml.jackson.databind.cfg.BaseSettings.<init>(com.fasterxml.jackson.databind.introspect.ClassIntrospector,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.PropertyNamingStrategy,com.fasterxml.jackson.databind.type.TypeFactory,com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder<? extends java.lang.Object>,java.text.DateFormat,com.fasterxml.jackson.databind.cfg.HandlerInstantiator,java.util.Locale,java.util.TimeZone,com.fasterxml.jackson.core.Base64Variant)`

## com.fasterxml.jackson.databind.cfg.MapperConfig

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.fasterxml.jackson.databind.cfg.MapperConfig.<init>(com.fasterxml.jackson.databind.cfg.BaseSettings,int)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.fasterxml.jackson.databind.cfg.MapperConfig.<init>(com.fasterxml.jackson.databind.cfg.MapperConfig<T>,int)`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `com.fasterxml.jackson.databind.cfg.MapperConfig._mapperFeatures`
+ NEW FIELD: `com.fasterxml.jackson.databind.cfg.MapperConfig._mapperFeatures`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `com.fasterxml.jackson.databind.cfg.MapperConfig._mapperFeatures`
+ NEW FIELD: `com.fasterxml.jackson.databind.cfg.MapperConfig._mapperFeatures`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.fasterxml.jackson.databind.cfg.MapperConfig`
+ MUST NOW IMPLEMENT: `com.fasterxml.jackson.databind.cfg.MapperConfig.getDefaultPropertyInclusions(java.lang.Class<? extends java.lang.Object>,com.fasterxml.jackson.databind.introspect.AnnotatedClass)`

## com.fasterxml.jackson.databind.cfg.MapperConfigBase

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.fasterxml.jackson.databind.cfg.MapperConfigBase.<init>(com.fasterxml.jackson.databind.cfg.MapperConfigBase<CFG,T>,com.fasterxml.jackson.databind.introspect.SimpleMixInResolver,com.fasterxml.jackson.databind.util.RootNameLookup,com.fasterxml.jackson.databind.cfg.ConfigOverrides)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.fasterxml.jackson.databind.cfg.MapperConfigBase.<init>(com.fasterxml.jackson.databind.cfg.MapperConfigBase<CFG,T>,int)`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `com.fasterxml.jackson.databind.cfg.MapperConfig._mapperFeatures`
+ NEW FIELD: `com.fasterxml.jackson.databind.cfg.MapperConfig._mapperFeatures`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `com.fasterxml.jackson.databind.cfg.MapperConfig._mapperFeatures`
+ NEW FIELD: `com.fasterxml.jackson.databind.cfg.MapperConfig._mapperFeatures`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.cfg.MapperConfigBase._withMapperFeatures(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.fasterxml.jackson.databind.cfg.MapperConfigBase`
+ MUST NOW IMPLEMENT: `com.fasterxml.jackson.databind.cfg.MapperConfigBase._withMapperFeatures(long)`

## com.fasterxml.jackson.databind.deser.BasicDeserializerFactory

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._addDeserializerConstructors(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker<? extends java.lang.Object>,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map<com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._addDeserializerFactoryMethods(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker<? extends java.lang.Object>,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map<com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]>)`

## com.fasterxml.jackson.databind.deser.BeanDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.fasterxml.jackson.databind.deser.BeanDeserializer.withIgnorableProperties(java.util.Set<java.lang.String>)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.deser.BeanDeserializerBase.withIgnorableProperties(java.util.Set<java.lang.String>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeFromArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.fasterxml.jackson.databind.deser.BeanDeserializer.withIgnorableProperties(java.util.Set<java.lang.String>)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.deser.BeanDeserializerBase.withIgnorableProperties(java.util.Set<java.lang.String>)`

## com.fasterxml.jackson.databind.deser.BeanDeserializerBase

### CONSTRUCTOR_NOW_PROTECTED [binary ✗ | source ✗]
- CONSTRUCTOR (now protected, was public): `com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(com.fasterxml.jackson.databind.deser.BeanDeserializerBase,java.util.Set<java.lang.String>)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap,java.util.Map<java.lang.String,com.fasterxml.jackson.databind.deser.SettableBeanProperty>,java.util.Set<java.lang.String>,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.fasterxml.jackson.databind.deser.BeanDeserializerBase`
+ MUST NOW IMPLEMENT: `com.fasterxml.jackson.databind.deser.BeanDeserializerBase.withByNameInclusion(java.util.Set<java.lang.String>,java.util.Set<java.lang.String>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.fasterxml.jackson.databind.deser.BeanDeserializerBase`
+ MUST NOW IMPLEMENT: `com.fasterxml.jackson.databind.deser.BeanDeserializerBase.withIgnoreAllUnknown(boolean)`

## com.fasterxml.jackson.databind.deser.BeanDeserializerFactory

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._addDeserializerConstructors(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker<? extends java.lang.Object>,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map<com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.BasicDeserializerFactory._addDeserializerFactoryMethods(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker<? extends java.lang.Object>,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map<com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]>)`

## com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer._deserializeFromArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)`

## com.fasterxml.jackson.databind.deser.CreatorProperty

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.fasterxml.jackson.databind.deser.CreatorProperty._injectableValueId`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase._propertyFormat`

## com.fasterxml.jackson.databind.deser.DataFormatReaders$AccessorForReader

### CLASS_NOW_STATIC [binary ✗ | source ✗]
- CLASS (now static): `com.fasterxml.jackson.databind.deser.DataFormatReaders$AccessorForReader`

## com.fasterxml.jackson.databind.deser.DefaultDeserializationContext

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.fasterxml.jackson.databind.deser.DefaultDeserializationContext`
+ MUST NOW IMPLEMENT: `com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.createDummyInstance(com.fasterxml.jackson.databind.DeserializationConfig)`

## com.fasterxml.jackson.databind.deser.DeserializerFactory

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.fasterxml.jackson.databind.deser.DeserializerFactory`
+ MUST NOW IMPLEMENT: `com.fasterxml.jackson.databind.deser.DeserializerFactory.hasExplicitDeserializerFor(com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class<? extends java.lang.Object>)`

## com.fasterxml.jackson.databind.deser.Deserializers$Base

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `com.fasterxml.jackson.databind.deser.Deserializers$Base`

## com.fasterxml.jackson.databind.deser.SettableBeanProperty

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase._propertyFormat`

## com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase._propertyFormat`

## com.fasterxml.jackson.databind.deser.ValueInstantiator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.ValueInstantiator.getIncompleteParameter()`

## com.fasterxml.jackson.databind.deser.ValueInstantiator$Base

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.ValueInstantiator.getIncompleteParameter()`

## com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.<init>(boolean,java.util.Collection<com.fasterxml.jackson.databind.deser.SettableBeanProperty>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.construct(java.util.Collection<com.fasterxml.jackson.databind.deser.SettableBeanProperty>,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap.replace(com.fasterxml.jackson.databind.deser.SettableBeanProperty)`

## com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor`

## com.fasterxml.jackson.databind.deser.impl.FailingDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase._propertyFormat`

## com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase._propertyFormat`

## com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.CollectionDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.DateDeserializers$CalendarDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateBasedDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.DateDeserializers$DateDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.DelegatingDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.EnumDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer._enumClass`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.FromStringDeserializer

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer._deserializeFromEmptyString()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`

## com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std.STD_STRING_BUILDER`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std._deserializeFromEmptyString()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer$Std._deserializeFromEmptyString()`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer._deserializeFromEmptyString()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`

## com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.ValueInstantiator.getIncompleteParameter()`

## com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer._handleDuplicateField(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory,java.lang.String,com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.JsonNode,com.fasterxml.jackson.databind.JsonNode)`
+ NOW THROWS: `com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer._handleDuplicateField(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory,java.lang.String,com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.JsonNode,com.fasterxml.jackson.databind.JsonNode)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer._fromEmbedded(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeAny(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeObjectAtName(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.JsonNodeFactory)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.updateArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.ArrayNode)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.updateObject(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.node.ObjectNode)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.MapDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer.NO_OBJECTS`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.StackTraceElementDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.StdDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.StdNodeBasedDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.StdValueInstantiator

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.fasterxml.jackson.databind.deser.std.StdValueInstantiator._incompleteParameter`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.configureIncompleteParameter(com.fasterxml.jackson.databind.introspect.AnnotatedParameter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.getIncompleteParameter()`

## com.fasterxml.jackson.databind.deser.std.StringDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.fasterxml.jackson.databind.deser.BeanDeserializer.withIgnorableProperties(java.util.Set<java.lang.String>)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.deser.BeanDeserializerBase.withIgnorableProperties(java.util.Set<java.lang.String>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.fasterxml.jackson.databind.deser.std.StdDeserializer._deserializeFromArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeFromArray(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.fasterxml.jackson.databind.deser.BeanDeserializer.withIgnorableProperties(java.util.Set<java.lang.String>)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.deser.BeanDeserializerBase.withIgnorableProperties(java.util.Set<java.lang.String>)`

## com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer.createBufferInstance(com.fasterxml.jackson.core.JsonParser)`

## com.fasterxml.jackson.databind.deser.std.UUIDDeserializer

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer._deserializeFromEmptyString()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`

## com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.ext.CoreXMLDeserializers$Std

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer._deserializeFromEmptyString()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`

## com.fasterxml.jackson.databind.ext.DOMDeserializer

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer._deserializeFromEmptyString()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`

## com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer._deserializeFromEmptyString()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`

## com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer._deserializeFromEmptyString()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.findDeserializer(java.lang.Class<? extends java.lang.Object>)`

## com.fasterxml.jackson.databind.ext.DOMSerializer

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.fasterxml.jackson.databind.ext.DOMSerializer._domImpl`

## com.fasterxml.jackson.databind.ext.Java7Support

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.ext.Java7Support.getClassJavaNioFilePath()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.ext.Java7Support.getDeserializerForJavaNioFilePath(java.lang.Class<? extends java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.ext.Java7Support.getSerializerForJavaNioFilePath(java.lang.Class<? extends java.lang.Object>)`

## com.fasterxml.jackson.databind.ext.Java7SupportImpl

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.ext.Java7SupportImpl.getClassJavaNioFilePath()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.ext.Java7SupportImpl.getDeserializerForJavaNioFilePath(java.lang.Class<? extends java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.ext.Java7SupportImpl.getSerializerForJavaNioFilePath(java.lang.Class<? extends java.lang.Object>)`

## com.fasterxml.jackson.databind.ext.NioPathDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.deser.std.StdDeserializer.parseDouble(java.lang.String)`

## com.fasterxml.jackson.databind.introspect.Annotated

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.Annotated.getGenericType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.Annotated.getType(com.fasterxml.jackson.databind.type.TypeBindings)`

## com.fasterxml.jackson.databind.introspect.AnnotatedClass

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.Annotated.getGenericType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.Annotated.getType(com.fasterxml.jackson.databind.type.TypeBindings)`

## com.fasterxml.jackson.databind.introspect.AnnotatedConstructor

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.Annotated.getGenericType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.Annotated.getType(com.fasterxml.jackson.databind.type.TypeBindings)`

## com.fasterxml.jackson.databind.introspect.AnnotatedField

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.Annotated.getType(com.fasterxml.jackson.databind.type.TypeBindings)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.AnnotatedField.getGenericType()`

## com.fasterxml.jackson.databind.introspect.AnnotatedFieldCollector

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.AnnotatedFieldCollector.collectFields(com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.introspect.TypeResolutionContext,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver,com.fasterxml.jackson.databind.type.TypeFactory,com.fasterxml.jackson.databind.JavaType)`

## com.fasterxml.jackson.databind.introspect.AnnotatedMember

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.Annotated.getGenericType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.Annotated.getType(com.fasterxml.jackson.databind.type.TypeBindings)`

## com.fasterxml.jackson.databind.introspect.AnnotatedMethod

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.Annotated.getType(com.fasterxml.jackson.databind.type.TypeBindings)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.AnnotatedMethod.getGenericType()`

## com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.AnnotatedMethodCollector.collectMethods(com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.introspect.TypeResolutionContext,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver,com.fasterxml.jackson.databind.type.TypeFactory,com.fasterxml.jackson.databind.JavaType,java.util.List<com.fasterxml.jackson.databind.JavaType>,java.lang.Class<? extends java.lang.Object>)`

## com.fasterxml.jackson.databind.introspect.AnnotatedParameter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.Annotated.getType(com.fasterxml.jackson.databind.type.TypeBindings)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.AnnotatedParameter.getGenericType()`

## com.fasterxml.jackson.databind.introspect.AnnotatedWithParams

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.Annotated.getGenericType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.Annotated.getType(com.fasterxml.jackson.databind.type.TypeBindings)`

## com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findPropertiesToIgnore(com.fasterxml.jackson.databind.introspect.Annotated)`

## com.fasterxml.jackson.databind.introspect.BasicClassIntrospector

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.fasterxml.jackson.databind.introspect.BasicClassIntrospector._cachedFCA`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.BasicClassIntrospector._findStdTypeDesc(com.fasterxml.jackson.databind.JavaType)`

## com.fasterxml.jackson.databind.introspect.ClassIntrospector

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.fasterxml.jackson.databind.introspect.ClassIntrospector`
+ MUST NOW IMPLEMENT: `com.fasterxml.jackson.databind.introspect.ClassIntrospector.forDeserializationWithBuilder(com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver,com.fasterxml.jackson.databind.BeanDescription)`

## com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase._propertyFormat`

## com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.AnnotationIntrospector.findPropertiesToIgnore(com.fasterxml.jackson.databind.introspect.Annotated)`

## com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.AnnotationIntrospector.findPropertiesToIgnore(com.fasterxml.jackson.databind.introspect.Annotated)`

## com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder._findDefaultValue()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder._findDescription()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder._findIndex()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder._findRequired()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder._getSetterInfo(com.fasterxml.jackson.databind.PropertyMetadata)`

## com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.Annotated.getGenericType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.introspect.Annotated.getType(com.fasterxml.jackson.databind.type.TypeBindings)`

## com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer._deserializeTypedForId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.util.TokenBuffer)`

## com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver

### CONSTRUCTOR_NOW_PROTECTED [binary ✗ | source ✗]
- CONSTRUCTOR (now protected, was public): `com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver.<init>(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.type.TypeFactory)`

## com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver.<init>(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.type.TypeFactory)`

## com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.idResolver(com.fasterxml.jackson.databind.cfg.MapperConfig<? extends java.lang.Object>,com.fasterxml.jackson.databind.JavaType,java.util.Collection<com.fasterxml.jackson.databind.jsontype.NamedType>,boolean,boolean)`

## com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver.<init>(com.fasterxml.jackson.databind.cfg.MapperConfig<? extends java.lang.Object>,com.fasterxml.jackson.databind.JavaType,java.util.Map<java.lang.String,java.lang.String>,java.util.Map<java.lang.String,com.fasterxml.jackson.databind.JavaType>)`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver._typeToId`
+ NEW FIELD: `com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver._typeToId`

## com.fasterxml.jackson.databind.node.ObjectNode

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.fasterxml.jackson.databind.node.ObjectNode.without(java.util.Collection<java.lang.String>)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.node.ObjectNode.without(java.util.Collection<java.lang.String>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.fasterxml.jackson.databind.node.ObjectNode.without(java.util.Collection<java.lang.String>)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.node.ObjectNode.without(java.util.Collection<java.lang.String>)`

## com.fasterxml.jackson.databind.node.TreeTraversingParser

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.fasterxml.jackson.databind.node.TreeTraversingParser._nextToken`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.fasterxml.jackson.databind.node.TreeTraversingParser._startContainer`

## com.fasterxml.jackson.databind.ser.BeanPropertyWriter

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase._propertyFormat`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `com.fasterxml.jackson.databind.ser.BeanPropertyWriter._handleSelfReference(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer<? extends java.lang.Object>)`
+ NOW THROWS: `com.fasterxml.jackson.databind.ser.BeanPropertyWriter._handleSelfReference(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer<? extends java.lang.Object>)`

## com.fasterxml.jackson.databind.ser.BeanSerializer

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.fasterxml.jackson.databind.ser.BeanSerializer.<init>(com.fasterxml.jackson.databind.ser.std.BeanSerializerBase,java.util.Set<java.lang.String>)`

## com.fasterxml.jackson.databind.ser.DefaultSerializerProvider

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.SerializerProvider.getSerializationView()`

## com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.SerializerProvider.getSerializationView()`

## com.fasterxml.jackson.databind.ser.PropertyWriter

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase._propertyFormat`

## com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase._propertyFormat`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `com.fasterxml.jackson.databind.ser.BeanPropertyWriter._handleSelfReference(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer<? extends java.lang.Object>)`
+ NOW THROWS: `com.fasterxml.jackson.databind.ser.BeanPropertyWriter._handleSelfReference(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer<? extends java.lang.Object>)`

## com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase._propertyFormat`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `com.fasterxml.jackson.databind.ser.BeanPropertyWriter._handleSelfReference(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer<? extends java.lang.Object>)`
+ NOW THROWS: `com.fasterxml.jackson.databind.ser.BeanPropertyWriter._handleSelfReference(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer<? extends java.lang.Object>)`

## com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer.withIgnorals(java.util.Set<java.lang.String>)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.withIgnorals(java.util.Set<java.lang.String>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer.withIgnorals(java.util.Set<java.lang.String>)`
+ NEW RETURN TYPE: `com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.withIgnorals(java.util.Set<java.lang.String>)`

## com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.emptyMap()`

## com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase._propertyFormat`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `com.fasterxml.jackson.databind.ser.BeanPropertyWriter._handleSelfReference(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer<? extends java.lang.Object>)`
+ NOW THROWS: `com.fasterxml.jackson.databind.ser.BeanPropertyWriter._handleSelfReference(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer<? extends java.lang.Object>)`

## com.fasterxml.jackson.databind.ser.std.BeanSerializerBase

### CONSTRUCTOR_NOW_PROTECTED [binary ✗ | source ✗]
- CONSTRUCTOR (now protected, was public): `com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.<init>(com.fasterxml.jackson.databind.ser.std.BeanSerializerBase,com.fasterxml.jackson.databind.ser.BeanPropertyWriter[],com.fasterxml.jackson.databind.ser.BeanPropertyWriter[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.fasterxml.jackson.databind.ser.std.BeanSerializerBase`
+ MUST NOW IMPLEMENT: `com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.withProperties(com.fasterxml.jackson.databind.ser.BeanPropertyWriter[],com.fasterxml.jackson.databind.ser.BeanPropertyWriter[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.fasterxml.jackson.databind.ser.std.BeanSerializerBase`
+ MUST NOW IMPLEMENT: `com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.withByNameInclusion(java.util.Set<java.lang.String>,java.util.Set<java.lang.String>)`

## com.fasterxml.jackson.databind.ser.std.JsonValueSerializer

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.<init>(com.fasterxml.jackson.databind.ser.std.JsonValueSerializer,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer<? extends java.lang.Object>,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.withResolved(com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer<? extends java.lang.Object>,boolean)`

## com.fasterxml.jackson.databind.ser.std.MapProperty

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase._propertyFormat`

## com.fasterxml.jackson.databind.util.BeanUtil

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.util.BeanUtil.isGroovyMetaClassSetter(com.fasterxml.jackson.databind.introspect.AnnotatedMethod)`

## com.fasterxml.jackson.databind.util.ConstantValueInstantiator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.fasterxml.jackson.databind.util.ConstantValueInstantiator`

## com.fasterxml.jackson.databind.util.StdDateFormat

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601`

## com.fasterxml.jackson.databind.util.TokenBuffer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.util.TokenBuffer._append(com.fasterxml.jackson.core.JsonToken)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.fasterxml.jackson.databind.util.TokenBuffer._append(com.fasterxml.jackson.core.JsonToken,java.lang.Object)`

