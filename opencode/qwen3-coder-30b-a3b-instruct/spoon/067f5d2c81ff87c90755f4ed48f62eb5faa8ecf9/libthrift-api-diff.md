# Breaking Changes: org.apache.thrift:libthrift 0.12.0 → 0.16.0
Total: 118 (binary-breaking: 42, source-breaking: 108)

## org.apache.thrift.ShortStack

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.thrift.ShortStack`

## org.apache.thrift.TAsyncProcessor

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.thrift.TAsyncProcessor.process(org.apache.thrift.server.AbstractNonblockingServer$AsyncFrameBuffer)`
+ NEW RETURN TYPE: `org.apache.thrift.TAsyncProcessor.process(org.apache.thrift.server.AbstractNonblockingServer$AsyncFrameBuffer)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.thrift.TAsyncProcessor.process(org.apache.thrift.server.AbstractNonblockingServer$AsyncFrameBuffer)`
+ NEW RETURN TYPE: `org.apache.thrift.TAsyncProcessor.process(org.apache.thrift.server.AbstractNonblockingServer$AsyncFrameBuffer)`

## org.apache.thrift.TBaseAsyncProcessor

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.thrift.TBaseAsyncProcessor.process(org.apache.thrift.protocol.TProtocol,org.apache.thrift.protocol.TProtocol)`
+ NEW RETURN TYPE: `org.apache.thrift.TBaseAsyncProcessor.process(org.apache.thrift.protocol.TProtocol,org.apache.thrift.protocol.TProtocol)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.thrift.TBaseAsyncProcessor.process(org.apache.thrift.server.AbstractNonblockingServer$AsyncFrameBuffer)`
+ NEW RETURN TYPE: `org.apache.thrift.TBaseAsyncProcessor.process(org.apache.thrift.server.AbstractNonblockingServer$AsyncFrameBuffer)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.thrift.TBaseAsyncProcessor.process(org.apache.thrift.protocol.TProtocol,org.apache.thrift.protocol.TProtocol)`
+ NEW RETURN TYPE: `org.apache.thrift.TBaseAsyncProcessor.process(org.apache.thrift.protocol.TProtocol,org.apache.thrift.protocol.TProtocol)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.thrift.TBaseAsyncProcessor.process(org.apache.thrift.server.AbstractNonblockingServer$AsyncFrameBuffer)`
+ NEW RETURN TYPE: `org.apache.thrift.TBaseAsyncProcessor.process(org.apache.thrift.server.AbstractNonblockingServer$AsyncFrameBuffer)`

## org.apache.thrift.TBaseProcessor

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.thrift.TBaseProcessor.process(org.apache.thrift.protocol.TProtocol,org.apache.thrift.protocol.TProtocol)`
+ NEW RETURN TYPE: `org.apache.thrift.TBaseProcessor.process(org.apache.thrift.protocol.TProtocol,org.apache.thrift.protocol.TProtocol)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.thrift.TBaseProcessor.process(org.apache.thrift.protocol.TProtocol,org.apache.thrift.protocol.TProtocol)`
+ NEW RETURN TYPE: `org.apache.thrift.TBaseProcessor.process(org.apache.thrift.protocol.TProtocol,org.apache.thrift.protocol.TProtocol)`

## org.apache.thrift.TDeserializer

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.TDeserializer.<init>()`
+ NOW THROWS: `org.apache.thrift.TDeserializer.<init>()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.TDeserializer.<init>(org.apache.thrift.protocol.TProtocolFactory)`
+ NOW THROWS: `org.apache.thrift.TDeserializer.<init>(org.apache.thrift.protocol.TProtocolFactory)`

## org.apache.thrift.TMultiplexedProcessor

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.thrift.TMultiplexedProcessor.process(org.apache.thrift.protocol.TProtocol,org.apache.thrift.protocol.TProtocol)`
+ NEW RETURN TYPE: `org.apache.thrift.TMultiplexedProcessor.process(org.apache.thrift.protocol.TProtocol,org.apache.thrift.protocol.TProtocol)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.thrift.TMultiplexedProcessor.process(org.apache.thrift.protocol.TProtocol,org.apache.thrift.protocol.TProtocol)`
+ NEW RETURN TYPE: `org.apache.thrift.TMultiplexedProcessor.process(org.apache.thrift.protocol.TProtocol,org.apache.thrift.protocol.TProtocol)`

