# API Specification: org.apache.thrift:libthrift 0.16.0

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public abstract class `org.apache.thrift.AsyncProcessFunction`<I extends java.lang.Object, T extends org.apache.thrift.TBase, R extends java.lang.Object>

**Constructors:**
- `public AsyncProcessFunction(java.lang.String p0)`

**Methods:**
- `public abstract T getEmptyArgsInstance()`
- `public java.lang.String getMethodName()`
- `public abstract org.apache.thrift.async.AsyncMethodCallback getResultHandler(org.apache.thrift.server.AbstractNonblockingServer$AsyncFrameBuffer p0, int p1)`
- `protected abstract boolean isOneway()`
- `public void sendResponse(org.apache.thrift.server.AbstractNonblockingServer$AsyncFrameBuffer p0, org.apache.thrift.TSerializable p1, byte p2, int p3) throws org.apache.thrift.TException`
- `public abstract void start(I p0, T p1, org.apache.thrift.async.AsyncMethodCallback p2) throws org.apache.thrift.TException`

---

## public class `org.apache.thrift.EncodingUtils`

**Constructors:**
- `public EncodingUtils()`

**Methods:**
- `public final static byte clearBit(byte p0, int p1)`
- `public final static int clearBit(int p0, int p1)`
- `public final static long clearBit(long p0, int p1)`
- `public final static short clearBit(short p0, int p1)`
- `public final static int decodeBigEndian(byte[] p0)`
- `public final static int decodeBigEndian(byte[] p0, int p1)`
- `public final static void encodeBigEndian(int p0, byte[] p1)`
- `public final static void encodeBigEndian(int p0, byte[] p1, int p2)`
- `public final static byte setBit(byte p0, int p1, boolean p2)`
- `public final static int setBit(int p0, int p1, boolean p2)`
- `public final static long setBit(long p0, int p1, boolean p2)`
- `public final static short setBit(short p0, int p1, boolean p2)`
- `public final static boolean testBit(byte p0, int p1)`
- `public final static boolean testBit(int p0, int p1)`
- `public final static boolean testBit(long p0, int p1)`
- `public final static boolean testBit(short p0, int p1)`

---

## public abstract class `org.apache.thrift.Option`<T extends java.lang.Object>

**Constructors:**
- `public Option()`

**Methods:**
- `public static <T extends java.lang.Object> org.apache.thrift.Option fromNullable(T p0)`
- `public abstract T get()`
- `public abstract boolean isDefined()`
- `public static <T extends java.lang.Object> org.apache.thrift.Option$None none()`
- `public T or(T p0)`
- `public static <T extends java.lang.Object> org.apache.thrift.Option$Some some(T p0)`

---

## public static class `org.apache.thrift.Option$None`<T extends java.lang.Object>
extends `org.apache.thrift.Option`  

**Constructors:**
- `public None()`

**Methods:**
- `public T get()`
- `public boolean isDefined()`
- `public java.lang.String toString()`

---

## public static class `org.apache.thrift.Option$Some`<T extends java.lang.Object>
extends `org.apache.thrift.Option`  

**Constructors:**
- `public Some(T p0)`

**Methods:**
- `public T get()`
- `public boolean isDefined()`
- `public java.lang.String toString()`

---

## public abstract class `org.apache.thrift.ProcessFunction`<I extends java.lang.Object, T extends org.apache.thrift.TBase>

**Constructors:**
- `public ProcessFunction(java.lang.String p0)`

**Methods:**
- `public abstract T getEmptyArgsInstance()`
- `public java.lang.String getMethodName()`
- `public abstract org.apache.thrift.TBase getResult(I p0, T p1) throws org.apache.thrift.TException`
- `protected abstract boolean isOneway()`
- `public final void process(int p0, org.apache.thrift.protocol.TProtocol p1, org.apache.thrift.protocol.TProtocol p2, I p3) throws org.apache.thrift.TException`
- `protected boolean rethrowUnhandledExceptions()`

---

## public class `org.apache.thrift.TApplicationException`
extends `org.apache.thrift.TException`  
implements `org.apache.thrift.TSerializable`  

**Constructors:**
- `public TApplicationException()`
- `public TApplicationException(int p0)`
- `public TApplicationException(int p0, java.lang.String p1)`
- `public TApplicationException(java.lang.String p0)`

**Fields:**
- `public final static int BAD_SEQUENCE_ID`
- `public final static int INTERNAL_ERROR`
- `public final static int INVALID_MESSAGE_TYPE`
- `public final static int INVALID_PROTOCOL`
- `public final static int INVALID_TRANSFORM`
- `public final static int MISSING_RESULT`
- `public final static int PROTOCOL_ERROR`
- `public final static int UNKNOWN`
- `public final static int UNKNOWN_METHOD`
- `public final static int UNSUPPORTED_CLIENT_TYPE`
- `public final static int WRONG_METHOD_NAME`
- `protected int type_`

**Methods:**
- `public java.lang.String getMessage()`
- `public int getType()`
- `public void read(org.apache.thrift.protocol.TProtocol p0) throws org.apache.thrift.TException`
- `public static org.apache.thrift.TApplicationException readFrom(org.apache.thrift.protocol.TProtocol p0) throws org.apache.thrift.TException`
- `public void write(org.apache.thrift.protocol.TProtocol p0) throws org.apache.thrift.TException`

---

## public abstract interface `org.apache.thrift.TAsyncProcessor`

**Methods:**
- `public abstract void process(org.apache.thrift.server.AbstractNonblockingServer$AsyncFrameBuffer p0) throws org.apache.thrift.TException`

---

## public abstract interface `org.apache.thrift.TBase`<T extends org.apache.thrift.TBase<T, F>, F extends org.apache.thrift.TFieldIdEnum>
implements `java.io.Serializable`, `java.lang.Comparable<T>`, `org.apache.thrift.TSerializable`  

**Methods:**
- `public abstract void clear()`
- `public abstract T deepCopy()`
- `public abstract F fieldForId(int p0)`
- `public abstract java.lang.Object getFieldValue(F p0)`
- `public abstract boolean isSet(F p0)`
- `public abstract void setFieldValue(F p0, java.lang.Object p1)`

---

## public class `org.apache.thrift.TBaseAsyncProcessor`<I extends java.lang.Object>
implements `org.apache.thrift.TAsyncProcessor`, `org.apache.thrift.TProcessor`  

**Constructors:**
- `public TBaseAsyncProcessor(I p0, java.util.Map p1)`

**Fields:**
- `protected final org.slf4j.Logger LOGGER`

**Methods:**
- `public java.util.Map getProcessMapView()`
- `public void process(org.apache.thrift.protocol.TProtocol p0, org.apache.thrift.protocol.TProtocol p1) throws org.apache.thrift.TException`
- `public void process(org.apache.thrift.server.AbstractNonblockingServer$AsyncFrameBuffer p0) throws org.apache.thrift.TException`

---

## public final class `org.apache.thrift.TBaseHelper`

**Methods:**
- `public static byte[] byteBufferToByteArray(java.nio.ByteBuffer p0)`
- `public static int byteBufferToByteArray(java.nio.ByteBuffer p0, byte[] p1, int p2)`
- `public static int compareTo(boolean p0, boolean p1)`
- `public static int compareTo(byte p0, byte p1)`
- `public static int compareTo(byte[] p0, byte[] p1)`
- `public static int compareTo(double p0, double p1)`
- `public static int compareTo(int p0, int p1)`
- `public static int compareTo(java.lang.Comparable p0, java.lang.Comparable p1)`
- `public static int compareTo(java.lang.Object p0, java.lang.Object p1)`
- `public static int compareTo(java.lang.String p0, java.lang.String p1)`
- `public static int compareTo(java.util.List p0, java.util.List p1)`
- `public static int compareTo(java.util.Map p0, java.util.Map p1)`
- `public static int compareTo(java.util.Set p0, java.util.Set p1)`
- `public static int compareTo(long p0, long p1)`
- `public static int compareTo(short p0, short p1)`
- `public static byte[] copyBinary(byte[] p0)`
- `public static java.nio.ByteBuffer copyBinary(java.nio.ByteBuffer p0)`
- `public static int hashCode(double p0)`
- `public static int hashCode(long p0)`
- `public static java.lang.String paddedByteString(byte p0)`
- `public static java.nio.ByteBuffer rightSize(java.nio.ByteBuffer p0)`
- `public static void toString(java.nio.ByteBuffer p0, java.lang.StringBuilder p1)`
- `public static void toString(java.util.Collection p0, java.lang.StringBuilder p1)`
- `public static boolean wrapsFullArray(java.nio.ByteBuffer p0)`

---

## public abstract class `org.apache.thrift.TBaseProcessor`<I extends java.lang.Object>
implements `org.apache.thrift.TProcessor`  

**Constructors:**
- `protected TBaseProcessor(I p0, java.util.Map p1)`

**Methods:**
- `public java.util.Map getProcessMapView()`
- `public void process(org.apache.thrift.protocol.TProtocol p0, org.apache.thrift.protocol.TProtocol p1) throws org.apache.thrift.TException`

---

## public class `org.apache.thrift.TByteArrayOutputStream`
extends `java.io.ByteArrayOutputStream`  

**Constructors:**
- `public TByteArrayOutputStream()`
- `public TByteArrayOutputStream(int p0)`

**Methods:**
- `public byte[] get()`
- `public int len()`
- `public void reset()`
- `public java.lang.String toString(java.nio.charset.Charset p0)`

---

## public class `org.apache.thrift.TConfiguration`

**Constructors:**
- `public TConfiguration()`
- `public TConfiguration(int p0, int p1, int p2)`

**Fields:**
- `public final static org.apache.thrift.TConfiguration DEFAULT`
- `public final static int DEFAULT_MAX_FRAME_SIZE`
- `public final static int DEFAULT_MAX_MESSAGE_SIZE`
- `public final static int DEFAULT_RECURSION_DEPTH`

**Methods:**
- `public static org.apache.thrift.TConfiguration$Builder custom()`
- `public int getMaxFrameSize()`
- `public int getMaxMessageSize()`
- `public int getRecursionLimit()`
- `public void setMaxFrameSize(int p0)`
- `public void setMaxMessageSize(int p0)`
- `public void setRecursionLimit(int p0)`

---

## public static class `org.apache.thrift.TConfiguration$Builder`

**Methods:**
- `public org.apache.thrift.TConfiguration build()`
- `public org.apache.thrift.TConfiguration$Builder setMaxFrameSize(int p0)`
- `public org.apache.thrift.TConfiguration$Builder setMaxMessageSize(int p0)`
- `public org.apache.thrift.TConfiguration$Builder setRecursionLimit(int p0)`

---

## public class `org.apache.thrift.TDeserializer`

**Constructors:**
- `public TDeserializer() throws org.apache.thrift.transport.TTransportException`
- `public TDeserializer(java.lang.Class p0, java.util.Collection p1, org.apache.thrift.partial.ThriftFieldValueProcessor p2, org.apache.thrift.protocol.TProtocolFactory p3) throws org.apache.thrift.transport.TTransportException`
- `public TDeserializer(java.lang.Class p0, java.util.Collection p1, org.apache.thrift.protocol.TProtocolFactory p2) throws org.apache.thrift.transport.TTransportException`
- `public TDeserializer(org.apache.thrift.protocol.TProtocolFactory p0) throws org.apache.thrift.transport.TTransportException`

**Methods:**
- `public void deserialize(org.apache.thrift.TBase p0, byte[] p1) throws org.apache.thrift.TException`
- `public void deserialize(org.apache.thrift.TBase p0, byte[] p1, int p2, int p3) throws org.apache.thrift.TException`
- `public void deserialize(org.apache.thrift.TBase p0, java.lang.String p1, java.lang.String p2) throws org.apache.thrift.TException`
- `public void fromString(org.apache.thrift.TBase p0, java.lang.String p1) throws org.apache.thrift.TException`
- `public org.apache.thrift.partial.ThriftMetadata$ThriftStruct getMetadata()`
- `public void partialDeserialize(org.apache.thrift.TBase p0, byte[] p1, org.apache.thrift.TFieldIdEnum p2, org.apache.thrift.TFieldIdEnum... p3) throws org.apache.thrift.TException`
- `public java.lang.Boolean partialDeserializeBool(byte[] p0, org.apache.thrift.TFieldIdEnum p1, org.apache.thrift.TFieldIdEnum... p2) throws org.apache.thrift.TException`
- `public java.lang.Byte partialDeserializeByte(byte[] p0, org.apache.thrift.TFieldIdEnum p1, org.apache.thrift.TFieldIdEnum... p2) throws org.apache.thrift.TException`
- `public java.nio.ByteBuffer partialDeserializeByteArray(byte[] p0, org.apache.thrift.TFieldIdEnum p1, org.apache.thrift.TFieldIdEnum... p2) throws org.apache.thrift.TException`
- `public java.lang.Double partialDeserializeDouble(byte[] p0, org.apache.thrift.TFieldIdEnum p1, org.apache.thrift.TFieldIdEnum... p2) throws org.apache.thrift.TException`
- `public java.lang.Short partialDeserializeI16(byte[] p0, org.apache.thrift.TFieldIdEnum p1, org.apache.thrift.TFieldIdEnum... p2) throws org.apache.thrift.TException`
- `public java.lang.Integer partialDeserializeI32(byte[] p0, org.apache.thrift.TFieldIdEnum p1, org.apache.thrift.TFieldIdEnum... p2) throws org.apache.thrift.TException`
- `public java.lang.Long partialDeserializeI64(byte[] p0, org.apache.thrift.TFieldIdEnum p1, org.apache.thrift.TFieldIdEnum... p2) throws org.apache.thrift.TException`
- `public java.lang.Object partialDeserializeObject(byte[] p0) throws org.apache.thrift.TException`
- `public java.lang.Object partialDeserializeObject(byte[] p0, int p1, int p2) throws org.apache.thrift.TException`
- `public java.lang.Short partialDeserializeSetFieldIdInUnion(byte[] p0, org.apache.thrift.TFieldIdEnum p1, org.apache.thrift.TFieldIdEnum... p2) throws org.apache.thrift.TException`
- `public java.lang.String partialDeserializeString(byte[] p0, org.apache.thrift.TFieldIdEnum p1, org.apache.thrift.TFieldIdEnum... p2) throws org.apache.thrift.TException`
- `public java.lang.Object partialDeserializeThriftObject(org.apache.thrift.TBase p0, byte[] p1, int p2, int p3) throws org.apache.thrift.TException`

---

## public abstract interface `org.apache.thrift.TEnum`

**Methods:**
- `public abstract int getValue()`

---

## public class `org.apache.thrift.TEnumHelper`

**Constructors:**
- `public TEnumHelper()`

**Methods:**
- `public static org.apache.thrift.TEnum getByValue(java.lang.Class p0, int p1)`

---

## public class `org.apache.thrift.TException`
extends `java.lang.Exception`  

**Constructors:**
- `public TException()`
- `public TException(java.lang.String p0)`
- `public TException(java.lang.String p0, java.lang.Throwable p1)`
- `public TException(java.lang.Throwable p0)`

---

## public abstract interface `org.apache.thrift.TFieldIdEnum`

**Methods:**
- `public abstract java.lang.String getFieldName()`
- `public abstract short getThriftFieldId()`

---

## public final class `org.apache.thrift.TFieldRequirementType`

**Constructors:**
- `public TFieldRequirementType()`

**Fields:**
- `public final static byte DEFAULT`
- `public final static byte OPTIONAL`
- `public final static byte REQUIRED`

---

## public class `org.apache.thrift.TMultiplexedProcessor`
implements `org.apache.thrift.TProcessor`  

**Constructors:**
- `public TMultiplexedProcessor()`

**Methods:**
- `public void process(org.apache.thrift.protocol.TProtocol p0, org.apache.thrift.protocol.TProtocol p1) throws org.apache.thrift.TException`
- `public void registerDefault(org.apache.thrift.TProcessor p0)`
- `public void registerProcessor(java.lang.String p0, org.apache.thrift.TProcessor p1)`

---

## public class `org.apache.thrift.TNonblockingMultiFetchClient`

**Constructors:**
- `public TNonblockingMultiFetchClient(int p0, int p1, java.nio.ByteBuffer p2, java.util.List p3)`

**Methods:**
- `public synchronized java.nio.ByteBuffer[] fetch()`
- `public synchronized org.apache.thrift.TNonblockingMultiFetchStats getFetchStats()`
- `public synchronized int getFetchTimeoutSeconds()`
- `public synchronized int getMaxRecvBufBytesPerServer()`
- `public synchronized java.nio.ByteBuffer getRequestBuf()`
- `public synchronized java.util.List getServerList()`

---

## public class `org.apache.thrift.TNonblockingMultiFetchStats`

**Constructors:**
- `public TNonblockingMultiFetchStats()`

**Methods:**
- `public void clear()`
- `public int getMaxResponseBytes()`
- `public int getNumConnectErrorServers()`
- `public int getNumInvalidFrameSize()`
- `public int getNumOverflowedRecvBuf()`
- `public int getNumReadCompletedServers()`
- `public int getNumTotalServers()`
- `public long getReadTime()`
- `public int getTotalRecvBufBytes()`
- `public void incNumConnectErrorServers()`
- `public void incNumInvalidFrameSize()`
- `public void incNumOverflowedRecvBuf()`
- `public void incNumReadCompletedServers()`
- `public void incTotalRecvBufBytes(int p0)`
- `public void setMaxResponseBytes(int p0)`
- `public void setNumTotalServers(int p0)`
- `public void setReadTime(long p0)`
- `public java.lang.String toString()`

---

## public abstract interface `org.apache.thrift.TProcessor`

**Methods:**
- `public abstract void process(org.apache.thrift.protocol.TProtocol p0, org.apache.thrift.protocol.TProtocol p1) throws org.apache.thrift.TException`

---

## public class `org.apache.thrift.TProcessorFactory`

**Constructors:**
- `public TProcessorFactory(org.apache.thrift.TProcessor p0)`

**Methods:**
- `public org.apache.thrift.TProcessor getProcessor(org.apache.thrift.transport.TTransport p0)`
- `public boolean isAsyncProcessor()`

---

## public abstract interface `org.apache.thrift.TSerializable`

**Methods:**
- `public abstract void read(org.apache.thrift.protocol.TProtocol p0) throws org.apache.thrift.TException`
- `public abstract void write(org.apache.thrift.protocol.TProtocol p0) throws org.apache.thrift.TException`

---

## public class `org.apache.thrift.TSerializer`

**Constructors:**
- `public TSerializer() throws org.apache.thrift.transport.TTransportException`
- `public TSerializer(org.apache.thrift.protocol.TProtocolFactory p0) throws org.apache.thrift.transport.TTransportException`

