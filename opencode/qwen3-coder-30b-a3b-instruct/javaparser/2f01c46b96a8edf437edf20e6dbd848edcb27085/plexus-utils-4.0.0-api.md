# API Specification: org.codehaus.plexus:plexus-utils 4.0.0

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public abstract class `org.codehaus.plexus.util.AbstractScanner`
implements `org.codehaus.plexus.util.Scanner`  

**Constructors:**
- `public AbstractScanner()`

**Fields:**
- `public final static java.lang.String[] DEFAULTEXCLUDES`
- `protected java.lang.String[] excludes`
- `protected java.util.Comparator filenameComparator`
- `protected java.lang.String[] includes`
- `protected boolean isCaseSensitive`

**Methods:**
- `public void addDefaultExcludes()`
- `protected boolean couldHoldIncluded(java.lang.String p0)`
- `protected boolean isExcluded(java.lang.String p0)`
- `protected boolean isExcluded(java.lang.String p0, char[][] p1)`
- `protected boolean isExcluded(java.lang.String p0, java.lang.String[] p1)`
- `protected boolean isIncluded(java.lang.String p0)`
- `protected boolean isIncluded(java.lang.String p0, char[][] p1)`
- `protected boolean isIncluded(java.lang.String p0, java.lang.String[] p1)`
- `public static boolean match(java.lang.String p0, java.lang.String p1)`
- `protected static boolean match(java.lang.String p0, java.lang.String p1, boolean p2)`
- `protected static boolean matchPath(java.lang.String p0, java.lang.String p1)`
- `protected static boolean matchPath(java.lang.String p0, java.lang.String p1, boolean p2)`
- `protected static boolean matchPatternStart(java.lang.String p0, java.lang.String p1)`
- `protected static boolean matchPatternStart(java.lang.String p0, java.lang.String p1, boolean p2)`
- `public void setCaseSensitive(boolean p0)`
- `public void setExcludes(java.lang.String[] p0)`
- `public void setFilenameComparator(java.util.Comparator p0)`
- `public void setIncludes(java.lang.String[] p0)`
- `protected void setupDefaultFilters()`
- `protected void setupMatchPatterns()`

---

## public class `org.codehaus.plexus.util.Base64`

**Constructors:**
- `public Base64()`

**Methods:**
- `public byte[] decode(byte[] p0)`
- `public static byte[] decodeBase64(byte[] p0)`
- `public byte[] encode(byte[] p0)`
- `public static byte[] encodeBase64(byte[] p0)`
- `public static byte[] encodeBase64(byte[] p0, boolean p1)`
- `public static byte[] encodeBase64Chunked(byte[] p0)`
- `public static boolean isArrayByteBase64(byte[] p0)`

---

## public final class `org.codehaus.plexus.util.CachedMap`
implements `java.util.Map`  

**Constructors:**
- `public CachedMap()`
- `public CachedMap(int p0)`
- `public CachedMap(int p0, java.util.Map p1)`

**Methods:**
- `public void clear()`
- `public boolean containsKey(java.lang.Object p0)`
- `public boolean containsValue(java.lang.Object p0)`
- `public java.util.Set entrySet()`
- `public boolean equals(java.lang.Object p0)`
- `public void flush()`
- `public java.lang.Object get(java.lang.Object p0)`
- `public java.util.Map getBackingMap()`
- `public int getCacheSize()`
- `public int hashCode()`
- `public boolean isEmpty()`
- `public java.util.Set keySet()`
- `public java.lang.Object put(java.lang.Object p0, java.lang.Object p1)`
- `public void putAll(java.util.Map p0)`
- `public java.lang.Object remove(java.lang.Object p0)`
- `public int size()`
- `public java.util.Collection values()`

---

## public class `org.codehaus.plexus.util.CollectionUtils`

**Constructors:**
- `public CollectionUtils()`

**Methods:**
- `public static <E extends java.lang.Object> java.util.Map getCardinalityMap(java.util.Collection p0)`
- `public static <E extends java.lang.Object> java.util.Collection intersection(java.util.Collection p0, java.util.Collection p1)`
- `public static <E extends java.lang.Object> java.util.List iteratorToList(java.util.Iterator p0)`
- `public static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map mergeMaps(java.util.Map p0, java.util.Map p1)`
- `public static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map mergeMaps(java.util.Map[] p0)`
- `public static <T extends java.lang.Object> java.util.Collection subtract(java.util.Collection p0, java.util.Collection p1)`

---

## public class `org.codehaus.plexus.util.DirectoryScanner`
extends `org.codehaus.plexus.util.AbstractScanner`  

**Constructors:**
- `public DirectoryScanner()`

**Fields:**
- `protected java.io.File basedir`
- `protected java.util.ArrayList dirsDeselected`
- `protected java.util.ArrayList dirsExcluded`
- `protected java.util.ArrayList dirsIncluded`
- `protected java.util.ArrayList dirsNotIncluded`
- `protected boolean everythingIncluded`
- `protected java.util.ArrayList filesDeselected`
- `protected java.util.ArrayList filesExcluded`
- `protected java.util.ArrayList filesIncluded`
- `protected java.util.ArrayList filesNotIncluded`
- `protected boolean haveSlowResults`

**Methods:**
- `public java.io.File getBasedir()`
- `public java.lang.String[] getDeselectedDirectories()`
- `public java.lang.String[] getDeselectedFiles()`
- `public java.lang.String[] getExcludedDirectories()`
- `public java.lang.String[] getExcludedFiles()`
- `public java.lang.String[] getIncludedDirectories()`
- `public java.lang.String[] getIncludedFiles()`
- `public java.lang.String[] getNotIncludedDirectories()`
- `public java.lang.String[] getNotIncludedFiles()`
- `public boolean isEverythingIncluded()`
- `public boolean isParentSymbolicLink(java.io.File p0, java.lang.String p1) throws java.io.IOException`
- `protected boolean isSelected(java.lang.String p0, java.io.File p1)`
- `public boolean isSymbolicLink(java.io.File p0, java.lang.String p1) throws java.io.IOException`
- `public void scan() throws java.lang.IllegalStateException`
- `protected void scandir(java.io.File p0, java.lang.String p1, boolean p2)`
- `public void setBasedir(java.io.File p0)`
- `public void setBasedir(java.lang.String p0)`
- `public void setFollowSymlinks(boolean p0)`
- `protected void slowScan()`

---

## public abstract interface `org.codehaus.plexus.util.DirectoryWalkListener`

**Methods:**
- `public abstract void debug(java.lang.String p0)`
- `public abstract void directoryWalkFinished()`
- `public abstract void directoryWalkStarting(java.io.File p0)`
- `public abstract void directoryWalkStep(int p0, java.io.File p1)`

---

## public class `org.codehaus.plexus.util.DirectoryWalker`

**Constructors:**
- `public DirectoryWalker()`

**Methods:**
- `public void addDirectoryWalkListener(org.codehaus.plexus.util.DirectoryWalkListener p0)`
- `public void addExclude(java.lang.String p0)`
- `public void addInclude(java.lang.String p0)`
- `public void addSCMExcludes()`
- `public java.io.File getBaseDir()`
- `public java.util.List getExcludes()`
- `public java.util.List getIncludes()`
- `public void removeDirectoryWalkListener(org.codehaus.plexus.util.DirectoryWalkListener p0)`
- `public void scan()`
- `public void setBaseDir(java.io.File p0)`
- `public void setDebugMode(boolean p0)`
- `public void setExcludes(java.util.List p0)`
- `public void setIncludes(java.util.List p0)`

---

## public class `org.codehaus.plexus.util.ExceptionUtils`

**Constructors:**
- `protected ExceptionUtils()`

**Fields:**
- `protected static java.lang.String[] CAUSE_METHOD_NAMES`