## org.apache.thrift.TProcessor

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.thrift.TProcessor.process(org.apache.thrift.protocol.TProtocol,org.apache.thrift.protocol.TProtocol)`
+ NEW RETURN TYPE: `org.apache.thrift.TProcessor.process(org.apache.thrift.protocol.TProtocol,org.apache.thrift.protocol.TProtocol)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.thrift.TProcessor.process(org.apache.thrift.protocol.TProtocol,org.apache.thrift.protocol.TProtocol)`
+ NEW RETURN TYPE: `org.apache.thrift.TProcessor.process(org.apache.thrift.protocol.TProtocol,org.apache.thrift.protocol.TProtocol)`

## org.apache.thrift.TSerializer

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.TSerializer.<init>()`
+ NOW THROWS: `org.apache.thrift.TSerializer.<init>()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.TSerializer.<init>(org.apache.thrift.protocol.TProtocolFactory)`
+ NOW THROWS: `org.apache.thrift.TSerializer.<init>(org.apache.thrift.protocol.TProtocolFactory)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.thrift.TSerializer.toString(org.apache.thrift.TBase,java.lang.String)`

## org.apache.thrift.protocol.TBinaryProtocol

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.protocol.TBinaryProtocol.readFieldEnd()`
+ NOW THROWS: `org.apache.thrift.protocol.TBinaryProtocol.readFieldEnd()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.protocol.TBinaryProtocol.readListEnd()`
+ NOW THROWS: `org.apache.thrift.protocol.TBinaryProtocol.readListEnd()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.protocol.TBinaryProtocol.readMapEnd()`
+ NOW THROWS: `org.apache.thrift.protocol.TBinaryProtocol.readMapEnd()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.protocol.TBinaryProtocol.readMessageEnd()`
+ NOW THROWS: `org.apache.thrift.protocol.TBinaryProtocol.readMessageEnd()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.protocol.TBinaryProtocol.readSetEnd()`
+ NOW THROWS: `org.apache.thrift.protocol.TBinaryProtocol.readSetEnd()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.protocol.TBinaryProtocol.readStructBegin()`
+ NOW THROWS: `org.apache.thrift.protocol.TBinaryProtocol.readStructBegin()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.protocol.TBinaryProtocol.readStructEnd()`
+ NOW THROWS: `org.apache.thrift.protocol.TBinaryProtocol.readStructEnd()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.protocol.TBinaryProtocol.writeFieldEnd()`
+ NOW THROWS: `org.apache.thrift.protocol.TBinaryProtocol.writeFieldEnd()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.protocol.TBinaryProtocol.writeListEnd()`
+ NOW THROWS: `org.apache.thrift.protocol.TBinaryProtocol.writeListEnd()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.protocol.TBinaryProtocol.writeMapEnd()`
+ NOW THROWS: `org.apache.thrift.protocol.TBinaryProtocol.writeMapEnd()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.protocol.TBinaryProtocol.writeMessageEnd()`
+ NOW THROWS: `org.apache.thrift.protocol.TBinaryProtocol.writeMessageEnd()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.protocol.TBinaryProtocol.writeSetEnd()`
+ NOW THROWS: `org.apache.thrift.protocol.TBinaryProtocol.writeSetEnd()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.protocol.TBinaryProtocol.writeStructBegin(org.apache.thrift.protocol.TStruct)`
+ NOW THROWS: `org.apache.thrift.protocol.TBinaryProtocol.writeStructBegin(org.apache.thrift.protocol.TStruct)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.protocol.TBinaryProtocol.writeStructEnd()`
+ NOW THROWS: `org.apache.thrift.protocol.TBinaryProtocol.writeStructEnd()`

## org.apache.thrift.protocol.TProtocol

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.thrift.protocol.TProtocol`
+ MUST NOW IMPLEMENT: `org.apache.thrift.protocol.TProtocol.getMinSerializedSize(byte)`

