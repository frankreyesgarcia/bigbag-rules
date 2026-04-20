# API Specification: jakarta.validation:jakarta.validation-api 3.0.1

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public abstract interface `jakarta.validation.BootstrapConfiguration`

**Methods:**
- `public abstract java.lang.String getClockProviderClassName()`
- `public abstract java.util.Set getConstraintMappingResourcePaths()`
- `public abstract java.lang.String getConstraintValidatorFactoryClassName()`
- `public abstract java.lang.String getDefaultProviderClassName()`
- `public abstract java.util.Set getDefaultValidatedExecutableTypes()`
- `public abstract java.lang.String getMessageInterpolatorClassName()`
- `public abstract java.lang.String getParameterNameProviderClassName()`
- `public abstract java.util.Map getProperties()`
- `public abstract java.lang.String getTraversableResolverClassName()`
- `public abstract java.util.Set getValueExtractorClassNames()`
- `public abstract boolean isExecutableValidationEnabled()`

---

## public abstract interface `jakarta.validation.ClockProvider`

**Methods:**
- `public abstract java.time.Clock getClock()`

---

## public abstract interface `jakarta.validation.Configuration`<T extends jakarta.validation.Configuration<T>>

**Methods:**
- `public abstract T addMapping(java.io.InputStream p0)`
- `public abstract T addProperty(java.lang.String p0, java.lang.String p1)`
- `public abstract T addValueExtractor(jakarta.validation.valueextraction.ValueExtractor p0)`
- `public abstract jakarta.validation.ValidatorFactory buildValidatorFactory()`
- `public abstract T clockProvider(jakarta.validation.ClockProvider p0)`
- `public abstract T constraintValidatorFactory(jakarta.validation.ConstraintValidatorFactory p0)`
- `public abstract jakarta.validation.BootstrapConfiguration getBootstrapConfiguration()`
- `public abstract jakarta.validation.ClockProvider getDefaultClockProvider()`
- `public abstract jakarta.validation.ConstraintValidatorFactory getDefaultConstraintValidatorFactory()`
- `public abstract jakarta.validation.MessageInterpolator getDefaultMessageInterpolator()`
- `public abstract jakarta.validation.ParameterNameProvider getDefaultParameterNameProvider()`
- `public abstract jakarta.validation.TraversableResolver getDefaultTraversableResolver()`
- `public abstract T ignoreXmlConfiguration()`
- `public abstract T messageInterpolator(jakarta.validation.MessageInterpolator p0)`
- `public abstract T parameterNameProvider(jakarta.validation.ParameterNameProvider p0)`
- `public abstract T traversableResolver(jakarta.validation.TraversableResolver p0)`

---

## public abstract interface `jakarta.validation.Constraint`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public class `jakarta.validation.ConstraintDeclarationException`
extends `jakarta.validation.ValidationException`  

**Constructors:**
- `public ConstraintDeclarationException()`
- `public ConstraintDeclarationException(java.lang.String p0)`
- `public ConstraintDeclarationException(java.lang.String p0, java.lang.Throwable p1)`
- `public ConstraintDeclarationException(java.lang.Throwable p0)`

---

## public class `jakarta.validation.ConstraintDefinitionException`
extends `jakarta.validation.ValidationException`  

**Constructors:**
- `public ConstraintDefinitionException()`
- `public ConstraintDefinitionException(java.lang.String p0)`
- `public ConstraintDefinitionException(java.lang.String p0, java.lang.Throwable p1)`
- `public ConstraintDefinitionException(java.lang.Throwable p0)`

---

## public final enum `jakarta.validation.ConstraintTarget`
extends `java.lang.Enum`  

**Fields:**
- `public final static jakarta.validation.ConstraintTarget IMPLICIT`
- `public final static jakarta.validation.ConstraintTarget PARAMETERS`
- `public final static jakarta.validation.ConstraintTarget RETURN_VALUE`

---

## public abstract interface `jakarta.validation.ConstraintValidator`<A extends java.lang.annotation.Annotation, T extends java.lang.Object>

**Methods:**
- `public default void initialize(A p0)`
- `public abstract boolean isValid(T p0, jakarta.validation.ConstraintValidatorContext p1)`

---

## public abstract interface `jakarta.validation.ConstraintValidatorContext`

**Methods:**
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder buildConstraintViolationWithTemplate(java.lang.String p0)`
- `public abstract void disableDefaultConstraintViolation()`
- `public abstract jakarta.validation.ClockProvider getClockProvider()`
- `public abstract java.lang.String getDefaultConstraintMessageTemplate()`
- `public abstract <T extends java.lang.Object> T unwrap(java.lang.Class p0)`

---

## public abstract static interface `jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder`

**Methods:**
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderCustomizableContext addBeanNode()`
- `public abstract jakarta.validation.ConstraintValidatorContext addConstraintViolation()`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderCustomizableContext addContainerElementNode(java.lang.String p0, java.lang.Class p1, java.lang.Integer p2)`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderDefinedContext addNode(java.lang.String p0)`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderDefinedContext addParameterNode(int p0)`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderCustomizableContext addPropertyNode(java.lang.String p0)`

