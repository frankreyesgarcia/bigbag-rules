# API Specification: net.lingala.zip4j:zip4j 2.11.1

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public class `net.lingala.zip4j.ZipFile`
implements `java.io.Closeable`  

**Constructors:**
- `public ZipFile(java.io.File p0)`
- `public ZipFile(java.io.File p0, char[] p1)`
- `public ZipFile(java.lang.String p0)`
- `public ZipFile(java.lang.String p0, char[] p1)`

**Methods:**
- `public void addFile(java.io.File p0) throws net.lingala.zip4j.exception.ZipException`
- `public void addFile(java.io.File p0, net.lingala.zip4j.model.ZipParameters p1) throws net.lingala.zip4j.exception.ZipException`
- `public void addFile(java.lang.String p0) throws net.lingala.zip4j.exception.ZipException`
- `public void addFile(java.lang.String p0, net.lingala.zip4j.model.ZipParameters p1) throws net.lingala.zip4j.exception.ZipException`
- `public void addFiles(java.util.List p0) throws net.lingala.zip4j.exception.ZipException`
- `public void addFiles(java.util.List p0, net.lingala.zip4j.model.ZipParameters p1) throws net.lingala.zip4j.exception.ZipException`
- `public void addFolder(java.io.File p0) throws net.lingala.zip4j.exception.ZipException`
- `public void addFolder(java.io.File p0, net.lingala.zip4j.model.ZipParameters p1) throws net.lingala.zip4j.exception.ZipException`
- `public void addStream(java.io.InputStream p0, net.lingala.zip4j.model.ZipParameters p1) throws net.lingala.zip4j.exception.ZipException`
- `public void close() throws java.io.IOException`
- `public void createSplitZipFile(java.util.List p0, net.lingala.zip4j.model.ZipParameters p1, boolean p2, long p3) throws net.lingala.zip4j.exception.ZipException`
- `public void createSplitZipFileFromFolder(java.io.File p0, net.lingala.zip4j.model.ZipParameters p1, boolean p2, long p3) throws net.lingala.zip4j.exception.ZipException`
- `public void extractAll(java.lang.String p0) throws net.lingala.zip4j.exception.ZipException`
- `public void extractAll(java.lang.String p0, net.lingala.zip4j.model.UnzipParameters p1) throws net.lingala.zip4j.exception.ZipException`
- `public void extractFile(java.lang.String p0, java.lang.String p1) throws net.lingala.zip4j.exception.ZipException`
- `public void extractFile(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws net.lingala.zip4j.exception.ZipException`
- `public void extractFile(java.lang.String p0, java.lang.String p1, java.lang.String p2, net.lingala.zip4j.model.UnzipParameters p3) throws net.lingala.zip4j.exception.ZipException`
- `public void extractFile(java.lang.String p0, java.lang.String p1, net.lingala.zip4j.model.UnzipParameters p2) throws net.lingala.zip4j.exception.ZipException`
- `public void extractFile(net.lingala.zip4j.model.FileHeader p0, java.lang.String p1) throws net.lingala.zip4j.exception.ZipException`
- `public void extractFile(net.lingala.zip4j.model.FileHeader p0, java.lang.String p1, java.lang.String p2) throws net.lingala.zip4j.exception.ZipException`
- `public void extractFile(net.lingala.zip4j.model.FileHeader p0, java.lang.String p1, java.lang.String p2, net.lingala.zip4j.model.UnzipParameters p3) throws net.lingala.zip4j.exception.ZipException`
- `public void extractFile(net.lingala.zip4j.model.FileHeader p0, java.lang.String p1, net.lingala.zip4j.model.UnzipParameters p2) throws net.lingala.zip4j.exception.ZipException`
- `public int getBufferSize()`
- `public java.nio.charset.Charset getCharset()`
- `public java.lang.String getComment() throws net.lingala.zip4j.exception.ZipException`
- `public java.util.concurrent.ExecutorService getExecutorService()`
- `public java.io.File getFile()`
- `public net.lingala.zip4j.model.FileHeader getFileHeader(java.lang.String p0) throws net.lingala.zip4j.exception.ZipException`
- `public java.util.List getFileHeaders() throws net.lingala.zip4j.exception.ZipException`
- `public net.lingala.zip4j.io.inputstream.ZipInputStream getInputStream(net.lingala.zip4j.model.FileHeader p0) throws java.io.IOException`
- `public net.lingala.zip4j.progress.ProgressMonitor getProgressMonitor()`
- `public java.util.List getSplitZipFiles() throws net.lingala.zip4j.exception.ZipException`
- `public boolean isEncrypted() throws net.lingala.zip4j.exception.ZipException`
- `public boolean isRunInThread()`
- `public boolean isSplitArchive() throws net.lingala.zip4j.exception.ZipException`
- `public boolean isUseUtf8CharsetForPasswords()`
- `public boolean isValidZipFile()`
- `public void mergeSplitFiles(java.io.File p0) throws net.lingala.zip4j.exception.ZipException`
- `public void removeFile(java.lang.String p0) throws net.lingala.zip4j.exception.ZipException`
- `public void removeFile(net.lingala.zip4j.model.FileHeader p0) throws net.lingala.zip4j.exception.ZipException`
- `public void removeFiles(java.util.List p0) throws net.lingala.zip4j.exception.ZipException`
- `public void renameFile(java.lang.String p0, java.lang.String p1) throws net.lingala.zip4j.exception.ZipException`
- `public void renameFile(net.lingala.zip4j.model.FileHeader p0, java.lang.String p1) throws net.lingala.zip4j.exception.ZipException`
- `public void renameFiles(java.util.Map p0) throws net.lingala.zip4j.exception.ZipException`
- `public void setBufferSize(int p0)`
- `public void setCharset(java.nio.charset.Charset p0) throws java.lang.IllegalArgumentException`
- `public void setComment(java.lang.String p0) throws net.lingala.zip4j.exception.ZipException`
- `public void setPassword(char[] p0)`
- `public void setRunInThread(boolean p0)`
- `public void setThreadFactory(java.util.concurrent.ThreadFactory p0)`
- `public void setUseUtf8CharsetForPasswords(boolean p0)`
- `public java.lang.String toString()`

---

## public class `net.lingala.zip4j.crypto.AESDecrypter`
implements `net.lingala.zip4j.crypto.Decrypter`  

**Constructors:**
- `public AESDecrypter(net.lingala.zip4j.model.AESExtraDataRecord p0, char[] p1, byte[] p2, byte[] p3, boolean p4) throws net.lingala.zip4j.exception.ZipException`

**Methods:**
- `public int decryptData(byte[] p0, int p1, int p2) throws net.lingala.zip4j.exception.ZipException`
- `public byte[] getCalculatedAuthenticationBytes()`

---

## public class `net.lingala.zip4j.crypto.AESEncrypter`
implements `net.lingala.zip4j.crypto.Encrypter`  

**Constructors:**
- `public AESEncrypter(char[] p0, net.lingala.zip4j.model.enums.AesKeyStrength p1, boolean p2) throws net.lingala.zip4j.exception.ZipException`

**Methods:**
- `public int encryptData(byte[] p0) throws net.lingala.zip4j.exception.ZipException`
- `public int encryptData(byte[] p0, int p1, int p2) throws net.lingala.zip4j.exception.ZipException`
- `public byte[] getDerivedPasswordVerifier()`
- `public byte[] getFinalMac()`
- `public byte[] getSaltBytes()`

---

## public class `net.lingala.zip4j.crypto.AesCipherUtil`

**Constructors:**
- `public AesCipherUtil()`

**Methods:**
- `public static byte[] derivePasswordBasedKey(byte[] p0, char[] p1, net.lingala.zip4j.model.enums.AesKeyStrength p2, boolean p3) throws net.lingala.zip4j.exception.ZipException`
- `public static byte[] derivePasswordVerifier(byte[] p0, net.lingala.zip4j.model.enums.AesKeyStrength p1)`
- `public static net.lingala.zip4j.crypto.engine.AESEngine getAESEngine(byte[] p0, net.lingala.zip4j.model.enums.AesKeyStrength p1) throws net.lingala.zip4j.exception.ZipException`
- `public static net.lingala.zip4j.crypto.PBKDF2.MacBasedPRF getMacBasedPRF(byte[] p0, net.lingala.zip4j.model.enums.AesKeyStrength p1)`
- `public static void prepareBuffAESIVBytes(byte[] p0, int p1)`

---

## public abstract interface `net.lingala.zip4j.crypto.Decrypter`

**Methods:**
- `public abstract int decryptData(byte[] p0, int p1, int p2) throws net.lingala.zip4j.exception.ZipException`

---

## public abstract interface `net.lingala.zip4j.crypto.Encrypter`

**Methods:**
- `public abstract int encryptData(byte[] p0) throws net.lingala.zip4j.exception.ZipException`
- `public abstract int encryptData(byte[] p0, int p1, int p2) throws net.lingala.zip4j.exception.ZipException`

---

## public class `net.lingala.zip4j.crypto.PBKDF2.MacBasedPRF`
implements `net.lingala.zip4j.crypto.PBKDF2.PRF`  

**Constructors:**
- `public MacBasedPRF(java.lang.String p0)`

**Methods:**
- `public byte[] doFinal()`
- `public byte[] doFinal(byte[] p0)`
- `public int getHLen()`
- `public void init(byte[] p0)`
- `public void update(byte[] p0)`
- `public void update(byte[] p0, int p1, int p2)`

---

## public class `net.lingala.zip4j.crypto.PBKDF2.PBKDF2Engine`

**Constructors:**
- `public PBKDF2Engine(net.lingala.zip4j.crypto.PBKDF2.PBKDF2Parameters p0)`
- `public PBKDF2Engine(net.lingala.zip4j.crypto.PBKDF2.PBKDF2Parameters p0, net.lingala.zip4j.crypto.PBKDF2.PRF p1)`

