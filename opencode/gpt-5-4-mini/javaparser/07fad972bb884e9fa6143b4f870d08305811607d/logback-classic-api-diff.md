# Breaking Changes: ch.qos.logback:logback-classic 1.2.11 → 1.4.1
Total: 82 (binary-breaking: 71, source-breaking: 80)

## ch.qos.logback.classic.BasicConfigurator

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `ch.qos.logback.classic.BasicConfigurator.configure(ch.qos.logback.classic.LoggerContext)`
+ NEW RETURN TYPE: `ch.qos.logback.classic.BasicConfigurator.configure(ch.qos.logback.classic.LoggerContext)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `ch.qos.logback.classic.BasicConfigurator.configure(ch.qos.logback.classic.LoggerContext)`
+ NEW RETURN TYPE: `ch.qos.logback.classic.BasicConfigurator.configure(ch.qos.logback.classic.LoggerContext)`

## ch.qos.logback.classic.ViewStatusMessagesServlet

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.ViewStatusMessagesServlet.getPageTitle(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.ViewStatusMessagesServlet.getStatusManager(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

## ch.qos.logback.classic.boolex.JaninoEventEvaluator

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `ch.qos.logback.classic.boolex.JaninoEventEvaluator.DEFAULT_PARAM_TYPE_LIST`
+ NEW FIELD: `ch.qos.logback.classic.boolex.JaninoEventEvaluator.DEFAULT_PARAM_TYPE_LIST`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `ch.qos.logback.classic.boolex.JaninoEventEvaluator.getParameterTypes()`
+ NEW RETURN TYPE: `ch.qos.logback.classic.boolex.JaninoEventEvaluator.getParameterTypes()`

## ch.qos.logback.classic.db.names.ColumnName

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.classic.db.names.ColumnName`

## ch.qos.logback.classic.db.names.DBNameResolver

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.classic.db.names.DBNameResolver`

## ch.qos.logback.classic.db.names.DefaultDBNameResolver

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.classic.db.names.DefaultDBNameResolver`

## ch.qos.logback.classic.db.names.SimpleDBNameResolver

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.classic.db.names.SimpleDBNameResolver`

## ch.qos.logback.classic.db.names.TableName

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.classic.db.names.TableName`

## ch.qos.logback.classic.helpers.MDCInsertingServletFilter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.helpers.MDCInsertingServletFilter.doFilter(javax.servlet.ServletRequest,javax.servlet.ServletResponse,javax.servlet.FilterChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.helpers.MDCInsertingServletFilter.init(javax.servlet.FilterConfig)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `ch.qos.logback.classic.helpers.MDCInsertingServletFilter`

## ch.qos.logback.classic.html.HTMLLayout

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `ch.qos.logback.classic.html.HTMLLayout.computeConverterName(ch.qos.logback.core.pattern.Converter)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `ch.qos.logback.classic.html.HTMLLayout.getThrowableRenderer()`
+ NEW RETURN TYPE: `ch.qos.logback.classic.html.HTMLLayout.getThrowableRenderer()`

## ch.qos.logback.classic.jmx.JMXConfigurator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.classic.jmx.JMXConfigurator`

## ch.qos.logback.classic.jmx.JMXConfiguratorMBean

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.classic.jmx.JMXConfiguratorMBean`

## ch.qos.logback.classic.jmx.MBeanUtil

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.classic.jmx.MBeanUtil`

## ch.qos.logback.classic.joran.JoranConfigurator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.joran.JoranConfigurator.addInstanceRules(ch.qos.logback.core.joran.spi.RuleStore)`

