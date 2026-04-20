# PubNub API Migration Tool

This tool helps migrate code from PubNub API version 6.2.2 to 6.3.2, where the PNConfiguration constructor now requires a parameter.

## Problem

In PubNub API 6.3.2, the PNConfiguration constructor requires either a subscribe key or user ID:
- `new PNConfiguration(subscribeKey)`
- `new PNConfiguration(userId)`

But in 6.2.2, you could create it without parameters:
- `new PNConfiguration()`

## Solution

This tool automatically identifies all instances of `new PNConfiguration()` calls and replaces them with `new PNConfiguration(parameter)`, where `parameter` is a placeholder that can be customized.

## Usage

1. Compile the tool:
   ```
   javac PubnubApiMigrationTool.java
   ```

2. Run the tool on your Java project directory:
   ```
   java PubnubApiMigrationTool /path/to/your/java/project
   ```

3. After running the tool, manually review and replace the `parameter` placeholder with the appropriate value:
   - For subscribe key: `new PNConfiguration(subscribeKey)`
   - For user ID: `new PNConfiguration(userId)`

## Example

Before:
```java
PNConfiguration pnConfiguration = new PNConfiguration();
pnConfiguration.setSubscribeKey(publicKey);
```

After running tool:
```java
PNConfiguration pnConfiguration = new PNConfiguration(parameter);
```

## Customization

The tool uses a placeholder `parameter` that you need to replace based on your specific use case:
- If you're using a subscribe key: replace `parameter` with `subscribeKey`
- If you're using a user ID: replace `parameter` with `userId`

## Notes

- This tool is generic and can be used for any project with this issue
- Always review the changes before committing to ensure correctness
- The tool only handles the constructor change; you may need to update other API calls as well