**Methods:**
- `protected void INT(byte[] p0, int p1, int p2)`
- `public byte[] deriveKey(char[] p0, int p1, boolean p2)`
- `public net.lingala.zip4j.crypto.PBKDF2.PBKDF2Parameters getParameters()`
- `public void setParameters(net.lingala.zip4j.crypto.PBKDF2.PBKDF2Parameters p0)`
- `public void setPseudoRandomFunction(net.lingala.zip4j.crypto.PBKDF2.PRF p0)`

---

## public class `net.lingala.zip4j.crypto.PBKDF2.PBKDF2Parameters`

**Constructors:**
- `public PBKDF2Parameters()`
- `public PBKDF2Parameters(java.lang.String p0, java.lang.String p1, byte[] p2, int p3)`
- `public PBKDF2Parameters(java.lang.String p0, java.lang.String p1, byte[] p2, int p3, byte[] p4)`

**Fields:**
- `protected byte[] derivedKey`
- `protected java.lang.String hashAlgorithm`
- `protected java.lang.String hashCharset`
- `protected int iterationCount`
- `protected byte[] salt`

**Methods:**
- `public byte[] getDerivedKey()`
- `public java.lang.String getHashAlgorithm()`
- `public java.lang.String getHashCharset()`
- `public int getIterationCount()`
- `public byte[] getSalt()`
- `public void setDerivedKey(byte[] p0)`
- `public void setHashAlgorithm(java.lang.String p0)`
- `public void setHashCharset(java.lang.String p0)`
- `public void setIterationCount(int p0)`
- `public void setSalt(byte[] p0)`

---

## public class `net.lingala.zip4j.crypto.StandardDecrypter`
implements `net.lingala.zip4j.crypto.Decrypter`  

**Constructors:**
- `public StandardDecrypter(char[] p0, long p1, long p2, byte[] p3, boolean p4) throws net.lingala.zip4j.exception.ZipException`

**Methods:**
- `public int decryptData(byte[] p0, int p1, int p2) throws net.lingala.zip4j.exception.ZipException`

---

## public class `net.lingala.zip4j.crypto.StandardEncrypter`
implements `net.lingala.zip4j.crypto.Encrypter`  

**Constructors:**
- `public StandardEncrypter(char[] p0, long p1, boolean p2) throws net.lingala.zip4j.exception.ZipException`

**Methods:**
- `protected byte encryptByte(byte p0)`
- `public int encryptData(byte[] p0) throws net.lingala.zip4j.exception.ZipException`
- `public int encryptData(byte[] p0, int p1, int p2) throws net.lingala.zip4j.exception.ZipException`
- `protected byte[] generateRandomBytes()`
- `public byte[] getHeaderBytes()`

---

## public class `net.lingala.zip4j.crypto.engine.AESEngine`

**Constructors:**
- `public AESEngine(byte[] p0) throws net.lingala.zip4j.exception.ZipException`

**Methods:**
- `public int processBlock(byte[] p0, byte[] p1) throws net.lingala.zip4j.exception.ZipException`
- `public int processBlock(byte[] p0, int p1, byte[] p2, int p3) throws net.lingala.zip4j.exception.ZipException`

---

## public class `net.lingala.zip4j.crypto.engine.ZipCryptoEngine`

**Constructors:**
- `public ZipCryptoEngine()`

**Methods:**
- `public byte decryptByte()`
- `public void initKeys(char[] p0, boolean p1)`
- `public void updateKeys(byte p0)`

---

## public class `net.lingala.zip4j.exception.ZipException`
extends `java.io.IOException`  

**Constructors:**
- `public ZipException(java.lang.Exception p0)`
- `public ZipException(java.lang.String p0)`
- `public ZipException(java.lang.String p0, java.lang.Exception p1)`
- `public ZipException(java.lang.String p0, java.lang.Throwable p1, net.lingala.zip4j.exception.ZipException$Type p2)`
- `public ZipException(java.lang.String p0, net.lingala.zip4j.exception.ZipException$Type p1)`

**Methods:**
- `public net.lingala.zip4j.exception.ZipException$Type getType()`

---

## public final static enum `net.lingala.zip4j.exception.ZipException$Type`
extends `java.lang.Enum`  

**Fields:**
- `public final static net.lingala.zip4j.exception.ZipException$Type CHECKSUM_MISMATCH`
- `public final static net.lingala.zip4j.exception.ZipException$Type FILE_NOT_FOUND`
- `public final static net.lingala.zip4j.exception.ZipException$Type TASK_CANCELLED_EXCEPTION`
- `public final static net.lingala.zip4j.exception.ZipException$Type UNKNOWN`
- `public final static net.lingala.zip4j.exception.ZipException$Type UNKNOWN_COMPRESSION_METHOD`
- `public final static net.lingala.zip4j.exception.ZipException$Type UNSUPPORTED_ENCRYPTION`
- `public final static net.lingala.zip4j.exception.ZipException$Type WRONG_PASSWORD`

---

## public class `net.lingala.zip4j.headers.FileHeaderFactory`

**Constructors:**
- `public FileHeaderFactory()`

**Methods:**
- `public net.lingala.zip4j.model.FileHeader generateFileHeader(net.lingala.zip4j.model.ZipParameters p0, boolean p1, int p2, java.nio.charset.Charset p3, net.lingala.zip4j.util.RawIO p4) throws net.lingala.zip4j.exception.ZipException`
- `public net.lingala.zip4j.model.LocalFileHeader generateLocalFileHeader(net.lingala.zip4j.model.FileHeader p0)`

---

## public class `net.lingala.zip4j.headers.HeaderReader`

**Constructors:**
- `public HeaderReader()`

**Methods:**
- `public boolean isDirectory(byte[] p0, java.lang.String p1)`
- `public net.lingala.zip4j.model.ZipModel readAllHeaders(java.io.RandomAccessFile p0, net.lingala.zip4j.model.Zip4jConfig p1) throws java.io.IOException`
- `public net.lingala.zip4j.model.DataDescriptor readDataDescriptor(java.io.InputStream p0, boolean p1) throws java.io.IOException`
- `public net.lingala.zip4j.model.LocalFileHeader readLocalFileHeader(java.io.InputStream p0, java.nio.charset.Charset p1) throws java.io.IOException`

---

## public final enum `net.lingala.zip4j.headers.HeaderSignature`
extends `java.lang.Enum`  

**Fields:**
- `public final static net.lingala.zip4j.headers.HeaderSignature AES_EXTRA_DATA_RECORD`
- `public final static net.lingala.zip4j.headers.HeaderSignature ARCEXTDATREC`
- `public final static net.lingala.zip4j.headers.HeaderSignature CENTRAL_DIRECTORY`
- `public final static net.lingala.zip4j.headers.HeaderSignature DIGITAL_SIGNATURE`
- `public final static net.lingala.zip4j.headers.HeaderSignature END_OF_CENTRAL_DIRECTORY`
- `public final static net.lingala.zip4j.headers.HeaderSignature EXTRA_DATA_RECORD`
- `public final static net.lingala.zip4j.headers.HeaderSignature LOCAL_FILE_HEADER`
- `public final static net.lingala.zip4j.headers.HeaderSignature SPLIT_ZIP`
- `public final static net.lingala.zip4j.headers.HeaderSignature TEMPORARY_SPANNING_MARKER`
- `public final static net.lingala.zip4j.headers.HeaderSignature ZIP64_END_CENTRAL_DIRECTORY_LOCATOR`
- `public final static net.lingala.zip4j.headers.HeaderSignature ZIP64_END_CENTRAL_DIRECTORY_RECORD`
- `public final static net.lingala.zip4j.headers.HeaderSignature ZIP64_EXTRA_FIELD_SIGNATURE`

**Methods:**
- `public long getValue()`

---

## public class `net.lingala.zip4j.headers.HeaderUtil`

**Constructors:**
- `public HeaderUtil()`

**Methods:**
- `public static java.lang.String decodeStringWithCharset(byte[] p0, boolean p1, java.nio.charset.Charset p2)`
- `public static byte[] getBytesFromString(java.lang.String p0, java.nio.charset.Charset p1)`
- `public static net.lingala.zip4j.model.FileHeader getFileHeader(net.lingala.zip4j.model.ZipModel p0, java.lang.String p1) throws net.lingala.zip4j.exception.ZipException`
- `public static java.util.List getFileHeadersUnderDirectory(java.util.List p0, java.lang.String p1)`
- `public static long getOffsetStartOfCentralDirectory(net.lingala.zip4j.model.ZipModel p0)`
- `public static long getTotalUncompressedSizeOfAllFileHeaders(java.util.List p0)`

---

## public class `net.lingala.zip4j.headers.HeaderWriter`

**Constructors:**
- `public HeaderWriter()`

**Methods:**
- `public void finalizeZipFile(net.lingala.zip4j.model.ZipModel p0, java.io.OutputStream p1, java.nio.charset.Charset p2) throws java.io.IOException`
- `public void finalizeZipFileWithoutValidations(net.lingala.zip4j.model.ZipModel p0, java.io.OutputStream p1, java.nio.charset.Charset p2) throws java.io.IOException`
- `public void updateLocalFileHeader(net.lingala.zip4j.model.FileHeader p0, net.lingala.zip4j.model.ZipModel p1, net.lingala.zip4j.io.outputstream.SplitOutputStream p2) throws java.io.IOException`
- `public void writeExtendedLocalHeader(net.lingala.zip4j.model.LocalFileHeader p0, java.io.OutputStream p1) throws java.io.IOException`
- `public void writeLocalFileHeader(net.lingala.zip4j.model.ZipModel p0, net.lingala.zip4j.model.LocalFileHeader p1, java.io.OutputStream p2, java.nio.charset.Charset p3) throws java.io.IOException`