## org.apache.thrift.protocol.TSimpleJSONProtocol

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.protocol.TSimpleJSONProtocol.readFieldEnd()`
+ NOW THROWS: `org.apache.thrift.protocol.TSimpleJSONProtocol.readFieldEnd()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.protocol.TSimpleJSONProtocol.readListEnd()`
+ NOW THROWS: `org.apache.thrift.protocol.TSimpleJSONProtocol.readListEnd()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.protocol.TSimpleJSONProtocol.readMapEnd()`
+ NOW THROWS: `org.apache.thrift.protocol.TSimpleJSONProtocol.readMapEnd()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.protocol.TSimpleJSONProtocol.readMessageEnd()`
+ NOW THROWS: `org.apache.thrift.protocol.TSimpleJSONProtocol.readMessageEnd()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.protocol.TSimpleJSONProtocol.readSetEnd()`
+ NOW THROWS: `org.apache.thrift.protocol.TSimpleJSONProtocol.readSetEnd()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.protocol.TSimpleJSONProtocol.readStructBegin()`
+ NOW THROWS: `org.apache.thrift.protocol.TSimpleJSONProtocol.readStructBegin()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.protocol.TSimpleJSONProtocol.readStructEnd()`
+ NOW THROWS: `org.apache.thrift.protocol.TSimpleJSONProtocol.readStructEnd()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.protocol.TSimpleJSONProtocol.writeFieldEnd()`
+ NOW THROWS: `org.apache.thrift.protocol.TSimpleJSONProtocol.writeFieldEnd()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.protocol.TSimpleJSONProtocol.writeFieldStop()`
+ NOW THROWS: `org.apache.thrift.protocol.TSimpleJSONProtocol.writeFieldStop()`

## org.apache.thrift.server.AbstractNonblockingServer$AsyncFrameBuffer

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.server.AbstractNonblockingServer$AsyncFrameBuffer.<init>(org.apache.thrift.transport.TNonblockingTransport,java.nio.channels.SelectionKey,org.apache.thrift.server.AbstractNonblockingServer$AbstractSelectThread)`
+ NOW THROWS: `org.apache.thrift.server.AbstractNonblockingServer$AsyncFrameBuffer.<init>(org.apache.thrift.transport.TNonblockingTransport,java.nio.channels.SelectionKey,org.apache.thrift.server.AbstractNonblockingServer$AbstractSelectThread)`

## org.apache.thrift.server.AbstractNonblockingServer$FrameBuffer

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.server.AbstractNonblockingServer$FrameBuffer.<init>(org.apache.thrift.transport.TNonblockingTransport,java.nio.channels.SelectionKey,org.apache.thrift.server.AbstractNonblockingServer$AbstractSelectThread)`
+ NOW THROWS: `org.apache.thrift.server.AbstractNonblockingServer$FrameBuffer.<init>(org.apache.thrift.transport.TNonblockingTransport,java.nio.channels.SelectionKey,org.apache.thrift.server.AbstractNonblockingServer$AbstractSelectThread)`

## org.apache.thrift.server.ServerContext

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.thrift.server.ServerContext`
+ MUST NOW IMPLEMENT: `org.apache.thrift.server.ServerContext.isWrapperFor(java.lang.Class<? extends java.lang.Object>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.thrift.server.ServerContext`
+ MUST NOW IMPLEMENT: `org.apache.thrift.server.ServerContext.unwrap(java.lang.Class<T>)`

## org.apache.thrift.server.TNonblockingServer$SelectAcceptThread

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.server.TNonblockingServer$SelectAcceptThread.createFrameBuffer(org.apache.thrift.transport.TNonblockingTransport,java.nio.channels.SelectionKey,org.apache.thrift.server.AbstractNonblockingServer$AbstractSelectThread)`
+ NOW THROWS: `org.apache.thrift.server.TNonblockingServer$SelectAcceptThread.createFrameBuffer(org.apache.thrift.transport.TNonblockingTransport,java.nio.channels.SelectionKey,org.apache.thrift.server.AbstractNonblockingServer$AbstractSelectThread)`

## org.apache.thrift.server.TThreadPoolServer

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.thrift.server.TThreadPoolServer.waitForShutdown()`
+ NEW RETURN TYPE: `org.apache.thrift.server.TThreadPoolServer.waitForShutdown()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.thrift.server.TThreadPoolServer.waitForShutdown()`
+ NEW RETURN TYPE: `org.apache.thrift.server.TThreadPoolServer.waitForShutdown()`

