# API Specification: eu.europa.ec.joinup.sd-dss:dss-pades 5.10.2

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public abstract class `eu.europa.esig.dss.pades.AbstractDSSFont`
implements `eu.europa.esig.dss.pades.DSSFont`, `java.io.Serializable`  

**Constructors:**
- `public AbstractDSSFont()`

**Fields:**
- `protected final static float DEFAULT_TEXT_SIZE`
- `protected float size`

**Methods:**
- `public float getSize()`
- `public void setSize(float p0)`

---

## public class `eu.europa.esig.dss.pades.DSSFileFont`
extends `eu.europa.esig.dss.pades.AbstractDSSFont`  

**Constructors:**
- `public DSSFileFont(eu.europa.esig.dss.model.DSSDocument p0)`
- `public DSSFileFont(eu.europa.esig.dss.model.DSSDocument p0, float p1)`
- `public DSSFileFont(java.io.InputStream p0)`

**Methods:**
- `public java.io.InputStream getInputStream()`
- `public java.awt.Font getJavaFont()`
- `public java.lang.String getName()`
- `public static eu.europa.esig.dss.pades.DSSFileFont initializeDefault()`

---

## public abstract interface `eu.europa.esig.dss.pades.DSSFont`

**Methods:**
- `public abstract java.awt.Font getJavaFont()`
- `public abstract float getSize()`
- `public abstract void setSize(float p0)`

---

## public class `eu.europa.esig.dss.pades.DSSJavaFont`
extends `eu.europa.esig.dss.pades.AbstractDSSFont`  

**Constructors:**
- `public DSSJavaFont(java.awt.Font p0)`
- `public DSSJavaFont(java.lang.String p0)`
- `public DSSJavaFont(java.lang.String p0, int p1)`
- `public DSSJavaFont(java.lang.String p0, int p1, int p2)`

**Methods:**
- `public java.awt.Font getJavaFont()`
- `public java.lang.String getName()`
- `public void setSize(float p0)`

---

## public abstract interface `eu.europa.esig.dss.pades.DSSNativeFont`<F extends java.lang.Object>

**Methods:**
- `public abstract F getFont()`

---

## public abstract interface `eu.europa.esig.dss.pades.PAdESCommonParameters`
implements `java.io.Serializable`  

**Methods:**
- `public abstract int getContentSize()`
- `public abstract eu.europa.esig.dss.enumerations.DigestAlgorithm getDigestAlgorithm()`
- `public abstract java.lang.String getFilter()`
- `public abstract eu.europa.esig.dss.pades.SignatureImageParameters getImageParameters()`
- `public abstract java.lang.String getPasswordProtection()`
- `public abstract java.util.Date getSigningDate()`
- `public abstract java.lang.String getSubFilter()`

---

## public class `eu.europa.esig.dss.pades.PAdESSignatureParameters`
extends `eu.europa.esig.dss.cades.CAdESSignatureParameters`  
implements `eu.europa.esig.dss.pades.PAdESCommonParameters`  

**Constructors:**
- `public PAdESSignatureParameters()`

**Methods:**
- `public eu.europa.esig.dss.pades.PAdESTimestampParameters getArchiveTimestampParameters()`
- `public java.lang.String getContactInfo()`
- `public int getContentSize()`
- `public eu.europa.esig.dss.pades.PAdESTimestampParameters getContentTimestampParameters()`
- `public java.lang.String getFilter()`
- `public eu.europa.esig.dss.pades.SignatureImageParameters getImageParameters()`
- `public java.lang.String getLocation()`
- `public java.lang.String getPasswordProtection()`
- `public eu.europa.esig.dss.enumerations.CertificationPermission getPermission()`
- `public java.lang.String getReason()`
- `public eu.europa.esig.dss.pades.PAdESTimestampParameters getSignatureTimestampParameters()`
- `public java.lang.String getSignerName()`
- `public java.util.Date getSigningDate()`
- `public java.util.TimeZone getSigningTimeZone()`
- `public java.lang.String getSubFilter()`
- `public void setArchiveTimestampParameters(eu.europa.esig.dss.cades.signature.CAdESTimestampParameters p0)`
- `public void setContactInfo(java.lang.String p0)`
- `public void setContentSize(int p0)`
- `public void setContentTimestampParameters(eu.europa.esig.dss.cades.signature.CAdESTimestampParameters p0)`
- `public void setFilter(java.lang.String p0)`
- `public void setImageParameters(eu.europa.esig.dss.pades.SignatureImageParameters p0)`
- `public void setLocation(java.lang.String p0)`
- `public void setPasswordProtection(java.lang.String p0)`
- `public void setPermission(eu.europa.esig.dss.enumerations.CertificationPermission p0)`
- `public void setReason(java.lang.String p0)`
- `public void setSignatureLevel(eu.europa.esig.dss.enumerations.SignatureLevel p0)`
- `public void setSignatureTimestampParameters(eu.europa.esig.dss.cades.signature.CAdESTimestampParameters p0)`
- `public void setSignerName(java.lang.String p0)`
- `public void setSigningTimeZone(java.util.TimeZone p0)`
- `public void setSubFilter(java.lang.String p0)`

---

## public class `eu.europa.esig.dss.pades.PAdESTimestampParameters`
extends `eu.europa.esig.dss.cades.signature.CAdESTimestampParameters`  
implements `eu.europa.esig.dss.pades.PAdESCommonParameters`  

**Constructors:**
- `public PAdESTimestampParameters()`
- `public PAdESTimestampParameters(eu.europa.esig.dss.enumerations.DigestAlgorithm p0)`

**Fields:**
- `protected java.util.Date timestampDate`

**Methods:**
- `public int getContentSize()`
- `public java.lang.String getFilter()`
- `public eu.europa.esig.dss.pades.SignatureImageParameters getImageParameters()`
- `public java.lang.String getPasswordProtection()`
- `public java.util.Date getSigningDate()`
- `public java.lang.String getSubFilter()`
- `public void setContentSize(int p0)`
- `public void setFilter(java.lang.String p0)`
- `public void setImageParameters(eu.europa.esig.dss.pades.SignatureImageParameters p0)`
- `public void setPasswordProtection(java.lang.String p0)`
- `public void setSubFilter(java.lang.String p0)`

---

## public final class `eu.europa.esig.dss.pades.PAdESUtils`

**Fields:**
- `public final static int DEFAULT_FIRST_PAGE`

**Methods:**
- `public static eu.europa.esig.dss.pdf.SigFieldPermissions extractPermissionsDictionary(eu.europa.esig.dss.pdf.PdfDict p0)`
- `public static eu.europa.esig.dss.model.InMemoryDocument getOriginalPDF(eu.europa.esig.dss.pades.validation.PAdESSignature p0)`
- `public static eu.europa.esig.dss.model.InMemoryDocument getOriginalPDF(eu.europa.esig.dss.pdf.PdfCMSRevision p0)`
- `public static byte[] getRevisionContent(eu.europa.esig.dss.model.DSSDocument p0, eu.europa.esig.dss.pades.validation.ByteRange p1) throws java.io.IOException`
- `public static eu.europa.esig.dss.pades.validation.RevocationInfoArchival getRevocationInfoArchival(org.bouncycastle.asn1.ASN1Encodable p0)`
- `public static byte[] getSignedContentFromRevision(byte[] p0, eu.europa.esig.dss.pades.validation.ByteRange p1) throws java.io.IOException`
- `public static java.util.List getVRIsWithName(eu.europa.esig.dss.pdf.PdfDssDict p0, java.lang.String p1)`
- `public static boolean isPDFDocument(eu.europa.esig.dss.model.DSSDocument p0)`
- `public static eu.europa.esig.dss.model.InMemoryDocument retrievePreviousPDFRevision(eu.europa.esig.dss.model.DSSDocument p0, eu.europa.esig.dss.pades.validation.ByteRange p1)`

---

## public class `eu.europa.esig.dss.pades.SignatureFieldParameters`
implements `java.io.Serializable`  

**Constructors:**
- `public SignatureFieldParameters()`

**Methods:**
- `public java.lang.String getFieldId()`
- `public float getHeight()`
- `public float getOriginX()`
- `public float getOriginY()`
- `public int getPage()`
- `public float getWidth()`
- `public void setFieldId(java.lang.String p0)`
- `public void setHeight(float p0)`
- `public void setOriginX(float p0)`
- `public void setOriginY(float p0)`
- `public void setPage(int p0)`
- `public void setWidth(float p0)`
- `public java.lang.String toString()`

---

## public class `eu.europa.esig.dss.pades.SignatureImageParameters`
implements `java.io.Serializable`  

**Constructors:**
- `public SignatureImageParameters()`

**Methods:**
- `public java.awt.Color getBackgroundColor()`
- `public java.lang.Integer getDpi()`
- `public eu.europa.esig.dss.pades.SignatureFieldParameters getFieldParameters()`
- `public eu.europa.esig.dss.model.DSSDocument getImage()`
- `public eu.europa.esig.dss.enumerations.ImageScaling getImageScaling()`
- `public eu.europa.esig.dss.enumerations.VisualSignatureRotation getRotation()`
- `public eu.europa.esig.dss.pades.SignatureImageTextParameters getTextParameters()`
- `public eu.europa.esig.dss.enumerations.VisualSignatureAlignmentHorizontal getVisualSignatureAlignmentHorizontal()`
- `public eu.europa.esig.dss.enumerations.VisualSignatureAlignmentVertical getVisualSignatureAlignmentVertical()`
- `public int getZoom()`
- `public boolean isEmpty()`
- `public void setAlignmentHorizontal(eu.europa.esig.dss.enumerations.VisualSignatureAlignmentHorizontal p0)`
- `public void setAlignmentVertical(eu.europa.esig.dss.enumerations.VisualSignatureAlignmentVertical p0)`
- `public void setBackgroundColor(java.awt.Color p0)`
- `public void setDpi(java.lang.Integer p0)`
- `public void setFieldParameters(eu.europa.esig.dss.pades.SignatureFieldParameters p0)`
- `public void setImage(eu.europa.esig.dss.model.DSSDocument p0)`
- `public void setImageScaling(eu.europa.esig.dss.enumerations.ImageScaling p0)`
- `public void setRotation(eu.europa.esig.dss.enumerations.VisualSignatureRotation p0)`
- `public void setTextParameters(eu.europa.esig.dss.pades.SignatureImageTextParameters p0)`
- `public void setZoom(int p0)`
- `public java.lang.String toString()`

---

## public class `eu.europa.esig.dss.pades.SignatureImageTextParameters`
implements `java.io.Serializable`  

**Constructors:**
- `public SignatureImageTextParameters()`

