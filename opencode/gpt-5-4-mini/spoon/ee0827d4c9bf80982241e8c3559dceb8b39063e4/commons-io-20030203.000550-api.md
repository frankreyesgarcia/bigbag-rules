# API Specification: commons-io:commons-io 20030203.000550

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public final class `org.apache.commons.io.EndianUtil`

**Constructors:**
- `public EndianUtil()`

**Fields:**
- `public final static int SIZEOF_BYTE`
- `public final static int SIZEOF_FLOAT`
- `public final static int SIZEOF_INT`
- `public final static int SIZEOF_LONG`
- `public final static int SIZEOF_SHORT`

**Methods:**
- `public static double readSwappedDouble(byte[] p0, int p1)`
- `public static double readSwappedDouble(java.io.InputStream p0) throws java.io.IOException`
- `public static float readSwappedFloat(byte[] p0, int p1)`
- `public static float readSwappedFloat(java.io.InputStream p0) throws java.io.IOException`
- `public static int readSwappedInteger(byte[] p0, int p1)`
- `public static int readSwappedInteger(java.io.InputStream p0) throws java.io.IOException`
- `public static long readSwappedLong(byte[] p0, int p1)`
- `public static long readSwappedLong(java.io.InputStream p0) throws java.io.IOException`
- `public static short readSwappedShort(byte[] p0, int p1)`
- `public static short readSwappedShort(java.io.InputStream p0) throws java.io.IOException`
- `public static long readSwappedUnsignedInteger(byte[] p0, int p1)`
- `public static long readSwappedUnsignedInteger(java.io.InputStream p0) throws java.io.IOException`
- `public static int readSwappedUnsignedShort(byte[] p0, int p1)`
- `public static int readSwappedUnsignedShort(java.io.InputStream p0) throws java.io.IOException`
- `public static double swapDouble(double p0)`
- `public static float swapFloat(float p0)`
- `public static int swapInteger(int p0)`
- `public static long swapLong(long p0)`
- `public static short swapShort(short p0)`
- `public static void writeSwappedDouble(byte[] p0, int p1, double p2)`
- `public static void writeSwappedDouble(java.io.OutputStream p0, double p1) throws java.io.IOException`
- `public static void writeSwappedFloat(byte[] p0, int p1, float p2)`
- `public static void writeSwappedFloat(java.io.OutputStream p0, float p1) throws java.io.IOException`
- `public static void writeSwappedInteger(byte[] p0, int p1, int p2)`
- `public static void writeSwappedInteger(java.io.OutputStream p0, int p1) throws java.io.IOException`
- `public static void writeSwappedLong(byte[] p0, int p1, long p2)`
- `public static void writeSwappedLong(java.io.OutputStream p0, long p1) throws java.io.IOException`
- `public static void writeSwappedShort(byte[] p0, int p1, int p2)`
- `public static void writeSwappedShort(java.io.OutputStream p0, int p1) throws java.io.IOException`

---

## public class `org.apache.commons.io.FileUtils`

**Fields:**
- `public final static int ONE_GB`
- `public final static int ONE_KB`
- `public final static int ONE_MB`