---

## public final enum `net.lingala.zip4j.headers.VersionMadeBy`
extends `java.lang.Enum`  

**Fields:**
- `public final static net.lingala.zip4j.headers.VersionMadeBy SPECIFICATION_VERSION`
- `public final static net.lingala.zip4j.headers.VersionMadeBy UNIX`
- `public final static net.lingala.zip4j.headers.VersionMadeBy WINDOWS`

**Methods:**
- `public byte getCode()`

---

## public final enum `net.lingala.zip4j.headers.VersionNeededToExtract`
extends `java.lang.Enum`  

**Fields:**
- `public final static net.lingala.zip4j.headers.VersionNeededToExtract AES_ENCRYPTED`
- `public final static net.lingala.zip4j.headers.VersionNeededToExtract DEFAULT`
- `public final static net.lingala.zip4j.headers.VersionNeededToExtract DEFLATE_COMPRESSED`
- `public final static net.lingala.zip4j.headers.VersionNeededToExtract ZIP_64_FORMAT`

**Methods:**
- `public int getCode()`

---

## public class `net.lingala.zip4j.io.inputstream.InflaterInputStream`
extends `net.lingala.zip4j.io.inputstream.DecompressedInputStream`  

**Constructors:**
- `public InflaterInputStream(net.lingala.zip4j.io.inputstream.CipherInputStream p0, int p1)`

**Methods:**
- `public void close() throws java.io.IOException`
- `public void endOfEntryReached(java.io.InputStream p0) throws java.io.IOException`
- `public void pushBackInputStreamIfNecessary(java.io.PushbackInputStream p0) throws java.io.IOException`
- `public int read() throws java.io.IOException`
- `public int read(byte[] p0) throws java.io.IOException`
- `public int read(byte[] p0, int p1, int p2) throws java.io.IOException`

---

## public class `net.lingala.zip4j.io.inputstream.NumberedSplitFileInputStream`
extends `net.lingala.zip4j.io.inputstream.SplitFileInputStream`  

**Constructors:**
- `public NumberedSplitFileInputStream(java.io.File p0) throws java.io.IOException`

**Methods:**
- `public void close() throws java.io.IOException`
- `public void prepareExtractionForFileHeader(net.lingala.zip4j.model.FileHeader p0) throws java.io.IOException`
- `public int read() throws java.io.IOException`
- `public int read(byte[] p0) throws java.io.IOException`
- `public int read(byte[] p0, int p1, int p2) throws java.io.IOException`

---

## public class `net.lingala.zip4j.io.inputstream.NumberedSplitRandomAccessFile`
extends `java.io.RandomAccessFile`  

**Constructors:**
- `public NumberedSplitRandomAccessFile(java.io.File p0, java.lang.String p1) throws java.io.IOException`
- `public NumberedSplitRandomAccessFile(java.io.File p0, java.lang.String p1, java.io.File[] p2) throws java.io.IOException`
- `public NumberedSplitRandomAccessFile(java.lang.String p0, java.lang.String p1) throws java.io.IOException`

**Methods:**
- `public void close() throws java.io.IOException`
- `public long getFilePointer() throws java.io.IOException`
- `public long length() throws java.io.IOException`
- `public void openLastSplitFileForReading() throws java.io.IOException`
- `public int read() throws java.io.IOException`
- `public int read(byte[] p0) throws java.io.IOException`
- `public int read(byte[] p0, int p1, int p2) throws java.io.IOException`
- `public void seek(long p0) throws java.io.IOException`
- `public void seekInCurrentPart(long p0) throws java.io.IOException`
- `public void write(byte[] p0) throws java.io.IOException`
- `public void write(byte[] p0, int p1, int p2) throws java.io.IOException`
- `public void write(int p0) throws java.io.IOException`

---

## public abstract class `net.lingala.zip4j.io.inputstream.SplitFileInputStream`
extends `java.io.InputStream`  

**Constructors:**
- `public SplitFileInputStream()`

**Methods:**
- `public abstract void prepareExtractionForFileHeader(net.lingala.zip4j.model.FileHeader p0) throws java.io.IOException`

---

## public class `net.lingala.zip4j.io.inputstream.ZipInputStream`
extends `java.io.InputStream`  

**Constructors:**
- `public ZipInputStream(java.io.InputStream p0)`
- `public ZipInputStream(java.io.InputStream p0, char[] p1)`
- `public ZipInputStream(java.io.InputStream p0, char[] p1, java.nio.charset.Charset p2)`
- `public ZipInputStream(java.io.InputStream p0, char[] p1, net.lingala.zip4j.model.Zip4jConfig p2)`
- `public ZipInputStream(java.io.InputStream p0, java.nio.charset.Charset p1)`
- `public ZipInputStream(java.io.InputStream p0, net.lingala.zip4j.util.PasswordCallback p1)`
- `public ZipInputStream(java.io.InputStream p0, net.lingala.zip4j.util.PasswordCallback p1, java.nio.charset.Charset p2)`
- `public ZipInputStream(java.io.InputStream p0, net.lingala.zip4j.util.PasswordCallback p1, net.lingala.zip4j.model.Zip4jConfig p2)`

**Methods:**
- `public int available() throws java.io.IOException`
- `public void close() throws java.io.IOException`
- `public net.lingala.zip4j.model.LocalFileHeader getNextEntry() throws java.io.IOException`
- `public net.lingala.zip4j.model.LocalFileHeader getNextEntry(net.lingala.zip4j.model.FileHeader p0, boolean p1) throws java.io.IOException`
- `public int read() throws java.io.IOException`
- `public int read(byte[] p0) throws java.io.IOException`
- `public int read(byte[] p0, int p1, int p2) throws java.io.IOException`
- `public void setPassword(char[] p0)`

---

## public class `net.lingala.zip4j.io.inputstream.ZipStandardSplitFileInputStream`
extends `net.lingala.zip4j.io.inputstream.SplitFileInputStream`  

**Constructors:**
- `public ZipStandardSplitFileInputStream(java.io.File p0, boolean p1, int p2) throws java.io.FileNotFoundException`

**Fields:**
- `protected java.io.RandomAccessFile randomAccessFile`
- `protected java.io.File zipFile`

**Methods:**
- `public void close() throws java.io.IOException`
- `protected java.io.File getNextSplitFile(int p0) throws java.io.IOException`
- `protected void openRandomAccessFileForIndex(int p0) throws java.io.IOException`
- `public void prepareExtractionForFileHeader(net.lingala.zip4j.model.FileHeader p0) throws java.io.IOException`
- `public int read() throws java.io.IOException`
- `public int read(byte[] p0) throws java.io.IOException`
- `public int read(byte[] p0, int p1, int p2) throws java.io.IOException`

---

## public class `net.lingala.zip4j.io.outputstream.CountingOutputStream`
extends `java.io.OutputStream`  
implements `net.lingala.zip4j.io.outputstream.OutputStreamWithSplitZipSupport`  

**Constructors:**
- `public CountingOutputStream(java.io.OutputStream p0)`

**Methods:**
- `public boolean checkBuffSizeAndStartNextSplitFile(int p0) throws net.lingala.zip4j.exception.ZipException`
- `public void close() throws java.io.IOException`
- `public int getCurrentSplitFileCounter()`
- `public long getFilePointer() throws java.io.IOException`
- `public long getNumberOfBytesWritten() throws java.io.IOException`
- `public long getOffsetForNextEntry() throws java.io.IOException`
- `public long getSplitLength()`
- `public boolean isSplitZipFile()`
- `public void write(byte[] p0) throws java.io.IOException`
- `public void write(byte[] p0, int p1, int p2) throws java.io.IOException`
- `public void write(int p0) throws java.io.IOException`

---

## public abstract interface `net.lingala.zip4j.io.outputstream.OutputStreamWithSplitZipSupport`

**Methods:**
- `public abstract int getCurrentSplitFileCounter()`
- `public abstract long getFilePointer() throws java.io.IOException`

---

## public class `net.lingala.zip4j.io.outputstream.SplitOutputStream`
extends `java.io.OutputStream`  
implements `net.lingala.zip4j.io.outputstream.OutputStreamWithSplitZipSupport`  

**Constructors:**
- `public SplitOutputStream(java.io.File p0) throws java.io.FileNotFoundException, net.lingala.zip4j.exception.ZipException`
- `public SplitOutputStream(java.io.File p0, long p1) throws java.io.FileNotFoundException, net.lingala.zip4j.exception.ZipException`

**Methods:**
- `public boolean checkBufferSizeAndStartNextSplitFile(int p0) throws net.lingala.zip4j.exception.ZipException`
- `public void close() throws java.io.IOException`
- `public int getCurrentSplitFileCounter()`
- `public long getFilePointer() throws java.io.IOException`
- `public long getSplitLength()`
- `public boolean isSplitZipFile()`
- `public void seek(long p0) throws java.io.IOException`
- `public int skipBytes(int p0) throws java.io.IOException`
- `public void write(byte[] p0) throws java.io.IOException`
- `public void write(byte[] p0, int p1, int p2) throws java.io.IOException`
- `public void write(int p0) throws java.io.IOException`

---

## public class `net.lingala.zip4j.io.outputstream.ZipOutputStream`
extends `java.io.OutputStream`  

**Constructors:**
- `public ZipOutputStream(java.io.OutputStream p0) throws java.io.IOException`
- `public ZipOutputStream(java.io.OutputStream p0, char[] p1) throws java.io.IOException`
- `public ZipOutputStream(java.io.OutputStream p0, char[] p1, java.nio.charset.Charset p2) throws java.io.IOException`
- `public ZipOutputStream(java.io.OutputStream p0, char[] p1, net.lingala.zip4j.model.Zip4jConfig p2, net.lingala.zip4j.model.ZipModel p3) throws java.io.IOException`
- `public ZipOutputStream(java.io.OutputStream p0, java.nio.charset.Charset p1) throws java.io.IOException`

