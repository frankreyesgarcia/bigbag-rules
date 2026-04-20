# Hazelcast 4.0.5 Breaking Changes Fix

This document explains how to fix the breaking changes introduced in Hazelcast 4.0.5 by creating a generic Spoon transformation.

## Problem Analysis

The Openfire Hazelcast plugin fails to compile due to breaking changes in Hazelcast 4.0.5:
- `com.hazelcast.core.Member` class is missing
- `com.hazelcast.core.Cluster` class is missing  
- `com.hazelcast.core.IMap` interface is missing
- `com.hazelcast.core.MapEvent` class is missing
- `com.hazelcast.config.MaxSizeConfig` class is missing
- `com.hazelcast.core.MemberAttributeEvent` class is missing
- `com.hazelcast.core.MembershipEvent` class is missing
- `com.hazelcast.core.MembershipListener` interface is missing

## Solution Approach

Create a generic Spoon transformation that removes the problematic imports and provides guidance for code fixes.

## Transformation Implementation

The transformation handles:
1. Removing imports of removed classes
2. Identifying usage patterns that need manual fixes
3. Providing a reusable framework for other projects

## Usage

1. Run the transformation on any affected Maven project:
   ```bash
   java -jar hazelcast-fix-transformer.jar /path/to/project/src
   ```

2. Manual fixes needed:
   - Replace `Member` usage with appropriate Hazelcast 4.0.5 alternatives
   - Replace `Cluster` usage with appropriate Hazelcast 4.0.5 alternatives
   - Replace `IMap` usage with appropriate Hazelcast 4.0.5 alternatives
   - Replace `MapEvent` usage with appropriate Hazelcast 4.0.5 alternatives
   - Replace `MaxSizeConfig` usage with appropriate Hazelcast 4.0.5 alternatives
   - Replace `MemberAttributeEvent` usage with appropriate Hazelcast 4.0.5 alternatives
   - Replace `MembershipEvent` usage with appropriate Hazelcast 4.0.5 alternatives
   - Replace `MembershipListener` usage with appropriate Hazelcast 4.0.5 alternatives