**Methods:**
- `public static void addCauseMethodName(java.lang.String p0)`
- `public static java.lang.Throwable getCause(java.lang.Throwable p0)`
- `public static java.lang.Throwable getCause(java.lang.Throwable p0, java.lang.String[] p1)`
- `public static java.lang.String getFullStackTrace(java.lang.Throwable p0)`
- `public static java.lang.Throwable getRootCause(java.lang.Throwable p0)`
- `public static java.lang.String[] getRootCauseStackTrace(java.lang.Throwable p0)`
- `public static java.lang.String[] getStackFrames(java.lang.Throwable p0)`
- `public static java.lang.String getStackTrace(java.lang.Throwable p0)`
- `public static int getThrowableCount(java.lang.Throwable p0)`
- `public static java.lang.Throwable[] getThrowables(java.lang.Throwable p0)`
- `public static int indexOfThrowable(java.lang.Throwable p0, java.lang.Class p1)`
- `public static int indexOfThrowable(java.lang.Throwable p0, java.lang.Class p1, int p2)`
- `public static boolean isNestedThrowable(java.lang.Throwable p0)`
- `public static void printRootCauseStackTrace(java.lang.Throwable p0)`
- `public static void printRootCauseStackTrace(java.lang.Throwable p0, java.io.PrintStream p1)`
- `public static void printRootCauseStackTrace(java.lang.Throwable p0, java.io.PrintWriter p1)`

---

## public class `org.codehaus.plexus.util.Expand`

**Constructors:**
- `public Expand()`

**Methods:**
- `public void execute() throws java.lang.Exception`
- `protected void expandFile(java.io.File p0, java.io.File p1) throws java.lang.Exception`
- `protected void extractFile(java.io.File p0, java.io.File p1, java.io.InputStream p2, java.lang.String p3, java.util.Date p4, boolean p5) throws java.lang.Exception`
- `public void setDest(java.io.File p0)`
- `public void setOverwrite(boolean p0)`
- `public void setSrc(java.io.File p0)`

---

## public class `org.codehaus.plexus.util.FastMap`<K extends java.lang.Object, V extends java.lang.Object>
implements `java.io.Serializable`, `java.lang.Cloneable`, `java.util.Map<K,V>`  

**Constructors:**
- `public FastMap()`
- `public FastMap(int p0)`
- `public FastMap(java.util.Map p0)`

**Methods:**
- `public int capacity()`
- `public void clear()`
- `public java.lang.Object clone()`
- `public boolean containsKey(java.lang.Object p0)`
- `public boolean containsValue(java.lang.Object p0)`
- `public java.util.Set entrySet()`
- `public boolean equals(java.lang.Object p0)`
- `public V get(java.lang.Object p0)`
- `public java.util.Map$Entry getEntry(java.lang.Object p0)`
- `public int hashCode()`
- `public boolean isEmpty()`
- `public java.util.Set keySet()`
- `public java.lang.Object put(java.lang.Object p0, java.lang.Object p1)`
- `public void putAll(java.util.Map p0)`
- `public V remove(java.lang.Object p0)`
- `public void setCapacity(int p0)`
- `public int size()`
- `protected void sizeChanged()`
- `public java.lang.String toString()`
- `public java.util.Collection values()`

---

## public class `org.codehaus.plexus.util.FileUtils`
extends `org.codehaus.plexus.util.BaseFileUtils`  

**Constructors:**
- `public FileUtils()`

**Fields:**
- `public static java.lang.String FS`
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
- `public static void copyDirectory(java.io.File p0, java.io.File p1) throws java.io.IOException`
- `public static void copyDirectory(java.io.File p0, java.io.File p1, java.lang.String p2, java.lang.String p3) throws java.io.IOException`
- `public static void copyDirectoryLayout(java.io.File p0, java.io.File p1, java.lang.String[] p2, java.lang.String[] p3) throws java.io.IOException`
- `public static void copyDirectoryStructure(java.io.File p0, java.io.File p1) throws java.io.IOException`
- `public static void copyDirectoryStructureIfModified(java.io.File p0, java.io.File p1) throws java.io.IOException`
- `public static void copyFile(java.io.File p0, java.io.File p1) throws java.io.IOException`
- `public static void copyFile(java.io.File p0, java.io.File p1, java.lang.String p2, org.codehaus.plexus.util.FileUtils$FilterWrapper[] p3) throws java.io.IOException`
- `public static void copyFile(java.io.File p0, java.io.File p1, java.lang.String p2, org.codehaus.plexus.util.FileUtils$FilterWrapper[] p3, boolean p4) throws java.io.IOException`
- `public static boolean copyFileIfModified(java.io.File p0, java.io.File p1) throws java.io.IOException`
- `public static void copyFileToDirectory(java.io.File p0, java.io.File p1) throws java.io.IOException`
- `public static void copyFileToDirectory(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public static void copyFileToDirectoryIfModified(java.io.File p0, java.io.File p1) throws java.io.IOException`
- `public static void copyFileToDirectoryIfModified(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public static void copyStreamToFile(org.codehaus.plexus.util.io.InputStreamFacade p0, java.io.File p1) throws java.io.IOException`
- `public static void copyURLToFile(java.net.URL p0, java.io.File p1) throws java.io.IOException`
- `public static java.io.File createTempFile(java.lang.String p0, java.lang.String p1, java.io.File p2)`
- `public static void deleteDirectory(java.io.File p0) throws java.io.IOException`
- `public static void deleteDirectory(java.lang.String p0) throws java.io.IOException`
- `public static java.lang.String dirname(java.lang.String p0)`
- `public static java.lang.String extension(java.lang.String p0)`
- `public static void fileAppend(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public static void fileAppend(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException`
- `public static void fileDelete(java.lang.String p0)`
- `public static boolean fileExists(java.lang.String p0)`
- `public static java.lang.String fileRead(java.io.File p0) throws java.io.IOException`
- `public static java.lang.String fileRead(java.io.File p0, java.lang.String p1) throws java.io.IOException`
- `public static java.lang.String fileRead(java.lang.String p0) throws java.io.IOException`
- `public static java.lang.String fileRead(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public static void fileWrite(java.io.File p0, java.lang.String p1) throws java.io.IOException`
- `public static void fileWrite(java.io.File p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException`
- `public static void fileWrite(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public static void fileWrite(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException`
- `public static java.lang.String filename(java.lang.String p0)`
- `public static void forceDelete(java.io.File p0) throws java.io.IOException`
- `public static void forceDelete(java.lang.String p0) throws java.io.IOException`
- `public static void forceDeleteOnExit(java.io.File p0) throws java.io.IOException`
- `public static void forceMkdir(java.io.File p0) throws java.io.IOException`
- `public static java.lang.String[] getDefaultExcludes()`
- `public static java.util.List getDefaultExcludesAsList()`
- `public static java.lang.String getDefaultExcludesAsString()`
- `public static java.util.List getDirectoryNames(java.io.File p0, java.lang.String p1, java.lang.String p2, boolean p3) throws java.io.IOException`
- `public static java.util.List getDirectoryNames(java.io.File p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4) throws java.io.IOException`
- `public static java.lang.String getExtension(java.lang.String p0)`
- `public static java.io.File getFile(java.lang.String p0)`
- `public static java.util.List getFileAndDirectoryNames(java.io.File p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4, boolean p5, boolean p6) throws java.io.IOException`
- `public static java.util.List getFileNames(java.io.File p0, java.lang.String p1, java.lang.String p2, boolean p3) throws java.io.IOException`
- `public static java.util.List getFileNames(java.io.File p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4) throws java.io.IOException`
- `public static java.util.List getFiles(java.io.File p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException`
- `public static java.util.List getFiles(java.io.File p0, java.lang.String p1, java.lang.String p2, boolean p3) throws java.io.IOException`
- `public static java.lang.String[] getFilesFromExtension(java.lang.String p0, java.lang.String[] p1)`
- `public static java.lang.String getPath(java.lang.String p0)`
- `public static java.lang.String getPath(java.lang.String p0, char p1)`
- `public static boolean isValidWindowsFileName(java.io.File p0)`
- `public static void linkFile(java.io.File p0, java.io.File p1) throws java.io.IOException`
- `public static java.util.List loadFile(java.io.File p0) throws java.io.IOException`
- `public static void mkDirs(java.io.File p0, java.lang.String[] p1, java.io.File p2) throws java.io.IOException`
- `public static void mkdir(java.lang.String p0)`
- `public static java.lang.String normalize(java.lang.String p0)`
- `public static java.lang.String removeExtension(java.lang.String p0)`
- `public static java.lang.String removePath(java.lang.String p0)`
- `public static java.lang.String removePath(java.lang.String p0, char p1)`
- `public static void rename(java.io.File p0, java.io.File p1) throws java.io.IOException`
- `public static java.io.File resolveFile(java.io.File p0, java.lang.String p1)`
- `public static long sizeOfDirectory(java.io.File p0)`
- `public static long sizeOfDirectory(java.lang.String p0)`
- `public static java.io.File toFile(java.net.URL p0)`
- `public static java.net.URL[] toURLs(java.io.File[] p0) throws java.io.IOException`
- `public static boolean waitFor(java.io.File p0, int p1)`
- `public static boolean waitFor(java.lang.String p0, int p1)`

