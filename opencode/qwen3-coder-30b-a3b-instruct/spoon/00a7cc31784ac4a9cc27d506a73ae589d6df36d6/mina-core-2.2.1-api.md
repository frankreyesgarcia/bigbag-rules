# API Specification: org.apache.mina:mina-core 2.2.1

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public final class `org.apache.mina.core.IoUtil`

**Methods:**
- `public static void await(java.lang.Iterable p0) throws java.lang.InterruptedException`
- `public static boolean await(java.lang.Iterable p0, long p1) throws java.lang.InterruptedException`
- `public static boolean await(java.lang.Iterable p0, long p1, java.util.concurrent.TimeUnit p2) throws java.lang.InterruptedException`
- `public static void awaitUninterruptably(java.lang.Iterable p0)`
- `public static boolean awaitUninterruptibly(java.lang.Iterable p0, long p1)`
- `public static boolean awaitUninterruptibly(java.lang.Iterable p0, long p1, java.util.concurrent.TimeUnit p2)`
- `public static java.util.List broadcast(java.lang.Object p0, java.lang.Iterable p1)`
- `public static java.util.List broadcast(java.lang.Object p0, java.util.Collection p1)`
- `public static java.util.List broadcast(java.lang.Object p0, java.util.Iterator p1)`
- `public static java.util.List broadcast(java.lang.Object p0, org.apache.mina.core.session.IoSession... p1)`

---

## public class `org.apache.mina.core.RuntimeIoException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public RuntimeIoException()`
- `public RuntimeIoException(java.lang.String p0)`
- `public RuntimeIoException(java.lang.String p0, java.lang.Throwable p1)`
- `public RuntimeIoException(java.lang.Throwable p0)`

---

## public abstract class `org.apache.mina.core.buffer.AbstractIoBuffer`
extends `org.apache.mina.core.buffer.IoBuffer`  

**Constructors:**
- `protected AbstractIoBuffer(org.apache.mina.core.buffer.AbstractIoBuffer p0)`
- `protected AbstractIoBuffer(org.apache.mina.core.buffer.IoBufferAllocator p0, int p1)`

**Methods:**
- `public final java.nio.CharBuffer asCharBuffer()`
- `public final java.nio.DoubleBuffer asDoubleBuffer()`
- `public final java.nio.FloatBuffer asFloatBuffer()`
- `public java.io.InputStream asInputStream()`
- `public final java.nio.IntBuffer asIntBuffer()`
- `public final java.nio.LongBuffer asLongBuffer()`
- `public java.io.OutputStream asOutputStream()`
- `public final org.apache.mina.core.buffer.IoBuffer asReadOnlyBuffer()`
- `protected abstract org.apache.mina.core.buffer.IoBuffer asReadOnlyBuffer0()`
- `public final java.nio.ShortBuffer asShortBuffer()`
- `protected abstract void buf(java.nio.ByteBuffer p0)`
- `public final int capacity()`
- `public final org.apache.mina.core.buffer.IoBuffer capacity(int p0)`
- `public final org.apache.mina.core.buffer.IoBuffer clear()`
- `public final org.apache.mina.core.buffer.IoBuffer compact()`
- `public int compareTo(org.apache.mina.core.buffer.IoBuffer p0)`
- `public final org.apache.mina.core.buffer.IoBuffer duplicate()`
- `protected abstract org.apache.mina.core.buffer.IoBuffer duplicate0()`
- `public boolean equals(java.lang.Object p0)`
- `public final org.apache.mina.core.buffer.IoBuffer expand(int p0)`
- `public final org.apache.mina.core.buffer.IoBuffer expand(int p0, int p1)`
- `public org.apache.mina.core.buffer.IoBuffer fill(byte p0, int p1)`
- `public org.apache.mina.core.buffer.IoBuffer fill(int p0)`
- `public org.apache.mina.core.buffer.IoBuffer fillAndReset(byte p0, int p1)`
- `public org.apache.mina.core.buffer.IoBuffer fillAndReset(int p0)`
- `public final org.apache.mina.core.buffer.IoBuffer flip()`
- `public final byte get()`
- `public org.apache.mina.core.buffer.IoBuffer get(byte[] p0)`
- `public final org.apache.mina.core.buffer.IoBuffer get(byte[] p0, int p1, int p2)`
- `public final byte get(int p0)`
- `public final char getChar()`
- `public final char getChar(int p0)`
- `public final double getDouble()`
- `public final double getDouble(int p0)`
- `public <E extends java.lang.Enum<E>> E getEnum(int p0, java.lang.Class p1)`
- `public <E extends java.lang.Enum<E>> E getEnum(java.lang.Class p0)`
- `public <E extends java.lang.Enum<E>> E getEnumInt(int p0, java.lang.Class p1)`
- `public <E extends java.lang.Enum<E>> E getEnumInt(java.lang.Class p0)`
- `public <E extends java.lang.Enum<E>> java.util.Set getEnumSet(int p0, java.lang.Class p1)`
- `public <E extends java.lang.Enum<E>> java.util.Set getEnumSet(java.lang.Class p0)`
- `public <E extends java.lang.Enum<E>> java.util.Set getEnumSetInt(int p0, java.lang.Class p1)`
- `public <E extends java.lang.Enum<E>> java.util.Set getEnumSetInt(java.lang.Class p0)`
- `public <E extends java.lang.Enum<E>> java.util.Set getEnumSetLong(int p0, java.lang.Class p1)`
- `public <E extends java.lang.Enum<E>> java.util.Set getEnumSetLong(java.lang.Class p0)`
- `public <E extends java.lang.Enum<E>> java.util.Set getEnumSetShort(int p0, java.lang.Class p1)`
- `public <E extends java.lang.Enum<E>> java.util.Set getEnumSetShort(java.lang.Class p0)`
- `public <E extends java.lang.Enum<E>> E getEnumShort(int p0, java.lang.Class p1)`
- `public <E extends java.lang.Enum<E>> E getEnumShort(java.lang.Class p0)`
- `public final float getFloat()`
- `public final float getFloat(int p0)`
- `public final int getInt()`
- `public final int getInt(int p0)`
- `public final long getLong()`
- `public final long getLong(int p0)`
- `public int getMediumInt()`
- `public int getMediumInt(int p0)`
- `public java.lang.Object getObject() throws java.lang.ClassNotFoundException`
- `public java.lang.Object getObject(java.lang.ClassLoader p0) throws java.lang.ClassNotFoundException`
- `public java.lang.String getPrefixedString(int p0, java.nio.charset.CharsetDecoder p1) throws java.nio.charset.CharacterCodingException`
- `public java.lang.String getPrefixedString(java.nio.charset.CharsetDecoder p0) throws java.nio.charset.CharacterCodingException`
- `public final short getShort()`
- `public final short getShort(int p0)`
- `public final org.apache.mina.core.buffer.IoBuffer getSlice(int p0)`
- `public final org.apache.mina.core.buffer.IoBuffer getSlice(int p0, int p1)`
- `public java.lang.String getString(int p0, java.nio.charset.CharsetDecoder p1) throws java.nio.charset.CharacterCodingException`
- `public java.lang.String getString(java.nio.charset.CharsetDecoder p0) throws java.nio.charset.CharacterCodingException`
- `public final short getUnsigned()`
- `public final short getUnsigned(int p0)`
- `public long getUnsignedInt()`
- `public long getUnsignedInt(int p0)`
- `public int getUnsignedMediumInt()`
- `public int getUnsignedMediumInt(int p0)`
- `public int getUnsignedShort()`
- `public int getUnsignedShort(int p0)`
- `public final boolean hasRemaining()`
- `public int hashCode()`
- `public int indexOf(byte p0)`
- `public final boolean isAutoExpand()`
- `public final boolean isAutoShrink()`
- `public final boolean isDerived()`
- `public final boolean isDirect()`
- `public final boolean isReadOnly()`
- `public final int limit()`
- `public final org.apache.mina.core.buffer.IoBuffer limit(int p0)`
- `public final org.apache.mina.core.buffer.IoBuffer mark()`
- `public final int markValue()`
- `public final int minimumCapacity()`
- `public final org.apache.mina.core.buffer.IoBuffer minimumCapacity(int p0)`
- `public final java.nio.ByteOrder order()`
- `public final org.apache.mina.core.buffer.IoBuffer order(java.nio.ByteOrder p0)`
- `public final int position()`
- `public final org.apache.mina.core.buffer.IoBuffer position(int p0)`
- `public boolean prefixedDataAvailable(int p0)`
- `public boolean prefixedDataAvailable(int p0, int p1)`
- `public final org.apache.mina.core.buffer.IoBuffer put(byte p0)`
- `public org.apache.mina.core.buffer.IoBuffer put(byte[] p0)`
- `public final org.apache.mina.core.buffer.IoBuffer put(byte[] p0, int p1, int p2)`
- `public final org.apache.mina.core.buffer.IoBuffer put(int p0, byte p1)`
- `public final org.apache.mina.core.buffer.IoBuffer put(java.nio.ByteBuffer p0)`
- `public org.apache.mina.core.buffer.IoBuffer put(org.apache.mina.core.buffer.IoBuffer p0)`
- `public final org.apache.mina.core.buffer.IoBuffer putChar(char p0)`
- `public final org.apache.mina.core.buffer.IoBuffer putChar(int p0, char p1)`
- `public final org.apache.mina.core.buffer.IoBuffer putDouble(double p0)`
- `public final org.apache.mina.core.buffer.IoBuffer putDouble(int p0, double p1)`
- `public org.apache.mina.core.buffer.IoBuffer putEnum(int p0, java.lang.Enum p1)`
- `public org.apache.mina.core.buffer.IoBuffer putEnum(java.lang.Enum p0)`
- `public org.apache.mina.core.buffer.IoBuffer putEnumInt(int p0, java.lang.Enum p1)`
- `public org.apache.mina.core.buffer.IoBuffer putEnumInt(java.lang.Enum p0)`
- `public <E extends java.lang.Enum<E>> org.apache.mina.core.buffer.IoBuffer putEnumSet(int p0, java.util.Set p1)`
- `public <E extends java.lang.Enum<E>> org.apache.mina.core.buffer.IoBuffer putEnumSet(java.util.Set p0)`
- `public <E extends java.lang.Enum<E>> org.apache.mina.core.buffer.IoBuffer putEnumSetInt(int p0, java.util.Set p1)`
- `public <E extends java.lang.Enum<E>> org.apache.mina.core.buffer.IoBuffer putEnumSetInt(java.util.Set p0)`
- `public <E extends java.lang.Enum<E>> org.apache.mina.core.buffer.IoBuffer putEnumSetLong(int p0, java.util.Set p1)`
- `public <E extends java.lang.Enum<E>> org.apache.mina.core.buffer.IoBuffer putEnumSetLong(java.util.Set p0)`
- `public <E extends java.lang.Enum<E>> org.apache.mina.core.buffer.IoBuffer putEnumSetShort(int p0, java.util.Set p1)`
- `public <E extends java.lang.Enum<E>> org.apache.mina.core.buffer.IoBuffer putEnumSetShort(java.util.Set p0)`
- `public org.apache.mina.core.buffer.IoBuffer putEnumShort(int p0, java.lang.Enum p1)`
- `public org.apache.mina.core.buffer.IoBuffer putEnumShort(java.lang.Enum p0)`
- `public final org.apache.mina.core.buffer.IoBuffer putFloat(float p0)`
- `public final org.apache.mina.core.buffer.IoBuffer putFloat(int p0, float p1)`
- `public final org.apache.mina.core.buffer.IoBuffer putInt(int p0)`
- `public final org.apache.mina.core.buffer.IoBuffer putInt(int p0, int p1)`
- `public final org.apache.mina.core.buffer.IoBuffer putLong(int p0, long p1)`
- `public final org.apache.mina.core.buffer.IoBuffer putLong(long p0)`
- `public org.apache.mina.core.buffer.IoBuffer putMediumInt(int p0)`
- `public org.apache.mina.core.buffer.IoBuffer putMediumInt(int p0, int p1)`
- `public org.apache.mina.core.buffer.IoBuffer putObject(java.lang.Object p0)`
- `public org.apache.mina.core.buffer.IoBuffer putPrefixedString(java.lang.CharSequence p0, int p1, int p2, byte p3, java.nio.charset.CharsetEncoder p4) throws java.nio.charset.CharacterCodingException`
- `public org.apache.mina.core.buffer.IoBuffer putPrefixedString(java.lang.CharSequence p0, int p1, int p2, java.nio.charset.CharsetEncoder p3) throws java.nio.charset.CharacterCodingException`
- `public org.apache.mina.core.buffer.IoBuffer putPrefixedString(java.lang.CharSequence p0, int p1, java.nio.charset.CharsetEncoder p2) throws java.nio.charset.CharacterCodingException`
- `public org.apache.mina.core.buffer.IoBuffer putPrefixedString(java.lang.CharSequence p0, java.nio.charset.CharsetEncoder p1) throws java.nio.charset.CharacterCodingException`
- `public final org.apache.mina.core.buffer.IoBuffer putShort(int p0, short p1)`
- `public final org.apache.mina.core.buffer.IoBuffer putShort(short p0)`
- `public org.apache.mina.core.buffer.IoBuffer putString(java.lang.CharSequence p0, int p1, java.nio.charset.CharsetEncoder p2) throws java.nio.charset.CharacterCodingException`
- `public org.apache.mina.core.buffer.IoBuffer putString(java.lang.CharSequence p0, java.nio.charset.CharsetEncoder p1) throws java.nio.charset.CharacterCodingException`
- `public org.apache.mina.core.buffer.IoBuffer putUnsigned(byte p0)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsigned(int p0)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsigned(int p0, byte p1)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsigned(int p0, int p1)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsigned(int p0, long p1)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsigned(int p0, short p1)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsigned(long p0)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsigned(short p0)`
- `public final org.apache.mina.core.buffer.IoBuffer putUnsignedInt(byte p0)`
- `public final org.apache.mina.core.buffer.IoBuffer putUnsignedInt(int p0)`
- `public final org.apache.mina.core.buffer.IoBuffer putUnsignedInt(int p0, byte p1)`
- `public final org.apache.mina.core.buffer.IoBuffer putUnsignedInt(int p0, int p1)`
- `public final org.apache.mina.core.buffer.IoBuffer putUnsignedInt(int p0, long p1)`
- `public final org.apache.mina.core.buffer.IoBuffer putUnsignedInt(int p0, short p1)`
- `public final org.apache.mina.core.buffer.IoBuffer putUnsignedInt(long p0)`
- `public final org.apache.mina.core.buffer.IoBuffer putUnsignedInt(short p0)`
- `public final org.apache.mina.core.buffer.IoBuffer putUnsignedShort(byte p0)`
- `public final org.apache.mina.core.buffer.IoBuffer putUnsignedShort(int p0)`
- `public final org.apache.mina.core.buffer.IoBuffer putUnsignedShort(int p0, byte p1)`
- `public final org.apache.mina.core.buffer.IoBuffer putUnsignedShort(int p0, int p1)`
- `public final org.apache.mina.core.buffer.IoBuffer putUnsignedShort(int p0, long p1)`
- `public final org.apache.mina.core.buffer.IoBuffer putUnsignedShort(int p0, short p1)`
- `public final org.apache.mina.core.buffer.IoBuffer putUnsignedShort(long p0)`
- `public final org.apache.mina.core.buffer.IoBuffer putUnsignedShort(short p0)`
- `public final int remaining()`
- `public final org.apache.mina.core.buffer.IoBuffer reset()`
- `public final org.apache.mina.core.buffer.IoBuffer rewind()`
- `public final org.apache.mina.core.buffer.IoBuffer setAutoExpand(boolean p0)`
- `public final org.apache.mina.core.buffer.IoBuffer setAutoShrink(boolean p0)`
- `public final org.apache.mina.core.buffer.IoBuffer shrink()`
- `public org.apache.mina.core.buffer.IoBuffer skip(int p0)`
- `public final org.apache.mina.core.buffer.IoBuffer slice()`
- `protected abstract org.apache.mina.core.buffer.IoBuffer slice0()`
- `public final org.apache.mina.core.buffer.IoBuffer sweep()`
- `public final org.apache.mina.core.buffer.IoBuffer sweep(byte p0)`
- `public java.lang.String toString()`

---

## public class `org.apache.mina.core.buffer.BufferDataException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public BufferDataException()`
- `public BufferDataException(java.lang.String p0)`
- `public BufferDataException(java.lang.String p0, java.lang.Throwable p1)`
- `public BufferDataException(java.lang.Throwable p0)`

---

## public class `org.apache.mina.core.buffer.CachedBufferAllocator`
implements `org.apache.mina.core.buffer.IoBufferAllocator`  

**Constructors:**
- `public CachedBufferAllocator()`
- `public CachedBufferAllocator(int p0, int p1)`

**Methods:**
- `public org.apache.mina.core.buffer.IoBuffer allocate(int p0, boolean p1)`
- `public java.nio.ByteBuffer allocateNioBuffer(int p0, boolean p1)`
- `public void dispose()`
- `public int getMaxCachedBufferSize()`
- `public int getMaxPoolSize()`
- `public org.apache.mina.core.buffer.IoBuffer wrap(java.nio.ByteBuffer p0)`

---

## public abstract class `org.apache.mina.core.buffer.IoBuffer`
implements `java.lang.Comparable<org.apache.mina.core.buffer.IoBuffer>`  

**Constructors:**
- `protected IoBuffer()`

**Methods:**
- `public static org.apache.mina.core.buffer.IoBuffer allocate(int p0)`
- `public static org.apache.mina.core.buffer.IoBuffer allocate(int p0, boolean p1)`
- `public abstract byte[] array()`
- `public abstract int arrayOffset()`
- `public abstract java.nio.CharBuffer asCharBuffer()`
- `public abstract java.nio.DoubleBuffer asDoubleBuffer()`
- `public abstract java.nio.FloatBuffer asFloatBuffer()`
- `public abstract java.io.InputStream asInputStream()`
- `public abstract java.nio.IntBuffer asIntBuffer()`
- `public abstract java.nio.LongBuffer asLongBuffer()`
- `public abstract java.io.OutputStream asOutputStream()`
- `public abstract org.apache.mina.core.buffer.IoBuffer asReadOnlyBuffer()`
- `public abstract java.nio.ShortBuffer asShortBuffer()`
- `public abstract java.nio.ByteBuffer buf()`
- `public abstract int capacity()`
- `public abstract org.apache.mina.core.buffer.IoBuffer capacity(int p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer clear()`
- `public abstract org.apache.mina.core.buffer.IoBuffer compact()`
- `public abstract org.apache.mina.core.buffer.IoBuffer duplicate()`
- `public abstract org.apache.mina.core.buffer.IoBuffer expand(int p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer expand(int p0, int p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer fill(byte p0, int p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer fill(int p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer fillAndReset(byte p0, int p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer fillAndReset(int p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer flip()`
- `public abstract void free()`
- `public abstract byte get()`
- `public abstract org.apache.mina.core.buffer.IoBuffer get(byte[] p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer get(byte[] p0, int p1, int p2)`
- `public abstract byte get(int p0)`
- `public static org.apache.mina.core.buffer.IoBufferAllocator getAllocator()`
- `public abstract char getChar()`
- `public abstract char getChar(int p0)`
- `public abstract double getDouble()`
- `public abstract double getDouble(int p0)`
- `public abstract <E extends java.lang.Enum<E>> E getEnum(int p0, java.lang.Class p1)`
- `public abstract <E extends java.lang.Enum<E>> E getEnum(java.lang.Class p0)`
- `public abstract <E extends java.lang.Enum<E>> E getEnumInt(int p0, java.lang.Class p1)`
- `public abstract <E extends java.lang.Enum<E>> E getEnumInt(java.lang.Class p0)`
- `public abstract <E extends java.lang.Enum<E>> java.util.Set getEnumSet(int p0, java.lang.Class p1)`
- `public abstract <E extends java.lang.Enum<E>> java.util.Set getEnumSet(java.lang.Class p0)`
- `public abstract <E extends java.lang.Enum<E>> java.util.Set getEnumSetInt(int p0, java.lang.Class p1)`
- `public abstract <E extends java.lang.Enum<E>> java.util.Set getEnumSetInt(java.lang.Class p0)`
- `public abstract <E extends java.lang.Enum<E>> java.util.Set getEnumSetLong(int p0, java.lang.Class p1)`
- `public abstract <E extends java.lang.Enum<E>> java.util.Set getEnumSetLong(java.lang.Class p0)`
- `public abstract <E extends java.lang.Enum<E>> java.util.Set getEnumSetShort(int p0, java.lang.Class p1)`
- `public abstract <E extends java.lang.Enum<E>> java.util.Set getEnumSetShort(java.lang.Class p0)`
- `public abstract <E extends java.lang.Enum<E>> E getEnumShort(int p0, java.lang.Class p1)`
- `public abstract <E extends java.lang.Enum<E>> E getEnumShort(java.lang.Class p0)`
- `public abstract float getFloat()`
- `public abstract float getFloat(int p0)`
- `public java.lang.String getHexDump()`
- `public java.lang.String getHexDump(boolean p0)`
- `public java.lang.String getHexDump(int p0)`
- `public java.lang.String getHexDump(int p0, boolean p1)`
- `public abstract int getInt()`
- `public abstract int getInt(int p0)`
- `public abstract long getLong()`
- `public abstract long getLong(int p0)`
- `public abstract int getMediumInt()`
- `public abstract int getMediumInt(int p0)`
- `public abstract java.lang.Object getObject() throws java.lang.ClassNotFoundException`
- `public abstract java.lang.Object getObject(java.lang.ClassLoader p0) throws java.lang.ClassNotFoundException`
- `public abstract java.lang.String getPrefixedString(int p0, java.nio.charset.CharsetDecoder p1) throws java.nio.charset.CharacterCodingException`
- `public abstract java.lang.String getPrefixedString(java.nio.charset.CharsetDecoder p0) throws java.nio.charset.CharacterCodingException`
- `public abstract short getShort()`
- `public abstract short getShort(int p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer getSlice(int p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer getSlice(int p0, int p1)`
- `public abstract java.lang.String getString(int p0, java.nio.charset.CharsetDecoder p1) throws java.nio.charset.CharacterCodingException`
- `public abstract java.lang.String getString(java.nio.charset.CharsetDecoder p0) throws java.nio.charset.CharacterCodingException`
- `public abstract short getUnsigned()`
- `public abstract short getUnsigned(int p0)`
- `public abstract long getUnsignedInt()`
- `public abstract long getUnsignedInt(int p0)`
- `public abstract int getUnsignedMediumInt()`
- `public abstract int getUnsignedMediumInt(int p0)`
- `public abstract int getUnsignedShort()`
- `public abstract int getUnsignedShort(int p0)`
- `public abstract boolean hasArray()`
- `public abstract boolean hasRemaining()`
- `public abstract int indexOf(byte p0)`
- `public abstract boolean isAutoExpand()`
- `public abstract boolean isAutoShrink()`
- `public abstract boolean isDerived()`
- `public abstract boolean isDirect()`
- `public abstract boolean isReadOnly()`
- `public static boolean isUseDirectBuffer()`
- `public abstract int limit()`
- `public abstract org.apache.mina.core.buffer.IoBuffer limit(int p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer mark()`
- `public abstract int markValue()`
- `public abstract int minimumCapacity()`
- `public abstract org.apache.mina.core.buffer.IoBuffer minimumCapacity(int p0)`
- `protected static int normalizeCapacity(int p0)`
- `public abstract java.nio.ByteOrder order()`
- `public abstract org.apache.mina.core.buffer.IoBuffer order(java.nio.ByteOrder p0)`
- `public abstract int position()`
- `public abstract org.apache.mina.core.buffer.IoBuffer position(int p0)`
- `public abstract boolean prefixedDataAvailable(int p0)`
- `public abstract boolean prefixedDataAvailable(int p0, int p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer put(byte p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer put(byte[] p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer put(byte[] p0, int p1, int p2)`
- `public abstract org.apache.mina.core.buffer.IoBuffer put(int p0, byte p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer put(java.nio.ByteBuffer p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer put(org.apache.mina.core.buffer.IoBuffer p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putChar(char p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putChar(int p0, char p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putDouble(double p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putDouble(int p0, double p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putEnum(int p0, java.lang.Enum p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putEnum(java.lang.Enum p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putEnumInt(int p0, java.lang.Enum p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putEnumInt(java.lang.Enum p0)`
- `public abstract <E extends java.lang.Enum<E>> org.apache.mina.core.buffer.IoBuffer putEnumSet(int p0, java.util.Set p1)`
- `public abstract <E extends java.lang.Enum<E>> org.apache.mina.core.buffer.IoBuffer putEnumSet(java.util.Set p0)`
- `public abstract <E extends java.lang.Enum<E>> org.apache.mina.core.buffer.IoBuffer putEnumSetInt(int p0, java.util.Set p1)`
- `public abstract <E extends java.lang.Enum<E>> org.apache.mina.core.buffer.IoBuffer putEnumSetInt(java.util.Set p0)`
- `public abstract <E extends java.lang.Enum<E>> org.apache.mina.core.buffer.IoBuffer putEnumSetLong(int p0, java.util.Set p1)`
- `public abstract <E extends java.lang.Enum<E>> org.apache.mina.core.buffer.IoBuffer putEnumSetLong(java.util.Set p0)`
- `public abstract <E extends java.lang.Enum<E>> org.apache.mina.core.buffer.IoBuffer putEnumSetShort(int p0, java.util.Set p1)`
- `public abstract <E extends java.lang.Enum<E>> org.apache.mina.core.buffer.IoBuffer putEnumSetShort(java.util.Set p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putEnumShort(int p0, java.lang.Enum p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putEnumShort(java.lang.Enum p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putFloat(float p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putFloat(int p0, float p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putInt(int p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putInt(int p0, int p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putLong(int p0, long p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putLong(long p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putMediumInt(int p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putMediumInt(int p0, int p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putObject(java.lang.Object p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putPrefixedString(java.lang.CharSequence p0, int p1, int p2, byte p3, java.nio.charset.CharsetEncoder p4) throws java.nio.charset.CharacterCodingException`
- `public abstract org.apache.mina.core.buffer.IoBuffer putPrefixedString(java.lang.CharSequence p0, int p1, int p2, java.nio.charset.CharsetEncoder p3) throws java.nio.charset.CharacterCodingException`
- `public abstract org.apache.mina.core.buffer.IoBuffer putPrefixedString(java.lang.CharSequence p0, int p1, java.nio.charset.CharsetEncoder p2) throws java.nio.charset.CharacterCodingException`
- `public abstract org.apache.mina.core.buffer.IoBuffer putPrefixedString(java.lang.CharSequence p0, java.nio.charset.CharsetEncoder p1) throws java.nio.charset.CharacterCodingException`
- `public abstract org.apache.mina.core.buffer.IoBuffer putShort(int p0, short p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putShort(short p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putString(java.lang.CharSequence p0, int p1, java.nio.charset.CharsetEncoder p2) throws java.nio.charset.CharacterCodingException`
- `public abstract org.apache.mina.core.buffer.IoBuffer putString(java.lang.CharSequence p0, java.nio.charset.CharsetEncoder p1) throws java.nio.charset.CharacterCodingException`
- `public abstract org.apache.mina.core.buffer.IoBuffer putUnsigned(byte p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putUnsigned(int p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putUnsigned(int p0, byte p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putUnsigned(int p0, int p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putUnsigned(int p0, long p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putUnsigned(int p0, short p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putUnsigned(long p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putUnsigned(short p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putUnsignedInt(byte p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putUnsignedInt(int p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putUnsignedInt(int p0, byte p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putUnsignedInt(int p0, int p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putUnsignedInt(int p0, long p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putUnsignedInt(int p0, short p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putUnsignedInt(long p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putUnsignedInt(short p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putUnsignedShort(byte p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putUnsignedShort(int p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putUnsignedShort(int p0, byte p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putUnsignedShort(int p0, int p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putUnsignedShort(int p0, long p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putUnsignedShort(int p0, short p1)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putUnsignedShort(long p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer putUnsignedShort(short p0)`
- `public abstract int remaining()`
- `public abstract org.apache.mina.core.buffer.IoBuffer reset()`
- `public abstract org.apache.mina.core.buffer.IoBuffer rewind()`
- `public static void setAllocator(org.apache.mina.core.buffer.IoBufferAllocator p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer setAutoExpand(boolean p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer setAutoShrink(boolean p0)`
- `public static void setUseDirectBuffer(boolean p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer shrink()`
- `public abstract org.apache.mina.core.buffer.IoBuffer skip(int p0)`
- `public abstract org.apache.mina.core.buffer.IoBuffer slice()`
- `public abstract org.apache.mina.core.buffer.IoBuffer sweep()`
- `public abstract org.apache.mina.core.buffer.IoBuffer sweep(byte p0)`
- `public static org.apache.mina.core.buffer.IoBuffer wrap(byte[] p0)`
- `public static org.apache.mina.core.buffer.IoBuffer wrap(byte[] p0, int p1, int p2)`
- `public static org.apache.mina.core.buffer.IoBuffer wrap(java.nio.ByteBuffer p0)`

---

## public abstract interface `org.apache.mina.core.buffer.IoBufferAllocator`

**Methods:**
- `public abstract org.apache.mina.core.buffer.IoBuffer allocate(int p0, boolean p1)`
- `public abstract java.nio.ByteBuffer allocateNioBuffer(int p0, boolean p1)`
- `public abstract void dispose()`
- `public abstract org.apache.mina.core.buffer.IoBuffer wrap(java.nio.ByteBuffer p0)`

---

## public class `org.apache.mina.core.buffer.IoBufferWrapper`
extends `org.apache.mina.core.buffer.IoBuffer`  

**Constructors:**
- `protected IoBufferWrapper(org.apache.mina.core.buffer.IoBuffer p0)`

**Methods:**
- `public byte[] array()`
- `public int arrayOffset()`
- `public java.nio.CharBuffer asCharBuffer()`
- `public java.nio.DoubleBuffer asDoubleBuffer()`
- `public java.nio.FloatBuffer asFloatBuffer()`
- `public java.io.InputStream asInputStream()`
- `public java.nio.IntBuffer asIntBuffer()`
- `public java.nio.LongBuffer asLongBuffer()`
- `public java.io.OutputStream asOutputStream()`
- `public org.apache.mina.core.buffer.IoBuffer asReadOnlyBuffer()`
- `public java.nio.ShortBuffer asShortBuffer()`
- `public java.nio.ByteBuffer buf()`
- `public int capacity()`
- `public org.apache.mina.core.buffer.IoBuffer capacity(int p0)`
- `public org.apache.mina.core.buffer.IoBuffer clear()`
- `public org.apache.mina.core.buffer.IoBuffer compact()`
- `public int compareTo(org.apache.mina.core.buffer.IoBuffer p0)`
- `public org.apache.mina.core.buffer.IoBuffer duplicate()`
- `public boolean equals(java.lang.Object p0)`
- `public org.apache.mina.core.buffer.IoBuffer expand(int p0)`
- `public org.apache.mina.core.buffer.IoBuffer expand(int p0, int p1)`
- `public org.apache.mina.core.buffer.IoBuffer fill(byte p0, int p1)`
- `public org.apache.mina.core.buffer.IoBuffer fill(int p0)`
- `public org.apache.mina.core.buffer.IoBuffer fillAndReset(byte p0, int p1)`
- `public org.apache.mina.core.buffer.IoBuffer fillAndReset(int p0)`
- `public org.apache.mina.core.buffer.IoBuffer flip()`
- `public void free()`
- `public byte get()`
- `public org.apache.mina.core.buffer.IoBuffer get(byte[] p0)`
- `public org.apache.mina.core.buffer.IoBuffer get(byte[] p0, int p1, int p2)`
- `public byte get(int p0)`
- `public char getChar()`
- `public char getChar(int p0)`
- `public double getDouble()`
- `public double getDouble(int p0)`
- `public <E extends java.lang.Enum<E>> E getEnum(int p0, java.lang.Class p1)`
- `public <E extends java.lang.Enum<E>> E getEnum(java.lang.Class p0)`
- `public <E extends java.lang.Enum<E>> E getEnumInt(int p0, java.lang.Class p1)`
- `public <E extends java.lang.Enum<E>> E getEnumInt(java.lang.Class p0)`
- `public <E extends java.lang.Enum<E>> java.util.Set getEnumSet(int p0, java.lang.Class p1)`
- `public <E extends java.lang.Enum<E>> java.util.Set getEnumSet(java.lang.Class p0)`
- `public <E extends java.lang.Enum<E>> java.util.Set getEnumSetInt(int p0, java.lang.Class p1)`
- `public <E extends java.lang.Enum<E>> java.util.Set getEnumSetInt(java.lang.Class p0)`
- `public <E extends java.lang.Enum<E>> java.util.Set getEnumSetLong(int p0, java.lang.Class p1)`
- `public <E extends java.lang.Enum<E>> java.util.Set getEnumSetLong(java.lang.Class p0)`
- `public <E extends java.lang.Enum<E>> java.util.Set getEnumSetShort(int p0, java.lang.Class p1)`
- `public <E extends java.lang.Enum<E>> java.util.Set getEnumSetShort(java.lang.Class p0)`
- `public <E extends java.lang.Enum<E>> E getEnumShort(int p0, java.lang.Class p1)`
- `public <E extends java.lang.Enum<E>> E getEnumShort(java.lang.Class p0)`
- `public float getFloat()`
- `public float getFloat(int p0)`
- `public int getInt()`
- `public int getInt(int p0)`
- `public long getLong()`
- `public long getLong(int p0)`
- `public int getMediumInt()`
- `public int getMediumInt(int p0)`
- `public java.lang.Object getObject() throws java.lang.ClassNotFoundException`
- `public java.lang.Object getObject(java.lang.ClassLoader p0) throws java.lang.ClassNotFoundException`
- `public org.apache.mina.core.buffer.IoBuffer getParentBuffer()`
- `public java.lang.String getPrefixedString(int p0, java.nio.charset.CharsetDecoder p1) throws java.nio.charset.CharacterCodingException`
- `public java.lang.String getPrefixedString(java.nio.charset.CharsetDecoder p0) throws java.nio.charset.CharacterCodingException`
- `public short getShort()`
- `public short getShort(int p0)`
- `public org.apache.mina.core.buffer.IoBuffer getSlice(int p0)`
- `public org.apache.mina.core.buffer.IoBuffer getSlice(int p0, int p1)`
- `public java.lang.String getString(int p0, java.nio.charset.CharsetDecoder p1) throws java.nio.charset.CharacterCodingException`
- `public java.lang.String getString(java.nio.charset.CharsetDecoder p0) throws java.nio.charset.CharacterCodingException`
- `public short getUnsigned()`
- `public short getUnsigned(int p0)`
- `public long getUnsignedInt()`
- `public long getUnsignedInt(int p0)`
- `public int getUnsignedMediumInt()`
- `public int getUnsignedMediumInt(int p0)`
- `public int getUnsignedShort()`
- `public int getUnsignedShort(int p0)`
- `public boolean hasArray()`
- `public boolean hasRemaining()`
- `public int hashCode()`
- `public int indexOf(byte p0)`
- `public boolean isAutoExpand()`
- `public boolean isAutoShrink()`
- `public boolean isDerived()`
- `public boolean isDirect()`
- `public boolean isReadOnly()`
- `public int limit()`
- `public org.apache.mina.core.buffer.IoBuffer limit(int p0)`
- `public org.apache.mina.core.buffer.IoBuffer mark()`
- `public int markValue()`
- `public int minimumCapacity()`
- `public org.apache.mina.core.buffer.IoBuffer minimumCapacity(int p0)`
- `public java.nio.ByteOrder order()`
- `public org.apache.mina.core.buffer.IoBuffer order(java.nio.ByteOrder p0)`
- `public int position()`
- `public org.apache.mina.core.buffer.IoBuffer position(int p0)`
- `public boolean prefixedDataAvailable(int p0)`
- `public boolean prefixedDataAvailable(int p0, int p1)`
- `public org.apache.mina.core.buffer.IoBuffer put(byte p0)`
- `public org.apache.mina.core.buffer.IoBuffer put(byte[] p0)`
- `public org.apache.mina.core.buffer.IoBuffer put(byte[] p0, int p1, int p2)`
- `public org.apache.mina.core.buffer.IoBuffer put(int p0, byte p1)`
- `public org.apache.mina.core.buffer.IoBuffer put(java.nio.ByteBuffer p0)`
- `public org.apache.mina.core.buffer.IoBuffer put(org.apache.mina.core.buffer.IoBuffer p0)`
- `public org.apache.mina.core.buffer.IoBuffer putChar(char p0)`
- `public org.apache.mina.core.buffer.IoBuffer putChar(int p0, char p1)`
- `public org.apache.mina.core.buffer.IoBuffer putDouble(double p0)`
- `public org.apache.mina.core.buffer.IoBuffer putDouble(int p0, double p1)`
- `public org.apache.mina.core.buffer.IoBuffer putEnum(int p0, java.lang.Enum p1)`
- `public org.apache.mina.core.buffer.IoBuffer putEnum(java.lang.Enum p0)`
- `public org.apache.mina.core.buffer.IoBuffer putEnumInt(int p0, java.lang.Enum p1)`
- `public org.apache.mina.core.buffer.IoBuffer putEnumInt(java.lang.Enum p0)`
- `public <E extends java.lang.Enum<E>> org.apache.mina.core.buffer.IoBuffer putEnumSet(int p0, java.util.Set p1)`
- `public <E extends java.lang.Enum<E>> org.apache.mina.core.buffer.IoBuffer putEnumSet(java.util.Set p0)`
- `public <E extends java.lang.Enum<E>> org.apache.mina.core.buffer.IoBuffer putEnumSetInt(int p0, java.util.Set p1)`
- `public <E extends java.lang.Enum<E>> org.apache.mina.core.buffer.IoBuffer putEnumSetInt(java.util.Set p0)`
- `public <E extends java.lang.Enum<E>> org.apache.mina.core.buffer.IoBuffer putEnumSetLong(int p0, java.util.Set p1)`
- `public <E extends java.lang.Enum<E>> org.apache.mina.core.buffer.IoBuffer putEnumSetLong(java.util.Set p0)`
- `public <E extends java.lang.Enum<E>> org.apache.mina.core.buffer.IoBuffer putEnumSetShort(int p0, java.util.Set p1)`
- `public <E extends java.lang.Enum<E>> org.apache.mina.core.buffer.IoBuffer putEnumSetShort(java.util.Set p0)`
- `public org.apache.mina.core.buffer.IoBuffer putEnumShort(int p0, java.lang.Enum p1)`
- `public org.apache.mina.core.buffer.IoBuffer putEnumShort(java.lang.Enum p0)`
- `public org.apache.mina.core.buffer.IoBuffer putFloat(float p0)`
- `public org.apache.mina.core.buffer.IoBuffer putFloat(int p0, float p1)`
- `public org.apache.mina.core.buffer.IoBuffer putInt(int p0)`
- `public org.apache.mina.core.buffer.IoBuffer putInt(int p0, int p1)`
- `public org.apache.mina.core.buffer.IoBuffer putLong(int p0, long p1)`
- `public org.apache.mina.core.buffer.IoBuffer putLong(long p0)`
- `public org.apache.mina.core.buffer.IoBuffer putMediumInt(int p0)`
- `public org.apache.mina.core.buffer.IoBuffer putMediumInt(int p0, int p1)`
- `public org.apache.mina.core.buffer.IoBuffer putObject(java.lang.Object p0)`
- `public org.apache.mina.core.buffer.IoBuffer putPrefixedString(java.lang.CharSequence p0, int p1, int p2, byte p3, java.nio.charset.CharsetEncoder p4) throws java.nio.charset.CharacterCodingException`
- `public org.apache.mina.core.buffer.IoBuffer putPrefixedString(java.lang.CharSequence p0, int p1, int p2, java.nio.charset.CharsetEncoder p3) throws java.nio.charset.CharacterCodingException`
- `public org.apache.mina.core.buffer.IoBuffer putPrefixedString(java.lang.CharSequence p0, int p1, java.nio.charset.CharsetEncoder p2) throws java.nio.charset.CharacterCodingException`
- `public org.apache.mina.core.buffer.IoBuffer putPrefixedString(java.lang.CharSequence p0, java.nio.charset.CharsetEncoder p1) throws java.nio.charset.CharacterCodingException`
- `public org.apache.mina.core.buffer.IoBuffer putShort(int p0, short p1)`
- `public org.apache.mina.core.buffer.IoBuffer putShort(short p0)`
- `public org.apache.mina.core.buffer.IoBuffer putString(java.lang.CharSequence p0, int p1, java.nio.charset.CharsetEncoder p2) throws java.nio.charset.CharacterCodingException`
- `public org.apache.mina.core.buffer.IoBuffer putString(java.lang.CharSequence p0, java.nio.charset.CharsetEncoder p1) throws java.nio.charset.CharacterCodingException`
- `public org.apache.mina.core.buffer.IoBuffer putUnsigned(byte p0)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsigned(int p0)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsigned(int p0, byte p1)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsigned(int p0, int p1)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsigned(int p0, long p1)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsigned(int p0, short p1)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsigned(long p0)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsigned(short p0)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsignedInt(byte p0)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsignedInt(int p0)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsignedInt(int p0, byte p1)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsignedInt(int p0, int p1)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsignedInt(int p0, long p1)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsignedInt(int p0, short p1)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsignedInt(long p0)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsignedInt(short p0)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsignedShort(byte p0)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsignedShort(int p0)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsignedShort(int p0, byte p1)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsignedShort(int p0, int p1)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsignedShort(int p0, long p1)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsignedShort(int p0, short p1)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsignedShort(long p0)`
- `public org.apache.mina.core.buffer.IoBuffer putUnsignedShort(short p0)`
- `public int remaining()`
- `public org.apache.mina.core.buffer.IoBuffer reset()`
- `public org.apache.mina.core.buffer.IoBuffer rewind()`
- `public org.apache.mina.core.buffer.IoBuffer setAutoExpand(boolean p0)`
- `public org.apache.mina.core.buffer.IoBuffer setAutoShrink(boolean p0)`
- `public org.apache.mina.core.buffer.IoBuffer shrink()`
- `public org.apache.mina.core.buffer.IoBuffer skip(int p0)`
- `public org.apache.mina.core.buffer.IoBuffer slice()`
- `public org.apache.mina.core.buffer.IoBuffer sweep()`
- `public org.apache.mina.core.buffer.IoBuffer sweep(byte p0)`
- `public java.lang.String toString()`

