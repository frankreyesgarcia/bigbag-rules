# Breaking Changes: ch.qos.logback:logback-core 1.1.11 → 1.2.9
Total: 50 (binary-breaking: 43, source-breaking: 50)

## ch.qos.logback.core.db.BindDataSourceToJNDIAction

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.core.db.BindDataSourceToJNDIAction`

## ch.qos.logback.core.db.ConnectionSource

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.core.db.ConnectionSource`

## ch.qos.logback.core.db.ConnectionSourceBase

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.core.db.ConnectionSourceBase`

## ch.qos.logback.core.db.DBAppenderBase

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.core.db.DBAppenderBase`

## ch.qos.logback.core.db.DBHelper

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.core.db.DBHelper`

## ch.qos.logback.core.db.DataSourceConnectionSource

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.core.db.DataSourceConnectionSource`

## ch.qos.logback.core.db.DriverManagerConnectionSource

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.core.db.DriverManagerConnectionSource`

## ch.qos.logback.core.db.JNDIConnectionSource

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.core.db.JNDIConnectionSource`

## ch.qos.logback.core.db.dialect.DBUtil

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.core.db.dialect.DBUtil`

## ch.qos.logback.core.db.dialect.H2Dialect

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.core.db.dialect.H2Dialect`

## ch.qos.logback.core.db.dialect.HSQLDBDialect

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.core.db.dialect.HSQLDBDialect`

## ch.qos.logback.core.db.dialect.MsSQLDialect

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.core.db.dialect.MsSQLDialect`

## ch.qos.logback.core.db.dialect.MySQLDialect

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.core.db.dialect.MySQLDialect`

## ch.qos.logback.core.db.dialect.OracleDialect

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.core.db.dialect.OracleDialect`

## ch.qos.logback.core.db.dialect.PostgreSQLDialect

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.core.db.dialect.PostgreSQLDialect`

## ch.qos.logback.core.db.dialect.SQLDialect

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.core.db.dialect.SQLDialect`

## ch.qos.logback.core.db.dialect.SQLDialectCode

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.core.db.dialect.SQLDialectCode`

## ch.qos.logback.core.db.dialect.SQLiteDialect

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.core.db.dialect.SQLiteDialect`

## ch.qos.logback.core.db.dialect.SybaseSqlAnywhereDialect

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.core.db.dialect.SybaseSqlAnywhereDialect`

## ch.qos.logback.core.encoder.EchoEncoder

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `ch.qos.logback.core.encoder.EncoderBase.outputStream`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.core.encoder.EchoEncoder.close()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.core.encoder.EchoEncoder.doEncode(E)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.core.encoder.EchoEncoder.init(java.io.OutputStream)`

## ch.qos.logback.core.encoder.Encoder

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.core.encoder.Encoder.close()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.core.encoder.Encoder.doEncode(E)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.core.encoder.Encoder.init(java.io.OutputStream)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `ch.qos.logback.core.encoder.Encoder`
+ MUST NOW IMPLEMENT: `ch.qos.logback.core.encoder.Encoder.headerBytes()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `ch.qos.logback.core.encoder.Encoder`
+ MUST NOW IMPLEMENT: `ch.qos.logback.core.encoder.Encoder.encode(E)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `ch.qos.logback.core.encoder.Encoder`
+ MUST NOW IMPLEMENT: `ch.qos.logback.core.encoder.Encoder.footerBytes()`

## ch.qos.logback.core.encoder.EncoderBase

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `ch.qos.logback.core.encoder.EncoderBase.outputStream`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.core.encoder.Encoder.close()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.core.encoder.Encoder.doEncode(E)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.core.encoder.EncoderBase.init(java.io.OutputStream)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `ch.qos.logback.core.encoder.EncoderBase`
+ MUST NOW IMPLEMENT: `ch.qos.logback.core.encoder.Encoder.encode(E)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `ch.qos.logback.core.encoder.EncoderBase`
+ MUST NOW IMPLEMENT: `ch.qos.logback.core.encoder.Encoder.footerBytes()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `ch.qos.logback.core.encoder.EncoderBase`
+ MUST NOW IMPLEMENT: `ch.qos.logback.core.encoder.Encoder.headerBytes()`

## ch.qos.logback.core.encoder.EventObjectInputStream

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.core.encoder.EventObjectInputStream`

## ch.qos.logback.core.encoder.LayoutWrappingEncoder

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `ch.qos.logback.core.encoder.EncoderBase.outputStream`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.core.encoder.LayoutWrappingEncoder.close()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.core.encoder.LayoutWrappingEncoder.doEncode(E)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.core.encoder.LayoutWrappingEncoder.init(java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.core.encoder.LayoutWrappingEncoder.isImmediateFlush()`

## ch.qos.logback.core.encoder.ObjectStreamEncoder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.core.encoder.ObjectStreamEncoder`

## ch.qos.logback.core.net.JMSAppenderBase

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.core.net.JMSAppenderBase`

## ch.qos.logback.core.net.ssl.SSLConfigurable

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `ch.qos.logback.core.net.ssl.SSLConfigurable`
+ MUST NOW IMPLEMENT: `ch.qos.logback.core.net.ssl.SSLConfigurable.setHostnameVerification(boolean)`

## ch.qos.logback.core.pattern.PatternLayoutEncoderBase

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `ch.qos.logback.core.encoder.EncoderBase.outputStream`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.core.encoder.LayoutWrappingEncoder.close()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.core.encoder.LayoutWrappingEncoder.doEncode(E)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.core.encoder.LayoutWrappingEncoder.init(java.io.OutputStream)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.core.encoder.LayoutWrappingEncoder.isImmediateFlush()`