---

## public abstract static interface `jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderCustomizableContext`

**Methods:**
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderCustomizableContext addBeanNode()`
- `public abstract jakarta.validation.ConstraintValidatorContext addConstraintViolation()`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderCustomizableContext addContainerElementNode(java.lang.String p0, java.lang.Class p1, java.lang.Integer p2)`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderCustomizableContext addPropertyNode(java.lang.String p0)`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeContextBuilder inIterable()`

---

## public abstract static interface `jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderDefinedContext`

**Methods:**
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderCustomizableContext addBeanNode()`
- `public abstract jakarta.validation.ConstraintValidatorContext addConstraintViolation()`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderCustomizableContext addContainerElementNode(java.lang.String p0, java.lang.Class p1, java.lang.Integer p2)`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderCustomizableContext addPropertyNode(java.lang.String p0)`

---

## public abstract static interface `jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeContextBuilder`

**Methods:**
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderCustomizableContext addBeanNode()`
- `public abstract jakarta.validation.ConstraintValidatorContext addConstraintViolation()`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderCustomizableContext addContainerElementNode(java.lang.String p0, java.lang.Class p1, java.lang.Integer p2)`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderCustomizableContext addPropertyNode(java.lang.String p0)`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderDefinedContext atIndex(java.lang.Integer p0)`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderDefinedContext atKey(java.lang.Object p0)`

---

## public abstract static interface `jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderCustomizableContext`

**Methods:**
- `public abstract jakarta.validation.ConstraintValidatorContext addConstraintViolation()`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderCustomizableContext inContainer(java.lang.Class p0, java.lang.Integer p1)`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeContextBuilder inIterable()`

---

## public abstract static interface `jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderDefinedContext`

**Methods:**
- `public abstract jakarta.validation.ConstraintValidatorContext addConstraintViolation()`

---

## public abstract static interface `jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeContextBuilder`

**Methods:**
- `public abstract jakarta.validation.ConstraintValidatorContext addConstraintViolation()`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderDefinedContext atIndex(java.lang.Integer p0)`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderDefinedContext atKey(java.lang.Object p0)`

---

## public abstract static interface `jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderCustomizableContext`

**Methods:**
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderCustomizableContext addBeanNode()`
- `public abstract jakarta.validation.ConstraintValidatorContext addConstraintViolation()`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderCustomizableContext addContainerElementNode(java.lang.String p0, java.lang.Class p1, java.lang.Integer p2)`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderCustomizableContext addNode(java.lang.String p0)`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderCustomizableContext addPropertyNode(java.lang.String p0)`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderCustomizableContext inContainer(java.lang.Class p0, java.lang.Integer p1)`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$NodeContextBuilder inIterable()`

---

## public abstract static interface `jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderDefinedContext`

**Methods:**
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderCustomizableContext addBeanNode()`
- `public abstract jakarta.validation.ConstraintValidatorContext addConstraintViolation()`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderCustomizableContext addContainerElementNode(java.lang.String p0, java.lang.Class p1, java.lang.Integer p2)`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderCustomizableContext addNode(java.lang.String p0)`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderCustomizableContext addPropertyNode(java.lang.String p0)`

---

## public abstract static interface `jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$NodeContextBuilder`