**Methods:**
- `public java.awt.Color getBackgroundColor()`
- `public eu.europa.esig.dss.pades.DSSFont getFont()`
- `public float getPadding()`
- `public eu.europa.esig.dss.enumerations.SignerTextHorizontalAlignment getSignerTextHorizontalAlignment()`
- `public eu.europa.esig.dss.enumerations.SignerTextPosition getSignerTextPosition()`
- `public eu.europa.esig.dss.enumerations.SignerTextVerticalAlignment getSignerTextVerticalAlignment()`
- `public java.lang.String getText()`
- `public java.awt.Color getTextColor()`
- `public eu.europa.esig.dss.enumerations.TextWrapping getTextWrapping()`
- `public boolean isEmpty()`
- `public void setBackgroundColor(java.awt.Color p0)`
- `public void setFont(eu.europa.esig.dss.pades.DSSFont p0)`
- `public void setPadding(float p0)`
- `public void setSignerTextHorizontalAlignment(eu.europa.esig.dss.enumerations.SignerTextHorizontalAlignment p0)`
- `public void setSignerTextPosition(eu.europa.esig.dss.enumerations.SignerTextPosition p0)`
- `public void setSignerTextVerticalAlignment(eu.europa.esig.dss.enumerations.SignerTextVerticalAlignment p0)`
- `public void setText(java.lang.String p0)`
- `public void setTextColor(java.awt.Color p0)`
- `public void setTextWrapping(eu.europa.esig.dss.enumerations.TextWrapping p0)`
- `public java.lang.String toString()`

---

## public class `eu.europa.esig.dss.pades.exception.InvalidPasswordException`
extends `eu.europa.esig.dss.model.DSSException`  

**Constructors:**
- `public InvalidPasswordException(java.lang.String p0)`

---

## public class `eu.europa.esig.dss.pades.exception.ProtectedDocumentException`
extends `eu.europa.esig.dss.model.DSSException`  

**Constructors:**
- `public ProtectedDocumentException(java.lang.String p0)`

---

## public class `eu.europa.esig.dss.pades.signature.PAdESExtensionService`

**Constructors:**
- `public PAdESExtensionService(eu.europa.esig.dss.validation.CertificateVerifier p0)`
- `public PAdESExtensionService(eu.europa.esig.dss.validation.CertificateVerifier p0, eu.europa.esig.dss.pdf.IPdfObjFactory p1)`

**Methods:**
- `public eu.europa.esig.dss.model.DSSDocument incorporateValidationData(eu.europa.esig.dss.model.DSSDocument p0)`
- `public eu.europa.esig.dss.model.DSSDocument incorporateValidationData(eu.europa.esig.dss.model.DSSDocument p0, java.lang.String p1)`

---

## public class `eu.europa.esig.dss.pades.signature.PAdESService`
extends `eu.europa.esig.dss.signature.AbstractSignatureService`  

**Constructors:**
- `public PAdESService(eu.europa.esig.dss.validation.CertificateVerifier p0)`

**Methods:**
- `public eu.europa.esig.dss.model.DSSDocument addNewSignatureField(eu.europa.esig.dss.model.DSSDocument p0, eu.europa.esig.dss.pades.SignatureFieldParameters p1)`
- `public eu.europa.esig.dss.model.DSSDocument addNewSignatureField(eu.europa.esig.dss.model.DSSDocument p0, eu.europa.esig.dss.pades.SignatureFieldParameters p1, java.lang.String p2)`
- `protected byte[] computeDocumentDigest(eu.europa.esig.dss.model.DSSDocument p0, eu.europa.esig.dss.pades.PAdESSignatureParameters p1)`
- `public eu.europa.esig.dss.model.DSSDocument extendDocument(eu.europa.esig.dss.model.DSSDocument p0, eu.europa.esig.dss.pades.PAdESSignatureParameters p1) throws eu.europa.esig.dss.model.DSSException`
- `protected byte[] generateCMSSignedData(eu.europa.esig.dss.model.DSSDocument p0, eu.europa.esig.dss.pades.PAdESSignatureParameters p1, eu.europa.esig.dss.model.SignatureValue p2)`
- `public java.util.List getAvailableSignatureFields(eu.europa.esig.dss.model.DSSDocument p0)`
- `public java.util.List getAvailableSignatureFields(eu.europa.esig.dss.model.DSSDocument p0, java.lang.String p1)`
- `public eu.europa.esig.dss.validation.timestamp.TimestampToken getContentTimestamp(eu.europa.esig.dss.model.DSSDocument p0, eu.europa.esig.dss.pades.PAdESSignatureParameters p1)`
- `public eu.europa.esig.dss.model.ToBeSigned getDataToSign(eu.europa.esig.dss.model.DSSDocument p0, eu.europa.esig.dss.pades.PAdESSignatureParameters p1) throws eu.europa.esig.dss.model.DSSException`
- `public eu.europa.esig.dss.model.DSSDocument previewPageWithVisualSignature(eu.europa.esig.dss.model.DSSDocument p0, eu.europa.esig.dss.pades.PAdESSignatureParameters p1)`
- `public eu.europa.esig.dss.model.DSSDocument previewSignatureField(eu.europa.esig.dss.model.DSSDocument p0, eu.europa.esig.dss.pades.PAdESSignatureParameters p1)`
- `public void setPdfObjFactory(eu.europa.esig.dss.pdf.IPdfObjFactory p0)`
- `public eu.europa.esig.dss.model.DSSDocument signDocument(eu.europa.esig.dss.model.DSSDocument p0, eu.europa.esig.dss.pades.PAdESSignatureParameters p1, eu.europa.esig.dss.model.SignatureValue p2) throws eu.europa.esig.dss.model.DSSException`
- `public eu.europa.esig.dss.model.DSSDocument timestamp(eu.europa.esig.dss.model.DSSDocument p0, eu.europa.esig.dss.pades.PAdESTimestampParameters p1)`

---

## public class `eu.europa.esig.dss.pades.timestamp.PAdESTimestampService`

**Constructors:**
- `public PAdESTimestampService(eu.europa.esig.dss.spi.x509.tsp.TSPSource p0)`
- `public PAdESTimestampService(eu.europa.esig.dss.spi.x509.tsp.TSPSource p0, eu.europa.esig.dss.pdf.PDFSignatureService p1)`

**Methods:**
- `public eu.europa.esig.dss.model.DSSDocument timestampDocument(eu.europa.esig.dss.model.DSSDocument p0, eu.europa.esig.dss.pades.PAdESTimestampParameters p1)`

---

## public class `eu.europa.esig.dss.pades.validation.ByteRange`

**Constructors:**
- `public ByteRange(int[] p0)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int getFirstPartEnd()`
- `public int getFirstPartStart()`
- `public int getLength()`
- `public int getSecondPartEnd()`
- `public int getSecondPartStart()`
- `public int hashCode()`
- `public java.util.List toBigIntegerList()`
- `public java.lang.String toString()`
- `public void validate()`

---

## public class `eu.europa.esig.dss.pades.validation.PAdESBaselineRequirementsChecker`
extends `eu.europa.esig.dss.cades.validation.CAdESBaselineRequirementsChecker`  

**Constructors:**
- `public PAdESBaselineRequirementsChecker(eu.europa.esig.dss.pades.validation.PAdESSignature p0, eu.europa.esig.dss.validation.CertificateVerifier p1)`

**Methods:**
- `protected eu.europa.esig.dss.enumerations.SignatureForm getBaselineSignatureForm()`
- `public boolean hasBaselineBProfile()`
- `public boolean hasBaselineLTAProfile()`
- `public boolean hasBaselineLTProfile()`
- `public boolean hasBaselineTProfile()`
- `public boolean hasPKCS7LTAProfile()`
- `public boolean hasPKCS7LTProfile()`
- `public boolean hasPKCS7Profile()`
- `public boolean hasPKCS7TProfile()`

---

## public class `eu.europa.esig.dss.pades.validation.PAdESCRLSource`
extends `eu.europa.esig.dss.spi.x509.revocation.crl.OfflineCRLSource`  

**Constructors:**
- `public PAdESCRLSource(eu.europa.esig.dss.pdf.PdfSignatureRevision p0, java.lang.String p1, org.bouncycastle.asn1.cms.AttributeTable p2)`

**Methods:**
- `public java.util.List getADBERevocationValuesBinaries()`
- `public java.util.List getADBERevocationValuesTokens()`
- `public java.util.Map getAllRevocationBinariesWithOrigins()`
- `public java.util.Map getAllRevocationTokensWithOrigins()`
- `public java.util.Map getCrlMap()`
- `public java.util.List getDSSDictionaryBinaries()`
- `public java.util.List getDSSDictionaryTokens()`
- `public java.util.List getRevocationTokens(eu.europa.esig.dss.model.x509.CertificateToken p0, eu.europa.esig.dss.model.x509.CertificateToken p1)`
- `public java.util.List getVRIDictionaryBinaries()`
- `public java.util.List getVRIDictionaryTokens()`

---

## public class `eu.europa.esig.dss.pades.validation.PAdESCertificateSource`
extends `eu.europa.esig.dss.cades.validation.CAdESCertificateSource`  

**Constructors:**
- `public PAdESCertificateSource(eu.europa.esig.dss.pdf.PdfSignatureRevision p0, java.lang.String p1, org.bouncycastle.cms.SignerInformation p2)`

**Methods:**
- `public java.util.List getAttributeCertificateRefs()`
- `public java.util.Map getCertificateMap()`
- `public java.util.List getCertificateValues()`
- `public java.util.List getCompleteCertificateRefs()`
- `public java.util.List getDSSDictionaryCertValues()`
- `public java.util.List getVRIDictionaryCertValues()`

---

## public class `eu.europa.esig.dss.pades.validation.PAdESDiagnosticDataBuilder`
extends `eu.europa.esig.dss.cades.validation.CAdESDiagnosticDataBuilder`  

**Constructors:**
- `public PAdESDiagnosticDataBuilder()`

**Methods:**
- `public eu.europa.esig.dss.diagnostic.jaxb.XmlSignature buildDetachedXmlSignature(eu.europa.esig.dss.validation.AdvancedSignature p0)`
- `protected eu.europa.esig.dss.diagnostic.jaxb.XmlTimestamp buildDetachedXmlTimestamp(eu.europa.esig.dss.validation.timestamp.TimestampToken p0)`
- `protected eu.europa.esig.dss.diagnostic.jaxb.XmlOrphanTokens buildXmlOrphanTokens()`

---

## public class `eu.europa.esig.dss.pades.validation.PAdESOCSPSource`
extends `eu.europa.esig.dss.spi.x509.revocation.ocsp.OfflineOCSPSource`  

**Constructors:**
- `public PAdESOCSPSource(eu.europa.esig.dss.pdf.PdfSignatureRevision p0, java.lang.String p1, org.bouncycastle.asn1.cms.AttributeTable p2)`

**Methods:**
- `public java.util.List getADBERevocationValuesBinaries()`
- `public java.util.List getADBERevocationValuesTokens()`
- `public java.util.Map getAllRevocationBinariesWithOrigins()`
- `public java.util.Map getAllRevocationTokensWithOrigins()`
- `public java.util.List getDSSDictionaryBinaries()`
- `public java.util.List getDSSDictionaryTokens()`
- `public java.util.Map getOcspMap()`
- `public java.util.List getRevocationTokens(eu.europa.esig.dss.model.x509.CertificateToken p0, eu.europa.esig.dss.model.x509.CertificateToken p1)`
- `public java.util.List getVRIDictionaryBinaries()`
- `public java.util.List getVRIDictionaryTokens()`

