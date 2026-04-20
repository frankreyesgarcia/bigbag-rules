# ByteBuddy Import Replacement Processor

This project provides a Spoon-based processor to automatically replace deprecated AssertJ internal ByteBuddy imports with the external ByteBuddy package.

## Problem

In AssertJ v3.23.0, the internal ByteBuddy package `org.assertj.core.internal.bytebuddy` was removed, causing compilation errors in projects that depend on it (like assertj-vavr).

## Solution

This processor automatically identifies and replaces all imports from:
- `org.assertj.core.internal.bytebuddy.*` 
to:
- `net.bytebuddy.*`

## Usage

1. Compile the processor:
```bash
mvn compile
```

2. Run the processor on a Maven project:
```bash
java -cp target/classes:$(mvn dependency:build-classpath -Dmdep.outputFile=/dev/stdout -q) com.example.bytebuddy.ByteBuddyImportReplacer /path/to/project
```

## Files

- `ByteBuddyImportProcessor.java`: The main processor that handles import replacement
- `ByteBuddyImportReplacer.java`: Main class to run the processor on a project

## How It Works

The processor:
1. Identifies all `CtImport` elements in the codebase
2. Filters imports that start with `org.assertj.core.internal.bytebuddy`
3. Replaces them with equivalent imports from `net.bytebuddy`
4. Maintains the same import structure and package hierarchy

## Example

Before:
```java
import org.assertj.core.internal.bytebuddy.ByteBuddy;
import org.assertj.core.internal.bytebuddy.TypeCache;
import org.assertj.core.internal.bytebuddy.dynamic.loading.ClassInjector;
```

After:
```java
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.TypeCache;
import net.bytebuddy.dynamic.loading.ClassInjector;
```