**Methods:**
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderCustomizableContext addBeanNode()`
- `public abstract jakarta.validation.ConstraintValidatorContext addConstraintViolation()`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderCustomizableContext addContainerElementNode(java.lang.String p0, java.lang.Class p1, java.lang.Integer p2)`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderCustomizableContext addNode(java.lang.String p0)`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderCustomizableContext addPropertyNode(java.lang.String p0)`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderDefinedContext atIndex(java.lang.Integer p0)`
- `public abstract jakarta.validation.ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderDefinedContext atKey(java.lang.Object p0)`

---

## public abstract interface `jakarta.validation.ConstraintValidatorFactory`

**Methods:**
- `public abstract <T extends jakarta.validation.ConstraintValidator<? extends java.lang.Object, ? extends java.lang.Object>> T getInstance(java.lang.Class p0)`
- `public abstract void releaseInstance(jakarta.validation.ConstraintValidator p0)`

---

## public abstract interface `jakarta.validation.ConstraintViolation`<T extends java.lang.Object>

**Methods:**
- `public abstract jakarta.validation.metadata.ConstraintDescriptor getConstraintDescriptor()`
- `public abstract java.lang.Object[] getExecutableParameters()`
- `public abstract java.lang.Object getExecutableReturnValue()`
- `public abstract java.lang.Object getInvalidValue()`
- `public abstract java.lang.Object getLeafBean()`
- `public abstract java.lang.String getMessage()`
- `public abstract java.lang.String getMessageTemplate()`
- `public abstract jakarta.validation.Path getPropertyPath()`
- `public abstract T getRootBean()`
- `public abstract java.lang.Class getRootBeanClass()`
- `public abstract <U extends java.lang.Object> U unwrap(java.lang.Class p0)`

---

## public class `jakarta.validation.ConstraintViolationException`
extends `jakarta.validation.ValidationException`  

**Constructors:**
- `public ConstraintViolationException(java.lang.String p0, java.util.Set p1)`
- `public ConstraintViolationException(java.util.Set p0)`

**Methods:**
- `public java.util.Set getConstraintViolations()`

---

## public final enum `jakarta.validation.ElementKind`
extends `java.lang.Enum`  

**Fields:**
- `public final static jakarta.validation.ElementKind BEAN`
- `public final static jakarta.validation.ElementKind CONSTRUCTOR`
- `public final static jakarta.validation.ElementKind CONTAINER_ELEMENT`
- `public final static jakarta.validation.ElementKind CROSS_PARAMETER`
- `public final static jakarta.validation.ElementKind METHOD`
- `public final static jakarta.validation.ElementKind PARAMETER`
- `public final static jakarta.validation.ElementKind PROPERTY`
- `public final static jakarta.validation.ElementKind RETURN_VALUE`

---

## public class `jakarta.validation.GroupDefinitionException`
extends `jakarta.validation.ValidationException`  

**Constructors:**
- `public GroupDefinitionException()`
- `public GroupDefinitionException(java.lang.String p0)`
- `public GroupDefinitionException(java.lang.String p0, java.lang.Throwable p1)`
- `public GroupDefinitionException(java.lang.Throwable p0)`

---

## public abstract interface `jakarta.validation.GroupSequence`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.MessageInterpolator`

**Methods:**
- `public abstract java.lang.String interpolate(java.lang.String p0, jakarta.validation.MessageInterpolator$Context p1)`
- `public abstract java.lang.String interpolate(java.lang.String p0, jakarta.validation.MessageInterpolator$Context p1, java.util.Locale p2)`

---

## public abstract static interface `jakarta.validation.MessageInterpolator$Context`

**Methods:**
- `public abstract jakarta.validation.metadata.ConstraintDescriptor getConstraintDescriptor()`
- `public abstract java.lang.Object getValidatedValue()`
- `public abstract <T extends java.lang.Object> T unwrap(java.lang.Class p0)`

---

## public class `jakarta.validation.NoProviderFoundException`
extends `jakarta.validation.ValidationException`  

**Constructors:**
- `public NoProviderFoundException()`
- `public NoProviderFoundException(java.lang.String p0)`
- `public NoProviderFoundException(java.lang.String p0, java.lang.Throwable p1)`
- `public NoProviderFoundException(java.lang.Throwable p0)`

---

## public abstract interface `jakarta.validation.OverridesAttribute`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Repeatable, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `jakarta.validation.OverridesAttribute$List`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.ParameterNameProvider`

**Methods:**
- `public abstract java.util.List getParameterNames(java.lang.reflect.Constructor p0)`
- `public abstract java.util.List getParameterNames(java.lang.reflect.Method p0)`

---

## public abstract interface `jakarta.validation.Path`
implements `java.lang.Iterable<jakarta.validation.Path$Node>`  

**Methods:**
- `public abstract java.lang.String toString()`

---

## public abstract static interface `jakarta.validation.Path$BeanNode`
implements `jakarta.validation.Path$Node`  

**Methods:**
- `public abstract java.lang.Class getContainerClass()`
- `public abstract java.lang.Integer getTypeArgumentIndex()`

---

## public abstract static interface `jakarta.validation.Path$ConstructorNode`
implements `jakarta.validation.Path$Node`  

**Methods:**
- `public abstract java.util.List getParameterTypes()`

---

## public abstract static interface `jakarta.validation.Path$ContainerElementNode`
implements `jakarta.validation.Path$Node`  

**Methods:**
- `public abstract java.lang.Class getContainerClass()`
- `public abstract java.lang.Integer getTypeArgumentIndex()`

---

## public abstract static interface `jakarta.validation.Path$CrossParameterNode`
implements `jakarta.validation.Path$Node`  

---

## public abstract static interface `jakarta.validation.Path$MethodNode`
implements `jakarta.validation.Path$Node`  

**Methods:**
- `public abstract java.util.List getParameterTypes()`

---

## public abstract static interface `jakarta.validation.Path$Node`