**Methods:**
- `public void close() throws java.io.IOException`
- `public net.lingala.zip4j.model.FileHeader closeEntry() throws java.io.IOException`
- `public void putNextEntry(net.lingala.zip4j.model.ZipParameters p0) throws java.io.IOException`
- `public void setComment(java.lang.String p0) throws java.io.IOException`
- `public void write(byte[] p0) throws java.io.IOException`
- `public void write(byte[] p0, int p1, int p2) throws java.io.IOException`
- `public void write(int p0) throws java.io.IOException`

---

## public class `net.lingala.zip4j.model.AESExtraDataRecord`
extends `net.lingala.zip4j.model.ZipHeader`  

**Constructors:**
- `public AESExtraDataRecord()`

**Methods:**
- `public net.lingala.zip4j.model.enums.AesKeyStrength getAesKeyStrength()`
- `public net.lingala.zip4j.model.enums.AesVersion getAesVersion()`
- `public net.lingala.zip4j.model.enums.CompressionMethod getCompressionMethod()`
- `public int getDataSize()`
- `public java.lang.String getVendorID()`
- `public void setAesKeyStrength(net.lingala.zip4j.model.enums.AesKeyStrength p0)`
- `public void setAesVersion(net.lingala.zip4j.model.enums.AesVersion p0)`
- `public void setCompressionMethod(net.lingala.zip4j.model.enums.CompressionMethod p0)`
- `public void setDataSize(int p0)`
- `public void setVendorID(java.lang.String p0)`

---

## public abstract class `net.lingala.zip4j.model.AbstractFileHeader`
extends `net.lingala.zip4j.model.ZipHeader`  

**Constructors:**
- `public AbstractFileHeader()`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public net.lingala.zip4j.model.AESExtraDataRecord getAesExtraDataRecord()`
- `public long getCompressedSize()`
- `public net.lingala.zip4j.model.enums.CompressionMethod getCompressionMethod()`
- `public long getCrc()`
- `public net.lingala.zip4j.model.enums.EncryptionMethod getEncryptionMethod()`
- `public java.util.List getExtraDataRecords()`
- `public int getExtraFieldLength()`
- `public java.lang.String getFileName()`
- `public int getFileNameLength()`
- `public byte[] getGeneralPurposeFlag()`
- `public long getLastModifiedTime()`
- `public long getLastModifiedTimeEpoch()`
- `public long getUncompressedSize()`
- `public int getVersionNeededToExtract()`
- `public net.lingala.zip4j.model.Zip64ExtendedInfo getZip64ExtendedInfo()`
- `public boolean isDataDescriptorExists()`
- `public boolean isDirectory()`
- `public boolean isEncrypted()`
- `public boolean isFileNameUTF8Encoded()`
- `public void setAesExtraDataRecord(net.lingala.zip4j.model.AESExtraDataRecord p0)`
- `public void setCompressedSize(long p0)`
- `public void setCompressionMethod(net.lingala.zip4j.model.enums.CompressionMethod p0)`
- `public void setCrc(long p0)`
- `public void setDataDescriptorExists(boolean p0)`
- `public void setDirectory(boolean p0)`
- `public void setEncrypted(boolean p0)`
- `public void setEncryptionMethod(net.lingala.zip4j.model.enums.EncryptionMethod p0)`
- `public void setExtraDataRecords(java.util.List p0)`
- `public void setExtraFieldLength(int p0)`
- `public void setFileName(java.lang.String p0)`
- `public void setFileNameLength(int p0)`
- `public void setFileNameUTF8Encoded(boolean p0)`
- `public void setGeneralPurposeFlag(byte[] p0)`
- `public void setLastModifiedTime(long p0)`
- `public void setUncompressedSize(long p0)`
- `public void setVersionNeededToExtract(int p0)`
- `public void setZip64ExtendedInfo(net.lingala.zip4j.model.Zip64ExtendedInfo p0)`

---

## public class `net.lingala.zip4j.model.ArchiveExtraDataRecord`
extends `net.lingala.zip4j.model.ZipHeader`  

**Constructors:**
- `public ArchiveExtraDataRecord()`

**Methods:**
- `public java.lang.String getExtraFieldData()`
- `public int getExtraFieldLength()`
- `public void setExtraFieldData(java.lang.String p0)`
- `public void setExtraFieldLength(int p0)`

---

## public class `net.lingala.zip4j.model.CentralDirectory`

**Constructors:**
- `public CentralDirectory()`

**Methods:**
- `public net.lingala.zip4j.model.DigitalSignature getDigitalSignature()`
- `public java.util.List getFileHeaders()`
- `public void setDigitalSignature(net.lingala.zip4j.model.DigitalSignature p0)`
- `public void setFileHeaders(java.util.List p0)`

---

## public class `net.lingala.zip4j.model.DataDescriptor`
extends `net.lingala.zip4j.model.ZipHeader`  

**Constructors:**
- `public DataDescriptor()`

**Methods:**
- `public long getCompressedSize()`
- `public long getCrc()`
- `public long getUncompressedSize()`
- `public void setCompressedSize(long p0)`
- `public void setCrc(long p0)`
- `public void setUncompressedSize(long p0)`

---

## public class `net.lingala.zip4j.model.DigitalSignature`
extends `net.lingala.zip4j.model.ZipHeader`  

**Constructors:**
- `public DigitalSignature()`

**Methods:**
- `public java.lang.String getSignatureData()`
- `public int getSizeOfData()`
- `public void setSignatureData(java.lang.String p0)`
- `public void setSizeOfData(int p0)`

---

## public class `net.lingala.zip4j.model.EndOfCentralDirectoryRecord`
extends `net.lingala.zip4j.model.ZipHeader`  

**Constructors:**
- `public EndOfCentralDirectoryRecord()`

**Methods:**
- `public java.lang.String getComment()`
- `public int getNumberOfThisDisk()`
- `public int getNumberOfThisDiskStartOfCentralDir()`
- `public long getOffsetOfEndOfCentralDirectory()`
- `public long getOffsetOfStartOfCentralDirectory()`
- `public int getSizeOfCentralDirectory()`
- `public int getTotalNumberOfEntriesInCentralDirectory()`
- `public int getTotalNumberOfEntriesInCentralDirectoryOnThisDisk()`
- `public void setComment(java.lang.String p0)`
- `public void setNumberOfThisDisk(int p0)`
- `public void setNumberOfThisDiskStartOfCentralDir(int p0)`
- `public void setOffsetOfEndOfCentralDirectory(long p0)`
- `public void setOffsetOfStartOfCentralDirectory(long p0)`
- `public void setSizeOfCentralDirectory(int p0)`
- `public void setTotalNumberOfEntriesInCentralDirectory(int p0)`
- `public void setTotalNumberOfEntriesInCentralDirectoryOnThisDisk(int p0)`

---

## public abstract interface `net.lingala.zip4j.model.ExcludeFileFilter`

**Methods:**
- `public abstract boolean isExcluded(java.io.File p0)`

---

## public class `net.lingala.zip4j.model.ExtraDataRecord`
extends `net.lingala.zip4j.model.ZipHeader`  

**Constructors:**
- `public ExtraDataRecord()`

**Methods:**
- `public byte[] getData()`
- `public long getHeader()`
- `public int getSizeOfData()`
- `public void setData(byte[] p0)`
- `public void setHeader(long p0)`
- `public void setSizeOfData(int p0)`

---

## public class `net.lingala.zip4j.model.FileHeader`
extends `net.lingala.zip4j.model.AbstractFileHeader`  

**Constructors:**
- `public FileHeader()`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int getDiskNumberStart()`
- `public byte[] getExternalFileAttributes()`
- `public java.lang.String getFileComment()`
- `public int getFileCommentLength()`
- `public byte[] getInternalFileAttributes()`
- `public long getOffsetLocalHeader()`
- `public int getVersionMadeBy()`
- `public int hashCode()`
- `public void setDiskNumberStart(int p0)`
- `public void setExternalFileAttributes(byte[] p0)`
- `public void setFileComment(java.lang.String p0)`
- `public void setFileCommentLength(int p0)`
- `public void setInternalFileAttributes(byte[] p0)`
- `public void setOffsetLocalHeader(long p0)`
- `public void setVersionMadeBy(int p0)`
- `public java.lang.String toString()`

---

## public class `net.lingala.zip4j.model.LocalFileHeader`
extends `net.lingala.zip4j.model.AbstractFileHeader`  

**Constructors:**
- `public LocalFileHeader()`

**Methods:**
- `public byte[] getExtraField()`
- `public long getOffsetStartOfData()`
- `public boolean isWriteCompressedSizeInZip64ExtraRecord()`
- `public void setExtraField(byte[] p0)`
- `public void setOffsetStartOfData(long p0)`
- `public void setWriteCompressedSizeInZip64ExtraRecord(boolean p0)`

---

## public class `net.lingala.zip4j.model.UnzipParameters`

**Constructors:**
- `public UnzipParameters()`

**Methods:**
- `public boolean isExtractSymbolicLinks()`
- `public void setExtractSymbolicLinks(boolean p0)`

---

## public class `net.lingala.zip4j.model.Zip4jConfig`

**Constructors:**
- `public Zip4jConfig(java.nio.charset.Charset p0, int p1, boolean p2)`

**Methods:**
- `public int getBufferSize()`
- `public java.nio.charset.Charset getCharset()`
- `public boolean isUseUtf8CharsetForPasswords()`

---