---

## public class `org.apache.mina.core.buffer.SimpleBufferAllocator`
implements `org.apache.mina.core.buffer.IoBufferAllocator`  

**Constructors:**
- `public SimpleBufferAllocator()`

**Methods:**
- `public org.apache.mina.core.buffer.IoBuffer allocate(int p0, boolean p1)`
- `public java.nio.ByteBuffer allocateNioBuffer(int p0, boolean p1)`
- `public void dispose()`
- `public org.apache.mina.core.buffer.IoBuffer wrap(java.nio.ByteBuffer p0)`

---

## public class `org.apache.mina.core.file.DefaultFileRegion`
implements `org.apache.mina.core.file.FileRegion`  

**Constructors:**
- `public DefaultFileRegion(java.nio.channels.FileChannel p0) throws java.io.IOException`
- `public DefaultFileRegion(java.nio.channels.FileChannel p0, long p1, long p2)`

**Methods:**
- `public java.nio.channels.FileChannel getFileChannel()`
- `public java.lang.String getFilename()`
- `public long getPosition()`
- `public long getRemainingBytes()`
- `public long getWrittenBytes()`
- `public void update(long p0)`

---

## public abstract interface `org.apache.mina.core.file.FileRegion`

**Methods:**
- `public abstract java.nio.channels.FileChannel getFileChannel()`
- `public abstract java.lang.String getFilename()`
- `public abstract long getPosition()`
- `public abstract long getRemainingBytes()`
- `public abstract long getWrittenBytes()`
- `public abstract void update(long p0)`

---

## public class `org.apache.mina.core.file.FilenameFileRegion`
extends `org.apache.mina.core.file.DefaultFileRegion`  

**Constructors:**
- `public FilenameFileRegion(java.io.File p0, java.nio.channels.FileChannel p1)`
- `public FilenameFileRegion(java.io.File p0, java.nio.channels.FileChannel p1, long p2, long p3)`

**Methods:**
- `public java.lang.String getFilename()`

---

## public class `org.apache.mina.core.filterchain.DefaultIoFilterChain`
implements `org.apache.mina.core.filterchain.IoFilterChain`  

**Constructors:**
- `public DefaultIoFilterChain(org.apache.mina.core.session.AbstractIoSession p0)`

**Fields:**
- `public final static org.apache.mina.core.session.AttributeKey SESSION_CREATED_FUTURE`

**Methods:**
- `public synchronized void addAfter(java.lang.String p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter p2)`
- `public synchronized void addBefore(java.lang.String p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter p2)`
- `public synchronized void addFirst(java.lang.String p0, org.apache.mina.core.filterchain.IoFilter p1)`
- `public synchronized void addLast(java.lang.String p0, org.apache.mina.core.filterchain.IoFilter p1)`
- `public synchronized void clear() throws java.lang.Exception`
- `public boolean contains(java.lang.Class p0)`
- `public boolean contains(java.lang.String p0)`
- `public boolean contains(org.apache.mina.core.filterchain.IoFilter p0)`
- `public void fireEvent(org.apache.mina.filter.FilterEvent p0)`
- `public void fireExceptionCaught(java.lang.Throwable p0)`
- `public void fireFilterClose()`
- `public void fireFilterWrite(org.apache.mina.core.write.WriteRequest p0)`
- `public void fireInputClosed()`
- `public void fireMessageReceived(java.lang.Object p0)`
- `public void fireMessageSent(org.apache.mina.core.write.WriteRequest p0)`
- `public void fireSessionClosed()`
- `public void fireSessionCreated()`
- `public void fireSessionIdle(org.apache.mina.core.session.IdleStatus p0)`
- `public void fireSessionOpened()`
- `public org.apache.mina.core.filterchain.IoFilter get(java.lang.Class p0)`
- `public org.apache.mina.core.filterchain.IoFilter get(java.lang.String p0)`
- `public java.util.List getAll()`
- `public java.util.List getAllReversed()`
- `public org.apache.mina.core.filterchain.IoFilterChain$Entry getEntry(java.lang.Class p0)`
- `public org.apache.mina.core.filterchain.IoFilterChain$Entry getEntry(java.lang.String p0)`
- `public org.apache.mina.core.filterchain.IoFilterChain$Entry getEntry(org.apache.mina.core.filterchain.IoFilter p0)`
- `public org.apache.mina.core.filterchain.IoFilter$NextFilter getNextFilter(java.lang.Class p0)`
- `public org.apache.mina.core.filterchain.IoFilter$NextFilter getNextFilter(java.lang.String p0)`
- `public org.apache.mina.core.filterchain.IoFilter$NextFilter getNextFilter(org.apache.mina.core.filterchain.IoFilter p0)`
- `public org.apache.mina.core.session.IoSession getSession()`
- `public synchronized org.apache.mina.core.filterchain.IoFilter remove(java.lang.Class p0)`
- `public synchronized org.apache.mina.core.filterchain.IoFilter remove(java.lang.String p0)`
- `public synchronized void remove(org.apache.mina.core.filterchain.IoFilter p0)`
- `public synchronized org.apache.mina.core.filterchain.IoFilter replace(java.lang.Class p0, org.apache.mina.core.filterchain.IoFilter p1)`
- `public synchronized org.apache.mina.core.filterchain.IoFilter replace(java.lang.String p0, org.apache.mina.core.filterchain.IoFilter p1)`
- `public synchronized void replace(org.apache.mina.core.filterchain.IoFilter p0, org.apache.mina.core.filterchain.IoFilter p1)`
- `public java.lang.String toString()`

---

## public class `org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder`
implements `org.apache.mina.core.filterchain.IoFilterChainBuilder`  

**Constructors:**
- `public DefaultIoFilterChainBuilder()`
- `public DefaultIoFilterChainBuilder(org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder p0)`

**Methods:**
- `public synchronized void addAfter(java.lang.String p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter p2)`
- `public synchronized void addBefore(java.lang.String p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter p2)`
- `public synchronized void addFirst(java.lang.String p0, org.apache.mina.core.filterchain.IoFilter p1)`
- `public synchronized void addLast(java.lang.String p0, org.apache.mina.core.filterchain.IoFilter p1)`
- `public void buildFilterChain(org.apache.mina.core.filterchain.IoFilterChain p0) throws java.lang.Exception`
- `public synchronized void clear()`
- `public boolean contains(java.lang.Class p0)`
- `public boolean contains(java.lang.String p0)`
- `public boolean contains(org.apache.mina.core.filterchain.IoFilter p0)`
- `public org.apache.mina.core.filterchain.IoFilter get(java.lang.Class p0)`
- `public org.apache.mina.core.filterchain.IoFilter get(java.lang.String p0)`
- `public java.util.List getAll()`
- `public java.util.List getAllReversed()`
- `public org.apache.mina.core.filterchain.IoFilterChain$Entry getEntry(java.lang.Class p0)`
- `public org.apache.mina.core.filterchain.IoFilterChain$Entry getEntry(java.lang.String p0)`
- `public org.apache.mina.core.filterchain.IoFilterChain$Entry getEntry(org.apache.mina.core.filterchain.IoFilter p0)`
- `public synchronized org.apache.mina.core.filterchain.IoFilter remove(java.lang.Class p0)`
- `public synchronized org.apache.mina.core.filterchain.IoFilter remove(java.lang.String p0)`
- `public synchronized org.apache.mina.core.filterchain.IoFilter remove(org.apache.mina.core.filterchain.IoFilter p0)`
- `public synchronized void replace(java.lang.Class p0, org.apache.mina.core.filterchain.IoFilter p1)`
- `public synchronized org.apache.mina.core.filterchain.IoFilter replace(java.lang.String p0, org.apache.mina.core.filterchain.IoFilter p1)`
- `public synchronized void replace(org.apache.mina.core.filterchain.IoFilter p0, org.apache.mina.core.filterchain.IoFilter p1)`
- `public void setFilters(java.util.Map p0)`
- `public java.lang.String toString()`

---

## public abstract interface `org.apache.mina.core.filterchain.IoFilter`

**Methods:**
- `public abstract void destroy() throws java.lang.Exception`
- `public abstract void event(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.filter.FilterEvent p2) throws java.lang.Exception`
- `public abstract void exceptionCaught(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, java.lang.Throwable p2) throws java.lang.Exception`
- `public abstract void filterClose(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public abstract void filterWrite(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2) throws java.lang.Exception`
- `public abstract void init() throws java.lang.Exception`
- `public abstract void inputClosed(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public abstract void messageReceived(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, java.lang.Object p2) throws java.lang.Exception`
- `public abstract void messageSent(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2) throws java.lang.Exception`
- `public abstract void onPostAdd(org.apache.mina.core.filterchain.IoFilterChain p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter$NextFilter p2) throws java.lang.Exception`
- `public abstract void onPostRemove(org.apache.mina.core.filterchain.IoFilterChain p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter$NextFilter p2) throws java.lang.Exception`
- `public abstract void onPreAdd(org.apache.mina.core.filterchain.IoFilterChain p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter$NextFilter p2) throws java.lang.Exception`
- `public abstract void onPreRemove(org.apache.mina.core.filterchain.IoFilterChain p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter$NextFilter p2) throws java.lang.Exception`
- `public abstract void sessionClosed(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public abstract void sessionCreated(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public abstract void sessionIdle(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.session.IdleStatus p2) throws java.lang.Exception`
- `public abstract void sessionOpened(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`

---

## public abstract static interface `org.apache.mina.core.filterchain.IoFilter$NextFilter`

**Methods:**
- `public abstract void event(org.apache.mina.core.session.IoSession p0, org.apache.mina.filter.FilterEvent p1)`
- `public abstract void exceptionCaught(org.apache.mina.core.session.IoSession p0, java.lang.Throwable p1)`
- `public abstract void filterClose(org.apache.mina.core.session.IoSession p0)`
- `public abstract void filterWrite(org.apache.mina.core.session.IoSession p0, org.apache.mina.core.write.WriteRequest p1)`
- `public abstract void inputClosed(org.apache.mina.core.session.IoSession p0)`
- `public abstract void messageReceived(org.apache.mina.core.session.IoSession p0, java.lang.Object p1)`
- `public abstract void messageSent(org.apache.mina.core.session.IoSession p0, org.apache.mina.core.write.WriteRequest p1)`
- `public abstract void sessionClosed(org.apache.mina.core.session.IoSession p0)`
- `public abstract void sessionCreated(org.apache.mina.core.session.IoSession p0)`
- `public abstract void sessionIdle(org.apache.mina.core.session.IoSession p0, org.apache.mina.core.session.IdleStatus p1)`
- `public abstract void sessionOpened(org.apache.mina.core.session.IoSession p0)`

---

## public class `org.apache.mina.core.filterchain.IoFilterAdapter`
implements `org.apache.mina.core.filterchain.IoFilter`  

**Constructors:**
- `public IoFilterAdapter()`

**Methods:**
- `public void destroy() throws java.lang.Exception`
- `public void event(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.filter.FilterEvent p2) throws java.lang.Exception`
- `public void exceptionCaught(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, java.lang.Throwable p2) throws java.lang.Exception`
- `public void filterClose(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public void filterWrite(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2) throws java.lang.Exception`
- `public void init() throws java.lang.Exception`
- `public void inputClosed(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public void messageReceived(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, java.lang.Object p2) throws java.lang.Exception`
- `public void messageSent(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2) throws java.lang.Exception`
- `public void onPostAdd(org.apache.mina.core.filterchain.IoFilterChain p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter$NextFilter p2) throws java.lang.Exception`
- `public void onPostRemove(org.apache.mina.core.filterchain.IoFilterChain p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter$NextFilter p2) throws java.lang.Exception`
- `public void onPreAdd(org.apache.mina.core.filterchain.IoFilterChain p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter$NextFilter p2) throws java.lang.Exception`
- `public void onPreRemove(org.apache.mina.core.filterchain.IoFilterChain p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter$NextFilter p2) throws java.lang.Exception`
- `public void sessionClosed(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public void sessionCreated(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public void sessionIdle(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.session.IdleStatus p2) throws java.lang.Exception`
- `public void sessionOpened(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public java.lang.String toString()`

---

## public abstract interface `org.apache.mina.core.filterchain.IoFilterChain`

**Methods:**
- `public abstract void addAfter(java.lang.String p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter p2)`
- `public abstract void addBefore(java.lang.String p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter p2)`
- `public abstract void addFirst(java.lang.String p0, org.apache.mina.core.filterchain.IoFilter p1)`
- `public abstract void addLast(java.lang.String p0, org.apache.mina.core.filterchain.IoFilter p1)`
- `public abstract void clear() throws java.lang.Exception`
- `public abstract boolean contains(java.lang.Class p0)`
- `public abstract boolean contains(java.lang.String p0)`
- `public abstract boolean contains(org.apache.mina.core.filterchain.IoFilter p0)`
- `public abstract void fireEvent(org.apache.mina.filter.FilterEvent p0)`
- `public abstract void fireExceptionCaught(java.lang.Throwable p0)`
- `public abstract void fireFilterClose()`
- `public abstract void fireFilterWrite(org.apache.mina.core.write.WriteRequest p0)`
- `public abstract void fireInputClosed()`
- `public abstract void fireMessageReceived(java.lang.Object p0)`
- `public abstract void fireMessageSent(org.apache.mina.core.write.WriteRequest p0)`
- `public abstract void fireSessionClosed()`
- `public abstract void fireSessionCreated()`
- `public abstract void fireSessionIdle(org.apache.mina.core.session.IdleStatus p0)`
- `public abstract void fireSessionOpened()`
- `public abstract org.apache.mina.core.filterchain.IoFilter get(java.lang.Class p0)`
- `public abstract org.apache.mina.core.filterchain.IoFilter get(java.lang.String p0)`
- `public abstract java.util.List getAll()`
- `public abstract java.util.List getAllReversed()`
- `public abstract org.apache.mina.core.filterchain.IoFilterChain$Entry getEntry(java.lang.Class p0)`
- `public abstract org.apache.mina.core.filterchain.IoFilterChain$Entry getEntry(java.lang.String p0)`
- `public abstract org.apache.mina.core.filterchain.IoFilterChain$Entry getEntry(org.apache.mina.core.filterchain.IoFilter p0)`
- `public abstract org.apache.mina.core.filterchain.IoFilter$NextFilter getNextFilter(java.lang.Class p0)`
- `public abstract org.apache.mina.core.filterchain.IoFilter$NextFilter getNextFilter(java.lang.String p0)`
- `public abstract org.apache.mina.core.filterchain.IoFilter$NextFilter getNextFilter(org.apache.mina.core.filterchain.IoFilter p0)`
- `public abstract org.apache.mina.core.session.IoSession getSession()`
- `public abstract org.apache.mina.core.filterchain.IoFilter remove(java.lang.Class p0)`
- `public abstract org.apache.mina.core.filterchain.IoFilter remove(java.lang.String p0)`
- `public abstract void remove(org.apache.mina.core.filterchain.IoFilter p0)`
- `public abstract org.apache.mina.core.filterchain.IoFilter replace(java.lang.Class p0, org.apache.mina.core.filterchain.IoFilter p1)`
- `public abstract org.apache.mina.core.filterchain.IoFilter replace(java.lang.String p0, org.apache.mina.core.filterchain.IoFilter p1)`
- `public abstract void replace(org.apache.mina.core.filterchain.IoFilter p0, org.apache.mina.core.filterchain.IoFilter p1)`

---

## public abstract static interface `org.apache.mina.core.filterchain.IoFilterChain$Entry`

**Methods:**
- `public abstract void addAfter(java.lang.String p0, org.apache.mina.core.filterchain.IoFilter p1)`
- `public abstract void addBefore(java.lang.String p0, org.apache.mina.core.filterchain.IoFilter p1)`
- `public abstract org.apache.mina.core.filterchain.IoFilter getFilter()`
- `public abstract java.lang.String getName()`
- `public abstract org.apache.mina.core.filterchain.IoFilter$NextFilter getNextFilter()`
- `public abstract void remove()`
- `public abstract void replace(org.apache.mina.core.filterchain.IoFilter p0)`

---

## public abstract interface `org.apache.mina.core.filterchain.IoFilterChainBuilder`

**Fields:**
- `public final static org.apache.mina.core.filterchain.IoFilterChainBuilder NOOP`

**Methods:**
- `public abstract void buildFilterChain(org.apache.mina.core.filterchain.IoFilterChain p0) throws java.lang.Exception`

---

## public class `org.apache.mina.core.filterchain.IoFilterEvent`
extends `org.apache.mina.core.session.IoEvent`  

**Constructors:**
- `public IoFilterEvent(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoEventType p1, org.apache.mina.core.session.IoSession p2, java.lang.Object p3)`

**Methods:**
- `public void fire()`
- `public org.apache.mina.core.filterchain.IoFilter$NextFilter getNextFilter()`

---

## public class `org.apache.mina.core.filterchain.IoFilterLifeCycleException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public IoFilterLifeCycleException()`
- `public IoFilterLifeCycleException(java.lang.String p0)`
- `public IoFilterLifeCycleException(java.lang.String p0, java.lang.Throwable p1)`
- `public IoFilterLifeCycleException(java.lang.Throwable p0)`

---

## public abstract interface `org.apache.mina.core.future.CloseFuture`
implements `org.apache.mina.core.future.IoFuture`  

**Methods:**
- `public abstract org.apache.mina.core.future.CloseFuture addListener(org.apache.mina.core.future.IoFutureListener p0)`
- `public abstract org.apache.mina.core.future.CloseFuture await() throws java.lang.InterruptedException`
- `public abstract org.apache.mina.core.future.CloseFuture awaitUninterruptibly()`
- `public abstract boolean isClosed()`
- `public abstract org.apache.mina.core.future.CloseFuture removeListener(org.apache.mina.core.future.IoFutureListener p0)`
- `public abstract void setClosed()`

---

## public class `org.apache.mina.core.future.CompositeIoFuture`<E extends org.apache.mina.core.future.IoFuture>
extends `org.apache.mina.core.future.DefaultIoFuture`  

**Constructors:**
- `public CompositeIoFuture(java.lang.Iterable p0)`

---

## public abstract interface `org.apache.mina.core.future.ConnectFuture`
implements `org.apache.mina.core.future.IoFuture`  

**Methods:**
- `public abstract org.apache.mina.core.future.ConnectFuture addListener(org.apache.mina.core.future.IoFutureListener p0)`
- `public abstract org.apache.mina.core.future.ConnectFuture await() throws java.lang.InterruptedException`
- `public abstract org.apache.mina.core.future.ConnectFuture awaitUninterruptibly()`
- `public abstract boolean cancel()`
- `public abstract java.lang.Throwable getException()`
- `public abstract org.apache.mina.core.session.IoSession getSession()`
- `public abstract boolean isCanceled()`
- `public abstract boolean isConnected()`
- `public abstract org.apache.mina.core.future.ConnectFuture removeListener(org.apache.mina.core.future.IoFutureListener p0)`
- `public abstract void setException(java.lang.Throwable p0)`
- `public abstract void setSession(org.apache.mina.core.session.IoSession p0)`

---

## public class `org.apache.mina.core.future.DefaultCloseFuture`
extends `org.apache.mina.core.future.DefaultIoFuture`  
implements `org.apache.mina.core.future.CloseFuture`  

**Constructors:**
- `public DefaultCloseFuture(org.apache.mina.core.session.IoSession p0)`

**Methods:**
- `public org.apache.mina.core.future.CloseFuture addListener(org.apache.mina.core.future.IoFutureListener p0)`
- `public org.apache.mina.core.future.CloseFuture await() throws java.lang.InterruptedException`
- `public org.apache.mina.core.future.CloseFuture awaitUninterruptibly()`
- `public boolean isClosed()`
- `public org.apache.mina.core.future.CloseFuture removeListener(org.apache.mina.core.future.IoFutureListener p0)`
- `public void setClosed()`

---

## public class `org.apache.mina.core.future.DefaultConnectFuture`
extends `org.apache.mina.core.future.DefaultIoFuture`  
implements `org.apache.mina.core.future.ConnectFuture`  

**Constructors:**
- `public DefaultConnectFuture()`

**Methods:**
- `public org.apache.mina.core.future.ConnectFuture addListener(org.apache.mina.core.future.IoFutureListener p0)`
- `public org.apache.mina.core.future.ConnectFuture await() throws java.lang.InterruptedException`
- `public org.apache.mina.core.future.ConnectFuture awaitUninterruptibly()`
- `public boolean cancel()`
- `public java.lang.Throwable getException()`
- `public org.apache.mina.core.session.IoSession getSession()`
- `public boolean isCanceled()`
- `public boolean isConnected()`
- `public static org.apache.mina.core.future.ConnectFuture newFailedFuture(java.lang.Throwable p0)`
- `public org.apache.mina.core.future.ConnectFuture removeListener(org.apache.mina.core.future.IoFutureListener p0)`
- `public void setException(java.lang.Throwable p0)`
- `public void setSession(org.apache.mina.core.session.IoSession p0)`

---

## public class `org.apache.mina.core.future.DefaultIoFuture`
implements `org.apache.mina.core.future.IoFuture`  

**Constructors:**
- `public DefaultIoFuture(org.apache.mina.core.session.IoSession p0)`

**Methods:**
- `public org.apache.mina.core.future.IoFuture addListener(org.apache.mina.core.future.IoFutureListener p0)`
- `public org.apache.mina.core.future.IoFuture await() throws java.lang.InterruptedException`
- `public boolean await(long p0) throws java.lang.InterruptedException`
- `public boolean await(long p0, java.util.concurrent.TimeUnit p1) throws java.lang.InterruptedException`
- `public org.apache.mina.core.future.IoFuture awaitUninterruptibly()`
- `public boolean awaitUninterruptibly(long p0)`
- `public boolean awaitUninterruptibly(long p0, java.util.concurrent.TimeUnit p1)`
- `public org.apache.mina.core.session.IoSession getSession()`
- `protected java.lang.Object getValue()`
- `public boolean isDone()`
- `public void join()`
- `public boolean join(long p0)`
- `public org.apache.mina.core.future.IoFuture removeListener(org.apache.mina.core.future.IoFutureListener p0)`
- `public boolean setValue(java.lang.Object p0)`

---

## public class `org.apache.mina.core.future.DefaultReadFuture`
extends `org.apache.mina.core.future.DefaultIoFuture`  
implements `org.apache.mina.core.future.ReadFuture`  

**Constructors:**
- `public DefaultReadFuture(org.apache.mina.core.session.IoSession p0)`

**Methods:**
- `public org.apache.mina.core.future.ReadFuture addListener(org.apache.mina.core.future.IoFutureListener p0)`
- `public org.apache.mina.core.future.ReadFuture await() throws java.lang.InterruptedException`
- `public org.apache.mina.core.future.ReadFuture awaitUninterruptibly()`
- `public java.lang.Throwable getException()`
- `public java.lang.Object getMessage()`
- `public boolean isClosed()`
- `public boolean isRead()`
- `public org.apache.mina.core.future.ReadFuture removeListener(org.apache.mina.core.future.IoFutureListener p0)`
- `public void setClosed()`
- `public void setException(java.lang.Throwable p0)`
- `public void setRead(java.lang.Object p0)`

---

## public class `org.apache.mina.core.future.DefaultWriteFuture`
extends `org.apache.mina.core.future.DefaultIoFuture`  
implements `org.apache.mina.core.future.WriteFuture`  

**Constructors:**
- `public DefaultWriteFuture(org.apache.mina.core.session.IoSession p0)`

**Methods:**
- `public org.apache.mina.core.future.WriteFuture addListener(org.apache.mina.core.future.IoFutureListener p0)`
- `public org.apache.mina.core.future.WriteFuture await() throws java.lang.InterruptedException`
- `public org.apache.mina.core.future.WriteFuture awaitUninterruptibly()`
- `public java.lang.Throwable getException()`
- `public boolean isWritten()`
- `public static org.apache.mina.core.future.WriteFuture newNotWrittenFuture(org.apache.mina.core.session.IoSession p0, java.lang.Throwable p1)`
- `public static org.apache.mina.core.future.WriteFuture newWrittenFuture(org.apache.mina.core.session.IoSession p0)`
- `public org.apache.mina.core.future.WriteFuture removeListener(org.apache.mina.core.future.IoFutureListener p0)`
- `public void setException(java.lang.Throwable p0)`
- `public void setWritten()`

---

## public abstract interface `org.apache.mina.core.future.IoFuture`

**Methods:**
- `public abstract org.apache.mina.core.future.IoFuture addListener(org.apache.mina.core.future.IoFutureListener p0)`
- `public abstract org.apache.mina.core.future.IoFuture await() throws java.lang.InterruptedException`
- `public abstract boolean await(long p0) throws java.lang.InterruptedException`
- `public abstract boolean await(long p0, java.util.concurrent.TimeUnit p1) throws java.lang.InterruptedException`
- `public abstract org.apache.mina.core.future.IoFuture awaitUninterruptibly()`
- `public abstract boolean awaitUninterruptibly(long p0)`
- `public abstract boolean awaitUninterruptibly(long p0, java.util.concurrent.TimeUnit p1)`
- `public abstract org.apache.mina.core.session.IoSession getSession()`
- `public abstract boolean isDone()`
- `public abstract void join()`
- `public abstract boolean join(long p0)`
- `public abstract org.apache.mina.core.future.IoFuture removeListener(org.apache.mina.core.future.IoFutureListener p0)`

---

## public abstract interface `org.apache.mina.core.future.IoFutureListener`<F extends org.apache.mina.core.future.IoFuture>
implements `java.util.EventListener`  

**Fields:**
- `public final static org.apache.mina.core.future.IoFutureListener CLOSE`

**Methods:**
- `public abstract void operationComplete(F p0)`

---

## public abstract interface `org.apache.mina.core.future.ReadFuture`
implements `org.apache.mina.core.future.IoFuture`  

**Methods:**
- `public abstract org.apache.mina.core.future.ReadFuture addListener(org.apache.mina.core.future.IoFutureListener p0)`
- `public abstract org.apache.mina.core.future.ReadFuture await() throws java.lang.InterruptedException`
- `public abstract org.apache.mina.core.future.ReadFuture awaitUninterruptibly()`
- `public abstract java.lang.Throwable getException()`
- `public abstract java.lang.Object getMessage()`
- `public abstract boolean isClosed()`
- `public abstract boolean isRead()`
- `public abstract org.apache.mina.core.future.ReadFuture removeListener(org.apache.mina.core.future.IoFutureListener p0)`
- `public abstract void setClosed()`
- `public abstract void setException(java.lang.Throwable p0)`
- `public abstract void setRead(java.lang.Object p0)`

---

## public abstract interface `org.apache.mina.core.future.WriteFuture`
implements `org.apache.mina.core.future.IoFuture`  

**Methods:**
- `public abstract org.apache.mina.core.future.WriteFuture addListener(org.apache.mina.core.future.IoFutureListener p0)`
- `public abstract org.apache.mina.core.future.WriteFuture await() throws java.lang.InterruptedException`
- `public abstract org.apache.mina.core.future.WriteFuture awaitUninterruptibly()`
- `public abstract java.lang.Throwable getException()`
- `public abstract boolean isWritten()`
- `public abstract org.apache.mina.core.future.WriteFuture removeListener(org.apache.mina.core.future.IoFutureListener p0)`
- `public abstract void setException(java.lang.Throwable p0)`
- `public abstract void setWritten()`

---

## public abstract class `org.apache.mina.core.polling.AbstractPollingIoAcceptor`<S extends org.apache.mina.core.session.AbstractIoSession, H extends java.lang.Object>
extends `org.apache.mina.core.service.AbstractIoAcceptor`  

**Constructors:**
- `protected AbstractPollingIoAcceptor(org.apache.mina.core.session.IoSessionConfig p0, java.lang.Class p1)`
- `protected AbstractPollingIoAcceptor(org.apache.mina.core.session.IoSessionConfig p0, java.lang.Class p1, int p2)`
- `protected AbstractPollingIoAcceptor(org.apache.mina.core.session.IoSessionConfig p0, java.lang.Class p1, int p2, java.nio.channels.spi.SelectorProvider p3)`
- `protected AbstractPollingIoAcceptor(org.apache.mina.core.session.IoSessionConfig p0, java.util.concurrent.Executor p1, org.apache.mina.core.service.IoProcessor p2)`
- `protected AbstractPollingIoAcceptor(org.apache.mina.core.session.IoSessionConfig p0, org.apache.mina.core.service.IoProcessor p1)`

**Fields:**
- `protected int backlog`
- `protected boolean reuseAddress`

**Methods:**
- `protected abstract S accept(org.apache.mina.core.service.IoProcessor p0, H p1) throws java.lang.Exception`
- `protected final java.util.Set bindInternal(java.util.List p0) throws java.lang.Exception`
- `protected abstract void close(H p0) throws java.lang.Exception`
- `protected abstract void destroy() throws java.lang.Exception`
- `protected void dispose0() throws java.lang.Exception`
- `public int getBacklog()`
- `public org.apache.mina.transport.socket.SocketSessionConfig getSessionConfig()`
- `protected abstract void init() throws java.lang.Exception`
- `protected abstract void init(java.nio.channels.spi.SelectorProvider p0) throws java.lang.Exception`
- `public boolean isReuseAddress()`
- `protected abstract java.net.SocketAddress localAddress(H p0) throws java.lang.Exception`
- `public final org.apache.mina.core.session.IoSession newSession(java.net.SocketAddress p0, java.net.SocketAddress p1)`
- `protected abstract H open(java.net.SocketAddress p0) throws java.lang.Exception`
- `protected abstract int select() throws java.lang.Exception`
- `protected abstract java.util.Iterator selectedHandles()`
- `public void setBacklog(int p0)`
- `public void setReuseAddress(boolean p0)`
- `protected final void unbind0(java.util.List p0) throws java.lang.Exception`
- `protected abstract void wakeup()`

---

## public abstract class `org.apache.mina.core.polling.AbstractPollingIoConnector`<S extends org.apache.mina.core.session.AbstractIoSession, H extends java.lang.Object>
extends `org.apache.mina.core.service.AbstractIoConnector`  

