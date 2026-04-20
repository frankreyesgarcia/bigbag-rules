# Hazelcast 4.0.5 Breaking Changes Fix

## Problem Summary

The Openfire Hazelcast plugin fails to compile due to breaking changes in Hazelcast 4.0.5. The core issue is that several classes were removed from the `com.hazelcast.core` package:
- Member
- Cluster  
- IMap
- MapEvent
- MemberAttributeEvent
- MembershipEvent
- MembershipListener
- MaxSizeConfig

## Solution Approach

Since we're creating a generic transformation rule that can be reused across projects, we need to:

1. Identify and remove imports of removed classes
2. Provide a framework for handling the remaining code changes

## Generic Transformation Rule

This transformation handles:
- Removing imports of removed Hazelcast core classes
- Providing a framework that can be extended for other transformations

## Implementation

The transformation should be run as:
```bash
java -cp hazelcast-fix-transformer.jar github.chains.Main /path/to/project/src
```

## Manual Fixes Required

The following manual code changes are still needed in affected projects:
1. Replace `Member` usage with appropriate Hazelcast 4.0.5 APIs
2. Replace `Cluster` usage with appropriate Hazelcast 4.0.5 APIs  
3. Replace `IMap` usage with appropriate Hazelcast 4.0.5 APIs
4. Replace `MapEvent` usage with appropriate Hazelcast 4.0.5 APIs
5. Replace `MaxSizeConfig` usage with appropriate Hazelcast 4.0.5 APIs
6. Replace `MemberAttributeEvent` usage with appropriate Hazelcast 4.0.5 APIs
7. Replace `MembershipEvent` usage with appropriate Hazelcast 4.0.5 APIs
8. Replace `MembershipListener` usage with appropriate Hazelcast 4.0.5 APIs

## How to Apply

1. Run the transformation on your project source code
2. Review remaining compilation errors
3. Manually fix the remaining code issues based on Hazelcast 4.0.5 documentation