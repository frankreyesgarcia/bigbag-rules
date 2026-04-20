# API Specification: ch.qos.logback:logback-core 1.2.9

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public abstract interface `ch.qos.logback.core.Appender`<E extends java.lang.Object>
implements `ch.qos.logback.core.spi.ContextAware`, `ch.qos.logback.core.spi.FilterAttachable<E>`, `ch.qos.logback.core.spi.LifeCycle`  

**Methods:**
- `public abstract void doAppend(E p0) throws ch.qos.logback.core.LogbackException`
- `public abstract java.lang.String getName()`
- `public abstract void setName(java.lang.String p0)`

---

## public abstract class `ch.qos.logback.core.AppenderBase`<E extends java.lang.Object>
extends `ch.qos.logback.core.spi.ContextAwareBase`  
implements `ch.qos.logback.core.Appender<E>`  

**Constructors:**
- `public AppenderBase()`

**Fields:**
- `protected java.lang.String name`
- `protected volatile boolean started`

**Methods:**
- `public void addFilter(ch.qos.logback.core.filter.Filter p0)`
- `protected abstract void append(E p0)`
- `public void clearAllFilters()`
- `public synchronized void doAppend(E p0)`
- `public java.util.List getCopyOfAttachedFiltersList()`
- `public ch.qos.logback.core.spi.FilterReply getFilterChainDecision(E p0)`
- `public java.lang.String getName()`
- `public boolean isStarted()`
- `public void setName(java.lang.String p0)`
- `public void start()`
- `public void stop()`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.core.AsyncAppenderBase`<E extends java.lang.Object>
extends `ch.qos.logback.core.UnsynchronizedAppenderBase`  
implements `ch.qos.logback.core.spi.AppenderAttachable<E>`  

**Constructors:**
- `public AsyncAppenderBase()`

**Fields:**
- `public final static int DEFAULT_MAX_FLUSH_TIME`
- `public final static int DEFAULT_QUEUE_SIZE`

**Methods:**
- `public void addAppender(ch.qos.logback.core.Appender p0)`
- `protected void append(E p0)`
- `public void detachAndStopAllAppenders()`
- `public boolean detachAppender(ch.qos.logback.core.Appender p0)`
- `public boolean detachAppender(java.lang.String p0)`
- `public ch.qos.logback.core.Appender getAppender(java.lang.String p0)`
- `public int getDiscardingThreshold()`
- `public int getMaxFlushTime()`
- `public int getNumberOfElementsInQueue()`
- `public int getQueueSize()`
- `public int getRemainingCapacity()`
- `public boolean isAttached(ch.qos.logback.core.Appender p0)`
- `protected boolean isDiscardable(E p0)`
- `public boolean isNeverBlock()`
- `public java.util.Iterator iteratorForAppenders()`
- `protected void preprocess(E p0)`
- `public void setDiscardingThreshold(int p0)`
- `public void setMaxFlushTime(int p0)`
- `public void setNeverBlock(boolean p0)`
- `public void setQueueSize(int p0)`
- `public void start()`
- `public void stop()`

---

## public class `ch.qos.logback.core.BasicStatusManager`
implements `ch.qos.logback.core.status.StatusManager`  

**Constructors:**
- `public BasicStatusManager()`

**Fields:**
- `public final static int MAX_HEADER_COUNT`
- `public final static int TAIL_SIZE`
- `protected final java.util.List statusList`
- `protected final ch.qos.logback.core.spi.LogbackLock statusListLock`
- `protected final java.util.List statusListenerList`
- `protected final ch.qos.logback.core.spi.LogbackLock statusListenerListLock`
- `protected final ch.qos.logback.core.helpers.CyclicBuffer tailBuffer`

**Methods:**
- `public void add(ch.qos.logback.core.status.Status p0)`
- `public boolean add(ch.qos.logback.core.status.StatusListener p0)`
- `public void clear()`
- `public java.util.List getCopyOfStatusList()`
- `public java.util.List getCopyOfStatusListenerList()`
- `public int getCount()`
- `public int getLevel()`
- `public void remove(ch.qos.logback.core.status.StatusListener p0)`

---

## public class `ch.qos.logback.core.ConsoleAppender`<E extends java.lang.Object>
extends `ch.qos.logback.core.OutputStreamAppender`  

**Constructors:**
- `public ConsoleAppender()`

**Fields:**
- `protected ch.qos.logback.core.joran.spi.ConsoleTarget target`
- `protected boolean withJansi`

**Methods:**
- `public java.lang.String getTarget()`
- `public boolean isWithJansi()`
- `public void setTarget(java.lang.String p0)`
- `public void setWithJansi(boolean p0)`
- `public void start()`

---

## public abstract interface `ch.qos.logback.core.Context`
implements `ch.qos.logback.core.spi.PropertyContainer`  

**Methods:**
- `public abstract void addScheduledFuture(java.util.concurrent.ScheduledFuture p0)`
- `public abstract long getBirthTime()`
- `public abstract java.lang.Object getConfigurationLock()`
- `public abstract java.util.Map getCopyOfPropertyMap()`
- `public abstract java.util.concurrent.ExecutorService getExecutorService()`
- `public abstract java.lang.String getName()`
- `public abstract java.lang.Object getObject(java.lang.String p0)`
- `public abstract java.lang.String getProperty(java.lang.String p0)`
- `public abstract java.util.concurrent.ScheduledExecutorService getScheduledExecutorService()`
- `public abstract ch.qos.logback.core.status.StatusManager getStatusManager()`
- `public abstract void putObject(java.lang.String p0, java.lang.Object p1)`
- `public abstract void putProperty(java.lang.String p0, java.lang.String p1)`
- `public abstract void register(ch.qos.logback.core.spi.LifeCycle p0)`
- `public abstract void setName(java.lang.String p0)`

---

## public class `ch.qos.logback.core.ContextBase`
implements `ch.qos.logback.core.Context`, `ch.qos.logback.core.spi.LifeCycle`  

**Constructors:**
- `public ContextBase()`

**Fields:**
- `protected java.util.List scheduledFutures`

**Methods:**
- `public void addScheduledFuture(java.util.concurrent.ScheduledFuture p0)`
- `public long getBirthTime()`
- `public java.lang.Object getConfigurationLock()`
- `public java.util.Map getCopyOfPropertyMap()`
- `public synchronized java.util.concurrent.ExecutorService getExecutorService()`
- `public java.lang.String getName()`
- `public java.lang.Object getObject(java.lang.String p0)`
- `public java.lang.String getProperty(java.lang.String p0)`
- `public synchronized java.util.concurrent.ScheduledExecutorService getScheduledExecutorService()`
- `public java.util.List getScheduledFutures()`
- `public ch.qos.logback.core.status.StatusManager getStatusManager()`
- `protected void initCollisionMaps()`
- `public boolean isStarted()`
- `public void putObject(java.lang.String p0, java.lang.Object p1)`
- `public void putProperty(java.lang.String p0, java.lang.String p1)`
- `public void register(ch.qos.logback.core.spi.LifeCycle p0)`
- `public void removeObject(java.lang.String p0)`
- `public void reset()`
- `public void setName(java.lang.String p0) throws java.lang.IllegalStateException`
- `public void setStatusManager(ch.qos.logback.core.status.StatusManager p0)`
- `public void start()`
- `public void stop()`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.core.CoreConstants`

**Constructors:**
- `public CoreConstants()`

**Fields:**
- `public final static int BYTES_PER_INT`
- `public final static java.lang.String CAUSED_BY`
- `public final static java.lang.String CLF_DATE_PATTERN`
- `public final static java.lang.String CODES_URL`
- `public final static char COLON_CHAR`
- `public final static char COMMA_CHAR`
- `public final static java.lang.String CONFIGURATION_WATCH_LIST`
- `public final static java.lang.String CONFIGURATION_WATCH_LIST_RESET_X`
- `public final static java.lang.String CONTEXT_NAME_KEY`
- `public final static java.lang.String CONTEXT_SCOPE_VALUE`
- `public final static int CORE_POOL_SIZE`
- `public final static char CURLY_LEFT`
- `public final static char CURLY_RIGHT`
- `public final static java.lang.String DAILY_DATE_PATTERN`
- `public final static char DASH_CHAR`
- `public final static java.lang.String DEFAULT_CONTEXT_NAME`
- `public final static java.lang.String DEFAULT_VALUE_SEPARATOR`
- `public final static java.lang.String DISABLE_SERVLET_CONTAINER_INITIALIZER_KEY`
- `public final static char DOLLAR`
- `public final static char DOT`
- `public final static char DOUBLE_QUOTE_CHAR`
- `public final static java.lang.Class[] EMPTY_CLASS_ARRAY`
- `public final static java.lang.String EMPTY_STRING`
- `public final static java.lang.String[] EMPTY_STRING_ARRAY`
- `public final static char ESCAPE_CHAR`
- `public final static java.lang.String EVALUATOR_MAP`
- `public final static java.lang.String FA_FILENAME_COLLISION_MAP`
- `public final static java.lang.String HOSTNAME_KEY`
- `public final static java.lang.String ISO8601_PATTERN`
- `public final static java.lang.String ISO8601_STR`
- `public final static java.lang.String JNDI_COMP_PREFIX`
- `public final static java.lang.String JNDI_JAVA_NAMESPACE`
- `public final static java.lang.String LEFT_ACCOLADE`
- `public final static char LEFT_PARENTHESIS_CHAR`
- `public final static java.lang.String LINE_SEPARATOR`
- `public final static int LINE_SEPARATOR_LEN`
- `public final static java.lang.String MANUAL_URL_PREFIX`
- `public final static int MAX_ERROR_COUNT`
- `public final static int MAX_POOL_SIZE`
- `public final static long MILLIS_IN_ONE_DAY`
- `public final static long MILLIS_IN_ONE_HOUR`
- `public final static long MILLIS_IN_ONE_MINUTE`
- `public final static long MILLIS_IN_ONE_SECOND`
- `public final static long MILLIS_IN_ONE_WEEK`
- `public final static java.lang.String MORE_INFO_PREFIX`
- `public final static int OOS_RESET_FREQUENCY`
- `public final static java.lang.String PATTERN_RULE_REGISTRY`
- `public final static char PERCENT_CHAR`
- `public final static java.lang.String RECONFIGURE_ON_CHANGE_TASK`
- `public static long REFERENCE_BIPS`
- `public final static java.lang.String RESET_MSG_PREFIX`
- `public final static java.lang.String RFA_FILENAME_PATTERN_COLLISION_MAP`
- `public final static java.lang.String RIGHT_ACCOLADE`
- `public final static char RIGHT_PARENTHESIS_CHAR`
- `public final static java.lang.String SAFE_JORAN_CONFIGURATION`
- `public final static int SCHEDULED_EXECUTOR_POOL_SIZE`
- `public final static int SECONDS_TO_WAIT_FOR_COMPRESSION_JOBS`
- `public final static java.lang.String SEE_FNP_NOT_SET`
- `public final static java.lang.String SEE_MISSING_INTEGER_TOKEN`
- `public final static java.lang.String SHUTDOWN_HOOK_THREAD`
- `public final static char SINGLE_QUOTE_CHAR`
- `public final static java.lang.String SIZE_AND_TIME_BASED_FNATP_IS_DEPRECATED`
- `public final static java.lang.String STATUS_LISTENER_CLASS_KEY`
- `public final static java.lang.String SUPPRESSED`
- `public final static java.lang.String SYSOUT`
- `public final static char TAB`
- `public final static int TABLE_ROW_LIMIT`
- `public final static long UNBOUNDED_TOTAL_SIZE_CAP`
- `public final static int UNBOUND_HISTORY`
- `public final static java.lang.String UNDEFINED_PROPERTY_SUFFIX`
- `public final static java.lang.String UNKNOWN_LOCALHOST`
- `public final static java.lang.String VALUE_OF`
- `public final static java.lang.String WRAPPED_BY`
- `public final static java.lang.String XML_PARSING`

---

## public class `ch.qos.logback.core.FileAppender`<E extends java.lang.Object>
extends `ch.qos.logback.core.OutputStreamAppender`  

**Constructors:**
- `public FileAppender()`

**Fields:**
- `protected static java.lang.String COLLISION_WITH_EARLIER_APPENDER_URL`
- `public final static long DEFAULT_BUFFER_SIZE`
- `protected boolean append`
- `protected java.lang.String fileName`