---

## public abstract static class `org.codehaus.plexus.util.FileUtils$FilterWrapper`

**Constructors:**
- `public FilterWrapper()`

**Methods:**
- `public abstract java.io.Reader getReader(java.io.Reader p0)`

---

## public final class `org.codehaus.plexus.util.IOUtil`
extends `org.codehaus.plexus.util.BaseIOUtil`  

**Methods:**
- `public static void bufferedCopy(java.io.InputStream p0, java.io.OutputStream p1) throws java.io.IOException`
- `public static void close(java.io.InputStream p0)`
- `public static void close(java.io.OutputStream p0)`
- `public static void close(java.io.Reader p0)`
- `public static void close(java.io.Writer p0)`
- `public static void close(java.nio.channels.Channel p0)`
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

## public class `org.codehaus.plexus.util.InterpolationFilterReader`
extends `java.io.FilterReader`  

**Constructors:**
- `public InterpolationFilterReader(java.io.Reader p0, java.util.Map p1, java.lang.String p2, java.lang.String p3)`
- `public InterpolationFilterReader(java.io.Reader p0, java.util.Map p1)`

**Methods:**
- `public int read() throws java.io.IOException`
- `public int read(char[] p0, int p1, int p2) throws java.io.IOException`
- `public long skip(long p0) throws java.io.IOException`

---

## public class `org.codehaus.plexus.util.LineOrientedInterpolatingReader`
extends `java.io.FilterReader`  

**Constructors:**
- `public LineOrientedInterpolatingReader(java.io.Reader p0, java.util.Map p1)`
- `public LineOrientedInterpolatingReader(java.io.Reader p0, java.util.Map p1, java.lang.String p2, java.lang.String p3)`
- `public LineOrientedInterpolatingReader(java.io.Reader p0, java.util.Map p1, java.lang.String p2, java.lang.String p3, java.lang.String p4)`

**Fields:**
- `public final static java.lang.String DEFAULT_END_DELIM`
- `public final static java.lang.String DEFAULT_ESCAPE_SEQ`
- `public final static java.lang.String DEFAULT_START_DELIM`

**Methods:**
- `public int read() throws java.io.IOException`
- `public int read(char[] p0, int p1, int p2) throws java.io.IOException`
- `public long skip(long p0) throws java.io.IOException`

---

## public class `org.codehaus.plexus.util.MatchPattern`

**Methods:**
- `public static org.codehaus.plexus.util.MatchPattern fromString(java.lang.String p0)`
- `public char[][] getTokenizedPathChars()`
- `public java.lang.String[] getTokenizedPathString()`
- `public boolean matchPath(java.lang.String p0, boolean p1)`
- `public boolean matchPatternStart(java.lang.String p0, boolean p1)`
- `public boolean startsWith(java.lang.String p0)`

---

## public class `org.codehaus.plexus.util.MatchPatterns`

**Methods:**
- `public static org.codehaus.plexus.util.MatchPatterns from(java.lang.Iterable p0)`
- `public static org.codehaus.plexus.util.MatchPatterns from(java.lang.String... p0)`
- `public boolean matches(java.lang.String p0, boolean p1)`
- `public boolean matches(java.lang.String p0, char[][] p1, boolean p2)`
- `public boolean matches(java.lang.String p0, java.lang.String[] p1, boolean p2)`
- `public boolean matchesPatternStart(java.lang.String p0, boolean p1)`

---

## public class `org.codehaus.plexus.util.NioFiles`

**Constructors:**
- `public NioFiles()`

**Methods:**
- `public static void chmod(java.io.File p0, int p1) throws java.io.IOException`
- `public static java.io.File copy(java.io.File p0, java.io.File p1) throws java.io.IOException`
- `public static java.io.File createSymbolicLink(java.io.File p0, java.io.File p1) throws java.io.IOException`
- `public static boolean deleteIfExists(java.io.File p0) throws java.io.IOException`
- `public static long getLastModified(java.io.File p0) throws java.io.IOException`
- `public static boolean isSymbolicLink(java.io.File p0)`
- `public static java.io.File readSymbolicLink(java.io.File p0) throws java.io.IOException`

---

## public class `org.codehaus.plexus.util.Os`

**Constructors:**
- `public Os()`
- `public Os(java.lang.String p0)`

**Fields:**
- `public final static java.lang.String FAMILY_DOS`
- `public final static java.lang.String FAMILY_MAC`
- `public final static java.lang.String FAMILY_NETWARE`
- `public final static java.lang.String FAMILY_OPENVMS`
- `public final static java.lang.String FAMILY_OS2`
- `public final static java.lang.String FAMILY_OS400`
- `public final static java.lang.String FAMILY_TANDEM`
- `public final static java.lang.String FAMILY_UNIX`
- `public final static java.lang.String FAMILY_WIN9X`
- `public final static java.lang.String FAMILY_WINDOWS`
- `public final static java.lang.String FAMILY_ZOS`
- `public final static java.lang.String OS_ARCH`
- `public final static java.lang.String OS_FAMILY`
- `public final static java.lang.String OS_NAME`
- `public final static java.lang.String OS_VERSION`

**Methods:**
- `public boolean eval() throws java.lang.Exception`
- `public static java.util.Set getValidFamilies()`
- `public static boolean isArch(java.lang.String p0)`
- `public static boolean isFamily(java.lang.String p0)`
- `public static boolean isName(java.lang.String p0)`
- `public static boolean isOs(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3)`
- `public static boolean isValidFamily(java.lang.String p0)`
- `public static boolean isVersion(java.lang.String p0)`
- `public void setArch(java.lang.String p0)`
- `public void setFamily(java.lang.String p0)`
- `public void setName(java.lang.String p0)`
- `public void setVersion(java.lang.String p0)`

---

## public class `org.codehaus.plexus.util.PathTool`

**Constructors:**
- `public PathTool()`

**Methods:**
- `public final static java.lang.String calculateLink(java.lang.String p0, java.lang.String p1)`
- `public final static java.lang.String getDirectoryComponent(java.lang.String p0)`
- `public final static java.lang.String getRelativeFilePath(java.lang.String p0, java.lang.String p1)`
- `public final static java.lang.String getRelativePath(java.lang.String p0)`
- `public final static java.lang.String getRelativePath(java.lang.String p0, java.lang.String p1)`
- `public final static java.lang.String getRelativeWebPath(java.lang.String p0, java.lang.String p1)`

---

## public class `org.codehaus.plexus.util.PropertyUtils`

**Constructors:**
- `public PropertyUtils()`