**Methods:**
- `public static java.lang.String basename(java.lang.String p0)`
- `public static java.lang.String basename(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String byteCountToDisplaySize(int p0)`
- `public static java.lang.String catPath(java.lang.String p0, java.lang.String p1)`
- `public static void cleanDirectory(java.io.File p0) throws java.io.IOException`
- `public static void cleanDirectory(java.lang.String p0) throws java.io.IOException`
- `public static boolean contentEquals(java.io.File p0, java.io.File p1) throws java.io.IOException`
- `public static void copyFile(java.io.File p0, java.io.File p1) throws java.io.IOException`
- `public static void copyFileToDirectory(java.io.File p0, java.io.File p1) throws java.io.IOException`
- `public static void copyFileToDirectory(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public static void copyURLToFile(java.net.URL p0, java.io.File p1) throws java.io.IOException`
- `public static void deleteDirectory(java.io.File p0) throws java.io.IOException`
- `public static void deleteDirectory(java.lang.String p0) throws java.io.IOException`
- `public static java.lang.String dirname(java.lang.String p0)`
- `public static java.lang.String extension(java.lang.String p0)`
- `public static void fileCopy(java.lang.String p0, java.lang.String p1) throws java.lang.Exception`
- `public static void fileDelete(java.lang.String p0)`
- `public static boolean fileExists(java.lang.String p0)`
- `public static java.lang.String fileRead(java.lang.String p0) throws java.io.IOException`
- `public static void fileWrite(java.lang.String p0, java.lang.String p1) throws java.lang.Exception`
- `public static java.lang.String filename(java.lang.String p0)`
- `public static void forceDelete(java.io.File p0) throws java.io.IOException`
- `public static void forceDelete(java.lang.String p0) throws java.io.IOException`
- `public static void forceDeleteOnExit(java.io.File p0) throws java.io.IOException`
- `public static void forceMkdir(java.io.File p0) throws java.io.IOException`
- `public static java.lang.String getExtension(java.lang.String p0)`
- `public static java.io.File getFile(java.lang.String p0)`
- `public static java.lang.String[] getFilesFromExtension(java.lang.String p0, java.lang.String[] p1)`
- `public static java.lang.String getPath(java.lang.String p0)`
- `public static java.lang.String getPath(java.lang.String p0, char p1)`
- `public static void mkdir(java.lang.String p0)`
- `public static java.lang.String normalize(java.lang.String p0)`
- `public static java.lang.String removeExtension(java.lang.String p0)`
- `public static java.lang.String removePath(java.lang.String p0)`
- `public static java.lang.String removePath(java.lang.String p0, char p1)`
- `public static java.io.File resolveFile(java.io.File p0, java.lang.String p1)`
- `public static long sizeOfDirectory(java.io.File p0)`
- `public static long sizeOfDirectory(java.lang.String p0)`
- `public static java.io.File toFile(java.net.URL p0)`
- `public static java.net.URL[] toURLs(java.io.File[] p0) throws java.io.IOException`
- `public static boolean waitFor(java.lang.String p0, int p1)`

---

## public class `org.apache.commons.io.HexDump`

**Fields:**
- `public final static java.lang.String EOL`

**Methods:**
- `public static void dump(byte[] p0, long p1, java.io.OutputStream p2, int p3) throws java.io.IOException, java.lang.ArrayIndexOutOfBoundsException, java.lang.IllegalArgumentException`

---

## public final class `org.apache.commons.io.IOUtil`

