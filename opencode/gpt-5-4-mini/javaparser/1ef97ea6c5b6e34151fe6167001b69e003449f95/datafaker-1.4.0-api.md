# API Specification: net.datafaker:datafaker 1.4.0

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public class `com.github.javafaker.shaded.snakeyaml.DumperOptions`

**Constructors:**
- `public DumperOptions()`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.serializer.AnchorGenerator getAnchorGenerator()`
- `public com.github.javafaker.shaded.snakeyaml.DumperOptions$FlowStyle getDefaultFlowStyle()`
- `public com.github.javafaker.shaded.snakeyaml.DumperOptions$ScalarStyle getDefaultScalarStyle()`
- `public int getIndent()`
- `public boolean getIndentWithIndicator()`
- `public int getIndicatorIndent()`
- `public com.github.javafaker.shaded.snakeyaml.DumperOptions$LineBreak getLineBreak()`
- `public int getMaxSimpleKeyLength()`
- `public com.github.javafaker.shaded.snakeyaml.DumperOptions$NonPrintableStyle getNonPrintableStyle()`
- `public boolean getSplitLines()`
- `public java.util.Map getTags()`
- `public java.util.TimeZone getTimeZone()`
- `public com.github.javafaker.shaded.snakeyaml.DumperOptions$Version getVersion()`
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
- `public void setAnchorGenerator(com.github.javafaker.shaded.snakeyaml.serializer.AnchorGenerator p0)`
- `public void setCanonical(boolean p0)`
- `public void setDefaultFlowStyle(com.github.javafaker.shaded.snakeyaml.DumperOptions$FlowStyle p0)`
- `public void setDefaultScalarStyle(com.github.javafaker.shaded.snakeyaml.DumperOptions$ScalarStyle p0)`
- `public void setExplicitEnd(boolean p0)`
- `public void setExplicitStart(boolean p0)`
- `public void setIndent(int p0)`
- `public void setIndentWithIndicator(boolean p0)`
- `public void setIndicatorIndent(int p0)`
- `public void setLineBreak(com.github.javafaker.shaded.snakeyaml.DumperOptions$LineBreak p0)`
- `public void setMaxSimpleKeyLength(int p0)`
- `public void setNonPrintableStyle(com.github.javafaker.shaded.snakeyaml.DumperOptions$NonPrintableStyle p0)`
- `public void setPrettyFlow(boolean p0)`
- `public void setProcessComments(boolean p0)`
- `public void setSplitLines(boolean p0)`
- `public void setTags(java.util.Map p0)`
- `public void setTimeZone(java.util.TimeZone p0)`
- `public void setVersion(com.github.javafaker.shaded.snakeyaml.DumperOptions$Version p0)`
- `public void setWidth(int p0)`

---

## public final static enum `com.github.javafaker.shaded.snakeyaml.DumperOptions$FlowStyle`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javafaker.shaded.snakeyaml.DumperOptions$FlowStyle AUTO`
- `public final static com.github.javafaker.shaded.snakeyaml.DumperOptions$FlowStyle BLOCK`
- `public final static com.github.javafaker.shaded.snakeyaml.DumperOptions$FlowStyle FLOW`

**Methods:**
- `public static com.github.javafaker.shaded.snakeyaml.DumperOptions$FlowStyle fromBoolean(java.lang.Boolean p0)`
- `public java.lang.Boolean getStyleBoolean()`
- `public java.lang.String toString()`

---

## public final static enum `com.github.javafaker.shaded.snakeyaml.DumperOptions$LineBreak`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javafaker.shaded.snakeyaml.DumperOptions$LineBreak MAC`
- `public final static com.github.javafaker.shaded.snakeyaml.DumperOptions$LineBreak UNIX`
- `public final static com.github.javafaker.shaded.snakeyaml.DumperOptions$LineBreak WIN`

**Methods:**
- `public static com.github.javafaker.shaded.snakeyaml.DumperOptions$LineBreak getPlatformLineBreak()`
- `public java.lang.String getString()`
- `public java.lang.String toString()`

---

## public final static enum `com.github.javafaker.shaded.snakeyaml.DumperOptions$NonPrintableStyle`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javafaker.shaded.snakeyaml.DumperOptions$NonPrintableStyle BINARY`
- `public final static com.github.javafaker.shaded.snakeyaml.DumperOptions$NonPrintableStyle ESCAPE`

---

## public final static enum `com.github.javafaker.shaded.snakeyaml.DumperOptions$ScalarStyle`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javafaker.shaded.snakeyaml.DumperOptions$ScalarStyle DOUBLE_QUOTED`
- `public final static com.github.javafaker.shaded.snakeyaml.DumperOptions$ScalarStyle FOLDED`
- `public final static com.github.javafaker.shaded.snakeyaml.DumperOptions$ScalarStyle LITERAL`
- `public final static com.github.javafaker.shaded.snakeyaml.DumperOptions$ScalarStyle PLAIN`
- `public final static com.github.javafaker.shaded.snakeyaml.DumperOptions$ScalarStyle SINGLE_QUOTED`

**Methods:**
- `public static com.github.javafaker.shaded.snakeyaml.DumperOptions$ScalarStyle createStyle(java.lang.Character p0)`
- `public java.lang.Character getChar()`
- `public java.lang.String toString()`

---

## public final static enum `com.github.javafaker.shaded.snakeyaml.DumperOptions$Version`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javafaker.shaded.snakeyaml.DumperOptions$Version V1_0`
- `public final static com.github.javafaker.shaded.snakeyaml.DumperOptions$Version V1_1`

**Methods:**
- `public java.lang.String getRepresentation()`
- `public int major()`
- `public int minor()`
- `public java.lang.String toString()`

---

## public class `com.github.javafaker.shaded.snakeyaml.LoaderOptions`

**Constructors:**
- `public LoaderOptions()`

**Methods:**
- `public boolean getAllowRecursiveKeys()`
- `public int getMaxAliasesForCollections()`
- `public boolean isAllowDuplicateKeys()`
- `public boolean isEnumCaseSensitive()`
- `public boolean isProcessComments()`
- `public boolean isWrappedToRootException()`
- `public void setAllowDuplicateKeys(boolean p0)`
- `public void setAllowRecursiveKeys(boolean p0)`
- `public void setEnumCaseSensitive(boolean p0)`
- `public void setMaxAliasesForCollections(int p0)`
- `public void setProcessComments(boolean p0)`
- `public void setWrappedToRootException(boolean p0)`

---

## public class `com.github.javafaker.shaded.snakeyaml.TypeDescription`

**Constructors:**
- `public TypeDescription(java.lang.Class p0)`
- `public TypeDescription(java.lang.Class p0, com.github.javafaker.shaded.snakeyaml.nodes.Tag p1)`
- `public TypeDescription(java.lang.Class p0, com.github.javafaker.shaded.snakeyaml.nodes.Tag p1, java.lang.Class p2)`
- `public TypeDescription(java.lang.Class p0, java.lang.Class p1)`
- `public TypeDescription(java.lang.Class p0, java.lang.String p1)`

**Fields:**
- `protected com.github.javafaker.shaded.snakeyaml.introspector.BeanAccess beanAccess`
- `protected java.util.Set excludes`
- `protected java.lang.String[] includes`

**Methods:**
- `public void addPropertyParameters(java.lang.String p0, java.lang.Class... p1)`
- `public java.lang.Object finalizeConstruction(java.lang.Object p0)`
- `public java.lang.Class getListPropertyType(java.lang.String p0)`
- `public java.lang.Class getMapKeyType(java.lang.String p0)`
- `public java.lang.Class getMapValueType(java.lang.String p0)`
- `public java.util.Set getProperties()`
- `public com.github.javafaker.shaded.snakeyaml.introspector.Property getProperty(java.lang.String p0)`
- `public com.github.javafaker.shaded.snakeyaml.nodes.Tag getTag()`
- `public java.lang.Class getType()`
- `public java.lang.Object newInstance(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`
- `public java.lang.Object newInstance(java.lang.String p0, com.github.javafaker.shaded.snakeyaml.nodes.Node p1)`
- `public void putListPropertyType(java.lang.String p0, java.lang.Class p1)`
- `public void putMapPropertyType(java.lang.String p0, java.lang.Class p1, java.lang.Class p2)`
- `public void setExcludes(java.lang.String... p0)`
- `public void setIncludes(java.lang.String... p0)`
- `public boolean setProperty(java.lang.Object p0, java.lang.String p1, java.lang.Object p2) throws java.lang.Exception`
- `public void setPropertyUtils(com.github.javafaker.shaded.snakeyaml.introspector.PropertyUtils p0)`
- `public void setTag(com.github.javafaker.shaded.snakeyaml.nodes.Tag p0)`
- `public void setTag(java.lang.String p0)`
- `public boolean setupPropertyType(java.lang.String p0, com.github.javafaker.shaded.snakeyaml.nodes.Node p1)`
- `public void substituteProperty(com.github.javafaker.shaded.snakeyaml.introspector.PropertySubstitute p0)`
- `public void substituteProperty(java.lang.String p0, java.lang.Class p1, java.lang.String p2, java.lang.String p3, java.lang.Class... p4)`
- `public java.lang.String toString()`

---

## public class `com.github.javafaker.shaded.snakeyaml.Yaml`

**Constructors:**
- `public Yaml()`
- `public Yaml(com.github.javafaker.shaded.snakeyaml.DumperOptions p0)`
- `public Yaml(com.github.javafaker.shaded.snakeyaml.LoaderOptions p0)`
- `public Yaml(com.github.javafaker.shaded.snakeyaml.constructor.BaseConstructor p0)`
- `public Yaml(com.github.javafaker.shaded.snakeyaml.constructor.BaseConstructor p0, com.github.javafaker.shaded.snakeyaml.representer.Representer p1)`
- `public Yaml(com.github.javafaker.shaded.snakeyaml.constructor.BaseConstructor p0, com.github.javafaker.shaded.snakeyaml.representer.Representer p1, com.github.javafaker.shaded.snakeyaml.DumperOptions p2)`
- `public Yaml(com.github.javafaker.shaded.snakeyaml.constructor.BaseConstructor p0, com.github.javafaker.shaded.snakeyaml.representer.Representer p1, com.github.javafaker.shaded.snakeyaml.DumperOptions p2, com.github.javafaker.shaded.snakeyaml.LoaderOptions p3)`
- `public Yaml(com.github.javafaker.shaded.snakeyaml.constructor.BaseConstructor p0, com.github.javafaker.shaded.snakeyaml.representer.Representer p1, com.github.javafaker.shaded.snakeyaml.DumperOptions p2, com.github.javafaker.shaded.snakeyaml.LoaderOptions p3, com.github.javafaker.shaded.snakeyaml.resolver.Resolver p4)`
- `public Yaml(com.github.javafaker.shaded.snakeyaml.constructor.BaseConstructor p0, com.github.javafaker.shaded.snakeyaml.representer.Representer p1, com.github.javafaker.shaded.snakeyaml.DumperOptions p2, com.github.javafaker.shaded.snakeyaml.resolver.Resolver p3)`
- `public Yaml(com.github.javafaker.shaded.snakeyaml.representer.Representer p0)`
- `public Yaml(com.github.javafaker.shaded.snakeyaml.representer.Representer p0, com.github.javafaker.shaded.snakeyaml.DumperOptions p1)`

**Fields:**
- `protected com.github.javafaker.shaded.snakeyaml.constructor.BaseConstructor constructor`
- `protected com.github.javafaker.shaded.snakeyaml.DumperOptions dumperOptions`
- `protected com.github.javafaker.shaded.snakeyaml.LoaderOptions loadingConfig`
- `protected com.github.javafaker.shaded.snakeyaml.representer.Representer representer`
- `protected final com.github.javafaker.shaded.snakeyaml.resolver.Resolver resolver`

**Methods:**
- `public void addImplicitResolver(com.github.javafaker.shaded.snakeyaml.nodes.Tag p0, java.util.regex.Pattern p1, java.lang.String p2)`
- `public void addTypeDescription(com.github.javafaker.shaded.snakeyaml.TypeDescription p0)`
- `public com.github.javafaker.shaded.snakeyaml.nodes.Node compose(java.io.Reader p0)`
- `public java.lang.Iterable composeAll(java.io.Reader p0)`
- `public java.lang.String dump(java.lang.Object p0)`
- `public void dump(java.lang.Object p0, java.io.Writer p1)`
- `public java.lang.String dumpAll(java.util.Iterator p0)`
- `public void dumpAll(java.util.Iterator p0, java.io.Writer p1)`
- `public java.lang.String dumpAs(java.lang.Object p0, com.github.javafaker.shaded.snakeyaml.nodes.Tag p1, com.github.javafaker.shaded.snakeyaml.DumperOptions$FlowStyle p2)`
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
- `public com.github.javafaker.shaded.snakeyaml.nodes.Node represent(java.lang.Object p0)`
- `public java.util.List serialize(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`
- `public void serialize(com.github.javafaker.shaded.snakeyaml.nodes.Node p0, java.io.Writer p1)`
- `public void setBeanAccess(com.github.javafaker.shaded.snakeyaml.introspector.BeanAccess p0)`
- `public void setName(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public class `com.github.javafaker.shaded.snakeyaml.comments.CommentEventsCollector`

**Constructors:**
- `public CommentEventsCollector(com.github.javafaker.shaded.snakeyaml.parser.Parser p0, com.github.javafaker.shaded.snakeyaml.comments.CommentType... p1)`
- `public CommentEventsCollector(java.util.Queue p0, com.github.javafaker.shaded.snakeyaml.comments.CommentType... p1)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.comments.CommentEventsCollector collectEvents()`
- `public com.github.javafaker.shaded.snakeyaml.events.Event collectEvents(com.github.javafaker.shaded.snakeyaml.events.Event p0)`
- `public com.github.javafaker.shaded.snakeyaml.events.Event collectEventsAndPoll(com.github.javafaker.shaded.snakeyaml.events.Event p0)`
- `public java.util.List consume()`
- `public boolean isEmpty()`

---

## public class `com.github.javafaker.shaded.snakeyaml.comments.CommentLine`

**Constructors:**
- `public CommentLine(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1, java.lang.String p2, com.github.javafaker.shaded.snakeyaml.comments.CommentType p3)`
- `public CommentLine(com.github.javafaker.shaded.snakeyaml.events.CommentEvent p0)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.comments.CommentType getCommentType()`
- `public com.github.javafaker.shaded.snakeyaml.error.Mark getEndMark()`
- `public com.github.javafaker.shaded.snakeyaml.error.Mark getStartMark()`
- `public java.lang.String getValue()`
- `public java.lang.String toString()`

---

## public final enum `com.github.javafaker.shaded.snakeyaml.comments.CommentType`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javafaker.shaded.snakeyaml.comments.CommentType BLANK_LINE`
- `public final static com.github.javafaker.shaded.snakeyaml.comments.CommentType BLOCK`
- `public final static com.github.javafaker.shaded.snakeyaml.comments.CommentType IN_LINE`

---

## public class `com.github.javafaker.shaded.snakeyaml.composer.Composer`

**Constructors:**
- `public Composer(com.github.javafaker.shaded.snakeyaml.parser.Parser p0, com.github.javafaker.shaded.snakeyaml.resolver.Resolver p1)`
- `public Composer(com.github.javafaker.shaded.snakeyaml.parser.Parser p0, com.github.javafaker.shaded.snakeyaml.resolver.Resolver p1, com.github.javafaker.shaded.snakeyaml.LoaderOptions p2)`

**Fields:**
- `protected final com.github.javafaker.shaded.snakeyaml.parser.Parser parser`

**Methods:**
- `public boolean checkNode()`
- `protected com.github.javafaker.shaded.snakeyaml.nodes.Node composeKeyNode(com.github.javafaker.shaded.snakeyaml.nodes.MappingNode p0)`
- `protected void composeMappingChildren(java.util.List p0, com.github.javafaker.shaded.snakeyaml.nodes.MappingNode p1)`
- `protected com.github.javafaker.shaded.snakeyaml.nodes.Node composeMappingNode(java.lang.String p0)`
- `protected com.github.javafaker.shaded.snakeyaml.nodes.Node composeScalarNode(java.lang.String p0, java.util.List p1)`
- `protected com.github.javafaker.shaded.snakeyaml.nodes.Node composeSequenceNode(java.lang.String p0)`
- `protected com.github.javafaker.shaded.snakeyaml.nodes.Node composeValueNode(com.github.javafaker.shaded.snakeyaml.nodes.MappingNode p0)`
- `public com.github.javafaker.shaded.snakeyaml.nodes.Node getNode()`
- `public com.github.javafaker.shaded.snakeyaml.nodes.Node getSingleNode()`

---

## public class `com.github.javafaker.shaded.snakeyaml.composer.ComposerException`
extends `com.github.javafaker.shaded.snakeyaml.error.MarkedYAMLException`  

**Constructors:**
- `protected ComposerException(java.lang.String p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1, java.lang.String p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3)`

---

## public abstract class `com.github.javafaker.shaded.snakeyaml.constructor.AbstractConstruct`
implements `com.github.javafaker.shaded.snakeyaml.constructor.Construct`  

**Constructors:**
- `public AbstractConstruct()`

**Methods:**
- `public void construct2ndStep(com.github.javafaker.shaded.snakeyaml.nodes.Node p0, java.lang.Object p1)`

---

## public abstract class `com.github.javafaker.shaded.snakeyaml.constructor.BaseConstructor`

**Constructors:**
- `public BaseConstructor()`
- `public BaseConstructor(com.github.javafaker.shaded.snakeyaml.LoaderOptions p0)`