**Methods:**
- `public byte[] serialize(org.apache.thrift.TBase p0) throws org.apache.thrift.TException`
- `public java.lang.String toString(org.apache.thrift.TBase p0) throws org.apache.thrift.TException`

---

## public abstract class `org.apache.thrift.TServiceClient`

**Constructors:**
- `public TServiceClient(org.apache.thrift.protocol.TProtocol p0)`
- `public TServiceClient(org.apache.thrift.protocol.TProtocol p0, org.apache.thrift.protocol.TProtocol p1)`

**Fields:**
- `protected org.apache.thrift.protocol.TProtocol iprot_`
- `protected org.apache.thrift.protocol.TProtocol oprot_`
- `protected int seqid_`

**Methods:**
- `public org.apache.thrift.protocol.TProtocol getInputProtocol()`
- `public org.apache.thrift.protocol.TProtocol getOutputProtocol()`
- `protected void receiveBase(org.apache.thrift.TBase p0, java.lang.String p1) throws org.apache.thrift.TException`
- `protected void sendBase(java.lang.String p0, org.apache.thrift.TBase p1) throws org.apache.thrift.TException`
- `protected void sendBaseOneway(java.lang.String p0, org.apache.thrift.TBase p1) throws org.apache.thrift.TException`

---

## public abstract interface `org.apache.thrift.TServiceClientFactory`<T extends org.apache.thrift.TServiceClient>

**Methods:**
- `public abstract T getClient(org.apache.thrift.protocol.TProtocol p0)`
- `public abstract T getClient(org.apache.thrift.protocol.TProtocol p0, org.apache.thrift.protocol.TProtocol p1)`

---

## public abstract class `org.apache.thrift.TUnion`<T extends org.apache.thrift.TUnion<T, F>, F extends org.apache.thrift.TFieldIdEnum>
implements `org.apache.thrift.TBase<T,F>`  

**Constructors:**
- `protected TUnion()`
- `protected TUnion(F p0, java.lang.Object p1)`
- `protected TUnion(org.apache.thrift.TUnion p0)`

**Fields:**
- `protected F setField_`
- `protected java.lang.Object value_`

**Methods:**
- `protected abstract void checkType(F p0, java.lang.Object p1) throws java.lang.ClassCastException`
- `public final void clear()`
- `protected abstract F enumForId(short p0)`
- `protected abstract org.apache.thrift.protocol.TField getFieldDesc(F p0)`
- `public java.lang.Object getFieldValue()`
- `public java.lang.Object getFieldValue(F p0)`
- `public java.lang.Object getFieldValue(int p0)`
- `public F getSetField()`
- `protected abstract org.apache.thrift.protocol.TStruct getStructDesc()`
- `public boolean isSet()`
- `public boolean isSet(F p0)`
- `public boolean isSet(int p0)`
- `public void read(org.apache.thrift.protocol.TProtocol p0) throws org.apache.thrift.TException`
- `public void setFieldValue(F p0, java.lang.Object p1)`
- `public void setFieldValue(int p0, java.lang.Object p1)`
- `protected abstract java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol p0, org.apache.thrift.protocol.TField p1) throws org.apache.thrift.TException`
- `protected abstract void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol p0) throws org.apache.thrift.TException`
- `public java.lang.String toString()`
- `protected abstract java.lang.Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol p0, short p1) throws org.apache.thrift.TException`
- `protected abstract void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol p0) throws org.apache.thrift.TException`
- `public void write(org.apache.thrift.protocol.TProtocol p0) throws org.apache.thrift.TException`

---

## public abstract interface `org.apache.thrift.annotation.Nullable`
annotations: @java.lang.annotation.Retention  

---

## public abstract interface `org.apache.thrift.async.AsyncMethodCallback`<T extends java.lang.Object>

**Methods:**
- `public abstract void onComplete(T p0)`
- `public abstract void onError(java.lang.Exception p0)`

---

## public abstract class `org.apache.thrift.async.TAsyncClient`

**Constructors:**
- `public TAsyncClient(org.apache.thrift.protocol.TProtocolFactory p0, org.apache.thrift.async.TAsyncClientManager p1, org.apache.thrift.transport.TNonblockingTransport p2)`
- `public TAsyncClient(org.apache.thrift.protocol.TProtocolFactory p0, org.apache.thrift.async.TAsyncClientManager p1, org.apache.thrift.transport.TNonblockingTransport p2, long p3)`

**Fields:**
- `protected org.apache.thrift.async.TAsyncMethodCall ___currentMethod`
- `protected final org.apache.thrift.async.TAsyncClientManager ___manager`
- `protected final org.apache.thrift.protocol.TProtocolFactory ___protocolFactory`
- `protected final org.apache.thrift.transport.TNonblockingTransport ___transport`

**Methods:**
- `protected void checkReady()`
- `public java.lang.Exception getError()`
- `public org.apache.thrift.protocol.TProtocolFactory getProtocolFactory()`
- `public long getTimeout()`
- `public boolean hasError()`
- `public boolean hasTimeout()`
- `protected void onComplete()`
- `protected void onError(java.lang.Exception p0)`
- `public void setTimeout(long p0)`

---

## public abstract interface `org.apache.thrift.async.TAsyncClientFactory`<T extends org.apache.thrift.async.TAsyncClient>

**Methods:**
- `public abstract T getAsyncClient(org.apache.thrift.transport.TNonblockingTransport p0)`

---

## public class `org.apache.thrift.async.TAsyncClientManager`

**Constructors:**
- `public TAsyncClientManager() throws java.io.IOException`

**Methods:**
- `public void call(org.apache.thrift.async.TAsyncMethodCall p0) throws org.apache.thrift.TException`
- `public boolean isRunning()`
- `public void stop()`

---

## public abstract class `org.apache.thrift.async.TAsyncMethodCall`<T extends java.lang.Object>

**Constructors:**
- `protected TAsyncMethodCall(org.apache.thrift.async.TAsyncClient p0, org.apache.thrift.protocol.TProtocolFactory p1, org.apache.thrift.transport.TNonblockingTransport p2, org.apache.thrift.async.AsyncMethodCallback p3, boolean p4)`

**Fields:**
- `protected final org.apache.thrift.async.TAsyncClient client`
- `protected final org.apache.thrift.transport.TNonblockingTransport transport`

**Methods:**
- `public org.apache.thrift.async.TAsyncClient getClient()`
- `protected java.nio.ByteBuffer getFrameBuffer()`
- `protected abstract T getResult() throws java.lang.Exception`
- `protected long getSequenceId()`
- `protected long getStartTime()`
- `protected org.apache.thrift.async.TAsyncMethodCall$State getState()`
- `public long getTimeoutTimestamp()`
- `public boolean hasTimeout()`
- `protected boolean isFinished()`
- `protected void onError(java.lang.Exception p0)`
- `protected void prepareMethodCall() throws org.apache.thrift.TException`
- `protected abstract void write_args(org.apache.thrift.protocol.TProtocol p0) throws org.apache.thrift.TException`

---

## public final static enum `org.apache.thrift.async.TAsyncMethodCall$State`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.apache.thrift.async.TAsyncMethodCall$State CONNECTING`
- `public final static org.apache.thrift.async.TAsyncMethodCall$State ERROR`
- `public final static org.apache.thrift.async.TAsyncMethodCall$State READING_RESPONSE_BODY`
- `public final static org.apache.thrift.async.TAsyncMethodCall$State READING_RESPONSE_SIZE`
- `public final static org.apache.thrift.async.TAsyncMethodCall$State RESPONSE_READ`
- `public final static org.apache.thrift.async.TAsyncMethodCall$State WRITING_REQUEST_BODY`
- `public final static org.apache.thrift.async.TAsyncMethodCall$State WRITING_REQUEST_SIZE`

---

## public class `org.apache.thrift.meta_data.EnumMetaData`
extends `org.apache.thrift.meta_data.FieldValueMetaData`  

**Constructors:**
- `public EnumMetaData(byte p0, java.lang.Class p1)`

**Fields:**
- `public final java.lang.Class enumClass`

---

## public class `org.apache.thrift.meta_data.FieldMetaData`
implements `java.io.Serializable`  

**Constructors:**
- `public FieldMetaData(java.lang.String p0, byte p1, org.apache.thrift.meta_data.FieldValueMetaData p2)`

**Fields:**
- `public final java.lang.String fieldName`
- `public final byte requirementType`
- `public final org.apache.thrift.meta_data.FieldValueMetaData valueMetaData`

**Methods:**
- `public static void addStructMetaDataMap(java.lang.Class p0, java.util.Map p1)`
- `public static java.util.Map getStructMetaDataMap(java.lang.Class p0)`

---

## public class `org.apache.thrift.meta_data.FieldValueMetaData`
implements `java.io.Serializable`  

**Constructors:**
- `public FieldValueMetaData(byte p0)`
- `public FieldValueMetaData(byte p0, boolean p1)`
- `public FieldValueMetaData(byte p0, java.lang.String p1)`

**Fields:**
- `public final byte type`

**Methods:**
- `public java.lang.String getTypedefName()`
- `public boolean isBinary()`
- `public boolean isContainer()`
- `public boolean isStruct()`
- `public boolean isTypedef()`

---

## public class `org.apache.thrift.meta_data.ListMetaData`
extends `org.apache.thrift.meta_data.FieldValueMetaData`  

**Constructors:**
- `public ListMetaData(byte p0, org.apache.thrift.meta_data.FieldValueMetaData p1)`

**Fields:**
- `public final org.apache.thrift.meta_data.FieldValueMetaData elemMetaData`

---

## public class `org.apache.thrift.meta_data.MapMetaData`
extends `org.apache.thrift.meta_data.FieldValueMetaData`  

**Constructors:**
- `public MapMetaData(byte p0, org.apache.thrift.meta_data.FieldValueMetaData p1, org.apache.thrift.meta_data.FieldValueMetaData p2)`

**Fields:**
- `public final org.apache.thrift.meta_data.FieldValueMetaData keyMetaData`
- `public final org.apache.thrift.meta_data.FieldValueMetaData valueMetaData`

---

## public class `org.apache.thrift.meta_data.SetMetaData`
extends `org.apache.thrift.meta_data.FieldValueMetaData`  

**Constructors:**
- `public SetMetaData(byte p0, org.apache.thrift.meta_data.FieldValueMetaData p1)`

**Fields:**
- `public final org.apache.thrift.meta_data.FieldValueMetaData elemMetaData`

---

## public class `org.apache.thrift.meta_data.StructMetaData`
extends `org.apache.thrift.meta_data.FieldValueMetaData`  

**Constructors:**
- `public StructMetaData(byte p0, java.lang.Class p1)`

**Fields:**
- `public final java.lang.Class structClass`

---

## public class `org.apache.thrift.partial.EnumCache`

**Constructors:**
- `public EnumCache()`

**Methods:**
- `public org.apache.thrift.TEnum get(java.lang.Class p0, int p1)`

---

## public class `org.apache.thrift.partial.PartialThriftComparer`<T extends org.apache.thrift.TBase>

**Constructors:**
- `public PartialThriftComparer(org.apache.thrift.partial.ThriftMetadata$ThriftStruct p0)`

**Methods:**
- `public boolean areEqual(T p0, T p1, java.lang.StringBuilder p2)`

---

## public class `org.apache.thrift.partial.TFieldData`

**Constructors:**
- `public TFieldData()`

**Methods:**
- `public static int encode(byte p0)`
- `public static int encode(byte p0, short p1)`
- `public static short getId(int p0)`
- `public static byte getType(int p0)`

---

## public class `org.apache.thrift.partial.ThriftField`

**Fields:**
- `public final java.util.List fields`
- `public final java.lang.String name`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public static java.util.List fromNames(java.util.Collection p0)`
- `public java.util.List getFieldNames()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public abstract interface `org.apache.thrift.partial.ThriftFieldValueProcessor`<V extends java.lang.Object>

**Methods:**
- `public abstract java.lang.Object createNewList(int p0)`
- `public abstract java.lang.Object createNewMap(int p0)`
- `public abstract java.lang.Object createNewSet(int p0)`
- `public abstract java.lang.Object createNewStruct(org.apache.thrift.partial.ThriftMetadata$ThriftStruct p0)`
- `public abstract java.lang.Object prepareBinary(java.nio.ByteBuffer p0)`
- `public abstract java.lang.Object prepareEnum(java.lang.Class p0, int p1)`
- `public abstract java.lang.Object prepareList(java.lang.Object p0)`
- `public abstract java.lang.Object prepareMap(java.lang.Object p0)`
- `public abstract java.lang.Object prepareSet(java.lang.Object p0)`
- `public abstract java.lang.Object prepareString(java.nio.ByteBuffer p0)`
- `public abstract V prepareStruct(java.lang.Object p0)`
- `public abstract void setBinary(V p0, org.apache.thrift.TFieldIdEnum p1, java.nio.ByteBuffer p2)`
- `public abstract void setBool(V p0, org.apache.thrift.TFieldIdEnum p1, boolean p2)`
- `public abstract void setByte(V p0, org.apache.thrift.TFieldIdEnum p1, byte p2)`
- `public abstract void setDouble(V p0, org.apache.thrift.TFieldIdEnum p1, double p2)`
- `public abstract void setEnumField(V p0, org.apache.thrift.TFieldIdEnum p1, java.lang.Object p2)`
- `public abstract void setInt16(V p0, org.apache.thrift.TFieldIdEnum p1, short p2)`
- `public abstract void setInt32(V p0, org.apache.thrift.TFieldIdEnum p1, int p2)`
- `public abstract void setInt64(V p0, org.apache.thrift.TFieldIdEnum p1, long p2)`
- `public abstract void setListElement(java.lang.Object p0, int p1, java.lang.Object p2)`
- `public abstract void setListField(V p0, org.apache.thrift.TFieldIdEnum p1, java.lang.Object p2)`
- `public abstract void setMapElement(java.lang.Object p0, int p1, java.lang.Object p2, java.lang.Object p3)`
- `public abstract void setMapField(V p0, org.apache.thrift.TFieldIdEnum p1, java.lang.Object p2)`
- `public abstract void setSetElement(java.lang.Object p0, int p1, java.lang.Object p2)`
- `public abstract void setSetField(V p0, org.apache.thrift.TFieldIdEnum p1, java.lang.Object p2)`
- `public abstract void setString(V p0, org.apache.thrift.TFieldIdEnum p1, java.nio.ByteBuffer p2)`
- `public abstract void setStructField(V p0, org.apache.thrift.TFieldIdEnum p1, java.lang.Object p2)`

---

## public class `org.apache.thrift.partial.ThriftMetadata`

**Constructors:**
- `public ThriftMetadata()`

---

## public abstract static class `org.apache.thrift.partial.ThriftMetadata$ThriftContainer`
extends `org.apache.thrift.partial.ThriftMetadata$ThriftObject`  

**Constructors:**
- `public ThriftContainer(org.apache.thrift.partial.ThriftMetadata$ThriftObject p0, org.apache.thrift.TFieldIdEnum p1, org.apache.thrift.meta_data.FieldMetaData p2)`

**Methods:**
- `public abstract boolean hasUnion()`

---

## public static class `org.apache.thrift.partial.ThriftMetadata$ThriftEnum`
extends `org.apache.thrift.partial.ThriftMetadata$ThriftObject`  

**Methods:**
- `protected void toPrettyString(java.lang.StringBuilder p0, int p1)`

---

## public static class `org.apache.thrift.partial.ThriftMetadata$ThriftList`
extends `org.apache.thrift.partial.ThriftMetadata$ThriftContainer`  

**Fields:**
- `public final org.apache.thrift.partial.ThriftMetadata$ThriftObject elementData`

**Methods:**
- `public boolean hasUnion()`
- `protected void toPrettyString(java.lang.StringBuilder p0, int p1)`

---

## public static class `org.apache.thrift.partial.ThriftMetadata$ThriftMap`
extends `org.apache.thrift.partial.ThriftMetadata$ThriftContainer`  

**Fields:**
- `public final org.apache.thrift.partial.ThriftMetadata$ThriftObject keyData`
- `public final org.apache.thrift.partial.ThriftMetadata$ThriftObject valueData`

**Methods:**
- `public boolean hasUnion()`
- `protected void toPrettyString(java.lang.StringBuilder p0, int p1)`

---

## public abstract static class `org.apache.thrift.partial.ThriftMetadata$ThriftObject`
implements `java.io.Serializable`  

**Fields:**
- `public java.lang.Object additionalData`
- `public final org.apache.thrift.meta_data.FieldMetaData data`
- `public final org.apache.thrift.TFieldIdEnum fieldId`
- `protected java.util.List noFields`
- `public final org.apache.thrift.partial.ThriftMetadata$ThriftObject parent`

**Methods:**
- `protected void append(java.lang.StringBuilder p0, java.lang.String p1, java.lang.Object... p2)`
- `protected java.lang.String getIndent(int p0)`
- `protected java.lang.String getName()`
- `protected java.lang.String getSubElementName(org.apache.thrift.TFieldIdEnum p0)`
- `protected java.lang.String getSubElementName(org.apache.thrift.TFieldIdEnum p0, java.lang.String p1)`
- `protected abstract void toPrettyString(java.lang.StringBuilder p0, int p1)`

---

## public static class `org.apache.thrift.partial.ThriftMetadata$ThriftPrimitive`
extends `org.apache.thrift.partial.ThriftMetadata$ThriftObject`  

**Methods:**
- `public boolean isBinary()`
- `protected void toPrettyString(java.lang.StringBuilder p0, int p1)`

---

## public static class `org.apache.thrift.partial.ThriftMetadata$ThriftSet`
extends `org.apache.thrift.partial.ThriftMetadata$ThriftContainer`  

**Fields:**
- `public final org.apache.thrift.partial.ThriftMetadata$ThriftObject elementData`

**Methods:**
- `public boolean hasUnion()`
- `protected void toPrettyString(java.lang.StringBuilder p0, int p1)`

---

## public static class `org.apache.thrift.partial.ThriftMetadata$ThriftStruct`<U extends org.apache.thrift.TBase>
extends `org.apache.thrift.partial.ThriftMetadata$ThriftStructBase`  

**Fields:**
- `public final java.util.Map fields`