**Methods:**
- `public static void bufferedCopy(java.io.InputStream p0, java.io.OutputStream p1) throws java.io.IOException`
- `public static boolean contentEquals(java.io.InputStream p0, java.io.InputStream p1) throws java.io.IOException`
- `public static void copy(byte[] p0, java.io.OutputStream p1) throws java.io.IOException`
- `public static void copy(byte[] p0, java.io.OutputStream p1, int p2) throws java.io.IOException`
- `public static void copy(byte[] p0, java.io.Writer p1) throws java.io.IOException`
- `public static void copy(byte[] p0, java.io.Writer p1, int p2) throws java.io.IOException`
- `public static void copy(byte[] p0, java.io.Writer p1, java.lang.String p2) throws java.io.IOException`
- `public static void copy(byte[] p0, java.io.Writer p1, java.lang.String p2, int p3) throws java.io.IOException`
- `public static void copy(java.io.InputStream p0, java.io.OutputStream p1) throws java.io.IOException`
- `public static void copy(java.io.InputStream p0, java.io.OutputStream p1, int p2) throws java.io.IOException`
- `public static void copy(java.io.InputStream p0, java.io.Writer p1) throws java.io.IOException`
- `public static void copy(java.io.InputStream p0, java.io.Writer p1, int p2) throws java.io.IOException`
- `public static void copy(java.io.InputStream p0, java.io.Writer p1, java.lang.String p2) throws java.io.IOException`
- `public static void copy(java.io.InputStream p0, java.io.Writer p1, java.lang.String p2, int p3) throws java.io.IOException`
- `public static void copy(java.io.Reader p0, java.io.OutputStream p1) throws java.io.IOException`
- `public static void copy(java.io.Reader p0, java.io.OutputStream p1, int p2) throws java.io.IOException`
- `public static void copy(java.io.Reader p0, java.io.Writer p1) throws java.io.IOException`
- `public static void copy(java.io.Reader p0, java.io.Writer p1, int p2) throws java.io.IOException`
- `public static void copy(java.lang.String p0, java.io.OutputStream p1) throws java.io.IOException`
- `public static void copy(java.lang.String p0, java.io.OutputStream p1, int p2) throws java.io.IOException`
- `public static void copy(java.lang.String p0, java.io.Writer p1) throws java.io.IOException`
- `public static void shutdownReader(java.io.Reader p0)`
- `public static void shutdownStream(java.io.InputStream p0)`
- `public static void shutdownStream(java.io.OutputStream p0)`
- `public static void shutdownWriter(java.io.Writer p0)`
- `public static byte[] toByteArray(java.io.InputStream p0) throws java.io.IOException`
- `public static byte[] toByteArray(java.io.InputStream p0, int p1) throws java.io.IOException`
- `public static byte[] toByteArray(java.io.Reader p0) throws java.io.IOException`
- `public static byte[] toByteArray(java.io.Reader p0, int p1) throws java.io.IOException`
- `public static byte[] toByteArray(java.lang.String p0) throws java.io.IOException`
- `public static byte[] toByteArray(java.lang.String p0, int p1) throws java.io.IOException`
- `public static java.lang.String toString(byte[] p0) throws java.io.IOException`
- `public static java.lang.String toString(byte[] p0, int p1) throws java.io.IOException`
- `public static java.lang.String toString(byte[] p0, java.lang.String p1) throws java.io.IOException`
- `public static java.lang.String toString(byte[] p0, java.lang.String p1, int p2) throws java.io.IOException`
- `public static java.lang.String toString(java.io.InputStream p0) throws java.io.IOException`
- `public static java.lang.String toString(java.io.InputStream p0, int p1) throws java.io.IOException`
- `public static java.lang.String toString(java.io.InputStream p0, java.lang.String p1) throws java.io.IOException`
- `public static java.lang.String toString(java.io.InputStream p0, java.lang.String p1, int p2) throws java.io.IOException`
- `public static java.lang.String toString(java.io.Reader p0) throws java.io.IOException`
- `public static java.lang.String toString(java.io.Reader p0, int p1) throws java.io.IOException`

---

## public abstract class `org.apache.commons.io.ProxyInputStream`
extends `java.io.FilterInputStream`  

**Constructors:**
- `public ProxyInputStream(java.io.InputStream p0)`

**Methods:**
- `public int available() throws java.io.IOException`
- `public void close() throws java.io.IOException`
- `public synchronized void mark(int p0)`
- `public boolean markSupported()`
- `public int read() throws java.io.IOException`
- `public int read(byte[] p0) throws java.io.IOException`
- `public int read(byte[] p0, int p1, int p2) throws java.io.IOException`
- `public synchronized void reset() throws java.io.IOException`
- `public long skip(long p0) throws java.io.IOException`

---

## public class `org.apache.commons.io.ProxyOutputStream`
extends `java.io.FilterOutputStream`  

**Constructors:**
- `public ProxyOutputStream(java.io.OutputStream p0)`

**Methods:**
- `public void close() throws java.io.IOException`
- `public void flush() throws java.io.IOException`
- `public void write(byte[] p0) throws java.io.IOException`
- `public void write(byte[] p0, int p1, int p2) throws java.io.IOException`
- `public void write(int p0) throws java.io.IOException`

---

## public class `org.apache.commons.io.compress.tar.TarEntry`

**Constructors:**
- `public TarEntry(byte[] p0)`
- `public TarEntry(java.io.File p0)`
- `public TarEntry(java.lang.String p0)`
- `public TarEntry(java.lang.String p0, byte p1)`

**Fields:**
- `public final static int NAMELEN`