**Fields:**
- `protected com.github.javafaker.shaded.snakeyaml.composer.Composer composer`
- `protected com.github.javafaker.shaded.snakeyaml.LoaderOptions loadingConfig`
- `protected com.github.javafaker.shaded.snakeyaml.nodes.Tag rootTag`
- `protected final java.util.Map typeDefinitions`
- `protected final java.util.Map typeTags`
- `protected final java.util.Map yamlClassConstructors`
- `protected final java.util.Map yamlConstructors`
- `protected final java.util.Map yamlMultiConstructors`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.TypeDescription addTypeDescription(com.github.javafaker.shaded.snakeyaml.TypeDescription p0)`
- `public boolean checkData()`
- `protected java.lang.Object constructArray(com.github.javafaker.shaded.snakeyaml.nodes.SequenceNode p0)`
- `protected java.lang.Object constructArrayStep2(com.github.javafaker.shaded.snakeyaml.nodes.SequenceNode p0, java.lang.Object p1)`
- `protected final java.lang.Object constructDocument(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`
- `protected java.util.Map constructMapping(com.github.javafaker.shaded.snakeyaml.nodes.MappingNode p0)`
- `protected void constructMapping2ndStep(com.github.javafaker.shaded.snakeyaml.nodes.MappingNode p0, java.util.Map p1)`
- `protected java.lang.Object constructObject(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`
- `protected java.lang.Object constructObjectNoCheck(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`
- `protected java.lang.String constructScalar(com.github.javafaker.shaded.snakeyaml.nodes.ScalarNode p0)`
- `protected java.util.List constructSequence(com.github.javafaker.shaded.snakeyaml.nodes.SequenceNode p0)`
- `protected void constructSequenceStep2(com.github.javafaker.shaded.snakeyaml.nodes.SequenceNode p0, java.util.Collection p1)`
- `protected java.util.Set constructSet(com.github.javafaker.shaded.snakeyaml.nodes.MappingNode p0)`
- `protected java.util.Set constructSet(com.github.javafaker.shaded.snakeyaml.nodes.SequenceNode p0)`
- `protected void constructSet2ndStep(com.github.javafaker.shaded.snakeyaml.nodes.MappingNode p0, java.util.Set p1)`
- `protected java.lang.Object createArray(java.lang.Class p0, int p1)`
- `protected java.util.List createDefaultList(int p0)`
- `protected java.util.Map createDefaultMap(int p0)`
- `protected java.util.Set createDefaultSet(int p0)`
- `protected java.lang.Object finalizeConstruction(com.github.javafaker.shaded.snakeyaml.nodes.Node p0, java.lang.Object p1)`
- `protected com.github.javafaker.shaded.snakeyaml.constructor.Construct getConstructor(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`
- `public java.lang.Object getData() throws java.util.NoSuchElementException`
- `public final com.github.javafaker.shaded.snakeyaml.introspector.PropertyUtils getPropertyUtils()`
- `public java.lang.Object getSingleData(java.lang.Class p0)`
- `public boolean isAllowDuplicateKeys()`
- `public boolean isEnumCaseSensitive()`
- `public final boolean isExplicitPropertyUtils()`
- `public boolean isWrappedToRootException()`
- `protected java.lang.Object newInstance(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`
- `protected final java.lang.Object newInstance(java.lang.Class p0, com.github.javafaker.shaded.snakeyaml.nodes.Node p1) throws java.lang.InstantiationException`
- `protected java.lang.Object newInstance(java.lang.Class p0, com.github.javafaker.shaded.snakeyaml.nodes.Node p1, boolean p2) throws java.lang.InstantiationException`
- `protected java.util.List newList(com.github.javafaker.shaded.snakeyaml.nodes.SequenceNode p0)`
- `protected java.util.Map newMap(com.github.javafaker.shaded.snakeyaml.nodes.MappingNode p0)`
- `protected java.util.Set newSet(com.github.javafaker.shaded.snakeyaml.nodes.CollectionNode p0)`
- `protected void postponeMapFilling(java.util.Map p0, java.lang.Object p1, java.lang.Object p2)`
- `protected void postponeSetFilling(java.util.Set p0, java.lang.Object p1)`
- `public void setAllowDuplicateKeys(boolean p0)`
- `public void setComposer(com.github.javafaker.shaded.snakeyaml.composer.Composer p0)`
- `public void setEnumCaseSensitive(boolean p0)`
- `public void setPropertyUtils(com.github.javafaker.shaded.snakeyaml.introspector.PropertyUtils p0)`
- `public void setWrappedToRootException(boolean p0)`

---

## public abstract interface `com.github.javafaker.shaded.snakeyaml.constructor.Construct`

**Methods:**
- `public abstract java.lang.Object construct(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`
- `public abstract void construct2ndStep(com.github.javafaker.shaded.snakeyaml.nodes.Node p0, java.lang.Object p1)`

---

## public class `com.github.javafaker.shaded.snakeyaml.constructor.Constructor`
extends `com.github.javafaker.shaded.snakeyaml.constructor.SafeConstructor`  

**Constructors:**
- `public Constructor()`
- `public Constructor(com.github.javafaker.shaded.snakeyaml.LoaderOptions p0)`
- `public Constructor(com.github.javafaker.shaded.snakeyaml.TypeDescription p0)`
- `public Constructor(com.github.javafaker.shaded.snakeyaml.TypeDescription p0, com.github.javafaker.shaded.snakeyaml.LoaderOptions p1)`
- `public Constructor(com.github.javafaker.shaded.snakeyaml.TypeDescription p0, java.util.Collection p1)`
- `public Constructor(com.github.javafaker.shaded.snakeyaml.TypeDescription p0, java.util.Collection p1, com.github.javafaker.shaded.snakeyaml.LoaderOptions p2)`
- `public Constructor(java.lang.Class p0)`
- `public Constructor(java.lang.Class p0, com.github.javafaker.shaded.snakeyaml.LoaderOptions p1)`
- `public Constructor(java.lang.String p0) throws java.lang.ClassNotFoundException`
- `public Constructor(java.lang.String p0, com.github.javafaker.shaded.snakeyaml.LoaderOptions p1) throws java.lang.ClassNotFoundException`

**Methods:**
- `protected java.lang.Class getClassForName(java.lang.String p0) throws java.lang.ClassNotFoundException`
- `protected java.lang.Class getClassForNode(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`

---

## protected class `com.github.javafaker.shaded.snakeyaml.constructor.Constructor$ConstructMapping`
implements `com.github.javafaker.shaded.snakeyaml.constructor.Construct`  

**Constructors:**
- `protected ConstructMapping()`

**Methods:**
- `public java.lang.Object construct(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`
- `public void construct2ndStep(com.github.javafaker.shaded.snakeyaml.nodes.Node p0, java.lang.Object p1)`
- `protected java.lang.Object constructJavaBean2ndStep(com.github.javafaker.shaded.snakeyaml.nodes.MappingNode p0, java.lang.Object p1)`
- `protected com.github.javafaker.shaded.snakeyaml.introspector.Property getProperty(java.lang.Class p0, java.lang.String p1)`

---

## protected class `com.github.javafaker.shaded.snakeyaml.constructor.Constructor$ConstructScalar`
extends `com.github.javafaker.shaded.snakeyaml.constructor.AbstractConstruct`  

**Constructors:**
- `protected ConstructScalar()`

**Methods:**
- `public java.lang.Object construct(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`

---

## protected class `com.github.javafaker.shaded.snakeyaml.constructor.Constructor$ConstructSequence`
implements `com.github.javafaker.shaded.snakeyaml.constructor.Construct`  

**Constructors:**
- `protected ConstructSequence()`

**Methods:**
- `public java.lang.Object construct(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`
- `public void construct2ndStep(com.github.javafaker.shaded.snakeyaml.nodes.Node p0, java.lang.Object p1)`

---

## protected class `com.github.javafaker.shaded.snakeyaml.constructor.Constructor$ConstructYamlObject`
implements `com.github.javafaker.shaded.snakeyaml.constructor.Construct`  

**Constructors:**
- `protected ConstructYamlObject()`

**Methods:**
- `public java.lang.Object construct(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`
- `public void construct2ndStep(com.github.javafaker.shaded.snakeyaml.nodes.Node p0, java.lang.Object p1)`

---

## public class `com.github.javafaker.shaded.snakeyaml.constructor.ConstructorException`
extends `com.github.javafaker.shaded.snakeyaml.error.MarkedYAMLException`  

**Constructors:**
- `protected ConstructorException(java.lang.String p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1, java.lang.String p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3)`
- `protected ConstructorException(java.lang.String p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1, java.lang.String p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3, java.lang.Throwable p4)`

---

## public class `com.github.javafaker.shaded.snakeyaml.constructor.CustomClassLoaderConstructor`
extends `com.github.javafaker.shaded.snakeyaml.constructor.Constructor`  

**Constructors:**
- `public CustomClassLoaderConstructor(java.lang.Class p0, java.lang.ClassLoader p1)`
- `public CustomClassLoaderConstructor(java.lang.ClassLoader p0)`

**Methods:**
- `protected java.lang.Class getClassForName(java.lang.String p0) throws java.lang.ClassNotFoundException`

---

## public class `com.github.javafaker.shaded.snakeyaml.constructor.DuplicateKeyException`
extends `com.github.javafaker.shaded.snakeyaml.constructor.ConstructorException`  

**Constructors:**
- `protected DuplicateKeyException(com.github.javafaker.shaded.snakeyaml.error.Mark p0, java.lang.Object p1, com.github.javafaker.shaded.snakeyaml.error.Mark p2)`

---

## public class `com.github.javafaker.shaded.snakeyaml.constructor.SafeConstructor`
extends `com.github.javafaker.shaded.snakeyaml.constructor.BaseConstructor`  

**Constructors:**
- `public SafeConstructor()`
- `public SafeConstructor(com.github.javafaker.shaded.snakeyaml.LoaderOptions p0)`

**Fields:**
- `public final static com.github.javafaker.shaded.snakeyaml.constructor.SafeConstructor$ConstructUndefined undefinedConstructor`

**Methods:**
- `protected void constructMapping2ndStep(com.github.javafaker.shaded.snakeyaml.nodes.MappingNode p0, java.util.Map p1)`
- `protected void constructSet2ndStep(com.github.javafaker.shaded.snakeyaml.nodes.MappingNode p0, java.util.Set p1)`
- `protected static java.lang.Number createLongOrBigInteger(java.lang.String p0, int p1)`
- `protected void flattenMapping(com.github.javafaker.shaded.snakeyaml.nodes.MappingNode p0)`
- `protected void processDuplicateKeys(com.github.javafaker.shaded.snakeyaml.nodes.MappingNode p0)`

---

## public final static class `com.github.javafaker.shaded.snakeyaml.constructor.SafeConstructor$ConstructUndefined`
extends `com.github.javafaker.shaded.snakeyaml.constructor.AbstractConstruct`  

**Constructors:**
- `public ConstructUndefined()`

**Methods:**
- `public java.lang.Object construct(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`

---

## public class `com.github.javafaker.shaded.snakeyaml.constructor.SafeConstructor$ConstructYamlBinary`
extends `com.github.javafaker.shaded.snakeyaml.constructor.AbstractConstruct`  

**Constructors:**
- `public ConstructYamlBinary()`

**Methods:**
- `public java.lang.Object construct(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`

---

## public class `com.github.javafaker.shaded.snakeyaml.constructor.SafeConstructor$ConstructYamlBool`
extends `com.github.javafaker.shaded.snakeyaml.constructor.AbstractConstruct`  

**Constructors:**
- `public ConstructYamlBool()`

**Methods:**
- `public java.lang.Object construct(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`

---

## public class `com.github.javafaker.shaded.snakeyaml.constructor.SafeConstructor$ConstructYamlFloat`
extends `com.github.javafaker.shaded.snakeyaml.constructor.AbstractConstruct`  

**Constructors:**
- `public ConstructYamlFloat()`

**Methods:**
- `public java.lang.Object construct(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`

---

## public class `com.github.javafaker.shaded.snakeyaml.constructor.SafeConstructor$ConstructYamlInt`
extends `com.github.javafaker.shaded.snakeyaml.constructor.AbstractConstruct`  

**Constructors:**
- `public ConstructYamlInt()`

**Methods:**
- `public java.lang.Object construct(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`

---

## public class `com.github.javafaker.shaded.snakeyaml.constructor.SafeConstructor$ConstructYamlMap`
implements `com.github.javafaker.shaded.snakeyaml.constructor.Construct`  

**Constructors:**
- `public ConstructYamlMap()`

**Methods:**
- `public java.lang.Object construct(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`
- `public void construct2ndStep(com.github.javafaker.shaded.snakeyaml.nodes.Node p0, java.lang.Object p1)`

---

## public class `com.github.javafaker.shaded.snakeyaml.constructor.SafeConstructor$ConstructYamlNull`
extends `com.github.javafaker.shaded.snakeyaml.constructor.AbstractConstruct`  

**Constructors:**
- `public ConstructYamlNull()`

**Methods:**
- `public java.lang.Object construct(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`

---

## public class `com.github.javafaker.shaded.snakeyaml.constructor.SafeConstructor$ConstructYamlOmap`
extends `com.github.javafaker.shaded.snakeyaml.constructor.AbstractConstruct`  

**Constructors:**
- `public ConstructYamlOmap()`

**Methods:**
- `public java.lang.Object construct(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`

---

## public class `com.github.javafaker.shaded.snakeyaml.constructor.SafeConstructor$ConstructYamlPairs`
extends `com.github.javafaker.shaded.snakeyaml.constructor.AbstractConstruct`  

**Constructors:**
- `public ConstructYamlPairs()`

**Methods:**
- `public java.lang.Object construct(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`

---

## public class `com.github.javafaker.shaded.snakeyaml.constructor.SafeConstructor$ConstructYamlSeq`
implements `com.github.javafaker.shaded.snakeyaml.constructor.Construct`  

**Constructors:**
- `public ConstructYamlSeq()`

**Methods:**
- `public java.lang.Object construct(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`
- `public void construct2ndStep(com.github.javafaker.shaded.snakeyaml.nodes.Node p0, java.lang.Object p1)`

---

## public class `com.github.javafaker.shaded.snakeyaml.constructor.SafeConstructor$ConstructYamlSet`
implements `com.github.javafaker.shaded.snakeyaml.constructor.Construct`  

**Constructors:**
- `public ConstructYamlSet()`

**Methods:**
- `public java.lang.Object construct(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`
- `public void construct2ndStep(com.github.javafaker.shaded.snakeyaml.nodes.Node p0, java.lang.Object p1)`

---

## public class `com.github.javafaker.shaded.snakeyaml.constructor.SafeConstructor$ConstructYamlStr`
extends `com.github.javafaker.shaded.snakeyaml.constructor.AbstractConstruct`  

**Constructors:**
- `public ConstructYamlStr()`

**Methods:**
- `public java.lang.Object construct(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`

---

## public static class `com.github.javafaker.shaded.snakeyaml.constructor.SafeConstructor$ConstructYamlTimestamp`
extends `com.github.javafaker.shaded.snakeyaml.constructor.AbstractConstruct`  

**Constructors:**
- `public ConstructYamlTimestamp()`

**Methods:**
- `public java.lang.Object construct(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`
- `public java.util.Calendar getCalendar()`

---

## public abstract interface `com.github.javafaker.shaded.snakeyaml.emitter.Emitable`

**Methods:**
- `public abstract void emit(com.github.javafaker.shaded.snakeyaml.events.Event p0) throws java.io.IOException`

---

## public final class `com.github.javafaker.shaded.snakeyaml.emitter.Emitter`
implements `com.github.javafaker.shaded.snakeyaml.emitter.Emitable`  

**Constructors:**
- `public Emitter(java.io.Writer p0, com.github.javafaker.shaded.snakeyaml.DumperOptions p1)`

**Fields:**
- `public final static int MAX_INDENT`
- `public final static int MIN_INDENT`

**Methods:**
- `public void emit(com.github.javafaker.shaded.snakeyaml.events.Event p0) throws java.io.IOException`

---

## public class `com.github.javafaker.shaded.snakeyaml.emitter.EmitterException`
extends `com.github.javafaker.shaded.snakeyaml.error.YAMLException`  

**Constructors:**
- `public EmitterException(java.lang.String p0)`

---

## public final class `com.github.javafaker.shaded.snakeyaml.emitter.ScalarAnalysis`

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

## public class `com.github.javafaker.shaded.snakeyaml.env.EnvScalarConstructor`
extends `com.github.javafaker.shaded.snakeyaml.constructor.Constructor`  

**Constructors:**
- `public EnvScalarConstructor()`

**Fields:**
- `public final static java.util.regex.Pattern ENV_FORMAT`
- `public final static com.github.javafaker.shaded.snakeyaml.nodes.Tag ENV_TAG`

**Methods:**
- `public java.lang.String apply(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3)`
- `public java.lang.String getEnv(java.lang.String p0)`

---

## public final class `com.github.javafaker.shaded.snakeyaml.error.Mark`
implements `java.io.Serializable`  

**Constructors:**
- `public Mark(java.lang.String p0, int p1, int p2, int p3, char[] p4, int p5)`
- `public Mark(java.lang.String p0, int p1, int p2, int p3, int[] p4, int p5)`
- `public Mark(java.lang.String p0, int p1, int p2, int p3, java.lang.String p4, int p5)`

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

## public class `com.github.javafaker.shaded.snakeyaml.error.MarkedYAMLException`
extends `com.github.javafaker.shaded.snakeyaml.error.YAMLException`  

**Constructors:**
- `protected MarkedYAMLException(java.lang.String p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1, java.lang.String p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3)`
- `protected MarkedYAMLException(java.lang.String p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1, java.lang.String p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3, java.lang.String p4)`
- `protected MarkedYAMLException(java.lang.String p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1, java.lang.String p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3, java.lang.String p4, java.lang.Throwable p5)`
- `protected MarkedYAMLException(java.lang.String p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1, java.lang.String p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3, java.lang.Throwable p4)`

**Methods:**
- `public java.lang.String getContext()`
- `public com.github.javafaker.shaded.snakeyaml.error.Mark getContextMark()`
- `public java.lang.String getMessage()`
- `public java.lang.String getProblem()`
- `public com.github.javafaker.shaded.snakeyaml.error.Mark getProblemMark()`
- `public java.lang.String toString()`

---

## public class `com.github.javafaker.shaded.snakeyaml.error.MissingEnvironmentVariableException`
extends `com.github.javafaker.shaded.snakeyaml.error.YAMLException`  

**Constructors:**
- `public MissingEnvironmentVariableException(java.lang.String p0)`

---

## public class `com.github.javafaker.shaded.snakeyaml.error.YAMLException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public YAMLException(java.lang.String p0)`
- `public YAMLException(java.lang.String p0, java.lang.Throwable p1)`
- `public YAMLException(java.lang.Throwable p0)`

---

## public final class `com.github.javafaker.shaded.snakeyaml.events.AliasEvent`
extends `com.github.javafaker.shaded.snakeyaml.events.NodeEvent`  

**Constructors:**
- `public AliasEvent(java.lang.String p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1, com.github.javafaker.shaded.snakeyaml.error.Mark p2)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.events.Event$ID getEventId()`

---

## public abstract class `com.github.javafaker.shaded.snakeyaml.events.CollectionEndEvent`
extends `com.github.javafaker.shaded.snakeyaml.events.Event`  

**Constructors:**
- `public CollectionEndEvent(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1)`

---

## public abstract class `com.github.javafaker.shaded.snakeyaml.events.CollectionStartEvent`
extends `com.github.javafaker.shaded.snakeyaml.events.NodeEvent`  

**Constructors:**
- `public CollectionStartEvent(java.lang.String p0, java.lang.String p1, boolean p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3, com.github.javafaker.shaded.snakeyaml.error.Mark p4, com.github.javafaker.shaded.snakeyaml.DumperOptions$FlowStyle p5)`
- `public CollectionStartEvent(java.lang.String p0, java.lang.String p1, boolean p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3, com.github.javafaker.shaded.snakeyaml.error.Mark p4, java.lang.Boolean p5)`

**Methods:**
- `protected java.lang.String getArguments()`
- `public com.github.javafaker.shaded.snakeyaml.DumperOptions$FlowStyle getFlowStyle()`
- `public boolean getImplicit()`
- `public java.lang.String getTag()`
- `public boolean isFlow()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.events.CommentEvent`
extends `com.github.javafaker.shaded.snakeyaml.events.Event`  

**Constructors:**
- `public CommentEvent(com.github.javafaker.shaded.snakeyaml.comments.CommentType p0, java.lang.String p1, com.github.javafaker.shaded.snakeyaml.error.Mark p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.comments.CommentType getCommentType()`
- `public com.github.javafaker.shaded.snakeyaml.events.Event$ID getEventId()`
- `public java.lang.String getValue()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.events.DocumentEndEvent`
extends `com.github.javafaker.shaded.snakeyaml.events.Event`  

**Constructors:**
- `public DocumentEndEvent(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1, boolean p2)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.events.Event$ID getEventId()`
- `public boolean getExplicit()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.events.DocumentStartEvent`
extends `com.github.javafaker.shaded.snakeyaml.events.Event`  

**Constructors:**
- `public DocumentStartEvent(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1, boolean p2, com.github.javafaker.shaded.snakeyaml.DumperOptions$Version p3, java.util.Map p4)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.events.Event$ID getEventId()`
- `public boolean getExplicit()`
- `public java.util.Map getTags()`
- `public com.github.javafaker.shaded.snakeyaml.DumperOptions$Version getVersion()`

---

## public abstract class `com.github.javafaker.shaded.snakeyaml.events.Event`

**Constructors:**
- `public Event(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `protected java.lang.String getArguments()`
- `public com.github.javafaker.shaded.snakeyaml.error.Mark getEndMark()`
- `public abstract com.github.javafaker.shaded.snakeyaml.events.Event$ID getEventId()`
- `public com.github.javafaker.shaded.snakeyaml.error.Mark getStartMark()`
- `public int hashCode()`
- `public boolean is(com.github.javafaker.shaded.snakeyaml.events.Event$ID p0)`
- `public java.lang.String toString()`

---

## public final static enum `com.github.javafaker.shaded.snakeyaml.events.Event$ID`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javafaker.shaded.snakeyaml.events.Event$ID Alias`
- `public final static com.github.javafaker.shaded.snakeyaml.events.Event$ID Comment`
- `public final static com.github.javafaker.shaded.snakeyaml.events.Event$ID DocumentEnd`
- `public final static com.github.javafaker.shaded.snakeyaml.events.Event$ID DocumentStart`
- `public final static com.github.javafaker.shaded.snakeyaml.events.Event$ID MappingEnd`
- `public final static com.github.javafaker.shaded.snakeyaml.events.Event$ID MappingStart`
- `public final static com.github.javafaker.shaded.snakeyaml.events.Event$ID Scalar`
- `public final static com.github.javafaker.shaded.snakeyaml.events.Event$ID SequenceEnd`
- `public final static com.github.javafaker.shaded.snakeyaml.events.Event$ID SequenceStart`
- `public final static com.github.javafaker.shaded.snakeyaml.events.Event$ID StreamEnd`
- `public final static com.github.javafaker.shaded.snakeyaml.events.Event$ID StreamStart`

---

## public class `com.github.javafaker.shaded.snakeyaml.events.ImplicitTuple`

**Constructors:**
- `public ImplicitTuple(boolean p0, boolean p1)`

**Methods:**
- `public boolean bothFalse()`
- `public boolean canOmitTagInNonPlainScalar()`
- `public boolean canOmitTagInPlainScalar()`
- `public java.lang.String toString()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.events.MappingEndEvent`
extends `com.github.javafaker.shaded.snakeyaml.events.CollectionEndEvent`  

**Constructors:**
- `public MappingEndEvent(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.events.Event$ID getEventId()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.events.MappingStartEvent`
extends `com.github.javafaker.shaded.snakeyaml.events.CollectionStartEvent`  

**Constructors:**
- `public MappingStartEvent(java.lang.String p0, java.lang.String p1, boolean p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3, com.github.javafaker.shaded.snakeyaml.error.Mark p4, com.github.javafaker.shaded.snakeyaml.DumperOptions$FlowStyle p5)`
- `public MappingStartEvent(java.lang.String p0, java.lang.String p1, boolean p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3, com.github.javafaker.shaded.snakeyaml.error.Mark p4, java.lang.Boolean p5)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.events.Event$ID getEventId()`

---

## public abstract class `com.github.javafaker.shaded.snakeyaml.events.NodeEvent`
extends `com.github.javafaker.shaded.snakeyaml.events.Event`  

**Constructors:**
- `public NodeEvent(java.lang.String p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1, com.github.javafaker.shaded.snakeyaml.error.Mark p2)`

**Methods:**
- `public java.lang.String getAnchor()`
- `protected java.lang.String getArguments()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.events.ScalarEvent`
extends `com.github.javafaker.shaded.snakeyaml.events.NodeEvent`  

**Constructors:**
- `public ScalarEvent(java.lang.String p0, java.lang.String p1, com.github.javafaker.shaded.snakeyaml.events.ImplicitTuple p2, java.lang.String p3, com.github.javafaker.shaded.snakeyaml.error.Mark p4, com.github.javafaker.shaded.snakeyaml.error.Mark p5, com.github.javafaker.shaded.snakeyaml.DumperOptions$ScalarStyle p6)`
- `public ScalarEvent(java.lang.String p0, java.lang.String p1, com.github.javafaker.shaded.snakeyaml.events.ImplicitTuple p2, java.lang.String p3, com.github.javafaker.shaded.snakeyaml.error.Mark p4, com.github.javafaker.shaded.snakeyaml.error.Mark p5, java.lang.Character p6)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.events.Event$ID getEventId()`
- `public com.github.javafaker.shaded.snakeyaml.events.ImplicitTuple getImplicit()`
- `public com.github.javafaker.shaded.snakeyaml.DumperOptions$ScalarStyle getScalarStyle()`
- `public java.lang.Character getStyle()`
- `public java.lang.String getTag()`
- `public java.lang.String getValue()`
- `public boolean isPlain()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.events.SequenceEndEvent`
extends `com.github.javafaker.shaded.snakeyaml.events.CollectionEndEvent`  

**Constructors:**
- `public SequenceEndEvent(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.events.Event$ID getEventId()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.events.SequenceStartEvent`
extends `com.github.javafaker.shaded.snakeyaml.events.CollectionStartEvent`  

**Constructors:**
- `public SequenceStartEvent(java.lang.String p0, java.lang.String p1, boolean p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3, com.github.javafaker.shaded.snakeyaml.error.Mark p4, com.github.javafaker.shaded.snakeyaml.DumperOptions$FlowStyle p5)`
- `public SequenceStartEvent(java.lang.String p0, java.lang.String p1, boolean p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3, com.github.javafaker.shaded.snakeyaml.error.Mark p4, java.lang.Boolean p5)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.events.Event$ID getEventId()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.events.StreamEndEvent`
extends `com.github.javafaker.shaded.snakeyaml.events.Event`  

**Constructors:**
- `public StreamEndEvent(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.events.Event$ID getEventId()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.events.StreamStartEvent`
extends `com.github.javafaker.shaded.snakeyaml.events.Event`  

**Constructors:**
- `public StreamStartEvent(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.events.Event$ID getEventId()`

---

## public class `com.github.javafaker.shaded.snakeyaml.extensions.compactnotation.CompactConstructor`
extends `com.github.javafaker.shaded.snakeyaml.constructor.Constructor`  

**Constructors:**
- `public CompactConstructor()`

**Methods:**
- `protected void applySequence(java.lang.Object p0, java.util.List p1)`
- `protected java.lang.Object constructCompactFormat(com.github.javafaker.shaded.snakeyaml.nodes.ScalarNode p0, com.github.javafaker.shaded.snakeyaml.extensions.compactnotation.CompactData p1)`
- `protected com.github.javafaker.shaded.snakeyaml.constructor.Construct createCompactConstruct()`
- `protected java.lang.Object createInstance(com.github.javafaker.shaded.snakeyaml.nodes.ScalarNode p0, com.github.javafaker.shaded.snakeyaml.extensions.compactnotation.CompactData p1) throws java.lang.Exception`
- `public com.github.javafaker.shaded.snakeyaml.extensions.compactnotation.CompactData getCompactData(java.lang.String p0)`
- `protected com.github.javafaker.shaded.snakeyaml.constructor.Construct getConstructor(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`
- `protected java.lang.String getSequencePropertyName(java.lang.Class p0)`
- `protected void setProperties(java.lang.Object p0, java.util.Map p1) throws java.lang.Exception`

---

## public class `com.github.javafaker.shaded.snakeyaml.extensions.compactnotation.CompactConstructor$ConstructCompactObject`
extends `com.github.javafaker.shaded.snakeyaml.constructor.Constructor$ConstructMapping`  

**Constructors:**
- `public ConstructCompactObject()`

**Methods:**
- `public java.lang.Object construct(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`
- `public void construct2ndStep(com.github.javafaker.shaded.snakeyaml.nodes.Node p0, java.lang.Object p1)`

---

## public class `com.github.javafaker.shaded.snakeyaml.extensions.compactnotation.CompactData`

**Constructors:**
- `public CompactData(java.lang.String p0)`

**Methods:**
- `public java.util.List getArguments()`
- `public java.lang.String getPrefix()`
- `public java.util.Map getProperties()`
- `public java.lang.String toString()`

---

## public class `com.github.javafaker.shaded.snakeyaml.extensions.compactnotation.PackageCompactConstructor`
extends `com.github.javafaker.shaded.snakeyaml.extensions.compactnotation.CompactConstructor`  

**Constructors:**
- `public PackageCompactConstructor(java.lang.String p0)`

**Methods:**
- `protected java.lang.Class getClassForName(java.lang.String p0) throws java.lang.ClassNotFoundException`

---

## public class `com.github.javafaker.shaded.snakeyaml.external.biz.base64Coder.Base64Coder`

**Methods:**
- `public static byte[] decode(char[] p0)`
- `public static byte[] decode(char[] p0, int p1, int p2)`
- `public static byte[] decode(java.lang.String p0)`
- `public static byte[] decodeLines(java.lang.String p0)`
- `public static java.lang.String decodeString(java.lang.String p0)`
- `public static char[] encode(byte[] p0)`
- `public static char[] encode(byte[] p0, int p1)`
- `public static char[] encode(byte[] p0, int p1, int p2)`
- `public static java.lang.String encodeLines(byte[] p0)`
- `public static java.lang.String encodeLines(byte[] p0, int p1, int p2, int p3, java.lang.String p4)`
- `public static java.lang.String encodeString(java.lang.String p0)`

---

## public abstract interface `com.github.javafaker.shaded.snakeyaml.external.com.google.gdata.util.common.base.Escaper`

**Methods:**
- `public abstract java.lang.Appendable escape(java.lang.Appendable p0)`
- `public abstract java.lang.String escape(java.lang.String p0)`

---

## public class `com.github.javafaker.shaded.snakeyaml.external.com.google.gdata.util.common.base.PercentEscaper`
extends `com.github.javafaker.shaded.snakeyaml.external.com.google.gdata.util.common.base.UnicodeEscaper`  

**Constructors:**
- `public PercentEscaper(java.lang.String p0, boolean p1)`

**Fields:**
- `public final static java.lang.String SAFECHARS_URLENCODER`
- `public final static java.lang.String SAFEPATHCHARS_URLENCODER`
- `public final static java.lang.String SAFEQUERYSTRINGCHARS_URLENCODER`

**Methods:**
- `protected char[] escape(int p0)`
- `public java.lang.String escape(java.lang.String p0)`
- `protected int nextEscapeIndex(java.lang.CharSequence p0, int p1, int p2)`

---

## public abstract class `com.github.javafaker.shaded.snakeyaml.external.com.google.gdata.util.common.base.UnicodeEscaper`
implements `com.github.javafaker.shaded.snakeyaml.external.com.google.gdata.util.common.base.Escaper`  

**Constructors:**
- `public UnicodeEscaper()`

**Methods:**
- `protected final static int codePointAt(java.lang.CharSequence p0, int p1, int p2)`
- `protected abstract char[] escape(int p0)`
- `public java.lang.Appendable escape(java.lang.Appendable p0)`
- `public java.lang.String escape(java.lang.String p0)`
- `protected final java.lang.String escapeSlow(java.lang.String p0, int p1)`
- `protected int nextEscapeIndex(java.lang.CharSequence p0, int p1, int p2)`

---

## public final enum `com.github.javafaker.shaded.snakeyaml.introspector.BeanAccess`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javafaker.shaded.snakeyaml.introspector.BeanAccess DEFAULT`
- `public final static com.github.javafaker.shaded.snakeyaml.introspector.BeanAccess FIELD`
- `public final static com.github.javafaker.shaded.snakeyaml.introspector.BeanAccess PROPERTY`

---

## public class `com.github.javafaker.shaded.snakeyaml.introspector.FieldProperty`
extends `com.github.javafaker.shaded.snakeyaml.introspector.GenericProperty`  

**Constructors:**
- `public FieldProperty(java.lang.reflect.Field p0)`

**Methods:**
- `public java.lang.Object get(java.lang.Object p0)`
- `public <A extends java.lang.annotation.Annotation> A getAnnotation(java.lang.Class p0)`
- `public java.util.List getAnnotations()`
- `public void set(java.lang.Object p0, java.lang.Object p1) throws java.lang.Exception`

---

## public abstract class `com.github.javafaker.shaded.snakeyaml.introspector.GenericProperty`
extends `com.github.javafaker.shaded.snakeyaml.introspector.Property`  

**Constructors:**
- `public GenericProperty(java.lang.String p0, java.lang.Class p1, java.lang.reflect.Type p2)`

**Methods:**
- `public java.lang.Class[] getActualTypeArguments()`

---

## public class `com.github.javafaker.shaded.snakeyaml.introspector.MethodProperty`
extends `com.github.javafaker.shaded.snakeyaml.introspector.GenericProperty`  

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

## public class `com.github.javafaker.shaded.snakeyaml.introspector.MissingProperty`
extends `com.github.javafaker.shaded.snakeyaml.introspector.Property`  

**Constructors:**
- `public MissingProperty(java.lang.String p0)`

**Methods:**
- `public java.lang.Object get(java.lang.Object p0)`
- `public java.lang.Class[] getActualTypeArguments()`
- `public <A extends java.lang.annotation.Annotation> A getAnnotation(java.lang.Class p0)`
- `public java.util.List getAnnotations()`
- `public void set(java.lang.Object p0, java.lang.Object p1) throws java.lang.Exception`

---

## public abstract class `com.github.javafaker.shaded.snakeyaml.introspector.Property`
implements `java.lang.Comparable<com.github.javafaker.shaded.snakeyaml.introspector.Property>`  

**Constructors:**
- `public Property(java.lang.String p0, java.lang.Class p1)`

**Methods:**
- `public int compareTo(com.github.javafaker.shaded.snakeyaml.introspector.Property p0)`
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

## public class `com.github.javafaker.shaded.snakeyaml.introspector.PropertySubstitute`
extends `com.github.javafaker.shaded.snakeyaml.introspector.Property`  

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
- `public void setDelegate(com.github.javafaker.shaded.snakeyaml.introspector.Property p0)`
- `public void setTargetType(java.lang.Class p0)`

---

## public class `com.github.javafaker.shaded.snakeyaml.introspector.PropertyUtils`

**Constructors:**
- `public PropertyUtils()`

**Methods:**
- `protected java.util.Set createPropertySet(java.lang.Class p0, com.github.javafaker.shaded.snakeyaml.introspector.BeanAccess p1)`
- `public java.util.Set getProperties(java.lang.Class p0)`
- `public java.util.Set getProperties(java.lang.Class p0, com.github.javafaker.shaded.snakeyaml.introspector.BeanAccess p1)`
- `protected java.util.Map getPropertiesMap(java.lang.Class p0, com.github.javafaker.shaded.snakeyaml.introspector.BeanAccess p1)`
- `public com.github.javafaker.shaded.snakeyaml.introspector.Property getProperty(java.lang.Class p0, java.lang.String p1)`
- `public com.github.javafaker.shaded.snakeyaml.introspector.Property getProperty(java.lang.Class p0, java.lang.String p1, com.github.javafaker.shaded.snakeyaml.introspector.BeanAccess p2)`
- `public boolean isAllowReadOnlyProperties()`
- `public boolean isSkipMissingProperties()`
- `public void setAllowReadOnlyProperties(boolean p0)`
- `public void setBeanAccess(com.github.javafaker.shaded.snakeyaml.introspector.BeanAccess p0)`
- `public void setSkipMissingProperties(boolean p0)`

---

## public class `com.github.javafaker.shaded.snakeyaml.nodes.AnchorNode`
extends `com.github.javafaker.shaded.snakeyaml.nodes.Node`  

**Constructors:**
- `public AnchorNode(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.nodes.NodeId getNodeId()`
- `public com.github.javafaker.shaded.snakeyaml.nodes.Node getRealNode()`

---

## public abstract class `com.github.javafaker.shaded.snakeyaml.nodes.CollectionNode`<T extends java.lang.Object>
extends `com.github.javafaker.shaded.snakeyaml.nodes.Node`  

**Constructors:**
- `public CollectionNode(com.github.javafaker.shaded.snakeyaml.nodes.Tag p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1, com.github.javafaker.shaded.snakeyaml.error.Mark p2, com.github.javafaker.shaded.snakeyaml.DumperOptions$FlowStyle p3)`
- `public CollectionNode(com.github.javafaker.shaded.snakeyaml.nodes.Tag p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1, com.github.javafaker.shaded.snakeyaml.error.Mark p2, java.lang.Boolean p3)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.DumperOptions$FlowStyle getFlowStyle()`
- `public abstract java.util.List getValue()`
- `public void setEndMark(com.github.javafaker.shaded.snakeyaml.error.Mark p0)`
- `public void setFlowStyle(com.github.javafaker.shaded.snakeyaml.DumperOptions$FlowStyle p0)`
- `public void setFlowStyle(java.lang.Boolean p0)`

---

## public class `com.github.javafaker.shaded.snakeyaml.nodes.MappingNode`
extends `com.github.javafaker.shaded.snakeyaml.nodes.CollectionNode`  

**Constructors:**
- `public MappingNode(com.github.javafaker.shaded.snakeyaml.nodes.Tag p0, boolean p1, java.util.List p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3, com.github.javafaker.shaded.snakeyaml.error.Mark p4, com.github.javafaker.shaded.snakeyaml.DumperOptions$FlowStyle p5)`
- `public MappingNode(com.github.javafaker.shaded.snakeyaml.nodes.Tag p0, boolean p1, java.util.List p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3, com.github.javafaker.shaded.snakeyaml.error.Mark p4, java.lang.Boolean p5)`
- `public MappingNode(com.github.javafaker.shaded.snakeyaml.nodes.Tag p0, java.util.List p1, com.github.javafaker.shaded.snakeyaml.DumperOptions$FlowStyle p2)`
- `public MappingNode(com.github.javafaker.shaded.snakeyaml.nodes.Tag p0, java.util.List p1, java.lang.Boolean p2)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.nodes.NodeId getNodeId()`
- `public java.util.List getValue()`
- `public boolean isMerged()`
- `public void setMerged(boolean p0)`
- `public void setOnlyKeyType(java.lang.Class p0)`
- `public void setTypes(java.lang.Class p0, java.lang.Class p1)`
- `public void setValue(java.util.List p0)`
- `public java.lang.String toString()`

---

## public abstract class `com.github.javafaker.shaded.snakeyaml.nodes.Node`

**Constructors:**
- `public Node(com.github.javafaker.shaded.snakeyaml.nodes.Tag p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1, com.github.javafaker.shaded.snakeyaml.error.Mark p2)`

**Fields:**
- `protected com.github.javafaker.shaded.snakeyaml.error.Mark endMark`
- `protected boolean resolved`
- `protected java.lang.Boolean useClassConstructor`

**Methods:**
- `public final boolean equals(java.lang.Object p0)`
- `public java.lang.String getAnchor()`
- `public java.util.List getBlockComments()`
- `public java.util.List getEndComments()`
- `public com.github.javafaker.shaded.snakeyaml.error.Mark getEndMark()`
- `public java.util.List getInLineComments()`
- `public abstract com.github.javafaker.shaded.snakeyaml.nodes.NodeId getNodeId()`
- `public com.github.javafaker.shaded.snakeyaml.error.Mark getStartMark()`
- `public com.github.javafaker.shaded.snakeyaml.nodes.Tag getTag()`
- `public java.lang.Class getType()`
- `public final int hashCode()`
- `public boolean isResolved()`
- `public boolean isTwoStepsConstruction()`
- `public void setAnchor(java.lang.String p0)`
- `public void setBlockComments(java.util.List p0)`
- `public void setEndComments(java.util.List p0)`
- `public void setInLineComments(java.util.List p0)`
- `public void setTag(com.github.javafaker.shaded.snakeyaml.nodes.Tag p0)`
- `public void setTwoStepsConstruction(boolean p0)`
- `public void setType(java.lang.Class p0)`
- `public void setUseClassConstructor(java.lang.Boolean p0)`
- `public boolean useClassConstructor()`

---

## public final enum `com.github.javafaker.shaded.snakeyaml.nodes.NodeId`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javafaker.shaded.snakeyaml.nodes.NodeId anchor`
- `public final static com.github.javafaker.shaded.snakeyaml.nodes.NodeId mapping`
- `public final static com.github.javafaker.shaded.snakeyaml.nodes.NodeId scalar`
- `public final static com.github.javafaker.shaded.snakeyaml.nodes.NodeId sequence`

---

## public final class `com.github.javafaker.shaded.snakeyaml.nodes.NodeTuple`

**Constructors:**
- `public NodeTuple(com.github.javafaker.shaded.snakeyaml.nodes.Node p0, com.github.javafaker.shaded.snakeyaml.nodes.Node p1)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.nodes.Node getKeyNode()`
- `public com.github.javafaker.shaded.snakeyaml.nodes.Node getValueNode()`
- `public java.lang.String toString()`

---

## public class `com.github.javafaker.shaded.snakeyaml.nodes.ScalarNode`
extends `com.github.javafaker.shaded.snakeyaml.nodes.Node`  

**Constructors:**
- `public ScalarNode(com.github.javafaker.shaded.snakeyaml.nodes.Tag p0, boolean p1, java.lang.String p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3, com.github.javafaker.shaded.snakeyaml.error.Mark p4, com.github.javafaker.shaded.snakeyaml.DumperOptions$ScalarStyle p5)`
- `public ScalarNode(com.github.javafaker.shaded.snakeyaml.nodes.Tag p0, boolean p1, java.lang.String p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3, com.github.javafaker.shaded.snakeyaml.error.Mark p4, java.lang.Character p5)`
- `public ScalarNode(com.github.javafaker.shaded.snakeyaml.nodes.Tag p0, java.lang.String p1, com.github.javafaker.shaded.snakeyaml.error.Mark p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3, com.github.javafaker.shaded.snakeyaml.DumperOptions$ScalarStyle p4)`
- `public ScalarNode(com.github.javafaker.shaded.snakeyaml.nodes.Tag p0, java.lang.String p1, com.github.javafaker.shaded.snakeyaml.error.Mark p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3, java.lang.Character p4)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.nodes.NodeId getNodeId()`
- `public com.github.javafaker.shaded.snakeyaml.DumperOptions$ScalarStyle getScalarStyle()`
- `public java.lang.Character getStyle()`
- `public java.lang.String getValue()`
- `public boolean isPlain()`
- `public java.lang.String toString()`

---

## public class `com.github.javafaker.shaded.snakeyaml.nodes.SequenceNode`
extends `com.github.javafaker.shaded.snakeyaml.nodes.CollectionNode`  

**Constructors:**
- `public SequenceNode(com.github.javafaker.shaded.snakeyaml.nodes.Tag p0, boolean p1, java.util.List p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3, com.github.javafaker.shaded.snakeyaml.error.Mark p4, com.github.javafaker.shaded.snakeyaml.DumperOptions$FlowStyle p5)`
- `public SequenceNode(com.github.javafaker.shaded.snakeyaml.nodes.Tag p0, boolean p1, java.util.List p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3, com.github.javafaker.shaded.snakeyaml.error.Mark p4, java.lang.Boolean p5)`
- `public SequenceNode(com.github.javafaker.shaded.snakeyaml.nodes.Tag p0, java.util.List p1, com.github.javafaker.shaded.snakeyaml.DumperOptions$FlowStyle p2)`
- `public SequenceNode(com.github.javafaker.shaded.snakeyaml.nodes.Tag p0, java.util.List p1, java.lang.Boolean p2)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.nodes.NodeId getNodeId()`
- `public java.util.List getValue()`
- `public void setListType(java.lang.Class p0)`
- `public java.lang.String toString()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.nodes.Tag`

**Constructors:**
- `public Tag(java.lang.Class p0)`
- `public Tag(java.lang.String p0)`
- `public Tag(java.net.URI p0)`

**Fields:**
- `public final static com.github.javafaker.shaded.snakeyaml.nodes.Tag BINARY`
- `public final static com.github.javafaker.shaded.snakeyaml.nodes.Tag BOOL`
- `public final static com.github.javafaker.shaded.snakeyaml.nodes.Tag COMMENT`
- `public final static com.github.javafaker.shaded.snakeyaml.nodes.Tag FLOAT`
- `public final static com.github.javafaker.shaded.snakeyaml.nodes.Tag INT`
- `public final static com.github.javafaker.shaded.snakeyaml.nodes.Tag MAP`
- `public final static com.github.javafaker.shaded.snakeyaml.nodes.Tag MERGE`
- `public final static com.github.javafaker.shaded.snakeyaml.nodes.Tag NULL`
- `public final static com.github.javafaker.shaded.snakeyaml.nodes.Tag OMAP`
- `public final static com.github.javafaker.shaded.snakeyaml.nodes.Tag PAIRS`
- `public final static java.lang.String PREFIX`
- `public final static com.github.javafaker.shaded.snakeyaml.nodes.Tag SEQ`
- `public final static com.github.javafaker.shaded.snakeyaml.nodes.Tag SET`
- `public final static com.github.javafaker.shaded.snakeyaml.nodes.Tag STR`
- `public final static com.github.javafaker.shaded.snakeyaml.nodes.Tag TIMESTAMP`
- `public final static com.github.javafaker.shaded.snakeyaml.nodes.Tag YAML`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getClassName()`
- `public java.lang.String getValue()`
- `public int hashCode()`
- `public boolean isCompatible(java.lang.Class p0)`
- `public boolean isSecondary()`
- `public boolean matches(java.lang.Class p0)`
- `public boolean startsWith(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public abstract interface `com.github.javafaker.shaded.snakeyaml.parser.Parser`

**Methods:**
- `public abstract boolean checkEvent(com.github.javafaker.shaded.snakeyaml.events.Event$ID p0)`
- `public abstract com.github.javafaker.shaded.snakeyaml.events.Event getEvent()`
- `public abstract com.github.javafaker.shaded.snakeyaml.events.Event peekEvent()`

---

## public class `com.github.javafaker.shaded.snakeyaml.parser.ParserException`
extends `com.github.javafaker.shaded.snakeyaml.error.MarkedYAMLException`  

**Constructors:**
- `public ParserException(java.lang.String p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1, java.lang.String p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3)`

---

## public class `com.github.javafaker.shaded.snakeyaml.parser.ParserImpl`
implements `com.github.javafaker.shaded.snakeyaml.parser.Parser`  

**Constructors:**
- `public ParserImpl(com.github.javafaker.shaded.snakeyaml.reader.StreamReader p0)`
- `public ParserImpl(com.github.javafaker.shaded.snakeyaml.reader.StreamReader p0, boolean p1)`
- `public ParserImpl(com.github.javafaker.shaded.snakeyaml.scanner.Scanner p0)`

**Fields:**
- `protected final com.github.javafaker.shaded.snakeyaml.scanner.Scanner scanner`

**Methods:**
- `public boolean checkEvent(com.github.javafaker.shaded.snakeyaml.events.Event$ID p0)`
- `public com.github.javafaker.shaded.snakeyaml.events.Event getEvent()`
- `public com.github.javafaker.shaded.snakeyaml.events.Event peekEvent()`

---

## public class `com.github.javafaker.shaded.snakeyaml.reader.ReaderException`
extends `com.github.javafaker.shaded.snakeyaml.error.YAMLException`  

**Constructors:**
- `public ReaderException(java.lang.String p0, int p1, int p2, java.lang.String p3)`

**Methods:**
- `public int getCodePoint()`
- `public java.lang.String getName()`
- `public int getPosition()`
- `public java.lang.String toString()`

---

## public class `com.github.javafaker.shaded.snakeyaml.reader.StreamReader`

**Constructors:**
- `public StreamReader(java.io.Reader p0)`
- `public StreamReader(java.lang.String p0)`

**Methods:**
- `public void forward()`
- `public void forward(int p0)`
- `public int getColumn()`
- `public int getIndex()`
- `public int getLine()`
- `public com.github.javafaker.shaded.snakeyaml.error.Mark getMark()`
- `public static boolean isPrintable(int p0)`
- `public static boolean isPrintable(java.lang.String p0)`
- `public int peek()`
- `public int peek(int p0)`
- `public java.lang.String prefix(int p0)`
- `public java.lang.String prefixForward(int p0)`

---

## public class `com.github.javafaker.shaded.snakeyaml.reader.UnicodeReader`
extends `java.io.Reader`  

**Constructors:**
- `public UnicodeReader(java.io.InputStream p0)`

**Methods:**
- `public void close() throws java.io.IOException`
- `public java.lang.String getEncoding()`
- `protected void init() throws java.io.IOException`
- `public int read(char[] p0, int p1, int p2) throws java.io.IOException`

---

## public abstract class `com.github.javafaker.shaded.snakeyaml.representer.BaseRepresenter`

**Constructors:**
- `public BaseRepresenter()`

**Fields:**
- `protected com.github.javafaker.shaded.snakeyaml.DumperOptions$FlowStyle defaultFlowStyle`
- `protected com.github.javafaker.shaded.snakeyaml.DumperOptions$ScalarStyle defaultScalarStyle`
- `protected final java.util.Map multiRepresenters`
- `protected com.github.javafaker.shaded.snakeyaml.representer.Represent nullRepresenter`
- `protected java.lang.Object objectToRepresent`
- `protected final java.util.Map representedObjects`
- `protected final java.util.Map representers`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.DumperOptions$FlowStyle getDefaultFlowStyle()`
- `public com.github.javafaker.shaded.snakeyaml.DumperOptions$ScalarStyle getDefaultScalarStyle()`
- `public final com.github.javafaker.shaded.snakeyaml.introspector.PropertyUtils getPropertyUtils()`
- `public final boolean isExplicitPropertyUtils()`
- `public com.github.javafaker.shaded.snakeyaml.nodes.Node represent(java.lang.Object p0)`
- `protected final com.github.javafaker.shaded.snakeyaml.nodes.Node representData(java.lang.Object p0)`
- `protected com.github.javafaker.shaded.snakeyaml.nodes.Node representMapping(com.github.javafaker.shaded.snakeyaml.nodes.Tag p0, java.util.Map p1, com.github.javafaker.shaded.snakeyaml.DumperOptions$FlowStyle p2)`
- `protected com.github.javafaker.shaded.snakeyaml.nodes.Node representScalar(com.github.javafaker.shaded.snakeyaml.nodes.Tag p0, java.lang.String p1)`
- `protected com.github.javafaker.shaded.snakeyaml.nodes.Node representScalar(com.github.javafaker.shaded.snakeyaml.nodes.Tag p0, java.lang.String p1, com.github.javafaker.shaded.snakeyaml.DumperOptions$ScalarStyle p2)`
- `protected com.github.javafaker.shaded.snakeyaml.nodes.Node representSequence(com.github.javafaker.shaded.snakeyaml.nodes.Tag p0, java.lang.Iterable p1, com.github.javafaker.shaded.snakeyaml.DumperOptions$FlowStyle p2)`
- `public void setDefaultFlowStyle(com.github.javafaker.shaded.snakeyaml.DumperOptions$FlowStyle p0)`
- `public void setDefaultScalarStyle(com.github.javafaker.shaded.snakeyaml.DumperOptions$ScalarStyle p0)`
- `public void setPropertyUtils(com.github.javafaker.shaded.snakeyaml.introspector.PropertyUtils p0)`

---

## public abstract interface `com.github.javafaker.shaded.snakeyaml.representer.Represent`

**Methods:**
- `public abstract com.github.javafaker.shaded.snakeyaml.nodes.Node representData(java.lang.Object p0)`

---

## public class `com.github.javafaker.shaded.snakeyaml.representer.Representer`
extends `com.github.javafaker.shaded.snakeyaml.representer.SafeRepresenter`  

**Constructors:**
- `public Representer()`
- `public Representer(com.github.javafaker.shaded.snakeyaml.DumperOptions p0)`

**Fields:**
- `protected java.util.Map typeDefinitions`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.TypeDescription addTypeDescription(com.github.javafaker.shaded.snakeyaml.TypeDescription p0)`
- `protected void checkGlobalTag(com.github.javafaker.shaded.snakeyaml.introspector.Property p0, com.github.javafaker.shaded.snakeyaml.nodes.Node p1, java.lang.Object p2)`
- `protected java.util.Set getProperties(java.lang.Class p0)`
- `protected com.github.javafaker.shaded.snakeyaml.nodes.MappingNode representJavaBean(java.util.Set p0, java.lang.Object p1)`
- `protected com.github.javafaker.shaded.snakeyaml.nodes.NodeTuple representJavaBeanProperty(java.lang.Object p0, com.github.javafaker.shaded.snakeyaml.introspector.Property p1, java.lang.Object p2, com.github.javafaker.shaded.snakeyaml.nodes.Tag p3)`
- `public void setPropertyUtils(com.github.javafaker.shaded.snakeyaml.introspector.PropertyUtils p0)`

---

## protected class `com.github.javafaker.shaded.snakeyaml.representer.Representer$RepresentJavaBean`
implements `com.github.javafaker.shaded.snakeyaml.representer.Represent`  

**Constructors:**
- `protected RepresentJavaBean()`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.nodes.Node representData(java.lang.Object p0)`

---

## public class `com.github.javafaker.shaded.snakeyaml.resolver.Resolver`

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
- `public void addImplicitResolver(com.github.javafaker.shaded.snakeyaml.nodes.Tag p0, java.util.regex.Pattern p1, java.lang.String p2)`
- `protected void addImplicitResolvers()`
- `public com.github.javafaker.shaded.snakeyaml.nodes.Tag resolve(com.github.javafaker.shaded.snakeyaml.nodes.NodeId p0, java.lang.String p1, boolean p2)`

---

## public final class `com.github.javafaker.shaded.snakeyaml.scanner.Constant`

**Fields:**
- `public final static com.github.javafaker.shaded.snakeyaml.scanner.Constant ALPHA`
- `public final static com.github.javafaker.shaded.snakeyaml.scanner.Constant LINEBR`
- `public final static com.github.javafaker.shaded.snakeyaml.scanner.Constant NULL_BL_LINEBR`
- `public final static com.github.javafaker.shaded.snakeyaml.scanner.Constant NULL_BL_T`
- `public final static com.github.javafaker.shaded.snakeyaml.scanner.Constant NULL_BL_T_LINEBR`
- `public final static com.github.javafaker.shaded.snakeyaml.scanner.Constant NULL_OR_LINEBR`
- `public final static com.github.javafaker.shaded.snakeyaml.scanner.Constant URI_CHARS`

**Methods:**
- `public boolean has(int p0)`
- `public boolean has(int p0, java.lang.String p1)`
- `public boolean hasNo(int p0)`
- `public boolean hasNo(int p0, java.lang.String p1)`

---

## public abstract interface `com.github.javafaker.shaded.snakeyaml.scanner.Scanner`

**Methods:**
- `public abstract boolean checkToken(com.github.javafaker.shaded.snakeyaml.tokens.Token$ID... p0)`
- `public abstract com.github.javafaker.shaded.snakeyaml.tokens.Token getToken()`
- `public abstract com.github.javafaker.shaded.snakeyaml.tokens.Token peekToken()`

---

## public class `com.github.javafaker.shaded.snakeyaml.scanner.ScannerException`
extends `com.github.javafaker.shaded.snakeyaml.error.MarkedYAMLException`  

**Constructors:**
- `public ScannerException(java.lang.String p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1, java.lang.String p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3)`
- `public ScannerException(java.lang.String p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1, java.lang.String p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3, java.lang.String p4)`

---

## public final class `com.github.javafaker.shaded.snakeyaml.scanner.ScannerImpl`
implements `com.github.javafaker.shaded.snakeyaml.scanner.Scanner`  

**Constructors:**
- `public ScannerImpl(com.github.javafaker.shaded.snakeyaml.reader.StreamReader p0)`

**Fields:**
- `public final static java.util.Map ESCAPE_CODES`
- `public final static java.util.Map ESCAPE_REPLACEMENTS`

**Methods:**
- `public boolean checkToken(com.github.javafaker.shaded.snakeyaml.tokens.Token$ID... p0)`
- `public com.github.javafaker.shaded.snakeyaml.tokens.Token getToken()`
- `public boolean isParseComments()`
- `public com.github.javafaker.shaded.snakeyaml.tokens.Token peekToken()`
- `public com.github.javafaker.shaded.snakeyaml.scanner.ScannerImpl setParseComments(boolean p0)`

---

## public abstract interface `com.github.javafaker.shaded.snakeyaml.serializer.AnchorGenerator`

**Methods:**
- `public abstract java.lang.String nextAnchor(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`

---

## public class `com.github.javafaker.shaded.snakeyaml.serializer.NumberAnchorGenerator`
implements `com.github.javafaker.shaded.snakeyaml.serializer.AnchorGenerator`  

**Constructors:**
- `public NumberAnchorGenerator(int p0)`

**Methods:**
- `public java.lang.String nextAnchor(com.github.javafaker.shaded.snakeyaml.nodes.Node p0)`

---

## public final class `com.github.javafaker.shaded.snakeyaml.serializer.Serializer`

**Constructors:**
- `public Serializer(com.github.javafaker.shaded.snakeyaml.emitter.Emitable p0, com.github.javafaker.shaded.snakeyaml.resolver.Resolver p1, com.github.javafaker.shaded.snakeyaml.DumperOptions p2, com.github.javafaker.shaded.snakeyaml.nodes.Tag p3)`

**Methods:**
- `public void close() throws java.io.IOException`
- `public void open() throws java.io.IOException`
- `public void serialize(com.github.javafaker.shaded.snakeyaml.nodes.Node p0) throws java.io.IOException`

---

## public class `com.github.javafaker.shaded.snakeyaml.serializer.SerializerException`
extends `com.github.javafaker.shaded.snakeyaml.error.YAMLException`  

**Constructors:**
- `public SerializerException(java.lang.String p0)`

---

## public final class `com.github.javafaker.shaded.snakeyaml.tokens.AliasToken`
extends `com.github.javafaker.shaded.snakeyaml.tokens.Token`  

**Constructors:**
- `public AliasToken(java.lang.String p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1, com.github.javafaker.shaded.snakeyaml.error.Mark p2)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.tokens.Token$ID getTokenId()`
- `public java.lang.String getValue()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.tokens.AnchorToken`
extends `com.github.javafaker.shaded.snakeyaml.tokens.Token`  

**Constructors:**
- `public AnchorToken(java.lang.String p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1, com.github.javafaker.shaded.snakeyaml.error.Mark p2)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.tokens.Token$ID getTokenId()`
- `public java.lang.String getValue()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.tokens.BlockEndToken`
extends `com.github.javafaker.shaded.snakeyaml.tokens.Token`  

**Constructors:**
- `public BlockEndToken(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.tokens.BlockEntryToken`
extends `com.github.javafaker.shaded.snakeyaml.tokens.Token`  

**Constructors:**
- `public BlockEntryToken(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.tokens.BlockMappingStartToken`
extends `com.github.javafaker.shaded.snakeyaml.tokens.Token`  

**Constructors:**
- `public BlockMappingStartToken(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.tokens.BlockSequenceStartToken`
extends `com.github.javafaker.shaded.snakeyaml.tokens.Token`  

**Constructors:**
- `public BlockSequenceStartToken(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.tokens.CommentToken`
extends `com.github.javafaker.shaded.snakeyaml.tokens.Token`  

**Constructors:**
- `public CommentToken(com.github.javafaker.shaded.snakeyaml.comments.CommentType p0, java.lang.String p1, com.github.javafaker.shaded.snakeyaml.error.Mark p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.comments.CommentType getCommentType()`
- `public com.github.javafaker.shaded.snakeyaml.tokens.Token$ID getTokenId()`
- `public java.lang.String getValue()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.tokens.DirectiveToken`<T extends java.lang.Object>
extends `com.github.javafaker.shaded.snakeyaml.tokens.Token`  

**Constructors:**
- `public DirectiveToken(java.lang.String p0, java.util.List p1, com.github.javafaker.shaded.snakeyaml.error.Mark p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3)`

**Methods:**
- `public java.lang.String getName()`
- `public com.github.javafaker.shaded.snakeyaml.tokens.Token$ID getTokenId()`
- `public java.util.List getValue()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.tokens.DocumentEndToken`
extends `com.github.javafaker.shaded.snakeyaml.tokens.Token`  

**Constructors:**
- `public DocumentEndToken(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.tokens.DocumentStartToken`
extends `com.github.javafaker.shaded.snakeyaml.tokens.Token`  

**Constructors:**
- `public DocumentStartToken(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.tokens.FlowEntryToken`
extends `com.github.javafaker.shaded.snakeyaml.tokens.Token`  

**Constructors:**
- `public FlowEntryToken(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.tokens.FlowMappingEndToken`
extends `com.github.javafaker.shaded.snakeyaml.tokens.Token`  

**Constructors:**
- `public FlowMappingEndToken(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.tokens.FlowMappingStartToken`
extends `com.github.javafaker.shaded.snakeyaml.tokens.Token`  

**Constructors:**
- `public FlowMappingStartToken(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.tokens.FlowSequenceEndToken`
extends `com.github.javafaker.shaded.snakeyaml.tokens.Token`  

**Constructors:**
- `public FlowSequenceEndToken(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.tokens.FlowSequenceStartToken`
extends `com.github.javafaker.shaded.snakeyaml.tokens.Token`  

**Constructors:**
- `public FlowSequenceStartToken(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.tokens.KeyToken`
extends `com.github.javafaker.shaded.snakeyaml.tokens.Token`  

**Constructors:**
- `public KeyToken(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.tokens.ScalarToken`
extends `com.github.javafaker.shaded.snakeyaml.tokens.Token`  

**Constructors:**
- `public ScalarToken(java.lang.String p0, boolean p1, com.github.javafaker.shaded.snakeyaml.error.Mark p2, com.github.javafaker.shaded.snakeyaml.error.Mark p3, com.github.javafaker.shaded.snakeyaml.DumperOptions$ScalarStyle p4)`
- `public ScalarToken(java.lang.String p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1, com.github.javafaker.shaded.snakeyaml.error.Mark p2, boolean p3)`

**Methods:**
- `public boolean getPlain()`
- `public com.github.javafaker.shaded.snakeyaml.DumperOptions$ScalarStyle getStyle()`
- `public com.github.javafaker.shaded.snakeyaml.tokens.Token$ID getTokenId()`
- `public java.lang.String getValue()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.tokens.StreamEndToken`
extends `com.github.javafaker.shaded.snakeyaml.tokens.Token`  

**Constructors:**
- `public StreamEndToken(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.tokens.StreamStartToken`
extends `com.github.javafaker.shaded.snakeyaml.tokens.Token`  

**Constructors:**
- `public StreamStartToken(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.tokens.TagToken`
extends `com.github.javafaker.shaded.snakeyaml.tokens.Token`  

**Constructors:**
- `public TagToken(com.github.javafaker.shaded.snakeyaml.tokens.TagTuple p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1, com.github.javafaker.shaded.snakeyaml.error.Mark p2)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.tokens.Token$ID getTokenId()`
- `public com.github.javafaker.shaded.snakeyaml.tokens.TagTuple getValue()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.tokens.TagTuple`

**Constructors:**
- `public TagTuple(java.lang.String p0, java.lang.String p1)`

**Methods:**
- `public java.lang.String getHandle()`
- `public java.lang.String getSuffix()`

---

## public abstract class `com.github.javafaker.shaded.snakeyaml.tokens.Token`

**Constructors:**
- `public Token(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.error.Mark getEndMark()`
- `public com.github.javafaker.shaded.snakeyaml.error.Mark getStartMark()`
- `public abstract com.github.javafaker.shaded.snakeyaml.tokens.Token$ID getTokenId()`

---

## public final static enum `com.github.javafaker.shaded.snakeyaml.tokens.Token$ID`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.github.javafaker.shaded.snakeyaml.tokens.Token$ID Alias`
- `public final static com.github.javafaker.shaded.snakeyaml.tokens.Token$ID Anchor`
- `public final static com.github.javafaker.shaded.snakeyaml.tokens.Token$ID BlockEnd`
- `public final static com.github.javafaker.shaded.snakeyaml.tokens.Token$ID BlockEntry`
- `public final static com.github.javafaker.shaded.snakeyaml.tokens.Token$ID BlockMappingStart`
- `public final static com.github.javafaker.shaded.snakeyaml.tokens.Token$ID BlockSequenceStart`
- `public final static com.github.javafaker.shaded.snakeyaml.tokens.Token$ID Comment`
- `public final static com.github.javafaker.shaded.snakeyaml.tokens.Token$ID Directive`
- `public final static com.github.javafaker.shaded.snakeyaml.tokens.Token$ID DocumentEnd`
- `public final static com.github.javafaker.shaded.snakeyaml.tokens.Token$ID DocumentStart`
- `public final static com.github.javafaker.shaded.snakeyaml.tokens.Token$ID Error`
- `public final static com.github.javafaker.shaded.snakeyaml.tokens.Token$ID FlowEntry`
- `public final static com.github.javafaker.shaded.snakeyaml.tokens.Token$ID FlowMappingEnd`
- `public final static com.github.javafaker.shaded.snakeyaml.tokens.Token$ID FlowMappingStart`
- `public final static com.github.javafaker.shaded.snakeyaml.tokens.Token$ID FlowSequenceEnd`
- `public final static com.github.javafaker.shaded.snakeyaml.tokens.Token$ID FlowSequenceStart`
- `public final static com.github.javafaker.shaded.snakeyaml.tokens.Token$ID Key`
- `public final static com.github.javafaker.shaded.snakeyaml.tokens.Token$ID Scalar`
- `public final static com.github.javafaker.shaded.snakeyaml.tokens.Token$ID StreamEnd`
- `public final static com.github.javafaker.shaded.snakeyaml.tokens.Token$ID StreamStart`
- `public final static com.github.javafaker.shaded.snakeyaml.tokens.Token$ID Tag`
- `public final static com.github.javafaker.shaded.snakeyaml.tokens.Token$ID Value`
- `public final static com.github.javafaker.shaded.snakeyaml.tokens.Token$ID Whitespace`

**Methods:**
- `public java.lang.String toString()`

---

## public final class `com.github.javafaker.shaded.snakeyaml.tokens.ValueToken`
extends `com.github.javafaker.shaded.snakeyaml.tokens.Token`  

**Constructors:**
- `public ValueToken(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.tokens.Token$ID getTokenId()`

---

## public class `com.github.javafaker.shaded.snakeyaml.tokens.WhitespaceToken`
extends `com.github.javafaker.shaded.snakeyaml.tokens.Token`  

**Constructors:**
- `public WhitespaceToken(com.github.javafaker.shaded.snakeyaml.error.Mark p0, com.github.javafaker.shaded.snakeyaml.error.Mark p1)`

**Methods:**
- `public com.github.javafaker.shaded.snakeyaml.tokens.Token$ID getTokenId()`

---

## public class `com.github.javafaker.shaded.snakeyaml.util.ArrayStack`<T extends java.lang.Object>

**Constructors:**
- `public ArrayStack(int p0)`

**Methods:**
- `public void clear()`
- `public boolean isEmpty()`
- `public T pop()`
- `public void push(T p0)`

---

## public class `com.github.javafaker.shaded.snakeyaml.util.ArrayUtils`

**Methods:**
- `public static <E extends java.lang.Object> java.util.List toUnmodifiableCompositeList(E[] p0, E[] p1)`
- `public static <E extends java.lang.Object> java.util.List toUnmodifiableList(E[] p0)`

---

## public class `com.github.javafaker.shaded.snakeyaml.util.EnumUtils`

**Constructors:**
- `public EnumUtils()`

**Methods:**
- `public static <T extends java.lang.Enum<T>> T findEnumInsensitiveCase(java.lang.Class p0, java.lang.String p1)`

---

## public class `com.github.javafaker.shaded.snakeyaml.util.PlatformFeatureDetector`

**Constructors:**
- `public PlatformFeatureDetector()`

**Methods:**
- `public boolean isRunningOnAndroid()`

---

## public abstract class `com.github.javafaker.shaded.snakeyaml.util.UriEncoder`

**Constructors:**
- `public UriEncoder()`

**Methods:**
- `public static java.lang.String decode(java.lang.String p0)`
- `public static java.lang.String decode(java.nio.ByteBuffer p0) throws java.nio.charset.CharacterCodingException`
- `public static java.lang.String encode(java.lang.String p0)`

---

## public class `net.datafaker.Address`

**Constructors:**
- `protected Address(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String buildingNumber()`
- `public java.lang.String city()`
- `public java.lang.String cityName()`
- `public java.lang.String cityPrefix()`
- `public java.lang.String citySuffix()`
- `public java.lang.String country()`
- `public java.lang.String countryCode()`
- `public java.lang.String countyByZipCode(java.lang.String p0)`
- `public java.lang.String fullAddress()`
- `public java.lang.String latitude()`
- `public java.lang.String longitude()`
- `public java.lang.String mailBox()`
- `public java.lang.String postcode()`
- `public java.lang.String secondaryAddress()`
- `public java.lang.String state()`
- `public java.lang.String stateAbbr()`
- `public java.lang.String streetAddress()`
- `public java.lang.String streetAddress(boolean p0)`
- `public java.lang.String streetAddressNumber()`
- `public java.lang.String streetName()`
- `public java.lang.String streetPrefix()`
- `public java.lang.String streetSuffix()`
- `public java.lang.String timeZone()`
- `public java.lang.String zipCode()`
- `public java.lang.String zipCodeByState(java.lang.String p0)`
- `public java.lang.String zipCodePlus4()`

---

## public class `net.datafaker.Ancient`

**Constructors:**
- `protected Ancient(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String god()`
- `public java.lang.String hero()`
- `public java.lang.String primordial()`
- `public java.lang.String titan()`

---

## public class `net.datafaker.Animal`

**Constructors:**
- `protected Animal(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String name()`

---

## public class `net.datafaker.App`

**Constructors:**
- `protected App(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String author()`
- `public java.lang.String name()`
- `public java.lang.String version()`

---

## public class `net.datafaker.Appliance`

**Constructors:**
- `protected Appliance(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String brand()`
- `public java.lang.String equipment()`

---

## public class `net.datafaker.AquaTeenHungerForce`

**Constructors:**
- `protected AquaTeenHungerForce(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String character()`

---

## public class `net.datafaker.Artist`

**Constructors:**
- `protected Artist(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String name()`

---

## public class `net.datafaker.Australia`

**Constructors:**
- `protected Australia(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String animals()`
- `public java.lang.String locations()`
- `public java.lang.String states()`

---

## public class `net.datafaker.Avatar`

**Constructors:**
- `protected Avatar(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String image()`

---

## public class `net.datafaker.Aviation`

**Constructors:**
- `protected Aviation(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String METAR()`
- `public java.lang.String aircraft()`
- `public java.lang.String airline()`
- `public java.lang.String airport()`
- `public java.lang.String flight()`
- `public java.lang.String flight(java.lang.String p0)`

---

## public class `net.datafaker.Aws`

**Constructors:**
- `protected Aws(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String accountId()`
- `public java.lang.String acmARN()`
- `public java.lang.String albARN()`
- `public java.lang.String albTargetGroupARN()`
- `public java.lang.String region()`
- `public java.lang.String route53ZoneId()`
- `public java.lang.String securityGroupId()`
- `public java.lang.String subnetId()`
- `public java.lang.String vpcId()`

---

## public class `net.datafaker.Babylon5`

**Constructors:**
- `protected Babylon5(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String character()`
- `public java.lang.String quote()`

---

## public class `net.datafaker.BackToTheFuture`

**Constructors:**
- `protected BackToTheFuture(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String character()`
- `public java.lang.String date()`
- `public java.lang.String quote()`

---

## public class `net.datafaker.Barcode`

**Constructors:**
- `public Barcode(net.datafaker.Faker p0)`

**Methods:**
- `public long ean13()`
- `public long ean8()`
- `public long gtin12()`
- `public long gtin13()`
- `public long gtin14()`
- `public long gtin8()`
- `public java.lang.String type()`

---

## public class `net.datafaker.Basketball`

**Constructors:**
- `protected Basketball(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String coaches()`
- `public java.lang.String players()`
- `public java.lang.String positions()`
- `public java.lang.String teams()`

---

## public class `net.datafaker.Battlefield1`

**Constructors:**
- `protected Battlefield1(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String classes()`
- `public java.lang.String faction()`
- `public java.lang.String map()`
- `public java.lang.String vehicle()`
- `public java.lang.String weapon()`

---

## public class `net.datafaker.Beer`

**Constructors:**
- `protected Beer(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String hop()`
- `public java.lang.String malt()`
- `public java.lang.String name()`
- `public java.lang.String style()`
- `public java.lang.String yeast()`

---

## public class `net.datafaker.BloodType`

**Constructors:**
- `protected BloodType(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String abo_types()`
- `public java.lang.String p_types()`
- `public java.lang.String rh_types()`

---

## public class `net.datafaker.BojackHorseman`

**Constructors:**
- `protected BojackHorseman(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String characters()`
- `public java.lang.String quotes()`
- `public java.lang.String tongueTwisters()`

---

## public class `net.datafaker.Book`

**Constructors:**
- `protected Book(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String author()`
- `public java.lang.String genre()`
- `public java.lang.String publisher()`
- `public java.lang.String title()`

---

## public class `net.datafaker.Bool`

**Constructors:**
- `protected Bool(net.datafaker.Faker p0)`

**Methods:**
- `public boolean bool()`

---

## public class `net.datafaker.BossaNova`

**Constructors:**
- `protected BossaNova(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String artist()`
- `public java.lang.String song()`

---

## public class `net.datafaker.BreakingBad`

**Constructors:**
- `protected BreakingBad(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String character()`
- `public java.lang.String episode()`

---

## public class `net.datafaker.BrooklynNineNine`

**Constructors:**
- `protected BrooklynNineNine(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String characters()`
- `public java.lang.String quotes()`

---

## public class `net.datafaker.Buffy`

**Constructors:**
- `protected Buffy(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String bigBads()`
- `public java.lang.String celebrities()`
- `public java.lang.String characters()`
- `public java.lang.String episodes()`
- `public java.lang.String quotes()`

---

## public class `net.datafaker.Business`

**Constructors:**
- `protected Business(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String creditCardExpiry()`
- `public java.lang.String creditCardNumber()`
- `public java.lang.String creditCardType()`

---

## public class `net.datafaker.CNPJ`

**Constructors:**
- `protected CNPJ(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String invalid()`
- `public java.lang.String invalid(boolean p0)`
- `public java.lang.String invalid(boolean p0, boolean p1)`
- `public java.lang.String valid()`
- `public java.lang.String valid(boolean p0)`
- `public java.lang.String valid(boolean p0, boolean p1)`

---

## public class `net.datafaker.CPF`

**Constructors:**
- `protected CPF(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String invalid()`
- `public java.lang.String invalid(boolean p0)`
- `public java.lang.String valid()`
- `public java.lang.String valid(boolean p0)`

---

## public class `net.datafaker.Camera`

**Constructors:**
- `protected Camera(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String brand()`
- `public java.lang.String brandWithModel()`
- `public java.lang.String model()`

---

## public class `net.datafaker.Cat`

**Constructors:**
- `protected Cat(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String breed()`
- `public java.lang.String name()`
- `public java.lang.String registry()`

---

## public class `net.datafaker.ChuckNorris`

**Constructors:**
- `protected ChuckNorris(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String fact()`

---

## public class `net.datafaker.Code`

**Constructors:**
- `protected Code(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String asin()`
- `public java.lang.String ean13()`
- `public java.lang.String ean8()`
- `public java.lang.String gtin13()`
- `public java.lang.String gtin8()`
- `public java.lang.String imei()`
- `public java.lang.String isbn10()`
- `public java.lang.String isbn10(boolean p0)`
- `public java.lang.String isbn13()`
- `public java.lang.String isbn13(boolean p0)`
- `public java.lang.String isbnGroup()`
- `public java.lang.String isbnGs1()`
- `public java.lang.String isbnRegistrant()`

---

## public class `net.datafaker.Coin`

**Constructors:**
- `protected Coin(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String flip()`

---

## public class `net.datafaker.Color`

**Constructors:**
- `protected Color(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String hex()`
- `public java.lang.String hex(boolean p0)`
- `public java.lang.String name()`

---

## public class `net.datafaker.Commerce`

**Constructors:**
- `protected Commerce(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String brand()`
- `public java.lang.String department()`
- `public java.lang.String material()`
- `public java.lang.String price()`
- `public java.lang.String price(double p0, double p1)`
- `public java.lang.String productName()`
- `public java.lang.String promotionCode()`
- `public java.lang.String promotionCode(int p0)`
- `public java.lang.String vendor()`

---

## public class `net.datafaker.Company`

**Constructors:**
- `protected Company(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String bs()`
- `public java.lang.String buzzword()`
- `public java.lang.String catchPhrase()`
- `public java.lang.String industry()`
- `public java.lang.String logo()`
- `public java.lang.String name()`
- `public java.lang.String profession()`
- `public java.lang.String suffix()`
- `public java.lang.String url()`

---

## public class `net.datafaker.Country`

**Constructors:**
- `protected Country(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String capital()`
- `public java.lang.String countryCode2()`
- `public java.lang.String countryCode3()`
- `public java.lang.String currency()`
- `public java.lang.String currencyCode()`
- `public java.lang.String flag()`
- `public java.lang.String name()`

---

## public final enum `net.datafaker.CreditCardType`
extends `java.lang.Enum`  

**Fields:**
- `public final static net.datafaker.CreditCardType AMERICAN_EXPRESS`
- `public final static net.datafaker.CreditCardType DANKORT`
- `public final static net.datafaker.CreditCardType DINERS_CLUB`
- `public final static net.datafaker.CreditCardType DISCOVER`
- `public final static net.datafaker.CreditCardType FORBRUGSFORENINGEN`
- `public final static net.datafaker.CreditCardType JCB`
- `public final static net.datafaker.CreditCardType LASER`
- `public final static net.datafaker.CreditCardType MASTERCARD`
- `public final static net.datafaker.CreditCardType SOLO`
- `public final static net.datafaker.CreditCardType SWITCH`
- `public final static net.datafaker.CreditCardType VISA`

---

## public class `net.datafaker.CryptoCoin`

**Constructors:**
- `protected CryptoCoin(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String coin()`

---

## public class `net.datafaker.Currency`

**Constructors:**
- `public Currency(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String code()`
- `public java.lang.String name()`

---

## public class `net.datafaker.DateAndTime`

**Constructors:**
- `protected DateAndTime(net.datafaker.Faker p0)`

**Methods:**
- `public java.sql.Timestamp between(java.sql.Timestamp p0, java.sql.Timestamp p1) throws java.lang.IllegalArgumentException`
- `public java.lang.String between(java.sql.Timestamp p0, java.sql.Timestamp p1, java.lang.String p2) throws java.lang.IllegalArgumentException`
- `public java.sql.Timestamp birthday()`
- `public java.sql.Timestamp birthday(int p0, int p1)`
- `public java.lang.String birthday(int p0, int p1, java.lang.String p2)`
- `public java.lang.String birthday(java.lang.String p0)`
- `public java.time.Duration duration(long p0, java.lang.String p1)`
- `public java.time.Duration duration(long p0, java.time.temporal.ChronoUnit p1)`
- `public java.time.Duration duration(long p0, long p1, java.lang.String p2)`
- `public java.time.Duration duration(long p0, long p1, java.time.temporal.ChronoUnit p2)`
- `public java.sql.Timestamp future(int p0, int p1, java.util.concurrent.TimeUnit p2)`
- `public java.lang.String future(int p0, int p1, java.util.concurrent.TimeUnit p2, java.lang.String p3)`
- `public java.sql.Timestamp future(int p0, java.util.concurrent.TimeUnit p1)`
- `public java.lang.String future(int p0, java.util.concurrent.TimeUnit p1, java.lang.String p2)`
- `public java.sql.Timestamp future(int p0, java.util.concurrent.TimeUnit p1, java.util.Date p2)`
- `public java.lang.String future(int p0, java.util.concurrent.TimeUnit p1, java.util.Date p2, java.lang.String p3)`
- `public java.sql.Timestamp past(int p0, int p1, java.util.concurrent.TimeUnit p2)`
- `public java.lang.String past(int p0, int p1, java.util.concurrent.TimeUnit p2, java.lang.String p3)`
- `public java.sql.Timestamp past(int p0, java.util.concurrent.TimeUnit p1)`
- `public java.lang.String past(int p0, java.util.concurrent.TimeUnit p1, java.lang.String p2)`
- `public java.sql.Timestamp past(int p0, java.util.concurrent.TimeUnit p1, java.util.Date p2)`
- `public java.lang.String past(int p0, java.util.concurrent.TimeUnit p1, java.util.Date p2, java.lang.String p3)`
- `public java.time.Period period(java.time.Period p0, java.time.Period p1)`

---

## public class `net.datafaker.Demographic`

**Constructors:**
- `protected Demographic(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String demonym()`
- `public java.lang.String educationalAttainment()`
- `public java.lang.String maritalStatus()`
- `public java.lang.String race()`
- `public java.lang.String sex()`

---

## public class `net.datafaker.Dessert`

**Constructors:**
- `protected Dessert(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String flavor()`
- `public java.lang.String topping()`
- `public java.lang.String variety()`

---

## public class `net.datafaker.Device`

**Constructors:**
- `protected Device(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String manufacturer()`
- `public java.lang.String modelName()`
- `public java.lang.String platform()`
- `public java.lang.String serial()`

---

## public class `net.datafaker.Disease`

**Constructors:**
- `protected Disease(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String dermatolory()`
- `public java.lang.String gynecologyAndObstetrics()`
- `public java.lang.String internalDisease()`
- `public java.lang.String neurology()`
- `public java.lang.String ophthalmologyAndOtorhinolaryngology()`
- `public java.lang.String paediatrics()`
- `public java.lang.String surgery()`

---

## public class `net.datafaker.Dog`

**Constructors:**
- `protected Dog(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String age()`
- `public java.lang.String breed()`
- `public java.lang.String coatLength()`
- `public java.lang.String gender()`
- `public java.lang.String memePhrase()`
- `public java.lang.String name()`
- `public java.lang.String size()`
- `public java.lang.String sound()`

---

## public class `net.datafaker.Domain`

**Constructors:**
- `protected Domain(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String firstLevelDomain(java.lang.String p0)`
- `public java.lang.String fullDomain(java.lang.String p0)`
- `public java.lang.String secondLevelDomain(java.lang.String p0)`
- `public java.lang.String validDomain(java.lang.String p0)`

---

## public class `net.datafaker.DragonBall`

**Constructors:**
- `protected DragonBall(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String character()`

---

## public class `net.datafaker.Dune`

**Constructors:**
- `protected Dune(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String character()`
- `public java.lang.String planet()`
- `public java.lang.String quote()`
- `public java.lang.String quote(net.datafaker.Dune$Quote p0)`
- `public java.lang.String saying()`
- `public java.lang.String saying(net.datafaker.Dune$Saying p0)`
- `public java.lang.String title()`

---

## public final static enum `net.datafaker.Dune$Quote`
extends `java.lang.Enum`  

**Fields:**
- `public final static net.datafaker.Dune$Quote ALIA`
- `public final static net.datafaker.Dune$Quote BARON_HARKONNEN`
- `public final static net.datafaker.Dune$Quote DUNCAN`
- `public final static net.datafaker.Dune$Quote EMPEROR`
- `public final static net.datafaker.Dune$Quote GUILD_NAIVGATOR`
- `public final static net.datafaker.Dune$Quote GUILD_NAVIGATOR`
- `public final static net.datafaker.Dune$Quote GURNEY`
- `public final static net.datafaker.Dune$Quote IRULAN`
- `public final static net.datafaker.Dune$Quote JESSICA`
- `public final static net.datafaker.Dune$Quote LETO`
- `public final static net.datafaker.Dune$Quote LIET_KYNES`
- `public final static net.datafaker.Dune$Quote MAPES`
- `public final static net.datafaker.Dune$Quote MOHIAM`
- `public final static net.datafaker.Dune$Quote PARDOT_KYNES`
- `public final static net.datafaker.Dune$Quote PAUL`
- `public final static net.datafaker.Dune$Quote PITER`
- `public final static net.datafaker.Dune$Quote STILGAR`
- `public final static net.datafaker.Dune$Quote THUFIR`
- `public final static net.datafaker.Dune$Quote YUEH`

---

## public final static enum `net.datafaker.Dune$Saying`
extends `java.lang.Enum`  

**Fields:**
- `public final static net.datafaker.Dune$Saying BENE_GESSERIT`
- `public final static net.datafaker.Dune$Saying FREMEN`
- `public final static net.datafaker.Dune$Saying MENTAT`
- `public final static net.datafaker.Dune$Saying MUADDIB`
- `public final static net.datafaker.Dune$Saying ORANGE_CATHOLIC_BIBLE`

---

## public class `net.datafaker.Educator`

**Constructors:**
- `protected Educator(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String campus()`
- `public java.lang.String course()`
- `public java.lang.String secondarySchool()`
- `public java.lang.String university()`

---

## public class `net.datafaker.EldenRing`

**Constructors:**
- `protected EldenRing(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String location()`
- `public java.lang.String npc()`
- `public java.lang.String skill()`
- `public java.lang.String spell()`
- `public java.lang.String weapon()`

---

## public class `net.datafaker.ElderScrolls`

**Constructors:**
- `protected ElderScrolls(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String city()`
- `public java.lang.String creature()`
- `public java.lang.String dragon()`
- `public java.lang.String firstName()`
- `public java.lang.String lastName()`
- `public java.lang.String quote()`
- `public java.lang.String race()`
- `public java.lang.String region()`

---

## public class `net.datafaker.ElectricalComponents`

**Constructors:**
- `protected ElectricalComponents(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String active()`
- `public java.lang.String electromechanical()`
- `public java.lang.String passive()`

---

## public class `net.datafaker.EnglandFootBall`

**Constructors:**
- `protected EnglandFootBall(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String league()`
- `public java.lang.String team()`

---

## public class `net.datafaker.Esports`

**Constructors:**
- `protected Esports(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String event()`
- `public java.lang.String game()`
- `public java.lang.String league()`
- `public java.lang.String player()`
- `public java.lang.String team()`

---

## public class `net.datafaker.FakeCollection`<T extends java.lang.Object>

**Methods:**
- `public java.util.List get()`
- `public T singleton()`

---

## public static class `net.datafaker.FakeCollection$Builder`<T extends java.lang.Object>

**Constructors:**
- `public Builder()`

**Methods:**
- `public net.datafaker.FakeCollection build()`
- `public net.datafaker.FakeCollection$Builder faker(net.datafaker.Faker p0)`
- `public net.datafaker.FakeCollection$Builder maxLen(int p0)`
- `public net.datafaker.FakeCollection$Builder minLen(int p0)`
- `public net.datafaker.FakeCollection$Builder nullRate(double p0)`
- `public final net.datafaker.FakeCollection$Builder suppliers(java.util.function.Supplier... p0)`

---

## public class `net.datafaker.FakeDuration`

**Constructors:**
- `protected FakeDuration(net.datafaker.Faker p0)`

**Methods:**
- `public java.time.Duration atMostDays(long p0)`
- `public java.time.Duration atMostHours(long p0)`
- `public java.time.Duration atMostMinutes(long p0)`
- `public java.time.Duration atMostSeconds(long p0)`

---

## public class `net.datafaker.Faker`

**Constructors:**
- `public Faker()`
- `public Faker(java.util.Locale p0)`
- `public Faker(java.util.Locale p0, java.util.Random p1)`
- `public Faker(java.util.Locale p0, net.datafaker.service.RandomService p1)`
- `public Faker(java.util.Random p0)`
- `public Faker(net.datafaker.service.FakeValuesService p0, net.datafaker.service.RandomService p1)`

**Methods:**
- `public void addPath(java.util.Locale p0, java.nio.file.Path p1)`
- `public net.datafaker.Address address()`
- `public net.datafaker.Ancient ancient()`
- `public net.datafaker.Animal animal()`
- `public net.datafaker.App app()`
- `public net.datafaker.Appliance appliance()`
- `public net.datafaker.AquaTeenHungerForce aquaTeenHungerForce()`
- `public net.datafaker.Artist artist()`
- `public net.datafaker.Australia australia()`
- `public net.datafaker.Avatar avatar()`
- `public net.datafaker.Aviation aviation()`
- `public net.datafaker.Aws aws()`
- `public net.datafaker.Babylon5 babylon5()`
- `public net.datafaker.BackToTheFuture backToTheFuture()`
- `public net.datafaker.Barcode barcode()`
- `public net.datafaker.Basketball basketball()`
- `public net.datafaker.Battlefield1 battlefield1()`
- `public net.datafaker.Beer beer()`
- `public net.datafaker.BloodType bloodtype()`
- `public net.datafaker.BojackHorseman bojackHorseman()`
- `public net.datafaker.Book book()`
- `public net.datafaker.Bool bool()`
- `public net.datafaker.BossaNova bossaNova()`
- `public java.lang.String bothify(java.lang.String p0)`
- `public java.lang.String bothify(java.lang.String p0, boolean p1)`
- `public net.datafaker.BreakingBad breakingBad()`
- `public net.datafaker.BrooklynNineNine brooklynNineNine()`
- `public net.datafaker.Buffy buffy()`
- `public net.datafaker.Business business()`
- `public net.datafaker.Camera camera()`
- `public net.datafaker.Cat cat()`
- `public net.datafaker.ChuckNorris chuckNorris()`
- `public net.datafaker.CNPJ cnpj()`
- `public net.datafaker.Code code()`
- `public net.datafaker.Coin coin()`
- `public <T extends java.lang.Object> net.datafaker.FakeCollection$Builder collection()`
- `public net.datafaker.Color color()`
- `public net.datafaker.Commerce commerce()`
- `public net.datafaker.Company company()`
- `public net.datafaker.Country country()`
- `public net.datafaker.CPF cpf()`
- `public net.datafaker.CryptoCoin cryptoCoin()`
- `public java.lang.String csv(int p0, java.lang.String... p1)`
- `public java.lang.String csv(java.lang.String p0, char p1, boolean p2, int p3, java.lang.String... p4)`
- `public net.datafaker.Currency currency()`
- `public net.datafaker.DateAndTime date()`
- `public net.datafaker.Demographic demographic()`
- `public net.datafaker.Dessert dessert()`
- `public net.datafaker.Device device()`
- `public net.datafaker.Disease disease()`
- `public net.datafaker.Dog dog()`
- `public net.datafaker.Domain domain()`
- `public net.datafaker.DragonBall dragonBall()`
- `public net.datafaker.Dune dune()`
- `public net.datafaker.FakeDuration duration()`
- `public net.datafaker.Educator educator()`
- `public net.datafaker.EldenRing eldenRing()`
- `public net.datafaker.ElderScrolls elderScrolls()`
- `public net.datafaker.ElectricalComponents electricalComponents()`
- `public net.datafaker.EnglandFootBall englandfootball()`
- `public net.datafaker.Esports esports()`
- `public java.lang.String examplify(java.lang.String p0)`
- `public java.lang.String expression(java.lang.String p0)`
- `public net.datafaker.File file()`
- `public net.datafaker.Finance finance()`
- `public net.datafaker.Food food()`
- `public net.datafaker.Formula1 formula1()`
- `public net.datafaker.Friends friends()`
- `public net.datafaker.FunnyName funnyName()`
- `public net.datafaker.GameOfThrones gameOfThrones()`
- `public net.datafaker.Gender gender()`
- `protected <T extends java.lang.Object> T getProvider(java.lang.Class p0, java.util.function.Supplier p1)`
- `public net.datafaker.GratefulDead gratefulDead()`
- `public net.datafaker.Hacker hacker()`
- `public net.datafaker.HarryPotter harryPotter()`
- `public net.datafaker.Hashing hashing()`
- `public net.datafaker.Hearthstone hearthstone()`
- `public net.datafaker.HeyArnold heyArnold()`
- `public net.datafaker.Hipster hipster()`
- `public net.datafaker.HitchhikersGuideToTheGalaxy hitchhikersGuideToTheGalaxy()`
- `public net.datafaker.Hobbit hobbit()`
- `public net.datafaker.Hobby hobby()`
- `public net.datafaker.Horse horse()`
- `public net.datafaker.HowIMetYourMother howIMetYourMother()`
- `public net.datafaker.IdNumber idNumber()`
- `public static net.datafaker.Faker instance()`
- `public static net.datafaker.Faker instance(java.util.Locale p0)`
- `public static net.datafaker.Faker instance(java.util.Locale p0, java.util.Random p1)`
- `public static net.datafaker.Faker instance(java.util.Random p0)`
- `public net.datafaker.Internet internet()`
- `public net.datafaker.Job job()`
- `public net.datafaker.fileformats.Json json(java.lang.String... p0)`
- `public net.datafaker.fileformats.Json jsona(java.lang.String... p0)`
- `public net.datafaker.Kaamelott kaamelott()`
- `public net.datafaker.Kpop kpop()`
- `public net.datafaker.LeagueOfLegends leagueOfLegends()`
- `public net.datafaker.Lebowski lebowski()`
- `public java.lang.String letterify(java.lang.String p0)`
- `public java.lang.String letterify(java.lang.String p0, boolean p1)`
- `public net.datafaker.LordOfTheRings lordOfTheRings()`
- `public net.datafaker.Lorem lorem()`
- `public net.datafaker.Marketing marketing()`
- `public net.datafaker.Matz matz()`
- `public net.datafaker.Medical medical()`
- `public net.datafaker.Military military()`
- `public net.datafaker.Minecraft minecraft()`
- `public net.datafaker.Mood mood()`
- `public net.datafaker.Mountain mountain()`
- `public net.datafaker.Mountaineering mountaineering()`
- `public net.datafaker.Music music()`
- `public net.datafaker.Name name()`
- `public net.datafaker.Nation nation()`
- `public net.datafaker.NatoPhoneticAlphabet natoPhoneticAlphabet()`
- `public net.datafaker.Nigeria nigeria()`
- `public net.datafaker.Number number()`
- `public java.lang.String numerify(java.lang.String p0)`
- `public net.datafaker.Options options()`
- `public net.datafaker.OscarMovie oscarMovie()`
- `public net.datafaker.Overwatch overwatch()`
- `public net.datafaker.Passport passport()`
- `public net.datafaker.PhoneNumber phoneNumber()`
- `public net.datafaker.Photography photography()`
- `public net.datafaker.Pokemon pokemon()`
- `public net.datafaker.PrincessBride princessBride()`
- `public net.datafaker.ProgrammingLanguage programmingLanguage()`
- `public net.datafaker.service.RandomService random()`
- `public java.lang.String regexify(java.lang.String p0)`
- `public net.datafaker.Relationship relationships()`
- `public net.datafaker.ResidentEvil residentEvil()`
- `public java.lang.String resolve(java.lang.String p0)`
- `public net.datafaker.Restaurant restaurant()`
- `public net.datafaker.RickAndMorty rickAndMorty()`
- `public net.datafaker.Robin robin()`
- `public net.datafaker.RockBand rockBand()`
- `public net.datafaker.RuPaulDragRace ruPaulDragRace()`
- `public net.datafaker.Science science()`
- `public net.datafaker.Seinfeld seinfeld()`
- `public net.datafaker.Shakespeare shakespeare()`
- `public net.datafaker.Sip sip()`
- `public net.datafaker.Size size()`
- `public net.datafaker.SlackEmoji slackEmoji()`
- `public net.datafaker.SoulKnight soulKnight()`
- `public net.datafaker.Space space()`
- `public net.datafaker.StarCraft starCraft()`
- `public net.datafaker.StarTrek starTrek()`
- `public net.datafaker.Stock stock()`
- `public net.datafaker.Subscription subscription()`
- `public net.datafaker.SuperMario superMario()`
- `public net.datafaker.Superhero superhero()`
- `public net.datafaker.Tea tea()`
- `public net.datafaker.Team team()`
- `public java.lang.String templatify(java.lang.String p0, char p1, java.lang.String... p2)`
- `public java.lang.String templatify(java.lang.String p0, java.util.Map p1)`
- `public net.datafaker.TheItCrowd theItCrowd()`
- `public net.datafaker.Time time()`
- `public net.datafaker.Touhou touhou()`
- `public net.datafaker.Tron tron()`
- `public net.datafaker.TwinPeaks twinPeaks()`
- `public net.datafaker.Twitter twitter()`
- `public net.datafaker.University university()`
- `public net.datafaker.Vehicle vehicle()`
- `public net.datafaker.Volleyball volleyball()`
- `public net.datafaker.Weather weather()`
- `public net.datafaker.Witcher witcher()`
- `public net.datafaker.Yoda yoda()`
- `public net.datafaker.Zelda zelda()`

---

## public class `net.datafaker.File`

**Constructors:**
- `protected File(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String extension()`
- `public java.lang.String fileName()`
- `public java.lang.String fileName(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3)`
- `public java.lang.String mimeType()`

---

## public class `net.datafaker.Finance`

**Constructors:**
- `protected Finance(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String bic()`
- `public java.lang.String creditCard()`
- `public java.lang.String creditCard(net.datafaker.CreditCardType p0)`
- `public java.lang.String iban()`
- `public java.lang.String iban(java.lang.String p0)`
- `public java.lang.String nasdaqTicker()`
- `public java.lang.String nyseTicker()`
- `public java.lang.String stockMarket()`

---

## public class `net.datafaker.Food`

**Constructors:**
- `protected Food(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String dish()`
- `public java.lang.String fruit()`
- `public java.lang.String ingredient()`
- `public java.lang.String measurement()`
- `public java.lang.String spice()`
- `public java.lang.String sushi()`
- `public java.lang.String vegetable()`

---

## public class `net.datafaker.Formula1`

**Constructors:**
- `protected Formula1(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String circuit()`
- `public java.lang.String driver()`
- `public java.lang.String grandPrix()`
- `public java.lang.String team()`

---

## public class `net.datafaker.Friends`

**Constructors:**
- `protected Friends(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String character()`
- `public java.lang.String location()`
- `public java.lang.String quote()`

---

## public class `net.datafaker.FunnyName`

**Constructors:**
- `protected FunnyName(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String name()`

---

## public class `net.datafaker.GameOfThrones`

**Constructors:**
- `protected GameOfThrones(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String character()`
- `public java.lang.String city()`
- `public java.lang.String dragon()`
- `public java.lang.String house()`
- `public java.lang.String quote()`

---

## public class `net.datafaker.Gender`

**Constructors:**
- `protected Gender(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String binaryTypes()`
- `public java.lang.String shortBinaryTypes()`
- `public java.lang.String types()`

---

## public class `net.datafaker.GratefulDead`

**Constructors:**
- `protected GratefulDead(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String players()`
- `public java.lang.String songs()`

---

## public class `net.datafaker.Hacker`

**Constructors:**
- `protected Hacker(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String abbreviation()`
- `public java.lang.String adjective()`
- `public java.lang.String ingverb()`
- `public java.lang.String noun()`
- `public java.lang.String verb()`

---

## public class `net.datafaker.HarryPotter`

**Constructors:**
- `protected HarryPotter(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String book()`
- `public java.lang.String character()`
- `public java.lang.String house()`
- `public java.lang.String location()`
- `public java.lang.String quote()`
- `public java.lang.String spell()`

---

## public class `net.datafaker.Hashing`

**Constructors:**
- `protected Hashing(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String md2()`
- `public java.lang.String md5()`
- `public java.lang.String sha1()`
- `public java.lang.String sha256()`
- `public java.lang.String sha384()`
- `public java.lang.String sha512()`

---

## public class `net.datafaker.Hearthstone`

**Constructors:**
- `protected Hearthstone(net.datafaker.Faker p0)`

**Methods:**
- `public int battlegroundsScore()`
- `public java.lang.String mainCharacter()`
- `public java.lang.String mainPattern()`
- `public java.lang.String mainProfession()`
- `public java.lang.String standardRank()`
- `public java.lang.String wildRank()`

---

## public class `net.datafaker.HeyArnold`

**Constructors:**
- `protected HeyArnold(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String characters()`
- `public java.lang.String locations()`
- `public java.lang.String quotes()`

---

## public class `net.datafaker.Hipster`

**Constructors:**
- `protected Hipster(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String word()`

---

## public class `net.datafaker.HitchhikersGuideToTheGalaxy`

**Constructors:**
- `protected HitchhikersGuideToTheGalaxy(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String character()`
- `public java.lang.String location()`
- `public java.lang.String marvinQuote()`
- `public java.lang.String planet()`
- `public java.lang.String quote()`
- `public java.lang.String species()`
- `public java.lang.String starship()`

---

## public class `net.datafaker.Hobbit`

**Constructors:**
- `protected Hobbit(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String character()`
- `public java.lang.String location()`
- `public java.lang.String quote()`
- `public java.lang.String thorinsCompany()`

---

## public class `net.datafaker.Hobby`

**Constructors:**
- `protected Hobby(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String activity()`

---

## public class `net.datafaker.Horse`

**Constructors:**
- `protected Horse(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String breed()`
- `public java.lang.String name()`

---

## public class `net.datafaker.HowIMetYourMother`

**Constructors:**
- `protected HowIMetYourMother(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String catchPhrase()`
- `public java.lang.String character()`
- `public java.lang.String highFive()`
- `public java.lang.String quote()`

---

## public class `net.datafaker.IdNumber`

**Constructors:**
- `protected IdNumber(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String inValidEnZaSsn()`
- `public java.lang.String invalid()`
- `public java.lang.String invalidEsMXSsn()`
- `public java.lang.String invalidPtNif()`
- `public java.lang.String invalidSvSeSsn()`
- `public java.lang.String peselNumber()`
- `public java.lang.String peselNumber(java.time.LocalDate p0, net.datafaker.idnumbers.PeselNumber$Gender p1)`
- `public java.lang.String singaporeanFin()`
- `public java.lang.String singaporeanFinBefore2000()`
- `public java.lang.String singaporeanUin()`
- `public java.lang.String singaporeanUinBefore2000()`
- `public java.lang.String ssnValid()`
- `public java.lang.String valid()`
- `public java.lang.String validEnZaSsn()`
- `public java.lang.String validEsMXSsn()`
- `public java.lang.String validPtNif()`
- `public java.lang.String validSvSeSsn()`
- `public java.lang.String validZhCNSsn()`

---

## public class `net.datafaker.Internet`

**Constructors:**
- `protected Internet(net.datafaker.Faker p0)`

**Fields:**
- `public final static java.util.regex.Pattern DIACRITICS_AND_FRIENDS`

**Methods:**
- `public java.lang.String avatar()`
- `public java.lang.String domainName()`
- `public java.lang.String domainSuffix()`
- `public java.lang.String domainWord()`
- `public java.lang.String emailAddress()`
- `public java.lang.String emailAddress(java.lang.String p0)`
- `public java.net.InetAddress getIpV4Address() throws java.net.UnknownHostException`
- `public java.net.InetAddress getIpV6Address() throws java.net.UnknownHostException`
- `public java.net.InetAddress getPrivateIpV4Address() throws java.net.UnknownHostException`
- `public java.net.InetAddress getPublicIpV4Address() throws java.net.UnknownHostException`
- `public java.lang.String image()`
- `public java.lang.String image(java.lang.Integer p0, java.lang.Integer p1, java.lang.Boolean p2, java.lang.String p3)`
- `public java.lang.String ipV4Address()`
- `public java.lang.String ipV4Cidr()`
- `public java.lang.String ipV6Address()`
- `public java.lang.String ipV6Cidr()`
- `public java.lang.String macAddress()`
- `public java.lang.String macAddress(java.lang.String p0)`
- `public java.lang.String password()`
- `public java.lang.String password(boolean p0)`
- `public java.lang.String password(int p0, int p1)`
- `public java.lang.String password(int p0, int p1, boolean p2)`
- `public java.lang.String password(int p0, int p1, boolean p2, boolean p3)`
- `public java.lang.String password(int p0, int p1, boolean p2, boolean p3, boolean p4)`
- `public java.lang.String privateIpV4Address()`
- `public java.lang.String publicIpV4Address()`
- `public java.lang.String safeEmailAddress()`
- `public java.lang.String safeEmailAddress(java.lang.String p0)`
- `public java.lang.String slug()`
- `public java.lang.String slug(java.util.List p0, java.lang.String p1)`
- `public java.lang.String url()`
- `public java.lang.String userAgent(net.datafaker.Internet$UserAgent p0)`
- `public java.lang.String userAgentAny()`
- `public java.lang.String uuid()`

---

## public final static enum `net.datafaker.Internet$UserAgent`
extends `java.lang.Enum`  

**Fields:**
- `public final static net.datafaker.Internet$UserAgent AOL`
- `public final static net.datafaker.Internet$UserAgent CHROME`
- `public final static net.datafaker.Internet$UserAgent FIREFOX`
- `public final static net.datafaker.Internet$UserAgent INTERNET_EXPLORER`
- `public final static net.datafaker.Internet$UserAgent NETSCAPE`
- `public final static net.datafaker.Internet$UserAgent OPERA`
- `public final static net.datafaker.Internet$UserAgent SAFARI`

**Methods:**
- `public java.lang.String toString()`

---

## public class `net.datafaker.Job`

**Constructors:**
- `public Job(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String field()`
- `public java.lang.String keySkills()`
- `public java.lang.String position()`
- `public java.lang.String seniority()`
- `public java.lang.String title()`

---

## public class `net.datafaker.Kaamelott`

**Constructors:**
- `protected Kaamelott(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String character()`
- `public java.lang.String quote()`

---

## public class `net.datafaker.Kpop`

**Constructors:**
- `protected Kpop(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String boyBands()`
- `public java.lang.String girlGroups()`
- `public java.lang.String iGroups()`
- `public java.lang.String iiGroups()`
- `public java.lang.String iiiGroups()`
- `public java.lang.String solo()`

---

## public class `net.datafaker.LeagueOfLegends`

**Constructors:**
- `protected LeagueOfLegends(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String champion()`
- `public java.lang.String location()`
- `public java.lang.String masteries()`
- `public java.lang.String quote()`
- `public java.lang.String rank()`
- `public java.lang.String summonerSpell()`

---

## public class `net.datafaker.Lebowski`

**Constructors:**
- `public Lebowski(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String actor()`
- `public java.lang.String character()`
- `public java.lang.String quote()`

---

## public class `net.datafaker.LordOfTheRings`

**Constructors:**
- `protected LordOfTheRings(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String character()`
- `public java.lang.String location()`

---

## public class `net.datafaker.Lorem`

**Constructors:**
- `protected Lorem(net.datafaker.Faker p0)`

**Methods:**
- `public char character()`
- `public char character(boolean p0)`
- `public java.lang.String characters()`
- `public java.lang.String characters(boolean p0)`
- `public java.lang.String characters(int p0)`
- `public java.lang.String characters(int p0, boolean p1)`
- `public java.lang.String characters(int p0, boolean p1, boolean p2)`
- `public java.lang.String characters(int p0, boolean p1, boolean p2, boolean p3)`
- `public java.lang.String characters(int p0, int p1)`
- `public java.lang.String characters(int p0, int p1, boolean p2)`
- `public java.lang.String characters(int p0, int p1, boolean p2, boolean p3)`
- `public java.lang.String characters(int p0, int p1, boolean p2, boolean p3, boolean p4)`
- `public java.lang.String fixedString(int p0)`
- `public java.lang.String maxLengthSentence(int p0)`
- `public java.lang.String paragraph()`
- `public java.lang.String paragraph(int p0)`
- `public java.util.List paragraphs(int p0)`
- `public java.lang.String sentence()`
- `public java.lang.String sentence(int p0)`
- `public java.lang.String sentence(int p0, int p1)`
- `public java.util.List sentences(int p0)`
- `public java.lang.String word()`
- `public java.util.List words()`
- `public java.util.List words(int p0)`

---

## public class `net.datafaker.Marketing`

**Constructors:**
- `protected Marketing(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String buzzwords()`

---

## public class `net.datafaker.Matz`

**Constructors:**
- `protected Matz(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String quote()`

---

## public class `net.datafaker.Medical`

**Constructors:**
- `protected Medical(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String diagnosisCode()`
- `public java.lang.String diseaseName()`
- `public java.lang.String hospitalName()`
- `public java.lang.String medicineName()`
- `public java.lang.String procedureCode()`
- `public java.lang.String symptoms()`

---

## public class `net.datafaker.Military`

**Constructors:**
- `protected Military(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String airForceRank()`
- `public java.lang.String armyRank()`
- `public java.lang.String dodPaygrade()`
- `public java.lang.String marinesRank()`
- `public java.lang.String navyRank()`

---

## public class `net.datafaker.Minecraft`

**Constructors:**
- `public Minecraft(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String animalName()`
- `public java.lang.String entityName()`
- `public java.lang.String itemName()`
- `public java.lang.String monsterName()`
- `public java.lang.String tileItemName()`
- `public java.lang.String tileName()`

---

## public class `net.datafaker.Mood`

**Constructors:**
- `protected Mood(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String emotion()`
- `public java.lang.String feeling()`
- `public java.lang.String tone()`

---

## public class `net.datafaker.Mountain`

**Constructors:**
- `protected Mountain(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String name()`
- `public java.lang.String range()`

---

## public class `net.datafaker.Mountaineering`

**Constructors:**
- `protected Mountaineering(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String mountaineer()`

---

## public class `net.datafaker.Music`

**Constructors:**
- `protected Music(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String chord()`
- `public java.lang.String genre()`
- `public java.lang.String instrument()`
- `public java.lang.String key()`

---

## public class `net.datafaker.Name`

**Constructors:**
- `protected Name(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String bloodGroup()`
- `public java.lang.String firstName()`
- `public java.lang.String fullName()`
- `public java.lang.String lastName()`
- `public java.lang.String name()`
- `public java.lang.String nameWithMiddle()`
- `public java.lang.String prefix()`
- `public java.lang.String suffix()`
- `public java.lang.String title()`
- `public java.lang.String username()`

---

## public class `net.datafaker.Nation`

**Constructors:**
- `protected Nation(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String capitalCity()`
- `public java.lang.String flag()`
- `public java.lang.String isoCountry()`
- `public java.lang.String isoLanguage()`
- `public java.lang.String language()`
- `public java.lang.String nationality()`

---

## public class `net.datafaker.NatoPhoneticAlphabet`

**Constructors:**
- `protected NatoPhoneticAlphabet(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String codeWord()`

---

## public class `net.datafaker.Nigeria`

**Constructors:**
- `protected Nigeria(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String celebrities()`
- `public java.lang.String food()`
- `public java.lang.String name()`
- `public java.lang.String places()`
- `public java.lang.String schools()`

---

## public class `net.datafaker.Number`

**Constructors:**
- `protected Number(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String digit()`
- `public java.lang.String digits(int p0)`
- `public int negative()`
- `public int numberBetween(int p0, int p1)`
- `public long numberBetween(long p0, long p1)`
- `public int positive()`
- `public int randomDigit()`
- `public int randomDigitNotZero()`
- `public double randomDouble(int p0, int p1, int p2)`
- `public double randomDouble(int p0, long p1, long p2)`
- `public long randomNumber()`
- `public long randomNumber(int p0, boolean p1)`

---

## public class `net.datafaker.Options`

**Constructors:**
- `protected Options(net.datafaker.Faker p0)`

**Methods:**
- `public <E extends java.lang.Object> E nextElement(E[] p0)`
- `public <E extends java.lang.Object> E nextElement(java.util.List p0)`
- `public final <E extends java.lang.Object> E option(E... p0)`
- `public <E extends java.lang.Enum<E>> E option(java.lang.Class p0)`
- `public java.lang.String option(java.lang.String... p0)`
- `public final <E extends java.lang.Object> java.util.Set subset(int p0, E... p1)`
- `public final java.util.Set subset(int p0, java.lang.String... p1)`

---

## public class `net.datafaker.OscarMovie`

**Constructors:**
- `protected OscarMovie(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String actor()`
- `public java.lang.String character()`
- `public java.lang.String getChoice()`
- `public java.lang.String getYear()`
- `public java.lang.String movieName()`
- `public java.lang.String quote()`
- `public java.lang.String releaseDate()`

---

## public class `net.datafaker.Overwatch`

**Constructors:**
- `protected Overwatch(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String hero()`
- `public java.lang.String location()`
- `public java.lang.String quote()`

---

## public class `net.datafaker.Passport`

**Constructors:**
- `protected Passport(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String amInvalid()`
- `public java.lang.String amValid()`
- `public java.lang.String chInvalid()`
- `public java.lang.String chValid()`

---

## public class `net.datafaker.PhoneNumber`

**Constructors:**
- `protected PhoneNumber(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String cellPhone()`
- `public java.lang.String extension()`
- `public java.lang.String phoneNumber()`
- `public java.lang.String subscriberNumber()`
- `public java.lang.String subscriberNumber(int p0)`

---

## public class `net.datafaker.Photography`

**Constructors:**
- `protected Photography(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String aperture()`
- `public java.lang.String brand()`
- `public java.lang.String camera()`
- `public java.lang.String genre()`
- `public java.lang.String imageTag()`
- `public java.lang.String iso()`
- `public java.lang.String lens()`
- `public java.lang.String shutter()`
- `public java.lang.String term()`

---

## public class `net.datafaker.Pokemon`

**Constructors:**
- `protected Pokemon(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String location()`
- `public java.lang.String name()`

---

## public class `net.datafaker.PrincessBride`

**Constructors:**
- `protected PrincessBride(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String character()`
- `public java.lang.String quote()`

---

## public class `net.datafaker.ProgrammingLanguage`

**Constructors:**
- `public ProgrammingLanguage(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String creator()`
- `public java.lang.String name()`

---

## public class `net.datafaker.Relationship`

**Constructors:**
- `protected Relationship(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String any()`
- `public java.lang.String direct()`
- `public java.lang.String extended()`
- `public java.lang.String inLaw()`
- `public java.lang.String parent()`
- `public java.lang.String sibling()`
- `public java.lang.String spouse()`

---

## public class `net.datafaker.ResidentEvil`

**Constructors:**
- `protected ResidentEvil(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String biologicalAgent()`
- `public java.lang.String character()`
- `public java.lang.String creature()`
- `public java.lang.String equipment()`
- `public java.lang.String location()`

---

## public class `net.datafaker.Restaurant`

**Constructors:**
- `protected Restaurant(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String description()`
- `public java.lang.String name()`
- `public java.lang.String namePrefix()`
- `public java.lang.String nameSuffix()`
- `public java.lang.String review()`
- `public java.lang.String type()`

---

## public class `net.datafaker.RickAndMorty`

**Constructors:**
- `protected RickAndMorty(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String character()`
- `public java.lang.String location()`
- `public java.lang.String quote()`

---

## public class `net.datafaker.Robin`

**Constructors:**
- `protected Robin(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String quote()`

---

## public class `net.datafaker.RockBand`

**Constructors:**
- `protected RockBand(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String name()`

---

## public class `net.datafaker.RuPaulDragRace`

**Constructors:**
- `protected RuPaulDragRace(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String queen()`
- `public java.lang.String quote()`

---

## public class `net.datafaker.Science`

**Constructors:**
- `protected Science(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String bosons()`
- `public java.lang.String element()`
- `public java.lang.String elementSymbol()`
- `public java.lang.String leptons()`
- `public java.lang.String quark()`
- `public java.lang.String scientist()`
- `public java.lang.String tool()`

---

## public class `net.datafaker.Seinfeld`

**Constructors:**
- `protected Seinfeld(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String business()`
- `public java.lang.String character()`
- `public java.lang.String quote()`

---

## public class `net.datafaker.Shakespeare`

**Constructors:**
- `protected Shakespeare(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String asYouLikeItQuote()`
- `public java.lang.String hamletQuote()`
- `public java.lang.String kingRichardIIIQuote()`
- `public java.lang.String romeoAndJulietQuote()`

---

## public class `net.datafaker.Sip`

**Constructors:**
- `public Sip(net.datafaker.Faker p0)`

**Methods:**
- `public byte[] bodyBytes()`
- `public java.lang.String bodyString()`
- `public int clientErrorResponseCode()`
- `public java.lang.String clientErrorResponsePhrase()`
- `public java.lang.String contentType()`
- `public int globalErrorResponseCode()`
- `public java.lang.String globalErrorResponsePhrase()`
- `public int messagingPort()`
- `public java.lang.String method()`
- `public java.lang.String nameAddress()`
- `public int provisionalResponseCode()`
- `public java.lang.String provisionalResponsePhrase()`
- `public int redirectResponseCode()`
- `public java.lang.String redirectResponsePhrase()`
- `public int rtpPort()`
- `public int serverErrorResponseCode()`
- `public java.lang.String serverErrorResponsePhrase()`
- `public int successResponseCode()`
- `public java.lang.String successResponsePhrase()`

---

## public class `net.datafaker.Size`

**Constructors:**
- `protected Size(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String adjective()`

---

## public class `net.datafaker.SlackEmoji`

**Constructors:**
- `protected SlackEmoji(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String activity()`
- `public java.lang.String celebration()`
- `public java.lang.String custom()`
- `public java.lang.String emoji()`
- `public java.lang.String foodAndDrink()`
- `public java.lang.String nature()`
- `public java.lang.String objectsAndSymbols()`
- `public java.lang.String people()`
- `public java.lang.String travelAndPlaces()`

---

## public class `net.datafaker.SoulKnight`

**Constructors:**
- `protected SoulKnight(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String bosses()`
- `public java.lang.String buffs()`
- `public java.lang.String characters()`
- `public java.lang.String enemies()`
- `public java.lang.String statues()`
- `public java.lang.String weapons()`

---

## public class `net.datafaker.Space`

**Constructors:**
- `protected Space(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String agency()`
- `public java.lang.String agencyAbbreviation()`
- `public java.lang.String company()`
- `public java.lang.String constellation()`
- `public java.lang.String distanceMeasurement()`
- `public java.lang.String galaxy()`
- `public java.lang.String meteorite()`
- `public java.lang.String moon()`
- `public java.lang.String nasaSpaceCraft()`
- `public java.lang.String nebula()`
- `public java.lang.String planet()`
- `public java.lang.String star()`
- `public java.lang.String starCluster()`

---

## public class `net.datafaker.StarCraft`

**Constructors:**
- `protected StarCraft(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String building()`
- `public java.lang.String character()`
- `public java.lang.String planet()`
- `public java.lang.String unit()`

---

## public class `net.datafaker.StarTrek`

**Constructors:**
- `protected StarTrek(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String character()`
- `public java.lang.String klingon()`
- `public java.lang.String location()`
- `public java.lang.String species()`
- `public java.lang.String villain()`

---

## public class `net.datafaker.Stock`

**Constructors:**
- `protected Stock(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String nsdqSymbol()`
- `public java.lang.String nyseSymbol()`

---

## public class `net.datafaker.Subscription`

**Constructors:**
- `protected Subscription(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String paymentMethods()`
- `public java.lang.String paymentTerms()`
- `public java.lang.String plans()`
- `public java.lang.String statuses()`
- `public java.lang.String subscriptionTerms()`

---

## public class `net.datafaker.SuperMario`

**Constructors:**
- `protected SuperMario(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String characters()`
- `public java.lang.String games()`
- `public java.lang.String locations()`

---

## public class `net.datafaker.Superhero`

**Constructors:**
- `protected Superhero(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String descriptor()`
- `public java.lang.String name()`
- `public java.lang.String power()`
- `public java.lang.String prefix()`
- `public java.lang.String suffix()`

---

## public class `net.datafaker.Tea`

**Constructors:**
- `protected Tea(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String type()`
- `public java.lang.String variety()`

---

## public class `net.datafaker.Team`

**Constructors:**
- `protected Team(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String creature()`
- `public java.lang.String name()`
- `public java.lang.String sport()`
- `public java.lang.String state()`

---

## public class `net.datafaker.TheItCrowd`

**Constructors:**
- `protected TheItCrowd(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String actors()`
- `public java.lang.String characters()`
- `public java.lang.String emails()`
- `public java.lang.String quotes()`

---

## public class `net.datafaker.Time`

**Constructors:**
- `protected Time(net.datafaker.Faker p0)`

**Methods:**
- `public long between(java.time.LocalTime p0, java.time.LocalTime p1) throws java.lang.IllegalArgumentException`
- `public java.lang.String between(java.time.LocalTime p0, java.time.LocalTime p1, java.lang.String p2) throws java.lang.IllegalArgumentException`
- `public long future(int p0, int p1, java.time.temporal.ChronoUnit p2)`
- `public java.lang.String future(int p0, int p1, java.time.temporal.ChronoUnit p2, java.lang.String p3)`
- `public long future(int p0, java.time.temporal.ChronoUnit p1)`
- `public java.lang.String future(int p0, java.time.temporal.ChronoUnit p1, java.lang.String p2)`
- `public long past(int p0, int p1, java.time.temporal.ChronoUnit p2)`
- `public java.lang.String past(int p0, int p1, java.time.temporal.ChronoUnit p2, java.lang.String p3)`
- `public long past(int p0, java.time.temporal.ChronoUnit p1)`
- `public java.lang.String past(int p0, java.time.temporal.ChronoUnit p1, java.lang.String p2)`

---

## public class `net.datafaker.Touhou`

**Constructors:**
- `protected Touhou(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String characterFirstName()`
- `public java.lang.String characterLastName()`
- `public java.lang.String characterName()`
- `public java.lang.String gameName()`
- `public java.lang.String trackName()`

---

## public class `net.datafaker.Tron`

**Constructors:**
- `protected Tron(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String alternateCharacterSpelling()`
- `public java.lang.String alternateCharacterSpelling(net.datafaker.Tron$AlternateCharacterSpelling p0)`
- `public java.lang.String character()`
- `public java.lang.String character(net.datafaker.Tron$Character p0)`
- `public java.lang.String game()`
- `public java.lang.String location()`
- `public java.lang.String quote()`
- `public java.lang.String quote(net.datafaker.Tron$Quote p0)`
- `public java.lang.String tagline()`
- `public java.lang.String vehicle()`

---

## public final static enum `net.datafaker.Tron$AlternateCharacterSpelling`
extends `java.lang.Enum`  

**Fields:**
- `public final static net.datafaker.Tron$AlternateCharacterSpelling ALAN_BRADLEY`
- `public final static net.datafaker.Tron$AlternateCharacterSpelling CLU`
- `public final static net.datafaker.Tron$AlternateCharacterSpelling DR_LORA_BAINES`
- `public final static net.datafaker.Tron$AlternateCharacterSpelling DR_WALTER_GIBBS`
- `public final static net.datafaker.Tron$AlternateCharacterSpelling ED_DILLINGER`
- `public final static net.datafaker.Tron$AlternateCharacterSpelling KEVIN_FLYNN`
- `public final static net.datafaker.Tron$AlternateCharacterSpelling MCP`
- `public final static net.datafaker.Tron$AlternateCharacterSpelling ROY_KLEINBERG`

---

## public final static enum `net.datafaker.Tron$Character`
extends `java.lang.Enum`  

**Fields:**
- `public final static net.datafaker.Tron$Character OTHER`
- `public final static net.datafaker.Tron$Character PROGRAM`
- `public final static net.datafaker.Tron$Character USER`

---

## public final static enum `net.datafaker.Tron$Quote`
extends `java.lang.Enum`  

**Fields:**
- `public final static net.datafaker.Tron$Quote ALAN_BRADLEY`
- `public final static net.datafaker.Tron$Quote BIT`
- `public final static net.datafaker.Tron$Quote CLU`
- `public final static net.datafaker.Tron$Quote CROM`
- `public final static net.datafaker.Tron$Quote DR_LORA_BAINES`
- `public final static net.datafaker.Tron$Quote DR_WALTER_GIBBS`
- `public final static net.datafaker.Tron$Quote DUMONT`
- `public final static net.datafaker.Tron$Quote ED_DILLINGER`
- `public final static net.datafaker.Tron$Quote KEVIN_FLYNN`
- `public final static net.datafaker.Tron$Quote MCP`
- `public final static net.datafaker.Tron$Quote PROGRAM`
- `public final static net.datafaker.Tron$Quote RAM`
- `public final static net.datafaker.Tron$Quote SARK`
- `public final static net.datafaker.Tron$Quote TRON`
- `public final static net.datafaker.Tron$Quote YORI`

---

## public class `net.datafaker.TwinPeaks`

**Constructors:**
- `protected TwinPeaks(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String character()`
- `public java.lang.String location()`
- `public java.lang.String quote()`

---

## public class `net.datafaker.Twitter`

**Constructors:**
- `protected Twitter(net.datafaker.Faker p0)`

**Methods:**
- `public java.util.Date createdTime(boolean p0, java.util.Date p1, java.util.Date p2)`
- `public java.lang.String getLink(java.lang.String p0, int p1)`
- `public java.lang.String text(java.lang.String[] p0, int p1, int p2)`
- `public java.lang.String twitterId(int p0)`
- `public java.lang.String userId()`
- `public java.lang.String userName()`

---

## public class `net.datafaker.University`

**Constructors:**
- `protected University(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String name()`
- `public java.lang.String prefix()`
- `public java.lang.String suffix()`

---

## public class `net.datafaker.Vehicle`

**Constructors:**
- `public Vehicle(net.datafaker.Faker p0)`

**Methods:**
- `public java.util.List carOptions()`
- `public java.util.List carOptions(int p0, int p1)`
- `public java.lang.String carType()`
- `public java.lang.String color()`
- `public java.lang.String doors()`
- `public java.lang.String driveType()`
- `public java.lang.String engine()`
- `public java.lang.String fuelType()`
- `public java.lang.String licensePlate()`
- `public java.lang.String licensePlate(java.lang.String p0)`
- `public java.lang.String make()`
- `public java.lang.String makeAndModel()`
- `public java.lang.String manufacturer()`
- `public java.lang.String model()`
- `public java.lang.String model(java.lang.String p0)`
- `public java.util.List standardSpecs()`
- `public java.util.List standardSpecs(int p0, int p1)`
- `public java.lang.String style()`
- `public java.lang.String transmission()`
- `public java.lang.String vin()`

---

## public class `net.datafaker.Volleyball`

**Constructors:**
- `protected Volleyball(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String coach()`
- `public java.lang.String formation()`
- `public java.lang.String player()`
- `public java.lang.String position()`
- `public java.lang.String team()`

---

## public class `net.datafaker.Weather`

**Constructors:**
- `protected Weather(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String description()`
- `public java.lang.String temperatureCelsius()`
- `public java.lang.String temperatureCelsius(int p0, int p1)`
- `public java.lang.String temperatureFahrenheit()`
- `public java.lang.String temperatureFahrenheit(int p0, int p1)`

---

## public class `net.datafaker.Witcher`

**Constructors:**
- `protected Witcher(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String book()`
- `public java.lang.String character()`
- `public java.lang.String location()`
- `public java.lang.String monster()`
- `public java.lang.String potion()`
- `public java.lang.String quote()`
- `public java.lang.String school()`
- `public java.lang.String sign()`
- `public java.lang.String witcher()`

---

## public class `net.datafaker.Yoda`

**Constructors:**
- `protected Yoda(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String quote()`

---

## public class `net.datafaker.Zelda`

**Constructors:**
- `protected Zelda(net.datafaker.Faker p0)`

**Methods:**
- `public java.lang.String character()`
- `public java.lang.String game()`

---

## public class `net.datafaker.fileformats.Csv`<T extends java.lang.Object>

**Fields:**
- `public final static char DEFAULT_QUOTE`
- `public final static java.lang.String DEFAULT_SEPARATOR`

**Methods:**
- `public java.lang.String get()`

---

## public static class `net.datafaker.fileformats.Csv$CollectionColumn`<T extends java.lang.Object>

**Methods:**
- `public java.lang.String getName()`
- `public java.lang.String getValue(T p0)`
- `public static <T extends java.lang.Object> net.datafaker.fileformats.Csv$CollectionColumn of(java.util.function.Supplier p0, java.util.function.Function p1)`

---

## public static class `net.datafaker.fileformats.Csv$Column`
extends `net.datafaker.fileformats.Csv$CollectionColumn`  

**Methods:**
- `public static net.datafaker.fileformats.Csv$Column of(java.lang.String p0, java.util.function.Supplier p1)`
- `public static net.datafaker.fileformats.Csv$Column of(java.util.function.Supplier p0, java.util.function.Supplier p1)`

---

## public abstract static class `net.datafaker.fileformats.Csv$CsvBuilder`

**Constructors:**
- `public CsvBuilder()`

**Methods:**
- `public abstract net.datafaker.fileformats.Csv build()`
- `public int getLimit()`
- `public char getQuote()`
- `public java.lang.String getSeparator()`
- `public <T extends net.datafaker.fileformats.Csv$CsvBuilder> T header(boolean p0)`
- `public boolean isWithHeader()`
- `public <T extends net.datafaker.fileformats.Csv$CsvBuilder> T limit(int p0)`
- `public <T extends net.datafaker.fileformats.Csv$CsvBuilder> T quote(char p0)`
- `public <T extends net.datafaker.fileformats.Csv$CsvBuilder> T separator(java.lang.String p0)`

---

## public static class `net.datafaker.fileformats.Csv$CsvCollectionBasedBuilder`<T extends java.lang.Object>
extends `net.datafaker.fileformats.Csv$CsvBuilder`  

**Constructors:**
- `public CsvCollectionBasedBuilder()`

**Fields:**
- `protected net.datafaker.FakeCollection collection`
- `protected java.util.function.Function[] columnValues`
- `protected java.util.function.Supplier[] headers`

**Methods:**
- `public net.datafaker.fileformats.Csv build()`
- `public final net.datafaker.fileformats.Csv$CsvCollectionBasedBuilder columns(java.util.function.Function... p0)`
- `public final net.datafaker.fileformats.Csv$CsvCollectionBasedBuilder columns(java.util.function.Supplier... p0)`
- `public final net.datafaker.fileformats.Csv$CsvCollectionBasedBuilder headers(java.util.function.Supplier... p0)`

---

## public static class `net.datafaker.fileformats.Csv$CsvColumnBasedBuilder`<T extends java.lang.Object, U extends net.datafaker.fileformats.Csv$CollectionColumn<T>>
extends `net.datafaker.fileformats.Csv$CsvBuilder`  

**Constructors:**
- `public CsvColumnBasedBuilder()`

**Methods:**
- `public net.datafaker.fileformats.Csv build()`
- `public final net.datafaker.fileformats.Csv$CsvColumnBasedBuilder columns(U... p0)`
- `public final net.datafaker.fileformats.Csv$CsvColumnBasedBuilder columns(java.util.List p0)`

---

## public class `net.datafaker.fileformats.Format`

**Constructors:**
- `public Format()`

**Methods:**
- `public static net.datafaker.fileformats.Csv$CsvColumnBasedBuilder toCsv(java.util.List p0)`
- `public static <T extends java.lang.Object> net.datafaker.fileformats.Csv$CsvCollectionBasedBuilder toCsv(net.datafaker.FakeCollection p0)`
- `public static net.datafaker.fileformats.Csv$CsvColumnBasedBuilder toCsv(net.datafaker.fileformats.Csv$Column... p0)`
- `public static net.datafaker.fileformats.Json$JsonBuilder toJson()`
- `public static <T extends java.lang.Object> net.datafaker.fileformats.Json$JsonFromCollectionBuilder toJson(net.datafaker.FakeCollection p0)`

---

## public class `net.datafaker.fileformats.Json`

**Constructors:**
- `public Json(java.util.Map p0)`

**Methods:**
- `public java.lang.String generate()`
- `public java.lang.String toString()`

---

## public static class `net.datafaker.fileformats.Json$JsonBuilder`

**Constructors:**
- `public JsonBuilder()`

**Methods:**
- `public net.datafaker.fileformats.Json build()`
- `public net.datafaker.fileformats.Json$JsonBuilder set(java.lang.String p0, java.util.function.Supplier p1)`
- `public net.datafaker.fileformats.Json$JsonBuilder set(java.util.function.Supplier p0, java.util.function.Supplier p1)`

---

## public static class `net.datafaker.fileformats.Json$JsonForFakeCollection`<T extends java.lang.Object>

**Constructors:**
- `public JsonForFakeCollection(net.datafaker.FakeCollection p0, java.util.Map p1)`

**Methods:**
- `public java.lang.String generate()`

---

## public static class `net.datafaker.fileformats.Json$JsonFromCollectionBuilder`<T extends java.lang.Object>

**Constructors:**
- `public JsonFromCollectionBuilder(net.datafaker.FakeCollection p0)`

**Methods:**
- `public net.datafaker.fileformats.Json$JsonForFakeCollection build()`
- `public net.datafaker.fileformats.Json$JsonFromCollectionBuilder set(java.lang.String p0, java.util.function.Function p1)`
- `public net.datafaker.fileformats.Json$JsonFromCollectionBuilder set(java.lang.String p0, net.datafaker.fileformats.Json$JsonForFakeCollection p1)`
- `public net.datafaker.fileformats.Json$JsonFromCollectionBuilder set(java.lang.String p0, net.datafaker.fileformats.Json p1)`
- `public net.datafaker.fileformats.Json$JsonFromCollectionBuilder set(java.util.function.Function p0, java.util.function.Function p1)`

---

## public class `net.datafaker.fileformats.Xml`

**Constructors:**
- `public Xml(net.datafaker.fileformats.Xml$XmlNode p0)`

**Methods:**
- `public java.lang.String generate()`
- `public java.lang.String generate(boolean p0)`

---

## public static class `net.datafaker.fileformats.Xml$XmlNode`

**Constructors:**
- `public XmlNode(java.lang.String p0, java.lang.String p1)`
- `public XmlNode(java.lang.String p0, java.util.Collection p1)`
- `public XmlNode(java.lang.String p0, java.util.Map p1, java.lang.String p2)`
- `public XmlNode(java.lang.String p0, java.util.Map p1, java.util.Collection p2)`

---

## public class `net.datafaker.fileformats.Yaml`

**Constructors:**
- `public Yaml(java.util.Map p0)`

**Methods:**
- `public java.lang.String generate()`

---

## public class `net.datafaker.idnumbers.EnIdNumber`

**Constructors:**
- `public EnIdNumber()`

**Methods:**
- `public java.lang.String getValidSsn(net.datafaker.Faker p0)`

---

## public class `net.datafaker.idnumbers.EnZAIdNumber`

**Constructors:**
- `public EnZAIdNumber()`

**Methods:**
- `public java.lang.String getInValidSsn(net.datafaker.Faker p0)`
- `public java.lang.String getValidSsn(net.datafaker.Faker p0)`

---

## public class `net.datafaker.idnumbers.EsMXIdNumber`

**Constructors:**
- `public EsMXIdNumber()`

**Methods:**
- `public java.lang.String get(net.datafaker.Faker p0)`
- `public java.lang.String getWrong(net.datafaker.Faker p0)`

---

## public class `net.datafaker.idnumbers.NricNumber`

**Constructors:**
- `public NricNumber()`

**Methods:**
- `public static java.lang.String getValidFIN(net.datafaker.Faker p0, net.datafaker.idnumbers.NricNumber$Type p1)`

---

## public final static enum `net.datafaker.idnumbers.NricNumber$Type`
extends `java.lang.Enum`  

**Fields:**
- `public final static net.datafaker.idnumbers.NricNumber$Type FOREIGNER_TWENTIETH_CENTURY`
- `public final static net.datafaker.idnumbers.NricNumber$Type FOREIGNER_TWENTY_FIRST_CENTURY`
- `public final static net.datafaker.idnumbers.NricNumber$Type SINGAPOREAN_TWENTIETH_CENTURY`
- `public final static net.datafaker.idnumbers.NricNumber$Type SINGAPOREAN_TWENTY_FIRST_CENTURY`

---

## public class `net.datafaker.idnumbers.PeselNumber`

**Constructors:**
- `public PeselNumber(net.datafaker.Faker p0)`

**Fields:**
- `public final static int PESEL_LENGTH`

**Methods:**
- `public java.lang.String get(java.time.LocalDate p0, net.datafaker.idnumbers.PeselNumber$Gender p1)`

---

## public final static enum `net.datafaker.idnumbers.PeselNumber$Gender`
extends `java.lang.Enum`  

**Fields:**
- `public final static net.datafaker.idnumbers.PeselNumber$Gender ANY`
- `public final static net.datafaker.idnumbers.PeselNumber$Gender FEMALE`
- `public final static net.datafaker.idnumbers.PeselNumber$Gender MALE`

---

## public class `net.datafaker.idnumbers.PtNifIdNumber`

**Constructors:**
- `public PtNifIdNumber()`

**Methods:**
- `public java.lang.String getInvalid(net.datafaker.Faker p0)`
- `public java.lang.String getValid(net.datafaker.Faker p0)`

---

## public class `net.datafaker.idnumbers.SvSEIdNumber`

**Constructors:**
- `public SvSEIdNumber()`

**Methods:**
- `public java.lang.String getInvalidSsn(net.datafaker.Faker p0)`
- `public java.lang.String getValidSsn(net.datafaker.Faker p0)`

---

## public class `net.datafaker.idnumbers.ZhCnIdNumber`

**Constructors:**
- `public ZhCnIdNumber()`

**Methods:**
- `public java.lang.String getValidSsn(net.datafaker.Faker p0)`

---

## public final class `net.datafaker.idnumbers.pt.br.DocumentFormatterUtil`

**Methods:**
- `public static java.lang.String cnpj(java.lang.String p0)`
- `public static java.lang.String cpf(java.lang.String p0)`
- `public static java.lang.String unmask(java.lang.String p0)`

---

## public final class `net.datafaker.idnumbers.pt.br.IdNumberGeneratorPtBrUtil`

**Methods:**
- `public static int calculateWeight(java.lang.String p0, int p1)`
- `public static java.lang.String cnpj(net.datafaker.Faker p0, boolean p1, boolean p2, boolean p3)`
- `public static java.lang.String cpf(net.datafaker.Faker p0, boolean p1, boolean p2)`
- `public static int digit(int p0)`
- `public static java.lang.Boolean isCNPJValid(java.lang.String p0)`
- `public static java.lang.Boolean isCPFValid(java.lang.String p0)`

---

## public class `net.datafaker.passportnumbers.AmPassportNumber`

**Constructors:**
- `public AmPassportNumber()`

**Methods:**
- `public java.lang.String getInvalidAm(net.datafaker.Faker p0)`
- `public java.lang.String getValidAm(net.datafaker.Faker p0)`

---

## public class `net.datafaker.passportnumbers.ChPassportNumber`

**Constructors:**
- `public ChPassportNumber()`

**Methods:**
- `public java.lang.String getInvalidCh(net.datafaker.Faker p0)`
- `public java.lang.String getValidCh(net.datafaker.Faker p0)`

---

## public class `net.datafaker.service.FakeValues`
implements `net.datafaker.service.FakeValuesInterface`  

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.util.Map get(java.lang.String p0)`
- `public int hashCode()`

---

## public class `net.datafaker.service.FakeValuesGrouping`
implements `net.datafaker.service.FakeValuesInterface`  

**Constructors:**
- `public FakeValuesGrouping()`

**Methods:**
- `public void add(net.datafaker.service.FakeValuesInterface p0)`
- `public java.util.Map get(java.lang.String p0)`
- `public static net.datafaker.service.FakeValuesGrouping getEnglishFakeValueGrouping()`

---

## public abstract interface `net.datafaker.service.FakeValuesInterface`

**Methods:**
- `public abstract java.util.Map get(java.lang.String p0)`

---

## public class `net.datafaker.service.FakeValuesService`

**Constructors:**
- `public FakeValuesService(java.util.Locale p0, net.datafaker.service.RandomService p1)`

**Methods:**
- `public void addPath(java.util.Locale p0, java.nio.file.Path p1)`
- `public java.lang.String bothify(java.lang.String p0)`
- `public java.lang.String bothify(java.lang.String p0, boolean p1)`
- `public java.lang.String csv(int p0, java.lang.String... p1)`
- `public java.lang.String csv(java.lang.String p0, char p1, boolean p2, int p3, java.lang.String... p4)`
- `public java.lang.String examplify(java.lang.String p0)`
- `public java.lang.String expression(java.lang.String p0, net.datafaker.Faker p1)`
- `public java.lang.Object fetch(java.lang.String p0)`
- `public java.lang.Object fetchObject(java.lang.String p0)`
- `public java.lang.String fetchString(java.lang.String p0)`
- `public java.lang.String fileExpression(java.nio.file.Path p0, net.datafaker.Faker p1)`
- `public java.util.List getLocalesChain()`
- `public net.datafaker.fileformats.Json json(java.lang.String... p0)`
- `public net.datafaker.fileformats.Json jsona(java.lang.String... p0)`
- `public java.lang.String letterify(java.lang.String p0)`
- `public java.lang.String letterify(java.lang.String p0, boolean p1)`
- `protected java.util.List localeChain(java.util.Locale p0)`
- `public java.lang.String numerify(java.lang.String p0)`
- `public static java.lang.Class primitiveToWrapper(java.lang.Class p0)`
- `public java.lang.String regexify(java.lang.String p0)`
- `public java.lang.String resolve(java.lang.String p0, java.lang.Object p1, net.datafaker.Faker p2)`
- `public java.lang.String resolve(java.lang.String p0, java.lang.Object p1, net.datafaker.Faker p2, java.util.function.Supplier p3)`
- `protected java.lang.String resolveExpression(java.lang.String p0, java.lang.Object p1, net.datafaker.Faker p2)`
- `public java.lang.String safeFetch(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String templatify(java.lang.String p0, char p1, java.lang.String... p2)`
- `public java.lang.String templatify(java.lang.String p0, java.util.Map p1)`

---

## public class `net.datafaker.service.FakerIDN`

**Constructors:**
- `public FakerIDN()`

**Methods:**
- `public static java.lang.String toASCII(java.lang.String p0)`

---

## public class `net.datafaker.service.LocalePicker`

**Constructors:**
- `public LocalePicker()`
- `public LocalePicker(java.util.Random p0)`

**Methods:**
- `public java.util.List getAllSupportedLocales()`
- `public java.util.Locale getLocale()`
- `public java.lang.String getLocaleString(java.util.Random p0)`
- `public java.lang.String getLocaleStringWithoutReplacement(java.util.Random p0)`
- `public java.util.Locale getLocaleWithoutReplacement()`

---

## public class `net.datafaker.service.RandomService`

**Constructors:**
- `public RandomService()`
- `public RandomService(java.util.Random p0)`

**Methods:**
- `public java.util.Random getRandomInternal()`
- `public java.lang.String hex()`
- `public java.lang.String hex(int p0)`
- `public boolean nextBoolean()`
- `public double nextDouble()`
- `public double nextDouble(double p0, double p1)`
- `public float nextFloat()`
- `public int nextInt()`
- `public int nextInt(int p0)`
- `public java.lang.Integer nextInt(int p0, int p1)`
- `public long nextLong()`
- `public long nextLong(long p0)`
- `public long nextLong(long p0, long p1)`

---

## public class `net.datafaker.service.files.EnFile`

**Fields:**
- `public final static java.lang.String YML`

**Methods:**
- `public java.lang.String getFile()`
- `public static java.util.List getFiles()`
- `public java.lang.String getPath()`

---