**Methods:**
- `public abstract <T extends jakarta.validation.Path$Node> T as(java.lang.Class p0)`
- `public abstract java.lang.Integer getIndex()`
- `public abstract java.lang.Object getKey()`
- `public abstract jakarta.validation.ElementKind getKind()`
- `public abstract java.lang.String getName()`
- `public abstract boolean isInIterable()`
- `public abstract java.lang.String toString()`

---

## public abstract static interface `jakarta.validation.Path$ParameterNode`
implements `jakarta.validation.Path$Node`  

**Methods:**
- `public abstract int getParameterIndex()`

---

## public abstract static interface `jakarta.validation.Path$PropertyNode`
implements `jakarta.validation.Path$Node`  

**Methods:**
- `public abstract java.lang.Class getContainerClass()`
- `public abstract java.lang.Integer getTypeArgumentIndex()`

---

## public abstract static interface `jakarta.validation.Path$ReturnValueNode`
implements `jakarta.validation.Path$Node`  

---

## public abstract interface `jakarta.validation.Payload`

---

## public abstract interface `jakarta.validation.ReportAsSingleViolation`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.TraversableResolver`

**Methods:**
- `public abstract boolean isCascadable(java.lang.Object p0, jakarta.validation.Path$Node p1, java.lang.Class p2, jakarta.validation.Path p3, java.lang.annotation.ElementType p4)`
- `public abstract boolean isReachable(java.lang.Object p0, jakarta.validation.Path$Node p1, java.lang.Class p2, jakarta.validation.Path p3, java.lang.annotation.ElementType p4)`

---

## public class `jakarta.validation.UnexpectedTypeException`
extends `jakarta.validation.ConstraintDeclarationException`  

**Constructors:**
- `public UnexpectedTypeException()`
- `public UnexpectedTypeException(java.lang.String p0)`
- `public UnexpectedTypeException(java.lang.String p0, java.lang.Throwable p1)`
- `public UnexpectedTypeException(java.lang.Throwable p0)`

---

## public abstract interface `jakarta.validation.Valid`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public class `jakarta.validation.Validation`

**Constructors:**
- `public Validation()`

**Methods:**
- `public static jakarta.validation.ValidatorFactory buildDefaultValidatorFactory()`
- `public static jakarta.validation.bootstrap.GenericBootstrap byDefaultProvider()`
- `public static <T extends jakarta.validation.Configuration<T>, U extends jakarta.validation.spi.ValidationProvider<T>> jakarta.validation.bootstrap.ProviderSpecificBootstrap byProvider(java.lang.Class p0)`

---

## public class `jakarta.validation.ValidationException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public ValidationException()`
- `public ValidationException(java.lang.String p0)`
- `public ValidationException(java.lang.String p0, java.lang.Throwable p1)`
- `public ValidationException(java.lang.Throwable p0)`

---

## public abstract interface `jakarta.validation.ValidationProviderResolver`

**Methods:**
- `public abstract java.util.List getValidationProviders()`

---

## public abstract interface `jakarta.validation.Validator`

**Methods:**
- `public abstract jakarta.validation.executable.ExecutableValidator forExecutables()`
- `public abstract jakarta.validation.metadata.BeanDescriptor getConstraintsForClass(java.lang.Class p0)`
- `public abstract <T extends java.lang.Object> T unwrap(java.lang.Class p0)`
- `public abstract <T extends java.lang.Object> java.util.Set validate(T p0, java.lang.Class... p1)`
- `public abstract <T extends java.lang.Object> java.util.Set validateProperty(T p0, java.lang.String p1, java.lang.Class... p2)`
- `public abstract <T extends java.lang.Object> java.util.Set validateValue(java.lang.Class p0, java.lang.String p1, java.lang.Object p2, java.lang.Class... p3)`

---

## public abstract interface `jakarta.validation.ValidatorContext`

**Methods:**
- `public abstract jakarta.validation.ValidatorContext addValueExtractor(jakarta.validation.valueextraction.ValueExtractor p0)`
- `public abstract jakarta.validation.ValidatorContext clockProvider(jakarta.validation.ClockProvider p0)`
- `public abstract jakarta.validation.ValidatorContext constraintValidatorFactory(jakarta.validation.ConstraintValidatorFactory p0)`
- `public abstract jakarta.validation.Validator getValidator()`
- `public abstract jakarta.validation.ValidatorContext messageInterpolator(jakarta.validation.MessageInterpolator p0)`
- `public abstract jakarta.validation.ValidatorContext parameterNameProvider(jakarta.validation.ParameterNameProvider p0)`
- `public abstract jakarta.validation.ValidatorContext traversableResolver(jakarta.validation.TraversableResolver p0)`

---

## public abstract interface `jakarta.validation.ValidatorFactory`
implements `java.lang.AutoCloseable`  