**Methods:**
- `public <T extends org.apache.thrift.TBase> T createNewStruct()`
- `public static <T extends org.apache.thrift.TBase> org.apache.thrift.partial.ThriftMetadata$ThriftStruct fromFieldNames(java.lang.Class p0, java.util.Collection p1)`
- `public static <T extends org.apache.thrift.TBase> org.apache.thrift.partial.ThriftMetadata$ThriftStruct fromFields(java.lang.Class p0, java.lang.Iterable p1)`
- `public static <T extends org.apache.thrift.TBase> org.apache.thrift.partial.ThriftMetadata$ThriftStruct of(java.lang.Class p0)`
- `protected void toPrettyString(java.lang.StringBuilder p0, int p1)`
- `public java.lang.String toString()`

---

## public abstract static class `org.apache.thrift.partial.ThriftMetadata$ThriftStructBase`<U extends org.apache.thrift.TBase>
extends `org.apache.thrift.partial.ThriftMetadata$ThriftObject`  

**Constructors:**
- `public ThriftStructBase(org.apache.thrift.partial.ThriftMetadata$ThriftObject p0, org.apache.thrift.TFieldIdEnum p1, org.apache.thrift.meta_data.FieldMetaData p2)`

**Methods:**
- `public static org.apache.thrift.partial.ThriftMetadata$ThriftStructBase create(org.apache.thrift.partial.ThriftMetadata$ThriftObject p0, org.apache.thrift.TFieldIdEnum p1, org.apache.thrift.meta_data.FieldMetaData p2, java.lang.Iterable p3)`
- `public java.lang.Class getStructClass()`
- `public static <U extends org.apache.thrift.TBase> java.lang.Class getStructClass(org.apache.thrift.meta_data.FieldMetaData p0)`
- `public boolean isUnion()`
- `public static boolean isUnion(org.apache.thrift.meta_data.FieldMetaData p0)`

---

## public static class `org.apache.thrift.partial.ThriftMetadata$ThriftUnion`<U extends org.apache.thrift.TBase>
extends `org.apache.thrift.partial.ThriftMetadata$ThriftStructBase`  

**Constructors:**
- `public ThriftUnion(org.apache.thrift.partial.ThriftMetadata$ThriftObject p0, org.apache.thrift.TFieldIdEnum p1, org.apache.thrift.meta_data.FieldMetaData p2, java.lang.Iterable p3)`

**Methods:**
- `protected void toPrettyString(java.lang.StringBuilder p0, int p1)`

---

## public class `org.apache.thrift.partial.ThriftStructProcessor`
implements `org.apache.thrift.partial.ThriftFieldValueProcessor<org.apache.thrift.TBase>`  

**Constructors:**
- `public ThriftStructProcessor()`

**Methods:**
- `public java.lang.Object createNewList(int p0)`
- `public java.lang.Object createNewMap(int p0)`
- `public java.lang.Object createNewSet(int p0)`
- `public java.lang.Object createNewStruct(org.apache.thrift.partial.ThriftMetadata$ThriftStruct p0)`
- `public java.lang.Object prepareBinary(java.nio.ByteBuffer p0)`
- `public java.lang.Object prepareEnum(java.lang.Class p0, int p1)`
- `public java.lang.Object prepareList(java.lang.Object p0)`
- `public java.lang.Object prepareMap(java.lang.Object p0)`
- `public java.lang.Object prepareSet(java.lang.Object p0)`
- `public java.lang.Object prepareString(java.nio.ByteBuffer p0)`
- `public org.apache.thrift.TBase prepareStruct(java.lang.Object p0)`
- `public void setBinary(org.apache.thrift.TBase p0, org.apache.thrift.TFieldIdEnum p1, java.nio.ByteBuffer p2)`
- `public void setBool(org.apache.thrift.TBase p0, org.apache.thrift.TFieldIdEnum p1, boolean p2)`
- `public void setByte(org.apache.thrift.TBase p0, org.apache.thrift.TFieldIdEnum p1, byte p2)`
- `public void setDouble(org.apache.thrift.TBase p0, org.apache.thrift.TFieldIdEnum p1, double p2)`
- `public void setEnumField(org.apache.thrift.TBase p0, org.apache.thrift.TFieldIdEnum p1, java.lang.Object p2)`
- `public void setInt16(org.apache.thrift.TBase p0, org.apache.thrift.TFieldIdEnum p1, short p2)`
- `public void setInt32(org.apache.thrift.TBase p0, org.apache.thrift.TFieldIdEnum p1, int p2)`
- `public void setInt64(org.apache.thrift.TBase p0, org.apache.thrift.TFieldIdEnum p1, long p2)`
- `public void setListElement(java.lang.Object p0, int p1, java.lang.Object p2)`
- `public void setListField(org.apache.thrift.TBase p0, org.apache.thrift.TFieldIdEnum p1, java.lang.Object p2)`
- `public void setMapElement(java.lang.Object p0, int p1, java.lang.Object p2, java.lang.Object p3)`
- `public void setMapField(org.apache.thrift.TBase p0, org.apache.thrift.TFieldIdEnum p1, java.lang.Object p2)`
- `public void setSetElement(java.lang.Object p0, int p1, java.lang.Object p2)`
- `public void setSetField(org.apache.thrift.TBase p0, org.apache.thrift.TFieldIdEnum p1, java.lang.Object p2)`
- `public void setString(org.apache.thrift.TBase p0, org.apache.thrift.TFieldIdEnum p1, java.nio.ByteBuffer p2)`
- `public void setStructField(org.apache.thrift.TBase p0, org.apache.thrift.TFieldIdEnum p1, java.lang.Object p2)`

---

## public final class `org.apache.thrift.partial.Validate`

**Methods:**
- `public static void checkArgument(boolean p0, java.lang.String p1, java.lang.Object... p2)`
- `public static void checkGreater(long p0, java.lang.String p1, long p2, java.lang.String p3)`
- `public static void checkGreaterOrEqual(long p0, java.lang.String p1, long p2, java.lang.String p3)`
- `public static void checkIntegerMultiple(long p0, java.lang.String p1, long p2, java.lang.String p3)`
- `public static void checkLessOrEqual(long p0, java.lang.String p1, long p2, java.lang.String p3)`
- `public static void checkNotNegative(long p0, java.lang.String p1)`
- `public static void checkNotNull(java.lang.Object p0, java.lang.String p1)`
- `public static <T extends java.lang.Object> void checkNotNullAndNotEmpty(T[] p0, java.lang.String p1)`
- `public static void checkNotNullAndNotEmpty(byte[] p0, java.lang.String p1)`
- `public static void checkNotNullAndNotEmpty(int[] p0, java.lang.String p1)`
- `public static <T extends java.lang.Object> void checkNotNullAndNotEmpty(java.lang.Iterable p0, java.lang.String p1)`
- `public static void checkNotNullAndNotEmpty(java.lang.String p0, java.lang.String p1)`
- `public static void checkNotNullAndNotEmpty(long[] p0, java.lang.String p1)`
- `public static void checkNotNullAndNotEmpty(short[] p0, java.lang.String p1)`
- `public static <T extends java.lang.Object> void checkNotNullAndNumberOfElements(java.util.Collection p0, int p1, java.lang.String p2)`
- `public static void checkPathExists(java.nio.file.Path p0, java.lang.String p1)`
- `public static void checkPathExistsAsDir(java.nio.file.Path p0, java.lang.String p1)`
- `public static void checkPathExistsAsFile(java.nio.file.Path p0, java.lang.String p1)`
- `public static void checkPositiveInteger(long p0, java.lang.String p1)`
- `public static void checkRequired(boolean p0, java.lang.String p1)`
- `public static void checkState(boolean p0, java.lang.String p1, java.lang.Object... p2)`
- `public static void checkValid(boolean p0, java.lang.String p1)`
- `public static void checkValid(boolean p0, java.lang.String p1, java.lang.String p2)`
- `public static void checkValuesEqual(long p0, java.lang.String p1, long p2, java.lang.String p3)`
- `public static void checkWithinRange(double p0, java.lang.String p1, double p2, double p3)`
- `public static void checkWithinRange(long p0, java.lang.String p1, long p2, long p3)`

---

## public class `org.apache.thrift.protocol.TBinaryProtocol`
extends `org.apache.thrift.protocol.TProtocol`  

**Constructors:**
- `public TBinaryProtocol(org.apache.thrift.transport.TTransport p0)`
- `public TBinaryProtocol(org.apache.thrift.transport.TTransport p0, boolean p1, boolean p2)`
- `public TBinaryProtocol(org.apache.thrift.transport.TTransport p0, long p1, long p2)`
- `public TBinaryProtocol(org.apache.thrift.transport.TTransport p0, long p1, long p2, boolean p3, boolean p4)`

**Fields:**
- `protected final static int VERSION_1`
- `protected final static int VERSION_MASK`
- `protected boolean strictRead_`
- `protected boolean strictWrite_`

**Methods:**
- `public int getMinSerializedSize(byte p0) throws org.apache.thrift.transport.TTransportException`
- `public java.nio.ByteBuffer readBinary() throws org.apache.thrift.TException`
- `public boolean readBool() throws org.apache.thrift.TException`
- `public byte readByte() throws org.apache.thrift.TException`
- `public double readDouble() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TField readFieldBegin() throws org.apache.thrift.TException`
- `public int readFieldBeginData() throws org.apache.thrift.TException`
- `public void readFieldEnd() throws org.apache.thrift.TException`
- `public short readI16() throws org.apache.thrift.TException`
- `public int readI32() throws org.apache.thrift.TException`
- `public long readI64() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TList readListBegin() throws org.apache.thrift.TException`
- `public void readListEnd() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TMap readMapBegin() throws org.apache.thrift.TException`
- `public void readMapEnd() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TMessage readMessageBegin() throws org.apache.thrift.TException`
- `public void readMessageEnd() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TSet readSetBegin() throws org.apache.thrift.TException`
- `public void readSetEnd() throws org.apache.thrift.TException`
- `public java.lang.String readString() throws org.apache.thrift.TException`
- `public java.lang.String readStringBody(int p0) throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TStruct readStructBegin() throws org.apache.thrift.TException`
- `public void readStructEnd() throws org.apache.thrift.TException`
- `protected void skipBinary() throws org.apache.thrift.TException`
- `protected void skipBool() throws org.apache.thrift.TException`
- `protected void skipByte() throws org.apache.thrift.TException`
- `protected void skipDouble() throws org.apache.thrift.TException`
- `protected void skipI16() throws org.apache.thrift.TException`
- `protected void skipI32() throws org.apache.thrift.TException`
- `protected void skipI64() throws org.apache.thrift.TException`
- `public void writeBinary(java.nio.ByteBuffer p0) throws org.apache.thrift.TException`
- `public void writeBool(boolean p0) throws org.apache.thrift.TException`
- `public void writeByte(byte p0) throws org.apache.thrift.TException`
- `public void writeDouble(double p0) throws org.apache.thrift.TException`
- `public void writeFieldBegin(org.apache.thrift.protocol.TField p0) throws org.apache.thrift.TException`
- `public void writeFieldEnd() throws org.apache.thrift.TException`
- `public void writeFieldStop() throws org.apache.thrift.TException`
- `public void writeI16(short p0) throws org.apache.thrift.TException`
- `public void writeI32(int p0) throws org.apache.thrift.TException`
- `public void writeI64(long p0) throws org.apache.thrift.TException`
- `public void writeListBegin(org.apache.thrift.protocol.TList p0) throws org.apache.thrift.TException`
- `public void writeListEnd() throws org.apache.thrift.TException`
- `public void writeMapBegin(org.apache.thrift.protocol.TMap p0) throws org.apache.thrift.TException`
- `public void writeMapEnd() throws org.apache.thrift.TException`
- `public void writeMessageBegin(org.apache.thrift.protocol.TMessage p0) throws org.apache.thrift.TException`
- `public void writeMessageEnd() throws org.apache.thrift.TException`
- `public void writeSetBegin(org.apache.thrift.protocol.TSet p0) throws org.apache.thrift.TException`
- `public void writeSetEnd() throws org.apache.thrift.TException`
- `public void writeString(java.lang.String p0) throws org.apache.thrift.TException`
- `public void writeStructBegin(org.apache.thrift.protocol.TStruct p0) throws org.apache.thrift.TException`
- `public void writeStructEnd() throws org.apache.thrift.TException`

---

## public static class `org.apache.thrift.protocol.TBinaryProtocol$Factory`
implements `org.apache.thrift.protocol.TProtocolFactory`  

**Constructors:**
- `public Factory()`
- `public Factory(boolean p0, boolean p1)`
- `public Factory(boolean p0, boolean p1, long p2, long p3)`
- `public Factory(long p0, long p1)`

**Fields:**
- `protected long containerLengthLimit_`
- `protected boolean strictRead_`
- `protected boolean strictWrite_`
- `protected long stringLengthLimit_`

**Methods:**
- `public org.apache.thrift.protocol.TProtocol getProtocol(org.apache.thrift.transport.TTransport p0)`

---

## public class `org.apache.thrift.protocol.TCompactProtocol`
extends `org.apache.thrift.protocol.TProtocol`  

**Constructors:**
- `public TCompactProtocol(org.apache.thrift.transport.TTransport p0)`
- `public TCompactProtocol(org.apache.thrift.transport.TTransport p0, long p1)`
- `public TCompactProtocol(org.apache.thrift.transport.TTransport p0, long p1, long p2)`

**Methods:**
- `public int getMinSerializedSize(byte p0) throws org.apache.thrift.transport.TTransportException`
- `public java.nio.ByteBuffer readBinary() throws org.apache.thrift.TException`
- `public boolean readBool() throws org.apache.thrift.TException`
- `public byte readByte() throws org.apache.thrift.TException`
- `public double readDouble() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TField readFieldBegin() throws org.apache.thrift.TException`
- `public void readFieldEnd() throws org.apache.thrift.TException`
- `public short readI16() throws org.apache.thrift.TException`
- `public int readI32() throws org.apache.thrift.TException`
- `public long readI64() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TList readListBegin() throws org.apache.thrift.TException`
- `public void readListEnd() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TMap readMapBegin() throws org.apache.thrift.TException`
- `public void readMapEnd() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TMessage readMessageBegin() throws org.apache.thrift.TException`
- `public void readMessageEnd() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TSet readSetBegin() throws org.apache.thrift.TException`
- `public void readSetEnd() throws org.apache.thrift.TException`
- `public java.lang.String readString() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TStruct readStructBegin() throws org.apache.thrift.TException`
- `public void readStructEnd() throws org.apache.thrift.TException`
- `public void reset()`
- `protected void skipBinary() throws org.apache.thrift.TException`
- `public void writeBinary(java.nio.ByteBuffer p0) throws org.apache.thrift.TException`
- `public void writeBool(boolean p0) throws org.apache.thrift.TException`
- `public void writeByte(byte p0) throws org.apache.thrift.TException`
- `protected void writeCollectionBegin(byte p0, int p1) throws org.apache.thrift.TException`
- `public void writeDouble(double p0) throws org.apache.thrift.TException`
- `public void writeFieldBegin(org.apache.thrift.protocol.TField p0) throws org.apache.thrift.TException`
- `public void writeFieldEnd() throws org.apache.thrift.TException`
- `public void writeFieldStop() throws org.apache.thrift.TException`
- `public void writeI16(short p0) throws org.apache.thrift.TException`
- `public void writeI32(int p0) throws org.apache.thrift.TException`
- `public void writeI64(long p0) throws org.apache.thrift.TException`
- `public void writeListBegin(org.apache.thrift.protocol.TList p0) throws org.apache.thrift.TException`
- `public void writeListEnd() throws org.apache.thrift.TException`
- `public void writeMapBegin(org.apache.thrift.protocol.TMap p0) throws org.apache.thrift.TException`
- `public void writeMapEnd() throws org.apache.thrift.TException`
- `public void writeMessageBegin(org.apache.thrift.protocol.TMessage p0) throws org.apache.thrift.TException`
- `public void writeMessageEnd() throws org.apache.thrift.TException`
- `public void writeSetBegin(org.apache.thrift.protocol.TSet p0) throws org.apache.thrift.TException`
- `public void writeSetEnd() throws org.apache.thrift.TException`
- `public void writeString(java.lang.String p0) throws org.apache.thrift.TException`
- `public void writeStructBegin(org.apache.thrift.protocol.TStruct p0) throws org.apache.thrift.TException`
- `public void writeStructEnd() throws org.apache.thrift.TException`

---

## public static class `org.apache.thrift.protocol.TCompactProtocol$Factory`
implements `org.apache.thrift.protocol.TProtocolFactory`  

**Constructors:**
- `public Factory()`
- `public Factory(long p0)`
- `public Factory(long p0, long p1)`

**Methods:**
- `public org.apache.thrift.protocol.TProtocol getProtocol(org.apache.thrift.transport.TTransport p0)`

---

## public class `org.apache.thrift.protocol.TField`

**Constructors:**
- `public TField()`
- `public TField(java.lang.String p0, byte p1, short p2)`

**Fields:**
- `public final short id`
- `public final java.lang.String name`
- `public final byte type`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `org.apache.thrift.protocol.TJSONProtocol`
extends `org.apache.thrift.protocol.TProtocol`  

**Constructors:**
- `public TJSONProtocol(org.apache.thrift.transport.TTransport p0)`
- `public TJSONProtocol(org.apache.thrift.transport.TTransport p0, boolean p1)`

**Methods:**
- `public int getMinSerializedSize(byte p0) throws org.apache.thrift.transport.TTransportException`
- `public java.nio.ByteBuffer readBinary() throws org.apache.thrift.TException`
- `public boolean readBool() throws org.apache.thrift.TException`
- `public byte readByte() throws org.apache.thrift.TException`
- `public double readDouble() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TField readFieldBegin() throws org.apache.thrift.TException`
- `public void readFieldEnd() throws org.apache.thrift.TException`
- `public short readI16() throws org.apache.thrift.TException`
- `public int readI32() throws org.apache.thrift.TException`
- `public long readI64() throws org.apache.thrift.TException`
- `protected void readJSONSyntaxChar(byte[] p0) throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TList readListBegin() throws org.apache.thrift.TException`
- `public void readListEnd() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TMap readMapBegin() throws org.apache.thrift.TException`
- `public void readMapEnd() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TMessage readMessageBegin() throws org.apache.thrift.TException`
- `public void readMessageEnd() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TSet readSetBegin() throws org.apache.thrift.TException`
- `public void readSetEnd() throws org.apache.thrift.TException`
- `public java.lang.String readString() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TStruct readStructBegin() throws org.apache.thrift.TException`
- `public void readStructEnd() throws org.apache.thrift.TException`
- `public void reset()`
- `public void writeBinary(java.nio.ByteBuffer p0) throws org.apache.thrift.TException`
- `public void writeBool(boolean p0) throws org.apache.thrift.TException`
- `public void writeByte(byte p0) throws org.apache.thrift.TException`
- `public void writeDouble(double p0) throws org.apache.thrift.TException`
- `public void writeFieldBegin(org.apache.thrift.protocol.TField p0) throws org.apache.thrift.TException`
- `public void writeFieldEnd() throws org.apache.thrift.TException`
- `public void writeFieldStop()`
- `public void writeI16(short p0) throws org.apache.thrift.TException`
- `public void writeI32(int p0) throws org.apache.thrift.TException`
- `public void writeI64(long p0) throws org.apache.thrift.TException`
- `public void writeListBegin(org.apache.thrift.protocol.TList p0) throws org.apache.thrift.TException`
- `public void writeListEnd() throws org.apache.thrift.TException`
- `public void writeMapBegin(org.apache.thrift.protocol.TMap p0) throws org.apache.thrift.TException`
- `public void writeMapEnd() throws org.apache.thrift.TException`
- `public void writeMessageBegin(org.apache.thrift.protocol.TMessage p0) throws org.apache.thrift.TException`
- `public void writeMessageEnd() throws org.apache.thrift.TException`
- `public void writeSetBegin(org.apache.thrift.protocol.TSet p0) throws org.apache.thrift.TException`
- `public void writeSetEnd() throws org.apache.thrift.TException`
- `public void writeString(java.lang.String p0) throws org.apache.thrift.TException`
- `public void writeStructBegin(org.apache.thrift.protocol.TStruct p0) throws org.apache.thrift.TException`
- `public void writeStructEnd() throws org.apache.thrift.TException`

