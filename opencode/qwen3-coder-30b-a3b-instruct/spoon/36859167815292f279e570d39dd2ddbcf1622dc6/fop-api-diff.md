# Breaking Changes: org.apache.xmlgraphics:fop 1.0 → 2.2
Total: 5195 (binary-breaking: 3968, source-breaking: 4941)

## org.apache.fop.ResourceEventProducer

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.ResourceEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.ResourceEventProducer.hyphenationNotFound(java.lang.Object,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.ResourceEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.ResourceEventProducer.imageWarning(java.lang.Object,java.lang.String)`

## org.apache.fop.ResourceEventProducer$Provider

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.ResourceEventProducer$Provider`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.ResourceEventProducer$Provider`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.ResourceEventProducer$Provider.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.ResourceEventProducer$Provider.get(org.apache.fop.events.EventBroadcaster)`

## org.apache.fop.accessibility.Accessibility

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.accessibility.Accessibility.decorateDefaultHandler(org.xml.sax.helpers.DefaultHandler,org.apache.fop.apps.FOUserAgent)`

## org.apache.fop.accessibility.StructureTree

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.accessibility.StructureTree`

## org.apache.fop.accessibility.StructureTreeBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.accessibility.StructureTreeBuilder`

## org.apache.fop.afp.AFPBorderPainter

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.afp.AbstractAFPPainter.log`

## org.apache.fop.afp.AFPDitheredRectanglePainter

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.afp.AbstractAFPPainter.log`

## org.apache.fop.afp.AFPEventProducer

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.afp.AFPEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.afp.AFPEventProducer.charactersetMissingMetrics(java.lang.Object,char,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.afp.AFPEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.afp.AFPEventProducer.codePageNotFound(java.lang.Object,java.lang.Exception)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.afp.AFPEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.afp.AFPEventProducer.fontConfigMissing(java.lang.Object,java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.afp.AFPEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.afp.AFPEventProducer.characterSetNameInvalid(java.lang.Object,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.afp.AFPEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.afp.AFPEventProducer.invalidDBFontInSVG(java.lang.Object,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.afp.AFPEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.afp.AFPEventProducer.invalidConfiguration(java.lang.Object,java.lang.Exception)`

## org.apache.fop.afp.AFPEventProducer$Provider

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.afp.AFPEventProducer$Provider`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.afp.AFPEventProducer$Provider`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.AFPEventProducer$Provider.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.afp.AFPEventProducer$Provider.get(org.apache.fop.events.EventBroadcaster)`

## org.apache.fop.afp.AFPObjectAreaInfo

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.AFPObjectAreaInfo.<init>()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.AFPObjectAreaInfo.setHeight(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.AFPObjectAreaInfo.setRotation(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.AFPObjectAreaInfo.setWidth(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.AFPObjectAreaInfo.setX(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.AFPObjectAreaInfo.setY(int)`

## org.apache.fop.afp.AFPPaintingState

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.util.AbstractPaintingState.saveAll(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.util.AbstractPaintingState.getStateStack()`
+ NEW RETURN TYPE: `org.apache.fop.util.AbstractPaintingState.getStateStack()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.util.AbstractPaintingState.restoreAll()`
+ NEW RETURN TYPE: `org.apache.fop.util.AbstractPaintingState.restoreAll()`

## org.apache.fop.afp.AFPRectanglePainter

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.afp.AbstractAFPPainter.log`

## org.apache.fop.afp.AFPResourceLevel

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.AFPResourceLevel.<init>(int)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.AFPResourceLevel.DOCUMENT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.AFPResourceLevel.EXTERNAL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.AFPResourceLevel.INLINE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.AFPResourceLevel.PAGE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.AFPResourceLevel.PAGE_GROUP`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.AFPResourceLevel.PRINT_FILE`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.AFPResourceLevel.getExternalFilePath()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.AFPResourceLevel.setExternalFilePath(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.AFPResourceLevel.setLevel(int)`

## org.apache.fop.afp.AFPResourceManager

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.AFPResourceManager.<init>()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.AFPResourceManager.createIncludedResource(java.lang.String,java.net.URI,org.apache.fop.afp.util.ResourceAccessor,byte)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.AFPResourceManager.createIncludedResource(java.lang.String,org.apache.fop.afp.util.ResourceAccessor,byte)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.AFPResourceManager.setDefaultResourceGroupFilePath(java.lang.String)`

## org.apache.fop.afp.AFPStreamer

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.AFPStreamer.<init>(org.apache.fop.afp.Factory)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.AFPStreamer.setDefaultResourceGroupFilePath(java.lang.String)`

## org.apache.fop.afp.AbstractAFPPainter

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.afp.AbstractAFPPainter.log`

## org.apache.fop.afp.DataStream

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.DataStream.log`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.DataStream.createPageGroupTagLogicalElement(org.apache.fop.afp.modca.TagLogicalElementBean[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.DataStream.createPageTagLogicalElement(org.apache.fop.afp.modca.TagLogicalElementBean[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.DataStream.createTagLogicalElement(java.lang.String,java.lang.String)`

## org.apache.fop.afp.Factory

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.Factory.createPageGroup(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.Factory.createTagLogicalElement(java.lang.String,java.lang.String,int)`

## org.apache.fop.afp.fonts.AFPBase12FontCollection

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.fonts.AFPBase12FontCollection.<init>()`

## org.apache.fop.afp.fonts.AFPFont

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.fonts.AFPFont.<init>(java.lang.String)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.afp.fonts.AFPFont.name`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.AFPFont.setEmbeddable(boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.fonts.AFPFont.getFamilyNames()`
+ NEW RETURN TYPE: `org.apache.fop.afp.fonts.AFPFont.getFamilyNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.fonts.AFPFont.getKerningInfo()`
+ NEW RETURN TYPE: `org.apache.fop.afp.fonts.AFPFont.getKerningInfo()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.afp.fonts.AFPFont`
+ MUST NOW IMPLEMENT: `org.apache.fop.afp.fonts.AFPFont.getBoundingBox(int,int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.afp.fonts.AFPFont`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getUnderlinePosition(int)`

## org.apache.fop.afp.fonts.AFPFontCollection

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.fonts.AFPFontCollection.<init>(org.apache.fop.events.EventBroadcaster,java.util.List)`

## org.apache.fop.afp.fonts.AFPFontInfo

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.fonts.AFPFontInfo.<init>(org.apache.fop.afp.fonts.AFPFont,java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.fonts.AFPFontInfo.getFontTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.fonts.AFPFontInfo.getFontTriplets()`

## org.apache.fop.afp.fonts.AbstractOutlineFont

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.fonts.AbstractOutlineFont.<init>(java.lang.String,org.apache.fop.afp.fonts.CharacterSet)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.afp.fonts.AFPFont.name`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.apache.fop.afp.fonts.AbstractOutlineFont.getWidth(int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.AFPFont.setEmbeddable(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.AbstractOutlineFont.getFirstChar()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.AbstractOutlineFont.getLastChar()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.AbstractOutlineFont.getWidths(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.fonts.AFPFont.getFamilyNames()`
+ NEW RETURN TYPE: `org.apache.fop.afp.fonts.AFPFont.getFamilyNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.fonts.AFPFont.getKerningInfo()`
+ NEW RETURN TYPE: `org.apache.fop.afp.fonts.AFPFont.getKerningInfo()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.afp.fonts.AbstractOutlineFont`
+ MUST NOW IMPLEMENT: `org.apache.fop.afp.fonts.AFPFont.getBoundingBox(int,int)`

## org.apache.fop.afp.fonts.CharacterSet

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.afp.fonts.CharacterSet`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.afp.fonts.CharacterSet`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.fonts.CharacterSet.<init>(java.lang.String,java.lang.String,java.lang.String,java.lang.String)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.fonts.CharacterSet.LOG`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.fonts.CharacterSet.codePage`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.fonts.CharacterSet.encoding`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.fonts.CharacterSet.name`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.afp.fonts.CharacterSet.addCharacterSetOrientation(org.apache.fop.afp.fonts.CharacterSetOrientation)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.afp.fonts.CharacterSet.encodeChars(java.lang.CharSequence)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.afp.fonts.CharacterSet.getAscender()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.afp.fonts.CharacterSet.getCapHeight()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.afp.fonts.CharacterSet.getCodePage()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.afp.fonts.CharacterSet.getDescender()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.afp.fonts.CharacterSet.getEmSpaceIncrement()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.afp.fonts.CharacterSet.getEncoding()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.afp.fonts.CharacterSet.getName()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.afp.fonts.CharacterSet.getNameBytes()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.afp.fonts.CharacterSet.getNominalVerticalSize()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.afp.fonts.CharacterSet.getResourceAccessor()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.afp.fonts.CharacterSet.getSpaceIncrement()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.afp.fonts.CharacterSet.getXHeight()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.afp.fonts.CharacterSet.hasChar(char)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.afp.fonts.CharacterSet.mapChar(char)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.afp.fonts.CharacterSet.setNominalVerticalSize(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.CharacterSet.getFirstChar()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.CharacterSet.getLastChar()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.CharacterSet.getWidth(char)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.CharacterSet.getWidths()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.fonts.CharacterSet.encodeChars(java.lang.CharSequence)`
+ NEW RETURN TYPE: `org.apache.fop.afp.fonts.CharacterSet.encodeChars(java.lang.CharSequence)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.fonts.CharacterSet.getResourceAccessor()`
+ NEW RETURN TYPE: `org.apache.fop.afp.fonts.CharacterSet.getResourceAccessor()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.afp.fonts.CharacterSet.encodeChars(java.lang.CharSequence)`
+ NEW RETURN TYPE: `org.apache.fop.afp.fonts.CharacterSet.encodeChars(java.lang.CharSequence)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.afp.fonts.CharacterSet.getResourceAccessor()`
+ NEW RETURN TYPE: `org.apache.fop.afp.fonts.CharacterSet.getResourceAccessor()`

## org.apache.fop.afp.fonts.CharacterSetBuilder

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.CharacterSetBuilder.build(java.lang.String,java.lang.String,java.lang.String,org.apache.fop.afp.util.ResourceAccessor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.CharacterSetBuilder.build(java.lang.String,java.lang.String,java.lang.String,org.apache.fop.fonts.Typeface)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.CharacterSetBuilder.getInstance()`

## org.apache.fop.afp.fonts.CharacterSetOrientation

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.fonts.CharacterSetOrientation.<init>(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.CharacterSetOrientation.getFirstChar()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.CharacterSetOrientation.getLastChar()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.CharacterSetOrientation.getWidth(char)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.CharacterSetOrientation.getWidths()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.CharacterSetOrientation.setEmSpaceIncrement(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.CharacterSetOrientation.setFirstChar(char)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.CharacterSetOrientation.setLastChar(char)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.CharacterSetOrientation.setSpaceIncrement(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.CharacterSetOrientation.setWidth(char,int)`

## org.apache.fop.afp.fonts.DoubleByteFont

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.fonts.DoubleByteFont.<init>(java.lang.String,org.apache.fop.afp.fonts.CharacterSet)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.afp.fonts.AFPFont.name`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.AFPFont.setEmbeddable(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.AbstractOutlineFont.getFirstChar()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.AbstractOutlineFont.getLastChar()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.AbstractOutlineFont.getWidths(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.fonts.AFPFont.getFamilyNames()`
+ NEW RETURN TYPE: `org.apache.fop.afp.fonts.AFPFont.getFamilyNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.fonts.AFPFont.getKerningInfo()`
+ NEW RETURN TYPE: `org.apache.fop.afp.fonts.AFPFont.getKerningInfo()`

## org.apache.fop.afp.fonts.FopCharacterSet

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.fonts.FopCharacterSet.<init>(java.lang.String,java.lang.String,java.lang.String,org.apache.fop.fonts.Typeface)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.afp.fonts.CharacterSet.codePage`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.afp.fonts.CharacterSet.encoding`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.afp.fonts.CharacterSet.name`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.FopCharacterSet.getFirstChar()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.FopCharacterSet.getLastChar()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.FopCharacterSet.getWidth(char)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.FopCharacterSet.getWidths()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.fonts.CharacterSet.encodeChars(java.lang.CharSequence)`
+ NEW RETURN TYPE: `org.apache.fop.afp.fonts.CharacterSet.encodeChars(java.lang.CharSequence)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.fonts.CharacterSet.getResourceAccessor()`
+ NEW RETURN TYPE: `org.apache.fop.afp.fonts.CharacterSet.getResourceAccessor()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.afp.fonts.CharacterSet.encodeChars(java.lang.CharSequence)`
+ NEW RETURN TYPE: `org.apache.fop.afp.fonts.CharacterSet.encodeChars(java.lang.CharSequence)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.afp.fonts.CharacterSet.getResourceAccessor()`
+ NEW RETURN TYPE: `org.apache.fop.afp.fonts.CharacterSet.getResourceAccessor()`

## org.apache.fop.afp.fonts.OutlineFont

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.fonts.OutlineFont.<init>(java.lang.String,org.apache.fop.afp.fonts.CharacterSet)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.afp.fonts.AFPFont.name`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.AFPFont.setEmbeddable(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.AbstractOutlineFont.getFirstChar()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.AbstractOutlineFont.getLastChar()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.AbstractOutlineFont.getWidths(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.fonts.AFPFont.getFamilyNames()`
+ NEW RETURN TYPE: `org.apache.fop.afp.fonts.AFPFont.getFamilyNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.fonts.AFPFont.getKerningInfo()`
+ NEW RETURN TYPE: `org.apache.fop.afp.fonts.AFPFont.getKerningInfo()`

## org.apache.fop.afp.fonts.RasterFont

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.fonts.RasterFont.<init>(java.lang.String)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.afp.fonts.AFPFont.name`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.fonts.RasterFont.log`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.AFPFont.setEmbeddable(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.RasterFont.getFirstChar()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.RasterFont.getLastChar()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.fonts.RasterFont.getWidths(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.fonts.AFPFont.getFamilyNames()`
+ NEW RETURN TYPE: `org.apache.fop.afp.fonts.AFPFont.getFamilyNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.fonts.AFPFont.getKerningInfo()`
+ NEW RETURN TYPE: `org.apache.fop.afp.fonts.AFPFont.getKerningInfo()`

## org.apache.fop.afp.goca.AbstractGraphicsCoord

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.goca.AbstractGraphicsDrawingOrder

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.goca.AbstractGraphicsDrawingOrderContainer

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.goca.GraphicsAreaBegin

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.goca.GraphicsAreaEnd

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.goca.GraphicsChainedSegment

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.goca.GraphicsChainedSegment.<init>(java.lang.String,byte[])`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

## org.apache.fop.afp.goca.GraphicsCharacterString

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.goca.GraphicsCharacterString.<init>(java.lang.String)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.goca.GraphicsCharacterString.<init>(java.lang.String,int,int)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.goca.GraphicsCharacterString.str`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.goca.GraphicsData

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

## org.apache.fop.afp.goca.GraphicsFullArc

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.goca.GraphicsImage

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.goca.GraphicsLine

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.goca.GraphicsSetArcParameters

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.goca.GraphicsSetCharacterSet

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.goca.GraphicsSetCurrentPosition

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.goca.GraphicsSetLineType

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.goca.GraphicsSetLineWidth

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.goca.GraphicsSetMix

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.goca.GraphicsSetPatternSymbol

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.goca.GraphicsSetProcessColor

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.ioca.ImageCellPosition

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.ioca.ImageContent

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.ioca.ImageInputDescriptor

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.ioca.ImageOutputControl

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.ioca.ImageRasterData

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.ioca.ImageRasterPattern

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.afp.ioca.ImageRasterPattern`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.afp.ioca.ImageRasterPattern`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.ioca.ImageRasterPattern.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.afp.ioca.ImageRasterPattern.getRasterData(int)`

## org.apache.fop.afp.ioca.ImageSegment

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.ioca.ImageSizeParameter

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.modca.AbstractAFPObject

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.modca.AbstractDataObject

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.AbstractDescriptor

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.AbstractEnvironmentGroup

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.AbstractNamedAFPObject

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.AbstractPageObject

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractPageObject.tagLogicalElements`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractPageObject.createTagLogicalElement(java.lang.String,java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.AbstractResourceEnvironmentGroupContainer

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractPageObject.tagLogicalElements`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractResourceGroupContainer.writeObjects(java.util.Collection,java.io.OutputStream,boolean)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractPageObject.createTagLogicalElement(java.lang.String,java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.AbstractResourceGroupContainer

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractPageObject.tagLogicalElements`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractResourceGroupContainer.writeObjects(java.util.Collection,java.io.OutputStream,boolean)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractPageObject.createTagLogicalElement(java.lang.String,java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.AbstractStructuredObject

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.modca.AbstractTripletStructuredObject

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.afp.modca.AbstractTripletStructuredObject`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.ActiveEnvironmentGroup

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

## org.apache.fop.afp.modca.ContainerDataDescriptor

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.Document

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractPageObject.createTagLogicalElement(java.lang.String,java.lang.String,int)`

## org.apache.fop.afp.modca.GraphicsDataDescriptor

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.GraphicsObject

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.GraphicsObject.addString(java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.IMImageObject

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.ImageDataDescriptor

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.ImageObject

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.IncludeObject

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.IncludePageOverlay

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.IncludePageSegment

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.IncludedResourceObject

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.modca.IncludedResourceObject.<init>(java.lang.String,org.apache.fop.afp.util.ResourceAccessor,java.net.URI)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.InvokeMediumMap

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.MapCodedFont

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.modca.MapContainerData

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.MapDataResource

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.MapImageObject

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.MapPageOverlay

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.modca.MapPageSegment

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.modca.NoOperation

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.modca.ObjectAreaDescriptor

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.ObjectAreaPosition

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.modca.ObjectContainer

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.ObjectEnvironmentGroup

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

## org.apache.fop.afp.modca.Overlay

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractPageObject.tagLogicalElements`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractResourceGroupContainer.writeObjects(java.util.Collection,java.io.OutputStream,boolean)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractPageObject.createTagLogicalElement(java.lang.String,java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.PageDescriptor

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.PageGroup

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.modca.PageGroup.<init>(org.apache.fop.afp.Factory,java.lang.String,int)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractPageObject.tagLogicalElements`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractResourceGroupContainer.writeObjects(java.util.Collection,java.io.OutputStream,boolean)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractPageObject.createTagLogicalElement(java.lang.String,java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.PageGroup.createTagLogicalElement(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.PageGroup.getTleSequence()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.PageObject

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractPageObject.tagLogicalElements`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractResourceGroupContainer.writeObjects(java.util.Collection,java.io.OutputStream,boolean)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractPageObject.createTagLogicalElement(java.lang.String,java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.PageSegment

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.PageSegment.getObjects()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.PageSegment.getObjects()`

## org.apache.fop.afp.modca.PreprocessPresentationObject

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.PresentationEnvironmentControl

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.PresentationTextData

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.modca.PresentationTextDescriptor

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.PresentationTextObject

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.PresentationTextObject.createControlSequences(org.apache.fop.afp.ptoca.PtocaProducer)`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.PresentationTextObject.createControlSequences(org.apache.fop.afp.ptoca.PtocaProducer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.PresentationTextObject.createLineData(org.apache.fop.afp.AFPLineDataInfo)`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.PresentationTextObject.createLineData(org.apache.fop.afp.AFPLineDataInfo)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.afp.modca.PresentationTextObject.createControlSequences(org.apache.fop.afp.ptoca.PtocaProducer)`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.PresentationTextObject.createControlSequences(org.apache.fop.afp.ptoca.PtocaProducer)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.afp.modca.PresentationTextObject.createLineData(org.apache.fop.afp.AFPLineDataInfo)`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.PresentationTextObject.createLineData(org.apache.fop.afp.AFPLineDataInfo)`

## org.apache.fop.afp.modca.ResourceEnvironmentGroup

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.ResourceGroup

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.ResourceGroup.resourceExists(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.ResourceObject

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.StreamedResourceGroup

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.ResourceGroup.resourceExists(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.TagLogicalElement

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.modca.TagLogicalElement.<init>(java.lang.String,java.lang.String,int)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplets(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.addTriplet(org.apache.fop.afp.modca.triplets.Triplet)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.TagLogicalElement.setAttributeValue(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.afp.modca.AbstractTripletStructuredObject.getTriplets()`

## org.apache.fop.afp.modca.TagLogicalElementBean

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.afp.modca.TagLogicalElementBean`

## org.apache.fop.afp.modca.triplets.AbstractTriplet

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.modca.triplets.AttributeQualifierTriplet

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.modca.triplets.AttributeValueTriplet

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.modca.triplets.CommentTriplet

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.modca.triplets.DescriptorPositionTriplet

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.modca.triplets.ExtendedResourceLocalIdentifierTriplet

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.modca.triplets.FullyQualifiedNameTriplet

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.modca.triplets.FullyQualifiedNameTriplet.<init>(byte,byte,java.lang.String)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.modca.triplets.MappingOptionTriplet

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.modca.triplets.MeasurementUnitsTriplet

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.modca.triplets.ObjectAreaSizeTriplet

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.modca.triplets.ObjectByteExtentTriplet

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.modca.triplets.ObjectClassificationTriplet

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.modca.triplets.PresentationSpaceMixingRulesTriplet

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.modca.triplets.PresentationSpaceResetMixingTriplet

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.modca.triplets.ResourceObjectTypeTriplet

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.SF_HEADER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.afp.modca.AbstractAFPObject.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.afp.modca.AbstractAFPObject.truncate(java.lang.String,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.afp.modca.AbstractAFPObject.writeObjects(java.util.Collection,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.modca.AbstractAFPObject.copyChunks(byte[],int,int,java.io.InputStream,java.io.OutputStream)`

## org.apache.fop.afp.ptoca.PtocaBuilder

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.ptoca.PtocaBuilder.addTransparentData(byte[])`

## org.apache.fop.afp.svg.AFPBridgeContext

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.svg.AFPBridgeContext.<init>(org.apache.batik.bridge.UserAgent,org.apache.batik.bridge.DocumentLoader,org.apache.fop.fonts.FontInfo,org.apache.xmlgraphics.image.loader.ImageManager,org.apache.xmlgraphics.image.loader.ImageSessionContext,java.awt.geom.AffineTransform,org.apache.fop.afp.AFPGraphics2D)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.svg.AFPBridgeContext.<init>(org.apache.batik.bridge.UserAgent,org.apache.fop.fonts.FontInfo,org.apache.xmlgraphics.image.loader.ImageManager,org.apache.xmlgraphics.image.loader.ImageSessionContext,java.awt.geom.AffineTransform,org.apache.fop.afp.AFPGraphics2D)`

## org.apache.fop.afp.svg.AFPGraphicsConfiguration

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.afp.svg.AFPGraphicsConfiguration`

## org.apache.fop.afp.svg.AFPGraphicsDevice

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.afp.svg.AFPGraphicsDevice`

## org.apache.fop.afp.svg.AFPTextElementBridge

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.svg.AFPTextElementBridge.<init>(org.apache.batik.gvt.TextPainter)`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.fop.svg.AbstractFOPTextElementBridge.textPainter`
+ NEW FIELD: `org.apache.fop.svg.AbstractFOPTextElementBridge.textPainter`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.fop.svg.AbstractFOPTextElementBridge.textPainter`
+ NEW FIELD: `org.apache.fop.svg.AbstractFOPTextElementBridge.textPainter`

## org.apache.fop.afp.svg.AFPTextHandler

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.svg.AFPTextHandler.<init>(org.apache.fop.fonts.FontInfo)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.apache.fop.afp.svg.AFPTextHandler.drawString(java.awt.Graphics2D,java.lang.String,float,float)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.afp.svg.AFPTextHandler.drawString(java.lang.String,float,float)`

## org.apache.fop.afp.svg.AFPTextPainter

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.svg.AFPTextPainter.<init>(org.apache.fop.svg.FOPTextHandler)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.svg.AbstractFOPTextPainter.PROXY_PAINTER`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.getBounds2D(org.apache.batik.gvt.TextNode)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.getGeometryBounds(org.apache.batik.gvt.TextNode)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.getHighlightShape(org.apache.batik.gvt.text.Mark,org.apache.batik.gvt.text.Mark)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.getMark(org.apache.batik.gvt.TextNode,int,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.getOutline(org.apache.batik.gvt.TextNode)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.getSelected(org.apache.batik.gvt.text.Mark,org.apache.batik.gvt.text.Mark)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.paint(org.apache.batik.gvt.TextNode,java.awt.Graphics2D)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.paintTextRun(org.apache.batik.gvt.renderer.StrokingTextPainter$TextRun,java.awt.Graphics2D,java.awt.geom.Point2D)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.paintTextRuns(java.util.List,java.awt.Graphics2D,java.awt.geom.Point2D)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.selectAt(double,double,org.apache.batik.gvt.TextNode)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.selectFirst(org.apache.batik.gvt.TextNode)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.selectLast(org.apache.batik.gvt.TextNode)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.selectTo(double,double,org.apache.batik.gvt.text.Mark)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.afp.svg.AFPTextPainter`

## org.apache.fop.afp.util.BinaryUtils

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.afp.util.BinaryUtils`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.util.BinaryUtils.<init>()`

## org.apache.fop.afp.util.CubicBezierApproximator

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.afp.util.CubicBezierApproximator`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.afp.util.CubicBezierApproximator`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.util.CubicBezierApproximator.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.afp.util.CubicBezierApproximator.fixedMidPointApproximation(double[])`

## org.apache.fop.afp.util.DefaultFOPResourceAccessor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.afp.util.DefaultFOPResourceAccessor`

## org.apache.fop.afp.util.ResourceAccessor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.afp.util.ResourceAccessor`

## org.apache.fop.afp.util.SimpleResourceAccessor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.afp.util.SimpleResourceAccessor`

## org.apache.fop.afp.util.StringUtils

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.afp.util.StringUtils`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.afp.util.StringUtils`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.afp.util.StringUtils.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.afp.util.StringUtils.lpad(java.lang.String,char,int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.afp.util.StringUtils.rpad(java.lang.String,char,int)`

## org.apache.fop.apps.FOURIResolver

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.apps.FOURIResolver`

## org.apache.fop.apps.FOUserAgent

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.apps.FOUserAgent`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.apps.FOUserAgent`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.apps.FOUserAgent.<init>(org.apache.fop.apps.FopFactory)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.apps.FOUserAgent.DEFAULT_TARGET_RESOLUTION`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.apps.FOUserAgent.author`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.apps.FOUserAgent.creationDate`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.apps.FOUserAgent.creator`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.apps.FOUserAgent.keywords`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.apps.FOUserAgent.producer`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.apps.FOUserAgent.subject`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.apps.FOUserAgent.title`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.getAuthor()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.getCreationDate()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.getCreator()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.getDocumentHandlerOverride()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.getEventBroadcaster()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.getFOEventHandlerOverride()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.getImageSessionContext()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.getKeywords()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.getOutputFile()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.getPageHeight()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.getPageWidth()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.getProducer()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.getRendererFactory()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.getRendererOptions()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.getRendererOverride()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.getSourcePixelUnitToMillimeter()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.getSourceResolution()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.getSubject()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.getTargetPixelUnitToMillimeter()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.getTargetResolution()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.getTitle()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.getXMLHandlerRegistry()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.isAccessibilityEnabled()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.isBreakIndentInheritanceOnReferenceAreaBoundary()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.isConserveMemoryPolicyEnabled()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.isLocatorEnabled()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.resolveURI(java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.setAccessibility(boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.setAuthor(java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.setConserveMemoryPolicy(boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.setCreationDate(java.util.Date)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.setCreator(java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.setDocumentHandlerOverride(org.apache.fop.render.intermediate.IFDocumentHandler)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.setFOEventHandlerOverride(org.apache.fop.fo.FOEventHandler)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.setKeywords(java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.setLocatorEnabled(boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.setOutputFile(java.io.File)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.setProducer(java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.setRendererOverride(org.apache.fop.render.Renderer)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.setSubject(java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.setTargetResolution(float)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.setTargetResolution(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.setTitle(java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FOUserAgent.validateStrictly()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FOUserAgent.getBaseURL()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FOUserAgent.getFactory()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FOUserAgent.getFontBaseURL()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FOUserAgent.getStructureTree()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FOUserAgent.getURIResolver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FOUserAgent.resolveURI(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FOUserAgent.setBaseURL(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FOUserAgent.setFontBaseURL(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FOUserAgent.setStructureTree(org.apache.fop.accessibility.StructureTree)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FOUserAgent.setURIResolver(javax.xml.transform.URIResolver)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.apps.FOUserAgent.resolveURI(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.apps.FOUserAgent.resolveURI(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.apps.FOUserAgent.resolveURI(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.apps.FOUserAgent.resolveURI(java.lang.String)`

## org.apache.fop.apps.FopFactory

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.apps.FopFactory`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.apps.FopFactory`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.apps.FopFactory.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.addElementMapping(org.apache.fop.fo.ElementMapping)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.getContentHandlerFactoryRegistry()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.getElementMappingRegistry()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.getFontManager()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.getIgnoredNamespace()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.getImageHandlerRegistry()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.getImageManager()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.getLayoutManagerMakerOverride()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.getPageHeight()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.getPageWidth()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.getRendererFactory()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.getSourcePixelUnitToMillimeter()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.getSourceResolution()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.getTargetPixelUnitToMillimeter()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.getTargetResolution()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.getUserConfig()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.getXMLHandlerRegistry()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.isBreakIndentInheritanceOnReferenceAreaBoundary()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.isNamespaceIgnored(java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.newFOUserAgent()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.newFop(java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.newFop(java.lang.String,java.io.OutputStream)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.newFop(java.lang.String,org.apache.fop.apps.FOUserAgent)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.newFop(java.lang.String,org.apache.fop.apps.FOUserAgent,java.io.OutputStream)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.newFop(org.apache.fop.apps.FOUserAgent)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.validateStrictly()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.apps.FopFactory.validateUserConfigStrictly()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.getBaseURL()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.getColorSpace(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.getFOURIResolver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.getFontBaseURL()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.getFontCache()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.getHyphenBaseURL()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.getHyphenationTreeResolver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.getURIResolver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.ignoreNamespace(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.ignoreNamespaces(java.util.Collection)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.isBase14KerningEnabled()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.newInstance()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.resolveURI(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.setBase14KerningEnabled(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.setBaseURL(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.setBreakIndentInheritanceOnReferenceAreaBoundary(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.setFontBaseURL(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.setHyphenBaseURL(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.setHyphenationTreeResolver(org.apache.fop.hyphenation.HyphenationTreeResolver)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.setLayoutManagerMakerOverride(org.apache.fop.layoutmgr.LayoutManagerMaker)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.setPageHeight(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.setPageWidth(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.setSourceResolution(float)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.setSourceResolution(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.setStrictUserConfigValidation(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.setStrictValidation(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.setTargetResolution(float)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.setURIResolver(javax.xml.transform.URIResolver)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.setUseCache(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.setUserConfig(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.setUserConfig(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.setUserConfig(org.apache.avalon.framework.configuration.Configuration)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.apps.FopFactory.useCache()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.apps.FopFactory.getIgnoredNamespace()`
+ NEW RETURN TYPE: `org.apache.fop.apps.FopFactory.getIgnoredNamespace()`

## org.apache.fop.apps.FopFactoryConfigurator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.apps.FopFactoryConfigurator`

## org.apache.fop.area.Area

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

## org.apache.fop.area.AreaEventProducer$Provider

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.area.AreaEventProducer$Provider`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.area.AreaEventProducer$Provider`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.area.AreaEventProducer$Provider.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.area.AreaEventProducer$Provider.get(org.apache.fop.events.EventBroadcaster)`

## org.apache.fop.area.AreaTreeHandler

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FOEventHandler.characters(char[],int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FOEventHandler.endLink()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FOEventHandler.endListBody()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FOEventHandler.endListLabel()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FOEventHandler.endStatic()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FOEventHandler.foreignObject(org.apache.fop.fo.flow.InstreamForeignObject)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FOEventHandler.leader(org.apache.fop.fo.flow.Leader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FOEventHandler.startListBody()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FOEventHandler.startListLabel()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FOEventHandler.startStatic()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeHandler.getPageViewportsContainingID(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeHandler.getPageViewportsContainingID(java.lang.String)`

## org.apache.fop.area.AreaTreeModel

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.AreaTreeModel.log`

## org.apache.fop.area.AreaTreeObject

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

## org.apache.fop.area.AreaTreeParser

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.AreaTreeParser.log`

## org.apache.fop.area.BeforeFloat

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

## org.apache.fop.area.Block

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

## org.apache.fop.area.BlockParent

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

## org.apache.fop.area.BlockViewport

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.BlockViewport.getClip()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

## org.apache.fop.area.BodyRegion

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.area.BodyRegion.clone()`
+ NOW THROWS: `org.apache.fop.area.BodyRegion.clone()`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.RegionReference.getBlocks()`
+ NEW RETURN TYPE: `org.apache.fop.area.RegionReference.getBlocks()`

## org.apache.fop.area.BookmarkData

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.BookmarkData.resolveIDRef(java.lang.String,java.util.List)`

## org.apache.fop.area.CTM

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.CTM.getCTMandRelDims(int,int,java.awt.geom.Rectangle2D,org.apache.fop.datatypes.FODimension)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.CTM.getWMctm(int,int,int)`

## org.apache.fop.area.CachedRenderPagesModel

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.AreaTreeModel.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.CachedRenderPagesModel.baseDir`

## org.apache.fop.area.DestinationData

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.DestinationData.resolveIDRef(java.lang.String,java.util.List)`

## org.apache.fop.area.Footnote

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

## org.apache.fop.area.IDTracker

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.IDTracker.getPageViewportsContainingID(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.area.IDTracker.getPageViewportsContainingID(java.lang.String)`

## org.apache.fop.area.LineArea

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.LineArea.finalise()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

## org.apache.fop.area.LinkResolver

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.LinkResolver.resolveIDRef(java.lang.String,java.util.List)`

## org.apache.fop.area.MainReference

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.MainReference.setSpans(java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.MainReference.getSpans()`
+ NEW RETURN TYPE: `org.apache.fop.area.MainReference.getSpans()`

## org.apache.fop.area.NormalFlow

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

## org.apache.fop.area.Page

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.area.Page.clone()`
+ NOW THROWS: `org.apache.fop.area.Page.clone()`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.Page.setUnresolvedReferences(java.util.Map)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Page.getUnresolvedReferences()`
+ NEW RETURN TYPE: `org.apache.fop.area.Page.getUnresolvedReferences()`

## org.apache.fop.area.PageSequence

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.PageSequence.getCountry()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.PageSequence.getLanguage()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.PageSequence.setCountry(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.PageSequence.setLanguage(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

## org.apache.fop.area.PageViewport

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.PageViewport.log`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.area.PageViewport.<init>(org.apache.fop.area.PageViewport)`
+ NOW THROWS: `org.apache.fop.area.PageViewport.<init>(org.apache.fop.area.PageViewport)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.area.PageViewport.clone()`
+ NOW THROWS: `org.apache.fop.area.PageViewport.clone()`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.PageViewport.resolveIDRef(java.lang.String,java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.PageViewport.addMarkers(java.util.Map,boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.PageViewport.getMarker(java.lang.String,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

## org.apache.fop.area.RegionReference

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.area.RegionReference.clone()`
+ NOW THROWS: `org.apache.fop.area.RegionReference.clone()`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.RegionReference.getBlocks()`
+ NEW RETURN TYPE: `org.apache.fop.area.RegionReference.getBlocks()`

## org.apache.fop.area.RegionViewport

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.area.RegionViewport.clone()`
+ NOW THROWS: `org.apache.fop.area.RegionViewport.clone()`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.RegionViewport.isClip()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

## org.apache.fop.area.RenderPagesModel

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.AreaTreeModel.log`

## org.apache.fop.area.Resolvable

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.Resolvable.resolveIDRef(java.lang.String,java.util.List)`

## org.apache.fop.area.Span

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

## org.apache.fop.area.Trait

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.area.Trait`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.area.Trait`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.area.Trait.<init>()`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Trait.PTR`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.area.Trait.getTraitClass(java.lang.Object)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.area.Trait.getTraitName(java.lang.Object)`

## org.apache.fop.area.inline.AbstractTextArea

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.inline.InlineArea.offset`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.InlineArea.getOffset()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.InlineArea.setOffset(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.inline.InlineParent.getChildAreas()`
+ NEW RETURN TYPE: `org.apache.fop.area.inline.InlineParent.getChildAreas()`

## org.apache.fop.area.inline.Anchor

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.inline.InlineArea.offset`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.InlineArea.getOffset()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.InlineArea.setOffset(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

## org.apache.fop.area.inline.Container

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.Container.addBlock(org.apache.fop.area.Block)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.inline.Container.getBlocks()`
+ NEW RETURN TYPE: `org.apache.fop.area.inline.Container.getBlocks()`

## org.apache.fop.area.inline.FilledArea

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.inline.InlineArea.offset`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.InlineArea.getOffset()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.InlineArea.setOffset(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.inline.FilledArea.getChildAreas()`
+ NEW RETURN TYPE: `org.apache.fop.area.inline.FilledArea.getChildAreas()`

## org.apache.fop.area.inline.ForeignObject

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

## org.apache.fop.area.inline.Image

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

## org.apache.fop.area.inline.InlineArea

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.inline.InlineArea.offset`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.InlineArea.getOffset()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.InlineArea.setOffset(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

## org.apache.fop.area.inline.InlineBlockParent

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.inline.InlineArea.offset`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.InlineArea.getOffset()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.InlineArea.setOffset(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

## org.apache.fop.area.inline.InlineParent

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.inline.InlineArea.offset`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.InlineArea.getOffset()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.InlineArea.setOffset(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.inline.InlineParent.getChildAreas()`
+ NEW RETURN TYPE: `org.apache.fop.area.inline.InlineParent.getChildAreas()`

## org.apache.fop.area.inline.Leader

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.inline.InlineArea.offset`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.InlineArea.getOffset()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.InlineArea.setOffset(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

## org.apache.fop.area.inline.Space

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.inline.InlineArea.offset`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.InlineArea.getOffset()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.InlineArea.setOffset(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

## org.apache.fop.area.inline.SpaceArea

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.area.inline.SpaceArea.<init>(char,int,boolean)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.inline.InlineArea.offset`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.fop.area.inline.SpaceArea.space`
+ NEW FIELD: `org.apache.fop.area.inline.SpaceArea.space`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.fop.area.inline.SpaceArea.space`
+ NEW FIELD: `org.apache.fop.area.inline.SpaceArea.space`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.InlineArea.getOffset()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.InlineArea.setOffset(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

## org.apache.fop.area.inline.TextArea

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.inline.InlineArea.offset`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.InlineArea.getOffset()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.InlineArea.setOffset(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.TextArea.addSpace(char,int,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.TextArea.addWord(java.lang.String,int,int[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.inline.InlineParent.getChildAreas()`
+ NEW RETURN TYPE: `org.apache.fop.area.inline.InlineParent.getChildAreas()`

## org.apache.fop.area.inline.UnresolvedPageNumber

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.inline.InlineArea.offset`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.inline.UnresolvedPageNumber.resolveIDRef(java.lang.String,java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.InlineArea.getOffset()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.InlineArea.setOffset(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.TextArea.addSpace(char,int,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.TextArea.addWord(java.lang.String,int,int[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.inline.InlineParent.getChildAreas()`
+ NEW RETURN TYPE: `org.apache.fop.area.inline.InlineParent.getChildAreas()`

## org.apache.fop.area.inline.Viewport

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.area.inline.Viewport`

## org.apache.fop.area.inline.WordArea

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.area.inline.WordArea.<init>(java.lang.String,int,int[])`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.area.Area.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.BT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.LR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.RL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.Area.props`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.area.inline.WordArea.offset`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setExtensionAttachments(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.area.AreaTreeObject.setForeignAttributes(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.addTrait(java.lang.Object,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsBoolean(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.getTraitAsInteger(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.Area.hasTrait(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.WordArea.getOffset()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.area.inline.WordArea.setOffset(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.Area.getTraits()`
+ NEW RETURN TYPE: `org.apache.fop.area.Area.getTraits()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`
+ NEW RETURN TYPE: `org.apache.fop.area.AreaTreeObject.getForeignAttributes()`

## org.apache.fop.cli.Main

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.cli.Main`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.cli.Main`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.cli.Main.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.cli.Main.checkDependencies()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.cli.Main.getJARList()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.cli.Main.main(java.lang.String[])`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.cli.Main.startFOP(java.lang.String[])`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.cli.Main.startFOPWithDynamicClasspath(java.lang.String[])`

## org.apache.fop.datatypes.CompoundDatatype

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

## org.apache.fop.datatypes.Length

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.apache.fop.datatypes.Numeric.getNumericValue()`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.apache.fop.datatypes.Numeric.getNumericValue(org.apache.fop.datatypes.PercentBaseContext)`

## org.apache.fop.datatypes.LengthBase

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.datatypes.LengthBase.log`

## org.apache.fop.datatypes.Numeric

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.apache.fop.datatypes.Numeric.getNumericValue()`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.apache.fop.datatypes.Numeric.getNumericValue(org.apache.fop.datatypes.PercentBaseContext)`

## org.apache.fop.datatypes.URISpecification

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.datatypes.URISpecification`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.datatypes.URISpecification`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.datatypes.URISpecification.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.datatypes.URISpecification.escapeURI(java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.datatypes.URISpecification.getURL(java.lang.String)`

## org.apache.fop.events.Event

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.events.Event.<init>(java.lang.Object,java.lang.String,org.apache.fop.events.model.EventSeverity,java.util.Map)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.events.Event.getParams()`
+ NEW RETURN TYPE: `org.apache.fop.events.Event.getParams()`

## org.apache.fop.events.Event$ParamsBuilder

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.events.Event$ParamsBuilder.build()`
+ NEW RETURN TYPE: `org.apache.fop.events.Event$ParamsBuilder.build()`

## org.apache.fop.events.EventBroadcaster

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.events.EventBroadcaster.getEventProducerFor(java.lang.Class)`

## org.apache.fop.events.EventExceptionManager

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.events.EventExceptionManager`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.events.EventExceptionManager`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.events.EventExceptionManager.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.events.EventExceptionManager.throwException(org.apache.fop.events.Event,java.lang.String)`

## org.apache.fop.events.EventExceptionManager$ExceptionFactory

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.events.EventExceptionManager$ExceptionFactory.getExceptionClass()`
+ NEW RETURN TYPE: `org.apache.fop.events.EventExceptionManager$ExceptionFactory.getExceptionClass()`

## org.apache.fop.events.PropertyExceptionFactory

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.events.PropertyExceptionFactory.getExceptionClass()`
+ NEW RETURN TYPE: `org.apache.fop.events.PropertyExceptionFactory.getExceptionClass()`

## org.apache.fop.events.UnsupportedOperationExceptionFactory

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.events.UnsupportedOperationExceptionFactory.getExceptionClass()`
+ NEW RETURN TYPE: `org.apache.fop.events.UnsupportedOperationExceptionFactory.getExceptionClass()`

## org.apache.fop.events.ValidationExceptionFactory

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.events.ValidationExceptionFactory.getExceptionClass()`
+ NEW RETURN TYPE: `org.apache.fop.events.ValidationExceptionFactory.getExceptionClass()`

## org.apache.fop.events.model.EventModelParser

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.events.model.EventModelParser`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.events.model.EventModelParser`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.events.model.EventModelParser.<init>()`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.events.model.EventModelParser.log`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.events.model.EventModelParser.getContentHandler(org.apache.fop.events.model.EventModel)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.events.model.EventModelParser.parse(javax.xml.transform.Source)`

## org.apache.fop.fo.Constants

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

## org.apache.fop.fo.ElementMapping

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.ElementMapping.getTable()`
+ NEW RETURN TYPE: `org.apache.fop.fo.ElementMapping.getTable()`

## org.apache.fop.fo.ElementMappingRegistry

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.ElementMappingRegistry.log`

## org.apache.fop.fo.FOElementMapping

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.ElementMapping.getTable()`
+ NEW RETURN TYPE: `org.apache.fop.fo.ElementMapping.getTable()`

## org.apache.fop.fo.FOEventHandler

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FOEventHandler.characters(char[],int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FOEventHandler.endLink()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FOEventHandler.endListBody()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FOEventHandler.endListLabel()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FOEventHandler.endStatic()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FOEventHandler.foreignObject(org.apache.fop.fo.flow.InstreamForeignObject)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FOEventHandler.leader(org.apache.fop.fo.flow.Leader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FOEventHandler.startListBody()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FOEventHandler.startListLabel()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FOEventHandler.startStatic()`

## org.apache.fop.fo.FONode

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

## org.apache.fop.fo.FONode$FONodeIterator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FONode$FONodeIterator.firstNode()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FONode$FONodeIterator.lastNode()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FONode$FONodeIterator.nextNode()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FONode$FONodeIterator.parentNode()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FONode$FONodeIterator.previousNode()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `java.util.ListIterator.next()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FONode$FONodeIterator.next()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `java.util.ListIterator.previous()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FONode$FONodeIterator.previous()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `java.util.ListIterator.next()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FONode$FONodeIterator.next()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `java.util.ListIterator.previous()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FONode$FONodeIterator.previous()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fo.FONode$FONodeIterator`
+ MUST NOW IMPLEMENT: `org.apache.fop.fo.FONode$FONodeIterator.parent()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fo.FONode$FONodeIterator`
+ MUST NOW IMPLEMENT: `org.apache.fop.fo.FONode$FONodeIterator.first()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fo.FONode$FONodeIterator`
+ MUST NOW IMPLEMENT: `org.apache.fop.fo.FONode$FONodeIterator.add(org.apache.fop.fo.FONode)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fo.FONode$FONodeIterator`
+ MUST NOW IMPLEMENT: `org.apache.fop.fo.FONode$FONodeIterator.last()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fo.FONode$FONodeIterator`
+ MUST NOW IMPLEMENT: `org.apache.fop.fo.FONode$FONodeIterator.set(org.apache.fop.fo.FONode)`

## org.apache.fop.fo.FOPropertyMapping

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.fo.FOPropertyMapping`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fo.FOPropertyMapping.<init>()`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

## org.apache.fop.fo.FOText

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FOText.getAncestorBlock()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FOText.getCharArray()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FOText.getNextFOTextThisBlock()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FOText.getPrevFOTextThisBlock()`

## org.apache.fop.fo.FOTreeBuilder

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.FOTreeBuilder.log`

## org.apache.fop.fo.FOValidationEventProducer

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fo.FOValidationEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.fo.FOValidationEventProducer.notSupportedChild(java.lang.Object,java.lang.String,org.apache.xmlgraphics.util.QName,org.xml.sax.Locator)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fo.FOValidationEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.fo.FOValidationEventProducer.warnOnInvalidPropertyValue(java.lang.Object,java.lang.String,java.lang.String,java.lang.String,org.apache.fop.fo.expr.PropertyException,org.xml.sax.Locator)`

## org.apache.fop.fo.FObj

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.FObj$FObjIterator

### CLASS_NOW_STATIC [binary ✗ | source ✗]
- CLASS (now static): `org.apache.fop.fo.FObj$FObjIterator`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.apache.fop.fo.FObj$FObjIterator.add(java.lang.Object)`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.apache.fop.fo.FObj$FObjIterator.set(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FObj$FObjIterator.firstNode()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FObj$FObjIterator.lastNode()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FObj$FObjIterator.nextNode()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FObj$FObjIterator.parentNode()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FObj$FObjIterator.previousNode()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.fo.FObj$FObjIterator.next()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj$FObjIterator.next()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.fo.FObj$FObjIterator.previous()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj$FObjIterator.previous()`

## org.apache.fop.fo.FObjMixed

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.InlineCharIterator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.fo.InlineCharIterator`

## org.apache.fop.fo.PropertyList

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.PropertyList.getAccessibilityProps()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.PropertyList.getWritingMode()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.PropertyList.getWritingMode(int,int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.PropertyList.setWritingMode()`

## org.apache.fop.fo.StaticPropertyList

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.PropertyList.getAccessibilityProps()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.PropertyList.getWritingMode()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.PropertyList.getWritingMode(int,int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.PropertyList.setWritingMode()`

## org.apache.fop.fo.UnknownXMLObj

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

## org.apache.fop.fo.XMLObj

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

## org.apache.fop.fo.expr.AbsFunction

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.expr.AbsFunction.nbArgs()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.expr.FunctionBase.padArgsWithPropertyName()`

## org.apache.fop.fo.expr.BodyStartFunction

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.expr.BodyStartFunction.nbArgs()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.expr.FunctionBase.padArgsWithPropertyName()`

## org.apache.fop.fo.expr.FromParentFunction

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.expr.FromParentFunction.nbArgs()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.expr.FromParentFunction.padArgsWithPropertyName()`

## org.apache.fop.fo.expr.FromTableColumnFunction

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.expr.FromTableColumnFunction.nbArgs()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.expr.FromTableColumnFunction.padArgsWithPropertyName()`

## org.apache.fop.fo.expr.Function

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.expr.Function.nbArgs()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.expr.Function.padArgsWithPropertyName()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fo.expr.Function`
+ MUST NOW IMPLEMENT: `org.apache.fop.fo.expr.Function.getOptionalArgDefault(int,org.apache.fop.fo.expr.PropertyInfo)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fo.expr.Function`
+ MUST NOW IMPLEMENT: `org.apache.fop.fo.expr.Function.getOptionalArgsCount()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fo.expr.Function`
+ MUST NOW IMPLEMENT: `org.apache.fop.fo.expr.Function.getRequiredArgsCount()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fo.expr.Function`
+ MUST NOW IMPLEMENT: `org.apache.fop.fo.expr.Function.hasVariableArgs()`

## org.apache.fop.fo.expr.FunctionBase

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.expr.Function.nbArgs()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.expr.FunctionBase.padArgsWithPropertyName()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fo.expr.FunctionBase`
+ MUST NOW IMPLEMENT: `org.apache.fop.fo.expr.Function.getRequiredArgsCount()`

## org.apache.fop.fo.expr.InheritedPropFunction

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.expr.InheritedPropFunction.nbArgs()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.expr.InheritedPropFunction.padArgsWithPropertyName()`

## org.apache.fop.fo.expr.LabelEndFunction

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.expr.FunctionBase.padArgsWithPropertyName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.expr.LabelEndFunction.nbArgs()`

## org.apache.fop.fo.expr.MaxFunction

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.expr.FunctionBase.padArgsWithPropertyName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.expr.MaxFunction.nbArgs()`

## org.apache.fop.fo.expr.MinFunction

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.expr.FunctionBase.padArgsWithPropertyName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.expr.MinFunction.nbArgs()`

## org.apache.fop.fo.expr.NCnameProperty

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.properties.Property.log`

## org.apache.fop.fo.expr.NearestSpecPropFunction

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.fo.expr.NearestSpecPropFunction`

## org.apache.fop.fo.expr.NumericOp

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.fo.expr.NumericOp`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.fo.expr.NumericOp`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fo.expr.NumericOp.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.fo.expr.NumericOp.abs(org.apache.fop.datatypes.Numeric)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.fo.expr.NumericOp.abs2(org.apache.fop.datatypes.Numeric,org.apache.fop.datatypes.PercentBaseContext)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.fo.expr.NumericOp.addition(org.apache.fop.datatypes.Numeric,org.apache.fop.datatypes.Numeric)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.fo.expr.NumericOp.addition2(org.apache.fop.datatypes.Numeric,org.apache.fop.datatypes.Numeric,org.apache.fop.datatypes.PercentBaseContext)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.fo.expr.NumericOp.divide(org.apache.fop.datatypes.Numeric,org.apache.fop.datatypes.Numeric)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.fo.expr.NumericOp.divide2(org.apache.fop.datatypes.Numeric,org.apache.fop.datatypes.Numeric,org.apache.fop.datatypes.PercentBaseContext)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.fo.expr.NumericOp.max(org.apache.fop.datatypes.Numeric,org.apache.fop.datatypes.Numeric)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.fo.expr.NumericOp.max2(org.apache.fop.datatypes.Numeric,org.apache.fop.datatypes.Numeric,org.apache.fop.datatypes.PercentBaseContext)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.fo.expr.NumericOp.min(org.apache.fop.datatypes.Numeric,org.apache.fop.datatypes.Numeric)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.fo.expr.NumericOp.min2(org.apache.fop.datatypes.Numeric,org.apache.fop.datatypes.Numeric,org.apache.fop.datatypes.PercentBaseContext)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.fo.expr.NumericOp.modulo(org.apache.fop.datatypes.Numeric,org.apache.fop.datatypes.Numeric)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.fo.expr.NumericOp.modulo2(org.apache.fop.datatypes.Numeric,org.apache.fop.datatypes.Numeric,org.apache.fop.datatypes.PercentBaseContext)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.fo.expr.NumericOp.multiply(org.apache.fop.datatypes.Numeric,org.apache.fop.datatypes.Numeric)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.fo.expr.NumericOp.multiply2(org.apache.fop.datatypes.Numeric,org.apache.fop.datatypes.Numeric,org.apache.fop.datatypes.PercentBaseContext)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.fo.expr.NumericOp.negate(org.apache.fop.datatypes.Numeric)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.fo.expr.NumericOp.negate2(org.apache.fop.datatypes.Numeric,org.apache.fop.datatypes.PercentBaseContext)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.fo.expr.NumericOp.subtraction(org.apache.fop.datatypes.Numeric,org.apache.fop.datatypes.Numeric)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.fo.expr.NumericOp.subtraction2(org.apache.fop.datatypes.Numeric,org.apache.fop.datatypes.Numeric,org.apache.fop.datatypes.PercentBaseContext)`

## org.apache.fop.fo.expr.NumericProperty

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.properties.Property.log`

## org.apache.fop.fo.expr.PPColWidthFunction

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.fo.expr.PPColWidthFunction`

## org.apache.fop.fo.expr.RelativeNumericProperty

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.properties.Property.log`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.apache.fop.fo.expr.RelativeNumericProperty.getNumericValue()`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.apache.fop.fo.expr.RelativeNumericProperty.getNumericValue(org.apache.fop.datatypes.PercentBaseContext)`

## org.apache.fop.fo.extensions.ExtensionElementMapping

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.ElementMapping.getTable()`
+ NEW RETURN TYPE: `org.apache.fop.fo.ElementMapping.getTable()`

## org.apache.fop.fo.extensions.ExtensionObj

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.fo.extensions.ExtensionObj`

## org.apache.fop.fo.extensions.ExternalDocument

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.extensions.InternalElementMapping

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.ElementMapping.getTable()`
+ NEW RETURN TYPE: `org.apache.fop.fo.ElementMapping.getTable()`

## org.apache.fop.fo.extensions.OldExtensionElementMapping

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.ElementMapping.getTable()`
+ NEW RETURN TYPE: `org.apache.fop.fo.ElementMapping.getTable()`

## org.apache.fop.fo.extensions.destination.Destination

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

## org.apache.fop.fo.extensions.svg.BatikExtensionElementMapping

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.ElementMapping.getTable()`
+ NEW RETURN TYPE: `org.apache.fop.fo.ElementMapping.getTable()`

## org.apache.fop.fo.extensions.svg.SVGElement

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

## org.apache.fop.fo.extensions.svg.SVGElementMapping

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.ElementMapping.getTable()`
+ NEW RETURN TYPE: `org.apache.fop.fo.ElementMapping.getTable()`

## org.apache.fop.fo.extensions.svg.SVGObj

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

## org.apache.fop.fo.extensions.xmp.AbstractMetadataElement

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

## org.apache.fop.fo.extensions.xmp.RDFElement

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

## org.apache.fop.fo.extensions.xmp.RDFElementMapping

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.ElementMapping.getTable()`
+ NEW RETURN TYPE: `org.apache.fop.fo.ElementMapping.getTable()`

## org.apache.fop.fo.extensions.xmp.XMPElementMapping

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.ElementMapping.getTable()`
+ NEW RETURN TYPE: `org.apache.fop.fo.ElementMapping.getTable()`

## org.apache.fop.fo.extensions.xmp.XMPMetaElement

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

## org.apache.fop.fo.flow.AbstractGraphics

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.flow.AbstractGraphics.getPtr()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.fo.flow.AbstractGraphics`

## org.apache.fop.fo.flow.AbstractListItemPart

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.flow.AbstractPageNumberCitation

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.flow.AbstractPageNumberCitation.getPtr()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.fo.flow.AbstractPageNumberCitation`

## org.apache.fop.fo.flow.AbstractRetrieveMarker

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.apache.fop.fo.FONode.getNameId()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fo.flow.AbstractRetrieveMarker`
+ MUST NOW IMPLEMENT: `org.apache.fop.fo.flow.AbstractRetrieveMarker.restoreFOEventHandlerState()`

## org.apache.fop.fo.flow.BasicLink

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.flow.Inline.getPtr()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.fo.flow.BasicLink`

## org.apache.fop.fo.flow.BidiOverride

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.flow.Block

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.flow.Block.getPtr()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.fo.flow.Block`

## org.apache.fop.fo.flow.BlockContainer

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.flow.BlockContainer.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.fo.flow.BlockContainer.getWritingMode()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.fo.flow.BlockContainer.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.fo.flow.BlockContainer.getWritingMode()`

## org.apache.fop.fo.flow.Character

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.flow.Character.getPtr()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.fo.flow.Character`

## org.apache.fop.fo.flow.ExternalGraphic

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.flow.AbstractGraphics.getPtr()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.fo.flow.ExternalGraphic`

## org.apache.fop.fo.flow.Float

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.flow.Footnote

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.flow.FootnoteBody

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.flow.InitialPropertySet

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.flow.Inline

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.flow.Inline.getPtr()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.fo.flow.Inline`

## org.apache.fop.fo.flow.InlineContainer

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.flow.InlineContainer.getClip()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.flow.InlineContainer.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.fo.flow.InlineContainer.getWritingMode()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.fo.flow.InlineContainer.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.fo.flow.InlineContainer.getWritingMode()`

## org.apache.fop.fo.flow.InlineLevel

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.flow.InstreamForeignObject

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.flow.AbstractGraphics.getPtr()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.fo.flow.InstreamForeignObject`

## org.apache.fop.fo.flow.Leader

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.flow.ListBlock

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.flow.ListItem

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.flow.ListItemBody

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.flow.ListItemLabel

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.flow.Marker

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.flow.Marker$MarkerPropertyList

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.PropertyList.getAccessibilityProps()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.PropertyList.getWritingMode()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.PropertyList.getWritingMode(int,int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.PropertyList.setWritingMode()`

## org.apache.fop.fo.flow.MultiCase

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.flow.MultiProperties

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.flow.MultiPropertySet

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.flow.MultiSwitch

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.flow.MultiToggle

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.flow.PageNumber

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.flow.PageNumber.getPtr()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.fo.flow.PageNumber`

## org.apache.fop.fo.flow.PageNumberCitation

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.flow.AbstractPageNumberCitation.getPtr()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.fo.flow.PageNumberCitation`

## org.apache.fop.fo.flow.PageNumberCitationLast

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.flow.AbstractPageNumberCitation.getPtr()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.fo.flow.PageNumberCitationLast`

## org.apache.fop.fo.flow.RetrieveMarker

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.flow.RetrieveTableMarker

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.flow.Wrapper

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.flow.table.Table

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.flow.table.TableFObj.getPtr()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.fo.flow.table.Table`

## org.apache.fop.fo.flow.table.TableAndCaption

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.flow.table.TableBody

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.flow.table.TableFObj.getPtr()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.fo.flow.table.TableBody`

## org.apache.fop.fo.flow.table.TableCaption

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.flow.table.TableCell

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.flow.table.TableFObj.getPtr()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.fo.flow.table.TableCell`

## org.apache.fop.fo.flow.table.TableCellContainer

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.flow.table.TableFObj.getPtr()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.fo.flow.table.TableCellContainer`

## org.apache.fop.fo.flow.table.TableColumn

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.flow.table.TableFObj.getPtr()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.fo.flow.table.TableColumn`

## org.apache.fop.fo.flow.table.TableEventProducer$Provider

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.fo.flow.table.TableEventProducer$Provider`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.fo.flow.table.TableEventProducer$Provider`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fo.flow.table.TableEventProducer$Provider.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.fo.flow.table.TableEventProducer$Provider.get(org.apache.fop.events.EventBroadcaster)`

## org.apache.fop.fo.flow.table.TableFObj

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.flow.table.TableFObj.getPtr()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.fo.flow.table.TableFObj`

## org.apache.fop.fo.flow.table.TableFooter

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.flow.table.TableFObj.getPtr()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.fo.flow.table.TableFooter`

## org.apache.fop.fo.flow.table.TableHeader

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.flow.table.TableFObj.getPtr()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.fo.flow.table.TableHeader`

## org.apache.fop.fo.flow.table.TablePart

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.flow.table.TableFObj.getPtr()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.fo.flow.table.TablePart`

## org.apache.fop.fo.flow.table.TableRow

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.flow.table.TableFObj.getPtr()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.fo.flow.table.TableRow`

## org.apache.fop.fo.pagination.AbstractPageSequence

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.pagination.ColorProfile

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.pagination.ConditionalPageMasterReference

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.pagination.ConditionalPageMasterReference.getMasterReference()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.pagination.Declarations

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.pagination.Flow

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.pagination.LayoutMasterSet

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.pagination.PageNumberGenerator

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fo.pagination.PageNumberGenerator.<init>(java.lang.String,char,int,int)`

## org.apache.fop.fo.pagination.PageProductionException$PageProductionExceptionFactory

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.pagination.PageProductionException$PageProductionExceptionFactory.getExceptionClass()`
+ NEW RETURN TYPE: `org.apache.fop.fo.pagination.PageProductionException$PageProductionExceptionFactory.getExceptionClass()`

## org.apache.fop.fo.pagination.PageSequence

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.pagination.PageSequence.getCountry()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.pagination.PageSequence.getLanguage()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.pagination.PageSequence.getFlowMap()`
+ NEW RETURN TYPE: `org.apache.fop.fo.pagination.PageSequence.getFlowMap()`

## org.apache.fop.fo.pagination.PageSequenceMaster

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fo.pagination.PageSequenceMaster.<init>(org.apache.fop.fo.FONode)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.pagination.PageSequenceMaster.getNextSimplePageMaster(boolean,boolean,boolean,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.pagination.PageSequenceWrapper

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.pagination.Region

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.pagination.Region.getViewportRectangle(org.apache.fop.datatypes.FODimension,org.apache.fop.fo.pagination.SimplePageMaster)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.pagination.Region.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.fo.pagination.Region.getWritingMode()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.fo.pagination.Region.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.fo.pagination.Region.getWritingMode()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fo.pagination.Region`
+ MUST NOW IMPLEMENT: `org.apache.fop.fo.pagination.Region.getViewportRectangle(org.apache.fop.datatypes.FODimension)`

## org.apache.fop.fo.pagination.RegionAfter

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.pagination.RegionAfter.getViewportRectangle(org.apache.fop.datatypes.FODimension,org.apache.fop.fo.pagination.SimplePageMaster)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.pagination.RegionBA.adjustIPD(java.awt.Rectangle,int,org.apache.fop.datatypes.PercentBaseContext)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.pagination.Region.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.fo.pagination.Region.getWritingMode()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.fo.pagination.Region.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.fo.pagination.Region.getWritingMode()`

## org.apache.fop.fo.pagination.RegionBA

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.pagination.Region.getViewportRectangle(org.apache.fop.datatypes.FODimension,org.apache.fop.fo.pagination.SimplePageMaster)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.pagination.RegionBA.adjustIPD(java.awt.Rectangle,int,org.apache.fop.datatypes.PercentBaseContext)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.pagination.Region.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.fo.pagination.Region.getWritingMode()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.fo.pagination.Region.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.fo.pagination.Region.getWritingMode()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fo.pagination.RegionBA`
+ MUST NOW IMPLEMENT: `org.apache.fop.fo.pagination.Region.getViewportRectangle(org.apache.fop.datatypes.FODimension)`

## org.apache.fop.fo.pagination.RegionBefore

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.pagination.RegionBA.adjustIPD(java.awt.Rectangle,int,org.apache.fop.datatypes.PercentBaseContext)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.pagination.RegionBefore.getViewportRectangle(org.apache.fop.datatypes.FODimension,org.apache.fop.fo.pagination.SimplePageMaster)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.pagination.Region.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.fo.pagination.Region.getWritingMode()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.fo.pagination.Region.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.fo.pagination.Region.getWritingMode()`

## org.apache.fop.fo.pagination.RegionBody

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.pagination.RegionBody.getViewportRectangle(org.apache.fop.datatypes.FODimension,org.apache.fop.fo.pagination.SimplePageMaster)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.pagination.Region.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.fo.pagination.Region.getWritingMode()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.fo.pagination.Region.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.fo.pagination.Region.getWritingMode()`

## org.apache.fop.fo.pagination.RegionEnd

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.pagination.RegionEnd.getViewportRectangle(org.apache.fop.datatypes.FODimension,org.apache.fop.fo.pagination.SimplePageMaster)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.pagination.RegionSE.adjustIPD(java.awt.Rectangle,int,org.apache.fop.datatypes.PercentBaseContext)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.pagination.Region.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.fo.pagination.Region.getWritingMode()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.fo.pagination.Region.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.fo.pagination.Region.getWritingMode()`

## org.apache.fop.fo.pagination.RegionSE

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.pagination.Region.getViewportRectangle(org.apache.fop.datatypes.FODimension,org.apache.fop.fo.pagination.SimplePageMaster)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.pagination.RegionSE.adjustIPD(java.awt.Rectangle,int,org.apache.fop.datatypes.PercentBaseContext)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.pagination.Region.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.fo.pagination.Region.getWritingMode()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.fo.pagination.Region.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.fo.pagination.Region.getWritingMode()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fo.pagination.RegionSE`
+ MUST NOW IMPLEMENT: `org.apache.fop.fo.pagination.Region.getViewportRectangle(org.apache.fop.datatypes.FODimension)`

## org.apache.fop.fo.pagination.RegionStart

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.pagination.RegionSE.adjustIPD(java.awt.Rectangle,int,org.apache.fop.datatypes.PercentBaseContext)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.pagination.RegionStart.getViewportRectangle(org.apache.fop.datatypes.FODimension,org.apache.fop.fo.pagination.SimplePageMaster)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.pagination.Region.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.fo.pagination.Region.getWritingMode()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.fo.pagination.Region.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.fo.pagination.Region.getWritingMode()`

## org.apache.fop.fo.pagination.RepeatablePageMasterAlternatives

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.pagination.RepeatablePageMasterAlternatives.getNextPageMasterName(boolean,boolean,boolean,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.pagination.RepeatablePageMasterReference

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.pagination.RepeatablePageMasterReference.getNextPageMasterName(boolean,boolean,boolean,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.pagination.Root

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.pagination.SideRegion

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.pagination.Region.getViewportRectangle(org.apache.fop.datatypes.FODimension,org.apache.fop.fo.pagination.SimplePageMaster)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.pagination.Region.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.fo.pagination.Region.getWritingMode()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.fo.pagination.Region.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.fo.pagination.Region.getWritingMode()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fo.pagination.SideRegion`
+ MUST NOW IMPLEMENT: `org.apache.fop.fo.pagination.Region.getViewportRectangle(org.apache.fop.datatypes.FODimension)`

## org.apache.fop.fo.pagination.SimplePageMaster

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.pagination.SimplePageMaster.getRegions()`
+ NEW RETURN TYPE: `org.apache.fop.fo.pagination.SimplePageMaster.getRegions()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.pagination.SimplePageMaster.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.fo.pagination.SimplePageMaster.getWritingMode()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.fo.pagination.SimplePageMaster.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.fo.pagination.SimplePageMaster.getWritingMode()`

## org.apache.fop.fo.pagination.SinglePageMasterReference

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.pagination.SinglePageMasterReference.getNextPageMasterName(boolean,boolean,boolean,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.pagination.StaticContent

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.pagination.SubSequenceSpecifier

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.pagination.SubSequenceSpecifier.getNextPageMasterName(boolean,boolean,boolean,boolean)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fo.pagination.SubSequenceSpecifier`
+ MUST NOW IMPLEMENT: `org.apache.fop.fo.pagination.SubSequenceSpecifier.isInfinite()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fo.pagination.SubSequenceSpecifier`
+ MUST NOW IMPLEMENT: `org.apache.fop.fo.pagination.SubSequenceSpecifier.canProcess(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fo.pagination.SubSequenceSpecifier`
+ MUST NOW IMPLEMENT: `org.apache.fop.fo.pagination.SubSequenceSpecifier.isReusable()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fo.pagination.SubSequenceSpecifier`
+ MUST NOW IMPLEMENT: `org.apache.fop.fo.pagination.SubSequenceSpecifier.getNextPageMaster(boolean,boolean,boolean,boolean)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fo.pagination.SubSequenceSpecifier`
+ MUST NOW IMPLEMENT: `org.apache.fop.fo.pagination.SubSequenceSpecifier.getLastPageMaster(boolean,boolean,boolean,org.apache.fop.layoutmgr.BlockLevelEventProducer)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fo.pagination.SubSequenceSpecifier`
+ MUST NOW IMPLEMENT: `org.apache.fop.fo.pagination.SubSequenceSpecifier.resolveReferences(org.apache.fop.fo.pagination.LayoutMasterSet)`

## org.apache.fop.fo.pagination.Title

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.pagination.bookmarks.Bookmark

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.pagination.bookmarks.BookmarkTitle

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.pagination.bookmarks.BookmarkTree

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getExtensionAttachments()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getExtensionAttachments()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.FObj.getMarkers()`
+ NEW RETURN TYPE: `org.apache.fop.fo.FObj.getMarkers()`

## org.apache.fop.fo.properties.BackgroundPositionShorthand

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.properties.ListProperty.list`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.properties.Property.log`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.properties.ListProperty.getList()`
+ NEW RETURN TYPE: `org.apache.fop.fo.properties.ListProperty.getList()`

## org.apache.fop.fo.properties.BackgroundPositionShorthand$Maker

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.fo.properties.ListProperty$Maker.convertProperty(org.apache.fop.fo.properties.Property,org.apache.fop.fo.PropertyList,org.apache.fop.fo.FObj)`
+ NOW THROWS: `org.apache.fop.fo.properties.ListProperty$Maker.convertProperty(org.apache.fop.fo.properties.Property,org.apache.fop.fo.PropertyList,org.apache.fop.fo.FObj)`

## org.apache.fop.fo.properties.CommonAccessibility

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.fo.properties.CommonAccessibility`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.fo.properties.CommonAccessibility`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fo.properties.CommonAccessibility.<init>(org.apache.fop.fo.PropertyList)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.properties.CommonAccessibility.role`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.properties.CommonAccessibility.sourceDoc`

## org.apache.fop.fo.properties.CommonBorderPaddingBackground$BorderInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.properties.CommonBorderPaddingBackground$BorderInfo.getInstance(int,org.apache.fop.fo.properties.CondLengthProperty,java.awt.Color)`

## org.apache.fop.fo.properties.CondLengthProperty

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.properties.Property.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

## org.apache.fop.fo.properties.CorrespondingPropertyMaker

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.properties.CorrespondingPropertyMaker.lr_tb`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.properties.CorrespondingPropertyMaker.rl_tb`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.properties.CorrespondingPropertyMaker.tb_rl`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.properties.CorrespondingPropertyMaker.setCorresponding(int,int,int)`

## org.apache.fop.fo.properties.DimensionPropertyMaker

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.properties.CorrespondingPropertyMaker.lr_tb`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.properties.CorrespondingPropertyMaker.rl_tb`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.properties.CorrespondingPropertyMaker.tb_rl`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.properties.CorrespondingPropertyMaker.setCorresponding(int,int,int)`

## org.apache.fop.fo.properties.EnumLength

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.properties.Property.log`

## org.apache.fop.fo.properties.EnumNumber

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.apache.fop.fo.properties.EnumNumber.getNumericValue(org.apache.fop.datatypes.PercentBaseContext)`

## org.apache.fop.fo.properties.FontShorthandProperty

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.properties.ListProperty.list`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.properties.Property.log`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.properties.ListProperty.getList()`
+ NEW RETURN TYPE: `org.apache.fop.fo.properties.ListProperty.getList()`

## org.apache.fop.fo.properties.FontSizePropertyMaker

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

## org.apache.fop.fo.properties.FontStretchPropertyMaker

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

## org.apache.fop.fo.properties.IndentPropertyMaker

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.properties.CorrespondingPropertyMaker.lr_tb`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.properties.CorrespondingPropertyMaker.rl_tb`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.properties.CorrespondingPropertyMaker.tb_rl`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.properties.CorrespondingPropertyMaker.setCorresponding(int,int,int)`

## org.apache.fop.fo.properties.KeepProperty

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

## org.apache.fop.fo.properties.LengthPairProperty

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.properties.Property.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

## org.apache.fop.fo.properties.LengthProperty

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.properties.Property.log`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.apache.fop.datatypes.Numeric.getNumericValue()`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.apache.fop.datatypes.Numeric.getNumericValue(org.apache.fop.datatypes.PercentBaseContext)`

## org.apache.fop.fo.properties.LengthRangeProperty

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.properties.Property.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

## org.apache.fop.fo.properties.ListProperty

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.properties.ListProperty.list`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.properties.Property.log`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.properties.ListProperty.getList()`
+ NEW RETURN TYPE: `org.apache.fop.fo.properties.ListProperty.getList()`

## org.apache.fop.fo.properties.ListProperty$Maker

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.fo.properties.ListProperty$Maker.convertProperty(org.apache.fop.fo.properties.Property,org.apache.fop.fo.PropertyList,org.apache.fop.fo.FObj)`
+ NOW THROWS: `org.apache.fop.fo.properties.ListProperty$Maker.convertProperty(org.apache.fop.fo.properties.Property,org.apache.fop.fo.PropertyList,org.apache.fop.fo.FObj)`

## org.apache.fop.fo.properties.PercentLength

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.properties.Property.log`

## org.apache.fop.fo.properties.Property

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.fo.properties.Property`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.properties.Property.log`

## org.apache.fop.fo.properties.PropertyCache

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fo.properties.PropertyCache.<init>(java.lang.Class)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.properties.PropertyCache.fetch(org.apache.fop.fo.flow.Marker$MarkerAttribute)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.properties.PropertyCache.fetch(org.apache.fop.fo.properties.CommonBorderPaddingBackground$BorderInfo)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.properties.PropertyCache.fetch(org.apache.fop.fo.properties.CommonBorderPaddingBackground)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.properties.PropertyCache.fetch(org.apache.fop.fo.properties.CommonFont)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.properties.PropertyCache.fetch(org.apache.fop.fo.properties.CommonHyphenation)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.properties.PropertyCache.fetch(org.apache.fop.fo.properties.Property)`

## org.apache.fop.fo.properties.SpaceProperty

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.properties.Property.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

## org.apache.fop.fo.properties.SpacePropertyMaker

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.properties.CorrespondingPropertyMaker.lr_tb`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.properties.CorrespondingPropertyMaker.rl_tb`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.properties.CorrespondingPropertyMaker.tb_rl`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.properties.CorrespondingPropertyMaker.setCorresponding(int,int,int)`

## org.apache.fop.fo.properties.StructurePointerPropertySet

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.fo.properties.StructurePointerPropertySet`

## org.apache.fop.fo.properties.TableColLength

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.properties.Property.log`

## org.apache.fop.fo.properties.TextDecorationProperty

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.fo.properties.TextDecorationProperty`

## org.apache.fop.fo.properties.TextDecorationProperty$Maker

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.fo.properties.TextDecorationProperty$Maker`

## org.apache.fop.fo.properties.ToBeImplementedProperty

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.properties.Property.log`

## org.apache.fop.fo.properties.VerticalAlignShorthandParser

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

## org.apache.fop.fonts.BFEntry

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.fonts.BFEntry`

## org.apache.fop.fonts.Base14Font

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.FontMetrics.getFamilyNames()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.FontMetrics.getFamilyNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.FontMetrics.getKerningInfo()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.FontMetrics.getKerningInfo()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.Base14Font`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getFontURI()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.Base14Font`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getUnderlinePosition(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.Base14Font`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getUnderlineThickness(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.Base14Font`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getBoundingBox(int,int)`

## org.apache.fop.fonts.CIDFont

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fonts.CIDFont.<init>()`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.fonts.CustomFont.putKerningEntry(java.lang.Integer,java.util.Map)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.fonts.CustomFont.replaceKerningMap(java.util.Map)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.fonts.CustomFont.setFamilyNames(java.util.Set)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.CIDFont.getCIDSubset()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.CustomFont.getEmbedFileName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.CustomFont.getEmbedFileSource()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.CustomFont.setEmbedFileName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.CustomFont.setResolver(org.apache.fop.fonts.FontResolver)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.CustomFont.getFamilyNames()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.CustomFont.getFamilyNames()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.CIDFont`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.CIDFont.getCIDSet()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.CIDFont`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getBoundingBox(int,int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.CIDFont`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.CustomFont.getUnicodeFromGID(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.CIDFont`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.CustomFont.getUsedGlyphs()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.CIDFont`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontDescriptor.isSubsetEmbedded()`

## org.apache.fop.fonts.CIDSubset

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fonts.CIDSubset.<init>()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.CIDSubset.getGlyphIndexBitSet()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.CIDSubset.getGlyphIndexForSubsetIndex(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.CIDSubset.getSubsetChars()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.CIDSubset.getSubsetGlyphs()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.CIDSubset.getSubsetSize()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.CIDSubset.getUnicodeForSubsetIndex(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.CIDSubset.mapSubsetChar(int,char)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.CIDSubset.setupFirstThreeGlyphs()`

## org.apache.fop.fonts.CustomFont

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fonts.CustomFont.<init>()`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.fonts.CustomFont.putKerningEntry(java.lang.Integer,java.util.Map)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.fonts.CustomFont.replaceKerningMap(java.util.Map)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.fonts.CustomFont.setFamilyNames(java.util.Set)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.CustomFont.getEmbedFileName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.CustomFont.getEmbedFileSource()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.CustomFont.setEmbedFileName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.CustomFont.setResolver(org.apache.fop.fonts.FontResolver)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.CustomFont.getFamilyNames()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.CustomFont.getFamilyNames()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.CustomFont`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontDescriptor.isSubsetEmbedded()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.CustomFont`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getBoundingBox(int,int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.CustomFont`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.CustomFont.getUsedGlyphs()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.CustomFont`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.CustomFont.getUnicodeFromGID(int)`

## org.apache.fop.fonts.CustomFontCollection

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fonts.CustomFontCollection.<init>(org.apache.fop.fonts.FontResolver,java.util.List)`

## org.apache.fop.fonts.EmbedFontInfo

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fonts.EmbedFontInfo.<init>(java.lang.String,boolean,java.util.List,java.lang.String,java.lang.String)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fonts.EmbedFontInfo.kerning`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fonts.EmbedFontInfo.embedFile`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fonts.EmbedFontInfo.encodingMode`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fonts.EmbedFontInfo.metricsFile`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.EmbedFontInfo.getEmbedFile()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.EmbedFontInfo.getMetricsFile()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.EmbedFontInfo.setEncodingMode(org.apache.fop.fonts.EncodingMode)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.EmbedFontInfo.getFontTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.EmbedFontInfo.getFontTriplets()`

## org.apache.fop.fonts.EncodingMode

### TYPE_KIND_CHANGED [binary ✗ | source ✗]
- TYPE (kind changed): `org.apache.fop.fonts.EncodingMode`

## org.apache.fop.fonts.Font

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.Font.getKerning()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.Font.getKerning()`

## org.apache.fop.fonts.FontAdder

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fonts.FontAdder.<init>(org.apache.fop.fonts.FontManager,org.apache.fop.fonts.FontResolver,org.apache.fop.fonts.FontEventListener)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.fonts.FontAdder.add(java.util.List,java.util.List)`
+ NOW THROWS: `org.apache.fop.fonts.FontAdder.add(java.util.List<java.net.URL>,java.util.List<org.apache.fop.fonts.EmbedFontInfo>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.fonts.FontAdder.add(java.util.List,java.util.List)`

## org.apache.fop.fonts.FontCache

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.FontCache.addFont(org.apache.fop.fonts.EmbedFontInfo)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.FontCache.getLastModified(java.net.URL)`

## org.apache.fop.fonts.FontDescriptor

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.FontMetrics.getFamilyNames()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.FontMetrics.getFamilyNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.FontMetrics.getKerningInfo()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.FontMetrics.getKerningInfo()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.FontDescriptor`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontDescriptor.isSubsetEmbedded()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.FontDescriptor`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getUnderlinePosition(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.FontDescriptor`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getStrikeoutPosition(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.FontDescriptor`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getStrikeoutThickness(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.FontDescriptor`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getFontURI()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.FontDescriptor`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.hasFeature(int,java.lang.String,java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.FontDescriptor`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getUnderlineThickness(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.FontDescriptor`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getBoundingBox(int,int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.FontDescriptor`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.isMultiByte()`

## org.apache.fop.fonts.FontDetector

### TYPE_KIND_CHANGED [binary ✗ | source ✗]
- TYPE (kind changed): `org.apache.fop.fonts.FontDetector`

## org.apache.fop.fonts.FontEventListener

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.FontEventListener`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontEventListener.fontDirectoryNotFound(java.lang.Object,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.FontEventListener`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontEventListener.svgTextStrokedAsShapes(java.lang.Object,java.lang.String)`

## org.apache.fop.fonts.FontEventProducer

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.FontEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontEventProducer.fontDirectoryNotFound(java.lang.Object,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.FontEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontEventProducer.fontFeatureNotSuppprted(java.lang.Object,java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.FontEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontEventProducer.svgTextStrokedAsShapes(java.lang.Object,java.lang.String)`

## org.apache.fop.fonts.FontInfo

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fonts.FontInfo.log`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.FontInfo.getFontTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.FontInfo.getFontTriplets()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.FontInfo.getFonts()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.FontInfo.getFonts()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.FontInfo.getTripletsFor(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.fonts.FontInfo.getTripletsFor(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.FontInfo.getUsedFonts()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.FontInfo.getUsedFonts()`

## org.apache.fop.fonts.FontInfoConfigurator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.fonts.FontInfoConfigurator`

## org.apache.fop.fonts.FontLoader

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fonts.FontLoader.<init>(java.lang.String,boolean,boolean,org.apache.fop.fonts.FontResolver)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fonts.FontLoader.fontFileURI`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fonts.FontLoader.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fonts.FontLoader.resolver`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.fop.fonts.FontLoader.fontFileURI`
+ NEW FIELD: `org.apache.fop.fonts.FontLoader.fontFileURI`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.fop.fonts.FontLoader.fontFileURI`
+ NEW FIELD: `org.apache.fop.fonts.FontLoader.fontFileURI`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.FontLoader.loadFont(java.io.File,java.lang.String,boolean,org.apache.fop.fonts.EncodingMode,org.apache.fop.fonts.FontResolver)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.FontLoader.loadFont(java.lang.String,java.lang.String,boolean,org.apache.fop.fonts.EncodingMode,boolean,org.apache.fop.fonts.FontResolver)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.FontLoader.loadFont(java.net.URL,java.lang.String,boolean,org.apache.fop.fonts.EncodingMode,org.apache.fop.fonts.FontResolver)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.FontLoader.openFontUri(org.apache.fop.fonts.FontResolver,java.lang.String)`

## org.apache.fop.fonts.FontManager

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fonts.FontManager.<init>()`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fonts.FontManager.DEFAULT_USE_CACHE`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.fonts.FontManager.updateReferencedFonts(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.fonts.FontManager.updateReferencedFonts(java.util.List,org.apache.fop.fonts.FontTriplet$Matcher)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.FontManager.createMinimalFontResolver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.FontManager.getFontBaseURL()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.FontManager.setFontBaseURL(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.FontManager.setUseCache(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.FontManager.useCache()`

## org.apache.fop.fonts.FontManagerConfigurator

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fonts.FontManagerConfigurator.<init>(org.apache.avalon.framework.configuration.Configuration)`

## org.apache.fop.fonts.FontMetrics

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.FontMetrics.getFamilyNames()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.FontMetrics.getFamilyNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.FontMetrics.getKerningInfo()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.FontMetrics.getKerningInfo()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.FontMetrics`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getUnderlinePosition(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.FontMetrics`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getBoundingBox(int,int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.FontMetrics`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getUnderlineThickness(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.FontMetrics`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getStrikeoutPosition(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.FontMetrics`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.hasFeature(int,java.lang.String,java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.FontMetrics`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getFontURI()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.FontMetrics`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.isMultiByte()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.FontMetrics`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getStrikeoutThickness(int)`

## org.apache.fop.fonts.FontReader

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.fonts.FontReader`

## org.apache.fop.fonts.FontResolver

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.fonts.FontResolver`

## org.apache.fop.fonts.FontSetup

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.fonts.FontSetup`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.fonts.FontSetup`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fonts.FontSetup.<init>()`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fonts.FontSetup.log`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.FontSetup.createMinimalFontResolver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.FontSetup.setup(org.apache.fop.fonts.FontInfo)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.FontSetup.setup(org.apache.fop.fonts.FontInfo,java.util.List,org.apache.fop.fonts.FontResolver)`

## org.apache.fop.fonts.FontTriplet

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fonts.FontTriplet.<init>(java.lang.String)`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.apache.fop.fonts.FontTriplet.compareTo(java.lang.Object)`

## org.apache.fop.fonts.FontUtil

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.fonts.FontUtil`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.fonts.FontUtil`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fonts.FontUtil.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.fonts.FontUtil.guessStyle(java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.fonts.FontUtil.guessWeight(java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.fonts.FontUtil.parseCSS2FontWeight(java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.fonts.FontUtil.stripWhiteSpace(java.lang.String)`

## org.apache.fop.fonts.Glyphs

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.fonts.Glyphs`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.fonts.Glyphs`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fonts.Glyphs.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.fonts.Glyphs.stringToGlyph(java.lang.String)`

## org.apache.fop.fonts.LazyFont

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fonts.LazyFont.<init>(org.apache.fop.fonts.EmbedFontInfo,org.apache.fop.fonts.FontResolver)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.LazyFont.getFamilyNames()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.LazyFont.getFamilyNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.LazyFont.getKerningInfo()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.LazyFont.getKerningInfo()`

## org.apache.fop.fonts.MultiByteFont

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fonts.MultiByteFont.<init>()`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.fonts.CustomFont.putKerningEntry(java.lang.Integer,java.util.Map)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.fonts.CustomFont.replaceKerningMap(java.util.Map)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.fonts.CustomFont.setFamilyNames(java.util.Set)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.CustomFont.getEmbedFileName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.CustomFont.getEmbedFileSource()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.CustomFont.setEmbedFileName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.CustomFont.setResolver(org.apache.fop.fonts.FontResolver)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.MultiByteFont.getCIDSubset()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.MultiByteFont.getCharsUsed()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.MultiByteFont.setBFEntries(org.apache.fop.fonts.BFEntry[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.CustomFont.getFamilyNames()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.CustomFont.getFamilyNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.MultiByteFont.getUsedGlyphs()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.MultiByteFont.getUsedGlyphs()`

## org.apache.fop.fonts.MutableFont

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.fonts.MutableFont.putKerningEntry(java.lang.Integer,java.util.Map)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.fonts.MutableFont.setFamilyNames(java.util.Set)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.MutableFont.setEmbedFileName(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.MutableFont`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.MutableFont.setFontURI(java.net.URI)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.MutableFont`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.MutableFont.setEmbeddingMode(org.apache.fop.fonts.EmbeddingMode)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.MutableFont`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.MutableFont.setEmbedURI(java.net.URI)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.MutableFont`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.MutableFont.setAdvancedEnabled(boolean)`

## org.apache.fop.fonts.SingleByteFont

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fonts.SingleByteFont.<init>()`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.fonts.CustomFont.putKerningEntry(java.lang.Integer,java.util.Map)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.fonts.CustomFont.replaceKerningMap(java.util.Map)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.fonts.CustomFont.setFamilyNames(java.util.Set)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.CustomFont.getEmbedFileName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.CustomFont.getEmbedFileSource()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.CustomFont.setEmbedFileName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.CustomFont.setResolver(org.apache.fop.fonts.FontResolver)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.SingleByteFont.addUnencodedCharacter(org.apache.fop.fonts.NamedCharacter,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.CustomFont.getFamilyNames()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.CustomFont.getFamilyNames()`

## org.apache.fop.fonts.Typeface

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.FontMetrics.getFamilyNames()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.FontMetrics.getFamilyNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.FontMetrics.getKerningInfo()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.FontMetrics.getKerningInfo()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.Typeface`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getStrikeoutThickness(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.Typeface`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getUnderlineThickness(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.Typeface`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getStrikeoutPosition(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.Typeface`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getBoundingBox(int,int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.Typeface`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getUnderlinePosition(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.fonts.Typeface`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getFontURI()`

## org.apache.fop.fonts.apps.AbstractFontReader

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fonts.apps.AbstractFontReader.log`

## org.apache.fop.fonts.apps.PFMReader

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fonts.apps.AbstractFontReader.log`

## org.apache.fop.fonts.apps.TTFReader

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fonts.apps.AbstractFontReader.log`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.apps.TTFReader.loadTTF(java.lang.String,java.lang.String)`

## org.apache.fop.fonts.autodetect.FontFileFinder

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fonts.autodetect.FontFileFinder.<init>()`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fonts.autodetect.FontFileFinder.<init>(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.autodetect.FontFileFinder.find()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.autodetect.FontFileFinder.find()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.autodetect.FontFileFinder.find(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.fonts.autodetect.FontFileFinder.find(java.lang.String)`

## org.apache.fop.fonts.autodetect.FontFinder

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.autodetect.FontFinder.find()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.autodetect.FontFinder.find()`

## org.apache.fop.fonts.autodetect.FontInfoFinder

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.autodetect.FontInfoFinder.find(java.net.URL,org.apache.fop.fonts.FontResolver,org.apache.fop.fonts.FontCache)`

## org.apache.fop.fonts.autodetect.MacFontDirFinder

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.autodetect.NativeFontDirFinder.find()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.autodetect.NativeFontDirFinder.find()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.fonts.autodetect.MacFontDirFinder`

## org.apache.fop.fonts.autodetect.NativeFontDirFinder

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.autodetect.NativeFontDirFinder.find()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.autodetect.NativeFontDirFinder.find()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.fonts.autodetect.NativeFontDirFinder`

## org.apache.fop.fonts.autodetect.UnixFontDirFinder

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.autodetect.NativeFontDirFinder.find()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.autodetect.NativeFontDirFinder.find()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.fonts.autodetect.UnixFontDirFinder`

## org.apache.fop.fonts.autodetect.WindowsFontDirFinder

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.autodetect.WindowsFontDirFinder.find()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.autodetect.WindowsFontDirFinder.find()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.fonts.autodetect.WindowsFontDirFinder`

## org.apache.fop.fonts.substitute.FontQualifier

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.substitute.FontQualifier.getTriplets()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.substitute.FontQualifier.getTriplets()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.substitute.FontQualifier.match(org.apache.fop.fonts.FontInfo)`
+ NEW RETURN TYPE: `org.apache.fop.fonts.substitute.FontQualifier.match(org.apache.fop.fonts.FontInfo)`

## org.apache.fop.fonts.substitute.FontSubstitutions

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fonts.substitute.FontSubstitutions.log`

## org.apache.fop.fonts.substitute.FontWeightRange

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fonts.substitute.FontWeightRange.log`

## org.apache.fop.fonts.truetype.FontFileReader

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fonts.truetype.FontFileReader.<init>(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.truetype.FontFileReader.read()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.truetype.FontFileReader.seekAdd(long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.truetype.FontFileReader.writeTTFUShort(int,int)`

## org.apache.fop.fonts.truetype.TTFCmapEntry

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.fonts.truetype.TTFCmapEntry`

## org.apache.fop.fonts.truetype.TTFFile

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.fop.fonts.truetype.TTFFile.mtxTab`
+ NEW FIELD: `org.apache.fop.fonts.truetype.OpenFont.mtxTab`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.fop.fonts.truetype.TTFFile.mtxTab`
+ NEW FIELD: `org.apache.fop.fonts.truetype.OpenFont.mtxTab`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.truetype.TTFFile.checkTTC(org.apache.fop.fonts.truetype.FontFileReader,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.truetype.TTFFile.getNumGlyphs(org.apache.fop.fonts.truetype.FontFileReader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.truetype.TTFFile.readDirTabs(org.apache.fop.fonts.truetype.FontFileReader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.truetype.TTFFile.readFont(org.apache.fop.fonts.truetype.FontFileReader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.truetype.TTFFile.readFontHeader(org.apache.fop.fonts.truetype.FontFileReader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.truetype.TTFFile.readHorizontalHeader(org.apache.fop.fonts.truetype.FontFileReader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.truetype.TTFFile.readHorizontalMetrics(org.apache.fop.fonts.truetype.FontFileReader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.truetype.TTFFile.readIndexToLocation(org.apache.fop.fonts.truetype.FontFileReader)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.truetype.TTFFile.getAnsiKerning()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.truetype.OpenFont.getAnsiKerning()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.truetype.TTFFile.getCMaps()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.truetype.OpenFont.getCMaps()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.truetype.TTFFile.getFamilyNames()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.truetype.OpenFont.getFamilyNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.truetype.TTFFile.getKerning()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.truetype.OpenFont.getKerning()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.truetype.TTFFile.readFont(org.apache.fop.fonts.truetype.FontFileReader,java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.fonts.truetype.OpenFont.readFont(org.apache.fop.fonts.truetype.FontFileReader,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.fonts.truetype.TTFFile.readFont(org.apache.fop.fonts.truetype.FontFileReader,java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.fonts.truetype.OpenFont.readFont(org.apache.fop.fonts.truetype.FontFileReader,java.lang.String)`

## org.apache.fop.fonts.truetype.TTFFontLoader

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.fonts.truetype.TTFFontLoader`

## org.apache.fop.fonts.truetype.TTFSubSetFile

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.fop.fonts.truetype.TTFFile.mtxTab`
+ NEW FIELD: `org.apache.fop.fonts.truetype.OpenFont.mtxTab`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.fop.fonts.truetype.TTFFile.mtxTab`
+ NEW FIELD: `org.apache.fop.fonts.truetype.OpenFont.mtxTab`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.truetype.TTFFile.checkTTC(org.apache.fop.fonts.truetype.FontFileReader,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.truetype.TTFFile.getNumGlyphs(org.apache.fop.fonts.truetype.FontFileReader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.truetype.TTFFile.readDirTabs(org.apache.fop.fonts.truetype.FontFileReader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.truetype.TTFFile.readFont(org.apache.fop.fonts.truetype.FontFileReader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.truetype.TTFFile.readFontHeader(org.apache.fop.fonts.truetype.FontFileReader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.truetype.TTFFile.readHorizontalHeader(org.apache.fop.fonts.truetype.FontFileReader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.truetype.TTFFile.readHorizontalMetrics(org.apache.fop.fonts.truetype.FontFileReader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.truetype.TTFFile.readIndexToLocation(org.apache.fop.fonts.truetype.FontFileReader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.truetype.TTFSubSetFile.readFont(org.apache.fop.fonts.truetype.FontFileReader,java.lang.String,java.util.Map)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.truetype.TTFFile.getAnsiKerning()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.truetype.OpenFont.getAnsiKerning()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.truetype.TTFFile.getCMaps()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.truetype.OpenFont.getCMaps()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.truetype.TTFFile.getFamilyNames()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.truetype.OpenFont.getFamilyNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.truetype.TTFFile.getKerning()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.truetype.OpenFont.getKerning()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.truetype.TTFFile.readFont(org.apache.fop.fonts.truetype.FontFileReader,java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.fonts.truetype.OpenFont.readFont(org.apache.fop.fonts.truetype.FontFileReader,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.fonts.truetype.TTFFile.readFont(org.apache.fop.fonts.truetype.FontFileReader,java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.fonts.truetype.OpenFont.readFont(org.apache.fop.fonts.truetype.FontFileReader,java.lang.String)`

## org.apache.fop.fonts.type1.AFMCharMetrics

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.type1.AFMCharMetrics.setBBox(java.awt.geom.RectangularShape)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.type1.AFMCharMetrics.getBBox()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.type1.AFMCharMetrics.getBBox()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.fonts.type1.AFMCharMetrics.getBBox()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.type1.AFMCharMetrics.getBBox()`

## org.apache.fop.fonts.type1.AFMFile

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.type1.AFMFile.createXKerningMapEncoded()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.type1.AFMFile.createXKerningMapEncoded()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.type1.AFMFile.getCharMetrics()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.type1.AFMFile.getCharMetrics()`

## org.apache.fop.fonts.type1.AFMParser

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.type1.AFMParser.parse(java.io.BufferedReader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.type1.AFMParser.parse(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.type1.AFMParser.parse(java.io.InputStream)`

## org.apache.fop.fonts.type1.PFBParser

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.type1.PFBParser.parsePFB(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.type1.PFBParser.parsePFB(java.net.URL)`

## org.apache.fop.fonts.type1.PFMFile

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.type1.PFMFile.getKerning()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.type1.PFMFile.getKerning()`

## org.apache.fop.fonts.type1.Type1FontLoader

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.fonts.type1.Type1FontLoader.<init>(java.lang.String,boolean,boolean,org.apache.fop.fonts.FontResolver)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fonts.FontLoader.fontFileURI`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fonts.FontLoader.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fonts.FontLoader.resolver`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.fop.fonts.FontLoader.fontFileURI`
+ NEW FIELD: `org.apache.fop.fonts.FontLoader.fontFileURI`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.fop.fonts.FontLoader.fontFileURI`
+ NEW FIELD: `org.apache.fop.fonts.FontLoader.fontFileURI`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.FontLoader.loadFont(java.io.File,java.lang.String,boolean,org.apache.fop.fonts.EncodingMode,org.apache.fop.fonts.FontResolver)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.FontLoader.loadFont(java.lang.String,java.lang.String,boolean,org.apache.fop.fonts.EncodingMode,boolean,org.apache.fop.fonts.FontResolver)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.FontLoader.loadFont(java.net.URL,java.lang.String,boolean,org.apache.fop.fonts.EncodingMode,org.apache.fop.fonts.FontResolver)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fonts.FontLoader.openFontUri(org.apache.fop.fonts.FontResolver,java.lang.String)`

## org.apache.fop.hyphenation.CharVector

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.hyphenation.CharVector.clone()`
+ NOW THROWS: `org.apache.fop.hyphenation.CharVector.clone()`

## org.apache.fop.hyphenation.HyphenationTree

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.hyphenation.TernaryTree.clone()`
+ NOW THROWS: `org.apache.fop.hyphenation.TernaryTree.clone()`

## org.apache.fop.hyphenation.HyphenationTreeCache

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.hyphenation.HyphenationTreeCache.constructKey(java.lang.String,java.lang.String)`

## org.apache.fop.hyphenation.HyphenationTreeResolver

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.hyphenation.HyphenationTreeResolver`

## org.apache.fop.hyphenation.Hyphenator

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.hyphenation.Hyphenator`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.hyphenation.Hyphenator`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.hyphenation.Hyphenator.<init>(java.lang.String,java.lang.String,int,int)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.hyphenation.Hyphenator.log`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.hyphenation.Hyphenator.getFopHyphenationTree(java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.hyphenation.Hyphenator.getHyphenationTreeCache()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.hyphenation.Hyphenator.getHyphenationTree(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.hyphenation.Hyphenator.getHyphenationTree(java.lang.String,java.lang.String,org.apache.fop.hyphenation.HyphenationTreeResolver)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.hyphenation.Hyphenator.getUserHyphenationTree(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.hyphenation.Hyphenator.getUserHyphenationTree(java.lang.String,org.apache.fop.hyphenation.HyphenationTreeResolver)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.hyphenation.Hyphenator.hyphenate(char[],int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.hyphenation.Hyphenator.hyphenate(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.hyphenation.Hyphenator.hyphenate(java.lang.String,java.lang.String,char[],int,int,int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.hyphenation.Hyphenator.hyphenate(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.hyphenation.Hyphenator.hyphenate(java.lang.String,java.lang.String,org.apache.fop.hyphenation.HyphenationTreeResolver,char[],int,int,int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.hyphenation.Hyphenator.hyphenate(java.lang.String,java.lang.String,org.apache.fop.hyphenation.HyphenationTreeResolver,java.lang.String,int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.hyphenation.Hyphenator.setLanguage(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.hyphenation.Hyphenator.setMinPushCharCount(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.hyphenation.Hyphenator.setMinRemainCharCount(int)`

## org.apache.fop.hyphenation.PatternParser

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.hyphenation.PatternParser.getExceptionWord(java.util.ArrayList)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.hyphenation.PatternParser.getInterletterValues(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.hyphenation.PatternParser.getPattern(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.hyphenation.PatternParser.normalizeException(java.util.ArrayList)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.hyphenation.PatternParser.readToken(java.lang.StringBuffer)`

## org.apache.fop.hyphenation.TernaryTree

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.hyphenation.TernaryTree.clone()`
+ NOW THROWS: `org.apache.fop.hyphenation.TernaryTree.clone()`

## org.apache.fop.image.loader.batik.BatikUtil

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.image.loader.batik.BatikUtil`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.image.loader.batik.BatikUtil`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.image.loader.batik.BatikUtil.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.image.loader.batik.BatikUtil.cloneSVGDocument(org.w3c.dom.Document)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.image.loader.batik.BatikUtil.isBatikAvailable()`

## org.apache.fop.layoutmgr.AbstractBaseLayoutManager

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.layoutmgr.AbstractBaseLayoutManager`
+ MUST NOW IMPLEMENT: `org.apache.fop.layoutmgr.LayoutManager.hasLineAreaDescendant()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.layoutmgr.AbstractBaseLayoutManager`
+ MUST NOW IMPLEMENT: `org.apache.fop.layoutmgr.LayoutManager.getBaselineOffset()`

## org.apache.fop.layoutmgr.AbstractBreaker

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.layoutmgr.AbstractBreaker.log`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.layoutmgr.AbstractBreaker.getNextBlockList(org.apache.fop.layoutmgr.LayoutContext,int,org.apache.fop.layoutmgr.Position,org.apache.fop.layoutmgr.LayoutManager,java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractBreaker.doLayout(int,boolean)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractBreaker.doLayout(int,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractBreaker.getNextKnuthElements(org.apache.fop.layoutmgr.LayoutContext,int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractBreaker.getNextKnuthElements(org.apache.fop.layoutmgr.LayoutContext,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractBreaker.getNextKnuthElements(org.apache.fop.layoutmgr.LayoutContext,int,org.apache.fop.layoutmgr.Position,org.apache.fop.layoutmgr.LayoutManager)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractBreaker.getNextKnuthElements(org.apache.fop.layoutmgr.LayoutContext,int,org.apache.fop.layoutmgr.Position,org.apache.fop.layoutmgr.LayoutManager)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.layoutmgr.AbstractBreaker.doLayout(int,boolean)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractBreaker.doLayout(int,boolean)`

## org.apache.fop.layoutmgr.AbstractBreaker$BlockSequence

### CLASS_NOW_STATIC [binary ✗ | source ✗]
- CLASS (now static): `org.apache.fop.layoutmgr.AbstractBreaker$BlockSequence`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.AbstractBreaker$BlockSequence.ignoreAtEnd`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.AbstractBreaker$BlockSequence.ignoreAtStart`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.KnuthSequence.getFirstBoxIndex()`

## org.apache.fop.layoutmgr.AbstractBreaker$PageBreakPosition

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.Position.getShortLMName()`

## org.apache.fop.layoutmgr.AbstractLayoutManager

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.AbstractPageSequenceLayoutManager

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractPageSequenceLayoutManager.makeNewPage(boolean,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.AreaAdditionUtil

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.layoutmgr.AreaAdditionUtil`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.layoutmgr.AreaAdditionUtil`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.layoutmgr.AreaAdditionUtil.<init>()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AreaAdditionUtil.addAreas(org.apache.fop.layoutmgr.BlockStackingLayoutManager,org.apache.fop.layoutmgr.PositionIterator,org.apache.fop.layoutmgr.LayoutContext)`

## org.apache.fop.layoutmgr.BalancingColumnBreakingAlgorithm

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.layoutmgr.BreakingAlgorithm.log`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.PageBreakingAlgorithm.getPageBreaks()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.PageBreakingAlgorithm.getPageBreaks()`

## org.apache.fop.layoutmgr.BlockContainerLayoutManager

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.layoutmgr.BlockStackingLayoutManager.addInBetweenBreak(java.util.List,org.apache.fop.layoutmgr.LayoutContext,org.apache.fop.layoutmgr.LayoutContext)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.BlockStackingLayoutManager.createUnitElements(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.BlockKnuthSequence

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.KnuthSequence.getFirstBoxIndex()`

## org.apache.fop.layoutmgr.BlockLayoutManager

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.layoutmgr.BlockStackingLayoutManager.addInBetweenBreak(java.util.List,org.apache.fop.layoutmgr.LayoutContext,org.apache.fop.layoutmgr.LayoutContext)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.BlockStackingLayoutManager.createUnitElements(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.BlockLayoutManager$ProxyLMiter

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.apache.fop.layoutmgr.LMiter.add(java.lang.Object)`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.apache.fop.layoutmgr.LMiter.set(java.lang.Object)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.LMiter.next()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.LMiter.next()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.LMiter.previous()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.LMiter.previous()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.layoutmgr.LMiter.next()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.LMiter.next()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.layoutmgr.LMiter.previous()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.LMiter.previous()`

## org.apache.fop.layoutmgr.BlockLevelEventProducer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.BlockLevelEventProducer.viewportOverflow(java.lang.Object,java.lang.String,int,boolean,boolean,org.xml.sax.Locator)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.layoutmgr.BlockLevelEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.layoutmgr.BlockLevelEventProducer.viewportBPDOverflow(java.lang.Object,java.lang.String,int,boolean,boolean,org.xml.sax.Locator)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.layoutmgr.BlockLevelEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.layoutmgr.BlockLevelEventProducer.lastPageMasterReferenceMissing(java.lang.Object,org.xml.sax.Locator)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.layoutmgr.BlockLevelEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.layoutmgr.BlockLevelEventProducer.layoutHasReachedParts(java.lang.Object,int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.layoutmgr.BlockLevelEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.layoutmgr.BlockLevelEventProducer.staticRegionOverflow(java.lang.Object,java.lang.String,java.lang.String,int,boolean,boolean,org.xml.sax.Locator)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.layoutmgr.BlockLevelEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.layoutmgr.BlockLevelEventProducer.viewportIPDOverflow(java.lang.Object,java.lang.String,int,boolean,boolean,org.xml.sax.Locator)`

## org.apache.fop.layoutmgr.BlockLevelLayoutManager

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.layoutmgr.BlockLevelLayoutManager`
+ MUST NOW IMPLEMENT: `org.apache.fop.layoutmgr.LayoutManager.getBaselineOffset()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.layoutmgr.BlockLevelLayoutManager`
+ MUST NOW IMPLEMENT: `org.apache.fop.layoutmgr.LayoutManager.hasLineAreaDescendant()`

## org.apache.fop.layoutmgr.BlockStackingLayoutManager

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.layoutmgr.BlockStackingLayoutManager.addInBetweenBreak(java.util.List,org.apache.fop.layoutmgr.LayoutContext,org.apache.fop.layoutmgr.LayoutContext)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.BlockStackingLayoutManager.createUnitElements(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.BlockStackingLayoutManager$MappingPosition

### METHOD_NOW_PROTECTED [binary ✗ | source ✗]
- METHOD (now protected, was public): `org.apache.fop.layoutmgr.Position.getShortLMName()`

## org.apache.fop.layoutmgr.BlockStackingLayoutManager$StackingIter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.layoutmgr.BlockStackingLayoutManager$StackingIter`

## org.apache.fop.layoutmgr.BorderElement

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.layoutmgr.UnresolvedListElementWithLength.log`

## org.apache.fop.layoutmgr.BorderOrPaddingElement

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.layoutmgr.UnresolvedListElementWithLength.log`

## org.apache.fop.layoutmgr.BreakingAlgorithm

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.layoutmgr.BreakingAlgorithm.log`

## org.apache.fop.layoutmgr.ElementListObserver

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.layoutmgr.ElementListObserver`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.layoutmgr.ElementListObserver`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.layoutmgr.ElementListObserver.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.ElementListObserver.addObserver(org.apache.fop.layoutmgr.ElementListObserver$Observer)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.ElementListObserver.isObservationActive()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.ElementListObserver.observe(java.util.List,java.lang.String,java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.ElementListObserver.removeObserver(org.apache.fop.layoutmgr.ElementListObserver$Observer)`

## org.apache.fop.layoutmgr.ExternalDocumentLayoutManager

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractPageSequenceLayoutManager.makeNewPage(boolean,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.FlowLayoutManager

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.layoutmgr.BlockStackingLayoutManager.addInBetweenBreak(java.util.List,org.apache.fop.layoutmgr.LayoutContext,org.apache.fop.layoutmgr.LayoutContext)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.BlockStackingLayoutManager.createUnitElements(java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.FlowLayoutManager.getNextKnuthElements(org.apache.fop.layoutmgr.LayoutContext,int,org.apache.fop.layoutmgr.Position,org.apache.fop.layoutmgr.LayoutManager)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.FlowLayoutManager.getChangedKnuthElements(java.util.List,int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.FlowLayoutManager.getChangedKnuthElements(java.util.List,int)`

## org.apache.fop.layoutmgr.FootnoteBodyLayoutManager

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.layoutmgr.BlockStackingLayoutManager.addInBetweenBreak(java.util.List,org.apache.fop.layoutmgr.LayoutContext,org.apache.fop.layoutmgr.LayoutContext)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.BlockStackingLayoutManager.createUnitElements(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.BlockStackingLayoutManager.getNextKnuthElements(org.apache.fop.layoutmgr.LayoutContext,int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.FootnoteBodyLayoutManager.getNextKnuthElements(org.apache.fop.layoutmgr.LayoutContext,int)`

## org.apache.fop.layoutmgr.InlineKnuthSequence

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.KnuthSequence.getFirstBoxIndex()`

## org.apache.fop.layoutmgr.KnuthBlockBox

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.KnuthBlockBox.getFootnoteBodyLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.KnuthBlockBox.getFootnoteBodyLMs()`

## org.apache.fop.layoutmgr.KnuthPossPosIter

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.KnuthPossPosIter.next()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.KnuthPossPosIter.next()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.layoutmgr.KnuthPossPosIter.next()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.KnuthPossPosIter.next()`

## org.apache.fop.layoutmgr.KnuthSequence

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.KnuthSequence.getFirstBoxIndex()`

## org.apache.fop.layoutmgr.LMiter

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.apache.fop.layoutmgr.LMiter.add(java.lang.Object)`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.apache.fop.layoutmgr.LMiter.set(java.lang.Object)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.LMiter.next()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.LMiter.next()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.LMiter.previous()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.LMiter.previous()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.layoutmgr.LMiter.next()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.LMiter.next()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.layoutmgr.LMiter.previous()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.LMiter.previous()`

## org.apache.fop.layoutmgr.LayoutContext

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.layoutmgr.LayoutContext`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.layoutmgr.LayoutContext`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.layoutmgr.LayoutContext.<init>(int)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.layoutmgr.LayoutContext.<init>(org.apache.fop.layoutmgr.LayoutContext)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.LayoutContext.CHECK_REF_AREA`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.LayoutContext.IPD_UNKNOWN`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.LayoutContext.LINEBREAK_AT_LF_ONLY`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.LayoutContext.TRY_HYPHENATE`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.addPendingAfterMark(org.apache.fop.layoutmgr.UnresolvedListElementWithLength)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.addPendingBeforeMark(org.apache.fop.layoutmgr.UnresolvedListElementWithLength)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.clearKeepWithNextPending()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.clearKeepWithPreviousPending()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.clearKeepsPending()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.clearPendingMarks()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.copyPendingMarksFrom(org.apache.fop.layoutmgr.LayoutContext)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.getAlignmentContext()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.getBPAlignment()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.getBreakAfter()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.getBreakBefore()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.getCurrentSpan()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.getDisableColumnBalancing()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.getHyphContext()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.getIPDAdjust()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.getKeepWithNextPending()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.getKeepWithPreviousPending()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.getLeadingSpace()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.getLineEndBorderAndPaddingWidth()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.getLineStartBorderAndPaddingWidth()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.getNextSpan()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.getPendingAfterMarks()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.getPendingBeforeMarks()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.getRefIPD()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.getSpaceAdjust()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.getSpaceAfter()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.getSpaceBefore()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.getStackLimitBP()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.getTrailingSpace()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.getWritingMode()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.isFirstArea()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.isKeepWithNextPending()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.isKeepWithPreviousPending()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.isLastArea()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.isStart()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.resetAlignmentContext()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.resolveLeadingSpace()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.setAlignmentContext(org.apache.fop.layoutmgr.inline.AlignmentContext)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.setBPAlignment(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.setBreakAfter(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.setBreakBefore(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.setDisableColumnBalancing(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.setFlags(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.setFlags(int,boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.setHyphContext(org.apache.fop.layoutmgr.inline.HyphContext)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.setIPDAdjust(double)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.setLeadingSpace(org.apache.fop.layoutmgr.SpaceSpecifier)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.setLineEndBorderAndPaddingWidth(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.setLineStartBorderAndPaddingWidth(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.setRefIPD(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.setSpaceAdjust(double)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.setSpaceAfter(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.setSpaceBefore(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.setStackLimitBP(org.apache.fop.traits.MinOptMax)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.setTrailingSpace(org.apache.fop.layoutmgr.SpaceSpecifier)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.signalSpanChange(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.startsNewArea()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.suppressBreakBefore()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.toString()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.unsetFlags(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.updateKeepWithNextPending(org.apache.fop.layoutmgr.Keep)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.LayoutContext.updateKeepWithPreviousPending(org.apache.fop.layoutmgr.Keep)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.LayoutContext.setWritingMode(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.LayoutContext.tryHyphenate()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.LayoutContext.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.LayoutContext.getWritingMode()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.layoutmgr.LayoutContext.getWritingMode()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.LayoutContext.getWritingMode()`

## org.apache.fop.layoutmgr.LayoutException$LayoutExceptionFactory

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.LayoutException$LayoutExceptionFactory.getExceptionClass()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.LayoutException$LayoutExceptionFactory.getExceptionClass()`

## org.apache.fop.layoutmgr.LayoutManager

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.layoutmgr.LayoutManager`
+ MUST NOW IMPLEMENT: `org.apache.fop.layoutmgr.LayoutManager.getBaselineOffset()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.layoutmgr.LayoutManager`
+ MUST NOW IMPLEMENT: `org.apache.fop.layoutmgr.LayoutManager.hasLineAreaDescendant()`

## org.apache.fop.layoutmgr.LayoutManagerMapping

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.LayoutManagerMapping.log`

## org.apache.fop.layoutmgr.LayoutManagerMapping$BidiOverrideLayoutManagerMaker

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.LayoutManagerMapping$BidiOverrideLayoutManagerMaker.make(org.apache.fop.fo.flow.BidiOverride,java.util.List)`

## org.apache.fop.layoutmgr.LayoutManagerMapping$FootnodeLayoutManagerMaker

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.layoutmgr.LayoutManagerMapping$FootnodeLayoutManagerMaker`

## org.apache.fop.layoutmgr.LeafPosition

### METHOD_NOW_PROTECTED [binary ✗ | source ✗]
- METHOD (now protected, was public): `org.apache.fop.layoutmgr.Position.getShortLMName()`

## org.apache.fop.layoutmgr.NonLeafPosition

### METHOD_NOW_PROTECTED [binary ✗ | source ✗]
- METHOD (now protected, was public): `org.apache.fop.layoutmgr.Position.getShortLMName()`

## org.apache.fop.layoutmgr.PaddingElement

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.layoutmgr.UnresolvedListElementWithLength.log`

## org.apache.fop.layoutmgr.Page

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.layoutmgr.Page.<init>(org.apache.fop.fo.pagination.SimplePageMaster,int,java.lang.String,boolean)`

## org.apache.fop.layoutmgr.PageBreaker

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.layoutmgr.AbstractBreaker.log`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractBreaker.doLayout(int,boolean)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractBreaker.doLayout(int,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.PageBreaker.getCurrentChildLM()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.PageBreaker.getCurrentChildLM()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.layoutmgr.AbstractBreaker.doLayout(int,boolean)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractBreaker.doLayout(int,boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.layoutmgr.PageBreaker.getCurrentChildLM()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.PageBreaker.getCurrentChildLM()`

## org.apache.fop.layoutmgr.PageProvider

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.PageProvider.setStartOfNextElementList(int,int)`

## org.apache.fop.layoutmgr.PageSequenceLayoutManager

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractPageSequenceLayoutManager.makeNewPage(boolean,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.Position

### METHOD_NOW_PROTECTED [binary ✗ | source ✗]
- METHOD (now protected, was public): `org.apache.fop.layoutmgr.Position.getShortLMName()`

## org.apache.fop.layoutmgr.PositionIterator

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.PositionIterator.next()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.PositionIterator.next()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.layoutmgr.PositionIterator.next()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.PositionIterator.next()`

## org.apache.fop.layoutmgr.SpaceElement

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.layoutmgr.UnresolvedListElementWithLength.log`

## org.apache.fop.layoutmgr.SpaceResolver$SpaceHandlingBreakPosition

### METHOD_NOW_PROTECTED [binary ✗ | source ✗]
- METHOD (now protected, was public): `org.apache.fop.layoutmgr.Position.getShortLMName()`

## org.apache.fop.layoutmgr.SpaceResolver$SpaceHandlingPosition

### METHOD_NOW_PROTECTED [binary ✗ | source ✗]
- METHOD (now protected, was public): `org.apache.fop.layoutmgr.Position.getShortLMName()`

## org.apache.fop.layoutmgr.StaticContentLayoutManager

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.layoutmgr.BlockStackingLayoutManager.addInBetweenBreak(java.util.List,org.apache.fop.layoutmgr.LayoutContext,org.apache.fop.layoutmgr.LayoutContext)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.BlockStackingLayoutManager.createUnitElements(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.TraitSetter

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.layoutmgr.TraitSetter`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.layoutmgr.TraitSetter`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.layoutmgr.TraitSetter.<init>()`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.TraitSetter.log`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.TraitSetter.addBackground(org.apache.fop.area.Area,org.apache.fop.fo.properties.CommonBorderPaddingBackground,org.apache.fop.datatypes.PercentBaseContext)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.TraitSetter.addBackground(org.apache.fop.area.Area,org.apache.fop.fo.properties.CommonBorderPaddingBackground,org.apache.fop.datatypes.PercentBaseContext,int,int,int,int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.TraitSetter.addBorders(org.apache.fop.area.Area,org.apache.fop.fo.properties.CommonBorderPaddingBackground,boolean,boolean,boolean,boolean,org.apache.fop.datatypes.PercentBaseContext)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.TraitSetter.addBorders(org.apache.fop.area.Area,org.apache.fop.fo.properties.CommonBorderPaddingBackground,org.apache.fop.datatypes.PercentBaseContext)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.TraitSetter.addBreaks(org.apache.fop.area.Area,int,int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.TraitSetter.addCollapsingBorders(org.apache.fop.area.Area,org.apache.fop.fo.properties.CommonBorderPaddingBackground$BorderInfo,org.apache.fop.fo.properties.CommonBorderPaddingBackground$BorderInfo,org.apache.fop.fo.properties.CommonBorderPaddingBackground$BorderInfo,org.apache.fop.fo.properties.CommonBorderPaddingBackground$BorderInfo,boolean[])`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.TraitSetter.addFontTraits(org.apache.fop.area.Area,org.apache.fop.fonts.Font)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.TraitSetter.addMargins(org.apache.fop.area.Area,org.apache.fop.fo.properties.CommonBorderPaddingBackground,int,int,org.apache.fop.datatypes.PercentBaseContext)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.TraitSetter.addMargins(org.apache.fop.area.Area,org.apache.fop.fo.properties.CommonBorderPaddingBackground,org.apache.fop.fo.properties.CommonMarginBlock,org.apache.fop.datatypes.PercentBaseContext)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.TraitSetter.addPadding(org.apache.fop.area.Area,org.apache.fop.fo.properties.CommonBorderPaddingBackground,boolean,boolean,boolean,boolean,org.apache.fop.datatypes.PercentBaseContext)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.TraitSetter.addSpaceBeforeAfter(org.apache.fop.area.Area,double,org.apache.fop.traits.MinOptMax,org.apache.fop.traits.MinOptMax)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.TraitSetter.addTextDecoration(org.apache.fop.area.Area,org.apache.fop.fo.properties.CommonTextDecoration)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.TraitSetter.getEffectiveSpace(double,org.apache.fop.traits.MinOptMax)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.TraitSetter.setBorderPaddingTraits(org.apache.fop.area.Area,org.apache.fop.fo.properties.CommonBorderPaddingBackground,boolean,boolean,org.apache.fop.datatypes.PercentBaseContext)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.TraitSetter.setProducerID(org.apache.fop.area.Area,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.TraitSetter.addPtr(org.apache.fop.area.Area,java.lang.String)`

## org.apache.fop.layoutmgr.UnresolvedListElementWithLength

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.layoutmgr.UnresolvedListElementWithLength.log`

## org.apache.fop.layoutmgr.inline.AbstractGraphicsLayoutManager

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.isSomethingChanged`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.getEffectiveArea()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.removeWordSpace(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.inline.AbstractPageNumberCitationLayoutManager

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.layoutmgr.inline.AbstractPageNumberCitationLayoutManager.fobj`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.inline.AbstractPageNumberCitationLayoutManager.resolved`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.isSomethingChanged`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.fop.layoutmgr.inline.AbstractPageNumberCitationLayoutManager.fobj`
+ NEW FIELD: `org.apache.fop.layoutmgr.AbstractBaseLayoutManager.fobj`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.fop.layoutmgr.inline.AbstractPageNumberCitationLayoutManager.fobj`
+ NEW FIELD: `org.apache.fop.layoutmgr.AbstractBaseLayoutManager.fobj`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.AbstractPageNumberCitationLayoutManager.getStringWidth(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.AbstractPageNumberCitationLayoutManager.updateTextAreaTraits(org.apache.fop.area.inline.TextArea)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.getEffectiveArea()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.removeWordSpace(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.layoutmgr.inline.AbstractPageNumberCitationLayoutManager`
+ MUST NOW IMPLEMENT: `org.apache.fop.layoutmgr.inline.AbstractPageNumberCitationLayoutManager.getReferenceType()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.layoutmgr.inline.AbstractPageNumberCitationLayoutManager`
+ MUST NOW IMPLEMENT: `org.apache.fop.layoutmgr.inline.AbstractPageNumberCitationLayoutManager.getCitedPage()`

## org.apache.fop.layoutmgr.inline.AlignmentContext

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.layoutmgr.inline.AlignmentContext`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.layoutmgr.inline.AlignmentContext`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.layoutmgr.inline.AlignmentContext.<init>(int,org.apache.fop.datatypes.Length,int,org.apache.fop.datatypes.Length,int,org.apache.fop.layoutmgr.inline.AlignmentContext)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.layoutmgr.inline.AlignmentContext.<init>(org.apache.fop.fonts.Font,int,int)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.layoutmgr.inline.AlignmentContext.<init>(org.apache.fop.fonts.Font,int,org.apache.fop.datatypes.Length,int,org.apache.fop.datatypes.Length,int,org.apache.fop.layoutmgr.inline.AlignmentContext)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.inline.AlignmentContext.getAlignmentBaselineIdentifier()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.inline.AlignmentContext.getAlignmentPoint()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.inline.AlignmentContext.getAltitude()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.inline.AlignmentContext.getBaselineShiftValue()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.inline.AlignmentContext.getDepth()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.inline.AlignmentContext.getDominantBaselineIdentifier()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.inline.AlignmentContext.getHeight()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.inline.AlignmentContext.getOffset()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.inline.AlignmentContext.getParentAlignmentContext()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.inline.AlignmentContext.getTotalAlignmentBaselineOffset()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.inline.AlignmentContext.resizeLine(int,int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.inline.AlignmentContext.toString()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.inline.AlignmentContext.usesInitialBaselineTable()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.AlignmentContext.getActualBaselineOffset(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.AlignmentContext.getBaselineOffset()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.AlignmentContext.getLineHeight()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.AlignmentContext.getScaledBaselineTable()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.AlignmentContext.getTotalAlignmentBaselineOffset(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.AlignmentContext.getTotalBaselineOffset()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.AlignmentContext.getWritingMode()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.AlignmentContext.getXHeight()`

## org.apache.fop.layoutmgr.inline.BasicLinkLayoutManager

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.InlineStackingLayoutManager.removeWordSpace(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.inline.BasicScaledBaselineTable

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.layoutmgr.inline.BasicScaledBaselineTable`

## org.apache.fop.layoutmgr.inline.BidiLayoutManager

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.layoutmgr.inline.BidiLayoutManager.<init>(org.apache.fop.fo.flow.BidiOverride,org.apache.fop.layoutmgr.inline.InlineLayoutManager)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.alignmentContext`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.areaInfo`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.commonBorderPaddingBackground`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.curArea`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.isSomethingChanged`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.log`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.BidiLayoutManager.get(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.BidiLayoutManager.size()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.get(org.apache.fop.layoutmgr.LayoutContext)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.getAllocationIPD(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.getEffectiveArea()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.makeAlignmentContext(org.apache.fop.layoutmgr.LayoutContext)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.offsetArea(org.apache.fop.area.inline.InlineArea,org.apache.fop.layoutmgr.LayoutContext)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.removeWordSpace(java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.resolved()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.setCommonBorderPaddingBackground(org.apache.fop.fo.properties.CommonBorderPaddingBackground)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.setCurrentArea(org.apache.fop.area.inline.InlineArea)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.widthAdjustArea(org.apache.fop.area.inline.InlineArea,org.apache.fop.layoutmgr.LayoutContext)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.layoutmgr.inline.BidiLayoutManager`

## org.apache.fop.layoutmgr.inline.CharacterLayoutManager

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.isSomethingChanged`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.getEffectiveArea()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.removeWordSpace(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.inline.ContentLayoutManager

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.ContentLayoutManager.fillArea(org.apache.fop.layoutmgr.LayoutManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.ContentLayoutManager.removeWordSpace(java.util.List)`

## org.apache.fop.layoutmgr.inline.ExternalGraphicLayoutManager

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.isSomethingChanged`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.getEffectiveArea()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.removeWordSpace(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.inline.FootnoteLayoutManager

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.InlineStackingLayoutManager.removeWordSpace(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.inline.ICLayoutManager

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.layoutmgr.inline.ICLayoutManager`

## org.apache.fop.layoutmgr.inline.ImageLayout

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.layoutmgr.inline.ImageLayout.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

## org.apache.fop.layoutmgr.inline.InlineLayoutManager

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.InlineStackingLayoutManager.removeWordSpace(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.inline.InlineLevelEventProducer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.InlineLevelEventProducer.lineOverflows(java.lang.Object,int,int,org.xml.sax.Locator)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.layoutmgr.inline.InlineLevelEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.layoutmgr.inline.InlineLevelEventProducer.inlineContainerAutoIPDNotSupported(java.lang.Object,float)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.layoutmgr.inline.InlineLevelEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.layoutmgr.inline.InlineLevelEventProducer.lineOverflows(java.lang.Object,java.lang.String,int,int,org.xml.sax.Locator)`

## org.apache.fop.layoutmgr.inline.InlineLevelEventProducer$Provider

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.layoutmgr.inline.InlineLevelEventProducer$Provider`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.layoutmgr.inline.InlineLevelEventProducer$Provider`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.layoutmgr.inline.InlineLevelEventProducer$Provider.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.layoutmgr.inline.InlineLevelEventProducer$Provider.get(org.apache.fop.events.EventBroadcaster)`

## org.apache.fop.layoutmgr.inline.InlineLevelLayoutManager

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.InlineLevelLayoutManager.removeWordSpace(java.util.List)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.layoutmgr.inline.InlineLevelLayoutManager`
+ MUST NOW IMPLEMENT: `org.apache.fop.layoutmgr.inline.InlineLevelLayoutManager.applyChanges(java.util.List,int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.layoutmgr.inline.InlineLevelLayoutManager`
+ MUST NOW IMPLEMENT: `org.apache.fop.layoutmgr.inline.InlineLevelLayoutManager.addALetterSpaceTo(java.util.List,int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.layoutmgr.inline.InlineLevelLayoutManager`
+ MUST NOW IMPLEMENT: `org.apache.fop.layoutmgr.inline.InlineLevelLayoutManager.getChangedKnuthElements(java.util.List,int,int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.layoutmgr.inline.InlineLevelLayoutManager`
+ MUST NOW IMPLEMENT: `org.apache.fop.layoutmgr.LayoutManager.getBaselineOffset()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.layoutmgr.inline.InlineLevelLayoutManager`
+ MUST NOW IMPLEMENT: `org.apache.fop.layoutmgr.LayoutManager.hasLineAreaDescendant()`

## org.apache.fop.layoutmgr.inline.InlineStackingLayoutManager

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.InlineStackingLayoutManager.removeWordSpace(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.inline.InlineStackingLayoutManager$StackingIter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.layoutmgr.inline.InlineStackingLayoutManager$StackingIter`

## org.apache.fop.layoutmgr.inline.InstreamForeignObjectLM

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.isSomethingChanged`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.getEffectiveArea()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.removeWordSpace(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.inline.LeaderLayoutManager

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.isSomethingChanged`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.getEffectiveArea()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.removeWordSpace(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.isSomethingChanged`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.getEffectiveArea()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.removeWordSpace(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager$AreaInfo

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager$AreaInfo.bHyphenated`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager$AreaInfo.iLScount`

## org.apache.fop.layoutmgr.inline.LineLayoutManager

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.InlineStackingLayoutManager.removeWordSpace(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.inline.LineLayoutPossibilities

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.inline.LineLayoutPossibilities.log`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LineLayoutPossibilities.addBreakPosition(org.apache.fop.layoutmgr.Position,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.inline.LineLayoutPossibilities.getChosenPosition(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.inline.LineLayoutPossibilities.getChosenPosition(int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.layoutmgr.inline.LineLayoutPossibilities.getChosenPosition(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.inline.LineLayoutPossibilities.getChosenPosition(int)`

## org.apache.fop.layoutmgr.inline.PageNumberCitationLastLayoutManager

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.layoutmgr.inline.AbstractPageNumberCitationLayoutManager.fobj`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.inline.AbstractPageNumberCitationLayoutManager.resolved`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.isSomethingChanged`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.fop.layoutmgr.inline.AbstractPageNumberCitationLayoutManager.fobj`
+ NEW FIELD: `org.apache.fop.layoutmgr.AbstractBaseLayoutManager.fobj`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.fop.layoutmgr.inline.AbstractPageNumberCitationLayoutManager.fobj`
+ NEW FIELD: `org.apache.fop.layoutmgr.AbstractBaseLayoutManager.fobj`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.AbstractPageNumberCitationLayoutManager.getStringWidth(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.AbstractPageNumberCitationLayoutManager.updateTextAreaTraits(org.apache.fop.area.inline.TextArea)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.getEffectiveArea()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.removeWordSpace(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.inline.PageNumberCitationLayoutManager

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.layoutmgr.inline.AbstractPageNumberCitationLayoutManager.fobj`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.inline.AbstractPageNumberCitationLayoutManager.resolved`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.isSomethingChanged`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.fop.layoutmgr.inline.AbstractPageNumberCitationLayoutManager.fobj`
+ NEW FIELD: `org.apache.fop.layoutmgr.AbstractBaseLayoutManager.fobj`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.fop.layoutmgr.inline.AbstractPageNumberCitationLayoutManager.fobj`
+ NEW FIELD: `org.apache.fop.layoutmgr.AbstractBaseLayoutManager.fobj`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.AbstractPageNumberCitationLayoutManager.getStringWidth(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.AbstractPageNumberCitationLayoutManager.updateTextAreaTraits(org.apache.fop.area.inline.TextArea)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.getEffectiveArea()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.removeWordSpace(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.inline.PageNumberLayoutManager

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.isSomethingChanged`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.removeWordSpace(java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.PageNumberLayoutManager.getEffectiveArea()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.inline.ScaledBaselineTable

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.layoutmgr.inline.ScaledBaselineTable`

## org.apache.fop.layoutmgr.inline.ScaledBaselineTableFactory

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.layoutmgr.inline.ScaledBaselineTableFactory`

## org.apache.fop.layoutmgr.inline.TextLayoutManager

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.isSomethingChanged`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.getEffectiveArea()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.TextLayoutManager.removeWordSpace(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.inline.WrapperLayoutManager

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.isSomethingChanged`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.getEffectiveArea()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.inline.LeafNodeLayoutManager.removeWordSpace(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.list.ListBlockLayoutManager

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.layoutmgr.BlockStackingLayoutManager.addInBetweenBreak(java.util.List,org.apache.fop.layoutmgr.LayoutContext,org.apache.fop.layoutmgr.LayoutContext)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.BlockStackingLayoutManager.createUnitElements(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.list.ListItemContentLayoutManager

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.layoutmgr.BlockStackingLayoutManager.addInBetweenBreak(java.util.List,org.apache.fop.layoutmgr.LayoutContext,org.apache.fop.layoutmgr.LayoutContext)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.BlockStackingLayoutManager.createUnitElements(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.list.ListItemLayoutManager

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.layoutmgr.BlockStackingLayoutManager.addInBetweenBreak(java.util.List,org.apache.fop.layoutmgr.LayoutContext,org.apache.fop.layoutmgr.LayoutContext)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.BlockStackingLayoutManager.createUnitElements(java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.list.ListItemLayoutManager.getListItemHeight()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.table.ColumnSetup

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.table.ColumnSetup.getXOffset(int,org.apache.fop.datatypes.PercentBaseContext)`

## org.apache.fop.layoutmgr.table.TableAndCaptionLayoutManager

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.layoutmgr.BlockStackingLayoutManager.addInBetweenBreak(java.util.List,org.apache.fop.layoutmgr.LayoutContext,org.apache.fop.layoutmgr.LayoutContext)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.BlockStackingLayoutManager.createUnitElements(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.table.TableCaptionLayoutManager

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.layoutmgr.BlockStackingLayoutManager.addInBetweenBreak(java.util.List,org.apache.fop.layoutmgr.LayoutContext,org.apache.fop.layoutmgr.LayoutContext)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.BlockStackingLayoutManager.createUnitElements(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.table.TableCellLayoutManager

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.layoutmgr.BlockStackingLayoutManager.addInBetweenBreak(java.util.List,org.apache.fop.layoutmgr.LayoutContext,org.apache.fop.layoutmgr.LayoutContext)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.BlockStackingLayoutManager.createUnitElements(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.table.TableContentLayoutManager

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.table.TableContentLayoutManager.getNextKnuthElements(org.apache.fop.layoutmgr.LayoutContext,int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.table.TableContentLayoutManager.getNextKnuthElements(org.apache.fop.layoutmgr.LayoutContext,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.layoutmgr.table.TableContentLayoutManager.getNextKnuthElements(org.apache.fop.layoutmgr.LayoutContext,int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.table.TableContentLayoutManager.getNextKnuthElements(org.apache.fop.layoutmgr.LayoutContext,int)`

## org.apache.fop.layoutmgr.table.TableLayoutManager

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.layoutmgr.BlockStackingLayoutManager.addInBetweenBreak(java.util.List,org.apache.fop.layoutmgr.LayoutContext,org.apache.fop.layoutmgr.LayoutContext)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.AbstractLayoutManager.addMarkersToPage(boolean,boolean,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.layoutmgr.BlockStackingLayoutManager.createUnitElements(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.createChildLMs(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`
+ NEW RETURN TYPE: `org.apache.fop.layoutmgr.AbstractLayoutManager.getChildLMs()`

## org.apache.fop.layoutmgr.table.TableRowIterator

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.layoutmgr.table.TableRowIterator.table`

## org.apache.fop.pdf.AbstractPDFFontStream

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDictionary.entries`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDictionary.order`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.put(java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.pdf.AbstractPDFFontStream`

## org.apache.fop.pdf.AbstractPDFStream

### CONSTRUCTOR_NOW_PROTECTED [binary ✗ | source ✗]
- CONSTRUCTOR (now protected, was public): `org.apache.fop.pdf.AbstractPDFStream.<init>()`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDictionary.entries`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDictionary.order`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.put(java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.pdf.AbstractPDFStream`

## org.apache.fop.pdf.BitmapImage

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.pdf.BitmapImage.<init>(java.lang.String,int,int,byte[],java.lang.String)`

## org.apache.fop.pdf.PDFAMode

### TYPE_KIND_CHANGED [binary ✗ | source ✗]
- TYPE (kind changed): `org.apache.fop.pdf.PDFAMode`

## org.apache.fop.pdf.PDFAction

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFAnnotList

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFArray

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.pdf.PDFArray.<init>(org.apache.fop.pdf.PDFObject,java.util.Collection)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFCIDFont

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFCIDFontDescriptor

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFCIDSystemInfo

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFCMap

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDictionary.entries`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDictionary.order`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.put(java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.pdf.PDFCMap`

## org.apache.fop.pdf.PDFCharProcs

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFColor

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.pdf.PDFColor.<init>(org.apache.fop.pdf.PDFDocument,java.awt.Color)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFDestination

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFDests

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFDictionary

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFDocument

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDocument.PDF_VERSION_1_3`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDocument.PDF_VERSION_1_4`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.pdf.PDFDocument.setFilterMap(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDocument.enforceLanguageOnRoot()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDocument.getDests()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDocument.getIDEntry()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDocument.getWriterFor(java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDocument.isEncodingOnTheFly()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDocument.resolveURI(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFDocument.getDestinationList()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFDocument.getDestinationList()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFDocument.getFilterMap()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFDocument.getFilterMap()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFDocument.getFontMap()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFDocument.getFontMap()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFDocument.getPDFVersion()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFDocument.getPDFVersion()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFDocument.getPDFVersion()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFDocument.getPDFVersion()`

## org.apache.fop.pdf.PDFEncoding

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFEncoding$DifferencesBuilder

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFEncoding$DifferencesBuilder.addDifference(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFEncoding$DifferencesBuilder.addName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFEncoding$DifferencesBuilder.hasDifferences()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFEncoding$DifferencesBuilder.toPDFArray()`

## org.apache.fop.pdf.PDFEncryption

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFEncryption.getParams()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFEncryption.setParams(org.apache.fop.pdf.PDFEncryptionParams)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.pdf.PDFEncryption`
+ MUST NOW IMPLEMENT: `org.apache.fop.pdf.PDFEncryption.getPDFVersion()`

## org.apache.fop.pdf.PDFEncryptionJCE

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.pdf.PDFEncryptionJCE`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.pdf.PDFEncryptionJCE`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.pdf.PDFEncryptionJCE.<init>(int)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFEncryptionJCE.PERMISSION_COPY_CONTENT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFEncryptionJCE.PERMISSION_EDIT_ANNOTATIONS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFEncryptionJCE.PERMISSION_EDIT_CONTENT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFEncryptionJCE.PERMISSION_PRINT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.log`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.pdf.PDFEncryptionJCE.applyFilter(org.apache.fop.pdf.AbstractPDFStream)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.pdf.PDFEncryptionJCE.encrypt(byte[],org.apache.fop.pdf.PDFObject)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.pdf.PDFEncryptionJCE.getTrailerEntry()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.pdf.PDFEncryptionJCE.toPDF()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.pdf.PDFObject.getGeneration()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.pdf.PDFObject.getObjectID()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.pdf.PDFObject.getParent()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.pdf.PDFObject.hasObjectNumber()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.pdf.PDFObject.makeReference()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.pdf.PDFObject.output(java.io.OutputStream)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.pdf.PDFObject.referencePDF()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.pdf.PDFObject.setDocument(org.apache.fop.pdf.PDFDocument)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.pdf.PDFObject.setObjectNumber(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.pdf.PDFObject.setParent(org.apache.fop.pdf.PDFObject)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFEncryptionJCE.encryptData(byte[],int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFEncryptionJCE.getFileID()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFEncryptionJCE.getFileID(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFEncryptionJCE.getParams()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFEncryptionJCE.init()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFEncryptionJCE.make(int,org.apache.fop.pdf.PDFEncryptionParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFEncryptionJCE.makeFilter(int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFEncryptionJCE.setParams(org.apache.fop.pdf.PDFEncryptionParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.contentEquals(org.apache.fop.pdf.PDFObject)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.encodeBinaryToHexString(byte[],java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.encodeString(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.encodeText(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.toPDFString()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFEncryptionManager

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.pdf.PDFEncryptionManager`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.pdf.PDFEncryptionManager`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.pdf.PDFEncryptionManager.<init>()`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFEncryptionManager.log`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.pdf.PDFEncryptionManager.checkAvailableAlgorithms()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.pdf.PDFEncryptionManager.isJCEAvailable()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.pdf.PDFEncryptionManager.setupPDFEncryption(org.apache.fop.pdf.PDFEncryptionParams,org.apache.fop.pdf.PDFDocument)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFEncryptionManager.newInstance(int,org.apache.fop.pdf.PDFEncryptionParams)`

## org.apache.fop.pdf.PDFEncryptionParams

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.pdf.PDFEncryptionParams.<init>(java.lang.String,java.lang.String,boolean,boolean,boolean,boolean)`

## org.apache.fop.pdf.PDFFactory

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFFactory.getSubsetWidths(org.apache.fop.fonts.CIDFont)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFFactory.makeFontDescriptor(org.apache.fop.fonts.FontDescriptor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFFactory.makeFontFile(org.apache.fop.fonts.FontDescriptor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFFactory.makeFunction(int,int,java.util.List,java.util.List,java.lang.StringBuffer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFFactory.makeFunction(int,java.util.List,java.util.List,java.util.List,int,int,java.util.List,java.util.List,java.lang.StringBuffer,java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFFactory.makeFunction(int,java.util.List,java.util.List,java.util.List,java.util.List,double)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFFactory.makeFunction(int,java.util.List,java.util.List,java.util.List,java.util.List,java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFFactory.makeGradient(org.apache.fop.pdf.PDFResourceContext,boolean,org.apache.fop.pdf.PDFDeviceColorSpace,java.util.List,java.util.List,java.util.List,java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFFactory.makeOutline(org.apache.fop.pdf.PDFOutline,java.lang.String,java.lang.String,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFFactory.makePattern(org.apache.fop.pdf.PDFResourceContext,int,org.apache.fop.pdf.PDFShading,java.util.List,java.lang.StringBuffer,java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFFactory.makeShading(org.apache.fop.pdf.PDFResourceContext,int,org.apache.fop.pdf.PDFDeviceColorSpace,java.util.List,java.util.List,boolean,int,int,int,java.util.List,org.apache.fop.pdf.PDFFunction)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFFactory.makeShading(org.apache.fop.pdf.PDFResourceContext,int,org.apache.fop.pdf.PDFDeviceColorSpace,java.util.List,java.util.List,boolean,int,int,java.util.List,int,org.apache.fop.pdf.PDFFunction)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFFactory.makeShading(org.apache.fop.pdf.PDFResourceContext,int,org.apache.fop.pdf.PDFDeviceColorSpace,java.util.List,java.util.List,boolean,java.util.List,java.util.List,org.apache.fop.pdf.PDFFunction)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFFactory.makeShading(org.apache.fop.pdf.PDFResourceContext,int,org.apache.fop.pdf.PDFDeviceColorSpace,java.util.List,java.util.List,boolean,java.util.List,java.util.List,org.apache.fop.pdf.PDFFunction,java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFFactory.makeStructTreeRoot(org.apache.fop.pdf.PDFParentTree)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFFactory.makeStructureElement(org.apache.fop.pdf.PDFName,org.apache.fop.pdf.PDFObject)`

## org.apache.fop.pdf.PDFFileSpec

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFFileSpec.filename`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_NOW_PROTECTED [binary ✗ | source ✗]
- METHOD (now protected, was public): `org.apache.fop.pdf.PDFFileSpec.toPDFString()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFFont

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFFontDescriptor

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFFontNonBase14

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFFontTrueType

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFFontType0

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFFontType1

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFFontType3

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFFormXObject

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDictionary.entries`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDictionary.order`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.put(java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.pdf.PDFFormXObject`

## org.apache.fop.pdf.PDFFunction

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.pdf.PDFFunction.<init>(int,java.util.List,java.util.List,java.lang.StringBuffer)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.pdf.PDFFunction.<init>(int,java.util.List,java.util.List,java.util.List,int,int,java.util.List,java.util.List,java.lang.StringBuffer,java.util.List)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.pdf.PDFFunction.<init>(int,java.util.List,java.util.List,java.util.List,java.util.List,double)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.pdf.PDFFunction.<init>(int,java.util.List,java.util.List,java.util.List,java.util.List,java.util.List)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFFunction.bitsPerSample`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFFunction.bounds`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFFunction.cOne`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFFunction.cZero`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFFunction.decode`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFFunction.domain`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFFunction.encode`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFFunction.filter`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFFunction.functionDataStream`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFFunction.functionType`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFFunction.functions`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFFunction.interpolationExponentN`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFFunction.order`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFFunction.range`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFFunction.size`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFGState

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFGoTo

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFGoTo.setPageReference(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFGoToRemote

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFICCBasedColorSpace

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFICCStream

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDictionary.entries`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDictionary.order`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.put(java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.pdf.PDFICCStream`

## org.apache.fop.pdf.PDFImage

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.pdf.PDFImage`
+ MUST NOW IMPLEMENT: `org.apache.fop.pdf.PDFImage.multipleFiltersAllowed()`

## org.apache.fop.pdf.PDFImageXObject

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDictionary.entries`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDictionary.order`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.put(java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.pdf.PDFImageXObject`

## org.apache.fop.pdf.PDFInfo

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFInternalLink

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFLaunch

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFLink

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFMetadata

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDictionary.entries`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDictionary.order`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.put(java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.pdf.PDFMetadata`

## org.apache.fop.pdf.PDFName

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFName.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFNameTreeNode

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFNames

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFNull

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFNull.outputInline(java.io.OutputStream,java.io.Writer)`

## org.apache.fop.pdf.PDFNumber

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFNumberTreeNode

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFNumsArray

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFObject

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFOutline

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.pdf.PDFOutline.<init>(java.lang.String,java.lang.String,boolean)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFOutputIntent

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFPage

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFPage.setContents(org.apache.fop.pdf.PDFStream)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFPageLabels

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFPages

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.pdf.PDFPages.<init>(int)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFPaintingState

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.util.AbstractPaintingState.saveAll(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.util.AbstractPaintingState.getStateStack()`
+ NEW RETURN TYPE: `org.apache.fop.util.AbstractPaintingState.getStateStack()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.util.AbstractPaintingState.restoreAll()`
+ NEW RETURN TYPE: `org.apache.fop.util.AbstractPaintingState.restoreAll()`

## org.apache.fop.pdf.PDFParentTree

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFPathPaint

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFPattern

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFRectangle

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFRectangle.outputInline(java.io.OutputStream,java.io.Writer)`

## org.apache.fop.pdf.PDFReference

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFReference.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFReference.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFReference.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFReference.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFReference.getObjectNumber()`

## org.apache.fop.pdf.PDFResourceContext

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFResources

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.pdf.PDFResources.<init>(int)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFResources.gstates`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFResources.patterns`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFResources.shadings`

### METHOD_NOW_PROTECTED [binary ✗ | source ✗]
- METHOD (now protected, was public): `org.apache.fop.pdf.PDFResources.toPDFString()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFResources.addColorSpace(org.apache.fop.pdf.PDFICCBasedColorSpace)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFResources.addGState(org.apache.fop.pdf.PDFGState)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFResources.addPattern(org.apache.fop.pdf.PDFPattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFResources.addShading(org.apache.fop.pdf.PDFShading)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFResources.getColorSpace(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFRoot

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.pdf.PDFRoot.<init>(int,org.apache.fop.pdf.PDFPages)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFRoot.setLanguage(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFShading

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.pdf.PDFShading.<init>(int,org.apache.fop.pdf.PDFDeviceColorSpace,java.util.List,java.util.List,boolean,int,int,int,java.util.List,org.apache.fop.pdf.PDFFunction)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.pdf.PDFShading.<init>(int,org.apache.fop.pdf.PDFDeviceColorSpace,java.util.List,java.util.List,boolean,int,int,java.util.List,int,org.apache.fop.pdf.PDFFunction)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.pdf.PDFShading.<init>(int,org.apache.fop.pdf.PDFDeviceColorSpace,java.util.List,java.util.List,boolean,java.util.List,java.util.List,org.apache.fop.pdf.PDFFunction)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.pdf.PDFShading.<init>(int,org.apache.fop.pdf.PDFDeviceColorSpace,java.util.List,java.util.List,boolean,java.util.List,java.util.List,org.apache.fop.pdf.PDFFunction,java.util.List)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFShading.antiAlias`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFShading.bBox`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFShading.background`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFShading.bitsPerComponent`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFShading.bitsPerCoordinate`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFShading.bitsPerFlag`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFShading.colorSpace`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFShading.coords`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFShading.decode`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFShading.domain`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFShading.extend`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFShading.function`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFShading.matrix`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFShading.shadingType`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFShading.verticesPerRow`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFStream

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDictionary.entries`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDictionary.order`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.put(java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.pdf.PDFStream`

## org.apache.fop.pdf.PDFStructElem

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFStructElem.getStructureType()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFStructElem.getStructureType()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFStructElem.getStructureType()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFStructElem.getStructureType()`

## org.apache.fop.pdf.PDFStructTreeRoot

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFT1Stream

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDictionary.entries`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDictionary.order`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.put(java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.pdf.PDFT1Stream`

## org.apache.fop.pdf.PDFTTFStream

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDictionary.entries`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDictionary.order`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.put(java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.pdf.PDFTTFStream`

## org.apache.fop.pdf.PDFText

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFTextUtil

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFTextUtil.restoreGraphicsState()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFTextUtil.saveGraphicsState()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.pdf.PDFTextUtil`
+ MUST NOW IMPLEMENT: `org.apache.fop.pdf.PDFTextUtil.write(java.lang.StringBuffer)`

## org.apache.fop.pdf.PDFToUnicodeCMap

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDictionary.entries`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDictionary.order`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.put(java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.pdf.PDFToUnicodeCMap`

## org.apache.fop.pdf.PDFUri

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.pdf.PDFWritable

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFWritable.outputInline(java.io.OutputStream,java.io.Writer)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.pdf.PDFWritable`
+ MUST NOW IMPLEMENT: `org.apache.fop.pdf.PDFWritable.outputInline(java.io.OutputStream,java.lang.StringBuilder)`

## org.apache.fop.pdf.PDFXMode

### TYPE_KIND_CHANGED [binary ✗ | source ✗]
- TYPE (kind changed): `org.apache.fop.pdf.PDFXMode`

## org.apache.fop.pdf.PDFXObject

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDictionary.entries`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFDictionary.order`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.put(java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.pdf.PDFXObject`

## org.apache.fop.pdf.StreamCacheFactory

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.pdf.StreamCacheFactory`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.pdf.StreamCacheFactory`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.pdf.StreamCacheFactory.<init>(boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.pdf.StreamCacheFactory.createStreamCache()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.pdf.StreamCacheFactory.createStreamCache(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.pdf.StreamCacheFactory.getInstance()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.StreamCacheFactory.getCacheToFile()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.StreamCacheFactory.getInstance(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.StreamCacheFactory.setDefaultCacheToFile(boolean)`

## org.apache.fop.pdf.TransitionDictionary

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.pdf.PDFObject.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.pdf.PDFObject.DATE_FORMAT`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFDictionary.writeDictionary(java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatDateTime(java.util.Date,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.formatObject(java.lang.Object,java.io.OutputStream,java.io.Writer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFObject.outputInline(java.io.OutputStream,java.io.Writer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.pdf.PDFObject.getObjectNumber()`
+ NEW RETURN TYPE: `org.apache.fop.pdf.PDFObject.getObjectNumber()`

## org.apache.fop.render.AbstractConfigurator

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.AbstractConfigurator.log`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractConfigurator.getConfig(java.lang.String)`

## org.apache.fop.render.AbstractImageHandlerRegistry

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.render.AbstractImageHandlerRegistry`

## org.apache.fop.render.AbstractPathOrientedRenderer

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.AbstractPathOrientedRenderer.<init>()`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.AbstractRenderer.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.PrintRenderer.fontResolver`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.PrintRenderer.addFontList(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.PrintRenderer.setFontList(java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractPathOrientedRenderer.drawBorders(float,float,float,float,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractPathOrientedRenderer.drawBorders(java.awt.geom.Rectangle2D$Float,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractPathOrientedRenderer.renderViewport(org.apache.fop.area.inline.Viewport)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractRenderer.setUserAgent(org.apache.fop.apps.FOUserAgent)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractRenderer.startVParea(org.apache.fop.area.CTM,java.awt.geom.Rectangle2D)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRenderer.getFontResolver()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.PrintRenderer.getFontList()`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRenderer.getFontList()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.AbstractPathOrientedRenderer`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.AbstractRenderer.startLayer(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.AbstractPathOrientedRenderer`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.AbstractRenderer.endLayer()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.AbstractPathOrientedRenderer`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.AbstractRenderer.startVParea(org.apache.fop.area.CTM,java.awt.Rectangle)`

## org.apache.fop.render.AbstractRenderer

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.AbstractRenderer.<init>()`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.AbstractRenderer.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractRenderer.renderViewport(org.apache.fop.area.inline.Viewport)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractRenderer.setUserAgent(org.apache.fop.apps.FOUserAgent)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractRenderer.startVParea(org.apache.fop.area.CTM,java.awt.geom.Rectangle2D)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.AbstractRenderer`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.AbstractRenderer.endLayer()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.AbstractRenderer`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.AbstractRenderer.startVParea(org.apache.fop.area.CTM,java.awt.Rectangle)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.AbstractRenderer`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.AbstractRenderer.startLayer(java.lang.String)`

## org.apache.fop.render.AbstractRendererConfigurator

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.AbstractConfigurator.userAgent`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.AbstractConfigurator.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.render.AbstractRendererConfigurator.getType()`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.render.AbstractRendererConfigurator.getType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractConfigurator.getConfig(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.AbstractRendererConfigurator`

## org.apache.fop.render.AbstractRendererMaker

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractRendererMaker.getConfigurator(org.apache.fop.apps.FOUserAgent)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.AbstractRendererMaker`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.AbstractRendererMaker.configureRenderer(org.apache.fop.apps.FOUserAgent,org.apache.fop.render.Renderer)`

## org.apache.fop.render.DefaultFontResolver

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.render.DefaultFontResolver`

## org.apache.fop.render.ImageHandlerUtil

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.render.ImageHandlerUtil`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.render.ImageHandlerUtil`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.ImageHandlerUtil.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.ImageHandlerUtil.isConversionModeBitmap(java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.ImageHandlerUtil.isConversionModeBitmap(java.util.Map)`

## org.apache.fop.render.PrintRenderer

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.PrintRenderer.<init>()`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.AbstractRenderer.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.PrintRenderer.fontResolver`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.PrintRenderer.addFontList(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.PrintRenderer.setFontList(java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractRenderer.renderViewport(org.apache.fop.area.inline.Viewport)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractRenderer.setUserAgent(org.apache.fop.apps.FOUserAgent)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractRenderer.startVParea(org.apache.fop.area.CTM,java.awt.geom.Rectangle2D)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRenderer.getFontResolver()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.PrintRenderer.getFontList()`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRenderer.getFontList()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.PrintRenderer`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.AbstractRenderer.endLayer()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.PrintRenderer`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.AbstractRenderer.startVParea(org.apache.fop.area.CTM,java.awt.Rectangle)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.PrintRenderer`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.AbstractRenderer.startLayer(java.lang.String)`

## org.apache.fop.render.PrintRendererConfigurator

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.render.PrintRendererConfigurator`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.PrintRendererConfigurator.<init>(org.apache.fop.apps.FOUserAgent)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.AbstractConfigurator.userAgent`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.PrintRendererConfigurator.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.render.AbstractRendererConfigurator.getType()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NOW THROWS: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NOW THROWS: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.render.AbstractRendererConfigurator.getType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractConfigurator.getConfig(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRendererConfigurator.buildFontList(org.apache.avalon.framework.configuration.Configuration,org.apache.fop.fonts.FontResolver,org.apache.fop.fonts.FontEventListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRendererConfigurator.setupFontInfo(org.apache.fop.render.intermediate.IFDocumentHandler,org.apache.fop.fonts.FontInfo)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.PrintRendererConfigurator`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.PrintRendererConfigurator.getDefaultFontCollection()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.PrintRendererConfigurator`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.PrintRendererConfigurator`

## org.apache.fop.render.Renderer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.Renderer.setUserAgent(org.apache.fop.apps.FOUserAgent)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.Renderer`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.Renderer.setDocumentLocale(java.util.Locale)`

## org.apache.fop.render.RendererConfigurator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.render.RendererConfigurator`

## org.apache.fop.render.RendererEventProducer

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.RendererEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.RendererEventProducer.endPage(java.lang.Object,int)`

## org.apache.fop.render.RendererEventProducer$Provider

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.render.RendererEventProducer$Provider`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.render.RendererEventProducer$Provider`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.RendererEventProducer$Provider.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.RendererEventProducer$Provider.get(org.apache.fop.events.EventBroadcaster)`

## org.apache.fop.render.RendererFactory

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.RendererFactory.<init>()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.RendererFactory.getDocumentHandlerMaker(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.RendererFactory.setRendererPreferred(boolean)`

## org.apache.fop.render.XMLHandlerConfigurator

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.AbstractConfigurator.userAgent`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.XMLHandlerConfigurator.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.render.AbstractRendererConfigurator.getType()`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.render.AbstractRendererConfigurator.getType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractConfigurator.getConfig(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.XMLHandlerConfigurator`

## org.apache.fop.render.afp.AFPCustomizable

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.afp.AFPCustomizable.setDefaultResourceGroupFilePath(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.afp.AFPCustomizable`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.afp.AFPCustomizable.getFS45()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.afp.AFPCustomizable`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.afp.AFPCustomizable.getWrapPSeg()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.afp.AFPCustomizable`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.afp.AFPCustomizable.isStrokeGOCAText()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.afp.AFPCustomizable`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.afp.AFPCustomizable.setStrokeGOCAText(boolean)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.afp.AFPCustomizable`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.afp.AFPCustomizable.setDefaultResourceGroupUri(java.net.URI)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.afp.AFPCustomizable`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.afp.AFPCustomizable.setBitmapEncodingQuality(float)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.afp.AFPCustomizable`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.afp.AFPCustomizable.setWrapPSeg(boolean)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.afp.AFPCustomizable`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.afp.AFPCustomizable.setFS45(boolean)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.afp.AFPCustomizable`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.afp.AFPCustomizable.setLineWidthCorrection(float)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.afp.AFPCustomizable`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.afp.AFPCustomizable.setGOCAEnabled(boolean)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.afp.AFPCustomizable`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.afp.AFPCustomizable.isGOCAEnabled()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.afp.AFPCustomizable`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.afp.AFPCustomizable.canEmbedJpeg(boolean)`

## org.apache.fop.render.afp.AFPDocumentHandler

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.afp.AFPDocumentHandler.<init>()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.afp.AFPDocumentHandler.setDefaultResourceGroupFilePath(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.setContext(org.apache.fop.render.intermediate.IFContext)`

## org.apache.fop.render.afp.AFPDocumentHandlerMaker

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.afp.AFPDocumentHandlerMaker.makeIFDocumentHandler(org.apache.fop.apps.FOUserAgent)`

## org.apache.fop.render.afp.AFPForeignAttributeReader

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.afp.AFPForeignAttributeReader.RESOURCE_GROUP_FILE`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.afp.AFPForeignAttributeReader.getResourceInfo(java.util.Map)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.afp.AFPForeignAttributeReader.getResourceLevel(java.util.Map)`

## org.apache.fop.render.afp.AFPImageHandler

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.afp.AFPImageHandler.setResourceInformation(org.apache.fop.afp.AFPDataObjectInfo,java.lang.String,java.util.Map)`

## org.apache.fop.render.afp.AFPImageHandlerGraphics2D

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.afp.AFPImageHandler.setResourceInformation(org.apache.fop.afp.AFPDataObjectInfo,java.lang.String,java.util.Map)`

## org.apache.fop.render.afp.AFPImageHandlerRawCCITTFax

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.afp.AFPImageHandler.setResourceInformation(org.apache.fop.afp.AFPDataObjectInfo,java.lang.String,java.util.Map)`

## org.apache.fop.render.afp.AFPImageHandlerRawStream

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.afp.AFPImageHandler.setResourceInformation(org.apache.fop.afp.AFPDataObjectInfo,java.lang.String,java.util.Map)`

## org.apache.fop.render.afp.AFPImageHandlerRegistry

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.render.afp.AFPImageHandlerRegistry`

## org.apache.fop.render.afp.AFPImageHandlerRenderedImage

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.afp.AFPImageHandler.setResourceInformation(org.apache.fop.afp.AFPDataObjectInfo,java.lang.String,java.util.Map)`

## org.apache.fop.render.afp.AFPImageHandlerXML

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.render.afp.AFPImageHandlerXML`

## org.apache.fop.render.afp.AFPPainter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.afp.AFPPainter.drawBorderRect(java.awt.Rectangle,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.afp.AFPPainter.drawText(int,int,int,int,int[],java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.afp.AFPPainter.startGroup(java.awt.geom.AffineTransform)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.AbstractIFPainter.getFopFactory()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.AbstractIFPainter.startGroup(java.awt.geom.AffineTransform[])`

## org.apache.fop.render.afp.AFPRenderer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.render.afp.AFPRenderer`

## org.apache.fop.render.afp.AFPRendererConfigurator

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.afp.AFPRendererConfigurator.<init>(org.apache.fop.apps.FOUserAgent)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.AbstractConfigurator.userAgent`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.PrintRendererConfigurator.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.render.AbstractRendererConfigurator.getType()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NOW THROWS: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NOW THROWS: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.render.AbstractRendererConfigurator.getType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractConfigurator.getConfig(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRendererConfigurator.buildFontList(org.apache.avalon.framework.configuration.Configuration,org.apache.fop.fonts.FontResolver,org.apache.fop.fonts.FontEventListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.afp.AFPRendererConfigurator.setupFontInfo(org.apache.fop.render.intermediate.IFDocumentHandler,org.apache.fop.fonts.FontInfo)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.afp.AFPRendererConfigurator`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.afp.AFPRendererConfigurator`

## org.apache.fop.render.afp.AFPRendererMaker

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.render.afp.AFPRendererMaker`

## org.apache.fop.render.afp.AFPShadingMode

### TYPE_KIND_CHANGED [binary ✗ | source ✗]
- TYPE (kind changed): `org.apache.fop.render.afp.AFPShadingMode`

## org.apache.fop.render.afp.AbstractAFPImageHandlerRawStream

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.afp.AFPImageHandler.setResourceInformation(org.apache.fop.afp.AFPDataObjectInfo,java.lang.String,java.util.Map)`

## org.apache.fop.render.afp.extensions.AFPElementMapping

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.ElementMapping.getTable()`
+ NEW RETURN TYPE: `org.apache.fop.fo.ElementMapping.getTable()`

## org.apache.fop.render.afp.extensions.AFPExtensionHandler

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.afp.extensions.AFPExtensionHandler.log`

## org.apache.fop.render.afp.extensions.AFPIncludeFormMapElement

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

## org.apache.fop.render.afp.extensions.AFPInvokeMediumMapElement

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

## org.apache.fop.render.afp.extensions.AFPPageOverlayElement

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

## org.apache.fop.render.afp.extensions.AFPPageSetupElement

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

## org.apache.fop.render.afp.extensions.AbstractAFPExtensionObject

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

## org.apache.fop.render.awt.AWTRenderer

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.awt.AWTRenderer.<init>()`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.awt.AWTRenderer.<init>(boolean)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.AbstractRenderer.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.PrintRenderer.fontResolver`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.awt.AWTRenderer.dialogDisplay`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.awt.AWTRenderer.renderable`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.java2d.Java2DRenderer.JAVA2D_TRANSPARENT_PAGE_BACKGROUND`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.awt.AWTRenderer.renderPage(org.apache.fop.area.PageViewport)`
+ NOW THROWS: `org.apache.fop.render.awt.AWTRenderer.renderPage(org.apache.fop.area.PageViewport)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.PrintRenderer.addFontList(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.PrintRenderer.setFontList(java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractPathOrientedRenderer.drawBorders(float,float,float,float,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractPathOrientedRenderer.drawBorders(java.awt.geom.Rectangle2D$Float,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractPathOrientedRenderer.renderViewport(org.apache.fop.area.inline.Viewport)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRenderer.getFontResolver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.awt.AWTRenderer.setPreviewDialogDisplayed(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.awt.AWTRenderer.setRenderable(org.apache.fop.render.awt.viewer.Renderable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.awt.AWTRenderer.setUserAgent(org.apache.fop.apps.FOUserAgent)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.java2d.Java2DRenderer.startVParea(org.apache.fop.area.CTM,java.awt.geom.Rectangle2D)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.PrintRenderer.getFontList()`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRenderer.getFontList()`

## org.apache.fop.render.awt.AWTRendererMaker

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractRendererMaker.getConfigurator(org.apache.fop.apps.FOUserAgent)`

## org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.<init>()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.setContext(org.apache.fop.render.intermediate.IFContext)`

## org.apache.fop.render.bitmap.BitmapRendererConfigurator

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.bitmap.BitmapRendererConfigurator.<init>(org.apache.fop.apps.FOUserAgent)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.AbstractConfigurator.userAgent`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.PrintRendererConfigurator.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.render.AbstractRendererConfigurator.getType()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NOW THROWS: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NOW THROWS: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.render.AbstractRendererConfigurator.getType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractConfigurator.getConfig(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRendererConfigurator.buildFontList(org.apache.avalon.framework.configuration.Configuration,org.apache.fop.fonts.FontResolver,org.apache.fop.fonts.FontEventListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.bitmap.BitmapRendererConfigurator.setupFontInfo(org.apache.fop.render.intermediate.IFDocumentHandler,org.apache.fop.fonts.FontInfo)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.bitmap.BitmapRendererConfigurator`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.bitmap.BitmapRendererConfigurator`

## org.apache.fop.render.bitmap.BitmapRendererEventProducer$Provider

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.render.bitmap.BitmapRendererEventProducer$Provider`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.render.bitmap.BitmapRendererEventProducer$Provider`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.bitmap.BitmapRendererEventProducer$Provider.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.BitmapRendererEventProducer$Provider.get(org.apache.fop.events.EventBroadcaster)`

## org.apache.fop.render.bitmap.BitmapRenderingSettings

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.bitmap.TIFFConstants.COMPRESSION_CCITT_T4`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.bitmap.TIFFConstants.COMPRESSION_CCITT_T6`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.bitmap.TIFFConstants.COMPRESSION_DEFLATE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.bitmap.TIFFConstants.COMPRESSION_JPEG`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.bitmap.TIFFConstants.COMPRESSION_LZW`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.bitmap.TIFFConstants.COMPRESSION_NONE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.bitmap.TIFFConstants.COMPRESSION_PACKBITS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.bitmap.TIFFConstants.COMPRESSION_ZLIB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.bitmap.TIFFConstants.MIME_TYPE`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.bitmap.BitmapRenderingSettings`

## org.apache.fop.render.bitmap.PNGDocumentHandler

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.render.bitmap.PNGDocumentHandler`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.render.bitmap.PNGDocumentHandler`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.bitmap.PNGDocumentHandler.<init>()`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.intermediate.AbstractBinaryWritingIFDocumentHandler.fontInfo`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.intermediate.AbstractBinaryWritingIFDocumentHandler.outputStream`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.endDocument()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.endDocumentHeader()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.endPage()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.endPageContent()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.endPageSequence()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.getSettings()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.handleExtensionObject(java.lang.Object)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.setDefaultFontInfo(org.apache.fop.fonts.FontInfo)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.setTargetBitmapSize(java.awt.Dimension)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.startDocument()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.startPage(int,java.lang.String,java.lang.String,java.awt.Dimension)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.startPageContent()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.startPageSequence(java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.supportsPagesOutOfOrder()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.PNGDocumentHandler.getConfigurator()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.PNGDocumentHandler.getDefaultExtension()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.PNGDocumentHandler.getMimeType()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractBinaryWritingIFDocumentHandler.getFontInfo()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractBinaryWritingIFDocumentHandler.setFontInfo(org.apache.fop.fonts.FontInfo)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractBinaryWritingIFDocumentHandler.setResult(javax.xml.transform.Result)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.endDocumentTrailer()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.endPageHeader()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.endPageTrailer()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.getContext()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.getDocumentNavigationHandler()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.getUserAgent()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.startDocumentHeader()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.startDocumentTrailer()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.startPageHeader()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.startPageTrailer()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.createBufferedImage(int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.setContext(org.apache.fop.render.intermediate.IFContext)`

## org.apache.fop.render.bitmap.PNGDocumentHandlerMaker

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.bitmap.PNGDocumentHandlerMaker.makeIFDocumentHandler(org.apache.fop.apps.FOUserAgent)`

## org.apache.fop.render.bitmap.PNGRenderer

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.bitmap.PNGRenderer.<init>()`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.AbstractRenderer.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.PrintRenderer.fontResolver`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.java2d.Java2DRenderer.JAVA2D_TRANSPARENT_PAGE_BACKGROUND`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.java2d.Java2DRenderer.renderPage(org.apache.fop.area.PageViewport)`
+ NOW THROWS: `org.apache.fop.render.java2d.Java2DRenderer.renderPage(org.apache.fop.area.PageViewport)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.PrintRenderer.addFontList(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.PrintRenderer.setFontList(java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractPathOrientedRenderer.drawBorders(float,float,float,float,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractPathOrientedRenderer.drawBorders(java.awt.geom.Rectangle2D$Float,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractPathOrientedRenderer.renderViewport(org.apache.fop.area.inline.Viewport)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRenderer.getFontResolver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.java2d.Java2DRenderer.setUserAgent(org.apache.fop.apps.FOUserAgent)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.java2d.Java2DRenderer.startVParea(org.apache.fop.area.CTM,java.awt.geom.Rectangle2D)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.PrintRenderer.getFontList()`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRenderer.getFontList()`

## org.apache.fop.render.bitmap.PNGRendererMaker

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.bitmap.PNGRendererMaker.getConfigurator(org.apache.fop.apps.FOUserAgent)`

## org.apache.fop.render.bitmap.PNGRenderer_onthefly

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.render.bitmap.PNGRenderer_onthefly`

## org.apache.fop.render.bitmap.TIFFConstants

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.render.bitmap.TIFFConstants`

## org.apache.fop.render.bitmap.TIFFDocumentHandler

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.render.bitmap.TIFFDocumentHandler`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.render.bitmap.TIFFDocumentHandler`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.bitmap.TIFFDocumentHandler.<init>()`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.intermediate.AbstractBinaryWritingIFDocumentHandler.fontInfo`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.intermediate.AbstractBinaryWritingIFDocumentHandler.outputStream`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.endDocument()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.endDocumentHeader()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.endPage()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.endPageContent()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.endPageSequence()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.getSettings()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.handleExtensionObject(java.lang.Object)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.setDefaultFontInfo(org.apache.fop.fonts.FontInfo)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.setTargetBitmapSize(java.awt.Dimension)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.startDocument()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.startPage(int,java.lang.String,java.lang.String,java.awt.Dimension)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.startPageContent()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.startPageSequence(java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.supportsPagesOutOfOrder()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.TIFFDocumentHandler.getConfigurator()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.TIFFDocumentHandler.getDefaultExtension()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.bitmap.TIFFDocumentHandler.getMimeType()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractBinaryWritingIFDocumentHandler.getFontInfo()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractBinaryWritingIFDocumentHandler.setFontInfo(org.apache.fop.fonts.FontInfo)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractBinaryWritingIFDocumentHandler.setResult(javax.xml.transform.Result)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.endDocumentTrailer()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.endPageHeader()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.endPageTrailer()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.getContext()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.getDocumentNavigationHandler()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.getUserAgent()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.startDocumentHeader()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.startDocumentTrailer()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.startPageHeader()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.startPageTrailer()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.createBufferedImage(int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.bitmap.AbstractBitmapDocumentHandler.setContext(org.apache.fop.render.intermediate.IFContext)`

## org.apache.fop.render.bitmap.TIFFDocumentHandlerMaker

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.bitmap.TIFFDocumentHandlerMaker.makeIFDocumentHandler(org.apache.fop.apps.FOUserAgent)`

## org.apache.fop.render.bitmap.TIFFRenderer

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.bitmap.TIFFRenderer.<init>()`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.AbstractRenderer.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.PrintRenderer.fontResolver`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.bitmap.TIFFConstants.COMPRESSION_CCITT_T4`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.bitmap.TIFFConstants.COMPRESSION_CCITT_T6`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.bitmap.TIFFConstants.COMPRESSION_DEFLATE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.bitmap.TIFFConstants.COMPRESSION_JPEG`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.bitmap.TIFFConstants.COMPRESSION_LZW`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.bitmap.TIFFConstants.COMPRESSION_NONE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.bitmap.TIFFConstants.COMPRESSION_PACKBITS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.bitmap.TIFFConstants.COMPRESSION_ZLIB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.bitmap.TIFFConstants.MIME_TYPE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.java2d.Java2DRenderer.JAVA2D_TRANSPARENT_PAGE_BACKGROUND`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.java2d.Java2DRenderer.renderPage(org.apache.fop.area.PageViewport)`
+ NOW THROWS: `org.apache.fop.render.java2d.Java2DRenderer.renderPage(org.apache.fop.area.PageViewport)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.PrintRenderer.addFontList(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.PrintRenderer.setFontList(java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractPathOrientedRenderer.drawBorders(float,float,float,float,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractPathOrientedRenderer.drawBorders(java.awt.geom.Rectangle2D$Float,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractPathOrientedRenderer.renderViewport(org.apache.fop.area.inline.Viewport)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRenderer.getFontResolver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.bitmap.TIFFRenderer.getWriterParams()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.bitmap.TIFFRenderer.setUserAgent(org.apache.fop.apps.FOUserAgent)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.java2d.Java2DRenderer.startVParea(org.apache.fop.area.CTM,java.awt.geom.Rectangle2D)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.PrintRenderer.getFontList()`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRenderer.getFontList()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.bitmap.TIFFRenderer`

## org.apache.fop.render.bitmap.TIFFRendererConfigurator

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.bitmap.TIFFRendererConfigurator.<init>(org.apache.fop.apps.FOUserAgent)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.AbstractConfigurator.userAgent`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.PrintRendererConfigurator.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.render.AbstractRendererConfigurator.getType()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NOW THROWS: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NOW THROWS: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.render.AbstractRendererConfigurator.getType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractConfigurator.getConfig(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRendererConfigurator.buildFontList(org.apache.avalon.framework.configuration.Configuration,org.apache.fop.fonts.FontResolver,org.apache.fop.fonts.FontEventListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.bitmap.BitmapRendererConfigurator.setupFontInfo(org.apache.fop.render.intermediate.IFDocumentHandler,org.apache.fop.fonts.FontInfo)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.bitmap.TIFFRendererConfigurator`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.bitmap.TIFFRendererConfigurator`

## org.apache.fop.render.bitmap.TIFFRendererMaker

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.bitmap.TIFFRendererMaker.getConfigurator(org.apache.fop.apps.FOUserAgent)`

## org.apache.fop.render.intermediate.AbstractBinaryWritingIFDocumentHandler

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.intermediate.AbstractBinaryWritingIFDocumentHandler.<init>()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.setContext(org.apache.fop.render.intermediate.IFContext)`

## org.apache.fop.render.intermediate.AbstractIFDocumentHandler

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.<init>()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.setContext(org.apache.fop.render.intermediate.IFContext)`

## org.apache.fop.render.intermediate.AbstractIFDocumentHandlerMaker

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.AbstractIFDocumentHandlerMaker.makeIFDocumentHandler(org.apache.fop.apps.FOUserAgent)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.intermediate.AbstractIFDocumentHandlerMaker`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.intermediate.AbstractIFDocumentHandlerMaker.makeIFDocumentHandler(org.apache.fop.render.intermediate.IFContext)`

## org.apache.fop.render.intermediate.AbstractIFPainter

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.intermediate.AbstractIFPainter.<init>()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.AbstractIFPainter.drawBorderRect(java.awt.Rectangle,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.AbstractIFPainter.getFopFactory()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.AbstractIFPainter.startGroup(java.awt.geom.AffineTransform[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.IFPainter.drawText(int,int,int,int,int[],java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.IFPainter.startGroup(java.awt.geom.AffineTransform)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.intermediate.AbstractIFPainter`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.intermediate.IFPainter.drawText(int,int,int,int,int[][],java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.intermediate.AbstractIFPainter`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.intermediate.IFPainter.clipBackground(java.awt.Rectangle,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.intermediate.AbstractIFPainter`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.intermediate.IFPainter.startGroup(java.awt.geom.AffineTransform,java.lang.String)`

## org.apache.fop.render.intermediate.AbstractXMLWritingIFDocumentHandler

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.intermediate.AbstractXMLWritingIFDocumentHandler.<init>()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.setContext(org.apache.fop.render.intermediate.IFContext)`

## org.apache.fop.render.intermediate.BorderPainter

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.intermediate.BorderPainter.<init>()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.BorderPainter.clip()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.BorderPainter.closePath()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.BorderPainter.drawBorderLine(int,int,int,int,boolean,boolean,int,java.awt.Color)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.BorderPainter.drawBorders(java.awt.Rectangle,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.BorderPainter.drawLine(java.awt.Point,java.awt.Point,int,java.awt.Color,org.apache.fop.traits.RuleStyle)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.BorderPainter.lineTo(int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.BorderPainter.moveTo(int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.BorderPainter.restoreGraphicsState()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.BorderPainter.saveGraphicsState()`

## org.apache.fop.render.intermediate.IFContext

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.IFContext.getStructurePointer()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.IFContext.resetStructurePointer()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.IFContext.setStructurePointer(java.lang.String)`

## org.apache.fop.render.intermediate.IFDocumentHandler

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.IFDocumentHandler.setContext(org.apache.fop.render.intermediate.IFContext)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.intermediate.IFDocumentHandler`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.intermediate.IFDocumentHandler.setDocumentLocale(java.util.Locale)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.intermediate.IFDocumentHandler`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.intermediate.IFDocumentHandler.getStructureTreeEventHandler()`

## org.apache.fop.render.intermediate.IFDocumentHandlerConfigurator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.IFDocumentHandlerConfigurator.setupFontInfo(org.apache.fop.render.intermediate.IFDocumentHandler,org.apache.fop.fonts.FontInfo)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.intermediate.IFDocumentHandlerConfigurator`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.intermediate.IFDocumentHandlerConfigurator.setupFontInfo(java.lang.String,org.apache.fop.fonts.FontInfo)`

## org.apache.fop.render.intermediate.IFPainter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.IFPainter.drawBorderRect(java.awt.Rectangle,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.IFPainter.drawText(int,int,int,int,int[],java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.IFPainter.startGroup(java.awt.geom.AffineTransform)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.IFPainter.startGroup(java.awt.geom.AffineTransform[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.intermediate.IFPainter`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.intermediate.IFPainter.clipBackground(java.awt.Rectangle,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.intermediate.IFPainter`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.intermediate.IFPainter.isBackgroundRequired(org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.intermediate.IFPainter`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.intermediate.IFPainter.startGroup(java.awt.geom.AffineTransform[],java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.intermediate.IFPainter`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.intermediate.IFPainter.drawText(int,int,int,int,int[][],java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.intermediate.IFPainter`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.intermediate.IFPainter.drawBorderRect(java.awt.Rectangle,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,java.awt.Color)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.intermediate.IFPainter`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.intermediate.IFPainter.startGroup(java.awt.geom.AffineTransform,java.lang.String)`

## org.apache.fop.render.intermediate.IFParser

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.intermediate.IFParser.log`

## org.apache.fop.render.intermediate.IFRenderer

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.intermediate.IFRenderer.<init>()`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.intermediate.IFRenderer.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.PrintRenderer.fontResolver`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.PrintRenderer.addFontList(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.PrintRenderer.setFontList(java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractPathOrientedRenderer.drawBorders(java.awt.geom.Rectangle2D$Float,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractRenderer.setUserAgent(org.apache.fop.apps.FOUserAgent)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRenderer.getFontResolver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.IFRenderer.drawBorders(float,float,float,float,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.IFRenderer.renderText(java.lang.String,int[],org.apache.fop.fonts.Font,org.apache.fop.area.inline.AbstractTextArea)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.IFRenderer.renderViewport(org.apache.fop.area.inline.Viewport)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.IFRenderer.startVParea(org.apache.fop.area.CTM,java.awt.geom.Rectangle2D)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.PrintRenderer.getFontList()`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRenderer.getFontList()`

## org.apache.fop.render.intermediate.IFSerializer

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.intermediate.IFSerializer.<init>()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.AbstractIFDocumentHandler.setContext(org.apache.fop.render.intermediate.IFContext)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.IFSerializer.drawBorderRect(java.awt.Rectangle,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.IFSerializer.drawText(int,int,int,int,int[],java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.IFSerializer.startGroup(java.awt.geom.AffineTransform)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.IFSerializer.startGroup(java.awt.geom.AffineTransform[])`

## org.apache.fop.render.intermediate.IFSerializerMaker

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.IFSerializerMaker.makeIFDocumentHandler(org.apache.fop.apps.FOUserAgent)`

## org.apache.fop.render.intermediate.IFUtil

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.render.intermediate.IFUtil`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.render.intermediate.IFUtil`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.intermediate.IFUtil.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.IFUtil.getEffectiveMIMEType(org.apache.fop.render.intermediate.IFDocumentHandler)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.IFUtil.setupFonts(org.apache.fop.render.intermediate.IFDocumentHandler)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.IFUtil.setupFonts(org.apache.fop.render.intermediate.IFDocumentHandler,org.apache.fop.fonts.FontInfo)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.IFUtil.toString(int[])`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.IFUtil.toString(java.awt.Rectangle)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.IFUtil.toString(java.awt.geom.AffineTransform)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.IFUtil.toString(java.awt.geom.AffineTransform,java.lang.StringBuffer)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.IFUtil.toString(java.awt.geom.AffineTransform[])`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.intermediate.IFUtil.toString(java.awt.geom.AffineTransform[],java.lang.StringBuffer)`

## org.apache.fop.render.intermediate.extensions.AbstractAction

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.extensions.AbstractAction.getStructurePointer()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.extensions.AbstractAction.setStructurePointer(java.lang.String)`

## org.apache.fop.render.intermediate.extensions.DocumentNavigationHandler

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.intermediate.extensions.DocumentNavigationHandler.<init>(org.apache.fop.render.intermediate.IFDocumentNavigationHandler)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.intermediate.extensions.DocumentNavigationHandler.log`

## org.apache.fop.render.intermediate.extensions.GoToXYAction

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.extensions.AbstractAction.getStructurePointer()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.extensions.AbstractAction.setStructurePointer(java.lang.String)`

## org.apache.fop.render.intermediate.extensions.URIAction

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.extensions.AbstractAction.getStructurePointer()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.extensions.AbstractAction.setStructurePointer(java.lang.String)`

## org.apache.fop.render.intermediate.util.IFDocumentHandlerProxy

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.util.IFDocumentHandlerProxy.setContext(org.apache.fop.render.intermediate.IFContext)`

## org.apache.fop.render.java2d.Base14FontCollection

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.java2d.Base14FontCollection.<init>(java.awt.Graphics2D)`

## org.apache.fop.render.java2d.ConfiguredFontCollection

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.java2d.ConfiguredFontCollection.<init>(org.apache.fop.fonts.FontResolver,java.util.List)`

## org.apache.fop.render.java2d.CustomFontMetricsMapper

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.java2d.CustomFontMetricsMapper.<init>(org.apache.fop.fonts.LazyFont,javax.xml.transform.Source)`

## org.apache.fop.render.java2d.FontMetricsMapper

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.FontMetrics.getFamilyNames()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.FontMetrics.getFamilyNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fonts.FontMetrics.getKerningInfo()`
+ NEW RETURN TYPE: `org.apache.fop.fonts.FontMetrics.getKerningInfo()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.java2d.FontMetricsMapper`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getUnderlineThickness(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.java2d.FontMetricsMapper`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getUnderlinePosition(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.java2d.FontMetricsMapper`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getStrikeoutPosition(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.java2d.FontMetricsMapper`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.hasFeature(int,java.lang.String,java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.java2d.FontMetricsMapper`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getBoundingBox(int,int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.java2d.FontMetricsMapper`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getFontURI()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.java2d.FontMetricsMapper`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.getStrikeoutThickness(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.java2d.FontMetricsMapper`
+ MUST NOW IMPLEMENT: `org.apache.fop.fonts.FontMetrics.isMultiByte()`

## org.apache.fop.render.java2d.InstalledFontCollection

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.java2d.InstalledFontCollection.<init>(java.awt.Graphics2D)`

## org.apache.fop.render.java2d.Java2DBorderPainter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.render.java2d.Java2DBorderPainter`

## org.apache.fop.render.java2d.Java2DFontMetrics

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.java2d.Java2DFontMetrics.<init>(java.awt.Graphics2D)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.java2d.Java2DFontMetrics.createFontMetricsGraphics2D()`

## org.apache.fop.render.java2d.Java2DPainter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.AbstractIFPainter.getFopFactory()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.AbstractIFPainter.startGroup(java.awt.geom.AffineTransform[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.java2d.Java2DPainter.drawText(int,int,int,int,int[],java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.java2d.Java2DPainter.startGroup(java.awt.geom.AffineTransform)`

## org.apache.fop.render.java2d.Java2DRenderer

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.java2d.Java2DRenderer.<init>()`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.AbstractRenderer.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.PrintRenderer.fontResolver`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.java2d.Java2DRenderer.JAVA2D_TRANSPARENT_PAGE_BACKGROUND`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.java2d.Java2DRenderer.renderPage(org.apache.fop.area.PageViewport)`
+ NOW THROWS: `org.apache.fop.render.java2d.Java2DRenderer.renderPage(org.apache.fop.area.PageViewport)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.PrintRenderer.addFontList(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.PrintRenderer.setFontList(java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractPathOrientedRenderer.drawBorders(float,float,float,float,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractPathOrientedRenderer.drawBorders(java.awt.geom.Rectangle2D$Float,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractPathOrientedRenderer.renderViewport(org.apache.fop.area.inline.Viewport)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRenderer.getFontResolver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.java2d.Java2DRenderer.setUserAgent(org.apache.fop.apps.FOUserAgent)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.java2d.Java2DRenderer.startVParea(org.apache.fop.area.CTM,java.awt.geom.Rectangle2D)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.PrintRenderer.getFontList()`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRenderer.getFontList()`

## org.apache.fop.render.java2d.Java2DRendererConfigurator

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.java2d.Java2DRendererConfigurator.<init>(org.apache.fop.apps.FOUserAgent)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.AbstractConfigurator.userAgent`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.PrintRendererConfigurator.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.render.AbstractRendererConfigurator.getType()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NOW THROWS: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NOW THROWS: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.render.AbstractRendererConfigurator.getType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractConfigurator.getConfig(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRendererConfigurator.buildFontList(org.apache.avalon.framework.configuration.Configuration,org.apache.fop.fonts.FontResolver,org.apache.fop.fonts.FontEventListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRendererConfigurator.setupFontInfo(org.apache.fop.render.intermediate.IFDocumentHandler,org.apache.fop.fonts.FontInfo)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.java2d.Java2DRendererConfigurator`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.java2d.Java2DRendererConfigurator`

## org.apache.fop.render.java2d.Java2DUtil

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.render.java2d.Java2DUtil`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.render.java2d.Java2DUtil`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.java2d.Java2DUtil.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.java2d.Java2DUtil.buildDefaultJava2DBasedFontInfo(org.apache.fop.fonts.FontInfo,org.apache.fop.apps.FOUserAgent)`

## org.apache.fop.render.java2d.SystemFontMetricsMapper

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.java2d.SystemFontMetricsMapper.<init>(java.lang.String,int,java.awt.Graphics2D)`

## org.apache.fop.render.pcl.PCLDocumentHandler

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.pcl.PCLDocumentHandler.<init>()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.pcl.PCLDocumentHandler.setContext(org.apache.fop.render.intermediate.IFContext)`

## org.apache.fop.render.pcl.PCLDocumentHandlerMaker

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.pcl.PCLDocumentHandlerMaker.makeIFDocumentHandler(org.apache.fop.apps.FOUserAgent)`

## org.apache.fop.render.pcl.PCLEventProducer

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.pcl.PCLEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.pcl.PCLEventProducer.fontTypeNotSupported(java.lang.Object,java.lang.String,java.lang.String)`

## org.apache.fop.render.pcl.PCLEventProducer$Provider

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.render.pcl.PCLEventProducer$Provider`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.render.pcl.PCLEventProducer$Provider`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.pcl.PCLEventProducer$Provider.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.pcl.PCLEventProducer$Provider.get(org.apache.fop.events.EventBroadcaster)`

## org.apache.fop.render.pcl.PCLGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.pcl.PCLGenerator.fillRect(int,int,java.awt.Color)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.pcl.PCLGenerator.paintBitmap(java.awt.image.RenderedImage,java.awt.Dimension,boolean)`

## org.apache.fop.render.pcl.PCLGraphics2DAdapter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.render.pcl.PCLGraphics2DAdapter`

## org.apache.fop.render.pcl.PCLPainter

### METHOD_NOW_PROTECTED [binary ✗ | source ✗]
- METHOD (now protected, was public): `org.apache.fop.render.pcl.PCLPainter.getContext()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.AbstractIFPainter.getFopFactory()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.AbstractIFPainter.startGroup(java.awt.geom.AffineTransform[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.pcl.PCLPainter.drawText(int,int,int,int,int[],java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.pcl.PCLPainter.startGroup(java.awt.geom.AffineTransform)`

## org.apache.fop.render.pcl.PCLRenderer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.render.pcl.PCLRenderer`

## org.apache.fop.render.pcl.PCLRendererConfigurator

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.pcl.PCLRendererConfigurator.<init>(org.apache.fop.apps.FOUserAgent)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.AbstractConfigurator.userAgent`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.PrintRendererConfigurator.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.render.AbstractRendererConfigurator.getType()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NOW THROWS: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NOW THROWS: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.render.AbstractRendererConfigurator.getType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractConfigurator.getConfig(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRendererConfigurator.buildFontList(org.apache.avalon.framework.configuration.Configuration,org.apache.fop.fonts.FontResolver,org.apache.fop.fonts.FontEventListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.pcl.PCLRendererConfigurator.setupFontInfo(org.apache.fop.render.intermediate.IFDocumentHandler,org.apache.fop.fonts.FontInfo)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.pcl.PCLRendererConfigurator`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.pcl.PCLRendererConfigurator`

## org.apache.fop.render.pcl.PCLRendererMaker

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.render.pcl.PCLRendererMaker`

## org.apache.fop.render.pcl.PCLRenderingMode

### TYPE_KIND_CHANGED [binary ✗ | source ✗]
- TYPE (kind changed): `org.apache.fop.render.pcl.PCLRenderingMode`

## org.apache.fop.render.pcl.PCLRenderingUtil

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.pcl.PCLRenderingUtil.isColorCanvasEnabled()`

## org.apache.fop.render.pcl.extensions.PCLElementMapping

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.ElementMapping.getTable()`
+ NEW RETURN TYPE: `org.apache.fop.fo.ElementMapping.getTable()`

## org.apache.fop.render.pdf.CTMHelper

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.render.pdf.CTMHelper`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.pdf.CTMHelper.<init>()`

## org.apache.fop.render.pdf.PDFBorderPainter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.render.pdf.PDFBorderPainter`

## org.apache.fop.render.pdf.PDFConfigurationConstants

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.render.pdf.PDFConfigurationConstants`

## org.apache.fop.render.pdf.PDFContentGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.pdf.PDFContentGenerator.separateTextElements(java.lang.String,int)`

## org.apache.fop.render.pdf.PDFDocumentHandler

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.pdf.PDFDocumentHandler.<init>()`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.pdf.PDFDocumentHandler.currentContext`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.pdf.PDFDocumentHandler.currentPage`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.pdf.PDFDocumentHandler.currentPageRef`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.pdf.PDFDocumentHandler.generator`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.pdf.PDFDocumentHandler.pageReferences`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.pdf.PDFDocumentHandler.pdfDoc`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.pdf.PDFDocumentHandler.pdfResources`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.pdf.PDFDocumentHandler.pdfUtil`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.pdf.PDFDocumentHandler.setContext(org.apache.fop.render.intermediate.IFContext)`

## org.apache.fop.render.pdf.PDFDocumentHandlerMaker

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.pdf.PDFDocumentHandlerMaker.makeIFDocumentHandler(org.apache.fop.apps.FOUserAgent)`

## org.apache.fop.render.pdf.PDFEventProducer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.pdf.PDFEventProducer.nonStandardStructureType(java.lang.Object,java.lang.String,java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.pdf.PDFEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.pdf.PDFEventProducer.incorrectEncryptionLength(java.lang.Object,int,int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.pdf.PDFEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.pdf.PDFEventProducer.nonStandardStructureType(java.lang.Object,java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.pdf.PDFEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.pdf.PDFEventProducer.unknownLanguage(java.lang.Object,java.lang.String)`

## org.apache.fop.render.pdf.PDFGraphics2DAdapter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.render.pdf.PDFGraphics2DAdapter`

## org.apache.fop.render.pdf.PDFImageHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.render.pdf.PDFImageHandler`

## org.apache.fop.render.pdf.PDFImageHandlerGraphics2D

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.pdf.PDFImageHandlerGraphics2D.generateImage(org.apache.fop.render.RendererContext,org.apache.xmlgraphics.image.loader.Image,java.awt.Point,java.awt.Rectangle)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.pdf.PDFImageHandlerGraphics2D`

## org.apache.fop.render.pdf.PDFImageHandlerRawCCITTFax

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.pdf.PDFImageHandlerRawCCITTFax.generateImage(org.apache.fop.render.RendererContext,org.apache.xmlgraphics.image.loader.Image,java.awt.Point,java.awt.Rectangle)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.pdf.PDFImageHandlerRawCCITTFax`

## org.apache.fop.render.pdf.PDFImageHandlerRawJPEG

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.pdf.PDFImageHandlerRawJPEG.generateImage(org.apache.fop.render.RendererContext,org.apache.xmlgraphics.image.loader.Image,java.awt.Point,java.awt.Rectangle)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.pdf.PDFImageHandlerRawJPEG`

## org.apache.fop.render.pdf.PDFImageHandlerRegistry

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.render.pdf.PDFImageHandlerRegistry`

## org.apache.fop.render.pdf.PDFImageHandlerRenderedImage

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.pdf.PDFImageHandlerRenderedImage.generateImage(org.apache.fop.render.RendererContext,org.apache.xmlgraphics.image.loader.Image,java.awt.Point,java.awt.Rectangle)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.pdf.PDFImageHandlerRenderedImage`

## org.apache.fop.render.pdf.PDFImageHandlerXML

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.render.pdf.PDFImageHandlerXML`

## org.apache.fop.render.pdf.PDFPainter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.AbstractIFPainter.getFopFactory()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.AbstractIFPainter.startGroup(java.awt.geom.AffineTransform[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.pdf.PDFPainter.drawBorderRect(java.awt.Rectangle,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.pdf.PDFPainter.drawText(int,int,int,int,int[],java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.pdf.PDFPainter.startGroup(java.awt.geom.AffineTransform)`

## org.apache.fop.render.pdf.PDFRenderer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.render.pdf.PDFRenderer`

## org.apache.fop.render.pdf.PDFRendererConfigurator

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.pdf.PDFRendererConfigurator.<init>(org.apache.fop.apps.FOUserAgent)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.AbstractConfigurator.userAgent`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.PrintRendererConfigurator.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.render.AbstractRendererConfigurator.getType()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NOW THROWS: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NOW THROWS: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.render.AbstractRendererConfigurator.getType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractConfigurator.getConfig(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRendererConfigurator.buildFontList(org.apache.avalon.framework.configuration.Configuration,org.apache.fop.fonts.FontResolver,org.apache.fop.fonts.FontEventListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRendererConfigurator.setupFontInfo(org.apache.fop.render.intermediate.IFDocumentHandler,org.apache.fop.fonts.FontInfo)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.pdf.PDFRendererConfigurator.buildFilterMapFromConfiguration(org.apache.avalon.framework.configuration.Configuration)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.pdf.PDFRendererConfigurator`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.pdf.PDFRendererConfigurator`

## org.apache.fop.render.pdf.PDFRendererMaker

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.render.pdf.PDFRendererMaker`

## org.apache.fop.render.pdf.PDFSVGHandler

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.pdf.PDFSVGHandler.renderSVGDocument(org.apache.fop.render.RendererContext,org.w3c.dom.Document)`
+ NOW THROWS: `org.apache.fop.render.AbstractGenericSVGHandler.renderSVGDocument(org.apache.fop.render.RendererContext,org.w3c.dom.Document)`

## org.apache.fop.render.print.PageableRenderer

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.print.PageableRenderer.<init>()`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.AbstractRenderer.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.PrintRenderer.fontResolver`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.java2d.Java2DRenderer.JAVA2D_TRANSPARENT_PAGE_BACKGROUND`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.java2d.Java2DRenderer.renderPage(org.apache.fop.area.PageViewport)`
+ NOW THROWS: `org.apache.fop.render.java2d.Java2DRenderer.renderPage(org.apache.fop.area.PageViewport)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.PrintRenderer.addFontList(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.PrintRenderer.setFontList(java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractPathOrientedRenderer.drawBorders(float,float,float,float,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractPathOrientedRenderer.drawBorders(java.awt.geom.Rectangle2D$Float,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractPathOrientedRenderer.renderViewport(org.apache.fop.area.inline.Viewport)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRenderer.getFontResolver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.java2d.Java2DRenderer.startVParea(org.apache.fop.area.CTM,java.awt.geom.Rectangle2D)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.print.PageableRenderer.setUserAgent(org.apache.fop.apps.FOUserAgent)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.PrintRenderer.getFontList()`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRenderer.getFontList()`

## org.apache.fop.render.print.PrintRenderer

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.print.PrintRenderer.<init>()`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.print.PrintRenderer.<init>(java.awt.print.PrinterJob)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.AbstractRenderer.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.PrintRenderer.fontResolver`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.java2d.Java2DRenderer.JAVA2D_TRANSPARENT_PAGE_BACKGROUND`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.java2d.Java2DRenderer.renderPage(org.apache.fop.area.PageViewport)`
+ NOW THROWS: `org.apache.fop.render.java2d.Java2DRenderer.renderPage(org.apache.fop.area.PageViewport)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.PrintRenderer.addFontList(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.PrintRenderer.setFontList(java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractPathOrientedRenderer.drawBorders(float,float,float,float,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractPathOrientedRenderer.drawBorders(java.awt.geom.Rectangle2D$Float,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractPathOrientedRenderer.renderViewport(org.apache.fop.area.inline.Viewport)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRenderer.getFontResolver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.java2d.Java2DRenderer.startVParea(org.apache.fop.area.CTM,java.awt.geom.Rectangle2D)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.print.PrintRenderer.setUserAgent(org.apache.fop.apps.FOUserAgent)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.PrintRenderer.getFontList()`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRenderer.getFontList()`

## org.apache.fop.render.print.PrintRendererMaker

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.print.PrintRendererMaker.getConfigurator(org.apache.fop.apps.FOUserAgent)`

## org.apache.fop.render.ps.AbstractPSTranscoder

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.svg.AbstractFOPTranscoder.userAgent`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.svg.AbstractFOPTranscoder.createUserAgent()`
+ NEW RETURN TYPE: `org.apache.fop.svg.AbstractFOPTranscoder.createUserAgent()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.svg.AbstractFOPTranscoder.createUserAgent()`
+ NEW RETURN TYPE: `org.apache.fop.svg.AbstractFOPTranscoder.createUserAgent()`

## org.apache.fop.render.ps.EPSTranscoder

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.svg.AbstractFOPTranscoder.userAgent`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.svg.AbstractFOPTranscoder.createUserAgent()`
+ NEW RETURN TYPE: `org.apache.fop.svg.AbstractFOPTranscoder.createUserAgent()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.svg.AbstractFOPTranscoder.createUserAgent()`
+ NEW RETURN TYPE: `org.apache.fop.svg.AbstractFOPTranscoder.createUserAgent()`

## org.apache.fop.render.ps.NativeTextHandler

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.ps.NativeTextHandler.drawString(java.lang.String,float,float)`

## org.apache.fop.render.ps.PSBatikFlowTextElementBridge

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.ps.PSBatikFlowTextElementBridge.getTextPainter()`
+ NEW RETURN TYPE: `org.apache.fop.render.ps.PSBatikFlowTextElementBridge.getTextPainter()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.render.ps.PSBatikFlowTextElementBridge.getTextPainter()`
+ NEW RETURN TYPE: `org.apache.fop.render.ps.PSBatikFlowTextElementBridge.getTextPainter()`

## org.apache.fop.render.ps.PSBorderPainter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.render.ps.PSBorderPainter`

## org.apache.fop.render.ps.PSConfigurationConstants

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.render.ps.PSConfigurationConstants`

## org.apache.fop.render.ps.PSDocumentHandler

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.ps.PSDocumentHandler.<init>()`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.ps.PSDocumentHandler.gen`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.ps.PSDocumentHandler.psUtil`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.ps.PSDocumentHandler.setContext(org.apache.fop.render.intermediate.IFContext)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.ps.PSDocumentHandler.getPSResourceForFontKey(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.render.ps.PSDocumentHandler.getPSResourceForFontKey(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.render.ps.PSDocumentHandler.getPSResourceForFontKey(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.render.ps.PSDocumentHandler.getPSResourceForFontKey(java.lang.String)`

## org.apache.fop.render.ps.PSDocumentHandlerMaker

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.ps.PSDocumentHandlerMaker.makeIFDocumentHandler(org.apache.fop.apps.FOUserAgent)`

## org.apache.fop.render.ps.PSEventProducer

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.ps.PSEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.ps.PSEventProducer.postscriptLevel3Needed(java.lang.Object)`

## org.apache.fop.render.ps.PSEventProducer$Provider

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.render.ps.PSEventProducer$Provider`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.render.ps.PSEventProducer$Provider`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.ps.PSEventProducer$Provider.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.ps.PSEventProducer$Provider.get(org.apache.fop.events.EventBroadcaster)`

## org.apache.fop.render.ps.PSFontUtils

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.ps.PSFontUtils.log`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.ps.PSFontUtils.determineSuppliedFonts(org.apache.xmlgraphics.ps.dsc.ResourceTracker,org.apache.fop.fonts.FontInfo,java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.ps.PSFontUtils.embedFont(org.apache.xmlgraphics.ps.PSGenerator,org.apache.fop.fonts.Typeface,org.apache.xmlgraphics.ps.PSResource)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.ps.PSFontUtils.writeFontDict(org.apache.xmlgraphics.ps.PSGenerator,org.apache.fop.fonts.FontInfo,java.util.Map)`

## org.apache.fop.render.ps.PSGraphics2DAdapter

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.ps.PSGraphics2DAdapter.<init>(org.apache.fop.render.ps.PSRenderer)`

## org.apache.fop.render.ps.PSPainter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.AbstractIFPainter.getFopFactory()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.intermediate.AbstractIFPainter.startGroup(java.awt.geom.AffineTransform[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.ps.PSPainter.drawBorderRect(java.awt.Rectangle,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.ps.PSPainter.drawText(int,int,int,int,int[],java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.ps.PSPainter.startGroup(java.awt.geom.AffineTransform)`

## org.apache.fop.render.ps.PSRenderer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.render.ps.PSRenderer`

## org.apache.fop.render.ps.PSRendererConfigurator

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.ps.PSRendererConfigurator.<init>(org.apache.fop.apps.FOUserAgent)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.AbstractConfigurator.userAgent`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.PrintRendererConfigurator.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.render.AbstractRendererConfigurator.getType()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NOW THROWS: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NOW THROWS: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.render.AbstractRendererConfigurator.getType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractConfigurator.getConfig(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRendererConfigurator.buildFontList(org.apache.avalon.framework.configuration.Configuration,org.apache.fop.fonts.FontResolver,org.apache.fop.fonts.FontEventListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRendererConfigurator.setupFontInfo(org.apache.fop.render.intermediate.IFDocumentHandler,org.apache.fop.fonts.FontInfo)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.ps.PSRendererConfigurator`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.ps.PSRendererConfigurator`

## org.apache.fop.render.ps.PSRendererMaker

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.render.ps.PSRendererMaker`

## org.apache.fop.render.ps.PSRenderingUtil

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.ps.PSConfigurationConstants.AUTO_ROTATE_LANDSCAPE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.ps.PSConfigurationConstants.LANGUAGE_LEVEL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.ps.PSConfigurationConstants.OPTIMIZE_RESOURCES`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.ps.PSRenderingUtil`

## org.apache.fop.render.ps.PSSVGFlowRootElementBridge

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.ps.PSSVGFlowRootElementBridge.getTextPainter()`
+ NEW RETURN TYPE: `org.apache.fop.render.ps.PSSVGFlowRootElementBridge.getTextPainter()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.render.ps.PSSVGFlowRootElementBridge.getTextPainter()`
+ NEW RETURN TYPE: `org.apache.fop.render.ps.PSSVGFlowRootElementBridge.getTextPainter()`

## org.apache.fop.render.ps.PSTextElementBridge

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.ps.PSTextElementBridge.<init>(org.apache.batik.gvt.TextPainter)`

## org.apache.fop.render.ps.PSTextPainter

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.svg.NativeTextPainter.log`

### FIELD_NOW_STATIC [binary ✗ | source ✓]
- FIELD (now static): `org.apache.fop.svg.NativeTextPainter.log`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.ps.PSTextPainter.paintTextRun(org.apache.batik.gvt.renderer.StrokingTextPainter$TextRun,java.awt.Graphics2D)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.NativeTextPainter.findFonts(java.text.AttributedCharacterIterator)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.NativeTextPainter.logCharacter(char,org.apache.batik.gvt.text.TextSpanLayout,int,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.NativeTextPainter.logTextRun(java.text.AttributedCharacterIterator,org.apache.batik.gvt.text.TextSpanLayout)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.ps.PSTextPainter`

## org.apache.fop.render.ps.PSTranscoder

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.svg.AbstractFOPTranscoder.userAgent`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.svg.AbstractFOPTranscoder.createUserAgent()`
+ NEW RETURN TYPE: `org.apache.fop.svg.AbstractFOPTranscoder.createUserAgent()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.svg.AbstractFOPTranscoder.createUserAgent()`
+ NEW RETURN TYPE: `org.apache.fop.svg.AbstractFOPTranscoder.createUserAgent()`

## org.apache.fop.render.ps.ResourceHandler

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.ps.ResourceHandler.<init>(org.apache.fop.apps.FOUserAgent,org.apache.fop.fonts.FontInfo,org.apache.xmlgraphics.ps.dsc.ResourceTracker,java.util.Map)`

## org.apache.fop.render.ps.extensions.AbstractPSCommentElement

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

## org.apache.fop.render.ps.extensions.AbstractPSExtensionElement

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

## org.apache.fop.render.ps.extensions.AbstractPSExtensionObject

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

## org.apache.fop.render.ps.extensions.PSCommentAfterElement

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

## org.apache.fop.render.ps.extensions.PSCommentBeforeElement

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

## org.apache.fop.render.ps.extensions.PSExtensionElementMapping

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.fo.ElementMapping.getTable()`
+ NEW RETURN TYPE: `org.apache.fop.fo.ElementMapping.getTable()`

## org.apache.fop.render.ps.extensions.PSExtensionHandler

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.ps.extensions.PSExtensionHandler.log`

## org.apache.fop.render.ps.extensions.PSPageSetupCodeElement

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

## org.apache.fop.render.ps.extensions.PSSetPageDeviceElement

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

## org.apache.fop.render.ps.extensions.PSSetupCodeElement

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.fo.FONode.log`

## org.apache.fop.render.rtf.FOPRtfAttributes

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfAttributes.clone()`
+ NOW THROWS: `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfAttributes.clone()`

## org.apache.fop.render.rtf.RTFEventProducer$Provider

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.render.rtf.RTFEventProducer$Provider`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.render.rtf.RTFEventProducer$Provider`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.rtf.RTFEventProducer$Provider.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.render.rtf.RTFEventProducer$Provider.get(org.apache.fop.events.EventBroadcaster)`

## org.apache.fop.render.rtf.RTFHandler

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.fo.FOEventHandler.characters(char[],int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.rtf.RTFHandler.endLink()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.rtf.RTFHandler.endListBody()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.rtf.RTFHandler.endListLabel()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.rtf.RTFHandler.endStatic()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.rtf.RTFHandler.foreignObject(org.apache.fop.fo.flow.InstreamForeignObject)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.rtf.RTFHandler.leader(org.apache.fop.fo.flow.Leader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.rtf.RTFHandler.startListBody()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.rtf.RTFHandler.startListLabel()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.rtf.RTFHandler.startStatic()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.rtf.RTFHandler.text(org.apache.fop.fo.FOText,char[],int,int)`

## org.apache.fop.render.rtf.rtflib.rtfdoc.IRtfHyperLinkContainer

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.rtf.rtflib.rtfdoc.IRtfTextContainer.getTextContainerAttributes()`
+ NOW THROWS: `org.apache.fop.render.rtf.rtflib.rtfdoc.IRtfTextContainer.getTextContainerAttributes()`

## org.apache.fop.render.rtf.rtflib.rtfdoc.IRtfTextContainer

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.rtf.rtflib.rtfdoc.IRtfTextContainer.getTextContainerAttributes()`
+ NOW THROWS: `org.apache.fop.render.rtf.rtflib.rtfdoc.IRtfTextContainer.getTextContainerAttributes()`

## org.apache.fop.render.rtf.rtflib.rtfdoc.ParagraphKeeptogetherContext

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.rtf.rtflib.rtfdoc.ParagraphKeeptogetherContext.getInstance()`

## org.apache.fop.render.rtf.rtflib.rtfdoc.RtfAttributes

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfAttributes.clone()`
+ NOW THROWS: `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfAttributes.clone()`

## org.apache.fop.render.rtf.rtflib.rtfdoc.RtfExternalGraphic

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfExternalGraphic.heightPercent`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfExternalGraphic.widthPercent`

## org.apache.fop.render.rtf.rtflib.rtfdoc.RtfHyperLink

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfHyperLink.getTextContainerAttributes()`
+ NOW THROWS: `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfHyperLink.getTextContainerAttributes()`

## org.apache.fop.render.rtf.rtflib.rtfdoc.RtfListItem$RtfListItemLabel

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfTextrun.popBlockAttributes()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfTextrun.addParagraphBreak()`
+ NEW RETURN TYPE: `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfTextrun.addParagraphBreak()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfTextrun.addParagraphBreak()`
+ NEW RETURN TYPE: `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfTextrun.addParagraphBreak()`

## org.apache.fop.render.rtf.rtflib.rtfdoc.RtfParagraph

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfParagraph.getTextContainerAttributes()`
+ NOW THROWS: `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfParagraph.getTextContainerAttributes()`

## org.apache.fop.render.rtf.rtflib.rtfdoc.RtfTable

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfTable.newTableRow(org.apache.fop.render.rtf.rtflib.rtfdoc.RtfAttributes)`
+ NOW THROWS: `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfTable.newTableRow(org.apache.fop.render.rtf.rtflib.rtfdoc.RtfAttributes)`

## org.apache.fop.render.rtf.rtflib.rtfdoc.RtfTableRow

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfTableRow.newTableCellMergedHorizontally(int,org.apache.fop.render.rtf.rtflib.rtfdoc.RtfAttributes)`
+ NOW THROWS: `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfTableRow.newTableCellMergedHorizontally(int,org.apache.fop.render.rtf.rtflib.rtfdoc.RtfAttributes)`

## org.apache.fop.render.rtf.rtflib.rtfdoc.RtfText

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfText.getTextContainerAttributes()`
+ NOW THROWS: `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfText.getTextContainerAttributes()`

## org.apache.fop.render.rtf.rtflib.rtfdoc.RtfTextrun

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfTextrun.popBlockAttributes()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfTextrun.addParagraphBreak()`
+ NEW RETURN TYPE: `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfTextrun.addParagraphBreak()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfTextrun.addParagraphBreak()`
+ NEW RETURN TYPE: `org.apache.fop.render.rtf.rtflib.rtfdoc.RtfTextrun.addParagraphBreak()`

## org.apache.fop.render.rtf.rtflib.tools.BuilderContext

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.rtf.rtflib.tools.BuilderContext.popContainer()`

## org.apache.fop.render.txt.TXTRenderer

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.txt.TXTRenderer.<init>()`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.AbstractRenderer.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.PrintRenderer.fontResolver`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.PrintRenderer.addFontList(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.PrintRenderer.setFontList(java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractPathOrientedRenderer.drawBorders(float,float,float,float,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractPathOrientedRenderer.drawBorders(java.awt.geom.Rectangle2D$Float,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps,org.apache.fop.traits.BorderProps)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractPathOrientedRenderer.renderViewport(org.apache.fop.area.inline.Viewport)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractRenderer.setUserAgent(org.apache.fop.apps.FOUserAgent)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRenderer.getFontResolver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.txt.TXTRenderer.startVParea(org.apache.fop.area.CTM,java.awt.geom.Rectangle2D)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.PrintRenderer.getFontList()`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRenderer.getFontList()`

## org.apache.fop.render.txt.TXTRendererConfigurator

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.txt.TXTRendererConfigurator.<init>(org.apache.fop.apps.FOUserAgent)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.AbstractConfigurator.userAgent`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.PrintRendererConfigurator.log`

### METHOD_NOW_STATIC [binary ✗ | source ✓]
- METHOD (now static): `org.apache.fop.render.AbstractRendererConfigurator.getType()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NOW THROWS: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NOW THROWS: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### METHOD_OVERRIDABLE_NOW_STATIC [binary ✓ | source ✗]
- METHOD (overridable, now static): `org.apache.fop.render.AbstractRendererConfigurator.getType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractConfigurator.getConfig(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRendererConfigurator.buildFontList(org.apache.avalon.framework.configuration.Configuration,org.apache.fop.fonts.FontResolver,org.apache.fop.fonts.FontEventListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRendererConfigurator.setupFontInfo(org.apache.fop.render.intermediate.IFDocumentHandler,org.apache.fop.fonts.FontInfo)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.render.AbstractRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRendererConfigurator.getRendererConfig(org.apache.fop.render.Renderer)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.txt.TXTRendererConfigurator`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.render.txt.TXTRendererConfigurator`

## org.apache.fop.render.txt.TXTRendererMaker

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.txt.TXTRendererMaker.getConfigurator(org.apache.fop.apps.FOUserAgent)`

## org.apache.fop.render.txt.border.AbstractBorderElement

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

## org.apache.fop.render.txt.border.DashedBorderElement

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

## org.apache.fop.render.txt.border.DottedBorderElement

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

## org.apache.fop.render.txt.border.SolidAndDoubleBorderElement

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

## org.apache.fop.render.xml.AbstractXMLRenderer

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.xml.AbstractXMLRenderer.<init>()`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.AbstractRenderer.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.PrintRenderer.fontResolver`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.PrintRenderer.addFontList(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.PrintRenderer.setFontList(java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractRenderer.renderViewport(org.apache.fop.area.inline.Viewport)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractRenderer.setUserAgent(org.apache.fop.apps.FOUserAgent)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.AbstractRenderer.startVParea(org.apache.fop.area.CTM,java.awt.geom.Rectangle2D)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRenderer.getFontResolver()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.PrintRenderer.getFontList()`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRenderer.getFontList()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.xml.AbstractXMLRenderer`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.AbstractRenderer.startVParea(org.apache.fop.area.CTM,java.awt.Rectangle)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.xml.AbstractXMLRenderer`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.AbstractRenderer.endLayer()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.render.xml.AbstractXMLRenderer`
+ MUST NOW IMPLEMENT: `org.apache.fop.render.AbstractRenderer.startLayer(java.lang.String)`

## org.apache.fop.render.xml.XMLRenderer

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.render.xml.XMLRenderer.<init>()`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.render.AbstractRenderer.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_DISTRIBUTE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.EN_X_FILL`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_BLOCK_PROGRESSION_UNIT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.fo.Constants.PR_X_PTR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.render.PrintRenderer.fontResolver`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.PrintRenderer.addFontList(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.render.PrintRenderer.setFontList(java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.PrintRenderer.getFontResolver()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.xml.XMLRenderer.renderViewport(org.apache.fop.area.inline.Viewport)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.xml.XMLRenderer.setUserAgent(org.apache.fop.apps.FOUserAgent)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.xml.XMLRenderer.startVParea(org.apache.fop.area.CTM,java.awt.geom.Rectangle2D)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.render.PrintRenderer.getFontList()`
+ NEW RETURN TYPE: `org.apache.fop.render.PrintRenderer.getFontList()`

## org.apache.fop.render.xml.XMLRendererMaker

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.render.xml.XMLRendererMaker.getConfigurator(org.apache.fop.apps.FOUserAgent)`

## org.apache.fop.servlet.FopPrintServlet

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.servlet.FopServlet.configureFopFactory()`

## org.apache.fop.servlet.FopServlet

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.servlet.FopServlet.configureFopFactory()`

## org.apache.fop.svg.AbstractFOPImageElementBridge$Graphics2DNode

### CLASS_NOW_STATIC [binary ✗ | source ✗]
- CLASS (now static): `org.apache.fop.svg.AbstractFOPImageElementBridge$Graphics2DNode`

## org.apache.fop.svg.AbstractFOPTextElementBridge

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.svg.AbstractFOPTextElementBridge.<init>(org.apache.batik.gvt.TextPainter)`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.fop.svg.AbstractFOPTextElementBridge.textPainter`
+ NEW FIELD: `org.apache.fop.svg.AbstractFOPTextElementBridge.textPainter`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.fop.svg.AbstractFOPTextElementBridge.textPainter`
+ NEW FIELD: `org.apache.fop.svg.AbstractFOPTextElementBridge.textPainter`

## org.apache.fop.svg.AbstractFOPTextPainter

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.svg.AbstractFOPTextPainter.<init>(org.apache.fop.svg.FOPTextHandler)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.svg.AbstractFOPTextPainter.PROXY_PAINTER`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.getBounds2D(org.apache.batik.gvt.TextNode)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.getGeometryBounds(org.apache.batik.gvt.TextNode)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.getHighlightShape(org.apache.batik.gvt.text.Mark,org.apache.batik.gvt.text.Mark)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.getMark(org.apache.batik.gvt.TextNode,int,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.getOutline(org.apache.batik.gvt.TextNode)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.getSelected(org.apache.batik.gvt.text.Mark,org.apache.batik.gvt.text.Mark)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.paint(org.apache.batik.gvt.TextNode,java.awt.Graphics2D)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.paintTextRun(org.apache.batik.gvt.renderer.StrokingTextPainter$TextRun,java.awt.Graphics2D,java.awt.geom.Point2D)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.paintTextRuns(java.util.List,java.awt.Graphics2D,java.awt.geom.Point2D)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.selectAt(double,double,org.apache.batik.gvt.TextNode)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.selectFirst(org.apache.batik.gvt.TextNode)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.selectLast(org.apache.batik.gvt.TextNode)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.AbstractFOPTextPainter.selectTo(double,double,org.apache.batik.gvt.text.Mark)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.svg.AbstractFOPTextPainter`

## org.apache.fop.svg.AbstractFOPTranscoder

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.svg.AbstractFOPTranscoder.userAgent`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.svg.AbstractFOPTranscoder.createUserAgent()`
+ NEW RETURN TYPE: `org.apache.fop.svg.AbstractFOPTranscoder.createUserAgent()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.svg.AbstractFOPTranscoder.createUserAgent()`
+ NEW RETURN TYPE: `org.apache.fop.svg.AbstractFOPTranscoder.createUserAgent()`

## org.apache.fop.svg.FOPSAXSVGDocumentFactory

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.svg.FOPSAXSVGDocumentFactory`

## org.apache.fop.svg.NativeTextPainter

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.svg.NativeTextPainter.log`

### FIELD_NOW_STATIC [binary ✗ | source ✓]
- FIELD (now static): `org.apache.fop.svg.NativeTextPainter.log`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.NativeTextPainter.findFonts(java.text.AttributedCharacterIterator)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.NativeTextPainter.logCharacter(char,org.apache.batik.gvt.text.TextSpanLayout,int,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.NativeTextPainter.logTextRun(java.text.AttributedCharacterIterator,org.apache.batik.gvt.text.TextSpanLayout)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.NativeTextPainter.paintTextRun(org.apache.batik.gvt.renderer.StrokingTextPainter$TextRun,java.awt.Graphics2D)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.svg.NativeTextPainter`
+ MUST NOW IMPLEMENT: `org.apache.fop.svg.NativeTextPainter.restoreGraphicsState()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.svg.NativeTextPainter`
+ MUST NOW IMPLEMENT: `org.apache.fop.svg.NativeTextPainter.positionGlyph(java.awt.geom.Point2D,java.awt.geom.Point2D,boolean)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.svg.NativeTextPainter`
+ MUST NOW IMPLEMENT: `org.apache.fop.svg.NativeTextPainter.saveGraphicsState()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.svg.NativeTextPainter`
+ MUST NOW IMPLEMENT: `org.apache.fop.svg.NativeTextPainter.writeGlyph(char,java.awt.geom.AffineTransform)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.svg.NativeTextPainter`
+ MUST NOW IMPLEMENT: `org.apache.fop.svg.NativeTextPainter.endTextObject()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.svg.NativeTextPainter`
+ MUST NOW IMPLEMENT: `org.apache.fop.svg.NativeTextPainter.clip(java.awt.Shape)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.svg.NativeTextPainter`
+ MUST NOW IMPLEMENT: `org.apache.fop.svg.NativeTextPainter.beginTextObject()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.svg.NativeTextPainter`
+ MUST NOW IMPLEMENT: `org.apache.fop.svg.NativeTextPainter.preparePainting(java.awt.Graphics2D)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.svg.NativeTextPainter`
+ MUST NOW IMPLEMENT: `org.apache.fop.svg.NativeTextPainter.setInitialTransform(java.awt.geom.AffineTransform)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.svg.NativeTextPainter`

## org.apache.fop.svg.PDFBatikFlowTextElementBridge

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.svg.PDFBatikFlowTextElementBridge.getTextPainter()`
+ NEW RETURN TYPE: `org.apache.fop.svg.PDFBatikFlowTextElementBridge.getTextPainter()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.svg.PDFBatikFlowTextElementBridge.getTextPainter()`
+ NEW RETURN TYPE: `org.apache.fop.svg.PDFBatikFlowTextElementBridge.getTextPainter()`

## org.apache.fop.svg.PDFDocumentGraphics2D

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.fop.svg.PDFGraphics2D.pageRef`
+ NEW FIELD: `org.apache.fop.svg.PDFGraphics2D.pageRef`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.fop.svg.PDFGraphics2D.pageRef`
+ NEW FIELD: `org.apache.fop.svg.PDFGraphics2D.pageRef`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.PDFGraphics2D.checkTransparencyAllowed()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.svg.PDFGraphics2D.getPageReference()`
+ NEW RETURN TYPE: `org.apache.fop.svg.PDFGraphics2D.getPageReference()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.svg.PDFGraphics2D.getPageReference()`
+ NEW RETURN TYPE: `org.apache.fop.svg.PDFGraphics2D.getPageReference()`

## org.apache.fop.svg.PDFDocumentGraphics2DConfigurator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.PDFDocumentGraphics2DConfigurator.configure(org.apache.fop.svg.PDFDocumentGraphics2D,org.apache.avalon.framework.configuration.Configuration)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.PDFDocumentGraphics2DConfigurator.createFontInfo(org.apache.avalon.framework.configuration.Configuration)`

## org.apache.fop.svg.PDFFlowExtTextPainter

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.svg.NativeTextPainter.log`

### FIELD_NOW_STATIC [binary ✗ | source ✓]
- FIELD (now static): `org.apache.fop.svg.NativeTextPainter.log`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.NativeTextPainter.findFonts(java.text.AttributedCharacterIterator)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.NativeTextPainter.logCharacter(char,org.apache.batik.gvt.text.TextSpanLayout,int,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.NativeTextPainter.logTextRun(java.text.AttributedCharacterIterator,org.apache.batik.gvt.text.TextSpanLayout)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.PDFFlowExtTextPainter.getTextRuns(org.apache.batik.gvt.TextNode,java.text.AttributedCharacterIterator)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.PDFTextPainter.paintTextRun(org.apache.batik.gvt.renderer.StrokingTextPainter$TextRun,java.awt.Graphics2D)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.svg.PDFFlowExtTextPainter`

## org.apache.fop.svg.PDFFlowTextPainter

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.svg.NativeTextPainter.log`

### FIELD_NOW_STATIC [binary ✗ | source ✓]
- FIELD (now static): `org.apache.fop.svg.NativeTextPainter.log`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.NativeTextPainter.findFonts(java.text.AttributedCharacterIterator)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.NativeTextPainter.logCharacter(char,org.apache.batik.gvt.text.TextSpanLayout,int,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.NativeTextPainter.logTextRun(java.text.AttributedCharacterIterator,org.apache.batik.gvt.text.TextSpanLayout)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.PDFFlowTextPainter.getTextRuns(org.apache.batik.gvt.TextNode,java.text.AttributedCharacterIterator)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.PDFTextPainter.paintTextRun(org.apache.batik.gvt.renderer.StrokingTextPainter$TextRun,java.awt.Graphics2D)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.fop.svg.PDFFlowTextPainter`

## org.apache.fop.svg.PDFGraphics2D

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.svg.PDFGraphics2D.<init>(boolean,org.apache.fop.fonts.FontInfo,org.apache.fop.pdf.PDFDocument,org.apache.fop.pdf.PDFResourceContext,java.lang.String,java.lang.String,float)`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.fop.svg.PDFGraphics2D.pageRef`
+ NEW FIELD: `org.apache.fop.svg.PDFGraphics2D.pageRef`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.fop.svg.PDFGraphics2D.pageRef`
+ NEW FIELD: `org.apache.fop.svg.PDFGraphics2D.pageRef`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.PDFGraphics2D.checkTransparencyAllowed()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.svg.PDFGraphics2D.getPageReference()`
+ NEW RETURN TYPE: `org.apache.fop.svg.PDFGraphics2D.getPageReference()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.svg.PDFGraphics2D.getPageReference()`
+ NEW RETURN TYPE: `org.apache.fop.svg.PDFGraphics2D.getPageReference()`

## org.apache.fop.svg.PDFSVGFlowRootElementBridge

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.svg.PDFSVGFlowRootElementBridge.getTextPainter()`
+ NEW RETURN TYPE: `org.apache.fop.svg.PDFSVGFlowRootElementBridge.getTextPainter()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.svg.PDFSVGFlowRootElementBridge.getTextPainter()`
+ NEW RETURN TYPE: `org.apache.fop.svg.PDFSVGFlowRootElementBridge.getTextPainter()`

## org.apache.fop.svg.PDFTextElementBridge

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.svg.PDFTextElementBridge.<init>(org.apache.batik.gvt.TextPainter)`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.fop.svg.AbstractFOPTextElementBridge.textPainter`
+ NEW FIELD: `org.apache.fop.svg.AbstractFOPTextElementBridge.textPainter`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.fop.svg.AbstractFOPTextElementBridge.textPainter`
+ NEW FIELD: `org.apache.fop.svg.AbstractFOPTextElementBridge.textPainter`

## org.apache.fop.svg.PDFTextUtil

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFTextUtil.restoreGraphicsState()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.pdf.PDFTextUtil.saveGraphicsState()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.PDFTextUtil.selectFontForChar(char)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.PDFTextUtil.setFont(org.apache.fop.fonts.Font)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.PDFTextUtil.setFonts(org.apache.fop.fonts.Font[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.svg.PDFTextUtil.writeTJChar(char)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.svg.PDFTextUtil`
+ MUST NOW IMPLEMENT: `org.apache.fop.pdf.PDFTextUtil.write(java.lang.StringBuffer)`

## org.apache.fop.svg.PDFTranscoder

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.svg.AbstractFOPTranscoder.userAgent`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.svg.PDFTranscoder.createUserAgent()`
+ NEW RETURN TYPE: `org.apache.fop.svg.PDFTranscoder.createUserAgent()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.fop.svg.PDFTranscoder.createUserAgent()`
+ NEW RETURN TYPE: `org.apache.fop.svg.PDFTranscoder.createUserAgent()`

## org.apache.fop.svg.SVGEventProducer

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.svg.SVGEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.svg.SVGEventProducer.transparencyIgnored(java.lang.Object,java.lang.Object,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.fop.svg.SVGEventProducer`
+ MUST NOW IMPLEMENT: `org.apache.fop.svg.SVGEventProducer.bitmapWithTransparency(java.lang.Object,java.lang.Object,java.lang.String)`

## org.apache.fop.svg.SVGEventProducer$Provider

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.svg.SVGEventProducer$Provider`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.svg.SVGEventProducer$Provider`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.svg.SVGEventProducer$Provider.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.svg.SVGEventProducer$Provider.get(org.apache.fop.events.EventBroadcaster)`

## org.apache.fop.svg.SVGUserAgent

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.svg.SVGUserAgent.<init>(org.apache.fop.apps.FOUserAgent)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.svg.SVGUserAgent.<init>(org.apache.fop.apps.FOUserAgent,java.awt.geom.AffineTransform)`

## org.apache.fop.svg.SVGUtilities

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.svg.SVGUtilities`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.svg.SVGUtilities`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.svg.SVGUtilities.<init>()`

## org.apache.fop.svg.SimpleSVGUserAgent

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.svg.SimpleSVGUserAgent.<init>(float,java.awt.geom.AffineTransform)`

## org.apache.fop.text.linebreak.LineBreakUtils

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.text.linebreak.LineBreakUtils`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.text.linebreak.LineBreakUtils.<init>()`

## org.apache.fop.tools.fontlist.FontSpec

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.tools.fontlist.FontSpec.addFamilyNames(java.util.Collection)`

## org.apache.fop.traits.BorderProps

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.traits.BorderProps.<init>(int,int,java.awt.Color,int)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.traits.BorderProps.<init>(java.lang.String,int,java.awt.Color,int)`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.traits.BorderProps.color`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.traits.BorderProps.style`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.apache.fop.traits.BorderProps.width`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.traits.BorderProps.COLLAPSE_INNER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.traits.BorderProps.COLLAPSE_OUTER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.traits.BorderProps.SEPARATE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.fop.traits.BorderProps.mode`

## org.apache.fop.util.AbstractPaintingState

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.util.AbstractPaintingState.saveAll(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.util.AbstractPaintingState.getStateStack()`
+ NEW RETURN TYPE: `org.apache.fop.util.AbstractPaintingState.getStateStack()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.fop.util.AbstractPaintingState.restoreAll()`
+ NEW RETURN TYPE: `org.apache.fop.util.AbstractPaintingState.restoreAll()`

## org.apache.fop.util.CharUtilities

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.util.CharUtilities.classOf(char)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.util.CharUtilities.isAdjustableSpace(char)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.util.CharUtilities.isAlphabetic(char)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.util.CharUtilities.isAnySpace(char)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.util.CharUtilities.isBreakableSpace(char)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.util.CharUtilities.isExplicitBreak(char)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.util.CharUtilities.isFixedWidthSpace(char)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.util.CharUtilities.isNonBreakableSpace(char)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.util.CharUtilities.isZeroWidthSpace(char)`

## org.apache.fop.util.ColorProfileUtil

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.util.ColorProfileUtil`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.util.ColorProfileUtil`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.util.ColorProfileUtil.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.util.ColorProfileUtil.getICCProfileDescription(java.awt.color.ICC_Profile)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.util.ColorProfileUtil.isDefaultsRGB(java.awt.color.ICC_Profile)`

## org.apache.fop.util.ColorSpaceCache

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.util.ColorSpaceCache.<init>(javax.xml.transform.URIResolver)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.util.ColorSpaceCache.get(java.lang.String,java.lang.String)`

## org.apache.fop.util.CommandLineLogger

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.util.CommandLineLogger`

## org.apache.fop.util.ConversionUtils

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.util.ConversionUtils`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.util.ConversionUtils.<init>()`

## org.apache.fop.util.DataURLUtil

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.util.DataURLUtil`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.util.DataURLUtil`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.util.DataURLUtil.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.util.DataURLUtil.createDataURL(java.io.InputStream,java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.util.DataURLUtil.writeDataURL(java.io.InputStream,java.lang.String,java.io.Writer)`

## org.apache.fop.util.DecimalFormatCache

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.fop.util.DecimalFormatCache`

## org.apache.fop.util.GenerationHelperContentHandler

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.util.GenerationHelperContentHandler.<init>(org.xml.sax.ContentHandler,java.lang.String)`

## org.apache.fop.util.ListUtil

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.util.ListUtil.getLast(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.util.ListUtil.removeLast(java.util.List)`

## org.apache.fop.util.LogUtil

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.util.LogUtil`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.util.LogUtil`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.util.LogUtil.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.util.LogUtil.handleError(org.apache.commons.logging.Log,java.lang.String,boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.util.LogUtil.handleException(org.apache.commons.logging.Log,java.lang.Exception,boolean)`

## org.apache.fop.util.UnitConv

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.util.UnitConv`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.util.UnitConv.<init>()`

## org.apache.fop.util.XMLUtil

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.util.XMLUtil`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.util.XMLUtil`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.util.XMLUtil.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.util.XMLUtil.addAttribute(org.xml.sax.helpers.AttributesImpl,java.lang.String,java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.util.XMLUtil.addAttribute(org.xml.sax.helpers.AttributesImpl,org.apache.xmlgraphics.util.QName,java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.util.XMLUtil.getAttributeAsBoolean(org.xml.sax.Attributes,java.lang.String,boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.util.XMLUtil.getAttributeAsInt(org.xml.sax.Attributes,java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.util.XMLUtil.getAttributeAsInt(org.xml.sax.Attributes,java.lang.String,int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.util.XMLUtil.getAttributeAsIntArray(org.xml.sax.Attributes,java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.util.XMLUtil.getAttributeAsInteger(org.xml.sax.Attributes,java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.util.XMLUtil.getAttributeAsRectangle(org.xml.sax.Attributes,java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.util.XMLUtil.getAttributeAsRectangle2D(org.xml.sax.Attributes,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.util.XMLUtil.convertRFC3066ToLocale(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.fop.util.XMLUtil.toRFC3066(java.util.Locale)`

## org.apache.fop.util.bitmap.BitmapImageUtil

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.util.bitmap.BitmapImageUtil`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.util.bitmap.BitmapImageUtil`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.util.bitmap.BitmapImageUtil.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.util.bitmap.BitmapImageUtil.createDefaultMonochromeBitmapConverter()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.util.bitmap.BitmapImageUtil.toBufferedImage(java.awt.image.RenderedImage)`

## org.apache.fop.util.bitmap.DitherUtil

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.fop.util.bitmap.DitherUtil`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.fop.util.bitmap.DitherUtil`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.fop.util.bitmap.DitherUtil.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.util.bitmap.DitherUtil.getBayerBasePattern(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.util.bitmap.DitherUtil.getBayerDither(int,int,boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.fop.util.bitmap.DitherUtil.getBayerDither(int,java.awt.Color,boolean)`

## org.apache.fop.util.text.AdvancedMessageFormat

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.util.text.AdvancedMessageFormat.format(java.util.Map)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.util.text.AdvancedMessageFormat.format(java.util.Map,java.lang.StringBuffer)`

## org.apache.fop.util.text.AdvancedMessageFormat$Function

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.util.text.AdvancedMessageFormat$Function.evaluate(java.util.Map)`

## org.apache.fop.util.text.AdvancedMessageFormat$Part

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.util.text.AdvancedMessageFormat$Part.isGenerated(java.util.Map)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.fop.util.text.AdvancedMessageFormat$Part.write(java.lang.StringBuffer,java.util.Map)`