**Methods:**
- `public boolean equals(org.apache.commons.io.compress.tar.TarEntry p0)`
- `public int getCheckSum()`
- `public org.apache.commons.io.compress.tar.TarEntry[] getDirectoryEntries()`
- `public java.io.File getFile()`
- `public int getGroupID()`
- `public int getGroupId()`
- `public java.lang.String getGroupName()`
- `public java.util.Date getModTime()`
- `public int getMode()`
- `public java.lang.String getName()`
- `public long getSize()`
- `public int getUserID()`
- `public int getUserId()`
- `public java.lang.String getUserName()`
- `public boolean isDescendent(org.apache.commons.io.compress.tar.TarEntry p0)`
- `public boolean isDirectory()`
- `public boolean isGNULongNameEntry()`
- `public void setGroupID(int p0)`
- `public void setGroupId(int p0)`
- `public void setGroupName(java.lang.String p0)`
- `public void setModTime(java.util.Date p0)`
- `public void setModTime(long p0)`
- `public void setMode(int p0)`
- `public void setName(java.lang.String p0)`
- `public void setSize(long p0)`
- `public void setUserID(int p0)`
- `public void setUserId(int p0)`
- `public void setUserName(java.lang.String p0)`
- `public void writeEntryHeader(byte[] p0)`

---

## public class `org.apache.commons.io.compress.tar.TarInputStream`
extends `java.io.FilterInputStream`  

**Constructors:**
- `public TarInputStream(java.io.InputStream p0)`
- `public TarInputStream(java.io.InputStream p0, int p1)`
- `public TarInputStream(java.io.InputStream p0, int p1, int p2)`

**Methods:**
- `public int available() throws java.io.IOException`
- `public void close() throws java.io.IOException`
- `public void copyEntryContents(java.io.OutputStream p0) throws java.io.IOException`
- `protected void debug(java.lang.String p0)`
- `public org.apache.commons.io.compress.tar.TarEntry getNextEntry() throws java.io.IOException`
- `public int getRecordSize()`
- `public void mark(int p0)`
- `public boolean markSupported()`
- `public int read() throws java.io.IOException`
- `public int read(byte[] p0) throws java.io.IOException`
- `public int read(byte[] p0, int p1, int p2) throws java.io.IOException`
- `public void reset()`
- `public void setDebug(boolean p0)`
- `public void skip(int p0) throws java.io.IOException`

---

## public class `org.apache.commons.io.compress.tar.TarOutputStream`
extends `java.io.FilterOutputStream`  

**Constructors:**
- `public TarOutputStream(java.io.OutputStream p0)`
- `public TarOutputStream(java.io.OutputStream p0, int p1)`
- `public TarOutputStream(java.io.OutputStream p0, int p1, int p2)`

**Fields:**
- `public final static int LONGFILE_ERROR`
- `public final static int LONGFILE_GNU`
- `public final static int LONGFILE_TRUNCATE`

**Methods:**
- `public void close() throws java.io.IOException`
- `public void closeEntry() throws java.io.IOException`
- `public void copyEntryContents(java.io.InputStream p0) throws java.io.IOException`
- `public void finish() throws java.io.IOException`
- `public int getRecordSize()`
- `public void putNextEntry(org.apache.commons.io.compress.tar.TarEntry p0) throws java.io.IOException`
- `public void setBufferDebug(boolean p0)`
- `public void setLongFileMode(int p0)`
- `public void write(byte[] p0) throws java.io.IOException`
- `public void write(byte[] p0, int p1, int p2) throws java.io.IOException`
- `public void write(int p0) throws java.io.IOException`

---

## public class `org.apache.commons.io.compress.zip.AsiExtraField`
implements `java.lang.Cloneable`, `org.apache.commons.io.compress.zip.UnixStat`, `org.apache.commons.io.compress.zip.ZipExtraField`  

**Constructors:**
- `public AsiExtraField()`