---

## public class `eu.europa.esig.dss.pades.validation.PAdESSignature`
extends `eu.europa.esig.dss.cades.validation.CAdESSignature`  

**Constructors:**
- `protected PAdESSignature(eu.europa.esig.dss.pdf.PdfSignatureRevision p0, java.util.List p1)`

**Methods:**
- `public void addExternalTimestamp(eu.europa.esig.dss.validation.timestamp.TimestampToken p0)`
- `protected eu.europa.esig.dss.pades.validation.PAdESBaselineRequirementsChecker createBaselineRequirementsChecker()`
- `protected eu.europa.esig.dss.pades.validation.PAdESBaselineRequirementsChecker getBaselineRequirementsChecker()`
- `public eu.europa.esig.dss.spi.x509.revocation.crl.OfflineCRLSource getCRLSource()`
- `public eu.europa.esig.dss.validation.SignatureCertificateSource getCertificateSource()`
- `public eu.europa.esig.dss.validation.ListRevocationSource getCompleteCRLSource()`
- `public eu.europa.esig.dss.spi.x509.ListCertificateSource getCompleteCertificateSource()`
- `public eu.europa.esig.dss.validation.ListRevocationSource getCompleteOCSPSource()`
- `public java.lang.String getContentHints()`
- `public java.lang.String getContentIdentifier()`
- `public java.util.List getCounterSignatures()`
- `public eu.europa.esig.dss.enumerations.SignatureLevel getDataFoundUpToLevel()`
- `public eu.europa.esig.dss.pdf.PdfDssDict getDssDictionary()`
- `public eu.europa.esig.dss.spi.x509.revocation.ocsp.OfflineOCSPSource getOCSPSource()`
- `public eu.europa.esig.dss.model.DSSDocument getOriginalDocument()`
- `public eu.europa.esig.dss.pdf.PdfSignatureRevision getPdfRevision()`
- `public eu.europa.esig.dss.pades.validation.PdfSignatureDictionary getPdfSignatureDictionary()`
- `public eu.europa.esig.dss.validation.SignatureDigestReference getSignatureDigestReference(eu.europa.esig.dss.enumerations.DigestAlgorithm p0)`
- `public eu.europa.esig.dss.enumerations.SignatureForm getSignatureForm()`
- `protected eu.europa.esig.dss.validation.SignatureIdentifierBuilder getSignatureIdentifierBuilder()`
- `protected eu.europa.esig.dss.model.DSSDocument getSignerDocumentContent()`
- `public java.util.Date getSigningTime()`
- `public eu.europa.esig.dss.pades.validation.timestamp.PAdESTimestampSource getTimestampSource()`
- `public java.lang.String getVRIKey()`
- `public boolean hasAProfile()`
- `public boolean hasPKCS7LTAProfile()`
- `public boolean hasPKCS7LTProfile()`
- `public boolean hasPKCS7Profile()`
- `public boolean hasPKCS7TProfile()`
- `public void setDssCRLSource(eu.europa.esig.dss.validation.ListRevocationSource p0)`
- `public void setDssCertificateSource(eu.europa.esig.dss.spi.x509.ListCertificateSource p0)`
- `public void setDssOCSPSource(eu.europa.esig.dss.validation.ListRevocationSource p0)`

---

## public class `eu.europa.esig.dss.pades.validation.PAdESSignatureIdentifierBuilder`
extends `eu.europa.esig.dss.validation.AbstractSignatureIdentifierBuilder`  

**Constructors:**
- `public PAdESSignatureIdentifierBuilder(eu.europa.esig.dss.pades.validation.PAdESSignature p0)`

**Methods:**
- `protected java.lang.Object getCounterSignaturePosition(eu.europa.esig.dss.validation.AdvancedSignature p0)`
- `protected java.lang.String getSignaturePosition()`

---

## public class `eu.europa.esig.dss.pades.validation.PDFDocumentValidator`
extends `eu.europa.esig.dss.validation.SignedDocumentValidator`  

**Constructors:**
- `public PDFDocumentValidator(eu.europa.esig.dss.model.DSSDocument p0)`

**Methods:**
- `public <T extends eu.europa.esig.dss.validation.AdvancedSignature> void findSignatureScopes(java.util.Collection p0)`
- `protected java.util.List getAllSignatures()`
- `public java.util.List getDetachedTimestamps()`
- `public java.util.List getDssDictionaries()`
- `protected java.util.List getDssRevisions()`
- `public java.util.List getOriginalDocuments(eu.europa.esig.dss.validation.AdvancedSignature p0)`
- `protected eu.europa.esig.dss.pades.validation.scope.PAdESTimestampScopeFinder getPAdESTimestampScopeFinder()`
- `protected java.util.List getRevisions()`
- `public java.util.List getSignatures()`
- `public <T extends eu.europa.esig.dss.validation.AdvancedSignature> eu.europa.esig.dss.pades.validation.PdfValidationDataContainer getValidationData(java.util.Collection p0, java.util.Collection p1)`
- `protected eu.europa.esig.dss.pades.validation.PAdESDiagnosticDataBuilder initializeDiagnosticDataBuilder()`
- `protected eu.europa.esig.dss.pades.validation.PdfValidationDataContainer instantiateValidationDataContainer()`
- `public boolean isSupported(eu.europa.esig.dss.model.DSSDocument p0)`
- `protected void postProcessing(java.util.List p0)`
- `protected void prepareDssDictionaryValidationContext(eu.europa.esig.dss.validation.ValidationContext p0, java.util.List p1)`
- `protected <T extends eu.europa.esig.dss.validation.AdvancedSignature> eu.europa.esig.dss.validation.ValidationContext prepareValidationContext(java.util.Collection p0, java.util.Collection p1)`
- `public void setPasswordProtection(java.lang.String p0)`
- `public void setPdfObjFactory(eu.europa.esig.dss.pdf.IPdfObjFactory p0)`

---

## public class `eu.europa.esig.dss.pades.validation.PDFDocumentValidatorFactory`
implements `eu.europa.esig.dss.validation.DocumentValidatorFactory`  

**Constructors:**
- `public PDFDocumentValidatorFactory()`

**Methods:**
- `public eu.europa.esig.dss.validation.SignedDocumentValidator create(eu.europa.esig.dss.model.DSSDocument p0)`
- `public boolean isSupported(eu.europa.esig.dss.model.DSSDocument p0)`

---

## public class `eu.europa.esig.dss.pades.validation.PdfCmsCRLSource`
extends `eu.europa.esig.dss.spi.x509.revocation.crl.OfflineCRLSource`  

**Constructors:**
- `public PdfCmsCRLSource(org.bouncycastle.asn1.cms.AttributeTable p0)`

---

## public class `eu.europa.esig.dss.pades.validation.PdfCmsOCSPSource`
extends `eu.europa.esig.dss.spi.x509.revocation.ocsp.OfflineOCSPSource`  

**Constructors:**
- `public PdfCmsOCSPSource(org.bouncycastle.asn1.cms.AttributeTable p0)`

---

## public abstract interface `eu.europa.esig.dss.pades.validation.PdfModification`

**Methods:**
- `public abstract int getPage()`

---

## public abstract interface `eu.europa.esig.dss.pades.validation.PdfModificationDetection`

**Methods:**
- `public abstract boolean areModificationsDetected()`
- `public abstract java.util.List getAnnotationOverlaps()`
- `public abstract eu.europa.esig.dss.pdf.PdfObjectModifications getObjectModifications()`
- `public abstract java.util.List getPageDifferences()`
- `public abstract java.util.List getVisualDifferences()`

---

## public abstract interface `eu.europa.esig.dss.pades.validation.PdfRevision`
implements `java.io.Serializable`  

**Methods:**
- `public abstract java.util.List getFields()`
- `public abstract eu.europa.esig.dss.pades.validation.PdfModificationDetection getModificationDetection()`
- `public abstract eu.europa.esig.dss.pades.validation.PdfSignatureDictionary getPdfSigDictInfo()`

---

## public abstract interface `eu.europa.esig.dss.pades.validation.PdfSignatureDictionary`

**Methods:**
- `public abstract eu.europa.esig.dss.pades.validation.ByteRange getByteRange()`
- `public abstract org.bouncycastle.cms.CMSSignedData getCMSSignedData()`
- `public abstract java.lang.String getContactInfo()`
- `public abstract byte[] getContents()`
- `public abstract eu.europa.esig.dss.enumerations.CertificationPermission getDocMDP()`
- `public abstract eu.europa.esig.dss.pdf.SigFieldPermissions getFieldMDP()`
- `public abstract java.lang.String getFilter()`
- `public abstract java.lang.String getLocation()`
- `public abstract java.lang.String getReason()`
- `public abstract java.lang.String getSignerName()`
- `public abstract java.util.Date getSigningDate()`
- `public abstract java.lang.String getSubFilter()`
- `public abstract java.lang.String getType()`

---

## public class `eu.europa.esig.dss.pades.validation.PdfSignatureField`

**Constructors:**
- `public PdfSignatureField(eu.europa.esig.dss.pdf.PdfDict p0)`

**Methods:**
- `public java.lang.String getFieldName()`
- `public eu.europa.esig.dss.pdf.SigFieldPermissions getLockDictionary()`
- `public java.lang.String toString()`

---

## public class `eu.europa.esig.dss.pades.validation.PdfValidationDataContainer`
extends `eu.europa.esig.dss.validation.ValidationDataContainer`  

**Constructors:**
- `public PdfValidationDataContainer(java.util.Collection p0)`

**Methods:**
- `public java.util.Map getKnownObjectsMap()`
- `public java.lang.String getTokenKey(eu.europa.esig.dss.model.x509.Token p0)`
- `public java.lang.Long getTokenReference(eu.europa.esig.dss.model.x509.Token p0)`

---

## public class `eu.europa.esig.dss.pades.validation.RevocationInfoArchival`
extends `org.bouncycastle.asn1.ASN1Object`  

**Constructors:**
- `public RevocationInfoArchival(org.bouncycastle.asn1.x509.CertificateList[] p0, org.bouncycastle.asn1.ocsp.OCSPResponse[] p1, org.bouncycastle.asn1.esf.OtherRevVals p2)`

**Methods:**
- `public org.bouncycastle.asn1.x509.CertificateList[] getCrlVals()`
- `public static eu.europa.esig.dss.pades.validation.RevocationInfoArchival getInstance(java.lang.Object p0)`
- `public org.bouncycastle.asn1.ocsp.OCSPResponse[] getOcspVals()`
- `public org.bouncycastle.asn1.esf.OtherRevVals getOtherRevVals()`
- `public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive()`

---

## public class `eu.europa.esig.dss.pades.validation.dss.PdfCompositeDssDictCRLSource`
extends `eu.europa.esig.dss.spi.x509.revocation.crl.OfflineCRLSource`  

