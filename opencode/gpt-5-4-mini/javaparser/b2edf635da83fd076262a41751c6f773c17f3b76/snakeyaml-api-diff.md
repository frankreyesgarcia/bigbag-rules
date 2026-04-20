# Breaking Changes: org.yaml:snakeyaml 1.32 → 2.0
Total: 55 (binary-breaking: 52, source-breaking: 55)

## org.yaml.snakeyaml.DumperOptions$FlowStyle

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.yaml.snakeyaml.DumperOptions$FlowStyle.fromBoolean(java.lang.Boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.yaml.snakeyaml.DumperOptions$FlowStyle.getStyleBoolean()`

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

## org.yaml.snakeyaml.constructor.BaseConstructor

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.constructor.BaseConstructor.<init>()`

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

## org.yaml.snakeyaml.constructor.CustomClassLoaderConstructor

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.constructor.CustomClassLoaderConstructor.<init>(java.lang.Class<? extends java.lang.Object>,java.lang.ClassLoader)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.constructor.CustomClassLoaderConstructor.<init>(java.lang.ClassLoader)`

## org.yaml.snakeyaml.constructor.SafeConstructor

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.constructor.SafeConstructor.<init>()`

## org.yaml.snakeyaml.error.Mark

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.error.Mark.<init>(java.lang.String,int,int,int,java.lang.String,int)`

## org.yaml.snakeyaml.events.CollectionStartEvent

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.events.CollectionStartEvent.<init>(java.lang.String,java.lang.String,boolean,org.yaml.snakeyaml.error.Mark,org.yaml.snakeyaml.error.Mark,java.lang.Boolean)`

## org.yaml.snakeyaml.events.MappingStartEvent

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.events.MappingStartEvent.<init>(java.lang.String,java.lang.String,boolean,org.yaml.snakeyaml.error.Mark,org.yaml.snakeyaml.error.Mark,java.lang.Boolean)`

## org.yaml.snakeyaml.events.ScalarEvent

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.events.ScalarEvent.<init>(java.lang.String,java.lang.String,org.yaml.snakeyaml.events.ImplicitTuple,java.lang.String,org.yaml.snakeyaml.error.Mark,org.yaml.snakeyaml.error.Mark,java.lang.Character)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.yaml.snakeyaml.events.ScalarEvent.getStyle()`

## org.yaml.snakeyaml.events.SequenceStartEvent

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.events.SequenceStartEvent.<init>(java.lang.String,java.lang.String,boolean,org.yaml.snakeyaml.error.Mark,org.yaml.snakeyaml.error.Mark,java.lang.Boolean)`

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
- REMOVED: `org.yaml.snakeyaml.nodes.CollectionNode.setFlowStyle(java.lang.Boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.yaml.snakeyaml.nodes.Node.isResolved()`

## org.yaml.snakeyaml.nodes.MappingNode

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.nodes.MappingNode.<init>(org.yaml.snakeyaml.nodes.Tag,boolean,java.util.List<org.yaml.snakeyaml.nodes.NodeTuple>,org.yaml.snakeyaml.error.Mark,org.yaml.snakeyaml.error.Mark,java.lang.Boolean)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.nodes.MappingNode.<init>(org.yaml.snakeyaml.nodes.Tag,java.util.List<org.yaml.snakeyaml.nodes.NodeTuple>,java.lang.Boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.yaml.snakeyaml.nodes.CollectionNode.setFlowStyle(java.lang.Boolean)`

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
- REMOVED: `org.yaml.snakeyaml.nodes.CollectionNode.setFlowStyle(java.lang.Boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.yaml.snakeyaml.nodes.Node.isResolved()`

## org.yaml.snakeyaml.nodes.Tag

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.nodes.Tag.<init>(java.net.URI)`

## org.yaml.snakeyaml.parser.ParserImpl

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.parser.ParserImpl.<init>(org.yaml.snakeyaml.reader.StreamReader)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.parser.ParserImpl.<init>(org.yaml.snakeyaml.reader.StreamReader,boolean)`

## org.yaml.snakeyaml.representer.Representer

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.representer.Representer.<init>()`

## org.yaml.snakeyaml.scanner.ScannerImpl

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.yaml.snakeyaml.scanner.ScannerImpl.<init>(org.yaml.snakeyaml.reader.StreamReader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.yaml.snakeyaml.scanner.ScannerImpl.isParseComments()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.yaml.snakeyaml.scanner.ScannerImpl.setParseComments(boolean)`

## org.yaml.snakeyaml.tokens.WhitespaceToken

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.yaml.snakeyaml.tokens.WhitespaceToken`

