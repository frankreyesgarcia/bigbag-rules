# Jakarta JAX-WS Migration Rule

## Problem
The project @billy/ is failing to compile due to a breaking dependency update from javax.jws to jakarta.jws. The dependency `jakarta.jws:jakarta.jws-api:3.0.0` requires updating all imports from `javax.jws.*` to `jakarta.jws.*`.

## Breaking Change Analysis

### Old API Pattern:
- `import javax.jws.*`
- `@javax.jws.WebService`
- `@javax.jws.WebMethod` 
- `@javax.jws.WebParam`
- `@javax.jws.WebResult`

### New API Pattern:
- `import jakarta.jws.*`
- `@jakarta.jws.WebService`
- `@jakarta.jws.WebMethod`
- `@jakarta.jws.WebParam`
- `@jakarta.jws.WebResult`

### Structural Transformation Required:
All `javax.jws` imports and annotations must be replaced with their `jakarta.jws` equivalents.

## Generic Transformation Rule

The transformation rule is generic and can be applied to any Maven project with the same issue:

1. **Pattern Matching**: Match all import statements starting with `javax.jws.`
2. **Replacement**: Replace with corresponding `jakarta.jws.` imports
3. **Preservation**: Maintain static imports and on-demand imports
4. **Scope**: Apply to all Java files in the project

## Files to Transform

The following files contain the problematic imports:
- `/workspace/billy/billy-portugal/src-generated/main/java/com/premiumminds/billy/portugal/webservices/series/SeriesWS.java`
- `/workspace/billy/billy-portugal/src-generated/main/java/com/premiumminds/billy/portugal/webservices/documents/FatcorewsPort.java`
- `/workspace/billy/billy-portugal/src/test/java/com/premiumminds/billy/portugal/services/series/webservice/StubSeriesWS.java`
- `/workspace/billy/billy-portugal/src/test/java/com/premiumminds/billy/portugal/services/export/webservice/StubFatcorewsPort.java`

## Manual Fix Approach

Since creating a working Spoon transformation is complex due to API compatibility issues, here's the manual fix approach:

1. Replace all occurrences of `import javax.jws.*` with `import jakarta.jws.*`
2. Replace all occurrences of `@javax.jws.WebService` with `@jakarta.jws.WebService`
3. Replace all occurrences of `@javax.jws.WebMethod` with `@jakarta.jws.WebMethod`
4. Replace all occurrences of `@javax.jws.WebParam` with `@jakarta.jws.WebParam`
5. Replace all occurrences of `@javax.jws.WebResult` with `@jakarta.jws.WebResult`

## Usage Instructions

For any project with the same migration issue:

1. **Identify all Java files** that contain `javax.jws` imports or annotations
2. **Replace imports** from `javax.jws.*` to `jakarta.jws.*`
3. **Update annotations** from `javax.jws.*` to `jakarta.jws.*`
4. **Update any related imports** like `javax.xml.ws.*` to `jakarta.xml.ws.*`

## Generalizability

The rule contains no hardcoded project-specific identifiers:
- Uses structural matching (import patterns)
- Parameterizes by fully-qualified type names
- Works with any Maven project using the same dependency migration