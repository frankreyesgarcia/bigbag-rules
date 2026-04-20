# API Specification: org.mockito:mockito-core 5.1.1

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public final class `org.mockito.AdditionalAnswers`

**Methods:**
- `public static <T extends java.lang.Object, A extends java.lang.Object> org.mockito.stubbing.Answer answer(org.mockito.stubbing.Answer1 p0)`
- `public static <T extends java.lang.Object, A extends java.lang.Object, B extends java.lang.Object> org.mockito.stubbing.Answer answer(org.mockito.stubbing.Answer2 p0)`
- `public static <T extends java.lang.Object, A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object> org.mockito.stubbing.Answer answer(org.mockito.stubbing.Answer3 p0)`
- `public static <T extends java.lang.Object, A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object> org.mockito.stubbing.Answer answer(org.mockito.stubbing.Answer4 p0)`
- `public static <T extends java.lang.Object, A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object, E extends java.lang.Object> org.mockito.stubbing.Answer answer(org.mockito.stubbing.Answer5 p0)`
- `public static <T extends java.lang.Object, A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object, E extends java.lang.Object, F extends java.lang.Object> org.mockito.stubbing.Answer answer(org.mockito.stubbing.Answer6 p0)`
- `public static <A extends java.lang.Object> org.mockito.stubbing.Answer answerVoid(org.mockito.stubbing.VoidAnswer1 p0)`
- `public static <A extends java.lang.Object, B extends java.lang.Object> org.mockito.stubbing.Answer answerVoid(org.mockito.stubbing.VoidAnswer2 p0)`
- `public static <A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object> org.mockito.stubbing.Answer answerVoid(org.mockito.stubbing.VoidAnswer3 p0)`
- `public static <A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object> org.mockito.stubbing.Answer answerVoid(org.mockito.stubbing.VoidAnswer4 p0)`
- `public static <A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object, E extends java.lang.Object> org.mockito.stubbing.Answer answerVoid(org.mockito.stubbing.VoidAnswer5 p0)`
- `public static <A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object, E extends java.lang.Object, F extends java.lang.Object> org.mockito.stubbing.Answer answerVoid(org.mockito.stubbing.VoidAnswer6 p0)`
- `public static <T extends java.lang.Object> org.mockito.stubbing.Answer answersWithDelay(long p0, org.mockito.stubbing.Answer p1)`
- `public static <T extends java.lang.Object> org.mockito.stubbing.Answer delegatesTo(java.lang.Object p0)`
- `public static <T extends java.lang.Object> org.mockito.stubbing.Answer returnsArgAt(int p0)`
- `public static <T extends java.lang.Object> org.mockito.stubbing.Answer returnsElementsOf(java.util.Collection p0)`
- `public static <T extends java.lang.Object> org.mockito.stubbing.Answer returnsFirstArg()`
- `public static <T extends java.lang.Object> org.mockito.stubbing.Answer returnsLastArg()`
- `public static <T extends java.lang.Object> org.mockito.stubbing.Answer returnsSecondArg()`

---

## public final class `org.mockito.AdditionalMatchers`

**Methods:**
- `public static <T extends java.lang.Object> T and(T p0, T p1)`
- `public static boolean and(boolean p0, boolean p1)`
- `public static byte and(byte p0, byte p1)`
- `public static char and(char p0, char p1)`
- `public static double and(double p0, double p1)`
- `public static float and(float p0, float p1)`
- `public static int and(int p0, int p1)`
- `public static long and(long p0, long p1)`
- `public static short and(short p0, short p1)`
- `public static <T extends java.lang.Object> T[] aryEq(T[] p0)`
- `public static boolean[] aryEq(boolean[] p0)`
- `public static byte[] aryEq(byte[] p0)`
- `public static char[] aryEq(char[] p0)`
- `public static double[] aryEq(double[] p0)`
- `public static float[] aryEq(float[] p0)`
- `public static int[] aryEq(int[] p0)`
- `public static long[] aryEq(long[] p0)`
- `public static short[] aryEq(short[] p0)`
- `public static <T extends java.lang.Comparable<T>> T cmpEq(T p0)`
- `public static double eq(double p0, double p1)`
- `public static float eq(float p0, float p1)`
- `public static java.lang.String find(java.lang.String p0)`
- `public static <T extends java.lang.Comparable<T>> T geq(T p0)`
- `public static byte geq(byte p0)`
- `public static double geq(double p0)`
- `public static float geq(float p0)`
- `public static int geq(int p0)`
- `public static long geq(long p0)`
- `public static short geq(short p0)`
- `public static <T extends java.lang.Comparable<T>> T gt(T p0)`
- `public static byte gt(byte p0)`
- `public static double gt(double p0)`
- `public static float gt(float p0)`
- `public static int gt(int p0)`
- `public static long gt(long p0)`
- `public static short gt(short p0)`
- `public static <T extends java.lang.Comparable<T>> T leq(T p0)`
- `public static byte leq(byte p0)`
- `public static double leq(double p0)`
- `public static float leq(float p0)`
- `public static int leq(int p0)`
- `public static long leq(long p0)`
- `public static short leq(short p0)`
- `public static <T extends java.lang.Comparable<T>> T lt(T p0)`
- `public static byte lt(byte p0)`
- `public static double lt(double p0)`
- `public static float lt(float p0)`
- `public static int lt(int p0)`
- `public static long lt(long p0)`
- `public static short lt(short p0)`
- `public static <T extends java.lang.Object> T not(T p0)`
- `public static boolean not(boolean p0)`
- `public static byte not(byte p0)`
- `public static char not(char p0)`
- `public static double not(double p0)`
- `public static float not(float p0)`
- `public static int not(int p0)`
- `public static long not(long p0)`
- `public static short not(short p0)`
- `public static <T extends java.lang.Object> T or(T p0, T p1)`
- `public static boolean or(boolean p0, boolean p1)`
- `public static byte or(byte p0, byte p1)`
- `public static char or(char p0, char p1)`
- `public static double or(double p0, double p1)`
- `public static float or(float p0, float p1)`
- `public static int or(int p0, int p1)`
- `public static long or(long p0, long p1)`
- `public static short or(short p0, short p1)`

---

## public final enum `org.mockito.Answers`
extends `java.lang.Enum`  
implements `org.mockito.stubbing.Answer<java.lang.Object>`  

**Fields:**
- `public final static org.mockito.Answers CALLS_REAL_METHODS`
- `public final static org.mockito.Answers RETURNS_DEEP_STUBS`
- `public final static org.mockito.Answers RETURNS_DEFAULTS`
- `public final static org.mockito.Answers RETURNS_MOCKS`
- `public final static org.mockito.Answers RETURNS_SELF`
- `public final static org.mockito.Answers RETURNS_SMART_NULLS`

**Methods:**
- `public java.lang.Object answer(org.mockito.invocation.InvocationOnMock p0) throws java.lang.Throwable`

---

## public class `org.mockito.ArgumentCaptor`<T extends java.lang.Object>
annotations: @org.mockito.CheckReturnValue  

**Methods:**
- `public T capture()`
- `public static <U extends java.lang.Object, S extends U> org.mockito.ArgumentCaptor forClass(java.lang.Class p0)`
- `public java.util.List getAllValues()`
- `public T getValue()`

---

## public abstract interface `org.mockito.ArgumentMatcher`<T extends java.lang.Object>
annotations: @java.lang.FunctionalInterface  

**Methods:**
- `public abstract boolean matches(T p0)`
- `public default java.lang.Class type()`

---

## public class `org.mockito.ArgumentMatchers`
annotations: @org.mockito.CheckReturnValue  

**Constructors:**
- `public ArgumentMatchers()`

**Methods:**
- `public static <T extends java.lang.Object> T any()`
- `public static <T extends java.lang.Object> T any(java.lang.Class p0)`
- `public static boolean anyBoolean()`
- `public static byte anyByte()`
- `public static char anyChar()`
- `public static <T extends java.lang.Object> java.util.Collection anyCollection()`
- `public static double anyDouble()`
- `public static float anyFloat()`
- `public static int anyInt()`
- `public static <T extends java.lang.Object> java.lang.Iterable anyIterable()`
- `public static <T extends java.lang.Object> java.util.List anyList()`
- `public static long anyLong()`
- `public static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map anyMap()`
- `public static <T extends java.lang.Object> java.util.Set anySet()`
- `public static short anyShort()`
- `public static java.lang.String anyString()`
- `public static <T extends java.lang.Object> T argThat(org.mockito.ArgumentMatcher p0)`
- `public static boolean booleanThat(org.mockito.ArgumentMatcher p0)`
- `public static byte byteThat(org.mockito.ArgumentMatcher p0)`
- `public static char charThat(org.mockito.ArgumentMatcher p0)`
- `public static java.lang.String contains(java.lang.String p0)`
- `public static double doubleThat(org.mockito.ArgumentMatcher p0)`
- `public static java.lang.String endsWith(java.lang.String p0)`
- `public static <T extends java.lang.Object> T eq(T p0)`
- `public static boolean eq(boolean p0)`
- `public static byte eq(byte p0)`
- `public static char eq(char p0)`
- `public static double eq(double p0)`
- `public static float eq(float p0)`
- `public static int eq(int p0)`
- `public static long eq(long p0)`
- `public static short eq(short p0)`
- `public static float floatThat(org.mockito.ArgumentMatcher p0)`
- `public static int intThat(org.mockito.ArgumentMatcher p0)`
- `public static <T extends java.lang.Object> T isA(java.lang.Class p0)`
- `public static <T extends java.lang.Object> T isNotNull()`
- `public static <T extends java.lang.Object> T isNotNull(java.lang.Class p0)`
- `public static <T extends java.lang.Object> T isNull()`
- `public static <T extends java.lang.Object> T isNull(java.lang.Class p0)`
- `public static long longThat(org.mockito.ArgumentMatcher p0)`
- `public static java.lang.String matches(java.lang.String p0)`
- `public static java.lang.String matches(java.util.regex.Pattern p0)`
- `public static <T extends java.lang.Object> T notNull()`
- `public static <T extends java.lang.Object> T notNull(java.lang.Class p0)`
- `public static <T extends java.lang.Object> T nullable(java.lang.Class p0)`
- `public static <T extends java.lang.Object> T refEq(T p0, java.lang.String... p1)`
- `public static <T extends java.lang.Object> T same(T p0)`
- `public static short shortThat(org.mockito.ArgumentMatcher p0)`
- `public static java.lang.String startsWith(java.lang.String p0)`

---

## public class `org.mockito.BDDMockito`
extends `org.mockito.Mockito`  

**Constructors:**
- `public BDDMockito()`

**Methods:**
- `public static <T extends java.lang.Object> org.mockito.BDDMockito$BDDMyOngoingStubbing given(T p0)`
- `public static <T extends java.lang.Object> org.mockito.BDDMockito$Then then(T p0)`
- `public static org.mockito.BDDMockito$BDDStubber will(org.mockito.stubbing.Answer p0)`
- `public static org.mockito.BDDMockito$BDDStubber willAnswer(org.mockito.stubbing.Answer p0)`
- `public static org.mockito.BDDMockito$BDDStubber willCallRealMethod()`
- `public static org.mockito.BDDMockito$BDDStubber willDoNothing()`
- `public static org.mockito.BDDMockito$BDDStubber willReturn(java.lang.Object p0)`
- `public static org.mockito.BDDMockito$BDDStubber willReturn(java.lang.Object p0, java.lang.Object... p1)`
- `public static org.mockito.BDDMockito$BDDStubber willThrow(java.lang.Class p0)`
- `public static org.mockito.BDDMockito$BDDStubber willThrow(java.lang.Class p0, java.lang.Class... p1)`
- `public static org.mockito.BDDMockito$BDDStubber willThrow(java.lang.Throwable... p0)`

---

## public abstract static interface `org.mockito.BDDMockito$BDDMyOngoingStubbing`<T extends java.lang.Object>

**Methods:**
- `public abstract <M extends java.lang.Object> M getMock()`
- `public abstract org.mockito.BDDMockito$BDDMyOngoingStubbing will(org.mockito.stubbing.Answer p0)`
- `public abstract org.mockito.BDDMockito$BDDMyOngoingStubbing willAnswer(org.mockito.stubbing.Answer p0)`
- `public abstract org.mockito.BDDMockito$BDDMyOngoingStubbing willCallRealMethod()`
- `public abstract org.mockito.BDDMockito$BDDMyOngoingStubbing willReturn(T p0)`
- `public abstract org.mockito.BDDMockito$BDDMyOngoingStubbing willReturn(T p0, T... p1)`
- `public abstract org.mockito.BDDMockito$BDDMyOngoingStubbing willThrow(java.lang.Class p0)`
- `public abstract org.mockito.BDDMockito$BDDMyOngoingStubbing willThrow(java.lang.Class p0, java.lang.Class... p1)`
- `public abstract org.mockito.BDDMockito$BDDMyOngoingStubbing willThrow(java.lang.Throwable... p0)`

---

## public abstract static interface `org.mockito.BDDMockito$BDDStubber`

**Methods:**
- `public abstract <T extends java.lang.Object> T given(T p0)`
- `public abstract org.mockito.BDDMockito$BDDStubber will(org.mockito.stubbing.Answer p0)`
- `public abstract org.mockito.BDDMockito$BDDStubber willAnswer(org.mockito.stubbing.Answer p0)`
- `public abstract org.mockito.BDDMockito$BDDStubber willCallRealMethod()`
- `public abstract org.mockito.BDDMockito$BDDStubber willDoNothing()`
- `public abstract org.mockito.BDDMockito$BDDStubber willReturn(java.lang.Object p0)`
- `public abstract org.mockito.BDDMockito$BDDStubber willReturn(java.lang.Object p0, java.lang.Object... p1)`
- `public abstract org.mockito.BDDMockito$BDDStubber willThrow(java.lang.Class p0)`
- `public abstract org.mockito.BDDMockito$BDDStubber willThrow(java.lang.Class p0, java.lang.Class... p1)`
- `public abstract org.mockito.BDDMockito$BDDStubber willThrow(java.lang.Throwable... p0)`

---

## public abstract static interface `org.mockito.BDDMockito$Then`<T extends java.lang.Object>

**Methods:**
- `public abstract T should()`
- `public abstract T should(org.mockito.InOrder p0)`
- `public abstract T should(org.mockito.InOrder p0, org.mockito.verification.VerificationMode p1)`
- `public abstract T should(org.mockito.verification.VerificationMode p0)`
- `public abstract void shouldHaveNoInteractions()`
- `public abstract void shouldHaveNoMoreInteractions()`

---

## public abstract interface `org.mockito.Captor`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `org.mockito.CheckReturnValue`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `org.mockito.DoNotMock`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `org.mockito.InOrder`

**Methods:**
- `public abstract <T extends java.lang.Object> T verify(T p0)`
- `public abstract <T extends java.lang.Object> T verify(T p0, org.mockito.verification.VerificationMode p1)`
- `public default void verify(org.mockito.MockedStatic p0, org.mockito.MockedStatic$Verification p1)`
- `public abstract void verify(org.mockito.MockedStatic p0, org.mockito.MockedStatic$Verification p1, org.mockito.verification.VerificationMode p2)`
- `public abstract void verifyNoMoreInteractions()`

---

## public abstract interface `org.mockito.Incubating`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Inherited, @java.lang.annotation.Retention  

---

## public abstract interface `org.mockito.InjectMocks`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `org.mockito.Mock`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public final static enum `org.mockito.Mock$Strictness`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.mockito.Mock$Strictness LENIENT`
- `public final static org.mockito.Mock$Strictness STRICT_STUBS`
- `public final static org.mockito.Mock$Strictness TEST_LEVEL_DEFAULT`
- `public final static org.mockito.Mock$Strictness WARN`

---

## public final class `org.mockito.MockMakers`

**Fields:**
- `public final static java.lang.String INLINE`
- `public final static java.lang.String PROXY`
- `public final static java.lang.String SUBCLASS`

---

## public abstract interface `org.mockito.MockSettings`
annotations: @org.mockito.NotExtensible  
implements `java.io.Serializable`  

**Methods:**
- `public abstract <T extends java.lang.Object> org.mockito.mock.MockCreationSettings build(java.lang.Class p0)`
- `public abstract <T extends java.lang.Object> org.mockito.mock.MockCreationSettings buildStatic(java.lang.Class p0)`
- `public abstract org.mockito.MockSettings defaultAnswer(org.mockito.stubbing.Answer p0)`
- `public abstract org.mockito.MockSettings extraInterfaces(java.lang.Class... p0)`
- `public abstract org.mockito.MockSettings invocationListeners(org.mockito.listeners.InvocationListener... p0)`
- `public abstract org.mockito.MockSettings lenient()`
- `public abstract org.mockito.MockSettings mockMaker(java.lang.String p0)`
- `public abstract org.mockito.MockSettings name(java.lang.String p0)`
- `public abstract org.mockito.MockSettings outerInstance(java.lang.Object p0)`
- `public abstract org.mockito.MockSettings serializable()`
- `public abstract org.mockito.MockSettings serializable(org.mockito.mock.SerializableMode p0)`
- `public abstract org.mockito.MockSettings spiedInstance(java.lang.Object p0)`
- `public abstract org.mockito.MockSettings strictness(org.mockito.quality.Strictness p0)`
- `public abstract org.mockito.MockSettings stubOnly()`
- `public abstract org.mockito.MockSettings stubbingLookupListeners(org.mockito.listeners.StubbingLookupListener... p0)`
- `public abstract org.mockito.MockSettings useConstructor(java.lang.Object... p0)`
- `public abstract org.mockito.MockSettings verboseLogging()`
- `public abstract org.mockito.MockSettings verificationStartedListeners(org.mockito.listeners.VerificationStartedListener... p0)`
- `public abstract org.mockito.MockSettings withoutAnnotations()`

---

## public abstract interface `org.mockito.MockedConstruction`<T extends java.lang.Object>
implements `org.mockito.ScopedMock`  

**Methods:**
- `public abstract java.util.List constructed()`

---

## public abstract static interface `org.mockito.MockedConstruction$Context`

**Methods:**
- `public abstract java.util.List arguments()`
- `public abstract java.lang.reflect.Constructor constructor()`
- `public abstract int getCount()`

---

## public abstract static interface `org.mockito.MockedConstruction$MockInitializer`<T extends java.lang.Object>
annotations: @java.lang.FunctionalInterface  

**Methods:**
- `public abstract void prepare(T p0, org.mockito.MockedConstruction$Context p1) throws java.lang.Throwable`

---

## public abstract interface `org.mockito.MockedStatic`<T extends java.lang.Object>
implements `org.mockito.ScopedMock`  

**Methods:**
- `public abstract void clearInvocations()`
- `public abstract void reset()`
- `public default void verify(org.mockito.MockedStatic$Verification p0)`
- `public abstract void verify(org.mockito.MockedStatic$Verification p0, org.mockito.verification.VerificationMode p1)`
- `public abstract void verifyNoInteractions()`
- `public abstract void verifyNoMoreInteractions()`
- `public abstract <S extends java.lang.Object> org.mockito.stubbing.OngoingStubbing when(org.mockito.MockedStatic$Verification p0)`

---

## public abstract static interface `org.mockito.MockedStatic$Verification`
annotations: @java.lang.FunctionalInterface  

**Methods:**
- `public abstract void apply() throws java.lang.Throwable`

---

## public abstract interface `org.mockito.MockingDetails`

**Methods:**
- `public abstract java.util.Collection getInvocations()`
- `public abstract java.lang.Object getMock()`
- `public abstract org.mockito.mock.MockCreationSettings getMockCreationSettings()`
- `public abstract org.mockito.invocation.MockHandler getMockHandler()`
- `public abstract java.util.Collection getStubbings()`
- `public abstract boolean isMock()`
- `public abstract boolean isSpy()`
- `public abstract java.lang.String printInvocations()`

---

## public class `org.mockito.Mockito`
annotations: @org.mockito.CheckReturnValue  
extends `org.mockito.ArgumentMatchers`  

**Constructors:**
- `public Mockito()`

**Fields:**
- `public final static org.mockito.stubbing.Answer CALLS_REAL_METHODS`
- `public final static org.mockito.stubbing.Answer RETURNS_DEEP_STUBS`
- `public final static org.mockito.stubbing.Answer RETURNS_DEFAULTS`
- `public final static org.mockito.stubbing.Answer RETURNS_MOCKS`
- `public final static org.mockito.stubbing.Answer RETURNS_SELF`
- `public final static org.mockito.stubbing.Answer RETURNS_SMART_NULLS`

**Methods:**
- `public static org.mockito.verification.VerificationAfterDelay after(long p0)`
- `public static org.mockito.verification.VerificationMode atLeast(int p0)`
- `public static org.mockito.verification.VerificationMode atLeastOnce()`
- `public static org.mockito.verification.VerificationMode atMost(int p0)`
- `public static org.mockito.verification.VerificationMode atMostOnce()`
- `public static org.mockito.verification.VerificationMode calls(int p0)`
- `public static void clearAllCaches()`
- `public static <T extends java.lang.Object> void clearInvocations(T... p0)`
- `public static org.mockito.verification.VerificationMode description(java.lang.String p0)`
- `public static org.mockito.stubbing.Stubber doAnswer(org.mockito.stubbing.Answer p0)`
- `public static org.mockito.stubbing.Stubber doCallRealMethod()`
- `public static org.mockito.stubbing.Stubber doNothing()`
- `public static org.mockito.stubbing.Stubber doReturn(java.lang.Object p0)`
- `public static org.mockito.stubbing.Stubber doReturn(java.lang.Object p0, java.lang.Object... p1)`
- `public static org.mockito.stubbing.Stubber doThrow(java.lang.Class p0)`
- `public static org.mockito.stubbing.Stubber doThrow(java.lang.Class p0, java.lang.Class... p1)`
- `public static org.mockito.stubbing.Stubber doThrow(java.lang.Throwable... p0)`
- `public static org.mockito.MockitoFramework framework()`
- `public static java.lang.Object[] ignoreStubs(java.lang.Object... p0)`
- `public static org.mockito.InOrder inOrder(java.lang.Object... p0)`
- `public static org.mockito.stubbing.LenientStubber lenient()`
- `public static <T extends java.lang.Object> T mock(T... p0)`
- `public static <T extends java.lang.Object> T mock(java.lang.Class p0)`
- `public static <T extends java.lang.Object> T mock(java.lang.Class p0, java.lang.String p1)`
- `public static <T extends java.lang.Object> T mock(java.lang.Class p0, org.mockito.MockSettings p1)`
- `public static <T extends java.lang.Object> T mock(java.lang.Class p0, org.mockito.stubbing.Answer p1)`
- `public static <T extends java.lang.Object> T mock(java.lang.String p0, T... p1)`
- `public static <T extends java.lang.Object> T mock(org.mockito.MockSettings p0, T... p1)`
- `public static <T extends java.lang.Object> T mock(org.mockito.stubbing.Answer p0, T... p1)`
- `public static <T extends java.lang.Object> org.mockito.MockedConstruction mockConstruction(java.lang.Class p0)`
- `public static <T extends java.lang.Object> org.mockito.MockedConstruction mockConstruction(java.lang.Class p0, java.util.function.Function p1)`
- `public static <T extends java.lang.Object> org.mockito.MockedConstruction mockConstruction(java.lang.Class p0, java.util.function.Function p1, org.mockito.MockedConstruction$MockInitializer p2)`
- `public static <T extends java.lang.Object> org.mockito.MockedConstruction mockConstruction(java.lang.Class p0, org.mockito.MockSettings p1)`
- `public static <T extends java.lang.Object> org.mockito.MockedConstruction mockConstruction(java.lang.Class p0, org.mockito.MockSettings p1, org.mockito.MockedConstruction$MockInitializer p2)`
- `public static <T extends java.lang.Object> org.mockito.MockedConstruction mockConstruction(java.lang.Class p0, org.mockito.MockedConstruction$MockInitializer p1)`
- `public static <T extends java.lang.Object> org.mockito.MockedConstruction mockConstructionWithAnswer(java.lang.Class p0, org.mockito.stubbing.Answer p1, org.mockito.stubbing.Answer... p2)`
- `public static <T extends java.lang.Object> org.mockito.MockedStatic mockStatic(java.lang.Class p0)`
- `public static <T extends java.lang.Object> org.mockito.MockedStatic mockStatic(java.lang.Class p0, java.lang.String p1)`
- `public static <T extends java.lang.Object> org.mockito.MockedStatic mockStatic(java.lang.Class p0, org.mockito.MockSettings p1)`
- `public static <T extends java.lang.Object> org.mockito.MockedStatic mockStatic(java.lang.Class p0, org.mockito.stubbing.Answer p1)`
- `public static org.mockito.MockingDetails mockingDetails(java.lang.Object p0)`
- `public static org.mockito.session.MockitoSessionBuilder mockitoSession()`
- `public static org.mockito.verification.VerificationMode never()`
- `public static org.mockito.verification.VerificationMode only()`
- `public static <T extends java.lang.Object> void reset(T... p0)`
- `public static <T extends java.lang.Object> T spy(T p0)`
- `public static <T extends java.lang.Object> T spy(T... p0)`
- `public static <T extends java.lang.Object> T spy(java.lang.Class p0)`
- `public static org.mockito.verification.VerificationWithTimeout timeout(long p0)`
- `public static org.mockito.verification.VerificationMode times(int p0)`
- `public static void validateMockitoUsage()`
- `public static <T extends java.lang.Object> T verify(T p0)`
- `public static <T extends java.lang.Object> T verify(T p0, org.mockito.verification.VerificationMode p1)`
- `public static void verifyNoInteractions(java.lang.Object... p0)`
- `public static void verifyNoMoreInteractions(java.lang.Object... p0)`
- `public static <T extends java.lang.Object> org.mockito.stubbing.OngoingStubbing when(T p0)`
- `public static org.mockito.MockSettings withSettings()`

