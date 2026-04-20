# API Specification: ch.qos.logback:logback-classic 1.4.1

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public class `ch.qos.logback.classic.AsyncAppender`
extends `ch.qos.logback.core.AsyncAppenderBase`  

**Constructors:**
- `public AsyncAppender()`

**Methods:**
- `protected boolean isDiscardable(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public boolean isIncludeCallerData()`
- `protected void preprocess(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public void setIncludeCallerData(boolean p0)`

---

## public class `ch.qos.logback.classic.BasicConfigurator`
extends `ch.qos.logback.core.spi.ContextAwareBase`  
implements `ch.qos.logback.classic.spi.Configurator`  

**Constructors:**
- `public BasicConfigurator()`

**Methods:**
- `public ch.qos.logback.classic.spi.Configurator$ExecutionStatus configure(ch.qos.logback.classic.LoggerContext p0)`

---

## public class `ch.qos.logback.classic.ClassicConstants`

**Constructors:**
- `public ClassicConstants()`

**Fields:**
- `public final static java.lang.String CONFIG_FILE_PROPERTY`
- `public final static int DEFAULT_MAX_CALLEDER_DATA_DEPTH`
- `public final static java.lang.String FINALIZE_SESSION`
- `public final static org.slf4j.Marker FINALIZE_SESSION_MARKER`
- `public final static java.lang.String GAFFER_CONFIGURATOR_FQCN`
- `public final static java.lang.String JNDI_CONFIGURATION_RESOURCE`
- `public final static java.lang.String JNDI_CONTEXT_NAME`
- `public final static java.lang.String LOGBACK_CONTEXT_SELECTOR`
- `public final static int MAX_DOTS`
- `public final static java.lang.String REQUEST_METHOD`
- `public final static java.lang.String REQUEST_QUERY_STRING`
- `public final static java.lang.String REQUEST_REMOTE_HOST_MDC_KEY`
- `public final static java.lang.String REQUEST_REQUEST_URI`
- `public final static java.lang.String REQUEST_REQUEST_URL`
- `public final static java.lang.String REQUEST_USER_AGENT_MDC_KEY`
- `public final static java.lang.String REQUEST_X_FORWARDED_FOR`
- `public final static java.lang.String USER_MDC_KEY`

---

## public final class `ch.qos.logback.classic.Level`
implements `java.io.Serializable`  

**Fields:**
- `public final static ch.qos.logback.classic.Level ALL`
- `public final static int ALL_INT`
- `public final static java.lang.Integer ALL_INTEGER`
- `public final static ch.qos.logback.classic.Level DEBUG`
- `public final static int DEBUG_INT`
- `public final static java.lang.Integer DEBUG_INTEGER`
- `public final static ch.qos.logback.classic.Level ERROR`
- `public final static int ERROR_INT`
- `public final static java.lang.Integer ERROR_INTEGER`
- `public final static ch.qos.logback.classic.Level INFO`
- `public final static int INFO_INT`
- `public final static java.lang.Integer INFO_INTEGER`
- `public final static ch.qos.logback.classic.Level OFF`
- `public final static int OFF_INT`
- `public final static java.lang.Integer OFF_INTEGER`
- `public final static ch.qos.logback.classic.Level TRACE`
- `public final static int TRACE_INT`
- `public final static java.lang.Integer TRACE_INTEGER`
- `public final static ch.qos.logback.classic.Level WARN`
- `public final static int WARN_INT`
- `public final static java.lang.Integer WARN_INTEGER`
- `public final int levelInt`
- `public final java.lang.String levelStr`

**Methods:**
- `public static ch.qos.logback.classic.Level convertAnSLF4JLevel(org.slf4j.event.Level p0)`
- `public static ch.qos.logback.classic.Level fromLocationAwareLoggerInteger(int p0)`
- `public boolean isGreaterOrEqual(ch.qos.logback.classic.Level p0)`
- `public int toInt()`
- `public java.lang.Integer toInteger()`
- `public static ch.qos.logback.classic.Level toLevel(int p0)`
- `public static ch.qos.logback.classic.Level toLevel(int p0, ch.qos.logback.classic.Level p1)`
- `public static ch.qos.logback.classic.Level toLevel(java.lang.String p0)`
- `public static ch.qos.logback.classic.Level toLevel(java.lang.String p0, ch.qos.logback.classic.Level p1)`
- `public static int toLocationAwareLoggerInteger(ch.qos.logback.classic.Level p0)`
- `public java.lang.String toString()`
- `public static ch.qos.logback.classic.Level valueOf(java.lang.String p0)`

---

## public final class `ch.qos.logback.classic.Logger`
implements `ch.qos.logback.core.spi.AppenderAttachable<ch.qos.logback.classic.spi.ILoggingEvent>`, `java.io.Serializable`, `org.slf4j.Logger`, `org.slf4j.spi.LocationAwareLogger`, `org.slf4j.spi.LoggingEventAware`  

**Fields:**
- `public final static java.lang.String FQCN`

**Methods:**
- `public synchronized void addAppender(ch.qos.logback.core.Appender p0)`
- `public void callAppenders(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public void debug(java.lang.String p0)`
- `public void debug(java.lang.String p0, java.lang.Object p1)`
- `public void debug(java.lang.String p0, java.lang.Object p1, java.lang.Object p2)`
- `public void debug(java.lang.String p0, java.lang.Object... p1)`
- `public void debug(java.lang.String p0, java.lang.Throwable p1)`
- `public void debug(org.slf4j.Marker p0, java.lang.String p1)`
- `public void debug(org.slf4j.Marker p0, java.lang.String p1, java.lang.Object p2)`
- `public void debug(org.slf4j.Marker p0, java.lang.String p1, java.lang.Object p2, java.lang.Object p3)`
- `public void debug(org.slf4j.Marker p0, java.lang.String p1, java.lang.Object... p2)`
- `public void debug(org.slf4j.Marker p0, java.lang.String p1, java.lang.Throwable p2)`
- `public void detachAndStopAllAppenders()`
- `public boolean detachAppender(ch.qos.logback.core.Appender p0)`
- `public boolean detachAppender(java.lang.String p0)`
- `public void error(java.lang.String p0)`
- `public void error(java.lang.String p0, java.lang.Object p1)`
- `public void error(java.lang.String p0, java.lang.Object p1, java.lang.Object p2)`
- `public void error(java.lang.String p0, java.lang.Object... p1)`
- `public void error(java.lang.String p0, java.lang.Throwable p1)`
- `public void error(org.slf4j.Marker p0, java.lang.String p1)`
- `public void error(org.slf4j.Marker p0, java.lang.String p1, java.lang.Object p2)`
- `public void error(org.slf4j.Marker p0, java.lang.String p1, java.lang.Object p2, java.lang.Object p3)`
- `public void error(org.slf4j.Marker p0, java.lang.String p1, java.lang.Object... p2)`
- `public void error(org.slf4j.Marker p0, java.lang.String p1, java.lang.Throwable p2)`
- `public ch.qos.logback.core.Appender getAppender(java.lang.String p0)`
- `public ch.qos.logback.classic.Level getEffectiveLevel()`
- `public ch.qos.logback.classic.Level getLevel()`
- `public ch.qos.logback.classic.LoggerContext getLoggerContext()`
- `public java.lang.String getName()`
- `public void info(java.lang.String p0)`
- `public void info(java.lang.String p0, java.lang.Object p1)`
- `public void info(java.lang.String p0, java.lang.Object p1, java.lang.Object p2)`
- `public void info(java.lang.String p0, java.lang.Object... p1)`
- `public void info(java.lang.String p0, java.lang.Throwable p1)`
- `public void info(org.slf4j.Marker p0, java.lang.String p1)`
- `public void info(org.slf4j.Marker p0, java.lang.String p1, java.lang.Object p2)`
- `public void info(org.slf4j.Marker p0, java.lang.String p1, java.lang.Object p2, java.lang.Object p3)`
- `public void info(org.slf4j.Marker p0, java.lang.String p1, java.lang.Object... p2)`
- `public void info(org.slf4j.Marker p0, java.lang.String p1, java.lang.Throwable p2)`
- `public boolean isAdditive()`
- `public boolean isAttached(ch.qos.logback.core.Appender p0)`
- `public boolean isDebugEnabled()`
- `public boolean isDebugEnabled(org.slf4j.Marker p0)`
- `public boolean isEnabledFor(ch.qos.logback.classic.Level p0)`
- `public boolean isEnabledFor(org.slf4j.Marker p0, ch.qos.logback.classic.Level p1)`
- `public boolean isErrorEnabled()`
- `public boolean isErrorEnabled(org.slf4j.Marker p0)`
- `public boolean isInfoEnabled()`
- `public boolean isInfoEnabled(org.slf4j.Marker p0)`
- `public boolean isTraceEnabled()`
- `public boolean isTraceEnabled(org.slf4j.Marker p0)`
- `public boolean isWarnEnabled()`
- `public boolean isWarnEnabled(org.slf4j.Marker p0)`
- `public java.util.Iterator iteratorForAppenders()`
- `public void log(org.slf4j.Marker p0, java.lang.String p1, int p2, java.lang.String p3, java.lang.Object[] p4, java.lang.Throwable p5)`
- `public void log(org.slf4j.event.LoggingEvent p0)`
- `public org.slf4j.spi.LoggingEventBuilder makeLoggingEventBuilder(org.slf4j.event.Level p0)`
- `public void setAdditive(boolean p0)`
- `public synchronized void setLevel(ch.qos.logback.classic.Level p0)`
- `public java.lang.String toString()`
- `public void trace(java.lang.String p0)`
- `public void trace(java.lang.String p0, java.lang.Object p1)`
- `public void trace(java.lang.String p0, java.lang.Object p1, java.lang.Object p2)`
- `public void trace(java.lang.String p0, java.lang.Object... p1)`
- `public void trace(java.lang.String p0, java.lang.Throwable p1)`
- `public void trace(org.slf4j.Marker p0, java.lang.String p1)`
- `public void trace(org.slf4j.Marker p0, java.lang.String p1, java.lang.Object p2)`
- `public void trace(org.slf4j.Marker p0, java.lang.String p1, java.lang.Object p2, java.lang.Object p3)`
- `public void trace(org.slf4j.Marker p0, java.lang.String p1, java.lang.Object... p2)`
- `public void trace(org.slf4j.Marker p0, java.lang.String p1, java.lang.Throwable p2)`
- `public void warn(java.lang.String p0)`
- `public void warn(java.lang.String p0, java.lang.Object p1)`
- `public void warn(java.lang.String p0, java.lang.Object p1, java.lang.Object p2)`
- `public void warn(java.lang.String p0, java.lang.Object... p1)`
- `public void warn(java.lang.String p0, java.lang.Throwable p1)`
- `public void warn(org.slf4j.Marker p0, java.lang.String p1)`
- `public void warn(org.slf4j.Marker p0, java.lang.String p1, java.lang.Object p2)`
- `public void warn(org.slf4j.Marker p0, java.lang.String p1, java.lang.Object p2, java.lang.Object p3)`
- `public void warn(org.slf4j.Marker p0, java.lang.String p1, java.lang.Object... p2)`
- `public void warn(org.slf4j.Marker p0, java.lang.String p1, java.lang.Throwable p2)`

