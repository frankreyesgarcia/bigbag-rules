# Breaking Changes: org.apache.mina:mina-core 2.1.5 → 2.2.1
Total: 31 (binary-breaking: 22, source-breaking: 31)

## org.apache.mina.core.session.IoSession

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.mina.core.session.IoSession`
+ MUST NOW IMPLEMENT: `org.apache.mina.core.session.IoSession.isServer()`

## org.apache.mina.filter.codec.AbstractProtocolDecoderOutput

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.mina.filter.codec.AbstractProtocolDecoderOutput.getMessageQueue()`

## org.apache.mina.filter.codec.AbstractProtocolEncoderOutput

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.mina.filter.codec.AbstractProtocolEncoderOutput.getMessageQueue()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.mina.filter.codec.AbstractProtocolEncoderOutput.mergeAll()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.mina.filter.codec.ProtocolEncoderOutput.flush()`

## org.apache.mina.filter.codec.ProtocolEncoderOutput

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.mina.filter.codec.ProtocolEncoderOutput.flush()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.mina.filter.codec.ProtocolEncoderOutput.mergeAll()`

## org.apache.mina.filter.ssl.SslFilter

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.mina.filter.ssl.SslFilter.<init>(javax.net.ssl.SSLContext,boolean)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.mina.filter.ssl.SslFilter.CLIENT_HANDSHAKE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.mina.filter.ssl.SslFilter.DISABLE_ENCRYPTION_ONCE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.mina.filter.ssl.SslFilter.PEER_ADDRESS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.mina.filter.ssl.SslFilter.SSL_SESSION`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.mina.filter.ssl.SslFilter.START_HANDSHAKE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.mina.filter.ssl.SslFilter.USE_NOTIFICATION`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.mina.filter.ssl.SslFilter.filterClose(org.apache.mina.core.filterchain.IoFilter$NextFilter,org.apache.mina.core.session.IoSession)`
+ NOW THROWS: `org.apache.mina.core.filterchain.IoFilterAdapter.filterClose(org.apache.mina.core.filterchain.IoFilter$NextFilter,org.apache.mina.core.session.IoSession)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.mina.filter.ssl.SslFilter.filterWrite(org.apache.mina.core.filterchain.IoFilter$NextFilter,org.apache.mina.core.session.IoSession,org.apache.mina.core.write.WriteRequest)`
+ NOW THROWS: `org.apache.mina.filter.ssl.SslFilter.filterWrite(org.apache.mina.core.filterchain.IoFilter$NextFilter,org.apache.mina.core.session.IoSession,org.apache.mina.core.write.WriteRequest)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.mina.filter.ssl.SslFilter.messageReceived(org.apache.mina.core.filterchain.IoFilter$NextFilter,org.apache.mina.core.session.IoSession,java.lang.Object)`
+ NOW THROWS: `org.apache.mina.filter.ssl.SslFilter.messageReceived(org.apache.mina.core.filterchain.IoFilter$NextFilter,org.apache.mina.core.session.IoSession,java.lang.Object)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.mina.filter.ssl.SslFilter.messageSent(org.apache.mina.core.filterchain.IoFilter$NextFilter,org.apache.mina.core.session.IoSession,org.apache.mina.core.write.WriteRequest)`
+ NOW THROWS: `org.apache.mina.filter.ssl.SslFilter.messageSent(org.apache.mina.core.filterchain.IoFilter$NextFilter,org.apache.mina.core.session.IoSession,org.apache.mina.core.write.WriteRequest)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.mina.filter.ssl.SslFilter.onPostAdd(org.apache.mina.core.filterchain.IoFilterChain,java.lang.String,org.apache.mina.core.filterchain.IoFilter$NextFilter)`
+ NOW THROWS: `org.apache.mina.filter.ssl.SslFilter.onPostAdd(org.apache.mina.core.filterchain.IoFilterChain,java.lang.String,org.apache.mina.core.filterchain.IoFilter$NextFilter)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.mina.filter.ssl.SslFilter.onPreAdd(org.apache.mina.core.filterchain.IoFilterChain,java.lang.String,org.apache.mina.core.filterchain.IoFilter$NextFilter)`
+ NOW THROWS: `org.apache.mina.filter.ssl.SslFilter.onPreAdd(org.apache.mina.core.filterchain.IoFilterChain,java.lang.String,org.apache.mina.core.filterchain.IoFilter$NextFilter)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.mina.filter.ssl.SslFilter.onPreRemove(org.apache.mina.core.filterchain.IoFilterChain,java.lang.String,org.apache.mina.core.filterchain.IoFilter$NextFilter)`
+ NOW THROWS: `org.apache.mina.filter.ssl.SslFilter.onPreRemove(org.apache.mina.core.filterchain.IoFilterChain,java.lang.String,org.apache.mina.core.filterchain.IoFilter$NextFilter)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.mina.filter.ssl.SslFilter.sessionClosed(org.apache.mina.core.filterchain.IoFilter$NextFilter,org.apache.mina.core.session.IoSession)`
+ NOW THROWS: `org.apache.mina.filter.ssl.SslFilter.sessionClosed(org.apache.mina.core.filterchain.IoFilter$NextFilter,org.apache.mina.core.session.IoSession)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.mina.filter.ssl.SslFilter.getSslSession(org.apache.mina.core.session.IoSession)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.mina.filter.ssl.SslFilter.initiateHandshake(org.apache.mina.core.session.IoSession)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.mina.filter.ssl.SslFilter.isSecured(org.apache.mina.core.session.IoSession)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.mina.filter.ssl.SslFilter.isSslStarted(org.apache.mina.core.session.IoSession)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.mina.filter.ssl.SslFilter.isUseClientMode()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.mina.filter.ssl.SslFilter.setUseClientMode(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.mina.filter.ssl.SslFilter.startSsl(org.apache.mina.core.session.IoSession)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.mina.filter.ssl.SslFilter.stopSsl(org.apache.mina.core.session.IoSession)`

## org.apache.mina.filter.ssl.SslFilter$SslFilterMessage

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.mina.filter.ssl.SslFilter$SslFilterMessage`

