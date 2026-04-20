# Breaking Changes: eu.europa.ec.joinup.sd-dss:dss-pades 5.9 → 5.10.2
Total: 108 (binary-breaking: 67, source-breaking: 101)

## eu.europa.esig.dss.pades.CertificationPermission

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `eu.europa.esig.dss.pades.CertificationPermission`

## eu.europa.esig.dss.pades.PAdESSignatureParameters

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pades.PAdESSignatureParameters.setPermission(eu.europa.esig.dss.pades.CertificationPermission)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pades.PAdESSignatureParameters.setSignatureFieldId(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `eu.europa.esig.dss.pades.PAdESSignatureParameters.getPermission()`
+ NEW RETURN TYPE: `eu.europa.esig.dss.pades.PAdESSignatureParameters.getPermission()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `eu.europa.esig.dss.pades.PAdESSignatureParameters.getPermission()`
+ NEW RETURN TYPE: `eu.europa.esig.dss.pades.PAdESSignatureParameters.getPermission()`

## eu.europa.esig.dss.pades.PAdESTimestampParameters

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pades.PAdESTimestampParameters.setFieldId(java.lang.String)`

## eu.europa.esig.dss.pades.SignatureImageParameters

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pades.SignatureImageParameters.setHeight(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pades.SignatureImageParameters.setPage(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pades.SignatureImageParameters.setWidth(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pades.SignatureImageParameters.setxAxis(float)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pades.SignatureImageParameters.setyAxis(float)`

## eu.europa.esig.dss.pades.validation.PAdESCRLSource

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `eu.europa.esig.dss.pades.validation.PAdESCRLSource.<init>(eu.europa.esig.dss.pdf.PdfDssDict,java.lang.String,org.bouncycastle.asn1.cms.AttributeTable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pades.validation.PAdESCRLSource.extractVRICRLs(eu.europa.esig.dss.pdf.PdfVRIDict)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pades.validation.PdfDssDictCRLSource.extractDSSCRLs(eu.europa.esig.dss.pdf.PdfDssDict)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pades.validation.PdfDssDictCRLSource.extractVRICRLs(eu.europa.esig.dss.pdf.PdfDssDict)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `eu.europa.esig.dss.pades.validation.PAdESCRLSource`

## eu.europa.esig.dss.pades.validation.PAdESCertificateSource

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `eu.europa.esig.dss.pades.validation.PAdESCertificateSource.<init>(eu.europa.esig.dss.pdf.PdfSignatureRevision,org.bouncycastle.cms.SignerInformation)`

## eu.europa.esig.dss.pades.validation.PAdESOCSPSource

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `eu.europa.esig.dss.pades.validation.PAdESOCSPSource.<init>(eu.europa.esig.dss.pdf.PdfDssDict,java.lang.String,org.bouncycastle.asn1.cms.AttributeTable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pades.validation.PAdESOCSPSource.extractVRIOCSPs(eu.europa.esig.dss.pdf.PdfVRIDict)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pades.validation.PdfDssDictOCSPSource.extractDSSOCSPs(eu.europa.esig.dss.pdf.PdfDssDict)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pades.validation.PdfDssDictOCSPSource.extractVRIOCSPs(eu.europa.esig.dss.pdf.PdfDssDict)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `eu.europa.esig.dss.pades.validation.PdfDssDictOCSPSource.getOcspMap()`
+ NEW RETURN TYPE: `eu.europa.esig.dss.pades.validation.PAdESOCSPSource.getOcspMap()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `eu.europa.esig.dss.pades.validation.PAdESOCSPSource`

## eu.europa.esig.dss.pades.validation.PAdESSignature

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `eu.europa.esig.dss.pades.validation.PAdESSignature.createBaselineRequirementsChecker()`
+ NEW RETURN TYPE: `eu.europa.esig.dss.pades.validation.PAdESSignature.createBaselineRequirementsChecker()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `eu.europa.esig.dss.pades.validation.PAdESSignature.createBaselineRequirementsChecker()`
+ NEW RETURN TYPE: `eu.europa.esig.dss.pades.validation.PAdESSignature.createBaselineRequirementsChecker()`

## eu.europa.esig.dss.pades.validation.PAdESSignatureIdentifierBuilder

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pades.validation.PAdESSignatureIdentifierBuilder.getSignatureFilePosition()`

## eu.europa.esig.dss.pades.validation.PdfDssDictCRLSource

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `eu.europa.esig.dss.pades.validation.PdfDssDictCRLSource`

## eu.europa.esig.dss.pades.validation.PdfDssDictCertificateSource

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `eu.europa.esig.dss.pades.validation.PdfDssDictCertificateSource`

## eu.europa.esig.dss.pades.validation.PdfDssDictOCSPSource

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `eu.europa.esig.dss.pades.validation.PdfDssDictOCSPSource`

## eu.europa.esig.dss.pades.validation.PdfModificationDetection

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `eu.europa.esig.dss.pades.validation.PdfModificationDetection`
+ MUST NOW IMPLEMENT: `eu.europa.esig.dss.pades.validation.PdfModificationDetection.getObjectModifications()`

## eu.europa.esig.dss.pades.validation.PdfRevision

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pades.validation.PdfRevision.getFieldNames()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `eu.europa.esig.dss.pades.validation.PdfRevision`
+ MUST NOW IMPLEMENT: `eu.europa.esig.dss.pades.validation.PdfRevision.getFields()`

## eu.europa.esig.dss.pades.validation.PdfSignatureDictionary

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `eu.europa.esig.dss.pades.validation.PdfSignatureDictionary`
+ MUST NOW IMPLEMENT: `eu.europa.esig.dss.pades.validation.PdfSignatureDictionary.getDocMDP()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `eu.europa.esig.dss.pades.validation.PdfSignatureDictionary`
+ MUST NOW IMPLEMENT: `eu.europa.esig.dss.pades.validation.PdfSignatureDictionary.getFieldMDP()`

## eu.europa.esig.dss.pades.validation.scope.PAdESSignatureScopeFinder

### METHOD_NOW_PROTECTED [binary ✗ | source ✗]
- METHOD (now protected, was public): `eu.europa.esig.dss.pades.validation.scope.PAdESSignatureScopeFinder.findSignatureScope(eu.europa.esig.dss.pdf.PdfCMSRevision)`

## eu.europa.esig.dss.pades.validation.scope.PdfByteRangeSignatureScope

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `eu.europa.esig.dss.pades.validation.scope.PdfByteRangeSignatureScope`

### CONSTRUCTOR_NOW_PROTECTED [binary ✗ | source ✗]
- CONSTRUCTOR (now protected, was public): `eu.europa.esig.dss.pades.validation.scope.PdfByteRangeSignatureScope.<init>(java.lang.String,eu.europa.esig.dss.pades.validation.ByteRange,eu.europa.esig.dss.model.Digest)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `eu.europa.esig.dss.pades.validation.scope.PdfByteRangeSignatureScope`

## eu.europa.esig.dss.pdf.AbstractPDFSignatureService

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pdf.AbstractPDFSignatureService.addDssDictionary(eu.europa.esig.dss.model.DSSDocument,eu.europa.esig.dss.validation.ValidationDataContainer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pdf.AbstractPDFSignatureService.buildKnownObjects(java.util.Collection<eu.europa.esig.dss.validation.AdvancedSignature>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pdf.AbstractPDFSignatureService.checkDocumentPermissions(eu.europa.esig.dss.model.DSSDocument,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pdf.AbstractPDFSignatureService.checkVisibleSignatureFieldBoxPosition(eu.europa.esig.dss.pdf.PdfDocumentReader,eu.europa.esig.dss.pades.SignatureFieldParameters)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pdf.AbstractPDFSignatureService.checkVisibleSignatureFieldBoxPosition(eu.europa.esig.dss.pdf.visible.SignatureDrawer,eu.europa.esig.dss.pdf.PdfDocumentReader,eu.europa.esig.dss.pades.SignatureFieldParameters)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pdf.AbstractPDFSignatureService.getTokenKey(eu.europa.esig.dss.model.x509.Token)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pdf.PDFSignatureService.addDssDictionary(eu.europa.esig.dss.model.DSSDocument,eu.europa.esig.dss.validation.ValidationDataContainer,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `eu.europa.esig.dss.pdf.AbstractPDFSignatureService`
+ MUST NOW IMPLEMENT: `eu.europa.esig.dss.pdf.PDFSignatureService.previewPageWithVisualSignature(eu.europa.esig.dss.model.DSSDocument,eu.europa.esig.dss.pades.PAdESCommonParameters)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `eu.europa.esig.dss.pdf.AbstractPDFSignatureService`
+ MUST NOW IMPLEMENT: `eu.europa.esig.dss.pdf.PDFSignatureService.addDssDictionary(eu.europa.esig.dss.model.DSSDocument,eu.europa.esig.dss.pades.validation.PdfValidationDataContainer,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `eu.europa.esig.dss.pdf.AbstractPDFSignatureService`
+ MUST NOW IMPLEMENT: `eu.europa.esig.dss.pdf.PDFSignatureService.previewSignatureField(eu.europa.esig.dss.model.DSSDocument,eu.europa.esig.dss.pades.PAdESCommonParameters)`

## eu.europa.esig.dss.pdf.AbstractPdfDssDict

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `eu.europa.esig.dss.pdf.AbstractPdfDssDict.getOCSPs()`
+ NEW RETURN TYPE: `eu.europa.esig.dss.pdf.AbstractPdfDssDict.getOCSPs()`

## eu.europa.esig.dss.pdf.DSSDictionaryCallback

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `eu.europa.esig.dss.pdf.DSSDictionaryCallback`

## eu.europa.esig.dss.pdf.DSSDictionaryExtractionUtils

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `eu.europa.esig.dss.pdf.DSSDictionaryExtractionUtils`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `eu.europa.esig.dss.pdf.DSSDictionaryExtractionUtils`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `eu.europa.esig.dss.pdf.DSSDictionaryExtractionUtils.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `eu.europa.esig.dss.pdf.DSSDictionaryExtractionUtils.getCRLsFromArray(eu.europa.esig.dss.pdf.PdfDict,java.lang.String,java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `eu.europa.esig.dss.pdf.DSSDictionaryExtractionUtils.getCertsFromArray(eu.europa.esig.dss.pdf.PdfDict,java.lang.String,java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `eu.europa.esig.dss.pdf.DSSDictionaryExtractionUtils.getOCSPsFromArray(eu.europa.esig.dss.pdf.PdfDict,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `eu.europa.esig.dss.pdf.DSSDictionaryExtractionUtils.getOCSPsFromArray(eu.europa.esig.dss.pdf.PdfDict,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `eu.europa.esig.dss.pdf.DSSDictionaryExtractionUtils.getOCSPsFromArray(eu.europa.esig.dss.pdf.PdfDict,java.lang.String,java.lang.String)`

## eu.europa.esig.dss.pdf.PDFSignatureService

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pdf.PDFSignatureService.addDssDictionary(eu.europa.esig.dss.model.DSSDocument,eu.europa.esig.dss.validation.ValidationDataContainer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pdf.PDFSignatureService.addDssDictionary(eu.europa.esig.dss.model.DSSDocument,eu.europa.esig.dss.validation.ValidationDataContainer,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `eu.europa.esig.dss.pdf.PDFSignatureService`
+ MUST NOW IMPLEMENT: `eu.europa.esig.dss.pdf.PDFSignatureService.previewPageWithVisualSignature(eu.europa.esig.dss.model.DSSDocument,eu.europa.esig.dss.pades.PAdESCommonParameters)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `eu.europa.esig.dss.pdf.PDFSignatureService`
+ MUST NOW IMPLEMENT: `eu.europa.esig.dss.pdf.PDFSignatureService.addDssDictionary(eu.europa.esig.dss.model.DSSDocument,eu.europa.esig.dss.pades.validation.PdfValidationDataContainer,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `eu.europa.esig.dss.pdf.PDFSignatureService`
+ MUST NOW IMPLEMENT: `eu.europa.esig.dss.pdf.PDFSignatureService.addDssDictionary(eu.europa.esig.dss.model.DSSDocument,eu.europa.esig.dss.pades.validation.PdfValidationDataContainer)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `eu.europa.esig.dss.pdf.PDFSignatureService`
+ MUST NOW IMPLEMENT: `eu.europa.esig.dss.pdf.PDFSignatureService.previewSignatureField(eu.europa.esig.dss.model.DSSDocument,eu.europa.esig.dss.pades.PAdESCommonParameters)`

## eu.europa.esig.dss.pdf.PdfAnnotation

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pdf.PdfAnnotation.isSigned()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pdf.PdfAnnotation.setSigned(boolean)`

## eu.europa.esig.dss.pdf.PdfArray

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pdf.PdfArray.getBytes(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pdf.PdfArray.getInt(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `eu.europa.esig.dss.pdf.PdfArray.getObjectNumber(int)`
+ NEW RETURN TYPE: `eu.europa.esig.dss.pdf.PdfArray.getObjectNumber(int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `eu.europa.esig.dss.pdf.PdfArray.getObjectNumber(int)`
+ NEW RETURN TYPE: `eu.europa.esig.dss.pdf.PdfArray.getObjectNumber(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `eu.europa.esig.dss.pdf.PdfArray`
+ MUST NOW IMPLEMENT: `eu.europa.esig.dss.pdf.PdfArray.getAsDict(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `eu.europa.esig.dss.pdf.PdfArray`
+ MUST NOW IMPLEMENT: `eu.europa.esig.dss.pdf.PdfArray.getObject(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `eu.europa.esig.dss.pdf.PdfArray`
+ MUST NOW IMPLEMENT: `eu.europa.esig.dss.pdf.PdfArray.getStreamBytes(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `eu.europa.esig.dss.pdf.PdfArray`
+ MUST NOW IMPLEMENT: `eu.europa.esig.dss.pdf.PdfArray.getString(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `eu.europa.esig.dss.pdf.PdfArray`
+ MUST NOW IMPLEMENT: `eu.europa.esig.dss.pdf.PdfArray.getNumber(int)`

## eu.europa.esig.dss.pdf.PdfCMSRevision

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `eu.europa.esig.dss.pdf.PdfCMSRevision.<init>(eu.europa.esig.dss.pades.validation.PdfSignatureDictionary,java.util.List<java.lang.String>,eu.europa.esig.dss.model.DSSDocument,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pdf.PdfCMSRevision.getFieldNames()`

## eu.europa.esig.dss.pdf.PdfDict

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `eu.europa.esig.dss.pdf.PdfDict`
+ MUST NOW IMPLEMENT: `eu.europa.esig.dss.pdf.PdfDict.getObjectNumber(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `eu.europa.esig.dss.pdf.PdfDict`
+ MUST NOW IMPLEMENT: `eu.europa.esig.dss.pdf.PdfDict.getStreamBytes()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `eu.europa.esig.dss.pdf.PdfDict`
+ MUST NOW IMPLEMENT: `eu.europa.esig.dss.pdf.PdfDict.getObject(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `eu.europa.esig.dss.pdf.PdfDict`
+ MUST NOW IMPLEMENT: `eu.europa.esig.dss.pdf.PdfDict.getNumberValue(java.lang.String)`

## eu.europa.esig.dss.pdf.PdfDocDssRevision

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `eu.europa.esig.dss.pdf.PdfDocDssRevision.<init>(eu.europa.esig.dss.pdf.PdfDssDict)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pdf.PdfDocDssRevision.getFieldNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `eu.europa.esig.dss.pdf.PdfDocDssRevision.getCRLSource()`
+ NEW RETURN TYPE: `eu.europa.esig.dss.pdf.PdfDocDssRevision.getCRLSource()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `eu.europa.esig.dss.pdf.PdfDocDssRevision.getCertificateSource()`
+ NEW RETURN TYPE: `eu.europa.esig.dss.pdf.PdfDocDssRevision.getCertificateSource()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `eu.europa.esig.dss.pdf.PdfDocDssRevision.getOCSPSource()`
+ NEW RETURN TYPE: `eu.europa.esig.dss.pdf.PdfDocDssRevision.getOCSPSource()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `eu.europa.esig.dss.pdf.PdfDocDssRevision.getCRLSource()`
+ NEW RETURN TYPE: `eu.europa.esig.dss.pdf.PdfDocDssRevision.getCRLSource()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `eu.europa.esig.dss.pdf.PdfDocDssRevision.getCertificateSource()`
+ NEW RETURN TYPE: `eu.europa.esig.dss.pdf.PdfDocDssRevision.getCertificateSource()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `eu.europa.esig.dss.pdf.PdfDocDssRevision.getOCSPSource()`
+ NEW RETURN TYPE: `eu.europa.esig.dss.pdf.PdfDocDssRevision.getOCSPSource()`

## eu.europa.esig.dss.pdf.PdfDocTimestampRevision

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `eu.europa.esig.dss.pdf.PdfDocTimestampRevision.<init>(eu.europa.esig.dss.pades.validation.PdfSignatureDictionary,java.util.List<java.lang.String>,eu.europa.esig.dss.model.DSSDocument,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pdf.PdfCMSRevision.getFieldNames()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `eu.europa.esig.dss.pdf.PdfDocTimestampRevision.getTimestampToken()`
+ NEW RETURN TYPE: `eu.europa.esig.dss.pdf.PdfDocTimestampRevision.getTimestampToken()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `eu.europa.esig.dss.pdf.PdfDocTimestampRevision.getTimestampToken()`
+ NEW RETURN TYPE: `eu.europa.esig.dss.pdf.PdfDocTimestampRevision.getTimestampToken()`

## eu.europa.esig.dss.pdf.PdfDocumentReader

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `eu.europa.esig.dss.pdf.PdfDocumentReader.extractSigDictionaries()`
+ NEW RETURN TYPE: `eu.europa.esig.dss.pdf.PdfDocumentReader.extractSigDictionaries()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `eu.europa.esig.dss.pdf.PdfDocumentReader`
+ MUST NOW IMPLEMENT: `eu.europa.esig.dss.pdf.PdfDocumentReader.isUsageRightsSignaturePresent()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `eu.europa.esig.dss.pdf.PdfDocumentReader`
+ MUST NOW IMPLEMENT: `eu.europa.esig.dss.pdf.PdfDocumentReader.checkDocumentPermissions()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `eu.europa.esig.dss.pdf.PdfDocumentReader`
+ MUST NOW IMPLEMENT: `eu.europa.esig.dss.pdf.PdfDocumentReader.getCertificationPermission()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `eu.europa.esig.dss.pdf.PdfDocumentReader`
+ MUST NOW IMPLEMENT: `eu.europa.esig.dss.pdf.PdfDocumentReader.getCatalogDictionary()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `eu.europa.esig.dss.pdf.PdfDocumentReader`
+ MUST NOW IMPLEMENT: `eu.europa.esig.dss.pdf.PdfDocumentReader.getPageRotation(int)`

## eu.europa.esig.dss.pdf.PdfDssDict

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `eu.europa.esig.dss.pdf.PdfDssDict.getOCSPs()`
+ NEW RETURN TYPE: `eu.europa.esig.dss.pdf.PdfDssDict.getOCSPs()`

## eu.europa.esig.dss.pdf.PdfModificationImpl

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `eu.europa.esig.dss.pdf.PdfModificationImpl`

## eu.europa.esig.dss.pdf.PdfSignatureRevision

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `eu.europa.esig.dss.pdf.PdfSignatureRevision.<init>(eu.europa.esig.dss.pades.validation.PdfSignatureDictionary,eu.europa.esig.dss.pdf.PdfDssDict,java.util.List<java.lang.String>,eu.europa.esig.dss.model.DSSDocument,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pdf.PdfCMSRevision.getFieldNames()`

## eu.europa.esig.dss.pdf.PdfVRIDict

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `eu.europa.esig.dss.pdf.AbstractPdfDssDict.getOCSPs()`
+ NEW RETURN TYPE: `eu.europa.esig.dss.pdf.AbstractPdfDssDict.getOCSPs()`

## eu.europa.esig.dss.pdf.SingleDssDict

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `eu.europa.esig.dss.pdf.AbstractPdfDssDict.getOCSPs()`
+ NEW RETURN TYPE: `eu.europa.esig.dss.pdf.AbstractPdfDssDict.getOCSPs()`

## eu.europa.esig.dss.pdf.visible.ImageUtils

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pdf.visible.ImageUtils.readImage(eu.europa.esig.dss.model.DSSDocument)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `eu.europa.esig.dss.pdf.visible.ImageUtils.readImageInputStream(java.io.InputStream)`

## eu.europa.esig.dss.pdf.visible.TextFitter

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `eu.europa.esig.dss.pdf.visible.TextFitter`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `eu.europa.esig.dss.pdf.visible.TextFitter.<init>()`

