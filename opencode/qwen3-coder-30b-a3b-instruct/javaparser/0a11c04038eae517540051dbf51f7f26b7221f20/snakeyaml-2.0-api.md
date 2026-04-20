# API Specification: org.yaml:snakeyaml 2.0

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public class `org.yaml.snakeyaml.DumperOptions`

**Constructors:**
- `public DumperOptions()`

**Methods:**
- `public org.yaml.snakeyaml.serializer.AnchorGenerator getAnchorGenerator()`
- `public org.yaml.snakeyaml.DumperOptions$FlowStyle getDefaultFlowStyle()`
- `public org.yaml.snakeyaml.DumperOptions$ScalarStyle getDefaultScalarStyle()`
- `public int getIndent()`
- `public boolean getIndentWithIndicator()`
- `public int getIndicatorIndent()`
- `public org.yaml.snakeyaml.DumperOptions$LineBreak getLineBreak()`
- `public int getMaxSimpleKeyLength()`
- `public org.yaml.snakeyaml.DumperOptions$NonPrintableStyle getNonPrintableStyle()`
- `public boolean getSplitLines()`
- `public java.util.Map getTags()`
- `public java.util.TimeZone getTimeZone()`
- `public org.yaml.snakeyaml.DumperOptions$Version getVersion()`
- `public int getWidth()`
- `public boolean isAllowReadOnlyProperties()`
- `public boolean isAllowUnicode()`
- `public boolean isCanonical()`
- `public boolean isExplicitEnd()`
- `public boolean isExplicitStart()`
- `public boolean isPrettyFlow()`
- `public boolean isProcessComments()`
- `public void setAllowReadOnlyProperties(boolean p0)`
- `public void setAllowUnicode(boolean p0)`
- `public void setAnchorGenerator(org.yaml.snakeyaml.serializer.AnchorGenerator p0)`
- `public void setCanonical(boolean p0)`
- `public void setDefaultFlowStyle(org.yaml.snakeyaml.DumperOptions$FlowStyle p0)`
- `public void setDefaultScalarStyle(org.yaml.snakeyaml.DumperOptions$ScalarStyle p0)`
- `public void setExplicitEnd(boolean p0)`
- `public void setExplicitStart(boolean p0)`
- `public void setIndent(int p0)`
- `public void setIndentWithIndicator(boolean p0)`
- `public void setIndicatorIndent(int p0)`
- `public void setLineBreak(org.yaml.snakeyaml.DumperOptions$LineBreak p0)`
- `public void setMaxSimpleKeyLength(int p0)`
- `public void setNonPrintableStyle(org.yaml.snakeyaml.DumperOptions$NonPrintableStyle p0)`
- `public void setPrettyFlow(boolean p0)`
- `public void setProcessComments(boolean p0)`
- `public void setSplitLines(boolean p0)`
- `public void setTags(java.util.Map p0)`
- `public void setTimeZone(java.util.TimeZone p0)`
- `public void setVersion(org.yaml.snakeyaml.DumperOptions$Version p0)`
- `public void setWidth(int p0)`

---

## public final static enum `org.yaml.snakeyaml.DumperOptions$FlowStyle`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.yaml.snakeyaml.DumperOptions$FlowStyle AUTO`
- `public final static org.yaml.snakeyaml.DumperOptions$FlowStyle BLOCK`
- `public final static org.yaml.snakeyaml.DumperOptions$FlowStyle FLOW`

**Methods:**
- `public java.lang.String toString()`

---

## public final static enum `org.yaml.snakeyaml.DumperOptions$LineBreak`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.yaml.snakeyaml.DumperOptions$LineBreak MAC`
- `public final static org.yaml.snakeyaml.DumperOptions$LineBreak UNIX`
- `public final static org.yaml.snakeyaml.DumperOptions$LineBreak WIN`

**Methods:**
- `public static org.yaml.snakeyaml.DumperOptions$LineBreak getPlatformLineBreak()`
- `public java.lang.String getString()`
- `public java.lang.String toString()`

---

## public final static enum `org.yaml.snakeyaml.DumperOptions$NonPrintableStyle`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.yaml.snakeyaml.DumperOptions$NonPrintableStyle BINARY`
- `public final static org.yaml.snakeyaml.DumperOptions$NonPrintableStyle ESCAPE`

---

## public final static enum `org.yaml.snakeyaml.DumperOptions$ScalarStyle`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.yaml.snakeyaml.DumperOptions$ScalarStyle DOUBLE_QUOTED`
- `public final static org.yaml.snakeyaml.DumperOptions$ScalarStyle FOLDED`
- `public final static org.yaml.snakeyaml.DumperOptions$ScalarStyle LITERAL`
- `public final static org.yaml.snakeyaml.DumperOptions$ScalarStyle PLAIN`
- `public final static org.yaml.snakeyaml.DumperOptions$ScalarStyle SINGLE_QUOTED`

**Methods:**
- `public static org.yaml.snakeyaml.DumperOptions$ScalarStyle createStyle(java.lang.Character p0)`
- `public java.lang.Character getChar()`
- `public java.lang.String toString()`

---

## public final static enum `org.yaml.snakeyaml.DumperOptions$Version`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.yaml.snakeyaml.DumperOptions$Version V1_0`
- `public final static org.yaml.snakeyaml.DumperOptions$Version V1_1`

**Methods:**
- `public java.lang.String getRepresentation()`
- `public int major()`
- `public int minor()`
- `public java.lang.String toString()`

---

## public class `org.yaml.snakeyaml.LoaderOptions`

**Constructors:**
- `public LoaderOptions()`

**Methods:**
- `public final boolean getAllowRecursiveKeys()`
- `public final int getCodePointLimit()`
- `public final int getMaxAliasesForCollections()`
- `public final int getNestingDepthLimit()`
- `public org.yaml.snakeyaml.inspector.TagInspector getTagInspector()`
- `public final boolean isAllowDuplicateKeys()`
- `public final boolean isEnumCaseSensitive()`
- `public final boolean isProcessComments()`
- `public final boolean isWrappedToRootException()`
- `public void setAllowDuplicateKeys(boolean p0)`
- `public void setAllowRecursiveKeys(boolean p0)`
- `public void setCodePointLimit(int p0)`
- `public void setEnumCaseSensitive(boolean p0)`
- `public void setMaxAliasesForCollections(int p0)`
- `public void setNestingDepthLimit(int p0)`
- `public org.yaml.snakeyaml.LoaderOptions setProcessComments(boolean p0)`
- `public void setTagInspector(org.yaml.snakeyaml.inspector.TagInspector p0)`
- `public void setWrappedToRootException(boolean p0)`

---

## public class `org.yaml.snakeyaml.TypeDescription`

**Constructors:**
- `public TypeDescription(java.lang.Class p0)`
- `public TypeDescription(java.lang.Class p0, java.lang.Class p1)`
- `public TypeDescription(java.lang.Class p0, java.lang.String p1)`
- `public TypeDescription(java.lang.Class p0, org.yaml.snakeyaml.nodes.Tag p1)`
- `public TypeDescription(java.lang.Class p0, org.yaml.snakeyaml.nodes.Tag p1, java.lang.Class p2)`

**Fields:**
- `protected org.yaml.snakeyaml.introspector.BeanAccess beanAccess`
- `protected java.util.Set excludes`
- `protected java.lang.String[] includes`

**Methods:**
- `public void addPropertyParameters(java.lang.String p0, java.lang.Class... p1)`
- `public java.lang.Object finalizeConstruction(java.lang.Object p0)`
- `public java.util.Set getProperties()`
- `public org.yaml.snakeyaml.introspector.Property getProperty(java.lang.String p0)`
- `public org.yaml.snakeyaml.nodes.Tag getTag()`
- `public java.lang.Class getType()`
- `public java.lang.Object newInstance(java.lang.String p0, org.yaml.snakeyaml.nodes.Node p1)`
- `public java.lang.Object newInstance(org.yaml.snakeyaml.nodes.Node p0)`
- `public void putListPropertyType(java.lang.String p0, java.lang.Class p1)`
- `public void putMapPropertyType(java.lang.String p0, java.lang.Class p1, java.lang.Class p2)`
- `public void setExcludes(java.lang.String... p0)`
- `public void setIncludes(java.lang.String... p0)`
- `public boolean setProperty(java.lang.Object p0, java.lang.String p1, java.lang.Object p2) throws java.lang.Exception`
- `public void setPropertyUtils(org.yaml.snakeyaml.introspector.PropertyUtils p0)`
- `public boolean setupPropertyType(java.lang.String p0, org.yaml.snakeyaml.nodes.Node p1)`
- `public void substituteProperty(java.lang.String p0, java.lang.Class p1, java.lang.String p2, java.lang.String p3, java.lang.Class... p4)`
- `public void substituteProperty(org.yaml.snakeyaml.introspector.PropertySubstitute p0)`
- `public java.lang.String toString()`

---

## public class `org.yaml.snakeyaml.Yaml`

**Constructors:**
- `public Yaml()`
- `public Yaml(org.yaml.snakeyaml.DumperOptions p0)`
- `public Yaml(org.yaml.snakeyaml.LoaderOptions p0)`
- `public Yaml(org.yaml.snakeyaml.constructor.BaseConstructor p0)`
- `public Yaml(org.yaml.snakeyaml.constructor.BaseConstructor p0, org.yaml.snakeyaml.representer.Representer p1)`
- `public Yaml(org.yaml.snakeyaml.constructor.BaseConstructor p0, org.yaml.snakeyaml.representer.Representer p1, org.yaml.snakeyaml.DumperOptions p2)`
- `public Yaml(org.yaml.snakeyaml.constructor.BaseConstructor p0, org.yaml.snakeyaml.representer.Representer p1, org.yaml.snakeyaml.DumperOptions p2, org.yaml.snakeyaml.LoaderOptions p3)`
- `public Yaml(org.yaml.snakeyaml.constructor.BaseConstructor p0, org.yaml.snakeyaml.representer.Representer p1, org.yaml.snakeyaml.DumperOptions p2, org.yaml.snakeyaml.LoaderOptions p3, org.yaml.snakeyaml.resolver.Resolver p4)`
- `public Yaml(org.yaml.snakeyaml.constructor.BaseConstructor p0, org.yaml.snakeyaml.representer.Representer p1, org.yaml.snakeyaml.DumperOptions p2, org.yaml.snakeyaml.resolver.Resolver p3)`
- `public Yaml(org.yaml.snakeyaml.representer.Representer p0)`
- `public Yaml(org.yaml.snakeyaml.representer.Representer p0, org.yaml.snakeyaml.DumperOptions p1)`

**Fields:**
- `protected org.yaml.snakeyaml.constructor.BaseConstructor constructor`
- `protected org.yaml.snakeyaml.DumperOptions dumperOptions`
- `protected org.yaml.snakeyaml.LoaderOptions loadingConfig`
- `protected org.yaml.snakeyaml.representer.Representer representer`
- `protected final org.yaml.snakeyaml.resolver.Resolver resolver`

