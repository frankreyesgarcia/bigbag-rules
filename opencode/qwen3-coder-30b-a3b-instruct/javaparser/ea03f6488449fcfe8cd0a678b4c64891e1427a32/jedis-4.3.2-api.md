# API Specification: redis.clients:jedis 4.3.2

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public abstract class `redis.clients.jedis.BinaryJedisPubSub`

**Constructors:**
- `public BinaryJedisPubSub()`

**Methods:**
- `public int getSubscribedChannels()`
- `public boolean isSubscribed()`
- `public void onMessage(byte[] p0, byte[] p1)`
- `public void onPMessage(byte[] p0, byte[] p1, byte[] p2)`
- `public void onPSubscribe(byte[] p0, int p1)`
- `public void onPUnsubscribe(byte[] p0, int p1)`
- `public void onPong(byte[] p0)`
- `public void onSubscribe(byte[] p0, int p1)`
- `public void onUnsubscribe(byte[] p0, int p1)`
- `public void ping()`
- `public void ping(byte[] p0)`
- `public void proceed(redis.clients.jedis.Connection p0, byte[]... p1)`
- `public void proceedWithPatterns(redis.clients.jedis.Connection p0, byte[]... p1)`
- `public void psubscribe(byte[]... p0)`
- `public void punsubscribe()`
- `public void punsubscribe(byte[]... p0)`
- `public void subscribe(byte[]... p0)`
- `public void unsubscribe()`
- `public void unsubscribe(byte[]... p0)`

---

## public abstract class `redis.clients.jedis.Builder`<T extends java.lang.Object>

**Constructors:**
- `public Builder()`

**Methods:**
- `public abstract T build(java.lang.Object p0)`

---

## public final class `redis.clients.jedis.BuilderFactory`

**Fields:**
- `public final static redis.clients.jedis.Builder ACCESS_CONTROL_LOG_ENTRY_LIST`
- `public final static redis.clients.jedis.Builder ACCESS_CONTROL_USER`
- `public final static redis.clients.jedis.Builder BINARY`
- `public final static redis.clients.jedis.Builder BINARY_KEYED_TUPLE_LIST`
- `public final static redis.clients.jedis.Builder BINARY_LIST`
- `public final static redis.clients.jedis.Builder BINARY_MAP`
- `public final static redis.clients.jedis.Builder BINARY_SET`
- `public final static redis.clients.jedis.Builder BLOOM_SCANDUMP_RESPONSE`
- `public final static redis.clients.jedis.Builder BOOLEAN`
- `public final static redis.clients.jedis.Builder BOOLEAN_LIST`
- `public final static redis.clients.jedis.Builder BOOLEAN_WITH_ERROR_LIST`
- `public final static redis.clients.jedis.Builder BYTE_ARRAY`
- `public final static redis.clients.jedis.Builder BYTE_ARRAY_LIST`
- `public final static redis.clients.jedis.Builder COMMAND_DOCS_RESPONSE`
- `public final static redis.clients.jedis.Builder COMMAND_INFO_RESPONSE`
- `public final static redis.clients.jedis.Builder DOUBLE`
- `public final static redis.clients.jedis.Builder DOUBLE_LIST`
- `public final static redis.clients.jedis.Builder ENCODED_OBJECT`
- `public final static redis.clients.jedis.Builder ENCODED_OBJECT_LIST`
- `public final static redis.clients.jedis.Builder ENCODED_OBJECT_LIST_LIST`
- `public final static redis.clients.jedis.Builder ENCODED_OBJECT_MAP`
- `public final static redis.clients.jedis.Builder GEORADIUS_WITH_PARAMS_RESULT`
- `public final static redis.clients.jedis.Builder GEO_COORDINATE_LIST`
- `public final static redis.clients.jedis.Builder HSCAN_BINARY_RESPONSE`
- `public final static redis.clients.jedis.Builder HSCAN_RESPONSE`
- `public final static redis.clients.jedis.Builder JSON_ARRAY`
- `public final static redis.clients.jedis.Builder JSON_ARRAY_LIST`
- `public final static redis.clients.jedis.Builder JSON_OBJECT`
- `public final static redis.clients.jedis.Builder JSON_TYPE`
- `public final static redis.clients.jedis.Builder JSON_TYPE_LIST`
- `public final static redis.clients.jedis.Builder KEYED_BINARY_LIST`
- `public final static redis.clients.jedis.Builder KEYED_LIST_ELEMENT`
- `public final static redis.clients.jedis.Builder KEYED_STRING_LIST`
- `public final static redis.clients.jedis.Builder KEYED_STRING_LIST_LIST`
- `public final static redis.clients.jedis.Builder KEYED_TUPLE_LIST`
- `public final static redis.clients.jedis.Builder KEYED_ZSET_ELEMENT`
- `public final static redis.clients.jedis.Builder LIBRARY_LIST`
- `public final static redis.clients.jedis.Builder LONG`
- `public final static redis.clients.jedis.Builder LONG_LIST`
- `public final static redis.clients.jedis.Builder MODULE_LIST`
- `public final static redis.clients.jedis.Builder PUBSUB_NUMSUB_MAP`
- `public final static redis.clients.jedis.Builder RAW_OBJECT`
- `public final static redis.clients.jedis.Builder RAW_OBJECT_LIST`
- `public final static redis.clients.jedis.Builder SCAN_BINARY_RESPONSE`
- `public final static redis.clients.jedis.Builder SCAN_RESPONSE`
- `public final static redis.clients.jedis.Builder SEARCH_AGGREGATION_RESULT`
- `public final static redis.clients.jedis.Builder SEARCH_AGGREGATION_RESULT_WITH_CURSOR`
- `public final static redis.clients.jedis.Builder SEARCH_SYNONYM_GROUPS`
- `public final static redis.clients.jedis.Builder SSCAN_BINARY_RESPONSE`
- `public final static redis.clients.jedis.Builder SSCAN_RESPONSE`
- `public final static redis.clients.jedis.Builder STREAM_AUTO_CLAIM_ID_RESPONSE`
- `public final static redis.clients.jedis.Builder STREAM_AUTO_CLAIM_RESPONSE`
- `public final static redis.clients.jedis.Builder STREAM_CONSUMERS_INFO_LIST`
- `public final static redis.clients.jedis.Builder STREAM_ENTRY`
- `public final static redis.clients.jedis.Builder STREAM_ENTRY_ID`
- `public final static redis.clients.jedis.Builder STREAM_ENTRY_ID_LIST`
- `public final static redis.clients.jedis.Builder STREAM_ENTRY_LIST`
- `public final static redis.clients.jedis.Builder STREAM_GROUP_INFO_LIST`
- `public final static redis.clients.jedis.Builder STREAM_INFO`
- `public final static redis.clients.jedis.Builder STREAM_INFO_FULL`
- `public final static redis.clients.jedis.Builder STREAM_PENDING_ENTRY_LIST`
- `public final static redis.clients.jedis.Builder STREAM_PENDING_SUMMARY`
- `public final static redis.clients.jedis.Builder STREAM_READ_RESPONSE`
- `public final static redis.clients.jedis.Builder STRING`
- `public final static redis.clients.jedis.Builder STRING_LIST`
- `public final static redis.clients.jedis.Builder STRING_LIST_LIST`
- `public final static redis.clients.jedis.Builder STRING_MAP`
- `public final static redis.clients.jedis.Builder STRING_MAP_FROM_PAIRS`
- `public final static redis.clients.jedis.Builder STRING_ORDERED_SET`
- `public final static redis.clients.jedis.Builder STRING_SET`
- `public final static redis.clients.jedis.Builder STR_ALGO_LCS_RESULT_BUILDER`
- `public final static redis.clients.jedis.Builder TIMESERIES_ELEMENT`
- `public final static redis.clients.jedis.Builder TIMESERIES_ELEMENT_LIST`
- `public final static redis.clients.jedis.Builder TIMESERIES_MGET_RESPONSE`
- `public final static redis.clients.jedis.Builder TIMESERIES_MRANGE_RESPONSE`
- `public final static redis.clients.jedis.Builder TUPLE`
- `public final static redis.clients.jedis.Builder TUPLE_LIST`
- `public final static redis.clients.jedis.Builder TUPLE_ZSET`
- `public final static redis.clients.jedis.Builder ZSCAN_RESPONSE`

---

## public class `redis.clients.jedis.ClusterCommandArguments`
extends `redis.clients.jedis.CommandArguments`  

**Constructors:**
- `public ClusterCommandArguments(redis.clients.jedis.commands.ProtocolCommand p0)`

**Methods:**
- `public int getCommandHashSlot()`
- `protected redis.clients.jedis.CommandArguments processKey(byte[] p0)`
- `protected redis.clients.jedis.CommandArguments processKey(java.lang.String p0)`

---

## public class `redis.clients.jedis.ClusterCommandObjects`
extends `redis.clients.jedis.CommandObjects`  

**Constructors:**
- `public ClusterCommandObjects()`

**Methods:**
- `protected redis.clients.jedis.ClusterCommandArguments commandArguments(redis.clients.jedis.commands.ProtocolCommand p0)`
- `public redis.clients.jedis.CommandObject dbSize()`
- `public redis.clients.jedis.CommandObject ftAggregate(java.lang.String p0, redis.clients.jedis.search.aggr.AggregationBuilder p1)`
- `public redis.clients.jedis.CommandObject ftAliasAdd(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.CommandObject ftAliasDel(java.lang.String p0)`
- `public redis.clients.jedis.CommandObject ftAliasUpdate(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject ftAlter(java.lang.String p0, redis.clients.jedis.search.Schema p1)`
- `public redis.clients.jedis.CommandObject ftConfigGet(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.CommandObject ftConfigSet(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject ftCreate(java.lang.String p0, redis.clients.jedis.search.IndexOptions p1, redis.clients.jedis.search.Schema p2)`
- `public redis.clients.jedis.CommandObject ftCursorDel(java.lang.String p0, long p1)`
- `public redis.clients.jedis.CommandObject ftCursorRead(java.lang.String p0, long p1, int p2)`
- `public redis.clients.jedis.CommandObject ftDropIndex(java.lang.String p0)`
- `public redis.clients.jedis.CommandObject ftDropIndexDD(java.lang.String p0)`
- `public redis.clients.jedis.CommandObject ftExplain(java.lang.String p0, redis.clients.jedis.search.Query p1)`
- `public redis.clients.jedis.CommandObject ftExplainCLI(java.lang.String p0, redis.clients.jedis.search.Query p1)`
- `public redis.clients.jedis.CommandObject ftInfo(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject ftSearch(byte[] p0, redis.clients.jedis.search.Query p1)`
- `public final redis.clients.jedis.CommandObject ftSearch(java.lang.String p0, redis.clients.jedis.search.Query p1)`
- `public redis.clients.jedis.CommandObject ftSynDump(java.lang.String p0)`
- `public redis.clients.jedis.CommandObject ftSynUpdate(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public redis.clients.jedis.CommandObject ftTagVals(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject keys(byte[] p0)`
- `public final redis.clients.jedis.CommandObject keys(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject scan(byte[] p0)`
- `public final redis.clients.jedis.CommandObject scan(byte[] p0, redis.clients.jedis.params.ScanParams p1)`
- `public final redis.clients.jedis.CommandObject scan(byte[] p0, redis.clients.jedis.params.ScanParams p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject scan(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject scan(java.lang.String p0, redis.clients.jedis.params.ScanParams p1)`
- `public final redis.clients.jedis.CommandObject scan(java.lang.String p0, redis.clients.jedis.params.ScanParams p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject waitReplicas(int p0, long p1)`

---

## public class `redis.clients.jedis.ClusterPipeline`
extends `redis.clients.jedis.MultiNodePipelineBase`  

**Constructors:**
- `public ClusterPipeline(java.util.Set p0, redis.clients.jedis.JedisClientConfig p1)`
- `public ClusterPipeline(java.util.Set p0, redis.clients.jedis.JedisClientConfig p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2)`
- `public ClusterPipeline(redis.clients.jedis.providers.ClusterConnectionProvider p0)`

**Methods:**
- `public void close()`
- `protected redis.clients.jedis.Connection getConnection(redis.clients.jedis.HostAndPort p0)`
- `protected redis.clients.jedis.HostAndPort getNodeKey(redis.clients.jedis.CommandArguments p0)`
- `public void prepareGraphCommands()`

---

## public class `redis.clients.jedis.CommandArguments`
implements `java.lang.Iterable<redis.clients.jedis.args.Rawable>`  

**Constructors:**
- `public CommandArguments(redis.clients.jedis.commands.ProtocolCommand p0)`

**Methods:**
- `public redis.clients.jedis.CommandArguments add(java.lang.Object p0)`
- `public redis.clients.jedis.CommandArguments addObjects(int[] p0)`
- `public redis.clients.jedis.CommandArguments addObjects(java.lang.Object... p0)`
- `public redis.clients.jedis.CommandArguments addObjects(java.util.Collection p0)`
- `public final redis.clients.jedis.CommandArguments addParams(redis.clients.jedis.params.IParams p0)`
- `public redis.clients.jedis.CommandArguments blocking()`
- `public redis.clients.jedis.commands.ProtocolCommand getCommand()`
- `public boolean isBlocking()`
- `public java.util.Iterator iterator()`
- `public redis.clients.jedis.CommandArguments key(java.lang.Object p0)`
- `public final redis.clients.jedis.CommandArguments keys(java.lang.Object... p0)`
- `protected redis.clients.jedis.CommandArguments processKey(byte[] p0)`
- `protected redis.clients.jedis.CommandArguments processKey(java.lang.String p0)`
- `protected final redis.clients.jedis.CommandArguments processKeys(byte[]... p0)`
- `protected final redis.clients.jedis.CommandArguments processKeys(java.lang.String... p0)`
- `public int size()`

---

## public class `redis.clients.jedis.CommandObject`<T extends java.lang.Object>

**Constructors:**
- `public CommandObject(redis.clients.jedis.CommandArguments p0, redis.clients.jedis.Builder p1)`

**Methods:**
- `public redis.clients.jedis.CommandArguments getArguments()`
- `public redis.clients.jedis.Builder getBuilder()`

---

## public class `redis.clients.jedis.CommandObjects`

**Constructors:**
- `public CommandObjects()`

**Methods:**
- `public final redis.clients.jedis.CommandObject append(byte[] p0, byte[] p1)`
- `public final redis.clients.jedis.CommandObject append(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject bfAdd(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject bfExists(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject bfInfo(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject bfInsert(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject bfInsert(java.lang.String p0, redis.clients.jedis.bloom.BFInsertParams p1, java.lang.String... p2)`
- `public final redis.clients.jedis.CommandObject bfLoadChunk(java.lang.String p0, long p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject bfMAdd(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject bfMExists(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject bfReserve(java.lang.String p0, double p1, long p2)`
- `public final redis.clients.jedis.CommandObject bfReserve(java.lang.String p0, double p1, long p2, redis.clients.jedis.bloom.BFReserveParams p3)`
- `public final redis.clients.jedis.CommandObject bfScanDump(java.lang.String p0, long p1)`
- `public final redis.clients.jedis.CommandObject bitcount(byte[] p0)`
- `public final redis.clients.jedis.CommandObject bitcount(byte[] p0, long p1, long p2)`
- `public final redis.clients.jedis.CommandObject bitcount(byte[] p0, long p1, long p2, redis.clients.jedis.args.BitCountOption p3)`
- `public final redis.clients.jedis.CommandObject bitcount(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject bitcount(java.lang.String p0, long p1, long p2)`
- `public final redis.clients.jedis.CommandObject bitcount(java.lang.String p0, long p1, long p2, redis.clients.jedis.args.BitCountOption p3)`
- `public final redis.clients.jedis.CommandObject bitfield(byte[] p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject bitfield(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject bitfieldReadonly(byte[] p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject bitfieldReadonly(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject bitop(redis.clients.jedis.args.BitOP p0, byte[] p1, byte[]... p2)`
- `public final redis.clients.jedis.CommandObject bitop(redis.clients.jedis.args.BitOP p0, java.lang.String p1, java.lang.String... p2)`
- `public final redis.clients.jedis.CommandObject bitpos(byte[] p0, boolean p1)`
- `public final redis.clients.jedis.CommandObject bitpos(byte[] p0, boolean p1, redis.clients.jedis.params.BitPosParams p2)`
- `public final redis.clients.jedis.CommandObject bitpos(java.lang.String p0, boolean p1)`
- `public final redis.clients.jedis.CommandObject bitpos(java.lang.String p0, boolean p1, redis.clients.jedis.params.BitPosParams p2)`
- `public final redis.clients.jedis.CommandObject blmove(byte[] p0, byte[] p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3, double p4)`
- `public final redis.clients.jedis.CommandObject blmove(java.lang.String p0, java.lang.String p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3, double p4)`
- `public final redis.clients.jedis.CommandObject blmpop(long p0, redis.clients.jedis.args.ListDirection p1, byte[]... p2)`
- `public final redis.clients.jedis.CommandObject blmpop(long p0, redis.clients.jedis.args.ListDirection p1, int p2, byte[]... p3)`
- `public final redis.clients.jedis.CommandObject blmpop(long p0, redis.clients.jedis.args.ListDirection p1, int p2, java.lang.String... p3)`
- `public final redis.clients.jedis.CommandObject blmpop(long p0, redis.clients.jedis.args.ListDirection p1, java.lang.String... p2)`
- `public final redis.clients.jedis.CommandObject blpop(double p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject blpop(double p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject blpop(double p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject blpop(int p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject blpop(int p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject blpop(int p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject brpop(double p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject brpop(double p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject brpop(double p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject brpop(int p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject brpop(int p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject brpop(int p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject brpoplpush(byte[] p0, byte[] p1, int p2)`
- `public final redis.clients.jedis.CommandObject brpoplpush(java.lang.String p0, java.lang.String p1, int p2)`
- `public final redis.clients.jedis.CommandObject bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, byte[]... p2)`
- `public final redis.clients.jedis.CommandObject bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, int p2, byte[]... p3)`
- `public final redis.clients.jedis.CommandObject bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, int p2, java.lang.String... p3)`
- `public final redis.clients.jedis.CommandObject bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, java.lang.String... p2)`
- `public final redis.clients.jedis.CommandObject bzpopmax(double p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject bzpopmax(double p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject bzpopmin(double p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject bzpopmin(double p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject cfAdd(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject cfAddNx(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject cfCount(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject cfDel(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject cfExists(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject cfInfo(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject cfInsert(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject cfInsert(java.lang.String p0, redis.clients.jedis.bloom.CFInsertParams p1, java.lang.String... p2)`
- `public final redis.clients.jedis.CommandObject cfInsertNx(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject cfInsertNx(java.lang.String p0, redis.clients.jedis.bloom.CFInsertParams p1, java.lang.String... p2)`
- `public final redis.clients.jedis.CommandObject cfLoadChunk(java.lang.String p0, long p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject cfMExists(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject cfReserve(java.lang.String p0, long p1)`
- `public final redis.clients.jedis.CommandObject cfReserve(java.lang.String p0, long p1, redis.clients.jedis.bloom.CFReserveParams p2)`
- `public final redis.clients.jedis.CommandObject cfScanDump(java.lang.String p0, long p1)`
- `public final redis.clients.jedis.CommandObject cmsIncrBy(java.lang.String p0, java.util.Map p1)`
- `public final redis.clients.jedis.CommandObject cmsInfo(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject cmsInitByDim(java.lang.String p0, long p1, long p2)`
- `public final redis.clients.jedis.CommandObject cmsInitByProb(java.lang.String p0, double p1, double p2)`
- `public final redis.clients.jedis.CommandObject cmsMerge(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject cmsMerge(java.lang.String p0, java.util.Map p1)`
- `public final redis.clients.jedis.CommandObject cmsQuery(java.lang.String p0, java.lang.String... p1)`
- `protected redis.clients.jedis.CommandArguments commandArguments(redis.clients.jedis.commands.ProtocolCommand p0)`
- `public final redis.clients.jedis.CommandObject copy(byte[] p0, byte[] p1, boolean p2)`
- `public final redis.clients.jedis.CommandObject copy(byte[] p0, byte[] p1, int p2, boolean p3)`
- `public final redis.clients.jedis.CommandObject copy(java.lang.String p0, java.lang.String p1, boolean p2)`
- `public final redis.clients.jedis.CommandObject copy(java.lang.String p0, java.lang.String p1, int p2, boolean p3)`
- `public redis.clients.jedis.CommandObject dbSize()`
- `public final redis.clients.jedis.CommandObject decr(byte[] p0)`
- `public final redis.clients.jedis.CommandObject decr(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject decrBy(byte[] p0, long p1)`
- `public final redis.clients.jedis.CommandObject decrBy(java.lang.String p0, long p1)`
- `public final redis.clients.jedis.CommandObject del(byte[] p0)`
- `public final redis.clients.jedis.CommandObject del(byte[]... p0)`
- `public final redis.clients.jedis.CommandObject del(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject del(java.lang.String... p0)`
- `public final redis.clients.jedis.CommandObject dump(byte[] p0)`
- `public final redis.clients.jedis.CommandObject dump(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject eval(byte[] p0)`
- `public final redis.clients.jedis.CommandObject eval(byte[] p0, byte[] p1)`
- `public final redis.clients.jedis.CommandObject eval(byte[] p0, int p1, byte[]... p2)`
- `public final redis.clients.jedis.CommandObject eval(byte[] p0, java.util.List p1, java.util.List p2)`
- `public final redis.clients.jedis.CommandObject eval(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject eval(java.lang.String p0, int p1, java.lang.String... p2)`
- `public final redis.clients.jedis.CommandObject eval(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject eval(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public final redis.clients.jedis.CommandObject evalReadonly(byte[] p0, java.util.List p1, java.util.List p2)`
- `public final redis.clients.jedis.CommandObject evalReadonly(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public final redis.clients.jedis.CommandObject evalsha(byte[] p0)`
- `public final redis.clients.jedis.CommandObject evalsha(byte[] p0, byte[] p1)`
- `public final redis.clients.jedis.CommandObject evalsha(byte[] p0, int p1, byte[]... p2)`
- `public final redis.clients.jedis.CommandObject evalsha(byte[] p0, java.util.List p1, java.util.List p2)`
- `public final redis.clients.jedis.CommandObject evalsha(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject evalsha(java.lang.String p0, int p1, java.lang.String... p2)`
- `public final redis.clients.jedis.CommandObject evalsha(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject evalsha(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public final redis.clients.jedis.CommandObject evalshaReadonly(byte[] p0, java.util.List p1, java.util.List p2)`
- `public final redis.clients.jedis.CommandObject evalshaReadonly(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public final redis.clients.jedis.CommandObject exists(byte[] p0)`
- `public final redis.clients.jedis.CommandObject exists(byte[]... p0)`
- `public final redis.clients.jedis.CommandObject exists(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject exists(java.lang.String... p0)`
- `public final redis.clients.jedis.CommandObject expire(byte[] p0, long p1)`
- `public final redis.clients.jedis.CommandObject expire(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public final redis.clients.jedis.CommandObject expire(java.lang.String p0, long p1)`
- `public final redis.clients.jedis.CommandObject expire(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public final redis.clients.jedis.CommandObject expireAt(byte[] p0, long p1)`
- `public final redis.clients.jedis.CommandObject expireAt(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public final redis.clients.jedis.CommandObject expireAt(java.lang.String p0, long p1)`
- `public final redis.clients.jedis.CommandObject expireAt(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public final redis.clients.jedis.CommandObject expireTime(byte[] p0)`
- `public final redis.clients.jedis.CommandObject expireTime(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject fcall(byte[] p0, java.util.List p1, java.util.List p2)`
- `public final redis.clients.jedis.CommandObject fcall(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public final redis.clients.jedis.CommandObject fcallReadonly(byte[] p0, java.util.List p1, java.util.List p2)`
- `public final redis.clients.jedis.CommandObject fcallReadonly(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.CommandObject ftAggregate(java.lang.String p0, redis.clients.jedis.search.aggr.AggregationBuilder p1)`
- `public redis.clients.jedis.CommandObject ftAliasAdd(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.CommandObject ftAliasDel(java.lang.String p0)`
- `public redis.clients.jedis.CommandObject ftAliasUpdate(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.CommandObject ftAlter(java.lang.String p0, java.lang.Iterable p1)`
- `public redis.clients.jedis.CommandObject ftAlter(java.lang.String p0, redis.clients.jedis.search.Schema p1)`
- `public final redis.clients.jedis.CommandObject ftConfigGet(java.lang.String p0)`
- `public redis.clients.jedis.CommandObject ftConfigGet(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject ftConfigSet(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.CommandObject ftConfigSet(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.CommandObject ftCreate(java.lang.String p0, redis.clients.jedis.search.FTCreateParams p1, java.lang.Iterable p2)`
- `public redis.clients.jedis.CommandObject ftCreate(java.lang.String p0, redis.clients.jedis.search.IndexOptions p1, redis.clients.jedis.search.Schema p2)`
- `public redis.clients.jedis.CommandObject ftCursorDel(java.lang.String p0, long p1)`
- `public redis.clients.jedis.CommandObject ftCursorRead(java.lang.String p0, long p1, int p2)`
- `public final redis.clients.jedis.CommandObject ftDictAdd(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject ftDictAddBySampleKey(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public final redis.clients.jedis.CommandObject ftDictDel(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject ftDictDelBySampleKey(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public final redis.clients.jedis.CommandObject ftDictDump(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject ftDictDumpBySampleKey(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.CommandObject ftDropIndex(java.lang.String p0)`
- `public redis.clients.jedis.CommandObject ftDropIndexDD(java.lang.String p0)`
- `public redis.clients.jedis.CommandObject ftExplain(java.lang.String p0, redis.clients.jedis.search.Query p1)`
- `public redis.clients.jedis.CommandObject ftExplainCLI(java.lang.String p0, redis.clients.jedis.search.Query p1)`
- `public redis.clients.jedis.CommandObject ftInfo(java.lang.String p0)`
- `public redis.clients.jedis.CommandObject ftSearch(byte[] p0, redis.clients.jedis.search.Query p1)`
- `public redis.clients.jedis.CommandObject ftSearch(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.CommandObject ftSearch(java.lang.String p0, java.lang.String p1, redis.clients.jedis.search.FTSearchParams p2)`
- `public redis.clients.jedis.CommandObject ftSearch(java.lang.String p0, redis.clients.jedis.search.Query p1)`
- `public final redis.clients.jedis.CommandObject ftSugAdd(java.lang.String p0, java.lang.String p1, double p2)`
- `public final redis.clients.jedis.CommandObject ftSugAddIncr(java.lang.String p0, java.lang.String p1, double p2)`
- `public final redis.clients.jedis.CommandObject ftSugDel(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject ftSugGet(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject ftSugGet(java.lang.String p0, java.lang.String p1, boolean p2, int p3)`
- `public final redis.clients.jedis.CommandObject ftSugGetWithScores(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject ftSugGetWithScores(java.lang.String p0, java.lang.String p1, boolean p2, int p3)`
- `public final redis.clients.jedis.CommandObject ftSugLen(java.lang.String p0)`
- `public redis.clients.jedis.CommandObject ftSynDump(java.lang.String p0)`
- `public redis.clients.jedis.CommandObject ftSynUpdate(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public redis.clients.jedis.CommandObject ftTagVals(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject functionDelete(byte[] p0)`
- `public final redis.clients.jedis.CommandObject functionDelete(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject functionDump()`
- `public final redis.clients.jedis.CommandObject functionFlush()`
- `public final redis.clients.jedis.CommandObject functionFlush(redis.clients.jedis.args.FlushMode p0)`
- `public final redis.clients.jedis.CommandObject functionKill()`
- `public final redis.clients.jedis.CommandObject functionList()`
- `public final redis.clients.jedis.CommandObject functionList(byte[] p0)`
- `public final redis.clients.jedis.CommandObject functionList(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject functionListBinary()`
- `public final redis.clients.jedis.CommandObject functionListWithCode()`
- `public final redis.clients.jedis.CommandObject functionListWithCode(byte[] p0)`
- `public final redis.clients.jedis.CommandObject functionListWithCode(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject functionListWithCodeBinary()`
- `public final redis.clients.jedis.CommandObject functionLoad(byte[] p0)`
- `public final redis.clients.jedis.CommandObject functionLoad(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject functionLoadReplace(byte[] p0)`
- `public final redis.clients.jedis.CommandObject functionLoadReplace(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject functionRestore(byte[] p0)`
- `public final redis.clients.jedis.CommandObject functionRestore(byte[] p0, redis.clients.jedis.args.FunctionRestorePolicy p1)`
- `public final redis.clients.jedis.CommandObject functionStats()`
- `public final redis.clients.jedis.CommandObject functionStatsBinary()`
- `public final redis.clients.jedis.CommandObject geoadd(byte[] p0, double p1, double p2, byte[] p3)`
- `public final redis.clients.jedis.CommandObject geoadd(byte[] p0, java.util.Map p1)`
- `public final redis.clients.jedis.CommandObject geoadd(byte[] p0, redis.clients.jedis.params.GeoAddParams p1, java.util.Map p2)`
- `public final redis.clients.jedis.CommandObject geoadd(java.lang.String p0, double p1, double p2, java.lang.String p3)`
- `public final redis.clients.jedis.CommandObject geoadd(java.lang.String p0, java.util.Map p1)`
- `public final redis.clients.jedis.CommandObject geoadd(java.lang.String p0, redis.clients.jedis.params.GeoAddParams p1, java.util.Map p2)`
- `public final redis.clients.jedis.CommandObject geodist(byte[] p0, byte[] p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject geodist(byte[] p0, byte[] p1, byte[] p2, redis.clients.jedis.args.GeoUnit p3)`
- `public final redis.clients.jedis.CommandObject geodist(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject geodist(java.lang.String p0, java.lang.String p1, java.lang.String p2, redis.clients.jedis.args.GeoUnit p3)`
- `public final redis.clients.jedis.CommandObject geohash(byte[] p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject geohash(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject geopos(byte[] p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject geopos(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject georadius(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public final redis.clients.jedis.CommandObject georadius(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public final redis.clients.jedis.CommandObject georadius(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public final redis.clients.jedis.CommandObject georadius(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public final redis.clients.jedis.CommandObject georadiusByMember(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public final redis.clients.jedis.CommandObject georadiusByMember(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public final redis.clients.jedis.CommandObject georadiusByMember(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public final redis.clients.jedis.CommandObject georadiusByMember(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public final redis.clients.jedis.CommandObject georadiusByMemberReadonly(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public final redis.clients.jedis.CommandObject georadiusByMemberReadonly(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public final redis.clients.jedis.CommandObject georadiusByMemberReadonly(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public final redis.clients.jedis.CommandObject georadiusByMemberReadonly(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public final redis.clients.jedis.CommandObject georadiusByMemberStore(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4, redis.clients.jedis.params.GeoRadiusStoreParam p5)`
- `public final redis.clients.jedis.CommandObject georadiusByMemberStore(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4, redis.clients.jedis.params.GeoRadiusStoreParam p5)`
- `public final redis.clients.jedis.CommandObject georadiusReadonly(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public final redis.clients.jedis.CommandObject georadiusReadonly(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public final redis.clients.jedis.CommandObject georadiusReadonly(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public final redis.clients.jedis.CommandObject georadiusReadonly(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public final redis.clients.jedis.CommandObject georadiusStore(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5, redis.clients.jedis.params.GeoRadiusStoreParam p6)`
- `public final redis.clients.jedis.CommandObject georadiusStore(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5, redis.clients.jedis.params.GeoRadiusStoreParam p6)`
- `public final redis.clients.jedis.CommandObject geosearch(byte[] p0, byte[] p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public final redis.clients.jedis.CommandObject geosearch(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public final redis.clients.jedis.CommandObject geosearch(byte[] p0, redis.clients.jedis.GeoCoordinate p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public final redis.clients.jedis.CommandObject geosearch(byte[] p0, redis.clients.jedis.GeoCoordinate p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public final redis.clients.jedis.CommandObject geosearch(byte[] p0, redis.clients.jedis.params.GeoSearchParam p1)`
- `public final redis.clients.jedis.CommandObject geosearch(java.lang.String p0, java.lang.String p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public final redis.clients.jedis.CommandObject geosearch(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public final redis.clients.jedis.CommandObject geosearch(java.lang.String p0, redis.clients.jedis.GeoCoordinate p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public final redis.clients.jedis.CommandObject geosearch(java.lang.String p0, redis.clients.jedis.GeoCoordinate p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public final redis.clients.jedis.CommandObject geosearch(java.lang.String p0, redis.clients.jedis.params.GeoSearchParam p1)`
- `public final redis.clients.jedis.CommandObject geosearchStore(byte[] p0, byte[] p1, byte[] p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public final redis.clients.jedis.CommandObject geosearchStore(byte[] p0, byte[] p1, byte[] p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public final redis.clients.jedis.CommandObject geosearchStore(byte[] p0, byte[] p1, redis.clients.jedis.GeoCoordinate p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public final redis.clients.jedis.CommandObject geosearchStore(byte[] p0, byte[] p1, redis.clients.jedis.GeoCoordinate p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public final redis.clients.jedis.CommandObject geosearchStore(byte[] p0, byte[] p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public final redis.clients.jedis.CommandObject geosearchStore(java.lang.String p0, java.lang.String p1, java.lang.String p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public final redis.clients.jedis.CommandObject geosearchStore(java.lang.String p0, java.lang.String p1, java.lang.String p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public final redis.clients.jedis.CommandObject geosearchStore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.GeoCoordinate p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public final redis.clients.jedis.CommandObject geosearchStore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.GeoCoordinate p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public final redis.clients.jedis.CommandObject geosearchStore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public final redis.clients.jedis.CommandObject geosearchStoreStoreDist(byte[] p0, byte[] p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public final redis.clients.jedis.CommandObject geosearchStoreStoreDist(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public final redis.clients.jedis.CommandObject get(byte[] p0)`
- `public final redis.clients.jedis.CommandObject get(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject getDel(byte[] p0)`
- `public final redis.clients.jedis.CommandObject getDel(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject getEx(byte[] p0, redis.clients.jedis.params.GetExParams p1)`
- `public final redis.clients.jedis.CommandObject getEx(java.lang.String p0, redis.clients.jedis.params.GetExParams p1)`
- `public final redis.clients.jedis.CommandObject getSet(byte[] p0, byte[] p1)`
- `public final redis.clients.jedis.CommandObject getSet(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject getbit(byte[] p0, long p1)`
- `public final redis.clients.jedis.CommandObject getbit(java.lang.String p0, long p1)`
- `public final redis.clients.jedis.CommandObject getrange(byte[] p0, long p1, long p2)`
- `public final redis.clients.jedis.CommandObject getrange(java.lang.String p0, long p1, long p2)`
- `public final redis.clients.jedis.CommandObject graphConfigGet(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject graphConfigSet(java.lang.String p0, java.lang.Object p1)`
- `public final redis.clients.jedis.CommandObject graphExplain(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject graphList()`
- `public final redis.clients.jedis.CommandObject graphProfile(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject graphSlowlog(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject hdel(byte[] p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject hdel(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject hexists(byte[] p0, byte[] p1)`
- `public final redis.clients.jedis.CommandObject hexists(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject hget(byte[] p0, byte[] p1)`
- `public final redis.clients.jedis.CommandObject hget(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject hgetAll(byte[] p0)`
- `public final redis.clients.jedis.CommandObject hgetAll(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject hincrBy(byte[] p0, byte[] p1, long p2)`
- `public final redis.clients.jedis.CommandObject hincrBy(java.lang.String p0, java.lang.String p1, long p2)`
- `public final redis.clients.jedis.CommandObject hincrByFloat(byte[] p0, byte[] p1, double p2)`
- `public final redis.clients.jedis.CommandObject hincrByFloat(java.lang.String p0, java.lang.String p1, double p2)`
- `public final redis.clients.jedis.CommandObject hkeys(byte[] p0)`
- `public final redis.clients.jedis.CommandObject hkeys(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject hlen(byte[] p0)`
- `public final redis.clients.jedis.CommandObject hlen(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject hmget(byte[] p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject hmget(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject hmset(byte[] p0, java.util.Map p1)`
- `public final redis.clients.jedis.CommandObject hmset(java.lang.String p0, java.util.Map p1)`
- `public final redis.clients.jedis.CommandObject hrandfield(byte[] p0)`
- `public final redis.clients.jedis.CommandObject hrandfield(byte[] p0, long p1)`
- `public final redis.clients.jedis.CommandObject hrandfield(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject hrandfield(java.lang.String p0, long p1)`
- `public final redis.clients.jedis.CommandObject hrandfieldWithValues(byte[] p0, long p1)`
- `public final redis.clients.jedis.CommandObject hrandfieldWithValues(java.lang.String p0, long p1)`
- `public final redis.clients.jedis.CommandObject hscan(byte[] p0, byte[] p1, redis.clients.jedis.params.ScanParams p2)`
- `public final redis.clients.jedis.CommandObject hscan(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ScanParams p2)`
- `public final redis.clients.jedis.CommandObject hset(byte[] p0, byte[] p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject hset(byte[] p0, java.util.Map p1)`
- `public final redis.clients.jedis.CommandObject hset(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject hset(java.lang.String p0, java.util.Map p1)`
- `public final redis.clients.jedis.CommandObject hsetnx(byte[] p0, byte[] p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject hsetnx(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject hstrlen(byte[] p0, byte[] p1)`
- `public final redis.clients.jedis.CommandObject hstrlen(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject hvals(byte[] p0)`
- `public final redis.clients.jedis.CommandObject hvals(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject incr(byte[] p0)`
- `public final redis.clients.jedis.CommandObject incr(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject incrBy(byte[] p0, long p1)`
- `public final redis.clients.jedis.CommandObject incrBy(java.lang.String p0, long p1)`
- `public final redis.clients.jedis.CommandObject incrByFloat(byte[] p0, double p1)`
- `public final redis.clients.jedis.CommandObject incrByFloat(java.lang.String p0, double p1)`
- `public final redis.clients.jedis.CommandObject jsonArrAppend(java.lang.String p0, java.lang.String p1, org.json.JSONObject... p2)`
- `public final redis.clients.jedis.CommandObject jsonArrAppend(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object... p2)`
- `public final redis.clients.jedis.CommandObject jsonArrAppend(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object... p2)`
- `public final redis.clients.jedis.CommandObject jsonArrAppendWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object... p2)`
- `public final redis.clients.jedis.CommandObject jsonArrIndex(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2)`
- `public final redis.clients.jedis.CommandObject jsonArrIndex(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public final redis.clients.jedis.CommandObject jsonArrIndexWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public final redis.clients.jedis.CommandObject jsonArrInsert(java.lang.String p0, redis.clients.jedis.json.Path p1, int p2, java.lang.Object... p3)`
- `public final redis.clients.jedis.CommandObject jsonArrInsert(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2, java.lang.Object... p3)`
- `public final redis.clients.jedis.CommandObject jsonArrInsertWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2, java.lang.Object... p3)`
- `public final redis.clients.jedis.CommandObject jsonArrLen(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject jsonArrLen(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public final redis.clients.jedis.CommandObject jsonArrLen(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public final redis.clients.jedis.CommandObject jsonArrPop(java.lang.String p0)`
- `public final <T extends java.lang.Object> redis.clients.jedis.CommandObject jsonArrPop(java.lang.String p0, java.lang.Class p1)`
- `public final <T extends java.lang.Object> redis.clients.jedis.CommandObject jsonArrPop(java.lang.String p0, java.lang.Class p1, redis.clients.jedis.json.Path p2)`
- `public final <T extends java.lang.Object> redis.clients.jedis.CommandObject jsonArrPop(java.lang.String p0, java.lang.Class p1, redis.clients.jedis.json.Path p2, int p3)`
- `public final redis.clients.jedis.CommandObject jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public final redis.clients.jedis.CommandObject jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path p1, int p2)`
- `public final redis.clients.jedis.CommandObject jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public final redis.clients.jedis.CommandObject jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2)`
- `public final redis.clients.jedis.CommandObject jsonArrTrim(java.lang.String p0, redis.clients.jedis.json.Path p1, int p2, int p3)`
- `public final redis.clients.jedis.CommandObject jsonArrTrim(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2, int p3)`
- `public final redis.clients.jedis.CommandObject jsonClear(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject jsonClear(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public final redis.clients.jedis.CommandObject jsonClear(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public final redis.clients.jedis.CommandObject jsonDebugMemory(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject jsonDebugMemory(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public final redis.clients.jedis.CommandObject jsonDebugMemory(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public final redis.clients.jedis.CommandObject jsonDel(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject jsonDel(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public final redis.clients.jedis.CommandObject jsonDel(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public final redis.clients.jedis.CommandObject jsonGet(java.lang.String p0)`
- `public final <T extends java.lang.Object> redis.clients.jedis.CommandObject jsonGet(java.lang.String p0, java.lang.Class p1)`
- `public final <T extends java.lang.Object> redis.clients.jedis.CommandObject jsonGet(java.lang.String p0, java.lang.Class p1, redis.clients.jedis.json.Path... p2)`
- `public final redis.clients.jedis.CommandObject jsonGet(java.lang.String p0, redis.clients.jedis.json.Path2... p1)`
- `public final redis.clients.jedis.CommandObject jsonGet(java.lang.String p0, redis.clients.jedis.json.Path... p1)`
- `public final redis.clients.jedis.CommandObject jsonGetAsPlainString(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public final <T extends java.lang.Object> redis.clients.jedis.CommandObject jsonMGet(redis.clients.jedis.json.Path p0, java.lang.Class p1, java.lang.String... p2)`
- `public final redis.clients.jedis.CommandObject jsonMGet(redis.clients.jedis.json.Path2 p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject jsonNumIncrBy(java.lang.String p0, redis.clients.jedis.json.Path p1, double p2)`
- `public final redis.clients.jedis.CommandObject jsonNumIncrBy(java.lang.String p0, redis.clients.jedis.json.Path2 p1, double p2)`
- `public final redis.clients.jedis.CommandObject jsonObjKeys(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject jsonObjKeys(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public final redis.clients.jedis.CommandObject jsonObjKeys(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public final redis.clients.jedis.CommandObject jsonObjLen(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject jsonObjLen(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public final redis.clients.jedis.CommandObject jsonObjLen(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public final redis.clients.jedis.CommandObject jsonResp(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject jsonResp(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public final redis.clients.jedis.CommandObject jsonResp(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public final redis.clients.jedis.CommandObject jsonSet(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2)`
- `public final redis.clients.jedis.CommandObject jsonSet(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2, redis.clients.jedis.json.JsonSetParams p3)`
- `public final redis.clients.jedis.CommandObject jsonSet(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public final redis.clients.jedis.CommandObject jsonSet(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2, redis.clients.jedis.json.JsonSetParams p3)`
- `public final redis.clients.jedis.CommandObject jsonSetWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public final redis.clients.jedis.CommandObject jsonSetWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2, redis.clients.jedis.json.JsonSetParams p3)`
- `public final redis.clients.jedis.CommandObject jsonSetWithPlainString(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject jsonStrAppend(java.lang.String p0, java.lang.Object p1)`
- `public final redis.clients.jedis.CommandObject jsonStrAppend(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2)`
- `public final redis.clients.jedis.CommandObject jsonStrAppend(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public final redis.clients.jedis.CommandObject jsonStrLen(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject jsonStrLen(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public final redis.clients.jedis.CommandObject jsonStrLen(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public final redis.clients.jedis.CommandObject jsonToggle(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public final redis.clients.jedis.CommandObject jsonToggle(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public final redis.clients.jedis.CommandObject jsonType(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject jsonType(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public final redis.clients.jedis.CommandObject jsonType(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public redis.clients.jedis.CommandObject keys(byte[] p0)`
- `public redis.clients.jedis.CommandObject keys(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject lcs(byte[] p0, byte[] p1, redis.clients.jedis.params.LCSParams p2)`
- `public final redis.clients.jedis.CommandObject lcs(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.LCSParams p2)`
- `public final redis.clients.jedis.CommandObject lindex(byte[] p0, long p1)`
- `public final redis.clients.jedis.CommandObject lindex(java.lang.String p0, long p1)`
- `public final redis.clients.jedis.CommandObject linsert(byte[] p0, redis.clients.jedis.args.ListPosition p1, byte[] p2, byte[] p3)`
- `public final redis.clients.jedis.CommandObject linsert(java.lang.String p0, redis.clients.jedis.args.ListPosition p1, java.lang.String p2, java.lang.String p3)`
- `public final redis.clients.jedis.CommandObject llen(byte[] p0)`
- `public final redis.clients.jedis.CommandObject llen(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject lmove(byte[] p0, byte[] p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3)`
- `public final redis.clients.jedis.CommandObject lmove(java.lang.String p0, java.lang.String p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3)`
- `public final redis.clients.jedis.CommandObject lmpop(redis.clients.jedis.args.ListDirection p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject lmpop(redis.clients.jedis.args.ListDirection p0, int p1, byte[]... p2)`
- `public final redis.clients.jedis.CommandObject lmpop(redis.clients.jedis.args.ListDirection p0, int p1, java.lang.String... p2)`
- `public final redis.clients.jedis.CommandObject lmpop(redis.clients.jedis.args.ListDirection p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject lpop(byte[] p0)`
- `public final redis.clients.jedis.CommandObject lpop(byte[] p0, int p1)`
- `public final redis.clients.jedis.CommandObject lpop(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject lpop(java.lang.String p0, int p1)`
- `public final redis.clients.jedis.CommandObject lpos(byte[] p0, byte[] p1)`
- `public final redis.clients.jedis.CommandObject lpos(byte[] p0, byte[] p1, redis.clients.jedis.params.LPosParams p2)`
- `public final redis.clients.jedis.CommandObject lpos(byte[] p0, byte[] p1, redis.clients.jedis.params.LPosParams p2, long p3)`
- `public final redis.clients.jedis.CommandObject lpos(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject lpos(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.LPosParams p2)`
- `public final redis.clients.jedis.CommandObject lpos(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.LPosParams p2, long p3)`
- `public final redis.clients.jedis.CommandObject lpush(byte[] p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject lpush(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject lpushx(byte[] p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject lpushx(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject lrange(byte[] p0, long p1, long p2)`
- `public final redis.clients.jedis.CommandObject lrange(java.lang.String p0, long p1, long p2)`
- `public final redis.clients.jedis.CommandObject lrem(byte[] p0, long p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject lrem(java.lang.String p0, long p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject lset(byte[] p0, long p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject lset(java.lang.String p0, long p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject ltrim(byte[] p0, long p1, long p2)`
- `public final redis.clients.jedis.CommandObject ltrim(java.lang.String p0, long p1, long p2)`
- `public final redis.clients.jedis.CommandObject memoryUsage(byte[] p0)`
- `public final redis.clients.jedis.CommandObject memoryUsage(byte[] p0, int p1)`
- `public final redis.clients.jedis.CommandObject memoryUsage(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject memoryUsage(java.lang.String p0, int p1)`
- `public final redis.clients.jedis.CommandObject mget(byte[]... p0)`
- `public final redis.clients.jedis.CommandObject mget(java.lang.String... p0)`
- `public final redis.clients.jedis.CommandObject migrate(java.lang.String p0, int p1, byte[] p2, int p3)`
- `public final redis.clients.jedis.CommandObject migrate(java.lang.String p0, int p1, byte[] p2, int p3, int p4)`
- `public final redis.clients.jedis.CommandObject migrate(java.lang.String p0, int p1, int p2, int p3, redis.clients.jedis.params.MigrateParams p4, byte[]... p5)`
- `public final redis.clients.jedis.CommandObject migrate(java.lang.String p0, int p1, int p2, int p3, redis.clients.jedis.params.MigrateParams p4, java.lang.String... p5)`
- `public final redis.clients.jedis.CommandObject migrate(java.lang.String p0, int p1, int p2, redis.clients.jedis.params.MigrateParams p3, byte[]... p4)`
- `public final redis.clients.jedis.CommandObject migrate(java.lang.String p0, int p1, int p2, redis.clients.jedis.params.MigrateParams p3, java.lang.String... p4)`
- `public final redis.clients.jedis.CommandObject migrate(java.lang.String p0, int p1, java.lang.String p2, int p3)`
- `public final redis.clients.jedis.CommandObject migrate(java.lang.String p0, int p1, java.lang.String p2, int p3, int p4)`
- `public final redis.clients.jedis.CommandObject mset(byte[]... p0)`
- `public final redis.clients.jedis.CommandObject mset(java.lang.String... p0)`
- `public final redis.clients.jedis.CommandObject msetnx(byte[]... p0)`
- `public final redis.clients.jedis.CommandObject msetnx(java.lang.String... p0)`
- `public final redis.clients.jedis.CommandObject objectEncoding(byte[] p0)`
- `public final redis.clients.jedis.CommandObject objectEncoding(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject objectFreq(byte[] p0)`
- `public final redis.clients.jedis.CommandObject objectFreq(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject objectIdletime(byte[] p0)`
- `public final redis.clients.jedis.CommandObject objectIdletime(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject objectRefcount(byte[] p0)`
- `public final redis.clients.jedis.CommandObject objectRefcount(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject persist(byte[] p0)`
- `public final redis.clients.jedis.CommandObject persist(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject pexpire(byte[] p0, long p1)`
- `public final redis.clients.jedis.CommandObject pexpire(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public final redis.clients.jedis.CommandObject pexpire(java.lang.String p0, long p1)`
- `public final redis.clients.jedis.CommandObject pexpire(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public final redis.clients.jedis.CommandObject pexpireAt(byte[] p0, long p1)`
- `public final redis.clients.jedis.CommandObject pexpireAt(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public final redis.clients.jedis.CommandObject pexpireAt(java.lang.String p0, long p1)`
- `public final redis.clients.jedis.CommandObject pexpireAt(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public final redis.clients.jedis.CommandObject pexpireTime(byte[] p0)`
- `public final redis.clients.jedis.CommandObject pexpireTime(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject pfadd(byte[] p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject pfadd(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject pfcount(byte[] p0)`
- `public final redis.clients.jedis.CommandObject pfcount(byte[]... p0)`
- `public final redis.clients.jedis.CommandObject pfcount(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject pfcount(java.lang.String... p0)`
- `public final redis.clients.jedis.CommandObject pfmerge(byte[] p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject pfmerge(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject psetex(byte[] p0, long p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject psetex(java.lang.String p0, long p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject pttl(byte[] p0)`
- `public final redis.clients.jedis.CommandObject pttl(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject publish(byte[] p0, byte[] p1)`
- `public final redis.clients.jedis.CommandObject publish(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject randomBinaryKey()`
- `public final redis.clients.jedis.CommandObject randomKey()`
- `public final redis.clients.jedis.CommandObject rename(byte[] p0, byte[] p1)`
- `public final redis.clients.jedis.CommandObject rename(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject renamenx(byte[] p0, byte[] p1)`
- `public final redis.clients.jedis.CommandObject renamenx(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject restore(byte[] p0, long p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject restore(byte[] p0, long p1, byte[] p2, redis.clients.jedis.params.RestoreParams p3)`
- `public final redis.clients.jedis.CommandObject restore(java.lang.String p0, long p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject restore(java.lang.String p0, long p1, byte[] p2, redis.clients.jedis.params.RestoreParams p3)`
- `public final redis.clients.jedis.CommandObject rpop(byte[] p0)`
- `public final redis.clients.jedis.CommandObject rpop(byte[] p0, int p1)`
- `public final redis.clients.jedis.CommandObject rpop(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject rpop(java.lang.String p0, int p1)`
- `public final redis.clients.jedis.CommandObject rpoplpush(byte[] p0, byte[] p1)`
- `public final redis.clients.jedis.CommandObject rpoplpush(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject rpush(byte[] p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject rpush(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject rpushx(byte[] p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject rpushx(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject sadd(byte[] p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject sadd(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.CommandObject scan(byte[] p0)`
- `public redis.clients.jedis.CommandObject scan(byte[] p0, redis.clients.jedis.params.ScanParams p1)`
- `public redis.clients.jedis.CommandObject scan(byte[] p0, redis.clients.jedis.params.ScanParams p1, byte[] p2)`
- `public redis.clients.jedis.CommandObject scan(java.lang.String p0)`
- `public redis.clients.jedis.CommandObject scan(java.lang.String p0, redis.clients.jedis.params.ScanParams p1)`
- `public redis.clients.jedis.CommandObject scan(java.lang.String p0, redis.clients.jedis.params.ScanParams p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject scard(byte[] p0)`
- `public final redis.clients.jedis.CommandObject scard(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject scriptExists(byte[] p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject scriptExists(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject scriptFlush(byte[] p0)`
- `public final redis.clients.jedis.CommandObject scriptFlush(byte[] p0, redis.clients.jedis.args.FlushMode p1)`
- `public final redis.clients.jedis.CommandObject scriptFlush(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject scriptFlush(java.lang.String p0, redis.clients.jedis.args.FlushMode p1)`
- `public final redis.clients.jedis.CommandObject scriptKill(byte[] p0)`
- `public final redis.clients.jedis.CommandObject scriptKill(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject scriptLoad(byte[] p0, byte[] p1)`
- `public final redis.clients.jedis.CommandObject scriptLoad(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject sdiff(byte[]... p0)`
- `public final redis.clients.jedis.CommandObject sdiff(java.lang.String... p0)`
- `public final redis.clients.jedis.CommandObject sdiffstore(byte[] p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject sdiffstore(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject set(byte[] p0, byte[] p1)`
- `public final redis.clients.jedis.CommandObject set(byte[] p0, byte[] p1, redis.clients.jedis.params.SetParams p2)`
- `public final redis.clients.jedis.CommandObject set(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject set(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.SetParams p2)`
- `public final redis.clients.jedis.CommandObject setGet(byte[] p0, byte[] p1, redis.clients.jedis.params.SetParams p2)`
- `public final redis.clients.jedis.CommandObject setGet(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.SetParams p2)`
- `public final redis.clients.jedis.CommandObject setbit(byte[] p0, long p1, boolean p2)`
- `public final redis.clients.jedis.CommandObject setbit(java.lang.String p0, long p1, boolean p2)`
- `public final redis.clients.jedis.CommandObject setex(byte[] p0, long p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject setex(java.lang.String p0, long p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject setnx(byte[] p0, byte[] p1)`
- `public final redis.clients.jedis.CommandObject setnx(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject setrange(byte[] p0, long p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject setrange(java.lang.String p0, long p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject sinter(byte[]... p0)`
- `public final redis.clients.jedis.CommandObject sinter(java.lang.String... p0)`
- `public final redis.clients.jedis.CommandObject sintercard(byte[]... p0)`
- `public final redis.clients.jedis.CommandObject sintercard(int p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject sintercard(int p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject sintercard(java.lang.String... p0)`
- `public final redis.clients.jedis.CommandObject sinterstore(byte[] p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject sinterstore(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject sismember(byte[] p0, byte[] p1)`
- `public final redis.clients.jedis.CommandObject sismember(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject smembers(byte[] p0)`
- `public final redis.clients.jedis.CommandObject smembers(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject smismember(byte[] p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject smismember(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject smove(byte[] p0, byte[] p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject smove(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject sort(byte[] p0)`
- `public final redis.clients.jedis.CommandObject sort(byte[] p0, byte[] p1)`
- `public final redis.clients.jedis.CommandObject sort(byte[] p0, redis.clients.jedis.params.SortingParams p1)`
- `public final redis.clients.jedis.CommandObject sort(byte[] p0, redis.clients.jedis.params.SortingParams p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject sort(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject sort(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject sort(java.lang.String p0, redis.clients.jedis.params.SortingParams p1)`
- `public final redis.clients.jedis.CommandObject sort(java.lang.String p0, redis.clients.jedis.params.SortingParams p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject sortReadonly(byte[] p0, redis.clients.jedis.params.SortingParams p1)`
- `public final redis.clients.jedis.CommandObject sortReadonly(java.lang.String p0, redis.clients.jedis.params.SortingParams p1)`
- `public final redis.clients.jedis.CommandObject spop(byte[] p0)`
- `public final redis.clients.jedis.CommandObject spop(byte[] p0, long p1)`
- `public final redis.clients.jedis.CommandObject spop(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject spop(java.lang.String p0, long p1)`
- `public final redis.clients.jedis.CommandObject srandmember(byte[] p0)`
- `public final redis.clients.jedis.CommandObject srandmember(byte[] p0, int p1)`
- `public final redis.clients.jedis.CommandObject srandmember(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject srandmember(java.lang.String p0, int p1)`
- `public final redis.clients.jedis.CommandObject srem(byte[] p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject srem(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject sscan(byte[] p0, byte[] p1, redis.clients.jedis.params.ScanParams p2)`
- `public final redis.clients.jedis.CommandObject sscan(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ScanParams p2)`
- `public final redis.clients.jedis.CommandObject strAlgoLCSKeys(byte[] p0, byte[] p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public final redis.clients.jedis.CommandObject strAlgoLCSKeys(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public final redis.clients.jedis.CommandObject strAlgoLCSStrings(byte[] p0, byte[] p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public final redis.clients.jedis.CommandObject strAlgoLCSStrings(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public final redis.clients.jedis.CommandObject strlen(byte[] p0)`
- `public final redis.clients.jedis.CommandObject strlen(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject substr(byte[] p0, int p1, int p2)`
- `public final redis.clients.jedis.CommandObject substr(java.lang.String p0, int p1, int p2)`
- `public final redis.clients.jedis.CommandObject sunion(byte[]... p0)`
- `public final redis.clients.jedis.CommandObject sunion(java.lang.String... p0)`
- `public final redis.clients.jedis.CommandObject sunionstore(byte[] p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject sunionstore(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject tdigestAdd(java.lang.String p0, double... p1)`
- `public final redis.clients.jedis.CommandObject tdigestByRank(java.lang.String p0, long... p1)`
- `public final redis.clients.jedis.CommandObject tdigestByRevRank(java.lang.String p0, long... p1)`
- `public final redis.clients.jedis.CommandObject tdigestCDF(java.lang.String p0, double... p1)`
- `public final redis.clients.jedis.CommandObject tdigestCreate(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject tdigestCreate(java.lang.String p0, int p1)`
- `public final redis.clients.jedis.CommandObject tdigestInfo(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject tdigestMax(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject tdigestMerge(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject tdigestMerge(redis.clients.jedis.bloom.TDigestMergeParams p0, java.lang.String p1, java.lang.String... p2)`
- `public final redis.clients.jedis.CommandObject tdigestMin(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject tdigestQuantile(java.lang.String p0, double... p1)`
- `public final redis.clients.jedis.CommandObject tdigestRank(java.lang.String p0, double... p1)`
- `public final redis.clients.jedis.CommandObject tdigestReset(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject tdigestRevRank(java.lang.String p0, double... p1)`
- `public final redis.clients.jedis.CommandObject tdigestTrimmedMean(java.lang.String p0, double p1, double p2)`
- `public final redis.clients.jedis.CommandObject topkAdd(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject topkCount(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject topkIncrBy(java.lang.String p0, java.util.Map p1)`
- `public final redis.clients.jedis.CommandObject topkInfo(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject topkList(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject topkQuery(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject topkReserve(java.lang.String p0, long p1)`
- `public final redis.clients.jedis.CommandObject topkReserve(java.lang.String p0, long p1, long p2, long p3, double p4)`
- `public final redis.clients.jedis.CommandObject touch(byte[] p0)`
- `public final redis.clients.jedis.CommandObject touch(byte[]... p0)`
- `public final redis.clients.jedis.CommandObject touch(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject touch(java.lang.String... p0)`
- `public final redis.clients.jedis.CommandObject tsAdd(java.lang.String p0, double p1)`
- `public final redis.clients.jedis.CommandObject tsAdd(java.lang.String p0, long p1, double p2)`
- `public final redis.clients.jedis.CommandObject tsAdd(java.lang.String p0, long p1, double p2, redis.clients.jedis.timeseries.TSCreateParams p3)`
- `public final redis.clients.jedis.CommandObject tsAlter(java.lang.String p0, redis.clients.jedis.timeseries.TSAlterParams p1)`
- `public final redis.clients.jedis.CommandObject tsCreate(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject tsCreate(java.lang.String p0, redis.clients.jedis.timeseries.TSCreateParams p1)`
- `public final redis.clients.jedis.CommandObject tsCreateRule(java.lang.String p0, java.lang.String p1, redis.clients.jedis.timeseries.AggregationType p2, long p3)`
- `public final redis.clients.jedis.CommandObject tsCreateRule(java.lang.String p0, java.lang.String p1, redis.clients.jedis.timeseries.AggregationType p2, long p3, long p4)`
- `public final redis.clients.jedis.CommandObject tsDecrBy(java.lang.String p0, double p1)`
- `public final redis.clients.jedis.CommandObject tsDecrBy(java.lang.String p0, double p1, long p2)`
- `public final redis.clients.jedis.CommandObject tsDel(java.lang.String p0, long p1, long p2)`
- `public final redis.clients.jedis.CommandObject tsDeleteRule(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject tsGet(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject tsGet(java.lang.String p0, redis.clients.jedis.timeseries.TSGetParams p1)`
- `public final redis.clients.jedis.CommandObject tsIncrBy(java.lang.String p0, double p1)`
- `public final redis.clients.jedis.CommandObject tsIncrBy(java.lang.String p0, double p1, long p2)`
- `public final redis.clients.jedis.CommandObject tsInfo(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject tsInfoDebug(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject tsMAdd(java.util.Map$Entry... p0)`
- `public final redis.clients.jedis.CommandObject tsMGet(redis.clients.jedis.timeseries.TSMGetParams p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject tsMRange(long p0, long p1, java.lang.String... p2)`
- `public final redis.clients.jedis.CommandObject tsMRange(redis.clients.jedis.timeseries.TSMRangeParams p0)`
- `public final redis.clients.jedis.CommandObject tsMRevRange(long p0, long p1, java.lang.String... p2)`
- `public final redis.clients.jedis.CommandObject tsMRevRange(redis.clients.jedis.timeseries.TSMRangeParams p0)`
- `public final redis.clients.jedis.CommandObject tsQueryIndex(java.lang.String... p0)`
- `public final redis.clients.jedis.CommandObject tsRange(java.lang.String p0, long p1, long p2)`
- `public final redis.clients.jedis.CommandObject tsRange(java.lang.String p0, redis.clients.jedis.timeseries.TSRangeParams p1)`
- `public final redis.clients.jedis.CommandObject tsRevRange(java.lang.String p0, long p1, long p2)`
- `public final redis.clients.jedis.CommandObject tsRevRange(java.lang.String p0, redis.clients.jedis.timeseries.TSRangeParams p1)`
- `public final redis.clients.jedis.CommandObject ttl(byte[] p0)`
- `public final redis.clients.jedis.CommandObject ttl(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject type(byte[] p0)`
- `public final redis.clients.jedis.CommandObject type(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject unlink(byte[] p0)`
- `public final redis.clients.jedis.CommandObject unlink(byte[]... p0)`
- `public final redis.clients.jedis.CommandObject unlink(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject unlink(java.lang.String... p0)`
- `public final redis.clients.jedis.CommandObject waitReplicas(byte[] p0, int p1, long p2)`
- `public redis.clients.jedis.CommandObject waitReplicas(int p0, long p1)`
- `public final redis.clients.jedis.CommandObject waitReplicas(java.lang.String p0, int p1, long p2)`
- `public final redis.clients.jedis.CommandObject xack(byte[] p0, byte[] p1, byte[]... p2)`
- `public final redis.clients.jedis.CommandObject xack(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID... p2)`
- `public final redis.clients.jedis.CommandObject xadd(byte[] p0, redis.clients.jedis.params.XAddParams p1, java.util.Map p2)`
- `public final redis.clients.jedis.CommandObject xadd(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, java.util.Map p2)`
- `public final redis.clients.jedis.CommandObject xadd(java.lang.String p0, redis.clients.jedis.params.XAddParams p1, java.util.Map p2)`
- `public final redis.clients.jedis.CommandObject xautoclaim(byte[] p0, byte[] p1, byte[] p2, long p3, byte[] p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public final redis.clients.jedis.CommandObject xautoclaim(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.StreamEntryID p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public final redis.clients.jedis.CommandObject xautoclaimJustId(byte[] p0, byte[] p1, byte[] p2, long p3, byte[] p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public final redis.clients.jedis.CommandObject xautoclaimJustId(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.StreamEntryID p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public final redis.clients.jedis.CommandObject xclaim(byte[] p0, byte[] p1, byte[] p2, long p3, redis.clients.jedis.params.XClaimParams p4, byte[]... p5)`
- `public final redis.clients.jedis.CommandObject xclaim(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.params.XClaimParams p4, redis.clients.jedis.StreamEntryID... p5)`
- `public final redis.clients.jedis.CommandObject xclaimJustId(byte[] p0, byte[] p1, byte[] p2, long p3, redis.clients.jedis.params.XClaimParams p4, byte[]... p5)`
- `public final redis.clients.jedis.CommandObject xclaimJustId(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.params.XClaimParams p4, redis.clients.jedis.StreamEntryID... p5)`
- `public final redis.clients.jedis.CommandObject xdel(byte[] p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject xdel(java.lang.String p0, redis.clients.jedis.StreamEntryID... p1)`
- `public final redis.clients.jedis.CommandObject xgroupCreate(byte[] p0, byte[] p1, byte[] p2, boolean p3)`
- `public final redis.clients.jedis.CommandObject xgroupCreate(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID p2, boolean p3)`
- `public final redis.clients.jedis.CommandObject xgroupCreateConsumer(byte[] p0, byte[] p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject xgroupCreateConsumer(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject xgroupDelConsumer(byte[] p0, byte[] p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject xgroupDelConsumer(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject xgroupDestroy(byte[] p0, byte[] p1)`
- `public final redis.clients.jedis.CommandObject xgroupDestroy(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject xgroupSetID(byte[] p0, byte[] p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject xgroupSetID(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID p2)`
- `public final redis.clients.jedis.CommandObject xinfoConsumers(byte[] p0, byte[] p1)`
- `public final redis.clients.jedis.CommandObject xinfoConsumers(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject xinfoGroup(byte[] p0)`
- `public final redis.clients.jedis.CommandObject xinfoGroup(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject xinfoGroups(byte[] p0)`
- `public final redis.clients.jedis.CommandObject xinfoGroups(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject xinfoStream(byte[] p0)`
- `public final redis.clients.jedis.CommandObject xinfoStream(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject xinfoStreamFull(byte[] p0)`
- `public final redis.clients.jedis.CommandObject xinfoStreamFull(byte[] p0, int p1)`
- `public final redis.clients.jedis.CommandObject xinfoStreamFull(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject xinfoStreamFull(java.lang.String p0, int p1)`
- `public final redis.clients.jedis.CommandObject xlen(byte[] p0)`
- `public final redis.clients.jedis.CommandObject xlen(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject xpending(byte[] p0, byte[] p1)`
- `public final redis.clients.jedis.CommandObject xpending(byte[] p0, byte[] p1, byte[] p2, byte[] p3, int p4, byte[] p5)`
- `public final redis.clients.jedis.CommandObject xpending(byte[] p0, byte[] p1, redis.clients.jedis.params.XPendingParams p2)`
- `public final redis.clients.jedis.CommandObject xpending(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject xpending(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID p2, redis.clients.jedis.StreamEntryID p3, int p4, java.lang.String p5)`
- `public final redis.clients.jedis.CommandObject xpending(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.XPendingParams p2)`
- `public final redis.clients.jedis.CommandObject xrange(byte[] p0, byte[] p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject xrange(byte[] p0, byte[] p1, byte[] p2, int p3)`
- `public final redis.clients.jedis.CommandObject xrange(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject xrange(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3)`
- `public final redis.clients.jedis.CommandObject xrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2)`
- `public final redis.clients.jedis.CommandObject xrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2, int p3)`
- `public final redis.clients.jedis.CommandObject xread(redis.clients.jedis.params.XReadParams p0, java.util.Map$Entry... p1)`
- `public final redis.clients.jedis.CommandObject xread(redis.clients.jedis.params.XReadParams p0, java.util.Map p1)`
- `public final redis.clients.jedis.CommandObject xreadGroup(byte[] p0, byte[] p1, redis.clients.jedis.params.XReadGroupParams p2, java.util.Map$Entry... p3)`
- `public final redis.clients.jedis.CommandObject xreadGroup(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.XReadGroupParams p2, java.util.Map p3)`
- `public final redis.clients.jedis.CommandObject xrevrange(byte[] p0, byte[] p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject xrevrange(byte[] p0, byte[] p1, byte[] p2, int p3)`
- `public final redis.clients.jedis.CommandObject xrevrange(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject xrevrange(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3)`
- `public final redis.clients.jedis.CommandObject xrevrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2)`
- `public final redis.clients.jedis.CommandObject xrevrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2, int p3)`
- `public final redis.clients.jedis.CommandObject xtrim(byte[] p0, long p1, boolean p2)`
- `public final redis.clients.jedis.CommandObject xtrim(byte[] p0, redis.clients.jedis.params.XTrimParams p1)`
- `public final redis.clients.jedis.CommandObject xtrim(java.lang.String p0, long p1, boolean p2)`
- `public final redis.clients.jedis.CommandObject xtrim(java.lang.String p0, redis.clients.jedis.params.XTrimParams p1)`
- `public final redis.clients.jedis.CommandObject zadd(byte[] p0, double p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject zadd(byte[] p0, double p1, byte[] p2, redis.clients.jedis.params.ZAddParams p3)`
- `public final redis.clients.jedis.CommandObject zadd(byte[] p0, java.util.Map p1)`
- `public final redis.clients.jedis.CommandObject zadd(byte[] p0, java.util.Map p1, redis.clients.jedis.params.ZAddParams p2)`
- `public final redis.clients.jedis.CommandObject zadd(java.lang.String p0, double p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject zadd(java.lang.String p0, double p1, java.lang.String p2, redis.clients.jedis.params.ZAddParams p3)`
- `public final redis.clients.jedis.CommandObject zadd(java.lang.String p0, java.util.Map p1)`
- `public final redis.clients.jedis.CommandObject zadd(java.lang.String p0, java.util.Map p1, redis.clients.jedis.params.ZAddParams p2)`
- `public final redis.clients.jedis.CommandObject zaddIncr(byte[] p0, double p1, byte[] p2, redis.clients.jedis.params.ZAddParams p3)`
- `public final redis.clients.jedis.CommandObject zaddIncr(java.lang.String p0, double p1, java.lang.String p2, redis.clients.jedis.params.ZAddParams p3)`
- `public final redis.clients.jedis.CommandObject zcard(byte[] p0)`
- `public final redis.clients.jedis.CommandObject zcard(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject zcount(byte[] p0, byte[] p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject zcount(byte[] p0, double p1, double p2)`
- `public final redis.clients.jedis.CommandObject zcount(java.lang.String p0, double p1, double p2)`
- `public final redis.clients.jedis.CommandObject zcount(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject zdiff(byte[]... p0)`
- `public final redis.clients.jedis.CommandObject zdiff(java.lang.String... p0)`
- `public final redis.clients.jedis.CommandObject zdiffStore(byte[] p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject zdiffStore(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject zdiffWithScores(byte[]... p0)`
- `public final redis.clients.jedis.CommandObject zdiffWithScores(java.lang.String... p0)`
- `public final redis.clients.jedis.CommandObject zincrby(byte[] p0, double p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject zincrby(byte[] p0, double p1, byte[] p2, redis.clients.jedis.params.ZIncrByParams p3)`
- `public final redis.clients.jedis.CommandObject zincrby(java.lang.String p0, double p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject zincrby(java.lang.String p0, double p1, java.lang.String p2, redis.clients.jedis.params.ZIncrByParams p3)`
- `public final redis.clients.jedis.CommandObject zinter(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject zinter(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject zinterWithScores(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject zinterWithScores(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject zintercard(byte[]... p0)`
- `public final redis.clients.jedis.CommandObject zintercard(java.lang.String... p0)`
- `public final redis.clients.jedis.CommandObject zintercard(long p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject zintercard(long p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject zinterstore(byte[] p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject zinterstore(byte[] p0, redis.clients.jedis.params.ZParams p1, byte[]... p2)`
- `public final redis.clients.jedis.CommandObject zinterstore(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject zinterstore(java.lang.String p0, redis.clients.jedis.params.ZParams p1, java.lang.String... p2)`
- `public final redis.clients.jedis.CommandObject zlexcount(byte[] p0, byte[] p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject zlexcount(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject zmpop(redis.clients.jedis.args.SortedSetOption p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject zmpop(redis.clients.jedis.args.SortedSetOption p0, int p1, byte[]... p2)`
- `public final redis.clients.jedis.CommandObject zmpop(redis.clients.jedis.args.SortedSetOption p0, int p1, java.lang.String... p2)`
- `public final redis.clients.jedis.CommandObject zmpop(redis.clients.jedis.args.SortedSetOption p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject zmscore(byte[] p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject zmscore(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject zpopmax(byte[] p0)`
- `public final redis.clients.jedis.CommandObject zpopmax(byte[] p0, int p1)`
- `public final redis.clients.jedis.CommandObject zpopmax(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject zpopmax(java.lang.String p0, int p1)`
- `public final redis.clients.jedis.CommandObject zpopmin(byte[] p0)`
- `public final redis.clients.jedis.CommandObject zpopmin(byte[] p0, int p1)`
- `public final redis.clients.jedis.CommandObject zpopmin(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject zpopmin(java.lang.String p0, int p1)`
- `public final redis.clients.jedis.CommandObject zrandmember(byte[] p0)`
- `public final redis.clients.jedis.CommandObject zrandmember(byte[] p0, long p1)`
- `public final redis.clients.jedis.CommandObject zrandmember(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject zrandmember(java.lang.String p0, long p1)`
- `public final redis.clients.jedis.CommandObject zrandmemberWithScores(byte[] p0, long p1)`
- `public final redis.clients.jedis.CommandObject zrandmemberWithScores(java.lang.String p0, long p1)`
- `public final redis.clients.jedis.CommandObject zrange(byte[] p0, long p1, long p2)`
- `public final redis.clients.jedis.CommandObject zrange(byte[] p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public final redis.clients.jedis.CommandObject zrange(java.lang.String p0, long p1, long p2)`
- `public final redis.clients.jedis.CommandObject zrange(java.lang.String p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public final redis.clients.jedis.CommandObject zrangeByLex(byte[] p0, byte[] p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject zrangeByLex(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public final redis.clients.jedis.CommandObject zrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject zrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public final redis.clients.jedis.CommandObject zrangeByScore(byte[] p0, byte[] p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject zrangeByScore(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public final redis.clients.jedis.CommandObject zrangeByScore(byte[] p0, double p1, double p2)`
- `public final redis.clients.jedis.CommandObject zrangeByScore(byte[] p0, double p1, double p2, int p3, int p4)`
- `public final redis.clients.jedis.CommandObject zrangeByScore(java.lang.String p0, double p1, double p2)`
- `public final redis.clients.jedis.CommandObject zrangeByScore(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public final redis.clients.jedis.CommandObject zrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject zrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public final redis.clients.jedis.CommandObject zrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject zrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public final redis.clients.jedis.CommandObject zrangeByScoreWithScores(byte[] p0, double p1, double p2)`
- `public final redis.clients.jedis.CommandObject zrangeByScoreWithScores(byte[] p0, double p1, double p2, int p3, int p4)`
- `public final redis.clients.jedis.CommandObject zrangeByScoreWithScores(java.lang.String p0, double p1, double p2)`
- `public final redis.clients.jedis.CommandObject zrangeByScoreWithScores(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public final redis.clients.jedis.CommandObject zrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject zrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public final redis.clients.jedis.CommandObject zrangeWithScores(byte[] p0, long p1, long p2)`
- `public final redis.clients.jedis.CommandObject zrangeWithScores(byte[] p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public final redis.clients.jedis.CommandObject zrangeWithScores(java.lang.String p0, long p1, long p2)`
- `public final redis.clients.jedis.CommandObject zrangeWithScores(java.lang.String p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public final redis.clients.jedis.CommandObject zrangestore(byte[] p0, byte[] p1, redis.clients.jedis.params.ZRangeParams p2)`
- `public final redis.clients.jedis.CommandObject zrangestore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ZRangeParams p2)`
- `public final redis.clients.jedis.CommandObject zrank(byte[] p0, byte[] p1)`
- `public final redis.clients.jedis.CommandObject zrank(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject zrem(byte[] p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject zrem(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject zremrangeByLex(byte[] p0, byte[] p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject zremrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject zremrangeByRank(byte[] p0, long p1, long p2)`
- `public final redis.clients.jedis.CommandObject zremrangeByRank(java.lang.String p0, long p1, long p2)`
- `public final redis.clients.jedis.CommandObject zremrangeByScore(byte[] p0, byte[] p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject zremrangeByScore(byte[] p0, double p1, double p2)`
- `public final redis.clients.jedis.CommandObject zremrangeByScore(java.lang.String p0, double p1, double p2)`
- `public final redis.clients.jedis.CommandObject zremrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject zrevrange(byte[] p0, long p1, long p2)`
- `public final redis.clients.jedis.CommandObject zrevrange(java.lang.String p0, long p1, long p2)`
- `public final redis.clients.jedis.CommandObject zrevrangeByLex(byte[] p0, byte[] p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject zrevrangeByLex(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public final redis.clients.jedis.CommandObject zrevrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject zrevrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public final redis.clients.jedis.CommandObject zrevrangeByScore(byte[] p0, byte[] p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject zrevrangeByScore(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public final redis.clients.jedis.CommandObject zrevrangeByScore(byte[] p0, double p1, double p2)`
- `public final redis.clients.jedis.CommandObject zrevrangeByScore(byte[] p0, double p1, double p2, int p3, int p4)`
- `public final redis.clients.jedis.CommandObject zrevrangeByScore(java.lang.String p0, double p1, double p2)`
- `public final redis.clients.jedis.CommandObject zrevrangeByScore(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public final redis.clients.jedis.CommandObject zrevrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject zrevrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public final redis.clients.jedis.CommandObject zrevrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject zrevrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public final redis.clients.jedis.CommandObject zrevrangeByScoreWithScores(byte[] p0, double p1, double p2)`
- `public final redis.clients.jedis.CommandObject zrevrangeByScoreWithScores(byte[] p0, double p1, double p2, int p3, int p4)`
- `public final redis.clients.jedis.CommandObject zrevrangeByScoreWithScores(java.lang.String p0, double p1, double p2)`
- `public final redis.clients.jedis.CommandObject zrevrangeByScoreWithScores(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public final redis.clients.jedis.CommandObject zrevrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject zrevrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public final redis.clients.jedis.CommandObject zrevrangeWithScores(byte[] p0, long p1, long p2)`
- `public final redis.clients.jedis.CommandObject zrevrangeWithScores(java.lang.String p0, long p1, long p2)`
- `public final redis.clients.jedis.CommandObject zrevrank(byte[] p0, byte[] p1)`
- `public final redis.clients.jedis.CommandObject zrevrank(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject zscan(byte[] p0, byte[] p1, redis.clients.jedis.params.ScanParams p2)`
- `public final redis.clients.jedis.CommandObject zscan(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ScanParams p2)`
- `public final redis.clients.jedis.CommandObject zscore(byte[] p0, byte[] p1)`
- `public final redis.clients.jedis.CommandObject zscore(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject zunion(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject zunion(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject zunionWithScores(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject zunionWithScores(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject zunionstore(byte[] p0, byte[]... p1)`
- `public final redis.clients.jedis.CommandObject zunionstore(byte[] p0, redis.clients.jedis.params.ZParams p1, byte[]... p2)`
- `public final redis.clients.jedis.CommandObject zunionstore(java.lang.String p0, java.lang.String... p1)`
- `public final redis.clients.jedis.CommandObject zunionstore(java.lang.String p0, redis.clients.jedis.params.ZParams p1, java.lang.String... p2)`

---

## public class `redis.clients.jedis.Connection`
implements `java.io.Closeable`  

**Constructors:**
- `public Connection()`
- `public Connection(java.lang.String p0, int p1)`
- `public Connection(redis.clients.jedis.HostAndPort p0)`
- `public Connection(redis.clients.jedis.HostAndPort p0, redis.clients.jedis.JedisClientConfig p1)`
- `public Connection(redis.clients.jedis.JedisSocketFactory p0)`
- `public Connection(redis.clients.jedis.JedisSocketFactory p0, redis.clients.jedis.JedisClientConfig p1)`

**Methods:**
- `public void close()`
- `public void connect() throws redis.clients.jedis.exceptions.JedisConnectionException`
- `public void disconnect()`
- `public java.lang.Object executeCommand(redis.clients.jedis.CommandArguments p0)`
- `public <T extends java.lang.Object> T executeCommand(redis.clients.jedis.CommandObject p0)`
- `public java.lang.Object executeCommand(redis.clients.jedis.commands.ProtocolCommand p0)`
- `protected void flush()`
- `public byte[] getBinaryBulkReply()`
- `public java.util.List getBinaryMultiBulkReply()`
- `public java.lang.String getBulkReply()`
- `public java.util.List getIntegerMultiBulkReply()`
- `public java.lang.Long getIntegerReply()`
- `public java.util.List getMany(int p0)`
- `public java.util.List getMultiBulkReply()`
- `public java.util.List getObjectMultiBulkReply()`
- `public java.lang.Object getOne()`
- `public int getSoTimeout()`
- `public java.lang.String getStatusCodeReply()`
- `public java.util.List getUnflushedObjectMultiBulkReply()`
- `public boolean isBroken()`
- `public boolean isConnected()`
- `public boolean ping()`
- `public java.lang.String quit()`
- `protected java.lang.Object readProtocolWithCheckingBroken()`
- `public void rollbackTimeout()`
- `public java.lang.String select(int p0)`
- `public void sendCommand(redis.clients.jedis.CommandArguments p0)`
- `public void sendCommand(redis.clients.jedis.commands.ProtocolCommand p0)`
- `public void sendCommand(redis.clients.jedis.commands.ProtocolCommand p0, byte[]... p1)`
- `public void sendCommand(redis.clients.jedis.commands.ProtocolCommand p0, java.lang.String... p1)`
- `public void sendCommand(redis.clients.jedis.commands.ProtocolCommand p0, redis.clients.jedis.args.Rawable p1)`
- `public void setBroken()`
- `public final void setHandlingPool(redis.clients.jedis.ConnectionPool p0)`
- `public void setSoTimeout(int p0)`
- `public void setTimeoutInfinite()`
- `public java.lang.String toString()`

---

## public class `redis.clients.jedis.ConnectionFactory`
implements `org.apache.commons.pool2.PooledObjectFactory<redis.clients.jedis.Connection>`  

**Constructors:**
- `public ConnectionFactory(redis.clients.jedis.HostAndPort p0)`
- `public ConnectionFactory(redis.clients.jedis.HostAndPort p0, redis.clients.jedis.JedisClientConfig p1)`
- `public ConnectionFactory(redis.clients.jedis.JedisSocketFactory p0, redis.clients.jedis.JedisClientConfig p1)`

**Methods:**
- `public void activateObject(org.apache.commons.pool2.PooledObject p0) throws java.lang.Exception`
- `public void destroyObject(org.apache.commons.pool2.PooledObject p0) throws java.lang.Exception`
- `public org.apache.commons.pool2.PooledObject makeObject() throws java.lang.Exception`
- `public void passivateObject(org.apache.commons.pool2.PooledObject p0) throws java.lang.Exception`
- `public void setPassword(java.lang.String p0)`
- `public boolean validateObject(org.apache.commons.pool2.PooledObject p0)`

---

## public class `redis.clients.jedis.ConnectionPool`
extends `redis.clients.jedis.util.Pool`  

**Constructors:**
- `public ConnectionPool(org.apache.commons.pool2.PooledObjectFactory p0)`
- `public ConnectionPool(org.apache.commons.pool2.PooledObjectFactory p0, org.apache.commons.pool2.impl.GenericObjectPoolConfig p1)`
- `public ConnectionPool(redis.clients.jedis.HostAndPort p0, redis.clients.jedis.JedisClientConfig p1)`
- `public ConnectionPool(redis.clients.jedis.HostAndPort p0, redis.clients.jedis.JedisClientConfig p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2)`

**Methods:**
- `public redis.clients.jedis.Connection getResource()`

---

## public class `redis.clients.jedis.ConnectionPoolConfig`
extends `org.apache.commons.pool2.impl.GenericObjectPoolConfig`  

**Constructors:**
- `public ConnectionPoolConfig()`

---

## public final class `redis.clients.jedis.DefaultJedisClientConfig`
implements `redis.clients.jedis.JedisClientConfig`  

**Methods:**
- `public static redis.clients.jedis.DefaultJedisClientConfig$Builder builder()`
- `public static redis.clients.jedis.DefaultJedisClientConfig copyConfig(redis.clients.jedis.JedisClientConfig p0)`
- `public static redis.clients.jedis.DefaultJedisClientConfig create(int p0, int p1, int p2, java.lang.String p3, java.lang.String p4, int p5, java.lang.String p6, boolean p7, javax.net.ssl.SSLSocketFactory p8, javax.net.ssl.SSLParameters p9, javax.net.ssl.HostnameVerifier p10, redis.clients.jedis.HostAndPortMapper p11)`
- `public int getBlockingSocketTimeoutMillis()`
- `public java.lang.String getClientName()`
- `public int getConnectionTimeoutMillis()`
- `public int getDatabase()`
- `public redis.clients.jedis.HostAndPortMapper getHostAndPortMapper()`
- `public javax.net.ssl.HostnameVerifier getHostnameVerifier()`
- `public java.lang.String getPassword()`
- `public int getSocketTimeoutMillis()`
- `public javax.net.ssl.SSLParameters getSslParameters()`
- `public javax.net.ssl.SSLSocketFactory getSslSocketFactory()`
- `public java.lang.String getUser()`
- `public boolean isSsl()`
- `public synchronized void updatePassword(java.lang.String p0)`

---

## public static class `redis.clients.jedis.DefaultJedisClientConfig$Builder`

**Methods:**
- `public redis.clients.jedis.DefaultJedisClientConfig$Builder blockingSocketTimeoutMillis(int p0)`
- `public redis.clients.jedis.DefaultJedisClientConfig build()`
- `public redis.clients.jedis.DefaultJedisClientConfig$Builder clientName(java.lang.String p0)`
- `public redis.clients.jedis.DefaultJedisClientConfig$Builder connectionTimeoutMillis(int p0)`
- `public redis.clients.jedis.DefaultJedisClientConfig$Builder database(int p0)`
- `public redis.clients.jedis.DefaultJedisClientConfig$Builder hostAndPortMapper(redis.clients.jedis.HostAndPortMapper p0)`
- `public redis.clients.jedis.DefaultJedisClientConfig$Builder hostnameVerifier(javax.net.ssl.HostnameVerifier p0)`
- `public redis.clients.jedis.DefaultJedisClientConfig$Builder password(java.lang.String p0)`
- `public redis.clients.jedis.DefaultJedisClientConfig$Builder socketTimeoutMillis(int p0)`
- `public redis.clients.jedis.DefaultJedisClientConfig$Builder ssl(boolean p0)`
- `public redis.clients.jedis.DefaultJedisClientConfig$Builder sslParameters(javax.net.ssl.SSLParameters p0)`
- `public redis.clients.jedis.DefaultJedisClientConfig$Builder sslSocketFactory(javax.net.ssl.SSLSocketFactory p0)`
- `public redis.clients.jedis.DefaultJedisClientConfig$Builder timeoutMillis(int p0)`
- `public redis.clients.jedis.DefaultJedisClientConfig$Builder user(java.lang.String p0)`

---

## public class `redis.clients.jedis.DefaultJedisSocketFactory`
implements `redis.clients.jedis.JedisSocketFactory`  

**Constructors:**
- `public DefaultJedisSocketFactory()`
- `public DefaultJedisSocketFactory(redis.clients.jedis.HostAndPort p0)`
- `public DefaultJedisSocketFactory(redis.clients.jedis.HostAndPort p0, redis.clients.jedis.JedisClientConfig p1)`
- `public DefaultJedisSocketFactory(redis.clients.jedis.JedisClientConfig p0)`

**Fields:**
- `protected final static redis.clients.jedis.HostAndPort DEFAULT_HOST_AND_PORT`

**Methods:**
- `public java.net.Socket createSocket() throws redis.clients.jedis.exceptions.JedisConnectionException`
- `public redis.clients.jedis.HostAndPort getHostAndPort()`
- `protected redis.clients.jedis.HostAndPort getSocketHostAndPort()`
- `public java.lang.String toString()`
- `public void updateHostAndPort(redis.clients.jedis.HostAndPort p0)`

---

## public class `redis.clients.jedis.GeoCoordinate`

**Constructors:**
- `public GeoCoordinate(double p0, double p1)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public double getLatitude()`
- `public double getLongitude()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `redis.clients.jedis.HostAndPort`
implements `java.io.Serializable`  

**Constructors:**
- `public HostAndPort(java.lang.String p0, int p1)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public static redis.clients.jedis.HostAndPort from(java.lang.String p0)`
- `public java.lang.String getHost()`
- `public int getPort()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public abstract interface `redis.clients.jedis.HostAndPortMapper`

**Methods:**
- `public abstract redis.clients.jedis.HostAndPort getHostAndPort(redis.clients.jedis.HostAndPort p0)`

---

## public class `redis.clients.jedis.Jedis`
implements `java.io.Closeable`, `redis.clients.jedis.commands.ClusterCommands`, `redis.clients.jedis.commands.ControlBinaryCommands`, `redis.clients.jedis.commands.ControlCommands`, `redis.clients.jedis.commands.DatabaseCommands`, `redis.clients.jedis.commands.GenericControlCommands`, `redis.clients.jedis.commands.JedisBinaryCommands`, `redis.clients.jedis.commands.JedisCommands`, `redis.clients.jedis.commands.ModuleCommands`, `redis.clients.jedis.commands.SentinelCommands`, `redis.clients.jedis.commands.ServerCommands`  

**Constructors:**
- `public Jedis()`
- `public Jedis(java.lang.String p0)`
- `public Jedis(java.lang.String p0, int p1)`
- `public Jedis(java.lang.String p0, int p1, boolean p2)`
- `public Jedis(java.lang.String p0, int p1, boolean p2, javax.net.ssl.SSLSocketFactory p3, javax.net.ssl.SSLParameters p4, javax.net.ssl.HostnameVerifier p5)`
- `public Jedis(java.lang.String p0, int p1, int p2)`
- `public Jedis(java.lang.String p0, int p1, int p2, boolean p3)`
- `public Jedis(java.lang.String p0, int p1, int p2, boolean p3, javax.net.ssl.SSLSocketFactory p4, javax.net.ssl.SSLParameters p5, javax.net.ssl.HostnameVerifier p6)`
- `public Jedis(java.lang.String p0, int p1, int p2, int p3)`
- `public Jedis(java.lang.String p0, int p1, int p2, int p3, boolean p4)`
- `public Jedis(java.lang.String p0, int p1, int p2, int p3, boolean p4, javax.net.ssl.SSLSocketFactory p5, javax.net.ssl.SSLParameters p6, javax.net.ssl.HostnameVerifier p7)`
- `public Jedis(java.lang.String p0, int p1, int p2, int p3, int p4)`
- `public Jedis(java.lang.String p0, int p1, int p2, int p3, int p4, boolean p5, javax.net.ssl.SSLSocketFactory p6, javax.net.ssl.SSLParameters p7, javax.net.ssl.HostnameVerifier p8)`
- `public Jedis(java.lang.String p0, int p1, redis.clients.jedis.JedisClientConfig p2)`
- `public Jedis(java.net.URI p0)`
- `public Jedis(java.net.URI p0, int p1)`
- `public Jedis(java.net.URI p0, int p1, int p2)`
- `public Jedis(java.net.URI p0, int p1, int p2, int p3, javax.net.ssl.SSLSocketFactory p4, javax.net.ssl.SSLParameters p5, javax.net.ssl.HostnameVerifier p6)`
- `public Jedis(java.net.URI p0, int p1, int p2, javax.net.ssl.SSLSocketFactory p3, javax.net.ssl.SSLParameters p4, javax.net.ssl.HostnameVerifier p5)`
- `public Jedis(java.net.URI p0, int p1, javax.net.ssl.SSLSocketFactory p2, javax.net.ssl.SSLParameters p3, javax.net.ssl.HostnameVerifier p4)`
- `public Jedis(java.net.URI p0, javax.net.ssl.SSLSocketFactory p1, javax.net.ssl.SSLParameters p2, javax.net.ssl.HostnameVerifier p3)`
- `public Jedis(java.net.URI p0, redis.clients.jedis.JedisClientConfig p1)`
- `public Jedis(redis.clients.jedis.Connection p0)`
- `public Jedis(redis.clients.jedis.HostAndPort p0)`
- `public Jedis(redis.clients.jedis.HostAndPort p0, redis.clients.jedis.JedisClientConfig p1)`
- `public Jedis(redis.clients.jedis.JedisSocketFactory p0)`
- `public Jedis(redis.clients.jedis.JedisSocketFactory p0, redis.clients.jedis.JedisClientConfig p1)`

**Fields:**
- `protected final static byte[][] DUMMY_ARRAY`
- `protected final redis.clients.jedis.Connection connection`

**Methods:**
- `public java.util.List aclCat()`
- `public java.util.List aclCat(byte[] p0)`
- `public java.util.List aclCat(java.lang.String p0)`
- `public java.util.List aclCatBinary()`
- `public long aclDelUser(byte[] p0)`
- `public long aclDelUser(byte[] p0, byte[]... p1)`
- `public long aclDelUser(java.lang.String p0)`
- `public long aclDelUser(java.lang.String p0, java.lang.String... p1)`
- `public java.lang.String aclDryRun(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public java.lang.String aclDryRun(java.lang.String p0, redis.clients.jedis.CommandArguments p1)`
- `public byte[] aclDryRunBinary(byte[] p0, byte[] p1, byte[]... p2)`
- `public byte[] aclDryRunBinary(byte[] p0, redis.clients.jedis.CommandArguments p1)`
- `public java.lang.String aclGenPass()`
- `public java.lang.String aclGenPass(int p0)`
- `public byte[] aclGenPassBinary()`
- `public byte[] aclGenPassBinary(int p0)`
- `public redis.clients.jedis.resps.AccessControlUser aclGetUser(byte[] p0)`
- `public redis.clients.jedis.resps.AccessControlUser aclGetUser(java.lang.String p0)`
- `public java.util.List aclList()`
- `public java.util.List aclListBinary()`
- `public java.lang.String aclLoad()`
- `public java.util.List aclLog()`
- `public java.util.List aclLog(int p0)`
- `public java.util.List aclLogBinary()`
- `public java.util.List aclLogBinary(int p0)`
- `public java.lang.String aclLogReset()`
- `public java.lang.String aclSave()`
- `public java.lang.String aclSetUser(byte[] p0)`
- `public java.lang.String aclSetUser(byte[] p0, byte[]... p1)`
- `public java.lang.String aclSetUser(java.lang.String p0)`
- `public java.lang.String aclSetUser(java.lang.String p0, java.lang.String... p1)`
- `public java.util.List aclUsers()`
- `public java.util.List aclUsersBinary()`
- `public java.lang.String aclWhoAmI()`
- `public byte[] aclWhoAmIBinary()`
- `public long append(byte[] p0, byte[] p1)`
- `public long append(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String asking()`
- `public java.lang.String auth(java.lang.String p0)`
- `public java.lang.String auth(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String bgrewriteaof()`
- `public java.lang.String bgsave()`
- `public java.lang.String bgsaveSchedule()`
- `public long bitcount(byte[] p0)`
- `public long bitcount(byte[] p0, long p1, long p2)`
- `public long bitcount(byte[] p0, long p1, long p2, redis.clients.jedis.args.BitCountOption p3)`
- `public long bitcount(java.lang.String p0)`
- `public long bitcount(java.lang.String p0, long p1, long p2)`
- `public long bitcount(java.lang.String p0, long p1, long p2, redis.clients.jedis.args.BitCountOption p3)`
- `public java.util.List bitfield(byte[] p0, byte[]... p1)`
- `public java.util.List bitfield(java.lang.String p0, java.lang.String... p1)`
- `public java.util.List bitfieldReadonly(byte[] p0, byte[]... p1)`
- `public java.util.List bitfieldReadonly(java.lang.String p0, java.lang.String... p1)`
- `public long bitop(redis.clients.jedis.args.BitOP p0, byte[] p1, byte[]... p2)`
- `public long bitop(redis.clients.jedis.args.BitOP p0, java.lang.String p1, java.lang.String... p2)`
- `public long bitpos(byte[] p0, boolean p1)`
- `public long bitpos(byte[] p0, boolean p1, redis.clients.jedis.params.BitPosParams p2)`
- `public long bitpos(java.lang.String p0, boolean p1)`
- `public long bitpos(java.lang.String p0, boolean p1, redis.clients.jedis.params.BitPosParams p2)`
- `public byte[] blmove(byte[] p0, byte[] p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3, double p4)`
- `public java.lang.String blmove(java.lang.String p0, java.lang.String p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3, double p4)`
- `public redis.clients.jedis.util.KeyValue blmpop(long p0, redis.clients.jedis.args.ListDirection p1, byte[]... p2)`
- `public redis.clients.jedis.util.KeyValue blmpop(long p0, redis.clients.jedis.args.ListDirection p1, int p2, byte[]... p3)`
- `public redis.clients.jedis.util.KeyValue blmpop(long p0, redis.clients.jedis.args.ListDirection p1, int p2, java.lang.String... p3)`
- `public redis.clients.jedis.util.KeyValue blmpop(long p0, redis.clients.jedis.args.ListDirection p1, java.lang.String... p2)`
- `public java.util.List blpop(double p0, byte[]... p1)`
- `public redis.clients.jedis.resps.KeyedListElement blpop(double p0, java.lang.String p1)`
- `public redis.clients.jedis.resps.KeyedListElement blpop(double p0, java.lang.String... p1)`
- `public java.util.List blpop(int p0, byte[]... p1)`
- `public java.util.List blpop(int p0, java.lang.String p1)`
- `public java.util.List blpop(int p0, java.lang.String... p1)`
- `public java.util.List brpop(double p0, byte[]... p1)`
- `public redis.clients.jedis.resps.KeyedListElement brpop(double p0, java.lang.String p1)`
- `public redis.clients.jedis.resps.KeyedListElement brpop(double p0, java.lang.String... p1)`
- `public java.util.List brpop(int p0, byte[]... p1)`
- `public java.util.List brpop(int p0, java.lang.String p1)`
- `public java.util.List brpop(int p0, java.lang.String... p1)`
- `public byte[] brpoplpush(byte[] p0, byte[] p1, int p2)`
- `public java.lang.String brpoplpush(java.lang.String p0, java.lang.String p1, int p2)`
- `public redis.clients.jedis.util.KeyValue bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, byte[]... p2)`
- `public redis.clients.jedis.util.KeyValue bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, int p2, byte[]... p3)`
- `public redis.clients.jedis.util.KeyValue bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, int p2, java.lang.String... p3)`
- `public redis.clients.jedis.util.KeyValue bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, java.lang.String... p2)`
- `public java.util.List bzpopmax(double p0, byte[]... p1)`
- `public redis.clients.jedis.resps.KeyedZSetElement bzpopmax(double p0, java.lang.String... p1)`
- `public java.util.List bzpopmin(double p0, byte[]... p1)`
- `public redis.clients.jedis.resps.KeyedZSetElement bzpopmin(double p0, java.lang.String... p1)`
- `protected void checkIsInMultiOrPipeline()`
- `public java.lang.String clientGetname()`
- `public byte[] clientGetnameBinary()`
- `public long clientId()`
- `public java.lang.String clientInfo()`
- `public byte[] clientInfoBinary()`
- `public java.lang.String clientKill(byte[] p0)`
- `public java.lang.String clientKill(java.lang.String p0)`
- `public java.lang.String clientKill(java.lang.String p0, int p1)`
- `public long clientKill(redis.clients.jedis.params.ClientKillParams p0)`
- `public java.lang.String clientList()`
- `public java.lang.String clientList(long... p0)`
- `public java.lang.String clientList(redis.clients.jedis.args.ClientType p0)`
- `public byte[] clientListBinary()`
- `public byte[] clientListBinary(long... p0)`
- `public byte[] clientListBinary(redis.clients.jedis.args.ClientType p0)`
- `public java.lang.String clientNoEvictOff()`
- `public java.lang.String clientNoEvictOn()`
- `public java.lang.String clientPause(long p0)`
- `public java.lang.String clientPause(long p0, redis.clients.jedis.args.ClientPauseMode p1)`
- `public java.lang.String clientSetname(byte[] p0)`
- `public java.lang.String clientSetname(java.lang.String p0)`
- `public long clientUnblock(long p0)`
- `public long clientUnblock(long p0, redis.clients.jedis.args.UnblockType p1)`
- `public void close()`
- `public java.lang.String clusterAddSlots(int... p0)`
- `public java.lang.String clusterAddSlotsRange(int... p0)`
- `public java.lang.String clusterBumpEpoch()`
- `public long clusterCountFailureReports(java.lang.String p0)`
- `public long clusterCountKeysInSlot(int p0)`
- `public java.lang.String clusterDelSlots(int... p0)`
- `public java.lang.String clusterDelSlotsRange(int... p0)`
- `public java.lang.String clusterFailover()`
- `public java.lang.String clusterFailover(redis.clients.jedis.args.ClusterFailoverOption p0)`
- `public java.lang.String clusterFlushSlots()`
- `public java.lang.String clusterForget(java.lang.String p0)`
- `public java.util.List clusterGetKeysInSlot(int p0, int p1)`
- `public java.util.List clusterGetKeysInSlotBinary(int p0, int p1)`
- `public java.lang.String clusterInfo()`
- `public long clusterKeySlot(java.lang.String p0)`
- `public java.util.List clusterLinks()`
- `public java.lang.String clusterMeet(java.lang.String p0, int p1)`
- `public java.lang.String clusterMyId()`
- `public java.lang.String clusterNodes()`
- `public java.util.List clusterReplicas(java.lang.String p0)`
- `public java.lang.String clusterReplicate(java.lang.String p0)`
- `public java.lang.String clusterReset()`
- `public java.lang.String clusterReset(redis.clients.jedis.args.ClusterResetType p0)`
- `public java.lang.String clusterSaveConfig()`
- `public java.lang.String clusterSetConfigEpoch(long p0)`
- `public java.lang.String clusterSetSlotImporting(int p0, java.lang.String p1)`
- `public java.lang.String clusterSetSlotMigrating(int p0, java.lang.String p1)`
- `public java.lang.String clusterSetSlotNode(int p0, java.lang.String p1)`
- `public java.lang.String clusterSetSlotStable(int p0)`
- `public java.util.List clusterSlaves(java.lang.String p0)`
- `public java.util.List clusterSlots()`
- `public long commandCount()`
- `public java.util.Map commandDocs(java.lang.String... p0)`
- `public java.util.List commandGetKeys(java.lang.String... p0)`
- `public java.util.List commandGetKeysAndFlags(java.lang.String... p0)`
- `public java.util.Map commandInfo(java.lang.String... p0)`
- `public java.util.List commandList()`
- `public java.util.List commandListFilterBy(redis.clients.jedis.params.CommandListFilterByParams p0)`
- `public java.util.List configGet(byte[] p0)`
- `public java.util.List configGet(byte[]... p0)`
- `public java.util.List configGet(java.lang.String p0)`
- `public java.util.List configGet(java.lang.String... p0)`
- `public java.lang.String configResetStat()`
- `public java.lang.String configRewrite()`
- `public java.lang.String configSet(byte[] p0, byte[] p1)`
- `public java.lang.String configSet(byte[]... p0)`
- `public java.lang.String configSet(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String configSet(java.lang.String... p0)`
- `public void connect()`
- `public boolean copy(byte[] p0, byte[] p1, boolean p2)`
- `public boolean copy(byte[] p0, byte[] p1, int p2, boolean p3)`
- `public boolean copy(java.lang.String p0, java.lang.String p1, boolean p2)`
- `public boolean copy(java.lang.String p0, java.lang.String p1, int p2, boolean p3)`
- `public long dbSize()`
- `public long decr(byte[] p0)`
- `public long decr(java.lang.String p0)`
- `public long decrBy(byte[] p0, long p1)`
- `public long decrBy(java.lang.String p0, long p1)`
- `public long del(byte[] p0)`
- `public long del(byte[]... p0)`
- `public long del(java.lang.String p0)`
- `public long del(java.lang.String... p0)`
- `public void disconnect()`
- `public byte[] dump(byte[] p0)`
- `public byte[] dump(java.lang.String p0)`
- `public byte[] echo(byte[] p0)`
- `public java.lang.String echo(java.lang.String p0)`
- `public java.lang.Object eval(byte[] p0)`
- `public java.lang.Object eval(byte[] p0, int p1, byte[]... p2)`
- `public java.lang.Object eval(byte[] p0, java.util.List p1, java.util.List p2)`
- `public java.lang.Object eval(java.lang.String p0)`
- `public java.lang.Object eval(java.lang.String p0, int p1, java.lang.String... p2)`
- `public java.lang.Object eval(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public java.lang.Object evalReadonly(byte[] p0, java.util.List p1, java.util.List p2)`
- `public java.lang.Object evalReadonly(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public java.lang.Object evalsha(byte[] p0)`
- `public java.lang.Object evalsha(byte[] p0, int p1, byte[]... p2)`
- `public java.lang.Object evalsha(byte[] p0, java.util.List p1, java.util.List p2)`
- `public java.lang.Object evalsha(java.lang.String p0)`
- `public java.lang.Object evalsha(java.lang.String p0, int p1, java.lang.String... p2)`
- `public java.lang.Object evalsha(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public java.lang.Object evalshaReadonly(byte[] p0, java.util.List p1, java.util.List p2)`
- `public java.lang.Object evalshaReadonly(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public boolean exists(byte[] p0)`
- `public long exists(byte[]... p0)`
- `public boolean exists(java.lang.String p0)`
- `public long exists(java.lang.String... p0)`
- `public long expire(byte[] p0, long p1)`
- `public long expire(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public long expire(java.lang.String p0, long p1)`
- `public long expire(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public long expireAt(byte[] p0, long p1)`
- `public long expireAt(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public long expireAt(java.lang.String p0, long p1)`
- `public long expireAt(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public long expireTime(byte[] p0)`
- `public long expireTime(java.lang.String p0)`
- `public java.lang.String failover()`
- `public java.lang.String failover(redis.clients.jedis.params.FailoverParams p0)`
- `public java.lang.String failoverAbort()`
- `public java.lang.Object fcall(byte[] p0, java.util.List p1, java.util.List p2)`
- `public java.lang.Object fcall(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public java.lang.Object fcallReadonly(byte[] p0, java.util.List p1, java.util.List p2)`
- `public java.lang.Object fcallReadonly(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public java.lang.String flushAll()`
- `public java.lang.String flushAll(redis.clients.jedis.args.FlushMode p0)`
- `public java.lang.String flushDB()`
- `public java.lang.String flushDB(redis.clients.jedis.args.FlushMode p0)`
- `public java.lang.String functionDelete(byte[] p0)`
- `public java.lang.String functionDelete(java.lang.String p0)`
- `public byte[] functionDump()`
- `public java.lang.String functionFlush()`
- `public java.lang.String functionFlush(redis.clients.jedis.args.FlushMode p0)`
- `public java.lang.String functionKill()`
- `public java.util.List functionList()`
- `public java.util.List functionList(byte[] p0)`
- `public java.util.List functionList(java.lang.String p0)`
- `public java.util.List functionListBinary()`
- `public java.util.List functionListWithCode()`
- `public java.util.List functionListWithCode(byte[] p0)`
- `public java.util.List functionListWithCode(java.lang.String p0)`
- `public java.util.List functionListWithCodeBinary()`
- `public java.lang.String functionLoad(byte[] p0)`
- `public java.lang.String functionLoad(java.lang.String p0)`
- `public java.lang.String functionLoadReplace(byte[] p0)`
- `public java.lang.String functionLoadReplace(java.lang.String p0)`
- `public java.lang.String functionRestore(byte[] p0)`
- `public java.lang.String functionRestore(byte[] p0, redis.clients.jedis.args.FunctionRestorePolicy p1)`
- `public redis.clients.jedis.resps.FunctionStats functionStats()`
- `public java.lang.Object functionStatsBinary()`
- `public long geoadd(byte[] p0, double p1, double p2, byte[] p3)`
- `public long geoadd(byte[] p0, java.util.Map p1)`
- `public long geoadd(byte[] p0, redis.clients.jedis.params.GeoAddParams p1, java.util.Map p2)`
- `public long geoadd(java.lang.String p0, double p1, double p2, java.lang.String p3)`
- `public long geoadd(java.lang.String p0, java.util.Map p1)`
- `public long geoadd(java.lang.String p0, redis.clients.jedis.params.GeoAddParams p1, java.util.Map p2)`
- `public java.lang.Double geodist(byte[] p0, byte[] p1, byte[] p2)`
- `public java.lang.Double geodist(byte[] p0, byte[] p1, byte[] p2, redis.clients.jedis.args.GeoUnit p3)`
- `public java.lang.Double geodist(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.lang.Double geodist(java.lang.String p0, java.lang.String p1, java.lang.String p2, redis.clients.jedis.args.GeoUnit p3)`
- `public java.util.List geohash(byte[] p0, byte[]... p1)`
- `public java.util.List geohash(java.lang.String p0, java.lang.String... p1)`
- `public java.util.List geopos(byte[] p0, byte[]... p1)`
- `public java.util.List geopos(java.lang.String p0, java.lang.String... p1)`
- `public java.util.List georadius(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public java.util.List georadius(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public java.util.List georadius(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public java.util.List georadius(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public java.util.List georadiusByMember(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public java.util.List georadiusByMember(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public java.util.List georadiusByMember(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public java.util.List georadiusByMember(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public java.util.List georadiusByMemberReadonly(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public java.util.List georadiusByMemberReadonly(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public java.util.List georadiusByMemberReadonly(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public java.util.List georadiusByMemberReadonly(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public long georadiusByMemberStore(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4, redis.clients.jedis.params.GeoRadiusStoreParam p5)`
- `public long georadiusByMemberStore(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4, redis.clients.jedis.params.GeoRadiusStoreParam p5)`
- `public java.util.List georadiusReadonly(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public java.util.List georadiusReadonly(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public java.util.List georadiusReadonly(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public java.util.List georadiusReadonly(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public long georadiusStore(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5, redis.clients.jedis.params.GeoRadiusStoreParam p6)`
- `public long georadiusStore(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5, redis.clients.jedis.params.GeoRadiusStoreParam p6)`
- `public java.util.List geosearch(byte[] p0, byte[] p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public java.util.List geosearch(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public java.util.List geosearch(byte[] p0, redis.clients.jedis.GeoCoordinate p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public java.util.List geosearch(byte[] p0, redis.clients.jedis.GeoCoordinate p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public java.util.List geosearch(byte[] p0, redis.clients.jedis.params.GeoSearchParam p1)`
- `public java.util.List geosearch(java.lang.String p0, java.lang.String p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public java.util.List geosearch(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public java.util.List geosearch(java.lang.String p0, redis.clients.jedis.GeoCoordinate p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public java.util.List geosearch(java.lang.String p0, redis.clients.jedis.GeoCoordinate p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public java.util.List geosearch(java.lang.String p0, redis.clients.jedis.params.GeoSearchParam p1)`
- `public long geosearchStore(byte[] p0, byte[] p1, byte[] p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public long geosearchStore(byte[] p0, byte[] p1, byte[] p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public long geosearchStore(byte[] p0, byte[] p1, redis.clients.jedis.GeoCoordinate p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public long geosearchStore(byte[] p0, byte[] p1, redis.clients.jedis.GeoCoordinate p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public long geosearchStore(byte[] p0, byte[] p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public long geosearchStore(java.lang.String p0, java.lang.String p1, java.lang.String p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public long geosearchStore(java.lang.String p0, java.lang.String p1, java.lang.String p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public long geosearchStore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.GeoCoordinate p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public long geosearchStore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.GeoCoordinate p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public long geosearchStore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public long geosearchStoreStoreDist(byte[] p0, byte[] p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public long geosearchStoreStoreDist(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public byte[] get(byte[] p0)`
- `public java.lang.String get(java.lang.String p0)`
- `public redis.clients.jedis.Connection getClient()`
- `public redis.clients.jedis.Connection getConnection()`
- `public int getDB()`
- `public byte[] getDel(byte[] p0)`
- `public java.lang.String getDel(java.lang.String p0)`
- `public byte[] getEx(byte[] p0, redis.clients.jedis.params.GetExParams p1)`
- `public java.lang.String getEx(java.lang.String p0, redis.clients.jedis.params.GetExParams p1)`
- `protected static byte[][] getParamsWithBinary(java.util.List p0, java.util.List p1)`
- `public byte[] getSet(byte[] p0, byte[] p1)`
- `public java.lang.String getSet(java.lang.String p0, java.lang.String p1)`
- `public boolean getbit(byte[] p0, long p1)`
- `public boolean getbit(java.lang.String p0, long p1)`
- `public byte[] getrange(byte[] p0, long p1, long p2)`
- `public java.lang.String getrange(java.lang.String p0, long p1, long p2)`
- `public long hdel(byte[] p0, byte[]... p1)`
- `public long hdel(java.lang.String p0, java.lang.String... p1)`
- `public boolean hexists(byte[] p0, byte[] p1)`
- `public boolean hexists(java.lang.String p0, java.lang.String p1)`
- `public byte[] hget(byte[] p0, byte[] p1)`
- `public java.lang.String hget(java.lang.String p0, java.lang.String p1)`
- `public java.util.Map hgetAll(byte[] p0)`
- `public java.util.Map hgetAll(java.lang.String p0)`
- `public long hincrBy(byte[] p0, byte[] p1, long p2)`
- `public long hincrBy(java.lang.String p0, java.lang.String p1, long p2)`
- `public double hincrByFloat(byte[] p0, byte[] p1, double p2)`
- `public double hincrByFloat(java.lang.String p0, java.lang.String p1, double p2)`
- `public java.util.Set hkeys(byte[] p0)`
- `public java.util.Set hkeys(java.lang.String p0)`
- `public long hlen(byte[] p0)`
- `public long hlen(java.lang.String p0)`
- `public java.util.List hmget(byte[] p0, byte[]... p1)`
- `public java.util.List hmget(java.lang.String p0, java.lang.String... p1)`
- `public java.lang.String hmset(byte[] p0, java.util.Map p1)`
- `public java.lang.String hmset(java.lang.String p0, java.util.Map p1)`
- `public byte[] hrandfield(byte[] p0)`
- `public java.util.List hrandfield(byte[] p0, long p1)`
- `public java.lang.String hrandfield(java.lang.String p0)`
- `public java.util.List hrandfield(java.lang.String p0, long p1)`
- `public java.util.Map hrandfieldWithValues(byte[] p0, long p1)`
- `public java.util.Map hrandfieldWithValues(java.lang.String p0, long p1)`
- `public redis.clients.jedis.resps.ScanResult hscan(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.resps.ScanResult hscan(byte[] p0, byte[] p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.resps.ScanResult hscan(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ScanParams p2)`
- `public long hset(byte[] p0, byte[] p1, byte[] p2)`
- `public long hset(byte[] p0, java.util.Map p1)`
- `public long hset(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public long hset(java.lang.String p0, java.util.Map p1)`
- `public long hsetnx(byte[] p0, byte[] p1, byte[] p2)`
- `public long hsetnx(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public long hstrlen(byte[] p0, byte[] p1)`
- `public long hstrlen(java.lang.String p0, java.lang.String p1)`
- `public java.util.List hvals(byte[] p0)`
- `public java.util.List hvals(java.lang.String p0)`
- `public long incr(byte[] p0)`
- `public long incr(java.lang.String p0)`
- `public long incrBy(byte[] p0, long p1)`
- `public long incrBy(java.lang.String p0, long p1)`
- `public double incrByFloat(byte[] p0, double p1)`
- `public double incrByFloat(java.lang.String p0, double p1)`
- `public java.lang.String info()`
- `public java.lang.String info(java.lang.String p0)`
- `public boolean isBroken()`
- `public boolean isConnected()`
- `public java.util.Set keys(byte[] p0)`
- `public java.util.Set keys(java.lang.String p0)`
- `public long lastsave()`
- `public redis.clients.jedis.resps.LCSMatchResult lcs(byte[] p0, byte[] p1, redis.clients.jedis.params.LCSParams p2)`
- `public redis.clients.jedis.resps.LCSMatchResult lcs(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.LCSParams p2)`
- `public byte[] lindex(byte[] p0, long p1)`
- `public java.lang.String lindex(java.lang.String p0, long p1)`
- `public long linsert(byte[] p0, redis.clients.jedis.args.ListPosition p1, byte[] p2, byte[] p3)`
- `public long linsert(java.lang.String p0, redis.clients.jedis.args.ListPosition p1, java.lang.String p2, java.lang.String p3)`
- `public long llen(byte[] p0)`
- `public long llen(java.lang.String p0)`
- `public byte[] lmove(byte[] p0, byte[] p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3)`
- `public java.lang.String lmove(java.lang.String p0, java.lang.String p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3)`
- `public redis.clients.jedis.util.KeyValue lmpop(redis.clients.jedis.args.ListDirection p0, byte[]... p1)`
- `public redis.clients.jedis.util.KeyValue lmpop(redis.clients.jedis.args.ListDirection p0, int p1, byte[]... p2)`
- `public redis.clients.jedis.util.KeyValue lmpop(redis.clients.jedis.args.ListDirection p0, int p1, java.lang.String... p2)`
- `public redis.clients.jedis.util.KeyValue lmpop(redis.clients.jedis.args.ListDirection p0, java.lang.String... p1)`
- `public java.lang.String lolwut()`
- `public java.lang.String lolwut(redis.clients.jedis.params.LolwutParams p0)`
- `public byte[] lpop(byte[] p0)`
- `public java.util.List lpop(byte[] p0, int p1)`
- `public java.lang.String lpop(java.lang.String p0)`
- `public java.util.List lpop(java.lang.String p0, int p1)`
- `public java.lang.Long lpos(byte[] p0, byte[] p1)`
- `public java.lang.Long lpos(byte[] p0, byte[] p1, redis.clients.jedis.params.LPosParams p2)`
- `public java.util.List lpos(byte[] p0, byte[] p1, redis.clients.jedis.params.LPosParams p2, long p3)`
- `public java.lang.Long lpos(java.lang.String p0, java.lang.String p1)`
- `public java.lang.Long lpos(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.LPosParams p2)`
- `public java.util.List lpos(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.LPosParams p2, long p3)`
- `public long lpush(byte[] p0, byte[]... p1)`
- `public long lpush(java.lang.String p0, java.lang.String... p1)`
- `public long lpushx(byte[] p0, byte[]... p1)`
- `public long lpushx(java.lang.String p0, java.lang.String... p1)`
- `public java.util.List lrange(byte[] p0, long p1, long p2)`
- `public java.util.List lrange(java.lang.String p0, long p1, long p2)`
- `public long lrem(byte[] p0, long p1, byte[] p2)`
- `public long lrem(java.lang.String p0, long p1, java.lang.String p2)`
- `public java.lang.String lset(byte[] p0, long p1, byte[] p2)`
- `public java.lang.String lset(java.lang.String p0, long p1, java.lang.String p2)`
- `public java.lang.String ltrim(byte[] p0, long p1, long p2)`
- `public java.lang.String ltrim(java.lang.String p0, long p1, long p2)`
- `public java.lang.String memoryDoctor()`
- `public byte[] memoryDoctorBinary()`
- `public java.lang.String memoryPurge()`
- `public java.util.Map memoryStats()`
- `public java.lang.Long memoryUsage(byte[] p0)`
- `public java.lang.Long memoryUsage(byte[] p0, int p1)`
- `public java.lang.Long memoryUsage(java.lang.String p0)`
- `public java.lang.Long memoryUsage(java.lang.String p0, int p1)`
- `public java.util.List mget(byte[]... p0)`
- `public java.util.List mget(java.lang.String... p0)`
- `public java.lang.String migrate(java.lang.String p0, int p1, byte[] p2, int p3)`
- `public java.lang.String migrate(java.lang.String p0, int p1, byte[] p2, int p3, int p4)`
- `public java.lang.String migrate(java.lang.String p0, int p1, int p2, int p3, redis.clients.jedis.params.MigrateParams p4, byte[]... p5)`
- `public java.lang.String migrate(java.lang.String p0, int p1, int p2, int p3, redis.clients.jedis.params.MigrateParams p4, java.lang.String... p5)`
- `public java.lang.String migrate(java.lang.String p0, int p1, int p2, redis.clients.jedis.params.MigrateParams p3, byte[]... p4)`
- `public java.lang.String migrate(java.lang.String p0, int p1, int p2, redis.clients.jedis.params.MigrateParams p3, java.lang.String... p4)`
- `public java.lang.String migrate(java.lang.String p0, int p1, java.lang.String p2, int p3)`
- `public java.lang.String migrate(java.lang.String p0, int p1, java.lang.String p2, int p3, int p4)`
- `public java.util.List moduleList()`
- `public java.lang.String moduleLoad(java.lang.String p0)`
- `public java.lang.String moduleLoad(java.lang.String p0, java.lang.String... p1)`
- `public java.lang.String moduleUnload(java.lang.String p0)`
- `public void monitor(redis.clients.jedis.JedisMonitor p0)`
- `public long move(byte[] p0, int p1)`
- `public long move(java.lang.String p0, int p1)`
- `public java.lang.String mset(byte[]... p0)`
- `public java.lang.String mset(java.lang.String... p0)`
- `public long msetnx(byte[]... p0)`
- `public long msetnx(java.lang.String... p0)`
- `public redis.clients.jedis.Transaction multi()`
- `public byte[] objectEncoding(byte[] p0)`
- `public java.lang.String objectEncoding(java.lang.String p0)`
- `public java.lang.Long objectFreq(byte[] p0)`
- `public java.lang.Long objectFreq(java.lang.String p0)`
- `public java.util.List objectHelp()`
- `public java.util.List objectHelpBinary()`
- `public java.lang.Long objectIdletime(byte[] p0)`
- `public java.lang.Long objectIdletime(java.lang.String p0)`
- `public java.lang.Long objectRefcount(byte[] p0)`
- `public java.lang.Long objectRefcount(java.lang.String p0)`
- `public long persist(byte[] p0)`
- `public long persist(java.lang.String p0)`
- `public long pexpire(byte[] p0, long p1)`
- `public long pexpire(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public long pexpire(java.lang.String p0, long p1)`
- `public long pexpire(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public long pexpireAt(byte[] p0, long p1)`
- `public long pexpireAt(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public long pexpireAt(java.lang.String p0, long p1)`
- `public long pexpireAt(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public long pexpireTime(byte[] p0)`
- `public long pexpireTime(java.lang.String p0)`
- `public long pfadd(byte[] p0, byte[]... p1)`
- `public long pfadd(java.lang.String p0, java.lang.String... p1)`
- `public long pfcount(byte[] p0)`
- `public long pfcount(byte[]... p0)`
- `public long pfcount(java.lang.String p0)`
- `public long pfcount(java.lang.String... p0)`
- `public java.lang.String pfmerge(byte[] p0, byte[]... p1)`
- `public java.lang.String pfmerge(java.lang.String p0, java.lang.String... p1)`
- `public java.lang.String ping()`
- `public byte[] ping(byte[] p0)`
- `public java.lang.String ping(java.lang.String p0)`
- `public redis.clients.jedis.Pipeline pipelined()`
- `public java.lang.String psetex(byte[] p0, long p1, byte[] p2)`
- `public java.lang.String psetex(java.lang.String p0, long p1, java.lang.String p2)`
- `public void psubscribe(redis.clients.jedis.BinaryJedisPubSub p0, byte[]... p1)`
- `public void psubscribe(redis.clients.jedis.JedisPubSub p0, java.lang.String... p1)`
- `public long pttl(byte[] p0)`
- `public long pttl(java.lang.String p0)`
- `public long publish(byte[] p0, byte[] p1)`
- `public long publish(java.lang.String p0, java.lang.String p1)`
- `public java.util.List pubsubChannels()`
- `public java.util.List pubsubChannels(java.lang.String p0)`
- `public java.lang.Long pubsubNumPat()`
- `public java.util.Map pubsubNumSub(java.lang.String... p0)`
- `public java.lang.String quit()`
- `public byte[] randomBinaryKey()`
- `public java.lang.String randomKey()`
- `public java.lang.String readonly()`
- `public java.lang.String readwrite()`
- `public java.lang.String rename(byte[] p0, byte[] p1)`
- `public java.lang.String rename(java.lang.String p0, java.lang.String p1)`
- `public long renamenx(byte[] p0, byte[] p1)`
- `public long renamenx(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String replicaof(java.lang.String p0, int p1)`
- `public java.lang.String replicaofNoOne()`
- `public void resetState()`
- `public java.lang.String restore(byte[] p0, long p1, byte[] p2)`
- `public java.lang.String restore(byte[] p0, long p1, byte[] p2, redis.clients.jedis.params.RestoreParams p3)`
- `public java.lang.String restore(java.lang.String p0, long p1, byte[] p2)`
- `public java.lang.String restore(java.lang.String p0, long p1, byte[] p2, redis.clients.jedis.params.RestoreParams p3)`
- `public java.util.List role()`
- `public java.util.List roleBinary()`
- `public byte[] rpop(byte[] p0)`
- `public java.util.List rpop(byte[] p0, int p1)`
- `public java.lang.String rpop(java.lang.String p0)`
- `public java.util.List rpop(java.lang.String p0, int p1)`
- `public byte[] rpoplpush(byte[] p0, byte[] p1)`
- `public java.lang.String rpoplpush(java.lang.String p0, java.lang.String p1)`
- `public long rpush(byte[] p0, byte[]... p1)`
- `public long rpush(java.lang.String p0, java.lang.String... p1)`
- `public long rpushx(byte[] p0, byte[]... p1)`
- `public long rpushx(java.lang.String p0, java.lang.String... p1)`
- `public long sadd(byte[] p0, byte[]... p1)`
- `public long sadd(java.lang.String p0, java.lang.String... p1)`
- `public java.lang.String save()`
- `public redis.clients.jedis.resps.ScanResult scan(byte[] p0)`
- `public redis.clients.jedis.resps.ScanResult scan(byte[] p0, redis.clients.jedis.params.ScanParams p1)`
- `public redis.clients.jedis.resps.ScanResult scan(byte[] p0, redis.clients.jedis.params.ScanParams p1, byte[] p2)`
- `public redis.clients.jedis.resps.ScanResult scan(java.lang.String p0)`
- `public redis.clients.jedis.resps.ScanResult scan(java.lang.String p0, redis.clients.jedis.params.ScanParams p1)`
- `public redis.clients.jedis.resps.ScanResult scan(java.lang.String p0, redis.clients.jedis.params.ScanParams p1, java.lang.String p2)`
- `public long scard(byte[] p0)`
- `public long scard(java.lang.String p0)`
- `public java.lang.Boolean scriptExists(byte[] p0)`
- `public java.util.List scriptExists(byte[]... p0)`
- `public java.lang.Boolean scriptExists(java.lang.String p0)`
- `public java.util.List scriptExists(java.lang.String... p0)`
- `public java.lang.String scriptFlush()`
- `public java.lang.String scriptFlush(redis.clients.jedis.args.FlushMode p0)`
- `public java.lang.String scriptKill()`
- `public byte[] scriptLoad(byte[] p0)`
- `public java.lang.String scriptLoad(java.lang.String p0)`
- `public java.util.Set sdiff(byte[]... p0)`
- `public java.util.Set sdiff(java.lang.String... p0)`
- `public long sdiffstore(byte[] p0, byte[]... p1)`
- `public long sdiffstore(java.lang.String p0, java.lang.String... p1)`
- `public java.lang.String select(int p0)`
- `public java.lang.Object sendBlockingCommand(redis.clients.jedis.commands.ProtocolCommand p0, byte[]... p1)`
- `public java.lang.Object sendBlockingCommand(redis.clients.jedis.commands.ProtocolCommand p0, java.lang.String... p1)`
- `public java.lang.Object sendCommand(redis.clients.jedis.commands.ProtocolCommand p0)`
- `public java.lang.Object sendCommand(redis.clients.jedis.commands.ProtocolCommand p0, byte[]... p1)`
- `public java.lang.Object sendCommand(redis.clients.jedis.commands.ProtocolCommand p0, java.lang.String... p1)`
- `public java.lang.String sentinelFailover(java.lang.String p0)`
- `public java.util.List sentinelGetMasterAddrByName(java.lang.String p0)`
- `public java.util.Map sentinelMaster(java.lang.String p0)`
- `public java.util.List sentinelMasters()`
- `public java.lang.String sentinelMonitor(java.lang.String p0, java.lang.String p1, int p2, int p3)`
- `public java.lang.String sentinelMyId()`
- `public java.lang.String sentinelRemove(java.lang.String p0)`
- `public java.util.List sentinelReplicas(java.lang.String p0)`
- `public java.lang.Long sentinelReset(java.lang.String p0)`
- `public java.util.List sentinelSentinels(java.lang.String p0)`
- `public java.lang.String sentinelSet(java.lang.String p0, java.util.Map p1)`
- `public java.util.List sentinelSlaves(java.lang.String p0)`
- `public java.lang.String set(byte[] p0, byte[] p1)`
- `public java.lang.String set(byte[] p0, byte[] p1, redis.clients.jedis.params.SetParams p2)`
- `public java.lang.String set(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String set(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.SetParams p2)`
- `protected void setDataSource(redis.clients.jedis.util.Pool p0)`
- `public byte[] setGet(byte[] p0, byte[] p1, redis.clients.jedis.params.SetParams p2)`
- `public java.lang.String setGet(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.SetParams p2)`
- `public boolean setbit(byte[] p0, long p1, boolean p2)`
- `public boolean setbit(java.lang.String p0, long p1, boolean p2)`
- `public java.lang.String setex(byte[] p0, long p1, byte[] p2)`
- `public java.lang.String setex(java.lang.String p0, long p1, java.lang.String p2)`
- `public long setnx(byte[] p0, byte[] p1)`
- `public long setnx(java.lang.String p0, java.lang.String p1)`
- `public long setrange(byte[] p0, long p1, byte[] p2)`
- `public long setrange(java.lang.String p0, long p1, java.lang.String p2)`
- `public void shutdown() throws redis.clients.jedis.exceptions.JedisException`
- `public void shutdown(redis.clients.jedis.args.SaveMode p0) throws redis.clients.jedis.exceptions.JedisException`
- `public void shutdown(redis.clients.jedis.params.ShutdownParams p0) throws redis.clients.jedis.exceptions.JedisException`
- `public java.lang.String shutdownAbort()`
- `public java.util.Set sinter(byte[]... p0)`
- `public java.util.Set sinter(java.lang.String... p0)`
- `public long sintercard(byte[]... p0)`
- `public long sintercard(int p0, byte[]... p1)`
- `public long sintercard(int p0, java.lang.String... p1)`
- `public long sintercard(java.lang.String... p0)`
- `public long sinterstore(byte[] p0, byte[]... p1)`
- `public long sinterstore(java.lang.String p0, java.lang.String... p1)`
- `public boolean sismember(byte[] p0, byte[] p1)`
- `public boolean sismember(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String slaveof(java.lang.String p0, int p1)`
- `public java.lang.String slaveofNoOne()`
- `public java.util.List slowlogGet()`
- `public java.util.List slowlogGet(long p0)`
- `public java.util.List slowlogGetBinary()`
- `public java.util.List slowlogGetBinary(long p0)`
- `public long slowlogLen()`
- `public java.lang.String slowlogReset()`
- `public java.util.Set smembers(byte[] p0)`
- `public java.util.Set smembers(java.lang.String p0)`
- `public java.util.List smismember(byte[] p0, byte[]... p1)`
- `public java.util.List smismember(java.lang.String p0, java.lang.String... p1)`
- `public long smove(byte[] p0, byte[] p1, byte[] p2)`
- `public long smove(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.util.List sort(byte[] p0)`
- `public long sort(byte[] p0, byte[] p1)`
- `public java.util.List sort(byte[] p0, redis.clients.jedis.params.SortingParams p1)`
- `public long sort(byte[] p0, redis.clients.jedis.params.SortingParams p1, byte[] p2)`
- `public java.util.List sort(java.lang.String p0)`
- `public long sort(java.lang.String p0, java.lang.String p1)`
- `public java.util.List sort(java.lang.String p0, redis.clients.jedis.params.SortingParams p1)`
- `public long sort(java.lang.String p0, redis.clients.jedis.params.SortingParams p1, java.lang.String p2)`
- `public java.util.List sortReadonly(byte[] p0, redis.clients.jedis.params.SortingParams p1)`
- `public java.util.List sortReadonly(java.lang.String p0, redis.clients.jedis.params.SortingParams p1)`
- `public byte[] spop(byte[] p0)`
- `public java.util.Set spop(byte[] p0, long p1)`
- `public java.lang.String spop(java.lang.String p0)`
- `public java.util.Set spop(java.lang.String p0, long p1)`
- `public byte[] srandmember(byte[] p0)`
- `public java.util.List srandmember(byte[] p0, int p1)`
- `public java.lang.String srandmember(java.lang.String p0)`
- `public java.util.List srandmember(java.lang.String p0, int p1)`
- `public long srem(byte[] p0, byte[]... p1)`
- `public long srem(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.resps.ScanResult sscan(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.resps.ScanResult sscan(byte[] p0, byte[] p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.resps.ScanResult sscan(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.resps.LCSMatchResult strAlgoLCSKeys(byte[] p0, byte[] p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public redis.clients.jedis.resps.LCSMatchResult strAlgoLCSKeys(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public redis.clients.jedis.resps.LCSMatchResult strAlgoLCSStrings(byte[] p0, byte[] p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public redis.clients.jedis.resps.LCSMatchResult strAlgoLCSStrings(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public long strlen(byte[] p0)`
- `public long strlen(java.lang.String p0)`
- `public void subscribe(redis.clients.jedis.BinaryJedisPubSub p0, byte[]... p1)`
- `public void subscribe(redis.clients.jedis.JedisPubSub p0, java.lang.String... p1)`
- `public byte[] substr(byte[] p0, int p1, int p2)`
- `public java.lang.String substr(java.lang.String p0, int p1, int p2)`
- `public java.util.Set sunion(byte[]... p0)`
- `public java.util.Set sunion(java.lang.String... p0)`
- `public long sunionstore(byte[] p0, byte[]... p1)`
- `public long sunionstore(java.lang.String p0, java.lang.String... p1)`
- `public java.lang.String swapDB(int p0, int p1)`
- `public java.util.List time()`
- `public java.lang.String toString()`
- `public long touch(byte[] p0)`
- `public long touch(byte[]... p0)`
- `public long touch(java.lang.String p0)`
- `public long touch(java.lang.String... p0)`
- `public long ttl(byte[] p0)`
- `public long ttl(java.lang.String p0)`
- `public java.lang.String type(byte[] p0)`
- `public java.lang.String type(java.lang.String p0)`
- `public long unlink(byte[] p0)`
- `public long unlink(byte[]... p0)`
- `public long unlink(java.lang.String p0)`
- `public long unlink(java.lang.String... p0)`
- `public java.lang.String unwatch()`
- `public long waitReplicas(int p0, long p1)`
- `public java.lang.String watch(byte[]... p0)`
- `public java.lang.String watch(java.lang.String... p0)`
- `public long xack(byte[] p0, byte[] p1, byte[]... p2)`
- `public long xack(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID... p2)`
- `public byte[] xadd(byte[] p0, redis.clients.jedis.params.XAddParams p1, java.util.Map p2)`
- `public redis.clients.jedis.StreamEntryID xadd(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, java.util.Map p2)`
- `public redis.clients.jedis.StreamEntryID xadd(java.lang.String p0, redis.clients.jedis.params.XAddParams p1, java.util.Map p2)`
- `public java.util.List xautoclaim(byte[] p0, byte[] p1, byte[] p2, long p3, byte[] p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public java.util.Map$Entry xautoclaim(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.StreamEntryID p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public java.util.List xautoclaimJustId(byte[] p0, byte[] p1, byte[] p2, long p3, byte[] p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public java.util.Map$Entry xautoclaimJustId(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.StreamEntryID p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public java.util.List xclaim(byte[] p0, byte[] p1, byte[] p2, long p3, redis.clients.jedis.params.XClaimParams p4, byte[]... p5)`
- `public java.util.List xclaim(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.params.XClaimParams p4, redis.clients.jedis.StreamEntryID... p5)`
- `public java.util.List xclaimJustId(byte[] p0, byte[] p1, byte[] p2, long p3, redis.clients.jedis.params.XClaimParams p4, byte[]... p5)`
- `public java.util.List xclaimJustId(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.params.XClaimParams p4, redis.clients.jedis.StreamEntryID... p5)`
- `public long xdel(byte[] p0, byte[]... p1)`
- `public long xdel(java.lang.String p0, redis.clients.jedis.StreamEntryID... p1)`
- `public java.lang.String xgroupCreate(byte[] p0, byte[] p1, byte[] p2, boolean p3)`
- `public java.lang.String xgroupCreate(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID p2, boolean p3)`
- `public boolean xgroupCreateConsumer(byte[] p0, byte[] p1, byte[] p2)`
- `public boolean xgroupCreateConsumer(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public long xgroupDelConsumer(byte[] p0, byte[] p1, byte[] p2)`
- `public long xgroupDelConsumer(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public long xgroupDestroy(byte[] p0, byte[] p1)`
- `public long xgroupDestroy(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String xgroupSetID(byte[] p0, byte[] p1, byte[] p2)`
- `public java.lang.String xgroupSetID(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID p2)`
- `public java.util.List xinfoConsumers(byte[] p0, byte[] p1)`
- `public java.util.List xinfoConsumers(java.lang.String p0, java.lang.String p1)`
- `public java.util.List xinfoGroup(byte[] p0)`
- `public java.util.List xinfoGroup(java.lang.String p0)`
- `public java.util.List xinfoGroups(byte[] p0)`
- `public java.util.List xinfoGroups(java.lang.String p0)`
- `public java.lang.Object xinfoStream(byte[] p0)`
- `public redis.clients.jedis.resps.StreamInfo xinfoStream(java.lang.String p0)`
- `public java.lang.Object xinfoStreamFull(byte[] p0)`
- `public java.lang.Object xinfoStreamFull(byte[] p0, int p1)`
- `public redis.clients.jedis.resps.StreamFullInfo xinfoStreamFull(java.lang.String p0)`
- `public redis.clients.jedis.resps.StreamFullInfo xinfoStreamFull(java.lang.String p0, int p1)`
- `public long xlen(byte[] p0)`
- `public long xlen(java.lang.String p0)`
- `public java.lang.Object xpending(byte[] p0, byte[] p1)`
- `public java.util.List xpending(byte[] p0, byte[] p1, byte[] p2, byte[] p3, int p4, byte[] p5)`
- `public java.util.List xpending(byte[] p0, byte[] p1, redis.clients.jedis.params.XPendingParams p2)`
- `public redis.clients.jedis.resps.StreamPendingSummary xpending(java.lang.String p0, java.lang.String p1)`
- `public java.util.List xpending(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID p2, redis.clients.jedis.StreamEntryID p3, int p4, java.lang.String p5)`
- `public java.util.List xpending(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.XPendingParams p2)`
- `public java.util.List xrange(byte[] p0, byte[] p1, byte[] p2)`
- `public java.util.List xrange(byte[] p0, byte[] p1, byte[] p2, int p3)`
- `public java.util.List xrange(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.util.List xrange(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3)`
- `public java.util.List xrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2)`
- `public java.util.List xrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2, int p3)`
- `public java.util.List xread(redis.clients.jedis.params.XReadParams p0, java.util.Map$Entry... p1)`
- `public java.util.List xread(redis.clients.jedis.params.XReadParams p0, java.util.Map p1)`
- `public java.util.List xreadGroup(byte[] p0, byte[] p1, redis.clients.jedis.params.XReadGroupParams p2, java.util.Map$Entry... p3)`
- `public java.util.List xreadGroup(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.XReadGroupParams p2, java.util.Map p3)`
- `public java.util.List xrevrange(byte[] p0, byte[] p1, byte[] p2)`
- `public java.util.List xrevrange(byte[] p0, byte[] p1, byte[] p2, int p3)`
- `public java.util.List xrevrange(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.util.List xrevrange(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3)`
- `public java.util.List xrevrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2)`
- `public java.util.List xrevrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2, int p3)`
- `public long xtrim(byte[] p0, long p1, boolean p2)`
- `public long xtrim(byte[] p0, redis.clients.jedis.params.XTrimParams p1)`
- `public long xtrim(java.lang.String p0, long p1, boolean p2)`
- `public long xtrim(java.lang.String p0, redis.clients.jedis.params.XTrimParams p1)`
- `public long zadd(byte[] p0, double p1, byte[] p2)`
- `public long zadd(byte[] p0, double p1, byte[] p2, redis.clients.jedis.params.ZAddParams p3)`
- `public long zadd(byte[] p0, java.util.Map p1)`
- `public long zadd(byte[] p0, java.util.Map p1, redis.clients.jedis.params.ZAddParams p2)`
- `public long zadd(java.lang.String p0, double p1, java.lang.String p2)`
- `public long zadd(java.lang.String p0, double p1, java.lang.String p2, redis.clients.jedis.params.ZAddParams p3)`
- `public long zadd(java.lang.String p0, java.util.Map p1)`
- `public long zadd(java.lang.String p0, java.util.Map p1, redis.clients.jedis.params.ZAddParams p2)`
- `public java.lang.Double zaddIncr(byte[] p0, double p1, byte[] p2, redis.clients.jedis.params.ZAddParams p3)`
- `public java.lang.Double zaddIncr(java.lang.String p0, double p1, java.lang.String p2, redis.clients.jedis.params.ZAddParams p3)`
- `public long zcard(byte[] p0)`
- `public long zcard(java.lang.String p0)`
- `public long zcount(byte[] p0, byte[] p1, byte[] p2)`
- `public long zcount(byte[] p0, double p1, double p2)`
- `public long zcount(java.lang.String p0, double p1, double p2)`
- `public long zcount(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.util.Set zdiff(byte[]... p0)`
- `public java.util.Set zdiff(java.lang.String... p0)`
- `public long zdiffStore(byte[] p0, byte[]... p1)`
- `public long zdiffStore(java.lang.String p0, java.lang.String... p1)`
- `public java.util.Set zdiffWithScores(byte[]... p0)`
- `public java.util.Set zdiffWithScores(java.lang.String... p0)`
- `public double zincrby(byte[] p0, double p1, byte[] p2)`
- `public java.lang.Double zincrby(byte[] p0, double p1, byte[] p2, redis.clients.jedis.params.ZIncrByParams p3)`
- `public double zincrby(java.lang.String p0, double p1, java.lang.String p2)`
- `public java.lang.Double zincrby(java.lang.String p0, double p1, java.lang.String p2, redis.clients.jedis.params.ZIncrByParams p3)`
- `public java.util.Set zinter(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public java.util.Set zinter(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public java.util.Set zinterWithScores(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public java.util.Set zinterWithScores(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public long zintercard(byte[]... p0)`
- `public long zintercard(java.lang.String... p0)`
- `public long zintercard(long p0, byte[]... p1)`
- `public long zintercard(long p0, java.lang.String... p1)`
- `public long zinterstore(byte[] p0, byte[]... p1)`
- `public long zinterstore(byte[] p0, redis.clients.jedis.params.ZParams p1, byte[]... p2)`
- `public long zinterstore(java.lang.String p0, java.lang.String... p1)`
- `public long zinterstore(java.lang.String p0, redis.clients.jedis.params.ZParams p1, java.lang.String... p2)`
- `public long zlexcount(byte[] p0, byte[] p1, byte[] p2)`
- `public long zlexcount(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.util.KeyValue zmpop(redis.clients.jedis.args.SortedSetOption p0, byte[]... p1)`
- `public redis.clients.jedis.util.KeyValue zmpop(redis.clients.jedis.args.SortedSetOption p0, int p1, byte[]... p2)`
- `public redis.clients.jedis.util.KeyValue zmpop(redis.clients.jedis.args.SortedSetOption p0, int p1, java.lang.String... p2)`
- `public redis.clients.jedis.util.KeyValue zmpop(redis.clients.jedis.args.SortedSetOption p0, java.lang.String... p1)`
- `public java.util.List zmscore(byte[] p0, byte[]... p1)`
- `public java.util.List zmscore(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.resps.Tuple zpopmax(byte[] p0)`
- `public java.util.List zpopmax(byte[] p0, int p1)`
- `public redis.clients.jedis.resps.Tuple zpopmax(java.lang.String p0)`
- `public java.util.List zpopmax(java.lang.String p0, int p1)`
- `public redis.clients.jedis.resps.Tuple zpopmin(byte[] p0)`
- `public java.util.List zpopmin(byte[] p0, int p1)`
- `public redis.clients.jedis.resps.Tuple zpopmin(java.lang.String p0)`
- `public java.util.List zpopmin(java.lang.String p0, int p1)`
- `public byte[] zrandmember(byte[] p0)`
- `public java.util.List zrandmember(byte[] p0, long p1)`
- `public java.lang.String zrandmember(java.lang.String p0)`
- `public java.util.List zrandmember(java.lang.String p0, long p1)`
- `public java.util.List zrandmemberWithScores(byte[] p0, long p1)`
- `public java.util.List zrandmemberWithScores(java.lang.String p0, long p1)`
- `public java.util.List zrange(byte[] p0, long p1, long p2)`
- `public java.util.List zrange(byte[] p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public java.util.List zrange(java.lang.String p0, long p1, long p2)`
- `public java.util.List zrange(java.lang.String p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public java.util.List zrangeByLex(byte[] p0, byte[] p1, byte[] p2)`
- `public java.util.List zrangeByLex(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public java.util.List zrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.util.List zrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public java.util.List zrangeByScore(byte[] p0, byte[] p1, byte[] p2)`
- `public java.util.List zrangeByScore(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public java.util.List zrangeByScore(byte[] p0, double p1, double p2)`
- `public java.util.List zrangeByScore(byte[] p0, double p1, double p2, int p3, int p4)`
- `public java.util.List zrangeByScore(java.lang.String p0, double p1, double p2)`
- `public java.util.List zrangeByScore(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public java.util.List zrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.util.List zrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public java.util.List zrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2)`
- `public java.util.List zrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public java.util.List zrangeByScoreWithScores(byte[] p0, double p1, double p2)`
- `public java.util.List zrangeByScoreWithScores(byte[] p0, double p1, double p2, int p3, int p4)`
- `public java.util.List zrangeByScoreWithScores(java.lang.String p0, double p1, double p2)`
- `public java.util.List zrangeByScoreWithScores(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public java.util.List zrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.util.List zrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public java.util.List zrangeWithScores(byte[] p0, long p1, long p2)`
- `public java.util.List zrangeWithScores(byte[] p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public java.util.List zrangeWithScores(java.lang.String p0, long p1, long p2)`
- `public java.util.List zrangeWithScores(java.lang.String p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public long zrangestore(byte[] p0, byte[] p1, redis.clients.jedis.params.ZRangeParams p2)`
- `public long zrangestore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ZRangeParams p2)`
- `public java.lang.Long zrank(byte[] p0, byte[] p1)`
- `public java.lang.Long zrank(java.lang.String p0, java.lang.String p1)`
- `public long zrem(byte[] p0, byte[]... p1)`
- `public long zrem(java.lang.String p0, java.lang.String... p1)`
- `public long zremrangeByLex(byte[] p0, byte[] p1, byte[] p2)`
- `public long zremrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public long zremrangeByRank(byte[] p0, long p1, long p2)`
- `public long zremrangeByRank(java.lang.String p0, long p1, long p2)`
- `public long zremrangeByScore(byte[] p0, byte[] p1, byte[] p2)`
- `public long zremrangeByScore(byte[] p0, double p1, double p2)`
- `public long zremrangeByScore(java.lang.String p0, double p1, double p2)`
- `public long zremrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.util.List zrevrange(byte[] p0, long p1, long p2)`
- `public java.util.List zrevrange(java.lang.String p0, long p1, long p2)`
- `public java.util.List zrevrangeByLex(byte[] p0, byte[] p1, byte[] p2)`
- `public java.util.List zrevrangeByLex(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public java.util.List zrevrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.util.List zrevrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public java.util.List zrevrangeByScore(byte[] p0, byte[] p1, byte[] p2)`
- `public java.util.List zrevrangeByScore(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public java.util.List zrevrangeByScore(byte[] p0, double p1, double p2)`
- `public java.util.List zrevrangeByScore(byte[] p0, double p1, double p2, int p3, int p4)`
- `public java.util.List zrevrangeByScore(java.lang.String p0, double p1, double p2)`
- `public java.util.List zrevrangeByScore(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public java.util.List zrevrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.util.List zrevrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public java.util.List zrevrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2)`
- `public java.util.List zrevrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public java.util.List zrevrangeByScoreWithScores(byte[] p0, double p1, double p2)`
- `public java.util.List zrevrangeByScoreWithScores(byte[] p0, double p1, double p2, int p3, int p4)`
- `public java.util.List zrevrangeByScoreWithScores(java.lang.String p0, double p1, double p2)`
- `public java.util.List zrevrangeByScoreWithScores(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public java.util.List zrevrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.util.List zrevrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public java.util.List zrevrangeWithScores(byte[] p0, long p1, long p2)`
- `public java.util.List zrevrangeWithScores(java.lang.String p0, long p1, long p2)`
- `public java.lang.Long zrevrank(byte[] p0, byte[] p1)`
- `public java.lang.Long zrevrank(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.resps.ScanResult zscan(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.resps.ScanResult zscan(byte[] p0, byte[] p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.resps.ScanResult zscan(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ScanParams p2)`
- `public java.lang.Double zscore(byte[] p0, byte[] p1)`
- `public java.lang.Double zscore(java.lang.String p0, java.lang.String p1)`
- `public java.util.Set zunion(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public java.util.Set zunion(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public java.util.Set zunionWithScores(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public java.util.Set zunionWithScores(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public long zunionstore(byte[] p0, byte[]... p1)`
- `public long zunionstore(byte[] p0, redis.clients.jedis.params.ZParams p1, byte[]... p2)`
- `public long zunionstore(java.lang.String p0, java.lang.String... p1)`
- `public long zunionstore(java.lang.String p0, redis.clients.jedis.params.ZParams p1, java.lang.String... p2)`

---

## public abstract interface `redis.clients.jedis.JedisClientConfig`

**Methods:**
- `public default int getBlockingSocketTimeoutMillis()`
- `public default java.lang.String getClientName()`
- `public default int getConnectionTimeoutMillis()`
- `public default int getDatabase()`
- `public default redis.clients.jedis.HostAndPortMapper getHostAndPortMapper()`
- `public default javax.net.ssl.HostnameVerifier getHostnameVerifier()`
- `public default java.lang.String getPassword()`
- `public default int getSocketTimeoutMillis()`
- `public default javax.net.ssl.SSLParameters getSslParameters()`
- `public default javax.net.ssl.SSLSocketFactory getSslSocketFactory()`
- `public default java.lang.String getUser()`
- `public default boolean isSsl()`
- `public default void updatePassword(java.lang.String p0)`

---

## public class `redis.clients.jedis.JedisCluster`
extends `redis.clients.jedis.UnifiedJedis`  

**Constructors:**
- `public JedisCluster(java.util.Set p0)`
- `public JedisCluster(java.util.Set p0, int p1)`
- `public JedisCluster(java.util.Set p0, int p1, int p2)`
- `public JedisCluster(java.util.Set p0, int p1, int p2, int p3, int p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, org.apache.commons.pool2.impl.GenericObjectPoolConfig p8)`
- `public JedisCluster(java.util.Set p0, int p1, int p2, int p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, org.apache.commons.pool2.impl.GenericObjectPoolConfig p7)`
- `public JedisCluster(java.util.Set p0, int p1, int p2, int p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, org.apache.commons.pool2.impl.GenericObjectPoolConfig p7, boolean p8)`
- `public JedisCluster(java.util.Set p0, int p1, int p2, int p3, java.lang.String p4, java.lang.String p5, org.apache.commons.pool2.impl.GenericObjectPoolConfig p6)`
- `public JedisCluster(java.util.Set p0, int p1, int p2, int p3, java.lang.String p4, java.lang.String p5, org.apache.commons.pool2.impl.GenericObjectPoolConfig p6, boolean p7)`
- `public JedisCluster(java.util.Set p0, int p1, int p2, int p3, java.lang.String p4, org.apache.commons.pool2.impl.GenericObjectPoolConfig p5)`
- `public JedisCluster(java.util.Set p0, int p1, int p2, int p3, org.apache.commons.pool2.impl.GenericObjectPoolConfig p4)`
- `public JedisCluster(java.util.Set p0, int p1, int p2, org.apache.commons.pool2.impl.GenericObjectPoolConfig p3)`
- `public JedisCluster(java.util.Set p0, int p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2)`
- `public JedisCluster(java.util.Set p0, java.lang.String p1, java.lang.String p2)`
- `public JedisCluster(java.util.Set p0, java.lang.String p1, java.lang.String p2, redis.clients.jedis.HostAndPortMapper p3)`
- `public JedisCluster(java.util.Set p0, org.apache.commons.pool2.impl.GenericObjectPoolConfig p1)`
- `public JedisCluster(java.util.Set p0, redis.clients.jedis.JedisClientConfig p1)`
- `public JedisCluster(java.util.Set p0, redis.clients.jedis.JedisClientConfig p1, int p2)`
- `public JedisCluster(java.util.Set p0, redis.clients.jedis.JedisClientConfig p1, int p2, java.time.Duration p3)`
- `public JedisCluster(java.util.Set p0, redis.clients.jedis.JedisClientConfig p1, int p2, java.time.Duration p3, org.apache.commons.pool2.impl.GenericObjectPoolConfig p4)`
- `public JedisCluster(java.util.Set p0, redis.clients.jedis.JedisClientConfig p1, int p2, org.apache.commons.pool2.impl.GenericObjectPoolConfig p3)`
- `public JedisCluster(redis.clients.jedis.HostAndPort p0)`
- `public JedisCluster(redis.clients.jedis.HostAndPort p0, int p1)`
- `public JedisCluster(redis.clients.jedis.HostAndPort p0, int p1, int p2)`
- `public JedisCluster(redis.clients.jedis.HostAndPort p0, int p1, int p2, int p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, org.apache.commons.pool2.impl.GenericObjectPoolConfig p7)`
- `public JedisCluster(redis.clients.jedis.HostAndPort p0, int p1, int p2, int p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, org.apache.commons.pool2.impl.GenericObjectPoolConfig p7, boolean p8)`
- `public JedisCluster(redis.clients.jedis.HostAndPort p0, int p1, int p2, int p3, java.lang.String p4, java.lang.String p5, org.apache.commons.pool2.impl.GenericObjectPoolConfig p6)`
- `public JedisCluster(redis.clients.jedis.HostAndPort p0, int p1, int p2, int p3, java.lang.String p4, java.lang.String p5, org.apache.commons.pool2.impl.GenericObjectPoolConfig p6, boolean p7)`
- `public JedisCluster(redis.clients.jedis.HostAndPort p0, int p1, int p2, int p3, java.lang.String p4, org.apache.commons.pool2.impl.GenericObjectPoolConfig p5)`
- `public JedisCluster(redis.clients.jedis.HostAndPort p0, int p1, int p2, int p3, org.apache.commons.pool2.impl.GenericObjectPoolConfig p4)`
- `public JedisCluster(redis.clients.jedis.HostAndPort p0, int p1, int p2, org.apache.commons.pool2.impl.GenericObjectPoolConfig p3)`
- `public JedisCluster(redis.clients.jedis.HostAndPort p0, int p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2)`
- `public JedisCluster(redis.clients.jedis.HostAndPort p0, org.apache.commons.pool2.impl.GenericObjectPoolConfig p1)`
- `public JedisCluster(redis.clients.jedis.HostAndPort p0, redis.clients.jedis.JedisClientConfig p1, int p2, org.apache.commons.pool2.impl.GenericObjectPoolConfig p3)`
- `public JedisCluster(redis.clients.jedis.providers.ClusterConnectionProvider p0, int p1, java.time.Duration p2)`

**Fields:**
- `public final static int DEFAULT_MAX_ATTEMPTS`
- `public final static int DEFAULT_TIMEOUT`

**Methods:**
- `public java.util.Map getClusterNodes()`
- `public redis.clients.jedis.Connection getConnectionFromSlot(int p0)`

---

## public class `redis.clients.jedis.JedisClusterInfoCache`

**Constructors:**
- `public JedisClusterInfoCache(redis.clients.jedis.JedisClientConfig p0)`
- `public JedisClusterInfoCache(redis.clients.jedis.JedisClientConfig p0, java.util.Set p1)`
- `public JedisClusterInfoCache(redis.clients.jedis.JedisClientConfig p0, org.apache.commons.pool2.impl.GenericObjectPoolConfig p1)`
- `public JedisClusterInfoCache(redis.clients.jedis.JedisClientConfig p0, org.apache.commons.pool2.impl.GenericObjectPoolConfig p1, java.util.Set p2)`

**Methods:**
- `public void assignSlotToNode(int p0, redis.clients.jedis.HostAndPort p1)`
- `public void assignSlotsToNode(java.util.List p0, redis.clients.jedis.HostAndPort p1)`
- `public void discoverClusterNodesAndSlots(redis.clients.jedis.Connection p0)`
- `public redis.clients.jedis.ConnectionPool getNode(java.lang.String p0)`
- `public redis.clients.jedis.ConnectionPool getNode(redis.clients.jedis.HostAndPort p0)`
- `public static java.lang.String getNodeKey(redis.clients.jedis.HostAndPort p0)`
- `public java.util.Map getNodes()`
- `public java.util.List getShuffledNodesPool()`
- `public redis.clients.jedis.HostAndPort getSlotNode(int p0)`
- `public redis.clients.jedis.ConnectionPool getSlotPool(int p0)`
- `public void renewClusterSlots(redis.clients.jedis.Connection p0)`
- `public void reset()`
- `public redis.clients.jedis.ConnectionPool setupNodeIfNotExist(redis.clients.jedis.HostAndPort p0)`

---

## public class `redis.clients.jedis.JedisFactory`
implements `org.apache.commons.pool2.PooledObjectFactory<redis.clients.jedis.Jedis>`  

**Constructors:**
- `protected JedisFactory(java.lang.String p0, int p1, int p2, int p3, int p4, java.lang.String p5, java.lang.String p6, int p7, java.lang.String p8)`
- `protected JedisFactory(java.lang.String p0, int p1, int p2, int p3, int p4, java.lang.String p5, java.lang.String p6, int p7, java.lang.String p8, boolean p9, javax.net.ssl.SSLSocketFactory p10, javax.net.ssl.SSLParameters p11, javax.net.ssl.HostnameVerifier p12)`
- `protected JedisFactory(java.lang.String p0, int p1, int p2, int p3, java.lang.String p4, int p5, java.lang.String p6)`
- `protected JedisFactory(java.lang.String p0, int p1, int p2, int p3, java.lang.String p4, int p5, java.lang.String p6, boolean p7, javax.net.ssl.SSLSocketFactory p8, javax.net.ssl.SSLParameters p9, javax.net.ssl.HostnameVerifier p10)`
- `protected JedisFactory(java.lang.String p0, int p1, int p2, int p3, java.lang.String p4, java.lang.String p5, int p6, java.lang.String p7)`
- `protected JedisFactory(java.lang.String p0, int p1, int p2, int p3, java.lang.String p4, java.lang.String p5, int p6, java.lang.String p7, boolean p8, javax.net.ssl.SSLSocketFactory p9, javax.net.ssl.SSLParameters p10, javax.net.ssl.HostnameVerifier p11)`
- `protected JedisFactory(java.net.URI p0, int p1, int p2, int p3, java.lang.String p4, javax.net.ssl.SSLSocketFactory p5, javax.net.ssl.SSLParameters p6, javax.net.ssl.HostnameVerifier p7)`
- `protected JedisFactory(java.net.URI p0, int p1, int p2, java.lang.String p3)`
- `protected JedisFactory(java.net.URI p0, int p1, int p2, java.lang.String p3, javax.net.ssl.SSLSocketFactory p4, javax.net.ssl.SSLParameters p5, javax.net.ssl.HostnameVerifier p6)`
- `protected JedisFactory(redis.clients.jedis.HostAndPort p0, redis.clients.jedis.JedisClientConfig p1)`
- `protected JedisFactory(redis.clients.jedis.JedisSocketFactory p0, redis.clients.jedis.JedisClientConfig p1)`

**Methods:**
- `public void activateObject(org.apache.commons.pool2.PooledObject p0) throws java.lang.Exception`
- `public void destroyObject(org.apache.commons.pool2.PooledObject p0) throws java.lang.Exception`
- `public org.apache.commons.pool2.PooledObject makeObject() throws java.lang.Exception`
- `public void passivateObject(org.apache.commons.pool2.PooledObject p0) throws java.lang.Exception`
- `public void setPassword(java.lang.String p0)`
- `public boolean validateObject(org.apache.commons.pool2.PooledObject p0)`

---

## public abstract class `redis.clients.jedis.JedisMonitor`

**Constructors:**
- `public JedisMonitor()`

**Fields:**
- `protected redis.clients.jedis.Connection client`

**Methods:**
- `public abstract void onCommand(java.lang.String p0)`
- `public void proceed(redis.clients.jedis.Connection p0)`

---

## public class `redis.clients.jedis.JedisPool`
extends `redis.clients.jedis.util.Pool`  

**Constructors:**
- `public JedisPool()`
- `public JedisPool(java.lang.String p0)`
- `public JedisPool(java.lang.String p0, int p1)`
- `public JedisPool(java.lang.String p0, int p1, boolean p2)`
- `public JedisPool(java.lang.String p0, int p1, boolean p2, javax.net.ssl.SSLSocketFactory p3, javax.net.ssl.SSLParameters p4, javax.net.ssl.HostnameVerifier p5)`
- `public JedisPool(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3)`
- `public JedisPool(java.lang.String p0, javax.net.ssl.SSLSocketFactory p1, javax.net.ssl.SSLParameters p2, javax.net.ssl.HostnameVerifier p3)`
- `public JedisPool(java.net.URI p0)`
- `public JedisPool(java.net.URI p0, int p1)`
- `public JedisPool(java.net.URI p0, int p1, javax.net.ssl.SSLSocketFactory p2, javax.net.ssl.SSLParameters p3, javax.net.ssl.HostnameVerifier p4)`
- `public JedisPool(java.net.URI p0, javax.net.ssl.SSLSocketFactory p1, javax.net.ssl.SSLParameters p2, javax.net.ssl.HostnameVerifier p3)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, boolean p3)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, boolean p3, javax.net.ssl.SSLSocketFactory p4, javax.net.ssl.SSLParameters p5, javax.net.ssl.HostnameVerifier p6)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, boolean p4)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, boolean p4, javax.net.ssl.SSLSocketFactory p5, javax.net.ssl.SSLParameters p6, javax.net.ssl.HostnameVerifier p7)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, int p4, int p5, java.lang.String p6, int p7, java.lang.String p8, boolean p9, javax.net.ssl.SSLSocketFactory p10, javax.net.ssl.SSLParameters p11, javax.net.ssl.HostnameVerifier p12)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, int p4, int p5, java.lang.String p6, java.lang.String p7, int p8, java.lang.String p9)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, int p4, int p5, java.lang.String p6, java.lang.String p7, int p8, java.lang.String p9, boolean p10, javax.net.ssl.SSLSocketFactory p11, javax.net.ssl.SSLParameters p12, javax.net.ssl.HostnameVerifier p13)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, int p4, java.lang.String p5, int p6, java.lang.String p7)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, int p4, java.lang.String p5, int p6, java.lang.String p7, boolean p8)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, int p4, java.lang.String p5, int p6, java.lang.String p7, boolean p8, javax.net.ssl.SSLSocketFactory p9, javax.net.ssl.SSLParameters p10, javax.net.ssl.HostnameVerifier p11)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, int p4, java.lang.String p5, java.lang.String p6, int p7, java.lang.String p8)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, int p4, java.lang.String p5, java.lang.String p6, int p7, java.lang.String p8, boolean p9)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, int p4, java.lang.String p5, java.lang.String p6, int p7, java.lang.String p8, boolean p9, javax.net.ssl.SSLSocketFactory p10, javax.net.ssl.SSLParameters p11, javax.net.ssl.HostnameVerifier p12)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, boolean p5)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, boolean p5, javax.net.ssl.SSLSocketFactory p6, javax.net.ssl.SSLParameters p7, javax.net.ssl.HostnameVerifier p8)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, int p5)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, int p5, boolean p6)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, int p5, boolean p6, javax.net.ssl.SSLSocketFactory p7, javax.net.ssl.SSLParameters p8, javax.net.ssl.HostnameVerifier p9)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, int p5, java.lang.String p6)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, int p5, java.lang.String p6, boolean p7)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, int p5, java.lang.String p6, boolean p7, javax.net.ssl.SSLSocketFactory p8, javax.net.ssl.SSLParameters p9, javax.net.ssl.HostnameVerifier p10)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, java.lang.String p5)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, java.lang.String p5, boolean p6)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, java.lang.String p5, int p6)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, java.lang.String p5, int p6, boolean p7)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, java.lang.String p5, int p6, java.lang.String p7)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, java.lang.String p5, int p6, java.lang.String p7, boolean p8)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, java.lang.String p3, java.lang.String p4)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.net.URI p1)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.net.URI p1, int p2)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.net.URI p1, int p2, int p3)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.net.URI p1, int p2, int p3, int p4, javax.net.ssl.SSLSocketFactory p5, javax.net.ssl.SSLParameters p6, javax.net.ssl.HostnameVerifier p7)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.net.URI p1, int p2, int p3, javax.net.ssl.SSLSocketFactory p4, javax.net.ssl.SSLParameters p5, javax.net.ssl.HostnameVerifier p6)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.net.URI p1, int p2, javax.net.ssl.SSLSocketFactory p3, javax.net.ssl.SSLParameters p4, javax.net.ssl.HostnameVerifier p5)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.net.URI p1, javax.net.ssl.SSLSocketFactory p2, javax.net.ssl.SSLParameters p3, javax.net.ssl.HostnameVerifier p4)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, org.apache.commons.pool2.PooledObjectFactory p1)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, redis.clients.jedis.HostAndPort p1, redis.clients.jedis.JedisClientConfig p2)`
- `public JedisPool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, redis.clients.jedis.JedisSocketFactory p1, redis.clients.jedis.JedisClientConfig p2)`
- `public JedisPool(redis.clients.jedis.HostAndPort p0, redis.clients.jedis.JedisClientConfig p1)`

**Methods:**
- `public redis.clients.jedis.Jedis getResource()`
- `public void returnResource(redis.clients.jedis.Jedis p0)`

---

## public class `redis.clients.jedis.JedisPoolConfig`
extends `org.apache.commons.pool2.impl.GenericObjectPoolConfig`  

**Constructors:**
- `public JedisPoolConfig()`

---

## public class `redis.clients.jedis.JedisPooled`
extends `redis.clients.jedis.UnifiedJedis`  

**Constructors:**
- `public JedisPooled()`
- `public JedisPooled(java.lang.String p0)`
- `public JedisPooled(java.lang.String p0, int p1)`
- `public JedisPooled(java.lang.String p0, int p1, boolean p2)`
- `public JedisPooled(java.lang.String p0, int p1, boolean p2, javax.net.ssl.SSLSocketFactory p3, javax.net.ssl.SSLParameters p4, javax.net.ssl.HostnameVerifier p5)`
- `public JedisPooled(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3)`
- `public JedisPooled(java.lang.String p0, javax.net.ssl.SSLSocketFactory p1, javax.net.ssl.SSLParameters p2, javax.net.ssl.HostnameVerifier p3)`
- `public JedisPooled(java.net.URI p0)`
- `public JedisPooled(java.net.URI p0, int p1)`
- `public JedisPooled(java.net.URI p0, int p1, javax.net.ssl.SSLSocketFactory p2, javax.net.ssl.SSLParameters p3, javax.net.ssl.HostnameVerifier p4)`
- `public JedisPooled(java.net.URI p0, javax.net.ssl.SSLSocketFactory p1, javax.net.ssl.SSLParameters p2, javax.net.ssl.HostnameVerifier p3)`
- `public JedisPooled(org.apache.commons.pool2.PooledObjectFactory p0, org.apache.commons.pool2.impl.GenericObjectPoolConfig p1)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, boolean p3)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, boolean p3, javax.net.ssl.SSLSocketFactory p4, javax.net.ssl.SSLParameters p5, javax.net.ssl.HostnameVerifier p6)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, boolean p4)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, boolean p4, javax.net.ssl.SSLSocketFactory p5, javax.net.ssl.SSLParameters p6, javax.net.ssl.HostnameVerifier p7)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, int p4, int p5, java.lang.String p6, int p7, java.lang.String p8, boolean p9, javax.net.ssl.SSLSocketFactory p10, javax.net.ssl.SSLParameters p11, javax.net.ssl.HostnameVerifier p12)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, int p4, int p5, java.lang.String p6, java.lang.String p7, int p8, java.lang.String p9)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, int p4, int p5, java.lang.String p6, java.lang.String p7, int p8, java.lang.String p9, boolean p10, javax.net.ssl.SSLSocketFactory p11, javax.net.ssl.SSLParameters p12, javax.net.ssl.HostnameVerifier p13)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, int p4, java.lang.String p5, int p6, java.lang.String p7)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, int p4, java.lang.String p5, int p6, java.lang.String p7, boolean p8)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, int p4, java.lang.String p5, int p6, java.lang.String p7, boolean p8, javax.net.ssl.SSLSocketFactory p9, javax.net.ssl.SSLParameters p10, javax.net.ssl.HostnameVerifier p11)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, int p4, java.lang.String p5, java.lang.String p6, int p7, java.lang.String p8)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, int p4, java.lang.String p5, java.lang.String p6, int p7, java.lang.String p8, boolean p9)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, int p4, java.lang.String p5, java.lang.String p6, int p7, java.lang.String p8, boolean p9, javax.net.ssl.SSLSocketFactory p10, javax.net.ssl.SSLParameters p11, javax.net.ssl.HostnameVerifier p12)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, boolean p5)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, boolean p5, javax.net.ssl.SSLSocketFactory p6, javax.net.ssl.SSLParameters p7, javax.net.ssl.HostnameVerifier p8)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, int p5)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, int p5, boolean p6)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, int p5, boolean p6, javax.net.ssl.SSLSocketFactory p7, javax.net.ssl.SSLParameters p8, javax.net.ssl.HostnameVerifier p9)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, int p5, java.lang.String p6)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, int p5, java.lang.String p6, boolean p7)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, int p5, java.lang.String p6, boolean p7, javax.net.ssl.SSLSocketFactory p8, javax.net.ssl.SSLParameters p9, javax.net.ssl.HostnameVerifier p10)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, java.lang.String p5)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, java.lang.String p5, boolean p6)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, java.lang.String p5, int p6)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, java.lang.String p5, int p6, boolean p7)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, java.lang.String p5, int p6, java.lang.String p7)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, int p3, java.lang.String p4, java.lang.String p5, int p6, java.lang.String p7, boolean p8)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.lang.String p1, int p2, java.lang.String p3, java.lang.String p4)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.net.URI p1)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.net.URI p1, int p2)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.net.URI p1, int p2, int p3)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.net.URI p1, int p2, int p3, int p4, javax.net.ssl.SSLSocketFactory p5, javax.net.ssl.SSLParameters p6, javax.net.ssl.HostnameVerifier p7)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.net.URI p1, int p2, int p3, javax.net.ssl.SSLSocketFactory p4, javax.net.ssl.SSLParameters p5, javax.net.ssl.HostnameVerifier p6)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.net.URI p1, int p2, javax.net.ssl.SSLSocketFactory p3, javax.net.ssl.SSLParameters p4, javax.net.ssl.HostnameVerifier p5)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, java.net.URI p1, javax.net.ssl.SSLSocketFactory p2, javax.net.ssl.SSLParameters p3, javax.net.ssl.HostnameVerifier p4)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, org.apache.commons.pool2.PooledObjectFactory p1)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, redis.clients.jedis.HostAndPort p1, redis.clients.jedis.JedisClientConfig p2)`
- `public JedisPooled(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, redis.clients.jedis.JedisSocketFactory p1, redis.clients.jedis.JedisClientConfig p2)`
- `public JedisPooled(redis.clients.jedis.HostAndPort p0)`
- `public JedisPooled(redis.clients.jedis.HostAndPort p0, org.apache.commons.pool2.impl.GenericObjectPoolConfig p1)`
- `public JedisPooled(redis.clients.jedis.HostAndPort p0, redis.clients.jedis.JedisClientConfig p1)`
- `public JedisPooled(redis.clients.jedis.HostAndPort p0, redis.clients.jedis.JedisClientConfig p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2)`
- `public JedisPooled(redis.clients.jedis.providers.PooledConnectionProvider p0)`

**Methods:**
- `public final redis.clients.jedis.util.Pool getPool()`

---

## public abstract class `redis.clients.jedis.JedisPubSub`

**Constructors:**
- `public JedisPubSub()`

**Methods:**
- `public int getSubscribedChannels()`
- `public boolean isSubscribed()`
- `public void onMessage(java.lang.String p0, java.lang.String p1)`
- `public void onPMessage(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public void onPSubscribe(java.lang.String p0, int p1)`
- `public void onPUnsubscribe(java.lang.String p0, int p1)`
- `public void onPong(java.lang.String p0)`
- `public void onSubscribe(java.lang.String p0, int p1)`
- `public void onUnsubscribe(java.lang.String p0, int p1)`
- `public void ping()`
- `public void ping(java.lang.String p0)`
- `public void proceed(redis.clients.jedis.Connection p0, java.lang.String... p1)`
- `public void proceedWithPatterns(redis.clients.jedis.Connection p0, java.lang.String... p1)`
- `public void psubscribe(java.lang.String... p0)`
- `public void punsubscribe()`
- `public void punsubscribe(java.lang.String... p0)`
- `public void subscribe(java.lang.String... p0)`
- `public void unsubscribe()`
- `public void unsubscribe(java.lang.String... p0)`

---

## public class `redis.clients.jedis.JedisSentinelPool`
extends `redis.clients.jedis.util.Pool`  

**Constructors:**
- `public JedisSentinelPool(java.lang.String p0, java.util.Set p1)`
- `public JedisSentinelPool(java.lang.String p0, java.util.Set p1, java.lang.String p2)`
- `public JedisSentinelPool(java.lang.String p0, java.util.Set p1, java.lang.String p2, java.lang.String p3)`
- `public JedisSentinelPool(java.lang.String p0, java.util.Set p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2)`
- `public JedisSentinelPool(java.lang.String p0, java.util.Set p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2, int p3)`
- `public JedisSentinelPool(java.lang.String p0, java.util.Set p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2, int p3, int p4, int p5, java.lang.String p6, java.lang.String p7, int p8, java.lang.String p9)`
- `public JedisSentinelPool(java.lang.String p0, java.util.Set p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2, int p3, int p4, int p5, java.lang.String p6, java.lang.String p7, int p8, java.lang.String p9, int p10, int p11, java.lang.String p12, java.lang.String p13, java.lang.String p14)`
- `public JedisSentinelPool(java.lang.String p0, java.util.Set p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2, int p3, int p4, java.lang.String p5, int p6)`
- `public JedisSentinelPool(java.lang.String p0, java.util.Set p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2, int p3, int p4, java.lang.String p5, int p6, java.lang.String p7)`
- `public JedisSentinelPool(java.lang.String p0, java.util.Set p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2, int p3, int p4, java.lang.String p5, int p6, java.lang.String p7, int p8, int p9, java.lang.String p10, java.lang.String p11)`
- `public JedisSentinelPool(java.lang.String p0, java.util.Set p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2, int p3, int p4, java.lang.String p5, java.lang.String p6, int p7)`
- `public JedisSentinelPool(java.lang.String p0, java.util.Set p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2, int p3, int p4, java.lang.String p5, java.lang.String p6, int p7, java.lang.String p8)`
- `public JedisSentinelPool(java.lang.String p0, java.util.Set p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2, int p3, int p4, java.lang.String p5, java.lang.String p6, int p7, java.lang.String p8, int p9, int p10, java.lang.String p11, java.lang.String p12, java.lang.String p13)`
- `public JedisSentinelPool(java.lang.String p0, java.util.Set p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2, int p3, java.lang.String p4)`
- `public JedisSentinelPool(java.lang.String p0, java.util.Set p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2, int p3, java.lang.String p4, int p5)`
- `public JedisSentinelPool(java.lang.String p0, java.util.Set p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2, int p3, java.lang.String p4, int p5, java.lang.String p6)`
- `public JedisSentinelPool(java.lang.String p0, java.util.Set p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2, int p3, java.lang.String p4, java.lang.String p5, int p6)`
- `public JedisSentinelPool(java.lang.String p0, java.util.Set p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2, int p3, java.lang.String p4, java.lang.String p5, int p6, java.lang.String p7)`
- `public JedisSentinelPool(java.lang.String p0, java.util.Set p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2, java.lang.String p3)`
- `public JedisSentinelPool(java.lang.String p0, java.util.Set p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2, redis.clients.jedis.JedisFactory p3)`
- `public JedisSentinelPool(java.lang.String p0, java.util.Set p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2, redis.clients.jedis.JedisClientConfig p3, redis.clients.jedis.JedisClientConfig p4)`
- `public JedisSentinelPool(java.lang.String p0, java.util.Set p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2, redis.clients.jedis.JedisFactory p3, redis.clients.jedis.JedisClientConfig p4)`
- `public JedisSentinelPool(java.lang.String p0, java.util.Set p1, redis.clients.jedis.JedisClientConfig p2, redis.clients.jedis.JedisClientConfig p3)`

**Fields:**
- `protected final java.util.Collection masterListeners`

**Methods:**
- `public void destroy()`
- `public redis.clients.jedis.HostAndPort getCurrentHostMaster()`
- `public redis.clients.jedis.Jedis getResource()`
- `public void returnResource(redis.clients.jedis.Jedis p0)`

---

## protected class `redis.clients.jedis.JedisSentinelPool$MasterListener`
extends `java.lang.Thread`  

**Constructors:**
- `protected MasterListener()`
- `public MasterListener(java.lang.String p0, java.lang.String p1, int p2)`
- `public MasterListener(java.lang.String p0, java.lang.String p1, int p2, long p3)`

**Fields:**
- `protected java.lang.String host`
- `protected volatile redis.clients.jedis.Jedis j`
- `protected java.lang.String masterName`
- `protected int port`
- `protected java.util.concurrent.atomic.AtomicBoolean running`
- `protected long subscribeRetryWaitTimeMillis`

**Methods:**
- `public void run()`
- `public void shutdown()`

---

## public class `redis.clients.jedis.JedisSharding`
extends `redis.clients.jedis.UnifiedJedis`  

**Constructors:**
- `public JedisSharding(java.util.List p0)`
- `public JedisSharding(java.util.List p0, redis.clients.jedis.JedisClientConfig p1)`
- `public JedisSharding(java.util.List p0, redis.clients.jedis.JedisClientConfig p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2)`
- `public JedisSharding(java.util.List p0, redis.clients.jedis.JedisClientConfig p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2, redis.clients.jedis.util.Hashing p3)`
- `public JedisSharding(java.util.List p0, redis.clients.jedis.JedisClientConfig p1, redis.clients.jedis.util.Hashing p2)`
- `public JedisSharding(redis.clients.jedis.providers.ShardedConnectionProvider p0)`
- `public JedisSharding(redis.clients.jedis.providers.ShardedConnectionProvider p0, java.util.regex.Pattern p1)`

**Fields:**
- `public final static java.util.regex.Pattern DEFAULT_KEY_TAG_PATTERN`

---

## public abstract interface `redis.clients.jedis.JedisSocketFactory`

**Methods:**
- `public abstract java.net.Socket createSocket() throws redis.clients.jedis.exceptions.JedisConnectionException`

---

## public class `redis.clients.jedis.Module`

**Constructors:**
- `public Module(java.lang.String p0, int p1)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getName()`
- `public int getVersion()`
- `public int hashCode()`

---

## public abstract class `redis.clients.jedis.MultiNodePipelineBase`
implements `java.io.Closeable`, `redis.clients.jedis.commands.PipelineBinaryCommands`, `redis.clients.jedis.commands.PipelineCommands`, `redis.clients.jedis.commands.RedisModulePipelineCommands`  

**Constructors:**
- `public MultiNodePipelineBase(redis.clients.jedis.CommandObjects p0)`

**Methods:**
- `public redis.clients.jedis.Response append(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response append(java.lang.String p0, java.lang.String p1)`
- `protected final <T extends java.lang.Object> redis.clients.jedis.Response appendCommand(redis.clients.jedis.CommandObject p0)`
- `public redis.clients.jedis.Response bfAdd(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response bfExists(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response bfInfo(java.lang.String p0)`
- `public redis.clients.jedis.Response bfInsert(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response bfInsert(java.lang.String p0, redis.clients.jedis.bloom.BFInsertParams p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response bfLoadChunk(java.lang.String p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response bfMAdd(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response bfMExists(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response bfReserve(java.lang.String p0, double p1, long p2)`
- `public redis.clients.jedis.Response bfReserve(java.lang.String p0, double p1, long p2, redis.clients.jedis.bloom.BFReserveParams p3)`
- `public redis.clients.jedis.Response bfScanDump(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response bitcount(byte[] p0)`
- `public redis.clients.jedis.Response bitcount(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response bitcount(byte[] p0, long p1, long p2, redis.clients.jedis.args.BitCountOption p3)`
- `public redis.clients.jedis.Response bitcount(java.lang.String p0)`
- `public redis.clients.jedis.Response bitcount(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response bitcount(java.lang.String p0, long p1, long p2, redis.clients.jedis.args.BitCountOption p3)`
- `public redis.clients.jedis.Response bitfield(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response bitfield(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response bitfieldReadonly(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response bitfieldReadonly(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response bitop(redis.clients.jedis.args.BitOP p0, byte[] p1, byte[]... p2)`
- `public redis.clients.jedis.Response bitop(redis.clients.jedis.args.BitOP p0, java.lang.String p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response bitpos(byte[] p0, boolean p1)`
- `public redis.clients.jedis.Response bitpos(byte[] p0, boolean p1, redis.clients.jedis.params.BitPosParams p2)`
- `public redis.clients.jedis.Response bitpos(java.lang.String p0, boolean p1)`
- `public redis.clients.jedis.Response bitpos(java.lang.String p0, boolean p1, redis.clients.jedis.params.BitPosParams p2)`
- `public redis.clients.jedis.Response blmove(byte[] p0, byte[] p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3, double p4)`
- `public redis.clients.jedis.Response blmove(java.lang.String p0, java.lang.String p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3, double p4)`
- `public redis.clients.jedis.Response blmpop(long p0, redis.clients.jedis.args.ListDirection p1, byte[]... p2)`
- `public redis.clients.jedis.Response blmpop(long p0, redis.clients.jedis.args.ListDirection p1, int p2, byte[]... p3)`
- `public redis.clients.jedis.Response blmpop(long p0, redis.clients.jedis.args.ListDirection p1, int p2, java.lang.String... p3)`
- `public redis.clients.jedis.Response blmpop(long p0, redis.clients.jedis.args.ListDirection p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response blpop(double p0, byte[]... p1)`
- `public redis.clients.jedis.Response blpop(double p0, java.lang.String p1)`
- `public redis.clients.jedis.Response blpop(double p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response blpop(int p0, byte[]... p1)`
- `public redis.clients.jedis.Response blpop(int p0, java.lang.String p1)`
- `public redis.clients.jedis.Response blpop(int p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response brpop(double p0, byte[]... p1)`
- `public redis.clients.jedis.Response brpop(double p0, java.lang.String p1)`
- `public redis.clients.jedis.Response brpop(double p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response brpop(int p0, byte[]... p1)`
- `public redis.clients.jedis.Response brpop(int p0, java.lang.String p1)`
- `public redis.clients.jedis.Response brpop(int p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response brpoplpush(byte[] p0, byte[] p1, int p2)`
- `public redis.clients.jedis.Response brpoplpush(java.lang.String p0, java.lang.String p1, int p2)`
- `public redis.clients.jedis.Response bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, byte[]... p2)`
- `public redis.clients.jedis.Response bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, int p2, byte[]... p3)`
- `public redis.clients.jedis.Response bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, int p2, java.lang.String... p3)`
- `public redis.clients.jedis.Response bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response bzpopmax(double p0, byte[]... p1)`
- `public redis.clients.jedis.Response bzpopmax(double p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response bzpopmin(double p0, byte[]... p1)`
- `public redis.clients.jedis.Response bzpopmin(double p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response cfAdd(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response cfAddNx(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response cfCount(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response cfDel(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response cfExists(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response cfInfo(java.lang.String p0)`
- `public redis.clients.jedis.Response cfInsert(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response cfInsert(java.lang.String p0, redis.clients.jedis.bloom.CFInsertParams p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response cfInsertNx(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response cfInsertNx(java.lang.String p0, redis.clients.jedis.bloom.CFInsertParams p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response cfLoadChunk(java.lang.String p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response cfReserve(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response cfReserve(java.lang.String p0, long p1, redis.clients.jedis.bloom.CFReserveParams p2)`
- `public redis.clients.jedis.Response cfScanDump(java.lang.String p0, long p1)`
- `public void close()`
- `public redis.clients.jedis.Response cmsIncrBy(java.lang.String p0, java.util.Map p1)`
- `public redis.clients.jedis.Response cmsInfo(java.lang.String p0)`
- `public redis.clients.jedis.Response cmsInitByDim(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response cmsInitByProb(java.lang.String p0, double p1, double p2)`
- `public redis.clients.jedis.Response cmsMerge(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response cmsMerge(java.lang.String p0, java.util.Map p1)`
- `public redis.clients.jedis.Response cmsQuery(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response copy(byte[] p0, byte[] p1, boolean p2)`
- `public redis.clients.jedis.Response copy(java.lang.String p0, java.lang.String p1, boolean p2)`
- `public redis.clients.jedis.Response decr(byte[] p0)`
- `public redis.clients.jedis.Response decr(java.lang.String p0)`
- `public redis.clients.jedis.Response decrBy(byte[] p0, long p1)`
- `public redis.clients.jedis.Response decrBy(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response del(byte[] p0)`
- `public redis.clients.jedis.Response del(byte[]... p0)`
- `public redis.clients.jedis.Response del(java.lang.String p0)`
- `public redis.clients.jedis.Response del(java.lang.String... p0)`
- `public redis.clients.jedis.Response dump(byte[] p0)`
- `public redis.clients.jedis.Response dump(java.lang.String p0)`
- `public redis.clients.jedis.Response eval(byte[] p0)`
- `public redis.clients.jedis.Response eval(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response eval(byte[] p0, int p1, byte[]... p2)`
- `public redis.clients.jedis.Response eval(byte[] p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response eval(java.lang.String p0)`
- `public redis.clients.jedis.Response eval(java.lang.String p0, int p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response eval(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response eval(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response evalReadonly(byte[] p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response evalReadonly(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response evalsha(byte[] p0)`
- `public redis.clients.jedis.Response evalsha(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response evalsha(byte[] p0, int p1, byte[]... p2)`
- `public redis.clients.jedis.Response evalsha(byte[] p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response evalsha(java.lang.String p0)`
- `public redis.clients.jedis.Response evalsha(java.lang.String p0, int p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response evalsha(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response evalsha(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response evalshaReadonly(byte[] p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response evalshaReadonly(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response exists(byte[] p0)`
- `public redis.clients.jedis.Response exists(byte[]... p0)`
- `public redis.clients.jedis.Response exists(java.lang.String p0)`
- `public redis.clients.jedis.Response exists(java.lang.String... p0)`
- `public redis.clients.jedis.Response expire(byte[] p0, long p1)`
- `public redis.clients.jedis.Response expire(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public redis.clients.jedis.Response expire(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response expire(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public redis.clients.jedis.Response expireAt(byte[] p0, long p1)`
- `public redis.clients.jedis.Response expireAt(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public redis.clients.jedis.Response expireAt(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response expireAt(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public redis.clients.jedis.Response expireTime(byte[] p0)`
- `public redis.clients.jedis.Response expireTime(java.lang.String p0)`
- `public redis.clients.jedis.Response fcall(byte[] p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response fcall(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response fcallReadonly(byte[] p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response fcallReadonly(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response ftAggregate(java.lang.String p0, redis.clients.jedis.search.aggr.AggregationBuilder p1)`
- `public redis.clients.jedis.Response ftAliasAdd(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftAliasDel(java.lang.String p0)`
- `public redis.clients.jedis.Response ftAliasUpdate(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftAlter(java.lang.String p0, java.lang.Iterable p1)`
- `public redis.clients.jedis.Response ftAlter(java.lang.String p0, redis.clients.jedis.search.Schema p1)`
- `public redis.clients.jedis.Response ftConfigGet(java.lang.String p0)`
- `public redis.clients.jedis.Response ftConfigGet(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftConfigSet(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftConfigSet(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response ftCreate(java.lang.String p0, redis.clients.jedis.search.FTCreateParams p1, java.lang.Iterable p2)`
- `public redis.clients.jedis.Response ftCreate(java.lang.String p0, redis.clients.jedis.search.IndexOptions p1, redis.clients.jedis.search.Schema p2)`
- `public redis.clients.jedis.Response ftCursorDel(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response ftCursorRead(java.lang.String p0, long p1, int p2)`
- `public redis.clients.jedis.Response ftDictAdd(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response ftDictAddBySampleKey(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response ftDictDel(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response ftDictDelBySampleKey(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response ftDictDump(java.lang.String p0)`
- `public redis.clients.jedis.Response ftDictDumpBySampleKey(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftDropIndex(java.lang.String p0)`
- `public redis.clients.jedis.Response ftDropIndexDD(java.lang.String p0)`
- `public redis.clients.jedis.Response ftExplain(java.lang.String p0, redis.clients.jedis.search.Query p1)`
- `public redis.clients.jedis.Response ftExplainCLI(java.lang.String p0, redis.clients.jedis.search.Query p1)`
- `public redis.clients.jedis.Response ftInfo(java.lang.String p0)`
- `public redis.clients.jedis.Response ftSearch(byte[] p0, redis.clients.jedis.search.Query p1)`
- `public redis.clients.jedis.Response ftSearch(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftSearch(java.lang.String p0, java.lang.String p1, redis.clients.jedis.search.FTSearchParams p2)`
- `public redis.clients.jedis.Response ftSearch(java.lang.String p0, redis.clients.jedis.search.Query p1)`
- `public redis.clients.jedis.Response ftSugAdd(java.lang.String p0, java.lang.String p1, double p2)`
- `public redis.clients.jedis.Response ftSugAddIncr(java.lang.String p0, java.lang.String p1, double p2)`
- `public redis.clients.jedis.Response ftSugDel(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftSugGet(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftSugGet(java.lang.String p0, java.lang.String p1, boolean p2, int p3)`
- `public redis.clients.jedis.Response ftSugGetWithScores(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftSugGetWithScores(java.lang.String p0, java.lang.String p1, boolean p2, int p3)`
- `public redis.clients.jedis.Response ftSugLen(java.lang.String p0)`
- `public redis.clients.jedis.Response ftSynDump(java.lang.String p0)`
- `public redis.clients.jedis.Response ftSynUpdate(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response ftTagVals(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response functionDelete(byte[] p0)`
- `public redis.clients.jedis.Response functionDelete(java.lang.String p0)`
- `public redis.clients.jedis.Response functionDump()`
- `public redis.clients.jedis.Response functionFlush()`
- `public redis.clients.jedis.Response functionFlush(redis.clients.jedis.args.FlushMode p0)`
- `public redis.clients.jedis.Response functionKill()`
- `public redis.clients.jedis.Response functionList()`
- `public redis.clients.jedis.Response functionList(byte[] p0)`
- `public redis.clients.jedis.Response functionList(java.lang.String p0)`
- `public redis.clients.jedis.Response functionListBinary()`
- `public redis.clients.jedis.Response functionListWithCode()`
- `public redis.clients.jedis.Response functionListWithCode(byte[] p0)`
- `public redis.clients.jedis.Response functionListWithCode(java.lang.String p0)`
- `public redis.clients.jedis.Response functionListWithCodeBinary()`
- `public redis.clients.jedis.Response functionLoad(byte[] p0)`
- `public redis.clients.jedis.Response functionLoad(java.lang.String p0)`
- `public redis.clients.jedis.Response functionLoadReplace(byte[] p0)`
- `public redis.clients.jedis.Response functionLoadReplace(java.lang.String p0)`
- `public redis.clients.jedis.Response functionRestore(byte[] p0)`
- `public redis.clients.jedis.Response functionRestore(byte[] p0, redis.clients.jedis.args.FunctionRestorePolicy p1)`
- `public redis.clients.jedis.Response functionStats()`
- `public redis.clients.jedis.Response functionStatsBinary()`
- `public redis.clients.jedis.Response geoadd(byte[] p0, double p1, double p2, byte[] p3)`
- `public redis.clients.jedis.Response geoadd(byte[] p0, java.util.Map p1)`
- `public redis.clients.jedis.Response geoadd(byte[] p0, redis.clients.jedis.params.GeoAddParams p1, java.util.Map p2)`
- `public redis.clients.jedis.Response geoadd(java.lang.String p0, double p1, double p2, java.lang.String p3)`
- `public redis.clients.jedis.Response geoadd(java.lang.String p0, java.util.Map p1)`
- `public redis.clients.jedis.Response geoadd(java.lang.String p0, redis.clients.jedis.params.GeoAddParams p1, java.util.Map p2)`
- `public redis.clients.jedis.Response geodist(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response geodist(byte[] p0, byte[] p1, byte[] p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response geodist(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response geodist(java.lang.String p0, java.lang.String p1, java.lang.String p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response geohash(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response geohash(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response geopos(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response geopos(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response georadius(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response georadius(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public redis.clients.jedis.Response georadius(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response georadius(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public redis.clients.jedis.Response georadiusByMember(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response georadiusByMember(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public redis.clients.jedis.Response georadiusByMember(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response georadiusByMember(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public redis.clients.jedis.Response georadiusByMemberReadonly(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response georadiusByMemberReadonly(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public redis.clients.jedis.Response georadiusByMemberReadonly(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response georadiusByMemberReadonly(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public redis.clients.jedis.Response georadiusByMemberStore(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4, redis.clients.jedis.params.GeoRadiusStoreParam p5)`
- `public redis.clients.jedis.Response georadiusByMemberStore(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4, redis.clients.jedis.params.GeoRadiusStoreParam p5)`
- `public redis.clients.jedis.Response georadiusReadonly(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response georadiusReadonly(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public redis.clients.jedis.Response georadiusReadonly(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response georadiusReadonly(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public redis.clients.jedis.Response georadiusStore(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5, redis.clients.jedis.params.GeoRadiusStoreParam p6)`
- `public redis.clients.jedis.Response georadiusStore(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5, redis.clients.jedis.params.GeoRadiusStoreParam p6)`
- `public redis.clients.jedis.Response geosearch(byte[] p0, byte[] p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response geosearch(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response geosearch(byte[] p0, redis.clients.jedis.GeoCoordinate p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response geosearch(byte[] p0, redis.clients.jedis.GeoCoordinate p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response geosearch(byte[] p0, redis.clients.jedis.params.GeoSearchParam p1)`
- `public redis.clients.jedis.Response geosearch(java.lang.String p0, java.lang.String p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response geosearch(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response geosearch(java.lang.String p0, redis.clients.jedis.GeoCoordinate p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response geosearch(java.lang.String p0, redis.clients.jedis.GeoCoordinate p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response geosearch(java.lang.String p0, redis.clients.jedis.params.GeoSearchParam p1)`
- `public redis.clients.jedis.Response geosearchStore(byte[] p0, byte[] p1, byte[] p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public redis.clients.jedis.Response geosearchStore(byte[] p0, byte[] p1, byte[] p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response geosearchStore(byte[] p0, byte[] p1, redis.clients.jedis.GeoCoordinate p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public redis.clients.jedis.Response geosearchStore(byte[] p0, byte[] p1, redis.clients.jedis.GeoCoordinate p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response geosearchStore(byte[] p0, byte[] p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public redis.clients.jedis.Response geosearchStore(java.lang.String p0, java.lang.String p1, java.lang.String p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public redis.clients.jedis.Response geosearchStore(java.lang.String p0, java.lang.String p1, java.lang.String p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response geosearchStore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.GeoCoordinate p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public redis.clients.jedis.Response geosearchStore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.GeoCoordinate p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response geosearchStore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public redis.clients.jedis.Response geosearchStoreStoreDist(byte[] p0, byte[] p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public redis.clients.jedis.Response geosearchStoreStoreDist(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public redis.clients.jedis.Response get(byte[] p0)`
- `public redis.clients.jedis.Response get(java.lang.String p0)`
- `protected abstract redis.clients.jedis.Connection getConnection(redis.clients.jedis.HostAndPort p0)`
- `public redis.clients.jedis.Response getDel(byte[] p0)`
- `public redis.clients.jedis.Response getDel(java.lang.String p0)`
- `public redis.clients.jedis.Response getEx(byte[] p0, redis.clients.jedis.params.GetExParams p1)`
- `public redis.clients.jedis.Response getEx(java.lang.String p0, redis.clients.jedis.params.GetExParams p1)`
- `protected abstract redis.clients.jedis.HostAndPort getNodeKey(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.Response getSet(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response getSet(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response getbit(byte[] p0, long p1)`
- `public redis.clients.jedis.Response getbit(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response getrange(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response getrange(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response graphDelete(java.lang.String p0)`
- `public redis.clients.jedis.Response graphProfile(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response graphQuery(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response graphQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public redis.clients.jedis.Response graphQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2, long p3)`
- `public redis.clients.jedis.Response graphQuery(java.lang.String p0, java.lang.String p1, long p2)`
- `public redis.clients.jedis.Response graphReadonlyQuery(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response graphReadonlyQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public redis.clients.jedis.Response graphReadonlyQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2, long p3)`
- `public redis.clients.jedis.Response graphReadonlyQuery(java.lang.String p0, java.lang.String p1, long p2)`
- `public redis.clients.jedis.Response hdel(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response hdel(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response hexists(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response hexists(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response hget(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response hget(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response hgetAll(byte[] p0)`
- `public redis.clients.jedis.Response hgetAll(java.lang.String p0)`
- `public redis.clients.jedis.Response hincrBy(byte[] p0, byte[] p1, long p2)`
- `public redis.clients.jedis.Response hincrBy(java.lang.String p0, java.lang.String p1, long p2)`
- `public redis.clients.jedis.Response hincrByFloat(byte[] p0, byte[] p1, double p2)`
- `public redis.clients.jedis.Response hincrByFloat(java.lang.String p0, java.lang.String p1, double p2)`
- `public redis.clients.jedis.Response hkeys(byte[] p0)`
- `public redis.clients.jedis.Response hkeys(java.lang.String p0)`
- `public redis.clients.jedis.Response hlen(byte[] p0)`
- `public redis.clients.jedis.Response hlen(java.lang.String p0)`
- `public redis.clients.jedis.Response hmget(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response hmget(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response hmset(byte[] p0, java.util.Map p1)`
- `public redis.clients.jedis.Response hmset(java.lang.String p0, java.util.Map p1)`
- `public redis.clients.jedis.Response hrandfield(byte[] p0)`
- `public redis.clients.jedis.Response hrandfield(byte[] p0, long p1)`
- `public redis.clients.jedis.Response hrandfield(java.lang.String p0)`
- `public redis.clients.jedis.Response hrandfield(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response hrandfieldWithValues(byte[] p0, long p1)`
- `public redis.clients.jedis.Response hrandfieldWithValues(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response hscan(byte[] p0, byte[] p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.Response hscan(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.Response hset(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response hset(byte[] p0, java.util.Map p1)`
- `public redis.clients.jedis.Response hset(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response hset(java.lang.String p0, java.util.Map p1)`
- `public redis.clients.jedis.Response hsetnx(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response hsetnx(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response hstrlen(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response hstrlen(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response hvals(byte[] p0)`
- `public redis.clients.jedis.Response hvals(java.lang.String p0)`
- `public redis.clients.jedis.Response incr(byte[] p0)`
- `public redis.clients.jedis.Response incr(java.lang.String p0)`
- `public redis.clients.jedis.Response incrBy(byte[] p0, long p1)`
- `public redis.clients.jedis.Response incrBy(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response incrByFloat(byte[] p0, double p1)`
- `public redis.clients.jedis.Response incrByFloat(java.lang.String p0, double p1)`
- `public redis.clients.jedis.Response jsonArrAppend(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object... p2)`
- `public redis.clients.jedis.Response jsonArrAppend(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object... p2)`
- `public redis.clients.jedis.Response jsonArrAppendWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object... p2)`
- `public redis.clients.jedis.Response jsonArrIndex(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2)`
- `public redis.clients.jedis.Response jsonArrIndex(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public redis.clients.jedis.Response jsonArrIndexWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public redis.clients.jedis.Response jsonArrInsert(java.lang.String p0, redis.clients.jedis.json.Path p1, int p2, java.lang.Object... p3)`
- `public redis.clients.jedis.Response jsonArrInsert(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2, java.lang.Object... p3)`
- `public redis.clients.jedis.Response jsonArrInsertWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2, java.lang.Object... p3)`
- `public redis.clients.jedis.Response jsonArrLen(java.lang.String p0)`
- `public redis.clients.jedis.Response jsonArrLen(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public redis.clients.jedis.Response jsonArrLen(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public redis.clients.jedis.Response jsonArrPop(java.lang.String p0)`
- `public <T extends java.lang.Object> redis.clients.jedis.Response jsonArrPop(java.lang.String p0, java.lang.Class p1)`
- `public <T extends java.lang.Object> redis.clients.jedis.Response jsonArrPop(java.lang.String p0, java.lang.Class p1, redis.clients.jedis.json.Path p2)`
- `public <T extends java.lang.Object> redis.clients.jedis.Response jsonArrPop(java.lang.String p0, java.lang.Class p1, redis.clients.jedis.json.Path p2, int p3)`
- `public redis.clients.jedis.Response jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public redis.clients.jedis.Response jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path p1, int p2)`
- `public redis.clients.jedis.Response jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public redis.clients.jedis.Response jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2)`
- `public redis.clients.jedis.Response jsonArrTrim(java.lang.String p0, redis.clients.jedis.json.Path p1, int p2, int p3)`
- `public redis.clients.jedis.Response jsonArrTrim(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2, int p3)`
- `public redis.clients.jedis.Response jsonClear(java.lang.String p0)`
- `public redis.clients.jedis.Response jsonClear(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public redis.clients.jedis.Response jsonClear(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public redis.clients.jedis.Response jsonDel(java.lang.String p0)`
- `public redis.clients.jedis.Response jsonDel(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public redis.clients.jedis.Response jsonDel(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public redis.clients.jedis.Response jsonGet(java.lang.String p0)`
- `public <T extends java.lang.Object> redis.clients.jedis.Response jsonGet(java.lang.String p0, java.lang.Class p1)`
- `public <T extends java.lang.Object> redis.clients.jedis.Response jsonGet(java.lang.String p0, java.lang.Class p1, redis.clients.jedis.json.Path... p2)`
- `public redis.clients.jedis.Response jsonGet(java.lang.String p0, redis.clients.jedis.json.Path2... p1)`
- `public redis.clients.jedis.Response jsonGet(java.lang.String p0, redis.clients.jedis.json.Path... p1)`
- `public <T extends java.lang.Object> redis.clients.jedis.Response jsonMGet(redis.clients.jedis.json.Path p0, java.lang.Class p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response jsonMGet(redis.clients.jedis.json.Path2 p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response jsonNumIncrBy(java.lang.String p0, redis.clients.jedis.json.Path p1, double p2)`
- `public redis.clients.jedis.Response jsonNumIncrBy(java.lang.String p0, redis.clients.jedis.json.Path2 p1, double p2)`
- `public redis.clients.jedis.Response jsonSet(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2)`
- `public redis.clients.jedis.Response jsonSet(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2, redis.clients.jedis.json.JsonSetParams p3)`
- `public redis.clients.jedis.Response jsonSet(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public redis.clients.jedis.Response jsonSet(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2, redis.clients.jedis.json.JsonSetParams p3)`
- `public redis.clients.jedis.Response jsonSetWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public redis.clients.jedis.Response jsonSetWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2, redis.clients.jedis.json.JsonSetParams p3)`
- `public redis.clients.jedis.Response jsonStrAppend(java.lang.String p0, java.lang.Object p1)`
- `public redis.clients.jedis.Response jsonStrAppend(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2)`
- `public redis.clients.jedis.Response jsonStrAppend(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public redis.clients.jedis.Response jsonStrLen(java.lang.String p0)`
- `public redis.clients.jedis.Response jsonStrLen(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public redis.clients.jedis.Response jsonStrLen(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public redis.clients.jedis.Response jsonToggle(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public redis.clients.jedis.Response jsonToggle(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public redis.clients.jedis.Response jsonType(java.lang.String p0)`
- `public redis.clients.jedis.Response jsonType(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public redis.clients.jedis.Response jsonType(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public redis.clients.jedis.Response keys(byte[] p0)`
- `public redis.clients.jedis.Response keys(java.lang.String p0)`
- `public redis.clients.jedis.Response lcs(byte[] p0, byte[] p1, redis.clients.jedis.params.LCSParams p2)`
- `public redis.clients.jedis.Response lcs(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.LCSParams p2)`
- `public redis.clients.jedis.Response lindex(byte[] p0, long p1)`
- `public redis.clients.jedis.Response lindex(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response linsert(byte[] p0, redis.clients.jedis.args.ListPosition p1, byte[] p2, byte[] p3)`
- `public redis.clients.jedis.Response linsert(java.lang.String p0, redis.clients.jedis.args.ListPosition p1, java.lang.String p2, java.lang.String p3)`
- `public redis.clients.jedis.Response llen(byte[] p0)`
- `public redis.clients.jedis.Response llen(java.lang.String p0)`
- `public redis.clients.jedis.Response lmove(byte[] p0, byte[] p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3)`
- `public redis.clients.jedis.Response lmove(java.lang.String p0, java.lang.String p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3)`
- `public redis.clients.jedis.Response lmpop(redis.clients.jedis.args.ListDirection p0, byte[]... p1)`
- `public redis.clients.jedis.Response lmpop(redis.clients.jedis.args.ListDirection p0, int p1, byte[]... p2)`
- `public redis.clients.jedis.Response lmpop(redis.clients.jedis.args.ListDirection p0, int p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response lmpop(redis.clients.jedis.args.ListDirection p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response lpop(byte[] p0)`
- `public redis.clients.jedis.Response lpop(byte[] p0, int p1)`
- `public redis.clients.jedis.Response lpop(java.lang.String p0)`
- `public redis.clients.jedis.Response lpop(java.lang.String p0, int p1)`
- `public redis.clients.jedis.Response lpos(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response lpos(byte[] p0, byte[] p1, redis.clients.jedis.params.LPosParams p2)`
- `public redis.clients.jedis.Response lpos(byte[] p0, byte[] p1, redis.clients.jedis.params.LPosParams p2, long p3)`
- `public redis.clients.jedis.Response lpos(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response lpos(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.LPosParams p2)`
- `public redis.clients.jedis.Response lpos(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.LPosParams p2, long p3)`
- `public redis.clients.jedis.Response lpush(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response lpush(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response lpushx(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response lpushx(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response lrange(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response lrange(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response lrem(byte[] p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response lrem(java.lang.String p0, long p1, java.lang.String p2)`
- `public redis.clients.jedis.Response lset(byte[] p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response lset(java.lang.String p0, long p1, java.lang.String p2)`
- `public redis.clients.jedis.Response ltrim(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response ltrim(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response memoryUsage(byte[] p0)`
- `public redis.clients.jedis.Response memoryUsage(byte[] p0, int p1)`
- `public redis.clients.jedis.Response memoryUsage(java.lang.String p0)`
- `public redis.clients.jedis.Response memoryUsage(java.lang.String p0, int p1)`
- `public redis.clients.jedis.Response mget(byte[]... p0)`
- `public redis.clients.jedis.Response mget(java.lang.String... p0)`
- `public redis.clients.jedis.Response migrate(java.lang.String p0, int p1, byte[] p2, int p3)`
- `public redis.clients.jedis.Response migrate(java.lang.String p0, int p1, int p2, redis.clients.jedis.params.MigrateParams p3, byte[]... p4)`
- `public redis.clients.jedis.Response migrate(java.lang.String p0, int p1, int p2, redis.clients.jedis.params.MigrateParams p3, java.lang.String... p4)`
- `public redis.clients.jedis.Response migrate(java.lang.String p0, int p1, java.lang.String p2, int p3)`
- `public redis.clients.jedis.Response mset(byte[]... p0)`
- `public redis.clients.jedis.Response mset(java.lang.String... p0)`
- `public redis.clients.jedis.Response msetnx(byte[]... p0)`
- `public redis.clients.jedis.Response msetnx(java.lang.String... p0)`
- `public redis.clients.jedis.Response objectEncoding(byte[] p0)`
- `public redis.clients.jedis.Response objectEncoding(java.lang.String p0)`
- `public redis.clients.jedis.Response objectFreq(byte[] p0)`
- `public redis.clients.jedis.Response objectFreq(java.lang.String p0)`
- `public redis.clients.jedis.Response objectIdletime(byte[] p0)`
- `public redis.clients.jedis.Response objectIdletime(java.lang.String p0)`
- `public redis.clients.jedis.Response objectRefcount(byte[] p0)`
- `public redis.clients.jedis.Response objectRefcount(java.lang.String p0)`
- `public redis.clients.jedis.Response persist(byte[] p0)`
- `public redis.clients.jedis.Response persist(java.lang.String p0)`
- `public redis.clients.jedis.Response pexpire(byte[] p0, long p1)`
- `public redis.clients.jedis.Response pexpire(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public redis.clients.jedis.Response pexpire(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response pexpire(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public redis.clients.jedis.Response pexpireAt(byte[] p0, long p1)`
- `public redis.clients.jedis.Response pexpireAt(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public redis.clients.jedis.Response pexpireAt(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response pexpireAt(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public redis.clients.jedis.Response pexpireTime(byte[] p0)`
- `public redis.clients.jedis.Response pexpireTime(java.lang.String p0)`
- `public redis.clients.jedis.Response pfadd(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response pfadd(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response pfcount(byte[] p0)`
- `public redis.clients.jedis.Response pfcount(byte[]... p0)`
- `public redis.clients.jedis.Response pfcount(java.lang.String p0)`
- `public redis.clients.jedis.Response pfcount(java.lang.String... p0)`
- `public redis.clients.jedis.Response pfmerge(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response pfmerge(java.lang.String p0, java.lang.String... p1)`
- `protected final void prepareGraphCommands(redis.clients.jedis.providers.ConnectionProvider p0)`
- `public redis.clients.jedis.Response psetex(byte[] p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response psetex(java.lang.String p0, long p1, java.lang.String p2)`
- `public redis.clients.jedis.Response pttl(byte[] p0)`
- `public redis.clients.jedis.Response pttl(java.lang.String p0)`
- `public redis.clients.jedis.Response publish(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response publish(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response randomBinaryKey()`
- `public redis.clients.jedis.Response randomKey()`
- `public redis.clients.jedis.Response rename(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response rename(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response renamenx(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response renamenx(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response restore(byte[] p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response restore(byte[] p0, long p1, byte[] p2, redis.clients.jedis.params.RestoreParams p3)`
- `public redis.clients.jedis.Response restore(java.lang.String p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response restore(java.lang.String p0, long p1, byte[] p2, redis.clients.jedis.params.RestoreParams p3)`
- `public redis.clients.jedis.Response rpop(byte[] p0)`
- `public redis.clients.jedis.Response rpop(byte[] p0, int p1)`
- `public redis.clients.jedis.Response rpop(java.lang.String p0)`
- `public redis.clients.jedis.Response rpop(java.lang.String p0, int p1)`
- `public redis.clients.jedis.Response rpoplpush(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response rpoplpush(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response rpush(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response rpush(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response rpushx(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response rpushx(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response sadd(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response sadd(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response scan(byte[] p0)`
- `public redis.clients.jedis.Response scan(byte[] p0, redis.clients.jedis.params.ScanParams p1)`
- `public redis.clients.jedis.Response scan(byte[] p0, redis.clients.jedis.params.ScanParams p1, byte[] p2)`
- `public redis.clients.jedis.Response scan(java.lang.String p0)`
- `public redis.clients.jedis.Response scan(java.lang.String p0, redis.clients.jedis.params.ScanParams p1)`
- `public redis.clients.jedis.Response scan(java.lang.String p0, redis.clients.jedis.params.ScanParams p1, java.lang.String p2)`
- `public redis.clients.jedis.Response scard(byte[] p0)`
- `public redis.clients.jedis.Response scard(java.lang.String p0)`
- `public redis.clients.jedis.Response scriptExists(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response scriptExists(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response scriptFlush(byte[] p0)`
- `public redis.clients.jedis.Response scriptFlush(byte[] p0, redis.clients.jedis.args.FlushMode p1)`
- `public redis.clients.jedis.Response scriptFlush(java.lang.String p0)`
- `public redis.clients.jedis.Response scriptFlush(java.lang.String p0, redis.clients.jedis.args.FlushMode p1)`
- `public redis.clients.jedis.Response scriptKill(byte[] p0)`
- `public redis.clients.jedis.Response scriptKill(java.lang.String p0)`
- `public redis.clients.jedis.Response scriptLoad(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response scriptLoad(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response sdiff(byte[]... p0)`
- `public redis.clients.jedis.Response sdiff(java.lang.String... p0)`
- `public redis.clients.jedis.Response sdiffstore(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response sdiffstore(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response set(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response set(byte[] p0, byte[] p1, redis.clients.jedis.params.SetParams p2)`
- `public redis.clients.jedis.Response set(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response set(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.SetParams p2)`
- `public redis.clients.jedis.Response setGet(byte[] p0, byte[] p1, redis.clients.jedis.params.SetParams p2)`
- `public redis.clients.jedis.Response setGet(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.SetParams p2)`
- `public redis.clients.jedis.Response setbit(byte[] p0, long p1, boolean p2)`
- `public redis.clients.jedis.Response setbit(java.lang.String p0, long p1, boolean p2)`
- `public redis.clients.jedis.Response setex(byte[] p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response setex(java.lang.String p0, long p1, java.lang.String p2)`
- `public redis.clients.jedis.Response setnx(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response setnx(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response setrange(byte[] p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response setrange(java.lang.String p0, long p1, java.lang.String p2)`
- `public redis.clients.jedis.Response sinter(byte[]... p0)`
- `public redis.clients.jedis.Response sinter(java.lang.String... p0)`
- `public redis.clients.jedis.Response sintercard(byte[]... p0)`
- `public redis.clients.jedis.Response sintercard(int p0, byte[]... p1)`
- `public redis.clients.jedis.Response sintercard(int p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response sintercard(java.lang.String... p0)`
- `public redis.clients.jedis.Response sinterstore(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response sinterstore(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response sismember(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response sismember(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response smembers(byte[] p0)`
- `public redis.clients.jedis.Response smembers(java.lang.String p0)`
- `public redis.clients.jedis.Response smismember(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response smismember(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response smove(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response smove(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response sort(byte[] p0)`
- `public redis.clients.jedis.Response sort(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response sort(byte[] p0, redis.clients.jedis.params.SortingParams p1)`
- `public redis.clients.jedis.Response sort(byte[] p0, redis.clients.jedis.params.SortingParams p1, byte[] p2)`
- `public redis.clients.jedis.Response sort(java.lang.String p0)`
- `public redis.clients.jedis.Response sort(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response sort(java.lang.String p0, redis.clients.jedis.params.SortingParams p1)`
- `public redis.clients.jedis.Response sort(java.lang.String p0, redis.clients.jedis.params.SortingParams p1, java.lang.String p2)`
- `public redis.clients.jedis.Response sortReadonly(byte[] p0, redis.clients.jedis.params.SortingParams p1)`
- `public redis.clients.jedis.Response sortReadonly(java.lang.String p0, redis.clients.jedis.params.SortingParams p1)`
- `public redis.clients.jedis.Response spop(byte[] p0)`
- `public redis.clients.jedis.Response spop(byte[] p0, long p1)`
- `public redis.clients.jedis.Response spop(java.lang.String p0)`
- `public redis.clients.jedis.Response spop(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response srandmember(byte[] p0)`
- `public redis.clients.jedis.Response srandmember(byte[] p0, int p1)`
- `public redis.clients.jedis.Response srandmember(java.lang.String p0)`
- `public redis.clients.jedis.Response srandmember(java.lang.String p0, int p1)`
- `public redis.clients.jedis.Response srem(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response srem(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response sscan(byte[] p0, byte[] p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.Response sscan(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.Response strAlgoLCSKeys(byte[] p0, byte[] p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public redis.clients.jedis.Response strAlgoLCSKeys(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public redis.clients.jedis.Response strAlgoLCSStrings(byte[] p0, byte[] p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public redis.clients.jedis.Response strAlgoLCSStrings(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public redis.clients.jedis.Response strlen(byte[] p0)`
- `public redis.clients.jedis.Response strlen(java.lang.String p0)`
- `public redis.clients.jedis.Response substr(byte[] p0, int p1, int p2)`
- `public redis.clients.jedis.Response substr(java.lang.String p0, int p1, int p2)`
- `public redis.clients.jedis.Response sunion(byte[]... p0)`
- `public redis.clients.jedis.Response sunion(java.lang.String... p0)`
- `public redis.clients.jedis.Response sunionstore(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response sunionstore(java.lang.String p0, java.lang.String... p1)`
- `public final void sync()`
- `public redis.clients.jedis.Response tdigestAdd(java.lang.String p0, double... p1)`
- `public redis.clients.jedis.Response tdigestByRank(java.lang.String p0, long... p1)`
- `public redis.clients.jedis.Response tdigestByRevRank(java.lang.String p0, long... p1)`
- `public redis.clients.jedis.Response tdigestCDF(java.lang.String p0, double... p1)`
- `public redis.clients.jedis.Response tdigestCreate(java.lang.String p0)`
- `public redis.clients.jedis.Response tdigestCreate(java.lang.String p0, int p1)`
- `public redis.clients.jedis.Response tdigestInfo(java.lang.String p0)`
- `public redis.clients.jedis.Response tdigestMax(java.lang.String p0)`
- `public redis.clients.jedis.Response tdigestMerge(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response tdigestMerge(redis.clients.jedis.bloom.TDigestMergeParams p0, java.lang.String p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response tdigestMin(java.lang.String p0)`
- `public redis.clients.jedis.Response tdigestQuantile(java.lang.String p0, double... p1)`
- `public redis.clients.jedis.Response tdigestRank(java.lang.String p0, double... p1)`
- `public redis.clients.jedis.Response tdigestReset(java.lang.String p0)`
- `public redis.clients.jedis.Response tdigestRevRank(java.lang.String p0, double... p1)`
- `public redis.clients.jedis.Response tdigestTrimmedMean(java.lang.String p0, double p1, double p2)`
- `public redis.clients.jedis.Response topkAdd(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response topkCount(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response topkIncrBy(java.lang.String p0, java.util.Map p1)`
- `public redis.clients.jedis.Response topkInfo(java.lang.String p0)`
- `public redis.clients.jedis.Response topkList(java.lang.String p0)`
- `public redis.clients.jedis.Response topkQuery(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response topkReserve(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response topkReserve(java.lang.String p0, long p1, long p2, long p3, double p4)`
- `public redis.clients.jedis.Response touch(byte[] p0)`
- `public redis.clients.jedis.Response touch(byte[]... p0)`
- `public redis.clients.jedis.Response touch(java.lang.String p0)`
- `public redis.clients.jedis.Response touch(java.lang.String... p0)`
- `public redis.clients.jedis.Response tsAdd(java.lang.String p0, double p1)`
- `public redis.clients.jedis.Response tsAdd(java.lang.String p0, long p1, double p2)`
- `public redis.clients.jedis.Response tsAdd(java.lang.String p0, long p1, double p2, redis.clients.jedis.timeseries.TSCreateParams p3)`
- `public redis.clients.jedis.Response tsAlter(java.lang.String p0, redis.clients.jedis.timeseries.TSAlterParams p1)`
- `public redis.clients.jedis.Response tsCreate(java.lang.String p0)`
- `public redis.clients.jedis.Response tsCreate(java.lang.String p0, redis.clients.jedis.timeseries.TSCreateParams p1)`
- `public redis.clients.jedis.Response tsCreateRule(java.lang.String p0, java.lang.String p1, redis.clients.jedis.timeseries.AggregationType p2, long p3)`
- `public redis.clients.jedis.Response tsCreateRule(java.lang.String p0, java.lang.String p1, redis.clients.jedis.timeseries.AggregationType p2, long p3, long p4)`
- `public redis.clients.jedis.Response tsDecrBy(java.lang.String p0, double p1)`
- `public redis.clients.jedis.Response tsDecrBy(java.lang.String p0, double p1, long p2)`
- `public redis.clients.jedis.Response tsDel(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response tsDeleteRule(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response tsGet(java.lang.String p0)`
- `public redis.clients.jedis.Response tsGet(java.lang.String p0, redis.clients.jedis.timeseries.TSGetParams p1)`
- `public redis.clients.jedis.Response tsIncrBy(java.lang.String p0, double p1)`
- `public redis.clients.jedis.Response tsIncrBy(java.lang.String p0, double p1, long p2)`
- `public redis.clients.jedis.Response tsMAdd(java.util.Map$Entry... p0)`
- `public redis.clients.jedis.Response tsMGet(redis.clients.jedis.timeseries.TSMGetParams p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response tsMRange(long p0, long p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response tsMRange(redis.clients.jedis.timeseries.TSMRangeParams p0)`
- `public redis.clients.jedis.Response tsMRevRange(long p0, long p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response tsMRevRange(redis.clients.jedis.timeseries.TSMRangeParams p0)`
- `public redis.clients.jedis.Response tsQueryIndex(java.lang.String... p0)`
- `public redis.clients.jedis.Response tsRange(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response tsRange(java.lang.String p0, redis.clients.jedis.timeseries.TSRangeParams p1)`
- `public redis.clients.jedis.Response tsRevRange(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response tsRevRange(java.lang.String p0, redis.clients.jedis.timeseries.TSRangeParams p1)`
- `public redis.clients.jedis.Response ttl(byte[] p0)`
- `public redis.clients.jedis.Response ttl(java.lang.String p0)`
- `public redis.clients.jedis.Response type(byte[] p0)`
- `public redis.clients.jedis.Response type(java.lang.String p0)`
- `public redis.clients.jedis.Response unlink(byte[] p0)`
- `public redis.clients.jedis.Response unlink(byte[]... p0)`
- `public redis.clients.jedis.Response unlink(java.lang.String p0)`
- `public redis.clients.jedis.Response unlink(java.lang.String... p0)`
- `public redis.clients.jedis.Response waitReplicas(byte[] p0, int p1, long p2)`
- `public redis.clients.jedis.Response waitReplicas(int p0, long p1)`
- `public redis.clients.jedis.Response waitReplicas(java.lang.String p0, int p1, long p2)`
- `public redis.clients.jedis.Response xack(byte[] p0, byte[] p1, byte[]... p2)`
- `public redis.clients.jedis.Response xack(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID... p2)`
- `public redis.clients.jedis.Response xadd(byte[] p0, redis.clients.jedis.params.XAddParams p1, java.util.Map p2)`
- `public redis.clients.jedis.Response xadd(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, java.util.Map p2)`
- `public redis.clients.jedis.Response xadd(java.lang.String p0, redis.clients.jedis.params.XAddParams p1, java.util.Map p2)`
- `public redis.clients.jedis.Response xautoclaim(byte[] p0, byte[] p1, byte[] p2, long p3, byte[] p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public redis.clients.jedis.Response xautoclaim(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.StreamEntryID p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public redis.clients.jedis.Response xautoclaimJustId(byte[] p0, byte[] p1, byte[] p2, long p3, byte[] p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public redis.clients.jedis.Response xautoclaimJustId(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.StreamEntryID p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public redis.clients.jedis.Response xclaim(byte[] p0, byte[] p1, byte[] p2, long p3, redis.clients.jedis.params.XClaimParams p4, byte[]... p5)`
- `public redis.clients.jedis.Response xclaim(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.params.XClaimParams p4, redis.clients.jedis.StreamEntryID... p5)`
- `public redis.clients.jedis.Response xclaimJustId(byte[] p0, byte[] p1, byte[] p2, long p3, redis.clients.jedis.params.XClaimParams p4, byte[]... p5)`
- `public redis.clients.jedis.Response xclaimJustId(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.params.XClaimParams p4, redis.clients.jedis.StreamEntryID... p5)`
- `public redis.clients.jedis.Response xdel(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response xdel(java.lang.String p0, redis.clients.jedis.StreamEntryID... p1)`
- `public redis.clients.jedis.Response xgroupCreate(byte[] p0, byte[] p1, byte[] p2, boolean p3)`
- `public redis.clients.jedis.Response xgroupCreate(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID p2, boolean p3)`
- `public redis.clients.jedis.Response xgroupCreateConsumer(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response xgroupCreateConsumer(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response xgroupDelConsumer(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response xgroupDelConsumer(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response xgroupDestroy(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response xgroupDestroy(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response xgroupSetID(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response xgroupSetID(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID p2)`
- `public redis.clients.jedis.Response xinfoConsumers(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response xinfoConsumers(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response xinfoGroup(byte[] p0)`
- `public redis.clients.jedis.Response xinfoGroup(java.lang.String p0)`
- `public redis.clients.jedis.Response xinfoGroups(byte[] p0)`
- `public redis.clients.jedis.Response xinfoGroups(java.lang.String p0)`
- `public redis.clients.jedis.Response xinfoStream(byte[] p0)`
- `public redis.clients.jedis.Response xinfoStream(java.lang.String p0)`
- `public redis.clients.jedis.Response xinfoStreamFull(byte[] p0)`
- `public redis.clients.jedis.Response xinfoStreamFull(byte[] p0, int p1)`
- `public redis.clients.jedis.Response xinfoStreamFull(java.lang.String p0)`
- `public redis.clients.jedis.Response xinfoStreamFull(java.lang.String p0, int p1)`
- `public redis.clients.jedis.Response xlen(byte[] p0)`
- `public redis.clients.jedis.Response xlen(java.lang.String p0)`
- `public redis.clients.jedis.Response xpending(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response xpending(byte[] p0, byte[] p1, byte[] p2, byte[] p3, int p4, byte[] p5)`
- `public redis.clients.jedis.Response xpending(byte[] p0, byte[] p1, redis.clients.jedis.params.XPendingParams p2)`
- `public redis.clients.jedis.Response xpending(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response xpending(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID p2, redis.clients.jedis.StreamEntryID p3, int p4, java.lang.String p5)`
- `public redis.clients.jedis.Response xpending(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.XPendingParams p2)`
- `public redis.clients.jedis.Response xrange(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response xrange(byte[] p0, byte[] p1, byte[] p2, int p3)`
- `public redis.clients.jedis.Response xrange(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response xrange(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3)`
- `public redis.clients.jedis.Response xrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2)`
- `public redis.clients.jedis.Response xrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2, int p3)`
- `public redis.clients.jedis.Response xread(redis.clients.jedis.params.XReadParams p0, java.util.Map$Entry... p1)`
- `public redis.clients.jedis.Response xread(redis.clients.jedis.params.XReadParams p0, java.util.Map p1)`
- `public redis.clients.jedis.Response xreadGroup(byte[] p0, byte[] p1, redis.clients.jedis.params.XReadGroupParams p2, java.util.Map$Entry... p3)`
- `public redis.clients.jedis.Response xreadGroup(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.XReadGroupParams p2, java.util.Map p3)`
- `public redis.clients.jedis.Response xrevrange(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response xrevrange(byte[] p0, byte[] p1, byte[] p2, int p3)`
- `public redis.clients.jedis.Response xrevrange(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response xrevrange(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3)`
- `public redis.clients.jedis.Response xrevrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2)`
- `public redis.clients.jedis.Response xrevrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2, int p3)`
- `public redis.clients.jedis.Response xtrim(byte[] p0, long p1, boolean p2)`
- `public redis.clients.jedis.Response xtrim(byte[] p0, redis.clients.jedis.params.XTrimParams p1)`
- `public redis.clients.jedis.Response xtrim(java.lang.String p0, long p1, boolean p2)`
- `public redis.clients.jedis.Response xtrim(java.lang.String p0, redis.clients.jedis.params.XTrimParams p1)`
- `public redis.clients.jedis.Response zadd(byte[] p0, double p1, byte[] p2)`
- `public redis.clients.jedis.Response zadd(byte[] p0, double p1, byte[] p2, redis.clients.jedis.params.ZAddParams p3)`
- `public redis.clients.jedis.Response zadd(byte[] p0, java.util.Map p1)`
- `public redis.clients.jedis.Response zadd(byte[] p0, java.util.Map p1, redis.clients.jedis.params.ZAddParams p2)`
- `public redis.clients.jedis.Response zadd(java.lang.String p0, double p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zadd(java.lang.String p0, double p1, java.lang.String p2, redis.clients.jedis.params.ZAddParams p3)`
- `public redis.clients.jedis.Response zadd(java.lang.String p0, java.util.Map p1)`
- `public redis.clients.jedis.Response zadd(java.lang.String p0, java.util.Map p1, redis.clients.jedis.params.ZAddParams p2)`
- `public redis.clients.jedis.Response zaddIncr(byte[] p0, double p1, byte[] p2, redis.clients.jedis.params.ZAddParams p3)`
- `public redis.clients.jedis.Response zaddIncr(java.lang.String p0, double p1, java.lang.String p2, redis.clients.jedis.params.ZAddParams p3)`
- `public redis.clients.jedis.Response zcard(byte[] p0)`
- `public redis.clients.jedis.Response zcard(java.lang.String p0)`
- `public redis.clients.jedis.Response zcount(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zcount(byte[] p0, double p1, double p2)`
- `public redis.clients.jedis.Response zcount(java.lang.String p0, double p1, double p2)`
- `public redis.clients.jedis.Response zcount(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zdiff(byte[]... p0)`
- `public redis.clients.jedis.Response zdiff(java.lang.String... p0)`
- `public redis.clients.jedis.Response zdiffStore(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response zdiffStore(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zdiffWithScores(byte[]... p0)`
- `public redis.clients.jedis.Response zdiffWithScores(java.lang.String... p0)`
- `public redis.clients.jedis.Response zincrby(byte[] p0, double p1, byte[] p2)`
- `public redis.clients.jedis.Response zincrby(byte[] p0, double p1, byte[] p2, redis.clients.jedis.params.ZIncrByParams p3)`
- `public redis.clients.jedis.Response zincrby(java.lang.String p0, double p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zincrby(java.lang.String p0, double p1, java.lang.String p2, redis.clients.jedis.params.ZIncrByParams p3)`
- `public redis.clients.jedis.Response zinter(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public redis.clients.jedis.Response zinter(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zinterWithScores(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public redis.clients.jedis.Response zinterWithScores(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zintercard(byte[]... p0)`
- `public redis.clients.jedis.Response zintercard(java.lang.String... p0)`
- `public redis.clients.jedis.Response zintercard(long p0, byte[]... p1)`
- `public redis.clients.jedis.Response zintercard(long p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zinterstore(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response zinterstore(byte[] p0, redis.clients.jedis.params.ZParams p1, byte[]... p2)`
- `public redis.clients.jedis.Response zinterstore(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zinterstore(java.lang.String p0, redis.clients.jedis.params.ZParams p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response zlexcount(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zlexcount(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zmpop(redis.clients.jedis.args.SortedSetOption p0, byte[]... p1)`
- `public redis.clients.jedis.Response zmpop(redis.clients.jedis.args.SortedSetOption p0, int p1, byte[]... p2)`
- `public redis.clients.jedis.Response zmpop(redis.clients.jedis.args.SortedSetOption p0, int p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response zmpop(redis.clients.jedis.args.SortedSetOption p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zmscore(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response zmscore(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zpopmax(byte[] p0)`
- `public redis.clients.jedis.Response zpopmax(byte[] p0, int p1)`
- `public redis.clients.jedis.Response zpopmax(java.lang.String p0)`
- `public redis.clients.jedis.Response zpopmax(java.lang.String p0, int p1)`
- `public redis.clients.jedis.Response zpopmin(byte[] p0)`
- `public redis.clients.jedis.Response zpopmin(byte[] p0, int p1)`
- `public redis.clients.jedis.Response zpopmin(java.lang.String p0)`
- `public redis.clients.jedis.Response zpopmin(java.lang.String p0, int p1)`
- `public redis.clients.jedis.Response zrandmember(byte[] p0)`
- `public redis.clients.jedis.Response zrandmember(byte[] p0, long p1)`
- `public redis.clients.jedis.Response zrandmember(java.lang.String p0)`
- `public redis.clients.jedis.Response zrandmember(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response zrandmemberWithScores(byte[] p0, long p1)`
- `public redis.clients.jedis.Response zrandmemberWithScores(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response zrange(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response zrange(byte[] p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public redis.clients.jedis.Response zrange(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response zrange(java.lang.String p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public redis.clients.jedis.Response zrangeByLex(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zrangeByLex(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByScore(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zrangeByScore(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByScore(byte[] p0, double p1, double p2)`
- `public redis.clients.jedis.Response zrangeByScore(byte[] p0, double p1, double p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByScore(java.lang.String p0, double p1, double p2)`
- `public redis.clients.jedis.Response zrangeByScore(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByScoreWithScores(byte[] p0, double p1, double p2)`
- `public redis.clients.jedis.Response zrangeByScoreWithScores(byte[] p0, double p1, double p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByScoreWithScores(java.lang.String p0, double p1, double p2)`
- `public redis.clients.jedis.Response zrangeByScoreWithScores(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeWithScores(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response zrangeWithScores(byte[] p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public redis.clients.jedis.Response zrangeWithScores(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response zrangeWithScores(java.lang.String p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public redis.clients.jedis.Response zrangestore(byte[] p0, byte[] p1, redis.clients.jedis.params.ZRangeParams p2)`
- `public redis.clients.jedis.Response zrangestore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ZRangeParams p2)`
- `public redis.clients.jedis.Response zrank(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response zrank(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response zrem(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response zrem(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zremrangeByLex(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zremrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zremrangeByRank(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response zremrangeByRank(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response zremrangeByScore(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zremrangeByScore(byte[] p0, double p1, double p2)`
- `public redis.clients.jedis.Response zremrangeByScore(java.lang.String p0, double p1, double p2)`
- `public redis.clients.jedis.Response zremrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zrevrange(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response zrevrange(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response zrevrangeByLex(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zrevrangeByLex(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zrevrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByScore(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zrevrangeByScore(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByScore(byte[] p0, double p1, double p2)`
- `public redis.clients.jedis.Response zrevrangeByScore(byte[] p0, double p1, double p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByScore(java.lang.String p0, double p1, double p2)`
- `public redis.clients.jedis.Response zrevrangeByScore(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zrevrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zrevrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByScoreWithScores(byte[] p0, double p1, double p2)`
- `public redis.clients.jedis.Response zrevrangeByScoreWithScores(byte[] p0, double p1, double p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByScoreWithScores(java.lang.String p0, double p1, double p2)`
- `public redis.clients.jedis.Response zrevrangeByScoreWithScores(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zrevrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeWithScores(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response zrevrangeWithScores(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response zrevrank(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response zrevrank(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response zscan(byte[] p0, byte[] p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.Response zscan(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.Response zscore(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response zscore(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response zunion(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public redis.clients.jedis.Response zunion(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zunionWithScores(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public redis.clients.jedis.Response zunionWithScores(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zunionstore(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response zunionstore(byte[] p0, redis.clients.jedis.params.ZParams p1, byte[]... p2)`
- `public redis.clients.jedis.Response zunionstore(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zunionstore(java.lang.String p0, redis.clients.jedis.params.ZParams p1, java.lang.String... p2)`

---

## public class `redis.clients.jedis.Pipeline`
extends `redis.clients.jedis.Queable`  
implements `java.io.Closeable`, `redis.clients.jedis.commands.DatabasePipelineCommands`, `redis.clients.jedis.commands.PipelineBinaryCommands`, `redis.clients.jedis.commands.PipelineCommands`, `redis.clients.jedis.commands.RedisModulePipelineCommands`  

**Constructors:**
- `public Pipeline(redis.clients.jedis.Connection p0)`
- `public Pipeline(redis.clients.jedis.Jedis p0)`

**Fields:**
- `protected final redis.clients.jedis.Connection connection`

**Methods:**
- `public redis.clients.jedis.Response append(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response append(java.lang.String p0, java.lang.String p1)`
- `public final <T extends java.lang.Object> redis.clients.jedis.Response appendCommand(redis.clients.jedis.CommandObject p0)`
- `public redis.clients.jedis.Response bfAdd(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response bfExists(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response bfInfo(java.lang.String p0)`
- `public redis.clients.jedis.Response bfInsert(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response bfInsert(java.lang.String p0, redis.clients.jedis.bloom.BFInsertParams p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response bfLoadChunk(java.lang.String p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response bfMAdd(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response bfMExists(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response bfReserve(java.lang.String p0, double p1, long p2)`
- `public redis.clients.jedis.Response bfReserve(java.lang.String p0, double p1, long p2, redis.clients.jedis.bloom.BFReserveParams p3)`
- `public redis.clients.jedis.Response bfScanDump(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response bitcount(byte[] p0)`
- `public redis.clients.jedis.Response bitcount(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response bitcount(byte[] p0, long p1, long p2, redis.clients.jedis.args.BitCountOption p3)`
- `public redis.clients.jedis.Response bitcount(java.lang.String p0)`
- `public redis.clients.jedis.Response bitcount(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response bitcount(java.lang.String p0, long p1, long p2, redis.clients.jedis.args.BitCountOption p3)`
- `public redis.clients.jedis.Response bitfield(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response bitfield(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response bitfieldReadonly(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response bitfieldReadonly(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response bitop(redis.clients.jedis.args.BitOP p0, byte[] p1, byte[]... p2)`
- `public redis.clients.jedis.Response bitop(redis.clients.jedis.args.BitOP p0, java.lang.String p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response bitpos(byte[] p0, boolean p1)`
- `public redis.clients.jedis.Response bitpos(byte[] p0, boolean p1, redis.clients.jedis.params.BitPosParams p2)`
- `public redis.clients.jedis.Response bitpos(java.lang.String p0, boolean p1)`
- `public redis.clients.jedis.Response bitpos(java.lang.String p0, boolean p1, redis.clients.jedis.params.BitPosParams p2)`
- `public redis.clients.jedis.Response blmove(byte[] p0, byte[] p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3, double p4)`
- `public redis.clients.jedis.Response blmove(java.lang.String p0, java.lang.String p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3, double p4)`
- `public redis.clients.jedis.Response blmpop(long p0, redis.clients.jedis.args.ListDirection p1, byte[]... p2)`
- `public redis.clients.jedis.Response blmpop(long p0, redis.clients.jedis.args.ListDirection p1, int p2, byte[]... p3)`
- `public redis.clients.jedis.Response blmpop(long p0, redis.clients.jedis.args.ListDirection p1, int p2, java.lang.String... p3)`
- `public redis.clients.jedis.Response blmpop(long p0, redis.clients.jedis.args.ListDirection p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response blpop(double p0, byte[]... p1)`
- `public redis.clients.jedis.Response blpop(double p0, java.lang.String p1)`
- `public redis.clients.jedis.Response blpop(double p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response blpop(int p0, byte[]... p1)`
- `public redis.clients.jedis.Response blpop(int p0, java.lang.String p1)`
- `public redis.clients.jedis.Response blpop(int p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response brpop(double p0, byte[]... p1)`
- `public redis.clients.jedis.Response brpop(double p0, java.lang.String p1)`
- `public redis.clients.jedis.Response brpop(double p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response brpop(int p0, byte[]... p1)`
- `public redis.clients.jedis.Response brpop(int p0, java.lang.String p1)`
- `public redis.clients.jedis.Response brpop(int p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response brpoplpush(byte[] p0, byte[] p1, int p2)`
- `public redis.clients.jedis.Response brpoplpush(java.lang.String p0, java.lang.String p1, int p2)`
- `public redis.clients.jedis.Response bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, byte[]... p2)`
- `public redis.clients.jedis.Response bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, int p2, byte[]... p3)`
- `public redis.clients.jedis.Response bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, int p2, java.lang.String... p3)`
- `public redis.clients.jedis.Response bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response bzpopmax(double p0, byte[]... p1)`
- `public redis.clients.jedis.Response bzpopmax(double p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response bzpopmin(double p0, byte[]... p1)`
- `public redis.clients.jedis.Response bzpopmin(double p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response cfAdd(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response cfAddNx(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response cfCount(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response cfDel(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response cfExists(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response cfInfo(java.lang.String p0)`
- `public redis.clients.jedis.Response cfInsert(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response cfInsert(java.lang.String p0, redis.clients.jedis.bloom.CFInsertParams p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response cfInsertNx(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response cfInsertNx(java.lang.String p0, redis.clients.jedis.bloom.CFInsertParams p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response cfLoadChunk(java.lang.String p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response cfReserve(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response cfReserve(java.lang.String p0, long p1, redis.clients.jedis.bloom.CFReserveParams p2)`
- `public redis.clients.jedis.Response cfScanDump(java.lang.String p0, long p1)`
- `public void close()`
- `public redis.clients.jedis.Response cmsIncrBy(java.lang.String p0, java.util.Map p1)`
- `public redis.clients.jedis.Response cmsInfo(java.lang.String p0)`
- `public redis.clients.jedis.Response cmsInitByDim(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response cmsInitByProb(java.lang.String p0, double p1, double p2)`
- `public redis.clients.jedis.Response cmsMerge(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response cmsMerge(java.lang.String p0, java.util.Map p1)`
- `public redis.clients.jedis.Response cmsQuery(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response copy(byte[] p0, byte[] p1, boolean p2)`
- `public redis.clients.jedis.Response copy(byte[] p0, byte[] p1, int p2, boolean p3)`
- `public redis.clients.jedis.Response copy(java.lang.String p0, java.lang.String p1, boolean p2)`
- `public redis.clients.jedis.Response copy(java.lang.String p0, java.lang.String p1, int p2, boolean p3)`
- `public redis.clients.jedis.Response dbSize()`
- `public redis.clients.jedis.Response decr(byte[] p0)`
- `public redis.clients.jedis.Response decr(java.lang.String p0)`
- `public redis.clients.jedis.Response decrBy(byte[] p0, long p1)`
- `public redis.clients.jedis.Response decrBy(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response del(byte[] p0)`
- `public redis.clients.jedis.Response del(byte[]... p0)`
- `public redis.clients.jedis.Response del(java.lang.String p0)`
- `public redis.clients.jedis.Response del(java.lang.String... p0)`
- `public redis.clients.jedis.Response dump(byte[] p0)`
- `public redis.clients.jedis.Response dump(java.lang.String p0)`
- `public redis.clients.jedis.Response eval(byte[] p0)`
- `public redis.clients.jedis.Response eval(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response eval(byte[] p0, int p1, byte[]... p2)`
- `public redis.clients.jedis.Response eval(byte[] p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response eval(java.lang.String p0)`
- `public redis.clients.jedis.Response eval(java.lang.String p0, int p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response eval(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response eval(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response evalReadonly(byte[] p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response evalReadonly(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response evalsha(byte[] p0)`
- `public redis.clients.jedis.Response evalsha(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response evalsha(byte[] p0, int p1, byte[]... p2)`
- `public redis.clients.jedis.Response evalsha(byte[] p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response evalsha(java.lang.String p0)`
- `public redis.clients.jedis.Response evalsha(java.lang.String p0, int p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response evalsha(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response evalsha(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response evalshaReadonly(byte[] p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response evalshaReadonly(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public <T extends java.lang.Object> redis.clients.jedis.Response executeCommand(redis.clients.jedis.CommandObject p0)`
- `public redis.clients.jedis.Response exists(byte[] p0)`
- `public redis.clients.jedis.Response exists(byte[]... p0)`
- `public redis.clients.jedis.Response exists(java.lang.String p0)`
- `public redis.clients.jedis.Response exists(java.lang.String... p0)`
- `public redis.clients.jedis.Response expire(byte[] p0, long p1)`
- `public redis.clients.jedis.Response expire(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public redis.clients.jedis.Response expire(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response expire(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public redis.clients.jedis.Response expireAt(byte[] p0, long p1)`
- `public redis.clients.jedis.Response expireAt(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public redis.clients.jedis.Response expireAt(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response expireAt(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public redis.clients.jedis.Response expireTime(byte[] p0)`
- `public redis.clients.jedis.Response expireTime(java.lang.String p0)`
- `public redis.clients.jedis.Response fcall(byte[] p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response fcall(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response fcallReadonly(byte[] p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response fcallReadonly(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response ftAggregate(java.lang.String p0, redis.clients.jedis.search.aggr.AggregationBuilder p1)`
- `public redis.clients.jedis.Response ftAliasAdd(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftAliasDel(java.lang.String p0)`
- `public redis.clients.jedis.Response ftAliasUpdate(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftAlter(java.lang.String p0, java.lang.Iterable p1)`
- `public redis.clients.jedis.Response ftAlter(java.lang.String p0, redis.clients.jedis.search.Schema p1)`
- `public redis.clients.jedis.Response ftConfigGet(java.lang.String p0)`
- `public redis.clients.jedis.Response ftConfigGet(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftConfigSet(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftConfigSet(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response ftCreate(java.lang.String p0, redis.clients.jedis.search.FTCreateParams p1, java.lang.Iterable p2)`
- `public redis.clients.jedis.Response ftCreate(java.lang.String p0, redis.clients.jedis.search.IndexOptions p1, redis.clients.jedis.search.Schema p2)`
- `public redis.clients.jedis.Response ftCursorDel(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response ftCursorRead(java.lang.String p0, long p1, int p2)`
- `public redis.clients.jedis.Response ftDictAdd(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response ftDictAddBySampleKey(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response ftDictDel(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response ftDictDelBySampleKey(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response ftDictDump(java.lang.String p0)`
- `public redis.clients.jedis.Response ftDictDumpBySampleKey(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftDropIndex(java.lang.String p0)`
- `public redis.clients.jedis.Response ftDropIndexDD(java.lang.String p0)`
- `public redis.clients.jedis.Response ftExplain(java.lang.String p0, redis.clients.jedis.search.Query p1)`
- `public redis.clients.jedis.Response ftExplainCLI(java.lang.String p0, redis.clients.jedis.search.Query p1)`
- `public redis.clients.jedis.Response ftInfo(java.lang.String p0)`
- `public redis.clients.jedis.Response ftSearch(byte[] p0, redis.clients.jedis.search.Query p1)`
- `public redis.clients.jedis.Response ftSearch(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftSearch(java.lang.String p0, java.lang.String p1, redis.clients.jedis.search.FTSearchParams p2)`
- `public redis.clients.jedis.Response ftSearch(java.lang.String p0, redis.clients.jedis.search.Query p1)`
- `public redis.clients.jedis.Response ftSugAdd(java.lang.String p0, java.lang.String p1, double p2)`
- `public redis.clients.jedis.Response ftSugAddIncr(java.lang.String p0, java.lang.String p1, double p2)`
- `public redis.clients.jedis.Response ftSugDel(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftSugGet(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftSugGet(java.lang.String p0, java.lang.String p1, boolean p2, int p3)`
- `public redis.clients.jedis.Response ftSugGetWithScores(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftSugGetWithScores(java.lang.String p0, java.lang.String p1, boolean p2, int p3)`
- `public redis.clients.jedis.Response ftSugLen(java.lang.String p0)`
- `public redis.clients.jedis.Response ftSynDump(java.lang.String p0)`
- `public redis.clients.jedis.Response ftSynUpdate(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response ftTagVals(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response functionDelete(byte[] p0)`
- `public redis.clients.jedis.Response functionDelete(java.lang.String p0)`
- `public redis.clients.jedis.Response functionDump()`
- `public redis.clients.jedis.Response functionFlush()`
- `public redis.clients.jedis.Response functionFlush(redis.clients.jedis.args.FlushMode p0)`
- `public redis.clients.jedis.Response functionKill()`
- `public redis.clients.jedis.Response functionList()`
- `public redis.clients.jedis.Response functionList(byte[] p0)`
- `public redis.clients.jedis.Response functionList(java.lang.String p0)`
- `public redis.clients.jedis.Response functionListBinary()`
- `public redis.clients.jedis.Response functionListWithCode()`
- `public redis.clients.jedis.Response functionListWithCode(byte[] p0)`
- `public redis.clients.jedis.Response functionListWithCode(java.lang.String p0)`
- `public redis.clients.jedis.Response functionListWithCodeBinary()`
- `public redis.clients.jedis.Response functionLoad(byte[] p0)`
- `public redis.clients.jedis.Response functionLoad(java.lang.String p0)`
- `public redis.clients.jedis.Response functionLoadReplace(byte[] p0)`
- `public redis.clients.jedis.Response functionLoadReplace(java.lang.String p0)`
- `public redis.clients.jedis.Response functionRestore(byte[] p0)`
- `public redis.clients.jedis.Response functionRestore(byte[] p0, redis.clients.jedis.args.FunctionRestorePolicy p1)`
- `public redis.clients.jedis.Response functionStats()`
- `public redis.clients.jedis.Response functionStatsBinary()`
- `public redis.clients.jedis.Response geoadd(byte[] p0, double p1, double p2, byte[] p3)`
- `public redis.clients.jedis.Response geoadd(byte[] p0, java.util.Map p1)`
- `public redis.clients.jedis.Response geoadd(byte[] p0, redis.clients.jedis.params.GeoAddParams p1, java.util.Map p2)`
- `public redis.clients.jedis.Response geoadd(java.lang.String p0, double p1, double p2, java.lang.String p3)`
- `public redis.clients.jedis.Response geoadd(java.lang.String p0, java.util.Map p1)`
- `public redis.clients.jedis.Response geoadd(java.lang.String p0, redis.clients.jedis.params.GeoAddParams p1, java.util.Map p2)`
- `public redis.clients.jedis.Response geodist(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response geodist(byte[] p0, byte[] p1, byte[] p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response geodist(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response geodist(java.lang.String p0, java.lang.String p1, java.lang.String p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response geohash(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response geohash(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response geopos(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response geopos(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response georadius(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response georadius(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public redis.clients.jedis.Response georadius(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response georadius(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public redis.clients.jedis.Response georadiusByMember(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response georadiusByMember(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public redis.clients.jedis.Response georadiusByMember(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response georadiusByMember(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public redis.clients.jedis.Response georadiusByMemberReadonly(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response georadiusByMemberReadonly(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public redis.clients.jedis.Response georadiusByMemberReadonly(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response georadiusByMemberReadonly(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public redis.clients.jedis.Response georadiusByMemberStore(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4, redis.clients.jedis.params.GeoRadiusStoreParam p5)`
- `public redis.clients.jedis.Response georadiusByMemberStore(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4, redis.clients.jedis.params.GeoRadiusStoreParam p5)`
- `public redis.clients.jedis.Response georadiusReadonly(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response georadiusReadonly(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public redis.clients.jedis.Response georadiusReadonly(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response georadiusReadonly(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public redis.clients.jedis.Response georadiusStore(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5, redis.clients.jedis.params.GeoRadiusStoreParam p6)`
- `public redis.clients.jedis.Response georadiusStore(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5, redis.clients.jedis.params.GeoRadiusStoreParam p6)`
- `public redis.clients.jedis.Response geosearch(byte[] p0, byte[] p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response geosearch(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response geosearch(byte[] p0, redis.clients.jedis.GeoCoordinate p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response geosearch(byte[] p0, redis.clients.jedis.GeoCoordinate p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response geosearch(byte[] p0, redis.clients.jedis.params.GeoSearchParam p1)`
- `public redis.clients.jedis.Response geosearch(java.lang.String p0, java.lang.String p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response geosearch(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response geosearch(java.lang.String p0, redis.clients.jedis.GeoCoordinate p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response geosearch(java.lang.String p0, redis.clients.jedis.GeoCoordinate p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response geosearch(java.lang.String p0, redis.clients.jedis.params.GeoSearchParam p1)`
- `public redis.clients.jedis.Response geosearchStore(byte[] p0, byte[] p1, byte[] p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public redis.clients.jedis.Response geosearchStore(byte[] p0, byte[] p1, byte[] p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response geosearchStore(byte[] p0, byte[] p1, redis.clients.jedis.GeoCoordinate p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public redis.clients.jedis.Response geosearchStore(byte[] p0, byte[] p1, redis.clients.jedis.GeoCoordinate p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response geosearchStore(byte[] p0, byte[] p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public redis.clients.jedis.Response geosearchStore(java.lang.String p0, java.lang.String p1, java.lang.String p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public redis.clients.jedis.Response geosearchStore(java.lang.String p0, java.lang.String p1, java.lang.String p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response geosearchStore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.GeoCoordinate p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public redis.clients.jedis.Response geosearchStore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.GeoCoordinate p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response geosearchStore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public redis.clients.jedis.Response geosearchStoreStoreDist(byte[] p0, byte[] p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public redis.clients.jedis.Response geosearchStoreStoreDist(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public redis.clients.jedis.Response get(byte[] p0)`
- `public redis.clients.jedis.Response get(java.lang.String p0)`
- `public redis.clients.jedis.Response getDel(byte[] p0)`
- `public redis.clients.jedis.Response getDel(java.lang.String p0)`
- `public redis.clients.jedis.Response getEx(byte[] p0, redis.clients.jedis.params.GetExParams p1)`
- `public redis.clients.jedis.Response getEx(java.lang.String p0, redis.clients.jedis.params.GetExParams p1)`
- `public redis.clients.jedis.Response getSet(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response getSet(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response getbit(byte[] p0, long p1)`
- `public redis.clients.jedis.Response getbit(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response getrange(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response getrange(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response graphDelete(java.lang.String p0)`
- `public redis.clients.jedis.Response graphProfile(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response graphQuery(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response graphQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public redis.clients.jedis.Response graphQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2, long p3)`
- `public redis.clients.jedis.Response graphQuery(java.lang.String p0, java.lang.String p1, long p2)`
- `public redis.clients.jedis.Response graphReadonlyQuery(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response graphReadonlyQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public redis.clients.jedis.Response graphReadonlyQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2, long p3)`
- `public redis.clients.jedis.Response graphReadonlyQuery(java.lang.String p0, java.lang.String p1, long p2)`
- `public final boolean hasPipelinedResponse()`
- `public redis.clients.jedis.Response hdel(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response hdel(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response hexists(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response hexists(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response hget(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response hget(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response hgetAll(byte[] p0)`
- `public redis.clients.jedis.Response hgetAll(java.lang.String p0)`
- `public redis.clients.jedis.Response hincrBy(byte[] p0, byte[] p1, long p2)`
- `public redis.clients.jedis.Response hincrBy(java.lang.String p0, java.lang.String p1, long p2)`
- `public redis.clients.jedis.Response hincrByFloat(byte[] p0, byte[] p1, double p2)`
- `public redis.clients.jedis.Response hincrByFloat(java.lang.String p0, java.lang.String p1, double p2)`
- `public redis.clients.jedis.Response hkeys(byte[] p0)`
- `public redis.clients.jedis.Response hkeys(java.lang.String p0)`
- `public redis.clients.jedis.Response hlen(byte[] p0)`
- `public redis.clients.jedis.Response hlen(java.lang.String p0)`
- `public redis.clients.jedis.Response hmget(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response hmget(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response hmset(byte[] p0, java.util.Map p1)`
- `public redis.clients.jedis.Response hmset(java.lang.String p0, java.util.Map p1)`
- `public redis.clients.jedis.Response hrandfield(byte[] p0)`
- `public redis.clients.jedis.Response hrandfield(byte[] p0, long p1)`
- `public redis.clients.jedis.Response hrandfield(java.lang.String p0)`
- `public redis.clients.jedis.Response hrandfield(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response hrandfieldWithValues(byte[] p0, long p1)`
- `public redis.clients.jedis.Response hrandfieldWithValues(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response hscan(byte[] p0, byte[] p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.Response hscan(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.Response hset(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response hset(byte[] p0, java.util.Map p1)`
- `public redis.clients.jedis.Response hset(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response hset(java.lang.String p0, java.util.Map p1)`
- `public redis.clients.jedis.Response hsetnx(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response hsetnx(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response hstrlen(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response hstrlen(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response hvals(byte[] p0)`
- `public redis.clients.jedis.Response hvals(java.lang.String p0)`
- `public redis.clients.jedis.Response incr(byte[] p0)`
- `public redis.clients.jedis.Response incr(java.lang.String p0)`
- `public redis.clients.jedis.Response incrBy(byte[] p0, long p1)`
- `public redis.clients.jedis.Response incrBy(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response incrByFloat(byte[] p0, double p1)`
- `public redis.clients.jedis.Response incrByFloat(java.lang.String p0, double p1)`
- `public redis.clients.jedis.Response jsonArrAppend(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object... p2)`
- `public redis.clients.jedis.Response jsonArrAppend(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object... p2)`
- `public redis.clients.jedis.Response jsonArrAppendWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object... p2)`
- `public redis.clients.jedis.Response jsonArrIndex(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2)`
- `public redis.clients.jedis.Response jsonArrIndex(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public redis.clients.jedis.Response jsonArrIndexWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public redis.clients.jedis.Response jsonArrInsert(java.lang.String p0, redis.clients.jedis.json.Path p1, int p2, java.lang.Object... p3)`
- `public redis.clients.jedis.Response jsonArrInsert(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2, java.lang.Object... p3)`
- `public redis.clients.jedis.Response jsonArrInsertWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2, java.lang.Object... p3)`
- `public redis.clients.jedis.Response jsonArrLen(java.lang.String p0)`
- `public redis.clients.jedis.Response jsonArrLen(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public redis.clients.jedis.Response jsonArrLen(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public redis.clients.jedis.Response jsonArrPop(java.lang.String p0)`
- `public <T extends java.lang.Object> redis.clients.jedis.Response jsonArrPop(java.lang.String p0, java.lang.Class p1)`
- `public <T extends java.lang.Object> redis.clients.jedis.Response jsonArrPop(java.lang.String p0, java.lang.Class p1, redis.clients.jedis.json.Path p2)`
- `public <T extends java.lang.Object> redis.clients.jedis.Response jsonArrPop(java.lang.String p0, java.lang.Class p1, redis.clients.jedis.json.Path p2, int p3)`
- `public redis.clients.jedis.Response jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public redis.clients.jedis.Response jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path p1, int p2)`
- `public redis.clients.jedis.Response jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public redis.clients.jedis.Response jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2)`
- `public redis.clients.jedis.Response jsonArrTrim(java.lang.String p0, redis.clients.jedis.json.Path p1, int p2, int p3)`
- `public redis.clients.jedis.Response jsonArrTrim(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2, int p3)`
- `public redis.clients.jedis.Response jsonClear(java.lang.String p0)`
- `public redis.clients.jedis.Response jsonClear(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public redis.clients.jedis.Response jsonClear(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public redis.clients.jedis.Response jsonDel(java.lang.String p0)`
- `public redis.clients.jedis.Response jsonDel(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public redis.clients.jedis.Response jsonDel(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public redis.clients.jedis.Response jsonGet(java.lang.String p0)`
- `public <T extends java.lang.Object> redis.clients.jedis.Response jsonGet(java.lang.String p0, java.lang.Class p1)`
- `public <T extends java.lang.Object> redis.clients.jedis.Response jsonGet(java.lang.String p0, java.lang.Class p1, redis.clients.jedis.json.Path... p2)`
- `public redis.clients.jedis.Response jsonGet(java.lang.String p0, redis.clients.jedis.json.Path2... p1)`
- `public redis.clients.jedis.Response jsonGet(java.lang.String p0, redis.clients.jedis.json.Path... p1)`
- `public <T extends java.lang.Object> redis.clients.jedis.Response jsonMGet(redis.clients.jedis.json.Path p0, java.lang.Class p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response jsonMGet(redis.clients.jedis.json.Path2 p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response jsonNumIncrBy(java.lang.String p0, redis.clients.jedis.json.Path p1, double p2)`
- `public redis.clients.jedis.Response jsonNumIncrBy(java.lang.String p0, redis.clients.jedis.json.Path2 p1, double p2)`
- `public redis.clients.jedis.Response jsonSet(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2)`
- `public redis.clients.jedis.Response jsonSet(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2, redis.clients.jedis.json.JsonSetParams p3)`
- `public redis.clients.jedis.Response jsonSet(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public redis.clients.jedis.Response jsonSet(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2, redis.clients.jedis.json.JsonSetParams p3)`
- `public redis.clients.jedis.Response jsonSetWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public redis.clients.jedis.Response jsonSetWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2, redis.clients.jedis.json.JsonSetParams p3)`
- `public redis.clients.jedis.Response jsonStrAppend(java.lang.String p0, java.lang.Object p1)`
- `public redis.clients.jedis.Response jsonStrAppend(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2)`
- `public redis.clients.jedis.Response jsonStrAppend(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public redis.clients.jedis.Response jsonStrLen(java.lang.String p0)`
- `public redis.clients.jedis.Response jsonStrLen(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public redis.clients.jedis.Response jsonStrLen(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public redis.clients.jedis.Response jsonToggle(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public redis.clients.jedis.Response jsonToggle(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public redis.clients.jedis.Response jsonType(java.lang.String p0)`
- `public redis.clients.jedis.Response jsonType(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public redis.clients.jedis.Response jsonType(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public redis.clients.jedis.Response keys(byte[] p0)`
- `public redis.clients.jedis.Response keys(java.lang.String p0)`
- `public redis.clients.jedis.Response lcs(byte[] p0, byte[] p1, redis.clients.jedis.params.LCSParams p2)`
- `public redis.clients.jedis.Response lcs(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.LCSParams p2)`
- `public redis.clients.jedis.Response lindex(byte[] p0, long p1)`
- `public redis.clients.jedis.Response lindex(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response linsert(byte[] p0, redis.clients.jedis.args.ListPosition p1, byte[] p2, byte[] p3)`
- `public redis.clients.jedis.Response linsert(java.lang.String p0, redis.clients.jedis.args.ListPosition p1, java.lang.String p2, java.lang.String p3)`
- `public redis.clients.jedis.Response llen(byte[] p0)`
- `public redis.clients.jedis.Response llen(java.lang.String p0)`
- `public redis.clients.jedis.Response lmove(byte[] p0, byte[] p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3)`
- `public redis.clients.jedis.Response lmove(java.lang.String p0, java.lang.String p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3)`
- `public redis.clients.jedis.Response lmpop(redis.clients.jedis.args.ListDirection p0, byte[]... p1)`
- `public redis.clients.jedis.Response lmpop(redis.clients.jedis.args.ListDirection p0, int p1, byte[]... p2)`
- `public redis.clients.jedis.Response lmpop(redis.clients.jedis.args.ListDirection p0, int p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response lmpop(redis.clients.jedis.args.ListDirection p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response lpop(byte[] p0)`
- `public redis.clients.jedis.Response lpop(byte[] p0, int p1)`
- `public redis.clients.jedis.Response lpop(java.lang.String p0)`
- `public redis.clients.jedis.Response lpop(java.lang.String p0, int p1)`
- `public redis.clients.jedis.Response lpos(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response lpos(byte[] p0, byte[] p1, redis.clients.jedis.params.LPosParams p2)`
- `public redis.clients.jedis.Response lpos(byte[] p0, byte[] p1, redis.clients.jedis.params.LPosParams p2, long p3)`
- `public redis.clients.jedis.Response lpos(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response lpos(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.LPosParams p2)`
- `public redis.clients.jedis.Response lpos(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.LPosParams p2, long p3)`
- `public redis.clients.jedis.Response lpush(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response lpush(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response lpushx(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response lpushx(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response lrange(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response lrange(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response lrem(byte[] p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response lrem(java.lang.String p0, long p1, java.lang.String p2)`
- `public redis.clients.jedis.Response lset(byte[] p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response lset(java.lang.String p0, long p1, java.lang.String p2)`
- `public redis.clients.jedis.Response ltrim(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response ltrim(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response memoryUsage(byte[] p0)`
- `public redis.clients.jedis.Response memoryUsage(byte[] p0, int p1)`
- `public redis.clients.jedis.Response memoryUsage(java.lang.String p0)`
- `public redis.clients.jedis.Response memoryUsage(java.lang.String p0, int p1)`
- `public redis.clients.jedis.Response mget(byte[]... p0)`
- `public redis.clients.jedis.Response mget(java.lang.String... p0)`
- `public redis.clients.jedis.Response migrate(java.lang.String p0, int p1, byte[] p2, int p3)`
- `public redis.clients.jedis.Response migrate(java.lang.String p0, int p1, byte[] p2, int p3, int p4)`
- `public redis.clients.jedis.Response migrate(java.lang.String p0, int p1, int p2, int p3, redis.clients.jedis.params.MigrateParams p4, byte[]... p5)`
- `public redis.clients.jedis.Response migrate(java.lang.String p0, int p1, int p2, int p3, redis.clients.jedis.params.MigrateParams p4, java.lang.String... p5)`
- `public redis.clients.jedis.Response migrate(java.lang.String p0, int p1, int p2, redis.clients.jedis.params.MigrateParams p3, byte[]... p4)`
- `public redis.clients.jedis.Response migrate(java.lang.String p0, int p1, int p2, redis.clients.jedis.params.MigrateParams p3, java.lang.String... p4)`
- `public redis.clients.jedis.Response migrate(java.lang.String p0, int p1, java.lang.String p2, int p3)`
- `public redis.clients.jedis.Response migrate(java.lang.String p0, int p1, java.lang.String p2, int p3, int p4)`
- `public redis.clients.jedis.Response move(byte[] p0, int p1)`
- `public redis.clients.jedis.Response move(java.lang.String p0, int p1)`
- `public redis.clients.jedis.Response mset(byte[]... p0)`
- `public redis.clients.jedis.Response mset(java.lang.String... p0)`
- `public redis.clients.jedis.Response msetnx(byte[]... p0)`
- `public redis.clients.jedis.Response msetnx(java.lang.String... p0)`
- `public redis.clients.jedis.Response objectEncoding(byte[] p0)`
- `public redis.clients.jedis.Response objectEncoding(java.lang.String p0)`
- `public redis.clients.jedis.Response objectFreq(byte[] p0)`
- `public redis.clients.jedis.Response objectFreq(java.lang.String p0)`
- `public redis.clients.jedis.Response objectIdletime(byte[] p0)`
- `public redis.clients.jedis.Response objectIdletime(java.lang.String p0)`
- `public redis.clients.jedis.Response objectRefcount(byte[] p0)`
- `public redis.clients.jedis.Response objectRefcount(java.lang.String p0)`
- `public redis.clients.jedis.Response persist(byte[] p0)`
- `public redis.clients.jedis.Response persist(java.lang.String p0)`
- `public redis.clients.jedis.Response pexpire(byte[] p0, long p1)`
- `public redis.clients.jedis.Response pexpire(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public redis.clients.jedis.Response pexpire(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response pexpire(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public redis.clients.jedis.Response pexpireAt(byte[] p0, long p1)`
- `public redis.clients.jedis.Response pexpireAt(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public redis.clients.jedis.Response pexpireAt(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response pexpireAt(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public redis.clients.jedis.Response pexpireTime(byte[] p0)`
- `public redis.clients.jedis.Response pexpireTime(java.lang.String p0)`
- `public redis.clients.jedis.Response pfadd(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response pfadd(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response pfcount(byte[] p0)`
- `public redis.clients.jedis.Response pfcount(byte[]... p0)`
- `public redis.clients.jedis.Response pfcount(java.lang.String p0)`
- `public redis.clients.jedis.Response pfcount(java.lang.String... p0)`
- `public redis.clients.jedis.Response pfmerge(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response pfmerge(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response psetex(byte[] p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response psetex(java.lang.String p0, long p1, java.lang.String p2)`
- `public redis.clients.jedis.Response pttl(byte[] p0)`
- `public redis.clients.jedis.Response pttl(java.lang.String p0)`
- `public redis.clients.jedis.Response publish(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response publish(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response randomBinaryKey()`
- `public redis.clients.jedis.Response randomKey()`
- `public redis.clients.jedis.Response rename(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response rename(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response renamenx(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response renamenx(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response restore(byte[] p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response restore(byte[] p0, long p1, byte[] p2, redis.clients.jedis.params.RestoreParams p3)`
- `public redis.clients.jedis.Response restore(java.lang.String p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response restore(java.lang.String p0, long p1, byte[] p2, redis.clients.jedis.params.RestoreParams p3)`
- `public redis.clients.jedis.Response rpop(byte[] p0)`
- `public redis.clients.jedis.Response rpop(byte[] p0, int p1)`
- `public redis.clients.jedis.Response rpop(java.lang.String p0)`
- `public redis.clients.jedis.Response rpop(java.lang.String p0, int p1)`
- `public redis.clients.jedis.Response rpoplpush(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response rpoplpush(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response rpush(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response rpush(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response rpushx(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response rpushx(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response sadd(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response sadd(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response scan(byte[] p0)`
- `public redis.clients.jedis.Response scan(byte[] p0, redis.clients.jedis.params.ScanParams p1)`
- `public redis.clients.jedis.Response scan(byte[] p0, redis.clients.jedis.params.ScanParams p1, byte[] p2)`
- `public redis.clients.jedis.Response scan(java.lang.String p0)`
- `public redis.clients.jedis.Response scan(java.lang.String p0, redis.clients.jedis.params.ScanParams p1)`
- `public redis.clients.jedis.Response scan(java.lang.String p0, redis.clients.jedis.params.ScanParams p1, java.lang.String p2)`
- `public redis.clients.jedis.Response scard(byte[] p0)`
- `public redis.clients.jedis.Response scard(java.lang.String p0)`
- `public redis.clients.jedis.Response scriptExists(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response scriptExists(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response scriptFlush(byte[] p0)`
- `public redis.clients.jedis.Response scriptFlush(byte[] p0, redis.clients.jedis.args.FlushMode p1)`
- `public redis.clients.jedis.Response scriptFlush(java.lang.String p0)`
- `public redis.clients.jedis.Response scriptFlush(java.lang.String p0, redis.clients.jedis.args.FlushMode p1)`
- `public redis.clients.jedis.Response scriptKill(byte[] p0)`
- `public redis.clients.jedis.Response scriptKill(java.lang.String p0)`
- `public redis.clients.jedis.Response scriptLoad(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response scriptLoad(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response sdiff(byte[]... p0)`
- `public redis.clients.jedis.Response sdiff(java.lang.String... p0)`
- `public redis.clients.jedis.Response sdiffstore(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response sdiffstore(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response select(int p0)`
- `public redis.clients.jedis.Response sendCommand(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.Response sendCommand(redis.clients.jedis.commands.ProtocolCommand p0, byte[]... p1)`
- `public redis.clients.jedis.Response sendCommand(redis.clients.jedis.commands.ProtocolCommand p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response set(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response set(byte[] p0, byte[] p1, redis.clients.jedis.params.SetParams p2)`
- `public redis.clients.jedis.Response set(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response set(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.SetParams p2)`
- `public redis.clients.jedis.Response setGet(byte[] p0, byte[] p1, redis.clients.jedis.params.SetParams p2)`
- `public redis.clients.jedis.Response setGet(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.SetParams p2)`
- `public redis.clients.jedis.Response setbit(byte[] p0, long p1, boolean p2)`
- `public redis.clients.jedis.Response setbit(java.lang.String p0, long p1, boolean p2)`
- `public redis.clients.jedis.Response setex(byte[] p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response setex(java.lang.String p0, long p1, java.lang.String p2)`
- `public redis.clients.jedis.Response setnx(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response setnx(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response setrange(byte[] p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response setrange(java.lang.String p0, long p1, java.lang.String p2)`
- `public redis.clients.jedis.Response sinter(byte[]... p0)`
- `public redis.clients.jedis.Response sinter(java.lang.String... p0)`
- `public redis.clients.jedis.Response sintercard(byte[]... p0)`
- `public redis.clients.jedis.Response sintercard(int p0, byte[]... p1)`
- `public redis.clients.jedis.Response sintercard(int p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response sintercard(java.lang.String... p0)`
- `public redis.clients.jedis.Response sinterstore(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response sinterstore(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response sismember(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response sismember(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response smembers(byte[] p0)`
- `public redis.clients.jedis.Response smembers(java.lang.String p0)`
- `public redis.clients.jedis.Response smismember(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response smismember(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response smove(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response smove(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response sort(byte[] p0)`
- `public redis.clients.jedis.Response sort(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response sort(byte[] p0, redis.clients.jedis.params.SortingParams p1)`
- `public redis.clients.jedis.Response sort(byte[] p0, redis.clients.jedis.params.SortingParams p1, byte[] p2)`
- `public redis.clients.jedis.Response sort(java.lang.String p0)`
- `public redis.clients.jedis.Response sort(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response sort(java.lang.String p0, redis.clients.jedis.params.SortingParams p1)`
- `public redis.clients.jedis.Response sort(java.lang.String p0, redis.clients.jedis.params.SortingParams p1, java.lang.String p2)`
- `public redis.clients.jedis.Response sortReadonly(byte[] p0, redis.clients.jedis.params.SortingParams p1)`
- `public redis.clients.jedis.Response sortReadonly(java.lang.String p0, redis.clients.jedis.params.SortingParams p1)`
- `public redis.clients.jedis.Response spop(byte[] p0)`
- `public redis.clients.jedis.Response spop(byte[] p0, long p1)`
- `public redis.clients.jedis.Response spop(java.lang.String p0)`
- `public redis.clients.jedis.Response spop(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response srandmember(byte[] p0)`
- `public redis.clients.jedis.Response srandmember(byte[] p0, int p1)`
- `public redis.clients.jedis.Response srandmember(java.lang.String p0)`
- `public redis.clients.jedis.Response srandmember(java.lang.String p0, int p1)`
- `public redis.clients.jedis.Response srem(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response srem(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response sscan(byte[] p0, byte[] p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.Response sscan(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.Response strAlgoLCSKeys(byte[] p0, byte[] p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public redis.clients.jedis.Response strAlgoLCSKeys(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public redis.clients.jedis.Response strAlgoLCSStrings(byte[] p0, byte[] p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public redis.clients.jedis.Response strAlgoLCSStrings(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public redis.clients.jedis.Response strlen(byte[] p0)`
- `public redis.clients.jedis.Response strlen(java.lang.String p0)`
- `public redis.clients.jedis.Response substr(byte[] p0, int p1, int p2)`
- `public redis.clients.jedis.Response substr(java.lang.String p0, int p1, int p2)`
- `public redis.clients.jedis.Response sunion(byte[]... p0)`
- `public redis.clients.jedis.Response sunion(java.lang.String... p0)`
- `public redis.clients.jedis.Response sunionstore(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response sunionstore(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response swapDB(int p0, int p1)`
- `public void sync()`
- `public java.util.List syncAndReturnAll()`
- `public redis.clients.jedis.Response tdigestAdd(java.lang.String p0, double... p1)`
- `public redis.clients.jedis.Response tdigestByRank(java.lang.String p0, long... p1)`
- `public redis.clients.jedis.Response tdigestByRevRank(java.lang.String p0, long... p1)`
- `public redis.clients.jedis.Response tdigestCDF(java.lang.String p0, double... p1)`
- `public redis.clients.jedis.Response tdigestCreate(java.lang.String p0)`
- `public redis.clients.jedis.Response tdigestCreate(java.lang.String p0, int p1)`
- `public redis.clients.jedis.Response tdigestInfo(java.lang.String p0)`
- `public redis.clients.jedis.Response tdigestMax(java.lang.String p0)`
- `public redis.clients.jedis.Response tdigestMerge(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response tdigestMerge(redis.clients.jedis.bloom.TDigestMergeParams p0, java.lang.String p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response tdigestMin(java.lang.String p0)`
- `public redis.clients.jedis.Response tdigestQuantile(java.lang.String p0, double... p1)`
- `public redis.clients.jedis.Response tdigestRank(java.lang.String p0, double... p1)`
- `public redis.clients.jedis.Response tdigestReset(java.lang.String p0)`
- `public redis.clients.jedis.Response tdigestRevRank(java.lang.String p0, double... p1)`
- `public redis.clients.jedis.Response tdigestTrimmedMean(java.lang.String p0, double p1, double p2)`
- `public redis.clients.jedis.Response time()`
- `public redis.clients.jedis.Response topkAdd(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response topkCount(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response topkIncrBy(java.lang.String p0, java.util.Map p1)`
- `public redis.clients.jedis.Response topkInfo(java.lang.String p0)`
- `public redis.clients.jedis.Response topkList(java.lang.String p0)`
- `public redis.clients.jedis.Response topkQuery(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response topkReserve(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response topkReserve(java.lang.String p0, long p1, long p2, long p3, double p4)`
- `public redis.clients.jedis.Response touch(byte[] p0)`
- `public redis.clients.jedis.Response touch(byte[]... p0)`
- `public redis.clients.jedis.Response touch(java.lang.String p0)`
- `public redis.clients.jedis.Response touch(java.lang.String... p0)`
- `public redis.clients.jedis.Response tsAdd(java.lang.String p0, double p1)`
- `public redis.clients.jedis.Response tsAdd(java.lang.String p0, long p1, double p2)`
- `public redis.clients.jedis.Response tsAdd(java.lang.String p0, long p1, double p2, redis.clients.jedis.timeseries.TSCreateParams p3)`
- `public redis.clients.jedis.Response tsAlter(java.lang.String p0, redis.clients.jedis.timeseries.TSAlterParams p1)`
- `public redis.clients.jedis.Response tsCreate(java.lang.String p0)`
- `public redis.clients.jedis.Response tsCreate(java.lang.String p0, redis.clients.jedis.timeseries.TSCreateParams p1)`
- `public redis.clients.jedis.Response tsCreateRule(java.lang.String p0, java.lang.String p1, redis.clients.jedis.timeseries.AggregationType p2, long p3)`
- `public redis.clients.jedis.Response tsCreateRule(java.lang.String p0, java.lang.String p1, redis.clients.jedis.timeseries.AggregationType p2, long p3, long p4)`
- `public redis.clients.jedis.Response tsDecrBy(java.lang.String p0, double p1)`
- `public redis.clients.jedis.Response tsDecrBy(java.lang.String p0, double p1, long p2)`
- `public redis.clients.jedis.Response tsDel(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response tsDeleteRule(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response tsGet(java.lang.String p0)`
- `public redis.clients.jedis.Response tsGet(java.lang.String p0, redis.clients.jedis.timeseries.TSGetParams p1)`
- `public redis.clients.jedis.Response tsIncrBy(java.lang.String p0, double p1)`
- `public redis.clients.jedis.Response tsIncrBy(java.lang.String p0, double p1, long p2)`
- `public redis.clients.jedis.Response tsMAdd(java.util.Map$Entry... p0)`
- `public redis.clients.jedis.Response tsMGet(redis.clients.jedis.timeseries.TSMGetParams p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response tsMRange(long p0, long p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response tsMRange(redis.clients.jedis.timeseries.TSMRangeParams p0)`
- `public redis.clients.jedis.Response tsMRevRange(long p0, long p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response tsMRevRange(redis.clients.jedis.timeseries.TSMRangeParams p0)`
- `public redis.clients.jedis.Response tsQueryIndex(java.lang.String... p0)`
- `public redis.clients.jedis.Response tsRange(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response tsRange(java.lang.String p0, redis.clients.jedis.timeseries.TSRangeParams p1)`
- `public redis.clients.jedis.Response tsRevRange(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response tsRevRange(java.lang.String p0, redis.clients.jedis.timeseries.TSRangeParams p1)`
- `public redis.clients.jedis.Response ttl(byte[] p0)`
- `public redis.clients.jedis.Response ttl(java.lang.String p0)`
- `public redis.clients.jedis.Response type(byte[] p0)`
- `public redis.clients.jedis.Response type(java.lang.String p0)`
- `public redis.clients.jedis.Response unlink(byte[] p0)`
- `public redis.clients.jedis.Response unlink(byte[]... p0)`
- `public redis.clients.jedis.Response unlink(java.lang.String p0)`
- `public redis.clients.jedis.Response unlink(java.lang.String... p0)`
- `public redis.clients.jedis.Response waitReplicas(byte[] p0, int p1, long p2)`
- `public redis.clients.jedis.Response waitReplicas(int p0, long p1)`
- `public redis.clients.jedis.Response waitReplicas(java.lang.String p0, int p1, long p2)`
- `public redis.clients.jedis.Response xack(byte[] p0, byte[] p1, byte[]... p2)`
- `public redis.clients.jedis.Response xack(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID... p2)`
- `public redis.clients.jedis.Response xadd(byte[] p0, redis.clients.jedis.params.XAddParams p1, java.util.Map p2)`
- `public redis.clients.jedis.Response xadd(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, java.util.Map p2)`
- `public redis.clients.jedis.Response xadd(java.lang.String p0, redis.clients.jedis.params.XAddParams p1, java.util.Map p2)`
- `public redis.clients.jedis.Response xautoclaim(byte[] p0, byte[] p1, byte[] p2, long p3, byte[] p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public redis.clients.jedis.Response xautoclaim(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.StreamEntryID p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public redis.clients.jedis.Response xautoclaimJustId(byte[] p0, byte[] p1, byte[] p2, long p3, byte[] p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public redis.clients.jedis.Response xautoclaimJustId(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.StreamEntryID p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public redis.clients.jedis.Response xclaim(byte[] p0, byte[] p1, byte[] p2, long p3, redis.clients.jedis.params.XClaimParams p4, byte[]... p5)`
- `public redis.clients.jedis.Response xclaim(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.params.XClaimParams p4, redis.clients.jedis.StreamEntryID... p5)`
- `public redis.clients.jedis.Response xclaimJustId(byte[] p0, byte[] p1, byte[] p2, long p3, redis.clients.jedis.params.XClaimParams p4, byte[]... p5)`
- `public redis.clients.jedis.Response xclaimJustId(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.params.XClaimParams p4, redis.clients.jedis.StreamEntryID... p5)`
- `public redis.clients.jedis.Response xdel(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response xdel(java.lang.String p0, redis.clients.jedis.StreamEntryID... p1)`
- `public redis.clients.jedis.Response xgroupCreate(byte[] p0, byte[] p1, byte[] p2, boolean p3)`
- `public redis.clients.jedis.Response xgroupCreate(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID p2, boolean p3)`
- `public redis.clients.jedis.Response xgroupCreateConsumer(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response xgroupCreateConsumer(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response xgroupDelConsumer(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response xgroupDelConsumer(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response xgroupDestroy(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response xgroupDestroy(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response xgroupSetID(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response xgroupSetID(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID p2)`
- `public redis.clients.jedis.Response xinfoConsumers(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response xinfoConsumers(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response xinfoGroup(byte[] p0)`
- `public redis.clients.jedis.Response xinfoGroup(java.lang.String p0)`
- `public redis.clients.jedis.Response xinfoGroups(byte[] p0)`
- `public redis.clients.jedis.Response xinfoGroups(java.lang.String p0)`
- `public redis.clients.jedis.Response xinfoStream(byte[] p0)`
- `public redis.clients.jedis.Response xinfoStream(java.lang.String p0)`
- `public redis.clients.jedis.Response xinfoStreamFull(byte[] p0)`
- `public redis.clients.jedis.Response xinfoStreamFull(byte[] p0, int p1)`
- `public redis.clients.jedis.Response xinfoStreamFull(java.lang.String p0)`
- `public redis.clients.jedis.Response xinfoStreamFull(java.lang.String p0, int p1)`
- `public redis.clients.jedis.Response xlen(byte[] p0)`
- `public redis.clients.jedis.Response xlen(java.lang.String p0)`
- `public redis.clients.jedis.Response xpending(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response xpending(byte[] p0, byte[] p1, byte[] p2, byte[] p3, int p4, byte[] p5)`
- `public redis.clients.jedis.Response xpending(byte[] p0, byte[] p1, redis.clients.jedis.params.XPendingParams p2)`
- `public redis.clients.jedis.Response xpending(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response xpending(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID p2, redis.clients.jedis.StreamEntryID p3, int p4, java.lang.String p5)`
- `public redis.clients.jedis.Response xpending(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.XPendingParams p2)`
- `public redis.clients.jedis.Response xrange(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response xrange(byte[] p0, byte[] p1, byte[] p2, int p3)`
- `public redis.clients.jedis.Response xrange(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response xrange(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3)`
- `public redis.clients.jedis.Response xrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2)`
- `public redis.clients.jedis.Response xrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2, int p3)`
- `public redis.clients.jedis.Response xread(redis.clients.jedis.params.XReadParams p0, java.util.Map$Entry... p1)`
- `public redis.clients.jedis.Response xread(redis.clients.jedis.params.XReadParams p0, java.util.Map p1)`
- `public redis.clients.jedis.Response xreadGroup(byte[] p0, byte[] p1, redis.clients.jedis.params.XReadGroupParams p2, java.util.Map$Entry... p3)`
- `public redis.clients.jedis.Response xreadGroup(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.XReadGroupParams p2, java.util.Map p3)`
- `public redis.clients.jedis.Response xrevrange(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response xrevrange(byte[] p0, byte[] p1, byte[] p2, int p3)`
- `public redis.clients.jedis.Response xrevrange(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response xrevrange(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3)`
- `public redis.clients.jedis.Response xrevrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2)`
- `public redis.clients.jedis.Response xrevrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2, int p3)`
- `public redis.clients.jedis.Response xtrim(byte[] p0, long p1, boolean p2)`
- `public redis.clients.jedis.Response xtrim(byte[] p0, redis.clients.jedis.params.XTrimParams p1)`
- `public redis.clients.jedis.Response xtrim(java.lang.String p0, long p1, boolean p2)`
- `public redis.clients.jedis.Response xtrim(java.lang.String p0, redis.clients.jedis.params.XTrimParams p1)`
- `public redis.clients.jedis.Response zadd(byte[] p0, double p1, byte[] p2)`
- `public redis.clients.jedis.Response zadd(byte[] p0, double p1, byte[] p2, redis.clients.jedis.params.ZAddParams p3)`
- `public redis.clients.jedis.Response zadd(byte[] p0, java.util.Map p1)`
- `public redis.clients.jedis.Response zadd(byte[] p0, java.util.Map p1, redis.clients.jedis.params.ZAddParams p2)`
- `public redis.clients.jedis.Response zadd(java.lang.String p0, double p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zadd(java.lang.String p0, double p1, java.lang.String p2, redis.clients.jedis.params.ZAddParams p3)`
- `public redis.clients.jedis.Response zadd(java.lang.String p0, java.util.Map p1)`
- `public redis.clients.jedis.Response zadd(java.lang.String p0, java.util.Map p1, redis.clients.jedis.params.ZAddParams p2)`
- `public redis.clients.jedis.Response zaddIncr(byte[] p0, double p1, byte[] p2, redis.clients.jedis.params.ZAddParams p3)`
- `public redis.clients.jedis.Response zaddIncr(java.lang.String p0, double p1, java.lang.String p2, redis.clients.jedis.params.ZAddParams p3)`
- `public redis.clients.jedis.Response zcard(byte[] p0)`
- `public redis.clients.jedis.Response zcard(java.lang.String p0)`
- `public redis.clients.jedis.Response zcount(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zcount(byte[] p0, double p1, double p2)`
- `public redis.clients.jedis.Response zcount(java.lang.String p0, double p1, double p2)`
- `public redis.clients.jedis.Response zcount(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zdiff(byte[]... p0)`
- `public redis.clients.jedis.Response zdiff(java.lang.String... p0)`
- `public redis.clients.jedis.Response zdiffStore(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response zdiffStore(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zdiffWithScores(byte[]... p0)`
- `public redis.clients.jedis.Response zdiffWithScores(java.lang.String... p0)`
- `public redis.clients.jedis.Response zincrby(byte[] p0, double p1, byte[] p2)`
- `public redis.clients.jedis.Response zincrby(byte[] p0, double p1, byte[] p2, redis.clients.jedis.params.ZIncrByParams p3)`
- `public redis.clients.jedis.Response zincrby(java.lang.String p0, double p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zincrby(java.lang.String p0, double p1, java.lang.String p2, redis.clients.jedis.params.ZIncrByParams p3)`
- `public redis.clients.jedis.Response zinter(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public redis.clients.jedis.Response zinter(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zinterWithScores(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public redis.clients.jedis.Response zinterWithScores(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zintercard(byte[]... p0)`
- `public redis.clients.jedis.Response zintercard(java.lang.String... p0)`
- `public redis.clients.jedis.Response zintercard(long p0, byte[]... p1)`
- `public redis.clients.jedis.Response zintercard(long p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zinterstore(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response zinterstore(byte[] p0, redis.clients.jedis.params.ZParams p1, byte[]... p2)`
- `public redis.clients.jedis.Response zinterstore(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zinterstore(java.lang.String p0, redis.clients.jedis.params.ZParams p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response zlexcount(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zlexcount(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zmpop(redis.clients.jedis.args.SortedSetOption p0, byte[]... p1)`
- `public redis.clients.jedis.Response zmpop(redis.clients.jedis.args.SortedSetOption p0, int p1, byte[]... p2)`
- `public redis.clients.jedis.Response zmpop(redis.clients.jedis.args.SortedSetOption p0, int p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response zmpop(redis.clients.jedis.args.SortedSetOption p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zmscore(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response zmscore(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zpopmax(byte[] p0)`
- `public redis.clients.jedis.Response zpopmax(byte[] p0, int p1)`
- `public redis.clients.jedis.Response zpopmax(java.lang.String p0)`
- `public redis.clients.jedis.Response zpopmax(java.lang.String p0, int p1)`
- `public redis.clients.jedis.Response zpopmin(byte[] p0)`
- `public redis.clients.jedis.Response zpopmin(byte[] p0, int p1)`
- `public redis.clients.jedis.Response zpopmin(java.lang.String p0)`
- `public redis.clients.jedis.Response zpopmin(java.lang.String p0, int p1)`
- `public redis.clients.jedis.Response zrandmember(byte[] p0)`
- `public redis.clients.jedis.Response zrandmember(byte[] p0, long p1)`
- `public redis.clients.jedis.Response zrandmember(java.lang.String p0)`
- `public redis.clients.jedis.Response zrandmember(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response zrandmemberWithScores(byte[] p0, long p1)`
- `public redis.clients.jedis.Response zrandmemberWithScores(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response zrange(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response zrange(byte[] p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public redis.clients.jedis.Response zrange(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response zrange(java.lang.String p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public redis.clients.jedis.Response zrangeByLex(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zrangeByLex(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByScore(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zrangeByScore(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByScore(byte[] p0, double p1, double p2)`
- `public redis.clients.jedis.Response zrangeByScore(byte[] p0, double p1, double p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByScore(java.lang.String p0, double p1, double p2)`
- `public redis.clients.jedis.Response zrangeByScore(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByScoreWithScores(byte[] p0, double p1, double p2)`
- `public redis.clients.jedis.Response zrangeByScoreWithScores(byte[] p0, double p1, double p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByScoreWithScores(java.lang.String p0, double p1, double p2)`
- `public redis.clients.jedis.Response zrangeByScoreWithScores(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeWithScores(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response zrangeWithScores(byte[] p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public redis.clients.jedis.Response zrangeWithScores(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response zrangeWithScores(java.lang.String p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public redis.clients.jedis.Response zrangestore(byte[] p0, byte[] p1, redis.clients.jedis.params.ZRangeParams p2)`
- `public redis.clients.jedis.Response zrangestore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ZRangeParams p2)`
- `public redis.clients.jedis.Response zrank(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response zrank(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response zrem(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response zrem(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zremrangeByLex(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zremrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zremrangeByRank(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response zremrangeByRank(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response zremrangeByScore(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zremrangeByScore(byte[] p0, double p1, double p2)`
- `public redis.clients.jedis.Response zremrangeByScore(java.lang.String p0, double p1, double p2)`
- `public redis.clients.jedis.Response zremrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zrevrange(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response zrevrange(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response zrevrangeByLex(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zrevrangeByLex(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zrevrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByScore(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zrevrangeByScore(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByScore(byte[] p0, double p1, double p2)`
- `public redis.clients.jedis.Response zrevrangeByScore(byte[] p0, double p1, double p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByScore(java.lang.String p0, double p1, double p2)`
- `public redis.clients.jedis.Response zrevrangeByScore(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zrevrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zrevrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByScoreWithScores(byte[] p0, double p1, double p2)`
- `public redis.clients.jedis.Response zrevrangeByScoreWithScores(byte[] p0, double p1, double p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByScoreWithScores(java.lang.String p0, double p1, double p2)`
- `public redis.clients.jedis.Response zrevrangeByScoreWithScores(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zrevrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeWithScores(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response zrevrangeWithScores(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response zrevrank(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response zrevrank(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response zscan(byte[] p0, byte[] p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.Response zscan(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.Response zscore(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response zscore(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response zunion(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public redis.clients.jedis.Response zunion(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zunionWithScores(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public redis.clients.jedis.Response zunionWithScores(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zunionstore(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response zunionstore(byte[] p0, redis.clients.jedis.params.ZParams p1, byte[]... p2)`
- `public redis.clients.jedis.Response zunionstore(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zunionstore(java.lang.String p0, redis.clients.jedis.params.ZParams p1, java.lang.String... p2)`

---

## public final class `redis.clients.jedis.Protocol`

**Fields:**
- `public final static byte ASTERISK_BYTE`
- `public final static byte[] BYTES_ASTERISK`
- `public final static byte[] BYTES_EQUAL`
- `public final static byte[] BYTES_FALSE`
- `public final static byte[] BYTES_TILDE`
- `public final static byte[] BYTES_TRUE`
- `public final static java.nio.charset.Charset CHARSET`
- `public final static int CLUSTER_HASHSLOTS`
- `public final static byte COLON_BYTE`
- `public final static int DEFAULT_DATABASE`
- `public final static java.lang.String DEFAULT_HOST`
- `public final static int DEFAULT_PORT`
- `public final static int DEFAULT_SENTINEL_PORT`
- `public final static int DEFAULT_TIMEOUT`
- `public final static byte DOLLAR_BYTE`
- `public final static byte MINUS_BYTE`
- `public final static byte[] NEGATIVE_INFINITY_BYTES`
- `public final static byte PLUS_BYTE`
- `public final static byte[] POSITIVE_INFINITY_BYTES`

**Methods:**
- `public static java.lang.Object read(redis.clients.jedis.util.RedisInputStream p0)`
- `public static java.lang.String readErrorLineIfPossible(redis.clients.jedis.util.RedisInputStream p0)`
- `public static void sendCommand(redis.clients.jedis.util.RedisOutputStream p0, redis.clients.jedis.CommandArguments p1)`
- `public final static byte[] toByteArray(boolean p0)`
- `public final static byte[] toByteArray(double p0)`
- `public final static byte[] toByteArray(int p0)`
- `public final static byte[] toByteArray(long p0)`

---

## public final static enum `redis.clients.jedis.Protocol$ClusterKeyword`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.Protocol$ClusterKeyword ADDSLOTS`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword ADDSLOTSRANGE`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword BUMPEPOCH`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword COUNTKEYSINSLOT`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword DELSLOTS`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword DELSLOTSRANGE`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword FAILOVER`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword FLUSHSLOTS`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword FORGET`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword GETKEYSINSLOT`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword IMPORTING`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword INFO`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword KEYSLOT`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword LINKS`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword MEET`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword MIGRATING`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword MYID`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword NODE`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword NODES`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword REPLICAS`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword REPLICATE`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword RESET`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword SAVECONFIG`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword SETSLOT`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword SLAVES`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword SLOTS`
- `public final static redis.clients.jedis.Protocol$ClusterKeyword STABLE`

**Methods:**
- `public byte[] getRaw()`

---

## public final static enum `redis.clients.jedis.Protocol$Command`
extends `java.lang.Enum`  
implements `redis.clients.jedis.commands.ProtocolCommand`  

**Fields:**
- `public final static redis.clients.jedis.Protocol$Command ACL`
- `public final static redis.clients.jedis.Protocol$Command APPEND`
- `public final static redis.clients.jedis.Protocol$Command ASKING`
- `public final static redis.clients.jedis.Protocol$Command AUTH`
- `public final static redis.clients.jedis.Protocol$Command BGREWRITEAOF`
- `public final static redis.clients.jedis.Protocol$Command BGSAVE`
- `public final static redis.clients.jedis.Protocol$Command BITCOUNT`
- `public final static redis.clients.jedis.Protocol$Command BITFIELD`
- `public final static redis.clients.jedis.Protocol$Command BITFIELD_RO`
- `public final static redis.clients.jedis.Protocol$Command BITOP`
- `public final static redis.clients.jedis.Protocol$Command BITPOS`
- `public final static redis.clients.jedis.Protocol$Command BLMOVE`
- `public final static redis.clients.jedis.Protocol$Command BLMPOP`
- `public final static redis.clients.jedis.Protocol$Command BLPOP`
- `public final static redis.clients.jedis.Protocol$Command BRPOP`
- `public final static redis.clients.jedis.Protocol$Command BRPOPLPUSH`
- `public final static redis.clients.jedis.Protocol$Command BZMPOP`
- `public final static redis.clients.jedis.Protocol$Command BZPOPMAX`
- `public final static redis.clients.jedis.Protocol$Command BZPOPMIN`
- `public final static redis.clients.jedis.Protocol$Command CLIENT`
- `public final static redis.clients.jedis.Protocol$Command CLUSTER`
- `public final static redis.clients.jedis.Protocol$Command COMMAND`
- `public final static redis.clients.jedis.Protocol$Command CONFIG`
- `public final static redis.clients.jedis.Protocol$Command COPY`
- `public final static redis.clients.jedis.Protocol$Command DBSIZE`
- `public final static redis.clients.jedis.Protocol$Command DECR`
- `public final static redis.clients.jedis.Protocol$Command DECRBY`
- `public final static redis.clients.jedis.Protocol$Command DEL`
- `public final static redis.clients.jedis.Protocol$Command DISCARD`
- `public final static redis.clients.jedis.Protocol$Command DUMP`
- `public final static redis.clients.jedis.Protocol$Command ECHO`
- `public final static redis.clients.jedis.Protocol$Command EVAL`
- `public final static redis.clients.jedis.Protocol$Command EVALSHA`
- `public final static redis.clients.jedis.Protocol$Command EVALSHA_RO`
- `public final static redis.clients.jedis.Protocol$Command EVAL_RO`
- `public final static redis.clients.jedis.Protocol$Command EXEC`
- `public final static redis.clients.jedis.Protocol$Command EXISTS`
- `public final static redis.clients.jedis.Protocol$Command EXPIRE`
- `public final static redis.clients.jedis.Protocol$Command EXPIREAT`
- `public final static redis.clients.jedis.Protocol$Command EXPIRETIME`
- `public final static redis.clients.jedis.Protocol$Command FAILOVER`
- `public final static redis.clients.jedis.Protocol$Command FCALL`
- `public final static redis.clients.jedis.Protocol$Command FCALL_RO`
- `public final static redis.clients.jedis.Protocol$Command FLUSHALL`
- `public final static redis.clients.jedis.Protocol$Command FLUSHDB`
- `public final static redis.clients.jedis.Protocol$Command FUNCTION`
- `public final static redis.clients.jedis.Protocol$Command GEOADD`
- `public final static redis.clients.jedis.Protocol$Command GEODIST`
- `public final static redis.clients.jedis.Protocol$Command GEOHASH`
- `public final static redis.clients.jedis.Protocol$Command GEOPOS`
- `public final static redis.clients.jedis.Protocol$Command GEORADIUS`
- `public final static redis.clients.jedis.Protocol$Command GEORADIUSBYMEMBER`
- `public final static redis.clients.jedis.Protocol$Command GEORADIUSBYMEMBER_RO`
- `public final static redis.clients.jedis.Protocol$Command GEORADIUS_RO`
- `public final static redis.clients.jedis.Protocol$Command GEOSEARCH`
- `public final static redis.clients.jedis.Protocol$Command GEOSEARCHSTORE`
- `public final static redis.clients.jedis.Protocol$Command GET`
- `public final static redis.clients.jedis.Protocol$Command GETBIT`
- `public final static redis.clients.jedis.Protocol$Command GETDEL`
- `public final static redis.clients.jedis.Protocol$Command GETEX`
- `public final static redis.clients.jedis.Protocol$Command GETRANGE`
- `public final static redis.clients.jedis.Protocol$Command GETSET`
- `public final static redis.clients.jedis.Protocol$Command HDEL`
- `public final static redis.clients.jedis.Protocol$Command HEXISTS`
- `public final static redis.clients.jedis.Protocol$Command HGET`
- `public final static redis.clients.jedis.Protocol$Command HGETALL`
- `public final static redis.clients.jedis.Protocol$Command HINCRBY`
- `public final static redis.clients.jedis.Protocol$Command HINCRBYFLOAT`
- `public final static redis.clients.jedis.Protocol$Command HKEYS`
- `public final static redis.clients.jedis.Protocol$Command HLEN`
- `public final static redis.clients.jedis.Protocol$Command HMGET`
- `public final static redis.clients.jedis.Protocol$Command HMSET`
- `public final static redis.clients.jedis.Protocol$Command HRANDFIELD`
- `public final static redis.clients.jedis.Protocol$Command HSCAN`
- `public final static redis.clients.jedis.Protocol$Command HSET`
- `public final static redis.clients.jedis.Protocol$Command HSETNX`
- `public final static redis.clients.jedis.Protocol$Command HSTRLEN`
- `public final static redis.clients.jedis.Protocol$Command HVALS`
- `public final static redis.clients.jedis.Protocol$Command INCR`
- `public final static redis.clients.jedis.Protocol$Command INCRBY`
- `public final static redis.clients.jedis.Protocol$Command INCRBYFLOAT`
- `public final static redis.clients.jedis.Protocol$Command INFO`
- `public final static redis.clients.jedis.Protocol$Command KEYS`
- `public final static redis.clients.jedis.Protocol$Command LASTSAVE`
- `public final static redis.clients.jedis.Protocol$Command LCS`
- `public final static redis.clients.jedis.Protocol$Command LINDEX`
- `public final static redis.clients.jedis.Protocol$Command LINSERT`
- `public final static redis.clients.jedis.Protocol$Command LLEN`
- `public final static redis.clients.jedis.Protocol$Command LMOVE`
- `public final static redis.clients.jedis.Protocol$Command LMPOP`
- `public final static redis.clients.jedis.Protocol$Command LOLWUT`
- `public final static redis.clients.jedis.Protocol$Command LPOP`
- `public final static redis.clients.jedis.Protocol$Command LPOS`
- `public final static redis.clients.jedis.Protocol$Command LPUSH`
- `public final static redis.clients.jedis.Protocol$Command LPUSHX`
- `public final static redis.clients.jedis.Protocol$Command LRANGE`
- `public final static redis.clients.jedis.Protocol$Command LREM`
- `public final static redis.clients.jedis.Protocol$Command LSET`
- `public final static redis.clients.jedis.Protocol$Command LTRIM`
- `public final static redis.clients.jedis.Protocol$Command MEMORY`
- `public final static redis.clients.jedis.Protocol$Command MGET`
- `public final static redis.clients.jedis.Protocol$Command MIGRATE`
- `public final static redis.clients.jedis.Protocol$Command MODULE`
- `public final static redis.clients.jedis.Protocol$Command MONITOR`
- `public final static redis.clients.jedis.Protocol$Command MOVE`
- `public final static redis.clients.jedis.Protocol$Command MSET`
- `public final static redis.clients.jedis.Protocol$Command MSETNX`
- `public final static redis.clients.jedis.Protocol$Command MULTI`
- `public final static redis.clients.jedis.Protocol$Command OBJECT`
- `public final static redis.clients.jedis.Protocol$Command PERSIST`
- `public final static redis.clients.jedis.Protocol$Command PEXPIRE`
- `public final static redis.clients.jedis.Protocol$Command PEXPIREAT`
- `public final static redis.clients.jedis.Protocol$Command PEXPIRETIME`
- `public final static redis.clients.jedis.Protocol$Command PFADD`
- `public final static redis.clients.jedis.Protocol$Command PFCOUNT`
- `public final static redis.clients.jedis.Protocol$Command PFMERGE`
- `public final static redis.clients.jedis.Protocol$Command PING`
- `public final static redis.clients.jedis.Protocol$Command PSETEX`
- `public final static redis.clients.jedis.Protocol$Command PSUBSCRIBE`
- `public final static redis.clients.jedis.Protocol$Command PTTL`
- `public final static redis.clients.jedis.Protocol$Command PUBLISH`
- `public final static redis.clients.jedis.Protocol$Command PUBSUB`
- `public final static redis.clients.jedis.Protocol$Command PUNSUBSCRIBE`
- `public final static redis.clients.jedis.Protocol$Command QUIT`
- `public final static redis.clients.jedis.Protocol$Command RANDOMKEY`
- `public final static redis.clients.jedis.Protocol$Command READONLY`
- `public final static redis.clients.jedis.Protocol$Command READWRITE`
- `public final static redis.clients.jedis.Protocol$Command RENAME`
- `public final static redis.clients.jedis.Protocol$Command RENAMENX`
- `public final static redis.clients.jedis.Protocol$Command REPLICAOF`
- `public final static redis.clients.jedis.Protocol$Command RESTORE`
- `public final static redis.clients.jedis.Protocol$Command ROLE`
- `public final static redis.clients.jedis.Protocol$Command RPOP`
- `public final static redis.clients.jedis.Protocol$Command RPOPLPUSH`
- `public final static redis.clients.jedis.Protocol$Command RPUSH`
- `public final static redis.clients.jedis.Protocol$Command RPUSHX`
- `public final static redis.clients.jedis.Protocol$Command SADD`
- `public final static redis.clients.jedis.Protocol$Command SAVE`
- `public final static redis.clients.jedis.Protocol$Command SCAN`
- `public final static redis.clients.jedis.Protocol$Command SCARD`
- `public final static redis.clients.jedis.Protocol$Command SCRIPT`
- `public final static redis.clients.jedis.Protocol$Command SDIFF`
- `public final static redis.clients.jedis.Protocol$Command SDIFFSTORE`
- `public final static redis.clients.jedis.Protocol$Command SELECT`
- `public final static redis.clients.jedis.Protocol$Command SENTINEL`
- `public final static redis.clients.jedis.Protocol$Command SET`
- `public final static redis.clients.jedis.Protocol$Command SETBIT`
- `public final static redis.clients.jedis.Protocol$Command SETEX`
- `public final static redis.clients.jedis.Protocol$Command SETNX`
- `public final static redis.clients.jedis.Protocol$Command SETRANGE`
- `public final static redis.clients.jedis.Protocol$Command SHUTDOWN`
- `public final static redis.clients.jedis.Protocol$Command SINTER`
- `public final static redis.clients.jedis.Protocol$Command SINTERCARD`
- `public final static redis.clients.jedis.Protocol$Command SINTERSTORE`
- `public final static redis.clients.jedis.Protocol$Command SISMEMBER`
- `public final static redis.clients.jedis.Protocol$Command SLAVEOF`
- `public final static redis.clients.jedis.Protocol$Command SLOWLOG`
- `public final static redis.clients.jedis.Protocol$Command SMEMBERS`
- `public final static redis.clients.jedis.Protocol$Command SMISMEMBER`
- `public final static redis.clients.jedis.Protocol$Command SMOVE`
- `public final static redis.clients.jedis.Protocol$Command SORT`
- `public final static redis.clients.jedis.Protocol$Command SORT_RO`
- `public final static redis.clients.jedis.Protocol$Command SPOP`
- `public final static redis.clients.jedis.Protocol$Command SRANDMEMBER`
- `public final static redis.clients.jedis.Protocol$Command SREM`
- `public final static redis.clients.jedis.Protocol$Command SSCAN`
- `public final static redis.clients.jedis.Protocol$Command STRALGO`
- `public final static redis.clients.jedis.Protocol$Command STRLEN`
- `public final static redis.clients.jedis.Protocol$Command SUBSCRIBE`
- `public final static redis.clients.jedis.Protocol$Command SUBSTR`
- `public final static redis.clients.jedis.Protocol$Command SUNION`
- `public final static redis.clients.jedis.Protocol$Command SUNIONSTORE`
- `public final static redis.clients.jedis.Protocol$Command SWAPDB`
- `public final static redis.clients.jedis.Protocol$Command TIME`
- `public final static redis.clients.jedis.Protocol$Command TOUCH`
- `public final static redis.clients.jedis.Protocol$Command TTL`
- `public final static redis.clients.jedis.Protocol$Command TYPE`
- `public final static redis.clients.jedis.Protocol$Command UNLINK`
- `public final static redis.clients.jedis.Protocol$Command UNSUBSCRIBE`
- `public final static redis.clients.jedis.Protocol$Command UNWATCH`
- `public final static redis.clients.jedis.Protocol$Command WAIT`
- `public final static redis.clients.jedis.Protocol$Command WATCH`
- `public final static redis.clients.jedis.Protocol$Command XACK`
- `public final static redis.clients.jedis.Protocol$Command XADD`
- `public final static redis.clients.jedis.Protocol$Command XAUTOCLAIM`
- `public final static redis.clients.jedis.Protocol$Command XCLAIM`
- `public final static redis.clients.jedis.Protocol$Command XDEL`
- `public final static redis.clients.jedis.Protocol$Command XGROUP`
- `public final static redis.clients.jedis.Protocol$Command XINFO`
- `public final static redis.clients.jedis.Protocol$Command XLEN`
- `public final static redis.clients.jedis.Protocol$Command XPENDING`
- `public final static redis.clients.jedis.Protocol$Command XRANGE`
- `public final static redis.clients.jedis.Protocol$Command XREAD`
- `public final static redis.clients.jedis.Protocol$Command XREADGROUP`
- `public final static redis.clients.jedis.Protocol$Command XREVRANGE`
- `public final static redis.clients.jedis.Protocol$Command XTRIM`
- `public final static redis.clients.jedis.Protocol$Command ZADD`
- `public final static redis.clients.jedis.Protocol$Command ZCARD`
- `public final static redis.clients.jedis.Protocol$Command ZCOUNT`
- `public final static redis.clients.jedis.Protocol$Command ZDIFF`
- `public final static redis.clients.jedis.Protocol$Command ZDIFFSTORE`
- `public final static redis.clients.jedis.Protocol$Command ZINCRBY`
- `public final static redis.clients.jedis.Protocol$Command ZINTER`
- `public final static redis.clients.jedis.Protocol$Command ZINTERCARD`
- `public final static redis.clients.jedis.Protocol$Command ZINTERSTORE`
- `public final static redis.clients.jedis.Protocol$Command ZLEXCOUNT`
- `public final static redis.clients.jedis.Protocol$Command ZMPOP`
- `public final static redis.clients.jedis.Protocol$Command ZMSCORE`
- `public final static redis.clients.jedis.Protocol$Command ZPOPMAX`
- `public final static redis.clients.jedis.Protocol$Command ZPOPMIN`
- `public final static redis.clients.jedis.Protocol$Command ZRANDMEMBER`
- `public final static redis.clients.jedis.Protocol$Command ZRANGE`
- `public final static redis.clients.jedis.Protocol$Command ZRANGEBYLEX`
- `public final static redis.clients.jedis.Protocol$Command ZRANGEBYSCORE`
- `public final static redis.clients.jedis.Protocol$Command ZRANGESTORE`
- `public final static redis.clients.jedis.Protocol$Command ZRANK`
- `public final static redis.clients.jedis.Protocol$Command ZREM`
- `public final static redis.clients.jedis.Protocol$Command ZREMRANGEBYLEX`
- `public final static redis.clients.jedis.Protocol$Command ZREMRANGEBYRANK`
- `public final static redis.clients.jedis.Protocol$Command ZREMRANGEBYSCORE`
- `public final static redis.clients.jedis.Protocol$Command ZREVRANGE`
- `public final static redis.clients.jedis.Protocol$Command ZREVRANGEBYLEX`
- `public final static redis.clients.jedis.Protocol$Command ZREVRANGEBYSCORE`
- `public final static redis.clients.jedis.Protocol$Command ZREVRANK`
- `public final static redis.clients.jedis.Protocol$Command ZSCAN`
- `public final static redis.clients.jedis.Protocol$Command ZSCORE`
- `public final static redis.clients.jedis.Protocol$Command ZUNION`
- `public final static redis.clients.jedis.Protocol$Command ZUNIONSTORE`

**Methods:**
- `public byte[] getRaw()`

---

## public final static enum `redis.clients.jedis.Protocol$Keyword`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.Protocol$Keyword ABORT`
- `public final static redis.clients.jedis.Protocol$Keyword ABSTTL`
- `public final static redis.clients.jedis.Protocol$Keyword ACLCAT`
- `public final static redis.clients.jedis.Protocol$Keyword AGGREGATE`
- `public final static redis.clients.jedis.Protocol$Keyword ALPHA`
- `public final static redis.clients.jedis.Protocol$Keyword ANY`
- `public final static redis.clients.jedis.Protocol$Keyword ASC`
- `public final static redis.clients.jedis.Protocol$Keyword AUTH`
- `public final static redis.clients.jedis.Protocol$Keyword AUTH2`
- `public final static redis.clients.jedis.Protocol$Keyword BLOCK`
- `public final static redis.clients.jedis.Protocol$Keyword BY`
- `public final static redis.clients.jedis.Protocol$Keyword BYBOX`
- `public final static redis.clients.jedis.Protocol$Keyword BYLEX`
- `public final static redis.clients.jedis.Protocol$Keyword BYRADIUS`
- `public final static redis.clients.jedis.Protocol$Keyword BYSCORE`
- `public final static redis.clients.jedis.Protocol$Keyword CAT`
- `public final static redis.clients.jedis.Protocol$Keyword CH`
- `public final static redis.clients.jedis.Protocol$Keyword CHANNELS`
- `public final static redis.clients.jedis.Protocol$Keyword CONSUMERS`
- `public final static redis.clients.jedis.Protocol$Keyword COPY`
- `public final static redis.clients.jedis.Protocol$Keyword COUNT`
- `public final static redis.clients.jedis.Protocol$Keyword CREATE`
- `public final static redis.clients.jedis.Protocol$Keyword CREATECONSUMER`
- `public final static redis.clients.jedis.Protocol$Keyword DB`
- `public final static redis.clients.jedis.Protocol$Keyword DELCONSUMER`
- `public final static redis.clients.jedis.Protocol$Keyword DELETE`
- `public final static redis.clients.jedis.Protocol$Keyword DELUSER`
- `public final static redis.clients.jedis.Protocol$Keyword DESC`
- `public final static redis.clients.jedis.Protocol$Keyword DESCRIPTION`
- `public final static redis.clients.jedis.Protocol$Keyword DESTROY`
- `public final static redis.clients.jedis.Protocol$Keyword DOCS`
- `public final static redis.clients.jedis.Protocol$Keyword DOCTOR`
- `public final static redis.clients.jedis.Protocol$Keyword DRYRUN`
- `public final static redis.clients.jedis.Protocol$Keyword DUMP`
- `public final static redis.clients.jedis.Protocol$Keyword ENCODING`
- `public final static redis.clients.jedis.Protocol$Keyword EX`
- `public final static redis.clients.jedis.Protocol$Keyword EXAT`
- `public final static redis.clients.jedis.Protocol$Keyword EXISTS`
- `public final static redis.clients.jedis.Protocol$Keyword FILTERBY`
- `public final static redis.clients.jedis.Protocol$Keyword FLUSH`
- `public final static redis.clients.jedis.Protocol$Keyword FORCE`
- `public final static redis.clients.jedis.Protocol$Keyword FREQ`
- `public final static redis.clients.jedis.Protocol$Keyword FROMLONLAT`
- `public final static redis.clients.jedis.Protocol$Keyword FROMMEMBER`
- `public final static redis.clients.jedis.Protocol$Keyword FULL`
- `public final static redis.clients.jedis.Protocol$Keyword GENPASS`
- `public final static redis.clients.jedis.Protocol$Keyword GET`
- `public final static redis.clients.jedis.Protocol$Keyword GETKEYS`
- `public final static redis.clients.jedis.Protocol$Keyword GETKEYSANDFLAGS`
- `public final static redis.clients.jedis.Protocol$Keyword GETNAME`
- `public final static redis.clients.jedis.Protocol$Keyword GETUSER`
- `public final static redis.clients.jedis.Protocol$Keyword GROUP`
- `public final static redis.clients.jedis.Protocol$Keyword GROUPS`
- `public final static redis.clients.jedis.Protocol$Keyword HELP`
- `public final static redis.clients.jedis.Protocol$Keyword ID`
- `public final static redis.clients.jedis.Protocol$Keyword IDLE`
- `public final static redis.clients.jedis.Protocol$Keyword IDLETIME`
- `public final static redis.clients.jedis.Protocol$Keyword IDX`
- `public final static redis.clients.jedis.Protocol$Keyword INCR`
- `public final static redis.clients.jedis.Protocol$Keyword INFO`
- `public final static redis.clients.jedis.Protocol$Keyword JUSTID`
- `public final static redis.clients.jedis.Protocol$Keyword KEEPTTL`
- `public final static redis.clients.jedis.Protocol$Keyword KEYS`
- `public final static redis.clients.jedis.Protocol$Keyword KILL`
- `public final static redis.clients.jedis.Protocol$Keyword LCS`
- `public final static redis.clients.jedis.Protocol$Keyword LEN`
- `public final static redis.clients.jedis.Protocol$Keyword LIBRARYNAME`
- `public final static redis.clients.jedis.Protocol$Keyword LIMIT`
- `public final static redis.clients.jedis.Protocol$Keyword LIST`
- `public final static redis.clients.jedis.Protocol$Keyword LOAD`
- `public final static redis.clients.jedis.Protocol$Keyword LOG`
- `public final static redis.clients.jedis.Protocol$Keyword MATCH`
- `public final static redis.clients.jedis.Protocol$Keyword MAXLEN`
- `public final static redis.clients.jedis.Protocol$Keyword MINID`
- `public final static redis.clients.jedis.Protocol$Keyword MINMATCHLEN`
- `public final static redis.clients.jedis.Protocol$Keyword MKSTREAM`
- `public final static redis.clients.jedis.Protocol$Keyword MODULE`
- `public final static redis.clients.jedis.Protocol$Keyword NO`
- `public final static redis.clients.jedis.Protocol$Keyword NOACK`
- `public final static redis.clients.jedis.Protocol$Keyword NOMKSTREAM`
- `public final static redis.clients.jedis.Protocol$Keyword NOSORT`
- `public final static redis.clients.jedis.Protocol$Keyword NOW`
- `public final static redis.clients.jedis.Protocol$Keyword NUMPAT`
- `public final static redis.clients.jedis.Protocol$Keyword NUMSUB`
- `public final static redis.clients.jedis.Protocol$Keyword NX`
- `public final static redis.clients.jedis.Protocol$Keyword ONE`
- `public final static redis.clients.jedis.Protocol$Keyword PATTERN`
- `public final static redis.clients.jedis.Protocol$Keyword PAUSE`
- `public final static redis.clients.jedis.Protocol$Keyword PURGE`
- `public final static redis.clients.jedis.Protocol$Keyword PX`
- `public final static redis.clients.jedis.Protocol$Keyword PXAT`
- `public final static redis.clients.jedis.Protocol$Keyword REFCOUNT`
- `public final static redis.clients.jedis.Protocol$Keyword REPLACE`
- `public final static redis.clients.jedis.Protocol$Keyword RESET`
- `public final static redis.clients.jedis.Protocol$Keyword RESETSTAT`
- `public final static redis.clients.jedis.Protocol$Keyword RETRYCOUNT`
- `public final static redis.clients.jedis.Protocol$Keyword REV`
- `public final static redis.clients.jedis.Protocol$Keyword REWRITE`
- `public final static redis.clients.jedis.Protocol$Keyword SAMPLES`
- `public final static redis.clients.jedis.Protocol$Keyword SAVE`
- `public final static redis.clients.jedis.Protocol$Keyword SCHEDULE`
- `public final static redis.clients.jedis.Protocol$Keyword SET`
- `public final static redis.clients.jedis.Protocol$Keyword SETID`
- `public final static redis.clients.jedis.Protocol$Keyword SETNAME`
- `public final static redis.clients.jedis.Protocol$Keyword SETUSER`
- `public final static redis.clients.jedis.Protocol$Keyword STATS`
- `public final static redis.clients.jedis.Protocol$Keyword STORE`
- `public final static redis.clients.jedis.Protocol$Keyword STOREDIST`
- `public final static redis.clients.jedis.Protocol$Keyword STREAM`
- `public final static redis.clients.jedis.Protocol$Keyword STREAMS`
- `public final static redis.clients.jedis.Protocol$Keyword STRINGS`
- `public final static redis.clients.jedis.Protocol$Keyword TIME`
- `public final static redis.clients.jedis.Protocol$Keyword TIMEOUT`
- `public final static redis.clients.jedis.Protocol$Keyword TO`
- `public final static redis.clients.jedis.Protocol$Keyword TYPE`
- `public final static redis.clients.jedis.Protocol$Keyword UNBLOCK`
- `public final static redis.clients.jedis.Protocol$Keyword UNLOAD`
- `public final static redis.clients.jedis.Protocol$Keyword USAGE`
- `public final static redis.clients.jedis.Protocol$Keyword USERS`
- `public final static redis.clients.jedis.Protocol$Keyword WEIGHTS`
- `public final static redis.clients.jedis.Protocol$Keyword WHOAMI`
- `public final static redis.clients.jedis.Protocol$Keyword WITHCODE`
- `public final static redis.clients.jedis.Protocol$Keyword WITHCOORD`
- `public final static redis.clients.jedis.Protocol$Keyword WITHDIST`
- `public final static redis.clients.jedis.Protocol$Keyword WITHHASH`
- `public final static redis.clients.jedis.Protocol$Keyword WITHMATCHLEN`
- `public final static redis.clients.jedis.Protocol$Keyword WITHSCORES`
- `public final static redis.clients.jedis.Protocol$Keyword WITHVALUES`
- `public final static redis.clients.jedis.Protocol$Keyword XX`

**Methods:**
- `public byte[] getRaw()`

---

## public final static enum `redis.clients.jedis.Protocol$ResponseKeyword`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.Protocol$ResponseKeyword MESSAGE`
- `public final static redis.clients.jedis.Protocol$ResponseKeyword PMESSAGE`
- `public final static redis.clients.jedis.Protocol$ResponseKeyword PONG`
- `public final static redis.clients.jedis.Protocol$ResponseKeyword PSUBSCRIBE`
- `public final static redis.clients.jedis.Protocol$ResponseKeyword PUNSUBSCRIBE`
- `public final static redis.clients.jedis.Protocol$ResponseKeyword SUBSCRIBE`
- `public final static redis.clients.jedis.Protocol$ResponseKeyword UNSUBSCRIBE`

**Methods:**
- `public byte[] getRaw()`

---

## public final static enum `redis.clients.jedis.Protocol$SentinelKeyword`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.Protocol$SentinelKeyword FAILOVER`
- `public final static redis.clients.jedis.Protocol$SentinelKeyword GET_MASTER_ADDR_BY_NAME`
- `public final static redis.clients.jedis.Protocol$SentinelKeyword MASTER`
- `public final static redis.clients.jedis.Protocol$SentinelKeyword MASTERS`
- `public final static redis.clients.jedis.Protocol$SentinelKeyword MONITOR`
- `public final static redis.clients.jedis.Protocol$SentinelKeyword MYID`
- `public final static redis.clients.jedis.Protocol$SentinelKeyword REMOVE`
- `public final static redis.clients.jedis.Protocol$SentinelKeyword REPLICAS`
- `public final static redis.clients.jedis.Protocol$SentinelKeyword RESET`
- `public final static redis.clients.jedis.Protocol$SentinelKeyword SENTINELS`
- `public final static redis.clients.jedis.Protocol$SentinelKeyword SET`
- `public final static redis.clients.jedis.Protocol$SentinelKeyword SLAVES`

**Methods:**
- `public byte[] getRaw()`

---

## public class `redis.clients.jedis.Queable`

**Constructors:**
- `public Queable()`

**Methods:**
- `protected final void clean()`
- `protected final <T extends java.lang.Object> redis.clients.jedis.Response enqueResponse(redis.clients.jedis.Builder p0)`
- `protected final redis.clients.jedis.Response generateResponse(java.lang.Object p0)`
- `protected final int getPipelinedResponseLength()`

---

## public class `redis.clients.jedis.ReliableTransaction`
extends `redis.clients.jedis.TransactionBase`  

**Constructors:**
- `public ReliableTransaction(redis.clients.jedis.Connection p0)`
- `public ReliableTransaction(redis.clients.jedis.Connection p0, boolean p1)`

**Methods:**
- `public final java.lang.String discard()`
- `public final java.util.List exec()`
- `protected final void processAppendStatus()`
- `protected final void processMultiResponse()`
- `protected final void processPipelinedResponses()`

---

## public class `redis.clients.jedis.Response`<T extends java.lang.Object>
implements `java.util.function.Supplier<T>`  

**Constructors:**
- `public Response(redis.clients.jedis.Builder p0)`

**Fields:**
- `protected redis.clients.jedis.exceptions.JedisDataException exception`
- `protected T response`

**Methods:**
- `public T get()`
- `public void set(java.lang.Object p0)`
- `public void setDependency(redis.clients.jedis.Response p0)`
- `public java.lang.String toString()`

---

## public class `redis.clients.jedis.ShardedCommandArguments`
extends `redis.clients.jedis.CommandArguments`  

**Constructors:**
- `public ShardedCommandArguments(redis.clients.jedis.util.Hashing p0, java.util.regex.Pattern p1, redis.clients.jedis.commands.ProtocolCommand p2)`
- `public ShardedCommandArguments(redis.clients.jedis.util.Hashing p0, redis.clients.jedis.commands.ProtocolCommand p1)`

**Methods:**
- `public java.lang.Long getKeyHash()`
- `protected redis.clients.jedis.CommandArguments processKey(byte[] p0)`
- `protected redis.clients.jedis.CommandArguments processKey(java.lang.String p0)`

---

## public class `redis.clients.jedis.ShardedCommandObjects`
extends `redis.clients.jedis.CommandObjects`  

**Constructors:**
- `public ShardedCommandObjects(redis.clients.jedis.util.Hashing p0)`
- `public ShardedCommandObjects(redis.clients.jedis.util.Hashing p0, java.util.regex.Pattern p1)`

**Methods:**
- `protected redis.clients.jedis.ShardedCommandArguments commandArguments(redis.clients.jedis.commands.ProtocolCommand p0)`
- `public redis.clients.jedis.CommandObject dbSize()`
- `public final redis.clients.jedis.CommandObject keys(byte[] p0)`
- `public final redis.clients.jedis.CommandObject keys(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject scan(byte[] p0)`
- `public final redis.clients.jedis.CommandObject scan(byte[] p0, redis.clients.jedis.params.ScanParams p1)`
- `public final redis.clients.jedis.CommandObject scan(byte[] p0, redis.clients.jedis.params.ScanParams p1, byte[] p2)`
- `public final redis.clients.jedis.CommandObject scan(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject scan(java.lang.String p0, redis.clients.jedis.params.ScanParams p1)`
- `public final redis.clients.jedis.CommandObject scan(java.lang.String p0, redis.clients.jedis.params.ScanParams p1, java.lang.String p2)`
- `public final redis.clients.jedis.CommandObject waitReplicas(int p0, long p1)`

---

## public class `redis.clients.jedis.ShardedPipeline`
extends `redis.clients.jedis.MultiNodePipelineBase`  

**Constructors:**
- `public ShardedPipeline(java.util.List p0, redis.clients.jedis.JedisClientConfig p1)`
- `public ShardedPipeline(java.util.List p0, redis.clients.jedis.JedisClientConfig p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2, redis.clients.jedis.util.Hashing p3, java.util.regex.Pattern p4)`
- `public ShardedPipeline(redis.clients.jedis.providers.ShardedConnectionProvider p0)`
- `public ShardedPipeline(redis.clients.jedis.providers.ShardedConnectionProvider p0, java.util.regex.Pattern p1)`

**Methods:**
- `public void close()`
- `protected redis.clients.jedis.Connection getConnection(redis.clients.jedis.HostAndPort p0)`
- `protected redis.clients.jedis.HostAndPort getNodeKey(redis.clients.jedis.CommandArguments p0)`
- `public void prepareGraphCommands()`

---

## public class `redis.clients.jedis.StreamEntryID`
implements `java.io.Serializable`, `java.lang.Comparable<redis.clients.jedis.StreamEntryID>`  

**Constructors:**
- `public StreamEntryID()`
- `public StreamEntryID(byte[] p0)`
- `public StreamEntryID(java.lang.String p0)`
- `public StreamEntryID(long p0)`
- `public StreamEntryID(long p0, long p1)`

**Fields:**
- `public final static redis.clients.jedis.StreamEntryID LAST_ENTRY`
- `public final static redis.clients.jedis.StreamEntryID MAXIMUM_ID`
- `public final static redis.clients.jedis.StreamEntryID MINIMUM_ID`
- `public final static redis.clients.jedis.StreamEntryID NEW_ENTRY`
- `public final static redis.clients.jedis.StreamEntryID UNRECEIVED_ENTRY`

**Methods:**
- `public int compareTo(redis.clients.jedis.StreamEntryID p0)`
- `public boolean equals(java.lang.Object p0)`
- `public long getSequence()`
- `public long getTime()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `redis.clients.jedis.Transaction`
extends `redis.clients.jedis.TransactionBase`  

**Constructors:**
- `public Transaction(redis.clients.jedis.Connection p0)`
- `public Transaction(redis.clients.jedis.Connection p0, boolean p1)`
- `public Transaction(redis.clients.jedis.Jedis p0)`

**Methods:**
- `public final java.lang.String discard()`
- `public final java.util.List exec()`
- `protected final void processAppendStatus()`
- `protected final void processMultiResponse()`
- `protected final void processPipelinedResponses()`

---

## public abstract class `redis.clients.jedis.TransactionBase`
extends `redis.clients.jedis.Queable`  
implements `java.io.Closeable`, `redis.clients.jedis.commands.PipelineBinaryCommands`, `redis.clients.jedis.commands.PipelineCommands`, `redis.clients.jedis.commands.RedisModulePipelineCommands`  

**Constructors:**
- `public TransactionBase(redis.clients.jedis.Connection p0)`
- `public TransactionBase(redis.clients.jedis.Connection p0, boolean p1)`

**Fields:**
- `protected final redis.clients.jedis.Connection connection`

**Methods:**
- `public redis.clients.jedis.Response append(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response append(java.lang.String p0, java.lang.String p1)`
- `protected final <T extends java.lang.Object> redis.clients.jedis.Response appendCommand(redis.clients.jedis.CommandObject p0)`
- `public redis.clients.jedis.Response bfAdd(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response bfExists(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response bfInfo(java.lang.String p0)`
- `public redis.clients.jedis.Response bfInsert(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response bfInsert(java.lang.String p0, redis.clients.jedis.bloom.BFInsertParams p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response bfLoadChunk(java.lang.String p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response bfMAdd(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response bfMExists(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response bfReserve(java.lang.String p0, double p1, long p2)`
- `public redis.clients.jedis.Response bfReserve(java.lang.String p0, double p1, long p2, redis.clients.jedis.bloom.BFReserveParams p3)`
- `public redis.clients.jedis.Response bfScanDump(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response bitcount(byte[] p0)`
- `public redis.clients.jedis.Response bitcount(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response bitcount(byte[] p0, long p1, long p2, redis.clients.jedis.args.BitCountOption p3)`
- `public redis.clients.jedis.Response bitcount(java.lang.String p0)`
- `public redis.clients.jedis.Response bitcount(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response bitcount(java.lang.String p0, long p1, long p2, redis.clients.jedis.args.BitCountOption p3)`
- `public redis.clients.jedis.Response bitfield(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response bitfield(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response bitfieldReadonly(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response bitfieldReadonly(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response bitop(redis.clients.jedis.args.BitOP p0, byte[] p1, byte[]... p2)`
- `public redis.clients.jedis.Response bitop(redis.clients.jedis.args.BitOP p0, java.lang.String p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response bitpos(byte[] p0, boolean p1)`
- `public redis.clients.jedis.Response bitpos(byte[] p0, boolean p1, redis.clients.jedis.params.BitPosParams p2)`
- `public redis.clients.jedis.Response bitpos(java.lang.String p0, boolean p1)`
- `public redis.clients.jedis.Response bitpos(java.lang.String p0, boolean p1, redis.clients.jedis.params.BitPosParams p2)`
- `public redis.clients.jedis.Response blmove(byte[] p0, byte[] p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3, double p4)`
- `public redis.clients.jedis.Response blmove(java.lang.String p0, java.lang.String p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3, double p4)`
- `public redis.clients.jedis.Response blmpop(long p0, redis.clients.jedis.args.ListDirection p1, byte[]... p2)`
- `public redis.clients.jedis.Response blmpop(long p0, redis.clients.jedis.args.ListDirection p1, int p2, byte[]... p3)`
- `public redis.clients.jedis.Response blmpop(long p0, redis.clients.jedis.args.ListDirection p1, int p2, java.lang.String... p3)`
- `public redis.clients.jedis.Response blmpop(long p0, redis.clients.jedis.args.ListDirection p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response blpop(double p0, byte[]... p1)`
- `public redis.clients.jedis.Response blpop(double p0, java.lang.String p1)`
- `public redis.clients.jedis.Response blpop(double p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response blpop(int p0, byte[]... p1)`
- `public redis.clients.jedis.Response blpop(int p0, java.lang.String p1)`
- `public redis.clients.jedis.Response blpop(int p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response brpop(double p0, byte[]... p1)`
- `public redis.clients.jedis.Response brpop(double p0, java.lang.String p1)`
- `public redis.clients.jedis.Response brpop(double p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response brpop(int p0, byte[]... p1)`
- `public redis.clients.jedis.Response brpop(int p0, java.lang.String p1)`
- `public redis.clients.jedis.Response brpop(int p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response brpoplpush(byte[] p0, byte[] p1, int p2)`
- `public redis.clients.jedis.Response brpoplpush(java.lang.String p0, java.lang.String p1, int p2)`
- `public redis.clients.jedis.Response bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, byte[]... p2)`
- `public redis.clients.jedis.Response bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, int p2, byte[]... p3)`
- `public redis.clients.jedis.Response bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, int p2, java.lang.String... p3)`
- `public redis.clients.jedis.Response bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response bzpopmax(double p0, byte[]... p1)`
- `public redis.clients.jedis.Response bzpopmax(double p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response bzpopmin(double p0, byte[]... p1)`
- `public redis.clients.jedis.Response bzpopmin(double p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response cfAdd(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response cfAddNx(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response cfCount(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response cfDel(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response cfExists(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response cfInfo(java.lang.String p0)`
- `public redis.clients.jedis.Response cfInsert(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response cfInsert(java.lang.String p0, redis.clients.jedis.bloom.CFInsertParams p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response cfInsertNx(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response cfInsertNx(java.lang.String p0, redis.clients.jedis.bloom.CFInsertParams p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response cfLoadChunk(java.lang.String p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response cfReserve(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response cfReserve(java.lang.String p0, long p1, redis.clients.jedis.bloom.CFReserveParams p2)`
- `public redis.clients.jedis.Response cfScanDump(java.lang.String p0, long p1)`
- `public final void clear()`
- `public final void close()`
- `public redis.clients.jedis.Response cmsIncrBy(java.lang.String p0, java.util.Map p1)`
- `public redis.clients.jedis.Response cmsInfo(java.lang.String p0)`
- `public redis.clients.jedis.Response cmsInitByDim(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response cmsInitByProb(java.lang.String p0, double p1, double p2)`
- `public redis.clients.jedis.Response cmsMerge(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response cmsMerge(java.lang.String p0, java.util.Map p1)`
- `public redis.clients.jedis.Response cmsQuery(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response copy(byte[] p0, byte[] p1, boolean p2)`
- `public redis.clients.jedis.Response copy(java.lang.String p0, java.lang.String p1, boolean p2)`
- `public redis.clients.jedis.Response decr(byte[] p0)`
- `public redis.clients.jedis.Response decr(java.lang.String p0)`
- `public redis.clients.jedis.Response decrBy(byte[] p0, long p1)`
- `public redis.clients.jedis.Response decrBy(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response del(byte[] p0)`
- `public redis.clients.jedis.Response del(byte[]... p0)`
- `public redis.clients.jedis.Response del(java.lang.String p0)`
- `public redis.clients.jedis.Response del(java.lang.String... p0)`
- `public java.lang.String discard()`
- `public redis.clients.jedis.Response dump(byte[] p0)`
- `public redis.clients.jedis.Response dump(java.lang.String p0)`
- `public redis.clients.jedis.Response eval(byte[] p0)`
- `public redis.clients.jedis.Response eval(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response eval(byte[] p0, int p1, byte[]... p2)`
- `public redis.clients.jedis.Response eval(byte[] p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response eval(java.lang.String p0)`
- `public redis.clients.jedis.Response eval(java.lang.String p0, int p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response eval(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response eval(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response evalReadonly(byte[] p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response evalReadonly(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response evalsha(byte[] p0)`
- `public redis.clients.jedis.Response evalsha(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response evalsha(byte[] p0, int p1, byte[]... p2)`
- `public redis.clients.jedis.Response evalsha(byte[] p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response evalsha(java.lang.String p0)`
- `public redis.clients.jedis.Response evalsha(java.lang.String p0, int p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response evalsha(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response evalsha(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response evalshaReadonly(byte[] p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response evalshaReadonly(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public java.util.List exec()`
- `public <T extends java.lang.Object> redis.clients.jedis.Response executeCommand(redis.clients.jedis.CommandObject p0)`
- `public redis.clients.jedis.Response exists(byte[] p0)`
- `public redis.clients.jedis.Response exists(byte[]... p0)`
- `public redis.clients.jedis.Response exists(java.lang.String p0)`
- `public redis.clients.jedis.Response exists(java.lang.String... p0)`
- `public redis.clients.jedis.Response expire(byte[] p0, long p1)`
- `public redis.clients.jedis.Response expire(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public redis.clients.jedis.Response expire(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response expire(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public redis.clients.jedis.Response expireAt(byte[] p0, long p1)`
- `public redis.clients.jedis.Response expireAt(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public redis.clients.jedis.Response expireAt(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response expireAt(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public redis.clients.jedis.Response expireTime(byte[] p0)`
- `public redis.clients.jedis.Response expireTime(java.lang.String p0)`
- `public redis.clients.jedis.Response fcall(byte[] p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response fcall(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response fcallReadonly(byte[] p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response fcallReadonly(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.Response ftAggregate(java.lang.String p0, redis.clients.jedis.search.aggr.AggregationBuilder p1)`
- `public redis.clients.jedis.Response ftAliasAdd(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftAliasDel(java.lang.String p0)`
- `public redis.clients.jedis.Response ftAliasUpdate(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftAlter(java.lang.String p0, java.lang.Iterable p1)`
- `public redis.clients.jedis.Response ftAlter(java.lang.String p0, redis.clients.jedis.search.Schema p1)`
- `public redis.clients.jedis.Response ftConfigGet(java.lang.String p0)`
- `public redis.clients.jedis.Response ftConfigGet(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftConfigSet(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftConfigSet(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response ftCreate(java.lang.String p0, redis.clients.jedis.search.FTCreateParams p1, java.lang.Iterable p2)`
- `public redis.clients.jedis.Response ftCreate(java.lang.String p0, redis.clients.jedis.search.IndexOptions p1, redis.clients.jedis.search.Schema p2)`
- `public redis.clients.jedis.Response ftCursorDel(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response ftCursorRead(java.lang.String p0, long p1, int p2)`
- `public redis.clients.jedis.Response ftDictAdd(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response ftDictAddBySampleKey(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response ftDictDel(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response ftDictDelBySampleKey(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response ftDictDump(java.lang.String p0)`
- `public redis.clients.jedis.Response ftDictDumpBySampleKey(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftDropIndex(java.lang.String p0)`
- `public redis.clients.jedis.Response ftDropIndexDD(java.lang.String p0)`
- `public redis.clients.jedis.Response ftExplain(java.lang.String p0, redis.clients.jedis.search.Query p1)`
- `public redis.clients.jedis.Response ftExplainCLI(java.lang.String p0, redis.clients.jedis.search.Query p1)`
- `public redis.clients.jedis.Response ftInfo(java.lang.String p0)`
- `public redis.clients.jedis.Response ftSearch(byte[] p0, redis.clients.jedis.search.Query p1)`
- `public redis.clients.jedis.Response ftSearch(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftSearch(java.lang.String p0, java.lang.String p1, redis.clients.jedis.search.FTSearchParams p2)`
- `public redis.clients.jedis.Response ftSearch(java.lang.String p0, redis.clients.jedis.search.Query p1)`
- `public redis.clients.jedis.Response ftSugAdd(java.lang.String p0, java.lang.String p1, double p2)`
- `public redis.clients.jedis.Response ftSugAddIncr(java.lang.String p0, java.lang.String p1, double p2)`
- `public redis.clients.jedis.Response ftSugDel(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftSugGet(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftSugGet(java.lang.String p0, java.lang.String p1, boolean p2, int p3)`
- `public redis.clients.jedis.Response ftSugGetWithScores(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response ftSugGetWithScores(java.lang.String p0, java.lang.String p1, boolean p2, int p3)`
- `public redis.clients.jedis.Response ftSugLen(java.lang.String p0)`
- `public redis.clients.jedis.Response ftSynDump(java.lang.String p0)`
- `public redis.clients.jedis.Response ftSynUpdate(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response ftTagVals(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response functionDelete(byte[] p0)`
- `public redis.clients.jedis.Response functionDelete(java.lang.String p0)`
- `public redis.clients.jedis.Response functionDump()`
- `public redis.clients.jedis.Response functionFlush()`
- `public redis.clients.jedis.Response functionFlush(redis.clients.jedis.args.FlushMode p0)`
- `public redis.clients.jedis.Response functionKill()`
- `public redis.clients.jedis.Response functionList()`
- `public redis.clients.jedis.Response functionList(byte[] p0)`
- `public redis.clients.jedis.Response functionList(java.lang.String p0)`
- `public redis.clients.jedis.Response functionListBinary()`
- `public redis.clients.jedis.Response functionListWithCode()`
- `public redis.clients.jedis.Response functionListWithCode(byte[] p0)`
- `public redis.clients.jedis.Response functionListWithCode(java.lang.String p0)`
- `public redis.clients.jedis.Response functionListWithCodeBinary()`
- `public redis.clients.jedis.Response functionLoad(byte[] p0)`
- `public redis.clients.jedis.Response functionLoad(java.lang.String p0)`
- `public redis.clients.jedis.Response functionLoadReplace(byte[] p0)`
- `public redis.clients.jedis.Response functionLoadReplace(java.lang.String p0)`
- `public redis.clients.jedis.Response functionRestore(byte[] p0)`
- `public redis.clients.jedis.Response functionRestore(byte[] p0, redis.clients.jedis.args.FunctionRestorePolicy p1)`
- `public redis.clients.jedis.Response functionStats()`
- `public redis.clients.jedis.Response functionStatsBinary()`
- `public redis.clients.jedis.Response geoadd(byte[] p0, double p1, double p2, byte[] p3)`
- `public redis.clients.jedis.Response geoadd(byte[] p0, java.util.Map p1)`
- `public redis.clients.jedis.Response geoadd(byte[] p0, redis.clients.jedis.params.GeoAddParams p1, java.util.Map p2)`
- `public redis.clients.jedis.Response geoadd(java.lang.String p0, double p1, double p2, java.lang.String p3)`
- `public redis.clients.jedis.Response geoadd(java.lang.String p0, java.util.Map p1)`
- `public redis.clients.jedis.Response geoadd(java.lang.String p0, redis.clients.jedis.params.GeoAddParams p1, java.util.Map p2)`
- `public redis.clients.jedis.Response geodist(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response geodist(byte[] p0, byte[] p1, byte[] p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response geodist(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response geodist(java.lang.String p0, java.lang.String p1, java.lang.String p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response geohash(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response geohash(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response geopos(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response geopos(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response georadius(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response georadius(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public redis.clients.jedis.Response georadius(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response georadius(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public redis.clients.jedis.Response georadiusByMember(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response georadiusByMember(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public redis.clients.jedis.Response georadiusByMember(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response georadiusByMember(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public redis.clients.jedis.Response georadiusByMemberReadonly(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response georadiusByMemberReadonly(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public redis.clients.jedis.Response georadiusByMemberReadonly(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response georadiusByMemberReadonly(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public redis.clients.jedis.Response georadiusByMemberStore(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4, redis.clients.jedis.params.GeoRadiusStoreParam p5)`
- `public redis.clients.jedis.Response georadiusByMemberStore(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4, redis.clients.jedis.params.GeoRadiusStoreParam p5)`
- `public redis.clients.jedis.Response georadiusReadonly(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response georadiusReadonly(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public redis.clients.jedis.Response georadiusReadonly(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response georadiusReadonly(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public redis.clients.jedis.Response georadiusStore(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5, redis.clients.jedis.params.GeoRadiusStoreParam p6)`
- `public redis.clients.jedis.Response georadiusStore(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5, redis.clients.jedis.params.GeoRadiusStoreParam p6)`
- `public redis.clients.jedis.Response geosearch(byte[] p0, byte[] p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response geosearch(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response geosearch(byte[] p0, redis.clients.jedis.GeoCoordinate p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response geosearch(byte[] p0, redis.clients.jedis.GeoCoordinate p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response geosearch(byte[] p0, redis.clients.jedis.params.GeoSearchParam p1)`
- `public redis.clients.jedis.Response geosearch(java.lang.String p0, java.lang.String p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response geosearch(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response geosearch(java.lang.String p0, redis.clients.jedis.GeoCoordinate p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response geosearch(java.lang.String p0, redis.clients.jedis.GeoCoordinate p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public redis.clients.jedis.Response geosearch(java.lang.String p0, redis.clients.jedis.params.GeoSearchParam p1)`
- `public redis.clients.jedis.Response geosearchStore(byte[] p0, byte[] p1, byte[] p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public redis.clients.jedis.Response geosearchStore(byte[] p0, byte[] p1, byte[] p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response geosearchStore(byte[] p0, byte[] p1, redis.clients.jedis.GeoCoordinate p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public redis.clients.jedis.Response geosearchStore(byte[] p0, byte[] p1, redis.clients.jedis.GeoCoordinate p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response geosearchStore(byte[] p0, byte[] p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public redis.clients.jedis.Response geosearchStore(java.lang.String p0, java.lang.String p1, java.lang.String p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public redis.clients.jedis.Response geosearchStore(java.lang.String p0, java.lang.String p1, java.lang.String p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response geosearchStore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.GeoCoordinate p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public redis.clients.jedis.Response geosearchStore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.GeoCoordinate p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.Response geosearchStore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public redis.clients.jedis.Response geosearchStoreStoreDist(byte[] p0, byte[] p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public redis.clients.jedis.Response geosearchStoreStoreDist(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public redis.clients.jedis.Response get(byte[] p0)`
- `public redis.clients.jedis.Response get(java.lang.String p0)`
- `public redis.clients.jedis.Response getDel(byte[] p0)`
- `public redis.clients.jedis.Response getDel(java.lang.String p0)`
- `public redis.clients.jedis.Response getEx(byte[] p0, redis.clients.jedis.params.GetExParams p1)`
- `public redis.clients.jedis.Response getEx(java.lang.String p0, redis.clients.jedis.params.GetExParams p1)`
- `public redis.clients.jedis.Response getSet(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response getSet(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response getbit(byte[] p0, long p1)`
- `public redis.clients.jedis.Response getbit(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response getrange(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response getrange(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response graphDelete(java.lang.String p0)`
- `public redis.clients.jedis.Response graphProfile(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response graphQuery(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response graphQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public redis.clients.jedis.Response graphQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2, long p3)`
- `public redis.clients.jedis.Response graphQuery(java.lang.String p0, java.lang.String p1, long p2)`
- `public redis.clients.jedis.Response graphReadonlyQuery(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response graphReadonlyQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public redis.clients.jedis.Response graphReadonlyQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2, long p3)`
- `public redis.clients.jedis.Response graphReadonlyQuery(java.lang.String p0, java.lang.String p1, long p2)`
- `public redis.clients.jedis.Response hdel(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response hdel(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response hexists(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response hexists(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response hget(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response hget(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response hgetAll(byte[] p0)`
- `public redis.clients.jedis.Response hgetAll(java.lang.String p0)`
- `public redis.clients.jedis.Response hincrBy(byte[] p0, byte[] p1, long p2)`
- `public redis.clients.jedis.Response hincrBy(java.lang.String p0, java.lang.String p1, long p2)`
- `public redis.clients.jedis.Response hincrByFloat(byte[] p0, byte[] p1, double p2)`
- `public redis.clients.jedis.Response hincrByFloat(java.lang.String p0, java.lang.String p1, double p2)`
- `public redis.clients.jedis.Response hkeys(byte[] p0)`
- `public redis.clients.jedis.Response hkeys(java.lang.String p0)`
- `public redis.clients.jedis.Response hlen(byte[] p0)`
- `public redis.clients.jedis.Response hlen(java.lang.String p0)`
- `public redis.clients.jedis.Response hmget(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response hmget(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response hmset(byte[] p0, java.util.Map p1)`
- `public redis.clients.jedis.Response hmset(java.lang.String p0, java.util.Map p1)`
- `public redis.clients.jedis.Response hrandfield(byte[] p0)`
- `public redis.clients.jedis.Response hrandfield(byte[] p0, long p1)`
- `public redis.clients.jedis.Response hrandfield(java.lang.String p0)`
- `public redis.clients.jedis.Response hrandfield(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response hrandfieldWithValues(byte[] p0, long p1)`
- `public redis.clients.jedis.Response hrandfieldWithValues(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response hscan(byte[] p0, byte[] p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.Response hscan(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.Response hset(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response hset(byte[] p0, java.util.Map p1)`
- `public redis.clients.jedis.Response hset(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response hset(java.lang.String p0, java.util.Map p1)`
- `public redis.clients.jedis.Response hsetnx(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response hsetnx(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response hstrlen(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response hstrlen(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response hvals(byte[] p0)`
- `public redis.clients.jedis.Response hvals(java.lang.String p0)`
- `public redis.clients.jedis.Response incr(byte[] p0)`
- `public redis.clients.jedis.Response incr(java.lang.String p0)`
- `public redis.clients.jedis.Response incrBy(byte[] p0, long p1)`
- `public redis.clients.jedis.Response incrBy(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response incrByFloat(byte[] p0, double p1)`
- `public redis.clients.jedis.Response incrByFloat(java.lang.String p0, double p1)`
- `public redis.clients.jedis.Response jsonArrAppend(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object... p2)`
- `public redis.clients.jedis.Response jsonArrAppend(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object... p2)`
- `public redis.clients.jedis.Response jsonArrAppendWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object... p2)`
- `public redis.clients.jedis.Response jsonArrIndex(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2)`
- `public redis.clients.jedis.Response jsonArrIndex(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public redis.clients.jedis.Response jsonArrIndexWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public redis.clients.jedis.Response jsonArrInsert(java.lang.String p0, redis.clients.jedis.json.Path p1, int p2, java.lang.Object... p3)`
- `public redis.clients.jedis.Response jsonArrInsert(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2, java.lang.Object... p3)`
- `public redis.clients.jedis.Response jsonArrInsertWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2, java.lang.Object... p3)`
- `public redis.clients.jedis.Response jsonArrLen(java.lang.String p0)`
- `public redis.clients.jedis.Response jsonArrLen(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public redis.clients.jedis.Response jsonArrLen(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public redis.clients.jedis.Response jsonArrPop(java.lang.String p0)`
- `public <T extends java.lang.Object> redis.clients.jedis.Response jsonArrPop(java.lang.String p0, java.lang.Class p1)`
- `public <T extends java.lang.Object> redis.clients.jedis.Response jsonArrPop(java.lang.String p0, java.lang.Class p1, redis.clients.jedis.json.Path p2)`
- `public <T extends java.lang.Object> redis.clients.jedis.Response jsonArrPop(java.lang.String p0, java.lang.Class p1, redis.clients.jedis.json.Path p2, int p3)`
- `public redis.clients.jedis.Response jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public redis.clients.jedis.Response jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path p1, int p2)`
- `public redis.clients.jedis.Response jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public redis.clients.jedis.Response jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2)`
- `public redis.clients.jedis.Response jsonArrTrim(java.lang.String p0, redis.clients.jedis.json.Path p1, int p2, int p3)`
- `public redis.clients.jedis.Response jsonArrTrim(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2, int p3)`
- `public redis.clients.jedis.Response jsonClear(java.lang.String p0)`
- `public redis.clients.jedis.Response jsonClear(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public redis.clients.jedis.Response jsonClear(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public redis.clients.jedis.Response jsonDel(java.lang.String p0)`
- `public redis.clients.jedis.Response jsonDel(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public redis.clients.jedis.Response jsonDel(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public redis.clients.jedis.Response jsonGet(java.lang.String p0)`
- `public <T extends java.lang.Object> redis.clients.jedis.Response jsonGet(java.lang.String p0, java.lang.Class p1)`
- `public <T extends java.lang.Object> redis.clients.jedis.Response jsonGet(java.lang.String p0, java.lang.Class p1, redis.clients.jedis.json.Path... p2)`
- `public redis.clients.jedis.Response jsonGet(java.lang.String p0, redis.clients.jedis.json.Path2... p1)`
- `public redis.clients.jedis.Response jsonGet(java.lang.String p0, redis.clients.jedis.json.Path... p1)`
- `public <T extends java.lang.Object> redis.clients.jedis.Response jsonMGet(redis.clients.jedis.json.Path p0, java.lang.Class p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response jsonMGet(redis.clients.jedis.json.Path2 p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response jsonNumIncrBy(java.lang.String p0, redis.clients.jedis.json.Path p1, double p2)`
- `public redis.clients.jedis.Response jsonNumIncrBy(java.lang.String p0, redis.clients.jedis.json.Path2 p1, double p2)`
- `public redis.clients.jedis.Response jsonSet(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2)`
- `public redis.clients.jedis.Response jsonSet(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2, redis.clients.jedis.json.JsonSetParams p3)`
- `public redis.clients.jedis.Response jsonSet(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public redis.clients.jedis.Response jsonSet(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2, redis.clients.jedis.json.JsonSetParams p3)`
- `public redis.clients.jedis.Response jsonSetWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public redis.clients.jedis.Response jsonSetWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2, redis.clients.jedis.json.JsonSetParams p3)`
- `public redis.clients.jedis.Response jsonStrAppend(java.lang.String p0, java.lang.Object p1)`
- `public redis.clients.jedis.Response jsonStrAppend(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2)`
- `public redis.clients.jedis.Response jsonStrAppend(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public redis.clients.jedis.Response jsonStrLen(java.lang.String p0)`
- `public redis.clients.jedis.Response jsonStrLen(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public redis.clients.jedis.Response jsonStrLen(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public redis.clients.jedis.Response jsonToggle(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public redis.clients.jedis.Response jsonToggle(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public redis.clients.jedis.Response jsonType(java.lang.String p0)`
- `public redis.clients.jedis.Response jsonType(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public redis.clients.jedis.Response jsonType(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public redis.clients.jedis.Response keys(byte[] p0)`
- `public redis.clients.jedis.Response keys(java.lang.String p0)`
- `public redis.clients.jedis.Response lcs(byte[] p0, byte[] p1, redis.clients.jedis.params.LCSParams p2)`
- `public redis.clients.jedis.Response lcs(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.LCSParams p2)`
- `public redis.clients.jedis.Response lindex(byte[] p0, long p1)`
- `public redis.clients.jedis.Response lindex(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response linsert(byte[] p0, redis.clients.jedis.args.ListPosition p1, byte[] p2, byte[] p3)`
- `public redis.clients.jedis.Response linsert(java.lang.String p0, redis.clients.jedis.args.ListPosition p1, java.lang.String p2, java.lang.String p3)`
- `public redis.clients.jedis.Response llen(byte[] p0)`
- `public redis.clients.jedis.Response llen(java.lang.String p0)`
- `public redis.clients.jedis.Response lmove(byte[] p0, byte[] p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3)`
- `public redis.clients.jedis.Response lmove(java.lang.String p0, java.lang.String p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3)`
- `public redis.clients.jedis.Response lmpop(redis.clients.jedis.args.ListDirection p0, byte[]... p1)`
- `public redis.clients.jedis.Response lmpop(redis.clients.jedis.args.ListDirection p0, int p1, byte[]... p2)`
- `public redis.clients.jedis.Response lmpop(redis.clients.jedis.args.ListDirection p0, int p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response lmpop(redis.clients.jedis.args.ListDirection p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response lpop(byte[] p0)`
- `public redis.clients.jedis.Response lpop(byte[] p0, int p1)`
- `public redis.clients.jedis.Response lpop(java.lang.String p0)`
- `public redis.clients.jedis.Response lpop(java.lang.String p0, int p1)`
- `public redis.clients.jedis.Response lpos(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response lpos(byte[] p0, byte[] p1, redis.clients.jedis.params.LPosParams p2)`
- `public redis.clients.jedis.Response lpos(byte[] p0, byte[] p1, redis.clients.jedis.params.LPosParams p2, long p3)`
- `public redis.clients.jedis.Response lpos(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response lpos(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.LPosParams p2)`
- `public redis.clients.jedis.Response lpos(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.LPosParams p2, long p3)`
- `public redis.clients.jedis.Response lpush(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response lpush(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response lpushx(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response lpushx(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response lrange(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response lrange(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response lrem(byte[] p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response lrem(java.lang.String p0, long p1, java.lang.String p2)`
- `public redis.clients.jedis.Response lset(byte[] p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response lset(java.lang.String p0, long p1, java.lang.String p2)`
- `public redis.clients.jedis.Response ltrim(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response ltrim(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response memoryUsage(byte[] p0)`
- `public redis.clients.jedis.Response memoryUsage(byte[] p0, int p1)`
- `public redis.clients.jedis.Response memoryUsage(java.lang.String p0)`
- `public redis.clients.jedis.Response memoryUsage(java.lang.String p0, int p1)`
- `public redis.clients.jedis.Response mget(byte[]... p0)`
- `public redis.clients.jedis.Response mget(java.lang.String... p0)`
- `public redis.clients.jedis.Response migrate(java.lang.String p0, int p1, byte[] p2, int p3)`
- `public redis.clients.jedis.Response migrate(java.lang.String p0, int p1, int p2, redis.clients.jedis.params.MigrateParams p3, byte[]... p4)`
- `public redis.clients.jedis.Response migrate(java.lang.String p0, int p1, int p2, redis.clients.jedis.params.MigrateParams p3, java.lang.String... p4)`
- `public redis.clients.jedis.Response migrate(java.lang.String p0, int p1, java.lang.String p2, int p3)`
- `public redis.clients.jedis.Response mset(byte[]... p0)`
- `public redis.clients.jedis.Response mset(java.lang.String... p0)`
- `public redis.clients.jedis.Response msetnx(byte[]... p0)`
- `public redis.clients.jedis.Response msetnx(java.lang.String... p0)`
- `public final void multi()`
- `public redis.clients.jedis.Response objectEncoding(byte[] p0)`
- `public redis.clients.jedis.Response objectEncoding(java.lang.String p0)`
- `public redis.clients.jedis.Response objectFreq(byte[] p0)`
- `public redis.clients.jedis.Response objectFreq(java.lang.String p0)`
- `public redis.clients.jedis.Response objectIdletime(byte[] p0)`
- `public redis.clients.jedis.Response objectIdletime(java.lang.String p0)`
- `public redis.clients.jedis.Response objectRefcount(byte[] p0)`
- `public redis.clients.jedis.Response objectRefcount(java.lang.String p0)`
- `public redis.clients.jedis.Response persist(byte[] p0)`
- `public redis.clients.jedis.Response persist(java.lang.String p0)`
- `public redis.clients.jedis.Response pexpire(byte[] p0, long p1)`
- `public redis.clients.jedis.Response pexpire(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public redis.clients.jedis.Response pexpire(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response pexpire(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public redis.clients.jedis.Response pexpireAt(byte[] p0, long p1)`
- `public redis.clients.jedis.Response pexpireAt(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public redis.clients.jedis.Response pexpireAt(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response pexpireAt(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public redis.clients.jedis.Response pexpireTime(byte[] p0)`
- `public redis.clients.jedis.Response pexpireTime(java.lang.String p0)`
- `public redis.clients.jedis.Response pfadd(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response pfadd(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response pfcount(byte[] p0)`
- `public redis.clients.jedis.Response pfcount(byte[]... p0)`
- `public redis.clients.jedis.Response pfcount(java.lang.String p0)`
- `public redis.clients.jedis.Response pfcount(java.lang.String... p0)`
- `public redis.clients.jedis.Response pfmerge(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response pfmerge(java.lang.String p0, java.lang.String... p1)`
- `protected abstract void processAppendStatus()`
- `protected abstract void processMultiResponse()`
- `protected abstract void processPipelinedResponses()`
- `public redis.clients.jedis.Response psetex(byte[] p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response psetex(java.lang.String p0, long p1, java.lang.String p2)`
- `public redis.clients.jedis.Response pttl(byte[] p0)`
- `public redis.clients.jedis.Response pttl(java.lang.String p0)`
- `public redis.clients.jedis.Response publish(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response publish(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response randomBinaryKey()`
- `public redis.clients.jedis.Response randomKey()`
- `public redis.clients.jedis.Response rename(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response rename(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response renamenx(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response renamenx(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response restore(byte[] p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response restore(byte[] p0, long p1, byte[] p2, redis.clients.jedis.params.RestoreParams p3)`
- `public redis.clients.jedis.Response restore(java.lang.String p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response restore(java.lang.String p0, long p1, byte[] p2, redis.clients.jedis.params.RestoreParams p3)`
- `public redis.clients.jedis.Response rpop(byte[] p0)`
- `public redis.clients.jedis.Response rpop(byte[] p0, int p1)`
- `public redis.clients.jedis.Response rpop(java.lang.String p0)`
- `public redis.clients.jedis.Response rpop(java.lang.String p0, int p1)`
- `public redis.clients.jedis.Response rpoplpush(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response rpoplpush(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response rpush(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response rpush(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response rpushx(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response rpushx(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response sadd(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response sadd(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response scan(byte[] p0)`
- `public redis.clients.jedis.Response scan(byte[] p0, redis.clients.jedis.params.ScanParams p1)`
- `public redis.clients.jedis.Response scan(byte[] p0, redis.clients.jedis.params.ScanParams p1, byte[] p2)`
- `public redis.clients.jedis.Response scan(java.lang.String p0)`
- `public redis.clients.jedis.Response scan(java.lang.String p0, redis.clients.jedis.params.ScanParams p1)`
- `public redis.clients.jedis.Response scan(java.lang.String p0, redis.clients.jedis.params.ScanParams p1, java.lang.String p2)`
- `public redis.clients.jedis.Response scard(byte[] p0)`
- `public redis.clients.jedis.Response scard(java.lang.String p0)`
- `public redis.clients.jedis.Response scriptExists(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response scriptExists(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response scriptFlush(byte[] p0)`
- `public redis.clients.jedis.Response scriptFlush(byte[] p0, redis.clients.jedis.args.FlushMode p1)`
- `public redis.clients.jedis.Response scriptFlush(java.lang.String p0)`
- `public redis.clients.jedis.Response scriptFlush(java.lang.String p0, redis.clients.jedis.args.FlushMode p1)`
- `public redis.clients.jedis.Response scriptKill(byte[] p0)`
- `public redis.clients.jedis.Response scriptKill(java.lang.String p0)`
- `public redis.clients.jedis.Response scriptLoad(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response scriptLoad(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response sdiff(byte[]... p0)`
- `public redis.clients.jedis.Response sdiff(java.lang.String... p0)`
- `public redis.clients.jedis.Response sdiffstore(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response sdiffstore(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response sendCommand(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.Response sendCommand(redis.clients.jedis.commands.ProtocolCommand p0, byte[]... p1)`
- `public redis.clients.jedis.Response sendCommand(redis.clients.jedis.commands.ProtocolCommand p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response set(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response set(byte[] p0, byte[] p1, redis.clients.jedis.params.SetParams p2)`
- `public redis.clients.jedis.Response set(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response set(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.SetParams p2)`
- `public redis.clients.jedis.Response setGet(byte[] p0, byte[] p1, redis.clients.jedis.params.SetParams p2)`
- `public redis.clients.jedis.Response setGet(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.SetParams p2)`
- `public redis.clients.jedis.Response setbit(byte[] p0, long p1, boolean p2)`
- `public redis.clients.jedis.Response setbit(java.lang.String p0, long p1, boolean p2)`
- `public redis.clients.jedis.Response setex(byte[] p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response setex(java.lang.String p0, long p1, java.lang.String p2)`
- `public redis.clients.jedis.Response setnx(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response setnx(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response setrange(byte[] p0, long p1, byte[] p2)`
- `public redis.clients.jedis.Response setrange(java.lang.String p0, long p1, java.lang.String p2)`
- `public redis.clients.jedis.Response sinter(byte[]... p0)`
- `public redis.clients.jedis.Response sinter(java.lang.String... p0)`
- `public redis.clients.jedis.Response sintercard(byte[]... p0)`
- `public redis.clients.jedis.Response sintercard(int p0, byte[]... p1)`
- `public redis.clients.jedis.Response sintercard(int p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response sintercard(java.lang.String... p0)`
- `public redis.clients.jedis.Response sinterstore(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response sinterstore(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response sismember(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response sismember(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response smembers(byte[] p0)`
- `public redis.clients.jedis.Response smembers(java.lang.String p0)`
- `public redis.clients.jedis.Response smismember(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response smismember(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response smove(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response smove(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response sort(byte[] p0)`
- `public redis.clients.jedis.Response sort(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response sort(byte[] p0, redis.clients.jedis.params.SortingParams p1)`
- `public redis.clients.jedis.Response sort(byte[] p0, redis.clients.jedis.params.SortingParams p1, byte[] p2)`
- `public redis.clients.jedis.Response sort(java.lang.String p0)`
- `public redis.clients.jedis.Response sort(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response sort(java.lang.String p0, redis.clients.jedis.params.SortingParams p1)`
- `public redis.clients.jedis.Response sort(java.lang.String p0, redis.clients.jedis.params.SortingParams p1, java.lang.String p2)`
- `public redis.clients.jedis.Response sortReadonly(byte[] p0, redis.clients.jedis.params.SortingParams p1)`
- `public redis.clients.jedis.Response sortReadonly(java.lang.String p0, redis.clients.jedis.params.SortingParams p1)`
- `public redis.clients.jedis.Response spop(byte[] p0)`
- `public redis.clients.jedis.Response spop(byte[] p0, long p1)`
- `public redis.clients.jedis.Response spop(java.lang.String p0)`
- `public redis.clients.jedis.Response spop(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response srandmember(byte[] p0)`
- `public redis.clients.jedis.Response srandmember(byte[] p0, int p1)`
- `public redis.clients.jedis.Response srandmember(java.lang.String p0)`
- `public redis.clients.jedis.Response srandmember(java.lang.String p0, int p1)`
- `public redis.clients.jedis.Response srem(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response srem(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response sscan(byte[] p0, byte[] p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.Response sscan(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.Response strAlgoLCSKeys(byte[] p0, byte[] p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public redis.clients.jedis.Response strAlgoLCSKeys(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public redis.clients.jedis.Response strAlgoLCSStrings(byte[] p0, byte[] p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public redis.clients.jedis.Response strAlgoLCSStrings(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public redis.clients.jedis.Response strlen(byte[] p0)`
- `public redis.clients.jedis.Response strlen(java.lang.String p0)`
- `public redis.clients.jedis.Response substr(byte[] p0, int p1, int p2)`
- `public redis.clients.jedis.Response substr(java.lang.String p0, int p1, int p2)`
- `public redis.clients.jedis.Response sunion(byte[]... p0)`
- `public redis.clients.jedis.Response sunion(java.lang.String... p0)`
- `public redis.clients.jedis.Response sunionstore(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response sunionstore(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response tdigestAdd(java.lang.String p0, double... p1)`
- `public redis.clients.jedis.Response tdigestByRank(java.lang.String p0, long... p1)`
- `public redis.clients.jedis.Response tdigestByRevRank(java.lang.String p0, long... p1)`
- `public redis.clients.jedis.Response tdigestCDF(java.lang.String p0, double... p1)`
- `public redis.clients.jedis.Response tdigestCreate(java.lang.String p0)`
- `public redis.clients.jedis.Response tdigestCreate(java.lang.String p0, int p1)`
- `public redis.clients.jedis.Response tdigestInfo(java.lang.String p0)`
- `public redis.clients.jedis.Response tdigestMax(java.lang.String p0)`
- `public redis.clients.jedis.Response tdigestMerge(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response tdigestMerge(redis.clients.jedis.bloom.TDigestMergeParams p0, java.lang.String p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response tdigestMin(java.lang.String p0)`
- `public redis.clients.jedis.Response tdigestQuantile(java.lang.String p0, double... p1)`
- `public redis.clients.jedis.Response tdigestRank(java.lang.String p0, double... p1)`
- `public redis.clients.jedis.Response tdigestReset(java.lang.String p0)`
- `public redis.clients.jedis.Response tdigestRevRank(java.lang.String p0, double... p1)`
- `public redis.clients.jedis.Response tdigestTrimmedMean(java.lang.String p0, double p1, double p2)`
- `public redis.clients.jedis.Response topkAdd(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response topkCount(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response topkIncrBy(java.lang.String p0, java.util.Map p1)`
- `public redis.clients.jedis.Response topkInfo(java.lang.String p0)`
- `public redis.clients.jedis.Response topkList(java.lang.String p0)`
- `public redis.clients.jedis.Response topkQuery(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response topkReserve(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response topkReserve(java.lang.String p0, long p1, long p2, long p3, double p4)`
- `public redis.clients.jedis.Response touch(byte[] p0)`
- `public redis.clients.jedis.Response touch(byte[]... p0)`
- `public redis.clients.jedis.Response touch(java.lang.String p0)`
- `public redis.clients.jedis.Response touch(java.lang.String... p0)`
- `public redis.clients.jedis.Response tsAdd(java.lang.String p0, double p1)`
- `public redis.clients.jedis.Response tsAdd(java.lang.String p0, long p1, double p2)`
- `public redis.clients.jedis.Response tsAdd(java.lang.String p0, long p1, double p2, redis.clients.jedis.timeseries.TSCreateParams p3)`
- `public redis.clients.jedis.Response tsAlter(java.lang.String p0, redis.clients.jedis.timeseries.TSAlterParams p1)`
- `public redis.clients.jedis.Response tsCreate(java.lang.String p0)`
- `public redis.clients.jedis.Response tsCreate(java.lang.String p0, redis.clients.jedis.timeseries.TSCreateParams p1)`
- `public redis.clients.jedis.Response tsCreateRule(java.lang.String p0, java.lang.String p1, redis.clients.jedis.timeseries.AggregationType p2, long p3)`
- `public redis.clients.jedis.Response tsCreateRule(java.lang.String p0, java.lang.String p1, redis.clients.jedis.timeseries.AggregationType p2, long p3, long p4)`
- `public redis.clients.jedis.Response tsDecrBy(java.lang.String p0, double p1)`
- `public redis.clients.jedis.Response tsDecrBy(java.lang.String p0, double p1, long p2)`
- `public redis.clients.jedis.Response tsDel(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response tsDeleteRule(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response tsGet(java.lang.String p0)`
- `public redis.clients.jedis.Response tsGet(java.lang.String p0, redis.clients.jedis.timeseries.TSGetParams p1)`
- `public redis.clients.jedis.Response tsIncrBy(java.lang.String p0, double p1)`
- `public redis.clients.jedis.Response tsIncrBy(java.lang.String p0, double p1, long p2)`
- `public redis.clients.jedis.Response tsMAdd(java.util.Map$Entry... p0)`
- `public redis.clients.jedis.Response tsMGet(redis.clients.jedis.timeseries.TSMGetParams p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response tsMRange(long p0, long p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response tsMRange(redis.clients.jedis.timeseries.TSMRangeParams p0)`
- `public redis.clients.jedis.Response tsMRevRange(long p0, long p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response tsMRevRange(redis.clients.jedis.timeseries.TSMRangeParams p0)`
- `public redis.clients.jedis.Response tsQueryIndex(java.lang.String... p0)`
- `public redis.clients.jedis.Response tsRange(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response tsRange(java.lang.String p0, redis.clients.jedis.timeseries.TSRangeParams p1)`
- `public redis.clients.jedis.Response tsRevRange(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response tsRevRange(java.lang.String p0, redis.clients.jedis.timeseries.TSRangeParams p1)`
- `public redis.clients.jedis.Response ttl(byte[] p0)`
- `public redis.clients.jedis.Response ttl(java.lang.String p0)`
- `public redis.clients.jedis.Response type(byte[] p0)`
- `public redis.clients.jedis.Response type(java.lang.String p0)`
- `public redis.clients.jedis.Response unlink(byte[] p0)`
- `public redis.clients.jedis.Response unlink(byte[]... p0)`
- `public redis.clients.jedis.Response unlink(java.lang.String p0)`
- `public redis.clients.jedis.Response unlink(java.lang.String... p0)`
- `public java.lang.String unwatch()`
- `public redis.clients.jedis.Response waitReplicas(byte[] p0, int p1, long p2)`
- `public redis.clients.jedis.Response waitReplicas(int p0, long p1)`
- `public redis.clients.jedis.Response waitReplicas(java.lang.String p0, int p1, long p2)`
- `public java.lang.String watch(byte[]... p0)`
- `public java.lang.String watch(java.lang.String... p0)`
- `public redis.clients.jedis.Response xack(byte[] p0, byte[] p1, byte[]... p2)`
- `public redis.clients.jedis.Response xack(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID... p2)`
- `public redis.clients.jedis.Response xadd(byte[] p0, redis.clients.jedis.params.XAddParams p1, java.util.Map p2)`
- `public redis.clients.jedis.Response xadd(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, java.util.Map p2)`
- `public redis.clients.jedis.Response xadd(java.lang.String p0, redis.clients.jedis.params.XAddParams p1, java.util.Map p2)`
- `public redis.clients.jedis.Response xautoclaim(byte[] p0, byte[] p1, byte[] p2, long p3, byte[] p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public redis.clients.jedis.Response xautoclaim(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.StreamEntryID p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public redis.clients.jedis.Response xautoclaimJustId(byte[] p0, byte[] p1, byte[] p2, long p3, byte[] p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public redis.clients.jedis.Response xautoclaimJustId(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.StreamEntryID p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public redis.clients.jedis.Response xclaim(byte[] p0, byte[] p1, byte[] p2, long p3, redis.clients.jedis.params.XClaimParams p4, byte[]... p5)`
- `public redis.clients.jedis.Response xclaim(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.params.XClaimParams p4, redis.clients.jedis.StreamEntryID... p5)`
- `public redis.clients.jedis.Response xclaimJustId(byte[] p0, byte[] p1, byte[] p2, long p3, redis.clients.jedis.params.XClaimParams p4, byte[]... p5)`
- `public redis.clients.jedis.Response xclaimJustId(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.params.XClaimParams p4, redis.clients.jedis.StreamEntryID... p5)`
- `public redis.clients.jedis.Response xdel(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response xdel(java.lang.String p0, redis.clients.jedis.StreamEntryID... p1)`
- `public redis.clients.jedis.Response xgroupCreate(byte[] p0, byte[] p1, byte[] p2, boolean p3)`
- `public redis.clients.jedis.Response xgroupCreate(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID p2, boolean p3)`
- `public redis.clients.jedis.Response xgroupCreateConsumer(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response xgroupCreateConsumer(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response xgroupDelConsumer(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response xgroupDelConsumer(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response xgroupDestroy(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response xgroupDestroy(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response xgroupSetID(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response xgroupSetID(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID p2)`
- `public redis.clients.jedis.Response xinfoConsumers(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response xinfoConsumers(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response xinfoGroup(byte[] p0)`
- `public redis.clients.jedis.Response xinfoGroup(java.lang.String p0)`
- `public redis.clients.jedis.Response xinfoGroups(byte[] p0)`
- `public redis.clients.jedis.Response xinfoGroups(java.lang.String p0)`
- `public redis.clients.jedis.Response xinfoStream(byte[] p0)`
- `public redis.clients.jedis.Response xinfoStream(java.lang.String p0)`
- `public redis.clients.jedis.Response xinfoStreamFull(byte[] p0)`
- `public redis.clients.jedis.Response xinfoStreamFull(byte[] p0, int p1)`
- `public redis.clients.jedis.Response xinfoStreamFull(java.lang.String p0)`
- `public redis.clients.jedis.Response xinfoStreamFull(java.lang.String p0, int p1)`
- `public redis.clients.jedis.Response xlen(byte[] p0)`
- `public redis.clients.jedis.Response xlen(java.lang.String p0)`
- `public redis.clients.jedis.Response xpending(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response xpending(byte[] p0, byte[] p1, byte[] p2, byte[] p3, int p4, byte[] p5)`
- `public redis.clients.jedis.Response xpending(byte[] p0, byte[] p1, redis.clients.jedis.params.XPendingParams p2)`
- `public redis.clients.jedis.Response xpending(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response xpending(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID p2, redis.clients.jedis.StreamEntryID p3, int p4, java.lang.String p5)`
- `public redis.clients.jedis.Response xpending(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.XPendingParams p2)`
- `public redis.clients.jedis.Response xrange(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response xrange(byte[] p0, byte[] p1, byte[] p2, int p3)`
- `public redis.clients.jedis.Response xrange(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response xrange(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3)`
- `public redis.clients.jedis.Response xrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2)`
- `public redis.clients.jedis.Response xrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2, int p3)`
- `public redis.clients.jedis.Response xread(redis.clients.jedis.params.XReadParams p0, java.util.Map$Entry... p1)`
- `public redis.clients.jedis.Response xread(redis.clients.jedis.params.XReadParams p0, java.util.Map p1)`
- `public redis.clients.jedis.Response xreadGroup(byte[] p0, byte[] p1, redis.clients.jedis.params.XReadGroupParams p2, java.util.Map$Entry... p3)`
- `public redis.clients.jedis.Response xreadGroup(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.XReadGroupParams p2, java.util.Map p3)`
- `public redis.clients.jedis.Response xrevrange(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response xrevrange(byte[] p0, byte[] p1, byte[] p2, int p3)`
- `public redis.clients.jedis.Response xrevrange(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response xrevrange(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3)`
- `public redis.clients.jedis.Response xrevrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2)`
- `public redis.clients.jedis.Response xrevrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2, int p3)`
- `public redis.clients.jedis.Response xtrim(byte[] p0, long p1, boolean p2)`
- `public redis.clients.jedis.Response xtrim(byte[] p0, redis.clients.jedis.params.XTrimParams p1)`
- `public redis.clients.jedis.Response xtrim(java.lang.String p0, long p1, boolean p2)`
- `public redis.clients.jedis.Response xtrim(java.lang.String p0, redis.clients.jedis.params.XTrimParams p1)`
- `public redis.clients.jedis.Response zadd(byte[] p0, double p1, byte[] p2)`
- `public redis.clients.jedis.Response zadd(byte[] p0, double p1, byte[] p2, redis.clients.jedis.params.ZAddParams p3)`
- `public redis.clients.jedis.Response zadd(byte[] p0, java.util.Map p1)`
- `public redis.clients.jedis.Response zadd(byte[] p0, java.util.Map p1, redis.clients.jedis.params.ZAddParams p2)`
- `public redis.clients.jedis.Response zadd(java.lang.String p0, double p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zadd(java.lang.String p0, double p1, java.lang.String p2, redis.clients.jedis.params.ZAddParams p3)`
- `public redis.clients.jedis.Response zadd(java.lang.String p0, java.util.Map p1)`
- `public redis.clients.jedis.Response zadd(java.lang.String p0, java.util.Map p1, redis.clients.jedis.params.ZAddParams p2)`
- `public redis.clients.jedis.Response zaddIncr(byte[] p0, double p1, byte[] p2, redis.clients.jedis.params.ZAddParams p3)`
- `public redis.clients.jedis.Response zaddIncr(java.lang.String p0, double p1, java.lang.String p2, redis.clients.jedis.params.ZAddParams p3)`
- `public redis.clients.jedis.Response zcard(byte[] p0)`
- `public redis.clients.jedis.Response zcard(java.lang.String p0)`
- `public redis.clients.jedis.Response zcount(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zcount(byte[] p0, double p1, double p2)`
- `public redis.clients.jedis.Response zcount(java.lang.String p0, double p1, double p2)`
- `public redis.clients.jedis.Response zcount(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zdiff(byte[]... p0)`
- `public redis.clients.jedis.Response zdiff(java.lang.String... p0)`
- `public redis.clients.jedis.Response zdiffStore(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response zdiffStore(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zdiffWithScores(byte[]... p0)`
- `public redis.clients.jedis.Response zdiffWithScores(java.lang.String... p0)`
- `public redis.clients.jedis.Response zincrby(byte[] p0, double p1, byte[] p2)`
- `public redis.clients.jedis.Response zincrby(byte[] p0, double p1, byte[] p2, redis.clients.jedis.params.ZIncrByParams p3)`
- `public redis.clients.jedis.Response zincrby(java.lang.String p0, double p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zincrby(java.lang.String p0, double p1, java.lang.String p2, redis.clients.jedis.params.ZIncrByParams p3)`
- `public redis.clients.jedis.Response zinter(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public redis.clients.jedis.Response zinter(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zinterWithScores(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public redis.clients.jedis.Response zinterWithScores(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zintercard(byte[]... p0)`
- `public redis.clients.jedis.Response zintercard(java.lang.String... p0)`
- `public redis.clients.jedis.Response zintercard(long p0, byte[]... p1)`
- `public redis.clients.jedis.Response zintercard(long p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zinterstore(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response zinterstore(byte[] p0, redis.clients.jedis.params.ZParams p1, byte[]... p2)`
- `public redis.clients.jedis.Response zinterstore(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zinterstore(java.lang.String p0, redis.clients.jedis.params.ZParams p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response zlexcount(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zlexcount(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zmpop(redis.clients.jedis.args.SortedSetOption p0, byte[]... p1)`
- `public redis.clients.jedis.Response zmpop(redis.clients.jedis.args.SortedSetOption p0, int p1, byte[]... p2)`
- `public redis.clients.jedis.Response zmpop(redis.clients.jedis.args.SortedSetOption p0, int p1, java.lang.String... p2)`
- `public redis.clients.jedis.Response zmpop(redis.clients.jedis.args.SortedSetOption p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zmscore(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response zmscore(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zpopmax(byte[] p0)`
- `public redis.clients.jedis.Response zpopmax(byte[] p0, int p1)`
- `public redis.clients.jedis.Response zpopmax(java.lang.String p0)`
- `public redis.clients.jedis.Response zpopmax(java.lang.String p0, int p1)`
- `public redis.clients.jedis.Response zpopmin(byte[] p0)`
- `public redis.clients.jedis.Response zpopmin(byte[] p0, int p1)`
- `public redis.clients.jedis.Response zpopmin(java.lang.String p0)`
- `public redis.clients.jedis.Response zpopmin(java.lang.String p0, int p1)`
- `public redis.clients.jedis.Response zrandmember(byte[] p0)`
- `public redis.clients.jedis.Response zrandmember(byte[] p0, long p1)`
- `public redis.clients.jedis.Response zrandmember(java.lang.String p0)`
- `public redis.clients.jedis.Response zrandmember(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response zrandmemberWithScores(byte[] p0, long p1)`
- `public redis.clients.jedis.Response zrandmemberWithScores(java.lang.String p0, long p1)`
- `public redis.clients.jedis.Response zrange(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response zrange(byte[] p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public redis.clients.jedis.Response zrange(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response zrange(java.lang.String p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public redis.clients.jedis.Response zrangeByLex(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zrangeByLex(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByScore(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zrangeByScore(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByScore(byte[] p0, double p1, double p2)`
- `public redis.clients.jedis.Response zrangeByScore(byte[] p0, double p1, double p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByScore(java.lang.String p0, double p1, double p2)`
- `public redis.clients.jedis.Response zrangeByScore(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByScoreWithScores(byte[] p0, double p1, double p2)`
- `public redis.clients.jedis.Response zrangeByScoreWithScores(byte[] p0, double p1, double p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByScoreWithScores(java.lang.String p0, double p1, double p2)`
- `public redis.clients.jedis.Response zrangeByScoreWithScores(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrangeWithScores(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response zrangeWithScores(byte[] p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public redis.clients.jedis.Response zrangeWithScores(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response zrangeWithScores(java.lang.String p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public redis.clients.jedis.Response zrangestore(byte[] p0, byte[] p1, redis.clients.jedis.params.ZRangeParams p2)`
- `public redis.clients.jedis.Response zrangestore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ZRangeParams p2)`
- `public redis.clients.jedis.Response zrank(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response zrank(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response zrem(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response zrem(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zremrangeByLex(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zremrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zremrangeByRank(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response zremrangeByRank(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response zremrangeByScore(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zremrangeByScore(byte[] p0, double p1, double p2)`
- `public redis.clients.jedis.Response zremrangeByScore(java.lang.String p0, double p1, double p2)`
- `public redis.clients.jedis.Response zremrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zrevrange(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response zrevrange(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response zrevrangeByLex(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zrevrangeByLex(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zrevrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByScore(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zrevrangeByScore(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByScore(byte[] p0, double p1, double p2)`
- `public redis.clients.jedis.Response zrevrangeByScore(byte[] p0, double p1, double p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByScore(java.lang.String p0, double p1, double p2)`
- `public redis.clients.jedis.Response zrevrangeByScore(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zrevrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2)`
- `public redis.clients.jedis.Response zrevrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByScoreWithScores(byte[] p0, double p1, double p2)`
- `public redis.clients.jedis.Response zrevrangeByScoreWithScores(byte[] p0, double p1, double p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByScoreWithScores(java.lang.String p0, double p1, double p2)`
- `public redis.clients.jedis.Response zrevrangeByScoreWithScores(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.Response zrevrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public redis.clients.jedis.Response zrevrangeWithScores(byte[] p0, long p1, long p2)`
- `public redis.clients.jedis.Response zrevrangeWithScores(java.lang.String p0, long p1, long p2)`
- `public redis.clients.jedis.Response zrevrank(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response zrevrank(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response zscan(byte[] p0, byte[] p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.Response zscan(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.Response zscore(byte[] p0, byte[] p1)`
- `public redis.clients.jedis.Response zscore(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.Response zunion(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public redis.clients.jedis.Response zunion(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zunionWithScores(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public redis.clients.jedis.Response zunionWithScores(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zunionstore(byte[] p0, byte[]... p1)`
- `public redis.clients.jedis.Response zunionstore(byte[] p0, redis.clients.jedis.params.ZParams p1, byte[]... p2)`
- `public redis.clients.jedis.Response zunionstore(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.Response zunionstore(java.lang.String p0, redis.clients.jedis.params.ZParams p1, java.lang.String... p2)`

---

## public class `redis.clients.jedis.UnifiedJedis`
implements `java.lang.AutoCloseable`, `redis.clients.jedis.commands.JedisBinaryCommands`, `redis.clients.jedis.commands.JedisCommands`, `redis.clients.jedis.commands.RedisModuleCommands`, `redis.clients.jedis.commands.SampleBinaryKeyedCommands`, `redis.clients.jedis.commands.SampleKeyedCommands`  

**Constructors:**
- `public UnifiedJedis()`
- `public UnifiedJedis(java.lang.String p0)`
- `public UnifiedJedis(java.net.URI p0)`
- `public UnifiedJedis(java.net.URI p0, redis.clients.jedis.JedisClientConfig p1)`
- `public UnifiedJedis(java.util.Set p0, redis.clients.jedis.JedisClientConfig p1, int p2)`
- `public UnifiedJedis(java.util.Set p0, redis.clients.jedis.JedisClientConfig p1, int p2, java.time.Duration p3)`
- `public UnifiedJedis(java.util.Set p0, redis.clients.jedis.JedisClientConfig p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2, int p3, java.time.Duration p4)`
- `public UnifiedJedis(redis.clients.jedis.Connection p0)`
- `public UnifiedJedis(redis.clients.jedis.HostAndPort p0)`
- `public UnifiedJedis(redis.clients.jedis.HostAndPort p0, redis.clients.jedis.JedisClientConfig p1)`
- `public UnifiedJedis(redis.clients.jedis.JedisSocketFactory p0)`
- `public UnifiedJedis(redis.clients.jedis.executors.CommandExecutor p0)`
- `public UnifiedJedis(redis.clients.jedis.providers.ClusterConnectionProvider p0, int p1, java.time.Duration p2)`
- `public UnifiedJedis(redis.clients.jedis.providers.ConnectionProvider p0)`
- `public UnifiedJedis(redis.clients.jedis.providers.ConnectionProvider p0, int p1, java.time.Duration p2)`
- `public UnifiedJedis(redis.clients.jedis.providers.ShardedConnectionProvider p0)`
- `public UnifiedJedis(redis.clients.jedis.providers.ShardedConnectionProvider p0, java.util.regex.Pattern p1)`

**Fields:**
- `protected final redis.clients.jedis.executors.CommandExecutor executor`
- `protected final redis.clients.jedis.providers.ConnectionProvider provider`

**Methods:**
- `public long append(byte[] p0, byte[] p1)`
- `public long append(java.lang.String p0, java.lang.String p1)`
- `public boolean bfAdd(java.lang.String p0, java.lang.String p1)`
- `public boolean bfExists(java.lang.String p0, java.lang.String p1)`
- `public java.util.Map bfInfo(java.lang.String p0)`
- `public java.util.List bfInsert(java.lang.String p0, java.lang.String... p1)`
- `public java.util.List bfInsert(java.lang.String p0, redis.clients.jedis.bloom.BFInsertParams p1, java.lang.String... p2)`
- `public java.lang.String bfLoadChunk(java.lang.String p0, long p1, byte[] p2)`
- `public java.util.List bfMAdd(java.lang.String p0, java.lang.String... p1)`
- `public java.util.List bfMExists(java.lang.String p0, java.lang.String... p1)`
- `public java.lang.String bfReserve(java.lang.String p0, double p1, long p2)`
- `public java.lang.String bfReserve(java.lang.String p0, double p1, long p2, redis.clients.jedis.bloom.BFReserveParams p3)`
- `public java.util.Map$Entry bfScanDump(java.lang.String p0, long p1)`
- `public long bitcount(byte[] p0)`
- `public long bitcount(byte[] p0, long p1, long p2)`
- `public long bitcount(byte[] p0, long p1, long p2, redis.clients.jedis.args.BitCountOption p3)`
- `public long bitcount(java.lang.String p0)`
- `public long bitcount(java.lang.String p0, long p1, long p2)`
- `public long bitcount(java.lang.String p0, long p1, long p2, redis.clients.jedis.args.BitCountOption p3)`
- `public java.util.List bitfield(byte[] p0, byte[]... p1)`
- `public java.util.List bitfield(java.lang.String p0, java.lang.String... p1)`
- `public java.util.List bitfieldReadonly(byte[] p0, byte[]... p1)`
- `public java.util.List bitfieldReadonly(java.lang.String p0, java.lang.String... p1)`
- `public long bitop(redis.clients.jedis.args.BitOP p0, byte[] p1, byte[]... p2)`
- `public long bitop(redis.clients.jedis.args.BitOP p0, java.lang.String p1, java.lang.String... p2)`
- `public long bitpos(byte[] p0, boolean p1)`
- `public long bitpos(byte[] p0, boolean p1, redis.clients.jedis.params.BitPosParams p2)`
- `public long bitpos(java.lang.String p0, boolean p1)`
- `public long bitpos(java.lang.String p0, boolean p1, redis.clients.jedis.params.BitPosParams p2)`
- `public byte[] blmove(byte[] p0, byte[] p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3, double p4)`
- `public java.lang.String blmove(java.lang.String p0, java.lang.String p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3, double p4)`
- `public redis.clients.jedis.util.KeyValue blmpop(long p0, redis.clients.jedis.args.ListDirection p1, byte[]... p2)`
- `public redis.clients.jedis.util.KeyValue blmpop(long p0, redis.clients.jedis.args.ListDirection p1, int p2, byte[]... p3)`
- `public redis.clients.jedis.util.KeyValue blmpop(long p0, redis.clients.jedis.args.ListDirection p1, int p2, java.lang.String... p3)`
- `public redis.clients.jedis.util.KeyValue blmpop(long p0, redis.clients.jedis.args.ListDirection p1, java.lang.String... p2)`
- `public java.util.List blpop(double p0, byte[]... p1)`
- `public redis.clients.jedis.resps.KeyedListElement blpop(double p0, java.lang.String p1)`
- `public redis.clients.jedis.resps.KeyedListElement blpop(double p0, java.lang.String... p1)`
- `public java.util.List blpop(int p0, byte[]... p1)`
- `public java.util.List blpop(int p0, java.lang.String p1)`
- `public java.util.List blpop(int p0, java.lang.String... p1)`
- `public java.util.List brpop(double p0, byte[]... p1)`
- `public redis.clients.jedis.resps.KeyedListElement brpop(double p0, java.lang.String p1)`
- `public redis.clients.jedis.resps.KeyedListElement brpop(double p0, java.lang.String... p1)`
- `public java.util.List brpop(int p0, byte[]... p1)`
- `public java.util.List brpop(int p0, java.lang.String p1)`
- `public java.util.List brpop(int p0, java.lang.String... p1)`
- `public byte[] brpoplpush(byte[] p0, byte[] p1, int p2)`
- `public java.lang.String brpoplpush(java.lang.String p0, java.lang.String p1, int p2)`
- `public redis.clients.jedis.util.KeyValue bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, byte[]... p2)`
- `public redis.clients.jedis.util.KeyValue bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, int p2, byte[]... p3)`
- `public redis.clients.jedis.util.KeyValue bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, int p2, java.lang.String... p3)`
- `public redis.clients.jedis.util.KeyValue bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, java.lang.String... p2)`
- `public java.util.List bzpopmax(double p0, byte[]... p1)`
- `public redis.clients.jedis.resps.KeyedZSetElement bzpopmax(double p0, java.lang.String... p1)`
- `public java.util.List bzpopmin(double p0, byte[]... p1)`
- `public redis.clients.jedis.resps.KeyedZSetElement bzpopmin(double p0, java.lang.String... p1)`
- `public boolean cfAdd(java.lang.String p0, java.lang.String p1)`
- `public boolean cfAddNx(java.lang.String p0, java.lang.String p1)`
- `public long cfCount(java.lang.String p0, java.lang.String p1)`
- `public boolean cfDel(java.lang.String p0, java.lang.String p1)`
- `public boolean cfExists(java.lang.String p0, java.lang.String p1)`
- `public java.util.Map cfInfo(java.lang.String p0)`
- `public java.util.List cfInsert(java.lang.String p0, java.lang.String... p1)`
- `public java.util.List cfInsert(java.lang.String p0, redis.clients.jedis.bloom.CFInsertParams p1, java.lang.String... p2)`
- `public java.util.List cfInsertNx(java.lang.String p0, java.lang.String... p1)`
- `public java.util.List cfInsertNx(java.lang.String p0, redis.clients.jedis.bloom.CFInsertParams p1, java.lang.String... p2)`
- `public java.lang.String cfLoadChunk(java.lang.String p0, long p1, byte[] p2)`
- `public java.util.List cfMExists(java.lang.String p0, java.lang.String... p1)`
- `public java.lang.String cfReserve(java.lang.String p0, long p1)`
- `public java.lang.String cfReserve(java.lang.String p0, long p1, redis.clients.jedis.bloom.CFReserveParams p2)`
- `public java.util.Map$Entry cfScanDump(java.lang.String p0, long p1)`
- `public void close()`
- `public java.util.List cmsIncrBy(java.lang.String p0, java.util.Map p1)`
- `public java.util.Map cmsInfo(java.lang.String p0)`
- `public java.lang.String cmsInitByDim(java.lang.String p0, long p1, long p2)`
- `public java.lang.String cmsInitByProb(java.lang.String p0, double p1, double p2)`
- `public java.lang.String cmsMerge(java.lang.String p0, java.lang.String... p1)`
- `public java.lang.String cmsMerge(java.lang.String p0, java.util.Map p1)`
- `public java.util.List cmsQuery(java.lang.String p0, java.lang.String... p1)`
- `public boolean copy(byte[] p0, byte[] p1, boolean p2)`
- `public boolean copy(java.lang.String p0, java.lang.String p1, boolean p2)`
- `public long dbSize()`
- `public long decr(byte[] p0)`
- `public long decr(java.lang.String p0)`
- `public long decrBy(byte[] p0, long p1)`
- `public long decrBy(java.lang.String p0, long p1)`
- `public long del(byte[] p0)`
- `public long del(byte[]... p0)`
- `public long del(java.lang.String p0)`
- `public long del(java.lang.String... p0)`
- `public byte[] dump(byte[] p0)`
- `public byte[] dump(java.lang.String p0)`
- `public java.lang.Object eval(byte[] p0)`
- `public java.lang.Object eval(byte[] p0, byte[] p1)`
- `public java.lang.Object eval(byte[] p0, int p1, byte[]... p2)`
- `public java.lang.Object eval(byte[] p0, java.util.List p1, java.util.List p2)`
- `public java.lang.Object eval(java.lang.String p0)`
- `public java.lang.Object eval(java.lang.String p0, int p1, java.lang.String... p2)`
- `public java.lang.Object eval(java.lang.String p0, java.lang.String p1)`
- `public java.lang.Object eval(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public java.lang.Object evalReadonly(byte[] p0, java.util.List p1, java.util.List p2)`
- `public java.lang.Object evalReadonly(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public java.lang.Object evalsha(byte[] p0)`
- `public java.lang.Object evalsha(byte[] p0, byte[] p1)`
- `public java.lang.Object evalsha(byte[] p0, int p1, byte[]... p2)`
- `public java.lang.Object evalsha(byte[] p0, java.util.List p1, java.util.List p2)`
- `public java.lang.Object evalsha(java.lang.String p0)`
- `public java.lang.Object evalsha(java.lang.String p0, int p1, java.lang.String... p2)`
- `public java.lang.Object evalsha(java.lang.String p0, java.lang.String p1)`
- `public java.lang.Object evalsha(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public java.lang.Object evalshaReadonly(byte[] p0, java.util.List p1, java.util.List p2)`
- `public java.lang.Object evalshaReadonly(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public java.lang.Object executeCommand(redis.clients.jedis.CommandArguments p0)`
- `public final <T extends java.lang.Object> T executeCommand(redis.clients.jedis.CommandObject p0)`
- `public boolean exists(byte[] p0)`
- `public long exists(byte[]... p0)`
- `public boolean exists(java.lang.String p0)`
- `public long exists(java.lang.String... p0)`
- `public long expire(byte[] p0, long p1)`
- `public long expire(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public long expire(java.lang.String p0, long p1)`
- `public long expire(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public long expireAt(byte[] p0, long p1)`
- `public long expireAt(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public long expireAt(java.lang.String p0, long p1)`
- `public long expireAt(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public long expireTime(byte[] p0)`
- `public long expireTime(java.lang.String p0)`
- `public java.lang.Object fcall(byte[] p0, java.util.List p1, java.util.List p2)`
- `public java.lang.Object fcall(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public java.lang.Object fcallReadonly(byte[] p0, java.util.List p1, java.util.List p2)`
- `public java.lang.Object fcallReadonly(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public redis.clients.jedis.search.aggr.AggregationResult ftAggregate(java.lang.String p0, redis.clients.jedis.search.aggr.AggregationBuilder p1)`
- `public java.lang.String ftAliasAdd(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String ftAliasDel(java.lang.String p0)`
- `public java.lang.String ftAliasUpdate(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String ftAlter(java.lang.String p0, java.lang.Iterable p1)`
- `public java.lang.String ftAlter(java.lang.String p0, redis.clients.jedis.search.Schema p1)`
- `public java.util.Map ftConfigGet(java.lang.String p0)`
- `public java.util.Map ftConfigGet(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String ftConfigSet(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String ftConfigSet(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.lang.String ftCreate(java.lang.String p0, redis.clients.jedis.search.FTCreateParams p1, java.lang.Iterable p2)`
- `public java.lang.String ftCreate(java.lang.String p0, redis.clients.jedis.search.IndexOptions p1, redis.clients.jedis.search.Schema p2)`
- `public java.lang.String ftCursorDel(java.lang.String p0, long p1)`
- `public redis.clients.jedis.search.aggr.AggregationResult ftCursorRead(java.lang.String p0, long p1, int p2)`
- `public long ftDictAdd(java.lang.String p0, java.lang.String... p1)`
- `public long ftDictAddBySampleKey(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public long ftDictDel(java.lang.String p0, java.lang.String... p1)`
- `public long ftDictDelBySampleKey(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public java.util.Set ftDictDump(java.lang.String p0)`
- `public java.util.Set ftDictDumpBySampleKey(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String ftDropIndex(java.lang.String p0)`
- `public java.lang.String ftDropIndexDD(java.lang.String p0)`
- `public java.lang.String ftExplain(java.lang.String p0, redis.clients.jedis.search.Query p1)`
- `public java.util.List ftExplainCLI(java.lang.String p0, redis.clients.jedis.search.Query p1)`
- `public java.util.Map ftInfo(java.lang.String p0)`
- `public redis.clients.jedis.search.SearchResult ftSearch(byte[] p0, redis.clients.jedis.search.Query p1)`
- `public redis.clients.jedis.search.SearchResult ftSearch(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.search.SearchResult ftSearch(java.lang.String p0, java.lang.String p1, redis.clients.jedis.search.FTSearchParams p2)`
- `public redis.clients.jedis.search.SearchResult ftSearch(java.lang.String p0, redis.clients.jedis.search.Query p1)`
- `public long ftSugAdd(java.lang.String p0, java.lang.String p1, double p2)`
- `public long ftSugAddIncr(java.lang.String p0, java.lang.String p1, double p2)`
- `public boolean ftSugDel(java.lang.String p0, java.lang.String p1)`
- `public java.util.List ftSugGet(java.lang.String p0, java.lang.String p1)`
- `public java.util.List ftSugGet(java.lang.String p0, java.lang.String p1, boolean p2, int p3)`
- `public java.util.List ftSugGetWithScores(java.lang.String p0, java.lang.String p1)`
- `public java.util.List ftSugGetWithScores(java.lang.String p0, java.lang.String p1, boolean p2, int p3)`
- `public long ftSugLen(java.lang.String p0)`
- `public java.util.Map ftSynDump(java.lang.String p0)`
- `public java.lang.String ftSynUpdate(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public java.util.Set ftTagVals(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String functionDelete(byte[] p0)`
- `public java.lang.String functionDelete(java.lang.String p0)`
- `public byte[] functionDump()`
- `public java.lang.String functionFlush()`
- `public java.lang.String functionFlush(redis.clients.jedis.args.FlushMode p0)`
- `public java.lang.String functionKill()`
- `public java.util.List functionList()`
- `public java.util.List functionList(byte[] p0)`
- `public java.util.List functionList(java.lang.String p0)`
- `public java.util.List functionListBinary()`
- `public java.util.List functionListWithCode()`
- `public java.util.List functionListWithCode(byte[] p0)`
- `public java.util.List functionListWithCode(java.lang.String p0)`
- `public java.util.List functionListWithCodeBinary()`
- `public java.lang.String functionLoad(byte[] p0)`
- `public java.lang.String functionLoad(java.lang.String p0)`
- `public java.lang.String functionLoadReplace(byte[] p0)`
- `public java.lang.String functionLoadReplace(java.lang.String p0)`
- `public java.lang.String functionRestore(byte[] p0)`
- `public java.lang.String functionRestore(byte[] p0, redis.clients.jedis.args.FunctionRestorePolicy p1)`
- `public redis.clients.jedis.resps.FunctionStats functionStats()`
- `public java.lang.Object functionStatsBinary()`
- `public long geoadd(byte[] p0, double p1, double p2, byte[] p3)`
- `public long geoadd(byte[] p0, java.util.Map p1)`
- `public long geoadd(byte[] p0, redis.clients.jedis.params.GeoAddParams p1, java.util.Map p2)`
- `public long geoadd(java.lang.String p0, double p1, double p2, java.lang.String p3)`
- `public long geoadd(java.lang.String p0, java.util.Map p1)`
- `public long geoadd(java.lang.String p0, redis.clients.jedis.params.GeoAddParams p1, java.util.Map p2)`
- `public java.lang.Double geodist(byte[] p0, byte[] p1, byte[] p2)`
- `public java.lang.Double geodist(byte[] p0, byte[] p1, byte[] p2, redis.clients.jedis.args.GeoUnit p3)`
- `public java.lang.Double geodist(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.lang.Double geodist(java.lang.String p0, java.lang.String p1, java.lang.String p2, redis.clients.jedis.args.GeoUnit p3)`
- `public java.util.List geohash(byte[] p0, byte[]... p1)`
- `public java.util.List geohash(java.lang.String p0, java.lang.String... p1)`
- `public java.util.List geopos(byte[] p0, byte[]... p1)`
- `public java.util.List geopos(java.lang.String p0, java.lang.String... p1)`
- `public java.util.List georadius(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public java.util.List georadius(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public java.util.List georadius(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public java.util.List georadius(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public java.util.List georadiusByMember(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public java.util.List georadiusByMember(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public java.util.List georadiusByMember(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public java.util.List georadiusByMember(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public java.util.List georadiusByMemberReadonly(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public java.util.List georadiusByMemberReadonly(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public java.util.List georadiusByMemberReadonly(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public java.util.List georadiusByMemberReadonly(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public long georadiusByMemberStore(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4, redis.clients.jedis.params.GeoRadiusStoreParam p5)`
- `public long georadiusByMemberStore(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4, redis.clients.jedis.params.GeoRadiusStoreParam p5)`
- `public java.util.List georadiusReadonly(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public java.util.List georadiusReadonly(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public java.util.List georadiusReadonly(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public java.util.List georadiusReadonly(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public long georadiusStore(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5, redis.clients.jedis.params.GeoRadiusStoreParam p6)`
- `public long georadiusStore(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5, redis.clients.jedis.params.GeoRadiusStoreParam p6)`
- `public java.util.List geosearch(byte[] p0, byte[] p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public java.util.List geosearch(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public java.util.List geosearch(byte[] p0, redis.clients.jedis.GeoCoordinate p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public java.util.List geosearch(byte[] p0, redis.clients.jedis.GeoCoordinate p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public java.util.List geosearch(byte[] p0, redis.clients.jedis.params.GeoSearchParam p1)`
- `public java.util.List geosearch(java.lang.String p0, java.lang.String p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public java.util.List geosearch(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public java.util.List geosearch(java.lang.String p0, redis.clients.jedis.GeoCoordinate p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public java.util.List geosearch(java.lang.String p0, redis.clients.jedis.GeoCoordinate p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public java.util.List geosearch(java.lang.String p0, redis.clients.jedis.params.GeoSearchParam p1)`
- `public long geosearchStore(byte[] p0, byte[] p1, byte[] p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public long geosearchStore(byte[] p0, byte[] p1, byte[] p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public long geosearchStore(byte[] p0, byte[] p1, redis.clients.jedis.GeoCoordinate p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public long geosearchStore(byte[] p0, byte[] p1, redis.clients.jedis.GeoCoordinate p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public long geosearchStore(byte[] p0, byte[] p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public long geosearchStore(java.lang.String p0, java.lang.String p1, java.lang.String p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public long geosearchStore(java.lang.String p0, java.lang.String p1, java.lang.String p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public long geosearchStore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.GeoCoordinate p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public long geosearchStore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.GeoCoordinate p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public long geosearchStore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public long geosearchStoreStoreDist(byte[] p0, byte[] p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public long geosearchStoreStoreDist(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public byte[] get(byte[] p0)`
- `public java.lang.String get(java.lang.String p0)`
- `public byte[] getDel(byte[] p0)`
- `public java.lang.String getDel(java.lang.String p0)`
- `public byte[] getEx(byte[] p0, redis.clients.jedis.params.GetExParams p1)`
- `public java.lang.String getEx(java.lang.String p0, redis.clients.jedis.params.GetExParams p1)`
- `public byte[] getSet(byte[] p0, byte[] p1)`
- `public java.lang.String getSet(java.lang.String p0, java.lang.String p1)`
- `public boolean getbit(byte[] p0, long p1)`
- `public boolean getbit(java.lang.String p0, long p1)`
- `public byte[] getrange(byte[] p0, long p1, long p2)`
- `public java.lang.String getrange(java.lang.String p0, long p1, long p2)`
- `public java.util.Map graphConfigGet(java.lang.String p0)`
- `public java.lang.String graphConfigSet(java.lang.String p0, java.lang.Object p1)`
- `public java.lang.String graphDelete(java.lang.String p0)`
- `public java.util.List graphExplain(java.lang.String p0, java.lang.String p1)`
- `public java.util.List graphList()`
- `public java.util.List graphProfile(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.graph.ResultSet graphQuery(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.graph.ResultSet graphQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public redis.clients.jedis.graph.ResultSet graphQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2, long p3)`
- `public redis.clients.jedis.graph.ResultSet graphQuery(java.lang.String p0, java.lang.String p1, long p2)`
- `public redis.clients.jedis.graph.ResultSet graphReadonlyQuery(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.graph.ResultSet graphReadonlyQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public redis.clients.jedis.graph.ResultSet graphReadonlyQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2, long p3)`
- `public redis.clients.jedis.graph.ResultSet graphReadonlyQuery(java.lang.String p0, java.lang.String p1, long p2)`
- `public java.util.List graphSlowlog(java.lang.String p0)`
- `public long hdel(byte[] p0, byte[]... p1)`
- `public long hdel(java.lang.String p0, java.lang.String... p1)`
- `public boolean hexists(byte[] p0, byte[] p1)`
- `public boolean hexists(java.lang.String p0, java.lang.String p1)`
- `public byte[] hget(byte[] p0, byte[] p1)`
- `public java.lang.String hget(java.lang.String p0, java.lang.String p1)`
- `public java.util.Map hgetAll(byte[] p0)`
- `public java.util.Map hgetAll(java.lang.String p0)`
- `public long hincrBy(byte[] p0, byte[] p1, long p2)`
- `public long hincrBy(java.lang.String p0, java.lang.String p1, long p2)`
- `public double hincrByFloat(byte[] p0, byte[] p1, double p2)`
- `public double hincrByFloat(java.lang.String p0, java.lang.String p1, double p2)`
- `public java.util.Set hkeys(byte[] p0)`
- `public java.util.Set hkeys(java.lang.String p0)`
- `public long hlen(byte[] p0)`
- `public long hlen(java.lang.String p0)`
- `public java.util.List hmget(byte[] p0, byte[]... p1)`
- `public java.util.List hmget(java.lang.String p0, java.lang.String... p1)`
- `public java.lang.String hmset(byte[] p0, java.util.Map p1)`
- `public java.lang.String hmset(java.lang.String p0, java.util.Map p1)`
- `public byte[] hrandfield(byte[] p0)`
- `public java.util.List hrandfield(byte[] p0, long p1)`
- `public java.lang.String hrandfield(java.lang.String p0)`
- `public java.util.List hrandfield(java.lang.String p0, long p1)`
- `public java.util.Map hrandfieldWithValues(byte[] p0, long p1)`
- `public java.util.Map hrandfieldWithValues(java.lang.String p0, long p1)`
- `public redis.clients.jedis.resps.ScanResult hscan(byte[] p0, byte[] p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.resps.ScanResult hscan(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ScanParams p2)`
- `public long hset(byte[] p0, byte[] p1, byte[] p2)`
- `public long hset(byte[] p0, java.util.Map p1)`
- `public long hset(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public long hset(java.lang.String p0, java.util.Map p1)`
- `public long hsetnx(byte[] p0, byte[] p1, byte[] p2)`
- `public long hsetnx(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public long hstrlen(byte[] p0, byte[] p1)`
- `public long hstrlen(java.lang.String p0, java.lang.String p1)`
- `public java.util.List hvals(byte[] p0)`
- `public java.util.List hvals(java.lang.String p0)`
- `public long incr(byte[] p0)`
- `public long incr(java.lang.String p0)`
- `public long incrBy(byte[] p0, long p1)`
- `public long incrBy(java.lang.String p0, long p1)`
- `public double incrByFloat(byte[] p0, double p1)`
- `public double incrByFloat(java.lang.String p0, double p1)`
- `public java.lang.Long jsonArrAppend(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object... p2)`
- `public java.util.List jsonArrAppend(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object... p2)`
- `public java.util.List jsonArrAppendWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object... p2)`
- `public long jsonArrIndex(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2)`
- `public java.util.List jsonArrIndex(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public java.util.List jsonArrIndexWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public long jsonArrInsert(java.lang.String p0, redis.clients.jedis.json.Path p1, int p2, java.lang.Object... p3)`
- `public java.util.List jsonArrInsert(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2, java.lang.Object... p3)`
- `public java.util.List jsonArrInsertWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2, java.lang.Object... p3)`
- `public java.lang.Long jsonArrLen(java.lang.String p0)`
- `public java.lang.Long jsonArrLen(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public java.util.List jsonArrLen(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public java.lang.Object jsonArrPop(java.lang.String p0)`
- `public <T extends java.lang.Object> T jsonArrPop(java.lang.String p0, java.lang.Class p1)`
- `public <T extends java.lang.Object> T jsonArrPop(java.lang.String p0, java.lang.Class p1, redis.clients.jedis.json.Path p2)`
- `public <T extends java.lang.Object> T jsonArrPop(java.lang.String p0, java.lang.Class p1, redis.clients.jedis.json.Path p2, int p3)`
- `public java.lang.Object jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public java.lang.Object jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path p1, int p2)`
- `public java.util.List jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public java.util.List jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2)`
- `public java.lang.Long jsonArrTrim(java.lang.String p0, redis.clients.jedis.json.Path p1, int p2, int p3)`
- `public java.util.List jsonArrTrim(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2, int p3)`
- `public long jsonClear(java.lang.String p0)`
- `public long jsonClear(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public long jsonClear(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public long jsonDebugMemory(java.lang.String p0)`
- `public long jsonDebugMemory(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public java.util.List jsonDebugMemory(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public long jsonDel(java.lang.String p0)`
- `public long jsonDel(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public long jsonDel(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public java.lang.Object jsonGet(java.lang.String p0)`
- `public <T extends java.lang.Object> T jsonGet(java.lang.String p0, java.lang.Class p1)`
- `public <T extends java.lang.Object> T jsonGet(java.lang.String p0, java.lang.Class p1, redis.clients.jedis.json.Path... p2)`
- `public java.lang.Object jsonGet(java.lang.String p0, redis.clients.jedis.json.Path2... p1)`
- `public java.lang.Object jsonGet(java.lang.String p0, redis.clients.jedis.json.Path... p1)`
- `public java.lang.String jsonGetAsPlainString(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public <T extends java.lang.Object> java.util.List jsonMGet(redis.clients.jedis.json.Path p0, java.lang.Class p1, java.lang.String... p2)`
- `public java.util.List jsonMGet(redis.clients.jedis.json.Path2 p0, java.lang.String... p1)`
- `public double jsonNumIncrBy(java.lang.String p0, redis.clients.jedis.json.Path p1, double p2)`
- `public org.json.JSONArray jsonNumIncrBy(java.lang.String p0, redis.clients.jedis.json.Path2 p1, double p2)`
- `public java.util.List jsonObjKeys(java.lang.String p0)`
- `public java.util.List jsonObjKeys(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public java.util.List jsonObjKeys(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public java.lang.Long jsonObjLen(java.lang.String p0)`
- `public java.lang.Long jsonObjLen(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public java.util.List jsonObjLen(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public java.util.List jsonResp(java.lang.String p0)`
- `public java.util.List jsonResp(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public java.util.List jsonResp(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public java.lang.String jsonSet(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2)`
- `public java.lang.String jsonSet(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2, redis.clients.jedis.json.JsonSetParams p3)`
- `public java.lang.String jsonSet(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public java.lang.String jsonSet(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2, redis.clients.jedis.json.JsonSetParams p3)`
- `public java.lang.String jsonSetWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public java.lang.String jsonSetWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2, redis.clients.jedis.json.JsonSetParams p3)`
- `public java.lang.String jsonSetWithPlainString(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.String p2)`
- `public long jsonStrAppend(java.lang.String p0, java.lang.Object p1)`
- `public long jsonStrAppend(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2)`
- `public java.util.List jsonStrAppend(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public java.lang.Long jsonStrLen(java.lang.String p0)`
- `public java.lang.Long jsonStrLen(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public java.util.List jsonStrLen(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public java.lang.String jsonToggle(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public java.util.List jsonToggle(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public java.lang.Class jsonType(java.lang.String p0)`
- `public java.lang.Class jsonType(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public java.util.List jsonType(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public java.util.Set keys(byte[] p0)`
- `public java.util.Set keys(java.lang.String p0)`
- `public redis.clients.jedis.resps.LCSMatchResult lcs(byte[] p0, byte[] p1, redis.clients.jedis.params.LCSParams p2)`
- `public redis.clients.jedis.resps.LCSMatchResult lcs(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.LCSParams p2)`
- `public byte[] lindex(byte[] p0, long p1)`
- `public java.lang.String lindex(java.lang.String p0, long p1)`
- `public long linsert(byte[] p0, redis.clients.jedis.args.ListPosition p1, byte[] p2, byte[] p3)`
- `public long linsert(java.lang.String p0, redis.clients.jedis.args.ListPosition p1, java.lang.String p2, java.lang.String p3)`
- `public long llen(byte[] p0)`
- `public long llen(java.lang.String p0)`
- `public byte[] lmove(byte[] p0, byte[] p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3)`
- `public java.lang.String lmove(java.lang.String p0, java.lang.String p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3)`
- `public redis.clients.jedis.util.KeyValue lmpop(redis.clients.jedis.args.ListDirection p0, byte[]... p1)`
- `public redis.clients.jedis.util.KeyValue lmpop(redis.clients.jedis.args.ListDirection p0, int p1, byte[]... p2)`
- `public redis.clients.jedis.util.KeyValue lmpop(redis.clients.jedis.args.ListDirection p0, int p1, java.lang.String... p2)`
- `public redis.clients.jedis.util.KeyValue lmpop(redis.clients.jedis.args.ListDirection p0, java.lang.String... p1)`
- `public byte[] lpop(byte[] p0)`
- `public java.util.List lpop(byte[] p0, int p1)`
- `public java.lang.String lpop(java.lang.String p0)`
- `public java.util.List lpop(java.lang.String p0, int p1)`
- `public java.lang.Long lpos(byte[] p0, byte[] p1)`
- `public java.lang.Long lpos(byte[] p0, byte[] p1, redis.clients.jedis.params.LPosParams p2)`
- `public java.util.List lpos(byte[] p0, byte[] p1, redis.clients.jedis.params.LPosParams p2, long p3)`
- `public java.lang.Long lpos(java.lang.String p0, java.lang.String p1)`
- `public java.lang.Long lpos(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.LPosParams p2)`
- `public java.util.List lpos(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.LPosParams p2, long p3)`
- `public long lpush(byte[] p0, byte[]... p1)`
- `public long lpush(java.lang.String p0, java.lang.String... p1)`
- `public long lpushx(byte[] p0, byte[]... p1)`
- `public long lpushx(java.lang.String p0, java.lang.String... p1)`
- `public java.util.List lrange(byte[] p0, long p1, long p2)`
- `public java.util.List lrange(java.lang.String p0, long p1, long p2)`
- `public long lrem(byte[] p0, long p1, byte[] p2)`
- `public long lrem(java.lang.String p0, long p1, java.lang.String p2)`
- `public java.lang.String lset(byte[] p0, long p1, byte[] p2)`
- `public java.lang.String lset(java.lang.String p0, long p1, java.lang.String p2)`
- `public java.lang.String ltrim(byte[] p0, long p1, long p2)`
- `public java.lang.String ltrim(java.lang.String p0, long p1, long p2)`
- `public java.lang.Long memoryUsage(byte[] p0)`
- `public java.lang.Long memoryUsage(byte[] p0, int p1)`
- `public java.lang.Long memoryUsage(java.lang.String p0)`
- `public java.lang.Long memoryUsage(java.lang.String p0, int p1)`
- `public java.util.List mget(byte[]... p0)`
- `public java.util.List mget(java.lang.String... p0)`
- `public java.lang.String migrate(java.lang.String p0, int p1, byte[] p2, int p3)`
- `public java.lang.String migrate(java.lang.String p0, int p1, int p2, redis.clients.jedis.params.MigrateParams p3, byte[]... p4)`
- `public java.lang.String migrate(java.lang.String p0, int p1, int p2, redis.clients.jedis.params.MigrateParams p3, java.lang.String... p4)`
- `public java.lang.String migrate(java.lang.String p0, int p1, java.lang.String p2, int p3)`
- `public java.lang.String mset(byte[]... p0)`
- `public java.lang.String mset(java.lang.String... p0)`
- `public long msetnx(byte[]... p0)`
- `public long msetnx(java.lang.String... p0)`
- `public byte[] objectEncoding(byte[] p0)`
- `public java.lang.String objectEncoding(java.lang.String p0)`
- `public java.lang.Long objectFreq(byte[] p0)`
- `public java.lang.Long objectFreq(java.lang.String p0)`
- `public java.lang.Long objectIdletime(byte[] p0)`
- `public java.lang.Long objectIdletime(java.lang.String p0)`
- `public java.lang.Long objectRefcount(byte[] p0)`
- `public java.lang.Long objectRefcount(java.lang.String p0)`
- `public long persist(byte[] p0)`
- `public long persist(java.lang.String p0)`
- `public long pexpire(byte[] p0, long p1)`
- `public long pexpire(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public long pexpire(java.lang.String p0, long p1)`
- `public long pexpire(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public long pexpireAt(byte[] p0, long p1)`
- `public long pexpireAt(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public long pexpireAt(java.lang.String p0, long p1)`
- `public long pexpireAt(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public long pexpireTime(byte[] p0)`
- `public long pexpireTime(java.lang.String p0)`
- `public long pfadd(byte[] p0, byte[]... p1)`
- `public long pfadd(java.lang.String p0, java.lang.String... p1)`
- `public long pfcount(byte[] p0)`
- `public long pfcount(byte[]... p0)`
- `public long pfcount(java.lang.String p0)`
- `public long pfcount(java.lang.String... p0)`
- `public java.lang.String pfmerge(byte[] p0, byte[]... p1)`
- `public java.lang.String pfmerge(java.lang.String p0, java.lang.String... p1)`
- `public java.lang.String psetex(byte[] p0, long p1, byte[] p2)`
- `public java.lang.String psetex(java.lang.String p0, long p1, java.lang.String p2)`
- `public void psubscribe(redis.clients.jedis.BinaryJedisPubSub p0, byte[]... p1)`
- `public void psubscribe(redis.clients.jedis.JedisPubSub p0, java.lang.String... p1)`
- `public long pttl(byte[] p0)`
- `public long pttl(java.lang.String p0)`
- `public long publish(byte[] p0, byte[] p1)`
- `public long publish(java.lang.String p0, java.lang.String p1)`
- `public byte[] randomBinaryKey()`
- `public java.lang.String randomKey()`
- `public java.lang.String rename(byte[] p0, byte[] p1)`
- `public java.lang.String rename(java.lang.String p0, java.lang.String p1)`
- `public long renamenx(byte[] p0, byte[] p1)`
- `public long renamenx(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String restore(byte[] p0, long p1, byte[] p2)`
- `public java.lang.String restore(byte[] p0, long p1, byte[] p2, redis.clients.jedis.params.RestoreParams p3)`
- `public java.lang.String restore(java.lang.String p0, long p1, byte[] p2)`
- `public java.lang.String restore(java.lang.String p0, long p1, byte[] p2, redis.clients.jedis.params.RestoreParams p3)`
- `public byte[] rpop(byte[] p0)`
- `public java.util.List rpop(byte[] p0, int p1)`
- `public java.lang.String rpop(java.lang.String p0)`
- `public java.util.List rpop(java.lang.String p0, int p1)`
- `public byte[] rpoplpush(byte[] p0, byte[] p1)`
- `public java.lang.String rpoplpush(java.lang.String p0, java.lang.String p1)`
- `public long rpush(byte[] p0, byte[]... p1)`
- `public long rpush(java.lang.String p0, java.lang.String... p1)`
- `public long rpushx(byte[] p0, byte[]... p1)`
- `public long rpushx(java.lang.String p0, java.lang.String... p1)`
- `public long sadd(byte[] p0, byte[]... p1)`
- `public long sadd(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.resps.ScanResult scan(byte[] p0)`
- `public redis.clients.jedis.resps.ScanResult scan(byte[] p0, redis.clients.jedis.params.ScanParams p1)`
- `public redis.clients.jedis.resps.ScanResult scan(byte[] p0, redis.clients.jedis.params.ScanParams p1, byte[] p2)`
- `public redis.clients.jedis.resps.ScanResult scan(java.lang.String p0)`
- `public redis.clients.jedis.resps.ScanResult scan(java.lang.String p0, redis.clients.jedis.params.ScanParams p1)`
- `public redis.clients.jedis.resps.ScanResult scan(java.lang.String p0, redis.clients.jedis.params.ScanParams p1, java.lang.String p2)`
- `public long scard(byte[] p0)`
- `public long scard(java.lang.String p0)`
- `public java.lang.Boolean scriptExists(byte[] p0, byte[] p1)`
- `public java.util.List scriptExists(byte[] p0, byte[]... p1)`
- `public java.lang.Boolean scriptExists(java.lang.String p0, java.lang.String p1)`
- `public java.util.List scriptExists(java.lang.String p0, java.lang.String... p1)`
- `public java.lang.String scriptFlush(byte[] p0)`
- `public java.lang.String scriptFlush(byte[] p0, redis.clients.jedis.args.FlushMode p1)`
- `public java.lang.String scriptFlush(java.lang.String p0)`
- `public java.lang.String scriptFlush(java.lang.String p0, redis.clients.jedis.args.FlushMode p1)`
- `public java.lang.String scriptKill(byte[] p0)`
- `public java.lang.String scriptKill(java.lang.String p0)`
- `public byte[] scriptLoad(byte[] p0, byte[] p1)`
- `public java.lang.String scriptLoad(java.lang.String p0, java.lang.String p1)`
- `public java.util.Set sdiff(byte[]... p0)`
- `public java.util.Set sdiff(java.lang.String... p0)`
- `public long sdiffstore(byte[] p0, byte[]... p1)`
- `public long sdiffstore(java.lang.String p0, java.lang.String... p1)`
- `public java.lang.Object sendBlockingCommand(byte[] p0, redis.clients.jedis.commands.ProtocolCommand p1, byte[]... p2)`
- `public java.lang.Object sendBlockingCommand(java.lang.String p0, redis.clients.jedis.commands.ProtocolCommand p1, java.lang.String... p2)`
- `public java.lang.Object sendBlockingCommand(redis.clients.jedis.commands.ProtocolCommand p0, byte[]... p1)`
- `public java.lang.Object sendBlockingCommand(redis.clients.jedis.commands.ProtocolCommand p0, java.lang.String... p1)`
- `public java.lang.Object sendCommand(byte[] p0, redis.clients.jedis.commands.ProtocolCommand p1, byte[]... p2)`
- `public java.lang.Object sendCommand(java.lang.String p0, redis.clients.jedis.commands.ProtocolCommand p1, java.lang.String... p2)`
- `public java.lang.Object sendCommand(redis.clients.jedis.commands.ProtocolCommand p0)`
- `public java.lang.Object sendCommand(redis.clients.jedis.commands.ProtocolCommand p0, byte[]... p1)`
- `public java.lang.Object sendCommand(redis.clients.jedis.commands.ProtocolCommand p0, java.lang.String... p1)`
- `public java.lang.String set(byte[] p0, byte[] p1)`
- `public java.lang.String set(byte[] p0, byte[] p1, redis.clients.jedis.params.SetParams p2)`
- `public java.lang.String set(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String set(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.SetParams p2)`
- `public byte[] setGet(byte[] p0, byte[] p1, redis.clients.jedis.params.SetParams p2)`
- `public java.lang.String setGet(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.SetParams p2)`
- `public boolean setbit(byte[] p0, long p1, boolean p2)`
- `public boolean setbit(java.lang.String p0, long p1, boolean p2)`
- `public java.lang.String setex(byte[] p0, long p1, byte[] p2)`
- `public java.lang.String setex(java.lang.String p0, long p1, java.lang.String p2)`
- `public long setnx(byte[] p0, byte[] p1)`
- `public long setnx(java.lang.String p0, java.lang.String p1)`
- `public long setrange(byte[] p0, long p1, byte[] p2)`
- `public long setrange(java.lang.String p0, long p1, java.lang.String p2)`
- `public java.util.Set sinter(byte[]... p0)`
- `public java.util.Set sinter(java.lang.String... p0)`
- `public long sintercard(byte[]... p0)`
- `public long sintercard(int p0, byte[]... p1)`
- `public long sintercard(int p0, java.lang.String... p1)`
- `public long sintercard(java.lang.String... p0)`
- `public long sinterstore(byte[] p0, byte[]... p1)`
- `public long sinterstore(java.lang.String p0, java.lang.String... p1)`
- `public boolean sismember(byte[] p0, byte[] p1)`
- `public boolean sismember(java.lang.String p0, java.lang.String p1)`
- `public java.util.Set smembers(byte[] p0)`
- `public java.util.Set smembers(java.lang.String p0)`
- `public java.util.List smismember(byte[] p0, byte[]... p1)`
- `public java.util.List smismember(java.lang.String p0, java.lang.String... p1)`
- `public long smove(byte[] p0, byte[] p1, byte[] p2)`
- `public long smove(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.util.List sort(byte[] p0)`
- `public long sort(byte[] p0, byte[] p1)`
- `public java.util.List sort(byte[] p0, redis.clients.jedis.params.SortingParams p1)`
- `public long sort(byte[] p0, redis.clients.jedis.params.SortingParams p1, byte[] p2)`
- `public java.util.List sort(java.lang.String p0)`
- `public long sort(java.lang.String p0, java.lang.String p1)`
- `public java.util.List sort(java.lang.String p0, redis.clients.jedis.params.SortingParams p1)`
- `public long sort(java.lang.String p0, redis.clients.jedis.params.SortingParams p1, java.lang.String p2)`
- `public java.util.List sortReadonly(byte[] p0, redis.clients.jedis.params.SortingParams p1)`
- `public java.util.List sortReadonly(java.lang.String p0, redis.clients.jedis.params.SortingParams p1)`
- `public byte[] spop(byte[] p0)`
- `public java.util.Set spop(byte[] p0, long p1)`
- `public java.lang.String spop(java.lang.String p0)`
- `public java.util.Set spop(java.lang.String p0, long p1)`
- `public byte[] srandmember(byte[] p0)`
- `public java.util.List srandmember(byte[] p0, int p1)`
- `public java.lang.String srandmember(java.lang.String p0)`
- `public java.util.List srandmember(java.lang.String p0, int p1)`
- `public long srem(byte[] p0, byte[]... p1)`
- `public long srem(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.resps.ScanResult sscan(byte[] p0, byte[] p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.resps.ScanResult sscan(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.resps.LCSMatchResult strAlgoLCSKeys(byte[] p0, byte[] p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public redis.clients.jedis.resps.LCSMatchResult strAlgoLCSKeys(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public redis.clients.jedis.resps.LCSMatchResult strAlgoLCSStrings(byte[] p0, byte[] p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public redis.clients.jedis.resps.LCSMatchResult strAlgoLCSStrings(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public long strlen(byte[] p0)`
- `public long strlen(java.lang.String p0)`
- `public void subscribe(redis.clients.jedis.BinaryJedisPubSub p0, byte[]... p1)`
- `public void subscribe(redis.clients.jedis.JedisPubSub p0, java.lang.String... p1)`
- `public byte[] substr(byte[] p0, int p1, int p2)`
- `public java.lang.String substr(java.lang.String p0, int p1, int p2)`
- `public java.util.Set sunion(byte[]... p0)`
- `public java.util.Set sunion(java.lang.String... p0)`
- `public long sunionstore(byte[] p0, byte[]... p1)`
- `public long sunionstore(java.lang.String p0, java.lang.String... p1)`
- `public java.lang.String tdigestAdd(java.lang.String p0, double... p1)`
- `public java.util.List tdigestByRank(java.lang.String p0, long... p1)`
- `public java.util.List tdigestByRevRank(java.lang.String p0, long... p1)`
- `public java.util.List tdigestCDF(java.lang.String p0, double... p1)`
- `public java.lang.String tdigestCreate(java.lang.String p0)`
- `public java.lang.String tdigestCreate(java.lang.String p0, int p1)`
- `public java.util.Map tdigestInfo(java.lang.String p0)`
- `public double tdigestMax(java.lang.String p0)`
- `public java.lang.String tdigestMerge(java.lang.String p0, java.lang.String... p1)`
- `public java.lang.String tdigestMerge(redis.clients.jedis.bloom.TDigestMergeParams p0, java.lang.String p1, java.lang.String... p2)`
- `public double tdigestMin(java.lang.String p0)`
- `public java.util.List tdigestQuantile(java.lang.String p0, double... p1)`
- `public java.util.List tdigestRank(java.lang.String p0, double... p1)`
- `public java.lang.String tdigestReset(java.lang.String p0)`
- `public java.util.List tdigestRevRank(java.lang.String p0, double... p1)`
- `public double tdigestTrimmedMean(java.lang.String p0, double p1, double p2)`
- `public java.util.List topkAdd(java.lang.String p0, java.lang.String... p1)`
- `public java.util.List topkCount(java.lang.String p0, java.lang.String... p1)`
- `public java.util.List topkIncrBy(java.lang.String p0, java.util.Map p1)`
- `public java.util.Map topkInfo(java.lang.String p0)`
- `public java.util.List topkList(java.lang.String p0)`
- `public java.util.List topkQuery(java.lang.String p0, java.lang.String... p1)`
- `public java.lang.String topkReserve(java.lang.String p0, long p1)`
- `public java.lang.String topkReserve(java.lang.String p0, long p1, long p2, long p3, double p4)`
- `public long touch(byte[] p0)`
- `public long touch(byte[]... p0)`
- `public long touch(java.lang.String p0)`
- `public long touch(java.lang.String... p0)`
- `public long tsAdd(java.lang.String p0, double p1)`
- `public long tsAdd(java.lang.String p0, long p1, double p2)`
- `public long tsAdd(java.lang.String p0, long p1, double p2, redis.clients.jedis.timeseries.TSCreateParams p3)`
- `public java.lang.String tsAlter(java.lang.String p0, redis.clients.jedis.timeseries.TSAlterParams p1)`
- `public java.lang.String tsCreate(java.lang.String p0)`
- `public java.lang.String tsCreate(java.lang.String p0, redis.clients.jedis.timeseries.TSCreateParams p1)`
- `public java.lang.String tsCreateRule(java.lang.String p0, java.lang.String p1, redis.clients.jedis.timeseries.AggregationType p2, long p3)`
- `public java.lang.String tsCreateRule(java.lang.String p0, java.lang.String p1, redis.clients.jedis.timeseries.AggregationType p2, long p3, long p4)`
- `public long tsDecrBy(java.lang.String p0, double p1)`
- `public long tsDecrBy(java.lang.String p0, double p1, long p2)`
- `public long tsDel(java.lang.String p0, long p1, long p2)`
- `public java.lang.String tsDeleteRule(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.timeseries.TSElement tsGet(java.lang.String p0)`
- `public redis.clients.jedis.timeseries.TSElement tsGet(java.lang.String p0, redis.clients.jedis.timeseries.TSGetParams p1)`
- `public long tsIncrBy(java.lang.String p0, double p1)`
- `public long tsIncrBy(java.lang.String p0, double p1, long p2)`
- `public redis.clients.jedis.timeseries.TSInfo tsInfo(java.lang.String p0)`
- `public redis.clients.jedis.timeseries.TSInfo tsInfoDebug(java.lang.String p0)`
- `public java.util.List tsMAdd(java.util.Map$Entry... p0)`
- `public java.util.List tsMGet(redis.clients.jedis.timeseries.TSMGetParams p0, java.lang.String... p1)`
- `public java.util.List tsMRange(long p0, long p1, java.lang.String... p2)`
- `public java.util.List tsMRange(redis.clients.jedis.timeseries.TSMRangeParams p0)`
- `public java.util.List tsMRevRange(long p0, long p1, java.lang.String... p2)`
- `public java.util.List tsMRevRange(redis.clients.jedis.timeseries.TSMRangeParams p0)`
- `public java.util.List tsQueryIndex(java.lang.String... p0)`
- `public java.util.List tsRange(java.lang.String p0, long p1, long p2)`
- `public java.util.List tsRange(java.lang.String p0, redis.clients.jedis.timeseries.TSRangeParams p1)`
- `public java.util.List tsRevRange(java.lang.String p0, long p1, long p2)`
- `public java.util.List tsRevRange(java.lang.String p0, redis.clients.jedis.timeseries.TSRangeParams p1)`
- `public long ttl(byte[] p0)`
- `public long ttl(java.lang.String p0)`
- `public java.lang.String type(byte[] p0)`
- `public java.lang.String type(java.lang.String p0)`
- `public long unlink(byte[] p0)`
- `public long unlink(byte[]... p0)`
- `public long unlink(java.lang.String p0)`
- `public long unlink(java.lang.String... p0)`
- `public long waitReplicas(byte[] p0, int p1, long p2)`
- `public long waitReplicas(java.lang.String p0, int p1, long p2)`
- `public long xack(byte[] p0, byte[] p1, byte[]... p2)`
- `public long xack(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID... p2)`
- `public byte[] xadd(byte[] p0, redis.clients.jedis.params.XAddParams p1, java.util.Map p2)`
- `public redis.clients.jedis.StreamEntryID xadd(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, java.util.Map p2)`
- `public redis.clients.jedis.StreamEntryID xadd(java.lang.String p0, redis.clients.jedis.params.XAddParams p1, java.util.Map p2)`
- `public java.util.List xautoclaim(byte[] p0, byte[] p1, byte[] p2, long p3, byte[] p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public java.util.Map$Entry xautoclaim(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.StreamEntryID p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public java.util.List xautoclaimJustId(byte[] p0, byte[] p1, byte[] p2, long p3, byte[] p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public java.util.Map$Entry xautoclaimJustId(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.StreamEntryID p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public java.util.List xclaim(byte[] p0, byte[] p1, byte[] p2, long p3, redis.clients.jedis.params.XClaimParams p4, byte[]... p5)`
- `public java.util.List xclaim(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.params.XClaimParams p4, redis.clients.jedis.StreamEntryID... p5)`
- `public java.util.List xclaimJustId(byte[] p0, byte[] p1, byte[] p2, long p3, redis.clients.jedis.params.XClaimParams p4, byte[]... p5)`
- `public java.util.List xclaimJustId(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.params.XClaimParams p4, redis.clients.jedis.StreamEntryID... p5)`
- `public long xdel(byte[] p0, byte[]... p1)`
- `public long xdel(java.lang.String p0, redis.clients.jedis.StreamEntryID... p1)`
- `public java.lang.String xgroupCreate(byte[] p0, byte[] p1, byte[] p2, boolean p3)`
- `public java.lang.String xgroupCreate(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID p2, boolean p3)`
- `public boolean xgroupCreateConsumer(byte[] p0, byte[] p1, byte[] p2)`
- `public boolean xgroupCreateConsumer(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public long xgroupDelConsumer(byte[] p0, byte[] p1, byte[] p2)`
- `public long xgroupDelConsumer(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public long xgroupDestroy(byte[] p0, byte[] p1)`
- `public long xgroupDestroy(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String xgroupSetID(byte[] p0, byte[] p1, byte[] p2)`
- `public java.lang.String xgroupSetID(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID p2)`
- `public java.util.List xinfoConsumers(byte[] p0, byte[] p1)`
- `public java.util.List xinfoConsumers(java.lang.String p0, java.lang.String p1)`
- `public java.util.List xinfoGroup(byte[] p0)`
- `public java.util.List xinfoGroup(java.lang.String p0)`
- `public java.util.List xinfoGroups(byte[] p0)`
- `public java.util.List xinfoGroups(java.lang.String p0)`
- `public java.lang.Object xinfoStream(byte[] p0)`
- `public redis.clients.jedis.resps.StreamInfo xinfoStream(java.lang.String p0)`
- `public java.lang.Object xinfoStreamFull(byte[] p0)`
- `public java.lang.Object xinfoStreamFull(byte[] p0, int p1)`
- `public redis.clients.jedis.resps.StreamFullInfo xinfoStreamFull(java.lang.String p0)`
- `public redis.clients.jedis.resps.StreamFullInfo xinfoStreamFull(java.lang.String p0, int p1)`
- `public long xlen(byte[] p0)`
- `public long xlen(java.lang.String p0)`
- `public java.lang.Object xpending(byte[] p0, byte[] p1)`
- `public java.util.List xpending(byte[] p0, byte[] p1, byte[] p2, byte[] p3, int p4, byte[] p5)`
- `public java.util.List xpending(byte[] p0, byte[] p1, redis.clients.jedis.params.XPendingParams p2)`
- `public redis.clients.jedis.resps.StreamPendingSummary xpending(java.lang.String p0, java.lang.String p1)`
- `public java.util.List xpending(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID p2, redis.clients.jedis.StreamEntryID p3, int p4, java.lang.String p5)`
- `public java.util.List xpending(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.XPendingParams p2)`
- `public java.util.List xrange(byte[] p0, byte[] p1, byte[] p2)`
- `public java.util.List xrange(byte[] p0, byte[] p1, byte[] p2, int p3)`
- `public java.util.List xrange(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.util.List xrange(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3)`
- `public java.util.List xrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2)`
- `public java.util.List xrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2, int p3)`
- `public java.util.List xread(redis.clients.jedis.params.XReadParams p0, java.util.Map$Entry... p1)`
- `public java.util.List xread(redis.clients.jedis.params.XReadParams p0, java.util.Map p1)`
- `public java.util.List xreadGroup(byte[] p0, byte[] p1, redis.clients.jedis.params.XReadGroupParams p2, java.util.Map$Entry... p3)`
- `public java.util.List xreadGroup(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.XReadGroupParams p2, java.util.Map p3)`
- `public java.util.List xrevrange(byte[] p0, byte[] p1, byte[] p2)`
- `public java.util.List xrevrange(byte[] p0, byte[] p1, byte[] p2, int p3)`
- `public java.util.List xrevrange(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.util.List xrevrange(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3)`
- `public java.util.List xrevrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2)`
- `public java.util.List xrevrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2, int p3)`
- `public long xtrim(byte[] p0, long p1, boolean p2)`
- `public long xtrim(byte[] p0, redis.clients.jedis.params.XTrimParams p1)`
- `public long xtrim(java.lang.String p0, long p1, boolean p2)`
- `public long xtrim(java.lang.String p0, redis.clients.jedis.params.XTrimParams p1)`
- `public long zadd(byte[] p0, double p1, byte[] p2)`
- `public long zadd(byte[] p0, double p1, byte[] p2, redis.clients.jedis.params.ZAddParams p3)`
- `public long zadd(byte[] p0, java.util.Map p1)`
- `public long zadd(byte[] p0, java.util.Map p1, redis.clients.jedis.params.ZAddParams p2)`
- `public long zadd(java.lang.String p0, double p1, java.lang.String p2)`
- `public long zadd(java.lang.String p0, double p1, java.lang.String p2, redis.clients.jedis.params.ZAddParams p3)`
- `public long zadd(java.lang.String p0, java.util.Map p1)`
- `public long zadd(java.lang.String p0, java.util.Map p1, redis.clients.jedis.params.ZAddParams p2)`
- `public java.lang.Double zaddIncr(byte[] p0, double p1, byte[] p2, redis.clients.jedis.params.ZAddParams p3)`
- `public java.lang.Double zaddIncr(java.lang.String p0, double p1, java.lang.String p2, redis.clients.jedis.params.ZAddParams p3)`
- `public long zcard(byte[] p0)`
- `public long zcard(java.lang.String p0)`
- `public long zcount(byte[] p0, byte[] p1, byte[] p2)`
- `public long zcount(byte[] p0, double p1, double p2)`
- `public long zcount(java.lang.String p0, double p1, double p2)`
- `public long zcount(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.util.Set zdiff(byte[]... p0)`
- `public java.util.Set zdiff(java.lang.String... p0)`
- `public long zdiffStore(byte[] p0, byte[]... p1)`
- `public long zdiffStore(java.lang.String p0, java.lang.String... p1)`
- `public java.util.Set zdiffWithScores(byte[]... p0)`
- `public java.util.Set zdiffWithScores(java.lang.String... p0)`
- `public double zincrby(byte[] p0, double p1, byte[] p2)`
- `public java.lang.Double zincrby(byte[] p0, double p1, byte[] p2, redis.clients.jedis.params.ZIncrByParams p3)`
- `public double zincrby(java.lang.String p0, double p1, java.lang.String p2)`
- `public java.lang.Double zincrby(java.lang.String p0, double p1, java.lang.String p2, redis.clients.jedis.params.ZIncrByParams p3)`
- `public java.util.Set zinter(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public java.util.Set zinter(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public java.util.Set zinterWithScores(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public java.util.Set zinterWithScores(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public long zintercard(byte[]... p0)`
- `public long zintercard(java.lang.String... p0)`
- `public long zintercard(long p0, byte[]... p1)`
- `public long zintercard(long p0, java.lang.String... p1)`
- `public long zinterstore(byte[] p0, byte[]... p1)`
- `public long zinterstore(byte[] p0, redis.clients.jedis.params.ZParams p1, byte[]... p2)`
- `public long zinterstore(java.lang.String p0, java.lang.String... p1)`
- `public long zinterstore(java.lang.String p0, redis.clients.jedis.params.ZParams p1, java.lang.String... p2)`
- `public long zlexcount(byte[] p0, byte[] p1, byte[] p2)`
- `public long zlexcount(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public redis.clients.jedis.util.KeyValue zmpop(redis.clients.jedis.args.SortedSetOption p0, byte[]... p1)`
- `public redis.clients.jedis.util.KeyValue zmpop(redis.clients.jedis.args.SortedSetOption p0, int p1, byte[]... p2)`
- `public redis.clients.jedis.util.KeyValue zmpop(redis.clients.jedis.args.SortedSetOption p0, int p1, java.lang.String... p2)`
- `public redis.clients.jedis.util.KeyValue zmpop(redis.clients.jedis.args.SortedSetOption p0, java.lang.String... p1)`
- `public java.util.List zmscore(byte[] p0, byte[]... p1)`
- `public java.util.List zmscore(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.resps.Tuple zpopmax(byte[] p0)`
- `public java.util.List zpopmax(byte[] p0, int p1)`
- `public redis.clients.jedis.resps.Tuple zpopmax(java.lang.String p0)`
- `public java.util.List zpopmax(java.lang.String p0, int p1)`
- `public redis.clients.jedis.resps.Tuple zpopmin(byte[] p0)`
- `public java.util.List zpopmin(byte[] p0, int p1)`
- `public redis.clients.jedis.resps.Tuple zpopmin(java.lang.String p0)`
- `public java.util.List zpopmin(java.lang.String p0, int p1)`
- `public byte[] zrandmember(byte[] p0)`
- `public java.util.List zrandmember(byte[] p0, long p1)`
- `public java.lang.String zrandmember(java.lang.String p0)`
- `public java.util.List zrandmember(java.lang.String p0, long p1)`
- `public java.util.List zrandmemberWithScores(byte[] p0, long p1)`
- `public java.util.List zrandmemberWithScores(java.lang.String p0, long p1)`
- `public java.util.List zrange(byte[] p0, long p1, long p2)`
- `public java.util.List zrange(byte[] p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public java.util.List zrange(java.lang.String p0, long p1, long p2)`
- `public java.util.List zrange(java.lang.String p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public java.util.List zrangeByLex(byte[] p0, byte[] p1, byte[] p2)`
- `public java.util.List zrangeByLex(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public java.util.List zrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.util.List zrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public java.util.List zrangeByScore(byte[] p0, byte[] p1, byte[] p2)`
- `public java.util.List zrangeByScore(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public java.util.List zrangeByScore(byte[] p0, double p1, double p2)`
- `public java.util.List zrangeByScore(byte[] p0, double p1, double p2, int p3, int p4)`
- `public java.util.List zrangeByScore(java.lang.String p0, double p1, double p2)`
- `public java.util.List zrangeByScore(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public java.util.List zrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.util.List zrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public java.util.List zrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2)`
- `public java.util.List zrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public java.util.List zrangeByScoreWithScores(byte[] p0, double p1, double p2)`
- `public java.util.List zrangeByScoreWithScores(byte[] p0, double p1, double p2, int p3, int p4)`
- `public java.util.List zrangeByScoreWithScores(java.lang.String p0, double p1, double p2)`
- `public java.util.List zrangeByScoreWithScores(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public java.util.List zrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.util.List zrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public java.util.List zrangeWithScores(byte[] p0, long p1, long p2)`
- `public java.util.List zrangeWithScores(byte[] p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public java.util.List zrangeWithScores(java.lang.String p0, long p1, long p2)`
- `public java.util.List zrangeWithScores(java.lang.String p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public long zrangestore(byte[] p0, byte[] p1, redis.clients.jedis.params.ZRangeParams p2)`
- `public long zrangestore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ZRangeParams p2)`
- `public java.lang.Long zrank(byte[] p0, byte[] p1)`
- `public java.lang.Long zrank(java.lang.String p0, java.lang.String p1)`
- `public long zrem(byte[] p0, byte[]... p1)`
- `public long zrem(java.lang.String p0, java.lang.String... p1)`
- `public long zremrangeByLex(byte[] p0, byte[] p1, byte[] p2)`
- `public long zremrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public long zremrangeByRank(byte[] p0, long p1, long p2)`
- `public long zremrangeByRank(java.lang.String p0, long p1, long p2)`
- `public long zremrangeByScore(byte[] p0, byte[] p1, byte[] p2)`
- `public long zremrangeByScore(byte[] p0, double p1, double p2)`
- `public long zremrangeByScore(java.lang.String p0, double p1, double p2)`
- `public long zremrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.util.List zrevrange(byte[] p0, long p1, long p2)`
- `public java.util.List zrevrange(java.lang.String p0, long p1, long p2)`
- `public java.util.List zrevrangeByLex(byte[] p0, byte[] p1, byte[] p2)`
- `public java.util.List zrevrangeByLex(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public java.util.List zrevrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.util.List zrevrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public java.util.List zrevrangeByScore(byte[] p0, byte[] p1, byte[] p2)`
- `public java.util.List zrevrangeByScore(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public java.util.List zrevrangeByScore(byte[] p0, double p1, double p2)`
- `public java.util.List zrevrangeByScore(byte[] p0, double p1, double p2, int p3, int p4)`
- `public java.util.List zrevrangeByScore(java.lang.String p0, double p1, double p2)`
- `public java.util.List zrevrangeByScore(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public java.util.List zrevrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.util.List zrevrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public java.util.List zrevrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2)`
- `public java.util.List zrevrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public java.util.List zrevrangeByScoreWithScores(byte[] p0, double p1, double p2)`
- `public java.util.List zrevrangeByScoreWithScores(byte[] p0, double p1, double p2, int p3, int p4)`
- `public java.util.List zrevrangeByScoreWithScores(java.lang.String p0, double p1, double p2)`
- `public java.util.List zrevrangeByScoreWithScores(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public java.util.List zrevrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.util.List zrevrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public java.util.List zrevrangeWithScores(byte[] p0, long p1, long p2)`
- `public java.util.List zrevrangeWithScores(java.lang.String p0, long p1, long p2)`
- `public java.lang.Long zrevrank(byte[] p0, byte[] p1)`
- `public java.lang.Long zrevrank(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.resps.ScanResult zscan(byte[] p0, byte[] p1, redis.clients.jedis.params.ScanParams p2)`
- `public redis.clients.jedis.resps.ScanResult zscan(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ScanParams p2)`
- `public java.lang.Double zscore(byte[] p0, byte[] p1)`
- `public java.lang.Double zscore(java.lang.String p0, java.lang.String p1)`
- `public java.util.Set zunion(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public java.util.Set zunion(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public java.util.Set zunionWithScores(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public java.util.Set zunionWithScores(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public long zunionstore(byte[] p0, byte[]... p1)`
- `public long zunionstore(byte[] p0, redis.clients.jedis.params.ZParams p1, byte[]... p2)`
- `public long zunionstore(java.lang.String p0, java.lang.String... p1)`
- `public long zunionstore(java.lang.String p0, redis.clients.jedis.params.ZParams p1, java.lang.String... p2)`

---

## public final enum `redis.clients.jedis.args.BitCountOption`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.args.BitCountOption BIT`
- `public final static redis.clients.jedis.args.BitCountOption BYTE`

**Methods:**
- `public byte[] getRaw()`

---

## public final enum `redis.clients.jedis.args.BitOP`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.args.BitOP AND`
- `public final static redis.clients.jedis.args.BitOP NOT`
- `public final static redis.clients.jedis.args.BitOP OR`
- `public final static redis.clients.jedis.args.BitOP XOR`

**Methods:**
- `public byte[] getRaw()`

---

## public final enum `redis.clients.jedis.args.ClientPauseMode`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.args.ClientPauseMode ALL`
- `public final static redis.clients.jedis.args.ClientPauseMode WRITE`

**Methods:**
- `public byte[] getRaw()`

---

## public final enum `redis.clients.jedis.args.ClientType`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.args.ClientType MASTER`
- `public final static redis.clients.jedis.args.ClientType NORMAL`
- `public final static redis.clients.jedis.args.ClientType PUBSUB`
- `public final static redis.clients.jedis.args.ClientType REPLICA`
- `public final static redis.clients.jedis.args.ClientType SLAVE`

**Methods:**
- `public byte[] getRaw()`

---

## public final enum `redis.clients.jedis.args.ClusterFailoverOption`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.args.ClusterFailoverOption FORCE`
- `public final static redis.clients.jedis.args.ClusterFailoverOption TAKEOVER`

**Methods:**
- `public byte[] getRaw()`

---

## public final enum `redis.clients.jedis.args.ClusterResetType`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.args.ClusterResetType HARD`
- `public final static redis.clients.jedis.args.ClusterResetType SOFT`

**Methods:**
- `public byte[] getRaw()`

---

## public final enum `redis.clients.jedis.args.ExpiryOption`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.args.ExpiryOption GT`
- `public final static redis.clients.jedis.args.ExpiryOption LT`
- `public final static redis.clients.jedis.args.ExpiryOption NX`
- `public final static redis.clients.jedis.args.ExpiryOption XX`

**Methods:**
- `public byte[] getRaw()`

---

## public final enum `redis.clients.jedis.args.FlushMode`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.args.FlushMode ASYNC`
- `public final static redis.clients.jedis.args.FlushMode SYNC`

**Methods:**
- `public byte[] getRaw()`

---

## public final enum `redis.clients.jedis.args.FunctionRestorePolicy`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.args.FunctionRestorePolicy APPEND`
- `public final static redis.clients.jedis.args.FunctionRestorePolicy FLUSH`
- `public final static redis.clients.jedis.args.FunctionRestorePolicy REPLACE`

**Methods:**
- `public byte[] getRaw()`

---

## public final enum `redis.clients.jedis.args.GeoUnit`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.args.GeoUnit FT`
- `public final static redis.clients.jedis.args.GeoUnit KM`
- `public final static redis.clients.jedis.args.GeoUnit M`
- `public final static redis.clients.jedis.args.GeoUnit MI`

**Methods:**
- `public byte[] getRaw()`

---

## public final enum `redis.clients.jedis.args.ListDirection`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.args.ListDirection LEFT`
- `public final static redis.clients.jedis.args.ListDirection RIGHT`

**Methods:**
- `public byte[] getRaw()`

---

## public final enum `redis.clients.jedis.args.ListPosition`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.args.ListPosition AFTER`
- `public final static redis.clients.jedis.args.ListPosition BEFORE`

**Methods:**
- `public byte[] getRaw()`

---

## public abstract interface `redis.clients.jedis.args.Rawable`

**Methods:**
- `public abstract byte[] getRaw()`

---

## public final class `redis.clients.jedis.args.RawableFactory`

**Methods:**
- `public static redis.clients.jedis.args.Rawable from(byte[] p0)`
- `public static redis.clients.jedis.args.Rawable from(double p0)`
- `public static redis.clients.jedis.args.Rawable from(int p0)`
- `public static redis.clients.jedis.args.Rawable from(java.lang.String p0)`

---

## public static class `redis.clients.jedis.args.RawableFactory$Raw`
implements `redis.clients.jedis.args.Rawable`  

**Constructors:**
- `public Raw(byte[] p0)`

**Methods:**
- `public byte[] getRaw()`

---

## public static class `redis.clients.jedis.args.RawableFactory$RawString`
extends `redis.clients.jedis.args.RawableFactory$Raw`  

**Constructors:**
- `public RawString(java.lang.String p0)`

---

## public final enum `redis.clients.jedis.args.SaveMode`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.args.SaveMode NOSAVE`
- `public final static redis.clients.jedis.args.SaveMode SAVE`

**Methods:**
- `public byte[] getRaw()`

---

## public final enum `redis.clients.jedis.args.SortedSetOption`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.args.SortedSetOption MAX`
- `public final static redis.clients.jedis.args.SortedSetOption MIN`

**Methods:**
- `public byte[] getRaw()`

---

## public final enum `redis.clients.jedis.args.SortingOrder`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.args.SortingOrder ASC`
- `public final static redis.clients.jedis.args.SortingOrder DESC`

**Methods:**
- `public byte[] getRaw()`

---

## public final enum `redis.clients.jedis.args.UnblockType`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.args.UnblockType ERROR`
- `public final static redis.clients.jedis.args.UnblockType TIMEOUT`

**Methods:**
- `public byte[] getRaw()`

---

## public class `redis.clients.jedis.bloom.BFInsertParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public BFInsertParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.bloom.BFInsertParams capacity(long p0)`
- `public redis.clients.jedis.bloom.BFInsertParams error(double p0)`
- `public redis.clients.jedis.bloom.BFInsertParams expansion(int p0)`
- `public static redis.clients.jedis.bloom.BFInsertParams insertParams()`
- `public redis.clients.jedis.bloom.BFInsertParams noCreate()`
- `public redis.clients.jedis.bloom.BFInsertParams nonScaling()`

---

## public class `redis.clients.jedis.bloom.BFReserveParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public BFReserveParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.bloom.BFReserveParams expansion(int p0)`
- `public redis.clients.jedis.bloom.BFReserveParams nonScaling()`
- `public static redis.clients.jedis.bloom.BFReserveParams reserveParams()`

---

## public class `redis.clients.jedis.bloom.CFInsertParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public CFInsertParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.bloom.CFInsertParams capacity(long p0)`
- `public static redis.clients.jedis.bloom.CFInsertParams insertParams()`
- `public redis.clients.jedis.bloom.CFInsertParams noCreate()`

---

## public class `redis.clients.jedis.bloom.CFReserveParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public CFReserveParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.bloom.CFReserveParams bucketSize(long p0)`
- `public redis.clients.jedis.bloom.CFReserveParams expansion(int p0)`
- `public redis.clients.jedis.bloom.CFReserveParams maxIterations(int p0)`
- `public static redis.clients.jedis.bloom.CFReserveParams reserveParams()`

---

## public class `redis.clients.jedis.bloom.RedisBloomProtocol`

**Constructors:**
- `public RedisBloomProtocol()`

---

## public final static enum `redis.clients.jedis.bloom.RedisBloomProtocol$BloomFilterCommand`
extends `java.lang.Enum`  
implements `redis.clients.jedis.commands.ProtocolCommand`  

**Fields:**
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$BloomFilterCommand ADD`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$BloomFilterCommand EXISTS`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$BloomFilterCommand INFO`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$BloomFilterCommand INSERT`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$BloomFilterCommand LOADCHUNK`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$BloomFilterCommand MADD`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$BloomFilterCommand MEXISTS`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$BloomFilterCommand RESERVE`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$BloomFilterCommand SCANDUMP`

**Methods:**
- `public byte[] getRaw()`

---

## public final static enum `redis.clients.jedis.bloom.RedisBloomProtocol$CountMinSketchCommand`
extends `java.lang.Enum`  
implements `redis.clients.jedis.commands.ProtocolCommand`  

**Fields:**
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$CountMinSketchCommand INCRBY`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$CountMinSketchCommand INFO`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$CountMinSketchCommand INITBYDIM`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$CountMinSketchCommand INITBYPROB`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$CountMinSketchCommand MERGE`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$CountMinSketchCommand QUERY`

**Methods:**
- `public byte[] getRaw()`

---

## public final static enum `redis.clients.jedis.bloom.RedisBloomProtocol$CuckooFilterCommand`
extends `java.lang.Enum`  
implements `redis.clients.jedis.commands.ProtocolCommand`  

**Fields:**
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$CuckooFilterCommand ADD`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$CuckooFilterCommand ADDNX`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$CuckooFilterCommand COUNT`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$CuckooFilterCommand DEL`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$CuckooFilterCommand EXISTS`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$CuckooFilterCommand INFO`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$CuckooFilterCommand INSERT`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$CuckooFilterCommand INSERTNX`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$CuckooFilterCommand LOADCHUNK`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$CuckooFilterCommand MEXISTS`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$CuckooFilterCommand RESERVE`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$CuckooFilterCommand SCANDUMP`

**Methods:**
- `public byte[] getRaw()`

---

## public final static enum `redis.clients.jedis.bloom.RedisBloomProtocol$RedisBloomKeyword`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$RedisBloomKeyword BUCKETSIZE`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$RedisBloomKeyword CAPACITY`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$RedisBloomKeyword COMPRESSION`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$RedisBloomKeyword ERROR`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$RedisBloomKeyword EXPANSION`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$RedisBloomKeyword ITEMS`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$RedisBloomKeyword MAXITERATIONS`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$RedisBloomKeyword NOCREATE`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$RedisBloomKeyword NONSCALING`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$RedisBloomKeyword OVERRIDE`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$RedisBloomKeyword WEIGHTS`

**Methods:**
- `public byte[] getRaw()`

---

## public final static enum `redis.clients.jedis.bloom.RedisBloomProtocol$TDigestCommand`
extends `java.lang.Enum`  
implements `redis.clients.jedis.commands.ProtocolCommand`  

**Fields:**
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$TDigestCommand ADD`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$TDigestCommand BYRANK`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$TDigestCommand BYREVRANK`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$TDigestCommand CDF`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$TDigestCommand CREATE`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$TDigestCommand INFO`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$TDigestCommand MAX`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$TDigestCommand MERGE`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$TDigestCommand MIN`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$TDigestCommand QUANTILE`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$TDigestCommand RANK`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$TDigestCommand RESET`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$TDigestCommand REVRANK`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$TDigestCommand TRIMMED_MEAN`

**Methods:**
- `public byte[] getRaw()`

---

## public final static enum `redis.clients.jedis.bloom.RedisBloomProtocol$TopKCommand`
extends `java.lang.Enum`  
implements `redis.clients.jedis.commands.ProtocolCommand`  

**Fields:**
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$TopKCommand ADD`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$TopKCommand COUNT`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$TopKCommand INCRBY`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$TopKCommand INFO`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$TopKCommand LIST`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$TopKCommand QUERY`
- `public final static redis.clients.jedis.bloom.RedisBloomProtocol$TopKCommand RESERVE`

**Methods:**
- `public byte[] getRaw()`

---

## public class `redis.clients.jedis.bloom.TDigestMergeParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public TDigestMergeParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.bloom.TDigestMergeParams compression(int p0)`
- `public static redis.clients.jedis.bloom.TDigestMergeParams mergeParams()`
- `public redis.clients.jedis.bloom.TDigestMergeParams override()`

---

## public abstract interface `redis.clients.jedis.bloom.commands.BloomFilterCommands`

**Methods:**
- `public abstract boolean bfAdd(java.lang.String p0, java.lang.String p1)`
- `public abstract boolean bfExists(java.lang.String p0, java.lang.String p1)`
- `public abstract java.util.Map bfInfo(java.lang.String p0)`
- `public abstract java.util.List bfInsert(java.lang.String p0, java.lang.String... p1)`
- `public abstract java.util.List bfInsert(java.lang.String p0, redis.clients.jedis.bloom.BFInsertParams p1, java.lang.String... p2)`
- `public abstract java.lang.String bfLoadChunk(java.lang.String p0, long p1, byte[] p2)`
- `public abstract java.util.List bfMAdd(java.lang.String p0, java.lang.String... p1)`
- `public abstract java.util.List bfMExists(java.lang.String p0, java.lang.String... p1)`
- `public abstract java.lang.String bfReserve(java.lang.String p0, double p1, long p2)`
- `public abstract java.lang.String bfReserve(java.lang.String p0, double p1, long p2, redis.clients.jedis.bloom.BFReserveParams p3)`
- `public abstract java.util.Map$Entry bfScanDump(java.lang.String p0, long p1)`

---

## public abstract interface `redis.clients.jedis.bloom.commands.BloomFilterPipelineCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response bfAdd(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response bfExists(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response bfInfo(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response bfInsert(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response bfInsert(java.lang.String p0, redis.clients.jedis.bloom.BFInsertParams p1, java.lang.String... p2)`
- `public abstract redis.clients.jedis.Response bfLoadChunk(java.lang.String p0, long p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response bfMAdd(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response bfMExists(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response bfReserve(java.lang.String p0, double p1, long p2)`
- `public abstract redis.clients.jedis.Response bfReserve(java.lang.String p0, double p1, long p2, redis.clients.jedis.bloom.BFReserveParams p3)`
- `public abstract redis.clients.jedis.Response bfScanDump(java.lang.String p0, long p1)`

---

## public abstract interface `redis.clients.jedis.bloom.commands.CountMinSketchCommands`

**Methods:**
- `public default long cmsIncrBy(java.lang.String p0, java.lang.String p1, long p2)`
- `public abstract java.util.List cmsIncrBy(java.lang.String p0, java.util.Map p1)`
- `public abstract java.util.Map cmsInfo(java.lang.String p0)`
- `public abstract java.lang.String cmsInitByDim(java.lang.String p0, long p1, long p2)`
- `public abstract java.lang.String cmsInitByProb(java.lang.String p0, double p1, double p2)`
- `public abstract java.lang.String cmsMerge(java.lang.String p0, java.lang.String... p1)`
- `public abstract java.lang.String cmsMerge(java.lang.String p0, java.util.Map p1)`
- `public abstract java.util.List cmsQuery(java.lang.String p0, java.lang.String... p1)`

---

## public abstract interface `redis.clients.jedis.bloom.commands.CountMinSketchPipelineCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response cmsIncrBy(java.lang.String p0, java.util.Map p1)`
- `public abstract redis.clients.jedis.Response cmsInfo(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response cmsInitByDim(java.lang.String p0, long p1, long p2)`
- `public abstract redis.clients.jedis.Response cmsInitByProb(java.lang.String p0, double p1, double p2)`
- `public abstract redis.clients.jedis.Response cmsMerge(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response cmsMerge(java.lang.String p0, java.util.Map p1)`
- `public abstract redis.clients.jedis.Response cmsQuery(java.lang.String p0, java.lang.String... p1)`

---

## public abstract interface `redis.clients.jedis.bloom.commands.CuckooFilterCommands`

**Methods:**
- `public abstract boolean cfAdd(java.lang.String p0, java.lang.String p1)`
- `public abstract boolean cfAddNx(java.lang.String p0, java.lang.String p1)`
- `public abstract long cfCount(java.lang.String p0, java.lang.String p1)`
- `public abstract boolean cfDel(java.lang.String p0, java.lang.String p1)`
- `public abstract boolean cfExists(java.lang.String p0, java.lang.String p1)`
- `public abstract java.util.Map cfInfo(java.lang.String p0)`
- `public abstract java.util.List cfInsert(java.lang.String p0, java.lang.String... p1)`
- `public abstract java.util.List cfInsert(java.lang.String p0, redis.clients.jedis.bloom.CFInsertParams p1, java.lang.String... p2)`
- `public abstract java.util.List cfInsertNx(java.lang.String p0, java.lang.String... p1)`
- `public abstract java.util.List cfInsertNx(java.lang.String p0, redis.clients.jedis.bloom.CFInsertParams p1, java.lang.String... p2)`
- `public abstract java.lang.String cfLoadChunk(java.lang.String p0, long p1, byte[] p2)`
- `public abstract java.util.List cfMExists(java.lang.String p0, java.lang.String... p1)`
- `public abstract java.lang.String cfReserve(java.lang.String p0, long p1)`
- `public abstract java.lang.String cfReserve(java.lang.String p0, long p1, redis.clients.jedis.bloom.CFReserveParams p2)`
- `public abstract java.util.Map$Entry cfScanDump(java.lang.String p0, long p1)`

---

## public abstract interface `redis.clients.jedis.bloom.commands.CuckooFilterPipelineCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response cfAdd(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response cfAddNx(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response cfCount(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response cfDel(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response cfExists(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response cfInfo(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response cfInsert(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response cfInsert(java.lang.String p0, redis.clients.jedis.bloom.CFInsertParams p1, java.lang.String... p2)`
- `public abstract redis.clients.jedis.Response cfInsertNx(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response cfInsertNx(java.lang.String p0, redis.clients.jedis.bloom.CFInsertParams p1, java.lang.String... p2)`
- `public abstract redis.clients.jedis.Response cfLoadChunk(java.lang.String p0, long p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response cfReserve(java.lang.String p0, long p1)`
- `public abstract redis.clients.jedis.Response cfReserve(java.lang.String p0, long p1, redis.clients.jedis.bloom.CFReserveParams p2)`
- `public abstract redis.clients.jedis.Response cfScanDump(java.lang.String p0, long p1)`

---

## public abstract interface `redis.clients.jedis.bloom.commands.RedisBloomCommands`
implements `redis.clients.jedis.bloom.commands.BloomFilterCommands`, `redis.clients.jedis.bloom.commands.CountMinSketchCommands`, `redis.clients.jedis.bloom.commands.CuckooFilterCommands`, `redis.clients.jedis.bloom.commands.TDigestSketchCommands`, `redis.clients.jedis.bloom.commands.TopKFilterCommands`  

---

## public abstract interface `redis.clients.jedis.bloom.commands.RedisBloomPipelineCommands`
implements `redis.clients.jedis.bloom.commands.BloomFilterPipelineCommands`, `redis.clients.jedis.bloom.commands.CountMinSketchPipelineCommands`, `redis.clients.jedis.bloom.commands.CuckooFilterPipelineCommands`, `redis.clients.jedis.bloom.commands.TDigestSketchPipelineCommands`, `redis.clients.jedis.bloom.commands.TopKFilterPipelineCommands`  

---

## public abstract interface `redis.clients.jedis.bloom.commands.TDigestSketchCommands`

**Methods:**
- `public abstract java.lang.String tdigestAdd(java.lang.String p0, double... p1)`
- `public abstract java.util.List tdigestByRank(java.lang.String p0, long... p1)`
- `public abstract java.util.List tdigestByRevRank(java.lang.String p0, long... p1)`
- `public abstract java.util.List tdigestCDF(java.lang.String p0, double... p1)`
- `public abstract java.lang.String tdigestCreate(java.lang.String p0)`
- `public abstract java.lang.String tdigestCreate(java.lang.String p0, int p1)`
- `public abstract java.util.Map tdigestInfo(java.lang.String p0)`
- `public abstract double tdigestMax(java.lang.String p0)`
- `public abstract java.lang.String tdigestMerge(java.lang.String p0, java.lang.String... p1)`
- `public abstract java.lang.String tdigestMerge(redis.clients.jedis.bloom.TDigestMergeParams p0, java.lang.String p1, java.lang.String... p2)`
- `public abstract double tdigestMin(java.lang.String p0)`
- `public abstract java.util.List tdigestQuantile(java.lang.String p0, double... p1)`
- `public abstract java.util.List tdigestRank(java.lang.String p0, double... p1)`
- `public abstract java.lang.String tdigestReset(java.lang.String p0)`
- `public abstract java.util.List tdigestRevRank(java.lang.String p0, double... p1)`
- `public abstract double tdigestTrimmedMean(java.lang.String p0, double p1, double p2)`

---

## public abstract interface `redis.clients.jedis.bloom.commands.TDigestSketchPipelineCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response tdigestAdd(java.lang.String p0, double... p1)`
- `public abstract redis.clients.jedis.Response tdigestByRank(java.lang.String p0, long... p1)`
- `public abstract redis.clients.jedis.Response tdigestByRevRank(java.lang.String p0, long... p1)`
- `public abstract redis.clients.jedis.Response tdigestCDF(java.lang.String p0, double... p1)`
- `public abstract redis.clients.jedis.Response tdigestCreate(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response tdigestCreate(java.lang.String p0, int p1)`
- `public abstract redis.clients.jedis.Response tdigestInfo(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response tdigestMax(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response tdigestMerge(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response tdigestMerge(redis.clients.jedis.bloom.TDigestMergeParams p0, java.lang.String p1, java.lang.String... p2)`
- `public abstract redis.clients.jedis.Response tdigestMin(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response tdigestQuantile(java.lang.String p0, double... p1)`
- `public abstract redis.clients.jedis.Response tdigestRank(java.lang.String p0, double... p1)`
- `public abstract redis.clients.jedis.Response tdigestReset(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response tdigestRevRank(java.lang.String p0, double... p1)`
- `public abstract redis.clients.jedis.Response tdigestTrimmedMean(java.lang.String p0, double p1, double p2)`

---

## public abstract interface `redis.clients.jedis.bloom.commands.TopKFilterCommands`

**Methods:**
- `public abstract java.util.List topkAdd(java.lang.String p0, java.lang.String... p1)`
- `public abstract java.util.List topkCount(java.lang.String p0, java.lang.String... p1)`
- `public abstract java.util.List topkIncrBy(java.lang.String p0, java.util.Map p1)`
- `public abstract java.util.Map topkInfo(java.lang.String p0)`
- `public abstract java.util.List topkList(java.lang.String p0)`
- `public abstract java.util.List topkQuery(java.lang.String p0, java.lang.String... p1)`
- `public abstract java.lang.String topkReserve(java.lang.String p0, long p1)`
- `public abstract java.lang.String topkReserve(java.lang.String p0, long p1, long p2, long p3, double p4)`

---

## public abstract interface `redis.clients.jedis.bloom.commands.TopKFilterPipelineCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response topkAdd(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response topkCount(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response topkIncrBy(java.lang.String p0, java.util.Map p1)`
- `public abstract redis.clients.jedis.Response topkInfo(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response topkList(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response topkQuery(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response topkReserve(java.lang.String p0, long p1)`
- `public abstract redis.clients.jedis.Response topkReserve(java.lang.String p0, long p1, long p2, long p3, double p4)`

---

## public abstract interface `redis.clients.jedis.commands.AccessControlLogBinaryCommands`

**Methods:**
- `public abstract java.util.List aclCat(byte[] p0)`
- `public abstract java.util.List aclCatBinary()`
- `public abstract long aclDelUser(byte[] p0)`
- `public abstract long aclDelUser(byte[] p0, byte[]... p1)`
- `public abstract byte[] aclDryRunBinary(byte[] p0, byte[] p1, byte[]... p2)`
- `public abstract byte[] aclDryRunBinary(byte[] p0, redis.clients.jedis.CommandArguments p1)`
- `public abstract byte[] aclGenPassBinary()`
- `public abstract byte[] aclGenPassBinary(int p0)`
- `public abstract redis.clients.jedis.resps.AccessControlUser aclGetUser(byte[] p0)`
- `public abstract java.util.List aclListBinary()`
- `public abstract java.lang.String aclLoad()`
- `public abstract java.util.List aclLogBinary()`
- `public abstract java.util.List aclLogBinary(int p0)`
- `public abstract java.lang.String aclLogReset()`
- `public abstract java.lang.String aclSave()`
- `public abstract java.lang.String aclSetUser(byte[] p0)`
- `public abstract java.lang.String aclSetUser(byte[] p0, byte[]... p1)`
- `public abstract java.util.List aclUsersBinary()`
- `public abstract byte[] aclWhoAmIBinary()`

---

## public abstract interface `redis.clients.jedis.commands.AccessControlLogCommands`

**Methods:**
- `public abstract java.util.List aclCat()`
- `public abstract java.util.List aclCat(java.lang.String p0)`
- `public abstract long aclDelUser(java.lang.String p0)`
- `public abstract long aclDelUser(java.lang.String p0, java.lang.String... p1)`
- `public abstract java.lang.String aclDryRun(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public abstract java.lang.String aclDryRun(java.lang.String p0, redis.clients.jedis.CommandArguments p1)`
- `public abstract java.lang.String aclGenPass()`
- `public abstract java.lang.String aclGenPass(int p0)`
- `public abstract redis.clients.jedis.resps.AccessControlUser aclGetUser(java.lang.String p0)`
- `public abstract java.util.List aclList()`
- `public abstract java.lang.String aclLoad()`
- `public abstract java.util.List aclLog()`
- `public abstract java.util.List aclLog(int p0)`
- `public abstract java.lang.String aclLogReset()`
- `public abstract java.lang.String aclSave()`
- `public abstract java.lang.String aclSetUser(java.lang.String p0)`
- `public abstract java.lang.String aclSetUser(java.lang.String p0, java.lang.String... p1)`
- `public abstract java.util.List aclUsers()`
- `public abstract java.lang.String aclWhoAmI()`

---

## public abstract interface `redis.clients.jedis.commands.ClientBinaryCommands`

**Methods:**
- `public abstract byte[] clientGetnameBinary()`
- `public abstract long clientId()`
- `public abstract byte[] clientInfoBinary()`
- `public abstract java.lang.String clientKill(byte[] p0)`
- `public abstract java.lang.String clientKill(java.lang.String p0, int p1)`
- `public abstract long clientKill(redis.clients.jedis.params.ClientKillParams p0)`
- `public abstract byte[] clientListBinary()`
- `public abstract byte[] clientListBinary(long... p0)`
- `public abstract byte[] clientListBinary(redis.clients.jedis.args.ClientType p0)`
- `public abstract java.lang.String clientNoEvictOff()`
- `public abstract java.lang.String clientNoEvictOn()`
- `public abstract java.lang.String clientPause(long p0)`
- `public abstract java.lang.String clientPause(long p0, redis.clients.jedis.args.ClientPauseMode p1)`
- `public abstract java.lang.String clientSetname(byte[] p0)`
- `public abstract long clientUnblock(long p0)`
- `public abstract long clientUnblock(long p0, redis.clients.jedis.args.UnblockType p1)`

---

## public abstract interface `redis.clients.jedis.commands.ClientCommands`

**Methods:**
- `public abstract java.lang.String clientGetname()`
- `public abstract long clientId()`
- `public abstract java.lang.String clientInfo()`
- `public abstract java.lang.String clientKill(java.lang.String p0)`
- `public abstract java.lang.String clientKill(java.lang.String p0, int p1)`
- `public abstract long clientKill(redis.clients.jedis.params.ClientKillParams p0)`
- `public abstract java.lang.String clientList()`
- `public abstract java.lang.String clientList(long... p0)`
- `public abstract java.lang.String clientList(redis.clients.jedis.args.ClientType p0)`
- `public abstract java.lang.String clientNoEvictOff()`
- `public abstract java.lang.String clientNoEvictOn()`
- `public abstract java.lang.String clientPause(long p0)`
- `public abstract java.lang.String clientPause(long p0, redis.clients.jedis.args.ClientPauseMode p1)`
- `public abstract java.lang.String clientSetname(java.lang.String p0)`
- `public abstract long clientUnblock(long p0)`
- `public abstract long clientUnblock(long p0, redis.clients.jedis.args.UnblockType p1)`

---

## public abstract interface `redis.clients.jedis.commands.ClusterCommands`

**Methods:**
- `public abstract java.lang.String asking()`
- `public abstract java.lang.String clusterAddSlots(int... p0)`
- `public abstract java.lang.String clusterAddSlotsRange(int... p0)`
- `public abstract java.lang.String clusterBumpEpoch()`
- `public abstract long clusterCountFailureReports(java.lang.String p0)`
- `public abstract long clusterCountKeysInSlot(int p0)`
- `public abstract java.lang.String clusterDelSlots(int... p0)`
- `public abstract java.lang.String clusterDelSlotsRange(int... p0)`
- `public abstract java.lang.String clusterFailover()`
- `public abstract java.lang.String clusterFailover(redis.clients.jedis.args.ClusterFailoverOption p0)`
- `public abstract java.lang.String clusterFlushSlots()`
- `public abstract java.lang.String clusterForget(java.lang.String p0)`
- `public abstract java.util.List clusterGetKeysInSlot(int p0, int p1)`
- `public abstract java.util.List clusterGetKeysInSlotBinary(int p0, int p1)`
- `public abstract java.lang.String clusterInfo()`
- `public abstract long clusterKeySlot(java.lang.String p0)`
- `public abstract java.util.List clusterLinks()`
- `public abstract java.lang.String clusterMeet(java.lang.String p0, int p1)`
- `public abstract java.lang.String clusterMyId()`
- `public abstract java.lang.String clusterNodes()`
- `public abstract java.util.List clusterReplicas(java.lang.String p0)`
- `public abstract java.lang.String clusterReplicate(java.lang.String p0)`
- `public abstract java.lang.String clusterReset()`
- `public abstract java.lang.String clusterReset(redis.clients.jedis.args.ClusterResetType p0)`
- `public abstract java.lang.String clusterSaveConfig()`
- `public abstract java.lang.String clusterSetConfigEpoch(long p0)`
- `public abstract java.lang.String clusterSetSlotImporting(int p0, java.lang.String p1)`
- `public abstract java.lang.String clusterSetSlotMigrating(int p0, java.lang.String p1)`
- `public abstract java.lang.String clusterSetSlotNode(int p0, java.lang.String p1)`
- `public abstract java.lang.String clusterSetSlotStable(int p0)`
- `public abstract java.util.List clusterSlaves(java.lang.String p0)`
- `public abstract java.util.List clusterSlots()`
- `public abstract java.lang.String readonly()`
- `public abstract java.lang.String readwrite()`

---

## public abstract interface `redis.clients.jedis.commands.CommandCommands`

**Methods:**
- `public abstract long commandCount()`
- `public abstract java.util.Map commandDocs(java.lang.String... p0)`
- `public abstract java.util.List commandGetKeys(java.lang.String... p0)`
- `public abstract java.util.List commandGetKeysAndFlags(java.lang.String... p0)`
- `public abstract java.util.Map commandInfo(java.lang.String... p0)`
- `public abstract java.util.List commandList()`
- `public abstract java.util.List commandListFilterBy(redis.clients.jedis.params.CommandListFilterByParams p0)`

---

## public abstract interface `redis.clients.jedis.commands.ConfigCommands`

**Methods:**
- `public abstract java.util.List configGet(byte[] p0)`
- `public abstract java.util.List configGet(byte[]... p0)`
- `public abstract java.util.List configGet(java.lang.String p0)`
- `public abstract java.util.List configGet(java.lang.String... p0)`
- `public abstract java.lang.String configResetStat()`
- `public abstract java.lang.String configRewrite()`
- `public abstract java.lang.String configSet(byte[] p0, byte[] p1)`
- `public abstract java.lang.String configSet(byte[]... p0)`
- `public abstract java.lang.String configSet(java.lang.String p0, java.lang.String p1)`
- `public abstract java.lang.String configSet(java.lang.String... p0)`

---

## public abstract interface `redis.clients.jedis.commands.ControlBinaryCommands`
implements `redis.clients.jedis.commands.AccessControlLogBinaryCommands`, `redis.clients.jedis.commands.ClientBinaryCommands`  

**Methods:**
- `public abstract byte[] memoryDoctorBinary()`
- `public abstract java.lang.Long memoryUsage(byte[] p0)`
- `public abstract java.lang.Long memoryUsage(byte[] p0, int p1)`
- `public abstract byte[] objectEncoding(byte[] p0)`
- `public abstract java.lang.Long objectFreq(byte[] p0)`
- `public abstract java.util.List objectHelpBinary()`
- `public abstract java.lang.Long objectIdletime(byte[] p0)`
- `public abstract java.lang.Long objectRefcount(byte[] p0)`
- `public abstract java.util.List roleBinary()`

---

## public abstract interface `redis.clients.jedis.commands.ControlCommands`
implements `redis.clients.jedis.commands.AccessControlLogCommands`, `redis.clients.jedis.commands.ClientCommands`  

**Methods:**
- `public abstract java.lang.String memoryDoctor()`
- `public abstract java.lang.String memoryPurge()`
- `public abstract java.util.Map memoryStats()`
- `public abstract java.lang.Long memoryUsage(java.lang.String p0)`
- `public abstract java.lang.Long memoryUsage(java.lang.String p0, int p1)`
- `public abstract java.lang.String objectEncoding(java.lang.String p0)`
- `public abstract java.lang.Long objectFreq(java.lang.String p0)`
- `public abstract java.util.List objectHelp()`
- `public abstract java.lang.Long objectIdletime(java.lang.String p0)`
- `public abstract java.lang.Long objectRefcount(java.lang.String p0)`
- `public abstract java.util.List role()`

---

## public abstract interface `redis.clients.jedis.commands.DatabaseCommands`

**Methods:**
- `public abstract boolean copy(byte[] p0, byte[] p1, int p2, boolean p3)`
- `public abstract boolean copy(java.lang.String p0, java.lang.String p1, int p2, boolean p3)`
- `public abstract long dbSize()`
- `public abstract java.lang.String flushDB(redis.clients.jedis.args.FlushMode p0)`
- `public abstract java.lang.String migrate(java.lang.String p0, int p1, byte[] p2, int p3, int p4)`
- `public abstract java.lang.String migrate(java.lang.String p0, int p1, int p2, int p3, redis.clients.jedis.params.MigrateParams p4, byte[]... p5)`
- `public abstract java.lang.String migrate(java.lang.String p0, int p1, int p2, int p3, redis.clients.jedis.params.MigrateParams p4, java.lang.String... p5)`
- `public abstract java.lang.String migrate(java.lang.String p0, int p1, java.lang.String p2, int p3, int p4)`
- `public abstract long move(byte[] p0, int p1)`
- `public abstract long move(java.lang.String p0, int p1)`
- `public abstract java.lang.String select(int p0)`
- `public abstract java.lang.String swapDB(int p0, int p1)`

---

## public abstract interface `redis.clients.jedis.commands.DatabasePipelineCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response copy(byte[] p0, byte[] p1, int p2, boolean p3)`
- `public abstract redis.clients.jedis.Response copy(java.lang.String p0, java.lang.String p1, int p2, boolean p3)`
- `public abstract redis.clients.jedis.Response dbSize()`
- `public abstract redis.clients.jedis.Response migrate(java.lang.String p0, int p1, byte[] p2, int p3, int p4)`
- `public abstract redis.clients.jedis.Response migrate(java.lang.String p0, int p1, int p2, int p3, redis.clients.jedis.params.MigrateParams p4, byte[]... p5)`
- `public abstract redis.clients.jedis.Response migrate(java.lang.String p0, int p1, int p2, int p3, redis.clients.jedis.params.MigrateParams p4, java.lang.String... p5)`
- `public abstract redis.clients.jedis.Response migrate(java.lang.String p0, int p1, java.lang.String p2, int p3, int p4)`
- `public abstract redis.clients.jedis.Response move(byte[] p0, int p1)`
- `public abstract redis.clients.jedis.Response move(java.lang.String p0, int p1)`
- `public abstract redis.clients.jedis.Response select(int p0)`
- `public abstract redis.clients.jedis.Response swapDB(int p0, int p1)`

---

## public abstract interface `redis.clients.jedis.commands.FunctionBinaryCommands`

**Methods:**
- `public abstract java.lang.Object fcall(byte[] p0, java.util.List p1, java.util.List p2)`
- `public abstract java.lang.Object fcallReadonly(byte[] p0, java.util.List p1, java.util.List p2)`
- `public abstract java.lang.String functionDelete(byte[] p0)`
- `public abstract byte[] functionDump()`
- `public abstract java.lang.String functionFlush()`
- `public abstract java.lang.String functionFlush(redis.clients.jedis.args.FlushMode p0)`
- `public abstract java.lang.String functionKill()`
- `public abstract java.util.List functionList(byte[] p0)`
- `public abstract java.util.List functionListBinary()`
- `public abstract java.util.List functionListWithCode(byte[] p0)`
- `public abstract java.util.List functionListWithCodeBinary()`
- `public abstract java.lang.String functionLoad(byte[] p0)`
- `public abstract java.lang.String functionLoadReplace(byte[] p0)`
- `public abstract java.lang.String functionRestore(byte[] p0)`
- `public abstract java.lang.String functionRestore(byte[] p0, redis.clients.jedis.args.FunctionRestorePolicy p1)`
- `public abstract java.lang.Object functionStatsBinary()`

---

## public abstract interface `redis.clients.jedis.commands.FunctionCommands`

**Methods:**
- `public abstract java.lang.Object fcall(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public abstract java.lang.Object fcallReadonly(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public abstract java.lang.String functionDelete(java.lang.String p0)`
- `public abstract byte[] functionDump()`
- `public abstract java.lang.String functionFlush()`
- `public abstract java.lang.String functionFlush(redis.clients.jedis.args.FlushMode p0)`
- `public abstract java.lang.String functionKill()`
- `public abstract java.util.List functionList()`
- `public abstract java.util.List functionList(java.lang.String p0)`
- `public abstract java.util.List functionListWithCode()`
- `public abstract java.util.List functionListWithCode(java.lang.String p0)`
- `public abstract java.lang.String functionLoad(java.lang.String p0)`
- `public abstract java.lang.String functionLoadReplace(java.lang.String p0)`
- `public abstract java.lang.String functionRestore(byte[] p0)`
- `public abstract java.lang.String functionRestore(byte[] p0, redis.clients.jedis.args.FunctionRestorePolicy p1)`
- `public abstract redis.clients.jedis.resps.FunctionStats functionStats()`

---

## public abstract interface `redis.clients.jedis.commands.FunctionPipelineBinaryCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response fcall(byte[] p0, java.util.List p1, java.util.List p2)`
- `public abstract redis.clients.jedis.Response fcallReadonly(byte[] p0, java.util.List p1, java.util.List p2)`
- `public abstract redis.clients.jedis.Response functionDelete(byte[] p0)`
- `public abstract redis.clients.jedis.Response functionDump()`
- `public abstract redis.clients.jedis.Response functionFlush()`
- `public abstract redis.clients.jedis.Response functionFlush(redis.clients.jedis.args.FlushMode p0)`
- `public abstract redis.clients.jedis.Response functionKill()`
- `public abstract redis.clients.jedis.Response functionList(byte[] p0)`
- `public abstract redis.clients.jedis.Response functionListBinary()`
- `public abstract redis.clients.jedis.Response functionListWithCode(byte[] p0)`
- `public abstract redis.clients.jedis.Response functionListWithCodeBinary()`
- `public abstract redis.clients.jedis.Response functionLoad(byte[] p0)`
- `public abstract redis.clients.jedis.Response functionLoadReplace(byte[] p0)`
- `public abstract redis.clients.jedis.Response functionRestore(byte[] p0)`
- `public abstract redis.clients.jedis.Response functionRestore(byte[] p0, redis.clients.jedis.args.FunctionRestorePolicy p1)`
- `public abstract redis.clients.jedis.Response functionStatsBinary()`

---

## public abstract interface `redis.clients.jedis.commands.FunctionPipelineCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response fcall(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public abstract redis.clients.jedis.Response fcallReadonly(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public abstract redis.clients.jedis.Response functionDelete(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response functionDump()`
- `public abstract redis.clients.jedis.Response functionFlush()`
- `public abstract redis.clients.jedis.Response functionFlush(redis.clients.jedis.args.FlushMode p0)`
- `public abstract redis.clients.jedis.Response functionKill()`
- `public abstract redis.clients.jedis.Response functionList()`
- `public abstract redis.clients.jedis.Response functionList(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response functionListWithCode()`
- `public abstract redis.clients.jedis.Response functionListWithCode(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response functionLoad(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response functionLoadReplace(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response functionRestore(byte[] p0)`
- `public abstract redis.clients.jedis.Response functionRestore(byte[] p0, redis.clients.jedis.args.FunctionRestorePolicy p1)`
- `public abstract redis.clients.jedis.Response functionStats()`

---

## public abstract interface `redis.clients.jedis.commands.GenericControlCommands`
implements `redis.clients.jedis.commands.ConfigCommands`, `redis.clients.jedis.commands.ScriptingControlCommands`, `redis.clients.jedis.commands.SlowlogCommands`  

**Methods:**
- `public abstract java.lang.String failover()`
- `public abstract java.lang.String failover(redis.clients.jedis.params.FailoverParams p0)`
- `public abstract java.lang.String failoverAbort()`
- `public abstract java.util.List moduleList()`

---

## public abstract interface `redis.clients.jedis.commands.GeoBinaryCommands`

**Methods:**
- `public abstract long geoadd(byte[] p0, double p1, double p2, byte[] p3)`
- `public abstract long geoadd(byte[] p0, java.util.Map p1)`
- `public abstract long geoadd(byte[] p0, redis.clients.jedis.params.GeoAddParams p1, java.util.Map p2)`
- `public abstract java.lang.Double geodist(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract java.lang.Double geodist(byte[] p0, byte[] p1, byte[] p2, redis.clients.jedis.args.GeoUnit p3)`
- `public abstract java.util.List geohash(byte[] p0, byte[]... p1)`
- `public abstract java.util.List geopos(byte[] p0, byte[]... p1)`
- `public abstract java.util.List georadius(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public abstract java.util.List georadius(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public abstract java.util.List georadiusByMember(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public abstract java.util.List georadiusByMember(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public abstract java.util.List georadiusByMemberReadonly(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public abstract java.util.List georadiusByMemberReadonly(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public abstract long georadiusByMemberStore(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4, redis.clients.jedis.params.GeoRadiusStoreParam p5)`
- `public abstract java.util.List georadiusReadonly(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public abstract java.util.List georadiusReadonly(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public abstract long georadiusStore(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5, redis.clients.jedis.params.GeoRadiusStoreParam p6)`
- `public abstract java.util.List geosearch(byte[] p0, byte[] p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public abstract java.util.List geosearch(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public abstract java.util.List geosearch(byte[] p0, redis.clients.jedis.GeoCoordinate p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public abstract java.util.List geosearch(byte[] p0, redis.clients.jedis.GeoCoordinate p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public abstract java.util.List geosearch(byte[] p0, redis.clients.jedis.params.GeoSearchParam p1)`
- `public abstract long geosearchStore(byte[] p0, byte[] p1, byte[] p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public abstract long geosearchStore(byte[] p0, byte[] p1, byte[] p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public abstract long geosearchStore(byte[] p0, byte[] p1, redis.clients.jedis.GeoCoordinate p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public abstract long geosearchStore(byte[] p0, byte[] p1, redis.clients.jedis.GeoCoordinate p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public abstract long geosearchStore(byte[] p0, byte[] p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public abstract long geosearchStoreStoreDist(byte[] p0, byte[] p1, redis.clients.jedis.params.GeoSearchParam p2)`

---

## public abstract interface `redis.clients.jedis.commands.GeoCommands`

**Methods:**
- `public abstract long geoadd(java.lang.String p0, double p1, double p2, java.lang.String p3)`
- `public abstract long geoadd(java.lang.String p0, java.util.Map p1)`
- `public abstract long geoadd(java.lang.String p0, redis.clients.jedis.params.GeoAddParams p1, java.util.Map p2)`
- `public abstract java.lang.Double geodist(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract java.lang.Double geodist(java.lang.String p0, java.lang.String p1, java.lang.String p2, redis.clients.jedis.args.GeoUnit p3)`
- `public abstract java.util.List geohash(java.lang.String p0, java.lang.String... p1)`
- `public abstract java.util.List geopos(java.lang.String p0, java.lang.String... p1)`
- `public abstract java.util.List georadius(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public abstract java.util.List georadius(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public abstract java.util.List georadiusByMember(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public abstract java.util.List georadiusByMember(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public abstract java.util.List georadiusByMemberReadonly(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public abstract java.util.List georadiusByMemberReadonly(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public abstract long georadiusByMemberStore(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4, redis.clients.jedis.params.GeoRadiusStoreParam p5)`
- `public abstract java.util.List georadiusReadonly(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public abstract java.util.List georadiusReadonly(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public abstract long georadiusStore(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5, redis.clients.jedis.params.GeoRadiusStoreParam p6)`
- `public abstract java.util.List geosearch(java.lang.String p0, java.lang.String p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public abstract java.util.List geosearch(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public abstract java.util.List geosearch(java.lang.String p0, redis.clients.jedis.GeoCoordinate p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public abstract java.util.List geosearch(java.lang.String p0, redis.clients.jedis.GeoCoordinate p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public abstract java.util.List geosearch(java.lang.String p0, redis.clients.jedis.params.GeoSearchParam p1)`
- `public abstract long geosearchStore(java.lang.String p0, java.lang.String p1, java.lang.String p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public abstract long geosearchStore(java.lang.String p0, java.lang.String p1, java.lang.String p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public abstract long geosearchStore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.GeoCoordinate p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public abstract long geosearchStore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.GeoCoordinate p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public abstract long geosearchStore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public abstract long geosearchStoreStoreDist(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.GeoSearchParam p2)`

---

## public abstract interface `redis.clients.jedis.commands.GeoPipelineBinaryCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response geoadd(byte[] p0, double p1, double p2, byte[] p3)`
- `public abstract redis.clients.jedis.Response geoadd(byte[] p0, java.util.Map p1)`
- `public abstract redis.clients.jedis.Response geoadd(byte[] p0, redis.clients.jedis.params.GeoAddParams p1, java.util.Map p2)`
- `public abstract redis.clients.jedis.Response geodist(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response geodist(byte[] p0, byte[] p1, byte[] p2, redis.clients.jedis.args.GeoUnit p3)`
- `public abstract redis.clients.jedis.Response geohash(byte[] p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response geopos(byte[] p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response georadius(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public abstract redis.clients.jedis.Response georadius(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public abstract redis.clients.jedis.Response georadiusByMember(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public abstract redis.clients.jedis.Response georadiusByMember(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public abstract redis.clients.jedis.Response georadiusByMemberReadonly(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public abstract redis.clients.jedis.Response georadiusByMemberReadonly(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public abstract redis.clients.jedis.Response georadiusByMemberStore(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4, redis.clients.jedis.params.GeoRadiusStoreParam p5)`
- `public abstract redis.clients.jedis.Response georadiusReadonly(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public abstract redis.clients.jedis.Response georadiusReadonly(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public abstract redis.clients.jedis.Response georadiusStore(byte[] p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5, redis.clients.jedis.params.GeoRadiusStoreParam p6)`
- `public abstract redis.clients.jedis.Response geosearch(byte[] p0, byte[] p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public abstract redis.clients.jedis.Response geosearch(byte[] p0, byte[] p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public abstract redis.clients.jedis.Response geosearch(byte[] p0, redis.clients.jedis.GeoCoordinate p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public abstract redis.clients.jedis.Response geosearch(byte[] p0, redis.clients.jedis.GeoCoordinate p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public abstract redis.clients.jedis.Response geosearch(byte[] p0, redis.clients.jedis.params.GeoSearchParam p1)`
- `public abstract redis.clients.jedis.Response geosearchStore(byte[] p0, byte[] p1, byte[] p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public abstract redis.clients.jedis.Response geosearchStore(byte[] p0, byte[] p1, byte[] p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public abstract redis.clients.jedis.Response geosearchStore(byte[] p0, byte[] p1, redis.clients.jedis.GeoCoordinate p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public abstract redis.clients.jedis.Response geosearchStore(byte[] p0, byte[] p1, redis.clients.jedis.GeoCoordinate p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public abstract redis.clients.jedis.Response geosearchStore(byte[] p0, byte[] p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public abstract redis.clients.jedis.Response geosearchStoreStoreDist(byte[] p0, byte[] p1, redis.clients.jedis.params.GeoSearchParam p2)`

---

## public abstract interface `redis.clients.jedis.commands.GeoPipelineCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response geoadd(java.lang.String p0, double p1, double p2, java.lang.String p3)`
- `public abstract redis.clients.jedis.Response geoadd(java.lang.String p0, java.util.Map p1)`
- `public abstract redis.clients.jedis.Response geoadd(java.lang.String p0, redis.clients.jedis.params.GeoAddParams p1, java.util.Map p2)`
- `public abstract redis.clients.jedis.Response geodist(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response geodist(java.lang.String p0, java.lang.String p1, java.lang.String p2, redis.clients.jedis.args.GeoUnit p3)`
- `public abstract redis.clients.jedis.Response geohash(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response geopos(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response georadius(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public abstract redis.clients.jedis.Response georadius(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public abstract redis.clients.jedis.Response georadiusByMember(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public abstract redis.clients.jedis.Response georadiusByMember(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public abstract redis.clients.jedis.Response georadiusByMemberReadonly(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public abstract redis.clients.jedis.Response georadiusByMemberReadonly(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4)`
- `public abstract redis.clients.jedis.Response georadiusByMemberStore(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3, redis.clients.jedis.params.GeoRadiusParam p4, redis.clients.jedis.params.GeoRadiusStoreParam p5)`
- `public abstract redis.clients.jedis.Response georadiusReadonly(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public abstract redis.clients.jedis.Response georadiusReadonly(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5)`
- `public abstract redis.clients.jedis.Response georadiusStore(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4, redis.clients.jedis.params.GeoRadiusParam p5, redis.clients.jedis.params.GeoRadiusStoreParam p6)`
- `public abstract redis.clients.jedis.Response geosearch(java.lang.String p0, java.lang.String p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public abstract redis.clients.jedis.Response geosearch(java.lang.String p0, java.lang.String p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public abstract redis.clients.jedis.Response geosearch(java.lang.String p0, redis.clients.jedis.GeoCoordinate p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public abstract redis.clients.jedis.Response geosearch(java.lang.String p0, redis.clients.jedis.GeoCoordinate p1, double p2, redis.clients.jedis.args.GeoUnit p3)`
- `public abstract redis.clients.jedis.Response geosearch(java.lang.String p0, redis.clients.jedis.params.GeoSearchParam p1)`
- `public abstract redis.clients.jedis.Response geosearchStore(java.lang.String p0, java.lang.String p1, java.lang.String p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public abstract redis.clients.jedis.Response geosearchStore(java.lang.String p0, java.lang.String p1, java.lang.String p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public abstract redis.clients.jedis.Response geosearchStore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.GeoCoordinate p2, double p3, double p4, redis.clients.jedis.args.GeoUnit p5)`
- `public abstract redis.clients.jedis.Response geosearchStore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.GeoCoordinate p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public abstract redis.clients.jedis.Response geosearchStore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.GeoSearchParam p2)`
- `public abstract redis.clients.jedis.Response geosearchStoreStoreDist(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.GeoSearchParam p2)`

---

## public abstract interface `redis.clients.jedis.commands.HashBinaryCommands`

**Methods:**
- `public abstract long hdel(byte[] p0, byte[]... p1)`
- `public abstract boolean hexists(byte[] p0, byte[] p1)`
- `public abstract byte[] hget(byte[] p0, byte[] p1)`
- `public abstract java.util.Map hgetAll(byte[] p0)`
- `public abstract long hincrBy(byte[] p0, byte[] p1, long p2)`
- `public abstract double hincrByFloat(byte[] p0, byte[] p1, double p2)`
- `public abstract java.util.Set hkeys(byte[] p0)`
- `public abstract long hlen(byte[] p0)`
- `public abstract java.util.List hmget(byte[] p0, byte[]... p1)`
- `public abstract java.lang.String hmset(byte[] p0, java.util.Map p1)`
- `public abstract byte[] hrandfield(byte[] p0)`
- `public abstract java.util.List hrandfield(byte[] p0, long p1)`
- `public abstract java.util.Map hrandfieldWithValues(byte[] p0, long p1)`
- `public default redis.clients.jedis.resps.ScanResult hscan(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.resps.ScanResult hscan(byte[] p0, byte[] p1, redis.clients.jedis.params.ScanParams p2)`
- `public abstract long hset(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract long hset(byte[] p0, java.util.Map p1)`
- `public abstract long hsetnx(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract long hstrlen(byte[] p0, byte[] p1)`
- `public abstract java.util.List hvals(byte[] p0)`

---

## public abstract interface `redis.clients.jedis.commands.HashCommands`

**Methods:**
- `public abstract long hdel(java.lang.String p0, java.lang.String... p1)`
- `public abstract boolean hexists(java.lang.String p0, java.lang.String p1)`
- `public abstract java.lang.String hget(java.lang.String p0, java.lang.String p1)`
- `public abstract java.util.Map hgetAll(java.lang.String p0)`
- `public abstract long hincrBy(java.lang.String p0, java.lang.String p1, long p2)`
- `public abstract double hincrByFloat(java.lang.String p0, java.lang.String p1, double p2)`
- `public abstract java.util.Set hkeys(java.lang.String p0)`
- `public abstract long hlen(java.lang.String p0)`
- `public abstract java.util.List hmget(java.lang.String p0, java.lang.String... p1)`
- `public abstract java.lang.String hmset(java.lang.String p0, java.util.Map p1)`
- `public abstract java.lang.String hrandfield(java.lang.String p0)`
- `public abstract java.util.List hrandfield(java.lang.String p0, long p1)`
- `public abstract java.util.Map hrandfieldWithValues(java.lang.String p0, long p1)`
- `public default redis.clients.jedis.resps.ScanResult hscan(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.resps.ScanResult hscan(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ScanParams p2)`
- `public abstract long hset(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract long hset(java.lang.String p0, java.util.Map p1)`
- `public abstract long hsetnx(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract long hstrlen(java.lang.String p0, java.lang.String p1)`
- `public abstract java.util.List hvals(java.lang.String p0)`

---

## public abstract interface `redis.clients.jedis.commands.HashPipelineBinaryCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response hdel(byte[] p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response hexists(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.Response hget(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.Response hgetAll(byte[] p0)`
- `public abstract redis.clients.jedis.Response hincrBy(byte[] p0, byte[] p1, long p2)`
- `public abstract redis.clients.jedis.Response hincrByFloat(byte[] p0, byte[] p1, double p2)`
- `public abstract redis.clients.jedis.Response hkeys(byte[] p0)`
- `public abstract redis.clients.jedis.Response hlen(byte[] p0)`
- `public abstract redis.clients.jedis.Response hmget(byte[] p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response hmset(byte[] p0, java.util.Map p1)`
- `public abstract redis.clients.jedis.Response hrandfield(byte[] p0)`
- `public abstract redis.clients.jedis.Response hrandfield(byte[] p0, long p1)`
- `public abstract redis.clients.jedis.Response hrandfieldWithValues(byte[] p0, long p1)`
- `public default redis.clients.jedis.Response hscan(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.Response hscan(byte[] p0, byte[] p1, redis.clients.jedis.params.ScanParams p2)`
- `public abstract redis.clients.jedis.Response hset(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response hset(byte[] p0, java.util.Map p1)`
- `public abstract redis.clients.jedis.Response hsetnx(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response hstrlen(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.Response hvals(byte[] p0)`

---

## public abstract interface `redis.clients.jedis.commands.HashPipelineCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response hdel(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response hexists(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response hget(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response hgetAll(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response hincrBy(java.lang.String p0, java.lang.String p1, long p2)`
- `public abstract redis.clients.jedis.Response hincrByFloat(java.lang.String p0, java.lang.String p1, double p2)`
- `public abstract redis.clients.jedis.Response hkeys(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response hlen(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response hmget(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response hmset(java.lang.String p0, java.util.Map p1)`
- `public abstract redis.clients.jedis.Response hrandfield(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response hrandfield(java.lang.String p0, long p1)`
- `public abstract redis.clients.jedis.Response hrandfieldWithValues(java.lang.String p0, long p1)`
- `public default redis.clients.jedis.Response hscan(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response hscan(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ScanParams p2)`
- `public abstract redis.clients.jedis.Response hset(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response hset(java.lang.String p0, java.util.Map p1)`
- `public abstract redis.clients.jedis.Response hsetnx(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response hstrlen(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response hvals(java.lang.String p0)`

---

## public abstract interface `redis.clients.jedis.commands.HyperLogLogBinaryCommands`

**Methods:**
- `public abstract long pfadd(byte[] p0, byte[]... p1)`
- `public abstract long pfcount(byte[] p0)`
- `public abstract long pfcount(byte[]... p0)`
- `public abstract java.lang.String pfmerge(byte[] p0, byte[]... p1)`

---

## public abstract interface `redis.clients.jedis.commands.HyperLogLogCommands`

**Methods:**
- `public abstract long pfadd(java.lang.String p0, java.lang.String... p1)`
- `public abstract long pfcount(java.lang.String p0)`
- `public abstract long pfcount(java.lang.String... p0)`
- `public abstract java.lang.String pfmerge(java.lang.String p0, java.lang.String... p1)`

---

## public abstract interface `redis.clients.jedis.commands.HyperLogLogPipelineBinaryCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response pfadd(byte[] p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response pfcount(byte[] p0)`
- `public abstract redis.clients.jedis.Response pfcount(byte[]... p0)`
- `public abstract redis.clients.jedis.Response pfmerge(byte[] p0, byte[]... p1)`

---

## public abstract interface `redis.clients.jedis.commands.HyperLogLogPipelineCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response pfadd(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response pfcount(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response pfcount(java.lang.String... p0)`
- `public abstract redis.clients.jedis.Response pfmerge(java.lang.String p0, java.lang.String... p1)`

---

## public abstract interface `redis.clients.jedis.commands.JedisBinaryCommands`
implements `redis.clients.jedis.commands.FunctionBinaryCommands`, `redis.clients.jedis.commands.GeoBinaryCommands`, `redis.clients.jedis.commands.HashBinaryCommands`, `redis.clients.jedis.commands.HyperLogLogBinaryCommands`, `redis.clients.jedis.commands.KeyBinaryCommands`, `redis.clients.jedis.commands.ListBinaryCommands`, `redis.clients.jedis.commands.ScriptingKeyBinaryCommands`, `redis.clients.jedis.commands.SetBinaryCommands`, `redis.clients.jedis.commands.SortedSetBinaryCommands`, `redis.clients.jedis.commands.StreamBinaryCommands`, `redis.clients.jedis.commands.StringBinaryCommands`  

---

## public abstract interface `redis.clients.jedis.commands.JedisCommands`
implements `redis.clients.jedis.commands.FunctionCommands`, `redis.clients.jedis.commands.GeoCommands`, `redis.clients.jedis.commands.HashCommands`, `redis.clients.jedis.commands.HyperLogLogCommands`, `redis.clients.jedis.commands.KeyCommands`, `redis.clients.jedis.commands.ListCommands`, `redis.clients.jedis.commands.ScriptingKeyCommands`, `redis.clients.jedis.commands.SetCommands`, `redis.clients.jedis.commands.SortedSetCommands`, `redis.clients.jedis.commands.StreamCommands`, `redis.clients.jedis.commands.StringCommands`  

---

## public abstract interface `redis.clients.jedis.commands.KeyBinaryCommands`

**Methods:**
- `public abstract boolean copy(byte[] p0, byte[] p1, boolean p2)`
- `public abstract long del(byte[] p0)`
- `public abstract long del(byte[]... p0)`
- `public abstract byte[] dump(byte[] p0)`
- `public abstract boolean exists(byte[] p0)`
- `public abstract long exists(byte[]... p0)`
- `public abstract long expire(byte[] p0, long p1)`
- `public abstract long expire(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public abstract long expireAt(byte[] p0, long p1)`
- `public abstract long expireAt(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public abstract long expireTime(byte[] p0)`
- `public abstract java.util.Set keys(byte[] p0)`
- `public abstract java.lang.Long memoryUsage(byte[] p0)`
- `public abstract java.lang.Long memoryUsage(byte[] p0, int p1)`
- `public abstract java.lang.String migrate(java.lang.String p0, int p1, byte[] p2, int p3)`
- `public abstract java.lang.String migrate(java.lang.String p0, int p1, int p2, redis.clients.jedis.params.MigrateParams p3, byte[]... p4)`
- `public abstract byte[] objectEncoding(byte[] p0)`
- `public abstract java.lang.Long objectFreq(byte[] p0)`
- `public abstract java.lang.Long objectIdletime(byte[] p0)`
- `public abstract java.lang.Long objectRefcount(byte[] p0)`
- `public abstract long persist(byte[] p0)`
- `public abstract long pexpire(byte[] p0, long p1)`
- `public abstract long pexpire(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public abstract long pexpireAt(byte[] p0, long p1)`
- `public abstract long pexpireAt(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public abstract long pexpireTime(byte[] p0)`
- `public abstract long pttl(byte[] p0)`
- `public abstract byte[] randomBinaryKey()`
- `public abstract java.lang.String rename(byte[] p0, byte[] p1)`
- `public abstract long renamenx(byte[] p0, byte[] p1)`
- `public abstract java.lang.String restore(byte[] p0, long p1, byte[] p2)`
- `public abstract java.lang.String restore(byte[] p0, long p1, byte[] p2, redis.clients.jedis.params.RestoreParams p3)`
- `public abstract redis.clients.jedis.resps.ScanResult scan(byte[] p0)`
- `public abstract redis.clients.jedis.resps.ScanResult scan(byte[] p0, redis.clients.jedis.params.ScanParams p1)`
- `public abstract redis.clients.jedis.resps.ScanResult scan(byte[] p0, redis.clients.jedis.params.ScanParams p1, byte[] p2)`
- `public abstract java.util.List sort(byte[] p0)`
- `public abstract long sort(byte[] p0, byte[] p1)`
- `public abstract java.util.List sort(byte[] p0, redis.clients.jedis.params.SortingParams p1)`
- `public abstract long sort(byte[] p0, redis.clients.jedis.params.SortingParams p1, byte[] p2)`
- `public abstract java.util.List sortReadonly(byte[] p0, redis.clients.jedis.params.SortingParams p1)`
- `public abstract long touch(byte[] p0)`
- `public abstract long touch(byte[]... p0)`
- `public abstract long ttl(byte[] p0)`
- `public abstract java.lang.String type(byte[] p0)`
- `public abstract long unlink(byte[] p0)`
- `public abstract long unlink(byte[]... p0)`

---

## public abstract interface `redis.clients.jedis.commands.KeyCommands`

**Methods:**
- `public abstract boolean copy(java.lang.String p0, java.lang.String p1, boolean p2)`
- `public abstract long del(java.lang.String p0)`
- `public abstract long del(java.lang.String... p0)`
- `public abstract byte[] dump(java.lang.String p0)`
- `public abstract boolean exists(java.lang.String p0)`
- `public abstract long exists(java.lang.String... p0)`
- `public abstract long expire(java.lang.String p0, long p1)`
- `public abstract long expire(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public abstract long expireAt(java.lang.String p0, long p1)`
- `public abstract long expireAt(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public abstract long expireTime(java.lang.String p0)`
- `public abstract java.util.Set keys(java.lang.String p0)`
- `public abstract java.lang.Long memoryUsage(java.lang.String p0)`
- `public abstract java.lang.Long memoryUsage(java.lang.String p0, int p1)`
- `public abstract java.lang.String migrate(java.lang.String p0, int p1, int p2, redis.clients.jedis.params.MigrateParams p3, java.lang.String... p4)`
- `public abstract java.lang.String migrate(java.lang.String p0, int p1, java.lang.String p2, int p3)`
- `public abstract java.lang.String objectEncoding(java.lang.String p0)`
- `public abstract java.lang.Long objectFreq(java.lang.String p0)`
- `public abstract java.lang.Long objectIdletime(java.lang.String p0)`
- `public abstract java.lang.Long objectRefcount(java.lang.String p0)`
- `public abstract long persist(java.lang.String p0)`
- `public abstract long pexpire(java.lang.String p0, long p1)`
- `public abstract long pexpire(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public abstract long pexpireAt(java.lang.String p0, long p1)`
- `public abstract long pexpireAt(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public abstract long pexpireTime(java.lang.String p0)`
- `public abstract long pttl(java.lang.String p0)`
- `public abstract java.lang.String randomKey()`
- `public abstract java.lang.String rename(java.lang.String p0, java.lang.String p1)`
- `public abstract long renamenx(java.lang.String p0, java.lang.String p1)`
- `public abstract java.lang.String restore(java.lang.String p0, long p1, byte[] p2)`
- `public abstract java.lang.String restore(java.lang.String p0, long p1, byte[] p2, redis.clients.jedis.params.RestoreParams p3)`
- `public abstract redis.clients.jedis.resps.ScanResult scan(java.lang.String p0)`
- `public abstract redis.clients.jedis.resps.ScanResult scan(java.lang.String p0, redis.clients.jedis.params.ScanParams p1)`
- `public abstract redis.clients.jedis.resps.ScanResult scan(java.lang.String p0, redis.clients.jedis.params.ScanParams p1, java.lang.String p2)`
- `public abstract java.util.List sort(java.lang.String p0)`
- `public abstract long sort(java.lang.String p0, java.lang.String p1)`
- `public abstract java.util.List sort(java.lang.String p0, redis.clients.jedis.params.SortingParams p1)`
- `public abstract long sort(java.lang.String p0, redis.clients.jedis.params.SortingParams p1, java.lang.String p2)`
- `public abstract java.util.List sortReadonly(java.lang.String p0, redis.clients.jedis.params.SortingParams p1)`
- `public abstract long touch(java.lang.String p0)`
- `public abstract long touch(java.lang.String... p0)`
- `public abstract long ttl(java.lang.String p0)`
- `public abstract java.lang.String type(java.lang.String p0)`
- `public abstract long unlink(java.lang.String p0)`
- `public abstract long unlink(java.lang.String... p0)`

---

## public abstract interface `redis.clients.jedis.commands.KeyPipelineBinaryCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response copy(byte[] p0, byte[] p1, boolean p2)`
- `public abstract redis.clients.jedis.Response del(byte[] p0)`
- `public abstract redis.clients.jedis.Response del(byte[]... p0)`
- `public abstract redis.clients.jedis.Response dump(byte[] p0)`
- `public abstract redis.clients.jedis.Response exists(byte[] p0)`
- `public abstract redis.clients.jedis.Response exists(byte[]... p0)`
- `public abstract redis.clients.jedis.Response expire(byte[] p0, long p1)`
- `public abstract redis.clients.jedis.Response expire(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public abstract redis.clients.jedis.Response expireAt(byte[] p0, long p1)`
- `public abstract redis.clients.jedis.Response expireAt(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public abstract redis.clients.jedis.Response expireTime(byte[] p0)`
- `public abstract redis.clients.jedis.Response keys(byte[] p0)`
- `public abstract redis.clients.jedis.Response memoryUsage(byte[] p0)`
- `public abstract redis.clients.jedis.Response memoryUsage(byte[] p0, int p1)`
- `public abstract redis.clients.jedis.Response migrate(java.lang.String p0, int p1, byte[] p2, int p3)`
- `public abstract redis.clients.jedis.Response migrate(java.lang.String p0, int p1, int p2, redis.clients.jedis.params.MigrateParams p3, byte[]... p4)`
- `public abstract redis.clients.jedis.Response objectEncoding(byte[] p0)`
- `public abstract redis.clients.jedis.Response objectFreq(byte[] p0)`
- `public abstract redis.clients.jedis.Response objectIdletime(byte[] p0)`
- `public abstract redis.clients.jedis.Response objectRefcount(byte[] p0)`
- `public abstract redis.clients.jedis.Response persist(byte[] p0)`
- `public abstract redis.clients.jedis.Response pexpire(byte[] p0, long p1)`
- `public abstract redis.clients.jedis.Response pexpire(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public abstract redis.clients.jedis.Response pexpireAt(byte[] p0, long p1)`
- `public abstract redis.clients.jedis.Response pexpireAt(byte[] p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public abstract redis.clients.jedis.Response pexpireTime(byte[] p0)`
- `public abstract redis.clients.jedis.Response pttl(byte[] p0)`
- `public abstract redis.clients.jedis.Response randomBinaryKey()`
- `public abstract redis.clients.jedis.Response rename(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.Response renamenx(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.Response restore(byte[] p0, long p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response restore(byte[] p0, long p1, byte[] p2, redis.clients.jedis.params.RestoreParams p3)`
- `public abstract redis.clients.jedis.Response scan(byte[] p0)`
- `public abstract redis.clients.jedis.Response scan(byte[] p0, redis.clients.jedis.params.ScanParams p1)`
- `public abstract redis.clients.jedis.Response scan(byte[] p0, redis.clients.jedis.params.ScanParams p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response sort(byte[] p0)`
- `public abstract redis.clients.jedis.Response sort(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.Response sort(byte[] p0, redis.clients.jedis.params.SortingParams p1)`
- `public abstract redis.clients.jedis.Response sort(byte[] p0, redis.clients.jedis.params.SortingParams p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response sortReadonly(byte[] p0, redis.clients.jedis.params.SortingParams p1)`
- `public abstract redis.clients.jedis.Response touch(byte[] p0)`
- `public abstract redis.clients.jedis.Response touch(byte[]... p0)`
- `public abstract redis.clients.jedis.Response ttl(byte[] p0)`
- `public abstract redis.clients.jedis.Response type(byte[] p0)`
- `public abstract redis.clients.jedis.Response unlink(byte[] p0)`
- `public abstract redis.clients.jedis.Response unlink(byte[]... p0)`

---

## public abstract interface `redis.clients.jedis.commands.KeyPipelineCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response copy(java.lang.String p0, java.lang.String p1, boolean p2)`
- `public abstract redis.clients.jedis.Response del(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response del(java.lang.String... p0)`
- `public abstract redis.clients.jedis.Response dump(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response exists(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response exists(java.lang.String... p0)`
- `public abstract redis.clients.jedis.Response expire(java.lang.String p0, long p1)`
- `public abstract redis.clients.jedis.Response expire(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public abstract redis.clients.jedis.Response expireAt(java.lang.String p0, long p1)`
- `public abstract redis.clients.jedis.Response expireAt(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public abstract redis.clients.jedis.Response expireTime(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response keys(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response memoryUsage(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response memoryUsage(java.lang.String p0, int p1)`
- `public abstract redis.clients.jedis.Response migrate(java.lang.String p0, int p1, int p2, redis.clients.jedis.params.MigrateParams p3, java.lang.String... p4)`
- `public abstract redis.clients.jedis.Response migrate(java.lang.String p0, int p1, java.lang.String p2, int p3)`
- `public abstract redis.clients.jedis.Response objectEncoding(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response objectFreq(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response objectIdletime(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response objectRefcount(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response persist(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response pexpire(java.lang.String p0, long p1)`
- `public abstract redis.clients.jedis.Response pexpire(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public abstract redis.clients.jedis.Response pexpireAt(java.lang.String p0, long p1)`
- `public abstract redis.clients.jedis.Response pexpireAt(java.lang.String p0, long p1, redis.clients.jedis.args.ExpiryOption p2)`
- `public abstract redis.clients.jedis.Response pexpireTime(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response pttl(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response randomKey()`
- `public abstract redis.clients.jedis.Response rename(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response renamenx(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response restore(java.lang.String p0, long p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response restore(java.lang.String p0, long p1, byte[] p2, redis.clients.jedis.params.RestoreParams p3)`
- `public abstract redis.clients.jedis.Response scan(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response scan(java.lang.String p0, redis.clients.jedis.params.ScanParams p1)`
- `public abstract redis.clients.jedis.Response scan(java.lang.String p0, redis.clients.jedis.params.ScanParams p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response sort(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response sort(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response sort(java.lang.String p0, redis.clients.jedis.params.SortingParams p1)`
- `public abstract redis.clients.jedis.Response sort(java.lang.String p0, redis.clients.jedis.params.SortingParams p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response sortReadonly(java.lang.String p0, redis.clients.jedis.params.SortingParams p1)`
- `public abstract redis.clients.jedis.Response touch(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response touch(java.lang.String... p0)`
- `public abstract redis.clients.jedis.Response ttl(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response type(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response unlink(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response unlink(java.lang.String... p0)`

---

## public abstract interface `redis.clients.jedis.commands.ListBinaryCommands`

**Methods:**
- `public abstract byte[] blmove(byte[] p0, byte[] p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3, double p4)`
- `public abstract redis.clients.jedis.util.KeyValue blmpop(long p0, redis.clients.jedis.args.ListDirection p1, byte[]... p2)`
- `public abstract redis.clients.jedis.util.KeyValue blmpop(long p0, redis.clients.jedis.args.ListDirection p1, int p2, byte[]... p3)`
- `public abstract java.util.List blpop(double p0, byte[]... p1)`
- `public abstract java.util.List blpop(int p0, byte[]... p1)`
- `public abstract java.util.List brpop(double p0, byte[]... p1)`
- `public abstract java.util.List brpop(int p0, byte[]... p1)`
- `public abstract byte[] brpoplpush(byte[] p0, byte[] p1, int p2)`
- `public abstract byte[] lindex(byte[] p0, long p1)`
- `public abstract long linsert(byte[] p0, redis.clients.jedis.args.ListPosition p1, byte[] p2, byte[] p3)`
- `public abstract long llen(byte[] p0)`
- `public abstract byte[] lmove(byte[] p0, byte[] p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3)`
- `public abstract redis.clients.jedis.util.KeyValue lmpop(redis.clients.jedis.args.ListDirection p0, byte[]... p1)`
- `public abstract redis.clients.jedis.util.KeyValue lmpop(redis.clients.jedis.args.ListDirection p0, int p1, byte[]... p2)`
- `public abstract byte[] lpop(byte[] p0)`
- `public abstract java.util.List lpop(byte[] p0, int p1)`
- `public abstract java.lang.Long lpos(byte[] p0, byte[] p1)`
- `public abstract java.lang.Long lpos(byte[] p0, byte[] p1, redis.clients.jedis.params.LPosParams p2)`
- `public abstract java.util.List lpos(byte[] p0, byte[] p1, redis.clients.jedis.params.LPosParams p2, long p3)`
- `public abstract long lpush(byte[] p0, byte[]... p1)`
- `public abstract long lpushx(byte[] p0, byte[]... p1)`
- `public abstract java.util.List lrange(byte[] p0, long p1, long p2)`
- `public abstract long lrem(byte[] p0, long p1, byte[] p2)`
- `public abstract java.lang.String lset(byte[] p0, long p1, byte[] p2)`
- `public abstract java.lang.String ltrim(byte[] p0, long p1, long p2)`
- `public abstract byte[] rpop(byte[] p0)`
- `public abstract java.util.List rpop(byte[] p0, int p1)`
- `public abstract byte[] rpoplpush(byte[] p0, byte[] p1)`
- `public abstract long rpush(byte[] p0, byte[]... p1)`
- `public abstract long rpushx(byte[] p0, byte[]... p1)`

---

## public abstract interface `redis.clients.jedis.commands.ListCommands`

**Methods:**
- `public abstract java.lang.String blmove(java.lang.String p0, java.lang.String p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3, double p4)`
- `public abstract redis.clients.jedis.util.KeyValue blmpop(long p0, redis.clients.jedis.args.ListDirection p1, int p2, java.lang.String... p3)`
- `public abstract redis.clients.jedis.util.KeyValue blmpop(long p0, redis.clients.jedis.args.ListDirection p1, java.lang.String... p2)`
- `public abstract redis.clients.jedis.resps.KeyedListElement blpop(double p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.resps.KeyedListElement blpop(double p0, java.lang.String... p1)`
- `public abstract java.util.List blpop(int p0, java.lang.String p1)`
- `public abstract java.util.List blpop(int p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.resps.KeyedListElement brpop(double p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.resps.KeyedListElement brpop(double p0, java.lang.String... p1)`
- `public abstract java.util.List brpop(int p0, java.lang.String p1)`
- `public abstract java.util.List brpop(int p0, java.lang.String... p1)`
- `public abstract java.lang.String brpoplpush(java.lang.String p0, java.lang.String p1, int p2)`
- `public abstract java.lang.String lindex(java.lang.String p0, long p1)`
- `public abstract long linsert(java.lang.String p0, redis.clients.jedis.args.ListPosition p1, java.lang.String p2, java.lang.String p3)`
- `public abstract long llen(java.lang.String p0)`
- `public abstract java.lang.String lmove(java.lang.String p0, java.lang.String p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3)`
- `public abstract redis.clients.jedis.util.KeyValue lmpop(redis.clients.jedis.args.ListDirection p0, int p1, java.lang.String... p2)`
- `public abstract redis.clients.jedis.util.KeyValue lmpop(redis.clients.jedis.args.ListDirection p0, java.lang.String... p1)`
- `public abstract java.lang.String lpop(java.lang.String p0)`
- `public abstract java.util.List lpop(java.lang.String p0, int p1)`
- `public abstract java.lang.Long lpos(java.lang.String p0, java.lang.String p1)`
- `public abstract java.lang.Long lpos(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.LPosParams p2)`
- `public abstract java.util.List lpos(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.LPosParams p2, long p3)`
- `public abstract long lpush(java.lang.String p0, java.lang.String... p1)`
- `public abstract long lpushx(java.lang.String p0, java.lang.String... p1)`
- `public abstract java.util.List lrange(java.lang.String p0, long p1, long p2)`
- `public abstract long lrem(java.lang.String p0, long p1, java.lang.String p2)`
- `public abstract java.lang.String lset(java.lang.String p0, long p1, java.lang.String p2)`
- `public abstract java.lang.String ltrim(java.lang.String p0, long p1, long p2)`
- `public abstract java.lang.String rpop(java.lang.String p0)`
- `public abstract java.util.List rpop(java.lang.String p0, int p1)`
- `public abstract java.lang.String rpoplpush(java.lang.String p0, java.lang.String p1)`
- `public abstract long rpush(java.lang.String p0, java.lang.String... p1)`
- `public abstract long rpushx(java.lang.String p0, java.lang.String... p1)`

---

## public abstract interface `redis.clients.jedis.commands.ListPipelineBinaryCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response blmove(byte[] p0, byte[] p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3, double p4)`
- `public abstract redis.clients.jedis.Response blmpop(long p0, redis.clients.jedis.args.ListDirection p1, byte[]... p2)`
- `public abstract redis.clients.jedis.Response blmpop(long p0, redis.clients.jedis.args.ListDirection p1, int p2, byte[]... p3)`
- `public abstract redis.clients.jedis.Response blpop(double p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response blpop(int p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response brpop(double p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response brpop(int p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response brpoplpush(byte[] p0, byte[] p1, int p2)`
- `public abstract redis.clients.jedis.Response lindex(byte[] p0, long p1)`
- `public abstract redis.clients.jedis.Response linsert(byte[] p0, redis.clients.jedis.args.ListPosition p1, byte[] p2, byte[] p3)`
- `public abstract redis.clients.jedis.Response llen(byte[] p0)`
- `public abstract redis.clients.jedis.Response lmove(byte[] p0, byte[] p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3)`
- `public abstract redis.clients.jedis.Response lmpop(redis.clients.jedis.args.ListDirection p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response lmpop(redis.clients.jedis.args.ListDirection p0, int p1, byte[]... p2)`
- `public abstract redis.clients.jedis.Response lpop(byte[] p0)`
- `public abstract redis.clients.jedis.Response lpop(byte[] p0, int p1)`
- `public abstract redis.clients.jedis.Response lpos(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.Response lpos(byte[] p0, byte[] p1, redis.clients.jedis.params.LPosParams p2)`
- `public abstract redis.clients.jedis.Response lpos(byte[] p0, byte[] p1, redis.clients.jedis.params.LPosParams p2, long p3)`
- `public abstract redis.clients.jedis.Response lpush(byte[] p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response lpushx(byte[] p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response lrange(byte[] p0, long p1, long p2)`
- `public abstract redis.clients.jedis.Response lrem(byte[] p0, long p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response lset(byte[] p0, long p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response ltrim(byte[] p0, long p1, long p2)`
- `public abstract redis.clients.jedis.Response rpop(byte[] p0)`
- `public abstract redis.clients.jedis.Response rpop(byte[] p0, int p1)`
- `public abstract redis.clients.jedis.Response rpoplpush(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.Response rpush(byte[] p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response rpushx(byte[] p0, byte[]... p1)`

---

## public abstract interface `redis.clients.jedis.commands.ListPipelineCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response blmove(java.lang.String p0, java.lang.String p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3, double p4)`
- `public abstract redis.clients.jedis.Response blmpop(long p0, redis.clients.jedis.args.ListDirection p1, int p2, java.lang.String... p3)`
- `public abstract redis.clients.jedis.Response blmpop(long p0, redis.clients.jedis.args.ListDirection p1, java.lang.String... p2)`
- `public abstract redis.clients.jedis.Response blpop(double p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response blpop(double p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response blpop(int p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response blpop(int p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response brpop(double p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response brpop(double p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response brpop(int p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response brpop(int p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response brpoplpush(java.lang.String p0, java.lang.String p1, int p2)`
- `public abstract redis.clients.jedis.Response lindex(java.lang.String p0, long p1)`
- `public abstract redis.clients.jedis.Response linsert(java.lang.String p0, redis.clients.jedis.args.ListPosition p1, java.lang.String p2, java.lang.String p3)`
- `public abstract redis.clients.jedis.Response llen(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response lmove(java.lang.String p0, java.lang.String p1, redis.clients.jedis.args.ListDirection p2, redis.clients.jedis.args.ListDirection p3)`
- `public abstract redis.clients.jedis.Response lmpop(redis.clients.jedis.args.ListDirection p0, int p1, java.lang.String... p2)`
- `public abstract redis.clients.jedis.Response lmpop(redis.clients.jedis.args.ListDirection p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response lpop(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response lpop(java.lang.String p0, int p1)`
- `public abstract redis.clients.jedis.Response lpos(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response lpos(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.LPosParams p2)`
- `public abstract redis.clients.jedis.Response lpos(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.LPosParams p2, long p3)`
- `public abstract redis.clients.jedis.Response lpush(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response lpushx(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response lrange(java.lang.String p0, long p1, long p2)`
- `public abstract redis.clients.jedis.Response lrem(java.lang.String p0, long p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response lset(java.lang.String p0, long p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response ltrim(java.lang.String p0, long p1, long p2)`
- `public abstract redis.clients.jedis.Response rpop(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response rpop(java.lang.String p0, int p1)`
- `public abstract redis.clients.jedis.Response rpoplpush(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response rpush(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response rpushx(java.lang.String p0, java.lang.String... p1)`

---

## public abstract interface `redis.clients.jedis.commands.ModuleCommands`

**Methods:**
- `public abstract java.util.List moduleList()`
- `public abstract java.lang.String moduleLoad(java.lang.String p0)`
- `public abstract java.lang.String moduleLoad(java.lang.String p0, java.lang.String... p1)`
- `public abstract java.lang.String moduleUnload(java.lang.String p0)`

---

## public abstract interface `redis.clients.jedis.commands.PipelineBinaryCommands`
implements `redis.clients.jedis.commands.FunctionPipelineBinaryCommands`, `redis.clients.jedis.commands.GeoPipelineBinaryCommands`, `redis.clients.jedis.commands.HashPipelineBinaryCommands`, `redis.clients.jedis.commands.HyperLogLogPipelineBinaryCommands`, `redis.clients.jedis.commands.KeyPipelineBinaryCommands`, `redis.clients.jedis.commands.ListPipelineBinaryCommands`, `redis.clients.jedis.commands.SampleBinaryKeyedPipelineCommands`, `redis.clients.jedis.commands.ScriptingKeyPipelineBinaryCommands`, `redis.clients.jedis.commands.SetPipelineBinaryCommands`, `redis.clients.jedis.commands.SortedSetPipelineBinaryCommands`, `redis.clients.jedis.commands.StreamPipelineBinaryCommands`, `redis.clients.jedis.commands.StringPipelineBinaryCommands`  

---

## public abstract interface `redis.clients.jedis.commands.PipelineCommands`
implements `redis.clients.jedis.commands.FunctionPipelineCommands`, `redis.clients.jedis.commands.GeoPipelineCommands`, `redis.clients.jedis.commands.HashPipelineCommands`, `redis.clients.jedis.commands.HyperLogLogPipelineCommands`, `redis.clients.jedis.commands.KeyPipelineCommands`, `redis.clients.jedis.commands.ListPipelineCommands`, `redis.clients.jedis.commands.SampleKeyedPipelineCommands`, `redis.clients.jedis.commands.ScriptingKeyPipelineCommands`, `redis.clients.jedis.commands.SetPipelineCommands`, `redis.clients.jedis.commands.SortedSetPipelineCommands`, `redis.clients.jedis.commands.StreamPipelineCommands`, `redis.clients.jedis.commands.StringPipelineCommands`  

---

## public abstract interface `redis.clients.jedis.commands.ProtocolCommand`
implements `redis.clients.jedis.args.Rawable`  

---

## public abstract interface `redis.clients.jedis.commands.RedisModuleCommands`
implements `redis.clients.jedis.bloom.commands.RedisBloomCommands`, `redis.clients.jedis.graph.RedisGraphCommands`, `redis.clients.jedis.json.RedisJsonCommands`, `redis.clients.jedis.search.RediSearchCommands`, `redis.clients.jedis.timeseries.RedisTimeSeriesCommands`  

---

## public abstract interface `redis.clients.jedis.commands.RedisModulePipelineCommands`
implements `redis.clients.jedis.bloom.commands.RedisBloomPipelineCommands`, `redis.clients.jedis.graph.RedisGraphPipelineCommands`, `redis.clients.jedis.json.RedisJsonPipelineCommands`, `redis.clients.jedis.search.RediSearchPipelineCommands`, `redis.clients.jedis.timeseries.RedisTimeSeriesPipelineCommands`  

---

## public abstract interface `redis.clients.jedis.commands.SampleBinaryKeyedCommands`

**Methods:**
- `public abstract java.lang.Object eval(byte[] p0, byte[] p1)`
- `public abstract java.lang.Object evalsha(byte[] p0, byte[] p1)`
- `public abstract java.lang.Boolean scriptExists(byte[] p0, byte[] p1)`
- `public abstract java.util.List scriptExists(byte[] p0, byte[]... p1)`
- `public abstract java.lang.String scriptFlush(byte[] p0)`
- `public abstract java.lang.String scriptFlush(byte[] p0, redis.clients.jedis.args.FlushMode p1)`
- `public abstract java.lang.String scriptKill(byte[] p0)`
- `public abstract byte[] scriptLoad(byte[] p0, byte[] p1)`
- `public abstract long waitReplicas(byte[] p0, int p1, long p2)`

---

## public abstract interface `redis.clients.jedis.commands.SampleBinaryKeyedPipelineCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response eval(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.Response evalsha(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.Response scriptExists(byte[] p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response scriptFlush(byte[] p0)`
- `public abstract redis.clients.jedis.Response scriptFlush(byte[] p0, redis.clients.jedis.args.FlushMode p1)`
- `public abstract redis.clients.jedis.Response scriptKill(byte[] p0)`
- `public abstract redis.clients.jedis.Response scriptLoad(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.Response waitReplicas(byte[] p0, int p1, long p2)`

---

## public abstract interface `redis.clients.jedis.commands.SampleKeyedCommands`

**Methods:**
- `public abstract java.lang.Object eval(java.lang.String p0, java.lang.String p1)`
- `public abstract java.lang.Object evalsha(java.lang.String p0, java.lang.String p1)`
- `public abstract java.lang.Boolean scriptExists(java.lang.String p0, java.lang.String p1)`
- `public abstract java.util.List scriptExists(java.lang.String p0, java.lang.String... p1)`
- `public abstract java.lang.String scriptFlush(java.lang.String p0)`
- `public abstract java.lang.String scriptFlush(java.lang.String p0, redis.clients.jedis.args.FlushMode p1)`
- `public abstract java.lang.String scriptKill(java.lang.String p0)`
- `public abstract java.lang.String scriptLoad(java.lang.String p0, java.lang.String p1)`
- `public abstract long waitReplicas(java.lang.String p0, int p1, long p2)`

---

## public abstract interface `redis.clients.jedis.commands.SampleKeyedPipelineCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response eval(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response evalsha(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response scriptExists(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response scriptFlush(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response scriptFlush(java.lang.String p0, redis.clients.jedis.args.FlushMode p1)`
- `public abstract redis.clients.jedis.Response scriptKill(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response scriptLoad(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response waitReplicas(java.lang.String p0, int p1, long p2)`

---

## public abstract interface `redis.clients.jedis.commands.ScriptingControlCommands`

**Methods:**
- `public abstract java.lang.Boolean scriptExists(byte[] p0)`
- `public abstract java.util.List scriptExists(byte[]... p0)`
- `public abstract java.lang.Boolean scriptExists(java.lang.String p0)`
- `public abstract java.util.List scriptExists(java.lang.String... p0)`
- `public abstract java.lang.String scriptFlush()`
- `public abstract java.lang.String scriptFlush(redis.clients.jedis.args.FlushMode p0)`
- `public abstract java.lang.String scriptKill()`
- `public abstract byte[] scriptLoad(byte[] p0)`
- `public abstract java.lang.String scriptLoad(java.lang.String p0)`

---

## public abstract interface `redis.clients.jedis.commands.ScriptingKeyBinaryCommands`

**Methods:**
- `public abstract java.lang.Object eval(byte[] p0)`
- `public abstract java.lang.Object eval(byte[] p0, int p1, byte[]... p2)`
- `public abstract java.lang.Object eval(byte[] p0, java.util.List p1, java.util.List p2)`
- `public abstract java.lang.Object evalReadonly(byte[] p0, java.util.List p1, java.util.List p2)`
- `public abstract java.lang.Object evalsha(byte[] p0)`
- `public abstract java.lang.Object evalsha(byte[] p0, int p1, byte[]... p2)`
- `public abstract java.lang.Object evalsha(byte[] p0, java.util.List p1, java.util.List p2)`
- `public abstract java.lang.Object evalshaReadonly(byte[] p0, java.util.List p1, java.util.List p2)`

---

## public abstract interface `redis.clients.jedis.commands.ScriptingKeyCommands`

**Methods:**
- `public abstract java.lang.Object eval(java.lang.String p0)`
- `public abstract java.lang.Object eval(java.lang.String p0, int p1, java.lang.String... p2)`
- `public abstract java.lang.Object eval(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public abstract java.lang.Object evalReadonly(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public abstract java.lang.Object evalsha(java.lang.String p0)`
- `public abstract java.lang.Object evalsha(java.lang.String p0, int p1, java.lang.String... p2)`
- `public abstract java.lang.Object evalsha(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public abstract java.lang.Object evalshaReadonly(java.lang.String p0, java.util.List p1, java.util.List p2)`

---

## public abstract interface `redis.clients.jedis.commands.ScriptingKeyPipelineBinaryCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response eval(byte[] p0)`
- `public abstract redis.clients.jedis.Response eval(byte[] p0, int p1, byte[]... p2)`
- `public abstract redis.clients.jedis.Response eval(byte[] p0, java.util.List p1, java.util.List p2)`
- `public abstract redis.clients.jedis.Response evalReadonly(byte[] p0, java.util.List p1, java.util.List p2)`
- `public abstract redis.clients.jedis.Response evalsha(byte[] p0)`
- `public abstract redis.clients.jedis.Response evalsha(byte[] p0, int p1, byte[]... p2)`
- `public abstract redis.clients.jedis.Response evalsha(byte[] p0, java.util.List p1, java.util.List p2)`
- `public abstract redis.clients.jedis.Response evalshaReadonly(byte[] p0, java.util.List p1, java.util.List p2)`

---

## public abstract interface `redis.clients.jedis.commands.ScriptingKeyPipelineCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response eval(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response eval(java.lang.String p0, int p1, java.lang.String... p2)`
- `public abstract redis.clients.jedis.Response eval(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public abstract redis.clients.jedis.Response evalReadonly(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public abstract redis.clients.jedis.Response evalsha(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response evalsha(java.lang.String p0, int p1, java.lang.String... p2)`
- `public abstract redis.clients.jedis.Response evalsha(java.lang.String p0, java.util.List p1, java.util.List p2)`
- `public abstract redis.clients.jedis.Response evalshaReadonly(java.lang.String p0, java.util.List p1, java.util.List p2)`

---

## public abstract interface `redis.clients.jedis.commands.SentinelCommands`

**Methods:**
- `public abstract java.lang.String sentinelFailover(java.lang.String p0)`
- `public abstract java.util.List sentinelGetMasterAddrByName(java.lang.String p0)`
- `public abstract java.util.Map sentinelMaster(java.lang.String p0)`
- `public abstract java.util.List sentinelMasters()`
- `public abstract java.lang.String sentinelMonitor(java.lang.String p0, java.lang.String p1, int p2, int p3)`
- `public abstract java.lang.String sentinelMyId()`
- `public abstract java.lang.String sentinelRemove(java.lang.String p0)`
- `public abstract java.util.List sentinelReplicas(java.lang.String p0)`
- `public abstract java.lang.Long sentinelReset(java.lang.String p0)`
- `public abstract java.util.List sentinelSentinels(java.lang.String p0)`
- `public abstract java.lang.String sentinelSet(java.lang.String p0, java.util.Map p1)`
- `public abstract java.util.List sentinelSlaves(java.lang.String p0)`

---

## public abstract interface `redis.clients.jedis.commands.ServerCommands`

**Methods:**
- `public abstract java.lang.String auth(java.lang.String p0)`
- `public abstract java.lang.String auth(java.lang.String p0, java.lang.String p1)`
- `public abstract java.lang.String bgrewriteaof()`
- `public abstract java.lang.String bgsave()`
- `public abstract java.lang.String bgsaveSchedule()`
- `public abstract byte[] echo(byte[] p0)`
- `public abstract java.lang.String echo(java.lang.String p0)`
- `public abstract java.lang.String flushAll()`
- `public abstract java.lang.String flushAll(redis.clients.jedis.args.FlushMode p0)`
- `public abstract java.lang.String flushDB()`
- `public abstract java.lang.String info()`
- `public abstract java.lang.String info(java.lang.String p0)`
- `public abstract long lastsave()`
- `public abstract java.lang.String lolwut()`
- `public abstract java.lang.String lolwut(redis.clients.jedis.params.LolwutParams p0)`
- `public abstract java.lang.String ping()`
- `public abstract java.lang.String ping(java.lang.String p0)`
- `public abstract java.lang.String quit()`
- `public abstract java.lang.String replicaof(java.lang.String p0, int p1)`
- `public abstract java.lang.String replicaofNoOne()`
- `public abstract java.lang.String save()`
- `public abstract void shutdown() throws redis.clients.jedis.exceptions.JedisException`
- `public abstract void shutdown(redis.clients.jedis.args.SaveMode p0) throws redis.clients.jedis.exceptions.JedisException`
- `public abstract void shutdown(redis.clients.jedis.params.ShutdownParams p0) throws redis.clients.jedis.exceptions.JedisException`
- `public abstract java.lang.String shutdownAbort()`
- `public abstract java.lang.String slaveof(java.lang.String p0, int p1)`
- `public abstract java.lang.String slaveofNoOne()`
- `public abstract long waitReplicas(int p0, long p1)`

---

## public abstract interface `redis.clients.jedis.commands.SetBinaryCommands`

**Methods:**
- `public abstract long sadd(byte[] p0, byte[]... p1)`
- `public abstract long scard(byte[] p0)`
- `public abstract java.util.Set sdiff(byte[]... p0)`
- `public abstract long sdiffstore(byte[] p0, byte[]... p1)`
- `public abstract java.util.Set sinter(byte[]... p0)`
- `public abstract long sintercard(byte[]... p0)`
- `public abstract long sintercard(int p0, byte[]... p1)`
- `public abstract long sinterstore(byte[] p0, byte[]... p1)`
- `public abstract boolean sismember(byte[] p0, byte[] p1)`
- `public abstract java.util.Set smembers(byte[] p0)`
- `public abstract java.util.List smismember(byte[] p0, byte[]... p1)`
- `public abstract long smove(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract byte[] spop(byte[] p0)`
- `public abstract java.util.Set spop(byte[] p0, long p1)`
- `public abstract byte[] srandmember(byte[] p0)`
- `public abstract java.util.List srandmember(byte[] p0, int p1)`
- `public abstract long srem(byte[] p0, byte[]... p1)`
- `public default redis.clients.jedis.resps.ScanResult sscan(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.resps.ScanResult sscan(byte[] p0, byte[] p1, redis.clients.jedis.params.ScanParams p2)`
- `public abstract java.util.Set sunion(byte[]... p0)`
- `public abstract long sunionstore(byte[] p0, byte[]... p1)`

---

## public abstract interface `redis.clients.jedis.commands.SetCommands`

**Methods:**
- `public abstract long sadd(java.lang.String p0, java.lang.String... p1)`
- `public abstract long scard(java.lang.String p0)`
- `public abstract java.util.Set sdiff(java.lang.String... p0)`
- `public abstract long sdiffstore(java.lang.String p0, java.lang.String... p1)`
- `public abstract java.util.Set sinter(java.lang.String... p0)`
- `public abstract long sintercard(int p0, java.lang.String... p1)`
- `public abstract long sintercard(java.lang.String... p0)`
- `public abstract long sinterstore(java.lang.String p0, java.lang.String... p1)`
- `public abstract boolean sismember(java.lang.String p0, java.lang.String p1)`
- `public abstract java.util.Set smembers(java.lang.String p0)`
- `public abstract java.util.List smismember(java.lang.String p0, java.lang.String... p1)`
- `public abstract long smove(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract java.lang.String spop(java.lang.String p0)`
- `public abstract java.util.Set spop(java.lang.String p0, long p1)`
- `public abstract java.lang.String srandmember(java.lang.String p0)`
- `public abstract java.util.List srandmember(java.lang.String p0, int p1)`
- `public abstract long srem(java.lang.String p0, java.lang.String... p1)`
- `public default redis.clients.jedis.resps.ScanResult sscan(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.resps.ScanResult sscan(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ScanParams p2)`
- `public abstract java.util.Set sunion(java.lang.String... p0)`
- `public abstract long sunionstore(java.lang.String p0, java.lang.String... p1)`

---

## public abstract interface `redis.clients.jedis.commands.SetPipelineBinaryCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response sadd(byte[] p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response scard(byte[] p0)`
- `public abstract redis.clients.jedis.Response sdiff(byte[]... p0)`
- `public abstract redis.clients.jedis.Response sdiffstore(byte[] p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response sinter(byte[]... p0)`
- `public abstract redis.clients.jedis.Response sintercard(byte[]... p0)`
- `public abstract redis.clients.jedis.Response sintercard(int p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response sinterstore(byte[] p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response sismember(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.Response smembers(byte[] p0)`
- `public abstract redis.clients.jedis.Response smismember(byte[] p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response smove(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response spop(byte[] p0)`
- `public abstract redis.clients.jedis.Response spop(byte[] p0, long p1)`
- `public abstract redis.clients.jedis.Response srandmember(byte[] p0)`
- `public abstract redis.clients.jedis.Response srandmember(byte[] p0, int p1)`
- `public abstract redis.clients.jedis.Response srem(byte[] p0, byte[]... p1)`
- `public default redis.clients.jedis.Response sscan(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.Response sscan(byte[] p0, byte[] p1, redis.clients.jedis.params.ScanParams p2)`
- `public abstract redis.clients.jedis.Response sunion(byte[]... p0)`
- `public abstract redis.clients.jedis.Response sunionstore(byte[] p0, byte[]... p1)`

---

## public abstract interface `redis.clients.jedis.commands.SetPipelineCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response sadd(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response scard(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response sdiff(java.lang.String... p0)`
- `public abstract redis.clients.jedis.Response sdiffstore(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response sinter(java.lang.String... p0)`
- `public abstract redis.clients.jedis.Response sintercard(int p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response sintercard(java.lang.String... p0)`
- `public abstract redis.clients.jedis.Response sinterstore(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response sismember(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response smembers(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response smismember(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response smove(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response spop(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response spop(java.lang.String p0, long p1)`
- `public abstract redis.clients.jedis.Response srandmember(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response srandmember(java.lang.String p0, int p1)`
- `public abstract redis.clients.jedis.Response srem(java.lang.String p0, java.lang.String... p1)`
- `public default redis.clients.jedis.Response sscan(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response sscan(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ScanParams p2)`
- `public abstract redis.clients.jedis.Response sunion(java.lang.String... p0)`
- `public abstract redis.clients.jedis.Response sunionstore(java.lang.String p0, java.lang.String... p1)`

---

## public abstract interface `redis.clients.jedis.commands.SlowlogCommands`

**Methods:**
- `public abstract java.util.List slowlogGet()`
- `public abstract java.util.List slowlogGet(long p0)`
- `public abstract java.util.List slowlogGetBinary()`
- `public abstract java.util.List slowlogGetBinary(long p0)`
- `public abstract long slowlogLen()`
- `public abstract java.lang.String slowlogReset()`

---

## public abstract interface `redis.clients.jedis.commands.SortedSetBinaryCommands`

**Methods:**
- `public abstract redis.clients.jedis.util.KeyValue bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, byte[]... p2)`
- `public abstract redis.clients.jedis.util.KeyValue bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, int p2, byte[]... p3)`
- `public abstract java.util.List bzpopmax(double p0, byte[]... p1)`
- `public abstract java.util.List bzpopmin(double p0, byte[]... p1)`
- `public abstract long zadd(byte[] p0, double p1, byte[] p2)`
- `public abstract long zadd(byte[] p0, double p1, byte[] p2, redis.clients.jedis.params.ZAddParams p3)`
- `public abstract long zadd(byte[] p0, java.util.Map p1)`
- `public abstract long zadd(byte[] p0, java.util.Map p1, redis.clients.jedis.params.ZAddParams p2)`
- `public abstract java.lang.Double zaddIncr(byte[] p0, double p1, byte[] p2, redis.clients.jedis.params.ZAddParams p3)`
- `public abstract long zcard(byte[] p0)`
- `public abstract long zcount(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract long zcount(byte[] p0, double p1, double p2)`
- `public abstract java.util.Set zdiff(byte[]... p0)`
- `public abstract long zdiffStore(byte[] p0, byte[]... p1)`
- `public abstract java.util.Set zdiffWithScores(byte[]... p0)`
- `public abstract double zincrby(byte[] p0, double p1, byte[] p2)`
- `public abstract java.lang.Double zincrby(byte[] p0, double p1, byte[] p2, redis.clients.jedis.params.ZIncrByParams p3)`
- `public abstract java.util.Set zinter(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public abstract java.util.Set zinterWithScores(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public abstract long zintercard(byte[]... p0)`
- `public abstract long zintercard(long p0, byte[]... p1)`
- `public abstract long zinterstore(byte[] p0, byte[]... p1)`
- `public abstract long zinterstore(byte[] p0, redis.clients.jedis.params.ZParams p1, byte[]... p2)`
- `public abstract long zlexcount(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract redis.clients.jedis.util.KeyValue zmpop(redis.clients.jedis.args.SortedSetOption p0, byte[]... p1)`
- `public abstract redis.clients.jedis.util.KeyValue zmpop(redis.clients.jedis.args.SortedSetOption p0, int p1, byte[]... p2)`
- `public abstract java.util.List zmscore(byte[] p0, byte[]... p1)`
- `public abstract redis.clients.jedis.resps.Tuple zpopmax(byte[] p0)`
- `public abstract java.util.List zpopmax(byte[] p0, int p1)`
- `public abstract redis.clients.jedis.resps.Tuple zpopmin(byte[] p0)`
- `public abstract java.util.List zpopmin(byte[] p0, int p1)`
- `public abstract byte[] zrandmember(byte[] p0)`
- `public abstract java.util.List zrandmember(byte[] p0, long p1)`
- `public abstract java.util.List zrandmemberWithScores(byte[] p0, long p1)`
- `public abstract java.util.List zrange(byte[] p0, long p1, long p2)`
- `public abstract java.util.List zrange(byte[] p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public abstract java.util.List zrangeByLex(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract java.util.List zrangeByLex(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public abstract java.util.List zrangeByScore(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract java.util.List zrangeByScore(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public abstract java.util.List zrangeByScore(byte[] p0, double p1, double p2)`
- `public abstract java.util.List zrangeByScore(byte[] p0, double p1, double p2, int p3, int p4)`
- `public abstract java.util.List zrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract java.util.List zrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public abstract java.util.List zrangeByScoreWithScores(byte[] p0, double p1, double p2)`
- `public abstract java.util.List zrangeByScoreWithScores(byte[] p0, double p1, double p2, int p3, int p4)`
- `public abstract java.util.List zrangeWithScores(byte[] p0, long p1, long p2)`
- `public abstract java.util.List zrangeWithScores(byte[] p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public abstract long zrangestore(byte[] p0, byte[] p1, redis.clients.jedis.params.ZRangeParams p2)`
- `public abstract java.lang.Long zrank(byte[] p0, byte[] p1)`
- `public abstract long zrem(byte[] p0, byte[]... p1)`
- `public abstract long zremrangeByLex(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract long zremrangeByRank(byte[] p0, long p1, long p2)`
- `public abstract long zremrangeByScore(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract long zremrangeByScore(byte[] p0, double p1, double p2)`
- `public abstract java.util.List zrevrange(byte[] p0, long p1, long p2)`
- `public abstract java.util.List zrevrangeByLex(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract java.util.List zrevrangeByLex(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public abstract java.util.List zrevrangeByScore(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract java.util.List zrevrangeByScore(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public abstract java.util.List zrevrangeByScore(byte[] p0, double p1, double p2)`
- `public abstract java.util.List zrevrangeByScore(byte[] p0, double p1, double p2, int p3, int p4)`
- `public abstract java.util.List zrevrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract java.util.List zrevrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public abstract java.util.List zrevrangeByScoreWithScores(byte[] p0, double p1, double p2)`
- `public abstract java.util.List zrevrangeByScoreWithScores(byte[] p0, double p1, double p2, int p3, int p4)`
- `public abstract java.util.List zrevrangeWithScores(byte[] p0, long p1, long p2)`
- `public abstract java.lang.Long zrevrank(byte[] p0, byte[] p1)`
- `public default redis.clients.jedis.resps.ScanResult zscan(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.resps.ScanResult zscan(byte[] p0, byte[] p1, redis.clients.jedis.params.ScanParams p2)`
- `public abstract java.lang.Double zscore(byte[] p0, byte[] p1)`
- `public abstract java.util.Set zunion(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public abstract java.util.Set zunionWithScores(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public abstract long zunionstore(byte[] p0, byte[]... p1)`
- `public abstract long zunionstore(byte[] p0, redis.clients.jedis.params.ZParams p1, byte[]... p2)`

---

## public abstract interface `redis.clients.jedis.commands.SortedSetCommands`

**Methods:**
- `public abstract redis.clients.jedis.util.KeyValue bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, int p2, java.lang.String... p3)`
- `public abstract redis.clients.jedis.util.KeyValue bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, java.lang.String... p2)`
- `public abstract redis.clients.jedis.resps.KeyedZSetElement bzpopmax(double p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.resps.KeyedZSetElement bzpopmin(double p0, java.lang.String... p1)`
- `public abstract long zadd(java.lang.String p0, double p1, java.lang.String p2)`
- `public abstract long zadd(java.lang.String p0, double p1, java.lang.String p2, redis.clients.jedis.params.ZAddParams p3)`
- `public abstract long zadd(java.lang.String p0, java.util.Map p1)`
- `public abstract long zadd(java.lang.String p0, java.util.Map p1, redis.clients.jedis.params.ZAddParams p2)`
- `public abstract java.lang.Double zaddIncr(java.lang.String p0, double p1, java.lang.String p2, redis.clients.jedis.params.ZAddParams p3)`
- `public abstract long zcard(java.lang.String p0)`
- `public abstract long zcount(java.lang.String p0, double p1, double p2)`
- `public abstract long zcount(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract java.util.Set zdiff(java.lang.String... p0)`
- `public abstract long zdiffStore(java.lang.String p0, java.lang.String... p1)`
- `public abstract java.util.Set zdiffWithScores(java.lang.String... p0)`
- `public abstract double zincrby(java.lang.String p0, double p1, java.lang.String p2)`
- `public abstract java.lang.Double zincrby(java.lang.String p0, double p1, java.lang.String p2, redis.clients.jedis.params.ZIncrByParams p3)`
- `public abstract java.util.Set zinter(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public abstract java.util.Set zinterWithScores(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public abstract long zintercard(java.lang.String... p0)`
- `public abstract long zintercard(long p0, java.lang.String... p1)`
- `public abstract long zinterstore(java.lang.String p0, java.lang.String... p1)`
- `public abstract long zinterstore(java.lang.String p0, redis.clients.jedis.params.ZParams p1, java.lang.String... p2)`
- `public abstract long zlexcount(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.util.KeyValue zmpop(redis.clients.jedis.args.SortedSetOption p0, int p1, java.lang.String... p2)`
- `public abstract redis.clients.jedis.util.KeyValue zmpop(redis.clients.jedis.args.SortedSetOption p0, java.lang.String... p1)`
- `public abstract java.util.List zmscore(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.resps.Tuple zpopmax(java.lang.String p0)`
- `public abstract java.util.List zpopmax(java.lang.String p0, int p1)`
- `public abstract redis.clients.jedis.resps.Tuple zpopmin(java.lang.String p0)`
- `public abstract java.util.List zpopmin(java.lang.String p0, int p1)`
- `public abstract java.lang.String zrandmember(java.lang.String p0)`
- `public abstract java.util.List zrandmember(java.lang.String p0, long p1)`
- `public abstract java.util.List zrandmemberWithScores(java.lang.String p0, long p1)`
- `public abstract java.util.List zrange(java.lang.String p0, long p1, long p2)`
- `public abstract java.util.List zrange(java.lang.String p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public abstract java.util.List zrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract java.util.List zrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public abstract java.util.List zrangeByScore(java.lang.String p0, double p1, double p2)`
- `public abstract java.util.List zrangeByScore(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public abstract java.util.List zrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract java.util.List zrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public abstract java.util.List zrangeByScoreWithScores(java.lang.String p0, double p1, double p2)`
- `public abstract java.util.List zrangeByScoreWithScores(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public abstract java.util.List zrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract java.util.List zrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public abstract java.util.List zrangeWithScores(java.lang.String p0, long p1, long p2)`
- `public abstract java.util.List zrangeWithScores(java.lang.String p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public abstract long zrangestore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ZRangeParams p2)`
- `public abstract java.lang.Long zrank(java.lang.String p0, java.lang.String p1)`
- `public abstract long zrem(java.lang.String p0, java.lang.String... p1)`
- `public abstract long zremrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract long zremrangeByRank(java.lang.String p0, long p1, long p2)`
- `public abstract long zremrangeByScore(java.lang.String p0, double p1, double p2)`
- `public abstract long zremrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract java.util.List zrevrange(java.lang.String p0, long p1, long p2)`
- `public abstract java.util.List zrevrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract java.util.List zrevrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public abstract java.util.List zrevrangeByScore(java.lang.String p0, double p1, double p2)`
- `public abstract java.util.List zrevrangeByScore(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public abstract java.util.List zrevrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract java.util.List zrevrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public abstract java.util.List zrevrangeByScoreWithScores(java.lang.String p0, double p1, double p2)`
- `public abstract java.util.List zrevrangeByScoreWithScores(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public abstract java.util.List zrevrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract java.util.List zrevrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public abstract java.util.List zrevrangeWithScores(java.lang.String p0, long p1, long p2)`
- `public abstract java.lang.Long zrevrank(java.lang.String p0, java.lang.String p1)`
- `public default redis.clients.jedis.resps.ScanResult zscan(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.resps.ScanResult zscan(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ScanParams p2)`
- `public abstract java.lang.Double zscore(java.lang.String p0, java.lang.String p1)`
- `public abstract java.util.Set zunion(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public abstract java.util.Set zunionWithScores(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public abstract long zunionstore(java.lang.String p0, java.lang.String... p1)`
- `public abstract long zunionstore(java.lang.String p0, redis.clients.jedis.params.ZParams p1, java.lang.String... p2)`

---

## public abstract interface `redis.clients.jedis.commands.SortedSetPipelineBinaryCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, byte[]... p2)`
- `public abstract redis.clients.jedis.Response bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, int p2, byte[]... p3)`
- `public abstract redis.clients.jedis.Response bzpopmax(double p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response bzpopmin(double p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response zadd(byte[] p0, double p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response zadd(byte[] p0, double p1, byte[] p2, redis.clients.jedis.params.ZAddParams p3)`
- `public abstract redis.clients.jedis.Response zadd(byte[] p0, java.util.Map p1)`
- `public abstract redis.clients.jedis.Response zadd(byte[] p0, java.util.Map p1, redis.clients.jedis.params.ZAddParams p2)`
- `public abstract redis.clients.jedis.Response zaddIncr(byte[] p0, double p1, byte[] p2, redis.clients.jedis.params.ZAddParams p3)`
- `public abstract redis.clients.jedis.Response zcard(byte[] p0)`
- `public abstract redis.clients.jedis.Response zcount(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response zcount(byte[] p0, double p1, double p2)`
- `public abstract redis.clients.jedis.Response zdiff(byte[]... p0)`
- `public abstract redis.clients.jedis.Response zdiffStore(byte[] p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response zdiffWithScores(byte[]... p0)`
- `public abstract redis.clients.jedis.Response zincrby(byte[] p0, double p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response zincrby(byte[] p0, double p1, byte[] p2, redis.clients.jedis.params.ZIncrByParams p3)`
- `public abstract redis.clients.jedis.Response zinter(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response zinterWithScores(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response zintercard(byte[]... p0)`
- `public abstract redis.clients.jedis.Response zintercard(long p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response zinterstore(byte[] p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response zinterstore(byte[] p0, redis.clients.jedis.params.ZParams p1, byte[]... p2)`
- `public abstract redis.clients.jedis.Response zlexcount(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response zmpop(redis.clients.jedis.args.SortedSetOption p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response zmpop(redis.clients.jedis.args.SortedSetOption p0, int p1, byte[]... p2)`
- `public abstract redis.clients.jedis.Response zmscore(byte[] p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response zpopmax(byte[] p0)`
- `public abstract redis.clients.jedis.Response zpopmax(byte[] p0, int p1)`
- `public abstract redis.clients.jedis.Response zpopmin(byte[] p0)`
- `public abstract redis.clients.jedis.Response zpopmin(byte[] p0, int p1)`
- `public abstract redis.clients.jedis.Response zrandmember(byte[] p0)`
- `public abstract redis.clients.jedis.Response zrandmember(byte[] p0, long p1)`
- `public abstract redis.clients.jedis.Response zrandmemberWithScores(byte[] p0, long p1)`
- `public abstract redis.clients.jedis.Response zrange(byte[] p0, long p1, long p2)`
- `public abstract redis.clients.jedis.Response zrange(byte[] p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public abstract redis.clients.jedis.Response zrangeByLex(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response zrangeByLex(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public abstract redis.clients.jedis.Response zrangeByScore(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response zrangeByScore(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public abstract redis.clients.jedis.Response zrangeByScore(byte[] p0, double p1, double p2)`
- `public abstract redis.clients.jedis.Response zrangeByScore(byte[] p0, double p1, double p2, int p3, int p4)`
- `public abstract redis.clients.jedis.Response zrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response zrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public abstract redis.clients.jedis.Response zrangeByScoreWithScores(byte[] p0, double p1, double p2)`
- `public abstract redis.clients.jedis.Response zrangeByScoreWithScores(byte[] p0, double p1, double p2, int p3, int p4)`
- `public abstract redis.clients.jedis.Response zrangeWithScores(byte[] p0, long p1, long p2)`
- `public abstract redis.clients.jedis.Response zrangeWithScores(byte[] p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public abstract redis.clients.jedis.Response zrangestore(byte[] p0, byte[] p1, redis.clients.jedis.params.ZRangeParams p2)`
- `public abstract redis.clients.jedis.Response zrank(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.Response zrem(byte[] p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response zremrangeByLex(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response zremrangeByRank(byte[] p0, long p1, long p2)`
- `public abstract redis.clients.jedis.Response zremrangeByScore(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response zremrangeByScore(byte[] p0, double p1, double p2)`
- `public abstract redis.clients.jedis.Response zrevrange(byte[] p0, long p1, long p2)`
- `public abstract redis.clients.jedis.Response zrevrangeByLex(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response zrevrangeByLex(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public abstract redis.clients.jedis.Response zrevrangeByScore(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response zrevrangeByScore(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public abstract redis.clients.jedis.Response zrevrangeByScore(byte[] p0, double p1, double p2)`
- `public abstract redis.clients.jedis.Response zrevrangeByScore(byte[] p0, double p1, double p2, int p3, int p4)`
- `public abstract redis.clients.jedis.Response zrevrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response zrevrangeByScoreWithScores(byte[] p0, byte[] p1, byte[] p2, int p3, int p4)`
- `public abstract redis.clients.jedis.Response zrevrangeByScoreWithScores(byte[] p0, double p1, double p2)`
- `public abstract redis.clients.jedis.Response zrevrangeByScoreWithScores(byte[] p0, double p1, double p2, int p3, int p4)`
- `public abstract redis.clients.jedis.Response zrevrangeWithScores(byte[] p0, long p1, long p2)`
- `public abstract redis.clients.jedis.Response zrevrank(byte[] p0, byte[] p1)`
- `public default redis.clients.jedis.Response zscan(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.Response zscan(byte[] p0, byte[] p1, redis.clients.jedis.params.ScanParams p2)`
- `public abstract redis.clients.jedis.Response zscore(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.Response zunion(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response zunionWithScores(redis.clients.jedis.params.ZParams p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response zunionstore(byte[] p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response zunionstore(byte[] p0, redis.clients.jedis.params.ZParams p1, byte[]... p2)`

---

## public abstract interface `redis.clients.jedis.commands.SortedSetPipelineCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, int p2, java.lang.String... p3)`
- `public abstract redis.clients.jedis.Response bzmpop(long p0, redis.clients.jedis.args.SortedSetOption p1, java.lang.String... p2)`
- `public abstract redis.clients.jedis.Response bzpopmax(double p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response bzpopmin(double p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response zadd(java.lang.String p0, double p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response zadd(java.lang.String p0, double p1, java.lang.String p2, redis.clients.jedis.params.ZAddParams p3)`
- `public abstract redis.clients.jedis.Response zadd(java.lang.String p0, java.util.Map p1)`
- `public abstract redis.clients.jedis.Response zadd(java.lang.String p0, java.util.Map p1, redis.clients.jedis.params.ZAddParams p2)`
- `public abstract redis.clients.jedis.Response zaddIncr(java.lang.String p0, double p1, java.lang.String p2, redis.clients.jedis.params.ZAddParams p3)`
- `public abstract redis.clients.jedis.Response zcard(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response zcount(java.lang.String p0, double p1, double p2)`
- `public abstract redis.clients.jedis.Response zcount(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response zdiff(java.lang.String... p0)`
- `public abstract redis.clients.jedis.Response zdiffStore(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response zdiffWithScores(java.lang.String... p0)`
- `public abstract redis.clients.jedis.Response zincrby(java.lang.String p0, double p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response zincrby(java.lang.String p0, double p1, java.lang.String p2, redis.clients.jedis.params.ZIncrByParams p3)`
- `public abstract redis.clients.jedis.Response zinter(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response zinterWithScores(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response zintercard(java.lang.String... p0)`
- `public abstract redis.clients.jedis.Response zintercard(long p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response zinterstore(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response zinterstore(java.lang.String p0, redis.clients.jedis.params.ZParams p1, java.lang.String... p2)`
- `public abstract redis.clients.jedis.Response zlexcount(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response zmpop(redis.clients.jedis.args.SortedSetOption p0, int p1, java.lang.String... p2)`
- `public abstract redis.clients.jedis.Response zmpop(redis.clients.jedis.args.SortedSetOption p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response zmscore(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response zpopmax(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response zpopmax(java.lang.String p0, int p1)`
- `public abstract redis.clients.jedis.Response zpopmin(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response zpopmin(java.lang.String p0, int p1)`
- `public abstract redis.clients.jedis.Response zrandmember(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response zrandmember(java.lang.String p0, long p1)`
- `public abstract redis.clients.jedis.Response zrandmemberWithScores(java.lang.String p0, long p1)`
- `public abstract redis.clients.jedis.Response zrange(java.lang.String p0, long p1, long p2)`
- `public abstract redis.clients.jedis.Response zrange(java.lang.String p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public abstract redis.clients.jedis.Response zrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response zrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public abstract redis.clients.jedis.Response zrangeByScore(java.lang.String p0, double p1, double p2)`
- `public abstract redis.clients.jedis.Response zrangeByScore(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public abstract redis.clients.jedis.Response zrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response zrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public abstract redis.clients.jedis.Response zrangeByScoreWithScores(java.lang.String p0, double p1, double p2)`
- `public abstract redis.clients.jedis.Response zrangeByScoreWithScores(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public abstract redis.clients.jedis.Response zrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response zrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public abstract redis.clients.jedis.Response zrangeWithScores(java.lang.String p0, long p1, long p2)`
- `public abstract redis.clients.jedis.Response zrangeWithScores(java.lang.String p0, redis.clients.jedis.params.ZRangeParams p1)`
- `public abstract redis.clients.jedis.Response zrangestore(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ZRangeParams p2)`
- `public abstract redis.clients.jedis.Response zrank(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response zrem(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response zremrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response zremrangeByRank(java.lang.String p0, long p1, long p2)`
- `public abstract redis.clients.jedis.Response zremrangeByScore(java.lang.String p0, double p1, double p2)`
- `public abstract redis.clients.jedis.Response zremrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response zrevrange(java.lang.String p0, long p1, long p2)`
- `public abstract redis.clients.jedis.Response zrevrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response zrevrangeByLex(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public abstract redis.clients.jedis.Response zrevrangeByScore(java.lang.String p0, double p1, double p2)`
- `public abstract redis.clients.jedis.Response zrevrangeByScore(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public abstract redis.clients.jedis.Response zrevrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response zrevrangeByScore(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public abstract redis.clients.jedis.Response zrevrangeByScoreWithScores(java.lang.String p0, double p1, double p2)`
- `public abstract redis.clients.jedis.Response zrevrangeByScoreWithScores(java.lang.String p0, double p1, double p2, int p3, int p4)`
- `public abstract redis.clients.jedis.Response zrevrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response zrevrangeByScoreWithScores(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4)`
- `public abstract redis.clients.jedis.Response zrevrangeWithScores(java.lang.String p0, long p1, long p2)`
- `public abstract redis.clients.jedis.Response zrevrank(java.lang.String p0, java.lang.String p1)`
- `public default redis.clients.jedis.Response zscan(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response zscan(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.ScanParams p2)`
- `public abstract redis.clients.jedis.Response zscore(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response zunion(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response zunionWithScores(redis.clients.jedis.params.ZParams p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response zunionstore(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response zunionstore(java.lang.String p0, redis.clients.jedis.params.ZParams p1, java.lang.String... p2)`

---

## public abstract interface `redis.clients.jedis.commands.StreamBinaryCommands`

**Methods:**
- `public abstract long xack(byte[] p0, byte[] p1, byte[]... p2)`
- `public default byte[] xadd(byte[] p0, java.util.Map p1, redis.clients.jedis.params.XAddParams p2)`
- `public abstract byte[] xadd(byte[] p0, redis.clients.jedis.params.XAddParams p1, java.util.Map p2)`
- `public abstract java.util.List xautoclaim(byte[] p0, byte[] p1, byte[] p2, long p3, byte[] p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public abstract java.util.List xautoclaimJustId(byte[] p0, byte[] p1, byte[] p2, long p3, byte[] p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public abstract java.util.List xclaim(byte[] p0, byte[] p1, byte[] p2, long p3, redis.clients.jedis.params.XClaimParams p4, byte[]... p5)`
- `public abstract java.util.List xclaimJustId(byte[] p0, byte[] p1, byte[] p2, long p3, redis.clients.jedis.params.XClaimParams p4, byte[]... p5)`
- `public abstract long xdel(byte[] p0, byte[]... p1)`
- `public abstract java.lang.String xgroupCreate(byte[] p0, byte[] p1, byte[] p2, boolean p3)`
- `public abstract boolean xgroupCreateConsumer(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract long xgroupDelConsumer(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract long xgroupDestroy(byte[] p0, byte[] p1)`
- `public abstract java.lang.String xgroupSetID(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract java.util.List xinfoConsumers(byte[] p0, byte[] p1)`
- `public abstract java.util.List xinfoGroup(byte[] p0)`
- `public abstract java.util.List xinfoGroups(byte[] p0)`
- `public abstract java.lang.Object xinfoStream(byte[] p0)`
- `public abstract java.lang.Object xinfoStreamFull(byte[] p0)`
- `public abstract java.lang.Object xinfoStreamFull(byte[] p0, int p1)`
- `public abstract long xlen(byte[] p0)`
- `public abstract java.lang.Object xpending(byte[] p0, byte[] p1)`
- `public abstract java.util.List xpending(byte[] p0, byte[] p1, byte[] p2, byte[] p3, int p4, byte[] p5)`
- `public abstract java.util.List xpending(byte[] p0, byte[] p1, redis.clients.jedis.params.XPendingParams p2)`
- `public abstract java.util.List xrange(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract java.util.List xrange(byte[] p0, byte[] p1, byte[] p2, int p3)`
- `public abstract java.util.List xread(redis.clients.jedis.params.XReadParams p0, java.util.Map$Entry... p1)`
- `public abstract java.util.List xreadGroup(byte[] p0, byte[] p1, redis.clients.jedis.params.XReadGroupParams p2, java.util.Map$Entry... p3)`
- `public abstract java.util.List xrevrange(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract java.util.List xrevrange(byte[] p0, byte[] p1, byte[] p2, int p3)`
- `public abstract long xtrim(byte[] p0, long p1, boolean p2)`
- `public abstract long xtrim(byte[] p0, redis.clients.jedis.params.XTrimParams p1)`

---

## public abstract interface `redis.clients.jedis.commands.StreamCommands`

**Methods:**
- `public abstract long xack(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID... p2)`
- `public default redis.clients.jedis.StreamEntryID xadd(java.lang.String p0, java.util.Map p1, redis.clients.jedis.params.XAddParams p2)`
- `public abstract redis.clients.jedis.StreamEntryID xadd(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, java.util.Map p2)`
- `public abstract redis.clients.jedis.StreamEntryID xadd(java.lang.String p0, redis.clients.jedis.params.XAddParams p1, java.util.Map p2)`
- `public abstract java.util.Map$Entry xautoclaim(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.StreamEntryID p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public abstract java.util.Map$Entry xautoclaimJustId(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.StreamEntryID p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public abstract java.util.List xclaim(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.params.XClaimParams p4, redis.clients.jedis.StreamEntryID... p5)`
- `public abstract java.util.List xclaimJustId(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.params.XClaimParams p4, redis.clients.jedis.StreamEntryID... p5)`
- `public abstract long xdel(java.lang.String p0, redis.clients.jedis.StreamEntryID... p1)`
- `public abstract java.lang.String xgroupCreate(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID p2, boolean p3)`
- `public abstract boolean xgroupCreateConsumer(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract long xgroupDelConsumer(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract long xgroupDestroy(java.lang.String p0, java.lang.String p1)`
- `public abstract java.lang.String xgroupSetID(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID p2)`
- `public abstract java.util.List xinfoConsumers(java.lang.String p0, java.lang.String p1)`
- `public abstract java.util.List xinfoGroup(java.lang.String p0)`
- `public abstract java.util.List xinfoGroups(java.lang.String p0)`
- `public abstract redis.clients.jedis.resps.StreamInfo xinfoStream(java.lang.String p0)`
- `public abstract redis.clients.jedis.resps.StreamFullInfo xinfoStreamFull(java.lang.String p0)`
- `public abstract redis.clients.jedis.resps.StreamFullInfo xinfoStreamFull(java.lang.String p0, int p1)`
- `public abstract long xlen(java.lang.String p0)`
- `public abstract redis.clients.jedis.resps.StreamPendingSummary xpending(java.lang.String p0, java.lang.String p1)`
- `public abstract java.util.List xpending(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID p2, redis.clients.jedis.StreamEntryID p3, int p4, java.lang.String p5)`
- `public abstract java.util.List xpending(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.XPendingParams p2)`
- `public abstract java.util.List xrange(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract java.util.List xrange(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3)`
- `public abstract java.util.List xrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2)`
- `public abstract java.util.List xrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2, int p3)`
- `public abstract java.util.List xread(redis.clients.jedis.params.XReadParams p0, java.util.Map p1)`
- `public abstract java.util.List xreadGroup(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.XReadGroupParams p2, java.util.Map p3)`
- `public abstract java.util.List xrevrange(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract java.util.List xrevrange(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3)`
- `public abstract java.util.List xrevrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2)`
- `public abstract java.util.List xrevrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2, int p3)`
- `public abstract long xtrim(java.lang.String p0, long p1, boolean p2)`
- `public abstract long xtrim(java.lang.String p0, redis.clients.jedis.params.XTrimParams p1)`

---

## public abstract interface `redis.clients.jedis.commands.StreamPipelineBinaryCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response xack(byte[] p0, byte[] p1, byte[]... p2)`
- `public default redis.clients.jedis.Response xadd(byte[] p0, java.util.Map p1, redis.clients.jedis.params.XAddParams p2)`
- `public abstract redis.clients.jedis.Response xadd(byte[] p0, redis.clients.jedis.params.XAddParams p1, java.util.Map p2)`
- `public abstract redis.clients.jedis.Response xautoclaim(byte[] p0, byte[] p1, byte[] p2, long p3, byte[] p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public abstract redis.clients.jedis.Response xautoclaimJustId(byte[] p0, byte[] p1, byte[] p2, long p3, byte[] p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public abstract redis.clients.jedis.Response xclaim(byte[] p0, byte[] p1, byte[] p2, long p3, redis.clients.jedis.params.XClaimParams p4, byte[]... p5)`
- `public abstract redis.clients.jedis.Response xclaimJustId(byte[] p0, byte[] p1, byte[] p2, long p3, redis.clients.jedis.params.XClaimParams p4, byte[]... p5)`
- `public abstract redis.clients.jedis.Response xdel(byte[] p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response xgroupCreate(byte[] p0, byte[] p1, byte[] p2, boolean p3)`
- `public abstract redis.clients.jedis.Response xgroupCreateConsumer(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response xgroupDelConsumer(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response xgroupDestroy(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.Response xgroupSetID(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response xinfoConsumers(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.Response xinfoGroup(byte[] p0)`
- `public abstract redis.clients.jedis.Response xinfoGroups(byte[] p0)`
- `public abstract redis.clients.jedis.Response xinfoStream(byte[] p0)`
- `public abstract redis.clients.jedis.Response xinfoStreamFull(byte[] p0)`
- `public abstract redis.clients.jedis.Response xinfoStreamFull(byte[] p0, int p1)`
- `public abstract redis.clients.jedis.Response xlen(byte[] p0)`
- `public abstract redis.clients.jedis.Response xpending(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.Response xpending(byte[] p0, byte[] p1, byte[] p2, byte[] p3, int p4, byte[] p5)`
- `public abstract redis.clients.jedis.Response xpending(byte[] p0, byte[] p1, redis.clients.jedis.params.XPendingParams p2)`
- `public abstract redis.clients.jedis.Response xrange(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response xrange(byte[] p0, byte[] p1, byte[] p2, int p3)`
- `public abstract redis.clients.jedis.Response xread(redis.clients.jedis.params.XReadParams p0, java.util.Map$Entry... p1)`
- `public abstract redis.clients.jedis.Response xreadGroup(byte[] p0, byte[] p1, redis.clients.jedis.params.XReadGroupParams p2, java.util.Map$Entry... p3)`
- `public abstract redis.clients.jedis.Response xrevrange(byte[] p0, byte[] p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response xrevrange(byte[] p0, byte[] p1, byte[] p2, int p3)`
- `public abstract redis.clients.jedis.Response xtrim(byte[] p0, long p1, boolean p2)`
- `public abstract redis.clients.jedis.Response xtrim(byte[] p0, redis.clients.jedis.params.XTrimParams p1)`

---

## public abstract interface `redis.clients.jedis.commands.StreamPipelineCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response xack(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID... p2)`
- `public default redis.clients.jedis.Response xadd(java.lang.String p0, java.util.Map p1, redis.clients.jedis.params.XAddParams p2)`
- `public abstract redis.clients.jedis.Response xadd(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, java.util.Map p2)`
- `public abstract redis.clients.jedis.Response xadd(java.lang.String p0, redis.clients.jedis.params.XAddParams p1, java.util.Map p2)`
- `public abstract redis.clients.jedis.Response xautoclaim(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.StreamEntryID p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public abstract redis.clients.jedis.Response xautoclaimJustId(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.StreamEntryID p4, redis.clients.jedis.params.XAutoClaimParams p5)`
- `public abstract redis.clients.jedis.Response xclaim(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.params.XClaimParams p4, redis.clients.jedis.StreamEntryID... p5)`
- `public abstract redis.clients.jedis.Response xclaimJustId(java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, redis.clients.jedis.params.XClaimParams p4, redis.clients.jedis.StreamEntryID... p5)`
- `public abstract redis.clients.jedis.Response xdel(java.lang.String p0, redis.clients.jedis.StreamEntryID... p1)`
- `public abstract redis.clients.jedis.Response xgroupCreate(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID p2, boolean p3)`
- `public abstract redis.clients.jedis.Response xgroupCreateConsumer(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response xgroupDelConsumer(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response xgroupDestroy(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response xgroupSetID(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID p2)`
- `public abstract redis.clients.jedis.Response xinfoConsumers(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response xinfoGroup(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response xinfoGroups(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response xinfoStream(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response xinfoStreamFull(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response xinfoStreamFull(java.lang.String p0, int p1)`
- `public abstract redis.clients.jedis.Response xlen(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response xpending(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response xpending(java.lang.String p0, java.lang.String p1, redis.clients.jedis.StreamEntryID p2, redis.clients.jedis.StreamEntryID p3, int p4, java.lang.String p5)`
- `public abstract redis.clients.jedis.Response xpending(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.XPendingParams p2)`
- `public abstract redis.clients.jedis.Response xrange(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response xrange(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3)`
- `public abstract redis.clients.jedis.Response xrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2)`
- `public abstract redis.clients.jedis.Response xrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2, int p3)`
- `public abstract redis.clients.jedis.Response xread(redis.clients.jedis.params.XReadParams p0, java.util.Map p1)`
- `public abstract redis.clients.jedis.Response xreadGroup(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.XReadGroupParams p2, java.util.Map p3)`
- `public abstract redis.clients.jedis.Response xrevrange(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response xrevrange(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3)`
- `public abstract redis.clients.jedis.Response xrevrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2)`
- `public abstract redis.clients.jedis.Response xrevrange(java.lang.String p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2, int p3)`
- `public abstract redis.clients.jedis.Response xtrim(java.lang.String p0, long p1, boolean p2)`
- `public abstract redis.clients.jedis.Response xtrim(java.lang.String p0, redis.clients.jedis.params.XTrimParams p1)`

---

## public abstract interface `redis.clients.jedis.commands.StringBinaryCommands`

**Methods:**
- `public abstract long append(byte[] p0, byte[] p1)`
- `public abstract long bitcount(byte[] p0)`
- `public abstract long bitcount(byte[] p0, long p1, long p2)`
- `public abstract long bitcount(byte[] p0, long p1, long p2, redis.clients.jedis.args.BitCountOption p3)`
- `public abstract java.util.List bitfield(byte[] p0, byte[]... p1)`
- `public abstract java.util.List bitfieldReadonly(byte[] p0, byte[]... p1)`
- `public abstract long bitop(redis.clients.jedis.args.BitOP p0, byte[] p1, byte[]... p2)`
- `public abstract long bitpos(byte[] p0, boolean p1)`
- `public abstract long bitpos(byte[] p0, boolean p1, redis.clients.jedis.params.BitPosParams p2)`
- `public abstract long decr(byte[] p0)`
- `public abstract long decrBy(byte[] p0, long p1)`
- `public abstract byte[] get(byte[] p0)`
- `public abstract byte[] getDel(byte[] p0)`
- `public abstract byte[] getEx(byte[] p0, redis.clients.jedis.params.GetExParams p1)`
- `public abstract byte[] getSet(byte[] p0, byte[] p1)`
- `public abstract boolean getbit(byte[] p0, long p1)`
- `public abstract byte[] getrange(byte[] p0, long p1, long p2)`
- `public abstract long incr(byte[] p0)`
- `public abstract long incrBy(byte[] p0, long p1)`
- `public abstract double incrByFloat(byte[] p0, double p1)`
- `public abstract redis.clients.jedis.resps.LCSMatchResult lcs(byte[] p0, byte[] p1, redis.clients.jedis.params.LCSParams p2)`
- `public abstract java.util.List mget(byte[]... p0)`
- `public abstract java.lang.String mset(byte[]... p0)`
- `public abstract long msetnx(byte[]... p0)`
- `public abstract java.lang.String psetex(byte[] p0, long p1, byte[] p2)`
- `public abstract java.lang.String set(byte[] p0, byte[] p1)`
- `public abstract java.lang.String set(byte[] p0, byte[] p1, redis.clients.jedis.params.SetParams p2)`
- `public abstract byte[] setGet(byte[] p0, byte[] p1, redis.clients.jedis.params.SetParams p2)`
- `public abstract boolean setbit(byte[] p0, long p1, boolean p2)`
- `public abstract java.lang.String setex(byte[] p0, long p1, byte[] p2)`
- `public abstract long setnx(byte[] p0, byte[] p1)`
- `public abstract long setrange(byte[] p0, long p1, byte[] p2)`
- `public abstract redis.clients.jedis.resps.LCSMatchResult strAlgoLCSKeys(byte[] p0, byte[] p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public abstract long strlen(byte[] p0)`
- `public abstract byte[] substr(byte[] p0, int p1, int p2)`

---

## public abstract interface `redis.clients.jedis.commands.StringCommands`

**Methods:**
- `public abstract long append(java.lang.String p0, java.lang.String p1)`
- `public abstract long bitcount(java.lang.String p0)`
- `public abstract long bitcount(java.lang.String p0, long p1, long p2)`
- `public abstract long bitcount(java.lang.String p0, long p1, long p2, redis.clients.jedis.args.BitCountOption p3)`
- `public abstract java.util.List bitfield(java.lang.String p0, java.lang.String... p1)`
- `public abstract java.util.List bitfieldReadonly(java.lang.String p0, java.lang.String... p1)`
- `public abstract long bitop(redis.clients.jedis.args.BitOP p0, java.lang.String p1, java.lang.String... p2)`
- `public abstract long bitpos(java.lang.String p0, boolean p1)`
- `public abstract long bitpos(java.lang.String p0, boolean p1, redis.clients.jedis.params.BitPosParams p2)`
- `public abstract long decr(java.lang.String p0)`
- `public abstract long decrBy(java.lang.String p0, long p1)`
- `public abstract java.lang.String get(java.lang.String p0)`
- `public abstract java.lang.String getDel(java.lang.String p0)`
- `public abstract java.lang.String getEx(java.lang.String p0, redis.clients.jedis.params.GetExParams p1)`
- `public abstract java.lang.String getSet(java.lang.String p0, java.lang.String p1)`
- `public abstract boolean getbit(java.lang.String p0, long p1)`
- `public abstract java.lang.String getrange(java.lang.String p0, long p1, long p2)`
- `public abstract long incr(java.lang.String p0)`
- `public abstract long incrBy(java.lang.String p0, long p1)`
- `public abstract double incrByFloat(java.lang.String p0, double p1)`
- `public abstract redis.clients.jedis.resps.LCSMatchResult lcs(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.LCSParams p2)`
- `public abstract java.util.List mget(java.lang.String... p0)`
- `public abstract java.lang.String mset(java.lang.String... p0)`
- `public abstract long msetnx(java.lang.String... p0)`
- `public abstract java.lang.String psetex(java.lang.String p0, long p1, java.lang.String p2)`
- `public abstract java.lang.String set(java.lang.String p0, java.lang.String p1)`
- `public abstract java.lang.String set(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.SetParams p2)`
- `public abstract java.lang.String setGet(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.SetParams p2)`
- `public abstract boolean setbit(java.lang.String p0, long p1, boolean p2)`
- `public abstract java.lang.String setex(java.lang.String p0, long p1, java.lang.String p2)`
- `public abstract long setnx(java.lang.String p0, java.lang.String p1)`
- `public abstract long setrange(java.lang.String p0, long p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.resps.LCSMatchResult strAlgoLCSKeys(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public abstract long strlen(java.lang.String p0)`
- `public abstract java.lang.String substr(java.lang.String p0, int p1, int p2)`

---

## public abstract interface `redis.clients.jedis.commands.StringPipelineBinaryCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response append(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.Response bitcount(byte[] p0)`
- `public abstract redis.clients.jedis.Response bitcount(byte[] p0, long p1, long p2)`
- `public abstract redis.clients.jedis.Response bitcount(byte[] p0, long p1, long p2, redis.clients.jedis.args.BitCountOption p3)`
- `public abstract redis.clients.jedis.Response bitfield(byte[] p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response bitfieldReadonly(byte[] p0, byte[]... p1)`
- `public abstract redis.clients.jedis.Response bitop(redis.clients.jedis.args.BitOP p0, byte[] p1, byte[]... p2)`
- `public abstract redis.clients.jedis.Response bitpos(byte[] p0, boolean p1)`
- `public abstract redis.clients.jedis.Response bitpos(byte[] p0, boolean p1, redis.clients.jedis.params.BitPosParams p2)`
- `public abstract redis.clients.jedis.Response decr(byte[] p0)`
- `public abstract redis.clients.jedis.Response decrBy(byte[] p0, long p1)`
- `public abstract redis.clients.jedis.Response get(byte[] p0)`
- `public abstract redis.clients.jedis.Response getDel(byte[] p0)`
- `public abstract redis.clients.jedis.Response getEx(byte[] p0, redis.clients.jedis.params.GetExParams p1)`
- `public abstract redis.clients.jedis.Response getSet(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.Response getbit(byte[] p0, long p1)`
- `public abstract redis.clients.jedis.Response getrange(byte[] p0, long p1, long p2)`
- `public abstract redis.clients.jedis.Response incr(byte[] p0)`
- `public abstract redis.clients.jedis.Response incrBy(byte[] p0, long p1)`
- `public abstract redis.clients.jedis.Response incrByFloat(byte[] p0, double p1)`
- `public abstract redis.clients.jedis.Response lcs(byte[] p0, byte[] p1, redis.clients.jedis.params.LCSParams p2)`
- `public abstract redis.clients.jedis.Response mget(byte[]... p0)`
- `public abstract redis.clients.jedis.Response mset(byte[]... p0)`
- `public abstract redis.clients.jedis.Response msetnx(byte[]... p0)`
- `public abstract redis.clients.jedis.Response psetex(byte[] p0, long p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response set(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.Response set(byte[] p0, byte[] p1, redis.clients.jedis.params.SetParams p2)`
- `public abstract redis.clients.jedis.Response setGet(byte[] p0, byte[] p1, redis.clients.jedis.params.SetParams p2)`
- `public abstract redis.clients.jedis.Response setbit(byte[] p0, long p1, boolean p2)`
- `public abstract redis.clients.jedis.Response setex(byte[] p0, long p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response setnx(byte[] p0, byte[] p1)`
- `public abstract redis.clients.jedis.Response setrange(byte[] p0, long p1, byte[] p2)`
- `public abstract redis.clients.jedis.Response strAlgoLCSKeys(byte[] p0, byte[] p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public abstract redis.clients.jedis.Response strlen(byte[] p0)`
- `public abstract redis.clients.jedis.Response substr(byte[] p0, int p1, int p2)`

---

## public abstract interface `redis.clients.jedis.commands.StringPipelineCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response append(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response bitcount(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response bitcount(java.lang.String p0, long p1, long p2)`
- `public abstract redis.clients.jedis.Response bitcount(java.lang.String p0, long p1, long p2, redis.clients.jedis.args.BitCountOption p3)`
- `public abstract redis.clients.jedis.Response bitfield(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response bitfieldReadonly(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response bitop(redis.clients.jedis.args.BitOP p0, java.lang.String p1, java.lang.String... p2)`
- `public abstract redis.clients.jedis.Response bitpos(java.lang.String p0, boolean p1)`
- `public abstract redis.clients.jedis.Response bitpos(java.lang.String p0, boolean p1, redis.clients.jedis.params.BitPosParams p2)`
- `public abstract redis.clients.jedis.Response decr(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response decrBy(java.lang.String p0, long p1)`
- `public abstract redis.clients.jedis.Response get(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response getDel(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response getEx(java.lang.String p0, redis.clients.jedis.params.GetExParams p1)`
- `public abstract redis.clients.jedis.Response getSet(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response getbit(java.lang.String p0, long p1)`
- `public abstract redis.clients.jedis.Response getrange(java.lang.String p0, long p1, long p2)`
- `public abstract redis.clients.jedis.Response incr(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response incrBy(java.lang.String p0, long p1)`
- `public abstract redis.clients.jedis.Response incrByFloat(java.lang.String p0, double p1)`
- `public abstract redis.clients.jedis.Response lcs(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.LCSParams p2)`
- `public abstract redis.clients.jedis.Response mget(java.lang.String... p0)`
- `public abstract redis.clients.jedis.Response mset(java.lang.String... p0)`
- `public abstract redis.clients.jedis.Response msetnx(java.lang.String... p0)`
- `public abstract redis.clients.jedis.Response psetex(java.lang.String p0, long p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response set(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response set(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.SetParams p2)`
- `public abstract redis.clients.jedis.Response setGet(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.SetParams p2)`
- `public abstract redis.clients.jedis.Response setbit(java.lang.String p0, long p1, boolean p2)`
- `public abstract redis.clients.jedis.Response setex(java.lang.String p0, long p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response setnx(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response setrange(java.lang.String p0, long p1, java.lang.String p2)`
- `public abstract redis.clients.jedis.Response strAlgoLCSKeys(java.lang.String p0, java.lang.String p1, redis.clients.jedis.params.StrAlgoLCSParams p2)`
- `public abstract redis.clients.jedis.Response strlen(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response substr(java.lang.String p0, int p1, int p2)`

---

## public class `redis.clients.jedis.exceptions.AbortedTransactionException`
extends `redis.clients.jedis.exceptions.JedisDataException`  

**Constructors:**
- `public AbortedTransactionException(java.lang.String p0)`
- `public AbortedTransactionException(java.lang.String p0, java.lang.Throwable p1)`
- `public AbortedTransactionException(java.lang.Throwable p0)`

---

## public class `redis.clients.jedis.exceptions.InvalidURIException`
extends `redis.clients.jedis.exceptions.JedisException`  

**Constructors:**
- `public InvalidURIException(java.lang.String p0)`
- `public InvalidURIException(java.lang.String p0, java.lang.Throwable p1)`
- `public InvalidURIException(java.lang.Throwable p0)`

---

## public class `redis.clients.jedis.exceptions.JedisAccessControlException`
extends `redis.clients.jedis.exceptions.JedisDataException`  

**Constructors:**
- `public JedisAccessControlException(java.lang.String p0)`
- `public JedisAccessControlException(java.lang.String p0, java.lang.Throwable p1)`
- `public JedisAccessControlException(java.lang.Throwable p0)`

---

## public class `redis.clients.jedis.exceptions.JedisAskDataException`
extends `redis.clients.jedis.exceptions.JedisRedirectionException`  

**Constructors:**
- `public JedisAskDataException(java.lang.String p0, java.lang.Throwable p1, redis.clients.jedis.HostAndPort p2, int p3)`
- `public JedisAskDataException(java.lang.String p0, redis.clients.jedis.HostAndPort p1, int p2)`
- `public JedisAskDataException(java.lang.Throwable p0, redis.clients.jedis.HostAndPort p1, int p2)`

---

## public class `redis.clients.jedis.exceptions.JedisBusyException`
extends `redis.clients.jedis.exceptions.JedisDataException`  

**Constructors:**
- `public JedisBusyException(java.lang.String p0)`
- `public JedisBusyException(java.lang.String p0, java.lang.Throwable p1)`
- `public JedisBusyException(java.lang.Throwable p0)`

---

## public class `redis.clients.jedis.exceptions.JedisClusterException`
extends `redis.clients.jedis.exceptions.JedisDataException`  

**Constructors:**
- `public JedisClusterException(java.lang.String p0)`
- `public JedisClusterException(java.lang.String p0, java.lang.Throwable p1)`
- `public JedisClusterException(java.lang.Throwable p0)`

---

## public class `redis.clients.jedis.exceptions.JedisClusterOperationException`
extends `redis.clients.jedis.exceptions.JedisException`  

**Constructors:**
- `public JedisClusterOperationException(java.lang.String p0)`
- `public JedisClusterOperationException(java.lang.String p0, java.lang.Throwable p1)`
- `public JedisClusterOperationException(java.lang.Throwable p0)`

---

## public class `redis.clients.jedis.exceptions.JedisConnectionException`
extends `redis.clients.jedis.exceptions.JedisException`  

**Constructors:**
- `public JedisConnectionException(java.lang.String p0)`
- `public JedisConnectionException(java.lang.String p0, java.lang.Throwable p1)`
- `public JedisConnectionException(java.lang.Throwable p0)`

---

## public class `redis.clients.jedis.exceptions.JedisDataException`
extends `redis.clients.jedis.exceptions.JedisException`  

**Constructors:**
- `public JedisDataException(java.lang.String p0)`
- `public JedisDataException(java.lang.String p0, java.lang.Throwable p1)`
- `public JedisDataException(java.lang.Throwable p0)`

---

## public class `redis.clients.jedis.exceptions.JedisException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public JedisException(java.lang.String p0)`
- `public JedisException(java.lang.String p0, java.lang.Throwable p1)`
- `public JedisException(java.lang.Throwable p0)`

---

## public class `redis.clients.jedis.exceptions.JedisMovedDataException`
extends `redis.clients.jedis.exceptions.JedisRedirectionException`  

**Constructors:**
- `public JedisMovedDataException(java.lang.String p0, java.lang.Throwable p1, redis.clients.jedis.HostAndPort p2, int p3)`
- `public JedisMovedDataException(java.lang.String p0, redis.clients.jedis.HostAndPort p1, int p2)`
- `public JedisMovedDataException(java.lang.Throwable p0, redis.clients.jedis.HostAndPort p1, int p2)`

---

## public class `redis.clients.jedis.exceptions.JedisNoScriptException`
extends `redis.clients.jedis.exceptions.JedisDataException`  

**Constructors:**
- `public JedisNoScriptException(java.lang.String p0)`
- `public JedisNoScriptException(java.lang.String p0, java.lang.Throwable p1)`
- `public JedisNoScriptException(java.lang.Throwable p0)`

---

## public class `redis.clients.jedis.exceptions.JedisRedirectionException`
extends `redis.clients.jedis.exceptions.JedisDataException`  

**Constructors:**
- `public JedisRedirectionException(java.lang.String p0, java.lang.Throwable p1, redis.clients.jedis.HostAndPort p2, int p3)`
- `public JedisRedirectionException(java.lang.String p0, redis.clients.jedis.HostAndPort p1, int p2)`
- `public JedisRedirectionException(java.lang.Throwable p0, redis.clients.jedis.HostAndPort p1, int p2)`

**Methods:**
- `public final int getSlot()`
- `public final redis.clients.jedis.HostAndPort getTargetNode()`

---

## public class `redis.clients.jedis.executors.ClusterCommandExecutor`
implements `redis.clients.jedis.executors.CommandExecutor`  

**Constructors:**
- `public ClusterCommandExecutor(redis.clients.jedis.providers.ClusterConnectionProvider p0, int p1, java.time.Duration p2)`

**Fields:**
- `protected final int maxAttempts`
- `protected final java.time.Duration maxTotalRetriesDuration`
- `public final redis.clients.jedis.providers.ClusterConnectionProvider provider`

**Methods:**
- `public void close()`
- `protected <T extends java.lang.Object> T execute(redis.clients.jedis.Connection p0, redis.clients.jedis.CommandObject p1)`
- `public final <T extends java.lang.Object> T executeCommand(redis.clients.jedis.CommandObject p0)`
- `protected void sleep(long p0)`

---

## public abstract interface `redis.clients.jedis.executors.CommandExecutor`
implements `java.lang.AutoCloseable`  

**Methods:**
- `public abstract <T extends java.lang.Object> T executeCommand(redis.clients.jedis.CommandObject p0)`

---

## public class `redis.clients.jedis.executors.DefaultCommandExecutor`
implements `redis.clients.jedis.executors.CommandExecutor`  

**Constructors:**
- `public DefaultCommandExecutor(redis.clients.jedis.providers.ConnectionProvider p0)`

**Fields:**
- `protected final redis.clients.jedis.providers.ConnectionProvider provider`

**Methods:**
- `public void close()`
- `public final <T extends java.lang.Object> T executeCommand(redis.clients.jedis.CommandObject p0)`

---

## public class `redis.clients.jedis.executors.RetryableCommandExecutor`
implements `redis.clients.jedis.executors.CommandExecutor`  

**Constructors:**
- `public RetryableCommandExecutor(redis.clients.jedis.providers.ConnectionProvider p0, int p1, java.time.Duration p2)`

**Fields:**
- `protected final int maxAttempts`
- `protected final java.time.Duration maxTotalRetriesDuration`
- `protected final redis.clients.jedis.providers.ConnectionProvider provider`

**Methods:**
- `public void close()`
- `protected <T extends java.lang.Object> T execute(redis.clients.jedis.Connection p0, redis.clients.jedis.CommandObject p1)`
- `public final <T extends java.lang.Object> T executeCommand(redis.clients.jedis.CommandObject p0)`
- `protected void sleep(long p0)`

---

## public class `redis.clients.jedis.executors.SimpleCommandExecutor`
implements `redis.clients.jedis.executors.CommandExecutor`  

**Constructors:**
- `public SimpleCommandExecutor(redis.clients.jedis.Connection p0)`

**Fields:**
- `protected final redis.clients.jedis.Connection connection`

**Methods:**
- `public void close()`
- `public final <T extends java.lang.Object> T executeCommand(redis.clients.jedis.CommandObject p0)`

---

## public class `redis.clients.jedis.graph.GraphCommandObjects`

**Constructors:**
- `public GraphCommandObjects(redis.clients.jedis.Connection p0)`
- `public GraphCommandObjects(redis.clients.jedis.graph.RedisGraphCommands p0)`
- `public GraphCommandObjects(redis.clients.jedis.providers.ConnectionProvider p0)`

**Methods:**
- `public final redis.clients.jedis.CommandObject graphDelete(java.lang.String p0)`
- `public final redis.clients.jedis.CommandObject graphQuery(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject graphQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public final redis.clients.jedis.CommandObject graphQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2, long p3)`
- `public final redis.clients.jedis.CommandObject graphQuery(java.lang.String p0, java.lang.String p1, long p2)`
- `public final redis.clients.jedis.CommandObject graphReadonlyQuery(java.lang.String p0, java.lang.String p1)`
- `public final redis.clients.jedis.CommandObject graphReadonlyQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public final redis.clients.jedis.CommandObject graphReadonlyQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2, long p3)`
- `public final redis.clients.jedis.CommandObject graphReadonlyQuery(java.lang.String p0, java.lang.String p1, long p2)`

---

## public class `redis.clients.jedis.graph.GraphProtocol`

**Constructors:**
- `public GraphProtocol()`

---

## public final static enum `redis.clients.jedis.graph.GraphProtocol$GraphCommand`
extends `java.lang.Enum`  
implements `redis.clients.jedis.commands.ProtocolCommand`  

**Fields:**
- `public final static redis.clients.jedis.graph.GraphProtocol$GraphCommand CONFIG`
- `public final static redis.clients.jedis.graph.GraphProtocol$GraphCommand DELETE`
- `public final static redis.clients.jedis.graph.GraphProtocol$GraphCommand EXPLAIN`
- `public final static redis.clients.jedis.graph.GraphProtocol$GraphCommand LIST`
- `public final static redis.clients.jedis.graph.GraphProtocol$GraphCommand PROFILE`
- `public final static redis.clients.jedis.graph.GraphProtocol$GraphCommand QUERY`
- `public final static redis.clients.jedis.graph.GraphProtocol$GraphCommand RO_QUERY`
- `public final static redis.clients.jedis.graph.GraphProtocol$GraphCommand SLOWLOG`

**Methods:**
- `public byte[] getRaw()`

---

## public final static enum `redis.clients.jedis.graph.GraphProtocol$GraphKeyword`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.graph.GraphProtocol$GraphKeyword CYPHER`
- `public final static redis.clients.jedis.graph.GraphProtocol$GraphKeyword GET`
- `public final static redis.clients.jedis.graph.GraphProtocol$GraphKeyword SET`
- `public final static redis.clients.jedis.graph.GraphProtocol$GraphKeyword TIMEOUT`
- `public final static redis.clients.jedis.graph.GraphProtocol$GraphKeyword __COMPACT`

**Methods:**
- `public byte[] getRaw()`

---

## public class `redis.clients.jedis.graph.GraphQueryParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public GraphQueryParams()`
- `public GraphQueryParams(java.lang.String p0)`

**Methods:**
- `public redis.clients.jedis.graph.GraphQueryParams addParam(java.lang.String p0, java.lang.Object p1)`
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.CommandArguments getArguments(java.lang.String p0)`
- `public redis.clients.jedis.graph.GraphQueryParams params(java.util.Map p0)`
- `public redis.clients.jedis.graph.GraphQueryParams query(java.lang.String p0)`
- `public static redis.clients.jedis.graph.GraphQueryParams queryParams()`
- `public static redis.clients.jedis.graph.GraphQueryParams queryParams(java.lang.String p0)`
- `public redis.clients.jedis.graph.GraphQueryParams readonly()`
- `public redis.clients.jedis.graph.GraphQueryParams readonly(boolean p0)`
- `public redis.clients.jedis.graph.GraphQueryParams timeout(long p0)`

---

## public abstract interface `redis.clients.jedis.graph.Header`

**Methods:**
- `public abstract java.util.List getSchemaNames()`
- `public abstract java.util.List getSchemaTypes()`

---

## public abstract interface `redis.clients.jedis.graph.Record`

**Methods:**
- `public abstract boolean containsKey(java.lang.String p0)`
- `public abstract java.lang.String getString(int p0)`
- `public abstract java.lang.String getString(java.lang.String p0)`
- `public abstract <T extends java.lang.Object> T getValue(int p0)`
- `public abstract <T extends java.lang.Object> T getValue(java.lang.String p0)`
- `public abstract java.util.List keys()`
- `public abstract int size()`
- `public abstract java.util.List values()`

---

## public abstract interface `redis.clients.jedis.graph.RedisGraphCommands`

**Methods:**
- `public abstract java.util.Map graphConfigGet(java.lang.String p0)`
- `public abstract java.lang.String graphConfigSet(java.lang.String p0, java.lang.Object p1)`
- `public abstract java.lang.String graphDelete(java.lang.String p0)`
- `public abstract java.util.List graphExplain(java.lang.String p0, java.lang.String p1)`
- `public abstract java.util.List graphList()`
- `public abstract java.util.List graphProfile(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.graph.ResultSet graphQuery(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.graph.ResultSet graphQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public abstract redis.clients.jedis.graph.ResultSet graphQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2, long p3)`
- `public abstract redis.clients.jedis.graph.ResultSet graphQuery(java.lang.String p0, java.lang.String p1, long p2)`
- `public abstract redis.clients.jedis.graph.ResultSet graphReadonlyQuery(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.graph.ResultSet graphReadonlyQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public abstract redis.clients.jedis.graph.ResultSet graphReadonlyQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2, long p3)`
- `public abstract redis.clients.jedis.graph.ResultSet graphReadonlyQuery(java.lang.String p0, java.lang.String p1, long p2)`
- `public abstract java.util.List graphSlowlog(java.lang.String p0)`

---

## public abstract interface `redis.clients.jedis.graph.RedisGraphPipelineCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response graphDelete(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response graphProfile(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response graphQuery(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response graphQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public abstract redis.clients.jedis.Response graphQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2, long p3)`
- `public abstract redis.clients.jedis.Response graphQuery(java.lang.String p0, java.lang.String p1, long p2)`
- `public abstract redis.clients.jedis.Response graphReadonlyQuery(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response graphReadonlyQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public abstract redis.clients.jedis.Response graphReadonlyQuery(java.lang.String p0, java.lang.String p1, java.util.Map p2, long p3)`
- `public abstract redis.clients.jedis.Response graphReadonlyQuery(java.lang.String p0, java.lang.String p1, long p2)`

---

## public class `redis.clients.jedis.graph.RedisGraphQueryUtil`

**Fields:**
- `public final static java.lang.String COMPACT_STRING`
- `public final static java.util.List DUMMY_LIST`
- `public final static java.util.Map DUMMY_MAP`
- `public final static java.lang.String TIMEOUT_STRING`

**Methods:**
- `public static java.lang.String prepareQuery(java.lang.String p0, java.util.Map p1)`

---

## public abstract interface `redis.clients.jedis.graph.ResultSet`
implements `java.lang.Iterable<redis.clients.jedis.graph.Record>`  

**Methods:**
- `public abstract redis.clients.jedis.graph.Header getHeader()`
- `public abstract redis.clients.jedis.graph.Statistics getStatistics()`
- `public abstract int size()`

---

## public final static enum `redis.clients.jedis.graph.ResultSet$ColumnType`
extends `java.lang.Enum`  

**Fields:**
- `public final static redis.clients.jedis.graph.ResultSet$ColumnType NODE`
- `public final static redis.clients.jedis.graph.ResultSet$ColumnType RELATION`
- `public final static redis.clients.jedis.graph.ResultSet$ColumnType SCALAR`
- `public final static redis.clients.jedis.graph.ResultSet$ColumnType UNKNOWN`

---

## public abstract interface `redis.clients.jedis.graph.Statistics`

**Methods:**
- `public abstract boolean cachedExecution()`
- `public abstract int indicesCreated()`
- `public abstract int indicesDeleted()`
- `public abstract int labelsAdded()`
- `public abstract int nodesCreated()`
- `public abstract int nodesDeleted()`
- `public abstract int propertiesSet()`
- `public abstract java.lang.String queryIntervalExecutionTime()`
- `public abstract int relationshipsCreated()`
- `public abstract int relationshipsDeleted()`

---

## public class `redis.clients.jedis.graph.entities.Edge`
extends `redis.clients.jedis.graph.entities.GraphEntity`  

**Constructors:**
- `public Edge()`
- `public Edge(int p0)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public long getDestination()`
- `public java.lang.String getRelationshipType()`
- `public long getSource()`
- `public int hashCode()`
- `public void setDestination(long p0)`
- `public void setRelationshipType(java.lang.String p0)`
- `public void setSource(long p0)`
- `public java.lang.String toString()`

---

## public abstract class `redis.clients.jedis.graph.entities.GraphEntity`

**Constructors:**
- `public GraphEntity()`
- `public GraphEntity(int p0)`

**Fields:**
- `protected long id`
- `protected final java.util.Map propertyMap`

**Methods:**
- `public void addProperty(java.lang.String p0, java.lang.Object p1)`
- `public void addProperty(redis.clients.jedis.graph.entities.Property p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.Set getEntityPropertyNames()`
- `public long getId()`
- `public int getNumberOfProperties()`
- `public redis.clients.jedis.graph.entities.Property getProperty(java.lang.String p0)`
- `public int hashCode()`
- `public void removeProperty(java.lang.String p0)`
- `public void setId(long p0)`
- `public abstract java.lang.String toString()`

---

## public class `redis.clients.jedis.graph.entities.Node`
extends `redis.clients.jedis.graph.entities.GraphEntity`  

**Constructors:**
- `public Node()`
- `public Node(int p0, int p1)`

**Methods:**
- `public void addLabel(java.lang.String p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getLabel(int p0)`
- `public int getNumberOfLabels()`
- `public int hashCode()`
- `public void removeLabel(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public final class `redis.clients.jedis.graph.entities.Path`

**Constructors:**
- `public Path(java.util.List p0, java.util.List p1)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public redis.clients.jedis.graph.entities.Node firstNode()`
- `public redis.clients.jedis.graph.entities.Edge getEdge(int p0)`
- `public java.util.List getEdges()`
- `public redis.clients.jedis.graph.entities.Node getNode(int p0)`
- `public java.util.List getNodes()`
- `public int hashCode()`
- `public redis.clients.jedis.graph.entities.Node lastNode()`
- `public int length()`
- `public int nodeCount()`
- `public java.lang.String toString()`

---

## public final class `redis.clients.jedis.graph.entities.Point`

**Constructors:**
- `public Point(double p0, double p1)`
- `public Point(java.util.List p0)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public double getLatitude()`
- `public double getLongitude()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `redis.clients.jedis.graph.entities.Property`<T extends java.lang.Object>

**Constructors:**
- `public Property(java.lang.String p0, T p1)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getName()`
- `public T getValue()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `redis.clients.jedis.json.JsonProtocol`

**Constructors:**
- `public JsonProtocol()`

---

## public final static enum `redis.clients.jedis.json.JsonProtocol$JsonCommand`
extends `java.lang.Enum`  
implements `redis.clients.jedis.commands.ProtocolCommand`  

**Fields:**
- `public final static redis.clients.jedis.json.JsonProtocol$JsonCommand ARRAPPEND`
- `public final static redis.clients.jedis.json.JsonProtocol$JsonCommand ARRINDEX`
- `public final static redis.clients.jedis.json.JsonProtocol$JsonCommand ARRINSERT`
- `public final static redis.clients.jedis.json.JsonProtocol$JsonCommand ARRLEN`
- `public final static redis.clients.jedis.json.JsonProtocol$JsonCommand ARRPOP`
- `public final static redis.clients.jedis.json.JsonProtocol$JsonCommand ARRTRIM`
- `public final static redis.clients.jedis.json.JsonProtocol$JsonCommand CLEAR`
- `public final static redis.clients.jedis.json.JsonProtocol$JsonCommand DEBUG`
- `public final static redis.clients.jedis.json.JsonProtocol$JsonCommand DEL`
- `public final static redis.clients.jedis.json.JsonProtocol$JsonCommand GET`
- `public final static redis.clients.jedis.json.JsonProtocol$JsonCommand MGET`
- `public final static redis.clients.jedis.json.JsonProtocol$JsonCommand NUMINCRBY`
- `public final static redis.clients.jedis.json.JsonProtocol$JsonCommand OBJKEYS`
- `public final static redis.clients.jedis.json.JsonProtocol$JsonCommand OBJLEN`
- `public final static redis.clients.jedis.json.JsonProtocol$JsonCommand RESP`
- `public final static redis.clients.jedis.json.JsonProtocol$JsonCommand SET`
- `public final static redis.clients.jedis.json.JsonProtocol$JsonCommand STRAPPEND`
- `public final static redis.clients.jedis.json.JsonProtocol$JsonCommand STRLEN`
- `public final static redis.clients.jedis.json.JsonProtocol$JsonCommand TOGGLE`
- `public final static redis.clients.jedis.json.JsonProtocol$JsonCommand TYPE`

**Methods:**
- `public byte[] getRaw()`

---

## public class `redis.clients.jedis.json.JsonSetParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public JsonSetParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public static redis.clients.jedis.json.JsonSetParams jsonSetParams()`
- `public redis.clients.jedis.json.JsonSetParams nx()`
- `public redis.clients.jedis.json.JsonSetParams xx()`

---

## public class `redis.clients.jedis.json.Path`

**Constructors:**
- `public Path(java.lang.String p0)`

**Fields:**
- `public final static redis.clients.jedis.json.Path ROOT_PATH`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public static redis.clients.jedis.json.Path of(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public class `redis.clients.jedis.json.Path2`

**Constructors:**
- `public Path2(java.lang.String p0)`

**Fields:**
- `public final static redis.clients.jedis.json.Path2 ROOT_PATH`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public static redis.clients.jedis.json.Path2 of(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public abstract interface `redis.clients.jedis.json.RedisJsonCommands`

**Methods:**
- `public abstract java.lang.Long jsonArrAppend(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object... p2)`
- `public abstract java.util.List jsonArrAppend(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object... p2)`
- `public abstract java.util.List jsonArrAppendWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object... p2)`
- `public abstract long jsonArrIndex(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2)`
- `public abstract java.util.List jsonArrIndex(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public abstract java.util.List jsonArrIndexWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public abstract long jsonArrInsert(java.lang.String p0, redis.clients.jedis.json.Path p1, int p2, java.lang.Object... p3)`
- `public abstract java.util.List jsonArrInsert(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2, java.lang.Object... p3)`
- `public abstract java.util.List jsonArrInsertWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2, java.lang.Object... p3)`
- `public abstract java.lang.Long jsonArrLen(java.lang.String p0)`
- `public abstract java.lang.Long jsonArrLen(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public abstract java.util.List jsonArrLen(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public abstract java.lang.Object jsonArrPop(java.lang.String p0)`
- `public abstract <T extends java.lang.Object> T jsonArrPop(java.lang.String p0, java.lang.Class p1)`
- `public abstract <T extends java.lang.Object> T jsonArrPop(java.lang.String p0, java.lang.Class p1, redis.clients.jedis.json.Path p2)`
- `public abstract <T extends java.lang.Object> T jsonArrPop(java.lang.String p0, java.lang.Class p1, redis.clients.jedis.json.Path p2, int p3)`
- `public abstract java.lang.Object jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public abstract java.lang.Object jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path p1, int p2)`
- `public abstract java.util.List jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public abstract java.util.List jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2)`
- `public abstract java.lang.Long jsonArrTrim(java.lang.String p0, redis.clients.jedis.json.Path p1, int p2, int p3)`
- `public abstract java.util.List jsonArrTrim(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2, int p3)`
- `public abstract long jsonClear(java.lang.String p0)`
- `public abstract long jsonClear(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public abstract long jsonClear(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public abstract long jsonDebugMemory(java.lang.String p0)`
- `public abstract long jsonDebugMemory(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public abstract java.util.List jsonDebugMemory(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public abstract long jsonDel(java.lang.String p0)`
- `public abstract long jsonDel(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public abstract long jsonDel(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public abstract java.lang.Object jsonGet(java.lang.String p0)`
- `public abstract <T extends java.lang.Object> T jsonGet(java.lang.String p0, java.lang.Class p1)`
- `public abstract <T extends java.lang.Object> T jsonGet(java.lang.String p0, java.lang.Class p1, redis.clients.jedis.json.Path... p2)`
- `public abstract java.lang.Object jsonGet(java.lang.String p0, redis.clients.jedis.json.Path2... p1)`
- `public abstract java.lang.Object jsonGet(java.lang.String p0, redis.clients.jedis.json.Path... p1)`
- `public abstract java.lang.String jsonGetAsPlainString(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public default <T extends java.lang.Object> java.util.List jsonMGet(java.lang.Class p0, java.lang.String... p1)`
- `public default java.util.List jsonMGet(java.lang.String... p0)`
- `public abstract <T extends java.lang.Object> java.util.List jsonMGet(redis.clients.jedis.json.Path p0, java.lang.Class p1, java.lang.String... p2)`
- `public abstract java.util.List jsonMGet(redis.clients.jedis.json.Path2 p0, java.lang.String... p1)`
- `public abstract double jsonNumIncrBy(java.lang.String p0, redis.clients.jedis.json.Path p1, double p2)`
- `public abstract org.json.JSONArray jsonNumIncrBy(java.lang.String p0, redis.clients.jedis.json.Path2 p1, double p2)`
- `public abstract java.util.List jsonObjKeys(java.lang.String p0)`
- `public abstract java.util.List jsonObjKeys(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public abstract java.util.List jsonObjKeys(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public abstract java.lang.Long jsonObjLen(java.lang.String p0)`
- `public abstract java.lang.Long jsonObjLen(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public abstract java.util.List jsonObjLen(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public abstract java.util.List jsonResp(java.lang.String p0)`
- `public abstract java.util.List jsonResp(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public abstract java.util.List jsonResp(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public default java.lang.String jsonSet(java.lang.String p0, java.lang.Object p1)`
- `public default java.lang.String jsonSet(java.lang.String p0, java.lang.Object p1, redis.clients.jedis.json.JsonSetParams p2)`
- `public abstract java.lang.String jsonSet(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2)`
- `public abstract java.lang.String jsonSet(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2, redis.clients.jedis.json.JsonSetParams p3)`
- `public abstract java.lang.String jsonSet(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public abstract java.lang.String jsonSet(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2, redis.clients.jedis.json.JsonSetParams p3)`
- `public default java.lang.String jsonSetLegacy(java.lang.String p0, java.lang.Object p1)`
- `public default java.lang.String jsonSetLegacy(java.lang.String p0, java.lang.Object p1, redis.clients.jedis.json.JsonSetParams p2)`
- `public default java.lang.String jsonSetWithEscape(java.lang.String p0, java.lang.Object p1)`
- `public default java.lang.String jsonSetWithEscape(java.lang.String p0, java.lang.Object p1, redis.clients.jedis.json.JsonSetParams p2)`
- `public abstract java.lang.String jsonSetWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public abstract java.lang.String jsonSetWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2, redis.clients.jedis.json.JsonSetParams p3)`
- `public abstract java.lang.String jsonSetWithPlainString(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.String p2)`
- `public abstract long jsonStrAppend(java.lang.String p0, java.lang.Object p1)`
- `public abstract long jsonStrAppend(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2)`
- `public abstract java.util.List jsonStrAppend(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public abstract java.lang.Long jsonStrLen(java.lang.String p0)`
- `public abstract java.lang.Long jsonStrLen(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public abstract java.util.List jsonStrLen(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public abstract java.lang.String jsonToggle(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public abstract java.util.List jsonToggle(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public abstract java.lang.Class jsonType(java.lang.String p0)`
- `public abstract java.lang.Class jsonType(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public abstract java.util.List jsonType(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`

---

## public abstract interface `redis.clients.jedis.json.RedisJsonPipelineCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response jsonArrAppend(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object... p2)`
- `public abstract redis.clients.jedis.Response jsonArrAppend(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object... p2)`
- `public abstract redis.clients.jedis.Response jsonArrAppendWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object... p2)`
- `public abstract redis.clients.jedis.Response jsonArrIndex(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2)`
- `public abstract redis.clients.jedis.Response jsonArrIndex(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public abstract redis.clients.jedis.Response jsonArrIndexWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public abstract redis.clients.jedis.Response jsonArrInsert(java.lang.String p0, redis.clients.jedis.json.Path p1, int p2, java.lang.Object... p3)`
- `public abstract redis.clients.jedis.Response jsonArrInsert(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2, java.lang.Object... p3)`
- `public abstract redis.clients.jedis.Response jsonArrInsertWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2, java.lang.Object... p3)`
- `public abstract redis.clients.jedis.Response jsonArrLen(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response jsonArrLen(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public abstract redis.clients.jedis.Response jsonArrLen(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public abstract redis.clients.jedis.Response jsonArrPop(java.lang.String p0)`
- `public abstract <T extends java.lang.Object> redis.clients.jedis.Response jsonArrPop(java.lang.String p0, java.lang.Class p1)`
- `public abstract <T extends java.lang.Object> redis.clients.jedis.Response jsonArrPop(java.lang.String p0, java.lang.Class p1, redis.clients.jedis.json.Path p2)`
- `public abstract <T extends java.lang.Object> redis.clients.jedis.Response jsonArrPop(java.lang.String p0, java.lang.Class p1, redis.clients.jedis.json.Path p2, int p3)`
- `public abstract redis.clients.jedis.Response jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public abstract redis.clients.jedis.Response jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path p1, int p2)`
- `public abstract redis.clients.jedis.Response jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public abstract redis.clients.jedis.Response jsonArrPop(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2)`
- `public abstract redis.clients.jedis.Response jsonArrTrim(java.lang.String p0, redis.clients.jedis.json.Path p1, int p2, int p3)`
- `public abstract redis.clients.jedis.Response jsonArrTrim(java.lang.String p0, redis.clients.jedis.json.Path2 p1, int p2, int p3)`
- `public abstract redis.clients.jedis.Response jsonClear(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response jsonClear(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public abstract redis.clients.jedis.Response jsonClear(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public abstract redis.clients.jedis.Response jsonDel(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response jsonDel(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public abstract redis.clients.jedis.Response jsonDel(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public abstract redis.clients.jedis.Response jsonGet(java.lang.String p0)`
- `public abstract <T extends java.lang.Object> redis.clients.jedis.Response jsonGet(java.lang.String p0, java.lang.Class p1)`
- `public abstract <T extends java.lang.Object> redis.clients.jedis.Response jsonGet(java.lang.String p0, java.lang.Class p1, redis.clients.jedis.json.Path... p2)`
- `public abstract redis.clients.jedis.Response jsonGet(java.lang.String p0, redis.clients.jedis.json.Path2... p1)`
- `public abstract redis.clients.jedis.Response jsonGet(java.lang.String p0, redis.clients.jedis.json.Path... p1)`
- `public default <T extends java.lang.Object> redis.clients.jedis.Response jsonMGet(java.lang.Class p0, java.lang.String... p1)`
- `public default redis.clients.jedis.Response jsonMGet(java.lang.String... p0)`
- `public abstract <T extends java.lang.Object> redis.clients.jedis.Response jsonMGet(redis.clients.jedis.json.Path p0, java.lang.Class p1, java.lang.String... p2)`
- `public abstract redis.clients.jedis.Response jsonMGet(redis.clients.jedis.json.Path2 p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response jsonNumIncrBy(java.lang.String p0, redis.clients.jedis.json.Path p1, double p2)`
- `public abstract redis.clients.jedis.Response jsonNumIncrBy(java.lang.String p0, redis.clients.jedis.json.Path2 p1, double p2)`
- `public default redis.clients.jedis.Response jsonSet(java.lang.String p0, java.lang.Object p1)`
- `public default redis.clients.jedis.Response jsonSet(java.lang.String p0, java.lang.Object p1, redis.clients.jedis.json.JsonSetParams p2)`
- `public abstract redis.clients.jedis.Response jsonSet(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2)`
- `public abstract redis.clients.jedis.Response jsonSet(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2, redis.clients.jedis.json.JsonSetParams p3)`
- `public abstract redis.clients.jedis.Response jsonSet(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public abstract redis.clients.jedis.Response jsonSet(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2, redis.clients.jedis.json.JsonSetParams p3)`
- `public default redis.clients.jedis.Response jsonSetLegacy(java.lang.String p0, java.lang.Object p1)`
- `public default redis.clients.jedis.Response jsonSetLegacy(java.lang.String p0, java.lang.Object p1, redis.clients.jedis.json.JsonSetParams p2)`
- `public default redis.clients.jedis.Response jsonSetWithEscape(java.lang.String p0, java.lang.Object p1)`
- `public default redis.clients.jedis.Response jsonSetWithEscape(java.lang.String p0, java.lang.Object p1, redis.clients.jedis.json.JsonSetParams p2)`
- `public abstract redis.clients.jedis.Response jsonSetWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public abstract redis.clients.jedis.Response jsonSetWithEscape(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2, redis.clients.jedis.json.JsonSetParams p3)`
- `public abstract redis.clients.jedis.Response jsonStrAppend(java.lang.String p0, java.lang.Object p1)`
- `public abstract redis.clients.jedis.Response jsonStrAppend(java.lang.String p0, redis.clients.jedis.json.Path p1, java.lang.Object p2)`
- `public abstract redis.clients.jedis.Response jsonStrAppend(java.lang.String p0, redis.clients.jedis.json.Path2 p1, java.lang.Object p2)`
- `public abstract redis.clients.jedis.Response jsonStrLen(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response jsonStrLen(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public abstract redis.clients.jedis.Response jsonStrLen(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public abstract redis.clients.jedis.Response jsonToggle(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public abstract redis.clients.jedis.Response jsonToggle(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`
- `public abstract redis.clients.jedis.Response jsonType(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response jsonType(java.lang.String p0, redis.clients.jedis.json.Path p1)`
- `public abstract redis.clients.jedis.Response jsonType(java.lang.String p0, redis.clients.jedis.json.Path2 p1)`

---

## public class `redis.clients.jedis.params.BitPosParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public BitPosParams()`
- `public BitPosParams(long p0)`
- `public BitPosParams(long p0, long p1)`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`

---

## public class `redis.clients.jedis.params.ClientKillParams`
extends `redis.clients.jedis.params.Params`  

**Constructors:**
- `public ClientKillParams()`

**Methods:**
- `public redis.clients.jedis.params.ClientKillParams addr(byte[] p0)`
- `public redis.clients.jedis.params.ClientKillParams addr(java.lang.String p0)`
- `public redis.clients.jedis.params.ClientKillParams addr(java.lang.String p0, int p1)`
- `public static redis.clients.jedis.params.ClientKillParams clientKillParams()`
- `public redis.clients.jedis.params.ClientKillParams id(byte[] p0)`
- `public redis.clients.jedis.params.ClientKillParams id(java.lang.String p0)`
- `public redis.clients.jedis.params.ClientKillParams laddr(java.lang.String p0)`
- `public redis.clients.jedis.params.ClientKillParams laddr(java.lang.String p0, int p1)`
- `public redis.clients.jedis.params.ClientKillParams skipMe(redis.clients.jedis.params.ClientKillParams$SkipMe p0)`
- `public redis.clients.jedis.params.ClientKillParams type(redis.clients.jedis.args.ClientType p0)`
- `public redis.clients.jedis.params.ClientKillParams user(java.lang.String p0)`

---

## public final static enum `redis.clients.jedis.params.ClientKillParams$SkipMe`
extends `java.lang.Enum`  

**Fields:**
- `public final static redis.clients.jedis.params.ClientKillParams$SkipMe NO`
- `public final static redis.clients.jedis.params.ClientKillParams$SkipMe YES`

---

## public class `redis.clients.jedis.params.CommandListFilterByParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public CommandListFilterByParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public static redis.clients.jedis.params.CommandListFilterByParams commandListFilterByParams()`
- `public redis.clients.jedis.params.CommandListFilterByParams filterByAclCat(java.lang.String p0)`
- `public redis.clients.jedis.params.CommandListFilterByParams filterByModule(java.lang.String p0)`
- `public redis.clients.jedis.params.CommandListFilterByParams filterByPattern(java.lang.String p0)`

---

## public class `redis.clients.jedis.params.FailoverParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public FailoverParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public static redis.clients.jedis.params.FailoverParams failoverParams()`
- `public redis.clients.jedis.params.FailoverParams force()`
- `public redis.clients.jedis.params.FailoverParams timeout(long p0)`
- `public redis.clients.jedis.params.FailoverParams to(java.lang.String p0, int p1)`
- `public redis.clients.jedis.params.FailoverParams to(redis.clients.jedis.HostAndPort p0)`

---

## public class `redis.clients.jedis.params.GeoAddParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public GeoAddParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.params.GeoAddParams ch()`
- `public static redis.clients.jedis.params.GeoAddParams geoAddParams()`
- `public redis.clients.jedis.params.GeoAddParams nx()`
- `public redis.clients.jedis.params.GeoAddParams xx()`

---

## public class `redis.clients.jedis.params.GeoRadiusParam`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public GeoRadiusParam()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.params.GeoRadiusParam count(int p0)`
- `public redis.clients.jedis.params.GeoRadiusParam count(int p0, boolean p1)`
- `public static redis.clients.jedis.params.GeoRadiusParam geoRadiusParam()`
- `public redis.clients.jedis.params.GeoRadiusParam sortAscending()`
- `public redis.clients.jedis.params.GeoRadiusParam sortDescending()`
- `public redis.clients.jedis.params.GeoRadiusParam sortingOrder(redis.clients.jedis.args.SortingOrder p0)`
- `public redis.clients.jedis.params.GeoRadiusParam withCoord()`
- `public redis.clients.jedis.params.GeoRadiusParam withDist()`
- `public redis.clients.jedis.params.GeoRadiusParam withHash()`

---

## public class `redis.clients.jedis.params.GeoRadiusStoreParam`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public GeoRadiusStoreParam()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public static redis.clients.jedis.params.GeoRadiusStoreParam geoRadiusStoreParam()`
- `public redis.clients.jedis.params.GeoRadiusStoreParam store(java.lang.String p0)`
- `public redis.clients.jedis.params.GeoRadiusStoreParam storeDist(java.lang.String p0)`

---

## public class `redis.clients.jedis.params.GeoSearchParam`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public GeoSearchParam()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.params.GeoSearchParam asc()`
- `public redis.clients.jedis.params.GeoSearchParam byBox(double p0, double p1, redis.clients.jedis.args.GeoUnit p2)`
- `public redis.clients.jedis.params.GeoSearchParam byRadius(double p0, redis.clients.jedis.args.GeoUnit p1)`
- `public redis.clients.jedis.params.GeoSearchParam count(int p0)`
- `public redis.clients.jedis.params.GeoSearchParam count(int p0, boolean p1)`
- `public redis.clients.jedis.params.GeoSearchParam desc()`
- `public redis.clients.jedis.params.GeoSearchParam fromLonLat(double p0, double p1)`
- `public redis.clients.jedis.params.GeoSearchParam fromLonLat(redis.clients.jedis.GeoCoordinate p0)`
- `public redis.clients.jedis.params.GeoSearchParam fromMember(java.lang.String p0)`
- `public static redis.clients.jedis.params.GeoSearchParam geoSearchParam()`
- `public redis.clients.jedis.params.GeoSearchParam sortingOrder(redis.clients.jedis.args.SortingOrder p0)`
- `public redis.clients.jedis.params.GeoSearchParam withCoord()`
- `public redis.clients.jedis.params.GeoSearchParam withDist()`
- `public redis.clients.jedis.params.GeoSearchParam withHash()`

---

## public class `redis.clients.jedis.params.GetExParams`
extends `redis.clients.jedis.params.Params`  
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public GetExParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.params.GetExParams ex(long p0)`
- `public redis.clients.jedis.params.GetExParams exAt(long p0)`
- `public static redis.clients.jedis.params.GetExParams getExParams()`
- `public redis.clients.jedis.params.GetExParams persist()`
- `public redis.clients.jedis.params.GetExParams px(long p0)`
- `public redis.clients.jedis.params.GetExParams pxAt(long p0)`

---

## public abstract interface `redis.clients.jedis.params.IParams`

**Methods:**
- `public abstract void addParams(redis.clients.jedis.CommandArguments p0)`

---

## public class `redis.clients.jedis.params.LCSParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public LCSParams()`

**Methods:**
- `public static redis.clients.jedis.params.LCSParams LCSParams()`
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.params.LCSParams idx()`
- `public redis.clients.jedis.params.LCSParams len()`
- `public redis.clients.jedis.params.LCSParams minMatchLen(long p0)`
- `public redis.clients.jedis.params.LCSParams withMatchLen()`

---

## public class `redis.clients.jedis.params.LPosParams`
extends `redis.clients.jedis.params.Params`  
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public LPosParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public static redis.clients.jedis.params.LPosParams lPosParams()`
- `public redis.clients.jedis.params.LPosParams maxlen(int p0)`
- `public redis.clients.jedis.params.LPosParams rank(int p0)`

---

## public class `redis.clients.jedis.params.LolwutParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public LolwutParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.params.LolwutParams args(java.lang.String... p0)`
- `public redis.clients.jedis.params.LolwutParams version(int p0)`

---

## public class `redis.clients.jedis.params.MigrateParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public MigrateParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.params.MigrateParams auth(java.lang.String p0)`
- `public redis.clients.jedis.params.MigrateParams auth2(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.params.MigrateParams copy()`
- `public static redis.clients.jedis.params.MigrateParams migrateParams()`
- `public redis.clients.jedis.params.MigrateParams replace()`

---

## public abstract class `redis.clients.jedis.params.Params`

**Constructors:**
- `public Params()`

**Methods:**
- `protected void addParam(java.lang.String p0)`
- `protected void addParam(java.lang.String p0, java.lang.Object p1)`
- `protected boolean contains(java.lang.String p0)`
- `public byte[][] getByteParams()`
- `public <T extends java.lang.Object> T getParam(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public class `redis.clients.jedis.params.RestoreParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public RestoreParams()`

**Methods:**
- `public redis.clients.jedis.params.RestoreParams absTtl()`
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.params.RestoreParams frequency(long p0)`
- `public redis.clients.jedis.params.RestoreParams idleTime(long p0)`
- `public redis.clients.jedis.params.RestoreParams replace()`
- `public static redis.clients.jedis.params.RestoreParams restoreParams()`

---

## public class `redis.clients.jedis.params.ScanParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public ScanParams()`

**Fields:**
- `public final static java.lang.String SCAN_POINTER_START`
- `public final static byte[] SCAN_POINTER_START_BINARY`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public byte[] binaryMatch()`
- `public redis.clients.jedis.params.ScanParams count(java.lang.Integer p0)`
- `public java.lang.String match()`
- `public redis.clients.jedis.params.ScanParams match(byte[] p0)`
- `public redis.clients.jedis.params.ScanParams match(java.lang.String p0)`

---

## public class `redis.clients.jedis.params.SetParams`
extends `redis.clients.jedis.params.Params`  
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public SetParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.params.SetParams ex(long p0)`
- `public redis.clients.jedis.params.SetParams exAt(long p0)`
- `public redis.clients.jedis.params.SetParams get()`
- `public redis.clients.jedis.params.SetParams keepttl()`
- `public redis.clients.jedis.params.SetParams nx()`
- `public redis.clients.jedis.params.SetParams px(long p0)`
- `public redis.clients.jedis.params.SetParams pxAt(long p0)`
- `public static redis.clients.jedis.params.SetParams setParams()`
- `public redis.clients.jedis.params.SetParams xx()`

---

## public class `redis.clients.jedis.params.ShutdownParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public ShutdownParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.params.ShutdownParams force()`
- `public redis.clients.jedis.params.ShutdownParams nosave()`
- `public redis.clients.jedis.params.ShutdownParams now()`
- `public redis.clients.jedis.params.ShutdownParams save()`
- `public redis.clients.jedis.params.ShutdownParams saveMode(redis.clients.jedis.args.SaveMode p0)`
- `public static redis.clients.jedis.params.ShutdownParams shutdownParams()`

---

## public class `redis.clients.jedis.params.SortingParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public SortingParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.params.SortingParams alpha()`
- `public redis.clients.jedis.params.SortingParams asc()`
- `public redis.clients.jedis.params.SortingParams by(byte[] p0)`
- `public redis.clients.jedis.params.SortingParams by(java.lang.String p0)`
- `public redis.clients.jedis.params.SortingParams desc()`
- `public redis.clients.jedis.params.SortingParams get(byte[]... p0)`
- `public redis.clients.jedis.params.SortingParams get(java.lang.String... p0)`
- `public java.util.Collection getParams()`
- `public redis.clients.jedis.params.SortingParams limit(int p0, int p1)`
- `public redis.clients.jedis.params.SortingParams nosort()`
- `public redis.clients.jedis.params.SortingParams sortingOrder(redis.clients.jedis.args.SortingOrder p0)`

---

## public class `redis.clients.jedis.params.StrAlgoLCSParams`
extends `redis.clients.jedis.params.Params`  
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public StrAlgoLCSParams()`

**Methods:**
- `public static redis.clients.jedis.params.StrAlgoLCSParams StrAlgoLCSParams()`
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.params.StrAlgoLCSParams idx()`
- `public redis.clients.jedis.params.StrAlgoLCSParams len()`
- `public redis.clients.jedis.params.StrAlgoLCSParams minMatchLen(long p0)`
- `public redis.clients.jedis.params.StrAlgoLCSParams withMatchLen()`

---

## public class `redis.clients.jedis.params.XAddParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public XAddParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.params.XAddParams approximateTrimming()`
- `public redis.clients.jedis.params.XAddParams exactTrimming()`
- `public redis.clients.jedis.params.XAddParams id(byte[] p0)`
- `public redis.clients.jedis.params.XAddParams id(java.lang.String p0)`
- `public redis.clients.jedis.params.XAddParams id(long p0)`
- `public redis.clients.jedis.params.XAddParams id(long p0, long p1)`
- `public redis.clients.jedis.params.XAddParams id(redis.clients.jedis.StreamEntryID p0)`
- `public redis.clients.jedis.params.XAddParams limit(long p0)`
- `public redis.clients.jedis.params.XAddParams maxLen(long p0)`
- `public redis.clients.jedis.params.XAddParams minId(java.lang.String p0)`
- `public redis.clients.jedis.params.XAddParams noMkStream()`
- `public static redis.clients.jedis.params.XAddParams xAddParams()`

---

## public class `redis.clients.jedis.params.XAutoClaimParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public XAutoClaimParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.params.XAutoClaimParams count(int p0)`
- `public static redis.clients.jedis.params.XAutoClaimParams xAutoClaimParams()`

---

## public class `redis.clients.jedis.params.XClaimParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public XClaimParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.params.XClaimParams force()`
- `public redis.clients.jedis.params.XClaimParams idle(long p0)`
- `public redis.clients.jedis.params.XClaimParams retryCount(int p0)`
- `public redis.clients.jedis.params.XClaimParams time(long p0)`
- `public static redis.clients.jedis.params.XClaimParams xClaimParams()`

---

## public class `redis.clients.jedis.params.XPendingParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public XPendingParams()`
- `public XPendingParams(byte[] p0, byte[] p1, int p2)`
- `public XPendingParams(java.lang.String p0, java.lang.String p1, int p2)`
- `public XPendingParams(redis.clients.jedis.StreamEntryID p0, redis.clients.jedis.StreamEntryID p1, int p2)`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.params.XPendingParams consumer(byte[] p0)`
- `public redis.clients.jedis.params.XPendingParams consumer(java.lang.String p0)`
- `public redis.clients.jedis.params.XPendingParams count(int p0)`
- `public redis.clients.jedis.params.XPendingParams end(redis.clients.jedis.StreamEntryID p0)`
- `public redis.clients.jedis.params.XPendingParams idle(long p0)`
- `public redis.clients.jedis.params.XPendingParams start(redis.clients.jedis.StreamEntryID p0)`
- `public static redis.clients.jedis.params.XPendingParams xPendingParams()`
- `public static redis.clients.jedis.params.XPendingParams xPendingParams(byte[] p0, byte[] p1, int p2)`
- `public static redis.clients.jedis.params.XPendingParams xPendingParams(java.lang.String p0, java.lang.String p1, int p2)`
- `public static redis.clients.jedis.params.XPendingParams xPendingParams(redis.clients.jedis.StreamEntryID p0, redis.clients.jedis.StreamEntryID p1, int p2)`

---

## public class `redis.clients.jedis.params.XReadGroupParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public XReadGroupParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.params.XReadGroupParams block(int p0)`
- `public redis.clients.jedis.params.XReadGroupParams count(int p0)`
- `public redis.clients.jedis.params.XReadGroupParams noAck()`
- `public static redis.clients.jedis.params.XReadGroupParams xReadGroupParams()`

---

## public class `redis.clients.jedis.params.XReadParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public XReadParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.params.XReadParams block(int p0)`
- `public redis.clients.jedis.params.XReadParams count(int p0)`
- `public static redis.clients.jedis.params.XReadParams xReadParams()`

---

## public class `redis.clients.jedis.params.XTrimParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public XTrimParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.params.XTrimParams approximateTrimming()`
- `public redis.clients.jedis.params.XTrimParams exactTrimming()`
- `public redis.clients.jedis.params.XTrimParams limit(long p0)`
- `public redis.clients.jedis.params.XTrimParams maxLen(long p0)`
- `public redis.clients.jedis.params.XTrimParams minId(java.lang.String p0)`
- `public static redis.clients.jedis.params.XTrimParams xTrimParams()`

---

## public class `redis.clients.jedis.params.ZAddParams`
extends `redis.clients.jedis.params.Params`  
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public ZAddParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.params.ZAddParams ch()`
- `public redis.clients.jedis.params.ZAddParams gt()`
- `public redis.clients.jedis.params.ZAddParams lt()`
- `public redis.clients.jedis.params.ZAddParams nx()`
- `public redis.clients.jedis.params.ZAddParams xx()`
- `public static redis.clients.jedis.params.ZAddParams zAddParams()`

---

## public class `redis.clients.jedis.params.ZIncrByParams`
extends `redis.clients.jedis.params.Params`  
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public ZIncrByParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.params.ZIncrByParams nx()`
- `public redis.clients.jedis.params.ZIncrByParams xx()`
- `public static redis.clients.jedis.params.ZIncrByParams zIncrByParams()`

---

## public class `redis.clients.jedis.params.ZParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public ZParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.params.ZParams aggregate(redis.clients.jedis.params.ZParams$Aggregate p0)`
- `public redis.clients.jedis.params.ZParams weights(double... p0)`

---

## public final static enum `redis.clients.jedis.params.ZParams$Aggregate`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.params.ZParams$Aggregate MAX`
- `public final static redis.clients.jedis.params.ZParams$Aggregate MIN`
- `public final static redis.clients.jedis.params.ZParams$Aggregate SUM`

**Methods:**
- `public byte[] getRaw()`

---

## public class `redis.clients.jedis.params.ZRangeParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public ZRangeParams(double p0, double p1)`
- `public ZRangeParams(int p0, int p1)`
- `public ZRangeParams(redis.clients.jedis.Protocol$Keyword p0, byte[] p1, byte[] p2)`
- `public ZRangeParams(redis.clients.jedis.Protocol$Keyword p0, java.lang.String p1, java.lang.String p2)`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.params.ZRangeParams limit(int p0, int p1)`
- `public redis.clients.jedis.params.ZRangeParams rev()`
- `public static redis.clients.jedis.params.ZRangeParams zrangeByLexParams(byte[] p0, byte[] p1)`
- `public static redis.clients.jedis.params.ZRangeParams zrangeByLexParams(java.lang.String p0, java.lang.String p1)`
- `public static redis.clients.jedis.params.ZRangeParams zrangeByScoreParams(double p0, double p1)`
- `public static redis.clients.jedis.params.ZRangeParams zrangeParams(int p0, int p1)`

---

## public class `redis.clients.jedis.providers.ClusterConnectionProvider`
implements `redis.clients.jedis.providers.ConnectionProvider`  

**Constructors:**
- `public ClusterConnectionProvider(java.util.Set p0, redis.clients.jedis.JedisClientConfig p1)`
- `public ClusterConnectionProvider(java.util.Set p0, redis.clients.jedis.JedisClientConfig p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2)`

**Fields:**
- `protected final redis.clients.jedis.JedisClusterInfoCache cache`

**Methods:**
- `public void close()`
- `public redis.clients.jedis.Connection getConnection()`
- `public redis.clients.jedis.Connection getConnection(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.Connection getConnection(redis.clients.jedis.HostAndPort p0)`
- `public redis.clients.jedis.Connection getConnectionFromSlot(int p0)`
- `public redis.clients.jedis.HostAndPort getNode(int p0)`
- `public java.util.Map getNodes()`
- `public void renewSlotCache()`
- `public void renewSlotCache(redis.clients.jedis.Connection p0)`

---

## public abstract interface `redis.clients.jedis.providers.ConnectionProvider`
implements `java.lang.AutoCloseable`  

**Methods:**
- `public abstract redis.clients.jedis.Connection getConnection()`
- `public abstract redis.clients.jedis.Connection getConnection(redis.clients.jedis.CommandArguments p0)`

---

## public class `redis.clients.jedis.providers.ManagedConnectionProvider`
implements `redis.clients.jedis.providers.ConnectionProvider`  

**Constructors:**
- `public ManagedConnectionProvider()`

**Methods:**
- `public void close()`
- `public final redis.clients.jedis.Connection getConnection()`
- `public final redis.clients.jedis.Connection getConnection(redis.clients.jedis.CommandArguments p0)`
- `public final void setConnection(redis.clients.jedis.Connection p0)`

---

## public class `redis.clients.jedis.providers.PooledConnectionProvider`
implements `redis.clients.jedis.providers.ConnectionProvider`  

**Constructors:**
- `public PooledConnectionProvider(org.apache.commons.pool2.PooledObjectFactory p0)`
- `public PooledConnectionProvider(org.apache.commons.pool2.PooledObjectFactory p0, org.apache.commons.pool2.impl.GenericObjectPoolConfig p1)`
- `public PooledConnectionProvider(redis.clients.jedis.HostAndPort p0)`
- `public PooledConnectionProvider(redis.clients.jedis.HostAndPort p0, redis.clients.jedis.JedisClientConfig p1)`
- `public PooledConnectionProvider(redis.clients.jedis.HostAndPort p0, redis.clients.jedis.JedisClientConfig p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2)`

**Methods:**
- `public void close()`
- `public redis.clients.jedis.Connection getConnection()`
- `public redis.clients.jedis.Connection getConnection(redis.clients.jedis.CommandArguments p0)`
- `public final redis.clients.jedis.util.Pool getPool()`

---

## public class `redis.clients.jedis.providers.ShardedConnectionProvider`
implements `redis.clients.jedis.providers.ConnectionProvider`  

**Constructors:**
- `public ShardedConnectionProvider(java.util.List p0)`
- `public ShardedConnectionProvider(java.util.List p0, redis.clients.jedis.JedisClientConfig p1)`
- `public ShardedConnectionProvider(java.util.List p0, redis.clients.jedis.JedisClientConfig p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2)`
- `public ShardedConnectionProvider(java.util.List p0, redis.clients.jedis.JedisClientConfig p1, org.apache.commons.pool2.impl.GenericObjectPoolConfig p2, redis.clients.jedis.util.Hashing p3)`
- `public ShardedConnectionProvider(java.util.List p0, redis.clients.jedis.JedisClientConfig p1, redis.clients.jedis.util.Hashing p2)`

**Methods:**
- `public void close()`
- `public redis.clients.jedis.Connection getConnection()`
- `public redis.clients.jedis.Connection getConnection(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.Connection getConnection(redis.clients.jedis.HostAndPort p0)`
- `public redis.clients.jedis.util.Hashing getHashingAlgo()`
- `public redis.clients.jedis.HostAndPort getNode(java.lang.Long p0)`

---

## public class `redis.clients.jedis.resps.AccessControlLogEntry`
implements `java.io.Serializable`  

**Constructors:**
- `public AccessControlLogEntry(java.util.Map p0)`

**Fields:**
- `public final static java.lang.String AGE_SECONDS`
- `public final static java.lang.String CLIENT_INFO`
- `public final static java.lang.String CONTEXT`
- `public final static java.lang.String COUNT`
- `public final static java.lang.String OBJECT`
- `public final static java.lang.String REASON`
- `public final static java.lang.String USERNAME`

**Methods:**
- `public java.lang.String getAgeSeconds()`
- `public java.util.Map getClientInfo()`
- `public java.lang.String getContext()`
- `public long getCount()`
- `public java.lang.String getObject()`
- `public java.lang.String getReason()`
- `public java.lang.String getUsername()`
- `public java.util.Map getlogEntry()`
- `public java.lang.String toString()`

---

## public class `redis.clients.jedis.resps.AccessControlUser`

**Constructors:**
- `public AccessControlUser()`

**Methods:**
- `public void addChannel(java.lang.String p0)`
- `public void addChannels(java.lang.String p0)`
- `public void addFlag(java.lang.String p0)`
- `public void addKey(java.lang.String p0)`
- `public void addKeys(java.lang.String p0)`
- `public void addPassword(java.lang.String p0)`
- `public java.util.List getChannels()`
- `public java.lang.String getCommands()`
- `public java.util.List getFlags()`
- `public java.util.List getKeys()`
- `public java.util.List getPassword()`
- `public void setCommands(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public class `redis.clients.jedis.resps.CommandDocument`

**Constructors:**
- `public CommandDocument(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.util.List p4)`

**Fields:**
- `public final static redis.clients.jedis.Builder COMMAND_DOCUMENT_BUILDER`

**Methods:**
- `public java.lang.String getComplexity()`
- `public java.lang.String getGroup()`
- `public java.util.List getHistory()`
- `public java.lang.String getSince()`
- `public java.lang.String getSummary()`

---

## public class `redis.clients.jedis.resps.CommandInfo`

**Constructors:**
- `public CommandInfo(long p0, java.util.List p1, long p2, long p3, long p4, java.util.List p5, java.util.List p6, java.util.List p7)`

**Fields:**
- `public final static redis.clients.jedis.Builder COMMAND_INFO_BUILDER`

**Methods:**
- `public java.util.List getAclCategories()`
- `public long getArity()`
- `public long getFirstKey()`
- `public java.util.List getFlags()`
- `public long getLastKey()`
- `public long getStep()`
- `public java.util.List getSubcommands()`
- `public java.util.List getTips()`

---

## public class `redis.clients.jedis.resps.FunctionStats`

**Constructors:**
- `public FunctionStats(java.util.Map p0, java.util.Map p1)`

**Fields:**
- `public final static redis.clients.jedis.Builder FUNCTION_STATS_BUILDER`

**Methods:**
- `public java.util.Map getEngines()`
- `public java.util.Map getRunningScript()`

---

## public class `redis.clients.jedis.resps.GeoRadiusResponse`

**Constructors:**
- `public GeoRadiusResponse(byte[] p0)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public redis.clients.jedis.GeoCoordinate getCoordinate()`
- `public double getDistance()`
- `public byte[] getMember()`
- `public java.lang.String getMemberByString()`
- `public long getRawScore()`
- `public void setCoordinate(redis.clients.jedis.GeoCoordinate p0)`
- `public void setDistance(double p0)`
- `public void setRawScore(long p0)`

---

## public class `redis.clients.jedis.resps.KeyedListElement`
annotations: @java.lang.Deprecated  
extends `redis.clients.jedis.util.KeyValue`  

**Constructors:**
- `public KeyedListElement(byte[] p0, byte[] p1)`
- `public KeyedListElement(java.lang.String p0, java.lang.String p1)`

**Methods:**
- `public java.lang.String getElement()`

---

## public class `redis.clients.jedis.resps.KeyedZSetElement`
extends `redis.clients.jedis.resps.Tuple`  

**Constructors:**
- `public KeyedZSetElement(byte[] p0, byte[] p1, java.lang.Double p2)`
- `public KeyedZSetElement(java.lang.String p0, java.lang.String p1, java.lang.Double p2)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getKey()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `redis.clients.jedis.resps.LCSMatchResult`

**Constructors:**
- `public LCSMatchResult(java.lang.String p0)`
- `public LCSMatchResult(java.lang.String p0, java.util.List p1, long p2)`
- `public LCSMatchResult(java.util.List p0, long p1)`
- `public LCSMatchResult(long p0)`

**Methods:**
- `public long getLen()`
- `public java.lang.String getMatchString()`
- `public java.util.List getMatches()`

---

## public static class `redis.clients.jedis.resps.LCSMatchResult$MatchedPosition`

**Constructors:**
- `public MatchedPosition(redis.clients.jedis.resps.LCSMatchResult$Position p0, redis.clients.jedis.resps.LCSMatchResult$Position p1, long p2)`

**Methods:**
- `public redis.clients.jedis.resps.LCSMatchResult$Position getA()`
- `public redis.clients.jedis.resps.LCSMatchResult$Position getB()`
- `public long getMatchLen()`

---

## public static class `redis.clients.jedis.resps.LCSMatchResult$Position`

**Constructors:**
- `public Position(long p0, long p1)`

**Methods:**
- `public long getEnd()`
- `public long getStart()`

---

## public class `redis.clients.jedis.resps.LibraryInfo`

**Constructors:**
- `public LibraryInfo(java.lang.String p0, java.lang.String p1, java.util.List p2)`
- `public LibraryInfo(java.lang.String p0, java.lang.String p1, java.util.List p2, java.lang.String p3)`

**Fields:**
- `public final static redis.clients.jedis.Builder LIBRARY_BUILDER`

**Methods:**
- `public java.lang.String getEngine()`
- `public java.util.List getFunctions()`
- `public java.lang.String getLibraryCode()`
- `public java.lang.String getLibraryName()`

---

## public class `redis.clients.jedis.resps.ScanResult`<T extends java.lang.Object>

**Constructors:**
- `public ScanResult(byte[] p0, java.util.List p1)`
- `public ScanResult(java.lang.String p0, java.util.List p1)`

**Methods:**
- `public java.lang.String getCursor()`
- `public byte[] getCursorAsBytes()`
- `public java.util.List getResult()`
- `public boolean isCompleteIteration()`

---

## public class `redis.clients.jedis.resps.Slowlog`

**Methods:**
- `public static java.util.List from(java.util.List p0)`
- `public java.util.List getArgs()`
- `public redis.clients.jedis.HostAndPort getClientIpPort()`
- `public java.lang.String getClientName()`
- `public long getExecutionTime()`
- `public long getId()`
- `public long getTimeStamp()`
- `public java.lang.String toString()`

---

## public class `redis.clients.jedis.resps.StreamConsumerFullInfo`
implements `java.io.Serializable`  

**Constructors:**
- `public StreamConsumerFullInfo(java.util.Map p0)`

**Fields:**
- `public final static java.lang.String NAME`
- `public final static java.lang.String PEL_COUNT`
- `public final static java.lang.String PENDING`
- `public final static java.lang.String SEEN_TIME`

**Methods:**
- `public java.util.Map getConsumerInfo()`
- `public java.lang.String getName()`
- `public java.lang.Long getPelCount()`
- `public java.util.List getPending()`
- `public long getSeenTime()`

---

## public class `redis.clients.jedis.resps.StreamConsumersInfo`

**Constructors:**
- `public StreamConsumersInfo(java.util.Map p0)`

**Fields:**
- `public final static java.lang.String IDLE`
- `public final static java.lang.String NAME`
- `public final static java.lang.String PENDING`

**Methods:**
- `public java.util.Map getConsumerInfo()`
- `public long getIdle()`
- `public java.lang.String getName()`
- `public long getPending()`

---

## public class `redis.clients.jedis.resps.StreamEntry`
implements `java.io.Serializable`  

**Constructors:**
- `public StreamEntry(redis.clients.jedis.StreamEntryID p0, java.util.Map p1)`

**Methods:**
- `public java.util.Map getFields()`
- `public redis.clients.jedis.StreamEntryID getID()`
- `public java.lang.String toString()`

---

## public class `redis.clients.jedis.resps.StreamFullInfo`
implements `java.io.Serializable`  

**Constructors:**
- `public StreamFullInfo(java.util.Map p0)`

**Fields:**
- `public final static java.lang.String ENTRIES`
- `public final static java.lang.String GROUPS`
- `public final static java.lang.String LAST_GENERATED_ID`
- `public final static java.lang.String LENGTH`
- `public final static java.lang.String RADIX_TREE_KEYS`
- `public final static java.lang.String RADIX_TREE_NODES`

**Methods:**
- `public java.util.List getEntries()`
- `public java.util.List getGroups()`
- `public redis.clients.jedis.StreamEntryID getLastGeneratedId()`
- `public long getLength()`
- `public long getRadixTreeKeys()`
- `public long getRadixTreeNodes()`
- `public java.util.Map getStreamFullInfo()`

---

## public class `redis.clients.jedis.resps.StreamGroupFullInfo`
implements `java.io.Serializable`  

**Constructors:**
- `public StreamGroupFullInfo(java.util.Map p0)`

**Fields:**
- `public final static java.lang.String CONSUMERS`
- `public final static java.lang.String LAST_DELIVERED`
- `public final static java.lang.String NAME`
- `public final static java.lang.String PEL_COUNT`
- `public final static java.lang.String PENDING`

**Methods:**
- `public java.util.List getConsumers()`
- `public java.util.Map getGroupFullInfo()`
- `public redis.clients.jedis.StreamEntryID getLastDeliveredId()`
- `public java.lang.String getName()`
- `public java.lang.Long getPelCount()`
- `public java.util.List getPending()`

---

## public class `redis.clients.jedis.resps.StreamGroupInfo`
implements `java.io.Serializable`  

**Constructors:**
- `public StreamGroupInfo(java.util.Map p0)`

**Fields:**
- `public final static java.lang.String CONSUMERS`
- `public final static java.lang.String LAST_DELIVERED`
- `public final static java.lang.String NAME`
- `public final static java.lang.String PENDING`

**Methods:**
- `public long getConsumers()`
- `public java.util.Map getGroupInfo()`
- `public redis.clients.jedis.StreamEntryID getLastDeliveredId()`
- `public java.lang.String getName()`
- `public long getPending()`

---

## public class `redis.clients.jedis.resps.StreamInfo`
implements `java.io.Serializable`  

**Constructors:**
- `public StreamInfo(java.util.Map p0)`

**Fields:**
- `public final static java.lang.String FIRST_ENTRY`
- `public final static java.lang.String GROUPS`
- `public final static java.lang.String LAST_ENTRY`
- `public final static java.lang.String LAST_GENERATED_ID`
- `public final static java.lang.String LENGTH`
- `public final static java.lang.String RADIX_TREE_KEYS`
- `public final static java.lang.String RADIX_TREE_NODES`

**Methods:**
- `public redis.clients.jedis.resps.StreamEntry getFirstEntry()`
- `public long getGroups()`
- `public redis.clients.jedis.resps.StreamEntry getLastEntry()`
- `public redis.clients.jedis.StreamEntryID getLastGeneratedId()`
- `public long getLength()`
- `public long getRadixTreeKeys()`
- `public long getRadixTreeNodes()`
- `public java.util.Map getStreamInfo()`

---

## public class `redis.clients.jedis.resps.StreamPendingEntry`
implements `java.io.Serializable`  

**Constructors:**
- `public StreamPendingEntry(redis.clients.jedis.StreamEntryID p0, java.lang.String p1, long p2, long p3)`

**Methods:**
- `public java.lang.String getConsumerName()`
- `public long getDeliveredTimes()`
- `public redis.clients.jedis.StreamEntryID getID()`
- `public long getIdleTime()`
- `public java.lang.String toString()`

---

## public class `redis.clients.jedis.resps.StreamPendingSummary`
implements `java.io.Serializable`  

**Constructors:**
- `public StreamPendingSummary(long p0, redis.clients.jedis.StreamEntryID p1, redis.clients.jedis.StreamEntryID p2, java.util.Map p3)`

**Methods:**
- `public java.util.Map getConsumerMessageCount()`
- `public redis.clients.jedis.StreamEntryID getMaxId()`
- `public redis.clients.jedis.StreamEntryID getMinId()`
- `public long getTotal()`

---

## public class `redis.clients.jedis.resps.Tuple`
implements `java.lang.Comparable<redis.clients.jedis.resps.Tuple>`  

**Constructors:**
- `public Tuple(byte[] p0, java.lang.Double p1)`
- `public Tuple(java.lang.String p0, java.lang.Double p1)`

**Methods:**
- `public static int compare(redis.clients.jedis.resps.Tuple p0, redis.clients.jedis.resps.Tuple p1)`
- `public int compareTo(redis.clients.jedis.resps.Tuple p0)`
- `public boolean equals(java.lang.Object p0)`
- `public byte[] getBinaryElement()`
- `public java.lang.String getElement()`
- `public double getScore()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `redis.clients.jedis.search.Document`
implements `java.io.Serializable`  

**Constructors:**
- `public Document(java.lang.String p0)`
- `public Document(java.lang.String p0, double p1)`
- `public Document(java.lang.String p0, java.util.Map p1)`
- `public Document(java.lang.String p0, java.util.Map p1, double p2)`
- `public Document(java.lang.String p0, java.util.Map p1, double p2, byte[] p3)`

**Methods:**
- `public java.lang.Object get(java.lang.String p0)`
- `public java.lang.String getId()`
- `public byte[] getPayload()`
- `public java.lang.Iterable getProperties()`
- `public double getScore()`
- `public java.lang.String getString(java.lang.String p0)`
- `public boolean hasProperty(java.lang.String p0)`
- `public static redis.clients.jedis.search.Document load(java.lang.String p0, double p1, byte[] p2, java.util.List p3)`
- `public static redis.clients.jedis.search.Document load(java.lang.String p0, double p1, byte[] p2, java.util.List p3, boolean p4)`
- `public redis.clients.jedis.search.Document set(java.lang.String p0, java.lang.Object p1)`
- `public redis.clients.jedis.search.Document setScore(float p0)`
- `public java.lang.String toString()`

---

## public class `redis.clients.jedis.search.FTCreateParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public FTCreateParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.search.FTCreateParams addPrefix(java.lang.String p0)`
- `public static redis.clients.jedis.search.FTCreateParams createParams()`
- `public redis.clients.jedis.search.FTCreateParams filter(java.lang.String p0)`
- `public redis.clients.jedis.search.FTCreateParams language(java.lang.String p0)`
- `public redis.clients.jedis.search.FTCreateParams languageField(java.lang.String p0)`
- `public redis.clients.jedis.search.FTCreateParams maxTextFields()`
- `public redis.clients.jedis.search.FTCreateParams noFields()`
- `public redis.clients.jedis.search.FTCreateParams noFreqs()`
- `public redis.clients.jedis.search.FTCreateParams noHL()`
- `public redis.clients.jedis.search.FTCreateParams noHighlights()`
- `public redis.clients.jedis.search.FTCreateParams noOffsets()`
- `public redis.clients.jedis.search.FTCreateParams noStopwords()`
- `public redis.clients.jedis.search.FTCreateParams on(redis.clients.jedis.search.IndexDataType p0)`
- `public redis.clients.jedis.search.FTCreateParams prefix(java.lang.String... p0)`
- `public redis.clients.jedis.search.FTCreateParams score(double p0)`
- `public redis.clients.jedis.search.FTCreateParams scoreField(java.lang.String p0)`
- `public redis.clients.jedis.search.FTCreateParams skipInitialScan()`
- `public redis.clients.jedis.search.FTCreateParams stopwords(java.lang.String... p0)`
- `public redis.clients.jedis.search.FTCreateParams temporary(long p0)`

---

## public class `redis.clients.jedis.search.FTSearchParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public FTSearchParams()`

**Methods:**
- `public redis.clients.jedis.search.FTSearchParams addParam(java.lang.String p0, java.lang.Object p1)`
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.search.FTSearchParams dialect(int p0)`
- `public redis.clients.jedis.search.FTSearchParams filter(java.lang.String p0, double p1, boolean p2, double p3, boolean p4)`
- `public redis.clients.jedis.search.FTSearchParams filter(java.lang.String p0, double p1, double p2)`
- `public redis.clients.jedis.search.FTSearchParams filter(redis.clients.jedis.search.FTSearchParams$NumericFilter p0)`
- `public redis.clients.jedis.search.FTSearchParams geoFilter(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`
- `public redis.clients.jedis.search.FTSearchParams geoFilter(redis.clients.jedis.search.FTSearchParams$GeoFilter p0)`
- `public boolean getNoContent()`
- `public boolean getWithScores()`
- `public redis.clients.jedis.search.FTSearchParams highlight()`
- `public redis.clients.jedis.search.FTSearchParams highlight(redis.clients.jedis.search.FTSearchParams$HighlightParams p0)`
- `public static redis.clients.jedis.search.FTSearchParams$HighlightParams highlightParams()`
- `public redis.clients.jedis.search.FTSearchParams inFields(java.lang.String... p0)`
- `public redis.clients.jedis.search.FTSearchParams inFields(java.util.Collection p0)`
- `public redis.clients.jedis.search.FTSearchParams inKeys(java.lang.String... p0)`
- `public redis.clients.jedis.search.FTSearchParams inKeys(java.util.Collection p0)`
- `public redis.clients.jedis.search.FTSearchParams inOrder()`
- `public redis.clients.jedis.search.FTSearchParams language(java.lang.String p0)`
- `public redis.clients.jedis.search.FTSearchParams limit(int p0, int p1)`
- `public redis.clients.jedis.search.FTSearchParams noContent()`
- `public redis.clients.jedis.search.FTSearchParams noStopwords()`
- `public redis.clients.jedis.search.FTSearchParams params(java.util.Map p0)`
- `public redis.clients.jedis.search.FTSearchParams returnField(redis.clients.jedis.search.FieldName p0)`
- `public redis.clients.jedis.search.FTSearchParams returnFields(java.lang.String... p0)`
- `public redis.clients.jedis.search.FTSearchParams returnFields(java.util.Collection p0)`
- `public redis.clients.jedis.search.FTSearchParams returnFields(redis.clients.jedis.search.FieldName... p0)`
- `public redis.clients.jedis.search.FTSearchParams scorer(java.lang.String p0)`
- `public static redis.clients.jedis.search.FTSearchParams searchParams()`
- `public redis.clients.jedis.search.FTSearchParams slop(int p0)`
- `public redis.clients.jedis.search.FTSearchParams sortBy(java.lang.String p0, redis.clients.jedis.args.SortingOrder p1)`
- `public redis.clients.jedis.search.FTSearchParams summarize()`
- `public redis.clients.jedis.search.FTSearchParams summarize(redis.clients.jedis.search.FTSearchParams$SummarizeParams p0)`
- `public static redis.clients.jedis.search.FTSearchParams$SummarizeParams summarizeParams()`
- `public redis.clients.jedis.search.FTSearchParams timeout(long p0)`
- `public redis.clients.jedis.search.FTSearchParams verbatim()`
- `public redis.clients.jedis.search.FTSearchParams withScores()`

---

## public static class `redis.clients.jedis.search.FTSearchParams$GeoFilter`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public GeoFilter(java.lang.String p0, double p1, double p2, double p3, redis.clients.jedis.args.GeoUnit p4)`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`

---

## public static class `redis.clients.jedis.search.FTSearchParams$HighlightParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public HighlightParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.search.FTSearchParams$HighlightParams fields(java.lang.String p0)`
- `public redis.clients.jedis.search.FTSearchParams$HighlightParams fields(java.util.Collection p0)`
- `public redis.clients.jedis.search.FTSearchParams$HighlightParams tags(java.lang.String p0, java.lang.String p1)`

---

## public static class `redis.clients.jedis.search.FTSearchParams$NumericFilter`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public NumericFilter(java.lang.String p0, double p1, boolean p2, double p3, boolean p4)`
- `public NumericFilter(java.lang.String p0, double p1, double p2)`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`

---

## public static class `redis.clients.jedis.search.FTSearchParams$SummarizeParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public SummarizeParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.search.FTSearchParams$SummarizeParams fields(java.lang.String... p0)`
- `public redis.clients.jedis.search.FTSearchParams$SummarizeParams fields(java.util.Collection p0)`
- `public redis.clients.jedis.search.FTSearchParams$SummarizeParams fragSize(int p0)`
- `public redis.clients.jedis.search.FTSearchParams$SummarizeParams fragsNum(int p0)`
- `public redis.clients.jedis.search.FTSearchParams$SummarizeParams separator(java.lang.String p0)`

---

## public class `redis.clients.jedis.search.FieldName`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public FieldName(java.lang.String p0)`
- `public FieldName(java.lang.String p0, java.lang.String p1)`

**Methods:**
- `public int addCommandArguments(redis.clients.jedis.CommandArguments p0)`
- `public int addCommandBinaryArguments(java.util.List p0)`
- `public int addCommandEncodedArguments(java.util.List p0)`
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.search.FieldName as(java.lang.String p0)`
- `public static redis.clients.jedis.search.FieldName[] convert(java.lang.String... p0)`
- `public static redis.clients.jedis.search.FieldName of(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public final enum `redis.clients.jedis.search.IndexDataType`
extends `java.lang.Enum`  

**Fields:**
- `public final static redis.clients.jedis.search.IndexDataType HASH`
- `public final static redis.clients.jedis.search.IndexDataType JSON`

---

## public class `redis.clients.jedis.search.IndexDefinition`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public IndexDefinition()`
- `public IndexDefinition(redis.clients.jedis.search.IndexDefinition$Type p0)`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public java.lang.String getFilter()`
- `public java.lang.String getLanguage()`
- `public java.lang.String getLanguageField()`
- `public java.lang.String getPayloadField()`
- `public java.lang.String[] getPrefixes()`
- `public double getScore()`
- `public java.lang.String getScoreFiled()`
- `public redis.clients.jedis.search.IndexDefinition$Type getType()`
- `public boolean isAsync()`
- `public redis.clients.jedis.search.IndexDefinition setAsync(boolean p0)`
- `public redis.clients.jedis.search.IndexDefinition setFilter(java.lang.String p0)`
- `public redis.clients.jedis.search.IndexDefinition setLanguage(java.lang.String p0)`
- `public redis.clients.jedis.search.IndexDefinition setLanguageField(java.lang.String p0)`
- `public redis.clients.jedis.search.IndexDefinition setPayloadField(java.lang.String p0)`
- `public redis.clients.jedis.search.IndexDefinition setPrefixes(java.lang.String... p0)`
- `public redis.clients.jedis.search.IndexDefinition setScore(double p0)`
- `public redis.clients.jedis.search.IndexDefinition setScoreFiled(java.lang.String p0)`

---

## public final static enum `redis.clients.jedis.search.IndexDefinition$Type`
extends `java.lang.Enum`  

**Fields:**
- `public final static redis.clients.jedis.search.IndexDefinition$Type HASH`
- `public final static redis.clients.jedis.search.IndexDefinition$Type JSON`

---

## public class `redis.clients.jedis.search.IndexOptions`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public IndexOptions(int p0)`

**Fields:**
- `public final static int DEFAULT_FLAGS`
- `public final static int KEEP_FIELD_FLAGS`
- `public final static int KEEP_TERM_FREQUENCIES`
- `public final static int USE_TERM_OFFSETS`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public static redis.clients.jedis.search.IndexOptions defaultOptions()`
- `public redis.clients.jedis.search.IndexDefinition getDefinition()`
- `public redis.clients.jedis.search.IndexOptions setDefinition(redis.clients.jedis.search.IndexDefinition p0)`
- `public redis.clients.jedis.search.IndexOptions setNoStopwords()`
- `public redis.clients.jedis.search.IndexOptions setStopwords(java.lang.String... p0)`
- `public redis.clients.jedis.search.IndexOptions setTemporary(long p0)`

---

## public class `redis.clients.jedis.search.Query`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public Query()`
- `public Query(java.lang.String p0)`

**Methods:**
- `public redis.clients.jedis.search.Query addFilter(redis.clients.jedis.search.Query$Filter p0)`
- `public redis.clients.jedis.search.Query addParam(java.lang.String p0, java.lang.Object p1)`
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.search.Query dialect(int p0)`
- `public boolean getNoContent()`
- `public boolean getWithPayloads()`
- `public boolean getWithScores()`
- `public redis.clients.jedis.search.Query highlightFields(java.lang.String... p0)`
- `public redis.clients.jedis.search.Query highlightFields(redis.clients.jedis.search.Query$HighlightTags p0, java.lang.String... p1)`
- `public redis.clients.jedis.search.Query limit(java.lang.Integer p0, java.lang.Integer p1)`
- `public redis.clients.jedis.search.Query limitFields(java.lang.String... p0)`
- `public redis.clients.jedis.search.Query limitKeys(java.lang.String... p0)`
- `public redis.clients.jedis.search.Query returnFields(java.lang.String... p0)`
- `public redis.clients.jedis.search.Query returnFields(redis.clients.jedis.search.FieldName... p0)`
- `public redis.clients.jedis.search.Query setExpander(java.lang.String p0)`
- `public redis.clients.jedis.search.Query setInOrder()`
- `public redis.clients.jedis.search.Query setLanguage(java.lang.String p0)`
- `public redis.clients.jedis.search.Query setNoContent()`
- `public redis.clients.jedis.search.Query setNoStopwords()`
- `public redis.clients.jedis.search.Query setPayload(byte[] p0)`
- `public redis.clients.jedis.search.Query setScorer(java.lang.String p0)`
- `public redis.clients.jedis.search.Query setSortBy(java.lang.String p0, boolean p1)`
- `public redis.clients.jedis.search.Query setVerbatim()`
- `public redis.clients.jedis.search.Query setWithPayload()`
- `public redis.clients.jedis.search.Query setWithScores()`
- `public redis.clients.jedis.search.Query slop(int p0)`
- `public redis.clients.jedis.search.Query summarizeFields(int p0, int p1, java.lang.String p2, java.lang.String... p3)`
- `public redis.clients.jedis.search.Query summarizeFields(java.lang.String... p0)`
- `public redis.clients.jedis.search.Query timeout(long p0)`

---

## public abstract static class `redis.clients.jedis.search.Query$Filter`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public Filter(java.lang.String p0)`

**Fields:**
- `public final java.lang.String property`

---

## public static class `redis.clients.jedis.search.Query$GeoFilter`
extends `redis.clients.jedis.search.Query$Filter`  

**Constructors:**
- `public GeoFilter(java.lang.String p0, double p1, double p2, double p3, java.lang.String p4)`

**Fields:**
- `public final static java.lang.String FEET`
- `public final static java.lang.String KILOMETERS`
- `public final static java.lang.String METERS`
- `public final static java.lang.String MILES`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`

---

## public static class `redis.clients.jedis.search.Query$HighlightTags`

**Constructors:**
- `public HighlightTags(java.lang.String p0, java.lang.String p1)`

---

## public static class `redis.clients.jedis.search.Query$NumericFilter`
extends `redis.clients.jedis.search.Query$Filter`  

**Constructors:**
- `public NumericFilter(java.lang.String p0, double p1, boolean p2, double p3, boolean p4)`
- `public NumericFilter(java.lang.String p0, double p1, double p2)`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`

---

## public static class `redis.clients.jedis.search.Query$Paging`

**Constructors:**
- `public Paging(int p0, int p1)`

---

## public abstract interface `redis.clients.jedis.search.RediSearchCommands`

**Methods:**
- `public abstract redis.clients.jedis.search.aggr.AggregationResult ftAggregate(java.lang.String p0, redis.clients.jedis.search.aggr.AggregationBuilder p1)`
- `public abstract java.lang.String ftAliasAdd(java.lang.String p0, java.lang.String p1)`
- `public abstract java.lang.String ftAliasDel(java.lang.String p0)`
- `public abstract java.lang.String ftAliasUpdate(java.lang.String p0, java.lang.String p1)`
- `public abstract java.lang.String ftAlter(java.lang.String p0, java.lang.Iterable p1)`
- `public default java.lang.String ftAlter(java.lang.String p0, redis.clients.jedis.search.Schema$Field... p1)`
- `public abstract java.lang.String ftAlter(java.lang.String p0, redis.clients.jedis.search.Schema p1)`
- `public default java.lang.String ftAlter(java.lang.String p0, redis.clients.jedis.search.schemafields.SchemaField... p1)`
- `public abstract java.util.Map ftConfigGet(java.lang.String p0)`
- `public abstract java.util.Map ftConfigGet(java.lang.String p0, java.lang.String p1)`
- `public abstract java.lang.String ftConfigSet(java.lang.String p0, java.lang.String p1)`
- `public abstract java.lang.String ftConfigSet(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public default java.lang.String ftCreate(java.lang.String p0, java.lang.Iterable p1)`
- `public abstract java.lang.String ftCreate(java.lang.String p0, redis.clients.jedis.search.FTCreateParams p1, java.lang.Iterable p2)`
- `public default java.lang.String ftCreate(java.lang.String p0, redis.clients.jedis.search.FTCreateParams p1, redis.clients.jedis.search.schemafields.SchemaField... p2)`
- `public abstract java.lang.String ftCreate(java.lang.String p0, redis.clients.jedis.search.IndexOptions p1, redis.clients.jedis.search.Schema p2)`
- `public default java.lang.String ftCreate(java.lang.String p0, redis.clients.jedis.search.schemafields.SchemaField... p1)`
- `public abstract java.lang.String ftCursorDel(java.lang.String p0, long p1)`
- `public abstract redis.clients.jedis.search.aggr.AggregationResult ftCursorRead(java.lang.String p0, long p1, int p2)`
- `public abstract long ftDictAdd(java.lang.String p0, java.lang.String... p1)`
- `public abstract long ftDictAddBySampleKey(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public abstract long ftDictDel(java.lang.String p0, java.lang.String... p1)`
- `public abstract long ftDictDelBySampleKey(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public abstract java.util.Set ftDictDump(java.lang.String p0)`
- `public abstract java.util.Set ftDictDumpBySampleKey(java.lang.String p0, java.lang.String p1)`
- `public abstract java.lang.String ftDropIndex(java.lang.String p0)`
- `public abstract java.lang.String ftDropIndexDD(java.lang.String p0)`
- `public abstract java.lang.String ftExplain(java.lang.String p0, redis.clients.jedis.search.Query p1)`
- `public abstract java.util.List ftExplainCLI(java.lang.String p0, redis.clients.jedis.search.Query p1)`
- `public abstract java.util.Map ftInfo(java.lang.String p0)`
- `public abstract redis.clients.jedis.search.SearchResult ftSearch(byte[] p0, redis.clients.jedis.search.Query p1)`
- `public default redis.clients.jedis.search.SearchResult ftSearch(java.lang.String p0)`
- `public abstract redis.clients.jedis.search.SearchResult ftSearch(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.search.SearchResult ftSearch(java.lang.String p0, java.lang.String p1, redis.clients.jedis.search.FTSearchParams p2)`
- `public abstract redis.clients.jedis.search.SearchResult ftSearch(java.lang.String p0, redis.clients.jedis.search.Query p1)`
- `public abstract long ftSugAdd(java.lang.String p0, java.lang.String p1, double p2)`
- `public abstract long ftSugAddIncr(java.lang.String p0, java.lang.String p1, double p2)`
- `public abstract boolean ftSugDel(java.lang.String p0, java.lang.String p1)`
- `public abstract java.util.List ftSugGet(java.lang.String p0, java.lang.String p1)`
- `public abstract java.util.List ftSugGet(java.lang.String p0, java.lang.String p1, boolean p2, int p3)`
- `public abstract java.util.List ftSugGetWithScores(java.lang.String p0, java.lang.String p1)`
- `public abstract java.util.List ftSugGetWithScores(java.lang.String p0, java.lang.String p1, boolean p2, int p3)`
- `public abstract long ftSugLen(java.lang.String p0)`
- `public abstract java.util.Map ftSynDump(java.lang.String p0)`
- `public abstract java.lang.String ftSynUpdate(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public abstract java.util.Set ftTagVals(java.lang.String p0, java.lang.String p1)`

---

## public abstract interface `redis.clients.jedis.search.RediSearchPipelineCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response ftAggregate(java.lang.String p0, redis.clients.jedis.search.aggr.AggregationBuilder p1)`
- `public abstract redis.clients.jedis.Response ftAliasAdd(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response ftAliasDel(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response ftAliasUpdate(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response ftAlter(java.lang.String p0, java.lang.Iterable p1)`
- `public default redis.clients.jedis.Response ftAlter(java.lang.String p0, redis.clients.jedis.search.Schema$Field... p1)`
- `public abstract redis.clients.jedis.Response ftAlter(java.lang.String p0, redis.clients.jedis.search.Schema p1)`
- `public default redis.clients.jedis.Response ftAlter(java.lang.String p0, redis.clients.jedis.search.schemafields.SchemaField... p1)`
- `public abstract redis.clients.jedis.Response ftConfigGet(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response ftConfigGet(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response ftConfigSet(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response ftConfigSet(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public default redis.clients.jedis.Response ftCreate(java.lang.String p0, java.lang.Iterable p1)`
- `public abstract redis.clients.jedis.Response ftCreate(java.lang.String p0, redis.clients.jedis.search.FTCreateParams p1, java.lang.Iterable p2)`
- `public default redis.clients.jedis.Response ftCreate(java.lang.String p0, redis.clients.jedis.search.FTCreateParams p1, redis.clients.jedis.search.schemafields.SchemaField... p2)`
- `public abstract redis.clients.jedis.Response ftCreate(java.lang.String p0, redis.clients.jedis.search.IndexOptions p1, redis.clients.jedis.search.Schema p2)`
- `public default redis.clients.jedis.Response ftCreate(java.lang.String p0, redis.clients.jedis.search.schemafields.SchemaField... p1)`
- `public abstract redis.clients.jedis.Response ftCursorDel(java.lang.String p0, long p1)`
- `public abstract redis.clients.jedis.Response ftCursorRead(java.lang.String p0, long p1, int p2)`
- `public abstract redis.clients.jedis.Response ftDictAdd(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response ftDictAddBySampleKey(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public abstract redis.clients.jedis.Response ftDictDel(java.lang.String p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response ftDictDelBySampleKey(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public abstract redis.clients.jedis.Response ftDictDump(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response ftDictDumpBySampleKey(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response ftDropIndex(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response ftDropIndexDD(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response ftExplain(java.lang.String p0, redis.clients.jedis.search.Query p1)`
- `public abstract redis.clients.jedis.Response ftExplainCLI(java.lang.String p0, redis.clients.jedis.search.Query p1)`
- `public abstract redis.clients.jedis.Response ftInfo(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response ftSearch(byte[] p0, redis.clients.jedis.search.Query p1)`
- `public default redis.clients.jedis.Response ftSearch(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response ftSearch(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response ftSearch(java.lang.String p0, java.lang.String p1, redis.clients.jedis.search.FTSearchParams p2)`
- `public abstract redis.clients.jedis.Response ftSearch(java.lang.String p0, redis.clients.jedis.search.Query p1)`
- `public abstract redis.clients.jedis.Response ftSugAdd(java.lang.String p0, java.lang.String p1, double p2)`
- `public abstract redis.clients.jedis.Response ftSugAddIncr(java.lang.String p0, java.lang.String p1, double p2)`
- `public abstract redis.clients.jedis.Response ftSugDel(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response ftSugGet(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response ftSugGet(java.lang.String p0, java.lang.String p1, boolean p2, int p3)`
- `public abstract redis.clients.jedis.Response ftSugGetWithScores(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response ftSugGetWithScores(java.lang.String p0, java.lang.String p1, boolean p2, int p3)`
- `public abstract redis.clients.jedis.Response ftSugLen(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response ftSynDump(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response ftSynUpdate(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public abstract redis.clients.jedis.Response ftTagVals(java.lang.String p0, java.lang.String p1)`

---

## public class `redis.clients.jedis.search.RediSearchUtil`

**Methods:**
- `public static java.util.Map toStringMap(java.util.Map p0)`

---

## public class `redis.clients.jedis.search.Schema`

**Constructors:**
- `public Schema()`

**Fields:**
- `public final java.util.List fields`

**Methods:**
- `public redis.clients.jedis.search.Schema addField(redis.clients.jedis.search.Schema$Field p0)`
- `public redis.clients.jedis.search.Schema addFlatVectorField(java.lang.String p0, java.util.Map p1)`
- `public redis.clients.jedis.search.Schema addGeoField(java.lang.String p0)`
- `public redis.clients.jedis.search.Schema addHNSWVectorField(java.lang.String p0, java.util.Map p1)`
- `public redis.clients.jedis.search.Schema addNumericField(java.lang.String p0)`
- `public redis.clients.jedis.search.Schema addSortableNumericField(java.lang.String p0)`
- `public redis.clients.jedis.search.Schema addSortableTagField(java.lang.String p0, boolean p1)`
- `public redis.clients.jedis.search.Schema addSortableTagField(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.search.Schema addSortableTagField(java.lang.String p0, java.lang.String p1, boolean p2)`
- `public redis.clients.jedis.search.Schema addSortableTextField(java.lang.String p0, double p1)`
- `public redis.clients.jedis.search.Schema addTagField(java.lang.String p0)`
- `public redis.clients.jedis.search.Schema addTagField(java.lang.String p0, boolean p1)`
- `public redis.clients.jedis.search.Schema addTagField(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.search.Schema addTagField(java.lang.String p0, java.lang.String p1, boolean p2)`
- `public redis.clients.jedis.search.Schema addTextField(java.lang.String p0, double p1)`
- `public redis.clients.jedis.search.Schema addVectorField(java.lang.String p0, redis.clients.jedis.search.Schema$VectorField$VectorAlgo p1, java.util.Map p2)`
- `public redis.clients.jedis.search.Schema as(java.lang.String p0)`
- `public static redis.clients.jedis.search.Schema from(redis.clients.jedis.search.Schema$Field... p0)`
- `public java.lang.String toString()`

---

## public static class `redis.clients.jedis.search.Schema$Field`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public Field(java.lang.String p0, redis.clients.jedis.search.Schema$FieldType p1)`
- `public Field(java.lang.String p0, redis.clients.jedis.search.Schema$FieldType p1, boolean p2)`
- `public Field(java.lang.String p0, redis.clients.jedis.search.Schema$FieldType p1, boolean p2, boolean p3)`
- `public Field(redis.clients.jedis.search.FieldName p0, redis.clients.jedis.search.Schema$FieldType p1)`
- `public Field(redis.clients.jedis.search.FieldName p0, redis.clients.jedis.search.Schema$FieldType p1, boolean p2, boolean p3)`

**Fields:**
- `protected final redis.clients.jedis.search.FieldName fieldName`
- `public final java.lang.String name`
- `public final boolean noIndex`
- `public final boolean sortable`
- `public final redis.clients.jedis.search.Schema$FieldType type`

**Methods:**
- `public final void addParams(redis.clients.jedis.CommandArguments p0)`
- `protected void addTypeArgs(redis.clients.jedis.CommandArguments p0)`
- `public void as(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public final static enum `redis.clients.jedis.search.Schema$FieldType`
extends `java.lang.Enum`  

**Fields:**
- `public final static redis.clients.jedis.search.Schema$FieldType GEO`
- `public final static redis.clients.jedis.search.Schema$FieldType NUMERIC`
- `public final static redis.clients.jedis.search.Schema$FieldType TAG`
- `public final static redis.clients.jedis.search.Schema$FieldType TEXT`
- `public final static redis.clients.jedis.search.Schema$FieldType VECTOR`

---

## public static class `redis.clients.jedis.search.Schema$TagField`
extends `redis.clients.jedis.search.Schema$Field`  

**Constructors:**
- `public TagField(java.lang.String p0)`
- `public TagField(java.lang.String p0, boolean p1)`
- `public TagField(java.lang.String p0, boolean p1, boolean p2)`
- `public TagField(java.lang.String p0, java.lang.String p1)`
- `public TagField(java.lang.String p0, java.lang.String p1, boolean p2)`
- `public TagField(java.lang.String p0, java.lang.String p1, boolean p2, boolean p3)`
- `public TagField(redis.clients.jedis.search.FieldName p0, java.lang.String p1, boolean p2)`
- `public TagField(redis.clients.jedis.search.FieldName p0, java.lang.String p1, boolean p2, boolean p3)`

**Methods:**
- `public void addTypeArgs(redis.clients.jedis.CommandArguments p0)`
- `public java.lang.String toString()`

---

## public static class `redis.clients.jedis.search.Schema$TextField`
extends `redis.clients.jedis.search.Schema$Field`  

**Constructors:**
- `public TextField(java.lang.String p0)`
- `public TextField(java.lang.String p0, double p1)`
- `public TextField(java.lang.String p0, double p1, boolean p2)`
- `public TextField(java.lang.String p0, double p1, boolean p2, boolean p3)`
- `public TextField(java.lang.String p0, double p1, boolean p2, boolean p3, boolean p4)`
- `public TextField(java.lang.String p0, double p1, boolean p2, boolean p3, boolean p4, java.lang.String p5)`
- `public TextField(redis.clients.jedis.search.FieldName p0)`
- `public TextField(redis.clients.jedis.search.FieldName p0, double p1, boolean p2, boolean p3, boolean p4, java.lang.String p5)`

**Methods:**
- `protected void addTypeArgs(redis.clients.jedis.CommandArguments p0)`
- `public java.lang.String toString()`

---

## public static class `redis.clients.jedis.search.Schema$VectorField`
extends `redis.clients.jedis.search.Schema$Field`  

**Constructors:**
- `public VectorField(java.lang.String p0, redis.clients.jedis.search.Schema$VectorField$VectorAlgo p1, java.util.Map p2)`

**Methods:**
- `public void addTypeArgs(redis.clients.jedis.CommandArguments p0)`
- `public java.lang.String toString()`

---

## public final static enum `redis.clients.jedis.search.Schema$VectorField$VectorAlgo`
extends `java.lang.Enum`  

**Fields:**
- `public final static redis.clients.jedis.search.Schema$VectorField$VectorAlgo FLAT`
- `public final static redis.clients.jedis.search.Schema$VectorField$VectorAlgo HNSW`

---

## public class `redis.clients.jedis.search.SearchProtocol`

**Constructors:**
- `public SearchProtocol()`

---

## public final static enum `redis.clients.jedis.search.SearchProtocol$SearchCommand`
extends `java.lang.Enum`  
implements `redis.clients.jedis.commands.ProtocolCommand`  

**Fields:**
- `public final static redis.clients.jedis.search.SearchProtocol$SearchCommand AGGREGATE`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchCommand ALIASADD`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchCommand ALIASDEL`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchCommand ALIASUPDATE`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchCommand ALTER`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchCommand CONFIG`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchCommand CREATE`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchCommand CURSOR`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchCommand DICTADD`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchCommand DICTDEL`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchCommand DICTDUMP`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchCommand DROPINDEX`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchCommand EXPLAIN`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchCommand EXPLAINCLI`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchCommand INFO`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchCommand SEARCH`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchCommand SUGADD`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchCommand SUGDEL`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchCommand SUGGET`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchCommand SUGLEN`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchCommand SYNDUMP`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchCommand SYNUPDATE`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchCommand TAGVALS`

**Methods:**
- `public byte[] getRaw()`

---

## public final static enum `redis.clients.jedis.search.SearchProtocol$SearchKeyword`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword ADD`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword APPLY`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword AS`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword ASC`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword ASYNC`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword CASESENSITIVE`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword COUNT`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword DD`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword DEL`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword DESC`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword DIALECT`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword EXPANDER`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword FIELDS`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword FILTER`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword FRAGS`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword FUZZY`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword GEO`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword GEOFILTER`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword GET`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword GROUPBY`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword HIGHLIGHT`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword INCR`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword INFIELDS`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword INKEYS`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword INORDER`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword LANGUAGE`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword LANGUAGE_FIELD`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword LEN`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword LIMIT`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword LOAD`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword MAX`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword MAXIDLE`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword MAXTEXTFIELDS`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword NOCONTENT`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword NOFIELDS`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword NOFREQS`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword NOHL`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword NOINDEX`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword NOOFFSETS`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword NOSTEM`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword NOSTOPWORDS`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword NUMERIC`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword ON`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword PARAMS`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword PAYLOAD`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword PAYLOAD_FIELD`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword PHONETIC`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword PREFIX`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword READ`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword RETURN`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword SCHEMA`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword SCORE`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword SCORER`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword SCORE_FIELD`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword SEPARATOR`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword SET`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword SKIPINITIALSCAN`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword SLOP`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword SORTABLE`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword SORTBY`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword STOPWORDS`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword SUMMARIZE`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword TAG`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword TAGS`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword TEMPORARY`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword TEXT`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword TIMEOUT`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword UNF`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword VECTOR`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword VERBATIM`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword WEIGHT`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword WITHCURSOR`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword WITHPAYLOADS`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword WITHSCORES`
- `public final static redis.clients.jedis.search.SearchProtocol$SearchKeyword WITHSUFFIXTRIE`

**Methods:**
- `public byte[] getRaw()`

---

## public class `redis.clients.jedis.search.SearchResult`

**Methods:**
- `public java.util.List getDocuments()`
- `public long getTotalResults()`

---

## public static class `redis.clients.jedis.search.SearchResult$SearchResultBuilder`
extends `redis.clients.jedis.Builder`  

**Constructors:**
- `public SearchResultBuilder(boolean p0, boolean p1, boolean p2, boolean p3)`

**Methods:**
- `public redis.clients.jedis.search.SearchResult build(java.lang.Object p0)`

---

## public class `redis.clients.jedis.search.aggr.AggregationBuilder`

**Constructors:**
- `public AggregationBuilder()`
- `public AggregationBuilder(java.lang.String p0)`

**Methods:**
- `public redis.clients.jedis.search.aggr.AggregationBuilder apply(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.search.aggr.AggregationBuilder cursor(int p0, long p1)`
- `public redis.clients.jedis.search.aggr.AggregationBuilder dialect(int p0)`
- `public redis.clients.jedis.search.aggr.AggregationBuilder filter(java.lang.String p0)`
- `public java.util.List getArgs()`
- `public java.lang.String getArgsString()`
- `public redis.clients.jedis.search.aggr.AggregationBuilder groupBy(java.lang.String p0, redis.clients.jedis.search.aggr.Reducer... p1)`
- `public redis.clients.jedis.search.aggr.AggregationBuilder groupBy(java.util.Collection p0, java.util.Collection p1)`
- `public redis.clients.jedis.search.aggr.AggregationBuilder groupBy(redis.clients.jedis.search.aggr.Group p0)`
- `public boolean isWithCursor()`
- `public redis.clients.jedis.search.aggr.AggregationBuilder limit(int p0)`
- `public redis.clients.jedis.search.aggr.AggregationBuilder limit(int p0, int p1)`
- `public redis.clients.jedis.search.aggr.AggregationBuilder load(java.lang.String... p0)`
- `public redis.clients.jedis.search.aggr.AggregationBuilder load(redis.clients.jedis.search.FieldName... p0)`
- `public redis.clients.jedis.search.aggr.AggregationBuilder loadAll()`
- `public redis.clients.jedis.search.aggr.AggregationBuilder params(java.util.Map p0)`
- `public void serializeRedisArgs(java.util.List p0)`
- `public redis.clients.jedis.search.aggr.AggregationBuilder sortBy(int p0, redis.clients.jedis.search.aggr.SortedField... p1)`
- `public redis.clients.jedis.search.aggr.AggregationBuilder sortBy(redis.clients.jedis.search.aggr.SortedField... p0)`
- `public redis.clients.jedis.search.aggr.AggregationBuilder sortByAsc(java.lang.String p0)`
- `public redis.clients.jedis.search.aggr.AggregationBuilder sortByDesc(java.lang.String p0)`
- `public redis.clients.jedis.search.aggr.AggregationBuilder timeout(long p0)`
- `public redis.clients.jedis.search.aggr.AggregationBuilder verbatim()`

---

## public class `redis.clients.jedis.search.aggr.AggregationResult`

**Constructors:**
- `public AggregationResult(java.lang.Object p0)`
- `public AggregationResult(java.lang.Object p0, long p1)`

**Fields:**
- `public final long totalResults`

**Methods:**
- `public long getCursorId()`
- `public java.util.List getResults()`
- `public redis.clients.jedis.search.aggr.Row getRow(int p0)`
- `public long getTotalResults()`

---

## public class `redis.clients.jedis.search.aggr.Group`

**Constructors:**
- `public Group(java.lang.String... p0)`

**Methods:**
- `public void addArgs(java.util.List p0)`
- `public java.util.List getArgs()`
- `public redis.clients.jedis.search.aggr.Group limit(redis.clients.jedis.search.aggr.Limit p0)`
- `public redis.clients.jedis.search.aggr.Group reduce(redis.clients.jedis.search.aggr.Reducer p0)`

---

## public class `redis.clients.jedis.search.aggr.Limit`

**Constructors:**
- `public Limit(int p0, int p1)`

**Fields:**
- `public final static redis.clients.jedis.search.aggr.Limit NO_LIMIT`

**Methods:**
- `public void addArgs(java.util.List p0)`
- `public java.util.List getArgs()`

---

## public abstract class `redis.clients.jedis.search.aggr.Reducer`

**Constructors:**
- `protected Reducer()`
- `protected Reducer(java.lang.String p0)`

**Methods:**
- `public void addArgs(java.util.List p0)`
- `public final redis.clients.jedis.search.aggr.Reducer as(java.lang.String p0)`
- `public final java.lang.String getAlias()`
- `public final java.util.List getArgs()`
- `public abstract java.lang.String getName()`
- `protected java.util.List getOwnArgs()`
- `public final redis.clients.jedis.search.aggr.Reducer setAlias(java.lang.String p0)`
- `public final redis.clients.jedis.search.aggr.Reducer setAliasAsField()`

---

## public class `redis.clients.jedis.search.aggr.Reducers`

**Constructors:**
- `public Reducers()`

**Methods:**
- `public static redis.clients.jedis.search.aggr.Reducer avg(java.lang.String p0)`
- `public static redis.clients.jedis.search.aggr.Reducer count()`
- `public static redis.clients.jedis.search.aggr.Reducer count_distinct(java.lang.String p0)`
- `public static redis.clients.jedis.search.aggr.Reducer count_distinctish(java.lang.String p0)`
- `public static redis.clients.jedis.search.aggr.Reducer first_value(java.lang.String p0)`
- `public static redis.clients.jedis.search.aggr.Reducer first_value(java.lang.String p0, redis.clients.jedis.search.aggr.SortedField p1)`
- `public static redis.clients.jedis.search.aggr.Reducer max(java.lang.String p0)`
- `public static redis.clients.jedis.search.aggr.Reducer min(java.lang.String p0)`
- `public static redis.clients.jedis.search.aggr.Reducer quantile(java.lang.String p0, double p1)`
- `public static redis.clients.jedis.search.aggr.Reducer random_sample(java.lang.String p0, int p1)`
- `public static redis.clients.jedis.search.aggr.Reducer stddev(java.lang.String p0)`
- `public static redis.clients.jedis.search.aggr.Reducer sum(java.lang.String p0)`
- `public static redis.clients.jedis.search.aggr.Reducer to_list(java.lang.String p0)`

---

## public class `redis.clients.jedis.search.aggr.Row`

**Constructors:**
- `public Row(java.util.Map p0)`

**Methods:**
- `public boolean containsKey(java.lang.String p0)`
- `public double getDouble(java.lang.String p0)`
- `public long getLong(java.lang.String p0)`
- `public java.lang.String getString(java.lang.String p0)`

---

## public class `redis.clients.jedis.search.aggr.SortedField`

**Constructors:**
- `public SortedField(java.lang.String p0, redis.clients.jedis.search.aggr.SortedField$SortOrder p1)`

**Methods:**
- `public static redis.clients.jedis.search.aggr.SortedField asc(java.lang.String p0)`
- `public static redis.clients.jedis.search.aggr.SortedField desc(java.lang.String p0)`
- `public final java.lang.String getField()`
- `public final java.lang.String getOrder()`

---

## public final static enum `redis.clients.jedis.search.aggr.SortedField$SortOrder`
extends `java.lang.Enum`  

**Fields:**
- `public final static redis.clients.jedis.search.aggr.SortedField$SortOrder ASC`
- `public final static redis.clients.jedis.search.aggr.SortedField$SortOrder DESC`

---

## public class `redis.clients.jedis.search.querybuilder.DisjunctNode`
extends `redis.clients.jedis.search.querybuilder.IntersectNode`  

**Constructors:**
- `public DisjunctNode()`

**Methods:**
- `public java.lang.String toString(redis.clients.jedis.search.querybuilder.Node$Parenthesize p0)`

---

## public class `redis.clients.jedis.search.querybuilder.DisjunctUnionNode`
extends `redis.clients.jedis.search.querybuilder.DisjunctNode`  

**Constructors:**
- `public DisjunctUnionNode()`

**Methods:**
- `protected java.lang.String getJoinString()`

---

## public class `redis.clients.jedis.search.querybuilder.DoubleRangeValue`
extends `redis.clients.jedis.search.querybuilder.RangeValue`  

**Constructors:**
- `public DoubleRangeValue(double p0, double p1)`

**Methods:**
- `protected void appendFrom(java.lang.StringBuilder p0, boolean p1)`
- `protected void appendTo(java.lang.StringBuilder p0, boolean p1)`

---

## public class `redis.clients.jedis.search.querybuilder.GeoValue`
extends `redis.clients.jedis.search.querybuilder.Value`  

**Constructors:**
- `public GeoValue(double p0, double p1, double p2, redis.clients.jedis.args.GeoUnit p3)`

**Methods:**
- `public boolean isCombinable()`
- `public java.lang.String toString()`

---

## public class `redis.clients.jedis.search.querybuilder.IntersectNode`
extends `redis.clients.jedis.search.querybuilder.QueryNode`  

**Constructors:**
- `public IntersectNode()`

**Methods:**
- `protected java.lang.String getJoinString()`

---

## public class `redis.clients.jedis.search.querybuilder.LongRangeValue`
extends `redis.clients.jedis.search.querybuilder.RangeValue`  

**Constructors:**
- `public LongRangeValue(long p0, long p1)`

**Methods:**
- `protected void appendFrom(java.lang.StringBuilder p0, boolean p1)`
- `protected void appendTo(java.lang.StringBuilder p0, boolean p1)`
- `public boolean isCombinable()`

---

## public abstract interface `redis.clients.jedis.search.querybuilder.Node`

**Methods:**
- `public abstract java.lang.String toString()`
- `public abstract java.lang.String toString(redis.clients.jedis.search.querybuilder.Node$Parenthesize p0)`

---

## public final static enum `redis.clients.jedis.search.querybuilder.Node$Parenthesize`
extends `java.lang.Enum`  

**Fields:**
- `public final static redis.clients.jedis.search.querybuilder.Node$Parenthesize ALWAYS`
- `public final static redis.clients.jedis.search.querybuilder.Node$Parenthesize DEFAULT`
- `public final static redis.clients.jedis.search.querybuilder.Node$Parenthesize NEVER`

---

## public class `redis.clients.jedis.search.querybuilder.OptionalNode`
extends `redis.clients.jedis.search.querybuilder.IntersectNode`  

**Constructors:**
- `public OptionalNode()`

**Methods:**
- `public java.lang.String toString(redis.clients.jedis.search.querybuilder.Node$Parenthesize p0)`

---

## public class `redis.clients.jedis.search.querybuilder.QueryBuilders`

**Methods:**
- `public static redis.clients.jedis.search.querybuilder.QueryNode disjunct(java.lang.String p0, java.lang.String... p1)`
- `public static redis.clients.jedis.search.querybuilder.QueryNode disjunct(java.lang.String p0, redis.clients.jedis.search.querybuilder.Value... p1)`
- `public static redis.clients.jedis.search.querybuilder.QueryNode disjunct(redis.clients.jedis.search.querybuilder.Node... p0)`
- `public static redis.clients.jedis.search.querybuilder.QueryNode disjunctUnion(java.lang.String p0, java.lang.String... p1)`
- `public static redis.clients.jedis.search.querybuilder.QueryNode disjunctUnion(java.lang.String p0, redis.clients.jedis.search.querybuilder.Value... p1)`
- `public static redis.clients.jedis.search.querybuilder.QueryNode disjunctUnion(redis.clients.jedis.search.querybuilder.Node... p0)`
- `public static redis.clients.jedis.search.querybuilder.QueryNode intersect(java.lang.String p0, java.lang.String p1)`
- `public static redis.clients.jedis.search.querybuilder.QueryNode intersect(java.lang.String p0, redis.clients.jedis.search.querybuilder.Value... p1)`
- `public static redis.clients.jedis.search.querybuilder.QueryNode intersect(redis.clients.jedis.search.querybuilder.Node... p0)`
- `public static redis.clients.jedis.search.querybuilder.QueryNode optional(java.lang.String p0, redis.clients.jedis.search.querybuilder.Value... p1)`
- `public static redis.clients.jedis.search.querybuilder.QueryNode optional(redis.clients.jedis.search.querybuilder.Node... p0)`
- `public static redis.clients.jedis.search.querybuilder.QueryNode union(java.lang.String p0, java.lang.String... p1)`
- `public static redis.clients.jedis.search.querybuilder.QueryNode union(java.lang.String p0, redis.clients.jedis.search.querybuilder.Value... p1)`
- `public static redis.clients.jedis.search.querybuilder.QueryNode union(redis.clients.jedis.search.querybuilder.Node... p0)`

---

## public abstract class `redis.clients.jedis.search.querybuilder.QueryNode`
implements `redis.clients.jedis.search.querybuilder.Node`  

**Constructors:**
- `public QueryNode()`

**Methods:**
- `public redis.clients.jedis.search.querybuilder.QueryNode add(java.lang.String p0, java.lang.String... p1)`
- `public redis.clients.jedis.search.querybuilder.QueryNode add(java.lang.String p0, java.util.Collection p1)`
- `public redis.clients.jedis.search.querybuilder.QueryNode add(java.lang.String p0, redis.clients.jedis.search.querybuilder.Value... p1)`
- `public redis.clients.jedis.search.querybuilder.QueryNode add(redis.clients.jedis.search.querybuilder.Node... p0)`
- `protected abstract java.lang.String getJoinString()`
- `protected boolean shouldParenthesize(redis.clients.jedis.search.querybuilder.Node$Parenthesize p0)`
- `public java.lang.String toString()`
- `public java.lang.String toString(redis.clients.jedis.search.querybuilder.Node$Parenthesize p0)`

---

## public abstract class `redis.clients.jedis.search.querybuilder.RangeValue`
extends `redis.clients.jedis.search.querybuilder.Value`  

**Constructors:**
- `public RangeValue()`

**Methods:**
- `protected abstract void appendFrom(java.lang.StringBuilder p0, boolean p1)`
- `protected abstract void appendTo(java.lang.StringBuilder p0, boolean p1)`
- `public redis.clients.jedis.search.querybuilder.RangeValue inclusiveMax(boolean p0)`
- `public redis.clients.jedis.search.querybuilder.RangeValue inclusiveMin(boolean p0)`
- `public boolean isCombinable()`
- `public java.lang.String toString()`

---

## public class `redis.clients.jedis.search.querybuilder.UnionNode`
extends `redis.clients.jedis.search.querybuilder.QueryNode`  

**Constructors:**
- `public UnionNode()`

**Methods:**
- `protected java.lang.String getJoinString()`

---

## public abstract class `redis.clients.jedis.search.querybuilder.Value`

**Constructors:**
- `public Value()`

**Methods:**
- `public boolean isCombinable()`
- `public abstract java.lang.String toString()`

---

## public class `redis.clients.jedis.search.querybuilder.ValueNode`
implements `redis.clients.jedis.search.querybuilder.Node`  

**Constructors:**
- `public ValueNode(java.lang.String p0, java.lang.String p1, java.lang.String... p2)`
- `public ValueNode(java.lang.String p0, java.lang.String p1, redis.clients.jedis.search.querybuilder.Value... p2)`

**Methods:**
- `public java.lang.String toString(redis.clients.jedis.search.querybuilder.Node$Parenthesize p0)`

---

## public class `redis.clients.jedis.search.querybuilder.Values`

**Methods:**
- `public static redis.clients.jedis.search.querybuilder.RangeValue between(double p0, double p1)`
- `public static redis.clients.jedis.search.querybuilder.RangeValue between(int p0, int p1)`
- `public static redis.clients.jedis.search.querybuilder.RangeValue eq(double p0)`
- `public static redis.clients.jedis.search.querybuilder.RangeValue eq(int p0)`
- `public static redis.clients.jedis.search.querybuilder.RangeValue ge(double p0)`
- `public static redis.clients.jedis.search.querybuilder.RangeValue ge(int p0)`
- `public static redis.clients.jedis.search.querybuilder.GeoValue geo(redis.clients.jedis.GeoCoordinate p0, double p1, redis.clients.jedis.args.GeoUnit p2)`
- `public static redis.clients.jedis.search.querybuilder.RangeValue gt(double p0)`
- `public static redis.clients.jedis.search.querybuilder.RangeValue gt(int p0)`
- `public static redis.clients.jedis.search.querybuilder.RangeValue le(double p0)`
- `public static redis.clients.jedis.search.querybuilder.RangeValue le(int p0)`
- `public static redis.clients.jedis.search.querybuilder.RangeValue lt(double p0)`
- `public static redis.clients.jedis.search.querybuilder.RangeValue lt(int p0)`
- `public static redis.clients.jedis.search.querybuilder.Value tags(java.lang.String... p0)`
- `public static redis.clients.jedis.search.querybuilder.Value value(java.lang.String p0)`

---

## public class `redis.clients.jedis.search.schemafields.GeoField`
extends `redis.clients.jedis.search.schemafields.SchemaField`  

**Constructors:**
- `public GeoField(java.lang.String p0)`
- `public GeoField(redis.clients.jedis.search.FieldName p0)`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.search.schemafields.GeoField as(java.lang.String p0)`
- `public static redis.clients.jedis.search.schemafields.GeoField of(java.lang.String p0)`
- `public static redis.clients.jedis.search.schemafields.GeoField of(redis.clients.jedis.search.FieldName p0)`

---

## public class `redis.clients.jedis.search.schemafields.NumericField`
extends `redis.clients.jedis.search.schemafields.SchemaField`  

**Constructors:**
- `public NumericField(java.lang.String p0)`
- `public NumericField(redis.clients.jedis.search.FieldName p0)`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.search.schemafields.NumericField as(java.lang.String p0)`
- `public redis.clients.jedis.search.schemafields.NumericField noIndex()`
- `public static redis.clients.jedis.search.schemafields.NumericField of(java.lang.String p0)`
- `public static redis.clients.jedis.search.schemafields.NumericField of(redis.clients.jedis.search.FieldName p0)`
- `public redis.clients.jedis.search.schemafields.NumericField sortable()`

---

## public abstract class `redis.clients.jedis.search.schemafields.SchemaField`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public SchemaField(java.lang.String p0)`
- `public SchemaField(redis.clients.jedis.search.FieldName p0)`

**Fields:**
- `protected final redis.clients.jedis.search.FieldName fieldName`

**Methods:**
- `public redis.clients.jedis.search.schemafields.SchemaField as(java.lang.String p0)`

---

## public class `redis.clients.jedis.search.schemafields.TagField`
extends `redis.clients.jedis.search.schemafields.SchemaField`  

**Constructors:**
- `public TagField(java.lang.String p0)`
- `public TagField(redis.clients.jedis.search.FieldName p0)`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.search.schemafields.TagField as(java.lang.String p0)`
- `public redis.clients.jedis.search.schemafields.TagField caseSensitive()`
- `public redis.clients.jedis.search.schemafields.TagField noIndex()`
- `public static redis.clients.jedis.search.schemafields.TagField of(java.lang.String p0)`
- `public static redis.clients.jedis.search.schemafields.TagField of(redis.clients.jedis.search.FieldName p0)`
- `public redis.clients.jedis.search.schemafields.TagField separator(char p0)`
- `public redis.clients.jedis.search.schemafields.TagField sortable()`
- `public redis.clients.jedis.search.schemafields.TagField sortableUNF()`
- `public redis.clients.jedis.search.schemafields.TagField sortableUnNormalizedForm()`
- `public redis.clients.jedis.search.schemafields.TagField withSuffixTrie()`

---

## public class `redis.clients.jedis.search.schemafields.TextField`
extends `redis.clients.jedis.search.schemafields.SchemaField`  

**Constructors:**
- `public TextField(java.lang.String p0)`
- `public TextField(redis.clients.jedis.search.FieldName p0)`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.search.schemafields.TextField as(java.lang.String p0)`
- `public redis.clients.jedis.search.schemafields.TextField noIndex()`
- `public redis.clients.jedis.search.schemafields.TextField noStem()`
- `public static redis.clients.jedis.search.schemafields.TextField of(java.lang.String p0)`
- `public static redis.clients.jedis.search.schemafields.TextField of(redis.clients.jedis.search.FieldName p0)`
- `public redis.clients.jedis.search.schemafields.TextField phonetic(java.lang.String p0)`
- `public redis.clients.jedis.search.schemafields.TextField sortable()`
- `public redis.clients.jedis.search.schemafields.TextField sortableUNF()`
- `public redis.clients.jedis.search.schemafields.TextField sortableUnNormalizedForm()`
- `public redis.clients.jedis.search.schemafields.TextField weight(double p0)`
- `public redis.clients.jedis.search.schemafields.TextField withSuffixTrie()`

---

## public class `redis.clients.jedis.search.schemafields.VectorField`
extends `redis.clients.jedis.search.schemafields.SchemaField`  

**Constructors:**
- `public VectorField(java.lang.String p0, redis.clients.jedis.search.schemafields.VectorField$VectorAlgorithm p1, java.util.Map p2)`
- `public VectorField(redis.clients.jedis.search.FieldName p0, redis.clients.jedis.search.schemafields.VectorField$VectorAlgorithm p1, java.util.Map p2)`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.search.schemafields.VectorField as(java.lang.String p0)`
- `public static redis.clients.jedis.search.schemafields.VectorField$Builder builder()`

---

## public static class `redis.clients.jedis.search.schemafields.VectorField$Builder`

**Methods:**
- `public redis.clients.jedis.search.schemafields.VectorField$Builder addAttribute(java.lang.String p0, java.lang.Object p1)`
- `public redis.clients.jedis.search.schemafields.VectorField$Builder algorithm(redis.clients.jedis.search.schemafields.VectorField$VectorAlgorithm p0)`
- `public redis.clients.jedis.search.schemafields.VectorField$Builder as(java.lang.String p0)`
- `public redis.clients.jedis.search.schemafields.VectorField$Builder attributes(java.util.Map p0)`
- `public redis.clients.jedis.search.schemafields.VectorField build()`
- `public redis.clients.jedis.search.schemafields.VectorField$Builder fieldName(java.lang.String p0)`
- `public redis.clients.jedis.search.schemafields.VectorField$Builder fieldName(redis.clients.jedis.search.FieldName p0)`

---

## public final static enum `redis.clients.jedis.search.schemafields.VectorField$VectorAlgorithm`
extends `java.lang.Enum`  

**Fields:**
- `public final static redis.clients.jedis.search.schemafields.VectorField$VectorAlgorithm FLAT`
- `public final static redis.clients.jedis.search.schemafields.VectorField$VectorAlgorithm HNSW`

---

## public final enum `redis.clients.jedis.timeseries.AggregationType`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.timeseries.AggregationType AVG`
- `public final static redis.clients.jedis.timeseries.AggregationType COUNT`
- `public final static redis.clients.jedis.timeseries.AggregationType FIRST`
- `public final static redis.clients.jedis.timeseries.AggregationType LAST`
- `public final static redis.clients.jedis.timeseries.AggregationType MAX`
- `public final static redis.clients.jedis.timeseries.AggregationType MIN`
- `public final static redis.clients.jedis.timeseries.AggregationType RANGE`
- `public final static redis.clients.jedis.timeseries.AggregationType STD_P`
- `public final static redis.clients.jedis.timeseries.AggregationType STD_S`
- `public final static redis.clients.jedis.timeseries.AggregationType SUM`
- `public final static redis.clients.jedis.timeseries.AggregationType TWA`
- `public final static redis.clients.jedis.timeseries.AggregationType VAR_P`
- `public final static redis.clients.jedis.timeseries.AggregationType VAR_S`

**Methods:**
- `public byte[] getRaw()`
- `public static redis.clients.jedis.timeseries.AggregationType safeValueOf(java.lang.String p0)`

---

## public final enum `redis.clients.jedis.timeseries.DuplicatePolicy`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.timeseries.DuplicatePolicy BLOCK`
- `public final static redis.clients.jedis.timeseries.DuplicatePolicy FIRST`
- `public final static redis.clients.jedis.timeseries.DuplicatePolicy LAST`
- `public final static redis.clients.jedis.timeseries.DuplicatePolicy MAX`
- `public final static redis.clients.jedis.timeseries.DuplicatePolicy MIN`
- `public final static redis.clients.jedis.timeseries.DuplicatePolicy SUM`

**Methods:**
- `public byte[] getRaw()`

---

## public abstract interface `redis.clients.jedis.timeseries.RedisTimeSeriesCommands`

**Methods:**
- `public abstract long tsAdd(java.lang.String p0, double p1)`
- `public abstract long tsAdd(java.lang.String p0, long p1, double p2)`
- `public abstract long tsAdd(java.lang.String p0, long p1, double p2, redis.clients.jedis.timeseries.TSCreateParams p3)`
- `public abstract java.lang.String tsAlter(java.lang.String p0, redis.clients.jedis.timeseries.TSAlterParams p1)`
- `public abstract java.lang.String tsCreate(java.lang.String p0)`
- `public abstract java.lang.String tsCreate(java.lang.String p0, redis.clients.jedis.timeseries.TSCreateParams p1)`
- `public abstract java.lang.String tsCreateRule(java.lang.String p0, java.lang.String p1, redis.clients.jedis.timeseries.AggregationType p2, long p3)`
- `public abstract java.lang.String tsCreateRule(java.lang.String p0, java.lang.String p1, redis.clients.jedis.timeseries.AggregationType p2, long p3, long p4)`
- `public abstract long tsDecrBy(java.lang.String p0, double p1)`
- `public abstract long tsDecrBy(java.lang.String p0, double p1, long p2)`
- `public abstract long tsDel(java.lang.String p0, long p1, long p2)`
- `public abstract java.lang.String tsDeleteRule(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.timeseries.TSElement tsGet(java.lang.String p0)`
- `public abstract redis.clients.jedis.timeseries.TSElement tsGet(java.lang.String p0, redis.clients.jedis.timeseries.TSGetParams p1)`
- `public abstract long tsIncrBy(java.lang.String p0, double p1)`
- `public abstract long tsIncrBy(java.lang.String p0, double p1, long p2)`
- `public abstract redis.clients.jedis.timeseries.TSInfo tsInfo(java.lang.String p0)`
- `public abstract redis.clients.jedis.timeseries.TSInfo tsInfoDebug(java.lang.String p0)`
- `public abstract java.util.List tsMAdd(java.util.Map$Entry... p0)`
- `public abstract java.util.List tsMGet(redis.clients.jedis.timeseries.TSMGetParams p0, java.lang.String... p1)`
- `public abstract java.util.List tsMRange(long p0, long p1, java.lang.String... p2)`
- `public abstract java.util.List tsMRange(redis.clients.jedis.timeseries.TSMRangeParams p0)`
- `public abstract java.util.List tsMRevRange(long p0, long p1, java.lang.String... p2)`
- `public abstract java.util.List tsMRevRange(redis.clients.jedis.timeseries.TSMRangeParams p0)`
- `public abstract java.util.List tsQueryIndex(java.lang.String... p0)`
- `public abstract java.util.List tsRange(java.lang.String p0, long p1, long p2)`
- `public abstract java.util.List tsRange(java.lang.String p0, redis.clients.jedis.timeseries.TSRangeParams p1)`
- `public abstract java.util.List tsRevRange(java.lang.String p0, long p1, long p2)`
- `public abstract java.util.List tsRevRange(java.lang.String p0, redis.clients.jedis.timeseries.TSRangeParams p1)`

---

## public abstract interface `redis.clients.jedis.timeseries.RedisTimeSeriesPipelineCommands`

**Methods:**
- `public abstract redis.clients.jedis.Response tsAdd(java.lang.String p0, double p1)`
- `public abstract redis.clients.jedis.Response tsAdd(java.lang.String p0, long p1, double p2)`
- `public abstract redis.clients.jedis.Response tsAdd(java.lang.String p0, long p1, double p2, redis.clients.jedis.timeseries.TSCreateParams p3)`
- `public abstract redis.clients.jedis.Response tsAlter(java.lang.String p0, redis.clients.jedis.timeseries.TSAlterParams p1)`
- `public abstract redis.clients.jedis.Response tsCreate(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response tsCreate(java.lang.String p0, redis.clients.jedis.timeseries.TSCreateParams p1)`
- `public abstract redis.clients.jedis.Response tsCreateRule(java.lang.String p0, java.lang.String p1, redis.clients.jedis.timeseries.AggregationType p2, long p3)`
- `public abstract redis.clients.jedis.Response tsCreateRule(java.lang.String p0, java.lang.String p1, redis.clients.jedis.timeseries.AggregationType p2, long p3, long p4)`
- `public abstract redis.clients.jedis.Response tsDecrBy(java.lang.String p0, double p1)`
- `public abstract redis.clients.jedis.Response tsDecrBy(java.lang.String p0, double p1, long p2)`
- `public abstract redis.clients.jedis.Response tsDel(java.lang.String p0, long p1, long p2)`
- `public abstract redis.clients.jedis.Response tsDeleteRule(java.lang.String p0, java.lang.String p1)`
- `public abstract redis.clients.jedis.Response tsGet(java.lang.String p0)`
- `public abstract redis.clients.jedis.Response tsGet(java.lang.String p0, redis.clients.jedis.timeseries.TSGetParams p1)`
- `public abstract redis.clients.jedis.Response tsIncrBy(java.lang.String p0, double p1)`
- `public abstract redis.clients.jedis.Response tsIncrBy(java.lang.String p0, double p1, long p2)`
- `public abstract redis.clients.jedis.Response tsMAdd(java.util.Map$Entry... p0)`
- `public abstract redis.clients.jedis.Response tsMGet(redis.clients.jedis.timeseries.TSMGetParams p0, java.lang.String... p1)`
- `public abstract redis.clients.jedis.Response tsMRange(long p0, long p1, java.lang.String... p2)`
- `public abstract redis.clients.jedis.Response tsMRange(redis.clients.jedis.timeseries.TSMRangeParams p0)`
- `public abstract redis.clients.jedis.Response tsMRevRange(long p0, long p1, java.lang.String... p2)`
- `public abstract redis.clients.jedis.Response tsMRevRange(redis.clients.jedis.timeseries.TSMRangeParams p0)`
- `public abstract redis.clients.jedis.Response tsQueryIndex(java.lang.String... p0)`
- `public abstract redis.clients.jedis.Response tsRange(java.lang.String p0, long p1, long p2)`
- `public abstract redis.clients.jedis.Response tsRange(java.lang.String p0, redis.clients.jedis.timeseries.TSRangeParams p1)`
- `public abstract redis.clients.jedis.Response tsRevRange(java.lang.String p0, long p1, long p2)`
- `public abstract redis.clients.jedis.Response tsRevRange(java.lang.String p0, redis.clients.jedis.timeseries.TSRangeParams p1)`

---

## public class `redis.clients.jedis.timeseries.TSAlterParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public TSAlterParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public static redis.clients.jedis.timeseries.TSAlterParams alterParams()`
- `public redis.clients.jedis.timeseries.TSAlterParams chunkSize(long p0)`
- `public redis.clients.jedis.timeseries.TSAlterParams duplicatePolicy(redis.clients.jedis.timeseries.DuplicatePolicy p0)`
- `public redis.clients.jedis.timeseries.TSAlterParams label(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.timeseries.TSAlterParams labels(java.util.Map p0)`
- `public redis.clients.jedis.timeseries.TSAlterParams labelsReset()`
- `public redis.clients.jedis.timeseries.TSAlterParams retention(long p0)`
- `public redis.clients.jedis.timeseries.TSAlterParams retentionTime(long p0)`

---

## public class `redis.clients.jedis.timeseries.TSCreateParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public TSCreateParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.timeseries.TSCreateParams chunkSize(long p0)`
- `public redis.clients.jedis.timeseries.TSCreateParams compressed()`
- `public static redis.clients.jedis.timeseries.TSCreateParams createParams()`
- `public redis.clients.jedis.timeseries.TSCreateParams duplicatePolicy(redis.clients.jedis.timeseries.DuplicatePolicy p0)`
- `public redis.clients.jedis.timeseries.TSCreateParams label(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.timeseries.TSCreateParams labels(java.util.Map p0)`
- `public redis.clients.jedis.timeseries.TSCreateParams retention(long p0)`
- `public redis.clients.jedis.timeseries.TSCreateParams uncompressed()`

---

## public class `redis.clients.jedis.timeseries.TSElement`

**Constructors:**
- `public TSElement(long p0, double p1)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public long getTimestamp()`
- `public double getValue()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `redis.clients.jedis.timeseries.TSGetParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public TSGetParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public static redis.clients.jedis.timeseries.TSGetParams getParams()`
- `public redis.clients.jedis.timeseries.TSGetParams latest()`

---

## public class `redis.clients.jedis.timeseries.TSInfo`

**Fields:**
- `public static redis.clients.jedis.Builder TIMESERIES_INFO`

**Methods:**
- `public java.util.List getChunks()`
- `public java.lang.Long getIntegerProperty(java.lang.String p0)`
- `public java.lang.String getLabel(java.lang.String p0)`
- `public java.util.Map getLabels()`
- `public java.util.Map getProperties()`
- `public java.lang.Object getProperty(java.lang.String p0)`
- `public redis.clients.jedis.timeseries.TSInfo$Rule getRule(java.lang.String p0)`
- `public java.util.Map getRules()`

---

## public static class `redis.clients.jedis.timeseries.TSInfo$Rule`

**Methods:**
- `public redis.clients.jedis.timeseries.AggregationType getAggregator()`
- `public long getAlignmentTimestamp()`
- `public long getBucketDuration()`
- `public java.lang.String getCompactionKey()`

---

## public class `redis.clients.jedis.timeseries.TSKeyValue`<V extends java.lang.Object>
extends `redis.clients.jedis.util.KeyValue`  

**Constructors:**
- `public TSKeyValue(java.lang.String p0, java.util.Map p1, V p2)`

**Methods:**
- `public java.util.Map getLabels()`

---

## public class `redis.clients.jedis.timeseries.TSKeyedElements`
extends `redis.clients.jedis.timeseries.TSKeyValue`  

**Constructors:**
- `public TSKeyedElements(java.lang.String p0, java.util.Map p1, java.util.List p2)`

---

## public class `redis.clients.jedis.timeseries.TSMGetParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public TSMGetParams()`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.timeseries.TSMGetParams latest()`
- `public static redis.clients.jedis.timeseries.TSMGetParams multiGetParams()`
- `public redis.clients.jedis.timeseries.TSMGetParams selectedLabels(java.lang.String... p0)`
- `public redis.clients.jedis.timeseries.TSMGetParams withLabels()`
- `public redis.clients.jedis.timeseries.TSMGetParams withLabels(boolean p0)`

---

## public class `redis.clients.jedis.timeseries.TSMRangeParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public TSMRangeParams()`
- `public TSMRangeParams(long p0, long p1)`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.timeseries.TSMRangeParams aggregation(redis.clients.jedis.timeseries.AggregationType p0, long p1)`
- `public redis.clients.jedis.timeseries.TSMRangeParams align(long p0)`
- `public redis.clients.jedis.timeseries.TSMRangeParams alignEnd()`
- `public redis.clients.jedis.timeseries.TSMRangeParams alignStart()`
- `public redis.clients.jedis.timeseries.TSMRangeParams bucketTimestamp(java.lang.String p0)`
- `public redis.clients.jedis.timeseries.TSMRangeParams bucketTimestampHigh()`
- `public redis.clients.jedis.timeseries.TSMRangeParams bucketTimestampLow()`
- `public redis.clients.jedis.timeseries.TSMRangeParams bucketTimestampMid()`
- `public redis.clients.jedis.timeseries.TSMRangeParams count(int p0)`
- `public redis.clients.jedis.timeseries.TSMRangeParams empty()`
- `public redis.clients.jedis.timeseries.TSMRangeParams filter(java.lang.String... p0)`
- `public redis.clients.jedis.timeseries.TSMRangeParams filterByTS(long... p0)`
- `public redis.clients.jedis.timeseries.TSMRangeParams filterByValues(double p0, double p1)`
- `public redis.clients.jedis.timeseries.TSMRangeParams fromTimestamp(long p0)`
- `public redis.clients.jedis.timeseries.TSMRangeParams groupBy(java.lang.String p0, java.lang.String p1)`
- `public redis.clients.jedis.timeseries.TSMRangeParams latest()`
- `public static redis.clients.jedis.timeseries.TSMRangeParams multiRangeParams()`
- `public static redis.clients.jedis.timeseries.TSMRangeParams multiRangeParams(long p0, long p1)`
- `public redis.clients.jedis.timeseries.TSMRangeParams selectedLabels(java.lang.String... p0)`
- `public redis.clients.jedis.timeseries.TSMRangeParams toTimestamp(long p0)`
- `public redis.clients.jedis.timeseries.TSMRangeParams withLabels()`
- `public redis.clients.jedis.timeseries.TSMRangeParams withLabels(boolean p0)`

---

## public class `redis.clients.jedis.timeseries.TSRangeParams`
implements `redis.clients.jedis.params.IParams`  

**Constructors:**
- `public TSRangeParams()`
- `public TSRangeParams(long p0, long p1)`

**Methods:**
- `public void addParams(redis.clients.jedis.CommandArguments p0)`
- `public redis.clients.jedis.timeseries.TSRangeParams aggregation(redis.clients.jedis.timeseries.AggregationType p0, long p1)`
- `public redis.clients.jedis.timeseries.TSRangeParams align(long p0)`
- `public redis.clients.jedis.timeseries.TSRangeParams alignEnd()`
- `public redis.clients.jedis.timeseries.TSRangeParams alignStart()`
- `public redis.clients.jedis.timeseries.TSRangeParams bucketTimestamp(java.lang.String p0)`
- `public redis.clients.jedis.timeseries.TSRangeParams bucketTimestampHigh()`
- `public redis.clients.jedis.timeseries.TSRangeParams bucketTimestampLow()`
- `public redis.clients.jedis.timeseries.TSRangeParams bucketTimestampMid()`
- `public redis.clients.jedis.timeseries.TSRangeParams count(int p0)`
- `public redis.clients.jedis.timeseries.TSRangeParams empty()`
- `public redis.clients.jedis.timeseries.TSRangeParams filterByTS(long... p0)`
- `public redis.clients.jedis.timeseries.TSRangeParams filterByValues(double p0, double p1)`
- `public redis.clients.jedis.timeseries.TSRangeParams fromTimestamp(long p0)`
- `public redis.clients.jedis.timeseries.TSRangeParams latest()`
- `public static redis.clients.jedis.timeseries.TSRangeParams rangeParams()`
- `public static redis.clients.jedis.timeseries.TSRangeParams rangeParams(long p0, long p1)`
- `public redis.clients.jedis.timeseries.TSRangeParams toTimestamp(long p0)`

---

## public class `redis.clients.jedis.timeseries.TimeSeriesProtocol`

**Constructors:**
- `public TimeSeriesProtocol()`

**Fields:**
- `public final static byte[] MINUS`
- `public final static byte[] PLUS`

---

## public final static enum `redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesCommand`
extends `java.lang.Enum`  
implements `redis.clients.jedis.commands.ProtocolCommand`  

**Fields:**
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesCommand ADD`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesCommand ALTER`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesCommand CREATE`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesCommand CREATERULE`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesCommand DECRBY`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesCommand DEL`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesCommand DELETERULE`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesCommand GET`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesCommand INCRBY`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesCommand INFO`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesCommand MADD`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesCommand MGET`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesCommand MRANGE`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesCommand MREVRANGE`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesCommand QUERYINDEX`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesCommand RANGE`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesCommand REVRANGE`

**Methods:**
- `public byte[] getRaw()`

---

## public final static enum `redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesKeyword`
extends `java.lang.Enum`  
implements `redis.clients.jedis.args.Rawable`  

**Fields:**
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesKeyword AGGREGATION`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesKeyword ALIGN`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesKeyword BUCKETTIMESTAMP`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesKeyword CHUNK_SIZE`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesKeyword COMPRESSED`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesKeyword COUNT`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesKeyword DEBUG`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesKeyword DUPLICATE_POLICY`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesKeyword EMPTY`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesKeyword ENCODING`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesKeyword FILTER`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesKeyword FILTER_BY_TS`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesKeyword FILTER_BY_VALUE`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesKeyword GROUPBY`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesKeyword LABELS`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesKeyword LATEST`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesKeyword ON_DUPLICATE`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesKeyword REDUCE`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesKeyword RESET`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesKeyword RETENTION`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesKeyword SELECTED_LABELS`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesKeyword TIMESTAMP`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesKeyword UNCOMPRESSED`
- `public final static redis.clients.jedis.timeseries.TimeSeriesProtocol$TimeSeriesKeyword WITHLABELS`

**Methods:**
- `public byte[] getRaw()`

---

## public final class `redis.clients.jedis.util.ByteArrayComparator`

**Methods:**
- `public static int compare(byte[] p0, byte[] p1)`

---

## public final class `redis.clients.jedis.util.DoublePrecision`

**Methods:**
- `public static java.lang.Double parseFloatingPointNumber(java.lang.String p0)`

---

## public abstract interface `redis.clients.jedis.util.Hashing`

**Fields:**
- `public final static redis.clients.jedis.util.Hashing MD5`
- `public final static redis.clients.jedis.util.Hashing MURMUR_HASH`
- `public final static java.lang.ThreadLocal md5Holder`

**Methods:**
- `public abstract long hash(byte[] p0)`
- `public abstract long hash(java.lang.String p0)`

---

## public class `redis.clients.jedis.util.IOUtils`

**Methods:**
- `public static void closeQuietly(java.lang.AutoCloseable p0)`
- `public static void closeQuietly(java.net.Socket p0)`

---

## public class `redis.clients.jedis.util.JedisByteHashMap`
implements `java.io.Serializable`, `java.lang.Cloneable`, `java.util.Map<byte[],byte[]>`  

**Constructors:**
- `public JedisByteHashMap()`

**Methods:**
- `public void clear()`
- `public boolean containsKey(java.lang.Object p0)`
- `public boolean containsValue(java.lang.Object p0)`
- `public java.util.Set entrySet()`
- `public byte[] get(java.lang.Object p0)`
- `public boolean isEmpty()`
- `public java.util.Set keySet()`
- `public byte[] put(byte[] p0, byte[] p1)`
- `public void putAll(java.util.Map p0)`
- `public byte[] remove(java.lang.Object p0)`
- `public int size()`
- `public java.util.Collection values()`

---

## public final class `redis.clients.jedis.util.JedisClusterCRC16`

**Methods:**
- `public static int getCRC16(byte[] p0)`
- `public static int getCRC16(byte[] p0, int p1, int p2)`
- `public static int getCRC16(java.lang.String p0)`
- `public static int getSlot(byte[] p0)`
- `public static int getSlot(java.lang.String p0)`

---

## public final class `redis.clients.jedis.util.JedisClusterHashTag`

**Methods:**
- `public static java.lang.String getHashTag(java.lang.String p0)`
- `public static boolean isClusterCompliantMatchPattern(byte[] p0)`
- `public static boolean isClusterCompliantMatchPattern(java.lang.String p0)`

---

## public final class `redis.clients.jedis.util.JedisURIHelper`

**Methods:**
- `public static int getDBIndex(java.net.URI p0)`
- `public static redis.clients.jedis.HostAndPort getHostAndPort(java.net.URI p0)`
- `public static java.lang.String getPassword(java.net.URI p0)`
- `public static java.lang.String getUser(java.net.URI p0)`
- `public static boolean isRedisSSLScheme(java.net.URI p0)`
- `public static boolean isRedisScheme(java.net.URI p0)`
- `public static boolean isValid(java.net.URI p0)`

---

## public class `redis.clients.jedis.util.KeyValue`<K extends java.lang.Object, V extends java.lang.Object>
extends `java.util.AbstractMap$SimpleImmutableEntry`  

**Constructors:**
- `public KeyValue(K p0, V p1)`

**Methods:**
- `public static <K extends java.lang.Object, V extends java.lang.Object> redis.clients.jedis.util.KeyValue of(K p0, V p1)`

---

## public class `redis.clients.jedis.util.MurmurHash`
implements `redis.clients.jedis.util.Hashing`  

**Constructors:**
- `public MurmurHash()`

**Methods:**
- `public long hash(byte[] p0)`
- `public static int hash(byte[] p0, int p1)`
- `public static int hash(byte[] p0, int p1, int p2, int p3)`
- `public long hash(java.lang.String p0)`
- `public static int hash(java.nio.ByteBuffer p0, int p1)`
- `public static long hash64A(byte[] p0, int p1)`
- `public static long hash64A(byte[] p0, int p1, int p2, int p3)`
- `public static long hash64A(java.nio.ByteBuffer p0, int p1)`

---

## public class `redis.clients.jedis.util.Pool`<T extends java.lang.Object>
extends `org.apache.commons.pool2.impl.GenericObjectPool`  

**Constructors:**
- `public Pool(org.apache.commons.pool2.PooledObjectFactory p0, org.apache.commons.pool2.impl.GenericObjectPoolConfig p1)`
- `public Pool(org.apache.commons.pool2.impl.GenericObjectPoolConfig p0, org.apache.commons.pool2.PooledObjectFactory p1)`

**Methods:**
- `public void addObjects(int p0)`
- `public void close()`
- `public void destroy()`
- `public T getResource()`
- `public void returnBrokenResource(T p0)`
- `public void returnResource(T p0)`

---

## public class `redis.clients.jedis.util.RedisInputStream`
extends `java.io.FilterInputStream`  

**Constructors:**
- `public RedisInputStream(java.io.InputStream p0)`
- `public RedisInputStream(java.io.InputStream p0, int p1)`

**Fields:**
- `protected final byte[] buf`
- `protected int count`
- `protected int limit`

**Methods:**
- `public int read(byte[] p0, int p1, int p2) throws redis.clients.jedis.exceptions.JedisConnectionException`
- `public byte readByte() throws redis.clients.jedis.exceptions.JedisConnectionException`
- `public int readIntCrLf()`
- `public java.lang.String readLine()`
- `public byte[] readLineBytes()`
- `public long readLongCrLf()`

---

## public final class `redis.clients.jedis.util.RedisOutputStream`
extends `java.io.FilterOutputStream`  

**Constructors:**
- `public RedisOutputStream(java.io.OutputStream p0)`
- `public RedisOutputStream(java.io.OutputStream p0, int p1)`

**Methods:**
- `public void flush() throws java.io.IOException`
- `public void write(byte p0) throws java.io.IOException`
- `public void write(byte[] p0) throws java.io.IOException`
- `public void write(byte[] p0, int p1, int p2) throws java.io.IOException`
- `public void writeCrLf() throws java.io.IOException`
- `public void writeIntCrLf(int p0) throws java.io.IOException`

---

## public final class `redis.clients.jedis.util.SafeEncoder`

**Fields:**
- `public static volatile java.nio.charset.Charset DEFAULT_CHARSET`

**Methods:**
- `public static java.lang.String encode(byte[] p0)`
- `public static byte[] encode(java.lang.String p0)`
- `public static byte[][] encodeMany(java.lang.String... p0)`
- `public static java.lang.Object encodeObject(java.lang.Object p0)`

---