**Methods:**
- `public byte[] getCentralDirectoryData()`
- `public org.apache.commons.io.compress.zip.ZipShort getCentralDirectoryLength()`
- `public int getGroupID()`
- `public int getGroupId()`
- `public org.apache.commons.io.compress.zip.ZipShort getHeaderID()`
- `public java.lang.String getLinkedFile()`
- `public byte[] getLocalFileDataData()`
- `public org.apache.commons.io.compress.zip.ZipShort getLocalFileDataLength()`
- `public int getMode()`
- `protected int getMode(int p0)`
- `public int getUserID()`
- `public int getUserId()`
- `public boolean isDirectory()`
- `public boolean isLink()`
- `public void parseFromLocalFileData(byte[] p0, int p1, int p2) throws java.util.zip.ZipException`
- `public void setDirectory(boolean p0)`
- `public void setGroupId(int p0)`
- `public void setLinkedFile(java.lang.String p0)`
- `public void setMode(int p0)`
- `public void setUserID(int p0)`
- `public void setUserId(int p0)`

---

## public class `org.apache.commons.io.compress.zip.ExtraFieldUtils`

**Constructors:**
- `public ExtraFieldUtils()`

**Methods:**
- `public static org.apache.commons.io.compress.zip.ZipExtraField createExtraField(org.apache.commons.io.compress.zip.ZipShort p0) throws java.lang.IllegalAccessException, java.lang.InstantiationException`
- `public static byte[] mergeCentralDirectoryData(org.apache.commons.io.compress.zip.ZipExtraField[] p0)`
- `public static byte[] mergeLocalFileDataData(org.apache.commons.io.compress.zip.ZipExtraField[] p0)`
- `public static org.apache.commons.io.compress.zip.ZipExtraField[] parse(byte[] p0) throws java.util.zip.ZipException`
- `public static void register(java.lang.Class p0)`

---

## public abstract interface `org.apache.commons.io.compress.zip.UnixStat`

**Fields:**
- `public final static int DEFAULT_DIR_PERM`
- `public final static int DEFAULT_FILE_PERM`
- `public final static int DEFAULT_LINK_PERM`
- `public final static int DIR_FLAG`
- `public final static int FILE_FLAG`
- `public final static int LINK_FLAG`
- `public final static int PERM_MASK`

---

## public class `org.apache.commons.io.compress.zip.UnrecognizedExtraField`
implements `org.apache.commons.io.compress.zip.ZipExtraField`  

**Constructors:**
- `public UnrecognizedExtraField()`

**Methods:**
- `public byte[] getCentralDirectoryData()`
- `public org.apache.commons.io.compress.zip.ZipShort getCentralDirectoryLength()`
- `public org.apache.commons.io.compress.zip.ZipShort getHeaderID()`
- `public org.apache.commons.io.compress.zip.ZipShort getHeaderId()`
- `public byte[] getLocalFileDataData()`
- `public org.apache.commons.io.compress.zip.ZipShort getLocalFileDataLength()`
- `public void parseFromLocalFileData(byte[] p0, int p1, int p2)`
- `public void setCentralDirectoryData(byte[] p0)`
- `public void setHeaderID(org.apache.commons.io.compress.zip.ZipShort p0)`
- `public void setHeaderId(org.apache.commons.io.compress.zip.ZipShort p0)`
- `public void setLocalFileDataData(byte[] p0)`

---

## public class `org.apache.commons.io.compress.zip.ZipEntry`
extends `java.util.zip.ZipEntry`  

**Constructors:**
- `public ZipEntry(java.lang.String p0)`
- `public ZipEntry(java.util.zip.ZipEntry p0) throws java.util.zip.ZipException`
- `public ZipEntry(org.apache.commons.io.compress.zip.ZipEntry p0) throws java.util.zip.ZipException`

**Methods:**
- `public void addExtraField(org.apache.commons.io.compress.zip.ZipExtraField p0)`
- `public java.lang.Object clone()`
- `public byte[] getCentralDirectoryExtra()`
- `public long getCompressedSize()`
- `public long getExternalAttributes()`
- `public org.apache.commons.io.compress.zip.ZipExtraField[] getExtraFields()`
- `public int getInternalAttributes()`
- `public byte[] getLocalFileDataExtra()`
- `public void removeExtraField(org.apache.commons.io.compress.zip.ZipShort p0)`
- `public void setComprSize(long p0)`
- `public void setExternalAttributes(long p0)`
- `protected void setExtra()`
- `public void setExtra(byte[] p0) throws java.lang.RuntimeException`
- `public void setExtraFields(org.apache.commons.io.compress.zip.ZipExtraField[] p0)`
- `public void setInternalAttributes(int p0)`