**Constructors:**
- `public PdfCompositeDssDictCRLSource()`

**Methods:**
- `public void addRevocation(eu.europa.esig.dss.spi.x509.revocation.RevocationToken p0, eu.europa.esig.dss.model.identifier.EncapsulatedRevocationTokenIdentifier p1)`
- `protected void extractDSSCRLs(eu.europa.esig.dss.pdf.PdfDssDict p0)`
- `protected void extractVRICRLs(eu.europa.esig.dss.pdf.PdfDssDict p0)`
- `protected void extractVRICRLs(eu.europa.esig.dss.pdf.PdfVRIDict p0)`
- `protected java.util.Set getCRLBinariesByObjectId(java.lang.Long p0)`
- `protected java.util.Set getRevocationTokenIds(eu.europa.esig.dss.spi.x509.revocation.RevocationToken p0)`
- `protected java.util.Set getTokenBinaryObjectIds(eu.europa.esig.dss.model.identifier.EncapsulatedRevocationTokenIdentifier p0)`
- `public void populateFromDssDictionary(eu.europa.esig.dss.pdf.PdfDssDict p0)`

---

## public class `eu.europa.esig.dss.pades.validation.dss.PdfCompositeDssDictCertificateSource`
extends `eu.europa.esig.dss.spi.x509.TokenCertificateSource`  

**Constructors:**
- `public PdfCompositeDssDictCertificateSource()`

**Methods:**
- `protected java.util.Set getCertificateTokensByObjectId(java.lang.Long p0)`
- `public void populateFromDssDictionary(eu.europa.esig.dss.pdf.PdfDssDict p0)`

---

## public class `eu.europa.esig.dss.pades.validation.dss.PdfCompositeDssDictOCSPSource`
extends `eu.europa.esig.dss.spi.x509.revocation.ocsp.OfflineOCSPSource`  

**Constructors:**
- `public PdfCompositeDssDictOCSPSource()`

**Methods:**
- `public void addRevocation(eu.europa.esig.dss.spi.x509.revocation.RevocationToken p0, eu.europa.esig.dss.model.identifier.EncapsulatedRevocationTokenIdentifier p1)`
- `protected void extractDSSOCSPs(eu.europa.esig.dss.pdf.PdfDssDict p0)`
- `protected void extractVRIOCSPs(eu.europa.esig.dss.pdf.PdfDssDict p0)`
- `protected void extractVRIOCSPs(eu.europa.esig.dss.pdf.PdfVRIDict p0)`
- `protected java.util.Set getOCSPBinariesByObjectId(java.lang.Long p0)`
- `protected java.util.Set getRevocationTokenIds(eu.europa.esig.dss.spi.x509.revocation.RevocationToken p0)`
- `protected java.util.Set getTokenBinaryObjectIds(eu.europa.esig.dss.model.identifier.EncapsulatedRevocationTokenIdentifier p0)`
- `public void populateFromDssDictionary(eu.europa.esig.dss.pdf.PdfDssDict p0)`

---

## public class `eu.europa.esig.dss.pades.validation.dss.PdfCompositeDssDictionary`
implements `java.io.Serializable`  

**Constructors:**
- `public PdfCompositeDssDictionary()`

**Methods:**
- `public eu.europa.esig.dss.pades.validation.dss.PdfCompositeDssDictCertificateSource getCertificateSource()`
- `public eu.europa.esig.dss.pades.validation.dss.PdfCompositeDssDictCRLSource getCrlSource()`
- `public eu.europa.esig.dss.pades.validation.dss.PdfCompositeDssDictOCSPSource getOcspSource()`
- `public void populateFromDssDictionary(eu.europa.esig.dss.pdf.PdfDssDict p0)`

---

## public class `eu.europa.esig.dss.pades.validation.dss.PdfDssDictCRLSource`
extends `eu.europa.esig.dss.spi.x509.revocation.crl.OfflineCRLSource`  

**Constructors:**
- `public PdfDssDictCRLSource(eu.europa.esig.dss.pades.validation.dss.PdfCompositeDssDictCRLSource p0, eu.europa.esig.dss.pdf.PdfDssDict p1)`
- `public PdfDssDictCRLSource(eu.europa.esig.dss.pades.validation.dss.PdfCompositeDssDictCRLSource p0, eu.europa.esig.dss.pdf.PdfDssDict p1, java.lang.String p2)`

**Methods:**
- `public java.util.Map getAllRevocationBinariesWithOrigins()`
- `public java.util.Map getAllRevocationTokensWithOrigins()`
- `public java.util.Map getCrlMap()`
- `public java.util.List getDSSDictionaryBinaries()`
- `public java.util.List getDSSDictionaryTokens()`
- `public java.util.List getRevocationTokens(eu.europa.esig.dss.model.x509.CertificateToken p0, eu.europa.esig.dss.model.x509.CertificateToken p1)`
- `public java.util.List getVRIDictionaryBinaries()`
- `public java.util.List getVRIDictionaryTokens()`

---

## public class `eu.europa.esig.dss.pades.validation.dss.PdfDssDictCertificateSource`
extends `eu.europa.esig.dss.spi.x509.TokenCertificateSource`  

**Constructors:**
- `public PdfDssDictCertificateSource(eu.europa.esig.dss.pades.validation.dss.PdfCompositeDssDictCertificateSource p0, eu.europa.esig.dss.pdf.PdfDssDict p1)`
- `public PdfDssDictCertificateSource(eu.europa.esig.dss.pades.validation.dss.PdfCompositeDssDictCertificateSource p0, eu.europa.esig.dss.pdf.PdfDssDict p1, java.lang.String p2)`

**Methods:**
- `public java.util.Map getCertificateMap()`
- `public java.util.List getDSSDictionaryCertValues()`
- `public java.util.List getVRIDictionaryCertValues()`

---

## public class `eu.europa.esig.dss.pades.validation.dss.PdfDssDictOCSPSource`
extends `eu.europa.esig.dss.spi.x509.revocation.ocsp.OfflineOCSPSource`  

**Constructors:**
- `public PdfDssDictOCSPSource(eu.europa.esig.dss.pades.validation.dss.PdfCompositeDssDictOCSPSource p0, eu.europa.esig.dss.pdf.PdfDssDict p1)`
- `public PdfDssDictOCSPSource(eu.europa.esig.dss.pades.validation.dss.PdfCompositeDssDictOCSPSource p0, eu.europa.esig.dss.pdf.PdfDssDict p1, java.lang.String p2)`

**Methods:**
- `public java.util.Map getAllRevocationBinariesWithOrigins()`
- `public java.util.Map getAllRevocationTokensWithOrigins()`
- `public java.util.List getDSSDictionaryBinaries()`
- `public java.util.List getDSSDictionaryTokens()`
- `public java.util.Map getOcspMap()`
- `public java.util.List getRevocationTokens(eu.europa.esig.dss.model.x509.CertificateToken p0, eu.europa.esig.dss.model.x509.CertificateToken p1)`
- `public java.util.List getVRIDictionaryBinaries()`
- `public java.util.List getVRIDictionaryTokens()`

---

## public class `eu.europa.esig.dss.pades.validation.scope.FullPdfByteRangeSignatureScope`
extends `eu.europa.esig.dss.pades.validation.scope.PdfByteRangeSignatureScope`  

**Constructors:**
- `public FullPdfByteRangeSignatureScope(eu.europa.esig.dss.pades.validation.ByteRange p0, eu.europa.esig.dss.model.Digest p1)`

**Methods:**
- `public eu.europa.esig.dss.enumerations.SignatureScopeType getType()`

---

## public class `eu.europa.esig.dss.pades.validation.scope.PAdESSignatureScopeFinder`
extends `eu.europa.esig.dss.pades.validation.scope.PdfRevisionScopeFinder`  
implements `eu.europa.esig.dss.validation.scope.SignatureScopeFinder<eu.europa.esig.dss.pades.validation.PAdESSignature>`  

**Constructors:**
- `public PAdESSignatureScopeFinder()`

**Methods:**
- `public java.util.List findSignatureScope(eu.europa.esig.dss.pades.validation.PAdESSignature p0)`

---

## public class `eu.europa.esig.dss.pades.validation.scope.PAdESTimestampScopeFinder`
extends `eu.europa.esig.dss.pades.validation.scope.PdfRevisionScopeFinder`  
implements `eu.europa.esig.dss.validation.scope.TimestampScopeFinder`  

**Constructors:**
- `public PAdESTimestampScopeFinder()`

**Methods:**
- `public java.util.List findTimestampScope(eu.europa.esig.dss.validation.timestamp.TimestampToken p0)`

---

## public class `eu.europa.esig.dss.pades.validation.scope.PartialPdfByteRangeSignatureScope`
extends `eu.europa.esig.dss.pades.validation.scope.PdfByteRangeSignatureScope`  

**Constructors:**
- `public PartialPdfByteRangeSignatureScope(eu.europa.esig.dss.pades.validation.ByteRange p0, eu.europa.esig.dss.model.Digest p1)`

**Methods:**
- `public eu.europa.esig.dss.enumerations.SignatureScopeType getType()`

---

## public abstract class `eu.europa.esig.dss.pades.validation.scope.PdfByteRangeSignatureScope`
extends `eu.europa.esig.dss.validation.scope.SignatureScope`  

**Constructors:**
- `protected PdfByteRangeSignatureScope(java.lang.String p0, eu.europa.esig.dss.pades.validation.ByteRange p1, eu.europa.esig.dss.model.Digest p2)`

**Methods:**
- `public java.lang.String getDescription()`

---

## public abstract class `eu.europa.esig.dss.pades.validation.scope.PdfRevisionScopeFinder`
extends `eu.europa.esig.dss.validation.scope.AbstractSignatureScopeFinder`  

**Constructors:**
- `public PdfRevisionScopeFinder()`

**Methods:**
- `protected eu.europa.esig.dss.validation.scope.SignatureScope findSignatureScope(eu.europa.esig.dss.pdf.PdfCMSRevision p0)`

---

## public class `eu.europa.esig.dss.pades.validation.timestamp.PAdESTimestampDataBuilder`
extends `eu.europa.esig.dss.cades.validation.timestamp.CAdESTimestampDataBuilder`  

**Constructors:**
- `public PAdESTimestampDataBuilder(java.util.List p0, eu.europa.esig.dss.pades.validation.PAdESSignature p1, eu.europa.esig.dss.spi.x509.ListCertificateSource p2)`

**Methods:**
- `public eu.europa.esig.dss.model.DSSDocument getArchiveTimestampData(eu.europa.esig.dss.validation.timestamp.TimestampToken p0)`
- `public eu.europa.esig.dss.model.DSSDocument getSignatureTimestampData(eu.europa.esig.dss.validation.timestamp.TimestampToken p0)`
- `public eu.europa.esig.dss.model.DSSDocument getTimestampX1Data(eu.europa.esig.dss.validation.timestamp.TimestampToken p0)`
- `public eu.europa.esig.dss.model.DSSDocument getTimestampX2Data(eu.europa.esig.dss.validation.timestamp.TimestampToken p0)`
- `public void setSignatureTimestamps(java.util.List p0)`

