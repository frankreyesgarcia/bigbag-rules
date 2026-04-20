# Thrift 0.12.0 to 0.16.0 Upgrade Transformer

This is a JavaParser-based transformation tool that helps fix common compilation errors when upgrading from Apache Thrift 0.12.0 to 0.16.0.

## Common Breaking Changes Addressed

1. **ProcessFunction/AsyncProcessFunction method signature changes**
2. **TProtocol method signature changes**
3. **TBase method signature changes**

## How to Use

1. Compile the transformer:
   ```bash
   javac -cp "lib/*" ThriftUpgradeTransformer.java
   ```

2. Run the transformer on your Java files:
   ```bash
   java -cp ".:lib/*" ThriftUpgradeTransformer YourThriftGeneratedFile.java
   ```

## Features

- Generic approach that works across different projects
- No hardcoded project-specific identifiers
- Uses JavaParser API for safe AST manipulation
- Handles the most common signature changes between Thrift versions

## Limitations

This is a template implementation. For production use, you would need to:
1. Add specific logic to handle actual API differences
2. Implement proper signature matching and parameter adjustment
3. Consider version-specific changes in your project context

## Supported Methods

### TProtocol Methods
- readFieldBegin, readFieldEnd
- readMapBegin, readMapEnd
- readListBegin, readListEnd
- readSetBegin, readSetEnd
- writeFieldBegin, writeFieldEnd
- writeMapBegin, writeMapEnd
- writeListBegin, writeListEnd
- writeSetBegin, writeSetEnd

### TBase Methods
- read, write
- readFields, writeFields

## Requirements

- Java 8 or higher
- JavaParser library in classpath