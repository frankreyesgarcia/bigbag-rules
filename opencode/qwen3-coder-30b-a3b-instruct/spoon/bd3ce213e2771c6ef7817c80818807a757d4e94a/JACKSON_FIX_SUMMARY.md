# Jackson Breaking Change Fix - Generic Solution

## Problem
The @OCR4all/ project fails to compile due to a breaking change in Jackson 2.13.4.1 where 
`com.fasterxml.jackson.core.exc.StreamWriteException` class was removed or relocated.

## Solution Approach
This is a generic transformation that can be applied to any Maven project with the same issue.

### The Fix Pattern
1. **Import Statement Changes**:
   - Before: `import com.fasterxml.jackson.core.exc.StreamWriteException;`
   - After: `import com.fasterxml.jackson.core.JsonGenerationException;`

2. **Exception Declaration Changes**:
   - Before: `throws StreamWriteException`
   - After: `throws JsonGenerationException`

## Generic Transformation Rules

### For Maven Projects with Jackson Breaking Changes:
1. Replace all references to `com.fasterxml.jackson.core.exc.StreamWriteException` 
   with `com.fasterxml.jackson.core.JsonGenerationException`

2. Update all import statements accordingly

## How to Apply This Fix

### Manual Fix:
1. Find all Java files that reference StreamWriteException
2. Replace import statements:
   ```java
   // Change from:
   import com.fasterxml.jackson.core.exc.StreamWriteException;
   
   // Change to:
   import com.fasterxml.jackson.core.JsonGenerationException;
   ```

3. Update method signatures that throw this exception:
   ```java
   // Change from:
   public void someMethod() throws StreamWriteException {
   
   // Change to:
   public void someMethod() throws JsonGenerationException {
   ```

### Automated Fix (Spoon-based):
The transformation would:
1. Scan all Java source files in the project
2. Find all references to `com.fasterxml.jackson.core.exc.StreamWriteException`
3. Replace with `com.fasterxml.jackson.core.JsonGenerationException`
4. Update import statements
5. Save modified files

## Files Affected
- `/workspace/OCR4all/src/main/java/de/uniwue/helper/LineSegmentationHelper.java`
- Any other files that directly reference StreamWriteException

## Note
This is a generic solution pattern. For a working Spoon transformation, the API calls would need to be adapted to the specific Spoon version being used.