**Methods:**
- `protected void addErrorForCollision(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `protected boolean checkForFileCollisionInPreviousFileAppenders()`
- `public java.lang.String getFile()`
- `public boolean isAppend()`
- `public boolean isPrudent()`
- `public void openFile(java.lang.String p0) throws java.io.IOException`
- `public final java.lang.String rawFileProperty()`
- `public void setAppend(boolean p0)`
- `public void setBufferSize(ch.qos.logback.core.util.FileSize p0)`
- `public void setFile(java.lang.String p0)`
- `public void setPrudent(boolean p0)`
- `public void start()`
- `public void stop()`
- `protected void writeOut(E p0) throws java.io.IOException`

---

## public abstract interface `ch.qos.logback.core.Layout`<E extends java.lang.Object>
implements `ch.qos.logback.core.spi.ContextAware`, `ch.qos.logback.core.spi.LifeCycle`  

**Methods:**
- `public abstract java.lang.String doLayout(E p0)`
- `public abstract java.lang.String getContentType()`
- `public abstract java.lang.String getFileFooter()`
- `public abstract java.lang.String getFileHeader()`
- `public abstract java.lang.String getPresentationFooter()`
- `public abstract java.lang.String getPresentationHeader()`

---

## public abstract class `ch.qos.logback.core.LayoutBase`<E extends java.lang.Object>
extends `ch.qos.logback.core.spi.ContextAwareBase`  
implements `ch.qos.logback.core.Layout<E>`  

**Constructors:**
- `public LayoutBase()`

**Fields:**
- `protected boolean started`

**Methods:**
- `public java.lang.String getContentType()`
- `public ch.qos.logback.core.Context getContext()`
- `public java.lang.String getFileFooter()`
- `public java.lang.String getFileHeader()`
- `public java.lang.String getPresentationFooter()`
- `public java.lang.String getPresentationHeader()`
- `public boolean isStarted()`
- `public void setContext(ch.qos.logback.core.Context p0)`
- `public void setFileFooter(java.lang.String p0)`
- `public void setFileHeader(java.lang.String p0)`
- `public void setPresentationFooter(java.lang.String p0)`
- `public void setPresentationHeader(java.lang.String p0)`
- `public void start()`
- `public void stop()`

---

## public class `ch.qos.logback.core.LifeCycleManager`

**Constructors:**
- `public LifeCycleManager()`

**Methods:**
- `public void register(ch.qos.logback.core.spi.LifeCycle p0)`
- `public void reset()`

---

## public class `ch.qos.logback.core.LogbackException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public LogbackException(java.lang.String p0)`
- `public LogbackException(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `ch.qos.logback.core.OutputStreamAppender`<E extends java.lang.Object>
extends `ch.qos.logback.core.UnsynchronizedAppenderBase`  

**Constructors:**
- `public OutputStreamAppender()`

**Fields:**
- `protected ch.qos.logback.core.encoder.Encoder encoder`
- `protected final java.util.concurrent.locks.ReentrantLock lock`

**Methods:**
- `protected void append(E p0)`
- `protected void closeOutputStream()`
- `public ch.qos.logback.core.encoder.Encoder getEncoder()`
- `public java.io.OutputStream getOutputStream()`
- `public boolean isImmediateFlush()`
- `public void setEncoder(ch.qos.logback.core.encoder.Encoder p0)`
- `public void setImmediateFlush(boolean p0)`
- `public void setLayout(ch.qos.logback.core.Layout p0)`
- `public void setOutputStream(java.io.OutputStream p0)`
- `public void start()`
- `public void stop()`
- `protected void subAppend(E p0)`
- `protected void writeOut(E p0) throws java.io.IOException`

---

## public abstract class `ch.qos.logback.core.PropertyDefinerBase`
extends `ch.qos.logback.core.spi.ContextAwareBase`  
implements `ch.qos.logback.core.spi.PropertyDefiner`  

**Constructors:**
- `public PropertyDefinerBase()`

**Methods:**
- `protected static java.lang.String booleanAsStr(boolean p0)`

---

## public abstract class `ch.qos.logback.core.UnsynchronizedAppenderBase`<E extends java.lang.Object>
extends `ch.qos.logback.core.spi.ContextAwareBase`  
implements `ch.qos.logback.core.Appender<E>`  

**Constructors:**
- `public UnsynchronizedAppenderBase()`

**Fields:**
- `protected java.lang.String name`
- `protected boolean started`

**Methods:**
- `public void addFilter(ch.qos.logback.core.filter.Filter p0)`
- `protected abstract void append(E p0)`
- `public void clearAllFilters()`
- `public void doAppend(E p0)`
- `public java.util.List getCopyOfAttachedFiltersList()`
- `public ch.qos.logback.core.spi.FilterReply getFilterChainDecision(E p0)`
- `public java.lang.String getName()`
- `public boolean isStarted()`
- `public void setName(java.lang.String p0)`
- `public void start()`
- `public void stop()`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.core.boolex.EvaluationException`
extends `java.lang.Exception`  

**Constructors:**
- `public EvaluationException(java.lang.String p0)`
- `public EvaluationException(java.lang.String p0, java.lang.Throwable p1)`
- `public EvaluationException(java.lang.Throwable p0)`

---

## public abstract interface `ch.qos.logback.core.boolex.EventEvaluator`<E extends java.lang.Object>
implements `ch.qos.logback.core.spi.ContextAware`, `ch.qos.logback.core.spi.LifeCycle`  

**Methods:**
- `public abstract boolean evaluate(E p0) throws ch.qos.logback.core.boolex.EvaluationException, java.lang.NullPointerException`
- `public abstract java.lang.String getName()`
- `public abstract void setName(java.lang.String p0)`

---

## public abstract class `ch.qos.logback.core.boolex.EventEvaluatorBase`<E extends java.lang.Object>
extends `ch.qos.logback.core.spi.ContextAwareBase`  
implements `ch.qos.logback.core.boolex.EventEvaluator<E>`  

**Constructors:**
- `public EventEvaluatorBase()`

**Methods:**
- `public java.lang.String getName()`
- `public boolean isStarted()`
- `public void setName(java.lang.String p0)`
- `public void start()`
- `public void stop()`

---

## public abstract class `ch.qos.logback.core.boolex.JaninoEventEvaluatorBase`<E extends java.lang.Object>
extends `ch.qos.logback.core.boolex.EventEvaluatorBase`  

**Constructors:**
- `public JaninoEventEvaluatorBase()`

**Fields:**
- `public final static int ERROR_THRESHOLD`
- `protected java.util.List matcherList`

**Methods:**
- `public void addMatcher(ch.qos.logback.core.boolex.Matcher p0)`
- `public boolean evaluate(E p0) throws ch.qos.logback.core.boolex.EvaluationException`
- `protected abstract java.lang.String getDecoratedExpression()`
- `public java.lang.String getExpression()`
- `public java.util.List getMatcherList()`
- `protected abstract java.lang.String[] getParameterNames()`
- `protected abstract java.lang.Class[] getParameterTypes()`
- `protected abstract java.lang.Object[] getParameterValues(E p0)`
- `public void setExpression(java.lang.String p0)`
- `public void start()`

---

## public class `ch.qos.logback.core.boolex.Matcher`
extends `ch.qos.logback.core.spi.ContextAwareBase`  
implements `ch.qos.logback.core.spi.LifeCycle`  

**Constructors:**
- `public Matcher()`

**Methods:**
- `public java.lang.String getName()`
- `public java.lang.String getRegex()`
- `public boolean isCanonEq()`
- `public boolean isCaseSensitive()`
- `public boolean isStarted()`
- `public boolean isUnicodeCase()`
- `public boolean matches(java.lang.String p0) throws ch.qos.logback.core.boolex.EvaluationException`
- `public void setCanonEq(boolean p0)`
- `public void setCaseSensitive(boolean p0)`
- `public void setName(java.lang.String p0)`
- `public void setRegex(java.lang.String p0)`
- `public void setUnicodeCase(boolean p0)`
- `public void start()`
- `public void stop()`

---

## public class `ch.qos.logback.core.encoder.ByteArrayUtil`

**Constructors:**
- `public ByteArrayUtil()`

**Methods:**
- `public static byte[] hexStringToByteArray(java.lang.String p0)`
- `public static java.lang.String toHexString(byte[] p0)`

---

## public class `ch.qos.logback.core.encoder.EchoEncoder`<E extends java.lang.Object>
extends `ch.qos.logback.core.encoder.EncoderBase`  

**Constructors:**
- `public EchoEncoder()`

**Methods:**
- `public byte[] encode(E p0)`
- `public byte[] footerBytes()`
- `public byte[] headerBytes()`

---

## public abstract interface `ch.qos.logback.core.encoder.Encoder`<E extends java.lang.Object>
implements `ch.qos.logback.core.spi.ContextAware`, `ch.qos.logback.core.spi.LifeCycle`  

**Methods:**
- `public abstract byte[] encode(E p0)`
- `public abstract byte[] footerBytes()`
- `public abstract byte[] headerBytes()`

---

## public abstract class `ch.qos.logback.core.encoder.EncoderBase`<E extends java.lang.Object>
extends `ch.qos.logback.core.spi.ContextAwareBase`  
implements `ch.qos.logback.core.encoder.Encoder<E>`  

**Constructors:**
- `public EncoderBase()`

**Fields:**
- `protected boolean started`

**Methods:**
- `public boolean isStarted()`
- `public void start()`
- `public void stop()`

---

## public class `ch.qos.logback.core.encoder.LayoutWrappingEncoder`<E extends java.lang.Object>
extends `ch.qos.logback.core.encoder.EncoderBase`  

**Constructors:**
- `public LayoutWrappingEncoder()`

**Fields:**
- `protected ch.qos.logback.core.Layout layout`

**Methods:**
- `public byte[] encode(E p0)`
- `public byte[] footerBytes()`
- `public java.nio.charset.Charset getCharset()`
- `public ch.qos.logback.core.Layout getLayout()`
- `public byte[] headerBytes()`
- `public boolean isStarted()`
- `public void setCharset(java.nio.charset.Charset p0)`
- `public void setImmediateFlush(boolean p0)`
- `public void setLayout(ch.qos.logback.core.Layout p0)`
- `public void setParent(ch.qos.logback.core.spi.ContextAware p0)`
- `public void start()`
- `public void stop()`

---

## public class `ch.qos.logback.core.encoder.NonClosableInputStream`
extends `java.io.FilterInputStream`  

**Methods:**
- `public void close()`
- `public void realClose() throws java.io.IOException`

---

## public abstract class `ch.qos.logback.core.filter.AbstractMatcherFilter`<E extends java.lang.Object>
extends `ch.qos.logback.core.filter.Filter`  

**Constructors:**
- `public AbstractMatcherFilter()`

**Fields:**
- `protected ch.qos.logback.core.spi.FilterReply onMatch`
- `protected ch.qos.logback.core.spi.FilterReply onMismatch`

**Methods:**
- `public final ch.qos.logback.core.spi.FilterReply getOnMatch()`
- `public final ch.qos.logback.core.spi.FilterReply getOnMismatch()`
- `public final void setOnMatch(ch.qos.logback.core.spi.FilterReply p0)`
- `public final void setOnMismatch(ch.qos.logback.core.spi.FilterReply p0)`

---

## public class `ch.qos.logback.core.filter.EvaluatorFilter`<E extends java.lang.Object>
extends `ch.qos.logback.core.filter.AbstractMatcherFilter`  

**Constructors:**
- `public EvaluatorFilter()`

**Methods:**
- `public ch.qos.logback.core.spi.FilterReply decide(E p0)`
- `public ch.qos.logback.core.boolex.EventEvaluator getEvaluator()`
- `public void setEvaluator(ch.qos.logback.core.boolex.EventEvaluator p0)`
- `public void start()`

---

## public abstract class `ch.qos.logback.core.filter.Filter`<E extends java.lang.Object>
extends `ch.qos.logback.core.spi.ContextAwareBase`  
implements `ch.qos.logback.core.spi.LifeCycle`  

**Constructors:**
- `public Filter()`

**Methods:**
- `public abstract ch.qos.logback.core.spi.FilterReply decide(E p0)`
- `public java.lang.String getName()`
- `public boolean isStarted()`
- `public void setName(java.lang.String p0)`
- `public void start()`
- `public void stop()`

---

## public class `ch.qos.logback.core.helpers.CyclicBuffer`<E extends java.lang.Object>

**Constructors:**
- `public CyclicBuffer(ch.qos.logback.core.helpers.CyclicBuffer p0)`
- `public CyclicBuffer(int p0) throws java.lang.IllegalArgumentException`

**Methods:**
- `public void add(E p0)`
- `public java.util.List asList()`
- `public void clear()`
- `public E get()`
- `public E get(int p0)`
- `public int getMaxSize()`
- `public int length()`
- `public void resize(int p0)`

---

## public final class `ch.qos.logback.core.helpers.NOPAppender`<E extends java.lang.Object>
extends `ch.qos.logback.core.AppenderBase`  

**Constructors:**
- `public NOPAppender()`

---

## public class `ch.qos.logback.core.helpers.ThrowableToStringArray`

**Constructors:**
- `public ThrowableToStringArray()`

**Methods:**
- `public static java.lang.String[] convert(java.lang.Throwable p0)`

---

## public class `ch.qos.logback.core.helpers.Transform`

**Constructors:**
- `public Transform()`

**Methods:**
- `public static void appendEscapingCDATA(java.lang.StringBuilder p0, java.lang.String p1)`
- `public static java.lang.String escapeTags(java.lang.String p0)`
- `public static java.lang.String escapeTags(java.lang.StringBuffer p0)`

---

## public class `ch.qos.logback.core.hook.DelayingShutdownHook`
extends `ch.qos.logback.core.hook.ShutdownHookBase`  

**Constructors:**
- `public DelayingShutdownHook()`

**Fields:**
- `public final static ch.qos.logback.core.util.Duration DEFAULT_DELAY`

**Methods:**
- `public ch.qos.logback.core.util.Duration getDelay()`
- `public void run()`
- `public void setDelay(ch.qos.logback.core.util.Duration p0)`

---

## public abstract interface `ch.qos.logback.core.hook.ShutdownHook`
implements `ch.qos.logback.core.spi.ContextAware`, `java.lang.Runnable`  

---

## public abstract class `ch.qos.logback.core.hook.ShutdownHookBase`
extends `ch.qos.logback.core.spi.ContextAwareBase`  
implements `ch.qos.logback.core.hook.ShutdownHook`  

**Constructors:**
- `public ShutdownHookBase()`

**Methods:**
- `protected void stop()`

---

## public abstract interface `ch.qos.logback.core.html.CssBuilder`

**Methods:**
- `public abstract void addCss(java.lang.StringBuilder p0)`

---

## public abstract class `ch.qos.logback.core.html.HTMLLayoutBase`<E extends java.lang.Object>
extends `ch.qos.logback.core.LayoutBase`  

**Constructors:**
- `public HTMLLayoutBase()`

**Fields:**
- `protected long counter`
- `protected ch.qos.logback.core.html.CssBuilder cssBuilder`
- `protected ch.qos.logback.core.pattern.Converter head`
- `protected java.lang.String pattern`
- `protected java.lang.String title`

**Methods:**
- `protected java.lang.String computeConverterName(ch.qos.logback.core.pattern.Converter p0)`
- `public java.lang.String getContentType()`
- `public ch.qos.logback.core.html.CssBuilder getCssBuilder()`
- `protected abstract java.util.Map getDefaultConverterMap()`
- `public java.util.Map getEffectiveConverterMap()`
- `public java.lang.String getFileFooter()`
- `public java.lang.String getFileHeader()`
- `public java.lang.String getPattern()`
- `public java.lang.String getPresentationFooter()`
- `public java.lang.String getPresentationHeader()`
- `public java.lang.String getTitle()`
- `public void setCssBuilder(ch.qos.logback.core.html.CssBuilder p0)`
- `public void setPattern(java.lang.String p0)`
- `public void setTitle(java.lang.String p0)`
- `public void start()`
- `protected void startNewTableIfLimitReached(java.lang.StringBuilder p0)`

---

## public abstract interface `ch.qos.logback.core.html.IThrowableRenderer`<E extends java.lang.Object>

**Methods:**
- `public abstract void render(java.lang.StringBuilder p0, E p1)`

---

## public class `ch.qos.logback.core.html.NOPThrowableRenderer`
implements `ch.qos.logback.core.html.IThrowableRenderer`  

**Constructors:**
- `public NOPThrowableRenderer()`

**Methods:**
- `public void render(java.lang.StringBuilder p0, java.lang.Object p1)`

---

## public abstract class `ch.qos.logback.core.joran.GenericConfigurator`
extends `ch.qos.logback.core.spi.ContextAwareBase`  

**Constructors:**
- `public GenericConfigurator()`

**Fields:**
- `protected ch.qos.logback.core.joran.spi.Interpreter interpreter`

**Methods:**
- `protected void addDefaultNestedComponentRegistryRules(ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry p0)`
- `protected abstract void addImplicitRules(ch.qos.logback.core.joran.spi.Interpreter p0)`
- `protected abstract void addInstanceRules(ch.qos.logback.core.joran.spi.RuleStore p0)`
- `protected void buildInterpreter()`
- `public final void doConfigure(java.io.File p0) throws ch.qos.logback.core.joran.spi.JoranException`
- `public final void doConfigure(java.io.InputStream p0) throws ch.qos.logback.core.joran.spi.JoranException`
- `public final void doConfigure(java.io.InputStream p0, java.lang.String p1) throws ch.qos.logback.core.joran.spi.JoranException`
- `public final void doConfigure(java.lang.String p0) throws ch.qos.logback.core.joran.spi.JoranException`
- `public final void doConfigure(java.net.URL p0) throws ch.qos.logback.core.joran.spi.JoranException`
- `public void doConfigure(java.util.List p0) throws ch.qos.logback.core.joran.spi.JoranException`
- `public final void doConfigure(org.xml.sax.InputSource p0) throws ch.qos.logback.core.joran.spi.JoranException`
- `protected ch.qos.logback.core.joran.util.beans.BeanDescriptionCache getBeanDescriptionCache()`
- `public static void informContextOfURLUsedForConfiguration(ch.qos.logback.core.Context p0, java.net.URL p1)`
- `protected ch.qos.logback.core.joran.spi.ElementPath initialElementPath()`
- `public java.util.List recallSafeConfiguration()`
- `public void registerSafeConfiguration(java.util.List p0)`

---

## public abstract class `ch.qos.logback.core.joran.JoranConfiguratorBase`<E extends java.lang.Object>
extends `ch.qos.logback.core.joran.GenericConfigurator`  

**Constructors:**
- `public JoranConfiguratorBase()`

**Methods:**
- `protected void addImplicitRules(ch.qos.logback.core.joran.spi.Interpreter p0)`
- `protected void addInstanceRules(ch.qos.logback.core.joran.spi.RuleStore p0)`
- `protected void buildInterpreter()`
- `public ch.qos.logback.core.joran.spi.InterpretationContext getInterpretationContext()`

---

## public abstract class `ch.qos.logback.core.joran.action.AbstractEventEvaluatorAction`
extends `ch.qos.logback.core.joran.action.Action`  

**Constructors:**
- `public AbstractEventEvaluatorAction()`

**Methods:**
- `public void begin(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2)`
- `protected abstract java.lang.String defaultClassName()`
- `public void end(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1)`
- `public void finish(ch.qos.logback.core.joran.spi.InterpretationContext p0)`

---

## public abstract class `ch.qos.logback.core.joran.action.Action`
extends `ch.qos.logback.core.spi.ContextAwareBase`  

**Constructors:**
- `public Action()`

**Fields:**
- `public final static java.lang.String ACTION_CLASS_ATTRIBUTE`
- `public final static java.lang.String CLASS_ATTRIBUTE`
- `public final static java.lang.String FILE_ATTRIBUTE`
- `public final static java.lang.String KEY_ATTRIBUTE`
- `public final static java.lang.String NAME_ATTRIBUTE`
- `public final static java.lang.String PATTERN_ATTRIBUTE`
- `public final static java.lang.String SCOPE_ATTRIBUTE`
- `public final static java.lang.String VALUE_ATTRIBUTE`

**Methods:**
- `public abstract void begin(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2) throws ch.qos.logback.core.joran.spi.ActionException`
- `public void body(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1) throws ch.qos.logback.core.joran.spi.ActionException`
- `public abstract void end(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1) throws ch.qos.logback.core.joran.spi.ActionException`
- `protected int getColumnNumber(ch.qos.logback.core.joran.spi.InterpretationContext p0)`
- `protected java.lang.String getLineColStr(ch.qos.logback.core.joran.spi.InterpretationContext p0)`
- `protected int getLineNumber(ch.qos.logback.core.joran.spi.InterpretationContext p0)`
- `public java.lang.String toString()`

---

## public abstract class `ch.qos.logback.core.joran.action.ActionConst`

**Constructors:**
- `public ActionConst()`

**Fields:**
- `public final static java.lang.String ACTION_CLASS_ATTRIBUTE`
- `public final static java.lang.String ADDITIVITY_ATTRIBUTE`
- `public final static java.lang.String APPENDER_BAG`
- `public final static java.lang.String APPENDER_TAG`
- `public final static java.lang.String CONVERSION_WORD_ATTRIBUTE`
- `public final static java.lang.String CONVERTER_CLASS_ATTRIBUTE`
- `public final static java.lang.String INHERITED`
- `public final static java.lang.String LEVEL_ATTRIBUTE`
- `public final static java.lang.String NULL`
- `public final static java.lang.String PATTERN_ATTRIBUTE`
- `public final static java.lang.String REF_ATTRIBUTE`
- `public final static java.lang.String VALUE_ATTR`

---

## public class `ch.qos.logback.core.joran.action.ActionUtil`

**Constructors:**
- `public ActionUtil()`

**Methods:**
- `public static void setProperties(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.util.Properties p1, ch.qos.logback.core.joran.action.ActionUtil$Scope p2)`
- `public static void setProperty(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1, java.lang.String p2, ch.qos.logback.core.joran.action.ActionUtil$Scope p3)`
- `public static ch.qos.logback.core.joran.action.ActionUtil$Scope stringToScope(java.lang.String p0)`

---

## public final static enum `ch.qos.logback.core.joran.action.ActionUtil$Scope`
extends `java.lang.Enum`  

**Fields:**
- `public final static ch.qos.logback.core.joran.action.ActionUtil$Scope CONTEXT`
- `public final static ch.qos.logback.core.joran.action.ActionUtil$Scope LOCAL`
- `public final static ch.qos.logback.core.joran.action.ActionUtil$Scope SYSTEM`

---

## public class `ch.qos.logback.core.joran.action.AppenderAction`<E extends java.lang.Object>
extends `ch.qos.logback.core.joran.action.Action`  

**Constructors:**
- `public AppenderAction()`

**Methods:**
- `public void begin(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2) throws ch.qos.logback.core.joran.spi.ActionException`
- `public void end(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1)`

---

## public class `ch.qos.logback.core.joran.action.AppenderRefAction`<E extends java.lang.Object>
extends `ch.qos.logback.core.joran.action.Action`  

**Constructors:**
- `public AppenderRefAction()`

**Methods:**
- `public void begin(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2)`
- `public void end(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1)`

---

## public class `ch.qos.logback.core.joran.action.ContextPropertyAction`
extends `ch.qos.logback.core.joran.action.Action`  

**Constructors:**
- `public ContextPropertyAction()`

**Methods:**
- `public void begin(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2) throws ch.qos.logback.core.joran.spi.ActionException`
- `public void end(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1) throws ch.qos.logback.core.joran.spi.ActionException`

---

## public class `ch.qos.logback.core.joran.action.ConversionRuleAction`
extends `ch.qos.logback.core.joran.action.Action`  

**Constructors:**
- `public ConversionRuleAction()`

**Methods:**
- `public void begin(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2)`
- `public void end(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1)`
- `public void finish(ch.qos.logback.core.joran.spi.InterpretationContext p0)`

---

## public class `ch.qos.logback.core.joran.action.DefinePropertyAction`
extends `ch.qos.logback.core.joran.action.Action`  

**Constructors:**
- `public DefinePropertyAction()`

**Methods:**
- `public void begin(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2) throws ch.qos.logback.core.joran.spi.ActionException`
- `public void end(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1)`

---

## public class `ch.qos.logback.core.joran.action.IADataForComplexProperty`

**Constructors:**
- `public IADataForComplexProperty(ch.qos.logback.core.joran.util.PropertySetter p0, ch.qos.logback.core.util.AggregationType p1, java.lang.String p2)`

**Methods:**
- `public ch.qos.logback.core.util.AggregationType getAggregationType()`
- `public java.lang.String getComplexPropertyName()`
- `public java.lang.Object getNestedComplexProperty()`
- `public void setNestedComplexProperty(java.lang.Object p0)`

---

## public abstract class `ch.qos.logback.core.joran.action.ImplicitAction`
extends `ch.qos.logback.core.joran.action.Action`  

**Constructors:**
- `public ImplicitAction()`

**Methods:**
- `public abstract boolean isApplicable(ch.qos.logback.core.joran.spi.ElementPath p0, org.xml.sax.Attributes p1, ch.qos.logback.core.joran.spi.InterpretationContext p2)`

---

## public class `ch.qos.logback.core.joran.action.IncludeAction`
extends `ch.qos.logback.core.joran.action.Action`  

**Constructors:**
- `public IncludeAction()`

**Methods:**
- `public void begin(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2) throws ch.qos.logback.core.joran.spi.ActionException`
- `public void end(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1) throws ch.qos.logback.core.joran.spi.ActionException`

---

## public class `ch.qos.logback.core.joran.action.NOPAction`
extends `ch.qos.logback.core.joran.action.Action`  

**Constructors:**
- `public NOPAction()`

**Methods:**
- `public void begin(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2)`
- `public void end(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1)`

---

## public class `ch.qos.logback.core.joran.action.NestedBasicPropertyIA`
extends `ch.qos.logback.core.joran.action.ImplicitAction`  

**Constructors:**
- `public NestedBasicPropertyIA(ch.qos.logback.core.joran.util.beans.BeanDescriptionCache p0)`

**Methods:**
- `public void begin(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2)`
- `public void body(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1)`
- `public void end(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1)`
- `public boolean isApplicable(ch.qos.logback.core.joran.spi.ElementPath p0, org.xml.sax.Attributes p1, ch.qos.logback.core.joran.spi.InterpretationContext p2)`

---

## public class `ch.qos.logback.core.joran.action.NestedComplexPropertyIA`
extends `ch.qos.logback.core.joran.action.ImplicitAction`  

**Constructors:**
- `public NestedComplexPropertyIA(ch.qos.logback.core.joran.util.beans.BeanDescriptionCache p0)`

**Methods:**
- `public void begin(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2)`
- `public void end(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1)`
- `public boolean isApplicable(ch.qos.logback.core.joran.spi.ElementPath p0, org.xml.sax.Attributes p1, ch.qos.logback.core.joran.spi.InterpretationContext p2)`

---

## public class `ch.qos.logback.core.joran.action.NewRuleAction`
extends `ch.qos.logback.core.joran.action.Action`  

**Constructors:**
- `public NewRuleAction()`

**Methods:**
- `public void begin(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2)`
- `public void end(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1)`
- `public void finish(ch.qos.logback.core.joran.spi.InterpretationContext p0)`

---

## public class `ch.qos.logback.core.joran.action.ParamAction`
extends `ch.qos.logback.core.joran.action.Action`  

**Constructors:**
- `public ParamAction(ch.qos.logback.core.joran.util.beans.BeanDescriptionCache p0)`

**Methods:**
- `public void begin(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2)`
- `public void end(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1)`
- `public void finish(ch.qos.logback.core.joran.spi.InterpretationContext p0)`

---

## public class `ch.qos.logback.core.joran.action.PropertyAction`
extends `ch.qos.logback.core.joran.action.Action`  

**Constructors:**
- `public PropertyAction()`

**Methods:**
- `public void begin(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2)`
- `public void end(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1)`
- `public void finish(ch.qos.logback.core.joran.spi.InterpretationContext p0)`

---

## public class `ch.qos.logback.core.joran.action.ShutdownHookAction`
extends `ch.qos.logback.core.joran.action.Action`  

**Constructors:**
- `public ShutdownHookAction()`

**Methods:**
- `public void begin(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2) throws ch.qos.logback.core.joran.spi.ActionException`
- `public void end(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1) throws ch.qos.logback.core.joran.spi.ActionException`

---

## public class `ch.qos.logback.core.joran.action.StatusListenerAction`
extends `ch.qos.logback.core.joran.action.Action`  

**Constructors:**
- `public StatusListenerAction()`

**Methods:**
- `public void begin(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2) throws ch.qos.logback.core.joran.spi.ActionException`
- `public void end(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1)`
- `public void finish(ch.qos.logback.core.joran.spi.InterpretationContext p0)`

---

## public class `ch.qos.logback.core.joran.action.TimestampAction`
extends `ch.qos.logback.core.joran.action.Action`  

**Constructors:**
- `public TimestampAction()`

**Methods:**
- `public void begin(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2) throws ch.qos.logback.core.joran.spi.ActionException`
- `public void end(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1) throws ch.qos.logback.core.joran.spi.ActionException`

---

## public abstract interface `ch.qos.logback.core.joran.conditional.Condition`

**Methods:**
- `public abstract boolean evaluate()`

---

## public class `ch.qos.logback.core.joran.conditional.ElseAction`
extends `ch.qos.logback.core.joran.conditional.ThenOrElseActionBase`  

**Constructors:**
- `public ElseAction()`

---

## public class `ch.qos.logback.core.joran.conditional.IfAction`
extends `ch.qos.logback.core.joran.action.Action`  

**Constructors:**
- `public IfAction()`

**Fields:**
- `public final static java.lang.String MISSING_JANINO_MSG`
- `public final static java.lang.String MISSING_JANINO_SEE`

**Methods:**
- `public void begin(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2) throws ch.qos.logback.core.joran.spi.ActionException`
- `public void end(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1) throws ch.qos.logback.core.joran.spi.ActionException`
- `public boolean isActive()`
- `public void setElseSaxEventList(java.util.List p0)`
- `public void setThenSaxEventList(java.util.List p0)`

---

## public class `ch.qos.logback.core.joran.conditional.PropertyEvalScriptBuilder`
extends `ch.qos.logback.core.spi.ContextAwareBase`  

**Methods:**
- `public ch.qos.logback.core.joran.conditional.Condition build(java.lang.String p0) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.reflect.InvocationTargetException, org.codehaus.commons.compiler.CompileException`

---

## public class `ch.qos.logback.core.joran.conditional.PropertyWrapperForScripts`

**Constructors:**
- `public PropertyWrapperForScripts()`

**Methods:**
- `public boolean isDefined(java.lang.String p0)`
- `public boolean isNull(java.lang.String p0)`
- `public java.lang.String p(java.lang.String p0)`
- `public java.lang.String property(java.lang.String p0)`
- `public void setPropertyContainers(ch.qos.logback.core.spi.PropertyContainer p0, ch.qos.logback.core.spi.PropertyContainer p1)`

---

## public class `ch.qos.logback.core.joran.conditional.ThenAction`
extends `ch.qos.logback.core.joran.conditional.ThenOrElseActionBase`  

**Constructors:**
- `public ThenAction()`

---

## public abstract class `ch.qos.logback.core.joran.conditional.ThenOrElseActionBase`
extends `ch.qos.logback.core.joran.action.Action`  

**Constructors:**
- `public ThenOrElseActionBase()`

**Methods:**
- `public void begin(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2) throws ch.qos.logback.core.joran.spi.ActionException`
- `public void end(ch.qos.logback.core.joran.spi.InterpretationContext p0, java.lang.String p1) throws ch.qos.logback.core.joran.spi.ActionException`

---

## public class `ch.qos.logback.core.joran.event.BodyEvent`
extends `ch.qos.logback.core.joran.event.SaxEvent`  

**Methods:**
- `public void append(java.lang.String p0)`
- `public java.lang.String getText()`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.core.joran.event.EndEvent`
extends `ch.qos.logback.core.joran.event.SaxEvent`  

**Methods:**
- `public java.lang.String toString()`

---

## public abstract interface `ch.qos.logback.core.joran.event.InPlayListener`

**Methods:**
- `public abstract void inPlay(ch.qos.logback.core.joran.event.SaxEvent p0)`

---

## public class `ch.qos.logback.core.joran.event.SaxEvent`

**Fields:**
- `public final java.lang.String localName`
- `public final org.xml.sax.Locator locator`
- `public final java.lang.String namespaceURI`
- `public final java.lang.String qName`

**Methods:**
- `public java.lang.String getLocalName()`
- `public org.xml.sax.Locator getLocator()`
- `public java.lang.String getNamespaceURI()`
- `public java.lang.String getQName()`

---

## public class `ch.qos.logback.core.joran.event.SaxEventRecorder`
extends `org.xml.sax.helpers.DefaultHandler`  
implements `ch.qos.logback.core.spi.ContextAware`  

**Constructors:**
- `public SaxEventRecorder(ch.qos.logback.core.Context p0)`

**Fields:**
- `public java.util.List saxEventList`

**Methods:**
- `public void addError(java.lang.String p0)`
- `public void addError(java.lang.String p0, java.lang.Throwable p1)`
- `public void addInfo(java.lang.String p0)`
- `public void addInfo(java.lang.String p0, java.lang.Throwable p1)`
- `public void addStatus(ch.qos.logback.core.status.Status p0)`
- `public void addWarn(java.lang.String p0)`
- `public void addWarn(java.lang.String p0, java.lang.Throwable p1)`
- `public void characters(char[] p0, int p1, int p2)`
- `public void endElement(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public void error(org.xml.sax.SAXParseException p0) throws org.xml.sax.SAXException`
- `public void fatalError(org.xml.sax.SAXParseException p0) throws org.xml.sax.SAXException`
- `public ch.qos.logback.core.Context getContext()`
- `public org.xml.sax.Locator getLocator()`
- `public java.util.List getSaxEventList()`
- `public final void recordEvents(java.io.InputStream p0) throws ch.qos.logback.core.joran.spi.JoranException`
- `public java.util.List recordEvents(org.xml.sax.InputSource p0) throws ch.qos.logback.core.joran.spi.JoranException`
- `public void setContext(ch.qos.logback.core.Context p0)`
- `public void setDocumentLocator(org.xml.sax.Locator p0)`
- `public void startDocument()`
- `public void startElement(java.lang.String p0, java.lang.String p1, java.lang.String p2, org.xml.sax.Attributes p3)`
- `public void warning(org.xml.sax.SAXParseException p0) throws org.xml.sax.SAXException`

---

## public class `ch.qos.logback.core.joran.event.StartEvent`
extends `ch.qos.logback.core.joran.event.SaxEvent`  

**Fields:**
- `public final org.xml.sax.Attributes attributes`
- `public final ch.qos.logback.core.joran.spi.ElementPath elementPath`

**Methods:**
- `public org.xml.sax.Attributes getAttributes()`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.core.joran.event.stax.BodyEvent`
extends `ch.qos.logback.core.joran.event.stax.StaxEvent`  

**Methods:**
- `public java.lang.String getText()`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.core.joran.event.stax.EndEvent`
extends `ch.qos.logback.core.joran.event.stax.StaxEvent`  

**Constructors:**
- `public EndEvent(java.lang.String p0, javax.xml.stream.Location p1)`

**Methods:**
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.core.joran.event.stax.StartEvent`
extends `ch.qos.logback.core.joran.event.stax.StaxEvent`  

**Fields:**
- `public ch.qos.logback.core.joran.spi.ElementPath elementPath`

**Methods:**
- `public java.util.List getAttributeList()`
- `public ch.qos.logback.core.joran.spi.ElementPath getElementPath()`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.core.joran.event.stax.StaxEvent`

**Methods:**
- `public javax.xml.stream.Location getLocation()`
- `public java.lang.String getName()`

---

## public class `ch.qos.logback.core.joran.event.stax.StaxEventRecorder`
extends `ch.qos.logback.core.spi.ContextAwareBase`  

**Constructors:**
- `public StaxEventRecorder(ch.qos.logback.core.Context p0)`

**Methods:**
- `public java.util.List getEventList()`
- `public void recordEvents(java.io.InputStream p0) throws ch.qos.logback.core.joran.spi.JoranException`

---

## public class `ch.qos.logback.core.joran.node.ComponentNode`

**Constructors:**
- `public ComponentNode()`

---

## public class `ch.qos.logback.core.joran.spi.ActionException`
extends `java.lang.Exception`  

**Constructors:**
- `public ActionException()`
- `public ActionException(java.lang.Throwable p0)`

---

## public class `ch.qos.logback.core.joran.spi.ConfigurationWatchList`
extends `ch.qos.logback.core.spi.ContextAwareBase`  

**Constructors:**
- `public ConfigurationWatchList()`

**Methods:**
- `public void addToWatchList(java.net.URL p0)`
- `public ch.qos.logback.core.joran.spi.ConfigurationWatchList buildClone()`
- `public boolean changeDetected()`
- `public void clear()`
- `public java.util.List getCopyOfFileWatchList()`
- `public java.net.URL getMainURL()`
- `public void setMainURL(java.net.URL p0)`

---

## public final enum `ch.qos.logback.core.joran.spi.ConsoleTarget`
extends `java.lang.Enum`  

**Fields:**
- `public final static ch.qos.logback.core.joran.spi.ConsoleTarget SystemErr`
- `public final static ch.qos.logback.core.joran.spi.ConsoleTarget SystemOut`

**Methods:**
- `public static ch.qos.logback.core.joran.spi.ConsoleTarget findByName(java.lang.String p0)`
- `public java.lang.String getName()`
- `public java.io.OutputStream getStream()`
- `public java.lang.String toString()`

---

## public abstract interface `ch.qos.logback.core.joran.spi.DefaultClass`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public class `ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry`

**Constructors:**
- `public DefaultNestedComponentRegistry()`

**Methods:**
- `public void add(java.lang.Class p0, java.lang.String p1, java.lang.Class p2)`
- `public java.lang.Class findDefaultComponentType(java.lang.Class p0, java.lang.String p1)`

---

## public class `ch.qos.logback.core.joran.spi.ElementPath`

**Constructors:**
- `public ElementPath()`
- `public ElementPath(java.lang.String p0)`
- `public ElementPath(java.util.List p0)`

**Methods:**
- `public ch.qos.logback.core.joran.spi.ElementPath duplicate()`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String get(int p0)`
- `public java.util.List getCopyOfPartList()`
- `public java.lang.String peekLast()`
- `public void pop()`
- `public void push(java.lang.String p0)`
- `public int size()`
- `protected java.lang.String toStableString()`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.core.joran.spi.ElementSelector`
extends `ch.qos.logback.core.joran.spi.ElementPath`  

**Constructors:**
- `public ElementSelector()`
- `public ElementSelector(java.lang.String p0)`
- `public ElementSelector(java.util.List p0)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public boolean fullPathMatch(ch.qos.logback.core.joran.spi.ElementPath p0)`
- `public int getPrefixMatchLength(ch.qos.logback.core.joran.spi.ElementPath p0)`
- `public int getTailMatchLength(ch.qos.logback.core.joran.spi.ElementPath p0)`
- `public int hashCode()`
- `public boolean isContainedIn(ch.qos.logback.core.joran.spi.ElementPath p0)`

---

## public class `ch.qos.logback.core.joran.spi.EventPlayer`

**Constructors:**
- `public EventPlayer(ch.qos.logback.core.joran.spi.Interpreter p0)`

**Methods:**
- `public void addEventsDynamically(java.util.List p0, int p1)`
- `public java.util.List getCopyOfPlayerEventList()`
- `public void play(java.util.List p0)`

---

## public class `ch.qos.logback.core.joran.spi.HostClassAndPropertyDouble`

**Constructors:**
- `public HostClassAndPropertyDouble(java.lang.Class p0, java.lang.String p1)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.Class getHostClass()`
- `public java.lang.String getPropertyName()`
- `public int hashCode()`

---

## public class `ch.qos.logback.core.joran.spi.InterpretationContext`
extends `ch.qos.logback.core.spi.ContextAwareBase`  
implements `ch.qos.logback.core.spi.PropertyContainer`  

**Constructors:**
- `public InterpretationContext(ch.qos.logback.core.Context p0, ch.qos.logback.core.joran.spi.Interpreter p1)`

**Methods:**
- `public void addInPlayListener(ch.qos.logback.core.joran.event.InPlayListener p0)`
- `public void addSubstitutionProperties(java.util.Properties p0)`
- `public void addSubstitutionProperty(java.lang.String p0, java.lang.String p1)`
- `public java.util.Map getCopyOfPropertyMap()`
- `public ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry getDefaultNestedComponentRegistry()`
- `public ch.qos.logback.core.joran.spi.Interpreter getJoranInterpreter()`
- `public org.xml.sax.Locator getLocator()`
- `public java.lang.Object getObject(int p0)`
- `public java.util.Map getObjectMap()`
- `public java.util.Stack getObjectStack()`
- `public java.lang.String getProperty(java.lang.String p0)`
- `public boolean isEmpty()`
- `public boolean isListenerListEmpty()`
- `public java.lang.Object peekObject()`
- `public java.lang.Object popObject()`
- `public void pushObject(java.lang.Object p0)`
- `public boolean removeInPlayListener(ch.qos.logback.core.joran.event.InPlayListener p0)`
- `public java.lang.String subst(java.lang.String p0)`

---

## public class `ch.qos.logback.core.joran.spi.Interpreter`

**Constructors:**
- `public Interpreter(ch.qos.logback.core.Context p0, ch.qos.logback.core.joran.spi.RuleStore p1, ch.qos.logback.core.joran.spi.ElementPath p2)`

**Methods:**
- `public void addImplicitAction(ch.qos.logback.core.joran.action.ImplicitAction p0)`
- `public void characters(ch.qos.logback.core.joran.event.BodyEvent p0)`
- `public void endElement(ch.qos.logback.core.joran.event.EndEvent p0)`
- `public ch.qos.logback.core.joran.spi.EventPlayer getEventPlayer()`
- `public ch.qos.logback.core.joran.spi.InterpretationContext getExecutionContext()`
- `public ch.qos.logback.core.joran.spi.InterpretationContext getInterpretationContext()`
- `public org.xml.sax.Locator getLocator()`
- `public ch.qos.logback.core.joran.spi.RuleStore getRuleStore()`
- `public void setDocumentLocator(org.xml.sax.Locator p0)`
- `public void setInterpretationContextPropertiesMap(java.util.Map p0)`
- `public void startDocument()`
- `public void startElement(ch.qos.logback.core.joran.event.StartEvent p0)`

---

## public class `ch.qos.logback.core.joran.spi.JoranException`
extends `java.lang.Exception`  

**Constructors:**
- `public JoranException(java.lang.String p0)`
- `public JoranException(java.lang.String p0, java.lang.Throwable p1)`

---

## public abstract interface `ch.qos.logback.core.joran.spi.NoAutoStart`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public class `ch.qos.logback.core.joran.spi.NoAutoStartUtil`

**Constructors:**
- `public NoAutoStartUtil()`

**Methods:**
- `public static boolean notMarkedWithNoAutoStart(java.lang.Object p0)`

---

## public abstract interface `ch.qos.logback.core.joran.spi.RuleStore`

**Methods:**
- `public abstract void addRule(ch.qos.logback.core.joran.spi.ElementSelector p0, ch.qos.logback.core.joran.action.Action p1)`
- `public abstract void addRule(ch.qos.logback.core.joran.spi.ElementSelector p0, java.lang.String p1) throws java.lang.ClassNotFoundException`
- `public abstract java.util.List matchActions(ch.qos.logback.core.joran.spi.ElementPath p0)`

---

## public class `ch.qos.logback.core.joran.spi.SimpleRuleStore`
extends `ch.qos.logback.core.spi.ContextAwareBase`  
implements `ch.qos.logback.core.joran.spi.RuleStore`  

**Constructors:**
- `public SimpleRuleStore(ch.qos.logback.core.Context p0)`

**Methods:**
- `public void addRule(ch.qos.logback.core.joran.spi.ElementSelector p0, ch.qos.logback.core.joran.action.Action p1)`
- `public void addRule(ch.qos.logback.core.joran.spi.ElementSelector p0, java.lang.String p1)`
- `public java.util.List matchActions(ch.qos.logback.core.joran.spi.ElementPath p0)`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.core.joran.spi.XMLUtil`

**Constructors:**
- `public XMLUtil()`

**Fields:**
- `public final static int ILL_FORMED`
- `public final static int UNRECOVERABLE_ERROR`

**Methods:**
- `public static int checkIfWellFormed(java.net.URL p0, ch.qos.logback.core.status.StatusManager p1)`

---

## public class `ch.qos.logback.core.joran.util.ConfigurationWatchListUtil`

**Methods:**
- `public static void addToWatchList(ch.qos.logback.core.Context p0, java.net.URL p1)`
- `public static ch.qos.logback.core.joran.spi.ConfigurationWatchList getConfigurationWatchList(ch.qos.logback.core.Context p0)`
- `public static java.net.URL getMainWatchURL(ch.qos.logback.core.Context p0)`
- `public static void registerConfigurationWatchList(ch.qos.logback.core.Context p0, ch.qos.logback.core.joran.spi.ConfigurationWatchList p1)`
- `public static void setMainWatchURL(ch.qos.logback.core.Context p0, java.net.URL p1)`

---

## public class `ch.qos.logback.core.joran.util.PropertySetter`
extends `ch.qos.logback.core.spi.ContextAwareBase`  

**Constructors:**
- `public PropertySetter(ch.qos.logback.core.joran.util.beans.BeanDescriptionCache p0, java.lang.Object p1)`

**Fields:**
- `protected final ch.qos.logback.core.joran.util.beans.BeanDescription beanDescription`
- `protected final java.lang.Object obj`
- `protected final java.lang.Class objClass`

**Methods:**
- `public void addBasicProperty(java.lang.String p0, java.lang.String p1)`
- `public void addComplexProperty(java.lang.String p0, java.lang.Object p1)`
- `public ch.qos.logback.core.util.AggregationType computeAggregationType(java.lang.String p0)`
- `public java.lang.Class getClassNameViaImplicitRules(java.lang.String p0, ch.qos.logback.core.util.AggregationType p1, ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry p2)`
- `public java.lang.Object getObj()`
- `public java.lang.Class getObjClass()`
- `public void setComplexProperty(java.lang.String p0, java.lang.Object p1)`
- `public void setProperty(java.lang.String p0, java.lang.String p1)`

---

## public class `ch.qos.logback.core.joran.util.StringToObjectConverter`

**Constructors:**
- `public StringToObjectConverter()`

**Methods:**
- `public static boolean canBeBuiltFromSimpleString(java.lang.Class p0)`
- `public static java.lang.Object convertArg(ch.qos.logback.core.spi.ContextAware p0, java.lang.String p1, java.lang.Class p2)`
- `public static java.lang.reflect.Method getValueOfMethod(java.lang.Class p0)`

---

## public class `ch.qos.logback.core.joran.util.beans.BeanDescription`

**Constructors:**
- `protected BeanDescription(java.lang.Class p0, java.util.Map p1, java.util.Map p2, java.util.Map p3)`

**Methods:**
- `public java.lang.reflect.Method getAdder(java.lang.String p0)`
- `public java.lang.Class getClazz()`
- `public java.lang.reflect.Method getGetter(java.lang.String p0)`
- `public java.util.Map getPropertyNameToAdder()`
- `public java.util.Map getPropertyNameToGetter()`
- `public java.util.Map getPropertyNameToSetter()`
- `public java.lang.reflect.Method getSetter(java.lang.String p0)`

---

## public class `ch.qos.logback.core.joran.util.beans.BeanDescriptionCache`
extends `ch.qos.logback.core.spi.ContextAwareBase`  

**Constructors:**
- `public BeanDescriptionCache(ch.qos.logback.core.Context p0)`

**Methods:**
- `public ch.qos.logback.core.joran.util.beans.BeanDescription getBeanDescription(java.lang.Class p0)`

---

## public class `ch.qos.logback.core.joran.util.beans.BeanDescriptionFactory`
extends `ch.qos.logback.core.spi.ContextAwareBase`  

**Methods:**
- `public ch.qos.logback.core.joran.util.beans.BeanDescription create(java.lang.Class p0)`

---

## public class `ch.qos.logback.core.joran.util.beans.BeanUtil`

**Constructors:**
- `public BeanUtil()`

**Fields:**
- `public final static java.lang.String PREFIX_ADDER`
- `public final static java.lang.String PREFIX_GETTER_GET`
- `public final static java.lang.String PREFIX_GETTER_IS`
- `public final static java.lang.String PREFIX_SETTER`

**Methods:**
- `public static java.lang.String getPropertyName(java.lang.reflect.Method p0)`
- `public static boolean isAdder(java.lang.reflect.Method p0)`
- `public static boolean isGetter(java.lang.reflect.Method p0)`
- `public static boolean isSetter(java.lang.reflect.Method p0)`
- `public static java.lang.String toLowerCamelCase(java.lang.String p0)`

---

## public class `ch.qos.logback.core.layout.EchoLayout`<E extends java.lang.Object>
extends `ch.qos.logback.core.LayoutBase`  

**Constructors:**
- `public EchoLayout()`

**Methods:**
- `public java.lang.String doLayout(E p0)`

---

## public abstract class `ch.qos.logback.core.net.AbstractSSLSocketAppender`<E extends java.lang.Object>
extends `ch.qos.logback.core.net.AbstractSocketAppender`  
implements `ch.qos.logback.core.net.ssl.SSLComponent`  

**Constructors:**
- `protected AbstractSSLSocketAppender()`

**Methods:**
- `protected javax.net.SocketFactory getSocketFactory()`
- `public ch.qos.logback.core.net.ssl.SSLConfiguration getSsl()`
- `public void setSsl(ch.qos.logback.core.net.ssl.SSLConfiguration p0)`
- `public void start()`

---

## public abstract class `ch.qos.logback.core.net.AbstractSocketAppender`<E extends java.lang.Object>
extends `ch.qos.logback.core.AppenderBase`  
implements `ch.qos.logback.core.net.SocketConnector$ExceptionHandler`  

**Constructors:**
- `protected AbstractSocketAppender()`

**Fields:**
- `public final static int DEFAULT_PORT`
- `public final static int DEFAULT_QUEUE_SIZE`
- `public final static int DEFAULT_RECONNECTION_DELAY`

**Methods:**
- `protected void append(E p0)`
- `public void connectionFailed(ch.qos.logback.core.net.SocketConnector p0, java.lang.Exception p1)`
- `public ch.qos.logback.core.util.Duration getEventDelayLimit()`
- `protected abstract ch.qos.logback.core.spi.PreSerializationTransformer getPST()`
- `public int getPort()`
- `public int getQueueSize()`
- `public ch.qos.logback.core.util.Duration getReconnectionDelay()`
- `public java.lang.String getRemoteHost()`
- `protected javax.net.SocketFactory getSocketFactory()`
- `protected ch.qos.logback.core.net.SocketConnector newConnector(java.net.InetAddress p0, int p1, long p2, long p3)`
- `protected abstract void postProcessEvent(E p0)`
- `public void setEventDelayLimit(ch.qos.logback.core.util.Duration p0)`
- `public void setPort(int p0)`
- `public void setQueueSize(int p0)`
- `public void setReconnectionDelay(ch.qos.logback.core.util.Duration p0)`
- `public void setRemoteHost(java.lang.String p0)`
- `public void start()`
- `public void stop()`

---

## public class `ch.qos.logback.core.net.AutoFlushingObjectWriter`
implements `ch.qos.logback.core.net.ObjectWriter`  

**Constructors:**
- `public AutoFlushingObjectWriter(java.io.ObjectOutputStream p0, int p1)`

**Methods:**
- `public void write(java.lang.Object p0) throws java.io.IOException`

---

## public class `ch.qos.logback.core.net.DefaultSocketConnector`
implements `ch.qos.logback.core.net.SocketConnector`  

**Constructors:**
- `public DefaultSocketConnector(java.net.InetAddress p0, int p1, ch.qos.logback.core.util.DelayStrategy p2)`
- `public DefaultSocketConnector(java.net.InetAddress p0, int p1, long p2, long p3)`

**Methods:**
- `public java.net.Socket call() throws java.lang.InterruptedException`
- `public void setExceptionHandler(ch.qos.logback.core.net.SocketConnector$ExceptionHandler p0)`
- `public void setSocketFactory(javax.net.SocketFactory p0)`

---

## public class `ch.qos.logback.core.net.HardenedObjectInputStream`
extends `java.io.ObjectInputStream`  

**Constructors:**
- `public HardenedObjectInputStream(java.io.InputStream p0, java.lang.String[] p1) throws java.io.IOException`
- `public HardenedObjectInputStream(java.io.InputStream p0, java.util.List p1) throws java.io.IOException`

**Methods:**
- `protected void addToWhitelist(java.util.List p0)`
- `protected java.lang.Class resolveClass(java.io.ObjectStreamClass p0) throws java.io.IOException, java.lang.ClassNotFoundException`

---

## public class `ch.qos.logback.core.net.LoginAuthenticator`
extends `javax.mail.Authenticator`  

**Methods:**
- `public javax.mail.PasswordAuthentication getPasswordAuthentication()`

---

## public abstract interface `ch.qos.logback.core.net.ObjectWriter`

**Methods:**
- `public abstract void write(java.lang.Object p0) throws java.io.IOException`

---

## public class `ch.qos.logback.core.net.ObjectWriterFactory`

**Constructors:**
- `public ObjectWriterFactory()`

**Methods:**
- `public ch.qos.logback.core.net.AutoFlushingObjectWriter newAutoFlushingObjectWriter(java.io.OutputStream p0) throws java.io.IOException`

---

## public class `ch.qos.logback.core.net.QueueFactory`

**Constructors:**
- `public QueueFactory()`

**Methods:**
- `public <E extends java.lang.Object> java.util.concurrent.LinkedBlockingDeque newLinkedBlockingDeque(int p0)`

---

## public abstract class `ch.qos.logback.core.net.SMTPAppenderBase`<E extends java.lang.Object>
extends `ch.qos.logback.core.AppenderBase`  

**Constructors:**
- `public SMTPAppenderBase()`

**Fields:**
- `protected ch.qos.logback.core.spi.CyclicBufferTracker cbTracker`
- `protected ch.qos.logback.core.sift.Discriminator discriminator`
- `protected ch.qos.logback.core.boolex.EventEvaluator eventEvaluator`
- `protected ch.qos.logback.core.Layout layout`
- `protected javax.mail.Session session`
- `protected ch.qos.logback.core.Layout subjectLayout`

**Methods:**
- `public void addTo(java.lang.String p0)`
- `protected void append(E p0)`
- `public boolean checkEntryConditions()`
- `protected abstract boolean eventMarksEndOfLife(E p0)`
- `protected abstract void fillBuffer(ch.qos.logback.core.helpers.CyclicBuffer p0, java.lang.StringBuffer p1)`
- `public java.lang.String getCharsetEncoding()`
- `public ch.qos.logback.core.spi.CyclicBufferTracker getCyclicBufferTracker()`
- `public ch.qos.logback.core.sift.Discriminator getDiscriminator()`
- `public java.lang.String getFrom()`
- `public java.lang.String getJndiLocation()`
- `public ch.qos.logback.core.Layout getLayout()`
- `public java.lang.String getLocalhost()`
- `public java.lang.String getPassword()`
- `public java.lang.String getSMTPHost()`
- `public int getSMTPPort()`
- `public java.lang.String getSmtpHost()`
- `public int getSmtpPort()`
- `public java.lang.String getSubject()`
- `public java.util.List getToAsListOfString()`
- `public java.util.List getToList()`
- `public java.lang.String getUsername()`
- `public boolean isAsynchronousSending()`
- `public boolean isSSL()`
- `public boolean isSTARTTLS()`
- `public boolean isSessionViaJNDI()`
- `protected abstract ch.qos.logback.core.pattern.PatternLayoutBase makeNewToPatternLayout(java.lang.String p0)`
- `protected abstract ch.qos.logback.core.Layout makeSubjectLayout(java.lang.String p0)`
- `protected void sendBuffer(ch.qos.logback.core.helpers.CyclicBuffer p0, E p1)`
- `public void setAsynchronousSending(boolean p0)`
- `public void setCharsetEncoding(java.lang.String p0)`
- `public void setCyclicBufferTracker(ch.qos.logback.core.spi.CyclicBufferTracker p0)`
- `public void setDiscriminator(ch.qos.logback.core.sift.Discriminator p0)`
- `public void setEvaluator(ch.qos.logback.core.boolex.EventEvaluator p0)`
- `public void setFrom(java.lang.String p0)`
- `public void setJndiLocation(java.lang.String p0)`
- `public void setLayout(ch.qos.logback.core.Layout p0)`
- `public void setLocalhost(java.lang.String p0)`
- `public void setPassword(java.lang.String p0)`
- `public void setSMTPHost(java.lang.String p0)`
- `public void setSMTPPort(int p0)`
- `public void setSSL(boolean p0)`
- `public void setSTARTTLS(boolean p0)`
- `public void setSessionViaJNDI(boolean p0)`
- `public void setSmtpHost(java.lang.String p0)`
- `public void setSmtpPort(int p0)`
- `public void setSubject(java.lang.String p0)`
- `public void setUsername(java.lang.String p0)`
- `public void start()`
- `public synchronized void stop()`
- `protected abstract void subAppend(ch.qos.logback.core.helpers.CyclicBuffer p0, E p1)`

---

## public abstract interface `ch.qos.logback.core.net.SocketConnector`
implements `java.util.concurrent.Callable<java.net.Socket>`  

**Methods:**
- `public abstract java.net.Socket call() throws java.lang.InterruptedException`
- `public abstract void setExceptionHandler(ch.qos.logback.core.net.SocketConnector$ExceptionHandler p0)`
- `public abstract void setSocketFactory(javax.net.SocketFactory p0)`

---

## public abstract static interface `ch.qos.logback.core.net.SocketConnector$ExceptionHandler`

**Methods:**
- `public abstract void connectionFailed(ch.qos.logback.core.net.SocketConnector p0, java.lang.Exception p1)`

---

## public abstract class `ch.qos.logback.core.net.SyslogAppenderBase`<E extends java.lang.Object>
extends `ch.qos.logback.core.AppenderBase`  

**Constructors:**
- `public SyslogAppenderBase()`

**Fields:**
- `protected java.lang.String suffixPattern`

**Methods:**
- `protected void append(E p0)`
- `public abstract ch.qos.logback.core.Layout buildLayout()`
- `public abstract ch.qos.logback.core.net.SyslogOutputStream createOutputStream() throws java.net.SocketException, java.net.UnknownHostException`
- `public static int facilityStringToint(java.lang.String p0)`
- `public java.nio.charset.Charset getCharset()`
- `public java.lang.String getFacility()`
- `public ch.qos.logback.core.Layout getLayout()`
- `public int getMaxMessageSize()`
- `public int getPort()`
- `public abstract int getSeverityForEvent(java.lang.Object p0)`
- `public java.lang.String getSuffixPattern()`
- `public java.lang.String getSyslogHost()`
- `protected void postProcess(java.lang.Object p0, java.io.OutputStream p1)`
- `public void setCharset(java.nio.charset.Charset p0)`
- `public void setFacility(java.lang.String p0)`
- `public void setLayout(ch.qos.logback.core.Layout p0)`
- `public void setMaxMessageSize(int p0)`
- `public void setPort(int p0)`
- `public void setSuffixPattern(java.lang.String p0)`
- `public void setSyslogHost(java.lang.String p0)`
- `public void start()`
- `public void stop()`

---

## public class `ch.qos.logback.core.net.SyslogConstants`

**Constructors:**
- `public SyslogConstants()`

**Fields:**
- `public final static int ALERT_SEVERITY`
- `public final static int CRITICAL_SEVERITY`
- `public final static int DEBUG_SEVERITY`
- `public final static int EMERGENCY_SEVERITY`
- `public final static int ERROR_SEVERITY`
- `public final static int INFO_SEVERITY`
- `public final static int LOG_ALERT`
- `public final static int LOG_AUDIT`
- `public final static int LOG_AUTH`
- `public final static int LOG_AUTHPRIV`
- `public final static int LOG_CLOCK`
- `public final static int LOG_CRON`
- `public final static int LOG_DAEMON`
- `public final static int LOG_FTP`
- `public final static int LOG_KERN`
- `public final static int LOG_LOCAL0`
- `public final static int LOG_LOCAL1`
- `public final static int LOG_LOCAL2`
- `public final static int LOG_LOCAL3`
- `public final static int LOG_LOCAL4`
- `public final static int LOG_LOCAL5`
- `public final static int LOG_LOCAL6`
- `public final static int LOG_LOCAL7`
- `public final static int LOG_LPR`
- `public final static int LOG_MAIL`
- `public final static int LOG_NEWS`
- `public final static int LOG_NTP`
- `public final static int LOG_SYSLOG`
- `public final static int LOG_USER`
- `public final static int LOG_UUCP`
- `public final static int NOTICE_SEVERITY`
- `public final static int SYSLOG_PORT`
- `public final static int WARNING_SEVERITY`

---

## public class `ch.qos.logback.core.net.SyslogOutputStream`
extends `java.io.OutputStream`  

**Constructors:**
- `public SyslogOutputStream(java.lang.String p0, int p1) throws java.net.SocketException, java.net.UnknownHostException`

**Methods:**
- `public void close()`
- `public void flush() throws java.io.IOException`
- `public int getPort()`
- `public void write(byte[] p0, int p1, int p2) throws java.io.IOException`
- `public void write(int p0) throws java.io.IOException`

---

## public abstract class `ch.qos.logback.core.net.server.AbstractServerSocketAppender`<E extends java.lang.Object>
extends `ch.qos.logback.core.AppenderBase`  

**Constructors:**
- `public AbstractServerSocketAppender()`

**Fields:**
- `public final static int DEFAULT_BACKLOG`
- `public final static int DEFAULT_CLIENT_QUEUE_SIZE`

**Methods:**
- `protected void append(E p0)`
- `protected ch.qos.logback.core.net.server.ServerListener createServerListener(java.net.ServerSocket p0)`
- `protected ch.qos.logback.core.net.server.ServerRunner createServerRunner(ch.qos.logback.core.net.server.ServerListener p0, java.util.concurrent.Executor p1)`
- `public java.lang.String getAddress()`
- `public int getBacklog()`
- `public int getClientQueueSize()`
- `protected java.net.InetAddress getInetAddress() throws java.net.UnknownHostException`
- `protected abstract ch.qos.logback.core.spi.PreSerializationTransformer getPST()`
- `public int getPort()`
- `protected javax.net.ServerSocketFactory getServerSocketFactory() throws java.lang.Exception`
- `protected abstract void postProcessEvent(E p0)`
- `public void setAddress(java.lang.String p0)`
- `public void setBacklog(int p0)`
- `public void setClientQueueSize(int p0)`
- `public void setPort(int p0)`
- `public void start()`
- `public void stop()`

---

## public abstract interface `ch.qos.logback.core.net.server.Client`
implements `java.io.Closeable`, `java.lang.Runnable`  

**Methods:**
- `public abstract void close()`

---

## public abstract interface `ch.qos.logback.core.net.server.ClientVisitor`<T extends ch.qos.logback.core.net.server.Client>

**Methods:**
- `public abstract void visit(T p0)`

---

## public abstract class `ch.qos.logback.core.net.server.ConcurrentServerRunner`<T extends ch.qos.logback.core.net.server.Client>
extends `ch.qos.logback.core.spi.ContextAwareBase`  
implements `ch.qos.logback.core.net.server.ServerRunner<T>`, `java.lang.Runnable`  

**Constructors:**
- `public ConcurrentServerRunner(ch.qos.logback.core.net.server.ServerListener p0, java.util.concurrent.Executor p1)`

**Methods:**
- `public void accept(ch.qos.logback.core.net.server.ClientVisitor p0)`
- `protected abstract boolean configureClient(T p0)`
- `public boolean isRunning()`
- `public void run()`
- `protected void setRunning(boolean p0)`
- `public void stop() throws java.io.IOException`

---

## public abstract class `ch.qos.logback.core.net.server.SSLServerSocketAppenderBase`<E extends java.lang.Object>
extends `ch.qos.logback.core.net.server.AbstractServerSocketAppender`  
implements `ch.qos.logback.core.net.ssl.SSLComponent`  

**Constructors:**
- `public SSLServerSocketAppenderBase()`

**Methods:**
- `protected javax.net.ServerSocketFactory getServerSocketFactory()`
- `public ch.qos.logback.core.net.ssl.SSLConfiguration getSsl()`
- `public void setSsl(ch.qos.logback.core.net.ssl.SSLConfiguration p0)`
- `public void start()`

---

## public abstract interface `ch.qos.logback.core.net.server.ServerListener`<T extends ch.qos.logback.core.net.server.Client>
implements `java.io.Closeable`  

**Methods:**
- `public abstract T acceptClient() throws java.io.IOException, java.lang.InterruptedException`
- `public abstract void close()`

---

## public abstract interface `ch.qos.logback.core.net.server.ServerRunner`<T extends ch.qos.logback.core.net.server.Client>
implements `ch.qos.logback.core.spi.ContextAware`, `java.lang.Runnable`  

**Methods:**
- `public abstract void accept(ch.qos.logback.core.net.server.ClientVisitor p0)`
- `public abstract boolean isRunning()`
- `public abstract void stop() throws java.io.IOException`

---

## public abstract class `ch.qos.logback.core.net.server.ServerSocketListener`<T extends ch.qos.logback.core.net.server.Client>
implements `ch.qos.logback.core.net.server.ServerListener<T>`  

**Constructors:**
- `public ServerSocketListener(java.net.ServerSocket p0)`

**Methods:**
- `public T acceptClient() throws java.io.IOException`
- `public void close()`
- `protected abstract T createClient(java.lang.String p0, java.net.Socket p1) throws java.io.IOException`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.core.net.ssl.ConfigurableSSLServerSocketFactory`
extends `javax.net.ServerSocketFactory`  

**Constructors:**
- `public ConfigurableSSLServerSocketFactory(ch.qos.logback.core.net.ssl.SSLParametersConfiguration p0, javax.net.ssl.SSLServerSocketFactory p1)`

**Methods:**
- `public java.net.ServerSocket createServerSocket(int p0) throws java.io.IOException`
- `public java.net.ServerSocket createServerSocket(int p0, int p1) throws java.io.IOException`
- `public java.net.ServerSocket createServerSocket(int p0, int p1, java.net.InetAddress p2) throws java.io.IOException`

---

## public class `ch.qos.logback.core.net.ssl.ConfigurableSSLSocketFactory`
extends `javax.net.SocketFactory`  

**Constructors:**
- `public ConfigurableSSLSocketFactory(ch.qos.logback.core.net.ssl.SSLParametersConfiguration p0, javax.net.ssl.SSLSocketFactory p1)`

**Methods:**
- `public java.net.Socket createSocket(java.lang.String p0, int p1) throws java.io.IOException, java.net.UnknownHostException`
- `public java.net.Socket createSocket(java.lang.String p0, int p1, java.net.InetAddress p2, int p3) throws java.io.IOException, java.net.UnknownHostException`
- `public java.net.Socket createSocket(java.net.InetAddress p0, int p1) throws java.io.IOException`
- `public java.net.Socket createSocket(java.net.InetAddress p0, int p1, java.net.InetAddress p2, int p3) throws java.io.IOException`

---

## public class `ch.qos.logback.core.net.ssl.KeyManagerFactoryFactoryBean`

**Constructors:**
- `public KeyManagerFactoryFactoryBean()`

**Methods:**
- `public javax.net.ssl.KeyManagerFactory createKeyManagerFactory() throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException`
- `public java.lang.String getAlgorithm()`
- `public java.lang.String getProvider()`
- `public void setAlgorithm(java.lang.String p0)`
- `public void setProvider(java.lang.String p0)`

---

## public class `ch.qos.logback.core.net.ssl.KeyStoreFactoryBean`

**Constructors:**
- `public KeyStoreFactoryBean()`

**Methods:**
- `public java.security.KeyStore createKeyStore() throws java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException`
- `public java.lang.String getLocation()`
- `public java.lang.String getPassword()`
- `public java.lang.String getProvider()`
- `public java.lang.String getType()`
- `public void setLocation(java.lang.String p0)`
- `public void setPassword(java.lang.String p0)`
- `public void setProvider(java.lang.String p0)`
- `public void setType(java.lang.String p0)`

---

## public abstract interface `ch.qos.logback.core.net.ssl.SSL`

**Fields:**
- `public final static java.lang.String DEFAULT_KEYSTORE_PASSWORD`
- `public final static java.lang.String DEFAULT_KEYSTORE_TYPE`
- `public final static java.lang.String DEFAULT_PROTOCOL`
- `public final static java.lang.String DEFAULT_SECURE_RANDOM_ALGORITHM`

---

## public abstract interface `ch.qos.logback.core.net.ssl.SSLComponent`

**Methods:**
- `public abstract ch.qos.logback.core.net.ssl.SSLConfiguration getSsl()`
- `public abstract void setSsl(ch.qos.logback.core.net.ssl.SSLConfiguration p0)`

---

## public abstract interface `ch.qos.logback.core.net.ssl.SSLConfigurable`

**Methods:**
- `public abstract java.lang.String[] getDefaultCipherSuites()`
- `public abstract java.lang.String[] getDefaultProtocols()`
- `public abstract java.lang.String[] getSupportedCipherSuites()`
- `public abstract java.lang.String[] getSupportedProtocols()`
- `public abstract void setEnabledCipherSuites(java.lang.String[] p0)`
- `public abstract void setEnabledProtocols(java.lang.String[] p0)`
- `public abstract void setHostnameVerification(boolean p0)`
- `public abstract void setNeedClientAuth(boolean p0)`
- `public abstract void setWantClientAuth(boolean p0)`

---

## public class `ch.qos.logback.core.net.ssl.SSLConfigurableServerSocket`
implements `ch.qos.logback.core.net.ssl.SSLConfigurable`  

**Constructors:**
- `public SSLConfigurableServerSocket(javax.net.ssl.SSLServerSocket p0)`

**Methods:**
- `public java.lang.String[] getDefaultCipherSuites()`
- `public java.lang.String[] getDefaultProtocols()`
- `public java.lang.String[] getSupportedCipherSuites()`
- `public java.lang.String[] getSupportedProtocols()`
- `public void setEnabledCipherSuites(java.lang.String[] p0)`
- `public void setEnabledProtocols(java.lang.String[] p0)`
- `public void setHostnameVerification(boolean p0)`
- `public void setNeedClientAuth(boolean p0)`
- `public void setWantClientAuth(boolean p0)`

---

## public class `ch.qos.logback.core.net.ssl.SSLConfigurableSocket`
implements `ch.qos.logback.core.net.ssl.SSLConfigurable`  

**Constructors:**
- `public SSLConfigurableSocket(javax.net.ssl.SSLSocket p0)`

**Methods:**
- `public java.lang.String[] getDefaultCipherSuites()`
- `public java.lang.String[] getDefaultProtocols()`
- `public java.lang.String[] getSupportedCipherSuites()`
- `public java.lang.String[] getSupportedProtocols()`
- `public void setEnabledCipherSuites(java.lang.String[] p0)`
- `public void setEnabledProtocols(java.lang.String[] p0)`
- `public void setHostnameVerification(boolean p0)`
- `public void setNeedClientAuth(boolean p0)`
- `public void setWantClientAuth(boolean p0)`

---

## public class `ch.qos.logback.core.net.ssl.SSLConfiguration`
extends `ch.qos.logback.core.net.ssl.SSLContextFactoryBean`  

**Constructors:**
- `public SSLConfiguration()`

**Methods:**
- `public ch.qos.logback.core.net.ssl.SSLParametersConfiguration getParameters()`
- `public void setParameters(ch.qos.logback.core.net.ssl.SSLParametersConfiguration p0)`

---

## public class `ch.qos.logback.core.net.ssl.SSLContextFactoryBean`

**Constructors:**
- `public SSLContextFactoryBean()`

**Methods:**
- `public javax.net.ssl.SSLContext createContext(ch.qos.logback.core.spi.ContextAware p0) throws java.security.KeyManagementException, java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.UnrecoverableKeyException, java.security.cert.CertificateException`
- `public ch.qos.logback.core.net.ssl.KeyManagerFactoryFactoryBean getKeyManagerFactory()`
- `public ch.qos.logback.core.net.ssl.KeyStoreFactoryBean getKeyStore()`
- `public java.lang.String getProtocol()`
- `public java.lang.String getProvider()`
- `public ch.qos.logback.core.net.ssl.SecureRandomFactoryBean getSecureRandom()`
- `public ch.qos.logback.core.net.ssl.TrustManagerFactoryFactoryBean getTrustManagerFactory()`
- `public ch.qos.logback.core.net.ssl.KeyStoreFactoryBean getTrustStore()`
- `public void setKeyManagerFactory(ch.qos.logback.core.net.ssl.KeyManagerFactoryFactoryBean p0)`
- `public void setKeyStore(ch.qos.logback.core.net.ssl.KeyStoreFactoryBean p0)`
- `public void setProtocol(java.lang.String p0)`
- `public void setProvider(java.lang.String p0)`
- `public void setSecureRandom(ch.qos.logback.core.net.ssl.SecureRandomFactoryBean p0)`
- `public void setTrustManagerFactory(ch.qos.logback.core.net.ssl.TrustManagerFactoryFactoryBean p0)`
- `public void setTrustStore(ch.qos.logback.core.net.ssl.KeyStoreFactoryBean p0)`

---

## public class `ch.qos.logback.core.net.ssl.SSLNestedComponentRegistryRules`

**Constructors:**
- `public SSLNestedComponentRegistryRules()`

**Methods:**
- `public static void addDefaultNestedComponentRegistryRules(ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry p0)`

---

## public class `ch.qos.logback.core.net.ssl.SSLParametersConfiguration`
extends `ch.qos.logback.core.spi.ContextAwareBase`  

**Constructors:**
- `public SSLParametersConfiguration()`

**Methods:**
- `public void configure(ch.qos.logback.core.net.ssl.SSLConfigurable p0)`
- `public java.lang.String getExcludedCipherSuites()`
- `public java.lang.String getExcludedProtocols()`
- `public boolean getHostnameVerification()`
- `public java.lang.String getIncludedCipherSuites()`
- `public java.lang.String getIncludedProtocols()`
- `public java.lang.Boolean isNeedClientAuth()`
- `public java.lang.Boolean isWantClientAuth()`
- `public void setExcludedCipherSuites(java.lang.String p0)`
- `public void setExcludedProtocols(java.lang.String p0)`
- `public void setHostnameVerification(boolean p0)`
- `public void setIncludedCipherSuites(java.lang.String p0)`
- `public void setIncludedProtocols(java.lang.String p0)`
- `public void setNeedClientAuth(java.lang.Boolean p0)`
- `public void setWantClientAuth(java.lang.Boolean p0)`

---

## public class `ch.qos.logback.core.net.ssl.SecureRandomFactoryBean`

**Constructors:**
- `public SecureRandomFactoryBean()`

**Methods:**
- `public java.security.SecureRandom createSecureRandom() throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException`
- `public java.lang.String getAlgorithm()`
- `public java.lang.String getProvider()`
- `public void setAlgorithm(java.lang.String p0)`
- `public void setProvider(java.lang.String p0)`

---

## public class `ch.qos.logback.core.net.ssl.TrustManagerFactoryFactoryBean`

**Constructors:**
- `public TrustManagerFactoryFactoryBean()`

**Methods:**
- `public javax.net.ssl.TrustManagerFactory createTrustManagerFactory() throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException`
- `public java.lang.String getAlgorithm()`
- `public java.lang.String getProvider()`
- `public void setAlgorithm(java.lang.String p0)`
- `public void setProvider(java.lang.String p0)`

---

## public abstract class `ch.qos.logback.core.pattern.CompositeConverter`<E extends java.lang.Object>
extends `ch.qos.logback.core.pattern.DynamicConverter`  

**Constructors:**
- `public CompositeConverter()`

**Methods:**
- `public java.lang.String convert(E p0)`
- `public ch.qos.logback.core.pattern.Converter getChildConverter()`
- `public void setChildConverter(ch.qos.logback.core.pattern.Converter p0)`
- `public java.lang.String toString()`
- `protected abstract java.lang.String transform(E p0, java.lang.String p1)`

---

## public abstract class `ch.qos.logback.core.pattern.Converter`<E extends java.lang.Object>

**Constructors:**
- `public Converter()`

**Methods:**
- `public abstract java.lang.String convert(E p0)`
- `public final ch.qos.logback.core.pattern.Converter getNext()`
- `public final void setNext(ch.qos.logback.core.pattern.Converter p0)`
- `public void write(java.lang.StringBuilder p0, E p1)`

---

## public class `ch.qos.logback.core.pattern.ConverterUtil`

**Constructors:**
- `public ConverterUtil()`

**Methods:**
- `public static <E extends java.lang.Object> ch.qos.logback.core.pattern.Converter findTail(ch.qos.logback.core.pattern.Converter p0)`
- `public static <E extends java.lang.Object> void setContextForConverters(ch.qos.logback.core.Context p0, ch.qos.logback.core.pattern.Converter p1)`
- `public static <E extends java.lang.Object> void startConverters(ch.qos.logback.core.pattern.Converter p0)`

---

## public abstract class `ch.qos.logback.core.pattern.DynamicConverter`<E extends java.lang.Object>
extends `ch.qos.logback.core.pattern.FormattingConverter`  
implements `ch.qos.logback.core.spi.ContextAware`, `ch.qos.logback.core.spi.LifeCycle`  

**Constructors:**
- `public DynamicConverter()`

**Fields:**
- `protected boolean started`

**Methods:**
- `public void addError(java.lang.String p0)`
- `public void addError(java.lang.String p0, java.lang.Throwable p1)`
- `public void addInfo(java.lang.String p0)`
- `public void addInfo(java.lang.String p0, java.lang.Throwable p1)`
- `public void addStatus(ch.qos.logback.core.status.Status p0)`
- `public void addWarn(java.lang.String p0)`
- `public void addWarn(java.lang.String p0, java.lang.Throwable p1)`
- `public ch.qos.logback.core.Context getContext()`
- `public java.lang.String getFirstOption()`
- `protected java.util.List getOptionList()`
- `public boolean isStarted()`
- `public void setContext(ch.qos.logback.core.Context p0)`
- `public void setOptionList(java.util.List p0)`
- `public void start()`
- `public void stop()`

---

## public class `ch.qos.logback.core.pattern.FormatInfo`

**Constructors:**
- `public FormatInfo()`
- `public FormatInfo(int p0, int p1)`
- `public FormatInfo(int p0, int p1, boolean p2, boolean p3)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int getMax()`
- `public int getMin()`
- `public int hashCode()`
- `public boolean isLeftPad()`
- `public boolean isLeftTruncate()`
- `public void setLeftPad(boolean p0)`
- `public void setLeftTruncate(boolean p0)`
- `public void setMax(int p0)`
- `public void setMin(int p0)`
- `public java.lang.String toString()`
- `public static ch.qos.logback.core.pattern.FormatInfo valueOf(java.lang.String p0) throws java.lang.IllegalArgumentException`

---

## public abstract class `ch.qos.logback.core.pattern.FormattingConverter`<E extends java.lang.Object>
extends `ch.qos.logback.core.pattern.Converter`  

**Constructors:**
- `public FormattingConverter()`

**Methods:**
- `public final ch.qos.logback.core.pattern.FormatInfo getFormattingInfo()`
- `public final void setFormattingInfo(ch.qos.logback.core.pattern.FormatInfo p0)`
- `public final void write(java.lang.StringBuilder p0, E p1)`

---

## public class `ch.qos.logback.core.pattern.IdentityCompositeConverter`<E extends java.lang.Object>
extends `ch.qos.logback.core.pattern.CompositeConverter`  

**Constructors:**
- `public IdentityCompositeConverter()`

**Methods:**
- `protected java.lang.String transform(E p0, java.lang.String p1)`

---

## public final class `ch.qos.logback.core.pattern.LiteralConverter`<E extends java.lang.Object>
extends `ch.qos.logback.core.pattern.Converter`  

**Constructors:**
- `public LiteralConverter(java.lang.String p0)`

**Methods:**
- `public java.lang.String convert(E p0)`

---

## public abstract class `ch.qos.logback.core.pattern.PatternLayoutBase`<E extends java.lang.Object>
extends `ch.qos.logback.core.LayoutBase`  

**Constructors:**
- `public PatternLayoutBase()`

**Fields:**
- `protected boolean outputPatternAsHeader`
- `protected ch.qos.logback.core.pattern.PostCompileProcessor postCompileProcessor`

**Methods:**
- `public abstract java.util.Map getDefaultConverterMap()`
- `public java.util.Map getEffectiveConverterMap()`
- `public java.util.Map getInstanceConverterMap()`
- `public java.lang.String getPattern()`
- `public java.lang.String getPresentationHeader()`
- `protected java.lang.String getPresentationHeaderPrefix()`
- `public boolean isOutputPatternAsHeader()`
- `protected void setContextForConverters(ch.qos.logback.core.pattern.Converter p0)`
- `public void setOutputPatternAsHeader(boolean p0)`
- `public void setPattern(java.lang.String p0)`
- `public void setPostCompileProcessor(ch.qos.logback.core.pattern.PostCompileProcessor p0)`
- `public void start()`
- `public java.lang.String toString()`
- `protected java.lang.String writeLoopOnConverters(E p0)`

---

## public class `ch.qos.logback.core.pattern.PatternLayoutEncoderBase`<E extends java.lang.Object>
extends `ch.qos.logback.core.encoder.LayoutWrappingEncoder`  

**Constructors:**
- `public PatternLayoutEncoderBase()`

**Fields:**
- `protected boolean outputPatternAsHeader`

**Methods:**
- `public java.lang.String getPattern()`
- `public boolean isOutputPatternAsHeader()`
- `public boolean isOutputPatternAsPresentationHeader()`
- `public void setLayout(ch.qos.logback.core.Layout p0)`
- `public void setOutputPatternAsHeader(boolean p0)`
- `public void setOutputPatternAsPresentationHeader(boolean p0)`
- `public void setPattern(java.lang.String p0)`

---

## public abstract interface `ch.qos.logback.core.pattern.PostCompileProcessor`<E extends java.lang.Object>

**Methods:**
- `public abstract void process(ch.qos.logback.core.Context p0, ch.qos.logback.core.pattern.Converter p1)`

---

## public class `ch.qos.logback.core.pattern.ReplacingCompositeConverter`<E extends java.lang.Object>
extends `ch.qos.logback.core.pattern.CompositeConverter`  

**Constructors:**
- `public ReplacingCompositeConverter()`

**Methods:**
- `public void start()`
- `protected java.lang.String transform(E p0, java.lang.String p1)`

---

## public class `ch.qos.logback.core.pattern.SpacePadder`

**Constructors:**
- `public SpacePadder()`

**Methods:**
- `public final static void leftPad(java.lang.StringBuilder p0, java.lang.String p1, int p2)`
- `public final static void rightPad(java.lang.StringBuilder p0, java.lang.String p1, int p2)`
- `public final static void spacePad(java.lang.StringBuilder p0, int p1)`

---

## public class `ch.qos.logback.core.pattern.color.ANSIConstants`

**Constructors:**
- `public ANSIConstants()`

**Fields:**
- `public final static java.lang.String BLACK_FG`
- `public final static java.lang.String BLUE_FG`
- `public final static java.lang.String BOLD`
- `public final static java.lang.String CYAN_FG`
- `public final static java.lang.String DEFAULT_FG`
- `public final static java.lang.String ESC_END`
- `public final static java.lang.String ESC_START`
- `public final static java.lang.String GREEN_FG`
- `public final static java.lang.String MAGENTA_FG`
- `public final static java.lang.String RED_FG`
- `public final static java.lang.String WHITE_FG`
- `public final static java.lang.String YELLOW_FG`

---

## public class `ch.qos.logback.core.pattern.color.BlackCompositeConverter`<E extends java.lang.Object>
extends `ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase`  

**Constructors:**
- `public BlackCompositeConverter()`

**Methods:**
- `protected java.lang.String getForegroundColorCode(E p0)`

---

## public class `ch.qos.logback.core.pattern.color.BlueCompositeConverter`<E extends java.lang.Object>
extends `ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase`  

**Constructors:**
- `public BlueCompositeConverter()`

**Methods:**
- `protected java.lang.String getForegroundColorCode(E p0)`

---

## public class `ch.qos.logback.core.pattern.color.BoldBlueCompositeConverter`<E extends java.lang.Object>
extends `ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase`  

**Constructors:**
- `public BoldBlueCompositeConverter()`

**Methods:**
- `protected java.lang.String getForegroundColorCode(E p0)`

---

## public class `ch.qos.logback.core.pattern.color.BoldCyanCompositeConverter`<E extends java.lang.Object>
extends `ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase`  

**Constructors:**
- `public BoldCyanCompositeConverter()`

**Methods:**
- `protected java.lang.String getForegroundColorCode(E p0)`

---

## public class `ch.qos.logback.core.pattern.color.BoldGreenCompositeConverter`<E extends java.lang.Object>
extends `ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase`  

**Constructors:**
- `public BoldGreenCompositeConverter()`

**Methods:**
- `protected java.lang.String getForegroundColorCode(E p0)`

---

## public class `ch.qos.logback.core.pattern.color.BoldMagentaCompositeConverter`<E extends java.lang.Object>
extends `ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase`  

**Constructors:**
- `public BoldMagentaCompositeConverter()`

**Methods:**
- `protected java.lang.String getForegroundColorCode(E p0)`

---

## public class `ch.qos.logback.core.pattern.color.BoldRedCompositeConverter`<E extends java.lang.Object>
extends `ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase`  

**Constructors:**
- `public BoldRedCompositeConverter()`

**Methods:**
- `protected java.lang.String getForegroundColorCode(E p0)`

---

## public class `ch.qos.logback.core.pattern.color.BoldWhiteCompositeConverter`<E extends java.lang.Object>
extends `ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase`  

**Constructors:**
- `public BoldWhiteCompositeConverter()`

**Methods:**
- `protected java.lang.String getForegroundColorCode(E p0)`

---

## public class `ch.qos.logback.core.pattern.color.BoldYellowCompositeConverter`<E extends java.lang.Object>
extends `ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase`  

**Constructors:**
- `public BoldYellowCompositeConverter()`

**Methods:**
- `protected java.lang.String getForegroundColorCode(E p0)`

---

## public class `ch.qos.logback.core.pattern.color.CyanCompositeConverter`<E extends java.lang.Object>
extends `ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase`  

**Constructors:**
- `public CyanCompositeConverter()`

**Methods:**
- `protected java.lang.String getForegroundColorCode(E p0)`

---

## public abstract class `ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase`<E extends java.lang.Object>
extends `ch.qos.logback.core.pattern.CompositeConverter`  

**Constructors:**
- `public ForegroundCompositeConverterBase()`

**Methods:**
- `protected abstract java.lang.String getForegroundColorCode(E p0)`
- `protected java.lang.String transform(E p0, java.lang.String p1)`

---

## public class `ch.qos.logback.core.pattern.color.GrayCompositeConverter`<E extends java.lang.Object>
extends `ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase`  

**Constructors:**
- `public GrayCompositeConverter()`

**Methods:**
- `protected java.lang.String getForegroundColorCode(E p0)`

---

## public class `ch.qos.logback.core.pattern.color.GreenCompositeConverter`<E extends java.lang.Object>
extends `ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase`  

**Constructors:**
- `public GreenCompositeConverter()`

**Methods:**
- `protected java.lang.String getForegroundColorCode(E p0)`

---

## public class `ch.qos.logback.core.pattern.color.MagentaCompositeConverter`<E extends java.lang.Object>
extends `ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase`  

**Constructors:**
- `public MagentaCompositeConverter()`

**Methods:**
- `protected java.lang.String getForegroundColorCode(E p0)`

---

## public class `ch.qos.logback.core.pattern.color.RedCompositeConverter`<E extends java.lang.Object>
extends `ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase`  

**Constructors:**
- `public RedCompositeConverter()`

**Methods:**
- `protected java.lang.String getForegroundColorCode(E p0)`

---

## public class `ch.qos.logback.core.pattern.color.WhiteCompositeConverter`<E extends java.lang.Object>
extends `ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase`  

**Constructors:**
- `public WhiteCompositeConverter()`

**Methods:**
- `protected java.lang.String getForegroundColorCode(E p0)`

---

## public class `ch.qos.logback.core.pattern.color.YellowCompositeConverter`<E extends java.lang.Object>
extends `ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase`  

**Constructors:**
- `public YellowCompositeConverter()`

**Methods:**
- `protected java.lang.String getForegroundColorCode(E p0)`

---

## public class `ch.qos.logback.core.pattern.parser.CompositeNode`
extends `ch.qos.logback.core.pattern.parser.SimpleKeywordNode`  

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public ch.qos.logback.core.pattern.parser.Node getChildNode()`
- `public int hashCode()`
- `public void setChildNode(ch.qos.logback.core.pattern.parser.Node p0)`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.core.pattern.parser.FormattingNode`
extends `ch.qos.logback.core.pattern.parser.Node`  

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public ch.qos.logback.core.pattern.FormatInfo getFormatInfo()`
- `public int hashCode()`
- `public void setFormatInfo(ch.qos.logback.core.pattern.FormatInfo p0)`

---

## public class `ch.qos.logback.core.pattern.parser.Node`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public ch.qos.logback.core.pattern.parser.Node getNext()`
- `public int getType()`
- `public java.lang.Object getValue()`
- `public int hashCode()`
- `public void setNext(ch.qos.logback.core.pattern.parser.Node p0)`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.core.pattern.parser.OptionTokenizer`

---

## public class `ch.qos.logback.core.pattern.parser.Parser`<E extends java.lang.Object>
extends `ch.qos.logback.core.spi.ContextAwareBase`  

**Constructors:**
- `public Parser(java.lang.String p0) throws ch.qos.logback.core.spi.ScanException`
- `public Parser(java.lang.String p0, ch.qos.logback.core.pattern.util.IEscapeUtil p1) throws ch.qos.logback.core.spi.ScanException`

**Fields:**
- `public final static java.util.Map DEFAULT_COMPOSITE_CONVERTER_MAP`
- `public final static java.lang.String MISSING_RIGHT_PARENTHESIS`
- `public final static java.lang.String REPLACE_CONVERTER_WORD`

**Methods:**
- `public ch.qos.logback.core.pattern.Converter compile(ch.qos.logback.core.pattern.parser.Node p0, java.util.Map p1)`
- `public ch.qos.logback.core.pattern.parser.Node parse() throws ch.qos.logback.core.spi.ScanException`

---

## public class `ch.qos.logback.core.pattern.parser.SimpleKeywordNode`
extends `ch.qos.logback.core.pattern.parser.FormattingNode`  

**Constructors:**
- `protected SimpleKeywordNode(int p0, java.lang.Object p1)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.util.List getOptions()`
- `public int hashCode()`
- `public void setOptions(java.util.List p0)`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.core.pattern.util.AlmostAsIsEscapeUtil`
extends `ch.qos.logback.core.pattern.util.RestrictedEscapeUtil`  

**Constructors:**
- `public AlmostAsIsEscapeUtil()`

**Methods:**
- `public void escape(java.lang.String p0, java.lang.StringBuffer p1, char p2, int p3)`

---

## public class `ch.qos.logback.core.pattern.util.AsIsEscapeUtil`
implements `ch.qos.logback.core.pattern.util.IEscapeUtil`  

**Constructors:**
- `public AsIsEscapeUtil()`

**Methods:**
- `public void escape(java.lang.String p0, java.lang.StringBuffer p1, char p2, int p3)`

---

## public abstract interface `ch.qos.logback.core.pattern.util.IEscapeUtil`

**Methods:**
- `public abstract void escape(java.lang.String p0, java.lang.StringBuffer p1, char p2, int p3)`

---

## public class `ch.qos.logback.core.pattern.util.RegularEscapeUtil`
implements `ch.qos.logback.core.pattern.util.IEscapeUtil`  

**Constructors:**
- `public RegularEscapeUtil()`

**Methods:**
- `public static java.lang.String basicEscape(java.lang.String p0)`
- `public void escape(java.lang.String p0, java.lang.StringBuffer p1, char p2, int p3)`

---

## public class `ch.qos.logback.core.pattern.util.RestrictedEscapeUtil`
implements `ch.qos.logback.core.pattern.util.IEscapeUtil`  

**Constructors:**
- `public RestrictedEscapeUtil()`

**Methods:**
- `public void escape(java.lang.String p0, java.lang.StringBuffer p1, char p2, int p3)`

---

## public class `ch.qos.logback.core.property.FileExistsPropertyDefiner`
extends `ch.qos.logback.core.PropertyDefinerBase`  

**Constructors:**
- `public FileExistsPropertyDefiner()`

**Methods:**
- `public java.lang.String getPath()`
- `public java.lang.String getPropertyValue()`
- `public void setPath(java.lang.String p0)`

---

## public class `ch.qos.logback.core.property.ResourceExistsPropertyDefiner`
extends `ch.qos.logback.core.PropertyDefinerBase`  

**Constructors:**
- `public ResourceExistsPropertyDefiner()`

**Methods:**
- `public java.lang.String getPropertyValue()`
- `public java.lang.String getResource()`
- `public void setResource(java.lang.String p0)`

---

## public class `ch.qos.logback.core.read.CyclicBufferAppender`<E extends java.lang.Object>
extends `ch.qos.logback.core.AppenderBase`  

**Constructors:**
- `public CyclicBufferAppender()`

**Methods:**
- `protected void append(E p0)`
- `public E get(int p0)`
- `public int getLength()`
- `public int getMaxSize()`
- `public void reset()`
- `public void setMaxSize(int p0)`
- `public void start()`
- `public void stop()`

---

## public class `ch.qos.logback.core.read.ListAppender`<E extends java.lang.Object>
extends `ch.qos.logback.core.AppenderBase`  

**Constructors:**
- `public ListAppender()`

**Fields:**
- `public java.util.List list`

**Methods:**
- `protected void append(E p0)`

---

## public class `ch.qos.logback.core.recovery.RecoveryCoordinator`

**Constructors:**
- `public RecoveryCoordinator()`
- `public RecoveryCoordinator(long p0)`

**Fields:**
- `public final static long BACKOFF_COEFFICIENT_MIN`
- `public final static long BACKOFF_MULTIPLIER`

**Methods:**
- `public boolean isTooSoon()`

---

## public class `ch.qos.logback.core.recovery.ResilientFileOutputStream`
extends `ch.qos.logback.core.recovery.ResilientOutputStreamBase`  

**Constructors:**
- `public ResilientFileOutputStream(java.io.File p0, boolean p1, long p2) throws java.io.FileNotFoundException`

**Methods:**
- `public java.nio.channels.FileChannel getChannel()`
- `public java.io.File getFile()`
- `public java.lang.String toString()`

---

## public abstract class `ch.qos.logback.core.recovery.ResilientOutputStreamBase`
extends `java.io.OutputStream`  

**Constructors:**
- `public ResilientOutputStreamBase()`

**Fields:**
- `protected java.io.OutputStream os`
- `protected boolean presumedClean`

**Methods:**
- `public void addStatus(ch.qos.logback.core.status.Status p0)`
- `public void close() throws java.io.IOException`
- `public void flush()`
- `public ch.qos.logback.core.Context getContext()`
- `public void postIOFailure(java.io.IOException p0)`
- `public void setContext(ch.qos.logback.core.Context p0)`
- `public void write(byte[] p0, int p1, int p2)`
- `public void write(int p0)`

---

## public class `ch.qos.logback.core.recovery.ResilientSyslogOutputStream`
extends `ch.qos.logback.core.recovery.ResilientOutputStreamBase`  

**Constructors:**
- `public ResilientSyslogOutputStream(java.lang.String p0, int p1) throws java.net.SocketException, java.net.UnknownHostException`

**Methods:**
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.core.rolling.DefaultTimeBasedFileNamingAndTriggeringPolicy`<E extends java.lang.Object>
annotations: @ch.qos.logback.core.joran.spi.NoAutoStart  
extends `ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicyBase`  

**Constructors:**
- `public DefaultTimeBasedFileNamingAndTriggeringPolicy()`

**Methods:**
- `public boolean isTriggeringEvent(java.io.File p0, E p1)`
- `public void start()`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.core.rolling.FixedWindowRollingPolicy`
extends `ch.qos.logback.core.rolling.RollingPolicyBase`  

**Constructors:**
- `public FixedWindowRollingPolicy()`

**Fields:**
- `public final static java.lang.String ZIP_ENTRY_DATE_PATTERN`

**Methods:**
- `public java.lang.String getActiveFileName()`
- `public int getMaxIndex()`
- `protected int getMaxWindowSize()`
- `public int getMinIndex()`
- `public void rollover() throws ch.qos.logback.core.rolling.RolloverFailure`
- `public void setMaxIndex(int p0)`
- `public void setMinIndex(int p0)`
- `public void start()`

---

## public class `ch.qos.logback.core.rolling.RollingFileAppender`<E extends java.lang.Object>
extends `ch.qos.logback.core.FileAppender`  

**Constructors:**
- `public RollingFileAppender()`

**Methods:**
- `public java.lang.String getFile()`
- `public ch.qos.logback.core.rolling.RollingPolicy getRollingPolicy()`
- `public ch.qos.logback.core.rolling.TriggeringPolicy getTriggeringPolicy()`
- `public void rollover()`
- `public void setFile(java.lang.String p0)`
- `public void setRollingPolicy(ch.qos.logback.core.rolling.RollingPolicy p0)`
- `public void setTriggeringPolicy(ch.qos.logback.core.rolling.TriggeringPolicy p0)`
- `public void start()`
- `public void stop()`
- `protected void subAppend(E p0)`

---

## public abstract interface `ch.qos.logback.core.rolling.RollingPolicy`
implements `ch.qos.logback.core.spi.LifeCycle`  

**Methods:**
- `public abstract java.lang.String getActiveFileName()`
- `public abstract ch.qos.logback.core.rolling.helper.CompressionMode getCompressionMode()`
- `public abstract void rollover() throws ch.qos.logback.core.rolling.RolloverFailure`
- `public abstract void setParent(ch.qos.logback.core.FileAppender p0)`

---

## public abstract class `ch.qos.logback.core.rolling.RollingPolicyBase`
extends `ch.qos.logback.core.spi.ContextAwareBase`  
implements `ch.qos.logback.core.rolling.RollingPolicy`  

**Constructors:**
- `public RollingPolicyBase()`

**Fields:**
- `protected ch.qos.logback.core.rolling.helper.CompressionMode compressionMode`
- `protected java.lang.String fileNamePatternStr`

**Methods:**
- `protected void determineCompressionMode()`
- `public ch.qos.logback.core.rolling.helper.CompressionMode getCompressionMode()`
- `public java.lang.String getFileNamePattern()`
- `public java.lang.String getParentsRawFileProperty()`
- `public boolean isParentPrudent()`
- `public boolean isStarted()`
- `public void setFileNamePattern(java.lang.String p0)`
- `public void setParent(ch.qos.logback.core.FileAppender p0)`
- `public void start()`
- `public void stop()`

---

## public class `ch.qos.logback.core.rolling.RolloverFailure`
extends `ch.qos.logback.core.LogbackException`  

**Constructors:**
- `public RolloverFailure(java.lang.String p0)`
- `public RolloverFailure(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `ch.qos.logback.core.rolling.SizeAndTimeBasedFNATP`<E extends java.lang.Object>
annotations: @ch.qos.logback.core.joran.spi.NoAutoStart  
extends `ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicyBase`  

**Constructors:**
- `public SizeAndTimeBasedFNATP()`
- `public SizeAndTimeBasedFNATP(ch.qos.logback.core.rolling.SizeAndTimeBasedFNATP$Usage p0)`

**Methods:**
- `protected ch.qos.logback.core.rolling.helper.ArchiveRemover createArchiveRemover()`
- `public java.lang.String getCurrentPeriodsFileNameWithoutCompressionSuffix()`
- `public boolean isTriggeringEvent(java.io.File p0, E p1)`
- `public void setMaxFileSize(ch.qos.logback.core.util.FileSize p0)`
- `public void start()`

---

## public class `ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy`<E extends java.lang.Object>
extends `ch.qos.logback.core.rolling.TimeBasedRollingPolicy`  

**Constructors:**
- `public SizeAndTimeBasedRollingPolicy()`

**Methods:**
- `public void setMaxFileSize(ch.qos.logback.core.util.FileSize p0)`
- `public void start()`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy`<E extends java.lang.Object>
extends `ch.qos.logback.core.rolling.TriggeringPolicyBase`  

**Constructors:**
- `public SizeBasedTriggeringPolicy()`

**Fields:**
- `public final static long DEFAULT_MAX_FILE_SIZE`
- `public final static java.lang.String SEE_SIZE_FORMAT`

**Methods:**
- `public boolean isTriggeringEvent(java.io.File p0, E p1)`
- `public void setMaxFileSize(ch.qos.logback.core.util.FileSize p0)`

---

## public abstract interface `ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy`<E extends java.lang.Object>
implements `ch.qos.logback.core.rolling.TriggeringPolicy<E>`, `ch.qos.logback.core.spi.ContextAware`  

**Methods:**
- `public abstract ch.qos.logback.core.rolling.helper.ArchiveRemover getArchiveRemover()`
- `public abstract java.lang.String getCurrentPeriodsFileNameWithoutCompressionSuffix()`
- `public abstract long getCurrentTime()`
- `public abstract java.lang.String getElapsedPeriodsFileName()`
- `public abstract void setCurrentTime(long p0)`
- `public abstract void setTimeBasedRollingPolicy(ch.qos.logback.core.rolling.TimeBasedRollingPolicy p0)`

---

## public abstract class `ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicyBase`<E extends java.lang.Object>
extends `ch.qos.logback.core.spi.ContextAwareBase`  
implements `ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy<E>`  

**Constructors:**
- `public TimeBasedFileNamingAndTriggeringPolicyBase()`

**Fields:**
- `protected ch.qos.logback.core.rolling.helper.ArchiveRemover archiveRemover`
- `protected long artificialCurrentTime`
- `protected java.util.Date dateInCurrentPeriod`
- `protected java.lang.String elapsedPeriodsFileName`
- `protected boolean errorFree`
- `protected long nextCheck`
- `protected ch.qos.logback.core.rolling.helper.RollingCalendar rc`
- `protected boolean started`
- `protected ch.qos.logback.core.rolling.TimeBasedRollingPolicy tbrp`

**Methods:**
- `protected void computeNextCheck()`
- `public ch.qos.logback.core.rolling.helper.ArchiveRemover getArchiveRemover()`
- `public java.lang.String getCurrentPeriodsFileNameWithoutCompressionSuffix()`
- `public long getCurrentTime()`
- `public java.lang.String getElapsedPeriodsFileName()`
- `protected boolean isErrorFree()`
- `public boolean isStarted()`
- `public void setCurrentTime(long p0)`
- `public void setDateInCurrentPeriod(java.util.Date p0)`
- `protected void setDateInCurrentPeriod(long p0)`
- `public void setTimeBasedRollingPolicy(ch.qos.logback.core.rolling.TimeBasedRollingPolicy p0)`
- `public void start()`
- `public void stop()`
- `protected void withErrors()`

---

## public class `ch.qos.logback.core.rolling.TimeBasedRollingPolicy`<E extends java.lang.Object>
extends `ch.qos.logback.core.rolling.RollingPolicyBase`  
implements `ch.qos.logback.core.rolling.TriggeringPolicy<E>`  

**Constructors:**
- `public TimeBasedRollingPolicy()`

**Fields:**
- `protected ch.qos.logback.core.util.FileSize totalSizeCap`

**Methods:**
- `public java.lang.String getActiveFileName()`
- `public int getMaxHistory()`
- `public ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy getTimeBasedFileNamingAndTriggeringPolicy()`
- `public boolean isCleanHistoryOnStart()`
- `public boolean isTriggeringEvent(java.io.File p0, E p1)`
- `protected boolean isUnboundedTotalSizeCap()`
- `public void rollover() throws ch.qos.logback.core.rolling.RolloverFailure`
- `public void setCleanHistoryOnStart(boolean p0)`
- `public void setMaxHistory(int p0)`
- `public void setTimeBasedFileNamingAndTriggeringPolicy(ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicy p0)`
- `public void setTotalSizeCap(ch.qos.logback.core.util.FileSize p0)`
- `public void start()`
- `public void stop()`
- `public java.lang.String toString()`

---

## public abstract interface `ch.qos.logback.core.rolling.TriggeringPolicy`<E extends java.lang.Object>
implements `ch.qos.logback.core.spi.LifeCycle`  

**Methods:**
- `public abstract boolean isTriggeringEvent(java.io.File p0, E p1)`

---

## public abstract class `ch.qos.logback.core.rolling.TriggeringPolicyBase`<E extends java.lang.Object>
extends `ch.qos.logback.core.spi.ContextAwareBase`  
implements `ch.qos.logback.core.rolling.TriggeringPolicy<E>`  

**Constructors:**
- `public TriggeringPolicyBase()`

**Methods:**
- `public boolean isStarted()`
- `public void start()`
- `public void stop()`

---

## public abstract interface `ch.qos.logback.core.rolling.helper.ArchiveRemover`
implements `ch.qos.logback.core.spi.ContextAware`  

**Methods:**
- `public abstract void clean(java.util.Date p0)`
- `public abstract java.util.concurrent.Future cleanAsynchronously(java.util.Date p0)`
- `public abstract void setMaxHistory(int p0)`
- `public abstract void setTotalSizeCap(long p0)`

---

## public final enum `ch.qos.logback.core.rolling.helper.CompressionMode`
extends `java.lang.Enum`  

**Fields:**
- `public final static ch.qos.logback.core.rolling.helper.CompressionMode GZ`
- `public final static ch.qos.logback.core.rolling.helper.CompressionMode NONE`
- `public final static ch.qos.logback.core.rolling.helper.CompressionMode ZIP`

---

## public class `ch.qos.logback.core.rolling.helper.Compressor`
extends `ch.qos.logback.core.spi.ContextAwareBase`  

**Constructors:**
- `public Compressor(ch.qos.logback.core.rolling.helper.CompressionMode p0)`

**Methods:**
- `public java.util.concurrent.Future asyncCompress(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws ch.qos.logback.core.rolling.RolloverFailure`
- `public void compress(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public static java.lang.String computeFileNameStrWithoutCompSuffix(java.lang.String p0, ch.qos.logback.core.rolling.helper.CompressionMode p1)`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.core.rolling.helper.DateTokenConverter`<E extends java.lang.Object>
extends `ch.qos.logback.core.pattern.DynamicConverter`  
implements `ch.qos.logback.core.rolling.helper.MonoTypedConverter`  

**Constructors:**
- `public DateTokenConverter()`

**Fields:**
- `public final static java.lang.String AUXILIARY_TOKEN`
- `public final static java.lang.String CONVERTER_KEY`
- `public final static java.lang.String DEFAULT_DATE_PATTERN`

**Methods:**
- `public java.lang.String convert(java.lang.Object p0)`
- `public java.lang.String convert(java.util.Date p0)`
- `public java.lang.String getDatePattern()`
- `public java.util.TimeZone getTimeZone()`
- `public boolean isApplicable(java.lang.Object p0)`
- `public boolean isPrimary()`
- `public void start()`
- `public java.lang.String toRegex()`

---

## public class `ch.qos.logback.core.rolling.helper.FileFilterUtil`

**Constructors:**
- `public FileFilterUtil()`

**Methods:**
- `public static java.lang.String afterLastSlash(java.lang.String p0)`
- `public static int extractCounter(java.io.File p0, java.lang.String p1)`
- `public static java.io.File[] filesInFolderMatchingStemRegex(java.io.File p0, java.lang.String p1)`
- `public static int findHighestCounter(java.io.File[] p0, java.lang.String p1)`
- `public static boolean isEmptyDirectory(java.io.File p0)`
- `public static void removeEmptyParentDirectories(java.io.File p0, int p1)`
- `public static void reverseSortFileArrayByName(java.io.File[] p0)`
- `public static java.lang.String slashify(java.lang.String p0)`
- `public static void sortFileArrayByName(java.io.File[] p0)`

---

## public class `ch.qos.logback.core.rolling.helper.FileNamePattern`
extends `ch.qos.logback.core.spi.ContextAwareBase`  

**Constructors:**
- `public FileNamePattern(java.lang.String p0, ch.qos.logback.core.Context p1)`

**Methods:**
- `public java.lang.String convert(java.lang.Object p0)`
- `public java.lang.String convertInt(int p0)`
- `public java.lang.String convertMultipleArguments(java.lang.Object... p0)`
- `public boolean equals(java.lang.Object p0)`
- `public ch.qos.logback.core.rolling.helper.IntegerTokenConverter getIntegerTokenConverter()`
- `public java.lang.String getPattern()`
- `public ch.qos.logback.core.rolling.helper.DateTokenConverter getPrimaryDateTokenConverter()`
- `public boolean hasIntegerTokenCOnverter()`
- `public int hashCode()`
- `public void setPattern(java.lang.String p0)`
- `public java.lang.String toRegex()`
- `public java.lang.String toRegexForFixedDate(java.util.Date p0)`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.core.rolling.helper.FileStoreUtil`

**Constructors:**
- `public FileStoreUtil()`

**Methods:**
- `public static boolean areOnSameFileStore(java.io.File p0, java.io.File p1) throws ch.qos.logback.core.rolling.RolloverFailure`

---

## public class `ch.qos.logback.core.rolling.helper.IntegerTokenConverter`
extends `ch.qos.logback.core.pattern.DynamicConverter`  
implements `ch.qos.logback.core.rolling.helper.MonoTypedConverter`  

**Constructors:**
- `public IntegerTokenConverter()`

**Fields:**
- `public final static java.lang.String CONVERTER_KEY`

**Methods:**
- `public java.lang.String convert(int p0)`
- `public java.lang.String convert(java.lang.Object p0)`
- `public boolean isApplicable(java.lang.Object p0)`

---

## public abstract interface `ch.qos.logback.core.rolling.helper.MonoTypedConverter`

**Methods:**
- `public abstract boolean isApplicable(java.lang.Object p0)`

---

## public final enum `ch.qos.logback.core.rolling.helper.PeriodicityType`
extends `java.lang.Enum`  

**Fields:**
- `public final static ch.qos.logback.core.rolling.helper.PeriodicityType ERRONEOUS`
- `public final static ch.qos.logback.core.rolling.helper.PeriodicityType HALF_DAY`
- `public final static ch.qos.logback.core.rolling.helper.PeriodicityType TOP_OF_DAY`
- `public final static ch.qos.logback.core.rolling.helper.PeriodicityType TOP_OF_HOUR`
- `public final static ch.qos.logback.core.rolling.helper.PeriodicityType TOP_OF_MILLISECOND`
- `public final static ch.qos.logback.core.rolling.helper.PeriodicityType TOP_OF_MINUTE`
- `public final static ch.qos.logback.core.rolling.helper.PeriodicityType TOP_OF_MONTH`
- `public final static ch.qos.logback.core.rolling.helper.PeriodicityType TOP_OF_SECOND`
- `public final static ch.qos.logback.core.rolling.helper.PeriodicityType TOP_OF_WEEK`

---

## public class `ch.qos.logback.core.rolling.helper.RenameUtil`
extends `ch.qos.logback.core.spi.ContextAwareBase`  

**Constructors:**
- `public RenameUtil()`

**Methods:**
- `public void rename(java.lang.String p0, java.lang.String p1) throws ch.qos.logback.core.rolling.RolloverFailure`
- `public void renameByCopying(java.lang.String p0, java.lang.String p1) throws ch.qos.logback.core.rolling.RolloverFailure`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.core.rolling.helper.RollingCalendar`
extends `java.util.GregorianCalendar`  

**Constructors:**
- `public RollingCalendar(java.lang.String p0)`
- `public RollingCalendar(java.lang.String p0, java.util.TimeZone p1, java.util.Locale p2)`

**Methods:**
- `public ch.qos.logback.core.rolling.helper.PeriodicityType computePeriodicityType()`
- `public static int diffInMonths(long p0, long p1)`
- `public java.util.Date getEndOfNextNthPeriod(java.util.Date p0, int p1)`
- `public java.util.Date getNextTriggeringDate(java.util.Date p0)`
- `public ch.qos.logback.core.rolling.helper.PeriodicityType getPeriodicityType()`
- `public long getStartOfCurrentPeriodWithGMTOffsetCorrection(long p0, java.util.TimeZone p1)`
- `public boolean isCollisionFree()`
- `public long periodBarriersCrossed(long p0, long p1)`
- `public void printPeriodicity(ch.qos.logback.core.spi.ContextAwareBase p0)`

---

## public class `ch.qos.logback.core.rolling.helper.SizeAndTimeBasedArchiveRemover`
extends `ch.qos.logback.core.rolling.helper.TimeBasedArchiveRemover`  

**Constructors:**
- `public SizeAndTimeBasedArchiveRemover(ch.qos.logback.core.rolling.helper.FileNamePattern p0, ch.qos.logback.core.rolling.helper.RollingCalendar p1)`

**Methods:**
- `protected java.io.File[] getFilesInPeriod(java.util.Date p0)`

---

## public class `ch.qos.logback.core.rolling.helper.TimeBasedArchiveRemover`
extends `ch.qos.logback.core.spi.ContextAwareBase`  
implements `ch.qos.logback.core.rolling.helper.ArchiveRemover`  

**Constructors:**
- `public TimeBasedArchiveRemover(ch.qos.logback.core.rolling.helper.FileNamePattern p0, ch.qos.logback.core.rolling.helper.RollingCalendar p1)`

**Fields:**
- `protected final static long INACTIVITY_TOLERANCE_IN_MILLIS`
- `protected final static long UNINITIALIZED`

**Methods:**
- `public void clean(java.util.Date p0)`
- `public java.util.concurrent.Future cleanAsynchronously(java.util.Date p0)`
- `public void cleanPeriod(java.util.Date p0)`
- `protected java.io.File[] getFilesInPeriod(java.util.Date p0)`
- `protected int getPeriodOffsetForDeletionTarget()`
- `public void setMaxHistory(int p0)`
- `public void setTotalSizeCap(long p0)`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.core.rolling.helper.TimeBasedArchiveRemover$ArhiveRemoverRunnable`
implements `java.lang.Runnable`  

**Methods:**
- `public void run()`

---

## public class `ch.qos.logback.core.rolling.helper.TokenConverter`

**Constructors:**
- `protected TokenConverter(int p0)`

**Methods:**
- `public ch.qos.logback.core.rolling.helper.TokenConverter getNext()`
- `public int getType()`
- `public void setNext(ch.qos.logback.core.rolling.helper.TokenConverter p0)`
- `public void setType(int p0)`

---

## public abstract class `ch.qos.logback.core.sift.AbstractAppenderFactoryUsingJoran`<E extends java.lang.Object>
implements `ch.qos.logback.core.sift.AppenderFactory<E>`  

**Constructors:**
- `protected AbstractAppenderFactoryUsingJoran(java.util.List p0, java.lang.String p1, java.util.Map p2)`

**Fields:**
- `protected java.lang.String key`
- `protected java.util.Map parentPropertyMap`

**Methods:**
- `public ch.qos.logback.core.Appender buildAppender(ch.qos.logback.core.Context p0, java.lang.String p1) throws ch.qos.logback.core.joran.spi.JoranException`
- `public java.util.List getEventList()`
- `public abstract ch.qos.logback.core.sift.SiftingJoranConfiguratorBase getSiftingJoranConfigurator(java.lang.String p0)`

---

## public abstract class `ch.qos.logback.core.sift.AbstractDiscriminator`<E extends java.lang.Object>
extends `ch.qos.logback.core.spi.ContextAwareBase`  
implements `ch.qos.logback.core.sift.Discriminator<E>`  

**Constructors:**
- `public AbstractDiscriminator()`

**Fields:**
- `protected boolean started`

**Methods:**
- `public boolean isStarted()`
- `public void start()`
- `public void stop()`

---

## public abstract interface `ch.qos.logback.core.sift.AppenderFactory`<E extends java.lang.Object>

**Methods:**
- `public abstract ch.qos.logback.core.Appender buildAppender(ch.qos.logback.core.Context p0, java.lang.String p1) throws ch.qos.logback.core.joran.spi.JoranException`

---

## public class `ch.qos.logback.core.sift.AppenderTracker`<E extends java.lang.Object>
extends `ch.qos.logback.core.spi.AbstractComponentTracker`  

**Constructors:**
- `public AppenderTracker(ch.qos.logback.core.Context p0, ch.qos.logback.core.sift.AppenderFactory p1)`

**Methods:**
- `protected ch.qos.logback.core.Appender buildComponent(java.lang.String p0)`
- `protected boolean isComponentStale(ch.qos.logback.core.Appender p0)`
- `protected void processPriorToRemoval(ch.qos.logback.core.Appender p0)`

---

## public class `ch.qos.logback.core.sift.DefaultDiscriminator`<E extends java.lang.Object>
extends `ch.qos.logback.core.sift.AbstractDiscriminator`  

**Constructors:**
- `public DefaultDiscriminator()`

**Fields:**
- `public final static java.lang.String DEFAULT`

**Methods:**
- `public java.lang.String getDiscriminatingValue(E p0)`
- `public java.lang.String getKey()`

---

## public abstract interface `ch.qos.logback.core.sift.Discriminator`<E extends java.lang.Object>
implements `ch.qos.logback.core.spi.LifeCycle`  

**Methods:**
- `public abstract java.lang.String getDiscriminatingValue(E p0)`
- `public abstract java.lang.String getKey()`

---

## public abstract class `ch.qos.logback.core.sift.SiftingAppenderBase`<E extends java.lang.Object>
extends `ch.qos.logback.core.AppenderBase`  

**Constructors:**
- `public SiftingAppenderBase()`

**Fields:**
- `protected ch.qos.logback.core.sift.AppenderTracker appenderTracker`

**Methods:**
- `protected void append(E p0)`
- `protected abstract boolean eventMarksEndOfLife(E p0)`
- `public ch.qos.logback.core.sift.AppenderTracker getAppenderTracker()`
- `public ch.qos.logback.core.sift.Discriminator getDiscriminator()`
- `public java.lang.String getDiscriminatorKey()`
- `public int getMaxAppenderCount()`
- `public ch.qos.logback.core.util.Duration getTimeout()`
- `protected abstract long getTimestamp(E p0)`
- `public void setAppenderFactory(ch.qos.logback.core.sift.AppenderFactory p0)`
- `public void setDiscriminator(ch.qos.logback.core.sift.Discriminator p0)`
- `public void setMaxAppenderCount(int p0)`
- `public void setTimeout(ch.qos.logback.core.util.Duration p0)`
- `public void start()`
- `public void stop()`

---

## public abstract class `ch.qos.logback.core.sift.SiftingJoranConfiguratorBase`<E extends java.lang.Object>
extends `ch.qos.logback.core.joran.GenericConfigurator`  

**Constructors:**
- `protected SiftingJoranConfiguratorBase(java.lang.String p0, java.lang.String p1, java.util.Map p2)`

**Fields:**
- `protected final java.lang.String key`
- `protected final java.util.Map parentPropertyMap`
- `protected final java.lang.String value`

**Methods:**
- `protected void addImplicitRules(ch.qos.logback.core.joran.spi.Interpreter p0)`
- `protected void addInstanceRules(ch.qos.logback.core.joran.spi.RuleStore p0)`
- `public void doConfigure(java.util.List p0) throws ch.qos.logback.core.joran.spi.JoranException`
- `public abstract ch.qos.logback.core.Appender getAppender()`
- `protected void oneAndOnlyOneCheck(java.util.Map p0)`
- `public java.lang.String toString()`

---

## public abstract class `ch.qos.logback.core.spi.AbstractComponentTracker`<C extends java.lang.Object>
implements `ch.qos.logback.core.spi.ComponentTracker<C>`  

**Constructors:**
- `public AbstractComponentTracker()`

**Fields:**
- `public final static long LINGERING_TIMEOUT`
- `public final static long WAIT_BETWEEN_SUCCESSIVE_REMOVAL_ITERATIONS`
- `protected int maxComponents`
- `protected long timeout`

**Methods:**
- `public java.util.Collection allComponents()`
- `public java.util.Set allKeys()`
- `protected abstract C buildComponent(java.lang.String p0)`
- `public void endOfLife(java.lang.String p0)`
- `public synchronized C find(java.lang.String p0)`
- `public int getComponentCount()`
- `public int getMaxComponents()`
- `public synchronized C getOrCreate(java.lang.String p0, long p1)`
- `public long getTimeout()`
- `protected abstract boolean isComponentStale(C p0)`
- `protected abstract void processPriorToRemoval(C p0)`
- `public synchronized void removeStaleComponents(long p0)`
- `public void setMaxComponents(int p0)`
- `public void setTimeout(long p0)`

---

## public abstract interface `ch.qos.logback.core.spi.AppenderAttachable`<E extends java.lang.Object>

**Methods:**
- `public abstract void addAppender(ch.qos.logback.core.Appender p0)`
- `public abstract void detachAndStopAllAppenders()`
- `public abstract boolean detachAppender(ch.qos.logback.core.Appender p0)`
- `public abstract boolean detachAppender(java.lang.String p0)`
- `public abstract ch.qos.logback.core.Appender getAppender(java.lang.String p0)`
- `public abstract boolean isAttached(ch.qos.logback.core.Appender p0)`
- `public abstract java.util.Iterator iteratorForAppenders()`

---

## public class `ch.qos.logback.core.spi.AppenderAttachableImpl`<E extends java.lang.Object>
implements `ch.qos.logback.core.spi.AppenderAttachable<E>`  

**Constructors:**
- `public AppenderAttachableImpl()`

**Methods:**
- `public void addAppender(ch.qos.logback.core.Appender p0)`
- `public int appendLoopOnAppenders(E p0)`
- `public void detachAndStopAllAppenders()`
- `public boolean detachAppender(ch.qos.logback.core.Appender p0)`
- `public boolean detachAppender(java.lang.String p0)`
- `public ch.qos.logback.core.Appender getAppender(java.lang.String p0)`
- `public boolean isAttached(ch.qos.logback.core.Appender p0)`
- `public java.util.Iterator iteratorForAppenders()`

---

## public abstract interface `ch.qos.logback.core.spi.ComponentTracker`<C extends java.lang.Object>

**Fields:**
- `public final static int DEFAULT_MAX_COMPONENTS`
- `public final static int DEFAULT_TIMEOUT`

**Methods:**
- `public abstract java.util.Collection allComponents()`
- `public abstract java.util.Set allKeys()`
- `public abstract void endOfLife(java.lang.String p0)`
- `public abstract C find(java.lang.String p0)`
- `public abstract int getComponentCount()`
- `public abstract C getOrCreate(java.lang.String p0, long p1)`
- `public abstract void removeStaleComponents(long p0)`

---

## public abstract interface `ch.qos.logback.core.spi.ContextAware`

**Methods:**
- `public abstract void addError(java.lang.String p0)`
- `public abstract void addError(java.lang.String p0, java.lang.Throwable p1)`
- `public abstract void addInfo(java.lang.String p0)`
- `public abstract void addInfo(java.lang.String p0, java.lang.Throwable p1)`
- `public abstract void addStatus(ch.qos.logback.core.status.Status p0)`
- `public abstract void addWarn(java.lang.String p0)`
- `public abstract void addWarn(java.lang.String p0, java.lang.Throwable p1)`
- `public abstract ch.qos.logback.core.Context getContext()`
- `public abstract void setContext(ch.qos.logback.core.Context p0)`

---

## public class `ch.qos.logback.core.spi.ContextAwareBase`
implements `ch.qos.logback.core.spi.ContextAware`  

**Constructors:**
- `public ContextAwareBase()`
- `public ContextAwareBase(ch.qos.logback.core.spi.ContextAware p0)`

**Fields:**
- `protected ch.qos.logback.core.Context context`

**Methods:**
- `public void addError(java.lang.String p0)`
- `public void addError(java.lang.String p0, java.lang.Throwable p1)`
- `public void addInfo(java.lang.String p0)`
- `public void addInfo(java.lang.String p0, java.lang.Throwable p1)`
- `public void addStatus(ch.qos.logback.core.status.Status p0)`
- `public void addWarn(java.lang.String p0)`
- `public void addWarn(java.lang.String p0, java.lang.Throwable p1)`
- `public ch.qos.logback.core.Context getContext()`
- `protected java.lang.Object getDeclaredOrigin()`
- `public ch.qos.logback.core.status.StatusManager getStatusManager()`
- `public void setContext(ch.qos.logback.core.Context p0)`

---

## public class `ch.qos.logback.core.spi.ContextAwareImpl`
implements `ch.qos.logback.core.spi.ContextAware`  

**Constructors:**
- `public ContextAwareImpl(ch.qos.logback.core.Context p0, java.lang.Object p1)`

**Fields:**
- `protected ch.qos.logback.core.Context context`

**Methods:**
- `public void addError(java.lang.String p0)`
- `public void addError(java.lang.String p0, java.lang.Throwable p1)`
- `public void addInfo(java.lang.String p0)`
- `public void addInfo(java.lang.String p0, java.lang.Throwable p1)`
- `public void addStatus(ch.qos.logback.core.status.Status p0)`
- `public void addWarn(java.lang.String p0)`
- `public void addWarn(java.lang.String p0, java.lang.Throwable p1)`
- `public ch.qos.logback.core.Context getContext()`
- `protected java.lang.Object getOrigin()`
- `public ch.qos.logback.core.status.StatusManager getStatusManager()`
- `public void setContext(ch.qos.logback.core.Context p0)`

---

## public class `ch.qos.logback.core.spi.CyclicBufferTracker`<E extends java.lang.Object>
extends `ch.qos.logback.core.spi.AbstractComponentTracker`  

**Constructors:**
- `public CyclicBufferTracker()`

**Methods:**
- `protected ch.qos.logback.core.helpers.CyclicBuffer buildComponent(java.lang.String p0)`
- `public int getBufferSize()`
- `protected boolean isComponentStale(ch.qos.logback.core.helpers.CyclicBuffer p0)`
- `protected void processPriorToRemoval(ch.qos.logback.core.helpers.CyclicBuffer p0)`
- `public void setBufferSize(int p0)`

---

## public abstract interface `ch.qos.logback.core.spi.DeferredProcessingAware`

**Methods:**
- `public abstract void prepareForDeferredProcessing()`

---

## public abstract interface `ch.qos.logback.core.spi.FilterAttachable`<E extends java.lang.Object>

**Methods:**
- `public abstract void addFilter(ch.qos.logback.core.filter.Filter p0)`
- `public abstract void clearAllFilters()`
- `public abstract java.util.List getCopyOfAttachedFiltersList()`
- `public abstract ch.qos.logback.core.spi.FilterReply getFilterChainDecision(E p0)`

---

## public final class `ch.qos.logback.core.spi.FilterAttachableImpl`<E extends java.lang.Object>
implements `ch.qos.logback.core.spi.FilterAttachable<E>`  

**Constructors:**
- `public FilterAttachableImpl()`

**Methods:**
- `public void addFilter(ch.qos.logback.core.filter.Filter p0)`
- `public void clearAllFilters()`
- `public java.util.List getCopyOfAttachedFiltersList()`
- `public ch.qos.logback.core.spi.FilterReply getFilterChainDecision(E p0)`

---

## public final enum `ch.qos.logback.core.spi.FilterReply`
extends `java.lang.Enum`  

**Fields:**
- `public final static ch.qos.logback.core.spi.FilterReply ACCEPT`
- `public final static ch.qos.logback.core.spi.FilterReply DENY`
- `public final static ch.qos.logback.core.spi.FilterReply NEUTRAL`

---

## public abstract interface `ch.qos.logback.core.spi.LifeCycle`

**Methods:**
- `public abstract boolean isStarted()`
- `public abstract void start()`
- `public abstract void stop()`

---

## public class `ch.qos.logback.core.spi.LogbackLock`

**Constructors:**
- `public LogbackLock()`

---

## public abstract interface `ch.qos.logback.core.spi.PreSerializationTransformer`<E extends java.lang.Object>

**Methods:**
- `public abstract java.io.Serializable transform(E p0)`

---

## public abstract interface `ch.qos.logback.core.spi.PropertyContainer`

**Methods:**
- `public abstract java.util.Map getCopyOfPropertyMap()`
- `public abstract java.lang.String getProperty(java.lang.String p0)`

---

## public abstract interface `ch.qos.logback.core.spi.PropertyDefiner`
implements `ch.qos.logback.core.spi.ContextAware`  

**Methods:**
- `public abstract java.lang.String getPropertyValue()`

---

## public class `ch.qos.logback.core.spi.ScanException`
extends `java.lang.Exception`  

**Constructors:**
- `public ScanException(java.lang.String p0)`
- `public ScanException(java.lang.String p0, java.lang.Throwable p1)`

**Methods:**
- `public java.lang.Throwable getCause()`

---

## public class `ch.qos.logback.core.status.ErrorStatus`
extends `ch.qos.logback.core.status.StatusBase`  

**Constructors:**
- `public ErrorStatus(java.lang.String p0, java.lang.Object p1)`
- `public ErrorStatus(java.lang.String p0, java.lang.Object p1, java.lang.Throwable p2)`

---

## public class `ch.qos.logback.core.status.InfoStatus`
extends `ch.qos.logback.core.status.StatusBase`  

**Constructors:**
- `public InfoStatus(java.lang.String p0, java.lang.Object p1)`
- `public InfoStatus(java.lang.String p0, java.lang.Object p1, java.lang.Throwable p2)`

---

## public class `ch.qos.logback.core.status.NopStatusListener`
implements `ch.qos.logback.core.status.StatusListener`  

**Constructors:**
- `public NopStatusListener()`

**Methods:**
- `public void addStatusEvent(ch.qos.logback.core.status.Status p0)`

---

## public class `ch.qos.logback.core.status.OnConsoleStatusListener`
extends `ch.qos.logback.core.status.OnPrintStreamStatusListenerBase`  

**Constructors:**
- `public OnConsoleStatusListener()`

**Methods:**
- `protected java.io.PrintStream getPrintStream()`

---

## public class `ch.qos.logback.core.status.OnErrorConsoleStatusListener`
extends `ch.qos.logback.core.status.OnPrintStreamStatusListenerBase`  

**Constructors:**
- `public OnErrorConsoleStatusListener()`

**Methods:**
- `protected java.io.PrintStream getPrintStream()`

---

## public abstract class `ch.qos.logback.core.status.OnPrintStreamStatusListenerBase`
extends `ch.qos.logback.core.spi.ContextAwareBase`  
implements `ch.qos.logback.core.spi.LifeCycle`, `ch.qos.logback.core.status.StatusListener`  

**Constructors:**
- `public OnPrintStreamStatusListenerBase()`

**Methods:**
- `public void addStatusEvent(ch.qos.logback.core.status.Status p0)`
- `public java.lang.String getPrefix()`
- `protected abstract java.io.PrintStream getPrintStream()`
- `public long getRetrospective()`
- `public boolean isStarted()`
- `public void setPrefix(java.lang.String p0)`
- `public void setRetrospective(long p0)`
- `public void start()`
- `public void stop()`

---

## public abstract interface `ch.qos.logback.core.status.Status`

**Fields:**
- `public final static int ERROR`
- `public final static int INFO`
- `public final static int WARN`

**Methods:**
- `public abstract void add(ch.qos.logback.core.status.Status p0)`
- `public abstract java.lang.Long getDate()`
- `public abstract int getEffectiveLevel()`
- `public abstract int getLevel()`
- `public abstract java.lang.String getMessage()`
- `public abstract java.lang.Object getOrigin()`
- `public abstract java.lang.Throwable getThrowable()`
- `public abstract boolean hasChildren()`
- `public abstract java.util.Iterator iterator()`
- `public abstract boolean remove(ch.qos.logback.core.status.Status p0)`

---

## public abstract class `ch.qos.logback.core.status.StatusBase`
implements `ch.qos.logback.core.status.Status`  

**Methods:**
- `public synchronized void add(ch.qos.logback.core.status.Status p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.Long getDate()`
- `public synchronized int getEffectiveLevel()`
- `public int getLevel()`
- `public java.lang.String getMessage()`
- `public java.lang.Object getOrigin()`
- `public java.lang.Throwable getThrowable()`
- `public synchronized boolean hasChildren()`
- `public int hashCode()`
- `public synchronized java.util.Iterator iterator()`
- `public synchronized boolean remove(ch.qos.logback.core.status.Status p0)`
- `public java.lang.String toString()`

---

## public abstract interface `ch.qos.logback.core.status.StatusListener`

**Methods:**
- `public abstract void addStatusEvent(ch.qos.logback.core.status.Status p0)`

---

## public class `ch.qos.logback.core.status.StatusListenerAsList`
implements `ch.qos.logback.core.status.StatusListener`  

**Constructors:**
- `public StatusListenerAsList()`

**Methods:**
- `public void addStatusEvent(ch.qos.logback.core.status.Status p0)`
- `public java.util.List getStatusList()`

---

## public abstract interface `ch.qos.logback.core.status.StatusManager`

**Methods:**
- `public abstract void add(ch.qos.logback.core.status.Status p0)`
- `public abstract boolean add(ch.qos.logback.core.status.StatusListener p0)`
- `public abstract void clear()`
- `public abstract java.util.List getCopyOfStatusList()`
- `public abstract java.util.List getCopyOfStatusListenerList()`
- `public abstract int getCount()`
- `public abstract void remove(ch.qos.logback.core.status.StatusListener p0)`

---

## public class `ch.qos.logback.core.status.StatusUtil`

**Constructors:**
- `public StatusUtil(ch.qos.logback.core.Context p0)`
- `public StatusUtil(ch.qos.logback.core.status.StatusManager p0)`

**Methods:**
- `public void addError(java.lang.Object p0, java.lang.String p1, java.lang.Throwable p2)`
- `public void addInfo(java.lang.Object p0, java.lang.String p1)`
- `public void addStatus(ch.qos.logback.core.status.Status p0)`
- `public void addWarn(java.lang.Object p0, java.lang.String p1)`
- `public boolean containsException(java.lang.Class p0)`
- `public boolean containsMatch(int p0, java.lang.String p1)`
- `public boolean containsMatch(java.lang.String p0)`
- `public boolean containsMatch(long p0, int p1, java.lang.String p2)`
- `public static boolean contextHasStatusListener(ch.qos.logback.core.Context p0)`
- `public static java.util.List filterStatusListByTimeThreshold(java.util.List p0, long p1)`
- `public int getHighestLevel(long p0)`
- `public boolean hasXMLParsingErrors(long p0)`
- `public boolean isErrorFree(long p0)`
- `public boolean isWarningOrErrorFree(long p0)`
- `public int matchCount(java.lang.String p0)`
- `public boolean noXMLParsingErrorsOccurred(long p0)`
- `public long timeOfLastReset()`

---

## public abstract class `ch.qos.logback.core.status.ViewStatusMessagesServletBase`
extends `javax.servlet.http.HttpServlet`  

**Constructors:**
- `public ViewStatusMessagesServletBase()`

**Methods:**
- `protected abstract java.lang.String getPageTitle(javax.servlet.http.HttpServletRequest p0, javax.servlet.http.HttpServletResponse p1)`
- `protected abstract ch.qos.logback.core.status.StatusManager getStatusManager(javax.servlet.http.HttpServletRequest p0, javax.servlet.http.HttpServletResponse p1)`
- `public void printCSS(java.lang.String p0, java.io.PrintWriter p1)`
- `public void printHeader(java.lang.StringBuilder p0)`
- `public void printList(java.lang.StringBuilder p0, ch.qos.logback.core.status.StatusManager p1)`
- `protected void service(javax.servlet.http.HttpServletRequest p0, javax.servlet.http.HttpServletResponse p1) throws java.io.IOException, javax.servlet.ServletException`

---

## public class `ch.qos.logback.core.status.WarnStatus`
extends `ch.qos.logback.core.status.StatusBase`  

**Constructors:**
- `public WarnStatus(java.lang.String p0, java.lang.Object p1)`
- `public WarnStatus(java.lang.String p0, java.lang.Object p1, java.lang.Throwable p2)`

---

## public class `ch.qos.logback.core.subst.Node`

**Constructors:**
- `public Node(ch.qos.logback.core.subst.Node$Type p0, java.lang.Object p1)`
- `public Node(ch.qos.logback.core.subst.Node$Type p0, java.lang.Object p1, java.lang.Object p2)`

**Methods:**
- `public void dump()`
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public void setNext(ch.qos.logback.core.subst.Node p0)`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.core.subst.NodeToStringTransformer`

**Constructors:**
- `public NodeToStringTransformer(ch.qos.logback.core.subst.Node p0, ch.qos.logback.core.spi.PropertyContainer p1)`
- `public NodeToStringTransformer(ch.qos.logback.core.subst.Node p0, ch.qos.logback.core.spi.PropertyContainer p1, ch.qos.logback.core.spi.PropertyContainer p2)`

**Methods:**
- `public static java.lang.String substituteVariable(java.lang.String p0, ch.qos.logback.core.spi.PropertyContainer p1, ch.qos.logback.core.spi.PropertyContainer p2) throws ch.qos.logback.core.spi.ScanException`
- `public java.lang.String transform() throws ch.qos.logback.core.spi.ScanException`

---

## public class `ch.qos.logback.core.subst.Parser`

**Constructors:**
- `public Parser(java.util.List p0)`

**Methods:**
- `public ch.qos.logback.core.subst.Node parse() throws ch.qos.logback.core.spi.ScanException`

---

## public class `ch.qos.logback.core.subst.Token`

**Constructors:**
- `public Token(ch.qos.logback.core.subst.Token$Type p0, java.lang.String p1)`

**Fields:**
- `public final static ch.qos.logback.core.subst.Token CURLY_LEFT_TOKEN`
- `public final static ch.qos.logback.core.subst.Token CURLY_RIGHT_TOKEN`
- `public final static ch.qos.logback.core.subst.Token DEFAULT_SEP_TOKEN`
- `public final static ch.qos.logback.core.subst.Token START_TOKEN`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public final static enum `ch.qos.logback.core.subst.Token$Type`
extends `java.lang.Enum`  

**Fields:**
- `public final static ch.qos.logback.core.subst.Token$Type CURLY_LEFT`
- `public final static ch.qos.logback.core.subst.Token$Type CURLY_RIGHT`
- `public final static ch.qos.logback.core.subst.Token$Type DEFAULT`
- `public final static ch.qos.logback.core.subst.Token$Type LITERAL`
- `public final static ch.qos.logback.core.subst.Token$Type START`

---

## public class `ch.qos.logback.core.subst.Tokenizer`

**Constructors:**
- `public Tokenizer(java.lang.String p0)`

---

## public final enum `ch.qos.logback.core.util.AggregationType`
extends `java.lang.Enum`  

**Fields:**
- `public final static ch.qos.logback.core.util.AggregationType AS_BASIC_PROPERTY`
- `public final static ch.qos.logback.core.util.AggregationType AS_BASIC_PROPERTY_COLLECTION`
- `public final static ch.qos.logback.core.util.AggregationType AS_COMPLEX_PROPERTY`
- `public final static ch.qos.logback.core.util.AggregationType AS_COMPLEX_PROPERTY_COLLECTION`
- `public final static ch.qos.logback.core.util.AggregationType NOT_FOUND`

---

## public class `ch.qos.logback.core.util.COWArrayList`<E extends java.lang.Object>
implements `java.util.List<E>`  

**Constructors:**
- `public COWArrayList(E[] p0)`

**Methods:**
- `public boolean add(E p0)`
- `public void add(int p0, E p1)`
- `public boolean addAll(int p0, java.util.Collection p1)`
- `public boolean addAll(java.util.Collection p0)`
- `public void addIfAbsent(E p0)`
- `public E[] asTypedArray()`
- `public void clear()`
- `public boolean contains(java.lang.Object p0)`
- `public boolean containsAll(java.util.Collection p0)`
- `public E get(int p0)`
- `public int indexOf(java.lang.Object p0)`
- `public boolean isEmpty()`
- `public java.util.Iterator iterator()`
- `public int lastIndexOf(java.lang.Object p0)`
- `public java.util.ListIterator listIterator()`
- `public java.util.ListIterator listIterator(int p0)`
- `public E remove(int p0)`
- `public boolean remove(java.lang.Object p0)`
- `public boolean removeAll(java.util.Collection p0)`
- `public boolean retainAll(java.util.Collection p0)`
- `public E set(int p0, E p1)`
- `public int size()`
- `public java.util.List subList(int p0, int p1)`
- `public java.lang.Object[] toArray()`
- `public <T extends java.lang.Object> T[] toArray(T[] p0)`

---

## public class `ch.qos.logback.core.util.CachingDateFormatter`

**Constructors:**
- `public CachingDateFormatter(java.lang.String p0)`

**Methods:**
- `public final java.lang.String format(long p0)`
- `public void setTimeZone(java.util.TimeZone p0)`

---

## public class `ch.qos.logback.core.util.CloseUtil`

**Constructors:**
- `public CloseUtil()`

**Methods:**
- `public static void closeQuietly(java.io.Closeable p0)`
- `public static void closeQuietly(java.net.ServerSocket p0)`
- `public static void closeQuietly(java.net.Socket p0)`

---

## public class `ch.qos.logback.core.util.ContentTypeUtil`

**Constructors:**
- `public ContentTypeUtil()`

**Methods:**
- `public static java.lang.String getSubType(java.lang.String p0)`
- `public static boolean isTextual(java.lang.String p0)`

---

## public class `ch.qos.logback.core.util.ContextUtil`
extends `ch.qos.logback.core.spi.ContextAwareBase`  

**Constructors:**
- `public ContextUtil(ch.qos.logback.core.Context p0)`

**Methods:**
- `public void addFrameworkPackage(java.util.List p0, java.lang.String p1)`
- `public void addGroovyPackages(java.util.List p0)`
- `public void addProperties(java.util.Properties p0)`
- `public static java.util.Map getFilenameCollisionMap(ch.qos.logback.core.Context p0)`
- `public static java.util.Map getFilenamePatternCollisionMap(ch.qos.logback.core.Context p0)`
- `public static java.lang.String getLocalHostName() throws java.net.SocketException, java.net.UnknownHostException`
- `public java.lang.String safelyGetLocalHostName()`

---

## public class `ch.qos.logback.core.util.DatePatternToRegexUtil`

**Constructors:**
- `public DatePatternToRegexUtil(java.lang.String p0)`

**Methods:**
- `public java.lang.String toRegex()`

---

## public class `ch.qos.logback.core.util.DefaultInvocationGate`
implements `ch.qos.logback.core.util.InvocationGate`  

**Constructors:**
- `public DefaultInvocationGate()`
- `public DefaultInvocationGate(long p0, long p1, long p2)`

**Methods:**
- `public long getInvocationCounter()`
- `public final boolean isTooSoon(long p0)`

---

## public abstract interface `ch.qos.logback.core.util.DelayStrategy`

**Methods:**
- `public abstract long nextDelay()`

---

## public class `ch.qos.logback.core.util.Duration`

**Constructors:**
- `public Duration(long p0)`

**Methods:**
- `public static ch.qos.logback.core.util.Duration buildByDays(double p0)`
- `public static ch.qos.logback.core.util.Duration buildByHours(double p0)`
- `public static ch.qos.logback.core.util.Duration buildByMilliseconds(double p0)`
- `public static ch.qos.logback.core.util.Duration buildByMinutes(double p0)`
- `public static ch.qos.logback.core.util.Duration buildBySeconds(double p0)`
- `public static ch.qos.logback.core.util.Duration buildUnbounded()`
- `public long getMilliseconds()`
- `public java.lang.String toString()`
- `public static ch.qos.logback.core.util.Duration valueOf(java.lang.String p0)`

---

## public class `ch.qos.logback.core.util.DynamicClassLoadingException`
extends `java.lang.Exception`  

**Constructors:**
- `public DynamicClassLoadingException(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `ch.qos.logback.core.util.EnvUtil`

**Constructors:**
- `public EnvUtil()`

**Methods:**
- `public static boolean isJDK5()`
- `public static boolean isJDK6OrHigher()`
- `public static boolean isJDK7OrHigher()`
- `public static boolean isJaninoAvailable()`
- `public static boolean isWindows()`

---

## public class `ch.qos.logback.core.util.ExecutorServiceUtil`

**Constructors:**
- `public ExecutorServiceUtil()`

**Methods:**
- `public static java.util.concurrent.ExecutorService newExecutorService()`
- `public static java.util.concurrent.ScheduledExecutorService newScheduledExecutorService()`
- `public static void shutdown(java.util.concurrent.ExecutorService p0)`

---

## public class `ch.qos.logback.core.util.FileSize`

**Constructors:**
- `public FileSize(long p0)`

**Fields:**
- `public final static long GB_COEFFICIENT`
- `public final static long KB_COEFFICIENT`
- `public final static long MB_COEFFICIENT`

**Methods:**
- `public long getSize()`
- `public java.lang.String toString()`
- `public static ch.qos.logback.core.util.FileSize valueOf(java.lang.String p0)`

---

## public class `ch.qos.logback.core.util.FileUtil`
extends `ch.qos.logback.core.spi.ContextAwareBase`  

**Constructors:**
- `public FileUtil(ch.qos.logback.core.Context p0)`

**Methods:**
- `public void copy(java.lang.String p0, java.lang.String p1) throws ch.qos.logback.core.rolling.RolloverFailure`
- `public static boolean createMissingParentDirectories(java.io.File p0)`
- `public static java.net.URL fileToURL(java.io.File p0)`
- `public java.lang.String resourceAsString(java.lang.ClassLoader p0, java.lang.String p1)`

---

## public class `ch.qos.logback.core.util.FixedDelay`
implements `ch.qos.logback.core.util.DelayStrategy`  

**Constructors:**
- `public FixedDelay(int p0)`
- `public FixedDelay(long p0, long p1)`

**Methods:**
- `public long nextDelay()`

---

## public class `ch.qos.logback.core.util.IncompatibleClassException`
extends `java.lang.Exception`  

---

## public class `ch.qos.logback.core.util.InterruptUtil`
extends `ch.qos.logback.core.spi.ContextAwareBase`  

**Constructors:**
- `public InterruptUtil(ch.qos.logback.core.Context p0)`

**Methods:**
- `public void maskInterruptFlag()`
- `public void unmaskInterruptFlag()`

---

## public abstract interface `ch.qos.logback.core.util.InvocationGate`

**Fields:**
- `public final static long TIME_UNAVAILABLE`

**Methods:**
- `public abstract boolean isTooSoon(long p0)`

---

## public class `ch.qos.logback.core.util.JNDIUtil`

**Constructors:**
- `public JNDIUtil()`

**Methods:**
- `public static javax.naming.Context getInitialContext() throws javax.naming.NamingException`
- `public static java.lang.String lookup(javax.naming.Context p0, java.lang.String p1) throws javax.naming.NamingException`

---

## public class `ch.qos.logback.core.util.Loader`

**Constructors:**
- `public Loader()`

**Fields:**
- `public final static java.lang.String IGNORE_TCL_PROPERTY_NAME`

**Methods:**
- `public static java.lang.ClassLoader getClassLoaderAsPrivileged(java.lang.Class p0)`
- `public static java.lang.ClassLoader getClassLoaderOfClass(java.lang.Class p0)`
- `public static java.lang.ClassLoader getClassLoaderOfObject(java.lang.Object p0)`
- `public static java.net.URL getResource(java.lang.String p0, java.lang.ClassLoader p1)`
- `public static java.net.URL getResourceBySelfClassLoader(java.lang.String p0)`
- `public static java.util.Set getResources(java.lang.String p0, java.lang.ClassLoader p1) throws java.io.IOException`
- `public static java.lang.ClassLoader getTCL()`
- `public static java.lang.Class loadClass(java.lang.String p0) throws java.lang.ClassNotFoundException`
- `public static java.lang.Class loadClass(java.lang.String p0, ch.qos.logback.core.Context p1) throws java.lang.ClassNotFoundException`

---

## public class `ch.qos.logback.core.util.LocationUtil`

**Constructors:**
- `public LocationUtil()`

**Fields:**
- `public final static java.lang.String CLASSPATH_SCHEME`
- `public final static java.lang.String SCHEME_PATTERN`

**Methods:**
- `public static java.net.URL urlForResource(java.lang.String p0) throws java.io.FileNotFoundException, java.net.MalformedURLException`

---

## public class `ch.qos.logback.core.util.OptionHelper`

**Constructors:**
- `public OptionHelper()`

**Methods:**
- `public static java.lang.String[] extractDefaultReplacement(java.lang.String p0)`
- `public static java.lang.String getEnv(java.lang.String p0)`
- `public static java.util.Properties getSystemProperties()`
- `public static java.lang.String getSystemProperty(java.lang.String p0)`
- `public static java.lang.String getSystemProperty(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.Object instantiateByClassName(java.lang.String p0, java.lang.Class p1, ch.qos.logback.core.Context p2) throws ch.qos.logback.core.util.DynamicClassLoadingException, ch.qos.logback.core.util.IncompatibleClassException`
- `public static java.lang.Object instantiateByClassName(java.lang.String p0, java.lang.Class p1, java.lang.ClassLoader p2) throws ch.qos.logback.core.util.DynamicClassLoadingException, ch.qos.logback.core.util.IncompatibleClassException`
- `public static java.lang.Object instantiateByClassNameAndParameter(java.lang.String p0, java.lang.Class p1, ch.qos.logback.core.Context p2, java.lang.Class p3, java.lang.Object p4) throws ch.qos.logback.core.util.DynamicClassLoadingException, ch.qos.logback.core.util.IncompatibleClassException`
- `public static java.lang.Object instantiateByClassNameAndParameter(java.lang.String p0, java.lang.Class p1, java.lang.ClassLoader p2, java.lang.Class p3, java.lang.Object p4) throws ch.qos.logback.core.util.DynamicClassLoadingException, ch.qos.logback.core.util.IncompatibleClassException`
- `public static boolean isEmpty(java.lang.String p0)`
- `public static java.lang.String propertyLookup(java.lang.String p0, ch.qos.logback.core.spi.PropertyContainer p1, ch.qos.logback.core.spi.PropertyContainer p2)`
- `public static void setSystemProperties(ch.qos.logback.core.spi.ContextAware p0, java.util.Properties p1)`
- `public static void setSystemProperty(ch.qos.logback.core.spi.ContextAware p0, java.lang.String p1, java.lang.String p2)`
- `public static java.lang.String substVars(java.lang.String p0, ch.qos.logback.core.spi.PropertyContainer p1)`
- `public static java.lang.String substVars(java.lang.String p0, ch.qos.logback.core.spi.PropertyContainer p1, ch.qos.logback.core.spi.PropertyContainer p2)`
- `public static boolean toBoolean(java.lang.String p0, boolean p1)`

---

## public class `ch.qos.logback.core.util.PropertySetterException`
extends `java.lang.Exception`  

**Constructors:**
- `public PropertySetterException(java.lang.String p0)`
- `public PropertySetterException(java.lang.String p0, java.lang.Throwable p1)`
- `public PropertySetterException(java.lang.Throwable p0)`

---

## public class `ch.qos.logback.core.util.StatusListenerConfigHelper`

**Constructors:**
- `public StatusListenerConfigHelper()`

**Methods:**
- `public static void addOnConsoleListenerInstance(ch.qos.logback.core.Context p0, ch.qos.logback.core.status.OnConsoleStatusListener p1)`
- `public static void installIfAsked(ch.qos.logback.core.Context p0)`

---

## public class `ch.qos.logback.core.util.StatusPrinter`

**Constructors:**
- `public StatusPrinter()`

**Methods:**
- `public static void buildStr(java.lang.StringBuilder p0, java.lang.String p1, ch.qos.logback.core.status.Status p2)`
- `public static void print(ch.qos.logback.core.Context p0)`
- `public static void print(ch.qos.logback.core.Context p0, long p1)`
- `public static void print(ch.qos.logback.core.status.StatusManager p0)`
- `public static void print(ch.qos.logback.core.status.StatusManager p0, long p1)`
- `public static void print(java.util.List p0)`
- `public static void printIfErrorsOccured(ch.qos.logback.core.Context p0)`
- `public static void printInCaseOfErrorsOrWarnings(ch.qos.logback.core.Context p0)`
- `public static void printInCaseOfErrorsOrWarnings(ch.qos.logback.core.Context p0, long p1)`
- `public static void setPrintStream(java.io.PrintStream p0)`

---

## public class `ch.qos.logback.core.util.StringCollectionUtil`

**Constructors:**
- `public StringCollectionUtil()`

**Methods:**
- `public static void removeMatching(java.util.Collection p0, java.lang.String... p1)`
- `public static void removeMatching(java.util.Collection p0, java.util.Collection p1)`
- `public static void retainMatching(java.util.Collection p0, java.lang.String... p1)`
- `public static void retainMatching(java.util.Collection p0, java.util.Collection p1)`

---

## public class `ch.qos.logback.core.util.SystemInfo`

**Constructors:**
- `public SystemInfo()`

**Methods:**
- `public static java.lang.String getJavaVendor()`

---

## public class `ch.qos.logback.core.util.TimeUtil`

**Constructors:**
- `public TimeUtil()`

**Methods:**
- `public static long computeStartOfNextDay(long p0)`
- `public static long computeStartOfNextHour(long p0)`
- `public static long computeStartOfNextMinute(long p0)`
- `public static long computeStartOfNextMonth(long p0)`
- `public static long computeStartOfNextSecond(long p0)`
- `public static long computeStartOfNextWeek(long p0)`

---