---

## public final class `org.mockito.MockitoAnnotations`

**Methods:**
- `public static void initMocks(java.lang.Object p0)`
- `public static java.lang.AutoCloseable openMocks(java.lang.Object p0)`

---

## public abstract interface `org.mockito.MockitoFramework`
annotations: @org.mockito.NotExtensible  

**Methods:**
- `public abstract org.mockito.MockitoFramework addListener(org.mockito.listeners.MockitoListener p0) throws org.mockito.exceptions.misusing.RedundantListenerException`
- `public abstract void clearInlineMock(java.lang.Object p0)`
- `public abstract void clearInlineMocks()`
- `public abstract org.mockito.invocation.InvocationFactory getInvocationFactory()`
- `public abstract org.mockito.plugins.MockitoPlugins getPlugins()`
- `public abstract org.mockito.MockitoFramework removeListener(org.mockito.listeners.MockitoListener p0)`

---

## public abstract interface `org.mockito.MockitoSession`
annotations: @org.mockito.NotExtensible  

**Methods:**
- `public abstract void finishMocking()`
- `public abstract void finishMocking(java.lang.Throwable p0)`
- `public abstract void setStrictness(org.mockito.quality.Strictness p0)`

---

## public abstract interface `org.mockito.NotExtensible`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention  

---

## public abstract interface `org.mockito.ScopedMock`
implements `java.lang.AutoCloseable`  

**Methods:**
- `public abstract void close()`
- `public abstract void closeOnDemand()`
- `public abstract boolean isClosed()`

---

## public abstract interface `org.mockito.Spy`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public class `org.mockito.codegen.InjectionBase`

---

## public class `org.mockito.configuration.DefaultMockitoConfiguration`
implements `org.mockito.configuration.IMockitoConfiguration`  

**Constructors:**
- `public DefaultMockitoConfiguration()`

**Methods:**
- `public boolean cleansStackTrace()`
- `public boolean enableClassCache()`
- `public org.mockito.stubbing.Answer getDefaultAnswer()`

---

## public abstract interface `org.mockito.configuration.IMockitoConfiguration`

**Methods:**
- `public abstract boolean cleansStackTrace()`
- `public abstract boolean enableClassCache()`
- `public abstract org.mockito.stubbing.Answer getDefaultAnswer()`

---

## public class `org.mockito.creation.instance.InstantiationException`
extends `org.mockito.exceptions.base.MockitoException`  

**Constructors:**
- `public InstantiationException(java.lang.String p0)`
- `public InstantiationException(java.lang.String p0, java.lang.Throwable p1)`

---

## public abstract interface `org.mockito.creation.instance.Instantiator`

**Methods:**
- `public abstract <T extends java.lang.Object> T newInstance(java.lang.Class p0)`

---

## public class `org.mockito.exceptions.base.MockitoAssertionError`
extends `java.lang.AssertionError`  

**Constructors:**
- `public MockitoAssertionError(java.lang.AssertionError p0, java.lang.String p1)`
- `public MockitoAssertionError(java.lang.String p0)`
- `public MockitoAssertionError(org.mockito.exceptions.base.MockitoAssertionError p0, java.lang.String p1)`

**Methods:**
- `public java.lang.StackTraceElement[] getUnfilteredStackTrace()`

---

## public class `org.mockito.exceptions.base.MockitoException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public MockitoException(java.lang.String p0)`
- `public MockitoException(java.lang.String p0, java.lang.Throwable p1)`

**Methods:**
- `public java.lang.StackTraceElement[] getUnfilteredStackTrace()`

---