---

## public static class `org.apache.thrift.protocol.TJSONProtocol$Factory`
implements `org.apache.thrift.protocol.TProtocolFactory`  

**Constructors:**
- `public Factory()`
- `public Factory(boolean p0)`

**Fields:**
- `protected boolean fieldNamesAsString_`

**Methods:**
- `public org.apache.thrift.protocol.TProtocol getProtocol(org.apache.thrift.transport.TTransport p0)`

---

## protected class `org.apache.thrift.protocol.TJSONProtocol$JSONBaseContext`

**Constructors:**
- `protected JSONBaseContext()`

**Methods:**
- `protected boolean escapeNum()`
- `protected void read() throws org.apache.thrift.TException`
- `protected void write() throws org.apache.thrift.TException`

---

## protected class `org.apache.thrift.protocol.TJSONProtocol$JSONListContext`
extends `org.apache.thrift.protocol.TJSONProtocol$JSONBaseContext`  

**Constructors:**
- `protected JSONListContext()`

**Methods:**
- `protected void read() throws org.apache.thrift.TException`
- `protected void write() throws org.apache.thrift.TException`

---

## protected class `org.apache.thrift.protocol.TJSONProtocol$JSONPairContext`
extends `org.apache.thrift.protocol.TJSONProtocol$JSONBaseContext`  

**Constructors:**
- `protected JSONPairContext()`

**Methods:**
- `protected boolean escapeNum()`
- `protected void read() throws org.apache.thrift.TException`
- `protected void write() throws org.apache.thrift.TException`

---

## protected class `org.apache.thrift.protocol.TJSONProtocol$LookaheadReader`

**Constructors:**
- `protected LookaheadReader()`

**Methods:**
- `protected byte peek() throws org.apache.thrift.TException`
- `protected byte read() throws org.apache.thrift.TException`

---

## public final class `org.apache.thrift.protocol.TList`

**Constructors:**
- `public TList()`
- `public TList(byte p0, int p1)`

**Fields:**
- `public final byte elemType`
- `public final int size`

---

## public final class `org.apache.thrift.protocol.TMap`

**Constructors:**
- `public TMap()`
- `public TMap(byte p0, byte p1, int p2)`

**Fields:**
- `public final byte keyType`
- `public final int size`
- `public final byte valueType`

---

## public final class `org.apache.thrift.protocol.TMessage`

**Constructors:**
- `public TMessage()`
- `public TMessage(java.lang.String p0, byte p1, int p2)`

**Fields:**
- `public final java.lang.String name`
- `public final int seqid`
- `public final byte type`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public final class `org.apache.thrift.protocol.TMessageType`

**Constructors:**
- `public TMessageType()`

**Fields:**
- `public final static byte CALL`
- `public final static byte EXCEPTION`
- `public final static byte ONEWAY`
- `public final static byte REPLY`

---

## public class `org.apache.thrift.protocol.TMultiplexedProtocol`
extends `org.apache.thrift.protocol.TProtocolDecorator`  

**Constructors:**
- `public TMultiplexedProtocol(org.apache.thrift.protocol.TProtocol p0, java.lang.String p1)`

**Fields:**
- `public final static java.lang.String SEPARATOR`

**Methods:**
- `public void writeMessageBegin(org.apache.thrift.protocol.TMessage p0) throws org.apache.thrift.TException`

---

## public abstract class `org.apache.thrift.protocol.TProtocol`

**Constructors:**
- `protected TProtocol(org.apache.thrift.transport.TTransport p0)`

**Fields:**
- `protected byte[] skippedBytes`
- `protected org.apache.thrift.transport.TTransport trans_`

**Methods:**
- `protected void checkReadBytesAvailable(org.apache.thrift.protocol.TList p0) throws org.apache.thrift.TException`
- `protected void checkReadBytesAvailable(org.apache.thrift.protocol.TMap p0) throws org.apache.thrift.TException`
- `protected void checkReadBytesAvailable(org.apache.thrift.protocol.TSet p0) throws org.apache.thrift.TException`
- `public abstract int getMinSerializedSize(byte p0) throws org.apache.thrift.TException`
- `public java.lang.Class getScheme()`
- `public org.apache.thrift.transport.TTransport getTransport()`
- `public abstract java.nio.ByteBuffer readBinary() throws org.apache.thrift.TException`
- `public abstract boolean readBool() throws org.apache.thrift.TException`
- `public abstract byte readByte() throws org.apache.thrift.TException`
- `public abstract double readDouble() throws org.apache.thrift.TException`
- `public abstract org.apache.thrift.protocol.TField readFieldBegin() throws org.apache.thrift.TException`
- `public int readFieldBeginData() throws org.apache.thrift.TException`
- `public abstract void readFieldEnd() throws org.apache.thrift.TException`
- `public abstract short readI16() throws org.apache.thrift.TException`
- `public abstract int readI32() throws org.apache.thrift.TException`
- `public abstract long readI64() throws org.apache.thrift.TException`
- `public abstract org.apache.thrift.protocol.TList readListBegin() throws org.apache.thrift.TException`
- `public abstract void readListEnd() throws org.apache.thrift.TException`
- `public abstract org.apache.thrift.protocol.TMap readMapBegin() throws org.apache.thrift.TException`
- `public abstract void readMapEnd() throws org.apache.thrift.TException`
- `public abstract org.apache.thrift.protocol.TMessage readMessageBegin() throws org.apache.thrift.TException`
- `public abstract void readMessageEnd() throws org.apache.thrift.TException`
- `public abstract org.apache.thrift.protocol.TSet readSetBegin() throws org.apache.thrift.TException`
- `public abstract void readSetEnd() throws org.apache.thrift.TException`
- `public abstract java.lang.String readString() throws org.apache.thrift.TException`
- `public abstract org.apache.thrift.protocol.TStruct readStructBegin() throws org.apache.thrift.TException`
- `public abstract void readStructEnd() throws org.apache.thrift.TException`
- `public void reset()`
- `public void skip(byte p0) throws org.apache.thrift.TException`
- `public void skip(byte p0, int p1) throws org.apache.thrift.TException`
- `protected void skipBinary() throws org.apache.thrift.TException`
- `protected void skipBool() throws org.apache.thrift.TException`
- `protected void skipByte() throws org.apache.thrift.TException`
- `protected void skipBytes(int p0) throws org.apache.thrift.TException`
- `protected void skipDouble() throws org.apache.thrift.TException`
- `protected void skipI16() throws org.apache.thrift.TException`
- `protected void skipI32() throws org.apache.thrift.TException`
- `protected void skipI64() throws org.apache.thrift.TException`
- `public abstract void writeBinary(java.nio.ByteBuffer p0) throws org.apache.thrift.TException`
- `public abstract void writeBool(boolean p0) throws org.apache.thrift.TException`
- `public abstract void writeByte(byte p0) throws org.apache.thrift.TException`
- `public abstract void writeDouble(double p0) throws org.apache.thrift.TException`
- `public abstract void writeFieldBegin(org.apache.thrift.protocol.TField p0) throws org.apache.thrift.TException`
- `public abstract void writeFieldEnd() throws org.apache.thrift.TException`
- `public abstract void writeFieldStop() throws org.apache.thrift.TException`
- `public abstract void writeI16(short p0) throws org.apache.thrift.TException`
- `public abstract void writeI32(int p0) throws org.apache.thrift.TException`
- `public abstract void writeI64(long p0) throws org.apache.thrift.TException`
- `public abstract void writeListBegin(org.apache.thrift.protocol.TList p0) throws org.apache.thrift.TException`
- `public abstract void writeListEnd() throws org.apache.thrift.TException`
- `public abstract void writeMapBegin(org.apache.thrift.protocol.TMap p0) throws org.apache.thrift.TException`
- `public abstract void writeMapEnd() throws org.apache.thrift.TException`
- `public abstract void writeMessageBegin(org.apache.thrift.protocol.TMessage p0) throws org.apache.thrift.TException`
- `public abstract void writeMessageEnd() throws org.apache.thrift.TException`
- `public abstract void writeSetBegin(org.apache.thrift.protocol.TSet p0) throws org.apache.thrift.TException`
- `public abstract void writeSetEnd() throws org.apache.thrift.TException`
- `public abstract void writeString(java.lang.String p0) throws org.apache.thrift.TException`
- `public abstract void writeStructBegin(org.apache.thrift.protocol.TStruct p0) throws org.apache.thrift.TException`
- `public abstract void writeStructEnd() throws org.apache.thrift.TException`

---

## public abstract class `org.apache.thrift.protocol.TProtocolDecorator`
extends `org.apache.thrift.protocol.TProtocol`  

**Constructors:**
- `public TProtocolDecorator(org.apache.thrift.protocol.TProtocol p0)`

**Methods:**
- `public int getMinSerializedSize(byte p0) throws org.apache.thrift.TException`
- `public java.nio.ByteBuffer readBinary() throws org.apache.thrift.TException`
- `public boolean readBool() throws org.apache.thrift.TException`
- `public byte readByte() throws org.apache.thrift.TException`
- `public double readDouble() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TField readFieldBegin() throws org.apache.thrift.TException`
- `public void readFieldEnd() throws org.apache.thrift.TException`
- `public short readI16() throws org.apache.thrift.TException`
- `public int readI32() throws org.apache.thrift.TException`
- `public long readI64() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TList readListBegin() throws org.apache.thrift.TException`
- `public void readListEnd() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TMap readMapBegin() throws org.apache.thrift.TException`
- `public void readMapEnd() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TMessage readMessageBegin() throws org.apache.thrift.TException`
- `public void readMessageEnd() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TSet readSetBegin() throws org.apache.thrift.TException`
- `public void readSetEnd() throws org.apache.thrift.TException`
- `public java.lang.String readString() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TStruct readStructBegin() throws org.apache.thrift.TException`
- `public void readStructEnd() throws org.apache.thrift.TException`
- `public void writeBinary(java.nio.ByteBuffer p0) throws org.apache.thrift.TException`
- `public void writeBool(boolean p0) throws org.apache.thrift.TException`
- `public void writeByte(byte p0) throws org.apache.thrift.TException`
- `public void writeDouble(double p0) throws org.apache.thrift.TException`
- `public void writeFieldBegin(org.apache.thrift.protocol.TField p0) throws org.apache.thrift.TException`
- `public void writeFieldEnd() throws org.apache.thrift.TException`
- `public void writeFieldStop() throws org.apache.thrift.TException`
- `public void writeI16(short p0) throws org.apache.thrift.TException`
- `public void writeI32(int p0) throws org.apache.thrift.TException`
- `public void writeI64(long p0) throws org.apache.thrift.TException`
- `public void writeListBegin(org.apache.thrift.protocol.TList p0) throws org.apache.thrift.TException`
- `public void writeListEnd() throws org.apache.thrift.TException`
- `public void writeMapBegin(org.apache.thrift.protocol.TMap p0) throws org.apache.thrift.TException`
- `public void writeMapEnd() throws org.apache.thrift.TException`
- `public void writeMessageBegin(org.apache.thrift.protocol.TMessage p0) throws org.apache.thrift.TException`
- `public void writeMessageEnd() throws org.apache.thrift.TException`
- `public void writeSetBegin(org.apache.thrift.protocol.TSet p0) throws org.apache.thrift.TException`
- `public void writeSetEnd() throws org.apache.thrift.TException`
- `public void writeString(java.lang.String p0) throws org.apache.thrift.TException`
- `public void writeStructBegin(org.apache.thrift.protocol.TStruct p0) throws org.apache.thrift.TException`
- `public void writeStructEnd() throws org.apache.thrift.TException`

---

## public class `org.apache.thrift.protocol.TProtocolException`
extends `org.apache.thrift.TException`  

**Constructors:**
- `public TProtocolException()`
- `public TProtocolException(int p0)`
- `public TProtocolException(int p0, java.lang.String p1)`
- `public TProtocolException(int p0, java.lang.String p1, java.lang.Throwable p2)`
- `public TProtocolException(int p0, java.lang.Throwable p1)`
- `public TProtocolException(java.lang.String p0)`
- `public TProtocolException(java.lang.String p0, java.lang.Throwable p1)`
- `public TProtocolException(java.lang.Throwable p0)`

**Fields:**
- `public final static int BAD_VERSION`
- `public final static int DEPTH_LIMIT`
- `public final static int INVALID_DATA`
- `public final static int NEGATIVE_SIZE`
- `public final static int NOT_IMPLEMENTED`
- `public final static int SIZE_LIMIT`
- `public final static int UNKNOWN`
- `protected int type_`

**Methods:**
- `public int getType()`

---

## public abstract interface `org.apache.thrift.protocol.TProtocolFactory`
implements `java.io.Serializable`  

**Methods:**
- `public abstract org.apache.thrift.protocol.TProtocol getProtocol(org.apache.thrift.transport.TTransport p0)`

---

## public class `org.apache.thrift.protocol.TProtocolUtil`

**Constructors:**
- `public TProtocolUtil()`

**Methods:**
- `public static org.apache.thrift.protocol.TProtocolFactory guessProtocolFactory(byte[] p0, org.apache.thrift.protocol.TProtocolFactory p1)`
- `public static void setMaxSkipDepth(int p0)`
- `public static void skip(org.apache.thrift.protocol.TProtocol p0, byte p1) throws org.apache.thrift.TException`
- `public static void skip(org.apache.thrift.protocol.TProtocol p0, byte p1, int p2) throws org.apache.thrift.TException`

---

## public final class `org.apache.thrift.protocol.TSet`

**Constructors:**
- `public TSet()`
- `public TSet(byte p0, int p1)`
- `public TSet(org.apache.thrift.protocol.TList p0)`

**Fields:**
- `public final byte elemType`
- `public final int size`

---

## public class `org.apache.thrift.protocol.TSimpleJSONProtocol`
extends `org.apache.thrift.protocol.TProtocol`  

**Constructors:**
- `public TSimpleJSONProtocol(org.apache.thrift.transport.TTransport p0)`

**Fields:**
- `protected final org.apache.thrift.protocol.TSimpleJSONProtocol$Context BASE_CONTEXT`
- `protected java.util.Stack writeContextStack_`
- `protected org.apache.thrift.protocol.TSimpleJSONProtocol$Context writeContext_`

**Methods:**
- `public void _writeStringData(java.lang.String p0) throws org.apache.thrift.TException`
- `protected void assertContextIsNotMapKey(java.lang.String p0) throws org.apache.thrift.protocol.TSimpleJSONProtocol$CollectionMapKeyException`
- `public int getMinSerializedSize(byte p0) throws org.apache.thrift.TException`
- `protected void popWriteContext()`
- `protected void pushWriteContext(org.apache.thrift.protocol.TSimpleJSONProtocol$Context p0)`
- `public java.nio.ByteBuffer readBinary() throws org.apache.thrift.TException`
- `public boolean readBool() throws org.apache.thrift.TException`
- `public byte readByte() throws org.apache.thrift.TException`
- `public double readDouble() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TField readFieldBegin() throws org.apache.thrift.TException`
- `public void readFieldEnd() throws org.apache.thrift.TException`
- `public short readI16() throws org.apache.thrift.TException`
- `public int readI32() throws org.apache.thrift.TException`
- `public long readI64() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TList readListBegin() throws org.apache.thrift.TException`
- `public void readListEnd() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TMap readMapBegin() throws org.apache.thrift.TException`
- `public void readMapEnd() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TMessage readMessageBegin() throws org.apache.thrift.TException`
- `public void readMessageEnd() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TSet readSetBegin() throws org.apache.thrift.TException`
- `public void readSetEnd() throws org.apache.thrift.TException`
- `public java.lang.String readString() throws org.apache.thrift.TException`
- `public java.lang.String readStringBody(int p0) throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TStruct readStructBegin() throws org.apache.thrift.TException`
- `public void readStructEnd() throws org.apache.thrift.TException`
- `protected void resetWriteContext()`
- `public void writeBinary(java.nio.ByteBuffer p0) throws org.apache.thrift.TException`
- `public void writeBool(boolean p0) throws org.apache.thrift.TException`
- `public void writeByte(byte p0) throws org.apache.thrift.TException`
- `public void writeDouble(double p0) throws org.apache.thrift.TException`
- `public void writeFieldBegin(org.apache.thrift.protocol.TField p0) throws org.apache.thrift.TException`
- `public void writeFieldEnd() throws org.apache.thrift.TException`
- `public void writeFieldStop() throws org.apache.thrift.TException`
- `public void writeI16(short p0) throws org.apache.thrift.TException`
- `public void writeI32(int p0) throws org.apache.thrift.TException`
- `public void writeI64(long p0) throws org.apache.thrift.TException`
- `public void writeListBegin(org.apache.thrift.protocol.TList p0) throws org.apache.thrift.TException`
- `public void writeListEnd() throws org.apache.thrift.TException`
- `public void writeMapBegin(org.apache.thrift.protocol.TMap p0) throws org.apache.thrift.TException`
- `public void writeMapEnd() throws org.apache.thrift.TException`
- `public void writeMessageBegin(org.apache.thrift.protocol.TMessage p0) throws org.apache.thrift.TException`
- `public void writeMessageEnd() throws org.apache.thrift.TException`
- `public void writeSetBegin(org.apache.thrift.protocol.TSet p0) throws org.apache.thrift.TException`
- `public void writeSetEnd() throws org.apache.thrift.TException`
- `public void writeString(java.lang.String p0) throws org.apache.thrift.TException`
- `public void writeStructBegin(org.apache.thrift.protocol.TStruct p0) throws org.apache.thrift.TException`
- `public void writeStructEnd() throws org.apache.thrift.TException`