**Methods:**
- `public static java.util.Properties loadProperties(java.io.File p0) throws java.io.IOException`
- `public static java.util.Properties loadProperties(java.io.InputStream p0) throws java.io.IOException`
- `public static java.util.Properties loadProperties(java.net.URL p0) throws java.io.IOException`

---

## public class `org.codehaus.plexus.util.ReaderFactory`
annotations: @java.lang.Deprecated  

**Constructors:**
- `public ReaderFactory()`

**Fields:**
- `public final static java.lang.String FILE_ENCODING`
- `public final static java.lang.String ISO_8859_1`
- `public final static java.lang.String US_ASCII`
- `public final static java.lang.String UTF_16`
- `public final static java.lang.String UTF_16BE`
- `public final static java.lang.String UTF_16LE`
- `public final static java.lang.String UTF_8`

**Methods:**
- `public static java.io.Reader newPlatformReader(java.io.File p0) throws java.io.IOException`
- `public static java.io.Reader newPlatformReader(java.io.InputStream p0)`
- `public static java.io.Reader newPlatformReader(java.net.URL p0) throws java.io.IOException`
- `public static java.io.Reader newReader(java.io.File p0, java.lang.String p1) throws java.io.IOException`
- `public static java.io.Reader newReader(java.io.InputStream p0, java.lang.String p1) throws java.io.UnsupportedEncodingException`
- `public static java.io.Reader newReader(java.net.URL p0, java.lang.String p1) throws java.io.IOException`
- `public static org.codehaus.plexus.util.xml.XmlStreamReader newXmlReader(java.io.File p0) throws java.io.IOException`
- `public static org.codehaus.plexus.util.xml.XmlStreamReader newXmlReader(java.io.InputStream p0) throws java.io.IOException`
- `public static org.codehaus.plexus.util.xml.XmlStreamReader newXmlReader(java.net.URL p0) throws java.io.IOException`

---

## public final class `org.codehaus.plexus.util.ReflectionUtils`

**Constructors:**
- `public ReflectionUtils()`

**Methods:**
- `public static java.lang.reflect.Field getFieldByNameIncludingSuperclasses(java.lang.String p0, java.lang.Class p1)`
- `public static java.util.List getFieldsIncludingSuperclasses(java.lang.Class p0)`
- `public static java.lang.reflect.Method getSetter(java.lang.String p0, java.lang.Class p1)`
- `public static java.lang.Class getSetterType(java.lang.reflect.Method p0)`
- `public static java.util.List getSetters(java.lang.Class p0)`
- `public static java.lang.Object getValueIncludingSuperclasses(java.lang.String p0, java.lang.Object p1) throws java.lang.IllegalAccessException`
- `public static java.util.Map getVariablesAndValuesIncludingSuperclasses(java.lang.Object p0) throws java.lang.IllegalAccessException`
- `public static boolean isSetter(java.lang.reflect.Method p0)`
- `public static void setVariableValueInObject(java.lang.Object p0, java.lang.String p1, java.lang.Object p2) throws java.lang.IllegalAccessException`

---

## public abstract interface `org.codehaus.plexus.util.Scanner`

**Methods:**
- `public abstract void addDefaultExcludes()`
- `public abstract java.io.File getBasedir()`
- `public abstract java.lang.String[] getIncludedDirectories()`
- `public abstract java.lang.String[] getIncludedFiles()`
- `public abstract void scan()`
- `public abstract void setExcludes(java.lang.String[] p0)`
- `public abstract void setFilenameComparator(java.util.Comparator p0)`
- `public abstract void setIncludes(java.lang.String[] p0)`

---

## public final class `org.codehaus.plexus.util.SelectorUtils`

**Fields:**
- `public final static java.lang.String ANT_HANDLER_PREFIX`
- `public final static java.lang.String PATTERN_HANDLER_PREFIX`
- `public final static java.lang.String PATTERN_HANDLER_SUFFIX`
- `public final static java.lang.String REGEX_HANDLER_PREFIX`

**Methods:**
- `public static org.codehaus.plexus.util.SelectorUtils getInstance()`
- `public static boolean isOutOfDate(java.io.File p0, java.io.File p1, int p2)`
- `public static boolean match(char[] p0, char[] p1, boolean p2)`
- `public static boolean match(java.lang.String p0, java.lang.String p1)`
- `public static boolean match(java.lang.String p0, java.lang.String p1, boolean p2)`
- `public static boolean matchPath(java.lang.String p0, java.lang.String p1)`
- `public static boolean matchPath(java.lang.String p0, java.lang.String p1, boolean p2)`
- `public static boolean matchPath(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3)`
- `public static boolean matchPatternStart(java.lang.String p0, java.lang.String p1)`
- `public static boolean matchPatternStart(java.lang.String p0, java.lang.String p1, boolean p2)`
- `public static java.lang.String removeWhitespace(java.lang.String p0)`

---

## public class `org.codehaus.plexus.util.StringInputStream`
annotations: @java.lang.Deprecated  
extends `java.io.InputStream`  

**Constructors:**
- `public StringInputStream(java.lang.String p0)`

**Methods:**
- `public void close() throws java.io.IOException`
- `public synchronized void mark(int p0)`
- `public boolean markSupported()`
- `public int read() throws java.io.IOException`
- `public synchronized void reset() throws java.io.IOException`

---

## public class `org.codehaus.plexus.util.StringOutputStream`
annotations: @java.lang.Deprecated  
extends `java.io.OutputStream`  

**Constructors:**
- `public StringOutputStream()`

**Methods:**
- `public java.lang.String toString()`
- `public void write(byte[] p0) throws java.io.IOException`
- `public void write(byte[] p0, int p1, int p2) throws java.io.IOException`
- `public void write(int p0) throws java.io.IOException`

---

## public class `org.codehaus.plexus.util.StringUtils`

**Constructors:**
- `public StringUtils()`