---

## public class `eu.europa.esig.dss.pades.validation.timestamp.PAdESTimestampSource`
extends `eu.europa.esig.dss.cades.validation.timestamp.CAdESTimestampSource`  

**Constructors:**
- `public PAdESTimestampSource(eu.europa.esig.dss.pades.validation.PAdESSignature p0, java.util.List p1)`

**Fields:**
- `protected java.util.List documentTimestamps`

**Methods:**
- `protected java.util.List getAdbeRevocationInfoArchivalReferences()`
- `protected java.util.List getCounterSignatures(eu.europa.esig.dss.cades.validation.CAdESAttribute p0)`
- `public java.util.List getDocumentTimestamps()`
- `protected java.util.List getSignatureTimestampReferences()`
- `protected eu.europa.esig.dss.pades.validation.timestamp.PAdESTimestampDataBuilder getTimestampDataBuilder()`
- `protected boolean isAdbeRevocationInfoArchival(eu.europa.esig.dss.cades.validation.CAdESAttribute p0)`
- `protected boolean isArchiveTimestamp(eu.europa.esig.dss.cades.validation.CAdESAttribute p0)`
- `protected boolean isAttributeCertificateRef(eu.europa.esig.dss.cades.validation.CAdESAttribute p0)`
- `protected boolean isAttributeRevocationRef(eu.europa.esig.dss.cades.validation.CAdESAttribute p0)`
- `protected boolean isCertificateValues(eu.europa.esig.dss.cades.validation.CAdESAttribute p0)`
- `protected boolean isCompleteCertificateRef(eu.europa.esig.dss.cades.validation.CAdESAttribute p0)`
- `protected boolean isCompleteRevocationRef(eu.europa.esig.dss.cades.validation.CAdESAttribute p0)`
- `protected boolean isRefsOnlyTimestamp(eu.europa.esig.dss.cades.validation.CAdESAttribute p0)`
- `protected boolean isRevocationValues(eu.europa.esig.dss.cades.validation.CAdESAttribute p0)`
- `protected boolean isSigAndRefsTimestamp(eu.europa.esig.dss.cades.validation.CAdESAttribute p0)`
- `protected void makeTimestampTokensFromSignedAttributes()`
- `protected void makeTimestampTokensFromUnsignedAttributes()`

---

## public class `eu.europa.esig.dss.pades.validation.timestamp.PdfRevisionTimestampSource`
extends `eu.europa.esig.dss.validation.timestamp.AbstractTimestampSource`  

**Constructors:**
- `public PdfRevisionTimestampSource(eu.europa.esig.dss.pades.validation.PdfRevision p0, eu.europa.esig.dss.spi.x509.ListCertificateSource p1, eu.europa.esig.dss.validation.ListRevocationSource p2, eu.europa.esig.dss.validation.ListRevocationSource p3)`

**Methods:**
- `public java.util.List getIncorporatedReferences()`

---

## public class `eu.europa.esig.dss.pades.validation.timestamp.PdfTimestampToken`
extends `eu.europa.esig.dss.validation.timestamp.TimestampToken`  

**Constructors:**
- `public PdfTimestampToken(eu.europa.esig.dss.pdf.PdfDocTimestampRevision p0) throws java.io.IOException, org.bouncycastle.cms.CMSException, org.bouncycastle.tsp.TSPException`

**Methods:**
- `public eu.europa.esig.dss.pdf.PdfDocTimestampRevision getPdfRevision()`

---

## public abstract class `eu.europa.esig.dss.pdf.AbstractPDFSignatureService`
implements `eu.europa.esig.dss.pdf.PDFSignatureService`  

**Constructors:**
- `protected AbstractPDFSignatureService(eu.europa.esig.dss.pdf.PDFServiceMode p0, eu.europa.esig.dss.pdf.visible.SignatureDrawerFactory p1)`

**Methods:**
- `public eu.europa.esig.dss.model.DSSDocument addDssDictionary(eu.europa.esig.dss.model.DSSDocument p0, eu.europa.esig.dss.pades.validation.PdfValidationDataContainer p1)`
- `public eu.europa.esig.dss.model.DSSDocument addNewSignatureField(eu.europa.esig.dss.model.DSSDocument p0, eu.europa.esig.dss.pades.SignatureFieldParameters p1)`
- `public void analyzePdfModifications(eu.europa.esig.dss.model.DSSDocument p0, java.util.List p1, java.lang.String p2)`
- `protected eu.europa.esig.dss.pdf.AnnotationBox buildSignatureFieldBox(eu.europa.esig.dss.pdf.visible.SignatureDrawer p0) throws java.io.IOException`
- `protected void checkDocumentPermissions(eu.europa.esig.dss.pdf.PdfDocumentReader p0)`
- `protected void checkNewSignatureIsPermitted(eu.europa.esig.dss.pdf.PdfDocumentReader p0, eu.europa.esig.dss.pades.SignatureFieldParameters p1)`
- `protected void checkSignatureFieldAgainstPageDimensions(eu.europa.esig.dss.pdf.AnnotationBox p0, eu.europa.esig.dss.pdf.AnnotationBox p1, int p2)`
- `protected void checkSignatureFieldBoxOverlap(eu.europa.esig.dss.pdf.AnnotationBox p0, java.util.List p1)`
- `protected byte[] extractBeforeSignatureValue(eu.europa.esig.dss.pades.validation.ByteRange p0, byte[] p1)`
- `public java.util.List getAvailableSignatureFields(eu.europa.esig.dss.model.DSSDocument p0)`
- `public java.util.List getRevisions(eu.europa.esig.dss.model.DSSDocument p0, java.lang.String p1)`
- `protected byte[] getSignatureValue(eu.europa.esig.dss.model.DSSDocument p0, eu.europa.esig.dss.pades.validation.ByteRange p1) throws java.io.IOException`
- `protected java.lang.String getType()`
- `protected eu.europa.esig.dss.pdf.AnnotationBox getVisibleSignatureFieldBoxPosition(eu.europa.esig.dss.pdf.PdfDocumentReader p0, eu.europa.esig.dss.pades.SignatureFieldParameters p1) throws java.io.IOException`
- `protected eu.europa.esig.dss.pdf.AnnotationBox getVisibleSignatureFieldBoxPosition(eu.europa.esig.dss.pdf.visible.SignatureDrawer p0, eu.europa.esig.dss.pdf.PdfDocumentReader p1, eu.europa.esig.dss.pades.SignatureFieldParameters p2) throws java.io.IOException`
- `protected java.util.List getVisualDifferences(eu.europa.esig.dss.pdf.PdfDocumentReader p0, eu.europa.esig.dss.pdf.PdfDocumentReader p1) throws java.io.IOException`
- `protected boolean isContentValueEqualsByteRangeExtraction(eu.europa.esig.dss.model.DSSDocument p0, eu.europa.esig.dss.pades.validation.ByteRange p1, byte[] p2, java.util.List p3)`
- `protected boolean isDocTimestamp(eu.europa.esig.dss.pades.validation.PdfSignatureDictionary p0)`
- `protected boolean isDocumentTimestampLayer()`
- `protected boolean isSignature(eu.europa.esig.dss.pades.validation.PdfSignatureDictionary p0)`
- `protected abstract eu.europa.esig.dss.pdf.PdfDocumentReader loadPdfDocumentReader(byte[] p0, java.lang.String p1) throws eu.europa.esig.dss.pades.exception.InvalidPasswordException, java.io.IOException`
- `protected abstract eu.europa.esig.dss.pdf.PdfDocumentReader loadPdfDocumentReader(eu.europa.esig.dss.model.DSSDocument p0, java.lang.String p1) throws eu.europa.esig.dss.pades.exception.InvalidPasswordException, java.io.IOException`
- `protected eu.europa.esig.dss.pdf.visible.SignatureDrawer loadSignatureDrawer(eu.europa.esig.dss.pades.SignatureImageParameters p0)`
- `public void setAlertOnForbiddenSignatureCreation(eu.europa.esig.dss.alert.StatusAlert p0)`
- `public void setAlertOnSignatureFieldOutsidePageDimensions(eu.europa.esig.dss.alert.StatusAlert p0)`
- `public void setAlertOnSignatureFieldOverlap(eu.europa.esig.dss.alert.StatusAlert p0)`
- `public void setMaximalPagesAmountForVisualComparison(int p0)`
- `protected eu.europa.esig.dss.pdf.AnnotationBox toPdfPageCoordinates(eu.europa.esig.dss.pdf.AnnotationBox p0, eu.europa.esig.dss.pdf.AnnotationBox p1, int p2)`

---

## public abstract class `eu.europa.esig.dss.pdf.AbstractPdfDssDict`
implements `eu.europa.esig.dss.pdf.PdfDssDict`  

**Constructors:**
- `protected AbstractPdfDssDict(eu.europa.esig.dss.pdf.PdfDict p0)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.util.Map getCERTs()`
- `protected abstract java.lang.String getCRLArrayDictionaryName()`
- `public java.util.Map getCRLs()`
- `protected abstract java.lang.String getCertArrayDictionaryName()`
- `protected abstract java.lang.String getDictionaryName()`
- `protected abstract java.lang.String getOCSPArrayDictionaryName()`
- `public java.util.Map getOCSPs()`
- `public int hashCode()`

---

## public class `eu.europa.esig.dss.pdf.AnnotationBox`

**Constructors:**
- `public AnnotationBox(eu.europa.esig.dss.pades.SignatureFieldParameters p0)`
- `public AnnotationBox(float p0, float p1, float p2, float p3)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public float getHeight()`
- `public float getMaxX()`
- `public float getMaxY()`
- `public float getMinX()`
- `public float getMinY()`
- `public float getWidth()`
- `public int hashCode()`
- `public boolean isOverlap(eu.europa.esig.dss.pdf.AnnotationBox p0)`
- `public boolean isOverlap(eu.europa.esig.dss.pdf.PdfAnnotation p0)`
- `public eu.europa.esig.dss.pdf.AnnotationBox toPdfPageCoordinates(float p0)`
- `public java.lang.String toString()`

---

## public class `eu.europa.esig.dss.pdf.CommonPdfModification`
implements `eu.europa.esig.dss.pades.validation.PdfModification`  

**Constructors:**
- `public CommonPdfModification(int p0)`

**Methods:**
- `public int getPage()`

---

## public class `eu.europa.esig.dss.pdf.DSSDictionaryExtractionUtils`

**Methods:**
- `public static java.util.Map getCRLsFromArray(eu.europa.esig.dss.pdf.PdfDict p0, java.lang.String p1, java.lang.String p2)`
- `public static java.util.Map getCertsFromArray(eu.europa.esig.dss.pdf.PdfDict p0, java.lang.String p1, java.lang.String p2)`
- `public static java.util.Map getOCSPsFromArray(eu.europa.esig.dss.pdf.PdfDict p0, java.lang.String p1, java.lang.String p2)`