**Methods:**
- `public abstract void close()`
- `public abstract jakarta.validation.ClockProvider getClockProvider()`
- `public abstract jakarta.validation.ConstraintValidatorFactory getConstraintValidatorFactory()`
- `public abstract jakarta.validation.MessageInterpolator getMessageInterpolator()`
- `public abstract jakarta.validation.ParameterNameProvider getParameterNameProvider()`
- `public abstract jakarta.validation.TraversableResolver getTraversableResolver()`
- `public abstract jakarta.validation.Validator getValidator()`
- `public abstract <T extends java.lang.Object> T unwrap(java.lang.Class p0)`
- `public abstract jakarta.validation.ValidatorContext usingContext()`

---

## public abstract interface `jakarta.validation.bootstrap.GenericBootstrap`

**Methods:**
- `public abstract jakarta.validation.Configuration configure()`
- `public abstract jakarta.validation.bootstrap.GenericBootstrap providerResolver(jakarta.validation.ValidationProviderResolver p0)`

---

## public abstract interface `jakarta.validation.bootstrap.ProviderSpecificBootstrap`<T extends jakarta.validation.Configuration<T>>

**Methods:**
- `public abstract T configure()`
- `public abstract jakarta.validation.bootstrap.ProviderSpecificBootstrap providerResolver(jakarta.validation.ValidationProviderResolver p0)`

---

## public abstract interface `jakarta.validation.constraints.AssertFalse`
annotations: @jakarta.validation.Constraint, @java.lang.annotation.Documented, @java.lang.annotation.Repeatable, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `jakarta.validation.constraints.AssertFalse$List`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.constraints.AssertTrue`
annotations: @jakarta.validation.Constraint, @java.lang.annotation.Documented, @java.lang.annotation.Repeatable, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `jakarta.validation.constraints.AssertTrue$List`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.constraints.DecimalMax`
annotations: @jakarta.validation.Constraint, @java.lang.annotation.Documented, @java.lang.annotation.Repeatable, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `jakarta.validation.constraints.DecimalMax$List`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.constraints.DecimalMin`
annotations: @jakarta.validation.Constraint, @java.lang.annotation.Documented, @java.lang.annotation.Repeatable, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `jakarta.validation.constraints.DecimalMin$List`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.constraints.Digits`
annotations: @jakarta.validation.Constraint, @java.lang.annotation.Documented, @java.lang.annotation.Repeatable, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `jakarta.validation.constraints.Digits$List`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.constraints.Email`
annotations: @jakarta.validation.Constraint, @java.lang.annotation.Documented, @java.lang.annotation.Repeatable, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `jakarta.validation.constraints.Email$List`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.constraints.Future`
annotations: @jakarta.validation.Constraint, @java.lang.annotation.Documented, @java.lang.annotation.Repeatable, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `jakarta.validation.constraints.Future$List`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.constraints.FutureOrPresent`
annotations: @jakarta.validation.Constraint, @java.lang.annotation.Documented, @java.lang.annotation.Repeatable, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `jakarta.validation.constraints.FutureOrPresent$List`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.constraints.Max`
annotations: @jakarta.validation.Constraint, @java.lang.annotation.Documented, @java.lang.annotation.Repeatable, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `jakarta.validation.constraints.Max$List`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.constraints.Min`
annotations: @jakarta.validation.Constraint, @java.lang.annotation.Documented, @java.lang.annotation.Repeatable, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `jakarta.validation.constraints.Min$List`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.constraints.Negative`
annotations: @jakarta.validation.Constraint, @java.lang.annotation.Documented, @java.lang.annotation.Repeatable, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `jakarta.validation.constraints.Negative$List`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.constraints.NegativeOrZero`
annotations: @jakarta.validation.Constraint, @java.lang.annotation.Documented, @java.lang.annotation.Repeatable, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `jakarta.validation.constraints.NegativeOrZero$List`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.constraints.NotBlank`
annotations: @jakarta.validation.Constraint, @java.lang.annotation.Documented, @java.lang.annotation.Repeatable, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `jakarta.validation.constraints.NotBlank$List`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.constraints.NotEmpty`
annotations: @jakarta.validation.Constraint, @java.lang.annotation.Documented, @java.lang.annotation.Repeatable, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `jakarta.validation.constraints.NotEmpty$List`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.constraints.NotNull`
annotations: @jakarta.validation.Constraint, @java.lang.annotation.Documented, @java.lang.annotation.Repeatable, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `jakarta.validation.constraints.NotNull$List`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.constraints.Null`
annotations: @jakarta.validation.Constraint, @java.lang.annotation.Documented, @java.lang.annotation.Repeatable, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `jakarta.validation.constraints.Null$List`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.constraints.Past`
annotations: @jakarta.validation.Constraint, @java.lang.annotation.Documented, @java.lang.annotation.Repeatable, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `jakarta.validation.constraints.Past$List`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.constraints.PastOrPresent`
annotations: @jakarta.validation.Constraint, @java.lang.annotation.Documented, @java.lang.annotation.Repeatable, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `jakarta.validation.constraints.PastOrPresent$List`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.constraints.Pattern`
annotations: @jakarta.validation.Constraint, @java.lang.annotation.Documented, @java.lang.annotation.Repeatable, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public final static enum `jakarta.validation.constraints.Pattern$Flag`
extends `java.lang.Enum`  

