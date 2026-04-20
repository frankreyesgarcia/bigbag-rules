# Breaking Changes: org.assertj:assertj-core 3.22.0 → 3.23.0
Total: 5 (binary-breaking: 1, source-breaking: 4)

## org.assertj.core.api.Abstract2DArrayAssert

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.assertj.core.api.Abstract2DArrayAssert`
+ MUST NOW IMPLEMENT: `org.assertj.core.api.Array2DAssert.hasNumberOfRows(int)`

## org.assertj.core.api.Array2DAssert

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.assertj.core.api.Array2DAssert`
+ MUST NOW IMPLEMENT: `org.assertj.core.api.Array2DAssert.hasNumberOfRows(int)`

## org.assertj.core.api.ThrowableAssertAlternative

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.assertj.core.api.AbstractObjectAssert.as(org.assertj.core.description.Description)`
+ NEW RETURN TYPE: `org.assertj.core.api.ThrowableAssertAlternative.as(org.assertj.core.description.Description)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.assertj.core.api.AbstractObjectAssert.as(org.assertj.core.description.Description)`
+ NEW RETURN TYPE: `org.assertj.core.api.ThrowableAssertAlternative.as(org.assertj.core.description.Description)`

## org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration.getComparedFields()`
+ NEW RETURN TYPE: `org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration.getComparedFields()`