**Methods:**
- `public void addImplicitResolver(org.yaml.snakeyaml.nodes.Tag p0, java.util.regex.Pattern p1, java.lang.String p2)`
- `public void addImplicitResolver(org.yaml.snakeyaml.nodes.Tag p0, java.util.regex.Pattern p1, java.lang.String p2, int p3)`
- `public void addTypeDescription(org.yaml.snakeyaml.TypeDescription p0)`
- `public org.yaml.snakeyaml.nodes.Node compose(java.io.Reader p0)`
- `public java.lang.Iterable composeAll(java.io.Reader p0)`
- `public java.lang.String dump(java.lang.Object p0)`
- `public void dump(java.lang.Object p0, java.io.Writer p1)`
- `public java.lang.String dumpAll(java.util.Iterator p0)`
- `public void dumpAll(java.util.Iterator p0, java.io.Writer p1)`
- `public java.lang.String dumpAs(java.lang.Object p0, org.yaml.snakeyaml.nodes.Tag p1, org.yaml.snakeyaml.DumperOptions$FlowStyle p2)`
- `public java.lang.String dumpAsMap(java.lang.Object p0)`
- `public java.lang.String getName()`
- `public <T extends java.lang.Object> T load(java.io.InputStream p0)`
- `public <T extends java.lang.Object> T load(java.io.Reader p0)`
- `public <T extends java.lang.Object> T load(java.lang.String p0)`
- `public java.lang.Iterable loadAll(java.io.InputStream p0)`
- `public java.lang.Iterable loadAll(java.io.Reader p0)`
- `public java.lang.Iterable loadAll(java.lang.String p0)`
- `public <T extends java.lang.Object> T loadAs(java.io.InputStream p0, java.lang.Class p1)`
- `public <T extends java.lang.Object> T loadAs(java.io.Reader p0, java.lang.Class p1)`
- `public <T extends java.lang.Object> T loadAs(java.lang.String p0, java.lang.Class p1)`
- `public java.lang.Iterable parse(java.io.Reader p0)`
- `public org.yaml.snakeyaml.nodes.Node represent(java.lang.Object p0)`
- `public java.util.List serialize(org.yaml.snakeyaml.nodes.Node p0)`
- `public void serialize(org.yaml.snakeyaml.nodes.Node p0, java.io.Writer p1)`
- `public void setBeanAccess(org.yaml.snakeyaml.introspector.BeanAccess p0)`
- `public void setName(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public class `org.yaml.snakeyaml.comments.CommentEventsCollector`

**Constructors:**
- `public CommentEventsCollector(java.util.Queue p0, org.yaml.snakeyaml.comments.CommentType... p1)`
- `public CommentEventsCollector(org.yaml.snakeyaml.parser.Parser p0, org.yaml.snakeyaml.comments.CommentType... p1)`

**Methods:**
- `public org.yaml.snakeyaml.comments.CommentEventsCollector collectEvents()`
- `public org.yaml.snakeyaml.events.Event collectEvents(org.yaml.snakeyaml.events.Event p0)`
- `public org.yaml.snakeyaml.events.Event collectEventsAndPoll(org.yaml.snakeyaml.events.Event p0)`
- `public java.util.List consume()`
- `public boolean isEmpty()`

---

## public class `org.yaml.snakeyaml.comments.CommentLine`

**Constructors:**
- `public CommentLine(org.yaml.snakeyaml.error.Mark p0, org.yaml.snakeyaml.error.Mark p1, java.lang.String p2, org.yaml.snakeyaml.comments.CommentType p3)`
- `public CommentLine(org.yaml.snakeyaml.events.CommentEvent p0)`

**Methods:**
- `public org.yaml.snakeyaml.comments.CommentType getCommentType()`
- `public org.yaml.snakeyaml.error.Mark getEndMark()`
- `public org.yaml.snakeyaml.error.Mark getStartMark()`
- `public java.lang.String getValue()`
- `public java.lang.String toString()`

---

## public final enum `org.yaml.snakeyaml.comments.CommentType`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.yaml.snakeyaml.comments.CommentType BLANK_LINE`
- `public final static org.yaml.snakeyaml.comments.CommentType BLOCK`
- `public final static org.yaml.snakeyaml.comments.CommentType IN_LINE`

---

## public class `org.yaml.snakeyaml.composer.Composer`

**Constructors:**
- `public Composer(org.yaml.snakeyaml.parser.Parser p0, org.yaml.snakeyaml.resolver.Resolver p1, org.yaml.snakeyaml.LoaderOptions p2)`

**Fields:**
- `protected final org.yaml.snakeyaml.parser.Parser parser`

**Methods:**
- `public boolean checkNode()`
- `protected org.yaml.snakeyaml.nodes.Node composeKeyNode(org.yaml.snakeyaml.nodes.MappingNode p0)`
- `protected void composeMappingChildren(java.util.List p0, org.yaml.snakeyaml.nodes.MappingNode p1)`
- `protected org.yaml.snakeyaml.nodes.Node composeMappingNode(java.lang.String p0)`
- `protected org.yaml.snakeyaml.nodes.Node composeScalarNode(java.lang.String p0, java.util.List p1)`
- `protected org.yaml.snakeyaml.nodes.Node composeSequenceNode(java.lang.String p0)`
- `protected org.yaml.snakeyaml.nodes.Node composeValueNode(org.yaml.snakeyaml.nodes.MappingNode p0)`
- `public org.yaml.snakeyaml.nodes.Node getNode()`
- `public org.yaml.snakeyaml.nodes.Node getSingleNode()`

---

## public class `org.yaml.snakeyaml.composer.ComposerException`
extends `org.yaml.snakeyaml.error.MarkedYAMLException`  

**Constructors:**
- `protected ComposerException(java.lang.String p0, org.yaml.snakeyaml.error.Mark p1, java.lang.String p2, org.yaml.snakeyaml.error.Mark p3)`

---

## public abstract class `org.yaml.snakeyaml.constructor.AbstractConstruct`
implements `org.yaml.snakeyaml.constructor.Construct`  

**Constructors:**
- `public AbstractConstruct()`

**Methods:**
- `public void construct2ndStep(org.yaml.snakeyaml.nodes.Node p0, java.lang.Object p1)`

---

## public abstract class `org.yaml.snakeyaml.constructor.BaseConstructor`

**Constructors:**
- `public BaseConstructor(org.yaml.snakeyaml.LoaderOptions p0)`

**Fields:**
- `protected final static java.lang.Object NOT_INSTANTIATED_OBJECT`
- `protected org.yaml.snakeyaml.composer.Composer composer`
- `protected org.yaml.snakeyaml.LoaderOptions loadingConfig`
- `protected org.yaml.snakeyaml.nodes.Tag rootTag`
- `protected final java.util.Map typeDefinitions`
- `protected final java.util.Map typeTags`
- `protected final java.util.Map yamlClassConstructors`
- `protected final java.util.Map yamlConstructors`
- `protected final java.util.Map yamlMultiConstructors`

**Methods:**
- `public org.yaml.snakeyaml.TypeDescription addTypeDescription(org.yaml.snakeyaml.TypeDescription p0)`
- `public boolean checkData()`
- `protected java.lang.Object constructArray(org.yaml.snakeyaml.nodes.SequenceNode p0)`
- `protected java.lang.Object constructArrayStep2(org.yaml.snakeyaml.nodes.SequenceNode p0, java.lang.Object p1)`
- `protected final java.lang.Object constructDocument(org.yaml.snakeyaml.nodes.Node p0)`
- `protected java.util.Map constructMapping(org.yaml.snakeyaml.nodes.MappingNode p0)`
- `protected void constructMapping2ndStep(org.yaml.snakeyaml.nodes.MappingNode p0, java.util.Map p1)`
- `protected java.lang.Object constructObject(org.yaml.snakeyaml.nodes.Node p0)`
- `protected java.lang.Object constructObjectNoCheck(org.yaml.snakeyaml.nodes.Node p0)`
- `protected java.lang.String constructScalar(org.yaml.snakeyaml.nodes.ScalarNode p0)`
- `protected java.util.List constructSequence(org.yaml.snakeyaml.nodes.SequenceNode p0)`
- `protected void constructSequenceStep2(org.yaml.snakeyaml.nodes.SequenceNode p0, java.util.Collection p1)`
- `protected java.util.Set constructSet(org.yaml.snakeyaml.nodes.MappingNode p0)`
- `protected java.util.Set constructSet(org.yaml.snakeyaml.nodes.SequenceNode p0)`
- `protected void constructSet2ndStep(org.yaml.snakeyaml.nodes.MappingNode p0, java.util.Set p1)`
- `protected java.lang.Object createArray(java.lang.Class p0, int p1)`
- `protected java.util.List createDefaultList(int p0)`
- `protected java.util.Map createDefaultMap(int p0)`
- `protected java.util.Set createDefaultSet(int p0)`
- `protected java.lang.Object finalizeConstruction(org.yaml.snakeyaml.nodes.Node p0, java.lang.Object p1)`
- `protected org.yaml.snakeyaml.constructor.Construct getConstructor(org.yaml.snakeyaml.nodes.Node p0)`
- `public java.lang.Object getData() throws java.util.NoSuchElementException`
- `public org.yaml.snakeyaml.LoaderOptions getLoadingConfig()`
- `public final org.yaml.snakeyaml.introspector.PropertyUtils getPropertyUtils()`
- `public java.lang.Object getSingleData(java.lang.Class p0)`
- `public boolean isAllowDuplicateKeys()`
- `public boolean isEnumCaseSensitive()`
- `public final boolean isExplicitPropertyUtils()`
- `public boolean isWrappedToRootException()`
- `protected final java.lang.Object newInstance(java.lang.Class p0, org.yaml.snakeyaml.nodes.Node p1)`
- `protected java.lang.Object newInstance(java.lang.Class p0, org.yaml.snakeyaml.nodes.Node p1, boolean p2)`
- `protected java.lang.Object newInstance(org.yaml.snakeyaml.nodes.Node p0)`
- `protected java.util.List newList(org.yaml.snakeyaml.nodes.SequenceNode p0)`
- `protected java.util.Map newMap(org.yaml.snakeyaml.nodes.MappingNode p0)`
- `protected java.util.Set newSet(org.yaml.snakeyaml.nodes.CollectionNode p0)`
- `protected void postponeMapFilling(java.util.Map p0, java.lang.Object p1, java.lang.Object p2)`
- `protected void postponeSetFilling(java.util.Set p0, java.lang.Object p1)`
- `public void setAllowDuplicateKeys(boolean p0)`
- `public void setComposer(org.yaml.snakeyaml.composer.Composer p0)`
- `public void setEnumCaseSensitive(boolean p0)`
- `public void setPropertyUtils(org.yaml.snakeyaml.introspector.PropertyUtils p0)`
- `public void setWrappedToRootException(boolean p0)`

