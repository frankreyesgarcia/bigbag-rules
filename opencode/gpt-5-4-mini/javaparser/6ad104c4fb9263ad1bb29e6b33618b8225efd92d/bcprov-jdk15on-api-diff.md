# Breaking Changes: org.bouncycastle:bcprov-jdk15on 1.51 → 1.67
Total: 1833 (binary-breaking: 1694, source-breaking: 1795)

## org.bouncycastle.LICENSE

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.bouncycastle.LICENSE.licenseText`

## org.bouncycastle.apache.bzip2.BZip2Constants

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.apache.bzip2.BZip2Constants`

## org.bouncycastle.apache.bzip2.CBZip2InputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.apache.bzip2.CBZip2InputStream`

## org.bouncycastle.apache.bzip2.CBZip2OutputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.apache.bzip2.CBZip2OutputStream`

## org.bouncycastle.asn1.ASN1Boolean

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.bouncycastle.asn1.ASN1Boolean`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.bouncycastle.asn1.ASN1Boolean`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.ASN1Boolean.<init>(boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Boolean.getInstance(boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Boolean.getInstance(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Boolean.getInstance(java.lang.Object)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Boolean.getInstance(org.bouncycastle.asn1.ASN1TaggedObject,boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Boolean.hashCode()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Boolean.isTrue()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Boolean.toString()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Object.getEncoded()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Object.getEncoded(java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.fromByteArray(byte[])`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Boolean.asn1Equals(org.bouncycastle.asn1.ASN1Primitive)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.hasEncodedTagValue(java.lang.Object,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ASN1Enumerated

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ASN1GeneralizedTime

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ASN1Integer

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ASN1Null

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.bouncycastle.asn1.ASN1Null`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.ASN1Null.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Null.getInstance(java.lang.Object)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Null.hashCode()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Null.toString()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Object.getEncoded()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Object.getEncoded(java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.fromByteArray(byte[])`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.hasEncodedTagValue(java.lang.Object,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ASN1Object

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ASN1ObjectIdentifier

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1ObjectIdentifier.getBody()`

## org.bouncycastle.asn1.ASN1OctetString

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ASN1OutputStream

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1OutputStream.writeNull()`

## org.bouncycastle.asn1.ASN1Primitive

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ASN1Sequence

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.asn1.ASN1Sequence.seq`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ASN1Set

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Set.sort()`

## org.bouncycastle.asn1.ASN1TaggedObject

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.asn1.ASN1TaggedObject.getObjectParser(int,boolean)`
+ NOW THROWS: `org.bouncycastle.asn1.ASN1TaggedObject.getObjectParser(int,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1TaggedObject.isEmpty()`

## org.bouncycastle.asn1.ASN1UTCTime

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.BERApplicationSpecific

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.bouncycastle.asn1.DERApplicationSpecific.getInstance(java.lang.Object)`
+ NEW RETURN TYPE: `org.bouncycastle.asn1.ASN1ApplicationSpecific.getInstance(java.lang.Object)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.bouncycastle.asn1.DERApplicationSpecific.getInstance(java.lang.Object)`
+ NEW RETURN TYPE: `org.bouncycastle.asn1.ASN1ApplicationSpecific.getInstance(java.lang.Object)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.bouncycastle.asn1.BERApplicationSpecific`

## org.bouncycastle.asn1.BERConstructedOctetString

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.asn1.BERConstructedOctetString`

## org.bouncycastle.asn1.BERGenerator

### CONSTRUCTOR_NOW_PROTECTED [binary ✗ | source ✗]
- CONSTRUCTOR (now protected, was public): `org.bouncycastle.asn1.BERGenerator.<init>(java.io.OutputStream,int,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.BERGenerator.writeBERBody(java.io.InputStream)`

## org.bouncycastle.asn1.BEROctetString

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.BEROctetString.encode(org.bouncycastle.asn1.ASN1OutputStream)`

## org.bouncycastle.asn1.BEROctetStringGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.BERGenerator.writeBERBody(java.io.InputStream)`

## org.bouncycastle.asn1.BEROutputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.asn1.BEROutputStream`

## org.bouncycastle.asn1.BERSequence

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.asn1.ASN1Sequence.seq`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.BERSequenceGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.BERGenerator.writeBERBody(java.io.InputStream)`

## org.bouncycastle.asn1.BERSet

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Set.sort()`

## org.bouncycastle.asn1.BERTaggedObject

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.asn1.ASN1TaggedObject.getObjectParser(int,boolean)`
+ NOW THROWS: `org.bouncycastle.asn1.ASN1TaggedObject.getObjectParser(int,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1TaggedObject.isEmpty()`

## org.bouncycastle.asn1.DERApplicationSpecific

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.bouncycastle.asn1.DERApplicationSpecific.getInstance(java.lang.Object)`
+ NEW RETURN TYPE: `org.bouncycastle.asn1.ASN1ApplicationSpecific.getInstance(java.lang.Object)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.bouncycastle.asn1.DERApplicationSpecific.getInstance(java.lang.Object)`
+ NEW RETURN TYPE: `org.bouncycastle.asn1.ASN1ApplicationSpecific.getInstance(java.lang.Object)`

## org.bouncycastle.asn1.DERBMPString

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.DERBitString

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.bouncycastle.asn1.DERBitString.data`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.bouncycastle.asn1.DERBitString.padBits`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.DERBitString.asn1Equals(org.bouncycastle.asn1.ASN1Primitive)`

## org.bouncycastle.asn1.DERBoolean

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.asn1.DERBoolean`

## org.bouncycastle.asn1.DEREncodableVector

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.asn1.DEREncodableVector`

## org.bouncycastle.asn1.DEREnumerated

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.asn1.DEREnumerated`

## org.bouncycastle.asn1.DERExternal

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.DERGeneralString

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.DERGeneralizedTime

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.DERIA5String

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.DERInteger

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.asn1.DERInteger`

## org.bouncycastle.asn1.DERNull

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.bouncycastle.asn1.DERNull`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.bouncycastle.asn1.DERNull`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.DERNull.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Null.getInstance(java.lang.Object)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Null.hashCode()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Null.toString()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Object.getEncoded()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Object.getEncoded(java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.fromByteArray(byte[])`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.hasEncodedTagValue(java.lang.Object,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.DERNumericString

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.DERObjectIdentifier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.asn1.DERObjectIdentifier`

## org.bouncycastle.asn1.DEROctetString

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.DEROutputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.asn1.DEROutputStream`

## org.bouncycastle.asn1.DERPrintableString

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.DERSequence

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.asn1.ASN1Sequence.seq`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.DERSequenceParser

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.asn1.DERSequenceParser`

## org.bouncycastle.asn1.DERSet

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Set.sort()`

## org.bouncycastle.asn1.DERSetParser

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.asn1.DERSetParser`

## org.bouncycastle.asn1.DERT61String

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.DERT61UTF8String

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.asn1.DERT61UTF8String`

## org.bouncycastle.asn1.DERTaggedObject

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.asn1.ASN1TaggedObject.getObjectParser(int,boolean)`
+ NOW THROWS: `org.bouncycastle.asn1.ASN1TaggedObject.getObjectParser(int,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1TaggedObject.isEmpty()`

## org.bouncycastle.asn1.DERTags

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.asn1.DERTags`

## org.bouncycastle.asn1.DERUTCTime

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.DERUTF8String

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.DERUniversalString

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.DERVisibleString

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.DLOutputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.asn1.DLOutputStream`

## org.bouncycastle.asn1.DLSequence

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.asn1.ASN1Sequence.seq`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.DLSet

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Set.sort()`

## org.bouncycastle.asn1.DLTaggedObject

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.asn1.ASN1TaggedObject.getObjectParser(int,boolean)`
+ NOW THROWS: `org.bouncycastle.asn1.ASN1TaggedObject.getObjectParser(int,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1TaggedObject.isEmpty()`

## org.bouncycastle.asn1.cmp.CAKeyUpdAnnContent

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.CMPCertificate

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.CRLAnnContent

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.CertConfirmContent

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.CertOrEncCert

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.bouncycastle.asn1.cmp.CertOrEncCert.getEncryptedCert()`
+ NEW RETURN TYPE: `org.bouncycastle.asn1.cmp.CertOrEncCert.getEncryptedCert()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.bouncycastle.asn1.cmp.CertOrEncCert.getEncryptedCert()`
+ NEW RETURN TYPE: `org.bouncycastle.asn1.cmp.CertOrEncCert.getEncryptedCert()`

## org.bouncycastle.asn1.cmp.CertRepMessage

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.CertResponse

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.CertStatus

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.CertifiedKeyPair

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.bouncycastle.asn1.cmp.CertifiedKeyPair.getPrivateKey()`
+ NEW RETURN TYPE: `org.bouncycastle.asn1.cmp.CertifiedKeyPair.getPrivateKey()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.bouncycastle.asn1.cmp.CertifiedKeyPair.getPrivateKey()`
+ NEW RETURN TYPE: `org.bouncycastle.asn1.cmp.CertifiedKeyPair.getPrivateKey()`

## org.bouncycastle.asn1.cmp.Challenge

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.ErrorMsgContent

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.GenMsgContent

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.GenRepContent

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.InfoTypeAndValue

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.KeyRecRepContent

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.OOBCertHash

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.PBMParameter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.PKIBody

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.PKIConfirmContent

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.PKIFailureInfo

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.bouncycastle.asn1.DERBitString.data`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.bouncycastle.asn1.DERBitString.padBits`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.DERBitString.asn1Equals(org.bouncycastle.asn1.ASN1Primitive)`

## org.bouncycastle.asn1.cmp.PKIFreeText

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.PKIHeader

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.PKIHeaderBuilder

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.cmp.PKIHeaderBuilder.setRecipKID(org.bouncycastle.asn1.DEROctetString)`

## org.bouncycastle.asn1.cmp.PKIMessage

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.PKIMessages

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.PKIStatus

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.PKIStatusInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.POPODecKeyChallContent

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.POPODecKeyRespContent

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.PollRepContent

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.PollReqContent

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.ProtectedPart

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.RevAnnContent

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.RevDetails

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.RevRepContent

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cmp.RevReqContent

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.Attribute

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.Attributes

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.AuthEnvelopedData

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.cms.AuthEnvelopedData.<init>(org.bouncycastle.asn1.ASN1Sequence)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.AuthenticatedData

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.cms.AuthenticatedData.<init>(org.bouncycastle.asn1.ASN1Sequence)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.AuthenticatedDataParser

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.cms.AuthenticatedDataParser.getEnapsulatedContentInfo()`

## org.bouncycastle.asn1.cms.CCMParameters

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.CompressedData

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.ContentInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.DigestedData

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.EncryptedContentInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.EncryptedData

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.EnvelopedData

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.Evidence

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.GCMParameters

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.IssuerAndSerialNumber

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.KEKIdentifier

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.KEKRecipientInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.KeyAgreeRecipientIdentifier

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.KeyAgreeRecipientInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.KeyTransRecipientInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.MetaData

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.OriginatorIdentifierOrKey

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.OriginatorInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.OriginatorPublicKey

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.OtherKeyAttribute

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.cms.OtherKeyAttribute.<init>(org.bouncycastle.asn1.ASN1Sequence)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.OtherRecipientInfo

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.cms.OtherRecipientInfo.<init>(org.bouncycastle.asn1.ASN1Sequence)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.OtherRevocationInfoFormat

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.PasswordRecipientInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.RecipientEncryptedKey

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.RecipientIdentifier

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.RecipientInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.RecipientKeyIdentifier

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.SCVPReqRes

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.SignedData

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.SignerIdentifier

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.SignerInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.Time

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.TimeStampAndCRL

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.TimeStampTokenEvidence

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.TimeStampedData

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cms.TimeStampedDataParser

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.cms.TimeStampedDataParser.toASN1Primitive()`

## org.bouncycastle.asn1.cms.ecc.MQVuserKeyingMaterial

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.crmf.AttributeTypeAndValue

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.crmf.CertId

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.crmf.CertReqMessages

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.crmf.CertReqMsg

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.crmf.CertRequest

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.crmf.CertTemplate

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.crmf.Controls

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.crmf.EncKeyWithID

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.crmf.EncryptedKey

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.crmf.EncryptedValue

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.crmf.OptionalValidity

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.crmf.PKIArchiveOptions

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.crmf.PKIPublicationInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.crmf.PKMACValue

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.crmf.POPOPrivKey

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.crmf.POPOSigningKey

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.crmf.POPOSigningKeyInput

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.crmf.ProofOfPossession

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.crmf.SinglePubInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.crmf.SubsequentMessage

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cryptopro.ECGOST3410ParamSetParameters

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cryptopro.GOST28147Parameters

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.cryptopro.GOST28147Parameters.<init>(org.bouncycastle.asn1.ASN1Sequence)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cryptopro.GOST3410ParamSetParameters

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters.<init>(org.bouncycastle.asn1.ASN1Sequence)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.dvcs.CertEtcToken

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.dvcs.DVCSCertInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.dvcs.DVCSErrorNotice

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.dvcs.DVCSRequest

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.dvcs.DVCSRequestInformation

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.dvcs.DVCSResponse

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.dvcs.DVCSTime

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.dvcs.Data

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.dvcs.PathProcInput

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.dvcs.ServiceType

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.dvcs.TargetEtcChain

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.eac.CVCertificate

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.asn1.eac.CVCertificate.ReferenceEncoding`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.asn1.eac.CVCertificate.version_1`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.eac.CVCertificateRequest

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.asn1.eac.CVCertificateRequest.ZeroArray`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.eac.CertificateBody

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.eac.CertificateBody.<init>(org.bouncycastle.asn1.DERApplicationSpecific,org.bouncycastle.asn1.eac.CertificationAuthorityReference,org.bouncycastle.asn1.eac.PublicKeyDataObject,org.bouncycastle.asn1.eac.CertificateHolderReference,org.bouncycastle.asn1.eac.CertificateHolderAuthorization,org.bouncycastle.asn1.eac.PackedDate,org.bouncycastle.asn1.eac.PackedDate)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.bouncycastle.asn1.eac.CertificateBody.getCertificateProfileIdentifier()`
+ NEW RETURN TYPE: `org.bouncycastle.asn1.eac.CertificateBody.getCertificateProfileIdentifier()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.bouncycastle.asn1.eac.CertificateBody.getCertificateProfileIdentifier()`
+ NEW RETURN TYPE: `org.bouncycastle.asn1.eac.CertificateBody.getCertificateProfileIdentifier()`

## org.bouncycastle.asn1.eac.CertificateHolderAuthorization

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.eac.CertificateHolderAuthorization.<init>(org.bouncycastle.asn1.DERApplicationSpecific)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.eac.CertificateHolderAuthorization.GetFlag(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.eac.CertificateHolderAuthorization.GetRoleDescription(int)`

## org.bouncycastle.asn1.eac.EACTags

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.asn1.eac.EACTags.OBJECT_IDENTIFIER`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.eac.EACTags.encodeTag(org.bouncycastle.asn1.DERApplicationSpecific)`

## org.bouncycastle.asn1.eac.ECDSAPublicKey

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.eac.PublicKeyDataObject

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.eac.RSAPublicKey

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.eac.UnsignedInteger

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.esf.CommitmentTypeIndication

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.esf.CommitmentTypeQualifier

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.esf.CompleteRevocationRefs

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.esf.CrlIdentifier

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.esf.CrlListID

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.esf.CrlOcspRef

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.esf.CrlValidatedID

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.esf.OcspIdentifier

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.esf.OcspListID

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.esf.OcspResponsesID

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.esf.OtherHash

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.esf.OtherHashAlgAndValue

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.esf.OtherRevRefs

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.esf.OtherRevVals

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.esf.RevocationValues

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.esf.SPUserNotice

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.esf.SigPolicyQualifierInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.esf.SigPolicyQualifiers

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.esf.SignaturePolicyId

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.esf.SignaturePolicyIdentifier

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.esf.SignerAttribute

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.esf.SignerLocation

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ess.ContentHints

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ess.ContentIdentifier

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ess.ESSCertID

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ess.ESSCertIDv2

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ess.OtherCertID

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ess.OtherSigningCertificate

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ess.SigningCertificate

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ess.SigningCertificateV2

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.icao.CscaMasterList

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.icao.DataGroupHash

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.icao.LDSSecurityObject

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.icao.LDSVersionInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.isismtt.ocsp.CertHash

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.isismtt.ocsp.RequestedCertificate

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.isismtt.x509.AdditionalInformationSyntax

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.isismtt.x509.AdmissionSyntax

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.isismtt.x509.Admissions

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.isismtt.x509.DeclarationOfMajority

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.isismtt.x509.MonetaryLimit

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.isismtt.x509.NamingAuthority

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.isismtt.x509.ProcurationSyntax

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.isismtt.x509.ProfessionInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.isismtt.x509.Restriction

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.misc.CAST5CBCParameters

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.misc.CAST5CBCParameters.<init>(org.bouncycastle.asn1.ASN1Sequence)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.misc.IDEACBCPar

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.misc.IDEACBCPar.<init>(org.bouncycastle.asn1.ASN1Sequence)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.misc.NetscapeCertType

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.bouncycastle.asn1.DERBitString.data`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.bouncycastle.asn1.DERBitString.padBits`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.DERBitString.asn1Equals(org.bouncycastle.asn1.ASN1Primitive)`

## org.bouncycastle.asn1.misc.NetscapeRevocationURL

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.misc.VerisignCzagExtension

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.mozilla.PublicKeyAndChallenge

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ocsp.BasicOCSPResponse

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ocsp.CertID

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ocsp.CertStatus

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.ocsp.CertStatus.<init>(org.bouncycastle.asn1.ASN1TaggedObject)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ocsp.CrlID

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ocsp.OCSPRequest

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ocsp.OCSPResponse

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ocsp.OCSPResponseStatus

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ocsp.Request

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ocsp.ResponderID

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ocsp.ResponseBytes

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ocsp.ResponseData

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ocsp.RevokedInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ocsp.ServiceLocator

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.bouncycastle.asn1.ocsp.ServiceLocator`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.bouncycastle.asn1.ocsp.ServiceLocator`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.ocsp.ServiceLocator.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Object.equals(java.lang.Object)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Object.getEncoded()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Object.getEncoded(java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Object.hashCode()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ocsp.ServiceLocator.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.hasEncodedTagValue(java.lang.Object,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ocsp.Signature

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ocsp.SingleResponse

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ocsp.TBSRequest

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.oiw.ElGamalParameter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.Attribute

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.AuthenticatedSafe

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.CRLBag

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.pkcs.CRLBag.getCRLValue()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.pkcs.CRLBag.getcrlId()`

## org.bouncycastle.asn1.pkcs.CertBag

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.CertificationRequest

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.CertificationRequestInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.ContentInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.DHParameter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.EncryptedData

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.EncryptionScheme

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.IssuerAndSerialNumber

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.KeyDerivationFunc

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.MacData

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.PBEParameter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.PBES2Algorithms

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.asn1.pkcs.PBES2Algorithms`

## org.bouncycastle.asn1.pkcs.PBES2Parameters

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.PBKDF2Params

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.PKCS12PBEParams

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.Pfx

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.PrivateKeyInfo

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.pkcs.PrivateKeyInfo.<init>(org.bouncycastle.asn1.ASN1Sequence)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getAlgorithmId()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getPrivateKey()`
+ NEW RETURN TYPE: `org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getPrivateKey()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getPrivateKey()`
+ NEW RETURN TYPE: `org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getPrivateKey()`

## org.bouncycastle.asn1.pkcs.RC2CBCParameter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.RSAESOAEPparams

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.RSAPrivateKey

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.RSAPrivateKeyStructure

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.RSAPublicKey

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.RSASSAPSSparams

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.SafeBag

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.SignedData

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.pkcs.SignerInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.sec.ECPrivateKey

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.sec.ECPrivateKeyStructure

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.smime.SMIMECapabilities

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.smime.SMIMECapabilitiesAttribute

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.smime.SMIMECapability

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.smime.SMIMEEncryptionKeyPreferenceAttribute

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.tsp.Accuracy

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.tsp.MessageImprint

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.tsp.TSTInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.tsp.TimeStampReq

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.tsp.TimeStampResp

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ua.DSTU4145BinaryField

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ua.DSTU4145ECBinary

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ua.DSTU4145NamedCurves

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.asn1.ua.DSTU4145NamedCurves.params`

## org.bouncycastle.asn1.ua.DSTU4145Params

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.ua.DSTU4145PublicKey

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x500.AttributeTypeAndValue

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x500.DirectoryString

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x500.RDN

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x500.X500Name

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.AccessDescription

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.AlgorithmIdentifier

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.x509.AlgorithmIdentifier.<init>(java.lang.String)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.x509.AlgorithmIdentifier.<init>(org.bouncycastle.asn1.ASN1Sequence)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.x509.AlgorithmIdentifier.getObjectId()`

## org.bouncycastle.asn1.x509.AttCertIssuer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.AttCertValidityPeriod

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.Attribute

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.AttributeCertificate

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.AttributeCertificateInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.AuthorityInformationAccess

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.AuthorityKeyIdentifier

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.BasicConstraints

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.CRLDistPoint

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.CRLNumber

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.CRLReason

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.CertPolicyId

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.Certificate

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.CertificateList

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.CertificatePair

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.CertificatePolicies

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.DSAParameter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.DigestInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.DisplayText

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.DistributionPoint

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.DistributionPointName

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.ExtendedKeyUsage

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.Extension

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.Extensions

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.GeneralName

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.GeneralNames

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.GeneralSubtree

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.Holder

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.IetfAttrSyntax

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.IssuerSerial

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.IssuingDistributionPoint

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.KeyPurposeId

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.KeyUsage

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.NameConstraints

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.NoticeReference

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.ObjectDigestInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.PolicyConstraints

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.PolicyInformation

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.PolicyMappings

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.PolicyQualifierId

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.PolicyQualifierInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.PrivateKeyUsagePeriod

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.RSAPublicKeyStructure

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.ReasonFlags

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.bouncycastle.asn1.DERBitString.data`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.bouncycastle.asn1.DERBitString.padBits`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.asn1.ASN1Primitive.toASN1Primitive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.DERBitString.asn1Equals(org.bouncycastle.asn1.ASN1Primitive)`

## org.bouncycastle.asn1.x509.RoleSyntax

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.SubjectDirectoryAttributes

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.SubjectKeyIdentifier

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.SubjectPublicKeyInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.TBSCertList

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.TBSCertList$CRLEntry

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.TBSCertificate

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.TBSCertificateStructure

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.Target

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.TargetInformation

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.Targets

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.Time

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.UserNotice

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.V2Form

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.X509CertificateStructure

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.X509Extensions

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.X509Name

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.qualified.BiometricData

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.qualified.Iso4217CurrencyCode

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.qualified.MonetaryValue

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.qualified.QCStatement

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.qualified.SemanticsInformation

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.qualified.TypeOfBiometricData

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.sigi.NameOrPseudonym

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x509.sigi.PersonalData

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x9.DHDomainParameters

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x9.DHPublicKey

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.x9.DHPublicKey.<init>(org.bouncycastle.asn1.ASN1Integer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.bouncycastle.asn1.x9.DHPublicKey.getY()`
+ NEW RETURN TYPE: `org.bouncycastle.asn1.x9.DHPublicKey.getY()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.bouncycastle.asn1.x9.DHPublicKey.getY()`
+ NEW RETURN TYPE: `org.bouncycastle.asn1.x9.DHPublicKey.getY()`

## org.bouncycastle.asn1.x9.DHValidationParms

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x9.KeySpecificInfo

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.x9.KeySpecificInfo.<init>(org.bouncycastle.asn1.ASN1Sequence)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x9.OtherInfo

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.x9.OtherInfo.<init>(org.bouncycastle.asn1.ASN1Sequence)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x9.X962Parameters

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.x9.X962Parameters.<init>(org.bouncycastle.asn1.ASN1Primitive)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x9.X9Curve

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.x9.X9Curve.<init>(org.bouncycastle.asn1.x9.X9FieldID,org.bouncycastle.asn1.ASN1Sequence)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x9.X9ECParameters

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.x9.X9ECParameters.<init>(org.bouncycastle.math.ec.ECCurve,org.bouncycastle.math.ec.ECPoint,java.math.BigInteger)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.x9.X9ECParameters.<init>(org.bouncycastle.math.ec.ECCurve,org.bouncycastle.math.ec.ECPoint,java.math.BigInteger,java.math.BigInteger)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.x9.X9ECParameters.<init>(org.bouncycastle.math.ec.ECCurve,org.bouncycastle.math.ec.ECPoint,java.math.BigInteger,java.math.BigInteger,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x9.X9ECPoint

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.asn1.x9.X9ECPoint.<init>(org.bouncycastle.math.ec.ECPoint)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x9.X9FieldElement

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.asn1.x9.X9FieldID

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.crypto.agreement.DHStandardGroups

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.crypto.agreement.DHStandardGroups.rfc5114_1024_160`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.crypto.agreement.DHStandardGroups.rfc5114_2048_224`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.crypto.agreement.DHStandardGroups.rfc5114_2048_256`

## org.bouncycastle.crypto.engines.CAST5Engine

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.crypto.engines.CAST5Engine.M32`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.crypto.engines.CAST5Engine.S1`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.crypto.engines.CAST5Engine.S2`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.crypto.engines.CAST5Engine.S3`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.crypto.engines.CAST5Engine.S4`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.crypto.engines.CAST5Engine.S5`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.crypto.engines.CAST5Engine.S6`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.crypto.engines.CAST5Engine.S7`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.crypto.engines.CAST5Engine.S8`

## org.bouncycastle.crypto.engines.ChaChaEngine

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.crypto.engines.Salsa20Engine.rotl(int,int)`

## org.bouncycastle.crypto.engines.Salsa20Engine

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.crypto.engines.Salsa20Engine.rotl(int,int)`

## org.bouncycastle.crypto.engines.SerpentEngine

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.bouncycastle.crypto.engines.SerpentEngine`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.crypto.engines.SerpentEngine.getAlgorithmName()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.crypto.engines.SerpentEngine.getBlockSize()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.crypto.engines.SerpentEngine.init(boolean,org.bouncycastle.crypto.CipherParameters)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.crypto.engines.SerpentEngine.reset()`

## org.bouncycastle.crypto.engines.Shacal2Engine

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.crypto.engines.Shacal2Engine.decryptBlock(byte[],int,byte[],int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.crypto.engines.Shacal2Engine.encryptBlock(byte[],int,byte[],int)`

## org.bouncycastle.crypto.engines.XSalsa20Engine

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.crypto.engines.Salsa20Engine.rotl(int,int)`

## org.bouncycastle.crypto.generators.RSAKeyPairGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.crypto.generators.RSAKeyPairGenerator.chooseRandomPrime(int,java.math.BigInteger)`

## org.bouncycastle.crypto.generators.SCrypt

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.bouncycastle.crypto.generators.SCrypt`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.bouncycastle.crypto.generators.SCrypt`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.crypto.generators.SCrypt.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.crypto.generators.SCrypt.generate(byte[],byte[],int,int,int,int)`

## org.bouncycastle.crypto.prng.SP800SecureRandomBuilder

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.crypto.prng.SP800SecureRandomBuilder.buildDualEC(org.bouncycastle.crypto.Digest,byte[],boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.crypto.prng.SP800SecureRandomBuilder.buildDualEC(org.bouncycastle.crypto.prng.drbg.DualECPoints[],org.bouncycastle.crypto.Digest,byte[],boolean)`

## org.bouncycastle.crypto.tls.AbstractTlsAgreementCredentials

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.AbstractTlsAgreementCredentials`

## org.bouncycastle.crypto.tls.AbstractTlsCipherFactory

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.AbstractTlsCipherFactory`

## org.bouncycastle.crypto.tls.AbstractTlsClient

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.AbstractTlsClient`

## org.bouncycastle.crypto.tls.AbstractTlsCredentials

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.AbstractTlsCredentials`

## org.bouncycastle.crypto.tls.AbstractTlsEncryptionCredentials

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.AbstractTlsEncryptionCredentials`

## org.bouncycastle.crypto.tls.AbstractTlsKeyExchange

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.AbstractTlsKeyExchange`

## org.bouncycastle.crypto.tls.AbstractTlsPeer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.AbstractTlsPeer`

## org.bouncycastle.crypto.tls.AbstractTlsServer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.AbstractTlsServer`

## org.bouncycastle.crypto.tls.AbstractTlsSigner

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.AbstractTlsSigner`

## org.bouncycastle.crypto.tls.AbstractTlsSignerCredentials

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.AbstractTlsSignerCredentials`

## org.bouncycastle.crypto.tls.AlertDescription

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.AlertDescription`

## org.bouncycastle.crypto.tls.AlertLevel

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.AlertLevel`

## org.bouncycastle.crypto.tls.AlwaysValidVerifyer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.AlwaysValidVerifyer`

## org.bouncycastle.crypto.tls.BulkCipherAlgorithm

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.BulkCipherAlgorithm`

## org.bouncycastle.crypto.tls.ByteQueue

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.ByteQueue`

## org.bouncycastle.crypto.tls.CertChainType

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.CertChainType`

## org.bouncycastle.crypto.tls.Certificate

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.Certificate`

## org.bouncycastle.crypto.tls.CertificateRequest

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.CertificateRequest`

## org.bouncycastle.crypto.tls.CertificateStatus

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.CertificateStatus`

## org.bouncycastle.crypto.tls.CertificateStatusRequest

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.CertificateStatusRequest`

## org.bouncycastle.crypto.tls.CertificateStatusType

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.CertificateStatusType`

## org.bouncycastle.crypto.tls.CertificateURL

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.CertificateURL`

## org.bouncycastle.crypto.tls.CertificateVerifyer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.CertificateVerifyer`

## org.bouncycastle.crypto.tls.Chacha20Poly1305

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.Chacha20Poly1305`

## org.bouncycastle.crypto.tls.ChangeCipherSpec

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.ChangeCipherSpec`

## org.bouncycastle.crypto.tls.CipherSuite

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.CipherSuite`

## org.bouncycastle.crypto.tls.CipherType

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.CipherType`

## org.bouncycastle.crypto.tls.ClientAuthenticationType

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.ClientAuthenticationType`

## org.bouncycastle.crypto.tls.ClientCertificateType

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.ClientCertificateType`

## org.bouncycastle.crypto.tls.CompressionMethod

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.CompressionMethod`

## org.bouncycastle.crypto.tls.ConnectionEnd

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.ConnectionEnd`

## org.bouncycastle.crypto.tls.ContentType

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.ContentType`

## org.bouncycastle.crypto.tls.DTLSClientProtocol

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.DTLSClientProtocol`

## org.bouncycastle.crypto.tls.DTLSClientProtocol$ClientHandshakeState

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.DTLSClientProtocol$ClientHandshakeState`

## org.bouncycastle.crypto.tls.DTLSProtocol

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.DTLSProtocol`

## org.bouncycastle.crypto.tls.DTLSServerProtocol

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.DTLSServerProtocol`

## org.bouncycastle.crypto.tls.DTLSServerProtocol$ServerHandshakeState

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.DTLSServerProtocol$ServerHandshakeState`

## org.bouncycastle.crypto.tls.DTLSTransport

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.DTLSTransport`

## org.bouncycastle.crypto.tls.DatagramTransport

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.DatagramTransport`

## org.bouncycastle.crypto.tls.DefaultTlsAgreementCredentials

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.DefaultTlsAgreementCredentials`

## org.bouncycastle.crypto.tls.DefaultTlsCipherFactory

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.DefaultTlsCipherFactory`

## org.bouncycastle.crypto.tls.DefaultTlsClient

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.DefaultTlsClient`

## org.bouncycastle.crypto.tls.DefaultTlsEncryptionCredentials

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.DefaultTlsEncryptionCredentials`

## org.bouncycastle.crypto.tls.DefaultTlsServer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.DefaultTlsServer`

## org.bouncycastle.crypto.tls.DefaultTlsSignerCredentials

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.DefaultTlsSignerCredentials`

## org.bouncycastle.crypto.tls.DigestAlgorithm

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.DigestAlgorithm`

## org.bouncycastle.crypto.tls.DigitallySigned

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.DigitallySigned`

## org.bouncycastle.crypto.tls.ECBasisType

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.ECBasisType`

## org.bouncycastle.crypto.tls.ECCurveType

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.ECCurveType`

## org.bouncycastle.crypto.tls.ECPointFormat

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.ECPointFormat`

## org.bouncycastle.crypto.tls.EncryptionAlgorithm

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.EncryptionAlgorithm`

## org.bouncycastle.crypto.tls.ExporterLabel

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.ExporterLabel`

## org.bouncycastle.crypto.tls.ExtensionType

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.ExtensionType`

## org.bouncycastle.crypto.tls.HandshakeType

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.HandshakeType`

## org.bouncycastle.crypto.tls.HashAlgorithm

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.HashAlgorithm`

## org.bouncycastle.crypto.tls.HeartbeatExtension

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.HeartbeatExtension`

## org.bouncycastle.crypto.tls.HeartbeatMessage

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.HeartbeatMessage`

## org.bouncycastle.crypto.tls.HeartbeatMessageType

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.HeartbeatMessageType`

## org.bouncycastle.crypto.tls.HeartbeatMode

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.HeartbeatMode`

## org.bouncycastle.crypto.tls.KeyExchangeAlgorithm

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.KeyExchangeAlgorithm`

## org.bouncycastle.crypto.tls.LegacyTlsAuthentication

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.LegacyTlsAuthentication`

## org.bouncycastle.crypto.tls.LegacyTlsClient

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.LegacyTlsClient`

## org.bouncycastle.crypto.tls.MACAlgorithm

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.MACAlgorithm`

## org.bouncycastle.crypto.tls.MaxFragmentLength

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.MaxFragmentLength`

## org.bouncycastle.crypto.tls.NameType

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.NameType`

## org.bouncycastle.crypto.tls.NamedCurve

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.NamedCurve`

## org.bouncycastle.crypto.tls.NewSessionTicket

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.NewSessionTicket`

## org.bouncycastle.crypto.tls.OCSPStatusRequest

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.OCSPStatusRequest`

## org.bouncycastle.crypto.tls.PRFAlgorithm

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.PRFAlgorithm`

## org.bouncycastle.crypto.tls.PSKTlsClient

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.PSKTlsClient`

## org.bouncycastle.crypto.tls.ProtocolVersion

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.ProtocolVersion`

## org.bouncycastle.crypto.tls.SRPTlsClient

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.SRPTlsClient`

## org.bouncycastle.crypto.tls.SRTPProtectionProfile

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.SRTPProtectionProfile`

## org.bouncycastle.crypto.tls.SSL3Mac

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.SSL3Mac`

## org.bouncycastle.crypto.tls.SecurityParameters

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.SecurityParameters`

## org.bouncycastle.crypto.tls.ServerDHParams

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.ServerDHParams`

## org.bouncycastle.crypto.tls.ServerName

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.ServerName`

## org.bouncycastle.crypto.tls.ServerNameList

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.ServerNameList`

## org.bouncycastle.crypto.tls.ServerOnlyTlsAuthentication

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.ServerOnlyTlsAuthentication`

## org.bouncycastle.crypto.tls.SessionParameters

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.SessionParameters`

## org.bouncycastle.crypto.tls.SessionParameters$Builder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.SessionParameters$Builder`

## org.bouncycastle.crypto.tls.SignatureAlgorithm

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.SignatureAlgorithm`

## org.bouncycastle.crypto.tls.SignatureAndHashAlgorithm

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.SignatureAndHashAlgorithm`

## org.bouncycastle.crypto.tls.SupplementalDataEntry

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.SupplementalDataEntry`

## org.bouncycastle.crypto.tls.SupplementalDataType

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.SupplementalDataType`

## org.bouncycastle.crypto.tls.TlsAEADCipher

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsAEADCipher`

## org.bouncycastle.crypto.tls.TlsAgreementCredentials

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsAgreementCredentials`

## org.bouncycastle.crypto.tls.TlsAuthentication

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsAuthentication`

## org.bouncycastle.crypto.tls.TlsBlockCipher

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsBlockCipher`

## org.bouncycastle.crypto.tls.TlsCipher

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsCipher`

## org.bouncycastle.crypto.tls.TlsCipherFactory

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsCipherFactory`

## org.bouncycastle.crypto.tls.TlsClient

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsClient`

## org.bouncycastle.crypto.tls.TlsClientContext

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsClientContext`

## org.bouncycastle.crypto.tls.TlsClientProtocol

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsClientProtocol`

## org.bouncycastle.crypto.tls.TlsCompression

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsCompression`

## org.bouncycastle.crypto.tls.TlsContext

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsContext`

## org.bouncycastle.crypto.tls.TlsCredentials

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsCredentials`

## org.bouncycastle.crypto.tls.TlsDHEKeyExchange

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsDHEKeyExchange`

## org.bouncycastle.crypto.tls.TlsDHKeyExchange

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsDHKeyExchange`

## org.bouncycastle.crypto.tls.TlsDHUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsDHUtils`

## org.bouncycastle.crypto.tls.TlsDSASigner

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsDSASigner`

## org.bouncycastle.crypto.tls.TlsDSSSigner

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsDSSSigner`

## org.bouncycastle.crypto.tls.TlsECCUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsECCUtils`

## org.bouncycastle.crypto.tls.TlsECDHEKeyExchange

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsECDHEKeyExchange`

## org.bouncycastle.crypto.tls.TlsECDHKeyExchange

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsECDHKeyExchange`

## org.bouncycastle.crypto.tls.TlsECDSASigner

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsECDSASigner`

## org.bouncycastle.crypto.tls.TlsEncryptionCredentials

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsEncryptionCredentials`

## org.bouncycastle.crypto.tls.TlsExtensionsUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsExtensionsUtils`

## org.bouncycastle.crypto.tls.TlsFatalAlert

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsFatalAlert`

## org.bouncycastle.crypto.tls.TlsHandshakeHash

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsHandshakeHash`

## org.bouncycastle.crypto.tls.TlsKeyExchange

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsKeyExchange`

## org.bouncycastle.crypto.tls.TlsMac

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsMac`

## org.bouncycastle.crypto.tls.TlsNullCipher

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsNullCipher`

## org.bouncycastle.crypto.tls.TlsNullCompression

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsNullCompression`

## org.bouncycastle.crypto.tls.TlsPSKIdentity

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsPSKIdentity`

## org.bouncycastle.crypto.tls.TlsPSKKeyExchange

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsPSKKeyExchange`

## org.bouncycastle.crypto.tls.TlsPeer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsPeer`

## org.bouncycastle.crypto.tls.TlsProtocol

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsProtocol`

## org.bouncycastle.crypto.tls.TlsProtocolHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsProtocolHandler`

## org.bouncycastle.crypto.tls.TlsRSAKeyExchange

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsRSAKeyExchange`

## org.bouncycastle.crypto.tls.TlsRSASigner

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsRSASigner`

## org.bouncycastle.crypto.tls.TlsRSAUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsRSAUtils`

## org.bouncycastle.crypto.tls.TlsSRPKeyExchange

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsSRPKeyExchange`

## org.bouncycastle.crypto.tls.TlsSRPUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsSRPUtils`

## org.bouncycastle.crypto.tls.TlsSRTPUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsSRTPUtils`

## org.bouncycastle.crypto.tls.TlsServer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsServer`

## org.bouncycastle.crypto.tls.TlsServerContext

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsServerContext`

## org.bouncycastle.crypto.tls.TlsServerProtocol

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsServerProtocol`

## org.bouncycastle.crypto.tls.TlsSession

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsSession`

## org.bouncycastle.crypto.tls.TlsSigner

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsSigner`

## org.bouncycastle.crypto.tls.TlsSignerCredentials

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsSignerCredentials`

## org.bouncycastle.crypto.tls.TlsStreamCipher

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsStreamCipher`

## org.bouncycastle.crypto.tls.TlsUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.TlsUtils`

## org.bouncycastle.crypto.tls.UDPTransport

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.UDPTransport`

## org.bouncycastle.crypto.tls.URLAndHash

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.URLAndHash`

## org.bouncycastle.crypto.tls.UseSRTPData

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.UseSRTPData`

## org.bouncycastle.crypto.tls.UserMappingType

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.crypto.tls.UserMappingType`

## org.bouncycastle.crypto.util.PrivateKeyInfoFactory

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.bouncycastle.crypto.util.PrivateKeyInfoFactory`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.bouncycastle.crypto.util.PrivateKeyInfoFactory`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.crypto.util.PrivateKeyInfoFactory.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.crypto.util.PrivateKeyInfoFactory.createPrivateKeyInfo(org.bouncycastle.crypto.params.AsymmetricKeyParameter)`

## org.bouncycastle.crypto.util.SubjectPublicKeyInfoFactory

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.bouncycastle.crypto.util.SubjectPublicKeyInfoFactory`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.bouncycastle.crypto.util.SubjectPublicKeyInfoFactory`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.crypto.util.SubjectPublicKeyInfoFactory.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.crypto.util.SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(org.bouncycastle.crypto.params.AsymmetricKeyParameter)`

## org.bouncycastle.jcajce.io.MacOutputStream

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.bouncycastle.jcajce.io.MacOutputStream`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.io.MacOutputStream.mac`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `java.io.OutputStream.close()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `java.io.OutputStream.flush()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `java.io.OutputStream.nullOutputStream()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `java.io.OutputStream.write(byte[])`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.jcajce.io.MacOutputStream.getMac()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.jcajce.io.MacOutputStream.write(byte[],int,int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.jcajce.io.MacOutputStream.write(int)`

## org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAES

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAES`

## org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithDESede

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithDESede`

## org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi.engineGenerateSecret(java.lang.String)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi.engineGenerateSecret(java.lang.String)`

## org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.<init>(org.bouncycastle.crypto.Digest,org.bouncycastle.crypto.DSA)`

## org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey.<init>(java.security.interfaces.ECPublicKey)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey.<init>(org.bouncycastle.jce.spec.ECPublicKeySpec)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey.engineGetQ()`

## org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey.engineGetQ()`

## org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithAES

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithAES`

## org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithDESede

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithDESede`

## org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.encoder`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

## org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA224

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.encoder`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

## org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA256

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.encoder`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

## org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA384

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.encoder`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

## org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA512

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.encoder`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

## org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.encoder`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

## org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA224

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.encoder`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

## org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA256

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.encoder`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

## org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA384

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.encoder`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

## org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA512

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.encoder`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

## org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSARipeMD160

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.encoder`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

## org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSAnone

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.encoder`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

## org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.encoder`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

## org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA224

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.encoder`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

## org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA256

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.encoder`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

## org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA384

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.encoder`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

## org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA512

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.encoder`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

## org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.encoder`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

## org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR224

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.encoder`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

## org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR256

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.encoder`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

## org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR384

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.encoder`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

## org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR512

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.encoder`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

## org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecPlainDSARP160

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.encoder`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

## org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PublicKey

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PublicKey.<init>(org.bouncycastle.jce.spec.ECPublicKeySpec)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PublicKey.engineGetQ()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PublicKey.getGostParams()`

## org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi.engineDoFinal(byte[],int,int,byte[],int)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi.engineDoFinal(byte[],int,int,byte[],int)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi.engineInit(int,java.security.Key,java.security.spec.AlgorithmParameterSpec,java.security.SecureRandom)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi.engineInit(int,java.security.Key,java.security.spec.AlgorithmParameterSpec,java.security.SecureRandom)`

## org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi$NoPadding

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi.engineDoFinal(byte[],int,int,byte[],int)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi.engineDoFinal(byte[],int,int,byte[],int)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi.engineInit(int,java.security.Key,java.security.spec.AlgorithmParameterSpec,java.security.SecureRandom)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi.engineInit(int,java.security.Key,java.security.spec.AlgorithmParameterSpec,java.security.SecureRandom)`

## org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi$PKCS1v1_5Padding

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi.engineDoFinal(byte[],int,int,byte[],int)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi.engineDoFinal(byte[],int,int,byte[],int)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi.engineInit(int,java.security.Key,java.security.spec.AlgorithmParameterSpec,java.security.SecureRandom)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi.engineInit(int,java.security.Key,java.security.spec.AlgorithmParameterSpec,java.security.SecureRandom)`

## org.bouncycastle.jcajce.provider.asymmetric.ies.CipherSpi

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jcajce.provider.asymmetric.ies.CipherSpi`

## org.bouncycastle.jcajce.provider.asymmetric.ies.CipherSpi$IES

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jcajce.provider.asymmetric.ies.CipherSpi$IES`

## org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey.<init>()`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey.modulus`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey.privateExponent`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `java.security.interfaces.RSAPrivateKey.getParams()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `javax.security.auth.Destroyable.destroy()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `javax.security.auth.Destroyable.isDestroyed()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey.equals(java.lang.Object)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey.getAlgorithm()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey.getBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey.getBagAttributeKeys()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey.getEncoded()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey.getFormat()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey.getModulus()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey.getPrivateExponent()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey.hashCode()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey.setBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier,org.bouncycastle.asn1.ASN1Encodable)`

## org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi.engineDoFinal(byte[],int,int,byte[],int)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi.engineDoFinal(byte[],int,int,byte[],int)`

## org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$ISO9796d1Padding

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi.engineDoFinal(byte[],int,int,byte[],int)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi.engineDoFinal(byte[],int,int,byte[],int)`

## org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi.engineDoFinal(byte[],int,int,byte[],int)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi.engineDoFinal(byte[],int,int,byte[],int)`

## org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi.engineDoFinal(byte[],int,int,byte[],int)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi.engineDoFinal(byte[],int,int,byte[],int)`

## org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi.engineDoFinal(byte[],int,int,byte[],int)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi.engineDoFinal(byte[],int,int,byte[],int)`

## org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PrivateOnly

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi.engineDoFinal(byte[],int,int,byte[],int)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi.engineDoFinal(byte[],int,int,byte[],int)`

## org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PublicOnly

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi.engineDoFinal(byte[],int,int,byte[],int)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi.engineDoFinal(byte[],int,int,byte[],int)`

## org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyPairGeneratorSpi

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyPairGeneratorSpi.<init>(java.lang.String)`

## org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi.engineSetParameter(java.security.spec.AlgorithmParameterSpec)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi.engineSetParameter(java.security.spec.AlgorithmParameterSpec)`

## org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi.engineSetParameter(java.security.spec.AlgorithmParameterSpec)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi.engineSetParameter(java.security.spec.AlgorithmParameterSpec)`

## org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA1withRSA

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi.engineSetParameter(java.security.spec.AlgorithmParameterSpec)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi.engineSetParameter(java.security.spec.AlgorithmParameterSpec)`

## org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA224withRSA

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi.engineSetParameter(java.security.spec.AlgorithmParameterSpec)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi.engineSetParameter(java.security.spec.AlgorithmParameterSpec)`

## org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA256withRSA

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi.engineSetParameter(java.security.spec.AlgorithmParameterSpec)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi.engineSetParameter(java.security.spec.AlgorithmParameterSpec)`

## org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA384withRSA

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi.engineSetParameter(java.security.spec.AlgorithmParameterSpec)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi.engineSetParameter(java.security.spec.AlgorithmParameterSpec)`

## org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512withRSA

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi.engineSetParameter(java.security.spec.AlgorithmParameterSpec)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi.engineSetParameter(java.security.spec.AlgorithmParameterSpec)`

## org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$nonePSS

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi.engineSetParameter(java.security.spec.AlgorithmParameterSpec)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi.engineSetParameter(java.security.spec.AlgorithmParameterSpec)`

## org.bouncycastle.jcajce.provider.asymmetric.util.DSABase

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.<init>(org.bouncycastle.crypto.Digest,org.bouncycastle.crypto.DSA,org.bouncycastle.jcajce.provider.asymmetric.util.DSAEncoder)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.encoder`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`
+ NEW FIELD: `org.bouncycastle.jcajce.provider.asymmetric.util.DSABase.signer`

## org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(java.security.spec.ECParameterSpec,java.security.spec.ECPoint,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(org.bouncycastle.math.ec.ECCurve,java.security.spec.ECPoint,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(java.security.spec.ECParameterSpec,boolean)`

## org.bouncycastle.jcajce.provider.asymmetric.util.IESUtil

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.jcajce.provider.asymmetric.util.IESUtil.guessParameterSpec(org.bouncycastle.crypto.engines.IESEngine)`

## org.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil`

## org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLEntryObject

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLEntryObject`

## org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLObject

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLObject`

## org.bouncycastle.jcajce.provider.config.ConfigurableProvider

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.bouncycastle.jcajce.provider.config.ConfigurableProvider`
+ MUST NOW IMPLEMENT: `org.bouncycastle.jcajce.provider.config.ConfigurableProvider.getKeyInfoConverter(org.bouncycastle.asn1.ASN1ObjectIdentifier)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.bouncycastle.jcajce.provider.config.ConfigurableProvider`
+ MUST NOW IMPLEMENT: `org.bouncycastle.jcajce.provider.config.ConfigurableProvider.addAlgorithm(java.lang.String,org.bouncycastle.asn1.ASN1ObjectIdentifier,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.bouncycastle.jcajce.provider.config.ConfigurableProvider`
+ MUST NOW IMPLEMENT: `org.bouncycastle.jcajce.provider.config.ConfigurableProvider.addAttributes(java.lang.String,java.util.Map<java.lang.String,java.lang.String>)`

## org.bouncycastle.jcajce.provider.config.ProviderConfiguration

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.bouncycastle.jcajce.provider.config.ProviderConfiguration`
+ MUST NOW IMPLEMENT: `org.bouncycastle.jcajce.provider.config.ProviderConfiguration.getAcceptableNamedCurves()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.bouncycastle.jcajce.provider.config.ProviderConfiguration`
+ MUST NOW IMPLEMENT: `org.bouncycastle.jcajce.provider.config.ProviderConfiguration.getAdditionalECParameters()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.bouncycastle.jcajce.provider.config.ProviderConfiguration`
+ MUST NOW IMPLEMENT: `org.bouncycastle.jcajce.provider.config.ProviderConfiguration.getDSADefaultParameters(int)`

## org.bouncycastle.jcajce.provider.digest.SHA1$BasePBKDF2WithHmacSHA1

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jcajce.provider.digest.SHA1$BasePBKDF2WithHmacSHA1`

## org.bouncycastle.jcajce.provider.digest.SHA1$PBKDF2WithHmacSHA18BIT

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jcajce.provider.digest.SHA1$PBKDF2WithHmacSHA18BIT`

## org.bouncycastle.jcajce.provider.digest.SHA1$PBKDF2WithHmacSHA1UTF8

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jcajce.provider.digest.SHA1$PBKDF2WithHmacSHA1UTF8`

## org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi.<init>(java.security.Provider,org.bouncycastle.asn1.ASN1ObjectIdentifier,org.bouncycastle.asn1.ASN1ObjectIdentifier)`

## org.bouncycastle.jcajce.provider.symmetric.ARC4$Base

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`

## org.bouncycastle.jcajce.provider.symmetric.ARC4$PBEWithSHAAnd128Bit

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`

## org.bouncycastle.jcajce.provider.symmetric.ARC4$PBEWithSHAAnd40Bit

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`

## org.bouncycastle.jcajce.provider.symmetric.ChaCha$Base

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`

## org.bouncycastle.jcajce.provider.symmetric.GOST28147$AlgParams

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters.engineGetEncoded()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters.engineGetEncoded(java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters.engineInit(byte[])`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters.engineInit(byte[],java.lang.String)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.bouncycastle.jcajce.provider.symmetric.GOST28147$AlgParams`

## org.bouncycastle.jcajce.provider.symmetric.Grain128$Base

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`

## org.bouncycastle.jcajce.provider.symmetric.Grainv1$Base

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`

## org.bouncycastle.jcajce.provider.symmetric.HC128$Base

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`

## org.bouncycastle.jcajce.provider.symmetric.HC256$Base

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`

## org.bouncycastle.jcajce.provider.symmetric.Salsa20$Base

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`

## org.bouncycastle.jcajce.provider.symmetric.VMPC$Base

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`

## org.bouncycastle.jcajce.provider.symmetric.VMPCKSA3$Base

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`

## org.bouncycastle.jcajce.provider.symmetric.XSalsa20$Base

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`

## org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `javax.security.auth.Destroyable.destroy()`

## org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineDoFinal(byte[],int,int,byte[],int)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`
+ NOW THROWS: `org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher.engineSetMode(java.lang.String)`

## org.bouncycastle.jcajce.util.DefaultJcaJceHelper

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.bouncycastle.jcajce.util.DefaultJcaJceHelper.createCertificateFactory(java.lang.String)`

## org.bouncycastle.jcajce.util.JcaJceHelper

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.bouncycastle.jcajce.util.JcaJceHelper.createCertificateFactory(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.bouncycastle.jcajce.util.JcaJceHelper`
+ MUST NOW IMPLEMENT: `org.bouncycastle.jcajce.util.JcaJceHelper.createCertPathBuilder(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.bouncycastle.jcajce.util.JcaJceHelper`
+ MUST NOW IMPLEMENT: `org.bouncycastle.jcajce.util.JcaJceHelper.createMessageDigest(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.bouncycastle.jcajce.util.JcaJceHelper`
+ MUST NOW IMPLEMENT: `org.bouncycastle.jcajce.util.JcaJceHelper.createSecureRandom(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.bouncycastle.jcajce.util.JcaJceHelper`
+ MUST NOW IMPLEMENT: `org.bouncycastle.jcajce.util.JcaJceHelper.createCertPathValidator(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.bouncycastle.jcajce.util.JcaJceHelper`
+ MUST NOW IMPLEMENT: `org.bouncycastle.jcajce.util.JcaJceHelper.createExemptionMechanism(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.bouncycastle.jcajce.util.JcaJceHelper`
+ MUST NOW IMPLEMENT: `org.bouncycastle.jcajce.util.JcaJceHelper.createCertStore(java.lang.String,java.security.cert.CertStoreParameters)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.bouncycastle.jcajce.util.JcaJceHelper`
+ MUST NOW IMPLEMENT: `org.bouncycastle.jcajce.util.JcaJceHelper.createKeyStore(java.lang.String)`

## org.bouncycastle.jcajce.util.NamedJcaJceHelper

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.bouncycastle.jcajce.util.NamedJcaJceHelper.createCertificateFactory(java.lang.String)`

## org.bouncycastle.jcajce.util.ProviderJcaJceHelper

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.bouncycastle.jcajce.util.ProviderJcaJceHelper.createCertificateFactory(java.lang.String)`

## org.bouncycastle.jce.PKCS10CertificationRequest

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.jce.X509KeyUsage

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.jce.X509Principal

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.jce.interfaces.ElGamalKey

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.bouncycastle.jce.interfaces.ElGamalKey`
+ MUST NOW IMPLEMENT: `javax.crypto.interfaces.DHKey.getParams()`

## org.bouncycastle.jce.interfaces.ElGamalPrivateKey

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `java.security.AsymmetricKey.getParams()`
+ NEW RETURN TYPE: `javax.crypto.interfaces.DHPrivateKey.getParams()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `java.security.AsymmetricKey.getParams()`
+ NEW RETURN TYPE: `javax.crypto.interfaces.DHPrivateKey.getParams()`

## org.bouncycastle.jce.interfaces.ElGamalPublicKey

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `java.security.AsymmetricKey.getParams()`
+ NEW RETURN TYPE: `javax.crypto.interfaces.DHPublicKey.getParams()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `java.security.AsymmetricKey.getParams()`
+ NEW RETURN TYPE: `javax.crypto.interfaces.DHPublicKey.getParams()`

## org.bouncycastle.jce.netscape.NetscapeCertRequest

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.jce.provider.CertPathValidatorUtilities

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jce.provider.CertPathValidatorUtilities`

## org.bouncycastle.jce.provider.JCEStreamCipher

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jce.provider.JCEStreamCipher`

## org.bouncycastle.jce.provider.JCEStreamCipher$Blowfish_CFB8

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jce.provider.JCEStreamCipher$Blowfish_CFB8`

## org.bouncycastle.jce.provider.JCEStreamCipher$Blowfish_OFB8

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jce.provider.JCEStreamCipher$Blowfish_OFB8`

## org.bouncycastle.jce.provider.JCEStreamCipher$DES_CFB8

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jce.provider.JCEStreamCipher$DES_CFB8`

## org.bouncycastle.jce.provider.JCEStreamCipher$DES_OFB8

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jce.provider.JCEStreamCipher$DES_OFB8`

## org.bouncycastle.jce.provider.JCEStreamCipher$DESede_CFB8

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jce.provider.JCEStreamCipher$DESede_CFB8`

## org.bouncycastle.jce.provider.JCEStreamCipher$DESede_OFB8

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jce.provider.JCEStreamCipher$DESede_OFB8`

## org.bouncycastle.jce.provider.JCEStreamCipher$Skipjack_CFB8

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jce.provider.JCEStreamCipher$Skipjack_CFB8`

## org.bouncycastle.jce.provider.JCEStreamCipher$Skipjack_OFB8

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jce.provider.JCEStreamCipher$Skipjack_OFB8`

## org.bouncycastle.jce.provider.JCEStreamCipher$Twofish_CFB8

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jce.provider.JCEStreamCipher$Twofish_CFB8`

## org.bouncycastle.jce.provider.JCEStreamCipher$Twofish_OFB8

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jce.provider.JCEStreamCipher$Twofish_OFB8`

## org.bouncycastle.jce.provider.PKIXCRLUtil

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jce.provider.PKIXCRLUtil`

## org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi.build(java.security.cert.X509Certificate,org.bouncycastle.x509.ExtendedPKIXBuilderParameters,java.util.List)`

## org.bouncycastle.jce.provider.PKIXNameConstraintValidator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.jce.provider.PKIXNameConstraintValidator.unionDNS(java.util.Set,java.lang.String)`

## org.bouncycastle.jce.provider.RFC3280CertPathUtilities

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.jce.provider.RFC3280CertPathUtilities`

## org.bouncycastle.jce.provider.X509CertificateObject

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `java.security.cert.X509Certificate.verify(java.security.PublicKey,java.security.Provider)`

## org.bouncycastle.jce.spec.IESParameterSpec

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.jce.spec.IESParameterSpec.<init>(byte[],byte[],int,int)`

## org.bouncycastle.math.ec.DoubleAddMultiplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.math.ec.DoubleAddMultiplier`

## org.bouncycastle.math.ec.ECCurve

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.createPoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement[],boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.setPreCompInfo(org.bouncycastle.math.ec.ECPoint,java.lang.String,org.bouncycastle.math.ec.PreCompInfo)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.validatePoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.bouncycastle.math.ec.ECCurve`
+ MUST NOW IMPLEMENT: `org.bouncycastle.math.ec.ECCurve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.bouncycastle.math.ec.ECCurve`
+ MUST NOW IMPLEMENT: `org.bouncycastle.math.ec.ECCurve.randomFieldElement(java.security.SecureRandom)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.bouncycastle.math.ec.ECCurve`
+ MUST NOW IMPLEMENT: `org.bouncycastle.math.ec.ECCurve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.bouncycastle.math.ec.ECCurve`
+ MUST NOW IMPLEMENT: `org.bouncycastle.math.ec.ECCurve.isValidFieldElement(java.math.BigInteger)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.bouncycastle.math.ec.ECCurve`
+ MUST NOW IMPLEMENT: `org.bouncycastle.math.ec.ECCurve.randomFieldElementMult(java.security.SecureRandom)`

## org.bouncycastle.math.ec.ECCurve$AbstractF2m

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.createPoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement[],boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.setPreCompInfo(org.bouncycastle.math.ec.ECPoint,java.lang.String,org.bouncycastle.math.ec.PreCompInfo)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.validatePoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.bouncycastle.math.ec.ECCurve$AbstractF2m`
+ MUST NOW IMPLEMENT: `org.bouncycastle.math.ec.ECCurve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.bouncycastle.math.ec.ECCurve$AbstractF2m`
+ MUST NOW IMPLEMENT: `org.bouncycastle.math.ec.ECCurve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement[])`

## org.bouncycastle.math.ec.ECCurve$AbstractFp

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.createPoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement[],boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.setPreCompInfo(org.bouncycastle.math.ec.ECPoint,java.lang.String,org.bouncycastle.math.ec.PreCompInfo)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.validatePoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.bouncycastle.math.ec.ECCurve$AbstractFp`
+ MUST NOW IMPLEMENT: `org.bouncycastle.math.ec.ECCurve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.bouncycastle.math.ec.ECCurve$AbstractFp`
+ MUST NOW IMPLEMENT: `org.bouncycastle.math.ec.ECCurve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

## org.bouncycastle.math.ec.ECCurve$F2m

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve$F2m.createPoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve$F2m.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve$F2m.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement[],boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve$F2m.getH()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve$F2m.getN()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.setPreCompInfo(org.bouncycastle.math.ec.ECPoint,java.lang.String,org.bouncycastle.math.ec.PreCompInfo)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.validatePoint(java.math.BigInteger,java.math.BigInteger,boolean)`

## org.bouncycastle.math.ec.ECCurve$Fp

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.math.ec.ECCurve$Fp.<init>(java.math.BigInteger,java.math.BigInteger,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve$Fp.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve$Fp.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement[],boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.createPoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.setPreCompInfo(org.bouncycastle.math.ec.ECPoint,java.lang.String,org.bouncycastle.math.ec.PreCompInfo)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.validatePoint(java.math.BigInteger,java.math.BigInteger,boolean)`

## org.bouncycastle.math.ec.ECFieldElement$F2m

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.math.ec.ECFieldElement$F2m.<init>(int,int,java.math.BigInteger)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECFieldElement$F2m.checkFieldElements(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

## org.bouncycastle.math.ec.ECPoint

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.bouncycastle.math.ec.ECPoint.EMPTY_ZS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.withCompression`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getEncoded()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getX()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getY()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.isCompressed()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.satisfiesCofactor()`

## org.bouncycastle.math.ec.ECPoint$AbstractF2m

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.bouncycastle.math.ec.ECPoint.EMPTY_ZS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.withCompression`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getEncoded()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getX()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getY()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.isCompressed()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.satisfiesCofactor()`

## org.bouncycastle.math.ec.ECPoint$AbstractFp

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.bouncycastle.math.ec.ECPoint.EMPTY_ZS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.withCompression`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getEncoded()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getX()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getY()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.isCompressed()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.satisfiesCofactor()`

## org.bouncycastle.math.ec.ECPoint$F2m

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.bouncycastle.math.ec.ECPoint$F2m`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.bouncycastle.math.ec.ECPoint$F2m`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.math.ec.ECPoint$F2m.<init>(org.bouncycastle.math.ec.ECCurve,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.math.ec.ECPoint$F2m.<init>(org.bouncycastle.math.ec.ECCurve,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,boolean)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.EMPTY_ZS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.curve`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.preCompTable`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.withCompression`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.x`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.y`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.zs`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$F2m.add(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$F2m.getYCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$F2m.negate()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$F2m.scaleX(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$F2m.scaleY(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$F2m.subtract(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$F2m.tau()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$F2m.twice()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$F2m.twicePlus(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.equals(java.lang.Object)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.equals(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getAffineXCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getAffineYCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getCurve()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getEncoded(boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getXCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getZCoord(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getZCoords()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.hashCode()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isInfinity()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isNormalized()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isValid()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.multiply(java.math.BigInteger)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.normalize()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.threeTimes()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.timesPow2(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.toString()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$AbstractF2m.satisfiesCurveEquation()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$F2m.addSimple(org.bouncycastle.math.ec.ECPoint$F2m)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$F2m.detach()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$F2m.getCompressionYTilde()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$F2m.subtractSimple(org.bouncycastle.math.ec.ECPoint$F2m)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.checkNormalized()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.createScaledPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getCurveCoordinateSystem()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getEncoded()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getInitialZCoords(org.bouncycastle.math.ec.ECCurve)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getRawZCoords()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getX()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getY()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.isCompressed()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.satisfiesCofactor()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.bouncycastle.math.ec.ECPoint$F2m.tau()`
+ NEW RETURN TYPE: `org.bouncycastle.math.ec.ECPoint$AbstractF2m.tau()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.bouncycastle.math.ec.ECPoint$F2m.tau()`
+ NEW RETURN TYPE: `org.bouncycastle.math.ec.ECPoint$AbstractF2m.tau()`

## org.bouncycastle.math.ec.ECPoint$Fp

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.bouncycastle.math.ec.ECPoint$Fp`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.bouncycastle.math.ec.ECPoint$Fp`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.math.ec.ECPoint$Fp.<init>(org.bouncycastle.math.ec.ECCurve,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.math.ec.ECPoint$Fp.<init>(org.bouncycastle.math.ec.ECCurve,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,boolean)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.EMPTY_ZS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.curve`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.preCompTable`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.withCompression`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.x`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.y`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.zs`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$AbstractFp.subtract(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$Fp.add(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$Fp.getZCoord(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$Fp.negate()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$Fp.threeTimes()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$Fp.timesPow2(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$Fp.twice()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$Fp.twicePlus(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.equals(java.lang.Object)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.equals(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getAffineXCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getAffineYCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getCurve()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getEncoded(boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getXCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getYCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getZCoords()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.hashCode()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isInfinity()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isNormalized()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isValid()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.multiply(java.math.BigInteger)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.normalize()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.scaleX(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.scaleY(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.toString()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$AbstractFp.getCompressionYTilde()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$AbstractFp.satisfiesCurveEquation()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$Fp.calculateJacobianModifiedW(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$Fp.detach()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$Fp.doubleProductFromSquares(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$Fp.eight(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$Fp.four(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$Fp.getJacobianModifiedW()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$Fp.three(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$Fp.twiceJacobianModified(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$Fp.two(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.checkNormalized()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.createScaledPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getCurveCoordinateSystem()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getEncoded()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getInitialZCoords(org.bouncycastle.math.ec.ECCurve)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getRawZCoords()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getX()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getY()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.isCompressed()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.satisfiesCofactor()`

## org.bouncycastle.math.ec.FixedPointCombMultiplier

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.FixedPointCombMultiplier.getWidthForCombSize(int)`

## org.bouncycastle.math.ec.FixedPointPreCompInfo

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.FixedPointPreCompInfo.preComp`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.FixedPointPreCompInfo.getPreComp()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.FixedPointPreCompInfo.setPreComp(org.bouncycastle.math.ec.ECPoint[])`

## org.bouncycastle.math.ec.FixedPointUtil

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.FixedPointUtil.precompute(org.bouncycastle.math.ec.ECPoint,int)`

## org.bouncycastle.math.ec.MixedNafR2LMultiplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.math.ec.MixedNafR2LMultiplier`

## org.bouncycastle.math.ec.MontgomeryLadderMultiplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.math.ec.MontgomeryLadderMultiplier`

## org.bouncycastle.math.ec.NafL2RMultiplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.math.ec.NafL2RMultiplier`

## org.bouncycastle.math.ec.NafR2LMultiplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.math.ec.NafR2LMultiplier`

## org.bouncycastle.math.ec.ReferenceMultiplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.math.ec.ReferenceMultiplier`

## org.bouncycastle.math.ec.WNafL2RMultiplier

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.WNafL2RMultiplier.getWindowSize(int)`

## org.bouncycastle.math.ec.WNafUtil

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.WNafUtil.mapPointWithPrecomp(org.bouncycastle.math.ec.ECPoint,int,boolean,org.bouncycastle.math.ec.ECPointMap)`

## org.bouncycastle.math.ec.WTauNafPreCompInfo

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.math.ec.WTauNafPreCompInfo.preComp`
+ NEW FIELD: `org.bouncycastle.math.ec.WTauNafPreCompInfo.preComp`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.math.ec.WTauNafPreCompInfo.preComp`
+ NEW FIELD: `org.bouncycastle.math.ec.WTauNafPreCompInfo.preComp`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.WTauNafPreCompInfo.setPreComp(org.bouncycastle.math.ec.ECPoint$F2m[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.bouncycastle.math.ec.WTauNafPreCompInfo.getPreComp()`
+ NEW RETURN TYPE: `org.bouncycastle.math.ec.WTauNafPreCompInfo.getPreComp()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.bouncycastle.math.ec.WTauNafPreCompInfo.getPreComp()`
+ NEW RETURN TYPE: `org.bouncycastle.math.ec.WTauNafPreCompInfo.getPreComp()`

## org.bouncycastle.math.ec.ZSignedDigitL2RMultiplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.math.ec.ZSignedDigitL2RMultiplier`

## org.bouncycastle.math.ec.ZSignedDigitR2LMultiplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.math.ec.ZSignedDigitR2LMultiplier`

## org.bouncycastle.math.ec.custom.djb.Curve25519

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.createPoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.setPreCompInfo(org.bouncycastle.math.ec.ECPoint,java.lang.String,org.bouncycastle.math.ec.PreCompInfo)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.validatePoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.djb.Curve25519.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.djb.Curve25519.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement[],boolean)`

## org.bouncycastle.math.ec.custom.djb.Curve25519Point

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.bouncycastle.math.ec.custom.djb.Curve25519Point`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.bouncycastle.math.ec.custom.djb.Curve25519Point`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.math.ec.custom.djb.Curve25519Point.<init>(org.bouncycastle.math.ec.ECCurve,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.math.ec.custom.djb.Curve25519Point.<init>(org.bouncycastle.math.ec.ECCurve,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,boolean)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.EMPTY_ZS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.curve`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.preCompTable`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.withCompression`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.x`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.y`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.zs`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$AbstractFp.subtract(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.equals(java.lang.Object)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.equals(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getAffineXCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getAffineYCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getCurve()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getEncoded(boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getXCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getYCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getZCoords()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.hashCode()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isInfinity()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isNormalized()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isValid()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.multiply(java.math.BigInteger)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.normalize()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.scaleX(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.scaleY(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.timesPow2(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.toString()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.djb.Curve25519Point.add(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.djb.Curve25519Point.getZCoord(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.djb.Curve25519Point.negate()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.djb.Curve25519Point.threeTimes()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.djb.Curve25519Point.twice()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.djb.Curve25519Point.twicePlus(org.bouncycastle.math.ec.ECPoint)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$AbstractFp.getCompressionYTilde()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$AbstractFp.satisfiesCurveEquation()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.checkNormalized()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.createScaledPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getCurveCoordinateSystem()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getEncoded()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getInitialZCoords(org.bouncycastle.math.ec.ECCurve)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getRawZCoords()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getX()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getY()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.isCompressed()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.satisfiesCofactor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.djb.Curve25519Point.calculateJacobianModifiedW(org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement,int[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.djb.Curve25519Point.detach()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.djb.Curve25519Point.getJacobianModifiedW()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.djb.Curve25519Point.twiceJacobianModified(boolean)`

## org.bouncycastle.math.ec.custom.sec.SecP192K1Curve

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.createPoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.setPreCompInfo(org.bouncycastle.math.ec.ECPoint,java.lang.String,org.bouncycastle.math.ec.PreCompInfo)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.validatePoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP192K1Curve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP192K1Curve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement[],boolean)`

## org.bouncycastle.math.ec.custom.sec.SecP192K1Point

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.bouncycastle.math.ec.custom.sec.SecP192K1Point`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.bouncycastle.math.ec.custom.sec.SecP192K1Point`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.math.ec.custom.sec.SecP192K1Point.<init>(org.bouncycastle.math.ec.ECCurve,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.math.ec.custom.sec.SecP192K1Point.<init>(org.bouncycastle.math.ec.ECCurve,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,boolean)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.EMPTY_ZS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.curve`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.preCompTable`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.withCompression`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.x`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.y`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.zs`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$AbstractFp.subtract(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.equals(java.lang.Object)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.equals(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getAffineXCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getAffineYCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getCurve()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getEncoded(boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getXCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getYCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getZCoord(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getZCoords()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.hashCode()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isInfinity()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isNormalized()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isValid()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.multiply(java.math.BigInteger)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.normalize()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.scaleX(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.scaleY(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.timesPow2(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.toString()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP192K1Point.add(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP192K1Point.negate()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP192K1Point.threeTimes()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP192K1Point.twice()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP192K1Point.twicePlus(org.bouncycastle.math.ec.ECPoint)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$AbstractFp.getCompressionYTilde()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$AbstractFp.satisfiesCurveEquation()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.checkNormalized()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.createScaledPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getCurveCoordinateSystem()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getEncoded()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getInitialZCoords(org.bouncycastle.math.ec.ECCurve)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getRawZCoords()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getX()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getY()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.isCompressed()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.satisfiesCofactor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP192K1Point.detach()`

## org.bouncycastle.math.ec.custom.sec.SecP192R1Curve

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.createPoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.setPreCompInfo(org.bouncycastle.math.ec.ECPoint,java.lang.String,org.bouncycastle.math.ec.PreCompInfo)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.validatePoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP192R1Curve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP192R1Curve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement[],boolean)`

## org.bouncycastle.math.ec.custom.sec.SecP192R1Point

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.bouncycastle.math.ec.custom.sec.SecP192R1Point`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.bouncycastle.math.ec.custom.sec.SecP192R1Point`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.math.ec.custom.sec.SecP192R1Point.<init>(org.bouncycastle.math.ec.ECCurve,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.math.ec.custom.sec.SecP192R1Point.<init>(org.bouncycastle.math.ec.ECCurve,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,boolean)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.EMPTY_ZS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.curve`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.preCompTable`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.withCompression`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.x`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.y`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.zs`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$AbstractFp.subtract(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.equals(java.lang.Object)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.equals(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getAffineXCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getAffineYCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getCurve()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getEncoded(boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getXCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getYCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getZCoord(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getZCoords()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.hashCode()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isInfinity()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isNormalized()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isValid()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.multiply(java.math.BigInteger)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.normalize()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.scaleX(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.scaleY(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.timesPow2(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.toString()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP192R1Point.add(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP192R1Point.negate()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP192R1Point.threeTimes()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP192R1Point.twice()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP192R1Point.twicePlus(org.bouncycastle.math.ec.ECPoint)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$AbstractFp.getCompressionYTilde()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$AbstractFp.satisfiesCurveEquation()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.checkNormalized()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.createScaledPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getCurveCoordinateSystem()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getEncoded()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getInitialZCoords(org.bouncycastle.math.ec.ECCurve)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getRawZCoords()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getX()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getY()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.isCompressed()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.satisfiesCofactor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP192R1Point.detach()`

## org.bouncycastle.math.ec.custom.sec.SecP224K1Curve

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.createPoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.setPreCompInfo(org.bouncycastle.math.ec.ECPoint,java.lang.String,org.bouncycastle.math.ec.PreCompInfo)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.validatePoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP224K1Curve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP224K1Curve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement[],boolean)`

## org.bouncycastle.math.ec.custom.sec.SecP224K1Point

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.bouncycastle.math.ec.custom.sec.SecP224K1Point`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.bouncycastle.math.ec.custom.sec.SecP224K1Point`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.math.ec.custom.sec.SecP224K1Point.<init>(org.bouncycastle.math.ec.ECCurve,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.math.ec.custom.sec.SecP224K1Point.<init>(org.bouncycastle.math.ec.ECCurve,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,boolean)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.EMPTY_ZS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.curve`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.preCompTable`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.withCompression`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.x`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.y`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.zs`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$AbstractFp.subtract(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.equals(java.lang.Object)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.equals(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getAffineXCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getAffineYCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getCurve()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getEncoded(boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getXCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getYCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getZCoord(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getZCoords()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.hashCode()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isInfinity()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isNormalized()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isValid()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.multiply(java.math.BigInteger)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.normalize()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.scaleX(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.scaleY(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.timesPow2(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.toString()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP224K1Point.add(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP224K1Point.negate()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP224K1Point.threeTimes()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP224K1Point.twice()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP224K1Point.twicePlus(org.bouncycastle.math.ec.ECPoint)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$AbstractFp.getCompressionYTilde()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$AbstractFp.satisfiesCurveEquation()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.checkNormalized()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.createScaledPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getCurveCoordinateSystem()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getEncoded()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getInitialZCoords(org.bouncycastle.math.ec.ECCurve)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getRawZCoords()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getX()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getY()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.isCompressed()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.satisfiesCofactor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP224K1Point.detach()`

## org.bouncycastle.math.ec.custom.sec.SecP224R1Curve

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.createPoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.setPreCompInfo(org.bouncycastle.math.ec.ECPoint,java.lang.String,org.bouncycastle.math.ec.PreCompInfo)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.validatePoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP224R1Curve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP224R1Curve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement[],boolean)`

## org.bouncycastle.math.ec.custom.sec.SecP224R1Point

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.bouncycastle.math.ec.custom.sec.SecP224R1Point`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.bouncycastle.math.ec.custom.sec.SecP224R1Point`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.math.ec.custom.sec.SecP224R1Point.<init>(org.bouncycastle.math.ec.ECCurve,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.math.ec.custom.sec.SecP224R1Point.<init>(org.bouncycastle.math.ec.ECCurve,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,boolean)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.EMPTY_ZS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.curve`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.preCompTable`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.withCompression`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.x`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.y`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.zs`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$AbstractFp.subtract(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.equals(java.lang.Object)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.equals(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getAffineXCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getAffineYCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getCurve()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getEncoded(boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getXCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getYCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getZCoord(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getZCoords()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.hashCode()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isInfinity()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isNormalized()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isValid()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.multiply(java.math.BigInteger)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.normalize()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.scaleX(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.scaleY(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.timesPow2(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.toString()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP224R1Point.add(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP224R1Point.negate()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP224R1Point.threeTimes()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP224R1Point.twice()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP224R1Point.twicePlus(org.bouncycastle.math.ec.ECPoint)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$AbstractFp.getCompressionYTilde()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$AbstractFp.satisfiesCurveEquation()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.checkNormalized()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.createScaledPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getCurveCoordinateSystem()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getEncoded()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getInitialZCoords(org.bouncycastle.math.ec.ECCurve)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getRawZCoords()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getX()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getY()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.isCompressed()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.satisfiesCofactor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP224R1Point.detach()`

## org.bouncycastle.math.ec.custom.sec.SecP256K1Curve

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.createPoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.setPreCompInfo(org.bouncycastle.math.ec.ECPoint,java.lang.String,org.bouncycastle.math.ec.PreCompInfo)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.validatePoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP256K1Curve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP256K1Curve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement[],boolean)`

## org.bouncycastle.math.ec.custom.sec.SecP256K1Point

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.bouncycastle.math.ec.custom.sec.SecP256K1Point`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.bouncycastle.math.ec.custom.sec.SecP256K1Point`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.math.ec.custom.sec.SecP256K1Point.<init>(org.bouncycastle.math.ec.ECCurve,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.math.ec.custom.sec.SecP256K1Point.<init>(org.bouncycastle.math.ec.ECCurve,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,boolean)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.EMPTY_ZS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.curve`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.preCompTable`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.withCompression`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.x`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.y`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.zs`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$AbstractFp.subtract(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.equals(java.lang.Object)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.equals(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getAffineXCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getAffineYCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getCurve()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getEncoded(boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getXCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getYCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getZCoord(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getZCoords()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.hashCode()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isInfinity()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isNormalized()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isValid()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.multiply(java.math.BigInteger)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.normalize()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.scaleX(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.scaleY(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.timesPow2(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.toString()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP256K1Point.add(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP256K1Point.negate()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP256K1Point.threeTimes()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP256K1Point.twice()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP256K1Point.twicePlus(org.bouncycastle.math.ec.ECPoint)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$AbstractFp.getCompressionYTilde()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$AbstractFp.satisfiesCurveEquation()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.checkNormalized()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.createScaledPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getCurveCoordinateSystem()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getEncoded()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getInitialZCoords(org.bouncycastle.math.ec.ECCurve)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getRawZCoords()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getX()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getY()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.isCompressed()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.satisfiesCofactor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP256K1Point.detach()`

## org.bouncycastle.math.ec.custom.sec.SecP256R1Curve

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.createPoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.setPreCompInfo(org.bouncycastle.math.ec.ECPoint,java.lang.String,org.bouncycastle.math.ec.PreCompInfo)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.validatePoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP256R1Curve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP256R1Curve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement[],boolean)`

## org.bouncycastle.math.ec.custom.sec.SecP256R1Point

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.bouncycastle.math.ec.custom.sec.SecP256R1Point`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.bouncycastle.math.ec.custom.sec.SecP256R1Point`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.math.ec.custom.sec.SecP256R1Point.<init>(org.bouncycastle.math.ec.ECCurve,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.math.ec.custom.sec.SecP256R1Point.<init>(org.bouncycastle.math.ec.ECCurve,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,boolean)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.EMPTY_ZS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.curve`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.preCompTable`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.withCompression`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.x`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.y`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.zs`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$AbstractFp.subtract(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.equals(java.lang.Object)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.equals(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getAffineXCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getAffineYCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getCurve()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getEncoded(boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getXCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getYCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getZCoord(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getZCoords()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.hashCode()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isInfinity()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isNormalized()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isValid()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.multiply(java.math.BigInteger)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.normalize()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.scaleX(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.scaleY(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.timesPow2(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.toString()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP256R1Point.add(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP256R1Point.negate()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP256R1Point.threeTimes()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP256R1Point.twice()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP256R1Point.twicePlus(org.bouncycastle.math.ec.ECPoint)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$AbstractFp.getCompressionYTilde()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$AbstractFp.satisfiesCurveEquation()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.checkNormalized()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.createScaledPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getCurveCoordinateSystem()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getEncoded()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getInitialZCoords(org.bouncycastle.math.ec.ECCurve)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getRawZCoords()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getX()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getY()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.isCompressed()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.satisfiesCofactor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP256R1Point.detach()`

## org.bouncycastle.math.ec.custom.sec.SecP384R1Curve

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.createPoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.setPreCompInfo(org.bouncycastle.math.ec.ECPoint,java.lang.String,org.bouncycastle.math.ec.PreCompInfo)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.validatePoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP384R1Curve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP384R1Curve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement[],boolean)`

## org.bouncycastle.math.ec.custom.sec.SecP384R1Point

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.bouncycastle.math.ec.custom.sec.SecP384R1Point`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.bouncycastle.math.ec.custom.sec.SecP384R1Point`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.math.ec.custom.sec.SecP384R1Point.<init>(org.bouncycastle.math.ec.ECCurve,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.math.ec.custom.sec.SecP384R1Point.<init>(org.bouncycastle.math.ec.ECCurve,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,boolean)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.EMPTY_ZS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.curve`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.preCompTable`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.withCompression`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.x`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.y`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.zs`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$AbstractFp.subtract(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.equals(java.lang.Object)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.equals(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getAffineXCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getAffineYCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getCurve()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getEncoded(boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getXCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getYCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getZCoord(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getZCoords()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.hashCode()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isInfinity()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isNormalized()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isValid()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.multiply(java.math.BigInteger)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.normalize()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.scaleX(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.scaleY(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.timesPow2(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.toString()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP384R1Point.add(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP384R1Point.negate()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP384R1Point.threeTimes()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP384R1Point.twice()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP384R1Point.twicePlus(org.bouncycastle.math.ec.ECPoint)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$AbstractFp.getCompressionYTilde()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$AbstractFp.satisfiesCurveEquation()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.checkNormalized()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.createScaledPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getCurveCoordinateSystem()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getEncoded()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getInitialZCoords(org.bouncycastle.math.ec.ECCurve)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getRawZCoords()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getX()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getY()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.isCompressed()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.satisfiesCofactor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP384R1Point.detach()`

## org.bouncycastle.math.ec.custom.sec.SecP521R1Curve

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.createPoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.setPreCompInfo(org.bouncycastle.math.ec.ECPoint,java.lang.String,org.bouncycastle.math.ec.PreCompInfo)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECCurve.validatePoint(java.math.BigInteger,java.math.BigInteger,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP521R1Curve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP521R1Curve.createRawPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement[],boolean)`

## org.bouncycastle.math.ec.custom.sec.SecP521R1Point

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.bouncycastle.math.ec.custom.sec.SecP521R1Point`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.bouncycastle.math.ec.custom.sec.SecP521R1Point`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.math.ec.custom.sec.SecP521R1Point.<init>(org.bouncycastle.math.ec.ECCurve,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.math.ec.custom.sec.SecP521R1Point.<init>(org.bouncycastle.math.ec.ECCurve,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,boolean)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.EMPTY_ZS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.curve`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.preCompTable`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.withCompression`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.x`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.y`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.ECPoint.zs`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint$AbstractFp.subtract(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.equals(java.lang.Object)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.equals(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getAffineXCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getAffineYCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getCurve()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getEncoded(boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getXCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getYCoord()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getZCoord(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.getZCoords()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.hashCode()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isInfinity()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isNormalized()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.isValid()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.multiply(java.math.BigInteger)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.normalize()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.scaleX(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.scaleY(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.timesPow2(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.ECPoint.toString()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP521R1Point.add(org.bouncycastle.math.ec.ECPoint)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP521R1Point.negate()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP521R1Point.threeTimes()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP521R1Point.twice()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.bouncycastle.math.ec.custom.sec.SecP521R1Point.twicePlus(org.bouncycastle.math.ec.ECPoint)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$AbstractFp.getCompressionYTilde()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint$AbstractFp.satisfiesCurveEquation()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.checkNormalized()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.createScaledPoint(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getCurveCoordinateSystem()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getEncoded()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getInitialZCoords(org.bouncycastle.math.ec.ECCurve)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getRawZCoords()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getX()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.getY()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.isCompressed()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.ECPoint.satisfiesCofactor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP521R1Point.detach()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP521R1Point.doubleProductFromSquares(org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement,org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP521R1Point.eight(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP521R1Point.four(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP521R1Point.three(org.bouncycastle.math.ec.ECFieldElement)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.custom.sec.SecP521R1Point.two(org.bouncycastle.math.ec.ECFieldElement)`

## org.bouncycastle.math.ec.endo.GLVTypeBEndomorphism

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.endo.GLVTypeBEndomorphism.curve`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.endo.GLVTypeBEndomorphism.calculateB(java.math.BigInteger,java.math.BigInteger,int)`

## org.bouncycastle.math.ec.endo.GLVTypeBParameters

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.endo.GLVTypeBParameters.bits`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.endo.GLVTypeBParameters.g1`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.endo.GLVTypeBParameters.g2`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.endo.GLVTypeBParameters.v1`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.math.ec.endo.GLVTypeBParameters.v2`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.endo.GLVTypeBParameters.getV1()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.math.ec.endo.GLVTypeBParameters.getV2()`

## org.bouncycastle.pqc.asn1.GMSSPrivateKey

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.pqc.asn1.GMSSPublicKey

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.pqc.asn1.McElieceCCA2PrivateKey

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.asn1.McElieceCCA2PrivateKey.<init>(org.bouncycastle.asn1.ASN1ObjectIdentifier,int,int,org.bouncycastle.pqc.math.linearalgebra.GF2mField,org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM,org.bouncycastle.pqc.math.linearalgebra.Permutation,org.bouncycastle.pqc.math.linearalgebra.GF2Matrix,org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.asn1.McElieceCCA2PrivateKey.getH()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.asn1.McElieceCCA2PrivateKey.getOID()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.asn1.McElieceCCA2PrivateKey.getQInv()`

## org.bouncycastle.pqc.asn1.McElieceCCA2PublicKey

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.asn1.McElieceCCA2PublicKey.<init>(org.bouncycastle.asn1.ASN1ObjectIdentifier,int,int,org.bouncycastle.pqc.math.linearalgebra.GF2Matrix)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.asn1.McElieceCCA2PublicKey.getOID()`

## org.bouncycastle.pqc.asn1.McEliecePrivateKey

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.asn1.McEliecePrivateKey.<init>(org.bouncycastle.asn1.ASN1ObjectIdentifier,int,int,org.bouncycastle.pqc.math.linearalgebra.GF2mField,org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM,org.bouncycastle.pqc.math.linearalgebra.GF2Matrix,org.bouncycastle.pqc.math.linearalgebra.Permutation,org.bouncycastle.pqc.math.linearalgebra.Permutation,org.bouncycastle.pqc.math.linearalgebra.GF2Matrix,org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.asn1.McEliecePrivateKey.getH()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.asn1.McEliecePrivateKey.getOID()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.asn1.McEliecePrivateKey.getQInv()`

## org.bouncycastle.pqc.asn1.McEliecePublicKey

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.asn1.McEliecePublicKey.<init>(org.bouncycastle.asn1.ASN1ObjectIdentifier,int,int,org.bouncycastle.pqc.math.linearalgebra.GF2Matrix)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.asn1.McEliecePublicKey.getOID()`

## org.bouncycastle.pqc.asn1.ParSet

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.pqc.asn1.RainbowPrivateKey

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.pqc.asn1.RainbowPublicKey

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.pqc.crypto.DigestingMessageSigner

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.crypto.DigestingMessageSigner.verify(byte[])`

## org.bouncycastle.pqc.crypto.MessageEncryptor

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.bouncycastle.pqc.crypto.MessageEncryptor.messageDecrypt(byte[])`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.bouncycastle.pqc.crypto.MessageEncryptor.messageEncrypt(byte[])`

## org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc.<init>(org.bouncycastle.crypto.Digest,byte[][],int[],org.bouncycastle.pqc.crypto.gmss.Treehash[],java.util.Vector[])`

## org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyParameters

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyParameters.<init>(boolean,org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Parameters)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyParameters.getParameters()`

## org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Parameters

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Parameters.<init>(org.bouncycastle.crypto.Digest)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Parameters.digest`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Parameters.getDigest()`
+ NEW RETURN TYPE: `org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Parameters.getDigest()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Parameters.getDigest()`
+ NEW RETURN TYPE: `org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Parameters.getDigest()`

## org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Primitives

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Primitives`

## org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters.<init>(java.lang.String,int,int,byte[],byte[],byte[],byte[],byte[][],org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Parameters)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters.<init>(java.lang.String,int,int,org.bouncycastle.pqc.math.linearalgebra.GF2mField,org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM,org.bouncycastle.pqc.math.linearalgebra.Permutation,org.bouncycastle.pqc.math.linearalgebra.GF2Matrix,org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[],org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Parameters)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyParameters.getParameters()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters.getOIDString()`

## org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters.<init>(java.lang.String,int,int,byte[],org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Parameters)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters.<init>(java.lang.String,int,int,org.bouncycastle.pqc.math.linearalgebra.GF2Matrix,org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Parameters)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyParameters.getParameters()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters.getMatrixG()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters.getOIDString()`

## org.bouncycastle.pqc.crypto.mceliece.McElieceFujisakiCipher

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.bouncycastle.pqc.crypto.mceliece.McElieceFujisakiCipher.messageDecrypt(byte[])`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.bouncycastle.pqc.crypto.mceliece.McElieceFujisakiCipher.messageEncrypt(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.crypto.mceliece.McElieceFujisakiCipher.initCipherDecrypt(org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters)`

## org.bouncycastle.pqc.crypto.mceliece.McElieceFujisakiDigestCipher

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.pqc.crypto.mceliece.McElieceFujisakiDigestCipher`

## org.bouncycastle.pqc.crypto.mceliece.McElieceKobaraImaiCipher

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.bouncycastle.pqc.crypto.mceliece.McElieceKobaraImaiCipher.messageDecrypt(byte[])`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.bouncycastle.pqc.crypto.mceliece.McElieceKobaraImaiCipher.messageEncrypt(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.crypto.mceliece.McElieceKobaraImaiCipher.initCipherDecrypt(org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters)`

## org.bouncycastle.pqc.crypto.mceliece.McElieceKobaraImaiDigestCipher

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.pqc.crypto.mceliece.McElieceKobaraImaiDigestCipher`

## org.bouncycastle.pqc.crypto.mceliece.McEliecePKCSCipher

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.pqc.crypto.mceliece.McEliecePKCSCipher`

## org.bouncycastle.pqc.crypto.mceliece.McEliecePKCSDigestCipher

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.pqc.crypto.mceliece.McEliecePKCSDigestCipher`

## org.bouncycastle.pqc.crypto.mceliece.McEliecePointchevalCipher

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.bouncycastle.pqc.crypto.mceliece.McEliecePointchevalCipher.messageDecrypt(byte[])`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.bouncycastle.pqc.crypto.mceliece.McEliecePointchevalCipher.messageEncrypt(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.crypto.mceliece.McEliecePointchevalCipher.initCipherDecrypt(org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.crypto.mceliece.McEliecePointchevalCipher.initCipherEncrypt(org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters)`

## org.bouncycastle.pqc.crypto.mceliece.McEliecePointchevalDigestCipher

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.pqc.crypto.mceliece.McEliecePointchevalDigestCipher`

## org.bouncycastle.pqc.crypto.mceliece.McEliecePrivateKeyParameters

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.crypto.mceliece.McEliecePrivateKeyParameters.<init>(java.lang.String,int,int,byte[],byte[],byte[],byte[],byte[],byte[],byte[][],org.bouncycastle.pqc.crypto.mceliece.McElieceParameters)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.crypto.mceliece.McEliecePrivateKeyParameters.<init>(java.lang.String,int,int,org.bouncycastle.pqc.math.linearalgebra.GF2mField,org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM,org.bouncycastle.pqc.math.linearalgebra.GF2Matrix,org.bouncycastle.pqc.math.linearalgebra.Permutation,org.bouncycastle.pqc.math.linearalgebra.Permutation,org.bouncycastle.pqc.math.linearalgebra.GF2Matrix,org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[],org.bouncycastle.pqc.crypto.mceliece.McElieceParameters)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.crypto.mceliece.McEliecePrivateKeyParameters.getOIDString()`

## org.bouncycastle.pqc.crypto.mceliece.McEliecePublicKeyParameters

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.crypto.mceliece.McEliecePublicKeyParameters.<init>(java.lang.String,int,int,byte[],org.bouncycastle.pqc.crypto.mceliece.McElieceParameters)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.crypto.mceliece.McEliecePublicKeyParameters.<init>(java.lang.String,int,int,org.bouncycastle.pqc.math.linearalgebra.GF2Matrix,org.bouncycastle.pqc.crypto.mceliece.McElieceParameters)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.crypto.mceliece.McEliecePublicKeyParameters.getOIDString()`

## org.bouncycastle.pqc.jcajce.provider.gmss.BCGMSSPublicKey

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.jcajce.provider.gmss.BCGMSSPublicKey.<init>(org.bouncycastle.pqc.jcajce.spec.GMSSPublicKeySpec)`

## org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PrivateKey

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PrivateKey.<init>(java.lang.String,int,int,org.bouncycastle.pqc.math.linearalgebra.GF2mField,org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM,org.bouncycastle.pqc.math.linearalgebra.Permutation,org.bouncycastle.pqc.math.linearalgebra.GF2Matrix,org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[])`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PrivateKey.<init>(org.bouncycastle.pqc.jcajce.spec.McElieceCCA2PrivateKeySpec)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PrivateKey.getAlgParams()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PrivateKey.getMcElieceCCA2Parameters()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PrivateKey.getOID()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PrivateKey.getOIDString()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PrivateKey`

## org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PublicKey

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PublicKey.<init>(java.lang.String,int,int,org.bouncycastle.pqc.math.linearalgebra.GF2Matrix)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PublicKey.<init>(org.bouncycastle.pqc.jcajce.spec.McElieceCCA2PublicKeySpec)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PublicKey.getAlgParams()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PublicKey.getMcElieceCCA2Parameters()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PublicKey.getOID()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PublicKey.getOIDString()`

## org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePrivateKey

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePrivateKey.<init>(java.lang.String,int,int,org.bouncycastle.pqc.math.linearalgebra.GF2mField,org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM,org.bouncycastle.pqc.math.linearalgebra.GF2Matrix,org.bouncycastle.pqc.math.linearalgebra.Permutation,org.bouncycastle.pqc.math.linearalgebra.Permutation,org.bouncycastle.pqc.math.linearalgebra.GF2Matrix,org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[])`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePrivateKey.<init>(org.bouncycastle.pqc.jcajce.spec.McEliecePrivateKeySpec)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePrivateKey.getAlgParams()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePrivateKey.getMcElieceParameters()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePrivateKey.getOID()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePrivateKey.getOIDString()`

## org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePublicKey

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePublicKey.<init>(java.lang.String,int,int,org.bouncycastle.pqc.math.linearalgebra.GF2Matrix)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePublicKey.<init>(org.bouncycastle.pqc.jcajce.spec.McEliecePublicKeySpec)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePublicKey.getAlgParams()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePublicKey.getMcElieceParameters()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePublicKey.getOID()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePublicKey.getOIDString()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePublicKey`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeyFactorySpi

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeyFactorySpi.generatePrivate(org.bouncycastle.asn1.pkcs.PrivateKeyInfo)`
+ NOW THROWS: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeyFactorySpi.generatePrivate(org.bouncycastle.asn1.pkcs.PrivateKeyInfo)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeyFactorySpi.generatePublic(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo)`
+ NOW THROWS: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeyFactorySpi.generatePublic(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeyFactorySpi.generatePrivate(org.bouncycastle.asn1.pkcs.PrivateKeyInfo)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeyFactorySpi.generatePublic(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeyFactorySpi.generatePrivate(java.security.spec.KeySpec)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeyFactorySpi.generatePublic(java.security.spec.KeySpec)`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceFujisakiCipherSpi

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceFujisakiCipherSpi.messageDecrypt(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceFujisakiCipherSpi.messageEncrypt(byte[])`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceFujisakiCipherSpi$McElieceFujisaki

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceFujisakiCipherSpi.messageDecrypt(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceFujisakiCipherSpi.messageEncrypt(byte[])`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceFujisakiCipherSpi$McElieceFujisaki224

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceFujisakiCipherSpi$McElieceFujisaki224`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceFujisakiCipherSpi$McElieceFujisaki256

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceFujisakiCipherSpi$McElieceFujisaki256`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceFujisakiCipherSpi$McElieceFujisaki384

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceFujisakiCipherSpi$McElieceFujisaki384`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceFujisakiCipherSpi$McElieceFujisaki512

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceFujisakiCipherSpi$McElieceFujisaki512`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyFactorySpi

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyFactorySpi.generatePrivate(org.bouncycastle.asn1.pkcs.PrivateKeyInfo)`
+ NOW THROWS: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyFactorySpi.generatePrivate(org.bouncycastle.asn1.pkcs.PrivateKeyInfo)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyFactorySpi.generatePublic(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo)`
+ NOW THROWS: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyFactorySpi.generatePublic(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyFactorySpi.generatePrivate(org.bouncycastle.asn1.pkcs.PrivateKeyInfo)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyFactorySpi.generatePublic(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyFactorySpi.generatePrivate(java.security.spec.KeySpec)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyFactorySpi.generatePublic(java.security.spec.KeySpec)`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyPairGeneratorSpi

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyPairGeneratorSpi.<init>(java.lang.String)`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyPairGeneratorSpi$McEliece

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyPairGeneratorSpi$McEliece`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyPairGeneratorSpi$McElieceCCA2

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyPairGeneratorSpi$McElieceCCA2`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi.messageDecrypt()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi.messageEncrypt()`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi$McElieceKobaraImai

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi.messageDecrypt()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi.messageEncrypt()`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi$McElieceKobaraImai224

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi.messageDecrypt()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi.messageEncrypt()`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi$McElieceKobaraImai256

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi.messageDecrypt()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi.messageEncrypt()`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi$McElieceKobaraImai384

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi.messageDecrypt()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi.messageEncrypt()`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi$McElieceKobaraImai512

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi.messageDecrypt()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi.messageEncrypt()`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePKCSCipherSpi

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePKCSCipherSpi.<init>(org.bouncycastle.crypto.Digest,org.bouncycastle.pqc.crypto.mceliece.McEliecePKCSCipher)`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePKCSCipherSpi$McEliecePKCS224

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePKCSCipherSpi$McEliecePKCS224`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePKCSCipherSpi$McEliecePKCS256

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePKCSCipherSpi$McEliecePKCS256`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePKCSCipherSpi$McEliecePKCS384

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePKCSCipherSpi$McEliecePKCS384`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePKCSCipherSpi$McEliecePKCS512

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePKCSCipherSpi$McEliecePKCS512`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi.messageDecrypt(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi.messageEncrypt(byte[])`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi$McEliecePointcheval

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi.messageDecrypt(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi.messageEncrypt(byte[])`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi$McEliecePointcheval224

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi.messageDecrypt(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi.messageEncrypt(byte[])`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi$McEliecePointcheval256

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi.messageDecrypt(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi.messageEncrypt(byte[])`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi$McEliecePointcheval384

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi.messageDecrypt(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi.messageEncrypt(byte[])`

## org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi$McEliecePointcheval512

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi.messageDecrypt(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi.messageEncrypt(byte[])`

## org.bouncycastle.pqc.jcajce.spec.ECCKeyGenParameterSpec

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.pqc.jcajce.spec.ECCKeyGenParameterSpec`

## org.bouncycastle.pqc.jcajce.spec.GMSSKeySpec

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.pqc.jcajce.spec.GMSSKeySpec`

## org.bouncycastle.pqc.jcajce.spec.GMSSPrivateKeySpec

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.pqc.jcajce.spec.GMSSPrivateKeySpec`

## org.bouncycastle.pqc.jcajce.spec.GMSSPublicKeySpec

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.pqc.jcajce.spec.GMSSPublicKeySpec`

## org.bouncycastle.pqc.jcajce.spec.McElieceCCA2ParameterSpec

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.pqc.jcajce.spec.McElieceCCA2ParameterSpec`

## org.bouncycastle.pqc.jcajce.spec.McElieceCCA2PrivateKeySpec

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.pqc.jcajce.spec.McElieceCCA2PrivateKeySpec`

## org.bouncycastle.pqc.jcajce.spec.McElieceCCA2PublicKeySpec

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.pqc.jcajce.spec.McElieceCCA2PublicKeySpec`

## org.bouncycastle.pqc.jcajce.spec.McEliecePrivateKeySpec

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.pqc.jcajce.spec.McEliecePrivateKeySpec`

## org.bouncycastle.pqc.jcajce.spec.McEliecePublicKeySpec

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.bouncycastle.pqc.jcajce.spec.McEliecePublicKeySpec`

## org.bouncycastle.pqc.math.linearalgebra.GF2nField

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.math.linearalgebra.GF2nField.<init>()`

## org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement.<init>(org.bouncycastle.pqc.math.linearalgebra.GF2nONBField,java.util.Random)`

## org.bouncycastle.pqc.math.linearalgebra.GF2nONBField

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.math.linearalgebra.GF2nONBField.<init>(int)`

## org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField.<init>(int)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField.<init>(int,boolean)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField.<init>(int,org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial)`

## org.bouncycastle.pqc.math.linearalgebra.IntUtils

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.math.linearalgebra.IntUtils.toFlexiBigIntArray(int[])`

## org.bouncycastle.pqc.math.linearalgebra.IntegerFunctions

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.math.linearalgebra.IntegerFunctions.floatLog(float)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.pqc.math.linearalgebra.IntegerFunctions.main(java.lang.String[])`

## org.bouncycastle.util.CollectionStore

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.bouncycastle.util.CollectionStore.<init>(java.util.Collection)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.bouncycastle.util.CollectionStore.getMatches(org.bouncycastle.util.Selector)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.bouncycastle.util.CollectionStore.getMatches(org.bouncycastle.util.Selector)`
+ NEW RETURN TYPE: `org.bouncycastle.util.CollectionStore.getMatches(org.bouncycastle.util.Selector<T>)`

## org.bouncycastle.util.Store

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.bouncycastle.util.Store.getMatches(org.bouncycastle.util.Selector)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.bouncycastle.util.Store.getMatches(org.bouncycastle.util.Selector)`
+ NEW RETURN TYPE: `org.bouncycastle.util.Store.getMatches(org.bouncycastle.util.Selector<T>)`

## org.bouncycastle.util.test.FixedSecureRandom

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.util.test.FixedSecureRandom.<init>(boolean,byte[])`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.bouncycastle.util.test.FixedSecureRandom.<init>(boolean,byte[][])`

## org.bouncycastle.x509.PKIXCertPathReviewer

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.bouncycastle.jce.provider.CertPathValidatorUtilities.CRL_UTIL`
+ NEW FIELD: `org.bouncycastle.x509.CertPathValidatorUtilities.CRL_UTIL`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.bouncycastle.jce.provider.CertPathValidatorUtilities.CRL_UTIL`
+ NEW FIELD: `org.bouncycastle.x509.CertPathValidatorUtilities.CRL_UTIL`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.jce.provider.CertPathValidatorUtilities.addAdditionalStoreFromLocation(java.lang.String,org.bouncycastle.x509.ExtendedPKIXParameters)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.jce.provider.CertPathValidatorUtilities.addAdditionalStoresFromAltNames(java.security.cert.X509Certificate,org.bouncycastle.x509.ExtendedPKIXParameters)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.jce.provider.CertPathValidatorUtilities.addAdditionalStoresFromCRLDistributionPoint(org.bouncycastle.asn1.x509.CRLDistPoint,org.bouncycastle.x509.ExtendedPKIXParameters)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.jce.provider.CertPathValidatorUtilities.findIssuerCerts(java.security.cert.X509Certificate,org.bouncycastle.x509.ExtendedPKIXBuilderParameters)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.jce.provider.CertPathValidatorUtilities.findTrustAnchor(java.security.cert.X509Certificate,java.util.Set)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.jce.provider.CertPathValidatorUtilities.findTrustAnchor(java.security.cert.X509Certificate,java.util.Set,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.jce.provider.CertPathValidatorUtilities.getCRLIssuersFromDistributionPoint(org.bouncycastle.asn1.x509.DistributionPoint,java.util.Collection,java.security.cert.X509CRLSelector,org.bouncycastle.x509.ExtendedPKIXParameters)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.jce.provider.CertPathValidatorUtilities.getCertStatus(java.util.Date,java.security.cert.X509CRL,java.lang.Object,org.bouncycastle.jce.provider.CertStatus)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.jce.provider.CertPathValidatorUtilities.getCompleteCRLs(org.bouncycastle.asn1.x509.DistributionPoint,java.lang.Object,java.util.Date,org.bouncycastle.x509.ExtendedPKIXParameters)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.jce.provider.CertPathValidatorUtilities.getDeltaCRLs(java.util.Date,org.bouncycastle.x509.ExtendedPKIXParameters,java.security.cert.X509CRL)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.jce.provider.CertPathValidatorUtilities.getValidCertDateFromValidityModel(org.bouncycastle.x509.ExtendedPKIXParameters,java.security.cert.CertPath,int)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.bouncycastle.x509.PKIXCertPathReviewer`

## org.bouncycastle.x509.X509Attribute

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

## org.bouncycastle.x509.extension.AuthorityKeyIdentifierStructure

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.bouncycastle.asn1.ASN1Object.toASN1Object()`