## org.apache.thrift.server.TThreadPoolServer$Args

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.thrift.server.TThreadPoolServer$Args.beBackoffSlotLength`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.thrift.server.TThreadPoolServer$Args.beBackoffSlotLengthUnit`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.thrift.server.TThreadPoolServer$Args.requestTimeout`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.thrift.server.TThreadPoolServer$Args.requestTimeoutUnit`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.thrift.server.TThreadPoolServer$Args.beBackoffSlotLength(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.thrift.server.TThreadPoolServer$Args.beBackoffSlotLengthUnit(java.util.concurrent.TimeUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.thrift.server.TThreadPoolServer$Args.requestTimeout(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.thrift.server.TThreadPoolServer$Args.requestTimeoutUnit(java.util.concurrent.TimeUnit)`

## org.apache.thrift.server.TThreadedSelectorServer$SelectorThread

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.server.TThreadedSelectorServer$SelectorThread.createFrameBuffer(org.apache.thrift.transport.TNonblockingTransport,java.nio.channels.SelectionKey,org.apache.thrift.server.AbstractNonblockingServer$AbstractSelectThread)`
+ NOW THROWS: `org.apache.thrift.server.TThreadedSelectorServer$SelectorThread.createFrameBuffer(org.apache.thrift.transport.TNonblockingTransport,java.nio.channels.SelectionKey,org.apache.thrift.server.AbstractNonblockingServer$AbstractSelectThread)`

## org.apache.thrift.transport.AutoExpandingBuffer

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.thrift.transport.AutoExpandingBuffer.<init>(int,double)`

## org.apache.thrift.transport.AutoExpandingBufferReadTransport

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.thrift.transport.AutoExpandingBufferReadTransport.<init>(int,double)`

## org.apache.thrift.transport.AutoExpandingBufferWriteTransport

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.thrift.transport.AutoExpandingBufferWriteTransport.<init>(int,double)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.thrift.transport.AutoExpandingBufferWriteTransport.getPos()`

## org.apache.thrift.transport.TByteBuffer

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TByteBuffer.<init>(java.nio.ByteBuffer)`
+ NOW THROWS: `org.apache.thrift.transport.TByteBuffer.<init>(java.nio.ByteBuffer)`

## org.apache.thrift.transport.TFastFramedTransport

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.thrift.transport.TFastFramedTransport`

## org.apache.thrift.transport.TFastFramedTransport$Factory

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.thrift.transport.TFastFramedTransport$Factory`

## org.apache.thrift.transport.TFramedTransport

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.thrift.transport.TFramedTransport`

## org.apache.thrift.transport.TFramedTransport$Factory

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.thrift.transport.TFramedTransport$Factory`

## org.apache.thrift.transport.TIOStreamTransport

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TIOStreamTransport.<init>()`
+ NOW THROWS: `org.apache.thrift.transport.TIOStreamTransport.<init>()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TIOStreamTransport.<init>(java.io.InputStream)`
+ NOW THROWS: `org.apache.thrift.transport.TIOStreamTransport.<init>(java.io.InputStream)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TIOStreamTransport.<init>(java.io.InputStream,java.io.OutputStream)`
+ NOW THROWS: `org.apache.thrift.transport.TIOStreamTransport.<init>(java.io.InputStream,java.io.OutputStream)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TIOStreamTransport.<init>(java.io.OutputStream)`
+ NOW THROWS: `org.apache.thrift.transport.TIOStreamTransport.<init>(java.io.OutputStream)`

## org.apache.thrift.transport.TMemoryBuffer

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TMemoryBuffer.<init>(int)`
+ NOW THROWS: `org.apache.thrift.transport.TMemoryBuffer.<init>(int)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TMemoryBuffer.read(byte[],int,int)`
+ NOW THROWS: `org.apache.thrift.transport.TMemoryBuffer.read(byte[],int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.thrift.transport.TMemoryBuffer.toString(java.lang.String)`

## org.apache.thrift.transport.TMemoryInputTransport

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TMemoryInputTransport.<init>()`
+ NOW THROWS: `org.apache.thrift.transport.TMemoryInputTransport.<init>()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TMemoryInputTransport.<init>(byte[])`
+ NOW THROWS: `org.apache.thrift.transport.TMemoryInputTransport.<init>(byte[])`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TMemoryInputTransport.<init>(byte[],int,int)`
+ NOW THROWS: `org.apache.thrift.transport.TMemoryInputTransport.<init>(byte[],int,int)`

## org.apache.thrift.transport.TNonblockingServerSocket

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.thrift.transport.TNonblockingServerSocket.acceptImpl()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.thrift.transport.TServerTransport.accept()`
+ NEW RETURN TYPE: `org.apache.thrift.transport.TNonblockingServerSocket.accept()`

## org.apache.thrift.transport.TNonblockingServerTransport

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.apache.thrift.transport.TServerTransport.accept()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.thrift.transport.TServerTransport.acceptImpl()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.thrift.transport.TServerTransport.accept()`
+ NEW RETURN TYPE: `org.apache.thrift.transport.TNonblockingServerTransport.accept()`

## org.apache.thrift.transport.TNonblockingSocket

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TNonblockingSocket.<init>(java.lang.String,int)`
+ NOW THROWS: `org.apache.thrift.transport.TNonblockingSocket.<init>(java.lang.String,int)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TNonblockingSocket.<init>(java.lang.String,int,int)`
+ NOW THROWS: `org.apache.thrift.transport.TNonblockingSocket.<init>(java.lang.String,int,int)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TNonblockingSocket.<init>(java.nio.channels.SocketChannel)`
+ NOW THROWS: `org.apache.thrift.transport.TNonblockingSocket.<init>(java.nio.channels.SocketChannel)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TNonblockingSocket.read(java.nio.ByteBuffer)`
+ NOW THROWS: `org.apache.thrift.transport.TNonblockingSocket.read(java.nio.ByteBuffer)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TNonblockingSocket.write(java.nio.ByteBuffer)`
+ NOW THROWS: `org.apache.thrift.transport.TNonblockingSocket.write(java.nio.ByteBuffer)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.apache.thrift.transport.TNonblockingSocket.read(java.nio.ByteBuffer)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.apache.thrift.transport.TNonblockingSocket.write(java.nio.ByteBuffer)`

## org.apache.thrift.transport.TNonblockingTransport

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.thrift.transport.TNonblockingTransport.<init>()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TNonblockingTransport.read(java.nio.ByteBuffer)`
+ NOW THROWS: `org.apache.thrift.transport.TTransport.read(java.nio.ByteBuffer)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TNonblockingTransport.write(java.nio.ByteBuffer)`
+ NOW THROWS: `org.apache.thrift.transport.TTransport.write(java.nio.ByteBuffer)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.apache.thrift.transport.TNonblockingTransport.read(java.nio.ByteBuffer)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.apache.thrift.transport.TNonblockingTransport.write(java.nio.ByteBuffer)`

## org.apache.thrift.transport.TSaslClientTransport

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TSaslClientTransport.<init>(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.util.Map<java.lang.String,java.lang.String>,javax.security.auth.callback.CallbackHandler,org.apache.thrift.transport.TTransport)`
+ NOW THROWS: `org.apache.thrift.transport.TSaslClientTransport.<init>(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.util.Map<java.lang.String,java.lang.String>,javax.security.auth.callback.CallbackHandler,org.apache.thrift.transport.TTransport)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TSaslClientTransport.<init>(javax.security.sasl.SaslClient,org.apache.thrift.transport.TTransport)`
+ NOW THROWS: `org.apache.thrift.transport.TSaslClientTransport.<init>(javax.security.sasl.SaslClient,org.apache.thrift.transport.TTransport)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.thrift.transport.TSaslTransport.sendAndThrowMessage(org.apache.thrift.transport.TSaslTransport$NegotiationStatus,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.thrift.transport.TSaslTransport.sendSaslMessage(org.apache.thrift.transport.TSaslTransport$NegotiationStatus,byte[])`

## org.apache.thrift.transport.TSaslServerTransport

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TSaslServerTransport.<init>(java.lang.String,java.lang.String,java.lang.String,java.util.Map<java.lang.String,java.lang.String>,javax.security.auth.callback.CallbackHandler,org.apache.thrift.transport.TTransport)`
+ NOW THROWS: `org.apache.thrift.transport.TSaslServerTransport.<init>(java.lang.String,java.lang.String,java.lang.String,java.util.Map<java.lang.String,java.lang.String>,javax.security.auth.callback.CallbackHandler,org.apache.thrift.transport.TTransport)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TSaslServerTransport.<init>(org.apache.thrift.transport.TTransport)`
+ NOW THROWS: `org.apache.thrift.transport.TSaslServerTransport.<init>(org.apache.thrift.transport.TTransport)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.thrift.transport.TSaslTransport.sendAndThrowMessage(org.apache.thrift.transport.TSaslTransport$NegotiationStatus,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.thrift.transport.TSaslTransport.sendSaslMessage(org.apache.thrift.transport.TSaslTransport$NegotiationStatus,byte[])`

## org.apache.thrift.transport.TSaslServerTransport$Factory

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TSaslServerTransport$Factory.getTransport(org.apache.thrift.transport.TTransport)`
+ NOW THROWS: `org.apache.thrift.transport.TSaslServerTransport$Factory.getTransport(org.apache.thrift.transport.TTransport)`

## org.apache.thrift.transport.TSaslTransportException

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.thrift.transport.TSaslTransportException`

## org.apache.thrift.transport.TServerSocket

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.thrift.transport.TServerSocket.acceptImpl()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.thrift.transport.TServerTransport.accept()`
+ NEW RETURN TYPE: `org.apache.thrift.transport.TServerSocket.accept()`

## org.apache.thrift.transport.TServerTransport

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.apache.thrift.transport.TServerTransport.accept()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.thrift.transport.TServerTransport.acceptImpl()`

## org.apache.thrift.transport.TSocket

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.thrift.transport.TSocket.<init>(java.lang.String,int,int,int)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TSocket.<init>(java.lang.String,int)`
+ NOW THROWS: `org.apache.thrift.transport.TSocket.<init>(java.lang.String,int)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TSocket.<init>(java.lang.String,int,int)`
+ NOW THROWS: `org.apache.thrift.transport.TSocket.<init>(java.lang.String,int,int)`

## org.apache.thrift.transport.TTransport

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.thrift.transport.TTransport`
+ MUST NOW IMPLEMENT: `org.apache.thrift.transport.TTransport.updateKnownMessageSize(long)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.thrift.transport.TTransport`
+ MUST NOW IMPLEMENT: `org.apache.thrift.transport.TTransport.getConfiguration()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.thrift.transport.TTransport`
+ MUST NOW IMPLEMENT: `org.apache.thrift.transport.TTransport.checkReadBytesAvailable(long)`

## org.apache.thrift.transport.TTransportFactory

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TTransportFactory.getTransport(org.apache.thrift.transport.TTransport)`
+ NOW THROWS: `org.apache.thrift.transport.TTransportFactory.getTransport(org.apache.thrift.transport.TTransport)`

## org.apache.thrift.transport.TZlibTransport

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TZlibTransport.<init>(org.apache.thrift.transport.TTransport)`
+ NOW THROWS: `org.apache.thrift.transport.TZlibTransport.<init>(org.apache.thrift.transport.TTransport)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TZlibTransport.<init>(org.apache.thrift.transport.TTransport,int)`
+ NOW THROWS: `org.apache.thrift.transport.TZlibTransport.<init>(org.apache.thrift.transport.TTransport,int)`

## org.apache.thrift.transport.TZlibTransport$Factory

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.thrift.transport.TZlibTransport$Factory.getTransport(org.apache.thrift.transport.TTransport)`
+ NOW THROWS: `org.apache.thrift.transport.TZlibTransport$Factory.getTransport(org.apache.thrift.transport.TTransport)`

