# Generic Spoon Transformation for Jackson StreamReadException Fix

This document explains the breaking change and how to create a generic transformation rule.

## Problem Analysis

The @simplelocalize-cli/ project fails to compile due to a breaking change in Jackson 2.13.4.1:
- `com.fasterxml.jackson.core.exc.StreamReadException` class was moved or removed
- This causes a "cannot access com.fasterxml.jackson.core.exc.StreamReadException" error

## Generic Solution

The transformation rule should:
1. Identify catch blocks that handle `StreamReadException`
2. Replace them with `JsonProcessingException` (the correct replacement)
3. Work for any Maven project with this issue

## Transformation Implementation

The key insight is that `StreamReadException` was moved to `com.fasterxml.jackson.core.JsonProcessingException` in newer Jackson versions.

## How to Apply This Fix

1. Create a Spoon transformation that searches for catch blocks with StreamReadException
2. Replace them with JsonProcessingException
3. Apply to any Maven project with this issue

The transformation rule would be:
- Old: `catch (com.fasterxml.jackson.core.exc.StreamReadException e)`
- New: `catch (com.fasterxml.jackson.core.JsonProcessingException e)`

This is a generic fix that applies to any project affected by the Jackson API change.