## public class `net.lingala.zip4j.model.Zip64EndOfCentralDirectoryLocator`
extends `net.lingala.zip4j.model.ZipHeader`  

**Constructors:**
- `public Zip64EndOfCentralDirectoryLocator()`

**Methods:**
- `public int getNumberOfDiskStartOfZip64EndOfCentralDirectoryRecord()`
- `public long getOffsetZip64EndOfCentralDirectoryRecord()`
- `public int getTotalNumberOfDiscs()`
- `public void setNumberOfDiskStartOfZip64EndOfCentralDirectoryRecord(int p0)`
- `public void setOffsetZip64EndOfCentralDirectoryRecord(long p0)`
- `public void setTotalNumberOfDiscs(int p0)`

---

## public class `net.lingala.zip4j.model.Zip64EndOfCentralDirectoryRecord`
extends `net.lingala.zip4j.model.ZipHeader`  

**Constructors:**
- `public Zip64EndOfCentralDirectoryRecord()`

**Methods:**
- `public byte[] getExtensibleDataSector()`
- `public int getNumberOfThisDisk()`
- `public int getNumberOfThisDiskStartOfCentralDirectory()`
- `public long getOffsetStartCentralDirectoryWRTStartDiskNumber()`
- `public long getSizeOfCentralDirectory()`
- `public long getSizeOfZip64EndCentralDirectoryRecord()`
- `public long getTotalNumberOfEntriesInCentralDirectory()`
- `public long getTotalNumberOfEntriesInCentralDirectoryOnThisDisk()`
- `public int getVersionMadeBy()`
- `public int getVersionNeededToExtract()`
- `public void setExtensibleDataSector(byte[] p0)`
- `public void setNumberOfThisDisk(int p0)`
- `public void setNumberOfThisDiskStartOfCentralDirectory(int p0)`
- `public void setOffsetStartCentralDirectoryWRTStartDiskNumber(long p0)`
- `public void setSizeOfCentralDirectory(long p0)`
- `public void setSizeOfZip64EndCentralDirectoryRecord(long p0)`
- `public void setTotalNumberOfEntriesInCentralDirectory(long p0)`
- `public void setTotalNumberOfEntriesInCentralDirectoryOnThisDisk(long p0)`
- `public void setVersionMadeBy(int p0)`
- `public void setVersionNeededToExtract(int p0)`

---

## public class `net.lingala.zip4j.model.Zip64ExtendedInfo`
extends `net.lingala.zip4j.model.ZipHeader`  

**Constructors:**
- `public Zip64ExtendedInfo()`

**Methods:**
- `public long getCompressedSize()`
- `public int getDiskNumberStart()`
- `public long getOffsetLocalHeader()`
- `public int getSize()`
- `public long getUncompressedSize()`
- `public void setCompressedSize(long p0)`
- `public void setDiskNumberStart(int p0)`
- `public void setOffsetLocalHeader(long p0)`
- `public void setSize(int p0)`
- `public void setUncompressedSize(long p0)`

---

## public abstract class `net.lingala.zip4j.model.ZipHeader`

**Constructors:**
- `public ZipHeader()`

**Methods:**
- `public net.lingala.zip4j.headers.HeaderSignature getSignature()`
- `public void setSignature(net.lingala.zip4j.headers.HeaderSignature p0)`

---

## public class `net.lingala.zip4j.model.ZipModel`
implements `java.lang.Cloneable`  

**Constructors:**
- `public ZipModel()`

**Methods:**
- `public java.lang.Object clone() throws java.lang.CloneNotSupportedException`
- `public net.lingala.zip4j.model.ArchiveExtraDataRecord getArchiveExtraDataRecord()`
- `public net.lingala.zip4j.model.CentralDirectory getCentralDirectory()`
- `public java.util.List getDataDescriptors()`
- `public long getEnd()`
- `public net.lingala.zip4j.model.EndOfCentralDirectoryRecord getEndOfCentralDirectoryRecord()`
- `public java.util.List getLocalFileHeaders()`
- `public long getSplitLength()`
- `public long getStart()`
- `public net.lingala.zip4j.model.Zip64EndOfCentralDirectoryLocator getZip64EndOfCentralDirectoryLocator()`
- `public net.lingala.zip4j.model.Zip64EndOfCentralDirectoryRecord getZip64EndOfCentralDirectoryRecord()`
- `public java.io.File getZipFile()`
- `public boolean isNestedZipFile()`
- `public boolean isSplitArchive()`
- `public boolean isZip64Format()`
- `public void setArchiveExtraDataRecord(net.lingala.zip4j.model.ArchiveExtraDataRecord p0)`
- `public void setCentralDirectory(net.lingala.zip4j.model.CentralDirectory p0)`
- `public void setDataDescriptors(java.util.List p0)`
- `public void setEnd(long p0)`
- `public void setEndOfCentralDirectoryRecord(net.lingala.zip4j.model.EndOfCentralDirectoryRecord p0)`
- `public void setLocalFileHeaders(java.util.List p0)`
- `public void setNestedZipFile(boolean p0)`
- `public void setSplitArchive(boolean p0)`
- `public void setSplitLength(long p0)`
- `public void setStart(long p0)`
- `public void setZip64EndOfCentralDirectoryLocator(net.lingala.zip4j.model.Zip64EndOfCentralDirectoryLocator p0)`
- `public void setZip64EndOfCentralDirectoryRecord(net.lingala.zip4j.model.Zip64EndOfCentralDirectoryRecord p0)`
- `public void setZip64Format(boolean p0)`
- `public void setZipFile(java.io.File p0)`

---

## public class `net.lingala.zip4j.model.ZipParameters`

**Constructors:**
- `public ZipParameters()`
- `public ZipParameters(net.lingala.zip4j.model.ZipParameters p0)`

**Methods:**
- `public net.lingala.zip4j.model.enums.AesKeyStrength getAesKeyStrength()`
- `public net.lingala.zip4j.model.enums.AesVersion getAesVersion()`
- `public net.lingala.zip4j.model.enums.CompressionLevel getCompressionLevel()`
- `public net.lingala.zip4j.model.enums.CompressionMethod getCompressionMethod()`
- `public java.lang.String getDefaultFolderPath()`
- `public net.lingala.zip4j.model.enums.EncryptionMethod getEncryptionMethod()`
- `public long getEntryCRC()`
- `public long getEntrySize()`
- `public net.lingala.zip4j.model.ExcludeFileFilter getExcludeFileFilter()`
- `public java.lang.String getFileComment()`
- `public java.lang.String getFileNameInZip()`
- `public long getLastModifiedFileTime()`
- `public java.lang.String getRootFolderNameInZip()`
- `public net.lingala.zip4j.model.ZipParameters$SymbolicLinkAction getSymbolicLinkAction()`
- `public boolean isEncryptFiles()`
- `public boolean isIncludeRootFolder()`
- `public boolean isOverrideExistingFilesInZip()`
- `public boolean isReadHiddenFiles()`
- `public boolean isReadHiddenFolders()`
- `public boolean isUnixMode()`
- `public boolean isWriteExtendedLocalFileHeader()`
- `public void setAesKeyStrength(net.lingala.zip4j.model.enums.AesKeyStrength p0)`
- `public void setAesVersion(net.lingala.zip4j.model.enums.AesVersion p0)`
- `public void setCompressionLevel(net.lingala.zip4j.model.enums.CompressionLevel p0)`
- `public void setCompressionMethod(net.lingala.zip4j.model.enums.CompressionMethod p0)`
- `public void setDefaultFolderPath(java.lang.String p0)`
- `public void setEncryptFiles(boolean p0)`
- `public void setEncryptionMethod(net.lingala.zip4j.model.enums.EncryptionMethod p0)`
- `public void setEntryCRC(long p0)`
- `public void setEntrySize(long p0)`
- `public void setExcludeFileFilter(net.lingala.zip4j.model.ExcludeFileFilter p0)`
- `public void setFileComment(java.lang.String p0)`
- `public void setFileNameInZip(java.lang.String p0)`
- `public void setIncludeRootFolder(boolean p0)`
- `public void setLastModifiedFileTime(long p0)`
- `public void setOverrideExistingFilesInZip(boolean p0)`
- `public void setReadHiddenFiles(boolean p0)`
- `public void setReadHiddenFolders(boolean p0)`
- `public void setRootFolderNameInZip(java.lang.String p0)`
- `public void setSymbolicLinkAction(net.lingala.zip4j.model.ZipParameters$SymbolicLinkAction p0)`
- `public void setUnixMode(boolean p0)`
- `public void setWriteExtendedLocalFileHeader(boolean p0)`

---

## public final static enum `net.lingala.zip4j.model.ZipParameters$SymbolicLinkAction`
extends `java.lang.Enum`  

**Fields:**
- `public final static net.lingala.zip4j.model.ZipParameters$SymbolicLinkAction INCLUDE_LINKED_FILE_ONLY`
- `public final static net.lingala.zip4j.model.ZipParameters$SymbolicLinkAction INCLUDE_LINK_AND_LINKED_FILE`
- `public final static net.lingala.zip4j.model.ZipParameters$SymbolicLinkAction INCLUDE_LINK_ONLY`

---

## public final enum `net.lingala.zip4j.model.enums.AesKeyStrength`
extends `java.lang.Enum`  

**Fields:**
- `public final static net.lingala.zip4j.model.enums.AesKeyStrength KEY_STRENGTH_128`
- `public final static net.lingala.zip4j.model.enums.AesKeyStrength KEY_STRENGTH_192`
- `public final static net.lingala.zip4j.model.enums.AesKeyStrength KEY_STRENGTH_256`

**Methods:**
- `public static net.lingala.zip4j.model.enums.AesKeyStrength getAesKeyStrengthFromRawCode(int p0)`
- `public int getKeyLength()`
- `public int getMacLength()`
- `public int getRawCode()`
- `public int getSaltLength()`

