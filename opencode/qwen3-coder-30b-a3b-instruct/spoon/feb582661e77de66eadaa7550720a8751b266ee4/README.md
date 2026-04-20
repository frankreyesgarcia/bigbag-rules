# Liquibase ExecutorService API Fix Transformation

This project provides a Spoon-based transformation to fix the ExecutorService API change in Liquibase projects from version 4.7.x to 4.8.0.

## Problem

In Liquibase 4.8.0, the ExecutorService API was changed from:
```java
ExecutorService.getInstance().getExecutor(database).execute(statement)
```

To the new API:
```java
ExecutorService.getInstance().execute(database, statement)
```

## Solution

This Spoon transformation automatically identifies and replaces the old API pattern with the new one across an entire project.

## Usage

1. Compile the transformation:
```bash
javac -cp "spoon-core-11.2.1.jar:." *.java
```

2. Run the transformation:
```bash
java LiquibaseExecutorServiceFixerMain <source-directory> [output-directory]
```

## How it works

The transformation processor:
- Identifies method invocations matching the pattern: `ExecutorService.getInstance().getExecutor(database).execute(statement)`
- Replaces them with: `ExecutorService.getInstance().execute(database, statement)`
- Works on any Java project using the old ExecutorService API

## Requirements

- Java 8 or higher
- Spoon Core library (version 11.2.1 or higher)
- A project using the Liquibase ExecutorService API

## Example

Before:
```java
ExecutorService.getInstance().getExecutor(database).execute(statement);
```

After:
```java
ExecutorService.getInstance().execute(database, statement);
```