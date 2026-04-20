# Jackson StreamReadException Fix - Generic Spoon Transformation

## Problem Summary

The @simplelocalize-cli/ project fails to compile due to a breaking API change in Jackson 2.13.4.1:
- `com.fasterxml.jackson.core.exc.StreamReadException` is no longer available
- This causes compilation errors when using the old exception type

## Generic Solution Approach

This is a generic transformation that can be applied to any Maven project with the same issue:

### Transformation Rule:
- **Old API Pattern**: `catch (com.fasterxml.jackson.core.exc.StreamReadException e)`
- **New API Pattern**: `catch (com.fasterxml.jackson.core.JsonProcessingException e)`

### How the Fix Works:
1. **Identify**: Search all try-catch blocks in the codebase
2. **Match**: Find catch blocks that reference `StreamReadException` 
3. **Transform**: Replace with `JsonProcessingException` (which is the correct replacement in newer Jackson versions)

### Implementation Details:
The transformation should be implemented as a Spoon AST visitor that:
- Traverses all `CtTry` elements
- For each `CtTry`, examines `CtCatch` blocks
- When a catch block references `com.fasterxml.jackson.core.exc.StreamReadException`, replace with `com.fasterxml.jackson.core.JsonProcessingException`
- Apply to all Java source files in the project

### Usage:
```bash
java -cp spoon-base-template/target/classes:spoon-base-template/target/dependency/* github.chains.Main /path/to/project/src/main/java
```

### Why This Works:
- `StreamReadException` was moved/removed in Jackson 2.13.4.1
- `JsonProcessingException` is the base exception class for Jackson JSON processing errors
- This is a standard practice in Jackson API evolution

## For @simplelocalize-cli/ specifically:
The project should be updated to use `JsonProcessingException` instead of the deprecated `StreamReadException`.

This generic transformation rule can be reused for any project experiencing the same Jackson breaking change.