---

## public abstract interface `org.yaml.snakeyaml.constructor.Construct`

**Methods:**
- `public abstract java.lang.Object construct(org.yaml.snakeyaml.nodes.Node p0)`
- `public abstract void construct2ndStep(org.yaml.snakeyaml.nodes.Node p0, java.lang.Object p1)`

---

## public class `org.yaml.snakeyaml.constructor.Constructor`
extends `org.yaml.snakeyaml.constructor.SafeConstructor`  

**Constructors:**
- `public Constructor(java.lang.Class p0, org.yaml.snakeyaml.LoaderOptions p1)`
- `public Constructor(java.lang.String p0, org.yaml.snakeyaml.LoaderOptions p1) throws java.lang.ClassNotFoundException`
- `public Constructor(org.yaml.snakeyaml.LoaderOptions p0)`
- `public Constructor(org.yaml.snakeyaml.TypeDescription p0, java.util.Collection p1, org.yaml.snakeyaml.LoaderOptions p2)`
- `public Constructor(org.yaml.snakeyaml.TypeDescription p0, org.yaml.snakeyaml.LoaderOptions p1)`

**Methods:**
- `protected java.lang.Class getClassForName(java.lang.String p0) throws java.lang.ClassNotFoundException`
- `protected java.lang.Class getClassForNode(org.yaml.snakeyaml.nodes.Node p0)`

---

## protected class `org.yaml.snakeyaml.constructor.Constructor$ConstructMapping`
implements `org.yaml.snakeyaml.constructor.Construct`  

**Constructors:**
- `protected ConstructMapping()`

**Methods:**
- `public java.lang.Object construct(org.yaml.snakeyaml.nodes.Node p0)`
- `public void construct2ndStep(org.yaml.snakeyaml.nodes.Node p0, java.lang.Object p1)`
- `protected java.lang.Object constructJavaBean2ndStep(org.yaml.snakeyaml.nodes.MappingNode p0, java.lang.Object p1)`
- `protected org.yaml.snakeyaml.introspector.Property getProperty(java.lang.Class p0, java.lang.String p1)`

---

## protected class `org.yaml.snakeyaml.constructor.Constructor$ConstructScalar`
extends `org.yaml.snakeyaml.constructor.AbstractConstruct`  

**Constructors:**
- `protected ConstructScalar()`

**Methods:**
- `public java.lang.Object construct(org.yaml.snakeyaml.nodes.Node p0)`

---

## protected class `org.yaml.snakeyaml.constructor.Constructor$ConstructSequence`
implements `org.yaml.snakeyaml.constructor.Construct`  

**Constructors:**
- `protected ConstructSequence()`

**Methods:**
- `public java.lang.Object construct(org.yaml.snakeyaml.nodes.Node p0)`
- `public void construct2ndStep(org.yaml.snakeyaml.nodes.Node p0, java.lang.Object p1)`

---

## protected class `org.yaml.snakeyaml.constructor.Constructor$ConstructYamlObject`
implements `org.yaml.snakeyaml.constructor.Construct`  

**Constructors:**
- `protected ConstructYamlObject()`

**Methods:**
- `public java.lang.Object construct(org.yaml.snakeyaml.nodes.Node p0)`
- `public void construct2ndStep(org.yaml.snakeyaml.nodes.Node p0, java.lang.Object p1)`

---

## public class `org.yaml.snakeyaml.constructor.ConstructorException`
extends `org.yaml.snakeyaml.error.MarkedYAMLException`  

**Constructors:**
- `protected ConstructorException(java.lang.String p0, org.yaml.snakeyaml.error.Mark p1, java.lang.String p2, org.yaml.snakeyaml.error.Mark p3)`
- `protected ConstructorException(java.lang.String p0, org.yaml.snakeyaml.error.Mark p1, java.lang.String p2, org.yaml.snakeyaml.error.Mark p3, java.lang.Throwable p4)`

---

## public class `org.yaml.snakeyaml.constructor.CustomClassLoaderConstructor`
extends `org.yaml.snakeyaml.constructor.Constructor`  

**Constructors:**
- `public CustomClassLoaderConstructor(java.lang.Class p0, java.lang.ClassLoader p1, org.yaml.snakeyaml.LoaderOptions p2)`
- `public CustomClassLoaderConstructor(java.lang.ClassLoader p0, org.yaml.snakeyaml.LoaderOptions p1)`

**Methods:**
- `protected java.lang.Class getClassForName(java.lang.String p0) throws java.lang.ClassNotFoundException`

---

## public class `org.yaml.snakeyaml.constructor.DuplicateKeyException`
extends `org.yaml.snakeyaml.constructor.ConstructorException`  

**Constructors:**
- `protected DuplicateKeyException(org.yaml.snakeyaml.error.Mark p0, java.lang.Object p1, org.yaml.snakeyaml.error.Mark p2)`

---

## public class `org.yaml.snakeyaml.constructor.SafeConstructor`
extends `org.yaml.snakeyaml.constructor.BaseConstructor`  

**Constructors:**
- `public SafeConstructor(org.yaml.snakeyaml.LoaderOptions p0)`

**Fields:**
- `public final static org.yaml.snakeyaml.constructor.SafeConstructor$ConstructUndefined undefinedConstructor`

**Methods:**
- `protected void constructMapping2ndStep(org.yaml.snakeyaml.nodes.MappingNode p0, java.util.Map p1)`
- `protected void constructSet2ndStep(org.yaml.snakeyaml.nodes.MappingNode p0, java.util.Set p1)`
- `protected static java.lang.Number createLongOrBigInteger(java.lang.String p0, int p1)`
- `protected void flattenMapping(org.yaml.snakeyaml.nodes.MappingNode p0)`
- `protected void flattenMapping(org.yaml.snakeyaml.nodes.MappingNode p0, boolean p1)`
- `protected void processDuplicateKeys(org.yaml.snakeyaml.nodes.MappingNode p0)`
- `protected void processDuplicateKeys(org.yaml.snakeyaml.nodes.MappingNode p0, boolean p1)`

---

## public final static class `org.yaml.snakeyaml.constructor.SafeConstructor$ConstructUndefined`
extends `org.yaml.snakeyaml.constructor.AbstractConstruct`  

**Constructors:**
- `public ConstructUndefined()`

**Methods:**
- `public java.lang.Object construct(org.yaml.snakeyaml.nodes.Node p0)`

---

## public class `org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlBinary`
extends `org.yaml.snakeyaml.constructor.AbstractConstruct`  

**Constructors:**
- `public ConstructYamlBinary()`

**Methods:**
- `public java.lang.Object construct(org.yaml.snakeyaml.nodes.Node p0)`

---

## public class `org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlBool`
extends `org.yaml.snakeyaml.constructor.AbstractConstruct`  

**Constructors:**
- `public ConstructYamlBool()`

**Methods:**
- `public java.lang.Object construct(org.yaml.snakeyaml.nodes.Node p0)`

---

## public class `org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlFloat`
extends `org.yaml.snakeyaml.constructor.AbstractConstruct`  

**Constructors:**
- `public ConstructYamlFloat()`

**Methods:**
- `public java.lang.Object construct(org.yaml.snakeyaml.nodes.Node p0)`

---

## public class `org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlInt`
extends `org.yaml.snakeyaml.constructor.AbstractConstruct`  

**Constructors:**
- `public ConstructYamlInt()`

**Methods:**
- `public java.lang.Object construct(org.yaml.snakeyaml.nodes.Node p0)`

---

## public class `org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlMap`
implements `org.yaml.snakeyaml.constructor.Construct`  

**Constructors:**
- `public ConstructYamlMap()`

**Methods:**
- `public java.lang.Object construct(org.yaml.snakeyaml.nodes.Node p0)`
- `public void construct2ndStep(org.yaml.snakeyaml.nodes.Node p0, java.lang.Object p1)`

---

## public class `org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlNull`
extends `org.yaml.snakeyaml.constructor.AbstractConstruct`  

**Constructors:**
- `public ConstructYamlNull()`

**Methods:**
- `public java.lang.Object construct(org.yaml.snakeyaml.nodes.Node p0)`

---

## public class `org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlOmap`
extends `org.yaml.snakeyaml.constructor.AbstractConstruct`  

**Constructors:**
- `public ConstructYamlOmap()`

**Methods:**
- `public java.lang.Object construct(org.yaml.snakeyaml.nodes.Node p0)`

---

## public class `org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlPairs`
extends `org.yaml.snakeyaml.constructor.AbstractConstruct`  

**Constructors:**
- `public ConstructYamlPairs()`

**Methods:**
- `public java.lang.Object construct(org.yaml.snakeyaml.nodes.Node p0)`

---

## public class `org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlSeq`
implements `org.yaml.snakeyaml.constructor.Construct`  

**Constructors:**
- `public ConstructYamlSeq()`

**Methods:**
- `public java.lang.Object construct(org.yaml.snakeyaml.nodes.Node p0)`
- `public void construct2ndStep(org.yaml.snakeyaml.nodes.Node p0, java.lang.Object p1)`

---

## public class `org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlSet`
implements `org.yaml.snakeyaml.constructor.Construct`  

**Constructors:**
- `public ConstructYamlSet()`

**Methods:**
- `public java.lang.Object construct(org.yaml.snakeyaml.nodes.Node p0)`
- `public void construct2ndStep(org.yaml.snakeyaml.nodes.Node p0, java.lang.Object p1)`

---

## public class `org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlStr`
extends `org.yaml.snakeyaml.constructor.AbstractConstruct`  

**Constructors:**
- `public ConstructYamlStr()`

**Methods:**
- `public java.lang.Object construct(org.yaml.snakeyaml.nodes.Node p0)`

---

## public static class `org.yaml.snakeyaml.constructor.SafeConstructor$ConstructYamlTimestamp`
extends `org.yaml.snakeyaml.constructor.AbstractConstruct`  

**Constructors:**
- `public ConstructYamlTimestamp()`

**Methods:**
- `public java.lang.Object construct(org.yaml.snakeyaml.nodes.Node p0)`
- `public java.util.Calendar getCalendar()`

---

## public abstract interface `org.yaml.snakeyaml.emitter.Emitable`

**Methods:**
- `public abstract void emit(org.yaml.snakeyaml.events.Event p0) throws java.io.IOException`

---

## public final class `org.yaml.snakeyaml.emitter.Emitter`
implements `org.yaml.snakeyaml.emitter.Emitable`  

**Constructors:**
- `public Emitter(java.io.Writer p0, org.yaml.snakeyaml.DumperOptions p1)`

**Fields:**
- `public final static int MAX_INDENT`
- `public final static int MIN_INDENT`