---

## public static class `org.apache.thrift.protocol.TSimpleJSONProtocol$CollectionMapKeyException`
extends `org.apache.thrift.TException`  

**Constructors:**
- `public CollectionMapKeyException(java.lang.String p0)`

---

## protected class `org.apache.thrift.protocol.TSimpleJSONProtocol$Context`

**Constructors:**
- `protected Context()`

**Methods:**
- `protected boolean isMapKey()`
- `protected void write() throws org.apache.thrift.TException`

---

## public static class `org.apache.thrift.protocol.TSimpleJSONProtocol$Factory`
implements `org.apache.thrift.protocol.TProtocolFactory`  

**Constructors:**
- `public Factory()`

**Methods:**
- `public org.apache.thrift.protocol.TProtocol getProtocol(org.apache.thrift.transport.TTransport p0)`

---

## protected class `org.apache.thrift.protocol.TSimpleJSONProtocol$ListContext`
extends `org.apache.thrift.protocol.TSimpleJSONProtocol$Context`  

**Constructors:**
- `protected ListContext()`

**Fields:**
- `protected boolean first_`

**Methods:**
- `protected void write() throws org.apache.thrift.TException`

---

## protected class `org.apache.thrift.protocol.TSimpleJSONProtocol$MapContext`
extends `org.apache.thrift.protocol.TSimpleJSONProtocol$StructContext`  

**Constructors:**
- `protected MapContext()`

**Fields:**
- `protected boolean isKey`

**Methods:**
- `protected boolean isMapKey()`
- `protected void write() throws org.apache.thrift.TException`

---

## protected class `org.apache.thrift.protocol.TSimpleJSONProtocol$StructContext`
extends `org.apache.thrift.protocol.TSimpleJSONProtocol$Context`  

**Constructors:**
- `protected StructContext()`

**Fields:**
- `protected boolean colon_`
- `protected boolean first_`

**Methods:**
- `protected void write() throws org.apache.thrift.TException`

---

## public final class `org.apache.thrift.protocol.TStruct`

**Constructors:**
- `public TStruct()`
- `public TStruct(java.lang.String p0)`

**Fields:**
- `public final java.lang.String name`

---

## public final class `org.apache.thrift.protocol.TTupleProtocol`
extends `org.apache.thrift.protocol.TCompactProtocol`  

**Constructors:**
- `public TTupleProtocol(org.apache.thrift.transport.TTransport p0)`

**Methods:**
- `public static java.util.BitSet fromByteArray(byte[] p0)`
- `public java.lang.Class getScheme()`
- `public java.util.BitSet readBitSet(int p0) throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TList readListBegin(byte p0) throws org.apache.thrift.TException`
- `public void readListEnd() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TMap readMapBegin(byte p0, byte p1) throws org.apache.thrift.TException`
- `public void readMapEnd() throws org.apache.thrift.TException`
- `public org.apache.thrift.protocol.TSet readSetBegin(byte p0) throws org.apache.thrift.TException`
- `public void readSetEnd() throws org.apache.thrift.TException`
- `public static byte[] toByteArray(java.util.BitSet p0, int p1)`
- `public void writeBitSet(java.util.BitSet p0, int p1) throws org.apache.thrift.TException`

---

## public static class `org.apache.thrift.protocol.TTupleProtocol$Factory`
implements `org.apache.thrift.protocol.TProtocolFactory`  

**Constructors:**
- `public Factory()`

**Methods:**
- `public org.apache.thrift.protocol.TProtocol getProtocol(org.apache.thrift.transport.TTransport p0)`

---

## public final class `org.apache.thrift.protocol.TType`

**Constructors:**
- `public TType()`

**Fields:**
- `public final static byte BOOL`
- `public final static byte BYTE`
- `public final static byte DOUBLE`
- `public final static byte ENUM`
- `public final static byte I16`
- `public final static byte I32`
- `public final static byte I64`
- `public final static byte LIST`
- `public final static byte MAP`
- `public final static byte SET`
- `public final static byte STOP`
- `public final static byte STRING`
- `public final static byte STRUCT`
- `public final static byte VOID`

---

## public abstract interface `org.apache.thrift.scheme.IScheme`<T extends org.apache.thrift.TBase>

**Methods:**
- `public abstract void read(org.apache.thrift.protocol.TProtocol p0, T p1) throws org.apache.thrift.TException`
- `public abstract void write(org.apache.thrift.protocol.TProtocol p0, T p1) throws org.apache.thrift.TException`

---

## public abstract interface `org.apache.thrift.scheme.SchemeFactory`

**Methods:**
- `public abstract <S extends org.apache.thrift.scheme.IScheme> S getScheme()`

---

## public abstract class `org.apache.thrift.scheme.StandardScheme`<T extends org.apache.thrift.TBase>
implements `org.apache.thrift.scheme.IScheme<T>`  

**Constructors:**
- `public StandardScheme()`

---

## public abstract class `org.apache.thrift.scheme.TupleScheme`<T extends org.apache.thrift.TBase>
implements `org.apache.thrift.scheme.IScheme<T>`  

**Constructors:**
- `public TupleScheme()`

---

## public abstract class `org.apache.thrift.server.AbstractNonblockingServer`
extends `org.apache.thrift.server.TServer`  

**Constructors:**
- `public AbstractNonblockingServer(org.apache.thrift.server.AbstractNonblockingServer$AbstractNonblockingServerArgs p0)`

**Fields:**
- `protected final org.slf4j.Logger LOGGER`

**Methods:**
- `protected abstract boolean requestInvoke(org.apache.thrift.server.AbstractNonblockingServer$FrameBuffer p0)`
- `public void serve()`
- `protected boolean startListening()`
- `protected abstract boolean startThreads()`
- `protected void stopListening()`
- `protected abstract void waitForShutdown()`

---

## public abstract static class `org.apache.thrift.server.AbstractNonblockingServer$AbstractNonblockingServerArgs`<T extends org.apache.thrift.server.AbstractNonblockingServer$AbstractNonblockingServerArgs<T>>
extends `org.apache.thrift.server.TServer$AbstractServerArgs`  

**Constructors:**
- `public AbstractNonblockingServerArgs(org.apache.thrift.transport.TNonblockingServerTransport p0)`

**Fields:**
- `public long maxReadBufferBytes`

---

## protected abstract class `org.apache.thrift.server.AbstractNonblockingServer$AbstractSelectThread`
extends `java.lang.Thread`  

**Constructors:**
- `public AbstractSelectThread() throws java.io.IOException`

**Fields:**
- `protected final java.util.Set selectInterestChanges`
- `protected java.nio.channels.Selector selector`

**Methods:**
- `protected void cleanupSelectionKey(java.nio.channels.SelectionKey p0)`
- `protected void handleRead(java.nio.channels.SelectionKey p0)`
- `protected void handleWrite(java.nio.channels.SelectionKey p0)`
- `protected void processInterestChanges()`
- `public void requestSelectInterestChange(org.apache.thrift.server.AbstractNonblockingServer$FrameBuffer p0)`
- `public void wakeupSelector()`

---

## public class `org.apache.thrift.server.AbstractNonblockingServer$AsyncFrameBuffer`
extends `org.apache.thrift.server.AbstractNonblockingServer$FrameBuffer`  

**Constructors:**
- `public AsyncFrameBuffer(org.apache.thrift.transport.TNonblockingTransport p0, java.nio.channels.SelectionKey p1, org.apache.thrift.server.AbstractNonblockingServer$AbstractSelectThread p2) throws org.apache.thrift.transport.TTransportException`

**Methods:**
- `public org.apache.thrift.protocol.TProtocol getInputProtocol()`
- `public org.apache.thrift.protocol.TProtocol getOutputProtocol()`
- `public void invoke()`

---

## public class `org.apache.thrift.server.AbstractNonblockingServer$FrameBuffer`

**Constructors:**
- `public FrameBuffer(org.apache.thrift.transport.TNonblockingTransport p0, java.nio.channels.SelectionKey p1, org.apache.thrift.server.AbstractNonblockingServer$AbstractSelectThread p2) throws org.apache.thrift.transport.TTransportException`

**Fields:**
- `protected java.nio.ByteBuffer buffer_`
- `protected final org.apache.thrift.server.ServerContext context_`
- `protected final org.apache.thrift.transport.TMemoryInputTransport frameTrans_`
- `protected final org.apache.thrift.protocol.TProtocol inProt_`
- `protected final org.apache.thrift.transport.TTransport inTrans_`
- `protected final org.apache.thrift.protocol.TProtocol outProt_`
- `protected final org.apache.thrift.transport.TTransport outTrans_`
- `protected final org.apache.thrift.TByteArrayOutputStream response_`
- `protected final org.apache.thrift.server.AbstractNonblockingServer$AbstractSelectThread selectThread_`
- `protected final java.nio.channels.SelectionKey selectionKey_`
- `protected org.apache.thrift.server.AbstractNonblockingServer$FrameBufferState state_`
- `protected final org.apache.thrift.transport.TNonblockingTransport trans_`

**Methods:**
- `public void changeSelectInterests()`
- `public void close()`
- `public void invoke()`
- `public boolean isFrameFullyRead()`
- `public boolean read()`
- `protected void requestSelectInterestChange()`
- `public void responseReady()`
- `public boolean write()`

---

## public abstract interface `org.apache.thrift.server.ServerContext`

**Methods:**
- `public abstract boolean isWrapperFor(java.lang.Class p0)`
- `public abstract <T extends java.lang.Object> T unwrap(java.lang.Class p0)`

---

## public abstract class `org.apache.thrift.server.TExtensibleServlet`
extends `javax.servlet.http.HttpServlet`  

**Constructors:**
- `public TExtensibleServlet()`

**Methods:**
- `public void addCustomHeader(java.lang.String p0, java.lang.String p1)`
- `protected void doGet(javax.servlet.http.HttpServletRequest p0, javax.servlet.http.HttpServletResponse p1) throws java.io.IOException, javax.servlet.ServletException`
- `protected void doPost(javax.servlet.http.HttpServletRequest p0, javax.servlet.http.HttpServletResponse p1) throws java.io.IOException, javax.servlet.ServletException`
- `protected abstract org.apache.thrift.protocol.TProtocolFactory getInProtocolFactory()`
- `protected abstract org.apache.thrift.protocol.TProtocolFactory getOutProtocolFactory()`
- `protected abstract org.apache.thrift.TProcessor getProcessor()`
- `public final void init(javax.servlet.ServletConfig p0) throws javax.servlet.ServletException`
- `public void setCustomHeaders(java.util.Collection p0)`

---

## public class `org.apache.thrift.server.THsHaServer`
extends `org.apache.thrift.server.TNonblockingServer`  

**Constructors:**
- `public THsHaServer(org.apache.thrift.server.THsHaServer$Args p0)`

**Methods:**
- `protected static java.util.concurrent.ExecutorService createInvokerPool(org.apache.thrift.server.THsHaServer$Args p0)`
- `protected java.util.concurrent.ExecutorService getInvoker()`
- `protected java.lang.Runnable getRunnable(org.apache.thrift.server.AbstractNonblockingServer$FrameBuffer p0)`
- `protected void gracefullyShutdownInvokerPool()`
- `protected boolean requestInvoke(org.apache.thrift.server.AbstractNonblockingServer$FrameBuffer p0)`
- `protected void waitForShutdown()`

---

## public static class `org.apache.thrift.server.THsHaServer$Args`
extends `org.apache.thrift.server.AbstractNonblockingServer$AbstractNonblockingServerArgs`  

**Constructors:**
- `public Args(org.apache.thrift.transport.TNonblockingServerTransport p0)`

**Fields:**
- `public int maxWorkerThreads`
- `public int minWorkerThreads`

**Methods:**
- `public org.apache.thrift.server.THsHaServer$Args executorService(java.util.concurrent.ExecutorService p0)`
- `public java.util.concurrent.ExecutorService getExecutorService()`
- `public int getMaxWorkerThreads()`
- `public int getMinWorkerThreads()`
- `public java.util.concurrent.TimeUnit getStopTimeoutUnit()`
- `public int getStopTimeoutVal()`
- `public int getWorkerThreads()`
- `public org.apache.thrift.server.THsHaServer$Args maxWorkerThreads(int p0)`
- `public org.apache.thrift.server.THsHaServer$Args minWorkerThreads(int p0)`
- `public org.apache.thrift.server.THsHaServer$Args stopTimeoutUnit(java.util.concurrent.TimeUnit p0)`
- `public org.apache.thrift.server.THsHaServer$Args stopTimeoutVal(int p0)`
- `public org.apache.thrift.server.THsHaServer$Args workerThreads(int p0)`

---

## public class `org.apache.thrift.server.TNonblockingServer`
extends `org.apache.thrift.server.AbstractNonblockingServer`  

**Constructors:**
- `public TNonblockingServer(org.apache.thrift.server.AbstractNonblockingServer$AbstractNonblockingServerArgs p0)`

**Methods:**
- `public boolean isStopped()`
- `protected void joinSelector()`
- `protected boolean requestInvoke(org.apache.thrift.server.AbstractNonblockingServer$FrameBuffer p0)`
- `protected boolean startThreads()`
- `public void stop()`
- `protected void waitForShutdown()`

---

## public static class `org.apache.thrift.server.TNonblockingServer$Args`
extends `org.apache.thrift.server.AbstractNonblockingServer$AbstractNonblockingServerArgs`  

**Constructors:**
- `public Args(org.apache.thrift.transport.TNonblockingServerTransport p0)`

---

## protected class `org.apache.thrift.server.TNonblockingServer$SelectAcceptThread`
extends `org.apache.thrift.server.AbstractNonblockingServer$AbstractSelectThread`  

**Constructors:**
- `public SelectAcceptThread(org.apache.thrift.transport.TNonblockingServerTransport p0) throws java.io.IOException`

**Methods:**
- `protected org.apache.thrift.server.AbstractNonblockingServer$FrameBuffer createFrameBuffer(org.apache.thrift.transport.TNonblockingTransport p0, java.nio.channels.SelectionKey p1, org.apache.thrift.server.AbstractNonblockingServer$AbstractSelectThread p2) throws org.apache.thrift.transport.TTransportException`
- `public boolean isStopped()`
- `public void run()`

---

## public class `org.apache.thrift.server.TSaslNonblockingServer`
extends `org.apache.thrift.server.TServer`  

**Constructors:**
- `public TSaslNonblockingServer(org.apache.thrift.server.TSaslNonblockingServer$Args p0) throws java.io.IOException`

**Methods:**
- `public void serve()`
- `public void shutdown() throws java.lang.InterruptedException`
- `public void stop()`

---

## public static class `org.apache.thrift.server.TSaslNonblockingServer$Args`
extends `org.apache.thrift.server.TServer$AbstractServerArgs`  

**Constructors:**
- `public Args(org.apache.thrift.transport.TNonblockingServerTransport p0)`

**Methods:**
- `public org.apache.thrift.server.TSaslNonblockingServer$Args addSaslMechanism(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.Map p3, javax.security.auth.callback.CallbackHandler p4)`
- `public org.apache.thrift.server.TSaslNonblockingServer$Args networkThreads(int p0)`
- `public org.apache.thrift.server.TSaslNonblockingServer$Args processingThreads(int p0)`
- `public org.apache.thrift.server.TSaslNonblockingServer$Args processor(org.apache.thrift.TProcessor p0)`
- `public org.apache.thrift.server.TSaslNonblockingServer$Args saslProcessorFactory(org.apache.thrift.transport.sasl.TSaslProcessorFactory p0)`
- `public org.apache.thrift.server.TSaslNonblockingServer$Args saslServerFactory(org.apache.thrift.transport.sasl.TSaslServerFactory p0)`
- `public org.apache.thrift.server.TSaslNonblockingServer$Args saslThreads(int p0)`

---

## public abstract class `org.apache.thrift.server.TServer`

**Constructors:**
- `protected TServer(org.apache.thrift.server.TServer$AbstractServerArgs p0)`

**Fields:**
- `protected org.apache.thrift.server.TServerEventHandler eventHandler_`
- `protected org.apache.thrift.protocol.TProtocolFactory inputProtocolFactory_`
- `protected org.apache.thrift.transport.TTransportFactory inputTransportFactory_`
- `protected org.apache.thrift.protocol.TProtocolFactory outputProtocolFactory_`
- `protected org.apache.thrift.transport.TTransportFactory outputTransportFactory_`
- `protected org.apache.thrift.TProcessorFactory processorFactory_`
- `protected org.apache.thrift.transport.TServerTransport serverTransport_`
- `protected volatile boolean stopped_`

**Methods:**
- `public org.apache.thrift.server.TServerEventHandler getEventHandler()`
- `public boolean getShouldStop()`
- `public boolean isServing()`
- `public abstract void serve()`
- `public void setServerEventHandler(org.apache.thrift.server.TServerEventHandler p0)`
- `protected void setServing(boolean p0)`
- `public void setShouldStop(boolean p0)`
- `public void stop()`

---

## public abstract static class `org.apache.thrift.server.TServer$AbstractServerArgs`<T extends org.apache.thrift.server.TServer$AbstractServerArgs<T>>

**Constructors:**
- `public AbstractServerArgs(org.apache.thrift.transport.TServerTransport p0)`

**Methods:**
- `public T inputProtocolFactory(org.apache.thrift.protocol.TProtocolFactory p0)`
- `public T inputTransportFactory(org.apache.thrift.transport.TTransportFactory p0)`
- `public T outputProtocolFactory(org.apache.thrift.protocol.TProtocolFactory p0)`
- `public T outputTransportFactory(org.apache.thrift.transport.TTransportFactory p0)`
- `public T processor(org.apache.thrift.TProcessor p0)`
- `public T processorFactory(org.apache.thrift.TProcessorFactory p0)`
- `public T protocolFactory(org.apache.thrift.protocol.TProtocolFactory p0)`
- `public T transportFactory(org.apache.thrift.transport.TTransportFactory p0)`

---

## public static class `org.apache.thrift.server.TServer$Args`
extends `org.apache.thrift.server.TServer$AbstractServerArgs`  

**Constructors:**
- `public Args(org.apache.thrift.transport.TServerTransport p0)`

---

## public abstract interface `org.apache.thrift.server.TServerEventHandler`

