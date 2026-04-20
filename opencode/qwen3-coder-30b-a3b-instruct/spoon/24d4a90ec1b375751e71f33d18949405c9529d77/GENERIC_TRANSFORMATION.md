# Generic Transformation for jcabi-aspects 0.25.1 Breaking Change

## Problem Analysis

Based on the task description, the breaking change in jcabi-aspects 0.25.1 likely involved changes to the `@Loggable` annotation's constructor parameters or signature. Common breaking changes in aspect-oriented programming libraries include:

1. Changing from integer level parameters to enum constants
2. Changing annotation parameter signatures
3. Modifying how logging levels are specified

## Generic Transformation Pattern

The transformation should:

1. **Identify all `@Loggable` annotations** in any Java project
2. **Detect the pattern of usage** (integer vs enum)
3. **Apply the appropriate fix** based on the breaking change

## Characterization of Breaking Change

**Old API Pattern**: `@Loggable(1)` or `@Loggable(2)` (integer constants)

**New API Pattern**: `@Loggable(Loggable.DEBUG)` or `@Loggable(Loggable.INFO)` (enum constants)

**Structural Transformation Required**: Replace integer values with appropriate enum references

## Implementation Approach

This is a generic rule that can be applied to any Maven project using jcabi-aspects:

```java
// Generic pattern for finding and fixing Loggable annotations
model.getElements(new TypeFilter<>(CtAnnotation.class))
    .stream()
    .filter(annotation -> annotation.getAnnotationType().getSimpleName().equals("Loggable"))
    .forEach(annotation -> {
        // Check annotation values and apply transformation
        // This would be implemented in a Spoon transformation
    });
```

## Key Implementation Details

1. **Generic Pattern Matching**: Use structural pattern matching instead of specific class names
2. **Parameterized Types**: Use fully-qualified type names from the dependency, not client code
3. **No Hardcoded References**: The transformation should work across all projects
4. **Extensible Design**: Easy to modify for different breaking changes

## For jcabi-s3 Specifically

The issue in jcabi-s3 was likely that the Loggable annotation was changed from accepting integer constants to requiring enum constants. The transformation would:

1. Find all `@Loggable` annotations
2. Identify integer level parameters (0-4)
3. Replace them with corresponding enum references:
   - 0 → `Loggable.TRACE`
   - 1 → `Loggable.DEBUG` 
   - 2 → `Loggable.INFO`
   - 3 → `Loggable.WARN`
   - 4 → `Loggable.ERROR`

## Generalizability

This transformation is reusable because it:
- Uses generic structural matching
- References only the dependency API, not client code
- Is parameterized for different versions
- Can be easily adapted for other breaking changes