**Methods:**
- `public void emit(org.yaml.snakeyaml.events.Event p0) throws java.io.IOException`

---

## public class `org.yaml.snakeyaml.emitter.EmitterException`
extends `org.yaml.snakeyaml.error.YAMLException`  

**Constructors:**
- `public EmitterException(java.lang.String p0)`

---

## public final class `org.yaml.snakeyaml.emitter.ScalarAnalysis`

**Constructors:**
- `public ScalarAnalysis(java.lang.String p0, boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6)`

**Methods:**
- `public java.lang.String getScalar()`
- `public boolean isAllowBlock()`
- `public boolean isAllowBlockPlain()`
- `public boolean isAllowFlowPlain()`
- `public boolean isAllowSingleQuoted()`
- `public boolean isEmpty()`
- `public boolean isMultiline()`

---

## public class `org.yaml.snakeyaml.env.EnvScalarConstructor`
extends `org.yaml.snakeyaml.constructor.Constructor`  

**Constructors:**
- `public EnvScalarConstructor()`
- `public EnvScalarConstructor(org.yaml.snakeyaml.TypeDescription p0, java.util.Collection p1, org.yaml.snakeyaml.LoaderOptions p2)`

**Fields:**
- `public final static java.util.regex.Pattern ENV_FORMAT`
- `public final static org.yaml.snakeyaml.nodes.Tag ENV_TAG`

**Methods:**
- `public java.lang.String apply(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3)`
- `public java.lang.String getEnv(java.lang.String p0)`

---

## public final class `org.yaml.snakeyaml.error.Mark`
implements `java.io.Serializable`  

**Constructors:**
- `public Mark(java.lang.String p0, int p1, int p2, int p3, char[] p4, int p5)`
- `public Mark(java.lang.String p0, int p1, int p2, int p3, int[] p4, int p5)`

**Methods:**
- `public int[] getBuffer()`
- `public int getColumn()`
- `public int getIndex()`
- `public int getLine()`
- `public java.lang.String getName()`
- `public int getPointer()`
- `public java.lang.String get_snippet()`
- `public java.lang.String get_snippet(int p0, int p1)`
- `public java.lang.String toString()`

---

## public class `org.yaml.snakeyaml.error.MarkedYAMLException`
extends `org.yaml.snakeyaml.error.YAMLException`  

**Constructors:**
- `protected MarkedYAMLException(java.lang.String p0, org.yaml.snakeyaml.error.Mark p1, java.lang.String p2, org.yaml.snakeyaml.error.Mark p3)`
- `protected MarkedYAMLException(java.lang.String p0, org.yaml.snakeyaml.error.Mark p1, java.lang.String p2, org.yaml.snakeyaml.error.Mark p3, java.lang.String p4)`
- `protected MarkedYAMLException(java.lang.String p0, org.yaml.snakeyaml.error.Mark p1, java.lang.String p2, org.yaml.snakeyaml.error.Mark p3, java.lang.String p4, java.lang.Throwable p5)`
- `protected MarkedYAMLException(java.lang.String p0, org.yaml.snakeyaml.error.Mark p1, java.lang.String p2, org.yaml.snakeyaml.error.Mark p3, java.lang.Throwable p4)`

**Methods:**
- `public java.lang.String getContext()`
- `public org.yaml.snakeyaml.error.Mark getContextMark()`
- `public java.lang.String getMessage()`
- `public java.lang.String getProblem()`
- `public org.yaml.snakeyaml.error.Mark getProblemMark()`
- `public java.lang.String toString()`

---

## public class `org.yaml.snakeyaml.error.MissingEnvironmentVariableException`
extends `org.yaml.snakeyaml.error.YAMLException`  

**Constructors:**
- `public MissingEnvironmentVariableException(java.lang.String p0)`

---

## public class `org.yaml.snakeyaml.error.YAMLException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public YAMLException(java.lang.String p0)`
- `public YAMLException(java.lang.String p0, java.lang.Throwable p1)`
- `public YAMLException(java.lang.Throwable p0)`

---

## public final class `org.yaml.snakeyaml.events.AliasEvent`
extends `org.yaml.snakeyaml.events.NodeEvent`  

**Constructors:**
- `public AliasEvent(java.lang.String p0, org.yaml.snakeyaml.error.Mark p1, org.yaml.snakeyaml.error.Mark p2)`

**Methods:**
- `public org.yaml.snakeyaml.events.Event$ID getEventId()`

---

## public abstract class `org.yaml.snakeyaml.events.CollectionEndEvent`
extends `org.yaml.snakeyaml.events.Event`  

**Constructors:**
- `public CollectionEndEvent(org.yaml.snakeyaml.error.Mark p0, org.yaml.snakeyaml.error.Mark p1)`

---

## public abstract class `org.yaml.snakeyaml.events.CollectionStartEvent`
extends `org.yaml.snakeyaml.events.NodeEvent`  

**Constructors:**
- `public CollectionStartEvent(java.lang.String p0, java.lang.String p1, boolean p2, org.yaml.snakeyaml.error.Mark p3, org.yaml.snakeyaml.error.Mark p4, org.yaml.snakeyaml.DumperOptions$FlowStyle p5)`

**Methods:**
- `protected java.lang.String getArguments()`
- `public org.yaml.snakeyaml.DumperOptions$FlowStyle getFlowStyle()`
- `public boolean getImplicit()`
- `public java.lang.String getTag()`
- `public boolean isFlow()`

---

## public final class `org.yaml.snakeyaml.events.CommentEvent`
extends `org.yaml.snakeyaml.events.Event`  

**Constructors:**
- `public CommentEvent(org.yaml.snakeyaml.comments.CommentType p0, java.lang.String p1, org.yaml.snakeyaml.error.Mark p2, org.yaml.snakeyaml.error.Mark p3)`

**Methods:**
- `public org.yaml.snakeyaml.comments.CommentType getCommentType()`
- `public org.yaml.snakeyaml.events.Event$ID getEventId()`
- `public java.lang.String getValue()`

---

## public final class `org.yaml.snakeyaml.events.DocumentEndEvent`
extends `org.yaml.snakeyaml.events.Event`  

**Constructors:**
- `public DocumentEndEvent(org.yaml.snakeyaml.error.Mark p0, org.yaml.snakeyaml.error.Mark p1, boolean p2)`

**Methods:**
- `public org.yaml.snakeyaml.events.Event$ID getEventId()`
- `public boolean getExplicit()`

---

## public final class `org.yaml.snakeyaml.events.DocumentStartEvent`
extends `org.yaml.snakeyaml.events.Event`  

**Constructors:**
- `public DocumentStartEvent(org.yaml.snakeyaml.error.Mark p0, org.yaml.snakeyaml.error.Mark p1, boolean p2, org.yaml.snakeyaml.DumperOptions$Version p3, java.util.Map p4)`

**Methods:**
- `public org.yaml.snakeyaml.events.Event$ID getEventId()`
- `public boolean getExplicit()`
- `public java.util.Map getTags()`
- `public org.yaml.snakeyaml.DumperOptions$Version getVersion()`

---

## public abstract class `org.yaml.snakeyaml.events.Event`

**Constructors:**
- `public Event(org.yaml.snakeyaml.error.Mark p0, org.yaml.snakeyaml.error.Mark p1)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `protected java.lang.String getArguments()`
- `public org.yaml.snakeyaml.error.Mark getEndMark()`
- `public abstract org.yaml.snakeyaml.events.Event$ID getEventId()`
- `public org.yaml.snakeyaml.error.Mark getStartMark()`
- `public int hashCode()`
- `public boolean is(org.yaml.snakeyaml.events.Event$ID p0)`
- `public java.lang.String toString()`

---

## public final static enum `org.yaml.snakeyaml.events.Event$ID`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.yaml.snakeyaml.events.Event$ID Alias`
- `public final static org.yaml.snakeyaml.events.Event$ID Comment`
- `public final static org.yaml.snakeyaml.events.Event$ID DocumentEnd`
- `public final static org.yaml.snakeyaml.events.Event$ID DocumentStart`
- `public final static org.yaml.snakeyaml.events.Event$ID MappingEnd`
- `public final static org.yaml.snakeyaml.events.Event$ID MappingStart`
- `public final static org.yaml.snakeyaml.events.Event$ID Scalar`
- `public final static org.yaml.snakeyaml.events.Event$ID SequenceEnd`
- `public final static org.yaml.snakeyaml.events.Event$ID SequenceStart`
- `public final static org.yaml.snakeyaml.events.Event$ID StreamEnd`
- `public final static org.yaml.snakeyaml.events.Event$ID StreamStart`

---

## public class `org.yaml.snakeyaml.events.ImplicitTuple`

**Constructors:**
- `public ImplicitTuple(boolean p0, boolean p1)`

**Methods:**
- `public boolean bothFalse()`
- `public boolean canOmitTagInNonPlainScalar()`
- `public boolean canOmitTagInPlainScalar()`
- `public java.lang.String toString()`

---

## public final class `org.yaml.snakeyaml.events.MappingEndEvent`
extends `org.yaml.snakeyaml.events.CollectionEndEvent`  

**Constructors:**
- `public MappingEndEvent(org.yaml.snakeyaml.error.Mark p0, org.yaml.snakeyaml.error.Mark p1)`

**Methods:**
- `public org.yaml.snakeyaml.events.Event$ID getEventId()`

---

## public final class `org.yaml.snakeyaml.events.MappingStartEvent`
extends `org.yaml.snakeyaml.events.CollectionStartEvent`  

**Constructors:**
- `public MappingStartEvent(java.lang.String p0, java.lang.String p1, boolean p2, org.yaml.snakeyaml.error.Mark p3, org.yaml.snakeyaml.error.Mark p4, org.yaml.snakeyaml.DumperOptions$FlowStyle p5)`

**Methods:**
- `public org.yaml.snakeyaml.events.Event$ID getEventId()`

---

## public abstract class `org.yaml.snakeyaml.events.NodeEvent`
extends `org.yaml.snakeyaml.events.Event`  

**Constructors:**
- `public NodeEvent(java.lang.String p0, org.yaml.snakeyaml.error.Mark p1, org.yaml.snakeyaml.error.Mark p2)`

**Methods:**
- `public java.lang.String getAnchor()`
- `protected java.lang.String getArguments()`

---

## public final class `org.yaml.snakeyaml.events.ScalarEvent`
extends `org.yaml.snakeyaml.events.NodeEvent`  

**Constructors:**
- `public ScalarEvent(java.lang.String p0, java.lang.String p1, org.yaml.snakeyaml.events.ImplicitTuple p2, java.lang.String p3, org.yaml.snakeyaml.error.Mark p4, org.yaml.snakeyaml.error.Mark p5, org.yaml.snakeyaml.DumperOptions$ScalarStyle p6)`

