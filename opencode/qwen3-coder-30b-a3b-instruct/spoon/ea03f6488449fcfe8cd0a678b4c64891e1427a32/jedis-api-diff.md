# Breaking Changes: redis.clients:jedis 3.9.0 → 4.3.2
Total: 2452 (binary-breaking: 1450, source-breaking: 1846)

## redis.clients.jedis.AccessControlLogEntry

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.AccessControlLogEntry`

## redis.clients.jedis.AccessControlUser

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.AccessControlUser`

## redis.clients.jedis.BinaryClient

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.BinaryClient`

## redis.clients.jedis.BinaryJedis

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.BinaryJedis`

## redis.clients.jedis.BinaryJedis$SetFromList

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.BinaryJedis$SetFromList`

## redis.clients.jedis.BinaryJedisCluster

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.BinaryJedisCluster`

## redis.clients.jedis.BinaryJedisPubSub

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisPubSub.proceed(redis.clients.jedis.Client,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisPubSub.proceedWithPatterns(redis.clients.jedis.Client,byte[][])`

## redis.clients.jedis.BinaryShardedJedis

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.BinaryShardedJedis`

## redis.clients.jedis.BitOP

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.BitOP`

## redis.clients.jedis.BitPosParams

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.BitPosParams`

## redis.clients.jedis.BuilderFactory

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.BuilderFactory.BYTE_ARRAY_MAP`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.BuilderFactory.BYTE_ARRAY_ZSET`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.BuilderFactory.EVAL_BINARY_RESULT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.BuilderFactory.EVAL_RESULT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.BuilderFactory.OBJECT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.BuilderFactory.STRING_ZSET`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `redis.clients.jedis.BuilderFactory.ACCESS_CONTROL_LOG_ENTRY_LIST`
+ NEW FIELD: `redis.clients.jedis.BuilderFactory.ACCESS_CONTROL_LOG_ENTRY_LIST`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `redis.clients.jedis.BuilderFactory.ACCESS_CONTROL_USER`
+ NEW FIELD: `redis.clients.jedis.BuilderFactory.ACCESS_CONTROL_USER`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `redis.clients.jedis.BuilderFactory.GEORADIUS_WITH_PARAMS_RESULT`
+ NEW FIELD: `redis.clients.jedis.BuilderFactory.GEORADIUS_WITH_PARAMS_RESULT`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `redis.clients.jedis.BuilderFactory.PUBSUB_NUMSUB_MAP`
+ NEW FIELD: `redis.clients.jedis.BuilderFactory.PUBSUB_NUMSUB_MAP`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `redis.clients.jedis.BuilderFactory.STREAM_AUTO_CLAIM_RESPONSE`
+ NEW FIELD: `redis.clients.jedis.BuilderFactory.STREAM_AUTO_CLAIM_RESPONSE`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `redis.clients.jedis.BuilderFactory.STREAM_CONSUMERS_INFO_LIST`
+ NEW FIELD: `redis.clients.jedis.BuilderFactory.STREAM_CONSUMERS_INFO_LIST`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `redis.clients.jedis.BuilderFactory.STREAM_ENTRY`
+ NEW FIELD: `redis.clients.jedis.BuilderFactory.STREAM_ENTRY`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `redis.clients.jedis.BuilderFactory.STREAM_ENTRY_LIST`
+ NEW FIELD: `redis.clients.jedis.BuilderFactory.STREAM_ENTRY_LIST`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `redis.clients.jedis.BuilderFactory.STREAM_GROUP_INFO_LIST`
+ NEW FIELD: `redis.clients.jedis.BuilderFactory.STREAM_GROUP_INFO_LIST`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `redis.clients.jedis.BuilderFactory.STREAM_INFO`
+ NEW FIELD: `redis.clients.jedis.BuilderFactory.STREAM_INFO`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `redis.clients.jedis.BuilderFactory.STREAM_PENDING_ENTRY_LIST`
+ NEW FIELD: `redis.clients.jedis.BuilderFactory.STREAM_PENDING_ENTRY_LIST`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `redis.clients.jedis.BuilderFactory.STREAM_PENDING_SUMMARY`
+ NEW FIELD: `redis.clients.jedis.BuilderFactory.STREAM_PENDING_SUMMARY`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `redis.clients.jedis.BuilderFactory.STREAM_READ_RESPONSE`
+ NEW FIELD: `redis.clients.jedis.BuilderFactory.STREAM_READ_RESPONSE`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `redis.clients.jedis.BuilderFactory.TUPLE`
+ NEW FIELD: `redis.clients.jedis.BuilderFactory.TUPLE`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `redis.clients.jedis.BuilderFactory.TUPLE_ZSET`
+ NEW FIELD: `redis.clients.jedis.BuilderFactory.TUPLE_ZSET`

## redis.clients.jedis.Client

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.Client`

## redis.clients.jedis.ClusterReset

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.ClusterReset`

## redis.clients.jedis.Connection

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.Connection.<init>(java.lang.String)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.Connection.<init>(java.lang.String,int,boolean)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.Connection.<init>(java.lang.String,int,boolean,javax.net.ssl.SSLSocketFactory,javax.net.ssl.SSLParameters,javax.net.ssl.HostnameVerifier)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Connection.getConnectionTimeout()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Connection.getHost()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Connection.getPort()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Connection.getRawObjectMultiBulkReply()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Connection.getSocket()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Connection.setConnectionTimeout(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Connection.setHost(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Connection.setInfiniteSoTimeout(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Connection.setPort(int)`

## redis.clients.jedis.DebugParams

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.DebugParams`

## redis.clients.jedis.DefaultJedisSocketFactory

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.DefaultJedisSocketFactory.<init>(java.lang.String,int,int,int,boolean,javax.net.ssl.SSLSocketFactory,javax.net.ssl.SSLParameters,javax.net.ssl.HostnameVerifier)`

### METHOD_NOW_PROTECTED [binary ✗ | source ✗]
- METHOD (now protected, was public): `redis.clients.jedis.DefaultJedisSocketFactory.getSocketHostAndPort()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.DefaultJedisSocketFactory.getConnectionTimeout()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.DefaultJedisSocketFactory.getDescription()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.DefaultJedisSocketFactory.getHost()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.DefaultJedisSocketFactory.getHostAndPortMapper()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.DefaultJedisSocketFactory.getHostnameVerifier()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.DefaultJedisSocketFactory.getPort()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.DefaultJedisSocketFactory.getSoTimeout()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.DefaultJedisSocketFactory.getSslParameters()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.DefaultJedisSocketFactory.getSslSocketFactory()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.DefaultJedisSocketFactory.isSsl()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.DefaultJedisSocketFactory.setConnectionTimeout(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.DefaultJedisSocketFactory.setHost(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.DefaultJedisSocketFactory.setHostAndPort(redis.clients.jedis.HostAndPort)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.DefaultJedisSocketFactory.setHostAndPortMapper(redis.clients.jedis.HostAndPortMapper)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.DefaultJedisSocketFactory.setHostnameVerifier(javax.net.ssl.HostnameVerifier)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.DefaultJedisSocketFactory.setPort(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.DefaultJedisSocketFactory.setSoTimeout(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.DefaultJedisSocketFactory.setSsl(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.DefaultJedisSocketFactory.setSslParameters(javax.net.ssl.SSLParameters)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.DefaultJedisSocketFactory.setSslSocketFactory(javax.net.ssl.SSLSocketFactory)`

## redis.clients.jedis.GeoRadiusResponse

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.GeoRadiusResponse`

## redis.clients.jedis.GeoUnit

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.GeoUnit`

## redis.clients.jedis.HostAndPort

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.HostAndPort.localhost`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.HostAndPort.log`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.HostAndPort.convertHost(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.HostAndPort.extractParts(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.HostAndPort.getLocalHostQuietly()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.HostAndPort.getLocalhost()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.HostAndPort.parseString(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.HostAndPort.setLocalhost(java.lang.String)`

## redis.clients.jedis.Jedis

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.Jedis.<init>(redis.clients.jedis.JedisShardInfo)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.BinaryJedis.client`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.BinaryJedis.pipeline`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.BinaryJedis.transaction`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Jedis.dataSource`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.aclLog(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.bitop(redis.clients.jedis.BitOP,byte[],byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.bitpos(byte[],boolean,redis.clients.jedis.BitPosParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.blpop(byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.brpop(byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.configSetBinary(byte[],byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.debug(redis.clients.jedis.DebugParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.eval(byte[],byte[],byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.geodist(byte[],byte[],byte[],redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.georadius(byte[],double,double,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.georadius(byte[],double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.georadiusByMember(byte[],byte[],double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.georadiusByMember(byte[],byte[],double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.georadiusByMemberReadonly(byte[],byte[],double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.georadiusByMemberReadonly(byte[],byte[],double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.georadiusByMemberStore(byte[],byte[],double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam,redis.clients.jedis.params.GeoRadiusStoreParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.georadiusReadonly(byte[],double,double,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.georadiusReadonly(byte[],double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.georadiusStore(byte[],double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam,redis.clients.jedis.params.GeoRadiusStoreParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.getTupledSet()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.hscan(byte[],byte[],redis.clients.jedis.ScanParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.linsert(byte[],redis.clients.jedis.ListPosition,byte[],byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.restoreReplace(byte[],long,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.scan(byte[],redis.clients.jedis.ScanParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.scan(byte[],redis.clients.jedis.ScanParams,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.setbit(byte[],long,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.sort(byte[],redis.clients.jedis.SortingParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.sort(byte[],redis.clients.jedis.SortingParams,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.sscan(byte[],byte[],redis.clients.jedis.ScanParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.sync()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.xadd(byte[],byte[],java.util.Map<byte[],byte[]>,long,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.xclaim(byte[],byte[],byte[],long,long,int,boolean,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.xinfoConsumersBinary(byte[],byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.xinfoGroupBinary(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.xinfoStreamBinary(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.xread(int,long,java.util.Map<byte[],byte[]>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.xreadGroup(byte[],byte[],int,long,boolean,java.util.Map<byte[],byte[]>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.zinter(redis.clients.jedis.ZParams,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.zinterWithScores(redis.clients.jedis.ZParams,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.zinterstore(byte[],redis.clients.jedis.ZParams,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.zscan(byte[],byte[],redis.clients.jedis.ScanParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.zunion(redis.clients.jedis.ZParams,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.zunionWithScores(redis.clients.jedis.ZParams,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedis.zunionstore(byte[],redis.clients.jedis.ZParams,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.aclLog(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.bitop(redis.clients.jedis.BitOP,java.lang.String,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.bitpos(java.lang.String,boolean,redis.clients.jedis.BitPosParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.blpop(java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.brpop(java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.clusterReset(redis.clients.jedis.ClusterReset)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.geodist(java.lang.String,java.lang.String,java.lang.String,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.georadius(java.lang.String,double,double,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.georadius(java.lang.String,double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.georadiusByMember(java.lang.String,java.lang.String,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.georadiusByMember(java.lang.String,java.lang.String,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.georadiusByMemberReadonly(java.lang.String,java.lang.String,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.georadiusByMemberReadonly(java.lang.String,java.lang.String,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.georadiusByMemberStore(java.lang.String,java.lang.String,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam,redis.clients.jedis.params.GeoRadiusStoreParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.georadiusReadonly(java.lang.String,double,double,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.georadiusReadonly(java.lang.String,double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.georadiusStore(java.lang.String,double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam,redis.clients.jedis.params.GeoRadiusStoreParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.getParams(java.util.List<java.lang.String>,java.util.List<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.hscan(java.lang.String,java.lang.String,redis.clients.jedis.ScanParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.linsert(java.lang.String,redis.clients.jedis.ListPosition,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.restoreReplace(java.lang.String,long,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.scan(java.lang.String,redis.clients.jedis.ScanParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.scan(java.lang.String,redis.clients.jedis.ScanParams,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.setDataSource(redis.clients.jedis.JedisPoolAbstract)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.setbit(java.lang.String,long,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.sort(java.lang.String,redis.clients.jedis.SortingParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.sort(java.lang.String,redis.clients.jedis.SortingParams,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.sscan(java.lang.String,java.lang.String,redis.clients.jedis.ScanParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.xadd(java.lang.String,redis.clients.jedis.StreamEntryID,java.util.Map<java.lang.String,java.lang.String>,long,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.xclaim(java.lang.String,java.lang.String,java.lang.String,long,long,int,boolean,redis.clients.jedis.StreamEntryID[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.xread(int,long,java.util.Map$Entry<java.lang.String,redis.clients.jedis.StreamEntryID>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.xreadGroup(java.lang.String,java.lang.String,int,long,boolean,java.util.Map$Entry<java.lang.String,redis.clients.jedis.StreamEntryID>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.zinter(redis.clients.jedis.ZParams,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.zinterWithScores(redis.clients.jedis.ZParams,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.zinterstore(java.lang.String,redis.clients.jedis.ZParams,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.zscan(java.lang.String,java.lang.String,redis.clients.jedis.ScanParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.zunion(redis.clients.jedis.ZParams,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.zunionWithScores(redis.clients.jedis.ZParams,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Jedis.zunionstore(java.lang.String,redis.clients.jedis.ZParams,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.BinaryJedisCommands.expire(byte[],int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.BinaryJedisCommands.restore(byte[],int,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.BinaryJedisCommands.restoreReplace(byte[],int,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.BinaryJedisCommands.setex(byte[],int,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.BinaryJedisCommands.xrange(byte[],byte[],byte[],long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.expire(java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.restore(java.lang.String,int,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.restoreReplace(java.lang.String,int,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.setex(java.lang.String,int,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.aclDelUser(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.aclDelUser(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.aclGetUser(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.aclGetUser(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.append(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.append(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.bitcount(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.bitcount(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.bitcount(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.bitcount(byte[],long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.bitpos(byte[],boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.bitpos(byte[],boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.clientKill(redis.clients.jedis.params.ClientKillParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.clientKill(redis.clients.jedis.params.ClientKillParams)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.configSet(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.configSet(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.copy(byte[],byte[],boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.copy(byte[],byte[],boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.copy(byte[],byte[],int,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.copy(byte[],byte[],int,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.dbSize()`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.dbSize()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.decr(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.decr(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.decrBy(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.decrBy(byte[],long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.del(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.del(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.del(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.del(byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.exists(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.exists(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.exists(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.exists(byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.expire(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.expire(byte[],long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.expireAt(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.expireAt(byte[],long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.geoadd(byte[],double,double,byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.geoadd(byte[],double,double,byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.geoadd(byte[],java.util.Map<byte[],redis.clients.jedis.GeoCoordinate>)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.geoadd(byte[],java.util.Map<byte[],redis.clients.jedis.GeoCoordinate>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.geoadd(byte[],redis.clients.jedis.params.GeoAddParams,java.util.Map<byte[],redis.clients.jedis.GeoCoordinate>)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.geoadd(byte[],redis.clients.jedis.params.GeoAddParams,java.util.Map<byte[],redis.clients.jedis.GeoCoordinate>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.getClient()`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.getClient()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.getbit(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.getbit(byte[],long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.hdel(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hdel(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.hexists(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hexists(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.hincrBy(byte[],byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hincrBy(byte[],byte[],long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.hincrByFloat(byte[],byte[],double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hincrByFloat(byte[],byte[],double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.hlen(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hlen(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.hscan(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hscan(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.hset(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hset(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.hset(byte[],java.util.Map<byte[],byte[]>)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hset(byte[],java.util.Map<byte[],byte[]>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.hsetnx(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hsetnx(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.hstrlen(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hstrlen(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.incr(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.incr(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.incrBy(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.incrBy(byte[],long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.incrByFloat(byte[],double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.incrByFloat(byte[],double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.lastsave()`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.lastsave()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.llen(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.llen(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.lpush(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.lpush(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.lpushx(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.lpushx(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.lrem(byte[],long,byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.lrem(byte[],long,byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.move(byte[],int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.move(byte[],int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.msetnx(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.msetnx(byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.persist(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.persist(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.pexpire(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.pexpire(byte[],long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.pexpireAt(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.pexpireAt(byte[],long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.pfadd(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.pfadd(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.pfcount(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.pfcount(byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.pttl(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.pttl(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.publish(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.publish(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.renamenx(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.renamenx(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.rpush(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.rpush(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.rpushx(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.rpushx(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.sadd(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sadd(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.scan(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.scan(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.scard(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.scard(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.scriptExists(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.scriptExists(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.scriptExists(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.scriptExists(byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.sdiffstore(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sdiffstore(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.setbit(byte[],long,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.setbit(byte[],long,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.setnx(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.setnx(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.setrange(byte[],long,byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.setrange(byte[],long,byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.shutdown()`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.shutdown()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.sinterstore(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sinterstore(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.sismember(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sismember(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.slowlogLen()`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.slowlogLen()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.smove(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.smove(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.sort(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sort(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.srem(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.srem(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.sscan(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sscan(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.strlen(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.strlen(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.sunionstore(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sunionstore(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.touch(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.touch(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.touch(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.touch(byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.ttl(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.ttl(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.unlink(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.unlink(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.unlink(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.unlink(byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.waitReplicas(int,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.waitReplicas(int,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.xack(byte[],byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xack(byte[],byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.xdel(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xdel(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.xgroupDelConsumer(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xgroupDelConsumer(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.xgroupDestroy(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xgroupDestroy(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.xinfoConsumers(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xinfoConsumers(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.xinfoGroup(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xinfoGroup(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.xinfoStream(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xinfoStream(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.xlen(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xlen(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.xtrim(byte[],long,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xtrim(byte[],long,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.xtrim(byte[],redis.clients.jedis.params.XTrimParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xtrim(byte[],redis.clients.jedis.params.XTrimParams)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zadd(byte[],double,byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zadd(byte[],double,byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zadd(byte[],double,byte[],redis.clients.jedis.params.ZAddParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zadd(byte[],double,byte[],redis.clients.jedis.params.ZAddParams)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zadd(byte[],java.util.Map<byte[],java.lang.Double>)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zadd(byte[],java.util.Map<byte[],java.lang.Double>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zadd(byte[],java.util.Map<byte[],java.lang.Double>,redis.clients.jedis.params.ZAddParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zadd(byte[],java.util.Map<byte[],java.lang.Double>,redis.clients.jedis.params.ZAddParams)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zcard(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zcard(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zcount(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zcount(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zcount(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zcount(byte[],double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zdiffStore(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zdiffStore(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zdiffWithScores(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zdiffWithScores(byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zincrby(byte[],double,byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zincrby(byte[],double,byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zinterstore(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zinterstore(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zlexcount(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zlexcount(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zpopmax(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zpopmax(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zpopmax(byte[],int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zpopmax(byte[],int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zpopmin(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zpopmin(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zpopmin(byte[],int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zpopmin(byte[],int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrandmember(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrandmember(byte[],long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrandmemberWithScores(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrandmemberWithScores(byte[],long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrange(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrange(byte[],long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrangeByLex(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByLex(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrangeByLex(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByLex(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrangeByScore(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScore(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrangeByScore(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScore(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrangeByScore(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScore(byte[],double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrangeByScore(byte[],double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScore(byte[],double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrangeByScoreWithScores(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScoreWithScores(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrangeByScoreWithScores(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScoreWithScores(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrangeByScoreWithScores(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScoreWithScores(byte[],double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrangeByScoreWithScores(byte[],double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScoreWithScores(byte[],double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrangeWithScores(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeWithScores(byte[],long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrem(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrem(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zremrangeByLex(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zremrangeByLex(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zremrangeByRank(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zremrangeByRank(byte[],long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zremrangeByScore(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zremrangeByScore(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zremrangeByScore(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zremrangeByScore(byte[],double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrevrange(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrange(byte[],long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrevrangeByLex(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByLex(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrevrangeByLex(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByLex(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrevrangeByScore(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScore(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrevrangeByScore(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScore(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrevrangeByScore(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScore(byte[],double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrevrangeByScore(byte[],double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScore(byte[],double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrevrangeByScoreWithScores(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScoreWithScores(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrevrangeByScoreWithScores(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScoreWithScores(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrevrangeByScoreWithScores(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScoreWithScores(byte[],double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrevrangeByScoreWithScores(byte[],double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScoreWithScores(byte[],double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zrevrangeWithScores(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeWithScores(byte[],long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zscan(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zscan(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedis.zunionstore(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zunionstore(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.aclDelUser(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.aclDelUser(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.aclGetUser(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.aclGetUser(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.aclLog()`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.aclLog()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.aclLog(int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.aclLog(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.append(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.append(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.bitcount(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.bitcount(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.bitcount(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.bitcount(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.bitpos(java.lang.String,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.bitpos(java.lang.String,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.clientId()`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.clientId()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.clientUnblock(long,redis.clients.jedis.args.UnblockType)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.clientUnblock(long,redis.clients.jedis.args.UnblockType)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.clusterCountKeysInSlot(int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.clusterCountKeysInSlot(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.clusterKeySlot(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.clusterKeySlot(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.copy(java.lang.String,java.lang.String,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.copy(java.lang.String,java.lang.String,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.copy(java.lang.String,java.lang.String,int,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.copy(java.lang.String,java.lang.String,int,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.decr(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.decr(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.decrBy(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.decrBy(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.del(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.del(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.del(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.del(java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.exists(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.exists(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.exists(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.exists(java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.expire(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.expire(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.expireAt(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.expireAt(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.geoadd(java.lang.String,double,double,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.geoadd(java.lang.String,double,double,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.geoadd(java.lang.String,java.util.Map<java.lang.String,redis.clients.jedis.GeoCoordinate>)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.geoadd(java.lang.String,java.util.Map<java.lang.String,redis.clients.jedis.GeoCoordinate>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.geoadd(java.lang.String,redis.clients.jedis.params.GeoAddParams,java.util.Map<java.lang.String,redis.clients.jedis.GeoCoordinate>)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.geoadd(java.lang.String,redis.clients.jedis.params.GeoAddParams,java.util.Map<java.lang.String,redis.clients.jedis.GeoCoordinate>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.getbit(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.getbit(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.hdel(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hdel(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.hexists(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hexists(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.hincrBy(java.lang.String,java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hincrBy(java.lang.String,java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.hincrByFloat(java.lang.String,java.lang.String,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hincrByFloat(java.lang.String,java.lang.String,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.hlen(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hlen(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.hscan(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashCommands.hscan(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.hset(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hset(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.hset(java.lang.String,java.util.Map<java.lang.String,java.lang.String>)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hset(java.lang.String,java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.hsetnx(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hsetnx(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.hstrlen(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hstrlen(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.incr(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.incr(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.incrBy(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.incrBy(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.incrByFloat(java.lang.String,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.incrByFloat(java.lang.String,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.llen(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.llen(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.lpush(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.lpush(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.lpushx(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.lpushx(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.lrem(java.lang.String,long,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.lrem(java.lang.String,long,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.move(java.lang.String,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.move(java.lang.String,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.msetnx(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.msetnx(java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.persist(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.persist(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.pexpire(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.pexpire(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.pexpireAt(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.pexpireAt(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.pfadd(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.pfadd(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.pttl(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.pttl(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.publish(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.publish(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.pubsubNumSub(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.pubsubNumSub(java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.renamenx(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.renamenx(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.rpush(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.rpush(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.rpushx(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.rpushx(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.sadd(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sadd(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.scan(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.scan(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.scard(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.scard(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.sdiffstore(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sdiffstore(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.setbit(java.lang.String,long,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.setbit(java.lang.String,long,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.setnx(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.setnx(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.setrange(java.lang.String,long,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.setrange(java.lang.String,long,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.sinterstore(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sinterstore(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.sismember(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sismember(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.slowlogGet()`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.slowlogGet()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.slowlogGet(long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.slowlogGet(long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.smove(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.smove(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.sort(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sort(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.srem(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.srem(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.sscan(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SetCommands.sscan(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.strlen(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.strlen(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.sunionstore(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sunionstore(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.touch(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.touch(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.touch(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.touch(java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.ttl(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.ttl(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.unlink(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.unlink(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.unlink(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.unlink(java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.xautoclaim(java.lang.String,java.lang.String,java.lang.String,long,redis.clients.jedis.StreamEntryID,redis.clients.jedis.params.XAutoClaimParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xautoclaim(java.lang.String,java.lang.String,java.lang.String,long,redis.clients.jedis.StreamEntryID,redis.clients.jedis.params.XAutoClaimParams)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.xclaim(java.lang.String,java.lang.String,java.lang.String,long,redis.clients.jedis.params.XClaimParams,redis.clients.jedis.StreamEntryID[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xclaim(java.lang.String,java.lang.String,java.lang.String,long,redis.clients.jedis.params.XClaimParams,redis.clients.jedis.StreamEntryID[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.xgroupDelConsumer(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xgroupDelConsumer(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.xinfoConsumers(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xinfoConsumers(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.xinfoGroup(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xinfoGroup(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.xinfoStream(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xinfoStream(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.xlen(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xlen(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.xpending(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xpending(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.xpending(java.lang.String,java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xpending(java.lang.String,java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.xpending(java.lang.String,java.lang.String,redis.clients.jedis.params.XPendingParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xpending(java.lang.String,java.lang.String,redis.clients.jedis.params.XPendingParams)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.xrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.xrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.xread(redis.clients.jedis.params.XReadParams,java.util.Map<java.lang.String,redis.clients.jedis.StreamEntryID>)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xread(redis.clients.jedis.params.XReadParams,java.util.Map<java.lang.String,redis.clients.jedis.StreamEntryID>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.xreadGroup(java.lang.String,java.lang.String,redis.clients.jedis.params.XReadGroupParams,java.util.Map<java.lang.String,redis.clients.jedis.StreamEntryID>)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xreadGroup(java.lang.String,java.lang.String,redis.clients.jedis.params.XReadGroupParams,java.util.Map<java.lang.String,redis.clients.jedis.StreamEntryID>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.xrevrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xrevrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.xrevrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xrevrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zadd(java.lang.String,double,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zadd(java.lang.String,double,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zadd(java.lang.String,double,java.lang.String,redis.clients.jedis.params.ZAddParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zadd(java.lang.String,double,java.lang.String,redis.clients.jedis.params.ZAddParams)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zadd(java.lang.String,java.util.Map<java.lang.String,java.lang.Double>)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zadd(java.lang.String,java.util.Map<java.lang.String,java.lang.Double>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zadd(java.lang.String,java.util.Map<java.lang.String,java.lang.Double>,redis.clients.jedis.params.ZAddParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zadd(java.lang.String,java.util.Map<java.lang.String,java.lang.Double>,redis.clients.jedis.params.ZAddParams)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zcard(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zcard(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zcount(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zcount(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zcount(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zcount(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zdiffStore(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zdiffStore(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zdiffWithScores(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zdiffWithScores(java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zincrby(java.lang.String,double,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zincrby(java.lang.String,double,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zinterstore(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zinterstore(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zlexcount(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zlexcount(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zpopmax(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zpopmax(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zpopmax(java.lang.String,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zpopmax(java.lang.String,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zpopmin(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zpopmin(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zpopmin(java.lang.String,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zpopmin(java.lang.String,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrandmember(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrandmember(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrandmemberWithScores(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrandmemberWithScores(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrange(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrange(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrangeByLex(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByLex(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrangeByScore(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScore(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrangeByScore(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScore(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrangeByScore(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScore(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrangeByScoreWithScores(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScoreWithScores(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrangeByScoreWithScores(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScoreWithScores(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrangeWithScores(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeWithScores(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrem(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrem(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zremrangeByLex(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zremrangeByLex(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zremrangeByRank(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zremrangeByRank(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zremrangeByScore(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zremrangeByScore(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zremrangeByScore(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zremrangeByScore(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrevrange(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrange(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrevrangeByScore(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScore(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrevrangeByScore(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScore(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrevrangeByScoreWithScores(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScoreWithScores(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrevrangeByScoreWithScores(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScoreWithScores(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zrevrangeWithScores(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeWithScores(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zscan(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zscan(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Jedis.zunionstore(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zunionstore(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.aclDelUser(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.aclDelUser(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.aclGetUser(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.aclGetUser(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.append(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.append(byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.bitcount(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.bitcount(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.bitcount(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.bitcount(byte[],long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.bitpos(byte[],boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.bitpos(byte[],boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.clientKill(redis.clients.jedis.params.ClientKillParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.clientKill(redis.clients.jedis.params.ClientKillParams)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.configSet(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.configSet(byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.copy(byte[],byte[],boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.copy(byte[],byte[],boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.copy(byte[],byte[],int,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.copy(byte[],byte[],int,boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.dbSize()`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.dbSize()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.decr(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.decr(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.decrBy(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.decrBy(byte[],long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.del(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.del(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.del(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.del(byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.exists(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.exists(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.exists(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.exists(byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.expire(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.expire(byte[],long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.expireAt(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.expireAt(byte[],long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.geoadd(byte[],double,double,byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.geoadd(byte[],double,double,byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.geoadd(byte[],java.util.Map<byte[],redis.clients.jedis.GeoCoordinate>)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.geoadd(byte[],java.util.Map<byte[],redis.clients.jedis.GeoCoordinate>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.geoadd(byte[],redis.clients.jedis.params.GeoAddParams,java.util.Map<byte[],redis.clients.jedis.GeoCoordinate>)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.geoadd(byte[],redis.clients.jedis.params.GeoAddParams,java.util.Map<byte[],redis.clients.jedis.GeoCoordinate>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.getClient()`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.getClient()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.getbit(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.getbit(byte[],long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.hdel(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hdel(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.hexists(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hexists(byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.hincrBy(byte[],byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hincrBy(byte[],byte[],long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.hincrByFloat(byte[],byte[],double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hincrByFloat(byte[],byte[],double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.hlen(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hlen(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.hscan(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hscan(byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.hset(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hset(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.hset(byte[],java.util.Map<byte[],byte[]>)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hset(byte[],java.util.Map<byte[],byte[]>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.hsetnx(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hsetnx(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.hstrlen(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hstrlen(byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.incr(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.incr(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.incrBy(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.incrBy(byte[],long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.incrByFloat(byte[],double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.incrByFloat(byte[],double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.lastsave()`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.lastsave()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.llen(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.llen(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.lpush(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.lpush(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.lpushx(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.lpushx(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.lrem(byte[],long,byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.lrem(byte[],long,byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.move(byte[],int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.move(byte[],int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.msetnx(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.msetnx(byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.persist(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.persist(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.pexpire(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.pexpire(byte[],long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.pexpireAt(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.pexpireAt(byte[],long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.pfadd(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.pfadd(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.pfcount(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.pfcount(byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.pttl(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.pttl(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.publish(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.publish(byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.renamenx(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.renamenx(byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.rpush(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.rpush(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.rpushx(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.rpushx(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.sadd(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sadd(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.scan(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.scan(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.scard(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.scard(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.scriptExists(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.scriptExists(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.sdiffstore(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sdiffstore(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.setbit(byte[],long,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.setbit(byte[],long,boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.setnx(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.setnx(byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.setrange(byte[],long,byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.setrange(byte[],long,byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.shutdown()`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.shutdown()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.sinterstore(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sinterstore(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.sismember(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sismember(byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.slowlogLen()`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.slowlogLen()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.smove(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.smove(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.sort(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sort(byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.srem(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.srem(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.sscan(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sscan(byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.strlen(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.strlen(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.sunionstore(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sunionstore(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.touch(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.touch(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.touch(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.touch(byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.ttl(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.ttl(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.unlink(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.unlink(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.unlink(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.unlink(byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.waitReplicas(int,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.waitReplicas(int,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.xack(byte[],byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xack(byte[],byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.xdel(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xdel(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.xgroupDelConsumer(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xgroupDelConsumer(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.xgroupDestroy(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xgroupDestroy(byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.xinfoStream(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xinfoStream(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.xlen(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xlen(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.xtrim(byte[],long,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xtrim(byte[],long,boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.xtrim(byte[],redis.clients.jedis.params.XTrimParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xtrim(byte[],redis.clients.jedis.params.XTrimParams)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zadd(byte[],double,byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zadd(byte[],double,byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zadd(byte[],double,byte[],redis.clients.jedis.params.ZAddParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zadd(byte[],double,byte[],redis.clients.jedis.params.ZAddParams)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zadd(byte[],java.util.Map<byte[],java.lang.Double>)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zadd(byte[],java.util.Map<byte[],java.lang.Double>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zadd(byte[],java.util.Map<byte[],java.lang.Double>,redis.clients.jedis.params.ZAddParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zadd(byte[],java.util.Map<byte[],java.lang.Double>,redis.clients.jedis.params.ZAddParams)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zcard(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zcard(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zcount(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zcount(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zcount(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zcount(byte[],double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zdiffStore(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zdiffStore(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zincrby(byte[],double,byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zincrby(byte[],double,byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zinterstore(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zinterstore(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zlexcount(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zlexcount(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zpopmax(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zpopmax(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zpopmax(byte[],int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zpopmax(byte[],int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zpopmin(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zpopmin(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zpopmin(byte[],int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zpopmin(byte[],int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrandmember(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrandmember(byte[],long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrandmemberWithScores(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrandmemberWithScores(byte[],long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrange(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrange(byte[],long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrangeByLex(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByLex(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrangeByLex(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByLex(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrangeByScore(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScore(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrangeByScore(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScore(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrangeByScore(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScore(byte[],double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrangeByScore(byte[],double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScore(byte[],double,double,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrangeByScoreWithScores(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScoreWithScores(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrangeByScoreWithScores(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScoreWithScores(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrangeByScoreWithScores(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScoreWithScores(byte[],double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrangeByScoreWithScores(byte[],double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScoreWithScores(byte[],double,double,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrangeWithScores(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeWithScores(byte[],long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrem(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrem(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zremrangeByLex(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zremrangeByLex(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zremrangeByRank(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zremrangeByRank(byte[],long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zremrangeByScore(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zremrangeByScore(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zremrangeByScore(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zremrangeByScore(byte[],double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrevrange(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrange(byte[],long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrevrangeByLex(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByLex(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrevrangeByLex(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByLex(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrevrangeByScore(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScore(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrevrangeByScore(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScore(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrevrangeByScore(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScore(byte[],double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrevrangeByScore(byte[],double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScore(byte[],double,double,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrevrangeByScoreWithScores(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScoreWithScores(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrevrangeByScoreWithScores(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScoreWithScores(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrevrangeByScoreWithScores(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScoreWithScores(byte[],double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrevrangeByScoreWithScores(byte[],double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScoreWithScores(byte[],double,double,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zrevrangeWithScores(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeWithScores(byte[],long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zscan(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zscan(byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedis.zunionstore(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zunionstore(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.aclDelUser(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.aclDelUser(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.aclGetUser(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.aclGetUser(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.append(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.append(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.bitcount(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.bitcount(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.bitcount(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.bitcount(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.bitpos(java.lang.String,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.bitpos(java.lang.String,boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.clientId()`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.clientId()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.clientUnblock(long,redis.clients.jedis.args.UnblockType)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.clientUnblock(long,redis.clients.jedis.args.UnblockType)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.clusterCountKeysInSlot(int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.clusterCountKeysInSlot(int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.clusterKeySlot(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.clusterKeySlot(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.copy(java.lang.String,java.lang.String,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.copy(java.lang.String,java.lang.String,boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.copy(java.lang.String,java.lang.String,int,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.copy(java.lang.String,java.lang.String,int,boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.decr(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.decr(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.decrBy(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.decrBy(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.del(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.del(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.del(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.del(java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.exists(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.exists(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.exists(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.exists(java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.expire(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.expire(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.expireAt(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.expireAt(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.geoadd(java.lang.String,double,double,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.geoadd(java.lang.String,double,double,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.geoadd(java.lang.String,java.util.Map<java.lang.String,redis.clients.jedis.GeoCoordinate>)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.geoadd(java.lang.String,java.util.Map<java.lang.String,redis.clients.jedis.GeoCoordinate>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.geoadd(java.lang.String,redis.clients.jedis.params.GeoAddParams,java.util.Map<java.lang.String,redis.clients.jedis.GeoCoordinate>)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.geoadd(java.lang.String,redis.clients.jedis.params.GeoAddParams,java.util.Map<java.lang.String,redis.clients.jedis.GeoCoordinate>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.getbit(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.getbit(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.hdel(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hdel(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.hexists(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hexists(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.hincrBy(java.lang.String,java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hincrBy(java.lang.String,java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.hincrByFloat(java.lang.String,java.lang.String,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hincrByFloat(java.lang.String,java.lang.String,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.hlen(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hlen(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.hscan(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashCommands.hscan(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.hset(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hset(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.hset(java.lang.String,java.util.Map<java.lang.String,java.lang.String>)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hset(java.lang.String,java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.hsetnx(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hsetnx(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.hstrlen(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.hstrlen(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.incr(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.incr(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.incrBy(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.incrBy(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.incrByFloat(java.lang.String,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.incrByFloat(java.lang.String,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.llen(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.llen(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.lpush(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.lpush(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.lpushx(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.lpushx(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.lrem(java.lang.String,long,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.lrem(java.lang.String,long,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.move(java.lang.String,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.move(java.lang.String,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.msetnx(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.msetnx(java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.persist(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.persist(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.pexpire(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.pexpire(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.pexpireAt(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.pexpireAt(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.pfadd(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.pfadd(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.pttl(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.pttl(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.publish(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.publish(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.renamenx(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.renamenx(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.rpush(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.rpush(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.rpushx(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.rpushx(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.sadd(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sadd(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.scan(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.scan(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.scard(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.scard(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.sdiffstore(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sdiffstore(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.setbit(java.lang.String,long,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.setbit(java.lang.String,long,boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.setnx(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.setnx(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.setrange(java.lang.String,long,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.setrange(java.lang.String,long,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.sinterstore(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sinterstore(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.sismember(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sismember(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.smove(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.smove(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.sort(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sort(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.srem(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.srem(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.sscan(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SetCommands.sscan(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.strlen(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.strlen(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.sunionstore(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.sunionstore(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.touch(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.touch(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.touch(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.touch(java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.ttl(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.ttl(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.unlink(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.unlink(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.unlink(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.unlink(java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.xgroupDelConsumer(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xgroupDelConsumer(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.xinfoStream(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xinfoStream(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.xlen(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xlen(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.xpending(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.xpending(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zadd(java.lang.String,double,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zadd(java.lang.String,double,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zadd(java.lang.String,double,java.lang.String,redis.clients.jedis.params.ZAddParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zadd(java.lang.String,double,java.lang.String,redis.clients.jedis.params.ZAddParams)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zadd(java.lang.String,java.util.Map<java.lang.String,java.lang.Double>)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zadd(java.lang.String,java.util.Map<java.lang.String,java.lang.Double>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zadd(java.lang.String,java.util.Map<java.lang.String,java.lang.Double>,redis.clients.jedis.params.ZAddParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zadd(java.lang.String,java.util.Map<java.lang.String,java.lang.Double>,redis.clients.jedis.params.ZAddParams)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zcard(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zcard(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zcount(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zcount(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zcount(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zcount(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zdiffStore(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zdiffStore(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zincrby(java.lang.String,double,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zincrby(java.lang.String,double,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zinterstore(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zinterstore(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zlexcount(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zlexcount(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zpopmax(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zpopmax(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zpopmax(java.lang.String,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zpopmax(java.lang.String,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zpopmin(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zpopmin(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zpopmin(java.lang.String,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zpopmin(java.lang.String,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrandmember(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrandmember(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrandmemberWithScores(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrandmemberWithScores(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrange(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrange(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrangeByLex(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByLex(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrangeByScore(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScore(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrangeByScore(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScore(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrangeByScore(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScore(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrangeByScoreWithScores(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScoreWithScores(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrangeByScoreWithScores(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScoreWithScores(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrangeWithScores(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrangeWithScores(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrem(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrem(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zremrangeByLex(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zremrangeByLex(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zremrangeByRank(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zremrangeByRank(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zremrangeByScore(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zremrangeByScore(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zremrangeByScore(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zremrangeByScore(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrevrange(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrange(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrevrangeByScore(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScore(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrevrangeByScore(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScore(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrevrangeByScoreWithScores(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScoreWithScores(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrevrangeByScoreWithScores(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScoreWithScores(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zrevrangeWithScores(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zrevrangeWithScores(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zscan(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zscan(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Jedis.zunionstore(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Jedis.zunionstore(java.lang.String,java.lang.String[])`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.Jedis`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.Jedis`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.Jedis`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.Jedis`

## redis.clients.jedis.JedisCluster

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.JedisCluster.<init>(java.util.Set<redis.clients.jedis.HostAndPort>,int,int,int,int,java.lang.String,java.lang.String,java.lang.String,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>,boolean,javax.net.ssl.SSLSocketFactory,javax.net.ssl.SSLParameters,javax.net.ssl.HostnameVerifier,redis.clients.jedis.JedisClusterHostAndPortMap)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.JedisCluster.<init>(java.util.Set<redis.clients.jedis.HostAndPort>,int,int,int,int,java.lang.String,java.lang.String,java.lang.String,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>,boolean,javax.net.ssl.SSLSocketFactory,javax.net.ssl.SSLParameters,javax.net.ssl.HostnameVerifier,redis.clients.jedis.JedisClusterHostAndPortMap,java.time.Duration)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.JedisCluster.<init>(java.util.Set<redis.clients.jedis.HostAndPort>,int,int,int,int,java.lang.String,java.lang.String,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>,boolean,javax.net.ssl.SSLSocketFactory,javax.net.ssl.SSLParameters,javax.net.ssl.HostnameVerifier,redis.clients.jedis.JedisClusterHostAndPortMap)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.JedisCluster.<init>(java.util.Set<redis.clients.jedis.HostAndPort>,int,int,int,java.lang.String,java.lang.String,java.lang.String,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>,boolean,javax.net.ssl.SSLSocketFactory,javax.net.ssl.SSLParameters,javax.net.ssl.HostnameVerifier,redis.clients.jedis.JedisClusterHostAndPortMap)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.JedisCluster.<init>(java.util.Set<redis.clients.jedis.HostAndPort>,int,int,int,java.lang.String,java.lang.String,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>,boolean,javax.net.ssl.SSLSocketFactory,javax.net.ssl.SSLParameters,javax.net.ssl.HostnameVerifier,redis.clients.jedis.JedisClusterHostAndPortMap)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.JedisCluster.<init>(redis.clients.jedis.HostAndPort,int,int,int,java.lang.String,java.lang.String,java.lang.String,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>,boolean,javax.net.ssl.SSLSocketFactory,javax.net.ssl.SSLParameters,javax.net.ssl.HostnameVerifier,redis.clients.jedis.JedisClusterHostAndPortMap)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.JedisCluster.<init>(redis.clients.jedis.HostAndPort,int,int,int,java.lang.String,java.lang.String,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>,boolean,javax.net.ssl.SSLSocketFactory,javax.net.ssl.SSLParameters,javax.net.ssl.HostnameVerifier,redis.clients.jedis.JedisClusterHostAndPortMap)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.BinaryJedisCluster.HASHSLOTS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.BinaryJedisCluster.connectionHandler`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.BinaryJedisCluster.maxAttempts`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.BinaryJedisCluster.maxTotalRetriesDuration`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `redis.clients.jedis.JedisCluster.<init>(java.util.Set<redis.clients.jedis.HostAndPort>,int,int,int,int,java.lang.String,java.lang.String,java.lang.String,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `redis.clients.jedis.JedisCluster.<init>(java.util.Set<redis.clients.jedis.HostAndPort>,int,int,int,java.lang.String,java.lang.String,java.lang.String,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `redis.clients.jedis.JedisCluster.<init>(java.util.Set<redis.clients.jedis.HostAndPort>,int,int,int,java.lang.String,java.lang.String,java.lang.String,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>,boolean)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `redis.clients.jedis.JedisCluster.<init>(java.util.Set<redis.clients.jedis.HostAndPort>,int,int,int,java.lang.String,java.lang.String,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `redis.clients.jedis.JedisCluster.<init>(java.util.Set<redis.clients.jedis.HostAndPort>,int,int,int,java.lang.String,java.lang.String,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>,boolean)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `redis.clients.jedis.JedisCluster.<init>(java.util.Set<redis.clients.jedis.HostAndPort>,int,int,int,java.lang.String,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `redis.clients.jedis.JedisCluster.<init>(java.util.Set<redis.clients.jedis.HostAndPort>,int,int,int,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `redis.clients.jedis.JedisCluster.<init>(java.util.Set<redis.clients.jedis.HostAndPort>,int,int,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `redis.clients.jedis.JedisCluster.<init>(java.util.Set<redis.clients.jedis.HostAndPort>,int,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `redis.clients.jedis.JedisCluster.<init>(java.util.Set<redis.clients.jedis.HostAndPort>,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `redis.clients.jedis.JedisCluster.<init>(java.util.Set<redis.clients.jedis.HostAndPort>,redis.clients.jedis.JedisClientConfig,int,java.time.Duration,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `redis.clients.jedis.JedisCluster.<init>(java.util.Set<redis.clients.jedis.HostAndPort>,redis.clients.jedis.JedisClientConfig,int,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `redis.clients.jedis.JedisCluster.<init>(redis.clients.jedis.HostAndPort,int,int,int,java.lang.String,java.lang.String,java.lang.String,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `redis.clients.jedis.JedisCluster.<init>(redis.clients.jedis.HostAndPort,int,int,int,java.lang.String,java.lang.String,java.lang.String,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>,boolean)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `redis.clients.jedis.JedisCluster.<init>(redis.clients.jedis.HostAndPort,int,int,int,java.lang.String,java.lang.String,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `redis.clients.jedis.JedisCluster.<init>(redis.clients.jedis.HostAndPort,int,int,int,java.lang.String,java.lang.String,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>,boolean)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `redis.clients.jedis.JedisCluster.<init>(redis.clients.jedis.HostAndPort,int,int,int,java.lang.String,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `redis.clients.jedis.JedisCluster.<init>(redis.clients.jedis.HostAndPort,int,int,int,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `redis.clients.jedis.JedisCluster.<init>(redis.clients.jedis.HostAndPort,int,int,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `redis.clients.jedis.JedisCluster.<init>(redis.clients.jedis.HostAndPort,int,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `redis.clients.jedis.JedisCluster.<init>(redis.clients.jedis.HostAndPort,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `redis.clients.jedis.JedisCluster.<init>(redis.clients.jedis.HostAndPort,redis.clients.jedis.JedisClientConfig,int,org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.bitop(redis.clients.jedis.BitOP,byte[],byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.echo(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.eval(byte[],byte[],byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.expire(byte[],int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.geodist(byte[],byte[],byte[],redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.georadius(byte[],double,double,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.georadius(byte[],double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.georadiusByMember(byte[],byte[],double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.georadiusByMember(byte[],byte[],double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.georadiusByMemberReadonly(byte[],byte[],double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.georadiusByMemberReadonly(byte[],byte[],double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.georadiusByMemberStore(byte[],byte[],double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam,redis.clients.jedis.params.GeoRadiusStoreParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.georadiusReadonly(byte[],double,double,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.georadiusReadonly(byte[],double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.georadiusStore(byte[],double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam,redis.clients.jedis.params.GeoRadiusStoreParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.hscan(byte[],byte[],redis.clients.jedis.ScanParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.linsert(byte[],redis.clients.jedis.ListPosition,byte[],byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.scan(byte[],redis.clients.jedis.ScanParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.scan(byte[],redis.clients.jedis.ScanParams,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.setbit(byte[],long,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.sort(byte[],redis.clients.jedis.SortingParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.sort(byte[],redis.clients.jedis.SortingParams,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.sscan(byte[],byte[],redis.clients.jedis.ScanParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.xadd(byte[],byte[],java.util.Map<byte[],byte[]>,long,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.xclaim(byte[],byte[],byte[],long,long,int,boolean,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.xrange(byte[],byte[],byte[],long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.xread(int,long,java.util.Map<byte[],byte[]>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.xreadGroup(byte[],byte[],int,long,boolean,java.util.Map<byte[],byte[]>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.zinter(redis.clients.jedis.ZParams,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.zinterWithScores(redis.clients.jedis.ZParams,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.zinterstore(byte[],redis.clients.jedis.ZParams,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.zscan(byte[],byte[],redis.clients.jedis.ScanParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.zunion(redis.clients.jedis.ZParams,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.zunionWithScores(redis.clients.jedis.ZParams,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.BinaryJedisCluster.zunionstore(byte[],redis.clients.jedis.ZParams,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.bitop(redis.clients.jedis.BitOP,java.lang.String,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.echo(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.geodist(java.lang.String,java.lang.String,java.lang.String,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.georadius(java.lang.String,double,double,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.georadius(java.lang.String,double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.georadiusByMember(java.lang.String,java.lang.String,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.georadiusByMember(java.lang.String,java.lang.String,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.georadiusByMemberReadonly(java.lang.String,java.lang.String,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.georadiusByMemberReadonly(java.lang.String,java.lang.String,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.georadiusByMemberStore(java.lang.String,java.lang.String,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam,redis.clients.jedis.params.GeoRadiusStoreParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.georadiusReadonly(java.lang.String,double,double,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.georadiusReadonly(java.lang.String,double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.georadiusStore(java.lang.String,double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam,redis.clients.jedis.params.GeoRadiusStoreParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.linsert(java.lang.String,redis.clients.jedis.ListPosition,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.scan(java.lang.String,redis.clients.jedis.ScanParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.scan(java.lang.String,redis.clients.jedis.ScanParams,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.setbit(java.lang.String,long,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.sort(java.lang.String,redis.clients.jedis.SortingParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.sort(java.lang.String,redis.clients.jedis.SortingParams,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.xadd(java.lang.String,redis.clients.jedis.StreamEntryID,java.util.Map<java.lang.String,java.lang.String>,long,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.xclaim(java.lang.String,java.lang.String,java.lang.String,long,long,int,boolean,redis.clients.jedis.StreamEntryID[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.xread(int,long,java.util.Map$Entry<java.lang.String,redis.clients.jedis.StreamEntryID>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.xreadGroup(java.lang.String,java.lang.String,int,long,boolean,java.util.Map$Entry<java.lang.String,redis.clients.jedis.StreamEntryID>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.zinter(redis.clients.jedis.ZParams,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.zinterWithScores(redis.clients.jedis.ZParams,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.zinterstore(java.lang.String,redis.clients.jedis.ZParams,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.zunion(redis.clients.jedis.ZParams,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.zunionWithScores(redis.clients.jedis.ZParams,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisCluster.zunionstore(java.lang.String,redis.clients.jedis.ZParams,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.BinaryJedisClusterCommands.restore(byte[],int,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.BinaryJedisClusterCommands.setex(byte[],int,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisClusterCommands.expire(java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisClusterCommands.restore(java.lang.String,int,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisClusterCommands.setex(java.lang.String,int,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.append(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.append(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.bitcount(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.bitcount(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.bitcount(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.bitcount(byte[],long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.copy(byte[],byte[],boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.copy(byte[],byte[],boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.decr(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.decr(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.decrBy(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.decrBy(byte[],long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.del(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.del(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.del(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.del(byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.exists(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.exists(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.exists(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.exists(byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.expireAt(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.expireAt(byte[],long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.geoadd(byte[],double,double,byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.geoadd(byte[],double,double,byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.geoadd(byte[],java.util.Map<byte[],redis.clients.jedis.GeoCoordinate>)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.geoadd(byte[],java.util.Map<byte[],redis.clients.jedis.GeoCoordinate>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.geoadd(byte[],redis.clients.jedis.params.GeoAddParams,java.util.Map<byte[],redis.clients.jedis.GeoCoordinate>)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.geoadd(byte[],redis.clients.jedis.params.GeoAddParams,java.util.Map<byte[],redis.clients.jedis.GeoCoordinate>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.getClusterNodes()`
+ NEW RETURN TYPE: `redis.clients.jedis.JedisCluster.getClusterNodes()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.getConnectionFromSlot(int)`
+ NEW RETURN TYPE: `redis.clients.jedis.JedisCluster.getConnectionFromSlot(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.getbit(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.getbit(byte[],long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.hdel(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hdel(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.hexists(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hexists(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.hincrBy(byte[],byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hincrBy(byte[],byte[],long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.hincrByFloat(byte[],byte[],double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hincrByFloat(byte[],byte[],double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.hlen(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hlen(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.hscan(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashBinaryCommands.hscan(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.hset(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hset(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.hset(byte[],java.util.Map<byte[],byte[]>)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hset(byte[],java.util.Map<byte[],byte[]>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.hsetnx(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hsetnx(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.hstrlen(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hstrlen(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.incr(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.incr(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.incrBy(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.incrBy(byte[],long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.incrByFloat(byte[],double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.incrByFloat(byte[],double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.llen(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.llen(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.lpush(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.lpush(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.lpushx(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.lpushx(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.lrem(byte[],long,byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.lrem(byte[],long,byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.msetnx(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.msetnx(byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.persist(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.persist(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.pexpire(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.pexpire(byte[],long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.pexpireAt(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.pexpireAt(byte[],long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.pfadd(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.pfadd(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.pfcount(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.pfcount(byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.pttl(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.pttl(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.publish(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.publish(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.renamenx(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.renamenx(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.rpush(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.rpush(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.rpushx(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.rpushx(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.sadd(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.sadd(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.scard(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.scard(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.scriptExists(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.scriptExists(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.sdiffstore(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.sdiffstore(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.setbit(byte[],long,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.setbit(byte[],long,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.setnx(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.setnx(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.setrange(byte[],long,byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.setrange(byte[],long,byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.sinterstore(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.sinterstore(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.sismember(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.sismember(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.smove(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.smove(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.sort(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.sort(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.srem(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.srem(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.sscan(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SetBinaryCommands.sscan(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.strlen(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.strlen(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.sunionstore(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.sunionstore(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.touch(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.touch(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.touch(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.touch(byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.ttl(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.ttl(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.unlink(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.unlink(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.unlink(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.unlink(byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.waitReplicas(byte[],int,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.waitReplicas(byte[],int,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.xack(byte[],byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xack(byte[],byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.xdel(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xdel(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.xgroupDelConsumer(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xgroupDelConsumer(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.xgroupDestroy(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xgroupDestroy(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.xlen(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xlen(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.xtrim(byte[],long,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xtrim(byte[],long,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.xtrim(byte[],redis.clients.jedis.params.XTrimParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xtrim(byte[],redis.clients.jedis.params.XTrimParams)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zadd(byte[],double,byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zadd(byte[],double,byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zadd(byte[],double,byte[],redis.clients.jedis.params.ZAddParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zadd(byte[],double,byte[],redis.clients.jedis.params.ZAddParams)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zadd(byte[],java.util.Map<byte[],java.lang.Double>)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zadd(byte[],java.util.Map<byte[],java.lang.Double>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zadd(byte[],java.util.Map<byte[],java.lang.Double>,redis.clients.jedis.params.ZAddParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zadd(byte[],java.util.Map<byte[],java.lang.Double>,redis.clients.jedis.params.ZAddParams)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zcard(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zcard(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zcount(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zcount(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zcount(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zcount(byte[],double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zdiffStore(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zdiffStore(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zdiffWithScores(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zdiffWithScores(byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zincrby(byte[],double,byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zincrby(byte[],double,byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zinterstore(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zinterstore(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zlexcount(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zlexcount(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zpopmax(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zpopmax(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zpopmax(byte[],int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zpopmax(byte[],int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zpopmin(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zpopmin(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zpopmin(byte[],int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zpopmin(byte[],int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrandmember(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrandmember(byte[],long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrandmemberWithScores(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrandmemberWithScores(byte[],long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrange(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrange(byte[],long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrangeByLex(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByLex(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrangeByLex(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByLex(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrangeByScore(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScore(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrangeByScore(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScore(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrangeByScore(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScore(byte[],double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrangeByScore(byte[],double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScore(byte[],double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrangeByScoreWithScores(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScoreWithScores(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrangeByScoreWithScores(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScoreWithScores(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrangeByScoreWithScores(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScoreWithScores(byte[],double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrangeByScoreWithScores(byte[],double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScoreWithScores(byte[],double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrangeWithScores(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeWithScores(byte[],long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrem(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrem(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zremrangeByLex(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zremrangeByLex(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zremrangeByRank(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zremrangeByRank(byte[],long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zremrangeByScore(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zremrangeByScore(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zremrangeByScore(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zremrangeByScore(byte[],double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrevrange(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrange(byte[],long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrevrangeByLex(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByLex(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrevrangeByLex(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByLex(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrevrangeByScore(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScore(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrevrangeByScore(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScore(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrevrangeByScore(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScore(byte[],double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrevrangeByScore(byte[],double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScore(byte[],double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrevrangeByScoreWithScores(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScoreWithScores(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrevrangeByScoreWithScores(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScoreWithScores(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrevrangeByScoreWithScores(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScoreWithScores(byte[],double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrevrangeByScoreWithScores(byte[],double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScoreWithScores(byte[],double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zrevrangeWithScores(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeWithScores(byte[],long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zscan(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetBinaryCommands.zscan(byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.BinaryJedisCluster.zunionstore(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zunionstore(byte[],byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.append(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.append(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.bitcount(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.bitcount(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.bitcount(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.bitcount(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.copy(java.lang.String,java.lang.String,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.copy(java.lang.String,java.lang.String,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.decr(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.decr(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.decrBy(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.decrBy(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.del(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.del(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.del(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.del(java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.exists(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.exists(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.exists(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.exists(java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.expire(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.expire(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.expireAt(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.expireAt(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.geoadd(java.lang.String,double,double,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.geoadd(java.lang.String,double,double,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.geoadd(java.lang.String,java.util.Map<java.lang.String,redis.clients.jedis.GeoCoordinate>)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.geoadd(java.lang.String,java.util.Map<java.lang.String,redis.clients.jedis.GeoCoordinate>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.geoadd(java.lang.String,redis.clients.jedis.params.GeoAddParams,java.util.Map<java.lang.String,redis.clients.jedis.GeoCoordinate>)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.geoadd(java.lang.String,redis.clients.jedis.params.GeoAddParams,java.util.Map<java.lang.String,redis.clients.jedis.GeoCoordinate>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.getbit(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.getbit(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.hdel(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hdel(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.hexists(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hexists(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.hincrBy(java.lang.String,java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hincrBy(java.lang.String,java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.hincrByFloat(java.lang.String,java.lang.String,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hincrByFloat(java.lang.String,java.lang.String,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.hlen(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hlen(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.hscan(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashCommands.hscan(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.hset(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hset(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.hset(java.lang.String,java.util.Map<java.lang.String,java.lang.String>)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hset(java.lang.String,java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.hsetnx(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hsetnx(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.hstrlen(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hstrlen(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.incr(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.incr(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.incrBy(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.incrBy(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.incrByFloat(java.lang.String,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.incrByFloat(java.lang.String,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.llen(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.llen(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.lpush(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.lpush(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.lpushx(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.lpushx(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.lrem(java.lang.String,long,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.lrem(java.lang.String,long,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.msetnx(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.msetnx(java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.persist(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.persist(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.pexpire(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.pexpire(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.pexpireAt(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.pexpireAt(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.pfadd(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.pfadd(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.pttl(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.pttl(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.publish(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.publish(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.renamenx(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.renamenx(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.rpush(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.rpush(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.rpushx(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.rpushx(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.sadd(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.sadd(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.scard(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.scard(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.sdiffstore(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.sdiffstore(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.setbit(java.lang.String,long,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.setbit(java.lang.String,long,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.setnx(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.setnx(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.setrange(java.lang.String,long,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.setrange(java.lang.String,long,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.sinterstore(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.sinterstore(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.sismember(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.sismember(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.smove(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.smove(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.sort(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.sort(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.srem(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.srem(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.sscan(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SetCommands.sscan(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.strlen(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.strlen(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.sunionstore(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.sunionstore(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.touch(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.touch(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.touch(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.touch(java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.ttl(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.ttl(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.unlink(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.unlink(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.unlink(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.unlink(java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.waitReplicas(java.lang.String,int,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.waitReplicas(java.lang.String,int,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.xack(java.lang.String,java.lang.String,redis.clients.jedis.StreamEntryID[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xack(java.lang.String,java.lang.String,redis.clients.jedis.StreamEntryID[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.xautoclaim(java.lang.String,java.lang.String,java.lang.String,long,redis.clients.jedis.StreamEntryID,redis.clients.jedis.params.XAutoClaimParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xautoclaim(java.lang.String,java.lang.String,java.lang.String,long,redis.clients.jedis.StreamEntryID,redis.clients.jedis.params.XAutoClaimParams)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.xclaim(java.lang.String,java.lang.String,java.lang.String,long,redis.clients.jedis.params.XClaimParams,redis.clients.jedis.StreamEntryID[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xclaim(java.lang.String,java.lang.String,java.lang.String,long,redis.clients.jedis.params.XClaimParams,redis.clients.jedis.StreamEntryID[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.xdel(java.lang.String,redis.clients.jedis.StreamEntryID[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xdel(java.lang.String,redis.clients.jedis.StreamEntryID[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.xgroupDelConsumer(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xgroupDelConsumer(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.xgroupDestroy(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xgroupDestroy(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.xlen(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xlen(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.xpending(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xpending(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.xpending(java.lang.String,java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xpending(java.lang.String,java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.xpending(java.lang.String,java.lang.String,redis.clients.jedis.params.XPendingParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xpending(java.lang.String,java.lang.String,redis.clients.jedis.params.XPendingParams)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.xrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.xrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.xread(redis.clients.jedis.params.XReadParams,java.util.Map<java.lang.String,redis.clients.jedis.StreamEntryID>)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xread(redis.clients.jedis.params.XReadParams,java.util.Map<java.lang.String,redis.clients.jedis.StreamEntryID>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.xreadGroup(java.lang.String,java.lang.String,redis.clients.jedis.params.XReadGroupParams,java.util.Map<java.lang.String,redis.clients.jedis.StreamEntryID>)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xreadGroup(java.lang.String,java.lang.String,redis.clients.jedis.params.XReadGroupParams,java.util.Map<java.lang.String,redis.clients.jedis.StreamEntryID>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.xrevrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xrevrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.xrevrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xrevrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.xtrim(java.lang.String,long,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xtrim(java.lang.String,long,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.xtrim(java.lang.String,redis.clients.jedis.params.XTrimParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xtrim(java.lang.String,redis.clients.jedis.params.XTrimParams)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zadd(java.lang.String,double,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zadd(java.lang.String,double,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zadd(java.lang.String,double,java.lang.String,redis.clients.jedis.params.ZAddParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zadd(java.lang.String,double,java.lang.String,redis.clients.jedis.params.ZAddParams)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zadd(java.lang.String,java.util.Map<java.lang.String,java.lang.Double>)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zadd(java.lang.String,java.util.Map<java.lang.String,java.lang.Double>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zadd(java.lang.String,java.util.Map<java.lang.String,java.lang.Double>,redis.clients.jedis.params.ZAddParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zadd(java.lang.String,java.util.Map<java.lang.String,java.lang.Double>,redis.clients.jedis.params.ZAddParams)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zcard(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zcard(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zcount(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zcount(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zcount(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zcount(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zdiffStore(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zdiffStore(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zdiffWithScores(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zdiffWithScores(java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zincrby(java.lang.String,double,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zincrby(java.lang.String,double,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zinterstore(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zinterstore(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zlexcount(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zlexcount(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zpopmax(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zpopmax(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zpopmax(java.lang.String,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zpopmax(java.lang.String,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zpopmin(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zpopmin(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zpopmin(java.lang.String,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zpopmin(java.lang.String,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrandmember(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrandmember(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrandmemberWithScores(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrandmemberWithScores(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrange(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrange(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrangeByLex(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByLex(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrangeByScore(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScore(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrangeByScore(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScore(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrangeByScore(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScore(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrangeByScoreWithScores(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScoreWithScores(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrangeByScoreWithScores(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScoreWithScores(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrangeWithScores(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeWithScores(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrem(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrem(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zremrangeByLex(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zremrangeByLex(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zremrangeByRank(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zremrangeByRank(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zremrangeByScore(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zremrangeByScore(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zremrangeByScore(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zremrangeByScore(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrevrange(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrange(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrevrangeByScore(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScore(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrevrangeByScore(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScore(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrevrangeByScoreWithScores(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScoreWithScores(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrevrangeByScoreWithScores(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScoreWithScores(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zrevrangeWithScores(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeWithScores(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zscan(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zscan(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisCluster.zunionstore(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zunionstore(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.append(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.append(byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.bitcount(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.bitcount(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.bitcount(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.bitcount(byte[],long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.copy(byte[],byte[],boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.copy(byte[],byte[],boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.decr(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.decr(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.decrBy(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.decrBy(byte[],long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.del(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.del(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.del(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.del(byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.exists(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.exists(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.exists(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.exists(byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.expireAt(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.expireAt(byte[],long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.geoadd(byte[],double,double,byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.geoadd(byte[],double,double,byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.geoadd(byte[],java.util.Map<byte[],redis.clients.jedis.GeoCoordinate>)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.geoadd(byte[],java.util.Map<byte[],redis.clients.jedis.GeoCoordinate>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.geoadd(byte[],redis.clients.jedis.params.GeoAddParams,java.util.Map<byte[],redis.clients.jedis.GeoCoordinate>)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.geoadd(byte[],redis.clients.jedis.params.GeoAddParams,java.util.Map<byte[],redis.clients.jedis.GeoCoordinate>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.getConnectionFromSlot(int)`
+ NEW RETURN TYPE: `redis.clients.jedis.JedisCluster.getConnectionFromSlot(int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.getbit(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.getbit(byte[],long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.hdel(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hdel(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.hexists(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hexists(byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.hincrBy(byte[],byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hincrBy(byte[],byte[],long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.hincrByFloat(byte[],byte[],double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hincrByFloat(byte[],byte[],double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.hlen(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hlen(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.hscan(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashBinaryCommands.hscan(byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.hset(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hset(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.hset(byte[],java.util.Map<byte[],byte[]>)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hset(byte[],java.util.Map<byte[],byte[]>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.hsetnx(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hsetnx(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.hstrlen(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hstrlen(byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.incr(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.incr(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.incrBy(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.incrBy(byte[],long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.incrByFloat(byte[],double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.incrByFloat(byte[],double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.llen(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.llen(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.lpush(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.lpush(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.lpushx(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.lpushx(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.lrem(byte[],long,byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.lrem(byte[],long,byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.msetnx(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.msetnx(byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.persist(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.persist(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.pexpire(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.pexpire(byte[],long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.pexpireAt(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.pexpireAt(byte[],long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.pfadd(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.pfadd(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.pfcount(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.pfcount(byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.pttl(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.pttl(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.publish(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.publish(byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.renamenx(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.renamenx(byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.rpush(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.rpush(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.rpushx(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.rpushx(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.sadd(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.sadd(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.scard(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.scard(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.sdiffstore(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.sdiffstore(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.setbit(byte[],long,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.setbit(byte[],long,boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.setnx(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.setnx(byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.setrange(byte[],long,byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.setrange(byte[],long,byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.sinterstore(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.sinterstore(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.sismember(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.sismember(byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.smove(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.smove(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.sort(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.sort(byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.srem(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.srem(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.sscan(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SetBinaryCommands.sscan(byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.strlen(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.strlen(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.sunionstore(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.sunionstore(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.touch(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.touch(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.touch(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.touch(byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.ttl(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.ttl(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.unlink(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.unlink(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.unlink(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.unlink(byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.waitReplicas(byte[],int,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.waitReplicas(byte[],int,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.xack(byte[],byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xack(byte[],byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.xdel(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xdel(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.xgroupDelConsumer(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xgroupDelConsumer(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.xgroupDestroy(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xgroupDestroy(byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.xlen(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xlen(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.xtrim(byte[],long,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xtrim(byte[],long,boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.xtrim(byte[],redis.clients.jedis.params.XTrimParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xtrim(byte[],redis.clients.jedis.params.XTrimParams)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zadd(byte[],double,byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zadd(byte[],double,byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zadd(byte[],double,byte[],redis.clients.jedis.params.ZAddParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zadd(byte[],double,byte[],redis.clients.jedis.params.ZAddParams)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zadd(byte[],java.util.Map<byte[],java.lang.Double>)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zadd(byte[],java.util.Map<byte[],java.lang.Double>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zadd(byte[],java.util.Map<byte[],java.lang.Double>,redis.clients.jedis.params.ZAddParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zadd(byte[],java.util.Map<byte[],java.lang.Double>,redis.clients.jedis.params.ZAddParams)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zcard(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zcard(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zcount(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zcount(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zcount(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zcount(byte[],double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zdiffStore(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zdiffStore(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zincrby(byte[],double,byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zincrby(byte[],double,byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zinterstore(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zinterstore(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zlexcount(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zlexcount(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zpopmax(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zpopmax(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zpopmax(byte[],int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zpopmax(byte[],int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zpopmin(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zpopmin(byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zpopmin(byte[],int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zpopmin(byte[],int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrandmember(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrandmember(byte[],long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrandmemberWithScores(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrandmemberWithScores(byte[],long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrange(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrange(byte[],long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrangeByLex(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByLex(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrangeByLex(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByLex(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrangeByScore(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScore(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrangeByScore(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScore(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrangeByScore(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScore(byte[],double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrangeByScore(byte[],double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScore(byte[],double,double,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrangeByScoreWithScores(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScoreWithScores(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrangeByScoreWithScores(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScoreWithScores(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrangeByScoreWithScores(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScoreWithScores(byte[],double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrangeByScoreWithScores(byte[],double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScoreWithScores(byte[],double,double,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrangeWithScores(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeWithScores(byte[],long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrem(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrem(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zremrangeByLex(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zremrangeByLex(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zremrangeByRank(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zremrangeByRank(byte[],long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zremrangeByScore(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zremrangeByScore(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zremrangeByScore(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zremrangeByScore(byte[],double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrevrange(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrange(byte[],long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrevrangeByLex(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByLex(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrevrangeByLex(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByLex(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrevrangeByScore(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScore(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrevrangeByScore(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScore(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrevrangeByScore(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScore(byte[],double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrevrangeByScore(byte[],double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScore(byte[],double,double,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrevrangeByScoreWithScores(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScoreWithScores(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrevrangeByScoreWithScores(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScoreWithScores(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrevrangeByScoreWithScores(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScoreWithScores(byte[],double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrevrangeByScoreWithScores(byte[],double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScoreWithScores(byte[],double,double,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zrevrangeWithScores(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeWithScores(byte[],long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zscan(byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetBinaryCommands.zscan(byte[],byte[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.BinaryJedisCluster.zunionstore(byte[],byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zunionstore(byte[],byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.append(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.append(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.bitcount(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.bitcount(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.bitcount(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.bitcount(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.copy(java.lang.String,java.lang.String,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.copy(java.lang.String,java.lang.String,boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.decr(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.decr(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.decrBy(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.decrBy(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.del(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.del(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.del(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.del(java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.exists(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.exists(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.exists(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.exists(java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.expire(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.expire(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.expireAt(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.expireAt(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.geoadd(java.lang.String,double,double,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.geoadd(java.lang.String,double,double,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.geoadd(java.lang.String,java.util.Map<java.lang.String,redis.clients.jedis.GeoCoordinate>)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.geoadd(java.lang.String,java.util.Map<java.lang.String,redis.clients.jedis.GeoCoordinate>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.geoadd(java.lang.String,redis.clients.jedis.params.GeoAddParams,java.util.Map<java.lang.String,redis.clients.jedis.GeoCoordinate>)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.geoadd(java.lang.String,redis.clients.jedis.params.GeoAddParams,java.util.Map<java.lang.String,redis.clients.jedis.GeoCoordinate>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.getbit(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.getbit(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.hdel(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hdel(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.hexists(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hexists(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.hincrBy(java.lang.String,java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hincrBy(java.lang.String,java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.hincrByFloat(java.lang.String,java.lang.String,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hincrByFloat(java.lang.String,java.lang.String,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.hlen(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hlen(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.hscan(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashCommands.hscan(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.hset(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hset(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.hset(java.lang.String,java.util.Map<java.lang.String,java.lang.String>)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hset(java.lang.String,java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.hsetnx(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hsetnx(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.hstrlen(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.hstrlen(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.incr(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.incr(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.incrBy(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.incrBy(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.incrByFloat(java.lang.String,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.incrByFloat(java.lang.String,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.llen(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.llen(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.lpush(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.lpush(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.lpushx(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.lpushx(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.lrem(java.lang.String,long,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.lrem(java.lang.String,long,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.msetnx(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.msetnx(java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.persist(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.persist(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.pexpire(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.pexpire(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.pexpireAt(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.pexpireAt(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.pfadd(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.pfadd(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.pttl(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.pttl(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.publish(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.publish(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.renamenx(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.renamenx(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.rpush(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.rpush(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.rpushx(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.rpushx(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.sadd(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.sadd(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.scard(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.scard(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.sdiffstore(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.sdiffstore(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.setbit(java.lang.String,long,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.setbit(java.lang.String,long,boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.setnx(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.setnx(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.setrange(java.lang.String,long,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.setrange(java.lang.String,long,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.sinterstore(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.sinterstore(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.sismember(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.sismember(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.smove(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.smove(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.sort(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.sort(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.srem(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.srem(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.sscan(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SetCommands.sscan(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.strlen(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.strlen(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.sunionstore(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.sunionstore(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.touch(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.touch(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.touch(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.touch(java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.ttl(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.ttl(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.unlink(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.unlink(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.unlink(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.unlink(java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.waitReplicas(java.lang.String,int,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.waitReplicas(java.lang.String,int,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.xack(java.lang.String,java.lang.String,redis.clients.jedis.StreamEntryID[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xack(java.lang.String,java.lang.String,redis.clients.jedis.StreamEntryID[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.xdel(java.lang.String,redis.clients.jedis.StreamEntryID[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xdel(java.lang.String,redis.clients.jedis.StreamEntryID[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.xgroupDelConsumer(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xgroupDelConsumer(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.xgroupDestroy(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xgroupDestroy(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.xlen(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xlen(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.xpending(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xpending(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.xtrim(java.lang.String,long,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xtrim(java.lang.String,long,boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.xtrim(java.lang.String,redis.clients.jedis.params.XTrimParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.xtrim(java.lang.String,redis.clients.jedis.params.XTrimParams)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zadd(java.lang.String,double,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zadd(java.lang.String,double,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zadd(java.lang.String,double,java.lang.String,redis.clients.jedis.params.ZAddParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zadd(java.lang.String,double,java.lang.String,redis.clients.jedis.params.ZAddParams)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zadd(java.lang.String,java.util.Map<java.lang.String,java.lang.Double>)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zadd(java.lang.String,java.util.Map<java.lang.String,java.lang.Double>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zadd(java.lang.String,java.util.Map<java.lang.String,java.lang.Double>,redis.clients.jedis.params.ZAddParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zadd(java.lang.String,java.util.Map<java.lang.String,java.lang.Double>,redis.clients.jedis.params.ZAddParams)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zcard(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zcard(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zcount(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zcount(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zcount(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zcount(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zdiffStore(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zdiffStore(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zincrby(java.lang.String,double,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zincrby(java.lang.String,double,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zinterstore(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zinterstore(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zlexcount(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zlexcount(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zpopmax(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zpopmax(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zpopmax(java.lang.String,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zpopmax(java.lang.String,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zpopmin(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zpopmin(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zpopmin(java.lang.String,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zpopmin(java.lang.String,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrandmember(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrandmember(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrandmemberWithScores(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrandmemberWithScores(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrange(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrange(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrangeByLex(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByLex(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrangeByScore(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScore(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrangeByScore(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScore(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrangeByScore(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScore(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrangeByScoreWithScores(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScoreWithScores(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrangeByScoreWithScores(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScoreWithScores(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrangeWithScores(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrangeWithScores(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrem(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrem(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zremrangeByLex(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zremrangeByLex(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zremrangeByRank(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zremrangeByRank(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zremrangeByScore(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zremrangeByScore(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zremrangeByScore(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zremrangeByScore(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrevrange(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrange(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrevrangeByScore(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScore(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrevrangeByScore(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScore(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrevrangeByScoreWithScores(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScoreWithScores(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrevrangeByScoreWithScores(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScoreWithScores(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zrevrangeWithScores(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zrevrangeWithScores(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zscan(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zscan(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisCluster.zunionstore(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.UnifiedJedis.zunionstore(java.lang.String,java.lang.String[])`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.JedisCluster`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.JedisCluster`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.JedisCluster`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.JedisCluster`

## redis.clients.jedis.JedisClusterCommand

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.JedisClusterCommand`

## redis.clients.jedis.JedisClusterConnectionHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.JedisClusterConnectionHandler`

## redis.clients.jedis.JedisClusterHostAndPortMap

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.JedisClusterHostAndPortMap`

## redis.clients.jedis.JedisClusterInfoCache

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.JedisClusterInfoCache.<init>(org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>,int)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.JedisClusterInfoCache.<init>(org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>,int,int,int,java.lang.String,java.lang.String)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.JedisClusterInfoCache.<init>(org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>,int,int,int,java.lang.String,java.lang.String,java.lang.String)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.JedisClusterInfoCache.<init>(org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>,int,int,int,java.lang.String,java.lang.String,java.lang.String,boolean,javax.net.ssl.SSLSocketFactory,javax.net.ssl.SSLParameters,javax.net.ssl.HostnameVerifier,redis.clients.jedis.HostAndPortMapper)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.JedisClusterInfoCache.<init>(org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>,int,int,int,java.lang.String,java.lang.String,java.lang.String,boolean,javax.net.ssl.SSLSocketFactory,javax.net.ssl.SSLParameters,javax.net.ssl.HostnameVerifier,redis.clients.jedis.JedisClusterHostAndPortMap)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.JedisClusterInfoCache.<init>(org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>,int,int,java.lang.String,java.lang.String)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.JedisClusterInfoCache.<init>(org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>,int,int,java.lang.String,java.lang.String,boolean,javax.net.ssl.SSLSocketFactory,javax.net.ssl.SSLParameters,javax.net.ssl.HostnameVerifier,redis.clients.jedis.HostAndPortMapper)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.JedisClusterInfoCache.<init>(org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>,int,int,java.lang.String,java.lang.String,boolean,javax.net.ssl.SSLSocketFactory,javax.net.ssl.SSLParameters,javax.net.ssl.HostnameVerifier,redis.clients.jedis.JedisClusterHostAndPortMap)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.JedisClusterInfoCache.<init>(org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>,int,int,java.lang.String,java.lang.String,java.lang.String)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.JedisClusterInfoCache.<init>(org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>,int,int,java.lang.String,java.lang.String,java.lang.String,boolean,javax.net.ssl.SSLSocketFactory,javax.net.ssl.SSLParameters,javax.net.ssl.HostnameVerifier,redis.clients.jedis.HostAndPortMapper)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.JedisClusterInfoCache.<init>(org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>,int,int,java.lang.String,java.lang.String,java.lang.String,boolean,javax.net.ssl.SSLSocketFactory,javax.net.ssl.SSLParameters,javax.net.ssl.HostnameVerifier,redis.clients.jedis.JedisClusterHostAndPortMap)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.JedisClusterInfoCache.<init>(org.apache.commons.pool2.impl.GenericObjectPoolConfig<redis.clients.jedis.Jedis>,redis.clients.jedis.JedisClientConfig)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisClusterInfoCache.discoverClusterNodesAndSlots(redis.clients.jedis.Jedis)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisClusterInfoCache.getNodeKey(redis.clients.jedis.Client)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisClusterInfoCache.getNodeKey(redis.clients.jedis.Jedis)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisClusterInfoCache.renewClusterSlots(redis.clients.jedis.Jedis)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisClusterInfoCache.getNode(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.JedisClusterInfoCache.getNode(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisClusterInfoCache.getNodes()`
+ NEW RETURN TYPE: `redis.clients.jedis.JedisClusterInfoCache.getNodes()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisClusterInfoCache.getShuffledNodesPool()`
+ NEW RETURN TYPE: `redis.clients.jedis.JedisClusterInfoCache.getShuffledNodesPool()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisClusterInfoCache.getSlotPool(int)`
+ NEW RETURN TYPE: `redis.clients.jedis.JedisClusterInfoCache.getSlotPool(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.JedisClusterInfoCache.setupNodeIfNotExist(redis.clients.jedis.HostAndPort)`
+ NEW RETURN TYPE: `redis.clients.jedis.JedisClusterInfoCache.setupNodeIfNotExist(redis.clients.jedis.HostAndPort)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisClusterInfoCache.getNode(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.JedisClusterInfoCache.getNode(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisClusterInfoCache.getSlotPool(int)`
+ NEW RETURN TYPE: `redis.clients.jedis.JedisClusterInfoCache.getSlotPool(int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.JedisClusterInfoCache.setupNodeIfNotExist(redis.clients.jedis.HostAndPort)`
+ NEW RETURN TYPE: `redis.clients.jedis.JedisClusterInfoCache.setupNodeIfNotExist(redis.clients.jedis.HostAndPort)`

## redis.clients.jedis.JedisFactory

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.JedisFactory.<init>(int,int,int,java.lang.String,java.lang.String,int,java.lang.String)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.JedisFactory.<init>(int,int,int,java.lang.String,java.lang.String,int,java.lang.String,boolean,javax.net.ssl.SSLSocketFactory,javax.net.ssl.SSLParameters,javax.net.ssl.HostnameVerifier)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.JedisFactory.<init>(redis.clients.jedis.JedisClientConfig)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisFactory.setHostAndPort(redis.clients.jedis.HostAndPort)`

## redis.clients.jedis.JedisMonitor

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `redis.clients.jedis.JedisMonitor.client`
+ NEW FIELD: `redis.clients.jedis.JedisMonitor.client`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `redis.clients.jedis.JedisMonitor.client`
+ NEW FIELD: `redis.clients.jedis.JedisMonitor.client`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisMonitor.proceed(redis.clients.jedis.Client)`

## redis.clients.jedis.JedisPool

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.util.Pool.internalPool`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `redis.clients.jedis.JedisPool.<init>(org.apache.commons.pool2.impl.GenericObjectPoolConfig,org.apache.commons.pool2.PooledObjectFactory<redis.clients.jedis.Jedis>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.clearInternalPool()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.closeInternalPool()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.getMaxBorrowWaitTimeMillis()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.getMeanBorrowWaitTimeMillis()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.getNumActive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.getNumIdle()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.getNumWaiters()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.initPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig<T>,org.apache.commons.pool2.PooledObjectFactory<T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.isClosed()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.returnBrokenResourceObject(T)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.returnResourceObject(T)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.JedisPool`

## redis.clients.jedis.JedisPoolAbstract

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.JedisPoolAbstract`

## redis.clients.jedis.JedisPubSub

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisPubSub.proceed(redis.clients.jedis.Client,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisPubSub.proceedWithPatterns(redis.clients.jedis.Client,java.lang.String[])`

## redis.clients.jedis.JedisSentinelPool

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.JedisSentinelPool.clientName`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.JedisSentinelPool.connectionTimeout`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.JedisSentinelPool.database`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.JedisSentinelPool.infiniteSoTimeout`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.JedisSentinelPool.log`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.JedisSentinelPool.password`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.JedisSentinelPool.poolConfig`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.JedisSentinelPool.sentinelClientName`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.JedisSentinelPool.sentinelConnectionTimeout`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.JedisSentinelPool.sentinelPassword`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.JedisSentinelPool.sentinelSoTimeout`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.JedisSentinelPool.sentinelUser`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.JedisSentinelPool.soTimeout`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.JedisSentinelPool.user`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.util.Pool.internalPool`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `redis.clients.jedis.JedisSentinelPool.masterListeners`
+ NEW FIELD: `redis.clients.jedis.JedisSentinelPool.masterListeners`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `redis.clients.jedis.JedisSentinelPool.masterListeners`
+ NEW FIELD: `redis.clients.jedis.JedisSentinelPool.masterListeners`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.clearInternalPool()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.closeInternalPool()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.getMaxBorrowWaitTimeMillis()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.getMeanBorrowWaitTimeMillis()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.getNumActive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.getNumIdle()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.getNumWaiters()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.initPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig<T>,org.apache.commons.pool2.PooledObjectFactory<T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.isClosed()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.returnBrokenResourceObject(T)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.returnResourceObject(T)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.JedisSentinelPool`

## redis.clients.jedis.JedisShardInfo

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.JedisShardInfo`

## redis.clients.jedis.JedisSlotBasedConnectionHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.JedisSlotBasedConnectionHandler`

## redis.clients.jedis.JedisSocketFactory

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `redis.clients.jedis.JedisSocketFactory.createSocket()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisSocketFactory.getConnectionTimeout()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisSocketFactory.getDescription()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisSocketFactory.getHost()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisSocketFactory.getPort()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisSocketFactory.getSoTimeout()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisSocketFactory.setConnectionTimeout(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisSocketFactory.setHost(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisSocketFactory.setPort(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisSocketFactory.setSoTimeout(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.JedisSocketFactory.updateHostAndPort(redis.clients.jedis.HostAndPort)`

## redis.clients.jedis.ListPosition

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.ListPosition`

## redis.clients.jedis.MultiKeyPipelineBase

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.MultiKeyPipelineBase`

## redis.clients.jedis.Pipeline

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.Pipeline.<init>()`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.MultiKeyPipelineBase.client`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `redis.clients.jedis.Queable.clean()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `redis.clients.jedis.Queable.generateResponse(java.lang.Object)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `redis.clients.jedis.Queable.getPipelinedResponseLength()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `redis.clients.jedis.Queable.hasPipelinedResponse()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.bgrewriteaof()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.bgsave()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.bitop(redis.clients.jedis.BitOP,byte[],byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.bitop(redis.clients.jedis.BitOP,java.lang.String,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.blpop(byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.blpop(java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.blpopMap(int,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.brpop(byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.brpop(java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.brpopMap(int,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.clusterAddSlots(int[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.clusterDelSlots(int[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.clusterGetKeysInSlot(int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.clusterInfo()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.clusterMeet(java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.clusterNodes()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.clusterSetSlotImporting(int,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.clusterSetSlotMigrating(int,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.clusterSetSlotNode(int,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.configGet(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.configResetStat()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.configSet(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.eval(byte[],byte[],byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.flushAll()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.flushAll(redis.clients.jedis.args.FlushMode)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.flushDB()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.flushDB(redis.clients.jedis.args.FlushMode)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.georadiusByMemberStore(byte[],byte[],double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam,redis.clients.jedis.params.GeoRadiusStoreParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.georadiusByMemberStore(java.lang.String,java.lang.String,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam,redis.clients.jedis.params.GeoRadiusStoreParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.georadiusStore(byte[],double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam,redis.clients.jedis.params.GeoRadiusStoreParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.georadiusStore(java.lang.String,double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam,redis.clients.jedis.params.GeoRadiusStoreParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.info()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.info(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.lastsave()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.moduleList()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.moduleLoad(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.moduleUnload(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.ping()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.randomKeyBinary()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.save()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.shutdown()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.sort(byte[],redis.clients.jedis.SortingParams,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.sort(java.lang.String,redis.clients.jedis.SortingParams,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.unwatch()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.watch(byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.watch(java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.xread(int,long,java.util.Map$Entry<java.lang.String,redis.clients.jedis.StreamEntryID>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.xread(int,long,java.util.Map<byte[],byte[]>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.xreadGroup(byte[],byte[],int,long,boolean,java.util.Map<byte[],byte[]>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.xreadGroup(java.lang.String,java.lang.String,int,long,boolean,java.util.Map$Entry<java.lang.String,redis.clients.jedis.StreamEntryID>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.zinter(redis.clients.jedis.ZParams,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.zinter(redis.clients.jedis.ZParams,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.zinterWithScores(redis.clients.jedis.ZParams,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.zinterWithScores(redis.clients.jedis.ZParams,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.zinterstore(byte[],redis.clients.jedis.ZParams,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.zinterstore(java.lang.String,redis.clients.jedis.ZParams,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.zunion(redis.clients.jedis.ZParams,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.zunion(redis.clients.jedis.ZParams,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.zunionWithScores(redis.clients.jedis.ZParams,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.zunionWithScores(redis.clients.jedis.ZParams,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.zunionstore(byte[],redis.clients.jedis.ZParams,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.zunionstore(java.lang.String,redis.clients.jedis.ZParams,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Pipeline.clear()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Pipeline.discard()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Pipeline.exec()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Pipeline.getClient(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Pipeline.getClient(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Pipeline.getResponse(redis.clients.jedis.Builder<T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Pipeline.isInMulti()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Pipeline.multi()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Pipeline.setClient(redis.clients.jedis.Client)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.bitpos(byte[],boolean,redis.clients.jedis.BitPosParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.bitpos(java.lang.String,boolean,redis.clients.jedis.BitPosParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.blpop(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.blpop(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.brpop(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.brpop(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.echo(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.echo(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.geodist(byte[],byte[],byte[],redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.geodist(java.lang.String,java.lang.String,java.lang.String,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadius(byte[],double,double,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadius(byte[],double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadius(java.lang.String,double,double,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadius(java.lang.String,double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadiusByMember(byte[],byte[],double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadiusByMember(byte[],byte[],double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadiusByMember(java.lang.String,java.lang.String,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadiusByMember(java.lang.String,java.lang.String,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadiusByMemberReadonly(byte[],byte[],double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadiusByMemberReadonly(byte[],byte[],double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadiusByMemberReadonly(java.lang.String,java.lang.String,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadiusByMemberReadonly(java.lang.String,java.lang.String,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadiusReadonly(byte[],double,double,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadiusReadonly(byte[],double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadiusReadonly(java.lang.String,double,double,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadiusReadonly(java.lang.String,double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.linsert(byte[],redis.clients.jedis.ListPosition,byte[],byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.linsert(java.lang.String,redis.clients.jedis.ListPosition,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.restoreReplace(byte[],long,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.restoreReplace(java.lang.String,long,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.sendCommand(byte[],redis.clients.jedis.commands.ProtocolCommand,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.sendCommand(java.lang.String,redis.clients.jedis.commands.ProtocolCommand,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.setbit(byte[],long,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.sort(byte[],redis.clients.jedis.SortingParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.sort(java.lang.String,redis.clients.jedis.SortingParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.xadd(byte[],byte[],java.util.Map<byte[],byte[]>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.xadd(byte[],byte[],java.util.Map<byte[],byte[]>,long,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.xadd(java.lang.String,redis.clients.jedis.StreamEntryID,java.util.Map<java.lang.String,java.lang.String>,long,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.xclaim(byte[],byte[],byte[],long,long,int,boolean,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.xclaim(java.lang.String,java.lang.String,java.lang.String,long,long,int,boolean,redis.clients.jedis.StreamEntryID[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.xpendingBinary(byte[],byte[],byte[],byte[],int,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.BinaryRedisPipeline.expire(byte[],int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.BinaryRedisPipeline.restore(byte[],int,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.BinaryRedisPipeline.restoreReplace(byte[],int,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.BinaryRedisPipeline.setex(byte[],int,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.RedisPipeline.expire(java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.RedisPipeline.restore(java.lang.String,int,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.RedisPipeline.restoreReplace(java.lang.String,int,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.RedisPipeline.setex(java.lang.String,int,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.MultiKeyPipelineBase.blpop(int,byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.blpop(int,byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.MultiKeyPipelineBase.brpop(int,byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.brpop(int,byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.MultiKeyPipelineBase.xread(redis.clients.jedis.params.XReadParams,java.util.Map<java.lang.String,redis.clients.jedis.StreamEntryID>)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.xread(redis.clients.jedis.params.XReadParams,java.util.Map<java.lang.String,redis.clients.jedis.StreamEntryID>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.MultiKeyPipelineBase.xreadGroup(java.lang.String,java.lang.String,redis.clients.jedis.params.XReadGroupParams,java.util.Map<java.lang.String,redis.clients.jedis.StreamEntryID>)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.xreadGroup(java.lang.String,java.lang.String,redis.clients.jedis.params.XReadGroupParams,java.util.Map<java.lang.String,redis.clients.jedis.StreamEntryID>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.MultiKeyPipelineBase.zdiffWithScores(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zdiffWithScores(byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.MultiKeyPipelineBase.zdiffWithScores(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zdiffWithScores(java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.substr(byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.substr(byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.xautoclaim(java.lang.String,java.lang.String,java.lang.String,long,redis.clients.jedis.StreamEntryID,redis.clients.jedis.params.XAutoClaimParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.xautoclaim(java.lang.String,java.lang.String,java.lang.String,long,redis.clients.jedis.StreamEntryID,redis.clients.jedis.params.XAutoClaimParams)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.xclaim(java.lang.String,java.lang.String,java.lang.String,long,redis.clients.jedis.params.XClaimParams,redis.clients.jedis.StreamEntryID[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.xclaim(java.lang.String,java.lang.String,java.lang.String,long,redis.clients.jedis.params.XClaimParams,redis.clients.jedis.StreamEntryID[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.xpending(byte[],byte[],byte[],byte[],int,byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.xpending(byte[],byte[],byte[],byte[],int,byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.xpending(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.xpending(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.xpending(java.lang.String,java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.xpending(java.lang.String,java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.xpending(java.lang.String,java.lang.String,redis.clients.jedis.params.XPendingParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.xpending(java.lang.String,java.lang.String,redis.clients.jedis.params.XPendingParams)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.xrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.xrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.xrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.xrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.xrevrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.xrevrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.xrevrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.xrevrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zpopmax(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zpopmax(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zpopmax(byte[],int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zpopmax(byte[],int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zpopmax(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zpopmax(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zpopmax(java.lang.String,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zpopmax(java.lang.String,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zpopmin(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zpopmin(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zpopmin(byte[],int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zpopmin(byte[],int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zpopmin(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zpopmin(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zpopmin(java.lang.String,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zpopmin(java.lang.String,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrandmember(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrandmember(byte[],long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrandmember(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrandmember(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrandmemberWithScores(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrandmemberWithScores(byte[],long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrandmemberWithScores(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrandmemberWithScores(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrange(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrange(byte[],long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrange(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrange(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByLex(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrangeByLex(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByLex(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrangeByLex(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByLex(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrangeByLex(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScore(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrangeByScore(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScore(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrangeByScore(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScore(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrangeByScore(byte[],double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScore(byte[],double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrangeByScore(byte[],double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScore(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrangeByScore(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScore(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrangeByScore(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScore(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrangeByScore(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScoreWithScores(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrangeByScoreWithScores(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScoreWithScores(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrangeByScoreWithScores(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScoreWithScores(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrangeByScoreWithScores(byte[],double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScoreWithScores(byte[],double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrangeByScoreWithScores(byte[],double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScoreWithScores(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrangeByScoreWithScores(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScoreWithScores(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrangeByScoreWithScores(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeWithScores(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrangeWithScores(byte[],long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeWithScores(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrangeWithScores(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrange(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrevrange(byte[],long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrange(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrevrange(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByLex(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrevrangeByLex(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByLex(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrevrangeByLex(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScore(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrevrangeByScore(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScore(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrevrangeByScore(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScore(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrevrangeByScore(byte[],double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScore(byte[],double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrevrangeByScore(byte[],double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScore(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrevrangeByScore(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScore(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrevrangeByScore(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScoreWithScores(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrevrangeByScoreWithScores(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScoreWithScores(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrevrangeByScoreWithScores(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScoreWithScores(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrevrangeByScoreWithScores(byte[],double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScoreWithScores(byte[],double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrevrangeByScoreWithScores(byte[],double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScoreWithScores(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrevrangeByScoreWithScores(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScoreWithScores(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrevrangeByScoreWithScores(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeWithScores(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrevrangeWithScores(byte[],long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeWithScores(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.Pipeline.zrevrangeWithScores(java.lang.String,long,long)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.Pipeline`

## redis.clients.jedis.PipelineBase

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.PipelineBase`

## redis.clients.jedis.Protocol

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.CLUSTER_ADDSLOTS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.CLUSTER_COUNTKEYINSLOT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.CLUSTER_DELSLOTS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.CLUSTER_FAILOVER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.CLUSTER_FLUSHSLOT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.CLUSTER_FORGET`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.CLUSTER_GETKEYSINSLOT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.CLUSTER_INFO`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.CLUSTER_KEYSLOT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.CLUSTER_MEET`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.CLUSTER_NODES`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.CLUSTER_REPLICATE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.CLUSTER_RESET`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.CLUSTER_SAVECONFIG`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.CLUSTER_SETSLOT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.CLUSTER_SETSLOT_IMPORTING`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.CLUSTER_SETSLOT_MIGRATING`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.CLUSTER_SETSLOT_NODE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.CLUSTER_SETSLOT_STABLE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.CLUSTER_SLAVES`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.CLUSTER_SLOTS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.PUBSUB_CHANNELS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.PUBSUB_NUMSUB`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.PUBSUB_NUM_PAT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.SENTINEL_FAILOVER`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.SENTINEL_GET_MASTER_ADDR_BY_NAME`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.SENTINEL_MASTERS`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.SENTINEL_MONITOR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.SENTINEL_REMOVE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.SENTINEL_RESET`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.SENTINEL_SET`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol.SENTINEL_SLAVES`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `redis.clients.jedis.Protocol.CHARSET`
+ NEW FIELD: `redis.clients.jedis.Protocol.CHARSET`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Protocol.sendCommand(redis.clients.jedis.util.RedisOutputStream,redis.clients.jedis.commands.ProtocolCommand,byte[][])`

## redis.clients.jedis.Protocol$ClusterKeyword

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol$ClusterKeyword.FORCE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol$ClusterKeyword.TAKEOVER`

## redis.clients.jedis.Protocol$Command

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol$Command.DEBUG`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol$Command.RENAMEX`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol$Command.SYNC`

## redis.clients.jedis.Protocol$Keyword

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol$Keyword.KEY`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol$Keyword.MESSAGE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol$Keyword.OK`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol$Keyword.PING`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol$Keyword.PMESSAGE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol$Keyword.PONG`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol$Keyword.PSUBSCRIBE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol$Keyword.PUNSUBSCRIBE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol$Keyword.QUEUED`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol$Keyword.SUBSCRIBE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol$Keyword.UNSUBSCRIBE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Protocol$Keyword.raw`

## redis.clients.jedis.Queable

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `redis.clients.jedis.Queable.clean()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `redis.clients.jedis.Queable.generateResponse(java.lang.Object)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `redis.clients.jedis.Queable.getPipelinedResponseLength()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Queable.getResponse(redis.clients.jedis.Builder<T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Queable.hasPipelinedResponse()`

## redis.clients.jedis.ScanParams

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.ScanParams`

## redis.clients.jedis.ScanResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.ScanResult`

## redis.clients.jedis.ShardedJedis

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.ShardedJedis`

## redis.clients.jedis.ShardedJedisPipeline

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.ShardedJedisPipeline`

## redis.clients.jedis.ShardedJedisPool

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.ShardedJedisPool`

## redis.clients.jedis.ShardedJedisPool$ShardedJedisFactory

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.ShardedJedisPool$ShardedJedisFactory`

## redis.clients.jedis.ShardedJedisPoolConfig

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.ShardedJedisPoolConfig`

## redis.clients.jedis.SortingParams

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.SortingParams`

## redis.clients.jedis.StreamConsumersInfo

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.StreamConsumersInfo`

## redis.clients.jedis.StreamEntry

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.StreamEntry`

## redis.clients.jedis.StreamGroupInfo

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.StreamGroupInfo`

## redis.clients.jedis.StreamInfo

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.StreamInfo`

## redis.clients.jedis.StreamPendingEntry

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.StreamPendingEntry`

## redis.clients.jedis.StreamPendingSummary

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.StreamPendingSummary`

## redis.clients.jedis.Transaction

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.Transaction.<init>()`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.Transaction.<init>(redis.clients.jedis.Client)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.MultiKeyPipelineBase.client`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.Transaction.inTransaction`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `redis.clients.jedis.Queable.clean()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `redis.clients.jedis.Queable.generateResponse(java.lang.Object)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `redis.clients.jedis.Queable.getPipelinedResponseLength()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `redis.clients.jedis.Transaction.clear()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `redis.clients.jedis.Transaction.close()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `redis.clients.jedis.Transaction.discard()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `redis.clients.jedis.Transaction.exec()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.bgrewriteaof()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.bgsave()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.bitop(redis.clients.jedis.BitOP,byte[],byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.bitop(redis.clients.jedis.BitOP,java.lang.String,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.blpop(byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.blpop(java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.blpopMap(int,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.brpop(byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.brpop(java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.brpopMap(int,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.clusterAddSlots(int[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.clusterDelSlots(int[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.clusterGetKeysInSlot(int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.clusterInfo()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.clusterMeet(java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.clusterNodes()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.clusterSetSlotImporting(int,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.clusterSetSlotMigrating(int,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.clusterSetSlotNode(int,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.configGet(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.configResetStat()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.configSet(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.copy(byte[],byte[],int,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.copy(java.lang.String,java.lang.String,int,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.dbSize()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.eval(byte[],byte[],byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.flushAll()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.flushAll(redis.clients.jedis.args.FlushMode)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.flushDB()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.flushDB(redis.clients.jedis.args.FlushMode)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.georadiusByMemberStore(byte[],byte[],double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam,redis.clients.jedis.params.GeoRadiusStoreParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.georadiusByMemberStore(java.lang.String,java.lang.String,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam,redis.clients.jedis.params.GeoRadiusStoreParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.georadiusStore(byte[],double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam,redis.clients.jedis.params.GeoRadiusStoreParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.georadiusStore(java.lang.String,double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam,redis.clients.jedis.params.GeoRadiusStoreParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.info()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.info(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.lastsave()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.migrate(java.lang.String,int,int,int,redis.clients.jedis.params.MigrateParams,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.migrate(java.lang.String,int,int,int,redis.clients.jedis.params.MigrateParams,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.moduleList()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.moduleLoad(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.moduleUnload(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.ping()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.randomKeyBinary()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.save()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.select(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.shutdown()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.sort(byte[],redis.clients.jedis.SortingParams,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.sort(java.lang.String,redis.clients.jedis.SortingParams,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.swapDB(int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.time()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.xread(int,long,java.util.Map$Entry<java.lang.String,redis.clients.jedis.StreamEntryID>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.xread(int,long,java.util.Map<byte[],byte[]>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.xreadGroup(byte[],byte[],int,long,boolean,java.util.Map<byte[],byte[]>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.xreadGroup(java.lang.String,java.lang.String,int,long,boolean,java.util.Map$Entry<java.lang.String,redis.clients.jedis.StreamEntryID>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.zinter(redis.clients.jedis.ZParams,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.zinter(redis.clients.jedis.ZParams,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.zinterWithScores(redis.clients.jedis.ZParams,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.zinterWithScores(redis.clients.jedis.ZParams,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.zinterstore(byte[],redis.clients.jedis.ZParams,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.zinterstore(java.lang.String,redis.clients.jedis.ZParams,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.zunion(redis.clients.jedis.ZParams,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.zunion(redis.clients.jedis.ZParams,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.zunionWithScores(redis.clients.jedis.ZParams,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.zunionWithScores(redis.clients.jedis.ZParams,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.zunionstore(byte[],redis.clients.jedis.ZParams,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.MultiKeyPipelineBase.zunionstore(java.lang.String,redis.clients.jedis.ZParams,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.bitpos(byte[],boolean,redis.clients.jedis.BitPosParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.bitpos(java.lang.String,boolean,redis.clients.jedis.BitPosParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.blpop(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.blpop(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.brpop(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.brpop(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.echo(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.echo(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.geodist(byte[],byte[],byte[],redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.geodist(java.lang.String,java.lang.String,java.lang.String,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadius(byte[],double,double,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadius(byte[],double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadius(java.lang.String,double,double,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadius(java.lang.String,double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadiusByMember(byte[],byte[],double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadiusByMember(byte[],byte[],double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadiusByMember(java.lang.String,java.lang.String,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadiusByMember(java.lang.String,java.lang.String,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadiusByMemberReadonly(byte[],byte[],double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadiusByMemberReadonly(byte[],byte[],double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadiusByMemberReadonly(java.lang.String,java.lang.String,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadiusByMemberReadonly(java.lang.String,java.lang.String,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadiusReadonly(byte[],double,double,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadiusReadonly(byte[],double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadiusReadonly(java.lang.String,double,double,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.georadiusReadonly(java.lang.String,double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.linsert(byte[],redis.clients.jedis.ListPosition,byte[],byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.linsert(java.lang.String,redis.clients.jedis.ListPosition,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.migrate(java.lang.String,int,byte[],int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.migrate(java.lang.String,int,java.lang.String,int,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.move(byte[],int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.move(java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.restoreReplace(byte[],long,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.restoreReplace(java.lang.String,long,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.sendCommand(byte[],redis.clients.jedis.commands.ProtocolCommand,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.sendCommand(java.lang.String,redis.clients.jedis.commands.ProtocolCommand,java.lang.String[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.setbit(byte[],long,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.sort(byte[],redis.clients.jedis.SortingParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.sort(java.lang.String,redis.clients.jedis.SortingParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.xadd(byte[],byte[],java.util.Map<byte[],byte[]>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.xadd(byte[],byte[],java.util.Map<byte[],byte[]>,long,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.xadd(java.lang.String,redis.clients.jedis.StreamEntryID,java.util.Map<java.lang.String,java.lang.String>,long,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.xclaim(byte[],byte[],byte[],long,long,int,boolean,byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.xclaim(java.lang.String,java.lang.String,java.lang.String,long,long,int,boolean,redis.clients.jedis.StreamEntryID[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.PipelineBase.xpendingBinary(byte[],byte[],byte[],byte[],int,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Queable.getResponse(redis.clients.jedis.Builder<T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Queable.hasPipelinedResponse()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Transaction.execGetResponse()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Transaction.getClient(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Transaction.getClient(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Transaction.setClient(redis.clients.jedis.Client)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.BinaryRedisPipeline.expire(byte[],int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.BinaryRedisPipeline.restore(byte[],int,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.BinaryRedisPipeline.restoreReplace(byte[],int,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.BinaryRedisPipeline.setex(byte[],int,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.RedisPipeline.expire(java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.RedisPipeline.restore(java.lang.String,int,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.RedisPipeline.restoreReplace(java.lang.String,int,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.RedisPipeline.setex(java.lang.String,int,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.MultiKeyPipelineBase.blpop(int,byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.blpop(int,byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.MultiKeyPipelineBase.brpop(int,byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.brpop(int,byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.MultiKeyPipelineBase.unwatch()`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.unwatch()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.MultiKeyPipelineBase.xread(redis.clients.jedis.params.XReadParams,java.util.Map<java.lang.String,redis.clients.jedis.StreamEntryID>)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.xread(redis.clients.jedis.params.XReadParams,java.util.Map<java.lang.String,redis.clients.jedis.StreamEntryID>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.MultiKeyPipelineBase.xreadGroup(java.lang.String,java.lang.String,redis.clients.jedis.params.XReadGroupParams,java.util.Map<java.lang.String,redis.clients.jedis.StreamEntryID>)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.xreadGroup(java.lang.String,java.lang.String,redis.clients.jedis.params.XReadGroupParams,java.util.Map<java.lang.String,redis.clients.jedis.StreamEntryID>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.MultiKeyPipelineBase.zdiffWithScores(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zdiffWithScores(byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.MultiKeyPipelineBase.zdiffWithScores(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zdiffWithScores(java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.substr(byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.substr(byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.xautoclaim(java.lang.String,java.lang.String,java.lang.String,long,redis.clients.jedis.StreamEntryID,redis.clients.jedis.params.XAutoClaimParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.xautoclaim(java.lang.String,java.lang.String,java.lang.String,long,redis.clients.jedis.StreamEntryID,redis.clients.jedis.params.XAutoClaimParams)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.xclaim(java.lang.String,java.lang.String,java.lang.String,long,redis.clients.jedis.params.XClaimParams,redis.clients.jedis.StreamEntryID[])`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.xclaim(java.lang.String,java.lang.String,java.lang.String,long,redis.clients.jedis.params.XClaimParams,redis.clients.jedis.StreamEntryID[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.xpending(byte[],byte[],byte[],byte[],int,byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.xpending(byte[],byte[],byte[],byte[],int,byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.xpending(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.xpending(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.xpending(java.lang.String,java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.xpending(java.lang.String,java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.xpending(java.lang.String,java.lang.String,redis.clients.jedis.params.XPendingParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.xpending(java.lang.String,java.lang.String,redis.clients.jedis.params.XPendingParams)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.xrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.xrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.xrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.xrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.xrevrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.xrevrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.xrevrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.xrevrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zpopmax(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zpopmax(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zpopmax(byte[],int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zpopmax(byte[],int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zpopmax(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zpopmax(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zpopmax(java.lang.String,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zpopmax(java.lang.String,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zpopmin(byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zpopmin(byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zpopmin(byte[],int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zpopmin(byte[],int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zpopmin(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zpopmin(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zpopmin(java.lang.String,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zpopmin(java.lang.String,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrandmember(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrandmember(byte[],long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrandmember(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrandmember(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrandmemberWithScores(byte[],long)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrandmemberWithScores(byte[],long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrandmemberWithScores(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrandmemberWithScores(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrange(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrange(byte[],long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrange(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrange(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByLex(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrangeByLex(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByLex(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrangeByLex(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByLex(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrangeByLex(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScore(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrangeByScore(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScore(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrangeByScore(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScore(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrangeByScore(byte[],double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScore(byte[],double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrangeByScore(byte[],double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScore(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrangeByScore(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScore(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrangeByScore(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScore(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrangeByScore(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScoreWithScores(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrangeByScoreWithScores(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScoreWithScores(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrangeByScoreWithScores(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScoreWithScores(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrangeByScoreWithScores(byte[],double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScoreWithScores(byte[],double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrangeByScoreWithScores(byte[],double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScoreWithScores(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrangeByScoreWithScores(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScoreWithScores(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrangeByScoreWithScores(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeWithScores(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrangeWithScores(byte[],long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrangeWithScores(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrangeWithScores(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrange(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrevrange(byte[],long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrange(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrevrange(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByLex(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrevrangeByLex(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByLex(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrevrangeByLex(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScore(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrevrangeByScore(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScore(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrevrangeByScore(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScore(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrevrangeByScore(byte[],double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScore(byte[],double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrevrangeByScore(byte[],double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScore(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrevrangeByScore(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScore(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrevrangeByScore(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScoreWithScores(byte[],byte[],byte[])`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrevrangeByScoreWithScores(byte[],byte[],byte[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScoreWithScores(byte[],byte[],byte[],int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrevrangeByScoreWithScores(byte[],byte[],byte[],int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScoreWithScores(byte[],double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrevrangeByScoreWithScores(byte[],double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScoreWithScores(byte[],double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrevrangeByScoreWithScores(byte[],double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScoreWithScores(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrevrangeByScoreWithScores(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScoreWithScores(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrevrangeByScoreWithScores(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeWithScores(byte[],long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrevrangeWithScores(byte[],long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.PipelineBase.zrevrangeWithScores(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.zrevrangeWithScores(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Transaction.watch(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.watch(byte[][])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.Transaction.watch(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.watch(java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.MultiKeyPipelineBase.unwatch()`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.unwatch()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Transaction.watch(byte[][])`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.watch(byte[][])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.Transaction.watch(java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.TransactionBase.watch(java.lang.String[])`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.Transaction`

## redis.clients.jedis.Tuple

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.Tuple`

## redis.clients.jedis.ZParams

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.ZParams`

## redis.clients.jedis.ZParams$Aggregate

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.ZParams$Aggregate`

## redis.clients.jedis.commands.AdvancedBinaryJedisCommands

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.commands.AdvancedBinaryJedisCommands`

## redis.clients.jedis.commands.AdvancedJedisCommands

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.commands.AdvancedJedisCommands`

## redis.clients.jedis.commands.BasicCommands

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.commands.BasicCommands`

## redis.clients.jedis.commands.BasicRedisPipeline

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.commands.BasicRedisPipeline`

## redis.clients.jedis.commands.BinaryJedisClusterCommands

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.commands.BinaryJedisClusterCommands`

## redis.clients.jedis.commands.BinaryJedisCommands

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.commands.BinaryJedisCommands`

## redis.clients.jedis.commands.BinaryRedisPipeline

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.commands.BinaryRedisPipeline`

## redis.clients.jedis.commands.BinaryScriptingCommands

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.commands.BinaryScriptingCommands`

## redis.clients.jedis.commands.BinaryScriptingCommandsPipeline

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.commands.BinaryScriptingCommandsPipeline`

## redis.clients.jedis.commands.ClusterCommands

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `redis.clients.jedis.commands.ClusterCommands.clusterFailover()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.ClusterCommands.clusterReset(redis.clients.jedis.ClusterReset)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.ClusterCommands.clusterCountKeysInSlot(int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.ClusterCommands.clusterCountKeysInSlot(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.ClusterCommands.clusterKeySlot(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.ClusterCommands.clusterKeySlot(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.ClusterCommands.clusterCountKeysInSlot(int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.ClusterCommands.clusterCountKeysInSlot(int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.ClusterCommands.clusterKeySlot(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.ClusterCommands.clusterKeySlot(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.ClusterCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ClusterCommands.clusterDelSlotsRange(int[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.ClusterCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ClusterCommands.clusterSetConfigEpoch(long)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.ClusterCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ClusterCommands.asking()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.ClusterCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ClusterCommands.clusterReset()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.ClusterCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ClusterCommands.clusterLinks()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.ClusterCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ClusterCommands.clusterBumpEpoch()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.ClusterCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ClusterCommands.clusterCountFailureReports(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.ClusterCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ClusterCommands.clusterAddSlotsRange(int[])`

## redis.clients.jedis.commands.ClusterPipeline

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.commands.ClusterPipeline`

## redis.clients.jedis.commands.Commands

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.commands.Commands`

## redis.clients.jedis.commands.JedisClusterBinaryScriptingCommands

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.commands.JedisClusterBinaryScriptingCommands`

## redis.clients.jedis.commands.JedisClusterCommands

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.commands.JedisClusterCommands`

## redis.clients.jedis.commands.JedisClusterScriptingCommands

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.commands.JedisClusterScriptingCommands`

## redis.clients.jedis.commands.JedisCommands

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.bitpos(java.lang.String,boolean,redis.clients.jedis.BitPosParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.echo(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.expire(java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.geodist(java.lang.String,java.lang.String,java.lang.String,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.georadius(java.lang.String,double,double,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.georadius(java.lang.String,double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.georadiusByMember(java.lang.String,java.lang.String,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.georadiusByMember(java.lang.String,java.lang.String,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.georadiusByMemberReadonly(java.lang.String,java.lang.String,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.georadiusByMemberReadonly(java.lang.String,java.lang.String,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.georadiusReadonly(java.lang.String,double,double,double,redis.clients.jedis.GeoUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.georadiusReadonly(java.lang.String,double,double,double,redis.clients.jedis.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.hscan(java.lang.String,java.lang.String,redis.clients.jedis.ScanParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.linsert(java.lang.String,redis.clients.jedis.ListPosition,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.move(java.lang.String,int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.restore(java.lang.String,int,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.restoreReplace(java.lang.String,int,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.restoreReplace(java.lang.String,long,byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.setbit(java.lang.String,long,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.setex(java.lang.String,int,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.sort(java.lang.String,redis.clients.jedis.SortingParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.sscan(java.lang.String,java.lang.String,redis.clients.jedis.ScanParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.strAlgoLCSStrings(java.lang.String,java.lang.String,redis.clients.jedis.params.StrAlgoLCSParams)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.xadd(java.lang.String,redis.clients.jedis.StreamEntryID,java.util.Map<java.lang.String,java.lang.String>,long,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.xclaim(java.lang.String,java.lang.String,java.lang.String,long,long,int,boolean,redis.clients.jedis.StreamEntryID[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.commands.JedisCommands.zscan(java.lang.String,java.lang.String,redis.clients.jedis.ScanParams)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.append(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.append(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.bitcount(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.bitcount(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.bitcount(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.bitcount(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.bitpos(java.lang.String,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.bitpos(java.lang.String,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.decr(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.decr(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.decrBy(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.decrBy(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.del(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.KeyCommands.del(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.exists(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.KeyCommands.exists(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.expire(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.KeyCommands.expire(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.expireAt(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.KeyCommands.expireAt(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.geoadd(java.lang.String,double,double,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.GeoCommands.geoadd(java.lang.String,double,double,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.geoadd(java.lang.String,java.util.Map<java.lang.String,redis.clients.jedis.GeoCoordinate>)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.GeoCommands.geoadd(java.lang.String,java.util.Map<java.lang.String,redis.clients.jedis.GeoCoordinate>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.geoadd(java.lang.String,redis.clients.jedis.params.GeoAddParams,java.util.Map<java.lang.String,redis.clients.jedis.GeoCoordinate>)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.GeoCommands.geoadd(java.lang.String,redis.clients.jedis.params.GeoAddParams,java.util.Map<java.lang.String,redis.clients.jedis.GeoCoordinate>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.getbit(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.getbit(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.hdel(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashCommands.hdel(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.hexists(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashCommands.hexists(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.hincrBy(java.lang.String,java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashCommands.hincrBy(java.lang.String,java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.hincrByFloat(java.lang.String,java.lang.String,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashCommands.hincrByFloat(java.lang.String,java.lang.String,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.hlen(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashCommands.hlen(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.hscan(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashCommands.hscan(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.hset(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashCommands.hset(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.hset(java.lang.String,java.util.Map<java.lang.String,java.lang.String>)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashCommands.hset(java.lang.String,java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.hsetnx(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashCommands.hsetnx(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.hstrlen(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashCommands.hstrlen(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.incr(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.incr(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.incrBy(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.incrBy(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.incrByFloat(java.lang.String,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.incrByFloat(java.lang.String,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.llen(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.ListCommands.llen(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.lpush(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.ListCommands.lpush(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.lpushx(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.ListCommands.lpushx(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.lrem(java.lang.String,long,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.ListCommands.lrem(java.lang.String,long,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.persist(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.KeyCommands.persist(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.pexpire(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.KeyCommands.pexpire(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.pexpireAt(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.KeyCommands.pexpireAt(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.pfadd(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HyperLogLogCommands.pfadd(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.pttl(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.KeyCommands.pttl(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.rpush(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.ListCommands.rpush(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.rpushx(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.ListCommands.rpushx(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.sadd(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SetCommands.sadd(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.scard(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SetCommands.scard(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.setbit(java.lang.String,long,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.setbit(java.lang.String,long,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.setnx(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.setnx(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.setrange(java.lang.String,long,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.setrange(java.lang.String,long,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.sismember(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SetCommands.sismember(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.srem(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SetCommands.srem(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.sscan(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SetCommands.sscan(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.strlen(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.strlen(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.touch(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.KeyCommands.touch(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.ttl(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.KeyCommands.ttl(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.unlink(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.KeyCommands.unlink(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.xautoclaim(java.lang.String,java.lang.String,java.lang.String,long,redis.clients.jedis.StreamEntryID,redis.clients.jedis.params.XAutoClaimParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StreamCommands.xautoclaim(java.lang.String,java.lang.String,java.lang.String,long,redis.clients.jedis.StreamEntryID,redis.clients.jedis.params.XAutoClaimParams)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.xclaim(java.lang.String,java.lang.String,java.lang.String,long,redis.clients.jedis.params.XClaimParams,redis.clients.jedis.StreamEntryID[])`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StreamCommands.xclaim(java.lang.String,java.lang.String,java.lang.String,long,redis.clients.jedis.params.XClaimParams,redis.clients.jedis.StreamEntryID[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.xgroupDelConsumer(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StreamCommands.xgroupDelConsumer(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.xinfoConsumers(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StreamCommands.xinfoConsumers(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.xinfoGroup(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StreamCommands.xinfoGroup(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.xinfoStream(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StreamCommands.xinfoStream(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.xlen(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StreamCommands.xlen(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.xpending(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StreamCommands.xpending(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.xpending(java.lang.String,java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StreamCommands.xpending(java.lang.String,java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.xpending(java.lang.String,java.lang.String,redis.clients.jedis.params.XPendingParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StreamCommands.xpending(java.lang.String,java.lang.String,redis.clients.jedis.params.XPendingParams)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.xrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StreamCommands.xrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.xrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StreamCommands.xrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.xrevrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StreamCommands.xrevrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.xrevrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StreamCommands.xrevrange(java.lang.String,redis.clients.jedis.StreamEntryID,redis.clients.jedis.StreamEntryID,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zadd(java.lang.String,double,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zadd(java.lang.String,double,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zadd(java.lang.String,double,java.lang.String,redis.clients.jedis.params.ZAddParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zadd(java.lang.String,double,java.lang.String,redis.clients.jedis.params.ZAddParams)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zadd(java.lang.String,java.util.Map<java.lang.String,java.lang.Double>)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zadd(java.lang.String,java.util.Map<java.lang.String,java.lang.Double>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zadd(java.lang.String,java.util.Map<java.lang.String,java.lang.Double>,redis.clients.jedis.params.ZAddParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zadd(java.lang.String,java.util.Map<java.lang.String,java.lang.Double>,redis.clients.jedis.params.ZAddParams)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zcard(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zcard(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zcount(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zcount(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zcount(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zcount(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zincrby(java.lang.String,double,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zincrby(java.lang.String,double,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zlexcount(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zlexcount(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zpopmax(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zpopmax(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zpopmax(java.lang.String,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zpopmax(java.lang.String,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zpopmin(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zpopmin(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zpopmin(java.lang.String,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zpopmin(java.lang.String,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrandmember(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrandmember(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrandmemberWithScores(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrandmemberWithScores(java.lang.String,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrange(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrange(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrangeByLex(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrangeByLex(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrangeByScore(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrangeByScore(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrangeByScore(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrangeByScore(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrangeByScore(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrangeByScore(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrangeByScoreWithScores(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrangeByScoreWithScores(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrangeByScoreWithScores(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrangeByScoreWithScores(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrangeWithScores(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrangeWithScores(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrem(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrem(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zremrangeByLex(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zremrangeByLex(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zremrangeByRank(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zremrangeByRank(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zremrangeByScore(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zremrangeByScore(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zremrangeByScore(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zremrangeByScore(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrevrange(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrevrange(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrevrangeByScore(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrevrangeByScore(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrevrangeByScore(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrevrangeByScore(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrevrangeByScoreWithScores(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrevrangeByScoreWithScores(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrevrangeByScoreWithScores(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrevrangeByScoreWithScores(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zrevrangeWithScores(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrevrangeWithScores(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.commands.JedisCommands.zscan(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zscan(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.append(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.append(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.bitcount(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.bitcount(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.bitcount(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.bitcount(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.bitpos(java.lang.String,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.bitpos(java.lang.String,boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.decr(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.decr(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.decrBy(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.decrBy(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.del(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.KeyCommands.del(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.exists(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.KeyCommands.exists(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.expire(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.KeyCommands.expire(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.expireAt(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.KeyCommands.expireAt(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.geoadd(java.lang.String,double,double,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.GeoCommands.geoadd(java.lang.String,double,double,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.geoadd(java.lang.String,java.util.Map<java.lang.String,redis.clients.jedis.GeoCoordinate>)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.GeoCommands.geoadd(java.lang.String,java.util.Map<java.lang.String,redis.clients.jedis.GeoCoordinate>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.geoadd(java.lang.String,redis.clients.jedis.params.GeoAddParams,java.util.Map<java.lang.String,redis.clients.jedis.GeoCoordinate>)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.GeoCommands.geoadd(java.lang.String,redis.clients.jedis.params.GeoAddParams,java.util.Map<java.lang.String,redis.clients.jedis.GeoCoordinate>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.getbit(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.getbit(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.hdel(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashCommands.hdel(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.hexists(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashCommands.hexists(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.hincrBy(java.lang.String,java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashCommands.hincrBy(java.lang.String,java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.hincrByFloat(java.lang.String,java.lang.String,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashCommands.hincrByFloat(java.lang.String,java.lang.String,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.hlen(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashCommands.hlen(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.hscan(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashCommands.hscan(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.hset(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashCommands.hset(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.hset(java.lang.String,java.util.Map<java.lang.String,java.lang.String>)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashCommands.hset(java.lang.String,java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.hsetnx(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashCommands.hsetnx(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.hstrlen(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HashCommands.hstrlen(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.incr(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.incr(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.incrBy(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.incrBy(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.incrByFloat(java.lang.String,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.incrByFloat(java.lang.String,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.llen(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.ListCommands.llen(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.lpush(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.ListCommands.lpush(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.lpushx(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.ListCommands.lpushx(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.lrem(java.lang.String,long,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.ListCommands.lrem(java.lang.String,long,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.persist(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.KeyCommands.persist(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.pexpire(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.KeyCommands.pexpire(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.pexpireAt(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.KeyCommands.pexpireAt(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.pfadd(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.HyperLogLogCommands.pfadd(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.pttl(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.KeyCommands.pttl(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.rpush(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.ListCommands.rpush(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.rpushx(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.ListCommands.rpushx(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.sadd(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SetCommands.sadd(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.scard(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SetCommands.scard(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.setbit(java.lang.String,long,boolean)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.setbit(java.lang.String,long,boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.setnx(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.setnx(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.setrange(java.lang.String,long,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.setrange(java.lang.String,long,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.sismember(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SetCommands.sismember(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.srem(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SetCommands.srem(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.sscan(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SetCommands.sscan(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.strlen(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StringCommands.strlen(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.touch(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.KeyCommands.touch(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.ttl(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.KeyCommands.ttl(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.unlink(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.KeyCommands.unlink(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.xgroupDelConsumer(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StreamCommands.xgroupDelConsumer(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.xinfoStream(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StreamCommands.xinfoStream(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.xlen(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StreamCommands.xlen(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.xpending(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.StreamCommands.xpending(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zadd(java.lang.String,double,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zadd(java.lang.String,double,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zadd(java.lang.String,double,java.lang.String,redis.clients.jedis.params.ZAddParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zadd(java.lang.String,double,java.lang.String,redis.clients.jedis.params.ZAddParams)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zadd(java.lang.String,java.util.Map<java.lang.String,java.lang.Double>)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zadd(java.lang.String,java.util.Map<java.lang.String,java.lang.Double>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zadd(java.lang.String,java.util.Map<java.lang.String,java.lang.Double>,redis.clients.jedis.params.ZAddParams)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zadd(java.lang.String,java.util.Map<java.lang.String,java.lang.Double>,redis.clients.jedis.params.ZAddParams)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zcard(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zcard(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zcount(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zcount(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zcount(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zcount(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zincrby(java.lang.String,double,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zincrby(java.lang.String,double,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zlexcount(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zlexcount(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zpopmax(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zpopmax(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zpopmax(java.lang.String,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zpopmax(java.lang.String,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zpopmin(java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zpopmin(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zpopmin(java.lang.String,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zpopmin(java.lang.String,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrandmember(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrandmember(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrandmemberWithScores(java.lang.String,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrandmemberWithScores(java.lang.String,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrange(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrange(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrangeByLex(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrangeByLex(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrangeByScore(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrangeByScore(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrangeByScore(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrangeByScore(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrangeByScore(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrangeByScore(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrangeByScoreWithScores(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrangeByScoreWithScores(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrangeByScoreWithScores(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrangeByScoreWithScores(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrangeWithScores(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrangeWithScores(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrem(java.lang.String,java.lang.String[])`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrem(java.lang.String,java.lang.String[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zremrangeByLex(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zremrangeByLex(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zremrangeByRank(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zremrangeByRank(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zremrangeByScore(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zremrangeByScore(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zremrangeByScore(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zremrangeByScore(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrevrange(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrevrange(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrevrangeByLex(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrevrangeByScore(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrevrangeByScore(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrevrangeByScore(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrevrangeByScore(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrevrangeByScore(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrevrangeByScoreWithScores(java.lang.String,double,double)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrevrangeByScoreWithScores(java.lang.String,double,double)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrevrangeByScoreWithScores(java.lang.String,double,double,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrevrangeByScoreWithScores(java.lang.String,double,double,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrevrangeByScoreWithScores(java.lang.String,java.lang.String,java.lang.String,int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zrevrangeWithScores(java.lang.String,long,long)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zrevrangeWithScores(java.lang.String,long,long)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.commands.JedisCommands.zscan(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `redis.clients.jedis.commands.SortedSetCommands.zscan(java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.FunctionCommands.functionStats()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ScriptingKeyCommands.evalsha(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.objectRefcount(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.GeoCommands.georadiusByMemberReadonly(java.lang.String,java.lang.String,double,redis.clients.jedis.args.GeoUnit)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.migrate(java.lang.String,int,java.lang.String,int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ListCommands.lmove(java.lang.String,java.lang.String,redis.clients.jedis.args.ListDirection,redis.clients.jedis.args.ListDirection)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.StreamCommands.xadd(java.lang.String,redis.clients.jedis.params.XAddParams,java.util.Map<java.lang.String,java.lang.String>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.HashCommands.hscan(java.lang.String,java.lang.String,redis.clients.jedis.params.ScanParams)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ListCommands.blpop(double,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SetCommands.sintercard(int,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ScriptingKeyCommands.eval(java.lang.String,java.util.List<java.lang.String>,java.util.List<java.lang.String>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SetCommands.sunionstore(java.lang.String,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.GeoCommands.geodist(java.lang.String,java.lang.String,java.lang.String,redis.clients.jedis.args.GeoUnit)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ListCommands.blmpop(long,redis.clients.jedis.args.ListDirection,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.pexpireAt(java.lang.String,long,redis.clients.jedis.args.ExpiryOption)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.StringCommands.setGet(java.lang.String,java.lang.String,redis.clients.jedis.params.SetParams)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.copy(java.lang.String,java.lang.String,boolean)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.objectIdletime(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.GeoCommands.georadius(java.lang.String,double,double,double,redis.clients.jedis.args.GeoUnit)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.GeoCommands.geosearch(java.lang.String,java.lang.String,double,redis.clients.jedis.args.GeoUnit)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.FunctionCommands.functionFlush(redis.clients.jedis.args.FlushMode)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ListCommands.rpoplpush(java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ListCommands.brpop(double,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SetCommands.sdiffstore(java.lang.String,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.StringCommands.mset(java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.expireAt(java.lang.String,long,redis.clients.jedis.args.ExpiryOption)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.touch(java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ScriptingKeyCommands.evalsha(java.lang.String,int,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.randomKey()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SortedSetCommands.zinterstore(java.lang.String,redis.clients.jedis.params.ZParams,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.StreamCommands.xinfoStreamFull(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ListCommands.blmove(java.lang.String,java.lang.String,redis.clients.jedis.args.ListDirection,redis.clients.jedis.args.ListDirection,double)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.exists(java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.FunctionCommands.functionListWithCode()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ScriptingKeyCommands.evalsha(java.lang.String,java.util.List<java.lang.String>,java.util.List<java.lang.String>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.GeoCommands.georadiusReadonly(java.lang.String,double,double,double,redis.clients.jedis.args.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ScriptingKeyCommands.eval(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.sort(java.lang.String,redis.clients.jedis.params.SortingParams)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ListCommands.lmpop(redis.clients.jedis.args.ListDirection,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.GeoCommands.georadiusByMember(java.lang.String,java.lang.String,double,redis.clients.jedis.args.GeoUnit)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ListCommands.brpoplpush(java.lang.String,java.lang.String,int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ScriptingKeyCommands.evalshaReadonly(java.lang.String,java.util.List<java.lang.String>,java.util.List<java.lang.String>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ListCommands.lmpop(redis.clients.jedis.args.ListDirection,int,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.StringCommands.msetnx(java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SetCommands.sdiff(java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.FunctionCommands.fcall(java.lang.String,java.util.List<java.lang.String>,java.util.List<java.lang.String>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.FunctionCommands.functionRestore(byte[],redis.clients.jedis.args.FunctionRestorePolicy)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.StreamCommands.xinfoGroups(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SortedSetCommands.zunionstore(java.lang.String,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SortedSetCommands.bzmpop(long,redis.clients.jedis.args.SortedSetOption,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.sort(java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.scan(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ListCommands.blpop(int,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.FunctionCommands.functionFlush()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.StreamCommands.xrange(java.lang.String,java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SortedSetCommands.zrange(java.lang.String,redis.clients.jedis.params.ZRangeParams)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.GeoCommands.georadiusByMemberStore(java.lang.String,java.lang.String,double,redis.clients.jedis.args.GeoUnit,redis.clients.jedis.params.GeoRadiusParam,redis.clients.jedis.params.GeoRadiusStoreParam)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ListCommands.blmpop(long,redis.clients.jedis.args.ListDirection,int,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.GeoCommands.geosearch(java.lang.String,redis.clients.jedis.GeoCoordinate,double,double,redis.clients.jedis.args.GeoUnit)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.GeoCommands.geosearch(java.lang.String,redis.clients.jedis.params.GeoSearchParam)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.GeoCommands.geosearchStoreStoreDist(java.lang.String,java.lang.String,redis.clients.jedis.params.GeoSearchParam)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.HyperLogLogCommands.pfcount(java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.GeoCommands.geosearchStore(java.lang.String,java.lang.String,java.lang.String,double,redis.clients.jedis.args.GeoUnit)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.expireTime(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ListCommands.brpop(int,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.GeoCommands.georadiusByMemberReadonly(java.lang.String,java.lang.String,double,redis.clients.jedis.args.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.FunctionCommands.functionLoadReplace(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.unlink(java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SortedSetCommands.zscan(java.lang.String,java.lang.String,redis.clients.jedis.params.ScanParams)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.FunctionCommands.functionListWithCode(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SortedSetCommands.bzpopmin(double,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.StreamCommands.xrevrange(java.lang.String,java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.objectEncoding(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.StringCommands.mget(java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SortedSetCommands.zrangestore(java.lang.String,java.lang.String,redis.clients.jedis.params.ZRangeParams)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.GeoCommands.geosearchStore(java.lang.String,java.lang.String,redis.clients.jedis.params.GeoSearchParam)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.del(java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.StringCommands.bitpos(java.lang.String,boolean,redis.clients.jedis.params.BitPosParams)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.StreamCommands.xrevrange(java.lang.String,java.lang.String,java.lang.String,int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.rename(java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.keys(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.GeoCommands.geosearchStore(java.lang.String,java.lang.String,redis.clients.jedis.GeoCoordinate,double,double,redis.clients.jedis.args.GeoUnit)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.StreamCommands.xinfoStreamFull(java.lang.String,int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SetCommands.sinterstore(java.lang.String,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.FunctionCommands.functionRestore(byte[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.StreamCommands.xread(redis.clients.jedis.params.XReadParams,java.util.Map<java.lang.String,redis.clients.jedis.StreamEntryID>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.sortReadonly(java.lang.String,redis.clients.jedis.params.SortingParams)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SortedSetCommands.zintercard(java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.StringCommands.bitop(redis.clients.jedis.args.BitOP,java.lang.String,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SetCommands.sintercard(java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SortedSetCommands.zunionWithScores(redis.clients.jedis.params.ZParams,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.FunctionCommands.functionKill()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.pexpireTime(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SortedSetCommands.zunionstore(java.lang.String,redis.clients.jedis.params.ZParams,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.FunctionCommands.functionDelete(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SortedSetCommands.bzmpop(long,redis.clients.jedis.args.SortedSetOption,int,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.FunctionCommands.fcallReadonly(java.lang.String,java.util.List<java.lang.String>,java.util.List<java.lang.String>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SortedSetCommands.zmpop(redis.clients.jedis.args.SortedSetOption,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SortedSetCommands.zdiff(java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.GeoCommands.georadiusByMember(java.lang.String,java.lang.String,double,redis.clients.jedis.args.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.memoryUsage(java.lang.String,int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.GeoCommands.georadius(java.lang.String,double,double,double,redis.clients.jedis.args.GeoUnit,redis.clients.jedis.params.GeoRadiusParam)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SortedSetCommands.zdiffStore(java.lang.String,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SortedSetCommands.bzpopmax(double,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.expire(java.lang.String,long,redis.clients.jedis.args.ExpiryOption)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SetCommands.sunion(java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.StringCommands.strAlgoLCSKeys(java.lang.String,java.lang.String,redis.clients.jedis.params.StrAlgoLCSParams)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SetCommands.sinter(java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SortedSetCommands.zinterstore(java.lang.String,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.StreamCommands.xgroupCreateConsumer(java.lang.String,java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.GeoCommands.geosearchStore(java.lang.String,java.lang.String,redis.clients.jedis.GeoCoordinate,double,redis.clients.jedis.args.GeoUnit)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SortedSetCommands.zintercard(long,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SetCommands.sscan(java.lang.String,java.lang.String,redis.clients.jedis.params.ScanParams)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ListCommands.linsert(java.lang.String,redis.clients.jedis.args.ListPosition,java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SortedSetCommands.zinterWithScores(redis.clients.jedis.params.ZParams,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.HyperLogLogCommands.pfmerge(java.lang.String,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.StringCommands.lcs(java.lang.String,java.lang.String,redis.clients.jedis.params.LCSParams)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.objectFreq(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.GeoCommands.georadiusReadonly(java.lang.String,double,double,double,redis.clients.jedis.args.GeoUnit)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SortedSetCommands.zrangeWithScores(java.lang.String,redis.clients.jedis.params.ZRangeParams)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.GeoCommands.georadiusStore(java.lang.String,double,double,double,redis.clients.jedis.args.GeoUnit,redis.clients.jedis.params.GeoRadiusParam,redis.clients.jedis.params.GeoRadiusStoreParam)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.migrate(java.lang.String,int,int,redis.clients.jedis.params.MigrateParams,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.GeoCommands.geosearch(java.lang.String,java.lang.String,double,double,redis.clients.jedis.args.GeoUnit)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.pexpire(java.lang.String,long,redis.clients.jedis.args.ExpiryOption)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SortedSetCommands.zunion(redis.clients.jedis.params.ZParams,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.memoryUsage(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.scan(java.lang.String,redis.clients.jedis.params.ScanParams)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ScriptingKeyCommands.evalReadonly(java.lang.String,java.util.List<java.lang.String>,java.util.List<java.lang.String>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.scan(java.lang.String,redis.clients.jedis.params.ScanParams,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.StringCommands.bitcount(java.lang.String,long,long,redis.clients.jedis.args.BitCountOption)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.FunctionCommands.functionLoad(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.GeoCommands.geosearchStore(java.lang.String,java.lang.String,java.lang.String,double,double,redis.clients.jedis.args.GeoUnit)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ScriptingKeyCommands.eval(java.lang.String,int,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.FunctionCommands.functionList()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SortedSetCommands.zmpop(redis.clients.jedis.args.SortedSetOption,int,java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.StreamCommands.xrange(java.lang.String,java.lang.String,java.lang.String,int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.renamenx(java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SortedSetCommands.zdiffWithScores(java.lang.String[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.FunctionCommands.functionDump()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.GeoCommands.geosearch(java.lang.String,redis.clients.jedis.GeoCoordinate,double,redis.clients.jedis.args.GeoUnit)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.FunctionCommands.functionList(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.KeyCommands.sort(java.lang.String,redis.clients.jedis.params.SortingParams,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SetCommands.smove(java.lang.String,java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.StreamCommands.xreadGroup(java.lang.String,java.lang.String,redis.clients.jedis.params.XReadGroupParams,java.util.Map<java.lang.String,redis.clients.jedis.StreamEntryID>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.JedisCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.SortedSetCommands.zinter(redis.clients.jedis.params.ZParams,java.lang.String[])`

## redis.clients.jedis.commands.ModuleCommands

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `redis.clients.jedis.commands.ModuleCommands`
+ MUST NOW IMPLEMENT: `redis.clients.jedis.commands.ModuleCommands.moduleLoad(java.lang.String,java.lang.String[])`

## redis.clients.jedis.commands.MultiKeyBinaryCommands

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.commands.MultiKeyBinaryCommands`

## redis.clients.jedis.commands.MultiKeyBinaryJedisClusterCommands

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.commands.MultiKeyBinaryJedisClusterCommands`

## redis.clients.jedis.commands.MultiKeyBinaryRedisPipeline

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.commands.MultiKeyBinaryRedisPipeline`

## redis.clients.jedis.commands.MultiKeyCommands

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.commands.MultiKeyCommands`

## redis.clients.jedis.commands.MultiKeyCommandsPipeline

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.commands.MultiKeyCommandsPipeline`

## redis.clients.jedis.commands.MultiKeyJedisClusterCommands

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.commands.MultiKeyJedisClusterCommands`

## redis.clients.jedis.commands.RedisPipeline

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.commands.RedisPipeline`

## redis.clients.jedis.commands.ScriptingCommands

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.commands.ScriptingCommands`

## redis.clients.jedis.commands.ScriptingCommandsPipeline

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.commands.ScriptingCommandsPipeline`

## redis.clients.jedis.exceptions.JedisAskDataException

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `redis.clients.jedis.exceptions.JedisRedirectionException.getSlot()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `redis.clients.jedis.exceptions.JedisRedirectionException.getTargetNode()`

## redis.clients.jedis.exceptions.JedisClusterMaxAttemptsException

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.exceptions.JedisClusterMaxAttemptsException`

## redis.clients.jedis.exceptions.JedisExhaustedPoolException

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.exceptions.JedisExhaustedPoolException`

## redis.clients.jedis.exceptions.JedisMovedDataException

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `redis.clients.jedis.exceptions.JedisRedirectionException.getSlot()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `redis.clients.jedis.exceptions.JedisRedirectionException.getTargetNode()`

## redis.clients.jedis.exceptions.JedisNoReachableClusterNodeException

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.exceptions.JedisNoReachableClusterNodeException`

## redis.clients.jedis.exceptions.JedisRedirectionException

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `redis.clients.jedis.exceptions.JedisRedirectionException.getSlot()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `redis.clients.jedis.exceptions.JedisRedirectionException.getTargetNode()`

## redis.clients.jedis.params.ClientKillParams

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.ClientKillParams.type(redis.clients.jedis.params.ClientKillParams$Type)`

## redis.clients.jedis.params.ClientKillParams$Type

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.params.ClientKillParams$Type`

## redis.clients.jedis.params.FailoverParams

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.FailoverParams.getByteParams()`

## redis.clients.jedis.params.GeoAddParams

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.GeoAddParams.getByteParams(byte[],byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.addParam(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.addParam(java.lang.String,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.contains(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.getByteParams()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.getParam(java.lang.String)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.params.GeoAddParams`

## redis.clients.jedis.params.GeoRadiusParam

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.GeoRadiusParam.getByteParams(byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.addParam(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.addParam(java.lang.String,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.contains(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.getByteParams()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.getParam(java.lang.String)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.params.GeoRadiusParam`

## redis.clients.jedis.params.GeoRadiusStoreParam

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.GeoRadiusStoreParam.getByteKeys(byte[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.GeoRadiusStoreParam.getByteParams(byte[][])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.GeoRadiusStoreParam.getKey()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.GeoRadiusStoreParam.getOption()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.GeoRadiusStoreParam.getStringKeys(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.addParam(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.addParam(java.lang.String,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.contains(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.getByteParams()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.getParam(java.lang.String)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.params.GeoRadiusStoreParam`

## redis.clients.jedis.params.GetExParams

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.GetExParams.getByteParams(byte[],byte[][])`

## redis.clients.jedis.params.LPosParams

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.LPosParams.getByteParams(byte[][])`

## redis.clients.jedis.params.MigrateParams

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.MigrateParams.getByteParams()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.addParam(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.addParam(java.lang.String,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.contains(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.getParam(java.lang.String)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.params.MigrateParams`

## redis.clients.jedis.params.RestoreParams

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.addParam(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.addParam(java.lang.String,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.contains(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.getByteParams()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.getParam(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.RestoreParams.getByteParams(byte[],byte[][])`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.params.RestoreParams`

## redis.clients.jedis.params.SetParams

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.SetParams.ex(int)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.SetParams.getByteParams(byte[][])`

## redis.clients.jedis.params.StrAlgoLCSParams

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.StrAlgoLCSParams.getByteParams(redis.clients.jedis.Protocol$Keyword,byte[],byte[])`

## redis.clients.jedis.params.XAddParams

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.addParam(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.addParam(java.lang.String,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.contains(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.getByteParams()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.getParam(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.XAddParams.getByteParams(byte[],byte[][])`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.params.XAddParams`

## redis.clients.jedis.params.XAutoClaimParams

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.addParam(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.addParam(java.lang.String,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.contains(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.getParam(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.XAutoClaimParams.getByteParams()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.params.XAutoClaimParams`

## redis.clients.jedis.params.XClaimParams

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.addParam(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.addParam(java.lang.String,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.contains(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.getByteParams()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.getParam(java.lang.String)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.params.XClaimParams`

## redis.clients.jedis.params.XPendingParams

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.addParam(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.addParam(java.lang.String,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.contains(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.getParam(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.XPendingParams.getByteParams()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.params.XPendingParams`

## redis.clients.jedis.params.XReadGroupParams

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.addParam(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.addParam(java.lang.String,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.contains(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.getByteParams()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.getParam(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.XReadGroupParams.hasBlock()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.params.XReadGroupParams`

## redis.clients.jedis.params.XReadParams

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.addParam(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.addParam(java.lang.String,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.contains(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.getByteParams()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.getParam(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.XReadParams.hasBlock()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.params.XReadParams`

## redis.clients.jedis.params.XTrimParams

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.addParam(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.addParam(java.lang.String,java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.contains(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.getByteParams()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.Params.getParam(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.XTrimParams.getByteParams(byte[],byte[][])`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.params.XTrimParams`

## redis.clients.jedis.params.ZAddParams

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.ZAddParams.getByteParams(byte[],byte[][])`

## redis.clients.jedis.params.ZIncrByParams

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.params.ZIncrByParams.getByteParams(byte[],byte[][])`

## redis.clients.jedis.resps.KeyedListElement

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `redis.clients.jedis.resps.KeyedListElement.getKey()`
+ NEW RETURN TYPE: `java.util.AbstractMap$SimpleImmutableEntry.getKey()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `redis.clients.jedis.resps.KeyedListElement.getKey()`
+ NEW RETURN TYPE: `java.util.AbstractMap$SimpleImmutableEntry.getKey()`

## redis.clients.jedis.resps.KeyedZSetElement

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Tuple.compare(redis.clients.jedis.Tuple,redis.clients.jedis.Tuple)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.Tuple.compareTo(redis.clients.jedis.Tuple)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.resps.KeyedZSetElement`

## redis.clients.jedis.util.JedisClusterHashTagUtil

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.util.JedisClusterHashTagUtil`

## redis.clients.jedis.util.KeyMergeUtil

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.util.KeyMergeUtil`

## redis.clients.jedis.util.Pool

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `redis.clients.jedis.util.Pool.<init>()`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `redis.clients.jedis.util.Pool.internalPool`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.clearInternalPool()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.closeInternalPool()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.getMaxBorrowWaitTimeMillis()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.getMeanBorrowWaitTimeMillis()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.getNumActive()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.getNumIdle()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.getNumWaiters()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.initPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig<T>,org.apache.commons.pool2.PooledObjectFactory<T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.isClosed()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.returnBrokenResourceObject(T)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `redis.clients.jedis.util.Pool.returnResourceObject(T)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `redis.clients.jedis.util.Pool`

## redis.clients.jedis.util.ShardInfo

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.util.ShardInfo`

## redis.clients.jedis.util.Sharded

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.util.Sharded`

## redis.clients.jedis.util.Slowlog

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `redis.clients.jedis.util.Slowlog`