---

## public abstract interface `org.apache.commons.io.compress.zip.ZipExtraField`

**Methods:**
- `public abstract byte[] getCentralDirectoryData()`
- `public abstract org.apache.commons.io.compress.zip.ZipShort getCentralDirectoryLength()`
- `public abstract org.apache.commons.io.compress.zip.ZipShort getHeaderID()`
- `public abstract byte[] getLocalFileDataData()`
- `public abstract org.apache.commons.io.compress.zip.ZipShort getLocalFileDataLength()`
- `public abstract void parseFromLocalFileData(byte[] p0, int p1, int p2) throws java.util.zip.ZipException`

---

## public final class `org.apache.commons.io.compress.zip.ZipLong`
implements `java.lang.Cloneable`  

**Constructors:**
- `public ZipLong(byte[] p0)`
- `public ZipLong(byte[] p0, int p1)`
- `public ZipLong(long p0)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public byte[] getBytes()`
- `public long getValue()`
- `public int hashCode()`

---

## public class `org.apache.commons.io.compress.zip.ZipOutputStream`
extends `java.util.zip.DeflaterOutputStream`  

**Constructors:**
- `public ZipOutputStream(java.io.OutputStream p0)`

**Fields:**
- `protected final static org.apache.commons.io.compress.zip.ZipLong CFH_SIG`
- `protected final static org.apache.commons.io.compress.zip.ZipLong DD_SIG`
- `public final static int DEFLATED`
- `protected final static org.apache.commons.io.compress.zip.ZipLong EOCD_SIG`
- `protected final static org.apache.commons.io.compress.zip.ZipLong LFH_SIG`
- `public final static int STORED`

**Methods:**
- `public void closeEntry() throws java.io.IOException`
- `public void finish() throws java.io.IOException`
- `protected byte[] getBytes(java.lang.String p0) throws java.util.zip.ZipException`
- `public java.lang.String getEncoding()`
- `public void putNextEntry(org.apache.commons.io.compress.zip.ZipEntry p0) throws java.io.IOException`
- `public void setComment(java.lang.String p0)`
- `public void setEncoding(java.lang.String p0)`
- `public void setLevel(int p0)`
- `public void setMethod(int p0)`
- `protected static org.apache.commons.io.compress.zip.ZipLong toDosTime(java.util.Date p0)`
- `public void write(byte[] p0, int p1, int p2) throws java.io.IOException`
- `protected void writeCentralDirectoryEnd() throws java.io.IOException`
- `protected void writeCentralFileHeader(org.apache.commons.io.compress.zip.ZipEntry p0) throws java.io.IOException`
- `protected void writeDataDescriptor(org.apache.commons.io.compress.zip.ZipEntry p0) throws java.io.IOException`
- `protected void writeLocalFileHeader(org.apache.commons.io.compress.zip.ZipEntry p0) throws java.io.IOException`

---

## public final class `org.apache.commons.io.compress.zip.ZipShort`
implements `java.lang.Cloneable`  

**Constructors:**
- `public ZipShort(byte[] p0)`
- `public ZipShort(byte[] p0, int p1)`
- `public ZipShort(int p0)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public byte[] getBytes()`
- `public int getValue()`
- `public int hashCode()`

---

## public abstract class `org.apache.commons.io.filefilter.AbstractFileFilter`
implements `org.apache.commons.io.filefilter.FileFilter`  

**Constructors:**
- `public AbstractFileFilter()`

**Methods:**
- `public boolean accept(java.io.File p0)`
- `public boolean accept(java.io.File p0, java.lang.String p1)`
- `public boolean evaluate(java.lang.Object p0)`

---

## public class `org.apache.commons.io.filefilter.DelegateFileFilter`
extends `org.apache.commons.io.filefilter.AbstractFileFilter`  

**Constructors:**
- `public DelegateFileFilter(java.io.FileFilter p0)`
- `public DelegateFileFilter(java.io.FilenameFilter p0)`

**Methods:**
- `public boolean accept(java.io.File p0)`
- `public boolean accept(java.io.File p0, java.lang.String p1)`

---