**Methods:**
- `public org.yaml.snakeyaml.events.Event$ID getEventId()`
- `public org.yaml.snakeyaml.events.ImplicitTuple getImplicit()`
- `public org.yaml.snakeyaml.DumperOptions$ScalarStyle getScalarStyle()`
- `public java.lang.String getTag()`
- `public java.lang.String getValue()`
- `public boolean isPlain()`

---

## public final class `org.yaml.snakeyaml.events.SequenceEndEvent`
extends `org.yaml.snakeyaml.events.CollectionEndEvent`  

**Constructors:**
- `public SequenceEndEvent(org.yaml.snakeyaml.error.Mark p0, org.yaml.snakeyaml.error.Mark p1)`

**Methods:**
- `public org.yaml.snakeyaml.events.Event$ID getEventId()`

---

## public final class `org.yaml.snakeyaml.events.SequenceStartEvent`
extends `org.yaml.snakeyaml.events.CollectionStartEvent`  

**Constructors:**
- `public SequenceStartEvent(java.lang.String p0, java.lang.String p1, boolean p2, org.yaml.snakeyaml.error.Mark p3, org.yaml.snakeyaml.error.Mark p4, org.yaml.snakeyaml.DumperOptions$FlowStyle p5)`

**Methods:**
- `public org.yaml.snakeyaml.events.Event$ID getEventId()`

---

## public final class `org.yaml.snakeyaml.events.StreamEndEvent`
extends `org.yaml.snakeyaml.events.Event`  

**Constructors:**
- `public StreamEndEvent(org.yaml.snakeyaml.error.Mark p0, org.yaml.snakeyaml.error.Mark p1)`

**Methods:**
- `public org.yaml.snakeyaml.events.Event$ID getEventId()`

---

## public final class `org.yaml.snakeyaml.events.StreamStartEvent`
extends `org.yaml.snakeyaml.events.Event`  

**Constructors:**
- `public StreamStartEvent(org.yaml.snakeyaml.error.Mark p0, org.yaml.snakeyaml.error.Mark p1)`

**Methods:**
- `public org.yaml.snakeyaml.events.Event$ID getEventId()`

---

## public class `org.yaml.snakeyaml.extensions.compactnotation.CompactConstructor`
extends `org.yaml.snakeyaml.constructor.Constructor`  

**Constructors:**
- `public CompactConstructor()`
- `public CompactConstructor(org.yaml.snakeyaml.LoaderOptions p0)`

**Methods:**
- `protected void applySequence(java.lang.Object p0, java.util.List p1)`
- `protected java.lang.Object constructCompactFormat(org.yaml.snakeyaml.nodes.ScalarNode p0, org.yaml.snakeyaml.extensions.compactnotation.CompactData p1)`
- `protected org.yaml.snakeyaml.constructor.Construct createCompactConstruct()`
- `protected java.lang.Object createInstance(org.yaml.snakeyaml.nodes.ScalarNode p0, org.yaml.snakeyaml.extensions.compactnotation.CompactData p1) throws java.lang.Exception`
- `public org.yaml.snakeyaml.extensions.compactnotation.CompactData getCompactData(java.lang.String p0)`
- `protected org.yaml.snakeyaml.constructor.Construct getConstructor(org.yaml.snakeyaml.nodes.Node p0)`
- `protected java.lang.String getSequencePropertyName(java.lang.Class p0)`
- `protected void setProperties(java.lang.Object p0, java.util.Map p1) throws java.lang.Exception`

---

## public class `org.yaml.snakeyaml.extensions.compactnotation.CompactConstructor$ConstructCompactObject`
extends `org.yaml.snakeyaml.constructor.Constructor$ConstructMapping`  

**Constructors:**
- `public ConstructCompactObject()`

**Methods:**
- `public java.lang.Object construct(org.yaml.snakeyaml.nodes.Node p0)`
- `public void construct2ndStep(org.yaml.snakeyaml.nodes.Node p0, java.lang.Object p1)`

---

## public class `org.yaml.snakeyaml.extensions.compactnotation.CompactData`

**Constructors:**
- `public CompactData(java.lang.String p0)`

**Methods:**
- `public java.util.List getArguments()`
- `public java.lang.String getPrefix()`
- `public java.util.Map getProperties()`
- `public java.lang.String toString()`

---

## public class `org.yaml.snakeyaml.extensions.compactnotation.PackageCompactConstructor`
extends `org.yaml.snakeyaml.extensions.compactnotation.CompactConstructor`  

**Constructors:**
- `public PackageCompactConstructor(java.lang.String p0)`

**Methods:**
- `protected java.lang.Class getClassForName(java.lang.String p0) throws java.lang.ClassNotFoundException`

---

## public final enum `org.yaml.snakeyaml.introspector.BeanAccess`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.yaml.snakeyaml.introspector.BeanAccess DEFAULT`
- `public final static org.yaml.snakeyaml.introspector.BeanAccess FIELD`
- `public final static org.yaml.snakeyaml.introspector.BeanAccess PROPERTY`

---

## public class `org.yaml.snakeyaml.introspector.FieldProperty`
extends `org.yaml.snakeyaml.introspector.GenericProperty`  

**Constructors:**
- `public FieldProperty(java.lang.reflect.Field p0)`

**Methods:**
- `public java.lang.Object get(java.lang.Object p0)`
- `public <A extends java.lang.annotation.Annotation> A getAnnotation(java.lang.Class p0)`
- `public java.util.List getAnnotations()`
- `public void set(java.lang.Object p0, java.lang.Object p1) throws java.lang.Exception`

---

## public abstract class `org.yaml.snakeyaml.introspector.GenericProperty`
extends `org.yaml.snakeyaml.introspector.Property`  

**Constructors:**
- `public GenericProperty(java.lang.String p0, java.lang.Class p1, java.lang.reflect.Type p2)`

**Methods:**
- `public java.lang.Class[] getActualTypeArguments()`

---

## public class `org.yaml.snakeyaml.introspector.MethodProperty`
extends `org.yaml.snakeyaml.introspector.GenericProperty`  

**Constructors:**
- `public MethodProperty(java.beans.PropertyDescriptor p0)`

**Methods:**
- `public java.lang.Object get(java.lang.Object p0)`
- `public <A extends java.lang.annotation.Annotation> A getAnnotation(java.lang.Class p0)`
- `public java.util.List getAnnotations()`
- `public boolean isReadable()`
- `public boolean isWritable()`
- `public void set(java.lang.Object p0, java.lang.Object p1) throws java.lang.Exception`

---

## public class `org.yaml.snakeyaml.introspector.MissingProperty`
extends `org.yaml.snakeyaml.introspector.Property`  

**Constructors:**
- `public MissingProperty(java.lang.String p0)`

**Methods:**
- `public java.lang.Object get(java.lang.Object p0)`
- `public java.lang.Class[] getActualTypeArguments()`
- `public <A extends java.lang.annotation.Annotation> A getAnnotation(java.lang.Class p0)`
- `public java.util.List getAnnotations()`
- `public void set(java.lang.Object p0, java.lang.Object p1) throws java.lang.Exception`

---

## public abstract class `org.yaml.snakeyaml.introspector.Property`
implements `java.lang.Comparable<org.yaml.snakeyaml.introspector.Property>`  

**Constructors:**
- `public Property(java.lang.String p0, java.lang.Class p1)`

**Methods:**
- `public int compareTo(org.yaml.snakeyaml.introspector.Property p0)`
- `public boolean equals(java.lang.Object p0)`
- `public abstract java.lang.Object get(java.lang.Object p0)`
- `public abstract java.lang.Class[] getActualTypeArguments()`
- `public abstract <A extends java.lang.annotation.Annotation> A getAnnotation(java.lang.Class p0)`
- `public abstract java.util.List getAnnotations()`
- `public java.lang.String getName()`
- `public java.lang.Class getType()`
- `public int hashCode()`
- `public boolean isReadable()`
- `public boolean isWritable()`
- `public abstract void set(java.lang.Object p0, java.lang.Object p1) throws java.lang.Exception`
- `public java.lang.String toString()`

---

## public class `org.yaml.snakeyaml.introspector.PropertySubstitute`
extends `org.yaml.snakeyaml.introspector.Property`  

**Constructors:**
- `public PropertySubstitute(java.lang.String p0, java.lang.Class p1, java.lang.Class... p2)`
- `public PropertySubstitute(java.lang.String p0, java.lang.Class p1, java.lang.String p2, java.lang.String p3, java.lang.Class... p4)`

**Fields:**
- `protected java.lang.Class[] parameters`
- `protected java.lang.Class targetType`

**Methods:**
- `public java.lang.Object get(java.lang.Object p0)`
- `public java.lang.Class[] getActualTypeArguments()`
- `public <A extends java.lang.annotation.Annotation> A getAnnotation(java.lang.Class p0)`
- `public java.util.List getAnnotations()`
- `public java.lang.String getName()`
- `public java.lang.Class getType()`
- `public boolean isReadable()`
- `public boolean isWritable()`
- `public void set(java.lang.Object p0, java.lang.Object p1) throws java.lang.Exception`
- `public void setActualTypeArguments(java.lang.Class... p0)`
- `public void setDelegate(org.yaml.snakeyaml.introspector.Property p0)`
- `public void setTargetType(java.lang.Class p0)`

---

## public class `org.yaml.snakeyaml.introspector.PropertyUtils`

**Constructors:**
- `public PropertyUtils()`

**Methods:**
- `protected java.util.Set createPropertySet(java.lang.Class p0, org.yaml.snakeyaml.introspector.BeanAccess p1)`
- `public java.util.Set getProperties(java.lang.Class p0)`
- `public java.util.Set getProperties(java.lang.Class p0, org.yaml.snakeyaml.introspector.BeanAccess p1)`
- `protected java.util.Map getPropertiesMap(java.lang.Class p0, org.yaml.snakeyaml.introspector.BeanAccess p1)`
- `public org.yaml.snakeyaml.introspector.Property getProperty(java.lang.Class p0, java.lang.String p1)`
- `public org.yaml.snakeyaml.introspector.Property getProperty(java.lang.Class p0, java.lang.String p1, org.yaml.snakeyaml.introspector.BeanAccess p2)`
- `public boolean isAllowReadOnlyProperties()`
- `public boolean isSkipMissingProperties()`
- `public void setAllowReadOnlyProperties(boolean p0)`
- `public void setBeanAccess(org.yaml.snakeyaml.introspector.BeanAccess p0)`
- `public void setSkipMissingProperties(boolean p0)`

---

## public class `org.yaml.snakeyaml.nodes.AnchorNode`
extends `org.yaml.snakeyaml.nodes.Node`  

**Constructors:**
- `public AnchorNode(org.yaml.snakeyaml.nodes.Node p0)`

**Methods:**
- `public org.yaml.snakeyaml.nodes.NodeId getNodeId()`
- `public org.yaml.snakeyaml.nodes.Node getRealNode()`

---