## public class `org.mockito.exceptions.base.MockitoInitializationException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public MockitoInitializationException(java.lang.String p0)`
- `public MockitoInitializationException(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `org.mockito.exceptions.base.MockitoSerializationIssue`
extends `java.io.ObjectStreamException`  

**Constructors:**
- `public MockitoSerializationIssue(java.lang.String p0, java.lang.Exception p1)`

**Methods:**
- `public java.lang.StackTraceElement[] getUnfilteredStackTrace()`

---

## public class `org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue`
extends `org.mockito.exceptions.base.MockitoException`  

**Constructors:**
- `public CannotStubVoidMethodWithReturnValue(java.lang.String p0)`

---

## public class `org.mockito.exceptions.misusing.CannotVerifyStubOnlyMock`
extends `org.mockito.exceptions.base.MockitoException`  

**Constructors:**
- `public CannotVerifyStubOnlyMock(java.lang.String p0)`

---

## public class `org.mockito.exceptions.misusing.DoNotMockException`
extends `org.mockito.exceptions.base.MockitoException`  

**Constructors:**
- `public DoNotMockException(java.lang.String p0)`

---

## public class `org.mockito.exceptions.misusing.FriendlyReminderException`
extends `org.mockito.exceptions.base.MockitoException`  

**Constructors:**
- `public FriendlyReminderException(java.lang.String p0)`

---

## public class `org.mockito.exceptions.misusing.InjectMocksException`
extends `org.mockito.exceptions.base.MockitoException`  

**Constructors:**
- `public InjectMocksException(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `org.mockito.exceptions.misusing.InvalidUseOfMatchersException`
extends `org.mockito.exceptions.base.MockitoException`  

**Constructors:**
- `public InvalidUseOfMatchersException()`
- `public InvalidUseOfMatchersException(java.lang.String p0)`

---

## public class `org.mockito.exceptions.misusing.MissingMethodInvocationException`
extends `org.mockito.exceptions.base.MockitoException`  

**Constructors:**
- `public MissingMethodInvocationException(java.lang.String p0)`

---

## public class `org.mockito.exceptions.misusing.MockitoConfigurationException`
extends `org.mockito.exceptions.base.MockitoException`  

**Constructors:**
- `public MockitoConfigurationException(java.lang.String p0)`
- `public MockitoConfigurationException(java.lang.String p0, java.lang.Exception p1)`

---

## public class `org.mockito.exceptions.misusing.NotAMockException`
extends `org.mockito.exceptions.base.MockitoException`  

**Constructors:**
- `public NotAMockException(java.lang.String p0)`

---

## public class `org.mockito.exceptions.misusing.NullInsteadOfMockException`
extends `org.mockito.exceptions.base.MockitoException`  

**Constructors:**
- `public NullInsteadOfMockException(java.lang.String p0)`

---

## public class `org.mockito.exceptions.misusing.PotentialStubbingProblem`
extends `org.mockito.exceptions.base.MockitoException`  

**Constructors:**
- `public PotentialStubbingProblem(java.lang.String p0)`

---

## public class `org.mockito.exceptions.misusing.RedundantListenerException`
extends `org.mockito.exceptions.base.MockitoException`  

**Constructors:**
- `public RedundantListenerException(java.lang.String p0)`

---

## public class `org.mockito.exceptions.misusing.UnfinishedMockingSessionException`
extends `org.mockito.exceptions.base.MockitoException`  

**Constructors:**
- `public UnfinishedMockingSessionException(java.lang.String p0)`

---

## public class `org.mockito.exceptions.misusing.UnfinishedStubbingException`
extends `org.mockito.exceptions.base.MockitoException`  

**Constructors:**
- `public UnfinishedStubbingException(java.lang.String p0)`

---

## public class `org.mockito.exceptions.misusing.UnfinishedVerificationException`
extends `org.mockito.exceptions.base.MockitoException`  

**Constructors:**
- `public UnfinishedVerificationException(java.lang.String p0)`

---

## public class `org.mockito.exceptions.misusing.UnnecessaryStubbingException`
extends `org.mockito.exceptions.base.MockitoException`  

**Constructors:**
- `public UnnecessaryStubbingException(java.lang.String p0)`

---

## public class `org.mockito.exceptions.misusing.WrongTypeOfReturnValue`
extends `org.mockito.exceptions.base.MockitoException`  

**Constructors:**
- `public WrongTypeOfReturnValue(java.lang.String p0)`

---

## public abstract interface `org.mockito.exceptions.stacktrace.StackTraceCleaner`

**Methods:**
- `public abstract boolean isIn(java.lang.StackTraceElement p0)`
- `public default boolean isIn(org.mockito.exceptions.stacktrace.StackTraceCleaner$StackFrameMetadata p0)`

---

## public abstract static interface `org.mockito.exceptions.stacktrace.StackTraceCleaner$StackFrameMetadata`

**Methods:**
- `public abstract java.lang.String getClassName()`
- `public abstract java.lang.String getFileName()`
- `public abstract int getLineNumber()`
- `public abstract java.lang.String getMethodName()`

---

## public class `org.mockito.exceptions.verification.ArgumentsAreDifferent`
extends `org.mockito.exceptions.base.MockitoAssertionError`  

**Constructors:**
- `public ArgumentsAreDifferent(java.lang.String p0)`
- `public ArgumentsAreDifferent(java.lang.String p0, java.lang.String p1, java.lang.String p2)`

**Methods:**
- `public java.lang.String getMessage()`

---

## public class `org.mockito.exceptions.verification.MoreThanAllowedActualInvocations`
extends `org.mockito.exceptions.base.MockitoAssertionError`  

**Constructors:**
- `public MoreThanAllowedActualInvocations(java.lang.String p0)`

---

## public class `org.mockito.exceptions.verification.NeverWantedButInvoked`
extends `org.mockito.exceptions.base.MockitoAssertionError`  

**Constructors:**
- `public NeverWantedButInvoked(java.lang.String p0)`

---

## public class `org.mockito.exceptions.verification.NoInteractionsWanted`
extends `org.mockito.exceptions.base.MockitoAssertionError`  

**Constructors:**
- `public NoInteractionsWanted(java.lang.String p0)`

---

## public class `org.mockito.exceptions.verification.SmartNullPointerException`
extends `org.mockito.exceptions.base.MockitoException`  

**Constructors:**
- `public SmartNullPointerException(java.lang.String p0)`

---

## public class `org.mockito.exceptions.verification.TooFewActualInvocations`
extends `org.mockito.exceptions.base.MockitoAssertionError`  

**Constructors:**
- `public TooFewActualInvocations(java.lang.String p0)`

---

## public class `org.mockito.exceptions.verification.TooManyActualInvocations`
extends `org.mockito.exceptions.base.MockitoAssertionError`  

**Constructors:**
- `public TooManyActualInvocations(java.lang.String p0)`

---

## public class `org.mockito.exceptions.verification.VerificationInOrderFailure`
extends `org.mockito.exceptions.base.MockitoAssertionError`  

**Constructors:**
- `public VerificationInOrderFailure(java.lang.String p0)`

---

## public class `org.mockito.exceptions.verification.WantedButNotInvoked`
extends `org.mockito.exceptions.base.MockitoAssertionError`  

**Constructors:**
- `public WantedButNotInvoked(java.lang.String p0)`

**Methods:**
- `public java.lang.String toString()`

---

## public class `org.mockito.exceptions.verification.junit.ArgumentsAreDifferent`
extends `junit.framework.ComparisonFailure`  

**Constructors:**
- `public ArgumentsAreDifferent(java.lang.String p0, java.lang.String p1, java.lang.String p2)`

**Methods:**
- `public java.lang.String getMessage()`
- `public java.lang.StackTraceElement[] getUnfilteredStackTrace()`
- `public java.lang.String toString()`

---

## public class `org.mockito.exceptions.verification.opentest4j.ArgumentsAreDifferent`
extends `org.opentest4j.AssertionFailedError`  

**Constructors:**
- `public ArgumentsAreDifferent(java.lang.String p0, java.lang.String p1, java.lang.String p2)`

**Methods:**
- `public java.lang.String getMessage()`
- `public java.lang.StackTraceElement[] getUnfilteredStackTrace()`
- `public java.lang.String toString()`

---

## public final class `org.mockito.hamcrest.MockitoHamcrest`

**Methods:**
- `public static <T extends java.lang.Object> T argThat(org.hamcrest.Matcher p0)`
- `public static <T extends java.lang.Object> T argThat(org.hamcrest.Matcher p0, java.lang.Class p1)`
- `public static boolean booleanThat(org.hamcrest.Matcher p0)`
- `public static byte byteThat(org.hamcrest.Matcher p0)`
- `public static char charThat(org.hamcrest.Matcher p0)`
- `public static double doubleThat(org.hamcrest.Matcher p0)`
- `public static float floatThat(org.hamcrest.Matcher p0)`
- `public static int intThat(org.hamcrest.Matcher p0)`
- `public static long longThat(org.hamcrest.Matcher p0)`
- `public static short shortThat(org.hamcrest.Matcher p0)`

---

## public class `org.mockito.internal.InOrderImpl`
implements `org.mockito.InOrder`, `org.mockito.internal.verification.api.InOrderContext`  

**Constructors:**
- `public InOrderImpl(java.util.List p0)`

**Methods:**
- `public java.util.List getMocksToBeVerifiedInOrder()`
- `public boolean isVerified(org.mockito.invocation.Invocation p0)`
- `public void markVerified(org.mockito.invocation.Invocation p0)`
- `public <T extends java.lang.Object> T verify(T p0)`
- `public <T extends java.lang.Object> T verify(T p0, org.mockito.verification.VerificationMode p1)`
- `public void verify(org.mockito.MockedStatic p0, org.mockito.MockedStatic$Verification p1, org.mockito.verification.VerificationMode p2)`
- `public void verifyNoMoreInteractions()`

---

## public final class `org.mockito.internal.MockedConstructionImpl`<T extends java.lang.Object>
implements `org.mockito.MockedConstruction<T>`  

**Methods:**
- `public void close()`
- `public void closeOnDemand()`
- `public java.util.List constructed()`
- `public boolean isClosed()`

---

## public final class `org.mockito.internal.MockedStaticImpl`<T extends java.lang.Object>
implements `org.mockito.MockedStatic<T>`  

**Methods:**
- `public void clearInvocations()`
- `public void close()`
- `public void closeOnDemand()`
- `public boolean isClosed()`
- `public void reset()`
- `public java.lang.String toString()`
- `public void verify(org.mockito.MockedStatic$Verification p0, org.mockito.verification.VerificationMode p1)`
- `public void verifyNoInteractions()`
- `public void verifyNoMoreInteractions()`
- `public <S extends java.lang.Object> org.mockito.stubbing.OngoingStubbing when(org.mockito.MockedStatic$Verification p0)`

---

## public class `org.mockito.internal.MockitoCore`

**Constructors:**
- `public MockitoCore()`

**Methods:**
- `public void clearAllCaches()`
- `public <T extends java.lang.Object> void clearInvocations(T... p0)`
- `public org.mockito.invocation.Invocation getLastInvocation()`
- `public java.lang.Object[] ignoreStubs(java.lang.Object... p0)`
- `public org.mockito.InOrder inOrder(java.lang.Object... p0)`
- `public org.mockito.stubbing.LenientStubber lenient()`
- `public <T extends java.lang.Object> T mock(java.lang.Class p0, org.mockito.MockSettings p1)`
- `public <T extends java.lang.Object> org.mockito.MockedConstruction mockConstruction(java.lang.Class p0, java.util.function.Function p1, org.mockito.MockedConstruction$MockInitializer p2)`
- `public <T extends java.lang.Object> org.mockito.MockedStatic mockStatic(java.lang.Class p0, org.mockito.MockSettings p1)`
- `public org.mockito.MockingDetails mockingDetails(java.lang.Object p0)`
- `public <T extends java.lang.Object> void reset(T... p0)`
- `public org.mockito.stubbing.Stubber stubber()`
- `public org.mockito.stubbing.Stubber stubber(org.mockito.quality.Strictness p0)`
- `public void validateMockitoUsage()`
- `public <T extends java.lang.Object> T verify(T p0, org.mockito.verification.VerificationMode p1)`
- `public void verifyNoInteractions(java.lang.Object... p0)`
- `public void verifyNoMoreInteractions(java.lang.Object... p0)`
- `public void verifyNoMoreInteractionsInOrder(java.util.List p0, org.mockito.internal.verification.api.InOrderContext p1)`
- `public <T extends java.lang.Object> org.mockito.stubbing.OngoingStubbing when(T p0)`

---

## public abstract interface `org.mockito.internal.SuppressSignatureCheck`
annotations: @java.lang.annotation.Documented, @java.lang.annotation.Retention  

---

## public class `org.mockito.internal.configuration.CaptorAnnotationProcessor`
implements `org.mockito.internal.configuration.FieldAnnotationProcessor<org.mockito.Captor>`  

**Constructors:**
- `public CaptorAnnotationProcessor()`

**Methods:**
- `public java.lang.Object process(org.mockito.Captor p0, java.lang.reflect.Field p1)`

---

## public class `org.mockito.internal.configuration.ClassPathLoader`

**Constructors:**
- `public ClassPathLoader()`

**Fields:**
- `public final static java.lang.String MOCKITO_CONFIGURATION_CLASS_NAME`

**Methods:**
- `public org.mockito.configuration.IMockitoConfiguration loadConfiguration()`

---

## public class `org.mockito.internal.configuration.DefaultDoNotMockEnforcer`
implements `org.mockito.plugins.DoNotMockEnforcer`  

**Constructors:**
- `public DefaultDoNotMockEnforcer()`

**Methods:**
- `public java.lang.String checkTypeForDoNotMockViolation(java.lang.Class p0)`

---

## public class `org.mockito.internal.configuration.DefaultInjectionEngine`

**Constructors:**
- `public DefaultInjectionEngine()`

**Methods:**
- `public void injectMocksOnFields(java.util.Set p0, java.util.Set p1, java.lang.Object p2)`

---

## public abstract interface `org.mockito.internal.configuration.FieldAnnotationProcessor`<A extends java.lang.annotation.Annotation>

**Methods:**
- `public abstract java.lang.Object process(A p0, java.lang.reflect.Field p1)`

---

## public class `org.mockito.internal.configuration.GlobalConfiguration`
implements `java.io.Serializable`, `org.mockito.configuration.IMockitoConfiguration`  

**Constructors:**
- `public GlobalConfiguration()`

**Methods:**
- `public boolean cleansStackTrace()`
- `public boolean enableClassCache()`
- `public org.mockito.stubbing.Answer getDefaultAnswer()`
- `public org.mockito.plugins.AnnotationEngine tryGetPluginAnnotationEngine()`
- `public static void validate()`

---

## public class `org.mockito.internal.configuration.IndependentAnnotationEngine`
implements `org.mockito.plugins.AnnotationEngine`  

**Constructors:**
- `public IndependentAnnotationEngine()`

**Methods:**
- `public java.lang.AutoCloseable process(java.lang.Class p0, java.lang.Object p1)`

---

## public class `org.mockito.internal.configuration.InjectingAnnotationEngine`
implements `org.mockito.plugins.AnnotationEngine`  

**Constructors:**
- `public InjectingAnnotationEngine()`

**Methods:**
- `public void injectMocks(java.lang.Object p0)`
- `protected void onInjection(java.lang.Object p0, java.lang.Class p1, java.util.Set p2, java.util.Set p3)`
- `public java.lang.AutoCloseable process(java.lang.Class p0, java.lang.Object p1)`

---

## public class `org.mockito.internal.configuration.MockAnnotationProcessor`
implements `org.mockito.internal.configuration.FieldAnnotationProcessor<org.mockito.Mock>`  

**Constructors:**
- `public MockAnnotationProcessor()`

**Methods:**
- `public java.lang.Object process(org.mockito.Mock p0, java.lang.reflect.Field p1)`
- `public static java.lang.Object processAnnotationForMock(org.mockito.Mock p0, java.lang.Class p1, org.mockito.internal.util.Supplier p2, java.lang.String p3)`

---

## public class `org.mockito.internal.configuration.SpyAnnotationEngine`
implements `org.mockito.plugins.AnnotationEngine`  

**Constructors:**
- `public SpyAnnotationEngine()`

**Methods:**
- `public java.lang.AutoCloseable process(java.lang.Class p0, java.lang.Object p1)`

---

## public class `org.mockito.internal.configuration.injection.ConstructorInjection`
extends `org.mockito.internal.configuration.injection.MockInjectionStrategy`  

**Constructors:**
- `public ConstructorInjection()`

**Methods:**
- `public boolean processInjection(java.lang.reflect.Field p0, java.lang.Object p1, java.util.Set p2)`

---

## public final class `org.mockito.internal.configuration.injection.MockInjection`

**Methods:**
- `public static org.mockito.internal.configuration.injection.MockInjection$OngoingMockInjection onField(java.lang.reflect.Field p0, java.lang.Object p1)`
- `public static org.mockito.internal.configuration.injection.MockInjection$OngoingMockInjection onFields(java.util.Set p0, java.lang.Object p1)`

---

## public static class `org.mockito.internal.configuration.injection.MockInjection$OngoingMockInjection`

**Methods:**
- `public void apply()`
- `public org.mockito.internal.configuration.injection.MockInjection$OngoingMockInjection handleSpyAnnotation()`
- `public org.mockito.internal.configuration.injection.MockInjection$OngoingMockInjection tryConstructorInjection()`
- `public org.mockito.internal.configuration.injection.MockInjection$OngoingMockInjection tryPropertyOrFieldInjection()`
- `public org.mockito.internal.configuration.injection.MockInjection$OngoingMockInjection withMocks(java.util.Set p0)`

---

## public abstract class `org.mockito.internal.configuration.injection.MockInjectionStrategy`

**Constructors:**
- `public MockInjectionStrategy()`

**Methods:**
- `public static org.mockito.internal.configuration.injection.MockInjectionStrategy nop()`
- `public boolean process(java.lang.reflect.Field p0, java.lang.Object p1, java.util.Set p2)`
- `protected abstract boolean processInjection(java.lang.reflect.Field p0, java.lang.Object p1, java.util.Set p2)`
- `public org.mockito.internal.configuration.injection.MockInjectionStrategy thenTry(org.mockito.internal.configuration.injection.MockInjectionStrategy p0)`

---

## public class `org.mockito.internal.configuration.injection.PropertyAndSetterInjection`
extends `org.mockito.internal.configuration.injection.MockInjectionStrategy`  

**Constructors:**
- `public PropertyAndSetterInjection()`

**Methods:**
- `public boolean processInjection(java.lang.reflect.Field p0, java.lang.Object p1, java.util.Set p2)`

---

## public class `org.mockito.internal.configuration.injection.SpyOnInjectedFieldsHandler`
extends `org.mockito.internal.configuration.injection.MockInjectionStrategy`  

**Constructors:**
- `public SpyOnInjectedFieldsHandler()`

**Methods:**
- `protected boolean processInjection(java.lang.reflect.Field p0, java.lang.Object p1, java.util.Set p2)`

---

## public abstract interface `org.mockito.internal.configuration.injection.filter.MockCandidateFilter`

**Methods:**
- `public abstract org.mockito.internal.configuration.injection.filter.OngoingInjector filterCandidate(java.util.Collection p0, java.lang.reflect.Field p1, java.util.List p2, java.lang.Object p3)`

---

## public class `org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter`
implements `org.mockito.internal.configuration.injection.filter.MockCandidateFilter`  

**Constructors:**
- `public NameBasedCandidateFilter(org.mockito.internal.configuration.injection.filter.MockCandidateFilter p0)`

**Methods:**
- `public org.mockito.internal.configuration.injection.filter.OngoingInjector filterCandidate(java.util.Collection p0, java.lang.reflect.Field p1, java.util.List p2, java.lang.Object p3)`

---

## public abstract interface `org.mockito.internal.configuration.injection.filter.OngoingInjector`

**Fields:**
- `public final static org.mockito.internal.configuration.injection.filter.OngoingInjector nop`

**Methods:**
- `public abstract java.lang.Object thenInject()`

---

## public class `org.mockito.internal.configuration.injection.filter.TerminalMockCandidateFilter`
implements `org.mockito.internal.configuration.injection.filter.MockCandidateFilter`  

**Constructors:**
- `public TerminalMockCandidateFilter()`

**Methods:**
- `public org.mockito.internal.configuration.injection.filter.OngoingInjector filterCandidate(java.util.Collection p0, java.lang.reflect.Field p1, java.util.List p2, java.lang.Object p3)`

---

## public class `org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter`
implements `org.mockito.internal.configuration.injection.filter.MockCandidateFilter`  

**Constructors:**
- `public TypeBasedCandidateFilter(org.mockito.internal.configuration.injection.filter.MockCandidateFilter p0)`

**Methods:**
- `public org.mockito.internal.configuration.injection.filter.OngoingInjector filterCandidate(java.util.Collection p0, java.lang.reflect.Field p1, java.util.List p2, java.lang.Object p3)`

---

## public class `org.mockito.internal.configuration.injection.scanner.InjectMocksScanner`

**Constructors:**
- `public InjectMocksScanner(java.lang.Class p0)`

**Methods:**
- `public void addTo(java.util.Set p0)`

---

## public class `org.mockito.internal.configuration.injection.scanner.MockScanner`

**Constructors:**
- `public MockScanner(java.lang.Object p0, java.lang.Class p1)`

**Methods:**
- `public void addPreparedMocks(java.util.Set p0)`

---

## public class `org.mockito.internal.configuration.plugins.DefaultMockitoPlugins`
implements `org.mockito.plugins.MockitoPlugins`  

**Constructors:**
- `public DefaultMockitoPlugins()`

**Fields:**
- `public final static java.util.Set MEMBER_ACCESSOR_ALIASES`
- `public final static java.util.Set MOCK_MAKER_ALIASES`

**Methods:**
- `public <T extends java.lang.Object> T getDefaultPlugin(java.lang.Class p0)`
- `public static java.lang.String getDefaultPluginClass(java.lang.String p0)`
- `public org.mockito.plugins.MockMaker getInlineMockMaker()`

---

## public final class `org.mockito.internal.configuration.plugins.Plugins`

**Methods:**
- `public static org.mockito.plugins.AnnotationEngine getAnnotationEngine()`
- `public static org.mockito.plugins.DoNotMockEnforcer getDoNotMockEnforcer()`
- `public static org.mockito.plugins.InstantiatorProvider2 getInstantiatorProvider()`
- `public static org.mockito.plugins.MemberAccessor getMemberAccessor()`
- `public static org.mockito.plugins.MockMaker getMockMaker()`
- `public static java.util.List getMockResolvers()`
- `public static org.mockito.plugins.MockitoLogger getMockitoLogger()`
- `public static org.mockito.plugins.MockitoPlugins getPlugins()`
- `public static org.mockito.plugins.StackTraceCleanerProvider getStackTraceCleanerProvider()`

---

## public class `org.mockito.internal.creation.DelegatingMethod`
implements `org.mockito.internal.invocation.MockitoMethod`  

**Constructors:**
- `public DelegatingMethod(java.lang.reflect.Method p0)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.Class[] getExceptionTypes()`
- `public java.lang.reflect.Method getJavaMethod()`
- `public java.lang.String getName()`
- `public java.lang.Class[] getParameterTypes()`
- `public java.lang.Class getReturnType()`
- `public int hashCode()`
- `public boolean isAbstract()`
- `public boolean isVarArgs()`

---

## public class `org.mockito.internal.creation.MockSettingsImpl`<T extends java.lang.Object>
extends `org.mockito.internal.creation.settings.CreationSettings`  
implements `org.mockito.MockSettings`, `org.mockito.mock.MockCreationSettings<T>`  

**Constructors:**
- `public MockSettingsImpl()`

**Methods:**
- `public <T2 extends java.lang.Object> org.mockito.mock.MockCreationSettings build(java.lang.Class p0)`
- `public <T2 extends java.lang.Object> org.mockito.mock.MockCreationSettings buildStatic(java.lang.Class p0)`
- `public org.mockito.MockSettings defaultAnswer(org.mockito.stubbing.Answer p0)`
- `public org.mockito.MockSettings extraInterfaces(java.lang.Class... p0)`
- `public java.lang.Object[] getConstructorArgs()`
- `public org.mockito.stubbing.Answer getDefaultAnswer()`
- `public java.util.Set getExtraInterfaces()`
- `public org.mockito.mock.MockName getMockName()`
- `public java.lang.Object getOuterClassInstance()`
- `public java.lang.Object getSpiedInstance()`
- `public java.lang.Class getTypeToMock()`
- `public boolean hasInvocationListeners()`
- `public org.mockito.MockSettings invocationListeners(org.mockito.listeners.InvocationListener... p0)`
- `public boolean isStubOnly()`
- `public boolean isUsingConstructor()`
- `public org.mockito.MockSettings lenient()`
- `public org.mockito.MockSettings mockMaker(java.lang.String p0)`
- `public org.mockito.MockSettings name(java.lang.String p0)`
- `public org.mockito.MockSettings outerInstance(java.lang.Object p0)`
- `public org.mockito.MockSettings serializable()`
- `public org.mockito.MockSettings serializable(org.mockito.mock.SerializableMode p0)`
- `public org.mockito.MockSettings spiedInstance(java.lang.Object p0)`
- `public org.mockito.MockSettings strictness(org.mockito.quality.Strictness p0)`
- `public org.mockito.internal.creation.MockSettingsImpl stubOnly()`
- `public org.mockito.MockSettings stubbingLookupListeners(org.mockito.listeners.StubbingLookupListener... p0)`
- `public org.mockito.MockSettings useConstructor(java.lang.Object... p0)`
- `public org.mockito.MockSettings verboseLogging()`
- `public org.mockito.MockSettings verificationStartedListeners(org.mockito.listeners.VerificationStartedListener... p0)`
- `public org.mockito.MockSettings withoutAnnotations()`

---

## public final class `org.mockito.internal.creation.SuspendMethod`

**Methods:**
- `public static java.lang.Class[] trimSuspendParameterTypes(java.lang.Class[] p0)`

---

## public class `org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker`
implements `org.mockito.internal.creation.bytebuddy.ClassCreatingMockMaker`  

**Constructors:**
- `public ByteBuddyMockMaker()`

**Methods:**
- `public void clearAllCaches()`
- `public <T extends java.lang.Object> org.mockito.plugins.MockMaker$ConstructionMockControl createConstructionMock(java.lang.Class p0, java.util.function.Function p1, java.util.function.Function p2, org.mockito.MockedConstruction$MockInitializer p3)`
- `public <T extends java.lang.Object> T createMock(org.mockito.mock.MockCreationSettings p0, org.mockito.invocation.MockHandler p1)`
- `public <T extends java.lang.Object> java.lang.Class createMockType(org.mockito.mock.MockCreationSettings p0)`
- `public <T extends java.lang.Object> java.util.Optional createSpy(org.mockito.mock.MockCreationSettings p0, org.mockito.invocation.MockHandler p1, T p2)`
- `public <T extends java.lang.Object> org.mockito.plugins.MockMaker$StaticMockControl createStaticMock(java.lang.Class p0, org.mockito.mock.MockCreationSettings p1, org.mockito.invocation.MockHandler p2)`
- `public org.mockito.invocation.MockHandler getHandler(java.lang.Object p0)`
- `public org.mockito.plugins.MockMaker$TypeMockability isTypeMockable(java.lang.Class p0)`
- `public void resetMock(java.lang.Object p0, org.mockito.invocation.MockHandler p1, org.mockito.mock.MockCreationSettings p2)`

---

## public abstract interface `org.mockito.internal.creation.bytebuddy.BytecodeGenerator`

**Methods:**
- `public default void clearAllCaches()`
- `public static net.bytebuddy.matcher.ElementMatcher isGroovyMethod(boolean p0)`
- `public abstract <T extends java.lang.Object> java.lang.Class mockClass(org.mockito.internal.creation.bytebuddy.MockFeatures p0)`
- `public abstract void mockClassConstruction(java.lang.Class p0)`
- `public abstract void mockClassStatic(java.lang.Class p0)`

---

## public abstract interface `org.mockito.internal.creation.bytebuddy.ConstructionCallback`

**Methods:**
- `public abstract java.lang.Object apply(java.lang.Class p0, java.lang.Object p1, java.lang.Object[] p2, java.lang.String[] p3)`

---

## public class `org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker`
implements `org.mockito.creation.instance.Instantiator`, `org.mockito.internal.creation.bytebuddy.ClassCreatingMockMaker`, `org.mockito.plugins.InlineMockMaker`  

**Constructors:**
- `public InlineByteBuddyMockMaker()`

**Methods:**
- `public void clearAllCaches()`
- `public void clearAllMocks()`
- `public void clearMock(java.lang.Object p0)`
- `public <T extends java.lang.Object> org.mockito.plugins.MockMaker$ConstructionMockControl createConstructionMock(java.lang.Class p0, java.util.function.Function p1, java.util.function.Function p2, org.mockito.MockedConstruction$MockInitializer p3)`
- `public <T extends java.lang.Object> T createMock(org.mockito.mock.MockCreationSettings p0, org.mockito.invocation.MockHandler p1)`
- `public <T extends java.lang.Object> java.lang.Class createMockType(org.mockito.mock.MockCreationSettings p0)`
- `public <T extends java.lang.Object> java.util.Optional createSpy(org.mockito.mock.MockCreationSettings p0, org.mockito.invocation.MockHandler p1, T p2)`
- `public <T extends java.lang.Object> org.mockito.plugins.MockMaker$StaticMockControl createStaticMock(java.lang.Class p0, org.mockito.mock.MockCreationSettings p1, org.mockito.invocation.MockHandler p2)`
- `public org.mockito.invocation.MockHandler getHandler(java.lang.Object p0)`
- `public org.mockito.plugins.MockMaker$TypeMockability isTypeMockable(java.lang.Class p0)`
- `public <T extends java.lang.Object> T newInstance(java.lang.Class p0)`
- `public void resetMock(java.lang.Object p0, org.mockito.invocation.MockHandler p1, org.mockito.mock.MockCreationSettings p2)`

---

## public class `org.mockito.internal.creation.bytebuddy.InlineBytecodeGenerator`
annotations: @org.mockito.internal.SuppressSignatureCheck  
implements `java.lang.instrument.ClassFileTransformer`, `org.mockito.internal.creation.bytebuddy.BytecodeGenerator`  

**Constructors:**
- `public InlineBytecodeGenerator(java.lang.instrument.Instrumentation p0, org.mockito.internal.util.concurrent.WeakConcurrentMap p1, org.mockito.internal.util.concurrent.DetachedThreadLocal p2, java.util.function.Predicate p3, org.mockito.internal.creation.bytebuddy.ConstructionCallback p4)`

**Methods:**
- `public synchronized void clearAllCaches()`
- `public <T extends java.lang.Object> java.lang.Class mockClass(org.mockito.internal.creation.bytebuddy.MockFeatures p0)`
- `public synchronized void mockClassConstruction(java.lang.Class p0)`
- `public synchronized void mockClassStatic(java.lang.Class p0)`
- `public byte[] transform(java.lang.ClassLoader p0, java.lang.String p1, java.lang.Class p2, java.security.ProtectionDomain p3, byte[] p4)`

---

## public abstract interface `org.mockito.internal.creation.bytebuddy.MockAccess`

**Methods:**
- `public abstract org.mockito.internal.creation.bytebuddy.MockMethodInterceptor getMockitoInterceptor()`
- `public abstract void setMockitoInterceptor(org.mockito.internal.creation.bytebuddy.MockMethodInterceptor p0)`

---

## public class `org.mockito.internal.creation.bytebuddy.MockMethodAdvice`
extends `org.mockito.internal.creation.bytebuddy.inject.MockMethodDispatcher`  

**Constructors:**
- `public MockMethodAdvice(org.mockito.internal.util.concurrent.WeakConcurrentMap p0, org.mockito.internal.util.concurrent.DetachedThreadLocal p1, java.lang.String p2, java.util.function.Predicate p3, org.mockito.internal.creation.bytebuddy.ConstructionCallback p4)`

**Methods:**
- `public java.util.concurrent.Callable handle(java.lang.Object p0, java.lang.reflect.Method p1, java.lang.Object[] p2) throws java.lang.Throwable`
- `public java.lang.Object handleConstruction(java.lang.Class p0, java.lang.Object p1, java.lang.Object[] p2, java.lang.String[] p3)`
- `public java.util.concurrent.Callable handleStatic(java.lang.Class p0, java.lang.reflect.Method p1, java.lang.Object[] p2) throws java.lang.Throwable`
- `public boolean isConstructorMock(java.lang.Class p0)`
- `public boolean isMock(java.lang.Object p0)`
- `public boolean isMocked(java.lang.Object p0)`
- `public boolean isMockedStatic(java.lang.Class p0)`
- `public boolean isOverridden(java.lang.Object p0, java.lang.reflect.Method p1)`

---

## public static class `org.mockito.internal.creation.bytebuddy.MockMethodAdvice$ForReadObject`

**Constructors:**
- `public ForReadObject()`

**Methods:**
- `public static void doReadObject(java.lang.String p0, org.mockito.internal.creation.bytebuddy.MockAccess p1, java.io.ObjectInputStream p2) throws java.io.IOException, java.lang.ClassNotFoundException`

---

## public class `org.mockito.internal.creation.bytebuddy.MockMethodInterceptor`
implements `java.io.Serializable`  

**Constructors:**
- `public MockMethodInterceptor(org.mockito.invocation.MockHandler p0, org.mockito.mock.MockCreationSettings p1)`

**Methods:**
- `public org.mockito.invocation.MockHandler getMockHandler()`
- `public org.mockito.internal.creation.bytebuddy.ByteBuddyCrossClassLoaderSerializationSupport getSerializationSupport()`

---

## public static class `org.mockito.internal.creation.bytebuddy.MockMethodInterceptor$DispatcherDefaultingToRealMethod`

**Constructors:**
- `public DispatcherDefaultingToRealMethod()`

**Methods:**
- `public static java.lang.Object interceptAbstract(java.lang.Object p0, org.mockito.internal.creation.bytebuddy.MockMethodInterceptor p1, java.lang.Object p2, java.lang.reflect.Method p3, java.lang.Object[] p4) throws java.lang.Throwable`
- `public static java.lang.Object interceptSuperCallable(java.lang.Object p0, org.mockito.internal.creation.bytebuddy.MockMethodInterceptor p1, java.lang.reflect.Method p2, java.lang.Object[] p3, java.util.concurrent.Callable p4) throws java.lang.Throwable`

---

## public static class `org.mockito.internal.creation.bytebuddy.MockMethodInterceptor$ForEquals`

**Constructors:**
- `public ForEquals()`

**Methods:**
- `public static boolean doIdentityEquals(java.lang.Object p0, java.lang.Object p1)`

---

## public final static class `org.mockito.internal.creation.bytebuddy.MockMethodInterceptor$ForHashCode`

**Methods:**
- `public static int doIdentityHashCode(java.lang.Object p0)`

---

## public final static class `org.mockito.internal.creation.bytebuddy.MockMethodInterceptor$ForWriteReplace`

**Methods:**
- `public static java.lang.Object doWriteReplace(org.mockito.internal.creation.bytebuddy.MockAccess p0) throws java.io.ObjectStreamException`

---

## public class `org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker`
implements `org.mockito.internal.creation.bytebuddy.ClassCreatingMockMaker`  

**Constructors:**
- `public SubclassByteBuddyMockMaker()`
- `public SubclassByteBuddyMockMaker(org.mockito.internal.creation.bytebuddy.SubclassLoader p0)`

**Methods:**
- `public void clearAllCaches()`
- `public <T extends java.lang.Object> T createMock(org.mockito.mock.MockCreationSettings p0, org.mockito.invocation.MockHandler p1)`
- `public <T extends java.lang.Object> java.lang.Class createMockType(org.mockito.mock.MockCreationSettings p0)`
- `public org.mockito.invocation.MockHandler getHandler(java.lang.Object p0)`
- `public org.mockito.plugins.MockMaker$TypeMockability isTypeMockable(java.lang.Class p0)`
- `public void resetMock(java.lang.Object p0, org.mockito.invocation.MockHandler p1, org.mockito.mock.MockCreationSettings p2)`

---

## public abstract interface `org.mockito.internal.creation.bytebuddy.SubclassLoader`

**Methods:**
- `public abstract boolean isDisrespectingOpenness()`
- `public abstract net.bytebuddy.dynamic.loading.ClassLoadingStrategy resolveStrategy(java.lang.Class p0, java.lang.ClassLoader p1, boolean p2)`

---

## public class `org.mockito.internal.creation.instance.ConstructorInstantiator`
implements `org.mockito.creation.instance.Instantiator`  

**Constructors:**
- `public ConstructorInstantiator(boolean p0, java.lang.Object... p1)`

**Methods:**
- `public <T extends java.lang.Object> T newInstance(java.lang.Class p0)`

---

## public class `org.mockito.internal.creation.instance.DefaultInstantiatorProvider`
implements `org.mockito.plugins.InstantiatorProvider2`  

**Constructors:**
- `public DefaultInstantiatorProvider()`

**Methods:**
- `public org.mockito.creation.instance.Instantiator getInstantiator(org.mockito.mock.MockCreationSettings p0)`

---

## public class `org.mockito.internal.creation.proxy.ProxyMockMaker`
implements `org.mockito.plugins.MockMaker`  

**Constructors:**
- `public ProxyMockMaker()`

**Methods:**
- `public <T extends java.lang.Object> T createMock(org.mockito.mock.MockCreationSettings p0, org.mockito.invocation.MockHandler p1)`
- `public org.mockito.invocation.MockHandler getHandler(java.lang.Object p0)`
- `public org.mockito.plugins.MockMaker$TypeMockability isTypeMockable(java.lang.Class p0)`
- `public void resetMock(java.lang.Object p0, org.mockito.invocation.MockHandler p1, org.mockito.mock.MockCreationSettings p2)`

---

## public class `org.mockito.internal.creation.settings.CreationSettings`<T extends java.lang.Object>
implements `java.io.Serializable`, `org.mockito.mock.MockCreationSettings<T>`  

**Constructors:**
- `public CreationSettings()`
- `public CreationSettings(org.mockito.internal.creation.settings.CreationSettings p0)`

**Fields:**
- `protected org.mockito.stubbing.Answer defaultAnswer`
- `protected java.util.Set extraInterfaces`
- `protected java.util.List invocationListeners`
- `protected java.lang.String mockMaker`
- `protected org.mockito.mock.MockName mockName`
- `protected java.lang.String name`
- `protected org.mockito.mock.SerializableMode serializableMode`
- `protected java.lang.Object spiedInstance`
- `protected org.mockito.quality.Strictness strictness`
- `protected boolean stripAnnotations`
- `protected boolean stubOnly`
- `protected java.util.List stubbingLookupListeners`
- `protected java.lang.Class typeToMock`
- `protected java.util.List verificationStartedListeners`

**Methods:**
- `public java.lang.Object[] getConstructorArgs()`
- `public org.mockito.stubbing.Answer getDefaultAnswer()`
- `public java.util.Set getExtraInterfaces()`
- `public java.util.List getInvocationListeners()`
- `public java.lang.String getMockMaker()`
- `public org.mockito.mock.MockName getMockName()`
- `public java.lang.String getName()`
- `public java.lang.Object getOuterClassInstance()`
- `public org.mockito.mock.SerializableMode getSerializableMode()`
- `public java.lang.Object getSpiedInstance()`
- `public org.mockito.quality.Strictness getStrictness()`
- `public java.util.List getStubbingLookupListeners()`
- `public java.lang.Class getTypeToMock()`
- `public java.util.List getVerificationStartedListeners()`
- `public boolean isLenient()`
- `public boolean isSerializable()`
- `public boolean isStripAnnotations()`
- `public boolean isStubOnly()`
- `public boolean isUsingConstructor()`
- `public org.mockito.internal.creation.settings.CreationSettings setExtraInterfaces(java.util.Set p0)`
- `public org.mockito.internal.creation.settings.CreationSettings setMockName(org.mockito.mock.MockName p0)`
- `public org.mockito.internal.creation.settings.CreationSettings setSerializableMode(org.mockito.mock.SerializableMode p0)`
- `public org.mockito.internal.creation.settings.CreationSettings setTypeToMock(java.lang.Class p0)`

---

## public abstract interface `org.mockito.internal.creation.util.MockitoMethodProxy`

**Methods:**
- `public abstract java.lang.Object invokeSuper(java.lang.Object p0, java.lang.Object[] p1)`

---

## public abstract interface `org.mockito.internal.debugging.FindingsListener`

**Methods:**
- `public abstract void foundStubCalledWithDifferentArgs(org.mockito.invocation.Invocation p0, org.mockito.internal.invocation.InvocationMatcher p1)`
- `public abstract void foundUnstubbed(org.mockito.internal.invocation.InvocationMatcher p0)`
- `public abstract void foundUnusedStub(org.mockito.invocation.Invocation p0)`

---

## public class `org.mockito.internal.debugging.InvocationsPrinter`

**Constructors:**
- `public InvocationsPrinter()`

**Methods:**
- `public java.lang.String printInvocations(java.lang.Object p0)`

---

## public class `org.mockito.internal.debugging.Localized`<T extends java.lang.Object>

**Constructors:**
- `public Localized(T p0)`

**Methods:**
- `public org.mockito.invocation.Location getLocation()`
- `public T getObject()`

---

## public final class `org.mockito.internal.debugging.LocationFactory`

**Methods:**
- `public static org.mockito.invocation.Location create()`
- `public static org.mockito.invocation.Location create(boolean p0)`

---

## public class `org.mockito.internal.debugging.LoggingListener`
implements `org.mockito.internal.debugging.FindingsListener`  

**Constructors:**
- `public LoggingListener(boolean p0)`

**Methods:**
- `public void foundStubCalledWithDifferentArgs(org.mockito.invocation.Invocation p0, org.mockito.internal.invocation.InvocationMatcher p1)`
- `public void foundUnstubbed(org.mockito.internal.invocation.InvocationMatcher p0)`
- `public void foundUnusedStub(org.mockito.invocation.Invocation p0)`
- `public java.lang.String getStubbingInfo()`

---

## public class `org.mockito.internal.debugging.VerboseMockInvocationLogger`
implements `org.mockito.listeners.InvocationListener`  

**Constructors:**
- `public VerboseMockInvocationLogger()`
- `public VerboseMockInvocationLogger(java.io.PrintStream p0)`

**Methods:**
- `public void reportInvocation(org.mockito.listeners.MethodInvocationReport p0)`

---

## public class `org.mockito.internal.debugging.WarningsFinder`

**Constructors:**
- `public WarningsFinder(java.util.List p0, java.util.List p1)`

**Methods:**
- `public void find(org.mockito.internal.debugging.FindingsListener p0)`

---

## public class `org.mockito.internal.debugging.WarningsPrinterImpl`

**Constructors:**
- `public WarningsPrinterImpl(java.util.List p0, java.util.List p1, boolean p2)`

**Methods:**
- `public java.lang.String print()`

---

## public class `org.mockito.internal.exceptions.ExceptionIncludingMockitoWarnings`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public ExceptionIncludingMockitoWarnings(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `org.mockito.internal.exceptions.Reporter`

**Methods:**
- `public static java.lang.AssertionError argumentsAreDifferent(org.mockito.invocation.Invocation p0, org.mockito.invocation.MatchableInvocation p1, java.lang.String p2, java.util.List p3, java.util.List p4)`
- `public static org.mockito.exceptions.base.MockitoException atMostAndNeverShouldNotBeUsedWithTimeout()`
- `public static org.mockito.exceptions.base.MockitoException cannotCallAbstractRealMethod()`
- `public static org.mockito.exceptions.base.MockitoException cannotCreateTimerWithNegativeDurationTime(long p0)`
- `public static org.mockito.exceptions.base.MockitoException cannotInitializeForInjectMocksAnnotation(java.lang.String p0, java.lang.String p1)`
- `public static org.mockito.exceptions.base.MockitoException cannotInitializeForSpyAnnotation(java.lang.String p0, java.lang.Exception p1)`
- `public static org.mockito.exceptions.base.MockitoException cannotInjectDependency(java.lang.reflect.Field p0, java.lang.Object p1, java.lang.Exception p2)`
- `public static org.mockito.exceptions.base.MockitoException cannotMockClass(java.lang.Class p0, java.lang.String p1)`
- `public static org.mockito.exceptions.base.MockitoException cannotStubVoidMethodWithAReturnValue(java.lang.String p0)`
- `public static org.mockito.exceptions.base.MockitoException cannotStubWithNullThrowable()`
- `public static org.mockito.exceptions.base.MockitoException cannotVerifyToString()`
- `public static org.mockito.exceptions.base.MockitoException checkedExceptionInvalid(java.lang.Throwable p0)`
- `public static org.mockito.exceptions.base.MockitoException defaultAnswerDoesNotAcceptNullParameter()`
- `public static org.mockito.exceptions.base.MockitoException delegatedMethodDoesNotExistOnDelegate(java.lang.reflect.Method p0, java.lang.Object p1, java.lang.Object p2)`
- `public static org.mockito.exceptions.base.MockitoException delegatedMethodHasWrongReturnType(java.lang.reflect.Method p0, java.lang.reflect.Method p1, java.lang.Object p2, java.lang.Object p3)`
- `public static org.mockito.exceptions.base.MockitoException extraInterfacesAcceptsOnlyInterfaces(java.lang.Class p0)`
- `public static org.mockito.exceptions.base.MockitoException extraInterfacesCannotContainMockedType(java.lang.Class p0)`
- `public static org.mockito.exceptions.base.MockitoException extraInterfacesDoesNotAcceptNullParameters()`
- `public static org.mockito.exceptions.base.MockitoException extraInterfacesRequiresAtLeastOneInterface()`
- `public static org.mockito.exceptions.base.MockitoException fieldInitialisationThrewException(java.lang.reflect.Field p0, java.lang.Throwable p1)`
- `public static org.mockito.exceptions.misusing.UnnecessaryStubbingException formatUnncessaryStubbingException(java.lang.Class p0, java.util.Collection p1)`
- `public static org.mockito.exceptions.base.MockitoException inOrderRequiresFamiliarMock()`
- `public static org.mockito.exceptions.base.MockitoException incorrectUseOfAdditionalMatchers(java.lang.String p0, int p1, java.util.Collection p2)`
- `public static org.mockito.exceptions.base.MockitoException incorrectUseOfApi()`
- `public static org.mockito.exceptions.base.MockitoException inlineClassWithoutUnboxImpl(java.lang.Class p0, java.lang.Exception p1)`
- `public static org.mockito.exceptions.base.MockitoException invalidArgumentPositionRangeAtInvocationTime(org.mockito.invocation.InvocationOnMock p0, boolean p1, int p2)`
- `public static org.mockito.exceptions.base.MockitoException invalidArgumentRangeAtIdentityAnswerCreationTime()`
- `public static org.mockito.exceptions.base.MockitoException invalidUseOfMatchers(int p0, java.util.List p1)`
- `public static org.mockito.exceptions.base.MockitoException invocationListenerThrewException(org.mockito.listeners.InvocationListener p0, java.lang.Throwable p1)`
- `public static org.mockito.exceptions.base.MockitoException methodDoesNotAcceptParameter(java.lang.String p0, java.lang.String p1)`
- `public static org.mockito.exceptions.base.MockitoException misplacedArgumentMatcher(java.util.List p0)`
- `public static void missingByteBuddyDependency(java.lang.Throwable p0)`
- `public static org.mockito.exceptions.base.MockitoException missingMethodInvocation()`
- `public static org.mockito.exceptions.base.MockitoException mockedTypeIsInconsistentWithDelegatedInstanceType(java.lang.Class p0, java.lang.Object p1)`
- `public static org.mockito.exceptions.base.MockitoException mockedTypeIsInconsistentWithSpiedInstanceType(java.lang.Class p0, java.lang.Object p1)`
- `public static org.mockito.exceptions.base.MockitoException mocksHaveToBePassedToVerifyNoMoreInteractions()`
- `public static org.mockito.exceptions.base.MockitoException mocksHaveToBePassedWhenCreatingInOrder()`
- `public static org.mockito.exceptions.base.MockitoException moreThanOneAnnotationNotAllowed(java.lang.String p0)`
- `public static org.mockito.exceptions.base.MockitoAssertionError neverWantedButInvoked(org.mockito.invocation.DescribedInvocation p0, java.util.List p1)`
- `public static org.mockito.exceptions.base.MockitoException noArgumentValueWasCaptured()`
- `public static org.mockito.exceptions.base.MockitoAssertionError noInteractionsWanted(java.lang.Object p0, java.util.List p1)`
- `public static org.mockito.exceptions.base.MockitoAssertionError noMoreInteractionsWanted(org.mockito.invocation.Invocation p0, java.util.List p1)`
- `public static org.mockito.exceptions.base.MockitoAssertionError noMoreInteractionsWantedInOrder(org.mockito.invocation.Invocation p0)`
- `public static org.mockito.exceptions.base.MockitoException notAMockPassedToVerify(java.lang.Class p0)`
- `public static org.mockito.exceptions.base.MockitoException notAMockPassedToVerifyNoMoreInteractions()`
- `public static org.mockito.exceptions.base.MockitoException notAMockPassedToWhenMethod()`
- `public static org.mockito.exceptions.base.MockitoException notAMockPassedWhenCreatingInOrder()`
- `public static org.mockito.exceptions.base.MockitoException notAnException()`
- `public static org.mockito.exceptions.base.MockitoException nullPassedToVerify()`
- `public static org.mockito.exceptions.base.MockitoException nullPassedToVerifyNoMoreInteractions()`
- `public static org.mockito.exceptions.base.MockitoException nullPassedToWhenMethod()`
- `public static org.mockito.exceptions.base.MockitoException nullPassedWhenCreatingInOrder()`
- `public static org.mockito.exceptions.base.MockitoException onlyVoidMethodsCanBeSetToDoNothing()`
- `public static void potentialStubbingProblem(org.mockito.invocation.Invocation p0, java.util.Collection p1)`
- `public static void redundantMockitoListener(java.lang.String p0)`
- `public static org.mockito.exceptions.base.MockitoException reportNoSubMatchersFound(java.lang.String p0)`
- `public static org.mockito.exceptions.base.MockitoException requiresAtLeastOneListener(java.lang.String p0)`
- `public static org.mockito.exceptions.base.MockitoException serializableWontWorkForObjectsThatDontImplementSerializable(java.lang.Class p0)`
- `public static org.mockito.exceptions.base.MockitoException smartNullPointerException(java.lang.String p0, org.mockito.invocation.Location p1)`
- `public static org.mockito.exceptions.base.MockitoException spyAndDelegateAreMutuallyExclusive()`
- `public static org.mockito.exceptions.base.MockitoException strictnessDoesNotAcceptNullParameter()`
- `public static org.mockito.exceptions.base.MockitoException stubPassedToVerify(java.lang.Object p0)`
- `public static org.mockito.exceptions.base.MockitoAssertionError tooFewActualInvocations(org.mockito.internal.reporting.Discrepancy p0, org.mockito.invocation.DescribedInvocation p1, java.util.List p2)`
- `public static org.mockito.exceptions.base.MockitoAssertionError tooFewActualInvocationsInOrder(org.mockito.internal.reporting.Discrepancy p0, org.mockito.invocation.DescribedInvocation p1, java.util.List p2)`
- `public static org.mockito.exceptions.base.MockitoAssertionError tooManyActualInvocations(int p0, int p1, org.mockito.invocation.DescribedInvocation p2, java.util.List p3)`
- `public static org.mockito.exceptions.base.MockitoAssertionError tooManyActualInvocationsInOrder(int p0, int p1, org.mockito.invocation.DescribedInvocation p2, java.util.List p3)`
- `public static void unfinishedMockingSession()`
- `public static org.mockito.exceptions.base.MockitoException unfinishedStubbing(org.mockito.invocation.Location p0)`
- `public static org.mockito.exceptions.base.MockitoException unfinishedVerificationException(org.mockito.invocation.Location p0)`
- `public static void unncessaryStubbingException(java.util.List p0)`
- `public static org.mockito.exceptions.base.MockitoException unsupportedCombinationOfAnnotations(java.lang.String p0, java.lang.String p1)`
- `public static org.mockito.exceptions.base.MockitoException usingConstructorWithFancySerializable(org.mockito.mock.SerializableMode p0)`
- `public static org.mockito.exceptions.verification.MoreThanAllowedActualInvocations wantedAtMostX(int p0, int p1)`
- `public static org.mockito.exceptions.base.MockitoAssertionError wantedButNotInvoked(org.mockito.invocation.DescribedInvocation p0)`
- `public static org.mockito.exceptions.base.MockitoAssertionError wantedButNotInvoked(org.mockito.invocation.DescribedInvocation p0, java.util.List p1)`
- `public static org.mockito.exceptions.base.MockitoAssertionError wantedButNotInvokedInOrder(org.mockito.invocation.DescribedInvocation p0, org.mockito.invocation.DescribedInvocation p1)`
- `public static org.mockito.exceptions.base.MockitoException wrongTypeOfArgumentToReturn(org.mockito.invocation.InvocationOnMock p0, java.lang.String p1, java.lang.Class p2, int p3)`
- `public static org.mockito.exceptions.base.MockitoException wrongTypeOfReturnValue(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public static org.mockito.exceptions.base.MockitoException wrongTypeReturnedByDefaultAnswer(java.lang.Object p0, java.lang.String p1, java.lang.String p2, java.lang.String p3)`

---

## public abstract interface `org.mockito.internal.exceptions.VerificationAwareInvocation`
implements `org.mockito.invocation.DescribedInvocation`  

**Methods:**
- `public abstract boolean isVerified()`

---

## public class `org.mockito.internal.exceptions.stacktrace.ConditionalStackTraceFilter`
implements `java.io.Serializable`  

**Constructors:**
- `public ConditionalStackTraceFilter()`

**Methods:**
- `public void filter(java.lang.Throwable p0)`

---

## public class `org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleaner`
implements `org.mockito.exceptions.stacktrace.StackTraceCleaner`  

**Constructors:**
- `public DefaultStackTraceCleaner()`

**Methods:**
- `public boolean isIn(java.lang.StackTraceElement p0)`
- `public boolean isIn(org.mockito.exceptions.stacktrace.StackTraceCleaner$StackFrameMetadata p0)`

---

## public class `org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleanerProvider`
implements `org.mockito.plugins.StackTraceCleanerProvider`  

**Constructors:**
- `public DefaultStackTraceCleanerProvider()`

**Methods:**
- `public org.mockito.exceptions.stacktrace.StackTraceCleaner getStackTraceCleaner(org.mockito.exceptions.stacktrace.StackTraceCleaner p0)`

---

## public class `org.mockito.internal.exceptions.stacktrace.StackTraceFilter`
implements `java.io.Serializable`  

**Constructors:**
- `public StackTraceFilter()`

**Methods:**
- `public java.lang.StackTraceElement[] filter(java.lang.StackTraceElement[] p0, boolean p1)`
- `public java.lang.StackTraceElement filterFirst(java.lang.Throwable p0, boolean p1)`
- `public java.lang.String findSourceFile(java.lang.StackTraceElement[] p0, java.lang.String p1)`

---

## public class `org.mockito.internal.exceptions.util.ScenarioPrinter`

**Constructors:**
- `public ScenarioPrinter()`

**Methods:**
- `public java.lang.String print(java.util.List p0)`

---

## public class `org.mockito.internal.framework.DefaultMockitoFramework`
implements `org.mockito.MockitoFramework`  

**Constructors:**
- `public DefaultMockitoFramework()`

**Methods:**
- `public org.mockito.MockitoFramework addListener(org.mockito.listeners.MockitoListener p0)`
- `public void clearInlineMock(java.lang.Object p0)`
- `public void clearInlineMocks()`
- `public org.mockito.invocation.InvocationFactory getInvocationFactory()`
- `public org.mockito.plugins.MockitoPlugins getPlugins()`
- `public org.mockito.MockitoFramework removeListener(org.mockito.listeners.MockitoListener p0)`

---

## public class `org.mockito.internal.framework.DefaultMockitoSession`
implements `org.mockito.MockitoSession`  

**Constructors:**
- `public DefaultMockitoSession(java.util.List p0, java.lang.String p1, org.mockito.quality.Strictness p2, org.mockito.plugins.MockitoLogger p3)`

**Methods:**
- `public void finishMocking()`
- `public void finishMocking(java.lang.Throwable p0)`
- `public void setStrictness(org.mockito.quality.Strictness p0)`

---

## public class `org.mockito.internal.hamcrest.HamcrestArgumentMatcher`<T extends java.lang.Object>
implements `org.mockito.ArgumentMatcher<T>`  

**Constructors:**
- `public HamcrestArgumentMatcher(org.hamcrest.Matcher p0)`
- `public HamcrestArgumentMatcher(org.hamcrest.Matcher p0, java.lang.Class p1)`

**Methods:**
- `public boolean matches(java.lang.Object p0)`
- `public java.lang.String toString()`
- `public java.lang.Class type()`

---

## public final class `org.mockito.internal.hamcrest.MatcherGenericTypeExtractor`

**Methods:**
- `public static java.lang.Class genericTypeOfMatcher(java.lang.Class p0)`

---

## public final class `org.mockito.internal.handler.MockHandlerFactory`

**Methods:**
- `public static <T extends java.lang.Object> org.mockito.invocation.MockHandler createMockHandler(org.mockito.mock.MockCreationSettings p0)`

---

## public class `org.mockito.internal.handler.MockHandlerImpl`<T extends java.lang.Object>
implements `org.mockito.invocation.MockHandler<T>`  

**Constructors:**
- `public MockHandlerImpl(org.mockito.mock.MockCreationSettings p0)`

**Methods:**
- `public org.mockito.invocation.InvocationContainer getInvocationContainer()`
- `public org.mockito.mock.MockCreationSettings getMockSettings()`
- `public java.lang.Object handle(org.mockito.invocation.Invocation p0) throws java.lang.Throwable`

---

## public class `org.mockito.internal.handler.NotifiedMethodInvocationReport`
implements `org.mockito.listeners.MethodInvocationReport`  

**Constructors:**
- `public NotifiedMethodInvocationReport(org.mockito.invocation.Invocation p0, java.lang.Object p1)`
- `public NotifiedMethodInvocationReport(org.mockito.invocation.Invocation p0, java.lang.Throwable p1)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public org.mockito.invocation.DescribedInvocation getInvocation()`
- `public java.lang.String getLocationOfStubbing()`
- `public java.lang.Object getReturnedValue()`
- `public java.lang.Throwable getThrowable()`
- `public int hashCode()`
- `public boolean threwException()`

---

## public abstract interface `org.mockito.internal.invocation.AbstractAwareMethod`

**Methods:**
- `public abstract boolean isAbstract()`

---

## public abstract interface `org.mockito.internal.invocation.ArgumentMatcherAction`

**Methods:**
- `public abstract boolean apply(org.mockito.ArgumentMatcher p0, java.lang.Object p1)`

---

## public final class `org.mockito.internal.invocation.ArgumentsProcessor`

**Methods:**
- `public static java.util.List argumentsToMatchers(java.lang.Object[] p0)`
- `public static java.lang.Object[] expandArgs(org.mockito.internal.invocation.MockitoMethod p0, java.lang.Object[] p1)`

---

## public class `org.mockito.internal.invocation.DefaultInvocationFactory`
implements `org.mockito.invocation.InvocationFactory`  

**Constructors:**
- `public DefaultInvocationFactory()`

**Methods:**
- `public static org.mockito.internal.invocation.InterceptedInvocation createInvocation(java.lang.Object p0, java.lang.reflect.Method p1, java.lang.Object[] p2, org.mockito.internal.invocation.RealMethod p3, org.mockito.mock.MockCreationSettings p4, org.mockito.invocation.Location p5)`
- `public org.mockito.invocation.Invocation createInvocation(java.lang.Object p0, org.mockito.mock.MockCreationSettings p1, java.lang.reflect.Method p2, java.util.concurrent.Callable p3, java.lang.Object... p4)`
- `public org.mockito.invocation.Invocation createInvocation(java.lang.Object p0, org.mockito.mock.MockCreationSettings p1, java.lang.reflect.Method p2, org.mockito.invocation.InvocationFactory$RealMethodBehavior p3, java.lang.Object... p4)`

---

## public class `org.mockito.internal.invocation.InterceptedInvocation`
implements `org.mockito.internal.exceptions.VerificationAwareInvocation`, `org.mockito.invocation.Invocation`  

**Constructors:**
- `public InterceptedInvocation(org.mockito.internal.invocation.mockref.MockReference p0, org.mockito.internal.invocation.MockitoMethod p1, java.lang.Object[] p2, org.mockito.internal.invocation.RealMethod p3, org.mockito.invocation.Location p4, int p5)`

**Fields:**
- `public final static org.mockito.internal.invocation.RealMethod NO_OP`

**Methods:**
- `public java.lang.Object callRealMethod() throws java.lang.Throwable`
- `public boolean equals(java.lang.Object p0)`
- `public <T extends java.lang.Object> T getArgument(int p0)`
- `public <T extends java.lang.Object> T getArgument(int p0, java.lang.Class p1)`
- `public java.lang.Object[] getArguments()`
- `public java.util.List getArgumentsAsMatchers()`
- `public org.mockito.invocation.Location getLocation()`
- `public java.lang.reflect.Method getMethod()`
- `public java.lang.Object getMock()`
- `public org.mockito.internal.invocation.mockref.MockReference getMockRef()`
- `public org.mockito.internal.invocation.MockitoMethod getMockitoMethod()`
- `public java.lang.Object[] getRawArguments()`
- `public java.lang.Class getRawReturnType()`
- `public org.mockito.internal.invocation.RealMethod getRealMethod()`
- `public int getSequenceNumber()`
- `public int hashCode()`
- `public void ignoreForVerification()`
- `public boolean isIgnoredForVerification()`
- `public boolean isVerified()`
- `public void markStubbed(org.mockito.invocation.StubInfo p0)`
- `public void markVerified()`
- `public org.mockito.invocation.StubInfo stubInfo()`
- `public java.lang.String toString()`

---

## public class `org.mockito.internal.invocation.InvocationComparator`
implements `java.util.Comparator<org.mockito.invocation.Invocation>`  

**Constructors:**
- `public InvocationComparator()`

**Methods:**
- `public int compare(org.mockito.invocation.Invocation p0, org.mockito.invocation.Invocation p1)`

---

## public class `org.mockito.internal.invocation.InvocationMarker`

**Methods:**
- `public static void markVerified(java.util.List p0, org.mockito.invocation.MatchableInvocation p1)`
- `public static void markVerified(org.mockito.invocation.Invocation p0, org.mockito.invocation.MatchableInvocation p1)`
- `public static void markVerifiedInOrder(java.util.List p0, org.mockito.invocation.MatchableInvocation p1, org.mockito.internal.verification.api.InOrderContext p2)`

---

## public class `org.mockito.internal.invocation.InvocationMatcher`
implements `java.io.Serializable`, `org.mockito.invocation.DescribedInvocation`, `org.mockito.invocation.MatchableInvocation`  

**Constructors:**
- `public InvocationMatcher(org.mockito.invocation.Invocation p0)`
- `public InvocationMatcher(org.mockito.invocation.Invocation p0, java.util.List p1)`

**Methods:**
- `public void captureArgumentsFrom(org.mockito.invocation.Invocation p0)`
- `public static java.util.List createFrom(java.util.List p0)`
- `public org.mockito.invocation.Invocation getInvocation()`
- `public org.mockito.invocation.Location getLocation()`
- `public java.util.List getMatchers()`
- `public java.lang.reflect.Method getMethod()`
- `public boolean hasSameMethod(org.mockito.invocation.Invocation p0)`
- `public boolean hasSimilarMethod(org.mockito.invocation.Invocation p0)`
- `public boolean matches(org.mockito.invocation.Invocation p0)`
- `public java.lang.String toString()`

---

## public class `org.mockito.internal.invocation.InvocationsFinder`

**Methods:**
- `public static java.util.List findAllMatchingUnverifiedChunks(java.util.List p0, org.mockito.invocation.MatchableInvocation p1, org.mockito.internal.verification.api.InOrderContext p2)`
- `public static org.mockito.invocation.Invocation findFirstMatchingUnverifiedInvocation(java.util.List p0, org.mockito.invocation.MatchableInvocation p1, org.mockito.internal.verification.api.InOrderContext p2)`
- `public static org.mockito.invocation.Invocation findFirstUnverified(java.util.List p0)`
- `public static org.mockito.invocation.Invocation findFirstUnverifiedInOrder(org.mockito.internal.verification.api.InOrderContext p0, java.util.List p1)`
- `public static java.util.List findInvocations(java.util.List p0, org.mockito.invocation.MatchableInvocation p1)`
- `public static java.util.List findMatchingChunk(java.util.List p0, org.mockito.invocation.MatchableInvocation p1, int p2, org.mockito.internal.verification.api.InOrderContext p3)`
- `public static org.mockito.invocation.Invocation findPreviousVerifiedInOrder(java.util.List p0, org.mockito.internal.verification.api.InOrderContext p1)`
- `public static org.mockito.invocation.Invocation findSimilarInvocation(java.util.List p0, org.mockito.invocation.MatchableInvocation p1)`
- `public static java.util.List getAllLocations(java.util.List p0)`
- `public static org.mockito.invocation.Location getLastLocation(java.util.List p0)`

---

## public class `org.mockito.internal.invocation.MatcherApplicationStrategy`

**Methods:**
- `public boolean forEachMatcherAndArgument(org.mockito.internal.invocation.ArgumentMatcherAction p0)`
- `public static org.mockito.internal.invocation.MatcherApplicationStrategy getMatcherApplicationStrategyFor(org.mockito.invocation.Invocation p0, java.util.List p1)`

---

## public class `org.mockito.internal.invocation.MatchersBinder`
implements `java.io.Serializable`  

**Constructors:**
- `public MatchersBinder()`

**Methods:**
- `public org.mockito.internal.invocation.InvocationMatcher bindMatchers(org.mockito.internal.progress.ArgumentMatcherStorage p0, org.mockito.invocation.Invocation p1)`

---

## public abstract interface `org.mockito.internal.invocation.MockitoMethod`
implements `org.mockito.internal.invocation.AbstractAwareMethod`  

**Methods:**
- `public abstract java.lang.Class[] getExceptionTypes()`
- `public abstract java.lang.reflect.Method getJavaMethod()`
- `public abstract java.lang.String getName()`
- `public abstract java.lang.Class[] getParameterTypes()`
- `public abstract java.lang.Class getReturnType()`
- `public abstract boolean isVarArgs()`

---

## public abstract interface `org.mockito.internal.invocation.RealMethod`
implements `java.io.Serializable`  

**Methods:**
- `public abstract java.lang.Object invoke() throws java.lang.Throwable`
- `public abstract boolean isInvokable()`

---

## public static class `org.mockito.internal.invocation.RealMethod$FromBehavior`
implements `org.mockito.internal.invocation.RealMethod`  

**Methods:**
- `public java.lang.Object invoke() throws java.lang.Throwable`
- `public boolean isInvokable()`

---

## public static class `org.mockito.internal.invocation.RealMethod$FromCallable`
extends `org.mockito.internal.invocation.RealMethod$FromBehavior`  
implements `org.mockito.internal.invocation.RealMethod`  

**Constructors:**
- `public FromCallable(java.util.concurrent.Callable p0)`

---

## public final static enum `org.mockito.internal.invocation.RealMethod$IsIllegal`
extends `java.lang.Enum`  
implements `org.mockito.internal.invocation.RealMethod`  

**Fields:**
- `public final static org.mockito.internal.invocation.RealMethod$IsIllegal INSTANCE`

**Methods:**
- `public java.lang.Object invoke()`
- `public boolean isInvokable()`

---

## public class `org.mockito.internal.invocation.SerializableMethod`
implements `java.io.Serializable`, `org.mockito.internal.invocation.MockitoMethod`  

**Constructors:**
- `public SerializableMethod(java.lang.reflect.Method p0)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.Class[] getExceptionTypes()`
- `public java.lang.reflect.Method getJavaMethod()`
- `public java.lang.String getName()`
- `public java.lang.Class[] getParameterTypes()`
- `public java.lang.Class getReturnType()`
- `public int hashCode()`
- `public boolean isAbstract()`
- `public boolean isVarArgs()`

---

## public class `org.mockito.internal.invocation.StubInfoImpl`
implements `java.io.Serializable`, `org.mockito.invocation.StubInfo`  

**Constructors:**
- `public StubInfoImpl(org.mockito.invocation.DescribedInvocation p0)`

**Methods:**
- `public org.mockito.invocation.Location stubbedAt()`

---

## public class `org.mockito.internal.invocation.TypeSafeMatching`
implements `org.mockito.internal.invocation.ArgumentMatcherAction`  

**Methods:**
- `public boolean apply(org.mockito.ArgumentMatcher p0, java.lang.Object p1)`
- `public static org.mockito.internal.invocation.ArgumentMatcherAction matchesTypeSafe()`

---

## public class `org.mockito.internal.invocation.finder.AllInvocationsFinder`

**Methods:**
- `public static java.util.List find(java.lang.Iterable p0)`
- `public static java.util.Set findStubbings(java.lang.Iterable p0)`

---

## public class `org.mockito.internal.invocation.finder.VerifiableInvocationsFinder`

**Methods:**
- `public static java.util.List find(java.util.List p0)`

---

## public abstract interface `org.mockito.internal.invocation.mockref.MockReference`<T extends java.lang.Object>
implements `java.io.Serializable`  

**Methods:**
- `public abstract T get()`

---

## public class `org.mockito.internal.invocation.mockref.MockStrongReference`<T extends java.lang.Object>
implements `org.mockito.internal.invocation.mockref.MockReference<T>`  

**Constructors:**
- `public MockStrongReference(T p0, boolean p1)`

**Methods:**
- `public T get()`

---

## public class `org.mockito.internal.invocation.mockref.MockWeakReference`<T extends java.lang.Object>
implements `org.mockito.internal.invocation.mockref.MockReference<T>`  

**Constructors:**
- `public MockWeakReference(T p0)`

**Methods:**
- `public T get()`

---

## public class `org.mockito.internal.junit.DefaultTestFinishedEvent`
implements `org.mockito.internal.junit.TestFinishedEvent`  

**Constructors:**
- `public DefaultTestFinishedEvent(java.lang.Object p0, java.lang.String p1, java.lang.Throwable p2)`

**Methods:**
- `public java.lang.Throwable getFailure()`
- `public java.lang.String getTestName()`

---

## public class `org.mockito.internal.junit.ExceptionFactory`

**Methods:**
- `public static java.lang.AssertionError createArgumentsAreDifferentException(java.lang.String p0, java.lang.String p1, java.lang.String p2)`

---

## public final class `org.mockito.internal.junit.JUnitRule`
implements `org.mockito.junit.MockitoRule`  

**Constructors:**
- `public JUnitRule(org.mockito.plugins.MockitoLogger p0, org.mockito.quality.Strictness p1)`

**Methods:**
- `public org.junit.runners.model.Statement apply(org.junit.runners.model.Statement p0, org.junit.runners.model.FrameworkMethod p1, java.lang.Object p2)`
- `public org.mockito.junit.MockitoRule silent()`
- `public org.mockito.junit.MockitoRule strictness(org.mockito.quality.Strictness p0)`

---

## public final class `org.mockito.internal.junit.JUnitTestRule`
implements `org.mockito.junit.MockitoTestRule`  

**Constructors:**
- `public JUnitTestRule(org.mockito.plugins.MockitoLogger p0, org.mockito.quality.Strictness p1, java.lang.Object p2)`

**Methods:**
- `public org.junit.runners.model.Statement apply(org.junit.runners.model.Statement p0, org.junit.runner.Description p1)`
- `public org.mockito.junit.MockitoTestRule silent()`
- `public org.mockito.junit.MockitoTestRule strictness(org.mockito.quality.Strictness p0)`

---

## public class `org.mockito.internal.junit.MismatchReportingTestListener`
implements `org.mockito.internal.junit.MockitoTestListener`  

**Constructors:**
- `public MismatchReportingTestListener(org.mockito.plugins.MockitoLogger p0)`

**Methods:**
- `public void onMockCreated(java.lang.Object p0, org.mockito.mock.MockCreationSettings p1)`
- `public void testFinished(org.mockito.internal.junit.TestFinishedEvent p0)`

---

## public abstract interface `org.mockito.internal.junit.MockitoTestListener`
implements `org.mockito.listeners.MockCreationListener`  

**Methods:**
- `public abstract void testFinished(org.mockito.internal.junit.TestFinishedEvent p0)`

---

## public class `org.mockito.internal.junit.NoOpTestListener`
implements `org.mockito.internal.junit.MockitoTestListener`  

**Constructors:**
- `public NoOpTestListener()`

**Methods:**
- `public void onMockCreated(java.lang.Object p0, org.mockito.mock.MockCreationSettings p1)`
- `public void testFinished(org.mockito.internal.junit.TestFinishedEvent p0)`

---

## public class `org.mockito.internal.junit.StrictStubsRunnerTestListener`
implements `org.mockito.internal.junit.MockitoTestListener`  

**Constructors:**
- `public StrictStubsRunnerTestListener()`

**Methods:**
- `public void onMockCreated(java.lang.Object p0, org.mockito.mock.MockCreationSettings p1)`
- `public void testFinished(org.mockito.internal.junit.TestFinishedEvent p0)`

---

## public abstract interface `org.mockito.internal.junit.TestFinishedEvent`

**Methods:**
- `public abstract java.lang.Throwable getFailure()`
- `public abstract java.lang.String getTestName()`

---

## public class `org.mockito.internal.junit.UniversalTestListener`
implements `org.mockito.internal.junit.MockitoTestListener`, `org.mockito.internal.listeners.AutoCleanableListener`  

**Constructors:**
- `public UniversalTestListener(org.mockito.quality.Strictness p0, org.mockito.plugins.MockitoLogger p1)`

**Methods:**
- `public boolean isListenerDirty()`
- `public void onMockCreated(java.lang.Object p0, org.mockito.mock.MockCreationSettings p1)`
- `public void setListenerDirty()`
- `public void setStrictness(org.mockito.quality.Strictness p0)`
- `public void testFinished(org.mockito.internal.junit.TestFinishedEvent p0)`

---

## public class `org.mockito.internal.junit.UnnecessaryStubbingsReporter`
implements `org.mockito.listeners.MockCreationListener`  

**Constructors:**
- `public UnnecessaryStubbingsReporter()`

**Methods:**
- `public void onMockCreated(java.lang.Object p0, org.mockito.mock.MockCreationSettings p1)`
- `public void validateUnusedStubs(java.lang.Class p0, org.junit.runner.notification.RunNotifier p1)`

---

## public class `org.mockito.internal.junit.UnusedStubbings`

**Methods:**
- `public int size()`
- `public java.lang.String toString()`

---

## public class `org.mockito.internal.junit.UnusedStubbingsFinder`

**Constructors:**
- `public UnusedStubbingsFinder()`

**Methods:**
- `public org.mockito.internal.junit.UnusedStubbings getUnusedStubbings(java.lang.Iterable p0)`
- `public java.util.Collection getUnusedStubbingsByLocation(java.lang.Iterable p0)`

---

## public class `org.mockito.internal.junit.VerificationCollectorImpl`
implements `org.mockito.junit.VerificationCollector`  

**Constructors:**
- `public VerificationCollectorImpl()`

**Methods:**
- `public org.junit.runners.model.Statement apply(org.junit.runners.model.Statement p0, org.junit.runner.Description p1)`
- `public org.mockito.junit.VerificationCollector assertLazily()`
- `public void collectAndReport() throws org.mockito.exceptions.base.MockitoAssertionError`

---

## public abstract interface `org.mockito.internal.listeners.AutoCleanableListener`

**Methods:**
- `public abstract boolean isListenerDirty()`

---

## public final class `org.mockito.internal.listeners.StubbingLookupNotifier`

**Methods:**
- `public static void notifyStubbedAnswerLookup(org.mockito.invocation.Invocation p0, org.mockito.stubbing.Stubbing p1, java.util.Collection p2, org.mockito.internal.creation.settings.CreationSettings p3)`

---

## public final class `org.mockito.internal.listeners.VerificationStartedNotifier`

**Methods:**
- `public static java.lang.Object notifyVerificationStarted(java.util.List p0, org.mockito.MockingDetails p1)`

---

## public class `org.mockito.internal.matchers.And`
implements `java.io.Serializable`, `org.mockito.ArgumentMatcher<java.lang.Object>`  

**Constructors:**
- `public And(org.mockito.ArgumentMatcher p0, org.mockito.ArgumentMatcher p1)`

**Methods:**
- `public boolean matches(java.lang.Object p0)`
- `public java.lang.String toString()`
- `public java.lang.Class type()`

---

## public class `org.mockito.internal.matchers.Any`
implements `java.io.Serializable`, `org.mockito.ArgumentMatcher<java.lang.Object>`  

**Constructors:**
- `public Any()`

**Fields:**
- `public final static org.mockito.internal.matchers.Any ANY`

**Methods:**
- `public boolean matches(java.lang.Object p0)`
- `public java.lang.String toString()`
- `public java.lang.Class type()`

---

## public class `org.mockito.internal.matchers.ArrayEquals`
extends `org.mockito.internal.matchers.Equals`  

**Constructors:**
- `public ArrayEquals(java.lang.Object p0)`

**Methods:**
- `public static java.lang.Object[] createObjectArray(java.lang.Object p0)`
- `public boolean matches(java.lang.Object p0)`
- `public java.lang.String toString()`

---

## public abstract interface `org.mockito.internal.matchers.CapturesArguments`

**Methods:**
- `public abstract void captureFrom(java.lang.Object p0)`

---

## public class `org.mockito.internal.matchers.CapturingMatcher`<T extends java.lang.Object>
implements `java.io.Serializable`, `org.mockito.ArgumentMatcher<T>`, `org.mockito.internal.matchers.CapturesArguments`  

**Constructors:**
- `public CapturingMatcher(java.lang.Class p0)`

**Methods:**
- `public void captureFrom(java.lang.Object p0)`
- `public java.util.List getAllValues()`
- `public T getLastValue()`
- `public boolean matches(java.lang.Object p0)`
- `public java.lang.String toString()`
- `public java.lang.Class type()`

---

## public class `org.mockito.internal.matchers.CompareEqual`<T extends java.lang.Comparable<T>>
extends `org.mockito.internal.matchers.CompareTo`  
implements `java.io.Serializable`  

**Constructors:**
- `public CompareEqual(T p0)`

**Methods:**
- `protected java.lang.String getName()`
- `protected boolean matchResult(int p0)`

---

## public abstract class `org.mockito.internal.matchers.CompareTo`<T extends java.lang.Comparable<T>>
implements `java.io.Serializable`, `org.mockito.ArgumentMatcher<T>`  

**Constructors:**
- `public CompareTo(T p0)`

**Methods:**
- `protected abstract java.lang.String getName()`
- `protected abstract boolean matchResult(int p0)`
- `public final boolean matches(T p0)`
- `public final java.lang.String toString()`

---

## public class `org.mockito.internal.matchers.Contains`
implements `java.io.Serializable`, `org.mockito.ArgumentMatcher<java.lang.String>`  

**Constructors:**
- `public Contains(java.lang.String p0)`

**Methods:**
- `public boolean matches(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public abstract interface `org.mockito.internal.matchers.ContainsExtraTypeInfo`

**Methods:**
- `public abstract java.lang.Object getWanted()`
- `public abstract java.lang.String toStringWithType(java.lang.String p0)`
- `public abstract boolean typeMatches(java.lang.Object p0)`

---

## public class `org.mockito.internal.matchers.EndsWith`
implements `java.io.Serializable`, `org.mockito.ArgumentMatcher<java.lang.String>`  

**Constructors:**
- `public EndsWith(java.lang.String p0)`

**Methods:**
- `public boolean matches(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public final class `org.mockito.internal.matchers.Equality`

**Methods:**
- `public static boolean areEqual(java.lang.Object p0, java.lang.Object p1)`

---

## public class `org.mockito.internal.matchers.Equals`
implements `java.io.Serializable`, `org.mockito.ArgumentMatcher<java.lang.Object>`, `org.mockito.internal.matchers.ContainsExtraTypeInfo`  

**Constructors:**
- `public Equals(java.lang.Object p0)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public final java.lang.Object getWanted()`
- `public int hashCode()`
- `public boolean matches(java.lang.Object p0)`
- `public java.lang.String toString()`
- `public java.lang.String toStringWithType(java.lang.String p0)`
- `public java.lang.Class type()`
- `public boolean typeMatches(java.lang.Object p0)`

---

## public class `org.mockito.internal.matchers.EqualsWithDelta`
implements `java.io.Serializable`, `org.mockito.ArgumentMatcher<java.lang.Number>`  

**Constructors:**
- `public EqualsWithDelta(java.lang.Number p0, java.lang.Number p1)`

**Methods:**
- `public boolean matches(java.lang.Number p0)`
- `public java.lang.String toString()`

---

## public class `org.mockito.internal.matchers.Find`
implements `java.io.Serializable`, `org.mockito.ArgumentMatcher<java.lang.String>`  

**Constructors:**
- `public Find(java.lang.String p0)`

**Methods:**
- `public boolean matches(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public class `org.mockito.internal.matchers.GreaterOrEqual`<T extends java.lang.Comparable<T>>
extends `org.mockito.internal.matchers.CompareTo`  
implements `java.io.Serializable`  

**Constructors:**
- `public GreaterOrEqual(T p0)`

**Methods:**
- `protected java.lang.String getName()`
- `protected boolean matchResult(int p0)`

---

## public class `org.mockito.internal.matchers.GreaterThan`<T extends java.lang.Comparable<T>>
extends `org.mockito.internal.matchers.CompareTo`  
implements `java.io.Serializable`  

**Constructors:**
- `public GreaterThan(T p0)`

**Methods:**
- `protected java.lang.String getName()`
- `protected boolean matchResult(int p0)`

---

## public class `org.mockito.internal.matchers.InstanceOf`
implements `java.io.Serializable`, `org.mockito.ArgumentMatcher<java.lang.Object>`  

**Constructors:**
- `public InstanceOf(java.lang.Class p0)`
- `public InstanceOf(java.lang.Class p0, java.lang.String p1)`

**Methods:**
- `public boolean matches(java.lang.Object p0)`
- `public java.lang.String toString()`
- `public java.lang.Class type()`

---

## public class `org.mockito.internal.matchers.LessOrEqual`<T extends java.lang.Comparable<T>>
extends `org.mockito.internal.matchers.CompareTo`  
implements `java.io.Serializable`  

**Constructors:**
- `public LessOrEqual(T p0)`

**Methods:**
- `protected java.lang.String getName()`
- `protected boolean matchResult(int p0)`

---

## public class `org.mockito.internal.matchers.LessThan`<T extends java.lang.Comparable<T>>
extends `org.mockito.internal.matchers.CompareTo`  
implements `java.io.Serializable`  

**Constructors:**
- `public LessThan(T p0)`

**Methods:**
- `protected java.lang.String getName()`
- `protected boolean matchResult(int p0)`

---

## public class `org.mockito.internal.matchers.LocalizedMatcher`

**Constructors:**
- `public LocalizedMatcher(org.mockito.ArgumentMatcher p0)`

**Methods:**
- `public org.mockito.invocation.Location getLocation()`
- `public org.mockito.ArgumentMatcher getMatcher()`

---

## public class `org.mockito.internal.matchers.Matches`
implements `java.io.Serializable`, `org.mockito.ArgumentMatcher<java.lang.Object>`  

**Constructors:**
- `public Matches(java.lang.String p0)`
- `public Matches(java.util.regex.Pattern p0)`

**Methods:**
- `public boolean matches(java.lang.Object p0)`
- `public java.lang.String toString()`

---

## public class `org.mockito.internal.matchers.Not`
implements `java.io.Serializable`, `org.mockito.ArgumentMatcher<java.lang.Object>`  

**Constructors:**
- `public Not(org.mockito.ArgumentMatcher p0)`

**Methods:**
- `public boolean matches(java.lang.Object p0)`
- `public java.lang.String toString()`
- `public java.lang.Class type()`

---

## public class `org.mockito.internal.matchers.NotNull`<T extends java.lang.Object>
implements `java.io.Serializable`, `org.mockito.ArgumentMatcher<T>`  

**Constructors:**
- `public NotNull(java.lang.Class p0)`

**Fields:**
- `public final static org.mockito.internal.matchers.NotNull NOT_NULL`

**Methods:**
- `public boolean matches(java.lang.Object p0)`
- `public java.lang.String toString()`
- `public java.lang.Class type()`

---

## public class `org.mockito.internal.matchers.Null`<T extends java.lang.Object>
implements `java.io.Serializable`, `org.mockito.ArgumentMatcher<T>`  

**Constructors:**
- `public Null(java.lang.Class p0)`

**Fields:**
- `public final static org.mockito.internal.matchers.Null NULL`

**Methods:**
- `public boolean matches(java.lang.Object p0)`
- `public java.lang.String toString()`
- `public java.lang.Class type()`

---

## public class `org.mockito.internal.matchers.Or`
implements `java.io.Serializable`, `org.mockito.ArgumentMatcher<java.lang.Object>`  

**Constructors:**
- `public Or(org.mockito.ArgumentMatcher p0, org.mockito.ArgumentMatcher p1)`

**Methods:**
- `public boolean matches(java.lang.Object p0)`
- `public java.lang.String toString()`
- `public java.lang.Class type()`

---

## public class `org.mockito.internal.matchers.Same`
implements `java.io.Serializable`, `org.mockito.ArgumentMatcher<java.lang.Object>`  

**Constructors:**
- `public Same(java.lang.Object p0)`

**Methods:**
- `public boolean matches(java.lang.Object p0)`
- `public java.lang.String toString()`
- `public java.lang.Class type()`

---

## public class `org.mockito.internal.matchers.StartsWith`
implements `java.io.Serializable`, `org.mockito.ArgumentMatcher<java.lang.String>`  

**Constructors:**
- `public StartsWith(java.lang.String p0)`

**Methods:**
- `public boolean matches(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public class `org.mockito.internal.matchers.apachecommons.ReflectionEquals`
implements `java.io.Serializable`, `org.mockito.ArgumentMatcher<java.lang.Object>`  

**Constructors:**
- `public ReflectionEquals(java.lang.Object p0, java.lang.String... p1)`

**Methods:**
- `public boolean matches(java.lang.Object p0)`
- `public java.lang.String toString()`

---

## public class `org.mockito.internal.matchers.text.MatchersPrinter`

**Constructors:**
- `public MatchersPrinter()`

**Methods:**
- `public java.lang.String getArgumentsBlock(java.util.List p0, org.mockito.internal.reporting.PrintSettings p1)`
- `public java.lang.String getArgumentsLine(java.util.List p0, org.mockito.internal.reporting.PrintSettings p1)`

---

## public class `org.mockito.internal.matchers.text.ValuePrinter`

**Methods:**
- `public static java.lang.String print(java.lang.Object p0)`
- `public static java.lang.String printValues(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.Iterator p3)`

---

## public abstract interface `org.mockito.internal.progress.ArgumentMatcherStorage`

**Methods:**
- `public abstract java.util.List pullLocalizedMatchers()`
- `public abstract void reportAnd()`
- `public abstract void reportMatcher(org.mockito.ArgumentMatcher p0)`
- `public abstract void reportNot()`
- `public abstract void reportOr()`
- `public abstract void reset()`
- `public abstract void validateState()`

---

## public class `org.mockito.internal.progress.ArgumentMatcherStorageImpl`
implements `org.mockito.internal.progress.ArgumentMatcherStorage`  

**Constructors:**
- `public ArgumentMatcherStorageImpl()`

**Methods:**
- `public java.util.List pullLocalizedMatchers()`
- `public void reportAnd()`
- `public void reportMatcher(org.mockito.ArgumentMatcher p0)`
- `public void reportNot()`
- `public void reportOr()`
- `public void reset()`
- `public void validateState()`

---

## public abstract interface `org.mockito.internal.progress.MockingProgress`

**Methods:**
- `public abstract void addListener(org.mockito.listeners.MockitoListener p0)`
- `public abstract void clearListeners()`
- `public abstract org.mockito.internal.progress.ArgumentMatcherStorage getArgumentMatcherStorage()`
- `public abstract org.mockito.verification.VerificationMode maybeVerifyLazily(org.mockito.verification.VerificationMode p0)`
- `public abstract void mockingStarted(java.lang.Class p0, org.mockito.mock.MockCreationSettings p1)`
- `public abstract void mockingStarted(java.lang.Object p0, org.mockito.mock.MockCreationSettings p1)`
- `public abstract org.mockito.stubbing.OngoingStubbing pullOngoingStubbing()`
- `public abstract org.mockito.verification.VerificationMode pullVerificationMode()`
- `public abstract void removeListener(org.mockito.listeners.MockitoListener p0)`
- `public abstract void reportOngoingStubbing(org.mockito.stubbing.OngoingStubbing p0)`
- `public abstract void reset()`
- `public abstract void resetOngoingStubbing()`
- `public abstract void setVerificationStrategy(org.mockito.verification.VerificationStrategy p0)`
- `public abstract void stubbingCompleted()`
- `public abstract void stubbingStarted()`
- `public abstract void validateState()`
- `public abstract java.util.Set verificationListeners()`
- `public abstract void verificationStarted(org.mockito.verification.VerificationMode p0)`

---

## public class `org.mockito.internal.progress.MockingProgressImpl`
implements `org.mockito.internal.progress.MockingProgress`  

**Constructors:**
- `public MockingProgressImpl()`

**Methods:**
- `public void addListener(org.mockito.listeners.MockitoListener p0)`
- `public void clearListeners()`
- `public org.mockito.internal.progress.ArgumentMatcherStorage getArgumentMatcherStorage()`
- `public static org.mockito.verification.VerificationStrategy getDefaultVerificationStrategy()`
- `public org.mockito.verification.VerificationMode maybeVerifyLazily(org.mockito.verification.VerificationMode p0)`
- `public void mockingStarted(java.lang.Class p0, org.mockito.mock.MockCreationSettings p1)`
- `public void mockingStarted(java.lang.Object p0, org.mockito.mock.MockCreationSettings p1)`
- `public org.mockito.stubbing.OngoingStubbing pullOngoingStubbing()`
- `public org.mockito.verification.VerificationMode pullVerificationMode()`
- `public void removeListener(org.mockito.listeners.MockitoListener p0)`
- `public void reportOngoingStubbing(org.mockito.stubbing.OngoingStubbing p0)`
- `public void reset()`
- `public void resetOngoingStubbing()`
- `public void setVerificationStrategy(org.mockito.verification.VerificationStrategy p0)`
- `public void stubbingCompleted()`
- `public void stubbingStarted()`
- `public java.lang.String toString()`
- `public void validateState()`
- `public java.util.Set verificationListeners()`
- `public void verificationStarted(org.mockito.verification.VerificationMode p0)`

---

## public final class `org.mockito.internal.progress.SequenceNumber`

**Methods:**
- `public static synchronized int next()`

---

## public class `org.mockito.internal.progress.ThreadSafeMockingProgress`

**Methods:**
- `public final static org.mockito.internal.progress.MockingProgress mockingProgress()`

---

## public class `org.mockito.internal.reporting.Discrepancy`

**Constructors:**
- `public Discrepancy(int p0, int p1)`

**Methods:**
- `public int getActualCount()`
- `public java.lang.String getPluralizedActualCount()`
- `public java.lang.String getPluralizedWantedCount()`
- `public int getWantedCount()`

---

## public final class `org.mockito.internal.reporting.Pluralizer`

**Methods:**
- `public static java.lang.String pluralize(int p0)`
- `public static java.lang.String were_exactly_x_interactions(int p0)`

---

## public class `org.mockito.internal.reporting.PrintSettings`

**Constructors:**
- `public PrintSettings()`

**Fields:**
- `public final static int MAX_LINE_LENGTH`

**Methods:**
- `public boolean extraTypeInfoFor(int p0)`
- `public boolean fullyQualifiedNameFor(java.lang.String p0)`
- `public boolean isMultiline()`
- `public java.lang.String print(java.util.List p0, org.mockito.invocation.Invocation p1)`
- `public java.lang.String print(org.mockito.invocation.Invocation p0)`
- `public java.lang.String print(org.mockito.invocation.MatchableInvocation p0)`
- `public void setMatchersToBeDescribedWithExtraTypeInfo(java.lang.Integer[] p0)`
- `public void setMatchersToBeDescribedWithFullName(java.util.Set p0)`
- `public void setMultiline(boolean p0)`
- `public static org.mockito.internal.reporting.PrintSettings verboseMatchers(java.lang.Integer... p0)`

---

## public class `org.mockito.internal.reporting.SmartPrinter`

**Constructors:**
- `public SmartPrinter(org.mockito.invocation.MatchableInvocation p0, java.util.List p1, java.lang.Integer[] p2, java.util.Set p3)`
- `public SmartPrinter(org.mockito.invocation.MatchableInvocation p0, org.mockito.invocation.Invocation p1, java.lang.Integer... p2)`

**Methods:**
- `public java.util.List getActuals()`
- `public java.lang.String getWanted()`

---

## public class `org.mockito.internal.runners.DefaultInternalRunner`
implements `org.mockito.internal.runners.InternalRunner`  

**Constructors:**
- `public DefaultInternalRunner(java.lang.Class p0, org.mockito.internal.util.Supplier p1) throws org.junit.runners.model.InitializationError`

**Methods:**
- `public void filter(org.junit.runner.manipulation.Filter p0) throws org.junit.runner.manipulation.NoTestsRemainException`
- `public org.junit.runner.Description getDescription()`
- `public void run(org.junit.runner.notification.RunNotifier p0)`

---

## public abstract interface `org.mockito.internal.runners.InternalRunner`
implements `org.junit.runner.manipulation.Filterable`  

**Methods:**
- `public abstract org.junit.runner.Description getDescription()`
- `public abstract void run(org.junit.runner.notification.RunNotifier p0)`

---

## public class `org.mockito.internal.runners.RunnerFactory`

**Constructors:**
- `public RunnerFactory()`

**Methods:**
- `public org.mockito.internal.runners.InternalRunner create(java.lang.Class p0) throws java.lang.reflect.InvocationTargetException`
- `public org.mockito.internal.runners.InternalRunner create(java.lang.Class p0, org.mockito.internal.util.Supplier p1) throws java.lang.reflect.InvocationTargetException`
- `public org.mockito.internal.runners.InternalRunner createStrict(java.lang.Class p0) throws java.lang.reflect.InvocationTargetException`
- `public org.mockito.internal.runners.InternalRunner createStrictStubs(java.lang.Class p0) throws java.lang.reflect.InvocationTargetException`

---

## public class `org.mockito.internal.runners.StrictRunner`
implements `org.mockito.internal.runners.InternalRunner`  

**Constructors:**
- `public StrictRunner(org.mockito.internal.runners.InternalRunner p0, java.lang.Class p1)`

**Methods:**
- `public void filter(org.junit.runner.manipulation.Filter p0) throws org.junit.runner.manipulation.NoTestsRemainException`
- `public org.junit.runner.Description getDescription()`
- `public void run(org.junit.runner.notification.RunNotifier p0)`

---

## public class `org.mockito.internal.runners.util.FailureDetector`
extends `org.junit.runner.notification.RunListener`  

**Constructors:**
- `public FailureDetector()`

**Methods:**
- `public boolean isSuccessful()`
- `public void testFailure(org.junit.runner.notification.Failure p0) throws java.lang.Exception`

---

## public class `org.mockito.internal.runners.util.RunnerProvider`

**Constructors:**
- `public RunnerProvider()`

**Methods:**
- `public org.mockito.internal.runners.InternalRunner newInstance(java.lang.String p0, java.lang.Object... p1) throws java.lang.Exception`

---

## public class `org.mockito.internal.runners.util.TestMethodsFinder`

**Methods:**
- `public static boolean hasTestMethods(java.lang.Class p0)`

---

## public class `org.mockito.internal.session.DefaultMockitoSessionBuilder`
implements `org.mockito.session.MockitoSessionBuilder`  

**Constructors:**
- `public DefaultMockitoSessionBuilder()`

**Methods:**
- `public org.mockito.session.MockitoSessionBuilder initMocks(java.lang.Object p0)`
- `public org.mockito.session.MockitoSessionBuilder initMocks(java.lang.Object... p0)`
- `public org.mockito.session.MockitoSessionBuilder logger(org.mockito.session.MockitoSessionLogger p0)`
- `public org.mockito.session.MockitoSessionBuilder name(java.lang.String p0)`
- `public org.mockito.MockitoSession startMocking()`
- `public org.mockito.session.MockitoSessionBuilder strictness(org.mockito.quality.Strictness p0)`

---

## public class `org.mockito.internal.session.MockitoSessionLoggerAdapter`
implements `org.mockito.session.MockitoSessionLogger`  

**Constructors:**
- `public MockitoSessionLoggerAdapter(org.mockito.plugins.MockitoLogger p0)`

**Methods:**
- `public void log(java.lang.String p0)`

---

## public abstract class `org.mockito.internal.stubbing.BaseStubbing`<T extends java.lang.Object>
implements `org.mockito.stubbing.OngoingStubbing<T>`  

**Methods:**
- `public <M extends java.lang.Object> M getMock()`
- `public org.mockito.stubbing.OngoingStubbing then(org.mockito.stubbing.Answer p0)`
- `public org.mockito.stubbing.OngoingStubbing thenCallRealMethod()`
- `public org.mockito.stubbing.OngoingStubbing thenReturn(T p0)`
- `public org.mockito.stubbing.OngoingStubbing thenReturn(T p0, T... p1)`
- `public org.mockito.stubbing.OngoingStubbing thenThrow(java.lang.Class p0)`
- `public org.mockito.stubbing.OngoingStubbing thenThrow(java.lang.Class p0, java.lang.Class... p1)`
- `public org.mockito.stubbing.OngoingStubbing thenThrow(java.lang.Throwable... p0)`

---

## public class `org.mockito.internal.stubbing.ConsecutiveStubbing`<T extends java.lang.Object>
extends `org.mockito.internal.stubbing.BaseStubbing`  

**Methods:**
- `public org.mockito.stubbing.OngoingStubbing thenAnswer(org.mockito.stubbing.Answer p0)`

---

## public class `org.mockito.internal.stubbing.DefaultLenientStubber`
implements `org.mockito.stubbing.LenientStubber`  

**Constructors:**
- `public DefaultLenientStubber()`

**Methods:**
- `public org.mockito.stubbing.Stubber doAnswer(org.mockito.stubbing.Answer p0)`
- `public org.mockito.stubbing.Stubber doCallRealMethod()`
- `public org.mockito.stubbing.Stubber doNothing()`
- `public org.mockito.stubbing.Stubber doReturn(java.lang.Object p0)`
- `public org.mockito.stubbing.Stubber doReturn(java.lang.Object p0, java.lang.Object... p1)`
- `public org.mockito.stubbing.Stubber doThrow(java.lang.Class p0)`
- `public org.mockito.stubbing.Stubber doThrow(java.lang.Class p0, java.lang.Class... p1)`
- `public org.mockito.stubbing.Stubber doThrow(java.lang.Throwable... p0)`
- `public <T extends java.lang.Object> org.mockito.stubbing.OngoingStubbing when(T p0)`

---

## public class `org.mockito.internal.stubbing.InvocationContainerImpl`
implements `java.io.Serializable`, `org.mockito.invocation.InvocationContainer`  

**Constructors:**
- `public InvocationContainerImpl(org.mockito.mock.MockCreationSettings p0)`

**Methods:**
- `public org.mockito.internal.stubbing.StubbedInvocationMatcher addAnswer(org.mockito.stubbing.Answer p0, boolean p1, org.mockito.quality.Strictness p2)`
- `public void addAnswer(org.mockito.stubbing.Answer p0, org.mockito.quality.Strictness p1)`
- `public void addConsecutiveAnswer(org.mockito.stubbing.Answer p0)`
- `public void clearInvocations()`
- `public org.mockito.internal.stubbing.StubbedInvocationMatcher findAnswerFor(org.mockito.invocation.Invocation p0)`
- `public org.mockito.stubbing.Answer findStubbedAnswer()`
- `public java.util.List getInvocations()`
- `public java.util.Collection getStubbingsAscending()`
- `public boolean hasAnswersForStubbing()`
- `public boolean hasInvocationForPotentialStubbing()`
- `public java.lang.Object invokedMock()`
- `public void resetInvocationForPotentialStubbing(org.mockito.invocation.MatchableInvocation p0)`
- `public void setAnswersForStubbing(java.util.List p0, org.mockito.quality.Strictness p1)`
- `public void setInvocationForPotentialStubbing(org.mockito.invocation.MatchableInvocation p0)`
- `public void setMethodForStubbing(org.mockito.invocation.MatchableInvocation p0)`
- `public java.lang.String toString()`

---

## public class `org.mockito.internal.stubbing.OngoingStubbingImpl`<T extends java.lang.Object>
extends `org.mockito.internal.stubbing.BaseStubbing`  

**Constructors:**
- `public OngoingStubbingImpl(org.mockito.internal.stubbing.InvocationContainerImpl p0)`

**Methods:**
- `public java.util.List getRegisteredInvocations()`
- `public void setStrictness(org.mockito.quality.Strictness p0)`
- `public org.mockito.stubbing.OngoingStubbing thenAnswer(org.mockito.stubbing.Answer p0)`

---

## public final class `org.mockito.internal.stubbing.StrictnessSelector`

**Methods:**
- `public static org.mockito.quality.Strictness determineStrictness(org.mockito.stubbing.Stubbing p0, org.mockito.mock.MockCreationSettings p1, org.mockito.quality.Strictness p2)`

---

## public class `org.mockito.internal.stubbing.StubbedInvocationMatcher`
extends `org.mockito.internal.invocation.InvocationMatcher`  
implements `java.io.Serializable`, `org.mockito.stubbing.Stubbing`  

**Constructors:**
- `public StubbedInvocationMatcher(org.mockito.stubbing.Answer p0, org.mockito.invocation.MatchableInvocation p1, org.mockito.quality.Strictness p2)`

**Methods:**
- `public void addAnswer(org.mockito.stubbing.Answer p0)`
- `public java.lang.Object answer(org.mockito.invocation.InvocationOnMock p0) throws java.lang.Throwable`
- `public org.mockito.quality.Strictness getStrictness()`
- `public void markStubUsed(org.mockito.invocation.DescribedInvocation p0)`
- `public java.lang.String toString()`
- `public boolean wasUsed()`

---

## public class `org.mockito.internal.stubbing.StubberImpl`
implements `org.mockito.stubbing.Stubber`  

**Constructors:**
- `public StubberImpl(org.mockito.quality.Strictness p0)`

**Methods:**
- `public org.mockito.stubbing.Stubber doAnswer(org.mockito.stubbing.Answer p0)`
- `public org.mockito.stubbing.Stubber doCallRealMethod()`
- `public org.mockito.stubbing.Stubber doNothing()`
- `public org.mockito.stubbing.Stubber doReturn(java.lang.Object p0)`
- `public org.mockito.stubbing.Stubber doReturn(java.lang.Object p0, java.lang.Object... p1)`
- `public org.mockito.stubbing.Stubber doThrow(java.lang.Class p0)`
- `public org.mockito.stubbing.Stubber doThrow(java.lang.Class p0, java.lang.Class... p1)`
- `public org.mockito.stubbing.Stubber doThrow(java.lang.Throwable... p0)`
- `public <T extends java.lang.Object> T when(T p0)`

---

## public class `org.mockito.internal.stubbing.StubbingComparator`
implements `java.util.Comparator<org.mockito.stubbing.Stubbing>`  

**Constructors:**
- `public StubbingComparator()`

**Methods:**
- `public int compare(org.mockito.stubbing.Stubbing p0, org.mockito.stubbing.Stubbing p1)`

---

## public final class `org.mockito.internal.stubbing.UnusedStubbingReporting`

**Methods:**
- `public static boolean shouldBeReported(org.mockito.stubbing.Stubbing p0)`

---

## public abstract class `org.mockito.internal.stubbing.answers.AbstractThrowsException`
implements `org.mockito.stubbing.Answer<java.lang.Object>`, `org.mockito.stubbing.ValidableAnswer`  

**Constructors:**
- `public AbstractThrowsException()`

**Methods:**
- `public java.lang.Object answer(org.mockito.invocation.InvocationOnMock p0) throws java.lang.Throwable`
- `protected abstract java.lang.Throwable getThrowable()`
- `public void validateFor(org.mockito.invocation.InvocationOnMock p0)`

---

## public class `org.mockito.internal.stubbing.answers.AnswerFunctionalInterfaces`

**Methods:**
- `public static <T extends java.lang.Object, A extends java.lang.Object> org.mockito.stubbing.Answer toAnswer(org.mockito.stubbing.Answer1 p0)`
- `public static <T extends java.lang.Object, A extends java.lang.Object, B extends java.lang.Object> org.mockito.stubbing.Answer toAnswer(org.mockito.stubbing.Answer2 p0)`
- `public static <T extends java.lang.Object, A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object> org.mockito.stubbing.Answer toAnswer(org.mockito.stubbing.Answer3 p0)`
- `public static <T extends java.lang.Object, A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object> org.mockito.stubbing.Answer toAnswer(org.mockito.stubbing.Answer4 p0)`
- `public static <T extends java.lang.Object, A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object, E extends java.lang.Object> org.mockito.stubbing.Answer toAnswer(org.mockito.stubbing.Answer5 p0)`
- `public static <T extends java.lang.Object, A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object, E extends java.lang.Object, F extends java.lang.Object> org.mockito.stubbing.Answer toAnswer(org.mockito.stubbing.Answer6 p0)`
- `public static <A extends java.lang.Object> org.mockito.stubbing.Answer toAnswer(org.mockito.stubbing.VoidAnswer1 p0)`
- `public static <A extends java.lang.Object, B extends java.lang.Object> org.mockito.stubbing.Answer toAnswer(org.mockito.stubbing.VoidAnswer2 p0)`
- `public static <A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object> org.mockito.stubbing.Answer toAnswer(org.mockito.stubbing.VoidAnswer3 p0)`
- `public static <A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object> org.mockito.stubbing.Answer toAnswer(org.mockito.stubbing.VoidAnswer4 p0)`
- `public static <A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object, E extends java.lang.Object> org.mockito.stubbing.Answer toAnswer(org.mockito.stubbing.VoidAnswer5 p0)`
- `public static <A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object, E extends java.lang.Object, F extends java.lang.Object> org.mockito.stubbing.Answer toAnswer(org.mockito.stubbing.VoidAnswer6 p0)`

---

## public class `org.mockito.internal.stubbing.answers.AnswersWithDelay`
implements `java.io.Serializable`, `org.mockito.stubbing.Answer<java.lang.Object>`, `org.mockito.stubbing.ValidableAnswer`  

**Constructors:**
- `public AnswersWithDelay(long p0, org.mockito.stubbing.Answer p1)`

**Methods:**
- `public java.lang.Object answer(org.mockito.invocation.InvocationOnMock p0) throws java.lang.Throwable`
- `public void validateFor(org.mockito.invocation.InvocationOnMock p0)`

---

## public class `org.mockito.internal.stubbing.answers.CallsRealMethods`
implements `java.io.Serializable`, `org.mockito.stubbing.Answer<java.lang.Object>`, `org.mockito.stubbing.ValidableAnswer`  

**Constructors:**
- `public CallsRealMethods()`

**Methods:**
- `public java.lang.Object answer(org.mockito.invocation.InvocationOnMock p0) throws java.lang.Throwable`
- `public void validateFor(org.mockito.invocation.InvocationOnMock p0)`

---

## public class `org.mockito.internal.stubbing.answers.ClonesArguments`
implements `org.mockito.stubbing.Answer<java.lang.Object>`  

**Constructors:**
- `public ClonesArguments()`

**Methods:**
- `public java.lang.Object answer(org.mockito.invocation.InvocationOnMock p0) throws java.lang.Throwable`

---

## public abstract class `org.mockito.internal.stubbing.answers.DefaultAnswerValidator`

**Constructors:**
- `public DefaultAnswerValidator()`

**Methods:**
- `public static void validateReturnValueFor(org.mockito.invocation.InvocationOnMock p0, java.lang.Object p1) throws java.lang.Throwable`

---

## public class `org.mockito.internal.stubbing.answers.DoesNothing`
implements `java.io.Serializable`, `org.mockito.stubbing.Answer<java.lang.Object>`, `org.mockito.stubbing.ValidableAnswer`  

**Methods:**
- `public java.lang.Object answer(org.mockito.invocation.InvocationOnMock p0)`
- `public static org.mockito.internal.stubbing.answers.DoesNothing doesNothing()`
- `public void validateFor(org.mockito.invocation.InvocationOnMock p0)`

---

## public class `org.mockito.internal.stubbing.answers.InvocationInfo`
implements `org.mockito.internal.invocation.AbstractAwareMethod`  

**Constructors:**
- `public InvocationInfo(org.mockito.invocation.InvocationOnMock p0)`

**Methods:**
- `public java.lang.reflect.Method getMethod()`
- `public java.lang.String getMethodName()`
- `public boolean isAbstract()`
- `public boolean isDeclaredOnInterface()`
- `public boolean isValidException(java.lang.Throwable p0)`
- `public boolean isValidReturnType(java.lang.Class p0)`
- `public boolean isVoid()`
- `public java.lang.String printMethodReturnType()`
- `public boolean returnsPrimitive()`

---

## public class `org.mockito.internal.stubbing.answers.Returns`
implements `java.io.Serializable`, `org.mockito.stubbing.Answer<java.lang.Object>`, `org.mockito.stubbing.ValidableAnswer`  

**Constructors:**
- `public Returns(java.lang.Object p0)`

**Methods:**
- `public java.lang.Object answer(org.mockito.invocation.InvocationOnMock p0) throws java.lang.Throwable`
- `public java.lang.String toString()`
- `public void validateFor(org.mockito.invocation.InvocationOnMock p0)`

---

## public class `org.mockito.internal.stubbing.answers.ReturnsArgumentAt`
implements `java.io.Serializable`, `org.mockito.stubbing.Answer<java.lang.Object>`, `org.mockito.stubbing.ValidableAnswer`  

**Constructors:**
- `public ReturnsArgumentAt(int p0)`

**Fields:**
- `public final static int LAST_ARGUMENT`

**Methods:**
- `public java.lang.Object answer(org.mockito.invocation.InvocationOnMock p0) throws java.lang.Throwable`
- `public void validateFor(org.mockito.invocation.InvocationOnMock p0)`

---

## public class `org.mockito.internal.stubbing.answers.ReturnsElementsOf`
implements `org.mockito.stubbing.Answer<java.lang.Object>`  

**Constructors:**
- `public ReturnsElementsOf(java.util.Collection p0)`

**Methods:**
- `public java.lang.Object answer(org.mockito.invocation.InvocationOnMock p0) throws java.lang.Throwable`

---

## public class `org.mockito.internal.stubbing.answers.ThrowsException`
extends `org.mockito.internal.stubbing.answers.AbstractThrowsException`  
implements `java.io.Serializable`  

**Constructors:**
- `public ThrowsException(java.lang.Throwable p0)`

**Methods:**
- `protected java.lang.Throwable getThrowable()`

---

## public class `org.mockito.internal.stubbing.answers.ThrowsExceptionForClassType`
extends `org.mockito.internal.stubbing.answers.AbstractThrowsException`  
implements `java.io.Serializable`  

**Constructors:**
- `public ThrowsExceptionForClassType(java.lang.Class p0)`

**Methods:**
- `protected java.lang.Throwable getThrowable()`

---

## public class `org.mockito.internal.stubbing.defaultanswers.ForwardsInvocations`
implements `java.io.Serializable`, `org.mockito.stubbing.Answer<java.lang.Object>`  

**Constructors:**
- `public ForwardsInvocations(java.lang.Object p0)`

**Methods:**
- `public java.lang.Object answer(org.mockito.invocation.InvocationOnMock p0) throws java.lang.Throwable`

---

## public class `org.mockito.internal.stubbing.defaultanswers.GloballyConfiguredAnswer`
implements `java.io.Serializable`, `org.mockito.stubbing.Answer<java.lang.Object>`  

**Constructors:**
- `public GloballyConfiguredAnswer()`

**Methods:**
- `public java.lang.Object answer(org.mockito.invocation.InvocationOnMock p0) throws java.lang.Throwable`

---

## public class `org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs`
implements `java.io.Serializable`, `org.mockito.stubbing.Answer<java.lang.Object>`  

**Constructors:**
- `public ReturnsDeepStubs()`

**Methods:**
- `protected org.mockito.internal.util.reflection.GenericMetadataSupport actualParameterizedType(java.lang.Object p0)`
- `public java.lang.Object answer(org.mockito.invocation.InvocationOnMock p0) throws java.lang.Throwable`

---

## public class `org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues`
implements `java.io.Serializable`, `org.mockito.stubbing.Answer<java.lang.Object>`  

**Constructors:**
- `public ReturnsEmptyValues()`

**Methods:**
- `public java.lang.Object answer(org.mockito.invocation.InvocationOnMock p0)`

---

## public class `org.mockito.internal.stubbing.defaultanswers.ReturnsMocks`
implements `java.io.Serializable`, `org.mockito.stubbing.Answer<java.lang.Object>`  

**Constructors:**
- `public ReturnsMocks()`

**Methods:**
- `public java.lang.Object answer(org.mockito.invocation.InvocationOnMock p0) throws java.lang.Throwable`

---

## public class `org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues`
implements `java.io.Serializable`, `org.mockito.stubbing.Answer<java.lang.Object>`  

**Constructors:**
- `public ReturnsMoreEmptyValues()`

**Methods:**
- `public java.lang.Object answer(org.mockito.invocation.InvocationOnMock p0) throws java.lang.Throwable`

---

## public class `org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls`
implements `java.io.Serializable`, `org.mockito.stubbing.Answer<java.lang.Object>`  

**Constructors:**
- `public ReturnsSmartNulls()`

**Methods:**
- `public java.lang.Object answer(org.mockito.invocation.InvocationOnMock p0) throws java.lang.Throwable`

---

## public class `org.mockito.internal.stubbing.defaultanswers.TriesToReturnSelf`
implements `java.io.Serializable`, `org.mockito.stubbing.Answer<java.lang.Object>`  

**Constructors:**
- `public TriesToReturnSelf()`

**Methods:**
- `public java.lang.Object answer(org.mockito.invocation.InvocationOnMock p0) throws java.lang.Throwable`

---

## public final class `org.mockito.internal.util.Checks`

**Methods:**
- `public static <T extends java.lang.Iterable<? extends java.lang.Object>> T checkItemsNotNull(T p0, java.lang.String p1)`
- `public static <T extends java.lang.Object> T checkNotNull(T p0, java.lang.String p1)`
- `public static <T extends java.lang.Object> T checkNotNull(T p0, java.lang.String p1, java.lang.String p2)`

---

## public class `org.mockito.internal.util.ConsoleMockitoLogger`
implements `org.mockito.plugins.MockitoLogger`  

**Constructors:**
- `public ConsoleMockitoLogger()`

**Methods:**
- `public void log(java.lang.Object p0)`

---

## public class `org.mockito.internal.util.DefaultMockingDetails`
implements `org.mockito.MockingDetails`  

**Constructors:**
- `public DefaultMockingDetails(java.lang.Object p0)`

**Methods:**
- `public java.util.Collection getInvocations()`
- `public java.lang.Object getMock()`
- `public org.mockito.mock.MockCreationSettings getMockCreationSettings()`
- `public org.mockito.invocation.MockHandler getMockHandler()`
- `public java.util.Collection getStubbings()`
- `public boolean isMock()`
- `public boolean isSpy()`
- `public java.lang.String printInvocations()`

---

## public class `org.mockito.internal.util.KotlinInlineClassUtil`

**Constructors:**
- `public KotlinInlineClassUtil()`

**Methods:**
- `public static boolean isInlineClassWithAssignableUnderlyingType(java.lang.Class p0, java.lang.Class p1)`
- `public static java.lang.Object unboxUnderlyingValueIfNeeded(org.mockito.invocation.InvocationOnMock p0, java.lang.Object p1)`

---

## public class `org.mockito.internal.util.MockCreationValidator`

**Constructors:**
- `public MockCreationValidator()`

**Methods:**
- `public void validateConstructorUse(boolean p0, org.mockito.mock.SerializableMode p1)`
- `public void validateDelegatedInstance(java.lang.Class p0, java.lang.Object p1)`
- `public void validateExtraInterfaces(java.lang.Class p0, java.util.Collection p1)`
- `public void validateMockedType(java.lang.Class p0, java.lang.Object p1)`
- `public void validateType(java.lang.Class p0, java.lang.String p1)`

---

## public class `org.mockito.internal.util.MockNameImpl`
implements `java.io.Serializable`, `org.mockito.mock.MockName`  

**Constructors:**
- `public MockNameImpl(java.lang.String p0)`
- `public MockNameImpl(java.lang.String p0, java.lang.Class p1, boolean p2)`

**Methods:**
- `public boolean isDefault()`
- `public java.lang.String toString()`

---

## public class `org.mockito.internal.util.MockUtil`

**Methods:**
- `public static boolean areSameMocks(java.lang.Object p0, java.lang.Object p1)`
- `public static void clearAllCaches()`
- `public static <T extends java.lang.Object> org.mockito.plugins.MockMaker$ConstructionMockControl createConstructionMock(java.lang.Class p0, java.util.function.Function p1, org.mockito.MockedConstruction$MockInitializer p2)`
- `public static <T extends java.lang.Object> T createMock(org.mockito.mock.MockCreationSettings p0)`
- `public static <T extends java.lang.Object> org.mockito.plugins.MockMaker$StaticMockControl createStaticMock(java.lang.Class p0, org.mockito.mock.MockCreationSettings p1)`
- `public static org.mockito.internal.stubbing.InvocationContainerImpl getInvocationContainer(java.lang.Object p0)`
- `public static org.mockito.invocation.MockHandler getMockHandler(java.lang.Object p0)`
- `public static org.mockito.mock.MockName getMockName(java.lang.Object p0)`
- `public static org.mockito.mock.MockCreationSettings getMockSettings(java.lang.Object p0)`
- `public static boolean isMock(java.lang.Object p0)`
- `public static boolean isSpy(java.lang.Object p0)`
- `public static void maybeRedefineMockName(java.lang.Object p0, java.lang.String p1)`
- `public static void resetMock(java.lang.Object p0)`
- `public static org.mockito.plugins.MockMaker$TypeMockability typeMockabilityOf(java.lang.Class p0, java.lang.String p1)`

---

## public class `org.mockito.internal.util.ObjectMethodsGuru`

**Methods:**
- `public static boolean isCompareToMethod(java.lang.reflect.Method p0)`
- `public static boolean isToStringMethod(java.lang.reflect.Method p0)`

---

## public abstract class `org.mockito.internal.util.Platform`

**Fields:**
- `public final static java.lang.String JAVA_VERSION`
- `public final static java.lang.String JVM_INFO`
- `public final static java.lang.String JVM_NAME`
- `public final static java.lang.String JVM_VENDOR`
- `public final static java.lang.String JVM_VENDOR_VERSION`
- `public final static java.lang.String JVM_VERSION`
- `public final static java.lang.String OS_NAME`
- `public final static java.lang.String OS_VERSION`

**Methods:**
- `public static java.lang.String describe()`
- `public static boolean isAndroid()`
- `public static boolean isAndroidMockMakerRequired()`
- `public static java.lang.String warnForVM(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3)`

---

## public final class `org.mockito.internal.util.Primitives`

**Methods:**
- `public static <T extends java.lang.Object> T defaultValue(java.lang.Class p0)`
- `public static boolean isAssignableFromWrapper(java.lang.Class p0, java.lang.Class p1)`
- `public static boolean isPrimitiveOrWrapper(java.lang.Class p0)`
- `public static <T extends java.lang.Object> java.lang.Class primitiveTypeOf(java.lang.Class p0)`

---

## public class `org.mockito.internal.util.StringUtil`

**Methods:**
- `public static java.lang.String decamelizeMatcherName(java.lang.String p0)`
- `public static java.lang.String join(java.lang.Object... p0)`
- `public static java.lang.String join(java.lang.String p0, java.lang.String p1, java.util.Collection p2)`
- `public static java.lang.String join(java.lang.String p0, java.util.Collection p1)`
- `public static java.lang.String removeFirstLine(java.lang.String p0)`

---

## public abstract interface `org.mockito.internal.util.Supplier`<T extends java.lang.Object>

**Methods:**
- `public abstract T get()`

---

## public class `org.mockito.internal.util.Timer`

**Constructors:**
- `public Timer(long p0)`

**Methods:**
- `public long duration()`
- `public boolean isCounting()`
- `public void start()`

---

## public class `org.mockito.internal.util.collections.HashCodeAndEqualsMockWrapper`

**Constructors:**
- `public HashCodeAndEqualsMockWrapper(java.lang.Object p0)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.Object get()`
- `public int hashCode()`
- `public static org.mockito.internal.util.collections.HashCodeAndEqualsMockWrapper of(java.lang.Object p0)`
- `public java.lang.String toString()`

---

## public class `org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet`
implements `java.util.Set<java.lang.Object>`  

**Constructors:**
- `public HashCodeAndEqualsSafeSet()`

**Methods:**
- `public boolean add(java.lang.Object p0)`
- `public boolean addAll(java.util.Collection p0)`
- `public void clear()`
- `public java.lang.Object clone() throws java.lang.CloneNotSupportedException`
- `public boolean contains(java.lang.Object p0)`
- `public boolean containsAll(java.util.Collection p0)`
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public boolean isEmpty()`
- `public java.util.Iterator iterator()`
- `public static org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet of(java.lang.Iterable p0)`
- `public static org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet of(java.lang.Object... p0)`
- `public boolean remove(java.lang.Object p0)`
- `public boolean removeAll(java.util.Collection p0)`
- `public boolean retainAll(java.util.Collection p0)`
- `public int size()`
- `public java.lang.Object[] toArray()`
- `public <T extends java.lang.Object> T[] toArray(T[] p0)`
- `public java.lang.String toString()`

---

## public class `org.mockito.internal.util.collections.IdentitySet`

**Constructors:**
- `public IdentitySet()`

**Methods:**
- `public void add(java.lang.Object p0)`
- `public boolean contains(java.lang.Object p0)`

---

## public final class `org.mockito.internal.util.collections.Iterables`

**Methods:**
- `public static <T extends java.lang.Object> T firstOf(java.lang.Iterable p0)`
- `public static <T extends java.lang.Object> java.lang.Iterable toIterable(java.util.Enumeration p0)`

---

## public abstract class `org.mockito.internal.util.collections.Sets`

**Constructors:**
- `public Sets()`

**Methods:**
- `public static java.util.Set newMockSafeHashSet(java.lang.Iterable p0)`
- `public static java.util.Set newMockSafeHashSet(java.lang.Object... p0)`
- `public static <T extends java.lang.Object> java.util.Set newSet(T... p0)`

---

## public class `org.mockito.internal.util.concurrent.DetachedThreadLocal`<T extends java.lang.Object>
implements `java.lang.Runnable`  

**Constructors:**
- `public DetachedThreadLocal(org.mockito.internal.util.concurrent.DetachedThreadLocal$Cleaner p0)`

**Methods:**
- `public void clear()`
- `public void clearAll()`
- `public void define(java.lang.Thread p0, T p1)`
- `public T fetchFrom(java.lang.Thread p0)`
- `public T get()`
- `public T get(java.lang.Thread p0)`
- `public org.mockito.internal.util.concurrent.WeakConcurrentMap getBackingMap()`
- `protected T inheritValue(T p0)`
- `protected T initialValue(java.lang.Thread p0)`
- `public T pushTo(java.lang.Thread p0)`
- `public void run()`
- `public void set(T p0)`

---

## public final static enum `org.mockito.internal.util.concurrent.DetachedThreadLocal$Cleaner`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.mockito.internal.util.concurrent.DetachedThreadLocal$Cleaner INLINE`
- `public final static org.mockito.internal.util.concurrent.DetachedThreadLocal$Cleaner MANUAL`
- `public final static org.mockito.internal.util.concurrent.DetachedThreadLocal$Cleaner THREAD`

---

## public class `org.mockito.internal.util.concurrent.WeakConcurrentMap`<K extends java.lang.Object, V extends java.lang.Object>
extends `java.lang.ref.ReferenceQueue`  
implements `java.lang.Iterable<java.util.Map$Entry<K,V>>`, `java.lang.Runnable`  

**Constructors:**
- `public WeakConcurrentMap(boolean p0)`

**Fields:**
- `public final java.util.concurrent.ConcurrentMap target`

**Methods:**
- `public int approximateSize()`
- `public void clear()`
- `public boolean containsKey(K p0)`
- `protected V defaultValue(K p0)`
- `public void expungeStaleEntries()`
- `public V get(K p0)`
- `public java.lang.Thread getCleanerThread()`
- `public java.util.Iterator iterator()`
- `public V put(K p0, V p1)`
- `public V remove(K p0)`
- `public void run()`

---

## public static class `org.mockito.internal.util.concurrent.WeakConcurrentMap$WithInlinedExpunction`<K extends java.lang.Object, V extends java.lang.Object>
extends `org.mockito.internal.util.concurrent.WeakConcurrentMap`  

**Constructors:**
- `public WithInlinedExpunction()`

**Methods:**
- `public int approximateSize()`
- `public boolean containsKey(K p0)`
- `public V get(K p0)`
- `public java.util.Iterator iterator()`
- `public V put(K p0, V p1)`
- `public V remove(K p0)`

---

## public class `org.mockito.internal.util.concurrent.WeakConcurrentSet`<V extends java.lang.Object>
implements `java.lang.Iterable<V>`, `java.lang.Runnable`  

**Constructors:**
- `public WeakConcurrentSet(org.mockito.internal.util.concurrent.WeakConcurrentSet$Cleaner p0)`

**Methods:**
- `public boolean add(V p0)`
- `public int approximateSize()`
- `public void clear()`
- `public boolean contains(V p0)`
- `public void expungeStaleEntries()`
- `public java.lang.Thread getCleanerThread()`
- `public java.util.Iterator iterator()`
- `public boolean remove(V p0)`
- `public void run()`

---

## public final static enum `org.mockito.internal.util.concurrent.WeakConcurrentSet$Cleaner`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.mockito.internal.util.concurrent.WeakConcurrentSet$Cleaner INLINE`
- `public final static org.mockito.internal.util.concurrent.WeakConcurrentSet$Cleaner MANUAL`
- `public final static org.mockito.internal.util.concurrent.WeakConcurrentSet$Cleaner THREAD`

---

## public final class `org.mockito.internal.util.io.IOUtil`

**Methods:**
- `public static void close(java.io.Closeable p0)`
- `public static void closeQuietly(java.io.Closeable p0)`
- `public static java.util.Collection readLines(java.io.InputStream p0)`
- `public static void writeText(java.lang.String p0, java.io.File p1)`

---

## public class `org.mockito.internal.util.reflection.BeanPropertySetter`

**Constructors:**
- `public BeanPropertySetter(java.lang.Object p0, java.lang.reflect.Field p1)`
- `public BeanPropertySetter(java.lang.Object p0, java.lang.reflect.Field p1, boolean p2)`

**Methods:**
- `public boolean set(java.lang.Object p0)`

---

## public class `org.mockito.internal.util.reflection.FieldInitializationReport`

**Constructors:**
- `public FieldInitializationReport(java.lang.Object p0, boolean p1, boolean p2)`

**Methods:**
- `public java.lang.Class fieldClass()`
- `public java.lang.Object fieldInstance()`
- `public boolean fieldWasInitialized()`
- `public boolean fieldWasInitializedUsingContructorArgs()`

---

## public class `org.mockito.internal.util.reflection.FieldInitializer`

**Constructors:**
- `public FieldInitializer(java.lang.Object p0, java.lang.reflect.Field p1)`
- `public FieldInitializer(java.lang.Object p0, java.lang.reflect.Field p1, org.mockito.internal.util.reflection.FieldInitializer$ConstructorArgumentResolver p2)`

**Methods:**
- `public org.mockito.internal.util.reflection.FieldInitializationReport initialize()`

---

## public abstract static interface `org.mockito.internal.util.reflection.FieldInitializer$ConstructorArgumentResolver`

**Methods:**
- `public abstract java.lang.Object[] resolveTypeInstances(java.lang.Class... p0)`

---

## public class `org.mockito.internal.util.reflection.FieldReader`

**Constructors:**
- `public FieldReader(java.lang.Object p0, java.lang.reflect.Field p1)`

**Methods:**
- `public boolean isNull()`
- `public java.lang.Object read()`

---

## public class `org.mockito.internal.util.reflection.GenericMaster`

**Constructors:**
- `public GenericMaster()`

**Methods:**
- `public java.lang.Class getGenericType(java.lang.reflect.Field p0)`

---

## public abstract class `org.mockito.internal.util.reflection.GenericMetadataSupport`

**Constructors:**
- `public GenericMetadataSupport()`

**Fields:**
- `protected java.util.Map contextualActualTypeParameters`

**Methods:**
- `public java.util.Map actualTypeArguments()`
- `public java.util.List extraInterfaces()`
- `protected java.lang.Class extractRawTypeOf(java.lang.reflect.Type p0)`
- `protected java.lang.reflect.Type getActualTypeArgumentFor(java.lang.reflect.TypeVariable p0)`
- `public boolean hasRawExtraInterfaces()`
- `public static org.mockito.internal.util.reflection.GenericMetadataSupport inferFrom(java.lang.reflect.Type p0)`
- `public java.lang.Class[] rawExtraInterfaces()`
- `public abstract java.lang.Class rawType()`
- `protected void registerAllTypeVariables(java.lang.reflect.Type p0)`
- `protected void registerTypeParametersOn(java.lang.reflect.TypeVariable[] p0)`
- `protected void registerTypeVariablesOn(java.lang.reflect.Type p0)`
- `public org.mockito.internal.util.reflection.GenericMetadataSupport resolveGenericReturnType(java.lang.reflect.Method p0)`

---

## public abstract static interface `org.mockito.internal.util.reflection.GenericMetadataSupport$BoundedType`
implements `java.lang.reflect.Type`  

**Methods:**
- `public abstract java.lang.reflect.Type firstBound()`
- `public abstract java.lang.reflect.Type[] interfaceBounds()`

---

## public static class `org.mockito.internal.util.reflection.GenericMetadataSupport$TypeVarBoundedType`
implements `org.mockito.internal.util.reflection.GenericMetadataSupport$BoundedType`  

**Constructors:**
- `public TypeVarBoundedType(java.lang.reflect.TypeVariable p0)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.reflect.Type firstBound()`
- `public int hashCode()`
- `public java.lang.reflect.Type[] interfaceBounds()`
- `public java.lang.String toString()`
- `public java.lang.reflect.TypeVariable typeVariable()`

---

## public static class `org.mockito.internal.util.reflection.GenericMetadataSupport$WildCardBoundedType`
implements `org.mockito.internal.util.reflection.GenericMetadataSupport$BoundedType`  

**Constructors:**
- `public WildCardBoundedType(java.lang.reflect.WildcardType p0)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.reflect.Type firstBound()`
- `public int hashCode()`
- `public java.lang.reflect.Type[] interfaceBounds()`
- `public java.lang.String toString()`
- `public java.lang.reflect.WildcardType wildCard()`

---

## public final class `org.mockito.internal.util.reflection.GenericTypeExtractor`

**Methods:**
- `public static java.lang.Class genericTypeOf(java.lang.Class p0, java.lang.Class p1, java.lang.Class p2)`

---

## public class `org.mockito.internal.util.reflection.InstanceField`

**Constructors:**
- `public InstanceField(java.lang.reflect.Field p0, java.lang.Object p1)`

**Methods:**
- `public <A extends java.lang.annotation.Annotation> A annotation(java.lang.Class p0)`
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public boolean isAnnotatedBy(java.lang.Class p0)`
- `public boolean isNull()`
- `public boolean isSynthetic()`
- `public java.lang.reflect.Field jdkField()`
- `public java.lang.String name()`
- `public java.lang.Object read()`
- `public void set(java.lang.Object p0)`
- `public java.lang.String toString()`

---

## public class `org.mockito.internal.util.reflection.LenientCopyTool`

**Constructors:**
- `public LenientCopyTool()`

**Methods:**
- `public <T extends java.lang.Object> void copyToMock(T p0, T p1)`
- `public <T extends java.lang.Object> void copyToRealObject(T p0, T p1)`

---

## public class `org.mockito.internal.util.reflection.ModuleMemberAccessor`
implements `org.mockito.plugins.MemberAccessor`  

**Constructors:**
- `public ModuleMemberAccessor()`

**Methods:**
- `public java.lang.Object get(java.lang.reflect.Field p0, java.lang.Object p1) throws java.lang.IllegalAccessException`
- `public java.lang.Object invoke(java.lang.reflect.Method p0, java.lang.Object p1, java.lang.Object... p2) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException`
- `public java.lang.Object newInstance(java.lang.reflect.Constructor p0, java.lang.Object... p1) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException`
- `public java.lang.Object newInstance(java.lang.reflect.Constructor p0, org.mockito.plugins.MemberAccessor$OnConstruction p1, java.lang.Object... p2) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException`
- `public void set(java.lang.reflect.Field p0, java.lang.Object p1, java.lang.Object p2) throws java.lang.IllegalAccessException`

---

## public class `org.mockito.internal.util.reflection.ReflectionMemberAccessor`
implements `org.mockito.plugins.MemberAccessor`  

**Constructors:**
- `public ReflectionMemberAccessor()`

**Methods:**
- `public java.lang.Object get(java.lang.reflect.Field p0, java.lang.Object p1) throws java.lang.IllegalAccessException`
- `public java.lang.Object invoke(java.lang.reflect.Method p0, java.lang.Object p1, java.lang.Object... p2) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException`
- `public java.lang.Object newInstance(java.lang.reflect.Constructor p0, java.lang.Object... p1) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException`
- `public java.lang.Object newInstance(java.lang.reflect.Constructor p0, org.mockito.plugins.MemberAccessor$OnConstruction p1, java.lang.Object... p2) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException`
- `public void set(java.lang.reflect.Field p0, java.lang.Object p1, java.lang.Object p2) throws java.lang.IllegalAccessException`

---

## public class `org.mockito.internal.util.reflection.SuperTypesLastSorter`

**Methods:**
- `public static java.util.List sortSuperTypesLast(java.util.Collection p0)`

---

## public class `org.mockito.internal.verification.AtLeast`
implements `org.mockito.internal.verification.api.VerificationInOrderMode`, `org.mockito.verification.VerificationMode`  

**Constructors:**
- `public AtLeast(int p0)`

**Methods:**
- `public java.lang.String toString()`
- `public void verify(org.mockito.internal.verification.api.VerificationData p0)`
- `public void verifyInOrder(org.mockito.internal.verification.api.VerificationDataInOrder p0)`

---

## public class `org.mockito.internal.verification.AtMost`
implements `org.mockito.verification.VerificationMode`  

**Constructors:**
- `public AtMost(int p0)`

**Methods:**
- `public java.lang.String toString()`
- `public void verify(org.mockito.internal.verification.api.VerificationData p0)`

---

## public class `org.mockito.internal.verification.Calls`
implements `org.mockito.internal.verification.api.VerificationInOrderMode`, `org.mockito.verification.VerificationMode`  

**Constructors:**
- `public Calls(int p0)`

**Methods:**
- `public java.lang.String toString()`
- `public void verify(org.mockito.internal.verification.api.VerificationData p0)`
- `public void verifyInOrder(org.mockito.internal.verification.api.VerificationDataInOrder p0)`

---

## public class `org.mockito.internal.verification.DefaultRegisteredInvocations`
implements `java.io.Serializable`, `org.mockito.internal.verification.RegisteredInvocations`  

**Constructors:**
- `public DefaultRegisteredInvocations()`

**Methods:**
- `public void add(org.mockito.invocation.Invocation p0)`
- `public void clear()`
- `public java.util.List getAll()`
- `public boolean isEmpty()`
- `public void removeLast()`

---

## public class `org.mockito.internal.verification.Description`
implements `org.mockito.verification.VerificationMode`  

**Constructors:**
- `public Description(org.mockito.verification.VerificationMode p0, java.lang.String p1)`

**Methods:**
- `public void verify(org.mockito.internal.verification.api.VerificationData p0)`

---

## public class `org.mockito.internal.verification.InOrderContextImpl`
implements `org.mockito.internal.verification.api.InOrderContext`  

**Constructors:**
- `public InOrderContextImpl()`

**Methods:**
- `public boolean isVerified(org.mockito.invocation.Invocation p0)`
- `public void markVerified(org.mockito.invocation.Invocation p0)`

---

## public class `org.mockito.internal.verification.InOrderWrapper`
implements `org.mockito.verification.VerificationMode`  

**Constructors:**
- `public InOrderWrapper(org.mockito.internal.verification.api.VerificationInOrderMode p0, org.mockito.internal.InOrderImpl p1)`

**Methods:**
- `public void verify(org.mockito.internal.verification.api.VerificationData p0)`

---

## public class `org.mockito.internal.verification.MockAwareVerificationMode`
implements `org.mockito.verification.VerificationMode`  

**Constructors:**
- `public MockAwareVerificationMode(java.lang.Object p0, org.mockito.verification.VerificationMode p1, java.util.Set p2)`

**Methods:**
- `public java.lang.Object getMock()`
- `public void verify(org.mockito.internal.verification.api.VerificationData p0)`

---

## public class `org.mockito.internal.verification.NoInteractions`
implements `org.mockito.verification.VerificationMode`  

**Constructors:**
- `public NoInteractions()`

**Methods:**
- `public void verify(org.mockito.internal.verification.api.VerificationData p0)`

---

## public class `org.mockito.internal.verification.NoMoreInteractions`
implements `org.mockito.internal.verification.api.VerificationInOrderMode`, `org.mockito.verification.VerificationMode`  

**Constructors:**
- `public NoMoreInteractions()`

**Methods:**
- `public void verify(org.mockito.internal.verification.api.VerificationData p0)`
- `public void verifyInOrder(org.mockito.internal.verification.api.VerificationDataInOrder p0)`

---

## public class `org.mockito.internal.verification.Only`
implements `org.mockito.verification.VerificationMode`  

**Constructors:**
- `public Only()`

**Methods:**
- `public java.lang.String toString()`
- `public void verify(org.mockito.internal.verification.api.VerificationData p0)`

---

## public abstract interface `org.mockito.internal.verification.RegisteredInvocations`

**Methods:**
- `public abstract void add(org.mockito.invocation.Invocation p0)`
- `public abstract void clear()`
- `public abstract java.util.List getAll()`
- `public abstract boolean isEmpty()`
- `public abstract void removeLast()`

---

## public class `org.mockito.internal.verification.SingleRegisteredInvocation`
implements `java.io.Serializable`, `org.mockito.internal.verification.RegisteredInvocations`  

**Constructors:**
- `public SingleRegisteredInvocation()`

**Methods:**
- `public void add(org.mockito.invocation.Invocation p0)`
- `public void clear()`
- `public java.util.List getAll()`
- `public boolean isEmpty()`
- `public void removeLast()`

---

## public class `org.mockito.internal.verification.Times`
implements `org.mockito.internal.verification.api.VerificationInOrderMode`, `org.mockito.verification.VerificationMode`  

**Constructors:**
- `public Times(int p0)`

**Methods:**
- `public org.mockito.verification.VerificationMode description(java.lang.String p0)`
- `public java.lang.String toString()`
- `public void verify(org.mockito.internal.verification.api.VerificationData p0)`
- `public void verifyInOrder(org.mockito.internal.verification.api.VerificationDataInOrder p0)`

---

## public class `org.mockito.internal.verification.VerificationDataImpl`
implements `org.mockito.internal.verification.api.VerificationData`  

**Constructors:**
- `public VerificationDataImpl(org.mockito.internal.stubbing.InvocationContainerImpl p0, org.mockito.internal.invocation.InvocationMatcher p1)`

**Methods:**
- `public java.util.List getAllInvocations()`
- `public org.mockito.invocation.MatchableInvocation getTarget()`

---

## public class `org.mockito.internal.verification.VerificationEventImpl`
implements `org.mockito.verification.VerificationEvent`  

**Constructors:**
- `public VerificationEventImpl(java.lang.Object p0, org.mockito.verification.VerificationMode p1, org.mockito.internal.verification.api.VerificationData p2, java.lang.Throwable p3)`

**Methods:**
- `public org.mockito.internal.verification.api.VerificationData getData()`
- `public java.lang.Object getMock()`
- `public org.mockito.verification.VerificationMode getMode()`
- `public java.lang.Throwable getVerificationError()`

---

## public final class `org.mockito.internal.verification.VerificationModeFactory`

**Methods:**
- `public static org.mockito.verification.VerificationMode atLeast(int p0)`
- `public static org.mockito.verification.VerificationMode atLeastOnce()`
- `public static org.mockito.verification.VerificationMode atMost(int p0)`
- `public static org.mockito.verification.VerificationMode atMostOnce()`
- `public static org.mockito.internal.verification.Calls calls(int p0)`
- `public static org.mockito.verification.VerificationMode description(org.mockito.verification.VerificationMode p0, java.lang.String p1)`
- `public static org.mockito.internal.verification.NoInteractions noInteractions()`
- `public static org.mockito.internal.verification.NoMoreInteractions noMoreInteractions()`
- `public static org.mockito.verification.VerificationMode only()`
- `public static org.mockito.internal.verification.Times times(int p0)`

---

## public class `org.mockito.internal.verification.VerificationOverTimeImpl`
implements `org.mockito.verification.VerificationMode`  

**Constructors:**
- `public VerificationOverTimeImpl(long p0, long p1, org.mockito.verification.VerificationMode p2, boolean p3)`
- `public VerificationOverTimeImpl(long p0, org.mockito.verification.VerificationMode p1, boolean p2, org.mockito.internal.util.Timer p3)`

**Methods:**
- `protected boolean canRecoverFromFailure(org.mockito.verification.VerificationMode p0)`
- `public org.mockito.internal.verification.VerificationOverTimeImpl copyWithVerificationMode(org.mockito.verification.VerificationMode p0)`
- `public org.mockito.verification.VerificationMode getDelegate()`
- `public long getPollingPeriodMillis()`
- `public org.mockito.internal.util.Timer getTimer()`
- `public boolean isReturnOnSuccess()`
- `public void verify(org.mockito.internal.verification.api.VerificationData p0)`

---

## public abstract class `org.mockito.internal.verification.VerificationWrapper`<WrapperT extends org.mockito.verification.VerificationMode>
implements `org.mockito.verification.VerificationMode`  

**Constructors:**
- `public VerificationWrapper(WrapperT p0)`

**Fields:**
- `protected final WrapperT wrappedVerification`

**Methods:**
- `public org.mockito.verification.VerificationMode atLeast(int p0)`
- `public org.mockito.verification.VerificationMode atLeastOnce()`
- `public org.mockito.verification.VerificationMode atMost(int p0)`
- `public org.mockito.verification.VerificationMode atMostOnce()`
- `protected abstract org.mockito.verification.VerificationMode copySelfWithNewVerificationMode(org.mockito.verification.VerificationMode p0)`
- `public org.mockito.verification.VerificationMode never()`
- `public org.mockito.verification.VerificationMode only()`
- `public org.mockito.verification.VerificationMode times(int p0)`
- `public void verify(org.mockito.internal.verification.api.VerificationData p0)`

---

## public class `org.mockito.internal.verification.VerificationWrapperInOrderWrapper`
implements `org.mockito.verification.VerificationMode`  

**Constructors:**
- `public VerificationWrapperInOrderWrapper(org.mockito.internal.verification.VerificationWrapper p0, org.mockito.internal.InOrderImpl p1)`

**Methods:**
- `public void verify(org.mockito.internal.verification.api.VerificationData p0)`

---

## public abstract interface `org.mockito.internal.verification.api.InOrderContext`

**Methods:**
- `public abstract boolean isVerified(org.mockito.invocation.Invocation p0)`
- `public abstract void markVerified(org.mockito.invocation.Invocation p0)`

---

## public abstract interface `org.mockito.internal.verification.api.VerificationData`

**Methods:**
- `public abstract java.util.List getAllInvocations()`
- `public abstract org.mockito.invocation.MatchableInvocation getTarget()`

---

## public abstract interface `org.mockito.internal.verification.api.VerificationDataInOrder`

**Methods:**
- `public abstract java.util.List getAllInvocations()`
- `public abstract org.mockito.internal.verification.api.InOrderContext getOrderingContext()`
- `public abstract org.mockito.invocation.MatchableInvocation getWanted()`

---

## public class `org.mockito.internal.verification.api.VerificationDataInOrderImpl`
implements `org.mockito.internal.verification.api.VerificationDataInOrder`  

**Constructors:**
- `public VerificationDataInOrderImpl(org.mockito.internal.verification.api.InOrderContext p0, java.util.List p1, org.mockito.invocation.MatchableInvocation p2)`

**Methods:**
- `public java.util.List getAllInvocations()`
- `public org.mockito.internal.verification.api.InOrderContext getOrderingContext()`
- `public org.mockito.invocation.MatchableInvocation getWanted()`

---

## public abstract interface `org.mockito.internal.verification.api.VerificationInOrderMode`

**Methods:**
- `public abstract void verifyInOrder(org.mockito.internal.verification.api.VerificationDataInOrder p0)`

---

## public class `org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool`

**Methods:**
- `public static java.util.List getNotMatchingArgsIndexes(java.util.List p0, java.lang.Object[] p1)`
- `public static java.util.Set getNotMatchingArgsWithSameName(java.util.List p0, java.lang.Object[] p1)`
- `public static java.lang.Integer[] getSuspiciouslyNotMatchingArgsIndexes(java.util.List p0, java.lang.Object[] p1)`

---

## public class `org.mockito.internal.verification.checkers.AtLeastDiscrepancy`
extends `org.mockito.internal.reporting.Discrepancy`  

**Constructors:**
- `public AtLeastDiscrepancy(int p0, int p1)`

**Methods:**
- `public java.lang.String getPluralizedWantedCount()`

---

## public final class `org.mockito.internal.verification.checkers.AtLeastXNumberOfInvocationsChecker`

**Methods:**
- `public static void checkAtLeastNumberOfInvocations(java.util.List p0, org.mockito.invocation.MatchableInvocation p1, int p2)`
- `public static void checkAtLeastNumberOfInvocations(java.util.List p0, org.mockito.invocation.MatchableInvocation p1, int p2, org.mockito.internal.verification.api.InOrderContext p3)`

---

## public class `org.mockito.internal.verification.checkers.MissingInvocationChecker`

**Methods:**
- `public static void checkMissingInvocation(java.util.List p0, org.mockito.invocation.MatchableInvocation p1)`
- `public static void checkMissingInvocation(java.util.List p0, org.mockito.invocation.MatchableInvocation p1, org.mockito.internal.verification.api.InOrderContext p2)`

---

## public class `org.mockito.internal.verification.checkers.NumberOfInvocationsChecker`

**Methods:**
- `public static void checkNumberOfInvocations(java.util.List p0, org.mockito.invocation.MatchableInvocation p1, int p2)`
- `public static void checkNumberOfInvocations(java.util.List p0, org.mockito.invocation.MatchableInvocation p1, int p2, org.mockito.internal.verification.api.InOrderContext p3)`
- `public static void checkNumberOfInvocationsNonGreedy(java.util.List p0, org.mockito.invocation.MatchableInvocation p1, int p2, org.mockito.internal.verification.api.InOrderContext p3)`

---

## public abstract interface `org.mockito.invocation.DescribedInvocation`

**Methods:**
- `public abstract org.mockito.invocation.Location getLocation()`
- `public abstract java.lang.String toString()`

---

## public abstract interface `org.mockito.invocation.Invocation`
annotations: @org.mockito.NotExtensible  
implements `org.mockito.invocation.DescribedInvocation`, `org.mockito.invocation.InvocationOnMock`  

**Methods:**
- `public abstract java.util.List getArgumentsAsMatchers()`
- `public abstract org.mockito.invocation.Location getLocation()`
- `public abstract java.lang.Class getRawReturnType()`
- `public abstract int getSequenceNumber()`
- `public abstract void ignoreForVerification()`
- `public abstract boolean isIgnoredForVerification()`
- `public abstract boolean isVerified()`
- `public abstract void markStubbed(org.mockito.invocation.StubInfo p0)`
- `public abstract void markVerified()`
- `public abstract org.mockito.invocation.StubInfo stubInfo()`

---

## public abstract interface `org.mockito.invocation.InvocationContainer`
annotations: @org.mockito.NotExtensible  

---

## public abstract interface `org.mockito.invocation.InvocationFactory`

**Methods:**
- `public abstract org.mockito.invocation.Invocation createInvocation(java.lang.Object p0, org.mockito.mock.MockCreationSettings p1, java.lang.reflect.Method p2, org.mockito.invocation.InvocationFactory$RealMethodBehavior p3, java.lang.Object... p4)`

---

## public abstract static interface `org.mockito.invocation.InvocationFactory$RealMethodBehavior`<R extends java.lang.Object>
implements `java.io.Serializable`  

**Methods:**
- `public abstract R call() throws java.lang.Throwable`

---

## public abstract interface `org.mockito.invocation.InvocationOnMock`
annotations: @org.mockito.NotExtensible  
implements `java.io.Serializable`  

**Methods:**
- `public abstract java.lang.Object callRealMethod() throws java.lang.Throwable`
- `public abstract <T extends java.lang.Object> T getArgument(int p0)`
- `public abstract <T extends java.lang.Object> T getArgument(int p0, java.lang.Class p1)`
- `public abstract java.lang.Object[] getArguments()`
- `public abstract java.lang.reflect.Method getMethod()`
- `public abstract java.lang.Object getMock()`
- `public abstract java.lang.Object[] getRawArguments()`

---

## public abstract interface `org.mockito.invocation.Location`
annotations: @org.mockito.NotExtensible  

**Methods:**
- `public abstract java.lang.String getSourceFile()`
- `public abstract java.lang.String toString()`

---

## public abstract interface `org.mockito.invocation.MatchableInvocation`
implements `org.mockito.invocation.DescribedInvocation`  

**Methods:**
- `public abstract void captureArgumentsFrom(org.mockito.invocation.Invocation p0)`
- `public abstract org.mockito.invocation.Invocation getInvocation()`
- `public abstract java.util.List getMatchers()`
- `public abstract boolean hasSameMethod(org.mockito.invocation.Invocation p0)`
- `public abstract boolean hasSimilarMethod(org.mockito.invocation.Invocation p0)`
- `public abstract boolean matches(org.mockito.invocation.Invocation p0)`

---

## public abstract interface `org.mockito.invocation.MockHandler`<T extends java.lang.Object>
implements `java.io.Serializable`  

**Methods:**
- `public abstract org.mockito.invocation.InvocationContainer getInvocationContainer()`
- `public abstract org.mockito.mock.MockCreationSettings getMockSettings()`
- `public abstract java.lang.Object handle(org.mockito.invocation.Invocation p0) throws java.lang.Throwable`

---

## public abstract interface `org.mockito.invocation.StubInfo`

**Methods:**
- `public abstract org.mockito.invocation.Location stubbedAt()`

---

## public final class `org.mockito.junit.MockitoJUnit`

**Methods:**
- `public static org.mockito.junit.VerificationCollector collector()`
- `public static org.mockito.junit.MockitoRule rule()`
- `public static org.mockito.junit.MockitoTestRule testRule(java.lang.Object p0)`

---

## public class `org.mockito.junit.MockitoJUnitRunner`
extends `org.junit.runner.Runner`  
implements `org.junit.runner.manipulation.Filterable`  

**Constructors:**
- `public MockitoJUnitRunner(java.lang.Class p0) throws java.lang.reflect.InvocationTargetException`

**Methods:**
- `public void filter(org.junit.runner.manipulation.Filter p0) throws org.junit.runner.manipulation.NoTestsRemainException`
- `public org.junit.runner.Description getDescription()`
- `public void run(org.junit.runner.notification.RunNotifier p0)`

---

## public static class `org.mockito.junit.MockitoJUnitRunner$Silent`
extends `org.mockito.junit.MockitoJUnitRunner`  

**Constructors:**
- `public Silent(java.lang.Class p0) throws java.lang.reflect.InvocationTargetException`

---

## public static class `org.mockito.junit.MockitoJUnitRunner$Strict`
extends `org.mockito.junit.MockitoJUnitRunner`  

**Constructors:**
- `public Strict(java.lang.Class p0) throws java.lang.reflect.InvocationTargetException`

---

## public static class `org.mockito.junit.MockitoJUnitRunner$StrictStubs`
extends `org.mockito.junit.MockitoJUnitRunner`  

**Constructors:**
- `public StrictStubs(java.lang.Class p0) throws java.lang.reflect.InvocationTargetException`

---

## public abstract interface `org.mockito.junit.MockitoRule`
implements `org.junit.rules.MethodRule`  

**Methods:**
- `public abstract org.mockito.junit.MockitoRule silent()`
- `public abstract org.mockito.junit.MockitoRule strictness(org.mockito.quality.Strictness p0)`

---

## public abstract interface `org.mockito.junit.MockitoTestRule`
implements `org.junit.rules.TestRule`  

**Methods:**
- `public abstract org.mockito.junit.MockitoTestRule silent()`
- `public abstract org.mockito.junit.MockitoTestRule strictness(org.mockito.quality.Strictness p0)`

---

## public abstract interface `org.mockito.junit.VerificationCollector`
implements `org.junit.rules.TestRule`  

**Methods:**
- `public abstract org.mockito.junit.VerificationCollector assertLazily()`
- `public abstract void collectAndReport() throws org.mockito.exceptions.base.MockitoAssertionError`

---

## public abstract interface `org.mockito.listeners.InvocationListener`

**Methods:**
- `public abstract void reportInvocation(org.mockito.listeners.MethodInvocationReport p0)`

---

## public abstract interface `org.mockito.listeners.MethodInvocationReport`

**Methods:**
- `public abstract org.mockito.invocation.DescribedInvocation getInvocation()`
- `public abstract java.lang.String getLocationOfStubbing()`
- `public abstract java.lang.Object getReturnedValue()`
- `public abstract java.lang.Throwable getThrowable()`
- `public abstract boolean threwException()`

---

## public abstract interface `org.mockito.listeners.MockCreationListener`
implements `org.mockito.listeners.MockitoListener`  

**Methods:**
- `public abstract void onMockCreated(java.lang.Object p0, org.mockito.mock.MockCreationSettings p1)`
- `public default void onStaticMockCreated(java.lang.Class p0, org.mockito.mock.MockCreationSettings p1)`

---

## public abstract interface `org.mockito.listeners.MockitoListener`

---

## public abstract interface `org.mockito.listeners.StubbingLookupEvent`

**Methods:**
- `public abstract java.util.Collection getAllStubbings()`
- `public abstract org.mockito.invocation.Invocation getInvocation()`
- `public abstract org.mockito.mock.MockCreationSettings getMockSettings()`
- `public abstract org.mockito.stubbing.Stubbing getStubbingFound()`

---

## public abstract interface `org.mockito.listeners.StubbingLookupListener`

**Methods:**
- `public abstract void onStubbingLookup(org.mockito.listeners.StubbingLookupEvent p0)`

---

## public abstract interface `org.mockito.listeners.VerificationListener`
implements `org.mockito.listeners.MockitoListener`  

**Methods:**
- `public abstract void onVerification(org.mockito.verification.VerificationEvent p0)`

---

## public abstract interface `org.mockito.listeners.VerificationStartedEvent`

**Methods:**
- `public abstract java.lang.Object getMock()`
- `public abstract void setMock(java.lang.Object p0)`

---

## public abstract interface `org.mockito.listeners.VerificationStartedListener`

**Methods:**
- `public abstract void onVerificationStarted(org.mockito.listeners.VerificationStartedEvent p0)`

---

## public abstract interface `org.mockito.mock.MockCreationSettings`<T extends java.lang.Object>
annotations: @org.mockito.NotExtensible  

**Methods:**
- `public abstract java.lang.Object[] getConstructorArgs()`
- `public abstract org.mockito.stubbing.Answer getDefaultAnswer()`
- `public abstract java.util.Set getExtraInterfaces()`
- `public abstract java.util.List getInvocationListeners()`
- `public abstract java.lang.String getMockMaker()`
- `public abstract org.mockito.mock.MockName getMockName()`
- `public abstract java.lang.Object getOuterClassInstance()`
- `public abstract org.mockito.mock.SerializableMode getSerializableMode()`
- `public abstract java.lang.Object getSpiedInstance()`
- `public abstract org.mockito.quality.Strictness getStrictness()`
- `public abstract java.util.List getStubbingLookupListeners()`
- `public abstract java.lang.Class getTypeToMock()`
- `public abstract java.util.List getVerificationStartedListeners()`
- `public abstract boolean isLenient()`
- `public abstract boolean isSerializable()`
- `public abstract boolean isStripAnnotations()`
- `public abstract boolean isStubOnly()`
- `public abstract boolean isUsingConstructor()`

---

## public abstract interface `org.mockito.mock.MockName`

**Methods:**
- `public abstract boolean isDefault()`
- `public abstract java.lang.String toString()`

---

## public final enum `org.mockito.mock.SerializableMode`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.mockito.mock.SerializableMode ACROSS_CLASSLOADERS`
- `public final static org.mockito.mock.SerializableMode BASIC`
- `public final static org.mockito.mock.SerializableMode NONE`

---

## public abstract interface `org.mockito.plugins.AnnotationEngine`

**Methods:**
- `public abstract java.lang.AutoCloseable process(java.lang.Class p0, java.lang.Object p1)`

---

## public static class `org.mockito.plugins.AnnotationEngine$NoAction`
implements `java.lang.AutoCloseable`  

**Constructors:**
- `public NoAction()`

**Methods:**
- `public void close()`

---

## public abstract interface `org.mockito.plugins.DoNotMockEnforcer`

**Methods:**
- `public abstract java.lang.String checkTypeForDoNotMockViolation(java.lang.Class p0)`

---

## public abstract interface `org.mockito.plugins.InlineMockMaker`
implements `org.mockito.plugins.MockMaker`  

**Methods:**
- `public abstract void clearAllMocks()`
- `public abstract void clearMock(java.lang.Object p0)`

---

## public abstract interface `org.mockito.plugins.InstantiatorProvider2`

**Methods:**
- `public abstract org.mockito.creation.instance.Instantiator getInstantiator(org.mockito.mock.MockCreationSettings p0)`

---

## public abstract interface `org.mockito.plugins.MemberAccessor`

**Methods:**
- `public abstract java.lang.Object get(java.lang.reflect.Field p0, java.lang.Object p1) throws java.lang.IllegalAccessException`
- `public abstract java.lang.Object invoke(java.lang.reflect.Method p0, java.lang.Object p1, java.lang.Object... p2) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException`
- `public abstract java.lang.Object newInstance(java.lang.reflect.Constructor p0, java.lang.Object... p1) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException`
- `public default java.lang.Object newInstance(java.lang.reflect.Constructor p0, org.mockito.plugins.MemberAccessor$OnConstruction p1, java.lang.Object... p2) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException`
- `public abstract void set(java.lang.reflect.Field p0, java.lang.Object p1, java.lang.Object p2) throws java.lang.IllegalAccessException`

---

## public abstract static interface `org.mockito.plugins.MemberAccessor$ConstructionDispatcher`

**Methods:**
- `public abstract java.lang.Object newInstance() throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException`

---

## public abstract static interface `org.mockito.plugins.MemberAccessor$OnConstruction`

**Methods:**
- `public abstract java.lang.Object invoke(org.mockito.plugins.MemberAccessor$ConstructionDispatcher p0) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException`

---

## public abstract interface `org.mockito.plugins.MockMaker`

**Methods:**
- `public default void clearAllCaches()`
- `public default <T extends java.lang.Object> org.mockito.plugins.MockMaker$ConstructionMockControl createConstructionMock(java.lang.Class p0, java.util.function.Function p1, java.util.function.Function p2, org.mockito.MockedConstruction$MockInitializer p3)`
- `public abstract <T extends java.lang.Object> T createMock(org.mockito.mock.MockCreationSettings p0, org.mockito.invocation.MockHandler p1)`
- `public default <T extends java.lang.Object> java.util.Optional createSpy(org.mockito.mock.MockCreationSettings p0, org.mockito.invocation.MockHandler p1, T p2)`
- `public default <T extends java.lang.Object> org.mockito.plugins.MockMaker$StaticMockControl createStaticMock(java.lang.Class p0, org.mockito.mock.MockCreationSettings p1, org.mockito.invocation.MockHandler p2)`
- `public abstract org.mockito.invocation.MockHandler getHandler(java.lang.Object p0)`
- `public abstract org.mockito.plugins.MockMaker$TypeMockability isTypeMockable(java.lang.Class p0)`
- `public abstract void resetMock(java.lang.Object p0, org.mockito.invocation.MockHandler p1, org.mockito.mock.MockCreationSettings p2)`

---

## public abstract static interface `org.mockito.plugins.MockMaker$ConstructionMockControl`<T extends java.lang.Object>

**Methods:**
- `public abstract void disable()`
- `public abstract void enable()`
- `public abstract java.util.List getMocks()`
- `public abstract java.lang.Class getType()`

---

## public abstract static interface `org.mockito.plugins.MockMaker$StaticMockControl`<T extends java.lang.Object>

**Methods:**
- `public abstract void disable()`
- `public abstract void enable()`
- `public abstract java.lang.Class getType()`

---

## public abstract static interface `org.mockito.plugins.MockMaker$TypeMockability`

**Methods:**
- `public abstract boolean mockable()`
- `public abstract java.lang.String nonMockableReason()`

---

## public abstract interface `org.mockito.plugins.MockResolver`

**Methods:**
- `public abstract java.lang.Object resolve(java.lang.Object p0)`

---

## public abstract interface `org.mockito.plugins.MockitoLogger`

**Methods:**
- `public abstract void log(java.lang.Object p0)`

---

## public abstract interface `org.mockito.plugins.MockitoPlugins`

**Methods:**
- `public abstract <T extends java.lang.Object> T getDefaultPlugin(java.lang.Class p0)`
- `public abstract org.mockito.plugins.MockMaker getInlineMockMaker()`

---

## public abstract interface `org.mockito.plugins.PluginSwitch`

**Methods:**
- `public abstract boolean isEnabled(java.lang.String p0)`

---

## public abstract interface `org.mockito.plugins.StackTraceCleanerProvider`

**Methods:**
- `public abstract org.mockito.exceptions.stacktrace.StackTraceCleaner getStackTraceCleaner(org.mockito.exceptions.stacktrace.StackTraceCleaner p0)`

---

## public abstract interface `org.mockito.quality.MockitoHint`

---

## public final enum `org.mockito.quality.Strictness`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.mockito.quality.Strictness LENIENT`
- `public final static org.mockito.quality.Strictness STRICT_STUBS`
- `public final static org.mockito.quality.Strictness WARN`

---

## public abstract interface `org.mockito.session.MockitoSessionBuilder`
annotations: @org.mockito.NotExtensible  

**Methods:**
- `public abstract org.mockito.session.MockitoSessionBuilder initMocks(java.lang.Object p0)`
- `public abstract org.mockito.session.MockitoSessionBuilder initMocks(java.lang.Object... p0)`
- `public abstract org.mockito.session.MockitoSessionBuilder logger(org.mockito.session.MockitoSessionLogger p0)`
- `public abstract org.mockito.session.MockitoSessionBuilder name(java.lang.String p0)`
- `public abstract org.mockito.MockitoSession startMocking() throws org.mockito.exceptions.misusing.UnfinishedMockingSessionException`
- `public abstract org.mockito.session.MockitoSessionBuilder strictness(org.mockito.quality.Strictness p0)`

---

## public abstract interface `org.mockito.session.MockitoSessionLogger`
annotations: @org.mockito.NotExtensible  

**Methods:**
- `public abstract void log(java.lang.String p0)`

---

## public abstract interface `org.mockito.stubbing.Answer`<T extends java.lang.Object>

**Methods:**
- `public abstract T answer(org.mockito.invocation.InvocationOnMock p0) throws java.lang.Throwable`

---

## public abstract interface `org.mockito.stubbing.Answer1`<T extends java.lang.Object, A0 extends java.lang.Object>

**Methods:**
- `public abstract T answer(A0 p0) throws java.lang.Throwable`

---

## public abstract interface `org.mockito.stubbing.Answer2`<T extends java.lang.Object, A0 extends java.lang.Object, A1 extends java.lang.Object>

**Methods:**
- `public abstract T answer(A0 p0, A1 p1) throws java.lang.Throwable`

---

## public abstract interface `org.mockito.stubbing.Answer3`<T extends java.lang.Object, A0 extends java.lang.Object, A1 extends java.lang.Object, A2 extends java.lang.Object>

**Methods:**
- `public abstract T answer(A0 p0, A1 p1, A2 p2) throws java.lang.Throwable`

---

## public abstract interface `org.mockito.stubbing.Answer4`<T extends java.lang.Object, A0 extends java.lang.Object, A1 extends java.lang.Object, A2 extends java.lang.Object, A3 extends java.lang.Object>

**Methods:**
- `public abstract T answer(A0 p0, A1 p1, A2 p2, A3 p3) throws java.lang.Throwable`

---

## public abstract interface `org.mockito.stubbing.Answer5`<T extends java.lang.Object, A0 extends java.lang.Object, A1 extends java.lang.Object, A2 extends java.lang.Object, A3 extends java.lang.Object, A4 extends java.lang.Object>

**Methods:**
- `public abstract T answer(A0 p0, A1 p1, A2 p2, A3 p3, A4 p4) throws java.lang.Throwable`

---

## public abstract interface `org.mockito.stubbing.Answer6`<T extends java.lang.Object, A0 extends java.lang.Object, A1 extends java.lang.Object, A2 extends java.lang.Object, A3 extends java.lang.Object, A4 extends java.lang.Object, A5 extends java.lang.Object>

**Methods:**
- `public abstract T answer(A0 p0, A1 p1, A2 p2, A3 p3, A4 p4, A5 p5) throws java.lang.Throwable`

---

## public abstract interface `org.mockito.stubbing.BaseStubber`
annotations: @org.mockito.NotExtensible  

**Methods:**
- `public abstract org.mockito.stubbing.Stubber doAnswer(org.mockito.stubbing.Answer p0)`
- `public abstract org.mockito.stubbing.Stubber doCallRealMethod()`
- `public abstract org.mockito.stubbing.Stubber doNothing()`
- `public abstract org.mockito.stubbing.Stubber doReturn(java.lang.Object p0)`
- `public abstract org.mockito.stubbing.Stubber doReturn(java.lang.Object p0, java.lang.Object... p1)`
- `public abstract org.mockito.stubbing.Stubber doThrow(java.lang.Class p0)`
- `public abstract org.mockito.stubbing.Stubber doThrow(java.lang.Class p0, java.lang.Class... p1)`
- `public abstract org.mockito.stubbing.Stubber doThrow(java.lang.Throwable... p0)`

---

## public abstract interface `org.mockito.stubbing.LenientStubber`
annotations: @org.mockito.NotExtensible  
implements `org.mockito.stubbing.BaseStubber`  

**Methods:**
- `public abstract <T extends java.lang.Object> org.mockito.stubbing.OngoingStubbing when(T p0)`

---

## public abstract interface `org.mockito.stubbing.OngoingStubbing`<T extends java.lang.Object>
annotations: @org.mockito.NotExtensible  

**Methods:**
- `public abstract <M extends java.lang.Object> M getMock()`
- `public abstract org.mockito.stubbing.OngoingStubbing then(org.mockito.stubbing.Answer p0)`
- `public abstract org.mockito.stubbing.OngoingStubbing thenAnswer(org.mockito.stubbing.Answer p0)`
- `public abstract org.mockito.stubbing.OngoingStubbing thenCallRealMethod()`
- `public abstract org.mockito.stubbing.OngoingStubbing thenReturn(T p0)`
- `public abstract org.mockito.stubbing.OngoingStubbing thenReturn(T p0, T... p1)`
- `public abstract org.mockito.stubbing.OngoingStubbing thenThrow(java.lang.Class p0)`
- `public abstract org.mockito.stubbing.OngoingStubbing thenThrow(java.lang.Class p0, java.lang.Class... p1)`
- `public abstract org.mockito.stubbing.OngoingStubbing thenThrow(java.lang.Throwable... p0)`

---

## public abstract interface `org.mockito.stubbing.Stubber`
annotations: @org.mockito.CheckReturnValue, @org.mockito.NotExtensible  
implements `org.mockito.stubbing.BaseStubber`  

**Methods:**
- `public abstract <T extends java.lang.Object> T when(T p0)`

---

## public abstract interface `org.mockito.stubbing.Stubbing`
annotations: @org.mockito.NotExtensible  
implements `org.mockito.stubbing.Answer`  

**Methods:**
- `public abstract org.mockito.invocation.Invocation getInvocation()`
- `public abstract org.mockito.quality.Strictness getStrictness()`
- `public abstract boolean wasUsed()`

---

## public abstract interface `org.mockito.stubbing.ValidableAnswer`

**Methods:**
- `public abstract void validateFor(org.mockito.invocation.InvocationOnMock p0)`

---

## public abstract interface `org.mockito.stubbing.VoidAnswer1`<A0 extends java.lang.Object>

**Methods:**
- `public abstract void answer(A0 p0) throws java.lang.Throwable`

---

## public abstract interface `org.mockito.stubbing.VoidAnswer2`<A0 extends java.lang.Object, A1 extends java.lang.Object>

**Methods:**
- `public abstract void answer(A0 p0, A1 p1) throws java.lang.Throwable`

---

## public abstract interface `org.mockito.stubbing.VoidAnswer3`<A0 extends java.lang.Object, A1 extends java.lang.Object, A2 extends java.lang.Object>

**Methods:**
- `public abstract void answer(A0 p0, A1 p1, A2 p2) throws java.lang.Throwable`

---

## public abstract interface `org.mockito.stubbing.VoidAnswer4`<A0 extends java.lang.Object, A1 extends java.lang.Object, A2 extends java.lang.Object, A3 extends java.lang.Object>

**Methods:**
- `public abstract void answer(A0 p0, A1 p1, A2 p2, A3 p3) throws java.lang.Throwable`

---

## public abstract interface `org.mockito.stubbing.VoidAnswer5`<A0 extends java.lang.Object, A1 extends java.lang.Object, A2 extends java.lang.Object, A3 extends java.lang.Object, A4 extends java.lang.Object>

**Methods:**
- `public abstract void answer(A0 p0, A1 p1, A2 p2, A3 p3, A4 p4) throws java.lang.Throwable`

---

## public abstract interface `org.mockito.stubbing.VoidAnswer6`<A0 extends java.lang.Object, A1 extends java.lang.Object, A2 extends java.lang.Object, A3 extends java.lang.Object, A4 extends java.lang.Object, A5 extends java.lang.Object>

**Methods:**
- `public abstract void answer(A0 p0, A1 p1, A2 p2, A3 p3, A4 p4, A5 p5) throws java.lang.Throwable`

---

## public class `org.mockito.verification.After`
extends `org.mockito.internal.verification.VerificationWrapper`  
implements `org.mockito.verification.VerificationAfterDelay`  

**Constructors:**
- `public After(long p0, org.mockito.verification.VerificationMode p1)`

**Methods:**
- `protected org.mockito.verification.VerificationMode copySelfWithNewVerificationMode(org.mockito.verification.VerificationMode p0)`
- `public java.lang.String toString()`

---

## public class `org.mockito.verification.Timeout`
extends `org.mockito.internal.verification.VerificationWrapper`  
implements `org.mockito.verification.VerificationWithTimeout`  

**Constructors:**
- `public Timeout(long p0, org.mockito.verification.VerificationMode p1)`

**Methods:**
- `public org.mockito.verification.VerificationMode atMost(int p0)`
- `protected org.mockito.verification.VerificationMode copySelfWithNewVerificationMode(org.mockito.verification.VerificationMode p0)`
- `public org.mockito.verification.VerificationMode never()`
- `public java.lang.String toString()`

---

## public abstract interface `org.mockito.verification.VerificationAfterDelay`
implements `org.mockito.verification.VerificationMode`  

**Methods:**
- `public abstract org.mockito.verification.VerificationMode atLeast(int p0)`
- `public abstract org.mockito.verification.VerificationMode atLeastOnce()`
- `public abstract org.mockito.verification.VerificationMode atMost(int p0)`
- `public abstract org.mockito.verification.VerificationMode atMostOnce()`
- `public abstract org.mockito.verification.VerificationMode never()`
- `public abstract org.mockito.verification.VerificationMode only()`
- `public abstract org.mockito.verification.VerificationMode times(int p0)`

---

## public abstract interface `org.mockito.verification.VerificationEvent`

**Methods:**
- `public abstract org.mockito.internal.verification.api.VerificationData getData()`
- `public abstract java.lang.Object getMock()`
- `public abstract org.mockito.verification.VerificationMode getMode()`
- `public abstract java.lang.Throwable getVerificationError()`

---

## public abstract interface `org.mockito.verification.VerificationMode`

**Methods:**
- `public default org.mockito.verification.VerificationMode description(java.lang.String p0)`
- `public abstract void verify(org.mockito.internal.verification.api.VerificationData p0)`

---

## public abstract interface `org.mockito.verification.VerificationStrategy`

**Methods:**
- `public abstract org.mockito.verification.VerificationMode maybeVerifyLazily(org.mockito.verification.VerificationMode p0)`

---

## public abstract interface `org.mockito.verification.VerificationWithTimeout`
implements `org.mockito.verification.VerificationMode`  

**Methods:**
- `public abstract org.mockito.verification.VerificationMode atLeast(int p0)`
- `public abstract org.mockito.verification.VerificationMode atLeastOnce()`
- `public abstract org.mockito.verification.VerificationMode only()`
- `public abstract org.mockito.verification.VerificationMode times(int p0)`

---