---

## public final enum `net.lingala.zip4j.model.enums.AesVersion`
extends `java.lang.Enum`  

**Fields:**
- `public final static net.lingala.zip4j.model.enums.AesVersion ONE`
- `public final static net.lingala.zip4j.model.enums.AesVersion TWO`

**Methods:**
- `public static net.lingala.zip4j.model.enums.AesVersion getFromVersionNumber(int p0) throws net.lingala.zip4j.exception.ZipException`
- `public int getVersionNumber()`

---

## public final enum `net.lingala.zip4j.model.enums.CompressionLevel`
extends `java.lang.Enum`  

**Fields:**
- `public final static net.lingala.zip4j.model.enums.CompressionLevel FAST`
- `public final static net.lingala.zip4j.model.enums.CompressionLevel FASTER`
- `public final static net.lingala.zip4j.model.enums.CompressionLevel FASTEST`
- `public final static net.lingala.zip4j.model.enums.CompressionLevel HIGHER`
- `public final static net.lingala.zip4j.model.enums.CompressionLevel MAXIMUM`
- `public final static net.lingala.zip4j.model.enums.CompressionLevel MEDIUM_FAST`
- `public final static net.lingala.zip4j.model.enums.CompressionLevel NORMAL`
- `public final static net.lingala.zip4j.model.enums.CompressionLevel NO_COMPRESSION`
- `public final static net.lingala.zip4j.model.enums.CompressionLevel PRE_ULTRA`
- `public final static net.lingala.zip4j.model.enums.CompressionLevel ULTRA`

**Methods:**
- `public int getLevel()`

---

## public final enum `net.lingala.zip4j.model.enums.CompressionMethod`
extends `java.lang.Enum`  

**Fields:**
- `public final static net.lingala.zip4j.model.enums.CompressionMethod AES_INTERNAL_ONLY`
- `public final static net.lingala.zip4j.model.enums.CompressionMethod DEFLATE`
- `public final static net.lingala.zip4j.model.enums.CompressionMethod STORE`

**Methods:**
- `public int getCode()`
- `public static net.lingala.zip4j.model.enums.CompressionMethod getCompressionMethodFromCode(int p0) throws net.lingala.zip4j.exception.ZipException`

---

## public final enum `net.lingala.zip4j.model.enums.EncryptionMethod`
extends `java.lang.Enum`  

**Fields:**
- `public final static net.lingala.zip4j.model.enums.EncryptionMethod AES`
- `public final static net.lingala.zip4j.model.enums.EncryptionMethod NONE`
- `public final static net.lingala.zip4j.model.enums.EncryptionMethod ZIP_STANDARD`
- `public final static net.lingala.zip4j.model.enums.EncryptionMethod ZIP_STANDARD_VARIANT_STRONG`

---

## public final enum `net.lingala.zip4j.model.enums.RandomAccessFileMode`
extends `java.lang.Enum`  

**Fields:**
- `public final static net.lingala.zip4j.model.enums.RandomAccessFileMode READ`
- `public final static net.lingala.zip4j.model.enums.RandomAccessFileMode WRITE`

**Methods:**
- `public java.lang.String getValue()`

---

## public class `net.lingala.zip4j.progress.ProgressMonitor`

**Constructors:**
- `public ProgressMonitor()`

**Methods:**
- `public void endProgressMonitor()`
- `public void endProgressMonitor(java.lang.Exception p0)`
- `public void fullReset()`
- `public net.lingala.zip4j.progress.ProgressMonitor$Task getCurrentTask()`
- `public java.lang.Exception getException()`
- `public java.lang.String getFileName()`
- `public int getPercentDone()`
- `public net.lingala.zip4j.progress.ProgressMonitor$Result getResult()`
- `public net.lingala.zip4j.progress.ProgressMonitor$State getState()`
- `public long getTotalWork()`
- `public long getWorkCompleted()`
- `public boolean isCancelAllTasks()`
- `public boolean isPause()`
- `public void setCancelAllTasks(boolean p0)`
- `public void setCurrentTask(net.lingala.zip4j.progress.ProgressMonitor$Task p0)`
- `public void setException(java.lang.Exception p0)`
- `public void setFileName(java.lang.String p0)`
- `public void setPause(boolean p0)`
- `public void setPercentDone(int p0)`
- `public void setResult(net.lingala.zip4j.progress.ProgressMonitor$Result p0)`
- `public void setState(net.lingala.zip4j.progress.ProgressMonitor$State p0)`
- `public void setTotalWork(long p0)`
- `public void updateWorkCompleted(long p0)`

---

## public final static enum `net.lingala.zip4j.progress.ProgressMonitor$Result`
extends `java.lang.Enum`  

**Fields:**
- `public final static net.lingala.zip4j.progress.ProgressMonitor$Result CANCELLED`
- `public final static net.lingala.zip4j.progress.ProgressMonitor$Result ERROR`
- `public final static net.lingala.zip4j.progress.ProgressMonitor$Result SUCCESS`
- `public final static net.lingala.zip4j.progress.ProgressMonitor$Result WORK_IN_PROGRESS`

---

## public final static enum `net.lingala.zip4j.progress.ProgressMonitor$State`
extends `java.lang.Enum`  

**Fields:**
- `public final static net.lingala.zip4j.progress.ProgressMonitor$State BUSY`
- `public final static net.lingala.zip4j.progress.ProgressMonitor$State READY`

---

## public final static enum `net.lingala.zip4j.progress.ProgressMonitor$Task`
extends `java.lang.Enum`  

**Fields:**
- `public final static net.lingala.zip4j.progress.ProgressMonitor$Task ADD_ENTRY`
- `public final static net.lingala.zip4j.progress.ProgressMonitor$Task CALCULATE_CRC`
- `public final static net.lingala.zip4j.progress.ProgressMonitor$Task EXTRACT_ENTRY`
- `public final static net.lingala.zip4j.progress.ProgressMonitor$Task MERGE_ZIP_FILES`
- `public final static net.lingala.zip4j.progress.ProgressMonitor$Task NONE`
- `public final static net.lingala.zip4j.progress.ProgressMonitor$Task REMOVE_ENTRY`
- `public final static net.lingala.zip4j.progress.ProgressMonitor$Task RENAME_FILE`
- `public final static net.lingala.zip4j.progress.ProgressMonitor$Task SET_COMMENT`

---

## public abstract class `net.lingala.zip4j.tasks.AbstractAddFileToZipTask`<T extends java.lang.Object>
extends `net.lingala.zip4j.tasks.AsyncZipTask`  

**Methods:**
- `protected net.lingala.zip4j.progress.ProgressMonitor$Task getTask()`
- `protected net.lingala.zip4j.model.ZipModel getZipModel()`

---

## public abstract class `net.lingala.zip4j.tasks.AbstractExtractFileTask`<T extends java.lang.Object>
extends `net.lingala.zip4j.tasks.AsyncZipTask`  

**Constructors:**
- `public AbstractExtractFileTask(net.lingala.zip4j.model.ZipModel p0, net.lingala.zip4j.model.UnzipParameters p1, net.lingala.zip4j.tasks.AsyncZipTask$AsyncTaskParameters p2)`

**Methods:**
- `protected void extractFile(net.lingala.zip4j.io.inputstream.ZipInputStream p0, net.lingala.zip4j.model.FileHeader p1, java.lang.String p2, java.lang.String p3, net.lingala.zip4j.progress.ProgressMonitor p4, byte[] p5) throws java.io.IOException`
- `protected net.lingala.zip4j.progress.ProgressMonitor$Task getTask()`
- `public net.lingala.zip4j.model.ZipModel getZipModel()`

---

## public abstract class `net.lingala.zip4j.tasks.AbstractZipTaskParameters`

**Constructors:**
- `protected AbstractZipTaskParameters(net.lingala.zip4j.model.Zip4jConfig p0)`

**Fields:**
- `protected net.lingala.zip4j.model.Zip4jConfig zip4jConfig`

---

## public class `net.lingala.zip4j.tasks.AddFilesToZipTask`
extends `net.lingala.zip4j.tasks.AbstractAddFileToZipTask`  

**Constructors:**
- `public AddFilesToZipTask(net.lingala.zip4j.model.ZipModel p0, char[] p1, net.lingala.zip4j.headers.HeaderWriter p2, net.lingala.zip4j.tasks.AsyncZipTask$AsyncTaskParameters p3)`

**Methods:**
- `protected long calculateTotalWork(net.lingala.zip4j.tasks.AddFilesToZipTask$AddFilesToZipTaskParameters p0) throws net.lingala.zip4j.exception.ZipException`
- `protected void executeTask(net.lingala.zip4j.tasks.AddFilesToZipTask$AddFilesToZipTaskParameters p0, net.lingala.zip4j.progress.ProgressMonitor p1) throws java.io.IOException`
- `protected net.lingala.zip4j.progress.ProgressMonitor$Task getTask()`

---

## public static class `net.lingala.zip4j.tasks.AddFilesToZipTask$AddFilesToZipTaskParameters`
extends `net.lingala.zip4j.tasks.AbstractZipTaskParameters`  

**Constructors:**
- `public AddFilesToZipTaskParameters(java.util.List p0, net.lingala.zip4j.model.ZipParameters p1, net.lingala.zip4j.model.Zip4jConfig p2)`

---

## public class `net.lingala.zip4j.tasks.AddFolderToZipTask`
extends `net.lingala.zip4j.tasks.AbstractAddFileToZipTask`  

**Constructors:**
- `public AddFolderToZipTask(net.lingala.zip4j.model.ZipModel p0, char[] p1, net.lingala.zip4j.headers.HeaderWriter p2, net.lingala.zip4j.tasks.AsyncZipTask$AsyncTaskParameters p3)`

