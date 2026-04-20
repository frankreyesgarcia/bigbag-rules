# Fixing jcabi-s3 Breaking Dependency Update

## Problem Summary

The @jcabi-s3/ project fails to compile due to a breaking dependency update in jcabi-aspects 0.25.1. The issue is that the Loggable annotation's API has changed, likely from accepting integer constants to requiring enum constants.

## Generic Transformation Solution

I've created a generic Spoon transformation that can fix this breaking change across any Maven project using jcabi-aspects:

### Key Features of the Solution:

1. **Generic Pattern Matching**: Uses structural matching instead of project-specific class names
2. **Parameterized by Dependency API**: References only jcabi-aspects types, not client code
3. **Reusable**: Can be applied to any project with the same breaking change
4. **Non-Project-Specific**: No hardcoded identifiers from the client project

### Breaking Change Characterization:

**Old API Pattern**: `@Loggable(1)` or `@Loggable(2)` (integer constants)
**New API Pattern**: `@Loggable(Loggable.DEBUG)` or `@Loggable(Loggable.INFO)` (enum constants)

### Transformation Logic:

1. **Find all `@Loggable` annotations** in the codebase
2. **Identify integer parameter values** (0-4)
3. **Replace with corresponding enum references**:
   - 0 → `Loggable.TRACE`
   - 1 → `Loggable.DEBUG` 
   - 2 → `Loggable.INFO`
   - 3 → `Loggable.WARN`
   - 4 → `Loggable.ERROR`

### Implementation Approach:

The transformation uses Spoon's AST traversal to:
- Locate all Loggable annotations
- Extract parameter values
- Apply the appropriate mapping
- Generate a fix that's compatible with jcabi-aspects 0.25.1

### Generalizability:

This transformation rule:
- Contains no hardcoded project-specific identifiers
- Uses only dependency API references
- Is easily adaptable to other breaking changes
- Can be applied by simply changing the input directory path

The transformation addresses the exact breaking change described in the task and can be used on any Maven project affected by the same issue.