## public abstract class `org.yaml.snakeyaml.nodes.CollectionNode`<T extends java.lang.Object>
extends `org.yaml.snakeyaml.nodes.Node`  

**Constructors:**
- `public CollectionNode(org.yaml.snakeyaml.nodes.Tag p0, org.yaml.snakeyaml.error.Mark p1, org.yaml.snakeyaml.error.Mark p2, org.yaml.snakeyaml.DumperOptions$FlowStyle p3)`

**Methods:**
- `public org.yaml.snakeyaml.DumperOptions$FlowStyle getFlowStyle()`
- `public abstract java.util.List getValue()`
- `public void setEndMark(org.yaml.snakeyaml.error.Mark p0)`
- `public void setFlowStyle(org.yaml.snakeyaml.DumperOptions$FlowStyle p0)`

---

## public class `org.yaml.snakeyaml.nodes.MappingNode`
extends `org.yaml.snakeyaml.nodes.CollectionNode`  

**Constructors:**
- `public MappingNode(org.yaml.snakeyaml.nodes.Tag p0, boolean p1, java.util.List p2, org.yaml.snakeyaml.error.Mark p3, org.yaml.snakeyaml.error.Mark p4, org.yaml.snakeyaml.DumperOptions$FlowStyle p5)`
- `public MappingNode(org.yaml.snakeyaml.nodes.Tag p0, java.util.List p1, org.yaml.snakeyaml.DumperOptions$FlowStyle p2)`

**Methods:**
- `public org.yaml.snakeyaml.nodes.NodeId getNodeId()`
- `public java.util.List getValue()`
- `public boolean isMerged()`
- `public void setMerged(boolean p0)`
- `public void setOnlyKeyType(java.lang.Class p0)`
- `public void setTypes(java.lang.Class p0, java.lang.Class p1)`
- `public void setValue(java.util.List p0)`
- `public java.lang.String toString()`

---

## public abstract class `org.yaml.snakeyaml.nodes.Node`

**Constructors:**
- `public Node(org.yaml.snakeyaml.nodes.Tag p0, org.yaml.snakeyaml.error.Mark p1, org.yaml.snakeyaml.error.Mark p2)`

**Fields:**
- `protected org.yaml.snakeyaml.error.Mark endMark`
- `protected boolean resolved`
- `protected java.lang.Boolean useClassConstructor`

**Methods:**
- `public final boolean equals(java.lang.Object p0)`
- `public java.lang.String getAnchor()`
- `public java.util.List getBlockComments()`
- `public java.util.List getEndComments()`
- `public org.yaml.snakeyaml.error.Mark getEndMark()`
- `public java.util.List getInLineComments()`
- `public abstract org.yaml.snakeyaml.nodes.NodeId getNodeId()`
- `public org.yaml.snakeyaml.error.Mark getStartMark()`
- `public org.yaml.snakeyaml.nodes.Tag getTag()`
- `public java.lang.Class getType()`
- `public final int hashCode()`
- `public boolean isTwoStepsConstruction()`
- `public void setAnchor(java.lang.String p0)`
- `public void setBlockComments(java.util.List p0)`
- `public void setEndComments(java.util.List p0)`
- `public void setInLineComments(java.util.List p0)`
- `public void setTag(org.yaml.snakeyaml.nodes.Tag p0)`
- `public void setTwoStepsConstruction(boolean p0)`
- `public void setType(java.lang.Class p0)`
- `public void setUseClassConstructor(java.lang.Boolean p0)`
- `public boolean useClassConstructor()`

---

## public final enum `org.yaml.snakeyaml.nodes.NodeId`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.yaml.snakeyaml.nodes.NodeId anchor`
- `public final static org.yaml.snakeyaml.nodes.NodeId mapping`
- `public final static org.yaml.snakeyaml.nodes.NodeId scalar`
- `public final static org.yaml.snakeyaml.nodes.NodeId sequence`

---

## public final class `org.yaml.snakeyaml.nodes.NodeTuple`

**Constructors:**
- `public NodeTuple(org.yaml.snakeyaml.nodes.Node p0, org.yaml.snakeyaml.nodes.Node p1)`

**Methods:**
- `public org.yaml.snakeyaml.nodes.Node getKeyNode()`
- `public org.yaml.snakeyaml.nodes.Node getValueNode()`
- `public java.lang.String toString()`

---

## public class `org.yaml.snakeyaml.nodes.ScalarNode`
extends `org.yaml.snakeyaml.nodes.Node`  

**Constructors:**
- `public ScalarNode(org.yaml.snakeyaml.nodes.Tag p0, boolean p1, java.lang.String p2, org.yaml.snakeyaml.error.Mark p3, org.yaml.snakeyaml.error.Mark p4, org.yaml.snakeyaml.DumperOptions$ScalarStyle p5)`
- `public ScalarNode(org.yaml.snakeyaml.nodes.Tag p0, java.lang.String p1, org.yaml.snakeyaml.error.Mark p2, org.yaml.snakeyaml.error.Mark p3, org.yaml.snakeyaml.DumperOptions$ScalarStyle p4)`

**Methods:**
- `public org.yaml.snakeyaml.nodes.NodeId getNodeId()`
- `public org.yaml.snakeyaml.DumperOptions$ScalarStyle getScalarStyle()`
- `public java.lang.String getValue()`
- `public boolean isPlain()`
- `public java.lang.String toString()`

---

## public class `org.yaml.snakeyaml.nodes.SequenceNode`
extends `org.yaml.snakeyaml.nodes.CollectionNode`  

**Constructors:**
- `public SequenceNode(org.yaml.snakeyaml.nodes.Tag p0, boolean p1, java.util.List p2, org.yaml.snakeyaml.error.Mark p3, org.yaml.snakeyaml.error.Mark p4, org.yaml.snakeyaml.DumperOptions$FlowStyle p5)`
- `public SequenceNode(org.yaml.snakeyaml.nodes.Tag p0, java.util.List p1, org.yaml.snakeyaml.DumperOptions$FlowStyle p2)`

**Methods:**
- `public org.yaml.snakeyaml.nodes.NodeId getNodeId()`
- `public java.util.List getValue()`
- `public void setListType(java.lang.Class p0)`
- `public java.lang.String toString()`

---

## public final class `org.yaml.snakeyaml.nodes.Tag`

**Constructors:**
- `public Tag(java.lang.Class p0)`
- `public Tag(java.lang.String p0)`