**Constructors:**
- `protected AbstractPollingIoConnector(org.apache.mina.core.session.IoSessionConfig p0, java.lang.Class p1)`
- `protected AbstractPollingIoConnector(org.apache.mina.core.session.IoSessionConfig p0, java.lang.Class p1, int p2)`
- `protected AbstractPollingIoConnector(org.apache.mina.core.session.IoSessionConfig p0, java.util.concurrent.Executor p1, org.apache.mina.core.service.IoProcessor p2)`
- `protected AbstractPollingIoConnector(org.apache.mina.core.session.IoSessionConfig p0, org.apache.mina.core.service.IoProcessor p1)`

**Methods:**
- `protected abstract java.util.Iterator allHandles()`
- `protected abstract void close(H p0) throws java.lang.Exception`
- `protected abstract boolean connect(H p0, java.net.SocketAddress p1) throws java.lang.Exception`
- `protected final org.apache.mina.core.future.ConnectFuture connect0(java.net.SocketAddress p0, java.net.SocketAddress p1, org.apache.mina.core.session.IoSessionInitializer p2)`
- `protected abstract void destroy() throws java.lang.Exception`
- `protected final void dispose0() throws java.lang.Exception`
- `protected abstract boolean finishConnect(H p0) throws java.lang.Exception`
- `protected abstract org.apache.mina.core.polling.AbstractPollingIoConnector$ConnectionRequest getConnectionRequest(H p0)`
- `protected abstract void init() throws java.lang.Exception`
- `protected abstract H newHandle(java.net.SocketAddress p0) throws java.lang.Exception`
- `protected abstract S newSession(org.apache.mina.core.service.IoProcessor p0, H p1) throws java.lang.Exception`
- `protected abstract void register(H p0, org.apache.mina.core.polling.AbstractPollingIoConnector$ConnectionRequest p1) throws java.lang.Exception`
- `protected abstract int select(int p0) throws java.lang.Exception`
- `protected abstract java.util.Iterator selectedHandles()`
- `protected abstract void wakeup()`

---

## public final class `org.apache.mina.core.polling.AbstractPollingIoConnector$ConnectionRequest`
extends `org.apache.mina.core.future.DefaultConnectFuture`  

**Constructors:**
- `public ConnectionRequest(H p0, org.apache.mina.core.session.IoSessionInitializer p1)`

**Methods:**
- `public boolean cancel()`
- `public long getDeadline()`
- `public H getHandle()`
- `public org.apache.mina.core.session.IoSessionInitializer getSessionInitializer()`

---

## public abstract class `org.apache.mina.core.polling.AbstractPollingIoProcessor`<S extends org.apache.mina.core.session.AbstractIoSession>
implements `org.apache.mina.core.service.IoProcessor<S>`  

**Constructors:**
- `protected AbstractPollingIoProcessor(java.util.concurrent.Executor p0)`

**Fields:**
- `protected java.util.concurrent.atomic.AtomicBoolean wakeupCalled`

**Methods:**
- `public final void add(S p0)`
- `protected abstract java.util.Iterator allSessions()`
- `protected abstract int allSessionsCount()`
- `protected abstract void destroy(S p0) throws java.lang.Exception`
- `public final void dispose()`
- `protected abstract void doDispose() throws java.lang.Exception`
- `public final void flush(S p0)`
- `protected abstract org.apache.mina.core.session.SessionState getState(S p0)`
- `protected abstract void init(S p0) throws java.lang.Exception`
- `protected abstract boolean isBrokenConnection() throws java.io.IOException`
- `public final boolean isDisposed()`
- `public final boolean isDisposing()`
- `protected abstract boolean isInterestedInRead(S p0)`
- `protected abstract boolean isInterestedInWrite(S p0)`
- `protected abstract boolean isReadable(S p0)`
- `protected abstract boolean isSelectorEmpty()`
- `protected abstract boolean isWritable(S p0)`
- `protected abstract int read(S p0, org.apache.mina.core.buffer.IoBuffer p1) throws java.lang.Exception`
- `protected abstract void registerNewSelector() throws java.io.IOException`
- `public final void remove(S p0)`
- `protected abstract int select() throws java.lang.Exception`
- `protected abstract int select(long p0) throws java.lang.Exception`
- `protected abstract java.util.Iterator selectedSessions()`
- `protected abstract void setInterestedInRead(S p0, boolean p1) throws java.lang.Exception`
- `protected abstract void setInterestedInWrite(S p0, boolean p1) throws java.lang.Exception`
- `protected abstract int transferFile(S p0, org.apache.mina.core.file.FileRegion p1, int p2) throws java.lang.Exception`
- `public void updateTrafficControl(S p0)`
- `public final void updateTrafficMask(S p0)`
- `protected abstract void wakeup()`
- `protected abstract int write(S p0, org.apache.mina.core.buffer.IoBuffer p1, int p2) throws java.io.IOException`
- `public void write(S p0, org.apache.mina.core.write.WriteRequest p1)`

---

## public abstract class `org.apache.mina.core.service.AbstractIoAcceptor`
extends `org.apache.mina.core.service.AbstractIoService`  
implements `org.apache.mina.core.service.IoAcceptor`  

**Constructors:**
- `protected AbstractIoAcceptor(org.apache.mina.core.session.IoSessionConfig p0, java.util.concurrent.Executor p1)`

**Fields:**
- `protected final java.lang.Object bindLock`

**Methods:**
- `public final void bind() throws java.io.IOException`
- `public final void bind(java.lang.Iterable p0) throws java.io.IOException`
- `public final void bind(java.net.SocketAddress p0) throws java.io.IOException`
- `public final void bind(java.net.SocketAddress p0, java.net.SocketAddress... p1) throws java.io.IOException`
- `public final void bind(java.net.SocketAddress... p0) throws java.io.IOException`
- `protected abstract java.util.Set bindInternal(java.util.List p0) throws java.lang.Exception`
- `public java.net.SocketAddress getDefaultLocalAddress()`
- `public final java.util.List getDefaultLocalAddresses()`
- `public java.net.SocketAddress getLocalAddress()`
- `public final java.util.Set getLocalAddresses()`
- `public final boolean isCloseOnDeactivation()`
- `public final void setCloseOnDeactivation(boolean p0)`
- `public final void setDefaultLocalAddress(java.net.SocketAddress p0)`
- `public final void setDefaultLocalAddresses(java.lang.Iterable p0)`
- `public final void setDefaultLocalAddresses(java.net.SocketAddress p0, java.net.SocketAddress... p1)`
- `public final void setDefaultLocalAddresses(java.util.List p0)`
- `public java.lang.String toString()`
- `public final void unbind()`
- `public final void unbind(java.lang.Iterable p0)`
- `public final void unbind(java.net.SocketAddress p0)`
- `public final void unbind(java.net.SocketAddress p0, java.net.SocketAddress... p1)`
- `protected abstract void unbind0(java.util.List p0) throws java.lang.Exception`

---

## public static class `org.apache.mina.core.service.AbstractIoAcceptor$AcceptorOperationFuture`
extends `org.apache.mina.core.service.AbstractIoService$ServiceOperationFuture`  

**Constructors:**
- `public AcceptorOperationFuture(java.util.List p0)`

**Methods:**
- `public final java.util.List getLocalAddresses()`
- `public java.lang.String toString()`

---

## public abstract class `org.apache.mina.core.service.AbstractIoConnector`
extends `org.apache.mina.core.service.AbstractIoService`  
implements `org.apache.mina.core.service.IoConnector`  

**Constructors:**
- `protected AbstractIoConnector(org.apache.mina.core.session.IoSessionConfig p0, java.util.concurrent.Executor p1)`

**Methods:**
- `public final org.apache.mina.core.future.ConnectFuture connect()`
- `public final org.apache.mina.core.future.ConnectFuture connect(java.net.SocketAddress p0)`
- `public org.apache.mina.core.future.ConnectFuture connect(java.net.SocketAddress p0, java.net.SocketAddress p1)`
- `public final org.apache.mina.core.future.ConnectFuture connect(java.net.SocketAddress p0, java.net.SocketAddress p1, org.apache.mina.core.session.IoSessionInitializer p2)`
- `public org.apache.mina.core.future.ConnectFuture connect(java.net.SocketAddress p0, org.apache.mina.core.session.IoSessionInitializer p1)`
- `public org.apache.mina.core.future.ConnectFuture connect(org.apache.mina.core.session.IoSessionInitializer p0)`
- `protected abstract org.apache.mina.core.future.ConnectFuture connect0(java.net.SocketAddress p0, java.net.SocketAddress p1, org.apache.mina.core.session.IoSessionInitializer p2)`
- `protected final void finishSessionInitialization0(org.apache.mina.core.session.IoSession p0, org.apache.mina.core.future.IoFuture p1)`
- `public final int getConnectTimeout()`
- `public long getConnectTimeoutCheckInterval()`
- `public final long getConnectTimeoutMillis()`
- `public final java.net.SocketAddress getDefaultLocalAddress()`
- `public java.net.SocketAddress getDefaultRemoteAddress()`
- `public final void setConnectTimeout(int p0)`
- `public void setConnectTimeoutCheckInterval(long p0)`
- `public final void setConnectTimeoutMillis(long p0)`
- `public final void setDefaultLocalAddress(java.net.SocketAddress p0)`
- `public final void setDefaultRemoteAddress(java.net.SocketAddress p0)`
- `public java.lang.String toString()`

---

## public abstract class `org.apache.mina.core.service.AbstractIoService`
implements `org.apache.mina.core.service.IoService`  

**Constructors:**
- `protected AbstractIoService(org.apache.mina.core.session.IoSessionConfig p0, java.util.concurrent.Executor p1)`

**Fields:**
- `protected final static org.slf4j.Logger LOGGER`
- `protected final java.lang.Object disposalLock`
- `protected final org.apache.mina.core.session.IoSessionConfig sessionConfig`

**Methods:**
- `public final void addListener(org.apache.mina.core.service.IoServiceListener p0)`
- `public final java.util.Set broadcast(java.lang.Object p0)`
- `public final void dispose()`
- `public final void dispose(boolean p0)`
- `protected abstract void dispose0() throws java.lang.Exception`
- `protected final void executeWorker(java.lang.Runnable p0)`
- `protected final void executeWorker(java.lang.Runnable p0, java.lang.String p1)`
- `protected void finishSessionInitialization0(org.apache.mina.core.session.IoSession p0, org.apache.mina.core.future.IoFuture p1)`
- `public final long getActivationTime()`
- `public final org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder getFilterChain()`
- `public final org.apache.mina.core.filterchain.IoFilterChainBuilder getFilterChainBuilder()`
- `public final org.apache.mina.core.service.IoHandler getHandler()`
- `public final org.apache.mina.core.service.IoServiceListenerSupport getListeners()`
- `public final int getManagedSessionCount()`
- `public final java.util.Map getManagedSessions()`
- `public int getScheduledWriteBytes()`
- `public int getScheduledWriteMessages()`
- `public final org.apache.mina.core.session.IoSessionDataStructureFactory getSessionDataStructureFactory()`
- `public org.apache.mina.core.service.IoServiceStatistics getStatistics()`
- `protected final void initSession(org.apache.mina.core.session.IoSession p0, org.apache.mina.core.future.IoFuture p1, org.apache.mina.core.session.IoSessionInitializer p2)`
- `public final boolean isActive()`
- `public final boolean isDisposed()`
- `public final boolean isDisposing()`
- `public final void removeListener(org.apache.mina.core.service.IoServiceListener p0)`
- `public final void setFilterChainBuilder(org.apache.mina.core.filterchain.IoFilterChainBuilder p0)`
- `public final void setHandler(org.apache.mina.core.service.IoHandler p0)`
- `public final void setSessionDataStructureFactory(org.apache.mina.core.session.IoSessionDataStructureFactory p0)`

---

## protected static class `org.apache.mina.core.service.AbstractIoService$ServiceOperationFuture`
extends `org.apache.mina.core.future.DefaultIoFuture`  

**Constructors:**
- `public ServiceOperationFuture()`

**Methods:**
- `public final java.lang.Exception getException()`
- `public final boolean isDone()`
- `public final void setDone()`
- `public final void setException(java.lang.Exception p0)`

---

## public class `org.apache.mina.core.service.DefaultTransportMetadata`
implements `org.apache.mina.core.service.TransportMetadata`  

**Constructors:**
- `public DefaultTransportMetadata(java.lang.String p0, java.lang.String p1, boolean p2, boolean p3, java.lang.Class p4, java.lang.Class p5, java.lang.Class... p6)`

**Methods:**
- `public java.lang.Class getAddressType()`
- `public java.util.Set getEnvelopeTypes()`
- `public java.lang.String getName()`
- `public java.lang.String getProviderName()`
- `public java.lang.Class getSessionConfigType()`
- `public boolean hasFragmentation()`
- `public boolean isConnectionless()`
- `public java.lang.String toString()`

---

## public abstract interface `org.apache.mina.core.service.IoAcceptor`
implements `org.apache.mina.core.service.IoService`  

**Methods:**
- `public abstract void bind() throws java.io.IOException`
- `public abstract void bind(java.lang.Iterable p0) throws java.io.IOException`
- `public abstract void bind(java.net.SocketAddress p0) throws java.io.IOException`
- `public abstract void bind(java.net.SocketAddress p0, java.net.SocketAddress... p1) throws java.io.IOException`
- `public abstract void bind(java.net.SocketAddress... p0) throws java.io.IOException`
- `public abstract java.net.SocketAddress getDefaultLocalAddress()`
- `public abstract java.util.List getDefaultLocalAddresses()`
- `public abstract java.net.SocketAddress getLocalAddress()`
- `public abstract java.util.Set getLocalAddresses()`
- `public abstract boolean isCloseOnDeactivation()`
- `public abstract org.apache.mina.core.session.IoSession newSession(java.net.SocketAddress p0, java.net.SocketAddress p1)`
- `public abstract void setCloseOnDeactivation(boolean p0)`
- `public abstract void setDefaultLocalAddress(java.net.SocketAddress p0)`
- `public abstract void setDefaultLocalAddresses(java.lang.Iterable p0)`
- `public abstract void setDefaultLocalAddresses(java.net.SocketAddress p0, java.net.SocketAddress... p1)`
- `public abstract void setDefaultLocalAddresses(java.util.List p0)`
- `public abstract void unbind()`
- `public abstract void unbind(java.lang.Iterable p0)`
- `public abstract void unbind(java.net.SocketAddress p0)`
- `public abstract void unbind(java.net.SocketAddress p0, java.net.SocketAddress... p1)`

---

## public abstract interface `org.apache.mina.core.service.IoConnector`
implements `org.apache.mina.core.service.IoService`  

**Methods:**
- `public abstract org.apache.mina.core.future.ConnectFuture connect()`
- `public abstract org.apache.mina.core.future.ConnectFuture connect(java.net.SocketAddress p0)`
- `public abstract org.apache.mina.core.future.ConnectFuture connect(java.net.SocketAddress p0, java.net.SocketAddress p1)`
- `public abstract org.apache.mina.core.future.ConnectFuture connect(java.net.SocketAddress p0, java.net.SocketAddress p1, org.apache.mina.core.session.IoSessionInitializer p2)`
- `public abstract org.apache.mina.core.future.ConnectFuture connect(java.net.SocketAddress p0, org.apache.mina.core.session.IoSessionInitializer p1)`
- `public abstract org.apache.mina.core.future.ConnectFuture connect(org.apache.mina.core.session.IoSessionInitializer p0)`
- `public abstract int getConnectTimeout()`
- `public abstract long getConnectTimeoutMillis()`
- `public abstract java.net.SocketAddress getDefaultLocalAddress()`
- `public abstract java.net.SocketAddress getDefaultRemoteAddress()`
- `public abstract void setConnectTimeout(int p0)`
- `public abstract void setConnectTimeoutMillis(long p0)`
- `public abstract void setDefaultLocalAddress(java.net.SocketAddress p0)`
- `public abstract void setDefaultRemoteAddress(java.net.SocketAddress p0)`

---

## public abstract interface `org.apache.mina.core.service.IoHandler`

**Methods:**
- `public abstract void event(org.apache.mina.core.session.IoSession p0, org.apache.mina.filter.FilterEvent p1) throws java.lang.Exception`
- `public abstract void exceptionCaught(org.apache.mina.core.session.IoSession p0, java.lang.Throwable p1) throws java.lang.Exception`
- `public abstract void inputClosed(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public abstract void messageReceived(org.apache.mina.core.session.IoSession p0, java.lang.Object p1) throws java.lang.Exception`
- `public abstract void messageSent(org.apache.mina.core.session.IoSession p0, java.lang.Object p1) throws java.lang.Exception`
- `public abstract void sessionClosed(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public abstract void sessionCreated(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public abstract void sessionIdle(org.apache.mina.core.session.IoSession p0, org.apache.mina.core.session.IdleStatus p1) throws java.lang.Exception`
- `public abstract void sessionOpened(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`

---

## public class `org.apache.mina.core.service.IoHandlerAdapter`
implements `org.apache.mina.core.service.IoHandler`  

**Constructors:**
- `public IoHandlerAdapter()`

**Methods:**
- `public void event(org.apache.mina.core.session.IoSession p0, org.apache.mina.filter.FilterEvent p1) throws java.lang.Exception`
- `public void exceptionCaught(org.apache.mina.core.session.IoSession p0, java.lang.Throwable p1) throws java.lang.Exception`
- `public void inputClosed(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public void messageReceived(org.apache.mina.core.session.IoSession p0, java.lang.Object p1) throws java.lang.Exception`
- `public void messageSent(org.apache.mina.core.session.IoSession p0, java.lang.Object p1) throws java.lang.Exception`
- `public void sessionClosed(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public void sessionCreated(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public void sessionIdle(org.apache.mina.core.session.IoSession p0, org.apache.mina.core.session.IdleStatus p1) throws java.lang.Exception`
- `public void sessionOpened(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`

---

## public abstract interface `org.apache.mina.core.service.IoProcessor`<S extends org.apache.mina.core.session.IoSession>

**Methods:**
- `public abstract void add(S p0)`
- `public abstract void dispose()`
- `public abstract void flush(S p0)`
- `public abstract boolean isDisposed()`
- `public abstract boolean isDisposing()`
- `public abstract void remove(S p0)`
- `public abstract void updateTrafficControl(S p0)`
- `public abstract void write(S p0, org.apache.mina.core.write.WriteRequest p1)`

---

## public abstract interface `org.apache.mina.core.service.IoService`

**Methods:**
- `public abstract void addListener(org.apache.mina.core.service.IoServiceListener p0)`
- `public abstract java.util.Set broadcast(java.lang.Object p0)`
- `public abstract void dispose()`
- `public abstract void dispose(boolean p0)`
- `public abstract long getActivationTime()`
- `public abstract org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder getFilterChain()`
- `public abstract org.apache.mina.core.filterchain.IoFilterChainBuilder getFilterChainBuilder()`
- `public abstract org.apache.mina.core.service.IoHandler getHandler()`
- `public abstract int getManagedSessionCount()`
- `public abstract java.util.Map getManagedSessions()`
- `public abstract int getScheduledWriteBytes()`
- `public abstract int getScheduledWriteMessages()`
- `public abstract org.apache.mina.core.session.IoSessionConfig getSessionConfig()`
- `public abstract org.apache.mina.core.session.IoSessionDataStructureFactory getSessionDataStructureFactory()`
- `public abstract org.apache.mina.core.service.IoServiceStatistics getStatistics()`
- `public abstract org.apache.mina.core.service.TransportMetadata getTransportMetadata()`
- `public abstract boolean isActive()`
- `public abstract boolean isDisposed()`
- `public abstract boolean isDisposing()`
- `public abstract void removeListener(org.apache.mina.core.service.IoServiceListener p0)`
- `public abstract void setFilterChainBuilder(org.apache.mina.core.filterchain.IoFilterChainBuilder p0)`
- `public abstract void setHandler(org.apache.mina.core.service.IoHandler p0)`
- `public abstract void setSessionDataStructureFactory(org.apache.mina.core.session.IoSessionDataStructureFactory p0)`

---

## public abstract interface `org.apache.mina.core.service.IoServiceListener`
implements `java.util.EventListener`  

**Methods:**
- `public abstract void serviceActivated(org.apache.mina.core.service.IoService p0) throws java.lang.Exception`
- `public abstract void serviceDeactivated(org.apache.mina.core.service.IoService p0) throws java.lang.Exception`
- `public abstract void serviceIdle(org.apache.mina.core.service.IoService p0, org.apache.mina.core.session.IdleStatus p1) throws java.lang.Exception`
- `public abstract void sessionClosed(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public abstract void sessionCreated(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public abstract void sessionDestroyed(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`

---

## public class `org.apache.mina.core.service.IoServiceListenerSupport`

**Constructors:**
- `public IoServiceListenerSupport(org.apache.mina.core.service.IoService p0)`

**Methods:**
- `public void add(org.apache.mina.core.service.IoServiceListener p0)`
- `public void fireServiceActivated()`
- `public void fireServiceDeactivated()`
- `public void fireSessionCreated(org.apache.mina.core.session.IoSession p0)`
- `public void fireSessionDestroyed(org.apache.mina.core.session.IoSession p0)`
- `public long getActivationTime()`
- `public long getCumulativeManagedSessionCount()`
- `public int getLargestManagedSessionCount()`
- `public int getManagedSessionCount()`
- `public java.util.Map getManagedSessions()`
- `public boolean isActive()`
- `public void remove(org.apache.mina.core.service.IoServiceListener p0)`

---

## public class `org.apache.mina.core.service.IoServiceStatistics`

**Constructors:**
- `public IoServiceStatistics(org.apache.mina.core.service.IoService p0)`

**Methods:**
- `public final void decreaseScheduledWriteMessages()`
- `public final org.apache.mina.core.service.IoServiceStatistics$Config getConfig()`
- `public final long getCumulativeManagedSessionCount()`
- `public final int getLargestManagedSessionCount()`
- `public final double getLargestReadBytesThroughput()`
- `public final double getLargestReadMessagesThroughput()`
- `public final double getLargestWrittenBytesThroughput()`
- `public final double getLargestWrittenMessagesThroughput()`
- `public final long getLastIoTime()`
- `public final long getLastReadTime()`
- `public final long getLastWriteTime()`
- `public final long getReadBytes()`
- `public final double getReadBytesThroughput()`
- `public final long getReadMessages()`
- `public final double getReadMessagesThroughput()`
- `public final int getScheduledWriteBytes()`
- `public final int getScheduledWriteMessages()`
- `public final int getThroughputCalculationInterval()`
- `public final long getThroughputCalculationIntervalInMillis()`
- `public final long getWrittenBytes()`
- `public final double getWrittenBytesThroughput()`
- `public final long getWrittenMessages()`
- `public final double getWrittenMessagesThroughput()`
- `public final void increaseReadBytes(long p0, long p1)`
- `public final void increaseReadMessages(long p0)`
- `public final void increaseScheduledWriteBytes(int p0)`
- `public final void increaseScheduledWriteMessages()`
- `public final void increaseWrittenBytes(int p0, long p1)`
- `public final void increaseWrittenMessages(long p0)`
- `protected final void setLastReadTime(long p0)`
- `protected void setLastThroughputCalculationTime(long p0)`
- `protected final void setLastWriteTime(long p0)`
- `public final void setThroughputCalculationInterval(int p0)`
- `public void updateThroughput(long p0)`

---

## public final static class `org.apache.mina.core.service.IoServiceStatistics$Config`

**Constructors:**
- `public Config()`

**Methods:**
- `public int getThroughputCalculationInterval()`
- `public long getThroughputCalculationIntervalInMillis()`
- `public boolean isLastReadTimeCalcEnabled()`
- `public boolean isLastWriteTimeCalcEnabled()`
- `public boolean isReadBytesCalcEnabled()`
- `public boolean isReadMessagesCalcEnabled()`
- `public boolean isScheduledWriteBytesCalcEnabled()`
- `public boolean isScheduledWriteMessagesCalcEnabled()`
- `public boolean isStatisticsCalcEnabled()`
- `public boolean isWrittenBytesCalcEnabled()`
- `public boolean isWrittenMessagesCalcEnabled()`
- `public void setLastReadTimeCalcEnabled(boolean p0)`
- `public void setLastWriteTimeCalcEnabled(boolean p0)`
- `public void setReadBytesCalcEnabled(boolean p0)`
- `public void setReadMessagesCalcEnabled(boolean p0)`
- `public void setScheduledWriteBytesCalcEnabled(boolean p0)`
- `public void setScheduledWriteMessagesCalcEnabled(boolean p0)`
- `public void setStatisticsCalcEnabled(boolean p0)`
- `public void setThroughputCalculationInterval(int p0)`
- `public void setWrittenBytesCalcEnabled(boolean p0)`
- `public void setWrittenMessagesCalcEnabled(boolean p0)`

---

## public class `org.apache.mina.core.service.SimpleIoProcessorPool`<S extends org.apache.mina.core.session.AbstractIoSession>
implements `org.apache.mina.core.service.IoProcessor<S>`  

**Constructors:**
- `public SimpleIoProcessorPool(java.lang.Class p0)`
- `public SimpleIoProcessorPool(java.lang.Class p0, int p1)`
- `public SimpleIoProcessorPool(java.lang.Class p0, int p1, java.nio.channels.spi.SelectorProvider p2)`
- `public SimpleIoProcessorPool(java.lang.Class p0, java.util.concurrent.Executor p1)`
- `public SimpleIoProcessorPool(java.lang.Class p0, java.util.concurrent.Executor p1, int p2, java.nio.channels.spi.SelectorProvider p3)`

**Methods:**
- `public final void add(S p0)`
- `public final void dispose()`
- `public final void flush(S p0)`
- `public boolean isDisposed()`
- `public boolean isDisposing()`
- `public final void remove(S p0)`
- `public final void updateTrafficControl(S p0)`
- `public final void write(S p0, org.apache.mina.core.write.WriteRequest p1)`

---

## public abstract interface `org.apache.mina.core.service.TransportMetadata`

**Methods:**
- `public abstract java.lang.Class getAddressType()`
- `public abstract java.util.Set getEnvelopeTypes()`
- `public abstract java.lang.String getName()`
- `public abstract java.lang.String getProviderName()`
- `public abstract java.lang.Class getSessionConfigType()`
- `public abstract boolean hasFragmentation()`
- `public abstract boolean isConnectionless()`

---

## public abstract class `org.apache.mina.core.session.AbstractIoSession`
implements `org.apache.mina.core.session.IoSession`  

**Constructors:**
- `protected AbstractIoSession(org.apache.mina.core.service.IoService p0)`

**Fields:**
- `public final static org.apache.mina.core.write.WriteRequest CLOSE_REQUEST`
- `public final static org.apache.mina.core.write.WriteRequest MESSAGE_SENT_REQUEST`
- `protected org.apache.mina.core.session.IoSessionConfig config`

**Methods:**
- `public final org.apache.mina.core.future.CloseFuture close()`
- `public final org.apache.mina.core.future.CloseFuture close(boolean p0)`
- `public final org.apache.mina.core.future.CloseFuture closeNow()`
- `public final org.apache.mina.core.future.CloseFuture closeOnFlush()`
- `public final boolean containsAttribute(java.lang.Object p0)`
- `public final void decreaseReadBufferSize()`
- `public final void decreaseScheduledBytesAndMessages(org.apache.mina.core.write.WriteRequest p0)`
- `protected void destroy()`
- `public final boolean equals(java.lang.Object p0)`
- `public final java.lang.Object getAttachment()`
- `public final java.lang.Object getAttribute(java.lang.Object p0)`
- `public final java.lang.Object getAttribute(java.lang.Object p0, java.lang.Object p1)`
- `public final java.util.Set getAttributeKeys()`
- `public final org.apache.mina.core.session.IoSessionAttributeMap getAttributeMap()`
- `public final int getBothIdleCount()`
- `public final org.apache.mina.core.future.CloseFuture getCloseFuture()`
- `public org.apache.mina.core.session.IoSessionConfig getConfig()`
- `public final long getCreationTime()`
- `public final java.lang.Object getCurrentWriteMessage()`
- `public final org.apache.mina.core.write.WriteRequest getCurrentWriteRequest()`
- `public org.apache.mina.core.service.IoHandler getHandler()`
- `public final long getId()`
- `public final int getIdleCount(org.apache.mina.core.session.IdleStatus p0)`
- `public final long getLastBothIdleTime()`
- `public final long getLastIdleTime(org.apache.mina.core.session.IdleStatus p0)`
- `public final long getLastIoTime()`
- `public final long getLastReadTime()`
- `public final long getLastReaderIdleTime()`
- `public final long getLastWriteTime()`
- `public final long getLastWriterIdleTime()`
- `public abstract org.apache.mina.core.service.IoProcessor getProcessor()`
- `public final long getReadBytes()`
- `public final double getReadBytesThroughput()`
- `public final long getReadMessages()`
- `public final double getReadMessagesThroughput()`
- `public final int getReaderIdleCount()`
- `public final long getScheduledWriteBytes()`
- `public final int getScheduledWriteMessages()`
- `public org.apache.mina.core.service.IoService getService()`
- `public java.net.SocketAddress getServiceAddress()`
- `public final org.apache.mina.core.write.WriteRequestQueue getWriteRequestQueue()`
- `public final int getWriterIdleCount()`
- `public final long getWrittenBytes()`
- `public final double getWrittenBytesThroughput()`
- `public final long getWrittenMessages()`
- `public final double getWrittenMessagesThroughput()`
- `public final int hashCode()`
- `public final void increaseIdleCount(org.apache.mina.core.session.IdleStatus p0, long p1)`
- `public final void increaseReadBufferSize()`
- `public final void increaseReadBytes(long p0, long p1)`
- `public final void increaseReadMessages(long p0)`
- `public final void increaseScheduledWriteBytes(int p0)`
- `public final void increaseScheduledWriteMessages()`
- `public final void increaseWrittenBytes(int p0, long p1)`
- `public final void increaseWrittenMessages(org.apache.mina.core.write.WriteRequest p0, long p1)`
- `public boolean isActive()`
- `public final boolean isBothIdle()`
- `public final boolean isClosing()`
- `public final boolean isConnected()`
- `public final boolean isIdle(org.apache.mina.core.session.IdleStatus p0)`
- `public boolean isReadSuspended()`
- `public final boolean isReaderIdle()`
- `public final boolean isScheduledForFlush()`
- `public boolean isSecured()`
- `public boolean isServer()`
- `public boolean isWriteSuspended()`
- `public final boolean isWriterIdle()`
- `public static void notifyIdleSession(org.apache.mina.core.session.IoSession p0, long p1)`
- `public static void notifyIdleness(java.util.Iterator p0, long p1)`
- `public final void offerClosedReadFuture()`
- `public final void offerFailedReadFuture(java.lang.Throwable p0)`
- `public final void offerReadFuture(java.lang.Object p0)`
- `public final org.apache.mina.core.future.ReadFuture read()`
- `public final java.lang.Object removeAttribute(java.lang.Object p0)`
- `public final boolean removeAttribute(java.lang.Object p0, java.lang.Object p1)`
- `public final boolean replaceAttribute(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2)`
- `public final void resumeRead()`
- `public final void resumeWrite()`
- `public final void scheduledForFlush()`
- `public final java.lang.Object setAttachment(java.lang.Object p0)`
- `public final java.lang.Object setAttribute(java.lang.Object p0)`
- `public final java.lang.Object setAttribute(java.lang.Object p0, java.lang.Object p1)`
- `public final java.lang.Object setAttributeIfAbsent(java.lang.Object p0)`
- `public final java.lang.Object setAttributeIfAbsent(java.lang.Object p0, java.lang.Object p1)`
- `public final void setAttributeMap(org.apache.mina.core.session.IoSessionAttributeMap p0)`
- `public final void setCurrentWriteRequest(org.apache.mina.core.write.WriteRequest p0)`
- `public final boolean setScheduledForFlush(boolean p0)`
- `protected void setScheduledWriteBytes(int p0)`
- `protected void setScheduledWriteMessages(int p0)`
- `public final void setWriteRequestQueue(org.apache.mina.core.write.WriteRequestQueue p0)`
- `public final void suspendRead()`
- `public final void suspendWrite()`
- `public java.lang.String toString()`
- `public final void unscheduledForFlush()`
- `public final void updateThroughput(long p0, boolean p1)`
- `public org.apache.mina.core.future.WriteFuture write(java.lang.Object p0)`
- `public org.apache.mina.core.future.WriteFuture write(java.lang.Object p0, java.net.SocketAddress p1)`

---

## public abstract class `org.apache.mina.core.session.AbstractIoSessionConfig`
implements `org.apache.mina.core.session.IoSessionConfig`  

**Constructors:**
- `protected AbstractIoSessionConfig()`

**Methods:**
- `public final int getBothIdleTime()`
- `public final long getBothIdleTimeInMillis()`
- `public int getIdleTime(org.apache.mina.core.session.IdleStatus p0)`
- `public long getIdleTimeInMillis(org.apache.mina.core.session.IdleStatus p0)`
- `public int getMaxReadBufferSize()`
- `public int getMinReadBufferSize()`
- `public int getReadBufferSize()`
- `public final int getReaderIdleTime()`
- `public final long getReaderIdleTimeInMillis()`
- `public int getThroughputCalculationInterval()`
- `public long getThroughputCalculationIntervalInMillis()`
- `public int getWriteTimeout()`
- `public long getWriteTimeoutInMillis()`
- `public final int getWriterIdleTime()`
- `public final long getWriterIdleTimeInMillis()`
- `public boolean isUseReadOperation()`
- `public void setAll(org.apache.mina.core.session.IoSessionConfig p0)`
- `public void setBothIdleTime(int p0)`
- `public void setIdleTime(org.apache.mina.core.session.IdleStatus p0, int p1)`
- `public void setMaxReadBufferSize(int p0)`
- `public void setMinReadBufferSize(int p0)`
- `public void setReadBufferSize(int p0)`
- `public void setReaderIdleTime(int p0)`
- `public void setThroughputCalculationInterval(int p0)`
- `public void setUseReadOperation(boolean p0)`
- `public void setWriteTimeout(int p0)`
- `public void setWriterIdleTime(int p0)`

---

## public final class `org.apache.mina.core.session.AttributeKey`
implements `java.io.Serializable`  