---

## public abstract interface `eu.europa.esig.dss.pdf.IPdfObjFactory`

**Methods:**
- `public abstract eu.europa.esig.dss.pdf.PDFSignatureService newArchiveTimestampService()`
- `public abstract eu.europa.esig.dss.pdf.PDFSignatureService newContentTimestampService()`
- `public abstract eu.europa.esig.dss.pdf.PDFSignatureService newPAdESSignatureService()`
- `public abstract eu.europa.esig.dss.pdf.PDFSignatureService newSignatureTimestampService()`

---

## public class `eu.europa.esig.dss.pdf.ObjectModification`

**Methods:**
- `public static eu.europa.esig.dss.pdf.ObjectModification create(eu.europa.esig.dss.pdf.PdfObjectTree p0, java.lang.Object p1)`
- `public static eu.europa.esig.dss.pdf.ObjectModification delete(eu.europa.esig.dss.pdf.PdfObjectTree p0, java.lang.Object p1)`
- `public boolean equals(java.lang.Object p0)`
- `public eu.europa.esig.dss.enumerations.PdfObjectModificationType getActionType()`
- `public java.lang.String getFieldName()`
- `public java.lang.Object getFinalObject()`
- `public eu.europa.esig.dss.pdf.PdfObjectTree getObjectTree()`
- `public java.lang.Object getOriginalObject()`
- `public java.lang.String getType()`
- `public int hashCode()`
- `public static eu.europa.esig.dss.pdf.ObjectModification modify(eu.europa.esig.dss.pdf.PdfObjectTree p0, java.lang.Object p1, java.lang.Object p2)`

---

## public final class `eu.europa.esig.dss.pdf.PAdESConstants`

**Fields:**
- `public final static java.lang.String ACRO_FORM_NAME`
- `public final static java.lang.String ACTION_NAME`
- `public final static java.lang.String ANNOTS_NAME`
- `public final static java.lang.String ANNOT_FLAG`
- `public final static java.lang.String APPEARANCE_DICTIONARY_NAME`
- `public final static java.lang.String AS_NAME`
- `public final static java.lang.String BYTE_RANGE_NAME`
- `public final static java.lang.String CATALOG_NAME`
- `public final static java.lang.String CERT_ARRAY_NAME_DSS`
- `public final static java.lang.String CERT_ARRAY_NAME_VRI`
- `public final static java.lang.String CONTACT_INFO_NAME`
- `public final static java.lang.String CONTENTS_NAME`
- `public final static java.lang.String CRL_ARRAY_NAME_DSS`
- `public final static java.lang.String CRL_ARRAY_NAME_VRI`
- `public final static java.lang.String DATA_NAME`
- `public final static java.lang.String DOCUMENT_APPEARANCE_NAME`
- `public final static java.lang.String DOCUMENT_RESOURCES_NAME`
- `public final static java.lang.String DOC_MDP_NAME`
- `public final static java.lang.String DSS_DICTIONARY_NAME`
- `public final static java.lang.String EXTENSIONS_NAME`
- `public final static java.lang.String FIELDS_NAME`
- `public final static java.lang.String FIELD_MDP_NAME`
- `public final static java.lang.String FIELD_NAME_NAME`
- `public final static java.lang.String FILTER_NAME`
- `public final static java.lang.String FONT_NAME`
- `public final static java.lang.String ITEXT_NAME`
- `public final static java.lang.String LOCATION_NAME`
- `public final static java.lang.String LOCK_NAME`
- `public final static java.lang.String METADATA_NAME`
- `public final static java.lang.String NAMES_NAME`
- `public final static java.lang.String NAME_NAME`
- `public final static java.lang.String OCSP_ARRAY_NAME_DSS`
- `public final static java.lang.String OCSP_ARRAY_NAME_VRI`
- `public final static java.lang.String OUTPUT_INTENTS_NAME`
- `public final static java.lang.String PARENT_NAME`
- `public final static java.lang.String PERMISSIONS_NAME`
- `public final static java.lang.String PERMS_NAME`
- `public final static java.lang.String PIECE_INFO_NAME`
- `public final static java.lang.String REASON_NAME`
- `public final static java.lang.String REFERENCE_NAME`
- `public final static java.lang.String SIGNATURE_DEFAULT_FILTER`
- `public final static java.lang.String SIGNATURE_DEFAULT_SUBFILTER`
- `public final static java.lang.String SIGNATURE_PKCS7_SHA1_SUBFILTER`
- `public final static java.lang.String SIGNATURE_PKCS7_SUBFILTER`
- `public final static java.lang.String SIGNATURE_TYPE`
- `public final static java.lang.String SIGNING_DATE_NAME`
- `public final static java.lang.String SIG_FIELD_LOCK_NAME`
- `public final static java.lang.String SIG_FLAGS_NAME`
- `public final static java.lang.String SIG_REF_NAME`
- `public final static java.lang.String SUB_FILTER_NAME`
- `public final static java.lang.String TIMESTAMP_DEFAULT_FILTER`
- `public final static java.lang.String TIMESTAMP_DEFAULT_SUBFILTER`
- `public final static java.lang.String TIMESTAMP_TYPE`
- `public final static java.lang.String TRANSFORM_METHOD_NAME`
- `public final static java.lang.String TRANSFORM_PARAMS_NAME`
- `public final static java.lang.String TYPE_NAME`
- `public final static java.lang.String UR3_NAME`
- `public final static java.lang.String UR_NAME`
- `public final static java.lang.String VALUE_NAME`
- `public final static java.lang.String VERSION_DEFAULT`
- `public final static java.lang.String VERSION_NAME`
- `public final static java.lang.String VRI_DICTIONARY_NAME`

---

## public final enum `eu.europa.esig.dss.pdf.PDFServiceMode`
extends `java.lang.Enum`  

**Fields:**
- `public final static eu.europa.esig.dss.pdf.PDFServiceMode ARCHIVE_TIMESTAMP`
- `public final static eu.europa.esig.dss.pdf.PDFServiceMode CONTENT_TIMESTAMP`
- `public final static eu.europa.esig.dss.pdf.PDFServiceMode SIGNATURE`
- `public final static eu.europa.esig.dss.pdf.PDFServiceMode SIGNATURE_TIMESTAMP`

---

## public abstract interface `eu.europa.esig.dss.pdf.PDFSignatureService`

**Methods:**
- `public abstract eu.europa.esig.dss.model.DSSDocument addDssDictionary(eu.europa.esig.dss.model.DSSDocument p0, eu.europa.esig.dss.pades.validation.PdfValidationDataContainer p1)`
- `public abstract eu.europa.esig.dss.model.DSSDocument addDssDictionary(eu.europa.esig.dss.model.DSSDocument p0, eu.europa.esig.dss.pades.validation.PdfValidationDataContainer p1, java.lang.String p2)`
- `public abstract eu.europa.esig.dss.model.DSSDocument addNewSignatureField(eu.europa.esig.dss.model.DSSDocument p0, eu.europa.esig.dss.pades.SignatureFieldParameters p1)`
- `public abstract eu.europa.esig.dss.model.DSSDocument addNewSignatureField(eu.europa.esig.dss.model.DSSDocument p0, eu.europa.esig.dss.pades.SignatureFieldParameters p1, java.lang.String p2)`
- `public abstract void analyzePdfModifications(eu.europa.esig.dss.model.DSSDocument p0, java.util.List p1, java.lang.String p2)`
- `public abstract byte[] digest(eu.europa.esig.dss.model.DSSDocument p0, eu.europa.esig.dss.pades.PAdESCommonParameters p1)`
- `public abstract java.util.List getAvailableSignatureFields(eu.europa.esig.dss.model.DSSDocument p0)`
- `public abstract java.util.List getAvailableSignatureFields(eu.europa.esig.dss.model.DSSDocument p0, java.lang.String p1)`
- `public abstract java.util.List getRevisions(eu.europa.esig.dss.model.DSSDocument p0, java.lang.String p1)`
- `public abstract eu.europa.esig.dss.model.DSSDocument previewPageWithVisualSignature(eu.europa.esig.dss.model.DSSDocument p0, eu.europa.esig.dss.pades.PAdESCommonParameters p1)`
- `public abstract eu.europa.esig.dss.model.DSSDocument previewSignatureField(eu.europa.esig.dss.model.DSSDocument p0, eu.europa.esig.dss.pades.PAdESCommonParameters p1)`
- `public abstract eu.europa.esig.dss.model.DSSDocument sign(eu.europa.esig.dss.model.DSSDocument p0, byte[] p1, eu.europa.esig.dss.pades.PAdESCommonParameters p2)`

---

## public class `eu.europa.esig.dss.pdf.PdfAnnotation`