**Methods:**
- `public abstract org.apache.thrift.server.ServerContext createContext(org.apache.thrift.protocol.TProtocol p0, org.apache.thrift.protocol.TProtocol p1)`
- `public abstract void deleteContext(org.apache.thrift.server.ServerContext p0, org.apache.thrift.protocol.TProtocol p1, org.apache.thrift.protocol.TProtocol p2)`
- `public abstract void preServe()`
- `public abstract void processContext(org.apache.thrift.server.ServerContext p0, org.apache.thrift.transport.TTransport p1, org.apache.thrift.transport.TTransport p2)`

---

## public class `org.apache.thrift.server.TServlet`
extends `javax.servlet.http.HttpServlet`  

**Constructors:**
- `public TServlet(org.apache.thrift.TProcessor p0, org.apache.thrift.protocol.TProtocolFactory p1)`
- `public TServlet(org.apache.thrift.TProcessor p0, org.apache.thrift.protocol.TProtocolFactory p1, org.apache.thrift.protocol.TProtocolFactory p2)`

**Methods:**
- `public void addCustomHeader(java.lang.String p0, java.lang.String p1)`
- `protected void doGet(javax.servlet.http.HttpServletRequest p0, javax.servlet.http.HttpServletResponse p1) throws java.io.IOException, javax.servlet.ServletException`
- `protected void doPost(javax.servlet.http.HttpServletRequest p0, javax.servlet.http.HttpServletResponse p1) throws java.io.IOException, javax.servlet.ServletException`
- `public void setCustomHeaders(java.util.Collection p0)`

---

## public class `org.apache.thrift.server.TSimpleServer`
extends `org.apache.thrift.server.TServer`  

**Constructors:**
- `public TSimpleServer(org.apache.thrift.server.TServer$AbstractServerArgs p0)`

**Methods:**
- `public void serve()`
- `public void stop()`

---

## public class `org.apache.thrift.server.TThreadPoolServer`
extends `org.apache.thrift.server.TServer`  

**Constructors:**
- `public TThreadPoolServer(org.apache.thrift.server.TThreadPoolServer$Args p0)`

**Methods:**
- `protected void execute()`
- `protected java.util.concurrent.ExecutorService getExecutorService()`
- `protected boolean preServe()`
- `public void serve()`
- `public void stop()`
- `protected boolean waitForShutdown()`

---

## public static class `org.apache.thrift.server.TThreadPoolServer$Args`
extends `org.apache.thrift.server.TServer$AbstractServerArgs`  

**Constructors:**
- `public Args(org.apache.thrift.transport.TServerTransport p0)`

**Fields:**
- `public java.util.concurrent.ExecutorService executorService`
- `public int maxWorkerThreads`
- `public int minWorkerThreads`
- `public java.util.concurrent.TimeUnit stopTimeoutUnit`
- `public int stopTimeoutVal`

**Methods:**
- `public org.apache.thrift.server.TThreadPoolServer$Args executorService(java.util.concurrent.ExecutorService p0)`
- `public org.apache.thrift.server.TThreadPoolServer$Args maxWorkerThreads(int p0)`
- `public org.apache.thrift.server.TThreadPoolServer$Args minWorkerThreads(int p0)`
- `public org.apache.thrift.server.TThreadPoolServer$Args stopTimeoutUnit(java.util.concurrent.TimeUnit p0)`
- `public org.apache.thrift.server.TThreadPoolServer$Args stopTimeoutVal(int p0)`

---

## public class `org.apache.thrift.server.TThreadedSelectorServer`
extends `org.apache.thrift.server.AbstractNonblockingServer`  

**Constructors:**
- `public TThreadedSelectorServer(org.apache.thrift.server.TThreadedSelectorServer$Args p0)`

**Methods:**
- `protected static java.util.concurrent.ExecutorService createDefaultExecutor(org.apache.thrift.server.TThreadedSelectorServer$Args p0)`
- `protected org.apache.thrift.server.TThreadedSelectorServer$SelectorThreadLoadBalancer createSelectorThreadLoadBalancer(java.util.Collection p0)`
- `protected java.lang.Runnable getRunnable(org.apache.thrift.server.AbstractNonblockingServer$FrameBuffer p0)`
- `protected void gracefullyShutdownInvokerPool()`
- `protected void joinThreads() throws java.lang.InterruptedException`
- `protected boolean requestInvoke(org.apache.thrift.server.AbstractNonblockingServer$FrameBuffer p0)`
- `protected boolean startThreads()`
- `public void stop()`
- `protected void waitForShutdown()`

---

## protected class `org.apache.thrift.server.TThreadedSelectorServer$AcceptThread`
extends `java.lang.Thread`  

**Constructors:**
- `public AcceptThread(org.apache.thrift.transport.TNonblockingServerTransport p0, org.apache.thrift.server.TThreadedSelectorServer$SelectorThreadLoadBalancer p1) throws java.io.IOException`

**Methods:**
- `public void run()`
- `public void wakeupSelector()`

---

## public static class `org.apache.thrift.server.TThreadedSelectorServer$Args`
extends `org.apache.thrift.server.AbstractNonblockingServer$AbstractNonblockingServerArgs`  

**Constructors:**
- `public Args(org.apache.thrift.transport.TNonblockingServerTransport p0)`

**Fields:**
- `public int selectorThreads`

**Methods:**
- `public org.apache.thrift.server.TThreadedSelectorServer$Args acceptPolicy(org.apache.thrift.server.TThreadedSelectorServer$Args$AcceptPolicy p0)`
- `public org.apache.thrift.server.TThreadedSelectorServer$Args acceptQueueSizePerThread(int p0)`
- `public org.apache.thrift.server.TThreadedSelectorServer$Args executorService(java.util.concurrent.ExecutorService p0)`
- `public org.apache.thrift.server.TThreadedSelectorServer$Args$AcceptPolicy getAcceptPolicy()`
- `public int getAcceptQueueSizePerThread()`
- `public java.util.concurrent.ExecutorService getExecutorService()`
- `public int getSelectorThreads()`
- `public java.util.concurrent.TimeUnit getStopTimeoutUnit()`
- `public int getStopTimeoutVal()`
- `public int getWorkerThreads()`
- `public org.apache.thrift.server.TThreadedSelectorServer$Args selectorThreads(int p0)`
- `public org.apache.thrift.server.TThreadedSelectorServer$Args stopTimeoutUnit(java.util.concurrent.TimeUnit p0)`
- `public org.apache.thrift.server.TThreadedSelectorServer$Args stopTimeoutVal(int p0)`
- `public void validate()`
- `public org.apache.thrift.server.TThreadedSelectorServer$Args workerThreads(int p0)`

---

## public final static enum `org.apache.thrift.server.TThreadedSelectorServer$Args$AcceptPolicy`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.apache.thrift.server.TThreadedSelectorServer$Args$AcceptPolicy FAIR_ACCEPT`
- `public final static org.apache.thrift.server.TThreadedSelectorServer$Args$AcceptPolicy FAST_ACCEPT`

---

## protected class `org.apache.thrift.server.TThreadedSelectorServer$SelectorThread`
extends `org.apache.thrift.server.AbstractNonblockingServer$AbstractSelectThread`  

**Constructors:**
- `public SelectorThread() throws java.io.IOException`
- `public SelectorThread(int p0) throws java.io.IOException`
- `public SelectorThread(java.util.concurrent.BlockingQueue p0) throws java.io.IOException`

**Methods:**
- `public boolean addAcceptedConnection(org.apache.thrift.transport.TNonblockingTransport p0)`
- `protected org.apache.thrift.server.AbstractNonblockingServer$FrameBuffer createFrameBuffer(org.apache.thrift.transport.TNonblockingTransport p0, java.nio.channels.SelectionKey p1, org.apache.thrift.server.AbstractNonblockingServer$AbstractSelectThread p2) throws org.apache.thrift.transport.TTransportException`
- `public void run()`

---

## protected static class `org.apache.thrift.server.TThreadedSelectorServer$SelectorThreadLoadBalancer`

**Constructors:**
- `public SelectorThreadLoadBalancer(java.util.Collection p0)`

**Methods:**
- `public org.apache.thrift.server.TThreadedSelectorServer$SelectorThread nextThread()`

---

## public class `org.apache.thrift.transport.AutoExpandingBuffer`

**Constructors:**
- `public AutoExpandingBuffer(int p0)`

**Methods:**
- `public byte[] array()`
- `public void resizeIfNecessary(int p0)`

---

## public class `org.apache.thrift.transport.AutoExpandingBufferReadTransport`
extends `org.apache.thrift.transport.TEndpointTransport`  

**Constructors:**
- `public AutoExpandingBufferReadTransport(org.apache.thrift.TConfiguration p0, int p1) throws org.apache.thrift.transport.TTransportException`

**Methods:**
- `public void close()`
- `public final void consumeBuffer(int p0)`
- `public void fill(org.apache.thrift.transport.TTransport p0, int p1) throws org.apache.thrift.transport.TTransportException`
- `public final byte[] getBuffer()`
- `public final int getBufferPosition()`
- `public final int getBytesRemainingInBuffer()`
- `public boolean isOpen()`
- `public void open() throws org.apache.thrift.transport.TTransportException`
- `public final int read(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`
- `public void write(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`

---

## public final class `org.apache.thrift.transport.AutoExpandingBufferWriteTransport`
extends `org.apache.thrift.transport.TEndpointTransport`  

**Constructors:**
- `public AutoExpandingBufferWriteTransport(org.apache.thrift.TConfiguration p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`

**Methods:**
- `public void close()`
- `public org.apache.thrift.transport.AutoExpandingBuffer getBuf()`
- `public int getLength()`
- `public boolean isOpen()`
- `public void open() throws org.apache.thrift.transport.TTransportException`
- `public int read(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`
- `public void reset()`
- `public void write(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`

---

## public final class `org.apache.thrift.transport.TByteBuffer`
extends `org.apache.thrift.transport.TEndpointTransport`  

**Constructors:**
- `public TByteBuffer(java.nio.ByteBuffer p0) throws org.apache.thrift.transport.TTransportException`

**Methods:**
- `public org.apache.thrift.transport.TByteBuffer clear()`
- `public void close()`
- `public org.apache.thrift.transport.TByteBuffer flip()`
- `public java.nio.ByteBuffer getByteBuffer()`
- `public boolean isOpen()`
- `public void open()`
- `public int read(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`
- `public byte[] toByteArray()`
- `public void write(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`

---

## public class `org.apache.thrift.transport.TEOFException`
extends `org.apache.thrift.transport.TTransportException`  

**Constructors:**
- `public TEOFException(java.lang.String p0)`

---

## public abstract class `org.apache.thrift.transport.TEndpointTransport`
extends `org.apache.thrift.transport.TTransport`  

**Constructors:**
- `public TEndpointTransport(org.apache.thrift.TConfiguration p0) throws org.apache.thrift.transport.TTransportException`

**Fields:**
- `protected long knownMessageSize`
- `protected long remainingMessageSize`

**Methods:**
- `public void checkReadBytesAvailable(long p0) throws org.apache.thrift.transport.TTransportException`
- `protected void countConsumedMessageBytes(long p0) throws org.apache.thrift.transport.TTransportException`
- `public org.apache.thrift.TConfiguration getConfiguration()`
- `protected long getMaxMessageSize()`
- `protected void resetConsumedMessageSize(long p0) throws org.apache.thrift.transport.TTransportException`
- `public void updateKnownMessageSize(long p0) throws org.apache.thrift.transport.TTransportException`

---

## public class `org.apache.thrift.transport.TFileProcessor`

**Constructors:**
- `public TFileProcessor(org.apache.thrift.TProcessor p0, org.apache.thrift.protocol.TProtocolFactory p1, org.apache.thrift.protocol.TProtocolFactory p2, org.apache.thrift.transport.TFileTransport p3, org.apache.thrift.transport.TTransport p4)`
- `public TFileProcessor(org.apache.thrift.TProcessor p0, org.apache.thrift.protocol.TProtocolFactory p1, org.apache.thrift.transport.TFileTransport p2, org.apache.thrift.transport.TTransport p3)`

**Methods:**
- `public void processChunk() throws org.apache.thrift.TException`
- `public void processChunk(int p0) throws org.apache.thrift.TException`
- `public void processChunk(int p0, int p1) throws org.apache.thrift.TException`

---

## public class `org.apache.thrift.transport.TFileTransport`
extends `org.apache.thrift.transport.TTransport`  

**Constructors:**
- `public TFileTransport(java.lang.String p0, boolean p1) throws java.io.IOException`
- `public TFileTransport(org.apache.thrift.transport.TSeekableFile p0, boolean p1)`

**Fields:**
- `protected org.apache.thrift.transport.TSeekableFile inputFile_`
- `protected java.io.OutputStream outputStream_`

**Methods:**
- `public void checkReadBytesAvailable(long p0) throws org.apache.thrift.transport.TTransportException`
- `public void close()`
- `public void flush() throws org.apache.thrift.transport.TTransportException`
- `public org.apache.thrift.TConfiguration getConfiguration()`
- `public int getCurChunk() throws org.apache.thrift.transport.TTransportException`
- `public int getNumChunks() throws org.apache.thrift.transport.TTransportException`
- `public org.apache.thrift.transport.TFileTransport$TailPolicy getTailPolicy()`
- `public boolean isOpen()`
- `public static void main(java.lang.String[] p0) throws java.lang.Exception`
- `public void open() throws org.apache.thrift.transport.TTransportException`
- `public int read(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`
- `public int readAll(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`
- `public void seekToChunk(int p0) throws org.apache.thrift.transport.TTransportException`
- `public void seekToEnd() throws org.apache.thrift.transport.TTransportException`
- `public org.apache.thrift.transport.TFileTransport$TailPolicy setTailPolicy(org.apache.thrift.transport.TFileTransport$TailPolicy p0)`
- `public void updateKnownMessageSize(long p0) throws org.apache.thrift.transport.TTransportException`
- `public void write(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`

---

## public static class `org.apache.thrift.transport.TFileTransport$ChunkState`

**Constructors:**
- `public ChunkState()`
- `public ChunkState(int p0)`

**Fields:**
- `public final static int DEFAULT_CHUNK_SIZE`

**Methods:**
- `public int getChunkNum()`
- `public int getChunkSize()`
- `public long getOffset()`
- `public int getRemaining()`
- `public void seek(long p0)`
- `public void skip(int p0)`

---

## public static class `org.apache.thrift.transport.TFileTransport$Event`

**Constructors:**
- `public Event(byte[] p0)`

**Methods:**
- `public int emit(byte[] p0, int p1, int p2)`
- `public byte[] getBuf()`
- `public int getRemaining()`
- `public int getSize()`
- `public void setAvailable(int p0)`

---

## public final static enum `org.apache.thrift.transport.TFileTransport$TailPolicy`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.apache.thrift.transport.TFileTransport$TailPolicy NOWAIT`
- `public final static org.apache.thrift.transport.TFileTransport$TailPolicy WAIT_FOREVER`
- `public final int retries_`
- `public final int timeout_`

---

## public static class `org.apache.thrift.transport.TFileTransport$TruncableBufferedInputStream`
extends `java.io.BufferedInputStream`  

**Constructors:**
- `public TruncableBufferedInputStream(java.io.InputStream p0)`
- `public TruncableBufferedInputStream(java.io.InputStream p0, int p1)`

**Methods:**
- `public void trunc()`

---

## public class `org.apache.thrift.transport.THttpClient`
extends `org.apache.thrift.transport.TEndpointTransport`  

**Constructors:**
- `public THttpClient(java.lang.String p0) throws org.apache.thrift.transport.TTransportException`
- `public THttpClient(java.lang.String p0, org.apache.http.client.HttpClient p1) throws org.apache.thrift.transport.TTransportException`
- `public THttpClient(org.apache.thrift.TConfiguration p0, java.lang.String p1) throws org.apache.thrift.transport.TTransportException`
- `public THttpClient(org.apache.thrift.TConfiguration p0, java.lang.String p1, org.apache.http.client.HttpClient p2) throws org.apache.thrift.transport.TTransportException`

**Methods:**
- `public void close()`
- `public void flush() throws org.apache.thrift.transport.TTransportException`
- `public boolean isOpen()`
- `public void open()`
- `public int read(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`
- `public void setConnectTimeout(int p0)`
- `public void setCustomHeader(java.lang.String p0, java.lang.String p1)`
- `public void setCustomHeaders(java.util.Map p0)`
- `public void setReadTimeout(int p0)`
- `public void write(byte[] p0, int p1, int p2)`

---

## public static class `org.apache.thrift.transport.THttpClient$Factory`
extends `org.apache.thrift.transport.TTransportFactory`  

**Constructors:**
- `public Factory(java.lang.String p0)`
- `public Factory(java.lang.String p0, org.apache.http.client.HttpClient p1)`

**Methods:**
- `public org.apache.thrift.transport.TTransport getTransport(org.apache.thrift.transport.TTransport p0)`

---

## public class `org.apache.thrift.transport.TIOStreamTransport`
extends `org.apache.thrift.transport.TEndpointTransport`  

**Constructors:**
- `protected TIOStreamTransport() throws org.apache.thrift.transport.TTransportException`
- `public TIOStreamTransport(java.io.InputStream p0) throws org.apache.thrift.transport.TTransportException`
- `public TIOStreamTransport(java.io.InputStream p0, java.io.OutputStream p1) throws org.apache.thrift.transport.TTransportException`
- `public TIOStreamTransport(java.io.OutputStream p0) throws org.apache.thrift.transport.TTransportException`
- `protected TIOStreamTransport(org.apache.thrift.TConfiguration p0) throws org.apache.thrift.transport.TTransportException`
- `public TIOStreamTransport(org.apache.thrift.TConfiguration p0, java.io.InputStream p1) throws org.apache.thrift.transport.TTransportException`
- `public TIOStreamTransport(org.apache.thrift.TConfiguration p0, java.io.InputStream p1, java.io.OutputStream p2) throws org.apache.thrift.transport.TTransportException`
- `public TIOStreamTransport(org.apache.thrift.TConfiguration p0, java.io.OutputStream p1) throws org.apache.thrift.transport.TTransportException`

**Fields:**
- `protected java.io.InputStream inputStream_`
- `protected java.io.OutputStream outputStream_`

**Methods:**
- `public void close()`
- `public void flush() throws org.apache.thrift.transport.TTransportException`
- `public boolean isOpen()`
- `public void open() throws org.apache.thrift.transport.TTransportException`
- `public int read(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`
- `public void write(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`

---

## public class `org.apache.thrift.transport.TMemoryBuffer`
extends `org.apache.thrift.transport.TEndpointTransport`  