**Fields:**
- `public final static jakarta.validation.constraints.Pattern$Flag CANON_EQ`
- `public final static jakarta.validation.constraints.Pattern$Flag CASE_INSENSITIVE`
- `public final static jakarta.validation.constraints.Pattern$Flag COMMENTS`
- `public final static jakarta.validation.constraints.Pattern$Flag DOTALL`
- `public final static jakarta.validation.constraints.Pattern$Flag MULTILINE`
- `public final static jakarta.validation.constraints.Pattern$Flag UNICODE_CASE`
- `public final static jakarta.validation.constraints.Pattern$Flag UNIX_LINES`

**Methods:**
- `public int getValue()`

---

## public abstract static interface `jakarta.validation.constraints.Pattern$List`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.constraints.Positive`
annotations: @jakarta.validation.Constraint, @java.lang.annotation.Documented, @java.lang.annotation.Repeatable, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `jakarta.validation.constraints.Positive$List`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.constraints.PositiveOrZero`
annotations: @jakarta.validation.Constraint, @java.lang.annotation.Documented, @java.lang.annotation.Repeatable, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `jakarta.validation.constraints.PositiveOrZero$List`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.constraints.Size`
annotations: @jakarta.validation.Constraint, @java.lang.annotation.Documented, @java.lang.annotation.Repeatable, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `jakarta.validation.constraints.Size$List`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.constraintvalidation.SupportedValidationTarget`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public final enum `jakarta.validation.constraintvalidation.ValidationTarget`
extends `java.lang.Enum`  

**Fields:**
- `public final static jakarta.validation.constraintvalidation.ValidationTarget ANNOTATED_ELEMENT`
- `public final static jakarta.validation.constraintvalidation.ValidationTarget PARAMETERS`

---

## public final enum `jakarta.validation.executable.ExecutableType`
extends `java.lang.Enum`  

**Fields:**
- `public final static jakarta.validation.executable.ExecutableType ALL`
- `public final static jakarta.validation.executable.ExecutableType CONSTRUCTORS`
- `public final static jakarta.validation.executable.ExecutableType GETTER_METHODS`
- `public final static jakarta.validation.executable.ExecutableType IMPLICIT`
- `public final static jakarta.validation.executable.ExecutableType NONE`
- `public final static jakarta.validation.executable.ExecutableType NON_GETTER_METHODS`

---

## public abstract interface `jakarta.validation.executable.ExecutableValidator`

**Methods:**
- `public abstract <T extends java.lang.Object> java.util.Set validateConstructorParameters(java.lang.reflect.Constructor p0, java.lang.Object[] p1, java.lang.Class... p2)`
- `public abstract <T extends java.lang.Object> java.util.Set validateConstructorReturnValue(java.lang.reflect.Constructor p0, T p1, java.lang.Class... p2)`
- `public abstract <T extends java.lang.Object> java.util.Set validateParameters(T p0, java.lang.reflect.Method p1, java.lang.Object[] p2, java.lang.Class... p3)`
- `public abstract <T extends java.lang.Object> java.util.Set validateReturnValue(T p0, java.lang.reflect.Method p1, java.lang.Object p2, java.lang.Class... p3)`

---

## public abstract interface `jakarta.validation.executable.ValidateOnExecution`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.groups.ConvertGroup`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Repeatable, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract static interface `jakarta.validation.groups.ConvertGroup$List`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.groups.Default`

---

## public abstract interface `jakarta.validation.metadata.BeanDescriptor`
implements `jakarta.validation.metadata.ElementDescriptor`  

**Methods:**
- `public abstract java.util.Set getConstrainedConstructors()`
- `public abstract java.util.Set getConstrainedMethods(jakarta.validation.metadata.MethodType p0, jakarta.validation.metadata.MethodType... p1)`
- `public abstract java.util.Set getConstrainedProperties()`
- `public abstract jakarta.validation.metadata.ConstructorDescriptor getConstraintsForConstructor(java.lang.Class... p0)`
- `public abstract jakarta.validation.metadata.MethodDescriptor getConstraintsForMethod(java.lang.String p0, java.lang.Class... p1)`
- `public abstract jakarta.validation.metadata.PropertyDescriptor getConstraintsForProperty(java.lang.String p0)`
- `public abstract boolean isBeanConstrained()`

---

## public abstract interface `jakarta.validation.metadata.CascadableDescriptor`

**Methods:**
- `public abstract java.util.Set getGroupConversions()`
- `public abstract boolean isCascaded()`

---

## public abstract interface `jakarta.validation.metadata.ConstraintDescriptor`<T extends java.lang.annotation.Annotation>

**Methods:**
- `public abstract T getAnnotation()`
- `public abstract java.util.Map getAttributes()`
- `public abstract java.util.Set getComposingConstraints()`
- `public abstract java.util.List getConstraintValidatorClasses()`
- `public abstract java.util.Set getGroups()`
- `public abstract java.lang.String getMessageTemplate()`
- `public abstract java.util.Set getPayload()`
- `public abstract jakarta.validation.ConstraintTarget getValidationAppliesTo()`
- `public abstract jakarta.validation.metadata.ValidateUnwrappedValue getValueUnwrapping()`
- `public abstract boolean isReportAsSingleViolation()`
- `public abstract <U extends java.lang.Object> U unwrap(java.lang.Class p0)`

---

## public abstract interface `jakarta.validation.metadata.ConstructorDescriptor`
implements `jakarta.validation.metadata.ExecutableDescriptor`  

---

## public abstract interface `jakarta.validation.metadata.ContainerDescriptor`

**Methods:**
- `public abstract java.util.Set getConstrainedContainerElementTypes()`

---

## public abstract interface `jakarta.validation.metadata.ContainerElementTypeDescriptor`
implements `jakarta.validation.metadata.CascadableDescriptor`, `jakarta.validation.metadata.ContainerDescriptor`, `jakarta.validation.metadata.ElementDescriptor`  

**Methods:**
- `public abstract java.lang.Class getContainerClass()`
- `public abstract java.lang.Integer getTypeArgumentIndex()`

---

## public abstract interface `jakarta.validation.metadata.CrossParameterDescriptor`
implements `jakarta.validation.metadata.ElementDescriptor`  

**Methods:**
- `public abstract java.lang.Class getElementClass()`

---

## public abstract interface `jakarta.validation.metadata.ElementDescriptor`

**Methods:**
- `public abstract jakarta.validation.metadata.ElementDescriptor$ConstraintFinder findConstraints()`
- `public abstract java.util.Set getConstraintDescriptors()`
- `public abstract java.lang.Class getElementClass()`
- `public abstract boolean hasConstraints()`

---

## public abstract static interface `jakarta.validation.metadata.ElementDescriptor$ConstraintFinder`

**Methods:**
- `public abstract jakarta.validation.metadata.ElementDescriptor$ConstraintFinder declaredOn(java.lang.annotation.ElementType... p0)`
- `public abstract java.util.Set getConstraintDescriptors()`
- `public abstract boolean hasConstraints()`
- `public abstract jakarta.validation.metadata.ElementDescriptor$ConstraintFinder lookingAt(jakarta.validation.metadata.Scope p0)`
- `public abstract jakarta.validation.metadata.ElementDescriptor$ConstraintFinder unorderedAndMatchingGroups(java.lang.Class... p0)`

---

## public abstract interface `jakarta.validation.metadata.ExecutableDescriptor`
implements `jakarta.validation.metadata.ElementDescriptor`  

**Methods:**
- `public abstract jakarta.validation.metadata.ElementDescriptor$ConstraintFinder findConstraints()`
- `public abstract java.util.Set getConstraintDescriptors()`
- `public abstract jakarta.validation.metadata.CrossParameterDescriptor getCrossParameterDescriptor()`
- `public abstract java.lang.String getName()`
- `public abstract java.util.List getParameterDescriptors()`
- `public abstract jakarta.validation.metadata.ReturnValueDescriptor getReturnValueDescriptor()`
- `public abstract boolean hasConstrainedParameters()`
- `public abstract boolean hasConstrainedReturnValue()`
- `public abstract boolean hasConstraints()`

---

## public abstract interface `jakarta.validation.metadata.GroupConversionDescriptor`

**Methods:**
- `public abstract java.lang.Class getFrom()`
- `public abstract java.lang.Class getTo()`

---

## public abstract interface `jakarta.validation.metadata.MethodDescriptor`
implements `jakarta.validation.metadata.ExecutableDescriptor`  

---

## public final enum `jakarta.validation.metadata.MethodType`
extends `java.lang.Enum`  

**Fields:**
- `public final static jakarta.validation.metadata.MethodType GETTER`
- `public final static jakarta.validation.metadata.MethodType NON_GETTER`

---

## public abstract interface `jakarta.validation.metadata.ParameterDescriptor`
implements `jakarta.validation.metadata.CascadableDescriptor`, `jakarta.validation.metadata.ContainerDescriptor`, `jakarta.validation.metadata.ElementDescriptor`  

**Methods:**
- `public abstract int getIndex()`
- `public abstract java.lang.String getName()`

---

## public abstract interface `jakarta.validation.metadata.PropertyDescriptor`
implements `jakarta.validation.metadata.CascadableDescriptor`, `jakarta.validation.metadata.ContainerDescriptor`, `jakarta.validation.metadata.ElementDescriptor`  

**Methods:**
- `public abstract java.lang.String getPropertyName()`

---

## public abstract interface `jakarta.validation.metadata.ReturnValueDescriptor`
implements `jakarta.validation.metadata.CascadableDescriptor`, `jakarta.validation.metadata.ContainerDescriptor`, `jakarta.validation.metadata.ElementDescriptor`  

---

## public final enum `jakarta.validation.metadata.Scope`
extends `java.lang.Enum`  

**Fields:**
- `public final static jakarta.validation.metadata.Scope HIERARCHY`
- `public final static jakarta.validation.metadata.Scope LOCAL_ELEMENT`

---

## public final enum `jakarta.validation.metadata.ValidateUnwrappedValue`
extends `java.lang.Enum`  

**Fields:**
- `public final static jakarta.validation.metadata.ValidateUnwrappedValue DEFAULT`
- `public final static jakarta.validation.metadata.ValidateUnwrappedValue SKIP`
- `public final static jakarta.validation.metadata.ValidateUnwrappedValue UNWRAP`

---

## public abstract interface `jakarta.validation.spi.BootstrapState`

**Methods:**
- `public abstract jakarta.validation.ValidationProviderResolver getDefaultValidationProviderResolver()`
- `public abstract jakarta.validation.ValidationProviderResolver getValidationProviderResolver()`

---

## public abstract interface `jakarta.validation.spi.ConfigurationState`

**Methods:**
- `public abstract jakarta.validation.ClockProvider getClockProvider()`
- `public abstract jakarta.validation.ConstraintValidatorFactory getConstraintValidatorFactory()`
- `public abstract java.util.Set getMappingStreams()`
- `public abstract jakarta.validation.MessageInterpolator getMessageInterpolator()`
- `public abstract jakarta.validation.ParameterNameProvider getParameterNameProvider()`
- `public abstract java.util.Map getProperties()`
- `public abstract jakarta.validation.TraversableResolver getTraversableResolver()`
- `public abstract java.util.Set getValueExtractors()`
- `public abstract boolean isIgnoreXmlConfiguration()`

---

## public abstract interface `jakarta.validation.spi.ValidationProvider`<T extends jakarta.validation.Configuration<T>>

**Methods:**
- `public abstract jakarta.validation.ValidatorFactory buildValidatorFactory(jakarta.validation.spi.ConfigurationState p0)`
- `public abstract jakarta.validation.Configuration createGenericConfiguration(jakarta.validation.spi.BootstrapState p0)`
- `public abstract T createSpecializedConfiguration(jakarta.validation.spi.BootstrapState p0)`

---

## public abstract interface `jakarta.validation.valueextraction.ExtractedValue`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.valueextraction.UnwrapByDefault`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `jakarta.validation.valueextraction.Unwrapping`