**Methods:**
- `protected long calculateTotalWork(net.lingala.zip4j.tasks.AddFolderToZipTask$AddFolderToZipTaskParameters p0) throws net.lingala.zip4j.exception.ZipException`
- `protected void executeTask(net.lingala.zip4j.tasks.AddFolderToZipTask$AddFolderToZipTaskParameters p0, net.lingala.zip4j.progress.ProgressMonitor p1) throws java.io.IOException`

---

## public static class `net.lingala.zip4j.tasks.AddFolderToZipTask$AddFolderToZipTaskParameters`
extends `net.lingala.zip4j.tasks.AbstractZipTaskParameters`  

**Constructors:**
- `public AddFolderToZipTaskParameters(java.io.File p0, net.lingala.zip4j.model.ZipParameters p1, net.lingala.zip4j.model.Zip4jConfig p2)`

---

## public class `net.lingala.zip4j.tasks.AddStreamToZipTask`
extends `net.lingala.zip4j.tasks.AbstractAddFileToZipTask`  

**Constructors:**
- `public AddStreamToZipTask(net.lingala.zip4j.model.ZipModel p0, char[] p1, net.lingala.zip4j.headers.HeaderWriter p2, net.lingala.zip4j.tasks.AsyncZipTask$AsyncTaskParameters p3)`

**Methods:**
- `protected long calculateTotalWork(net.lingala.zip4j.tasks.AddStreamToZipTask$AddStreamToZipTaskParameters p0)`
- `protected void executeTask(net.lingala.zip4j.tasks.AddStreamToZipTask$AddStreamToZipTaskParameters p0, net.lingala.zip4j.progress.ProgressMonitor p1) throws java.io.IOException`

---

## public static class `net.lingala.zip4j.tasks.AddStreamToZipTask$AddStreamToZipTaskParameters`
extends `net.lingala.zip4j.tasks.AbstractZipTaskParameters`  

**Constructors:**
- `public AddStreamToZipTaskParameters(java.io.InputStream p0, net.lingala.zip4j.model.ZipParameters p1, net.lingala.zip4j.model.Zip4jConfig p2)`

---

## public abstract class `net.lingala.zip4j.tasks.AsyncZipTask`<T extends java.lang.Object>

**Constructors:**
- `public AsyncZipTask(net.lingala.zip4j.tasks.AsyncZipTask$AsyncTaskParameters p0)`

**Methods:**
- `protected abstract long calculateTotalWork(T p0) throws net.lingala.zip4j.exception.ZipException`
- `public void execute(T p0) throws net.lingala.zip4j.exception.ZipException`
- `protected abstract void executeTask(T p0, net.lingala.zip4j.progress.ProgressMonitor p1) throws java.io.IOException`
- `protected abstract net.lingala.zip4j.progress.ProgressMonitor$Task getTask()`
- `protected void verifyIfTaskIsCancelled() throws net.lingala.zip4j.exception.ZipException`

---

## public static class `net.lingala.zip4j.tasks.AsyncZipTask$AsyncTaskParameters`

**Constructors:**
- `public AsyncTaskParameters(java.util.concurrent.ExecutorService p0, boolean p1, net.lingala.zip4j.progress.ProgressMonitor p2)`

---

## public class `net.lingala.zip4j.tasks.ExtractAllFilesTask`
extends `net.lingala.zip4j.tasks.AbstractExtractFileTask`  

**Constructors:**
- `public ExtractAllFilesTask(net.lingala.zip4j.model.ZipModel p0, char[] p1, net.lingala.zip4j.model.UnzipParameters p2, net.lingala.zip4j.tasks.AsyncZipTask$AsyncTaskParameters p3)`

**Methods:**
- `protected long calculateTotalWork(net.lingala.zip4j.tasks.ExtractAllFilesTask$ExtractAllFilesTaskParameters p0)`
- `protected void executeTask(net.lingala.zip4j.tasks.ExtractAllFilesTask$ExtractAllFilesTaskParameters p0, net.lingala.zip4j.progress.ProgressMonitor p1) throws java.io.IOException`

---

## public static class `net.lingala.zip4j.tasks.ExtractAllFilesTask$ExtractAllFilesTaskParameters`
extends `net.lingala.zip4j.tasks.AbstractZipTaskParameters`  

**Constructors:**
- `public ExtractAllFilesTaskParameters(java.lang.String p0, net.lingala.zip4j.model.Zip4jConfig p1)`

---

## public class `net.lingala.zip4j.tasks.ExtractFileTask`
extends `net.lingala.zip4j.tasks.AbstractExtractFileTask`  

**Constructors:**
- `public ExtractFileTask(net.lingala.zip4j.model.ZipModel p0, char[] p1, net.lingala.zip4j.model.UnzipParameters p2, net.lingala.zip4j.tasks.AsyncZipTask$AsyncTaskParameters p3)`

**Methods:**
- `protected long calculateTotalWork(net.lingala.zip4j.tasks.ExtractFileTask$ExtractFileTaskParameters p0) throws net.lingala.zip4j.exception.ZipException`
- `protected void executeTask(net.lingala.zip4j.tasks.ExtractFileTask$ExtractFileTaskParameters p0, net.lingala.zip4j.progress.ProgressMonitor p1) throws java.io.IOException`

---

## public static class `net.lingala.zip4j.tasks.ExtractFileTask$ExtractFileTaskParameters`
extends `net.lingala.zip4j.tasks.AbstractZipTaskParameters`  

**Constructors:**
- `public ExtractFileTaskParameters(java.lang.String p0, java.lang.String p1, java.lang.String p2, net.lingala.zip4j.model.Zip4jConfig p3)`

---

## public class `net.lingala.zip4j.tasks.MergeSplitZipFileTask`
extends `net.lingala.zip4j.tasks.AsyncZipTask`  

**Constructors:**
- `public MergeSplitZipFileTask(net.lingala.zip4j.model.ZipModel p0, net.lingala.zip4j.tasks.AsyncZipTask$AsyncTaskParameters p1)`

**Methods:**
- `protected long calculateTotalWork(net.lingala.zip4j.tasks.MergeSplitZipFileTask$MergeSplitZipFileTaskParameters p0)`
- `protected void executeTask(net.lingala.zip4j.tasks.MergeSplitZipFileTask$MergeSplitZipFileTaskParameters p0, net.lingala.zip4j.progress.ProgressMonitor p1) throws java.io.IOException`
- `protected net.lingala.zip4j.progress.ProgressMonitor$Task getTask()`

---

## public static class `net.lingala.zip4j.tasks.MergeSplitZipFileTask$MergeSplitZipFileTaskParameters`
extends `net.lingala.zip4j.tasks.AbstractZipTaskParameters`  

**Constructors:**
- `public MergeSplitZipFileTaskParameters(java.io.File p0, net.lingala.zip4j.model.Zip4jConfig p1)`

---

## public class `net.lingala.zip4j.tasks.RemoveFilesFromZipTask`
extends `net.lingala.zip4j.tasks.AbstractModifyFileTask`  

**Constructors:**
- `public RemoveFilesFromZipTask(net.lingala.zip4j.model.ZipModel p0, net.lingala.zip4j.headers.HeaderWriter p1, net.lingala.zip4j.tasks.AsyncZipTask$AsyncTaskParameters p2)`

**Methods:**
- `protected long calculateTotalWork(net.lingala.zip4j.tasks.RemoveFilesFromZipTask$RemoveFilesFromZipTaskParameters p0)`
- `protected void executeTask(net.lingala.zip4j.tasks.RemoveFilesFromZipTask$RemoveFilesFromZipTaskParameters p0, net.lingala.zip4j.progress.ProgressMonitor p1) throws java.io.IOException`
- `protected net.lingala.zip4j.progress.ProgressMonitor$Task getTask()`

---

## public static class `net.lingala.zip4j.tasks.RemoveFilesFromZipTask$RemoveFilesFromZipTaskParameters`
extends `net.lingala.zip4j.tasks.AbstractZipTaskParameters`  

**Constructors:**
- `public RemoveFilesFromZipTaskParameters(java.util.List p0, net.lingala.zip4j.model.Zip4jConfig p1)`

---

## public class `net.lingala.zip4j.tasks.RenameFilesTask`
extends `net.lingala.zip4j.tasks.AbstractModifyFileTask`  

**Constructors:**
- `public RenameFilesTask(net.lingala.zip4j.model.ZipModel p0, net.lingala.zip4j.headers.HeaderWriter p1, net.lingala.zip4j.util.RawIO p2, net.lingala.zip4j.tasks.AsyncZipTask$AsyncTaskParameters p3)`

**Methods:**
- `protected long calculateTotalWork(net.lingala.zip4j.tasks.RenameFilesTask$RenameFilesTaskParameters p0)`
- `protected void executeTask(net.lingala.zip4j.tasks.RenameFilesTask$RenameFilesTaskParameters p0, net.lingala.zip4j.progress.ProgressMonitor p1) throws java.io.IOException`
- `protected net.lingala.zip4j.progress.ProgressMonitor$Task getTask()`

---

## public static class `net.lingala.zip4j.tasks.RenameFilesTask$RenameFilesTaskParameters`
extends `net.lingala.zip4j.tasks.AbstractZipTaskParameters`  

**Constructors:**
- `public RenameFilesTaskParameters(java.util.Map p0, net.lingala.zip4j.model.Zip4jConfig p1)`

---

## public class `net.lingala.zip4j.tasks.SetCommentTask`
extends `net.lingala.zip4j.tasks.AsyncZipTask`  

**Constructors:**
- `public SetCommentTask(net.lingala.zip4j.model.ZipModel p0, net.lingala.zip4j.tasks.AsyncZipTask$AsyncTaskParameters p1)`

