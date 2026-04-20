# Breaking Changes: org.yaml:snakeyaml 1.24 → 2.0
Total: 83 (binary-breaking: 64, source-breaking: 83)

## org.yaml.snakeyaml.DumperOptions$FlowStyle

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.yaml.snakeyaml.DumperOptions$FlowStyle.fromBoolean(java.lang.Boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.yaml.snakeyaml.DumperOptions$FlowStyle.getStyleBoolean()`

## org.yaml.snakeyaml.LoaderOptions

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.yaml.snakeyaml.LoaderOptions.isAllowDuplicateKeys()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.yaml.snakeyaml.LoaderOptions.isWrappedToRootException()`

## org.yaml.snakeyaml.TypeDescription

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.yaml.snakeyaml.TypeDescription.getListPropertyType(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.yaml.snakeyaml.TypeDescription.getMapKeyType(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.yaml.snakeyaml.TypeDescription.getMapValueType(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.yaml.snakeyaml.TypeDescription.setTag(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.yaml.snakeyaml.TypeDescription.setTag(org.yaml.snakeyaml.nodes.Tag)`

## org.yaml.snakeyaml.Yaml

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.yaml.snakeyaml.Yaml.loadAs(java.io.InputStream,java.lang.Class<T>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.yaml.snakeyaml.Yaml.loadAs(java.io.Reader,java.lang.Class<T>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.yaml.snakeyaml.Yaml.loadAs(java.lang.String,java.lang.Class<T>)`

## org.yaml.snakeyaml.composer.Composer

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.composer.Composer.<init>(org.yaml.snakeyaml.parser.Parser,org.yaml.snakeyaml.resolver.Resolver)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.yaml.snakeyaml.composer.Composer.composeScalarNode(java.lang.String)`

## org.yaml.snakeyaml.constructor.BaseConstructor

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.constructor.BaseConstructor.<init>()`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.yaml.snakeyaml.constructor.BaseConstructor.newInstance(java.lang.Class<? extends java.lang.Object>,org.yaml.snakeyaml.nodes.Node)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.yaml.snakeyaml.constructor.BaseConstructor.newInstance(java.lang.Class<? extends java.lang.Object>,org.yaml.snakeyaml.nodes.Node,boolean)`

## org.yaml.snakeyaml.constructor.Constructor

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.constructor.Constructor.<init>()`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.constructor.Constructor.<init>(java.lang.Class<? extends java.lang.Object>)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.constructor.Constructor.<init>(java.lang.String)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.constructor.Constructor.<init>(org.yaml.snakeyaml.TypeDescription)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.constructor.Constructor.<init>(org.yaml.snakeyaml.TypeDescription,java.util.Collection<org.yaml.snakeyaml.TypeDescription>)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.yaml.snakeyaml.constructor.BaseConstructor.newInstance(java.lang.Class<? extends java.lang.Object>,org.yaml.snakeyaml.nodes.Node)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.yaml.snakeyaml.constructor.BaseConstructor.newInstance(java.lang.Class<? extends java.lang.Object>,org.yaml.snakeyaml.nodes.Node,boolean)`

## org.yaml.snakeyaml.constructor.CustomClassLoaderConstructor

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.constructor.CustomClassLoaderConstructor.<init>(java.lang.Class<? extends java.lang.Object>,java.lang.ClassLoader)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.constructor.CustomClassLoaderConstructor.<init>(java.lang.ClassLoader)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.yaml.snakeyaml.constructor.BaseConstructor.newInstance(java.lang.Class<? extends java.lang.Object>,org.yaml.snakeyaml.nodes.Node)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.yaml.snakeyaml.constructor.BaseConstructor.newInstance(java.lang.Class<? extends java.lang.Object>,org.yaml.snakeyaml.nodes.Node,boolean)`

## org.yaml.snakeyaml.constructor.SafeConstructor

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.constructor.SafeConstructor.<init>()`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.yaml.snakeyaml.constructor.BaseConstructor.newInstance(java.lang.Class<? extends java.lang.Object>,org.yaml.snakeyaml.nodes.Node)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.yaml.snakeyaml.constructor.BaseConstructor.newInstance(java.lang.Class<? extends java.lang.Object>,org.yaml.snakeyaml.nodes.Node,boolean)`

## org.yaml.snakeyaml.emitter.ScalarAnalysis

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.yaml.snakeyaml.emitter.ScalarAnalysis.allowBlock`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.yaml.snakeyaml.emitter.ScalarAnalysis.allowBlockPlain`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.yaml.snakeyaml.emitter.ScalarAnalysis.allowFlowPlain`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.yaml.snakeyaml.emitter.ScalarAnalysis.allowSingleQuoted`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.yaml.snakeyaml.emitter.ScalarAnalysis.empty`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.yaml.snakeyaml.emitter.ScalarAnalysis.multiline`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.yaml.snakeyaml.emitter.ScalarAnalysis.scalar`

## org.yaml.snakeyaml.error.Mark

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.error.Mark.<init>(java.lang.String,int,int,int,java.lang.String,int)`

## org.yaml.snakeyaml.events.CollectionEndEvent

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.yaml.snakeyaml.events.CollectionEndEvent`
+ MUST NOW IMPLEMENT: `org.yaml.snakeyaml.events.Event.getEventId()`

## org.yaml.snakeyaml.events.CollectionStartEvent

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.events.CollectionStartEvent.<init>(java.lang.String,java.lang.String,boolean,org.yaml.snakeyaml.error.Mark,org.yaml.snakeyaml.error.Mark,java.lang.Boolean)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.yaml.snakeyaml.events.CollectionStartEvent`
+ MUST NOW IMPLEMENT: `org.yaml.snakeyaml.events.Event.getEventId()`

## org.yaml.snakeyaml.events.Event

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.yaml.snakeyaml.events.Event`
+ MUST NOW IMPLEMENT: `org.yaml.snakeyaml.events.Event.getEventId()`

## org.yaml.snakeyaml.events.MappingStartEvent

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.events.MappingStartEvent.<init>(java.lang.String,java.lang.String,boolean,org.yaml.snakeyaml.error.Mark,org.yaml.snakeyaml.error.Mark,java.lang.Boolean)`

## org.yaml.snakeyaml.events.NodeEvent

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.yaml.snakeyaml.events.NodeEvent`
+ MUST NOW IMPLEMENT: `org.yaml.snakeyaml.events.Event.getEventId()`

## org.yaml.snakeyaml.events.ScalarEvent

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.events.ScalarEvent.<init>(java.lang.String,java.lang.String,org.yaml.snakeyaml.events.ImplicitTuple,java.lang.String,org.yaml.snakeyaml.error.Mark,org.yaml.snakeyaml.error.Mark,java.lang.Character)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.yaml.snakeyaml.events.ScalarEvent.getStyle()`

## org.yaml.snakeyaml.events.SequenceStartEvent

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.events.SequenceStartEvent.<init>(java.lang.String,java.lang.String,boolean,org.yaml.snakeyaml.error.Mark,org.yaml.snakeyaml.error.Mark,java.lang.Boolean)`

## org.yaml.snakeyaml.extensions.compactnotation.CompactConstructor

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.yaml.snakeyaml.constructor.BaseConstructor.newInstance(java.lang.Class<? extends java.lang.Object>,org.yaml.snakeyaml.nodes.Node)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.yaml.snakeyaml.constructor.BaseConstructor.newInstance(java.lang.Class<? extends java.lang.Object>,org.yaml.snakeyaml.nodes.Node,boolean)`

## org.yaml.snakeyaml.extensions.compactnotation.PackageCompactConstructor

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.yaml.snakeyaml.constructor.BaseConstructor.newInstance(java.lang.Class<? extends java.lang.Object>,org.yaml.snakeyaml.nodes.Node)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.yaml.snakeyaml.constructor.BaseConstructor.newInstance(java.lang.Class<? extends java.lang.Object>,org.yaml.snakeyaml.nodes.Node,boolean)`

## org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder`

## org.yaml.snakeyaml.external.com.google.gdata.util.common.base.Escaper

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.yaml.snakeyaml.external.com.google.gdata.util.common.base.Escaper`

## org.yaml.snakeyaml.external.com.google.gdata.util.common.base.PercentEscaper

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.yaml.snakeyaml.external.com.google.gdata.util.common.base.PercentEscaper`

## org.yaml.snakeyaml.external.com.google.gdata.util.common.base.UnicodeEscaper

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.yaml.snakeyaml.external.com.google.gdata.util.common.base.UnicodeEscaper`

## org.yaml.snakeyaml.nodes.AnchorNode

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.yaml.snakeyaml.nodes.Node.isResolved()`

## org.yaml.snakeyaml.nodes.CollectionNode

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.nodes.CollectionNode.<init>(org.yaml.snakeyaml.nodes.Tag,org.yaml.snakeyaml.error.Mark,org.yaml.snakeyaml.error.Mark,java.lang.Boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.yaml.snakeyaml.nodes.Node.isResolved()`

## org.yaml.snakeyaml.nodes.MappingNode

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.nodes.MappingNode.<init>(org.yaml.snakeyaml.nodes.Tag,boolean,java.util.List<org.yaml.snakeyaml.nodes.NodeTuple>,org.yaml.snakeyaml.error.Mark,org.yaml.snakeyaml.error.Mark,java.lang.Boolean)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.nodes.MappingNode.<init>(org.yaml.snakeyaml.nodes.Tag,java.util.List<org.yaml.snakeyaml.nodes.NodeTuple>,java.lang.Boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.yaml.snakeyaml.nodes.Node.isResolved()`

## org.yaml.snakeyaml.nodes.Node

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.yaml.snakeyaml.nodes.Node.isResolved()`

## org.yaml.snakeyaml.nodes.ScalarNode

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.nodes.ScalarNode.<init>(org.yaml.snakeyaml.nodes.Tag,boolean,java.lang.String,org.yaml.snakeyaml.error.Mark,org.yaml.snakeyaml.error.Mark,java.lang.Character)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.nodes.ScalarNode.<init>(org.yaml.snakeyaml.nodes.Tag,java.lang.String,org.yaml.snakeyaml.error.Mark,org.yaml.snakeyaml.error.Mark,java.lang.Character)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.yaml.snakeyaml.nodes.Node.isResolved()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.yaml.snakeyaml.nodes.ScalarNode.getStyle()`

## org.yaml.snakeyaml.nodes.SequenceNode

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.nodes.SequenceNode.<init>(org.yaml.snakeyaml.nodes.Tag,boolean,java.util.List<org.yaml.snakeyaml.nodes.Node>,org.yaml.snakeyaml.error.Mark,org.yaml.snakeyaml.error.Mark,java.lang.Boolean)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.nodes.SequenceNode.<init>(org.yaml.snakeyaml.nodes.Tag,java.util.List<org.yaml.snakeyaml.nodes.Node>,java.lang.Boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.yaml.snakeyaml.nodes.Node.isResolved()`

## org.yaml.snakeyaml.nodes.Tag

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.nodes.Tag.<init>(java.net.URI)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.yaml.snakeyaml.nodes.Tag.COMPATIBILITY_MAP`

## org.yaml.snakeyaml.parser.ParserImpl

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.parser.ParserImpl.<init>(org.yaml.snakeyaml.reader.StreamReader)`

## org.yaml.snakeyaml.representer.Representer

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.representer.Representer.<init>()`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.yaml.snakeyaml.representer.SafeRepresenter.MULTILINE_PATTERN`

## org.yaml.snakeyaml.scanner.Constant

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.yaml.snakeyaml.scanner.Constant.FULL_LINEBR`

## org.yaml.snakeyaml.scanner.ScannerImpl

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.scanner.ScannerImpl.<init>(org.yaml.snakeyaml.reader.StreamReader)`

## org.yaml.snakeyaml.tokens.CommentToken

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.yaml.snakeyaml.tokens.CommentToken`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.tokens.CommentToken.<init>(org.yaml.snakeyaml.error.Mark,org.yaml.snakeyaml.error.Mark)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.yaml.snakeyaml.tokens.CommentToken.getTokenId()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.yaml.snakeyaml.tokens.Token.getEndMark()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.yaml.snakeyaml.tokens.Token.getStartMark()`

## org.yaml.snakeyaml.tokens.WhitespaceToken

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.yaml.snakeyaml.tokens.WhitespaceToken`