## ch.qos.logback.classic.joran.action.ConfigurationAction

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.joran.action.ConfigurationAction.begin(ch.qos.logback.core.joran.spi.InterpretationContext,java.lang.String,org.xml.sax.Attributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.joran.action.ConfigurationAction.end(ch.qos.logback.core.joran.spi.InterpretationContext,java.lang.String)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `ch.qos.logback.classic.joran.action.ConfigurationAction`

## ch.qos.logback.classic.joran.action.ConsolePluginAction

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.joran.action.ConsolePluginAction.begin(ch.qos.logback.core.joran.spi.InterpretationContext,java.lang.String,org.xml.sax.Attributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.joran.action.ConsolePluginAction.end(ch.qos.logback.core.joran.spi.InterpretationContext,java.lang.String)`

## ch.qos.logback.classic.joran.action.ContextNameAction

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.joran.action.ContextNameAction.begin(ch.qos.logback.core.joran.spi.InterpretationContext,java.lang.String,org.xml.sax.Attributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.joran.action.ContextNameAction.body(ch.qos.logback.core.joran.spi.InterpretationContext,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.joran.action.ContextNameAction.end(ch.qos.logback.core.joran.spi.InterpretationContext,java.lang.String)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `ch.qos.logback.classic.joran.action.ContextNameAction`

## ch.qos.logback.classic.joran.action.EvaluatorAction

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.classic.joran.action.EvaluatorAction`

## ch.qos.logback.classic.joran.action.InsertFromJNDIAction

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.joran.action.InsertFromJNDIAction.begin(ch.qos.logback.core.joran.spi.InterpretationContext,java.lang.String,org.xml.sax.Attributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.joran.action.InsertFromJNDIAction.end(ch.qos.logback.core.joran.spi.InterpretationContext,java.lang.String)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `ch.qos.logback.classic.joran.action.InsertFromJNDIAction`

## ch.qos.logback.classic.joran.action.JMXConfiguratorAction

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.classic.joran.action.JMXConfiguratorAction`

## ch.qos.logback.classic.joran.action.LevelAction

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.joran.action.LevelAction.begin(ch.qos.logback.core.joran.spi.InterpretationContext,java.lang.String,org.xml.sax.Attributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.joran.action.LevelAction.end(ch.qos.logback.core.joran.spi.InterpretationContext,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.joran.action.LevelAction.finish(ch.qos.logback.core.joran.spi.InterpretationContext)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `ch.qos.logback.classic.joran.action.LevelAction`

## ch.qos.logback.classic.joran.action.LoggerAction

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `ch.qos.logback.classic.joran.action.LoggerAction.LEVEL_ATTRIBUTE`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.joran.action.LoggerAction.begin(ch.qos.logback.core.joran.spi.InterpretationContext,java.lang.String,org.xml.sax.Attributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.joran.action.LoggerAction.end(ch.qos.logback.core.joran.spi.InterpretationContext,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.joran.action.LoggerAction.finish(ch.qos.logback.core.joran.spi.InterpretationContext)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `ch.qos.logback.classic.joran.action.LoggerAction`

## ch.qos.logback.classic.joran.action.LoggerContextListenerAction

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.joran.action.LoggerContextListenerAction.begin(ch.qos.logback.core.joran.spi.InterpretationContext,java.lang.String,org.xml.sax.Attributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.joran.action.LoggerContextListenerAction.end(ch.qos.logback.core.joran.spi.InterpretationContext,java.lang.String)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `ch.qos.logback.classic.joran.action.LoggerContextListenerAction`

## ch.qos.logback.classic.joran.action.ReceiverAction

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.joran.action.ReceiverAction.begin(ch.qos.logback.core.joran.spi.InterpretationContext,java.lang.String,org.xml.sax.Attributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.joran.action.ReceiverAction.end(ch.qos.logback.core.joran.spi.InterpretationContext,java.lang.String)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `ch.qos.logback.classic.joran.action.ReceiverAction`

## ch.qos.logback.classic.joran.action.RootLoggerAction

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.joran.action.RootLoggerAction.begin(ch.qos.logback.core.joran.spi.InterpretationContext,java.lang.String,org.xml.sax.Attributes)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.joran.action.RootLoggerAction.end(ch.qos.logback.core.joran.spi.InterpretationContext,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.joran.action.RootLoggerAction.finish(ch.qos.logback.core.joran.spi.InterpretationContext)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `ch.qos.logback.classic.joran.action.RootLoggerAction`

## ch.qos.logback.classic.selector.servlet.ContextDetachingSCL

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.selector.servlet.ContextDetachingSCL.contextDestroyed(javax.servlet.ServletContextEvent)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.selector.servlet.ContextDetachingSCL.contextInitialized(javax.servlet.ServletContextEvent)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `ch.qos.logback.classic.selector.servlet.ContextDetachingSCL`

## ch.qos.logback.classic.selector.servlet.LoggerContextFilter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.selector.servlet.LoggerContextFilter.doFilter(javax.servlet.ServletRequest,javax.servlet.ServletResponse,javax.servlet.FilterChain)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.selector.servlet.LoggerContextFilter.init(javax.servlet.FilterConfig)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `ch.qos.logback.classic.selector.servlet.LoggerContextFilter`

## ch.qos.logback.classic.servlet.LogbackServletContainerInitializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.servlet.LogbackServletContainerInitializer.onStartup(java.util.Set<java.lang.Class<? extends java.lang.Object>>,javax.servlet.ServletContext)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `ch.qos.logback.classic.servlet.LogbackServletContainerInitializer`

## ch.qos.logback.classic.servlet.LogbackServletContextListener

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.servlet.LogbackServletContextListener.contextDestroyed(javax.servlet.ServletContextEvent)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.servlet.LogbackServletContextListener.contextInitialized(javax.servlet.ServletContextEvent)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `ch.qos.logback.classic.servlet.LogbackServletContextListener`

## ch.qos.logback.classic.sift.AppenderFactoryUsingJoran

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.classic.sift.AppenderFactoryUsingJoran`

## ch.qos.logback.classic.sift.SiftAction

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.classic.sift.SiftAction`

## ch.qos.logback.classic.sift.SiftingJoranConfigurator

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.classic.sift.SiftingJoranConfigurator`

## ch.qos.logback.classic.spi.CallerData

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `ch.qos.logback.classic.spi.CallerData.NA`

## ch.qos.logback.classic.spi.Configurator

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `ch.qos.logback.classic.spi.Configurator.configure(ch.qos.logback.classic.LoggerContext)`
+ NEW RETURN TYPE: `ch.qos.logback.classic.spi.Configurator.configure(ch.qos.logback.classic.LoggerContext)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `ch.qos.logback.classic.spi.Configurator.configure(ch.qos.logback.classic.LoggerContext)`
+ NEW RETURN TYPE: `ch.qos.logback.classic.spi.Configurator.configure(ch.qos.logback.classic.LoggerContext)`

## ch.qos.logback.classic.spi.ILoggingEvent

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `ch.qos.logback.classic.spi.ILoggingEvent`
+ MUST NOW IMPLEMENT: `ch.qos.logback.classic.spi.ILoggingEvent.getNanoseconds()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `ch.qos.logback.classic.spi.ILoggingEvent`
+ MUST NOW IMPLEMENT: `ch.qos.logback.classic.spi.ILoggingEvent.getKeyValuePairs()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `ch.qos.logback.classic.spi.ILoggingEvent`
+ MUST NOW IMPLEMENT: `ch.qos.logback.classic.spi.ILoggingEvent.getSequenceNumber()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `ch.qos.logback.classic.spi.ILoggingEvent`
+ MUST NOW IMPLEMENT: `ch.qos.logback.classic.spi.ILoggingEvent.getMarkerList()`

## ch.qos.logback.classic.spi.IThrowableProxy

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `ch.qos.logback.classic.spi.IThrowableProxy`
+ MUST NOW IMPLEMENT: `ch.qos.logback.classic.spi.IThrowableProxy.isCyclic()`

## ch.qos.logback.classic.spi.LoggingEvent

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.spi.LoggingEvent.setMarker(org.slf4j.Marker)`

## ch.qos.logback.classic.util.ContextInitializer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `ch.qos.logback.classic.util.ContextInitializer.findURLOfDefaultConfigurationFile(boolean)`

## ch.qos.logback.classic.util.DefaultNestedComponentRules

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.classic.util.DefaultNestedComponentRules`

## ch.qos.logback.classic.util.EnvUtil

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `ch.qos.logback.classic.util.EnvUtil`

## org.slf4j.impl.StaticLoggerBinder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.slf4j.impl.StaticLoggerBinder`

## org.slf4j.impl.StaticMDCBinder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.slf4j.impl.StaticMDCBinder`

## org.slf4j.impl.StaticMarkerBinder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.slf4j.impl.StaticMarkerBinder`

