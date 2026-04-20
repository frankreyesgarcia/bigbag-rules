# SnakeYAML 2.0 Fix Transformation

This project provides a Spoon transformation to automatically fix common breaking changes when migrating from SnakeYAML 1.x to 2.0.

## Breaking Changes Addressed

The transformation handles the following common SnakeYAML 2.0 breaking changes:

1. **Yaml() constructor**: Now requires a `LoaderOptions` parameter
2. **Yaml(boolean allowDuplicateKeys)**: Constructor signature has changed
3. **Yaml(Representer, Constructor)**: Constructor signature has changed

## Usage

To use this transformation:

1. Add the SnakeYAML20Fix processor to your Spoon launcher:

```java
Launcher launcher = new Launcher();
launcher.addInputResource("src/main/java");
launcher.setSourceOutputDirectory("src/main/java-fixed");
launcher.addProcessor(new SnakeYAML20Fix());
launcher.buildModel();
launcher.process();
launcher.export();
```

2. Run the transformation on your codebase

## Features

- Generic solution that works with any project, not just jclouds
- Handles common constructor signature changes
- Maintains existing functionality while updating API calls
- Designed to be easily extendable for additional changes

## Limitations

This transformation addresses the most common constructor changes. Additional method signature changes or API modifications may require further updates to the processor.