**Constructors:**
- `public AttributeKey(java.lang.Class p0, java.lang.String p1)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `org.apache.mina.core.session.DefaultIoSessionDataStructureFactory`
implements `org.apache.mina.core.session.IoSessionDataStructureFactory`  

**Constructors:**
- `public DefaultIoSessionDataStructureFactory()`

**Methods:**
- `public org.apache.mina.core.session.IoSessionAttributeMap getAttributeMap(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public org.apache.mina.core.write.WriteRequestQueue getWriteRequestQueue(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`

---

## public class `org.apache.mina.core.session.DummySession`
extends `org.apache.mina.core.session.AbstractIoSession`  

**Constructors:**
- `public DummySession()`

**Methods:**
- `public org.apache.mina.core.session.IoSessionConfig getConfig()`
- `public org.apache.mina.core.filterchain.IoFilterChain getFilterChain()`
- `public org.apache.mina.core.service.IoHandler getHandler()`
- `public java.net.SocketAddress getLocalAddress()`
- `public final org.apache.mina.core.service.IoProcessor getProcessor()`
- `public java.net.SocketAddress getRemoteAddress()`
- `public org.apache.mina.core.service.IoService getService()`
- `public org.apache.mina.core.service.TransportMetadata getTransportMetadata()`
- `public void setConfig(org.apache.mina.core.session.IoSessionConfig p0)`
- `public void setHandler(org.apache.mina.core.service.IoHandler p0)`
- `public void setLocalAddress(java.net.SocketAddress p0)`
- `public void setRemoteAddress(java.net.SocketAddress p0)`
- `public void setScheduledWriteBytes(int p0)`
- `public void setScheduledWriteMessages(int p0)`
- `public void setService(org.apache.mina.core.service.IoService p0)`
- `public void setTransportMetadata(org.apache.mina.core.service.TransportMetadata p0)`
- `public void updateThroughput(boolean p0)`

---

## public class `org.apache.mina.core.session.ExpiringSessionRecycler`
implements `org.apache.mina.core.session.IoSessionRecycler`  

**Constructors:**
- `public ExpiringSessionRecycler()`
- `public ExpiringSessionRecycler(int p0)`
- `public ExpiringSessionRecycler(int p0, int p1)`

**Methods:**
- `public int getExpirationInterval()`
- `public int getTimeToLive()`
- `public void put(org.apache.mina.core.session.IoSession p0)`
- `public org.apache.mina.core.session.IoSession recycle(java.net.SocketAddress p0)`
- `public void remove(org.apache.mina.core.session.IoSession p0)`
- `public void setExpirationInterval(int p0)`
- `public void setTimeToLive(int p0)`
- `public void stopExpiring()`

---

## public class `org.apache.mina.core.session.IdleStatus`

**Fields:**
- `public final static org.apache.mina.core.session.IdleStatus BOTH_IDLE`
- `public final static org.apache.mina.core.session.IdleStatus READER_IDLE`
- `public final static org.apache.mina.core.session.IdleStatus WRITER_IDLE`

**Methods:**
- `public java.lang.String toString()`

---

## public class `org.apache.mina.core.session.IdleStatusChecker`

**Constructors:**
- `public IdleStatusChecker()`

**Methods:**
- `public void addSession(org.apache.mina.core.session.AbstractIoSession p0)`
- `public org.apache.mina.core.session.IdleStatusChecker$NotifyingTask getNotifyingTask()`

---

## public class `org.apache.mina.core.session.IdleStatusChecker$NotifyingTask`
implements `java.lang.Runnable`  

**Methods:**
- `public void cancel()`
- `public void run()`

---

## public class `org.apache.mina.core.session.IoEvent`
implements `java.lang.Runnable`  

**Constructors:**
- `public IoEvent(org.apache.mina.core.session.IoEventType p0, org.apache.mina.core.session.IoSession p1, java.lang.Object p2)`

**Methods:**
- `public void fire()`
- `public java.lang.Object getParameter()`
- `public org.apache.mina.core.session.IoSession getSession()`
- `public org.apache.mina.core.session.IoEventType getType()`
- `public void run()`
- `public java.lang.String toString()`

---

## public final enum `org.apache.mina.core.session.IoEventType`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.apache.mina.core.session.IoEventType CLOSE`
- `public final static org.apache.mina.core.session.IoEventType EVENT`
- `public final static org.apache.mina.core.session.IoEventType EXCEPTION_CAUGHT`
- `public final static org.apache.mina.core.session.IoEventType INPUT_CLOSED`
- `public final static org.apache.mina.core.session.IoEventType MESSAGE_RECEIVED`
- `public final static org.apache.mina.core.session.IoEventType MESSAGE_SENT`
- `public final static org.apache.mina.core.session.IoEventType SESSION_CLOSED`
- `public final static org.apache.mina.core.session.IoEventType SESSION_CREATED`
- `public final static org.apache.mina.core.session.IoEventType SESSION_IDLE`
- `public final static org.apache.mina.core.session.IoEventType SESSION_OPENED`
- `public final static org.apache.mina.core.session.IoEventType WRITE`

---

## public abstract interface `org.apache.mina.core.session.IoSession`

**Methods:**
- `public abstract org.apache.mina.core.future.CloseFuture close()`
- `public abstract org.apache.mina.core.future.CloseFuture close(boolean p0)`
- `public abstract org.apache.mina.core.future.CloseFuture closeNow()`
- `public abstract org.apache.mina.core.future.CloseFuture closeOnFlush()`
- `public abstract boolean containsAttribute(java.lang.Object p0)`
- `public abstract java.lang.Object getAttachment()`
- `public abstract java.lang.Object getAttribute(java.lang.Object p0)`
- `public abstract java.lang.Object getAttribute(java.lang.Object p0, java.lang.Object p1)`
- `public abstract java.util.Set getAttributeKeys()`
- `public abstract int getBothIdleCount()`
- `public abstract org.apache.mina.core.future.CloseFuture getCloseFuture()`
- `public abstract org.apache.mina.core.session.IoSessionConfig getConfig()`
- `public abstract long getCreationTime()`
- `public abstract java.lang.Object getCurrentWriteMessage()`
- `public abstract org.apache.mina.core.write.WriteRequest getCurrentWriteRequest()`
- `public abstract org.apache.mina.core.filterchain.IoFilterChain getFilterChain()`
- `public abstract org.apache.mina.core.service.IoHandler getHandler()`
- `public abstract long getId()`
- `public abstract int getIdleCount(org.apache.mina.core.session.IdleStatus p0)`
- `public abstract long getLastBothIdleTime()`
- `public abstract long getLastIdleTime(org.apache.mina.core.session.IdleStatus p0)`
- `public abstract long getLastIoTime()`
- `public abstract long getLastReadTime()`
- `public abstract long getLastReaderIdleTime()`
- `public abstract long getLastWriteTime()`
- `public abstract long getLastWriterIdleTime()`
- `public abstract java.net.SocketAddress getLocalAddress()`
- `public abstract long getReadBytes()`
- `public abstract double getReadBytesThroughput()`
- `public abstract long getReadMessages()`
- `public abstract double getReadMessagesThroughput()`
- `public abstract int getReaderIdleCount()`
- `public abstract java.net.SocketAddress getRemoteAddress()`
- `public abstract long getScheduledWriteBytes()`
- `public abstract int getScheduledWriteMessages()`
- `public abstract org.apache.mina.core.service.IoService getService()`
- `public abstract java.net.SocketAddress getServiceAddress()`
- `public abstract org.apache.mina.core.service.TransportMetadata getTransportMetadata()`
- `public abstract org.apache.mina.core.write.WriteRequestQueue getWriteRequestQueue()`
- `public abstract int getWriterIdleCount()`
- `public abstract long getWrittenBytes()`
- `public abstract double getWrittenBytesThroughput()`
- `public abstract long getWrittenMessages()`
- `public abstract double getWrittenMessagesThroughput()`
- `public abstract boolean isActive()`
- `public abstract boolean isBothIdle()`
- `public abstract boolean isClosing()`
- `public abstract boolean isConnected()`
- `public abstract boolean isIdle(org.apache.mina.core.session.IdleStatus p0)`
- `public abstract boolean isReadSuspended()`
- `public abstract boolean isReaderIdle()`
- `public abstract boolean isSecured()`
- `public abstract boolean isServer()`
- `public abstract boolean isWriteSuspended()`
- `public abstract boolean isWriterIdle()`
- `public abstract org.apache.mina.core.future.ReadFuture read()`
- `public abstract java.lang.Object removeAttribute(java.lang.Object p0)`
- `public abstract boolean removeAttribute(java.lang.Object p0, java.lang.Object p1)`
- `public abstract boolean replaceAttribute(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2)`
- `public abstract void resumeRead()`
- `public abstract void resumeWrite()`
- `public abstract java.lang.Object setAttachment(java.lang.Object p0)`
- `public abstract java.lang.Object setAttribute(java.lang.Object p0)`
- `public abstract java.lang.Object setAttribute(java.lang.Object p0, java.lang.Object p1)`
- `public abstract java.lang.Object setAttributeIfAbsent(java.lang.Object p0)`
- `public abstract java.lang.Object setAttributeIfAbsent(java.lang.Object p0, java.lang.Object p1)`
- `public abstract void setCurrentWriteRequest(org.apache.mina.core.write.WriteRequest p0)`
- `public abstract void suspendRead()`
- `public abstract void suspendWrite()`
- `public abstract void updateThroughput(long p0, boolean p1)`
- `public abstract org.apache.mina.core.future.WriteFuture write(java.lang.Object p0)`
- `public abstract org.apache.mina.core.future.WriteFuture write(java.lang.Object p0, java.net.SocketAddress p1)`

---

## public abstract interface `org.apache.mina.core.session.IoSessionAttributeMap`

**Methods:**
- `public abstract boolean containsAttribute(org.apache.mina.core.session.IoSession p0, java.lang.Object p1)`
- `public abstract void dispose(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public abstract java.lang.Object getAttribute(org.apache.mina.core.session.IoSession p0, java.lang.Object p1, java.lang.Object p2)`
- `public abstract java.util.Set getAttributeKeys(org.apache.mina.core.session.IoSession p0)`
- `public abstract java.lang.Object removeAttribute(org.apache.mina.core.session.IoSession p0, java.lang.Object p1)`
- `public abstract boolean removeAttribute(org.apache.mina.core.session.IoSession p0, java.lang.Object p1, java.lang.Object p2)`
- `public abstract boolean replaceAttribute(org.apache.mina.core.session.IoSession p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3)`
- `public abstract java.lang.Object setAttribute(org.apache.mina.core.session.IoSession p0, java.lang.Object p1, java.lang.Object p2)`
- `public abstract java.lang.Object setAttributeIfAbsent(org.apache.mina.core.session.IoSession p0, java.lang.Object p1, java.lang.Object p2)`

---

## public abstract interface `org.apache.mina.core.session.IoSessionConfig`

**Methods:**
- `public abstract int getBothIdleTime()`
- `public abstract long getBothIdleTimeInMillis()`
- `public abstract int getIdleTime(org.apache.mina.core.session.IdleStatus p0)`
- `public abstract long getIdleTimeInMillis(org.apache.mina.core.session.IdleStatus p0)`
- `public abstract int getMaxReadBufferSize()`
- `public abstract int getMinReadBufferSize()`
- `public abstract int getReadBufferSize()`
- `public abstract int getReaderIdleTime()`
- `public abstract long getReaderIdleTimeInMillis()`
- `public abstract int getThroughputCalculationInterval()`
- `public abstract long getThroughputCalculationIntervalInMillis()`
- `public abstract int getWriteTimeout()`
- `public abstract long getWriteTimeoutInMillis()`
- `public abstract int getWriterIdleTime()`
- `public abstract long getWriterIdleTimeInMillis()`
- `public abstract boolean isUseReadOperation()`
- `public abstract void setAll(org.apache.mina.core.session.IoSessionConfig p0)`
- `public abstract void setBothIdleTime(int p0)`
- `public abstract void setIdleTime(org.apache.mina.core.session.IdleStatus p0, int p1)`
- `public abstract void setMaxReadBufferSize(int p0)`
- `public abstract void setMinReadBufferSize(int p0)`
- `public abstract void setReadBufferSize(int p0)`
- `public abstract void setReaderIdleTime(int p0)`
- `public abstract void setThroughputCalculationInterval(int p0)`
- `public abstract void setUseReadOperation(boolean p0)`
- `public abstract void setWriteTimeout(int p0)`
- `public abstract void setWriterIdleTime(int p0)`

---

## public abstract interface `org.apache.mina.core.session.IoSessionDataStructureFactory`

**Methods:**
- `public abstract org.apache.mina.core.session.IoSessionAttributeMap getAttributeMap(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public abstract org.apache.mina.core.write.WriteRequestQueue getWriteRequestQueue(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`

---

## public class `org.apache.mina.core.session.IoSessionInitializationException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public IoSessionInitializationException()`
- `public IoSessionInitializationException(java.lang.String p0)`
- `public IoSessionInitializationException(java.lang.String p0, java.lang.Throwable p1)`
- `public IoSessionInitializationException(java.lang.Throwable p0)`

---

## public abstract interface `org.apache.mina.core.session.IoSessionInitializer`<T extends org.apache.mina.core.future.IoFuture>

**Methods:**
- `public abstract void initializeSession(org.apache.mina.core.session.IoSession p0, T p1)`

---

## public abstract interface `org.apache.mina.core.session.IoSessionRecycler`

**Fields:**
- `public final static org.apache.mina.core.session.IoSessionRecycler NOOP`

**Methods:**
- `public abstract void put(org.apache.mina.core.session.IoSession p0)`
- `public abstract org.apache.mina.core.session.IoSession recycle(java.net.SocketAddress p0)`
- `public abstract void remove(org.apache.mina.core.session.IoSession p0)`

---

## public final enum `org.apache.mina.core.session.SessionState`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.apache.mina.core.session.SessionState CLOSING`
- `public final static org.apache.mina.core.session.SessionState OPENED`
- `public final static org.apache.mina.core.session.SessionState OPENING`

---

## public class `org.apache.mina.core.session.UnknownMessageTypeException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public UnknownMessageTypeException()`
- `public UnknownMessageTypeException(java.lang.String p0)`
- `public UnknownMessageTypeException(java.lang.String p0, java.lang.Throwable p1)`
- `public UnknownMessageTypeException(java.lang.Throwable p0)`

---

## public class `org.apache.mina.core.write.DefaultWriteRequest`
implements `org.apache.mina.core.write.WriteRequest`  

**Constructors:**
- `public DefaultWriteRequest(java.lang.Object p0)`
- `public DefaultWriteRequest(java.lang.Object p0, org.apache.mina.core.future.WriteFuture p1)`
- `public DefaultWriteRequest(java.lang.Object p0, org.apache.mina.core.future.WriteFuture p1, java.net.SocketAddress p2)`

**Fields:**
- `public final static byte[] EMPTY_MESSAGE`

**Methods:**
- `public java.net.SocketAddress getDestination()`
- `public org.apache.mina.core.future.WriteFuture getFuture()`
- `public java.lang.Object getMessage()`
- `public java.lang.Object getOriginalMessage()`
- `public org.apache.mina.core.write.WriteRequest getOriginalRequest()`
- `public boolean isEncoded()`
- `public void setMessage(java.lang.Object p0)`
- `public java.lang.String toString()`

---

## public class `org.apache.mina.core.write.NothingWrittenException`
extends `org.apache.mina.core.write.WriteException`  

**Constructors:**
- `public NothingWrittenException(java.util.Collection p0)`
- `public NothingWrittenException(java.util.Collection p0, java.lang.String p1)`
- `public NothingWrittenException(java.util.Collection p0, java.lang.String p1, java.lang.Throwable p2)`
- `public NothingWrittenException(java.util.Collection p0, java.lang.Throwable p1)`
- `public NothingWrittenException(org.apache.mina.core.write.WriteRequest p0)`
- `public NothingWrittenException(org.apache.mina.core.write.WriteRequest p0, java.lang.String p1)`
- `public NothingWrittenException(org.apache.mina.core.write.WriteRequest p0, java.lang.String p1, java.lang.Throwable p2)`
- `public NothingWrittenException(org.apache.mina.core.write.WriteRequest p0, java.lang.Throwable p1)`

---

## public class `org.apache.mina.core.write.WriteException`
extends `java.io.IOException`  

**Constructors:**
- `public WriteException(java.util.Collection p0)`
- `public WriteException(java.util.Collection p0, java.lang.String p1)`
- `public WriteException(java.util.Collection p0, java.lang.String p1, java.lang.Throwable p2)`
- `public WriteException(java.util.Collection p0, java.lang.Throwable p1)`
- `public WriteException(org.apache.mina.core.write.WriteRequest p0)`
- `public WriteException(org.apache.mina.core.write.WriteRequest p0, java.lang.String p1)`
- `public WriteException(org.apache.mina.core.write.WriteRequest p0, java.lang.String p1, java.lang.Throwable p2)`
- `public WriteException(org.apache.mina.core.write.WriteRequest p0, java.lang.Throwable p1)`

**Methods:**
- `public org.apache.mina.core.write.WriteRequest getRequest()`
- `public java.util.List getRequests()`

---

## public class `org.apache.mina.core.write.WriteRejectedException`
extends `org.apache.mina.core.write.WriteException`  

**Constructors:**
- `public WriteRejectedException(java.util.Collection p0)`
- `public WriteRejectedException(java.util.Collection p0, java.lang.String p1)`
- `public WriteRejectedException(org.apache.mina.core.write.WriteRequest p0)`
- `public WriteRejectedException(org.apache.mina.core.write.WriteRequest p0, java.lang.String p1)`

---

## public abstract interface `org.apache.mina.core.write.WriteRequest`

**Methods:**
- `public abstract java.net.SocketAddress getDestination()`
- `public abstract org.apache.mina.core.future.WriteFuture getFuture()`
- `public abstract java.lang.Object getMessage()`
- `public abstract java.lang.Object getOriginalMessage()`
- `public abstract org.apache.mina.core.write.WriteRequest getOriginalRequest()`
- `public abstract boolean isEncoded()`
- `public abstract void setMessage(java.lang.Object p0)`

---

## public abstract interface `org.apache.mina.core.write.WriteRequestQueue`

**Methods:**
- `public abstract void clear(org.apache.mina.core.session.IoSession p0)`
- `public abstract void dispose(org.apache.mina.core.session.IoSession p0)`
- `public abstract boolean isEmpty(org.apache.mina.core.session.IoSession p0)`
- `public abstract void offer(org.apache.mina.core.session.IoSession p0, org.apache.mina.core.write.WriteRequest p1)`
- `public abstract org.apache.mina.core.write.WriteRequest poll(org.apache.mina.core.session.IoSession p0)`
- `public abstract int size()`

---

## public class `org.apache.mina.core.write.WriteTimeoutException`
extends `org.apache.mina.core.write.WriteException`  

**Constructors:**
- `public WriteTimeoutException(java.util.Collection p0)`
- `public WriteTimeoutException(java.util.Collection p0, java.lang.String p1)`
- `public WriteTimeoutException(java.util.Collection p0, java.lang.String p1, java.lang.Throwable p2)`
- `public WriteTimeoutException(java.util.Collection p0, java.lang.Throwable p1)`
- `public WriteTimeoutException(org.apache.mina.core.write.WriteRequest p0)`
- `public WriteTimeoutException(org.apache.mina.core.write.WriteRequest p0, java.lang.String p1)`
- `public WriteTimeoutException(org.apache.mina.core.write.WriteRequest p0, java.lang.String p1, java.lang.Throwable p2)`
- `public WriteTimeoutException(org.apache.mina.core.write.WriteRequest p0, java.lang.Throwable p1)`

---

## public class `org.apache.mina.core.write.WriteToClosedSessionException`
extends `org.apache.mina.core.write.WriteException`  

**Constructors:**
- `public WriteToClosedSessionException(java.util.Collection p0)`
- `public WriteToClosedSessionException(java.util.Collection p0, java.lang.String p1)`
- `public WriteToClosedSessionException(java.util.Collection p0, java.lang.String p1, java.lang.Throwable p2)`
- `public WriteToClosedSessionException(java.util.Collection p0, java.lang.Throwable p1)`
- `public WriteToClosedSessionException(org.apache.mina.core.write.WriteRequest p0)`
- `public WriteToClosedSessionException(org.apache.mina.core.write.WriteRequest p0, java.lang.String p1)`
- `public WriteToClosedSessionException(org.apache.mina.core.write.WriteRequest p0, java.lang.String p1, java.lang.Throwable p2)`
- `public WriteToClosedSessionException(org.apache.mina.core.write.WriteRequest p0, java.lang.Throwable p1)`

---

## public abstract interface `org.apache.mina.filter.FilterEvent`

---

## public final class `org.apache.mina.filter.buffer.BufferedWriteFilter`
extends `org.apache.mina.core.filterchain.IoFilterAdapter`  

**Constructors:**
- `public BufferedWriteFilter()`
- `public BufferedWriteFilter(int p0)`
- `public BufferedWriteFilter(int p0, org.apache.mina.util.LazyInitializedCacheMap p1)`

**Fields:**
- `public final static int DEFAULT_BUFFER_SIZE`

**Methods:**
- `public void exceptionCaught(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, java.lang.Throwable p2) throws java.lang.Exception`
- `public void filterWrite(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2) throws java.lang.Exception`
- `public void flush(org.apache.mina.core.session.IoSession p0)`
- `public int getBufferSize()`
- `public void sessionClosed(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public void setBufferSize(int p0)`

---

## public class `org.apache.mina.filter.buffer.IoBufferLazyInitializer`
extends `org.apache.mina.util.LazyInitializer`  

**Constructors:**
- `public IoBufferLazyInitializer(int p0)`

**Methods:**
- `public org.apache.mina.core.buffer.IoBuffer init()`

---

## public abstract class `org.apache.mina.filter.codec.AbstractProtocolDecoderOutput`
implements `org.apache.mina.filter.codec.ProtocolDecoderOutput`  

**Constructors:**
- `public AbstractProtocolDecoderOutput()`

**Fields:**
- `protected final java.util.Queue messageQueue`

**Methods:**
- `public void flush(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1)`
- `public void write(java.lang.Object p0)`

---

## public abstract class `org.apache.mina.filter.codec.AbstractProtocolEncoderOutput`
implements `org.apache.mina.filter.codec.ProtocolEncoderOutput`  

**Constructors:**
- `public AbstractProtocolEncoderOutput()`

**Fields:**
- `protected final java.util.Queue messageQueue`

**Methods:**
- `public void write(java.lang.Object p0)`

---

## public abstract class `org.apache.mina.filter.codec.CumulativeProtocolDecoder`
extends `org.apache.mina.filter.codec.ProtocolDecoderAdapter`  

**Constructors:**
- `protected CumulativeProtocolDecoder()`

**Methods:**
- `public void decode(org.apache.mina.core.session.IoSession p0, org.apache.mina.core.buffer.IoBuffer p1, org.apache.mina.filter.codec.ProtocolDecoderOutput p2) throws java.lang.Exception`
- `public void dispose(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `protected abstract boolean doDecode(org.apache.mina.core.session.IoSession p0, org.apache.mina.core.buffer.IoBuffer p1, org.apache.mina.filter.codec.ProtocolDecoderOutput p2) throws java.lang.Exception`
- `public void setTransportMetadataFragmentation(boolean p0)`

---

## public class `org.apache.mina.filter.codec.ProtocolCodecException`
extends `java.lang.Exception`  

**Constructors:**
- `public ProtocolCodecException()`
- `public ProtocolCodecException(java.lang.String p0)`
- `public ProtocolCodecException(java.lang.String p0, java.lang.Throwable p1)`
- `public ProtocolCodecException(java.lang.Throwable p0)`

---

## public abstract interface `org.apache.mina.filter.codec.ProtocolCodecFactory`

**Methods:**
- `public abstract org.apache.mina.filter.codec.ProtocolDecoder getDecoder(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public abstract org.apache.mina.filter.codec.ProtocolEncoder getEncoder(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`

---

## public class `org.apache.mina.filter.codec.ProtocolCodecFilter`
extends `org.apache.mina.core.filterchain.IoFilterAdapter`  

**Constructors:**
- `public ProtocolCodecFilter(java.lang.Class p0, java.lang.Class p1)`
- `public ProtocolCodecFilter(org.apache.mina.filter.codec.ProtocolCodecFactory p0)`
- `public ProtocolCodecFilter(org.apache.mina.filter.codec.ProtocolEncoder p0, org.apache.mina.filter.codec.ProtocolDecoder p1)`

**Methods:**
- `public void filterWrite(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2) throws java.lang.Exception`
- `public org.apache.mina.filter.codec.ProtocolEncoder getEncoder(org.apache.mina.core.session.IoSession p0)`
- `public void messageReceived(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, java.lang.Object p2) throws java.lang.Exception`
- `public void messageSent(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2) throws java.lang.Exception`
- `public void onPostRemove(org.apache.mina.core.filterchain.IoFilterChain p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter$NextFilter p2) throws java.lang.Exception`
- `public void onPreAdd(org.apache.mina.core.filterchain.IoFilterChain p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter$NextFilter p2) throws java.lang.Exception`
- `public void sessionClosed(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`

---

## public class `org.apache.mina.filter.codec.ProtocolCodecSession`
extends `org.apache.mina.core.session.DummySession`  

**Constructors:**
- `public ProtocolCodecSession()`

**Methods:**
- `public org.apache.mina.filter.codec.ProtocolDecoderOutput getDecoderOutput()`
- `public java.util.Queue getDecoderOutputQueue()`
- `public org.apache.mina.filter.codec.ProtocolEncoderOutput getEncoderOutput()`
- `public java.util.Queue getEncoderOutputQueue()`

---

## public abstract interface `org.apache.mina.filter.codec.ProtocolDecoder`

**Methods:**
- `public abstract void decode(org.apache.mina.core.session.IoSession p0, org.apache.mina.core.buffer.IoBuffer p1, org.apache.mina.filter.codec.ProtocolDecoderOutput p2) throws java.lang.Exception`
- `public abstract void dispose(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public abstract void finishDecode(org.apache.mina.core.session.IoSession p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`

---

## public abstract class `org.apache.mina.filter.codec.ProtocolDecoderAdapter`
implements `org.apache.mina.filter.codec.ProtocolDecoder`  

**Constructors:**
- `public ProtocolDecoderAdapter()`

**Methods:**
- `public void dispose(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public void finishDecode(org.apache.mina.core.session.IoSession p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`

---

## public class `org.apache.mina.filter.codec.ProtocolDecoderException`
extends `org.apache.mina.filter.codec.ProtocolCodecException`  

**Constructors:**
- `public ProtocolDecoderException()`
- `public ProtocolDecoderException(java.lang.String p0)`
- `public ProtocolDecoderException(java.lang.String p0, java.lang.Throwable p1)`
- `public ProtocolDecoderException(java.lang.Throwable p0)`

**Methods:**
- `public java.lang.String getHexdump()`
- `public java.lang.String getMessage()`
- `public void setHexdump(java.lang.String p0)`

---

## public abstract interface `org.apache.mina.filter.codec.ProtocolDecoderOutput`

**Methods:**
- `public abstract void flush(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1)`
- `public abstract void write(java.lang.Object p0)`

---

## public abstract interface `org.apache.mina.filter.codec.ProtocolEncoder`

**Methods:**
- `public abstract void dispose(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public abstract void encode(org.apache.mina.core.session.IoSession p0, java.lang.Object p1, org.apache.mina.filter.codec.ProtocolEncoderOutput p2) throws java.lang.Exception`

---

## public abstract class `org.apache.mina.filter.codec.ProtocolEncoderAdapter`
implements `org.apache.mina.filter.codec.ProtocolEncoder`  

**Constructors:**
- `public ProtocolEncoderAdapter()`

**Methods:**
- `public void dispose(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`

---

## public class `org.apache.mina.filter.codec.ProtocolEncoderException`
extends `org.apache.mina.filter.codec.ProtocolCodecException`  

**Constructors:**
- `public ProtocolEncoderException()`
- `public ProtocolEncoderException(java.lang.String p0)`
- `public ProtocolEncoderException(java.lang.String p0, java.lang.Throwable p1)`
- `public ProtocolEncoderException(java.lang.Throwable p0)`

---

## public abstract interface `org.apache.mina.filter.codec.ProtocolEncoderOutput`

**Methods:**
- `public abstract void write(java.lang.Object p0)`

---

## public class `org.apache.mina.filter.codec.RecoverableProtocolDecoderException`
extends `org.apache.mina.filter.codec.ProtocolDecoderException`  

**Constructors:**
- `public RecoverableProtocolDecoderException()`
- `public RecoverableProtocolDecoderException(java.lang.String p0)`
- `public RecoverableProtocolDecoderException(java.lang.String p0, java.lang.Throwable p1)`
- `public RecoverableProtocolDecoderException(java.lang.Throwable p0)`

---

## public class `org.apache.mina.filter.codec.SynchronizedProtocolDecoder`
implements `org.apache.mina.filter.codec.ProtocolDecoder`  

**Constructors:**
- `public SynchronizedProtocolDecoder(org.apache.mina.filter.codec.ProtocolDecoder p0)`

**Methods:**
- `public void decode(org.apache.mina.core.session.IoSession p0, org.apache.mina.core.buffer.IoBuffer p1, org.apache.mina.filter.codec.ProtocolDecoderOutput p2) throws java.lang.Exception`
- `public void dispose(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public void finishDecode(org.apache.mina.core.session.IoSession p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`
- `public org.apache.mina.filter.codec.ProtocolDecoder getDecoder()`

---

## public class `org.apache.mina.filter.codec.SynchronizedProtocolEncoder`
implements `org.apache.mina.filter.codec.ProtocolEncoder`  

**Constructors:**
- `public SynchronizedProtocolEncoder(org.apache.mina.filter.codec.ProtocolEncoder p0)`

**Methods:**
- `public void dispose(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public void encode(org.apache.mina.core.session.IoSession p0, java.lang.Object p1, org.apache.mina.filter.codec.ProtocolEncoderOutput p2) throws java.lang.Exception`
- `public org.apache.mina.filter.codec.ProtocolEncoder getEncoder()`

---

## public class `org.apache.mina.filter.codec.demux.DemuxingProtocolCodecFactory`
implements `org.apache.mina.filter.codec.ProtocolCodecFactory`  

**Constructors:**
- `public DemuxingProtocolCodecFactory()`

**Methods:**
- `public void addMessageDecoder(java.lang.Class p0)`
- `public void addMessageDecoder(org.apache.mina.filter.codec.demux.MessageDecoder p0)`
- `public void addMessageDecoder(org.apache.mina.filter.codec.demux.MessageDecoderFactory p0)`
- `public void addMessageEncoder(java.lang.Class p0, java.lang.Class p1)`
- `public <T extends java.lang.Object> void addMessageEncoder(java.lang.Class p0, org.apache.mina.filter.codec.demux.MessageEncoder p1)`
- `public <T extends java.lang.Object> void addMessageEncoder(java.lang.Class p0, org.apache.mina.filter.codec.demux.MessageEncoderFactory p1)`
- `public <T extends java.lang.Object> void addMessageEncoder(java.lang.Iterable p0, org.apache.mina.filter.codec.demux.MessageEncoder p1)`
- `public <T extends java.lang.Object> void addMessageEncoder(java.lang.Iterable p0, org.apache.mina.filter.codec.demux.MessageEncoderFactory p1)`
- `public void addMessageEncoder(java.lang.Iterable p0, java.lang.Class p1)`
- `public org.apache.mina.filter.codec.ProtocolDecoder getDecoder(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public org.apache.mina.filter.codec.ProtocolEncoder getEncoder(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`

---

## public class `org.apache.mina.filter.codec.demux.DemuxingProtocolDecoder`
extends `org.apache.mina.filter.codec.CumulativeProtocolDecoder`  

**Constructors:**
- `public DemuxingProtocolDecoder()`

**Methods:**
- `public void addMessageDecoder(java.lang.Class p0)`
- `public void addMessageDecoder(org.apache.mina.filter.codec.demux.MessageDecoder p0)`
- `public void addMessageDecoder(org.apache.mina.filter.codec.demux.MessageDecoderFactory p0)`
- `public void dispose(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `protected boolean doDecode(org.apache.mina.core.session.IoSession p0, org.apache.mina.core.buffer.IoBuffer p1, org.apache.mina.filter.codec.ProtocolDecoderOutput p2) throws java.lang.Exception`
- `public void finishDecode(org.apache.mina.core.session.IoSession p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`

---

## public class `org.apache.mina.filter.codec.demux.DemuxingProtocolEncoder`
implements `org.apache.mina.filter.codec.ProtocolEncoder`  

**Constructors:**
- `public DemuxingProtocolEncoder()`

**Methods:**
- `public void addMessageEncoder(java.lang.Class p0, java.lang.Class p1)`
- `public <T extends java.lang.Object> void addMessageEncoder(java.lang.Class p0, org.apache.mina.filter.codec.demux.MessageEncoder p1)`
- `public <T extends java.lang.Object> void addMessageEncoder(java.lang.Class p0, org.apache.mina.filter.codec.demux.MessageEncoderFactory p1)`
- `public <T extends java.lang.Object> void addMessageEncoder(java.lang.Iterable p0, org.apache.mina.filter.codec.demux.MessageEncoder p1)`
- `public <T extends java.lang.Object> void addMessageEncoder(java.lang.Iterable p0, org.apache.mina.filter.codec.demux.MessageEncoderFactory p1)`
- `public void addMessageEncoder(java.lang.Iterable p0, java.lang.Class p1)`
- `public void dispose(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public void encode(org.apache.mina.core.session.IoSession p0, java.lang.Object p1, org.apache.mina.filter.codec.ProtocolEncoderOutput p2) throws java.lang.Exception`
- `protected org.apache.mina.filter.codec.demux.MessageEncoder findEncoder(org.apache.mina.filter.codec.demux.DemuxingProtocolEncoder$State p0, java.lang.Class p1)`

---

## public abstract interface `org.apache.mina.filter.codec.demux.MessageDecoder`

**Fields:**
- `public final static org.apache.mina.filter.codec.demux.MessageDecoderResult NEED_DATA`
- `public final static org.apache.mina.filter.codec.demux.MessageDecoderResult NOT_OK`
- `public final static org.apache.mina.filter.codec.demux.MessageDecoderResult OK`

**Methods:**
- `public abstract org.apache.mina.filter.codec.demux.MessageDecoderResult decodable(org.apache.mina.core.session.IoSession p0, org.apache.mina.core.buffer.IoBuffer p1)`
- `public abstract org.apache.mina.filter.codec.demux.MessageDecoderResult decode(org.apache.mina.core.session.IoSession p0, org.apache.mina.core.buffer.IoBuffer p1, org.apache.mina.filter.codec.ProtocolDecoderOutput p2) throws java.lang.Exception`
- `public abstract void finishDecode(org.apache.mina.core.session.IoSession p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`

---

## public abstract class `org.apache.mina.filter.codec.demux.MessageDecoderAdapter`
implements `org.apache.mina.filter.codec.demux.MessageDecoder`  

**Constructors:**
- `public MessageDecoderAdapter()`

**Methods:**
- `public void finishDecode(org.apache.mina.core.session.IoSession p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`

---

## public abstract interface `org.apache.mina.filter.codec.demux.MessageDecoderFactory`

**Methods:**
- `public abstract org.apache.mina.filter.codec.demux.MessageDecoder getDecoder() throws java.lang.Exception`

---

## public class `org.apache.mina.filter.codec.demux.MessageDecoderResult`

**Fields:**
- `public final static org.apache.mina.filter.codec.demux.MessageDecoderResult NEED_DATA`
- `public final static org.apache.mina.filter.codec.demux.MessageDecoderResult NOT_OK`
- `public final static org.apache.mina.filter.codec.demux.MessageDecoderResult OK`

**Methods:**
- `public java.lang.String toString()`

---

## public abstract interface `org.apache.mina.filter.codec.demux.MessageEncoder`<T extends java.lang.Object>

**Methods:**
- `public abstract void encode(org.apache.mina.core.session.IoSession p0, T p1, org.apache.mina.filter.codec.ProtocolEncoderOutput p2) throws java.lang.Exception`

---

## public abstract interface `org.apache.mina.filter.codec.demux.MessageEncoderFactory`<T extends java.lang.Object>

**Methods:**
- `public abstract org.apache.mina.filter.codec.demux.MessageEncoder getEncoder() throws java.lang.Exception`

---

## public class `org.apache.mina.filter.codec.prefixedstring.PrefixedStringCodecFactory`
implements `org.apache.mina.filter.codec.ProtocolCodecFactory`  

**Constructors:**
- `public PrefixedStringCodecFactory()`
- `public PrefixedStringCodecFactory(java.nio.charset.Charset p0)`

**Methods:**
- `public org.apache.mina.filter.codec.ProtocolDecoder getDecoder(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public int getDecoderMaxDataLength()`
- `public int getDecoderPrefixLength()`
- `public org.apache.mina.filter.codec.ProtocolEncoder getEncoder(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public int getEncoderMaxDataLength()`
- `public int getEncoderPrefixLength()`
- `public void setDecoderMaxDataLength(int p0)`
- `public void setDecoderPrefixLength(int p0)`
- `public void setEncoderMaxDataLength(int p0)`
- `public void setEncoderPrefixLength(int p0)`

---

## public class `org.apache.mina.filter.codec.prefixedstring.PrefixedStringDecoder`
extends `org.apache.mina.filter.codec.CumulativeProtocolDecoder`  

**Constructors:**
- `public PrefixedStringDecoder(java.nio.charset.Charset p0)`
- `public PrefixedStringDecoder(java.nio.charset.Charset p0, int p1)`
- `public PrefixedStringDecoder(java.nio.charset.Charset p0, int p1, int p2)`

**Fields:**
- `public final static int DEFAULT_MAX_DATA_LENGTH`
- `public final static int DEFAULT_PREFIX_LENGTH`

**Methods:**
- `protected boolean doDecode(org.apache.mina.core.session.IoSession p0, org.apache.mina.core.buffer.IoBuffer p1, org.apache.mina.filter.codec.ProtocolDecoderOutput p2) throws java.lang.Exception`
- `public int getMaxDataLength()`
- `public int getPrefixLength()`
- `public void setMaxDataLength(int p0)`
- `public void setPrefixLength(int p0)`

---

## public class `org.apache.mina.filter.codec.prefixedstring.PrefixedStringEncoder`
extends `org.apache.mina.filter.codec.ProtocolEncoderAdapter`  

**Constructors:**
- `public PrefixedStringEncoder()`
- `public PrefixedStringEncoder(java.nio.charset.Charset p0)`
- `public PrefixedStringEncoder(java.nio.charset.Charset p0, int p1)`
- `public PrefixedStringEncoder(java.nio.charset.Charset p0, int p1, int p2)`

**Fields:**
- `public final static int DEFAULT_MAX_DATA_LENGTH`
- `public final static int DEFAULT_PREFIX_LENGTH`

**Methods:**
- `public void encode(org.apache.mina.core.session.IoSession p0, java.lang.Object p1, org.apache.mina.filter.codec.ProtocolEncoderOutput p2) throws java.lang.Exception`
- `public int getMaxDataLength()`
- `public int getPrefixLength()`
- `public void setMaxDataLength(int p0)`
- `public void setPrefixLength(int p0)`

---

## public class `org.apache.mina.filter.codec.serialization.ObjectSerializationCodecFactory`
implements `org.apache.mina.filter.codec.ProtocolCodecFactory`  

**Constructors:**
- `public ObjectSerializationCodecFactory()`
- `public ObjectSerializationCodecFactory(java.lang.ClassLoader p0)`

**Methods:**
- `public org.apache.mina.filter.codec.ProtocolDecoder getDecoder(org.apache.mina.core.session.IoSession p0)`
- `public int getDecoderMaxObjectSize()`
- `public org.apache.mina.filter.codec.ProtocolEncoder getEncoder(org.apache.mina.core.session.IoSession p0)`
- `public int getEncoderMaxObjectSize()`
- `public void setDecoderMaxObjectSize(int p0)`
- `public void setEncoderMaxObjectSize(int p0)`

---

## public class `org.apache.mina.filter.codec.serialization.ObjectSerializationDecoder`
extends `org.apache.mina.filter.codec.CumulativeProtocolDecoder`  

**Constructors:**
- `public ObjectSerializationDecoder()`
- `public ObjectSerializationDecoder(java.lang.ClassLoader p0)`

**Methods:**
- `protected boolean doDecode(org.apache.mina.core.session.IoSession p0, org.apache.mina.core.buffer.IoBuffer p1, org.apache.mina.filter.codec.ProtocolDecoderOutput p2) throws java.lang.Exception`
- `public int getMaxObjectSize()`
- `public void setMaxObjectSize(int p0)`

---

## public class `org.apache.mina.filter.codec.serialization.ObjectSerializationEncoder`
extends `org.apache.mina.filter.codec.ProtocolEncoderAdapter`  

**Constructors:**
- `public ObjectSerializationEncoder()`

**Methods:**
- `public void encode(org.apache.mina.core.session.IoSession p0, java.lang.Object p1, org.apache.mina.filter.codec.ProtocolEncoderOutput p2) throws java.lang.Exception`
- `public int getMaxObjectSize()`
- `public void setMaxObjectSize(int p0)`

---

## public class `org.apache.mina.filter.codec.serialization.ObjectSerializationInputStream`
extends `java.io.InputStream`  
implements `java.io.ObjectInput`  

**Constructors:**
- `public ObjectSerializationInputStream(java.io.InputStream p0)`
- `public ObjectSerializationInputStream(java.io.InputStream p0, java.lang.ClassLoader p1)`

**Methods:**
- `public int getMaxObjectSize()`
- `public int read() throws java.io.IOException`
- `public boolean readBoolean() throws java.io.IOException`
- `public byte readByte() throws java.io.IOException`
- `public char readChar() throws java.io.IOException`
- `public double readDouble() throws java.io.IOException`
- `public float readFloat() throws java.io.IOException`
- `public void readFully(byte[] p0) throws java.io.IOException`
- `public void readFully(byte[] p0, int p1, int p2) throws java.io.IOException`
- `public int readInt() throws java.io.IOException`
- `public java.lang.String readLine() throws java.io.IOException`
- `public long readLong() throws java.io.IOException`
- `public java.lang.Object readObject() throws java.io.IOException, java.lang.ClassNotFoundException`
- `public short readShort() throws java.io.IOException`
- `public java.lang.String readUTF() throws java.io.IOException`
- `public int readUnsignedByte() throws java.io.IOException`
- `public int readUnsignedShort() throws java.io.IOException`
- `public void setMaxObjectSize(int p0)`
- `public int skipBytes(int p0) throws java.io.IOException`

---

## public class `org.apache.mina.filter.codec.serialization.ObjectSerializationOutputStream`
extends `java.io.OutputStream`  
implements `java.io.ObjectOutput`  

**Constructors:**
- `public ObjectSerializationOutputStream(java.io.OutputStream p0)`

**Methods:**
- `public void close() throws java.io.IOException`
- `public void flush() throws java.io.IOException`
- `public int getMaxObjectSize()`
- `public void setMaxObjectSize(int p0)`
- `public void write(byte[] p0) throws java.io.IOException`
- `public void write(byte[] p0, int p1, int p2) throws java.io.IOException`
- `public void write(int p0) throws java.io.IOException`
- `public void writeBoolean(boolean p0) throws java.io.IOException`
- `public void writeByte(int p0) throws java.io.IOException`
- `public void writeBytes(java.lang.String p0) throws java.io.IOException`
- `public void writeChar(int p0) throws java.io.IOException`
- `public void writeChars(java.lang.String p0) throws java.io.IOException`
- `public void writeDouble(double p0) throws java.io.IOException`
- `public void writeFloat(float p0) throws java.io.IOException`
- `public void writeInt(int p0) throws java.io.IOException`
- `public void writeLong(long p0) throws java.io.IOException`
- `public void writeObject(java.lang.Object p0) throws java.io.IOException`
- `public void writeShort(int p0) throws java.io.IOException`
- `public void writeUTF(java.lang.String p0) throws java.io.IOException`

---

## public abstract class `org.apache.mina.filter.codec.statemachine.ConsumeToCrLfDecodingState`
implements `org.apache.mina.filter.codec.statemachine.DecodingState`  

**Constructors:**
- `public ConsumeToCrLfDecodingState()`

**Methods:**
- `public org.apache.mina.filter.codec.statemachine.DecodingState decode(org.apache.mina.core.buffer.IoBuffer p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`
- `protected abstract org.apache.mina.filter.codec.statemachine.DecodingState finishDecode(org.apache.mina.core.buffer.IoBuffer p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`
- `public org.apache.mina.filter.codec.statemachine.DecodingState finishDecode(org.apache.mina.filter.codec.ProtocolDecoderOutput p0) throws java.lang.Exception`

---

## public abstract class `org.apache.mina.filter.codec.statemachine.ConsumeToDynamicTerminatorDecodingState`
implements `org.apache.mina.filter.codec.statemachine.DecodingState`  

**Constructors:**
- `public ConsumeToDynamicTerminatorDecodingState()`

**Methods:**
- `public org.apache.mina.filter.codec.statemachine.DecodingState decode(org.apache.mina.core.buffer.IoBuffer p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`
- `protected abstract org.apache.mina.filter.codec.statemachine.DecodingState finishDecode(org.apache.mina.core.buffer.IoBuffer p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`
- `public org.apache.mina.filter.codec.statemachine.DecodingState finishDecode(org.apache.mina.filter.codec.ProtocolDecoderOutput p0) throws java.lang.Exception`
- `protected abstract boolean isTerminator(byte p0)`

---

## public abstract class `org.apache.mina.filter.codec.statemachine.ConsumeToEndOfSessionDecodingState`
implements `org.apache.mina.filter.codec.statemachine.DecodingState`  

**Constructors:**
- `public ConsumeToEndOfSessionDecodingState(int p0)`

**Methods:**
- `public org.apache.mina.filter.codec.statemachine.DecodingState decode(org.apache.mina.core.buffer.IoBuffer p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`
- `protected abstract org.apache.mina.filter.codec.statemachine.DecodingState finishDecode(org.apache.mina.core.buffer.IoBuffer p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`
- `public org.apache.mina.filter.codec.statemachine.DecodingState finishDecode(org.apache.mina.filter.codec.ProtocolDecoderOutput p0) throws java.lang.Exception`

---

## public abstract class `org.apache.mina.filter.codec.statemachine.ConsumeToLinearWhitespaceDecodingState`
extends `org.apache.mina.filter.codec.statemachine.ConsumeToDynamicTerminatorDecodingState`  

**Constructors:**
- `public ConsumeToLinearWhitespaceDecodingState()`

**Methods:**
- `protected boolean isTerminator(byte p0)`

---

## public abstract class `org.apache.mina.filter.codec.statemachine.ConsumeToTerminatorDecodingState`
implements `org.apache.mina.filter.codec.statemachine.DecodingState`  

**Constructors:**
- `public ConsumeToTerminatorDecodingState(byte p0)`

**Methods:**
- `public org.apache.mina.filter.codec.statemachine.DecodingState decode(org.apache.mina.core.buffer.IoBuffer p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`
- `protected abstract org.apache.mina.filter.codec.statemachine.DecodingState finishDecode(org.apache.mina.core.buffer.IoBuffer p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`
- `public org.apache.mina.filter.codec.statemachine.DecodingState finishDecode(org.apache.mina.filter.codec.ProtocolDecoderOutput p0) throws java.lang.Exception`

---

## public abstract class `org.apache.mina.filter.codec.statemachine.CrLfDecodingState`
implements `org.apache.mina.filter.codec.statemachine.DecodingState`  

**Constructors:**
- `public CrLfDecodingState()`

**Methods:**
- `public org.apache.mina.filter.codec.statemachine.DecodingState decode(org.apache.mina.core.buffer.IoBuffer p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`
- `protected abstract org.apache.mina.filter.codec.statemachine.DecodingState finishDecode(boolean p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`
- `public org.apache.mina.filter.codec.statemachine.DecodingState finishDecode(org.apache.mina.filter.codec.ProtocolDecoderOutput p0) throws java.lang.Exception`

---

## public abstract interface `org.apache.mina.filter.codec.statemachine.DecodingState`

**Methods:**
- `public abstract org.apache.mina.filter.codec.statemachine.DecodingState decode(org.apache.mina.core.buffer.IoBuffer p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`
- `public abstract org.apache.mina.filter.codec.statemachine.DecodingState finishDecode(org.apache.mina.filter.codec.ProtocolDecoderOutput p0) throws java.lang.Exception`

---

## public abstract class `org.apache.mina.filter.codec.statemachine.DecodingStateMachine`
implements `org.apache.mina.filter.codec.statemachine.DecodingState`  

**Constructors:**
- `public DecodingStateMachine()`

**Methods:**
- `public org.apache.mina.filter.codec.statemachine.DecodingState decode(org.apache.mina.core.buffer.IoBuffer p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`
- `protected abstract void destroy() throws java.lang.Exception`
- `protected abstract org.apache.mina.filter.codec.statemachine.DecodingState finishDecode(java.util.List p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`
- `public org.apache.mina.filter.codec.statemachine.DecodingState finishDecode(org.apache.mina.filter.codec.ProtocolDecoderOutput p0) throws java.lang.Exception`
- `protected abstract org.apache.mina.filter.codec.statemachine.DecodingState init() throws java.lang.Exception`

---

## public class `org.apache.mina.filter.codec.statemachine.DecodingStateProtocolDecoder`
implements `org.apache.mina.filter.codec.ProtocolDecoder`  

**Constructors:**
- `public DecodingStateProtocolDecoder(org.apache.mina.filter.codec.statemachine.DecodingState p0)`

**Methods:**
- `public void decode(org.apache.mina.core.session.IoSession p0, org.apache.mina.core.buffer.IoBuffer p1, org.apache.mina.filter.codec.ProtocolDecoderOutput p2) throws java.lang.Exception`
- `public void dispose(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public void finishDecode(org.apache.mina.core.session.IoSession p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`

---

## public abstract class `org.apache.mina.filter.codec.statemachine.FixedLengthDecodingState`
implements `org.apache.mina.filter.codec.statemachine.DecodingState`  

**Constructors:**
- `public FixedLengthDecodingState(int p0)`

**Methods:**
- `public org.apache.mina.filter.codec.statemachine.DecodingState decode(org.apache.mina.core.buffer.IoBuffer p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`
- `protected abstract org.apache.mina.filter.codec.statemachine.DecodingState finishDecode(org.apache.mina.core.buffer.IoBuffer p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`
- `public org.apache.mina.filter.codec.statemachine.DecodingState finishDecode(org.apache.mina.filter.codec.ProtocolDecoderOutput p0) throws java.lang.Exception`

---

## public abstract class `org.apache.mina.filter.codec.statemachine.IntegerDecodingState`
implements `org.apache.mina.filter.codec.statemachine.DecodingState`  

**Constructors:**
- `public IntegerDecodingState()`

**Methods:**
- `public org.apache.mina.filter.codec.statemachine.DecodingState decode(org.apache.mina.core.buffer.IoBuffer p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`
- `protected abstract org.apache.mina.filter.codec.statemachine.DecodingState finishDecode(int p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`
- `public org.apache.mina.filter.codec.statemachine.DecodingState finishDecode(org.apache.mina.filter.codec.ProtocolDecoderOutput p0) throws java.lang.Exception`

---

## public abstract class `org.apache.mina.filter.codec.statemachine.LinearWhitespaceSkippingState`
extends `org.apache.mina.filter.codec.statemachine.SkippingState`  

**Constructors:**
- `public LinearWhitespaceSkippingState()`

**Methods:**
- `protected boolean canSkip(byte p0)`

---

## public abstract class `org.apache.mina.filter.codec.statemachine.ShortIntegerDecodingState`
implements `org.apache.mina.filter.codec.statemachine.DecodingState`  

**Constructors:**
- `public ShortIntegerDecodingState()`

**Methods:**
- `public org.apache.mina.filter.codec.statemachine.DecodingState decode(org.apache.mina.core.buffer.IoBuffer p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`
- `public org.apache.mina.filter.codec.statemachine.DecodingState finishDecode(org.apache.mina.filter.codec.ProtocolDecoderOutput p0) throws java.lang.Exception`
- `protected abstract org.apache.mina.filter.codec.statemachine.DecodingState finishDecode(short p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`

---

## public abstract class `org.apache.mina.filter.codec.statemachine.SingleByteDecodingState`
implements `org.apache.mina.filter.codec.statemachine.DecodingState`  

**Constructors:**
- `public SingleByteDecodingState()`

**Methods:**
- `public org.apache.mina.filter.codec.statemachine.DecodingState decode(org.apache.mina.core.buffer.IoBuffer p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`
- `protected abstract org.apache.mina.filter.codec.statemachine.DecodingState finishDecode(byte p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`
- `public org.apache.mina.filter.codec.statemachine.DecodingState finishDecode(org.apache.mina.filter.codec.ProtocolDecoderOutput p0) throws java.lang.Exception`

---

## public abstract class `org.apache.mina.filter.codec.statemachine.SkippingState`
implements `org.apache.mina.filter.codec.statemachine.DecodingState`  

**Constructors:**
- `public SkippingState()`

**Methods:**
- `protected abstract boolean canSkip(byte p0)`
- `public org.apache.mina.filter.codec.statemachine.DecodingState decode(org.apache.mina.core.buffer.IoBuffer p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`
- `protected abstract org.apache.mina.filter.codec.statemachine.DecodingState finishDecode(int p0) throws java.lang.Exception`
- `public org.apache.mina.filter.codec.statemachine.DecodingState finishDecode(org.apache.mina.filter.codec.ProtocolDecoderOutput p0) throws java.lang.Exception`

---

## public class `org.apache.mina.filter.codec.textline.LineDelimiter`

**Constructors:**
- `public LineDelimiter(java.lang.String p0)`

**Fields:**
- `public final static org.apache.mina.filter.codec.textline.LineDelimiter AUTO`
- `public final static org.apache.mina.filter.codec.textline.LineDelimiter CRLF`
- `public final static org.apache.mina.filter.codec.textline.LineDelimiter DEFAULT`
- `public final static org.apache.mina.filter.codec.textline.LineDelimiter MAC`
- `public final static org.apache.mina.filter.codec.textline.LineDelimiter NUL`
- `public final static org.apache.mina.filter.codec.textline.LineDelimiter UNIX`
- `public final static org.apache.mina.filter.codec.textline.LineDelimiter WINDOWS`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getValue()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `org.apache.mina.filter.codec.textline.TextLineCodecFactory`
implements `org.apache.mina.filter.codec.ProtocolCodecFactory`  

**Constructors:**
- `public TextLineCodecFactory()`
- `public TextLineCodecFactory(java.nio.charset.Charset p0)`
- `public TextLineCodecFactory(java.nio.charset.Charset p0, java.lang.String p1, java.lang.String p2)`
- `public TextLineCodecFactory(java.nio.charset.Charset p0, org.apache.mina.filter.codec.textline.LineDelimiter p1, org.apache.mina.filter.codec.textline.LineDelimiter p2)`

**Methods:**
- `public org.apache.mina.filter.codec.ProtocolDecoder getDecoder(org.apache.mina.core.session.IoSession p0)`
- `public int getDecoderMaxLineLength()`
- `public org.apache.mina.filter.codec.ProtocolEncoder getEncoder(org.apache.mina.core.session.IoSession p0)`
- `public int getEncoderMaxLineLength()`
- `public void setDecoderMaxLineLength(int p0)`
- `public void setEncoderMaxLineLength(int p0)`

---

## public class `org.apache.mina.filter.codec.textline.TextLineDecoder`
implements `org.apache.mina.filter.codec.ProtocolDecoder`  

**Constructors:**
- `public TextLineDecoder()`
- `public TextLineDecoder(java.lang.String p0)`
- `public TextLineDecoder(java.nio.charset.Charset p0)`
- `public TextLineDecoder(java.nio.charset.Charset p0, java.lang.String p1)`
- `public TextLineDecoder(java.nio.charset.Charset p0, org.apache.mina.filter.codec.textline.LineDelimiter p1)`
- `public TextLineDecoder(org.apache.mina.filter.codec.textline.LineDelimiter p0)`

**Methods:**
- `public void decode(org.apache.mina.core.session.IoSession p0, org.apache.mina.core.buffer.IoBuffer p1, org.apache.mina.filter.codec.ProtocolDecoderOutput p2) throws java.lang.Exception`
- `public void dispose(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public void finishDecode(org.apache.mina.core.session.IoSession p0, org.apache.mina.filter.codec.ProtocolDecoderOutput p1) throws java.lang.Exception`
- `public int getBufferLength()`
- `public int getMaxLineLength()`
- `public void setBufferLength(int p0)`
- `public void setMaxLineLength(int p0)`
- `protected void writeText(org.apache.mina.core.session.IoSession p0, java.lang.String p1, org.apache.mina.filter.codec.ProtocolDecoderOutput p2)`

---

## public class `org.apache.mina.filter.codec.textline.TextLineEncoder`
extends `org.apache.mina.filter.codec.ProtocolEncoderAdapter`  

**Constructors:**
- `public TextLineEncoder()`
- `public TextLineEncoder(java.lang.String p0)`
- `public TextLineEncoder(java.nio.charset.Charset p0)`
- `public TextLineEncoder(java.nio.charset.Charset p0, java.lang.String p1)`
- `public TextLineEncoder(java.nio.charset.Charset p0, org.apache.mina.filter.codec.textline.LineDelimiter p1)`
- `public TextLineEncoder(org.apache.mina.filter.codec.textline.LineDelimiter p0)`

**Methods:**
- `public void dispose() throws java.lang.Exception`
- `public void encode(org.apache.mina.core.session.IoSession p0, java.lang.Object p1, org.apache.mina.filter.codec.ProtocolEncoderOutput p2) throws java.lang.Exception`
- `public int getMaxLineLength()`
- `public void setMaxLineLength(int p0)`

---

## public class `org.apache.mina.filter.errorgenerating.ErrorGeneratingFilter`
extends `org.apache.mina.core.filterchain.IoFilterAdapter`  

**Constructors:**
- `public ErrorGeneratingFilter()`

**Methods:**
- `public void filterWrite(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2) throws java.lang.Exception`
- `public int getChangeByteProbability()`
- `public int getDuplicatePduProbability()`
- `public int getInsertByteProbability()`
- `public int getMaxInsertByte()`
- `public int getRemoveByteProbability()`
- `public int getRemovePduProbability()`
- `public int getResendPduLasterProbability()`
- `public boolean isManipulateReads()`
- `public boolean isManipulateWrites()`
- `public void messageReceived(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, java.lang.Object p2) throws java.lang.Exception`
- `public void setChangeByteProbability(int p0)`
- `public void setDuplicatePduProbability(int p0)`
- `public void setInsertByteProbability(int p0)`
- `public void setManipulateReads(boolean p0)`
- `public void setManipulateWrites(boolean p0)`
- `public void setMaxInsertByte(int p0)`
- `public void setRemoveByteProbability(int p0)`
- `public void setRemovePduProbability(int p0)`
- `public void setResendPduLasterProbability(int p0)`

---

## public class `org.apache.mina.filter.executor.DefaultIoEventSizeEstimator`
implements `org.apache.mina.filter.executor.IoEventSizeEstimator`  

**Constructors:**
- `public DefaultIoEventSizeEstimator()`

**Methods:**
- `public int estimateSize(java.lang.Object p0)`
- `public int estimateSize(org.apache.mina.core.session.IoEvent p0)`

---

## public class `org.apache.mina.filter.executor.ExecutorFilter`
extends `org.apache.mina.core.filterchain.IoFilterAdapter`  

**Constructors:**
- `public ExecutorFilter()`
- `public ExecutorFilter(int p0)`
- `public ExecutorFilter(int p0, int p1)`
- `public ExecutorFilter(int p0, int p1, long p2, java.util.concurrent.TimeUnit p3)`
- `public ExecutorFilter(int p0, int p1, long p2, java.util.concurrent.TimeUnit p3, java.util.concurrent.ThreadFactory p4)`
- `public ExecutorFilter(int p0, int p1, long p2, java.util.concurrent.TimeUnit p3, java.util.concurrent.ThreadFactory p4, org.apache.mina.core.session.IoEventType... p5)`
- `public ExecutorFilter(int p0, int p1, long p2, java.util.concurrent.TimeUnit p3, java.util.concurrent.ThreadFactory p4, org.apache.mina.filter.executor.IoEventQueueHandler p5)`
- `public ExecutorFilter(int p0, int p1, long p2, java.util.concurrent.TimeUnit p3, java.util.concurrent.ThreadFactory p4, org.apache.mina.filter.executor.IoEventQueueHandler p5, org.apache.mina.core.session.IoEventType... p6)`
- `public ExecutorFilter(int p0, int p1, long p2, java.util.concurrent.TimeUnit p3, org.apache.mina.core.session.IoEventType... p4)`
- `public ExecutorFilter(int p0, int p1, long p2, java.util.concurrent.TimeUnit p3, org.apache.mina.filter.executor.IoEventQueueHandler p4)`
- `public ExecutorFilter(int p0, int p1, long p2, java.util.concurrent.TimeUnit p3, org.apache.mina.filter.executor.IoEventQueueHandler p4, org.apache.mina.core.session.IoEventType... p5)`
- `public ExecutorFilter(int p0, int p1, org.apache.mina.core.session.IoEventType... p2)`
- `public ExecutorFilter(int p0, org.apache.mina.core.session.IoEventType... p1)`
- `public ExecutorFilter(java.util.concurrent.Executor p0)`
- `public ExecutorFilter(java.util.concurrent.Executor p0, org.apache.mina.core.session.IoEventType... p1)`
- `public ExecutorFilter(org.apache.mina.core.session.IoEventType... p0)`

**Methods:**
- `public void destroy()`
- `public final void exceptionCaught(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, java.lang.Throwable p2)`
- `public final void filterClose(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public final void filterWrite(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2)`
- `protected void fireEvent(org.apache.mina.core.filterchain.IoFilterEvent p0)`
- `public final java.util.concurrent.Executor getExecutor()`
- `public final void messageReceived(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, java.lang.Object p2)`
- `public final void messageSent(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2)`
- `public void onPreAdd(org.apache.mina.core.filterchain.IoFilterChain p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter$NextFilter p2) throws java.lang.Exception`
- `public final void sessionClosed(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1)`
- `public final void sessionIdle(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.session.IdleStatus p2)`
- `public final void sessionOpened(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1)`

---

## public abstract interface `org.apache.mina.filter.executor.IoEventQueueHandler`
implements `java.util.EventListener`  

**Fields:**
- `public final static org.apache.mina.filter.executor.IoEventQueueHandler NOOP`

**Methods:**
- `public abstract boolean accept(java.lang.Object p0, org.apache.mina.core.session.IoEvent p1)`
- `public abstract void offered(java.lang.Object p0, org.apache.mina.core.session.IoEvent p1)`
- `public abstract void polled(java.lang.Object p0, org.apache.mina.core.session.IoEvent p1)`

---

## public class `org.apache.mina.filter.executor.IoEventQueueThrottle`
implements `org.apache.mina.filter.executor.IoEventQueueHandler`  

**Constructors:**
- `public IoEventQueueThrottle()`
- `public IoEventQueueThrottle(int p0)`
- `public IoEventQueueThrottle(org.apache.mina.filter.executor.IoEventSizeEstimator p0, int p1)`

**Methods:**
- `public boolean accept(java.lang.Object p0, org.apache.mina.core.session.IoEvent p1)`
- `protected void block()`
- `public int getCounter()`
- `public org.apache.mina.filter.executor.IoEventSizeEstimator getEventSizeEstimator()`
- `public int getThreshold()`
- `public void offered(java.lang.Object p0, org.apache.mina.core.session.IoEvent p1)`
- `public void polled(java.lang.Object p0, org.apache.mina.core.session.IoEvent p1)`
- `public void setThreshold(int p0)`
- `protected void unblock()`

---

## public abstract interface `org.apache.mina.filter.executor.IoEventSizeEstimator`

**Methods:**
- `public abstract int estimateSize(org.apache.mina.core.session.IoEvent p0)`

---

## public class `org.apache.mina.filter.executor.OrderedThreadPoolExecutor`
extends `java.util.concurrent.ThreadPoolExecutor`  

**Constructors:**
- `public OrderedThreadPoolExecutor()`
- `public OrderedThreadPoolExecutor(int p0)`
- `public OrderedThreadPoolExecutor(int p0, int p1)`
- `public OrderedThreadPoolExecutor(int p0, int p1, long p2, java.util.concurrent.TimeUnit p3)`
- `public OrderedThreadPoolExecutor(int p0, int p1, long p2, java.util.concurrent.TimeUnit p3, java.util.concurrent.ThreadFactory p4)`
- `public OrderedThreadPoolExecutor(int p0, int p1, long p2, java.util.concurrent.TimeUnit p3, java.util.concurrent.ThreadFactory p4, org.apache.mina.filter.executor.IoEventQueueHandler p5)`
- `public OrderedThreadPoolExecutor(int p0, int p1, long p2, java.util.concurrent.TimeUnit p3, org.apache.mina.filter.executor.IoEventQueueHandler p4)`

**Methods:**
- `public boolean awaitTermination(long p0, java.util.concurrent.TimeUnit p1) throws java.lang.InterruptedException`
- `public void execute(java.lang.Runnable p0)`
- `public int getActiveCount()`
- `public long getCompletedTaskCount()`
- `public int getLargestPoolSize()`
- `public int getPoolSize()`
- `public java.util.concurrent.BlockingQueue getQueue()`
- `public org.apache.mina.filter.executor.IoEventQueueHandler getQueueHandler()`
- `public long getTaskCount()`
- `public boolean isShutdown()`
- `public boolean isTerminated()`
- `public boolean isTerminating()`
- `public int prestartAllCoreThreads()`
- `public boolean prestartCoreThread()`
- `public void purge()`
- `public boolean remove(java.lang.Runnable p0)`
- `public void setCorePoolSize(int p0)`
- `public void setMaximumPoolSize(int p0)`
- `public void setRejectedExecutionHandler(java.util.concurrent.RejectedExecutionHandler p0)`
- `public void shutdown()`
- `public java.util.List shutdownNow()`

---

## public class `org.apache.mina.filter.executor.PriorityThreadPoolExecutor`
extends `java.util.concurrent.ThreadPoolExecutor`  

**Constructors:**
- `public PriorityThreadPoolExecutor()`
- `public PriorityThreadPoolExecutor(int p0)`
- `public PriorityThreadPoolExecutor(int p0, int p1)`
- `public PriorityThreadPoolExecutor(int p0, int p1, long p2, java.util.concurrent.TimeUnit p3)`
- `public PriorityThreadPoolExecutor(int p0, int p1, long p2, java.util.concurrent.TimeUnit p3, java.util.concurrent.ThreadFactory p4)`
- `public PriorityThreadPoolExecutor(int p0, int p1, long p2, java.util.concurrent.TimeUnit p3, java.util.concurrent.ThreadFactory p4, org.apache.mina.filter.executor.IoEventQueueHandler p5, java.util.Comparator p6)`
- `public PriorityThreadPoolExecutor(int p0, int p1, long p2, java.util.concurrent.TimeUnit p3, org.apache.mina.filter.executor.IoEventQueueHandler p4)`
- `public PriorityThreadPoolExecutor(int p0, java.util.Comparator p1)`
- `public PriorityThreadPoolExecutor(java.util.Comparator p0)`

**Methods:**
- `public boolean awaitTermination(long p0, java.util.concurrent.TimeUnit p1) throws java.lang.InterruptedException`
- `public void execute(java.lang.Runnable p0)`
- `public int getActiveCount()`
- `public long getCompletedTaskCount()`
- `public int getLargestPoolSize()`
- `public int getPoolSize()`
- `public java.util.concurrent.BlockingQueue getQueue()`
- `public org.apache.mina.filter.executor.IoEventQueueHandler getQueueHandler()`
- `public long getTaskCount()`
- `public boolean isShutdown()`
- `public boolean isTerminated()`
- `public boolean isTerminating()`
- `public int prestartAllCoreThreads()`
- `public boolean prestartCoreThread()`
- `public void purge()`
- `public boolean remove(java.lang.Runnable p0)`
- `public void setCorePoolSize(int p0)`
- `public void setMaximumPoolSize(int p0)`
- `public void setRejectedExecutionHandler(java.util.concurrent.RejectedExecutionHandler p0)`
- `public void shutdown()`
- `public java.util.List shutdownNow()`

---

## public class `org.apache.mina.filter.executor.UnorderedThreadPoolExecutor`
extends `java.util.concurrent.ThreadPoolExecutor`  

**Constructors:**
- `public UnorderedThreadPoolExecutor()`
- `public UnorderedThreadPoolExecutor(int p0)`
- `public UnorderedThreadPoolExecutor(int p0, int p1)`
- `public UnorderedThreadPoolExecutor(int p0, int p1, long p2, java.util.concurrent.TimeUnit p3)`
- `public UnorderedThreadPoolExecutor(int p0, int p1, long p2, java.util.concurrent.TimeUnit p3, java.util.concurrent.ThreadFactory p4)`
- `public UnorderedThreadPoolExecutor(int p0, int p1, long p2, java.util.concurrent.TimeUnit p3, java.util.concurrent.ThreadFactory p4, org.apache.mina.filter.executor.IoEventQueueHandler p5)`
- `public UnorderedThreadPoolExecutor(int p0, int p1, long p2, java.util.concurrent.TimeUnit p3, org.apache.mina.filter.executor.IoEventQueueHandler p4)`

**Methods:**
- `public boolean awaitTermination(long p0, java.util.concurrent.TimeUnit p1) throws java.lang.InterruptedException`
- `public void execute(java.lang.Runnable p0)`
- `public int getActiveCount()`
- `public long getCompletedTaskCount()`
- `public int getCorePoolSize()`
- `public int getLargestPoolSize()`
- `public int getMaximumPoolSize()`
- `public int getPoolSize()`
- `public org.apache.mina.filter.executor.IoEventQueueHandler getQueueHandler()`
- `public long getTaskCount()`
- `public boolean isShutdown()`
- `public boolean isTerminated()`
- `public boolean isTerminating()`
- `public int prestartAllCoreThreads()`
- `public boolean prestartCoreThread()`
- `public void purge()`
- `public boolean remove(java.lang.Runnable p0)`
- `public void setCorePoolSize(int p0)`
- `public void setMaximumPoolSize(int p0)`
- `public void setRejectedExecutionHandler(java.util.concurrent.RejectedExecutionHandler p0)`
- `public void shutdown()`
- `public java.util.List shutdownNow()`

---

## public class `org.apache.mina.filter.executor.WriteRequestFilter`
extends `org.apache.mina.core.filterchain.IoFilterAdapter`  

**Constructors:**
- `public WriteRequestFilter()`
- `public WriteRequestFilter(org.apache.mina.filter.executor.IoEventQueueHandler p0)`

**Methods:**
- `public void filterWrite(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2) throws java.lang.Exception`
- `public org.apache.mina.filter.executor.IoEventQueueHandler getQueueHandler()`

---

## public class `org.apache.mina.filter.firewall.BlacklistFilter`
extends `org.apache.mina.core.filterchain.IoFilterAdapter`  

**Constructors:**
- `public BlacklistFilter()`

**Methods:**
- `public void block(java.net.InetAddress p0)`
- `public void block(org.apache.mina.filter.firewall.Subnet p0)`
- `public void event(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.filter.FilterEvent p2) throws java.lang.Exception`
- `public void messageReceived(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, java.lang.Object p2)`
- `public void messageSent(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2) throws java.lang.Exception`
- `public void sessionCreated(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1)`
- `public void sessionIdle(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.session.IdleStatus p2) throws java.lang.Exception`
- `public void sessionOpened(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public void setBlacklist(java.lang.Iterable p0)`
- `public void setBlacklist(java.net.InetAddress[] p0)`
- `public void setSubnetBlacklist(java.lang.Iterable p0)`
- `public void setSubnetBlacklist(org.apache.mina.filter.firewall.Subnet[] p0)`
- `public void unblock(java.net.InetAddress p0)`
- `public void unblock(org.apache.mina.filter.firewall.Subnet p0)`

---

## public class `org.apache.mina.filter.firewall.ConnectionThrottleFilter`
extends `org.apache.mina.core.filterchain.IoFilterAdapter`  

**Constructors:**
- `public ConnectionThrottleFilter()`
- `public ConnectionThrottleFilter(long p0)`

**Methods:**
- `protected boolean isConnectionOk(org.apache.mina.core.session.IoSession p0)`
- `public void sessionCreated(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public void setAllowedInterval(long p0)`

---

## public class `org.apache.mina.filter.firewall.Subnet`

**Constructors:**
- `public Subnet(java.net.InetAddress p0, int p1)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public boolean inSubnet(java.net.InetAddress p0)`
- `public java.lang.String toString()`

---

## public class `org.apache.mina.filter.keepalive.KeepAliveFilter`
extends `org.apache.mina.core.filterchain.IoFilterAdapter`  

**Constructors:**
- `public KeepAliveFilter(org.apache.mina.filter.keepalive.KeepAliveMessageFactory p0)`
- `public KeepAliveFilter(org.apache.mina.filter.keepalive.KeepAliveMessageFactory p0, org.apache.mina.core.session.IdleStatus p1)`
- `public KeepAliveFilter(org.apache.mina.filter.keepalive.KeepAliveMessageFactory p0, org.apache.mina.core.session.IdleStatus p1, org.apache.mina.filter.keepalive.KeepAliveRequestTimeoutHandler p2)`
- `public KeepAliveFilter(org.apache.mina.filter.keepalive.KeepAliveMessageFactory p0, org.apache.mina.core.session.IdleStatus p1, org.apache.mina.filter.keepalive.KeepAliveRequestTimeoutHandler p2, int p3, int p4)`
- `public KeepAliveFilter(org.apache.mina.filter.keepalive.KeepAliveMessageFactory p0, org.apache.mina.filter.keepalive.KeepAliveRequestTimeoutHandler p1)`

**Methods:**
- `public org.apache.mina.core.session.IdleStatus getInterestedIdleStatus()`
- `public org.apache.mina.filter.keepalive.KeepAliveMessageFactory getMessageFactory()`
- `public int getRequestInterval()`
- `public int getRequestTimeout()`
- `public org.apache.mina.filter.keepalive.KeepAliveRequestTimeoutHandler getRequestTimeoutHandler()`
- `public boolean isForwardEvent()`
- `public void messageReceived(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, java.lang.Object p2) throws java.lang.Exception`
- `public void messageSent(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2) throws java.lang.Exception`
- `public void onPostAdd(org.apache.mina.core.filterchain.IoFilterChain p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter$NextFilter p2) throws java.lang.Exception`
- `public void onPostRemove(org.apache.mina.core.filterchain.IoFilterChain p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter$NextFilter p2) throws java.lang.Exception`
- `public void onPreAdd(org.apache.mina.core.filterchain.IoFilterChain p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter$NextFilter p2) throws java.lang.Exception`
- `public void sessionIdle(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.session.IdleStatus p2) throws java.lang.Exception`
- `public void setForwardEvent(boolean p0)`
- `public void setRequestInterval(int p0)`
- `public void setRequestTimeout(int p0)`
- `public void setRequestTimeoutHandler(org.apache.mina.filter.keepalive.KeepAliveRequestTimeoutHandler p0)`

---

## public abstract interface `org.apache.mina.filter.keepalive.KeepAliveMessageFactory`

**Methods:**
- `public abstract java.lang.Object getRequest(org.apache.mina.core.session.IoSession p0)`
- `public abstract java.lang.Object getResponse(org.apache.mina.core.session.IoSession p0, java.lang.Object p1)`
- `public abstract boolean isRequest(org.apache.mina.core.session.IoSession p0, java.lang.Object p1)`
- `public abstract boolean isResponse(org.apache.mina.core.session.IoSession p0, java.lang.Object p1)`

---

## public class `org.apache.mina.filter.keepalive.KeepAliveRequestTimeoutException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public KeepAliveRequestTimeoutException()`
- `public KeepAliveRequestTimeoutException(java.lang.String p0)`
- `public KeepAliveRequestTimeoutException(java.lang.String p0, java.lang.Throwable p1)`
- `public KeepAliveRequestTimeoutException(java.lang.Throwable p0)`

---

## public abstract interface `org.apache.mina.filter.keepalive.KeepAliveRequestTimeoutHandler`

**Fields:**
- `public final static org.apache.mina.filter.keepalive.KeepAliveRequestTimeoutHandler CLOSE`
- `public final static org.apache.mina.filter.keepalive.KeepAliveRequestTimeoutHandler DEAF_SPEAKER`
- `public final static org.apache.mina.filter.keepalive.KeepAliveRequestTimeoutHandler EXCEPTION`
- `public final static org.apache.mina.filter.keepalive.KeepAliveRequestTimeoutHandler LOG`
- `public final static org.apache.mina.filter.keepalive.KeepAliveRequestTimeoutHandler NOOP`

**Methods:**
- `public abstract void keepAliveRequestTimedOut(org.apache.mina.filter.keepalive.KeepAliveFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`

---

## public final enum `org.apache.mina.filter.logging.LogLevel`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.apache.mina.filter.logging.LogLevel DEBUG`
- `public final static org.apache.mina.filter.logging.LogLevel ERROR`
- `public final static org.apache.mina.filter.logging.LogLevel INFO`
- `public final static org.apache.mina.filter.logging.LogLevel NONE`
- `public final static org.apache.mina.filter.logging.LogLevel TRACE`
- `public final static org.apache.mina.filter.logging.LogLevel WARN`

**Methods:**
- `public int getLevel()`

---

## public class `org.apache.mina.filter.logging.LoggingFilter`
extends `org.apache.mina.core.filterchain.IoFilterAdapter`  

**Constructors:**
- `public LoggingFilter()`
- `public LoggingFilter(java.lang.Class p0)`
- `public LoggingFilter(java.lang.String p0)`

**Methods:**
- `public void exceptionCaught(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, java.lang.Throwable p2) throws java.lang.Exception`
- `public org.apache.mina.filter.logging.LogLevel getExceptionCaughtLogLevel()`
- `public org.apache.mina.filter.logging.LogLevel getMessageReceivedLogLevel()`
- `public org.apache.mina.filter.logging.LogLevel getMessageSentLogLevel()`
- `public java.lang.String getName()`
- `public org.apache.mina.filter.logging.LogLevel getSessionClosedLogLevel()`
- `public org.apache.mina.filter.logging.LogLevel getSessionCreatedLogLevel()`
- `public org.apache.mina.filter.logging.LogLevel getSessionIdleLogLevel()`
- `public org.apache.mina.filter.logging.LogLevel getSessionOpenedLogLevel()`
- `public void messageReceived(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, java.lang.Object p2) throws java.lang.Exception`
- `public void messageSent(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2) throws java.lang.Exception`
- `public void sessionClosed(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public void sessionCreated(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public void sessionIdle(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.session.IdleStatus p2) throws java.lang.Exception`
- `public void sessionOpened(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public void setExceptionCaughtLogLevel(org.apache.mina.filter.logging.LogLevel p0)`
- `public void setMessageReceivedLogLevel(org.apache.mina.filter.logging.LogLevel p0)`
- `public void setMessageSentLogLevel(org.apache.mina.filter.logging.LogLevel p0)`
- `public void setSessionClosedLogLevel(org.apache.mina.filter.logging.LogLevel p0)`
- `public void setSessionCreatedLogLevel(org.apache.mina.filter.logging.LogLevel p0)`
- `public void setSessionIdleLogLevel(org.apache.mina.filter.logging.LogLevel p0)`
- `public void setSessionOpenedLogLevel(org.apache.mina.filter.logging.LogLevel p0)`

---

## public class `org.apache.mina.filter.logging.MdcInjectionFilter`
extends `org.apache.mina.filter.util.CommonEventFilter`  

**Constructors:**
- `public MdcInjectionFilter()`
- `public MdcInjectionFilter(java.util.EnumSet p0)`
- `public MdcInjectionFilter(org.apache.mina.filter.logging.MdcInjectionFilter$MdcKey... p0)`

**Methods:**
- `protected void fillContext(org.apache.mina.core.session.IoSession p0, java.util.Map p1)`
- `protected void filter(org.apache.mina.core.filterchain.IoFilterEvent p0) throws java.lang.Exception`
- `public static java.lang.String getProperty(org.apache.mina.core.session.IoSession p0, java.lang.String p1)`
- `public static void removeProperty(org.apache.mina.core.session.IoSession p0, java.lang.String p1)`
- `public static void setProperty(org.apache.mina.core.session.IoSession p0, java.lang.String p1, java.lang.String p2)`

---

## public final static enum `org.apache.mina.filter.logging.MdcInjectionFilter$MdcKey`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.apache.mina.filter.logging.MdcInjectionFilter$MdcKey handlerClass`
- `public final static org.apache.mina.filter.logging.MdcInjectionFilter$MdcKey localAddress`
- `public final static org.apache.mina.filter.logging.MdcInjectionFilter$MdcKey localIp`
- `public final static org.apache.mina.filter.logging.MdcInjectionFilter$MdcKey localPort`
- `public final static org.apache.mina.filter.logging.MdcInjectionFilter$MdcKey remoteAddress`
- `public final static org.apache.mina.filter.logging.MdcInjectionFilter$MdcKey remoteIp`
- `public final static org.apache.mina.filter.logging.MdcInjectionFilter$MdcKey remotePort`

---

## public class `org.apache.mina.filter.ssl.BogusTrustManagerFactory`
extends `javax.net.ssl.TrustManagerFactory`  

**Constructors:**
- `public BogusTrustManagerFactory()`

---

## public abstract interface `org.apache.mina.filter.ssl.DisableEncryptWriteRequest`
implements `org.apache.mina.core.write.WriteRequest`  

---

## public class `org.apache.mina.filter.ssl.EncryptedWriteRequest`
extends `org.apache.mina.core.write.DefaultWriteRequest`  

**Constructors:**
- `public EncryptedWriteRequest(java.lang.Object p0, org.apache.mina.core.write.WriteRequest p1)`

**Methods:**
- `public org.apache.mina.core.write.WriteRequest getOriginalRequest()`

---

## public class `org.apache.mina.filter.ssl.KeyStoreFactory`

**Constructors:**
- `public KeyStoreFactory()`

**Methods:**
- `public java.security.KeyStore newInstance() throws java.io.IOException, java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.cert.CertificateException`
- `public void setData(byte[] p0)`
- `public void setDataFile(java.io.File p0) throws java.io.IOException`
- `public void setDataUrl(java.net.URL p0) throws java.io.IOException`
- `public void setPassword(java.lang.String p0)`
- `public void setProvider(java.lang.String p0)`
- `public void setType(java.lang.String p0)`

---

## public class `org.apache.mina.filter.ssl.SslContextFactory`

**Constructors:**
- `public SslContextFactory()`

**Methods:**
- `public javax.net.ssl.SSLContext newInstance() throws java.lang.Exception`
- `public void setClientSessionCacheSize(int p0)`
- `public void setClientSessionTimeout(int p0)`
- `public void setKeyManagerFactory(javax.net.ssl.KeyManagerFactory p0)`
- `public void setKeyManagerFactoryAlgorithm(java.lang.String p0)`
- `public void setKeyManagerFactoryAlgorithmUseDefault(boolean p0)`
- `public void setKeyManagerFactoryKeyStore(java.security.KeyStore p0)`
- `public void setKeyManagerFactoryKeyStorePassword(java.lang.String p0)`
- `public void setKeyManagerFactoryProvider(java.lang.String p0)`
- `public void setProtocol(java.lang.String p0)`
- `public void setProvider(java.lang.String p0)`
- `public void setSecureRandom(java.security.SecureRandom p0)`
- `public void setServerSessionCacheSize(int p0)`
- `public void setServerSessionTimeout(int p0)`
- `public void setTrustManagerFactory(javax.net.ssl.TrustManagerFactory p0)`
- `public void setTrustManagerFactoryAlgorithm(java.lang.String p0)`
- `public void setTrustManagerFactoryAlgorithmUseDefault(boolean p0)`
- `public void setTrustManagerFactoryKeyStore(java.security.KeyStore p0)`
- `public void setTrustManagerFactoryParameters(javax.net.ssl.ManagerFactoryParameters p0)`
- `public void setTrustManagerFactoryProvider(java.lang.String p0)`

---

## public final enum `org.apache.mina.filter.ssl.SslEvent`
extends `java.lang.Enum`  
implements `org.apache.mina.filter.FilterEvent`  

**Fields:**
- `public final static org.apache.mina.filter.ssl.SslEvent SECURED`
- `public final static org.apache.mina.filter.ssl.SslEvent UNSECURED`

---

## public class `org.apache.mina.filter.ssl.SslFilter`
extends `org.apache.mina.core.filterchain.IoFilterAdapter`  

**Constructors:**
- `public SslFilter(javax.net.ssl.SSLContext p0)`

**Fields:**
- `protected final static java.util.concurrent.Executor EXECUTOR`
- `protected final static org.slf4j.Logger LOGGER`
- `protected final static org.apache.mina.core.session.AttributeKey SSL_HANDLER`
- `public final static org.apache.mina.core.session.AttributeKey SSL_SECURED`
- `protected java.lang.String[] enabledCipherSuites`
- `protected java.lang.String[] enabledProtocols`
- `protected boolean needClientAuth`
- `protected final javax.net.ssl.SSLContext sslContext`
- `protected boolean wantClientAuth`

**Methods:**
- `protected javax.net.ssl.SSLEngine createEngine(org.apache.mina.core.session.IoSession p0, java.net.InetSocketAddress p1)`
- `public void filterWrite(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2) throws java.lang.Exception`
- `public java.lang.String[] getEnabledCipherSuites()`
- `public java.lang.String[] getEnabledProtocols()`
- `public boolean isNeedClientAuth()`
- `public boolean isWantClientAuth()`
- `public void messageReceived(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, java.lang.Object p2) throws java.lang.Exception`
- `public void messageSent(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2) throws java.lang.Exception`
- `protected synchronized void onClose(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, boolean p2) throws javax.net.ssl.SSLException`
- `protected synchronized void onConnected(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws javax.net.ssl.SSLException`
- `public void onPostAdd(org.apache.mina.core.filterchain.IoFilterChain p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter$NextFilter p2) throws java.lang.Exception`
- `public void onPreAdd(org.apache.mina.core.filterchain.IoFilterChain p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter$NextFilter p2) throws java.lang.Exception`
- `public void onPreRemove(org.apache.mina.core.filterchain.IoFilterChain p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter$NextFilter p2) throws java.lang.Exception`
- `public void sessionClosed(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public void sessionOpened(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public void setEnabledCipherSuites(java.lang.String... p0)`
- `public void setEnabledProtocols(java.lang.String... p0)`
- `public void setNeedClientAuth(boolean p0)`
- `public void setWantClientAuth(boolean p0)`

---

## public abstract class `org.apache.mina.filter.ssl.SslHandler`

**Constructors:**
- `public SslHandler(javax.net.ssl.SSLEngine p0, java.util.concurrent.Executor p1, org.apache.mina.core.session.IoSession p2)`

**Fields:**
- `protected final static org.slf4j.Logger LOGGER`
- `protected final static int MAX_ENCODER_BUFFER_PACKETS`
- `protected final static int MIN_ENCODER_BUFFER_PACKETS`
- `protected final static org.apache.mina.core.buffer.IoBuffer ZERO`
- `protected final java.util.Deque mAckQueue`
- `protected org.apache.mina.core.buffer.IoBuffer mDecodeBuffer`
- `protected final java.util.Deque mEncodeQueue`
- `protected final javax.net.ssl.SSLEngine mEngine`
- `protected final java.util.concurrent.Executor mExecutor`
- `protected final org.apache.mina.core.session.IoSession mSession`

**Methods:**
- `public abstract void ack(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.write.WriteRequest p1) throws javax.net.ssl.SSLException`
- `protected org.apache.mina.core.buffer.IoBuffer allocate_app_buffer(int p0)`
- `protected org.apache.mina.core.buffer.IoBuffer allocate_encode_buffer(int p0)`
- `public abstract void close(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, boolean p1) throws javax.net.ssl.SSLException`
- `public abstract boolean isConnected()`
- `public abstract boolean isOpen()`
- `public abstract void open(org.apache.mina.core.filterchain.IoFilter$NextFilter p0) throws javax.net.ssl.SSLException`
- `public abstract void receive(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.buffer.IoBuffer p1) throws javax.net.ssl.SSLException`
- `protected org.apache.mina.core.buffer.IoBuffer resume_decode_buffer(org.apache.mina.core.buffer.IoBuffer p0)`
- `protected void suspend_decode_buffer(org.apache.mina.core.buffer.IoBuffer p0)`
- `public java.lang.String toString()`
- `public abstract void write(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.write.WriteRequest p1) throws javax.net.ssl.SSLException, org.apache.mina.core.write.WriteRejectedException`

---

## public class `org.apache.mina.filter.statistic.ProfilerTimerFilter`
extends `org.apache.mina.core.filterchain.IoFilterAdapter`  

**Constructors:**
- `public ProfilerTimerFilter()`
- `public ProfilerTimerFilter(java.util.concurrent.TimeUnit p0)`
- `public ProfilerTimerFilter(java.util.concurrent.TimeUnit p0, org.apache.mina.core.session.IoEventType... p1)`

**Methods:**
- `public double getAverageTime(org.apache.mina.core.session.IoEventType p0)`
- `public java.util.Set getEventsToProfile()`
- `public long getMaximumTime(org.apache.mina.core.session.IoEventType p0)`
- `public long getMinimumTime(org.apache.mina.core.session.IoEventType p0)`
- `public long getTotalCalls(org.apache.mina.core.session.IoEventType p0)`
- `public long getTotalTime(org.apache.mina.core.session.IoEventType p0)`
- `public void messageReceived(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, java.lang.Object p2) throws java.lang.Exception`
- `public void messageSent(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2) throws java.lang.Exception`
- `public void profile(org.apache.mina.core.session.IoEventType p0)`
- `public void sessionClosed(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public void sessionCreated(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public void sessionIdle(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.session.IdleStatus p2) throws java.lang.Exception`
- `public void sessionOpened(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public void setEventsToProfile(org.apache.mina.core.session.IoEventType... p0)`
- `public void setTimeUnit(java.util.concurrent.TimeUnit p0)`
- `public void stopProfile(org.apache.mina.core.session.IoEventType p0)`

---

## public abstract class `org.apache.mina.filter.stream.AbstractStreamWriteFilter`<T extends java.lang.Object>
extends `org.apache.mina.core.filterchain.IoFilterAdapter`  

**Constructors:**
- `public AbstractStreamWriteFilter()`

**Fields:**
- `protected final static org.apache.mina.core.session.AttributeKey CURRENT_STREAM`
- `protected final static org.apache.mina.core.session.AttributeKey CURRENT_WRITE_REQUEST`
- `public final static int DEFAULT_STREAM_BUFFER_SIZE`
- `protected final static org.apache.mina.core.session.AttributeKey WRITE_REQUEST_QUEUE`

**Methods:**
- `public void filterWrite(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2) throws java.lang.Exception`
- `protected abstract java.lang.Class getMessageClass()`
- `protected abstract org.apache.mina.core.buffer.IoBuffer getNextBuffer(T p0) throws java.io.IOException`
- `public int getWriteBufferSize()`
- `public void messageSent(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2) throws java.lang.Exception`
- `public void onPreAdd(org.apache.mina.core.filterchain.IoFilterChain p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter$NextFilter p2) throws java.lang.Exception`
- `public void setWriteBufferSize(int p0)`

---

## public class `org.apache.mina.filter.stream.FileRegionWriteFilter`
extends `org.apache.mina.filter.stream.AbstractStreamWriteFilter`  

**Constructors:**
- `public FileRegionWriteFilter()`

**Methods:**
- `protected java.lang.Class getMessageClass()`
- `protected org.apache.mina.core.buffer.IoBuffer getNextBuffer(org.apache.mina.core.file.FileRegion p0) throws java.io.IOException`

---

## public class `org.apache.mina.filter.stream.StreamWriteFilter`
extends `org.apache.mina.filter.stream.AbstractStreamWriteFilter`  

**Constructors:**
- `public StreamWriteFilter()`

**Methods:**
- `protected java.lang.Class getMessageClass()`
- `protected org.apache.mina.core.buffer.IoBuffer getNextBuffer(java.io.InputStream p0) throws java.io.IOException`

---

## public abstract class `org.apache.mina.filter.util.CommonEventFilter`
extends `org.apache.mina.core.filterchain.IoFilterAdapter`  

**Constructors:**
- `public CommonEventFilter()`

**Methods:**
- `public void event(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.filter.FilterEvent p2) throws java.lang.Exception`
- `public final void exceptionCaught(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, java.lang.Throwable p2) throws java.lang.Exception`
- `protected abstract void filter(org.apache.mina.core.filterchain.IoFilterEvent p0) throws java.lang.Exception`
- `public final void filterClose(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public final void filterWrite(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2) throws java.lang.Exception`
- `public void inputClosed(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public final void messageReceived(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, java.lang.Object p2) throws java.lang.Exception`
- `public final void messageSent(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2) throws java.lang.Exception`
- `public final void sessionClosed(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public final void sessionCreated(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public final void sessionIdle(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.session.IdleStatus p2) throws java.lang.Exception`
- `public final void sessionOpened(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`

---

## public class `org.apache.mina.filter.util.NoopFilter`
extends `org.apache.mina.core.filterchain.IoFilterAdapter`  

**Constructors:**
- `public NoopFilter()`

---

## public class `org.apache.mina.filter.util.ReferenceCountingFilter`
extends `org.apache.mina.core.filterchain.IoFilterAdapter`  

**Constructors:**
- `public ReferenceCountingFilter(org.apache.mina.core.filterchain.IoFilter p0)`

**Methods:**
- `public void exceptionCaught(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, java.lang.Throwable p2) throws java.lang.Exception`
- `public void filterClose(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public void filterWrite(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2) throws java.lang.Exception`
- `public void messageReceived(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, java.lang.Object p2) throws java.lang.Exception`
- `public void messageSent(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2) throws java.lang.Exception`
- `public void onPostAdd(org.apache.mina.core.filterchain.IoFilterChain p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter$NextFilter p2) throws java.lang.Exception`
- `public synchronized void onPostRemove(org.apache.mina.core.filterchain.IoFilterChain p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter$NextFilter p2) throws java.lang.Exception`
- `public synchronized void onPreAdd(org.apache.mina.core.filterchain.IoFilterChain p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter$NextFilter p2) throws java.lang.Exception`
- `public void onPreRemove(org.apache.mina.core.filterchain.IoFilterChain p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter$NextFilter p2) throws java.lang.Exception`
- `public void sessionClosed(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public void sessionCreated(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public void sessionIdle(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.session.IdleStatus p2) throws java.lang.Exception`
- `public void sessionOpened(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`

---

## public class `org.apache.mina.filter.util.SessionAttributeInitializingFilter`
extends `org.apache.mina.core.filterchain.IoFilterAdapter`  

**Constructors:**
- `public SessionAttributeInitializingFilter()`
- `public SessionAttributeInitializingFilter(java.util.Map p0)`

**Methods:**
- `public java.lang.Object getAttribute(java.lang.String p0)`
- `public java.util.Set getAttributeKeys()`
- `public java.lang.Object removeAttribute(java.lang.String p0)`
- `public void sessionCreated(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public java.lang.Object setAttribute(java.lang.String p0)`
- `public java.lang.Object setAttribute(java.lang.String p0, java.lang.Object p1)`
- `public void setAttributes(java.util.Map p0)`

---

## public class `org.apache.mina.handler.chain.ChainedIoHandler`
extends `org.apache.mina.core.service.IoHandlerAdapter`  

**Constructors:**
- `public ChainedIoHandler()`
- `public ChainedIoHandler(org.apache.mina.handler.chain.IoHandlerChain p0)`

**Methods:**
- `public org.apache.mina.handler.chain.IoHandlerChain getChain()`
- `public void messageReceived(org.apache.mina.core.session.IoSession p0, java.lang.Object p1) throws java.lang.Exception`

---

## public class `org.apache.mina.handler.chain.IoHandlerChain`
implements `org.apache.mina.handler.chain.IoHandlerCommand`  

**Constructors:**
- `public IoHandlerChain()`

**Methods:**
- `public synchronized void addAfter(java.lang.String p0, java.lang.String p1, org.apache.mina.handler.chain.IoHandlerCommand p2)`
- `public synchronized void addBefore(java.lang.String p0, java.lang.String p1, org.apache.mina.handler.chain.IoHandlerCommand p2)`
- `public synchronized void addFirst(java.lang.String p0, org.apache.mina.handler.chain.IoHandlerCommand p1)`
- `public synchronized void addLast(java.lang.String p0, org.apache.mina.handler.chain.IoHandlerCommand p1)`
- `public synchronized void clear() throws java.lang.Exception`
- `public boolean contains(java.lang.Class p0)`
- `public boolean contains(java.lang.String p0)`
- `public boolean contains(org.apache.mina.handler.chain.IoHandlerCommand p0)`
- `public void execute(org.apache.mina.handler.chain.IoHandlerCommand$NextCommand p0, org.apache.mina.core.session.IoSession p1, java.lang.Object p2) throws java.lang.Exception`
- `public org.apache.mina.handler.chain.IoHandlerCommand get(java.lang.String p0)`
- `public java.util.List getAll()`
- `public java.util.List getAllReversed()`
- `public org.apache.mina.handler.chain.IoHandlerChain$Entry getEntry(java.lang.String p0)`
- `public org.apache.mina.handler.chain.IoHandlerCommand$NextCommand getNextCommand(java.lang.String p0)`
- `public synchronized org.apache.mina.handler.chain.IoHandlerCommand remove(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public class `org.apache.mina.handler.chain.IoHandlerChain$Entry`

**Methods:**
- `public org.apache.mina.handler.chain.IoHandlerCommand getCommand()`
- `public java.lang.String getName()`
- `public org.apache.mina.handler.chain.IoHandlerCommand$NextCommand getNextCommand()`

---

## public abstract interface `org.apache.mina.handler.chain.IoHandlerCommand`

**Methods:**
- `public abstract void execute(org.apache.mina.handler.chain.IoHandlerCommand$NextCommand p0, org.apache.mina.core.session.IoSession p1, java.lang.Object p2) throws java.lang.Exception`

---

## public abstract static interface `org.apache.mina.handler.chain.IoHandlerCommand$NextCommand`

**Methods:**
- `public abstract void execute(org.apache.mina.core.session.IoSession p0, java.lang.Object p1) throws java.lang.Exception`

---

## public class `org.apache.mina.handler.demux.DemuxingIoHandler`
extends `org.apache.mina.core.service.IoHandlerAdapter`  

**Constructors:**
- `public DemuxingIoHandler()`

**Methods:**
- `public <E extends java.lang.Throwable> org.apache.mina.handler.demux.ExceptionHandler addExceptionHandler(java.lang.Class p0, org.apache.mina.handler.demux.ExceptionHandler p1)`
- `public <E extends java.lang.Object> org.apache.mina.handler.demux.MessageHandler addReceivedMessageHandler(java.lang.Class p0, org.apache.mina.handler.demux.MessageHandler p1)`
- `public <E extends java.lang.Object> org.apache.mina.handler.demux.MessageHandler addSentMessageHandler(java.lang.Class p0, org.apache.mina.handler.demux.MessageHandler p1)`
- `public void exceptionCaught(org.apache.mina.core.session.IoSession p0, java.lang.Throwable p1) throws java.lang.Exception`
- `protected org.apache.mina.handler.demux.ExceptionHandler findExceptionHandler(java.lang.Class p0)`
- `protected org.apache.mina.handler.demux.MessageHandler findReceivedMessageHandler(java.lang.Class p0)`
- `protected org.apache.mina.handler.demux.MessageHandler findSentMessageHandler(java.lang.Class p0)`
- `public java.util.Map getExceptionHandlerMap()`
- `public <E extends java.lang.Object> org.apache.mina.handler.demux.MessageHandler getMessageHandler(java.lang.Class p0)`
- `public java.util.Map getReceivedMessageHandlerMap()`
- `public java.util.Map getSentMessageHandlerMap()`
- `public void messageReceived(org.apache.mina.core.session.IoSession p0, java.lang.Object p1) throws java.lang.Exception`
- `public void messageSent(org.apache.mina.core.session.IoSession p0, java.lang.Object p1) throws java.lang.Exception`
- `public <E extends java.lang.Throwable> org.apache.mina.handler.demux.ExceptionHandler removeExceptionHandler(java.lang.Class p0)`
- `public <E extends java.lang.Object> org.apache.mina.handler.demux.MessageHandler removeReceivedMessageHandler(java.lang.Class p0)`
- `public <E extends java.lang.Object> org.apache.mina.handler.demux.MessageHandler removeSentMessageHandler(java.lang.Class p0)`

---

## public abstract interface `org.apache.mina.handler.demux.ExceptionHandler`<E extends java.lang.Throwable>

**Fields:**
- `public final static org.apache.mina.handler.demux.ExceptionHandler CLOSE`
- `public final static org.apache.mina.handler.demux.ExceptionHandler NOOP`

**Methods:**
- `public abstract void exceptionCaught(org.apache.mina.core.session.IoSession p0, E p1) throws java.lang.Exception`

---

## public abstract interface `org.apache.mina.handler.demux.MessageHandler`<M extends java.lang.Object>

**Fields:**
- `public final static org.apache.mina.handler.demux.MessageHandler NOOP`

**Methods:**
- `public abstract void handleMessage(org.apache.mina.core.session.IoSession p0, M p1) throws java.lang.Exception`

---

## public abstract interface `org.apache.mina.handler.multiton.SingleSessionIoHandler`
annotations: @java.lang.Deprecated  

**Methods:**
- `public abstract void event(org.apache.mina.filter.FilterEvent p0) throws java.lang.Exception`
- `public abstract void exceptionCaught(java.lang.Throwable p0) throws java.lang.Exception`
- `public abstract void inputClosed(org.apache.mina.core.session.IoSession p0)`
- `public abstract void messageReceived(java.lang.Object p0) throws java.lang.Exception`
- `public abstract void messageSent(java.lang.Object p0) throws java.lang.Exception`
- `public abstract void sessionClosed() throws java.lang.Exception`
- `public abstract void sessionCreated() throws java.lang.Exception`
- `public abstract void sessionIdle(org.apache.mina.core.session.IdleStatus p0) throws java.lang.Exception`
- `public abstract void sessionOpened() throws java.lang.Exception`

---

## public class `org.apache.mina.handler.multiton.SingleSessionIoHandlerAdapter`
annotations: @java.lang.Deprecated  
implements `org.apache.mina.handler.multiton.SingleSessionIoHandler`  

**Constructors:**
- `public SingleSessionIoHandlerAdapter(org.apache.mina.core.session.IoSession p0)`

**Methods:**
- `public void event(org.apache.mina.filter.FilterEvent p0) throws java.lang.Exception`
- `public void exceptionCaught(java.lang.Throwable p0) throws java.lang.Exception`
- `protected org.apache.mina.core.session.IoSession getSession()`
- `public void inputClosed(org.apache.mina.core.session.IoSession p0)`
- `public void messageReceived(java.lang.Object p0) throws java.lang.Exception`
- `public void messageSent(java.lang.Object p0) throws java.lang.Exception`
- `public void sessionClosed() throws java.lang.Exception`
- `public void sessionCreated() throws java.lang.Exception`
- `public void sessionIdle(org.apache.mina.core.session.IdleStatus p0) throws java.lang.Exception`
- `public void sessionOpened() throws java.lang.Exception`

---

## public class `org.apache.mina.handler.multiton.SingleSessionIoHandlerDelegate`
annotations: @java.lang.Deprecated  
implements `org.apache.mina.core.service.IoHandler`  

**Constructors:**
- `public SingleSessionIoHandlerDelegate(org.apache.mina.handler.multiton.SingleSessionIoHandlerFactory p0)`

**Fields:**
- `public final static org.apache.mina.core.session.AttributeKey HANDLER`

**Methods:**
- `public void event(org.apache.mina.core.session.IoSession p0, org.apache.mina.filter.FilterEvent p1) throws java.lang.Exception`
- `public void exceptionCaught(org.apache.mina.core.session.IoSession p0, java.lang.Throwable p1) throws java.lang.Exception`
- `public org.apache.mina.handler.multiton.SingleSessionIoHandlerFactory getFactory()`
- `public void inputClosed(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public void messageReceived(org.apache.mina.core.session.IoSession p0, java.lang.Object p1) throws java.lang.Exception`
- `public void messageSent(org.apache.mina.core.session.IoSession p0, java.lang.Object p1) throws java.lang.Exception`
- `public void sessionClosed(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public void sessionCreated(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public void sessionIdle(org.apache.mina.core.session.IoSession p0, org.apache.mina.core.session.IdleStatus p1) throws java.lang.Exception`
- `public void sessionOpened(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`

---

## public abstract interface `org.apache.mina.handler.multiton.SingleSessionIoHandlerFactory`
annotations: @java.lang.Deprecated  

**Methods:**
- `public abstract org.apache.mina.handler.multiton.SingleSessionIoHandler getHandler(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`

---

## public abstract class `org.apache.mina.handler.stream.StreamIoHandler`
extends `org.apache.mina.core.service.IoHandlerAdapter`  

**Constructors:**
- `protected StreamIoHandler()`

**Methods:**
- `public void exceptionCaught(org.apache.mina.core.session.IoSession p0, java.lang.Throwable p1)`
- `public int getReadTimeout()`
- `public int getWriteTimeout()`
- `public void messageReceived(org.apache.mina.core.session.IoSession p0, java.lang.Object p1)`
- `protected abstract void processStreamIo(org.apache.mina.core.session.IoSession p0, java.io.InputStream p1, java.io.OutputStream p2)`
- `public void sessionClosed(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public void sessionIdle(org.apache.mina.core.session.IoSession p0, org.apache.mina.core.session.IdleStatus p1)`
- `public void sessionOpened(org.apache.mina.core.session.IoSession p0)`
- `public void setReadTimeout(int p0)`
- `public void setWriteTimeout(int p0)`

---

## public abstract class `org.apache.mina.proxy.AbstractProxyIoHandler`
extends `org.apache.mina.core.service.IoHandlerAdapter`  

**Constructors:**
- `public AbstractProxyIoHandler()`

**Methods:**
- `public abstract void proxySessionOpened(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`
- `public final void sessionOpened(org.apache.mina.core.session.IoSession p0) throws java.lang.Exception`

---

## public abstract class `org.apache.mina.proxy.AbstractProxyLogicHandler`
implements `org.apache.mina.proxy.ProxyLogicHandler`  

**Constructors:**
- `public AbstractProxyLogicHandler(org.apache.mina.proxy.session.ProxyIoSession p0)`

**Methods:**
- `protected void closeSession(java.lang.String p0)`
- `protected void closeSession(java.lang.String p0, java.lang.Throwable p1)`
- `public synchronized void enqueueWriteRequest(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.write.WriteRequest p1)`
- `protected synchronized void flushPendingWriteRequests() throws java.lang.Exception`
- `protected org.apache.mina.proxy.filter.ProxyFilter getProxyFilter()`
- `public org.apache.mina.proxy.session.ProxyIoSession getProxyIoSession()`
- `protected org.apache.mina.core.session.IoSession getSession()`
- `public boolean isHandshakeComplete()`
- `protected final void setHandshakeComplete()`
- `protected org.apache.mina.core.future.WriteFuture writeData(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.buffer.IoBuffer p1)`

---

## public class `org.apache.mina.proxy.ProxyAuthException`
extends `javax.security.sasl.SaslException`  

**Constructors:**
- `public ProxyAuthException(java.lang.String p0)`
- `public ProxyAuthException(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `org.apache.mina.proxy.ProxyConnector`
extends `org.apache.mina.core.service.AbstractIoConnector`  

**Constructors:**
- `public ProxyConnector()`
- `public ProxyConnector(org.apache.mina.transport.socket.SocketConnector p0)`
- `public ProxyConnector(org.apache.mina.transport.socket.SocketConnector p0, org.apache.mina.core.session.IoSessionConfig p1, java.util.concurrent.Executor p2)`

**Methods:**
- `public void cancelConnectFuture()`
- `protected org.apache.mina.core.future.ConnectFuture connect0(java.net.SocketAddress p0, java.net.SocketAddress p1, org.apache.mina.core.session.IoSessionInitializer p2)`
- `protected void dispose0() throws java.lang.Exception`
- `protected org.apache.mina.core.future.ConnectFuture fireConnected(org.apache.mina.core.session.IoSession p0)`
- `public final org.apache.mina.transport.socket.SocketConnector getConnector()`
- `public org.apache.mina.proxy.session.ProxyIoSession getProxyIoSession()`
- `public org.apache.mina.core.session.IoSessionConfig getSessionConfig()`
- `public org.apache.mina.core.service.TransportMetadata getTransportMetadata()`
- `public void setProxyIoSession(org.apache.mina.proxy.session.ProxyIoSession p0)`

---

## public abstract interface `org.apache.mina.proxy.ProxyLogicHandler`

**Methods:**
- `public abstract void doHandshake(org.apache.mina.core.filterchain.IoFilter$NextFilter p0) throws org.apache.mina.proxy.ProxyAuthException`
- `public abstract void enqueueWriteRequest(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.write.WriteRequest p1)`
- `public abstract org.apache.mina.proxy.session.ProxyIoSession getProxyIoSession()`
- `public abstract boolean isHandshakeComplete()`
- `public abstract void messageReceived(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.buffer.IoBuffer p1) throws org.apache.mina.proxy.ProxyAuthException`

---

## public class `org.apache.mina.proxy.event.IoSessionEvent`

**Constructors:**
- `public IoSessionEvent(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.session.IdleStatus p2)`
- `public IoSessionEvent(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.proxy.event.IoSessionEventType p2)`

**Methods:**
- `public void deliverEvent()`
- `public org.apache.mina.core.filterchain.IoFilter$NextFilter getNextFilter()`
- `public org.apache.mina.core.session.IoSession getSession()`
- `public org.apache.mina.core.session.IdleStatus getStatus()`
- `public org.apache.mina.proxy.event.IoSessionEventType getType()`
- `public java.lang.String toString()`

---

## public class `org.apache.mina.proxy.event.IoSessionEventQueue`

**Constructors:**
- `public IoSessionEventQueue(org.apache.mina.proxy.session.ProxyIoSession p0)`

**Methods:**
- `public void enqueueEventIfNecessary(org.apache.mina.proxy.event.IoSessionEvent p0)`
- `public void flushPendingSessionEvents() throws java.lang.Exception`

---

## public final enum `org.apache.mina.proxy.event.IoSessionEventType`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.apache.mina.proxy.event.IoSessionEventType CLOSED`
- `public final static org.apache.mina.proxy.event.IoSessionEventType CREATED`
- `public final static org.apache.mina.proxy.event.IoSessionEventType IDLE`
- `public final static org.apache.mina.proxy.event.IoSessionEventType OPENED`

**Methods:**
- `public int getId()`
- `public java.lang.String toString()`

---

## public class `org.apache.mina.proxy.filter.ProxyFilter`
extends `org.apache.mina.core.filterchain.IoFilterAdapter`  

**Constructors:**
- `public ProxyFilter()`

**Methods:**
- `public void exceptionCaught(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, java.lang.Throwable p2) throws java.lang.Exception`
- `public void filterWrite(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2)`
- `public void messageReceived(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, java.lang.Object p2) throws org.apache.mina.proxy.ProxyAuthException`
- `public void messageSent(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2) throws java.lang.Exception`
- `public void onPreAdd(org.apache.mina.core.filterchain.IoFilterChain p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter$NextFilter p2)`
- `public void onPreRemove(org.apache.mina.core.filterchain.IoFilterChain p0, java.lang.String p1, org.apache.mina.core.filterchain.IoFilter$NextFilter p2)`
- `public void sessionClosed(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public void sessionCreated(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public void sessionIdle(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.session.IdleStatus p2) throws java.lang.Exception`
- `public void sessionOpened(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1) throws java.lang.Exception`
- `public void writeData(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.session.IoSession p1, org.apache.mina.core.write.WriteRequest p2, boolean p3)`

---

## public class `org.apache.mina.proxy.filter.ProxyHandshakeIoBuffer`
extends `org.apache.mina.core.buffer.IoBufferWrapper`  

**Constructors:**
- `public ProxyHandshakeIoBuffer(org.apache.mina.core.buffer.IoBuffer p0)`

---

## public abstract class `org.apache.mina.proxy.handlers.ProxyRequest`

**Constructors:**
- `public ProxyRequest()`
- `public ProxyRequest(java.net.InetSocketAddress p0)`

**Methods:**
- `public java.net.InetSocketAddress getEndpointAddress()`

---

## public abstract class `org.apache.mina.proxy.handlers.http.AbstractAuthLogicHandler`

**Constructors:**
- `protected AbstractAuthLogicHandler(org.apache.mina.proxy.session.ProxyIoSession p0) throws org.apache.mina.proxy.ProxyAuthException`

**Fields:**
- `protected org.apache.mina.proxy.session.ProxyIoSession proxyIoSession`
- `protected org.apache.mina.proxy.handlers.ProxyRequest request`
- `protected int step`

**Methods:**
- `public static void addKeepAliveHeaders(java.util.Map p0)`
- `public abstract void doHandshake(org.apache.mina.core.filterchain.IoFilter$NextFilter p0) throws org.apache.mina.proxy.ProxyAuthException`
- `public abstract void handleResponse(org.apache.mina.proxy.handlers.http.HttpProxyResponse p0) throws org.apache.mina.proxy.ProxyAuthException`
- `protected void writeRequest(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.proxy.handlers.http.HttpProxyRequest p1) throws org.apache.mina.proxy.ProxyAuthException`

---

## public abstract class `org.apache.mina.proxy.handlers.http.AbstractHttpLogicHandler`
extends `org.apache.mina.proxy.AbstractProxyLogicHandler`  

**Constructors:**
- `public AbstractHttpLogicHandler(org.apache.mina.proxy.session.ProxyIoSession p0)`

**Methods:**
- `protected org.apache.mina.proxy.handlers.http.HttpProxyResponse decodeResponse(java.lang.String p0) throws java.lang.Exception`
- `public abstract void handleResponse(org.apache.mina.proxy.handlers.http.HttpProxyResponse p0) throws org.apache.mina.proxy.ProxyAuthException`
- `public synchronized void messageReceived(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.buffer.IoBuffer p1) throws org.apache.mina.proxy.ProxyAuthException`
- `public void writeRequest(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.proxy.handlers.http.HttpProxyRequest p1)`

---

## public final enum `org.apache.mina.proxy.handlers.http.HttpAuthenticationMethods`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.apache.mina.proxy.handlers.http.HttpAuthenticationMethods BASIC`
- `public final static org.apache.mina.proxy.handlers.http.HttpAuthenticationMethods DIGEST`
- `public final static org.apache.mina.proxy.handlers.http.HttpAuthenticationMethods NO_AUTH`
- `public final static org.apache.mina.proxy.handlers.http.HttpAuthenticationMethods NTLM`

**Methods:**
- `public int getId()`
- `public static org.apache.mina.proxy.handlers.http.AbstractAuthLogicHandler getNewHandler(int p0, org.apache.mina.proxy.session.ProxyIoSession p1) throws org.apache.mina.proxy.ProxyAuthException`
- `public org.apache.mina.proxy.handlers.http.AbstractAuthLogicHandler getNewHandler(org.apache.mina.proxy.session.ProxyIoSession p0) throws org.apache.mina.proxy.ProxyAuthException`

---

## public class `org.apache.mina.proxy.handlers.http.HttpProxyConstants`

**Fields:**
- `public final static java.lang.String CONNECT`
- `public final static java.lang.String CRLF`
- `public final static java.lang.String DEFAULT_KEEP_ALIVE_TIME`
- `public final static java.lang.String DOMAIN_PROPERTY`
- `public final static java.lang.String GET`
- `public final static java.lang.String HTTP_1_0`
- `public final static java.lang.String HTTP_1_1`
- `public final static java.lang.String PUT`
- `public final static java.lang.String PWD_PROPERTY`
- `public final static java.lang.String USER_PROPERTY`
- `public final static java.lang.String WORKSTATION_PROPERTY`

---

## public class `org.apache.mina.proxy.handlers.http.HttpProxyRequest`
extends `org.apache.mina.proxy.handlers.ProxyRequest`  

**Constructors:**
- `public HttpProxyRequest(java.lang.String p0)`
- `public HttpProxyRequest(java.lang.String p0, java.lang.String p1)`
- `public HttpProxyRequest(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public HttpProxyRequest(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.Map p3)`
- `public HttpProxyRequest(java.net.InetSocketAddress p0)`
- `public HttpProxyRequest(java.net.InetSocketAddress p0, java.lang.String p1)`
- `public HttpProxyRequest(java.net.InetSocketAddress p0, java.lang.String p1, java.util.Map p2)`

**Methods:**
- `public void checkRequiredProperties(java.lang.String... p0) throws org.apache.mina.proxy.ProxyAuthException`
- `public final java.util.Map getHeaders()`
- `public final synchronized java.lang.String getHost()`
- `public final java.lang.String getHttpURI()`
- `public final java.lang.String getHttpVerb()`
- `public java.lang.String getHttpVersion()`
- `public java.util.Map getProperties()`
- `public final void setHeaders(java.util.Map p0)`
- `public void setHttpVersion(java.lang.String p0)`
- `public void setProperties(java.util.Map p0)`
- `public java.lang.String toHttpString()`

---

## public class `org.apache.mina.proxy.handlers.http.HttpProxyResponse`

**Constructors:**
- `protected HttpProxyResponse(java.lang.String p0, java.lang.String p1, java.util.Map p2)`

**Methods:**
- `public java.lang.String getBody()`
- `public final java.util.Map getHeaders()`
- `public final java.lang.String getHttpVersion()`
- `public final int getStatusCode()`
- `public final java.lang.String getStatusLine()`
- `public void setBody(java.lang.String p0)`

---

## public class `org.apache.mina.proxy.handlers.http.HttpSmartProxyHandler`
extends `org.apache.mina.proxy.handlers.http.AbstractHttpLogicHandler`  

**Constructors:**
- `public HttpSmartProxyHandler(org.apache.mina.proxy.session.ProxyIoSession p0)`

**Methods:**
- `public void doHandshake(org.apache.mina.core.filterchain.IoFilter$NextFilter p0) throws org.apache.mina.proxy.ProxyAuthException`
- `public void handleResponse(org.apache.mina.proxy.handlers.http.HttpProxyResponse p0) throws org.apache.mina.proxy.ProxyAuthException`

---

## public class `org.apache.mina.proxy.handlers.http.basic.HttpBasicAuthLogicHandler`
extends `org.apache.mina.proxy.handlers.http.AbstractAuthLogicHandler`  

**Constructors:**
- `public HttpBasicAuthLogicHandler(org.apache.mina.proxy.session.ProxyIoSession p0) throws org.apache.mina.proxy.ProxyAuthException`

**Methods:**
- `public static java.lang.String createAuthorization(java.lang.String p0, java.lang.String p1)`
- `public void doHandshake(org.apache.mina.core.filterchain.IoFilter$NextFilter p0) throws org.apache.mina.proxy.ProxyAuthException`
- `public void handleResponse(org.apache.mina.proxy.handlers.http.HttpProxyResponse p0) throws org.apache.mina.proxy.ProxyAuthException`

---

## public class `org.apache.mina.proxy.handlers.http.basic.HttpNoAuthLogicHandler`
extends `org.apache.mina.proxy.handlers.http.AbstractAuthLogicHandler`  

**Constructors:**
- `public HttpNoAuthLogicHandler(org.apache.mina.proxy.session.ProxyIoSession p0) throws org.apache.mina.proxy.ProxyAuthException`

**Methods:**
- `public void doHandshake(org.apache.mina.core.filterchain.IoFilter$NextFilter p0) throws org.apache.mina.proxy.ProxyAuthException`
- `public void handleResponse(org.apache.mina.proxy.handlers.http.HttpProxyResponse p0) throws org.apache.mina.proxy.ProxyAuthException`

---

## public class `org.apache.mina.proxy.handlers.http.digest.DigestUtilities`

**Fields:**
- `public final static java.lang.String SESSION_HA1`
- `public final static java.lang.String[] SUPPORTED_QOPS`

**Methods:**
- `public static java.lang.String computeResponseValue(org.apache.mina.core.session.IoSession p0, java.util.Map p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) throws java.io.UnsupportedEncodingException, javax.security.sasl.AuthenticationException`

---

## public class `org.apache.mina.proxy.handlers.http.digest.HttpDigestAuthLogicHandler`
extends `org.apache.mina.proxy.handlers.http.AbstractAuthLogicHandler`  

**Constructors:**
- `public HttpDigestAuthLogicHandler(org.apache.mina.proxy.session.ProxyIoSession p0) throws org.apache.mina.proxy.ProxyAuthException`

**Methods:**
- `public void doHandshake(org.apache.mina.core.filterchain.IoFilter$NextFilter p0) throws org.apache.mina.proxy.ProxyAuthException`
- `public void handleResponse(org.apache.mina.proxy.handlers.http.HttpProxyResponse p0) throws org.apache.mina.proxy.ProxyAuthException`

---

## public class `org.apache.mina.proxy.handlers.http.ntlm.HttpNTLMAuthLogicHandler`
extends `org.apache.mina.proxy.handlers.http.AbstractAuthLogicHandler`  

**Constructors:**
- `public HttpNTLMAuthLogicHandler(org.apache.mina.proxy.session.ProxyIoSession p0) throws org.apache.mina.proxy.ProxyAuthException`

**Methods:**
- `public void doHandshake(org.apache.mina.core.filterchain.IoFilter$NextFilter p0) throws org.apache.mina.proxy.ProxyAuthException`
- `public void handleResponse(org.apache.mina.proxy.handlers.http.HttpProxyResponse p0) throws org.apache.mina.proxy.ProxyAuthException`

---

## public abstract interface `org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants`

**Fields:**
- `public final static int DEFAULT_FLAGS`
- `public final static byte[] DEFAULT_OS_VERSION`
- `public final static int FLAG_NEGOTIATE_128_BIT_ENCRYPTION`
- `public final static int FLAG_NEGOTIATE_56_BIT_ENCRYPTION`
- `public final static int FLAG_NEGOTIATE_ALWAYS_SIGN`
- `public final static int FLAG_NEGOTIATE_ANONYMOUS`
- `public final static int FLAG_NEGOTIATE_DATAGRAM_STYLE`
- `public final static int FLAG_NEGOTIATE_DOMAIN_SUPPLIED`
- `public final static int FLAG_NEGOTIATE_KEY_EXCHANGE`
- `public final static int FLAG_NEGOTIATE_LAN_MANAGER_KEY`
- `public final static int FLAG_NEGOTIATE_LOCAL_CALL`
- `public final static int FLAG_NEGOTIATE_NTLM`
- `public final static int FLAG_NEGOTIATE_NTLM2`
- `public final static int FLAG_NEGOTIATE_OEM`
- `public final static int FLAG_NEGOTIATE_SEAL`
- `public final static int FLAG_NEGOTIATE_SIGN`
- `public final static int FLAG_NEGOTIATE_TARGET_INFO`
- `public final static int FLAG_NEGOTIATE_UNICODE`
- `public final static int FLAG_NEGOTIATE_WORKSTATION_SUPPLIED`
- `public final static int FLAG_REQUEST_SERVER_AUTH_REALM`
- `public final static int FLAG_TARGET_TYPE_DOMAIN`
- `public final static int FLAG_TARGET_TYPE_SERVER`
- `public final static int FLAG_TARGET_TYPE_SHARE`
- `public final static int FLAG_UNIDENTIFIED_1`
- `public final static int FLAG_UNIDENTIFIED_10`
- `public final static int FLAG_UNIDENTIFIED_11`
- `public final static int FLAG_UNIDENTIFIED_2`
- `public final static int FLAG_UNIDENTIFIED_3`
- `public final static int FLAG_UNIDENTIFIED_4`
- `public final static int FLAG_UNIDENTIFIED_5`
- `public final static int FLAG_UNIDENTIFIED_6`
- `public final static int FLAG_UNIDENTIFIED_7`
- `public final static int FLAG_UNIDENTIFIED_8`
- `public final static int FLAG_UNIDENTIFIED_9`
- `public final static int MESSAGE_TYPE_1`
- `public final static int MESSAGE_TYPE_2`
- `public final static int MESSAGE_TYPE_3`
- `public final static byte[] NTLM_SIGNATURE`
- `public final static short TARGET_INFORMATION_SUBBLOCK_DNS_DOMAIN_NAME_TYPE`
- `public final static short TARGET_INFORMATION_SUBBLOCK_DOMAIN_TYPE`
- `public final static short TARGET_INFORMATION_SUBBLOCK_FQDNS_HOSTNAME_TYPE`
- `public final static short TARGET_INFORMATION_SUBBLOCK_PARENT_DNS_DOMAIN_NAME_TYPE`
- `public final static short TARGET_INFORMATION_SUBBLOCK_SERVER_TYPE`
- `public final static short TARGET_INFORMATION_SUBBLOCK_TERMINATOR_TYPE`

---

## public class `org.apache.mina.proxy.handlers.http.ntlm.NTLMResponses`

**Fields:**
- `public final static byte[] LM_HASH_MAGIC_CONSTANT`

**Methods:**
- `public static byte[] getLMResponse(java.lang.String p0, byte[] p1) throws java.lang.Exception`
- `public static byte[] getLMv2Response(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3, byte[] p4) throws java.lang.Exception`
- `public static byte[] getNTLM2SessionResponse(java.lang.String p0, byte[] p1, byte[] p2) throws java.lang.Exception`
- `public static byte[] getNTLMResponse(java.lang.String p0, byte[] p1) throws java.lang.Exception`
- `public static byte[] getNTLMv2Response(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3, byte[] p4, byte[] p5) throws java.lang.Exception`
- `public static byte[] getNTLMv2Response(java.lang.String p0, java.lang.String p1, java.lang.String p2, byte[] p3, byte[] p4, byte[] p5, long p6) throws java.lang.Exception`
- `public static byte[] hmacMD5(byte[] p0, byte[] p1) throws java.lang.Exception`

---

## public class `org.apache.mina.proxy.handlers.http.ntlm.NTLMUtilities`
implements `org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants`  

**Methods:**
- `public final static byte[] createType1Message(java.lang.String p0, java.lang.String p1, java.lang.Integer p2, byte[] p3)`
- `public final static byte[] createType3Message(java.lang.String p0, java.lang.String p1, byte[] p2, java.lang.String p3, java.lang.String p4, java.lang.Integer p5, byte[] p6)`
- `public final static byte[] extractChallengeFromType2Message(byte[] p0)`
- `public final static int extractFlagsFromType2Message(byte[] p0)`
- `public final static byte[] extractTargetInfoFromType2Message(byte[] p0, java.lang.Integer p1)`
- `public final static java.lang.String extractTargetNameFromType2Message(byte[] p0, java.lang.Integer p1) throws java.io.UnsupportedEncodingException`
- `public final static byte[] getOsVersion()`
- `public final static void printTargetInformationBlockFromType2Message(byte[] p0, java.lang.Integer p1, java.io.PrintWriter p2) throws java.io.UnsupportedEncodingException`
- `public final static byte[] readSecurityBufferTarget(byte[] p0, int p1)`
- `public final static void writeOSVersion(byte p0, byte p1, short p2, byte[] p3, int p4)`
- `public final static byte[] writeSecurityBuffer(short p0, int p1)`
- `public final static void writeSecurityBuffer(short p0, short p1, int p2, byte[] p3, int p4)`
- `public final static int writeSecurityBufferAndUpdatePointer(java.io.ByteArrayOutputStream p0, short p1, int p2) throws java.io.IOException`

---

## public abstract class `org.apache.mina.proxy.handlers.socks.AbstractSocksLogicHandler`
extends `org.apache.mina.proxy.AbstractProxyLogicHandler`  

**Constructors:**
- `public AbstractSocksLogicHandler(org.apache.mina.proxy.session.ProxyIoSession p0)`

**Fields:**
- `protected final org.apache.mina.proxy.handlers.socks.SocksProxyRequest request`

---

## public class `org.apache.mina.proxy.handlers.socks.Socks4LogicHandler`
extends `org.apache.mina.proxy.handlers.socks.AbstractSocksLogicHandler`  

**Constructors:**
- `public Socks4LogicHandler(org.apache.mina.proxy.session.ProxyIoSession p0)`

**Methods:**
- `public void doHandshake(org.apache.mina.core.filterchain.IoFilter$NextFilter p0)`
- `protected void handleResponse(org.apache.mina.core.buffer.IoBuffer p0) throws java.lang.Exception`
- `public void messageReceived(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.buffer.IoBuffer p1)`
- `protected void writeRequest(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.proxy.handlers.socks.SocksProxyRequest p1)`

---

## public class `org.apache.mina.proxy.handlers.socks.Socks5LogicHandler`
extends `org.apache.mina.proxy.handlers.socks.AbstractSocksLogicHandler`  

**Constructors:**
- `public Socks5LogicHandler(org.apache.mina.proxy.session.ProxyIoSession p0)`

**Methods:**
- `protected void closeSession(java.lang.String p0)`
- `public synchronized void doHandshake(org.apache.mina.core.filterchain.IoFilter$NextFilter p0)`
- `protected void handleResponse(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.buffer.IoBuffer p1, int p2) throws java.lang.Exception`
- `public synchronized void messageReceived(org.apache.mina.core.filterchain.IoFilter$NextFilter p0, org.apache.mina.core.buffer.IoBuffer p1)`

---

## public class `org.apache.mina.proxy.handlers.socks.SocksProxyConstants`

**Fields:**
- `public final static byte BASIC_AUTH`
- `public final static byte BASIC_AUTH_SUBNEGOTIATION_VERSION`
- `public final static byte DOMAIN_NAME_ADDRESS_TYPE`
- `public final static byte ESTABLISH_TCPIP_BIND`
- `public final static byte ESTABLISH_TCPIP_STREAM`
- `public final static byte ESTABLISH_UDP_ASSOCIATE`
- `public final static byte[] FAKE_IP`
- `public final static byte GSSAPI_AUTH`
- `public final static byte GSSAPI_AUTH_SUBNEGOTIATION_VERSION`
- `public final static byte GSSAPI_MSG_TYPE`
- `public final static byte IPV4_ADDRESS_TYPE`
- `public final static byte IPV6_ADDRESS_TYPE`
- `public final static java.lang.String KERBEROS_V5_OID`
- `public final static java.lang.String MS_KERBEROS_V5_OID`
- `public final static byte NO_ACCEPTABLE_AUTH_METHOD`
- `public final static byte NO_AUTH`
- `public final static java.lang.String NTLMSSP_OID`
- `public final static int SOCKS5_AUTH_STEP`
- `public final static int SOCKS5_GREETING_STEP`
- `public final static int SOCKS5_REQUEST_STEP`
- `public final static int SOCKS_4_RESPONSE_SIZE`
- `public final static byte SOCKS_VERSION_4`
- `public final static byte SOCKS_VERSION_5`
- `public final static byte[] SUPPORTED_AUTH_METHODS`
- `public final static byte TERMINATOR`
- `public final static byte V4_REPLY_REQUEST_FAILED_ID_NOT_CONFIRMED`
- `public final static byte V4_REPLY_REQUEST_FAILED_NO_IDENTD`
- `public final static byte V4_REPLY_REQUEST_GRANTED`
- `public final static byte V4_REPLY_REQUEST_REJECTED_OR_FAILED`
- `public final static byte V5_REPLY_ADDRESS_TYPE_NOT_SUPPORTED`
- `public final static byte V5_REPLY_COMMAND_NOT_SUPPORTED`
- `public final static byte V5_REPLY_CONNECTION_REFUSED`
- `public final static byte V5_REPLY_GENERAL_FAILURE`
- `public final static byte V5_REPLY_HOST_UNREACHABLE`
- `public final static byte V5_REPLY_NETWORK_UNREACHABLE`
- `public final static byte V5_REPLY_NOT_ALLOWED`
- `public final static byte V5_REPLY_SUCCEEDED`
- `public final static byte V5_REPLY_TTL_EXPIRED`

**Methods:**
- `public final static java.lang.String getReplyCodeAsString(byte p0)`

---

## public class `org.apache.mina.proxy.handlers.socks.SocksProxyRequest`
extends `org.apache.mina.proxy.handlers.ProxyRequest`  

**Constructors:**
- `public SocksProxyRequest(byte p0, byte p1, java.net.InetSocketAddress p2, java.lang.String p3)`
- `public SocksProxyRequest(byte p0, java.lang.String p1, int p2, java.lang.String p3)`

**Methods:**
- `public byte getCommandCode()`
- `public final synchronized java.lang.String getHost()`
- `public byte[] getIpAddress()`
- `public java.lang.String getPassword()`
- `public byte[] getPort()`
- `public byte getProtocolVersion()`
- `public java.lang.String getServiceKerberosName()`
- `public java.lang.String getUserName()`
- `public void setPassword(java.lang.String p0)`
- `public void setServiceKerberosName(java.lang.String p0)`

---

## public class `org.apache.mina.proxy.session.ProxyIoSession`

**Constructors:**
- `public ProxyIoSession(java.net.InetSocketAddress p0, org.apache.mina.proxy.handlers.ProxyRequest p1)`

**Fields:**
- `public final static java.lang.String PROXY_SESSION`

**Methods:**
- `public java.nio.charset.Charset getCharset()`
- `public java.lang.String getCharsetName()`
- `public org.apache.mina.proxy.ProxyConnector getConnector()`
- `public org.apache.mina.proxy.event.IoSessionEventQueue getEventQueue()`
- `public org.apache.mina.proxy.ProxyLogicHandler getHandler()`
- `public java.util.List getPreferedOrder()`
- `public java.net.InetSocketAddress getProxyAddress()`
- `public org.apache.mina.proxy.filter.ProxyFilter getProxyFilter()`
- `public org.apache.mina.proxy.handlers.ProxyRequest getRequest()`
- `public org.apache.mina.core.session.IoSession getSession()`
- `public boolean isAuthenticationFailed()`
- `public boolean isReconnectionNeeded()`
- `public void setAuthenticationFailed(boolean p0)`
- `public void setCharsetName(java.lang.String p0)`
- `public void setConnector(org.apache.mina.proxy.ProxyConnector p0)`
- `public void setHandler(org.apache.mina.proxy.ProxyLogicHandler p0)`
- `public void setPreferedOrder(java.util.List p0)`
- `public void setProxyFilter(org.apache.mina.proxy.filter.ProxyFilter p0)`
- `public void setReconnectionNeeded(boolean p0)`
- `public void setSession(org.apache.mina.core.session.IoSession p0)`

---

## public class `org.apache.mina.proxy.session.ProxyIoSessionInitializer`<T extends org.apache.mina.core.future.ConnectFuture>
implements `org.apache.mina.core.session.IoSessionInitializer<T>`  

**Constructors:**
- `public ProxyIoSessionInitializer(org.apache.mina.core.session.IoSessionInitializer p0, org.apache.mina.proxy.session.ProxyIoSession p1)`

**Methods:**
- `public org.apache.mina.proxy.session.ProxyIoSession getProxySession()`
- `public void initializeSession(org.apache.mina.core.session.IoSession p0, T p1)`

---

## public class `org.apache.mina.proxy.utils.ByteUtilities`

**Methods:**
- `public static byte[] asByteArray(java.lang.String p0)`
- `public static java.lang.String asHex(byte[] p0)`
- `public static java.lang.String asHex(byte[] p0, java.lang.String p1)`
- `public final static void changeByteEndianess(byte[] p0, int p1, int p2)`
- `public final static void changeWordEndianess(byte[] p0, int p1, int p2)`
- `public final static byte[] encodeString(java.lang.String p0, boolean p1) throws java.io.UnsupportedEncodingException`
- `public final static byte[] getOEMStringAsByteArray(java.lang.String p0) throws java.io.UnsupportedEncodingException`
- `public final static byte[] getUTFStringAsByteArray(java.lang.String p0) throws java.io.UnsupportedEncodingException`
- `public static void intToNetworkByteOrder(int p0, byte[] p1, int p2, int p3)`
- `public static byte[] intToNetworkByteOrder(int p0, int p1)`
- `public final static boolean isFlagSet(int p0, int p1)`
- `public final static int makeIntFromByte2(byte[] p0)`
- `public final static int makeIntFromByte2(byte[] p0, int p1)`
- `public final static int makeIntFromByte4(byte[] p0)`
- `public final static int makeIntFromByte4(byte[] p0, int p1)`
- `public static int networkByteOrderToInt(byte[] p0, int p1, int p2)`
- `public final static byte[] writeInt(int p0)`
- `public final static byte[] writeInt(int p0, byte[] p1, int p2)`
- `public final static byte[] writeShort(short p0)`
- `public final static byte[] writeShort(short p0, byte[] p1, int p2)`

---

## public class `org.apache.mina.proxy.utils.IoBufferDecoder`

**Constructors:**
- `public IoBufferDecoder(byte[] p0)`
- `public IoBufferDecoder(int p0)`

**Methods:**
- `public org.apache.mina.core.buffer.IoBuffer decodeFully(org.apache.mina.core.buffer.IoBuffer p0)`
- `public void setContentLength(int p0, boolean p1)`
- `public void setDelimiter(byte[] p0, boolean p1)`

---

## public class `org.apache.mina.proxy.utils.IoBufferDecoder$DecodingContext`

**Constructors:**
- `public DecodingContext()`

**Methods:**
- `public int getContentLength()`
- `public org.apache.mina.core.buffer.IoBuffer getDecodedBuffer()`
- `public org.apache.mina.core.buffer.IoBuffer getDelimiter()`
- `public int getMatchCount()`
- `public void reset()`
- `public void setContentLength(int p0)`
- `public void setDecodedBuffer(org.apache.mina.core.buffer.IoBuffer p0)`
- `public void setDelimiter(org.apache.mina.core.buffer.IoBuffer p0)`
- `public void setMatchCount(int p0)`

---

## public class `org.apache.mina.proxy.utils.StringUtilities`

**Methods:**
- `public static void addValueToHeader(java.util.Map p0, java.lang.String p1, java.lang.String p2, boolean p3)`
- `public static void copyDirective(java.util.Map p0, java.lang.StringBuilder p1, java.lang.String p2)`
- `public static java.lang.String copyDirective(java.util.Map p0, java.util.Map p1, java.lang.String p2)`
- `public static java.lang.String getDirectiveValue(java.util.Map p0, java.lang.String p1, boolean p2) throws javax.security.sasl.AuthenticationException`
- `public static java.lang.String getSingleValuedHeader(java.util.Map p0, java.lang.String p1)`
- `public static boolean isLws(byte p0)`
- `public static java.util.Map parseDirectives(byte[] p0) throws javax.security.sasl.SaslException`
- `public static java.lang.String stringTo8859_1(java.lang.String p0) throws java.io.UnsupportedEncodingException`

---

## public abstract class `org.apache.mina.transport.socket.AbstractDatagramSessionConfig`
extends `org.apache.mina.core.session.AbstractIoSessionConfig`  
implements `org.apache.mina.transport.socket.DatagramSessionConfig`  

**Constructors:**
- `public AbstractDatagramSessionConfig()`

**Methods:**
- `protected boolean isBroadcastChanged()`
- `public boolean isCloseOnPortUnreachable()`
- `protected boolean isReceiveBufferSizeChanged()`
- `protected boolean isReuseAddressChanged()`
- `protected boolean isSendBufferSizeChanged()`
- `protected boolean isTrafficClassChanged()`
- `public void setAll(org.apache.mina.core.session.IoSessionConfig p0)`
- `public void setCloseOnPortUnreachable(boolean p0)`

---

## public abstract class `org.apache.mina.transport.socket.AbstractSocketSessionConfig`
extends `org.apache.mina.core.session.AbstractIoSessionConfig`  
implements `org.apache.mina.transport.socket.SocketSessionConfig`  

**Constructors:**
- `public AbstractSocketSessionConfig()`

**Methods:**
- `protected boolean isKeepAliveChanged()`
- `protected boolean isOobInlineChanged()`
- `protected boolean isReceiveBufferSizeChanged()`
- `protected boolean isReuseAddressChanged()`
- `protected boolean isSendBufferSizeChanged()`
- `protected boolean isSoLingerChanged()`
- `protected boolean isTcpNoDelayChanged()`
- `protected boolean isTrafficClassChanged()`
- `public void setAll(org.apache.mina.core.session.IoSessionConfig p0)`

---

## public abstract interface `org.apache.mina.transport.socket.DatagramAcceptor`
implements `org.apache.mina.core.service.IoAcceptor`  

**Methods:**
- `public abstract java.net.InetSocketAddress getDefaultLocalAddress()`
- `public abstract java.net.InetSocketAddress getLocalAddress()`
- `public abstract org.apache.mina.transport.socket.DatagramSessionConfig getSessionConfig()`
- `public abstract org.apache.mina.core.session.IoSessionRecycler getSessionRecycler()`
- `public abstract void setDefaultLocalAddress(java.net.InetSocketAddress p0)`
- `public abstract void setSessionRecycler(org.apache.mina.core.session.IoSessionRecycler p0)`

---

## public abstract interface `org.apache.mina.transport.socket.DatagramConnector`
implements `org.apache.mina.core.service.IoConnector`  

**Methods:**
- `public abstract java.net.InetSocketAddress getDefaultRemoteAddress()`
- `public abstract org.apache.mina.transport.socket.DatagramSessionConfig getSessionConfig()`
- `public abstract void setDefaultRemoteAddress(java.net.InetSocketAddress p0)`

---

## public abstract interface `org.apache.mina.transport.socket.DatagramSessionConfig`
implements `org.apache.mina.core.session.IoSessionConfig`  

**Methods:**
- `public abstract int getReceiveBufferSize()`
- `public abstract int getSendBufferSize()`
- `public abstract int getTrafficClass()`
- `public abstract boolean isBroadcast()`
- `public abstract boolean isCloseOnPortUnreachable()`
- `public abstract boolean isReuseAddress()`
- `public abstract void setBroadcast(boolean p0)`
- `public abstract void setCloseOnPortUnreachable(boolean p0)`
- `public abstract void setReceiveBufferSize(int p0)`
- `public abstract void setReuseAddress(boolean p0)`
- `public abstract void setSendBufferSize(int p0)`
- `public abstract void setTrafficClass(int p0)`

---

## public class `org.apache.mina.transport.socket.DefaultDatagramSessionConfig`
extends `org.apache.mina.transport.socket.AbstractDatagramSessionConfig`  

**Constructors:**
- `public DefaultDatagramSessionConfig()`

**Methods:**
- `public int getReceiveBufferSize()`
- `public int getSendBufferSize()`
- `public int getTrafficClass()`
- `public boolean isBroadcast()`
- `protected boolean isBroadcastChanged()`
- `protected boolean isReceiveBufferSizeChanged()`
- `public boolean isReuseAddress()`
- `protected boolean isReuseAddressChanged()`
- `protected boolean isSendBufferSizeChanged()`
- `protected boolean isTrafficClassChanged()`
- `public void setBroadcast(boolean p0)`
- `public void setReceiveBufferSize(int p0)`
- `public void setReuseAddress(boolean p0)`
- `public void setSendBufferSize(int p0)`
- `public void setTrafficClass(int p0)`

---

## public class `org.apache.mina.transport.socket.DefaultSocketSessionConfig`
extends `org.apache.mina.transport.socket.AbstractSocketSessionConfig`  

**Constructors:**
- `public DefaultSocketSessionConfig()`

**Fields:**
- `protected org.apache.mina.core.service.IoService parent`

**Methods:**
- `public int getReceiveBufferSize()`
- `public int getSendBufferSize()`
- `public int getSoLinger()`
- `public int getTrafficClass()`
- `public void init(org.apache.mina.core.service.IoService p0)`
- `public boolean isKeepAlive()`
- `protected boolean isKeepAliveChanged()`
- `public boolean isOobInline()`
- `protected boolean isOobInlineChanged()`
- `protected boolean isReceiveBufferSizeChanged()`
- `public boolean isReuseAddress()`
- `protected boolean isReuseAddressChanged()`
- `protected boolean isSendBufferSizeChanged()`
- `protected boolean isSoLingerChanged()`
- `public boolean isTcpNoDelay()`
- `protected boolean isTcpNoDelayChanged()`
- `protected boolean isTrafficClassChanged()`
- `public void setKeepAlive(boolean p0)`
- `public void setOobInline(boolean p0)`
- `public void setReceiveBufferSize(int p0)`
- `public void setReuseAddress(boolean p0)`
- `public void setSendBufferSize(int p0)`
- `public void setSoLinger(int p0)`
- `public void setTcpNoDelay(boolean p0)`
- `public void setTrafficClass(int p0)`

---

## public abstract interface `org.apache.mina.transport.socket.SocketAcceptor`
implements `org.apache.mina.core.service.IoAcceptor`  

**Methods:**
- `public abstract int getBacklog()`
- `public abstract java.net.InetSocketAddress getDefaultLocalAddress()`
- `public abstract java.net.InetSocketAddress getLocalAddress()`
- `public abstract org.apache.mina.transport.socket.SocketSessionConfig getSessionConfig()`
- `public abstract boolean isReuseAddress()`
- `public abstract void setBacklog(int p0)`
- `public abstract void setDefaultLocalAddress(java.net.InetSocketAddress p0)`
- `public abstract void setReuseAddress(boolean p0)`

---

## public abstract interface `org.apache.mina.transport.socket.SocketConnector`
implements `org.apache.mina.core.service.IoConnector`  

**Methods:**
- `public abstract java.net.InetSocketAddress getDefaultRemoteAddress()`
- `public abstract org.apache.mina.transport.socket.SocketSessionConfig getSessionConfig()`
- `public abstract void setDefaultRemoteAddress(java.net.InetSocketAddress p0)`

---

## public abstract interface `org.apache.mina.transport.socket.SocketSessionConfig`
implements `org.apache.mina.core.session.IoSessionConfig`  

**Methods:**
- `public abstract int getReceiveBufferSize()`
- `public abstract int getSendBufferSize()`
- `public abstract int getSoLinger()`
- `public abstract int getTrafficClass()`
- `public abstract boolean isKeepAlive()`
- `public abstract boolean isOobInline()`
- `public abstract boolean isReuseAddress()`
- `public abstract boolean isTcpNoDelay()`
- `public abstract void setKeepAlive(boolean p0)`
- `public abstract void setOobInline(boolean p0)`
- `public abstract void setReceiveBufferSize(int p0)`
- `public abstract void setReuseAddress(boolean p0)`
- `public abstract void setSendBufferSize(int p0)`
- `public abstract void setSoLinger(int p0)`
- `public abstract void setTcpNoDelay(boolean p0)`
- `public abstract void setTrafficClass(int p0)`

---

## public final class `org.apache.mina.transport.socket.nio.NioDatagramAcceptor`
extends `org.apache.mina.core.service.AbstractIoAcceptor`  
implements `org.apache.mina.core.service.IoProcessor<org.apache.mina.transport.socket.nio.NioSession>`, `org.apache.mina.transport.socket.DatagramAcceptor`  

**Constructors:**
- `public NioDatagramAcceptor()`
- `public NioDatagramAcceptor(java.util.concurrent.Executor p0)`

**Methods:**
- `public void add(org.apache.mina.transport.socket.nio.NioSession p0)`
- `public void flush(org.apache.mina.transport.socket.nio.NioSession p0)`
- `public java.net.InetSocketAddress getDefaultLocalAddress()`
- `public java.net.InetSocketAddress getLocalAddress()`
- `public org.apache.mina.transport.socket.DatagramSessionConfig getSessionConfig()`
- `public final org.apache.mina.core.session.IoSessionRecycler getSessionRecycler()`
- `public org.apache.mina.core.service.TransportMetadata getTransportMetadata()`
- `public final org.apache.mina.core.session.IoSession newSession(java.net.SocketAddress p0, java.net.SocketAddress p1)`
- `public void remove(org.apache.mina.transport.socket.nio.NioSession p0)`
- `public void setDefaultLocalAddress(java.net.InetSocketAddress p0)`
- `public final void setSessionRecycler(org.apache.mina.core.session.IoSessionRecycler p0)`
- `public void updateTrafficControl(org.apache.mina.transport.socket.nio.NioSession p0)`
- `public void write(org.apache.mina.transport.socket.nio.NioSession p0, org.apache.mina.core.write.WriteRequest p1)`

---

## public final class `org.apache.mina.transport.socket.nio.NioDatagramConnector`
extends `org.apache.mina.core.polling.AbstractPollingIoConnector`  
implements `org.apache.mina.transport.socket.DatagramConnector`  

**Constructors:**
- `public NioDatagramConnector()`
- `public NioDatagramConnector(int p0)`
- `public NioDatagramConnector(java.lang.Class p0)`
- `public NioDatagramConnector(java.lang.Class p0, int p1)`
- `public NioDatagramConnector(org.apache.mina.core.service.IoProcessor p0)`

**Methods:**
- `public java.net.InetSocketAddress getDefaultRemoteAddress()`
- `public org.apache.mina.transport.socket.DatagramSessionConfig getSessionConfig()`
- `public org.apache.mina.core.service.TransportMetadata getTransportMetadata()`
- `public void setDefaultRemoteAddress(java.net.InetSocketAddress p0)`

---

## public class `org.apache.mina.transport.socket.nio.NioProcessor`
extends `org.apache.mina.core.polling.AbstractPollingIoProcessor`  

**Constructors:**
- `public NioProcessor(java.util.concurrent.Executor p0)`
- `public NioProcessor(java.util.concurrent.Executor p0, java.nio.channels.spi.SelectorProvider p1)`

**Fields:**
- `protected java.nio.channels.Selector selector`
- `protected java.util.concurrent.locks.ReadWriteLock selectorLock`
- `protected java.nio.channels.spi.SelectorProvider selectorProvider`

**Methods:**
- `protected java.util.Iterator allSessions()`
- `protected int allSessionsCount()`
- `protected void destroy(org.apache.mina.transport.socket.nio.NioSession p0) throws java.lang.Exception`
- `protected void doDispose() throws java.lang.Exception`
- `protected org.apache.mina.core.session.SessionState getState(org.apache.mina.transport.socket.nio.NioSession p0)`
- `protected void init(org.apache.mina.transport.socket.nio.NioSession p0) throws java.lang.Exception`
- `protected boolean isBrokenConnection() throws java.io.IOException`
- `protected boolean isInterestedInRead(org.apache.mina.transport.socket.nio.NioSession p0)`
- `protected boolean isInterestedInWrite(org.apache.mina.transport.socket.nio.NioSession p0)`
- `protected boolean isReadable(org.apache.mina.transport.socket.nio.NioSession p0)`
- `protected boolean isSelectorEmpty()`
- `protected boolean isWritable(org.apache.mina.transport.socket.nio.NioSession p0)`
- `protected int read(org.apache.mina.transport.socket.nio.NioSession p0, org.apache.mina.core.buffer.IoBuffer p1) throws java.lang.Exception`
- `protected void registerNewSelector() throws java.io.IOException`
- `protected int select() throws java.lang.Exception`
- `protected int select(long p0) throws java.lang.Exception`
- `protected java.util.Iterator selectedSessions()`
- `protected void setInterestedInRead(org.apache.mina.transport.socket.nio.NioSession p0, boolean p1) throws java.lang.Exception`
- `protected void setInterestedInWrite(org.apache.mina.transport.socket.nio.NioSession p0, boolean p1) throws java.lang.Exception`
- `protected int transferFile(org.apache.mina.transport.socket.nio.NioSession p0, org.apache.mina.core.file.FileRegion p1, int p2) throws java.lang.Exception`
- `protected void wakeup()`
- `protected int write(org.apache.mina.transport.socket.nio.NioSession p0, org.apache.mina.core.buffer.IoBuffer p1, int p2) throws java.io.IOException`

---

## protected static class `org.apache.mina.transport.socket.nio.NioProcessor$IoSessionIterator`<NioSession extends java.lang.Object>
implements `java.util.Iterator<NioSession>`  

**Methods:**
- `public boolean hasNext()`
- `public NioSession next()`
- `public void remove()`

---

## public abstract class `org.apache.mina.transport.socket.nio.NioSession`
extends `org.apache.mina.core.session.AbstractIoSession`  

**Constructors:**
- `protected NioSession(org.apache.mina.core.service.IoProcessor p0, org.apache.mina.core.service.IoService p1, java.nio.channels.Channel p2)`

**Fields:**
- `protected final java.nio.channels.Channel channel`
- `protected final org.apache.mina.core.service.IoProcessor processor`

**Methods:**
- `public org.apache.mina.core.filterchain.IoFilterChain getFilterChain()`
- `public org.apache.mina.core.service.IoProcessor getProcessor()`
- `public final boolean isActive()`

---

## public class `org.apache.mina.transport.socket.nio.NioSocketAcceptor`
extends `org.apache.mina.core.polling.AbstractPollingIoAcceptor`  
implements `org.apache.mina.transport.socket.SocketAcceptor`  

**Constructors:**
- `public NioSocketAcceptor()`
- `public NioSocketAcceptor(int p0)`
- `public NioSocketAcceptor(int p0, java.nio.channels.spi.SelectorProvider p1)`
- `public NioSocketAcceptor(java.util.concurrent.Executor p0, org.apache.mina.core.service.IoProcessor p1)`
- `public NioSocketAcceptor(org.apache.mina.core.service.IoProcessor p0)`

**Fields:**
- `protected volatile java.nio.channels.Selector selector`
- `protected volatile java.nio.channels.spi.SelectorProvider selectorProvider`

**Methods:**
- `protected org.apache.mina.transport.socket.nio.NioSession accept(org.apache.mina.core.service.IoProcessor p0, java.nio.channels.ServerSocketChannel p1) throws java.lang.Exception`
- `protected void close(java.nio.channels.ServerSocketChannel p0) throws java.lang.Exception`
- `protected void destroy() throws java.lang.Exception`
- `public java.net.InetSocketAddress getDefaultLocalAddress()`
- `public java.net.InetSocketAddress getLocalAddress()`
- `public org.apache.mina.core.service.TransportMetadata getTransportMetadata()`
- `protected void init() throws java.lang.Exception`
- `protected void init(java.nio.channels.spi.SelectorProvider p0) throws java.lang.Exception`
- `protected java.net.SocketAddress localAddress(java.nio.channels.ServerSocketChannel p0) throws java.lang.Exception`
- `protected java.nio.channels.ServerSocketChannel open(java.net.SocketAddress p0) throws java.lang.Exception`
- `protected int select() throws java.lang.Exception`
- `protected java.util.Iterator selectedHandles()`
- `public void setDefaultLocalAddress(java.net.InetSocketAddress p0)`
- `protected void wakeup()`

---

## public final class `org.apache.mina.transport.socket.nio.NioSocketConnector`
extends `org.apache.mina.core.polling.AbstractPollingIoConnector`  
implements `org.apache.mina.transport.socket.SocketConnector`  

**Constructors:**
- `public NioSocketConnector()`
- `public NioSocketConnector(int p0)`
- `public NioSocketConnector(java.lang.Class p0)`
- `public NioSocketConnector(java.lang.Class p0, int p1)`
- `public NioSocketConnector(java.util.concurrent.Executor p0, org.apache.mina.core.service.IoProcessor p1)`
- `public NioSocketConnector(org.apache.mina.core.service.IoProcessor p0)`

**Methods:**
- `public java.net.InetSocketAddress getDefaultRemoteAddress()`
- `public org.apache.mina.transport.socket.SocketSessionConfig getSessionConfig()`
- `public org.apache.mina.core.service.TransportMetadata getTransportMetadata()`
- `public void setDefaultRemoteAddress(java.net.InetSocketAddress p0)`

---

## public final class `org.apache.mina.transport.vmpipe.VmPipeAcceptor`
extends `org.apache.mina.core.service.AbstractIoAcceptor`  

**Constructors:**
- `public VmPipeAcceptor()`
- `public VmPipeAcceptor(java.util.concurrent.Executor p0)`

**Methods:**
- `public org.apache.mina.transport.vmpipe.VmPipeAddress getDefaultLocalAddress()`
- `public org.apache.mina.transport.vmpipe.VmPipeAddress getLocalAddress()`
- `public org.apache.mina.transport.vmpipe.VmPipeSessionConfig getSessionConfig()`
- `public org.apache.mina.core.service.TransportMetadata getTransportMetadata()`
- `public org.apache.mina.core.session.IoSession newSession(java.net.SocketAddress p0, java.net.SocketAddress p1)`
- `public void setDefaultLocalAddress(org.apache.mina.transport.vmpipe.VmPipeAddress p0)`

---

## public class `org.apache.mina.transport.vmpipe.VmPipeAddress`
extends `java.net.SocketAddress`  
implements `java.lang.Comparable<org.apache.mina.transport.vmpipe.VmPipeAddress>`  

**Constructors:**
- `public VmPipeAddress(int p0)`

**Methods:**
- `public int compareTo(org.apache.mina.transport.vmpipe.VmPipeAddress p0)`
- `public boolean equals(java.lang.Object p0)`
- `public int getPort()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public final class `org.apache.mina.transport.vmpipe.VmPipeConnector`
extends `org.apache.mina.core.service.AbstractIoConnector`  

**Constructors:**
- `public VmPipeConnector()`
- `public VmPipeConnector(java.util.concurrent.Executor p0)`

**Methods:**
- `public org.apache.mina.transport.vmpipe.VmPipeSessionConfig getSessionConfig()`
- `public org.apache.mina.core.service.TransportMetadata getTransportMetadata()`

---

## public abstract interface `org.apache.mina.transport.vmpipe.VmPipeSessionConfig`
implements `org.apache.mina.core.session.IoSessionConfig`  

---

## public class `org.apache.mina.util.AvailablePortFinder`

**Fields:**
- `public final static int MAX_PORT_NUMBER`
- `public final static int MIN_PORT_NUMBER`

**Methods:**
- `public static boolean available(int p0)`
- `public static java.util.Set getAvailablePorts()`
- `public static java.util.Set getAvailablePorts(int p0, int p1)`
- `public static int getNextAvailable()`
- `public static int getNextAvailable(int p0)`

---

## public class `org.apache.mina.util.Base64`

**Constructors:**
- `public Base64()`

**Methods:**
- `public byte[] decode(byte[] p0)`
- `public java.lang.Object decode(java.lang.Object p0)`
- `public static byte[] decodeBase64(byte[] p0)`
- `public byte[] encode(byte[] p0)`
- `public java.lang.Object encode(java.lang.Object p0)`
- `public static byte[] encodeBase64(byte[] p0)`
- `public static byte[] encodeBase64(byte[] p0, boolean p1)`
- `public static byte[] encodeBase64Chunked(byte[] p0)`
- `public static boolean isArrayByteBase64(byte[] p0)`

---

## public class `org.apache.mina.util.BasicThreadFactory`
implements `java.util.concurrent.ThreadFactory`  

**Constructors:**
- `public BasicThreadFactory(java.lang.String p0)`
- `public BasicThreadFactory(java.lang.String p0, boolean p1)`
- `public BasicThreadFactory(java.lang.String p0, boolean p1, int p2)`

**Fields:**
- `public final java.util.concurrent.atomic.AtomicInteger count`
- `public final boolean deamon`
- `public final java.lang.String name`
- `public final int priority`

**Methods:**
- `public java.lang.Thread newThread(java.lang.Runnable p0)`

---

## public class `org.apache.mina.util.CircularQueue`<E extends java.lang.Object>
extends `java.util.AbstractList`  
implements `java.io.Serializable`, `java.util.Queue<E>`  

**Constructors:**
- `public CircularQueue()`
- `public CircularQueue(int p0)`

**Methods:**
- `public boolean add(E p0)`
- `public void add(int p0, E p1)`
- `public int capacity()`
- `public void clear()`
- `public E element()`
- `public E get(int p0)`
- `public boolean isEmpty()`
- `public boolean offer(E p0)`
- `public E peek()`
- `public E poll()`
- `public E remove()`
- `public E remove(int p0)`
- `public E set(int p0, E p1)`
- `public int size()`
- `public java.lang.String toString()`

---

## public class `org.apache.mina.util.ConcurrentHashSet`<E extends java.lang.Object>
extends `org.apache.mina.util.MapBackedSet`  

**Constructors:**
- `public ConcurrentHashSet()`
- `public ConcurrentHashSet(java.util.Collection p0)`

**Methods:**
- `public boolean add(E p0)`

---

## public class `org.apache.mina.util.CopyOnWriteMap`<K extends java.lang.Object, V extends java.lang.Object>
implements `java.lang.Cloneable`, `java.util.Map<K,V>`  

**Constructors:**
- `public CopyOnWriteMap()`
- `public CopyOnWriteMap(int p0)`
- `public CopyOnWriteMap(java.util.Map p0)`

**Methods:**
- `public void clear()`
- `public java.lang.Object clone()`
- `public boolean containsKey(java.lang.Object p0)`
- `public boolean containsValue(java.lang.Object p0)`
- `public java.util.Set entrySet()`
- `public V get(java.lang.Object p0)`
- `public boolean isEmpty()`
- `public java.util.Set keySet()`
- `public V put(K p0, V p1)`
- `public void putAll(java.util.Map p0)`
- `public V remove(java.lang.Object p0)`
- `public int size()`
- `public java.util.Collection values()`

---

## public class `org.apache.mina.util.DaemonThreadFactory`
implements `java.util.concurrent.ThreadFactory`  

**Constructors:**
- `public DaemonThreadFactory()`

**Methods:**
- `public java.lang.Thread newThread(java.lang.Runnable p0)`

---

## public class `org.apache.mina.util.DefaultExceptionMonitor`
extends `org.apache.mina.util.ExceptionMonitor`  

**Constructors:**
- `public DefaultExceptionMonitor()`

**Methods:**
- `public void exceptionCaught(java.lang.Throwable p0)`

---

## public abstract class `org.apache.mina.util.ExceptionMonitor`

**Constructors:**
- `public ExceptionMonitor()`

**Methods:**
- `public abstract void exceptionCaught(java.lang.Throwable p0)`
- `public static org.apache.mina.util.ExceptionMonitor getInstance()`
- `public static void setInstance(org.apache.mina.util.ExceptionMonitor p0)`

---

## public abstract interface `org.apache.mina.util.ExpirationListener`<E extends java.lang.Object>

**Methods:**
- `public abstract void expired(E p0)`

---

## public class `org.apache.mina.util.ExpiringMap`<K extends java.lang.Object, V extends java.lang.Object>
implements `java.util.Map<K,V>`  

**Constructors:**
- `public ExpiringMap()`
- `public ExpiringMap(int p0)`
- `public ExpiringMap(int p0, int p1)`

**Fields:**
- `public final static int DEFAULT_EXPIRATION_INTERVAL`
- `public final static int DEFAULT_TIME_TO_LIVE`

**Methods:**
- `public void addExpirationListener(org.apache.mina.util.ExpirationListener p0)`
- `public void clear()`
- `public boolean containsKey(java.lang.Object p0)`
- `public boolean containsValue(java.lang.Object p0)`
- `public java.util.Set entrySet()`
- `public boolean equals(java.lang.Object p0)`
- `public V get(java.lang.Object p0)`
- `public int getExpirationInterval()`
- `public org.apache.mina.util.ExpiringMap$Expirer getExpirer()`
- `public int getTimeToLive()`
- `public int hashCode()`
- `public boolean isEmpty()`
- `public java.util.Set keySet()`
- `public V put(K p0, V p1)`
- `public void putAll(java.util.Map p0)`
- `public V remove(java.lang.Object p0)`
- `public void removeExpirationListener(org.apache.mina.util.ExpirationListener p0)`
- `public void setExpirationInterval(int p0)`
- `public void setTimeToLive(int p0)`
- `public int size()`
- `public java.util.Collection values()`

---

## public class `org.apache.mina.util.ExpiringMap$Expirer`
implements `java.lang.Runnable`  

**Constructors:**
- `public Expirer()`

**Methods:**
- `public int getExpirationInterval()`
- `public int getTimeToLive()`
- `public boolean isRunning()`
- `public void run()`
- `public void setExpirationInterval(long p0)`
- `public void setTimeToLive(long p0)`
- `public void startExpiring()`
- `public void startExpiringIfNotStarted()`
- `public void stopExpiring()`

---

## public class `org.apache.mina.util.IdentityHashSet`<E extends java.lang.Object>
extends `org.apache.mina.util.MapBackedSet`  

**Constructors:**
- `public IdentityHashSet()`
- `public IdentityHashSet(int p0)`
- `public IdentityHashSet(java.util.Collection p0)`

---

## public class `org.apache.mina.util.LazyInitializedCacheMap`<K extends java.lang.Object, V extends java.lang.Object>
implements `java.util.Map<K,V>`  

**Constructors:**
- `public LazyInitializedCacheMap()`
- `public LazyInitializedCacheMap(java.util.concurrent.ConcurrentHashMap p0)`

**Methods:**
- `public void clear()`
- `public boolean containsKey(java.lang.Object p0)`
- `public boolean containsValue(java.lang.Object p0)`
- `public java.util.Set entrySet()`
- `public V get(java.lang.Object p0)`
- `public java.util.Collection getValues()`
- `public boolean isEmpty()`
- `public java.util.Set keySet()`
- `public V put(K p0, V p1)`
- `public void putAll(java.util.Map p0)`
- `public V putIfAbsent(K p0, org.apache.mina.util.LazyInitializer p1)`
- `public V remove(java.lang.Object p0)`
- `public int size()`
- `public java.util.Collection values()`

---

## public class `org.apache.mina.util.LazyInitializedCacheMap$NoopInitializer`
extends `org.apache.mina.util.LazyInitializer`  

**Constructors:**
- `public NoopInitializer(V p0)`

**Methods:**
- `public V init()`

---

## public abstract class `org.apache.mina.util.LazyInitializer`<V extends java.lang.Object>

**Constructors:**
- `public LazyInitializer()`

**Methods:**
- `public V get()`
- `public abstract V init()`

---

## public class `org.apache.mina.util.Log4jXmlFormatter`
extends `java.util.logging.Formatter`  

**Constructors:**
- `public Log4jXmlFormatter()`

**Methods:**
- `public java.lang.String format(java.util.logging.LogRecord p0)`
- `public boolean getLocationInfo()`
- `public boolean getProperties()`
- `public void setLocationInfo(boolean p0)`
- `public void setProperties(boolean p0)`

---

## public class `org.apache.mina.util.MapBackedSet`<E extends java.lang.Object>
extends `java.util.AbstractSet`  
implements `java.io.Serializable`  

**Constructors:**
- `public MapBackedSet(java.util.Map p0)`
- `public MapBackedSet(java.util.Map p0, java.util.Collection p1)`

**Fields:**
- `protected final java.util.Map map`

**Methods:**
- `public boolean add(E p0)`
- `public void clear()`
- `public boolean contains(java.lang.Object p0)`
- `public java.util.Iterator iterator()`
- `public boolean remove(java.lang.Object p0)`
- `public int size()`

---

## public class `org.apache.mina.util.NamePreservingRunnable`
implements `java.lang.Runnable`  

**Constructors:**
- `public NamePreservingRunnable(java.lang.Runnable p0, java.lang.String p1)`

**Methods:**
- `public void run()`

---

## public class `org.apache.mina.util.StackInspector`
extends `java.lang.RuntimeException`  

**Methods:**
- `public final static java.lang.StackTraceElement callee()`
- `public final static org.apache.mina.util.StackInspector get()`
- `public final static org.apache.mina.util.StackInspector get(java.lang.String p0)`
- `public final static org.apache.mina.util.StackInspector get(java.lang.Throwable p0)`

---

## public class `org.apache.mina.util.SynchronizedQueue`<E extends java.lang.Object>
implements `java.io.Serializable`, `java.util.Queue<E>`  

**Constructors:**
- `public SynchronizedQueue(java.util.Queue p0)`

**Methods:**
- `public synchronized boolean add(E p0)`
- `public synchronized boolean addAll(java.util.Collection p0)`
- `public synchronized void clear()`
- `public synchronized boolean contains(java.lang.Object p0)`
- `public synchronized boolean containsAll(java.util.Collection p0)`
- `public synchronized E element()`
- `public synchronized boolean equals(java.lang.Object p0)`
- `public synchronized int hashCode()`
- `public synchronized boolean isEmpty()`
- `public synchronized java.util.Iterator iterator()`
- `public synchronized boolean offer(E p0)`
- `public synchronized E peek()`
- `public synchronized E poll()`
- `public synchronized E remove()`
- `public synchronized boolean remove(java.lang.Object p0)`
- `public synchronized boolean removeAll(java.util.Collection p0)`
- `public synchronized boolean retainAll(java.util.Collection p0)`
- `public synchronized int size()`
- `public synchronized java.lang.Object[] toArray()`
- `public synchronized <T extends java.lang.Object> T[] toArray(T[] p0)`
- `public synchronized java.lang.String toString()`

---

## public class `org.apache.mina.util.Transform`

**Constructors:**
- `public Transform()`

**Methods:**
- `public static void appendEscapingCDATA(java.lang.StringBuilder p0, java.lang.String p1)`
- `public static java.lang.String escapeTags(java.lang.String p0)`
- `public static java.lang.String[] getThrowableStrRep(java.lang.Throwable p0)`

---

## public abstract class `org.apache.mina.util.byteaccess.BufferByteArray`
extends `org.apache.mina.util.byteaccess.AbstractByteArray`  

**Constructors:**
- `public BufferByteArray(org.apache.mina.core.buffer.IoBuffer p0)`

**Fields:**
- `protected org.apache.mina.core.buffer.IoBuffer bb`

**Methods:**
- `public org.apache.mina.util.byteaccess.ByteArray$Cursor cursor()`
- `public org.apache.mina.util.byteaccess.ByteArray$Cursor cursor(int p0)`
- `public int first()`
- `public byte get(int p0)`
- `public void get(int p0, org.apache.mina.core.buffer.IoBuffer p1)`
- `public char getChar(int p0)`
- `public double getDouble(int p0)`
- `public float getFloat(int p0)`
- `public int getInt(int p0)`
- `public java.lang.Iterable getIoBuffers()`
- `public long getLong(int p0)`
- `public short getShort(int p0)`
- `public org.apache.mina.core.buffer.IoBuffer getSingleIoBuffer()`
- `public int hashCode()`
- `public int last()`
- `public java.nio.ByteOrder order()`
- `public void order(java.nio.ByteOrder p0)`
- `public void put(int p0, byte p1)`
- `public void put(int p0, org.apache.mina.core.buffer.IoBuffer p1)`
- `public void putChar(int p0, char p1)`
- `public void putDouble(int p0, double p1)`
- `public void putFloat(int p0, float p1)`
- `public void putInt(int p0, int p1)`
- `public void putLong(int p0, long p1)`
- `public void putShort(int p0, short p1)`
- `public org.apache.mina.util.byteaccess.ByteArray slice(int p0, int p1)`

---

## public abstract interface `org.apache.mina.util.byteaccess.ByteArray`
implements `org.apache.mina.util.byteaccess.IoAbsoluteReader`, `org.apache.mina.util.byteaccess.IoAbsoluteWriter`  

**Methods:**
- `public abstract org.apache.mina.util.byteaccess.ByteArray$Cursor cursor()`
- `public abstract org.apache.mina.util.byteaccess.ByteArray$Cursor cursor(int p0)`
- `public abstract boolean equals(java.lang.Object p0)`
- `public abstract int first()`
- `public abstract void free()`
- `public abstract byte get(int p0)`
- `public abstract void get(int p0, org.apache.mina.core.buffer.IoBuffer p1)`
- `public abstract int getInt(int p0)`
- `public abstract java.lang.Iterable getIoBuffers()`
- `public abstract org.apache.mina.core.buffer.IoBuffer getSingleIoBuffer()`
- `public abstract int last()`
- `public abstract java.nio.ByteOrder order()`
- `public abstract void order(java.nio.ByteOrder p0)`

---

## public abstract static interface `org.apache.mina.util.byteaccess.ByteArray$Cursor`
implements `org.apache.mina.util.byteaccess.IoRelativeReader`, `org.apache.mina.util.byteaccess.IoRelativeWriter`  

**Methods:**
- `public abstract byte get()`
- `public abstract void get(org.apache.mina.core.buffer.IoBuffer p0)`
- `public abstract int getIndex()`
- `public abstract int getInt()`
- `public abstract int getRemaining()`
- `public abstract boolean hasRemaining()`
- `public abstract void setIndex(int p0)`

---

## public abstract interface `org.apache.mina.util.byteaccess.ByteArrayFactory`

**Methods:**
- `public abstract org.apache.mina.util.byteaccess.ByteArray create(int p0)`

---

## public class `org.apache.mina.util.byteaccess.ByteArrayPool`
implements `org.apache.mina.util.byteaccess.ByteArrayFactory`  

**Constructors:**
- `public ByteArrayPool(boolean p0, int p1, int p2)`

**Methods:**
- `public org.apache.mina.util.byteaccess.ByteArray create(int p0)`
- `public void free()`

---

## public final class `org.apache.mina.util.byteaccess.CompositeByteArray`
extends `org.apache.mina.util.byteaccess.AbstractByteArray`  

**Constructors:**
- `public CompositeByteArray()`
- `public CompositeByteArray(org.apache.mina.util.byteaccess.ByteArrayFactory p0)`

**Methods:**
- `public void addFirst(org.apache.mina.util.byteaccess.ByteArray p0)`
- `public void addLast(org.apache.mina.util.byteaccess.ByteArray p0)`
- `public org.apache.mina.util.byteaccess.ByteArray$Cursor cursor()`
- `public org.apache.mina.util.byteaccess.ByteArray$Cursor cursor(int p0)`
- `public org.apache.mina.util.byteaccess.ByteArray$Cursor cursor(int p0, org.apache.mina.util.byteaccess.CompositeByteArray$CursorListener p1)`
- `public org.apache.mina.util.byteaccess.ByteArray$Cursor cursor(org.apache.mina.util.byteaccess.CompositeByteArray$CursorListener p0)`
- `public int first()`
- `public void free()`
- `public byte get(int p0)`
- `public void get(int p0, org.apache.mina.core.buffer.IoBuffer p1)`
- `public char getChar(int p0)`
- `public double getDouble(int p0)`
- `public org.apache.mina.util.byteaccess.ByteArray getFirst()`
- `public float getFloat(int p0)`
- `public int getInt(int p0)`
- `public java.lang.Iterable getIoBuffers()`
- `public long getLong(int p0)`
- `public short getShort(int p0)`
- `public org.apache.mina.core.buffer.IoBuffer getSingleIoBuffer()`
- `public int hashCode()`
- `public int last()`
- `public java.nio.ByteOrder order()`
- `public void order(java.nio.ByteOrder p0)`
- `public void put(int p0, byte p1)`
- `public void put(int p0, org.apache.mina.core.buffer.IoBuffer p1)`
- `public void putChar(int p0, char p1)`
- `public void putDouble(int p0, double p1)`
- `public void putFloat(int p0, float p1)`
- `public void putInt(int p0, int p1)`
- `public void putLong(int p0, long p1)`
- `public void putShort(int p0, short p1)`
- `public org.apache.mina.util.byteaccess.ByteArray removeFirst()`
- `public org.apache.mina.util.byteaccess.ByteArray removeLast()`
- `public org.apache.mina.util.byteaccess.ByteArray removeTo(int p0)`
- `public org.apache.mina.util.byteaccess.ByteArray slice(int p0, int p1)`

---

## public abstract static interface `org.apache.mina.util.byteaccess.CompositeByteArray$CursorListener`

**Methods:**
- `public abstract void enteredFirstComponent(int p0, org.apache.mina.util.byteaccess.ByteArray p1)`
- `public abstract void enteredLastComponent(int p0, org.apache.mina.util.byteaccess.ByteArray p1)`
- `public abstract void enteredNextComponent(int p0, org.apache.mina.util.byteaccess.ByteArray p1)`
- `public abstract void enteredPreviousComponent(int p0, org.apache.mina.util.byteaccess.ByteArray p1)`

---

## public class `org.apache.mina.util.byteaccess.CompositeByteArrayRelativeReader`
extends `org.apache.mina.util.byteaccess.CompositeByteArrayRelativeBase`  
implements `org.apache.mina.util.byteaccess.IoRelativeReader`  

**Constructors:**
- `public CompositeByteArrayRelativeReader(org.apache.mina.util.byteaccess.CompositeByteArray p0, boolean p1)`

**Methods:**
- `protected void cursorPassedFirstComponent()`
- `public byte get()`
- `public void get(org.apache.mina.core.buffer.IoBuffer p0)`
- `public char getChar()`
- `public double getDouble()`
- `public float getFloat()`
- `public int getInt()`
- `public long getLong()`
- `public short getShort()`
- `public void skip(int p0)`
- `public org.apache.mina.util.byteaccess.ByteArray slice(int p0)`

---

## public class `org.apache.mina.util.byteaccess.CompositeByteArrayRelativeWriter`
extends `org.apache.mina.util.byteaccess.CompositeByteArrayRelativeBase`  
implements `org.apache.mina.util.byteaccess.IoRelativeWriter`  

**Constructors:**
- `public CompositeByteArrayRelativeWriter(org.apache.mina.util.byteaccess.CompositeByteArray p0, org.apache.mina.util.byteaccess.CompositeByteArrayRelativeWriter$Expander p1, org.apache.mina.util.byteaccess.CompositeByteArrayRelativeWriter$Flusher p2, boolean p3)`

**Methods:**
- `protected void cursorPassedFirstComponent()`
- `public void flush()`
- `public void flushTo(int p0)`
- `public void put(byte p0)`
- `public void put(org.apache.mina.core.buffer.IoBuffer p0)`
- `public void putChar(char p0)`
- `public void putDouble(double p0)`
- `public void putFloat(float p0)`
- `public void putInt(int p0)`
- `public void putLong(long p0)`
- `public void putShort(short p0)`
- `public void skip(int p0)`

---

## public static class `org.apache.mina.util.byteaccess.CompositeByteArrayRelativeWriter$ChunkedExpander`
implements `org.apache.mina.util.byteaccess.CompositeByteArrayRelativeWriter$Expander`  

**Constructors:**
- `public ChunkedExpander(org.apache.mina.util.byteaccess.ByteArrayFactory p0, int p1)`

**Methods:**
- `public void expand(org.apache.mina.util.byteaccess.CompositeByteArray p0, int p1)`

---

## public abstract static interface `org.apache.mina.util.byteaccess.CompositeByteArrayRelativeWriter$Expander`

**Methods:**
- `public abstract void expand(org.apache.mina.util.byteaccess.CompositeByteArray p0, int p1)`

---

## public abstract static interface `org.apache.mina.util.byteaccess.CompositeByteArrayRelativeWriter$Flusher`

**Methods:**
- `public abstract void flush(org.apache.mina.util.byteaccess.ByteArray p0)`

---

## public static class `org.apache.mina.util.byteaccess.CompositeByteArrayRelativeWriter$NopExpander`
implements `org.apache.mina.util.byteaccess.CompositeByteArrayRelativeWriter$Expander`  

**Constructors:**
- `public NopExpander()`

**Methods:**
- `public void expand(org.apache.mina.util.byteaccess.CompositeByteArray p0, int p1)`

---

## public abstract interface `org.apache.mina.util.byteaccess.IoAbsoluteReader`

**Methods:**
- `public abstract int first()`
- `public abstract byte get(int p0)`
- `public abstract void get(int p0, org.apache.mina.core.buffer.IoBuffer p1)`
- `public abstract char getChar(int p0)`
- `public abstract double getDouble(int p0)`
- `public abstract float getFloat(int p0)`
- `public abstract int getInt(int p0)`
- `public abstract long getLong(int p0)`
- `public abstract short getShort(int p0)`
- `public abstract int last()`
- `public abstract int length()`
- `public abstract java.nio.ByteOrder order()`
- `public abstract org.apache.mina.util.byteaccess.ByteArray slice(int p0, int p1)`

---

## public abstract interface `org.apache.mina.util.byteaccess.IoAbsoluteWriter`

**Methods:**
- `public abstract int first()`
- `public abstract int last()`
- `public abstract java.nio.ByteOrder order()`
- `public abstract void put(int p0, byte p1)`
- `public abstract void put(int p0, org.apache.mina.core.buffer.IoBuffer p1)`
- `public abstract void putChar(int p0, char p1)`
- `public abstract void putDouble(int p0, double p1)`
- `public abstract void putFloat(int p0, float p1)`
- `public abstract void putInt(int p0, int p1)`
- `public abstract void putLong(int p0, long p1)`
- `public abstract void putShort(int p0, short p1)`

---

## public abstract interface `org.apache.mina.util.byteaccess.IoRelativeReader`

**Methods:**
- `public abstract byte get()`
- `public abstract void get(org.apache.mina.core.buffer.IoBuffer p0)`
- `public abstract char getChar()`
- `public abstract double getDouble()`
- `public abstract float getFloat()`
- `public abstract int getInt()`
- `public abstract long getLong()`
- `public abstract int getRemaining()`
- `public abstract short getShort()`
- `public abstract boolean hasRemaining()`
- `public abstract java.nio.ByteOrder order()`
- `public abstract void skip(int p0)`
- `public abstract org.apache.mina.util.byteaccess.ByteArray slice(int p0)`

---

## public abstract interface `org.apache.mina.util.byteaccess.IoRelativeWriter`

**Methods:**
- `public abstract int getRemaining()`
- `public abstract boolean hasRemaining()`
- `public abstract java.nio.ByteOrder order()`
- `public abstract void put(byte p0)`
- `public abstract void put(org.apache.mina.core.buffer.IoBuffer p0)`
- `public abstract void putChar(char p0)`
- `public abstract void putDouble(double p0)`
- `public abstract void putFloat(float p0)`
- `public abstract void putInt(int p0)`
- `public abstract void putLong(long p0)`
- `public abstract void putShort(short p0)`
- `public abstract void skip(int p0)`

---

## public class `org.apache.mina.util.byteaccess.SimpleByteArrayFactory`
implements `org.apache.mina.util.byteaccess.ByteArrayFactory`  

**Constructors:**
- `public SimpleByteArrayFactory()`

**Methods:**
- `public org.apache.mina.util.byteaccess.ByteArray create(int p0)`

---

