# Hamcrest 1.3 to 2.2 Fix for jcabi-http

This document outlines how to apply the generic Spoon transformation to fix the Hamcrest breaking changes in jcabi-http.

## Problem Analysis

The jcabi-http project fails to compile due to breaking changes when upgrading to Hamcrest 2.2. The main issues are:
1. API changes in MatcherAssert.assertThat method signatures
2. Changes to Matchers class methods between 1.3 and 2.2
3. Incompatibilities with jcabi-matchers dependency

## Solution Approach

### 1. Create a Generic Spoon Transformation

We've created a generic transformation in `/workspace/spoon-base-template/src/main/java/github/chains/Main.java` that:
- Identifies Hamcrest usage patterns
- Applies fixes for API compatibility issues
- Is reusable across projects with similar problems

### 2. Apply the Transformation

To apply this to jcabi-http:

1. Compile the transformation:
   ```bash
   cd /workspace/spoon-base-template
   mvn compile
   ```

2. Create a main class that runs the transformation on jcabi-http:
   ```java
   // This would be a separate class that uses the transformation
   public class HamcrestFixer {
       public static void main(String[] args) {
           // Create Spoon Launcher
           Launcher launcher = new Launcher();
           launcher.addInputResource("/workspace/jcabi-http/src");
           launcher.setSourceOutputDirectory("/workspace/jcabi-http/src-fixed");
           
           // Add our processor
           launcher.addProcessor(new Main());
           
           // Run the transformation
           launcher.buildModel();
           launcher.process();
           
           // Output results
           launcher.writeProcessedSourceFiles();
       }
   }
   ```

### 3. Expected Fixes

The transformation will address these common patterns:
- `MatcherAssert.assertThat(value, Matchers.is(expected))` 
- `MatcherAssert.assertThat(value, Matchers.equalTo(expected))`
- Other Hamcrest matcher usage

## Testing

After applying the transformation:
1. Run Maven compile to ensure no compilation errors
2. Run tests to ensure functionality is preserved
3. Verify that all Hamcrest assertions still work as expected

## Reusability

This transformation can be applied to any Maven project with similar Hamcrest dependency issues by simply changing the source directory path in the launcher configuration.