## public class `org.apache.commons.io.filefilter.DirectoryFileFilter`
extends `org.apache.commons.io.filefilter.AbstractFileFilter`  

**Constructors:**
- `public DirectoryFileFilter()`

**Methods:**
- `public boolean accept(java.io.File p0)`

---

## public class `org.apache.commons.io.filefilter.ExtensionFileFilter`
extends `org.apache.commons.io.filefilter.AbstractFileFilter`  

**Constructors:**
- `public ExtensionFileFilter(java.lang.String p0)`
- `public ExtensionFileFilter(java.lang.String[] p0)`

**Methods:**
- `public boolean accept(java.io.File p0, java.lang.String p1)`

---

## public abstract interface `org.apache.commons.io.filefilter.FileFilter`
implements `java.io.FileFilter`, `java.io.FilenameFilter`, `org.apache.commons.lang.functor.Predicate`  

**Methods:**
- `public abstract boolean accept(java.io.File p0)`
- `public abstract boolean accept(java.io.File p0, java.lang.String p1)`

---

## public class `org.apache.commons.io.filefilter.FileFilterUtils`

**Constructors:**
- `public FileFilterUtils()`

**Methods:**
- `public static org.apache.commons.io.filefilter.FileFilter andFileFilter(org.apache.commons.io.filefilter.FileFilter p0, org.apache.commons.io.filefilter.FileFilter p1)`
- `public static org.apache.commons.io.filefilter.FileFilter notFileFilter(org.apache.commons.io.filefilter.FileFilter p0)`
- `public static org.apache.commons.io.filefilter.FileFilter nullFileFilter()`
- `public static org.apache.commons.io.filefilter.FileFilter orFileFilter(org.apache.commons.io.filefilter.FileFilter p0, org.apache.commons.io.filefilter.FileFilter p1)`
- `public static org.apache.commons.io.filefilter.FileFilter predicateToFileFilter(org.apache.commons.lang.functor.Predicate p0)`

---

## public class `org.apache.commons.io.filefilter.PredicateFileFilter`
extends `org.apache.commons.io.filefilter.AbstractFileFilter`  

**Constructors:**
- `public PredicateFileFilter(org.apache.commons.lang.functor.Predicate p0)`

**Methods:**
- `public boolean accept(java.io.File p0)`

---

## public class `org.apache.commons.io.filefilter.PrefixFileFilter`
extends `org.apache.commons.io.filefilter.AbstractFileFilter`  

**Constructors:**
- `public PrefixFileFilter(java.lang.String p0)`
- `public PrefixFileFilter(java.lang.String[] p0)`

**Methods:**
- `public boolean accept(java.io.File p0, java.lang.String p1)`

---

## public class `org.apache.commons.io.input.ClassLoaderObjectInputStream`
extends `java.io.ObjectInputStream`  

**Constructors:**
- `public ClassLoaderObjectInputStream(java.lang.ClassLoader p0, java.io.InputStream p1) throws java.io.IOException, java.io.StreamCorruptedException`

**Methods:**
- `protected java.lang.Class resolveClass(java.io.ObjectStreamClass p0) throws java.io.IOException, java.lang.ClassNotFoundException`

---

## public class `org.apache.commons.io.input.CountingInputStream`
extends `java.io.FilterInputStream`  

**Constructors:**
- `public CountingInputStream(java.io.InputStream p0)`

**Methods:**
- `public int getCount()`
- `public int read() throws java.io.IOException`
- `public int read(byte[] p0) throws java.io.IOException`
- `public int read(byte[] p0, int p1, int p2) throws java.io.IOException`

---

## public final class `org.apache.commons.io.input.DemuxInputStream`
extends `java.io.InputStream`  

**Constructors:**
- `public DemuxInputStream()`

**Methods:**
- `public java.io.InputStream bindStream(java.io.InputStream p0)`
- `public void close() throws java.io.IOException`
- `public int read() throws java.io.IOException`

---

## public class `org.apache.commons.io.input.SwappedDataInputStream`
implements `java.io.DataInput`  

**Constructors:**
- `public SwappedDataInputStream(java.io.InputStream p0)`