---

## public abstract static interface `jakarta.validation.valueextraction.Unwrapping$Skip`
implements `jakarta.validation.Payload`  

---

## public abstract static interface `jakarta.validation.valueextraction.Unwrapping$Unwrap`
implements `jakarta.validation.Payload`  

---

## public abstract interface `jakarta.validation.valueextraction.ValueExtractor`<T extends java.lang.Object>

**Methods:**
- `public abstract void extractValues(T p0, jakarta.validation.valueextraction.ValueExtractor$ValueReceiver p1)`

---

## public abstract static interface `jakarta.validation.valueextraction.ValueExtractor$ValueReceiver`

**Methods:**
- `public abstract void indexedValue(java.lang.String p0, int p1, java.lang.Object p2)`
- `public abstract void iterableValue(java.lang.String p0, java.lang.Object p1)`
- `public abstract void keyedValue(java.lang.String p0, java.lang.Object p1, java.lang.Object p2)`
- `public abstract void value(java.lang.String p0, java.lang.Object p1)`

---

## public class `jakarta.validation.valueextraction.ValueExtractorDeclarationException`
extends `jakarta.validation.ValidationException`  

**Constructors:**
- `public ValueExtractorDeclarationException()`
- `public ValueExtractorDeclarationException(java.lang.String p0)`
- `public ValueExtractorDeclarationException(java.lang.String p0, java.lang.Throwable p1)`
- `public ValueExtractorDeclarationException(java.lang.Throwable p0)`

---

## public class `jakarta.validation.valueextraction.ValueExtractorDefinitionException`
extends `jakarta.validation.ValidationException`  

**Constructors:**
- `public ValueExtractorDefinitionException()`
- `public ValueExtractorDefinitionException(java.lang.String p0)`
- `public ValueExtractorDefinitionException(java.lang.String p0, java.lang.Throwable p1)`
- `public ValueExtractorDefinitionException(java.lang.Throwable p0)`

---