**Constructors:**
- `public TMemoryBuffer(int p0) throws org.apache.thrift.transport.TTransportException`
- `public TMemoryBuffer(org.apache.thrift.TConfiguration p0, int p1) throws org.apache.thrift.transport.TTransportException`

**Methods:**
- `public void close()`
- `public byte[] getArray()`
- `public java.lang.String inspect()`
- `public boolean isOpen()`
- `public int length()`
- `public void open()`
- `public int read(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`
- `public java.lang.String toString(java.nio.charset.Charset p0)`
- `public void write(byte[] p0, int p1, int p2)`

---

## public final class `org.apache.thrift.transport.TMemoryInputTransport`
extends `org.apache.thrift.transport.TEndpointTransport`  

**Constructors:**
- `public TMemoryInputTransport() throws org.apache.thrift.transport.TTransportException`
- `public TMemoryInputTransport(byte[] p0) throws org.apache.thrift.transport.TTransportException`
- `public TMemoryInputTransport(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`
- `public TMemoryInputTransport(org.apache.thrift.TConfiguration p0) throws org.apache.thrift.transport.TTransportException`
- `public TMemoryInputTransport(org.apache.thrift.TConfiguration p0, byte[] p1) throws org.apache.thrift.transport.TTransportException`
- `public TMemoryInputTransport(org.apache.thrift.TConfiguration p0, byte[] p1, int p2, int p3) throws org.apache.thrift.transport.TTransportException`

**Methods:**
- `public void clear()`
- `public void close()`
- `public void consumeBuffer(int p0)`
- `public byte[] getBuffer()`
- `public int getBufferPosition()`
- `public int getBytesRemainingInBuffer()`
- `public boolean isOpen()`
- `public void open() throws org.apache.thrift.transport.TTransportException`
- `public int read(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`
- `public void reset(byte[] p0)`
- `public void reset(byte[] p0, int p1, int p2)`
- `public void write(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`

---

## public class `org.apache.thrift.transport.TMemoryTransport`
extends `org.apache.thrift.transport.TEndpointTransport`  

**Constructors:**
- `public TMemoryTransport(byte[] p0) throws org.apache.thrift.transport.TTransportException`
- `public TMemoryTransport(org.apache.thrift.TConfiguration p0, byte[] p1) throws org.apache.thrift.transport.TTransportException`

**Methods:**
- `public void close()`
- `public org.apache.thrift.TByteArrayOutputStream getOutput()`
- `public boolean isOpen()`
- `public void open()`
- `public int read(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`
- `public void write(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`

---

## public class `org.apache.thrift.transport.TNonblockingServerSocket`
extends `org.apache.thrift.transport.TNonblockingServerTransport`  

**Constructors:**
- `public TNonblockingServerSocket(int p0) throws org.apache.thrift.transport.TTransportException`
- `public TNonblockingServerSocket(int p0, int p1) throws org.apache.thrift.transport.TTransportException`
- `public TNonblockingServerSocket(java.net.InetSocketAddress p0) throws org.apache.thrift.transport.TTransportException`
- `public TNonblockingServerSocket(java.net.InetSocketAddress p0, int p1) throws org.apache.thrift.transport.TTransportException`
- `public TNonblockingServerSocket(org.apache.thrift.transport.TNonblockingServerSocket$NonblockingAbstractServerSocketArgs p0) throws org.apache.thrift.transport.TTransportException`

**Methods:**
- `public org.apache.thrift.transport.TNonblockingSocket accept() throws org.apache.thrift.transport.TTransportException`
- `public void close()`
- `public int getPort()`
- `public void interrupt()`
- `public void listen() throws org.apache.thrift.transport.TTransportException`
- `public void registerSelector(java.nio.channels.Selector p0)`

---

## public static class `org.apache.thrift.transport.TNonblockingServerSocket$NonblockingAbstractServerSocketArgs`
extends `org.apache.thrift.transport.TServerTransport$AbstractServerTransportArgs`  

**Constructors:**
- `public NonblockingAbstractServerSocketArgs()`

---

## public abstract class `org.apache.thrift.transport.TNonblockingServerTransport`
extends `org.apache.thrift.transport.TServerTransport`  

**Constructors:**
- `public TNonblockingServerTransport()`

**Methods:**
- `public abstract org.apache.thrift.transport.TNonblockingTransport accept() throws org.apache.thrift.transport.TTransportException`
- `public abstract void registerSelector(java.nio.channels.Selector p0)`

---

## public class `org.apache.thrift.transport.TNonblockingSocket`
extends `org.apache.thrift.transport.TNonblockingTransport`  

**Constructors:**
- `public TNonblockingSocket(java.lang.String p0, int p1) throws java.io.IOException, org.apache.thrift.transport.TTransportException`
- `public TNonblockingSocket(java.lang.String p0, int p1, int p2) throws java.io.IOException, org.apache.thrift.transport.TTransportException`
- `public TNonblockingSocket(java.nio.channels.SocketChannel p0) throws java.io.IOException, org.apache.thrift.transport.TTransportException`

**Methods:**
- `public void close()`
- `public boolean finishConnect() throws java.io.IOException`
- `public void flush() throws org.apache.thrift.transport.TTransportException`
- `public java.nio.channels.SocketChannel getSocketChannel()`
- `public boolean isOpen()`
- `public void open() throws org.apache.thrift.transport.TTransportException`
- `public int read(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`
- `public int read(java.nio.ByteBuffer p0) throws org.apache.thrift.transport.TTransportException`
- `public java.nio.channels.SelectionKey registerSelector(java.nio.channels.Selector p0, int p1) throws java.io.IOException`
- `public void setTimeout(int p0)`
- `public boolean startConnect() throws java.io.IOException`
- `public java.lang.String toString()`
- `public void write(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`
- `public int write(java.nio.ByteBuffer p0) throws org.apache.thrift.transport.TTransportException`

---

## public abstract class `org.apache.thrift.transport.TNonblockingTransport`
extends `org.apache.thrift.transport.TEndpointTransport`  

**Constructors:**
- `public TNonblockingTransport(org.apache.thrift.TConfiguration p0) throws org.apache.thrift.transport.TTransportException`

**Methods:**
- `public abstract boolean finishConnect() throws java.io.IOException`
- `public abstract java.nio.channels.SelectionKey registerSelector(java.nio.channels.Selector p0, int p1) throws java.io.IOException`
- `public abstract boolean startConnect() throws java.io.IOException`

---

## public class `org.apache.thrift.transport.TSSLTransportFactory`

**Constructors:**
- `public TSSLTransportFactory()`

**Methods:**
- `public static org.apache.thrift.transport.TSocket getClientSocket(java.lang.String p0, int p1) throws org.apache.thrift.transport.TTransportException`
- `public static org.apache.thrift.transport.TSocket getClientSocket(java.lang.String p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`
- `public static org.apache.thrift.transport.TSocket getClientSocket(java.lang.String p0, int p1, int p2, org.apache.thrift.transport.TSSLTransportFactory$TSSLTransportParameters p3) throws org.apache.thrift.transport.TTransportException`
- `public static org.apache.thrift.transport.TServerSocket getServerSocket(int p0) throws org.apache.thrift.transport.TTransportException`
- `public static org.apache.thrift.transport.TServerSocket getServerSocket(int p0, int p1) throws org.apache.thrift.transport.TTransportException`
- `public static org.apache.thrift.transport.TServerSocket getServerSocket(int p0, int p1, boolean p2, java.net.InetAddress p3) throws org.apache.thrift.transport.TTransportException`
- `public static org.apache.thrift.transport.TServerSocket getServerSocket(int p0, int p1, java.net.InetAddress p2, org.apache.thrift.transport.TSSLTransportFactory$TSSLTransportParameters p3) throws org.apache.thrift.transport.TTransportException`

---

## public static class `org.apache.thrift.transport.TSSLTransportFactory$TSSLTransportParameters`

**Constructors:**
- `public TSSLTransportParameters()`
- `public TSSLTransportParameters(java.lang.String p0, java.lang.String[] p1)`
- `public TSSLTransportParameters(java.lang.String p0, java.lang.String[] p1, boolean p2)`

**Fields:**
- `protected java.lang.String[] cipherSuites`
- `protected boolean clientAuth`
- `protected boolean isKeyStoreSet`
- `protected boolean isTrustStoreSet`
- `protected java.lang.String keyManagerType`
- `protected java.lang.String keyPass`
- `protected java.lang.String keyStore`
- `protected java.io.InputStream keyStoreStream`
- `protected java.lang.String keyStoreType`
- `protected java.lang.String protocol`
- `protected java.lang.String trustManagerType`
- `protected java.lang.String trustPass`
- `protected java.lang.String trustStore`
- `protected java.io.InputStream trustStoreStream`
- `protected java.lang.String trustStoreType`

**Methods:**
- `public void requireClientAuth(boolean p0)`
- `public void setKeyStore(java.io.InputStream p0, java.lang.String p1)`
- `public void setKeyStore(java.io.InputStream p0, java.lang.String p1, java.lang.String p2, java.lang.String p3)`
- `public void setKeyStore(java.lang.String p0, java.lang.String p1)`
- `public void setKeyStore(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3)`
- `public void setTrustStore(java.io.InputStream p0, java.lang.String p1)`
- `public void setTrustStore(java.io.InputStream p0, java.lang.String p1, java.lang.String p2, java.lang.String p3)`
- `public void setTrustStore(java.lang.String p0, java.lang.String p1)`
- `public void setTrustStore(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3)`

---

## public class `org.apache.thrift.transport.TSaslClientTransport`
extends `org.apache.thrift.transport.TSaslTransport`  

**Constructors:**
- `public TSaslClientTransport(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.util.Map p4, javax.security.auth.callback.CallbackHandler p5, org.apache.thrift.transport.TTransport p6) throws javax.security.sasl.SaslException, org.apache.thrift.transport.TTransportException`
- `public TSaslClientTransport(javax.security.sasl.SaslClient p0, org.apache.thrift.transport.TTransport p1) throws org.apache.thrift.transport.TTransportException`

**Methods:**
- `protected org.apache.thrift.transport.TSaslTransport$SaslRole getRole()`
- `protected void handleSaslStartMessage() throws javax.security.sasl.SaslException, org.apache.thrift.transport.TTransportException`

---

## public class `org.apache.thrift.transport.TSaslServerTransport`
extends `org.apache.thrift.transport.TSaslTransport`  

**Constructors:**
- `public TSaslServerTransport(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.Map p3, javax.security.auth.callback.CallbackHandler p4, org.apache.thrift.transport.TTransport p5) throws org.apache.thrift.transport.TTransportException`
- `public TSaslServerTransport(org.apache.thrift.transport.TTransport p0) throws org.apache.thrift.transport.TTransportException`

**Methods:**
- `public void addServerDefinition(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.Map p3, javax.security.auth.callback.CallbackHandler p4)`
- `protected org.apache.thrift.transport.TSaslTransport$SaslRole getRole()`
- `protected void handleSaslStartMessage() throws javax.security.sasl.SaslException, org.apache.thrift.transport.TTransportException`

---

## public static class `org.apache.thrift.transport.TSaslServerTransport$Factory`
extends `org.apache.thrift.transport.TTransportFactory`  

**Constructors:**
- `public Factory()`
- `public Factory(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.Map p3, javax.security.auth.callback.CallbackHandler p4)`

**Methods:**
- `public void addServerDefinition(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.Map p3, javax.security.auth.callback.CallbackHandler p4)`
- `public org.apache.thrift.transport.TTransport getTransport(org.apache.thrift.transport.TTransport p0) throws org.apache.thrift.transport.TTransportException`

---

## public abstract interface `org.apache.thrift.transport.TSeekableFile`

**Methods:**
- `public abstract void close() throws java.io.IOException`
- `public abstract java.io.InputStream getInputStream() throws java.io.IOException`
- `public abstract java.io.OutputStream getOutputStream() throws java.io.IOException`
- `public abstract long length() throws java.io.IOException`
- `public abstract void seek(long p0) throws java.io.IOException`

---

## public class `org.apache.thrift.transport.TServerSocket`
extends `org.apache.thrift.transport.TServerTransport`  

**Constructors:**
- `public TServerSocket(int p0) throws org.apache.thrift.transport.TTransportException`
- `public TServerSocket(int p0, int p1) throws org.apache.thrift.transport.TTransportException`
- `public TServerSocket(java.net.InetSocketAddress p0) throws org.apache.thrift.transport.TTransportException`
- `public TServerSocket(java.net.InetSocketAddress p0, int p1) throws org.apache.thrift.transport.TTransportException`
- `public TServerSocket(java.net.ServerSocket p0) throws org.apache.thrift.transport.TTransportException`
- `public TServerSocket(java.net.ServerSocket p0, int p1) throws org.apache.thrift.transport.TTransportException`
- `public TServerSocket(org.apache.thrift.transport.TServerSocket$ServerSocketTransportArgs p0) throws org.apache.thrift.transport.TTransportException`

**Methods:**
- `public org.apache.thrift.transport.TSocket accept() throws org.apache.thrift.transport.TTransportException`
- `public void close()`
- `public java.net.ServerSocket getServerSocket()`
- `public void interrupt()`
- `public void listen() throws org.apache.thrift.transport.TTransportException`

---

## public static class `org.apache.thrift.transport.TServerSocket$ServerSocketTransportArgs`
extends `org.apache.thrift.transport.TServerTransport$AbstractServerTransportArgs`  

**Constructors:**
- `public ServerSocketTransportArgs()`

**Methods:**
- `public org.apache.thrift.transport.TServerSocket$ServerSocketTransportArgs serverSocket(java.net.ServerSocket p0)`

---

## public abstract class `org.apache.thrift.transport.TServerTransport`
implements `java.io.Closeable`  

**Constructors:**
- `public TServerTransport()`

**Methods:**
- `public abstract org.apache.thrift.transport.TTransport accept() throws org.apache.thrift.transport.TTransportException`
- `public abstract void close()`
- `public void interrupt()`
- `public abstract void listen() throws org.apache.thrift.transport.TTransportException`

---

## public abstract static class `org.apache.thrift.transport.TServerTransport$AbstractServerTransportArgs`<T extends org.apache.thrift.transport.TServerTransport$AbstractServerTransportArgs<T>>

**Constructors:**
- `public AbstractServerTransportArgs()`

**Methods:**
- `public T backlog(int p0)`
- `public T bindAddr(java.net.InetSocketAddress p0)`
- `public T clientTimeout(int p0)`
- `public T port(int p0)`

---

## public final class `org.apache.thrift.transport.TSimpleFileTransport`
extends `org.apache.thrift.transport.TEndpointTransport`  

**Constructors:**
- `public TSimpleFileTransport(java.lang.String p0) throws org.apache.thrift.transport.TTransportException`
- `public TSimpleFileTransport(java.lang.String p0, boolean p1, boolean p2) throws org.apache.thrift.transport.TTransportException`
- `public TSimpleFileTransport(java.lang.String p0, boolean p1, boolean p2, boolean p3) throws org.apache.thrift.transport.TTransportException`
- `public TSimpleFileTransport(org.apache.thrift.TConfiguration p0, java.lang.String p1, boolean p2, boolean p3, boolean p4) throws org.apache.thrift.transport.TTransportException`

**Methods:**
- `public void close()`
- `public long getFilePointer() throws org.apache.thrift.transport.TTransportException`
- `public boolean isOpen()`
- `public long length() throws org.apache.thrift.transport.TTransportException`
- `public void open() throws org.apache.thrift.transport.TTransportException`
- `public int read(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`
- `public void seek(long p0) throws org.apache.thrift.transport.TTransportException`
- `public void write(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`

---

## public class `org.apache.thrift.transport.TSocket`
extends `org.apache.thrift.transport.TIOStreamTransport`  

**Constructors:**
- `public TSocket(java.lang.String p0, int p1) throws org.apache.thrift.transport.TTransportException`
- `public TSocket(java.lang.String p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`
- `public TSocket(java.net.Socket p0) throws org.apache.thrift.transport.TTransportException`
- `public TSocket(org.apache.thrift.TConfiguration p0, java.lang.String p1, int p2) throws org.apache.thrift.transport.TTransportException`
- `public TSocket(org.apache.thrift.TConfiguration p0, java.lang.String p1, int p2, int p3) throws org.apache.thrift.transport.TTransportException`
- `public TSocket(org.apache.thrift.TConfiguration p0, java.lang.String p1, int p2, int p3, int p4) throws org.apache.thrift.transport.TTransportException`

**Methods:**
- `public void close()`
- `public java.net.Socket getSocket()`
- `public boolean isOpen()`
- `public void open() throws org.apache.thrift.transport.TTransportException`
- `public void setConnectTimeout(int p0)`
- `public void setSocketTimeout(int p0)`
- `public void setTimeout(int p0)`

---

## public class `org.apache.thrift.transport.TStandardFile`
implements `org.apache.thrift.transport.TSeekableFile`  

**Constructors:**
- `public TStandardFile(java.lang.String p0) throws java.io.IOException`

**Fields:**
- `protected java.io.RandomAccessFile inputFile_`
- `protected java.lang.String path_`

**Methods:**
- `public void close() throws java.io.IOException`
- `public java.io.InputStream getInputStream() throws java.io.IOException`
- `public java.io.OutputStream getOutputStream() throws java.io.IOException`
- `public long length() throws java.io.IOException`
- `public void seek(long p0) throws java.io.IOException`

---

## public abstract class `org.apache.thrift.transport.TTransport`
implements `java.io.Closeable`  

**Constructors:**
- `public TTransport()`

**Methods:**
- `public abstract void checkReadBytesAvailable(long p0) throws org.apache.thrift.transport.TTransportException`
- `public abstract void close()`
- `public void consumeBuffer(int p0)`
- `public void flush() throws org.apache.thrift.transport.TTransportException`
- `public byte[] getBuffer()`
- `public int getBufferPosition()`
- `public int getBytesRemainingInBuffer()`
- `public abstract org.apache.thrift.TConfiguration getConfiguration()`
- `public abstract boolean isOpen()`
- `public abstract void open() throws org.apache.thrift.transport.TTransportException`
- `public boolean peek()`
- `public abstract int read(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`
- `public int read(java.nio.ByteBuffer p0) throws org.apache.thrift.transport.TTransportException`
- `public int readAll(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`
- `public abstract void updateKnownMessageSize(long p0) throws org.apache.thrift.transport.TTransportException`
- `public void write(byte[] p0) throws org.apache.thrift.transport.TTransportException`
- `public abstract void write(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`
- `public int write(java.nio.ByteBuffer p0) throws org.apache.thrift.transport.TTransportException`