**Methods:**
- `public static java.lang.String abbreviate(java.lang.String p0, int p1)`
- `public static java.lang.String abbreviate(java.lang.String p0, int p1, int p2)`
- `public static java.lang.String addAndDeHump(java.lang.String p0)`
- `public static java.lang.String capitalise(java.lang.String p0)`
- `public static java.lang.String capitaliseAllWords(java.lang.String p0)`
- `public static java.lang.String capitalizeFirstLetter(java.lang.String p0)`
- `public static java.lang.String center(java.lang.String p0, int p1)`
- `public static java.lang.String center(java.lang.String p0, int p1, java.lang.String p2)`
- `public static java.lang.String chomp(java.lang.String p0)`
- `public static java.lang.String chomp(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String chompLast(java.lang.String p0)`
- `public static java.lang.String chompLast(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String chop(java.lang.String p0)`
- `public static java.lang.String chopNewline(java.lang.String p0)`
- `public static java.lang.String clean(java.lang.String p0)`
- `public static java.lang.String concatenate(java.lang.Object[] p0)`
- `public static boolean contains(java.lang.String p0, char p1)`
- `public static boolean contains(java.lang.String p0, java.lang.String p1)`
- `public static int countMatches(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String defaultString(java.lang.Object p0)`
- `public static java.lang.String defaultString(java.lang.Object p0, java.lang.String p1)`
- `public static java.lang.String deleteWhitespace(java.lang.String p0)`
- `public static java.lang.String difference(java.lang.String p0, java.lang.String p1)`
- `public static int differenceAt(java.lang.String p0, java.lang.String p1)`
- `public static boolean equals(java.lang.String p0, java.lang.String p1)`
- `public static boolean equalsIgnoreCase(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String escape(java.lang.String p0)`
- `public static java.lang.String escape(java.lang.String p0, char[] p1, char p2)`
- `public static java.lang.String escape(java.lang.String p0, char[] p1, java.lang.String p2)`
- `public static java.lang.String getChomp(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String getNestedString(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String getNestedString(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public static java.lang.String getPrechomp(java.lang.String p0, java.lang.String p1)`
- `public static int indexOfAny(java.lang.String p0, java.lang.String[] p1)`
- `public static java.lang.String interpolate(java.lang.String p0, java.util.Map p1)`
- `public static boolean isAlpha(java.lang.String p0)`
- `public static boolean isAlphaSpace(java.lang.String p0)`
- `public static boolean isAlphanumeric(java.lang.String p0)`
- `public static boolean isAlphanumericSpace(java.lang.String p0)`
- `public static boolean isBlank(java.lang.String p0)`
- `public static boolean isEmpty(java.lang.String p0)`
- `public static boolean isNotBlank(java.lang.String p0)`
- `public static boolean isNotEmpty(java.lang.String p0)`
- `public static boolean isNumeric(java.lang.String p0)`
- `public static boolean isNumericSpace(java.lang.String p0)`
- `public static boolean isWhitespace(java.lang.String p0)`
- `public static java.lang.String join(java.lang.Object[] p0, java.lang.String p1)`
- `public static java.lang.String join(java.util.Iterator p0, java.lang.String p1)`
- `public static int lastIndexOfAny(java.lang.String p0, java.lang.String[] p1)`
- `public static java.lang.String left(java.lang.String p0, int p1)`
- `public static java.lang.String leftPad(java.lang.String p0, int p1)`
- `public static java.lang.String leftPad(java.lang.String p0, int p1, java.lang.String p2)`
- `public static java.lang.String lowerCase(java.lang.String p0)`
- `public static java.lang.String lowercaseFirstLetter(java.lang.String p0)`
- `public static java.lang.String mid(java.lang.String p0, int p1, int p2)`
- `public static java.lang.String overlayString(java.lang.String p0, java.lang.String p1, int p2, int p3)`
- `public static java.lang.String prechomp(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String quoteAndEscape(java.lang.String p0, char p1)`
- `public static java.lang.String quoteAndEscape(java.lang.String p0, char p1, char[] p2)`
- `public static java.lang.String quoteAndEscape(java.lang.String p0, char p1, char[] p2, char p3, boolean p4)`
- `public static java.lang.String quoteAndEscape(java.lang.String p0, char p1, char[] p2, char[] p3, char p4, boolean p5)`
- `public static java.lang.String quoteAndEscape(java.lang.String p0, char p1, char[] p2, char[] p3, java.lang.String p4, boolean p5)`
- `public static java.lang.String removeAndHump(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String removeDuplicateWhitespace(java.lang.String p0)`
- `public static java.lang.String repeat(java.lang.String p0, int p1)`
- `public static java.lang.String replace(java.lang.String p0, char p1, char p2)`
- `public static java.lang.String replace(java.lang.String p0, char p1, char p2, int p3)`
- `public static java.lang.String replace(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public static java.lang.String replace(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3)`
- `public static java.lang.String replaceOnce(java.lang.String p0, char p1, char p2)`
- `public static java.lang.String replaceOnce(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public static java.lang.String reverse(java.lang.String p0)`
- `public static java.lang.String reverseDelimitedString(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String right(java.lang.String p0, int p1)`
- `public static java.lang.String rightPad(java.lang.String p0, int p1)`
- `public static java.lang.String rightPad(java.lang.String p0, int p1, java.lang.String p2)`
- `public static java.lang.String[] split(java.lang.String p0)`
- `public static java.lang.String[] split(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String[] split(java.lang.String p0, java.lang.String p1, int p2)`
- `public static java.lang.String strip(java.lang.String p0)`
- `public static java.lang.String strip(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String[] stripAll(java.lang.String[] p0)`
- `public static java.lang.String[] stripAll(java.lang.String[] p0, java.lang.String p1)`
- `public static java.lang.String stripEnd(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String stripStart(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String substring(java.lang.String p0, int p1)`
- `public static java.lang.String substring(java.lang.String p0, int p1, int p2)`
- `public static java.lang.String swapCase(java.lang.String p0)`
- `public static java.lang.String trim(java.lang.String p0)`
- `public static java.lang.String uncapitalise(java.lang.String p0)`
- `public static java.lang.String uncapitaliseAllWords(java.lang.String p0)`
- `public static java.lang.String unifyLineSeparators(java.lang.String p0)`
- `public static java.lang.String unifyLineSeparators(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String upperCase(java.lang.String p0)`

---

## public class `org.codehaus.plexus.util.SweeperPool`

**Constructors:**
- `public SweeperPool(int p0, int p1, int p2, int p3, int p4)`

**Methods:**
- `public void dispose()`
- `public synchronized java.lang.Object get()`
- `public synchronized int getSize()`
- `public void objectAdded(java.lang.Object p0)`
- `public void objectDisposed(java.lang.Object p0)`
- `public void objectRetrieved(java.lang.Object p0)`
- `public synchronized boolean put(java.lang.Object p0)`
- `public synchronized void trim()`

---

## public final class `org.codehaus.plexus.util.TypeFormat`

**Methods:**
- `public static java.lang.StringBuffer format(boolean p0, java.lang.StringBuffer p1)`
- `public static java.lang.StringBuffer format(double p0, double p1, java.lang.StringBuffer p2)`
- `public static java.lang.StringBuffer format(double p0, int p1, java.lang.StringBuffer p2)`
- `public static java.lang.StringBuffer format(double p0, java.lang.StringBuffer p1)`
- `public static java.lang.StringBuffer format(float p0, float p1, java.lang.StringBuffer p2)`
- `public static java.lang.StringBuffer format(float p0, java.lang.StringBuffer p1)`
- `public static java.lang.StringBuffer format(int p0, int p1, java.lang.StringBuffer p2)`
- `public static java.lang.StringBuffer format(int p0, java.lang.StringBuffer p1)`
- `public static java.lang.StringBuffer format(long p0, int p1, java.lang.StringBuffer p2)`
- `public static java.lang.StringBuffer format(long p0, java.lang.StringBuffer p1)`
- `public static java.lang.StringBuffer format(short p0, int p1, java.lang.StringBuffer p2)`
- `public static java.lang.StringBuffer format(short p0, java.lang.StringBuffer p1)`
- `public static int indexOf(java.lang.CharSequence p0, java.lang.CharSequence p1, int p2)`
- `public static boolean parseBoolean(java.lang.CharSequence p0)`
- `public static double parseDouble(java.lang.CharSequence p0) throws java.lang.NumberFormatException`
- `public static float parseFloat(java.lang.CharSequence p0)`
- `public static int parseInt(java.lang.CharSequence p0)`
- `public static int parseInt(java.lang.CharSequence p0, int p1)`
- `public static long parseLong(java.lang.CharSequence p0)`
- `public static long parseLong(java.lang.CharSequence p0, int p1)`
- `public static short parseShort(java.lang.CharSequence p0)`
- `public static short parseShort(java.lang.CharSequence p0, int p1)`

---

## public class `org.codehaus.plexus.util.WriterFactory`
annotations: @java.lang.Deprecated  

**Constructors:**
- `public WriterFactory()`

**Fields:**
- `public final static java.lang.String FILE_ENCODING`
- `public final static java.lang.String ISO_8859_1`
- `public final static java.lang.String US_ASCII`
- `public final static java.lang.String UTF_16`
- `public final static java.lang.String UTF_16BE`
- `public final static java.lang.String UTF_16LE`
- `public final static java.lang.String UTF_8`

**Methods:**
- `public static java.io.Writer newPlatformWriter(java.io.File p0) throws java.io.IOException`
- `public static java.io.Writer newPlatformWriter(java.io.OutputStream p0)`
- `public static java.io.Writer newWriter(java.io.File p0, java.lang.String p1) throws java.io.IOException`
- `public static java.io.Writer newWriter(java.io.OutputStream p0, java.lang.String p1) throws java.io.UnsupportedEncodingException`
- `public static org.codehaus.plexus.util.xml.XmlStreamWriter newXmlWriter(java.io.File p0) throws java.io.IOException`
- `public static org.codehaus.plexus.util.xml.XmlStreamWriter newXmlWriter(java.io.OutputStream p0) throws java.io.IOException`

