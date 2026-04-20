# Breaking Changes: commons-io:commons-io 2.11.0 → 20030203.000550
Total: 481 (binary-breaking: 478, source-breaking: 481)

## org.apache.commons.io.ByteOrderMark

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.ByteOrderMark`

## org.apache.commons.io.ByteOrderParser

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.ByteOrderParser`

## org.apache.commons.io.Charsets

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.Charsets`

## org.apache.commons.io.CopyUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.CopyUtils`

## org.apache.commons.io.DirectoryWalker

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.DirectoryWalker`

## org.apache.commons.io.DirectoryWalker$CancelException

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.DirectoryWalker$CancelException`

## org.apache.commons.io.EndianUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.EndianUtils`

## org.apache.commons.io.FileCleaner

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.FileCleaner`

## org.apache.commons.io.FileCleaningTracker

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.FileCleaningTracker`

## org.apache.commons.io.FileDeleteStrategy

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.FileDeleteStrategy`

## org.apache.commons.io.FileExistsException

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.FileExistsException`

## org.apache.commons.io.FileSystem

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.FileSystem`

## org.apache.commons.io.FileSystemUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.FileSystemUtils`

## org.apache.commons.io.FileUtils

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.commons.io.FileUtils`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.commons.io.FileUtils`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.commons.io.FileUtils.<init>()`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.commons.io.FileUtils.EMPTY_FILE_ARRAY`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.commons.io.FileUtils.ONE_EB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.commons.io.FileUtils.ONE_EB_BI`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.commons.io.FileUtils.ONE_GB_BI`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.commons.io.FileUtils.ONE_KB_BI`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.commons.io.FileUtils.ONE_MB_BI`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.commons.io.FileUtils.ONE_PB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.commons.io.FileUtils.ONE_PB_BI`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.commons.io.FileUtils.ONE_TB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.commons.io.FileUtils.ONE_TB_BI`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.commons.io.FileUtils.ONE_YB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.commons.io.FileUtils.ONE_ZB`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.commons.io.FileUtils.ONE_GB`
+ NEW FIELD: `org.apache.commons.io.FileUtils.ONE_GB`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.commons.io.FileUtils.ONE_KB`
+ NEW FIELD: `org.apache.commons.io.FileUtils.ONE_KB`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.commons.io.FileUtils.ONE_MB`
+ NEW FIELD: `org.apache.commons.io.FileUtils.ONE_MB`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.commons.io.FileUtils.cleanDirectory(java.io.File)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.commons.io.FileUtils.contentEquals(java.io.File,java.io.File)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.commons.io.FileUtils.copyFile(java.io.File,java.io.File)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.commons.io.FileUtils.copyFileToDirectory(java.io.File,java.io.File)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.commons.io.FileUtils.copyURLToFile(java.net.URL,java.io.File)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.commons.io.FileUtils.deleteDirectory(java.io.File)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.commons.io.FileUtils.forceDelete(java.io.File)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.commons.io.FileUtils.forceDeleteOnExit(java.io.File)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.commons.io.FileUtils.forceMkdir(java.io.File)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.commons.io.FileUtils.sizeOfDirectory(java.io.File)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.commons.io.FileUtils.toFile(java.net.URL)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.commons.io.FileUtils.toURLs(java.io.File[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.byteCountToDisplaySize(java.math.BigInteger)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.byteCountToDisplaySize(long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.checksum(java.io.File,java.util.zip.Checksum)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.checksumCRC32(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.contentEqualsIgnoreEOL(java.io.File,java.io.File,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.convertFileCollectionToFileArray(java.util.Collection<java.io.File>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.copyDirectory(java.io.File,java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.copyDirectory(java.io.File,java.io.File,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.copyDirectory(java.io.File,java.io.File,java.io.FileFilter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.copyDirectory(java.io.File,java.io.File,java.io.FileFilter,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.copyDirectory(java.io.File,java.io.File,java.io.FileFilter,boolean,java.nio.file.CopyOption[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.copyDirectoryToDirectory(java.io.File,java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.copyFile(java.io.File,java.io.File,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.copyFile(java.io.File,java.io.File,boolean,java.nio.file.CopyOption[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.copyFile(java.io.File,java.io.File,java.nio.file.CopyOption[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.copyFile(java.io.File,java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.copyFileToDirectory(java.io.File,java.io.File,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.copyInputStreamToFile(java.io.InputStream,java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.copyToDirectory(java.io.File,java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.copyToDirectory(java.lang.Iterable<java.io.File>,java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.copyToFile(java.io.InputStream,java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.copyURLToFile(java.net.URL,java.io.File,int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.createParentDirectories(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.delete(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.deleteQuietly(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.directoryContains(java.io.File,java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.forceMkdirParent(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.getFile(java.io.File,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.getFile(java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.getTempDirectory()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.getTempDirectoryPath()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.getUserDirectory()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.getUserDirectoryPath()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.isDirectory(java.io.File,java.nio.file.LinkOption[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.isEmptyDirectory(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.isFileNewer(java.io.File,java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.isFileNewer(java.io.File,java.time.Instant)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.isFileNewer(java.io.File,java.time.chrono.ChronoLocalDate)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.isFileNewer(java.io.File,java.time.chrono.ChronoLocalDate,java.time.LocalTime)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.isFileNewer(java.io.File,java.time.chrono.ChronoLocalDateTime<? extends java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.isFileNewer(java.io.File,java.time.chrono.ChronoLocalDateTime<? extends java.lang.Object>,java.time.ZoneId)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.isFileNewer(java.io.File,java.time.chrono.ChronoZonedDateTime<? extends java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.isFileNewer(java.io.File,java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.isFileNewer(java.io.File,long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.isFileOlder(java.io.File,java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.isFileOlder(java.io.File,java.time.Instant)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.isFileOlder(java.io.File,java.time.chrono.ChronoLocalDate)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.isFileOlder(java.io.File,java.time.chrono.ChronoLocalDate,java.time.LocalTime)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.isFileOlder(java.io.File,java.time.chrono.ChronoLocalDateTime<? extends java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.isFileOlder(java.io.File,java.time.chrono.ChronoLocalDateTime<? extends java.lang.Object>,java.time.ZoneId)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.isFileOlder(java.io.File,java.time.chrono.ChronoZonedDateTime<? extends java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.isFileOlder(java.io.File,java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.isFileOlder(java.io.File,long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.isRegularFile(java.io.File,java.nio.file.LinkOption[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.isSymlink(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.iterateFiles(java.io.File,java.lang.String[],boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.iterateFiles(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.iterateFilesAndDirs(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.lastModified(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.lastModifiedUnchecked(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.lineIterator(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.lineIterator(java.io.File,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.listFiles(java.io.File,java.lang.String[],boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.listFiles(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.listFilesAndDirs(java.io.File,org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.moveDirectory(java.io.File,java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.moveDirectoryToDirectory(java.io.File,java.io.File,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.moveFile(java.io.File,java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.moveFile(java.io.File,java.io.File,java.nio.file.CopyOption[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.moveFileToDirectory(java.io.File,java.io.File,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.moveToDirectory(java.io.File,java.io.File,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.openInputStream(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.openOutputStream(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.openOutputStream(java.io.File,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.readFileToByteArray(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.readFileToString(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.readFileToString(java.io.File,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.readFileToString(java.io.File,java.nio.charset.Charset)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.readLines(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.readLines(java.io.File,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.readLines(java.io.File,java.nio.charset.Charset)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.sizeOf(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.sizeOfAsBigInteger(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.sizeOfDirectoryAsBigInteger(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.streamFiles(java.io.File,boolean,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.toFiles(java.net.URL[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.touch(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.waitFor(java.io.File,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,java.lang.String,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,java.nio.charset.Charset)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.write(java.io.File,java.lang.CharSequence,java.nio.charset.Charset,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.writeByteArrayToFile(java.io.File,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.writeByteArrayToFile(java.io.File,byte[],boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.writeByteArrayToFile(java.io.File,byte[],int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.writeByteArrayToFile(java.io.File,byte[],int,int,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.writeLines(java.io.File,java.lang.String,java.util.Collection<? extends java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.writeLines(java.io.File,java.lang.String,java.util.Collection<? extends java.lang.Object>,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.writeLines(java.io.File,java.lang.String,java.util.Collection<? extends java.lang.Object>,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.writeLines(java.io.File,java.lang.String,java.util.Collection<? extends java.lang.Object>,java.lang.String,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.writeLines(java.io.File,java.util.Collection<? extends java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.writeLines(java.io.File,java.util.Collection<? extends java.lang.Object>,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.writeLines(java.io.File,java.util.Collection<? extends java.lang.Object>,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.writeLines(java.io.File,java.util.Collection<? extends java.lang.Object>,java.lang.String,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.writeStringToFile(java.io.File,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.writeStringToFile(java.io.File,java.lang.String,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.writeStringToFile(java.io.File,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.writeStringToFile(java.io.File,java.lang.String,java.lang.String,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.writeStringToFile(java.io.File,java.lang.String,java.nio.charset.Charset)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.FileUtils.writeStringToFile(java.io.File,java.lang.String,java.nio.charset.Charset,boolean)`

## org.apache.commons.io.FilenameUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.FilenameUtils`

## org.apache.commons.io.HexDump

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.commons.io.HexDump`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.commons.io.HexDump`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.commons.io.HexDump.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.commons.io.HexDump.dump(byte[],long,java.io.OutputStream,int)`

## org.apache.commons.io.IOCase

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.IOCase`

## org.apache.commons.io.IOExceptionList

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.IOExceptionList`

## org.apache.commons.io.IOExceptionWithCause

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.IOExceptionWithCause`

## org.apache.commons.io.IOIndexedException

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.IOIndexedException`

## org.apache.commons.io.IOUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.IOUtils`

## org.apache.commons.io.LineIterator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.LineIterator`

## org.apache.commons.io.StandardLineSeparator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.StandardLineSeparator`

## org.apache.commons.io.TaggedIOException

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.TaggedIOException`

## org.apache.commons.io.comparator.CompositeFileComparator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.comparator.CompositeFileComparator`

## org.apache.commons.io.comparator.DefaultFileComparator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.comparator.DefaultFileComparator`

## org.apache.commons.io.comparator.DirectoryFileComparator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.comparator.DirectoryFileComparator`

## org.apache.commons.io.comparator.ExtensionFileComparator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.comparator.ExtensionFileComparator`

## org.apache.commons.io.comparator.LastModifiedFileComparator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.comparator.LastModifiedFileComparator`

## org.apache.commons.io.comparator.NameFileComparator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.comparator.NameFileComparator`

## org.apache.commons.io.comparator.PathFileComparator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.comparator.PathFileComparator`

## org.apache.commons.io.comparator.SizeFileComparator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.comparator.SizeFileComparator`

## org.apache.commons.io.file.AccumulatorPathVisitor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.file.AccumulatorPathVisitor`

## org.apache.commons.io.file.CleaningPathVisitor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.file.CleaningPathVisitor`

## org.apache.commons.io.file.CopyDirectoryVisitor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.file.CopyDirectoryVisitor`

## org.apache.commons.io.file.Counters

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.file.Counters`

## org.apache.commons.io.file.Counters$Counter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.file.Counters$Counter`

## org.apache.commons.io.file.Counters$PathCounters

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.file.Counters$PathCounters`

## org.apache.commons.io.file.CountingPathVisitor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.file.CountingPathVisitor`

## org.apache.commons.io.file.DeleteOption

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.file.DeleteOption`

## org.apache.commons.io.file.DeletingPathVisitor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.file.DeletingPathVisitor`

## org.apache.commons.io.file.DirectoryStreamFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.file.DirectoryStreamFilter`

## org.apache.commons.io.file.NoopPathVisitor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.file.NoopPathVisitor`

## org.apache.commons.io.file.PathFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.file.PathFilter`

## org.apache.commons.io.file.PathUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.file.PathUtils`

## org.apache.commons.io.file.PathVisitor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.file.PathVisitor`

## org.apache.commons.io.file.SimplePathVisitor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.file.SimplePathVisitor`

## org.apache.commons.io.file.StandardDeleteOption

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.file.StandardDeleteOption`

## org.apache.commons.io.file.spi.FileSystemProviders

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.file.spi.FileSystemProviders`

## org.apache.commons.io.filefilter.AbstractFileFilter

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.commons.io.filefilter.IOFileFilter.EMPTY_STRING_ARRAY`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.nio.file.FileVisitor.postVisitDirectory(T,java.io.IOException)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.nio.file.FileVisitor.preVisitDirectory(T,java.nio.file.attribute.BasicFileAttributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.nio.file.FileVisitor.visitFile(T,java.nio.file.attribute.BasicFileAttributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.nio.file.FileVisitor.visitFileFailed(T,java.io.IOException)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.AbstractFileFilter.handle(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.AbstractFileFilter.postVisitDirectory(java.nio.file.Path,java.io.IOException)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.AbstractFileFilter.preVisitDirectory(java.nio.file.Path,java.nio.file.attribute.BasicFileAttributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.AbstractFileFilter.visitFile(java.nio.file.Path,java.nio.file.attribute.BasicFileAttributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.AbstractFileFilter.visitFileFailed(java.nio.file.Path,java.io.IOException)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.IOFileFilter.accept(java.nio.file.Path,java.nio.file.attribute.BasicFileAttributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.IOFileFilter.and(org.apache.commons.io.filefilter.IOFileFilter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.IOFileFilter.negate()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.IOFileFilter.or(org.apache.commons.io.filefilter.IOFileFilter)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.commons.io.filefilter.AbstractFileFilter`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.commons.io.filefilter.AbstractFileFilter`

## org.apache.commons.io.filefilter.AgeFileFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.filefilter.AgeFileFilter`

## org.apache.commons.io.filefilter.AndFileFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.filefilter.AndFileFilter`

## org.apache.commons.io.filefilter.CanExecuteFileFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.filefilter.CanExecuteFileFilter`

## org.apache.commons.io.filefilter.CanReadFileFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.filefilter.CanReadFileFilter`

## org.apache.commons.io.filefilter.CanWriteFileFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.filefilter.CanWriteFileFilter`

## org.apache.commons.io.filefilter.ConditionalFileFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.filefilter.ConditionalFileFilter`

## org.apache.commons.io.filefilter.DelegateFileFilter

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.commons.io.filefilter.IOFileFilter.EMPTY_STRING_ARRAY`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.nio.file.FileVisitor.postVisitDirectory(T,java.io.IOException)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.nio.file.FileVisitor.preVisitDirectory(T,java.nio.file.attribute.BasicFileAttributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.nio.file.FileVisitor.visitFile(T,java.nio.file.attribute.BasicFileAttributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.nio.file.FileVisitor.visitFileFailed(T,java.io.IOException)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.AbstractFileFilter.handle(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.AbstractFileFilter.postVisitDirectory(java.nio.file.Path,java.io.IOException)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.AbstractFileFilter.preVisitDirectory(java.nio.file.Path,java.nio.file.attribute.BasicFileAttributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.AbstractFileFilter.visitFile(java.nio.file.Path,java.nio.file.attribute.BasicFileAttributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.AbstractFileFilter.visitFileFailed(java.nio.file.Path,java.io.IOException)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.IOFileFilter.accept(java.nio.file.Path,java.nio.file.attribute.BasicFileAttributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.IOFileFilter.and(org.apache.commons.io.filefilter.IOFileFilter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.IOFileFilter.negate()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.IOFileFilter.or(org.apache.commons.io.filefilter.IOFileFilter)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.commons.io.filefilter.DelegateFileFilter`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.commons.io.filefilter.DelegateFileFilter`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.commons.io.filefilter.DelegateFileFilter`

## org.apache.commons.io.filefilter.DirectoryFileFilter

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.commons.io.filefilter.DirectoryFileFilter.DIRECTORY`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.commons.io.filefilter.DirectoryFileFilter.INSTANCE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.commons.io.filefilter.IOFileFilter.EMPTY_STRING_ARRAY`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.nio.file.FileVisitor.postVisitDirectory(T,java.io.IOException)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.nio.file.FileVisitor.preVisitDirectory(T,java.nio.file.attribute.BasicFileAttributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.nio.file.FileVisitor.visitFile(T,java.nio.file.attribute.BasicFileAttributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.nio.file.FileVisitor.visitFileFailed(T,java.io.IOException)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.AbstractFileFilter.handle(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.AbstractFileFilter.postVisitDirectory(java.nio.file.Path,java.io.IOException)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.AbstractFileFilter.preVisitDirectory(java.nio.file.Path,java.nio.file.attribute.BasicFileAttributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.AbstractFileFilter.visitFile(java.nio.file.Path,java.nio.file.attribute.BasicFileAttributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.AbstractFileFilter.visitFileFailed(java.nio.file.Path,java.io.IOException)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.DirectoryFileFilter.accept(java.nio.file.Path,java.nio.file.attribute.BasicFileAttributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.IOFileFilter.and(org.apache.commons.io.filefilter.IOFileFilter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.IOFileFilter.negate()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.IOFileFilter.or(org.apache.commons.io.filefilter.IOFileFilter)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.commons.io.filefilter.DirectoryFileFilter`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.commons.io.filefilter.DirectoryFileFilter`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.commons.io.filefilter.DirectoryFileFilter`

## org.apache.commons.io.filefilter.EmptyFileFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.filefilter.EmptyFileFilter`

## org.apache.commons.io.filefilter.FalseFileFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.filefilter.FalseFileFilter`

## org.apache.commons.io.filefilter.FileEqualsFileFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.filefilter.FileEqualsFileFilter`

## org.apache.commons.io.filefilter.FileFileFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.filefilter.FileFileFilter`

## org.apache.commons.io.filefilter.FileFilterUtils

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(java.io.File,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(java.util.Date,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.ageFileFilter(long,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.and(org.apache.commons.io.filefilter.IOFileFilter[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.andFileFilter(org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.asFileFilter(java.io.FileFilter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.asFileFilter(java.io.FilenameFilter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.directoryFileFilter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.falseFileFilter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.fileFileFilter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.filter(org.apache.commons.io.filefilter.IOFileFilter,java.io.File[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.filter(org.apache.commons.io.filefilter.IOFileFilter,java.lang.Iterable<java.io.File>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.filterList(org.apache.commons.io.filefilter.IOFileFilter,java.io.File[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.filterList(org.apache.commons.io.filefilter.IOFileFilter,java.lang.Iterable<java.io.File>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.filterSet(org.apache.commons.io.filefilter.IOFileFilter,java.io.File[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.filterSet(org.apache.commons.io.filefilter.IOFileFilter,java.lang.Iterable<java.io.File>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.magicNumberFileFilter(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.magicNumberFileFilter(byte[],long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.magicNumberFileFilter(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.magicNumberFileFilter(java.lang.String,long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.makeCVSAware(org.apache.commons.io.filefilter.IOFileFilter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.makeDirectoryOnly(org.apache.commons.io.filefilter.IOFileFilter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.makeFileOnly(org.apache.commons.io.filefilter.IOFileFilter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.makeSVNAware(org.apache.commons.io.filefilter.IOFileFilter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.nameFileFilter(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.nameFileFilter(java.lang.String,org.apache.commons.io.IOCase)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.notFileFilter(org.apache.commons.io.filefilter.IOFileFilter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.or(org.apache.commons.io.filefilter.IOFileFilter[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.orFileFilter(org.apache.commons.io.filefilter.IOFileFilter,org.apache.commons.io.filefilter.IOFileFilter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.prefixFileFilter(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.prefixFileFilter(java.lang.String,org.apache.commons.io.IOCase)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.sizeFileFilter(long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.sizeFileFilter(long,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.sizeRangeFileFilter(long,long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.suffixFileFilter(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.suffixFileFilter(java.lang.String,org.apache.commons.io.IOCase)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.toList(org.apache.commons.io.filefilter.IOFileFilter[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.FileFilterUtils.trueFileFilter()`

## org.apache.commons.io.filefilter.HiddenFileFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.filefilter.HiddenFileFilter`

## org.apache.commons.io.filefilter.IOFileFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.filefilter.IOFileFilter`

## org.apache.commons.io.filefilter.MagicNumberFileFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.filefilter.MagicNumberFileFilter`

## org.apache.commons.io.filefilter.NameFileFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.filefilter.NameFileFilter`

## org.apache.commons.io.filefilter.NotFileFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.filefilter.NotFileFilter`

## org.apache.commons.io.filefilter.OrFileFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.filefilter.OrFileFilter`

## org.apache.commons.io.filefilter.PathEqualsFileFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.filefilter.PathEqualsFileFilter`

## org.apache.commons.io.filefilter.PathVisitorFileFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.filefilter.PathVisitorFileFilter`

## org.apache.commons.io.filefilter.PrefixFileFilter

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.commons.io.filefilter.PrefixFileFilter.<init>(java.lang.String,org.apache.commons.io.IOCase)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.commons.io.filefilter.PrefixFileFilter.<init>(java.lang.String[],org.apache.commons.io.IOCase)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.commons.io.filefilter.PrefixFileFilter.<init>(java.util.List<java.lang.String>)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.commons.io.filefilter.PrefixFileFilter.<init>(java.util.List<java.lang.String>,org.apache.commons.io.IOCase)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.commons.io.filefilter.IOFileFilter.EMPTY_STRING_ARRAY`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.nio.file.FileVisitor.postVisitDirectory(T,java.io.IOException)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.nio.file.FileVisitor.preVisitDirectory(T,java.nio.file.attribute.BasicFileAttributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.nio.file.FileVisitor.visitFile(T,java.nio.file.attribute.BasicFileAttributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.nio.file.FileVisitor.visitFileFailed(T,java.io.IOException)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.AbstractFileFilter.handle(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.AbstractFileFilter.postVisitDirectory(java.nio.file.Path,java.io.IOException)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.AbstractFileFilter.preVisitDirectory(java.nio.file.Path,java.nio.file.attribute.BasicFileAttributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.AbstractFileFilter.visitFile(java.nio.file.Path,java.nio.file.attribute.BasicFileAttributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.AbstractFileFilter.visitFileFailed(java.nio.file.Path,java.io.IOException)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.IOFileFilter.and(org.apache.commons.io.filefilter.IOFileFilter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.IOFileFilter.negate()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.IOFileFilter.or(org.apache.commons.io.filefilter.IOFileFilter)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.filefilter.PrefixFileFilter.accept(java.nio.file.Path,java.nio.file.attribute.BasicFileAttributes)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.commons.io.filefilter.PrefixFileFilter`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.commons.io.filefilter.PrefixFileFilter`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.commons.io.filefilter.PrefixFileFilter`

## org.apache.commons.io.filefilter.RegexFileFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.filefilter.RegexFileFilter`

## org.apache.commons.io.filefilter.SizeFileFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.filefilter.SizeFileFilter`

## org.apache.commons.io.filefilter.SuffixFileFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.filefilter.SuffixFileFilter`

## org.apache.commons.io.filefilter.SymbolicLinkFileFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.filefilter.SymbolicLinkFileFilter`

## org.apache.commons.io.filefilter.TrueFileFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.filefilter.TrueFileFilter`

## org.apache.commons.io.filefilter.WildcardFileFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.filefilter.WildcardFileFilter`

## org.apache.commons.io.filefilter.WildcardFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.filefilter.WildcardFilter`

## org.apache.commons.io.function.IOConsumer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.function.IOConsumer`

## org.apache.commons.io.function.IOFunction

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.function.IOFunction`

## org.apache.commons.io.function.IOSupplier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.function.IOSupplier`

## org.apache.commons.io.input.AbstractCharacterFilterReader

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.AbstractCharacterFilterReader`

## org.apache.commons.io.input.AutoCloseInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.AutoCloseInputStream`

## org.apache.commons.io.input.BOMInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.BOMInputStream`

## org.apache.commons.io.input.BoundedInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.BoundedInputStream`

## org.apache.commons.io.input.BoundedReader

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.BoundedReader`

## org.apache.commons.io.input.BrokenInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.BrokenInputStream`

## org.apache.commons.io.input.BrokenReader

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.BrokenReader`

## org.apache.commons.io.input.BufferedFileChannelInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.BufferedFileChannelInputStream`

## org.apache.commons.io.input.CharSequenceInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.CharSequenceInputStream`

## org.apache.commons.io.input.CharSequenceReader

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.CharSequenceReader`

## org.apache.commons.io.input.CharacterFilterReader

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.CharacterFilterReader`

## org.apache.commons.io.input.CharacterSetFilterReader

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.CharacterSetFilterReader`

## org.apache.commons.io.input.CircularInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.CircularInputStream`

## org.apache.commons.io.input.CloseShieldInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.CloseShieldInputStream`

## org.apache.commons.io.input.CloseShieldReader

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.CloseShieldReader`

## org.apache.commons.io.input.ClosedInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.ClosedInputStream`

## org.apache.commons.io.input.ClosedReader

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.ClosedReader`

## org.apache.commons.io.input.CountingInputStream

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.input.CountingInputStream.afterRead(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.input.CountingInputStream.getByteCount()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.input.CountingInputStream.resetByteCount()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.input.CountingInputStream.resetCount()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.input.ProxyInputStream.beforeRead(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.input.ProxyInputStream.handleIOException(java.io.IOException)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.commons.io.input.CountingInputStream`

## org.apache.commons.io.input.DemuxInputStream

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.commons.io.input.DemuxInputStream`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `java.io.InputStream.available()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `java.io.InputStream.mark(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `java.io.InputStream.markSupported()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `java.io.InputStream.nullInputStream()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `java.io.InputStream.read(byte[])`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `java.io.InputStream.read(byte[],int,int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `java.io.InputStream.readAllBytes()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `java.io.InputStream.readNBytes(byte[],int,int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `java.io.InputStream.readNBytes(int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `java.io.InputStream.reset()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `java.io.InputStream.skip(long)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `java.io.InputStream.skipNBytes(long)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `java.io.InputStream.transferTo(java.io.OutputStream)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.commons.io.input.DemuxInputStream.bindStream(java.io.InputStream)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.commons.io.input.DemuxInputStream.close()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.commons.io.input.DemuxInputStream.read()`

## org.apache.commons.io.input.InfiniteCircularInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.InfiniteCircularInputStream`

## org.apache.commons.io.input.MarkShieldInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.MarkShieldInputStream`

## org.apache.commons.io.input.MessageDigestCalculatingInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.MessageDigestCalculatingInputStream`

## org.apache.commons.io.input.MessageDigestCalculatingInputStream$MessageDigestMaintainingObserver

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.MessageDigestCalculatingInputStream$MessageDigestMaintainingObserver`

## org.apache.commons.io.input.NullInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.NullInputStream`

## org.apache.commons.io.input.NullReader

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.NullReader`

## org.apache.commons.io.input.ObservableInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.ObservableInputStream`

## org.apache.commons.io.input.ObservableInputStream$Observer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.ObservableInputStream$Observer`

## org.apache.commons.io.input.ProxyInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.ProxyInputStream`

## org.apache.commons.io.input.ProxyReader

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.ProxyReader`

## org.apache.commons.io.input.QueueInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.QueueInputStream`

## org.apache.commons.io.input.RandomAccessFileInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.RandomAccessFileInputStream`

## org.apache.commons.io.input.ReadAheadInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.ReadAheadInputStream`

## org.apache.commons.io.input.ReaderInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.ReaderInputStream`

## org.apache.commons.io.input.ReversedLinesFileReader

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.ReversedLinesFileReader`

## org.apache.commons.io.input.SequenceReader

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.SequenceReader`

## org.apache.commons.io.input.SwappedDataInputStream

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `java.io.FilterInputStream.in`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.io.InputStream.nullInputStream()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.io.InputStream.readAllBytes()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.io.InputStream.readNBytes(byte[],int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.io.InputStream.readNBytes(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.io.InputStream.skipNBytes(long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.io.InputStream.transferTo(java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.input.ProxyInputStream.afterRead(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.input.ProxyInputStream.beforeRead(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.input.ProxyInputStream.handleIOException(java.io.IOException)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.commons.io.input.SwappedDataInputStream`

## org.apache.commons.io.input.TaggedInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.TaggedInputStream`

## org.apache.commons.io.input.TaggedReader

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.TaggedReader`

## org.apache.commons.io.input.Tailer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.Tailer`

## org.apache.commons.io.input.TailerListener

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.TailerListener`

## org.apache.commons.io.input.TailerListenerAdapter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.TailerListenerAdapter`

## org.apache.commons.io.input.TeeInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.TeeInputStream`

## org.apache.commons.io.input.TeeReader

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.TeeReader`

## org.apache.commons.io.input.TimestampedObserver

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.TimestampedObserver`

## org.apache.commons.io.input.UnixLineEndingInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.UnixLineEndingInputStream`

## org.apache.commons.io.input.UnsynchronizedByteArrayInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.UnsynchronizedByteArrayInputStream`

## org.apache.commons.io.input.WindowsLineEndingInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.WindowsLineEndingInputStream`

## org.apache.commons.io.input.XmlStreamReader

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.XmlStreamReader`

## org.apache.commons.io.input.XmlStreamReaderException

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.XmlStreamReaderException`

## org.apache.commons.io.input.buffer.CircularBufferInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.buffer.CircularBufferInputStream`

## org.apache.commons.io.input.buffer.CircularByteBuffer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.buffer.CircularByteBuffer`

## org.apache.commons.io.input.buffer.PeekableInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.input.buffer.PeekableInputStream`

## org.apache.commons.io.monitor.FileAlterationListener

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.monitor.FileAlterationListener`

## org.apache.commons.io.monitor.FileAlterationListenerAdaptor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.monitor.FileAlterationListenerAdaptor`

## org.apache.commons.io.monitor.FileAlterationMonitor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.monitor.FileAlterationMonitor`

## org.apache.commons.io.monitor.FileAlterationObserver

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.monitor.FileAlterationObserver`

## org.apache.commons.io.monitor.FileEntry

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.monitor.FileEntry`

## org.apache.commons.io.output.AbstractByteArrayOutputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.AbstractByteArrayOutputStream`

## org.apache.commons.io.output.AbstractByteArrayOutputStream$InputStreamConstructor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.AbstractByteArrayOutputStream$InputStreamConstructor`

## org.apache.commons.io.output.AppendableOutputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.AppendableOutputStream`

## org.apache.commons.io.output.AppendableWriter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.AppendableWriter`

## org.apache.commons.io.output.BrokenOutputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.BrokenOutputStream`

## org.apache.commons.io.output.BrokenWriter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.BrokenWriter`

## org.apache.commons.io.output.ByteArrayOutputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.ByteArrayOutputStream`

## org.apache.commons.io.output.ChunkedOutputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.ChunkedOutputStream`

## org.apache.commons.io.output.ChunkedWriter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.ChunkedWriter`

## org.apache.commons.io.output.CloseShieldOutputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.CloseShieldOutputStream`

## org.apache.commons.io.output.CloseShieldWriter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.CloseShieldWriter`

## org.apache.commons.io.output.ClosedOutputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.ClosedOutputStream`

## org.apache.commons.io.output.ClosedWriter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.ClosedWriter`

## org.apache.commons.io.output.CountingOutputStream

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.output.CountingOutputStream.beforeWrite(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.output.CountingOutputStream.getByteCount()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.output.CountingOutputStream.resetByteCount()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.output.CountingOutputStream.resetCount()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.output.ProxyOutputStream.afterWrite(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.output.ProxyOutputStream.handleIOException(java.io.IOException)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.commons.io.output.CountingOutputStream`

## org.apache.commons.io.output.DeferredFileOutputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.DeferredFileOutputStream`

## org.apache.commons.io.output.DemuxOutputStream

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.commons.io.output.DemuxOutputStream`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `java.io.OutputStream.nullOutputStream()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `java.io.OutputStream.write(byte[])`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `java.io.OutputStream.write(byte[],int,int)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.commons.io.output.DemuxOutputStream.bindStream(java.io.OutputStream)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.commons.io.output.DemuxOutputStream.close()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.commons.io.output.DemuxOutputStream.flush()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.commons.io.output.DemuxOutputStream.write(int)`

## org.apache.commons.io.output.FileWriterWithEncoding

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.FileWriterWithEncoding`

## org.apache.commons.io.output.FilterCollectionWriter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.FilterCollectionWriter`

## org.apache.commons.io.output.LockableFileWriter

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.commons.io.output.LockableFileWriter.<init>(java.io.File,java.lang.String)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.commons.io.output.LockableFileWriter.<init>(java.io.File,java.lang.String,boolean,java.lang.String)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.commons.io.output.LockableFileWriter.<init>(java.io.File,java.nio.charset.Charset)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.commons.io.output.LockableFileWriter.<init>(java.io.File,java.nio.charset.Charset,boolean,java.lang.String)`

## org.apache.commons.io.output.NullAppendable

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.NullAppendable`

## org.apache.commons.io.output.NullOutputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.NullOutputStream`

## org.apache.commons.io.output.NullPrintStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.NullPrintStream`

## org.apache.commons.io.output.NullWriter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.NullWriter`

## org.apache.commons.io.output.ProxyCollectionWriter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.ProxyCollectionWriter`

## org.apache.commons.io.output.ProxyOutputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.ProxyOutputStream`

## org.apache.commons.io.output.ProxyWriter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.ProxyWriter`

## org.apache.commons.io.output.QueueOutputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.QueueOutputStream`

## org.apache.commons.io.output.StringBuilderWriter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.StringBuilderWriter`

## org.apache.commons.io.output.TaggedOutputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.TaggedOutputStream`

## org.apache.commons.io.output.TaggedWriter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.TaggedWriter`

## org.apache.commons.io.output.TeeOutputStream

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.output.ProxyOutputStream.afterWrite(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.output.ProxyOutputStream.beforeWrite(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.commons.io.output.ProxyOutputStream.handleIOException(java.io.IOException)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.commons.io.output.TeeOutputStream`

## org.apache.commons.io.output.TeeWriter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.TeeWriter`

## org.apache.commons.io.output.ThresholdingOutputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.ThresholdingOutputStream`

## org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream`

## org.apache.commons.io.output.WriterOutputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.WriterOutputStream`

## org.apache.commons.io.output.XmlStreamWriter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.output.XmlStreamWriter`

## org.apache.commons.io.serialization.ClassNameMatcher

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.serialization.ClassNameMatcher`

## org.apache.commons.io.serialization.ValidatingObjectInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.commons.io.serialization.ValidatingObjectInputStream`