---

## public class `org.apache.thrift.transport.TTransportException`
extends `org.apache.thrift.TException`  

**Constructors:**
- `public TTransportException()`
- `public TTransportException(int p0)`
- `public TTransportException(int p0, java.lang.String p1)`
- `public TTransportException(int p0, java.lang.String p1, java.lang.Throwable p2)`
- `public TTransportException(int p0, java.lang.Throwable p1)`
- `public TTransportException(java.lang.String p0)`
- `public TTransportException(java.lang.String p0, java.lang.Throwable p1)`
- `public TTransportException(java.lang.Throwable p0)`

**Fields:**
- `public final static int ALREADY_OPEN`
- `public final static int CORRUPTED_DATA`
- `public final static int END_OF_FILE`
- `public final static int NOT_OPEN`
- `public final static int TIMED_OUT`
- `public final static int UNKNOWN`
- `protected int type_`

**Methods:**
- `public int getType()`

---

## public class `org.apache.thrift.transport.TTransportFactory`

**Constructors:**
- `public TTransportFactory()`

**Methods:**
- `public org.apache.thrift.transport.TTransport getTransport(org.apache.thrift.transport.TTransport p0) throws org.apache.thrift.transport.TTransportException`

---

## public class `org.apache.thrift.transport.TZlibTransport`
extends `org.apache.thrift.transport.TIOStreamTransport`  

**Constructors:**
- `public TZlibTransport(org.apache.thrift.transport.TTransport p0) throws org.apache.thrift.transport.TTransportException`
- `public TZlibTransport(org.apache.thrift.transport.TTransport p0, int p1) throws org.apache.thrift.transport.TTransportException`

**Methods:**
- `public void close()`
- `public boolean isOpen()`
- `public void open() throws org.apache.thrift.transport.TTransportException`

---

## public static class `org.apache.thrift.transport.TZlibTransport$Factory`
extends `org.apache.thrift.transport.TTransportFactory`  

**Constructors:**
- `public Factory()`

**Methods:**
- `public org.apache.thrift.transport.TTransport getTransport(org.apache.thrift.transport.TTransport p0) throws org.apache.thrift.transport.TTransportException`

---

## public class `org.apache.thrift.transport.layered.TFastFramedTransport`
extends `org.apache.thrift.transport.layered.TLayeredTransport`  

**Constructors:**
- `public TFastFramedTransport(org.apache.thrift.transport.TTransport p0) throws org.apache.thrift.transport.TTransportException`
- `public TFastFramedTransport(org.apache.thrift.transport.TTransport p0, int p1) throws org.apache.thrift.transport.TTransportException`
- `public TFastFramedTransport(org.apache.thrift.transport.TTransport p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`

**Fields:**
- `public final static int DEFAULT_BUF_CAPACITY`

**Methods:**
- `public void clear() throws org.apache.thrift.transport.TTransportException`
- `public void close()`
- `public void consumeBuffer(int p0)`
- `public void flush() throws org.apache.thrift.transport.TTransportException`
- `public byte[] getBuffer()`
- `public int getBufferPosition()`
- `public int getBytesRemainingInBuffer()`
- `public boolean isOpen()`
- `public void open() throws org.apache.thrift.transport.TTransportException`
- `public int read(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`
- `public void write(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`

---

## public static class `org.apache.thrift.transport.layered.TFastFramedTransport$Factory`
extends `org.apache.thrift.transport.TTransportFactory`  

**Constructors:**
- `public Factory()`
- `public Factory(int p0)`
- `public Factory(int p0, int p1)`

**Methods:**
- `public org.apache.thrift.transport.TTransport getTransport(org.apache.thrift.transport.TTransport p0) throws org.apache.thrift.transport.TTransportException`

---

## public class `org.apache.thrift.transport.layered.TFramedTransport`
extends `org.apache.thrift.transport.layered.TLayeredTransport`  

**Constructors:**
- `public TFramedTransport(org.apache.thrift.transport.TTransport p0) throws org.apache.thrift.transport.TTransportException`
- `public TFramedTransport(org.apache.thrift.transport.TTransport p0, int p1) throws org.apache.thrift.transport.TTransportException`

**Methods:**
- `public void clear()`
- `public void close()`
- `public void consumeBuffer(int p0)`
- `public final static int decodeFrameSize(byte[] p0)`
- `public final static void encodeFrameSize(int p0, byte[] p1)`
- `public void flush() throws org.apache.thrift.transport.TTransportException`
- `public byte[] getBuffer()`
- `public int getBufferPosition()`
- `public int getBytesRemainingInBuffer()`
- `public boolean isOpen()`
- `public void open() throws org.apache.thrift.transport.TTransportException`
- `public int read(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`
- `public void write(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`

---

## public static class `org.apache.thrift.transport.layered.TFramedTransport$Factory`
extends `org.apache.thrift.transport.TTransportFactory`  

**Constructors:**
- `public Factory()`
- `public Factory(int p0)`

**Methods:**
- `public org.apache.thrift.transport.TTransport getTransport(org.apache.thrift.transport.TTransport p0) throws org.apache.thrift.transport.TTransportException`

---

## public abstract class `org.apache.thrift.transport.layered.TLayeredTransport`
extends `org.apache.thrift.transport.TTransport`  

**Constructors:**
- `public TLayeredTransport(org.apache.thrift.transport.TTransport p0)`

**Methods:**
- `public void checkReadBytesAvailable(long p0) throws org.apache.thrift.transport.TTransportException`
- `public org.apache.thrift.TConfiguration getConfiguration()`
- `public org.apache.thrift.transport.TTransport getInnerTransport()`
- `public void updateKnownMessageSize(long p0) throws org.apache.thrift.transport.TTransportException`

---

## public class `org.apache.thrift.transport.sasl.DataFrameHeaderReader`
extends `org.apache.thrift.transport.sasl.FixedSizeHeaderReader`  

**Constructors:**
- `public DataFrameHeaderReader()`

**Fields:**
- `public final static int PAYLOAD_LENGTH_BYTES`

**Methods:**
- `protected int headerSize()`
- `protected void onComplete() throws org.apache.thrift.transport.sasl.TInvalidSaslFrameException`
- `public int payloadSize()`

---

## public class `org.apache.thrift.transport.sasl.DataFrameReader`
extends `org.apache.thrift.transport.sasl.FrameReader`  

**Constructors:**
- `public DataFrameReader()`

---

## public class `org.apache.thrift.transport.sasl.DataFrameWriter`
extends `org.apache.thrift.transport.sasl.FrameWriter`  

**Constructors:**
- `public DataFrameWriter()`

**Methods:**
- `protected java.nio.ByteBuffer buildFrame(byte[] p0, int p1, int p2, byte[] p3, int p4, int p5)`
- `public void withOnlyPayload(byte[] p0, int p1, int p2)`

---

## public abstract class `org.apache.thrift.transport.sasl.FixedSizeHeaderReader`
implements `org.apache.thrift.transport.sasl.FrameHeaderReader`  

**Constructors:**
- `public FixedSizeHeaderReader()`

**Fields:**
- `protected final java.nio.ByteBuffer byteBuffer`

**Methods:**
- `public void clear()`
- `protected abstract int headerSize()`
- `public boolean isComplete()`
- `protected abstract void onComplete() throws org.apache.thrift.transport.TTransportException`
- `public boolean read(org.apache.thrift.transport.TTransport p0) throws org.apache.thrift.transport.TTransportException`
- `public byte[] toBytes()`

---

## public abstract interface `org.apache.thrift.transport.sasl.FrameHeaderReader`

**Methods:**
- `public abstract void clear()`
- `public abstract boolean isComplete()`
- `public abstract int payloadSize()`
- `public abstract boolean read(org.apache.thrift.transport.TTransport p0) throws org.apache.thrift.transport.TTransportException, org.apache.thrift.transport.sasl.TSaslNegotiationException`
- `public abstract byte[] toBytes()`

---

## public abstract class `org.apache.thrift.transport.sasl.FrameReader`<T extends org.apache.thrift.transport.sasl.FrameHeaderReader>

**Constructors:**
- `protected FrameReader(T p0)`

**Methods:**
- `public void clear()`
- `public T getHeader()`
- `public int getHeaderSize()`
- `public byte[] getPayload()`
- `public int getPayloadSize()`
- `public boolean isComplete()`
- `public boolean read(org.apache.thrift.transport.TTransport p0) throws org.apache.thrift.transport.TTransportException, org.apache.thrift.transport.sasl.TSaslNegotiationException`

---

## public abstract class `org.apache.thrift.transport.sasl.FrameWriter`

**Constructors:**
- `public FrameWriter()`

**Fields:**
- `protected java.nio.ByteBuffer frameBytes`

**Methods:**
- `protected abstract java.nio.ByteBuffer buildFrame(byte[] p0, int p1, int p2, byte[] p3, int p4, int p5)`
- `public void clear()`
- `public boolean isComplete()`
- `public void withHeaderAndPayload(byte[] p0, byte[] p1)`
- `public void withHeaderAndPayload(byte[] p0, int p1, int p2, byte[] p3, int p4, int p5)`
- `public void withOnlyPayload(byte[] p0)`
- `public abstract void withOnlyPayload(byte[] p0, int p1, int p2)`
- `public void write(org.apache.thrift.transport.TNonblockingTransport p0) throws org.apache.thrift.transport.TTransportException`

---

## public final enum `org.apache.thrift.transport.sasl.NegotiationStatus`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.apache.thrift.transport.sasl.NegotiationStatus BAD`
- `public final static org.apache.thrift.transport.sasl.NegotiationStatus COMPLETE`
- `public final static org.apache.thrift.transport.sasl.NegotiationStatus ERROR`
- `public final static org.apache.thrift.transport.sasl.NegotiationStatus OK`
- `public final static org.apache.thrift.transport.sasl.NegotiationStatus START`

**Methods:**
- `public static org.apache.thrift.transport.sasl.NegotiationStatus byValue(byte p0) throws org.apache.thrift.transport.sasl.TSaslNegotiationException`
- `public byte getValue()`

---

## public class `org.apache.thrift.transport.sasl.NonblockingSaslHandler`

**Constructors:**
- `public NonblockingSaslHandler(java.nio.channels.SelectionKey p0, org.apache.thrift.transport.TNonblockingTransport p1, org.apache.thrift.transport.sasl.TSaslServerFactory p2, org.apache.thrift.transport.sasl.TSaslProcessorFactory p3, org.apache.thrift.protocol.TProtocolFactory p4, org.apache.thrift.protocol.TProtocolFactory p5, org.apache.thrift.server.TServerEventHandler p6)`

**Methods:**
- `public void close()`
- `public org.apache.thrift.transport.sasl.NonblockingSaslHandler$Phase getCurrentPhase()`
- `public org.apache.thrift.transport.sasl.NonblockingSaslHandler$Phase getNextPhase()`
- `public javax.security.sasl.SaslServer getSaslServer()`
- `public org.apache.thrift.transport.TNonblockingTransport getUnderlyingTransport()`
- `public void handleRead()`
- `public void handleWrite()`
- `public boolean isCurrentPhaseDone()`
- `public void runCurrentPhase()`
- `public void stepToNextPhase()`

---

## public abstract sealed static enum `org.apache.thrift.transport.sasl.NonblockingSaslHandler$Phase`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.apache.thrift.transport.sasl.NonblockingSaslHandler$Phase CLOSED`
- `public final static org.apache.thrift.transport.sasl.NonblockingSaslHandler$Phase CLOSING`
- `public final static org.apache.thrift.transport.sasl.NonblockingSaslHandler$Phase EVALUATING_SASL_RESPONSE`
- `public final static org.apache.thrift.transport.sasl.NonblockingSaslHandler$Phase INITIIALIIZING`
- `public final static org.apache.thrift.transport.sasl.NonblockingSaslHandler$Phase PROCESSING`
- `public final static org.apache.thrift.transport.sasl.NonblockingSaslHandler$Phase READING_REQUEST`
- `public final static org.apache.thrift.transport.sasl.NonblockingSaslHandler$Phase READING_SASL_RESPONSE`
- `public final static org.apache.thrift.transport.sasl.NonblockingSaslHandler$Phase WRITING_FAILURE_MESSAGE`
- `public final static org.apache.thrift.transport.sasl.NonblockingSaslHandler$Phase WRITING_RESPONSE`
- `public final static org.apache.thrift.transport.sasl.NonblockingSaslHandler$Phase WRITING_SASL_CHALLENGE`
- `public final static org.apache.thrift.transport.sasl.NonblockingSaslHandler$Phase WRITING_SUCCESS_MESSAGE`

---

## public class `org.apache.thrift.transport.sasl.SaslNegotiationFrameReader`
extends `org.apache.thrift.transport.sasl.FrameReader`  

**Constructors:**
- `public SaslNegotiationFrameReader()`

---

## public class `org.apache.thrift.transport.sasl.SaslNegotiationFrameWriter`
extends `org.apache.thrift.transport.sasl.FrameWriter`  

**Constructors:**
- `public SaslNegotiationFrameWriter()`

**Fields:**
- `public final static int HEADER_BYTES`

**Methods:**
- `protected java.nio.ByteBuffer buildFrame(byte[] p0, int p1, int p2, byte[] p3, int p4, int p5)`
- `public void withOnlyPayload(byte[] p0, int p1, int p2)`

---

## public class `org.apache.thrift.transport.sasl.SaslNegotiationHeaderReader`
extends `org.apache.thrift.transport.sasl.FixedSizeHeaderReader`  

**Constructors:**
- `public SaslNegotiationHeaderReader()`

**Fields:**
- `public final static int PAYLOAD_LENGTH_BYTES`
- `public final static int STATUS_BYTES`

**Methods:**
- `public org.apache.thrift.transport.sasl.NegotiationStatus getStatus()`
- `protected int headerSize()`
- `protected void onComplete() throws org.apache.thrift.transport.sasl.TSaslNegotiationException`
- `public int payloadSize()`

---

## public abstract interface `org.apache.thrift.transport.sasl.SaslPeer`

**Methods:**
- `public abstract void dispose()`
- `public abstract byte[] evaluate(byte[] p0) throws org.apache.thrift.transport.sasl.TSaslNegotiationException`
- `public abstract boolean isAuthenticated()`
- `public abstract boolean isDataProtected()`
- `public default byte[] unwrap(byte[] p0) throws org.apache.thrift.transport.TTransportException`
- `public abstract byte[] unwrap(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`
- `public default byte[] wrap(byte[] p0) throws org.apache.thrift.transport.TTransportException`
- `public abstract byte[] wrap(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`

---

## public class `org.apache.thrift.transport.sasl.ServerSaslPeer`
implements `org.apache.thrift.transport.sasl.SaslPeer`  

**Constructors:**
- `public ServerSaslPeer(javax.security.sasl.SaslServer p0)`

**Methods:**
- `public void dispose()`
- `public byte[] evaluate(byte[] p0) throws org.apache.thrift.transport.sasl.TSaslNegotiationException`
- `public boolean isAuthenticated()`
- `public boolean isDataProtected()`
- `public byte[] unwrap(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`
- `public byte[] wrap(byte[] p0, int p1, int p2) throws org.apache.thrift.transport.TTransportException`

---

## public class `org.apache.thrift.transport.sasl.TBaseSaslProcessorFactory`
implements `org.apache.thrift.transport.sasl.TSaslProcessorFactory`  

**Constructors:**
- `public TBaseSaslProcessorFactory(org.apache.thrift.TProcessor p0)`

**Methods:**
- `public org.apache.thrift.TProcessor getProcessor(org.apache.thrift.transport.sasl.NonblockingSaslHandler p0)`

---

## public class `org.apache.thrift.transport.sasl.TInvalidSaslFrameException`
extends `org.apache.thrift.transport.sasl.TSaslNegotiationException`  

**Constructors:**
- `public TInvalidSaslFrameException(java.lang.String p0)`

---

## public class `org.apache.thrift.transport.sasl.TSaslNegotiationException`
extends `org.apache.thrift.transport.TTransportException`  

**Constructors:**
- `public TSaslNegotiationException(org.apache.thrift.transport.sasl.TSaslNegotiationException$ErrorType p0, java.lang.String p1)`
- `public TSaslNegotiationException(org.apache.thrift.transport.sasl.TSaslNegotiationException$ErrorType p0, java.lang.String p1, java.lang.Throwable p2)`

**Methods:**
- `public java.lang.String getDetails()`
- `public org.apache.thrift.transport.sasl.TSaslNegotiationException$ErrorType getErrorType()`
- `public java.lang.String getSummary()`

---

## public final static enum `org.apache.thrift.transport.sasl.TSaslNegotiationException$ErrorType`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.apache.thrift.transport.sasl.TSaslNegotiationException$ErrorType AUTHENTICATION_FAILURE`
- `public final static org.apache.thrift.transport.sasl.TSaslNegotiationException$ErrorType INTERNAL_ERROR`
- `public final static org.apache.thrift.transport.sasl.TSaslNegotiationException$ErrorType MECHANISME_MISMATCH`
- `public final static org.apache.thrift.transport.sasl.TSaslNegotiationException$ErrorType PROTOCOL_ERROR`
- `public final org.apache.thrift.transport.sasl.NegotiationStatus code`

---

## public abstract interface `org.apache.thrift.transport.sasl.TSaslProcessorFactory`

**Methods:**
- `public abstract org.apache.thrift.TProcessor getProcessor(org.apache.thrift.transport.sasl.NonblockingSaslHandler p0) throws org.apache.thrift.TException`

---

## public class `org.apache.thrift.transport.sasl.TSaslServerDefinition`

**Constructors:**
- `public TSaslServerDefinition(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.Map p3, javax.security.auth.callback.CallbackHandler p4)`

**Fields:**
- `public final javax.security.auth.callback.CallbackHandler cbh`
- `public final java.lang.String mechanism`
- `public final java.util.Map props`
- `public final java.lang.String protocol`
- `public final java.lang.String serverName`

---

## public class `org.apache.thrift.transport.sasl.TSaslServerFactory`

**Constructors:**
- `public TSaslServerFactory()`

**Methods:**
- `public void addSaslMechanism(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.Map p3, javax.security.auth.callback.CallbackHandler p4)`
- `public org.apache.thrift.transport.sasl.ServerSaslPeer getSaslPeer(java.lang.String p0) throws org.apache.thrift.transport.sasl.TSaslNegotiationException`

---

## public final class `org.apache.thrift.utils.StringUtils`

**Methods:**
- `public static java.lang.String bytesToHexString(byte[] p0)`
- `public static java.lang.String bytesToHexString(byte[] p0, int p1, int p2)`

---