**Methods:**
- `public int available() throws java.io.EOFException, java.io.IOException`
- `public void close() throws java.io.EOFException, java.io.IOException`
- `public void mark(int p0)`
- `public boolean markSupported()`
- `public int read() throws java.io.EOFException, java.io.IOException`
- `public int read(byte[] p0) throws java.io.EOFException, java.io.IOException`
- `public int read(byte[] p0, int p1, int p2) throws java.io.EOFException, java.io.IOException`
- `public boolean readBoolean() throws java.io.EOFException, java.io.IOException`
- `public byte readByte() throws java.io.EOFException, java.io.IOException`
- `public char readChar() throws java.io.EOFException, java.io.IOException`
- `public double readDouble() throws java.io.EOFException, java.io.IOException`
- `public float readFloat() throws java.io.EOFException, java.io.IOException`
- `public void readFully(byte[] p0) throws java.io.EOFException, java.io.IOException`
- `public void readFully(byte[] p0, int p1, int p2) throws java.io.EOFException, java.io.IOException`
- `public int readInt() throws java.io.EOFException, java.io.IOException`
- `public java.lang.String readLine() throws java.io.EOFException, java.io.IOException`
- `public long readLong() throws java.io.EOFException, java.io.IOException`
- `public short readShort() throws java.io.EOFException, java.io.IOException`
- `public java.lang.String readUTF() throws java.io.EOFException, java.io.IOException`
- `public int readUnsignedByte() throws java.io.EOFException, java.io.IOException`
- `public int readUnsignedShort() throws java.io.EOFException, java.io.IOException`
- `public void reset() throws java.io.IOException`
- `public long skip(long p0) throws java.io.EOFException, java.io.IOException`
- `public int skipBytes(int p0) throws java.io.EOFException, java.io.IOException`

---

## public class `org.apache.commons.io.output.CountingOutputStream`
extends `org.apache.commons.io.ProxyOutputStream`  

**Constructors:**
- `public CountingOutputStream(java.io.OutputStream p0)`

**Methods:**
- `public int getCount()`
- `public void write(byte[] p0) throws java.io.IOException`
- `public void write(byte[] p0, int p1, int p2) throws java.io.IOException`
- `public void write(int p0) throws java.io.IOException`

---

## public final class `org.apache.commons.io.output.DemuxOutputStream`
extends `java.io.OutputStream`  

**Constructors:**
- `public DemuxOutputStream()`

**Methods:**
- `public java.io.OutputStream bindStream(java.io.OutputStream p0)`
- `public void close() throws java.io.IOException`
- `public void flush() throws java.io.IOException`
- `public void write(int p0) throws java.io.IOException`

---

## public class `org.apache.commons.io.output.LockableFileWriter`
extends `java.io.Writer`  

**Constructors:**
- `public LockableFileWriter(java.io.File p0) throws java.io.IOException`
- `public LockableFileWriter(java.io.File p0, boolean p1) throws java.io.IOException`
- `public LockableFileWriter(java.io.File p0, boolean p1, java.lang.String p2) throws java.io.IOException`
- `public LockableFileWriter(java.lang.String p0) throws java.io.IOException`
- `public LockableFileWriter(java.lang.String p0, boolean p1) throws java.io.IOException`
- `public LockableFileWriter(java.lang.String p0, boolean p1, java.lang.String p2) throws java.io.IOException`

**Methods:**
- `public void close() throws java.io.IOException`
- `public void flush() throws java.io.IOException`
- `public void write(char[] p0, int p1, int p2) throws java.io.IOException`

---

## public class `org.apache.commons.io.output.TeeOutputStream`
extends `org.apache.commons.io.ProxyOutputStream`  

**Constructors:**
- `public TeeOutputStream(java.io.OutputStream p0, java.io.OutputStream p1)`

**Fields:**
- `protected java.io.OutputStream branch`

**Methods:**
- `public void close() throws java.io.IOException`
- `public void flush() throws java.io.IOException`
- `public synchronized void write(byte[] p0) throws java.io.IOException`
- `public synchronized void write(byte[] p0, int p1, int p2) throws java.io.IOException`
- `public synchronized void write(int p0) throws java.io.IOException`

---