---

## public class `ch.qos.logback.classic.LoggerContext`
extends `ch.qos.logback.core.ContextBase`  
implements `ch.qos.logback.core.spi.LifeCycle`, `org.slf4j.ILoggerFactory`  

**Constructors:**
- `public LoggerContext()`

**Fields:**
- `public final static boolean DEFAULT_PACKAGING_DATA`

**Methods:**
- `public void addListener(ch.qos.logback.classic.spi.LoggerContextListener p0)`
- `public void addTurboFilter(ch.qos.logback.classic.turbo.TurboFilter p0)`
- `public ch.qos.logback.classic.Logger exists(java.lang.String p0)`
- `public java.util.List getCopyOfListenerList()`
- `public java.util.List getFrameworkPackages()`
- `public final ch.qos.logback.classic.Logger getLogger(java.lang.Class p0)`
- `public ch.qos.logback.classic.Logger getLogger(java.lang.String p0)`
- `public ch.qos.logback.classic.spi.LoggerContextVO getLoggerContextRemoteView()`
- `public java.util.List getLoggerList()`
- `public int getMaxCallerDataDepth()`
- `public ch.qos.logback.core.spi.SequenceNumberGenerator getSequenceNumberGenerator()`
- `public ch.qos.logback.classic.spi.TurboFilterList getTurboFilterList()`
- `public boolean isPackagingDataEnabled()`
- `public void putProperty(java.lang.String p0, java.lang.String p1)`
- `public void removeListener(ch.qos.logback.classic.spi.LoggerContextListener p0)`
- `public void reset()`
- `public void resetTurboFilterList()`
- `public void setMaxCallerDataDepth(int p0)`
- `public void setName(java.lang.String p0)`
- `public void setPackagingDataEnabled(boolean p0)`
- `public void setSequenceNumberGenerator(ch.qos.logback.core.spi.SequenceNumberGenerator p0)`
- `public void start()`
- `public void stop()`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.classic.PatternLayout`
extends `ch.qos.logback.core.pattern.PatternLayoutBase`  

**Constructors:**
- `public PatternLayout()`

**Fields:**
- `public final static java.util.Map CONVERTER_CLASS_TO_KEY_MAP`
- `public final static java.util.Map DEFAULT_CONVERTER_MAP`
- `public final static java.lang.String HEADER_PREFIX`
- `public final static java.util.Map defaultConverterMap`

**Methods:**
- `public java.lang.String doLayout(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public java.util.Map getDefaultConverterMap()`
- `protected java.lang.String getPresentationHeaderPrefix()`

---

## public class `ch.qos.logback.classic.ViewStatusMessagesServlet`
extends `ch.qos.logback.core.status.ViewStatusMessagesServletBase`  

**Constructors:**
- `public ViewStatusMessagesServlet()`

**Methods:**
- `protected java.lang.String getPageTitle(jakarta.servlet.http.HttpServletRequest p0, jakarta.servlet.http.HttpServletResponse p1)`
- `protected ch.qos.logback.core.status.StatusManager getStatusManager(jakarta.servlet.http.HttpServletRequest p0, jakarta.servlet.http.HttpServletResponse p1)`

---

## public abstract interface `ch.qos.logback.classic.boolex.IEvaluator`

**Methods:**
- `public abstract boolean doEvaluate(ch.qos.logback.classic.spi.ILoggingEvent p0)`

---

## public class `ch.qos.logback.classic.boolex.JaninoEventEvaluator`
extends `ch.qos.logback.core.boolex.JaninoEventEvaluatorBase`  

**Constructors:**
- `public JaninoEventEvaluator()`

**Fields:**
- `public final static java.util.List DEFAULT_PARAM_NAME_LIST`
- `public final static java.util.List DEFAULT_PARAM_TYPE_LIST`
- `public final static java.lang.String IMPORT_LEVEL`

**Methods:**
- `protected java.lang.String getDecoratedExpression()`
- `protected java.lang.String[] getParameterNames()`
- `protected java.lang.Class[] getParameterTypes()`
- `protected java.lang.Object[] getParameterValues(ch.qos.logback.classic.spi.ILoggingEvent p0)`

---

## public class `ch.qos.logback.classic.boolex.OnErrorEvaluator`
extends `ch.qos.logback.core.boolex.EventEvaluatorBase`  

**Constructors:**
- `public OnErrorEvaluator()`

**Methods:**
- `public boolean evaluate(ch.qos.logback.classic.spi.ILoggingEvent p0) throws ch.qos.logback.core.boolex.EvaluationException, java.lang.NullPointerException`

---

## public class `ch.qos.logback.classic.boolex.OnMarkerEvaluator`
extends `ch.qos.logback.core.boolex.EventEvaluatorBase`  

**Constructors:**
- `public OnMarkerEvaluator()`

**Methods:**
- `public void addMarker(java.lang.String p0)`
- `public boolean evaluate(ch.qos.logback.classic.spi.ILoggingEvent p0) throws ch.qos.logback.core.boolex.EvaluationException, java.lang.NullPointerException`

---

## public class `ch.qos.logback.classic.encoder.PatternLayoutEncoder`
extends `ch.qos.logback.core.pattern.PatternLayoutEncoderBase`  

**Constructors:**
- `public PatternLayoutEncoder()`

**Methods:**
- `public void start()`

---

## public class `ch.qos.logback.classic.filter.LevelFilter`
extends `ch.qos.logback.core.filter.AbstractMatcherFilter`  

**Constructors:**
- `public LevelFilter()`

**Methods:**
- `public ch.qos.logback.core.spi.FilterReply decide(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public void setLevel(ch.qos.logback.classic.Level p0)`
- `public void start()`

---

## public class `ch.qos.logback.classic.filter.ThresholdFilter`
extends `ch.qos.logback.core.filter.Filter`  

**Constructors:**
- `public ThresholdFilter()`

**Methods:**
- `public ch.qos.logback.core.spi.FilterReply decide(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public void setLevel(java.lang.String p0)`
- `public void start()`

---

## public class `ch.qos.logback.classic.helpers.MDCInsertingServletFilter`
implements `jakarta.servlet.Filter`  

**Constructors:**
- `public MDCInsertingServletFilter()`

**Methods:**
- `public void destroy()`
- `public void doFilter(jakarta.servlet.ServletRequest p0, jakarta.servlet.ServletResponse p1, jakarta.servlet.FilterChain p2) throws jakarta.servlet.ServletException, java.io.IOException`
- `public void init(jakarta.servlet.FilterConfig p0) throws jakarta.servlet.ServletException`

---

## public class `ch.qos.logback.classic.helpers.WithLayoutListAppender`
extends `ch.qos.logback.core.AppenderBase`  

**Constructors:**
- `public WithLayoutListAppender()`

**Fields:**
- `public java.util.List list`

**Methods:**
- `protected void append(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public java.lang.String getPattern()`
- `public void setPattern(java.lang.String p0)`
- `public void start()`

---

## public class `ch.qos.logback.classic.html.DefaultCssBuilder`
implements `ch.qos.logback.core.html.CssBuilder`  

**Constructors:**
- `public DefaultCssBuilder()`

**Methods:**
- `public void addCss(java.lang.StringBuilder p0)`

---

## public class `ch.qos.logback.classic.html.DefaultThrowableRenderer`
implements `ch.qos.logback.core.html.IThrowableRenderer<ch.qos.logback.classic.spi.ILoggingEvent>`  

**Constructors:**
- `public DefaultThrowableRenderer()`

**Methods:**
- `public void printFirstLine(java.lang.StringBuilder p0, ch.qos.logback.classic.spi.IThrowableProxy p1)`
- `public void render(java.lang.StringBuilder p0, ch.qos.logback.classic.spi.ILoggingEvent p1)`

---

## public class `ch.qos.logback.classic.html.HTMLLayout`
extends `ch.qos.logback.core.html.HTMLLayoutBase`  

**Constructors:**
- `public HTMLLayout()`

**Methods:**
- `protected java.lang.String computeConverterName(ch.qos.logback.core.pattern.Converter p0)`
- `public java.lang.String doLayout(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `protected java.util.Map getDefaultConverterMap()`
- `public ch.qos.logback.core.html.IThrowableRenderer getThrowableRenderer()`
- `public void setThrowableRenderer(ch.qos.logback.core.html.IThrowableRenderer p0)`
- `public void start()`

---

## public class `ch.qos.logback.classic.html.UrlCssBuilder`
implements `ch.qos.logback.core.html.CssBuilder`  

**Constructors:**
- `public UrlCssBuilder()`

**Methods:**
- `public void addCss(java.lang.StringBuilder p0)`
- `public java.lang.String getUrl()`
- `public void setUrl(java.lang.String p0)`

---

## public class `ch.qos.logback.classic.joran.JoranConfigurator`
extends `ch.qos.logback.core.joran.JoranConfiguratorBase`  

**Constructors:**
- `public JoranConfigurator()`

**Methods:**
- `protected void addDefaultNestedComponentRegistryRules(ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry p0)`
- `public void addElementSelectorAndActionAssociations(ch.qos.logback.core.joran.spi.RuleStore p0)`
- `protected void addModelHandlerAssociations(ch.qos.logback.core.model.processor.DefaultProcessor p0)`

---

## public class `ch.qos.logback.classic.joran.ReconfigureOnChangeTask`
extends `ch.qos.logback.core.spi.ContextAwareBase`  
implements `java.lang.Runnable`  

**Constructors:**
- `public ReconfigureOnChangeTask()`

**Fields:**
- `public final static java.lang.String DETECTED_CHANGE_IN_CONFIGURATION_FILES`

**Methods:**
- `public void run()`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.classic.joran.ReconfigureOnChangeTaskListener`

**Constructors:**
- `public ReconfigureOnChangeTaskListener()`

---

## public class `ch.qos.logback.classic.joran.action.ClassicEvaluatorAction`
extends `ch.qos.logback.core.joran.action.EventEvaluatorAction`  

**Constructors:**
- `public ClassicEvaluatorAction()`

**Methods:**
- `protected java.lang.String defaultClassName()`

---

## public class `ch.qos.logback.classic.joran.action.ConfigurationAction`
extends `ch.qos.logback.core.joran.action.BaseModelAction`  

**Constructors:**
- `public ConfigurationAction()`

**Methods:**
- `protected ch.qos.logback.core.model.Model buildCurrentModel(ch.qos.logback.core.joran.spi.SaxEventInterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2)`

---

## public class `ch.qos.logback.classic.joran.action.ConsolePluginAction`
extends `ch.qos.logback.core.joran.action.Action`  

**Constructors:**
- `public ConsolePluginAction()`

**Methods:**
- `public void begin(ch.qos.logback.core.joran.spi.SaxEventInterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2) throws ch.qos.logback.core.joran.spi.ActionException`
- `public void end(ch.qos.logback.core.joran.spi.SaxEventInterpretationContext p0, java.lang.String p1) throws ch.qos.logback.core.joran.spi.ActionException`

---

## public class `ch.qos.logback.classic.joran.action.ContextNameAction`
extends `ch.qos.logback.core.joran.action.BaseModelAction`  

**Constructors:**
- `public ContextNameAction()`

**Methods:**
- `protected ch.qos.logback.core.model.Model buildCurrentModel(ch.qos.logback.core.joran.spi.SaxEventInterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2)`

---

## public class `ch.qos.logback.classic.joran.action.InsertFromJNDIAction`
extends `ch.qos.logback.core.joran.action.BaseModelAction`  

**Constructors:**
- `public InsertFromJNDIAction()`

**Fields:**
- `public final static java.lang.String AS_ATTR`
- `public final static java.lang.String ENV_ENTRY_NAME_ATTR`

**Methods:**
- `protected ch.qos.logback.core.model.Model buildCurrentModel(ch.qos.logback.core.joran.spi.SaxEventInterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2)`
- `protected boolean validPreconditions(ch.qos.logback.core.joran.spi.SaxEventInterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2)`

---

## public class `ch.qos.logback.classic.joran.action.LevelAction`
extends `ch.qos.logback.core.joran.action.BaseModelAction`  

**Constructors:**
- `public LevelAction()`

**Methods:**
- `protected ch.qos.logback.core.model.Model buildCurrentModel(ch.qos.logback.core.joran.spi.SaxEventInterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2)`
- `protected boolean validPreconditions(ch.qos.logback.core.joran.spi.SaxEventInterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2)`

---

## public class `ch.qos.logback.classic.joran.action.LoggerAction`
extends `ch.qos.logback.core.joran.action.BaseModelAction`  

**Constructors:**
- `public LoggerAction()`

**Methods:**
- `protected ch.qos.logback.core.model.Model buildCurrentModel(ch.qos.logback.core.joran.spi.SaxEventInterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2)`
- `protected boolean validPreconditions(ch.qos.logback.core.joran.spi.SaxEventInterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2)`

---

## public class `ch.qos.logback.classic.joran.action.LoggerContextListenerAction`
extends `ch.qos.logback.core.joran.action.BaseModelAction`  

**Constructors:**
- `public LoggerContextListenerAction()`

**Methods:**
- `protected ch.qos.logback.core.model.Model buildCurrentModel(ch.qos.logback.core.joran.spi.SaxEventInterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2)`
- `protected boolean validPreconditions(ch.qos.logback.core.joran.spi.SaxEventInterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2)`

---

## public class `ch.qos.logback.classic.joran.action.ReceiverAction`
extends `ch.qos.logback.core.joran.action.BaseModelAction`  

**Constructors:**
- `public ReceiverAction()`

**Methods:**
- `protected ch.qos.logback.core.model.Model buildCurrentModel(ch.qos.logback.core.joran.spi.SaxEventInterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2)`
- `protected boolean validPreconditions(ch.qos.logback.core.joran.spi.SaxEventInterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2)`

---

## public class `ch.qos.logback.classic.joran.action.RootLoggerAction`
extends `ch.qos.logback.core.joran.action.BaseModelAction`  

**Constructors:**
- `public RootLoggerAction()`

**Methods:**
- `protected ch.qos.logback.core.model.Model buildCurrentModel(ch.qos.logback.core.joran.spi.SaxEventInterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2)`
- `protected boolean validPreconditions(ch.qos.logback.core.joran.spi.SaxEventInterpretationContext p0, java.lang.String p1, org.xml.sax.Attributes p2)`

---

## public class `ch.qos.logback.classic.jul.JULHelper`

**Constructors:**
- `public JULHelper()`

**Methods:**
- `public static java.util.logging.Level asJULLevel(ch.qos.logback.classic.Level p0)`
- `public static java.util.logging.Logger asJULLogger(ch.qos.logback.classic.Logger p0)`
- `public static java.util.logging.Logger asJULLogger(java.lang.String p0)`
- `public static java.lang.String asJULLoggerName(java.lang.String p0)`
- `public final static boolean isRegularNonRootLogger(java.util.logging.Logger p0)`
- `public final static boolean isRoot(java.util.logging.Logger p0)`

---

## public class `ch.qos.logback.classic.jul.LevelChangePropagator`
extends `ch.qos.logback.core.spi.ContextAwareBase`  
implements `ch.qos.logback.classic.spi.LoggerContextListener`, `ch.qos.logback.core.spi.LifeCycle`  

**Constructors:**
- `public LevelChangePropagator()`

**Methods:**
- `public boolean isResetResistant()`
- `public boolean isStarted()`
- `public void onLevelChange(ch.qos.logback.classic.Logger p0, ch.qos.logback.classic.Level p1)`
- `public void onReset(ch.qos.logback.classic.LoggerContext p0)`
- `public void onStart(ch.qos.logback.classic.LoggerContext p0)`
- `public void onStop(ch.qos.logback.classic.LoggerContext p0)`
- `public void resetJULLevels()`
- `public void setResetJUL(boolean p0)`
- `public void start()`
- `public void stop()`

---

## public class `ch.qos.logback.classic.layout.TTLLLayout`
extends `ch.qos.logback.core.LayoutBase`  

**Constructors:**
- `public TTLLLayout()`

**Methods:**
- `public java.lang.String doLayout(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public void start()`

---

## public class `ch.qos.logback.classic.log4j.XMLLayout`
extends `ch.qos.logback.core.LayoutBase`  

**Constructors:**
- `public XMLLayout()`

**Methods:**
- `public java.lang.String doLayout(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public java.lang.String getContentType()`
- `public boolean getLocationInfo()`
- `public boolean getProperties()`
- `public void setLocationInfo(boolean p0)`
- `public void setProperties(boolean p0)`
- `public void start()`

---

## public class `ch.qos.logback.classic.net.LoggingEventPreSerializationTransformer`
implements `ch.qos.logback.core.spi.PreSerializationTransformer<ch.qos.logback.classic.spi.ILoggingEvent>`  

**Constructors:**
- `public LoggingEventPreSerializationTransformer()`

**Methods:**
- `public java.io.Serializable transform(ch.qos.logback.classic.spi.ILoggingEvent p0)`

---

## public abstract class `ch.qos.logback.classic.net.ReceiverBase`
extends `ch.qos.logback.core.spi.ContextAwareBase`  
implements `ch.qos.logback.core.spi.LifeCycle`  

**Constructors:**
- `public ReceiverBase()`

**Methods:**
- `protected abstract java.lang.Runnable getRunnableTask()`
- `public final boolean isStarted()`
- `protected abstract void onStop()`
- `protected abstract boolean shouldStart()`
- `public final void start()`
- `public final void stop()`

---

## public class `ch.qos.logback.classic.net.SMTPAppender`
extends `ch.qos.logback.core.net.SMTPAppenderBase`  

**Constructors:**
- `public SMTPAppender()`
- `public SMTPAppender(ch.qos.logback.core.boolex.EventEvaluator p0)`

**Methods:**
- `protected boolean eventMarksEndOfLife(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `protected void fillBuffer(ch.qos.logback.core.helpers.CyclicBuffer p0, java.lang.StringBuffer p1)`
- `public boolean isIncludeCallerData()`
- `protected ch.qos.logback.classic.PatternLayout makeNewToPatternLayout(java.lang.String p0)`
- `protected ch.qos.logback.core.Layout makeSubjectLayout(java.lang.String p0)`
- `public void setIncludeCallerData(boolean p0)`
- `public void start()`
- `protected void subAppend(ch.qos.logback.core.helpers.CyclicBuffer p0, ch.qos.logback.classic.spi.ILoggingEvent p1)`

---

## public class `ch.qos.logback.classic.net.SSLSocketAppender`
extends `ch.qos.logback.core.net.AbstractSSLSocketAppender`  

**Constructors:**
- `public SSLSocketAppender()`

**Methods:**
- `public ch.qos.logback.core.spi.PreSerializationTransformer getPST()`
- `protected void postProcessEvent(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public void setIncludeCallerData(boolean p0)`

---

## public class `ch.qos.logback.classic.net.SSLSocketReceiver`
extends `ch.qos.logback.classic.net.SocketReceiver`  
implements `ch.qos.logback.core.net.ssl.SSLComponent`  

**Constructors:**
- `public SSLSocketReceiver()`

**Methods:**
- `protected javax.net.SocketFactory getSocketFactory()`
- `public ch.qos.logback.core.net.ssl.SSLConfiguration getSsl()`
- `public void setSsl(ch.qos.logback.core.net.ssl.SSLConfiguration p0)`
- `protected boolean shouldStart()`

---

## public class `ch.qos.logback.classic.net.SimpleSSLSocketServer`
extends `ch.qos.logback.classic.net.SimpleSocketServer`  

**Constructors:**
- `public SimpleSSLSocketServer(ch.qos.logback.classic.LoggerContext p0, int p1) throws java.security.NoSuchAlgorithmException`
- `public SimpleSSLSocketServer(ch.qos.logback.classic.LoggerContext p0, int p1, javax.net.ssl.SSLContext p2)`

**Methods:**
- `protected javax.net.ServerSocketFactory getServerSocketFactory()`
- `public static void main(java.lang.String[] p0) throws java.lang.Exception`

---

## public class `ch.qos.logback.classic.net.SimpleSocketServer`
extends `java.lang.Thread`  

**Constructors:**
- `public SimpleSocketServer(ch.qos.logback.classic.LoggerContext p0, int p1)`

**Methods:**
- `public void close()`
- `public static void configureLC(ch.qos.logback.classic.LoggerContext p0, java.lang.String p1) throws ch.qos.logback.core.joran.spi.JoranException`
- `protected static void doMain(java.lang.Class p0, java.lang.String[] p1) throws java.lang.Exception`
- `protected java.lang.String getClientThreadName(java.net.Socket p0)`
- `public java.util.concurrent.CountDownLatch getLatch()`
- `protected javax.net.ServerSocketFactory getServerSocketFactory()`
- `protected java.lang.String getServerThreadName()`
- `public boolean isClosed()`
- `public static void main(java.lang.String[] p0) throws java.lang.Exception`
- `public void run()`
- `public void socketNodeClosing(ch.qos.logback.classic.net.SocketNode p0)`

---

## public class `ch.qos.logback.classic.net.SocketAppender`
extends `ch.qos.logback.core.net.AbstractSocketAppender`  

**Constructors:**
- `public SocketAppender()`

**Methods:**
- `public ch.qos.logback.core.spi.PreSerializationTransformer getPST()`
- `protected void postProcessEvent(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public void setIncludeCallerData(boolean p0)`

---

## public class `ch.qos.logback.classic.net.SocketNode`
implements `java.lang.Runnable`  

**Constructors:**
- `public SocketNode(ch.qos.logback.classic.net.SimpleSocketServer p0, java.net.Socket p1, ch.qos.logback.classic.LoggerContext p2)`

**Methods:**
- `public void run()`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.classic.net.SocketReceiver`
extends `ch.qos.logback.classic.net.ReceiverBase`  
implements `ch.qos.logback.core.net.SocketConnector$ExceptionHandler`, `java.lang.Runnable`  

**Constructors:**
- `public SocketReceiver()`

**Methods:**
- `public void connectionFailed(ch.qos.logback.core.net.SocketConnector p0, java.lang.Exception p1)`
- `protected java.lang.Runnable getRunnableTask()`
- `protected javax.net.SocketFactory getSocketFactory()`
- `protected ch.qos.logback.core.net.SocketConnector newConnector(java.net.InetAddress p0, int p1, int p2, int p3)`
- `protected void onStop()`
- `public void run()`
- `public void setAcceptConnectionTimeout(int p0)`
- `public void setPort(int p0)`
- `public void setReconnectionDelay(int p0)`
- `public void setRemoteHost(java.lang.String p0)`
- `protected boolean shouldStart()`

---

## public class `ch.qos.logback.classic.net.SyslogAppender`
extends `ch.qos.logback.core.net.SyslogAppenderBase`  

**Constructors:**
- `public SyslogAppender()`

**Fields:**
- `public final static java.lang.String DEFAULT_STACKTRACE_PATTERN`
- `public final static java.lang.String DEFAULT_SUFFIX_PATTERN`

**Methods:**
- `public ch.qos.logback.core.Layout buildLayout()`
- `public ch.qos.logback.core.net.SyslogOutputStream createOutputStream() throws java.net.SocketException, java.net.UnknownHostException`
- `public int getSeverityForEvent(java.lang.Object p0)`
- `public java.lang.String getStackTracePattern()`
- `public boolean isThrowableExcluded()`
- `protected void postProcess(java.lang.Object p0, java.io.OutputStream p1)`
- `public void setStackTracePattern(java.lang.String p0)`
- `public void setThrowableExcluded(boolean p0)`
- `public void start()`

---

## public class `ch.qos.logback.classic.net.server.HardenedLoggingEventInputStream`
extends `ch.qos.logback.core.net.HardenedObjectInputStream`  

**Constructors:**
- `public HardenedLoggingEventInputStream(java.io.InputStream p0) throws java.io.IOException`
- `public HardenedLoggingEventInputStream(java.io.InputStream p0, java.util.List p1) throws java.io.IOException`

**Methods:**
- `public static java.util.List getWhilelist()`

---

## public class `ch.qos.logback.classic.net.server.SSLServerSocketAppender`
extends `ch.qos.logback.core.net.server.SSLServerSocketAppenderBase`  

**Constructors:**
- `public SSLServerSocketAppender()`

**Methods:**
- `protected ch.qos.logback.core.spi.PreSerializationTransformer getPST()`
- `public boolean isIncludeCallerData()`
- `protected void postProcessEvent(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public void setIncludeCallerData(boolean p0)`

---

## public class `ch.qos.logback.classic.net.server.SSLServerSocketReceiver`
extends `ch.qos.logback.classic.net.server.ServerSocketReceiver`  
implements `ch.qos.logback.core.net.ssl.SSLComponent`  

**Constructors:**
- `public SSLServerSocketReceiver()`

**Methods:**
- `protected javax.net.ServerSocketFactory getServerSocketFactory() throws java.lang.Exception`
- `public ch.qos.logback.core.net.ssl.SSLConfiguration getSsl()`
- `public void setSsl(ch.qos.logback.core.net.ssl.SSLConfiguration p0)`

---

## public class `ch.qos.logback.classic.net.server.ServerSocketAppender`
extends `ch.qos.logback.core.net.server.AbstractServerSocketAppender`  

**Constructors:**
- `public ServerSocketAppender()`

**Methods:**
- `protected ch.qos.logback.core.spi.PreSerializationTransformer getPST()`
- `public boolean isIncludeCallerData()`
- `protected void postProcessEvent(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public void setIncludeCallerData(boolean p0)`

---

## public class `ch.qos.logback.classic.net.server.ServerSocketReceiver`
extends `ch.qos.logback.classic.net.ReceiverBase`  

**Constructors:**
- `public ServerSocketReceiver()`

**Fields:**
- `public final static int DEFAULT_BACKLOG`

**Methods:**
- `protected ch.qos.logback.core.net.server.ServerListener createServerListener(java.net.ServerSocket p0)`
- `protected ch.qos.logback.core.net.server.ServerRunner createServerRunner(ch.qos.logback.core.net.server.ServerListener p0, java.util.concurrent.Executor p1)`
- `public java.lang.String getAddress()`
- `public int getBacklog()`
- `protected java.net.InetAddress getInetAddress() throws java.net.UnknownHostException`
- `public int getPort()`
- `protected java.lang.Runnable getRunnableTask()`
- `protected javax.net.ServerSocketFactory getServerSocketFactory() throws java.lang.Exception`
- `protected void onStop()`
- `public void setAddress(java.lang.String p0)`
- `public void setBacklog(int p0)`
- `public void setPort(int p0)`
- `protected boolean shouldStart()`

---

## public abstract interface `ch.qos.logback.classic.pattern.Abbreviator`

**Methods:**
- `public abstract java.lang.String abbreviate(java.lang.String p0)`

---

## public class `ch.qos.logback.classic.pattern.CallerDataConverter`
extends `ch.qos.logback.classic.pattern.ClassicConverter`  

**Constructors:**
- `public CallerDataConverter()`

**Fields:**
- `public final static java.lang.String DEFAULT_CALLER_LINE_PREFIX`
- `public final static java.lang.String DEFAULT_RANGE_DELIMITER`

**Methods:**
- `public java.lang.String convert(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `protected java.lang.String getCallerLinePrefix()`
- `protected java.lang.String getDefaultRangeDelimiter()`
- `public void start()`

---

## public class `ch.qos.logback.classic.pattern.ClassNameOnlyAbbreviator`
implements `ch.qos.logback.classic.pattern.Abbreviator`  

**Constructors:**
- `public ClassNameOnlyAbbreviator()`

**Methods:**
- `public java.lang.String abbreviate(java.lang.String p0)`

---

## public class `ch.qos.logback.classic.pattern.ClassOfCallerConverter`
extends `ch.qos.logback.classic.pattern.NamedConverter`  

**Constructors:**
- `public ClassOfCallerConverter()`

**Methods:**
- `protected java.lang.String getFullyQualifiedName(ch.qos.logback.classic.spi.ILoggingEvent p0)`

---

## public abstract class `ch.qos.logback.classic.pattern.ClassicConverter`
extends `ch.qos.logback.core.pattern.DynamicConverter`  

**Constructors:**
- `public ClassicConverter()`

---

## public class `ch.qos.logback.classic.pattern.ContextNameConverter`
extends `ch.qos.logback.classic.pattern.ClassicConverter`  

**Constructors:**
- `public ContextNameConverter()`

**Methods:**
- `public java.lang.String convert(ch.qos.logback.classic.spi.ILoggingEvent p0)`

---

## public class `ch.qos.logback.classic.pattern.DateConverter`
extends `ch.qos.logback.classic.pattern.ClassicConverter`  

**Constructors:**
- `public DateConverter()`

**Methods:**
- `public java.lang.String convert(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public void start()`

---

## public class `ch.qos.logback.classic.pattern.EnsureExceptionHandling`
implements `ch.qos.logback.core.pattern.PostCompileProcessor<ch.qos.logback.classic.spi.ILoggingEvent>`  

**Constructors:**
- `public EnsureExceptionHandling()`

**Methods:**
- `public boolean chainHandlesThrowable(ch.qos.logback.core.pattern.Converter p0)`
- `public boolean compositeHandlesThrowable(ch.qos.logback.core.pattern.CompositeConverter p0)`
- `public void process(ch.qos.logback.core.Context p0, ch.qos.logback.core.pattern.Converter p1)`

---

## public class `ch.qos.logback.classic.pattern.ExtendedThrowableProxyConverter`
extends `ch.qos.logback.classic.pattern.ThrowableProxyConverter`  

**Constructors:**
- `public ExtendedThrowableProxyConverter()`

**Methods:**
- `protected void extraData(java.lang.StringBuilder p0, ch.qos.logback.classic.spi.StackTraceElementProxy p1)`
- `protected void prepareLoggingEvent(ch.qos.logback.classic.spi.ILoggingEvent p0)`

---

## public class `ch.qos.logback.classic.pattern.FileOfCallerConverter`
extends `ch.qos.logback.classic.pattern.ClassicConverter`  

**Constructors:**
- `public FileOfCallerConverter()`

**Methods:**
- `public java.lang.String convert(ch.qos.logback.classic.spi.ILoggingEvent p0)`

---

## public class `ch.qos.logback.classic.pattern.KeyValuePairConverter`
extends `ch.qos.logback.classic.pattern.ClassicConverter`  

**Constructors:**
- `public KeyValuePairConverter()`

**Methods:**
- `public java.lang.String convert(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public void start()`

---

## public class `ch.qos.logback.classic.pattern.LevelConverter`
extends `ch.qos.logback.classic.pattern.ClassicConverter`  

**Constructors:**
- `public LevelConverter()`

**Methods:**
- `public java.lang.String convert(ch.qos.logback.classic.spi.ILoggingEvent p0)`

---

## public class `ch.qos.logback.classic.pattern.LineOfCallerConverter`
extends `ch.qos.logback.classic.pattern.ClassicConverter`  

**Constructors:**
- `public LineOfCallerConverter()`

**Methods:**
- `public java.lang.String convert(ch.qos.logback.classic.spi.ILoggingEvent p0)`

---

## public class `ch.qos.logback.classic.pattern.LineSeparatorConverter`
extends `ch.qos.logback.classic.pattern.ClassicConverter`  

**Constructors:**
- `public LineSeparatorConverter()`

**Methods:**
- `public java.lang.String convert(ch.qos.logback.classic.spi.ILoggingEvent p0)`

---

## public class `ch.qos.logback.classic.pattern.LocalSequenceNumberConverter`
extends `ch.qos.logback.classic.pattern.ClassicConverter`  

**Constructors:**
- `public LocalSequenceNumberConverter()`

**Methods:**
- `public java.lang.String convert(ch.qos.logback.classic.spi.ILoggingEvent p0)`

---

## public class `ch.qos.logback.classic.pattern.LoggerConverter`
extends `ch.qos.logback.classic.pattern.NamedConverter`  

**Constructors:**
- `public LoggerConverter()`

**Methods:**
- `protected java.lang.String getFullyQualifiedName(ch.qos.logback.classic.spi.ILoggingEvent p0)`

---

## public class `ch.qos.logback.classic.pattern.MDCConverter`
extends `ch.qos.logback.classic.pattern.ClassicConverter`  

**Constructors:**
- `public MDCConverter()`

**Methods:**
- `public java.lang.String convert(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public java.lang.String getKey()`
- `public void start()`
- `public void stop()`

---

## public class `ch.qos.logback.classic.pattern.MarkerConverter`
extends `ch.qos.logback.classic.pattern.ClassicConverter`  

**Constructors:**
- `public MarkerConverter()`

**Methods:**
- `public java.lang.String convert(ch.qos.logback.classic.spi.ILoggingEvent p0)`

---

## public class `ch.qos.logback.classic.pattern.MessageConverter`
extends `ch.qos.logback.classic.pattern.ClassicConverter`  

**Constructors:**
- `public MessageConverter()`

**Methods:**
- `public java.lang.String convert(ch.qos.logback.classic.spi.ILoggingEvent p0)`

---

## public class `ch.qos.logback.classic.pattern.MethodOfCallerConverter`
extends `ch.qos.logback.classic.pattern.ClassicConverter`  

**Constructors:**
- `public MethodOfCallerConverter()`

**Methods:**
- `public java.lang.String convert(ch.qos.logback.classic.spi.ILoggingEvent p0)`

---

## public class `ch.qos.logback.classic.pattern.MicrosecondConverter`
extends `ch.qos.logback.classic.pattern.ClassicConverter`  

**Constructors:**
- `public MicrosecondConverter()`

**Methods:**
- `public java.lang.String convert(ch.qos.logback.classic.spi.ILoggingEvent p0)`

---

## public abstract class `ch.qos.logback.classic.pattern.NamedConverter`
extends `ch.qos.logback.classic.pattern.ClassicConverter`  

**Constructors:**
- `public NamedConverter()`

**Methods:**
- `public java.lang.String convert(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public double getCacheMissRate()`
- `public int getCacheMisses()`
- `protected abstract java.lang.String getFullyQualifiedName(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public void start()`

---

## public class `ch.qos.logback.classic.pattern.NopThrowableInformationConverter`
extends `ch.qos.logback.classic.pattern.ThrowableHandlingConverter`  

**Constructors:**
- `public NopThrowableInformationConverter()`

**Methods:**
- `public java.lang.String convert(ch.qos.logback.classic.spi.ILoggingEvent p0)`

---

## public class `ch.qos.logback.classic.pattern.PrefixCompositeConverter`
extends `ch.qos.logback.core.pattern.CompositeConverter`  

**Constructors:**
- `public PrefixCompositeConverter()`

**Methods:**
- `public java.lang.String convert(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `protected java.lang.String transform(ch.qos.logback.classic.spi.ILoggingEvent p0, java.lang.String p1)`

---

## public final class `ch.qos.logback.classic.pattern.PropertyConverter`
extends `ch.qos.logback.classic.pattern.ClassicConverter`  

**Constructors:**
- `public PropertyConverter()`

**Methods:**
- `public java.lang.String convert(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public java.lang.String getKey()`
- `public void start()`

---

## public class `ch.qos.logback.classic.pattern.RelativeTimeConverter`
extends `ch.qos.logback.classic.pattern.ClassicConverter`  

**Constructors:**
- `public RelativeTimeConverter()`

**Methods:**
- `public java.lang.String convert(ch.qos.logback.classic.spi.ILoggingEvent p0)`

---

## public class `ch.qos.logback.classic.pattern.RootCauseFirstThrowableProxyConverter`
extends `ch.qos.logback.classic.pattern.ExtendedThrowableProxyConverter`  

**Constructors:**
- `public RootCauseFirstThrowableProxyConverter()`

**Methods:**
- `protected void recursiveAppendRootCauseFirst(java.lang.StringBuilder p0, java.lang.String p1, int p2, ch.qos.logback.classic.spi.IThrowableProxy p3)`
- `protected java.lang.String throwableProxyToString(ch.qos.logback.classic.spi.IThrowableProxy p0)`

---

## public class `ch.qos.logback.classic.pattern.SequenceNumberConverter`
extends `ch.qos.logback.classic.pattern.ClassicConverter`  

**Constructors:**
- `public SequenceNumberConverter()`

**Methods:**
- `public java.lang.String convert(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public void start()`

---

## public class `ch.qos.logback.classic.pattern.SyslogStartConverter`
extends `ch.qos.logback.classic.pattern.ClassicConverter`  

**Constructors:**
- `public SyslogStartConverter()`

**Methods:**
- `public java.lang.String convert(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public java.lang.String getLocalHostname()`
- `public void start()`

---

## public class `ch.qos.logback.classic.pattern.TargetLengthBasedClassNameAbbreviator`
implements `ch.qos.logback.classic.pattern.Abbreviator`  

**Constructors:**
- `public TargetLengthBasedClassNameAbbreviator(int p0)`

**Methods:**
- `public java.lang.String abbreviate(java.lang.String p0)`

---

## public class `ch.qos.logback.classic.pattern.TargetLengthBasedClassNameAbbreviator2`
implements `ch.qos.logback.classic.pattern.Abbreviator`  

**Constructors:**
- `public TargetLengthBasedClassNameAbbreviator2(int p0)`

**Methods:**
- `public java.lang.String abbreviate(java.lang.String p0)`

---

## public class `ch.qos.logback.classic.pattern.ThreadConverter`
extends `ch.qos.logback.classic.pattern.ClassicConverter`  

**Constructors:**
- `public ThreadConverter()`

**Methods:**
- `public java.lang.String convert(ch.qos.logback.classic.spi.ILoggingEvent p0)`

---

## public abstract class `ch.qos.logback.classic.pattern.ThrowableHandlingConverter`
extends `ch.qos.logback.classic.pattern.ClassicConverter`  

**Constructors:**
- `public ThrowableHandlingConverter()`

---

## public class `ch.qos.logback.classic.pattern.ThrowableProxyConverter`
extends `ch.qos.logback.classic.pattern.ThrowableHandlingConverter`  

**Constructors:**
- `public ThrowableProxyConverter()`

**Fields:**
- `protected final static int BUILDER_CAPACITY`

**Methods:**
- `public java.lang.String convert(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `protected void extraData(java.lang.StringBuilder p0, ch.qos.logback.classic.spi.StackTraceElementProxy p1)`
- `public void start()`
- `public void stop()`
- `protected void subjoinSTEPArray(java.lang.StringBuilder p0, int p1, ch.qos.logback.classic.spi.IThrowableProxy p2)`
- `protected java.lang.String throwableProxyToString(ch.qos.logback.classic.spi.IThrowableProxy p0)`

---

## public class `ch.qos.logback.classic.pattern.Util`

**Constructors:**
- `public Util()`

**Methods:**
- `public static boolean match(org.slf4j.Marker p0, org.slf4j.Marker[] p1)`

---

## public class `ch.qos.logback.classic.pattern.color.HighlightingCompositeConverter`
extends `ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase`  

**Constructors:**
- `public HighlightingCompositeConverter()`

**Methods:**
- `protected java.lang.String getForegroundColorCode(ch.qos.logback.classic.spi.ILoggingEvent p0)`

---

## public class `ch.qos.logback.classic.selector.ContextJNDISelector`
implements `ch.qos.logback.classic.selector.ContextSelector`  

**Constructors:**
- `public ContextJNDISelector(ch.qos.logback.classic.LoggerContext p0)`

**Methods:**
- `public ch.qos.logback.classic.LoggerContext detachLoggerContext(java.lang.String p0)`
- `public java.util.List getContextNames()`
- `public int getCount()`
- `public ch.qos.logback.classic.LoggerContext getDefaultLoggerContext()`
- `public ch.qos.logback.classic.LoggerContext getLoggerContext()`
- `public ch.qos.logback.classic.LoggerContext getLoggerContext(java.lang.String p0)`
- `public void removeLocalContext()`
- `public void setLocalContext(ch.qos.logback.classic.LoggerContext p0)`

---

## public abstract interface `ch.qos.logback.classic.selector.ContextSelector`

**Methods:**
- `public abstract ch.qos.logback.classic.LoggerContext detachLoggerContext(java.lang.String p0)`
- `public abstract java.util.List getContextNames()`
- `public abstract ch.qos.logback.classic.LoggerContext getDefaultLoggerContext()`
- `public abstract ch.qos.logback.classic.LoggerContext getLoggerContext()`
- `public abstract ch.qos.logback.classic.LoggerContext getLoggerContext(java.lang.String p0)`

---

## public class `ch.qos.logback.classic.selector.DefaultContextSelector`
implements `ch.qos.logback.classic.selector.ContextSelector`  

**Constructors:**
- `public DefaultContextSelector(ch.qos.logback.classic.LoggerContext p0)`

**Methods:**
- `public ch.qos.logback.classic.LoggerContext detachLoggerContext(java.lang.String p0)`
- `public java.util.List getContextNames()`
- `public ch.qos.logback.classic.LoggerContext getDefaultLoggerContext()`
- `public ch.qos.logback.classic.LoggerContext getLoggerContext()`
- `public ch.qos.logback.classic.LoggerContext getLoggerContext(java.lang.String p0)`

---

## public class `ch.qos.logback.classic.selector.servlet.ContextDetachingSCL`
implements `jakarta.servlet.ServletContextListener`  

**Constructors:**
- `public ContextDetachingSCL()`

**Methods:**
- `public void contextDestroyed(jakarta.servlet.ServletContextEvent p0)`
- `public void contextInitialized(jakarta.servlet.ServletContextEvent p0)`

---

## public class `ch.qos.logback.classic.selector.servlet.LoggerContextFilter`
implements `jakarta.servlet.Filter`  

**Constructors:**
- `public LoggerContextFilter()`

**Methods:**
- `public void destroy()`
- `public void doFilter(jakarta.servlet.ServletRequest p0, jakarta.servlet.ServletResponse p1, jakarta.servlet.FilterChain p2) throws jakarta.servlet.ServletException, java.io.IOException`
- `public void init(jakarta.servlet.FilterConfig p0) throws jakarta.servlet.ServletException`

---

## public class `ch.qos.logback.classic.servlet.LogbackServletContainerInitializer`
implements `jakarta.servlet.ServletContainerInitializer`  

**Constructors:**
- `public LogbackServletContainerInitializer()`

**Methods:**
- `public void onStartup(java.util.Set p0, jakarta.servlet.ServletContext p1) throws jakarta.servlet.ServletException`

---

## public class `ch.qos.logback.classic.servlet.LogbackServletContextListener`
implements `jakarta.servlet.ServletContextListener`  

**Constructors:**
- `public LogbackServletContextListener()`

**Methods:**
- `public void contextDestroyed(jakarta.servlet.ServletContextEvent p0)`
- `public void contextInitialized(jakarta.servlet.ServletContextEvent p0)`

---

## public class `ch.qos.logback.classic.sift.ContextBasedDiscriminator`
extends `ch.qos.logback.core.sift.AbstractDiscriminator`  

**Constructors:**
- `public ContextBasedDiscriminator()`

**Methods:**
- `public java.lang.String getDefaultValue()`
- `public java.lang.String getDiscriminatingValue(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public java.lang.String getKey()`
- `public void setDefaultValue(java.lang.String p0)`
- `public void setKey(java.lang.String p0)`

---

## public class `ch.qos.logback.classic.sift.JNDIBasedContextDiscriminator`
extends `ch.qos.logback.core.sift.AbstractDiscriminator`  

**Constructors:**
- `public JNDIBasedContextDiscriminator()`

**Methods:**
- `public java.lang.String getDefaultValue()`
- `public java.lang.String getDiscriminatingValue(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public java.lang.String getKey()`
- `public void setDefaultValue(java.lang.String p0)`
- `public void setKey(java.lang.String p0)`

---

## public class `ch.qos.logback.classic.sift.MDCBasedDiscriminator`
extends `ch.qos.logback.core.sift.AbstractDiscriminator`  

**Constructors:**
- `public MDCBasedDiscriminator()`

**Methods:**
- `public java.lang.String getDefaultValue()`
- `public java.lang.String getDiscriminatingValue(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public java.lang.String getKey()`
- `public void setDefaultValue(java.lang.String p0)`
- `public void setKey(java.lang.String p0)`
- `public void start()`

---

## public class `ch.qos.logback.classic.sift.SiftingAppender`
extends `ch.qos.logback.core.sift.SiftingAppenderBase`  

**Constructors:**
- `public SiftingAppender()`

**Methods:**
- `protected boolean eventMarksEndOfLife(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `protected long getTimestamp(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public void setDiscriminator(ch.qos.logback.core.sift.Discriminator p0)`

---

## public class `ch.qos.logback.classic.spi.CallerData`

**Constructors:**
- `public CallerData()`

**Fields:**
- `public final static java.lang.String CALLER_DATA_NA`
- `public final static java.lang.StackTraceElement[] EMPTY_CALLER_DATA_ARRAY`
- `public final static int LINE_NA`

**Methods:**
- `public static java.lang.StackTraceElement[] extract(java.lang.Throwable p0, java.lang.String p1, int p2, java.util.List p3)`
- `public static java.lang.StackTraceElement naInstance()`

---

## public class `ch.qos.logback.classic.spi.ClassPackagingData`
implements `java.io.Serializable`  

**Constructors:**
- `public ClassPackagingData(java.lang.String p0, java.lang.String p1)`
- `public ClassPackagingData(java.lang.String p0, java.lang.String p1, boolean p2)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getCodeLocation()`
- `public java.lang.String getVersion()`
- `public int hashCode()`
- `public boolean isExact()`

---

## public abstract interface `ch.qos.logback.classic.spi.Configurator`
implements `ch.qos.logback.core.spi.ContextAware`  

**Methods:**
- `public abstract ch.qos.logback.classic.spi.Configurator$ExecutionStatus configure(ch.qos.logback.classic.LoggerContext p0)`

---

## public final static enum `ch.qos.logback.classic.spi.Configurator$ExecutionStatus`
extends `java.lang.Enum`  

**Fields:**
- `public final static ch.qos.logback.classic.spi.Configurator$ExecutionStatus DO_NOT_INVOKE_NEXT_IF_ANY`
- `public final static ch.qos.logback.classic.spi.Configurator$ExecutionStatus INVOKE_NEXT_IF_ANY`
- `public final static ch.qos.logback.classic.spi.Configurator$ExecutionStatus NEUTRAL`

---

## public class `ch.qos.logback.classic.spi.EventArgUtil`

**Constructors:**
- `public EventArgUtil()`

**Methods:**
- `public static java.lang.Object[] arrangeArguments(java.lang.Object[] p0)`
- `public final static java.lang.Throwable extractThrowable(java.lang.Object[] p0)`
- `public static boolean successfulExtraction(java.lang.Throwable p0)`
- `public static java.lang.Object[] trimmedCopy(java.lang.Object[] p0)`

---

## public abstract interface `ch.qos.logback.classic.spi.ILoggingEvent`
implements `ch.qos.logback.core.spi.DeferredProcessingAware`  

**Methods:**
- `public abstract java.lang.Object[] getArgumentArray()`
- `public abstract java.lang.StackTraceElement[] getCallerData()`
- `public abstract java.lang.String getFormattedMessage()`
- `public default java.time.Instant getInstant()`
- `public abstract java.util.List getKeyValuePairs()`
- `public abstract ch.qos.logback.classic.Level getLevel()`
- `public abstract ch.qos.logback.classic.spi.LoggerContextVO getLoggerContextVO()`
- `public abstract java.lang.String getLoggerName()`
- `public abstract java.util.Map getMDCPropertyMap()`
- `public default org.slf4j.Marker getMarker()`
- `public abstract java.util.List getMarkerList()`
- `public abstract java.util.Map getMdc()`
- `public abstract java.lang.String getMessage()`
- `public abstract int getNanoseconds()`
- `public abstract long getSequenceNumber()`
- `public abstract java.lang.String getThreadName()`
- `public abstract ch.qos.logback.classic.spi.IThrowableProxy getThrowableProxy()`
- `public abstract long getTimeStamp()`
- `public abstract boolean hasCallerData()`
- `public abstract void prepareForDeferredProcessing()`

---

## public abstract interface `ch.qos.logback.classic.spi.IThrowableProxy`

**Methods:**
- `public abstract ch.qos.logback.classic.spi.IThrowableProxy getCause()`
- `public abstract java.lang.String getClassName()`
- `public abstract int getCommonFrames()`
- `public abstract java.lang.String getMessage()`
- `public abstract ch.qos.logback.classic.spi.StackTraceElementProxy[] getStackTraceElementProxyArray()`
- `public abstract ch.qos.logback.classic.spi.IThrowableProxy[] getSuppressed()`
- `public abstract boolean isCyclic()`

---

## public class `ch.qos.logback.classic.spi.LogbackServiceProvider`
implements `org.slf4j.spi.SLF4JServiceProvider`  

**Constructors:**
- `public LogbackServiceProvider()`

**Fields:**
- `public static java.lang.String REQUESTED_API_VERSION`

**Methods:**
- `public org.slf4j.ILoggerFactory getLoggerFactory()`
- `public org.slf4j.spi.MDCAdapter getMDCAdapter()`
- `public org.slf4j.IMarkerFactory getMarkerFactory()`
- `public java.lang.String getRequestedApiVersion()`
- `public void initialize()`

---

## public class `ch.qos.logback.classic.spi.LoggerComparator`
implements `java.util.Comparator<ch.qos.logback.classic.Logger>`  

**Constructors:**
- `public LoggerComparator()`

**Methods:**
- `public int compare(ch.qos.logback.classic.Logger p0, ch.qos.logback.classic.Logger p1)`

---

## public abstract interface `ch.qos.logback.classic.spi.LoggerContextAware`
implements `ch.qos.logback.core.spi.ContextAware`  

**Methods:**
- `public abstract void setLoggerContext(ch.qos.logback.classic.LoggerContext p0)`

---

## public class `ch.qos.logback.classic.spi.LoggerContextAwareBase`
extends `ch.qos.logback.core.spi.ContextAwareBase`  
implements `ch.qos.logback.classic.spi.LoggerContextAware`  

**Constructors:**
- `public LoggerContextAwareBase()`

**Methods:**
- `public ch.qos.logback.classic.LoggerContext getLoggerContext()`
- `public void setContext(ch.qos.logback.core.Context p0)`
- `public void setLoggerContext(ch.qos.logback.classic.LoggerContext p0)`

---

## public abstract interface `ch.qos.logback.classic.spi.LoggerContextListener`

**Methods:**
- `public abstract boolean isResetResistant()`
- `public abstract void onLevelChange(ch.qos.logback.classic.Logger p0, ch.qos.logback.classic.Level p1)`
- `public abstract void onReset(ch.qos.logback.classic.LoggerContext p0)`
- `public abstract void onStart(ch.qos.logback.classic.LoggerContext p0)`
- `public abstract void onStop(ch.qos.logback.classic.LoggerContext p0)`

---

## public class `ch.qos.logback.classic.spi.LoggerContextVO`
implements `java.io.Serializable`  

**Constructors:**
- `public LoggerContextVO(ch.qos.logback.classic.LoggerContext p0)`
- `public LoggerContextVO(java.lang.String p0, java.util.Map p1, long p2)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public long getBirthTime()`
- `public java.lang.String getName()`
- `public java.util.Map getPropertyMap()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.classic.spi.LoggerRemoteView`
implements `java.io.Serializable`  

**Constructors:**
- `public LoggerRemoteView(java.lang.String p0, ch.qos.logback.classic.LoggerContext p1)`

**Methods:**
- `public ch.qos.logback.classic.spi.LoggerContextVO getLoggerContextView()`
- `public java.lang.String getName()`

---

## public class `ch.qos.logback.classic.spi.LoggingEvent`
implements `ch.qos.logback.classic.spi.ILoggingEvent`  

**Constructors:**
- `public LoggingEvent()`
- `public LoggingEvent(java.lang.String p0, ch.qos.logback.classic.Logger p1, ch.qos.logback.classic.Level p2, java.lang.String p3, java.lang.Throwable p4, java.lang.Object[] p5)`

**Methods:**
- `public void addKeyValuePair(org.slf4j.event.KeyValuePair p0)`
- `public void addMarker(org.slf4j.Marker p0)`
- `public java.lang.Object[] getArgumentArray()`
- `public java.lang.StackTraceElement[] getCallerData()`
- `public long getContextBirthTime()`
- `public java.lang.String getFormattedMessage()`
- `public java.time.Instant getInstant()`
- `public java.util.List getKeyValuePairs()`
- `public ch.qos.logback.classic.Level getLevel()`
- `public ch.qos.logback.classic.spi.LoggerContextVO getLoggerContextVO()`
- `public java.lang.String getLoggerName()`
- `public java.util.Map getMDCPropertyMap()`
- `public java.util.List getMarkerList()`
- `public java.util.Map getMdc()`
- `public java.lang.String getMessage()`
- `public int getNanoseconds()`
- `public long getSequenceNumber()`
- `public java.lang.String getThreadName()`
- `public ch.qos.logback.classic.spi.IThrowableProxy getThrowableProxy()`
- `public long getTimeStamp()`
- `public boolean hasCallerData()`
- `public void prepareForDeferredProcessing()`
- `public void setArgumentArray(java.lang.Object[] p0)`
- `public void setCallerData(java.lang.StackTraceElement[] p0)`
- `public void setInstant(java.time.Instant p0)`
- `public void setKeyValuePairs(java.util.List p0)`
- `public void setLevel(ch.qos.logback.classic.Level p0)`
- `public void setLoggerContext(ch.qos.logback.classic.LoggerContext p0)`
- `public void setLoggerContextRemoteView(ch.qos.logback.classic.spi.LoggerContextVO p0)`
- `public void setLoggerName(java.lang.String p0)`
- `public void setMDCPropertyMap(java.util.Map p0)`
- `public void setMessage(java.lang.String p0)`
- `public void setSquenceNumber(long p0)`
- `public void setThreadName(java.lang.String p0) throws java.lang.IllegalStateException`
- `public void setThrowableProxy(ch.qos.logback.classic.spi.ThrowableProxy p0)`
- `public void setTimeStamp(long p0)`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.classic.spi.LoggingEventVO`
implements `ch.qos.logback.classic.spi.ILoggingEvent`, `java.io.Serializable`  

**Constructors:**
- `public LoggingEventVO()`

**Methods:**
- `public static ch.qos.logback.classic.spi.LoggingEventVO build(ch.qos.logback.classic.spi.ILoggingEvent p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.Object[] getArgumentArray()`
- `public java.lang.StackTraceElement[] getCallerData()`
- `public long getContextBirthTime()`
- `public ch.qos.logback.classic.spi.LoggerContextVO getContextLoggerRemoteView()`
- `public java.lang.String getFormattedMessage()`
- `public java.util.List getKeyValuePairs()`
- `public ch.qos.logback.classic.Level getLevel()`
- `public ch.qos.logback.classic.spi.LoggerContextVO getLoggerContextVO()`
- `public java.lang.String getLoggerName()`
- `public java.util.Map getMDCPropertyMap()`
- `public java.util.List getMarkerList()`
- `public java.util.Map getMdc()`
- `public java.lang.String getMessage()`
- `public int getNanoseconds()`
- `public long getSequenceNumber()`
- `public java.lang.String getThreadName()`
- `public ch.qos.logback.classic.spi.IThrowableProxy getThrowableProxy()`
- `public long getTimeStamp()`
- `public boolean hasCallerData()`
- `public int hashCode()`
- `public void prepareForDeferredProcessing()`

---

## public class `ch.qos.logback.classic.spi.PackagingDataCalculator`

**Constructors:**
- `public PackagingDataCalculator()`

**Methods:**
- `public void calculate(ch.qos.logback.classic.spi.IThrowableProxy p0)`

---

## public class `ch.qos.logback.classic.spi.PlatformInfo`

**Constructors:**
- `public PlatformInfo()`

**Methods:**
- `public static boolean hasJMXObjectName()`

---

## public class `ch.qos.logback.classic.spi.STEUtil`

**Constructors:**
- `public STEUtil()`

---

## public class `ch.qos.logback.classic.spi.StackTraceElementProxy`
implements `java.io.Serializable`  

**Constructors:**
- `public StackTraceElementProxy(java.lang.StackTraceElement p0)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public ch.qos.logback.classic.spi.ClassPackagingData getClassPackagingData()`
- `public java.lang.String getSTEAsString()`
- `public java.lang.StackTraceElement getStackTraceElement()`
- `public int hashCode()`
- `public void setClassPackagingData(ch.qos.logback.classic.spi.ClassPackagingData p0)`
- `public java.lang.String toString()`

---

## public class `ch.qos.logback.classic.spi.ThrowableProxy`
implements `ch.qos.logback.classic.spi.IThrowableProxy`  

**Constructors:**
- `public ThrowableProxy(java.lang.Throwable p0)`
- `public ThrowableProxy(java.lang.Throwable p0, java.util.Set p1)`

**Methods:**
- `public void calculatePackagingData()`
- `public void fullDump()`
- `public ch.qos.logback.classic.spi.IThrowableProxy getCause()`
- `public java.lang.String getClassName()`
- `public int getCommonFrames()`
- `public java.lang.String getMessage()`
- `public ch.qos.logback.classic.spi.PackagingDataCalculator getPackagingDataCalculator()`
- `public ch.qos.logback.classic.spi.StackTraceElementProxy[] getStackTraceElementProxyArray()`
- `public ch.qos.logback.classic.spi.IThrowableProxy[] getSuppressed()`
- `public java.lang.Throwable getThrowable()`
- `public boolean isCyclic()`

---

## public class `ch.qos.logback.classic.spi.ThrowableProxyUtil`

**Constructors:**
- `public ThrowableProxyUtil()`

**Fields:**
- `public final static int REGULAR_EXCEPTION_INDENT`
- `public final static int SUPPRESSED_EXCEPTION_INDENT`

**Methods:**
- `public static java.lang.String asString(ch.qos.logback.classic.spi.IThrowableProxy p0)`
- `public static void build(ch.qos.logback.classic.spi.ThrowableProxy p0, java.lang.Throwable p1, ch.qos.logback.classic.spi.ThrowableProxy p2)`
- `public static void indent(java.lang.StringBuilder p0, int p1)`
- `public static void subjoinFirstLine(java.lang.StringBuilder p0, ch.qos.logback.classic.spi.IThrowableProxy p1)`
- `public static void subjoinFirstLineRootCauseFirst(java.lang.StringBuilder p0, ch.qos.logback.classic.spi.IThrowableProxy p1)`
- `public static void subjoinPackagingData(java.lang.StringBuilder p0, ch.qos.logback.classic.spi.StackTraceElementProxy p1)`
- `public static void subjoinSTEP(java.lang.StringBuilder p0, ch.qos.logback.classic.spi.StackTraceElementProxy p1)`
- `public static void subjoinSTEPArray(java.lang.StringBuilder p0, ch.qos.logback.classic.spi.IThrowableProxy p1)`
- `public static void subjoinSTEPArray(java.lang.StringBuilder p0, int p1, ch.qos.logback.classic.spi.IThrowableProxy p2)`

---

## public class `ch.qos.logback.classic.spi.ThrowableProxyVO`
implements `ch.qos.logback.classic.spi.IThrowableProxy`, `java.io.Serializable`  

**Constructors:**
- `public ThrowableProxyVO()`

**Methods:**
- `public static ch.qos.logback.classic.spi.ThrowableProxyVO build(ch.qos.logback.classic.spi.IThrowableProxy p0)`
- `public boolean equals(java.lang.Object p0)`
- `public ch.qos.logback.classic.spi.IThrowableProxy getCause()`
- `public java.lang.String getClassName()`
- `public int getCommonFrames()`
- `public java.lang.String getMessage()`
- `public ch.qos.logback.classic.spi.StackTraceElementProxy[] getStackTraceElementProxyArray()`
- `public ch.qos.logback.classic.spi.IThrowableProxy[] getSuppressed()`
- `public int hashCode()`
- `public boolean isCyclic()`

---

## public final class `ch.qos.logback.classic.spi.TurboFilterList`
extends `java.util.concurrent.CopyOnWriteArrayList`  

**Constructors:**
- `public TurboFilterList()`

**Methods:**
- `public ch.qos.logback.core.spi.FilterReply getTurboFilterChainDecision(org.slf4j.Marker p0, ch.qos.logback.classic.Logger p1, ch.qos.logback.classic.Level p2, java.lang.String p3, java.lang.Object[] p4, java.lang.Throwable p5)`

---

## public class `ch.qos.logback.classic.turbo.DuplicateMessageFilter`
extends `ch.qos.logback.classic.turbo.TurboFilter`  

**Constructors:**
- `public DuplicateMessageFilter()`

**Fields:**
- `public final static int DEFAULT_ALLOWED_REPETITIONS`
- `public final static int DEFAULT_CACHE_SIZE`
- `public int allowedRepetitions`
- `public int cacheSize`

**Methods:**
- `public ch.qos.logback.core.spi.FilterReply decide(org.slf4j.Marker p0, ch.qos.logback.classic.Logger p1, ch.qos.logback.classic.Level p2, java.lang.String p3, java.lang.Object[] p4, java.lang.Throwable p5)`
- `public int getAllowedRepetitions()`
- `public int getCacheSize()`
- `public void setAllowedRepetitions(int p0)`
- `public void setCacheSize(int p0)`
- `public void start()`
- `public void stop()`

---

## public class `ch.qos.logback.classic.turbo.DynamicThresholdFilter`
extends `ch.qos.logback.classic.turbo.TurboFilter`  

**Constructors:**
- `public DynamicThresholdFilter()`

**Methods:**
- `public void addMDCValueLevelPair(ch.qos.logback.classic.turbo.MDCValueLevelPair p0)`
- `public ch.qos.logback.core.spi.FilterReply decide(org.slf4j.Marker p0, ch.qos.logback.classic.Logger p1, ch.qos.logback.classic.Level p2, java.lang.String p3, java.lang.Object[] p4, java.lang.Throwable p5)`
- `public ch.qos.logback.classic.Level getDefaultThreshold()`
- `public java.lang.String getKey()`
- `public ch.qos.logback.core.spi.FilterReply getOnHigherOrEqual()`
- `public ch.qos.logback.core.spi.FilterReply getOnLower()`
- `public void setDefaultThreshold(ch.qos.logback.classic.Level p0)`
- `public void setKey(java.lang.String p0)`
- `public void setOnHigherOrEqual(ch.qos.logback.core.spi.FilterReply p0)`
- `public void setOnLower(ch.qos.logback.core.spi.FilterReply p0)`
- `public void start()`

---

## public class `ch.qos.logback.classic.turbo.MDCFilter`
extends `ch.qos.logback.classic.turbo.MatchingFilter`  

**Constructors:**
- `public MDCFilter()`

**Methods:**
- `public ch.qos.logback.core.spi.FilterReply decide(org.slf4j.Marker p0, ch.qos.logback.classic.Logger p1, ch.qos.logback.classic.Level p2, java.lang.String p3, java.lang.Object[] p4, java.lang.Throwable p5)`
- `public void setMDCKey(java.lang.String p0)`
- `public void setValue(java.lang.String p0)`
- `public void start()`

---

## public class `ch.qos.logback.classic.turbo.MDCValueLevelPair`

**Constructors:**
- `public MDCValueLevelPair()`

**Methods:**
- `public ch.qos.logback.classic.Level getLevel()`
- `public java.lang.String getValue()`
- `public void setLevel(ch.qos.logback.classic.Level p0)`
- `public void setValue(java.lang.String p0)`

---

## public class `ch.qos.logback.classic.turbo.MarkerFilter`
extends `ch.qos.logback.classic.turbo.MatchingFilter`  

**Constructors:**
- `public MarkerFilter()`

**Methods:**
- `public ch.qos.logback.core.spi.FilterReply decide(org.slf4j.Marker p0, ch.qos.logback.classic.Logger p1, ch.qos.logback.classic.Level p2, java.lang.String p3, java.lang.Object[] p4, java.lang.Throwable p5)`
- `public void setMarker(java.lang.String p0)`
- `public void start()`

---

## public abstract class `ch.qos.logback.classic.turbo.MatchingFilter`
extends `ch.qos.logback.classic.turbo.TurboFilter`  

**Constructors:**
- `public MatchingFilter()`

**Fields:**
- `protected ch.qos.logback.core.spi.FilterReply onMatch`
- `protected ch.qos.logback.core.spi.FilterReply onMismatch`

**Methods:**
- `public final void setOnMatch(java.lang.String p0)`
- `public final void setOnMismatch(java.lang.String p0)`

---

## public class `ch.qos.logback.classic.turbo.ReconfigureOnChangeFilter`
extends `ch.qos.logback.classic.turbo.TurboFilter`  

**Constructors:**
- `public ReconfigureOnChangeFilter()`

**Fields:**
- `public final static long DEFAULT_REFRESH_PERIOD`
- `protected volatile long nextCheck`

**Methods:**
- `protected boolean changeDetected(long p0)`
- `public ch.qos.logback.core.spi.FilterReply decide(org.slf4j.Marker p0, ch.qos.logback.classic.Logger p1, ch.qos.logback.classic.Level p2, java.lang.String p3, java.lang.Object[] p4, java.lang.Throwable p5)`
- `public long getRefreshPeriod()`
- `public void setRefreshPeriod(long p0)`
- `public void start()`
- `public java.lang.String toString()`

---

## public abstract class `ch.qos.logback.classic.turbo.TurboFilter`
extends `ch.qos.logback.core.spi.ContextAwareBase`  
implements `ch.qos.logback.core.spi.LifeCycle`  

**Constructors:**
- `public TurboFilter()`

**Methods:**
- `public abstract ch.qos.logback.core.spi.FilterReply decide(org.slf4j.Marker p0, ch.qos.logback.classic.Logger p1, ch.qos.logback.classic.Level p2, java.lang.String p3, java.lang.Object[] p4, java.lang.Throwable p5)`
- `public java.lang.String getName()`
- `public boolean isStarted()`
- `public void setName(java.lang.String p0)`
- `public void start()`
- `public void stop()`

---

## public class `ch.qos.logback.classic.util.ClassicEnvUtil`

**Constructors:**
- `public ClassicEnvUtil()`

**Methods:**
- `public static boolean isGroovyAvailable()`
- `public static <T extends java.lang.Object> java.util.List loadFromServiceLoader(java.lang.Class p0, java.lang.ClassLoader p1)`

---

## public class `ch.qos.logback.classic.util.ContextInitializer`

**Constructors:**
- `public ContextInitializer(ch.qos.logback.classic.LoggerContext p0)`

**Fields:**
- `public final static java.lang.String AUTOCONFIG_FILE`
- `public final static java.lang.String CONFIG_FILE_PROPERTY`
- `public final static java.lang.String TEST_AUTOCONFIG_FILE`

**Methods:**
- `public void autoConfig() throws ch.qos.logback.core.joran.spi.JoranException`
- `public void autoConfig(java.lang.ClassLoader p0) throws ch.qos.logback.core.joran.spi.JoranException`
- `public void configureByResource(java.net.URL p0) throws ch.qos.logback.core.joran.spi.JoranException`

---

## public class `ch.qos.logback.classic.util.ContextSelectorStaticBinder`

**Constructors:**
- `public ContextSelectorStaticBinder()`

**Methods:**
- `public ch.qos.logback.classic.selector.ContextSelector getContextSelector()`
- `public static ch.qos.logback.classic.util.ContextSelectorStaticBinder getSingleton()`
- `public void init(ch.qos.logback.classic.LoggerContext p0, java.lang.Object p1) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException`

---

## public class `ch.qos.logback.classic.util.CopyOnInheritThreadLocal`
extends `java.lang.InheritableThreadLocal`  

**Constructors:**
- `public CopyOnInheritThreadLocal()`

**Methods:**
- `protected java.util.HashMap childValue(java.util.HashMap p0)`

---

## public class `ch.qos.logback.classic.util.DefaultJoranConfigurator`
extends `ch.qos.logback.core.spi.ContextAwareBase`  
implements `ch.qos.logback.classic.spi.Configurator`  

**Constructors:**
- `public DefaultJoranConfigurator()`

**Fields:**
- `public final static java.lang.String AUTOCONFIG_FILE`
- `public final static java.lang.String TEST_AUTOCONFIG_FILE`

**Methods:**
- `public ch.qos.logback.classic.spi.Configurator$ExecutionStatus configure(ch.qos.logback.classic.LoggerContext p0)`
- `public void configureByResource(java.net.URL p0) throws ch.qos.logback.core.joran.spi.JoranException`
- `public java.net.URL findURLOfDefaultConfigurationFile(boolean p0)`

---

## public class `ch.qos.logback.classic.util.LevelToSyslogSeverity`

**Constructors:**
- `public LevelToSyslogSeverity()`

**Methods:**
- `public static int convert(ch.qos.logback.classic.spi.ILoggingEvent p0)`

---

## public class `ch.qos.logback.classic.util.LogbackMDCAdapter`
implements `org.slf4j.spi.MDCAdapter`  

**Constructors:**
- `public LogbackMDCAdapter()`

**Methods:**
- `public void clear()`
- `public void clearDequeByKey(java.lang.String p0)`
- `public java.lang.String get(java.lang.String p0)`
- `public java.util.Map getCopyOfContextMap()`
- `public java.util.Deque getCopyOfDequeByKey(java.lang.String p0)`
- `public java.util.Set getKeys()`
- `public java.util.Map getPropertyMap()`
- `public java.lang.String popByKey(java.lang.String p0)`
- `public void pushByKey(java.lang.String p0, java.lang.String p1)`
- `public void put(java.lang.String p0, java.lang.String p1) throws java.lang.IllegalArgumentException`
- `public void remove(java.lang.String p0)`
- `public void setContextMap(java.util.Map p0)`

---

## public class `ch.qos.logback.classic.util.LoggerNameUtil`

**Constructors:**
- `public LoggerNameUtil()`

**Methods:**
- `public static java.util.List computeNameParts(java.lang.String p0)`
- `public static int getFirstSeparatorIndexOf(java.lang.String p0)`
- `public static int getSeparatorIndexOf(java.lang.String p0, int p1)`

---

## public class `ch.qos.logback.classic.util.StatusViaSLF4JLoggerFactory`

**Constructors:**
- `public StatusViaSLF4JLoggerFactory()`

**Methods:**
- `public static void addError(java.lang.String p0, java.lang.Object p1)`
- `public static void addError(java.lang.String p0, java.lang.Object p1, java.lang.Throwable p2)`
- `public static void addInfo(java.lang.String p0, java.lang.Object p1)`
- `public static void addStatus(ch.qos.logback.core.status.Status p0)`

---