**Methods:**
- `protected long calculateTotalWork(net.lingala.zip4j.tasks.SetCommentTask$SetCommentTaskTaskParameters p0)`
- `protected void executeTask(net.lingala.zip4j.tasks.SetCommentTask$SetCommentTaskTaskParameters p0, net.lingala.zip4j.progress.ProgressMonitor p1) throws java.io.IOException`
- `protected net.lingala.zip4j.progress.ProgressMonitor$Task getTask()`

---

## public static class `net.lingala.zip4j.tasks.SetCommentTask$SetCommentTaskTaskParameters`
extends `net.lingala.zip4j.tasks.AbstractZipTaskParameters`  

**Constructors:**
- `public SetCommentTaskTaskParameters(java.lang.String p0, net.lingala.zip4j.model.Zip4jConfig p1)`

---

## public class `net.lingala.zip4j.util.BitUtils`

**Constructors:**
- `public BitUtils()`

**Methods:**
- `public static boolean isBitSet(byte p0, int p1)`
- `public static byte setBit(byte p0, int p1)`
- `public static byte unsetBit(byte p0, int p1)`

---

## public class `net.lingala.zip4j.util.CrcUtil`

**Constructors:**
- `public CrcUtil()`

**Methods:**
- `public static long computeFileCrc(java.io.File p0, net.lingala.zip4j.progress.ProgressMonitor p1) throws java.io.IOException`

---

## public class `net.lingala.zip4j.util.FileUtils`

**Constructors:**
- `public FileUtils()`

**Fields:**
- `public final static byte[] DEFAULT_POSIX_FILE_ATTRIBUTES`
- `public final static byte[] DEFAULT_POSIX_FOLDER_ATTRIBUTES`

**Methods:**
- `public static void assertFilesExist(java.util.List p0, net.lingala.zip4j.model.ZipParameters$SymbolicLinkAction p1) throws net.lingala.zip4j.exception.ZipException`
- `public static void copyFile(java.io.RandomAccessFile p0, java.io.OutputStream p1, long p2, long p3, net.lingala.zip4j.progress.ProgressMonitor p4, int p5) throws net.lingala.zip4j.exception.ZipException`
- `public static java.io.File[] getAllSortedNumberedSplitFiles(java.io.File p0)`
- `public static byte[] getDefaultFileAttributes(boolean p0)`
- `public static byte[] getFileAttributes(java.io.File p0)`
- `public static java.lang.String getFileExtension(java.io.File p0)`
- `public static java.lang.String getFileNameWithoutExtension(java.lang.String p0)`
- `public static java.util.List getFilesInDirectoryRecursive(java.io.File p0, net.lingala.zip4j.model.ZipParameters p1) throws net.lingala.zip4j.exception.ZipException`
- `public static java.lang.String getNextNumberedSplitFileCounterAsExtension(int p0)`
- `public static java.lang.String getRelativeFileName(java.io.File p0, net.lingala.zip4j.model.ZipParameters p1) throws net.lingala.zip4j.exception.ZipException`
- `public static java.util.List getSplitZipFiles(net.lingala.zip4j.model.ZipModel p0) throws net.lingala.zip4j.exception.ZipException`
- `public static java.lang.String getZipFileNameWithoutExtension(java.lang.String p0) throws net.lingala.zip4j.exception.ZipException`
- `public static boolean isMac()`
- `public static boolean isNumberedSplitFile(java.io.File p0)`
- `public static boolean isSymbolicLink(java.io.File p0)`
- `public static boolean isUnix()`
- `public static boolean isWindows()`
- `public static boolean isZipEntryDirectory(java.lang.String p0)`
- `public static java.lang.String readSymbolicLink(java.io.File p0)`
- `public static void setFileAttributes(java.nio.file.Path p0, byte[] p1)`
- `public static void setFileLastModifiedTime(java.nio.file.Path p0, long p1)`
- `public static void setFileLastModifiedTimeWithoutNio(java.io.File p0, long p1)`

---

## public final class `net.lingala.zip4j.util.InternalZipConstants`

**Fields:**
- `public final static int AES_AUTH_LENGTH`
- `public final static int AES_BLOCK_SIZE`
- `public final static int AES_EXTRA_DATA_RECORD_SIZE`
- `public final static java.lang.String AES_HASH_CHARSET`
- `public final static int AES_HASH_ITERATIONS`
- `public final static java.lang.String AES_MAC_ALGORITHM`
- `public final static int AES_PASSWORD_VERIFIER_LENGTH`
- `public final static int BUFF_SIZE`
- `public final static java.nio.charset.Charset CHARSET_UTF_8`
- `public final static int ENDHDR`
- `public final static java.lang.String FILE_SEPARATOR`
- `public final static int MAX_ALLOWED_ZIP_COMMENT_LENGTH`
- `public final static int MAX_COMMENT_SIZE`
- `public final static int MIN_BUFF_SIZE`
- `public final static int MIN_SPLIT_LENGTH`
- `public final static java.lang.String SEVEN_ZIP_SPLIT_FILE_EXTENSION_PATTERN`
- `public final static int STD_DEC_HDR_SIZE`
- `public final static int UPDATE_LFH_COMP_SIZE`
- `public final static int UPDATE_LFH_CRC`
- `public final static int UPDATE_LFH_UNCOMP_SIZE`
- `public final static boolean USE_UTF8_FOR_PASSWORD_ENCODING_DECODING`
- `public final static java.nio.charset.Charset ZIP4J_DEFAULT_CHARSET`
- `public final static int ZIP_64_NUMBER_OF_ENTRIES_LIMIT`
- `public final static long ZIP_64_SIZE_LIMIT`
- `public final static java.lang.String ZIP_FILE_SEPARATOR`
- `public final static java.lang.String ZIP_STANDARD_CHARSET_NAME`

---

## public abstract interface `net.lingala.zip4j.util.PasswordCallback`

**Methods:**
- `public abstract char[] getPassword()`

---

## public class `net.lingala.zip4j.util.RawIO`

**Constructors:**
- `public RawIO()`

**Methods:**
- `public int readIntLittleEndian(byte[] p0)`
- `public int readIntLittleEndian(byte[] p0, int p1)`
- `public int readIntLittleEndian(java.io.InputStream p0) throws java.io.IOException`
- `public int readIntLittleEndian(java.io.RandomAccessFile p0) throws java.io.IOException`
- `public long readLongLittleEndian(byte[] p0, int p1)`
- `public long readLongLittleEndian(java.io.InputStream p0) throws java.io.IOException`
- `public long readLongLittleEndian(java.io.InputStream p0, int p1) throws java.io.IOException`
- `public long readLongLittleEndian(java.io.RandomAccessFile p0) throws java.io.IOException`
- `public long readLongLittleEndian(java.io.RandomAccessFile p0, int p1) throws java.io.IOException`
- `public int readShortLittleEndian(byte[] p0, int p1)`
- `public int readShortLittleEndian(java.io.InputStream p0) throws java.io.IOException`
- `public int readShortLittleEndian(java.io.RandomAccessFile p0) throws java.io.IOException`
- `public void writeIntLittleEndian(byte[] p0, int p1, int p2)`
- `public void writeIntLittleEndian(java.io.OutputStream p0, int p1) throws java.io.IOException`
- `public void writeLongLittleEndian(byte[] p0, int p1, long p2)`
- `public void writeLongLittleEndian(java.io.OutputStream p0, long p1) throws java.io.IOException`
- `public void writeShortLittleEndian(byte[] p0, int p1, int p2)`
- `public void writeShortLittleEndian(java.io.OutputStream p0, int p1) throws java.io.IOException`

---

## public class `net.lingala.zip4j.util.UnzipUtil`

**Constructors:**
- `public UnzipUtil()`

**Methods:**
- `public static void applyFileAttributes(net.lingala.zip4j.model.FileHeader p0, java.io.File p1)`
- `public static net.lingala.zip4j.io.inputstream.SplitFileInputStream createSplitInputStream(net.lingala.zip4j.model.ZipModel p0) throws java.io.IOException`
- `public static net.lingala.zip4j.io.inputstream.ZipInputStream createZipInputStream(net.lingala.zip4j.model.ZipModel p0, net.lingala.zip4j.model.FileHeader p1, char[] p2) throws java.io.IOException`

---

## public class `net.lingala.zip4j.util.Zip4jUtil`

**Constructors:**
- `public Zip4jUtil()`

**Methods:**
- `public static byte[] convertCharArrayToByteArray(char[] p0, boolean p1)`
- `public static boolean createDirectoryIfNotExists(java.io.File p0) throws net.lingala.zip4j.exception.ZipException`
- `public static long dosToExtendedEpochTme(long p0)`
- `public static long epochToExtendedDosTime(long p0)`
- `public static net.lingala.zip4j.model.enums.CompressionMethod getCompressionMethod(net.lingala.zip4j.model.AbstractFileHeader p0) throws net.lingala.zip4j.exception.ZipException`
- `public static boolean isStringNotNullAndNotEmpty(java.lang.String p0)`
- `public static boolean isStringNullOrEmpty(java.lang.String p0)`
- `public static int readFully(java.io.InputStream p0, byte[] p1) throws java.io.IOException`
- `public static int readFully(java.io.InputStream p0, byte[] p1, int p2, int p3) throws java.io.IOException`

---

## public class `net.lingala.zip4j.util.ZipVersionUtils`

**Constructors:**
- `public ZipVersionUtils()`

**Methods:**
- `public static int determineVersionMadeBy(net.lingala.zip4j.model.ZipParameters p0, net.lingala.zip4j.util.RawIO p1)`
- `public static net.lingala.zip4j.headers.VersionNeededToExtract determineVersionNeededToExtract(net.lingala.zip4j.model.ZipParameters p0)`

---