**Constructors:**
- `public PdfAnnotation(eu.europa.esig.dss.pdf.AnnotationBox p0)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public eu.europa.esig.dss.pdf.AnnotationBox getAnnotationBox()`
- `public java.lang.String getName()`
- `public int hashCode()`
- `public void setName(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public abstract interface `eu.europa.esig.dss.pdf.PdfArray`

**Methods:**
- `public abstract eu.europa.esig.dss.pdf.PdfDict getAsDict(int p0)`
- `public abstract java.lang.Number getNumber(int p0)`
- `public abstract java.lang.Object getObject(int p0)`
- `public abstract java.lang.Long getObjectNumber(int p0)`
- `public abstract byte[] getStreamBytes(int p0) throws java.io.IOException`
- `public abstract java.lang.String getString(int p0)`
- `public abstract int size()`

---

## public abstract class `eu.europa.esig.dss.pdf.PdfCMSRevision`
implements `eu.europa.esig.dss.pades.validation.PdfRevision`  

**Constructors:**
- `protected PdfCMSRevision(eu.europa.esig.dss.pades.validation.PdfSignatureDictionary p0, java.util.List p1, eu.europa.esig.dss.model.DSSDocument p2, boolean p3)`

**Methods:**
- `public boolean areAllOriginalBytesCovered()`
- `public eu.europa.esig.dss.pades.validation.ByteRange getByteRange()`
- `public org.bouncycastle.cms.CMSSignedData getCMSSignedData()`
- `public java.util.List getFields()`
- `public eu.europa.esig.dss.pades.validation.PdfModificationDetection getModificationDetection()`
- `public eu.europa.esig.dss.pades.validation.PdfSignatureDictionary getPdfSigDictInfo()`
- `public eu.europa.esig.dss.model.DSSDocument getSignedData()`
- `public java.util.Date getSigningDate()`
- `public void setModificationDetection(eu.europa.esig.dss.pades.validation.PdfModificationDetection p0)`

---

## public abstract interface `eu.europa.esig.dss.pdf.PdfDict`

**Methods:**
- `public abstract eu.europa.esig.dss.pdf.PdfArray getAsArray(java.lang.String p0)`
- `public abstract eu.europa.esig.dss.pdf.PdfDict getAsDict(java.lang.String p0)`
- `public abstract byte[] getBinariesValue(java.lang.String p0) throws java.io.IOException`
- `public abstract java.util.Date getDateValue(java.lang.String p0)`
- `public abstract java.lang.String getNameValue(java.lang.String p0)`
- `public abstract java.lang.Number getNumberValue(java.lang.String p0)`
- `public abstract java.lang.Object getObject(java.lang.String p0)`
- `public abstract java.lang.Long getObjectNumber(java.lang.String p0)`
- `public abstract byte[] getStreamBytes() throws java.io.IOException`
- `public abstract java.lang.String getStringValue(java.lang.String p0)`
- `public abstract java.lang.String[] list()`

---

## public class `eu.europa.esig.dss.pdf.PdfDocDssRevision`
implements `eu.europa.esig.dss.pades.validation.PdfRevision`  

**Constructors:**
- `public PdfDocDssRevision(eu.europa.esig.dss.pades.validation.dss.PdfCompositeDssDictionary p0, eu.europa.esig.dss.pdf.PdfDssDict p1)`

**Methods:**
- `public eu.europa.esig.dss.pades.validation.dss.PdfDssDictCRLSource getCRLSource()`
- `public eu.europa.esig.dss.pades.validation.dss.PdfDssDictCertificateSource getCertificateSource()`
- `public eu.europa.esig.dss.pdf.PdfDssDict getDssDictionary()`
- `public java.util.List getFields()`
- `public eu.europa.esig.dss.pades.validation.PdfModificationDetection getModificationDetection()`
- `public eu.europa.esig.dss.pades.validation.dss.PdfDssDictOCSPSource getOCSPSource()`
- `public eu.europa.esig.dss.pades.validation.PdfSignatureDictionary getPdfSigDictInfo()`

---

## public class `eu.europa.esig.dss.pdf.PdfDocTimestampRevision`
extends `eu.europa.esig.dss.pdf.PdfCMSRevision`  

**Constructors:**
- `public PdfDocTimestampRevision(eu.europa.esig.dss.pades.validation.PdfSignatureDictionary p0, java.util.List p1, eu.europa.esig.dss.model.DSSDocument p2, boolean p3)`

**Methods:**
- `public java.util.Date getSigningDate()`
- `public eu.europa.esig.dss.pades.validation.timestamp.PdfTimestampToken getTimestampToken()`

---

## public abstract interface `eu.europa.esig.dss.pdf.PdfDocumentReader`
implements `java.io.Closeable`  

**Methods:**
- `public abstract void checkDocumentPermissions()`
- `public abstract java.util.Map extractSigDictionaries() throws java.io.IOException`
- `public abstract java.awt.image.BufferedImage generateImageScreenshot(int p0) throws java.io.IOException`
- `public abstract java.awt.image.BufferedImage generateImageScreenshotWithoutAnnotations(int p0, java.util.List p1) throws java.io.IOException`
- `public abstract eu.europa.esig.dss.pdf.PdfDict getCatalogDictionary()`
- `public abstract eu.europa.esig.dss.enumerations.CertificationPermission getCertificationPermission()`
- `public abstract eu.europa.esig.dss.pdf.PdfDssDict getDSSDictionary()`
- `public abstract int getNumberOfPages()`
- `public abstract eu.europa.esig.dss.pdf.AnnotationBox getPageBox(int p0)`
- `public abstract int getPageRotation(int p0)`
- `public abstract java.util.List getPdfAnnotations(int p0) throws java.io.IOException`
- `public abstract boolean isSignatureCoversWholeDocument(eu.europa.esig.dss.pades.validation.PdfSignatureDictionary p0)`
- `public abstract boolean isUsageRightsSignaturePresent()`

---

## public abstract interface `eu.europa.esig.dss.pdf.PdfDssDict`
implements `java.io.Serializable`  

**Methods:**
- `public abstract java.util.Map getCERTs()`
- `public abstract java.util.Map getCRLs()`
- `public abstract java.util.Map getOCSPs()`
- `public abstract java.util.List getVRIs()`

---

## public class `eu.europa.esig.dss.pdf.PdfModificationDetectionImpl`
implements `eu.europa.esig.dss.pades.validation.PdfModificationDetection`  

**Constructors:**
- `public PdfModificationDetectionImpl()`

**Methods:**
- `public boolean areModificationsDetected()`
- `public java.util.List getAnnotationOverlaps()`
- `public eu.europa.esig.dss.pdf.PdfObjectModifications getObjectModifications()`
- `public java.util.List getPageDifferences()`
- `public java.util.List getVisualDifferences()`
- `public void setAnnotationOverlaps(java.util.List p0)`
- `public void setObjectModifications(eu.europa.esig.dss.pdf.PdfObjectModifications p0)`
- `public void setPageDifferences(java.util.List p0)`
- `public void setVisualDifferences(java.util.List p0)`

---

## public class `eu.europa.esig.dss.pdf.PdfModificationDetectionUtils`

**Methods:**
- `public static java.util.List getAnnotationOverlaps(eu.europa.esig.dss.pdf.PdfDocumentReader p0) throws java.io.IOException`
- `public static java.util.Set getModificationSet(eu.europa.esig.dss.pdf.PdfDocumentReader p0, eu.europa.esig.dss.pdf.PdfDocumentReader p1)`
- `public static java.util.List getPagesDifferences(eu.europa.esig.dss.pdf.PdfDocumentReader p0, eu.europa.esig.dss.pdf.PdfDocumentReader p1)`
- `public static java.util.List getVisualDifferences(eu.europa.esig.dss.pdf.PdfDocumentReader p0, eu.europa.esig.dss.pdf.PdfDocumentReader p1) throws java.io.IOException`
- `public static boolean isAnnotationBoxOverlapping(eu.europa.esig.dss.pdf.AnnotationBox p0, java.util.List p1)`

---

## public class `eu.europa.esig.dss.pdf.PdfObjectModifications`

**Constructors:**
- `public PdfObjectModifications()`

**Methods:**
- `public void addAnnotCreationChange(eu.europa.esig.dss.pdf.ObjectModification p0)`
- `public void addFormFillInAndSignatureCreationChange(eu.europa.esig.dss.pdf.ObjectModification p0)`
- `public void addSecureChange(eu.europa.esig.dss.pdf.ObjectModification p0)`
- `public void addUndefinedChange(eu.europa.esig.dss.pdf.ObjectModification p0)`
- `public java.util.List getAnnotCreationChanges()`
- `public java.util.List getFormFillInAndSignatureCreationChanges()`
- `public java.util.List getSecureChanges()`
- `public java.util.List getUndefinedChanges()`
- `public boolean isEmpty()`

---

## public class `eu.europa.esig.dss.pdf.PdfObjectModificationsFilter`

**Constructors:**
- `public PdfObjectModificationsFilter(java.util.Collection p0)`

**Methods:**
- `public eu.europa.esig.dss.pdf.PdfObjectModifications filter()`

---

## public class `eu.europa.esig.dss.pdf.PdfObjectTree`

**Constructors:**
- `public PdfObjectTree(java.lang.String p0)`

**Methods:**
- `public void addKey(java.lang.String p0)`
- `public void addReference(java.lang.Number p0)`
- `public eu.europa.esig.dss.pdf.PdfObjectTree copy()`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.List getKeyChain()`
- `public java.lang.String getLastKey()`
- `public int hashCode()`
- `public boolean isProcessedReference(java.lang.Number p0)`
- `public void setStream()`
- `public java.lang.String toString()`

---

## public class `eu.europa.esig.dss.pdf.PdfSigDictWrapper`
implements `eu.europa.esig.dss.pades.validation.PdfSignatureDictionary`  

**Constructors:**
- `public PdfSigDictWrapper(eu.europa.esig.dss.pdf.PdfDict p0)`

**Methods:**
- `public eu.europa.esig.dss.pades.validation.ByteRange getByteRange()`
- `public org.bouncycastle.cms.CMSSignedData getCMSSignedData()`
- `public java.lang.String getContactInfo()`
- `public byte[] getContents()`
- `public eu.europa.esig.dss.enumerations.CertificationPermission getDocMDP()`
- `public eu.europa.esig.dss.pdf.SigFieldPermissions getFieldMDP()`
- `public java.lang.String getFilter()`
- `public java.lang.String getLocation()`
- `public java.lang.String getReason()`
- `public java.lang.String getSignerName()`
- `public java.util.Date getSigningDate()`
- `public java.lang.String getSubFilter()`
- `public java.lang.String getType()`

---

## public class `eu.europa.esig.dss.pdf.PdfSignatureDictionaryComparator`
implements `java.io.Serializable`, `java.util.Comparator<eu.europa.esig.dss.pades.validation.PdfSignatureDictionary>`  

**Constructors:**
- `public PdfSignatureDictionaryComparator()`

**Methods:**
- `public int compare(eu.europa.esig.dss.pades.validation.PdfSignatureDictionary p0, eu.europa.esig.dss.pades.validation.PdfSignatureDictionary p1)`

---

## public class `eu.europa.esig.dss.pdf.PdfSignatureRevision`
extends `eu.europa.esig.dss.pdf.PdfCMSRevision`  

**Constructors:**
- `public PdfSignatureRevision(eu.europa.esig.dss.pades.validation.PdfSignatureDictionary p0, eu.europa.esig.dss.pades.validation.dss.PdfCompositeDssDictionary p1, eu.europa.esig.dss.pdf.PdfDssDict p2, java.util.List p3, eu.europa.esig.dss.model.DSSDocument p4, boolean p5)`

**Methods:**
- `public eu.europa.esig.dss.pades.validation.dss.PdfCompositeDssDictionary getCompositeDssDictionary()`
- `public eu.europa.esig.dss.pdf.PdfDssDict getDssDictionary()`

---

## public class `eu.europa.esig.dss.pdf.PdfVRIDict`
extends `eu.europa.esig.dss.pdf.AbstractPdfDssDict`  

