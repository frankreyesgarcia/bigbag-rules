# Breaking Changes: net.lingala.zip4j:zip4j 1.3.2 → 2.11.1
Total: 259 (binary-breaking: 237, source-breaking: 237)

## net.lingala.zip4j.core.HeaderReader

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.core.HeaderReader`

## net.lingala.zip4j.core.HeaderWriter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.core.HeaderWriter`

## net.lingala.zip4j.core.ZipFile

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.core.ZipFile`

## net.lingala.zip4j.crypto.AESDecrypter

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `net.lingala.zip4j.crypto.AESDecrypter.<init>(net.lingala.zip4j.model.LocalFileHeader,byte[],byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.crypto.AESDecrypter.decryptData(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.crypto.AESDecrypter.getPasswordVerifierLength()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.crypto.AESDecrypter.getSaltLength()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.crypto.AESDecrypter.getStoredMac()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.crypto.AESDecrypter.setStoredMac(byte[])`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `net.lingala.zip4j.crypto.AESDecrypter`

## net.lingala.zip4j.crypto.AESEncrpyter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.crypto.AESEncrpyter`

## net.lingala.zip4j.crypto.IDecrypter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.crypto.IDecrypter`

## net.lingala.zip4j.crypto.IEncrypter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.crypto.IEncrypter`

## net.lingala.zip4j.crypto.PBKDF2.MacBasedPRF

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `net.lingala.zip4j.crypto.PBKDF2.MacBasedPRF.<init>(java.lang.String,java.lang.String)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `net.lingala.zip4j.crypto.PBKDF2.MacBasedPRF.hLen`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `net.lingala.zip4j.crypto.PBKDF2.MacBasedPRF.mac`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `net.lingala.zip4j.crypto.PBKDF2.MacBasedPRF.macAlgorithm`

## net.lingala.zip4j.crypto.PBKDF2.PBKDF2Engine

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `net.lingala.zip4j.crypto.PBKDF2.PBKDF2Engine.<init>()`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `net.lingala.zip4j.crypto.PBKDF2.PBKDF2Engine.parameters`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `net.lingala.zip4j.crypto.PBKDF2.PBKDF2Engine.prf`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.crypto.PBKDF2.PBKDF2Engine.PBKDF2(net.lingala.zip4j.crypto.PBKDF2.PRF,byte[],int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.crypto.PBKDF2.PBKDF2Engine._F(byte[],int,net.lingala.zip4j.crypto.PBKDF2.PRF,byte[],int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.crypto.PBKDF2.PBKDF2Engine.assertPRF(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.crypto.PBKDF2.PBKDF2Engine.ceil(int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.crypto.PBKDF2.PBKDF2Engine.deriveKey(char[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.crypto.PBKDF2.PBKDF2Engine.deriveKey(char[],int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.crypto.PBKDF2.PBKDF2Engine.getPseudoRandomFunction()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.crypto.PBKDF2.PBKDF2Engine.verifyKey(char[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.crypto.PBKDF2.PBKDF2Engine.xor(byte[],byte[])`

## net.lingala.zip4j.crypto.StandardDecrypter

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `net.lingala.zip4j.crypto.StandardDecrypter.<init>(net.lingala.zip4j.model.FileHeader,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.crypto.StandardDecrypter.decryptData(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.crypto.StandardDecrypter.init(byte[])`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `net.lingala.zip4j.crypto.StandardDecrypter`

## net.lingala.zip4j.crypto.StandardEncrypter

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `net.lingala.zip4j.crypto.StandardEncrypter.<init>(char[],int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.crypto.StandardEncrypter.generateRandomBytes(int)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `net.lingala.zip4j.crypto.StandardEncrypter`

## net.lingala.zip4j.crypto.engine.AESEngine

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.crypto.engine.AESEngine.init(byte[])`

## net.lingala.zip4j.crypto.engine.ZipCryptoEngine

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.crypto.engine.ZipCryptoEngine.initKeys(char[])`

## net.lingala.zip4j.exception.ZipException

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `net.lingala.zip4j.exception.ZipException.<init>()`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `net.lingala.zip4j.exception.ZipException.<init>(java.lang.String,int)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `net.lingala.zip4j.exception.ZipException.<init>(java.lang.String,java.lang.Throwable)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `net.lingala.zip4j.exception.ZipException.<init>(java.lang.String,java.lang.Throwable,int)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `net.lingala.zip4j.exception.ZipException.<init>(java.lang.Throwable)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `net.lingala.zip4j.exception.ZipException.<init>(java.lang.Throwable,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.exception.ZipException.getCode()`

## net.lingala.zip4j.exception.ZipExceptionConstants

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.exception.ZipExceptionConstants`

## net.lingala.zip4j.io.BaseInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.io.BaseInputStream`

## net.lingala.zip4j.io.BaseOutputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.io.BaseOutputStream`

## net.lingala.zip4j.io.CipherOutputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.io.CipherOutputStream`

## net.lingala.zip4j.io.DeflaterOutputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.io.DeflaterOutputStream`

## net.lingala.zip4j.io.InflaterInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.io.InflaterInputStream`

## net.lingala.zip4j.io.PartInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.io.PartInputStream`

## net.lingala.zip4j.io.SplitOutputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.io.SplitOutputStream`

## net.lingala.zip4j.io.ZipInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.io.ZipInputStream`

## net.lingala.zip4j.io.ZipOutputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.io.ZipOutputStream`

## net.lingala.zip4j.model.AESExtraDataRecord

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.AESExtraDataRecord.getAesStrength()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.AESExtraDataRecord.getVersionNumber()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.AESExtraDataRecord.setAesStrength(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.AESExtraDataRecord.setCompressionMethod(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.AESExtraDataRecord.setSignature(long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.AESExtraDataRecord.setVersionNumber(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.lingala.zip4j.model.AESExtraDataRecord.getCompressionMethod()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.AESExtraDataRecord.getCompressionMethod()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.lingala.zip4j.model.AESExtraDataRecord.getSignature()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.ZipHeader.getSignature()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.lingala.zip4j.model.AESExtraDataRecord.getCompressionMethod()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.AESExtraDataRecord.getCompressionMethod()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.lingala.zip4j.model.AESExtraDataRecord.getSignature()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.ZipHeader.getSignature()`

## net.lingala.zip4j.model.ArchiveExtraDataRecord

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ArchiveExtraDataRecord.setSignature(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.lingala.zip4j.model.ArchiveExtraDataRecord.getSignature()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.ZipHeader.getSignature()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.lingala.zip4j.model.ArchiveExtraDataRecord.getSignature()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.ZipHeader.getSignature()`

## net.lingala.zip4j.model.CentralDirectory

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.CentralDirectory.setFileHeaders(java.util.ArrayList)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.lingala.zip4j.model.CentralDirectory.getFileHeaders()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.CentralDirectory.getFileHeaders()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.lingala.zip4j.model.CentralDirectory.getFileHeaders()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.CentralDirectory.getFileHeaders()`

## net.lingala.zip4j.model.DataDescriptor

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.DataDescriptor.getCrc32()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.DataDescriptor.setCompressedSize(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.DataDescriptor.setCrc32(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.DataDescriptor.setUncompressedSize(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.lingala.zip4j.model.DataDescriptor.getCompressedSize()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.DataDescriptor.getCompressedSize()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.lingala.zip4j.model.DataDescriptor.getUncompressedSize()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.DataDescriptor.getUncompressedSize()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.lingala.zip4j.model.DataDescriptor.getCompressedSize()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.DataDescriptor.getCompressedSize()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.lingala.zip4j.model.DataDescriptor.getUncompressedSize()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.DataDescriptor.getUncompressedSize()`

## net.lingala.zip4j.model.DigitalSignature

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.DigitalSignature.getHeaderSignature()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.DigitalSignature.setHeaderSignature(int)`

## net.lingala.zip4j.model.EndCentralDirRecord

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.model.EndCentralDirRecord`

## net.lingala.zip4j.model.FileHeader

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.FileHeader.extractFile(net.lingala.zip4j.model.ZipModel,java.lang.String,net.lingala.zip4j.model.UnzipParameters,java.lang.String,net.lingala.zip4j.progress.ProgressMonitor,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.FileHeader.extractFile(net.lingala.zip4j.model.ZipModel,java.lang.String,net.lingala.zip4j.model.UnzipParameters,net.lingala.zip4j.progress.ProgressMonitor,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.FileHeader.extractFile(net.lingala.zip4j.model.ZipModel,java.lang.String,net.lingala.zip4j.progress.ProgressMonitor,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.FileHeader.getCrc32()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.FileHeader.getCrcBuff()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.FileHeader.getExternalFileAttr()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.FileHeader.getInternalFileAttr()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.FileHeader.getLastModFileTime()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.FileHeader.getPassword()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.FileHeader.setCompressionMethod(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.FileHeader.setCrc32(long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.FileHeader.setCrcBuff(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.FileHeader.setEncryptionMethod(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.FileHeader.setExternalFileAttr(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.FileHeader.setExtraDataRecords(java.util.ArrayList)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.FileHeader.setInternalFileAttr(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.FileHeader.setLastModFileTime(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.FileHeader.setPassword(char[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.FileHeader.setSignature(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.lingala.zip4j.model.FileHeader.getCompressionMethod()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.AbstractFileHeader.getCompressionMethod()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.lingala.zip4j.model.FileHeader.getEncryptionMethod()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.AbstractFileHeader.getEncryptionMethod()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.lingala.zip4j.model.FileHeader.getExtraDataRecords()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.AbstractFileHeader.getExtraDataRecords()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.lingala.zip4j.model.FileHeader.getSignature()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.ZipHeader.getSignature()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.lingala.zip4j.model.FileHeader.getCompressionMethod()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.AbstractFileHeader.getCompressionMethod()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.lingala.zip4j.model.FileHeader.getEncryptionMethod()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.AbstractFileHeader.getEncryptionMethod()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.lingala.zip4j.model.FileHeader.getExtraDataRecords()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.AbstractFileHeader.getExtraDataRecords()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.lingala.zip4j.model.FileHeader.getSignature()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.ZipHeader.getSignature()`

## net.lingala.zip4j.model.LocalFileHeader

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.LocalFileHeader.getCrc32()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.LocalFileHeader.getCrcBuff()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.LocalFileHeader.getLastModFileTime()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.LocalFileHeader.getPassword()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.LocalFileHeader.isWriteComprSizeInZip64ExtraRecord()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.LocalFileHeader.setCompressionMethod(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.LocalFileHeader.setCrc32(long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.LocalFileHeader.setCrcBuff(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.LocalFileHeader.setEncryptionMethod(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.LocalFileHeader.setExtraDataRecords(java.util.ArrayList)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.LocalFileHeader.setLastModFileTime(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.LocalFileHeader.setPassword(char[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.LocalFileHeader.setSignature(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.LocalFileHeader.setWriteComprSizeInZip64ExtraRecord(boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.lingala.zip4j.model.LocalFileHeader.getCompressionMethod()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.AbstractFileHeader.getCompressionMethod()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.lingala.zip4j.model.LocalFileHeader.getEncryptionMethod()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.AbstractFileHeader.getEncryptionMethod()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.lingala.zip4j.model.LocalFileHeader.getExtraDataRecords()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.AbstractFileHeader.getExtraDataRecords()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.lingala.zip4j.model.LocalFileHeader.getSignature()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.ZipHeader.getSignature()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.lingala.zip4j.model.LocalFileHeader.getCompressionMethod()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.AbstractFileHeader.getCompressionMethod()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.lingala.zip4j.model.LocalFileHeader.getEncryptionMethod()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.AbstractFileHeader.getEncryptionMethod()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.lingala.zip4j.model.LocalFileHeader.getExtraDataRecords()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.AbstractFileHeader.getExtraDataRecords()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.lingala.zip4j.model.LocalFileHeader.getSignature()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.ZipHeader.getSignature()`

## net.lingala.zip4j.model.UnzipEngineParameters

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.model.UnzipEngineParameters`

## net.lingala.zip4j.model.UnzipParameters

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.UnzipParameters.isIgnoreAllFileAttributes()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.UnzipParameters.isIgnoreArchiveFileAttribute()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.UnzipParameters.isIgnoreDateTimeAttributes()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.UnzipParameters.isIgnoreHiddenFileAttribute()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.UnzipParameters.isIgnoreReadOnlyFileAttribute()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.UnzipParameters.isIgnoreSystemFileAttribute()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.UnzipParameters.setIgnoreAllFileAttributes(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.UnzipParameters.setIgnoreArchiveFileAttribute(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.UnzipParameters.setIgnoreDateTimeAttributes(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.UnzipParameters.setIgnoreHiddenFileAttribute(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.UnzipParameters.setIgnoreReadOnlyFileAttribute(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.UnzipParameters.setIgnoreSystemFileAttribute(boolean)`

## net.lingala.zip4j.model.Zip64EndCentralDirLocator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.model.Zip64EndCentralDirLocator`

## net.lingala.zip4j.model.Zip64EndCentralDirRecord

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.model.Zip64EndCentralDirRecord`

## net.lingala.zip4j.model.Zip64ExtendedInfo

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.Zip64ExtendedInfo.getHeader()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.Zip64ExtendedInfo.getUnCompressedSize()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.Zip64ExtendedInfo.setHeader(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.Zip64ExtendedInfo.setUnCompressedSize(long)`

## net.lingala.zip4j.model.ZipModel

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipModel.getDataDescriptorList()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipModel.getEndCentralDirRecord()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipModel.getFileNameCharset()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipModel.getLocalFileHeaderList()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipModel.getZip64EndCentralDirLocator()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipModel.getZip64EndCentralDirRecord()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipModel.setDataDescriptorList(java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipModel.setEndCentralDirRecord(net.lingala.zip4j.model.EndCentralDirRecord)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipModel.setFileNameCharset(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipModel.setLocalFileHeaderList(java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipModel.setZip64EndCentralDirLocator(net.lingala.zip4j.model.Zip64EndCentralDirLocator)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipModel.setZip64EndCentralDirRecord(net.lingala.zip4j.model.Zip64EndCentralDirRecord)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipModel.setZipFile(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.lingala.zip4j.model.ZipModel.getZipFile()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.ZipModel.getZipFile()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.lingala.zip4j.model.ZipModel.getZipFile()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.ZipModel.getZipFile()`

## net.lingala.zip4j.model.ZipParameters

### METHOD_NOW_PROTECTED [binary ✗ | source ✗]
- METHOD (now protected, was public): `net.lingala.zip4j.model.ZipParameters.clone()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipParameters.getPassword()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipParameters.getRootFolderInZip()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipParameters.getSourceFileCRC()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipParameters.getTimeZone()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipParameters.isSourceExternalStream()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipParameters.setAesKeyStrength(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipParameters.setCompressionLevel(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipParameters.setCompressionMethod(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipParameters.setEncryptionMethod(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipParameters.setPassword(char[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipParameters.setPassword(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipParameters.setRootFolderInZip(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipParameters.setSourceExternalStream(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipParameters.setSourceFileCRC(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.model.ZipParameters.setTimeZone(java.util.TimeZone)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.lingala.zip4j.model.ZipParameters.getAesKeyStrength()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.ZipParameters.getAesKeyStrength()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.lingala.zip4j.model.ZipParameters.getCompressionLevel()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.ZipParameters.getCompressionLevel()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.lingala.zip4j.model.ZipParameters.getCompressionMethod()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.ZipParameters.getCompressionMethod()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.lingala.zip4j.model.ZipParameters.getEncryptionMethod()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.ZipParameters.getEncryptionMethod()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.lingala.zip4j.model.ZipParameters.getAesKeyStrength()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.ZipParameters.getAesKeyStrength()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.lingala.zip4j.model.ZipParameters.getCompressionLevel()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.ZipParameters.getCompressionLevel()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.lingala.zip4j.model.ZipParameters.getCompressionMethod()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.ZipParameters.getCompressionMethod()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.lingala.zip4j.model.ZipParameters.getEncryptionMethod()`
+ NEW RETURN TYPE: `net.lingala.zip4j.model.ZipParameters.getEncryptionMethod()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `net.lingala.zip4j.model.ZipParameters`

## net.lingala.zip4j.progress.ProgressMonitor

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `net.lingala.zip4j.progress.ProgressMonitor.OPERATION_ADD`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `net.lingala.zip4j.progress.ProgressMonitor.OPERATION_CALC_CRC`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `net.lingala.zip4j.progress.ProgressMonitor.OPERATION_EXTRACT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `net.lingala.zip4j.progress.ProgressMonitor.OPERATION_MERGE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `net.lingala.zip4j.progress.ProgressMonitor.OPERATION_NONE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `net.lingala.zip4j.progress.ProgressMonitor.OPERATION_REMOVE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `net.lingala.zip4j.progress.ProgressMonitor.RESULT_CANCELLED`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `net.lingala.zip4j.progress.ProgressMonitor.RESULT_ERROR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `net.lingala.zip4j.progress.ProgressMonitor.RESULT_SUCCESS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `net.lingala.zip4j.progress.ProgressMonitor.RESULT_WORKING`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `net.lingala.zip4j.progress.ProgressMonitor.STATE_BUSY`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `net.lingala.zip4j.progress.ProgressMonitor.STATE_READY`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.progress.ProgressMonitor.cancelAllTasks()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.progress.ProgressMonitor.endProgressMonitorError(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.progress.ProgressMonitor.endProgressMonitorSuccess()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.progress.ProgressMonitor.getCurrentOperation()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.progress.ProgressMonitor.reset()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.progress.ProgressMonitor.setCurrentOperation(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.progress.ProgressMonitor.setException(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.progress.ProgressMonitor.setResult(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.progress.ProgressMonitor.setState(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.lingala.zip4j.progress.ProgressMonitor.getException()`
+ NEW RETURN TYPE: `net.lingala.zip4j.progress.ProgressMonitor.getException()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.lingala.zip4j.progress.ProgressMonitor.getResult()`
+ NEW RETURN TYPE: `net.lingala.zip4j.progress.ProgressMonitor.getResult()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.lingala.zip4j.progress.ProgressMonitor.getState()`
+ NEW RETURN TYPE: `net.lingala.zip4j.progress.ProgressMonitor.getState()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.lingala.zip4j.progress.ProgressMonitor.getException()`
+ NEW RETURN TYPE: `net.lingala.zip4j.progress.ProgressMonitor.getException()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.lingala.zip4j.progress.ProgressMonitor.getResult()`
+ NEW RETURN TYPE: `net.lingala.zip4j.progress.ProgressMonitor.getResult()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.lingala.zip4j.progress.ProgressMonitor.getState()`
+ NEW RETURN TYPE: `net.lingala.zip4j.progress.ProgressMonitor.getState()`

## net.lingala.zip4j.unzip.Unzip

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.unzip.Unzip`

## net.lingala.zip4j.unzip.UnzipEngine

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.unzip.UnzipEngine`

## net.lingala.zip4j.unzip.UnzipUtil

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.unzip.UnzipUtil`

## net.lingala.zip4j.util.ArchiveMaintainer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.util.ArchiveMaintainer`

## net.lingala.zip4j.util.CRCUtil

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.util.CRCUtil`

## net.lingala.zip4j.util.InternalZipConstants

### TYPE_KIND_CHANGED [binary ✗ | source ✗]
- TYPE (kind changed): `net.lingala.zip4j.util.InternalZipConstants`

## net.lingala.zip4j.util.Raw

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.util.Raw`

## net.lingala.zip4j.util.Zip4jConstants

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.util.Zip4jConstants`

## net.lingala.zip4j.util.Zip4jUtil

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.checkArrayListTypes(java.util.ArrayList,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.checkFileExists(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.checkFileExists(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.checkFileReadAccess(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.checkFileWriteAccess(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.checkOutputFolder(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.convertCharset(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.decodeFileName(byte[],boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.detectCharSet(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.dosToJavaTme(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.getAbsoluteFilePath(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.getAllHeaderSignatures()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.getCp850EncodedString(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.getEncodedStringLength(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.getEncodedStringLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.getFileHeader(net.lingala.zip4j.model.ZipModel,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.getFileHeaderWithExactMatch(net.lingala.zip4j.model.ZipModel,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.getFileLengh(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.getFileLengh(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.getFileNameFromFilePath(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.getFilesInDirectoryRec(java.io.File,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.getIndexOfFileHeader(net.lingala.zip4j.model.ZipModel,net.lingala.zip4j.model.FileHeader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.getLastModifiedFileTime(java.io.File,java.util.TimeZone)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.getRelativeFileName(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.getSplitZipFiles(net.lingala.zip4j.model.ZipModel)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.getZipFileNameWithoutExt(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.isSupportedCharset(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.isWindows()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.javaToDosTime(long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.setFileArchive(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.setFileHidden(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.setFileReadOnly(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.lingala.zip4j.util.Zip4jUtil.setFileSystemMode(java.io.File)`

## net.lingala.zip4j.zip.ZipEngine

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.lingala.zip4j.zip.ZipEngine`

