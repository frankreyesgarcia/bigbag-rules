# Jedis 4.3.2 Breaking Changes and Fix Documentation

## Problem Summary

The JRedisGraph project fails to compile due to breaking changes in Jedis 4.3.2. Specifically, several pipeline interfaces were removed from the `redis.clients.jedis.commands` package:

### Removed Interfaces:
- `redis.clients.jedis.commands.BasicRedisPipeline`
- `redis.clients.jedis.commands.BinaryRedisPipeline`
- `redis.clients.jedis.commands.BinaryScriptingCommandsPipeline`
- `redis.clients.jedis.commands.ClusterPipeline`
- `redis.clients.jedis.commands.MultiKeyBinaryRedisPipeline`
- `redis.clients.jedis.commands.MultiKeyCommandsPipeline`
- `redis.clients.jedis.commands.RedisPipeline`
- `redis.clients.jedis.commands.ScriptingCommandsPipeline`

## Solution Approach

Since these interfaces are no longer available in Jedis 4.3.2, we need to:

1. **Remove imports** of the removed pipeline interfaces
2. **Update interface declarations** that extend these interfaces to use new Jedis 4.3.2 classes
3. **Update class inheritance** where necessary

## Files to Fix

### 1. RedisGraphTransaction.java
- Remove imports from `redis.clients.jedis.commands.*`
- Update interface declaration to extend appropriate Jedis 4.3.2 classes

### 2. RedisGraphPipeline.java  
- Remove imports from `redis.clients.jedis.commands.*`
- Update interface declaration to extend appropriate Jedis 4.3.2 classes

### 3. RedisGraphTransaction.java (implementation)
- Fix constructor calls to be compatible with Jedis 4.3.2

### 4. RedisGraphPipeline.java (implementation)
- Fix constructor calls to be compatible with Jedis 4.3.2

## Replacement Mapping

| Old Interface | New Class |
|---------------|-----------|
| `BasicRedisPipeline` | `redis.clients.jedis.Pipeline` |
| `BinaryRedisPipeline` | `redis.clients.jedis.Pipeline` |
| `BinaryScriptingCommandsPipeline` | `redis.clients.jedis.ScriptingPipeline` |
| `ClusterPipeline` | `redis.clients.jedis.ClusterPipeline` |
| `MultiKeyBinaryRedisPipeline` | `redis.clients.jedis.MultiKeyPipeline` |
| `MultiKeyCommandsPipeline` | `redis.clients.jedis.MultiKeyPipeline` |
| `RedisPipeline` | `redis.clients.jedis.Pipeline` |
| `ScriptingCommandsPipeline` | `redis.clients.jedis.ScriptingPipeline` |

## Generic Transformation Rule

The transformation should:
1. Search all Java files for imports from `redis.clients.jedis.commands.*`
2. Remove those imports
3. Find interfaces that extend the removed interfaces
4. Replace those superinterfaces with appropriate Jedis 4.3.2 classes
5. Ensure no hardcoded class names in the transformation (use fully-qualified names only)

This approach will be reusable for any project affected by the same breaking change.