**Constructors:**
- `public PdfVRIDict(java.lang.String p0, eu.europa.esig.dss.pdf.PdfDict p1)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `protected java.lang.String getCRLArrayDictionaryName()`
- `protected java.lang.String getCertArrayDictionaryName()`
- `protected java.lang.String getDictionaryName()`
- `public java.lang.String getName()`
- `protected java.lang.String getOCSPArrayDictionaryName()`
- `public java.util.List getVRIs()`
- `public int hashCode()`

---

## public class `eu.europa.esig.dss.pdf.ServiceLoaderPdfObjFactory`
implements `eu.europa.esig.dss.pdf.IPdfObjFactory`  

**Constructors:**
- `public ServiceLoaderPdfObjFactory()`

**Methods:**
- `public eu.europa.esig.dss.pdf.PDFSignatureService newArchiveTimestampService()`
- `public eu.europa.esig.dss.pdf.PDFSignatureService newContentTimestampService()`
- `public eu.europa.esig.dss.pdf.PDFSignatureService newPAdESSignatureService()`
- `public eu.europa.esig.dss.pdf.PDFSignatureService newSignatureTimestampService()`

---

## public class `eu.europa.esig.dss.pdf.SigFieldPermissions`

**Constructors:**
- `public SigFieldPermissions()`

**Methods:**
- `public eu.europa.esig.dss.enumerations.PdfLockAction getAction()`
- `public eu.europa.esig.dss.enumerations.CertificationPermission getCertificationPermission()`
- `public java.util.List getFields()`
- `public void setAction(eu.europa.esig.dss.enumerations.PdfLockAction p0)`
- `public void setCertificationPermission(eu.europa.esig.dss.enumerations.CertificationPermission p0)`
- `public void setFields(java.util.List p0)`

---

## public class `eu.europa.esig.dss.pdf.SingleDssDict`
extends `eu.europa.esig.dss.pdf.AbstractPdfDssDict`  

**Constructors:**
- `protected SingleDssDict(eu.europa.esig.dss.pdf.PdfDict p0)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public static eu.europa.esig.dss.pdf.SingleDssDict extract(eu.europa.esig.dss.pdf.PdfDict p0)`
- `protected java.lang.String getCRLArrayDictionaryName()`
- `protected java.lang.String getCertArrayDictionaryName()`
- `protected java.lang.String getDictionaryName()`
- `protected java.lang.String getOCSPArrayDictionaryName()`
- `public java.util.List getVRIs()`
- `public int hashCode()`

---

## public class `eu.europa.esig.dss.pdf.encryption.DSSSecureRandomProvider`
implements `eu.europa.esig.dss.pdf.encryption.SecureRandomProvider`  

**Constructors:**
- `public DSSSecureRandomProvider(eu.europa.esig.dss.pades.PAdESCommonParameters p0)`

**Methods:**
- `public java.security.SecureRandom getSecureRandom()`
- `public void setBinaryLength(int p0)`
- `public void setDigestAlgorithm(eu.europa.esig.dss.enumerations.DigestAlgorithm p0)`

---

## public abstract interface `eu.europa.esig.dss.pdf.encryption.SecureRandomProvider`

**Methods:**
- `public abstract java.security.SecureRandom getSecureRandom()`

---

## public abstract class `eu.europa.esig.dss.pdf.visible.AbstractDSSFontMetrics`
implements `eu.europa.esig.dss.pdf.visible.DSSFontMetrics`  

**Constructors:**
- `public AbstractDSSFontMetrics()`

**Methods:**
- `public eu.europa.esig.dss.pdf.AnnotationBox computeTextBoundaryBox(java.lang.String p0, float p1)`
- `public java.lang.String[] getLines(java.lang.String p0)`

---

## public class `eu.europa.esig.dss.pdf.visible.DPIUtils`

**Methods:**
- `public static float computeProperSize(float p0, float p1)`
- `public static int getDpi(java.lang.Integer p0)`
- `public static float getPageScaleFactor(java.lang.Integer p0)`
- `public static int getTextDpi()`

---

## public abstract interface `eu.europa.esig.dss.pdf.visible.DSSFontMetrics`

**Methods:**
- `public abstract eu.europa.esig.dss.pdf.AnnotationBox computeTextBoundaryBox(java.lang.String p0, float p1)`
- `public abstract float getHeight(java.lang.String p0, float p1)`
- `public abstract java.lang.String[] getLines(java.lang.String p0)`
- `public abstract float getWidth(java.lang.String p0, float p1)`

---

## public class `eu.europa.esig.dss.pdf.visible.ImageResolution`

**Constructors:**
- `public ImageResolution(int p0, int p1)`

**Methods:**
- `public int getXDpi()`
- `public int getYDpi()`
- `public java.lang.String toString()`

---

## public class `eu.europa.esig.dss.pdf.visible.ImageRotationUtils`

**Fields:**
- `public final static int ANGLE_0`
- `public final static int ANGLE_180`
- `public final static int ANGLE_270`
- `public final static int ANGLE_360`
- `public final static int ANGLE_90`
- `public final static java.lang.String SUPPORTED_ANGLES_ERROR_MESSAGE`

**Methods:**
- `public static int getRotation(eu.europa.esig.dss.enumerations.VisualSignatureRotation p0)`
- `public static int getRotation(eu.europa.esig.dss.enumerations.VisualSignatureRotation p0, int p1)`
- `public static boolean isSwapOfDimensionsRequired(eu.europa.esig.dss.enumerations.VisualSignatureRotation p0)`
- `public static boolean isSwapOfDimensionsRequired(int p0)`
- `public static eu.europa.esig.dss.pdf.AnnotationBox rotateRelativelyWrappingBox(eu.europa.esig.dss.pdf.AnnotationBox p0, eu.europa.esig.dss.pdf.AnnotationBox p1, int p2)`
- `public static eu.europa.esig.dss.pdf.AnnotationBox swapDimensions(eu.europa.esig.dss.pdf.AnnotationBox p0)`

---

## public class `eu.europa.esig.dss.pdf.visible.ImageUtils`

**Fields:**
- `public final static int DEFAULT_FIRST_PAGE`

**Methods:**
- `public static int drawSubtractionImage(java.awt.image.BufferedImage p0, java.awt.image.BufferedImage p1, java.awt.image.BufferedImage p2)`
- `public static eu.europa.esig.dss.pdf.AnnotationBox getImageBoundaryBox(eu.europa.esig.dss.model.DSSDocument p0)`
- `public static float getScaleFactor(int p0)`
- `public static boolean imageDimensionsEqual(java.awt.image.BufferedImage p0, java.awt.image.BufferedImage p1)`
- `public static boolean imagesEqual(java.awt.image.BufferedImage p0, java.awt.image.BufferedImage p1)`
- `public static boolean isTransparent(java.awt.image.BufferedImage p0)`
- `public static eu.europa.esig.dss.pdf.visible.ImageResolution readDisplayMetadata(eu.europa.esig.dss.model.DSSDocument p0) throws java.io.IOException`
- `public static eu.europa.esig.dss.pdf.visible.ImageResolution secureReadMetadata(eu.europa.esig.dss.pades.SignatureImageParameters p0) throws java.io.IOException`
- `public static java.awt.image.BufferedImage toBufferedImage(eu.europa.esig.dss.model.DSSDocument p0) throws java.io.IOException`
- `public static java.awt.image.BufferedImage toBufferedImage(java.io.InputStream p0) throws java.io.IOException`
- `public static eu.europa.esig.dss.model.DSSDocument toDSSDocument(java.awt.image.BufferedImage p0)`

---

## public abstract interface `eu.europa.esig.dss.pdf.visible.SignatureDrawer`

**Methods:**
- `public abstract void draw() throws java.io.IOException`

---

## public abstract interface `eu.europa.esig.dss.pdf.visible.SignatureDrawerFactory`

**Methods:**
- `public abstract eu.europa.esig.dss.pdf.visible.SignatureDrawer getSignatureDrawer(eu.europa.esig.dss.pades.SignatureImageParameters p0)`

---

## public abstract interface `eu.europa.esig.dss.pdf.visible.SignatureFieldBoxBuilder`

**Methods:**
- `public abstract eu.europa.esig.dss.pdf.visible.VisualSignatureFieldAppearance buildSignatureFieldBox() throws java.io.IOException`

---

## public class `eu.europa.esig.dss.pdf.visible.SignatureFieldDimensionAndPosition`
implements `eu.europa.esig.dss.pdf.visible.VisualSignatureFieldAppearance`  

**Constructors:**
- `public SignatureFieldDimensionAndPosition()`

**Methods:**
- `public eu.europa.esig.dss.pdf.AnnotationBox getAnnotationBox()`
- `public float getBoxHeight()`
- `public float getBoxWidth()`
- `public float getBoxX()`
- `public float getBoxY()`
- `public int getGlobalRotation()`
- `public float getImageBoxHeight()`
- `public float getImageBoxWidth()`
- `public float getImageBoxX()`
- `public float getImageBoxY()`
- `public float getImageHeight()`
- `public eu.europa.esig.dss.pdf.visible.ImageResolution getImageResolution()`
- `public float getImageWidth()`
- `public float getImageX()`
- `public float getImageY()`
- `public java.lang.String getText()`
- `public float getTextBoxHeight()`
- `public float getTextBoxWidth()`
- `public float getTextBoxX()`
- `public float getTextBoxY()`
- `public float getTextHeight()`
- `public float getTextSize()`
- `public float getTextWidth()`
- `public float getTextX()`
- `public float getTextY()`
- `public void setBoxHeight(float p0)`
- `public void setBoxWidth(float p0)`
- `public void setBoxX(float p0)`
- `public void setBoxY(float p0)`
- `public void setGlobalRotation(int p0)`
- `public void setImageBoxHeight(float p0)`
- `public void setImageBoxWidth(float p0)`
- `public void setImageBoxX(float p0)`
- `public void setImageBoxY(float p0)`
- `public void setImageHeight(float p0)`
- `public void setImageResolution(eu.europa.esig.dss.pdf.visible.ImageResolution p0)`
- `public void setImageWidth(float p0)`
- `public void setImageX(float p0)`
- `public void setImageY(float p0)`
- `public void setText(java.lang.String p0)`
- `public void setTextBoxHeight(float p0)`
- `public void setTextBoxWidth(float p0)`
- `public void setTextBoxX(float p0)`
- `public void setTextBoxY(float p0)`
- `public void setTextHeight(float p0)`
- `public void setTextSize(float p0)`
- `public void setTextWidth(float p0)`
- `public void setTextX(float p0)`
- `public void setTextY(float p0)`

---

## public class `eu.europa.esig.dss.pdf.visible.SignatureFieldDimensionAndPositionBuilder`

**Constructors:**
- `public SignatureFieldDimensionAndPositionBuilder(eu.europa.esig.dss.pades.SignatureImageParameters p0, eu.europa.esig.dss.pdf.visible.DSSFontMetrics p1, eu.europa.esig.dss.pdf.AnnotationBox p2, int p3)`

**Fields:**
- `protected final eu.europa.esig.dss.pades.SignatureImageParameters imageParameters`

**Methods:**
- `public eu.europa.esig.dss.pdf.visible.SignatureFieldDimensionAndPosition build()`
- `public eu.europa.esig.dss.pdf.visible.SignatureFieldDimensionAndPositionBuilder setSignatureFieldAnnotationBox(eu.europa.esig.dss.pdf.AnnotationBox p0)`

---

## public final class `eu.europa.esig.dss.pdf.visible.TextFitter`

**Methods:**
- `public static eu.europa.esig.dss.pdf.visible.TextFitter$Result fitSignatureText(eu.europa.esig.dss.pades.SignatureImageTextParameters p0, float p1, eu.europa.esig.dss.pdf.visible.DSSFontMetrics p2, eu.europa.esig.dss.pdf.AnnotationBox p3)`

---

## public final static class `eu.europa.esig.dss.pdf.visible.TextFitter$Result`

**Methods:**
- `public float getSize()`
- `public java.lang.String getText()`

---

## public abstract interface `eu.europa.esig.dss.pdf.visible.VisualSignatureFieldAppearance`

**Methods:**
- `public abstract eu.europa.esig.dss.pdf.AnnotationBox getAnnotationBox()`

---

