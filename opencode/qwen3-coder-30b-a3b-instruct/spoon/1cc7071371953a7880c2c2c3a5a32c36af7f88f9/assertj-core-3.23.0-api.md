# API Specification: org.assertj:assertj-core 3.23.0

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public abstract interface `org.assertj.core.annotations.Beta`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract class `org.assertj.core.api.Abstract2DArrayAssert`<SELF extends org.assertj.core.api.Abstract2DArrayAssert<SELF, ACTUAL, ELEMENT>, ACTUAL extends java.lang.Object, ELEMENT extends java.lang.Object>
extends `org.assertj.core.api.AbstractAssert`  
implements `org.assertj.core.api.Array2DAssert<SELF,ELEMENT>`  

**Constructors:**
- `protected Abstract2DArrayAssert(ACTUAL p0, java.lang.Class p1)`

**Methods:**
- `public abstract SELF isDeepEqualTo(ACTUAL p0)`

---

## public abstract class `org.assertj.core.api.AbstractArrayAssert`<SELF extends org.assertj.core.api.AbstractArrayAssert<SELF, ACTUAL, ELEMENT>, ACTUAL extends java.lang.Object, ELEMENT extends java.lang.Object>
extends `org.assertj.core.api.AbstractEnumerableAssert`  
implements `org.assertj.core.api.ArraySortedAssert<org.assertj.core.api.AbstractArrayAssert<SELF,ACTUAL,ELEMENT>,ELEMENT>`  

**Constructors:**
- `protected AbstractArrayAssert(ACTUAL p0, java.lang.Class p1)`

---

## public abstract class `org.assertj.core.api.AbstractAssert`<SELF extends org.assertj.core.api.AbstractAssert<SELF, ACTUAL>, ACTUAL extends java.lang.Object>
implements `org.assertj.core.api.Assert<SELF,ACTUAL>`  

**Constructors:**
- `protected AbstractAssert(ACTUAL p0, java.lang.Class p1)`

**Fields:**
- `protected final ACTUAL actual`
- `public org.assertj.core.api.WritableAssertionInfo info`
- `protected final SELF myself`
- `protected org.assertj.core.internal.Objects objects`
- `public static boolean throwUnsupportedExceptionOnEquals`

**Methods:**
- `protected boolean areEqual(java.lang.Object p0, java.lang.Object p1)`
- `public <ASSERT extends org.assertj.core.api.AbstractAssert<? extends java.lang.Object, ? extends java.lang.Object>> ASSERT asInstanceOf(org.assertj.core.api.InstanceOfAssertFactory p0)`
- `public org.assertj.core.api.AbstractListAssert asList()`
- `public org.assertj.core.api.AbstractStringAssert asString()`
- `protected java.lang.AssertionError assertionError(org.assertj.core.error.ErrorMessageFactory p0)`
- `public SELF describedAs(org.assertj.core.description.Description p0)`
- `public java.lang.String descriptionText()`
- `public SELF doesNotHave(org.assertj.core.api.Condition p0)`
- `public SELF doesNotHaveSameClassAs(java.lang.Object p0)`
- `public SELF doesNotHaveSameHashCodeAs(java.lang.Object p0)`
- `public SELF doesNotHaveToString(java.lang.String p0)`
- `public boolean equals(java.lang.Object p0)`
- `protected <ASSERT extends org.assertj.core.api.AbstractAssert<? extends java.lang.Object, ? extends java.lang.Object>> ASSERT extracting(java.lang.String p0, org.assertj.core.api.AssertFactory p1)`
- `protected <T extends java.lang.Object, ASSERT extends org.assertj.core.api.AbstractAssert<? extends java.lang.Object, ? extends java.lang.Object>> ASSERT extracting(java.util.function.Function p0, org.assertj.core.api.AssertFactory p1)`
- `protected void failWithActualExpectedAndMessage(java.lang.Object p0, java.lang.Object p1, java.lang.String p2, java.lang.Object... p3)`
- `protected void failWithMessage(java.lang.String p0, java.lang.Object... p1)`
- `protected java.lang.AssertionError failure(java.lang.String p0, java.lang.Object... p1)`
- `protected java.lang.AssertionError failureWithActualExpected(java.lang.Object p0, java.lang.Object p1, java.lang.String p2, java.lang.Object... p3)`
- `public org.assertj.core.api.WritableAssertionInfo getWritableAssertionInfo()`
- `public SELF has(org.assertj.core.api.Condition p0)`
- `public SELF hasSameClassAs(java.lang.Object p0)`
- `public SELF hasSameHashCodeAs(java.lang.Object p0)`
- `public SELF hasToString(java.lang.String p0)`
- `public int hashCode()`
- `protected SELF inBinary()`
- `protected SELF inHexadecimal()`
- `public SELF is(org.assertj.core.api.Condition p0)`
- `protected boolean isElementOfCustomAssert(java.lang.StackTraceElement p0)`
- `public SELF isEqualTo(java.lang.Object p0)`
- `public SELF isExactlyInstanceOf(java.lang.Class p0)`
- `public SELF isIn(java.lang.Iterable p0)`
- `public SELF isIn(java.lang.Object... p0)`
- `public SELF isInstanceOf(java.lang.Class p0)`
- `public SELF isInstanceOfAny(java.lang.Class... p0)`
- `public <T extends java.lang.Object> SELF isInstanceOfSatisfying(java.lang.Class p0, java.util.function.Consumer p1)`
- `public SELF isNot(org.assertj.core.api.Condition p0)`
- `public SELF isNotEqualTo(java.lang.Object p0)`
- `public SELF isNotExactlyInstanceOf(java.lang.Class p0)`
- `public SELF isNotIn(java.lang.Iterable p0)`
- `public SELF isNotIn(java.lang.Object... p0)`
- `public SELF isNotInstanceOf(java.lang.Class p0)`
- `public SELF isNotInstanceOfAny(java.lang.Class... p0)`
- `public SELF isNotNull()`
- `public SELF isNotOfAnyClassIn(java.lang.Class... p0)`
- `public SELF isNotSameAs(java.lang.Object p0)`
- `public void isNull()`
- `public SELF isOfAnyClassIn(java.lang.Class... p0)`
- `public SELF isSameAs(java.lang.Object p0)`
- `public SELF matches(java.util.function.Predicate p0)`
- `public SELF matches(java.util.function.Predicate p0, java.lang.String p1)`
- `protected <E extends java.lang.Object> org.assertj.core.api.AbstractListAssert newListAssertInstance(java.util.List p0)`
- `public SELF overridingErrorMessage(java.lang.String p0, java.lang.Object... p1)`
- `public SELF overridingErrorMessage(java.util.function.Supplier p0)`
- `public final SELF satisfies(java.util.function.Consumer... p0)`
- `public SELF satisfies(org.assertj.core.api.Condition p0)`
- `public final SELF satisfies(org.assertj.core.api.ThrowingConsumer... p0)`
- `public final SELF satisfiesAnyOf(java.util.function.Consumer... p0)`
- `public final SELF satisfiesAnyOf(org.assertj.core.api.ThrowingConsumer... p0)`
- `protected SELF satisfiesAnyOfForProxy(java.util.function.Consumer[] p0) throws java.lang.AssertionError`
- `protected SELF satisfiesForProxy(java.util.function.Consumer[] p0) throws java.lang.AssertionError`
- `public static void setCustomRepresentation(org.assertj.core.presentation.Representation p0)`
- `public static void setDescriptionConsumer(java.util.function.Consumer p0)`
- `public static void setPrintAssertionsDescription(boolean p0)`
- `protected void throwAssertionError(org.assertj.core.error.ErrorMessageFactory p0)`
- `public SELF usingComparator(java.util.Comparator p0)`
- `public SELF usingComparator(java.util.Comparator p0, java.lang.String p1)`
- `public SELF usingDefaultComparator()`
- `protected org.assertj.core.api.RecursiveComparisonAssert usingRecursiveComparison()`
- `protected org.assertj.core.api.RecursiveComparisonAssert usingRecursiveComparison(org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration p0)`
- `public SELF withFailMessage(java.lang.String p0, java.lang.Object... p1)`
- `public SELF withFailMessage(java.util.function.Supplier p0)`
- `public SELF withRepresentation(org.assertj.core.presentation.Representation p0)`
- `public SELF withThreadDumpOnError()`

---

## public abstract class `org.assertj.core.api.AbstractAtomicFieldUpdaterAssert`<SELF extends org.assertj.core.api.AbstractAtomicFieldUpdaterAssert<SELF, VALUE, ATOMIC, OBJECT>, VALUE extends java.lang.Object, ATOMIC extends java.lang.Object, OBJECT extends java.lang.Object>
extends `org.assertj.core.api.AbstractObjectAssert`  

**Constructors:**
- `protected AbstractAtomicFieldUpdaterAssert(ATOMIC p0, java.lang.Class p1, boolean p2)`

**Methods:**
- `protected abstract VALUE getActualValue(OBJECT p0)`
- `public SELF hasValue(VALUE p0, OBJECT p1)`
- `protected void validate(VALUE p0)`

---

## public abstract class `org.assertj.core.api.AbstractAtomicReferenceAssert`<SELF extends org.assertj.core.api.AbstractAtomicReferenceAssert<SELF, VALUE, ATOMIC>, VALUE extends java.lang.Object, ATOMIC extends java.lang.Object>
extends `org.assertj.core.api.AbstractObjectAssert`  

**Constructors:**
- `protected AbstractAtomicReferenceAssert(ATOMIC p0, java.lang.Class p1)`

**Methods:**
- `protected abstract VALUE getReference()`
- `public SELF hasReference(VALUE p0)`

---

## public abstract class `org.assertj.core.api.AbstractBigDecimalAssert`<SELF extends org.assertj.core.api.AbstractBigDecimalAssert<SELF>>
extends `org.assertj.core.api.AbstractComparableAssert`  
implements `org.assertj.core.api.NumberAssert<SELF,java.math.BigDecimal>`  

**Constructors:**
- `protected AbstractBigDecimalAssert(java.math.BigDecimal p0, java.lang.Class p1)`

**Methods:**
- `public SELF hasScaleOf(int p0)`
- `public SELF isBetween(java.math.BigDecimal p0, java.math.BigDecimal p1)`
- `public SELF isCloseTo(java.math.BigDecimal p0, org.assertj.core.data.Offset p1)`
- `public SELF isCloseTo(java.math.BigDecimal p0, org.assertj.core.data.Percentage p1)`
- `public SELF isEqualByComparingTo(java.lang.String p0)`
- `public SELF isEqualTo(java.lang.String p0)`
- `public SELF isGreaterThanOrEqualTo(java.math.BigDecimal p0)`
- `public SELF isLessThanOrEqualTo(java.math.BigDecimal p0)`
- `public SELF isNegative()`
- `public SELF isNotCloseTo(java.math.BigDecimal p0, org.assertj.core.data.Offset p1)`
- `public SELF isNotCloseTo(java.math.BigDecimal p0, org.assertj.core.data.Percentage p1)`
- `public SELF isNotEqualByComparingTo(java.lang.String p0)`
- `public SELF isNotNegative()`
- `public SELF isNotPositive()`
- `public SELF isNotZero()`
- `public SELF isOne()`
- `public SELF isPositive()`
- `public SELF isStrictlyBetween(java.math.BigDecimal p0, java.math.BigDecimal p1)`
- `public SELF isZero()`
- `public org.assertj.core.api.AbstractBigDecimalScaleAssert scale()`
- `public SELF usingComparator(java.util.Comparator p0)`
- `public SELF usingComparator(java.util.Comparator p0, java.lang.String p1)`
- `public SELF usingDefaultComparator()`

---

## public abstract class `org.assertj.core.api.AbstractBigDecimalScaleAssert`<SELF extends org.assertj.core.api.AbstractBigDecimalAssert<SELF>>
extends `org.assertj.core.api.AbstractIntegerAssert`  

**Constructors:**
- `protected AbstractBigDecimalScaleAssert(java.lang.Integer p0, java.lang.Class p1)`

**Methods:**
- `public abstract org.assertj.core.api.AbstractBigDecimalAssert returnToBigDecimal()`

---

## public class `org.assertj.core.api.AbstractBigIntegerAssert`<SELF extends org.assertj.core.api.AbstractBigIntegerAssert<SELF>>
extends `org.assertj.core.api.AbstractComparableAssert`  
implements `org.assertj.core.api.NumberAssert<SELF,java.math.BigInteger>`  

**Constructors:**
- `protected AbstractBigIntegerAssert(java.math.BigInteger p0, java.lang.Class p1)`

**Methods:**
- `public SELF isBetween(java.math.BigInteger p0, java.math.BigInteger p1)`
- `public SELF isCloseTo(java.math.BigInteger p0, org.assertj.core.data.Offset p1)`
- `public SELF isCloseTo(java.math.BigInteger p0, org.assertj.core.data.Percentage p1)`
- `public SELF isEqualTo(int p0)`
- `public SELF isEqualTo(java.lang.String p0)`
- `public SELF isEqualTo(long p0)`
- `public SELF isNegative()`
- `public SELF isNotCloseTo(java.math.BigInteger p0, org.assertj.core.data.Offset p1)`
- `public SELF isNotCloseTo(java.math.BigInteger p0, org.assertj.core.data.Percentage p1)`
- `public SELF isNotNegative()`
- `public SELF isNotPositive()`
- `public SELF isNotZero()`
- `public SELF isOne()`
- `public SELF isPositive()`
- `public SELF isStrictlyBetween(java.math.BigInteger p0, java.math.BigInteger p1)`
- `public SELF isZero()`
- `public SELF usingComparator(java.util.Comparator p0)`
- `public SELF usingComparator(java.util.Comparator p0, java.lang.String p1)`
- `public SELF usingDefaultComparator()`

---

## public abstract class `org.assertj.core.api.AbstractBooleanArrayAssert`<SELF extends org.assertj.core.api.AbstractBooleanArrayAssert<SELF>>
extends `org.assertj.core.api.AbstractArrayAssert`  

**Constructors:**
- `protected AbstractBooleanArrayAssert(boolean[] p0, java.lang.Class p1)`

**Fields:**
- `protected org.assertj.core.internal.BooleanArrays arrays`

**Methods:**
- `public SELF contains(boolean p0, org.assertj.core.data.Index p1)`
- `public SELF contains(boolean... p0)`
- `public SELF contains(java.lang.Boolean[] p0)`
- `public SELF containsAnyOf(boolean... p0)`
- `public SELF containsAnyOf(java.lang.Boolean[] p0)`
- `public SELF containsExactly(boolean... p0)`
- `public SELF containsExactly(java.lang.Boolean[] p0)`
- `public SELF containsExactlyInAnyOrder(boolean... p0)`
- `public SELF containsExactlyInAnyOrder(java.lang.Boolean[] p0)`
- `public SELF containsOnly(boolean... p0)`
- `public SELF containsOnly(java.lang.Boolean[] p0)`
- `public SELF containsOnlyOnce(boolean... p0)`
- `public SELF containsOnlyOnce(java.lang.Boolean[] p0)`
- `public SELF containsSequence(boolean... p0)`
- `public SELF containsSequence(java.lang.Boolean[] p0)`
- `public SELF containsSubsequence(boolean... p0)`
- `public SELF containsSubsequence(java.lang.Boolean[] p0)`
- `public SELF doesNotContain(boolean p0, org.assertj.core.data.Index p1)`
- `public SELF doesNotContain(boolean... p0)`
- `public SELF doesNotContain(java.lang.Boolean[] p0)`
- `public SELF doesNotHaveDuplicates()`
- `public SELF endsWith(boolean... p0)`
- `public SELF endsWith(java.lang.Boolean[] p0)`
- `public SELF hasSameSizeAs(java.lang.Iterable p0)`
- `public SELF hasSize(int p0)`
- `public SELF hasSizeBetween(int p0, int p1)`
- `public SELF hasSizeGreaterThan(int p0)`
- `public SELF hasSizeGreaterThanOrEqualTo(int p0)`
- `public SELF hasSizeLessThan(int p0)`
- `public SELF hasSizeLessThanOrEqualTo(int p0)`
- `public void isEmpty()`
- `public SELF isNotEmpty()`
- `public void isNullOrEmpty()`
- `public SELF isSorted()`
- `public SELF isSortedAccordingTo(java.util.Comparator p0)`
- `public SELF startsWith(boolean... p0)`
- `public SELF startsWith(java.lang.Boolean[] p0)`
- `public final SELF usingDefaultElementComparator()`
- `public final SELF usingElementComparator(java.util.Comparator p0)`

---

## public abstract class `org.assertj.core.api.AbstractBooleanAssert`<SELF extends org.assertj.core.api.AbstractBooleanAssert<SELF>>
extends `org.assertj.core.api.AbstractAssert`  

**Constructors:**
- `protected AbstractBooleanAssert(java.lang.Boolean p0, java.lang.Class p1)`

**Methods:**
- `public SELF isEqualTo(boolean p0)`
- `public SELF isFalse()`
- `public SELF isNotEqualTo(boolean p0)`
- `public SELF isTrue()`
- `public final SELF usingComparator(java.util.Comparator p0)`
- `public final SELF usingComparator(java.util.Comparator p0, java.lang.String p1)`

---

## public abstract class `org.assertj.core.api.AbstractByteArrayAssert`<SELF extends org.assertj.core.api.AbstractByteArrayAssert<SELF>>
extends `org.assertj.core.api.AbstractArrayAssert`  

**Constructors:**
- `protected AbstractByteArrayAssert(byte[] p0, java.lang.Class p1)`

**Fields:**
- `protected org.assertj.core.internal.ByteArrays arrays`

**Methods:**
- `public org.assertj.core.api.AbstractStringAssert asBase64Encoded()`
- `public org.assertj.core.api.AbstractStringAssert asHexString()`
- `public org.assertj.core.api.AbstractStringAssert asString()`
- `public org.assertj.core.api.AbstractStringAssert asString(java.nio.charset.Charset p0)`
- `public SELF contains(byte p0, org.assertj.core.data.Index p1)`
- `public SELF contains(byte... p0)`
- `public SELF contains(int p0, org.assertj.core.data.Index p1)`
- `public SELF contains(int... p0)`
- `public SELF contains(java.lang.Byte[] p0)`
- `public SELF containsAnyOf(byte... p0)`
- `public SELF containsAnyOf(int... p0)`
- `public SELF containsAnyOf(java.lang.Byte[] p0)`
- `public SELF containsExactly(byte... p0)`
- `public SELF containsExactly(int... p0)`
- `public SELF containsExactly(java.lang.Byte[] p0)`
- `public SELF containsExactlyInAnyOrder(byte... p0)`
- `public SELF containsExactlyInAnyOrder(int... p0)`
- `public SELF containsExactlyInAnyOrder(java.lang.Byte[] p0)`
- `public SELF containsOnly(byte... p0)`
- `public SELF containsOnly(int... p0)`
- `public SELF containsOnly(java.lang.Byte[] p0)`
- `public SELF containsOnlyOnce(byte... p0)`
- `public SELF containsOnlyOnce(int... p0)`
- `public SELF containsOnlyOnce(java.lang.Byte[] p0)`
- `public SELF containsSequence(byte... p0)`
- `public SELF containsSequence(int... p0)`
- `public SELF containsSequence(java.lang.Byte[] p0)`
- `public SELF containsSubsequence(byte... p0)`
- `public SELF containsSubsequence(int... p0)`
- `public SELF containsSubsequence(java.lang.Byte[] p0)`
- `public SELF doesNotContain(byte p0, org.assertj.core.data.Index p1)`
- `public SELF doesNotContain(byte... p0)`
- `public SELF doesNotContain(int p0, org.assertj.core.data.Index p1)`
- `public SELF doesNotContain(int... p0)`
- `public SELF doesNotContain(java.lang.Byte[] p0)`
- `public SELF doesNotHaveDuplicates()`
- `public org.assertj.core.api.AbstractStringAssert encodedAsBase64()`
- `public SELF endsWith(byte... p0)`
- `public SELF endsWith(int... p0)`
- `public SELF endsWith(java.lang.Byte[] p0)`
- `public SELF hasSameSizeAs(java.lang.Iterable p0)`
- `public SELF hasSize(int p0)`
- `public SELF hasSizeBetween(int p0, int p1)`
- `public SELF hasSizeGreaterThan(int p0)`
- `public SELF hasSizeGreaterThanOrEqualTo(int p0)`
- `public SELF hasSizeLessThan(int p0)`
- `public SELF hasSizeLessThanOrEqualTo(int p0)`
- `public void isEmpty()`
- `public SELF isNotEmpty()`
- `public void isNullOrEmpty()`
- `public SELF isSorted()`
- `public SELF isSortedAccordingTo(java.util.Comparator p0)`
- `public SELF startsWith(byte... p0)`
- `public SELF startsWith(int... p0)`
- `public SELF startsWith(java.lang.Byte[] p0)`
- `public SELF usingDefaultElementComparator()`
- `public SELF usingElementComparator(java.util.Comparator p0)`

---

## public abstract class `org.assertj.core.api.AbstractByteAssert`<SELF extends org.assertj.core.api.AbstractByteAssert<SELF>>
extends `org.assertj.core.api.AbstractComparableAssert`  
implements `org.assertj.core.api.NumberAssert<SELF,java.lang.Byte>`  

**Constructors:**
- `protected AbstractByteAssert(java.lang.Byte p0, java.lang.Class p1)`

**Methods:**
- `public SELF isBetween(java.lang.Byte p0, java.lang.Byte p1)`
- `public SELF isCloseTo(byte p0, org.assertj.core.data.Offset p1)`
- `public SELF isCloseTo(byte p0, org.assertj.core.data.Percentage p1)`
- `public SELF isCloseTo(java.lang.Byte p0, org.assertj.core.data.Offset p1)`
- `public SELF isCloseTo(java.lang.Byte p0, org.assertj.core.data.Percentage p1)`
- `public SELF isEqualTo(byte p0)`
- `public SELF isEven()`
- `public SELF isGreaterThan(byte p0)`
- `public SELF isGreaterThanOrEqualTo(byte p0)`
- `public SELF isLessThan(byte p0)`
- `public SELF isLessThanOrEqualTo(byte p0)`
- `public SELF isNegative()`
- `public SELF isNotCloseTo(byte p0, org.assertj.core.data.Offset p1)`
- `public SELF isNotCloseTo(byte p0, org.assertj.core.data.Percentage p1)`
- `public SELF isNotCloseTo(java.lang.Byte p0, org.assertj.core.data.Offset p1)`
- `public SELF isNotCloseTo(java.lang.Byte p0, org.assertj.core.data.Percentage p1)`
- `public SELF isNotEqualTo(byte p0)`
- `public SELF isNotNegative()`
- `public SELF isNotPositive()`
- `public SELF isNotZero()`
- `public SELF isOdd()`
- `public SELF isOne()`
- `public SELF isPositive()`
- `public SELF isStrictlyBetween(java.lang.Byte p0, java.lang.Byte p1)`
- `public SELF isZero()`
- `public SELF usingComparator(java.util.Comparator p0)`
- `public SELF usingComparator(java.util.Comparator p0, java.lang.String p1)`
- `public SELF usingDefaultComparator()`

---

## public abstract class `org.assertj.core.api.AbstractCharArrayAssert`<SELF extends org.assertj.core.api.AbstractCharArrayAssert<SELF>>
extends `org.assertj.core.api.AbstractArrayAssert`  

**Constructors:**
- `protected AbstractCharArrayAssert(char[] p0, java.lang.Class p1)`

**Fields:**
- `protected org.assertj.core.internal.CharArrays arrays`

**Methods:**
- `public SELF contains(char p0, org.assertj.core.data.Index p1)`
- `public SELF contains(char... p0)`
- `public SELF contains(java.lang.Character[] p0)`
- `public SELF containsAnyOf(char... p0)`
- `public SELF containsAnyOf(java.lang.Character[] p0)`
- `public SELF containsExactly(char... p0)`
- `public SELF containsExactly(java.lang.Character[] p0)`
- `public SELF containsExactlyInAnyOrder(char... p0)`
- `public SELF containsExactlyInAnyOrder(java.lang.Character[] p0)`
- `public SELF containsOnly(char... p0)`
- `public SELF containsOnly(java.lang.Character[] p0)`
- `public SELF containsOnlyOnce(char... p0)`
- `public SELF containsOnlyOnce(java.lang.Character[] p0)`
- `public SELF containsSequence(char... p0)`
- `public SELF containsSequence(java.lang.Character[] p0)`
- `public SELF containsSubsequence(char... p0)`
- `public SELF containsSubsequence(java.lang.Character[] p0)`
- `public SELF doesNotContain(char p0, org.assertj.core.data.Index p1)`
- `public SELF doesNotContain(char... p0)`
- `public SELF doesNotContain(java.lang.Character[] p0)`
- `public SELF doesNotHaveDuplicates()`
- `public SELF endsWith(char... p0)`
- `public SELF endsWith(java.lang.Character[] p0)`
- `public SELF hasSameSizeAs(java.lang.Iterable p0)`
- `public SELF hasSize(int p0)`
- `public SELF hasSizeBetween(int p0, int p1)`
- `public SELF hasSizeGreaterThan(int p0)`
- `public SELF hasSizeGreaterThanOrEqualTo(int p0)`
- `public SELF hasSizeLessThan(int p0)`
- `public SELF hasSizeLessThanOrEqualTo(int p0)`
- `public SELF inUnicode()`
- `public void isEmpty()`
- `public SELF isNotEmpty()`
- `public void isNullOrEmpty()`
- `public SELF isSorted()`
- `public SELF isSortedAccordingTo(java.util.Comparator p0)`
- `public SELF startsWith(char... p0)`
- `public SELF startsWith(java.lang.Character[] p0)`
- `public SELF usingDefaultElementComparator()`
- `public SELF usingElementComparator(java.util.Comparator p0)`

---

## public abstract class `org.assertj.core.api.AbstractCharSequenceAssert`<SELF extends org.assertj.core.api.AbstractCharSequenceAssert<SELF, ACTUAL>, ACTUAL extends java.lang.CharSequence>
extends `org.assertj.core.api.AbstractAssert`  
implements `org.assertj.core.api.EnumerableAssert<SELF,java.lang.Character>`  

**Constructors:**
- `protected AbstractCharSequenceAssert(ACTUAL p0, java.lang.Class p1)`

**Methods:**
- `public SELF contains(java.lang.CharSequence... p0)`
- `public SELF contains(java.lang.Iterable p0)`
- `public SELF containsAnyOf(java.lang.CharSequence... p0)`
- `public SELF containsIgnoringCase(java.lang.CharSequence p0)`
- `public SELF containsIgnoringNewLines(java.lang.CharSequence... p0)`
- `public SELF containsIgnoringWhitespaces(java.lang.CharSequence... p0)`
- `public SELF containsOnlyDigits()`
- `public SELF containsOnlyOnce(java.lang.CharSequence p0)`
- `public SELF containsOnlyWhitespaces()`
- `public SELF containsPattern(java.lang.CharSequence p0)`
- `public SELF containsPattern(java.util.regex.Pattern p0)`
- `public SELF containsSequence(java.lang.CharSequence... p0)`
- `public SELF containsSequence(java.lang.Iterable p0)`
- `public SELF containsSubsequence(java.lang.CharSequence... p0)`
- `public SELF containsSubsequence(java.lang.Iterable p0)`
- `public SELF containsWhitespaces()`
- `public SELF doesNotContain(java.lang.CharSequence... p0)`
- `public SELF doesNotContain(java.lang.Iterable p0)`
- `public SELF doesNotContainAnyWhitespaces()`
- `public SELF doesNotContainIgnoringCase(java.lang.CharSequence... p0)`
- `public SELF doesNotContainOnlyWhitespaces()`
- `public SELF doesNotContainPattern(java.lang.CharSequence p0)`
- `public SELF doesNotContainPattern(java.util.regex.Pattern p0)`
- `public SELF doesNotEndWith(java.lang.CharSequence p0)`
- `public SELF doesNotEndWithIgnoringCase(java.lang.CharSequence p0)`
- `public SELF doesNotMatch(java.lang.CharSequence p0)`
- `public SELF doesNotMatch(java.util.regex.Pattern p0)`
- `public SELF doesNotStartWith(java.lang.CharSequence p0)`
- `public SELF doesNotStartWithIgnoringCase(java.lang.CharSequence p0)`
- `public SELF endsWith(java.lang.CharSequence p0)`
- `public SELF endsWithIgnoringCase(java.lang.CharSequence p0)`
- `public SELF hasLineCount(int p0)`
- `public SELF hasSameSizeAs(java.lang.CharSequence p0)`
- `public SELF hasSameSizeAs(java.lang.Iterable p0)`
- `public SELF hasSameSizeAs(java.lang.Object p0)`
- `public SELF hasSize(int p0)`
- `public SELF hasSizeBetween(int p0, int p1)`
- `public SELF hasSizeGreaterThan(int p0)`
- `public SELF hasSizeGreaterThanOrEqualTo(int p0)`
- `public SELF hasSizeLessThan(int p0)`
- `public SELF hasSizeLessThanOrEqualTo(int p0)`
- `public SELF inHexadecimal()`
- `public SELF inUnicode()`
- `public SELF isBlank()`
- `public void isEmpty()`
- `public SELF isEqualToIgnoringCase(java.lang.CharSequence p0)`
- `public SELF isEqualToIgnoringNewLines(java.lang.CharSequence p0)`
- `public SELF isEqualToIgnoringWhitespace(java.lang.CharSequence p0)`
- `public SELF isEqualToNormalizingNewlines(java.lang.CharSequence p0)`
- `public SELF isEqualToNormalizingPunctuationAndWhitespace(java.lang.CharSequence p0)`
- `public SELF isEqualToNormalizingUnicode(java.lang.CharSequence p0)`
- `public SELF isEqualToNormalizingWhitespace(java.lang.CharSequence p0)`
- `public SELF isJavaBlank()`
- `public SELF isLowerCase()`
- `public SELF isMixedCase()`
- `public SELF isNotBlank()`
- `public SELF isNotEmpty()`
- `public SELF isNotEqualToIgnoringCase(java.lang.CharSequence p0)`
- `public SELF isNotEqualToIgnoringWhitespace(java.lang.CharSequence p0)`
- `public SELF isNotEqualToNormalizingWhitespace(java.lang.CharSequence p0)`
- `public SELF isNotJavaBlank()`
- `public void isNullOrEmpty()`
- `public SELF isSubstringOf(java.lang.CharSequence p0)`
- `public SELF isUpperCase()`
- `public SELF isXmlEqualTo(java.lang.CharSequence p0)`
- `public SELF isXmlEqualToContentOf(java.io.File p0)`
- `public SELF matches(java.lang.CharSequence p0)`
- `public SELF matches(java.util.regex.Pattern p0)`
- `public SELF startsWith(java.lang.CharSequence p0)`
- `public SELF startsWithIgnoringCase(java.lang.CharSequence p0)`
- `public SELF usingComparator(java.util.Comparator p0)`
- `public SELF usingComparator(java.util.Comparator p0, java.lang.String p1)`
- `public SELF usingDefaultComparator()`
- `public final SELF usingDefaultElementComparator()`
- `public final SELF usingElementComparator(java.util.Comparator p0)`

---

## public abstract class `org.assertj.core.api.AbstractCharacterAssert`<SELF extends org.assertj.core.api.AbstractCharacterAssert<SELF>>
extends `org.assertj.core.api.AbstractComparableAssert`  

**Constructors:**
- `protected AbstractCharacterAssert(java.lang.Character p0, java.lang.Class p1)`

**Methods:**
- `public SELF inUnicode()`
- `public SELF isEqualTo(char p0)`
- `public SELF isGreaterThan(char p0)`
- `public SELF isGreaterThanOrEqualTo(char p0)`
- `public SELF isLessThan(char p0)`
- `public SELF isLessThanOrEqualTo(char p0)`
- `public SELF isLowerCase()`
- `public SELF isNotEqualTo(char p0)`
- `public SELF isUpperCase()`
- `public SELF usingComparator(java.util.Comparator p0)`
- `public SELF usingComparator(java.util.Comparator p0, java.lang.String p1)`
- `public SELF usingDefaultComparator()`

---

## public abstract class `org.assertj.core.api.AbstractClassAssert`<SELF extends org.assertj.core.api.AbstractClassAssert<SELF>>
extends `org.assertj.core.api.AbstractAssert`  

**Constructors:**
- `protected AbstractClassAssert(java.lang.Class p0, java.lang.Class p1)`

**Methods:**
- `public SELF hasAnnotation(java.lang.Class p0)`
- `public final SELF hasAnnotations(java.lang.Class... p0)`
- `protected SELF hasAnnotationsForProxy(java.lang.Class[] p0)`
- `public SELF hasDeclaredFields(java.lang.String... p0)`
- `public SELF hasDeclaredMethods(java.lang.String... p0)`
- `public SELF hasFields(java.lang.String... p0)`
- `public SELF hasMethods(java.lang.String... p0)`
- `public SELF hasNoSuperclass()`
- `public SELF hasOnlyDeclaredFields(java.lang.String... p0)`
- `public SELF hasOnlyPublicFields(java.lang.String... p0)`
- `public SELF hasPackage(java.lang.Package p0)`
- `public SELF hasPackage(java.lang.String p0)`
- `public SELF hasPublicFields(java.lang.String... p0)`
- `public SELF hasPublicMethods(java.lang.String... p0)`
- `public SELF hasSuperclass(java.lang.Class p0)`
- `public SELF isAbstract()`
- `public SELF isAnnotation()`
- `public SELF isAssignableFrom(java.lang.Class... p0)`
- `public SELF isFinal()`
- `public SELF isInterface()`
- `public SELF isNotAnnotation()`
- `public SELF isNotFinal()`
- `public SELF isNotInterface()`
- `public SELF isNotStatic()`
- `public SELF isPackagePrivate()`
- `public SELF isProtected()`
- `public SELF isPublic()`
- `public SELF isStatic()`

---

## public abstract class `org.assertj.core.api.AbstractCollectionAssert`<SELF extends org.assertj.core.api.AbstractCollectionAssert<SELF, ACTUAL, ELEMENT, ELEMENT_ASSERT>, ACTUAL extends java.util.Collection<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>>
extends `org.assertj.core.api.AbstractIterableAssert`  

**Constructors:**
- `protected AbstractCollectionAssert(ACTUAL p0, java.lang.Class p1)`

**Methods:**
- `public SELF isUnmodifiable()`

---

## public abstract class `org.assertj.core.api.AbstractComparableAssert`<SELF extends org.assertj.core.api.AbstractComparableAssert<SELF, ACTUAL>, ACTUAL extends java.lang.Comparable<? super ACTUAL>>
extends `org.assertj.core.api.AbstractObjectAssert`  
implements `org.assertj.core.api.ComparableAssert<SELF,ACTUAL>`  

**Constructors:**
- `protected AbstractComparableAssert(ACTUAL p0, java.lang.Class p1)`

**Methods:**
- `public SELF inBinary()`
- `public SELF inHexadecimal()`
- `public SELF isBetween(ACTUAL p0, ACTUAL p1)`
- `public SELF isEqualByComparingTo(ACTUAL p0)`
- `public SELF isGreaterThan(ACTUAL p0)`
- `public SELF isGreaterThanOrEqualTo(ACTUAL p0)`
- `public SELF isLessThan(ACTUAL p0)`
- `public SELF isLessThanOrEqualTo(ACTUAL p0)`
- `public SELF isNotEqualByComparingTo(ACTUAL p0)`
- `public SELF isStrictlyBetween(ACTUAL p0, ACTUAL p1)`
- `public SELF usingComparator(java.util.Comparator p0)`
- `public SELF usingComparator(java.util.Comparator p0, java.lang.String p1)`
- `public SELF usingDefaultComparator()`

---

## public abstract class `org.assertj.core.api.AbstractCompletableFutureAssert`<SELF extends org.assertj.core.api.AbstractCompletableFutureAssert<SELF, RESULT>, RESULT extends java.lang.Object>
extends `org.assertj.core.api.AbstractAssert`  

**Constructors:**
- `protected AbstractCompletableFutureAssert(java.util.concurrent.CompletableFuture p0, java.lang.Class p1)`

**Methods:**
- `public org.assertj.core.api.WithThrowable failsWithin(java.time.Duration p0)`
- `public org.assertj.core.api.WithThrowable failsWithin(long p0, java.util.concurrent.TimeUnit p1)`
- `public SELF hasFailed()`
- `public org.assertj.core.api.AbstractThrowableAssert hasFailedWithThrowableThat()`
- `public SELF hasNotFailed()`
- `public SELF isCancelled()`
- `public SELF isCompleted()`
- `public SELF isCompletedExceptionally()`
- `public SELF isCompletedWithValue(RESULT p0)`
- `public SELF isCompletedWithValueMatching(java.util.function.Predicate p0)`
- `public SELF isCompletedWithValueMatching(java.util.function.Predicate p0, java.lang.String p1)`
- `public SELF isDone()`
- `public SELF isNotCancelled()`
- `public SELF isNotCompleted()`
- `public SELF isNotCompletedExceptionally()`
- `public SELF isNotDone()`
- `protected org.assertj.core.api.ObjectAssert newObjectAssert(RESULT p0)`
- `public org.assertj.core.api.ObjectAssert succeedsWithin(java.time.Duration p0)`
- `public <ASSERT extends org.assertj.core.api.AbstractAssert<? extends java.lang.Object, ? extends java.lang.Object>> ASSERT succeedsWithin(java.time.Duration p0, org.assertj.core.api.InstanceOfAssertFactory p1)`
- `public org.assertj.core.api.ObjectAssert succeedsWithin(long p0, java.util.concurrent.TimeUnit p1)`
- `public <ASSERT extends org.assertj.core.api.AbstractAssert<? extends java.lang.Object, ? extends java.lang.Object>> ASSERT succeedsWithin(long p0, java.util.concurrent.TimeUnit p1, org.assertj.core.api.InstanceOfAssertFactory p2)`

---

## public abstract class `org.assertj.core.api.AbstractDateAssert`<SELF extends org.assertj.core.api.AbstractDateAssert<SELF>>
extends `org.assertj.core.api.AbstractAssert`  

**Constructors:**
- `protected AbstractDateAssert(java.util.Date p0, java.lang.Class p1)`

**Methods:**
- `public SELF hasDayOfMonth(int p0)`
- `public SELF hasDayOfWeek(int p0)`
- `public SELF hasHourOfDay(int p0)`
- `public SELF hasMillisecond(int p0)`
- `public SELF hasMinute(int p0)`
- `public SELF hasMonth(int p0)`
- `public SELF hasSameTimeAs(java.lang.String p0)`
- `public SELF hasSameTimeAs(java.util.Date p0)`
- `public SELF hasSecond(int p0)`
- `public SELF hasTime(long p0)`
- `public SELF hasYear(int p0)`
- `public SELF isAfter(java.lang.String p0)`
- `public SELF isAfter(java.time.Instant p0)`
- `public SELF isAfter(java.util.Date p0)`
- `public SELF isAfterOrEqualTo(java.lang.String p0)`
- `public SELF isAfterOrEqualTo(java.time.Instant p0)`
- `public SELF isAfterOrEqualTo(java.util.Date p0)`
- `public SELF isAfterOrEqualsTo(java.lang.String p0)`
- `public SELF isAfterOrEqualsTo(java.util.Date p0)`
- `public SELF isAfterYear(int p0)`
- `public SELF isBefore(java.lang.String p0)`
- `public SELF isBefore(java.time.Instant p0)`
- `public SELF isBefore(java.util.Date p0)`
- `public SELF isBeforeOrEqualTo(java.lang.String p0)`
- `public SELF isBeforeOrEqualTo(java.time.Instant p0)`
- `public SELF isBeforeOrEqualTo(java.util.Date p0)`
- `public SELF isBeforeOrEqualsTo(java.lang.String p0)`
- `public SELF isBeforeOrEqualsTo(java.util.Date p0)`
- `public SELF isBeforeYear(int p0)`
- `public SELF isBetween(java.lang.String p0, java.lang.String p1)`
- `public SELF isBetween(java.lang.String p0, java.lang.String p1, boolean p2, boolean p3)`
- `public SELF isBetween(java.time.Instant p0, java.time.Instant p1)`
- `public SELF isBetween(java.time.Instant p0, java.time.Instant p1, boolean p2, boolean p3)`
- `public SELF isBetween(java.util.Date p0, java.util.Date p1)`
- `public SELF isBetween(java.util.Date p0, java.util.Date p1, boolean p2, boolean p3)`
- `public SELF isCloseTo(java.lang.String p0, long p1)`
- `public SELF isCloseTo(java.time.Instant p0, long p1)`
- `public SELF isCloseTo(java.util.Date p0, long p1)`
- `public SELF isEqualTo(java.lang.String p0)`
- `public SELF isEqualTo(java.time.Instant p0)`
- `public SELF isEqualToIgnoringHours(java.lang.String p0)`
- `public SELF isEqualToIgnoringHours(java.time.Instant p0)`
- `public SELF isEqualToIgnoringHours(java.util.Date p0)`
- `public SELF isEqualToIgnoringMillis(java.lang.String p0)`
- `public SELF isEqualToIgnoringMillis(java.time.Instant p0)`
- `public SELF isEqualToIgnoringMillis(java.util.Date p0)`
- `public SELF isEqualToIgnoringMinutes(java.lang.String p0)`
- `public SELF isEqualToIgnoringMinutes(java.time.Instant p0)`
- `public SELF isEqualToIgnoringMinutes(java.util.Date p0)`
- `public SELF isEqualToIgnoringSeconds(java.lang.String p0)`
- `public SELF isEqualToIgnoringSeconds(java.time.Instant p0)`
- `public SELF isEqualToIgnoringSeconds(java.util.Date p0)`
- `public SELF isIn(java.lang.String... p0)`
- `public SELF isIn(java.time.Instant... p0)`
- `public SELF isInSameDayAs(java.lang.String p0)`
- `public SELF isInSameDayAs(java.time.Instant p0)`
- `public SELF isInSameDayAs(java.util.Date p0)`
- `public SELF isInSameHourAs(java.lang.String p0)`
- `public SELF isInSameHourAs(java.util.Date p0)`
- `public SELF isInSameHourWindowAs(java.lang.String p0)`
- `public SELF isInSameHourWindowAs(java.time.Instant p0)`
- `public SELF isInSameHourWindowAs(java.util.Date p0)`
- `public SELF isInSameMinuteAs(java.lang.String p0)`
- `public SELF isInSameMinuteAs(java.util.Date p0)`
- `public SELF isInSameMinuteWindowAs(java.lang.String p0)`
- `public SELF isInSameMinuteWindowAs(java.time.Instant p0)`
- `public SELF isInSameMinuteWindowAs(java.util.Date p0)`
- `public SELF isInSameMonthAs(java.lang.String p0)`
- `public SELF isInSameMonthAs(java.time.Instant p0)`
- `public SELF isInSameMonthAs(java.util.Date p0)`
- `public SELF isInSameSecondAs(java.lang.String p0)`
- `public SELF isInSameSecondAs(java.util.Date p0)`
- `public SELF isInSameSecondWindowAs(java.lang.String p0)`
- `public SELF isInSameSecondWindowAs(java.time.Instant p0)`
- `public SELF isInSameSecondWindowAs(java.util.Date p0)`
- `public SELF isInSameYearAs(java.lang.String p0)`
- `public SELF isInSameYearAs(java.time.Instant p0)`
- `public SELF isInSameYearAs(java.util.Date p0)`
- `public SELF isInTheFuture()`
- `public SELF isInThePast()`
- `public SELF isInWithStringDateCollection(java.util.Collection p0)`
- `public SELF isNotBetween(java.lang.String p0, java.lang.String p1)`
- `public SELF isNotBetween(java.lang.String p0, java.lang.String p1, boolean p2, boolean p3)`
- `public SELF isNotBetween(java.time.Instant p0, java.time.Instant p1)`
- `public SELF isNotBetween(java.time.Instant p0, java.time.Instant p1, boolean p2, boolean p3)`
- `public SELF isNotBetween(java.util.Date p0, java.util.Date p1)`
- `public SELF isNotBetween(java.util.Date p0, java.util.Date p1, boolean p2, boolean p3)`
- `public SELF isNotEqualTo(java.lang.String p0)`
- `public SELF isNotEqualTo(java.time.Instant p0)`
- `public SELF isNotIn(java.lang.String... p0)`
- `public SELF isNotIn(java.time.Instant... p0)`
- `public SELF isNotInWithStringDateCollection(java.util.Collection p0)`
- `public SELF isToday()`
- `public SELF isWithinDayOfMonth(int p0)`
- `public SELF isWithinDayOfWeek(int p0)`
- `public SELF isWithinHourOfDay(int p0)`
- `public SELF isWithinMillisecond(int p0)`
- `public SELF isWithinMinute(int p0)`
- `public SELF isWithinMonth(int p0)`
- `public SELF isWithinSecond(int p0)`
- `public SELF isWithinYear(int p0)`
- `public static void registerCustomDateFormat(java.lang.String p0)`
- `public static void registerCustomDateFormat(java.text.DateFormat p0)`
- `public static void setLenientDateParsing(boolean p0)`
- `public static void useDefaultDateFormatsOnly()`
- `public SELF usingComparator(java.util.Comparator p0)`
- `public SELF usingComparator(java.util.Comparator p0, java.lang.String p1)`
- `public SELF usingDefaultComparator()`
- `public SELF withDateFormat(java.lang.String p0)`
- `public SELF withDateFormat(java.text.DateFormat p0)`
- `public SELF withDefaultDateFormatsOnly()`

---

## public abstract class `org.assertj.core.api.AbstractDoubleArrayAssert`<SELF extends org.assertj.core.api.AbstractDoubleArrayAssert<SELF>>
extends `org.assertj.core.api.AbstractArrayAssert`  

**Constructors:**
- `protected AbstractDoubleArrayAssert(double[] p0, java.lang.Class p1)`

**Fields:**
- `protected org.assertj.core.internal.DoubleArrays arrays`

**Methods:**
- `public SELF contains(double p0, org.assertj.core.data.Index p1)`
- `public SELF contains(double p0, org.assertj.core.data.Index p1, org.assertj.core.data.Offset p2)`
- `public SELF contains(double... p0)`
- `public SELF contains(double[] p0, org.assertj.core.data.Offset p1)`
- `public SELF contains(java.lang.Double[] p0)`
- `public SELF contains(java.lang.Double[] p0, org.assertj.core.data.Offset p1)`
- `public SELF containsAnyOf(double... p0)`
- `public SELF containsAnyOf(java.lang.Double[] p0)`
- `public SELF containsExactly(double... p0)`
- `public SELF containsExactly(double[] p0, org.assertj.core.data.Offset p1)`
- `public SELF containsExactly(java.lang.Double[] p0)`
- `public SELF containsExactly(java.lang.Double[] p0, org.assertj.core.data.Offset p1)`
- `public SELF containsExactlyInAnyOrder(double... p0)`
- `public SELF containsExactlyInAnyOrder(java.lang.Double[] p0)`
- `public SELF containsOnly(double... p0)`
- `public SELF containsOnly(double[] p0, org.assertj.core.data.Offset p1)`
- `public SELF containsOnly(java.lang.Double[] p0)`
- `public SELF containsOnly(java.lang.Double[] p0, org.assertj.core.data.Offset p1)`
- `public SELF containsOnlyOnce(double... p0)`
- `public SELF containsOnlyOnce(double[] p0, org.assertj.core.data.Offset p1)`
- `public SELF containsOnlyOnce(java.lang.Double[] p0)`
- `public SELF containsOnlyOnce(java.lang.Double[] p0, org.assertj.core.data.Offset p1)`
- `public SELF containsSequence(double... p0)`
- `public SELF containsSequence(double[] p0, org.assertj.core.data.Offset p1)`
- `public SELF containsSequence(java.lang.Double[] p0)`
- `public SELF containsSequence(java.lang.Double[] p0, org.assertj.core.data.Offset p1)`
- `public SELF containsSubsequence(double... p0)`
- `public SELF containsSubsequence(double[] p0, org.assertj.core.data.Offset p1)`
- `public SELF containsSubsequence(java.lang.Double[] p0)`
- `public SELF containsSubsequence(java.lang.Double[] p0, org.assertj.core.data.Offset p1)`
- `public SELF doesNotContain(double p0, org.assertj.core.data.Index p1)`
- `public SELF doesNotContain(double p0, org.assertj.core.data.Index p1, org.assertj.core.data.Offset p2)`
- `public SELF doesNotContain(double... p0)`
- `public SELF doesNotContain(double[] p0, org.assertj.core.data.Offset p1)`
- `public SELF doesNotContain(java.lang.Double[] p0)`
- `public SELF doesNotContain(java.lang.Double[] p0, org.assertj.core.data.Offset p1)`
- `public SELF doesNotHaveDuplicates()`
- `public SELF doesNotHaveDuplicates(org.assertj.core.data.Offset p0)`
- `public SELF endsWith(double... p0)`
- `public SELF endsWith(double[] p0, org.assertj.core.data.Offset p1)`
- `public SELF endsWith(java.lang.Double[] p0)`
- `public SELF endsWith(java.lang.Double[] p0, org.assertj.core.data.Offset p1)`
- `public SELF hasSameSizeAs(java.lang.Iterable p0)`
- `public SELF hasSize(int p0)`
- `public SELF hasSizeBetween(int p0, int p1)`
- `public SELF hasSizeGreaterThan(int p0)`
- `public SELF hasSizeGreaterThanOrEqualTo(int p0)`
- `public SELF hasSizeLessThan(int p0)`
- `public SELF hasSizeLessThanOrEqualTo(int p0)`
- `public void isEmpty()`
- `public SELF isNotEmpty()`
- `public void isNullOrEmpty()`
- `public SELF isSorted()`
- `public SELF isSortedAccordingTo(java.util.Comparator p0)`
- `public SELF startsWith(double... p0)`
- `public SELF startsWith(double[] p0, org.assertj.core.data.Offset p1)`
- `public SELF startsWith(java.lang.Double[] p0)`
- `public SELF startsWith(java.lang.Double[] p0, org.assertj.core.data.Offset p1)`
- `public SELF usingComparatorWithPrecision(java.lang.Double p0)`
- `public SELF usingDefaultElementComparator()`
- `public SELF usingElementComparator(java.util.Comparator p0)`

---

## public abstract class `org.assertj.core.api.AbstractDoubleAssert`<SELF extends org.assertj.core.api.AbstractDoubleAssert<SELF>>
extends `org.assertj.core.api.AbstractComparableAssert`  
implements `org.assertj.core.api.FloatingPointNumberAssert<SELF,java.lang.Double>`  

**Constructors:**
- `public AbstractDoubleAssert(double p0, java.lang.Class p1)`
- `protected AbstractDoubleAssert(java.lang.Double p0, java.lang.Class p1)`

**Methods:**
- `public SELF isBetween(java.lang.Double p0, java.lang.Double p1)`
- `public SELF isCloseTo(double p0, org.assertj.core.data.Offset p1)`
- `public SELF isCloseTo(double p0, org.assertj.core.data.Percentage p1)`
- `public SELF isCloseTo(java.lang.Double p0, org.assertj.core.data.Offset p1)`
- `public SELF isCloseTo(java.lang.Double p0, org.assertj.core.data.Percentage p1)`
- `public SELF isEqualTo(double p0)`
- `public SELF isEqualTo(double p0, org.assertj.core.data.Offset p1)`
- `public SELF isEqualTo(java.lang.Double p0)`
- `public SELF isEqualTo(java.lang.Double p0, org.assertj.core.data.Offset p1)`
- `public SELF isFinite()`
- `public SELF isGreaterThan(double p0)`
- `public SELF isGreaterThanOrEqualTo(double p0)`
- `public SELF isGreaterThanOrEqualTo(java.lang.Double p0)`
- `public SELF isInfinite()`
- `public SELF isLessThan(double p0)`
- `public SELF isLessThanOrEqualTo(double p0)`
- `public SELF isLessThanOrEqualTo(java.lang.Double p0)`
- `public SELF isNaN()`
- `public SELF isNegative()`
- `public SELF isNotCloseTo(double p0, org.assertj.core.data.Offset p1)`
- `public SELF isNotCloseTo(double p0, org.assertj.core.data.Percentage p1)`
- `public SELF isNotCloseTo(java.lang.Double p0, org.assertj.core.data.Offset p1)`
- `public SELF isNotCloseTo(java.lang.Double p0, org.assertj.core.data.Percentage p1)`
- `public SELF isNotEqualTo(double p0)`
- `public SELF isNotEqualTo(java.lang.Double p0)`
- `public SELF isNotFinite()`
- `public SELF isNotInfinite()`
- `public SELF isNotNaN()`
- `public SELF isNotNegative()`
- `public SELF isNotPositive()`
- `public SELF isNotZero()`
- `public SELF isOne()`
- `public SELF isPositive()`
- `public SELF isStrictlyBetween(java.lang.Double p0, java.lang.Double p1)`
- `public SELF isZero()`
- `public SELF usingComparator(java.util.Comparator p0)`
- `public SELF usingComparator(java.util.Comparator p0, java.lang.String p1)`
- `public SELF usingDefaultComparator()`

---

## public abstract class `org.assertj.core.api.AbstractDurationAssert`<SELF extends org.assertj.core.api.AbstractDurationAssert<SELF>>
extends `org.assertj.core.api.AbstractComparableAssert`  

**Constructors:**
- `protected AbstractDurationAssert(java.time.Duration p0, java.lang.Class p1)`

**Methods:**
- `public SELF hasDays(long p0)`
- `public SELF hasHours(long p0)`
- `public SELF hasMillis(long p0)`
- `public SELF hasMinutes(long p0)`
- `public SELF hasNanos(long p0)`
- `public SELF hasSeconds(long p0)`
- `public SELF isCloseTo(java.time.Duration p0, java.time.Duration p1)`
- `public SELF isNegative()`
- `public SELF isPositive()`
- `public SELF isZero()`

---

## public abstract class `org.assertj.core.api.AbstractEnumerableAssert`<SELF extends org.assertj.core.api.AbstractEnumerableAssert<SELF, ACTUAL, ELEMENT>, ACTUAL extends java.lang.Object, ELEMENT extends java.lang.Object>
extends `org.assertj.core.api.AbstractAssert`  
implements `org.assertj.core.api.EnumerableAssert<org.assertj.core.api.AbstractEnumerableAssert<SELF,ACTUAL,ELEMENT>,ELEMENT>`  

**Constructors:**
- `protected AbstractEnumerableAssert(ACTUAL p0, java.lang.Class p1)`

**Methods:**
- `public SELF hasSameSizeAs(java.lang.Object p0)`
- `public SELF inBinary()`
- `public SELF inHexadecimal()`

---

## public abstract class `org.assertj.core.api.AbstractFileAssert`<SELF extends org.assertj.core.api.AbstractFileAssert<SELF>>
extends `org.assertj.core.api.AbstractAssert`  

**Constructors:**
- `protected AbstractFileAssert(java.io.File p0, java.lang.Class p1)`

**Methods:**
- `public org.assertj.core.api.AbstractByteArrayAssert binaryContent()`
- `public SELF canRead()`
- `public SELF canWrite()`
- `public org.assertj.core.api.AbstractStringAssert content()`
- `public org.assertj.core.api.AbstractStringAssert content(java.nio.charset.Charset p0)`
- `public SELF doesNotExist()`
- `public SELF exists()`
- `public SELF hasBinaryContent(byte[] p0)`
- `public SELF hasContent(java.lang.String p0)`
- `public SELF hasContentEqualTo(java.io.File p0)`
- `public SELF hasDigest(java.lang.String p0, byte[] p1)`
- `public SELF hasDigest(java.lang.String p0, java.lang.String p1)`
- `public SELF hasDigest(java.security.MessageDigest p0, byte[] p1)`
- `public SELF hasDigest(java.security.MessageDigest p0, java.lang.String p1)`
- `public SELF hasExtension(java.lang.String p0)`
- `public SELF hasFileName(java.lang.String p0)`
- `public SELF hasName(java.lang.String p0)`
- `public SELF hasNoExtension()`
- `public SELF hasNoParent()`
- `public SELF hasParent(java.io.File p0)`
- `public SELF hasParent(java.lang.String p0)`
- `public SELF hasSameBinaryContentAs(java.io.File p0)`
- `public SELF hasSameContentAs(java.io.File p0)`
- `public SELF hasSameContentAs(java.io.File p0, java.nio.charset.Charset p1)`
- `public SELF hasSameTextualContentAs(java.io.File p0)`
- `public SELF hasSameTextualContentAs(java.io.File p0, java.nio.charset.Charset p1)`
- `public SELF hasSize(long p0)`
- `public SELF isAbsolute()`
- `public SELF isDirectory()`
- `public SELF isDirectoryContaining(java.lang.String p0)`
- `public SELF isDirectoryContaining(java.util.function.Predicate p0)`
- `public SELF isDirectoryNotContaining(java.lang.String p0)`
- `public SELF isDirectoryNotContaining(java.util.function.Predicate p0)`
- `public SELF isDirectoryRecursivelyContaining(java.lang.String p0)`
- `public SELF isDirectoryRecursivelyContaining(java.util.function.Predicate p0)`
- `public SELF isEmpty()`
- `public SELF isEmptyDirectory()`
- `public SELF isFile()`
- `public SELF isNotEmpty()`
- `public SELF isNotEmptyDirectory()`
- `public SELF isReadable()`
- `public SELF isRelative()`
- `public SELF isWritable()`
- `public org.assertj.core.api.AbstractFileSizeAssert size()`
- `public SELF usingCharset(java.lang.String p0)`
- `public SELF usingCharset(java.nio.charset.Charset p0)`

---

## public abstract class `org.assertj.core.api.AbstractFileSizeAssert`<SELF extends org.assertj.core.api.AbstractFileAssert<SELF>>
extends `org.assertj.core.api.AbstractLongAssert`  

**Constructors:**
- `protected AbstractFileSizeAssert(java.lang.Long p0, java.lang.Class p1)`

**Methods:**
- `public abstract org.assertj.core.api.AbstractFileAssert returnToFile()`

---

## public abstract class `org.assertj.core.api.AbstractFloatArrayAssert`<SELF extends org.assertj.core.api.AbstractFloatArrayAssert<SELF>>
extends `org.assertj.core.api.AbstractArrayAssert`  

**Constructors:**
- `protected AbstractFloatArrayAssert(float[] p0, java.lang.Class p1)`

**Fields:**
- `protected org.assertj.core.internal.FloatArrays arrays`

**Methods:**
- `public SELF contains(float p0, org.assertj.core.data.Index p1)`
- `public SELF contains(float p0, org.assertj.core.data.Index p1, org.assertj.core.data.Offset p2)`
- `public SELF contains(float... p0)`
- `public SELF contains(float[] p0, org.assertj.core.data.Offset p1)`
- `public SELF contains(java.lang.Float[] p0)`
- `public SELF contains(java.lang.Float[] p0, org.assertj.core.data.Offset p1)`
- `public SELF containsAnyOf(float... p0)`
- `public SELF containsAnyOf(java.lang.Float[] p0)`
- `public SELF containsExactly(float... p0)`
- `public SELF containsExactly(float[] p0, org.assertj.core.data.Offset p1)`
- `public SELF containsExactly(java.lang.Float[] p0)`
- `public SELF containsExactly(java.lang.Float[] p0, org.assertj.core.data.Offset p1)`
- `public SELF containsExactlyInAnyOrder(float... p0)`
- `public SELF containsExactlyInAnyOrder(java.lang.Float[] p0)`
- `public SELF containsOnly(float... p0)`
- `public SELF containsOnly(float[] p0, org.assertj.core.data.Offset p1)`
- `public SELF containsOnly(java.lang.Float[] p0)`
- `public SELF containsOnly(java.lang.Float[] p0, org.assertj.core.data.Offset p1)`
- `public SELF containsOnlyOnce(float... p0)`
- `public SELF containsOnlyOnce(float[] p0, org.assertj.core.data.Offset p1)`
- `public SELF containsOnlyOnce(java.lang.Float[] p0)`
- `public SELF containsOnlyOnce(java.lang.Float[] p0, org.assertj.core.data.Offset p1)`
- `public SELF containsSequence(float... p0)`
- `public SELF containsSequence(float[] p0, org.assertj.core.data.Offset p1)`
- `public SELF containsSequence(java.lang.Float[] p0)`
- `public SELF containsSequence(java.lang.Float[] p0, org.assertj.core.data.Offset p1)`
- `public SELF containsSubsequence(float... p0)`
- `public SELF containsSubsequence(float[] p0, org.assertj.core.data.Offset p1)`
- `public SELF containsSubsequence(java.lang.Float[] p0)`
- `public SELF containsSubsequence(java.lang.Float[] p0, org.assertj.core.data.Offset p1)`
- `public SELF doesNotContain(float p0, org.assertj.core.data.Index p1)`
- `public SELF doesNotContain(float p0, org.assertj.core.data.Index p1, org.assertj.core.data.Offset p2)`
- `public SELF doesNotContain(float... p0)`
- `public SELF doesNotContain(float[] p0, org.assertj.core.data.Offset p1)`
- `public SELF doesNotContain(java.lang.Float[] p0)`
- `public SELF doesNotContain(java.lang.Float[] p0, org.assertj.core.data.Offset p1)`
- `public SELF doesNotHaveDuplicates()`
- `public SELF doesNotHaveDuplicates(org.assertj.core.data.Offset p0)`
- `public SELF endsWith(float... p0)`
- `public SELF endsWith(float[] p0, org.assertj.core.data.Offset p1)`
- `public SELF endsWith(java.lang.Float[] p0)`
- `public SELF endsWith(java.lang.Float[] p0, org.assertj.core.data.Offset p1)`
- `public SELF hasSameSizeAs(java.lang.Iterable p0)`
- `public SELF hasSize(int p0)`
- `public SELF hasSizeBetween(int p0, int p1)`
- `public SELF hasSizeGreaterThan(int p0)`
- `public SELF hasSizeGreaterThanOrEqualTo(int p0)`
- `public SELF hasSizeLessThan(int p0)`
- `public SELF hasSizeLessThanOrEqualTo(int p0)`
- `public void isEmpty()`
- `public SELF isNotEmpty()`
- `public void isNullOrEmpty()`
- `public SELF isSorted()`
- `public SELF isSortedAccordingTo(java.util.Comparator p0)`
- `public SELF startsWith(float... p0)`
- `public SELF startsWith(float[] p0, org.assertj.core.data.Offset p1)`
- `public SELF startsWith(java.lang.Float[] p0)`
- `public SELF startsWith(java.lang.Float[] p0, org.assertj.core.data.Offset p1)`
- `public SELF usingComparatorWithPrecision(java.lang.Float p0)`
- `public SELF usingDefaultElementComparator()`
- `public SELF usingElementComparator(java.util.Comparator p0)`

---

## public abstract class `org.assertj.core.api.AbstractFloatAssert`<SELF extends org.assertj.core.api.AbstractFloatAssert<SELF>>
extends `org.assertj.core.api.AbstractComparableAssert`  
implements `org.assertj.core.api.FloatingPointNumberAssert<SELF,java.lang.Float>`  

**Constructors:**
- `public AbstractFloatAssert(float p0, java.lang.Class p1)`
- `protected AbstractFloatAssert(java.lang.Float p0, java.lang.Class p1)`

**Methods:**
- `public SELF isBetween(java.lang.Float p0, java.lang.Float p1)`
- `public SELF isCloseTo(float p0, org.assertj.core.data.Offset p1)`
- `public SELF isCloseTo(float p0, org.assertj.core.data.Percentage p1)`
- `public SELF isCloseTo(java.lang.Float p0, org.assertj.core.data.Offset p1)`
- `public SELF isCloseTo(java.lang.Float p0, org.assertj.core.data.Percentage p1)`
- `public SELF isEqualTo(float p0)`
- `public SELF isEqualTo(float p0, org.assertj.core.data.Offset p1)`
- `public SELF isEqualTo(java.lang.Float p0)`
- `public SELF isEqualTo(java.lang.Float p0, org.assertj.core.data.Offset p1)`
- `public SELF isFinite()`
- `public SELF isGreaterThan(float p0)`
- `public SELF isGreaterThanOrEqualTo(float p0)`
- `public SELF isGreaterThanOrEqualTo(java.lang.Float p0)`
- `public SELF isInfinite()`
- `public SELF isLessThan(float p0)`
- `public SELF isLessThanOrEqualTo(float p0)`
- `public SELF isLessThanOrEqualTo(java.lang.Float p0)`
- `public SELF isNaN()`
- `public SELF isNegative()`
- `public SELF isNotCloseTo(float p0, org.assertj.core.data.Offset p1)`
- `public SELF isNotCloseTo(float p0, org.assertj.core.data.Percentage p1)`
- `public SELF isNotCloseTo(java.lang.Float p0, org.assertj.core.data.Offset p1)`
- `public SELF isNotCloseTo(java.lang.Float p0, org.assertj.core.data.Percentage p1)`
- `public SELF isNotEqualTo(float p0)`
- `public SELF isNotEqualTo(java.lang.Float p0)`
- `public SELF isNotFinite()`
- `public SELF isNotInfinite()`
- `public SELF isNotNaN()`
- `public SELF isNotNegative()`
- `public SELF isNotPositive()`
- `public SELF isNotZero()`
- `public SELF isOne()`
- `public SELF isPositive()`
- `public SELF isStrictlyBetween(java.lang.Float p0, java.lang.Float p1)`
- `public SELF isZero()`
- `public SELF usingComparator(java.util.Comparator p0)`
- `public SELF usingComparator(java.util.Comparator p0, java.lang.String p1)`
- `public SELF usingDefaultComparator()`

---

## public abstract class `org.assertj.core.api.AbstractFutureAssert`<SELF extends org.assertj.core.api.AbstractFutureAssert<SELF, ACTUAL, RESULT>, ACTUAL extends java.util.concurrent.Future<RESULT>, RESULT extends java.lang.Object>
extends `org.assertj.core.api.AbstractAssert`  

**Constructors:**
- `protected AbstractFutureAssert(ACTUAL p0, java.lang.Class p1)`

**Methods:**
- `public org.assertj.core.api.WithThrowable failsWithin(java.time.Duration p0)`
- `public org.assertj.core.api.WithThrowable failsWithin(long p0, java.util.concurrent.TimeUnit p1)`
- `public SELF isCancelled()`
- `public SELF isDone()`
- `public SELF isNotCancelled()`
- `public SELF isNotDone()`
- `public org.assertj.core.api.ObjectAssert succeedsWithin(java.time.Duration p0)`
- `public <ASSERT extends org.assertj.core.api.AbstractAssert<? extends java.lang.Object, ? extends java.lang.Object>> ASSERT succeedsWithin(java.time.Duration p0, org.assertj.core.api.InstanceOfAssertFactory p1)`
- `public org.assertj.core.api.ObjectAssert succeedsWithin(long p0, java.util.concurrent.TimeUnit p1)`
- `public <ASSERT extends org.assertj.core.api.AbstractAssert<? extends java.lang.Object, ? extends java.lang.Object>> ASSERT succeedsWithin(long p0, java.util.concurrent.TimeUnit p1, org.assertj.core.api.InstanceOfAssertFactory p2)`

---

## public abstract class `org.assertj.core.api.AbstractInputStreamAssert`<SELF extends org.assertj.core.api.AbstractInputStreamAssert<SELF, ACTUAL>, ACTUAL extends java.io.InputStream>
extends `org.assertj.core.api.AbstractAssert`  

**Constructors:**
- `protected AbstractInputStreamAssert(ACTUAL p0, java.lang.Class p1)`

**Methods:**
- `public org.assertj.core.api.AbstractStringAssert asString(java.nio.charset.Charset p0)`
- `public SELF hasBinaryContent(byte[] p0)`
- `public SELF hasContent(java.lang.String p0)`
- `public SELF hasContentEqualTo(java.io.InputStream p0)`
- `public SELF hasDigest(java.lang.String p0, byte[] p1)`
- `public SELF hasDigest(java.lang.String p0, java.lang.String p1)`
- `public SELF hasDigest(java.security.MessageDigest p0, byte[] p1)`
- `public SELF hasDigest(java.security.MessageDigest p0, java.lang.String p1)`
- `public SELF hasSameContentAs(java.io.InputStream p0)`
- `public SELF isEmpty()`
- `public SELF isNotEmpty()`

---

## public class `org.assertj.core.api.AbstractInstantAssert`<SELF extends org.assertj.core.api.AbstractInstantAssert<SELF>>
extends `org.assertj.core.api.AbstractTemporalAssert`  

**Constructors:**
- `protected AbstractInstantAssert(java.time.Instant p0, java.lang.Class p1)`

**Methods:**
- `public SELF isAfter(java.lang.String p0)`
- `public SELF isAfter(java.time.Instant p0)`
- `public SELF isAfterOrEqualTo(java.lang.String p0)`
- `public SELF isAfterOrEqualTo(java.time.Instant p0)`
- `public SELF isBefore(java.lang.String p0)`
- `public SELF isBefore(java.time.Instant p0)`
- `public SELF isBeforeOrEqualTo(java.lang.String p0)`
- `public SELF isBeforeOrEqualTo(java.time.Instant p0)`
- `public SELF isBetween(java.lang.String p0, java.lang.String p1)`
- `public SELF isBetween(java.time.Instant p0, java.time.Instant p1)`
- `public SELF isEqualTo(java.lang.String p0)`
- `public SELF isIn(java.lang.String... p0)`
- `public SELF isNotEqualTo(java.lang.String p0)`
- `public SELF isNotIn(java.lang.String... p0)`
- `public SELF isStrictlyBetween(java.lang.String p0, java.lang.String p1)`
- `public SELF isStrictlyBetween(java.time.Instant p0, java.time.Instant p1)`
- `protected java.time.Instant parse(java.lang.String p0)`

---

## public abstract class `org.assertj.core.api.AbstractIntArrayAssert`<SELF extends org.assertj.core.api.AbstractIntArrayAssert<SELF>>
extends `org.assertj.core.api.AbstractArrayAssert`  

**Constructors:**
- `protected AbstractIntArrayAssert(int[] p0, java.lang.Class p1)`

**Fields:**
- `protected org.assertj.core.internal.IntArrays arrays`

**Methods:**
- `public SELF contains(int p0, org.assertj.core.data.Index p1)`
- `public SELF contains(int... p0)`
- `public SELF contains(java.lang.Integer[] p0)`
- `public SELF containsAnyOf(int... p0)`
- `public SELF containsAnyOf(java.lang.Integer[] p0)`
- `public SELF containsExactly(int... p0)`
- `public SELF containsExactly(java.lang.Integer[] p0)`
- `public SELF containsExactlyInAnyOrder(int... p0)`
- `public SELF containsExactlyInAnyOrder(java.lang.Integer[] p0)`
- `public SELF containsOnly(int... p0)`
- `public SELF containsOnly(java.lang.Integer[] p0)`
- `public SELF containsOnlyOnce(int... p0)`
- `public SELF containsOnlyOnce(java.lang.Integer[] p0)`
- `public SELF containsSequence(int... p0)`
- `public SELF containsSequence(java.lang.Integer[] p0)`
- `public SELF containsSubsequence(int... p0)`
- `public SELF containsSubsequence(java.lang.Integer[] p0)`
- `public SELF doesNotContain(int p0, org.assertj.core.data.Index p1)`
- `public SELF doesNotContain(int... p0)`
- `public SELF doesNotContain(java.lang.Integer[] p0)`
- `public SELF doesNotHaveDuplicates()`
- `public SELF endsWith(int... p0)`
- `public SELF endsWith(java.lang.Integer[] p0)`
- `public SELF hasSameSizeAs(java.lang.Iterable p0)`
- `public SELF hasSize(int p0)`
- `public SELF hasSizeBetween(int p0, int p1)`
- `public SELF hasSizeGreaterThan(int p0)`
- `public SELF hasSizeGreaterThanOrEqualTo(int p0)`
- `public SELF hasSizeLessThan(int p0)`
- `public SELF hasSizeLessThanOrEqualTo(int p0)`
- `public void isEmpty()`
- `public SELF isNotEmpty()`
- `public void isNullOrEmpty()`
- `public SELF isSorted()`
- `public SELF isSortedAccordingTo(java.util.Comparator p0)`
- `public SELF startsWith(int... p0)`
- `public SELF startsWith(java.lang.Integer[] p0)`
- `public SELF usingDefaultElementComparator()`
- `public SELF usingElementComparator(java.util.Comparator p0)`

---

## public abstract class `org.assertj.core.api.AbstractIntegerAssert`<SELF extends org.assertj.core.api.AbstractIntegerAssert<SELF>>
extends `org.assertj.core.api.AbstractComparableAssert`  
implements `org.assertj.core.api.NumberAssert<SELF,java.lang.Integer>`  

**Constructors:**
- `protected AbstractIntegerAssert(java.lang.Integer p0, java.lang.Class p1)`

**Methods:**
- `public SELF isBetween(java.lang.Integer p0, java.lang.Integer p1)`
- `public SELF isCloseTo(int p0, org.assertj.core.data.Offset p1)`
- `public SELF isCloseTo(int p0, org.assertj.core.data.Percentage p1)`
- `public SELF isCloseTo(java.lang.Integer p0, org.assertj.core.data.Offset p1)`
- `public SELF isCloseTo(java.lang.Integer p0, org.assertj.core.data.Percentage p1)`
- `public SELF isEqualTo(int p0)`
- `public SELF isEqualTo(long p0)`
- `public SELF isEven()`
- `public SELF isGreaterThan(int p0)`
- `public SELF isGreaterThanOrEqualTo(int p0)`
- `public SELF isLessThan(int p0)`
- `public SELF isLessThanOrEqualTo(int p0)`
- `public SELF isNegative()`
- `public SELF isNotCloseTo(int p0, org.assertj.core.data.Offset p1)`
- `public SELF isNotCloseTo(int p0, org.assertj.core.data.Percentage p1)`
- `public SELF isNotCloseTo(java.lang.Integer p0, org.assertj.core.data.Offset p1)`
- `public SELF isNotCloseTo(java.lang.Integer p0, org.assertj.core.data.Percentage p1)`
- `public SELF isNotEqualTo(int p0)`
- `public SELF isNotNegative()`
- `public SELF isNotPositive()`
- `public SELF isNotZero()`
- `public SELF isOdd()`
- `public SELF isOne()`
- `public SELF isPositive()`
- `public SELF isStrictlyBetween(java.lang.Integer p0, java.lang.Integer p1)`
- `public SELF isZero()`
- `public SELF usingComparator(java.util.Comparator p0)`
- `public SELF usingComparator(java.util.Comparator p0, java.lang.String p1)`
- `public SELF usingDefaultComparator()`

---

## public abstract class `org.assertj.core.api.AbstractIterableAssert`<SELF extends org.assertj.core.api.AbstractIterableAssert<SELF, ACTUAL, ELEMENT, ELEMENT_ASSERT>, ACTUAL extends java.lang.Iterable<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>>
extends `org.assertj.core.api.AbstractAssert`  
implements `org.assertj.core.api.ObjectEnumerableAssert<SELF,ELEMENT>`  

**Constructors:**
- `protected AbstractIterableAssert(ACTUAL p0, java.lang.Class p1)`

**Fields:**
- `protected org.assertj.core.internal.Iterables iterables`

**Methods:**
- `public SELF allMatch(java.util.function.Predicate p0)`
- `public SELF allMatch(java.util.function.Predicate p0, java.lang.String p1)`
- `public SELF allSatisfy(java.util.function.Consumer p0)`
- `public SELF allSatisfy(org.assertj.core.api.ThrowingConsumer p0)`
- `public SELF anyMatch(java.util.function.Predicate p0)`
- `public SELF anySatisfy(java.util.function.Consumer p0)`
- `public SELF anySatisfy(org.assertj.core.api.ThrowingConsumer p0)`
- `public SELF are(org.assertj.core.api.Condition p0)`
- `public SELF areAtLeast(int p0, org.assertj.core.api.Condition p1)`
- `public SELF areAtLeastOne(org.assertj.core.api.Condition p0)`
- `public SELF areAtMost(int p0, org.assertj.core.api.Condition p1)`
- `public SELF areExactly(int p0, org.assertj.core.api.Condition p1)`
- `public SELF areNot(org.assertj.core.api.Condition p0)`
- `public SELF as(java.lang.String p0, java.lang.Object... p1)`
- `public SELF as(org.assertj.core.description.Description p0)`
- `public final SELF contains(ELEMENT... p0)`
- `public SELF containsAll(java.lang.Iterable p0)`
- `public SELF containsAnyElementsOf(java.lang.Iterable p0)`
- `public final SELF containsAnyOf(ELEMENT... p0)`
- `protected SELF containsAnyOfForProxy(ELEMENT[] p0)`
- `public final SELF containsExactly(ELEMENT... p0)`
- `public SELF containsExactlyElementsOf(java.lang.Iterable p0)`
- `protected SELF containsExactlyForProxy(ELEMENT[] p0)`
- `public final SELF containsExactlyInAnyOrder(ELEMENT... p0)`
- `public SELF containsExactlyInAnyOrderElementsOf(java.lang.Iterable p0)`
- `protected SELF containsExactlyInAnyOrderForProxy(ELEMENT[] p0)`
- `protected SELF containsForProxy(ELEMENT[] p0)`
- `public SELF containsNull()`
- `public final SELF containsOnly(ELEMENT... p0)`
- `public SELF containsOnlyElementsOf(java.lang.Iterable p0)`
- `protected SELF containsOnlyForProxy(ELEMENT[] p0)`
- `public SELF containsOnlyNulls()`
- `public final SELF containsOnlyOnce(ELEMENT... p0)`
- `public SELF containsOnlyOnceElementsOf(java.lang.Iterable p0)`
- `protected SELF containsOnlyOnceForProxy(ELEMENT[] p0)`
- `public final SELF containsSequence(ELEMENT... p0)`
- `public SELF containsSequence(java.lang.Iterable p0)`
- `protected SELF containsSequenceForProxy(ELEMENT[] p0)`
- `public final SELF containsSubsequence(ELEMENT... p0)`
- `public SELF containsSubsequence(java.lang.Iterable p0)`
- `protected SELF containsSubsequenceForProxy(ELEMENT[] p0)`
- `public SELF describedAs(java.lang.String p0, java.lang.Object... p1)`
- `public SELF describedAs(org.assertj.core.description.Description p0)`
- `public SELF doNotHave(org.assertj.core.api.Condition p0)`
- `public final SELF doesNotContain(ELEMENT... p0)`
- `public SELF doesNotContainAnyElementsOf(java.lang.Iterable p0)`
- `protected SELF doesNotContainForProxy(ELEMENT[] p0)`
- `public SELF doesNotContainNull()`
- `public final SELF doesNotContainSequence(ELEMENT... p0)`
- `public SELF doesNotContainSequence(java.lang.Iterable p0)`
- `protected SELF doesNotContainSequenceForProxy(ELEMENT[] p0)`
- `public final SELF doesNotContainSubsequence(ELEMENT... p0)`
- `public SELF doesNotContainSubsequence(java.lang.Iterable p0)`
- `protected SELF doesNotContainSubsequenceForProxy(ELEMENT[] p0)`
- `public SELF doesNotHave(org.assertj.core.api.Condition p0)`
- `public SELF doesNotHaveAnyElementsOfTypes(java.lang.Class... p0)`
- `public SELF doesNotHaveDuplicates()`
- `public SELF doesNotHaveSameClassAs(java.lang.Object p0)`
- `public ELEMENT_ASSERT element(int p0)`
- `public <ASSERT extends org.assertj.core.api.AbstractAssert<? extends java.lang.Object, ? extends java.lang.Object>> ASSERT element(int p0, org.assertj.core.api.InstanceOfAssertFactory p1)`
- `public SELF elements(int... p0)`
- `public final SELF endsWith(ELEMENT p0, ELEMENT... p1)`
- `public SELF endsWith(ELEMENT[] p0)`
- `protected SELF endsWithForProxy(ELEMENT p0, ELEMENT[] p1)`
- `public org.assertj.core.api.AbstractListAssert extracting(java.lang.String p0)`
- `public <P extends java.lang.Object> org.assertj.core.api.AbstractListAssert extracting(java.lang.String p0, java.lang.Class p1)`
- `public org.assertj.core.api.AbstractListAssert extracting(java.lang.String... p0)`
- `public final org.assertj.core.api.AbstractListAssert extracting(java.util.function.Function... p0)`
- `public <V extends java.lang.Object> org.assertj.core.api.AbstractListAssert extracting(java.util.function.Function p0)`
- `public <V extends java.lang.Object, EXCEPTION extends java.lang.Exception> org.assertj.core.api.AbstractListAssert extracting(org.assertj.core.api.iterable.ThrowingExtractor p0)`
- `protected org.assertj.core.api.AbstractListAssert extractingForProxy(java.util.function.Function[] p0)`
- `public org.assertj.core.api.AbstractListAssert extractingResultOf(java.lang.String p0)`
- `public <P extends java.lang.Object> org.assertj.core.api.AbstractListAssert extractingResultOf(java.lang.String p0, java.lang.Class p1)`
- `public SELF filteredOn(java.lang.String p0, java.lang.Object p1)`
- `public SELF filteredOn(java.lang.String p0, org.assertj.core.api.filter.FilterOperator p1)`
- `public <T extends java.lang.Object> SELF filteredOn(java.util.function.Function p0, T p1)`
- `public SELF filteredOn(java.util.function.Predicate p0)`
- `public SELF filteredOn(org.assertj.core.api.Condition p0)`
- `public SELF filteredOnAssertions(java.util.function.Consumer p0)`
- `public SELF filteredOnAssertions(org.assertj.core.api.ThrowingConsumer p0)`
- `public SELF filteredOnNull(java.lang.String p0)`
- `public ELEMENT_ASSERT first()`
- `public <ASSERT extends org.assertj.core.api.AbstractAssert<? extends java.lang.Object, ? extends java.lang.Object>> ASSERT first(org.assertj.core.api.InstanceOfAssertFactory p0)`
- `public org.assertj.core.api.AbstractListAssert flatExtracting(java.lang.String p0)`
- `public org.assertj.core.api.AbstractListAssert flatExtracting(java.lang.String... p0)`
- `public final org.assertj.core.api.AbstractListAssert flatExtracting(java.util.function.Function... p0)`
- `public <V extends java.lang.Object> org.assertj.core.api.AbstractListAssert flatExtracting(java.util.function.Function p0)`
- `public final <EXCEPTION extends java.lang.Exception> org.assertj.core.api.AbstractListAssert flatExtracting(org.assertj.core.api.iterable.ThrowingExtractor... p0)`
- `public <V extends java.lang.Object, EXCEPTION extends java.lang.Exception> org.assertj.core.api.AbstractListAssert flatExtracting(org.assertj.core.api.iterable.ThrowingExtractor p0)`
- `protected org.assertj.core.api.AbstractListAssert flatExtractingForProxy(java.util.function.Function[] p0)`
- `public final org.assertj.core.api.AbstractListAssert flatMap(java.util.function.Function... p0)`
- `public <V extends java.lang.Object> org.assertj.core.api.AbstractListAssert flatMap(java.util.function.Function p0)`
- `public final <EXCEPTION extends java.lang.Exception> org.assertj.core.api.AbstractListAssert flatMap(org.assertj.core.api.iterable.ThrowingExtractor... p0)`
- `public <V extends java.lang.Object, EXCEPTION extends java.lang.Exception> org.assertj.core.api.AbstractListAssert flatMap(org.assertj.core.api.iterable.ThrowingExtractor p0)`
- `protected org.assertj.core.internal.TypeComparators getComparatorsByType()`
- `protected org.assertj.core.internal.TypeComparators getComparatorsForElementPropertyOrFieldTypes()`
- `public SELF has(org.assertj.core.api.Condition p0)`
- `public SELF hasAtLeastOneElementOfType(java.lang.Class p0)`
- `public SELF hasExactlyElementsOfTypes(java.lang.Class... p0)`
- `public SELF hasOnlyElementsOfType(java.lang.Class p0)`
- `public SELF hasOnlyElementsOfTypes(java.lang.Class... p0)`
- `public SELF hasOnlyOneElementSatisfying(java.util.function.Consumer p0)`
- `public SELF hasSameClassAs(java.lang.Object p0)`
- `public SELF hasSameElementsAs(java.lang.Iterable p0)`
- `public SELF hasSameSizeAs(java.lang.Iterable p0)`
- `public SELF hasSameSizeAs(java.lang.Object p0)`
- `public SELF hasSize(int p0)`
- `public SELF hasSizeBetween(int p0, int p1)`
- `public SELF hasSizeGreaterThan(int p0)`
- `public SELF hasSizeGreaterThanOrEqualTo(int p0)`
- `public SELF hasSizeLessThan(int p0)`
- `public SELF hasSizeLessThanOrEqualTo(int p0)`
- `public SELF hasToString(java.lang.String p0)`
- `public SELF have(org.assertj.core.api.Condition p0)`
- `public SELF haveAtLeast(int p0, org.assertj.core.api.Condition p1)`
- `public SELF haveAtLeastOne(org.assertj.core.api.Condition p0)`
- `public SELF haveAtMost(int p0, org.assertj.core.api.Condition p1)`
- `public SELF haveExactly(int p0, org.assertj.core.api.Condition p1)`
- `public SELF inBinary()`
- `public SELF inHexadecimal()`
- `public SELF is(org.assertj.core.api.Condition p0)`
- `public void isEmpty()`
- `public SELF isEqualTo(java.lang.Object p0)`
- `public SELF isExactlyInstanceOf(java.lang.Class p0)`
- `public SELF isIn(java.lang.Iterable p0)`
- `public SELF isIn(java.lang.Object... p0)`
- `public SELF isInstanceOf(java.lang.Class p0)`
- `public SELF isInstanceOfAny(java.lang.Class... p0)`
- `public SELF isNot(org.assertj.core.api.Condition p0)`
- `public SELF isNotEmpty()`
- `public SELF isNotEqualTo(java.lang.Object p0)`
- `public SELF isNotExactlyInstanceOf(java.lang.Class p0)`
- `public SELF isNotIn(java.lang.Iterable p0)`
- `public SELF isNotIn(java.lang.Object... p0)`
- `public SELF isNotInstanceOf(java.lang.Class p0)`
- `public SELF isNotInstanceOfAny(java.lang.Class... p0)`
- `public SELF isNotNull()`
- `public SELF isNotOfAnyClassIn(java.lang.Class... p0)`
- `public SELF isNotSameAs(java.lang.Object p0)`
- `public void isNullOrEmpty()`
- `public SELF isOfAnyClassIn(java.lang.Class... p0)`
- `public SELF isSameAs(java.lang.Object p0)`
- `public final SELF isSubsetOf(ELEMENT... p0)`
- `public SELF isSubsetOf(java.lang.Iterable p0)`
- `protected SELF isSubsetOfForProxy(ELEMENT[] p0)`
- `public ELEMENT_ASSERT last()`
- `public <ASSERT extends org.assertj.core.api.AbstractAssert<? extends java.lang.Object, ? extends java.lang.Object>> ASSERT last(org.assertj.core.api.InstanceOfAssertFactory p0)`
- `public final org.assertj.core.api.AbstractListAssert map(java.util.function.Function... p0)`
- `public <V extends java.lang.Object> org.assertj.core.api.AbstractListAssert map(java.util.function.Function p0)`
- `public <V extends java.lang.Object, EXCEPTION extends java.lang.Exception> org.assertj.core.api.AbstractListAssert map(org.assertj.core.api.iterable.ThrowingExtractor p0)`
- `protected java.lang.String navigationDescription(java.lang.String p0)`
- `protected abstract SELF newAbstractIterableAssert(java.lang.Iterable p0)`
- `protected SELF newAbstractIterableAssertForProxy(java.util.List p0)`
- `public SELF noneMatch(java.util.function.Predicate p0)`
- `public SELF noneSatisfy(java.util.function.Consumer p0)`
- `public SELF noneSatisfy(org.assertj.core.api.ThrowingConsumer p0)`
- `public SELF overridingErrorMessage(java.lang.String p0, java.lang.Object... p1)`
- `public final SELF satisfiesExactly(java.util.function.Consumer... p0)`
- `public final SELF satisfiesExactly(org.assertj.core.api.ThrowingConsumer... p0)`
- `protected SELF satisfiesExactlyForProxy(java.util.function.Consumer[] p0)`
- `public final SELF satisfiesExactlyInAnyOrder(java.util.function.Consumer... p0)`
- `public final SELF satisfiesExactlyInAnyOrder(org.assertj.core.api.ThrowingConsumer... p0)`
- `protected SELF satisfiesExactlyInAnyOrderForProxy(java.util.function.Consumer[] p0)`
- `public ELEMENT_ASSERT singleElement()`
- `public <ASSERT extends org.assertj.core.api.AbstractAssert<? extends java.lang.Object, ? extends java.lang.Object>> ASSERT singleElement(org.assertj.core.api.InstanceOfAssertFactory p0)`
- `public org.assertj.core.api.AbstractIterableSizeAssert size()`
- `public final SELF startsWith(ELEMENT... p0)`
- `protected SELF startsWithForProxy(ELEMENT[] p0)`
- `protected abstract ELEMENT_ASSERT toAssert(ELEMENT p0, java.lang.String p1)`
- `public SELF usingComparator(java.util.Comparator p0)`
- `public SELF usingComparator(java.util.Comparator p0, java.lang.String p1)`
- `public <T extends java.lang.Object> SELF usingComparatorForElementFieldsWithNames(java.util.Comparator p0, java.lang.String... p1)`
- `public <T extends java.lang.Object> SELF usingComparatorForElementFieldsWithType(java.util.Comparator p0, java.lang.Class p1)`
- `public <T extends java.lang.Object> SELF usingComparatorForType(java.util.Comparator p0, java.lang.Class p1)`
- `protected SELF usingComparisonStrategy(org.assertj.core.internal.ComparisonStrategy p0)`
- `public SELF usingDefaultComparator()`
- `public SELF usingDefaultElementComparator()`
- `public SELF usingElementComparator(java.util.Comparator p0)`
- `public SELF usingElementComparatorIgnoringFields(java.lang.String... p0)`
- `public SELF usingElementComparatorOnFields(java.lang.String... p0)`
- `public SELF usingFieldByFieldElementComparator()`
- `public org.assertj.core.api.RecursiveComparisonAssert usingRecursiveComparison()`
- `public org.assertj.core.api.RecursiveComparisonAssert usingRecursiveComparison(org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration p0)`
- `public SELF usingRecursiveFieldByFieldElementComparator()`
- `public SELF usingRecursiveFieldByFieldElementComparator(org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration p0)`
- `public SELF usingRecursiveFieldByFieldElementComparatorIgnoringFields(java.lang.String... p0)`
- `public SELF usingRecursiveFieldByFieldElementComparatorOnFields(java.lang.String... p0)`
- `public SELF withFailMessage(java.lang.String p0, java.lang.Object... p1)`
- `public SELF withThreadDumpOnError()`
- `public <OTHER_ELEMENT extends java.lang.Object> SELF zipSatisfy(java.lang.Iterable p0, java.util.function.BiConsumer p1)`

---

## public abstract class `org.assertj.core.api.AbstractIterableSizeAssert`<SELF extends org.assertj.core.api.AbstractIterableAssert<SELF, ACTUAL, ELEMENT, ELEMENT_ASSERT>, ACTUAL extends java.lang.Iterable<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>>
extends `org.assertj.core.api.AbstractIntegerAssert`  

**Constructors:**
- `protected AbstractIterableSizeAssert(java.lang.Integer p0, java.lang.Class p1)`

**Methods:**
- `public abstract org.assertj.core.api.AbstractIterableAssert returnToIterable()`

---

## public abstract class `org.assertj.core.api.AbstractIteratorAssert`<SELF extends org.assertj.core.api.AbstractIteratorAssert<SELF, ELEMENT>, ELEMENT extends java.lang.Object>
extends `org.assertj.core.api.AbstractAssert`  

**Constructors:**
- `protected AbstractIteratorAssert(java.util.Iterator p0, java.lang.Class p1)`

**Methods:**
- `public SELF hasNext()`
- `public SELF isExhausted()`
- `public org.assertj.core.api.IterableAssert toIterable()`

---

## public abstract class `org.assertj.core.api.AbstractListAssert`<SELF extends org.assertj.core.api.AbstractListAssert<SELF, ACTUAL, ELEMENT, ELEMENT_ASSERT>, ACTUAL extends java.util.List<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>>
extends `org.assertj.core.api.AbstractCollectionAssert`  
implements `org.assertj.core.api.IndexedObjectEnumerableAssert<SELF,ELEMENT>`  

**Constructors:**
- `protected AbstractListAssert(ACTUAL p0, java.lang.Class p1)`

**Methods:**
- `public SELF as(java.lang.String p0, java.lang.Object... p1)`
- `public SELF as(org.assertj.core.description.Description p0)`
- `public SELF contains(ELEMENT p0, org.assertj.core.data.Index p1)`
- `public SELF describedAs(java.lang.String p0, java.lang.Object... p1)`
- `public SELF describedAs(org.assertj.core.description.Description p0)`
- `public SELF doesNotContain(ELEMENT p0, org.assertj.core.data.Index p1)`
- `public SELF doesNotHave(org.assertj.core.api.Condition p0)`
- `public SELF doesNotHaveSameClassAs(java.lang.Object p0)`
- `public SELF has(org.assertj.core.api.Condition p0)`
- `public SELF has(org.assertj.core.api.Condition p0, org.assertj.core.data.Index p1)`
- `public SELF hasSameClassAs(java.lang.Object p0)`
- `public SELF hasToString(java.lang.String p0)`
- `public SELF is(org.assertj.core.api.Condition p0)`
- `public SELF is(org.assertj.core.api.Condition p0, org.assertj.core.data.Index p1)`
- `public SELF isEqualTo(java.lang.Object p0)`
- `public SELF isExactlyInstanceOf(java.lang.Class p0)`
- `public SELF isIn(java.lang.Iterable p0)`
- `public SELF isIn(java.lang.Object... p0)`
- `public SELF isInstanceOf(java.lang.Class p0)`
- `public SELF isInstanceOfAny(java.lang.Class... p0)`
- `public SELF isNot(org.assertj.core.api.Condition p0)`
- `public SELF isNotEqualTo(java.lang.Object p0)`
- `public SELF isNotExactlyInstanceOf(java.lang.Class p0)`
- `public SELF isNotIn(java.lang.Iterable p0)`
- `public SELF isNotIn(java.lang.Object... p0)`
- `public SELF isNotInstanceOf(java.lang.Class p0)`
- `public SELF isNotInstanceOfAny(java.lang.Class... p0)`
- `public SELF isNotNull()`
- `public SELF isNotOfAnyClassIn(java.lang.Class... p0)`
- `public SELF isNotSameAs(java.lang.Object p0)`
- `public SELF isOfAnyClassIn(java.lang.Class... p0)`
- `public SELF isSameAs(java.lang.Object p0)`
- `public SELF isSorted()`
- `public SELF isSortedAccordingTo(java.util.Comparator p0)`
- `public SELF overridingErrorMessage(java.lang.String p0, java.lang.Object... p1)`
- `public SELF satisfies(java.util.function.Consumer p0, org.assertj.core.data.Index p1)`
- `public SELF usingComparator(java.util.Comparator p0)`
- `public SELF usingComparator(java.util.Comparator p0, java.lang.String p1)`
- `protected SELF usingComparisonStrategy(org.assertj.core.internal.ComparisonStrategy p0)`
- `public SELF usingDefaultComparator()`
- `public SELF usingDefaultElementComparator()`
- `public SELF usingElementComparator(java.util.Comparator p0)`
- `public SELF withFailMessage(java.lang.String p0, java.lang.Object... p1)`
- `public SELF withThreadDumpOnError()`

---

## public abstract class `org.assertj.core.api.AbstractLocalDateAssert`<SELF extends org.assertj.core.api.AbstractLocalDateAssert<SELF>>
extends `org.assertj.core.api.AbstractTemporalAssert`  

**Constructors:**
- `protected AbstractLocalDateAssert(java.time.LocalDate p0, java.lang.Class p1)`

**Fields:**
- `public final static java.lang.String NULL_LOCAL_DATE_TIME_PARAMETER_MESSAGE`

**Methods:**
- `public SELF hasDayOfMonth(int p0)`
- `public SELF hasMonth(java.time.Month p0)`
- `public SELF hasMonthValue(int p0)`
- `public SELF hasYear(int p0)`
- `public SELF isAfter(java.lang.String p0)`
- `public SELF isAfter(java.time.LocalDate p0)`
- `public SELF isAfterOrEqualTo(java.lang.String p0)`
- `public SELF isAfterOrEqualTo(java.time.LocalDate p0)`
- `public SELF isBefore(java.lang.String p0)`
- `public SELF isBefore(java.time.LocalDate p0)`
- `public SELF isBeforeOrEqualTo(java.lang.String p0)`
- `public SELF isBeforeOrEqualTo(java.time.LocalDate p0)`
- `public SELF isBetween(java.lang.String p0, java.lang.String p1)`
- `public SELF isBetween(java.time.LocalDate p0, java.time.LocalDate p1)`
- `public SELF isEqualTo(java.lang.String p0)`
- `public SELF isIn(java.lang.String... p0)`
- `public SELF isNotEqualTo(java.lang.String p0)`
- `public SELF isNotIn(java.lang.String... p0)`
- `public SELF isStrictlyBetween(java.lang.String p0, java.lang.String p1)`
- `public SELF isStrictlyBetween(java.time.LocalDate p0, java.time.LocalDate p1)`
- `public SELF isToday()`
- `protected java.time.LocalDate parse(java.lang.String p0)`

---

## public abstract class `org.assertj.core.api.AbstractLocalDateTimeAssert`<SELF extends org.assertj.core.api.AbstractLocalDateTimeAssert<SELF>>
extends `org.assertj.core.api.AbstractTemporalAssert`  

**Constructors:**
- `protected AbstractLocalDateTimeAssert(java.time.LocalDateTime p0, java.lang.Class p1)`

**Fields:**
- `public final static java.lang.String NULL_LOCAL_DATE_TIME_PARAMETER_MESSAGE`

**Methods:**
- `public SELF hasDayOfMonth(int p0)`
- `public SELF hasHour(int p0)`
- `public SELF hasMinute(int p0)`
- `public SELF hasMonth(java.time.Month p0)`
- `public SELF hasMonthValue(int p0)`
- `public SELF hasNano(int p0)`
- `public SELF hasSecond(int p0)`
- `public SELF hasYear(int p0)`
- `public SELF isAfter(java.lang.String p0)`
- `public SELF isAfter(java.time.LocalDateTime p0)`
- `public SELF isAfterOrEqualTo(java.lang.String p0)`
- `public SELF isAfterOrEqualTo(java.time.LocalDateTime p0)`
- `public SELF isBefore(java.lang.String p0)`
- `public SELF isBefore(java.time.LocalDateTime p0)`
- `public SELF isBeforeOrEqualTo(java.lang.String p0)`
- `public SELF isBeforeOrEqualTo(java.time.LocalDateTime p0)`
- `public SELF isBetween(java.lang.String p0, java.lang.String p1)`
- `public SELF isBetween(java.time.LocalDateTime p0, java.time.LocalDateTime p1)`
- `public SELF isCloseToUtcNow(org.assertj.core.data.TemporalUnitOffset p0)`
- `public SELF isEqualTo(java.lang.Object p0)`
- `public SELF isEqualTo(java.lang.String p0)`
- `public SELF isEqualToIgnoringHours(java.time.LocalDateTime p0)`
- `public SELF isEqualToIgnoringMinutes(java.time.LocalDateTime p0)`
- `public SELF isEqualToIgnoringNanos(java.time.LocalDateTime p0)`
- `public SELF isEqualToIgnoringSeconds(java.time.LocalDateTime p0)`
- `public SELF isIn(java.lang.String... p0)`
- `public SELF isNotEqualTo(java.lang.Object p0)`
- `public SELF isNotEqualTo(java.lang.String p0)`
- `public SELF isNotIn(java.lang.String... p0)`
- `public SELF isStrictlyBetween(java.lang.String p0, java.lang.String p1)`
- `public SELF isStrictlyBetween(java.time.LocalDateTime p0, java.time.LocalDateTime p1)`
- `protected java.time.LocalDateTime parse(java.lang.String p0)`
- `public SELF usingDefaultComparator()`

---

## public abstract class `org.assertj.core.api.AbstractLocalTimeAssert`<SELF extends org.assertj.core.api.AbstractLocalTimeAssert<SELF>>
extends `org.assertj.core.api.AbstractTemporalAssert`  

**Constructors:**
- `protected AbstractLocalTimeAssert(java.time.LocalTime p0, java.lang.Class p1)`

**Fields:**
- `public final static java.lang.String NULL_LOCAL_TIME_PARAMETER_MESSAGE`

**Methods:**
- `public SELF hasHour(int p0)`
- `public SELF hasMinute(int p0)`
- `public SELF hasNano(int p0)`
- `public SELF hasSameHourAs(java.time.LocalTime p0)`
- `public SELF hasSecond(int p0)`
- `public SELF isAfter(java.lang.String p0)`
- `public SELF isAfter(java.time.LocalTime p0)`
- `public SELF isAfterOrEqualTo(java.lang.String p0)`
- `public SELF isAfterOrEqualTo(java.time.LocalTime p0)`
- `public SELF isBefore(java.lang.String p0)`
- `public SELF isBefore(java.time.LocalTime p0)`
- `public SELF isBeforeOrEqualTo(java.lang.String p0)`
- `public SELF isBeforeOrEqualTo(java.time.LocalTime p0)`
- `public SELF isBetween(java.lang.String p0, java.lang.String p1)`
- `public SELF isBetween(java.time.LocalTime p0, java.time.LocalTime p1)`
- `public SELF isEqualTo(java.lang.String p0)`
- `public SELF isEqualToIgnoringNanos(java.time.LocalTime p0)`
- `public SELF isEqualToIgnoringSeconds(java.time.LocalTime p0)`
- `public SELF isIn(java.lang.String... p0)`
- `public SELF isNotEqualTo(java.lang.String p0)`
- `public SELF isNotIn(java.lang.String... p0)`
- `public SELF isStrictlyBetween(java.lang.String p0, java.lang.String p1)`
- `public SELF isStrictlyBetween(java.time.LocalTime p0, java.time.LocalTime p1)`
- `protected java.time.LocalTime parse(java.lang.String p0)`

---

## public class `org.assertj.core.api.AbstractLongAdderAssert`<SELF extends org.assertj.core.api.AbstractLongAdderAssert<SELF>>
extends `org.assertj.core.api.AbstractAssert`  
implements `org.assertj.core.api.ComparableAssert<SELF,java.lang.Long>`, `org.assertj.core.api.NumberAssert<SELF,java.lang.Long>`  

**Constructors:**
- `protected AbstractLongAdderAssert(java.util.concurrent.atomic.LongAdder p0, java.lang.Class p1)`

**Methods:**
- `public SELF doesNotHaveValue(long p0)`
- `public SELF hasValue(long p0)`
- `public SELF isBetween(java.lang.Long p0, java.lang.Long p1)`
- `public SELF isCloseTo(java.lang.Long p0, org.assertj.core.data.Offset p1)`
- `public SELF isCloseTo(java.lang.Long p0, org.assertj.core.data.Percentage p1)`
- `public SELF isEqualByComparingTo(java.lang.Long p0)`
- `public SELF isGreaterThan(java.lang.Long p0)`
- `public SELF isGreaterThanOrEqualTo(java.lang.Long p0)`
- `public SELF isLessThan(java.lang.Long p0)`
- `public SELF isLessThanOrEqualTo(java.lang.Long p0)`
- `public SELF isNegative()`
- `public SELF isNotCloseTo(java.lang.Long p0, org.assertj.core.data.Offset p1)`
- `public SELF isNotCloseTo(java.lang.Long p0, org.assertj.core.data.Percentage p1)`
- `public SELF isNotEqualByComparingTo(java.lang.Long p0)`
- `public SELF isNotNegative()`
- `public SELF isNotPositive()`
- `public SELF isNotZero()`
- `public SELF isOne()`
- `public SELF isPositive()`
- `public SELF isStrictlyBetween(java.lang.Long p0, java.lang.Long p1)`
- `public SELF isZero()`
- `public SELF usingComparator(java.util.Comparator p0)`
- `public SELF usingComparator(java.util.Comparator p0, java.lang.String p1)`
- `public SELF usingDefaultComparator()`

---

## public abstract class `org.assertj.core.api.AbstractLongArrayAssert`<SELF extends org.assertj.core.api.AbstractLongArrayAssert<SELF>>
extends `org.assertj.core.api.AbstractArrayAssert`  

**Constructors:**
- `protected AbstractLongArrayAssert(long[] p0, java.lang.Class p1)`

**Fields:**
- `protected org.assertj.core.internal.LongArrays arrays`

**Methods:**
- `public SELF contains(java.lang.Long[] p0)`
- `public SELF contains(long p0, org.assertj.core.data.Index p1)`
- `public SELF contains(long... p0)`
- `public SELF containsAnyOf(java.lang.Long[] p0)`
- `public SELF containsAnyOf(long... p0)`
- `public SELF containsExactly(java.lang.Long[] p0)`
- `public SELF containsExactly(long... p0)`
- `public SELF containsExactlyInAnyOrder(java.lang.Long[] p0)`
- `public SELF containsExactlyInAnyOrder(long... p0)`
- `public SELF containsOnly(java.lang.Long[] p0)`
- `public SELF containsOnly(long... p0)`
- `public SELF containsOnlyOnce(java.lang.Long[] p0)`
- `public SELF containsOnlyOnce(long... p0)`
- `public SELF containsSequence(java.lang.Long[] p0)`
- `public SELF containsSequence(long... p0)`
- `public SELF containsSubsequence(java.lang.Long[] p0)`
- `public SELF containsSubsequence(long... p0)`
- `public SELF doesNotContain(java.lang.Long[] p0)`
- `public SELF doesNotContain(long p0, org.assertj.core.data.Index p1)`
- `public SELF doesNotContain(long... p0)`
- `public SELF doesNotHaveDuplicates()`
- `public SELF endsWith(java.lang.Long[] p0)`
- `public SELF endsWith(long... p0)`
- `public SELF hasSameSizeAs(java.lang.Iterable p0)`
- `public SELF hasSize(int p0)`
- `public SELF hasSizeBetween(int p0, int p1)`
- `public SELF hasSizeGreaterThan(int p0)`
- `public SELF hasSizeGreaterThanOrEqualTo(int p0)`
- `public SELF hasSizeLessThan(int p0)`
- `public SELF hasSizeLessThanOrEqualTo(int p0)`
- `public void isEmpty()`
- `public SELF isNotEmpty()`
- `public void isNullOrEmpty()`
- `public SELF isSorted()`
- `public SELF isSortedAccordingTo(java.util.Comparator p0)`
- `public SELF startsWith(java.lang.Long[] p0)`
- `public SELF startsWith(long... p0)`
- `public SELF usingDefaultElementComparator()`
- `public SELF usingElementComparator(java.util.Comparator p0)`

---

## public abstract class `org.assertj.core.api.AbstractLongAssert`<SELF extends org.assertj.core.api.AbstractLongAssert<SELF>>
extends `org.assertj.core.api.AbstractComparableAssert`  
implements `org.assertj.core.api.NumberAssert<SELF,java.lang.Long>`  

**Constructors:**
- `protected AbstractLongAssert(java.lang.Long p0, java.lang.Class p1)`

**Methods:**
- `public SELF isBetween(java.lang.Long p0, java.lang.Long p1)`
- `public SELF isCloseTo(java.lang.Long p0, org.assertj.core.data.Offset p1)`
- `public SELF isCloseTo(java.lang.Long p0, org.assertj.core.data.Percentage p1)`
- `public SELF isCloseTo(long p0, org.assertj.core.data.Offset p1)`
- `public SELF isCloseTo(long p0, org.assertj.core.data.Percentage p1)`
- `public SELF isEqualTo(long p0)`
- `public SELF isEven()`
- `public SELF isGreaterThan(long p0)`
- `public SELF isGreaterThanOrEqualTo(long p0)`
- `public SELF isLessThan(long p0)`
- `public SELF isLessThanOrEqualTo(long p0)`
- `public SELF isNegative()`
- `public SELF isNotCloseTo(java.lang.Long p0, org.assertj.core.data.Offset p1)`
- `public SELF isNotCloseTo(java.lang.Long p0, org.assertj.core.data.Percentage p1)`
- `public SELF isNotCloseTo(long p0, org.assertj.core.data.Offset p1)`
- `public SELF isNotCloseTo(long p0, org.assertj.core.data.Percentage p1)`
- `public SELF isNotEqualTo(long p0)`
- `public SELF isNotNegative()`
- `public SELF isNotPositive()`
- `public SELF isNotZero()`
- `public SELF isOdd()`
- `public SELF isOne()`
- `public SELF isPositive()`
- `public SELF isStrictlyBetween(java.lang.Long p0, java.lang.Long p1)`
- `public SELF isZero()`
- `public SELF usingComparator(java.util.Comparator p0)`
- `public SELF usingComparator(java.util.Comparator p0, java.lang.String p1)`
- `public SELF usingDefaultComparator()`

---

## public abstract class `org.assertj.core.api.AbstractMapAssert`<SELF extends org.assertj.core.api.AbstractMapAssert<SELF, ACTUAL, K, V>, ACTUAL extends java.util.Map<K, V>, K extends java.lang.Object, V extends java.lang.Object>
extends `org.assertj.core.api.AbstractObjectAssert`  
implements `org.assertj.core.api.EnumerableAssert<SELF,java.util.Map$Entry<? extends K,? extends V>>`  

**Constructors:**
- `protected AbstractMapAssert(ACTUAL p0, java.lang.Class p1)`

**Methods:**
- `public SELF allSatisfy(java.util.function.BiConsumer p0)`
- `public SELF anySatisfy(java.util.function.BiConsumer p0)`
- `public SELF as(java.lang.String p0, java.lang.Object... p1)`
- `public SELF as(org.assertj.core.description.Description p0)`
- `public final SELF contains(java.util.Map$Entry... p0)`
- `public SELF containsAllEntriesOf(java.util.Map p0)`
- `public final SELF containsAnyOf(java.util.Map$Entry... p0)`
- `protected SELF containsAnyOfForProxy(java.util.Map$Entry[] p0)`
- `public SELF containsEntry(K p0, V p1)`
- `public final SELF containsExactly(java.util.Map$Entry... p0)`
- `public SELF containsExactlyEntriesOf(java.util.Map p0)`
- `protected SELF containsExactlyForProxy(java.util.Map$Entry[] p0)`
- `public SELF containsExactlyInAnyOrderEntriesOf(java.util.Map p0)`
- `protected SELF containsForProxy(java.util.Map$Entry[] p0)`
- `public SELF containsKey(K p0)`
- `public final SELF containsKeys(K... p0)`
- `protected SELF containsKeysForProxy(K[] p0)`
- `public final SELF containsOnly(java.util.Map$Entry... p0)`
- `protected SELF containsOnlyForProxy(java.util.Map$Entry[] p0)`
- `public final SELF containsOnlyKeys(K... p0)`
- `public SELF containsOnlyKeys(java.lang.Iterable p0)`
- `protected SELF containsOnlyKeysForProxy(K[] p0)`
- `public SELF containsValue(V p0)`
- `public final SELF containsValues(V... p0)`
- `protected SELF containsValuesForProxy(V[] p0)`
- `public SELF describedAs(java.lang.String p0, java.lang.Object... p1)`
- `public SELF describedAs(org.assertj.core.description.Description p0)`
- `public final SELF doesNotContain(java.util.Map$Entry... p0)`
- `public SELF doesNotContainEntry(K p0, V p1)`
- `protected SELF doesNotContainForProxy(java.util.Map$Entry[] p0)`
- `public SELF doesNotContainKey(K p0)`
- `public final SELF doesNotContainKeys(K... p0)`
- `protected SELF doesNotContainKeysForProxy(K[] p0)`
- `public SELF doesNotContainValue(V p0)`
- `public SELF doesNotHave(org.assertj.core.api.Condition p0)`
- `public SELF doesNotHaveSameClassAs(java.lang.Object p0)`
- `public org.assertj.core.api.AbstractObjectAssert extracting(java.lang.Object p0)`
- `public org.assertj.core.api.AbstractListAssert extracting(java.lang.Object... p0)`
- `public org.assertj.core.api.AbstractObjectAssert extractingByKey(K p0)`
- `public <ASSERT extends org.assertj.core.api.AbstractAssert<? extends java.lang.Object, ? extends java.lang.Object>> ASSERT extractingByKey(K p0, org.assertj.core.api.InstanceOfAssertFactory p1)`
- `public final org.assertj.core.api.AbstractListAssert extractingByKeys(K... p0)`
- `protected org.assertj.core.api.AbstractListAssert extractingByKeysForProxy(K[] p0)`
- `public org.assertj.core.api.AbstractListAssert extractingFromEntries(java.util.function.Function p0)`
- `public final org.assertj.core.api.AbstractListAssert extractingFromEntries(java.util.function.Function... p0)`
- `protected org.assertj.core.api.AbstractListAssert extractingFromEntriesForProxy(java.util.function.Function[] p0)`
- `public org.assertj.core.api.AbstractListAssert flatExtracting(java.lang.String... p0)`
- `public SELF has(org.assertj.core.api.Condition p0)`
- `public SELF hasEntrySatisfying(K p0, java.util.function.Consumer p1)`
- `public SELF hasEntrySatisfying(K p0, org.assertj.core.api.Condition p1)`
- `public SELF hasEntrySatisfying(org.assertj.core.api.Condition p0, org.assertj.core.api.Condition p1)`
- `public SELF hasEntrySatisfying(org.assertj.core.api.Condition p0)`
- `public SELF hasKeySatisfying(org.assertj.core.api.Condition p0)`
- `public SELF hasSameClassAs(java.lang.Object p0)`
- `public SELF hasSameSizeAs(java.lang.Iterable p0)`
- `public SELF hasSameSizeAs(java.lang.Object p0)`
- `public SELF hasSameSizeAs(java.util.Map p0)`
- `public SELF hasSize(int p0)`
- `public SELF hasSizeBetween(int p0, int p1)`
- `public SELF hasSizeGreaterThan(int p0)`
- `public SELF hasSizeGreaterThanOrEqualTo(int p0)`
- `public SELF hasSizeLessThan(int p0)`
- `public SELF hasSizeLessThanOrEqualTo(int p0)`
- `public SELF hasToString(java.lang.String p0)`
- `public SELF hasValueSatisfying(org.assertj.core.api.Condition p0)`
- `public SELF is(org.assertj.core.api.Condition p0)`
- `public void isEmpty()`
- `public SELF isEqualTo(java.lang.Object p0)`
- `public SELF isExactlyInstanceOf(java.lang.Class p0)`
- `public SELF isIn(java.lang.Iterable p0)`
- `public SELF isIn(java.lang.Object... p0)`
- `public SELF isInstanceOf(java.lang.Class p0)`
- `public SELF isInstanceOfAny(java.lang.Class... p0)`
- `public SELF isNot(org.assertj.core.api.Condition p0)`
- `public SELF isNotEmpty()`
- `public SELF isNotEqualTo(java.lang.Object p0)`
- `public SELF isNotExactlyInstanceOf(java.lang.Class p0)`
- `public SELF isNotIn(java.lang.Iterable p0)`
- `public SELF isNotIn(java.lang.Object... p0)`
- `public SELF isNotInstanceOf(java.lang.Class p0)`
- `public SELF isNotInstanceOfAny(java.lang.Class... p0)`
- `public SELF isNotNull()`
- `public SELF isNotOfAnyClassIn(java.lang.Class... p0)`
- `public SELF isNotSameAs(java.lang.Object p0)`
- `public void isNullOrEmpty()`
- `public SELF isOfAnyClassIn(java.lang.Class... p0)`
- `public SELF isSameAs(java.lang.Object p0)`
- `public SELF noneSatisfy(java.util.function.BiConsumer p0)`
- `public SELF overridingErrorMessage(java.lang.String p0, java.lang.Object... p1)`
- `public org.assertj.core.api.AbstractMapSizeAssert size()`
- `public SELF usingComparator(java.util.Comparator p0)`
- `public SELF usingComparator(java.util.Comparator p0, java.lang.String p1)`
- `public SELF usingDefaultComparator()`
- `public SELF usingDefaultElementComparator()`
- `public SELF usingElementComparator(java.util.Comparator p0)`
- `public org.assertj.core.api.RecursiveComparisonAssert usingRecursiveComparison()`
- `public org.assertj.core.api.RecursiveComparisonAssert usingRecursiveComparison(org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration p0)`
- `public SELF withFailMessage(java.lang.String p0, java.lang.Object... p1)`
- `public SELF withThreadDumpOnError()`

---

## public abstract class `org.assertj.core.api.AbstractMapSizeAssert`<SELF extends org.assertj.core.api.AbstractMapAssert<SELF, A, KEY, VALUE>, A extends java.util.Map<KEY, VALUE>, KEY extends java.lang.Object, VALUE extends java.lang.Object>
extends `org.assertj.core.api.AbstractIntegerAssert`  

**Constructors:**
- `protected AbstractMapSizeAssert(java.lang.Integer p0, java.lang.Class p1)`

**Methods:**
- `public abstract org.assertj.core.api.AbstractMapAssert returnToMap()`

---

## public abstract class `org.assertj.core.api.AbstractMatcherAssert`<SELF extends org.assertj.core.api.AbstractMatcherAssert<SELF>>
extends `org.assertj.core.api.AbstractAssert`  

**Constructors:**
- `protected AbstractMatcherAssert(java.util.regex.Matcher p0, java.lang.Class p1)`

**Methods:**
- `public SELF matches()`

---

## public abstract class `org.assertj.core.api.AbstractObjectArrayAssert`<SELF extends org.assertj.core.api.AbstractObjectArrayAssert<SELF, ELEMENT>, ELEMENT extends java.lang.Object>
extends `org.assertj.core.api.AbstractAssert`  
implements `org.assertj.core.api.ArraySortedAssert<org.assertj.core.api.AbstractObjectArrayAssert<SELF,ELEMENT>,ELEMENT>`, `org.assertj.core.api.IndexedObjectEnumerableAssert<org.assertj.core.api.AbstractObjectArrayAssert<SELF,ELEMENT>,ELEMENT>`  

**Constructors:**
- `protected AbstractObjectArrayAssert(ELEMENT[] p0, java.lang.Class p1)`

**Methods:**
- `public SELF allMatch(java.util.function.Predicate p0)`
- `public SELF allMatch(java.util.function.Predicate p0, java.lang.String p1)`
- `public SELF allSatisfy(java.util.function.Consumer p0)`
- `public SELF allSatisfy(org.assertj.core.api.ThrowingConsumer p0)`
- `public SELF anyMatch(java.util.function.Predicate p0)`
- `public SELF anySatisfy(java.util.function.Consumer p0)`
- `public SELF anySatisfy(org.assertj.core.api.ThrowingConsumer p0)`
- `public SELF are(org.assertj.core.api.Condition p0)`
- `public SELF areAtLeast(int p0, org.assertj.core.api.Condition p1)`
- `public SELF areAtLeastOne(org.assertj.core.api.Condition p0)`
- `public SELF areAtMost(int p0, org.assertj.core.api.Condition p1)`
- `public SELF areExactly(int p0, org.assertj.core.api.Condition p1)`
- `public SELF areNot(org.assertj.core.api.Condition p0)`
- `public SELF as(java.lang.String p0, java.lang.Object... p1)`
- `public SELF as(org.assertj.core.description.Description p0)`
- `public SELF contains(ELEMENT p0, org.assertj.core.data.Index p1)`
- `public final SELF contains(ELEMENT... p0)`
- `public SELF containsAll(java.lang.Iterable p0)`
- `public SELF containsAnyElementsOf(java.lang.Iterable p0)`
- `public final SELF containsAnyOf(ELEMENT... p0)`
- `protected SELF containsAnyOfForProxy(ELEMENT[] p0)`
- `public final SELF containsExactly(ELEMENT... p0)`
- `public SELF containsExactlyElementsOf(java.lang.Iterable p0)`
- `protected SELF containsExactlyForProxy(ELEMENT[] p0)`
- `public final SELF containsExactlyInAnyOrder(ELEMENT... p0)`
- `public SELF containsExactlyInAnyOrderElementsOf(java.lang.Iterable p0)`
- `protected SELF containsExactlyInAnyOrderForProxy(ELEMENT[] p0)`
- `protected SELF containsForProxy(ELEMENT[] p0)`
- `public SELF containsNull()`
- `public final SELF containsOnly(ELEMENT... p0)`
- `public SELF containsOnlyElementsOf(java.lang.Iterable p0)`
- `protected SELF containsOnlyForProxy(ELEMENT[] p0)`
- `public SELF containsOnlyNulls()`
- `public final SELF containsOnlyOnce(ELEMENT... p0)`
- `public SELF containsOnlyOnceElementsOf(java.lang.Iterable p0)`
- `protected SELF containsOnlyOnceForProxy(ELEMENT[] p0)`
- `public final SELF containsSequence(ELEMENT... p0)`
- `public SELF containsSequence(java.lang.Iterable p0)`
- `protected SELF containsSequenceForProxy(ELEMENT[] p0)`
- `public final SELF containsSubsequence(ELEMENT... p0)`
- `public SELF containsSubsequence(java.lang.Iterable p0)`
- `protected SELF containsSubsequenceForProxy(ELEMENT[] p0)`
- `public SELF doNotHave(org.assertj.core.api.Condition p0)`
- `public SELF doesNotContain(ELEMENT p0, org.assertj.core.data.Index p1)`
- `public final SELF doesNotContain(ELEMENT... p0)`
- `public SELF doesNotContainAnyElementsOf(java.lang.Iterable p0)`
- `protected SELF doesNotContainForProxy(ELEMENT[] p0)`
- `public SELF doesNotContainNull()`
- `public final SELF doesNotContainSequence(ELEMENT... p0)`
- `public SELF doesNotContainSequence(java.lang.Iterable p0)`
- `protected SELF doesNotContainSequenceForProxy(ELEMENT[] p0)`
- `public final SELF doesNotContainSubsequence(ELEMENT... p0)`
- `public SELF doesNotContainSubsequence(java.lang.Iterable p0)`
- `protected SELF doesNotContainSubsequenceForProxy(ELEMENT[] p0)`
- `public SELF doesNotHaveAnyElementsOfTypes(java.lang.Class... p0)`
- `public SELF doesNotHaveDuplicates()`
- `public final SELF endsWith(ELEMENT p0, ELEMENT... p1)`
- `public SELF endsWith(ELEMENT[] p0)`
- `protected SELF endsWithForProxy(ELEMENT p0, ELEMENT[] p1)`
- `public org.assertj.core.api.AbstractListAssert extracting(java.lang.String p0)`
- `public <P extends java.lang.Object> org.assertj.core.api.AbstractListAssert extracting(java.lang.String p0, java.lang.Class p1)`
- `public org.assertj.core.api.AbstractListAssert extracting(java.lang.String... p0)`
- `public final org.assertj.core.api.AbstractListAssert extracting(java.util.function.Function... p0)`
- `public <U extends java.lang.Object> org.assertj.core.api.AbstractListAssert extracting(java.util.function.Function p0)`
- `public <V extends java.lang.Object, EXCEPTION extends java.lang.Exception> org.assertj.core.api.AbstractListAssert extracting(org.assertj.core.api.iterable.ThrowingExtractor p0)`
- `protected org.assertj.core.api.AbstractListAssert extractingForProxy(java.util.function.Function[] p0)`
- `public org.assertj.core.api.AbstractListAssert extractingResultOf(java.lang.String p0)`
- `public <P extends java.lang.Object> org.assertj.core.api.AbstractListAssert extractingResultOf(java.lang.String p0, java.lang.Class p1)`
- `public SELF filteredOn(java.lang.String p0, java.lang.Object p1)`
- `public SELF filteredOn(java.lang.String p0, org.assertj.core.api.filter.FilterOperator p1)`
- `public <T extends java.lang.Object> SELF filteredOn(java.util.function.Function p0, T p1)`
- `public SELF filteredOn(java.util.function.Predicate p0)`
- `public SELF filteredOn(org.assertj.core.api.Condition p0)`
- `public SELF filteredOnAssertions(java.util.function.Consumer p0)`
- `public SELF filteredOnAssertions(org.assertj.core.api.ThrowingConsumer p0)`
- `public SELF filteredOnNull(java.lang.String p0)`
- `public org.assertj.core.api.AbstractListAssert flatExtracting(java.lang.String p0)`
- `public <V extends java.lang.Object, C extends java.util.Collection<V>> org.assertj.core.api.AbstractListAssert flatExtracting(java.util.function.Function p0)`
- `public <V extends java.lang.Object, C extends java.util.Collection<V>, EXCEPTION extends java.lang.Exception> org.assertj.core.api.AbstractListAssert flatExtracting(org.assertj.core.api.iterable.ThrowingExtractor p0)`
- `protected org.assertj.core.internal.TypeComparators getComparatorsByType()`
- `protected org.assertj.core.internal.TypeComparators getComparatorsForElementPropertyOrFieldTypes()`
- `public SELF hasAtLeastOneElementOfType(java.lang.Class p0)`
- `public SELF hasExactlyElementsOfTypes(java.lang.Class... p0)`
- `public SELF hasOnlyElementsOfType(java.lang.Class p0)`
- `public SELF hasOnlyElementsOfTypes(java.lang.Class... p0)`
- `public SELF hasOnlyOneElementSatisfying(java.util.function.Consumer p0)`
- `public SELF hasSameElementsAs(java.lang.Iterable p0)`
- `public SELF hasSameSizeAs(java.lang.Iterable p0)`
- `public SELF hasSameSizeAs(java.lang.Object p0)`
- `public SELF hasSize(int p0)`
- `public SELF hasSizeBetween(int p0, int p1)`
- `public SELF hasSizeGreaterThan(int p0)`
- `public SELF hasSizeGreaterThanOrEqualTo(int p0)`
- `public SELF hasSizeLessThan(int p0)`
- `public SELF hasSizeLessThanOrEqualTo(int p0)`
- `public SELF have(org.assertj.core.api.Condition p0)`
- `public SELF haveAtLeast(int p0, org.assertj.core.api.Condition p1)`
- `public SELF haveAtLeastOne(org.assertj.core.api.Condition p0)`
- `public SELF haveAtMost(int p0, org.assertj.core.api.Condition p1)`
- `public SELF haveExactly(int p0, org.assertj.core.api.Condition p1)`
- `public SELF inBinary()`
- `public SELF inHexadecimal()`
- `public void isEmpty()`
- `public SELF isNotEmpty()`
- `public void isNullOrEmpty()`
- `public SELF isSorted()`
- `public SELF isSortedAccordingTo(java.util.Comparator p0)`
- `public final SELF isSubsetOf(ELEMENT... p0)`
- `public SELF isSubsetOf(java.lang.Iterable p0)`
- `protected SELF isSubsetOfForProxy(ELEMENT[] p0)`
- `protected java.lang.String navigationDescription(java.lang.String p0)`
- `protected <E extends java.lang.Object> org.assertj.core.api.AbstractListAssert newListAssertInstance(java.util.List p0)`
- `protected abstract SELF newObjectArrayAssert(ELEMENT[] p0)`
- `public SELF noneMatch(java.util.function.Predicate p0)`
- `public SELF noneSatisfy(java.util.function.Consumer p0)`
- `public SELF noneSatisfy(org.assertj.core.api.ThrowingConsumer p0)`
- `public final SELF satisfiesExactly(java.util.function.Consumer... p0)`
- `public final SELF satisfiesExactly(org.assertj.core.api.ThrowingConsumer... p0)`
- `protected SELF satisfiesExactlyForProxy(java.util.function.Consumer[] p0)`
- `public final SELF satisfiesExactlyInAnyOrder(java.util.function.Consumer... p0)`
- `public final SELF satisfiesExactlyInAnyOrder(org.assertj.core.api.ThrowingConsumer... p0)`
- `protected SELF satisfiesExactlyInAnyOrderForProxy(java.util.function.Consumer[] p0)`
- `public org.assertj.core.api.ObjectAssert singleElement()`
- `public <ASSERT extends org.assertj.core.api.AbstractAssert<? extends java.lang.Object, ? extends java.lang.Object>> ASSERT singleElement(org.assertj.core.api.InstanceOfAssertFactory p0)`
- `public final SELF startsWith(ELEMENT... p0)`
- `protected SELF startsWithForProxy(ELEMENT[] p0)`
- `public <C extends java.lang.Object> SELF usingComparatorForElementFieldsWithNames(java.util.Comparator p0, java.lang.String... p1)`
- `public <C extends java.lang.Object> SELF usingComparatorForElementFieldsWithType(java.util.Comparator p0, java.lang.Class p1)`
- `public <C extends java.lang.Object> SELF usingComparatorForType(java.util.Comparator p0, java.lang.Class p1)`
- `public SELF usingDefaultElementComparator()`
- `public SELF usingElementComparator(java.util.Comparator p0)`
- `public SELF usingElementComparatorIgnoringFields(java.lang.String... p0)`
- `public SELF usingElementComparatorOnFields(java.lang.String... p0)`
- `public SELF usingFieldByFieldElementComparator()`
- `public org.assertj.core.api.RecursiveComparisonAssert usingRecursiveComparison()`
- `public org.assertj.core.api.RecursiveComparisonAssert usingRecursiveComparison(org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration p0)`
- `public SELF usingRecursiveFieldByFieldElementComparator()`
- `public SELF usingRecursiveFieldByFieldElementComparator(org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration p0)`
- `public SELF usingRecursiveFieldByFieldElementComparatorIgnoringFields(java.lang.String... p0)`
- `public SELF usingRecursiveFieldByFieldElementComparatorOnFields(java.lang.String... p0)`
- `public <OTHER_ELEMENT extends java.lang.Object> SELF zipSatisfy(OTHER_ELEMENT[] p0, java.util.function.BiConsumer p1)`

---

## public abstract class `org.assertj.core.api.AbstractObjectAssert`<SELF extends org.assertj.core.api.AbstractObjectAssert<SELF, ACTUAL>, ACTUAL extends java.lang.Object>
extends `org.assertj.core.api.AbstractAssert`  

**Constructors:**
- `public AbstractObjectAssert(ACTUAL p0, java.lang.Class p1)`

**Methods:**
- `public SELF as(java.lang.String p0, java.lang.Object... p1)`
- `public SELF as(org.assertj.core.description.Description p0)`
- `public <T extends java.lang.Object> SELF doesNotReturn(T p0, java.util.function.Function p1)`
- `public org.assertj.core.api.AbstractObjectAssert extracting(java.lang.String p0)`
- `public <ASSERT extends org.assertj.core.api.AbstractAssert<? extends java.lang.Object, ? extends java.lang.Object>> ASSERT extracting(java.lang.String p0, org.assertj.core.api.InstanceOfAssertFactory p1)`
- `public org.assertj.core.api.AbstractListAssert extracting(java.lang.String... p0)`
- `public final org.assertj.core.api.AbstractListAssert extracting(java.util.function.Function... p0)`
- `public <T extends java.lang.Object> org.assertj.core.api.AbstractObjectAssert extracting(java.util.function.Function p0)`
- `public <T extends java.lang.Object, ASSERT extends org.assertj.core.api.AbstractAssert<? extends java.lang.Object, ? extends java.lang.Object>> ASSERT extracting(java.util.function.Function p0, org.assertj.core.api.InstanceOfAssertFactory p1)`
- `protected org.assertj.core.api.AbstractListAssert extractingForProxy(java.util.function.Function[] p0)`
- `protected org.assertj.core.internal.TypeComparators getComparatorsByType()`
- `public SELF hasAllNullFieldsOrProperties()`
- `public SELF hasAllNullFieldsOrPropertiesExcept(java.lang.String... p0)`
- `public SELF hasFieldOrProperty(java.lang.String p0)`
- `public SELF hasFieldOrPropertyWithValue(java.lang.String p0, java.lang.Object p1)`
- `public SELF hasNoNullFieldsOrProperties()`
- `public SELF hasNoNullFieldsOrPropertiesExcept(java.lang.String... p0)`
- `public SELF hasOnlyFields(java.lang.String... p0)`
- `public SELF isEqualToComparingFieldByField(java.lang.Object p0)`
- `public SELF isEqualToComparingFieldByFieldRecursively(java.lang.Object p0)`
- `public SELF isEqualToComparingOnlyGivenFields(java.lang.Object p0, java.lang.String... p1)`
- `public SELF isEqualToIgnoringGivenFields(java.lang.Object p0, java.lang.String... p1)`
- `public SELF isEqualToIgnoringNullFields(java.lang.Object p0)`
- `protected <T extends java.lang.Object> org.assertj.core.api.AbstractObjectAssert newObjectAssert(T p0)`
- `public <T extends java.lang.Object> SELF returns(T p0, java.util.function.Function p1)`
- `public <T extends java.lang.Object> SELF usingComparatorForFields(java.util.Comparator p0, java.lang.String... p1)`
- `public <T extends java.lang.Object> SELF usingComparatorForType(java.util.Comparator p0, java.lang.Class p1)`
- `public org.assertj.core.api.RecursiveComparisonAssert usingRecursiveComparison()`
- `public org.assertj.core.api.RecursiveComparisonAssert usingRecursiveComparison(org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration p0)`

---

## public abstract class `org.assertj.core.api.AbstractOffsetDateTimeAssert`<SELF extends org.assertj.core.api.AbstractOffsetDateTimeAssert<SELF>>
extends `org.assertj.core.api.AbstractTemporalAssert`  

**Constructors:**
- `protected AbstractOffsetDateTimeAssert(java.time.OffsetDateTime p0, java.lang.Class p1)`

**Fields:**
- `public final static java.lang.String NULL_OFFSET_DATE_TIME_PARAMETER_MESSAGE`

**Methods:**
- `public SELF isAfter(java.lang.String p0)`
- `public SELF isAfter(java.time.OffsetDateTime p0)`
- `public SELF isAfterOrEqualTo(java.lang.String p0)`
- `public SELF isAfterOrEqualTo(java.time.OffsetDateTime p0)`
- `public SELF isAtSameInstantAs(java.time.OffsetDateTime p0)`
- `public SELF isBefore(java.lang.String p0)`
- `public SELF isBefore(java.time.OffsetDateTime p0)`
- `public SELF isBeforeOrEqualTo(java.lang.String p0)`
- `public SELF isBeforeOrEqualTo(java.time.OffsetDateTime p0)`
- `public SELF isBetween(java.lang.String p0, java.lang.String p1)`
- `public SELF isBetween(java.time.OffsetDateTime p0, java.time.OffsetDateTime p1)`
- `public SELF isCloseToUtcNow(org.assertj.core.data.TemporalUnitOffset p0)`
- `public SELF isEqualTo(java.lang.Object p0)`
- `public SELF isEqualTo(java.lang.String p0)`
- `public SELF isEqualToIgnoringHours(java.time.OffsetDateTime p0)`
- `public SELF isEqualToIgnoringMinutes(java.time.OffsetDateTime p0)`
- `public SELF isEqualToIgnoringNanos(java.time.OffsetDateTime p0)`
- `public SELF isEqualToIgnoringSeconds(java.time.OffsetDateTime p0)`
- `public SELF isEqualToIgnoringTimezone(java.time.OffsetDateTime p0)`
- `public SELF isIn(java.lang.String... p0)`
- `public SELF isNotEqualTo(java.lang.Object p0)`
- `public SELF isNotEqualTo(java.lang.String p0)`
- `public SELF isNotIn(java.lang.String... p0)`
- `public SELF isStrictlyBetween(java.lang.String p0, java.lang.String p1)`
- `public SELF isStrictlyBetween(java.time.OffsetDateTime p0, java.time.OffsetDateTime p1)`
- `protected java.time.OffsetDateTime parse(java.lang.String p0)`
- `public SELF usingDefaultComparator()`

---

## public abstract class `org.assertj.core.api.AbstractOffsetTimeAssert`<SELF extends org.assertj.core.api.AbstractOffsetTimeAssert<SELF>>
extends `org.assertj.core.api.AbstractTemporalAssert`  

**Constructors:**
- `protected AbstractOffsetTimeAssert(java.time.OffsetTime p0, java.lang.Class p1)`

**Fields:**
- `public final static java.lang.String NULL_OFFSET_TIME_PARAMETER_MESSAGE`

**Methods:**
- `public SELF hasSameHourAs(java.time.OffsetTime p0)`
- `public SELF isAfter(java.lang.String p0)`
- `public SELF isAfter(java.time.OffsetTime p0)`
- `public SELF isAfterOrEqualTo(java.lang.String p0)`
- `public SELF isAfterOrEqualTo(java.time.OffsetTime p0)`
- `public SELF isBefore(java.lang.String p0)`
- `public SELF isBefore(java.time.OffsetTime p0)`
- `public SELF isBeforeOrEqualTo(java.lang.String p0)`
- `public SELF isBeforeOrEqualTo(java.time.OffsetTime p0)`
- `public SELF isBetween(java.lang.String p0, java.lang.String p1)`
- `public SELF isBetween(java.time.OffsetTime p0, java.time.OffsetTime p1)`
- `public SELF isEqualTo(java.lang.String p0)`
- `public SELF isEqualToIgnoringNanos(java.time.OffsetTime p0)`
- `public SELF isEqualToIgnoringSeconds(java.time.OffsetTime p0)`
- `public SELF isEqualToIgnoringTimezone(java.time.OffsetTime p0)`
- `public SELF isIn(java.lang.String... p0)`
- `public SELF isNotEqualTo(java.lang.String p0)`
- `public SELF isNotIn(java.lang.String... p0)`
- `public SELF isStrictlyBetween(java.lang.String p0, java.lang.String p1)`
- `public SELF isStrictlyBetween(java.time.OffsetTime p0, java.time.OffsetTime p1)`
- `protected java.time.OffsetTime parse(java.lang.String p0)`

---

## public abstract class `org.assertj.core.api.AbstractOptionalAssert`<SELF extends org.assertj.core.api.AbstractOptionalAssert<SELF, VALUE>, VALUE extends java.lang.Object>
extends `org.assertj.core.api.AbstractAssert`  

**Constructors:**
- `protected AbstractOptionalAssert(java.util.Optional p0, java.lang.Class p1)`

**Methods:**
- `public SELF contains(VALUE p0)`
- `public SELF containsInstanceOf(java.lang.Class p0)`
- `public SELF containsSame(VALUE p0)`
- `public <U extends java.lang.Object> org.assertj.core.api.AbstractOptionalAssert flatMap(java.util.function.Function p0)`
- `public org.assertj.core.api.AbstractObjectAssert get()`
- `public <ASSERT extends org.assertj.core.api.AbstractAssert<? extends java.lang.Object, ? extends java.lang.Object>> ASSERT get(org.assertj.core.api.InstanceOfAssertFactory p0)`
- `public SELF hasValue(VALUE p0)`
- `public SELF hasValueSatisfying(java.util.function.Consumer p0)`
- `public SELF hasValueSatisfying(org.assertj.core.api.Condition p0)`
- `public SELF isEmpty()`
- `public SELF isNotEmpty()`
- `public SELF isNotPresent()`
- `public SELF isPresent()`
- `public <U extends java.lang.Object> org.assertj.core.api.AbstractOptionalAssert map(java.util.function.Function p0)`
- `public SELF usingDefaultValueComparator()`
- `public SELF usingFieldByFieldValueComparator()`
- `public org.assertj.core.api.RecursiveComparisonAssert usingRecursiveComparison()`
- `public org.assertj.core.api.RecursiveComparisonAssert usingRecursiveComparison(org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration p0)`
- `public SELF usingValueComparator(java.util.Comparator p0)`

---

## public abstract class `org.assertj.core.api.AbstractOptionalDoubleAssert`<SELF extends org.assertj.core.api.AbstractOptionalDoubleAssert<SELF>>
extends `org.assertj.core.api.AbstractAssert`  

**Constructors:**
- `protected AbstractOptionalDoubleAssert(java.util.OptionalDouble p0, java.lang.Class p1)`

**Methods:**
- `public SELF hasValue(double p0)`
- `public SELF hasValueCloseTo(java.lang.Double p0, org.assertj.core.data.Offset p1)`
- `public SELF hasValueCloseTo(java.lang.Double p0, org.assertj.core.data.Percentage p1)`
- `public SELF isEmpty()`
- `public SELF isNotEmpty()`
- `public SELF isNotPresent()`
- `public SELF isPresent()`

---

## public abstract class `org.assertj.core.api.AbstractOptionalIntAssert`<SELF extends org.assertj.core.api.AbstractOptionalIntAssert<SELF>>
extends `org.assertj.core.api.AbstractAssert`  

**Constructors:**
- `protected AbstractOptionalIntAssert(java.util.OptionalInt p0, java.lang.Class p1)`

**Methods:**
- `public SELF hasValue(int p0)`
- `public SELF isEmpty()`
- `public SELF isNotEmpty()`
- `public SELF isNotPresent()`
- `public SELF isPresent()`

---

## public abstract class `org.assertj.core.api.AbstractOptionalLongAssert`<SELF extends org.assertj.core.api.AbstractOptionalLongAssert<SELF>>
extends `org.assertj.core.api.AbstractAssert`  

**Constructors:**
- `protected AbstractOptionalLongAssert(java.util.OptionalLong p0, java.lang.Class p1)`

**Methods:**
- `public SELF hasValue(long p0)`
- `public SELF isEmpty()`
- `public SELF isNotEmpty()`
- `public SELF isNotPresent()`
- `public SELF isPresent()`

---

## public abstract class `org.assertj.core.api.AbstractPathAssert`<SELF extends org.assertj.core.api.AbstractPathAssert<SELF>>
extends `org.assertj.core.api.AbstractComparableAssert`  

**Constructors:**
- `protected AbstractPathAssert(java.nio.file.Path p0, java.lang.Class p1)`

**Fields:**
- `protected org.assertj.core.internal.Paths paths`

**Methods:**
- `public org.assertj.core.api.AbstractByteArrayAssert binaryContent()`
- `public org.assertj.core.api.AbstractStringAssert content()`
- `public org.assertj.core.api.AbstractStringAssert content(java.nio.charset.Charset p0)`
- `public SELF doesNotExist()`
- `public SELF endsWith(java.nio.file.Path p0)`
- `public SELF endsWithRaw(java.nio.file.Path p0)`
- `public SELF exists()`
- `public SELF existsNoFollowLinks()`
- `public SELF hasBinaryContent(byte[] p0)`
- `public SELF hasContent(java.lang.String p0)`
- `public SELF hasDigest(java.lang.String p0, byte[] p1)`
- `public SELF hasDigest(java.lang.String p0, java.lang.String p1)`
- `public SELF hasDigest(java.security.MessageDigest p0, byte[] p1)`
- `public SELF hasDigest(java.security.MessageDigest p0, java.lang.String p1)`
- `public SELF hasExtension(java.lang.String p0)`
- `public SELF hasFileName(java.lang.String p0)`
- `public SELF hasFileSystem(java.nio.file.FileSystem p0)`
- `public SELF hasNoExtension()`
- `public SELF hasNoParent()`
- `public SELF hasNoParentRaw()`
- `public SELF hasParent(java.nio.file.Path p0)`
- `public SELF hasParentRaw(java.nio.file.Path p0)`
- `public SELF hasSameBinaryContentAs(java.nio.file.Path p0)`
- `public SELF hasSameContentAs(java.nio.file.Path p0)`
- `public SELF hasSameContentAs(java.nio.file.Path p0, java.nio.charset.Charset p1)`
- `public SELF hasSameFileSystemAs(java.nio.file.Path p0)`
- `public SELF hasSameTextualContentAs(java.nio.file.Path p0)`
- `public SELF hasSameTextualContentAs(java.nio.file.Path p0, java.nio.charset.Charset p1)`
- `public SELF hasSize(long p0)`
- `public SELF isAbsolute()`
- `public SELF isCanonical()`
- `public SELF isDirectory()`
- `public SELF isDirectoryContaining(java.lang.String p0)`
- `public SELF isDirectoryContaining(java.util.function.Predicate p0)`
- `public SELF isDirectoryNotContaining(java.lang.String p0)`
- `public SELF isDirectoryNotContaining(java.util.function.Predicate p0)`
- `public SELF isDirectoryRecursivelyContaining(java.lang.String p0)`
- `public SELF isDirectoryRecursivelyContaining(java.util.function.Predicate p0)`
- `public SELF isEmptyDirectory()`
- `public SELF isEmptyFile()`
- `public SELF isExecutable()`
- `public SELF isNormalized()`
- `public SELF isNotEmptyDirectory()`
- `public SELF isNotEmptyFile()`
- `public SELF isReadable()`
- `public SELF isRegularFile()`
- `public SELF isRelative()`
- `public SELF isSymbolicLink()`
- `public SELF isWritable()`
- `public SELF startsWith(java.nio.file.Path p0)`
- `public SELF startsWithRaw(java.nio.file.Path p0)`
- `public SELF usingCharset(java.lang.String p0)`
- `public SELF usingCharset(java.nio.charset.Charset p0)`

---

## public abstract class `org.assertj.core.api.AbstractPeriodAssert`<SELF extends org.assertj.core.api.AbstractPeriodAssert<SELF>>
extends `org.assertj.core.api.AbstractAssert`  

**Constructors:**
- `protected AbstractPeriodAssert(java.time.Period p0, java.lang.Class p1)`

**Methods:**
- `public SELF hasDays(int p0)`
- `public SELF hasMonths(int p0)`
- `public SELF hasYears(int p0)`
- `public SELF isNegative()`
- `public SELF isPositive()`

---

## public abstract class `org.assertj.core.api.AbstractPredicateAssert`<SELF extends org.assertj.core.api.AbstractPredicateAssert<SELF, T>, T extends java.lang.Object>
extends `org.assertj.core.api.AbstractAssert`  

**Constructors:**
- `protected AbstractPredicateAssert(java.util.function.Predicate p0, java.lang.Class p1)`

**Methods:**
- `public final SELF accepts(T... p0)`
- `public SELF acceptsAll(java.lang.Iterable p0)`
- `protected SELF acceptsForProxy(T[] p0)`
- `public final SELF rejects(T... p0)`
- `public SELF rejectsAll(java.lang.Iterable p0)`
- `protected SELF rejectsForProxy(T[] p0)`

---

## public abstract class `org.assertj.core.api.AbstractShortArrayAssert`<SELF extends org.assertj.core.api.AbstractShortArrayAssert<SELF>>
extends `org.assertj.core.api.AbstractArrayAssert`  

**Constructors:**
- `protected AbstractShortArrayAssert(short[] p0, java.lang.Class p1)`

**Fields:**
- `protected org.assertj.core.internal.ShortArrays arrays`

**Methods:**
- `public SELF contains(int p0, org.assertj.core.data.Index p1)`
- `public SELF contains(int... p0)`
- `public SELF contains(java.lang.Short[] p0)`
- `public SELF contains(short p0, org.assertj.core.data.Index p1)`
- `public SELF contains(short... p0)`
- `public SELF containsAnyOf(int... p0)`
- `public SELF containsAnyOf(java.lang.Short[] p0)`
- `public SELF containsAnyOf(short... p0)`
- `public SELF containsExactly(int... p0)`
- `public SELF containsExactly(java.lang.Short[] p0)`
- `public SELF containsExactly(short... p0)`
- `public SELF containsExactlyInAnyOrder(int... p0)`
- `public SELF containsExactlyInAnyOrder(java.lang.Short[] p0)`
- `public SELF containsExactlyInAnyOrder(short... p0)`
- `public SELF containsOnly(int... p0)`
- `public SELF containsOnly(java.lang.Short[] p0)`
- `public SELF containsOnly(short... p0)`
- `public SELF containsOnlyOnce(int... p0)`
- `public SELF containsOnlyOnce(java.lang.Short[] p0)`
- `public SELF containsOnlyOnce(short... p0)`
- `public SELF containsSequence(int... p0)`
- `public SELF containsSequence(java.lang.Short[] p0)`
- `public SELF containsSequence(short... p0)`
- `public SELF containsSubsequence(int... p0)`
- `public SELF containsSubsequence(java.lang.Short[] p0)`
- `public SELF containsSubsequence(short... p0)`
- `public SELF doesNotContain(int p0, org.assertj.core.data.Index p1)`
- `public SELF doesNotContain(int... p0)`
- `public SELF doesNotContain(java.lang.Short[] p0)`
- `public SELF doesNotContain(short p0, org.assertj.core.data.Index p1)`
- `public SELF doesNotContain(short... p0)`
- `public SELF doesNotHaveDuplicates()`
- `public SELF endsWith(int... p0)`
- `public SELF endsWith(java.lang.Short[] p0)`
- `public SELF endsWith(short... p0)`
- `public SELF hasSameSizeAs(java.lang.Iterable p0)`
- `public SELF hasSize(int p0)`
- `public SELF hasSizeBetween(int p0, int p1)`
- `public SELF hasSizeGreaterThan(int p0)`
- `public SELF hasSizeGreaterThanOrEqualTo(int p0)`
- `public SELF hasSizeLessThan(int p0)`
- `public SELF hasSizeLessThanOrEqualTo(int p0)`
- `public void isEmpty()`
- `public SELF isNotEmpty()`
- `public void isNullOrEmpty()`
- `public SELF isSorted()`
- `public SELF isSortedAccordingTo(java.util.Comparator p0)`
- `public SELF startsWith(int... p0)`
- `public SELF startsWith(java.lang.Short[] p0)`
- `public SELF startsWith(short... p0)`
- `public SELF usingDefaultElementComparator()`
- `public SELF usingElementComparator(java.util.Comparator p0)`

---

## public abstract class `org.assertj.core.api.AbstractShortAssert`<SELF extends org.assertj.core.api.AbstractShortAssert<SELF>>
extends `org.assertj.core.api.AbstractComparableAssert`  
implements `org.assertj.core.api.NumberAssert<SELF,java.lang.Short>`  

**Constructors:**
- `protected AbstractShortAssert(java.lang.Short p0, java.lang.Class p1)`

**Methods:**
- `public SELF isBetween(java.lang.Short p0, java.lang.Short p1)`
- `public SELF isCloseTo(java.lang.Short p0, org.assertj.core.data.Offset p1)`
- `public SELF isCloseTo(java.lang.Short p0, org.assertj.core.data.Percentage p1)`
- `public SELF isCloseTo(short p0, org.assertj.core.data.Offset p1)`
- `public SELF isCloseTo(short p0, org.assertj.core.data.Percentage p1)`
- `public SELF isEqualTo(short p0)`
- `public SELF isEven()`
- `public SELF isGreaterThan(short p0)`
- `public SELF isGreaterThanOrEqualTo(short p0)`
- `public SELF isLessThan(short p0)`
- `public SELF isLessThanOrEqualTo(short p0)`
- `public SELF isNegative()`
- `public SELF isNotCloseTo(java.lang.Short p0, org.assertj.core.data.Offset p1)`
- `public SELF isNotCloseTo(java.lang.Short p0, org.assertj.core.data.Percentage p1)`
- `public SELF isNotCloseTo(short p0, org.assertj.core.data.Offset p1)`
- `public SELF isNotCloseTo(short p0, org.assertj.core.data.Percentage p1)`
- `public SELF isNotEqualTo(short p0)`
- `public SELF isNotNegative()`
- `public SELF isNotPositive()`
- `public SELF isNotZero()`
- `public SELF isOdd()`
- `public SELF isOne()`
- `public SELF isPositive()`
- `public SELF isStrictlyBetween(java.lang.Short p0, java.lang.Short p1)`
- `public SELF isZero()`
- `public SELF usingComparator(java.util.Comparator p0)`
- `public SELF usingComparator(java.util.Comparator p0, java.lang.String p1)`
- `public SELF usingDefaultComparator()`

---

## public abstract class `org.assertj.core.api.AbstractSoftAssertions`
extends `org.assertj.core.api.DefaultAssertionErrorCollector`  
implements `org.assertj.core.api.InstanceOfAssertFactories`, `org.assertj.core.api.SoftAssertionsProvider`  

**Constructors:**
- `protected AbstractSoftAssertions()`

**Methods:**
- `public void assertAll()`
- `public static void assertAll(org.assertj.core.api.AssertionErrorCollector p0)`
- `public java.util.List errorsCollected()`
- `public <T extends java.lang.Object> T fail(java.lang.String p0)`
- `public <T extends java.lang.Object> T fail(java.lang.String p0, java.lang.Object... p1)`
- `public <T extends java.lang.Object> T fail(java.lang.String p0, java.lang.Throwable p1)`
- `public void failBecauseExceptionWasNotThrown(java.lang.Class p0)`
- `public <SELF extends org.assertj.core.api.Assert<? extends SELF, ? extends ACTUAL>, ACTUAL extends java.lang.Object> SELF proxy(java.lang.Class p0, java.lang.Class p1, ACTUAL p2)`
- `public void shouldHaveThrown(java.lang.Class p0)`

---

## public class `org.assertj.core.api.AbstractSpliteratorAssert`<SELF extends org.assertj.core.api.AbstractSpliteratorAssert<SELF, ELEMENT>, ELEMENT extends java.lang.Object>
extends `org.assertj.core.api.AbstractAssert`  

**Constructors:**
- `protected AbstractSpliteratorAssert(java.util.Spliterator p0, java.lang.Class p1)`

**Methods:**
- `public SELF hasCharacteristics(int... p0)`
- `public SELF hasOnlyCharacteristics(int... p0)`

---

## public class `org.assertj.core.api.AbstractStringAssert`<SELF extends org.assertj.core.api.AbstractStringAssert<SELF>>
extends `org.assertj.core.api.AbstractCharSequenceAssert`  

**Constructors:**
- `protected AbstractStringAssert(java.lang.String p0, java.lang.Class p1)`

**Methods:**
- `public org.assertj.core.api.AbstractByteArrayAssert asBase64Decoded()`
- `public org.assertj.core.api.AbstractByteArrayAssert decodedAsBase64()`
- `public SELF isBase64()`
- `public SELF isBetween(java.lang.String p0, java.lang.String p1)`
- `public SELF isEqualTo(java.lang.String p0)`
- `public SELF isEqualTo(java.lang.String p0, java.lang.Object... p1)`
- `public SELF isGreaterThan(java.lang.String p0)`
- `public SELF isGreaterThanOrEqualTo(java.lang.String p0)`
- `public SELF isLessThan(java.lang.String p0)`
- `public SELF isLessThanOrEqualTo(java.lang.String p0)`
- `public SELF isStrictlyBetween(java.lang.String p0, java.lang.String p1)`
- `public SELF usingComparator(java.util.Comparator p0)`
- `public SELF usingComparator(java.util.Comparator p0, java.lang.String p1)`
- `public SELF usingDefaultComparator()`

---

## public abstract class `org.assertj.core.api.AbstractTemporalAssert`<SELF extends org.assertj.core.api.AbstractTemporalAssert<SELF, TEMPORAL>, TEMPORAL extends java.time.temporal.Temporal>
extends `org.assertj.core.api.AbstractAssert`  

**Constructors:**
- `protected AbstractTemporalAssert(TEMPORAL p0, java.lang.Class p1)`

**Methods:**
- `protected TEMPORAL getActual()`
- `public SELF isCloseTo(TEMPORAL p0, org.assertj.core.data.TemporalOffset p1)`
- `public SELF isCloseTo(java.lang.String p0, org.assertj.core.data.TemporalOffset p1)`
- `protected abstract TEMPORAL parse(java.lang.String p0)`
- `public SELF usingComparator(java.util.Comparator p0)`
- `public SELF usingComparator(java.util.Comparator p0, java.lang.String p1)`
- `public SELF usingDefaultComparator()`

---

## public abstract class `org.assertj.core.api.AbstractThrowableAssert`<SELF extends org.assertj.core.api.AbstractThrowableAssert<SELF, ACTUAL>, ACTUAL extends java.lang.Throwable>
extends `org.assertj.core.api.AbstractObjectAssert`  

**Constructors:**
- `protected AbstractThrowableAssert(ACTUAL p0, java.lang.Class p1)`

**Methods:**
- `public org.assertj.core.api.AbstractThrowableAssert cause()`
- `public void doesNotThrowAnyException()`
- `public org.assertj.core.api.AbstractThrowableAssert getCause()`
- `public org.assertj.core.api.AbstractThrowableAssert getRootCause()`
- `protected SELF hasBeenThrown()`
- `public SELF hasCause(java.lang.Throwable p0)`
- `public SELF hasCauseExactlyInstanceOf(java.lang.Class p0)`
- `public SELF hasCauseInstanceOf(java.lang.Class p0)`
- `public SELF hasCauseReference(java.lang.Throwable p0)`
- `public SELF hasMessage(java.lang.String p0)`
- `public SELF hasMessage(java.lang.String p0, java.lang.Object... p1)`
- `public SELF hasMessageContaining(java.lang.String p0)`
- `public SELF hasMessageContaining(java.lang.String p0, java.lang.Object... p1)`
- `public SELF hasMessageContainingAll(java.lang.CharSequence... p0)`
- `public SELF hasMessageEndingWith(java.lang.String p0)`
- `public SELF hasMessageEndingWith(java.lang.String p0, java.lang.Object... p1)`
- `public SELF hasMessageFindingMatch(java.lang.String p0)`
- `public SELF hasMessageMatching(java.lang.String p0)`
- `public SELF hasMessageNotContaining(java.lang.String p0)`
- `public SELF hasMessageNotContainingAny(java.lang.CharSequence... p0)`
- `public SELF hasMessageStartingWith(java.lang.String p0)`
- `public SELF hasMessageStartingWith(java.lang.String p0, java.lang.Object... p1)`
- `public SELF hasNoCause()`
- `public SELF hasNoSuppressedExceptions()`
- `public SELF hasRootCause(java.lang.Throwable p0)`
- `public SELF hasRootCauseExactlyInstanceOf(java.lang.Class p0)`
- `public SELF hasRootCauseInstanceOf(java.lang.Class p0)`
- `public SELF hasRootCauseMessage(java.lang.String p0)`
- `public SELF hasRootCauseMessage(java.lang.String p0, java.lang.Object... p1)`
- `public SELF hasStackTraceContaining(java.lang.String p0)`
- `public SELF hasStackTraceContaining(java.lang.String p0, java.lang.Object... p1)`
- `public SELF hasSuppressedException(java.lang.Throwable p0)`
- `public org.assertj.core.api.AbstractStringAssert message()`
- `public org.assertj.core.api.AbstractThrowableAssert rootCause()`

---

## public abstract class `org.assertj.core.api.AbstractUniversalComparableAssert`<SELF extends org.assertj.core.api.AbstractUniversalComparableAssert<SELF, T>, T extends java.lang.Object>
extends `org.assertj.core.api.AbstractObjectAssert`  

**Constructors:**
- `protected AbstractUniversalComparableAssert(java.lang.Comparable p0, java.lang.Class p1)`

**Methods:**
- `public SELF inBinary()`
- `public SELF inHexadecimal()`
- `public SELF isBetween(T p0, T p1)`
- `public SELF isEqualByComparingTo(T p0)`
- `public SELF isGreaterThan(T p0)`
- `public SELF isGreaterThanOrEqualTo(T p0)`
- `public SELF isLessThan(T p0)`
- `public SELF isLessThanOrEqualTo(T p0)`
- `public SELF isNotEqualByComparingTo(T p0)`
- `public SELF isStrictlyBetween(T p0, T p1)`
- `public SELF usingComparator(java.util.Comparator p0)`
- `public SELF usingComparator(java.util.Comparator p0, java.lang.String p1)`
- `public SELF usingDefaultComparator()`

---

## public abstract class `org.assertj.core.api.AbstractUriAssert`<SELF extends org.assertj.core.api.AbstractUriAssert<SELF>>
extends `org.assertj.core.api.AbstractComparableAssert`  

**Constructors:**
- `protected AbstractUriAssert(java.net.URI p0, java.lang.Class p1)`

**Fields:**
- `protected org.assertj.core.internal.Uris uris`

**Methods:**
- `public SELF hasAuthority(java.lang.String p0)`
- `public SELF hasFragment(java.lang.String p0)`
- `public SELF hasHost(java.lang.String p0)`
- `public SELF hasNoFragment()`
- `public SELF hasNoHost()`
- `public SELF hasNoParameter(java.lang.String p0)`
- `public SELF hasNoParameter(java.lang.String p0, java.lang.String p1)`
- `public SELF hasNoParameters()`
- `public SELF hasNoPath()`
- `public SELF hasNoPort()`
- `public SELF hasNoQuery()`
- `public SELF hasNoUserInfo()`
- `public SELF hasParameter(java.lang.String p0)`
- `public SELF hasParameter(java.lang.String p0, java.lang.String p1)`
- `public SELF hasPath(java.lang.String p0)`
- `public SELF hasPort(int p0)`
- `public SELF hasQuery(java.lang.String p0)`
- `public SELF hasScheme(java.lang.String p0)`
- `public SELF hasUserInfo(java.lang.String p0)`

---

## public abstract class `org.assertj.core.api.AbstractUrlAssert`<SELF extends org.assertj.core.api.AbstractUrlAssert<SELF>>
extends `org.assertj.core.api.AbstractAssert`  

**Constructors:**
- `protected AbstractUrlAssert(java.net.URL p0, java.lang.Class p1)`

**Fields:**
- `protected org.assertj.core.internal.Urls urls`

**Methods:**
- `public SELF hasAnchor(java.lang.String p0)`
- `public SELF hasAuthority(java.lang.String p0)`
- `public SELF hasHost(java.lang.String p0)`
- `public SELF hasNoAnchor()`
- `public SELF hasNoHost()`
- `public SELF hasNoParameter(java.lang.String p0)`
- `public SELF hasNoParameter(java.lang.String p0, java.lang.String p1)`
- `public SELF hasNoParameters()`
- `public SELF hasNoPath()`
- `public SELF hasNoPort()`
- `public SELF hasNoQuery()`
- `public SELF hasNoUserInfo()`
- `public SELF hasParameter(java.lang.String p0)`
- `public SELF hasParameter(java.lang.String p0, java.lang.String p1)`
- `public SELF hasPath(java.lang.String p0)`
- `public SELF hasPort(int p0)`
- `public SELF hasProtocol(java.lang.String p0)`
- `public SELF hasQuery(java.lang.String p0)`
- `public SELF hasUserInfo(java.lang.String p0)`
- `public SELF isEqualToWithSortedQueryParameters(java.net.URL p0)`

---

## public abstract class `org.assertj.core.api.AbstractZonedDateTimeAssert`<SELF extends org.assertj.core.api.AbstractZonedDateTimeAssert<SELF>>
extends `org.assertj.core.api.AbstractTemporalAssert`  

**Constructors:**
- `protected AbstractZonedDateTimeAssert(java.time.ZonedDateTime p0, java.lang.Class p1)`

**Fields:**
- `public final static java.lang.String NULL_DATE_TIME_PARAMETER_MESSAGE`

**Methods:**
- `public SELF isAfter(java.lang.String p0)`
- `public SELF isAfter(java.time.ZonedDateTime p0)`
- `public SELF isAfterOrEqualTo(java.lang.String p0)`
- `public SELF isAfterOrEqualTo(java.time.ZonedDateTime p0)`
- `public SELF isBefore(java.lang.String p0)`
- `public SELF isBefore(java.time.ZonedDateTime p0)`
- `public SELF isBeforeOrEqualTo(java.lang.String p0)`
- `public SELF isBeforeOrEqualTo(java.time.ZonedDateTime p0)`
- `public SELF isBetween(java.lang.String p0, java.lang.String p1)`
- `public SELF isBetween(java.time.ZonedDateTime p0, java.time.ZonedDateTime p1)`
- `public SELF isEqualTo(java.lang.Object p0)`
- `public SELF isEqualTo(java.lang.String p0)`
- `public SELF isEqualToIgnoringHours(java.time.ZonedDateTime p0)`
- `public SELF isEqualToIgnoringMinutes(java.time.ZonedDateTime p0)`
- `public SELF isEqualToIgnoringNanos(java.time.ZonedDateTime p0)`
- `public SELF isEqualToIgnoringSeconds(java.time.ZonedDateTime p0)`
- `public SELF isIn(java.lang.String... p0)`
- `public SELF isIn(java.time.ZonedDateTime... p0)`
- `public SELF isNotEqualTo(java.lang.Object p0)`
- `public SELF isNotEqualTo(java.lang.String p0)`
- `public SELF isNotIn(java.lang.String... p0)`
- `public SELF isNotIn(java.time.ZonedDateTime... p0)`
- `public SELF isStrictlyBetween(java.lang.String p0, java.lang.String p1)`
- `public SELF isStrictlyBetween(java.time.ZonedDateTime p0, java.time.ZonedDateTime p1)`
- `protected java.time.ZonedDateTime parse(java.lang.String p0)`
- `public SELF usingDefaultComparator()`

---

## public abstract interface `org.assertj.core.api.AfterAssertionErrorCollected`
annotations: @java.lang.FunctionalInterface  

**Methods:**
- `public abstract void onAssertionErrorCollected(java.lang.AssertionError p0)`

---

## public abstract interface `org.assertj.core.api.Array2DAssert`<SELF extends org.assertj.core.api.Array2DAssert<SELF, ELEMENT>, ELEMENT extends java.lang.Object>

**Methods:**
- `public abstract SELF hasDimensions(int p0, int p1)`
- `public abstract SELF hasNumberOfRows(int p0)`
- `public abstract SELF hasSameDimensionsAs(java.lang.Object p0)`
- `public abstract void isEmpty()`
- `public abstract SELF isNotEmpty()`
- `public abstract void isNullOrEmpty()`

---

## public abstract interface `org.assertj.core.api.ArraySortedAssert`<SELF extends org.assertj.core.api.ArraySortedAssert<SELF, ELEMENT>, ELEMENT extends java.lang.Object>

**Methods:**
- `public abstract SELF isSorted()`
- `public abstract SELF isSortedAccordingTo(java.util.Comparator p0)`

---

## public abstract interface `org.assertj.core.api.Assert`<SELF extends org.assertj.core.api.Assert<SELF, ACTUAL>, ACTUAL extends java.lang.Object>
implements `org.assertj.core.api.Descriptable<SELF>`, `org.assertj.core.api.ExtensionPoints<SELF,ACTUAL>`  

**Methods:**
- `public abstract <ASSERT extends org.assertj.core.api.AbstractAssert<? extends java.lang.Object, ? extends java.lang.Object>> ASSERT asInstanceOf(org.assertj.core.api.InstanceOfAssertFactory p0)`
- `public abstract org.assertj.core.api.AbstractListAssert asList()`
- `public abstract org.assertj.core.api.AbstractCharSequenceAssert asString()`
- `public abstract SELF doesNotHaveSameClassAs(java.lang.Object p0)`
- `public abstract SELF doesNotHaveSameHashCodeAs(java.lang.Object p0)`
- `public abstract SELF doesNotHaveToString(java.lang.String p0)`
- `public abstract boolean equals(java.lang.Object p0)`
- `public abstract SELF hasSameClassAs(java.lang.Object p0)`
- `public abstract SELF hasSameHashCodeAs(java.lang.Object p0)`
- `public abstract SELF hasToString(java.lang.String p0)`
- `public abstract SELF isEqualTo(java.lang.Object p0)`
- `public abstract SELF isExactlyInstanceOf(java.lang.Class p0)`
- `public abstract SELF isIn(java.lang.Iterable p0)`
- `public abstract SELF isIn(java.lang.Object... p0)`
- `public abstract SELF isInstanceOf(java.lang.Class p0)`
- `public abstract SELF isInstanceOfAny(java.lang.Class... p0)`
- `public abstract <T extends java.lang.Object> SELF isInstanceOfSatisfying(java.lang.Class p0, java.util.function.Consumer p1)`
- `public abstract SELF isNotEqualTo(java.lang.Object p0)`
- `public abstract SELF isNotExactlyInstanceOf(java.lang.Class p0)`
- `public abstract SELF isNotIn(java.lang.Iterable p0)`
- `public abstract SELF isNotIn(java.lang.Object... p0)`
- `public abstract SELF isNotInstanceOf(java.lang.Class p0)`
- `public abstract SELF isNotInstanceOfAny(java.lang.Class... p0)`
- `public abstract SELF isNotNull()`
- `public abstract SELF isNotOfAnyClassIn(java.lang.Class... p0)`
- `public abstract SELF isNotSameAs(java.lang.Object p0)`
- `public abstract void isNull()`
- `public abstract SELF isOfAnyClassIn(java.lang.Class... p0)`
- `public abstract SELF isSameAs(java.lang.Object p0)`
- `public abstract SELF usingComparator(java.util.Comparator p0)`
- `public abstract SELF usingComparator(java.util.Comparator p0, java.lang.String p1)`
- `public abstract SELF usingDefaultComparator()`
- `public abstract SELF withRepresentation(org.assertj.core.presentation.Representation p0)`
- `public abstract SELF withThreadDumpOnError()`

---

## public abstract interface `org.assertj.core.api.AssertDelegateTarget`

---

## public abstract interface `org.assertj.core.api.AssertFactory`<T extends java.lang.Object, ASSERT extends org.assertj.core.api.Assert<? extends java.lang.Object, ? extends java.lang.Object>>
annotations: @java.lang.FunctionalInterface  

**Methods:**
- `public abstract ASSERT createAssert(T p0)`

---

## public abstract interface `org.assertj.core.api.AssertJProxySetup`

**Methods:**
- `public abstract void setup(org.assertj.core.api.ProxifyMethodChangingTheObjectUnderTest p0, org.assertj.core.api.ErrorCollector p1)`

---

## public abstract interface `org.assertj.core.api.AssertProvider`<A extends java.lang.Object>

**Methods:**
- `public abstract A assertThat()`

---

## public abstract interface `org.assertj.core.api.AssertionErrorCollector`
implements `org.assertj.core.api.AfterAssertionErrorCollected`  

**Methods:**
- `public abstract java.util.List assertionErrorsCollected()`
- `public abstract void collectAssertionError(java.lang.AssertionError p0)`
- `public default java.util.Optional getDelegate()`
- `public default void onAssertionErrorCollected(java.lang.AssertionError p0)`
- `public default void setDelegate(org.assertj.core.api.AssertionErrorCollector p0)`
- `public abstract void succeeded()`
- `public abstract boolean wasSuccess()`

---

## public abstract interface `org.assertj.core.api.AssertionInfo`

**Methods:**
- `public abstract org.assertj.core.description.Description description()`
- `public abstract java.lang.String overridingErrorMessage()`
- `public abstract org.assertj.core.presentation.Representation representation()`

---

## public class `org.assertj.core.api.Assertions`
annotations: @org.assertj.core.util.CheckReturnValue  
implements `org.assertj.core.api.InstanceOfAssertFactories`  

**Constructors:**
- `protected Assertions()`

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.api.Condition allOf(java.lang.Iterable p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.Condition allOf(org.assertj.core.api.Condition... p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.Condition anyOf(java.lang.Iterable p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.Condition anyOf(org.assertj.core.api.Condition... p0)`
- `public static <T extends java.lang.Object, ASSERT extends org.assertj.core.api.AbstractAssert<? extends java.lang.Object, ? extends java.lang.Object>> org.assertj.core.api.InstanceOfAssertFactory as(org.assertj.core.api.InstanceOfAssertFactory p0)`
- `public static <ACTUAL extends java.lang.Iterable<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.ClassBasedNavigableIterableAssert assertThat(ACTUAL p0, java.lang.Class p1)`
- `public static <T extends org.assertj.core.api.AssertDelegateTarget> T assertThat(T p0)`
- `public static <T extends java.lang.Comparable<? super T>> org.assertj.core.api.AbstractComparableAssert assertThat(T p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.ObjectAssert assertThat(T p0)`
- `public static <T extends java.lang.Throwable> org.assertj.core.api.AbstractThrowableAssert assertThat(T p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.ObjectArrayAssert assertThat(T[] p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.Object2DArrayAssert assertThat(T[][] p0)`
- `public static org.assertj.core.api.AbstractBooleanAssert assertThat(boolean p0)`
- `public static org.assertj.core.api.AbstractBooleanArrayAssert assertThat(boolean[] p0)`
- `public static org.assertj.core.api.Boolean2DArrayAssert assertThat(boolean[][] p0)`
- `public static org.assertj.core.api.AbstractByteAssert assertThat(byte p0)`
- `public static org.assertj.core.api.AbstractByteArrayAssert assertThat(byte[] p0)`
- `public static org.assertj.core.api.Byte2DArrayAssert assertThat(byte[][] p0)`
- `public static org.assertj.core.api.AbstractCharacterAssert assertThat(char p0)`
- `public static org.assertj.core.api.AbstractCharArrayAssert assertThat(char[] p0)`
- `public static org.assertj.core.api.Char2DArrayAssert assertThat(char[][] p0)`
- `public static org.assertj.core.api.AbstractDoubleAssert assertThat(double p0)`
- `public static org.assertj.core.api.AbstractDoubleArrayAssert assertThat(double[] p0)`
- `public static org.assertj.core.api.Double2DArrayAssert assertThat(double[][] p0)`
- `public static org.assertj.core.api.AbstractFloatAssert assertThat(float p0)`
- `public static org.assertj.core.api.AbstractFloatArrayAssert assertThat(float[] p0)`
- `public static org.assertj.core.api.Float2DArrayAssert assertThat(float[][] p0)`
- `public static org.assertj.core.api.AbstractIntegerAssert assertThat(int p0)`
- `public static org.assertj.core.api.AbstractIntArrayAssert assertThat(int[] p0)`
- `public static org.assertj.core.api.Int2DArrayAssert assertThat(int[][] p0)`
- `public static org.assertj.core.api.AbstractFileAssert assertThat(java.io.File p0)`
- `public static org.assertj.core.api.AbstractInputStreamAssert assertThat(java.io.InputStream p0)`
- `public static org.assertj.core.api.AbstractBooleanAssert assertThat(java.lang.Boolean p0)`
- `public static org.assertj.core.api.AbstractByteAssert assertThat(java.lang.Byte p0)`
- `public static org.assertj.core.api.AbstractCharSequenceAssert assertThat(java.lang.CharSequence p0)`
- `public static org.assertj.core.api.AbstractCharacterAssert assertThat(java.lang.Character p0)`
- `public static org.assertj.core.api.ClassAssert assertThat(java.lang.Class p0)`
- `public static org.assertj.core.api.AbstractDoubleAssert assertThat(java.lang.Double p0)`
- `public static org.assertj.core.api.AbstractFloatAssert assertThat(java.lang.Float p0)`
- `public static org.assertj.core.api.AbstractIntegerAssert assertThat(java.lang.Integer p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.IterableAssert assertThat(java.lang.Iterable p0)`
- `public static <ACTUAL extends java.lang.Iterable<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.FactoryBasedNavigableIterableAssert assertThat(java.lang.Iterable p0, org.assertj.core.api.AssertFactory p1)`
- `public static org.assertj.core.api.AbstractLongAssert assertThat(java.lang.Long p0)`
- `public static org.assertj.core.api.AbstractShortAssert assertThat(java.lang.Short p0)`
- `public static org.assertj.core.api.AbstractStringAssert assertThat(java.lang.String p0)`
- `public static org.assertj.core.api.AbstractCharSequenceAssert assertThat(java.lang.StringBuffer p0)`
- `public static org.assertj.core.api.AbstractCharSequenceAssert assertThat(java.lang.StringBuilder p0)`
- `public static org.assertj.core.api.AbstractBigDecimalAssert assertThat(java.math.BigDecimal p0)`
- `public static org.assertj.core.api.AbstractBigIntegerAssert assertThat(java.math.BigInteger p0)`
- `public static org.assertj.core.api.AbstractUriAssert assertThat(java.net.URI p0)`
- `public static org.assertj.core.api.AbstractUrlAssert assertThat(java.net.URL p0)`
- `public static org.assertj.core.api.AbstractPathAssert assertThat(java.nio.file.Path p0)`
- `public static org.assertj.core.api.AbstractDurationAssert assertThat(java.time.Duration p0)`
- `public static org.assertj.core.api.AbstractInstantAssert assertThat(java.time.Instant p0)`
- `public static org.assertj.core.api.AbstractLocalDateAssert assertThat(java.time.LocalDate p0)`
- `public static org.assertj.core.api.AbstractLocalDateTimeAssert assertThat(java.time.LocalDateTime p0)`
- `public static org.assertj.core.api.AbstractLocalTimeAssert assertThat(java.time.LocalTime p0)`
- `public static org.assertj.core.api.AbstractOffsetDateTimeAssert assertThat(java.time.OffsetDateTime p0)`
- `public static org.assertj.core.api.AbstractOffsetTimeAssert assertThat(java.time.OffsetTime p0)`
- `public static org.assertj.core.api.AbstractPeriodAssert assertThat(java.time.Period p0)`
- `public static org.assertj.core.api.AbstractZonedDateTimeAssert assertThat(java.time.ZonedDateTime p0)`
- `public static <E extends java.lang.Object> org.assertj.core.api.AbstractCollectionAssert assertThat(java.util.Collection p0)`
- `public static org.assertj.core.api.AbstractDateAssert assertThat(java.util.Date p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.IteratorAssert assertThat(java.util.Iterator p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.ListAssert assertThat(java.util.List p0)`
- `public static <ELEMENT extends java.lang.Object, ACTUAL extends java.util.List<? extends ELEMENT>, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.ClassBasedNavigableListAssert assertThat(java.util.List p0, java.lang.Class p1)`
- `public static <ACTUAL extends java.util.List<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.FactoryBasedNavigableListAssert assertThat(java.util.List p0, org.assertj.core.api.AssertFactory p1)`
- `public static <K extends java.lang.Object, V extends java.lang.Object> org.assertj.core.api.MapAssert assertThat(java.util.Map p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.OptionalAssert assertThat(java.util.Optional p0)`
- `public static org.assertj.core.api.OptionalDoubleAssert assertThat(java.util.OptionalDouble p0)`
- `public static org.assertj.core.api.OptionalIntAssert assertThat(java.util.OptionalInt p0)`
- `public static org.assertj.core.api.OptionalLongAssert assertThat(java.util.OptionalLong p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.SpliteratorAssert assertThat(java.util.Spliterator p0)`
- `public static <RESULT extends java.lang.Object> org.assertj.core.api.CompletableFutureAssert assertThat(java.util.concurrent.CompletableFuture p0)`
- `public static <RESULT extends java.lang.Object> org.assertj.core.api.CompletableFutureAssert assertThat(java.util.concurrent.CompletionStage p0)`
- `public static <RESULT extends java.lang.Object> org.assertj.core.api.FutureAssert assertThat(java.util.concurrent.Future p0)`
- `public static org.assertj.core.api.AtomicBooleanAssert assertThat(java.util.concurrent.atomic.AtomicBoolean p0)`
- `public static org.assertj.core.api.AtomicIntegerAssert assertThat(java.util.concurrent.atomic.AtomicInteger p0)`
- `public static org.assertj.core.api.AtomicIntegerArrayAssert assertThat(java.util.concurrent.atomic.AtomicIntegerArray p0)`
- `public static <OBJECT extends java.lang.Object> org.assertj.core.api.AtomicIntegerFieldUpdaterAssert assertThat(java.util.concurrent.atomic.AtomicIntegerFieldUpdater p0)`
- `public static org.assertj.core.api.AtomicLongAssert assertThat(java.util.concurrent.atomic.AtomicLong p0)`
- `public static org.assertj.core.api.AtomicLongArrayAssert assertThat(java.util.concurrent.atomic.AtomicLongArray p0)`
- `public static <OBJECT extends java.lang.Object> org.assertj.core.api.AtomicLongFieldUpdaterAssert assertThat(java.util.concurrent.atomic.AtomicLongFieldUpdater p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.AtomicMarkableReferenceAssert assertThat(java.util.concurrent.atomic.AtomicMarkableReference p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.AtomicReferenceAssert assertThat(java.util.concurrent.atomic.AtomicReference p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.AtomicReferenceArrayAssert assertThat(java.util.concurrent.atomic.AtomicReferenceArray p0)`
- `public static <FIELD extends java.lang.Object, OBJECT extends java.lang.Object> org.assertj.core.api.AtomicReferenceFieldUpdaterAssert assertThat(java.util.concurrent.atomic.AtomicReferenceFieldUpdater p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.AtomicStampedReferenceAssert assertThat(java.util.concurrent.atomic.AtomicStampedReference p0)`
- `public static org.assertj.core.api.LongAdderAssert assertThat(java.util.concurrent.atomic.LongAdder p0)`
- `public static org.assertj.core.api.DoublePredicateAssert assertThat(java.util.function.DoublePredicate p0)`
- `public static org.assertj.core.api.IntPredicateAssert assertThat(java.util.function.IntPredicate p0)`
- `public static org.assertj.core.api.LongPredicateAssert assertThat(java.util.function.LongPredicate p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.PredicateAssert assertThat(java.util.function.Predicate p0)`
- `public static org.assertj.core.api.MatcherAssert assertThat(java.util.regex.Matcher p0)`
- `public static org.assertj.core.api.ListAssert assertThat(java.util.stream.DoubleStream p0)`
- `public static org.assertj.core.api.ListAssert assertThat(java.util.stream.IntStream p0)`
- `public static org.assertj.core.api.ListAssert assertThat(java.util.stream.LongStream p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.ListAssert assertThat(java.util.stream.Stream p0)`
- `public static org.assertj.core.api.AbstractLongAssert assertThat(long p0)`
- `public static org.assertj.core.api.AbstractLongArrayAssert assertThat(long[] p0)`
- `public static org.assertj.core.api.Long2DArrayAssert assertThat(long[][] p0)`
- `public static <T extends java.lang.Object> T assertThat(org.assertj.core.api.AssertProvider p0)`
- `public static org.assertj.core.api.AbstractShortAssert assertThat(short p0)`
- `public static org.assertj.core.api.AbstractShortArrayAssert assertThat(short[] p0)`
- `public static org.assertj.core.api.Short2DArrayAssert assertThat(short[][] p0)`
- `public static org.assertj.core.api.AbstractThrowableAssert assertThatCode(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static <E extends java.lang.Object> org.assertj.core.api.AbstractCollectionAssert assertThatCollection(java.util.Collection p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.AbstractUniversalComparableAssert assertThatComparable(java.lang.Comparable p0)`
- `public static org.assertj.core.api.ThrowableTypeAssert assertThatException()`
- `public static <T extends java.lang.Throwable> org.assertj.core.api.ThrowableTypeAssert assertThatExceptionOfType(java.lang.Class p0)`
- `public static org.assertj.core.api.ThrowableTypeAssert assertThatIOException()`
- `public static org.assertj.core.api.ThrowableTypeAssert assertThatIllegalArgumentException()`
- `public static org.assertj.core.api.ThrowableTypeAssert assertThatIllegalStateException()`
- `public static org.assertj.core.api.ThrowableTypeAssert assertThatIndexOutOfBoundsException()`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.IterableAssert assertThatIterable(java.lang.Iterable p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.IteratorAssert assertThatIterator(java.util.Iterator p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.ListAssert assertThatList(java.util.List p0)`
- `public static org.assertj.core.api.NotThrownAssert assertThatNoException()`
- `public static org.assertj.core.api.ThrowableTypeAssert assertThatNullPointerException()`
- `public static <T extends java.lang.Object> org.assertj.core.api.ObjectAssert assertThatObject(T p0)`
- `public static org.assertj.core.api.AbstractPathAssert assertThatPath(java.nio.file.Path p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.PredicateAssert assertThatPredicate(java.util.function.Predicate p0)`
- `public static org.assertj.core.api.ThrowableTypeAssert assertThatReflectiveOperationException()`
- `public static org.assertj.core.api.ThrowableTypeAssert assertThatRuntimeException()`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.ListAssert assertThatStream(java.util.stream.Stream p0)`
- `public static org.assertj.core.api.AbstractThrowableAssert assertThatThrownBy(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static org.assertj.core.api.AbstractThrowableAssert assertThatThrownBy(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0, java.lang.String p1, java.lang.Object... p2)`
- `public static <T extends java.lang.Object> org.assertj.core.api.ObjectAssert assertWith(T p0, java.util.function.Consumer... p1)`
- `public static org.assertj.core.data.Index atIndex(int p0)`
- `public static org.assertj.core.data.Offset byLessThan(java.lang.Byte p0)`
- `public static org.assertj.core.data.Offset byLessThan(java.lang.Double p0)`
- `public static org.assertj.core.data.Offset byLessThan(java.lang.Float p0)`
- `public static org.assertj.core.data.Offset byLessThan(java.lang.Integer p0)`
- `public static org.assertj.core.data.Offset byLessThan(java.lang.Long p0)`
- `public static org.assertj.core.data.Offset byLessThan(java.lang.Short p0)`
- `public static org.assertj.core.data.Offset byLessThan(java.math.BigDecimal p0)`
- `public static org.assertj.core.data.Offset byLessThan(java.math.BigInteger p0)`
- `public static org.assertj.core.data.TemporalUnitOffset byLessThan(long p0, java.time.temporal.TemporalUnit p1)`
- `public static java.lang.Exception catchException(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static java.io.IOException catchIOException(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static java.lang.IllegalArgumentException catchIllegalArgumentException(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static java.lang.IllegalStateException catchIllegalStateException(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static java.lang.IndexOutOfBoundsException catchIndexOutOfBoundsException(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static java.lang.NullPointerException catchNullPointerException(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static java.lang.ReflectiveOperationException catchReflectiveOperationException(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static java.lang.RuntimeException catchRuntimeException(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static java.lang.Throwable catchThrowable(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static <THROWABLE extends java.lang.Throwable> THROWABLE catchThrowableOfType(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0, java.lang.Class p1)`
- `public static java.lang.String contentOf(java.io.File p0)`
- `public static java.lang.String contentOf(java.io.File p0, java.lang.String p1)`
- `public static java.lang.String contentOf(java.io.File p0, java.nio.charset.Charset p1)`
- `public static java.lang.String contentOf(java.net.URL p0)`
- `public static java.lang.String contentOf(java.net.URL p0, java.lang.String p1)`
- `public static java.lang.String contentOf(java.net.URL p0, java.nio.charset.Charset p1)`
- `public static <T extends java.lang.Object> org.assertj.core.condition.DoesNotHave doesNotHave(org.assertj.core.api.Condition p0)`
- `public static <K extends java.lang.Object, V extends java.lang.Object> org.assertj.core.data.MapEntry entry(K p0, V p1)`
- `public static org.assertj.core.groups.Properties extractProperty(java.lang.String p0)`
- `public static <T extends java.lang.Object> org.assertj.core.groups.Properties extractProperty(java.lang.String p0, java.lang.Class p1)`
- `public static <T extends java.lang.Object> T fail(java.lang.String p0)`
- `public static <T extends java.lang.Object> T fail(java.lang.String p0, java.lang.Object... p1)`
- `public static <T extends java.lang.Object> T fail(java.lang.String p0, java.lang.Throwable p1)`
- `public static <T extends java.lang.Object> T failBecauseExceptionWasNotThrown(java.lang.Class p0)`
- `public static <E extends java.lang.Object> org.assertj.core.api.filter.Filters filter(E[] p0)`
- `public static <E extends java.lang.Object> org.assertj.core.api.filter.Filters filter(java.lang.Iterable p0)`
- `public static <F extends java.lang.Object, T extends java.lang.Object> java.util.function.Function from(java.util.function.Function p0)`
- `public static org.assertj.core.api.filter.InFilter in(java.lang.Object... p0)`
- `public static java.util.List linesOf(java.io.File p0)`
- `public static java.util.List linesOf(java.io.File p0, java.lang.String p1)`
- `public static java.util.List linesOf(java.io.File p0, java.nio.charset.Charset p1)`
- `public static java.util.List linesOf(java.net.URL p0)`
- `public static java.util.List linesOf(java.net.URL p0, java.lang.String p1)`
- `public static java.util.List linesOf(java.net.URL p0, java.nio.charset.Charset p1)`
- `public static java.util.List linesOf(java.nio.file.Path p0)`
- `public static java.util.List linesOf(java.nio.file.Path p0, java.lang.String p1)`
- `public static java.util.List linesOf(java.nio.file.Path p0, java.nio.charset.Charset p1)`
- `public static org.assertj.core.api.filter.NotFilter not(java.lang.Object p0)`
- `public static <T extends java.lang.Object> org.assertj.core.condition.Not not(org.assertj.core.api.Condition p0)`
- `public static org.assertj.core.api.filter.NotInFilter notIn(java.lang.Object... p0)`
- `public static org.assertj.core.data.Offset offset(java.lang.Double p0)`
- `public static org.assertj.core.data.Offset offset(java.lang.Float p0)`
- `public static void registerCustomDateFormat(java.lang.String p0)`
- `public static void registerCustomDateFormat(java.text.DateFormat p0)`
- `public static <T extends java.lang.Object> void registerFormatterForType(java.lang.Class p0, java.util.function.Function p1)`
- `public static void setAllowComparingPrivateFields(boolean p0)`
- `public static void setAllowExtractingPrivateFields(boolean p0)`
- `public static void setDescriptionConsumer(java.util.function.Consumer p0)`
- `public static void setExtractBareNamePropertyMethods(boolean p0)`
- `public static void setLenientDateParsing(boolean p0)`
- `public static void setMaxElementsForPrinting(int p0)`
- `public static void setMaxLengthForSingleLineDescription(int p0)`
- `public static void setMaxStackTraceElementsDisplayed(int p0)`
- `public static void setPrintAssertionsDescription(boolean p0)`
- `public static void setRemoveAssertJRelatedElementsFromStackTrace(boolean p0)`
- `public static <T extends java.lang.Object> T shouldHaveThrown(java.lang.Class p0)`
- `public static org.assertj.core.groups.Tuple tuple(java.lang.Object... p0)`
- `public static void useDefaultDateFormatsOnly()`
- `public static void useDefaultRepresentation()`
- `public static void useRepresentation(org.assertj.core.presentation.Representation p0)`
- `public static java.time.Duration withMarginOf(java.time.Duration p0)`
- `public static org.assertj.core.data.Offset withPrecision(java.lang.Double p0)`
- `public static org.assertj.core.data.Offset withPrecision(java.lang.Float p0)`
- `public static org.assertj.core.data.Offset within(java.lang.Byte p0)`
- `public static org.assertj.core.data.Offset within(java.lang.Double p0)`
- `public static org.assertj.core.data.Offset within(java.lang.Float p0)`
- `public static org.assertj.core.data.Offset within(java.lang.Integer p0)`
- `public static org.assertj.core.data.Offset within(java.lang.Long p0)`
- `public static org.assertj.core.data.Offset within(java.lang.Short p0)`
- `public static org.assertj.core.data.Offset within(java.math.BigDecimal p0)`
- `public static org.assertj.core.data.Offset within(java.math.BigInteger p0)`
- `public static org.assertj.core.data.TemporalUnitOffset within(long p0, java.time.temporal.TemporalUnit p1)`
- `public static org.assertj.core.data.Percentage withinPercentage(java.lang.Double p0)`
- `public static org.assertj.core.data.Percentage withinPercentage(java.lang.Integer p0)`
- `public static org.assertj.core.data.Percentage withinPercentage(java.lang.Long p0)`

---

## public class `org.assertj.core.api.AssertionsForClassTypes`
annotations: @org.assertj.core.util.CheckReturnValue  

**Constructors:**
- `protected AssertionsForClassTypes()`

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.api.Condition allOf(java.lang.Iterable p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.Condition allOf(org.assertj.core.api.Condition... p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.Condition anyOf(java.lang.Iterable p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.Condition anyOf(org.assertj.core.api.Condition... p0)`
- `public static <T extends java.lang.Throwable> org.assertj.core.api.AbstractThrowableAssert assertThat(T p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.ObjectAssert assertThat(T p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.ObjectArrayAssert assertThat(T[] p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.Object2DArrayAssert assertThat(T[][] p0)`
- `public static org.assertj.core.api.AbstractBooleanAssert assertThat(boolean p0)`
- `public static org.assertj.core.api.AbstractBooleanArrayAssert assertThat(boolean[] p0)`
- `public static org.assertj.core.api.Boolean2DArrayAssert assertThat(boolean[][] p0)`
- `public static org.assertj.core.api.AbstractByteAssert assertThat(byte p0)`
- `public static org.assertj.core.api.AbstractByteArrayAssert assertThat(byte[] p0)`
- `public static org.assertj.core.api.Byte2DArrayAssert assertThat(byte[][] p0)`
- `public static org.assertj.core.api.AbstractCharacterAssert assertThat(char p0)`
- `public static org.assertj.core.api.AbstractCharArrayAssert assertThat(char[] p0)`
- `public static org.assertj.core.api.Char2DArrayAssert assertThat(char[][] p0)`
- `public static org.assertj.core.api.AbstractDoubleAssert assertThat(double p0)`
- `public static org.assertj.core.api.AbstractDoubleArrayAssert assertThat(double[] p0)`
- `public static org.assertj.core.api.Double2DArrayAssert assertThat(double[][] p0)`
- `public static org.assertj.core.api.AbstractFloatAssert assertThat(float p0)`
- `public static org.assertj.core.api.AbstractFloatArrayAssert assertThat(float[] p0)`
- `public static org.assertj.core.api.Float2DArrayAssert assertThat(float[][] p0)`
- `public static org.assertj.core.api.AbstractIntegerAssert assertThat(int p0)`
- `public static org.assertj.core.api.AbstractIntArrayAssert assertThat(int[] p0)`
- `public static org.assertj.core.api.Int2DArrayAssert assertThat(int[][] p0)`
- `public static org.assertj.core.api.AbstractFileAssert assertThat(java.io.File p0)`
- `public static org.assertj.core.api.AbstractInputStreamAssert assertThat(java.io.InputStream p0)`
- `public static org.assertj.core.api.AbstractBooleanAssert assertThat(java.lang.Boolean p0)`
- `public static org.assertj.core.api.AbstractByteAssert assertThat(java.lang.Byte p0)`
- `public static org.assertj.core.api.AbstractCharacterAssert assertThat(java.lang.Character p0)`
- `public static org.assertj.core.api.ClassAssert assertThat(java.lang.Class p0)`
- `public static org.assertj.core.api.AbstractDoubleAssert assertThat(java.lang.Double p0)`
- `public static org.assertj.core.api.AbstractFloatAssert assertThat(java.lang.Float p0)`
- `public static org.assertj.core.api.AbstractIntegerAssert assertThat(java.lang.Integer p0)`
- `public static org.assertj.core.api.AbstractLongAssert assertThat(java.lang.Long p0)`
- `public static org.assertj.core.api.AbstractShortAssert assertThat(java.lang.Short p0)`
- `public static org.assertj.core.api.AbstractStringAssert assertThat(java.lang.String p0)`
- `public static org.assertj.core.api.AbstractCharSequenceAssert assertThat(java.lang.StringBuffer p0)`
- `public static org.assertj.core.api.AbstractCharSequenceAssert assertThat(java.lang.StringBuilder p0)`
- `public static org.assertj.core.api.AbstractBigDecimalAssert assertThat(java.math.BigDecimal p0)`
- `public static org.assertj.core.api.AbstractUriAssert assertThat(java.net.URI p0)`
- `public static org.assertj.core.api.AbstractUrlAssert assertThat(java.net.URL p0)`
- `public static org.assertj.core.api.AbstractDurationAssert assertThat(java.time.Duration p0)`
- `public static org.assertj.core.api.AbstractInstantAssert assertThat(java.time.Instant p0)`
- `public static org.assertj.core.api.AbstractLocalDateAssert assertThat(java.time.LocalDate p0)`
- `public static org.assertj.core.api.AbstractLocalDateTimeAssert assertThat(java.time.LocalDateTime p0)`
- `public static org.assertj.core.api.AbstractLocalTimeAssert assertThat(java.time.LocalTime p0)`
- `public static org.assertj.core.api.AbstractOffsetDateTimeAssert assertThat(java.time.OffsetDateTime p0)`
- `public static org.assertj.core.api.AbstractOffsetTimeAssert assertThat(java.time.OffsetTime p0)`
- `public static org.assertj.core.api.AbstractPeriodAssert assertThat(java.time.Period p0)`
- `public static org.assertj.core.api.AbstractZonedDateTimeAssert assertThat(java.time.ZonedDateTime p0)`
- `public static org.assertj.core.api.AbstractDateAssert assertThat(java.util.Date p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.OptionalAssert assertThat(java.util.Optional p0)`
- `public static org.assertj.core.api.OptionalDoubleAssert assertThat(java.util.OptionalDouble p0)`
- `public static org.assertj.core.api.OptionalIntAssert assertThat(java.util.OptionalInt p0)`
- `public static org.assertj.core.api.OptionalLongAssert assertThat(java.util.OptionalLong p0)`
- `public static <RESULT extends java.lang.Object> org.assertj.core.api.CompletableFutureAssert assertThat(java.util.concurrent.CompletableFuture p0)`
- `public static org.assertj.core.api.MatcherAssert assertThat(java.util.regex.Matcher p0)`
- `public static org.assertj.core.api.AbstractLongAssert assertThat(long p0)`
- `public static org.assertj.core.api.AbstractLongArrayAssert assertThat(long[] p0)`
- `public static org.assertj.core.api.Long2DArrayAssert assertThat(long[][] p0)`
- `public static org.assertj.core.api.AbstractShortAssert assertThat(short p0)`
- `public static org.assertj.core.api.AbstractShortArrayAssert assertThat(short[] p0)`
- `public static org.assertj.core.api.Short2DArrayAssert assertThat(short[][] p0)`
- `public static org.assertj.core.api.AbstractThrowableAssert assertThatCode(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static <T extends java.lang.Throwable> org.assertj.core.api.ThrowableTypeAssert assertThatExceptionOfType(java.lang.Class p0)`
- `public static org.assertj.core.api.NotThrownAssert assertThatNoException()`
- `public static org.assertj.core.api.AbstractThrowableAssert assertThatThrownBy(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static org.assertj.core.api.AbstractThrowableAssert assertThatThrownBy(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0, java.lang.String p1, java.lang.Object... p2)`
- `public static org.assertj.core.data.Index atIndex(int p0)`
- `public static java.lang.Throwable catchThrowable(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static <THROWABLE extends java.lang.Throwable> THROWABLE catchThrowableOfType(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0, java.lang.Class p1)`
- `public static java.lang.String contentOf(java.io.File p0)`
- `public static java.lang.String contentOf(java.io.File p0, java.lang.String p1)`
- `public static java.lang.String contentOf(java.io.File p0, java.nio.charset.Charset p1)`
- `public static java.lang.String contentOf(java.net.URL p0)`
- `public static java.lang.String contentOf(java.net.URL p0, java.lang.String p1)`
- `public static java.lang.String contentOf(java.net.URL p0, java.nio.charset.Charset p1)`
- `public static <T extends java.lang.Object> org.assertj.core.condition.DoesNotHave doesNotHave(org.assertj.core.api.Condition p0)`
- `public static <K extends java.lang.Object, V extends java.lang.Object> org.assertj.core.data.MapEntry entry(K p0, V p1)`
- `public static org.assertj.core.groups.Properties extractProperty(java.lang.String p0)`
- `public static <T extends java.lang.Object> org.assertj.core.groups.Properties extractProperty(java.lang.String p0, java.lang.Class p1)`
- `public static void fail(java.lang.String p0)`
- `public static void fail(java.lang.String p0, java.lang.Throwable p1)`
- `public static void failBecauseExceptionWasNotThrown(java.lang.Class p0)`
- `public static <E extends java.lang.Object> org.assertj.core.api.filter.Filters filter(E[] p0)`
- `public static <E extends java.lang.Object> org.assertj.core.api.filter.Filters filter(java.lang.Iterable p0)`
- `public static org.assertj.core.api.filter.InFilter in(java.lang.Object... p0)`
- `public static java.util.List linesOf(java.io.File p0)`
- `public static java.util.List linesOf(java.io.File p0, java.lang.String p1)`
- `public static java.util.List linesOf(java.io.File p0, java.nio.charset.Charset p1)`
- `public static java.util.List linesOf(java.net.URL p0)`
- `public static java.util.List linesOf(java.net.URL p0, java.lang.String p1)`
- `public static java.util.List linesOf(java.net.URL p0, java.nio.charset.Charset p1)`
- `public static java.util.List linesOf(java.nio.file.Path p0)`
- `public static java.util.List linesOf(java.nio.file.Path p0, java.lang.String p1)`
- `public static java.util.List linesOf(java.nio.file.Path p0, java.nio.charset.Charset p1)`
- `public static org.assertj.core.api.filter.NotFilter not(java.lang.Object p0)`
- `public static <T extends java.lang.Object> org.assertj.core.condition.Not not(org.assertj.core.api.Condition p0)`
- `public static org.assertj.core.api.filter.NotInFilter notIn(java.lang.Object... p0)`
- `public static org.assertj.core.data.Offset offset(java.lang.Double p0)`
- `public static org.assertj.core.data.Offset offset(java.lang.Float p0)`
- `public static void registerCustomDateFormat(java.lang.String p0)`
- `public static void registerCustomDateFormat(java.text.DateFormat p0)`
- `public static void setAllowComparingPrivateFields(boolean p0)`
- `public static void setAllowExtractingPrivateFields(boolean p0)`
- `public static void setLenientDateParsing(boolean p0)`
- `public static void setMaxLengthForSingleLineDescription(int p0)`
- `public static void setRemoveAssertJRelatedElementsFromStackTrace(boolean p0)`
- `public static void shouldHaveThrown(java.lang.Class p0)`
- `public static org.assertj.core.groups.Tuple tuple(java.lang.Object... p0)`
- `public static void useDefaultDateFormatsOnly()`
- `public static org.assertj.core.data.Offset within(java.lang.Byte p0)`
- `public static org.assertj.core.data.Offset within(java.lang.Double p0)`
- `public static org.assertj.core.data.Offset within(java.lang.Float p0)`
- `public static org.assertj.core.data.Offset within(java.lang.Integer p0)`
- `public static org.assertj.core.data.Offset within(java.lang.Long p0)`
- `public static org.assertj.core.data.Offset within(java.lang.Short p0)`
- `public static org.assertj.core.data.Offset within(java.math.BigDecimal p0)`
- `public static org.assertj.core.data.Percentage withinPercentage(java.lang.Double p0)`
- `public static org.assertj.core.data.Percentage withinPercentage(java.lang.Integer p0)`
- `public static org.assertj.core.data.Percentage withinPercentage(java.lang.Long p0)`

---

## public class `org.assertj.core.api.AssertionsForInterfaceTypes`
annotations: @org.assertj.core.util.CheckReturnValue  
extends `org.assertj.core.api.AssertionsForClassTypes`  

**Constructors:**
- `protected AssertionsForInterfaceTypes()`

**Methods:**
- `public static <ACTUAL extends java.lang.Iterable<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.ClassBasedNavigableIterableAssert assertThat(ACTUAL p0, java.lang.Class p1)`
- `public static <T extends org.assertj.core.api.AssertDelegateTarget> T assertThat(T p0)`
- `public static <T extends java.lang.Comparable<? super T>> org.assertj.core.api.AbstractComparableAssert assertThat(T p0)`
- `public static org.assertj.core.api.AbstractCharSequenceAssert assertThat(java.lang.CharSequence p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.IterableAssert assertThat(java.lang.Iterable p0)`
- `public static <ACTUAL extends java.lang.Iterable<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.FactoryBasedNavigableIterableAssert assertThat(java.lang.Iterable p0, org.assertj.core.api.AssertFactory p1)`
- `public static org.assertj.core.api.AbstractPathAssert assertThat(java.nio.file.Path p0)`
- `public static <E extends java.lang.Object> org.assertj.core.api.AbstractCollectionAssert assertThat(java.util.Collection p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.IteratorAssert assertThat(java.util.Iterator p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.ListAssert assertThat(java.util.List p0)`
- `public static <ELEMENT extends java.lang.Object, ACTUAL extends java.util.List<? extends ELEMENT>, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.ClassBasedNavigableListAssert assertThat(java.util.List p0, java.lang.Class p1)`
- `public static <ACTUAL extends java.util.List<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.FactoryBasedNavigableListAssert assertThat(java.util.List p0, org.assertj.core.api.AssertFactory p1)`
- `public static <K extends java.lang.Object, V extends java.lang.Object> org.assertj.core.api.MapAssert assertThat(java.util.Map p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.SpliteratorAssert assertThat(java.util.Spliterator p0)`
- `public static <RESULT extends java.lang.Object> org.assertj.core.api.CompletableFutureAssert assertThat(java.util.concurrent.CompletionStage p0)`
- `public static org.assertj.core.api.DoublePredicateAssert assertThat(java.util.function.DoublePredicate p0)`
- `public static org.assertj.core.api.IntPredicateAssert assertThat(java.util.function.IntPredicate p0)`
- `public static org.assertj.core.api.LongPredicateAssert assertThat(java.util.function.LongPredicate p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.PredicateAssert assertThat(java.util.function.Predicate p0)`
- `public static org.assertj.core.api.ListAssert assertThat(java.util.stream.DoubleStream p0)`
- `public static org.assertj.core.api.ListAssert assertThat(java.util.stream.IntStream p0)`
- `public static org.assertj.core.api.ListAssert assertThat(java.util.stream.LongStream p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.ListAssert assertThat(java.util.stream.Stream p0)`
- `public static <T extends java.lang.Object> T assertThat(org.assertj.core.api.AssertProvider p0)`
- `public static <E extends java.lang.Object> org.assertj.core.api.AbstractCollectionAssert assertThatCollection(java.util.Collection p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.AbstractUniversalComparableAssert assertThatComparable(java.lang.Comparable p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.IterableAssert assertThatIterable(java.lang.Iterable p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.IteratorAssert assertThatIterator(java.util.Iterator p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.ListAssert assertThatList(java.util.List p0)`
- `public static org.assertj.core.api.AbstractPathAssert assertThatPath(java.nio.file.Path p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.PredicateAssert assertThatPredicate(java.util.function.Predicate p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.ListAssert assertThatStream(java.util.stream.Stream p0)`

---

## public class `org.assertj.core.api.AssumptionExceptionFactory`

**Constructors:**
- `public AssumptionExceptionFactory()`

**Methods:**
- `public static org.assertj.core.configuration.PreferredAssumptionException getPreferredAssumptionException()`

---

## public class `org.assertj.core.api.Assumptions`
annotations: @org.assertj.core.util.CheckReturnValue  

**Constructors:**
- `public Assumptions()`

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.api.ObjectAssert assumeThat(T p0)`
- `public static <T extends java.lang.Throwable> org.assertj.core.api.AbstractThrowableAssert assumeThat(T p0)`
- `public static <T extends java.lang.Comparable<? super T>> org.assertj.core.api.AbstractComparableAssert assumeThat(T p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.ObjectArrayAssert assumeThat(T[] p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.Object2DArrayAssert assumeThat(T[][] p0)`
- `public static org.assertj.core.api.AbstractBooleanAssert assumeThat(boolean p0)`
- `public static org.assertj.core.api.AbstractBooleanArrayAssert assumeThat(boolean[] p0)`
- `public static org.assertj.core.api.Boolean2DArrayAssert assumeThat(boolean[][] p0)`
- `public static org.assertj.core.api.AbstractByteAssert assumeThat(byte p0)`
- `public static org.assertj.core.api.AbstractByteArrayAssert assumeThat(byte[] p0)`
- `public static org.assertj.core.api.Byte2DArrayAssert assumeThat(byte[][] p0)`
- `public static org.assertj.core.api.AbstractCharacterAssert assumeThat(char p0)`
- `public static org.assertj.core.api.AbstractCharArrayAssert assumeThat(char[] p0)`
- `public static org.assertj.core.api.Char2DArrayAssert assumeThat(char[][] p0)`
- `public static org.assertj.core.api.AbstractDoubleAssert assumeThat(double p0)`
- `public static org.assertj.core.api.AbstractDoubleArrayAssert assumeThat(double[] p0)`
- `public static org.assertj.core.api.Double2DArrayAssert assumeThat(double[][] p0)`
- `public static org.assertj.core.api.AbstractFloatAssert assumeThat(float p0)`
- `public static org.assertj.core.api.AbstractFloatArrayAssert assumeThat(float[] p0)`
- `public static org.assertj.core.api.Float2DArrayAssert assumeThat(float[][] p0)`
- `public static org.assertj.core.api.AbstractIntegerAssert assumeThat(int p0)`
- `public static org.assertj.core.api.AbstractIntArrayAssert assumeThat(int[] p0)`
- `public static org.assertj.core.api.Int2DArrayAssert assumeThat(int[][] p0)`
- `public static org.assertj.core.api.AbstractFileAssert assumeThat(java.io.File p0)`
- `public static org.assertj.core.api.AbstractInputStreamAssert assumeThat(java.io.InputStream p0)`
- `public static org.assertj.core.api.AbstractBooleanAssert assumeThat(java.lang.Boolean p0)`
- `public static org.assertj.core.api.AbstractByteAssert assumeThat(java.lang.Byte p0)`
- `public static org.assertj.core.api.AbstractCharSequenceAssert assumeThat(java.lang.CharSequence p0)`
- `public static org.assertj.core.api.AbstractCharacterAssert assumeThat(java.lang.Character p0)`
- `public static org.assertj.core.api.ClassAssert assumeThat(java.lang.Class p0)`
- `public static org.assertj.core.api.AbstractDoubleAssert assumeThat(java.lang.Double p0)`
- `public static org.assertj.core.api.AbstractFloatAssert assumeThat(java.lang.Float p0)`
- `public static org.assertj.core.api.AbstractIntegerAssert assumeThat(java.lang.Integer p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.IterableAssert assumeThat(java.lang.Iterable p0)`
- `public static org.assertj.core.api.AbstractLongAssert assumeThat(java.lang.Long p0)`
- `public static org.assertj.core.api.AbstractShortAssert assumeThat(java.lang.Short p0)`
- `public static org.assertj.core.api.AbstractStringAssert assumeThat(java.lang.String p0)`
- `public static org.assertj.core.api.AbstractCharSequenceAssert assumeThat(java.lang.StringBuffer p0)`
- `public static org.assertj.core.api.AbstractCharSequenceAssert assumeThat(java.lang.StringBuilder p0)`
- `public static org.assertj.core.api.AbstractBigDecimalAssert assumeThat(java.math.BigDecimal p0)`
- `public static org.assertj.core.api.AbstractBigIntegerAssert assumeThat(java.math.BigInteger p0)`
- `public static org.assertj.core.api.AbstractUriAssert assumeThat(java.net.URI p0)`
- `public static org.assertj.core.api.AbstractUrlAssert assumeThat(java.net.URL p0)`
- `public static org.assertj.core.api.AbstractPathAssert assumeThat(java.nio.file.Path p0)`
- `public static org.assertj.core.api.AbstractDurationAssert assumeThat(java.time.Duration p0)`
- `public static org.assertj.core.api.AbstractInstantAssert assumeThat(java.time.Instant p0)`
- `public static org.assertj.core.api.AbstractLocalDateAssert assumeThat(java.time.LocalDate p0)`
- `public static org.assertj.core.api.AbstractLocalDateTimeAssert assumeThat(java.time.LocalDateTime p0)`
- `public static org.assertj.core.api.AbstractLocalTimeAssert assumeThat(java.time.LocalTime p0)`
- `public static org.assertj.core.api.AbstractOffsetDateTimeAssert assumeThat(java.time.OffsetDateTime p0)`
- `public static org.assertj.core.api.AbstractOffsetTimeAssert assumeThat(java.time.OffsetTime p0)`
- `public static org.assertj.core.api.AbstractPeriodAssert assumeThat(java.time.Period p0)`
- `public static org.assertj.core.api.AbstractZonedDateTimeAssert assumeThat(java.time.ZonedDateTime p0)`
- `public static <E extends java.lang.Object> org.assertj.core.api.AbstractCollectionAssert assumeThat(java.util.Collection p0)`
- `public static org.assertj.core.api.AbstractDateAssert assumeThat(java.util.Date p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.IteratorAssert assumeThat(java.util.Iterator p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.FactoryBasedNavigableListAssert assumeThat(java.util.List p0)`
- `public static <K extends java.lang.Object, V extends java.lang.Object> org.assertj.core.api.MapAssert assumeThat(java.util.Map p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.OptionalAssert assumeThat(java.util.Optional p0)`
- `public static org.assertj.core.api.OptionalDoubleAssert assumeThat(java.util.OptionalDouble p0)`
- `public static org.assertj.core.api.OptionalIntAssert assumeThat(java.util.OptionalInt p0)`
- `public static org.assertj.core.api.OptionalLongAssert assumeThat(java.util.OptionalLong p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.AbstractSpliteratorAssert assumeThat(java.util.Spliterator p0)`
- `public static <RESULT extends java.lang.Object> org.assertj.core.api.CompletableFutureAssert assumeThat(java.util.concurrent.CompletableFuture p0)`
- `public static <RESULT extends java.lang.Object> org.assertj.core.api.CompletableFutureAssert assumeThat(java.util.concurrent.CompletionStage p0)`
- `public static <RESULT extends java.lang.Object> org.assertj.core.api.AbstractFutureAssert assumeThat(java.util.concurrent.Future p0)`
- `public static org.assertj.core.api.AtomicBooleanAssert assumeThat(java.util.concurrent.atomic.AtomicBoolean p0)`
- `public static org.assertj.core.api.AtomicIntegerAssert assumeThat(java.util.concurrent.atomic.AtomicInteger p0)`
- `public static org.assertj.core.api.AtomicIntegerArrayAssert assumeThat(java.util.concurrent.atomic.AtomicIntegerArray p0)`
- `public static <OBJECT extends java.lang.Object> org.assertj.core.api.AtomicIntegerFieldUpdaterAssert assumeThat(java.util.concurrent.atomic.AtomicIntegerFieldUpdater p0)`
- `public static org.assertj.core.api.AtomicLongAssert assumeThat(java.util.concurrent.atomic.AtomicLong p0)`
- `public static org.assertj.core.api.AtomicLongArrayAssert assumeThat(java.util.concurrent.atomic.AtomicLongArray p0)`
- `public static <OBJECT extends java.lang.Object> org.assertj.core.api.AtomicLongFieldUpdaterAssert assumeThat(java.util.concurrent.atomic.AtomicLongFieldUpdater p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.AtomicMarkableReferenceAssert assumeThat(java.util.concurrent.atomic.AtomicMarkableReference p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.AtomicReferenceAssert assumeThat(java.util.concurrent.atomic.AtomicReference p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.AtomicReferenceArrayAssert assumeThat(java.util.concurrent.atomic.AtomicReferenceArray p0)`
- `public static <FIELD extends java.lang.Object, OBJECT extends java.lang.Object> org.assertj.core.api.AtomicReferenceFieldUpdaterAssert assumeThat(java.util.concurrent.atomic.AtomicReferenceFieldUpdater p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.AtomicStampedReferenceAssert assumeThat(java.util.concurrent.atomic.AtomicStampedReference p0)`
- `public static org.assertj.core.api.LongAdderAssert assumeThat(java.util.concurrent.atomic.LongAdder p0)`
- `public static org.assertj.core.api.DoublePredicateAssert assumeThat(java.util.function.DoublePredicate p0)`
- `public static org.assertj.core.api.IntPredicateAssert assumeThat(java.util.function.IntPredicate p0)`
- `public static org.assertj.core.api.LongPredicateAssert assumeThat(java.util.function.LongPredicate p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.PredicateAssert assumeThat(java.util.function.Predicate p0)`
- `public static org.assertj.core.api.MatcherAssert assumeThat(java.util.regex.Matcher p0)`
- `public static org.assertj.core.api.AbstractListAssert assumeThat(java.util.stream.DoubleStream p0)`
- `public static org.assertj.core.api.AbstractListAssert assumeThat(java.util.stream.IntStream p0)`
- `public static org.assertj.core.api.AbstractListAssert assumeThat(java.util.stream.LongStream p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.AbstractListAssert assumeThat(java.util.stream.Stream p0)`
- `public static org.assertj.core.api.AbstractLongAssert assumeThat(long p0)`
- `public static org.assertj.core.api.AbstractLongArrayAssert assumeThat(long[] p0)`
- `public static org.assertj.core.api.Long2DArrayAssert assumeThat(long[][] p0)`
- `public static org.assertj.core.api.AbstractShortAssert assumeThat(short p0)`
- `public static org.assertj.core.api.AbstractShortArrayAssert assumeThat(short[] p0)`
- `public static org.assertj.core.api.Short2DArrayAssert assumeThat(short[][] p0)`
- `public static org.assertj.core.api.AbstractThrowableAssert assumeThatCode(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static <E extends java.lang.Object> org.assertj.core.api.AbstractCollectionAssert assumeThatCollection(java.util.Collection p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.AbstractUniversalComparableAssert assumeThatComparable(java.lang.Comparable p0)`
- `public static org.assertj.core.api.ThrowableTypeAssert assumeThatException()`
- `public static <T extends java.lang.Throwable> org.assertj.core.api.ThrowableTypeAssert assumeThatExceptionOfType(java.lang.Class p0)`
- `public static org.assertj.core.api.ThrowableTypeAssert assumeThatIOException()`
- `public static org.assertj.core.api.ThrowableTypeAssert assumeThatIllegalArgumentException()`
- `public static org.assertj.core.api.ThrowableTypeAssert assumeThatIndexOutOfBoundsException()`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.IterableAssert assumeThatIterable(java.lang.Iterable p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.IteratorAssert assumeThatIterator(java.util.Iterator p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.FactoryBasedNavigableListAssert assumeThatList(java.util.List p0)`
- `public static org.assertj.core.api.ThrowableTypeAssert assumeThatNullPointerException()`
- `public static <T extends java.lang.Object> org.assertj.core.api.ObjectAssert assumeThatObject(T p0)`
- `public static org.assertj.core.api.AbstractPathAssert assumeThatPath(java.nio.file.Path p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.PredicateAssert assumeThatPredicate(java.util.function.Predicate p0)`
- `public static org.assertj.core.api.ThrowableTypeAssert assumeThatReflectiveOperationException()`
- `public static org.assertj.core.api.ThrowableTypeAssert assumeThatRuntimeException()`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.AbstractListAssert assumeThatStream(java.util.stream.Stream p0)`
- `public static org.assertj.core.api.AbstractThrowableAssert assumeThatThrownBy(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `protected static <ASSERTION extends java.lang.Object> java.lang.Class generateAssumptionClass(java.lang.Class p0)`
- `public static void setPreferredAssumptionException(org.assertj.core.configuration.PreferredAssumptionException p0)`

---

## public class `org.assertj.core.api.AtomicBooleanAssert`
extends `org.assertj.core.api.AbstractAssert`  

**Constructors:**
- `public AtomicBooleanAssert(java.util.concurrent.atomic.AtomicBoolean p0)`

**Methods:**
- `public org.assertj.core.api.AtomicBooleanAssert isFalse()`
- `public org.assertj.core.api.AtomicBooleanAssert isTrue()`
- `public org.assertj.core.api.AtomicBooleanAssert usingComparator(java.util.Comparator p0)`
- `public org.assertj.core.api.AtomicBooleanAssert usingComparator(java.util.Comparator p0, java.lang.String p1)`

---

## public class `org.assertj.core.api.AtomicIntegerArrayAssert`
extends `org.assertj.core.api.AbstractEnumerableAssert`  

**Constructors:**
- `public AtomicIntegerArrayAssert(java.util.concurrent.atomic.AtomicIntegerArray p0)`

**Fields:**
- `protected org.assertj.core.internal.IntArrays arrays`

**Methods:**
- `public org.assertj.core.api.AtomicIntegerArrayAssert contains(int p0, org.assertj.core.data.Index p1)`
- `public org.assertj.core.api.AtomicIntegerArrayAssert contains(int... p0)`
- `public org.assertj.core.api.AtomicIntegerArrayAssert containsAnyOf(int... p0)`
- `public org.assertj.core.api.AtomicIntegerArrayAssert containsExactly(int... p0)`
- `public org.assertj.core.api.AtomicIntegerArrayAssert containsExactlyInAnyOrder(int... p0)`
- `public org.assertj.core.api.AtomicIntegerArrayAssert containsOnly(int... p0)`
- `public org.assertj.core.api.AtomicIntegerArrayAssert containsOnlyOnce(int... p0)`
- `public org.assertj.core.api.AtomicIntegerArrayAssert containsSequence(int... p0)`
- `public org.assertj.core.api.AtomicIntegerArrayAssert containsSubsequence(int... p0)`
- `public org.assertj.core.api.AtomicIntegerArrayAssert doesNotContain(int p0, org.assertj.core.data.Index p1)`
- `public org.assertj.core.api.AtomicIntegerArrayAssert doesNotContain(int... p0)`
- `public org.assertj.core.api.AtomicIntegerArrayAssert doesNotHaveDuplicates()`
- `public org.assertj.core.api.AtomicIntegerArrayAssert endsWith(int... p0)`
- `public org.assertj.core.api.AtomicIntegerArrayAssert hasArray(int[] p0)`
- `public org.assertj.core.api.AtomicIntegerArrayAssert hasSameSizeAs(java.lang.Iterable p0)`
- `public org.assertj.core.api.AtomicIntegerArrayAssert hasSize(int p0)`
- `public org.assertj.core.api.AtomicIntegerArrayAssert hasSizeBetween(int p0, int p1)`
- `public org.assertj.core.api.AtomicIntegerArrayAssert hasSizeGreaterThan(int p0)`
- `public org.assertj.core.api.AtomicIntegerArrayAssert hasSizeGreaterThanOrEqualTo(int p0)`
- `public org.assertj.core.api.AtomicIntegerArrayAssert hasSizeLessThan(int p0)`
- `public org.assertj.core.api.AtomicIntegerArrayAssert hasSizeLessThanOrEqualTo(int p0)`
- `public void isEmpty()`
- `public org.assertj.core.api.AtomicIntegerArrayAssert isNotEmpty()`
- `public void isNullOrEmpty()`
- `public org.assertj.core.api.AtomicIntegerArrayAssert isSorted()`
- `public org.assertj.core.api.AtomicIntegerArrayAssert isSortedAccordingTo(java.util.Comparator p0)`
- `public org.assertj.core.api.AtomicIntegerArrayAssert startsWith(int... p0)`
- `public org.assertj.core.api.AtomicIntegerArrayAssert usingDefaultElementComparator()`
- `public org.assertj.core.api.AtomicIntegerArrayAssert usingElementComparator(java.util.Comparator p0)`

---

## public class `org.assertj.core.api.AtomicIntegerAssert`
extends `org.assertj.core.api.AbstractAssert`  

**Constructors:**
- `public AtomicIntegerAssert(java.util.concurrent.atomic.AtomicInteger p0)`

**Methods:**
- `public org.assertj.core.api.AtomicIntegerAssert doesNotHaveValue(int p0)`
- `public org.assertj.core.api.AtomicIntegerAssert hasNegativeValue()`
- `public org.assertj.core.api.AtomicIntegerAssert hasNonNegativeValue()`
- `public org.assertj.core.api.AtomicIntegerAssert hasNonPositiveValue()`
- `public org.assertj.core.api.AtomicIntegerAssert hasPositiveValue()`
- `public org.assertj.core.api.AtomicIntegerAssert hasValue(int p0)`
- `public org.assertj.core.api.AtomicIntegerAssert hasValueBetween(int p0, int p1)`
- `public org.assertj.core.api.AtomicIntegerAssert hasValueCloseTo(int p0, org.assertj.core.data.Offset p1)`
- `public org.assertj.core.api.AtomicIntegerAssert hasValueCloseTo(int p0, org.assertj.core.data.Percentage p1)`
- `public org.assertj.core.api.AtomicIntegerAssert hasValueGreaterThan(int p0)`
- `public org.assertj.core.api.AtomicIntegerAssert hasValueGreaterThanOrEqualTo(int p0)`
- `public org.assertj.core.api.AtomicIntegerAssert hasValueLessThan(int p0)`
- `public org.assertj.core.api.AtomicIntegerAssert hasValueLessThanOrEqualTo(int p0)`
- `public org.assertj.core.api.AtomicIntegerAssert usingComparator(java.util.Comparator p0)`
- `public org.assertj.core.api.AtomicIntegerAssert usingComparator(java.util.Comparator p0, java.lang.String p1)`
- `public org.assertj.core.api.AtomicIntegerAssert usingDefaultComparator()`

---

## public class `org.assertj.core.api.AtomicIntegerFieldUpdaterAssert`<OBJECT extends java.lang.Object>
extends `org.assertj.core.api.AbstractAtomicFieldUpdaterAssert`  

**Constructors:**
- `public AtomicIntegerFieldUpdaterAssert(java.util.concurrent.atomic.AtomicIntegerFieldUpdater p0)`

**Methods:**
- `protected java.lang.Integer getActualValue(OBJECT p0)`
- `public org.assertj.core.api.AtomicIntegerFieldUpdaterAssert hasValue(java.lang.Integer p0, OBJECT p1)`

---

## public class `org.assertj.core.api.AtomicLongArrayAssert`
extends `org.assertj.core.api.AbstractEnumerableAssert`  

**Constructors:**
- `public AtomicLongArrayAssert(java.util.concurrent.atomic.AtomicLongArray p0)`

**Fields:**
- `protected org.assertj.core.internal.LongArrays arrays`

**Methods:**
- `public org.assertj.core.api.AtomicLongArrayAssert contains(long p0, org.assertj.core.data.Index p1)`
- `public org.assertj.core.api.AtomicLongArrayAssert contains(long... p0)`
- `public org.assertj.core.api.AtomicLongArrayAssert containsAnyOf(long... p0)`
- `public org.assertj.core.api.AtomicLongArrayAssert containsExactly(long... p0)`
- `public org.assertj.core.api.AtomicLongArrayAssert containsExactlyInAnyOrder(long... p0)`
- `public org.assertj.core.api.AtomicLongArrayAssert containsOnly(long... p0)`
- `public org.assertj.core.api.AtomicLongArrayAssert containsOnlyOnce(long... p0)`
- `public org.assertj.core.api.AtomicLongArrayAssert containsSequence(long... p0)`
- `public org.assertj.core.api.AtomicLongArrayAssert containsSubsequence(long... p0)`
- `public org.assertj.core.api.AtomicLongArrayAssert doesNotContain(long p0, org.assertj.core.data.Index p1)`
- `public org.assertj.core.api.AtomicLongArrayAssert doesNotContain(long... p0)`
- `public org.assertj.core.api.AtomicLongArrayAssert doesNotHaveDuplicates()`
- `public org.assertj.core.api.AtomicLongArrayAssert endsWith(long... p0)`
- `public org.assertj.core.api.AtomicLongArrayAssert hasArray(long[] p0)`
- `public org.assertj.core.api.AtomicLongArrayAssert hasSameSizeAs(java.lang.Iterable p0)`
- `public org.assertj.core.api.AtomicLongArrayAssert hasSize(int p0)`
- `public org.assertj.core.api.AtomicLongArrayAssert hasSizeBetween(int p0, int p1)`
- `public org.assertj.core.api.AtomicLongArrayAssert hasSizeGreaterThan(int p0)`
- `public org.assertj.core.api.AtomicLongArrayAssert hasSizeGreaterThanOrEqualTo(int p0)`
- `public org.assertj.core.api.AtomicLongArrayAssert hasSizeLessThan(int p0)`
- `public org.assertj.core.api.AtomicLongArrayAssert hasSizeLessThanOrEqualTo(int p0)`
- `public void isEmpty()`
- `public org.assertj.core.api.AtomicLongArrayAssert isNotEmpty()`
- `public void isNullOrEmpty()`
- `public org.assertj.core.api.AtomicLongArrayAssert isSorted()`
- `public org.assertj.core.api.AtomicLongArrayAssert isSortedAccordingTo(java.util.Comparator p0)`
- `public org.assertj.core.api.AtomicLongArrayAssert startsWith(long... p0)`
- `public org.assertj.core.api.AtomicLongArrayAssert usingDefaultElementComparator()`
- `public org.assertj.core.api.AtomicLongArrayAssert usingElementComparator(java.util.Comparator p0)`

---

## public class `org.assertj.core.api.AtomicLongAssert`
extends `org.assertj.core.api.AbstractAssert`  

**Constructors:**
- `public AtomicLongAssert(java.util.concurrent.atomic.AtomicLong p0)`

**Methods:**
- `public org.assertj.core.api.AtomicLongAssert doesNotHaveValue(long p0)`
- `public org.assertj.core.api.AtomicLongAssert hasNegativeValue()`
- `public org.assertj.core.api.AtomicLongAssert hasNonNegativeValue()`
- `public org.assertj.core.api.AtomicLongAssert hasNonPositiveValue()`
- `public org.assertj.core.api.AtomicLongAssert hasPositiveValue()`
- `public org.assertj.core.api.AtomicLongAssert hasValue(long p0)`
- `public org.assertj.core.api.AtomicLongAssert hasValueBetween(long p0, long p1)`
- `public org.assertj.core.api.AtomicLongAssert hasValueCloseTo(long p0, org.assertj.core.data.Offset p1)`
- `public org.assertj.core.api.AtomicLongAssert hasValueCloseTo(long p0, org.assertj.core.data.Percentage p1)`
- `public org.assertj.core.api.AtomicLongAssert hasValueGreaterThan(long p0)`
- `public org.assertj.core.api.AtomicLongAssert hasValueGreaterThanOrEqualTo(long p0)`
- `public org.assertj.core.api.AtomicLongAssert hasValueLessThan(long p0)`
- `public org.assertj.core.api.AtomicLongAssert hasValueLessThanOrEqualTo(long p0)`
- `public org.assertj.core.api.AtomicLongAssert usingComparator(java.util.Comparator p0)`
- `public org.assertj.core.api.AtomicLongAssert usingComparator(java.util.Comparator p0, java.lang.String p1)`
- `public org.assertj.core.api.AtomicLongAssert usingDefaultComparator()`

---

## public class `org.assertj.core.api.AtomicLongFieldUpdaterAssert`<OBJECT extends java.lang.Object>
extends `org.assertj.core.api.AbstractAtomicFieldUpdaterAssert`  

**Constructors:**
- `public AtomicLongFieldUpdaterAssert(java.util.concurrent.atomic.AtomicLongFieldUpdater p0)`

**Methods:**
- `protected java.lang.Long getActualValue(OBJECT p0)`
- `public org.assertj.core.api.AtomicLongFieldUpdaterAssert hasValue(java.lang.Long p0, OBJECT p1)`

---

## public class `org.assertj.core.api.AtomicMarkableReferenceAssert`<VALUE extends java.lang.Object>
extends `org.assertj.core.api.AbstractAtomicReferenceAssert`  

**Constructors:**
- `public AtomicMarkableReferenceAssert(java.util.concurrent.atomic.AtomicMarkableReference p0)`

**Methods:**
- `protected VALUE getReference()`
- `public org.assertj.core.api.AtomicMarkableReferenceAssert hasReference(VALUE p0)`
- `public org.assertj.core.api.AtomicMarkableReferenceAssert isMarked()`
- `public org.assertj.core.api.AtomicMarkableReferenceAssert isNotMarked()`

---

## public class `org.assertj.core.api.AtomicReferenceArrayAssert`<T extends java.lang.Object>
extends `org.assertj.core.api.AbstractAssert`  
implements `org.assertj.core.api.ArraySortedAssert<org.assertj.core.api.AtomicReferenceArrayAssert<T>,T>`, `org.assertj.core.api.IndexedObjectEnumerableAssert<org.assertj.core.api.AtomicReferenceArrayAssert<T>,T>`  

**Constructors:**
- `public AtomicReferenceArrayAssert(java.util.concurrent.atomic.AtomicReferenceArray p0)`

**Methods:**
- `public org.assertj.core.api.AtomicReferenceArrayAssert allMatch(java.util.function.Predicate p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert allMatch(java.util.function.Predicate p0, java.lang.String p1)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert allSatisfy(java.util.function.Consumer p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert allSatisfy(org.assertj.core.api.ThrowingConsumer p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert anyMatch(java.util.function.Predicate p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert anySatisfy(java.util.function.Consumer p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert anySatisfy(org.assertj.core.api.ThrowingConsumer p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert are(org.assertj.core.api.Condition p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert areAtLeast(int p0, org.assertj.core.api.Condition p1)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert areAtLeastOne(org.assertj.core.api.Condition p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert areAtMost(int p0, org.assertj.core.api.Condition p1)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert areExactly(int p0, org.assertj.core.api.Condition p1)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert areNot(org.assertj.core.api.Condition p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert as(java.lang.String p0, java.lang.Object... p1)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert as(org.assertj.core.description.Description p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert contains(T p0, org.assertj.core.data.Index p1)`
- `public final org.assertj.core.api.AtomicReferenceArrayAssert contains(T... p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert containsAll(java.lang.Iterable p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert containsAnyElementsOf(java.lang.Iterable p0)`
- `public final org.assertj.core.api.AtomicReferenceArrayAssert containsAnyOf(T... p0)`
- `protected org.assertj.core.api.AtomicReferenceArrayAssert containsAnyOfForProxy(T[] p0)`
- `public final org.assertj.core.api.AtomicReferenceArrayAssert containsExactly(T... p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert containsExactlyElementsOf(java.lang.Iterable p0)`
- `protected org.assertj.core.api.AtomicReferenceArrayAssert containsExactlyForProxy(T[] p0)`
- `public final org.assertj.core.api.AtomicReferenceArrayAssert containsExactlyInAnyOrder(T... p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert containsExactlyInAnyOrderElementsOf(java.lang.Iterable p0)`
- `protected org.assertj.core.api.AtomicReferenceArrayAssert containsExactlyInAnyOrderForProxy(T[] p0)`
- `protected org.assertj.core.api.AtomicReferenceArrayAssert containsForProxy(T[] p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert containsNull()`
- `public final org.assertj.core.api.AtomicReferenceArrayAssert containsOnly(T... p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert containsOnlyElementsOf(java.lang.Iterable p0)`
- `protected org.assertj.core.api.AtomicReferenceArrayAssert containsOnlyForProxy(T[] p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert containsOnlyNulls()`
- `public final org.assertj.core.api.AtomicReferenceArrayAssert containsOnlyOnce(T... p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert containsOnlyOnceElementsOf(java.lang.Iterable p0)`
- `protected org.assertj.core.api.AtomicReferenceArrayAssert containsOnlyOnceForProxy(T[] p0)`
- `public final org.assertj.core.api.AtomicReferenceArrayAssert containsSequence(T... p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert containsSequence(java.lang.Iterable p0)`
- `protected org.assertj.core.api.AtomicReferenceArrayAssert containsSequenceForProxy(T[] p0)`
- `public final org.assertj.core.api.AtomicReferenceArrayAssert containsSubsequence(T... p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert containsSubsequence(java.lang.Iterable p0)`
- `protected org.assertj.core.api.AtomicReferenceArrayAssert containsSubsequenceForProxy(T[] p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert doNotHave(org.assertj.core.api.Condition p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert doesNotContain(T p0, org.assertj.core.data.Index p1)`
- `public final org.assertj.core.api.AtomicReferenceArrayAssert doesNotContain(T... p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert doesNotContainAnyElementsOf(java.lang.Iterable p0)`
- `protected org.assertj.core.api.AtomicReferenceArrayAssert doesNotContainForProxy(T[] p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert doesNotContainNull()`
- `public final org.assertj.core.api.AtomicReferenceArrayAssert doesNotContainSequence(T... p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert doesNotContainSequence(java.lang.Iterable p0)`
- `protected org.assertj.core.api.AtomicReferenceArrayAssert doesNotContainSequenceForProxy(T[] p0)`
- `public final org.assertj.core.api.AtomicReferenceArrayAssert doesNotContainSubsequence(T... p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert doesNotContainSubsequence(java.lang.Iterable p0)`
- `protected org.assertj.core.api.AtomicReferenceArrayAssert doesNotContainSubsequenceForProxy(T[] p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert doesNotHaveAnyElementsOfTypes(java.lang.Class... p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert doesNotHaveDuplicates()`
- `public final org.assertj.core.api.AtomicReferenceArrayAssert endsWith(T p0, T... p1)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert endsWith(T[] p0)`
- `protected org.assertj.core.api.AtomicReferenceArrayAssert endsWithForProxy(T p0, T[] p1)`
- `public org.assertj.core.api.ObjectArrayAssert extracting(java.lang.String p0)`
- `public <P extends java.lang.Object> org.assertj.core.api.ObjectArrayAssert extracting(java.lang.String p0, java.lang.Class p1)`
- `public org.assertj.core.api.ObjectArrayAssert extracting(java.lang.String... p0)`
- `public <U extends java.lang.Object> org.assertj.core.api.ObjectArrayAssert extracting(java.util.function.Function p0)`
- `public <U extends java.lang.Object, EXCEPTION extends java.lang.Exception> org.assertj.core.api.ObjectArrayAssert extracting(org.assertj.core.api.iterable.ThrowingExtractor p0)`
- `public org.assertj.core.api.ObjectArrayAssert extractingResultOf(java.lang.String p0)`
- `public <P extends java.lang.Object> org.assertj.core.api.ObjectArrayAssert extractingResultOf(java.lang.String p0, java.lang.Class p1)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert filteredOn(java.lang.String p0, java.lang.Object p1)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert filteredOn(java.lang.String p0, org.assertj.core.api.filter.FilterOperator p1)`
- `public <U extends java.lang.Object> org.assertj.core.api.AtomicReferenceArrayAssert filteredOn(java.util.function.Function p0, U p1)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert filteredOn(java.util.function.Predicate p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert filteredOn(org.assertj.core.api.Condition p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert filteredOnNull(java.lang.String p0)`
- `public org.assertj.core.api.ObjectArrayAssert flatExtracting(java.lang.String p0)`
- `public <U extends java.lang.Object, C extends java.util.Collection<U>> org.assertj.core.api.ObjectArrayAssert flatExtracting(java.util.function.Function p0)`
- `public <U extends java.lang.Object, C extends java.util.Collection<U>, EXCEPTION extends java.lang.Exception> org.assertj.core.api.ObjectArrayAssert flatExtracting(org.assertj.core.api.iterable.ThrowingExtractor p0)`
- `protected org.assertj.core.internal.TypeComparators getComparatorsByType()`
- `protected org.assertj.core.internal.TypeComparators getComparatorsForElementPropertyOrFieldTypes()`
- `public org.assertj.core.api.AtomicReferenceArrayAssert hasArray(T[] p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert hasAtLeastOneElementOfType(java.lang.Class p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert hasExactlyElementsOfTypes(java.lang.Class... p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert hasOnlyElementsOfType(java.lang.Class p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert hasOnlyElementsOfTypes(java.lang.Class... p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert hasOnlyOneElementSatisfying(java.util.function.Consumer p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert hasSameElementsAs(java.lang.Iterable p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert hasSameSizeAs(java.lang.Iterable p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert hasSameSizeAs(java.lang.Object p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert hasSize(int p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert hasSizeBetween(int p0, int p1)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert hasSizeGreaterThan(int p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert hasSizeGreaterThanOrEqualTo(int p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert hasSizeLessThan(int p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert hasSizeLessThanOrEqualTo(int p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert have(org.assertj.core.api.Condition p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert haveAtLeast(int p0, org.assertj.core.api.Condition p1)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert haveAtLeastOne(org.assertj.core.api.Condition p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert haveAtMost(int p0, org.assertj.core.api.Condition p1)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert haveExactly(int p0, org.assertj.core.api.Condition p1)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert inBinary()`
- `public org.assertj.core.api.AtomicReferenceArrayAssert inHexadecimal()`
- `public void isEmpty()`
- `public org.assertj.core.api.AtomicReferenceArrayAssert isNotEmpty()`
- `public void isNullOrEmpty()`
- `public org.assertj.core.api.AtomicReferenceArrayAssert isSorted()`
- `public org.assertj.core.api.AtomicReferenceArrayAssert isSortedAccordingTo(java.util.Comparator p0)`
- `public final org.assertj.core.api.AtomicReferenceArrayAssert isSubsetOf(T... p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert isSubsetOf(java.lang.Iterable p0)`
- `protected org.assertj.core.api.AtomicReferenceArrayAssert isSubsetOfForProxy(T[] p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert noneMatch(java.util.function.Predicate p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert noneSatisfy(java.util.function.Consumer p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert noneSatisfy(org.assertj.core.api.ThrowingConsumer p0)`
- `public final org.assertj.core.api.AtomicReferenceArrayAssert satisfiesExactly(java.util.function.Consumer... p0)`
- `public final org.assertj.core.api.AtomicReferenceArrayAssert satisfiesExactly(org.assertj.core.api.ThrowingConsumer... p0)`
- `protected org.assertj.core.api.AtomicReferenceArrayAssert satisfiesExactlyForProxy(java.util.function.Consumer[] p0)`
- `public final org.assertj.core.api.AtomicReferenceArrayAssert satisfiesExactlyInAnyOrder(java.util.function.Consumer... p0)`
- `public final org.assertj.core.api.AtomicReferenceArrayAssert satisfiesExactlyInAnyOrder(org.assertj.core.api.ThrowingConsumer... p0)`
- `protected org.assertj.core.api.AtomicReferenceArrayAssert satisfiesExactlyInAnyOrderForProxy(java.util.function.Consumer[] p0)`
- `public final org.assertj.core.api.AtomicReferenceArrayAssert startsWith(T... p0)`
- `protected org.assertj.core.api.AtomicReferenceArrayAssert startsWithForProxy(T[] p0)`
- `public <C extends java.lang.Object> org.assertj.core.api.AtomicReferenceArrayAssert usingComparatorForElementFieldsWithNames(java.util.Comparator p0, java.lang.String... p1)`
- `public <C extends java.lang.Object> org.assertj.core.api.AtomicReferenceArrayAssert usingComparatorForElementFieldsWithType(java.util.Comparator p0, java.lang.Class p1)`
- `public <C extends java.lang.Object> org.assertj.core.api.AtomicReferenceArrayAssert usingComparatorForType(java.util.Comparator p0, java.lang.Class p1)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert usingDefaultElementComparator()`
- `public org.assertj.core.api.AtomicReferenceArrayAssert usingElementComparator(java.util.Comparator p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert usingElementComparatorIgnoringFields(java.lang.String... p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert usingElementComparatorOnFields(java.lang.String... p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert usingFieldByFieldElementComparator()`
- `public org.assertj.core.api.AtomicReferenceArrayAssert usingRecursiveFieldByFieldElementComparator()`
- `public org.assertj.core.api.AtomicReferenceArrayAssert usingRecursiveFieldByFieldElementComparator(org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert usingRecursiveFieldByFieldElementComparatorIgnoringFields(java.lang.String... p0)`
- `public org.assertj.core.api.AtomicReferenceArrayAssert usingRecursiveFieldByFieldElementComparatorOnFields(java.lang.String... p0)`

---

## public class `org.assertj.core.api.AtomicReferenceAssert`<V extends java.lang.Object>
extends `org.assertj.core.api.AbstractAssert`  

**Constructors:**
- `public AtomicReferenceAssert(java.util.concurrent.atomic.AtomicReference p0)`

**Methods:**
- `public org.assertj.core.api.AtomicReferenceAssert doesNotHaveValue(V p0)`
- `public org.assertj.core.api.AtomicReferenceAssert hasValue(V p0)`
- `public org.assertj.core.api.AtomicReferenceAssert hasValueMatching(java.util.function.Predicate p0)`
- `public org.assertj.core.api.AtomicReferenceAssert hasValueMatching(java.util.function.Predicate p0, java.lang.String p1)`
- `public org.assertj.core.api.AtomicReferenceAssert hasValueSatisfying(java.util.function.Consumer p0)`

---

## public class `org.assertj.core.api.AtomicReferenceFieldUpdaterAssert`<FIELD extends java.lang.Object, OBJECT extends java.lang.Object>
extends `org.assertj.core.api.AbstractAtomicFieldUpdaterAssert`  

**Constructors:**
- `public AtomicReferenceFieldUpdaterAssert(java.util.concurrent.atomic.AtomicReferenceFieldUpdater p0)`

**Methods:**
- `protected FIELD getActualValue(OBJECT p0)`
- `public org.assertj.core.api.AtomicReferenceFieldUpdaterAssert hasValue(FIELD p0, OBJECT p1)`

---

## public class `org.assertj.core.api.AtomicStampedReferenceAssert`<VALUE extends java.lang.Object>
extends `org.assertj.core.api.AbstractAtomicReferenceAssert`  

**Constructors:**
- `public AtomicStampedReferenceAssert(java.util.concurrent.atomic.AtomicStampedReference p0)`

**Methods:**
- `protected VALUE getReference()`
- `public org.assertj.core.api.AtomicStampedReferenceAssert hasReference(VALUE p0)`
- `public org.assertj.core.api.AtomicStampedReferenceAssert hasStamp(int p0)`

---

## public class `org.assertj.core.api.AutoCloseableBDDSoftAssertions`
extends `org.assertj.core.api.BDDSoftAssertions`  
implements `org.assertj.core.api.AutoCloseableSoftAssertionsProvider`  

**Constructors:**
- `public AutoCloseableBDDSoftAssertions()`

---

## public class `org.assertj.core.api.AutoCloseableSoftAssertions`
extends `org.assertj.core.api.SoftAssertions`  
implements `org.assertj.core.api.AutoCloseableSoftAssertionsProvider`  

**Constructors:**
- `public AutoCloseableSoftAssertions()`

---

## public abstract interface `org.assertj.core.api.AutoCloseableSoftAssertionsProvider`
implements `java.lang.AutoCloseable`, `org.assertj.core.api.SoftAssertionsProvider`  

**Methods:**
- `public default void close()`

---

## public class `org.assertj.core.api.BDDAssertions`
annotations: @org.assertj.core.util.CheckReturnValue  
extends `org.assertj.core.api.Assertions`  

**Constructors:**
- `protected BDDAssertions()`

**Fields:**
- `public final static org.assertj.core.api.BDDAssertions and`

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.api.Condition allOf(java.lang.Iterable p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.Condition allOf(org.assertj.core.api.Condition... p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.Condition anyOf(java.lang.Iterable p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.Condition anyOf(org.assertj.core.api.Condition... p0)`
- `public static <T extends java.lang.Object, ASSERT extends org.assertj.core.api.AbstractAssert<? extends java.lang.Object, ? extends java.lang.Object>> org.assertj.core.api.InstanceOfAssertFactory as(org.assertj.core.api.InstanceOfAssertFactory p0)`
- `public static org.assertj.core.data.Index atIndex(int p0)`
- `public static org.assertj.core.data.Offset byLessThan(java.lang.Byte p0)`
- `public static org.assertj.core.data.Offset byLessThan(java.lang.Double p0)`
- `public static org.assertj.core.data.Offset byLessThan(java.lang.Float p0)`
- `public static org.assertj.core.data.Offset byLessThan(java.lang.Integer p0)`
- `public static org.assertj.core.data.Offset byLessThan(java.lang.Long p0)`
- `public static org.assertj.core.data.Offset byLessThan(java.lang.Short p0)`
- `public static org.assertj.core.data.Offset byLessThan(java.math.BigDecimal p0)`
- `public static org.assertj.core.data.Offset byLessThan(java.math.BigInteger p0)`
- `public static org.assertj.core.data.TemporalUnitOffset byLessThan(long p0, java.time.temporal.TemporalUnit p1)`
- `public static java.lang.Exception catchException(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static java.io.IOException catchIOException(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static java.lang.IllegalArgumentException catchIllegalArgumentException(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static java.lang.IllegalStateException catchIllegalStateException(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static java.lang.IndexOutOfBoundsException catchIndexOutOfBoundsException(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static java.lang.NullPointerException catchNullPointerException(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static java.lang.ReflectiveOperationException catchReflectiveOperationException(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static java.lang.RuntimeException catchRuntimeException(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static java.lang.Throwable catchThrowable(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static <THROWABLE extends java.lang.Throwable> THROWABLE catchThrowableOfType(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0, java.lang.Class p1)`
- `public static java.lang.String contentOf(java.io.File p0)`
- `public static java.lang.String contentOf(java.io.File p0, java.lang.String p1)`
- `public static java.lang.String contentOf(java.io.File p0, java.nio.charset.Charset p1)`
- `public static java.lang.String contentOf(java.net.URL p0)`
- `public static java.lang.String contentOf(java.net.URL p0, java.lang.String p1)`
- `public static java.lang.String contentOf(java.net.URL p0, java.nio.charset.Charset p1)`
- `public static <T extends java.lang.Object> org.assertj.core.condition.DoesNotHave doesNotHave(org.assertj.core.api.Condition p0)`
- `public static <K extends java.lang.Object, V extends java.lang.Object> org.assertj.core.data.MapEntry entry(K p0, V p1)`
- `public static org.assertj.core.groups.Properties extractProperty(java.lang.String p0)`
- `public static <T extends java.lang.Object> org.assertj.core.groups.Properties extractProperty(java.lang.String p0, java.lang.Class p1)`
- `public static <T extends java.lang.Object> T fail(java.lang.String p0)`
- `public static <T extends java.lang.Object> T fail(java.lang.String p0, java.lang.Object... p1)`
- `public static <T extends java.lang.Object> T fail(java.lang.String p0, java.lang.Throwable p1)`
- `public static <F extends java.lang.Object, T extends java.lang.Object> java.util.function.Function from(java.util.function.Function p0)`
- `public static org.assertj.core.api.filter.InFilter in(java.lang.Object... p0)`
- `public static java.util.List linesOf(java.io.File p0)`
- `public static java.util.List linesOf(java.io.File p0, java.lang.String p1)`
- `public static java.util.List linesOf(java.io.File p0, java.nio.charset.Charset p1)`
- `public static java.util.List linesOf(java.net.URL p0)`
- `public static java.util.List linesOf(java.net.URL p0, java.lang.String p1)`
- `public static java.util.List linesOf(java.net.URL p0, java.nio.charset.Charset p1)`
- `public static java.util.List linesOf(java.nio.file.Path p0)`
- `public static java.util.List linesOf(java.nio.file.Path p0, java.lang.String p1)`
- `public static java.util.List linesOf(java.nio.file.Path p0, java.nio.charset.Charset p1)`
- `public static org.assertj.core.api.filter.NotFilter not(java.lang.Object p0)`
- `public static <T extends java.lang.Object> org.assertj.core.condition.Not not(org.assertj.core.api.Condition p0)`
- `public static org.assertj.core.api.filter.NotInFilter notIn(java.lang.Object... p0)`
- `public static void registerCustomDateFormat(java.lang.String p0)`
- `public static void registerCustomDateFormat(java.text.DateFormat p0)`
- `public static <T extends java.lang.Object> void registerFormatterForType(java.lang.Class p0, java.util.function.Function p1)`
- `public static void setAllowComparingPrivateFields(boolean p0)`
- `public static void setAllowExtractingPrivateFields(boolean p0)`
- `public static void setDescriptionConsumer(java.util.function.Consumer p0)`
- `public static void setExtractBareNamePropertyMethods(boolean p0)`
- `public static void setLenientDateParsing(boolean p0)`
- `public static void setMaxElementsForPrinting(int p0)`
- `public static void setMaxLengthForSingleLineDescription(int p0)`
- `public static void setMaxStackTraceElementsDisplayed(int p0)`
- `public static void setPrintAssertionsDescription(boolean p0)`
- `public static void setRemoveAssertJRelatedElementsFromStackTrace(boolean p0)`
- `public static <T extends java.lang.Object> T shouldHaveThrown(java.lang.Class p0)`
- `public static <ACTUAL extends java.lang.Iterable<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.ClassBasedNavigableIterableAssert then(ACTUAL p0, java.lang.Class p1)`
- `public static <T extends java.lang.Comparable<? super T>> org.assertj.core.api.AbstractComparableAssert then(T p0)`
- `public static <T extends java.lang.Throwable> org.assertj.core.api.AbstractThrowableAssert then(T p0)`
- `public static <T extends org.assertj.core.api.AssertDelegateTarget> T then(T p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.ObjectAssert then(T p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.ObjectArrayAssert then(T[] p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.Object2DArrayAssert then(T[][] p0)`
- `public static org.assertj.core.api.AbstractBooleanAssert then(boolean p0)`
- `public static org.assertj.core.api.AbstractBooleanArrayAssert then(boolean[] p0)`
- `public static org.assertj.core.api.Boolean2DArrayAssert then(boolean[][] p0)`
- `public static org.assertj.core.api.AbstractByteAssert then(byte p0)`
- `public static org.assertj.core.api.AbstractByteArrayAssert then(byte[] p0)`
- `public static org.assertj.core.api.Byte2DArrayAssert then(byte[][] p0)`
- `public static org.assertj.core.api.AbstractCharacterAssert then(char p0)`
- `public static org.assertj.core.api.AbstractCharArrayAssert then(char[] p0)`
- `public static org.assertj.core.api.Char2DArrayAssert then(char[][] p0)`
- `public static org.assertj.core.api.AbstractDoubleAssert then(double p0)`
- `public static org.assertj.core.api.AbstractDoubleArrayAssert then(double[] p0)`
- `public static org.assertj.core.api.Double2DArrayAssert then(double[][] p0)`
- `public static org.assertj.core.api.AbstractFloatAssert then(float p0)`
- `public static org.assertj.core.api.AbstractFloatArrayAssert then(float[] p0)`
- `public static org.assertj.core.api.Float2DArrayAssert then(float[][] p0)`
- `public static org.assertj.core.api.AbstractIntegerAssert then(int p0)`
- `public static org.assertj.core.api.AbstractIntArrayAssert then(int[] p0)`
- `public static org.assertj.core.api.Int2DArrayAssert then(int[][] p0)`
- `public static org.assertj.core.api.AbstractFileAssert then(java.io.File p0)`
- `public static org.assertj.core.api.AbstractInputStreamAssert then(java.io.InputStream p0)`
- `public static org.assertj.core.api.AbstractBooleanAssert then(java.lang.Boolean p0)`
- `public static org.assertj.core.api.AbstractByteAssert then(java.lang.Byte p0)`
- `public static org.assertj.core.api.AbstractCharSequenceAssert then(java.lang.CharSequence p0)`
- `public static org.assertj.core.api.AbstractCharacterAssert then(java.lang.Character p0)`
- `public static org.assertj.core.api.ClassAssert then(java.lang.Class p0)`
- `public static org.assertj.core.api.AbstractDoubleAssert then(java.lang.Double p0)`
- `public static org.assertj.core.api.AbstractFloatAssert then(java.lang.Float p0)`
- `public static org.assertj.core.api.AbstractIntegerAssert then(java.lang.Integer p0)`
- `public static <ACTUAL extends java.lang.Iterable<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.FactoryBasedNavigableIterableAssert then(java.lang.Iterable p0, org.assertj.core.api.AssertFactory p1)`
- `public static <T extends java.lang.Object> org.assertj.core.api.IterableAssert then(java.lang.Iterable p0)`
- `public static org.assertj.core.api.AbstractLongAssert then(java.lang.Long p0)`
- `public static org.assertj.core.api.AbstractShortAssert then(java.lang.Short p0)`
- `public static org.assertj.core.api.AbstractStringAssert then(java.lang.String p0)`
- `public static org.assertj.core.api.AbstractCharSequenceAssert then(java.lang.StringBuffer p0)`
- `public static org.assertj.core.api.AbstractCharSequenceAssert then(java.lang.StringBuilder p0)`
- `public static org.assertj.core.api.AbstractBigDecimalAssert then(java.math.BigDecimal p0)`
- `public static org.assertj.core.api.AbstractBigIntegerAssert then(java.math.BigInteger p0)`
- `public static org.assertj.core.api.AbstractUriAssert then(java.net.URI p0)`
- `public static org.assertj.core.api.AbstractUrlAssert then(java.net.URL p0)`
- `public static org.assertj.core.api.AbstractPathAssert then(java.nio.file.Path p0)`
- `public static org.assertj.core.api.AbstractDurationAssert then(java.time.Duration p0)`
- `public static org.assertj.core.api.AbstractInstantAssert then(java.time.Instant p0)`
- `public static org.assertj.core.api.AbstractLocalDateAssert then(java.time.LocalDate p0)`
- `public static org.assertj.core.api.AbstractLocalDateTimeAssert then(java.time.LocalDateTime p0)`
- `public static org.assertj.core.api.AbstractLocalTimeAssert then(java.time.LocalTime p0)`
- `public static org.assertj.core.api.AbstractOffsetDateTimeAssert then(java.time.OffsetDateTime p0)`
- `public static org.assertj.core.api.AbstractOffsetTimeAssert then(java.time.OffsetTime p0)`
- `public static org.assertj.core.api.AbstractPeriodAssert then(java.time.Period p0)`
- `public static org.assertj.core.api.AbstractZonedDateTimeAssert then(java.time.ZonedDateTime p0)`
- `public static <E extends java.lang.Object> org.assertj.core.api.AbstractCollectionAssert then(java.util.Collection p0)`
- `public static org.assertj.core.api.AbstractDateAssert then(java.util.Date p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.IteratorAssert then(java.util.Iterator p0)`
- `public static <ELEMENT extends java.lang.Object, ACTUAL extends java.util.List<? extends ELEMENT>, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.ClassBasedNavigableListAssert then(java.util.List p0, java.lang.Class p1)`
- `public static <ACTUAL extends java.util.List<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.FactoryBasedNavigableListAssert then(java.util.List p0, org.assertj.core.api.AssertFactory p1)`
- `public static <T extends java.lang.Object> org.assertj.core.api.ListAssert then(java.util.List p0)`
- `public static <K extends java.lang.Object, V extends java.lang.Object> org.assertj.core.api.MapAssert then(java.util.Map p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.OptionalAssert then(java.util.Optional p0)`
- `public static org.assertj.core.api.OptionalDoubleAssert then(java.util.OptionalDouble p0)`
- `public static org.assertj.core.api.OptionalIntAssert then(java.util.OptionalInt p0)`
- `public static org.assertj.core.api.OptionalLongAssert then(java.util.OptionalLong p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.SpliteratorAssert then(java.util.Spliterator p0)`
- `public static <RESULT extends java.lang.Object> org.assertj.core.api.CompletableFutureAssert then(java.util.concurrent.CompletableFuture p0)`
- `public static <RESULT extends java.lang.Object> org.assertj.core.api.CompletableFutureAssert then(java.util.concurrent.CompletionStage p0)`
- `public static <RESULT extends java.lang.Object> org.assertj.core.api.FutureAssert then(java.util.concurrent.Future p0)`
- `public static org.assertj.core.api.AtomicBooleanAssert then(java.util.concurrent.atomic.AtomicBoolean p0)`
- `public static org.assertj.core.api.AtomicIntegerAssert then(java.util.concurrent.atomic.AtomicInteger p0)`
- `public static org.assertj.core.api.AtomicIntegerArrayAssert then(java.util.concurrent.atomic.AtomicIntegerArray p0)`
- `public static <OBJECT extends java.lang.Object> org.assertj.core.api.AtomicIntegerFieldUpdaterAssert then(java.util.concurrent.atomic.AtomicIntegerFieldUpdater p0)`
- `public static org.assertj.core.api.AtomicLongAssert then(java.util.concurrent.atomic.AtomicLong p0)`
- `public static org.assertj.core.api.AtomicLongArrayAssert then(java.util.concurrent.atomic.AtomicLongArray p0)`
- `public static <OBJECT extends java.lang.Object> org.assertj.core.api.AtomicLongFieldUpdaterAssert then(java.util.concurrent.atomic.AtomicLongFieldUpdater p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.AtomicMarkableReferenceAssert then(java.util.concurrent.atomic.AtomicMarkableReference p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.AtomicReferenceAssert then(java.util.concurrent.atomic.AtomicReference p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.AtomicReferenceArrayAssert then(java.util.concurrent.atomic.AtomicReferenceArray p0)`
- `public static <FIELD extends java.lang.Object, OBJECT extends java.lang.Object> org.assertj.core.api.AtomicReferenceFieldUpdaterAssert then(java.util.concurrent.atomic.AtomicReferenceFieldUpdater p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.AtomicStampedReferenceAssert then(java.util.concurrent.atomic.AtomicStampedReference p0)`
- `public static org.assertj.core.api.LongAdderAssert then(java.util.concurrent.atomic.LongAdder p0)`
- `public static org.assertj.core.api.DoublePredicateAssert then(java.util.function.DoublePredicate p0)`
- `public static org.assertj.core.api.IntPredicateAssert then(java.util.function.IntPredicate p0)`
- `public static org.assertj.core.api.LongPredicateAssert then(java.util.function.LongPredicate p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.PredicateAssert then(java.util.function.Predicate p0)`
- `public static org.assertj.core.api.MatcherAssert then(java.util.regex.Matcher p0)`
- `public static org.assertj.core.api.ListAssert then(java.util.stream.DoubleStream p0)`
- `public static org.assertj.core.api.ListAssert then(java.util.stream.IntStream p0)`
- `public static org.assertj.core.api.ListAssert then(java.util.stream.LongStream p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.ListAssert then(java.util.stream.Stream p0)`
- `public static org.assertj.core.api.AbstractLongAssert then(long p0)`
- `public static org.assertj.core.api.AbstractLongArrayAssert then(long[] p0)`
- `public static org.assertj.core.api.Long2DArrayAssert then(long[][] p0)`
- `public static <T extends java.lang.Object> T then(org.assertj.core.api.AssertProvider p0)`
- `public static org.assertj.core.api.AbstractShortAssert then(short p0)`
- `public static org.assertj.core.api.AbstractShortArrayAssert then(short[] p0)`
- `public static org.assertj.core.api.Short2DArrayAssert then(short[][] p0)`
- `public static org.assertj.core.api.AbstractThrowableAssert thenCode(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static <E extends java.lang.Object> org.assertj.core.api.AbstractCollectionAssert thenCollection(java.util.Collection p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.AbstractUniversalComparableAssert thenComparable(java.lang.Comparable p0)`
- `public static org.assertj.core.api.ThrowableTypeAssert thenException()`
- `public static <T extends java.lang.Throwable> org.assertj.core.api.ThrowableTypeAssert thenExceptionOfType(java.lang.Class p0)`
- `public static org.assertj.core.api.ThrowableTypeAssert thenIOException()`
- `public static org.assertj.core.api.ThrowableTypeAssert thenIllegalArgumentException()`
- `public static org.assertj.core.api.ThrowableTypeAssert thenIllegalStateException()`
- `public static org.assertj.core.api.ThrowableTypeAssert thenIndexOutOfBoundsException()`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.IterableAssert thenIterable(java.lang.Iterable p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.IteratorAssert thenIterator(java.util.Iterator p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.ListAssert thenList(java.util.List p0)`
- `public static org.assertj.core.api.NotThrownAssert thenNoException()`
- `public static org.assertj.core.api.ThrowableTypeAssert thenNullPointerException()`
- `public static <T extends java.lang.Object> org.assertj.core.api.ObjectAssert thenObject(T p0)`
- `public static org.assertj.core.api.AbstractPathAssert thenPath(java.nio.file.Path p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.PredicateAssert thenPredicate(java.util.function.Predicate p0)`
- `public static org.assertj.core.api.ThrowableTypeAssert thenReflectiveOperationException()`
- `public static org.assertj.core.api.ThrowableTypeAssert thenRuntimeException()`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.ListAssert thenStream(java.util.stream.Stream p0)`
- `public static org.assertj.core.api.AbstractThrowableAssert thenThrownBy(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static org.assertj.core.api.AbstractThrowableAssert thenThrownBy(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0, java.lang.String p1, java.lang.Object... p2)`
- `public static <T extends java.lang.Object> org.assertj.core.api.ObjectAssert thenWith(T p0, java.util.function.Consumer... p1)`
- `public static org.assertj.core.groups.Tuple tuple(java.lang.Object... p0)`
- `public static void useDefaultDateFormatsOnly()`
- `public static void useDefaultRepresentation()`
- `public static void useRepresentation(org.assertj.core.presentation.Representation p0)`
- `public static java.time.Duration withMarginOf(java.time.Duration p0)`
- `public static org.assertj.core.data.Offset withPrecision(java.lang.Double p0)`
- `public static org.assertj.core.data.Offset withPrecision(java.lang.Float p0)`
- `public static org.assertj.core.data.Offset within(java.lang.Byte p0)`
- `public static org.assertj.core.data.Offset within(java.lang.Double p0)`
- `public static org.assertj.core.data.Offset within(java.lang.Float p0)`
- `public static org.assertj.core.data.Offset within(java.lang.Integer p0)`
- `public static org.assertj.core.data.Offset within(java.lang.Long p0)`
- `public static org.assertj.core.data.Offset within(java.lang.Short p0)`
- `public static org.assertj.core.data.Offset within(java.math.BigDecimal p0)`
- `public static org.assertj.core.data.Offset within(java.math.BigInteger p0)`
- `public static org.assertj.core.data.TemporalUnitOffset within(long p0, java.time.temporal.TemporalUnit p1)`
- `public static org.assertj.core.data.Percentage withinPercentage(java.lang.Double p0)`
- `public static org.assertj.core.data.Percentage withinPercentage(java.lang.Integer p0)`
- `public static org.assertj.core.data.Percentage withinPercentage(java.lang.Long p0)`

---

## public final class `org.assertj.core.api.BDDAssumptions`
annotations: @org.assertj.core.util.CheckReturnValue  
extends `org.assertj.core.api.Assumptions`  

**Methods:**
- `public static <T extends java.lang.Throwable> org.assertj.core.api.AbstractThrowableAssert given(T p0)`
- `public static <T extends java.lang.Comparable<? super T>> org.assertj.core.api.AbstractComparableAssert given(T p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.ObjectAssert given(T p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.ObjectArrayAssert given(T[] p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.Object2DArrayAssert given(T[][] p0)`
- `public static org.assertj.core.api.AbstractBooleanAssert given(boolean p0)`
- `public static org.assertj.core.api.AbstractBooleanArrayAssert given(boolean[] p0)`
- `public static org.assertj.core.api.Boolean2DArrayAssert given(boolean[][] p0)`
- `public static org.assertj.core.api.AbstractByteAssert given(byte p0)`
- `public static org.assertj.core.api.AbstractByteArrayAssert given(byte[] p0)`
- `public static org.assertj.core.api.Byte2DArrayAssert given(byte[][] p0)`
- `public static org.assertj.core.api.AbstractCharacterAssert given(char p0)`
- `public static org.assertj.core.api.AbstractCharArrayAssert given(char[] p0)`
- `public static org.assertj.core.api.Char2DArrayAssert given(char[][] p0)`
- `public static org.assertj.core.api.AbstractDoubleAssert given(double p0)`
- `public static org.assertj.core.api.AbstractDoubleArrayAssert given(double[] p0)`
- `public static org.assertj.core.api.Double2DArrayAssert given(double[][] p0)`
- `public static org.assertj.core.api.AbstractFloatAssert given(float p0)`
- `public static org.assertj.core.api.AbstractFloatArrayAssert given(float[] p0)`
- `public static org.assertj.core.api.Float2DArrayAssert given(float[][] p0)`
- `public static org.assertj.core.api.AbstractIntegerAssert given(int p0)`
- `public static org.assertj.core.api.AbstractIntArrayAssert given(int[] p0)`
- `public static org.assertj.core.api.Int2DArrayAssert given(int[][] p0)`
- `public static org.assertj.core.api.AbstractFileAssert given(java.io.File p0)`
- `public static org.assertj.core.api.AbstractInputStreamAssert given(java.io.InputStream p0)`
- `public static org.assertj.core.api.AbstractBooleanAssert given(java.lang.Boolean p0)`
- `public static org.assertj.core.api.AbstractByteAssert given(java.lang.Byte p0)`
- `public static org.assertj.core.api.AbstractCharSequenceAssert given(java.lang.CharSequence p0)`
- `public static org.assertj.core.api.AbstractCharacterAssert given(java.lang.Character p0)`
- `public static org.assertj.core.api.ClassAssert given(java.lang.Class p0)`
- `public static org.assertj.core.api.AbstractDoubleAssert given(java.lang.Double p0)`
- `public static org.assertj.core.api.AbstractFloatAssert given(java.lang.Float p0)`
- `public static org.assertj.core.api.AbstractIntegerAssert given(java.lang.Integer p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.IterableAssert given(java.lang.Iterable p0)`
- `public static org.assertj.core.api.AbstractLongAssert given(java.lang.Long p0)`
- `public static org.assertj.core.api.AbstractShortAssert given(java.lang.Short p0)`
- `public static org.assertj.core.api.AbstractStringAssert given(java.lang.String p0)`
- `public static org.assertj.core.api.AbstractCharSequenceAssert given(java.lang.StringBuffer p0)`
- `public static org.assertj.core.api.AbstractCharSequenceAssert given(java.lang.StringBuilder p0)`
- `public static org.assertj.core.api.AbstractBigDecimalAssert given(java.math.BigDecimal p0)`
- `public static org.assertj.core.api.AbstractBigIntegerAssert given(java.math.BigInteger p0)`
- `public static org.assertj.core.api.AbstractUriAssert given(java.net.URI p0)`
- `public static org.assertj.core.api.AbstractUrlAssert given(java.net.URL p0)`
- `public static org.assertj.core.api.AbstractPathAssert given(java.nio.file.Path p0)`
- `public static org.assertj.core.api.AbstractDurationAssert given(java.time.Duration p0)`
- `public static org.assertj.core.api.AbstractInstantAssert given(java.time.Instant p0)`
- `public static org.assertj.core.api.AbstractLocalDateAssert given(java.time.LocalDate p0)`
- `public static org.assertj.core.api.AbstractLocalDateTimeAssert given(java.time.LocalDateTime p0)`
- `public static org.assertj.core.api.AbstractLocalTimeAssert given(java.time.LocalTime p0)`
- `public static org.assertj.core.api.AbstractOffsetDateTimeAssert given(java.time.OffsetDateTime p0)`
- `public static org.assertj.core.api.AbstractOffsetTimeAssert given(java.time.OffsetTime p0)`
- `public static org.assertj.core.api.AbstractPeriodAssert given(java.time.Period p0)`
- `public static org.assertj.core.api.AbstractZonedDateTimeAssert given(java.time.ZonedDateTime p0)`
- `public static <E extends java.lang.Object> org.assertj.core.api.AbstractCollectionAssert given(java.util.Collection p0)`
- `public static org.assertj.core.api.AbstractDateAssert given(java.util.Date p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.IteratorAssert given(java.util.Iterator p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.FactoryBasedNavigableListAssert given(java.util.List p0)`
- `public static <K extends java.lang.Object, V extends java.lang.Object> org.assertj.core.api.MapAssert given(java.util.Map p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.OptionalAssert given(java.util.Optional p0)`
- `public static org.assertj.core.api.OptionalDoubleAssert given(java.util.OptionalDouble p0)`
- `public static org.assertj.core.api.OptionalIntAssert given(java.util.OptionalInt p0)`
- `public static org.assertj.core.api.OptionalLongAssert given(java.util.OptionalLong p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.AbstractSpliteratorAssert given(java.util.Spliterator p0)`
- `public static <RESULT extends java.lang.Object> org.assertj.core.api.CompletableFutureAssert given(java.util.concurrent.CompletableFuture p0)`
- `public static <RESULT extends java.lang.Object> org.assertj.core.api.CompletableFutureAssert given(java.util.concurrent.CompletionStage p0)`
- `public static <RESULT extends java.lang.Object> org.assertj.core.api.AbstractFutureAssert given(java.util.concurrent.Future p0)`
- `public static org.assertj.core.api.AtomicBooleanAssert given(java.util.concurrent.atomic.AtomicBoolean p0)`
- `public static org.assertj.core.api.AtomicIntegerAssert given(java.util.concurrent.atomic.AtomicInteger p0)`
- `public static org.assertj.core.api.AtomicIntegerArrayAssert given(java.util.concurrent.atomic.AtomicIntegerArray p0)`
- `public static <OBJECT extends java.lang.Object> org.assertj.core.api.AtomicIntegerFieldUpdaterAssert given(java.util.concurrent.atomic.AtomicIntegerFieldUpdater p0)`
- `public static org.assertj.core.api.AtomicLongAssert given(java.util.concurrent.atomic.AtomicLong p0)`
- `public static org.assertj.core.api.AtomicLongArrayAssert given(java.util.concurrent.atomic.AtomicLongArray p0)`
- `public static <OBJECT extends java.lang.Object> org.assertj.core.api.AtomicLongFieldUpdaterAssert given(java.util.concurrent.atomic.AtomicLongFieldUpdater p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.AtomicMarkableReferenceAssert given(java.util.concurrent.atomic.AtomicMarkableReference p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.AtomicReferenceAssert given(java.util.concurrent.atomic.AtomicReference p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.AtomicReferenceArrayAssert given(java.util.concurrent.atomic.AtomicReferenceArray p0)`
- `public static <FIELD extends java.lang.Object, OBJECT extends java.lang.Object> org.assertj.core.api.AtomicReferenceFieldUpdaterAssert given(java.util.concurrent.atomic.AtomicReferenceFieldUpdater p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.AtomicStampedReferenceAssert given(java.util.concurrent.atomic.AtomicStampedReference p0)`
- `public static org.assertj.core.api.LongAdderAssert given(java.util.concurrent.atomic.LongAdder p0)`
- `public static org.assertj.core.api.DoublePredicateAssert given(java.util.function.DoublePredicate p0)`
- `public static org.assertj.core.api.IntPredicateAssert given(java.util.function.IntPredicate p0)`
- `public static org.assertj.core.api.LongPredicateAssert given(java.util.function.LongPredicate p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.PredicateAssert given(java.util.function.Predicate p0)`
- `public static org.assertj.core.api.MatcherAssert given(java.util.regex.Matcher p0)`
- `public static org.assertj.core.api.AbstractListAssert given(java.util.stream.DoubleStream p0)`
- `public static org.assertj.core.api.AbstractListAssert given(java.util.stream.IntStream p0)`
- `public static org.assertj.core.api.AbstractListAssert given(java.util.stream.LongStream p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.AbstractListAssert given(java.util.stream.Stream p0)`
- `public static org.assertj.core.api.AbstractLongAssert given(long p0)`
- `public static org.assertj.core.api.AbstractLongArrayAssert given(long[] p0)`
- `public static org.assertj.core.api.Long2DArrayAssert given(long[][] p0)`
- `public static org.assertj.core.api.AbstractShortAssert given(short p0)`
- `public static org.assertj.core.api.AbstractShortArrayAssert given(short[] p0)`
- `public static org.assertj.core.api.Short2DArrayAssert given(short[][] p0)`
- `public static org.assertj.core.api.AbstractThrowableAssert givenCode(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static <E extends java.lang.Object> org.assertj.core.api.AbstractCollectionAssert givenCollection(java.util.Collection p0)`
- `public static <T extends java.lang.Comparable<? super T>> org.assertj.core.api.AbstractComparableAssert givenComparable(T p0)`
- `public static org.assertj.core.api.ThrowableTypeAssert givenException()`
- `public static <T extends java.lang.Throwable> org.assertj.core.api.ThrowableTypeAssert givenExceptionOfType(java.lang.Class p0)`
- `public static org.assertj.core.api.ThrowableTypeAssert givenIOException()`
- `public static org.assertj.core.api.ThrowableTypeAssert givenIllegalArgumentException()`
- `public static org.assertj.core.api.ThrowableTypeAssert givenIndexOutOfBoundsException()`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.IterableAssert givenIterable(java.lang.Iterable p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.IteratorAssert givenIterator(java.util.Iterator p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.FactoryBasedNavigableListAssert givenList(java.util.List p0)`
- `public static org.assertj.core.api.ThrowableTypeAssert givenNullPointerException()`
- `public static <T extends java.lang.Object> org.assertj.core.api.ObjectAssert givenObject(T p0)`
- `public static org.assertj.core.api.AbstractPathAssert givenPath(java.nio.file.Path p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.PredicateAssert givenPredicate(java.util.function.Predicate p0)`
- `public static org.assertj.core.api.ThrowableTypeAssert givenReflectiveOperationException()`
- `public static org.assertj.core.api.ThrowableTypeAssert givenRuntimeException()`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.AbstractListAssert givenStream(java.util.stream.Stream p0)`
- `public static void setPreferredAssumptionException(org.assertj.core.configuration.PreferredAssumptionException p0)`

---

## public class `org.assertj.core.api.BDDSoftAssertions`
extends `org.assertj.core.api.AbstractSoftAssertions`  
implements `org.assertj.core.api.BDDSoftAssertionsProvider`  

**Constructors:**
- `public BDDSoftAssertions()`

**Methods:**
- `public static void thenSoftly(java.util.function.Consumer p0)`

---

## public abstract interface `org.assertj.core.api.BDDSoftAssertionsProvider`
annotations: @org.assertj.core.util.CheckReturnValue  
implements `org.assertj.core.api.Java6BDDSoftAssertionsProvider`  

**Methods:**
- `public default org.assertj.core.api.PathAssert then(java.nio.file.Path p0)`
- `public default org.assertj.core.api.DurationAssert then(java.time.Duration p0)`
- `public default org.assertj.core.api.InstantAssert then(java.time.Instant p0)`
- `public default org.assertj.core.api.LocalDateAssert then(java.time.LocalDate p0)`
- `public default org.assertj.core.api.LocalDateTimeAssert then(java.time.LocalDateTime p0)`
- `public default org.assertj.core.api.LocalTimeAssert then(java.time.LocalTime p0)`
- `public default org.assertj.core.api.OffsetDateTimeAssert then(java.time.OffsetDateTime p0)`
- `public default org.assertj.core.api.OffsetTimeAssert then(java.time.OffsetTime p0)`
- `public default org.assertj.core.api.PeriodAssert then(java.time.Period p0)`
- `public default org.assertj.core.api.ZonedDateTimeAssert then(java.time.ZonedDateTime p0)`
- `public default <VALUE extends java.lang.Object> org.assertj.core.api.OptionalAssert then(java.util.Optional p0)`
- `public default org.assertj.core.api.OptionalDoubleAssert then(java.util.OptionalDouble p0)`
- `public default org.assertj.core.api.OptionalIntAssert then(java.util.OptionalInt p0)`
- `public default org.assertj.core.api.OptionalLongAssert then(java.util.OptionalLong p0)`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.SpliteratorAssert then(java.util.Spliterator p0)`
- `public default <RESULT extends java.lang.Object> org.assertj.core.api.CompletableFutureAssert then(java.util.concurrent.CompletableFuture p0)`
- `public default <RESULT extends java.lang.Object> org.assertj.core.api.CompletableFutureAssert then(java.util.concurrent.CompletionStage p0)`
- `public default org.assertj.core.api.LongAdderAssert then(java.util.concurrent.atomic.LongAdder p0)`
- `public default org.assertj.core.api.DoublePredicateAssert then(java.util.function.DoublePredicate p0)`
- `public default org.assertj.core.api.IntPredicateAssert then(java.util.function.IntPredicate p0)`
- `public default org.assertj.core.api.LongPredicateAssert then(java.util.function.LongPredicate p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.PredicateAssert then(java.util.function.Predicate p0)`
- `public default org.assertj.core.api.MatcherAssert then(java.util.regex.Matcher p0)`
- `public default org.assertj.core.api.AbstractListAssert then(java.util.stream.DoubleStream p0)`
- `public default org.assertj.core.api.AbstractListAssert then(java.util.stream.IntStream p0)`
- `public default org.assertj.core.api.AbstractListAssert then(java.util.stream.LongStream p0)`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.AbstractListAssert then(java.util.stream.Stream p0)`
- `public default org.assertj.core.api.AbstractPathAssert thenPath(java.nio.file.Path p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.PredicateAssert thenPredicate(java.util.function.Predicate p0)`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.ListAssert thenStream(java.util.stream.Stream p0)`

---

## public class `org.assertj.core.api.BigDecimalAssert`
extends `org.assertj.core.api.AbstractBigDecimalAssert`  

**Constructors:**
- `public BigDecimalAssert(java.math.BigDecimal p0)`

---

## public class `org.assertj.core.api.BigDecimalScaleAssert`<T extends java.lang.Object>
extends `org.assertj.core.api.AbstractBigDecimalScaleAssert`  

**Constructors:**
- `public BigDecimalScaleAssert(org.assertj.core.api.AbstractBigDecimalAssert p0)`

**Methods:**
- `public org.assertj.core.api.AbstractBigDecimalAssert returnToBigDecimal()`

---

## public class `org.assertj.core.api.BigIntegerAssert`
extends `org.assertj.core.api.AbstractBigIntegerAssert`  

**Constructors:**
- `public BigIntegerAssert(java.math.BigInteger p0)`

---

## public class `org.assertj.core.api.Boolean2DArrayAssert`
extends `org.assertj.core.api.Abstract2DArrayAssert`  

**Constructors:**
- `public Boolean2DArrayAssert(boolean[][] p0)`

**Fields:**
- `protected org.assertj.core.internal.Boolean2DArrays boolean2dArrays`

**Methods:**
- `public org.assertj.core.api.Boolean2DArrayAssert contains(boolean[] p0, org.assertj.core.data.Index p1)`
- `public org.assertj.core.api.Boolean2DArrayAssert doesNotContain(boolean[] p0, org.assertj.core.data.Index p1)`
- `public org.assertj.core.api.Boolean2DArrayAssert hasDimensions(int p0, int p1)`
- `public org.assertj.core.api.Boolean2DArrayAssert hasNumberOfRows(int p0)`
- `public org.assertj.core.api.Boolean2DArrayAssert hasSameDimensionsAs(java.lang.Object p0)`
- `public org.assertj.core.api.Boolean2DArrayAssert isDeepEqualTo(boolean[][] p0)`
- `public void isEmpty()`
- `public org.assertj.core.api.Boolean2DArrayAssert isEqualTo(java.lang.Object p0)`
- `public org.assertj.core.api.Boolean2DArrayAssert isNotEmpty()`
- `public void isNullOrEmpty()`

---

## public class `org.assertj.core.api.BooleanArrayAssert`
extends `org.assertj.core.api.AbstractBooleanArrayAssert`  

**Constructors:**
- `public BooleanArrayAssert(boolean[] p0)`

---

## public class `org.assertj.core.api.BooleanAssert`
extends `org.assertj.core.api.AbstractBooleanAssert`  

**Constructors:**
- `public BooleanAssert(java.lang.Boolean p0)`
- `public BooleanAssert(java.util.concurrent.atomic.AtomicBoolean p0)`

---

## public class `org.assertj.core.api.Byte2DArrayAssert`
extends `org.assertj.core.api.Abstract2DArrayAssert`  

**Constructors:**
- `public Byte2DArrayAssert(byte[][] p0)`

**Fields:**
- `protected org.assertj.core.internal.Byte2DArrays byte2dArrays`

**Methods:**
- `public org.assertj.core.api.Byte2DArrayAssert contains(byte[] p0, org.assertj.core.data.Index p1)`
- `public org.assertj.core.api.Byte2DArrayAssert doesNotContain(byte[] p0, org.assertj.core.data.Index p1)`
- `public org.assertj.core.api.Byte2DArrayAssert hasDimensions(int p0, int p1)`
- `public org.assertj.core.api.Byte2DArrayAssert hasNumberOfRows(int p0)`
- `public org.assertj.core.api.Byte2DArrayAssert hasSameDimensionsAs(java.lang.Object p0)`
- `public org.assertj.core.api.Byte2DArrayAssert isDeepEqualTo(byte[][] p0)`
- `public void isEmpty()`
- `public org.assertj.core.api.Byte2DArrayAssert isEqualTo(java.lang.Object p0)`
- `public org.assertj.core.api.Byte2DArrayAssert isNotEmpty()`
- `public void isNullOrEmpty()`

---

## public class `org.assertj.core.api.ByteArrayAssert`
extends `org.assertj.core.api.AbstractByteArrayAssert`  

**Constructors:**
- `public ByteArrayAssert(byte[] p0)`

---

## public class `org.assertj.core.api.ByteAssert`
extends `org.assertj.core.api.AbstractByteAssert`  

**Constructors:**
- `public ByteAssert(java.lang.Byte p0)`

---

## public class `org.assertj.core.api.Char2DArrayAssert`
extends `org.assertj.core.api.Abstract2DArrayAssert`  

**Constructors:**
- `public Char2DArrayAssert(char[][] p0)`

**Fields:**
- `protected org.assertj.core.internal.Char2DArrays char2dArrays`

**Methods:**
- `public org.assertj.core.api.Char2DArrayAssert contains(char[] p0, org.assertj.core.data.Index p1)`
- `public org.assertj.core.api.Char2DArrayAssert doesNotContain(char[] p0, org.assertj.core.data.Index p1)`
- `public org.assertj.core.api.Char2DArrayAssert hasDimensions(int p0, int p1)`
- `public org.assertj.core.api.Char2DArrayAssert hasNumberOfRows(int p0)`
- `public org.assertj.core.api.Char2DArrayAssert hasSameDimensionsAs(java.lang.Object p0)`
- `public org.assertj.core.api.Char2DArrayAssert inUnicode()`
- `public org.assertj.core.api.Char2DArrayAssert isDeepEqualTo(char[][] p0)`
- `public void isEmpty()`
- `public org.assertj.core.api.Char2DArrayAssert isEqualTo(java.lang.Object p0)`
- `public org.assertj.core.api.Char2DArrayAssert isNotEmpty()`
- `public void isNullOrEmpty()`

---

## public class `org.assertj.core.api.CharArrayAssert`
extends `org.assertj.core.api.AbstractCharArrayAssert`  

**Constructors:**
- `public CharArrayAssert(char[] p0)`

---

## public class `org.assertj.core.api.CharSequenceAssert`
extends `org.assertj.core.api.AbstractCharSequenceAssert`  

**Constructors:**
- `public CharSequenceAssert(java.lang.CharSequence p0)`

**Methods:**
- `public static org.assertj.core.api.AbstractCharSequenceAssert assertThatCharSequence(java.lang.CharSequence p0)`

---

## public class `org.assertj.core.api.CharacterAssert`
extends `org.assertj.core.api.AbstractCharacterAssert`  

**Constructors:**
- `public CharacterAssert(char p0)`
- `public CharacterAssert(java.lang.Character p0)`

---

## public class `org.assertj.core.api.ClassAssert`
extends `org.assertj.core.api.AbstractClassAssert`  

**Constructors:**
- `public ClassAssert(java.lang.Class p0)`

---

## public class `org.assertj.core.api.ClassBasedNavigableIterableAssert`<SELF extends org.assertj.core.api.ClassBasedNavigableIterableAssert<SELF, ACTUAL, ELEMENT, ELEMENT_ASSERT>, ACTUAL extends java.lang.Iterable<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>>
extends `org.assertj.core.api.AbstractIterableAssert`  

**Constructors:**
- `public ClassBasedNavigableIterableAssert(ACTUAL p0, java.lang.Class p1, java.lang.Class p2)`

**Methods:**
- `public static <ACTUAL extends java.lang.Iterable<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.ClassBasedNavigableIterableAssert assertThat(ACTUAL p0, java.lang.Class p1)`
- `protected SELF newAbstractIterableAssert(java.lang.Iterable p0)`
- `public ELEMENT_ASSERT toAssert(ELEMENT p0, java.lang.String p1)`

---

## public class `org.assertj.core.api.ClassBasedNavigableListAssert`<SELF extends org.assertj.core.api.ClassBasedNavigableListAssert<SELF, ACTUAL, ELEMENT, ELEMENT_ASSERT>, ACTUAL extends java.util.List<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>>
extends `org.assertj.core.api.AbstractListAssert`  

**Constructors:**
- `public ClassBasedNavigableListAssert(ACTUAL p0, java.lang.Class p1)`

**Methods:**
- `public static <ELEMENT extends java.lang.Object, ACTUAL extends java.util.List<? extends ELEMENT>, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.ClassBasedNavigableListAssert assertThat(java.util.List p0, java.lang.Class p1)`
- `protected SELF newAbstractIterableAssert(java.lang.Iterable p0)`
- `public ELEMENT_ASSERT toAssert(ELEMENT p0, java.lang.String p1)`

---

## public class `org.assertj.core.api.CollectionAssert`<ELEMENT extends java.lang.Object>
extends `org.assertj.core.api.AbstractCollectionAssert`  

**Constructors:**
- `public CollectionAssert(java.util.Collection p0)`

**Methods:**
- `public static <E extends java.lang.Object> org.assertj.core.api.AbstractCollectionAssert assertThatCollection(java.util.Collection p0)`
- `protected org.assertj.core.api.CollectionAssert newAbstractIterableAssert(java.lang.Iterable p0)`
- `protected org.assertj.core.api.ObjectAssert toAssert(ELEMENT p0, java.lang.String p1)`

---

## public abstract interface `org.assertj.core.api.ComparableAssert`<SELF extends org.assertj.core.api.ComparableAssert<SELF, ACTUAL>, ACTUAL extends java.lang.Comparable<? super ACTUAL>>

**Methods:**
- `public abstract SELF isBetween(ACTUAL p0, ACTUAL p1)`
- `public abstract SELF isEqualByComparingTo(ACTUAL p0)`
- `public abstract SELF isGreaterThan(ACTUAL p0)`
- `public abstract SELF isGreaterThanOrEqualTo(ACTUAL p0)`
- `public abstract SELF isLessThan(ACTUAL p0)`
- `public abstract SELF isLessThanOrEqualTo(ACTUAL p0)`
- `public abstract SELF isNotEqualByComparingTo(ACTUAL p0)`
- `public abstract SELF isStrictlyBetween(ACTUAL p0, ACTUAL p1)`

---

## public class `org.assertj.core.api.ComparatorFactory`

**Constructors:**
- `public ComparatorFactory()`

**Fields:**
- `public final static org.assertj.core.api.ComparatorFactory INSTANCE`

**Methods:**
- `public java.util.Comparator doubleComparatorWithPrecision(double p0)`
- `public java.util.Comparator floatComparatorWithPrecision(float p0)`

---

## public class `org.assertj.core.api.CompletableFutureAssert`<RESULT extends java.lang.Object>
extends `org.assertj.core.api.AbstractCompletableFutureAssert`  

**Constructors:**
- `protected CompletableFutureAssert(java.util.concurrent.CompletableFuture p0)`
- `protected CompletableFutureAssert(java.util.concurrent.CompletionStage p0)`

**Methods:**
- `public static <RESULT extends java.lang.Object> org.assertj.core.api.CompletableFutureAssert assertThatCompletionStage(java.util.concurrent.CompletionStage p0)`

---

## public class `org.assertj.core.api.Condition`<T extends java.lang.Object>
implements `org.assertj.core.api.Descriptable<org.assertj.core.api.Condition<T>>`  

**Constructors:**
- `public Condition()`
- `public Condition(java.lang.String p0)`
- `public Condition(java.util.function.Predicate p0, java.lang.String p1, java.lang.Object... p2)`
- `public Condition(org.assertj.core.description.Description p0)`

**Methods:**
- `public org.assertj.core.description.Description conditionDescriptionWithStatus(T p0)`
- `public org.assertj.core.api.Condition describedAs(org.assertj.core.description.Description p0)`
- `public org.assertj.core.description.Description description()`
- `public boolean matches(T p0)`
- `protected org.assertj.core.api.Condition$Status status(T p0)`
- `public java.lang.String toString()`

---

## public final static enum `org.assertj.core.api.Condition$Status`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.assertj.core.api.Condition$Status FAIL`
- `public final static org.assertj.core.api.Condition$Status SUCCESS`
- `public final java.lang.String label`

**Methods:**
- `public java.lang.String toString()`

---

## public class `org.assertj.core.api.DateAssert`
extends `org.assertj.core.api.AbstractDateAssert`  

**Constructors:**
- `public DateAssert(java.util.Date p0)`

---

## public class `org.assertj.core.api.DefaultAssertionErrorCollector`
implements `org.assertj.core.api.AssertionErrorCollector`  

**Constructors:**
- `public DefaultAssertionErrorCollector()`

**Methods:**
- `public java.util.List assertionErrorsCollected()`
- `public void collectAssertionError(java.lang.AssertionError p0)`
- `protected <T extends java.lang.Throwable> java.util.List decorateErrorsCollected(java.util.List p0)`
- `public java.util.Optional getDelegate()`
- `public void setAfterAssertionErrorCollected(org.assertj.core.api.AfterAssertionErrorCollected p0)`
- `public void setDelegate(org.assertj.core.api.AssertionErrorCollector p0)`
- `public void succeeded()`
- `public boolean wasSuccess()`

---

## public abstract interface `org.assertj.core.api.Descriptable`<SELF extends java.lang.Object>

**Methods:**
- `public default SELF as(java.lang.String p0, java.lang.Object... p1)`
- `public default SELF as(java.util.function.Supplier p0)`
- `public default SELF as(org.assertj.core.description.Description p0)`
- `public default SELF describedAs(java.lang.String p0, java.lang.Object... p1)`
- `public abstract SELF describedAs(org.assertj.core.description.Description p0)`

---

## public class `org.assertj.core.api.Double2DArrayAssert`
extends `org.assertj.core.api.Abstract2DArrayAssert`  

**Constructors:**
- `public Double2DArrayAssert(double[][] p0)`

**Fields:**
- `protected org.assertj.core.internal.Double2DArrays double2dArrays`

**Methods:**
- `public org.assertj.core.api.Double2DArrayAssert contains(double[] p0, org.assertj.core.data.Index p1)`
- `public org.assertj.core.api.Double2DArrayAssert doesNotContain(double[] p0, org.assertj.core.data.Index p1)`
- `public org.assertj.core.api.Double2DArrayAssert hasDimensions(int p0, int p1)`
- `public org.assertj.core.api.Double2DArrayAssert hasNumberOfRows(int p0)`
- `public org.assertj.core.api.Double2DArrayAssert hasSameDimensionsAs(java.lang.Object p0)`
- `public org.assertj.core.api.Double2DArrayAssert isDeepEqualTo(double[][] p0)`
- `public void isEmpty()`
- `public org.assertj.core.api.Double2DArrayAssert isEqualTo(java.lang.Object p0)`
- `public org.assertj.core.api.Double2DArrayAssert isNotEmpty()`
- `public void isNullOrEmpty()`

---

## public class `org.assertj.core.api.DoubleArrayAssert`
extends `org.assertj.core.api.AbstractDoubleArrayAssert`  

**Constructors:**
- `public DoubleArrayAssert(double[] p0)`

---

## public class `org.assertj.core.api.DoubleAssert`
extends `org.assertj.core.api.AbstractDoubleAssert`  

**Constructors:**
- `public DoubleAssert(double p0)`
- `public DoubleAssert(java.lang.Double p0)`

---

## public class `org.assertj.core.api.DoublePredicateAssert`
extends `org.assertj.core.api.AbstractPredicateLikeAssert`  

**Constructors:**
- `public DoublePredicateAssert(java.util.function.DoublePredicate p0)`

**Methods:**
- `public org.assertj.core.api.DoublePredicateAssert accepts(double... p0)`
- `public static org.assertj.core.api.DoublePredicateAssert assertThatDoublePredicate(java.util.function.DoublePredicate p0)`
- `public org.assertj.core.api.DoublePredicateAssert rejects(double... p0)`

---

## public class `org.assertj.core.api.DurationAssert`
extends `org.assertj.core.api.AbstractDurationAssert`  

**Constructors:**
- `public DurationAssert(java.time.Duration p0)`

---

## public abstract interface `org.assertj.core.api.EnumerableAssert`<SELF extends org.assertj.core.api.EnumerableAssert<SELF, ELEMENT>, ELEMENT extends java.lang.Object>

**Methods:**
- `public abstract SELF hasSameSizeAs(java.lang.Iterable p0)`
- `public abstract SELF hasSameSizeAs(java.lang.Object p0)`
- `public abstract SELF hasSize(int p0)`
- `public abstract SELF hasSizeBetween(int p0, int p1)`
- `public abstract SELF hasSizeGreaterThan(int p0)`
- `public abstract SELF hasSizeGreaterThanOrEqualTo(int p0)`
- `public abstract SELF hasSizeLessThan(int p0)`
- `public abstract SELF hasSizeLessThanOrEqualTo(int p0)`
- `public abstract void isEmpty()`
- `public abstract SELF isNotEmpty()`
- `public abstract void isNullOrEmpty()`
- `public abstract SELF usingDefaultElementComparator()`
- `public abstract SELF usingElementComparator(java.util.Comparator p0)`

---

## public class `org.assertj.core.api.ErrorCollector`

**Fields:**
- `public final static java.lang.String FIELD_NAME`

**Methods:**
- `public static java.lang.Object intercept(org.assertj.core.api.ErrorCollector p0, java.lang.Object p1, java.util.concurrent.Callable p2, java.lang.reflect.Method p3, java.lang.Object p4) throws java.lang.Exception`

---

## public abstract interface `org.assertj.core.api.ExtensionPoints`<SELF extends org.assertj.core.api.ExtensionPoints<SELF, ACTUAL>, ACTUAL extends java.lang.Object>

**Methods:**
- `public abstract SELF doesNotHave(org.assertj.core.api.Condition p0)`
- `public abstract SELF has(org.assertj.core.api.Condition p0)`
- `public abstract SELF is(org.assertj.core.api.Condition p0)`
- `public abstract SELF isNot(org.assertj.core.api.Condition p0)`
- `public abstract SELF satisfies(org.assertj.core.api.Condition p0)`

---

## public class `org.assertj.core.api.FactoryBasedNavigableIterableAssert`<SELF extends org.assertj.core.api.FactoryBasedNavigableIterableAssert<SELF, ACTUAL, ELEMENT, ELEMENT_ASSERT>, ACTUAL extends java.lang.Iterable<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>>
extends `org.assertj.core.api.AbstractIterableAssert`  

**Constructors:**
- `public FactoryBasedNavigableIterableAssert(ACTUAL p0, java.lang.Class p1, org.assertj.core.api.AssertFactory p2)`

**Methods:**
- `public static <ACTUAL extends java.lang.Iterable<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.FactoryBasedNavigableIterableAssert assertThat(java.lang.Iterable p0, org.assertj.core.api.AssertFactory p1)`
- `protected SELF newAbstractIterableAssert(java.lang.Iterable p0)`
- `public ELEMENT_ASSERT toAssert(ELEMENT p0, java.lang.String p1)`

---

## public class `org.assertj.core.api.FactoryBasedNavigableListAssert`<SELF extends org.assertj.core.api.FactoryBasedNavigableListAssert<SELF, ACTUAL, ELEMENT, ELEMENT_ASSERT>, ACTUAL extends java.util.List<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>>
extends `org.assertj.core.api.AbstractListAssert`  

**Constructors:**
- `public FactoryBasedNavigableListAssert(ACTUAL p0, java.lang.Class p1, org.assertj.core.api.AssertFactory p2)`

**Methods:**
- `public static <ACTUAL extends java.util.List<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.FactoryBasedNavigableListAssert assertThat(java.util.List p0, org.assertj.core.api.AssertFactory p1)`
- `protected SELF newAbstractIterableAssert(java.lang.Iterable p0)`
- `public ELEMENT_ASSERT toAssert(ELEMENT p0, java.lang.String p1)`

---

## public final class `org.assertj.core.api.Fail`

**Methods:**
- `public static <T extends java.lang.Object> T fail(java.lang.String p0)`
- `public static <T extends java.lang.Object> T fail(java.lang.String p0, java.lang.Object... p1)`
- `public static <T extends java.lang.Object> T fail(java.lang.String p0, java.lang.Throwable p1)`
- `public static <T extends java.lang.Object> T failBecauseExceptionWasNotThrown(java.lang.Class p0)`
- `public static void setRemoveAssertJRelatedElementsFromStackTrace(boolean p0)`
- `public static <T extends java.lang.Object> T shouldHaveThrown(java.lang.Class p0)`

---

## public class `org.assertj.core.api.FileAssert`
extends `org.assertj.core.api.AbstractFileAssert`  

**Constructors:**
- `public FileAssert(java.io.File p0)`

---

## public class `org.assertj.core.api.FileSizeAssert`<T extends java.lang.Object>
extends `org.assertj.core.api.AbstractFileSizeAssert`  

**Constructors:**
- `public FileSizeAssert(org.assertj.core.api.AbstractFileAssert p0)`

**Methods:**
- `public org.assertj.core.api.AbstractFileAssert returnToFile()`

---

## public class `org.assertj.core.api.Float2DArrayAssert`
extends `org.assertj.core.api.Abstract2DArrayAssert`  

**Constructors:**
- `public Float2DArrayAssert(float[][] p0)`

**Fields:**
- `protected org.assertj.core.internal.Float2DArrays float2dArrays`

**Methods:**
- `public org.assertj.core.api.Float2DArrayAssert contains(float[] p0, org.assertj.core.data.Index p1)`
- `public org.assertj.core.api.Float2DArrayAssert doesNotContain(float[] p0, org.assertj.core.data.Index p1)`
- `public org.assertj.core.api.Float2DArrayAssert hasDimensions(int p0, int p1)`
- `public org.assertj.core.api.Float2DArrayAssert hasNumberOfRows(int p0)`
- `public org.assertj.core.api.Float2DArrayAssert hasSameDimensionsAs(java.lang.Object p0)`
- `public org.assertj.core.api.Float2DArrayAssert isDeepEqualTo(float[][] p0)`
- `public void isEmpty()`
- `public org.assertj.core.api.Float2DArrayAssert isEqualTo(java.lang.Object p0)`
- `public org.assertj.core.api.Float2DArrayAssert isNotEmpty()`
- `public void isNullOrEmpty()`

---

## public class `org.assertj.core.api.FloatArrayAssert`
extends `org.assertj.core.api.AbstractFloatArrayAssert`  

**Constructors:**
- `public FloatArrayAssert(float[] p0)`

---

## public class `org.assertj.core.api.FloatAssert`
extends `org.assertj.core.api.AbstractFloatAssert`  

**Constructors:**
- `public FloatAssert(float p0)`
- `public FloatAssert(java.lang.Float p0)`

---

## public abstract interface `org.assertj.core.api.FloatingPointNumberAssert`<SELF extends org.assertj.core.api.FloatingPointNumberAssert<SELF, ACTUAL>, ACTUAL extends java.lang.Number>
implements `org.assertj.core.api.NumberAssert<SELF,ACTUAL>`  

**Methods:**
- `public abstract SELF isCloseTo(ACTUAL p0, org.assertj.core.data.Offset p1)`
- `public abstract SELF isEqualTo(ACTUAL p0, org.assertj.core.data.Offset p1)`
- `public abstract SELF isFinite()`
- `public abstract SELF isInfinite()`
- `public abstract SELF isNaN()`
- `public abstract SELF isNotCloseTo(ACTUAL p0, org.assertj.core.data.Offset p1)`
- `public abstract SELF isNotFinite()`
- `public abstract SELF isNotInfinite()`
- `public abstract SELF isNotNaN()`

---

## public class `org.assertj.core.api.FutureAssert`<RESULT extends java.lang.Object>
extends `org.assertj.core.api.AbstractFutureAssert`  

**Constructors:**
- `protected FutureAssert(java.util.concurrent.Future p0)`

---

## public class `org.assertj.core.api.GenericComparableAssert`<ACTUAL extends java.lang.Comparable<? super ACTUAL>>
extends `org.assertj.core.api.AbstractComparableAssert`  

**Constructors:**
- `public GenericComparableAssert(ACTUAL p0)`

---

## public class `org.assertj.core.api.HamcrestCondition`<T extends java.lang.Object>
extends `org.assertj.core.api.Condition`  

**Constructors:**
- `public HamcrestCondition(org.hamcrest.Matcher p0)`

**Methods:**
- `public boolean matches(T p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.HamcrestCondition matching(org.hamcrest.Matcher p0)`

---

## public abstract interface `org.assertj.core.api.IndexedObjectEnumerableAssert`<SELF extends org.assertj.core.api.IndexedObjectEnumerableAssert<SELF, ELEMENT>, ELEMENT extends java.lang.Object>
implements `org.assertj.core.api.ObjectEnumerableAssert<SELF,ELEMENT>`  

**Methods:**
- `public abstract SELF contains(ELEMENT p0, org.assertj.core.data.Index p1)`
- `public abstract SELF doesNotContain(ELEMENT p0, org.assertj.core.data.Index p1)`

---

## public class `org.assertj.core.api.InputStreamAssert`
extends `org.assertj.core.api.AbstractInputStreamAssert`  

**Constructors:**
- `public InputStreamAssert(java.io.InputStream p0)`

---

## public abstract interface `org.assertj.core.api.InstanceOfAssertFactories`

**Fields:**
- `public final static org.assertj.core.api.InstanceOfAssertFactory ARRAY`
- `public final static org.assertj.core.api.InstanceOfAssertFactory ARRAY_2D`
- `public final static org.assertj.core.api.InstanceOfAssertFactory ATOMIC_BOOLEAN`
- `public final static org.assertj.core.api.InstanceOfAssertFactory ATOMIC_INTEGER`
- `public final static org.assertj.core.api.InstanceOfAssertFactory ATOMIC_INTEGER_ARRAY`
- `public final static org.assertj.core.api.InstanceOfAssertFactory ATOMIC_INTEGER_FIELD_UPDATER`
- `public final static org.assertj.core.api.InstanceOfAssertFactory ATOMIC_LONG`
- `public final static org.assertj.core.api.InstanceOfAssertFactory ATOMIC_LONG_ARRAY`
- `public final static org.assertj.core.api.InstanceOfAssertFactory ATOMIC_LONG_FIELD_UPDATER`
- `public final static org.assertj.core.api.InstanceOfAssertFactory ATOMIC_MARKABLE_REFERENCE`
- `public final static org.assertj.core.api.InstanceOfAssertFactory ATOMIC_REFERENCE`
- `public final static org.assertj.core.api.InstanceOfAssertFactory ATOMIC_REFERENCE_ARRAY`
- `public final static org.assertj.core.api.InstanceOfAssertFactory ATOMIC_REFERENCE_FIELD_UPDATER`
- `public final static org.assertj.core.api.InstanceOfAssertFactory ATOMIC_STAMPED_REFERENCE`
- `public final static org.assertj.core.api.InstanceOfAssertFactory BIG_DECIMAL`
- `public final static org.assertj.core.api.InstanceOfAssertFactory BIG_INTEGER`
- `public final static org.assertj.core.api.InstanceOfAssertFactory BOOLEAN`
- `public final static org.assertj.core.api.InstanceOfAssertFactory BOOLEAN_2D_ARRAY`
- `public final static org.assertj.core.api.InstanceOfAssertFactory BOOLEAN_ARRAY`
- `public final static org.assertj.core.api.InstanceOfAssertFactory BYTE`
- `public final static org.assertj.core.api.InstanceOfAssertFactory BYTE_2D_ARRAY`
- `public final static org.assertj.core.api.InstanceOfAssertFactory BYTE_ARRAY`
- `public final static org.assertj.core.api.InstanceOfAssertFactory CHARACTER`
- `public final static org.assertj.core.api.InstanceOfAssertFactory CHAR_2D_ARRAY`
- `public final static org.assertj.core.api.InstanceOfAssertFactory CHAR_ARRAY`
- `public final static org.assertj.core.api.InstanceOfAssertFactory CHAR_SEQUENCE`
- `public final static org.assertj.core.api.InstanceOfAssertFactory CLASS`
- `public final static org.assertj.core.api.InstanceOfAssertFactory COLLECTION`
- `public final static org.assertj.core.api.InstanceOfAssertFactory COMPLETABLE_FUTURE`
- `public final static org.assertj.core.api.InstanceOfAssertFactory COMPLETION_STAGE`
- `public final static org.assertj.core.api.InstanceOfAssertFactory DATE`
- `public final static org.assertj.core.api.InstanceOfAssertFactory DOUBLE`
- `public final static org.assertj.core.api.InstanceOfAssertFactory DOUBLE_2D_ARRAY`
- `public final static org.assertj.core.api.InstanceOfAssertFactory DOUBLE_ARRAY`
- `public final static org.assertj.core.api.InstanceOfAssertFactory DOUBLE_PREDICATE`
- `public final static org.assertj.core.api.InstanceOfAssertFactory DOUBLE_STREAM`
- `public final static org.assertj.core.api.InstanceOfAssertFactory DURATION`
- `public final static org.assertj.core.api.InstanceOfAssertFactory FILE`
- `public final static org.assertj.core.api.InstanceOfAssertFactory FLOAT`
- `public final static org.assertj.core.api.InstanceOfAssertFactory FLOAT_2D_ARRAY`
- `public final static org.assertj.core.api.InstanceOfAssertFactory FLOAT_ARRAY`
- `public final static org.assertj.core.api.InstanceOfAssertFactory FUTURE`
- `public final static org.assertj.core.api.InstanceOfAssertFactory INPUT_STREAM`
- `public final static org.assertj.core.api.InstanceOfAssertFactory INSTANT`
- `public final static org.assertj.core.api.InstanceOfAssertFactory INTEGER`
- `public final static org.assertj.core.api.InstanceOfAssertFactory INT_2D_ARRAY`
- `public final static org.assertj.core.api.InstanceOfAssertFactory INT_ARRAY`
- `public final static org.assertj.core.api.InstanceOfAssertFactory INT_PREDICATE`
- `public final static org.assertj.core.api.InstanceOfAssertFactory INT_STREAM`
- `public final static org.assertj.core.api.InstanceOfAssertFactory ITERABLE`
- `public final static org.assertj.core.api.InstanceOfAssertFactory ITERATOR`
- `public final static org.assertj.core.api.InstanceOfAssertFactory LIST`
- `public final static org.assertj.core.api.InstanceOfAssertFactory LOCAL_DATE`
- `public final static org.assertj.core.api.InstanceOfAssertFactory LOCAL_DATE_TIME`
- `public final static org.assertj.core.api.InstanceOfAssertFactory LOCAL_TIME`
- `public final static org.assertj.core.api.InstanceOfAssertFactory LONG`
- `public final static org.assertj.core.api.InstanceOfAssertFactory LONG_2D_ARRAY`
- `public final static org.assertj.core.api.InstanceOfAssertFactory LONG_ADDER`
- `public final static org.assertj.core.api.InstanceOfAssertFactory LONG_ARRAY`
- `public final static org.assertj.core.api.InstanceOfAssertFactory LONG_PREDICATE`
- `public final static org.assertj.core.api.InstanceOfAssertFactory LONG_STREAM`
- `public final static org.assertj.core.api.InstanceOfAssertFactory MAP`
- `public final static org.assertj.core.api.InstanceOfAssertFactory MATCHER`
- `public final static org.assertj.core.api.InstanceOfAssertFactory OFFSET_DATE_TIME`
- `public final static org.assertj.core.api.InstanceOfAssertFactory OFFSET_TIME`
- `public final static org.assertj.core.api.InstanceOfAssertFactory OPTIONAL`
- `public final static org.assertj.core.api.InstanceOfAssertFactory OPTIONAL_DOUBLE`
- `public final static org.assertj.core.api.InstanceOfAssertFactory OPTIONAL_INT`
- `public final static org.assertj.core.api.InstanceOfAssertFactory OPTIONAL_LONG`
- `public final static org.assertj.core.api.InstanceOfAssertFactory PATH`
- `public final static org.assertj.core.api.InstanceOfAssertFactory PERIOD`
- `public final static org.assertj.core.api.InstanceOfAssertFactory PREDICATE`
- `public final static org.assertj.core.api.InstanceOfAssertFactory SHORT`
- `public final static org.assertj.core.api.InstanceOfAssertFactory SHORT_2D_ARRAY`
- `public final static org.assertj.core.api.InstanceOfAssertFactory SHORT_ARRAY`
- `public final static org.assertj.core.api.InstanceOfAssertFactory SPLITERATOR`
- `public final static org.assertj.core.api.InstanceOfAssertFactory STREAM`
- `public final static org.assertj.core.api.InstanceOfAssertFactory STRING`
- `public final static org.assertj.core.api.InstanceOfAssertFactory STRING_BUFFER`
- `public final static org.assertj.core.api.InstanceOfAssertFactory STRING_BUILDER`
- `public final static org.assertj.core.api.InstanceOfAssertFactory THROWABLE`
- `public final static org.assertj.core.api.InstanceOfAssertFactory URI_TYPE`
- `public final static org.assertj.core.api.InstanceOfAssertFactory URL_TYPE`
- `public final static org.assertj.core.api.InstanceOfAssertFactory ZONED_DATE_TIME`

**Methods:**
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.InstanceOfAssertFactory array(java.lang.Class p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.InstanceOfAssertFactory array2D(java.lang.Class p0)`
- `public static <OBJECT extends java.lang.Object> org.assertj.core.api.InstanceOfAssertFactory atomicIntegerFieldUpdater(java.lang.Class p0)`
- `public static <OBJECT extends java.lang.Object> org.assertj.core.api.InstanceOfAssertFactory atomicLongFieldUpdater(java.lang.Class p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.InstanceOfAssertFactory atomicMarkableReference(java.lang.Class p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.InstanceOfAssertFactory atomicReference(java.lang.Class p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.InstanceOfAssertFactory atomicReferenceArray(java.lang.Class p0)`
- `public static <FIELD extends java.lang.Object, OBJECT extends java.lang.Object> org.assertj.core.api.InstanceOfAssertFactory atomicReferenceFieldUpdater(java.lang.Class p0, java.lang.Class p1)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.InstanceOfAssertFactory atomicStampedReference(java.lang.Class p0)`
- `public static <E extends java.lang.Object> org.assertj.core.api.InstanceOfAssertFactory collection(java.lang.Class p0)`
- `public static <T extends java.lang.Comparable<? super T>> org.assertj.core.api.InstanceOfAssertFactory comparable(java.lang.Class p0)`
- `public static <RESULT extends java.lang.Object> org.assertj.core.api.InstanceOfAssertFactory completableFuture(java.lang.Class p0)`
- `public static <RESULT extends java.lang.Object> org.assertj.core.api.InstanceOfAssertFactory completionStage(java.lang.Class p0)`
- `public static <RESULT extends java.lang.Object> org.assertj.core.api.InstanceOfAssertFactory future(java.lang.Class p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.InstanceOfAssertFactory iterable(java.lang.Class p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.InstanceOfAssertFactory iterator(java.lang.Class p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.InstanceOfAssertFactory list(java.lang.Class p0)`
- `public static <K extends java.lang.Object, V extends java.lang.Object> org.assertj.core.api.InstanceOfAssertFactory map(java.lang.Class p0, java.lang.Class p1)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.InstanceOfAssertFactory optional(java.lang.Class p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.InstanceOfAssertFactory predicate(java.lang.Class p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.InstanceOfAssertFactory spliterator(java.lang.Class p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.InstanceOfAssertFactory stream(java.lang.Class p0)`
- `public static <T extends java.lang.Throwable> org.assertj.core.api.InstanceOfAssertFactory throwable(java.lang.Class p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.InstanceOfAssertFactory type(java.lang.Class p0)`

---

## public class `org.assertj.core.api.InstanceOfAssertFactory`<T extends java.lang.Object, ASSERT extends org.assertj.core.api.AbstractAssert<? extends java.lang.Object, ? extends java.lang.Object>>
implements `org.assertj.core.api.AssertFactory<java.lang.Object,ASSERT>`  

**Constructors:**
- `public InstanceOfAssertFactory(java.lang.Class p0, org.assertj.core.api.AssertFactory p1)`

**Methods:**
- `public ASSERT createAssert(java.lang.Object p0)`
- `public java.lang.String toString()`

---

## public class `org.assertj.core.api.InstantAssert`
extends `org.assertj.core.api.AbstractInstantAssert`  

**Constructors:**
- `public InstantAssert(java.time.Instant p0)`

---

## public class `org.assertj.core.api.Int2DArrayAssert`
extends `org.assertj.core.api.Abstract2DArrayAssert`  

**Constructors:**
- `public Int2DArrayAssert(int[][] p0)`

**Fields:**
- `protected org.assertj.core.internal.Int2DArrays int2dArrays`

**Methods:**
- `public org.assertj.core.api.Int2DArrayAssert contains(int[] p0, org.assertj.core.data.Index p1)`
- `public org.assertj.core.api.Int2DArrayAssert doesNotContain(int[] p0, org.assertj.core.data.Index p1)`
- `public org.assertj.core.api.Int2DArrayAssert hasDimensions(int p0, int p1)`
- `public org.assertj.core.api.Int2DArrayAssert hasNumberOfRows(int p0)`
- `public org.assertj.core.api.Int2DArrayAssert hasSameDimensionsAs(java.lang.Object p0)`
- `public org.assertj.core.api.Int2DArrayAssert isDeepEqualTo(int[][] p0)`
- `public void isEmpty()`
- `public org.assertj.core.api.Int2DArrayAssert isEqualTo(java.lang.Object p0)`
- `public org.assertj.core.api.Int2DArrayAssert isNotEmpty()`
- `public void isNullOrEmpty()`

---

## public class `org.assertj.core.api.IntArrayAssert`
extends `org.assertj.core.api.AbstractIntArrayAssert`  

**Constructors:**
- `public IntArrayAssert(int[] p0)`
- `public IntArrayAssert(java.util.concurrent.atomic.AtomicIntegerArray p0)`

---

## public class `org.assertj.core.api.IntPredicateAssert`
extends `org.assertj.core.api.AbstractPredicateLikeAssert`  

**Constructors:**
- `public IntPredicateAssert(java.util.function.IntPredicate p0)`

**Methods:**
- `public org.assertj.core.api.IntPredicateAssert accepts(int... p0)`
- `public static org.assertj.core.api.IntPredicateAssert assertThatIntPredicate(java.util.function.IntPredicate p0)`
- `public org.assertj.core.api.IntPredicateAssert rejects(int... p0)`

---

## public class `org.assertj.core.api.IntegerAssert`
extends `org.assertj.core.api.AbstractIntegerAssert`  

**Constructors:**
- `public IntegerAssert(java.lang.Integer p0)`
- `public IntegerAssert(java.util.concurrent.atomic.AtomicInteger p0)`

---

## public class `org.assertj.core.api.IterableAssert`<ELEMENT extends java.lang.Object>
extends `org.assertj.core.api.FactoryBasedNavigableIterableAssert`  

**Constructors:**
- `public IterableAssert(java.lang.Iterable p0)`

**Methods:**
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.IterableAssert assertThatIterable(java.lang.Iterable p0)`
- `protected org.assertj.core.api.IterableAssert newAbstractIterableAssert(java.lang.Iterable p0)`

---

## public class `org.assertj.core.api.IterableSizeAssert`<T extends java.lang.Object>
extends `org.assertj.core.api.AbstractIterableSizeAssert`  

**Constructors:**
- `public IterableSizeAssert(org.assertj.core.api.AbstractIterableAssert p0, java.lang.Integer p1)`

**Methods:**
- `public org.assertj.core.api.AbstractIterableAssert returnToIterable()`

---

## public class `org.assertj.core.api.IteratorAssert`<ELEMENT extends java.lang.Object>
extends `org.assertj.core.api.AbstractIteratorAssert`  

**Constructors:**
- `public IteratorAssert(java.util.Iterator p0)`

**Methods:**
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.IteratorAssert assertThatIterator(java.util.Iterator p0)`

---

## public class `org.assertj.core.api.JUnitBDDSoftAssertions`
extends `org.assertj.core.api.AbstractSoftAssertions`  
implements `org.assertj.core.api.BDDSoftAssertionsProvider`, `org.assertj.core.api.SoftAssertionsRule`  

**Constructors:**
- `public JUnitBDDSoftAssertions()`

---

## public class `org.assertj.core.api.JUnitJupiterBDDSoftAssertions`
annotations: @java.lang.Deprecated  
extends `org.assertj.core.api.AbstractSoftAssertions`  
implements `org.assertj.core.api.BDDSoftAssertionsProvider`, `org.junit.jupiter.api.extension.AfterEachCallback`  

**Constructors:**
- `public JUnitJupiterBDDSoftAssertions()`

**Methods:**
- `public void afterEach(org.junit.jupiter.api.extension.ExtensionContext p0)`

---

## public class `org.assertj.core.api.JUnitJupiterSoftAssertions`
annotations: @java.lang.Deprecated  
extends `org.assertj.core.api.AbstractSoftAssertions`  
implements `org.assertj.core.api.StandardSoftAssertionsProvider`, `org.junit.jupiter.api.extension.AfterEachCallback`  

**Constructors:**
- `public JUnitJupiterSoftAssertions()`

**Methods:**
- `public void afterEach(org.junit.jupiter.api.extension.ExtensionContext p0)`

---

## public class `org.assertj.core.api.JUnitSoftAssertions`
extends `org.assertj.core.api.AbstractSoftAssertions`  
implements `org.assertj.core.api.SoftAssertionsRule`, `org.assertj.core.api.StandardSoftAssertionsProvider`  

**Constructors:**
- `public JUnitSoftAssertions()`

---

## public class `org.assertj.core.api.Java6Assertions`
annotations: @java.lang.Deprecated, @org.assertj.core.util.CheckReturnValue  

**Constructors:**
- `protected Java6Assertions()`

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.api.Condition allOf(java.lang.Iterable p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.Condition allOf(org.assertj.core.api.Condition... p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.Condition anyOf(java.lang.Iterable p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.Condition anyOf(org.assertj.core.api.Condition... p0)`
- `public static <ACTUAL extends java.lang.Iterable<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.ClassBasedNavigableIterableAssert assertThat(ACTUAL p0, java.lang.Class p1)`
- `public static <T extends java.lang.Comparable<? super T>> org.assertj.core.api.AbstractComparableAssert assertThat(T p0)`
- `public static <T extends org.assertj.core.api.AssertDelegateTarget> T assertThat(T p0)`
- `public static <T extends java.lang.Throwable> org.assertj.core.api.AbstractThrowableAssert assertThat(T p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.AbstractObjectAssert assertThat(T p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.AbstractObjectArrayAssert assertThat(T[] p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.Object2DArrayAssert assertThat(T[][] p0)`
- `public static org.assertj.core.api.AbstractBooleanAssert assertThat(boolean p0)`
- `public static org.assertj.core.api.AbstractBooleanArrayAssert assertThat(boolean[] p0)`
- `public static org.assertj.core.api.Boolean2DArrayAssert assertThat(boolean[][] p0)`
- `public static org.assertj.core.api.AbstractByteAssert assertThat(byte p0)`
- `public static org.assertj.core.api.AbstractByteArrayAssert assertThat(byte[] p0)`
- `public static org.assertj.core.api.Byte2DArrayAssert assertThat(byte[][] p0)`
- `public static org.assertj.core.api.AbstractCharacterAssert assertThat(char p0)`
- `public static org.assertj.core.api.AbstractCharArrayAssert assertThat(char[] p0)`
- `public static org.assertj.core.api.Char2DArrayAssert assertThat(char[][] p0)`
- `public static org.assertj.core.api.AbstractDoubleAssert assertThat(double p0)`
- `public static org.assertj.core.api.AbstractDoubleArrayAssert assertThat(double[] p0)`
- `public static org.assertj.core.api.Double2DArrayAssert assertThat(double[][] p0)`
- `public static org.assertj.core.api.AbstractFloatAssert assertThat(float p0)`
- `public static org.assertj.core.api.AbstractFloatArrayAssert assertThat(float[] p0)`
- `public static org.assertj.core.api.Float2DArrayAssert assertThat(float[][] p0)`
- `public static org.assertj.core.api.AbstractIntegerAssert assertThat(int p0)`
- `public static org.assertj.core.api.AbstractIntArrayAssert assertThat(int[] p0)`
- `public static org.assertj.core.api.Int2DArrayAssert assertThat(int[][] p0)`
- `public static org.assertj.core.api.AbstractFileAssert assertThat(java.io.File p0)`
- `public static org.assertj.core.api.AbstractInputStreamAssert assertThat(java.io.InputStream p0)`
- `public static org.assertj.core.api.AbstractBooleanAssert assertThat(java.lang.Boolean p0)`
- `public static org.assertj.core.api.AbstractByteAssert assertThat(java.lang.Byte p0)`
- `public static org.assertj.core.api.AbstractCharSequenceAssert assertThat(java.lang.CharSequence p0)`
- `public static org.assertj.core.api.AbstractCharacterAssert assertThat(java.lang.Character p0)`
- `public static org.assertj.core.api.AbstractClassAssert assertThat(java.lang.Class p0)`
- `public static org.assertj.core.api.AbstractDoubleAssert assertThat(java.lang.Double p0)`
- `public static org.assertj.core.api.AbstractFloatAssert assertThat(java.lang.Float p0)`
- `public static org.assertj.core.api.AbstractIntegerAssert assertThat(java.lang.Integer p0)`
- `public static <ACTUAL extends java.lang.Iterable<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.FactoryBasedNavigableIterableAssert assertThat(java.lang.Iterable p0, org.assertj.core.api.AssertFactory p1)`
- `public static <T extends java.lang.Object> org.assertj.core.api.AbstractIterableAssert assertThat(java.lang.Iterable p0)`
- `public static org.assertj.core.api.AbstractLongAssert assertThat(java.lang.Long p0)`
- `public static org.assertj.core.api.AbstractShortAssert assertThat(java.lang.Short p0)`
- `public static org.assertj.core.api.AbstractStringAssert assertThat(java.lang.String p0)`
- `public static org.assertj.core.api.AbstractCharSequenceAssert assertThat(java.lang.StringBuffer p0)`
- `public static org.assertj.core.api.AbstractCharSequenceAssert assertThat(java.lang.StringBuilder p0)`
- `public static org.assertj.core.api.AbstractBigDecimalAssert assertThat(java.math.BigDecimal p0)`
- `public static org.assertj.core.api.AbstractBigIntegerAssert assertThat(java.math.BigInteger p0)`
- `public static org.assertj.core.api.AbstractUriAssert assertThat(java.net.URI p0)`
- `public static org.assertj.core.api.AbstractUrlAssert assertThat(java.net.URL p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.AbstractCollectionAssert assertThat(java.util.Collection p0)`
- `public static org.assertj.core.api.AbstractDateAssert assertThat(java.util.Date p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.AbstractIteratorAssert assertThat(java.util.Iterator p0)`
- `public static <ELEMENT extends java.lang.Object, ACTUAL extends java.util.List<? extends ELEMENT>, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.ClassBasedNavigableListAssert assertThat(java.util.List p0, java.lang.Class p1)`
- `public static <ACTUAL extends java.util.List<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.FactoryBasedNavigableListAssert assertThat(java.util.List p0, org.assertj.core.api.AssertFactory p1)`
- `public static <T extends java.lang.Object> org.assertj.core.api.AbstractListAssert assertThat(java.util.List p0)`
- `public static <K extends java.lang.Object, V extends java.lang.Object> org.assertj.core.api.MapAssert assertThat(java.util.Map p0)`
- `public static <RESULT extends java.lang.Object> org.assertj.core.api.AbstractFutureAssert assertThat(java.util.concurrent.Future p0)`
- `public static org.assertj.core.api.AtomicBooleanAssert assertThat(java.util.concurrent.atomic.AtomicBoolean p0)`
- `public static org.assertj.core.api.AtomicIntegerAssert assertThat(java.util.concurrent.atomic.AtomicInteger p0)`
- `public static org.assertj.core.api.AtomicIntegerArrayAssert assertThat(java.util.concurrent.atomic.AtomicIntegerArray p0)`
- `public static <OBJECT extends java.lang.Object> org.assertj.core.api.AtomicIntegerFieldUpdaterAssert assertThat(java.util.concurrent.atomic.AtomicIntegerFieldUpdater p0)`
- `public static org.assertj.core.api.AtomicLongAssert assertThat(java.util.concurrent.atomic.AtomicLong p0)`
- `public static org.assertj.core.api.AtomicLongArrayAssert assertThat(java.util.concurrent.atomic.AtomicLongArray p0)`
- `public static <OBJECT extends java.lang.Object> org.assertj.core.api.AtomicLongFieldUpdaterAssert assertThat(java.util.concurrent.atomic.AtomicLongFieldUpdater p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.AtomicMarkableReferenceAssert assertThat(java.util.concurrent.atomic.AtomicMarkableReference p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.AtomicReferenceAssert assertThat(java.util.concurrent.atomic.AtomicReference p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.AtomicReferenceArrayAssert assertThat(java.util.concurrent.atomic.AtomicReferenceArray p0)`
- `public static <FIELD extends java.lang.Object, OBJECT extends java.lang.Object> org.assertj.core.api.AtomicReferenceFieldUpdaterAssert assertThat(java.util.concurrent.atomic.AtomicReferenceFieldUpdater p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.AtomicStampedReferenceAssert assertThat(java.util.concurrent.atomic.AtomicStampedReference p0)`
- `public static org.assertj.core.api.AbstractLongAssert assertThat(long p0)`
- `public static org.assertj.core.api.AbstractLongArrayAssert assertThat(long[] p0)`
- `public static org.assertj.core.api.Long2DArrayAssert assertThat(long[][] p0)`
- `public static <T extends java.lang.Object> T assertThat(org.assertj.core.api.AssertProvider p0)`
- `public static org.assertj.core.api.AbstractShortAssert assertThat(short p0)`
- `public static org.assertj.core.api.AbstractShortArrayAssert assertThat(short[] p0)`
- `public static org.assertj.core.api.Short2DArrayAssert assertThat(short[][] p0)`
- `public static org.assertj.core.api.AbstractThrowableAssert assertThatCode(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public <T extends java.lang.Object> org.assertj.core.api.AbstractObjectAssert assertThatObject(T p0)`
- `public static org.assertj.core.api.AbstractThrowableAssert assertThatThrownBy(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static org.assertj.core.api.AbstractThrowableAssert assertThatThrownBy(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0, java.lang.String p1, java.lang.Object... p2)`
- `public static org.assertj.core.data.Index atIndex(int p0)`
- `public static org.assertj.core.data.Offset byLessThan(java.lang.Byte p0)`
- `public static org.assertj.core.data.Offset byLessThan(java.lang.Double p0)`
- `public static org.assertj.core.data.Offset byLessThan(java.lang.Float p0)`
- `public static org.assertj.core.data.Offset byLessThan(java.lang.Integer p0)`
- `public static org.assertj.core.data.Offset byLessThan(java.lang.Long p0)`
- `public static org.assertj.core.data.Offset byLessThan(java.lang.Short p0)`
- `public static org.assertj.core.data.Offset byLessThan(java.math.BigDecimal p0)`
- `public static org.assertj.core.data.Offset byLessThan(java.math.BigInteger p0)`
- `public static java.lang.Throwable catchThrowable(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static <THROWABLE extends java.lang.Throwable> THROWABLE catchThrowableOfType(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0, java.lang.Class p1)`
- `public static java.lang.String contentOf(java.io.File p0)`
- `public static java.lang.String contentOf(java.io.File p0, java.lang.String p1)`
- `public static java.lang.String contentOf(java.io.File p0, java.nio.charset.Charset p1)`
- `public static java.lang.String contentOf(java.net.URL p0)`
- `public static java.lang.String contentOf(java.net.URL p0, java.lang.String p1)`
- `public static java.lang.String contentOf(java.net.URL p0, java.nio.charset.Charset p1)`
- `public static <T extends java.lang.Object> org.assertj.core.condition.DoesNotHave doesNotHave(org.assertj.core.api.Condition p0)`
- `public static <K extends java.lang.Object, V extends java.lang.Object> org.assertj.core.data.MapEntry entry(K p0, V p1)`
- `public static org.assertj.core.groups.Properties extractProperty(java.lang.String p0)`
- `public static <T extends java.lang.Object> org.assertj.core.groups.Properties extractProperty(java.lang.String p0, java.lang.Class p1)`
- `public static void fail(java.lang.String p0)`
- `public static void fail(java.lang.String p0, java.lang.Object... p1)`
- `public static void fail(java.lang.String p0, java.lang.Throwable p1)`
- `public static void failBecauseExceptionWasNotThrown(java.lang.Class p0)`
- `public static <E extends java.lang.Object> org.assertj.core.api.filter.Filters filter(E[] p0)`
- `public static <E extends java.lang.Object> org.assertj.core.api.filter.Filters filter(java.lang.Iterable p0)`
- `public static org.assertj.core.api.filter.InFilter in(java.lang.Object... p0)`
- `public static java.util.List linesOf(java.io.File p0)`
- `public static java.util.List linesOf(java.io.File p0, java.lang.String p1)`
- `public static java.util.List linesOf(java.io.File p0, java.nio.charset.Charset p1)`
- `public static java.util.List linesOf(java.net.URL p0)`
- `public static java.util.List linesOf(java.net.URL p0, java.lang.String p1)`
- `public static java.util.List linesOf(java.net.URL p0, java.nio.charset.Charset p1)`
- `public static org.assertj.core.api.filter.NotFilter not(java.lang.Object p0)`
- `public static <T extends java.lang.Object> org.assertj.core.condition.Not not(org.assertj.core.api.Condition p0)`
- `public static org.assertj.core.api.filter.NotInFilter notIn(java.lang.Object... p0)`
- `public static org.assertj.core.data.Offset offset(java.lang.Double p0)`
- `public static org.assertj.core.data.Offset offset(java.lang.Float p0)`
- `public static void registerCustomDateFormat(java.lang.String p0)`
- `public static void registerCustomDateFormat(java.text.DateFormat p0)`
- `public static void setAllowComparingPrivateFields(boolean p0)`
- `public static void setAllowExtractingPrivateFields(boolean p0)`
- `public static void setLenientDateParsing(boolean p0)`
- `public static void setMaxElementsForPrinting(int p0)`
- `public static void setMaxLengthForSingleLineDescription(int p0)`
- `public static void setMaxStackTraceElementsDisplayed(int p0)`
- `public static void shouldHaveThrown(java.lang.Class p0)`
- `public static org.assertj.core.groups.Tuple tuple(java.lang.Object... p0)`
- `public static void useDefaultDateFormatsOnly()`
- `public static org.assertj.core.data.Offset within(java.lang.Byte p0)`
- `public static org.assertj.core.data.Offset within(java.lang.Double p0)`
- `public static org.assertj.core.data.Offset within(java.lang.Float p0)`
- `public static org.assertj.core.data.Offset within(java.lang.Integer p0)`
- `public static org.assertj.core.data.Offset within(java.lang.Long p0)`
- `public static org.assertj.core.data.Offset within(java.lang.Short p0)`
- `public static org.assertj.core.data.Offset within(java.math.BigDecimal p0)`
- `public static org.assertj.core.data.Offset within(java.math.BigInteger p0)`
- `public static org.assertj.core.data.Percentage withinPercentage(java.lang.Double p0)`
- `public static org.assertj.core.data.Percentage withinPercentage(java.lang.Integer p0)`
- `public static org.assertj.core.data.Percentage withinPercentage(java.lang.Long p0)`

---

## public class `org.assertj.core.api.Java6BDDAssertions`
annotations: @java.lang.Deprecated, @org.assertj.core.util.CheckReturnValue  

**Constructors:**
- `protected Java6BDDAssertions()`

**Methods:**
- `public static <ACTUAL extends java.lang.Iterable<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.ClassBasedNavigableIterableAssert then(ACTUAL p0, java.lang.Class p1)`
- `public static <T extends java.lang.Comparable<? super T>> org.assertj.core.api.AbstractComparableAssert then(T p0)`
- `public static <T extends org.assertj.core.api.AssertDelegateTarget> T then(T p0)`
- `public static <T extends java.lang.Throwable> org.assertj.core.api.AbstractThrowableAssert then(T p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.AbstractObjectAssert then(T p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.AbstractObjectArrayAssert then(T[] p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.Object2DArrayAssert then(T[][] p0)`
- `public static org.assertj.core.api.AbstractBooleanAssert then(boolean p0)`
- `public static org.assertj.core.api.AbstractBooleanArrayAssert then(boolean[] p0)`
- `public static org.assertj.core.api.Boolean2DArrayAssert then(boolean[][] p0)`
- `public static org.assertj.core.api.AbstractByteAssert then(byte p0)`
- `public static org.assertj.core.api.AbstractByteArrayAssert then(byte[] p0)`
- `public static org.assertj.core.api.Byte2DArrayAssert then(byte[][] p0)`
- `public static org.assertj.core.api.AbstractCharacterAssert then(char p0)`
- `public static org.assertj.core.api.AbstractCharArrayAssert then(char[] p0)`
- `public static org.assertj.core.api.Char2DArrayAssert then(char[][] p0)`
- `public static org.assertj.core.api.AbstractDoubleAssert then(double p0)`
- `public static org.assertj.core.api.AbstractDoubleArrayAssert then(double[] p0)`
- `public static org.assertj.core.api.Double2DArrayAssert then(double[][] p0)`
- `public static org.assertj.core.api.AbstractFloatAssert then(float p0)`
- `public static org.assertj.core.api.AbstractFloatArrayAssert then(float[] p0)`
- `public static org.assertj.core.api.Float2DArrayAssert then(float[][] p0)`
- `public static org.assertj.core.api.AbstractIntegerAssert then(int p0)`
- `public static org.assertj.core.api.AbstractIntArrayAssert then(int[] p0)`
- `public static org.assertj.core.api.Int2DArrayAssert then(int[][] p0)`
- `public static org.assertj.core.api.AbstractFileAssert then(java.io.File p0)`
- `public static org.assertj.core.api.AbstractInputStreamAssert then(java.io.InputStream p0)`
- `public static org.assertj.core.api.AbstractBooleanAssert then(java.lang.Boolean p0)`
- `public static org.assertj.core.api.AbstractByteAssert then(java.lang.Byte p0)`
- `public static org.assertj.core.api.AbstractCharSequenceAssert then(java.lang.CharSequence p0)`
- `public static org.assertj.core.api.AbstractCharacterAssert then(java.lang.Character p0)`
- `public static org.assertj.core.api.AbstractClassAssert then(java.lang.Class p0)`
- `public static org.assertj.core.api.AbstractDoubleAssert then(java.lang.Double p0)`
- `public static org.assertj.core.api.AbstractFloatAssert then(java.lang.Float p0)`
- `public static org.assertj.core.api.AbstractIntegerAssert then(java.lang.Integer p0)`
- `public static <ACTUAL extends java.lang.Iterable<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.FactoryBasedNavigableIterableAssert then(java.lang.Iterable p0, org.assertj.core.api.AssertFactory p1)`
- `public static <T extends java.lang.Object> org.assertj.core.api.AbstractIterableAssert then(java.lang.Iterable p0)`
- `public static org.assertj.core.api.AbstractLongAssert then(java.lang.Long p0)`
- `public static org.assertj.core.api.AbstractShortAssert then(java.lang.Short p0)`
- `public static org.assertj.core.api.AbstractStringAssert then(java.lang.String p0)`
- `public static org.assertj.core.api.AbstractCharSequenceAssert then(java.lang.StringBuffer p0)`
- `public static org.assertj.core.api.AbstractCharSequenceAssert then(java.lang.StringBuilder p0)`
- `public static org.assertj.core.api.AbstractBigDecimalAssert then(java.math.BigDecimal p0)`
- `public static org.assertj.core.api.AbstractBigIntegerAssert then(java.math.BigInteger p0)`
- `public static org.assertj.core.api.AbstractUriAssert then(java.net.URI p0)`
- `public static org.assertj.core.api.AbstractUrlAssert then(java.net.URL p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.AbstractCollectionAssert then(java.util.Collection p0)`
- `public static org.assertj.core.api.AbstractDateAssert then(java.util.Date p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.AbstractIteratorAssert then(java.util.Iterator p0)`
- `public static <ELEMENT extends java.lang.Object, ACTUAL extends java.util.List<? extends ELEMENT>, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.ClassBasedNavigableListAssert then(java.util.List p0, java.lang.Class p1)`
- `public static <ACTUAL extends java.util.List<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.FactoryBasedNavigableListAssert then(java.util.List p0, org.assertj.core.api.AssertFactory p1)`
- `public static <T extends java.lang.Object> org.assertj.core.api.AbstractListAssert then(java.util.List p0)`
- `public static <K extends java.lang.Object, V extends java.lang.Object> org.assertj.core.api.MapAssert then(java.util.Map p0)`
- `public static <RESULT extends java.lang.Object> org.assertj.core.api.AbstractFutureAssert then(java.util.concurrent.Future p0)`
- `public static org.assertj.core.api.AtomicBooleanAssert then(java.util.concurrent.atomic.AtomicBoolean p0)`
- `public static org.assertj.core.api.AtomicIntegerAssert then(java.util.concurrent.atomic.AtomicInteger p0)`
- `public static org.assertj.core.api.AtomicIntegerArrayAssert then(java.util.concurrent.atomic.AtomicIntegerArray p0)`
- `public static <OBJECT extends java.lang.Object> org.assertj.core.api.AtomicIntegerFieldUpdaterAssert then(java.util.concurrent.atomic.AtomicIntegerFieldUpdater p0)`
- `public static org.assertj.core.api.AtomicLongAssert then(java.util.concurrent.atomic.AtomicLong p0)`
- `public static org.assertj.core.api.AtomicLongArrayAssert then(java.util.concurrent.atomic.AtomicLongArray p0)`
- `public static <OBJECT extends java.lang.Object> org.assertj.core.api.AtomicLongFieldUpdaterAssert then(java.util.concurrent.atomic.AtomicLongFieldUpdater p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.AtomicMarkableReferenceAssert then(java.util.concurrent.atomic.AtomicMarkableReference p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.AtomicReferenceAssert then(java.util.concurrent.atomic.AtomicReference p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.AtomicReferenceArrayAssert then(java.util.concurrent.atomic.AtomicReferenceArray p0)`
- `public static <FIELD extends java.lang.Object, OBJECT extends java.lang.Object> org.assertj.core.api.AtomicReferenceFieldUpdaterAssert then(java.util.concurrent.atomic.AtomicReferenceFieldUpdater p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.api.AtomicStampedReferenceAssert then(java.util.concurrent.atomic.AtomicStampedReference p0)`
- `public static org.assertj.core.api.AbstractLongAssert then(long p0)`
- `public static org.assertj.core.api.AbstractLongArrayAssert then(long[] p0)`
- `public static org.assertj.core.api.Long2DArrayAssert then(long[][] p0)`
- `public static <T extends java.lang.Object> T then(org.assertj.core.api.AssertProvider p0)`
- `public static org.assertj.core.api.AbstractShortAssert then(short p0)`
- `public static org.assertj.core.api.AbstractShortArrayAssert then(short[] p0)`
- `public static org.assertj.core.api.Short2DArrayAssert then(short[][] p0)`
- `public org.assertj.core.api.AbstractThrowableAssert thenCode(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.AbstractObjectAssert thenObject(T p0)`
- `public static org.assertj.core.api.AbstractThrowableAssert thenThrownBy(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static org.assertj.core.api.AbstractThrowableAssert thenThrownBy(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0, java.lang.String p1, java.lang.Object... p2)`

---

## public class `org.assertj.core.api.Java6BDDSoftAssertions`
annotations: @java.lang.Deprecated  
extends `org.assertj.core.api.AbstractSoftAssertions`  
implements `org.assertj.core.api.Java6BDDSoftAssertionsProvider`  

**Constructors:**
- `public Java6BDDSoftAssertions()`

---

## public abstract interface `org.assertj.core.api.Java6BDDSoftAssertionsProvider`
annotations: @org.assertj.core.util.CheckReturnValue  
implements `org.assertj.core.api.SoftAssertionsProvider`  

**Methods:**
- `public default <T extends java.lang.Throwable> org.assertj.core.api.ThrowableAssert then(T p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.ObjectAssert then(T p0)`
- `public default <T extends java.lang.Comparable<? super T>> org.assertj.core.api.AbstractComparableAssert then(T p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.ObjectArrayAssert then(T[] p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.Object2DArrayAssert then(T[][] p0)`
- `public default org.assertj.core.api.BooleanAssert then(boolean p0)`
- `public default org.assertj.core.api.BooleanArrayAssert then(boolean[] p0)`
- `public default org.assertj.core.api.Boolean2DArrayAssert then(boolean[][] p0)`
- `public default org.assertj.core.api.ByteAssert then(byte p0)`
- `public default org.assertj.core.api.ByteArrayAssert then(byte[] p0)`
- `public default org.assertj.core.api.Byte2DArrayAssert then(byte[][] p0)`
- `public default org.assertj.core.api.CharacterAssert then(char p0)`
- `public default org.assertj.core.api.CharArrayAssert then(char[] p0)`
- `public default org.assertj.core.api.Char2DArrayAssert then(char[][] p0)`
- `public default org.assertj.core.api.DoubleAssert then(double p0)`
- `public default org.assertj.core.api.DoubleArrayAssert then(double[] p0)`
- `public default org.assertj.core.api.Double2DArrayAssert then(double[][] p0)`
- `public default org.assertj.core.api.FloatAssert then(float p0)`
- `public default org.assertj.core.api.FloatArrayAssert then(float[] p0)`
- `public default org.assertj.core.api.Float2DArrayAssert then(float[][] p0)`
- `public default org.assertj.core.api.IntegerAssert then(int p0)`
- `public default org.assertj.core.api.IntArrayAssert then(int[] p0)`
- `public default org.assertj.core.api.Int2DArrayAssert then(int[][] p0)`
- `public default org.assertj.core.api.FileAssert then(java.io.File p0)`
- `public default org.assertj.core.api.InputStreamAssert then(java.io.InputStream p0)`
- `public default org.assertj.core.api.BooleanAssert then(java.lang.Boolean p0)`
- `public default org.assertj.core.api.ByteAssert then(java.lang.Byte p0)`
- `public default org.assertj.core.api.CharSequenceAssert then(java.lang.CharSequence p0)`
- `public default org.assertj.core.api.CharacterAssert then(java.lang.Character p0)`
- `public default org.assertj.core.api.ClassAssert then(java.lang.Class p0)`
- `public default org.assertj.core.api.DoubleAssert then(java.lang.Double p0)`
- `public default org.assertj.core.api.FloatAssert then(java.lang.Float p0)`
- `public default org.assertj.core.api.IntegerAssert then(java.lang.Integer p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.IterableAssert then(java.lang.Iterable p0)`
- `public default org.assertj.core.api.LongAssert then(java.lang.Long p0)`
- `public default org.assertj.core.api.ShortAssert then(java.lang.Short p0)`
- `public default org.assertj.core.api.StringAssert then(java.lang.String p0)`
- `public default org.assertj.core.api.CharSequenceAssert then(java.lang.StringBuffer p0)`
- `public default org.assertj.core.api.CharSequenceAssert then(java.lang.StringBuilder p0)`
- `public default org.assertj.core.api.BigDecimalAssert then(java.math.BigDecimal p0)`
- `public default org.assertj.core.api.BigIntegerAssert then(java.math.BigInteger p0)`
- `public default org.assertj.core.api.UriAssert then(java.net.URI p0)`
- `public default org.assertj.core.api.AbstractUrlAssert then(java.net.URL p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.CollectionAssert then(java.util.Collection p0)`
- `public default org.assertj.core.api.DateAssert then(java.util.Date p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.IteratorAssert then(java.util.Iterator p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.ListAssert then(java.util.List p0)`
- `public default <K extends java.lang.Object, V extends java.lang.Object> org.assertj.core.api.MapAssert then(java.util.Map p0)`
- `public default <RESULT extends java.lang.Object> org.assertj.core.api.FutureAssert then(java.util.concurrent.Future p0)`
- `public default org.assertj.core.api.AtomicBooleanAssert then(java.util.concurrent.atomic.AtomicBoolean p0)`
- `public default org.assertj.core.api.AtomicIntegerAssert then(java.util.concurrent.atomic.AtomicInteger p0)`
- `public default org.assertj.core.api.AtomicIntegerArrayAssert then(java.util.concurrent.atomic.AtomicIntegerArray p0)`
- `public default <OBJECT extends java.lang.Object> org.assertj.core.api.AtomicIntegerFieldUpdaterAssert then(java.util.concurrent.atomic.AtomicIntegerFieldUpdater p0)`
- `public default org.assertj.core.api.AtomicLongAssert then(java.util.concurrent.atomic.AtomicLong p0)`
- `public default org.assertj.core.api.AtomicLongArrayAssert then(java.util.concurrent.atomic.AtomicLongArray p0)`
- `public default <OBJECT extends java.lang.Object> org.assertj.core.api.AtomicLongFieldUpdaterAssert then(java.util.concurrent.atomic.AtomicLongFieldUpdater p0)`
- `public default <VALUE extends java.lang.Object> org.assertj.core.api.AtomicMarkableReferenceAssert then(java.util.concurrent.atomic.AtomicMarkableReference p0)`
- `public default <VALUE extends java.lang.Object> org.assertj.core.api.AtomicReferenceAssert then(java.util.concurrent.atomic.AtomicReference p0)`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.AtomicReferenceArrayAssert then(java.util.concurrent.atomic.AtomicReferenceArray p0)`
- `public default <FIELD extends java.lang.Object, OBJECT extends java.lang.Object> org.assertj.core.api.AtomicReferenceFieldUpdaterAssert then(java.util.concurrent.atomic.AtomicReferenceFieldUpdater p0)`
- `public default <VALUE extends java.lang.Object> org.assertj.core.api.AtomicStampedReferenceAssert then(java.util.concurrent.atomic.AtomicStampedReference p0)`
- `public default org.assertj.core.api.LongAssert then(long p0)`
- `public default org.assertj.core.api.LongArrayAssert then(long[] p0)`
- `public default org.assertj.core.api.Long2DArrayAssert then(long[][] p0)`
- `public default org.assertj.core.api.ShortAssert then(short p0)`
- `public default org.assertj.core.api.ShortArrayAssert then(short[] p0)`
- `public default org.assertj.core.api.Short2DArrayAssert then(short[][] p0)`
- `public default org.assertj.core.api.AbstractThrowableAssert thenCode(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public default <E extends java.lang.Object> org.assertj.core.api.AbstractCollectionAssert thenCollection(java.util.Collection p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.AbstractUniversalComparableAssert thenComparable(java.lang.Comparable p0)`
- `public default org.assertj.core.api.ThrowableTypeAssert thenException()`
- `public default <T extends java.lang.Throwable> org.assertj.core.api.ThrowableTypeAssert thenExceptionOfType(java.lang.Class p0)`
- `public default org.assertj.core.api.ThrowableTypeAssert thenIOException()`
- `public default org.assertj.core.api.ThrowableTypeAssert thenIllegalArgumentException()`
- `public default org.assertj.core.api.ThrowableTypeAssert thenIllegalStateException()`
- `public default org.assertj.core.api.ThrowableTypeAssert thenIndexOutOfBoundsException()`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.IterableAssert thenIterable(java.lang.Iterable p0)`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.IteratorAssert thenIterator(java.util.Iterator p0)`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.ListAssert thenList(java.util.List p0)`
- `public default org.assertj.core.api.ThrowableTypeAssert thenNullPointerException()`
- `public default <T extends java.lang.Object> org.assertj.core.api.ObjectAssert thenObject(T p0)`
- `public default org.assertj.core.api.ThrowableTypeAssert thenReflectiveOperationException()`
- `public default org.assertj.core.api.ThrowableTypeAssert thenRuntimeException()`
- `public default org.assertj.core.api.AbstractThrowableAssert thenThrownBy(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public default org.assertj.core.api.AbstractThrowableAssert thenThrownBy(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0, java.lang.String p1, java.lang.Object... p2)`

---

## public class `org.assertj.core.api.Java6JUnitBDDSoftAssertions`
annotations: @java.lang.Deprecated  
extends `org.assertj.core.api.AbstractSoftAssertions`  
implements `org.assertj.core.api.Java6BDDSoftAssertionsProvider`, `org.assertj.core.api.SoftAssertionsRule`  

**Constructors:**
- `public Java6JUnitBDDSoftAssertions()`

---

## public class `org.assertj.core.api.Java6JUnitSoftAssertions`
annotations: @java.lang.Deprecated  
extends `org.assertj.core.api.AbstractSoftAssertions`  
implements `org.assertj.core.api.Java6StandardSoftAssertionsProvider`, `org.assertj.core.api.SoftAssertionsRule`  

**Constructors:**
- `public Java6JUnitSoftAssertions()`

**Methods:**
- `public org.junit.runners.model.Statement apply(org.junit.runners.model.Statement p0, org.junit.runner.Description p1)`

---

## public class `org.assertj.core.api.Java6SoftAssertions`
annotations: @java.lang.Deprecated  
extends `org.assertj.core.api.AbstractSoftAssertions`  
implements `org.assertj.core.api.Java6StandardSoftAssertionsProvider`  

**Constructors:**
- `public Java6SoftAssertions()`

---

## public abstract interface `org.assertj.core.api.Java6StandardSoftAssertionsProvider`
annotations: @org.assertj.core.util.CheckReturnValue  
implements `org.assertj.core.api.SoftAssertionsProvider`  

**Methods:**
- `public default <T extends java.lang.Object> org.assertj.core.api.ObjectAssert assertThat(T p0)`
- `public default <T extends java.lang.Throwable> org.assertj.core.api.ThrowableAssert assertThat(T p0)`
- `public default <T extends java.lang.Comparable<? super T>> org.assertj.core.api.AbstractComparableAssert assertThat(T p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.ObjectArrayAssert assertThat(T[] p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.Object2DArrayAssert assertThat(T[][] p0)`
- `public default org.assertj.core.api.BooleanAssert assertThat(boolean p0)`
- `public default org.assertj.core.api.BooleanArrayAssert assertThat(boolean[] p0)`
- `public default org.assertj.core.api.Boolean2DArrayAssert assertThat(boolean[][] p0)`
- `public default org.assertj.core.api.ByteAssert assertThat(byte p0)`
- `public default org.assertj.core.api.ByteArrayAssert assertThat(byte[] p0)`
- `public default org.assertj.core.api.Byte2DArrayAssert assertThat(byte[][] p0)`
- `public default org.assertj.core.api.CharacterAssert assertThat(char p0)`
- `public default org.assertj.core.api.CharArrayAssert assertThat(char[] p0)`
- `public default org.assertj.core.api.Char2DArrayAssert assertThat(char[][] p0)`
- `public default org.assertj.core.api.DoubleAssert assertThat(double p0)`
- `public default org.assertj.core.api.DoubleArrayAssert assertThat(double[] p0)`
- `public default org.assertj.core.api.Double2DArrayAssert assertThat(double[][] p0)`
- `public default org.assertj.core.api.FloatAssert assertThat(float p0)`
- `public default org.assertj.core.api.FloatArrayAssert assertThat(float[] p0)`
- `public default org.assertj.core.api.Float2DArrayAssert assertThat(float[][] p0)`
- `public default org.assertj.core.api.IntegerAssert assertThat(int p0)`
- `public default org.assertj.core.api.IntArrayAssert assertThat(int[] p0)`
- `public default org.assertj.core.api.Int2DArrayAssert assertThat(int[][] p0)`
- `public default org.assertj.core.api.FileAssert assertThat(java.io.File p0)`
- `public default org.assertj.core.api.InputStreamAssert assertThat(java.io.InputStream p0)`
- `public default org.assertj.core.api.BooleanAssert assertThat(java.lang.Boolean p0)`
- `public default org.assertj.core.api.ByteAssert assertThat(java.lang.Byte p0)`
- `public default org.assertj.core.api.CharSequenceAssert assertThat(java.lang.CharSequence p0)`
- `public default org.assertj.core.api.CharacterAssert assertThat(java.lang.Character p0)`
- `public default org.assertj.core.api.ClassAssert assertThat(java.lang.Class p0)`
- `public default org.assertj.core.api.DoubleAssert assertThat(java.lang.Double p0)`
- `public default org.assertj.core.api.FloatAssert assertThat(java.lang.Float p0)`
- `public default org.assertj.core.api.IntegerAssert assertThat(java.lang.Integer p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.IterableAssert assertThat(java.lang.Iterable p0)`
- `public default org.assertj.core.api.LongAssert assertThat(java.lang.Long p0)`
- `public default org.assertj.core.api.ShortAssert assertThat(java.lang.Short p0)`
- `public default org.assertj.core.api.StringAssert assertThat(java.lang.String p0)`
- `public default org.assertj.core.api.CharSequenceAssert assertThat(java.lang.StringBuffer p0)`
- `public default org.assertj.core.api.CharSequenceAssert assertThat(java.lang.StringBuilder p0)`
- `public default org.assertj.core.api.BigDecimalAssert assertThat(java.math.BigDecimal p0)`
- `public default org.assertj.core.api.BigIntegerAssert assertThat(java.math.BigInteger p0)`
- `public default org.assertj.core.api.UriAssert assertThat(java.net.URI p0)`
- `public default org.assertj.core.api.AbstractUrlAssert assertThat(java.net.URL p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.CollectionAssert assertThat(java.util.Collection p0)`
- `public default org.assertj.core.api.DateAssert assertThat(java.util.Date p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.IteratorAssert assertThat(java.util.Iterator p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.ListAssert assertThat(java.util.List p0)`
- `public default <K extends java.lang.Object, V extends java.lang.Object> org.assertj.core.api.MapAssert assertThat(java.util.Map p0)`
- `public default <RESULT extends java.lang.Object> org.assertj.core.api.FutureAssert assertThat(java.util.concurrent.Future p0)`
- `public default org.assertj.core.api.AtomicBooleanAssert assertThat(java.util.concurrent.atomic.AtomicBoolean p0)`
- `public default org.assertj.core.api.AtomicIntegerAssert assertThat(java.util.concurrent.atomic.AtomicInteger p0)`
- `public default org.assertj.core.api.AtomicIntegerArrayAssert assertThat(java.util.concurrent.atomic.AtomicIntegerArray p0)`
- `public default <OBJECT extends java.lang.Object> org.assertj.core.api.AtomicIntegerFieldUpdaterAssert assertThat(java.util.concurrent.atomic.AtomicIntegerFieldUpdater p0)`
- `public default org.assertj.core.api.AtomicLongAssert assertThat(java.util.concurrent.atomic.AtomicLong p0)`
- `public default org.assertj.core.api.AtomicLongArrayAssert assertThat(java.util.concurrent.atomic.AtomicLongArray p0)`
- `public default <OBJECT extends java.lang.Object> org.assertj.core.api.AtomicLongFieldUpdaterAssert assertThat(java.util.concurrent.atomic.AtomicLongFieldUpdater p0)`
- `public default <VALUE extends java.lang.Object> org.assertj.core.api.AtomicMarkableReferenceAssert assertThat(java.util.concurrent.atomic.AtomicMarkableReference p0)`
- `public default <VALUE extends java.lang.Object> org.assertj.core.api.AtomicReferenceAssert assertThat(java.util.concurrent.atomic.AtomicReference p0)`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.AtomicReferenceArrayAssert assertThat(java.util.concurrent.atomic.AtomicReferenceArray p0)`
- `public default <FIELD extends java.lang.Object, OBJECT extends java.lang.Object> org.assertj.core.api.AtomicReferenceFieldUpdaterAssert assertThat(java.util.concurrent.atomic.AtomicReferenceFieldUpdater p0)`
- `public default <VALUE extends java.lang.Object> org.assertj.core.api.AtomicStampedReferenceAssert assertThat(java.util.concurrent.atomic.AtomicStampedReference p0)`
- `public default org.assertj.core.api.LongAssert assertThat(long p0)`
- `public default org.assertj.core.api.LongArrayAssert assertThat(long[] p0)`
- `public default org.assertj.core.api.Long2DArrayAssert assertThat(long[][] p0)`
- `public default org.assertj.core.api.ShortAssert assertThat(short p0)`
- `public default org.assertj.core.api.ShortArrayAssert assertThat(short[] p0)`
- `public default org.assertj.core.api.Short2DArrayAssert assertThat(short[][] p0)`
- `public default org.assertj.core.api.AbstractThrowableAssert assertThatCode(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.CollectionAssert assertThatCollection(java.util.Collection p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.AbstractUniversalComparableAssert assertThatComparable(java.lang.Comparable p0)`
- `public default org.assertj.core.api.ThrowableTypeAssert assertThatException()`
- `public default <T extends java.lang.Throwable> org.assertj.core.api.ThrowableTypeAssert assertThatExceptionOfType(java.lang.Class p0)`
- `public default org.assertj.core.api.ThrowableTypeAssert assertThatIOException()`
- `public default org.assertj.core.api.ThrowableTypeAssert assertThatIllegalArgumentException()`
- `public default org.assertj.core.api.ThrowableTypeAssert assertThatIllegalStateException()`
- `public default org.assertj.core.api.ThrowableTypeAssert assertThatIndexOutOfBoundsException()`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.IterableAssert assertThatIterable(java.lang.Iterable p0)`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.IteratorAssert assertThatIterator(java.util.Iterator p0)`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.ListAssert assertThatList(java.util.List p0)`
- `public default org.assertj.core.api.ThrowableTypeAssert assertThatNullPointerException()`
- `public default <T extends java.lang.Object> org.assertj.core.api.ObjectAssert assertThatObject(T p0)`
- `public default org.assertj.core.api.ThrowableTypeAssert assertThatReflectiveOperationException()`
- `public default org.assertj.core.api.ThrowableTypeAssert assertThatRuntimeException()`
- `public default org.assertj.core.api.AbstractThrowableAssert assertThatThrownBy(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public default org.assertj.core.api.AbstractThrowableAssert assertThatThrownBy(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0, java.lang.String p1, java.lang.Object... p2)`

---

## public class `org.assertj.core.api.ListAssert`<ELEMENT extends java.lang.Object>
extends `org.assertj.core.api.FactoryBasedNavigableListAssert`  

**Constructors:**
- `public ListAssert(java.util.List p0)`
- `public ListAssert(java.util.stream.DoubleStream p0)`
- `public ListAssert(java.util.stream.IntStream p0)`
- `public ListAssert(java.util.stream.LongStream p0)`
- `public ListAssert(java.util.stream.Stream p0)`

**Methods:**
- `public static org.assertj.core.api.ListAssert assertThatDoubleStream(java.util.stream.DoubleStream p0)`
- `public static org.assertj.core.api.ListAssert assertThatIntStream(java.util.stream.IntStream p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.ListAssert assertThatList(java.util.List p0)`
- `public static org.assertj.core.api.ListAssert assertThatLongStream(java.util.stream.LongStream p0)`
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.ListAssert assertThatStream(java.util.stream.Stream p0)`
- `public org.assertj.core.api.ListAssert isEqualTo(java.lang.Object p0)`
- `public org.assertj.core.api.ListAssert isExactlyInstanceOf(java.lang.Class p0)`
- `public org.assertj.core.api.ListAssert isInstanceOf(java.lang.Class p0)`
- `public org.assertj.core.api.ListAssert isInstanceOfAny(java.lang.Class... p0)`
- `public org.assertj.core.api.ListAssert isNotExactlyInstanceOf(java.lang.Class p0)`
- `public org.assertj.core.api.ListAssert isNotInstanceOf(java.lang.Class p0)`
- `public org.assertj.core.api.ListAssert isNotInstanceOfAny(java.lang.Class... p0)`
- `public org.assertj.core.api.ListAssert isNotOfAnyClassIn(java.lang.Class... p0)`
- `public org.assertj.core.api.ListAssert isNotSameAs(java.lang.Object p0)`
- `public org.assertj.core.api.ListAssert isOfAnyClassIn(java.lang.Class... p0)`
- `public org.assertj.core.api.ListAssert isSameAs(java.lang.Object p0)`
- `protected org.assertj.core.api.ListAssert newAbstractIterableAssert(java.lang.Iterable p0)`
- `protected org.assertj.core.api.ListAssert startsWithForProxy(ELEMENT[] p0)`

---

## public class `org.assertj.core.api.LocalDateAssert`
extends `org.assertj.core.api.AbstractLocalDateAssert`  

**Constructors:**
- `protected LocalDateAssert(java.time.LocalDate p0)`

---

## public class `org.assertj.core.api.LocalDateTimeAssert`
extends `org.assertj.core.api.AbstractLocalDateTimeAssert`  

**Constructors:**
- `protected LocalDateTimeAssert(java.time.LocalDateTime p0)`

---

## public class `org.assertj.core.api.LocalTimeAssert`
extends `org.assertj.core.api.AbstractLocalTimeAssert`  

**Constructors:**
- `protected LocalTimeAssert(java.time.LocalTime p0)`

---

## public class `org.assertj.core.api.Long2DArrayAssert`
extends `org.assertj.core.api.Abstract2DArrayAssert`  

**Constructors:**
- `public Long2DArrayAssert(long[][] p0)`

**Fields:**
- `protected org.assertj.core.internal.Long2DArrays long2dArrays`

**Methods:**
- `public org.assertj.core.api.Long2DArrayAssert contains(long[] p0, org.assertj.core.data.Index p1)`
- `public org.assertj.core.api.Long2DArrayAssert doesNotContain(long[] p0, org.assertj.core.data.Index p1)`
- `public org.assertj.core.api.Long2DArrayAssert hasDimensions(int p0, int p1)`
- `public org.assertj.core.api.Long2DArrayAssert hasNumberOfRows(int p0)`
- `public org.assertj.core.api.Long2DArrayAssert hasSameDimensionsAs(java.lang.Object p0)`
- `public org.assertj.core.api.Long2DArrayAssert isDeepEqualTo(long[][] p0)`
- `public void isEmpty()`
- `public org.assertj.core.api.Long2DArrayAssert isEqualTo(java.lang.Object p0)`
- `public org.assertj.core.api.Long2DArrayAssert isNotEmpty()`
- `public void isNullOrEmpty()`

---

## public class `org.assertj.core.api.LongAdderAssert`
extends `org.assertj.core.api.AbstractLongAdderAssert`  

**Constructors:**
- `public LongAdderAssert(java.util.concurrent.atomic.LongAdder p0)`

---

## public class `org.assertj.core.api.LongArrayAssert`
extends `org.assertj.core.api.AbstractLongArrayAssert`  

**Constructors:**
- `public LongArrayAssert(java.util.concurrent.atomic.AtomicLongArray p0)`
- `public LongArrayAssert(long[] p0)`

---

## public class `org.assertj.core.api.LongAssert`
extends `org.assertj.core.api.AbstractLongAssert`  

**Constructors:**
- `public LongAssert(java.lang.Long p0)`
- `public LongAssert(java.util.concurrent.atomic.AtomicLong p0)`

---

## public class `org.assertj.core.api.LongPredicateAssert`
extends `org.assertj.core.api.AbstractPredicateLikeAssert`  

**Constructors:**
- `public LongPredicateAssert(java.util.function.LongPredicate p0)`

**Methods:**
- `public org.assertj.core.api.LongPredicateAssert accepts(long... p0)`
- `public static org.assertj.core.api.LongPredicateAssert assertThatLongPredicate(java.util.function.LongPredicate p0)`
- `public org.assertj.core.api.LongPredicateAssert rejects(long... p0)`

---

## public class `org.assertj.core.api.MapAssert`<KEY extends java.lang.Object, VALUE extends java.lang.Object>
extends `org.assertj.core.api.AbstractMapAssert`  

**Constructors:**
- `public MapAssert(java.util.Map p0)`

**Methods:**
- `public static <K extends java.lang.Object, V extends java.lang.Object> org.assertj.core.api.MapAssert assertThatMap(java.util.Map p0)`

---

## public class `org.assertj.core.api.MapSizeAssert`<KEY extends java.lang.Object, VALUE extends java.lang.Object>
extends `org.assertj.core.api.AbstractMapSizeAssert`  

**Constructors:**
- `public MapSizeAssert(org.assertj.core.api.AbstractMapAssert p0, java.lang.Integer p1)`

**Methods:**
- `public org.assertj.core.api.AbstractMapAssert returnToMap()`

---

## public class `org.assertj.core.api.MatcherAssert`
extends `org.assertj.core.api.AbstractMatcherAssert`  

**Constructors:**
- `protected MatcherAssert(java.util.regex.Matcher p0)`

---

## public class `org.assertj.core.api.NotThrownAssert`
implements `org.assertj.core.api.Descriptable<org.assertj.core.api.NotThrownAssert>`  

**Constructors:**
- `public NotThrownAssert()`

**Fields:**
- `protected org.assertj.core.description.Description description`

**Methods:**
- `public org.assertj.core.api.NotThrownAssert describedAs(org.assertj.core.description.Description p0)`
- `public void isThrownBy(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`

---

## public abstract interface `org.assertj.core.api.NumberAssert`<SELF extends org.assertj.core.api.NumberAssert<SELF, ACTUAL>, ACTUAL extends java.lang.Number>

**Methods:**
- `public abstract SELF isBetween(ACTUAL p0, ACTUAL p1)`
- `public abstract SELF isCloseTo(ACTUAL p0, org.assertj.core.data.Offset p1)`
- `public abstract SELF isCloseTo(ACTUAL p0, org.assertj.core.data.Percentage p1)`
- `public abstract SELF isNegative()`
- `public abstract SELF isNotCloseTo(ACTUAL p0, org.assertj.core.data.Offset p1)`
- `public abstract SELF isNotCloseTo(ACTUAL p0, org.assertj.core.data.Percentage p1)`
- `public abstract SELF isNotNegative()`
- `public abstract SELF isNotPositive()`
- `public abstract SELF isNotZero()`
- `public abstract SELF isOne()`
- `public abstract SELF isPositive()`
- `public abstract SELF isStrictlyBetween(ACTUAL p0, ACTUAL p1)`
- `public abstract SELF isZero()`

---

## public class `org.assertj.core.api.Object2DArrayAssert`<ELEMENT extends java.lang.Object>
extends `org.assertj.core.api.Abstract2DArrayAssert`  

**Constructors:**
- `public Object2DArrayAssert(ELEMENT[][] p0)`

**Fields:**
- `protected org.assertj.core.internal.Object2DArrays object2dArrays`

**Methods:**
- `public org.assertj.core.api.Object2DArrayAssert contains(ELEMENT[] p0, org.assertj.core.data.Index p1)`
- `public org.assertj.core.api.Object2DArrayAssert doesNotContain(ELEMENT[] p0, org.assertj.core.data.Index p1)`
- `public org.assertj.core.api.Object2DArrayAssert hasDimensions(int p0, int p1)`
- `public org.assertj.core.api.Object2DArrayAssert hasNumberOfRows(int p0)`
- `public org.assertj.core.api.Object2DArrayAssert hasSameDimensionsAs(java.lang.Object p0)`
- `public org.assertj.core.api.Object2DArrayAssert isDeepEqualTo(ELEMENT[][] p0)`
- `public void isEmpty()`
- `public org.assertj.core.api.Object2DArrayAssert isEqualTo(java.lang.Object p0)`
- `public org.assertj.core.api.Object2DArrayAssert isNotEmpty()`
- `public void isNullOrEmpty()`

---

## public class `org.assertj.core.api.ObjectArrayAssert`<ELEMENT extends java.lang.Object>
extends `org.assertj.core.api.AbstractObjectArrayAssert`  

**Constructors:**
- `public ObjectArrayAssert(ELEMENT[] p0)`
- `public ObjectArrayAssert(java.util.concurrent.atomic.AtomicReferenceArray p0)`

**Methods:**
- `protected org.assertj.core.api.ObjectArrayAssert newObjectArrayAssert(ELEMENT[] p0)`

---

## public class `org.assertj.core.api.ObjectAssert`<ACTUAL extends java.lang.Object>
extends `org.assertj.core.api.AbstractObjectAssert`  

**Constructors:**
- `public ObjectAssert(ACTUAL p0)`
- `public ObjectAssert(java.util.concurrent.atomic.AtomicReference p0)`

---

## public class `org.assertj.core.api.ObjectAssertFactory`<T extends java.lang.Object>
implements `org.assertj.core.api.AssertFactory<T,org.assertj.core.api.ObjectAssert<T>>`  

**Constructors:**
- `public ObjectAssertFactory()`

**Methods:**
- `public org.assertj.core.api.ObjectAssert createAssert(T p0)`

---

## public abstract interface `org.assertj.core.api.ObjectEnumerableAssert`<SELF extends org.assertj.core.api.ObjectEnumerableAssert<SELF, ELEMENT>, ELEMENT extends java.lang.Object>
implements `org.assertj.core.api.EnumerableAssert<SELF,ELEMENT>`  

**Methods:**
- `public abstract SELF allMatch(java.util.function.Predicate p0)`
- `public abstract SELF allMatch(java.util.function.Predicate p0, java.lang.String p1)`
- `public abstract SELF allSatisfy(java.util.function.Consumer p0)`
- `public abstract SELF allSatisfy(org.assertj.core.api.ThrowingConsumer p0)`
- `public abstract SELF anyMatch(java.util.function.Predicate p0)`
- `public abstract SELF anySatisfy(java.util.function.Consumer p0)`
- `public abstract SELF anySatisfy(org.assertj.core.api.ThrowingConsumer p0)`
- `public abstract SELF are(org.assertj.core.api.Condition p0)`
- `public abstract SELF areAtLeast(int p0, org.assertj.core.api.Condition p1)`
- `public abstract SELF areAtLeastOne(org.assertj.core.api.Condition p0)`
- `public abstract SELF areAtMost(int p0, org.assertj.core.api.Condition p1)`
- `public abstract SELF areExactly(int p0, org.assertj.core.api.Condition p1)`
- `public abstract SELF areNot(org.assertj.core.api.Condition p0)`
- `public abstract SELF contains(ELEMENT... p0)`
- `public abstract SELF containsAll(java.lang.Iterable p0)`
- `public abstract SELF containsAnyElementsOf(java.lang.Iterable p0)`
- `public abstract SELF containsAnyOf(ELEMENT... p0)`
- `public abstract SELF containsExactly(ELEMENT... p0)`
- `public abstract SELF containsExactlyElementsOf(java.lang.Iterable p0)`
- `public abstract SELF containsExactlyInAnyOrder(ELEMENT... p0)`
- `public abstract SELF containsExactlyInAnyOrderElementsOf(java.lang.Iterable p0)`
- `public abstract SELF containsNull()`
- `public abstract SELF containsOnly(ELEMENT... p0)`
- `public abstract SELF containsOnlyElementsOf(java.lang.Iterable p0)`
- `public abstract SELF containsOnlyNulls()`
- `public abstract SELF containsOnlyOnce(ELEMENT... p0)`
- `public abstract SELF containsOnlyOnceElementsOf(java.lang.Iterable p0)`
- `public abstract SELF containsSequence(ELEMENT... p0)`
- `public abstract SELF containsSequence(java.lang.Iterable p0)`
- `public abstract SELF containsSubsequence(ELEMENT... p0)`
- `public abstract SELF containsSubsequence(java.lang.Iterable p0)`
- `public abstract SELF doNotHave(org.assertj.core.api.Condition p0)`
- `public abstract SELF doesNotContain(ELEMENT... p0)`
- `public abstract SELF doesNotContainAnyElementsOf(java.lang.Iterable p0)`
- `public abstract SELF doesNotContainNull()`
- `public abstract SELF doesNotContainSequence(ELEMENT... p0)`
- `public abstract SELF doesNotContainSequence(java.lang.Iterable p0)`
- `public abstract SELF doesNotContainSubsequence(ELEMENT... p0)`
- `public abstract SELF doesNotContainSubsequence(java.lang.Iterable p0)`
- `public abstract SELF doesNotHaveAnyElementsOfTypes(java.lang.Class... p0)`
- `public abstract SELF doesNotHaveDuplicates()`
- `public abstract SELF endsWith(ELEMENT p0, ELEMENT... p1)`
- `public abstract SELF endsWith(ELEMENT[] p0)`
- `public abstract SELF hasAtLeastOneElementOfType(java.lang.Class p0)`
- `public abstract SELF hasExactlyElementsOfTypes(java.lang.Class... p0)`
- `public abstract SELF hasOnlyElementsOfType(java.lang.Class p0)`
- `public abstract SELF hasOnlyElementsOfTypes(java.lang.Class... p0)`
- `public abstract SELF hasOnlyOneElementSatisfying(java.util.function.Consumer p0)`
- `public abstract SELF hasSameElementsAs(java.lang.Iterable p0)`
- `public abstract SELF have(org.assertj.core.api.Condition p0)`
- `public abstract SELF haveAtLeast(int p0, org.assertj.core.api.Condition p1)`
- `public abstract SELF haveAtLeastOne(org.assertj.core.api.Condition p0)`
- `public abstract SELF haveAtMost(int p0, org.assertj.core.api.Condition p1)`
- `public abstract SELF haveExactly(int p0, org.assertj.core.api.Condition p1)`
- `public abstract SELF isSubsetOf(ELEMENT... p0)`
- `public abstract SELF isSubsetOf(java.lang.Iterable p0)`
- `public abstract SELF noneMatch(java.util.function.Predicate p0)`
- `public abstract SELF noneSatisfy(java.util.function.Consumer p0)`
- `public abstract SELF noneSatisfy(org.assertj.core.api.ThrowingConsumer p0)`
- `public abstract SELF satisfiesExactly(java.util.function.Consumer... p0)`
- `public abstract SELF satisfiesExactly(org.assertj.core.api.ThrowingConsumer... p0)`
- `public abstract SELF satisfiesExactlyInAnyOrder(java.util.function.Consumer... p0)`
- `public abstract SELF satisfiesExactlyInAnyOrder(org.assertj.core.api.ThrowingConsumer... p0)`
- `public abstract SELF startsWith(ELEMENT... p0)`

---

## public class `org.assertj.core.api.OffsetDateTimeAssert`
extends `org.assertj.core.api.AbstractOffsetDateTimeAssert`  

**Constructors:**
- `protected OffsetDateTimeAssert(java.time.OffsetDateTime p0)`

---

## public class `org.assertj.core.api.OffsetTimeAssert`
extends `org.assertj.core.api.AbstractOffsetTimeAssert`  

**Constructors:**
- `protected OffsetTimeAssert(java.time.OffsetTime p0)`

---

## public class `org.assertj.core.api.OptionalAssert`<VALUE extends java.lang.Object>
extends `org.assertj.core.api.AbstractOptionalAssert`  

**Constructors:**
- `protected OptionalAssert(java.util.Optional p0)`

---

## public class `org.assertj.core.api.OptionalDoubleAssert`
extends `org.assertj.core.api.AbstractOptionalDoubleAssert`  

**Constructors:**
- `protected OptionalDoubleAssert(java.util.OptionalDouble p0)`

---

## public class `org.assertj.core.api.OptionalIntAssert`
extends `org.assertj.core.api.AbstractOptionalIntAssert`  

**Constructors:**
- `protected OptionalIntAssert(java.util.OptionalInt p0)`

---

## public class `org.assertj.core.api.OptionalLongAssert`
extends `org.assertj.core.api.AbstractOptionalLongAssert`  

**Constructors:**
- `protected OptionalLongAssert(java.util.OptionalLong p0)`

---

## public class `org.assertj.core.api.PathAssert`
extends `org.assertj.core.api.AbstractPathAssert`  

**Constructors:**
- `public PathAssert(java.nio.file.Path p0)`

**Methods:**
- `public static org.assertj.core.api.AbstractPathAssert assertThatPath(java.nio.file.Path p0)`

---

## public class `org.assertj.core.api.PeriodAssert`
extends `org.assertj.core.api.AbstractPeriodAssert`  

**Constructors:**
- `public PeriodAssert(java.time.Period p0)`

---

## public class `org.assertj.core.api.PredicateAssert`<T extends java.lang.Object>
extends `org.assertj.core.api.AbstractPredicateAssert`  

**Constructors:**
- `protected PredicateAssert(java.util.function.Predicate p0)`

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.api.PredicateAssert assertThatPredicate(java.util.function.Predicate p0)`

---

## public class `org.assertj.core.api.ProxifyMethodChangingTheObjectUnderTest`

**Fields:**
- `public final static java.lang.String FIELD_NAME`

**Methods:**
- `public static org.assertj.core.api.AbstractAssert intercept(org.assertj.core.api.ProxifyMethodChangingTheObjectUnderTest p0, java.util.concurrent.Callable p1, org.assertj.core.api.AbstractAssert p2) throws java.lang.Exception`

---

## public class `org.assertj.core.api.RecursiveComparisonAssert`<SELF extends org.assertj.core.api.RecursiveComparisonAssert<SELF>>
extends `org.assertj.core.api.AbstractAssert`  

**Constructors:**
- `public RecursiveComparisonAssert(java.lang.Object p0, org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration p1)`

**Methods:**
- `public SELF comparingOnlyFields(java.lang.String... p0)`
- `public org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration getRecursiveComparisonConfiguration()`
- `public SELF ignoringActualEmptyOptionalFields()`
- `public SELF ignoringActualNullFields()`
- `public SELF ignoringAllOverriddenEquals()`
- `public SELF ignoringCollectionOrder()`
- `public SELF ignoringCollectionOrderInFields(java.lang.String... p0)`
- `public SELF ignoringCollectionOrderInFieldsMatchingRegexes(java.lang.String... p0)`
- `public SELF ignoringExpectedNullFields()`
- `public SELF ignoringFields(java.lang.String... p0)`
- `public SELF ignoringFieldsMatchingRegexes(java.lang.String... p0)`
- `public org.assertj.core.api.RecursiveComparisonAssert ignoringFieldsOfTypes(java.lang.Class... p0)`
- `public SELF ignoringOverriddenEqualsForFields(java.lang.String... p0)`
- `public SELF ignoringOverriddenEqualsForFieldsMatchingRegexes(java.lang.String... p0)`
- `public SELF ignoringOverriddenEqualsForTypes(java.lang.Class... p0)`
- `public SELF isEqualTo(java.lang.Object p0)`
- `public SELF isNotEqualTo(java.lang.Object p0)`
- `public SELF usingOverriddenEquals()`
- `public SELF withComparatorForFields(java.util.Comparator p0, java.lang.String... p1)`
- `public <T extends java.lang.Object> SELF withComparatorForType(java.util.Comparator p0, java.lang.Class p1)`
- `public SELF withEqualsForFields(java.util.function.BiPredicate p0, java.lang.String... p1)`
- `public <T extends java.lang.Object> SELF withEqualsForType(java.util.function.BiPredicate p0, java.lang.Class p1)`
- `public SELF withErrorMessageForFields(java.lang.String p0, java.lang.String... p1)`
- `public SELF withErrorMessageForType(java.lang.String p0, java.lang.Class p1)`
- `public SELF withStrictTypeChecking()`

---

## public class `org.assertj.core.api.Short2DArrayAssert`
extends `org.assertj.core.api.Abstract2DArrayAssert`  

**Constructors:**
- `public Short2DArrayAssert(short[][] p0)`

**Fields:**
- `protected org.assertj.core.internal.Short2DArrays short2dArrays`

**Methods:**
- `public org.assertj.core.api.Short2DArrayAssert contains(int[] p0, org.assertj.core.data.Index p1)`
- `public org.assertj.core.api.Short2DArrayAssert contains(short[] p0, org.assertj.core.data.Index p1)`
- `public org.assertj.core.api.Short2DArrayAssert doesNotContain(int[] p0, org.assertj.core.data.Index p1)`
- `public org.assertj.core.api.Short2DArrayAssert doesNotContain(short[] p0, org.assertj.core.data.Index p1)`
- `public org.assertj.core.api.Short2DArrayAssert hasDimensions(int p0, int p1)`
- `public org.assertj.core.api.Short2DArrayAssert hasNumberOfRows(int p0)`
- `public org.assertj.core.api.Short2DArrayAssert hasSameDimensionsAs(java.lang.Object p0)`
- `public org.assertj.core.api.Short2DArrayAssert isDeepEqualTo(short[][] p0)`
- `public void isEmpty()`
- `public org.assertj.core.api.Short2DArrayAssert isEqualTo(java.lang.Object p0)`
- `public org.assertj.core.api.Short2DArrayAssert isNotEmpty()`
- `public void isNullOrEmpty()`

---

## public class `org.assertj.core.api.ShortArrayAssert`
extends `org.assertj.core.api.AbstractShortArrayAssert`  

**Constructors:**
- `public ShortArrayAssert(short[] p0)`

---

## public class `org.assertj.core.api.ShortAssert`
extends `org.assertj.core.api.AbstractShortAssert`  

**Constructors:**
- `public ShortAssert(java.lang.Short p0)`

---

## public class `org.assertj.core.api.SoftAssertionError`
extends `java.lang.AssertionError`  

**Constructors:**
- `public SoftAssertionError(java.util.List p0)`

**Methods:**
- `public java.util.List getErrors()`

---

## public class `org.assertj.core.api.SoftAssertions`
extends `org.assertj.core.api.AbstractSoftAssertions`  
implements `org.assertj.core.api.StandardSoftAssertionsProvider`  

**Constructors:**
- `public SoftAssertions()`

**Methods:**
- `public static void assertSoftly(java.util.function.Consumer p0)`

---

## public abstract interface `org.assertj.core.api.SoftAssertionsProvider`
implements `org.assertj.core.api.AssertionErrorCollector`  

**Methods:**
- `public abstract void assertAll()`
- `public default void assertAlso(org.assertj.core.api.AssertionErrorCollector p0)`
- `public static <S extends org.assertj.core.api.SoftAssertionsProvider> void assertSoftly(java.lang.Class p0, java.util.function.Consumer p1)`
- `public default void check(org.assertj.core.api.SoftAssertionsProvider$ThrowingRunnable p0)`
- `public abstract <SELF extends org.assertj.core.api.Assert<? extends SELF, ? extends ACTUAL>, ACTUAL extends java.lang.Object> SELF proxy(java.lang.Class p0, java.lang.Class p1, ACTUAL p2)`

---

## public abstract static interface `org.assertj.core.api.SoftAssertionsProvider$ThrowingRunnable`

**Methods:**
- `public abstract void run() throws java.lang.Exception`

---

## public abstract interface `org.assertj.core.api.SoftAssertionsRule`
implements `org.assertj.core.api.SoftAssertionsProvider`, `org.junit.rules.TestRule`  

**Methods:**
- `public default org.junit.runners.model.Statement apply(org.junit.runners.model.Statement p0, org.junit.runner.Description p1)`

---

## public class `org.assertj.core.api.SoftThrowableAssertAlternative`<ACTUAL extends java.lang.Throwable>
extends `org.assertj.core.api.ThrowableAssertAlternative`  

**Constructors:**
- `public SoftThrowableAssertAlternative(ACTUAL p0, org.assertj.core.api.SoftAssertionsProvider p1)`

**Methods:**
- `public org.assertj.core.api.SoftThrowableAssertAlternative as(org.assertj.core.description.Description p0)`
- `protected org.assertj.core.api.ThrowableAssert getDelegate()`

---

## public class `org.assertj.core.api.SoftThrowableTypeAssert`<T extends java.lang.Throwable>
extends `org.assertj.core.api.ThrowableTypeAssert`  

**Constructors:**
- `public SoftThrowableTypeAssert(java.lang.Class p0, org.assertj.core.api.SoftAssertionsProvider p1)`

**Methods:**
- `protected org.assertj.core.api.ThrowableAssertAlternative buildThrowableTypeAssert(T p0)`
- `public org.assertj.core.api.SoftThrowableTypeAssert describedAs(org.assertj.core.description.Description p0)`

---

## public class `org.assertj.core.api.SpliteratorAssert`<ELEMENT extends java.lang.Object>
extends `org.assertj.core.api.AbstractSpliteratorAssert`  

**Constructors:**
- `protected SpliteratorAssert(java.util.Spliterator p0)`

**Methods:**
- `public static <ELEMENT extends java.lang.Object> org.assertj.core.api.SpliteratorAssert assertThatSpliterator(java.util.Spliterator p0)`

---

## public abstract interface `org.assertj.core.api.StandardSoftAssertionsProvider`
annotations: @org.assertj.core.util.CheckReturnValue  
implements `org.assertj.core.api.Java6StandardSoftAssertionsProvider`  

**Methods:**
- `public default org.assertj.core.api.PathAssert assertThat(java.nio.file.Path p0)`
- `public default org.assertj.core.api.DurationAssert assertThat(java.time.Duration p0)`
- `public default org.assertj.core.api.InstantAssert assertThat(java.time.Instant p0)`
- `public default org.assertj.core.api.LocalDateAssert assertThat(java.time.LocalDate p0)`
- `public default org.assertj.core.api.LocalDateTimeAssert assertThat(java.time.LocalDateTime p0)`
- `public default org.assertj.core.api.LocalTimeAssert assertThat(java.time.LocalTime p0)`
- `public default org.assertj.core.api.OffsetDateTimeAssert assertThat(java.time.OffsetDateTime p0)`
- `public default org.assertj.core.api.OffsetTimeAssert assertThat(java.time.OffsetTime p0)`
- `public default org.assertj.core.api.PeriodAssert assertThat(java.time.Period p0)`
- `public default org.assertj.core.api.ZonedDateTimeAssert assertThat(java.time.ZonedDateTime p0)`
- `public default <VALUE extends java.lang.Object> org.assertj.core.api.OptionalAssert assertThat(java.util.Optional p0)`
- `public default org.assertj.core.api.OptionalDoubleAssert assertThat(java.util.OptionalDouble p0)`
- `public default org.assertj.core.api.OptionalIntAssert assertThat(java.util.OptionalInt p0)`
- `public default org.assertj.core.api.OptionalLongAssert assertThat(java.util.OptionalLong p0)`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.SpliteratorAssert assertThat(java.util.Spliterator p0)`
- `public default <RESULT extends java.lang.Object> org.assertj.core.api.CompletableFutureAssert assertThat(java.util.concurrent.CompletableFuture p0)`
- `public default <RESULT extends java.lang.Object> org.assertj.core.api.CompletableFutureAssert assertThat(java.util.concurrent.CompletionStage p0)`
- `public default org.assertj.core.api.LongAdderAssert assertThat(java.util.concurrent.atomic.LongAdder p0)`
- `public default org.assertj.core.api.DoublePredicateAssert assertThat(java.util.function.DoublePredicate p0)`
- `public default org.assertj.core.api.IntPredicateAssert assertThat(java.util.function.IntPredicate p0)`
- `public default org.assertj.core.api.LongPredicateAssert assertThat(java.util.function.LongPredicate p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.PredicateAssert assertThat(java.util.function.Predicate p0)`
- `public default org.assertj.core.api.MatcherAssert assertThat(java.util.regex.Matcher p0)`
- `public default org.assertj.core.api.AbstractListAssert assertThat(java.util.stream.DoubleStream p0)`
- `public default org.assertj.core.api.AbstractListAssert assertThat(java.util.stream.IntStream p0)`
- `public default org.assertj.core.api.AbstractListAssert assertThat(java.util.stream.LongStream p0)`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.AbstractListAssert assertThat(java.util.stream.Stream p0)`
- `public default org.assertj.core.api.AbstractPathAssert assertThatPath(java.nio.file.Path p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.PredicateAssert assertThatPredicate(java.util.function.Predicate p0)`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.AbstractListAssert assertThatStream(java.util.stream.Stream p0)`

---

## public class `org.assertj.core.api.StringAssert`
extends `org.assertj.core.api.AbstractStringAssert`  

**Constructors:**
- `public StringAssert(java.lang.String p0)`

---

## public class `org.assertj.core.api.ThrowableAssert`<ACTUAL extends java.lang.Throwable>
extends `org.assertj.core.api.AbstractThrowableAssert`  

**Constructors:**
- `public ThrowableAssert(ACTUAL p0)`
- `public ThrowableAssert(java.util.concurrent.Callable p0)`

**Methods:**
- `public static java.lang.Throwable catchThrowable(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public static <THROWABLE extends java.lang.Throwable> THROWABLE catchThrowableOfType(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0, java.lang.Class p1)`

---

## public abstract static interface `org.assertj.core.api.ThrowableAssert$ThrowingCallable`

**Methods:**
- `public abstract void call() throws java.lang.Throwable`

---

## public class `org.assertj.core.api.ThrowableAssertAlternative`<ACTUAL extends java.lang.Throwable>
extends `org.assertj.core.api.AbstractObjectAssert`  

**Constructors:**
- `public ThrowableAssertAlternative(ACTUAL p0)`

**Methods:**
- `public org.assertj.core.api.ThrowableAssertAlternative as(org.assertj.core.description.Description p0)`
- `public org.assertj.core.api.ThrowableAssertAlternative describedAs(java.lang.String p0, java.lang.Object... p1)`
- `public org.assertj.core.api.ThrowableAssertAlternative describedAs(org.assertj.core.description.Description p0)`
- `protected org.assertj.core.api.ThrowableAssert getDelegate()`
- `public org.assertj.core.api.ThrowableAssertAlternative havingCause()`
- `public org.assertj.core.api.ThrowableAssertAlternative havingRootCause()`
- `public org.assertj.core.api.ThrowableAssertAlternative withCause(java.lang.Throwable p0)`
- `public org.assertj.core.api.ThrowableAssertAlternative withCauseExactlyInstanceOf(java.lang.Class p0)`
- `public org.assertj.core.api.ThrowableAssertAlternative withCauseInstanceOf(java.lang.Class p0)`
- `public org.assertj.core.api.ThrowableAssertAlternative withMessage(java.lang.String p0)`
- `public org.assertj.core.api.ThrowableAssertAlternative withMessage(java.lang.String p0, java.lang.Object... p1)`
- `public org.assertj.core.api.ThrowableAssertAlternative withMessageContaining(java.lang.String p0)`
- `public org.assertj.core.api.ThrowableAssertAlternative withMessageContaining(java.lang.String p0, java.lang.Object... p1)`
- `public org.assertj.core.api.ThrowableAssertAlternative withMessageContainingAll(java.lang.CharSequence... p0)`
- `public org.assertj.core.api.ThrowableAssertAlternative withMessageEndingWith(java.lang.String p0)`
- `public org.assertj.core.api.ThrowableAssertAlternative withMessageEndingWith(java.lang.String p0, java.lang.Object... p1)`
- `public org.assertj.core.api.ThrowableAssertAlternative withMessageMatching(java.lang.String p0)`
- `public org.assertj.core.api.ThrowableAssertAlternative withMessageNotContaining(java.lang.String p0)`
- `public org.assertj.core.api.ThrowableAssertAlternative withMessageNotContainingAny(java.lang.CharSequence... p0)`
- `public org.assertj.core.api.ThrowableAssertAlternative withMessageStartingWith(java.lang.String p0)`
- `public org.assertj.core.api.ThrowableAssertAlternative withMessageStartingWith(java.lang.String p0, java.lang.Object... p1)`
- `public org.assertj.core.api.ThrowableAssertAlternative withNoCause()`
- `public org.assertj.core.api.ThrowableAssertAlternative withRootCauseExactlyInstanceOf(java.lang.Class p0)`
- `public org.assertj.core.api.ThrowableAssertAlternative withRootCauseInstanceOf(java.lang.Class p0)`
- `public org.assertj.core.api.ThrowableAssertAlternative withStackTraceContaining(java.lang.String p0)`
- `public org.assertj.core.api.ThrowableAssertAlternative withStackTraceContaining(java.lang.String p0, java.lang.Object... p1)`

---

## public class `org.assertj.core.api.ThrowableTypeAssert`<T extends java.lang.Throwable>
implements `org.assertj.core.api.Descriptable<org.assertj.core.api.ThrowableTypeAssert<T>>`  

**Constructors:**
- `public ThrowableTypeAssert(java.lang.Class p0)`

**Fields:**
- `protected org.assertj.core.description.Description description`
- `protected final java.lang.Class expectedThrowableType`

**Methods:**
- `protected org.assertj.core.api.ThrowableAssertAlternative buildThrowableTypeAssert(T p0)`
- `public org.assertj.core.api.ThrowableTypeAssert describedAs(org.assertj.core.description.Description p0)`
- `public org.assertj.core.api.ThrowableAssertAlternative isThrownBy(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`

---

## public abstract interface `org.assertj.core.api.ThrowingConsumer`<T extends java.lang.Object>
annotations: @java.lang.FunctionalInterface  
implements `java.util.function.Consumer<T>`  

**Methods:**
- `public default void accept(T p0)`
- `public abstract void acceptThrows(T p0) throws java.lang.Throwable`

---

## public class `org.assertj.core.api.UniversalComparableAssert`<T extends java.lang.Object>
extends `org.assertj.core.api.AbstractUniversalComparableAssert`  

**Constructors:**
- `protected UniversalComparableAssert(java.lang.Comparable p0)`

---

## public class `org.assertj.core.api.UriAssert`
extends `org.assertj.core.api.AbstractUriAssert`  

**Constructors:**
- `public UriAssert(java.net.URI p0)`

---

## public class `org.assertj.core.api.UrlAssert`
extends `org.assertj.core.api.AbstractUrlAssert`  

**Constructors:**
- `public UrlAssert(java.net.URL p0)`

---

## public abstract interface `org.assertj.core.api.WithAssertions`
annotations: @org.assertj.core.util.CheckReturnValue  
implements `org.assertj.core.api.InstanceOfAssertFactories`  

**Methods:**
- `public default <T extends java.lang.Object> org.assertj.core.api.Condition allOf(java.lang.Iterable p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.Condition allOf(org.assertj.core.api.Condition... p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.Condition anyOf(java.lang.Iterable p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.Condition anyOf(org.assertj.core.api.Condition... p0)`
- `public default <T extends java.lang.Object, ASSERT extends org.assertj.core.api.AbstractAssert<? extends java.lang.Object, ? extends java.lang.Object>> org.assertj.core.api.InstanceOfAssertFactory as(org.assertj.core.api.InstanceOfAssertFactory p0)`
- `public default <ACTUAL extends java.lang.Iterable<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.ClassBasedNavigableIterableAssert assertThat(ACTUAL p0, java.lang.Class p1)`
- `public default <T extends org.assertj.core.api.AssertDelegateTarget> T assertThat(T p0)`
- `public default <T extends java.lang.Comparable<? super T>> org.assertj.core.api.AbstractComparableAssert assertThat(T p0)`
- `public default <T extends java.lang.Throwable> org.assertj.core.api.AbstractThrowableAssert assertThat(T p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.ObjectAssert assertThat(T p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.ObjectArrayAssert assertThat(T[] p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.Object2DArrayAssert assertThat(T[][] p0)`
- `public default org.assertj.core.api.AbstractBooleanAssert assertThat(boolean p0)`
- `public default org.assertj.core.api.AbstractBooleanArrayAssert assertThat(boolean[] p0)`
- `public default org.assertj.core.api.Boolean2DArrayAssert assertThat(boolean[][] p0)`
- `public default org.assertj.core.api.AbstractByteAssert assertThat(byte p0)`
- `public default org.assertj.core.api.AbstractByteArrayAssert assertThat(byte[] p0)`
- `public default org.assertj.core.api.Byte2DArrayAssert assertThat(byte[][] p0)`
- `public default org.assertj.core.api.AbstractCharacterAssert assertThat(char p0)`
- `public default org.assertj.core.api.AbstractCharArrayAssert assertThat(char[] p0)`
- `public default org.assertj.core.api.Char2DArrayAssert assertThat(char[][] p0)`
- `public default org.assertj.core.api.AbstractDoubleAssert assertThat(double p0)`
- `public default org.assertj.core.api.AbstractDoubleArrayAssert assertThat(double[] p0)`
- `public default org.assertj.core.api.Double2DArrayAssert assertThat(double[][] p0)`
- `public default org.assertj.core.api.AbstractFloatAssert assertThat(float p0)`
- `public default org.assertj.core.api.AbstractFloatArrayAssert assertThat(float[] p0)`
- `public default org.assertj.core.api.Float2DArrayAssert assertThat(float[][] p0)`
- `public default org.assertj.core.api.AbstractIntegerAssert assertThat(int p0)`
- `public default org.assertj.core.api.AbstractIntArrayAssert assertThat(int[] p0)`
- `public default org.assertj.core.api.Int2DArrayAssert assertThat(int[][] p0)`
- `public default org.assertj.core.api.AbstractFileAssert assertThat(java.io.File p0)`
- `public default org.assertj.core.api.AbstractInputStreamAssert assertThat(java.io.InputStream p0)`
- `public default org.assertj.core.api.AbstractBooleanAssert assertThat(java.lang.Boolean p0)`
- `public default org.assertj.core.api.AbstractByteAssert assertThat(java.lang.Byte p0)`
- `public default org.assertj.core.api.AbstractCharSequenceAssert assertThat(java.lang.CharSequence p0)`
- `public default org.assertj.core.api.AbstractCharacterAssert assertThat(java.lang.Character p0)`
- `public default org.assertj.core.api.ClassAssert assertThat(java.lang.Class p0)`
- `public default org.assertj.core.api.AbstractDoubleAssert assertThat(java.lang.Double p0)`
- `public default org.assertj.core.api.AbstractFloatAssert assertThat(java.lang.Float p0)`
- `public default org.assertj.core.api.AbstractIntegerAssert assertThat(java.lang.Integer p0)`
- `public default <ACTUAL extends java.lang.Iterable<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.FactoryBasedNavigableIterableAssert assertThat(java.lang.Iterable p0, org.assertj.core.api.AssertFactory p1)`
- `public default <T extends java.lang.Object> org.assertj.core.api.IterableAssert assertThat(java.lang.Iterable p0)`
- `public default org.assertj.core.api.AbstractLongAssert assertThat(java.lang.Long p0)`
- `public default org.assertj.core.api.AbstractShortAssert assertThat(java.lang.Short p0)`
- `public default org.assertj.core.api.AbstractStringAssert assertThat(java.lang.String p0)`
- `public default org.assertj.core.api.AbstractCharSequenceAssert assertThat(java.lang.StringBuffer p0)`
- `public default org.assertj.core.api.AbstractCharSequenceAssert assertThat(java.lang.StringBuilder p0)`
- `public default org.assertj.core.api.AbstractBigDecimalAssert assertThat(java.math.BigDecimal p0)`
- `public default org.assertj.core.api.AbstractBigIntegerAssert assertThat(java.math.BigInteger p0)`
- `public default org.assertj.core.api.AbstractUriAssert assertThat(java.net.URI p0)`
- `public default org.assertj.core.api.AbstractUrlAssert assertThat(java.net.URL p0)`
- `public default org.assertj.core.api.AbstractPathAssert assertThat(java.nio.file.Path p0)`
- `public default org.assertj.core.api.AbstractDurationAssert assertThat(java.time.Duration p0)`
- `public default org.assertj.core.api.AbstractInstantAssert assertThat(java.time.Instant p0)`
- `public default org.assertj.core.api.AbstractLocalDateAssert assertThat(java.time.LocalDate p0)`
- `public default org.assertj.core.api.AbstractLocalDateTimeAssert assertThat(java.time.LocalDateTime p0)`
- `public default org.assertj.core.api.AbstractLocalTimeAssert assertThat(java.time.LocalTime p0)`
- `public default org.assertj.core.api.AbstractOffsetDateTimeAssert assertThat(java.time.OffsetDateTime p0)`
- `public default org.assertj.core.api.AbstractOffsetTimeAssert assertThat(java.time.OffsetTime p0)`
- `public default org.assertj.core.api.AbstractPeriodAssert assertThat(java.time.Period p0)`
- `public default org.assertj.core.api.AbstractZonedDateTimeAssert assertThat(java.time.ZonedDateTime p0)`
- `public default <E extends java.lang.Object> org.assertj.core.api.AbstractCollectionAssert assertThat(java.util.Collection p0)`
- `public default org.assertj.core.api.AbstractDateAssert assertThat(java.util.Date p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.IteratorAssert assertThat(java.util.Iterator p0)`
- `public default <ELEMENT extends java.lang.Object, ACTUAL extends java.util.List<? extends ELEMENT>, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.ClassBasedNavigableListAssert assertThat(java.util.List p0, java.lang.Class p1)`
- `public default <ACTUAL extends java.util.List<? extends ELEMENT>, ELEMENT extends java.lang.Object, ELEMENT_ASSERT extends org.assertj.core.api.AbstractAssert<ELEMENT_ASSERT, ELEMENT>> org.assertj.core.api.FactoryBasedNavigableListAssert assertThat(java.util.List p0, org.assertj.core.api.AssertFactory p1)`
- `public default <T extends java.lang.Object> org.assertj.core.api.ListAssert assertThat(java.util.List p0)`
- `public default <K extends java.lang.Object, V extends java.lang.Object> org.assertj.core.api.MapAssert assertThat(java.util.Map p0)`
- `public default <VALUE extends java.lang.Object> org.assertj.core.api.OptionalAssert assertThat(java.util.Optional p0)`
- `public default org.assertj.core.api.OptionalDoubleAssert assertThat(java.util.OptionalDouble p0)`
- `public default org.assertj.core.api.OptionalIntAssert assertThat(java.util.OptionalInt p0)`
- `public default org.assertj.core.api.OptionalLongAssert assertThat(java.util.OptionalLong p0)`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.SpliteratorAssert assertThat(java.util.Spliterator p0)`
- `public default <RESULT extends java.lang.Object> org.assertj.core.api.CompletableFutureAssert assertThat(java.util.concurrent.CompletableFuture p0)`
- `public default <RESULT extends java.lang.Object> org.assertj.core.api.CompletableFutureAssert assertThat(java.util.concurrent.CompletionStage p0)`
- `public default <RESULT extends java.lang.Object> org.assertj.core.api.FutureAssert assertThat(java.util.concurrent.Future p0)`
- `public default org.assertj.core.api.AtomicBooleanAssert assertThat(java.util.concurrent.atomic.AtomicBoolean p0)`
- `public default org.assertj.core.api.AtomicIntegerAssert assertThat(java.util.concurrent.atomic.AtomicInteger p0)`
- `public default org.assertj.core.api.AtomicIntegerArrayAssert assertThat(java.util.concurrent.atomic.AtomicIntegerArray p0)`
- `public default <OBJECT extends java.lang.Object> org.assertj.core.api.AtomicIntegerFieldUpdaterAssert assertThat(java.util.concurrent.atomic.AtomicIntegerFieldUpdater p0)`
- `public default org.assertj.core.api.AtomicLongAssert assertThat(java.util.concurrent.atomic.AtomicLong p0)`
- `public default org.assertj.core.api.AtomicLongArrayAssert assertThat(java.util.concurrent.atomic.AtomicLongArray p0)`
- `public default <OBJECT extends java.lang.Object> org.assertj.core.api.AtomicLongFieldUpdaterAssert assertThat(java.util.concurrent.atomic.AtomicLongFieldUpdater p0)`
- `public default <VALUE extends java.lang.Object> org.assertj.core.api.AtomicMarkableReferenceAssert assertThat(java.util.concurrent.atomic.AtomicMarkableReference p0)`
- `public default <VALUE extends java.lang.Object> org.assertj.core.api.AtomicReferenceAssert assertThat(java.util.concurrent.atomic.AtomicReference p0)`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.AtomicReferenceArrayAssert assertThat(java.util.concurrent.atomic.AtomicReferenceArray p0)`
- `public default <FIELD extends java.lang.Object, OBJECT extends java.lang.Object> org.assertj.core.api.AtomicReferenceFieldUpdaterAssert assertThat(java.util.concurrent.atomic.AtomicReferenceFieldUpdater p0)`
- `public default <VALUE extends java.lang.Object> org.assertj.core.api.AtomicStampedReferenceAssert assertThat(java.util.concurrent.atomic.AtomicStampedReference p0)`
- `public default org.assertj.core.api.LongAdderAssert assertThat(java.util.concurrent.atomic.LongAdder p0)`
- `public default org.assertj.core.api.DoublePredicateAssert assertThat(java.util.function.DoublePredicate p0)`
- `public default org.assertj.core.api.IntPredicateAssert assertThat(java.util.function.IntPredicate p0)`
- `public default org.assertj.core.api.LongPredicateAssert assertThat(java.util.function.LongPredicate p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.PredicateAssert assertThat(java.util.function.Predicate p0)`
- `public default org.assertj.core.api.MatcherAssert assertThat(java.util.regex.Matcher p0)`
- `public default org.assertj.core.api.ListAssert assertThat(java.util.stream.DoubleStream p0)`
- `public default org.assertj.core.api.ListAssert assertThat(java.util.stream.IntStream p0)`
- `public default org.assertj.core.api.ListAssert assertThat(java.util.stream.LongStream p0)`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.ListAssert assertThat(java.util.stream.Stream p0)`
- `public default org.assertj.core.api.AbstractLongAssert assertThat(long p0)`
- `public default org.assertj.core.api.AbstractLongArrayAssert assertThat(long[] p0)`
- `public default org.assertj.core.api.Long2DArrayAssert assertThat(long[][] p0)`
- `public default <T extends java.lang.Object> T assertThat(org.assertj.core.api.AssertProvider p0)`
- `public default org.assertj.core.api.AbstractShortAssert assertThat(short p0)`
- `public default org.assertj.core.api.AbstractShortArrayAssert assertThat(short[] p0)`
- `public default org.assertj.core.api.Short2DArrayAssert assertThat(short[][] p0)`
- `public default org.assertj.core.api.AbstractThrowableAssert assertThatCode(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public default <E extends java.lang.Object> org.assertj.core.api.AbstractCollectionAssert assertThatCollection(java.util.Collection p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.AbstractUniversalComparableAssert assertThatComparable(java.lang.Comparable p0)`
- `public default org.assertj.core.api.ThrowableTypeAssert assertThatException()`
- `public default <T extends java.lang.Throwable> org.assertj.core.api.ThrowableTypeAssert assertThatExceptionOfType(java.lang.Class p0)`
- `public default org.assertj.core.api.ThrowableTypeAssert assertThatIOException()`
- `public default org.assertj.core.api.ThrowableTypeAssert assertThatIllegalArgumentException()`
- `public default org.assertj.core.api.ThrowableTypeAssert assertThatIllegalStateException()`
- `public default org.assertj.core.api.ThrowableTypeAssert assertThatIndexOutOfBoundsException()`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.IterableAssert assertThatIterable(java.lang.Iterable p0)`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.IteratorAssert assertThatIterator(java.util.Iterator p0)`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.ListAssert assertThatList(java.util.List p0)`
- `public default org.assertj.core.api.NotThrownAssert assertThatNoException()`
- `public default org.assertj.core.api.ThrowableTypeAssert assertThatNullPointerException()`
- `public default <T extends java.lang.Object> org.assertj.core.api.ObjectAssert assertThatObject(T p0)`
- `public default org.assertj.core.api.AbstractPathAssert assertThatPath(java.nio.file.Path p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.PredicateAssert assertThatPredicate(java.util.function.Predicate p0)`
- `public default org.assertj.core.api.ThrowableTypeAssert assertThatReflectiveOperationException()`
- `public default org.assertj.core.api.ThrowableTypeAssert assertThatRuntimeException()`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.ListAssert assertThatStream(java.util.stream.Stream p0)`
- `public default org.assertj.core.api.AbstractThrowableAssert assertThatThrownBy(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public default org.assertj.core.api.AbstractThrowableAssert assertThatThrownBy(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0, java.lang.String p1, java.lang.Object... p2)`
- `public default <T extends java.lang.Object> org.assertj.core.api.ObjectAssert assertWith(T p0, java.util.function.Consumer... p1)`
- `public default org.assertj.core.data.Index atIndex(int p0)`
- `public default org.assertj.core.data.Offset byLessThan(java.lang.Byte p0)`
- `public default org.assertj.core.data.Offset byLessThan(java.lang.Double p0)`
- `public default org.assertj.core.data.Offset byLessThan(java.lang.Float p0)`
- `public default org.assertj.core.data.Offset byLessThan(java.lang.Integer p0)`
- `public default org.assertj.core.data.Offset byLessThan(java.lang.Long p0)`
- `public default org.assertj.core.data.Offset byLessThan(java.lang.Short p0)`
- `public default org.assertj.core.data.Offset byLessThan(java.math.BigDecimal p0)`
- `public default org.assertj.core.data.Offset byLessThan(java.math.BigInteger p0)`
- `public default org.assertj.core.data.TemporalUnitOffset byLessThan(long p0, java.time.temporal.TemporalUnit p1)`
- `public default java.lang.Exception catchException(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public default java.io.IOException catchIOException(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public default java.lang.IllegalArgumentException catchIllegalArgumentException(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public default java.lang.IllegalStateException catchIllegalStateException(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public default java.lang.IndexOutOfBoundsException catchIndexOutOfBoundsException(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public default java.lang.NullPointerException catchNullPointerException(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public default java.lang.ReflectiveOperationException catchReflectiveOperationException(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public default java.lang.RuntimeException catchRuntimeException(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public default java.lang.Throwable catchThrowable(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public default <THROWABLE extends java.lang.Throwable> THROWABLE catchThrowableOfType(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0, java.lang.Class p1)`
- `public default java.lang.String contentOf(java.io.File p0)`
- `public default java.lang.String contentOf(java.io.File p0, java.lang.String p1)`
- `public default java.lang.String contentOf(java.io.File p0, java.nio.charset.Charset p1)`
- `public default java.lang.String contentOf(java.net.URL p0)`
- `public default java.lang.String contentOf(java.net.URL p0, java.lang.String p1)`
- `public default java.lang.String contentOf(java.net.URL p0, java.nio.charset.Charset p1)`
- `public default <T extends java.lang.Object> org.assertj.core.condition.DoesNotHave doesNotHave(org.assertj.core.api.Condition p0)`
- `public default <K extends java.lang.Object, V extends java.lang.Object> org.assertj.core.data.MapEntry entry(K p0, V p1)`
- `public default org.assertj.core.groups.Properties extractProperty(java.lang.String p0)`
- `public default <T extends java.lang.Object> org.assertj.core.groups.Properties extractProperty(java.lang.String p0, java.lang.Class p1)`
- `public default <T extends java.lang.Object> T fail(java.lang.String p0)`
- `public default <T extends java.lang.Object> T fail(java.lang.String p0, java.lang.Object... p1)`
- `public default <T extends java.lang.Object> T fail(java.lang.String p0, java.lang.Throwable p1)`
- `public default <T extends java.lang.Object> T failBecauseExceptionWasNotThrown(java.lang.Class p0)`
- `public default <E extends java.lang.Object> org.assertj.core.api.filter.Filters filter(E[] p0)`
- `public default <E extends java.lang.Object> org.assertj.core.api.filter.Filters filter(java.lang.Iterable p0)`
- `public default <F extends java.lang.Object, T extends java.lang.Object> java.util.function.Function from(java.util.function.Function p0)`
- `public default org.assertj.core.api.filter.InFilter in(java.lang.Object... p0)`
- `public default java.util.List linesOf(java.io.File p0)`
- `public default java.util.List linesOf(java.io.File p0, java.lang.String p1)`
- `public default java.util.List linesOf(java.io.File p0, java.nio.charset.Charset p1)`
- `public default java.util.List linesOf(java.net.URL p0)`
- `public default java.util.List linesOf(java.net.URL p0, java.lang.String p1)`
- `public default java.util.List linesOf(java.net.URL p0, java.nio.charset.Charset p1)`
- `public default java.util.List linesOf(java.nio.file.Path p0)`
- `public default java.util.List linesOf(java.nio.file.Path p0, java.lang.String p1)`
- `public default java.util.List linesOf(java.nio.file.Path p0, java.nio.charset.Charset p1)`
- `public default org.assertj.core.api.filter.NotFilter not(java.lang.Object p0)`
- `public default <T extends java.lang.Object> org.assertj.core.condition.Not not(org.assertj.core.api.Condition p0)`
- `public default org.assertj.core.api.filter.NotInFilter notIn(java.lang.Object... p0)`
- `public default org.assertj.core.data.Offset offset(java.lang.Double p0)`
- `public default org.assertj.core.data.Offset offset(java.lang.Float p0)`
- `public default void registerCustomDateFormat(java.lang.String p0)`
- `public default void registerCustomDateFormat(java.text.DateFormat p0)`
- `public default <T extends java.lang.Object> void registerFormatterForType(java.lang.Class p0, java.util.function.Function p1)`
- `public default void setAllowComparingPrivateFields(boolean p0)`
- `public default void setAllowExtractingPrivateFields(boolean p0)`
- `public static void setDescriptionConsumer(java.util.function.Consumer p0)`
- `public default void setExtractBareNamePropertyMethods(boolean p0)`
- `public default void setLenientDateParsing(boolean p0)`
- `public default void setMaxElementsForPrinting(int p0)`
- `public default void setMaxLengthForSingleLineDescription(int p0)`
- `public default void setMaxStackTraceElementsDisplayed(int p0)`
- `public static void setPrintAssertionsDescription(boolean p0)`
- `public default void setRemoveAssertJRelatedElementsFromStackTrace(boolean p0)`
- `public default <T extends java.lang.Object> T shouldHaveThrown(java.lang.Class p0)`
- `public default org.assertj.core.groups.Tuple tuple(java.lang.Object... p0)`
- `public default void useDefaultDateFormatsOnly()`
- `public default void useDefaultRepresentation()`
- `public default void useRepresentation(org.assertj.core.presentation.Representation p0)`
- `public default java.time.Duration withMarginOf(java.time.Duration p0)`
- `public default org.assertj.core.data.Offset withPrecision(java.lang.Double p0)`
- `public default org.assertj.core.data.Offset withPrecision(java.lang.Float p0)`
- `public default org.assertj.core.data.Offset within(java.lang.Byte p0)`
- `public default org.assertj.core.data.Offset within(java.lang.Double p0)`
- `public default org.assertj.core.data.Offset within(java.lang.Float p0)`
- `public default org.assertj.core.data.Offset within(java.lang.Integer p0)`
- `public default org.assertj.core.data.Offset within(java.lang.Long p0)`
- `public default org.assertj.core.data.Offset within(java.lang.Short p0)`
- `public default org.assertj.core.data.Offset within(java.math.BigDecimal p0)`
- `public default org.assertj.core.data.Offset within(java.math.BigInteger p0)`
- `public default org.assertj.core.data.TemporalUnitOffset within(long p0, java.time.temporal.TemporalUnit p1)`
- `public default org.assertj.core.data.Percentage withinPercentage(java.lang.Double p0)`
- `public default org.assertj.core.data.Percentage withinPercentage(java.lang.Integer p0)`
- `public default org.assertj.core.data.Percentage withinPercentage(java.lang.Long p0)`

---

## public abstract interface `org.assertj.core.api.WithAssumptions`
annotations: @org.assertj.core.util.CheckReturnValue  

**Methods:**
- `public default <T extends java.lang.Comparable<? super T>> org.assertj.core.api.AbstractComparableAssert assumeThat(T p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.ObjectAssert assumeThat(T p0)`
- `public default <T extends java.lang.Throwable> org.assertj.core.api.AbstractThrowableAssert assumeThat(T p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.ObjectArrayAssert assumeThat(T[] p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.Object2DArrayAssert assumeThat(T[][] p0)`
- `public default org.assertj.core.api.AbstractBooleanAssert assumeThat(boolean p0)`
- `public default org.assertj.core.api.AbstractBooleanArrayAssert assumeThat(boolean[] p0)`
- `public default org.assertj.core.api.Boolean2DArrayAssert assumeThat(boolean[][] p0)`
- `public default org.assertj.core.api.AbstractByteAssert assumeThat(byte p0)`
- `public default org.assertj.core.api.AbstractByteArrayAssert assumeThat(byte[] p0)`
- `public default org.assertj.core.api.Byte2DArrayAssert assumeThat(byte[][] p0)`
- `public default org.assertj.core.api.AbstractCharacterAssert assumeThat(char p0)`
- `public default org.assertj.core.api.AbstractCharArrayAssert assumeThat(char[] p0)`
- `public default org.assertj.core.api.Char2DArrayAssert assumeThat(char[][] p0)`
- `public default org.assertj.core.api.AbstractDoubleAssert assumeThat(double p0)`
- `public default org.assertj.core.api.AbstractDoubleArrayAssert assumeThat(double[] p0)`
- `public default org.assertj.core.api.Double2DArrayAssert assumeThat(double[][] p0)`
- `public default org.assertj.core.api.AbstractFloatAssert assumeThat(float p0)`
- `public default org.assertj.core.api.AbstractFloatArrayAssert assumeThat(float[] p0)`
- `public default org.assertj.core.api.Float2DArrayAssert assumeThat(float[][] p0)`
- `public default org.assertj.core.api.AbstractIntegerAssert assumeThat(int p0)`
- `public default org.assertj.core.api.AbstractIntArrayAssert assumeThat(int[] p0)`
- `public default org.assertj.core.api.Int2DArrayAssert assumeThat(int[][] p0)`
- `public default org.assertj.core.api.AbstractFileAssert assumeThat(java.io.File p0)`
- `public default org.assertj.core.api.AbstractInputStreamAssert assumeThat(java.io.InputStream p0)`
- `public default org.assertj.core.api.AbstractBooleanAssert assumeThat(java.lang.Boolean p0)`
- `public default org.assertj.core.api.AbstractByteAssert assumeThat(java.lang.Byte p0)`
- `public default org.assertj.core.api.AbstractCharSequenceAssert assumeThat(java.lang.CharSequence p0)`
- `public default org.assertj.core.api.AbstractCharacterAssert assumeThat(java.lang.Character p0)`
- `public default org.assertj.core.api.ClassAssert assumeThat(java.lang.Class p0)`
- `public default org.assertj.core.api.AbstractDoubleAssert assumeThat(java.lang.Double p0)`
- `public default org.assertj.core.api.AbstractFloatAssert assumeThat(java.lang.Float p0)`
- `public default org.assertj.core.api.AbstractIntegerAssert assumeThat(java.lang.Integer p0)`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.IterableAssert assumeThat(java.lang.Iterable p0)`
- `public default org.assertj.core.api.AbstractLongAssert assumeThat(java.lang.Long p0)`
- `public default org.assertj.core.api.AbstractShortAssert assumeThat(java.lang.Short p0)`
- `public default org.assertj.core.api.AbstractStringAssert assumeThat(java.lang.String p0)`
- `public default org.assertj.core.api.AbstractCharSequenceAssert assumeThat(java.lang.StringBuffer p0)`
- `public default org.assertj.core.api.AbstractCharSequenceAssert assumeThat(java.lang.StringBuilder p0)`
- `public default org.assertj.core.api.AbstractBigDecimalAssert assumeThat(java.math.BigDecimal p0)`
- `public default org.assertj.core.api.AbstractBigIntegerAssert assumeThat(java.math.BigInteger p0)`
- `public default org.assertj.core.api.AbstractUriAssert assumeThat(java.net.URI p0)`
- `public default org.assertj.core.api.AbstractUrlAssert assumeThat(java.net.URL p0)`
- `public default org.assertj.core.api.AbstractPathAssert assumeThat(java.nio.file.Path p0)`
- `public default org.assertj.core.api.AbstractDurationAssert assumeThat(java.time.Duration p0)`
- `public default org.assertj.core.api.AbstractInstantAssert assumeThat(java.time.Instant p0)`
- `public default org.assertj.core.api.AbstractLocalDateAssert assumeThat(java.time.LocalDate p0)`
- `public default org.assertj.core.api.AbstractLocalDateTimeAssert assumeThat(java.time.LocalDateTime p0)`
- `public default org.assertj.core.api.AbstractLocalTimeAssert assumeThat(java.time.LocalTime p0)`
- `public default org.assertj.core.api.AbstractOffsetDateTimeAssert assumeThat(java.time.OffsetDateTime p0)`
- `public default org.assertj.core.api.AbstractOffsetTimeAssert assumeThat(java.time.OffsetTime p0)`
- `public default org.assertj.core.api.AbstractPeriodAssert assumeThat(java.time.Period p0)`
- `public default org.assertj.core.api.AbstractZonedDateTimeAssert assumeThat(java.time.ZonedDateTime p0)`
- `public default org.assertj.core.api.AbstractDateAssert assumeThat(java.util.Date p0)`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.IteratorAssert assumeThat(java.util.Iterator p0)`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.FactoryBasedNavigableListAssert assumeThat(java.util.List p0)`
- `public default <K extends java.lang.Object, V extends java.lang.Object> org.assertj.core.api.MapAssert assumeThat(java.util.Map p0)`
- `public default <VALUE extends java.lang.Object> org.assertj.core.api.OptionalAssert assumeThat(java.util.Optional p0)`
- `public default org.assertj.core.api.OptionalDoubleAssert assumeThat(java.util.OptionalDouble p0)`
- `public default org.assertj.core.api.OptionalIntAssert assumeThat(java.util.OptionalInt p0)`
- `public default org.assertj.core.api.OptionalLongAssert assumeThat(java.util.OptionalLong p0)`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.AbstractSpliteratorAssert assumeThat(java.util.Spliterator p0)`
- `public default <RESULT extends java.lang.Object> org.assertj.core.api.CompletableFutureAssert assumeThat(java.util.concurrent.CompletableFuture p0)`
- `public default <RESULT extends java.lang.Object> org.assertj.core.api.CompletableFutureAssert assumeThat(java.util.concurrent.CompletionStage p0)`
- `public default <RESULT extends java.lang.Object> org.assertj.core.api.AbstractFutureAssert assumeThat(java.util.concurrent.Future p0)`
- `public default org.assertj.core.api.AtomicBooleanAssert assumeThat(java.util.concurrent.atomic.AtomicBoolean p0)`
- `public default org.assertj.core.api.AtomicIntegerAssert assumeThat(java.util.concurrent.atomic.AtomicInteger p0)`
- `public default org.assertj.core.api.AtomicIntegerArrayAssert assumeThat(java.util.concurrent.atomic.AtomicIntegerArray p0)`
- `public default <OBJECT extends java.lang.Object> org.assertj.core.api.AtomicIntegerFieldUpdaterAssert assumeThat(java.util.concurrent.atomic.AtomicIntegerFieldUpdater p0)`
- `public default org.assertj.core.api.AtomicLongAssert assumeThat(java.util.concurrent.atomic.AtomicLong p0)`
- `public default org.assertj.core.api.AtomicLongArrayAssert assumeThat(java.util.concurrent.atomic.AtomicLongArray p0)`
- `public default <OBJECT extends java.lang.Object> org.assertj.core.api.AtomicLongFieldUpdaterAssert assumeThat(java.util.concurrent.atomic.AtomicLongFieldUpdater p0)`
- `public default <VALUE extends java.lang.Object> org.assertj.core.api.AtomicMarkableReferenceAssert assumeThat(java.util.concurrent.atomic.AtomicMarkableReference p0)`
- `public default <VALUE extends java.lang.Object> org.assertj.core.api.AtomicReferenceAssert assumeThat(java.util.concurrent.atomic.AtomicReference p0)`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.AtomicReferenceArrayAssert assumeThat(java.util.concurrent.atomic.AtomicReferenceArray p0)`
- `public default <FIELD extends java.lang.Object, OBJECT extends java.lang.Object> org.assertj.core.api.AtomicReferenceFieldUpdaterAssert assumeThat(java.util.concurrent.atomic.AtomicReferenceFieldUpdater p0)`
- `public default <VALUE extends java.lang.Object> org.assertj.core.api.AtomicStampedReferenceAssert assumeThat(java.util.concurrent.atomic.AtomicStampedReference p0)`
- `public default org.assertj.core.api.LongAdderAssert assumeThat(java.util.concurrent.atomic.LongAdder p0)`
- `public default org.assertj.core.api.DoublePredicateAssert assumeThat(java.util.function.DoublePredicate p0)`
- `public default org.assertj.core.api.IntPredicateAssert assumeThat(java.util.function.IntPredicate p0)`
- `public default org.assertj.core.api.LongPredicateAssert assumeThat(java.util.function.LongPredicate p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.PredicateAssert assumeThat(java.util.function.Predicate p0)`
- `public default org.assertj.core.api.MatcherAssert assumeThat(java.util.regex.Matcher p0)`
- `public default org.assertj.core.api.AbstractListAssert assumeThat(java.util.stream.DoubleStream p0)`
- `public default org.assertj.core.api.AbstractListAssert assumeThat(java.util.stream.IntStream p0)`
- `public default org.assertj.core.api.AbstractListAssert assumeThat(java.util.stream.LongStream p0)`
- `public default <ELEMENT extends java.lang.Object> org.assertj.core.api.AbstractListAssert assumeThat(java.util.stream.Stream p0)`
- `public default org.assertj.core.api.AbstractLongAssert assumeThat(long p0)`
- `public default org.assertj.core.api.AbstractLongArrayAssert assumeThat(long[] p0)`
- `public default org.assertj.core.api.Long2DArrayAssert assumeThat(long[][] p0)`
- `public default org.assertj.core.api.AbstractShortAssert assumeThat(short p0)`
- `public default org.assertj.core.api.AbstractShortArrayAssert assumeThat(short[] p0)`
- `public default org.assertj.core.api.Short2DArrayAssert assumeThat(short[][] p0)`
- `public default org.assertj.core.api.AbstractThrowableAssert assumeThatCode(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public default <T extends java.lang.Object> org.assertj.core.api.ObjectAssert assumeThatObject(T p0)`
- `public default org.assertj.core.api.AbstractThrowableAssert assumeThatThrownBy(org.assertj.core.api.ThrowableAssert$ThrowingCallable p0)`
- `public default void setPreferredAssumptionException(org.assertj.core.configuration.PreferredAssumptionException p0)`

---

## public class `org.assertj.core.api.WithThrowable`

**Methods:**
- `public org.assertj.core.api.ThrowableAssertAlternative withThrowableOfType(java.lang.Class p0)`

---

## public class `org.assertj.core.api.WritableAssertionInfo`
implements `org.assertj.core.api.AssertionInfo`  

**Constructors:**
- `public WritableAssertionInfo()`
- `public WritableAssertionInfo(org.assertj.core.presentation.Representation p0)`

**Methods:**
- `public org.assertj.core.description.Description description()`
- `public void description(java.lang.String p0, java.lang.Object... p1)`
- `public void description(org.assertj.core.description.Description p0)`
- `public java.lang.String descriptionText()`
- `public boolean hasDescription()`
- `public static java.lang.String mostRelevantDescriptionIn(org.assertj.core.api.WritableAssertionInfo p0, java.lang.String p1)`
- `public java.lang.String overridingErrorMessage()`
- `public void overridingErrorMessage(java.lang.String p0)`
- `public void overridingErrorMessage(java.util.function.Supplier p0)`
- `public org.assertj.core.presentation.Representation representation()`
- `public java.lang.String toString()`
- `public void useBinaryRepresentation()`
- `public void useHexadecimalRepresentation()`
- `public void useRepresentation(org.assertj.core.presentation.Representation p0)`
- `public void useUnicodeRepresentation()`

---

## public class `org.assertj.core.api.ZonedDateTimeAssert`
extends `org.assertj.core.api.AbstractZonedDateTimeAssert`  

**Constructors:**
- `protected ZonedDateTimeAssert(java.time.ZonedDateTime p0)`

---

## public final class `org.assertj.core.api.exception.PathsException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public PathsException(java.lang.String p0, java.lang.Throwable p1)`

---

## public abstract class `org.assertj.core.api.filter.FilterOperator`<T extends java.lang.Object>

**Constructors:**
- `protected FilterOperator(T p0)`

**Fields:**
- `protected final T filterParameter`

**Methods:**
- `public abstract <E extends java.lang.Object> org.assertj.core.api.filter.Filters applyOn(org.assertj.core.api.filter.Filters p0)`

---

## public class `org.assertj.core.api.filter.Filters`<E extends java.lang.Object>

**Methods:**
- `public org.assertj.core.api.filter.Filters and(java.lang.String p0)`
- `public org.assertj.core.api.filter.Filters being(org.assertj.core.api.Condition p0)`
- `public org.assertj.core.api.filter.Filters equalsTo(java.lang.Object p0)`
- `public static <E extends java.lang.Object> org.assertj.core.api.filter.Filters filter(E[] p0)`
- `public static <E extends java.lang.Object> org.assertj.core.api.filter.Filters filter(java.lang.Iterable p0)`
- `public java.util.List get()`
- `public org.assertj.core.api.filter.Filters having(org.assertj.core.api.Condition p0)`
- `public org.assertj.core.api.filter.Filters in(java.lang.Object... p0)`
- `public org.assertj.core.api.filter.Filters notEqualsTo(java.lang.Object p0)`
- `public org.assertj.core.api.filter.Filters notIn(java.lang.Object... p0)`
- `public org.assertj.core.api.filter.Filters with(java.lang.String p0)`
- `public org.assertj.core.api.filter.Filters with(java.lang.String p0, java.lang.Object p1)`

---

## public class `org.assertj.core.api.filter.InFilter`
extends `org.assertj.core.api.filter.FilterOperator`  

**Methods:**
- `public <E extends java.lang.Object> org.assertj.core.api.filter.Filters applyOn(org.assertj.core.api.filter.Filters p0)`
- `public static org.assertj.core.api.filter.InFilter in(java.lang.Object... p0)`

---

## public class `org.assertj.core.api.filter.NotFilter`
extends `org.assertj.core.api.filter.FilterOperator`  

**Methods:**
- `public <E extends java.lang.Object> org.assertj.core.api.filter.Filters applyOn(org.assertj.core.api.filter.Filters p0)`
- `public static org.assertj.core.api.filter.NotFilter not(java.lang.Object p0)`

---

## public class `org.assertj.core.api.filter.NotInFilter`
extends `org.assertj.core.api.filter.FilterOperator`  

**Methods:**
- `public <E extends java.lang.Object> org.assertj.core.api.filter.Filters applyOn(org.assertj.core.api.filter.Filters p0)`
- `public boolean filter(java.lang.Object p0)`
- `public static org.assertj.core.api.filter.NotInFilter notIn(java.lang.Object... p0)`

---

## public abstract interface `org.assertj.core.api.iterable.Extractor`<F extends java.lang.Object, T extends java.lang.Object>
annotations: @java.lang.Deprecated, @java.lang.FunctionalInterface  
implements `java.util.function.Function<F,T>`  

**Methods:**
- `public default T apply(F p0)`
- `public abstract T extract(F p0)`

---

## public abstract interface `org.assertj.core.api.iterable.ThrowingExtractor`<F extends java.lang.Object, T extends java.lang.Object, EXCEPTION extends java.lang.Exception>
annotations: @java.lang.FunctionalInterface  
implements `java.util.function.Function<F,T>`  

**Methods:**
- `public default T apply(F p0)`
- `public abstract T extractThrows(F p0) throws EXCEPTION`

---

## public abstract interface `org.assertj.core.api.junit.jupiter.InjectSoftAssertions`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public class `org.assertj.core.api.junit.jupiter.SoftAssertionsExtension`
implements `org.junit.jupiter.api.extension.AfterTestExecutionCallback`, `org.junit.jupiter.api.extension.BeforeEachCallback`, `org.junit.jupiter.api.extension.ParameterResolver`, `org.junit.jupiter.api.extension.TestInstancePostProcessor`  

**Constructors:**
- `public SoftAssertionsExtension()`

**Methods:**
- `public void afterTestExecution(org.junit.jupiter.api.extension.ExtensionContext p0)`
- `public void beforeEach(org.junit.jupiter.api.extension.ExtensionContext p0) throws java.lang.Exception`
- `public static org.assertj.core.api.AssertionErrorCollector getAssertionErrorCollector(org.junit.jupiter.api.extension.ExtensionContext p0)`
- `public static <T extends org.assertj.core.api.SoftAssertionsProvider> T getSoftAssertionsProvider(org.junit.jupiter.api.extension.ExtensionContext p0, java.lang.Class p1)`
- `public void postProcessTestInstance(java.lang.Object p0, org.junit.jupiter.api.extension.ExtensionContext p1) throws java.lang.Exception`
- `public java.lang.Object resolveParameter(org.junit.jupiter.api.extension.ParameterContext p0, org.junit.jupiter.api.extension.ExtensionContext p1)`
- `public boolean supportsParameter(org.junit.jupiter.api.extension.ParameterContext p0, org.junit.jupiter.api.extension.ExtensionContext p1)`

---

## public class `org.assertj.core.api.junit.jupiter.SoftlyExtension`
annotations: @java.lang.Deprecated  
implements `org.junit.jupiter.api.extension.AfterTestExecutionCallback`, `org.junit.jupiter.api.extension.TestInstancePostProcessor`  

**Constructors:**
- `public SoftlyExtension()`

**Methods:**
- `public void afterTestExecution(org.junit.jupiter.api.extension.ExtensionContext p0) throws java.lang.Exception`
- `public void postProcessTestInstance(java.lang.Object p0, org.junit.jupiter.api.extension.ExtensionContext p1) throws java.lang.Exception`

---

## public class `org.assertj.core.api.recursive.comparison.ComparisonDifference`
implements `java.lang.Comparable<org.assertj.core.api.recursive.comparison.ComparisonDifference>`  

**Constructors:**
- `public ComparisonDifference(org.assertj.core.api.recursive.comparison.DualValue p0)`
- `public ComparisonDifference(org.assertj.core.api.recursive.comparison.DualValue p0, java.lang.String p1)`
- `public ComparisonDifference(org.assertj.core.api.recursive.comparison.DualValue p0, java.lang.String p1, java.lang.String p2)`

**Fields:**
- `public final static java.lang.String DEFAULT_TEMPLATE`

**Methods:**
- `public int compareTo(org.assertj.core.api.recursive.comparison.ComparisonDifference p0)`
- `public boolean equals(java.lang.Object p0)`
- `protected java.lang.String fieldPathDescription()`
- `public java.lang.Object getActual()`
- `public java.util.Optional getAdditionalInformation()`
- `public java.lang.Object getExpected()`
- `public java.lang.String getTemplate()`
- `public int hashCode()`
- `public java.lang.String multiLineDescription()`
- `public java.lang.String multiLineDescription(org.assertj.core.presentation.Representation p0)`
- `public static org.assertj.core.api.recursive.comparison.ComparisonDifference rootComparisonDifference(java.lang.Object p0, java.lang.Object p1, java.lang.String p2)`
- `public java.lang.String toString()`

---

## public class `org.assertj.core.api.recursive.comparison.ComparisonKeyDifference`
extends `org.assertj.core.api.recursive.comparison.ComparisonDifference`  

**Constructors:**
- `public ComparisonKeyDifference(org.assertj.core.api.recursive.comparison.DualValue p0, java.lang.Object p1, java.lang.Object p2)`

**Methods:**
- `public java.lang.String multiLineDescription(org.assertj.core.presentation.Representation p0)`
- `public java.lang.String toString()`

---

## public final class `org.assertj.core.api.recursive.comparison.DualValue`

**Constructors:**
- `public DualValue(java.util.List p0, java.lang.Object p1, java.lang.Object p2)`
- `public DualValue(org.assertj.core.api.recursive.comparison.FieldLocation p0, java.lang.Object p1, java.lang.Object p2)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getConcatenatedPath()`
- `public java.util.List getDecomposedPath()`
- `public java.lang.String getFieldName()`
- `public boolean hasNoContainerValues()`
- `public boolean hasNoNullValues()`
- `public boolean hasPotentialCyclingValues()`
- `public boolean hasSomeJavaTypeValue()`
- `public int hashCode()`
- `public boolean isActualAnEnum()`
- `public boolean isActualFieldAMap()`
- `public boolean isActualFieldASortedMap()`
- `public boolean isActualFieldAnArray()`
- `public boolean isActualFieldAnAtomicBoolean()`
- `public boolean isActualFieldAnAtomicInteger()`
- `public boolean isActualFieldAnAtomicIntegerArray()`
- `public boolean isActualFieldAnAtomicLong()`
- `public boolean isActualFieldAnAtomicLongArray()`
- `public boolean isActualFieldAnAtomicReference()`
- `public boolean isActualFieldAnAtomicReferenceArray()`
- `public boolean isActualFieldAnEmptyOptionalOfAnyType()`
- `public boolean isActualFieldAnIterable()`
- `public boolean isActualFieldAnOptional()`
- `public boolean isActualFieldAnOptionalDouble()`
- `public boolean isActualFieldAnOptionalInt()`
- `public boolean isActualFieldAnOptionalLong()`
- `public boolean isActualFieldAnOrderedCollection()`
- `public boolean isActualJavaType()`
- `public boolean isExpectedAContainer()`
- `public boolean isExpectedAnEnum()`
- `public boolean isExpectedFieldAMap()`
- `public boolean isExpectedFieldASortedMap()`
- `public boolean isExpectedFieldAnArray()`
- `public boolean isExpectedFieldAnAtomicBoolean()`
- `public boolean isExpectedFieldAnAtomicInteger()`
- `public boolean isExpectedFieldAnAtomicIntegerArray()`
- `public boolean isExpectedFieldAnAtomicLong()`
- `public boolean isExpectedFieldAnAtomicLongArray()`
- `public boolean isExpectedFieldAnAtomicReference()`
- `public boolean isExpectedFieldAnAtomicReferenceArray()`
- `public boolean isExpectedFieldAnIterable()`
- `public boolean isExpectedFieldAnOptional()`
- `public boolean isExpectedFieldAnOrderedCollection()`
- `public boolean isExpectedJavaType()`
- `public java.lang.String toString()`

---

## public class `org.assertj.core.api.recursive.comparison.FieldComparators`
extends `org.assertj.core.api.recursive.comparison.FieldHolder`  

**Constructors:**
- `public FieldComparators()`

**Methods:**
- `public java.util.stream.Stream comparatorByFields()`
- `public java.util.Comparator getComparatorForField(java.lang.String p0)`
- `public boolean hasComparatorForField(java.lang.String p0)`
- `public void registerComparator(java.lang.String p0, java.util.Comparator p1)`

---

## public final class `org.assertj.core.api.recursive.comparison.FieldLocation`
implements `java.lang.Comparable<org.assertj.core.api.recursive.comparison.FieldLocation>`  

**Constructors:**
- `public FieldLocation(java.lang.String p0)`
- `public FieldLocation(java.util.List p0)`

**Methods:**
- `public int compareTo(org.assertj.core.api.recursive.comparison.FieldLocation p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.List getDecomposedPath()`
- `public java.lang.String getFieldName()`
- `public java.lang.String getPathToUseInRules()`
- `public boolean hasChild(org.assertj.core.api.recursive.comparison.FieldLocation p0)`
- `public boolean hasParent(org.assertj.core.api.recursive.comparison.FieldLocation p0)`
- `public int hashCode()`
- `public java.lang.String shortDescription()`
- `public java.lang.String toString()`

---

## public class `org.assertj.core.api.recursive.comparison.FieldMessages`
extends `org.assertj.core.api.recursive.comparison.FieldHolder`  

**Constructors:**
- `public FieldMessages()`

**Methods:**
- `public java.lang.String getMessageForField(java.lang.String p0)`
- `public boolean hasMessageForField(java.lang.String p0)`
- `public java.util.stream.Stream messageByFields()`
- `public void registerMessage(java.lang.String p0, java.lang.String p1)`

---

## public class `org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration`

**Constructors:**
- `public RecursiveComparisonConfiguration()`

**Fields:**
- `public final static java.lang.String INDENT_LEVEL_2`

**Methods:**
- `public static org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration$Builder builder()`
- `public java.util.stream.Stream comparatorByFields()`
- `public void compareOnlyFields(java.lang.String... p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.Comparator getComparatorForField(java.lang.String p0)`
- `public java.util.Comparator getComparatorForType(java.lang.Class p0)`
- `public java.util.Set getComparedFields()`
- `public org.assertj.core.api.recursive.comparison.FieldComparators getFieldComparators()`
- `public java.util.Set getIgnoredCollectionOrderInFields()`
- `public java.util.List getIgnoredCollectionOrderInFieldsMatchingRegexes()`
- `public java.util.Set getIgnoredFields()`
- `public java.util.List getIgnoredFieldsRegexes()`
- `public java.util.List getIgnoredOverriddenEqualsForFields()`
- `public java.util.List getIgnoredOverriddenEqualsForFieldsMatchingRegexes()`
- `public java.util.List getIgnoredOverriddenEqualsForTypes()`
- `public java.util.Set getIgnoredTypes()`
- `public java.lang.String getMessageForField(java.lang.String p0)`
- `public java.lang.String getMessageForType(java.lang.Class p0)`
- `public org.assertj.core.internal.TypeComparators getTypeComparators()`
- `public boolean hasComparatorForField(java.lang.String p0)`
- `public boolean hasComparatorForType(java.lang.Class p0)`
- `public boolean hasCustomComparators()`
- `public boolean hasCustomMessageForField(java.lang.String p0)`
- `public boolean hasCustomMessageForType(java.lang.Class p0)`
- `public int hashCode()`
- `public void ignoreAllOverriddenEquals()`
- `public void ignoreCollectionOrder(boolean p0)`
- `public void ignoreCollectionOrderInFields(java.lang.String... p0)`
- `public void ignoreCollectionOrderInFieldsMatchingRegexes(java.lang.String... p0)`
- `public void ignoreFields(java.lang.String... p0)`
- `public void ignoreFieldsMatchingRegexes(java.lang.String... p0)`
- `public void ignoreFieldsOfTypes(java.lang.Class... p0)`
- `public void ignoreOverriddenEqualsForFields(java.lang.String... p0)`
- `public void ignoreOverriddenEqualsForFieldsMatchingRegexes(java.lang.String... p0)`
- `public void ignoreOverriddenEqualsForTypes(java.lang.Class... p0)`
- `public boolean isInStrictTypeCheckingMode()`
- `public java.lang.String multiLineDescription(org.assertj.core.presentation.Representation p0)`
- `public void registerComparatorForFields(java.util.Comparator p0, java.lang.String... p1)`
- `public <T extends java.lang.Object> void registerComparatorForType(java.util.Comparator p0, java.lang.Class p1)`
- `public void registerEqualsForFields(java.util.function.BiPredicate p0, java.lang.String... p1)`
- `public <T extends java.lang.Object> void registerEqualsForType(java.util.function.BiPredicate p0, java.lang.Class p1)`
- `public void registerErrorMessageForFields(java.lang.String p0, java.lang.String... p1)`
- `public void registerErrorMessageForType(java.lang.String p0, java.lang.Class p1)`
- `public void setIgnoreAllActualEmptyOptionalFields(boolean p0)`
- `public void setIgnoreAllActualNullFields(boolean p0)`
- `public void setIgnoreAllExpectedNullFields(boolean p0)`
- `public void strictTypeChecking(boolean p0)`
- `public java.lang.String toString()`
- `public void useOverriddenEquals()`

---

## public final static class `org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration$Builder`

**Methods:**
- `public org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration build()`
- `public org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration$Builder withComparatorForFields(java.util.Comparator p0, java.lang.String... p1)`
- `public <T extends java.lang.Object> org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration$Builder withComparatorForType(java.util.Comparator p0, java.lang.Class p1)`
- `public org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration$Builder withComparedFields(java.lang.String... p0)`
- `public org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration$Builder withEqualsForFields(java.util.function.BiPredicate p0, java.lang.String... p1)`
- `public <T extends java.lang.Object> org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration$Builder withEqualsForType(java.util.function.BiPredicate p0, java.lang.Class p1)`
- `public org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration$Builder withErrorMessageForFields(java.lang.String p0, java.lang.String... p1)`
- `public org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration$Builder withErrorMessageForType(java.lang.String p0, java.lang.Class p1)`
- `public org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration$Builder withIgnoreAllActualEmptyOptionalFields(boolean p0)`
- `public org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration$Builder withIgnoreAllActualNullFields(boolean p0)`
- `public org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration$Builder withIgnoreAllExpectedNullFields(boolean p0)`
- `public org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration$Builder withIgnoreAllOverriddenEquals(boolean p0)`
- `public org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration$Builder withIgnoreCollectionOrder(boolean p0)`
- `public org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration$Builder withIgnoredCollectionOrderInFields(java.lang.String... p0)`
- `public org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration$Builder withIgnoredCollectionOrderInFieldsMatchingRegexes(java.lang.String... p0)`
- `public org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration$Builder withIgnoredFields(java.lang.String... p0)`
- `public org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration$Builder withIgnoredFieldsMatchingRegexes(java.lang.String... p0)`
- `public org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration$Builder withIgnoredFieldsOfTypes(java.lang.Class... p0)`
- `public org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration$Builder withIgnoredOverriddenEqualsForFields(java.lang.String... p0)`
- `public org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration$Builder withIgnoredOverriddenEqualsForFieldsMatchingRegexes(java.lang.String... p0)`
- `public org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration$Builder withIgnoredOverriddenEqualsForTypes(java.lang.Class... p0)`
- `public org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration$Builder withStrictTypeChecking(boolean p0)`

---

## public class `org.assertj.core.api.recursive.comparison.RecursiveComparisonDifferenceCalculator`

**Constructors:**
- `public RecursiveComparisonDifferenceCalculator()`

**Methods:**
- `public java.util.List determineDifferences(java.lang.Object p0, java.lang.Object p1, org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration p2)`

---

## public class `org.assertj.core.condition.AllOf`<T extends java.lang.Object>
extends `org.assertj.core.condition.Join`  

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.api.Condition allOf(java.lang.Iterable p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.Condition allOf(org.assertj.core.api.Condition... p0)`
- `public java.lang.String descriptionPrefix()`
- `public boolean matches(T p0)`

---

## public class `org.assertj.core.condition.AnyOf`<T extends java.lang.Object>
extends `org.assertj.core.condition.Join`  

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.api.Condition anyOf(java.lang.Iterable p0)`
- `public static <T extends java.lang.Object> org.assertj.core.api.Condition anyOf(org.assertj.core.api.Condition... p0)`
- `public java.lang.String descriptionPrefix()`
- `public boolean matches(T p0)`

---

## public class `org.assertj.core.condition.DoesNotHave`<T extends java.lang.Object>
extends `org.assertj.core.condition.Negative`  

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.condition.DoesNotHave doesNotHave(org.assertj.core.api.Condition p0)`

---

## public abstract class `org.assertj.core.condition.Join`<T extends java.lang.Object>
extends `org.assertj.core.api.Condition`  

**Constructors:**
- `protected Join(java.lang.Iterable p0)`
- `protected Join(org.assertj.core.api.Condition... p0)`

**Fields:**
- `protected final static java.lang.String PREFIX_DELIMITER`
- `protected final static java.lang.String SUFFIX_DELIMITER`

**Methods:**
- `public org.assertj.core.description.Description conditionDescriptionWithStatus(T p0)`
- `public final java.util.Collection conditions()`
- `public org.assertj.core.description.Description description()`
- `public abstract java.lang.String descriptionPrefix()`

---

## public class `org.assertj.core.condition.MappedCondition`<FROM extends java.lang.Object, TO extends java.lang.Object>
annotations: @org.assertj.core.annotations.Beta  
extends `org.assertj.core.api.Condition`  

**Methods:**
- `public org.assertj.core.description.Description conditionDescriptionWithStatus(FROM p0)`
- `public static <FROM extends java.lang.Object, TO extends java.lang.Object> org.assertj.core.condition.MappedCondition mappedCondition(java.util.function.Function p0, org.assertj.core.api.Condition p1)`
- `public static <FROM extends java.lang.Object, TO extends java.lang.Object> org.assertj.core.condition.MappedCondition mappedCondition(java.util.function.Function p0, org.assertj.core.api.Condition p1, java.lang.String p2, java.lang.Object... p3)`
- `public boolean matches(FROM p0)`

---

## public abstract class `org.assertj.core.condition.Negative`<T extends java.lang.Object>
extends `org.assertj.core.api.Condition`  

**Constructors:**
- `protected Negative(org.assertj.core.api.Condition p0)`

**Methods:**
- `public boolean matches(T p0)`

---

## public class `org.assertj.core.condition.Not`<T extends java.lang.Object>
extends `org.assertj.core.condition.Negative`  

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.condition.Not not(org.assertj.core.api.Condition p0)`

---

## public final class `org.assertj.core.condition.VerboseCondition`<T extends java.lang.Object>
annotations: @org.assertj.core.annotations.Beta  
extends `org.assertj.core.api.Condition`  

**Methods:**
- `public boolean matches(T p0)`
- `public static <T extends java.lang.Object> org.assertj.core.condition.VerboseCondition verboseCondition(java.util.function.Predicate p0, java.lang.String p1, java.util.function.Function p2)`

---

## public class `org.assertj.core.configuration.Configuration`

**Constructors:**
- `public Configuration()`

**Fields:**
- `public final static boolean ALLOW_COMPARING_PRIVATE_FIELDS`
- `public final static boolean ALLOW_EXTRACTING_PRIVATE_FIELDS`
- `public final static boolean BARE_NAME_PROPERTY_EXTRACTION_ENABLED`
- `public final static org.assertj.core.configuration.Configuration DEFAULT_CONFIGURATION`
- `public final static boolean LENIENT_DATE_PARSING`
- `public final static int MAX_ELEMENTS_FOR_PRINTING`
- `public final static int MAX_LENGTH_FOR_SINGLE_LINE_DESCRIPTION`
- `public final static int MAX_STACKTRACE_ELEMENTS_DISPLAYED`
- `public final static org.assertj.core.configuration.PreferredAssumptionException PREFERRED_ASSUMPTION_EXCEPTION`
- `public final static boolean PRINT_ASSERTIONS_DESCRIPTION_ENABLED`
- `public final static boolean REMOVE_ASSERTJ_RELATED_ELEMENTS_FROM_STACK_TRACE`

**Methods:**
- `public void addAdditionalDateFormats(java.text.DateFormat... p0)`
- `public java.util.List additionalDateFormats()`
- `public void apply()`
- `public void applyAndDisplay()`
- `public boolean bareNamePropertyExtractionEnabled()`
- `public boolean comparingPrivateFieldsEnabled()`
- `public java.lang.String describe()`
- `public java.util.function.Consumer descriptionConsumer()`
- `public boolean extractingPrivateFieldsEnabled()`
- `public boolean lenientDateParsingEnabled()`
- `public int maxElementsForPrinting()`
- `public int maxLengthForSingleLineDescription()`
- `public int maxStackTraceElementsDisplayed()`
- `public org.assertj.core.configuration.PreferredAssumptionException preferredAssumptionException()`
- `public boolean printAssertionsDescription()`
- `public boolean removeAssertJRelatedElementsFromStackTraceEnabled()`
- `public org.assertj.core.presentation.Representation representation()`
- `public void setAdditionalDateFormats(java.util.List p0)`
- `public void setBareNamePropertyExtraction(boolean p0)`
- `public void setComparingPrivateFields(boolean p0)`
- `public void setDescriptionConsumer(java.util.function.Consumer p0)`
- `public void setExtractingPrivateFields(boolean p0)`
- `public void setLenientDateParsing(boolean p0)`
- `public void setMaxElementsForPrinting(int p0)`
- `public void setMaxLengthForSingleLineDescription(int p0)`
- `public void setMaxStackTraceElementsDisplayed(int p0)`
- `public void setPreferredAssumptionException(org.assertj.core.configuration.PreferredAssumptionException p0)`
- `public void setPrintAssertionsDescriptionEnabled(boolean p0)`
- `public void setRemoveAssertJRelatedElementsFromStackTrace(boolean p0)`

---

## public final class `org.assertj.core.configuration.ConfigurationProvider`

**Fields:**
- `public final static org.assertj.core.configuration.ConfigurationProvider CONFIGURATION_PROVIDER`

**Methods:**
- `public org.assertj.core.configuration.Configuration configuration()`
- `public static void loadRegisteredConfiguration()`
- `public org.assertj.core.presentation.Representation representation()`

---

## public sealed enum `org.assertj.core.configuration.PreferredAssumptionException`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.assertj.core.configuration.PreferredAssumptionException AUTO_DETECT`
- `public final static org.assertj.core.configuration.PreferredAssumptionException JUNIT4`
- `public final static org.assertj.core.configuration.PreferredAssumptionException JUNIT5`
- `public final static org.assertj.core.configuration.PreferredAssumptionException TEST_NG`

**Methods:**
- `public java.lang.Class getAssumptionExceptionClass()`
- `public java.lang.String toString()`

---

## public final class `org.assertj.core.data.Index`

**Fields:**
- `public final int value`

**Methods:**
- `public static org.assertj.core.data.Index atIndex(int p0)`
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public final class `org.assertj.core.data.MapEntry`<K extends java.lang.Object, V extends java.lang.Object>
implements `java.util.Map$Entry<K,V>`  

**Fields:**
- `public final K key`
- `public final V value`

**Methods:**
- `public static <K extends java.lang.Object, V extends java.lang.Object> org.assertj.core.data.MapEntry entry(K p0, V p1)`
- `public boolean equals(java.lang.Object p0)`
- `public K getKey()`
- `public V getValue()`
- `public int hashCode()`
- `public V setValue(V p0)`
- `public java.lang.String toString()`

---

## public final class `org.assertj.core.data.Offset`<T extends java.lang.Number>

**Fields:**
- `public final boolean strict`
- `public final T value`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public static <T extends java.lang.Number> org.assertj.core.data.Offset offset(T p0)`
- `public static <T extends java.lang.Number> org.assertj.core.data.Offset strictOffset(T p0)`
- `public java.lang.String toString()`

---

## public final class `org.assertj.core.data.Percentage`

**Fields:**
- `public final double value`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public java.lang.String toString()`
- `public static org.assertj.core.data.Percentage withPercentage(double p0)`

---

## public abstract interface `org.assertj.core.data.TemporalOffset`<T extends java.time.temporal.Temporal>

**Methods:**
- `public abstract java.lang.String getBeyondOffsetDifferenceDescription(T p0, T p1)`
- `public abstract boolean isBeyondOffset(T p0, T p1)`

---

## public class `org.assertj.core.data.TemporalUnitLessThanOffset`
extends `org.assertj.core.data.TemporalUnitOffset`  

**Constructors:**
- `public TemporalUnitLessThanOffset(long p0, java.time.temporal.TemporalUnit p1)`

**Methods:**
- `public java.lang.String getBeyondOffsetDifferenceDescription(java.time.temporal.Temporal p0, java.time.temporal.Temporal p1)`
- `public boolean isBeyondOffset(java.time.temporal.Temporal p0, java.time.temporal.Temporal p1)`

---

## public abstract class `org.assertj.core.data.TemporalUnitOffset`
implements `org.assertj.core.data.TemporalOffset<java.time.temporal.Temporal>`  

**Constructors:**
- `public TemporalUnitOffset(long p0, java.time.temporal.TemporalUnit p1)`

**Fields:**
- `protected final java.time.temporal.TemporalUnit unit`
- `protected final long value`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `protected java.time.Duration getAbsoluteDuration(java.time.temporal.Temporal p0, java.time.temporal.Temporal p1)`
- `public java.lang.String getBeyondOffsetDifferenceDescription(java.time.temporal.Temporal p0, java.time.temporal.Temporal p1)`
- `protected long getDifference(java.time.temporal.Temporal p0, java.time.temporal.Temporal p1)`
- `public java.time.temporal.TemporalUnit getUnit()`
- `public int hashCode()`

---

## public class `org.assertj.core.data.TemporalUnitWithinOffset`
extends `org.assertj.core.data.TemporalUnitOffset`  

**Constructors:**
- `public TemporalUnitWithinOffset(long p0, java.time.temporal.TemporalUnit p1)`

**Methods:**
- `public java.lang.String getBeyondOffsetDifferenceDescription(java.time.temporal.Temporal p0, java.time.temporal.Temporal p1)`
- `public boolean isBeyondOffset(java.time.temporal.Temporal p0, java.time.temporal.Temporal p1)`

---

## public abstract class `org.assertj.core.description.Description`

**Constructors:**
- `public Description()`

**Methods:**
- `public static org.assertj.core.description.Description emptyIfNull(org.assertj.core.description.Description p0)`
- `public static java.lang.String mostRelevantDescription(org.assertj.core.description.Description p0, java.lang.String p1)`
- `public java.lang.String toString()`
- `public abstract java.lang.String value()`

---

## public class `org.assertj.core.description.EmptyTextDescription`
extends `org.assertj.core.description.TextDescription`  

**Methods:**
- `public static org.assertj.core.description.Description emptyDescription()`

---

## public class `org.assertj.core.description.JoinDescription`
extends `org.assertj.core.description.Description`  

**Constructors:**
- `public JoinDescription(java.lang.String p0, java.lang.String p1, java.util.Collection p2)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public java.lang.String value()`

---

## public class `org.assertj.core.description.LazyTextDescription`
extends `org.assertj.core.description.Description`  

**Constructors:**
- `public LazyTextDescription(java.util.function.Supplier p0)`

**Methods:**
- `public java.lang.String value()`

---

## public class `org.assertj.core.description.TextDescription`
extends `org.assertj.core.description.Description`  

**Constructors:**
- `public TextDescription(java.lang.String p0, java.lang.Object... p1)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public java.lang.String value()`

---

## public class `org.assertj.core.error.AbstractShouldHaveTextContent`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Constructors:**
- `public AbstractShouldHaveTextContent(java.lang.String p0, java.lang.Object... p1)`

**Fields:**
- `protected java.lang.String diffs`

**Methods:**
- `public java.lang.String create(org.assertj.core.description.Description p0, org.assertj.core.presentation.Representation p1)`
- `protected static java.lang.String diffsAsString(java.util.List p0)`

---

## public class `org.assertj.core.error.AnyElementShouldMatch`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory anyElementShouldMatch(java.lang.Object p0, org.assertj.core.presentation.PredicateDescription p1)`

---

## public class `org.assertj.core.error.AssertJMultipleFailuresError`
extends `org.opentest4j.MultipleFailuresError`  

**Constructors:**
- `public AssertJMultipleFailuresError(java.lang.String p0, java.util.List p1)`

**Methods:**
- `public java.lang.String getMessage()`

---

## public class `org.assertj.core.error.AssertionErrorCreator`

**Constructors:**
- `public AssertionErrorCreator()`
- `public AssertionErrorCreator(org.assertj.core.error.ConstructorInvoker p0)`

**Methods:**
- `public java.lang.AssertionError assertionError(java.lang.String p0)`
- `public java.lang.AssertionError assertionError(java.lang.String p0, java.lang.Object p1, java.lang.Object p2, org.assertj.core.presentation.Representation p3)`
- `public java.lang.AssertionError multipleAssertionsError(org.assertj.core.description.Description p0, java.util.List p1)`
- `public java.lang.AssertionError multipleSoftAssertionsError(java.util.List p0)`
- `public void tryThrowingMultipleFailuresError(java.util.List p0)`

---

## public abstract interface `org.assertj.core.error.AssertionErrorFactory`

**Methods:**
- `public abstract java.lang.AssertionError newAssertionError(org.assertj.core.description.Description p0, org.assertj.core.presentation.Representation p1)`

---

## public class `org.assertj.core.error.AssertionErrorMessagesAggregator`

**Constructors:**
- `public AssertionErrorMessagesAggregator()`

**Methods:**
- `public static java.lang.String aggregateErrorMessages(java.util.List p0)`

---

## public class `org.assertj.core.error.AssertionErrorMessagesAggregrator`
annotations: @java.lang.Deprecated  

**Constructors:**
- `public AssertionErrorMessagesAggregrator()`

**Methods:**
- `public static java.lang.String aggregrateErrorMessages(java.util.List p0)`

---

## public class `org.assertj.core.error.BasicErrorMessageFactory`
implements `org.assertj.core.error.ErrorMessageFactory`  

**Constructors:**
- `public BasicErrorMessageFactory(java.lang.String p0, java.lang.Object... p1)`

**Fields:**
- `protected final java.lang.Object[] arguments`
- `protected final java.lang.String format`

**Methods:**
- `public java.lang.String create()`
- `public java.lang.String create(org.assertj.core.description.Description p0)`
- `public java.lang.String create(org.assertj.core.description.Description p0, org.assertj.core.presentation.Representation p1)`
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public java.lang.String toString()`
- `protected static java.lang.CharSequence unquotedString(java.lang.String p0)`

---

## public class `org.assertj.core.error.ClassModifierShouldBe`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeFinal(java.lang.Class p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBePackagePrivate(java.lang.Class p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeProtected(java.lang.Class p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBePublic(java.lang.Class p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeStatic(java.lang.Class p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeFinal(java.lang.Class p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeStatic(java.lang.Class p0)`

---

## public class `org.assertj.core.error.ConditionAndGroupGenericParameterTypeShouldBeTheSame`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Constructors:**
- `public ConditionAndGroupGenericParameterTypeShouldBeTheSame(java.lang.Object p0, org.assertj.core.api.Condition p1)`

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeSameGenericBetweenIterableAndCondition(java.lang.Object p0, org.assertj.core.api.Condition p1)`

---

## public class `org.assertj.core.error.ConstructorInvoker`

**Constructors:**
- `public ConstructorInvoker()`

**Methods:**
- `public java.lang.Object newInstance(java.lang.String p0, java.lang.Class[] p1, java.lang.Object... p2) throws java.lang.Exception`

---

## public class `org.assertj.core.error.DescriptionFormatter`

**Methods:**
- `public java.lang.String format(org.assertj.core.description.Description p0)`
- `public static org.assertj.core.error.DescriptionFormatter instance()`

---

## public class `org.assertj.core.error.ElementsShouldBe`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory elementsShouldBe(java.lang.Object p0, java.lang.Object p1, org.assertj.core.api.Condition p2)`

---

## public class `org.assertj.core.error.ElementsShouldBeAtLeast`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory elementsShouldBeAtLeast(java.lang.Object p0, int p1, org.assertj.core.api.Condition p2)`

---

## public class `org.assertj.core.error.ElementsShouldBeAtMost`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory elementsShouldBeAtMost(java.lang.Object p0, int p1, org.assertj.core.api.Condition p2)`

---

## public class `org.assertj.core.error.ElementsShouldBeExactly`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory elementsShouldBeExactly(java.lang.Object p0, int p1, org.assertj.core.api.Condition p2)`

---

## public class `org.assertj.core.error.ElementsShouldHave`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory elementsShouldHave(java.lang.Object p0, java.lang.Object p1, org.assertj.core.api.Condition p2)`

---

## public class `org.assertj.core.error.ElementsShouldHaveAtLeast`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory elementsShouldHaveAtLeast(java.lang.Object p0, int p1, org.assertj.core.api.Condition p2)`

---

## public class `org.assertj.core.error.ElementsShouldHaveAtMost`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory elementsShouldHaveAtMost(java.lang.Object p0, int p1, org.assertj.core.api.Condition p2)`

---

## public class `org.assertj.core.error.ElementsShouldHaveExactly`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory elementsShouldHaveExactly(java.lang.Object p0, int p1, org.assertj.core.api.Condition p2)`

---

## public class `org.assertj.core.error.ElementsShouldMatch`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory elementsShouldMatch(java.lang.Object p0, T p1, org.assertj.core.presentation.PredicateDescription p2)`

---

## public class `org.assertj.core.error.ElementsShouldNotBe`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory elementsShouldNotBe(java.lang.Object p0, java.lang.Object p1, org.assertj.core.api.Condition p2)`

---

## public class `org.assertj.core.error.ElementsShouldNotHave`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory elementsShouldNotHave(java.lang.Object p0, java.lang.Object p1, org.assertj.core.api.Condition p2)`

---

## public class `org.assertj.core.error.ElementsShouldSatisfy`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory elementsShouldSatisfy(java.lang.Object p0, java.util.List p1, org.assertj.core.api.AssertionInfo p2)`
- `public static org.assertj.core.error.ErrorMessageFactory elementsShouldSatisfyAny(java.lang.Object p0, java.util.List p1, org.assertj.core.api.AssertionInfo p2)`
- `public static org.assertj.core.error.ErrorMessageFactory elementsShouldSatisfyExactly(java.lang.Object p0, java.util.Map p1, org.assertj.core.api.AssertionInfo p2)`
- `public static org.assertj.core.error.UnsatisfiedRequirement unsatisfiedRequirement(java.lang.Object p0, java.lang.String p1)`

---

## public abstract interface `org.assertj.core.error.ErrorMessageFactory`

**Methods:**
- `public abstract java.lang.String create()`
- `public abstract java.lang.String create(org.assertj.core.description.Description p0)`
- `public abstract java.lang.String create(org.assertj.core.description.Description p0, org.assertj.core.presentation.Representation p1)`

---

## public class `org.assertj.core.error.GroupTypeDescription`

**Constructors:**
- `public GroupTypeDescription(java.lang.String p0, java.lang.String p1)`

**Methods:**
- `public java.lang.String getElementTypeName()`
- `public static org.assertj.core.error.GroupTypeDescription getGroupTypeDescription(java.lang.Class p0)`
- `public static org.assertj.core.error.GroupTypeDescription getGroupTypeDescription(java.lang.Object p0)`
- `public java.lang.String getGroupTypeName()`

---

## public class `org.assertj.core.error.MatcherShouldMatch`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.MatcherShouldMatch shouldMatch(java.util.regex.Matcher p0)`

---

## public class `org.assertj.core.error.MessageFormatter`

**Methods:**
- `public java.lang.String format(org.assertj.core.description.Description p0, org.assertj.core.presentation.Representation p1, java.lang.String p2, java.lang.Object... p3)`
- `public static org.assertj.core.error.MessageFormatter instance()`

---

## public class `org.assertj.core.error.MultipleAssertionsError`
extends `java.lang.AssertionError`  

**Constructors:**
- `public MultipleAssertionsError(java.util.List p0)`
- `public MultipleAssertionsError(org.assertj.core.description.Description p0, java.util.List p1)`

**Methods:**
- `public java.util.List getErrors()`

---

## public class `org.assertj.core.error.NoElementsShouldMatch`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory noElementsShouldMatch(java.lang.Object p0, T p1, org.assertj.core.presentation.PredicateDescription p2)`

---

## public class `org.assertj.core.error.NoElementsShouldSatisfy`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory noElementsShouldSatisfy(java.lang.Object p0, java.lang.Object p1)`

---

## public class `org.assertj.core.error.OptionalDoubleShouldHaveValueCloseToOffset`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.OptionalDoubleShouldHaveValueCloseToOffset shouldHaveValueCloseToOffset(double p0)`
- `public static org.assertj.core.error.OptionalDoubleShouldHaveValueCloseToOffset shouldHaveValueCloseToOffset(java.util.OptionalDouble p0, double p1, org.assertj.core.data.Offset p2, double p3)`

---

## public class `org.assertj.core.error.OptionalDoubleShouldHaveValueCloseToPercentage`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.OptionalDoubleShouldHaveValueCloseToPercentage shouldHaveValueCloseToPercentage(double p0)`
- `public static org.assertj.core.error.OptionalDoubleShouldHaveValueCloseToPercentage shouldHaveValueCloseToPercentage(java.util.OptionalDouble p0, double p1, org.assertj.core.data.Percentage p2, double p3)`

---

## public class `org.assertj.core.error.OptionalShouldBeEmpty`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <VALUE extends java.lang.Object> org.assertj.core.error.OptionalShouldBeEmpty shouldBeEmpty(java.util.Optional p0)`
- `public static org.assertj.core.error.OptionalShouldBeEmpty shouldBeEmpty(java.util.OptionalDouble p0)`
- `public static org.assertj.core.error.OptionalShouldBeEmpty shouldBeEmpty(java.util.OptionalInt p0)`
- `public static org.assertj.core.error.OptionalShouldBeEmpty shouldBeEmpty(java.util.OptionalLong p0)`

---

## public class `org.assertj.core.error.OptionalShouldBePresent`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.OptionalShouldBePresent shouldBePresent(java.lang.Object p0)`

---

## public class `org.assertj.core.error.OptionalShouldContain`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.OptionalShouldContain shouldContain(java.lang.Object p0)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.error.OptionalShouldContain shouldContain(java.util.Optional p0, VALUE p1)`
- `public static org.assertj.core.error.OptionalShouldContain shouldContain(java.util.OptionalDouble p0, double p1)`
- `public static org.assertj.core.error.OptionalShouldContain shouldContain(java.util.OptionalInt p0, int p1)`
- `public static org.assertj.core.error.OptionalShouldContain shouldContain(java.util.OptionalLong p0, long p1)`
- `public static <VALUE extends java.lang.Object> org.assertj.core.error.OptionalShouldContain shouldContainSame(java.util.Optional p0, VALUE p1)`

---

## public class `org.assertj.core.error.OptionalShouldContainInstanceOf`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.OptionalShouldContainInstanceOf shouldContainInstanceOf(java.lang.Object p0, java.lang.Class p1)`

---

## public class `org.assertj.core.error.ShouldAccept`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldAccept(java.util.function.Predicate p0, T p1, org.assertj.core.presentation.PredicateDescription p2)`

---

## public class `org.assertj.core.error.ShouldBe`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldBe(T p0, org.assertj.core.api.Condition p1)`

---

## public class `org.assertj.core.error.ShouldBeAbsolutePath`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Fields:**
- `public final static java.lang.String SHOULD_BE_ABSOLUTE_PATH`

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeAbsolutePath(java.io.File p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeAbsolutePath(java.nio.file.Path p0)`

---

## public class `org.assertj.core.error.ShouldBeAbstract`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeAbstract(java.lang.Class p0)`

---

## public class `org.assertj.core.error.ShouldBeAfter`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeAfter(java.lang.Object p0, java.lang.Object p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeAfter(java.lang.Object p0, java.lang.Object p1, org.assertj.core.internal.ComparisonStrategy p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeAfter(java.util.Date p0, int p1)`

---

## public class `org.assertj.core.error.ShouldBeAfterOrEqualTo`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeAfterOrEqualTo(java.lang.Object p0, java.lang.Object p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeAfterOrEqualTo(java.lang.Object p0, java.lang.Object p1, org.assertj.core.internal.ComparisonStrategy p2)`

---

## public class `org.assertj.core.error.ShouldBeAfterYear`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeAfterYear(java.util.Date p0, int p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeAfterYear(java.util.Date p0, int p1, org.assertj.core.internal.ComparisonStrategy p2)`

---

## public class `org.assertj.core.error.ShouldBeAnArray`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeAnArray(java.lang.Object p0)`

---

## public class `org.assertj.core.error.ShouldBeAnnotation`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeAnnotation(java.lang.Class p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeAnnotation(java.lang.Class p0)`

---

## public class `org.assertj.core.error.ShouldBeAssignableFrom`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeAssignableFrom(java.lang.Class p0, java.util.Set p1, java.util.Set p2)`

---

## public class `org.assertj.core.error.ShouldBeAtIndex`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldBeAtIndex(java.util.List p0, org.assertj.core.api.Condition p1, org.assertj.core.data.Index p2, T p3)`

---

## public class `org.assertj.core.error.ShouldBeAtSameInstant`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeAtSameInstant(java.time.OffsetDateTime p0, java.time.OffsetDateTime p1)`

---

## public class `org.assertj.core.error.ShouldBeBase64`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeBase64(java.lang.String p0)`

---

## public class `org.assertj.core.error.ShouldBeBefore`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeBefore(java.lang.Object p0, java.lang.Object p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeBefore(java.lang.Object p0, java.lang.Object p1, org.assertj.core.internal.ComparisonStrategy p2)`

---

## public class `org.assertj.core.error.ShouldBeBeforeOrEqualTo`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeBeforeOrEqualTo(java.lang.Object p0, java.lang.Object p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeBeforeOrEqualTo(java.lang.Object p0, java.lang.Object p1, org.assertj.core.internal.ComparisonStrategy p2)`

---

## public class `org.assertj.core.error.ShouldBeBeforeYear`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeBeforeYear(java.util.Date p0, int p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeBeforeYear(java.util.Date p0, int p1, org.assertj.core.internal.ComparisonStrategy p2)`

---

## public class `org.assertj.core.error.ShouldBeBetween`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldBeBetween(java.lang.Comparable p0, java.lang.Comparable p1, java.lang.Comparable p2, boolean p3, boolean p4)`
- `public static <T extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldBeBetween(java.lang.Comparable p0, java.lang.Comparable p1, java.lang.Comparable p2, boolean p3, boolean p4, org.assertj.core.internal.ComparisonStrategy p5)`
- `public static <T extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldBeBetween(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, boolean p3, boolean p4, org.assertj.core.internal.ComparisonStrategy p5)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeBetween(java.util.Date p0, java.util.Date p1, java.util.Date p2, boolean p3, boolean p4)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeBetween(java.util.Date p0, java.util.Date p1, java.util.Date p2, boolean p3, boolean p4, org.assertj.core.internal.ComparisonStrategy p5)`

---

## public class `org.assertj.core.error.ShouldBeBlank`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeBlank(java.lang.CharSequence p0)`

---

## public class `org.assertj.core.error.ShouldBeCanonicalPath`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Fields:**
- `public final static java.lang.String SHOULD_BE_CANONICAL`

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeCanonicalPath(java.nio.file.Path p0)`

---

## public class `org.assertj.core.error.ShouldBeCloseTo`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeCloseTo(java.time.temporal.Temporal p0, java.time.temporal.Temporal p1, java.lang.String p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeCloseTo(java.time.temporal.TemporalAmount p0, java.time.temporal.TemporalAmount p1, java.time.temporal.TemporalAmount p2, java.time.temporal.TemporalAmount p3)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeCloseTo(java.util.Date p0, java.util.Date p1, long p2, long p3)`

---

## public class `org.assertj.core.error.ShouldBeDirectory`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Fields:**
- `public final static java.lang.String FILE_SHOULD_BE_DIRECTORY`
- `public final static java.lang.String PATH_SHOULD_BE_DIRECTORY`

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeDirectory(java.io.File p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeDirectory(java.nio.file.Path p0)`

---

## public class `org.assertj.core.error.ShouldBeEmpty`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEmpty(java.io.File p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEmpty(java.lang.Object p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEmpty(java.nio.file.Path p0)`

---

## public class `org.assertj.core.error.ShouldBeEmptyDirectory`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Fields:**
- `public final static java.lang.String SHOULD_BE_EMPTY_DIRECTORY`

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEmptyDirectory(java.io.File p0, java.util.List p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEmptyDirectory(java.nio.file.Path p0, java.util.List p1)`

---

## public class `org.assertj.core.error.ShouldBeEqual`
implements `org.assertj.core.error.AssertionErrorFactory`  

**Constructors:**
- `protected ShouldBeEqual(java.lang.Object p0, java.lang.Object p1, org.assertj.core.internal.ComparisonStrategy p2, org.assertj.core.presentation.Representation p3)`

**Fields:**
- `protected final java.lang.Object actual`
- `protected final org.assertj.core.internal.ComparisonStrategy comparisonStrategy`
- `protected final java.lang.Object expected`
- `protected final org.assertj.core.error.MessageFormatter messageFormatter`

**Methods:**
- `protected boolean actualAndExpectedHaveSameStringRepresentation()`
- `protected java.lang.String defaultDetailedErrorMessage(org.assertj.core.description.Description p0, org.assertj.core.presentation.Representation p1)`
- `protected java.lang.String detailedActual()`
- `protected java.lang.String detailedExpected()`
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `protected java.lang.String indent(java.lang.String p0)`
- `public java.lang.AssertionError newAssertionError(org.assertj.core.description.Description p0, org.assertj.core.presentation.Representation p1)`
- `public static org.assertj.core.error.AssertionErrorFactory shouldBeEqual(java.lang.Object p0, java.lang.Object p1, org.assertj.core.internal.ComparisonStrategy p2, org.assertj.core.presentation.Representation p3)`
- `public static org.assertj.core.error.AssertionErrorFactory shouldBeEqual(java.lang.Object p0, java.lang.Object p1, org.assertj.core.presentation.Representation p2)`
- `protected java.lang.String smartErrorMessage(org.assertj.core.description.Description p0, org.assertj.core.presentation.Representation p1)`

---

## public class `org.assertj.core.error.ShouldBeEqualByComparingFieldByFieldRecursively`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEqualByComparingFieldByFieldRecursive(java.lang.Object p0, java.lang.Object p1, java.util.List p2, org.assertj.core.presentation.Representation p3)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEqualByComparingFieldByFieldRecursively(java.lang.Object p0, java.lang.Object p1, java.util.List p2, org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration p3, org.assertj.core.presentation.Representation p4)`

---

## public class `org.assertj.core.error.ShouldBeEqualByComparingOnlyGivenFields`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEqualComparingOnlyGivenFields(java.lang.Object p0, java.util.List p1, java.util.List p2, java.util.List p3, java.util.List p4)`

---

## public class `org.assertj.core.error.ShouldBeEqualIgnoringCase`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEqual(java.lang.CharSequence p0, java.lang.CharSequence p1)`

---

## public class `org.assertj.core.error.ShouldBeEqualIgnoringHours`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEqualIgnoringHours(java.lang.Object p0, java.lang.Object p1)`

---

## public class `org.assertj.core.error.ShouldBeEqualIgnoringMinutes`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEqualIgnoringMinutes(java.lang.Object p0, java.lang.Object p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEqualIgnoringMinutes(java.time.LocalTime p0, java.time.LocalTime p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEqualIgnoringMinutes(java.time.OffsetTime p0, java.time.OffsetTime p1)`

---

## public class `org.assertj.core.error.ShouldBeEqualIgnoringNanos`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEqualIgnoringNanos(java.lang.Object p0, java.lang.Object p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEqualIgnoringNanos(java.time.LocalTime p0, java.time.LocalTime p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEqualIgnoringNanos(java.time.OffsetTime p0, java.time.OffsetTime p1)`

---

## public class `org.assertj.core.error.ShouldBeEqualIgnoringNewLineDifferences`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEqualIgnoringNewLineDifferences(java.lang.CharSequence p0, java.lang.CharSequence p1)`

---

## public class `org.assertj.core.error.ShouldBeEqualIgnoringNewLines`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEqualIgnoringNewLines(java.lang.CharSequence p0, java.lang.CharSequence p1)`

---

## public class `org.assertj.core.error.ShouldBeEqualIgnoringSeconds`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEqualIgnoringSeconds(java.lang.Object p0, java.lang.Object p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEqualIgnoringSeconds(java.time.LocalTime p0, java.time.LocalTime p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEqualIgnoringSeconds(java.time.OffsetTime p0, java.time.OffsetTime p1)`

---

## public class `org.assertj.core.error.ShouldBeEqualIgnoringTimezone`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEqualIgnoringTimezone(java.time.OffsetDateTime p0, java.time.OffsetDateTime p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEqualIgnoringTimezone(java.time.OffsetTime p0, java.time.OffsetTime p1)`

---

## public class `org.assertj.core.error.ShouldBeEqualIgnoringWhitespace`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEqualIgnoringWhitespace(java.lang.CharSequence p0, java.lang.CharSequence p1)`

---

## public class `org.assertj.core.error.ShouldBeEqualNormalizingPunctuationAndWhitespace`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEqualNormalizingPunctuationAndWhitespace(java.lang.CharSequence p0, java.lang.CharSequence p1)`

---

## public class `org.assertj.core.error.ShouldBeEqualNormalizingUnicode`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEqualNormalizingUnicode(java.lang.CharSequence p0, java.lang.CharSequence p1, java.lang.CharSequence p2, java.lang.CharSequence p3)`

---

## public class `org.assertj.core.error.ShouldBeEqualNormalizingWhitespace`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEqualNormalizingWhitespace(java.lang.CharSequence p0, java.lang.CharSequence p1)`

---

## public class `org.assertj.core.error.ShouldBeEqualToIgnoringFields`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEqualToIgnoringGivenFields(java.lang.Object p0, java.util.List p1, java.util.List p2, java.util.List p3, java.util.List p4)`

---

## public class `org.assertj.core.error.ShouldBeEqualWithTimePrecision`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEqual(java.util.Date p0, java.util.Date p1, java.util.concurrent.TimeUnit p2)`

---

## public class `org.assertj.core.error.ShouldBeEqualWithinOffset`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <T extends java.lang.Number> org.assertj.core.error.ErrorMessageFactory shouldBeEqual(T p0, T p1, org.assertj.core.data.Offset p2, T p3)`

---

## public class `org.assertj.core.error.ShouldBeEqualWithinPercentage`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <T extends java.lang.Number> org.assertj.core.error.ErrorMessageFactory shouldBeEqualWithinPercentage(T p0, T p1, org.assertj.core.data.Percentage p2, T p3)`

---

## public class `org.assertj.core.error.ShouldBeEven`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEven(java.lang.Number p0)`

---

## public class `org.assertj.core.error.ShouldBeExactlyInstanceOf`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeExactlyInstance(java.lang.Object p0, java.lang.Class p1)`

---

## public class `org.assertj.core.error.ShouldBeExecutable`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeExecutable(java.io.File p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeExecutable(java.nio.file.Path p0)`

---

## public class `org.assertj.core.error.ShouldBeExhausted`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Fields:**
- `public final static java.lang.String SHOULD_BE_EXHAUSTED`

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeExhausted()`

---

## public class `org.assertj.core.error.ShouldBeFalse`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeFalse(boolean p0)`

---

## public class `org.assertj.core.error.ShouldBeFile`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeFile(java.io.File p0)`

---

## public class `org.assertj.core.error.ShouldBeFinite`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeFinite(java.lang.Number p0)`

---

## public class `org.assertj.core.error.ShouldBeGreater`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldBeGreater(java.lang.Comparable p0, java.lang.Comparable p1)`
- `public static <T extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldBeGreater(java.lang.Comparable p0, java.lang.Comparable p1, org.assertj.core.internal.ComparisonStrategy p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeGreater(java.lang.Object p0, java.lang.Object p1, org.assertj.core.internal.ComparisonStrategy p2)`

---

## public class `org.assertj.core.error.ShouldBeGreaterOrEqual`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldBeGreaterOrEqual(java.lang.Comparable p0, java.lang.Comparable p1)`
- `public static <T extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldBeGreaterOrEqual(java.lang.Comparable p0, java.lang.Comparable p1, org.assertj.core.internal.ComparisonStrategy p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeGreaterOrEqual(java.lang.Object p0, java.lang.Object p1, org.assertj.core.internal.ComparisonStrategy p2)`

---

## public class `org.assertj.core.error.ShouldBeIn`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeIn(java.lang.Object p0, java.lang.Object p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeIn(java.lang.Object p0, java.lang.Object p1, org.assertj.core.internal.ComparisonStrategy p2)`

---

## public class `org.assertj.core.error.ShouldBeInSameDay`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeInSameDay(java.util.Date p0, java.util.Date p1)`

---

## public class `org.assertj.core.error.ShouldBeInSameHour`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeInSameHour(java.util.Date p0, java.util.Date p1)`

---

## public class `org.assertj.core.error.ShouldBeInSameHourWindow`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeInSameHourWindow(java.util.Date p0, java.util.Date p1)`

---

## public class `org.assertj.core.error.ShouldBeInSameMinute`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeInSameMinute(java.util.Date p0, java.util.Date p1)`

---

## public class `org.assertj.core.error.ShouldBeInSameMinuteWindow`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeInSameMinuteWindow(java.util.Date p0, java.util.Date p1)`

---

## public class `org.assertj.core.error.ShouldBeInSameMonth`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeInSameMonth(java.util.Date p0, java.util.Date p1)`

---

## public class `org.assertj.core.error.ShouldBeInSameSecond`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeInSameSecond(java.util.Date p0, java.util.Date p1)`

---

## public class `org.assertj.core.error.ShouldBeInSameSecondWindow`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeInSameSecondWindow(java.util.Date p0, java.util.Date p1)`

---

## public class `org.assertj.core.error.ShouldBeInSameYear`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeInSameYear(java.util.Date p0, java.util.Date p1)`

---

## public class `org.assertj.core.error.ShouldBeInTheFuture`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeInTheFuture(java.util.Date p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeInTheFuture(java.util.Date p0, org.assertj.core.internal.ComparisonStrategy p1)`

---

## public class `org.assertj.core.error.ShouldBeInThePast`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeInThePast(java.util.Date p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeInThePast(java.util.Date p0, org.assertj.core.internal.ComparisonStrategy p1)`

---

## public class `org.assertj.core.error.ShouldBeInfinite`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeInfinite(java.lang.Number p0)`

---

## public class `org.assertj.core.error.ShouldBeInstance`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeInstance(java.lang.Object p0, java.lang.Class p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeInstanceButWasNull(java.lang.String p0, java.lang.Class p1)`

---

## public class `org.assertj.core.error.ShouldBeInstanceOfAny`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeInstanceOfAny(java.lang.Object p0, java.lang.Class[] p1)`

---

## public class `org.assertj.core.error.ShouldBeInterface`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeInterface(java.lang.Class p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeInterface(java.lang.Class p0)`

---

## public class `org.assertj.core.error.ShouldBeLess`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <T extends java.lang.Comparable<? super T>> org.assertj.core.error.ErrorMessageFactory shouldBeLess(T p0, T p1, org.assertj.core.internal.ComparisonStrategy p2)`
- `public static <T extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldBeLess(java.lang.Comparable p0, java.lang.Comparable p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeLess(java.lang.Object p0, java.lang.Object p1, org.assertj.core.internal.ComparisonStrategy p2)`

---

## public class `org.assertj.core.error.ShouldBeLessOrEqual`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldBeLessOrEqual(java.lang.Comparable p0, java.lang.Comparable p1)`
- `public static <T extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldBeLessOrEqual(java.lang.Comparable p0, java.lang.Comparable p1, org.assertj.core.internal.ComparisonStrategy p2)`
- `public static <T extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldBeLessOrEqual(java.lang.Object p0, java.lang.Object p1, org.assertj.core.internal.ComparisonStrategy p2)`

---

## public class `org.assertj.core.error.ShouldBeLowerCase`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeLowerCase(java.lang.Object p0)`

---

## public class `org.assertj.core.error.ShouldBeMarked`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeMarked(java.util.concurrent.atomic.AtomicMarkableReference p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeMarked(java.util.concurrent.atomic.AtomicMarkableReference p0)`

---

## public class `org.assertj.core.error.ShouldBeMixedCase`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeMixedCase(java.lang.CharSequence p0)`

---

## public class `org.assertj.core.error.ShouldBeNormalized`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Fields:**
- `public final static java.lang.String SHOULD_BE_NORMALIZED`

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeNormalized(java.nio.file.Path p0)`

---

## public class `org.assertj.core.error.ShouldBeNullOrEmpty`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeNullOrEmpty(java.lang.Object p0)`

---

## public class `org.assertj.core.error.ShouldBeOdd`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeOdd(java.lang.Number p0)`

---

## public class `org.assertj.core.error.ShouldBeOfClassIn`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeOfClassIn(java.lang.Object p0, java.lang.Object p1)`

---

## public class `org.assertj.core.error.ShouldBePeriod`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ShouldBePeriod shouldBeNegative(java.time.Period p0)`
- `public static org.assertj.core.error.ShouldBePeriod shouldBePositive(java.time.Period p0)`

---

## public class `org.assertj.core.error.ShouldBeReadable`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeReadable(java.io.File p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeReadable(java.nio.file.Path p0)`

---

## public class `org.assertj.core.error.ShouldBeRegularFile`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Fields:**
- `public final static java.lang.String SHOULD_BE_REGULAR_FILE`

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeRegularFile(java.nio.file.Path p0)`

---

## public class `org.assertj.core.error.ShouldBeRelativePath`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Fields:**
- `public final static java.lang.String SHOULD_BE_RELATIVE_PATH`

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeRelativePath(java.io.File p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeRelativePath(java.nio.file.Path p0)`

---

## public class `org.assertj.core.error.ShouldBeSame`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeSame(java.lang.Object p0, java.lang.Object p1)`

---

## public class `org.assertj.core.error.ShouldBeSorted`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeSorted(int p0, java.lang.Object p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeSortedAccordingToGivenComparator(int p0, java.lang.Object p1, java.util.Comparator p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveComparableElementsAccordingToGivenComparator(java.lang.Object p0, java.util.Comparator p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveMutuallyComparableElements(java.lang.Object p0)`

---

## public class `org.assertj.core.error.ShouldBeSubsetOf`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeSubsetOf(java.lang.Object p0, java.lang.Object p1, java.lang.Iterable p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeSubsetOf(java.lang.Object p0, java.lang.Object p1, java.lang.Iterable p2, org.assertj.core.internal.ComparisonStrategy p3)`

---

## public class `org.assertj.core.error.ShouldBeSubstring`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeSubstring(java.lang.CharSequence p0, java.lang.CharSequence p1, org.assertj.core.internal.ComparisonStrategy p2)`

---

## public class `org.assertj.core.error.ShouldBeSymbolicLink`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Fields:**
- `public final static java.lang.String SHOULD_BE_SYMBOLIC_LINK`

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeSymbolicLink(java.nio.file.Path p0)`

---

## public class `org.assertj.core.error.ShouldBeToday`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeToday(java.time.LocalDate p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeToday(java.util.Date p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeToday(java.util.Date p0, org.assertj.core.internal.ComparisonStrategy p1)`

---

## public class `org.assertj.core.error.ShouldBeTrue`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeTrue(boolean p0)`

---

## public class `org.assertj.core.error.ShouldBeUnmodifiable`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeUnmodifiable(java.lang.String p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeUnmodifiable(java.lang.String p0, java.lang.RuntimeException p1)`

---

## public class `org.assertj.core.error.ShouldBeUpperCase`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeUpperCase(java.lang.Object p0)`

---

## public class `org.assertj.core.error.ShouldBeWritable`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeWritable(java.io.File p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeWritable(java.nio.file.Path p0)`

---

## public class `org.assertj.core.error.ShouldContain`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory directoryShouldContain(java.io.File p0, java.util.List p1, java.lang.String p2)`
- `public static org.assertj.core.error.ErrorMessageFactory directoryShouldContain(java.nio.file.Path p0, java.util.List p1, java.lang.String p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContain(java.lang.Class p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, org.assertj.core.internal.ComparisonStrategy p4)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContain(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContain(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, org.assertj.core.internal.ComparisonStrategy p3)`

---

## public class `org.assertj.core.error.ShouldContainAnyOf`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainAnyOf(java.lang.Object p0, java.lang.Object p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainAnyOf(java.lang.Object p0, java.lang.Object p1, org.assertj.core.internal.ComparisonStrategy p2)`

---

## public class `org.assertj.core.error.ShouldContainAtIndex`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainAtIndex(java.lang.Object p0, java.lang.Object p1, org.assertj.core.data.Index p2, java.lang.Object p3)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainAtIndex(java.lang.Object p0, java.lang.Object p1, org.assertj.core.data.Index p2, java.lang.Object p3, org.assertj.core.internal.ComparisonStrategy p4)`

---

## public class `org.assertj.core.error.ShouldContainCharSequence`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory containsIgnoringNewLines(java.lang.CharSequence p0, java.lang.CharSequence[] p1, java.util.Set p2, org.assertj.core.internal.ComparisonStrategy p3)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContain(java.lang.CharSequence p0, java.lang.CharSequence p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContain(java.lang.CharSequence p0, java.lang.CharSequence p1, org.assertj.core.internal.ComparisonStrategy p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContain(java.lang.CharSequence p0, java.lang.CharSequence[] p1, java.util.Set p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContain(java.lang.CharSequence p0, java.lang.CharSequence[] p1, java.util.Set p2, org.assertj.core.internal.ComparisonStrategy p3)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContain(java.lang.Throwable p0, java.lang.CharSequence p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContain(java.lang.Throwable p0, java.lang.CharSequence[] p1, java.util.Set p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainIgnoringCase(java.lang.CharSequence p0, java.lang.CharSequence p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainIgnoringWhitespaces(java.lang.CharSequence p0, java.lang.CharSequence p1, org.assertj.core.internal.ComparisonStrategy p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainIgnoringWhitespaces(java.lang.CharSequence p0, java.lang.CharSequence[] p1, java.util.Set p2, org.assertj.core.internal.ComparisonStrategy p3)`

---

## public class `org.assertj.core.error.ShouldContainCharSequenceOnlyOnce`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainOnlyOnce(java.lang.CharSequence p0, java.lang.CharSequence p1, int p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainOnlyOnce(java.lang.CharSequence p0, java.lang.CharSequence p1, int p2, org.assertj.core.internal.ComparisonStrategy p3)`

---

## public class `org.assertj.core.error.ShouldContainEntries`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <K extends java.lang.Object, V extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldContainEntries(java.util.Map p0, java.util.Map$Entry[] p1, java.util.Set p2, java.util.Set p3, org.assertj.core.presentation.Representation p4)`

---

## public class `org.assertj.core.error.ShouldContainEntry`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <K extends java.lang.Object, V extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldContainEntry(java.util.Map p0, org.assertj.core.api.Condition p1)`
- `public static <K extends java.lang.Object, V extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldContainEntry(java.util.Map p0, org.assertj.core.api.Condition p1, org.assertj.core.api.Condition p2)`

---

## public class `org.assertj.core.error.ShouldContainExactly`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory elementsDifferAtIndex(java.lang.Object p0, java.lang.Object p1, int p2)`
- `public static org.assertj.core.error.ErrorMessageFactory elementsDifferAtIndex(java.lang.Object p0, java.lang.Object p1, int p2, org.assertj.core.internal.ComparisonStrategy p3)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainExactly(java.lang.Object p0, java.lang.Iterable p1, java.lang.Iterable p2, java.lang.Iterable p3)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainExactly(java.lang.Object p0, java.lang.Iterable p1, java.lang.Iterable p2, java.lang.Iterable p3, org.assertj.core.internal.ComparisonStrategy p4)`

---

## public class `org.assertj.core.error.ShouldContainExactlyInAnyOrder`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainExactlyInAnyOrder(java.lang.Object p0, java.lang.Object p1, java.lang.Iterable p2, java.lang.Iterable p3, org.assertj.core.internal.ComparisonStrategy p4)`

---

## public final static enum `org.assertj.core.error.ShouldContainExactlyInAnyOrder$ErrorType`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.assertj.core.error.ShouldContainExactlyInAnyOrder$ErrorType NOT_EXPECTED_ONLY`
- `public final static org.assertj.core.error.ShouldContainExactlyInAnyOrder$ErrorType NOT_FOUND_ONLY`

---

## public class `org.assertj.core.error.ShouldContainKey`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainKey(java.lang.Object p0, org.assertj.core.api.Condition p1)`

---

## public class `org.assertj.core.error.ShouldContainKeys`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <K extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldContainKeys(java.lang.Object p0, java.util.Set p1)`

---

## public class `org.assertj.core.error.ShouldContainNull`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainNull(java.lang.Object p0)`

---

## public class `org.assertj.core.error.ShouldContainOneOrMoreWhitespaces`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainOneOrMoreWhitespaces(java.lang.CharSequence p0)`

---

## public class `org.assertj.core.error.ShouldContainOnly`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainOnly(java.lang.Object p0, java.lang.Object p1, java.lang.Iterable p2, java.lang.Iterable p3)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainOnly(java.lang.Object p0, java.lang.Object p1, java.lang.Iterable p2, java.lang.Iterable p3, org.assertj.core.error.GroupTypeDescription p4)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainOnly(java.lang.Object p0, java.lang.Object p1, java.lang.Iterable p2, java.lang.Iterable p3, org.assertj.core.internal.ComparisonStrategy p4)`

---

## public final static enum `org.assertj.core.error.ShouldContainOnly$ErrorType`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.assertj.core.error.ShouldContainOnly$ErrorType NOT_EXPECTED_ONLY`
- `public final static org.assertj.core.error.ShouldContainOnly$ErrorType NOT_FOUND_ONLY`

---

## public class `org.assertj.core.error.ShouldContainOnlyDigits`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainOnlyDigits(java.lang.CharSequence p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainOnlyDigits(java.lang.CharSequence p0, char p1, int p2)`

---

## public class `org.assertj.core.error.ShouldContainOnlyKeys`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainOnlyKeys(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Iterable p3)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainOnlyKeys(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3)`

---

## public class `org.assertj.core.error.ShouldContainOnlyNulls`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainOnlyNulls(java.lang.Object p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainOnlyNulls(java.lang.Object p0, java.lang.Iterable p1)`

---

## public final static enum `org.assertj.core.error.ShouldContainOnlyNulls$ErrorType`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.assertj.core.error.ShouldContainOnlyNulls$ErrorType EMPTY`
- `public final static org.assertj.core.error.ShouldContainOnlyNulls$ErrorType NON_NULL_ELEMENTS`

---

## public class `org.assertj.core.error.ShouldContainOnlyWhitespaces`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainOnlyWhitespaces(java.lang.CharSequence p0)`

---

## public class `org.assertj.core.error.ShouldContainPattern`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainPattern(java.lang.CharSequence p0, java.lang.CharSequence p1)`

---

## public class `org.assertj.core.error.ShouldContainRecursively`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory directoryShouldContainRecursively(java.io.File p0, java.util.List p1, java.lang.String p2)`
- `public static org.assertj.core.error.ErrorMessageFactory directoryShouldContainRecursively(java.nio.file.Path p0, java.util.List p1, java.lang.String p2)`

---

## public class `org.assertj.core.error.ShouldContainSequence`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainSequence(java.lang.Object p0, java.lang.Object p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainSequence(java.lang.Object p0, java.lang.Object p1, org.assertj.core.internal.ComparisonStrategy p2)`

---

## public class `org.assertj.core.error.ShouldContainSequenceOfCharSequence`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainSequence(java.lang.CharSequence p0, java.lang.CharSequence[] p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainSequence(java.lang.CharSequence p0, java.lang.CharSequence[] p1, org.assertj.core.internal.ComparisonStrategy p2)`

---

## public class `org.assertj.core.error.ShouldContainSubsequence`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ShouldContainSubsequence actualDoesNotHaveEnoughElementsLeftToContainSubsequence(java.lang.Object p0, java.lang.Object p1, int p2, int p3)`
- `public static org.assertj.core.error.ShouldContainSubsequence actualDoesNotHaveEnoughElementsToContainSubsequence(java.lang.Object p0, java.lang.Object p1)`
- `public static org.assertj.core.error.ShouldContainSubsequence shouldContainSubsequence(java.lang.Object p0, java.lang.Object p1, int p2, org.assertj.core.internal.ComparisonStrategy p3)`

---

## public class `org.assertj.core.error.ShouldContainSubsequenceOfCharSequence`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainSubsequence(java.lang.CharSequence p0, java.lang.CharSequence[] p1, int p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainSubsequence(java.lang.CharSequence p0, java.lang.CharSequence[] p1, int p2, org.assertj.core.internal.ComparisonStrategy p3)`

---

## public class `org.assertj.core.error.ShouldContainValue`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainValue(java.lang.Object p0, java.lang.Object p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainValue(java.lang.Object p0, org.assertj.core.api.Condition p1)`

---

## public class `org.assertj.core.error.ShouldContainValues`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <V extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldContainValues(java.lang.Object p0, java.util.Set p1)`

---

## public class `org.assertj.core.error.ShouldContainsOnlyOnce`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainsOnlyOnce(java.lang.Object p0, java.lang.Object p1, java.util.Set p2, java.util.Set p3)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldContainsOnlyOnce(java.lang.Object p0, java.lang.Object p1, java.util.Set p2, java.util.Set p3, org.assertj.core.internal.ComparisonStrategy p4)`

---

## public class `org.assertj.core.error.ShouldEndWith`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldEndWith(java.lang.Object p0, java.lang.Object p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldEndWith(java.lang.Object p0, java.lang.Object p1, org.assertj.core.internal.ComparisonStrategy p2)`

---

## public class `org.assertj.core.error.ShouldEndWithIgnoringCase`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldEndWithIgnoringCase(java.lang.CharSequence p0, java.lang.CharSequence p1, org.assertj.core.internal.ComparisonStrategy p2)`

---

## public class `org.assertj.core.error.ShouldEndWithPath`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Fields:**
- `public final static java.lang.String PATH_SHOULD_END_WITH`

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldEndWith(java.nio.file.Path p0, java.nio.file.Path p1)`

---

## public class `org.assertj.core.error.ShouldExist`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Fields:**
- `public final static java.lang.String FILE_SHOULD_EXIST`
- `public final static java.lang.String PATH_SHOULD_EXIST`
- `public final static java.lang.String PATH_SHOULD_EXIST_NO_FOLLOW_LINKS`

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldExist(java.io.File p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldExist(java.nio.file.Path p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldExistNoFollowLinks(java.nio.file.Path p0)`

---

## public class `org.assertj.core.error.ShouldHave`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldHave(T p0, org.assertj.core.api.Condition p1)`

---

## public class `org.assertj.core.error.ShouldHaveAllNullFields`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Constructors:**
- `public ShouldHaveAllNullFields(java.lang.Object p0, java.lang.String p1)`
- `public ShouldHaveAllNullFields(java.lang.Object p0, java.lang.String p1, java.util.List p2)`
- `public ShouldHaveAllNullFields(java.lang.Object p0, java.util.List p1)`
- `public ShouldHaveAllNullFields(java.lang.Object p0, java.util.List p1, java.util.List p2)`

**Methods:**
- `public static org.assertj.core.error.ShouldHaveAllNullFields shouldHaveAllNullFields(java.lang.Object p0, java.util.List p1, java.util.List p2)`

---

## public class `org.assertj.core.error.ShouldHaveAnnotations`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveAnnotations(java.lang.Class p0, java.util.Collection p1, java.util.Collection p2)`

---

## public class `org.assertj.core.error.ShouldHaveAtIndex`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldHaveAtIndex(java.util.List p0, org.assertj.core.api.Condition p1, org.assertj.core.data.Index p2, T p3)`

---

## public class `org.assertj.core.error.ShouldHaveAtLeastOneElementOfType`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ShouldHaveAtLeastOneElementOfType shouldHaveAtLeastOneElementOfType(java.lang.Object p0, java.lang.Class p1)`

---

## public class `org.assertj.core.error.ShouldHaveBinaryContent`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveBinaryContent(java.io.File p0, org.assertj.core.internal.BinaryDiffResult p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveBinaryContent(java.io.InputStream p0, org.assertj.core.internal.BinaryDiffResult p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveBinaryContent(java.nio.file.Path p0, org.assertj.core.internal.BinaryDiffResult p1)`

---

## public class `org.assertj.core.error.ShouldHaveCause`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveCause(java.lang.Throwable p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveCause(java.lang.Throwable p0, java.lang.Throwable p1)`

---

## public class `org.assertj.core.error.ShouldHaveCauseExactlyInstance`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveCauseExactlyInstance(java.lang.Throwable p0, java.lang.Class p1)`

---

## public class `org.assertj.core.error.ShouldHaveCauseInstance`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveCauseInstance(java.lang.Throwable p0, java.lang.Class p1)`

---

## public class `org.assertj.core.error.ShouldHaveCauseReference`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveCauseReference(java.lang.Throwable p0, java.lang.Throwable p1)`

---

## public class `org.assertj.core.error.ShouldHaveContent`
extends `org.assertj.core.error.AbstractShouldHaveTextContent`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveContent(java.io.File p0, java.nio.charset.Charset p1, java.util.List p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveContent(java.nio.file.Path p0, java.nio.charset.Charset p1, java.util.List p2)`

---

## public class `org.assertj.core.error.ShouldHaveDateField`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveDateField(java.time.temporal.Temporal p0, java.lang.String p1, int p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveDateField(java.util.Date p0, java.lang.String p1, int p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveMonth(java.time.temporal.Temporal p0, java.time.Month p1)`

---

## public class `org.assertj.core.error.ShouldHaveDigest`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveDigest(java.io.File p0, org.assertj.core.internal.DigestDiff p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveDigest(java.io.InputStream p0, org.assertj.core.internal.DigestDiff p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveDigest(java.nio.file.Path p0, org.assertj.core.internal.DigestDiff p1)`

---

## public class `org.assertj.core.error.ShouldHaveDimensions`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveFirstDimension(java.lang.Object p0, int p1, int p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveSize(java.lang.Object p0, int p1, int p2, int p3)`

---

## public class `org.assertj.core.error.ShouldHaveDuration`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ShouldHaveDuration shouldHaveDays(java.time.Duration p0, long p1, long p2)`
- `public static org.assertj.core.error.ShouldHaveDuration shouldHaveHours(java.time.Duration p0, long p1, long p2)`
- `public static org.assertj.core.error.ShouldHaveDuration shouldHaveMillis(java.time.Duration p0, long p1, long p2)`
- `public static org.assertj.core.error.ShouldHaveDuration shouldHaveMinutes(java.time.Duration p0, long p1, long p2)`
- `public static org.assertj.core.error.ShouldHaveDuration shouldHaveNanos(java.time.Duration p0, long p1, long p2)`
- `public static org.assertj.core.error.ShouldHaveDuration shouldHaveSeconds(java.time.Duration p0, long p1, long p2)`

---

## public class `org.assertj.core.error.ShouldHaveExactlyTypes`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory elementsTypesDifferAtIndex(java.lang.Object p0, java.lang.Class p1, int p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveTypes(java.lang.Object p0, java.lang.Iterable p1, java.lang.Iterable p2, java.lang.Iterable p3)`

---

## public class `org.assertj.core.error.ShouldHaveExtension`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ShouldHaveExtension shouldHaveExtension(java.io.File p0, java.lang.String p1)`
- `public static org.assertj.core.error.ShouldHaveExtension shouldHaveExtension(java.io.File p0, java.lang.String p1, java.lang.String p2)`
- `public static org.assertj.core.error.ShouldHaveExtension shouldHaveExtension(java.nio.file.Path p0, java.lang.String p1)`
- `public static org.assertj.core.error.ShouldHaveExtension shouldHaveExtension(java.nio.file.Path p0, java.lang.String p1, java.lang.String p2)`

---

## public class `org.assertj.core.error.ShouldHaveFields`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveDeclaredFields(java.lang.Class p0, java.util.Set p1, java.util.Set p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveFields(java.lang.Class p0, java.util.Set p1, java.util.Set p2)`

---

## public class `org.assertj.core.error.ShouldHaveFileSystem`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveFileSystem(java.nio.file.Path p0, java.nio.file.FileSystem p1)`

---

## public class `org.assertj.core.error.ShouldHaveLineCount`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveLinesCount(java.lang.Object p0, int p1, int p2)`

---

## public class `org.assertj.core.error.ShouldHaveMessage`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveMessage(java.lang.Throwable p0, java.lang.String p1)`

---

## public class `org.assertj.core.error.ShouldHaveMessageFindingMatchRegex`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveMessageFindingMatchRegex(java.lang.Throwable p0, java.lang.CharSequence p1)`

---

## public class `org.assertj.core.error.ShouldHaveMessageMatchingRegex`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveMessageMatchingRegex(java.lang.Throwable p0, java.lang.CharSequence p1)`

---

## public class `org.assertj.core.error.ShouldHaveMethods`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveMethods(java.lang.Class p0, boolean p1, java.util.SortedSet p2, java.lang.String p3, java.util.Map p4)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveMethods(java.lang.Class p0, boolean p1, java.util.SortedSet p2, java.util.SortedSet p3)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotHaveMethods(java.lang.Class p0, boolean p1, java.util.SortedSet p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotHaveMethods(java.lang.Class p0, java.lang.String p1, boolean p2, java.util.SortedSet p3)`

---

## public class `org.assertj.core.error.ShouldHaveName`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ShouldHaveName shouldHaveName(java.io.File p0, java.lang.String p1)`
- `public static org.assertj.core.error.ShouldHaveName shouldHaveName(java.nio.file.Path p0, java.lang.String p1)`

---

## public class `org.assertj.core.error.ShouldHaveNext`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveNext()`

---

## public class `org.assertj.core.error.ShouldHaveNoCause`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveNoCause(java.lang.Throwable p0)`

---

## public class `org.assertj.core.error.ShouldHaveNoExtension`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ShouldHaveNoExtension shouldHaveNoExtension(java.io.File p0, java.lang.String p1)`
- `public static org.assertj.core.error.ShouldHaveNoExtension shouldHaveNoExtension(java.nio.file.Path p0, java.lang.String p1)`

---

## public class `org.assertj.core.error.ShouldHaveNoFields`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveNoDeclaredFields(java.lang.Class p0, java.util.Set p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveNoPublicFields(java.lang.Class p0, java.util.Set p1)`

---

## public class `org.assertj.core.error.ShouldHaveNoNullFields`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Constructors:**
- `public ShouldHaveNoNullFields(java.lang.Object p0, java.lang.String p1)`
- `public ShouldHaveNoNullFields(java.lang.Object p0, java.lang.String p1, java.util.List p2)`
- `public ShouldHaveNoNullFields(java.lang.Object p0, java.util.List p1)`
- `public ShouldHaveNoNullFields(java.lang.Object p0, java.util.List p1, java.util.List p2)`

**Methods:**
- `public static org.assertj.core.error.ShouldHaveNoNullFields shouldHaveNoNullFieldsExcept(java.lang.Object p0, java.util.List p1, java.util.List p2)`

---

## public class `org.assertj.core.error.ShouldHaveNoParent`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Fields:**
- `public final static java.lang.String FILE_HAS_PARENT`
- `public final static java.lang.String PATH_HAS_PARENT`

**Methods:**
- `public static org.assertj.core.error.ShouldHaveNoParent shouldHaveNoParent(java.io.File p0)`
- `public static org.assertj.core.error.ShouldHaveNoParent shouldHaveNoParent(java.nio.file.Path p0)`

---

## public class `org.assertj.core.error.ShouldHaveNoSuperclass`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveNoSuperclass(java.lang.Class p0)`

---

## public class `org.assertj.core.error.ShouldHaveNoSuppressedExceptions`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveNoSuppressedExceptions(java.lang.Throwable p0)`

---

## public class `org.assertj.core.error.ShouldHaveOnlyElementsOfType`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ShouldHaveOnlyElementsOfType shouldHaveOnlyElementsOfType(java.lang.Object p0, java.lang.Class p1, java.lang.Class p2)`

---

## public class `org.assertj.core.error.ShouldHavePackage`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHavePackage(java.lang.Class p0, java.lang.Package p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHavePackage(java.lang.Class p0, java.lang.String p1)`

---

## public class `org.assertj.core.error.ShouldHaveParent`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Fields:**
- `public final static java.lang.String FILE_NOT_EXPECTED_PARENT`
- `public final static java.lang.String FILE_NO_PARENT`
- `public final static java.lang.String PATH_NOT_EXPECTED_PARENT`
- `public final static java.lang.String PATH_NO_PARENT`

**Methods:**
- `public static org.assertj.core.error.ShouldHaveParent shouldHaveParent(java.io.File p0, java.io.File p1)`
- `public static org.assertj.core.error.ShouldHaveParent shouldHaveParent(java.nio.file.Path p0, java.nio.file.Path p1)`
- `public static org.assertj.core.error.ShouldHaveParent shouldHaveParent(java.nio.file.Path p0, java.nio.file.Path p1, java.nio.file.Path p2)`

---

## public class `org.assertj.core.error.ShouldHavePeriod`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ShouldHavePeriod shouldHaveDays(java.time.Period p0, int p1, int p2)`
- `public static org.assertj.core.error.ShouldHavePeriod shouldHaveMonths(java.time.Period p0, int p1, int p2)`
- `public static org.assertj.core.error.ShouldHavePeriod shouldHaveYears(java.time.Period p0, int p1, int p2)`

---

## public class `org.assertj.core.error.ShouldHavePropertyOrField`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHavePropertyOrField(java.lang.Object p0, java.lang.String p1)`

---

## public class `org.assertj.core.error.ShouldHavePropertyOrFieldWithValue`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHavePropertyOrFieldWithValue(java.lang.Object p0, java.lang.String p1, java.lang.Object p2, java.lang.Object p3)`

---

## public class `org.assertj.core.error.ShouldHaveReference`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <REF extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldHaveReference(java.lang.Object p0, REF p1, REF p2)`

---

## public class `org.assertj.core.error.ShouldHaveRootCause`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveRootCause(java.lang.Throwable p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveRootCause(java.lang.Throwable p0, java.lang.Throwable p1, java.lang.Throwable p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveRootCauseWithMessage(java.lang.Throwable p0, java.lang.Throwable p1, java.lang.String p2)`

---

## public class `org.assertj.core.error.ShouldHaveRootCauseExactlyInstance`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveRootCauseExactlyInstance(java.lang.Throwable p0, java.lang.Class p1)`

---

## public class `org.assertj.core.error.ShouldHaveRootCauseInstance`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveRootCauseInstance(java.lang.Throwable p0, java.lang.Class p1)`

---

## public class `org.assertj.core.error.ShouldHaveSameClass`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveSameClass(java.lang.Object p0, java.lang.Object p1)`

---

## public class `org.assertj.core.error.ShouldHaveSameContent`
extends `org.assertj.core.error.AbstractShouldHaveTextContent`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveSameContent(java.io.File p0, java.io.File p1, java.util.List p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveSameContent(java.io.InputStream p0, java.io.InputStream p1, java.util.List p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveSameContent(java.io.InputStream p0, java.lang.String p1, java.util.List p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveSameContent(java.nio.file.Path p0, java.nio.file.Path p1, java.util.List p2)`

---

## public class `org.assertj.core.error.ShouldHaveSameDimensionsAs`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveSameDimensionsAs(int p0, int p1, int p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveSameDimensionsAs(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3)`

---

## public class `org.assertj.core.error.ShouldHaveSameFileSystemAs`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveSameFileSystemAs(java.nio.file.Path p0, java.nio.file.Path p1)`

---

## public class `org.assertj.core.error.ShouldHaveSameHashCode`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveSameHashCode(java.lang.Object p0, java.lang.Object p1)`

---

## public class `org.assertj.core.error.ShouldHaveSameHourAs`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveSameHourAs(java.time.temporal.Temporal p0, java.time.temporal.Temporal p1)`

---

## public class `org.assertj.core.error.ShouldHaveSameSizeAs`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveSameSizeAs(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3)`

---

## public class `org.assertj.core.error.ShouldHaveSameTime`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveSameTime(java.util.Date p0, java.util.Date p1)`

---

## public class `org.assertj.core.error.ShouldHaveScale`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveScale(java.math.BigDecimal p0, int p1)`

---

## public class `org.assertj.core.error.ShouldHaveSize`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveSize(java.io.File p0, long p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveSize(java.lang.Object p0, int p1, int p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveSize(java.lang.Object p0, int p1, int p2, int p3)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveSize(java.nio.file.Path p0, long p1) throws java.io.IOException`

---

## public class `org.assertj.core.error.ShouldHaveSizeBetween`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveSizeBetween(java.lang.Object p0, int p1, int p2, int p3)`

---

## public class `org.assertj.core.error.ShouldHaveSizeGreaterThan`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveSizeGreaterThan(java.lang.Object p0, int p1, int p2)`

---

## public class `org.assertj.core.error.ShouldHaveSizeGreaterThanOrEqualTo`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveSizeGreaterThanOrEqualTo(java.lang.Object p0, int p1, int p2)`

---

## public class `org.assertj.core.error.ShouldHaveSizeLessThan`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveSizeLessThan(java.lang.Object p0, int p1, int p2)`

---

## public class `org.assertj.core.error.ShouldHaveSizeLessThanOrEqualTo`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveSizeLessThanOrEqualTo(java.lang.Object p0, int p1, int p2)`

---

## public class `org.assertj.core.error.ShouldHaveStamp`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveStamp(java.util.concurrent.atomic.AtomicStampedReference p0, int p1)`

---

## public class `org.assertj.core.error.ShouldHaveSuperclass`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveSuperclass(java.lang.Class p0, java.lang.Class p1)`

---

## public class `org.assertj.core.error.ShouldHaveSuppressedException`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveSuppressedException(java.lang.Throwable p0, java.lang.Throwable p1)`

---

## public class `org.assertj.core.error.ShouldHaveTime`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveTime(java.util.Date p0, long p1)`

---

## public class `org.assertj.core.error.ShouldHaveToString`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveToString(java.lang.Object p0, java.lang.String p1)`

---

## public class `org.assertj.core.error.ShouldHaveValue`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <REF extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldHaveValue(java.lang.Object p0, REF p1)`
- `public static <REF extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldHaveValue(java.lang.Object p0, REF p1, REF p2, java.lang.Object p3)`

---

## public class `org.assertj.core.error.ShouldMatch`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Fields:**
- `public final static java.lang.String ADVICE`

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldMatch(T p0, java.util.function.Predicate p1, org.assertj.core.presentation.PredicateDescription p2)`

---

## public class `org.assertj.core.error.ShouldMatchPattern`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldMatch(java.lang.CharSequence p0, java.lang.CharSequence p1)`

---

## public class `org.assertj.core.error.ShouldNotAccept`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldNotAccept(java.util.function.Predicate p0, T p1, org.assertj.core.presentation.PredicateDescription p2)`

---

## public class `org.assertj.core.error.ShouldNotBe`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldNotBe(T p0, org.assertj.core.api.Condition p1)`

---

## public class `org.assertj.core.error.ShouldNotBeBetween`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeBetween(java.util.Date p0, java.util.Date p1, java.util.Date p2, boolean p3, boolean p4)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeBetween(java.util.Date p0, java.util.Date p1, java.util.Date p2, boolean p3, boolean p4, org.assertj.core.internal.ComparisonStrategy p5)`

---

## public class `org.assertj.core.error.ShouldNotBeBlank`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeBlank(java.lang.CharSequence p0)`

---

## public class `org.assertj.core.error.ShouldNotBeEmpty`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeEmpty()`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeEmpty(java.io.File p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeEmpty(java.nio.file.Path p0)`

---

## public class `org.assertj.core.error.ShouldNotBeEqual`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeEqual(java.lang.Object p0, java.lang.Object p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeEqual(java.lang.Object p0, java.lang.Object p1, org.assertj.core.internal.ComparisonStrategy p2)`

---

## public class `org.assertj.core.error.ShouldNotBeEqualComparingFieldByFieldRecursively`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeEqualComparingFieldByFieldRecursively(java.lang.Object p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeEqualComparingFieldByFieldRecursively(java.lang.Object p0, java.lang.Object p1, org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration p2, org.assertj.core.presentation.Representation p3)`

---

## public class `org.assertj.core.error.ShouldNotBeEqualIgnoringCase`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeEqualIgnoringCase(java.lang.CharSequence p0, java.lang.CharSequence p1)`

---

## public class `org.assertj.core.error.ShouldNotBeEqualIgnoringWhitespace`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeEqualIgnoringWhitespace(java.lang.CharSequence p0, java.lang.CharSequence p1)`

---

## public class `org.assertj.core.error.ShouldNotBeEqualNormalizingWhitespace`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeEqualNormalizingWhitespace(java.lang.CharSequence p0, java.lang.CharSequence p1)`

---

## public class `org.assertj.core.error.ShouldNotBeEqualWithinOffset`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <T extends java.lang.Number> org.assertj.core.error.ErrorMessageFactory shouldNotBeEqual(T p0, T p1, org.assertj.core.data.Offset p2, T p3)`

---

## public class `org.assertj.core.error.ShouldNotBeEqualWithinPercentage`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <T extends java.lang.Number> org.assertj.core.error.ErrorMessageFactory shouldNotBeEqualWithinPercentage(T p0, T p1, org.assertj.core.data.Percentage p2, T p3)`

---

## public class `org.assertj.core.error.ShouldNotBeExactlyInstanceOf`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeExactlyInstance(java.lang.Object p0, java.lang.Class p1)`

---

## public class `org.assertj.core.error.ShouldNotBeFinite`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeFinite(java.lang.Number p0)`

---

## public class `org.assertj.core.error.ShouldNotBeIn`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeIn(java.lang.Object p0, java.lang.Object p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeIn(java.lang.Object p0, java.lang.Object p1, org.assertj.core.internal.ComparisonStrategy p2)`

---

## public class `org.assertj.core.error.ShouldNotBeInfinite`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeInfinite(java.lang.Number p0)`

---

## public class `org.assertj.core.error.ShouldNotBeInstance`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeInstance(java.lang.Object p0, java.lang.Class p1)`

---

## public class `org.assertj.core.error.ShouldNotBeInstanceOfAny`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeInstanceOfAny(java.lang.Object p0, java.lang.Class[] p1)`

---

## public class `org.assertj.core.error.ShouldNotBeNull`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeNull()`
- `public static org.assertj.core.error.ShouldNotBeNull shouldNotBeNull(java.lang.String p0)`

---

## public class `org.assertj.core.error.ShouldNotBeOfClassIn`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeOfClassIn(java.lang.Object p0, java.lang.Object p1)`

---

## public class `org.assertj.core.error.ShouldNotBeSame`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeSame(java.lang.Object p0)`

---

## public class `org.assertj.core.error.ShouldNotContain`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory directoryShouldNotContain(java.io.File p0, java.util.List p1, java.lang.String p2)`
- `public static org.assertj.core.error.ErrorMessageFactory directoryShouldNotContain(java.nio.file.Path p0, java.util.List p1, java.lang.String p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotContain(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotContain(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, org.assertj.core.internal.ComparisonStrategy p3)`

---

## public class `org.assertj.core.error.ShouldNotContainAnyWhitespaces`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotContainAnyWhitespaces(java.lang.CharSequence p0)`

---

## public class `org.assertj.core.error.ShouldNotContainAtIndex`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotContainAtIndex(java.lang.Object p0, java.lang.Object p1, org.assertj.core.data.Index p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotContainAtIndex(java.lang.Object p0, java.lang.Object p1, org.assertj.core.data.Index p2, org.assertj.core.internal.ComparisonStrategy p3)`

---

## public class `org.assertj.core.error.ShouldNotContainCharSequence`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotContain(java.lang.CharSequence p0, java.lang.CharSequence p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotContain(java.lang.CharSequence p0, java.lang.CharSequence p1, org.assertj.core.internal.ComparisonStrategy p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotContain(java.lang.CharSequence p0, java.lang.CharSequence[] p1, java.util.Set p2, org.assertj.core.internal.ComparisonStrategy p3)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotContainIgnoringCase(java.lang.CharSequence p0, java.lang.CharSequence p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotContainIgnoringCase(java.lang.CharSequence p0, java.lang.CharSequence[] p1, java.util.Set p2)`

---

## public class `org.assertj.core.error.ShouldNotContainKey`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotContainKey(java.lang.Object p0, java.lang.Object p1)`

---

## public class `org.assertj.core.error.ShouldNotContainKeys`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <K extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldNotContainKeys(java.lang.Object p0, java.util.Set p1)`

---

## public class `org.assertj.core.error.ShouldNotContainNull`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotContainNull(java.lang.Object p0)`

---

## public class `org.assertj.core.error.ShouldNotContainOnlyWhitespaces`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotContainOnlyWhitespaces(java.lang.CharSequence p0)`

---

## public class `org.assertj.core.error.ShouldNotContainPattern`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotContainPattern(java.lang.CharSequence p0, java.lang.CharSequence p1)`

---

## public class `org.assertj.core.error.ShouldNotContainSequence`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotContainSequence(java.lang.Object p0, java.lang.Object p1, int p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotContainSequence(java.lang.Object p0, java.lang.Object p1, int p2, org.assertj.core.internal.ComparisonStrategy p3)`

---

## public class `org.assertj.core.error.ShouldNotContainSubsequence`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotContainSubsequence(java.lang.Object p0, java.lang.Object p1, int p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotContainSubsequence(java.lang.Object p0, java.lang.Object p1, org.assertj.core.internal.ComparisonStrategy p2, int p3)`

---

## public class `org.assertj.core.error.ShouldNotContainValue`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotContainValue(java.lang.Object p0, java.lang.Object p1)`

---

## public class `org.assertj.core.error.ShouldNotEndWith`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotEndWith(java.lang.Object p0, java.lang.Object p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotEndWith(java.lang.Object p0, java.lang.Object p1, org.assertj.core.internal.ComparisonStrategy p2)`

---

## public class `org.assertj.core.error.ShouldNotEndWithIgnoringCase`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotEndWithIgnoringCase(java.lang.CharSequence p0, java.lang.CharSequence p1, org.assertj.core.internal.ComparisonStrategy p2)`

---

## public class `org.assertj.core.error.ShouldNotExist`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Fields:**
- `public final static java.lang.String FILE_SHOULD_NOT_EXIST`
- `public final static java.lang.String PATH_SHOULD_NOT_EXIST`

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldExistNoFollowLinks(java.nio.file.Path p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotExist(java.io.File p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotExist(java.nio.file.Path p0)`

---

## public class `org.assertj.core.error.ShouldNotHave`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldNotHave(T p0, org.assertj.core.api.Condition p1)`

---

## public class `org.assertj.core.error.ShouldNotHaveAnyElementsOfTypes`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ShouldNotHaveAnyElementsOfTypes shouldNotHaveAnyElementsOfTypes(java.lang.Object p0, java.lang.Class[] p1, java.util.Map p2)`

---

## public class `org.assertj.core.error.ShouldNotHaveDuplicates`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotHaveDuplicates(java.lang.Object p0, java.lang.Object p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotHaveDuplicates(java.lang.Object p0, java.lang.Object p1, org.assertj.core.internal.ComparisonStrategy p2)`

---

## public class `org.assertj.core.error.ShouldNotHaveSameClass`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotHaveSameClass(java.lang.Object p0, java.lang.Object p1)`

---

## public class `org.assertj.core.error.ShouldNotHaveSameHashCode`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotHaveSameHashCode(java.lang.Object p0, java.lang.Object p1)`

---

## public class `org.assertj.core.error.ShouldNotHaveThrown`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotHaveThrown(java.lang.Throwable p0)`

---

## public class `org.assertj.core.error.ShouldNotHaveToString`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotHaveToString(java.lang.String p0)`

---

## public class `org.assertj.core.error.ShouldNotMatch`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Fields:**
- `public final static java.lang.String ADVICE`

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldNotMatch(T p0, java.util.function.Predicate p1, org.assertj.core.presentation.PredicateDescription p2)`

---

## public class `org.assertj.core.error.ShouldNotMatchPattern`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotMatch(java.lang.CharSequence p0, java.lang.CharSequence p1)`

---

## public class `org.assertj.core.error.ShouldNotStartWith`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotStartWith(java.lang.Object p0, java.lang.Object p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotStartWith(java.lang.Object p0, java.lang.Object p1, org.assertj.core.internal.ComparisonStrategy p2)`

---

## public class `org.assertj.core.error.ShouldNotStartWithIgnoringCase`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotStartWithIgnoringCase(java.lang.CharSequence p0, java.lang.CharSequence p1, org.assertj.core.internal.ComparisonStrategy p2)`

---

## public class `org.assertj.core.error.ShouldOnlyHaveElementsOfTypes`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ShouldOnlyHaveElementsOfTypes shouldOnlyHaveElementsOfTypes(java.lang.Object p0, java.lang.Class[] p1, java.lang.Iterable p2)`

---

## public class `org.assertj.core.error.ShouldOnlyHaveFields`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldOnlyHaveDeclaredFields(java.lang.Class p0, java.util.Collection p1, java.util.Collection p2, java.util.Collection p3)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldOnlyHaveFields(java.lang.Class p0, java.util.Collection p1, java.util.Collection p2, java.util.Collection p3)`

---

## public class `org.assertj.core.error.ShouldSatisfy`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Fields:**
- `public final static java.lang.String CONDITION_SHOULD_BE_SATISFIED`
- `public final static java.lang.String CONSUMERS_SHOULD_BE_SATISFIED_IN_ANY_ORDER`
- `public final static java.lang.String CONSUMERS_SHOULD_NOT_BE_NULL`

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldSatisfy(T p0, org.assertj.core.api.Condition p1)`
- `public static <E extends java.lang.Object> org.assertj.core.error.ErrorMessageFactory shouldSatisfyExactlyInAnyOrder(java.lang.Iterable p0)`

---

## public class `org.assertj.core.error.ShouldStartWith`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldStartWith(java.lang.Object p0, java.lang.Object p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldStartWith(java.lang.Object p0, java.lang.Object p1, org.assertj.core.internal.ComparisonStrategy p2)`

---

## public class `org.assertj.core.error.ShouldStartWithIgnoringCase`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldStartWithIgnoringCase(java.lang.CharSequence p0, java.lang.CharSequence p1, org.assertj.core.internal.ComparisonStrategy p2)`

---

## public class `org.assertj.core.error.ShouldStartWithPath`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Fields:**
- `public final static java.lang.String PATH_SHOULD_START_WITH`

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldStartWith(java.nio.file.Path p0, java.nio.file.Path p1)`

---

## public class `org.assertj.core.error.SubarraysShouldHaveSameSize`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory subarraysShouldHaveSameSize(java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, int p3, java.lang.Object p4, int p5, int p6)`

---

## public class `org.assertj.core.error.UnsatisfiedRequirement`

**Constructors:**
- `public UnsatisfiedRequirement(java.lang.Object p0, java.lang.String p1)`

**Methods:**
- `public java.lang.String describe(int p0, org.assertj.core.api.AssertionInfo p1)`
- `public java.lang.String describe(org.assertj.core.api.AssertionInfo p0)`
- `public java.lang.String toString()`

---

## public class `org.assertj.core.error.ZippedElementsShouldSatisfy`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory zippedElementsShouldSatisfy(org.assertj.core.api.AssertionInfo p0, java.lang.Iterable p1, java.lang.Iterable p2, java.util.List p3)`

---

## public static class `org.assertj.core.error.ZippedElementsShouldSatisfy$ZipSatisfyError`

**Constructors:**
- `public ZipSatisfyError(java.lang.Object p0, java.lang.Object p1, java.lang.String p2)`

**Fields:**
- `public final java.lang.Object actualElement`
- `public final java.lang.String error`
- `public final java.lang.Object otherElement`

**Methods:**
- `public static java.lang.String describe(org.assertj.core.api.AssertionInfo p0, org.assertj.core.error.ZippedElementsShouldSatisfy$ZipSatisfyError p1)`
- `public java.lang.String toString()`

---

## public class `org.assertj.core.error.future.ShouldBeCancelled`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeCancelled(java.util.concurrent.Future p0)`

---

## public class `org.assertj.core.error.future.ShouldBeCompleted`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeCompleted(java.util.concurrent.CompletableFuture p0)`

---

## public class `org.assertj.core.error.future.ShouldBeCompletedExceptionally`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveCompletedExceptionally(java.util.concurrent.CompletableFuture p0)`

---

## public class `org.assertj.core.error.future.ShouldBeCompletedWithin`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeCompletedWithin(java.util.concurrent.Future p0, java.time.Duration p1, java.lang.Exception p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeCompletedWithin(java.util.concurrent.Future p0, long p1, java.util.concurrent.TimeUnit p2, java.lang.Exception p3)`

---

## public class `org.assertj.core.error.future.ShouldBeDone`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeDone(java.util.concurrent.Future p0)`

---

## public class `org.assertj.core.error.future.ShouldHaveFailed`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveFailed(java.util.concurrent.CompletableFuture p0)`

---

## public class `org.assertj.core.error.future.ShouldHaveFailedWithin`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveFailedWithin(java.util.concurrent.Future p0, java.time.Duration p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveFailedWithin(java.util.concurrent.Future p0, long p1, java.util.concurrent.TimeUnit p2)`

---

## public class `org.assertj.core.error.future.ShouldNotBeCancelled`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeCancelled(java.util.concurrent.Future p0)`

---

## public class `org.assertj.core.error.future.ShouldNotBeCompleted`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeCompleted(java.util.concurrent.CompletableFuture p0)`

---

## public class `org.assertj.core.error.future.ShouldNotBeCompletedExceptionally`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotHaveCompletedExceptionally(java.util.concurrent.CompletableFuture p0)`

---

## public class `org.assertj.core.error.future.ShouldNotBeDone`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotBeDone(java.util.concurrent.Future p0)`

---

## public class `org.assertj.core.error.future.ShouldNotHaveFailed`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldNotHaveFailed(java.util.concurrent.CompletableFuture p0)`

---

## public class `org.assertj.core.error.future.Warning`

**Constructors:**
- `public Warning()`

**Fields:**
- `public final static java.lang.String WARNING`

---

## public class `org.assertj.core.error.uri.ShouldBeEqualToWithSortedQueryParameters`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldBeEqualToWithSortedQueryParameters(java.net.URL p0, java.net.URL p1)`

---

## public class `org.assertj.core.error.uri.ShouldHaveAnchor`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveAnchor(java.net.URL p0, java.lang.String p1)`

---

## public class `org.assertj.core.error.uri.ShouldHaveAuthority`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveAuthority(java.net.URI p0, java.lang.String p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveAuthority(java.net.URL p0, java.lang.String p1)`

---

## public class `org.assertj.core.error.uri.ShouldHaveFragment`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveFragment(java.net.URI p0, java.lang.String p1)`

---

## public class `org.assertj.core.error.uri.ShouldHaveHost`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveHost(java.net.URI p0, java.lang.String p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveHost(java.net.URL p0, java.lang.String p1)`

---

## public class `org.assertj.core.error.uri.ShouldHaveNoHost`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveNoHost(java.net.URI p0)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveNoHost(java.net.URL p0)`

---

## public class `org.assertj.core.error.uri.ShouldHaveParameter`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveNoParameter(java.lang.Object p0, java.lang.String p1, java.lang.String p2, java.util.List p3)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveNoParameter(java.lang.Object p0, java.lang.String p1, java.util.List p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveNoParameters(java.lang.Object p0, java.util.Set p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveParameter(java.lang.Object p0, java.lang.String p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveParameter(java.lang.Object p0, java.lang.String p1, java.lang.String p2)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveParameter(java.lang.Object p0, java.lang.String p1, java.lang.String p2, java.util.List p3)`

---

## public class `org.assertj.core.error.uri.ShouldHavePath`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHavePath(java.net.URI p0, java.lang.String p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHavePath(java.net.URL p0, java.lang.String p1)`

---

## public class `org.assertj.core.error.uri.ShouldHavePort`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHavePort(java.net.URI p0, int p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHavePort(java.net.URL p0, int p1)`

---

## public class `org.assertj.core.error.uri.ShouldHaveProtocol`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveProtocol(java.net.URL p0, java.lang.String p1)`

---

## public class `org.assertj.core.error.uri.ShouldHaveQuery`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveQuery(java.net.URI p0, java.lang.String p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveQuery(java.net.URL p0, java.lang.String p1)`

---

## public class `org.assertj.core.error.uri.ShouldHaveScheme`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveScheme(java.net.URI p0, java.lang.String p1)`

---

## public class `org.assertj.core.error.uri.ShouldHaveUserInfo`
extends `org.assertj.core.error.BasicErrorMessageFactory`  

**Methods:**
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveUserInfo(java.net.URI p0, java.lang.String p1)`
- `public static org.assertj.core.error.ErrorMessageFactory shouldHaveUserInfo(java.net.URL p0, java.lang.String p1)`

---

## public class `org.assertj.core.extractor.Extractors`

**Constructors:**
- `public Extractors()`

**Methods:**
- `public static java.util.function.Function byName(java.lang.String p0)`
- `public static java.util.function.Function byName(java.lang.String... p0)`
- `public static java.lang.String extractedDescriptionOf(java.lang.Object... p0)`
- `public static java.lang.String extractedDescriptionOf(java.lang.String... p0)`
- `public static java.lang.String extractedDescriptionOfMethod(java.lang.String p0)`
- `public static java.util.function.Function resultOf(java.lang.String p0)`
- `public static java.util.function.Function toStringMethod()`

---

## public class `org.assertj.core.groups.FieldsOrPropertiesExtractor`

**Constructors:**
- `public FieldsOrPropertiesExtractor()`

**Methods:**
- `public static <F extends java.lang.Object, T extends java.lang.Object> T[] extract(F[] p0, java.util.function.Function p1)`
- `public static <F extends java.lang.Object, T extends java.lang.Object> java.util.List extract(java.lang.Iterable p0, java.util.function.Function p1)`

---

## public class `org.assertj.core.groups.Properties`<T extends java.lang.Object>

**Methods:**
- `public static org.assertj.core.groups.Properties extractProperty(java.lang.String p0)`
- `public static <T extends java.lang.Object> org.assertj.core.groups.Properties extractProperty(java.lang.String p0, java.lang.Class p1)`
- `public java.util.List from(java.lang.Iterable p0)`
- `public java.util.List from(java.lang.Object[] p0)`
- `public <U extends java.lang.Object> org.assertj.core.groups.Properties ofType(java.lang.Class p0)`

---

## public final class `org.assertj.core.groups.Tuple`

**Constructors:**
- `public Tuple(java.lang.Object... p0)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public java.lang.Object[] toArray()`
- `public java.util.List toList()`
- `public java.lang.String toString()`
- `public static org.assertj.core.groups.Tuple tuple(java.lang.Object... p0)`

---

## public abstract class `org.assertj.core.matcher.AssertionMatcher`<T extends java.lang.Object>
extends `org.hamcrest.BaseMatcher`  

**Constructors:**
- `public AssertionMatcher()`

**Methods:**
- `public abstract void assertion(T p0) throws java.lang.AssertionError`
- `public void describeTo(org.hamcrest.Description p0)`
- `public boolean matches(java.lang.Object p0)`

---

## public class `org.assertj.core.presentation.BinaryRepresentation`
extends `org.assertj.core.presentation.StandardRepresentation`  

**Constructors:**
- `public BinaryRepresentation()`

**Fields:**
- `public final static org.assertj.core.presentation.BinaryRepresentation BINARY_REPRESENTATION`
- `public final static java.lang.String BYTE_PREFIX`

**Methods:**
- `protected java.lang.String toStringOf(java.lang.Byte p0)`
- `protected java.lang.String toStringOf(java.lang.Character p0)`
- `protected java.lang.String toStringOf(java.lang.Double p0)`
- `protected java.lang.String toStringOf(java.lang.Float p0)`
- `protected java.lang.String toStringOf(java.lang.Integer p0)`
- `protected java.lang.String toStringOf(java.lang.Long p0)`
- `protected java.lang.String toStringOf(java.lang.Number p0)`
- `public java.lang.String toStringOf(java.lang.Object p0)`
- `protected java.lang.String toStringOf(java.lang.Short p0)`
- `protected java.lang.String toStringOf(org.assertj.core.presentation.Representation p0, java.lang.String p1)`

---

## public class `org.assertj.core.presentation.CompositeRepresentation`
implements `org.assertj.core.presentation.Representation`  

**Constructors:**
- `public CompositeRepresentation(java.util.List p0)`

**Methods:**
- `public java.util.List getAllRepresentationsOrderedByPriority()`
- `public java.lang.String toString()`
- `public java.lang.String toStringOf(java.lang.Object p0)`
- `public java.lang.String unambiguousToStringOf(java.lang.Object p0)`

---

## public class `org.assertj.core.presentation.HexadecimalRepresentation`
extends `org.assertj.core.presentation.StandardRepresentation`  

**Constructors:**
- `public HexadecimalRepresentation()`

**Fields:**
- `public final static org.assertj.core.presentation.HexadecimalRepresentation HEXA_REPRESENTATION`
- `public final static int NIBBLE_SIZE`
- `public final static java.lang.String PREFIX`

**Methods:**
- `protected java.lang.String toStringOf(java.lang.Byte p0)`
- `protected java.lang.String toStringOf(java.lang.Character p0)`
- `protected java.lang.String toStringOf(java.lang.Double p0)`
- `protected java.lang.String toStringOf(java.lang.Float p0)`
- `protected java.lang.String toStringOf(java.lang.Integer p0)`
- `protected java.lang.String toStringOf(java.lang.Long p0)`
- `protected java.lang.String toStringOf(java.lang.Number p0)`
- `public java.lang.String toStringOf(java.lang.Object p0)`
- `protected java.lang.String toStringOf(java.lang.Short p0)`
- `protected java.lang.String toStringOf(org.assertj.core.presentation.Representation p0, java.lang.String p1)`

---

## public class `org.assertj.core.presentation.PredicateDescription`

**Constructors:**
- `public PredicateDescription(java.lang.String p0)`

**Fields:**
- `public final static org.assertj.core.presentation.PredicateDescription GIVEN`
- `public final java.lang.String description`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public boolean isDefault()`

---

## public abstract interface `org.assertj.core.presentation.Representation`

**Fields:**
- `public final static int DEFAULT_PRIORITY`

**Methods:**
- `public default int getPriority()`
- `public abstract java.lang.String toStringOf(java.lang.Object p0)`
- `public default java.lang.String unambiguousToStringOf(java.lang.Object p0)`

---

## public class `org.assertj.core.presentation.StandardRepresentation`
implements `org.assertj.core.presentation.Representation`  

**Constructors:**
- `public StandardRepresentation()`

**Fields:**
- `public final static java.lang.String ELEMENT_SEPARATOR`
- `public final static java.lang.String ELEMENT_SEPARATOR_WITH_NEWLINE`
- `public final static org.assertj.core.presentation.StandardRepresentation STANDARD_REPRESENTATION`

**Methods:**
- `protected java.lang.String classNameDisambiguation(java.lang.Object p0)`
- `protected <T extends java.lang.Object> java.lang.String customFormat(T p0)`
- `protected java.lang.String fallbackToStringOf(java.lang.Object p0)`
- `protected java.lang.String format(java.lang.Iterable p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.Object p5)`
- `protected java.lang.String format(java.lang.Object[] p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.Object p5)`
- `protected java.lang.String formatArray(java.lang.Object p0)`
- `protected java.lang.String formatPrimitiveArray(java.lang.Object p0)`
- `public static int getMaxElementsForPrinting()`
- `public static int getMaxLengthForSingleLineDescription()`
- `public static int getMaxStackTraceElementsDisplayed()`
- `protected boolean hasAlreadyAnUnambiguousToStringOf(java.lang.Object p0)`
- `protected boolean hasCustomFormatterFor(java.lang.Object p0)`
- `protected java.lang.String multiLineFormat(java.lang.Iterable p0)`
- `protected java.lang.String multiLineFormat(java.lang.Object[] p0, java.lang.Object p1)`
- `public static <T extends java.lang.Object> void registerFormatterForType(java.lang.Class p0, java.util.function.Function p1)`
- `public static void removeAllRegisteredFormatters()`
- `public static void resetDefaults()`
- `protected java.lang.String safeStringOf(java.lang.Object p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.Object p5)`
- `public static void setMaxElementsForPrinting(int p0)`
- `public static void setMaxLengthForSingleLineDescription(int p0)`
- `public static void setMaxStackTraceElementsDisplayed(int p0)`
- `protected java.lang.String singleLineFormat(java.lang.Iterable p0, java.lang.String p1, java.lang.String p2)`
- `protected java.lang.String singleLineFormat(java.lang.Object[] p0, java.lang.Object p1)`
- `protected java.lang.String smartFormat(java.lang.Iterable p0)`
- `protected java.lang.String smartFormat(java.lang.Object[] p0)`
- `public java.lang.String toString()`
- `protected java.lang.String toStringOf(java.io.File p0)`
- `protected java.lang.String toStringOf(java.lang.Character p0)`
- `protected java.lang.String toStringOf(java.lang.Class p0)`
- `protected java.lang.String toStringOf(java.lang.Float p0)`
- `protected java.lang.String toStringOf(java.lang.Long p0)`
- `protected java.lang.String toStringOf(java.lang.Number p0)`
- `public java.lang.String toStringOf(java.lang.Object p0)`
- `protected java.lang.String toStringOf(java.lang.String p0)`
- `protected java.lang.String toStringOf(java.lang.Throwable p0)`
- `protected java.lang.String toStringOf(java.text.SimpleDateFormat p0)`
- `protected java.lang.String toStringOf(java.time.LocalDate p0)`
- `protected java.lang.String toStringOf(java.time.LocalDateTime p0)`
- `protected java.lang.String toStringOf(java.time.OffsetDateTime p0)`
- `protected java.lang.String toStringOf(java.time.ZonedDateTime p0)`
- `protected java.lang.String toStringOf(java.util.Calendar p0)`
- `protected java.lang.String toStringOf(java.util.Comparator p0)`
- `protected java.lang.String toStringOf(java.util.Date p0)`
- `protected java.lang.String toStringOf(java.util.Map$Entry p0)`
- `protected java.lang.String toStringOf(java.util.Map p0)`
- `protected java.lang.String toStringOf(java.util.concurrent.Future p0)`
- `protected java.lang.String toStringOf(java.util.concurrent.atomic.AtomicBoolean p0)`
- `protected java.lang.String toStringOf(java.util.concurrent.atomic.AtomicInteger p0)`
- `protected java.lang.String toStringOf(java.util.concurrent.atomic.AtomicLong p0)`
- `protected java.lang.String toStringOf(java.util.concurrent.atomic.AtomicMarkableReference p0)`
- `protected java.lang.String toStringOf(java.util.concurrent.atomic.AtomicReference p0)`
- `protected java.lang.String toStringOf(java.util.concurrent.atomic.AtomicStampedReference p0)`
- `protected java.lang.String toStringOf(java.util.concurrent.atomic.LongAdder p0)`
- `protected java.lang.String toStringOf(org.assertj.core.data.MapEntry p0)`
- `protected java.lang.String toStringOf(org.assertj.core.groups.Tuple p0)`
- `protected java.lang.String toStringOf(org.assertj.core.internal.ComparatorBasedComparisonStrategy p0)`
- `protected java.lang.String toStringOf(org.assertj.core.presentation.PredicateDescription p0)`
- `public java.lang.String unambiguousToStringOf(java.lang.Object p0)`

---

## protected final static enum `org.assertj.core.presentation.StandardRepresentation$GroupType`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.assertj.core.presentation.StandardRepresentation$GroupType ARRAY`
- `public final static org.assertj.core.presentation.StandardRepresentation$GroupType ITERABLE`

**Methods:**
- `public java.lang.String description()`

---

## public class `org.assertj.core.presentation.UnicodeRepresentation`
extends `org.assertj.core.presentation.StandardRepresentation`  

**Constructors:**
- `public UnicodeRepresentation()`

**Fields:**
- `public final static org.assertj.core.presentation.UnicodeRepresentation UNICODE_REPRESENTATION`

**Methods:**
- `protected java.lang.String toStringOf(java.lang.Character p0)`
- `public java.lang.String toStringOf(java.lang.Object p0)`
- `protected java.lang.String toStringOf(java.lang.String p0)`

---

## public abstract class `org.assertj.core.util.AbstractComparableNumberComparator`<T extends java.lang.Number & java.lang.Comparable<T>>
extends `org.assertj.core.util.NullSafeComparator`  

**Constructors:**
- `public AbstractComparableNumberComparator()`

**Methods:**
- `public int compareNonNull(T p0, T p1)`

---

## public class `org.assertj.core.util.ArrayWrapperList`
extends `java.util.AbstractList`  

**Methods:**
- `public java.lang.Object get(int p0)`
- `public java.lang.Class getComponentType()`
- `public int size()`
- `public static org.assertj.core.util.ArrayWrapperList wrap(java.lang.Object p0)`

---

## public class `org.assertj.core.util.Arrays`

**Methods:**
- `public static <T extends java.lang.Object> T[] array(T... p0)`
- `public static int[] array(java.util.concurrent.atomic.AtomicIntegerArray p0)`
- `public static long[] array(java.util.concurrent.atomic.AtomicLongArray p0)`
- `public static <T extends java.lang.Object> T[] array(java.util.concurrent.atomic.AtomicReferenceArray p0)`
- `public static java.util.List asList(java.lang.Object p0)`
- `public static java.lang.Object[] asObjectArray(java.lang.Object p0)`
- `public static <T extends java.lang.Object> boolean hasOnlyNullElements(T[] p0)`
- `public static boolean isArray(java.lang.Object p0)`
- `public static boolean isArrayTypePrimitive(java.lang.Object p0)`
- `public static <T extends java.lang.Object> boolean isNullOrEmpty(T[] p0)`
- `public static boolean isObjectArray(java.lang.Object p0)`
- `public static <T extends java.lang.Object> java.util.List nonNullElementsIn(T[] p0)`
- `public static java.lang.IllegalArgumentException notAnArrayOfPrimitives(java.lang.Object p0)`
- `public static <T extends java.lang.Object> T[] prepend(T p0, T... p1)`
- `public static int sizeOf(java.lang.Object p0)`

---

## public class `org.assertj.core.util.BigDecimalComparator`
extends `org.assertj.core.util.AbstractComparableNumberComparator`  

**Constructors:**
- `public BigDecimalComparator()`

**Fields:**
- `public final static org.assertj.core.util.BigDecimalComparator BIG_DECIMAL_COMPARATOR`

**Methods:**
- `public java.lang.String toString()`

---

## public class `org.assertj.core.util.BigIntegerComparator`
extends `org.assertj.core.util.AbstractComparableNumberComparator`  

**Constructors:**
- `public BigIntegerComparator()`

**Fields:**
- `public final static org.assertj.core.util.BigIntegerComparator BIG_INTEGER_COMPARATOR`

---

## public abstract interface `org.assertj.core.util.CanIgnoreReturnValue`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `org.assertj.core.util.CheckReturnValue`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public class `org.assertj.core.util.ClassNameComparator`
implements `java.util.Comparator<java.lang.Class<? extends java.lang.Object>>`  

**Constructors:**
- `public ClassNameComparator()`

**Fields:**
- `public final static org.assertj.core.util.ClassNameComparator INSTANCE`

**Methods:**
- `public int compare(java.lang.Class p0, java.lang.Class p1)`

---

## public final class `org.assertj.core.util.Closeables`

**Methods:**
- `public static void closeQuietly(java.io.Closeable... p0)`

---

## public class `org.assertj.core.util.DateUtil`

**Constructors:**
- `public DateUtil()`

**Methods:**
- `public static int dayOfMonthOf(java.util.Date p0)`
- `public static int dayOfWeekOf(java.util.Date p0)`
- `public static java.lang.String formatAsDatetime(java.util.Calendar p0)`
- `public static synchronized java.lang.String formatAsDatetime(java.util.Date p0)`
- `public static synchronized java.lang.String formatAsDatetimeWithMs(java.util.Date p0)`
- `public static java.lang.String formatTimeDifference(java.util.Date p0, java.util.Date p1)`
- `public static int hourOfDayOf(java.util.Date p0)`
- `public static int millisecondOf(java.util.Date p0)`
- `public static int minuteOf(java.util.Date p0)`
- `public static int monthOf(java.util.Date p0)`
- `public static java.text.DateFormat newIsoDateFormat()`
- `public static java.text.DateFormat newIsoDateTimeFormat()`
- `public static java.text.DateFormat newIsoDateTimeWithIsoTimeZoneFormat()`
- `public static java.text.DateFormat newIsoDateTimeWithMsAndIsoTimeZoneFormat()`
- `public static java.text.DateFormat newIsoDateTimeWithMsFormat()`
- `public static java.text.DateFormat newTimestampDateFormat()`
- `public static java.util.Date now()`
- `public static synchronized java.util.Date parse(java.lang.String p0)`
- `public static synchronized java.util.Date parseDatetime(java.lang.String p0)`
- `public static synchronized java.util.Date parseDatetimeWithMs(java.lang.String p0)`
- `public static int secondOf(java.util.Date p0)`
- `public static long timeDifference(java.util.Date p0, java.util.Date p1)`
- `public static java.util.Calendar toCalendar(java.util.Date p0)`
- `public static java.util.Date tomorrow()`
- `public static java.util.Date truncateTime(java.util.Date p0)`
- `public static int yearOf(java.util.Date p0)`
- `public static java.util.Date yesterday()`

---

## public class `org.assertj.core.util.DoubleComparator`
extends `org.assertj.core.util.NullSafeComparator`  

**Constructors:**
- `public DoubleComparator(double p0)`

**Methods:**
- `protected int compareNonNull(java.lang.Double p0, java.lang.Double p1)`
- `public boolean equals(java.lang.Object p0)`
- `public double getEpsilon()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public final class `org.assertj.core.util.FailureMessages`

**Methods:**
- `public static java.lang.String actualIsEmpty()`
- `public static java.lang.String actualIsNull()`

---

## public class `org.assertj.core.util.Files`

**Methods:**
- `public static java.lang.String contentOf(java.io.File p0, java.lang.String p1)`
- `public static java.lang.String contentOf(java.io.File p0, java.nio.charset.Charset p1)`
- `public static java.io.File currentFolder()`
- `public static void delete(java.io.File p0)`
- `public static java.util.List fileNamesIn(java.lang.String p0, boolean p1)`
- `public static java.util.Optional getFileNameExtension(java.lang.String p0)`
- `public static java.util.List linesOf(java.io.File p0, java.lang.String p1)`
- `public static java.util.List linesOf(java.io.File p0, java.nio.charset.Charset p1)`
- `public static java.io.File newFile(java.lang.String p0)`
- `public static java.io.File newFolder(java.lang.String p0)`
- `public static java.io.File newTemporaryFile()`
- `public static java.io.File newTemporaryFolder()`
- `public static java.io.File temporaryFolder()`
- `public static java.lang.String temporaryFolderPath()`

---

## public class `org.assertj.core.util.FloatComparator`
extends `org.assertj.core.util.NullSafeComparator`  

**Constructors:**
- `public FloatComparator(float p0)`

**Methods:**
- `public int compareNonNull(java.lang.Float p0, java.lang.Float p1)`
- `public boolean equals(java.lang.Object p0)`
- `public float getEpsilon()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `org.assertj.core.util.Hexadecimals`

**Methods:**
- `public static java.lang.String byteToHexString(byte p0)`
- `public static java.lang.String toHexString(byte... p0)`

---

## public final class `org.assertj.core.util.IterableUtil`

**Methods:**
- `public static boolean isNullOrEmpty(java.lang.Iterable p0)`
- `public static <T extends java.lang.Object> java.lang.Iterable iterable(T... p0)`
- `public static <T extends java.lang.Object> java.util.Iterator iterator(T... p0)`
- `public static <T extends java.lang.Object> java.util.List nonNullElementsIn(java.lang.Iterable p0)`
- `public static int sizeOf(java.lang.Iterable p0)`
- `public static <T extends java.lang.Object> T[] toArray(java.lang.Iterable p0)`
- `public static <T extends java.lang.Object> T[] toArray(java.lang.Iterable p0, java.lang.Class p1)`
- `public static <T extends java.lang.Object> java.util.Collection toCollection(java.lang.Iterable p0)`

---

## public final class `org.assertj.core.util.Lists`

**Methods:**
- `public static <T extends java.lang.Object> java.util.List emptyList()`
- `public static <T extends java.lang.Object> java.util.List list(T... p0)`
- `public static <T extends java.lang.Object> java.util.ArrayList newArrayList()`
- `public static <T extends java.lang.Object> java.util.ArrayList newArrayList(T... p0)`
- `public static <T extends java.lang.Object> java.util.ArrayList newArrayList(java.lang.Iterable p0)`
- `public static <T extends java.lang.Object> java.util.ArrayList newArrayList(java.util.Iterator p0)`

---

## public class `org.assertj.core.util.Maps`

**Methods:**
- `public static java.lang.String format(java.util.Map p0)`
- `public static java.lang.String format(org.assertj.core.presentation.Representation p0, java.util.Map p1)`
- `public static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map newHashMap(K p0, V p1)`

---

## public class `org.assertj.core.util.NaturalOrderComparator`<T extends java.lang.Comparable<? super T>>
extends `org.assertj.core.util.NullSafeComparator`  

**Constructors:**
- `public NaturalOrderComparator(java.lang.Class p0)`
- `public NaturalOrderComparator(java.lang.String p0)`

**Methods:**
- `protected int compareNonNull(T p0, T p1)`
- `public java.lang.String toString()`

---

## public final class `org.assertj.core.util.Objects`

**Fields:**
- `public final static int HASH_CODE_PRIME`

**Methods:**
- `public static boolean areEqual(java.lang.Object p0, java.lang.Object p1)`
- `public static boolean areEqualArrays(java.lang.Object p0, java.lang.Object p1)`
- `public static <T extends java.lang.Object> T castIfBelongsToType(java.lang.Object p0, java.lang.Class p1)`
- `public static int hashCodeFor(java.lang.Object p0)`
- `public static java.lang.String[] namesOf(java.lang.Class... p0)`

---

## public class `org.assertj.core.util.PathNaturalOrderComparator`
extends `org.assertj.core.util.NaturalOrderComparator`  

**Fields:**
- `public final static org.assertj.core.util.PathNaturalOrderComparator INSTANCE`

---

## public class `org.assertj.core.util.Paths`

**Methods:**
- `public static java.util.List linesOf(java.nio.file.Path p0, java.lang.String p1)`
- `public static java.util.List linesOf(java.nio.file.Path p0, java.nio.charset.Charset p1)`

---

## public final class `org.assertj.core.util.Preconditions`

**Fields:**
- `public final static java.lang.String ARGUMENT_EMPTY`

**Methods:**
- `public static void checkArgument(boolean p0, java.lang.String p1, java.lang.Object... p2)`
- `public static <T extends java.lang.Object> T checkNotNull(T p0)`
- `public static <T extends java.lang.Object> T checkNotNull(T p0, java.lang.String p1)`
- `public static <T extends java.lang.Object> void checkNotNull(org.assertj.core.api.filter.FilterOperator p0)`
- `public static <T extends java.lang.Object> T[] checkNotNullOrEmpty(T[] p0)`
- `public static java.lang.CharSequence checkNotNullOrEmpty(java.lang.CharSequence p0)`
- `public static java.lang.CharSequence checkNotNullOrEmpty(java.lang.CharSequence p0, java.lang.String p1)`
- `public static void checkState(boolean p0, java.lang.String p1, java.lang.Object... p2)`

---

## public final class `org.assertj.core.util.Sets`

**Methods:**
- `public static <T extends java.lang.Object> java.util.HashSet newHashSet()`
- `public static <T extends java.lang.Object> java.util.HashSet newHashSet(java.lang.Iterable p0)`
- `public static <T extends java.lang.Object> java.util.LinkedHashSet newLinkedHashSet()`
- `public static <T extends java.lang.Object> java.util.LinkedHashSet newLinkedHashSet(T... p0)`
- `public static <T extends java.lang.Object> java.util.TreeSet newTreeSet()`
- `public static <T extends java.lang.Object> java.util.TreeSet newTreeSet(T... p0)`
- `public static <T extends java.lang.Object> java.util.Set set(T... p0)`

---

## public class `org.assertj.core.util.Streams`

**Constructors:**
- `public Streams()`

**Methods:**
- `public static <T extends java.lang.Object> java.util.stream.Stream stream(java.lang.Iterable p0)`
- `public static <T extends java.lang.Object> java.util.stream.Stream stream(java.util.Iterator p0)`

---

## public final class `org.assertj.core.util.Strings`

**Methods:**
- `public static org.assertj.core.util.Strings$StringToAppend append(java.lang.String p0)`
- `public static java.lang.String concat(java.lang.Object... p0)`
- `public static java.lang.String escapePercent(java.lang.String p0)`
- `public static java.lang.String formatIfArgs(java.lang.String p0, java.lang.Object... p1)`
- `public static boolean isNullOrEmpty(java.lang.String p0)`
- `public static org.assertj.core.util.Strings$StringsToJoin join(java.lang.Iterable p0)`
- `public static org.assertj.core.util.Strings$StringsToJoin join(java.lang.String... p0)`
- `public static java.lang.Object quote(java.lang.Object p0)`
- `public static java.lang.String quote(java.lang.String p0)`

---

## public static class `org.assertj.core.util.Strings$StringToAppend`

**Methods:**
- `public java.lang.String to(java.lang.String p0)`

---

## public static class `org.assertj.core.util.Strings$StringsToJoin`

**Methods:**
- `public java.lang.String with(java.lang.String p0)`
- `public java.lang.String with(java.lang.String p0, java.lang.String p1)`

---

## public class `org.assertj.core.util.TextFileWriter`

**Methods:**
- `public static org.assertj.core.util.TextFileWriter instance()`
- `public void write(java.io.File p0, java.lang.String... p1) throws java.io.IOException`
- `public void write(java.io.File p0, java.nio.charset.Charset p1, java.lang.String... p2) throws java.io.IOException`

---

## public final class `org.assertj.core.util.Throwables`

**Methods:**
- `public static <T extends java.lang.Throwable> java.util.List addLineNumberToErrorMessages(java.util.List p0)`
- `public static void appendStackTraceInCurrentThreadToThrowable(java.lang.Throwable p0, java.lang.String p1)`
- `public static java.util.List describeErrors(java.util.List p0)`
- `public static java.lang.StackTraceElement getFirstStackTraceElementFromTest(java.lang.StackTraceElement[] p0)`
- `public static java.lang.Throwable getRootCause(java.lang.Throwable p0)`
- `public static java.lang.String getStackTrace(java.lang.Throwable p0)`
- `public static void removeAssertJRelatedElementsFromStackTrace(java.lang.Throwable p0)`

---

## public abstract interface `org.assertj.core.util.TriFunction`<A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object, R extends java.lang.Object>
annotations: @java.lang.FunctionalInterface  

**Methods:**
- `public abstract R apply(A p0, B p1, C p2)`

---

## public class `org.assertj.core.util.URLs`

**Methods:**
- `public static java.lang.String contentOf(java.net.URL p0, java.lang.String p1)`
- `public static java.lang.String contentOf(java.net.URL p0, java.nio.charset.Charset p1)`
- `public static java.util.List linesOf(java.net.URL p0, java.lang.String p1)`
- `public static java.util.List linesOf(java.net.URL p0, java.nio.charset.Charset p1)`

---

## public abstract interface `org.assertj.core.util.VisibleForTesting`

---

## public class `org.assertj.core.util.diff.ChangeDelta`<T extends java.lang.Object>
extends `org.assertj.core.util.diff.Delta`  

**Constructors:**
- `public ChangeDelta(org.assertj.core.util.diff.Chunk p0, org.assertj.core.util.diff.Chunk p1)`

**Methods:**
- `public void applyTo(java.util.List p0) throws java.lang.IllegalStateException`
- `public org.assertj.core.util.diff.Delta$TYPE getType()`
- `public void verify(java.util.List p0) throws java.lang.IllegalStateException`

---

## public class `org.assertj.core.util.diff.Chunk`<T extends java.lang.Object>

**Constructors:**
- `public Chunk(int p0, java.util.List p1)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.util.List getLines()`
- `public int getPosition()`
- `public int hashCode()`
- `public int last()`
- `public int size()`
- `public java.lang.String toString()`
- `public void verify(java.util.List p0) throws java.lang.IllegalStateException`

---

## public class `org.assertj.core.util.diff.DeleteDelta`<T extends java.lang.Object>
extends `org.assertj.core.util.diff.Delta`  

**Constructors:**
- `public DeleteDelta(org.assertj.core.util.diff.Chunk p0, org.assertj.core.util.diff.Chunk p1)`

**Methods:**
- `public void applyTo(java.util.List p0) throws java.lang.IllegalStateException`
- `public org.assertj.core.util.diff.Delta$TYPE getType()`
- `public void verify(java.util.List p0) throws java.lang.IllegalStateException`

---

## public abstract class `org.assertj.core.util.diff.Delta`<T extends java.lang.Object>

**Constructors:**
- `public Delta(org.assertj.core.util.diff.Chunk p0, org.assertj.core.util.diff.Chunk p1)`

**Fields:**
- `public final static java.lang.String DEFAULT_END`
- `public final static java.lang.String DEFAULT_START`

**Methods:**
- `public abstract void applyTo(java.util.List p0) throws java.lang.IllegalStateException`
- `public boolean equals(java.lang.Object p0)`
- `public org.assertj.core.util.diff.Chunk getOriginal()`
- `public org.assertj.core.util.diff.Chunk getRevised()`
- `public abstract org.assertj.core.util.diff.Delta$TYPE getType()`
- `public int hashCode()`
- `public int lineNumber()`
- `public java.lang.String toString()`
- `public abstract void verify(java.util.List p0) throws java.lang.IllegalStateException`

---

## public final static enum `org.assertj.core.util.diff.Delta$TYPE`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.assertj.core.util.diff.Delta$TYPE CHANGE`
- `public final static org.assertj.core.util.diff.Delta$TYPE DELETE`
- `public final static org.assertj.core.util.diff.Delta$TYPE INSERT`

---

## public class `org.assertj.core.util.diff.DeltaComparator`
implements `java.io.Serializable`, `java.util.Comparator<org.assertj.core.util.diff.Delta<? extends java.lang.Object>>`  

**Fields:**
- `public final static java.util.Comparator INSTANCE`

**Methods:**
- `public int compare(org.assertj.core.util.diff.Delta p0, org.assertj.core.util.diff.Delta p1)`

---

## public abstract interface `org.assertj.core.util.diff.DiffAlgorithm`<T extends java.lang.Object>

**Methods:**
- `public abstract org.assertj.core.util.diff.Patch diff(java.util.List p0, java.util.List p1)`

---

## public class `org.assertj.core.util.diff.DiffUtils`

**Constructors:**
- `public DiffUtils()`

**Methods:**
- `public static <T extends java.lang.Object> org.assertj.core.util.diff.Patch diff(java.util.List p0, java.util.List p1)`
- `public static <T extends java.lang.Object> org.assertj.core.util.diff.Patch diff(java.util.List p0, java.util.List p1, org.assertj.core.util.diff.DiffAlgorithm p2)`
- `public static java.util.List generateUnifiedDiff(java.lang.String p0, java.lang.String p1, java.util.List p2, org.assertj.core.util.diff.Patch p3, int p4)`
- `public static org.assertj.core.util.diff.Patch parseUnifiedDiff(java.util.List p0)`
- `public static <T extends java.lang.Object> java.util.List patch(java.util.List p0, org.assertj.core.util.diff.Patch p1) throws java.lang.IllegalStateException`

---

## public class `org.assertj.core.util.diff.InsertDelta`<T extends java.lang.Object>
extends `org.assertj.core.util.diff.Delta`  

**Constructors:**
- `public InsertDelta(org.assertj.core.util.diff.Chunk p0, org.assertj.core.util.diff.Chunk p1)`

**Methods:**
- `public void applyTo(java.util.List p0)`
- `public org.assertj.core.util.diff.Delta$TYPE getType()`
- `public void verify(java.util.List p0) throws java.lang.IllegalStateException`

---

## public class `org.assertj.core.util.diff.Patch`<T extends java.lang.Object>

**Constructors:**
- `public Patch()`

**Methods:**
- `public void addDelta(org.assertj.core.util.diff.Delta p0)`
- `public java.util.List applyTo(java.util.List p0) throws java.lang.IllegalStateException`
- `public java.util.List getDeltas()`

---

## public final class `org.assertj.core.util.diff.myers.DiffNode`
extends `org.assertj.core.util.diff.myers.PathNode`  

**Constructors:**
- `public DiffNode(int p0, int p1, org.assertj.core.util.diff.myers.PathNode p2)`

**Methods:**
- `public boolean isSnake()`

---

## public abstract interface `org.assertj.core.util.diff.myers.Equalizer`<T extends java.lang.Object>

**Methods:**
- `public abstract boolean equals(T p0, T p1)`

---

## public class `org.assertj.core.util.diff.myers.MyersDiff`<T extends java.lang.Object>
implements `org.assertj.core.util.diff.DiffAlgorithm<T>`  

**Constructors:**
- `public MyersDiff()`

**Methods:**
- `public org.assertj.core.util.diff.myers.PathNode buildPath(java.util.List p0, java.util.List p1)`
- `public org.assertj.core.util.diff.Patch buildRevision(org.assertj.core.util.diff.myers.PathNode p0, java.util.List p1, java.util.List p2)`
- `public org.assertj.core.util.diff.Patch diff(java.util.List p0, java.util.List p1)`

---

## public abstract class `org.assertj.core.util.diff.myers.PathNode`

**Constructors:**
- `public PathNode(int p0, int p1, org.assertj.core.util.diff.myers.PathNode p2)`

**Fields:**
- `public final int i`
- `public final int j`
- `public final org.assertj.core.util.diff.myers.PathNode prev`

**Methods:**
- `public boolean isBootstrap()`
- `public abstract boolean isSnake()`
- `public final org.assertj.core.util.diff.myers.PathNode previousSnake()`
- `public java.lang.String toString()`

---

## public final class `org.assertj.core.util.diff.myers.Snake`
extends `org.assertj.core.util.diff.myers.PathNode`  

**Constructors:**
- `public Snake(int p0, int p1, org.assertj.core.util.diff.myers.PathNode p2)`

**Methods:**
- `public boolean isSnake()`

---

## public class `org.assertj.core.util.introspection.ClassUtils`

**Constructors:**
- `public ClassUtils()`

**Methods:**
- `public static java.util.List getAllInterfaces(java.lang.Class p0)`
- `public static java.util.List getAllSuperclasses(java.lang.Class p0)`

---

## public final enum `org.assertj.core.util.introspection.FieldSupport`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.assertj.core.util.introspection.FieldSupport COMPARISON`
- `public final static org.assertj.core.util.introspection.FieldSupport EXTRACTION`
- `public final static org.assertj.core.util.introspection.FieldSupport EXTRACTION_OF_PUBLIC_FIELD_ONLY`

**Methods:**
- `public static org.assertj.core.util.introspection.FieldSupport comparison()`
- `public static org.assertj.core.util.introspection.FieldSupport extraction()`
- `public <T extends java.lang.Object> T fieldValue(java.lang.String p0, java.lang.Class p1, java.lang.Object p2)`
- `public <T extends java.lang.Object> java.util.List fieldValues(java.lang.String p0, java.lang.Class p1, java.lang.Iterable p2)`
- `public <T extends java.lang.Object> java.util.List fieldValues(java.lang.String p0, java.lang.Class p1, java.lang.Object[] p2)`
- `public java.util.List fieldValues(java.lang.String p0, java.lang.Iterable p1)`
- `public boolean isAllowedToRead(java.lang.reflect.Field p0)`
- `public boolean isAllowedToUsePrivateFields()`
- `public void setAllowUsingPrivateFields(boolean p0)`

---

## public final class `org.assertj.core.util.introspection.Introspection`

**Methods:**
- `public static boolean canExtractBareNamePropertyMethods()`
- `public static java.lang.reflect.Method getPropertyGetter(java.lang.String p0, java.lang.Object p1)`
- `public static void setExtractBareNamePropertyMethods(boolean p0)`

---

## public class `org.assertj.core.util.introspection.IntrospectionError`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public IntrospectionError(java.lang.String p0)`
- `public IntrospectionError(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `org.assertj.core.util.introspection.MethodSupport`

**Constructors:**
- `public MethodSupport()`

**Methods:**
- `public static java.lang.Object methodResultFor(java.lang.Object p0, java.lang.String p1)`

---

## public class `org.assertj.core.util.introspection.PropertyOrFieldSupport`

**Fields:**
- `public final static org.assertj.core.util.introspection.PropertyOrFieldSupport COMPARISON`
- `public final static org.assertj.core.util.introspection.PropertyOrFieldSupport EXTRACTION`

**Methods:**
- `public java.lang.Object getSimpleValue(java.lang.String p0, java.lang.Object p1)`
- `public java.lang.Object getValueOf(java.lang.String p0, java.lang.Object p1)`
- `public void setAllowUsingPrivateFields(boolean p0)`

---

## public class `org.assertj.core.util.introspection.PropertySupport`

**Methods:**
- `public static org.assertj.core.util.introspection.PropertySupport instance()`
- `public <T extends java.lang.Object> T propertyValue(java.lang.String p0, java.lang.Class p1, java.lang.Object p2)`
- `public <T extends java.lang.Object> T propertyValueOf(java.lang.String p0, java.lang.Class p1, java.lang.Object p2)`
- `public static <T extends java.lang.Object> T propertyValueOf(java.lang.String p0, java.lang.Object p1, java.lang.Class p2)`
- `public <T extends java.lang.Object> java.util.List propertyValues(java.lang.String p0, java.lang.Class p1, java.lang.Iterable p2)`
- `public java.util.List propertyValues(java.lang.String p0, java.lang.Iterable p1)`
- `public boolean publicGetterExistsFor(java.lang.String p0, java.lang.Object p1)`

---

## public class `org.assertj.core.util.xml.XmlStringPrettyFormatter`

**Methods:**
- `public static java.lang.String xmlPrettyFormat(java.lang.String p0)`

---