**Fields:**
- `public final static org.yaml.snakeyaml.nodes.Tag BINARY`
- `public final static org.yaml.snakeyaml.nodes.Tag BOOL`
- `public final static org.yaml.snakeyaml.nodes.Tag COMMENT`
- `public final static org.yaml.snakeyaml.nodes.Tag FLOAT`
- `public final static org.yaml.snakeyaml.nodes.Tag INT`
- `public final static org.yaml.snakeyaml.nodes.Tag MAP`
- `public final static org.yaml.snakeyaml.nodes.Tag MERGE`
- `public final static org.yaml.snakeyaml.nodes.Tag NULL`
- `public final static org.yaml.snakeyaml.nodes.Tag OMAP`
- `public final static org.yaml.snakeyaml.nodes.Tag PAIRS`
- `public final static java.lang.String PREFIX`
- `public final static org.yaml.snakeyaml.nodes.Tag SEQ`
- `public final static org.yaml.snakeyaml.nodes.Tag SET`
- `public final static org.yaml.snakeyaml.nodes.Tag STR`
- `public final static org.yaml.snakeyaml.nodes.Tag TIMESTAMP`
- `public final static org.yaml.snakeyaml.nodes.Tag YAML`
- `public final static java.util.Set standardTags`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getClassName()`
- `public java.lang.String getValue()`
- `public int hashCode()`
- `public boolean isCompatible(java.lang.Class p0)`
- `public boolean isCustomGlobal()`
- `public boolean isSecondary()`
- `public boolean matches(java.lang.Class p0)`
- `public boolean startsWith(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public abstract interface `org.yaml.snakeyaml.parser.Parser`

**Methods:**
- `public abstract boolean checkEvent(org.yaml.snakeyaml.events.Event$ID p0)`
- `public abstract org.yaml.snakeyaml.events.Event getEvent()`
- `public abstract org.yaml.snakeyaml.events.Event peekEvent()`

---

## public class `org.yaml.snakeyaml.parser.ParserException`
extends `org.yaml.snakeyaml.error.MarkedYAMLException`  

**Constructors:**
- `public ParserException(java.lang.String p0, org.yaml.snakeyaml.error.Mark p1, java.lang.String p2, org.yaml.snakeyaml.error.Mark p3)`

---

## public class `org.yaml.snakeyaml.parser.ParserImpl`
implements `org.yaml.snakeyaml.parser.Parser`  

**Constructors:**
- `public ParserImpl(org.yaml.snakeyaml.reader.StreamReader p0, org.yaml.snakeyaml.LoaderOptions p1)`
- `public ParserImpl(org.yaml.snakeyaml.scanner.Scanner p0)`

**Fields:**
- `protected final org.yaml.snakeyaml.scanner.Scanner scanner`

**Methods:**
- `public boolean checkEvent(org.yaml.snakeyaml.events.Event$ID p0)`
- `public org.yaml.snakeyaml.events.Event getEvent()`
- `public org.yaml.snakeyaml.events.Event peekEvent()`

---

## public class `org.yaml.snakeyaml.reader.ReaderException`
extends `org.yaml.snakeyaml.error.YAMLException`  

**Constructors:**
- `public ReaderException(java.lang.String p0, int p1, int p2, java.lang.String p3)`

**Methods:**
- `public int getCodePoint()`
- `public java.lang.String getName()`
- `public int getPosition()`
- `public java.lang.String toString()`

---

## public class `org.yaml.snakeyaml.reader.StreamReader`

**Constructors:**
- `public StreamReader(java.io.Reader p0)`
- `public StreamReader(java.lang.String p0)`

**Methods:**
- `public void forward()`
- `public void forward(int p0)`
- `public int getColumn()`
- `public int getIndex()`
- `public int getLine()`
- `public org.yaml.snakeyaml.error.Mark getMark()`
- `public static boolean isPrintable(int p0)`
- `public static boolean isPrintable(java.lang.String p0)`
- `public int peek()`
- `public int peek(int p0)`
- `public java.lang.String prefix(int p0)`
- `public java.lang.String prefixForward(int p0)`

---

## public class `org.yaml.snakeyaml.reader.UnicodeReader`
extends `java.io.Reader`  

**Constructors:**
- `public UnicodeReader(java.io.InputStream p0)`

**Methods:**
- `public void close() throws java.io.IOException`
- `public java.lang.String getEncoding()`
- `protected void init() throws java.io.IOException`
- `public int read(char[] p0, int p1, int p2) throws java.io.IOException`

---

## public abstract class `org.yaml.snakeyaml.representer.BaseRepresenter`

**Constructors:**
- `public BaseRepresenter()`

**Fields:**
- `protected org.yaml.snakeyaml.DumperOptions$FlowStyle defaultFlowStyle`
- `protected org.yaml.snakeyaml.DumperOptions$ScalarStyle defaultScalarStyle`
- `protected final java.util.Map multiRepresenters`
- `protected org.yaml.snakeyaml.representer.Represent nullRepresenter`
- `protected java.lang.Object objectToRepresent`
- `protected final java.util.Map representedObjects`
- `protected final java.util.Map representers`

**Methods:**
- `public org.yaml.snakeyaml.DumperOptions$FlowStyle getDefaultFlowStyle()`
- `public org.yaml.snakeyaml.DumperOptions$ScalarStyle getDefaultScalarStyle()`
- `public final org.yaml.snakeyaml.introspector.PropertyUtils getPropertyUtils()`
- `public final boolean isExplicitPropertyUtils()`
- `public org.yaml.snakeyaml.nodes.Node represent(java.lang.Object p0)`
- `protected final org.yaml.snakeyaml.nodes.Node representData(java.lang.Object p0)`
- `protected org.yaml.snakeyaml.nodes.Node representMapping(org.yaml.snakeyaml.nodes.Tag p0, java.util.Map p1, org.yaml.snakeyaml.DumperOptions$FlowStyle p2)`
- `protected org.yaml.snakeyaml.nodes.Node representScalar(org.yaml.snakeyaml.nodes.Tag p0, java.lang.String p1)`
- `protected org.yaml.snakeyaml.nodes.Node representScalar(org.yaml.snakeyaml.nodes.Tag p0, java.lang.String p1, org.yaml.snakeyaml.DumperOptions$ScalarStyle p2)`
- `protected org.yaml.snakeyaml.nodes.Node representSequence(org.yaml.snakeyaml.nodes.Tag p0, java.lang.Iterable p1, org.yaml.snakeyaml.DumperOptions$FlowStyle p2)`
- `public void setDefaultFlowStyle(org.yaml.snakeyaml.DumperOptions$FlowStyle p0)`
- `public void setDefaultScalarStyle(org.yaml.snakeyaml.DumperOptions$ScalarStyle p0)`
- `public void setPropertyUtils(org.yaml.snakeyaml.introspector.PropertyUtils p0)`

---

## public abstract interface `org.yaml.snakeyaml.representer.Represent`

**Methods:**
- `public abstract org.yaml.snakeyaml.nodes.Node representData(java.lang.Object p0)`

---

## public class `org.yaml.snakeyaml.representer.Representer`
extends `org.yaml.snakeyaml.representer.SafeRepresenter`  

**Constructors:**
- `public Representer(org.yaml.snakeyaml.DumperOptions p0)`

**Fields:**
- `protected java.util.Map typeDefinitions`

**Methods:**
- `public org.yaml.snakeyaml.TypeDescription addTypeDescription(org.yaml.snakeyaml.TypeDescription p0)`
- `protected void checkGlobalTag(org.yaml.snakeyaml.introspector.Property p0, org.yaml.snakeyaml.nodes.Node p1, java.lang.Object p2)`
- `protected java.util.Set getProperties(java.lang.Class p0)`
- `protected org.yaml.snakeyaml.nodes.MappingNode representJavaBean(java.util.Set p0, java.lang.Object p1)`
- `protected org.yaml.snakeyaml.nodes.NodeTuple representJavaBeanProperty(java.lang.Object p0, org.yaml.snakeyaml.introspector.Property p1, java.lang.Object p2, org.yaml.snakeyaml.nodes.Tag p3)`
- `public void setPropertyUtils(org.yaml.snakeyaml.introspector.PropertyUtils p0)`

---

## protected class `org.yaml.snakeyaml.representer.Representer$RepresentJavaBean`
implements `org.yaml.snakeyaml.representer.Represent`  

**Constructors:**
- `protected RepresentJavaBean()`

**Methods:**
- `public org.yaml.snakeyaml.nodes.Node representData(java.lang.Object p0)`

---

## public class `org.yaml.snakeyaml.resolver.Resolver`

**Constructors:**
- `public Resolver()`

**Fields:**
- `public final static java.util.regex.Pattern BOOL`
- `public final static java.util.regex.Pattern EMPTY`
- `public final static java.util.regex.Pattern FLOAT`
- `public final static java.util.regex.Pattern INT`
- `public final static java.util.regex.Pattern MERGE`
- `public final static java.util.regex.Pattern NULL`
- `public final static java.util.regex.Pattern TIMESTAMP`
- `public final static java.util.regex.Pattern VALUE`
- `public final static java.util.regex.Pattern YAML`
- `protected java.util.Map yamlImplicitResolvers`

**Methods:**
- `public void addImplicitResolver(org.yaml.snakeyaml.nodes.Tag p0, java.util.regex.Pattern p1, java.lang.String p2)`
- `public void addImplicitResolver(org.yaml.snakeyaml.nodes.Tag p0, java.util.regex.Pattern p1, java.lang.String p2, int p3)`
- `protected void addImplicitResolvers()`
- `public org.yaml.snakeyaml.nodes.Tag resolve(org.yaml.snakeyaml.nodes.NodeId p0, java.lang.String p1, boolean p2)`

---

## public final class `org.yaml.snakeyaml.scanner.Constant`

**Fields:**
- `public final static org.yaml.snakeyaml.scanner.Constant ALPHA`
- `public final static org.yaml.snakeyaml.scanner.Constant LINEBR`
- `public final static org.yaml.snakeyaml.scanner.Constant NULL_BL_LINEBR`
- `public final static org.yaml.snakeyaml.scanner.Constant NULL_BL_T`
- `public final static org.yaml.snakeyaml.scanner.Constant NULL_BL_T_LINEBR`
- `public final static org.yaml.snakeyaml.scanner.Constant NULL_OR_LINEBR`
- `public final static org.yaml.snakeyaml.scanner.Constant URI_CHARS`

**Methods:**
- `public boolean has(int p0)`
- `public boolean has(int p0, java.lang.String p1)`
- `public boolean hasNo(int p0)`
- `public boolean hasNo(int p0, java.lang.String p1)`

---

## public abstract interface `org.yaml.snakeyaml.scanner.Scanner`

**Methods:**
- `public abstract boolean checkToken(org.yaml.snakeyaml.tokens.Token$ID... p0)`
- `public abstract org.yaml.snakeyaml.tokens.Token getToken()`
- `public abstract org.yaml.snakeyaml.tokens.Token peekToken()`

---

## public class `org.yaml.snakeyaml.scanner.ScannerException`
extends `org.yaml.snakeyaml.error.MarkedYAMLException`  

**Constructors:**
- `public ScannerException(java.lang.String p0, org.yaml.snakeyaml.error.Mark p1, java.lang.String p2, org.yaml.snakeyaml.error.Mark p3)`
- `public ScannerException(java.lang.String p0, org.yaml.snakeyaml.error.Mark p1, java.lang.String p2, org.yaml.snakeyaml.error.Mark p3, java.lang.String p4)`

---

## public final class `org.yaml.snakeyaml.scanner.ScannerImpl`
implements `org.yaml.snakeyaml.scanner.Scanner`  

**Constructors:**
- `public ScannerImpl(org.yaml.snakeyaml.reader.StreamReader p0, org.yaml.snakeyaml.LoaderOptions p1)`

**Fields:**
- `public final static java.util.Map ESCAPE_CODES`
- `public final static java.util.Map ESCAPE_REPLACEMENTS`

**Methods:**
- `public boolean checkToken(org.yaml.snakeyaml.tokens.Token$ID... p0)`
- `public org.yaml.snakeyaml.tokens.Token getToken()`
- `public org.yaml.snakeyaml.tokens.Token peekToken()`

---

## public abstract interface `org.yaml.snakeyaml.serializer.AnchorGenerator`

**Methods:**
- `public abstract java.lang.String nextAnchor(org.yaml.snakeyaml.nodes.Node p0)`

---

## public class `org.yaml.snakeyaml.serializer.NumberAnchorGenerator`
implements `org.yaml.snakeyaml.serializer.AnchorGenerator`  

**Constructors:**
- `public NumberAnchorGenerator(int p0)`

**Methods:**
- `public java.lang.String nextAnchor(org.yaml.snakeyaml.nodes.Node p0)`

---

## public final class `org.yaml.snakeyaml.serializer.Serializer`

**Constructors:**
- `public Serializer(org.yaml.snakeyaml.emitter.Emitable p0, org.yaml.snakeyaml.resolver.Resolver p1, org.yaml.snakeyaml.DumperOptions p2, org.yaml.snakeyaml.nodes.Tag p3)`

**Methods:**
- `public void close() throws java.io.IOException`
- `public void open() throws java.io.IOException`
- `public void serialize(org.yaml.snakeyaml.nodes.Node p0) throws java.io.IOException`

---

## public class `org.yaml.snakeyaml.serializer.SerializerException`
extends `org.yaml.snakeyaml.error.YAMLException`  

**Constructors:**
- `public SerializerException(java.lang.String p0)`

---

## public final class `org.yaml.snakeyaml.tokens.AliasToken`
extends `org.yaml.snakeyaml.tokens.Token`  

**Constructors:**
- `public AliasToken(java.lang.String p0, org.yaml.snakeyaml.error.Mark p1, org.yaml.snakeyaml.error.Mark p2)`

**Methods:**
- `public org.yaml.snakeyaml.tokens.Token$ID getTokenId()`
- `public java.lang.String getValue()`

---

## public final class `org.yaml.snakeyaml.tokens.AnchorToken`
extends `org.yaml.snakeyaml.tokens.Token`  

**Constructors:**
- `public AnchorToken(java.lang.String p0, org.yaml.snakeyaml.error.Mark p1, org.yaml.snakeyaml.error.Mark p2)`

**Methods:**
- `public org.yaml.snakeyaml.tokens.Token$ID getTokenId()`
- `public java.lang.String getValue()`

---

## public final class `org.yaml.snakeyaml.tokens.BlockEndToken`
extends `org.yaml.snakeyaml.tokens.Token`  

**Constructors:**
- `public BlockEndToken(org.yaml.snakeyaml.error.Mark p0, org.yaml.snakeyaml.error.Mark p1)`

**Methods:**
- `public org.yaml.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `org.yaml.snakeyaml.tokens.BlockEntryToken`
extends `org.yaml.snakeyaml.tokens.Token`  

**Constructors:**
- `public BlockEntryToken(org.yaml.snakeyaml.error.Mark p0, org.yaml.snakeyaml.error.Mark p1)`

**Methods:**
- `public org.yaml.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `org.yaml.snakeyaml.tokens.BlockMappingStartToken`
extends `org.yaml.snakeyaml.tokens.Token`  

**Constructors:**
- `public BlockMappingStartToken(org.yaml.snakeyaml.error.Mark p0, org.yaml.snakeyaml.error.Mark p1)`

**Methods:**
- `public org.yaml.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `org.yaml.snakeyaml.tokens.BlockSequenceStartToken`
extends `org.yaml.snakeyaml.tokens.Token`  

**Constructors:**
- `public BlockSequenceStartToken(org.yaml.snakeyaml.error.Mark p0, org.yaml.snakeyaml.error.Mark p1)`

**Methods:**
- `public org.yaml.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `org.yaml.snakeyaml.tokens.CommentToken`
extends `org.yaml.snakeyaml.tokens.Token`  

**Constructors:**
- `public CommentToken(org.yaml.snakeyaml.comments.CommentType p0, java.lang.String p1, org.yaml.snakeyaml.error.Mark p2, org.yaml.snakeyaml.error.Mark p3)`

**Methods:**
- `public org.yaml.snakeyaml.comments.CommentType getCommentType()`
- `public org.yaml.snakeyaml.tokens.Token$ID getTokenId()`
- `public java.lang.String getValue()`

---

## public final class `org.yaml.snakeyaml.tokens.DirectiveToken`<T extends java.lang.Object>
extends `org.yaml.snakeyaml.tokens.Token`  

**Constructors:**
- `public DirectiveToken(java.lang.String p0, java.util.List p1, org.yaml.snakeyaml.error.Mark p2, org.yaml.snakeyaml.error.Mark p3)`

**Methods:**
- `public java.lang.String getName()`
- `public org.yaml.snakeyaml.tokens.Token$ID getTokenId()`
- `public java.util.List getValue()`

---

## public final class `org.yaml.snakeyaml.tokens.DocumentEndToken`
extends `org.yaml.snakeyaml.tokens.Token`  

**Constructors:**
- `public DocumentEndToken(org.yaml.snakeyaml.error.Mark p0, org.yaml.snakeyaml.error.Mark p1)`

**Methods:**
- `public org.yaml.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `org.yaml.snakeyaml.tokens.DocumentStartToken`
extends `org.yaml.snakeyaml.tokens.Token`  

**Constructors:**
- `public DocumentStartToken(org.yaml.snakeyaml.error.Mark p0, org.yaml.snakeyaml.error.Mark p1)`

**Methods:**
- `public org.yaml.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `org.yaml.snakeyaml.tokens.FlowEntryToken`
extends `org.yaml.snakeyaml.tokens.Token`  

**Constructors:**
- `public FlowEntryToken(org.yaml.snakeyaml.error.Mark p0, org.yaml.snakeyaml.error.Mark p1)`

**Methods:**
- `public org.yaml.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `org.yaml.snakeyaml.tokens.FlowMappingEndToken`
extends `org.yaml.snakeyaml.tokens.Token`  

**Constructors:**
- `public FlowMappingEndToken(org.yaml.snakeyaml.error.Mark p0, org.yaml.snakeyaml.error.Mark p1)`

**Methods:**
- `public org.yaml.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `org.yaml.snakeyaml.tokens.FlowMappingStartToken`
extends `org.yaml.snakeyaml.tokens.Token`  

**Constructors:**
- `public FlowMappingStartToken(org.yaml.snakeyaml.error.Mark p0, org.yaml.snakeyaml.error.Mark p1)`

**Methods:**
- `public org.yaml.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `org.yaml.snakeyaml.tokens.FlowSequenceEndToken`
extends `org.yaml.snakeyaml.tokens.Token`  

**Constructors:**
- `public FlowSequenceEndToken(org.yaml.snakeyaml.error.Mark p0, org.yaml.snakeyaml.error.Mark p1)`

**Methods:**
- `public org.yaml.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `org.yaml.snakeyaml.tokens.FlowSequenceStartToken`
extends `org.yaml.snakeyaml.tokens.Token`  

**Constructors:**
- `public FlowSequenceStartToken(org.yaml.snakeyaml.error.Mark p0, org.yaml.snakeyaml.error.Mark p1)`

**Methods:**
- `public org.yaml.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `org.yaml.snakeyaml.tokens.KeyToken`
extends `org.yaml.snakeyaml.tokens.Token`  

**Constructors:**
- `public KeyToken(org.yaml.snakeyaml.error.Mark p0, org.yaml.snakeyaml.error.Mark p1)`

**Methods:**
- `public org.yaml.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `org.yaml.snakeyaml.tokens.ScalarToken`
extends `org.yaml.snakeyaml.tokens.Token`  

**Constructors:**
- `public ScalarToken(java.lang.String p0, boolean p1, org.yaml.snakeyaml.error.Mark p2, org.yaml.snakeyaml.error.Mark p3, org.yaml.snakeyaml.DumperOptions$ScalarStyle p4)`
- `public ScalarToken(java.lang.String p0, org.yaml.snakeyaml.error.Mark p1, org.yaml.snakeyaml.error.Mark p2, boolean p3)`

**Methods:**
- `public boolean getPlain()`
- `public org.yaml.snakeyaml.DumperOptions$ScalarStyle getStyle()`
- `public org.yaml.snakeyaml.tokens.Token$ID getTokenId()`
- `public java.lang.String getValue()`

---

## public final class `org.yaml.snakeyaml.tokens.StreamEndToken`
extends `org.yaml.snakeyaml.tokens.Token`  

**Constructors:**
- `public StreamEndToken(org.yaml.snakeyaml.error.Mark p0, org.yaml.snakeyaml.error.Mark p1)`

**Methods:**
- `public org.yaml.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `org.yaml.snakeyaml.tokens.StreamStartToken`
extends `org.yaml.snakeyaml.tokens.Token`  

**Constructors:**
- `public StreamStartToken(org.yaml.snakeyaml.error.Mark p0, org.yaml.snakeyaml.error.Mark p1)`

**Methods:**
- `public org.yaml.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `org.yaml.snakeyaml.tokens.TagToken`
extends `org.yaml.snakeyaml.tokens.Token`  

**Constructors:**
- `public TagToken(org.yaml.snakeyaml.tokens.TagTuple p0, org.yaml.snakeyaml.error.Mark p1, org.yaml.snakeyaml.error.Mark p2)`

**Methods:**
- `public org.yaml.snakeyaml.tokens.Token$ID getTokenId()`
- `public org.yaml.snakeyaml.tokens.TagTuple getValue()`

---

## public final class `org.yaml.snakeyaml.tokens.TagTuple`

**Constructors:**
- `public TagTuple(java.lang.String p0, java.lang.String p1)`

**Methods:**
- `public java.lang.String getHandle()`
- `public java.lang.String getSuffix()`

---

## public abstract class `org.yaml.snakeyaml.tokens.Token`

**Constructors:**
- `public Token(org.yaml.snakeyaml.error.Mark p0, org.yaml.snakeyaml.error.Mark p1)`

**Methods:**
- `public org.yaml.snakeyaml.error.Mark getEndMark()`
- `public org.yaml.snakeyaml.error.Mark getStartMark()`
- `public abstract org.yaml.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final static enum `org.yaml.snakeyaml.tokens.Token$ID`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.yaml.snakeyaml.tokens.Token$ID Alias`
- `public final static org.yaml.snakeyaml.tokens.Token$ID Anchor`
- `public final static org.yaml.snakeyaml.tokens.Token$ID BlockEnd`
- `public final static org.yaml.snakeyaml.tokens.Token$ID BlockEntry`
- `public final static org.yaml.snakeyaml.tokens.Token$ID BlockMappingStart`
- `public final static org.yaml.snakeyaml.tokens.Token$ID BlockSequenceStart`
- `public final static org.yaml.snakeyaml.tokens.Token$ID Comment`
- `public final static org.yaml.snakeyaml.tokens.Token$ID Directive`
- `public final static org.yaml.snakeyaml.tokens.Token$ID DocumentEnd`
- `public final static org.yaml.snakeyaml.tokens.Token$ID DocumentStart`
- `public final static org.yaml.snakeyaml.tokens.Token$ID Error`
- `public final static org.yaml.snakeyaml.tokens.Token$ID FlowEntry`
- `public final static org.yaml.snakeyaml.tokens.Token$ID FlowMappingEnd`
- `public final static org.yaml.snakeyaml.tokens.Token$ID FlowMappingStart`
- `public final static org.yaml.snakeyaml.tokens.Token$ID FlowSequenceEnd`
- `public final static org.yaml.snakeyaml.tokens.Token$ID FlowSequenceStart`
- `public final static org.yaml.snakeyaml.tokens.Token$ID Key`
- `public final static org.yaml.snakeyaml.tokens.Token$ID Scalar`
- `public final static org.yaml.snakeyaml.tokens.Token$ID StreamEnd`
- `public final static org.yaml.snakeyaml.tokens.Token$ID StreamStart`
- `public final static org.yaml.snakeyaml.tokens.Token$ID Tag`
- `public final static org.yaml.snakeyaml.tokens.Token$ID Value`
- `public final static org.yaml.snakeyaml.tokens.Token$ID Whitespace`

**Methods:**
- `public java.lang.String toString()`

---

## public final class `org.yaml.snakeyaml.tokens.ValueToken`
extends `org.yaml.snakeyaml.tokens.Token`  

**Constructors:**
- `public ValueToken(org.yaml.snakeyaml.error.Mark p0, org.yaml.snakeyaml.error.Mark p1)`

**Methods:**
- `public org.yaml.snakeyaml.tokens.Token$ID getTokenId()`

---

## public class `org.yaml.snakeyaml.util.ArrayStack`<T extends java.lang.Object>

**Constructors:**
- `public ArrayStack(int p0)`

**Methods:**
- `public void clear()`
- `public boolean isEmpty()`
- `public T pop()`
- `public void push(T p0)`

---

## public class `org.yaml.snakeyaml.util.ArrayUtils`

**Methods:**
- `public static <E extends java.lang.Object> java.util.List toUnmodifiableCompositeList(E[] p0, E[] p1)`
- `public static <E extends java.lang.Object> java.util.List toUnmodifiableList(E[] p0)`

---

## public class `org.yaml.snakeyaml.util.EnumUtils`

**Constructors:**
- `public EnumUtils()`

**Methods:**
- `public static <T extends java.lang.Enum<T>> T findEnumInsensitiveCase(java.lang.Class p0, java.lang.String p1)`

---

## public class `org.yaml.snakeyaml.util.PlatformFeatureDetector`

**Constructors:**
- `public PlatformFeatureDetector()`

**Methods:**
- `public boolean isRunningOnAndroid()`

---

## public abstract class `org.yaml.snakeyaml.util.UriEncoder`

**Constructors:**
- `public UriEncoder()`

**Methods:**
- `public static java.lang.String decode(java.lang.String p0)`
- `public static java.lang.String decode(java.nio.ByteBuffer p0) throws java.nio.charset.CharacterCodingException`
- `public static java.lang.String encode(java.lang.String p0)`

---