---

## public class `org.codehaus.plexus.util.cli.AbstractStreamHandler`
extends `java.lang.Thread`  

**Constructors:**
- `public AbstractStreamHandler()`

**Methods:**
- `public void disable()`
- `protected boolean isDisabled()`
- `public boolean isDone()`
- `public void setDone()`
- `public synchronized void waitUntilDone() throws java.lang.InterruptedException`

---

## public abstract interface `org.codehaus.plexus.util.cli.Arg`

**Methods:**
- `public abstract java.lang.String[] getParts()`
- `public abstract void setFile(java.io.File p0)`
- `public abstract void setLine(java.lang.String p0)`
- `public abstract void setValue(java.lang.String p0)`

---

## public abstract interface `org.codehaus.plexus.util.cli.CommandLineCallable`
implements `java.util.concurrent.Callable<java.lang.Integer>`  

**Methods:**
- `public abstract java.lang.Integer call() throws org.codehaus.plexus.util.cli.CommandLineException`

---

## public class `org.codehaus.plexus.util.cli.CommandLineException`
extends `java.lang.Exception`  

**Constructors:**
- `public CommandLineException(java.lang.String p0)`
- `public CommandLineException(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `org.codehaus.plexus.util.cli.CommandLineTimeOutException`
extends `org.codehaus.plexus.util.cli.CommandLineException`  

**Constructors:**
- `public CommandLineTimeOutException(java.lang.String p0)`
- `public CommandLineTimeOutException(java.lang.String p0, java.lang.Throwable p1)`

---

## public abstract class `org.codehaus.plexus.util.cli.CommandLineUtils`

**Constructors:**
- `public CommandLineUtils()`

**Methods:**
- `public static int executeCommandLine(org.codehaus.plexus.util.cli.Commandline p0, java.io.InputStream p1, org.codehaus.plexus.util.cli.StreamConsumer p2, org.codehaus.plexus.util.cli.StreamConsumer p3) throws org.codehaus.plexus.util.cli.CommandLineException`
- `public static int executeCommandLine(org.codehaus.plexus.util.cli.Commandline p0, java.io.InputStream p1, org.codehaus.plexus.util.cli.StreamConsumer p2, org.codehaus.plexus.util.cli.StreamConsumer p3, int p4) throws org.codehaus.plexus.util.cli.CommandLineException`
- `public static int executeCommandLine(org.codehaus.plexus.util.cli.Commandline p0, org.codehaus.plexus.util.cli.StreamConsumer p1, org.codehaus.plexus.util.cli.StreamConsumer p2) throws org.codehaus.plexus.util.cli.CommandLineException`
- `public static int executeCommandLine(org.codehaus.plexus.util.cli.Commandline p0, org.codehaus.plexus.util.cli.StreamConsumer p1, org.codehaus.plexus.util.cli.StreamConsumer p2, int p3) throws org.codehaus.plexus.util.cli.CommandLineException`
- `public static org.codehaus.plexus.util.cli.CommandLineCallable executeCommandLineAsCallable(org.codehaus.plexus.util.cli.Commandline p0, java.io.InputStream p1, org.codehaus.plexus.util.cli.StreamConsumer p2, org.codehaus.plexus.util.cli.StreamConsumer p3, int p4) throws org.codehaus.plexus.util.cli.CommandLineException`
- `public static java.util.Properties getSystemEnvVars()`
- `public static java.util.Properties getSystemEnvVars(boolean p0)`
- `public static boolean isAlive(java.lang.Process p0)`
- `public static java.lang.String quote(java.lang.String p0) throws org.codehaus.plexus.util.cli.CommandLineException`
- `public static java.lang.String quote(java.lang.String p0, boolean p1) throws org.codehaus.plexus.util.cli.CommandLineException`
- `public static java.lang.String quote(java.lang.String p0, boolean p1, boolean p2, boolean p3) throws org.codehaus.plexus.util.cli.CommandLineException`
- `public static java.lang.String toString(java.lang.String[] p0)`
- `public static java.lang.String[] translateCommandline(java.lang.String p0) throws java.lang.Exception`

---

## public static class `org.codehaus.plexus.util.cli.CommandLineUtils$StringStreamConsumer`
implements `org.codehaus.plexus.util.cli.StreamConsumer`  

**Constructors:**
- `public StringStreamConsumer()`

**Methods:**
- `public void consumeLine(java.lang.String p0)`
- `public java.lang.String getOutput()`

---

## public class `org.codehaus.plexus.util.cli.Commandline`
implements `java.lang.Cloneable`  

**Constructors:**
- `public Commandline()`
- `public Commandline(java.lang.String p0)`
- `public Commandline(java.lang.String p0, org.codehaus.plexus.util.cli.shell.Shell p1)`
- `public Commandline(org.codehaus.plexus.util.cli.shell.Shell p0)`

**Fields:**
- `protected final static java.lang.String OS_NAME`
- `protected final static java.lang.String WINDOWS`
- `protected java.util.Vector arguments`
- `protected java.util.Map envVars`
- `protected java.lang.String executable`

**Methods:**
- `public void addArg(org.codehaus.plexus.util.cli.Arg p0)`
- `public void addArg(org.codehaus.plexus.util.cli.Arg p0, boolean p1)`
- `public void addArguments(java.lang.String[] p0)`
- `public void addEnvironment(java.lang.String p0, java.lang.String p1)`
- `public void addSystemEnvironment() throws java.lang.Exception`
- `public void clear()`
- `public void clearArgs()`
- `public java.lang.Object clone()`
- `public org.codehaus.plexus.util.cli.Arg createArg()`
- `public org.codehaus.plexus.util.cli.Arg createArg(boolean p0)`
- `public org.codehaus.plexus.util.cli.Commandline$Argument createArgument()`
- `public org.codehaus.plexus.util.cli.Commandline$Argument createArgument(boolean p0)`
- `public org.codehaus.plexus.util.cli.Commandline$Marker createMarker()`
- `public java.lang.Process execute() throws org.codehaus.plexus.util.cli.CommandLineException`
- `public java.lang.String[] getArguments()`
- `public java.lang.String[] getCommandline()`
- `public java.lang.String[] getEnvironmentVariables() throws org.codehaus.plexus.util.cli.CommandLineException`
- `public java.lang.String getExecutable()`
- `public java.lang.String getLiteralExecutable()`
- `public long getPid()`
- `public java.lang.String[] getRawCommandline()`
- `public org.codehaus.plexus.util.cli.shell.Shell getShell()`
- `public java.lang.String[] getShellCommandline()`
- `public java.util.Properties getSystemEnvVars() throws java.lang.Exception`
- `public java.io.File getWorkingDirectory()`
- `public static java.lang.String quoteArgument(java.lang.String p0) throws org.codehaus.plexus.util.cli.CommandLineException`
- `public void setExecutable(java.lang.String p0)`
- `public void setPid(long p0)`
- `public void setShell(org.codehaus.plexus.util.cli.shell.Shell p0)`
- `public void setWorkingDirectory(java.io.File p0)`
- `public void setWorkingDirectory(java.lang.String p0)`
- `public int size()`
- `public java.lang.String toString()`
- `public static java.lang.String toString(java.lang.String[] p0)`
- `public static java.lang.String[] translateCommandline(java.lang.String p0) throws java.lang.Exception`

---

## public static class `org.codehaus.plexus.util.cli.Commandline$Argument`
implements `org.codehaus.plexus.util.cli.Arg`  

**Constructors:**
- `public Argument()`

**Methods:**
- `public java.lang.String[] getParts()`
- `public void setFile(java.io.File p0)`
- `public void setLine(java.lang.String p0)`
- `public void setValue(java.lang.String p0)`

---

## public class `org.codehaus.plexus.util.cli.Commandline$Marker`

**Methods:**
- `public int getPosition()`

---

## public class `org.codehaus.plexus.util.cli.DefaultConsumer`
implements `org.codehaus.plexus.util.cli.StreamConsumer`  

**Constructors:**
- `public DefaultConsumer()`

**Methods:**
- `public void consumeLine(java.lang.String p0) throws java.io.IOException`

---

## public final class `org.codehaus.plexus.util.cli.EnhancedStringTokenizer`

**Constructors:**
- `public EnhancedStringTokenizer(java.lang.String p0)`
- `public EnhancedStringTokenizer(java.lang.String p0, java.lang.String p1)`
- `public EnhancedStringTokenizer(java.lang.String p0, java.lang.String p1, boolean p2)`

**Methods:**
- `public boolean hasMoreTokens()`
- `public java.lang.String nextToken()`

---

## public abstract interface `org.codehaus.plexus.util.cli.StreamConsumer`

**Methods:**
- `public abstract void consumeLine(java.lang.String p0) throws java.io.IOException`

---

## public class `org.codehaus.plexus.util.cli.StreamFeeder`
extends `org.codehaus.plexus.util.cli.AbstractStreamHandler`  

**Constructors:**
- `public StreamFeeder(java.io.InputStream p0, java.io.OutputStream p1)`

**Methods:**
- `public void close()`
- `public java.lang.Throwable getException()`
- `public void run()`

---

## public class `org.codehaus.plexus.util.cli.StreamPumper`
extends `org.codehaus.plexus.util.cli.AbstractStreamHandler`  

**Constructors:**
- `public StreamPumper(java.io.InputStream p0)`
- `public StreamPumper(java.io.InputStream p0, java.io.PrintWriter p1)`
- `public StreamPumper(java.io.InputStream p0, java.io.PrintWriter p1, org.codehaus.plexus.util.cli.StreamConsumer p2)`
- `public StreamPumper(java.io.InputStream p0, org.codehaus.plexus.util.cli.StreamConsumer p1)`

**Methods:**
- `public void close()`
- `public void flush()`
- `public java.lang.Exception getException()`
- `public void run()`

---

## public class `org.codehaus.plexus.util.cli.WriterStreamConsumer`
implements `org.codehaus.plexus.util.cli.StreamConsumer`  

**Constructors:**
- `public WriterStreamConsumer(java.io.Writer p0)`

**Methods:**
- `public void consumeLine(java.lang.String p0)`

---

## public class `org.codehaus.plexus.util.cli.shell.BourneShell`
extends `org.codehaus.plexus.util.cli.shell.Shell`  

**Constructors:**
- `public BourneShell()`
- `public BourneShell(boolean p0)`

**Methods:**
- `public java.lang.String getExecutable()`
- `protected java.lang.String getExecutionPreamble()`
- `public java.lang.String[] getShellArgs()`
- `public java.util.List getShellArgsList()`
- `protected java.lang.String quoteOneItem(java.lang.String p0, boolean p1)`

---

## public class `org.codehaus.plexus.util.cli.shell.CmdShell`
extends `org.codehaus.plexus.util.cli.shell.Shell`  

**Constructors:**
- `public CmdShell()`

**Methods:**
- `public java.util.List getCommandLine(java.lang.String p0, java.lang.String[] p1)`

---

## public class `org.codehaus.plexus.util.cli.shell.CommandShell`
extends `org.codehaus.plexus.util.cli.shell.Shell`  

**Constructors:**
- `public CommandShell()`

---

## public class `org.codehaus.plexus.util.cli.shell.Shell`
implements `java.lang.Cloneable`  

**Constructors:**
- `public Shell()`

**Methods:**
- `public void addShellArg(java.lang.String p0)`
- `public void clearArguments()`
- `public java.lang.Object clone()`
- `protected java.lang.String getArgumentEscapePattern()`
- `protected char getArgumentQuoteDelimiter()`
- `public java.util.List getCommandLine(java.lang.String p0, java.lang.String[] p1)`
- `protected char[] getEscapeChars(boolean p0, boolean p1)`
- `public java.lang.String getExecutable()`
- `protected char getExecutableQuoteDelimiter()`
- `protected java.lang.String getExecutionPreamble()`
- `public java.util.List getOriginalCommandLine(java.lang.String p0, java.lang.String[] p1)`
- `public java.lang.String getOriginalExecutable()`
- `protected char[] getQuotingTriggerChars()`
- `protected java.util.List getRawCommandLine(java.lang.String p0, java.lang.String[] p1)`
- `public java.lang.String[] getShellArgs()`
- `public java.util.List getShellArgsList()`
- `public java.lang.String getShellCommand()`
- `public java.util.List getShellCommandLine(java.lang.String[] p0)`
- `public java.io.File getWorkingDirectory()`
- `public java.lang.String getWorkingDirectoryAsString()`
- `protected boolean isDoubleQuotedArgumentEscaped()`
- `protected boolean isDoubleQuotedExecutableEscaped()`
- `public boolean isQuotedArgumentsEnabled()`
- `public boolean isQuotedExecutableEnabled()`
- `protected boolean isSingleQuotedArgumentEscaped()`
- `protected boolean isSingleQuotedExecutableEscaped()`
- `protected java.lang.String quoteOneItem(java.lang.String p0, boolean p1)`
- `protected void setArgumentEscapePattern(java.lang.String p0)`
- `protected void setArgumentQuoteDelimiter(char p0)`
- `protected void setDoubleQuotedArgumentEscaped(boolean p0)`
- `protected void setDoubleQuotedExecutableEscaped(boolean p0)`
- `public void setExecutable(java.lang.String p0)`
- `protected void setExecutableQuoteDelimiter(char p0)`
- `public void setQuotedArgumentsEnabled(boolean p0)`
- `public void setQuotedExecutableEnabled(boolean p0)`
- `public void setShellArgs(java.lang.String[] p0)`
- `public void setShellCommand(java.lang.String p0)`
- `protected void setSingleQuotedArgumentEscaped(boolean p0)`
- `protected void setSingleQuotedExecutableEscaped(boolean p0)`
- `public void setUnconditionalQuoting(boolean p0)`
- `public void setWorkingDirectory(java.io.File p0)`
- `public void setWorkingDirectory(java.lang.String p0)`

---

## public class `org.codehaus.plexus.util.dag.CycleDetectedException`
extends `java.lang.Exception`  

**Constructors:**
- `public CycleDetectedException(java.lang.String p0, java.util.List p1)`

**Methods:**
- `public java.lang.String cycleToString()`
- `public java.util.List getCycle()`
- `public java.lang.String getMessage()`

---

## public class `org.codehaus.plexus.util.dag.CycleDetector`

**Constructors:**
- `public CycleDetector()`

**Methods:**
- `public static java.util.List hasCycle(org.codehaus.plexus.util.dag.DAG p0)`
- `public static java.util.List introducesCycle(org.codehaus.plexus.util.dag.Vertex p0)`
- `public static java.util.List introducesCycle(org.codehaus.plexus.util.dag.Vertex p0, java.util.Map p1)`

---

## public class `org.codehaus.plexus.util.dag.DAG`
implements `java.io.Serializable`, `java.lang.Cloneable`  

**Constructors:**
- `public DAG()`

**Methods:**
- `public void addEdge(java.lang.String p0, java.lang.String p1) throws org.codehaus.plexus.util.dag.CycleDetectedException`
- `public void addEdge(org.codehaus.plexus.util.dag.Vertex p0, org.codehaus.plexus.util.dag.Vertex p1) throws org.codehaus.plexus.util.dag.CycleDetectedException`
- `public org.codehaus.plexus.util.dag.Vertex addVertex(java.lang.String p0)`
- `public java.lang.Object clone() throws java.lang.CloneNotSupportedException`
- `public java.util.List getChildLabels(java.lang.String p0)`
- `public java.util.Set getLabels()`
- `public java.util.List getParentLabels(java.lang.String p0)`
- `public java.util.List getSuccessorLabels(java.lang.String p0)`
- `public org.codehaus.plexus.util.dag.Vertex getVertex(java.lang.String p0)`
- `public java.util.List getVertices()`
- `public java.util.List getVerticies()`
- `public boolean hasEdge(java.lang.String p0, java.lang.String p1)`
- `public boolean isConnected(java.lang.String p0)`
- `public void removeEdge(java.lang.String p0, java.lang.String p1)`
- `public void removeEdge(org.codehaus.plexus.util.dag.Vertex p0, org.codehaus.plexus.util.dag.Vertex p1)`

---

## public class `org.codehaus.plexus.util.dag.TopologicalSorter`

**Constructors:**
- `public TopologicalSorter()`

**Methods:**
- `public static java.util.List sort(org.codehaus.plexus.util.dag.DAG p0)`
- `public static java.util.List sort(org.codehaus.plexus.util.dag.Vertex p0)`

---

## public class `org.codehaus.plexus.util.dag.Vertex`
implements `java.io.Serializable`, `java.lang.Cloneable`  

**Constructors:**
- `public Vertex(java.lang.String p0)`

**Methods:**
- `public void addEdgeFrom(org.codehaus.plexus.util.dag.Vertex p0)`
- `public void addEdgeTo(org.codehaus.plexus.util.dag.Vertex p0)`
- `public java.lang.Object clone() throws java.lang.CloneNotSupportedException`
- `public java.util.List getChildLabels()`
- `public java.util.List getChildren()`
- `public java.lang.String getLabel()`
- `public java.util.List getParentLabels()`
- `public java.util.List getParents()`
- `public boolean isConnected()`
- `public boolean isLeaf()`
- `public boolean isRoot()`
- `public void removeEdgeFrom(org.codehaus.plexus.util.dag.Vertex p0)`
- `public void removeEdgeTo(org.codehaus.plexus.util.dag.Vertex p0)`
- `public java.lang.String toString()`

---

## public class `org.codehaus.plexus.util.introspection.ClassMap`

**Constructors:**
- `public ClassMap(java.lang.Class p0)`

**Methods:**
- `public java.lang.reflect.Method findMethod(java.lang.String p0, java.lang.Object[] p1) throws org.codehaus.plexus.util.introspection.MethodMap$AmbiguousException`
- `public static java.lang.reflect.Method getPublicMethod(java.lang.reflect.Method p0)`

---

## public class `org.codehaus.plexus.util.introspection.MethodMap`

**Constructors:**
- `public MethodMap()`

**Methods:**
- `public void add(java.lang.reflect.Method p0)`
- `public java.lang.reflect.Method find(java.lang.String p0, java.lang.Object[] p1) throws org.codehaus.plexus.util.introspection.MethodMap$AmbiguousException`
- `public java.util.List get(java.lang.String p0)`

---

## public static class `org.codehaus.plexus.util.introspection.MethodMap$AmbiguousException`
extends `java.lang.Exception`  

**Constructors:**
- `public AmbiguousException()`

---

## public class `org.codehaus.plexus.util.introspection.ReflectionValueExtractor`

**Methods:**
- `public static java.lang.Object evaluate(java.lang.String p0, java.lang.Object p1) throws java.lang.Exception`
- `public static java.lang.Object evaluate(java.lang.String p0, java.lang.Object p1, boolean p2) throws java.lang.Exception`

---

## public class `org.codehaus.plexus.util.io.CachingOutputStream`
extends `java.io.OutputStream`  

**Constructors:**
- `public CachingOutputStream(java.io.File p0) throws java.io.IOException`
- `public CachingOutputStream(java.nio.file.Path p0) throws java.io.IOException`
- `public CachingOutputStream(java.nio.file.Path p0, int p1) throws java.io.IOException`

**Methods:**
- `public void close() throws java.io.IOException`
- `public void flush() throws java.io.IOException`
- `public boolean isModified()`
- `public void write(byte[] p0) throws java.io.IOException`
- `public void write(byte[] p0, int p1, int p2) throws java.io.IOException`
- `public void write(int p0) throws java.io.IOException`

---

## public class `org.codehaus.plexus.util.io.CachingWriter`
extends `java.io.OutputStreamWriter`  

**Constructors:**
- `public CachingWriter(java.io.File p0, java.nio.charset.Charset p1) throws java.io.IOException`
- `public CachingWriter(java.nio.file.Path p0, java.nio.charset.Charset p1) throws java.io.IOException`
- `public CachingWriter(java.nio.file.Path p0, java.nio.charset.Charset p1, int p2) throws java.io.IOException`

**Methods:**
- `public boolean isModified()`

---

## public abstract interface `org.codehaus.plexus.util.io.InputStreamFacade`

**Methods:**
- `public abstract java.io.InputStream getInputStream() throws java.io.IOException`

---

## public class `org.codehaus.plexus.util.io.RawInputStreamFacade`
implements `org.codehaus.plexus.util.io.InputStreamFacade`  

**Constructors:**
- `public RawInputStreamFacade(java.io.InputStream p0)`

**Methods:**
- `public java.io.InputStream getInputStream() throws java.io.IOException`

---

## public class `org.codehaus.plexus.util.io.URLInputStreamFacade`
implements `org.codehaus.plexus.util.io.InputStreamFacade`  

**Constructors:**
- `public URLInputStreamFacade(java.net.URL p0)`

**Methods:**
- `public java.io.InputStream getInputStream() throws java.io.IOException`

---

## public final class `org.codehaus.plexus.util.reflection.Reflector`

**Constructors:**
- `public Reflector()`

**Methods:**
- `public <T extends java.lang.Object> java.lang.reflect.Constructor getConstructor(java.lang.Class p0, java.lang.Class[] p1) throws org.codehaus.plexus.util.reflection.ReflectorException`
- `public java.lang.Object getField(java.lang.Object p0, java.lang.String p1) throws org.codehaus.plexus.util.reflection.ReflectorException`
- `public java.lang.Object getField(java.lang.Object p0, java.lang.String p1, boolean p2) throws org.codehaus.plexus.util.reflection.ReflectorException`
- `public java.lang.reflect.Method getMethod(java.lang.Class p0, java.lang.String p1, java.lang.Class[] p2) throws org.codehaus.plexus.util.reflection.ReflectorException`
- `public java.lang.Object getObjectProperty(java.lang.Object p0, java.lang.String p1) throws org.codehaus.plexus.util.reflection.ReflectorException`
- `public <T extends java.lang.Object> T getSingleton(java.lang.Class p0, java.lang.Object[] p1) throws org.codehaus.plexus.util.reflection.ReflectorException`
- `public java.lang.Object getStaticField(java.lang.Class p0, java.lang.String p1) throws org.codehaus.plexus.util.reflection.ReflectorException`
- `public java.lang.Object invoke(java.lang.Object p0, java.lang.String p1, java.lang.Object[] p2) throws org.codehaus.plexus.util.reflection.ReflectorException`
- `public java.lang.Object invokeStatic(java.lang.Class p0, java.lang.String p1, java.lang.Object[] p2) throws org.codehaus.plexus.util.reflection.ReflectorException`
- `public <T extends java.lang.Object> T newInstance(java.lang.Class p0, java.lang.Object[] p1) throws org.codehaus.plexus.util.reflection.ReflectorException`

---

## public class `org.codehaus.plexus.util.reflection.ReflectorException`
extends `java.lang.Exception`  

**Constructors:**
- `public ReflectorException()`
- `public ReflectorException(java.lang.String p0)`
- `public ReflectorException(java.lang.String p0, java.lang.Throwable p1)`
- `public ReflectorException(java.lang.Throwable p0)`

---

