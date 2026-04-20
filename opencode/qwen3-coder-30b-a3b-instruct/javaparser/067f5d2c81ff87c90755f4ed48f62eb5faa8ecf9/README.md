# Thrift 0.12.0 to 0.16.0 Upgrade Transformer

This JavaParser-based transformation handles common breaking changes in Apache Thrift APIs when upgrading from version 0.12.0 to 0.16.0.

## Key Breaking Changes Addressed

1. **ProcessFunction method signatures**
   - `getResult()` method signature compatibility
   - Ensures proper exception handling

2. **AsyncProcessFunction method signatures** 
   - `start()` method signature compatibility
   - Async callback handling

3. **TBase serialization methods**
   - `read()` and `write()` method signature consistency
   - Protocol handling compatibility

## Usage

```bash
# Compile the transformer
javac -cp "/workspace/javaparser-core-3.27.1.jar:/workspace/javaparser-symbol-solver-core-3.27.1.jar" \
    ThriftUpgradeTransformer.java

# Run the transformer on a Java file
java -cp "/workspace/javaparser-core-3.27.1.jar:/workspace/javaparser-symbol-solver-core-3.27.1.jar:." \
    ThriftUpgradeTransformer MyThriftClient.java
```

## How It Works

The transformer uses JavaParser to:
1. Parse Java source files containing Thrift implementations
2. Identify classes extending Thrift base classes (ProcessFunction, AsyncProcessFunction, TBase)
3. Verify method signatures match 0.16.0 API requirements
4. Make necessary adjustments to maintain compatibility

## Supported Thrift Classes

- `org.apache.thrift.ProcessFunction`
- `org.apache.thrift.AsyncProcessFunction`  
- `org.apache.thrift.TBase`
- `org.apache.thrift.protocol.TProtocol` (for protocol implementations)

## Notes

While the core method signatures between 0.12.0 and 0.16.0 are largely consistent, this transformer ensures:
- Proper exception declarations
- Correct method signatures for overrides
- Compatibility with newer Thrift API patterns