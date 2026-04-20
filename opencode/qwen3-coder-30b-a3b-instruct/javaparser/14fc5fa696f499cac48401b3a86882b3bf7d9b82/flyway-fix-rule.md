# Flyway 9.21.1 Breaking Change Fix

## Problem
Flyway 9.21.1 removed the no-argument constructor `new Flyway()` and now requires a `Configuration` parameter.

## Solution
Replace all instances of:
```java
new Flyway()
```

With:
```java
new Flyway(FluentConfiguration.configure()
    .dataSource(dataSource)
    .locations(locations)
    .classLoader(classLoader)
    .validateOnMigrate(validateOnMigrate)
    // ... other configuration options as needed
)
```

## Generic Transformation Pattern
The transformation should match:
1. Object creation expressions with `new Flyway()` 
2. Replace with `new Flyway(FluentConfiguration.configure()....)`
3. Handle method calls that were used on the Flyway instance (setDataSource, setLocations, etc.)

## Files Modified
- `/workspace/nem/nis/src/main/java/org/nem/specific/deploy/appconfig/NisAppConfig.java`
- `/workspace/nem/nis/src/test/java/org/nem/nis/dao/TestConf.java`

## Final Working Implementation
The solution involves:
1. Adding proper imports for `org.flywaydb.core.api.configuration.FluentConfiguration`
2. Replacing `new Flyway()` with `new Flyway(FluentConfiguration.configure()....)`
3. Converting method calls like `flyway.setDataSource(...)` to fluent API calls