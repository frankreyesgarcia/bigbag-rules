# API Specification: org.apache.struts:struts2-core 2.5.26

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public abstract interface `com.opensymphony.xwork2.Action`

**Fields:**
- `public final static java.lang.String ERROR`
- `public final static java.lang.String INPUT`
- `public final static java.lang.String LOGIN`
- `public final static java.lang.String NONE`
- `public final static java.lang.String SUCCESS`

**Methods:**
- `public abstract java.lang.String execute() throws java.lang.Exception`

---

## public class `com.opensymphony.xwork2.ActionChainResult`
implements `com.opensymphony.xwork2.Result`  

**Constructors:**
- `public ActionChainResult()`
- `public ActionChainResult(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public ActionChainResult(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3)`

**Fields:**
- `public final static java.lang.String DEFAULT_PARAM`
- `public final static java.lang.String SKIP_ACTIONS_PARAM`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public void execute(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `public static java.util.LinkedList getChainHistory()`
- `public com.opensymphony.xwork2.ActionProxy getProxy()`
- `public int hashCode()`
- `public void setActionName(java.lang.String p0)`
- `public void setActionProxyFactory(com.opensymphony.xwork2.ActionProxyFactory p0)`
- `public void setMethod(java.lang.String p0)`
- `public void setNamespace(java.lang.String p0)`
- `public void setSkipActions(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.ActionContext`
implements `java.io.Serializable`  

**Constructors:**
- `public ActionContext(java.util.Map p0)`

**Fields:**
- `public final static java.lang.String ACTION_INVOCATION`
- `public final static java.lang.String ACTION_NAME`
- `public final static java.lang.String APPLICATION`
- `public final static java.lang.String CONTAINER`
- `public final static java.lang.String CONVERSION_ERRORS`
- `public final static java.lang.String LOCALE`
- `public final static java.lang.String PARAMETERS`
- `public final static java.lang.String SESSION`
- `public final static java.lang.String TYPE_CONVERTER`
- `public final static java.lang.String VALUE_STACK`

**Methods:**
- `public java.lang.Object get(java.lang.String p0)`
- `public com.opensymphony.xwork2.ActionInvocation getActionInvocation()`
- `public java.util.Map getApplication()`
- `public com.opensymphony.xwork2.inject.Container getContainer()`
- `public static com.opensymphony.xwork2.ActionContext getContext()`
- `public java.util.Map getContextMap()`
- `public java.util.Map getConversionErrors()`
- `public <T extends java.lang.Object> T getInstance(java.lang.Class p0)`
- `public java.util.Locale getLocale()`
- `public java.lang.String getName()`
- `public org.apache.struts2.dispatcher.HttpParameters getParameters()`
- `public java.util.Map getSession()`
- `public com.opensymphony.xwork2.util.ValueStack getValueStack()`
- `public void put(java.lang.String p0, java.lang.Object p1)`
- `public void setActionInvocation(com.opensymphony.xwork2.ActionInvocation p0)`
- `public void setApplication(java.util.Map p0)`
- `public void setContainer(com.opensymphony.xwork2.inject.Container p0)`
- `public static void setContext(com.opensymphony.xwork2.ActionContext p0)`
- `public void setContextMap(java.util.Map p0)`
- `public void setConversionErrors(java.util.Map p0)`
- `public void setLocale(java.util.Locale p0)`
- `public void setName(java.lang.String p0)`
- `public void setParameters(org.apache.struts2.dispatcher.HttpParameters p0)`
- `public void setSession(java.util.Map p0)`
- `public void setValueStack(com.opensymphony.xwork2.util.ValueStack p0)`

---

## public abstract interface `com.opensymphony.xwork2.ActionEventListener`

**Methods:**
- `public abstract java.lang.String handleException(java.lang.Throwable p0, com.opensymphony.xwork2.util.ValueStack p1)`
- `public abstract java.lang.Object prepare(java.lang.Object p0, com.opensymphony.xwork2.util.ValueStack p1)`

---

## public abstract interface `com.opensymphony.xwork2.ActionInvocation`

**Methods:**
- `public abstract void addPreResultListener(com.opensymphony.xwork2.interceptor.PreResultListener p0)`
- `public abstract java.lang.Object getAction()`
- `public abstract com.opensymphony.xwork2.ActionContext getInvocationContext()`
- `public abstract com.opensymphony.xwork2.ActionProxy getProxy()`
- `public abstract com.opensymphony.xwork2.Result getResult() throws java.lang.Exception`
- `public abstract java.lang.String getResultCode()`
- `public abstract com.opensymphony.xwork2.util.ValueStack getStack()`
- `public abstract void init(com.opensymphony.xwork2.ActionProxy p0)`
- `public abstract java.lang.String invoke() throws java.lang.Exception`
- `public abstract java.lang.String invokeActionOnly() throws java.lang.Exception`
- `public abstract boolean isExecuted()`
- `public abstract void setActionEventListener(com.opensymphony.xwork2.ActionEventListener p0)`
- `public abstract void setResultCode(java.lang.String p0)`

---

## public abstract interface `com.opensymphony.xwork2.ActionProxy`

**Methods:**
- `public abstract java.lang.String execute() throws java.lang.Exception`
- `public abstract java.lang.Object getAction()`
- `public abstract java.lang.String getActionName()`
- `public abstract com.opensymphony.xwork2.config.entities.ActionConfig getConfig()`
- `public abstract boolean getExecuteResult()`
- `public abstract com.opensymphony.xwork2.ActionInvocation getInvocation()`
- `public abstract java.lang.String getMethod()`
- `public abstract java.lang.String getNamespace()`
- `public abstract boolean isMethodSpecified()`
- `public abstract void setExecuteResult(boolean p0)`

---

## public abstract interface `com.opensymphony.xwork2.ActionProxyFactory`

**Methods:**
- `public abstract com.opensymphony.xwork2.ActionProxy createActionProxy(com.opensymphony.xwork2.ActionInvocation p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4, boolean p5)`
- `public abstract com.opensymphony.xwork2.ActionProxy createActionProxy(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.Map p3)`
- `public abstract com.opensymphony.xwork2.ActionProxy createActionProxy(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.Map p3, boolean p4, boolean p5)`

---

## public class `com.opensymphony.xwork2.ActionSupport`
implements `com.opensymphony.xwork2.Action`, `com.opensymphony.xwork2.LocaleProvider`, `com.opensymphony.xwork2.TextProvider`, `com.opensymphony.xwork2.Validateable`, `com.opensymphony.xwork2.interceptor.ValidationAware`, `java.io.Serializable`  

**Constructors:**
- `public ActionSupport()`

**Fields:**
- `protected com.opensymphony.xwork2.inject.Container container`

**Methods:**
- `public void addActionError(java.lang.String p0)`
- `public void addActionMessage(java.lang.String p0)`
- `public void addFieldError(java.lang.String p0, java.lang.String p1)`
- `public void clearActionErrors()`
- `public void clearErrors()`
- `public void clearErrorsAndMessages()`
- `public void clearFieldErrors()`
- `public void clearMessages()`
- `public java.lang.Object clone() throws java.lang.CloneNotSupportedException`
- `public java.lang.String execute() throws java.lang.Exception`
- `public java.util.Collection getActionErrors()`
- `public java.util.Collection getActionMessages()`
- `protected com.opensymphony.xwork2.inject.Container getContainer()`
- `public java.util.Map getFieldErrors()`
- `public java.lang.String getFormatted(java.lang.String p0, java.lang.String p1)`
- `public java.util.Locale getLocale()`
- `protected com.opensymphony.xwork2.LocaleProvider getLocaleProvider()`
- `public java.lang.String getText(java.lang.String p0)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1, java.lang.String[] p2)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1, java.lang.String[] p2, com.opensymphony.xwork2.util.ValueStack p3)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1, java.util.List p2)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1, java.util.List p2, com.opensymphony.xwork2.util.ValueStack p3)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String[] p1)`
- `public java.lang.String getText(java.lang.String p0, java.util.List p1)`
- `protected com.opensymphony.xwork2.TextProvider getTextProvider()`
- `public java.util.ResourceBundle getTexts()`
- `public java.util.ResourceBundle getTexts(java.lang.String p0)`
- `public boolean hasActionErrors()`
- `public boolean hasActionMessages()`
- `public boolean hasErrors()`
- `public boolean hasFieldErrors()`
- `public boolean hasKey(java.lang.String p0)`
- `public java.lang.String input() throws java.lang.Exception`
- `public boolean isValidLocale(java.util.Locale p0)`
- `public boolean isValidLocaleString(java.lang.String p0)`
- `public void pause(java.lang.String p0)`
- `public void setActionErrors(java.util.Collection p0)`
- `public void setActionMessages(java.util.Collection p0)`
- `public void setContainer(com.opensymphony.xwork2.inject.Container p0)`
- `public void setFieldErrors(java.util.Map p0)`
- `public void validate()`

---

## public class `com.opensymphony.xwork2.CompositeTextProvider`
implements `com.opensymphony.xwork2.TextProvider`  

**Constructors:**
- `public CompositeTextProvider(com.opensymphony.xwork2.TextProvider[] p0)`
- `public CompositeTextProvider(java.util.List p0)`

**Methods:**
- `public java.lang.String getText(java.lang.String p0)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1, java.lang.String[] p2)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1, java.lang.String[] p2, com.opensymphony.xwork2.util.ValueStack p3)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1, java.util.List p2)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1, java.util.List p2, com.opensymphony.xwork2.util.ValueStack p3)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String[] p1)`
- `public java.lang.String getText(java.lang.String p0, java.util.List p1)`
- `public java.util.ResourceBundle getTexts()`
- `public java.util.ResourceBundle getTexts(java.lang.String p0)`
- `public boolean hasKey(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.DefaultActionInvocation`
implements `com.opensymphony.xwork2.ActionInvocation`  

**Constructors:**
- `public DefaultActionInvocation(java.util.Map p0, boolean p1)`

**Fields:**
- `protected java.lang.Object action`
- `protected com.opensymphony.xwork2.ActionEventListener actionEventListener`
- `protected com.opensymphony.xwork2.inject.Container container`
- `protected boolean executed`
- `protected com.opensymphony.xwork2.Result explicitResult`
- `protected java.util.Map extraContext`
- `protected java.util.Iterator interceptors`
- `protected com.opensymphony.xwork2.ActionContext invocationContext`
- `protected com.opensymphony.xwork2.interceptor.WithLazyParams$LazyParamInjector lazyParamInjector`
- `protected com.opensymphony.xwork2.ObjectFactory objectFactory`
- `protected com.opensymphony.xwork2.ognl.OgnlUtil ognlUtil`
- `protected java.util.List preResultListeners`
- `protected com.opensymphony.xwork2.ActionProxy proxy`
- `protected boolean pushAction`
- `protected com.opensymphony.xwork2.Result result`
- `protected java.lang.String resultCode`
- `protected com.opensymphony.xwork2.util.ValueStack stack`
- `protected com.opensymphony.xwork2.UnknownHandlerManager unknownHandlerManager`
- `protected com.opensymphony.xwork2.util.ValueStackFactory valueStackFactory`

**Methods:**
- `public void addPreResultListener(com.opensymphony.xwork2.interceptor.PreResultListener p0)`
- `protected void createAction(java.util.Map p0)`
- `protected java.util.Map createContextMap()`
- `protected void createInterceptors(com.opensymphony.xwork2.ActionProxy p0)`
- `public com.opensymphony.xwork2.Result createResult() throws java.lang.Exception`
- `public java.lang.Object getAction()`
- `public com.opensymphony.xwork2.ActionContext getInvocationContext()`
- `public com.opensymphony.xwork2.ActionProxy getProxy()`
- `public com.opensymphony.xwork2.Result getResult() throws java.lang.Exception`
- `public java.lang.String getResultCode()`
- `public com.opensymphony.xwork2.util.ValueStack getStack()`
- `public void init(com.opensymphony.xwork2.ActionProxy p0)`
- `public java.lang.String invoke() throws java.lang.Exception`
- `protected java.lang.String invokeAction(java.lang.Object p0, com.opensymphony.xwork2.config.entities.ActionConfig p1) throws java.lang.Exception`
- `public java.lang.String invokeActionOnly() throws java.lang.Exception`
- `public boolean isExecuted()`
- `protected void prepareLazyParamInjector(com.opensymphony.xwork2.util.ValueStack p0)`
- `protected java.lang.String saveResult(com.opensymphony.xwork2.config.entities.ActionConfig p0, java.lang.Object p1)`
- `public void setActionEventListener(com.opensymphony.xwork2.ActionEventListener p0)`
- `public void setContainer(com.opensymphony.xwork2.inject.Container p0)`
- `public void setObjectFactory(com.opensymphony.xwork2.ObjectFactory p0)`
- `public void setOgnlUtil(com.opensymphony.xwork2.ognl.OgnlUtil p0)`
- `public void setResultCode(java.lang.String p0)`
- `public void setUnknownHandlerManager(com.opensymphony.xwork2.UnknownHandlerManager p0)`
- `public void setValueStackFactory(com.opensymphony.xwork2.util.ValueStackFactory p0)`

---

## public class `com.opensymphony.xwork2.DefaultActionProxy`
implements `com.opensymphony.xwork2.ActionProxy`, `java.io.Serializable`  

**Constructors:**
- `protected DefaultActionProxy(com.opensymphony.xwork2.ActionInvocation p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4, boolean p5)`

**Fields:**
- `protected com.opensymphony.xwork2.ActionEventListener actionEventListener`
- `protected java.lang.String actionName`
- `protected boolean cleanupContext`
- `protected com.opensymphony.xwork2.config.entities.ActionConfig config`
- `protected com.opensymphony.xwork2.config.Configuration configuration`
- `protected boolean executeResult`
- `protected com.opensymphony.xwork2.ActionInvocation invocation`
- `protected com.opensymphony.xwork2.LocalizedTextProvider localizedTextProvider`
- `protected java.lang.String method`
- `protected java.lang.String namespace`
- `protected com.opensymphony.xwork2.ObjectFactory objectFactory`
- `protected com.opensymphony.xwork2.UnknownHandlerManager unknownHandlerManager`

**Methods:**
- `public java.lang.String execute() throws java.lang.Exception`
- `public java.lang.Object getAction()`
- `public java.lang.String getActionName()`
- `public com.opensymphony.xwork2.config.entities.ActionConfig getConfig()`
- `protected java.lang.String getErrorMessage()`
- `public boolean getExecuteResult()`
- `public com.opensymphony.xwork2.ActionInvocation getInvocation()`
- `public java.lang.String getMethod()`
- `public java.lang.String getNamespace()`
- `public boolean isMethodSpecified()`
- `protected void prepare()`
- `protected java.lang.String prepareNotAllowedErrorMessage()`
- `public void setActionEventListener(com.opensymphony.xwork2.ActionEventListener p0)`
- `public void setConfiguration(com.opensymphony.xwork2.config.Configuration p0)`
- `public void setExecuteResult(boolean p0)`
- `public void setLocalizedTextProvider(com.opensymphony.xwork2.LocalizedTextProvider p0)`
- `public void setObjectFactory(com.opensymphony.xwork2.ObjectFactory p0)`
- `public void setUnknownHandler(com.opensymphony.xwork2.UnknownHandlerManager p0)`

---

## public class `com.opensymphony.xwork2.DefaultActionProxyFactory`
implements `com.opensymphony.xwork2.ActionProxyFactory`  

**Constructors:**
- `public DefaultActionProxyFactory()`

**Fields:**
- `protected com.opensymphony.xwork2.inject.Container container`

**Methods:**
- `protected com.opensymphony.xwork2.ActionInvocation createActionInvocation(java.util.Map p0, boolean p1)`
- `public com.opensymphony.xwork2.ActionProxy createActionProxy(com.opensymphony.xwork2.ActionInvocation p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4)`
- `public com.opensymphony.xwork2.ActionProxy createActionProxy(com.opensymphony.xwork2.ActionInvocation p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4, boolean p5)`
- `public com.opensymphony.xwork2.ActionProxy createActionProxy(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.Map p3)`
- `public com.opensymphony.xwork2.ActionProxy createActionProxy(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.Map p3, boolean p4, boolean p5)`
- `public com.opensymphony.xwork2.ActionProxy createActionProxy(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public com.opensymphony.xwork2.ActionProxy createActionProxy(java.lang.String p0, java.lang.String p1, java.util.Map p2, boolean p3, boolean p4)`
- `public void setContainer(com.opensymphony.xwork2.inject.Container p0)`
- `public java.lang.String toString()`

---

## public class `com.opensymphony.xwork2.DefaultLocaleProvider`
implements `com.opensymphony.xwork2.LocaleProvider`  

**Constructors:**
- `public DefaultLocaleProvider()`

**Methods:**
- `public java.util.Locale getLocale()`
- `public boolean isValidLocale(java.util.Locale p0)`
- `public boolean isValidLocaleString(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.DefaultLocaleProviderFactory`
implements `com.opensymphony.xwork2.LocaleProviderFactory`  

**Constructors:**
- `public DefaultLocaleProviderFactory()`

**Methods:**
- `public com.opensymphony.xwork2.LocaleProvider createLocaleProvider()`

---

## public class `com.opensymphony.xwork2.DefaultTextProvider`
implements `com.opensymphony.xwork2.TextProvider`, `com.opensymphony.xwork2.Unchainable`, `java.io.Serializable`  

**Constructors:**
- `public DefaultTextProvider()`

**Fields:**
- `protected com.opensymphony.xwork2.LocalizedTextProvider localizedTextProvider`

**Methods:**
- `public java.lang.String getText(java.lang.String p0)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1, java.lang.String[] p2)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1, java.lang.String[] p2, com.opensymphony.xwork2.util.ValueStack p3)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1, java.util.List p2)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1, java.util.List p2, com.opensymphony.xwork2.util.ValueStack p3)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String[] p1)`
- `public java.lang.String getText(java.lang.String p0, java.util.List p1)`
- `public java.util.ResourceBundle getTexts()`
- `public java.util.ResourceBundle getTexts(java.lang.String p0)`
- `public boolean hasKey(java.lang.String p0)`
- `public void setLocalizedTextProvider(com.opensymphony.xwork2.LocalizedTextProvider p0)`

---

## public class `com.opensymphony.xwork2.DefaultUnknownHandlerManager`
implements `com.opensymphony.xwork2.UnknownHandlerManager`  

**Constructors:**
- `public DefaultUnknownHandlerManager()`

**Fields:**
- `protected java.util.ArrayList unknownHandlers`

**Methods:**
- `protected void build() throws java.lang.Exception`
- `public java.util.List getUnknownHandlers()`
- `public com.opensymphony.xwork2.config.entities.ActionConfig handleUnknownAction(java.lang.String p0, java.lang.String p1)`
- `public java.lang.Object handleUnknownMethod(java.lang.Object p0, java.lang.String p1) throws java.lang.NoSuchMethodException`
- `public com.opensymphony.xwork2.Result handleUnknownResult(com.opensymphony.xwork2.ActionContext p0, java.lang.String p1, com.opensymphony.xwork2.config.entities.ActionConfig p2, java.lang.String p3)`
- `public boolean hasUnknownHandlers()`
- `public void setContainer(com.opensymphony.xwork2.inject.Container p0)`

---

## public abstract interface `com.opensymphony.xwork2.FileManager`

**Methods:**
- `public abstract boolean fileNeedsReloading(java.lang.String p0)`
- `public abstract boolean fileNeedsReloading(java.net.URL p0)`
- `public abstract java.util.Collection getAllPhysicalUrls(java.net.URL p0) throws java.io.IOException`
- `public abstract boolean internal()`
- `public abstract java.io.InputStream loadFile(java.net.URL p0)`
- `public abstract void monitorFile(java.net.URL p0)`
- `public abstract java.net.URL normalizeToFileProtocol(java.net.URL p0)`
- `public abstract void setReloadingConfigs(boolean p0)`
- `public abstract boolean support()`

---

## public abstract interface `com.opensymphony.xwork2.FileManagerFactory`

**Methods:**
- `public abstract com.opensymphony.xwork2.FileManager getFileManager()`
- `public abstract void setReloadingConfigs(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.InvalidMetadataException`
annotations: @java.lang.Deprecated  
extends `java.lang.RuntimeException`  

**Constructors:**
- `public InvalidMetadataException(java.lang.String p0)`

---

## public abstract interface `com.opensymphony.xwork2.LocaleProvider`

**Methods:**
- `public abstract java.util.Locale getLocale()`
- `public abstract boolean isValidLocale(java.util.Locale p0)`
- `public abstract boolean isValidLocaleString(java.lang.String p0)`

---

## public abstract interface `com.opensymphony.xwork2.LocaleProviderFactory`

**Methods:**
- `public abstract com.opensymphony.xwork2.LocaleProvider createLocaleProvider()`

---

## public abstract interface `com.opensymphony.xwork2.LocalizedTextProvider`
implements `java.io.Serializable`  

**Methods:**
- `public abstract void addDefaultResourceBundle(java.lang.String p0)`
- `public abstract java.lang.String findDefaultText(java.lang.String p0, java.util.Locale p1)`
- `public abstract java.lang.String findDefaultText(java.lang.String p0, java.util.Locale p1, java.lang.Object[] p2)`
- `public abstract java.util.ResourceBundle findResourceBundle(java.lang.String p0, java.util.Locale p1)`
- `public abstract java.lang.String findText(java.lang.Class p0, java.lang.String p1, java.util.Locale p2)`
- `public abstract java.lang.String findText(java.lang.Class p0, java.lang.String p1, java.util.Locale p2, java.lang.String p3, java.lang.Object[] p4)`
- `public abstract java.lang.String findText(java.lang.Class p0, java.lang.String p1, java.util.Locale p2, java.lang.String p3, java.lang.Object[] p4, com.opensymphony.xwork2.util.ValueStack p5)`
- `public abstract java.lang.String findText(java.util.ResourceBundle p0, java.lang.String p1, java.util.Locale p2)`
- `public abstract java.lang.String findText(java.util.ResourceBundle p0, java.lang.String p1, java.util.Locale p2, java.lang.String p3, java.lang.Object[] p4)`
- `public abstract java.lang.String findText(java.util.ResourceBundle p0, java.lang.String p1, java.util.Locale p2, java.lang.String p3, java.lang.Object[] p4, com.opensymphony.xwork2.util.ValueStack p5)`

---

## public abstract interface `com.opensymphony.xwork2.ModelDriven`<T extends java.lang.Object>

**Methods:**
- `public abstract T getModel()`

---

## public class `com.opensymphony.xwork2.ObjectFactory`
implements `java.io.Serializable`  

**Constructors:**
- `public ObjectFactory()`

**Methods:**
- `public java.lang.Object buildAction(java.lang.String p0, java.lang.String p1, com.opensymphony.xwork2.config.entities.ActionConfig p2, java.util.Map p3) throws java.lang.Exception`
- `public java.lang.Object buildBean(java.lang.Class p0, java.util.Map p1) throws java.lang.Exception`
- `public java.lang.Object buildBean(java.lang.String p0, java.util.Map p1) throws java.lang.Exception`
- `public java.lang.Object buildBean(java.lang.String p0, java.util.Map p1, boolean p2) throws java.lang.Exception`
- `public com.opensymphony.xwork2.conversion.TypeConverter buildConverter(java.lang.Class p0, java.util.Map p1) throws java.lang.Exception`
- `public com.opensymphony.xwork2.interceptor.Interceptor buildInterceptor(com.opensymphony.xwork2.config.entities.InterceptorConfig p0, java.util.Map p1) throws com.opensymphony.xwork2.config.ConfigurationException`
- `public com.opensymphony.xwork2.Result buildResult(com.opensymphony.xwork2.config.entities.ResultConfig p0, java.util.Map p1) throws java.lang.Exception`
- `public com.opensymphony.xwork2.UnknownHandler buildUnknownHandler(java.lang.String p0, java.util.Map p1) throws java.lang.Exception`
- `public com.opensymphony.xwork2.validator.Validator buildValidator(java.lang.String p0, java.util.Map p1, java.util.Map p2) throws java.lang.Exception`
- `public java.lang.Class getClassInstance(java.lang.String p0) throws java.lang.ClassNotFoundException`
- `protected java.lang.Object injectInternalBeans(java.lang.Object p0)`
- `public boolean isNoArgConstructorRequired()`
- `public void setActionFactory(com.opensymphony.xwork2.factory.ActionFactory p0)`
- `public void setClassLoader(java.lang.ClassLoader p0)`
- `public void setContainer(com.opensymphony.xwork2.inject.Container p0)`
- `public void setConverterFactory(com.opensymphony.xwork2.factory.ConverterFactory p0)`
- `public void setInterceptorFactory(com.opensymphony.xwork2.factory.InterceptorFactory p0)`
- `public void setResultFactory(com.opensymphony.xwork2.factory.ResultFactory p0)`
- `public void setUnknownHandlerFactory(com.opensymphony.xwork2.factory.UnknownHandlerFactory p0)`
- `public void setValidatorFactory(com.opensymphony.xwork2.factory.ValidatorFactory p0)`

---

## public abstract interface `com.opensymphony.xwork2.Preparable`

**Methods:**
- `public abstract void prepare() throws java.lang.Exception`

---

## public abstract interface `com.opensymphony.xwork2.ResourceBundleTextProvider`
implements `com.opensymphony.xwork2.TextProvider`  

**Methods:**
- `public abstract void setBundle(java.util.ResourceBundle p0)`
- `public abstract void setClazz(java.lang.Class p0)`
- `public abstract void setLocaleProvider(com.opensymphony.xwork2.LocaleProvider p0)`

---

## public abstract interface `com.opensymphony.xwork2.Result`
implements `java.io.Serializable`  

**Methods:**
- `public abstract void execute(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`

---

## public class `com.opensymphony.xwork2.StrutsTextProviderFactory`
implements `com.opensymphony.xwork2.TextProviderFactory`  

**Constructors:**
- `public StrutsTextProviderFactory()`

**Fields:**
- `protected com.opensymphony.xwork2.TextProvider defaultTextProvider`
- `protected com.opensymphony.xwork2.LocaleProviderFactory localeProviderFactory`
- `protected com.opensymphony.xwork2.LocalizedTextProvider localizedTextProvider`

**Methods:**
- `public com.opensymphony.xwork2.TextProvider createInstance(java.lang.Class p0)`
- `public com.opensymphony.xwork2.TextProvider createInstance(java.util.ResourceBundle p0)`
- `protected com.opensymphony.xwork2.TextProvider getTextProvider(java.lang.Class p0)`
- `protected com.opensymphony.xwork2.TextProvider getTextProvider(java.util.ResourceBundle p0)`
- `public void setDefaultTextProvider(com.opensymphony.xwork2.TextProvider p0)`
- `public void setLocaleProviderFactory(com.opensymphony.xwork2.LocaleProviderFactory p0)`
- `public void setLocalizedTextProvider(com.opensymphony.xwork2.LocalizedTextProvider p0)`

---

## public class `com.opensymphony.xwork2.TestNGXWorkTestCase`

**Constructors:**
- `public TestNGXWorkTestCase()`

**Fields:**
- `protected com.opensymphony.xwork2.ActionProxyFactory actionProxyFactory`
- `protected com.opensymphony.xwork2.config.Configuration configuration`
- `protected com.opensymphony.xwork2.config.ConfigurationManager configurationManager`
- `protected com.opensymphony.xwork2.inject.Container container`

**Methods:**
- `protected void loadConfigurationProviders(com.opensymphony.xwork2.config.ConfigurationProvider... p0)`
- `protected void setUp() throws java.lang.Exception`
- `protected void tearDown() throws java.lang.Exception`

---

## public abstract interface `com.opensymphony.xwork2.TextProvider`

**Methods:**
- `public abstract java.lang.String getText(java.lang.String p0)`
- `public abstract java.lang.String getText(java.lang.String p0, java.lang.String p1)`
- `public abstract java.lang.String getText(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public abstract java.lang.String getText(java.lang.String p0, java.lang.String p1, java.lang.String[] p2)`
- `public abstract java.lang.String getText(java.lang.String p0, java.lang.String p1, java.lang.String[] p2, com.opensymphony.xwork2.util.ValueStack p3)`
- `public abstract java.lang.String getText(java.lang.String p0, java.lang.String p1, java.util.List p2)`
- `public abstract java.lang.String getText(java.lang.String p0, java.lang.String p1, java.util.List p2, com.opensymphony.xwork2.util.ValueStack p3)`
- `public abstract java.lang.String getText(java.lang.String p0, java.lang.String[] p1)`
- `public abstract java.lang.String getText(java.lang.String p0, java.util.List p1)`
- `public abstract java.util.ResourceBundle getTexts()`
- `public abstract java.util.ResourceBundle getTexts(java.lang.String p0)`
- `public abstract boolean hasKey(java.lang.String p0)`

---

## public abstract interface `com.opensymphony.xwork2.TextProviderFactory`

**Methods:**
- `public abstract com.opensymphony.xwork2.TextProvider createInstance(java.lang.Class p0)`
- `public abstract com.opensymphony.xwork2.TextProvider createInstance(java.util.ResourceBundle p0)`

---

## public class `com.opensymphony.xwork2.TextProviderSupport`
implements `com.opensymphony.xwork2.ResourceBundleTextProvider`  

**Constructors:**
- `public TextProviderSupport(java.lang.Class p0, com.opensymphony.xwork2.LocaleProvider p1, com.opensymphony.xwork2.LocalizedTextProvider p2)`
- `public TextProviderSupport(java.util.ResourceBundle p0, com.opensymphony.xwork2.LocaleProvider p1, com.opensymphony.xwork2.LocalizedTextProvider p2)`

**Fields:**
- `protected java.util.ResourceBundle bundle`
- `protected java.lang.Class clazz`
- `protected com.opensymphony.xwork2.LocaleProvider localeProvider`
- `protected com.opensymphony.xwork2.LocalizedTextProvider localizedTextProvider`

**Methods:**
- `public java.lang.String getText(java.lang.String p0)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1, java.lang.String[] p2)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1, java.lang.String[] p2, com.opensymphony.xwork2.util.ValueStack p3)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1, java.util.List p2)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1, java.util.List p2, com.opensymphony.xwork2.util.ValueStack p3)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String[] p1)`
- `public java.lang.String getText(java.lang.String p0, java.util.List p1)`
- `public java.util.ResourceBundle getTexts()`
- `public java.util.ResourceBundle getTexts(java.lang.String p0)`
- `public boolean hasKey(java.lang.String p0)`
- `public void setBundle(java.util.ResourceBundle p0)`
- `public void setClazz(java.lang.Class p0)`
- `public void setLocaleProvider(com.opensymphony.xwork2.LocaleProvider p0)`
- `public void setLocaleProviderFactory(com.opensymphony.xwork2.LocaleProviderFactory p0)`
- `public void setLocalizedTextProvider(com.opensymphony.xwork2.LocalizedTextProvider p0)`

---

## public abstract interface `com.opensymphony.xwork2.Unchainable`

---

## public abstract interface `com.opensymphony.xwork2.UnknownHandler`

**Methods:**
- `public abstract com.opensymphony.xwork2.config.entities.ActionConfig handleUnknownAction(java.lang.String p0, java.lang.String p1) throws com.opensymphony.xwork2.XWorkException`
- `public abstract java.lang.Object handleUnknownActionMethod(java.lang.Object p0, java.lang.String p1)`
- `public abstract com.opensymphony.xwork2.Result handleUnknownResult(com.opensymphony.xwork2.ActionContext p0, java.lang.String p1, com.opensymphony.xwork2.config.entities.ActionConfig p2, java.lang.String p3) throws com.opensymphony.xwork2.XWorkException`

---

## public abstract interface `com.opensymphony.xwork2.UnknownHandlerManager`

**Methods:**
- `public abstract java.util.List getUnknownHandlers()`
- `public abstract com.opensymphony.xwork2.config.entities.ActionConfig handleUnknownAction(java.lang.String p0, java.lang.String p1)`
- `public abstract java.lang.Object handleUnknownMethod(java.lang.Object p0, java.lang.String p1) throws java.lang.NoSuchMethodException`
- `public abstract com.opensymphony.xwork2.Result handleUnknownResult(com.opensymphony.xwork2.ActionContext p0, java.lang.String p1, com.opensymphony.xwork2.config.entities.ActionConfig p2, java.lang.String p3)`
- `public abstract boolean hasUnknownHandlers()`

---

## public abstract interface `com.opensymphony.xwork2.Validateable`

**Methods:**
- `public abstract void validate()`

---

## public class `com.opensymphony.xwork2.ValidationAwareSupport`
implements `com.opensymphony.xwork2.interceptor.ValidationAware`, `java.io.Serializable`  

**Constructors:**
- `public ValidationAwareSupport()`

**Methods:**
- `public synchronized void addActionError(java.lang.String p0)`
- `public synchronized void addActionMessage(java.lang.String p0)`
- `public synchronized void addFieldError(java.lang.String p0, java.lang.String p1)`
- `public synchronized void clearActionErrors()`
- `public synchronized void clearErrors()`
- `public synchronized void clearErrorsAndMessages()`
- `public synchronized void clearFieldErrors()`
- `public synchronized void clearMessages()`
- `public synchronized java.util.Collection getActionErrors()`
- `public synchronized java.util.Collection getActionMessages()`
- `public synchronized java.util.Map getFieldErrors()`
- `public synchronized boolean hasActionErrors()`
- `public synchronized boolean hasActionMessages()`
- `public synchronized boolean hasErrors()`
- `public synchronized boolean hasFieldErrors()`
- `public synchronized void setActionErrors(java.util.Collection p0)`
- `public synchronized void setActionMessages(java.util.Collection p0)`
- `public synchronized void setFieldErrors(java.util.Map p0)`

---

## public final class `com.opensymphony.xwork2.XWorkConstants`
annotations: @java.lang.Deprecated  

**Constructors:**
- `public XWorkConstants()`

**Fields:**
- `public final static java.lang.String ADDITIONAL_ACCEPTED_PATTERNS`
- `public final static java.lang.String ADDITIONAL_EXCLUDED_PATTERNS`
- `public final static java.lang.String ALLOW_STATIC_METHOD_ACCESS`
- `public final static java.lang.String ARRAY_CONVERTER`
- `public final static java.lang.String COLLECTION_CONVERTER`
- `public final static java.lang.String DATE_CONVERTER`
- `public final static java.lang.String DEV_MODE`
- `public final static java.lang.String ENABLE_OGNL_EVAL_EXPRESSION`
- `public final static java.lang.String ENABLE_OGNL_EXPRESSION_CACHE`
- `public final static java.lang.String LOG_MISSING_PROPERTIES`
- `public final static java.lang.String NUMBER_CONVERTER`
- `public final static java.lang.String OGNL_EXCLUDED_CLASSES`
- `public final static java.lang.String OGNL_EXCLUDED_PACKAGE_NAMES`
- `public final static java.lang.String OGNL_EXCLUDED_PACKAGE_NAME_PATTERNS`
- `public final static java.lang.String OVERRIDE_ACCEPTED_PATTERNS`
- `public final static java.lang.String OVERRIDE_EXCLUDED_PATTERNS`
- `public final static java.lang.String RELOAD_XML_CONFIGURATION`
- `public final static java.lang.String STRING_CONVERTER`
- `public final static java.lang.String XWORK_LOGGER_FACTORY`

---

## public class `com.opensymphony.xwork2.XWorkException`
extends `java.lang.RuntimeException`  
implements `com.opensymphony.xwork2.util.location.Locatable`  

**Constructors:**
- `public XWorkException()`
- `public XWorkException(java.lang.String p0)`
- `public XWorkException(java.lang.String p0, java.lang.Object p1)`
- `public XWorkException(java.lang.String p0, java.lang.Throwable p1)`
- `public XWorkException(java.lang.String p0, java.lang.Throwable p1, java.lang.Object p2)`
- `public XWorkException(java.lang.Throwable p0)`
- `public XWorkException(java.lang.Throwable p0, java.lang.Object p1)`

**Methods:**
- `public com.opensymphony.xwork2.util.location.Location getLocation()`
- `public java.lang.String toString()`

---

## public abstract class `com.opensymphony.xwork2.XWorkJUnit4TestCase`

**Constructors:**
- `public XWorkJUnit4TestCase()`

**Fields:**
- `protected com.opensymphony.xwork2.ActionProxyFactory actionProxyFactory`
- `protected com.opensymphony.xwork2.config.Configuration configuration`
- `protected com.opensymphony.xwork2.config.ConfigurationManager configurationManager`
- `protected com.opensymphony.xwork2.inject.Container container`

**Methods:**
- `protected void loadButAdd(java.lang.Class p0, java.lang.Object p1)`
- `protected void loadButAdd(java.lang.Class p0, java.lang.String p1, java.lang.Object p2)`
- `protected void loadConfigurationProviders(com.opensymphony.xwork2.config.ConfigurationProvider... p0)`
- `public void setUp() throws java.lang.Exception`
- `public void tearDown() throws java.lang.Exception`

---

## public abstract class `com.opensymphony.xwork2.XWorkTestCase`
extends `junit.framework.TestCase`  

**Constructors:**
- `public XWorkTestCase()`

**Fields:**
- `protected com.opensymphony.xwork2.ActionProxyFactory actionProxyFactory`
- `protected com.opensymphony.xwork2.config.Configuration configuration`
- `protected com.opensymphony.xwork2.config.ConfigurationManager configurationManager`
- `protected com.opensymphony.xwork2.inject.Container container`

**Methods:**
- `protected void loadButAdd(java.lang.Class p0, java.lang.Object p1)`
- `protected void loadButAdd(java.lang.Class p0, java.lang.String p1, java.lang.Object p2)`
- `protected void loadConfigurationProviders(com.opensymphony.xwork2.config.ConfigurationProvider... p0)`
- `protected void setUp() throws java.lang.Exception`
- `protected void tearDown() throws java.lang.Exception`

---

## public abstract interface `com.opensymphony.xwork2.config.BeanSelectionProvider`
implements `com.opensymphony.xwork2.config.ConfigurationProvider`  

---

## public abstract interface `com.opensymphony.xwork2.config.Configuration`
implements `java.io.Serializable`  

**Methods:**
- `public abstract void addPackageConfig(java.lang.String p0, com.opensymphony.xwork2.config.entities.PackageConfig p1)`
- `public abstract void destroy()`
- `public abstract com.opensymphony.xwork2.inject.Container getContainer()`
- `public abstract java.util.Set getLoadedFileNames()`
- `public abstract com.opensymphony.xwork2.config.entities.PackageConfig getPackageConfig(java.lang.String p0)`
- `public abstract java.util.Set getPackageConfigNames()`
- `public abstract java.util.Map getPackageConfigs()`
- `public abstract com.opensymphony.xwork2.config.RuntimeConfiguration getRuntimeConfiguration()`
- `public abstract java.util.List getUnknownHandlerStack()`
- `public abstract void rebuildRuntimeConfiguration()`
- `public abstract java.util.List reloadContainer(java.util.List p0) throws com.opensymphony.xwork2.config.ConfigurationException`
- `public abstract com.opensymphony.xwork2.config.entities.PackageConfig removePackageConfig(java.lang.String p0)`
- `public abstract void setUnknownHandlerStack(java.util.List p0)`

---

## public class `com.opensymphony.xwork2.config.ConfigurationException`
extends `com.opensymphony.xwork2.XWorkException`  

**Constructors:**
- `public ConfigurationException()`
- `public ConfigurationException(java.lang.String p0)`
- `public ConfigurationException(java.lang.String p0, java.lang.Object p1)`
- `public ConfigurationException(java.lang.String p0, java.lang.Throwable p1)`
- `public ConfigurationException(java.lang.String p0, java.lang.Throwable p1, java.lang.Object p2)`
- `public ConfigurationException(java.lang.Throwable p0)`
- `public ConfigurationException(java.lang.Throwable p0, java.lang.Object p1)`

---

## public class `com.opensymphony.xwork2.config.ConfigurationManager`

**Constructors:**
- `public ConfigurationManager(java.lang.String p0)`

**Fields:**
- `protected final static org.apache.logging.log4j.Logger LOG`
- `protected com.opensymphony.xwork2.config.Configuration configuration`
- `protected java.lang.String defaultFrameworkBeanName`
- `protected java.util.concurrent.locks.Lock providerLock`

**Methods:**
- `public void addContainerProvider(com.opensymphony.xwork2.config.ContainerProvider p0)`
- `public void clearContainerProviders()`
- `public synchronized void conditionalReload()`
- `protected com.opensymphony.xwork2.config.Configuration createConfiguration(java.lang.String p0)`
- `public synchronized void destroyConfiguration()`
- `public synchronized com.opensymphony.xwork2.config.Configuration getConfiguration()`
- `public java.util.List getContainerProviders()`
- `public synchronized void reload()`
- `public synchronized void setConfiguration(com.opensymphony.xwork2.config.Configuration p0)`
- `public void setContainerProviders(java.util.List p0)`

---

## public abstract interface `com.opensymphony.xwork2.config.ConfigurationProvider`
implements `com.opensymphony.xwork2.config.ContainerProvider`, `com.opensymphony.xwork2.config.PackageProvider`  

---

## public class `com.opensymphony.xwork2.config.ConfigurationUtil`

**Methods:**
- `public static java.util.List buildParentListFromString(java.lang.String p0)`
- `public static java.util.List buildParentsFromString(com.opensymphony.xwork2.config.Configuration p0, java.lang.String p1)`

---

## public abstract interface `com.opensymphony.xwork2.config.ContainerProvider`

**Methods:**
- `public abstract void destroy()`
- `public abstract void init(com.opensymphony.xwork2.config.Configuration p0) throws com.opensymphony.xwork2.config.ConfigurationException`
- `public abstract boolean needsReload()`
- `public abstract void register(com.opensymphony.xwork2.inject.ContainerBuilder p0, com.opensymphony.xwork2.util.location.LocatableProperties p1) throws com.opensymphony.xwork2.config.ConfigurationException`

---

## public class `com.opensymphony.xwork2.config.FileManagerFactoryProvider`
implements `com.opensymphony.xwork2.config.ContainerProvider`  

**Constructors:**
- `public FileManagerFactoryProvider(java.lang.Class p0)`

**Methods:**
- `public void destroy()`
- `public void init(com.opensymphony.xwork2.config.Configuration p0) throws com.opensymphony.xwork2.config.ConfigurationException`
- `public boolean needsReload()`
- `public void register(com.opensymphony.xwork2.inject.ContainerBuilder p0, com.opensymphony.xwork2.util.location.LocatableProperties p1) throws com.opensymphony.xwork2.config.ConfigurationException`

---

## public class `com.opensymphony.xwork2.config.FileManagerProvider`
implements `com.opensymphony.xwork2.config.ContainerProvider`  

**Constructors:**
- `public FileManagerProvider(java.lang.Class p0, java.lang.String p1)`

**Methods:**
- `public void destroy()`
- `public void init(com.opensymphony.xwork2.config.Configuration p0) throws com.opensymphony.xwork2.config.ConfigurationException`
- `public boolean needsReload()`
- `public void register(com.opensymphony.xwork2.inject.ContainerBuilder p0, com.opensymphony.xwork2.util.location.LocatableProperties p1) throws com.opensymphony.xwork2.config.ConfigurationException`

---

## public abstract interface `com.opensymphony.xwork2.config.PackageProvider`

**Methods:**
- `public abstract void init(com.opensymphony.xwork2.config.Configuration p0) throws com.opensymphony.xwork2.config.ConfigurationException`
- `public abstract void loadPackages() throws com.opensymphony.xwork2.config.ConfigurationException`
- `public abstract boolean needsReload()`

---

## public class `com.opensymphony.xwork2.config.ReferenceResolverException`
annotations: @java.lang.Deprecated  
extends `com.opensymphony.xwork2.XWorkException`  

**Constructors:**
- `public ReferenceResolverException()`
- `public ReferenceResolverException(java.lang.String p0)`
- `public ReferenceResolverException(java.lang.String p0, java.lang.Throwable p1)`
- `public ReferenceResolverException(java.lang.Throwable p0)`

---

## public abstract interface `com.opensymphony.xwork2.config.RuntimeConfiguration`
implements `java.io.Serializable`  

**Methods:**
- `public abstract com.opensymphony.xwork2.config.entities.ActionConfig getActionConfig(java.lang.String p0, java.lang.String p1)`
- `public abstract java.util.Map getActionConfigs()`

---

## public abstract interface `com.opensymphony.xwork2.config.ServletContextAwareConfigurationProvider`
implements `com.opensymphony.xwork2.config.ConfigurationProvider`  

**Methods:**
- `public abstract void initWithContext(javax.servlet.ServletContext p0)`

---

## public class `com.opensymphony.xwork2.config.entities.ActionConfig`
extends `com.opensymphony.xwork2.util.location.Located`  
implements `java.io.Serializable`  

**Constructors:**
- `protected ActionConfig(com.opensymphony.xwork2.config.entities.ActionConfig p0)`
- `protected ActionConfig(java.lang.String p0, java.lang.String p1, java.lang.String p2)`

**Fields:**
- `public final static java.lang.String DEFAULT_METHOD`
- `public final static java.lang.String DEFAULT_METHOD_REGEX`
- `public final static java.lang.String WILDCARD`
- `protected com.opensymphony.xwork2.config.entities.AllowedMethods allowedMethods`
- `protected java.lang.String className`
- `protected java.util.List exceptionMappings`
- `protected java.util.List interceptors`
- `protected java.lang.String methodName`
- `protected java.lang.String name`
- `protected java.lang.String packageName`
- `protected java.util.Map params`
- `protected java.util.Map results`
- `protected boolean strictMethodInvocation`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.util.Set getAllowedMethods()`
- `public java.lang.String getClassName()`
- `public java.util.List getExceptionMappings()`
- `public java.util.List getInterceptors()`
- `public java.lang.String getMethodName()`
- `public java.lang.String getName()`
- `public java.lang.String getPackageName()`
- `public java.util.Map getParams()`
- `public java.util.Map getResults()`
- `public int hashCode()`
- `public boolean isAllowedMethod(java.lang.String p0)`
- `public boolean isStrictMethodInvocation()`
- `public java.lang.String toString()`

---

## public static class `com.opensymphony.xwork2.config.entities.ActionConfig$Builder`
implements `com.opensymphony.xwork2.config.entities.InterceptorListHolder`  

**Constructors:**
- `public Builder(com.opensymphony.xwork2.config.entities.ActionConfig p0)`
- `public Builder(java.lang.String p0, java.lang.String p1, java.lang.String p2)`

**Fields:**
- `protected java.util.Set allowedMethods`
- `protected com.opensymphony.xwork2.config.entities.ActionConfig target`

**Methods:**
- `public com.opensymphony.xwork2.config.entities.ActionConfig$Builder addAllowedMethod(java.lang.String p0)`
- `public com.opensymphony.xwork2.config.entities.ActionConfig$Builder addAllowedMethod(java.util.Collection p0)`
- `public com.opensymphony.xwork2.config.entities.ActionConfig$Builder addExceptionMapping(com.opensymphony.xwork2.config.entities.ExceptionMappingConfig p0)`
- `public com.opensymphony.xwork2.config.entities.ActionConfig$Builder addExceptionMappings(java.util.Collection p0)`
- `public com.opensymphony.xwork2.config.entities.ActionConfig$Builder addInterceptor(com.opensymphony.xwork2.config.entities.InterceptorMapping p0)`
- `public com.opensymphony.xwork2.config.entities.ActionConfig$Builder addInterceptors(java.util.List p0)`
- `public com.opensymphony.xwork2.config.entities.ActionConfig$Builder addParam(java.lang.String p0, java.lang.String p1)`
- `public com.opensymphony.xwork2.config.entities.ActionConfig$Builder addParams(java.util.Map p0)`
- `public com.opensymphony.xwork2.config.entities.ActionConfig$Builder addResultConfig(com.opensymphony.xwork2.config.entities.ResultConfig p0)`
- `public com.opensymphony.xwork2.config.entities.ActionConfig$Builder addResultConfigs(java.util.Collection p0)`
- `public com.opensymphony.xwork2.config.entities.ActionConfig$Builder addResultConfigs(java.util.Map p0)`
- `public com.opensymphony.xwork2.config.entities.ActionConfig build()`
- `public com.opensymphony.xwork2.config.entities.ActionConfig$Builder className(java.lang.String p0)`
- `public com.opensymphony.xwork2.config.entities.ActionConfig$Builder defaultClassName(java.lang.String p0)`
- `public com.opensymphony.xwork2.config.entities.ActionConfig$Builder exceptionMappings(java.util.Collection p0)`
- `public com.opensymphony.xwork2.config.entities.ActionConfig$Builder interceptors(java.util.List p0)`
- `public com.opensymphony.xwork2.config.entities.ActionConfig$Builder location(com.opensymphony.xwork2.util.location.Location p0)`
- `public com.opensymphony.xwork2.config.entities.ActionConfig$Builder methodName(java.lang.String p0)`
- `public com.opensymphony.xwork2.config.entities.ActionConfig$Builder name(java.lang.String p0)`
- `public com.opensymphony.xwork2.config.entities.ActionConfig$Builder packageName(java.lang.String p0)`
- `public com.opensymphony.xwork2.config.entities.ActionConfig$Builder setDefaultMethodRegex(java.lang.String p0)`
- `public com.opensymphony.xwork2.config.entities.ActionConfig$Builder setStrictMethodInvocation(boolean p0)`

---

## public class `com.opensymphony.xwork2.config.entities.AllowedMethods`

**Methods:**
- `public static com.opensymphony.xwork2.config.entities.AllowedMethods build(boolean p0, java.util.Set p1, java.lang.String p2)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getDefaultRegex()`
- `public int hashCode()`
- `public boolean isAllowed(java.lang.String p0)`
- `public boolean isStrictMethodInvocation()`
- `public java.util.Set list()`
- `public java.lang.String toString()`

---

## public class `com.opensymphony.xwork2.config.entities.ExceptionMappingConfig`
extends `com.opensymphony.xwork2.util.location.Located`  
implements `java.io.Serializable`  

**Constructors:**
- `protected ExceptionMappingConfig(com.opensymphony.xwork2.config.entities.ExceptionMappingConfig p0)`
- `protected ExceptionMappingConfig(java.lang.String p0, java.lang.String p1, java.lang.String p2)`

**Fields:**
- `protected java.lang.String exceptionClassName`
- `protected java.lang.String name`
- `protected java.util.Map params`
- `protected java.lang.String result`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getExceptionClassName()`
- `public java.lang.String getName()`
- `public java.util.Map getParams()`
- `public java.lang.String getResult()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public static class `com.opensymphony.xwork2.config.entities.ExceptionMappingConfig$Builder`

**Constructors:**
- `public Builder(com.opensymphony.xwork2.config.entities.ExceptionMappingConfig p0)`
- `public Builder(java.lang.String p0, java.lang.String p1, java.lang.String p2)`

**Fields:**
- `protected com.opensymphony.xwork2.config.entities.ExceptionMappingConfig target`

**Methods:**
- `public com.opensymphony.xwork2.config.entities.ExceptionMappingConfig$Builder addParam(java.lang.String p0, java.lang.String p1)`
- `public com.opensymphony.xwork2.config.entities.ExceptionMappingConfig$Builder addParams(java.util.Map p0)`
- `public com.opensymphony.xwork2.config.entities.ExceptionMappingConfig build()`
- `protected void embalmTarget()`
- `public com.opensymphony.xwork2.config.entities.ExceptionMappingConfig$Builder exceptionClassName(java.lang.String p0)`
- `public com.opensymphony.xwork2.config.entities.ExceptionMappingConfig$Builder location(com.opensymphony.xwork2.util.location.Location p0)`
- `public com.opensymphony.xwork2.config.entities.ExceptionMappingConfig$Builder name(java.lang.String p0)`
- `public com.opensymphony.xwork2.config.entities.ExceptionMappingConfig$Builder result(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.config.entities.InterceptorConfig`
extends `com.opensymphony.xwork2.util.location.Located`  
implements `java.io.Serializable`  

**Constructors:**
- `protected InterceptorConfig(com.opensymphony.xwork2.config.entities.InterceptorConfig p0)`
- `protected InterceptorConfig(java.lang.String p0, java.lang.String p1)`

**Fields:**
- `protected java.lang.String className`
- `protected java.lang.String name`
- `protected java.util.Map params`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getClassName()`
- `public java.lang.String getName()`
- `public java.util.Map getParams()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public final static class `com.opensymphony.xwork2.config.entities.InterceptorConfig$Builder`

**Constructors:**
- `public Builder(com.opensymphony.xwork2.config.entities.InterceptorConfig p0)`
- `public Builder(java.lang.String p0, java.lang.String p1)`

**Methods:**
- `public com.opensymphony.xwork2.config.entities.InterceptorConfig$Builder addParam(java.lang.String p0, java.lang.String p1)`
- `public com.opensymphony.xwork2.config.entities.InterceptorConfig$Builder addParams(java.util.Map p0)`
- `public com.opensymphony.xwork2.config.entities.InterceptorConfig build()`
- `public com.opensymphony.xwork2.config.entities.InterceptorConfig$Builder className(java.lang.String p0)`
- `public com.opensymphony.xwork2.config.entities.InterceptorConfig$Builder location(com.opensymphony.xwork2.util.location.Location p0)`
- `public com.opensymphony.xwork2.config.entities.InterceptorConfig$Builder name(java.lang.String p0)`

---

## public abstract interface `com.opensymphony.xwork2.config.entities.InterceptorListHolder`

**Methods:**
- `public abstract com.opensymphony.xwork2.config.entities.InterceptorListHolder addInterceptor(com.opensymphony.xwork2.config.entities.InterceptorMapping p0)`
- `public abstract com.opensymphony.xwork2.config.entities.InterceptorListHolder addInterceptors(java.util.List p0)`

---

## public abstract interface `com.opensymphony.xwork2.config.entities.InterceptorLocator`

**Methods:**
- `public abstract java.lang.Object getInterceptorConfig(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.config.entities.InterceptorMapping`
implements `java.io.Serializable`  

**Constructors:**
- `public InterceptorMapping(java.lang.String p0, com.opensymphony.xwork2.interceptor.Interceptor p1)`
- `public InterceptorMapping(java.lang.String p0, com.opensymphony.xwork2.interceptor.Interceptor p1, java.util.Map p2)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public com.opensymphony.xwork2.interceptor.Interceptor getInterceptor()`
- `public java.lang.String getName()`
- `public java.util.Map getParams()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.opensymphony.xwork2.config.entities.InterceptorStackConfig`
extends `com.opensymphony.xwork2.util.location.Located`  
implements `java.io.Serializable`  

**Constructors:**
- `protected InterceptorStackConfig()`
- `protected InterceptorStackConfig(com.opensymphony.xwork2.config.entities.InterceptorStackConfig p0)`

**Fields:**
- `protected java.util.List interceptors`
- `protected java.lang.String name`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.util.Collection getInterceptors()`
- `public java.lang.String getName()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public static class `com.opensymphony.xwork2.config.entities.InterceptorStackConfig$Builder`
implements `com.opensymphony.xwork2.config.entities.InterceptorListHolder`  

**Constructors:**
- `public Builder(java.lang.String p0)`

**Fields:**
- `protected com.opensymphony.xwork2.config.entities.InterceptorStackConfig target`

**Methods:**
- `public com.opensymphony.xwork2.config.entities.InterceptorStackConfig$Builder addInterceptor(com.opensymphony.xwork2.config.entities.InterceptorMapping p0)`
- `public com.opensymphony.xwork2.config.entities.InterceptorStackConfig$Builder addInterceptors(java.util.List p0)`
- `public com.opensymphony.xwork2.config.entities.InterceptorStackConfig build()`
- `protected void embalmTarget()`
- `public com.opensymphony.xwork2.config.entities.InterceptorStackConfig$Builder location(com.opensymphony.xwork2.util.location.Location p0)`
- `public com.opensymphony.xwork2.config.entities.InterceptorStackConfig$Builder name(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.config.entities.PackageConfig`
extends `com.opensymphony.xwork2.util.location.Located`  
implements `com.opensymphony.xwork2.config.entities.InterceptorLocator`, `java.io.Serializable`, `java.lang.Comparable`  

**Constructors:**
- `protected PackageConfig(com.opensymphony.xwork2.config.entities.PackageConfig p0)`
- `protected PackageConfig(java.lang.String p0)`

**Fields:**
- `protected java.util.Map actionConfigs`
- `protected java.lang.String defaultActionRef`
- `protected java.lang.String defaultClassRef`
- `protected java.lang.String defaultInterceptorRef`
- `protected java.lang.String defaultResultType`
- `protected java.util.Set globalAllowedMethods`
- `protected java.util.List globalExceptionMappingConfigs`
- `protected java.util.Map globalResultConfigs`
- `protected java.util.Map interceptorConfigs`
- `protected boolean isAbstract`
- `protected java.lang.String name`
- `protected java.lang.String namespace`
- `protected boolean needsRefresh`
- `protected java.util.List parents`
- `protected java.util.Map resultTypeConfigs`
- `protected boolean strictMethodInvocation`

**Methods:**
- `public int compareTo(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.Map getActionConfigs()`
- `public java.util.Map getAllActionConfigs()`
- `public java.util.List getAllExceptionMappingConfigs()`
- `public java.util.Map getAllGlobalResults()`
- `public java.util.Map getAllInterceptorConfigs()`
- `public java.util.Map getAllResultTypeConfigs()`
- `public java.lang.String getDefaultActionRef()`
- `public java.lang.String getDefaultClassRef()`
- `public java.lang.String getDefaultInterceptorRef()`
- `public java.lang.String getDefaultResultType()`
- `public java.lang.String getFullDefaultActionRef()`
- `public java.lang.String getFullDefaultInterceptorRef()`
- `public java.lang.String getFullDefaultResultType()`
- `public java.util.Set getGlobalAllowedMethods()`
- `public java.util.List getGlobalExceptionMappingConfigs()`
- `public java.util.Map getGlobalResultConfigs()`
- `public java.lang.Object getInterceptorConfig(java.lang.String p0)`
- `public java.util.Map getInterceptorConfigs()`
- `public java.lang.String getName()`
- `public java.lang.String getNamespace()`
- `public java.util.List getParents()`
- `public java.util.Map getResultTypeConfigs()`
- `public int hashCode()`
- `public boolean isAbstract()`
- `public boolean isNeedsRefresh()`
- `public boolean isStrictMethodInvocation()`
- `public java.lang.String toString()`

---

## public static class `com.opensymphony.xwork2.config.entities.PackageConfig$Builder`
implements `com.opensymphony.xwork2.config.entities.InterceptorLocator`  

**Constructors:**
- `public Builder(com.opensymphony.xwork2.config.entities.PackageConfig p0)`
- `public Builder(java.lang.String p0)`

**Fields:**
- `protected com.opensymphony.xwork2.config.entities.PackageConfig target`

**Methods:**
- `public com.opensymphony.xwork2.config.entities.PackageConfig$Builder addActionConfig(java.lang.String p0, com.opensymphony.xwork2.config.entities.ActionConfig p1)`
- `public com.opensymphony.xwork2.config.entities.PackageConfig$Builder addExceptionMappingConfig(com.opensymphony.xwork2.config.entities.ExceptionMappingConfig p0)`
- `public com.opensymphony.xwork2.config.entities.PackageConfig$Builder addGlobalAllowedMethods(java.util.Set p0)`
- `public com.opensymphony.xwork2.config.entities.PackageConfig$Builder addGlobalExceptionMappingConfigs(java.util.List p0)`
- `public com.opensymphony.xwork2.config.entities.PackageConfig$Builder addGlobalResultConfig(com.opensymphony.xwork2.config.entities.ResultConfig p0)`
- `public com.opensymphony.xwork2.config.entities.PackageConfig$Builder addGlobalResultConfigs(java.util.Map p0)`
- `public com.opensymphony.xwork2.config.entities.PackageConfig$Builder addInterceptorConfig(com.opensymphony.xwork2.config.entities.InterceptorConfig p0)`
- `public com.opensymphony.xwork2.config.entities.PackageConfig$Builder addInterceptorStackConfig(com.opensymphony.xwork2.config.entities.InterceptorStackConfig p0)`
- `public com.opensymphony.xwork2.config.entities.PackageConfig$Builder addParent(com.opensymphony.xwork2.config.entities.PackageConfig p0)`
- `public com.opensymphony.xwork2.config.entities.PackageConfig$Builder addParents(java.util.List p0)`
- `public com.opensymphony.xwork2.config.entities.PackageConfig$Builder addResultTypeConfig(com.opensymphony.xwork2.config.entities.ResultTypeConfig p0)`
- `public com.opensymphony.xwork2.config.entities.PackageConfig build()`
- `public com.opensymphony.xwork2.config.entities.PackageConfig$Builder defaultActionRef(java.lang.String p0)`
- `public com.opensymphony.xwork2.config.entities.PackageConfig$Builder defaultClassRef(java.lang.String p0)`
- `public com.opensymphony.xwork2.config.entities.PackageConfig$Builder defaultInterceptorRef(java.lang.String p0)`
- `public com.opensymphony.xwork2.config.entities.PackageConfig$Builder defaultResultType(java.lang.String p0)`
- `public java.lang.String getDefaultClassRef()`
- `public java.lang.String getFullDefaultResultType()`
- `public java.util.Set getGlobalAllowedMethods()`
- `public java.lang.Object getInterceptorConfig(java.lang.String p0)`
- `public java.lang.String getName()`
- `public java.lang.String getNamespace()`
- `public java.util.Set getParentsAllowedMethods(java.util.List p0)`
- `public com.opensymphony.xwork2.config.entities.ResultTypeConfig getResultType(java.lang.String p0)`
- `public com.opensymphony.xwork2.config.entities.PackageConfig$Builder isAbstract(boolean p0)`
- `public boolean isNeedsRefresh()`
- `public boolean isStrictMethodInvocation()`
- `public com.opensymphony.xwork2.config.entities.PackageConfig$Builder location(com.opensymphony.xwork2.util.location.Location p0)`
- `public com.opensymphony.xwork2.config.entities.PackageConfig$Builder name(java.lang.String p0)`
- `public com.opensymphony.xwork2.config.entities.PackageConfig$Builder namespace(java.lang.String p0)`
- `public com.opensymphony.xwork2.config.entities.PackageConfig$Builder needsRefresh(boolean p0)`
- `public com.opensymphony.xwork2.config.entities.PackageConfig$Builder strictMethodInvocation(boolean p0)`
- `public java.lang.String toString()`

---

## public abstract interface `com.opensymphony.xwork2.config.entities.Parameterizable`

**Methods:**
- `public abstract void addParam(java.lang.String p0, java.lang.String p1)`
- `public abstract java.util.Map getParams()`
- `public abstract void setParams(java.util.Map p0)`

---

## public class `com.opensymphony.xwork2.config.entities.ResultConfig`
extends `com.opensymphony.xwork2.util.location.Located`  
implements `java.io.Serializable`  

**Constructors:**
- `protected ResultConfig(com.opensymphony.xwork2.config.entities.ResultConfig p0)`
- `protected ResultConfig(java.lang.String p0, java.lang.String p1)`

**Fields:**
- `protected java.lang.String className`
- `protected java.lang.String name`
- `protected java.util.Map params`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getClassName()`
- `public java.lang.String getName()`
- `public java.util.Map getParams()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public final static class `com.opensymphony.xwork2.config.entities.ResultConfig$Builder`

**Constructors:**
- `public Builder(com.opensymphony.xwork2.config.entities.ResultConfig p0)`
- `public Builder(java.lang.String p0, java.lang.String p1)`

**Methods:**
- `public com.opensymphony.xwork2.config.entities.ResultConfig$Builder addParam(java.lang.String p0, java.lang.String p1)`
- `public com.opensymphony.xwork2.config.entities.ResultConfig$Builder addParams(java.util.Map p0)`
- `public com.opensymphony.xwork2.config.entities.ResultConfig build()`
- `public com.opensymphony.xwork2.config.entities.ResultConfig$Builder className(java.lang.String p0)`
- `public com.opensymphony.xwork2.config.entities.ResultConfig$Builder location(com.opensymphony.xwork2.util.location.Location p0)`
- `public com.opensymphony.xwork2.config.entities.ResultConfig$Builder name(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.config.entities.ResultTypeConfig`
extends `com.opensymphony.xwork2.util.location.Located`  
implements `java.io.Serializable`  

**Constructors:**
- `protected ResultTypeConfig(com.opensymphony.xwork2.config.entities.ResultTypeConfig p0)`
- `protected ResultTypeConfig(java.lang.String p0, java.lang.String p1)`

**Fields:**
- `protected java.lang.String className`
- `protected java.lang.String defaultResultParam`
- `protected java.lang.String name`
- `protected java.util.Map params`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getClassName()`
- `public java.lang.String getDefaultResultParam()`
- `public java.lang.String getName()`
- `public java.util.Map getParams()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public final static class `com.opensymphony.xwork2.config.entities.ResultTypeConfig$Builder`

**Constructors:**
- `public Builder(com.opensymphony.xwork2.config.entities.ResultTypeConfig p0)`
- `public Builder(java.lang.String p0, java.lang.String p1)`

**Methods:**
- `public com.opensymphony.xwork2.config.entities.ResultTypeConfig$Builder addParam(java.lang.String p0, java.lang.String p1)`
- `public com.opensymphony.xwork2.config.entities.ResultTypeConfig$Builder addParams(java.util.Map p0)`
- `public com.opensymphony.xwork2.config.entities.ResultTypeConfig build()`
- `public com.opensymphony.xwork2.config.entities.ResultTypeConfig$Builder className(java.lang.String p0)`
- `public com.opensymphony.xwork2.config.entities.ResultTypeConfig$Builder defaultResultParam(java.lang.String p0)`
- `public com.opensymphony.xwork2.config.entities.ResultTypeConfig$Builder location(com.opensymphony.xwork2.util.location.Location p0)`
- `public com.opensymphony.xwork2.config.entities.ResultTypeConfig$Builder name(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.config.entities.UnknownHandlerConfig`
extends `com.opensymphony.xwork2.util.location.Located`  

**Constructors:**
- `public UnknownHandlerConfig(java.lang.String p0, com.opensymphony.xwork2.util.location.Location p1)`

**Methods:**
- `public java.lang.String getName()`
- `public void setName(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public abstract class `com.opensymphony.xwork2.config.impl.AbstractMatcher`<E extends java.lang.Object>
implements `java.io.Serializable`  

**Constructors:**
- `public AbstractMatcher(com.opensymphony.xwork2.util.PatternMatcher p0)`
- `public AbstractMatcher(com.opensymphony.xwork2.util.PatternMatcher p0, boolean p1)`

**Methods:**
- `public void addPattern(java.lang.String p0, E p1, boolean p2)`
- `protected abstract E convert(java.lang.String p0, E p1, java.util.Map p2)`
- `protected java.lang.String convertParam(java.lang.String p0, java.util.Map p1)`
- `public void freeze()`
- `public E match(java.lang.String p0)`
- `protected java.util.Map replaceParameters(java.util.Map p0, java.util.Map p1)`

---

## public class `com.opensymphony.xwork2.config.impl.ActionConfigMatcher`
extends `com.opensymphony.xwork2.config.impl.AbstractMatcher`  
implements `java.io.Serializable`  

**Constructors:**
- `public ActionConfigMatcher(com.opensymphony.xwork2.util.PatternMatcher p0, java.util.Map p1, boolean p2)`
- `public ActionConfigMatcher(com.opensymphony.xwork2.util.PatternMatcher p0, java.util.Map p1, boolean p2, boolean p3)`

**Methods:**
- `public com.opensymphony.xwork2.config.entities.ActionConfig convert(java.lang.String p0, com.opensymphony.xwork2.config.entities.ActionConfig p1, java.util.Map p2)`

---

## public class `com.opensymphony.xwork2.config.impl.DefaultConfiguration`
implements `com.opensymphony.xwork2.config.Configuration`  

**Constructors:**
- `public DefaultConfiguration()`
- `public DefaultConfiguration(java.lang.String p0)`

**Fields:**
- `protected final static org.apache.logging.log4j.Logger LOG`
- `protected com.opensymphony.xwork2.inject.Container container`
- `protected java.lang.String defaultFrameworkBeanName`
- `protected java.util.Set loadedFileNames`
- `protected java.util.Map packageContexts`
- `protected com.opensymphony.xwork2.config.RuntimeConfiguration runtimeConfiguration`
- `protected java.util.List unknownHandlerStack`

**Methods:**
- `public void addPackageConfig(java.lang.String p0, com.opensymphony.xwork2.config.entities.PackageConfig p1)`
- `protected synchronized com.opensymphony.xwork2.config.RuntimeConfiguration buildRuntimeConfiguration() throws com.opensymphony.xwork2.config.ConfigurationException`
- `protected com.opensymphony.xwork2.inject.Container createBootstrapContainer(java.util.List p0)`
- `public void destroy()`
- `public com.opensymphony.xwork2.inject.Container getContainer()`
- `public java.util.Set getLoadedFileNames()`
- `public com.opensymphony.xwork2.config.entities.PackageConfig getPackageConfig(java.lang.String p0)`
- `public java.util.Set getPackageConfigNames()`
- `public java.util.Map getPackageConfigs()`
- `public com.opensymphony.xwork2.config.RuntimeConfiguration getRuntimeConfiguration()`
- `public java.util.List getUnknownHandlerStack()`
- `public void rebuildRuntimeConfiguration()`
- `public synchronized java.util.List reloadContainer(java.util.List p0) throws com.opensymphony.xwork2.config.ConfigurationException`
- `public com.opensymphony.xwork2.config.entities.PackageConfig removePackageConfig(java.lang.String p0)`
- `protected com.opensymphony.xwork2.ActionContext setContext(com.opensymphony.xwork2.inject.Container p0)`
- `public void setUnknownHandlerStack(java.util.List p0)`

---

## public class `com.opensymphony.xwork2.config.impl.LocatableConstantFactory`<T extends java.lang.Object>
extends `com.opensymphony.xwork2.util.location.Located`  
implements `com.opensymphony.xwork2.inject.Factory`  

**Constructors:**
- `public LocatableConstantFactory(T p0, java.lang.Object p1)`

**Methods:**
- `public T create(com.opensymphony.xwork2.inject.Context p0)`
- `public java.lang.String toString()`
- `public java.lang.Class type()`

---

## public class `com.opensymphony.xwork2.config.impl.LocatableFactory`<T extends java.lang.Object>
extends `com.opensymphony.xwork2.util.location.Located`  
implements `com.opensymphony.xwork2.inject.Factory<T>`  

**Constructors:**
- `public LocatableFactory(java.lang.String p0, java.lang.Class p1, java.lang.Class p2, com.opensymphony.xwork2.inject.Scope p3, java.lang.Object p4)`

**Methods:**
- `public T create(com.opensymphony.xwork2.inject.Context p0)`
- `public java.lang.String toString()`
- `public java.lang.Class type()`

---

## public class `com.opensymphony.xwork2.config.impl.MockConfiguration`
implements `com.opensymphony.xwork2.config.Configuration`  

**Constructors:**
- `public MockConfiguration()`

**Fields:**
- `protected java.util.List unknownHandlerStack`

**Methods:**
- `public void addPackageConfig(java.lang.String p0, com.opensymphony.xwork2.config.entities.PackageConfig p1)`
- `public void buildRuntimeConfiguration()`
- `public void destroy()`
- `public com.opensymphony.xwork2.inject.Container getContainer()`
- `public java.util.Set getLoadedFileNames()`
- `public com.opensymphony.xwork2.config.entities.PackageConfig getPackageConfig(java.lang.String p0)`
- `public java.util.Set getPackageConfigNames()`
- `public java.util.Map getPackageConfigs()`
- `public com.opensymphony.xwork2.config.RuntimeConfiguration getRuntimeConfiguration()`
- `public java.util.List getUnknownHandlerStack()`
- `public void rebuildRuntimeConfiguration()`
- `public java.util.List reloadContainer(java.util.List p0) throws com.opensymphony.xwork2.config.ConfigurationException`
- `public com.opensymphony.xwork2.config.entities.PackageConfig removePackageConfig(java.lang.String p0)`
- `public void selfRegister()`
- `public void setUnknownHandlerStack(java.util.List p0)`

---

## public class `com.opensymphony.xwork2.config.impl.NamespaceMatch`

**Constructors:**
- `public NamespaceMatch(java.lang.String p0, java.util.Map p1)`

**Methods:**
- `public java.lang.String getPattern()`
- `public java.util.Map getVariables()`

---

## public class `com.opensymphony.xwork2.config.impl.NamespaceMatcher`
extends `com.opensymphony.xwork2.config.impl.AbstractMatcher`  

**Constructors:**
- `public NamespaceMatcher(com.opensymphony.xwork2.util.PatternMatcher p0, java.util.Set p1)`
- `public NamespaceMatcher(com.opensymphony.xwork2.util.PatternMatcher p0, java.util.Set p1, boolean p2)`

**Methods:**
- `protected com.opensymphony.xwork2.config.impl.NamespaceMatch convert(java.lang.String p0, com.opensymphony.xwork2.config.impl.NamespaceMatch p1, java.util.Map p2)`

---

## public class `com.opensymphony.xwork2.config.providers.CycleDetector`<T extends java.lang.Object>

**Constructors:**
- `public CycleDetector(com.opensymphony.xwork2.config.providers.DirectedGraph p0)`

**Methods:**
- `public boolean containsCycle()`
- `public java.util.List getVerticesInCycles()`

---

## public final class `com.opensymphony.xwork2.config.providers.DirectedGraph`<T extends java.lang.Object>
implements `java.lang.Iterable<T>`  

**Constructors:**
- `public DirectedGraph()`

**Methods:**
- `public void addEdge(T p0, T p1)`
- `public boolean addNode(T p0)`
- `public boolean edgeExists(T p0, T p1)`
- `public java.util.Set edgesFrom(T p0)`
- `public boolean isEmpty()`
- `public java.util.Iterator iterator()`
- `public void removeEdge(T p0, T p1)`
- `public int size()`

---

## public class `com.opensymphony.xwork2.config.providers.EnvsValueSubstitutor`
implements `com.opensymphony.xwork2.config.providers.ValueSubstitutor`  

**Constructors:**
- `public EnvsValueSubstitutor()`

**Fields:**
- `protected org.apache.commons.lang3.text.StrSubstitutor strSubstitutor`

**Methods:**
- `public java.lang.String substitute(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.config.providers.InterceptorBuilder`

**Constructors:**
- `public InterceptorBuilder()`

**Methods:**
- `public static java.util.List constructInterceptorReference(com.opensymphony.xwork2.config.entities.InterceptorLocator p0, java.lang.String p1, java.util.Map p2, com.opensymphony.xwork2.util.location.Location p3, com.opensymphony.xwork2.ObjectFactory p4) throws com.opensymphony.xwork2.config.ConfigurationException`

---

## public abstract interface `com.opensymphony.xwork2.config.providers.ValueSubstitutor`

**Methods:**
- `public abstract java.lang.String substitute(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.config.providers.XWorkConfigurationProvider`
implements `com.opensymphony.xwork2.config.ConfigurationProvider`  

**Constructors:**
- `public XWorkConfigurationProvider()`

**Methods:**
- `public void destroy()`
- `public void init(com.opensymphony.xwork2.config.Configuration p0) throws com.opensymphony.xwork2.config.ConfigurationException`
- `public void loadPackages() throws com.opensymphony.xwork2.config.ConfigurationException`
- `public boolean needsReload()`
- `public void register(com.opensymphony.xwork2.inject.ContainerBuilder p0, com.opensymphony.xwork2.util.location.LocatableProperties p1) throws com.opensymphony.xwork2.config.ConfigurationException`

---

## public class `com.opensymphony.xwork2.config.providers.XmlConfigurationProvider`
implements `com.opensymphony.xwork2.config.ConfigurationProvider`  

**Constructors:**
- `public XmlConfigurationProvider()`
- `public XmlConfigurationProvider(java.lang.String p0)`
- `public XmlConfigurationProvider(java.lang.String p0, boolean p1)`

**Methods:**
- `protected void addAction(org.w3c.dom.Element p0, com.opensymphony.xwork2.config.entities.PackageConfig$Builder p1) throws com.opensymphony.xwork2.config.ConfigurationException`
- `protected com.opensymphony.xwork2.config.entities.PackageConfig addPackage(org.w3c.dom.Element p0) throws com.opensymphony.xwork2.config.ConfigurationException`
- `protected void addResultTypes(com.opensymphony.xwork2.config.entities.PackageConfig$Builder p0, org.w3c.dom.Element p1)`
- `protected java.util.Set buildAllowedMethods(org.w3c.dom.Element p0, com.opensymphony.xwork2.config.entities.PackageConfig$Builder p1)`
- `protected java.util.List buildExceptionMappings(org.w3c.dom.Element p0, com.opensymphony.xwork2.config.entities.PackageConfig$Builder p1)`
- `protected java.util.List buildInterceptorList(org.w3c.dom.Element p0, com.opensymphony.xwork2.config.entities.PackageConfig$Builder p1) throws com.opensymphony.xwork2.config.ConfigurationException`
- `protected com.opensymphony.xwork2.config.entities.PackageConfig$Builder buildPackageContext(org.w3c.dom.Element p0)`
- `protected java.util.Map buildResults(org.w3c.dom.Element p0, com.opensymphony.xwork2.config.entities.PackageConfig$Builder p1)`
- `public void destroy()`
- `public boolean equals(java.lang.Object p0)`
- `protected java.util.Iterator getConfigurationUrls(java.lang.String p0) throws java.io.IOException`
- `public java.util.Map getDtdMappings()`
- `protected java.lang.String guessResultType(java.lang.String p0)`
- `public int hashCode()`
- `public void init(com.opensymphony.xwork2.config.Configuration p0)`
- `protected void loadDefaultActionRef(com.opensymphony.xwork2.config.entities.PackageConfig$Builder p0, org.w3c.dom.Element p1)`
- `protected void loadDefaultClassRef(com.opensymphony.xwork2.config.entities.PackageConfig$Builder p0, org.w3c.dom.Element p1)`
- `protected void loadDefaultInterceptorRef(com.opensymphony.xwork2.config.entities.PackageConfig$Builder p0, org.w3c.dom.Element p1)`
- `protected void loadExtraConfiguration(org.w3c.dom.Document p0)`
- `protected void loadGlobalAllowedMethods(com.opensymphony.xwork2.config.entities.PackageConfig$Builder p0, org.w3c.dom.Element p1)`
- `protected void loadGlobalExceptionMappings(com.opensymphony.xwork2.config.entities.PackageConfig$Builder p0, org.w3c.dom.Element p1)`
- `protected void loadGlobalResults(com.opensymphony.xwork2.config.entities.PackageConfig$Builder p0, org.w3c.dom.Element p1)`
- `protected com.opensymphony.xwork2.config.entities.InterceptorStackConfig loadInterceptorStack(org.w3c.dom.Element p0, com.opensymphony.xwork2.config.entities.PackageConfig$Builder p1) throws com.opensymphony.xwork2.config.ConfigurationException`
- `protected void loadInterceptorStacks(org.w3c.dom.Element p0, com.opensymphony.xwork2.config.entities.PackageConfig$Builder p1) throws com.opensymphony.xwork2.config.ConfigurationException`
- `protected void loadInterceptors(com.opensymphony.xwork2.config.entities.PackageConfig$Builder p0, org.w3c.dom.Element p1) throws com.opensymphony.xwork2.config.ConfigurationException`
- `public void loadPackages() throws com.opensymphony.xwork2.config.ConfigurationException`
- `public boolean needsReload()`
- `public void register(com.opensymphony.xwork2.inject.ContainerBuilder p0, com.opensymphony.xwork2.util.location.LocatableProperties p1) throws com.opensymphony.xwork2.config.ConfigurationException`
- `public void setDtdMappings(java.util.Map p0)`
- `public void setFileManagerFactory(com.opensymphony.xwork2.FileManagerFactory p0)`
- `public void setObjectFactory(com.opensymphony.xwork2.ObjectFactory p0)`
- `public void setThrowExceptionOnDuplicateBeans(boolean p0)`
- `public void setValueSubstitutor(com.opensymphony.xwork2.config.providers.ValueSubstitutor p0)`
- `public java.lang.String toString()`
- `protected boolean verifyAction(java.lang.String p0, java.lang.String p1, com.opensymphony.xwork2.util.location.Location p2)`
- `protected java.lang.Class verifyResultType(java.lang.String p0, com.opensymphony.xwork2.util.location.Location p1)`

---

## public class `com.opensymphony.xwork2.config.providers.XmlHelper`

**Constructors:**
- `public XmlHelper()`

**Methods:**
- `public static java.lang.String getContent(org.w3c.dom.Element p0)`
- `public static java.lang.Integer getLoadOrder(org.w3c.dom.Document p0)`
- `public static java.util.Map getParams(org.w3c.dom.Element p0)`

---

## public abstract interface `com.opensymphony.xwork2.conversion.ConversionAnnotationProcessor`

**Methods:**
- `public abstract void process(java.util.Map p0, com.opensymphony.xwork2.conversion.annotations.TypeConversion p1, java.lang.String p2)`

---

## public abstract interface `com.opensymphony.xwork2.conversion.ConversionFileProcessor`

**Methods:**
- `public abstract void process(java.util.Map p0, java.lang.Class p1, java.lang.String p2)`

---

## public abstract interface `com.opensymphony.xwork2.conversion.ConversionPropertiesProcessor`

**Methods:**
- `public abstract void process(java.lang.String p0)`
- `public abstract void processRequired(java.lang.String p0)`

---

## public abstract interface `com.opensymphony.xwork2.conversion.NullHandler`

**Methods:**
- `public abstract java.lang.Object nullMethodResult(java.util.Map p0, java.lang.Object p1, java.lang.String p2, java.lang.Object[] p3)`
- `public abstract java.lang.Object nullPropertyValue(java.util.Map p0, java.lang.Object p1, java.lang.Object p2)`

---

## public abstract interface `com.opensymphony.xwork2.conversion.ObjectTypeDeterminer`

**Methods:**
- `public abstract java.lang.Class getElementClass(java.lang.Class p0, java.lang.String p1, java.lang.Object p2)`
- `public abstract java.lang.Class getKeyClass(java.lang.Class p0, java.lang.String p1)`
- `public abstract java.lang.String getKeyProperty(java.lang.Class p0, java.lang.String p1)`
- `public abstract boolean shouldCreateIfNew(java.lang.Class p0, java.lang.String p1, java.lang.Object p2, java.lang.String p3, boolean p4)`

---

## public class `com.opensymphony.xwork2.conversion.TypeConversionException`
extends `com.opensymphony.xwork2.XWorkException`  

**Constructors:**
- `public TypeConversionException()`
- `public TypeConversionException(java.lang.String p0)`
- `public TypeConversionException(java.lang.String p0, java.lang.Throwable p1)`
- `public TypeConversionException(java.lang.Throwable p0)`

---

## public abstract interface `com.opensymphony.xwork2.conversion.TypeConverter`

**Fields:**
- `public final static java.lang.Object NO_CONVERSION_POSSIBLE`
- `public final static java.lang.String TYPE_CONVERTER_CONTEXT_KEY`

**Methods:**
- `public abstract java.lang.Object convertValue(java.util.Map p0, java.lang.Object p1, java.lang.reflect.Member p2, java.lang.String p3, java.lang.Object p4, java.lang.Class p5)`

---

## public abstract interface `com.opensymphony.xwork2.conversion.TypeConverterCreator`

**Methods:**
- `public abstract com.opensymphony.xwork2.conversion.TypeConverter createTypeConverter(java.lang.Class p0) throws java.lang.Exception`
- `public abstract com.opensymphony.xwork2.conversion.TypeConverter createTypeConverter(java.lang.String p0) throws java.lang.Exception`

---

## public abstract interface `com.opensymphony.xwork2.conversion.TypeConverterHolder`

**Methods:**
- `public abstract void addDefaultMapping(java.lang.String p0, com.opensymphony.xwork2.conversion.TypeConverter p1)`
- `public abstract void addMapping(java.lang.Class p0, java.util.Map p1)`
- `public abstract void addNoMapping(java.lang.Class p0)`
- `public abstract void addUnknownMapping(java.lang.String p0)`
- `public abstract boolean containsDefaultMapping(java.lang.String p0)`
- `public abstract boolean containsNoMapping(java.lang.Class p0)`
- `public abstract boolean containsUnknownMapping(java.lang.String p0)`
- `public abstract com.opensymphony.xwork2.conversion.TypeConverter getDefaultMapping(java.lang.String p0)`
- `public abstract java.util.Map getMapping(java.lang.Class p0)`

---

## public abstract interface `com.opensymphony.xwork2.conversion.annotations.Conversion`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public final enum `com.opensymphony.xwork2.conversion.annotations.ConversionRule`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.opensymphony.xwork2.conversion.annotations.ConversionRule COLLECTION`
- `public final static com.opensymphony.xwork2.conversion.annotations.ConversionRule CREATE_IF_NULL`
- `public final static com.opensymphony.xwork2.conversion.annotations.ConversionRule ELEMENT`
- `public final static com.opensymphony.xwork2.conversion.annotations.ConversionRule KEY`
- `public final static com.opensymphony.xwork2.conversion.annotations.ConversionRule KEY_PROPERTY`
- `public final static com.opensymphony.xwork2.conversion.annotations.ConversionRule MAP`
- `public final static com.opensymphony.xwork2.conversion.annotations.ConversionRule PROPERTY`

**Methods:**
- `public java.lang.String toString()`

---

## public final enum `com.opensymphony.xwork2.conversion.annotations.ConversionType`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.opensymphony.xwork2.conversion.annotations.ConversionType APPLICATION`
- `public final static com.opensymphony.xwork2.conversion.annotations.ConversionType CLASS`

**Methods:**
- `public java.lang.String toString()`

---

## public abstract interface `com.opensymphony.xwork2.conversion.annotations.TypeConversion`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public class `com.opensymphony.xwork2.conversion.impl.ArrayConverter`
extends `com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter`  

**Constructors:**
- `public ArrayConverter()`

**Methods:**
- `public java.lang.Object convertValue(java.util.Map p0, java.lang.Object p1, java.lang.reflect.Member p2, java.lang.String p3, java.lang.Object p4, java.lang.Class p5)`

---

## public class `com.opensymphony.xwork2.conversion.impl.CollectionConverter`
extends `com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter`  

**Constructors:**
- `public CollectionConverter()`

**Methods:**
- `public java.lang.Object convertValue(java.util.Map p0, java.lang.Object p1, java.lang.reflect.Member p2, java.lang.String p3, java.lang.Object p4, java.lang.Class p5)`
- `public void setObjectTypeDeterminer(com.opensymphony.xwork2.conversion.ObjectTypeDeterminer p0)`

---

## public class `com.opensymphony.xwork2.conversion.impl.DateConverter`
extends `com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter`  

**Constructors:**
- `public DateConverter()`

**Methods:**
- `public java.lang.Object convertValue(java.util.Map p0, java.lang.Object p1, java.lang.reflect.Member p2, java.lang.String p3, java.lang.Object p4, java.lang.Class p5)`

---

## public class `com.opensymphony.xwork2.conversion.impl.DefaultConversionAnnotationProcessor`
implements `com.opensymphony.xwork2.conversion.ConversionAnnotationProcessor`  

**Constructors:**
- `public DefaultConversionAnnotationProcessor()`

**Methods:**
- `public void process(java.util.Map p0, com.opensymphony.xwork2.conversion.annotations.TypeConversion p1, java.lang.String p2)`
- `public void setTypeConverterCreator(com.opensymphony.xwork2.conversion.TypeConverterCreator p0)`
- `public void setTypeConverterHolder(com.opensymphony.xwork2.conversion.TypeConverterHolder p0)`

---

## public class `com.opensymphony.xwork2.conversion.impl.DefaultConversionFileProcessor`
implements `com.opensymphony.xwork2.conversion.ConversionFileProcessor`  

**Constructors:**
- `public DefaultConversionFileProcessor()`

**Methods:**
- `public void process(java.util.Map p0, java.lang.Class p1, java.lang.String p2)`
- `public void setFileManagerFactory(com.opensymphony.xwork2.FileManagerFactory p0)`
- `public void setTypeConverterCreator(com.opensymphony.xwork2.conversion.TypeConverterCreator p0)`

---

## public class `com.opensymphony.xwork2.conversion.impl.DefaultConversionPropertiesProcessor`
implements `com.opensymphony.xwork2.conversion.ConversionPropertiesProcessor`, `com.opensymphony.xwork2.inject.EarlyInitializable`  

**Constructors:**
- `public DefaultConversionPropertiesProcessor()`

**Methods:**
- `public void init()`
- `public void loadConversionProperties(java.lang.String p0, boolean p1)`
- `public void process(java.lang.String p0)`
- `public void processRequired(java.lang.String p0)`
- `public void setTypeConverterCreator(com.opensymphony.xwork2.conversion.TypeConverterCreator p0)`
- `public void setTypeConverterHolder(com.opensymphony.xwork2.conversion.TypeConverterHolder p0)`

---

## public class `com.opensymphony.xwork2.conversion.impl.DefaultObjectTypeDeterminer`
implements `com.opensymphony.xwork2.conversion.ObjectTypeDeterminer`  

**Constructors:**
- `public DefaultObjectTypeDeterminer(com.opensymphony.xwork2.conversion.impl.XWorkConverter p0, com.opensymphony.xwork2.util.reflection.ReflectionProvider p1)`

**Fields:**
- `public final static java.lang.String CREATE_IF_NULL_PREFIX`
- `public final static java.lang.String DEPRECATED_ELEMENT_PREFIX`
- `public final static java.lang.String ELEMENT_PREFIX`
- `public final static java.lang.String KEY_PREFIX`
- `public final static java.lang.String KEY_PROPERTY_PREFIX`
- `protected final static org.apache.logging.log4j.Logger LOG`

**Methods:**
- `protected <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class p0, java.lang.String p1, java.lang.Class p2)`
- `public java.lang.Class getElementClass(java.lang.Class p0, java.lang.String p1, java.lang.Object p2)`
- `public java.lang.Class getKeyClass(java.lang.Class p0, java.lang.String p1)`
- `public java.lang.String getKeyProperty(java.lang.Class p0, java.lang.String p1)`
- `public boolean shouldCreateIfNew(java.lang.Class p0, java.lang.String p1, java.lang.Object p2, java.lang.String p3, boolean p4)`

---

## public abstract class `com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter`
implements `com.opensymphony.xwork2.conversion.TypeConverter`  

**Constructors:**
- `public DefaultTypeConverter()`

**Fields:**
- `protected static java.lang.String MILLISECOND_FORMAT`

**Methods:**
- `public static java.math.BigDecimal bigDecValue(java.lang.Object p0) throws java.lang.NumberFormatException`
- `public static java.math.BigInteger bigIntValue(java.lang.Object p0) throws java.lang.NumberFormatException`
- `public static boolean booleanValue(java.lang.Object p0)`
- `public java.lang.Object convertValue(java.lang.Object p0, java.lang.Class p1)`
- `public java.lang.Object convertValue(java.util.Map p0, java.lang.Object p1, java.lang.Class p2)`
- `public java.lang.Object convertValue(java.util.Map p0, java.lang.Object p1, java.lang.reflect.Member p2, java.lang.String p3, java.lang.Object p4, java.lang.Class p5)`
- `public static double doubleValue(java.lang.Object p0) throws java.lang.NumberFormatException`
- `public java.lang.Enum enumValue(java.lang.Class p0, java.lang.Object p1)`
- `protected java.util.Locale getLocale(java.util.Map p0)`
- `public com.opensymphony.xwork2.conversion.TypeConverter getTypeConverter(java.util.Map p0)`
- `public static long longValue(java.lang.Object p0) throws java.lang.NumberFormatException`
- `public void setContainer(com.opensymphony.xwork2.inject.Container p0)`
- `public static java.lang.String stringValue(java.lang.Object p0)`
- `public static java.lang.String stringValue(java.lang.Object p0, boolean p1)`

---

## public class `com.opensymphony.xwork2.conversion.impl.DefaultTypeConverterCreator`
implements `com.opensymphony.xwork2.conversion.TypeConverterCreator`  

**Constructors:**
- `public DefaultTypeConverterCreator()`

**Methods:**
- `public com.opensymphony.xwork2.conversion.TypeConverter createTypeConverter(java.lang.Class p0) throws java.lang.Exception`
- `public com.opensymphony.xwork2.conversion.TypeConverter createTypeConverter(java.lang.String p0) throws java.lang.Exception`
- `protected com.opensymphony.xwork2.conversion.TypeConverter getTypeConverter(java.lang.Object p0)`
- `public void setObjectFactory(com.opensymphony.xwork2.ObjectFactory p0)`

---

## public class `com.opensymphony.xwork2.conversion.impl.DefaultTypeConverterHolder`
implements `com.opensymphony.xwork2.conversion.TypeConverterHolder`  

**Constructors:**
- `public DefaultTypeConverterHolder()`

**Fields:**
- `protected java.util.HashSet unknownMappings`

**Methods:**
- `public void addDefaultMapping(java.lang.String p0, com.opensymphony.xwork2.conversion.TypeConverter p1)`
- `public void addMapping(java.lang.Class p0, java.util.Map p1)`
- `public void addNoMapping(java.lang.Class p0)`
- `public void addUnknownMapping(java.lang.String p0)`
- `public boolean containsDefaultMapping(java.lang.String p0)`
- `public boolean containsNoMapping(java.lang.Class p0)`
- `public boolean containsUnknownMapping(java.lang.String p0)`
- `public com.opensymphony.xwork2.conversion.TypeConverter getDefaultMapping(java.lang.String p0)`
- `public java.util.Map getMapping(java.lang.Class p0)`

---

## public class `com.opensymphony.xwork2.conversion.impl.InstantiatingNullHandler`
implements `com.opensymphony.xwork2.conversion.NullHandler`  

**Constructors:**
- `public InstantiatingNullHandler()`

**Methods:**
- `public java.lang.Object nullMethodResult(java.util.Map p0, java.lang.Object p1, java.lang.String p2, java.lang.Object[] p3)`
- `public java.lang.Object nullPropertyValue(java.util.Map p0, java.lang.Object p1, java.lang.Object p2)`
- `public void setObjectFactory(com.opensymphony.xwork2.ObjectFactory p0)`
- `public void setObjectTypeDeterminer(com.opensymphony.xwork2.conversion.ObjectTypeDeterminer p0)`
- `public void setReflectionProvider(com.opensymphony.xwork2.util.reflection.ReflectionProvider p0)`

---

## public class `com.opensymphony.xwork2.conversion.impl.NumberConverter`
extends `com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter`  

**Constructors:**
- `public NumberConverter()`

**Methods:**
- `protected java.lang.Object convertToBigDecimal(java.util.Map p0, java.lang.String p1)`
- `protected java.lang.Object convertToDouble(java.util.Map p0, java.lang.String p1)`
- `protected java.lang.Object convertToFloat(java.util.Map p0, java.lang.String p1)`
- `public java.lang.Object convertValue(java.util.Map p0, java.lang.Object p1, java.lang.reflect.Member p2, java.lang.String p3, java.lang.Object p4, java.lang.Class p5)`
- `protected java.text.NumberFormat getNumberFormat(java.util.Locale p0)`
- `protected boolean isInRange(java.lang.Number p0, java.lang.String p1, java.lang.Class p2)`
- `protected java.lang.String normalize(java.lang.String p0, char p1)`

---

## public class `com.opensymphony.xwork2.conversion.impl.StringConverter`
extends `com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter`  

**Constructors:**
- `public StringConverter()`

**Methods:**
- `protected java.lang.String convertToString(java.util.Locale p0, java.lang.Object p1)`
- `public java.lang.Object convertValue(java.util.Map p0, java.lang.Object p1, java.lang.reflect.Member p2, java.lang.String p3, java.lang.Object p4, java.lang.Class p5)`

---

## public class `com.opensymphony.xwork2.conversion.impl.XWorkBasicConverter`
extends `com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter`  

**Constructors:**
- `public XWorkBasicConverter()`

**Methods:**
- `public java.lang.Object convertValue(java.util.Map p0, java.lang.Object p1, java.lang.reflect.Member p2, java.lang.String p3, java.lang.Object p4, java.lang.Class p5)`
- `public void setContainer(com.opensymphony.xwork2.inject.Container p0)`

---

## public class `com.opensymphony.xwork2.conversion.impl.XWorkConverter`
extends `com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter`  

**Constructors:**
- `protected XWorkConverter()`

**Fields:**
- `public final static java.lang.String CONVERSION_COLLECTION_PREFIX`
- `public final static java.lang.String CONVERSION_ERROR_PROPERTY_PREFIX`
- `public final static java.lang.String CONVERSION_PROPERTY_FULLNAME`
- `public final static java.lang.String LAST_BEAN_CLASS_ACCESSED`
- `public final static java.lang.String LAST_BEAN_PROPERTY_ACCESSED`
- `public final static java.lang.String MESSAGE_INDEX_BRACKET_PATTERN`
- `public final static java.lang.String MESSAGE_INDEX_PATTERN`
- `public final static java.lang.String PERIOD`
- `public final static java.lang.String REPORT_CONVERSION_ERRORS`
- `public final static java.util.regex.Pattern messageIndexPattern`

**Methods:**
- `protected void addConverterMapping(java.util.Map p0, java.lang.Class p1)`
- `public java.lang.String buildConverterFilename(java.lang.Class p0)`
- `protected java.util.Map buildConverterMapping(java.lang.Class p0) throws java.lang.Exception`
- `public java.lang.Object convertValue(java.util.Map p0, java.lang.Object p1, java.lang.Class p2)`
- `public java.lang.Object convertValue(java.util.Map p0, java.lang.Object p1, java.lang.reflect.Member p2, java.lang.String p3, java.lang.Object p4, java.lang.Class p5)`
- `public static java.lang.String getConversionErrorMessage(java.lang.String p0, com.opensymphony.xwork2.util.ValueStack p1)`
- `protected java.lang.Object getConverter(java.lang.Class p0, java.lang.String p1)`
- `protected void handleConversionException(java.util.Map p0, java.lang.String p1, java.lang.Object p2, java.lang.Object p3)`
- `public com.opensymphony.xwork2.conversion.TypeConverter lookup(java.lang.Class p0)`
- `public com.opensymphony.xwork2.conversion.TypeConverter lookup(java.lang.String p0, boolean p1)`
- `public synchronized void registerConverter(java.lang.String p0, com.opensymphony.xwork2.conversion.TypeConverter p1)`
- `public synchronized void registerConverterNotFound(java.lang.String p0)`
- `public void setConversionAnnotationProcessor(com.opensymphony.xwork2.conversion.ConversionAnnotationProcessor p0)`
- `public void setConversionFileProcessor(com.opensymphony.xwork2.conversion.ConversionFileProcessor p0)`
- `public void setDefaultTypeConverter(com.opensymphony.xwork2.conversion.impl.XWorkBasicConverter p0)`
- `public void setFileManagerFactory(com.opensymphony.xwork2.FileManagerFactory p0)`
- `public void setReloadingConfigs(java.lang.String p0)`
- `public void setTypeConverterHolder(com.opensymphony.xwork2.conversion.TypeConverterHolder p0)`

---

## public class `com.opensymphony.xwork2.conversion.impl.XWorkList`
extends `java.util.ArrayList`  

**Constructors:**
- `public XWorkList(java.lang.Class p0)`
- `public XWorkList(java.lang.Class p0, int p1)`

**Methods:**
- `public void add(int p0, java.lang.Object p1)`
- `public boolean add(java.lang.Object p0)`
- `public boolean addAll(int p0, java.util.Collection p1)`
- `public boolean addAll(java.util.Collection p0)`
- `public boolean contains(java.lang.Object p0)`
- `public synchronized java.lang.Object get(int p0)`
- `public java.lang.Object set(int p0, java.lang.Object p1)`

---

## public class `com.opensymphony.xwork2.conversion.metadata.ConversionDescription`
annotations: @java.lang.Deprecated  

**Constructors:**
- `public ConversionDescription()`
- `public ConversionDescription(java.lang.String p0)`

**Fields:**
- `public final static java.lang.String DEPRECATED_ELEMENT_PREFIX`
- `public final static java.lang.String ELEMENT_PREFIX`
- `public final static java.lang.String KEY_PREFIX`
- `public final static java.lang.String KEY_PROPERTY_PREFIX`
- `public java.lang.String fullQualifiedClassName`
- `protected static org.apache.logging.log4j.Logger log`
- `public java.lang.String property`
- `public java.lang.String rule`
- `public java.lang.String type`
- `public java.lang.String typeConverter`
- `public java.lang.String value`

**Methods:**
- `public java.lang.String asProperty()`
- `public java.lang.String getFullQualifiedClassName()`
- `public java.lang.String getType()`
- `public java.lang.String getValue()`
- `public void setFullQualifiedClassName(java.lang.String p0)`
- `public void setProperty(java.lang.String p0)`
- `public void setRule(java.lang.String p0)`
- `public void setType(java.lang.String p0)`
- `public void setTypeConverter(java.lang.String p0)`
- `public void setValue(java.lang.String p0)`

---

## public abstract interface `com.opensymphony.xwork2.factory.ActionFactory`

**Methods:**
- `public abstract java.lang.Object buildAction(java.lang.String p0, java.lang.String p1, com.opensymphony.xwork2.config.entities.ActionConfig p2, java.util.Map p3) throws java.lang.Exception`

---

## public abstract interface `com.opensymphony.xwork2.factory.ConverterFactory`

**Methods:**
- `public abstract com.opensymphony.xwork2.conversion.TypeConverter buildConverter(java.lang.Class p0, java.util.Map p1) throws java.lang.Exception`

---

## public class `com.opensymphony.xwork2.factory.DefaultActionFactory`
implements `com.opensymphony.xwork2.factory.ActionFactory`  

**Constructors:**
- `public DefaultActionFactory()`

**Methods:**
- `public java.lang.Object buildAction(java.lang.String p0, java.lang.String p1, com.opensymphony.xwork2.config.entities.ActionConfig p2, java.util.Map p3) throws java.lang.Exception`
- `public void setObjectFactory(com.opensymphony.xwork2.ObjectFactory p0)`

---

## public class `com.opensymphony.xwork2.factory.DefaultConverterFactory`
implements `com.opensymphony.xwork2.factory.ConverterFactory`  

**Constructors:**
- `public DefaultConverterFactory()`

**Methods:**
- `public com.opensymphony.xwork2.conversion.TypeConverter buildConverter(java.lang.Class p0, java.util.Map p1) throws java.lang.Exception`
- `public void setContainer(com.opensymphony.xwork2.inject.Container p0)`

---

## public class `com.opensymphony.xwork2.factory.DefaultInterceptorFactory`
implements `com.opensymphony.xwork2.factory.InterceptorFactory`  

**Constructors:**
- `public DefaultInterceptorFactory()`

**Methods:**
- `public com.opensymphony.xwork2.interceptor.Interceptor buildInterceptor(com.opensymphony.xwork2.config.entities.InterceptorConfig p0, java.util.Map p1) throws com.opensymphony.xwork2.config.ConfigurationException`
- `public void setObjectFactory(com.opensymphony.xwork2.ObjectFactory p0)`
- `public void setReflectionProvider(com.opensymphony.xwork2.util.reflection.ReflectionProvider p0)`

---

## public class `com.opensymphony.xwork2.factory.DefaultResultFactory`
implements `com.opensymphony.xwork2.factory.ResultFactory`  

**Constructors:**
- `public DefaultResultFactory()`

**Methods:**
- `public com.opensymphony.xwork2.Result buildResult(com.opensymphony.xwork2.config.entities.ResultConfig p0, java.util.Map p1) throws java.lang.Exception`
- `public void setObjectFactory(com.opensymphony.xwork2.ObjectFactory p0)`
- `public void setReflectionProvider(com.opensymphony.xwork2.util.reflection.ReflectionProvider p0)`

---

## public class `com.opensymphony.xwork2.factory.DefaultUnknownHandlerFactory`
implements `com.opensymphony.xwork2.factory.UnknownHandlerFactory`  

**Constructors:**
- `public DefaultUnknownHandlerFactory()`

**Methods:**
- `public com.opensymphony.xwork2.UnknownHandler buildUnknownHandler(java.lang.String p0, java.util.Map p1) throws java.lang.Exception`
- `public void setContainer(com.opensymphony.xwork2.inject.Container p0)`

---

## public class `com.opensymphony.xwork2.factory.DefaultValidatorFactory`
implements `com.opensymphony.xwork2.factory.ValidatorFactory`  

**Constructors:**
- `public DefaultValidatorFactory()`

**Methods:**
- `public com.opensymphony.xwork2.validator.Validator buildValidator(java.lang.String p0, java.util.Map p1, java.util.Map p2) throws java.lang.Exception`
- `public void setObjectFactory(com.opensymphony.xwork2.ObjectFactory p0)`
- `public void setReflectionProvider(com.opensymphony.xwork2.util.reflection.ReflectionProvider p0)`

---

## public abstract interface `com.opensymphony.xwork2.factory.InterceptorFactory`

**Methods:**
- `public abstract com.opensymphony.xwork2.interceptor.Interceptor buildInterceptor(com.opensymphony.xwork2.config.entities.InterceptorConfig p0, java.util.Map p1) throws com.opensymphony.xwork2.config.ConfigurationException`

---

## public abstract interface `com.opensymphony.xwork2.factory.ResultFactory`

**Methods:**
- `public abstract com.opensymphony.xwork2.Result buildResult(com.opensymphony.xwork2.config.entities.ResultConfig p0, java.util.Map p1) throws java.lang.Exception`

---

## public abstract interface `com.opensymphony.xwork2.factory.UnknownHandlerFactory`

**Methods:**
- `public abstract com.opensymphony.xwork2.UnknownHandler buildUnknownHandler(java.lang.String p0, java.util.Map p1) throws java.lang.Exception`

---

## public abstract interface `com.opensymphony.xwork2.factory.ValidatorFactory`

**Methods:**
- `public abstract com.opensymphony.xwork2.validator.Validator buildValidator(java.lang.String p0, java.util.Map p1, java.util.Map p2) throws java.lang.Exception`

---

## public abstract interface `com.opensymphony.xwork2.inject.Container`
implements `java.io.Serializable`  

**Fields:**
- `public final static java.lang.String DEFAULT_NAME`

**Methods:**
- `public abstract <T extends java.lang.Object> T getInstance(java.lang.Class p0)`
- `public abstract <T extends java.lang.Object> T getInstance(java.lang.Class p0, java.lang.String p1)`
- `public abstract java.util.Set getInstanceNames(java.lang.Class p0)`
- `public abstract <T extends java.lang.Object> T inject(java.lang.Class p0)`
- `public abstract void inject(java.lang.Object p0)`
- `public abstract void removeScopeStrategy()`
- `public abstract void setScopeStrategy(com.opensymphony.xwork2.inject.Scope$Strategy p0)`

---

## public final class `com.opensymphony.xwork2.inject.ContainerBuilder`

**Constructors:**
- `public ContainerBuilder()`

**Methods:**
- `public <T extends java.lang.Object> com.opensymphony.xwork2.inject.ContainerBuilder alias(java.lang.Class p0, java.lang.String p1)`
- `public <T extends java.lang.Object> com.opensymphony.xwork2.inject.ContainerBuilder alias(java.lang.Class p0, java.lang.String p1, java.lang.String p2)`
- `public <E extends java.lang.Enum<E>> com.opensymphony.xwork2.inject.ContainerBuilder constant(java.lang.String p0, E p1)`
- `public com.opensymphony.xwork2.inject.ContainerBuilder constant(java.lang.String p0, boolean p1)`
- `public com.opensymphony.xwork2.inject.ContainerBuilder constant(java.lang.String p0, char p1)`
- `public com.opensymphony.xwork2.inject.ContainerBuilder constant(java.lang.String p0, double p1)`
- `public com.opensymphony.xwork2.inject.ContainerBuilder constant(java.lang.String p0, float p1)`
- `public com.opensymphony.xwork2.inject.ContainerBuilder constant(java.lang.String p0, int p1)`
- `public com.opensymphony.xwork2.inject.ContainerBuilder constant(java.lang.String p0, java.lang.Class p1)`
- `public com.opensymphony.xwork2.inject.ContainerBuilder constant(java.lang.String p0, java.lang.String p1)`
- `public com.opensymphony.xwork2.inject.ContainerBuilder constant(java.lang.String p0, long p1)`
- `public com.opensymphony.xwork2.inject.ContainerBuilder constant(java.lang.String p0, short p1)`
- `public boolean contains(java.lang.Class p0)`
- `public boolean contains(java.lang.Class p0, java.lang.String p1)`
- `public com.opensymphony.xwork2.inject.Container create(boolean p0)`
- `public <T extends java.lang.Object> com.opensymphony.xwork2.inject.ContainerBuilder factory(java.lang.Class p0)`
- `public <T extends java.lang.Object> com.opensymphony.xwork2.inject.ContainerBuilder factory(java.lang.Class p0, com.opensymphony.xwork2.inject.Factory p1)`
- `public <T extends java.lang.Object> com.opensymphony.xwork2.inject.ContainerBuilder factory(java.lang.Class p0, com.opensymphony.xwork2.inject.Factory p1, com.opensymphony.xwork2.inject.Scope p2)`
- `public <T extends java.lang.Object> com.opensymphony.xwork2.inject.ContainerBuilder factory(java.lang.Class p0, com.opensymphony.xwork2.inject.Scope p1)`
- `public <T extends java.lang.Object> com.opensymphony.xwork2.inject.ContainerBuilder factory(java.lang.Class p0, java.lang.Class p1)`
- `public <T extends java.lang.Object> com.opensymphony.xwork2.inject.ContainerBuilder factory(java.lang.Class p0, java.lang.Class p1, com.opensymphony.xwork2.inject.Scope p2)`
- `public <T extends java.lang.Object> com.opensymphony.xwork2.inject.ContainerBuilder factory(java.lang.Class p0, java.lang.String p1)`
- `public <T extends java.lang.Object> com.opensymphony.xwork2.inject.ContainerBuilder factory(java.lang.Class p0, java.lang.String p1, com.opensymphony.xwork2.inject.Factory p2)`
- `public <T extends java.lang.Object> com.opensymphony.xwork2.inject.ContainerBuilder factory(java.lang.Class p0, java.lang.String p1, com.opensymphony.xwork2.inject.Factory p2, com.opensymphony.xwork2.inject.Scope p3)`
- `public <T extends java.lang.Object> com.opensymphony.xwork2.inject.ContainerBuilder factory(java.lang.Class p0, java.lang.String p1, com.opensymphony.xwork2.inject.Scope p2)`
- `public <T extends java.lang.Object> com.opensymphony.xwork2.inject.ContainerBuilder factory(java.lang.Class p0, java.lang.String p1, java.lang.Class p2)`
- `public <T extends java.lang.Object> com.opensymphony.xwork2.inject.ContainerBuilder factory(java.lang.Class p0, java.lang.String p1, java.lang.Class p2, com.opensymphony.xwork2.inject.Scope p3)`
- `public com.opensymphony.xwork2.inject.ContainerBuilder injectStatics(java.lang.Class... p0)`
- `public void setAllowDuplicates(boolean p0)`

---

## public abstract static interface `com.opensymphony.xwork2.inject.ContainerBuilder$Command`

**Methods:**
- `public abstract void build(com.opensymphony.xwork2.inject.ContainerBuilder p0)`

---

## public abstract interface `com.opensymphony.xwork2.inject.Context`

**Methods:**
- `public abstract com.opensymphony.xwork2.inject.Container getContainer()`
- `public abstract java.lang.reflect.Member getMember()`
- `public abstract java.lang.String getName()`
- `public abstract com.opensymphony.xwork2.inject.Scope$Strategy getScopeStrategy()`
- `public abstract java.lang.Class getType()`

---

## public class `com.opensymphony.xwork2.inject.DependencyException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public DependencyException(java.lang.String p0)`
- `public DependencyException(java.lang.String p0, java.lang.Throwable p1)`
- `public DependencyException(java.lang.Throwable p0)`

---

## public abstract interface `com.opensymphony.xwork2.inject.EarlyInitializable`
implements `com.opensymphony.xwork2.inject.Initializable`  

---

## public abstract interface `com.opensymphony.xwork2.inject.Factory`<T extends java.lang.Object>

**Methods:**
- `public abstract T create(com.opensymphony.xwork2.inject.Context p0) throws java.lang.Exception`
- `public abstract java.lang.Class type()`

---

## public abstract interface `com.opensymphony.xwork2.inject.Initializable`

**Methods:**
- `public abstract void init()`

---

## public abstract interface `com.opensymphony.xwork2.inject.Inject`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract sealed enum `com.opensymphony.xwork2.inject.Scope`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.opensymphony.xwork2.inject.Scope PROTOTYPE`
- `public final static com.opensymphony.xwork2.inject.Scope REQUEST`
- `public final static com.opensymphony.xwork2.inject.Scope SESSION`
- `public final static com.opensymphony.xwork2.inject.Scope SINGLETON`
- `public final static com.opensymphony.xwork2.inject.Scope THREAD`
- `public final static com.opensymphony.xwork2.inject.Scope WIZARD`

---

## public abstract static interface `com.opensymphony.xwork2.inject.Scope$Strategy`

**Methods:**
- `public abstract <T extends java.lang.Object> T findInRequest(java.lang.Class p0, java.lang.String p1, java.util.concurrent.Callable p2) throws java.lang.Exception`
- `public abstract <T extends java.lang.Object> T findInSession(java.lang.Class p0, java.lang.String p1, java.util.concurrent.Callable p2) throws java.lang.Exception`
- `public abstract <T extends java.lang.Object> T findInWizard(java.lang.Class p0, java.lang.String p1, java.util.concurrent.Callable p2) throws java.lang.Exception`

---

## public abstract interface `com.opensymphony.xwork2.inject.Scoped`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract class `com.opensymphony.xwork2.inject.util.FinalizablePhantomReference`<T extends java.lang.Object>
extends `java.lang.ref.PhantomReference`  
implements `com.opensymphony.xwork2.inject.util.FinalizableReference`  

**Constructors:**
- `protected FinalizablePhantomReference(T p0)`

---

## public abstract class `com.opensymphony.xwork2.inject.util.FinalizableSoftReference`<T extends java.lang.Object>
extends `java.lang.ref.SoftReference`  
implements `com.opensymphony.xwork2.inject.util.FinalizableReference`  

**Constructors:**
- `protected FinalizableSoftReference(T p0)`

---

## public abstract class `com.opensymphony.xwork2.inject.util.FinalizableWeakReference`<T extends java.lang.Object>
extends `java.lang.ref.WeakReference`  
implements `com.opensymphony.xwork2.inject.util.FinalizableReference`  

**Constructors:**
- `protected FinalizableWeakReference(T p0)`

---

## public abstract interface `com.opensymphony.xwork2.inject.util.Function`<F extends java.lang.Object, T extends java.lang.Object>

**Methods:**
- `public abstract T apply(F p0)`

---

## public abstract class `com.opensymphony.xwork2.inject.util.ReferenceCache`<K extends java.lang.Object, V extends java.lang.Object>
extends `com.opensymphony.xwork2.inject.util.ReferenceMap`  

**Constructors:**
- `public ReferenceCache()`
- `public ReferenceCache(com.opensymphony.xwork2.inject.util.ReferenceType p0, com.opensymphony.xwork2.inject.util.ReferenceType p1)`

**Methods:**
- `protected void cancel()`
- `protected abstract V create(K p0)`
- `public V get(java.lang.Object p0)`
- `public static <K extends java.lang.Object, V extends java.lang.Object> com.opensymphony.xwork2.inject.util.ReferenceCache of(com.opensymphony.xwork2.inject.util.ReferenceType p0, com.opensymphony.xwork2.inject.util.ReferenceType p1, com.opensymphony.xwork2.inject.util.Function p2)`

---

## public class `com.opensymphony.xwork2.inject.util.ReferenceMap`<K extends java.lang.Object, V extends java.lang.Object>
implements `java.io.Serializable`, `java.util.Map<K,V>`  

**Constructors:**
- `public ReferenceMap(com.opensymphony.xwork2.inject.util.ReferenceType p0, com.opensymphony.xwork2.inject.util.ReferenceType p1)`

**Methods:**
- `public void clear()`
- `public boolean containsKey(java.lang.Object p0)`
- `public boolean containsValue(java.lang.Object p0)`
- `public java.util.Set entrySet()`
- `public V get(java.lang.Object p0)`
- `protected com.opensymphony.xwork2.inject.util.ReferenceMap$PutStrategy getPutStrategy()`
- `public boolean isEmpty()`
- `public java.util.Set keySet()`
- `public V put(K p0, V p1)`
- `public void putAll(java.util.Map p0)`
- `public V putIfAbsent(K p0, V p1)`
- `protected com.opensymphony.xwork2.inject.util.ReferenceMap$Strategy putIfAbsentStrategy()`
- `protected com.opensymphony.xwork2.inject.util.ReferenceMap$Strategy putStrategy()`
- `public V remove(java.lang.Object p0)`
- `public boolean remove(java.lang.Object p0, java.lang.Object p1)`
- `public V replace(K p0, V p1)`
- `public boolean replace(K p0, V p1, V p2)`
- `protected com.opensymphony.xwork2.inject.util.ReferenceMap$Strategy replaceStrategy()`
- `public int size()`
- `public java.util.Collection values()`

---

## protected abstract static interface `com.opensymphony.xwork2.inject.util.ReferenceMap$Strategy`

**Methods:**
- `public abstract java.lang.Object execute(com.opensymphony.xwork2.inject.util.ReferenceMap p0, java.lang.Object p1, java.lang.Object p2)`

---

## public final enum `com.opensymphony.xwork2.inject.util.ReferenceType`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.opensymphony.xwork2.inject.util.ReferenceType PHANTOM`
- `public final static com.opensymphony.xwork2.inject.util.ReferenceType SOFT`
- `public final static com.opensymphony.xwork2.inject.util.ReferenceType STRONG`
- `public final static com.opensymphony.xwork2.inject.util.ReferenceType WEAK`

---

## public class `com.opensymphony.xwork2.inject.util.Strings`
annotations: @java.lang.Deprecated  

**Constructors:**
- `public Strings()`

**Methods:**
- `public static java.lang.String capitalize(java.lang.String p0)`

---

## public abstract class `com.opensymphony.xwork2.interceptor.AbstractInterceptor`
implements `com.opensymphony.xwork2.interceptor.Interceptor`  

**Constructors:**
- `public AbstractInterceptor()`

**Methods:**
- `public void destroy()`
- `public void init()`
- `public abstract java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`

---

## public class `com.opensymphony.xwork2.interceptor.AliasInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public AliasInterceptor()`

**Fields:**
- `protected java.lang.String aliasesKey`
- `protected boolean devMode`
- `protected com.opensymphony.xwork2.LocalizedTextProvider localizedTextProvider`
- `protected com.opensymphony.xwork2.util.ValueStackFactory valueStackFactory`

**Methods:**
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `public void setAliasesKey(java.lang.String p0)`
- `public void setDevMode(java.lang.String p0)`
- `public void setLocalizedTextProvider(com.opensymphony.xwork2.LocalizedTextProvider p0)`
- `public void setValueStackFactory(com.opensymphony.xwork2.util.ValueStackFactory p0)`

---

## public class `com.opensymphony.xwork2.interceptor.ChainingInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public ChainingInterceptor()`

**Fields:**
- `protected java.util.Collection excludes`
- `protected java.util.Collection includes`
- `protected com.opensymphony.xwork2.util.reflection.ReflectionProvider reflectionProvider`

**Methods:**
- `public java.util.Collection getExcludes()`
- `public java.util.Collection getIncludes()`
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `public void setCopyErrors(java.lang.String p0)`
- `public void setCopyFieldErrors(java.lang.String p0)`
- `public void setCopyMessages(java.lang.String p0)`
- `public void setExcludes(java.lang.String p0)`
- `public void setExcludesCollection(java.util.Collection p0)`
- `public void setIncludes(java.lang.String p0)`
- `public void setIncludesCollection(java.util.Collection p0)`
- `public void setReflectionProvider(com.opensymphony.xwork2.util.reflection.ReflectionProvider p0)`

---

## public class `com.opensymphony.xwork2.interceptor.ConversionErrorInterceptor`
extends `com.opensymphony.xwork2.interceptor.MethodFilterInterceptor`  

**Constructors:**
- `public ConversionErrorInterceptor()`

**Fields:**
- `public final static java.lang.String ORIGINAL_PROPERTY_OVERRIDE`

**Methods:**
- `public java.lang.String doIntercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `protected java.lang.String escape(java.lang.Object p0)`
- `protected java.lang.Object getOverrideExpr(com.opensymphony.xwork2.ActionInvocation p0, java.lang.Object p1)`
- `protected boolean shouldAddError(java.lang.String p0, java.lang.Object p1)`

---

## public class `com.opensymphony.xwork2.interceptor.DefaultWorkflowInterceptor`
extends `com.opensymphony.xwork2.interceptor.MethodFilterInterceptor`  

**Constructors:**
- `public DefaultWorkflowInterceptor()`

**Methods:**
- `protected java.lang.String doIntercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `protected java.lang.String processInputConfig(java.lang.Object p0, java.lang.String p1, java.lang.String p2) throws java.lang.Exception`
- `protected java.lang.String processValidationErrorAware(java.lang.Object p0, java.lang.String p1)`
- `public void setInputResultName(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.interceptor.ExceptionHolder`
implements `java.io.Serializable`  

**Constructors:**
- `public ExceptionHolder(java.lang.Exception p0)`

**Methods:**
- `public java.lang.Exception getException()`
- `public java.lang.String getExceptionStack()`

---

## public class `com.opensymphony.xwork2.interceptor.ExceptionMappingInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public ExceptionMappingInterceptor()`

**Fields:**
- `protected org.apache.logging.log4j.Logger categoryLogger`
- `protected java.lang.String logCategory`
- `protected boolean logEnabled`
- `protected java.lang.String logLevel`

**Methods:**
- `protected void doLog(org.apache.logging.log4j.Logger p0, java.lang.Exception p1)`
- `protected com.opensymphony.xwork2.config.entities.ExceptionMappingConfig findMappingFromExceptions(java.util.List p0, java.lang.Throwable p1)`
- `public int getDepth(java.lang.String p0, java.lang.Throwable p1)`
- `public java.lang.String getLogCategory()`
- `public java.lang.String getLogLevel()`
- `protected void handleLogging(java.lang.Exception p0)`
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `public boolean isLogEnabled()`
- `protected void publishException(com.opensymphony.xwork2.ActionInvocation p0, com.opensymphony.xwork2.interceptor.ExceptionHolder p1)`
- `public void setLogCategory(java.lang.String p0)`
- `public void setLogEnabled(boolean p0)`
- `public void setLogLevel(java.lang.String p0)`

---

## public abstract interface `com.opensymphony.xwork2.interceptor.Interceptor`
implements `java.io.Serializable`  

**Methods:**
- `public abstract void destroy()`
- `public abstract void init()`
- `public abstract java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`

---

## public class `com.opensymphony.xwork2.interceptor.LoggingInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public LoggingInterceptor()`

**Methods:**
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`

---

## public abstract class `com.opensymphony.xwork2.interceptor.MethodFilterInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public MethodFilterInterceptor()`

**Fields:**
- `protected java.util.Set excludeMethods`
- `protected java.util.Set includeMethods`

**Methods:**
- `protected boolean applyInterceptor(com.opensymphony.xwork2.ActionInvocation p0)`
- `protected abstract java.lang.String doIntercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `public java.util.Set getExcludeMethodsSet()`
- `public java.util.Set getIncludeMethodsSet()`
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `public void setExcludeMethods(java.lang.String p0)`
- `public void setIncludeMethods(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.interceptor.MethodFilterInterceptorUtil`

**Constructors:**
- `public MethodFilterInterceptorUtil()`

**Methods:**
- `public static boolean applyMethod(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public static boolean applyMethod(java.util.Set p0, java.util.Set p1, java.lang.String p2)`

---

## public class `com.opensymphony.xwork2.interceptor.ModelDrivenInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public ModelDrivenInterceptor()`

**Fields:**
- `protected boolean refreshModelBeforeResult`

**Methods:**
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `public void setRefreshModelBeforeResult(boolean p0)`

---

## protected static class `com.opensymphony.xwork2.interceptor.ModelDrivenInterceptor$RefreshModelBeforeResult`
implements `com.opensymphony.xwork2.interceptor.PreResultListener`  

**Constructors:**
- `public RefreshModelBeforeResult(com.opensymphony.xwork2.ModelDriven p0, java.lang.Object p1)`

**Fields:**
- `protected com.opensymphony.xwork2.ModelDriven action`

**Methods:**
- `public void beforeResult(com.opensymphony.xwork2.ActionInvocation p0, java.lang.String p1)`

---

## public abstract interface `com.opensymphony.xwork2.interceptor.NoParameters`

---

## public class `com.opensymphony.xwork2.interceptor.ParameterFilterInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public ParameterFilterInterceptor()`

**Methods:**
- `public java.util.Collection getAllowedCollection()`
- `public java.util.Collection getBlockedCollection()`
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `public boolean isDefaultBlock()`
- `public void setAllowed(java.lang.String p0)`
- `public void setAllowedCollection(java.util.Collection p0)`
- `public void setBlocked(java.lang.String p0)`
- `public void setBlockedCollection(java.util.Collection p0)`
- `public void setDefaultBlock(boolean p0)`

---

## public abstract interface `com.opensymphony.xwork2.interceptor.ParameterNameAware`

**Methods:**
- `public abstract boolean acceptableParameterName(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.interceptor.ParameterRemoverInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public ParameterRemoverInterceptor()`

**Methods:**
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `public void setParamNames(java.lang.String p0)`
- `public void setParamValues(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.interceptor.ParametersInterceptor`
extends `com.opensymphony.xwork2.interceptor.MethodFilterInterceptor`  

**Constructors:**
- `public ParametersInterceptor()`

**Fields:**
- `protected final static int PARAM_NAME_MAX_LENGTH`
- `protected boolean ordered`

**Methods:**
- `protected boolean acceptableName(java.lang.String p0)`
- `protected void addParametersToContext(com.opensymphony.xwork2.ActionContext p0, java.util.Map p1)`
- `public java.lang.String doIntercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `protected java.util.Comparator getOrderedComparator()`
- `protected java.lang.String getParameterLogMap(org.apache.struts2.dispatcher.HttpParameters p0)`
- `protected boolean isAcceptableParameter(java.lang.String p0, java.lang.Object p1)`
- `protected boolean isAccepted(java.lang.String p0)`
- `protected boolean isExcluded(java.lang.String p0)`
- `public boolean isOrdered()`
- `protected boolean isWithinLengthLimit(java.lang.String p0)`
- `protected void notifyDeveloperParameterException(java.lang.Object p0, java.lang.String p1, java.lang.String p2)`
- `protected org.apache.struts2.dispatcher.HttpParameters retrieveParameters(com.opensymphony.xwork2.ActionContext p0)`
- `public void setAcceptParamNames(java.lang.String p0)`
- `public void setAcceptedPatterns(com.opensymphony.xwork2.security.AcceptedPatternsChecker p0)`
- `public void setDevMode(java.lang.String p0)`
- `public void setExcludeParams(java.lang.String p0)`
- `public void setExcludedPatterns(com.opensymphony.xwork2.security.ExcludedPatternsChecker p0)`
- `public void setOrdered(boolean p0)`
- `public void setParamNameMaxLength(int p0)`
- `protected void setParameters(java.lang.Object p0, com.opensymphony.xwork2.util.ValueStack p1, org.apache.struts2.dispatcher.HttpParameters p2)`
- `public void setValueStackFactory(com.opensymphony.xwork2.util.ValueStackFactory p0)`

---

## public abstract interface `com.opensymphony.xwork2.interceptor.PreResultListener`

**Methods:**
- `public abstract void beforeResult(com.opensymphony.xwork2.ActionInvocation p0, java.lang.String p1)`

---

## public class `com.opensymphony.xwork2.interceptor.PrefixMethodInvocationUtil`

**Constructors:**
- `public PrefixMethodInvocationUtil()`

**Methods:**
- `public static java.lang.String capitalizeMethodName(java.lang.String p0)`
- `public static java.lang.reflect.Method getPrefixedMethod(java.lang.String[] p0, java.lang.String p1, java.lang.Object p2)`
- `public static void invokePrefixMethod(com.opensymphony.xwork2.ActionInvocation p0, java.lang.String[] p1) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException`

---

## public class `com.opensymphony.xwork2.interceptor.PrepareInterceptor`
extends `com.opensymphony.xwork2.interceptor.MethodFilterInterceptor`  

**Constructors:**
- `public PrepareInterceptor()`

**Methods:**
- `public java.lang.String doIntercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `public void setAlwaysInvokePrepare(java.lang.String p0)`
- `public void setFirstCallPrepareDo(java.lang.String p0)`

---

## public abstract interface `com.opensymphony.xwork2.interceptor.ScopedModelDriven`<T extends java.lang.Object>
implements `com.opensymphony.xwork2.ModelDriven<T>`  

**Methods:**
- `public abstract java.lang.String getScopeKey()`
- `public abstract void setModel(T p0)`
- `public abstract void setScopeKey(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.interceptor.ScopedModelDrivenInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public ScopedModelDrivenInterceptor()`

**Methods:**
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `protected java.lang.Object resolveModel(com.opensymphony.xwork2.ObjectFactory p0, com.opensymphony.xwork2.ActionContext p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws java.lang.Exception`
- `public void setClassName(java.lang.String p0)`
- `public void setName(java.lang.String p0)`
- `public void setObjectFactory(com.opensymphony.xwork2.ObjectFactory p0)`
- `public void setScope(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.interceptor.StaticParametersInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public StaticParametersInterceptor()`

**Methods:**
- `protected void addParametersToContext(com.opensymphony.xwork2.ActionContext p0, java.util.Map p1)`
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `protected java.util.Map retrieveParameters(com.opensymphony.xwork2.ActionContext p0)`
- `public void setDevMode(java.lang.String p0)`
- `public void setLocalizedTextProvider(com.opensymphony.xwork2.LocalizedTextProvider p0)`
- `public void setMerge(java.lang.String p0)`
- `public void setOverwrite(java.lang.String p0)`
- `public void setParse(java.lang.String p0)`
- `public void setValueStackFactory(com.opensymphony.xwork2.util.ValueStackFactory p0)`

---

## public class `com.opensymphony.xwork2.interceptor.TimerInterceptor`
annotations: @java.lang.Deprecated  
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public TimerInterceptor()`

**Fields:**
- `protected org.apache.logging.log4j.Logger categoryLogger`
- `protected java.lang.String logCategory`
- `protected java.lang.String logLevel`

**Methods:**
- `protected void doLog(org.apache.logging.log4j.Logger p0, java.lang.String p1)`
- `public java.lang.String getLogCategory()`
- `public java.lang.String getLogLevel()`
- `protected org.apache.logging.log4j.Logger getLoggerToUse()`
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `protected java.lang.String invokeUnderTiming(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `public void setLogCategory(java.lang.String p0)`
- `public void setLogLevel(java.lang.String p0)`
- `protected boolean shouldLog()`

---

## public abstract interface `com.opensymphony.xwork2.interceptor.ValidationAware`

**Methods:**
- `public abstract void addActionError(java.lang.String p0)`
- `public abstract void addActionMessage(java.lang.String p0)`
- `public abstract void addFieldError(java.lang.String p0, java.lang.String p1)`
- `public abstract java.util.Collection getActionErrors()`
- `public abstract java.util.Collection getActionMessages()`
- `public abstract java.util.Map getFieldErrors()`
- `public abstract boolean hasActionErrors()`
- `public abstract boolean hasActionMessages()`
- `public abstract boolean hasErrors()`
- `public abstract boolean hasFieldErrors()`
- `public abstract void setActionErrors(java.util.Collection p0)`
- `public abstract void setActionMessages(java.util.Collection p0)`
- `public abstract void setFieldErrors(java.util.Map p0)`

---

## public abstract interface `com.opensymphony.xwork2.interceptor.ValidationErrorAware`

**Methods:**
- `public abstract java.lang.String actionErrorOccurred(java.lang.String p0)`

---

## public abstract interface `com.opensymphony.xwork2.interceptor.ValidationWorkflowAware`

**Methods:**
- `public abstract java.lang.String getInputResultName()`

---

## public abstract interface `com.opensymphony.xwork2.interceptor.WithLazyParams`

---

## public static class `com.opensymphony.xwork2.interceptor.WithLazyParams$LazyParamInjector`

**Constructors:**
- `public LazyParamInjector(com.opensymphony.xwork2.util.ValueStack p0)`

**Fields:**
- `protected com.opensymphony.xwork2.ognl.OgnlUtil ognlUtil`
- `protected com.opensymphony.xwork2.util.reflection.ReflectionProvider reflectionProvider`
- `protected com.opensymphony.xwork2.util.TextParser textParser`

**Methods:**
- `public com.opensymphony.xwork2.interceptor.Interceptor injectParams(com.opensymphony.xwork2.interceptor.Interceptor p0, java.util.Map p1, com.opensymphony.xwork2.ActionContext p2)`
- `public void setOgnlUtil(com.opensymphony.xwork2.ognl.OgnlUtil p0)`
- `public void setReflectionProvider(com.opensymphony.xwork2.util.reflection.ReflectionProvider p0)`
- `public void setTextParser(com.opensymphony.xwork2.util.TextParser p0)`

---

## public abstract interface `com.opensymphony.xwork2.interceptor.annotations.After`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.interceptor.annotations.Allowed`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public class `com.opensymphony.xwork2.interceptor.annotations.AnnotationParameterFilterInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public AnnotationParameterFilterInterceptor()`

**Methods:**
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`

---

## public class `com.opensymphony.xwork2.interceptor.annotations.AnnotationWorkflowInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  
implements `com.opensymphony.xwork2.interceptor.PreResultListener`  

**Constructors:**
- `public AnnotationWorkflowInterceptor()`

**Methods:**
- `public void beforeResult(com.opensymphony.xwork2.ActionInvocation p0, java.lang.String p1)`
- `protected static int comparePriorities(int p0, int p1)`
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`

---

## public abstract interface `com.opensymphony.xwork2.interceptor.annotations.Before`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.interceptor.annotations.BeforeResult`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.interceptor.annotations.BlockByDefault`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.interceptor.annotations.Blocked`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.interceptor.annotations.InputConfig`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public class `com.opensymphony.xwork2.mock.MockActionInvocation`
implements `com.opensymphony.xwork2.ActionInvocation`  

**Constructors:**
- `public MockActionInvocation()`

**Methods:**
- `public void addPreResultListener(com.opensymphony.xwork2.interceptor.PreResultListener p0)`
- `public java.lang.Object getAction()`
- `public com.opensymphony.xwork2.ActionEventListener getActionEventListener()`
- `public com.opensymphony.xwork2.ActionContext getInvocationContext()`
- `public com.opensymphony.xwork2.ActionProxy getProxy()`
- `public com.opensymphony.xwork2.Result getResult()`
- `public java.lang.String getResultCode()`
- `public com.opensymphony.xwork2.util.ValueStack getStack()`
- `public void init(com.opensymphony.xwork2.ActionProxy p0)`
- `public java.lang.String invoke() throws java.lang.Exception`
- `public java.lang.String invokeActionOnly() throws java.lang.Exception`
- `public boolean isExecuted()`
- `public void setAction(java.lang.Object p0)`
- `public void setActionEventListener(com.opensymphony.xwork2.ActionEventListener p0)`
- `public void setInvocationContext(com.opensymphony.xwork2.ActionContext p0)`
- `public void setProxy(com.opensymphony.xwork2.ActionProxy p0)`
- `public void setResult(com.opensymphony.xwork2.Result p0)`
- `public void setResultCode(java.lang.String p0)`
- `public void setStack(com.opensymphony.xwork2.util.ValueStack p0)`

---

## public class `com.opensymphony.xwork2.mock.MockActionProxy`
implements `com.opensymphony.xwork2.ActionProxy`  

**Constructors:**
- `public MockActionProxy()`

**Methods:**
- `public java.lang.String execute() throws java.lang.Exception`
- `public java.lang.Object getAction()`
- `public java.lang.String getActionName()`
- `public com.opensymphony.xwork2.config.entities.ActionConfig getConfig()`
- `public boolean getExecuteResult()`
- `public com.opensymphony.xwork2.ActionInvocation getInvocation()`
- `public java.lang.String getMethod()`
- `public java.lang.String getNamespace()`
- `public boolean isExecutedCalled()`
- `public boolean isMethodSpecified()`
- `public void prepare() throws java.lang.Exception`
- `public void setAction(java.lang.Object p0)`
- `public void setActionName(java.lang.String p0)`
- `public void setConfig(com.opensymphony.xwork2.config.entities.ActionConfig p0)`
- `public void setExecuteResult(boolean p0)`
- `public void setInvocation(com.opensymphony.xwork2.ActionInvocation p0)`
- `public void setMethod(java.lang.String p0)`
- `public void setMethodSpecified(boolean p0)`
- `public void setNamespace(java.lang.String p0)`
- `public void setReturnedResult(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.mock.MockContainer`
implements `com.opensymphony.xwork2.inject.Container`  

**Constructors:**
- `public MockContainer()`

**Methods:**
- `public <T extends java.lang.Object> T getInstance(java.lang.Class p0)`
- `public <T extends java.lang.Object> T getInstance(java.lang.Class p0, java.lang.String p1)`
- `public java.util.Set getInstanceNames(java.lang.Class p0)`
- `public <T extends java.lang.Object> T inject(java.lang.Class p0)`
- `public void inject(java.lang.Object p0)`
- `public void removeScopeStrategy()`
- `public void setScopeStrategy(com.opensymphony.xwork2.inject.Scope$Strategy p0)`

---

## public class `com.opensymphony.xwork2.mock.MockInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public MockInterceptor()`

**Fields:**
- `public final static java.lang.String DEFAULT_FOO_VALUE`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getExpectedFoo()`
- `public java.lang.String getFoo()`
- `public int hashCode()`
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `public boolean isExecuted()`
- `public void setExpectedFoo(java.lang.String p0)`
- `public void setFoo(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.mock.MockObjectTypeDeterminer`
implements `com.opensymphony.xwork2.conversion.ObjectTypeDeterminer`  

**Constructors:**
- `public MockObjectTypeDeterminer()`
- `public MockObjectTypeDeterminer(java.lang.Class p0, java.lang.Class p1, java.lang.String p2, boolean p3)`

**Methods:**
- `public java.lang.Class getElementClass()`
- `public java.lang.Class getElementClass(java.lang.Class p0, java.lang.String p1, java.lang.Object p2)`
- `public java.lang.Class getKeyClass()`
- `public java.lang.Class getKeyClass(java.lang.Class p0, java.lang.String p1)`
- `public java.lang.String getKeyProperty()`
- `public java.lang.String getKeyProperty(java.lang.Class p0, java.lang.String p1)`
- `public boolean isShouldCreateIfNew()`
- `public void setElementClass(java.lang.Class p0)`
- `public void setKeyClass(java.lang.Class p0)`
- `public void setKeyProperty(java.lang.String p0)`
- `public void setShouldCreateIfNew(boolean p0)`
- `public boolean shouldCreateIfNew(java.lang.Class p0, java.lang.String p1, java.lang.Object p2, java.lang.String p3, boolean p4)`

---

## public class `com.opensymphony.xwork2.mock.MockResult`
implements `com.opensymphony.xwork2.Result`  

**Constructors:**
- `public MockResult()`

**Fields:**
- `public final static java.lang.String DEFAULT_PARAM`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public void execute(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `public int hashCode()`
- `public void setFoo(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.ognl.ErrorMessageBuilder`

**Methods:**
- `public java.lang.String build()`
- `public static com.opensymphony.xwork2.ognl.ErrorMessageBuilder create()`
- `public com.opensymphony.xwork2.ognl.ErrorMessageBuilder errorSettingExpressionWithValue(java.lang.String p0, java.lang.Object p1)`

---

## public class `com.opensymphony.xwork2.ognl.ObjectProxy`

**Constructors:**
- `public ObjectProxy()`

**Methods:**
- `public java.lang.Class getLastClassAccessed()`
- `public java.lang.String getLastPropertyAccessed()`
- `public java.lang.Object getValue()`
- `public void setLastClassAccessed(java.lang.Class p0)`
- `public void setLastPropertyAccessed(java.lang.String p0)`
- `public void setValue(java.lang.Object p0)`

---

## public class `com.opensymphony.xwork2.ognl.OgnlNullHandlerWrapper`
implements `ognl.NullHandler`  

**Constructors:**
- `public OgnlNullHandlerWrapper(com.opensymphony.xwork2.conversion.NullHandler p0)`

**Methods:**
- `public java.lang.Object nullMethodResult(java.util.Map p0, java.lang.Object p1, java.lang.String p2, java.lang.Object[] p3)`
- `public java.lang.Object nullPropertyValue(java.util.Map p0, java.lang.Object p1, java.lang.Object p2)`

---

## public class `com.opensymphony.xwork2.ognl.OgnlReflectionContextFactory`
implements `com.opensymphony.xwork2.util.reflection.ReflectionContextFactory`  

**Constructors:**
- `public OgnlReflectionContextFactory()`

**Methods:**
- `public java.util.Map createDefaultContext(java.lang.Object p0)`

---

## public class `com.opensymphony.xwork2.ognl.OgnlReflectionProvider`
implements `com.opensymphony.xwork2.util.reflection.ReflectionProvider`  

**Constructors:**
- `public OgnlReflectionProvider()`

**Methods:**
- `public void copy(java.lang.Object p0, java.lang.Object p1, java.util.Map p2, java.util.Collection p3, java.util.Collection p4)`
- `public void copy(java.lang.Object p0, java.lang.Object p1, java.util.Map p2, java.util.Collection p3, java.util.Collection p4, java.lang.Class p5)`
- `public java.util.Map getBeanMap(java.lang.Object p0) throws com.opensymphony.xwork2.util.reflection.ReflectionException, java.beans.IntrospectionException`
- `public java.lang.reflect.Field getField(java.lang.Class p0, java.lang.String p1)`
- `public java.lang.reflect.Method getGetMethod(java.lang.Class p0, java.lang.String p1) throws com.opensymphony.xwork2.util.reflection.ReflectionException, java.beans.IntrospectionException`
- `public java.beans.PropertyDescriptor getPropertyDescriptor(java.lang.Class p0, java.lang.String p1) throws com.opensymphony.xwork2.util.reflection.ReflectionException, java.beans.IntrospectionException`
- `public java.beans.PropertyDescriptor[] getPropertyDescriptors(java.lang.Object p0) throws java.beans.IntrospectionException`
- `public java.lang.Object getRealTarget(java.lang.String p0, java.util.Map p1, java.lang.Object p2) throws com.opensymphony.xwork2.util.reflection.ReflectionException`
- `public java.lang.reflect.Method getSetMethod(java.lang.Class p0, java.lang.String p1) throws com.opensymphony.xwork2.util.reflection.ReflectionException, java.beans.IntrospectionException`
- `public java.lang.Object getValue(java.lang.String p0, java.util.Map p1, java.lang.Object p2) throws com.opensymphony.xwork2.util.reflection.ReflectionException`
- `public void setOgnlUtil(com.opensymphony.xwork2.ognl.OgnlUtil p0)`
- `public void setProperties(java.util.Map p0, java.lang.Object p1)`
- `public void setProperties(java.util.Map p0, java.lang.Object p1, java.util.Map p2)`
- `public void setProperties(java.util.Map p0, java.lang.Object p1, java.util.Map p2, boolean p3) throws com.opensymphony.xwork2.util.reflection.ReflectionException`
- `public void setProperty(java.lang.String p0, java.lang.Object p1, java.lang.Object p2, java.util.Map p3)`
- `public void setProperty(java.lang.String p0, java.lang.Object p1, java.lang.Object p2, java.util.Map p3, boolean p4)`
- `public void setValue(java.lang.String p0, java.util.Map p1, java.lang.Object p2, java.lang.Object p3) throws com.opensymphony.xwork2.util.reflection.ReflectionException`

---

## public class `com.opensymphony.xwork2.ognl.OgnlTypeConverterWrapper`
implements `ognl.TypeConverter`  

**Constructors:**
- `public OgnlTypeConverterWrapper(com.opensymphony.xwork2.conversion.TypeConverter p0)`

**Methods:**
- `public java.lang.Object convertValue(java.util.Map p0, java.lang.Object p1, java.lang.reflect.Member p2, java.lang.String p3, java.lang.Object p4, java.lang.Class p5)`
- `public com.opensymphony.xwork2.conversion.TypeConverter getTarget()`

---

## public class `com.opensymphony.xwork2.ognl.OgnlUtil`

**Constructors:**
- `public OgnlUtil()`

**Methods:**
- `protected void applyExpressionMaxLength(java.lang.String p0)`
- `public int beanInfoCacheSize()`
- `public java.lang.Object callMethod(java.lang.String p0, java.util.Map p1, java.lang.Object p2) throws ognl.OgnlException`
- `public void clearBeanInfoCache()`
- `public void clearExpressionCache()`
- `public static void clearRuntimeCache()`
- `public java.lang.Object compile(java.lang.String p0) throws ognl.OgnlException`
- `public java.lang.Object compile(java.lang.String p0, java.util.Map p1) throws ognl.OgnlException`
- `public void copy(java.lang.Object p0, java.lang.Object p1, java.util.Map p2)`
- `public void copy(java.lang.Object p0, java.lang.Object p1, java.util.Map p2, java.util.Collection p3, java.util.Collection p4)`
- `public void copy(java.lang.Object p0, java.lang.Object p1, java.util.Map p2, java.util.Collection p3, java.util.Collection p4, java.lang.Class p5)`
- `protected java.util.Map createDefaultContext(java.lang.Object p0)`
- `protected java.util.Map createDefaultContext(java.lang.Object p0, ognl.ClassResolver p1)`
- `public int expressionCacheSize()`
- `public java.beans.BeanInfo getBeanInfo(java.lang.Class p0) throws java.beans.IntrospectionException`
- `public java.beans.BeanInfo getBeanInfo(java.lang.Object p0) throws java.beans.IntrospectionException`
- `public java.util.Map getBeanMap(java.lang.Object p0) throws java.beans.IntrospectionException, ognl.OgnlException`
- `public java.util.Set getExcludedClasses()`
- `public java.util.Set getExcludedPackageNamePatterns()`
- `public java.util.Set getExcludedPackageNames()`
- `public java.beans.PropertyDescriptor[] getPropertyDescriptors(java.lang.Class p0) throws java.beans.IntrospectionException`
- `public java.beans.PropertyDescriptor[] getPropertyDescriptors(java.lang.Object p0) throws java.beans.IntrospectionException`
- `public java.lang.Object getRealTarget(java.lang.String p0, java.util.Map p1, java.lang.Object p2) throws ognl.OgnlException`
- `public java.lang.Object getValue(java.lang.String p0, java.util.Map p1, java.lang.Object p2) throws ognl.OgnlException`
- `public java.lang.Object getValue(java.lang.String p0, java.util.Map p1, java.lang.Object p2, java.lang.Class p3) throws ognl.OgnlException`
- `public boolean isDisallowProxyMemberAccess()`
- `protected void setAllowStaticMethodAccess(java.lang.String p0)`
- `protected void setContainer(com.opensymphony.xwork2.inject.Container p0)`
- `protected void setDevMode(java.lang.String p0)`
- `protected void setDisallowProxyMemberAccess(java.lang.String p0)`
- `protected void setEnableEvalExpression(java.lang.String p0)`
- `protected void setEnableExpressionCache(java.lang.String p0)`
- `protected void setExcludedClasses(java.lang.String p0)`
- `protected void setExcludedPackageNamePatterns(java.lang.String p0)`
- `protected void setExcludedPackageNames(java.lang.String p0)`
- `public void setProperties(java.util.Map p0, java.lang.Object p1)`
- `public void setProperties(java.util.Map p0, java.lang.Object p1, boolean p2)`
- `public void setProperties(java.util.Map p0, java.lang.Object p1, java.util.Map p2)`
- `public void setProperties(java.util.Map p0, java.lang.Object p1, java.util.Map p2, boolean p3) throws com.opensymphony.xwork2.util.reflection.ReflectionException`
- `public void setProperty(java.lang.String p0, java.lang.Object p1, java.lang.Object p2, java.util.Map p3)`
- `public void setProperty(java.lang.String p0, java.lang.Object p1, java.lang.Object p2, java.util.Map p3, boolean p4)`
- `public void setValue(java.lang.String p0, java.util.Map p1, java.lang.Object p2, java.lang.Object p3) throws ognl.OgnlException`
- `protected void setXWorkConverter(com.opensymphony.xwork2.conversion.impl.XWorkConverter p0)`

---

## public class `com.opensymphony.xwork2.ognl.OgnlValueStack`
implements `com.opensymphony.xwork2.util.ClearableValueStack`, `com.opensymphony.xwork2.util.MemberAccessValueStack`, `com.opensymphony.xwork2.util.ValueStack`, `java.io.Serializable`  

**Constructors:**
- `protected OgnlValueStack(com.opensymphony.xwork2.conversion.impl.XWorkConverter p0, com.opensymphony.xwork2.ognl.accessor.CompoundRootAccessor p1, com.opensymphony.xwork2.TextProvider p2, boolean p3)`
- `protected OgnlValueStack(com.opensymphony.xwork2.util.ValueStack p0, com.opensymphony.xwork2.conversion.impl.XWorkConverter p1, com.opensymphony.xwork2.ognl.accessor.CompoundRootAccessor p2, boolean p3)`

**Fields:**
- `public final static java.lang.String THROW_EXCEPTION_ON_FAILURE`
- `protected transient java.util.Map context`
- `protected java.lang.Class defaultType`
- `protected transient com.opensymphony.xwork2.ognl.OgnlUtil ognlUtil`
- `protected java.util.Map overrides`
- `protected com.opensymphony.xwork2.util.CompoundRoot root`
- `protected transient com.opensymphony.xwork2.ognl.SecurityMemberAccess securityMemberAccess`

**Methods:**
- `public void clearContextValues()`
- `protected java.lang.Object findInContext(java.lang.String p0)`
- `public java.lang.String findString(java.lang.String p0)`
- `public java.lang.String findString(java.lang.String p0, boolean p1)`
- `public java.lang.Object findValue(java.lang.String p0)`
- `public java.lang.Object findValue(java.lang.String p0, boolean p1)`
- `public java.lang.Object findValue(java.lang.String p0, java.lang.Class p1)`
- `public java.lang.Object findValue(java.lang.String p0, java.lang.Class p1, boolean p2)`
- `public java.util.Map getContext()`
- `public java.util.Map getExprOverrides()`
- `public com.opensymphony.xwork2.util.CompoundRoot getRoot()`
- `protected java.lang.Object handleOgnlException(java.lang.String p0, boolean p1, ognl.OgnlException p2)`
- `protected void handleOgnlException(java.lang.String p0, java.lang.Object p1, boolean p2, ognl.OgnlException p3)`
- `protected java.lang.Object handleOtherException(java.lang.String p0, boolean p1, java.lang.Exception p2)`
- `protected void handleRuntimeException(java.lang.String p0, java.lang.Object p1, boolean p2, java.lang.RuntimeException p3)`
- `public java.lang.Object peek()`
- `public java.lang.Object pop()`
- `public void push(java.lang.Object p0)`
- `public void set(java.lang.String p0, java.lang.Object p1)`
- `public void setAcceptProperties(java.util.Set p0)`
- `public void setDefaultType(java.lang.Class p0)`
- `protected void setDevMode(java.lang.String p0)`
- `public void setExcludeProperties(java.util.Set p0)`
- `public void setExprOverrides(java.util.Map p0)`
- `protected void setLogMissingProperties(java.lang.String p0)`
- `protected void setOgnlUtil(com.opensymphony.xwork2.ognl.OgnlUtil p0)`
- `public void setParameter(java.lang.String p0, java.lang.Object p1)`
- `protected void setRoot(com.opensymphony.xwork2.conversion.impl.XWorkConverter p0, com.opensymphony.xwork2.ognl.accessor.CompoundRootAccessor p1, com.opensymphony.xwork2.util.CompoundRoot p2, boolean p3)`
- `public void setValue(java.lang.String p0, java.lang.Object p1)`
- `public void setValue(java.lang.String p0, java.lang.Object p1, boolean p2)`
- `protected void setXWorkConverter(com.opensymphony.xwork2.conversion.impl.XWorkConverter p0)`
- `protected void setupExceptionOnFailure(boolean p0)`
- `protected boolean shouldLogMissingPropertyWarning(ognl.OgnlException p0)`
- `public int size()`

---

## public class `com.opensymphony.xwork2.ognl.OgnlValueStackFactory`
implements `com.opensymphony.xwork2.util.ValueStackFactory`  

**Constructors:**
- `public OgnlValueStackFactory()`

**Fields:**
- `protected com.opensymphony.xwork2.ognl.accessor.CompoundRootAccessor compoundRootAccessor`
- `protected com.opensymphony.xwork2.inject.Container container`
- `protected com.opensymphony.xwork2.TextProvider textProvider`
- `protected com.opensymphony.xwork2.conversion.impl.XWorkConverter xworkConverter`

**Methods:**
- `public com.opensymphony.xwork2.util.ValueStack createValueStack()`
- `public com.opensymphony.xwork2.util.ValueStack createValueStack(com.opensymphony.xwork2.util.ValueStack p0)`
- `protected void setAllowStaticMethodAccess(java.lang.String p0)`
- `protected void setContainer(com.opensymphony.xwork2.inject.Container p0) throws java.lang.ClassNotFoundException`
- `protected void setTextProvider(com.opensymphony.xwork2.TextProvider p0)`
- `protected void setXWorkConverter(com.opensymphony.xwork2.conversion.impl.XWorkConverter p0)`

---

## public class `com.opensymphony.xwork2.ognl.SecurityMemberAccess`
extends `ognl.DefaultMemberAccess`  

**Constructors:**
- `public SecurityMemberAccess(boolean p0)`

**Methods:**
- `protected boolean checkEnumAccess(java.lang.Object p0, java.lang.reflect.Member p1)`
- `protected boolean checkStaticMethodAccess(java.lang.reflect.Member p0)`
- `public boolean getAllowStaticMethodAccess()`
- `protected boolean isAcceptableProperty(java.lang.String p0)`
- `protected boolean isAccepted(java.lang.String p0)`
- `public boolean isAccessible(java.util.Map p0, java.lang.Object p1, java.lang.reflect.Member p2, java.lang.String p3)`
- `protected boolean isClassExcluded(java.lang.Class p0)`
- `protected boolean isExcluded(java.lang.String p0)`
- `protected boolean isPackageExcluded(java.lang.Package p0, java.lang.Package p1)`
- `public void setAcceptProperties(java.util.Set p0)`
- `public void setDisallowProxyMemberAccess(boolean p0)`
- `public void setExcludeProperties(java.util.Set p0)`
- `public void setExcludedClasses(java.util.Set p0)`
- `public void setExcludedPackageNamePatterns(java.util.Set p0)`
- `public void setExcludedPackageNames(java.util.Set p0)`

---

## public class `com.opensymphony.xwork2.ognl.XWorkTypeConverterWrapper`
implements `com.opensymphony.xwork2.conversion.TypeConverter`  

**Constructors:**
- `public XWorkTypeConverterWrapper(ognl.TypeConverter p0)`

**Methods:**
- `public java.lang.Object convertValue(java.util.Map p0, java.lang.Object p1, java.lang.reflect.Member p2, java.lang.String p3, java.lang.Object p4, java.lang.Class p5)`

---

## public class `com.opensymphony.xwork2.ognl.accessor.CompoundRootAccessor`
implements `ognl.ClassResolver`, `ognl.MethodAccessor`, `ognl.PropertyAccessor`  

**Constructors:**
- `public CompoundRootAccessor()`

**Methods:**
- `public java.lang.Object callMethod(java.util.Map p0, java.lang.Object p1, java.lang.String p2, java.lang.Object[] p3) throws ognl.MethodFailedException`
- `public java.lang.Object callStaticMethod(java.util.Map p0, java.lang.Class p1, java.lang.String p2, java.lang.Object[] p3) throws ognl.MethodFailedException`
- `public java.lang.Class classForName(java.lang.String p0, java.util.Map p1) throws java.lang.ClassNotFoundException`
- `public java.lang.Object getProperty(java.util.Map p0, java.lang.Object p1, java.lang.Object p2) throws ognl.OgnlException`
- `public java.lang.String getSourceAccessor(ognl.OgnlContext p0, java.lang.Object p1, java.lang.Object p2)`
- `public java.lang.String getSourceSetter(ognl.OgnlContext p0, java.lang.Object p1, java.lang.Object p2)`
- `protected void setDevMode(java.lang.String p0)`
- `public void setProperty(java.util.Map p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3) throws ognl.OgnlException`

---

## public class `com.opensymphony.xwork2.ognl.accessor.HttpParametersPropertyAccessor`
extends `ognl.ObjectPropertyAccessor`  

**Constructors:**
- `public HttpParametersPropertyAccessor()`

**Methods:**
- `public java.lang.Object getProperty(java.util.Map p0, java.lang.Object p1, java.lang.Object p2) throws ognl.OgnlException`
- `public void setProperty(java.util.Map p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3) throws ognl.OgnlException`

---

## public class `com.opensymphony.xwork2.ognl.accessor.ObjectAccessor`
extends `ognl.ObjectPropertyAccessor`  

**Constructors:**
- `public ObjectAccessor()`

**Methods:**
- `public java.lang.Object getProperty(java.util.Map p0, java.lang.Object p1, java.lang.Object p2) throws ognl.OgnlException`
- `public void setProperty(java.util.Map p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3) throws ognl.OgnlException`

---

## public class `com.opensymphony.xwork2.ognl.accessor.ObjectProxyPropertyAccessor`
implements `ognl.PropertyAccessor`  

**Constructors:**
- `public ObjectProxyPropertyAccessor()`

**Methods:**
- `public java.lang.Object getProperty(java.util.Map p0, java.lang.Object p1, java.lang.Object p2) throws ognl.OgnlException`
- `public java.lang.String getSourceAccessor(ognl.OgnlContext p0, java.lang.Object p1, java.lang.Object p2)`
- `public java.lang.String getSourceSetter(ognl.OgnlContext p0, java.lang.Object p1, java.lang.Object p2)`
- `public void setProperty(java.util.Map p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3) throws ognl.OgnlException`

---

## public class `com.opensymphony.xwork2.ognl.accessor.ParameterPropertyAccessor`
extends `ognl.ObjectPropertyAccessor`  

**Constructors:**
- `public ParameterPropertyAccessor()`

**Methods:**
- `public java.lang.Object getProperty(java.util.Map p0, java.lang.Object p1, java.lang.Object p2) throws ognl.OgnlException`
- `public void setProperty(java.util.Map p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3) throws ognl.OgnlException`

---

## public class `com.opensymphony.xwork2.ognl.accessor.XWorkCollectionPropertyAccessor`
extends `ognl.SetPropertyAccessor`  

**Constructors:**
- `public XWorkCollectionPropertyAccessor()`

**Fields:**
- `public final static java.lang.String KEY_PROPERTY_FOR_CREATION`

**Methods:**
- `public java.lang.Object getProperty(java.util.Map p0, java.lang.Object p1, java.lang.Object p2) throws ognl.OgnlException`
- `public java.lang.Object getPropertyThroughIteration(java.util.Map p0, java.util.Collection p1, java.lang.String p2, java.lang.Object p3) throws ognl.OgnlException`
- `public void setObjectFactory(com.opensymphony.xwork2.ObjectFactory p0)`
- `public void setObjectTypeDeterminer(com.opensymphony.xwork2.conversion.ObjectTypeDeterminer p0)`
- `public void setOgnlUtil(com.opensymphony.xwork2.ognl.OgnlUtil p0)`
- `public void setProperty(java.util.Map p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3) throws ognl.OgnlException`
- `public void setXWorkConverter(com.opensymphony.xwork2.conversion.impl.XWorkConverter p0)`

---

## public class `com.opensymphony.xwork2.ognl.accessor.XWorkEnumerationAccessor`
extends `ognl.EnumerationPropertyAccessor`  

**Constructors:**
- `public XWorkEnumerationAccessor()`

**Methods:**
- `public void setProperty(java.util.Map p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3) throws ognl.OgnlException`

---

## public class `com.opensymphony.xwork2.ognl.accessor.XWorkIteratorPropertyAccessor`
extends `ognl.IteratorPropertyAccessor`  

**Constructors:**
- `public XWorkIteratorPropertyAccessor()`

**Methods:**
- `public void setProperty(java.util.Map p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3) throws ognl.OgnlException`

---

## public class `com.opensymphony.xwork2.ognl.accessor.XWorkListPropertyAccessor`
extends `ognl.ListPropertyAccessor`  

**Constructors:**
- `public XWorkListPropertyAccessor()`

**Methods:**
- `public java.lang.Object getProperty(java.util.Map p0, java.lang.Object p1, java.lang.Object p2) throws ognl.OgnlException`
- `public void setAutoGrowCollectionLimit(java.lang.String p0)`
- `public void setDeprecatedAutoGrowCollectionLimit(java.lang.String p0)`
- `public void setObjectFactory(com.opensymphony.xwork2.ObjectFactory p0)`
- `public void setObjectTypeDeterminer(com.opensymphony.xwork2.conversion.ObjectTypeDeterminer p0)`
- `public void setOgnlUtil(com.opensymphony.xwork2.ognl.OgnlUtil p0)`
- `public void setProperty(java.util.Map p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3) throws ognl.OgnlException`
- `public void setXWorkCollectionPropertyAccessor(ognl.PropertyAccessor p0)`
- `public void setXWorkConverter(com.opensymphony.xwork2.conversion.impl.XWorkConverter p0)`

---

## public class `com.opensymphony.xwork2.ognl.accessor.XWorkMapPropertyAccessor`
extends `ognl.MapPropertyAccessor`  

**Constructors:**
- `public XWorkMapPropertyAccessor()`

**Methods:**
- `public java.lang.Object getProperty(java.util.Map p0, java.lang.Object p1, java.lang.Object p2) throws ognl.OgnlException`
- `public void setObjectFactory(com.opensymphony.xwork2.ObjectFactory p0)`
- `public void setObjectTypeDeterminer(com.opensymphony.xwork2.conversion.ObjectTypeDeterminer p0)`
- `public void setProperty(java.util.Map p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3) throws ognl.OgnlException`
- `public void setXWorkConverter(com.opensymphony.xwork2.conversion.impl.XWorkConverter p0)`

---

## public class `com.opensymphony.xwork2.ognl.accessor.XWorkMethodAccessor`
extends `ognl.ObjectMethodAccessor`  

**Constructors:**
- `public XWorkMethodAccessor()`

**Methods:**
- `public java.lang.Object callMethod(java.util.Map p0, java.lang.Object p1, java.lang.String p2, java.lang.Object[] p3) throws ognl.MethodFailedException`
- `public java.lang.Object callStaticMethod(java.util.Map p0, java.lang.Class p1, java.lang.String p2, java.lang.Object[] p3) throws ognl.MethodFailedException`

---

## public class `com.opensymphony.xwork2.ognl.accessor.XWorkObjectPropertyAccessor`
extends `ognl.ObjectPropertyAccessor`  

**Constructors:**
- `public XWorkObjectPropertyAccessor()`

**Methods:**
- `public java.lang.Object getProperty(java.util.Map p0, java.lang.Object p1, java.lang.Object p2) throws ognl.OgnlException`

---

## public abstract interface `com.opensymphony.xwork2.result.ParamNameAwareResult`

**Methods:**
- `public abstract boolean acceptableParameterName(java.lang.String p0, java.lang.String p1)`

---

## public abstract interface `com.opensymphony.xwork2.security.AcceptedPatternsChecker`

**Methods:**
- `public abstract java.util.Set getAcceptedPatterns()`
- `public abstract com.opensymphony.xwork2.security.AcceptedPatternsChecker$IsAccepted isAccepted(java.lang.String p0)`
- `public abstract void setAcceptedPatterns(java.lang.String p0)`
- `public abstract void setAcceptedPatterns(java.lang.String[] p0)`
- `public abstract void setAcceptedPatterns(java.util.Set p0)`

---

## public final static class `com.opensymphony.xwork2.security.AcceptedPatternsChecker$IsAccepted`

**Methods:**
- `public java.lang.String getAcceptedPattern()`
- `public boolean isAccepted()`
- `public static com.opensymphony.xwork2.security.AcceptedPatternsChecker$IsAccepted no(java.lang.String p0)`
- `public java.lang.String toString()`
- `public static com.opensymphony.xwork2.security.AcceptedPatternsChecker$IsAccepted yes(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.security.DefaultAcceptedPatternsChecker`
implements `com.opensymphony.xwork2.security.AcceptedPatternsChecker`  

**Constructors:**
- `public DefaultAcceptedPatternsChecker()`
- `public DefaultAcceptedPatternsChecker(java.lang.String p0)`

**Fields:**
- `public final static java.lang.String[] ACCEPTED_PATTERNS`
- `public final static java.lang.String[] DMI_AWARE_ACCEPTED_PATTERNS`

**Methods:**
- `public java.util.Set getAcceptedPatterns()`
- `public com.opensymphony.xwork2.security.AcceptedPatternsChecker$IsAccepted isAccepted(java.lang.String p0)`
- `public void setAcceptedPatterns(java.lang.String p0)`
- `public void setAcceptedPatterns(java.lang.String[] p0)`
- `public void setAcceptedPatterns(java.util.Set p0)`
- `protected void setAdditionalAcceptedPatterns(java.lang.String p0)`
- `protected void setOverrideAcceptedPatterns(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.security.DefaultExcludedPatternsChecker`
implements `com.opensymphony.xwork2.security.ExcludedPatternsChecker`  

**Constructors:**
- `public DefaultExcludedPatternsChecker()`

**Fields:**
- `public final static java.lang.String[] EXCLUDED_PATTERNS`

**Methods:**
- `public java.util.Set getExcludedPatterns()`
- `public com.opensymphony.xwork2.security.ExcludedPatternsChecker$IsExcluded isExcluded(java.lang.String p0)`
- `public void setAdditionalExcludePatterns(java.lang.String p0)`
- `protected void setDynamicMethodInvocation(java.lang.String p0)`
- `public void setExcludedPatterns(java.lang.String p0)`
- `public void setExcludedPatterns(java.lang.String[] p0)`
- `public void setExcludedPatterns(java.util.Set p0)`
- `protected void setOverrideExcludePatterns(java.lang.String p0)`

---

## public abstract interface `com.opensymphony.xwork2.security.ExcludedPatternsChecker`

**Methods:**
- `public abstract java.util.Set getExcludedPatterns()`
- `public abstract com.opensymphony.xwork2.security.ExcludedPatternsChecker$IsExcluded isExcluded(java.lang.String p0)`
- `public abstract void setExcludedPatterns(java.lang.String p0)`
- `public abstract void setExcludedPatterns(java.lang.String[] p0)`
- `public abstract void setExcludedPatterns(java.util.Set p0)`

---

## public final static class `com.opensymphony.xwork2.security.ExcludedPatternsChecker$IsExcluded`

**Methods:**
- `public java.lang.String getExcludedPattern()`
- `public boolean isExcluded()`
- `public static com.opensymphony.xwork2.security.ExcludedPatternsChecker$IsExcluded no(java.util.Set p0)`
- `public java.lang.String toString()`
- `public static com.opensymphony.xwork2.security.ExcludedPatternsChecker$IsExcluded yes(java.util.regex.Pattern p0)`

---

## public class `com.opensymphony.xwork2.spring.SpringObjectFactory`
extends `com.opensymphony.xwork2.ObjectFactory`  
implements `org.springframework.context.ApplicationContextAware`  

**Constructors:**
- `public SpringObjectFactory()`

**Fields:**
- `protected org.springframework.context.ApplicationContext appContext`
- `protected org.springframework.beans.factory.config.AutowireCapableBeanFactory autoWiringFactory`
- `protected int autowireStrategy`

**Methods:**
- `public java.lang.Object autoWireBean(java.lang.Object p0)`
- `public java.lang.Object autoWireBean(java.lang.Object p0, org.springframework.beans.factory.config.AutowireCapableBeanFactory p1)`
- `public java.lang.Object buildBean(java.lang.Class p0, java.util.Map p1) throws java.lang.Exception`
- `public java.lang.Object buildBean(java.lang.String p0, java.util.Map p1, boolean p2) throws java.lang.Exception`
- `protected org.springframework.beans.factory.config.AutowireCapableBeanFactory findAutoWiringBeanFactory(org.springframework.context.ApplicationContext p0)`
- `public int getAutowireStrategy()`
- `public java.lang.Class getClassInstance(java.lang.String p0) throws java.lang.ClassNotFoundException`
- `public boolean isNoArgConstructorRequired()`
- `public void setAlwaysRespectAutowireStrategy(boolean p0)`
- `public void setApplicationContext(org.springframework.context.ApplicationContext p0) throws org.springframework.beans.BeansException`
- `public void setApplicationContextPath(java.lang.String p0)`
- `public void setAutowireStrategy(int p0)`
- `public void setEnableAopSupport(java.lang.String p0)`
- `public void setUseClassCache(boolean p0)`

---

## public class `com.opensymphony.xwork2.spring.SpringProxyableObjectFactory`
extends `com.opensymphony.xwork2.spring.SpringObjectFactory`  

**Constructors:**
- `public SpringProxyableObjectFactory()`

**Methods:**
- `public java.lang.Object buildBean(java.lang.String p0, java.util.Map p1) throws java.lang.Exception`
- `protected org.springframework.context.ApplicationContext getApplicationContext(java.util.Map p0)`

---

## public class `com.opensymphony.xwork2.spring.interceptor.ActionAutowiringInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  
implements `org.springframework.context.ApplicationContextAware`  

**Constructors:**
- `public ActionAutowiringInterceptor()`

**Fields:**
- `public final static java.lang.String APPLICATION_CONTEXT`

**Methods:**
- `protected org.springframework.context.ApplicationContext getApplicationContext()`
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `public void setApplicationContext(org.springframework.context.ApplicationContext p0) throws org.springframework.beans.BeansException`
- `public void setAutowireStrategy(java.lang.Integer p0)`

---

## public class `com.opensymphony.xwork2.test.StubConfigurationProvider`
implements `com.opensymphony.xwork2.config.ConfigurationProvider`  

**Constructors:**
- `public StubConfigurationProvider()`

**Methods:**
- `public void destroy()`
- `public void init(com.opensymphony.xwork2.config.Configuration p0) throws com.opensymphony.xwork2.config.ConfigurationException`
- `public void loadPackages() throws com.opensymphony.xwork2.config.ConfigurationException`
- `public boolean needsReload()`
- `public void register(com.opensymphony.xwork2.inject.ContainerBuilder p0, com.opensymphony.xwork2.util.location.LocatableProperties p1) throws com.opensymphony.xwork2.config.ConfigurationException`

---

## public class `com.opensymphony.xwork2.util.AnnotationUtils`

**Constructors:**
- `public AnnotationUtils()`

**Methods:**
- `public static void addAllFields(java.lang.Class p0, java.lang.Class p1, java.util.List p2)`
- `public static void addAllInterfaces(java.lang.Class p0, java.util.List p1)`
- `public static void addAllMethods(java.lang.Class p0, java.lang.Class p1, java.util.List p2)`
- `public static <T extends java.lang.annotation.Annotation> T findAnnotation(java.lang.Class p0, java.lang.Class p1)`
- `public static <T extends java.lang.annotation.Annotation> java.util.List findAnnotations(java.lang.Class p0, java.lang.Class p1)`
- `public static java.lang.String resolvePropertyName(java.lang.reflect.Method p0)`

---

## public class `com.opensymphony.xwork2.util.ClassLoaderUtil`

**Constructors:**
- `public ClassLoaderUtil()`

**Methods:**
- `public static java.net.URL getResource(java.lang.String p0, java.lang.Class p1)`
- `public static java.io.InputStream getResourceAsStream(java.lang.String p0, java.lang.Class p1)`
- `public static java.util.Iterator getResources(java.lang.String p0, java.lang.Class p1, boolean p2) throws java.io.IOException`
- `public static java.lang.Class loadClass(java.lang.String p0, java.lang.Class p1) throws java.lang.ClassNotFoundException`
- `public static void printClassLoader()`
- `public static void printClassLoader(java.lang.ClassLoader p0)`

---

## public class `com.opensymphony.xwork2.util.ClassPathFinder`

**Constructors:**
- `public ClassPathFinder()`

**Methods:**
- `public java.util.Vector findMatches()`
- `public java.lang.String getPattern()`
- `public void setPattern(java.lang.String p0)`
- `public void setPatternMatcher(com.opensymphony.xwork2.util.PatternMatcher p0)`

---

## public abstract interface `com.opensymphony.xwork2.util.ClearableValueStack`

**Methods:**
- `public abstract void clearContextValues()`

---

## public class `com.opensymphony.xwork2.util.CompoundRoot`
extends `java.util.concurrent.CopyOnWriteArrayList`  

**Constructors:**
- `public CompoundRoot()`
- `public CompoundRoot(java.util.List p0)`

**Methods:**
- `public com.opensymphony.xwork2.util.CompoundRoot cutStack(int p0)`
- `public java.lang.Object peek()`
- `public java.lang.Object pop()`
- `public void push(java.lang.Object p0)`

---

## public abstract interface `com.opensymphony.xwork2.util.CreateIfNull`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public class `com.opensymphony.xwork2.util.DomHelper`

**Constructors:**
- `public DomHelper()`

**Fields:**
- `public final static java.lang.String XMLNS_URI`

**Methods:**
- `public static com.opensymphony.xwork2.util.location.Location getLocationObject(org.w3c.dom.Element p0)`
- `public static org.w3c.dom.Document parse(org.xml.sax.InputSource p0)`
- `public static org.w3c.dom.Document parse(org.xml.sax.InputSource p0, java.util.Map p1)`

---

## public static class `com.opensymphony.xwork2.util.DomHelper$DOMBuilder`
implements `org.xml.sax.ContentHandler`  

**Constructors:**
- `public DOMBuilder()`
- `public DOMBuilder(javax.xml.transform.sax.SAXTransformerFactory p0)`
- `public DOMBuilder(javax.xml.transform.sax.SAXTransformerFactory p0, org.w3c.dom.Node p1)`
- `public DOMBuilder(org.w3c.dom.Node p0)`

**Fields:**
- `protected static javax.xml.transform.sax.SAXTransformerFactory FACTORY`
- `protected javax.xml.transform.sax.SAXTransformerFactory factory`
- `protected org.xml.sax.ContentHandler nextHandler`
- `protected org.w3c.dom.Node parentNode`
- `protected javax.xml.transform.dom.DOMResult result`

**Methods:**
- `public void characters(char[] p0, int p1, int p2) throws org.xml.sax.SAXException`
- `public void endDocument() throws org.xml.sax.SAXException`
- `public void endElement(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws org.xml.sax.SAXException`
- `public void endPrefixMapping(java.lang.String p0) throws org.xml.sax.SAXException`
- `public org.w3c.dom.Document getDocument()`
- `public void ignorableWhitespace(char[] p0, int p1, int p2) throws org.xml.sax.SAXException`
- `public void processingInstruction(java.lang.String p0, java.lang.String p1) throws org.xml.sax.SAXException`
- `public void setDocumentLocator(org.xml.sax.Locator p0)`
- `public void skippedEntity(java.lang.String p0) throws org.xml.sax.SAXException`
- `public void startDocument() throws org.xml.sax.SAXException`
- `public void startElement(java.lang.String p0, java.lang.String p1, java.lang.String p2, org.xml.sax.Attributes p3) throws org.xml.sax.SAXException`
- `public void startPrefixMapping(java.lang.String p0, java.lang.String p1) throws org.xml.sax.SAXException`

---

## public static class `com.opensymphony.xwork2.util.DomHelper$StartHandler`
extends `org.xml.sax.helpers.DefaultHandler`  

**Constructors:**
- `public StartHandler(org.xml.sax.ContentHandler p0, java.util.Map p1)`

**Methods:**
- `public void characters(char[] p0, int p1, int p2) throws org.xml.sax.SAXException`
- `public void endDocument() throws org.xml.sax.SAXException`
- `public void endElement(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws org.xml.sax.SAXException`
- `public void endPrefixMapping(java.lang.String p0) throws org.xml.sax.SAXException`
- `public void error(org.xml.sax.SAXParseException p0) throws org.xml.sax.SAXException`
- `public void fatalError(org.xml.sax.SAXParseException p0) throws org.xml.sax.SAXException`
- `public void ignorableWhitespace(char[] p0, int p1, int p2) throws org.xml.sax.SAXException`
- `public void processingInstruction(java.lang.String p0, java.lang.String p1) throws org.xml.sax.SAXException`
- `public org.xml.sax.InputSource resolveEntity(java.lang.String p0, java.lang.String p1)`
- `public void setDocumentLocator(org.xml.sax.Locator p0)`
- `public void skippedEntity(java.lang.String p0) throws org.xml.sax.SAXException`
- `public void startDocument() throws org.xml.sax.SAXException`
- `public void startElement(java.lang.String p0, java.lang.String p1, java.lang.String p2, org.xml.sax.Attributes p3) throws org.xml.sax.SAXException`
- `public void startPrefixMapping(java.lang.String p0, java.lang.String p1) throws org.xml.sax.SAXException`
- `public void warning(org.xml.sax.SAXParseException p0)`

---

## public abstract interface `com.opensymphony.xwork2.util.Element`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public class `com.opensymphony.xwork2.util.Evaluated`

**Constructors:**
- `public Evaluated(java.lang.Object p0)`

**Methods:**
- `public java.lang.Object get()`
- `public boolean isDefined()`

---

## public class `com.opensymphony.xwork2.util.GlobalLocalizedTextProvider`
extends `com.opensymphony.xwork2.util.AbstractLocalizedTextProvider`  

**Constructors:**
- `public GlobalLocalizedTextProvider()`

**Methods:**
- `public java.lang.String findText(java.lang.Class p0, java.lang.String p1, java.util.Locale p2)`
- `public java.lang.String findText(java.lang.Class p0, java.lang.String p1, java.util.Locale p2, java.lang.String p3, java.lang.Object[] p4)`
- `public java.lang.String findText(java.lang.Class p0, java.lang.String p1, java.util.Locale p2, java.lang.String p3, java.lang.Object[] p4, com.opensymphony.xwork2.util.ValueStack p5)`
- `public java.lang.String findText(java.util.ResourceBundle p0, java.lang.String p1, java.util.Locale p2)`
- `public java.lang.String findText(java.util.ResourceBundle p0, java.lang.String p1, java.util.Locale p2, java.lang.String p3, java.lang.Object[] p4)`

---

## public abstract interface `com.opensymphony.xwork2.util.Key`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.util.KeyProperty`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.util.MemberAccessValueStack`

**Methods:**
- `public abstract void setAcceptProperties(java.util.Set p0)`
- `public abstract void setExcludeProperties(java.util.Set p0)`

---

## public class `com.opensymphony.xwork2.util.NamedVariablePatternMatcher`
implements `com.opensymphony.xwork2.util.PatternMatcher<com.opensymphony.xwork2.util.NamedVariablePatternMatcher$CompiledPattern>`  

**Constructors:**
- `public NamedVariablePatternMatcher()`

**Methods:**
- `public com.opensymphony.xwork2.util.NamedVariablePatternMatcher$CompiledPattern compilePattern(java.lang.String p0)`
- `public boolean isLiteral(java.lang.String p0)`
- `public boolean match(java.util.Map p0, java.lang.String p1, com.opensymphony.xwork2.util.NamedVariablePatternMatcher$CompiledPattern p2)`

---

## public static class `com.opensymphony.xwork2.util.NamedVariablePatternMatcher$CompiledPattern`

**Constructors:**
- `public CompiledPattern(java.util.regex.Pattern p0, java.util.List p1)`

**Methods:**
- `public java.util.regex.Pattern getPattern()`
- `public java.util.List getVariableNames()`

---

## public class `com.opensymphony.xwork2.util.OgnlTextParser`
implements `com.opensymphony.xwork2.util.TextParser`  

**Constructors:**
- `public OgnlTextParser()`

**Methods:**
- `public java.lang.Object evaluate(char[] p0, java.lang.String p1, com.opensymphony.xwork2.util.TextParseUtil$ParsedValueEvaluator p2, int p3)`

---

## public abstract interface `com.opensymphony.xwork2.util.PatternMatcher`<E extends java.lang.Object>

**Methods:**
- `public abstract E compilePattern(java.lang.String p0)`
- `public abstract boolean isLiteral(java.lang.String p0)`
- `public abstract boolean match(java.util.Map p0, java.lang.String p1, E p2)`

---

## public class `com.opensymphony.xwork2.util.PropertiesReader`
extends `java.io.LineNumberReader`  

**Constructors:**
- `public PropertiesReader(java.io.Reader p0)`
- `public PropertiesReader(java.io.Reader p0, char p1)`

**Methods:**
- `public boolean contains(char[] p0, char p1)`
- `public java.util.List getCommentLines()`
- `public java.lang.String getPropertyName()`
- `public java.lang.String getPropertyValue()`
- `public boolean nextProperty() throws java.io.IOException`
- `public java.lang.String readProperty() throws java.io.IOException`
- `public static void unescapeJava(java.io.Writer p0, java.lang.String p1) throws java.io.IOException`
- `public static java.lang.String unescapeJava(java.lang.String p0)`
- `protected static java.lang.String unescapeJava(java.lang.String p0, char p1)`

---

## public class `com.opensymphony.xwork2.util.ProxyUtil`

**Constructors:**
- `public ProxyUtil()`

**Methods:**
- `public static boolean isProxy(java.lang.Object p0)`
- `public static boolean isProxyMember(java.lang.reflect.Member p0, java.lang.Object p1)`
- `public static java.lang.Class ultimateTargetClass(java.lang.Object p0)`

---

## public class `com.opensymphony.xwork2.util.ResolverUtil`<T extends java.lang.Object>

**Constructors:**
- `public ResolverUtil()`

**Methods:**
- `protected void addIfMatching(com.opensymphony.xwork2.util.ResolverUtil$Test p0, java.lang.String p1)`
- `public void find(com.opensymphony.xwork2.util.ResolverUtil$Test p0, java.lang.String... p1)`
- `public void findAnnotated(java.lang.Class p0, java.lang.String... p1)`
- `public void findImplementations(java.lang.Class p0, java.lang.String... p1)`
- `public void findInPackage(com.opensymphony.xwork2.util.ResolverUtil$Test p0, java.lang.String p1)`
- `public void findNamedResource(java.lang.String p0, java.lang.String... p1)`
- `public void findSuffix(java.lang.String p0, java.lang.String... p1)`
- `public java.lang.ClassLoader getClassLoader()`
- `public java.util.Set getClasses()`
- `public java.util.Set getResources()`
- `public void setClassLoader(java.lang.ClassLoader p0)`

---

## public static class `com.opensymphony.xwork2.util.ResolverUtil$AnnotatedWith`
extends `com.opensymphony.xwork2.util.ResolverUtil$ClassTest`  

**Constructors:**
- `public AnnotatedWith(java.lang.Class p0)`

**Methods:**
- `public boolean matches(java.lang.Class p0)`
- `public java.lang.String toString()`

---

## public abstract static class `com.opensymphony.xwork2.util.ResolverUtil$ClassTest`
implements `com.opensymphony.xwork2.util.ResolverUtil$Test`  

**Constructors:**
- `public ClassTest()`

**Methods:**
- `public boolean doesMatchClass()`
- `public boolean doesMatchResource()`
- `public boolean matches(java.net.URL p0)`

---

## public static class `com.opensymphony.xwork2.util.ResolverUtil$IsA`
extends `com.opensymphony.xwork2.util.ResolverUtil$ClassTest`  

**Constructors:**
- `public IsA(java.lang.Class p0)`

**Methods:**
- `public boolean matches(java.lang.Class p0)`
- `public java.lang.String toString()`

---

## public static class `com.opensymphony.xwork2.util.ResolverUtil$NameEndsWith`
extends `com.opensymphony.xwork2.util.ResolverUtil$ClassTest`  

**Constructors:**
- `public NameEndsWith(java.lang.String p0)`

**Methods:**
- `public boolean matches(java.lang.Class p0)`
- `public java.lang.String toString()`

---

## public static class `com.opensymphony.xwork2.util.ResolverUtil$NameIs`
extends `com.opensymphony.xwork2.util.ResolverUtil$ResourceTest`  

**Constructors:**
- `public NameIs(java.lang.String p0)`

**Methods:**
- `public boolean matches(java.net.URL p0)`
- `public java.lang.String toString()`

---

## public abstract static class `com.opensymphony.xwork2.util.ResolverUtil$ResourceTest`
implements `com.opensymphony.xwork2.util.ResolverUtil$Test`  

**Constructors:**
- `public ResourceTest()`

**Methods:**
- `public boolean doesMatchClass()`
- `public boolean doesMatchResource()`
- `public boolean matches(java.lang.Class p0)`

---

## public abstract static interface `com.opensymphony.xwork2.util.ResolverUtil$Test`

**Methods:**
- `public abstract boolean doesMatchClass()`
- `public abstract boolean doesMatchResource()`
- `public abstract boolean matches(java.lang.Class p0)`
- `public abstract boolean matches(java.net.URL p0)`

---

## public class `com.opensymphony.xwork2.util.StrutsLocalizedTextProvider`
extends `com.opensymphony.xwork2.util.AbstractLocalizedTextProvider`  

**Constructors:**
- `public StrutsLocalizedTextProvider()`

**Methods:**
- `public static void clearDefaultResourceBundles()`
- `public java.lang.String findText(java.lang.Class p0, java.lang.String p1, java.util.Locale p2)`
- `public java.lang.String findText(java.lang.Class p0, java.lang.String p1, java.util.Locale p2, java.lang.String p3, java.lang.Object[] p4)`
- `public java.lang.String findText(java.lang.Class p0, java.lang.String p1, java.util.Locale p2, java.lang.String p3, java.lang.Object[] p4, com.opensymphony.xwork2.util.ValueStack p5)`
- `public java.lang.String findText(java.util.ResourceBundle p0, java.lang.String p1, java.util.Locale p2)`
- `public java.lang.String findText(java.util.ResourceBundle p0, java.lang.String p1, java.util.Locale p2, java.lang.String p3, java.lang.Object[] p4)`
- `public static java.util.Locale localeFromString(java.lang.String p0, java.util.Locale p1)`

---

## public class `com.opensymphony.xwork2.util.TextParseUtil`

**Constructors:**
- `public TextParseUtil()`

**Methods:**
- `public static java.util.Set commaDelimitedStringToSet(java.lang.String p0)`
- `public static java.lang.String translateVariables(char p0, java.lang.String p1, com.opensymphony.xwork2.util.ValueStack p2)`
- `public static java.lang.Object translateVariables(char p0, java.lang.String p1, com.opensymphony.xwork2.util.ValueStack p2, java.lang.Class p3)`
- `public static java.lang.Object translateVariables(char p0, java.lang.String p1, com.opensymphony.xwork2.util.ValueStack p2, java.lang.Class p3, com.opensymphony.xwork2.util.TextParseUtil$ParsedValueEvaluator p4)`
- `public static java.lang.Object translateVariables(char p0, java.lang.String p1, com.opensymphony.xwork2.util.ValueStack p2, java.lang.Class p3, com.opensymphony.xwork2.util.TextParseUtil$ParsedValueEvaluator p4, int p5)`
- `public static java.lang.Object translateVariables(char[] p0, java.lang.String p1, com.opensymphony.xwork2.util.ValueStack p2, java.lang.Class p3, com.opensymphony.xwork2.util.TextParseUtil$ParsedValueEvaluator p4)`
- `public static java.lang.Object translateVariables(char[] p0, java.lang.String p1, com.opensymphony.xwork2.util.ValueStack p2, java.lang.Class p3, com.opensymphony.xwork2.util.TextParseUtil$ParsedValueEvaluator p4, int p5)`
- `public static java.lang.String translateVariables(java.lang.String p0, com.opensymphony.xwork2.util.ValueStack p1)`
- `public static java.lang.String translateVariables(java.lang.String p0, com.opensymphony.xwork2.util.ValueStack p1, com.opensymphony.xwork2.util.TextParseUtil$ParsedValueEvaluator p2)`
- `public static java.util.Collection translateVariablesCollection(char[] p0, java.lang.String p1, com.opensymphony.xwork2.util.ValueStack p2, boolean p3, com.opensymphony.xwork2.util.TextParseUtil$ParsedValueEvaluator p4, int p5)`
- `public static java.util.Collection translateVariablesCollection(java.lang.String p0, com.opensymphony.xwork2.util.ValueStack p1, boolean p2, com.opensymphony.xwork2.util.TextParseUtil$ParsedValueEvaluator p3)`

---

## public abstract static interface `com.opensymphony.xwork2.util.TextParseUtil$ParsedValueEvaluator`

**Methods:**
- `public abstract java.lang.Object evaluate(java.lang.String p0)`

---

## public abstract interface `com.opensymphony.xwork2.util.TextParser`

**Fields:**
- `public final static int DEFAULT_LOOP_COUNT`

**Methods:**
- `public abstract java.lang.Object evaluate(char[] p0, java.lang.String p1, com.opensymphony.xwork2.util.TextParseUtil$ParsedValueEvaluator p2, int p3)`

---

## public abstract interface `com.opensymphony.xwork2.util.ValueStack`

**Fields:**
- `public final static java.lang.String REPORT_ERRORS_ON_NO_PROP`
- `public final static java.lang.String VALUE_STACK`

**Methods:**
- `public abstract java.lang.String findString(java.lang.String p0)`
- `public abstract java.lang.String findString(java.lang.String p0, boolean p1)`
- `public abstract java.lang.Object findValue(java.lang.String p0)`
- `public abstract java.lang.Object findValue(java.lang.String p0, boolean p1)`
- `public abstract java.lang.Object findValue(java.lang.String p0, java.lang.Class p1)`
- `public abstract java.lang.Object findValue(java.lang.String p0, java.lang.Class p1, boolean p2)`
- `public abstract java.util.Map getContext()`
- `public abstract java.util.Map getExprOverrides()`
- `public abstract com.opensymphony.xwork2.util.CompoundRoot getRoot()`
- `public abstract java.lang.Object peek()`
- `public abstract java.lang.Object pop()`
- `public abstract void push(java.lang.Object p0)`
- `public abstract void set(java.lang.String p0, java.lang.Object p1)`
- `public abstract void setDefaultType(java.lang.Class p0)`
- `public abstract void setExprOverrides(java.util.Map p0)`
- `public abstract void setParameter(java.lang.String p0, java.lang.Object p1)`
- `public abstract void setValue(java.lang.String p0, java.lang.Object p1)`
- `public abstract void setValue(java.lang.String p0, java.lang.Object p1, boolean p2)`
- `public abstract int size()`

---

## public abstract interface `com.opensymphony.xwork2.util.ValueStackFactory`

**Methods:**
- `public abstract com.opensymphony.xwork2.util.ValueStack createValueStack()`
- `public abstract com.opensymphony.xwork2.util.ValueStack createValueStack(com.opensymphony.xwork2.util.ValueStack p0)`

---

## public class `com.opensymphony.xwork2.util.WildcardHelper`
implements `com.opensymphony.xwork2.util.PatternMatcher<int[]>`  

**Constructors:**
- `public WildcardHelper()`

**Fields:**
- `protected final static int MATCH_BEGIN`
- `protected final static int MATCH_END`
- `protected final static int MATCH_FILE`
- `protected final static int MATCH_PATH`
- `protected final static int MATCH_THEEND`

**Methods:**
- `public int[] compilePattern(java.lang.String p0)`
- `protected int indexOfArray(int[] p0, int p1, int p2, char[] p3, int p4)`
- `public boolean isLiteral(java.lang.String p0)`
- `protected int lastIndexOfArray(int[] p0, int p1, int p2, char[] p3, int p4)`
- `public boolean match(java.util.Map p0, java.lang.String p1, int[] p2)`
- `protected boolean matchArray(int[] p0, int p1, int p2, char[] p3, int p4)`

---

## public class `com.opensymphony.xwork2.util.WildcardUtil`

**Constructors:**
- `public WildcardUtil()`

**Methods:**
- `public static java.util.regex.Pattern compileWildcardPattern(java.lang.String p0)`
- `public static boolean needsBackslashToBeLiteralInRegex(char p0)`

---

## public class `com.opensymphony.xwork2.util.XWorkTestCaseHelper`

**Constructors:**
- `public XWorkTestCaseHelper()`

**Methods:**
- `public static com.opensymphony.xwork2.config.ConfigurationManager loadConfigurationProviders(com.opensymphony.xwork2.config.ConfigurationManager p0, com.opensymphony.xwork2.config.ConfigurationProvider... p1)`
- `public static com.opensymphony.xwork2.config.ConfigurationManager setUp() throws java.lang.Exception`
- `public static void tearDown(com.opensymphony.xwork2.config.ConfigurationManager p0) throws java.lang.Exception`

---

## public abstract class `com.opensymphony.xwork2.util.classloader.AbstractResourceStore`
implements `com.opensymphony.xwork2.util.classloader.ResourceStore`  

**Constructors:**
- `public AbstractResourceStore(java.io.File p0)`

**Fields:**
- `protected final java.io.File file`

**Methods:**
- `protected void closeQuietly(java.io.InputStream p0)`
- `public java.lang.String toString()`
- `public void write(java.lang.String p0, byte[] p1)`

---

## public final class `com.opensymphony.xwork2.util.classloader.FileResourceStore`
extends `com.opensymphony.xwork2.util.classloader.AbstractResourceStore`  

**Constructors:**
- `public FileResourceStore(java.io.File p0)`

**Methods:**
- `public byte[] read(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.util.classloader.JarResourceStore`
extends `com.opensymphony.xwork2.util.classloader.AbstractResourceStore`  

**Constructors:**
- `public JarResourceStore(java.io.File p0)`

**Methods:**
- `public static long copy(java.io.InputStream p0, java.io.OutputStream p1) throws java.io.IOException`
- `public byte[] read(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.util.classloader.ReloadingClassLoader`
extends `java.lang.ClassLoader`  

**Constructors:**
- `public ReloadingClassLoader(java.lang.ClassLoader p0)`

**Methods:**
- `public boolean addResourceStore(com.opensymphony.xwork2.util.classloader.ResourceStore p0)`
- `public void clearAssertionStatus()`
- `public java.net.URL getResource(java.lang.String p0)`
- `public java.io.InputStream getResourceAsStream(java.lang.String p0)`
- `protected boolean isAccepted(java.lang.String p0)`
- `public java.lang.Class loadClass(java.lang.String p0) throws java.lang.ClassNotFoundException`
- `public void reload()`
- `public boolean removeResourceStore(com.opensymphony.xwork2.util.classloader.ResourceStore p0)`
- `public void setAccepClasses(java.util.Set p0)`
- `public void setClassAssertionStatus(java.lang.String p0, boolean p1)`
- `public void setDefaultAssertionStatus(boolean p0)`
- `public void setPackageAssertionStatus(java.lang.String p0, boolean p1)`

---

## public abstract interface `com.opensymphony.xwork2.util.classloader.ResourceStore`

**Methods:**
- `public abstract byte[] read(java.lang.String p0)`
- `public abstract void write(java.lang.String p0, byte[] p1)`

---

## public final class `com.opensymphony.xwork2.util.classloader.ResourceStoreClassLoader`
extends `java.lang.ClassLoader`  

**Constructors:**
- `public ResourceStoreClassLoader(java.lang.ClassLoader p0, com.opensymphony.xwork2.util.classloader.ResourceStore[] p1)`

---

## public abstract interface `com.opensymphony.xwork2.util.finder.ClassFinder`

**Methods:**
- `public abstract java.util.List findAnnotatedClasses(java.lang.Class p0)`
- `public abstract java.util.List findAnnotatedConstructors(java.lang.Class p0)`
- `public abstract java.util.List findAnnotatedFields(java.lang.Class p0)`
- `public abstract java.util.List findAnnotatedMethods(java.lang.Class p0)`
- `public abstract java.util.List findAnnotatedPackages(java.lang.Class p0)`
- `public abstract java.util.List findClasses()`
- `public abstract java.util.List findClasses(com.opensymphony.xwork2.util.finder.Test p0)`
- `public abstract java.util.List findClassesInPackage(java.lang.String p0, boolean p1)`
- `public abstract com.opensymphony.xwork2.util.finder.ClassLoaderInterface getClassLoaderInterface()`
- `public abstract java.util.List getClassesNotLoaded()`
- `public abstract boolean isAnnotationPresent(java.lang.Class p0)`

---

## public static class `com.opensymphony.xwork2.util.finder.ClassFinder$Annotatable`

**Constructors:**
- `public Annotatable()`
- `public Annotatable(java.lang.reflect.AnnotatedElement p0)`

**Methods:**
- `public java.util.List getAnnotations()`

---

## public static class `com.opensymphony.xwork2.util.finder.ClassFinder$AnnotationInfo`
extends `com.opensymphony.xwork2.util.finder.ClassFinder$Annotatable`  
implements `com.opensymphony.xwork2.util.finder.ClassFinder$Info`  

**Constructors:**
- `public AnnotationInfo(java.lang.Class p0)`
- `public AnnotationInfo(java.lang.String p0)`
- `public AnnotationInfo(java.lang.annotation.Annotation p0)`

**Methods:**
- `public java.lang.String getName()`
- `public java.lang.String toString()`

---

## public static class `com.opensymphony.xwork2.util.finder.ClassFinder$ClassInfo`
extends `com.opensymphony.xwork2.util.finder.ClassFinder$Annotatable`  
implements `com.opensymphony.xwork2.util.finder.ClassFinder$Info`  

**Constructors:**
- `public ClassInfo(java.lang.Class p0, com.opensymphony.xwork2.util.finder.ClassFinder p1)`
- `public ClassInfo(java.lang.String p0, java.lang.String p1, com.opensymphony.xwork2.util.finder.ClassFinder p2)`

**Methods:**
- `public java.lang.Class get() throws java.lang.ClassNotFoundException`
- `public java.util.List getConstructors()`
- `public java.util.List getFields()`
- `public java.util.List getInterfaces()`
- `public java.util.List getMethods()`
- `public java.lang.String getName()`
- `public java.lang.String getPackageName()`
- `public java.util.List getSuperInterfaces()`
- `public java.lang.String getSuperType()`
- `public java.lang.String toString()`

---

## public static class `com.opensymphony.xwork2.util.finder.ClassFinder$FieldInfo`
extends `com.opensymphony.xwork2.util.finder.ClassFinder$Annotatable`  
implements `com.opensymphony.xwork2.util.finder.ClassFinder$Info`  

**Constructors:**
- `public FieldInfo(com.opensymphony.xwork2.util.finder.ClassFinder$ClassInfo p0, java.lang.String p1, java.lang.String p2)`
- `public FieldInfo(com.opensymphony.xwork2.util.finder.ClassFinder$ClassInfo p0, java.lang.reflect.Field p1)`

**Methods:**
- `public com.opensymphony.xwork2.util.finder.ClassFinder$ClassInfo getDeclaringClass()`
- `public java.lang.String getName()`
- `public java.lang.String getType()`
- `public java.lang.String toString()`

---

## public abstract static interface `com.opensymphony.xwork2.util.finder.ClassFinder$Info`

**Methods:**
- `public abstract java.util.List getAnnotations()`
- `public abstract java.lang.String getName()`

---

## public static class `com.opensymphony.xwork2.util.finder.ClassFinder$MethodInfo`
extends `com.opensymphony.xwork2.util.finder.ClassFinder$Annotatable`  
implements `com.opensymphony.xwork2.util.finder.ClassFinder$Info`  

**Constructors:**
- `public MethodInfo(com.opensymphony.xwork2.util.finder.ClassFinder$ClassInfo p0, java.lang.String p1, java.lang.String p2)`
- `public MethodInfo(com.opensymphony.xwork2.util.finder.ClassFinder$ClassInfo p0, java.lang.reflect.Constructor p1)`
- `public MethodInfo(com.opensymphony.xwork2.util.finder.ClassFinder$ClassInfo p0, java.lang.reflect.Method p1)`

**Methods:**
- `public com.opensymphony.xwork2.util.finder.ClassFinder$ClassInfo getDeclaringClass()`
- `public java.lang.String getName()`
- `public java.util.List getParameterAnnotations()`
- `public java.util.List getParameterAnnotations(int p0)`
- `public java.lang.String getReturnType()`
- `public java.lang.String toString()`

---

## public static class `com.opensymphony.xwork2.util.finder.ClassFinder$PackageInfo`
extends `com.opensymphony.xwork2.util.finder.ClassFinder$Annotatable`  
implements `com.opensymphony.xwork2.util.finder.ClassFinder$Info`  

**Constructors:**
- `public PackageInfo(java.lang.Package p0)`
- `public PackageInfo(java.lang.String p0, com.opensymphony.xwork2.util.finder.ClassFinder p1)`

**Methods:**
- `public java.lang.Package get() throws java.lang.ClassNotFoundException`
- `public java.lang.String getName()`

---

## public abstract interface `com.opensymphony.xwork2.util.finder.ClassFinderFactory`

**Methods:**
- `public abstract com.opensymphony.xwork2.util.finder.ClassFinder buildClassFinder(com.opensymphony.xwork2.util.finder.ClassLoaderInterface p0, java.util.Collection p1, boolean p2, java.util.Set p3, com.opensymphony.xwork2.util.finder.Test p4)`

---

## public abstract interface `com.opensymphony.xwork2.util.finder.ClassLoaderInterface`

**Fields:**
- `public final static java.lang.String CLASS_LOADER_INTERFACE`

**Methods:**
- `public abstract com.opensymphony.xwork2.util.finder.ClassLoaderInterface getParent()`
- `public abstract java.net.URL getResource(java.lang.String p0)`
- `public abstract java.io.InputStream getResourceAsStream(java.lang.String p0) throws java.io.IOException`
- `public abstract java.util.Enumeration getResources(java.lang.String p0) throws java.io.IOException`
- `public abstract java.lang.Class loadClass(java.lang.String p0) throws java.lang.ClassNotFoundException`

---

## public class `com.opensymphony.xwork2.util.finder.ClassLoaderInterfaceDelegate`
implements `com.opensymphony.xwork2.util.finder.ClassLoaderInterface`  

**Constructors:**
- `public ClassLoaderInterfaceDelegate(java.lang.ClassLoader p0)`

**Methods:**
- `public com.opensymphony.xwork2.util.finder.ClassLoaderInterface getParent()`
- `public java.net.URL getResource(java.lang.String p0)`
- `public java.io.InputStream getResourceAsStream(java.lang.String p0)`
- `public java.util.Enumeration getResources(java.lang.String p0) throws java.io.IOException`
- `public java.lang.Class loadClass(java.lang.String p0) throws java.lang.ClassNotFoundException`

---

## public class `com.opensymphony.xwork2.util.finder.ResourceFinder`

**Constructors:**
- `public ResourceFinder(java.lang.String p0)`
- `public ResourceFinder(java.lang.String p0, com.opensymphony.xwork2.util.finder.ClassLoaderInterface p1)`
- `public ResourceFinder(java.lang.String p0, com.opensymphony.xwork2.util.finder.ClassLoaderInterface p1, java.net.URL... p2)`
- `public ResourceFinder(java.lang.String p0, java.net.URL... p1)`
- `public ResourceFinder(java.net.URL... p0)`

**Methods:**
- `public java.net.URL find(java.lang.String p0) throws java.io.IOException`
- `public java.util.List findAll(java.lang.String p0) throws java.io.IOException`
- `public java.util.List findAllClasses(java.lang.String p0) throws java.io.IOException, java.lang.ClassNotFoundException`
- `public java.util.List findAllImplementations(java.lang.Class p0) throws java.io.IOException, java.lang.ClassNotFoundException`
- `public java.util.List findAllProperties(java.lang.String p0) throws java.io.IOException`
- `public java.util.List findAllStrings(java.lang.String p0) throws java.io.IOException`
- `public java.util.List findAvailableClasses(java.lang.String p0) throws java.io.IOException`
- `public java.util.List findAvailableImplementations(java.lang.Class p0) throws java.io.IOException`
- `public java.util.List findAvailableProperties(java.lang.String p0) throws java.io.IOException`
- `public java.util.List findAvailableStrings(java.lang.String p0) throws java.io.IOException`
- `public java.lang.Class findClass(java.lang.String p0) throws java.io.IOException, java.lang.ClassNotFoundException`
- `public java.lang.Class findImplementation(java.lang.Class p0) throws java.io.IOException, java.lang.ClassNotFoundException`
- `public java.util.Set findPackages(java.lang.String p0) throws java.io.IOException`
- `public java.util.Map findPackagesMap(java.lang.String p0) throws java.io.IOException`
- `public java.util.Properties findProperties(java.lang.String p0) throws java.io.IOException`
- `public java.lang.String findString(java.lang.String p0) throws java.io.IOException`
- `public java.util.Map getResourcesMap(java.lang.String p0) throws java.io.IOException`
- `public java.util.List getResourcesNotLoaded()`
- `public java.util.Map mapAllClasses(java.lang.String p0) throws java.io.IOException, java.lang.ClassNotFoundException`
- `public java.util.Map mapAllImplementations(java.lang.Class p0) throws java.io.IOException, java.lang.ClassNotFoundException`
- `public java.util.Map mapAllProperties(java.lang.String p0) throws java.io.IOException`
- `public java.util.Map mapAllStrings(java.lang.String p0) throws java.io.IOException`
- `public java.util.Map mapAvailableClasses(java.lang.String p0) throws java.io.IOException`
- `public java.util.Map mapAvailableImplementations(java.lang.Class p0) throws java.io.IOException`
- `public java.util.Map mapAvailableProperties(java.lang.String p0) throws java.io.IOException`
- `public java.util.Map mapAvailableStrings(java.lang.String p0) throws java.io.IOException`

---

## public abstract interface `com.opensymphony.xwork2.util.finder.Test`<T extends java.lang.Object>

**Methods:**
- `public abstract boolean test(T p0)`

---

## public class `com.opensymphony.xwork2.util.finder.UrlSet`

**Constructors:**
- `public UrlSet(com.opensymphony.xwork2.util.finder.ClassLoaderInterface p0) throws java.io.IOException`
- `public UrlSet(com.opensymphony.xwork2.util.finder.ClassLoaderInterface p0, java.util.Set p1) throws java.io.IOException`
- `public UrlSet(java.net.URL... p0)`
- `public UrlSet(java.util.Collection p0)`

**Methods:**
- `public com.opensymphony.xwork2.util.finder.UrlSet exclude(com.opensymphony.xwork2.util.finder.ClassLoaderInterface p0) throws java.io.IOException`
- `public com.opensymphony.xwork2.util.finder.UrlSet exclude(com.opensymphony.xwork2.util.finder.UrlSet p0)`
- `public com.opensymphony.xwork2.util.finder.UrlSet exclude(java.io.File p0) throws java.net.MalformedURLException`
- `public com.opensymphony.xwork2.util.finder.UrlSet exclude(java.lang.String p0) throws java.net.MalformedURLException`
- `public com.opensymphony.xwork2.util.finder.UrlSet excludeJavaEndorsedDirs() throws java.net.MalformedURLException`
- `public com.opensymphony.xwork2.util.finder.UrlSet excludeJavaExtDirs() throws java.net.MalformedURLException`
- `public com.opensymphony.xwork2.util.finder.UrlSet excludeJavaHome() throws java.net.MalformedURLException`
- `public com.opensymphony.xwork2.util.finder.UrlSet excludePaths(java.lang.String p0) throws java.net.MalformedURLException`
- `public com.opensymphony.xwork2.util.finder.UrlSet excludeUserExtensionsDir() throws java.net.MalformedURLException`
- `public java.util.List getUrls()`
- `public com.opensymphony.xwork2.util.finder.UrlSet include(com.opensymphony.xwork2.util.finder.UrlSet p0)`
- `public com.opensymphony.xwork2.util.finder.UrlSet includeClassesUrl(com.opensymphony.xwork2.util.finder.ClassLoaderInterface p0, com.opensymphony.xwork2.util.finder.UrlSet$FileProtocolNormalizer p1) throws java.io.IOException`
- `public com.opensymphony.xwork2.util.finder.UrlSet matching(java.lang.String p0)`
- `public com.opensymphony.xwork2.util.finder.UrlSet relative(java.io.File p0) throws java.net.MalformedURLException`

---

## public abstract static interface `com.opensymphony.xwork2.util.finder.UrlSet$FileProtocolNormalizer`

**Methods:**
- `public abstract java.net.URL normalizeToFileProtocol(java.net.URL p0)`

---

## public class `com.opensymphony.xwork2.util.fs.DefaultFileManager`
implements `com.opensymphony.xwork2.FileManager`  

**Constructors:**
- `public DefaultFileManager()`

**Fields:**
- `protected final static java.util.Map files`
- `protected boolean reloadingConfigs`

**Methods:**
- `public boolean fileNeedsReloading(java.lang.String p0)`
- `public boolean fileNeedsReloading(java.net.URL p0)`
- `public java.util.Collection getAllPhysicalUrls(java.net.URL p0) throws java.io.IOException`
- `public boolean internal()`
- `protected boolean isJarURL(java.net.URL p0)`
- `public java.io.InputStream loadFile(java.net.URL p0)`
- `public void monitorFile(java.net.URL p0)`
- `public java.net.URL normalizeToFileProtocol(java.net.URL p0)`
- `public void setReloadingConfigs(boolean p0)`
- `public boolean support()`

---

## public class `com.opensymphony.xwork2.util.fs.DefaultFileManagerFactory`
implements `com.opensymphony.xwork2.FileManagerFactory`  

**Constructors:**
- `public DefaultFileManagerFactory()`

**Methods:**
- `public com.opensymphony.xwork2.FileManager getFileManager()`
- `public void setContainer(com.opensymphony.xwork2.inject.Container p0)`
- `public void setFileManager(com.opensymphony.xwork2.FileManager p0)`
- `public void setReloadingConfigs(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.util.fs.FileRevision`
extends `com.opensymphony.xwork2.util.fs.Revision`  

**Methods:**
- `public static com.opensymphony.xwork2.util.fs.Revision build(java.net.URL p0)`
- `public java.io.File getFile()`
- `public boolean needsReloading()`

---

## public class `com.opensymphony.xwork2.util.fs.JarEntryRevision`
extends `com.opensymphony.xwork2.util.fs.Revision`  

**Methods:**
- `public static com.opensymphony.xwork2.util.fs.Revision build(java.net.URL p0, com.opensymphony.xwork2.FileManager p1)`
- `public boolean needsReloading()`

---

## public class `com.opensymphony.xwork2.util.fs.Revision`

**Constructors:**
- `protected Revision()`

**Methods:**
- `public static com.opensymphony.xwork2.util.fs.Revision build(java.net.URL p0)`
- `public boolean needsReloading()`

---

## public abstract interface `com.opensymphony.xwork2.util.location.Locatable`

**Methods:**
- `public abstract com.opensymphony.xwork2.util.location.Location getLocation()`

---

## public class `com.opensymphony.xwork2.util.location.LocatableProperties`
extends `java.util.Properties`  
implements `com.opensymphony.xwork2.util.location.Locatable`  

**Constructors:**
- `public LocatableProperties()`
- `public LocatableProperties(com.opensymphony.xwork2.util.location.Location p0)`

**Methods:**
- `public com.opensymphony.xwork2.util.location.Location getLocation()`
- `public com.opensymphony.xwork2.util.location.Location getPropertyLocation(java.lang.String p0)`
- `public void load(java.io.InputStream p0) throws java.io.IOException`
- `public java.lang.Object setProperty(java.lang.String p0, java.lang.String p1, java.lang.Object p2)`

---

## public abstract class `com.opensymphony.xwork2.util.location.Located`
implements `com.opensymphony.xwork2.util.location.Locatable`  

**Constructors:**
- `public Located()`

**Fields:**
- `protected com.opensymphony.xwork2.util.location.Location location`

**Methods:**
- `public com.opensymphony.xwork2.util.location.Location getLocation()`
- `public void setLocation(com.opensymphony.xwork2.util.location.Location p0)`

---

## public abstract interface `com.opensymphony.xwork2.util.location.Location`

**Fields:**
- `public final static com.opensymphony.xwork2.util.location.Location UNKNOWN`

**Methods:**
- `public abstract int getColumnNumber()`
- `public abstract java.lang.String getDescription()`
- `public abstract int getLineNumber()`
- `public abstract java.util.List getSnippet(int p0)`
- `public abstract java.lang.String getURI()`

---

## public class `com.opensymphony.xwork2.util.location.LocationAttributes`

**Fields:**
- `public final static java.lang.String COL_ATTR`
- `public final static java.lang.String LINE_ATTR`
- `public final static java.lang.String PREFIX`
- `public final static java.lang.String Q_COL_ATTR`
- `public final static java.lang.String Q_LINE_ATTR`
- `public final static java.lang.String Q_SRC_ATTR`
- `public final static java.lang.String SRC_ATTR`
- `public final static java.lang.String URI`

**Methods:**
- `public static org.xml.sax.Attributes addLocationAttributes(org.xml.sax.Locator p0, org.xml.sax.Attributes p1)`
- `public static int getColumn(org.w3c.dom.Element p0)`
- `public static int getColumn(org.xml.sax.Attributes p0)`
- `public static int getLine(org.w3c.dom.Element p0)`
- `public static int getLine(org.xml.sax.Attributes p0)`
- `public static com.opensymphony.xwork2.util.location.Location getLocation(org.w3c.dom.Element p0)`
- `public static com.opensymphony.xwork2.util.location.Location getLocation(org.w3c.dom.Element p0, java.lang.String p1)`
- `public static com.opensymphony.xwork2.util.location.Location getLocation(org.xml.sax.Attributes p0, java.lang.String p1)`
- `public static java.lang.String getLocationString(org.w3c.dom.Element p0)`
- `public static java.lang.String getLocationString(org.xml.sax.Attributes p0)`
- `public static java.lang.String getURI(org.w3c.dom.Element p0)`
- `public static java.lang.String getURI(org.xml.sax.Attributes p0)`
- `public static void remove(org.w3c.dom.Element p0, boolean p1)`

---

## public static class `com.opensymphony.xwork2.util.location.LocationAttributes$Pipe`
implements `org.xml.sax.ContentHandler`  

**Constructors:**
- `public Pipe()`
- `public Pipe(org.xml.sax.ContentHandler p0)`

**Methods:**
- `public void characters(char[] p0, int p1, int p2) throws org.xml.sax.SAXException`
- `public void endDocument() throws org.xml.sax.SAXException`
- `public void endElement(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws org.xml.sax.SAXException`
- `public void endPrefixMapping(java.lang.String p0) throws org.xml.sax.SAXException`
- `public void ignorableWhitespace(char[] p0, int p1, int p2) throws org.xml.sax.SAXException`
- `public void processingInstruction(java.lang.String p0, java.lang.String p1) throws org.xml.sax.SAXException`
- `public void setDocumentLocator(org.xml.sax.Locator p0)`
- `public void skippedEntity(java.lang.String p0) throws org.xml.sax.SAXException`
- `public void startDocument() throws org.xml.sax.SAXException`
- `public void startElement(java.lang.String p0, java.lang.String p1, java.lang.String p2, org.xml.sax.Attributes p3) throws org.xml.sax.SAXException`
- `public void startPrefixMapping(java.lang.String p0, java.lang.String p1) throws org.xml.sax.SAXException`

---

## public class `com.opensymphony.xwork2.util.location.LocationImpl`
implements `com.opensymphony.xwork2.util.location.Location`, `java.io.Serializable`  

**Constructors:**
- `public LocationImpl(com.opensymphony.xwork2.util.location.Location p0)`
- `public LocationImpl(java.lang.String p0, com.opensymphony.xwork2.util.location.Location p1)`
- `public LocationImpl(java.lang.String p0, java.lang.String p1)`
- `public LocationImpl(java.lang.String p0, java.lang.String p1, int p2, int p3)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public static com.opensymphony.xwork2.util.location.LocationImpl get(com.opensymphony.xwork2.util.location.Location p0)`
- `public int getColumnNumber()`
- `public java.lang.String getDescription()`
- `public int getLineNumber()`
- `public java.util.List getSnippet(int p0)`
- `public java.lang.String getURI()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.opensymphony.xwork2.util.location.LocationUtils`

**Fields:**
- `public final static java.lang.String UNKNOWN_STRING`

**Methods:**
- `public static void addFinder(com.opensymphony.xwork2.util.location.LocationUtils$LocationFinder p0)`
- `public static com.opensymphony.xwork2.util.location.Location getLocation(java.lang.Object p0)`
- `public static com.opensymphony.xwork2.util.location.Location getLocation(java.lang.Object p0, java.lang.String p1)`
- `public static boolean isKnown(com.opensymphony.xwork2.util.location.Location p0)`
- `public static boolean isUnknown(com.opensymphony.xwork2.util.location.Location p0)`
- `public static com.opensymphony.xwork2.util.location.LocationImpl parse(java.lang.String p0) throws java.lang.IllegalArgumentException`
- `public static java.lang.String toString(com.opensymphony.xwork2.util.location.Location p0)`

---

## public abstract static interface `com.opensymphony.xwork2.util.location.LocationUtils$LocationFinder`

**Methods:**
- `public abstract com.opensymphony.xwork2.util.location.Location getLocation(java.lang.Object p0, java.lang.String p1)`

---

## public abstract interface `com.opensymphony.xwork2.util.logging.Logger`
annotations: @java.lang.Deprecated  

**Methods:**
- `public abstract void debug(java.lang.String p0, java.lang.Object... p1)`
- `public abstract void debug(java.lang.String p0, java.lang.String... p1)`
- `public abstract void debug(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`
- `public abstract void error(java.lang.String p0, java.lang.Object... p1)`
- `public abstract void error(java.lang.String p0, java.lang.String... p1)`
- `public abstract void error(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`
- `public abstract void fatal(java.lang.String p0, java.lang.String... p1)`
- `public abstract void fatal(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`
- `public abstract void info(java.lang.String p0, java.lang.String... p1)`
- `public abstract void info(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`
- `public abstract boolean isDebugEnabled()`
- `public abstract boolean isErrorEnabled()`
- `public abstract boolean isFatalEnabled()`
- `public abstract boolean isInfoEnabled()`
- `public abstract boolean isTraceEnabled()`
- `public abstract boolean isWarnEnabled()`
- `public abstract void trace(java.lang.String p0, java.lang.Object... p1)`
- `public abstract void trace(java.lang.String p0, java.lang.String... p1)`
- `public abstract void trace(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`
- `public abstract void warn(java.lang.String p0, java.lang.Object... p1)`
- `public abstract void warn(java.lang.String p0, java.lang.String... p1)`
- `public abstract void warn(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`

---

## public abstract class `com.opensymphony.xwork2.util.logging.LoggerFactory`
annotations: @java.lang.Deprecated  

**Constructors:**
- `public LoggerFactory()`

**Methods:**
- `public static com.opensymphony.xwork2.util.logging.Logger getLogger(java.lang.Class p0)`
- `public static com.opensymphony.xwork2.util.logging.Logger getLogger(java.lang.String p0)`
- `protected static com.opensymphony.xwork2.util.logging.LoggerFactory getLoggerFactory()`
- `protected abstract com.opensymphony.xwork2.util.logging.Logger getLoggerImpl(java.lang.Class p0)`
- `protected abstract com.opensymphony.xwork2.util.logging.Logger getLoggerImpl(java.lang.String p0)`
- `public static void setLoggerFactory(com.opensymphony.xwork2.util.logging.LoggerFactory p0)`

---

## public class `com.opensymphony.xwork2.util.logging.LoggerUtils`
annotations: @java.lang.Deprecated  

**Constructors:**
- `public LoggerUtils()`

**Methods:**
- `public static java.lang.String format(java.lang.String p0, java.lang.Object[] p1)`
- `public static java.lang.String format(java.lang.String p0, java.lang.String... p1)`

---

## public class `com.opensymphony.xwork2.util.logging.commons.CommonsLogger`
annotations: @java.lang.Deprecated  
implements `com.opensymphony.xwork2.util.logging.Logger`  

**Constructors:**
- `public CommonsLogger(org.apache.commons.logging.Log p0)`

**Methods:**
- `public void debug(java.lang.String p0, java.lang.Object... p1)`
- `public void debug(java.lang.String p0, java.lang.String... p1)`
- `public void debug(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`
- `public void error(java.lang.String p0, java.lang.Object... p1)`
- `public void error(java.lang.String p0, java.lang.String... p1)`
- `public void error(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`
- `public void fatal(java.lang.String p0, java.lang.String... p1)`
- `public void fatal(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`
- `public void info(java.lang.String p0, java.lang.String... p1)`
- `public void info(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`
- `public boolean isDebugEnabled()`
- `public boolean isErrorEnabled()`
- `public boolean isFatalEnabled()`
- `public boolean isInfoEnabled()`
- `public boolean isTraceEnabled()`
- `public boolean isWarnEnabled()`
- `public void trace(java.lang.String p0, java.lang.Object... p1)`
- `public void trace(java.lang.String p0, java.lang.String... p1)`
- `public void trace(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`
- `public void warn(java.lang.String p0, java.lang.Object... p1)`
- `public void warn(java.lang.String p0, java.lang.String... p1)`
- `public void warn(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`

---

## public class `com.opensymphony.xwork2.util.logging.commons.CommonsLoggerFactory`
annotations: @java.lang.Deprecated  
extends `com.opensymphony.xwork2.util.logging.LoggerFactory`  

**Constructors:**
- `public CommonsLoggerFactory()`

**Methods:**
- `protected com.opensymphony.xwork2.util.logging.Logger getLoggerImpl(java.lang.Class p0)`
- `protected com.opensymphony.xwork2.util.logging.Logger getLoggerImpl(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.util.logging.jdk.JdkLogger`
annotations: @java.lang.Deprecated  
implements `com.opensymphony.xwork2.util.logging.Logger`  

**Constructors:**
- `public JdkLogger(java.util.logging.Logger p0)`

**Methods:**
- `public void debug(java.lang.String p0, java.lang.Object... p1)`
- `public void debug(java.lang.String p0, java.lang.String... p1)`
- `public void debug(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`
- `public void error(java.lang.String p0, java.lang.Object... p1)`
- `public void error(java.lang.String p0, java.lang.String... p1)`
- `public void error(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`
- `public void fatal(java.lang.String p0, java.lang.String... p1)`
- `public void fatal(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`
- `public void info(java.lang.String p0, java.lang.String... p1)`
- `public void info(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`
- `public boolean isDebugEnabled()`
- `public boolean isErrorEnabled()`
- `public boolean isFatalEnabled()`
- `public boolean isInfoEnabled()`
- `public boolean isTraceEnabled()`
- `public boolean isWarnEnabled()`
- `public void trace(java.lang.String p0, java.lang.Object... p1)`
- `public void trace(java.lang.String p0, java.lang.String... p1)`
- `public void trace(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`
- `public void warn(java.lang.String p0, java.lang.Object... p1)`
- `public void warn(java.lang.String p0, java.lang.String... p1)`
- `public void warn(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`

---

## public class `com.opensymphony.xwork2.util.logging.jdk.JdkLoggerFactory`
annotations: @java.lang.Deprecated  
extends `com.opensymphony.xwork2.util.logging.LoggerFactory`  

**Constructors:**
- `public JdkLoggerFactory()`

**Methods:**
- `protected com.opensymphony.xwork2.util.logging.Logger getLoggerImpl(java.lang.Class p0)`
- `protected com.opensymphony.xwork2.util.logging.Logger getLoggerImpl(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.util.logging.log4j2.Log4j2Logger`
annotations: @java.lang.Deprecated  
implements `com.opensymphony.xwork2.util.logging.Logger`  

**Constructors:**
- `public Log4j2Logger(org.apache.logging.log4j.Logger p0)`

**Methods:**
- `public void debug(java.lang.String p0, java.lang.Object... p1)`
- `public void debug(java.lang.String p0, java.lang.String... p1)`
- `public void debug(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`
- `public void error(java.lang.String p0, java.lang.Object... p1)`
- `public void error(java.lang.String p0, java.lang.String... p1)`
- `public void error(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`
- `public void fatal(java.lang.String p0, java.lang.String... p1)`
- `public void fatal(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`
- `public void info(java.lang.String p0, java.lang.String... p1)`
- `public void info(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`
- `public boolean isDebugEnabled()`
- `public boolean isErrorEnabled()`
- `public boolean isFatalEnabled()`
- `public boolean isInfoEnabled()`
- `public boolean isTraceEnabled()`
- `public boolean isWarnEnabled()`
- `public void trace(java.lang.String p0, java.lang.Object... p1)`
- `public void trace(java.lang.String p0, java.lang.String... p1)`
- `public void trace(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`
- `public void warn(java.lang.String p0, java.lang.Object... p1)`
- `public void warn(java.lang.String p0, java.lang.String... p1)`
- `public void warn(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`

---

## public class `com.opensymphony.xwork2.util.logging.log4j2.Log4j2LoggerFactory`
annotations: @java.lang.Deprecated  
extends `com.opensymphony.xwork2.util.logging.LoggerFactory`  

**Constructors:**
- `public Log4j2LoggerFactory()`

**Methods:**
- `protected com.opensymphony.xwork2.util.logging.Logger getLoggerImpl(java.lang.Class p0)`
- `protected com.opensymphony.xwork2.util.logging.Logger getLoggerImpl(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.util.logging.slf4j.Slf4jLogger`
annotations: @java.lang.Deprecated  
implements `com.opensymphony.xwork2.util.logging.Logger`  

**Constructors:**
- `public Slf4jLogger(org.slf4j.Logger p0)`

**Methods:**
- `public void debug(java.lang.String p0, java.lang.Object... p1)`
- `public void debug(java.lang.String p0, java.lang.String... p1)`
- `public void debug(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`
- `public void error(java.lang.String p0, java.lang.Object... p1)`
- `public void error(java.lang.String p0, java.lang.String... p1)`
- `public void error(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`
- `public void fatal(java.lang.String p0, java.lang.String... p1)`
- `public void fatal(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`
- `public void info(java.lang.String p0, java.lang.String... p1)`
- `public void info(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`
- `public boolean isDebugEnabled()`
- `public boolean isErrorEnabled()`
- `public boolean isFatalEnabled()`
- `public boolean isInfoEnabled()`
- `public boolean isTraceEnabled()`
- `public boolean isWarnEnabled()`
- `public void trace(java.lang.String p0, java.lang.Object... p1)`
- `public void trace(java.lang.String p0, java.lang.String... p1)`
- `public void trace(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`
- `public void warn(java.lang.String p0, java.lang.Object... p1)`
- `public void warn(java.lang.String p0, java.lang.String... p1)`
- `public void warn(java.lang.String p0, java.lang.Throwable p1, java.lang.String... p2)`

---

## public class `com.opensymphony.xwork2.util.logging.slf4j.Slf4jLoggerFactory`
annotations: @java.lang.Deprecated  
extends `com.opensymphony.xwork2.util.logging.LoggerFactory`  

**Constructors:**
- `public Slf4jLoggerFactory()`

**Methods:**
- `protected com.opensymphony.xwork2.util.logging.Logger getLoggerImpl(java.lang.Class p0)`
- `protected com.opensymphony.xwork2.util.logging.Logger getLoggerImpl(java.lang.String p0)`

---

## public class `com.opensymphony.xwork2.util.profiling.ObjectProfiler`
annotations: @java.lang.Deprecated  

**Constructors:**
- `public ObjectProfiler()`

**Methods:**
- `public static java.lang.Object getProfiledObject(java.lang.Class p0, java.lang.Object p1)`
- `public static java.lang.String getTrimmedClassName(java.lang.reflect.Method p0)`
- `public static java.lang.Object profiledInvoke(java.lang.reflect.Method p0, java.lang.Object p1, java.lang.Object[] p2) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException`

---

## public class `com.opensymphony.xwork2.util.profiling.ProfilingTimerBean`
annotations: @java.lang.Deprecated  
implements `java.io.Serializable`  

**Constructors:**
- `public ProfilingTimerBean(java.lang.String p0)`

**Methods:**
- `public void addChild(com.opensymphony.xwork2.util.profiling.ProfilingTimerBean p0)`
- `protected void addParent(com.opensymphony.xwork2.util.profiling.ProfilingTimerBean p0)`
- `public com.opensymphony.xwork2.util.profiling.ProfilingTimerBean getParent()`
- `protected java.lang.String getPrintable(java.lang.String p0, long p1)`
- `public java.lang.String getPrintable(long p0)`
- `public java.lang.String getResource()`
- `public void setEndTime()`
- `public void setStartTime()`

---

## public class `com.opensymphony.xwork2.util.profiling.UtilTimerStack`
annotations: @java.lang.Deprecated  

**Constructors:**
- `public UtilTimerStack()`

**Fields:**
- `public final static java.lang.String ACTIVATE_PROPERTY`
- `public final static java.lang.String MIN_TIME`
- `protected static java.lang.ThreadLocal current`

**Methods:**
- `public static boolean isActive()`
- `public static void pop(java.lang.String p0)`
- `public static <T extends java.lang.Object> T profile(java.lang.String p0, com.opensymphony.xwork2.util.profiling.UtilTimerStack$ProfilingBlock p1) throws java.lang.Exception`
- `public static void push(java.lang.String p0)`
- `public static void setActive(boolean p0)`

---

## public abstract static interface `com.opensymphony.xwork2.util.profiling.UtilTimerStack$ProfilingBlock`<T extends java.lang.Object>

**Methods:**
- `public abstract T doProfiling() throws java.lang.Exception`

---

## public abstract interface `com.opensymphony.xwork2.util.reflection.ReflectionContextFactory`

**Methods:**
- `public abstract java.util.Map createDefaultContext(java.lang.Object p0)`

---

## public class `com.opensymphony.xwork2.util.reflection.ReflectionContextState`

**Constructors:**
- `public ReflectionContextState()`

**Fields:**
- `public final static java.lang.String CREATE_NULL_OBJECTS`
- `public final static java.lang.String CURRENT_PROPERTY_PATH`
- `public final static java.lang.String DENY_INDEXED_ACCESS_EXECUTION`
- `public final static java.lang.String DENY_METHOD_EXECUTION`
- `public final static java.lang.String FULL_PROPERTY_PATH`

**Methods:**
- `public static void clear(java.util.Map p0)`
- `public static void clearCurrentPropertyPath(java.util.Map p0)`
- `public static java.lang.String getCurrentPropertyPath(java.util.Map p0)`
- `public static java.lang.String getFullPropertyPath(java.util.Map p0)`
- `public static java.lang.Class getLastBeanClassAccessed(java.util.Map p0)`
- `public static java.lang.String getLastBeanPropertyAccessed(java.util.Map p0)`
- `public static java.util.Map getSetMap(java.util.Map p0, java.lang.String p1)`
- `public static boolean isCreatingNullObjects(java.util.Map p0)`
- `public static boolean isDenyMethodExecution(java.util.Map p0)`
- `public static boolean isGettingByKeyProperty(java.util.Map p0)`
- `public static boolean isReportingConversionErrors(java.util.Map p0)`
- `public static void setCreatingNullObjects(java.util.Map p0, boolean p1)`
- `public static void setDenyMethodExecution(java.util.Map p0, boolean p1)`
- `public static void setFullPropertyPath(java.util.Map p0, java.lang.String p1)`
- `public static void setGettingByKeyProperty(java.util.Map p0, boolean p1)`
- `public static void setLastBeanClassAccessed(java.util.Map p0, java.lang.Class p1)`
- `public static void setLastBeanPropertyAccessed(java.util.Map p0, java.lang.String p1)`
- `public static void setReportingConversionErrors(java.util.Map p0, boolean p1)`
- `public static void setSetMap(java.util.Map p0, java.util.Map p1, java.lang.String p2)`
- `public static void updateCurrentPropertyPath(java.util.Map p0, java.lang.Object p1)`

---

## public class `com.opensymphony.xwork2.util.reflection.ReflectionException`
extends `com.opensymphony.xwork2.XWorkException`  

**Constructors:**
- `public ReflectionException()`
- `public ReflectionException(java.lang.String p0)`
- `public ReflectionException(java.lang.String p0, java.lang.Object p1)`
- `public ReflectionException(java.lang.String p0, java.lang.Throwable p1)`
- `public ReflectionException(java.lang.String p0, java.lang.Throwable p1, java.lang.Object p2)`
- `public ReflectionException(java.lang.Throwable p0)`
- `public ReflectionException(java.lang.Throwable p0, java.lang.Object p1)`

---

## public abstract interface `com.opensymphony.xwork2.util.reflection.ReflectionExceptionHandler`

**Methods:**
- `public abstract void handle(com.opensymphony.xwork2.util.reflection.ReflectionException p0)`

---

## public abstract interface `com.opensymphony.xwork2.util.reflection.ReflectionProvider`

**Methods:**
- `public abstract void copy(java.lang.Object p0, java.lang.Object p1, java.util.Map p2, java.util.Collection p3, java.util.Collection p4)`
- `public abstract void copy(java.lang.Object p0, java.lang.Object p1, java.util.Map p2, java.util.Collection p3, java.util.Collection p4, java.lang.Class p5)`
- `public abstract java.util.Map getBeanMap(java.lang.Object p0) throws com.opensymphony.xwork2.util.reflection.ReflectionException, java.beans.IntrospectionException`
- `public abstract java.lang.reflect.Field getField(java.lang.Class p0, java.lang.String p1)`
- `public abstract java.lang.reflect.Method getGetMethod(java.lang.Class p0, java.lang.String p1) throws com.opensymphony.xwork2.util.reflection.ReflectionException, java.beans.IntrospectionException`
- `public abstract java.beans.PropertyDescriptor getPropertyDescriptor(java.lang.Class p0, java.lang.String p1) throws com.opensymphony.xwork2.util.reflection.ReflectionException, java.beans.IntrospectionException`
- `public abstract java.beans.PropertyDescriptor[] getPropertyDescriptors(java.lang.Object p0) throws java.beans.IntrospectionException`
- `public abstract java.lang.Object getRealTarget(java.lang.String p0, java.util.Map p1, java.lang.Object p2) throws com.opensymphony.xwork2.util.reflection.ReflectionException`
- `public abstract java.lang.reflect.Method getSetMethod(java.lang.Class p0, java.lang.String p1) throws com.opensymphony.xwork2.util.reflection.ReflectionException, java.beans.IntrospectionException`
- `public abstract java.lang.Object getValue(java.lang.String p0, java.util.Map p1, java.lang.Object p2) throws com.opensymphony.xwork2.util.reflection.ReflectionException`
- `public abstract void setProperties(java.util.Map p0, java.lang.Object p1)`
- `public abstract void setProperties(java.util.Map p0, java.lang.Object p1, java.util.Map p2)`
- `public abstract void setProperties(java.util.Map p0, java.lang.Object p1, java.util.Map p2, boolean p3) throws com.opensymphony.xwork2.util.reflection.ReflectionException`
- `public abstract void setProperty(java.lang.String p0, java.lang.Object p1, java.lang.Object p2, java.util.Map p3)`
- `public abstract void setProperty(java.lang.String p0, java.lang.Object p1, java.lang.Object p2, java.util.Map p3, boolean p4)`
- `public abstract void setValue(java.lang.String p0, java.util.Map p1, java.lang.Object p2, java.lang.Object p3) throws com.opensymphony.xwork2.util.reflection.ReflectionException`

---

## public class `com.opensymphony.xwork2.util.reflection.ReflectionProviderFactory`
annotations: @java.lang.Deprecated  

**Constructors:**
- `public ReflectionProviderFactory()`

**Methods:**
- `public static com.opensymphony.xwork2.util.reflection.ReflectionProvider getInstance()`

---

## public abstract interface `com.opensymphony.xwork2.validator.ActionValidatorManager`

**Methods:**
- `public abstract java.util.List getValidators(java.lang.Class p0, java.lang.String p1)`
- `public abstract java.util.List getValidators(java.lang.Class p0, java.lang.String p1, java.lang.String p2)`
- `public abstract void validate(java.lang.Object p0, java.lang.String p1) throws com.opensymphony.xwork2.validator.ValidationException`
- `public abstract void validate(java.lang.Object p0, java.lang.String p1, com.opensymphony.xwork2.validator.ValidatorContext p2) throws com.opensymphony.xwork2.validator.ValidationException`
- `public abstract void validate(java.lang.Object p0, java.lang.String p1, com.opensymphony.xwork2.validator.ValidatorContext p2, java.lang.String p3) throws com.opensymphony.xwork2.validator.ValidationException`
- `public abstract void validate(java.lang.Object p0, java.lang.String p1, java.lang.String p2) throws com.opensymphony.xwork2.validator.ValidationException`

---

## public class `com.opensymphony.xwork2.validator.AnnotationActionValidatorManager`
implements `com.opensymphony.xwork2.validator.ActionValidatorManager`  

**Constructors:**
- `public AnnotationActionValidatorManager()`

**Fields:**
- `protected final static java.lang.String VALIDATION_CONFIG_SUFFIX`

**Methods:**
- `protected java.util.List buildClassValidatorConfigs(java.lang.Class p0, boolean p1)`
- `protected java.lang.String buildValidatorKey(java.lang.Class p0, java.lang.String p1)`
- `public java.util.List getValidators(java.lang.Class p0, java.lang.String p1)`
- `public java.util.List getValidators(java.lang.Class p0, java.lang.String p1, java.lang.String p2)`
- `public void setFileManagerFactory(com.opensymphony.xwork2.FileManagerFactory p0)`
- `public void setReloadingConfigs(java.lang.String p0)`
- `public void setTextProviderFactory(com.opensymphony.xwork2.TextProviderFactory p0)`
- `public void setValidatorFactory(com.opensymphony.xwork2.validator.ValidatorFactory p0)`
- `public void setValidatorFileParser(com.opensymphony.xwork2.validator.ValidatorFileParser p0)`
- `public void validate(java.lang.Object p0, java.lang.String p1) throws com.opensymphony.xwork2.validator.ValidationException`
- `public void validate(java.lang.Object p0, java.lang.String p1, com.opensymphony.xwork2.validator.ValidatorContext p2) throws com.opensymphony.xwork2.validator.ValidationException`
- `public void validate(java.lang.Object p0, java.lang.String p1, com.opensymphony.xwork2.validator.ValidatorContext p2, java.lang.String p3) throws com.opensymphony.xwork2.validator.ValidationException`
- `public void validate(java.lang.Object p0, java.lang.String p1, java.lang.String p2) throws com.opensymphony.xwork2.validator.ValidationException`

---

## public class `com.opensymphony.xwork2.validator.AnnotationValidationConfigurationBuilder`

**Constructors:**
- `public AnnotationValidationConfigurationBuilder(com.opensymphony.xwork2.validator.ValidatorFactory p0)`

**Methods:**
- `public java.util.List buildAnnotationClassValidatorConfigs(java.lang.Class p0)`

---

## public class `com.opensymphony.xwork2.validator.DefaultActionValidatorManager`
implements `com.opensymphony.xwork2.validator.ActionValidatorManager`  

**Constructors:**
- `public DefaultActionValidatorManager()`

**Fields:**
- `protected final static java.lang.String VALIDATION_CONFIG_SUFFIX`

**Methods:**
- `protected static java.lang.String buildValidatorKey(java.lang.Class p0, java.lang.String p1)`
- `public synchronized java.util.List getValidators(java.lang.Class p0, java.lang.String p1)`
- `public synchronized java.util.List getValidators(java.lang.Class p0, java.lang.String p1, java.lang.String p2)`
- `public void setFileManagerFactory(com.opensymphony.xwork2.FileManagerFactory p0)`
- `public void setReloadingConfigs(java.lang.String p0)`
- `public void setTextProviderFactory(com.opensymphony.xwork2.TextProviderFactory p0)`
- `public void setValidatorFactory(com.opensymphony.xwork2.validator.ValidatorFactory p0)`
- `public void setValidatorFileParser(com.opensymphony.xwork2.validator.ValidatorFileParser p0)`
- `public void validate(java.lang.Object p0, java.lang.String p1) throws com.opensymphony.xwork2.validator.ValidationException`
- `public void validate(java.lang.Object p0, java.lang.String p1, com.opensymphony.xwork2.validator.ValidatorContext p2) throws com.opensymphony.xwork2.validator.ValidationException`
- `public void validate(java.lang.Object p0, java.lang.String p1, com.opensymphony.xwork2.validator.ValidatorContext p2, java.lang.String p3) throws com.opensymphony.xwork2.validator.ValidationException`
- `public void validate(java.lang.Object p0, java.lang.String p1, java.lang.String p2) throws com.opensymphony.xwork2.validator.ValidationException`

---

## public class `com.opensymphony.xwork2.validator.DefaultValidatorFactory`
implements `com.opensymphony.xwork2.inject.Initializable`, `com.opensymphony.xwork2.validator.ValidatorFactory`  

**Constructors:**
- `public DefaultValidatorFactory(com.opensymphony.xwork2.ObjectFactory p0, com.opensymphony.xwork2.validator.ValidatorFileParser p1)`

**Fields:**
- `protected com.opensymphony.xwork2.ObjectFactory objectFactory`
- `protected com.opensymphony.xwork2.validator.ValidatorFileParser validatorFileParser`
- `protected java.util.Map validators`

**Methods:**
- `public com.opensymphony.xwork2.validator.Validator getValidator(com.opensymphony.xwork2.validator.ValidatorConfig p0)`
- `public void init()`
- `public java.lang.String lookupRegisteredValidatorType(java.lang.String p0)`
- `public void registerValidator(java.lang.String p0, java.lang.String p1)`

---

## public class `com.opensymphony.xwork2.validator.DefaultValidatorFileParser`
implements `com.opensymphony.xwork2.validator.ValidatorFileParser`  

**Constructors:**
- `public DefaultValidatorFileParser()`

**Methods:**
- `public java.lang.String getMultiTextvalueSeparator()`
- `public java.lang.String getTextValue(org.w3c.dom.Element p0)`
- `public java.util.List parseActionValidatorConfigs(com.opensymphony.xwork2.validator.ValidatorFactory p0, java.io.InputStream p1, java.lang.String p2)`
- `public void parseValidatorDefinitions(java.util.Map p0, java.io.InputStream p1, java.lang.String p2)`
- `public void setMultiTextvalueSeparator(java.lang.String p0)`
- `public void setObjectFactory(com.opensymphony.xwork2.ObjectFactory p0)`

---

## public class `com.opensymphony.xwork2.validator.DelegatingValidatorContext`
implements `com.opensymphony.xwork2.validator.ValidatorContext`  

**Constructors:**
- `public DelegatingValidatorContext(com.opensymphony.xwork2.interceptor.ValidationAware p0, com.opensymphony.xwork2.TextProvider p1, com.opensymphony.xwork2.LocaleProvider p2)`
- `public DelegatingValidatorContext(java.lang.Class p0)`
- `public DelegatingValidatorContext(java.lang.Object p0, com.opensymphony.xwork2.TextProviderFactory p1)`

**Methods:**
- `public void addActionError(java.lang.String p0)`
- `public void addActionMessage(java.lang.String p0)`
- `public void addFieldError(java.lang.String p0, java.lang.String p1)`
- `public java.util.Collection getActionErrors()`
- `public java.util.Collection getActionMessages()`
- `public java.util.Map getFieldErrors()`
- `public java.lang.String getFullFieldName(java.lang.String p0)`
- `public java.util.Locale getLocale()`
- `public java.lang.String getText(java.lang.String p0)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1, java.lang.String[] p2)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1, java.lang.String[] p2, com.opensymphony.xwork2.util.ValueStack p3)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1, java.util.List p2)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String p1, java.util.List p2, com.opensymphony.xwork2.util.ValueStack p3)`
- `public java.lang.String getText(java.lang.String p0, java.lang.String[] p1)`
- `public java.lang.String getText(java.lang.String p0, java.util.List p1)`
- `protected com.opensymphony.xwork2.TextProvider getTextProvider()`
- `public java.util.ResourceBundle getTexts()`
- `public java.util.ResourceBundle getTexts(java.lang.String p0)`
- `protected com.opensymphony.xwork2.interceptor.ValidationAware getValidationAware()`
- `public boolean hasActionErrors()`
- `public boolean hasActionMessages()`
- `public boolean hasErrors()`
- `public boolean hasFieldErrors()`
- `public boolean hasKey(java.lang.String p0)`
- `public boolean isValidLocale(java.util.Locale p0)`
- `public boolean isValidLocaleString(java.lang.String p0)`
- `protected static com.opensymphony.xwork2.LocaleProvider makeLocaleProvider(java.lang.Object p0)`
- `public com.opensymphony.xwork2.TextProvider makeTextProvider(java.lang.Object p0, com.opensymphony.xwork2.TextProviderFactory p1)`
- `protected static com.opensymphony.xwork2.interceptor.ValidationAware makeValidationAware(java.lang.Object p0)`
- `public void setActionErrors(java.util.Collection p0)`
- `public void setActionMessages(java.util.Collection p0)`
- `public void setFieldErrors(java.util.Map p0)`
- `protected void setTextProvider(com.opensymphony.xwork2.TextProvider p0)`
- `protected void setValidationAware(com.opensymphony.xwork2.interceptor.ValidationAware p0)`

---

## public abstract interface `com.opensymphony.xwork2.validator.FieldValidator`
implements `com.opensymphony.xwork2.validator.Validator`  

**Methods:**
- `public abstract java.lang.String getFieldName()`
- `public abstract void setFieldName(java.lang.String p0)`

---

## public abstract interface `com.opensymphony.xwork2.validator.ShortCircuitableValidator`

**Methods:**
- `public abstract boolean isShortCircuit()`
- `public abstract void setShortCircuit(boolean p0)`

---

## public class `com.opensymphony.xwork2.validator.ValidationException`
extends `java.lang.Exception`  

**Constructors:**
- `public ValidationException()`
- `public ValidationException(java.lang.String p0)`
- `public ValidationException(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `com.opensymphony.xwork2.validator.ValidationInterceptor`
extends `com.opensymphony.xwork2.interceptor.MethodFilterInterceptor`  

**Constructors:**
- `public ValidationInterceptor()`

**Methods:**
- `protected void doBeforeInvocation(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `protected java.lang.String doIntercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `protected java.lang.String getValidationContext(com.opensymphony.xwork2.ActionProxy p0)`
- `public boolean isValidateAnnotatedMethodOnly()`
- `public void setActionValidatorManager(com.opensymphony.xwork2.validator.ActionValidatorManager p0)`
- `public void setAlwaysInvokeValidate(java.lang.String p0)`
- `public void setDeclarative(boolean p0)`
- `public void setProgrammatic(boolean p0)`
- `public void setValidateAnnotatedMethodOnly(boolean p0)`

---

## public abstract interface `com.opensymphony.xwork2.validator.Validator`<T extends java.lang.Object>

**Methods:**
- `public abstract java.lang.String getDefaultMessage()`
- `public abstract java.lang.String getMessage(java.lang.Object p0)`
- `public abstract java.lang.String getMessageKey()`
- `public abstract java.lang.String[] getMessageParameters()`
- `public abstract com.opensymphony.xwork2.validator.ValidatorContext getValidatorContext()`
- `public abstract java.lang.String getValidatorType()`
- `public abstract void setDefaultMessage(java.lang.String p0)`
- `public abstract void setMessageKey(java.lang.String p0)`
- `public abstract void setMessageParameters(java.lang.String[] p0)`
- `public abstract void setValidatorContext(com.opensymphony.xwork2.validator.ValidatorContext p0)`
- `public abstract void setValidatorType(java.lang.String p0)`
- `public abstract void setValueStack(com.opensymphony.xwork2.util.ValueStack p0)`
- `public abstract void validate(java.lang.Object p0) throws com.opensymphony.xwork2.validator.ValidationException`

---

## public class `com.opensymphony.xwork2.validator.ValidatorConfig`
extends `com.opensymphony.xwork2.util.location.Located`  

**Constructors:**
- `protected ValidatorConfig(com.opensymphony.xwork2.validator.ValidatorConfig p0)`
- `protected ValidatorConfig(java.lang.String p0)`

**Methods:**
- `public java.lang.String getDefaultMessage()`
- `public java.lang.String getMessageKey()`
- `public java.lang.String[] getMessageParams()`
- `public java.util.Map getParams()`
- `public java.lang.String getType()`
- `public boolean isShortCircuit()`

---

## public final static class `com.opensymphony.xwork2.validator.ValidatorConfig$Builder`

**Constructors:**
- `public Builder(com.opensymphony.xwork2.validator.ValidatorConfig p0)`
- `public Builder(java.lang.String p0)`

**Methods:**
- `public com.opensymphony.xwork2.validator.ValidatorConfig$Builder addParam(java.lang.String p0, java.lang.Object p1)`
- `public com.opensymphony.xwork2.validator.ValidatorConfig$Builder addParams(java.util.Map p0)`
- `public com.opensymphony.xwork2.validator.ValidatorConfig build()`
- `public com.opensymphony.xwork2.validator.ValidatorConfig$Builder defaultMessage(java.lang.String p0)`
- `public com.opensymphony.xwork2.validator.ValidatorConfig$Builder location(com.opensymphony.xwork2.util.location.Location p0)`
- `public com.opensymphony.xwork2.validator.ValidatorConfig$Builder messageKey(java.lang.String p0)`
- `public com.opensymphony.xwork2.validator.ValidatorConfig$Builder messageParams(java.lang.String[] p0)`
- `public com.opensymphony.xwork2.validator.ValidatorConfig$Builder removeParam(java.lang.String p0)`
- `public com.opensymphony.xwork2.validator.ValidatorConfig$Builder shortCircuit(boolean p0)`

---

## public abstract interface `com.opensymphony.xwork2.validator.ValidatorContext`
implements `com.opensymphony.xwork2.LocaleProvider`, `com.opensymphony.xwork2.TextProvider`, `com.opensymphony.xwork2.interceptor.ValidationAware`  

**Methods:**
- `public abstract java.lang.String getFullFieldName(java.lang.String p0)`

---

## public abstract interface `com.opensymphony.xwork2.validator.ValidatorFactory`

**Methods:**
- `public abstract com.opensymphony.xwork2.validator.Validator getValidator(com.opensymphony.xwork2.validator.ValidatorConfig p0)`
- `public abstract java.lang.String lookupRegisteredValidatorType(java.lang.String p0)`
- `public abstract void registerValidator(java.lang.String p0, java.lang.String p1)`

---

## public abstract interface `com.opensymphony.xwork2.validator.ValidatorFileParser`

**Methods:**
- `public abstract java.util.List parseActionValidatorConfigs(com.opensymphony.xwork2.validator.ValidatorFactory p0, java.io.InputStream p1, java.lang.String p2)`
- `public abstract void parseValidatorDefinitions(java.util.Map p0, java.io.InputStream p1, java.lang.String p2)`

---

## public abstract interface `com.opensymphony.xwork2.validator.annotations.ConditionalVisitorFieldValidator`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.validator.annotations.ConversionErrorFieldValidator`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.validator.annotations.CreditCardValidator`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.validator.annotations.CustomValidator`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.validator.annotations.DateRangeFieldValidator`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.validator.annotations.DoubleRangeFieldValidator`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.validator.annotations.EmailValidator`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.validator.annotations.ExpressionValidator`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.validator.annotations.FieldExpressionValidator`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.validator.annotations.LongRangeFieldValidator`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.validator.annotations.RegexFieldValidator`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.validator.annotations.RequiredStringValidator`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.validator.annotations.ShortRangeFieldValidator`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.validator.annotations.UrlValidator`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.validator.annotations.Validation`
annotations: @java.lang.Deprecated, @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.validator.annotations.ValidationParameter`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `com.opensymphony.xwork2.validator.annotations.Validations`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public final enum `com.opensymphony.xwork2.validator.annotations.ValidatorType`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.opensymphony.xwork2.validator.annotations.ValidatorType FIELD`
- `public final static com.opensymphony.xwork2.validator.annotations.ValidatorType SIMPLE`

**Methods:**
- `public java.lang.String toString()`

---

## public abstract interface `com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public class `com.opensymphony.xwork2.validator.validators.ConditionalVisitorFieldValidator`
extends `com.opensymphony.xwork2.validator.validators.VisitorFieldValidator`  

**Constructors:**
- `public ConditionalVisitorFieldValidator()`

**Methods:**
- `public java.lang.String getExpression()`
- `public void setExpression(java.lang.String p0)`
- `public void validate(java.lang.Object p0) throws com.opensymphony.xwork2.validator.ValidationException`
- `public boolean validateExpression(java.lang.Object p0) throws com.opensymphony.xwork2.validator.ValidationException`

---

## public class `com.opensymphony.xwork2.validator.validators.ConversionErrorFieldValidator`
extends `com.opensymphony.xwork2.validator.validators.RepopulateConversionErrorFieldValidatorSupport`  

**Constructors:**
- `public ConversionErrorFieldValidator()`

**Methods:**
- `public void doValidate(java.lang.Object p0) throws com.opensymphony.xwork2.validator.ValidationException`

---

## public class `com.opensymphony.xwork2.validator.validators.CreditCardValidator`
extends `com.opensymphony.xwork2.validator.validators.RegexFieldValidator`  

**Constructors:**
- `public CreditCardValidator()`

**Fields:**
- `public final static java.lang.String CREDIT_CARD_PATTERN`

**Methods:**
- `protected void validateFieldValue(java.lang.Object p0, java.lang.String p1, java.lang.String p2)`

---

## public final class `com.opensymphony.xwork2.validator.validators.DateRangeFieldValidator`
extends `com.opensymphony.xwork2.validator.validators.RangeValidatorSupport`  

**Constructors:**
- `public DateRangeFieldValidator()`

---

## public class `com.opensymphony.xwork2.validator.validators.DoubleRangeFieldValidator`
extends `com.opensymphony.xwork2.validator.validators.FieldValidatorSupport`  

**Constructors:**
- `public DoubleRangeFieldValidator()`

**Methods:**
- `public java.lang.Double getMaxExclusive()`
- `public java.lang.Double getMaxInclusive()`
- `public java.lang.Double getMinExclusive()`
- `public java.lang.Double getMinInclusive()`
- `public void setMaxExclusive(java.lang.Double p0)`
- `public void setMaxExclusiveExpression(java.lang.String p0)`
- `public void setMaxInclusive(java.lang.Double p0)`
- `public void setMaxInclusiveExpression(java.lang.String p0)`
- `public void setMinExclusive(java.lang.Double p0)`
- `public void setMinExclusiveExpression(java.lang.String p0)`
- `public void setMinInclusive(java.lang.Double p0)`
- `public void setMinInclusiveExpression(java.lang.String p0)`
- `public void validate(java.lang.Object p0) throws com.opensymphony.xwork2.validator.ValidationException`
- `protected void validateCollection(java.lang.Double p0, java.lang.Double p1, java.lang.Double p2, java.lang.Double p3, java.util.Collection p4)`
- `protected void validateValue(java.lang.Object p0, java.lang.Double p1, java.lang.Double p2, java.lang.Double p3, java.lang.Double p4)`

---

## public class `com.opensymphony.xwork2.validator.validators.EmailValidator`
extends `com.opensymphony.xwork2.validator.validators.RegexFieldValidator`  

**Constructors:**
- `public EmailValidator()`

**Fields:**
- `public final static java.lang.String EMAIL_ADDRESS_PATTERN`

---

## public class `com.opensymphony.xwork2.validator.validators.ExpressionValidator`
extends `com.opensymphony.xwork2.validator.validators.ValidatorSupport`  

**Constructors:**
- `public ExpressionValidator()`

**Methods:**
- `public java.lang.String getExpression()`
- `public void setExpression(java.lang.String p0)`
- `public void validate(java.lang.Object p0) throws com.opensymphony.xwork2.validator.ValidationException`

---

## public class `com.opensymphony.xwork2.validator.validators.FieldExpressionValidator`
extends `com.opensymphony.xwork2.validator.validators.FieldValidatorSupport`  

**Constructors:**
- `public FieldExpressionValidator()`

**Methods:**
- `public java.lang.String getExpression()`
- `public void setExpression(java.lang.String p0)`
- `public void validate(java.lang.Object p0) throws com.opensymphony.xwork2.validator.ValidationException`

---

## public abstract class `com.opensymphony.xwork2.validator.validators.FieldValidatorSupport`
extends `com.opensymphony.xwork2.validator.validators.ValidatorSupport`  
implements `com.opensymphony.xwork2.validator.FieldValidator`  

**Constructors:**
- `public FieldValidatorSupport()`

**Fields:**
- `protected java.lang.Object currentValue`
- `protected java.lang.String fieldName`
- `protected java.lang.String type`

**Methods:**
- `public java.lang.Object getCurrentValue()`
- `public java.lang.String getFieldName()`
- `public java.lang.String getValidatorType()`
- `public void setFieldName(java.lang.String p0)`
- `public void setValidatorType(java.lang.String p0)`

---

## public final class `com.opensymphony.xwork2.validator.validators.IntRangeFieldValidator`
extends `com.opensymphony.xwork2.validator.validators.RangeValidatorSupport`  

**Constructors:**
- `public IntRangeFieldValidator()`

---

## public final class `com.opensymphony.xwork2.validator.validators.LongRangeFieldValidator`
extends `com.opensymphony.xwork2.validator.validators.RangeValidatorSupport`  

**Constructors:**
- `public LongRangeFieldValidator()`

---

## public abstract class `com.opensymphony.xwork2.validator.validators.RangeValidatorSupport`<T extends java.lang.Comparable>
extends `com.opensymphony.xwork2.validator.validators.FieldValidatorSupport`  

**Constructors:**
- `protected RangeValidatorSupport(java.lang.Class p0)`

**Methods:**
- `public T getMax()`
- `public T getMin()`
- `protected T getT(T p0, java.lang.String p1, java.lang.Class p2)`
- `public void setMax(T p0)`
- `public void setMaxExpression(java.lang.String p0)`
- `public void setMin(T p0)`
- `public void setMinExpression(java.lang.String p0)`
- `public void validate(java.lang.Object p0) throws com.opensymphony.xwork2.validator.ValidationException`
- `protected void validateValue(java.lang.Object p0, java.lang.Comparable p1, T p2, T p3)`

---

## public class `com.opensymphony.xwork2.validator.validators.RegexFieldValidator`
extends `com.opensymphony.xwork2.validator.validators.FieldValidatorSupport`  

**Constructors:**
- `public RegexFieldValidator()`

**Methods:**
- `public java.lang.String getRegex()`
- `public boolean isCaseSensitive()`
- `public boolean isTrimed()`
- `public void setCaseSensitive(java.lang.Boolean p0)`
- `public void setCaseSensitiveExpression(java.lang.String p0)`
- `public void setRegex(java.lang.String p0)`
- `public void setRegexExpression(java.lang.String p0)`
- `public void setTrim(java.lang.Boolean p0)`
- `public void setTrimExpression(java.lang.String p0)`
- `public void validate(java.lang.Object p0) throws com.opensymphony.xwork2.validator.ValidationException`
- `protected void validateFieldValue(java.lang.Object p0, java.lang.String p1, java.lang.String p2)`

---

## public abstract class `com.opensymphony.xwork2.validator.validators.RepopulateConversionErrorFieldValidatorSupport`
extends `com.opensymphony.xwork2.validator.validators.FieldValidatorSupport`  

**Constructors:**
- `public RepopulateConversionErrorFieldValidatorSupport()`

**Methods:**
- `protected abstract void doValidate(java.lang.Object p0) throws com.opensymphony.xwork2.validator.ValidationException`
- `protected java.lang.String escape(java.lang.String p0)`
- `public boolean isRepopulateField()`
- `public void repopulateField(java.lang.Object p0) throws com.opensymphony.xwork2.validator.ValidationException`
- `public void setRepopulateField(boolean p0)`
- `public void validate(java.lang.Object p0) throws com.opensymphony.xwork2.validator.ValidationException`

---

## public class `com.opensymphony.xwork2.validator.validators.RequiredFieldValidator`
extends `com.opensymphony.xwork2.validator.validators.FieldValidatorSupport`  

**Constructors:**
- `public RequiredFieldValidator()`

**Methods:**
- `public void validate(java.lang.Object p0) throws com.opensymphony.xwork2.validator.ValidationException`

---

## public class `com.opensymphony.xwork2.validator.validators.RequiredStringValidator`
extends `com.opensymphony.xwork2.validator.validators.FieldValidatorSupport`  

**Constructors:**
- `public RequiredStringValidator()`

**Methods:**
- `public boolean isTrim()`
- `public void setTrim(boolean p0)`
- `public void setTrimExpression(java.lang.String p0)`
- `public void validate(java.lang.Object p0) throws com.opensymphony.xwork2.validator.ValidationException`
- `protected void validateValue(java.lang.Object p0, java.lang.Object p1)`

---

## public final class `com.opensymphony.xwork2.validator.validators.ShortRangeFieldValidator`
extends `com.opensymphony.xwork2.validator.validators.RangeValidatorSupport`  

**Constructors:**
- `public ShortRangeFieldValidator()`

---

## public class `com.opensymphony.xwork2.validator.validators.StringLengthFieldValidator`
extends `com.opensymphony.xwork2.validator.validators.FieldValidatorSupport`  

**Constructors:**
- `public StringLengthFieldValidator()`

**Methods:**
- `public int getMaxLength()`
- `public int getMinLength()`
- `public boolean isTrim()`
- `public void setMaxLength(int p0)`
- `public void setMaxLengthExpression(java.lang.String p0)`
- `public void setMinLength(int p0)`
- `public void setMinLengthExpression(java.lang.String p0)`
- `public void setTrim(boolean p0)`
- `public void setTrimExpression(java.lang.String p0)`
- `public void validate(java.lang.Object p0) throws com.opensymphony.xwork2.validator.ValidationException`
- `protected void validateValue(java.lang.Object p0, java.lang.Object p1)`

---

## public class `com.opensymphony.xwork2.validator.validators.URLValidator`
extends `com.opensymphony.xwork2.validator.validators.FieldValidatorSupport`  

**Constructors:**
- `public URLValidator()`

**Fields:**
- `public final static java.lang.String DEFAULT_URL_REGEX`

**Methods:**
- `protected java.util.regex.Pattern getUrlPattern()`
- `public java.lang.String getUrlRegex()`
- `public void setUrlRegex(java.lang.String p0)`
- `public void setUrlRegexExpression(java.lang.String p0)`
- `public void validate(java.lang.Object p0) throws com.opensymphony.xwork2.validator.ValidationException`
- `protected void validateValue(java.lang.Object p0, java.lang.Object p1)`

---

## public abstract class `com.opensymphony.xwork2.validator.validators.ValidatorSupport`
implements `com.opensymphony.xwork2.validator.ShortCircuitableValidator`, `com.opensymphony.xwork2.validator.Validator`  

**Constructors:**
- `public ValidatorSupport()`

**Fields:**
- `public final static java.lang.String EMPTY_STRING`
- `protected java.lang.String defaultMessage`
- `protected java.lang.String messageKey`
- `protected com.opensymphony.xwork2.util.ValueStack stack`
- `protected com.opensymphony.xwork2.TextProviderFactory textProviderFactory`

**Methods:**
- `protected void addActionError(java.lang.Object p0)`
- `protected void addFieldError(java.lang.String p0, java.lang.Object p1)`
- `public java.lang.String getDefaultMessage()`
- `protected java.lang.Object getFieldValue(java.lang.String p0, java.lang.Object p1) throws com.opensymphony.xwork2.validator.ValidationException`
- `public java.lang.String getMessage(java.lang.Object p0)`
- `public java.lang.String getMessageKey()`
- `public java.lang.String[] getMessageParameters()`
- `public com.opensymphony.xwork2.validator.ValidatorContext getValidatorContext()`
- `public java.lang.String getValidatorType()`
- `public boolean isShortCircuit()`
- `protected java.lang.Object parse(java.lang.String p0, java.lang.Class p1)`
- `public void setDefaultMessage(java.lang.String p0)`
- `public void setMessageKey(java.lang.String p0)`
- `public void setMessageParameters(java.lang.String[] p0)`
- `public void setShortCircuit(boolean p0)`
- `public void setTextProviderFactory(com.opensymphony.xwork2.TextProviderFactory p0)`
- `public void setValidatorContext(com.opensymphony.xwork2.validator.ValidatorContext p0)`
- `public void setValidatorType(java.lang.String p0)`
- `public void setValueStack(com.opensymphony.xwork2.util.ValueStack p0)`

---

## public class `com.opensymphony.xwork2.validator.validators.VisitorFieldValidator`
extends `com.opensymphony.xwork2.validator.validators.FieldValidatorSupport`  

**Constructors:**
- `public VisitorFieldValidator()`

**Methods:**
- `public java.lang.String getContext()`
- `public boolean isAppendPrefix()`
- `public void setActionValidatorManager(com.opensymphony.xwork2.validator.ActionValidatorManager p0)`
- `public void setAppendPrefix(boolean p0)`
- `public void setContext(java.lang.String p0)`
- `public void validate(java.lang.Object p0) throws com.opensymphony.xwork2.validator.ValidationException`

---

## public static class `com.opensymphony.xwork2.validator.validators.VisitorFieldValidator$AppendingValidatorContext`
extends `com.opensymphony.xwork2.validator.DelegatingValidatorContext`  

**Constructors:**
- `public AppendingValidatorContext(com.opensymphony.xwork2.validator.ValidatorContext p0, com.opensymphony.xwork2.TextProvider p1, java.lang.String p2, java.lang.String p3)`

**Methods:**
- `public void addActionError(java.lang.String p0)`
- `public void addFieldError(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String getFieldNameWithField(java.lang.String p0)`
- `public java.lang.String getFullFieldName(java.lang.String p0)`

---

## public class `org.apache.struts2.RequestUtils`

**Constructors:**
- `public RequestUtils()`

**Methods:**
- `public static java.lang.String getServletPath(javax.servlet.http.HttpServletRequest p0)`
- `public static java.lang.String getUri(javax.servlet.http.HttpServletRequest p0)`
- `public static java.util.Date parseIfModifiedSince(java.lang.String p0)`

---

## public class `org.apache.struts2.ServletActionContext`
extends `com.opensymphony.xwork2.ActionContext`  
implements `org.apache.struts2.StrutsStatics`  

**Fields:**
- `public final static java.lang.String ACTION_MAPPING`
- `public final static java.lang.String STRUTS_VALUESTACK_KEY`

**Methods:**
- `public static com.opensymphony.xwork2.ActionContext getActionContext(javax.servlet.http.HttpServletRequest p0)`
- `public static org.apache.struts2.dispatcher.mapper.ActionMapping getActionMapping()`
- `public static javax.servlet.jsp.PageContext getPageContext()`
- `public static javax.servlet.http.HttpServletRequest getRequest()`
- `public static javax.servlet.http.HttpServletResponse getResponse()`
- `public static javax.servlet.ServletContext getServletContext()`
- `public static com.opensymphony.xwork2.util.ValueStack getValueStack(javax.servlet.http.HttpServletRequest p0)`
- `public static void setRequest(javax.servlet.http.HttpServletRequest p0)`
- `public static void setResponse(javax.servlet.http.HttpServletResponse p0)`
- `public static void setServletContext(javax.servlet.ServletContext p0)`

---

## public final class `org.apache.struts2.StrutsConstants`

**Constructors:**
- `public StrutsConstants()`

**Fields:**
- `public final static java.lang.String DEFAULT_TEMPLATE_TYPE_CONFIG_KEY`
- `public final static java.lang.String PREFIX_BASED_MAPPER_CONFIGURATION`
- `public final static java.lang.String STRUTS_ACCEPTED_PATTERNS_CHECKER`
- `public final static java.lang.String STRUTS_ACTIONPROXYFACTORY`
- `public final static java.lang.String STRUTS_ACTIONVALIDATORMANAGER`
- `public final static java.lang.String STRUTS_ACTION_EXCLUDE_PATTERN`
- `public final static java.lang.String STRUTS_ACTION_EXTENSION`
- `public final static java.lang.String STRUTS_ADDITIONAL_ACCEPTED_PATTERNS`
- `public final static java.lang.String STRUTS_ADDITIONAL_EXCLUDED_PATTERNS`
- `public final static java.lang.String STRUTS_ALLOWED_ACTION_NAMES`
- `public final static java.lang.String STRUTS_ALLOWED_METHOD_NAMES`
- `public final static java.lang.String STRUTS_ALLOWED_NAMESPACE_NAMES`
- `public final static java.lang.String STRUTS_ALLOW_STATIC_METHOD_ACCESS`
- `public final static java.lang.String STRUTS_ALWAYS_SELECT_FULL_NAMESPACE`
- `public final static java.lang.String STRUTS_CONFIGURATION`
- `public final static java.lang.String STRUTS_CONFIGURATION_XML_RELOAD`
- `public final static java.lang.String STRUTS_CONTENT_TYPE_MATCHER`
- `public final static java.lang.String STRUTS_CONTINUATIONS_PACKAGE`
- `public final static java.lang.String STRUTS_CONVERTER_ANNOTATION_PROCESSOR`
- `public final static java.lang.String STRUTS_CONVERTER_ARRAY`
- `public final static java.lang.String STRUTS_CONVERTER_COLLECTION`
- `public final static java.lang.String STRUTS_CONVERTER_CREATOR`
- `public final static java.lang.String STRUTS_CONVERTER_DATE`
- `public final static java.lang.String STRUTS_CONVERTER_FILE_PROCESSOR`
- `public final static java.lang.String STRUTS_CONVERTER_HOLDER`
- `public final static java.lang.String STRUTS_CONVERTER_NUMBER`
- `public final static java.lang.String STRUTS_CONVERTER_PROPERTIES_PROCESSOR`
- `public final static java.lang.String STRUTS_CONVERTER_STRING`
- `public final static java.lang.String STRUTS_CUSTOM_I18N_RESOURCES`
- `public final static java.lang.String STRUTS_CUSTOM_PROPERTIES`
- `public final static java.lang.String STRUTS_DEFAULT_ACTION_NAME`
- `public final static java.lang.String STRUTS_DEFAULT_METHOD_NAME`
- `public final static java.lang.String STRUTS_DEFAULT_NAMESPACE_NAME`
- `public final static java.lang.String STRUTS_DEVMODE`
- `public final static java.lang.String STRUTS_DISABLE_REQUEST_ATTRIBUTE_VALUE_STACK_LOOKUP`
- `public final static java.lang.String STRUTS_DISALLOW_PROXY_MEMBER_ACCESS`
- `public final static java.lang.String STRUTS_DISPATCHER_ERROR_HANDLER`
- `public final static java.lang.String STRUTS_DISPATCHER_PARAMETERSWORKAROUND`
- `public final static java.lang.String STRUTS_EL_THROW_EXCEPTION`
- `public final static java.lang.String STRUTS_ENABLE_DYNAMIC_METHOD_INVOCATION`
- `public final static java.lang.String STRUTS_ENABLE_OGNL_EVAL_EXPRESSION`
- `public final static java.lang.String STRUTS_ENABLE_OGNL_EXPRESSION_CACHE`
- `public final static java.lang.String STRUTS_ENABLE_SLASHES_IN_ACTION_NAMES`
- `public final static java.lang.String STRUTS_EXCLUDED_CLASSES`
- `public final static java.lang.String STRUTS_EXCLUDED_PACKAGE_NAMES`
- `public final static java.lang.String STRUTS_EXCLUDED_PACKAGE_NAME_PATTERNS`
- `public final static java.lang.String STRUTS_EXCLUDED_PATTERNS_CHECKER`
- `public final static java.lang.String STRUTS_EXPRESSION_PARSER`
- `public final static java.lang.String STRUTS_FILE_MANAGER`
- `public final static java.lang.String STRUTS_FILE_MANAGER_FACTORY`
- `public final static java.lang.String STRUTS_FREEMARKER_BEANWRAPPER_CACHE`
- `public final static java.lang.String STRUTS_FREEMARKER_MANAGER_CLASSNAME`
- `public final static java.lang.String STRUTS_FREEMARKER_MRU_MAX_STRONG_SIZE`
- `public final static java.lang.String STRUTS_FREEMARKER_TEMPLATES_CACHE_UPDATE_DELAY`
- `public final static java.lang.String STRUTS_FREEMARKER_WRAPPER_ALT_MAP`
- `public final static java.lang.String STRUTS_HANDLE_EXCEPTION`
- `public final static java.lang.String STRUTS_I18N_ENCODING`
- `public final static java.lang.String STRUTS_I18N_RELOAD`
- `public final static java.lang.String STRUTS_ID_PARAMETER_NAME`
- `public final static java.lang.String STRUTS_LOCALE`
- `public final static java.lang.String STRUTS_LOCALE_PROVIDER`
- `public final static java.lang.String STRUTS_LOCALE_PROVIDER_FACTORY`
- `public final static java.lang.String STRUTS_LOCALIZED_TEXT_PROVIDER`
- `public final static java.lang.String STRUTS_LOG_MISSING_PROPERTIES`
- `public final static java.lang.String STRUTS_MAPPER_ACTION_PREFIX_CROSSNAMESPACES`
- `public final static java.lang.String STRUTS_MAPPER_ACTION_PREFIX_ENABLED`
- `public final static java.lang.String STRUTS_MAPPER_CLASS`
- `public final static java.lang.String STRUTS_MAPPER_COMPOSITE`
- `public final static java.lang.String STRUTS_MATCHER_APPEND_NAMED_PARAMETERS`
- `public final static java.lang.String STRUTS_MULTIPART_BUFFERSIZE`
- `public final static java.lang.String STRUTS_MULTIPART_ENABLED`
- `public final static java.lang.String STRUTS_MULTIPART_MAXSIZE`
- `public final static java.lang.String STRUTS_MULTIPART_PARSER`
- `public final static java.lang.String STRUTS_MULTIPART_SAVEDIR`
- `public final static java.lang.String STRUTS_MULTIPART_VALIDATION_REGEX`
- `public final static java.lang.String STRUTS_OBJECTFACTORY`
- `public final static java.lang.String STRUTS_OBJECTFACTORY_ACTIONFACTORY`
- `public final static java.lang.String STRUTS_OBJECTFACTORY_CONVERTERFACTORY`
- `public final static java.lang.String STRUTS_OBJECTFACTORY_INTERCEPTORFACTORY`
- `public final static java.lang.String STRUTS_OBJECTFACTORY_RESULTFACTORY`
- `public final static java.lang.String STRUTS_OBJECTFACTORY_SPRING_AUTOWIRE`
- `public final static java.lang.String STRUTS_OBJECTFACTORY_SPRING_AUTOWIRE_ALWAYS_RESPECT`
- `public final static java.lang.String STRUTS_OBJECTFACTORY_SPRING_ENABLE_AOP_SUPPORT`
- `public final static java.lang.String STRUTS_OBJECTFACTORY_SPRING_USE_CLASS_CACHE`
- `public final static java.lang.String STRUTS_OBJECTFACTORY_UNKNOWNHANDLERFACTORY`
- `public final static java.lang.String STRUTS_OBJECTFACTORY_VALIDATORFACTORY`
- `public final static java.lang.String STRUTS_OBJECTTYPEDETERMINER`
- `public final static java.lang.String STRUTS_OGNL_AUTO_GROWTH_COLLECTION_LIMIT`
- `public final static java.lang.String STRUTS_OGNL_EXPRESSION_MAX_LENGTH`
- `public final static java.lang.String STRUTS_OVERRIDE_ACCEPTED_PATTERNS`
- `public final static java.lang.String STRUTS_OVERRIDE_EXCLUDED_PATTERNS`
- `public final static java.lang.String STRUTS_PATTERNMATCHER`
- `public final static java.lang.String STRUTS_REFLECTIONCONTEXTFACTORY`
- `public final static java.lang.String STRUTS_REFLECTIONPROVIDER`
- `public final static java.lang.String STRUTS_SERVE_STATIC_BROWSER_CACHE`
- `public final static java.lang.String STRUTS_SERVE_STATIC_CONTENT`
- `public final static java.lang.String STRUTS_SMI_METHOD_REGEX`
- `public final static java.lang.String STRUTS_STATIC_CONTENT_LOADER`
- `public final static java.lang.String STRUTS_TAG_ALTSYNTAX`
- `public final static java.lang.String STRUTS_TAG_INCLUDETAG_USERESPONSEENCODING`
- `public final static java.lang.String STRUTS_TEXT_PROVIDER`
- `public final static java.lang.String STRUTS_TEXT_PROVIDER_FACTORY`
- `public final static java.lang.String STRUTS_UI_TEMPLATEDIR`
- `public final static java.lang.String STRUTS_UI_THEME`
- `public final static java.lang.String STRUTS_UI_THEME_EXPANSION_TOKEN`
- `public final static java.lang.String STRUTS_UNKNOWN_HANDLER_MANAGER`
- `public final static java.lang.String STRUTS_URL_HELPER`
- `public final static java.lang.String STRUTS_URL_HTTPS_PORT`
- `public final static java.lang.String STRUTS_URL_HTTP_PORT`
- `public final static java.lang.String STRUTS_URL_INCLUDEPARAMS`
- `public final static java.lang.String STRUTS_URL_RENDERER`
- `public final static java.lang.String STRUTS_VALUESTACKFACTORY`
- `public final static java.lang.String STRUTS_VELOCITY_CONFIGFILE`
- `public final static java.lang.String STRUTS_VELOCITY_CONTEXTS`
- `public final static java.lang.String STRUTS_VELOCITY_MANAGER_CLASSNAME`
- `public final static java.lang.String STRUTS_VELOCITY_TOOLBOXLOCATION`
- `public final static java.lang.String STRUTS_XSLT_NOCACHE`
- `public final static java.lang.String STRUTS_XWORKCONVERTER`
- `public final static java.lang.String STRUTS_XWORKTEXTPROVIDER`

---

## public class `org.apache.struts2.StrutsException`
extends `com.opensymphony.xwork2.XWorkException`  
implements `com.opensymphony.xwork2.util.location.Locatable`  

**Constructors:**
- `public StrutsException()`
- `public StrutsException(java.lang.String p0)`
- `public StrutsException(java.lang.String p0, java.lang.Object p1)`
- `public StrutsException(java.lang.String p0, java.lang.Throwable p1)`
- `public StrutsException(java.lang.String p0, java.lang.Throwable p1, java.lang.Object p2)`
- `public StrutsException(java.lang.Throwable p0)`
- `public StrutsException(java.lang.Throwable p0, java.lang.Object p1)`

---

## public abstract interface `org.apache.struts2.StrutsStatics`

**Fields:**
- `public final static java.lang.String HTTP_REQUEST`
- `public final static java.lang.String HTTP_RESPONSE`
- `public final static java.lang.String PAGE_CONTEXT`
- `public final static java.lang.String SERVLET_CONTEXT`
- `public final static java.lang.String SERVLET_DISPATCHER`
- `public final static java.lang.String STRUTS_ACTION_TAG_INVOCATION`
- `public final static java.lang.String STRUTS_PORTLET_CONTEXT`

---

## public class `org.apache.struts2.components.ActionComponent`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.ContextBean`  

**Constructors:**
- `public ActionComponent(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `protected com.opensymphony.xwork2.ActionProxyFactory actionProxyFactory`
- `protected boolean executeResult`
- `protected boolean flush`
- `protected boolean ignoreContextParams`
- `protected java.lang.String name`
- `protected java.lang.String namespace`
- `protected com.opensymphony.xwork2.ActionProxy proxy`
- `protected javax.servlet.http.HttpServletRequest req`
- `protected javax.servlet.http.HttpServletResponse res`
- `protected boolean rethrowException`
- `protected com.opensymphony.xwork2.util.ValueStackFactory valueStackFactory`

**Methods:**
- `protected java.util.Map createExtraContext()`
- `protected org.apache.struts2.dispatcher.HttpParameters createParametersForContext()`
- `public boolean end(java.io.Writer p0, java.lang.String p1)`
- `protected void executeAction()`
- `public com.opensymphony.xwork2.ActionProxy getProxy()`
- `public void setActionMapper(org.apache.struts2.dispatcher.mapper.ActionMapper p0)`
- `public void setActionProxyFactory(com.opensymphony.xwork2.ActionProxyFactory p0)`
- `public void setExecuteResult(boolean p0)`
- `public void setFlush(boolean p0)`
- `public void setIgnoreContextParams(boolean p0)`
- `public void setName(java.lang.String p0)`
- `public void setNamespace(java.lang.String p0)`
- `public void setRethrowException(boolean p0)`
- `public void setValueStackFactory(com.opensymphony.xwork2.util.ValueStackFactory p0)`

---

## public class `org.apache.struts2.components.ActionError`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.UIBean`  

**Constructors:**
- `public ActionError(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `public final static java.lang.String TEMPLATE`

**Methods:**
- `protected void evaluateExtraParams()`
- `protected java.lang.String getDefaultTemplate()`
- `public void setEscape(boolean p0)`

---

## public class `org.apache.struts2.components.ActionMessage`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.UIBean`  

**Constructors:**
- `public ActionMessage(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `protected boolean escape`

**Methods:**
- `protected void evaluateExtraParams()`
- `protected java.lang.String getDefaultTemplate()`
- `public void setEscape(boolean p0)`

---

## public class `org.apache.struts2.components.Anchor`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.ClosingUIBean`  

**Constructors:**
- `public Anchor(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `public final static java.lang.String COMPONENT_NAME`
- `public final static java.lang.String OPEN_TEMPLATE`
- `public final static java.lang.String TEMPLATE`
- `protected java.lang.String href`
- `protected boolean processingTagBody`
- `protected java.util.Map urlParameters`
- `protected org.apache.struts2.components.UrlProvider urlProvider`
- `protected org.apache.struts2.components.UrlRenderer urlRenderer`

**Methods:**
- `public void addAllParameters(java.util.Map p0)`
- `public void addParameter(java.lang.String p0, java.lang.Object p1)`
- `public boolean end(java.io.Writer p0, java.lang.String p1)`
- `protected void evaluateExtraParams()`
- `public java.lang.String getDefaultOpenTemplate()`
- `protected java.lang.String getDefaultTemplate()`
- `public org.apache.struts2.components.UrlProvider getUrlProvider()`
- `public void setAction(java.lang.String p0)`
- `public void setAnchor(java.lang.String p0)`
- `public void setEncode(boolean p0)`
- `public void setEscapeAmp(boolean p0)`
- `public void setExtraParameterProvider(org.apache.struts2.components.ExtraParameterProvider p0)`
- `public void setForceAddSchemeHostAndPort(boolean p0)`
- `public void setHref(java.lang.String p0)`
- `public void setIncludeContext(boolean p0)`
- `public void setIncludeParams(java.lang.String p0)`
- `public void setMethod(java.lang.String p0)`
- `public void setNamespace(java.lang.String p0)`
- `public void setPortletMode(java.lang.String p0)`
- `public void setPortletUrlType(java.lang.String p0)`
- `public void setScheme(java.lang.String p0)`
- `public void setUrlIncludeParams(java.lang.String p0)`
- `public void setUrlRenderer(org.apache.struts2.components.UrlRenderer p0)`
- `public void setValue(java.lang.String p0)`
- `public void setWindowState(java.lang.String p0)`
- `public boolean start(java.io.Writer p0)`
- `public boolean usesBody()`

---

## public class `org.apache.struts2.components.AppendIterator`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.ContextBean`  
implements `org.apache.struts2.components.Param$UnnamedParametric`  

**Constructors:**
- `public AppendIterator(com.opensymphony.xwork2.util.ValueStack p0)`

**Methods:**
- `public void addParameter(java.lang.Object p0)`
- `public boolean end(java.io.Writer p0, java.lang.String p1)`
- `public void setVar(java.lang.String p0)`
- `public boolean start(java.io.Writer p0)`

---

## public class `org.apache.struts2.components.Bean`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.ContextBean`  

**Constructors:**
- `public Bean(com.opensymphony.xwork2.util.ValueStack p0)`

**Fields:**
- `protected final static org.apache.logging.log4j.Logger LOG`
- `protected java.lang.Object bean`
- `protected java.lang.String name`
- `protected com.opensymphony.xwork2.ObjectFactory objectFactory`
- `protected com.opensymphony.xwork2.util.reflection.ReflectionProvider reflectionProvider`

**Methods:**
- `public void addParameter(java.lang.String p0, java.lang.Object p1)`
- `public boolean end(java.io.Writer p0, java.lang.String p1)`
- `public void setName(java.lang.String p0)`
- `public void setObjectFactory(com.opensymphony.xwork2.ObjectFactory p0)`
- `public void setReflectionProvider(com.opensymphony.xwork2.util.reflection.ReflectionProvider p0)`
- `public boolean start(java.io.Writer p0)`

---

## public class `org.apache.struts2.components.Checkbox`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.UIBean`  

**Constructors:**
- `public Checkbox(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `public final static java.lang.String TEMPLATE`
- `protected java.lang.String fieldValue`

**Methods:**
- `protected void evaluateExtraParams()`
- `protected java.lang.String getDefaultTemplate()`
- `protected java.lang.Class getValueClassType()`
- `public void setFieldValue(java.lang.String p0)`

---

## public class `org.apache.struts2.components.CheckboxList`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.ListUIBean`  

**Constructors:**
- `public CheckboxList(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `public final static java.lang.String TEMPLATE`

**Methods:**
- `public void evaluateExtraParams()`
- `protected java.lang.String getDefaultTemplate()`

---

## public abstract class `org.apache.struts2.components.ClosingUIBean`
extends `org.apache.struts2.components.UIBean`  

**Constructors:**
- `protected ClosingUIBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `public abstract java.lang.String getDefaultOpenTemplate()`
- `public void setOpenTemplate(java.lang.String p0)`
- `public boolean start(java.io.Writer p0)`

---

## public class `org.apache.struts2.components.ComboBox`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.TextField`  

**Constructors:**
- `public ComboBox(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `public final static java.lang.String TEMPLATE`
- `protected java.lang.String emptyOption`
- `protected java.lang.String headerKey`
- `protected java.lang.String headerValue`
- `protected java.lang.String list`
- `protected java.lang.String listKey`
- `protected java.lang.String listValue`

**Methods:**
- `public void evaluateExtraParams()`
- `protected java.lang.Object findListValue()`
- `protected java.lang.String getDefaultTemplate()`
- `public void setEmptyOption(java.lang.String p0)`
- `public void setHeaderKey(java.lang.String p0)`
- `public void setHeaderValue(java.lang.String p0)`
- `public void setList(java.lang.String p0)`
- `public void setListKey(java.lang.String p0)`
- `public void setListValue(java.lang.String p0)`

---

## public class `org.apache.struts2.components.Component`

**Constructors:**
- `public Component(com.opensymphony.xwork2.util.ValueStack p0)`

**Fields:**
- `public final static java.lang.String COMPONENT_STACK`
- `protected org.apache.struts2.dispatcher.mapper.ActionMapper actionMapper`
- `protected boolean devMode`
- `protected java.util.Map parameters`
- `protected com.opensymphony.xwork2.util.ValueStack stack`
- `protected static java.util.concurrent.ConcurrentMap standardAttributesMap`
- `protected boolean throwExceptionOnELFailure`

**Methods:**
- `public void addAllParameters(java.util.Map p0)`
- `public void addParameter(java.lang.String p0, java.lang.Object p1)`
- `public boolean altSyntax()`
- `protected java.lang.String completeExpressionIfAltSyntax(java.lang.String p0)`
- `public void copyParams(java.util.Map p0)`
- `protected java.lang.String determineActionURL(java.lang.String p0, java.lang.String p1, java.lang.String p2, javax.servlet.http.HttpServletRequest p3, javax.servlet.http.HttpServletResponse p4, java.util.Map p5, java.lang.String p6, boolean p7, boolean p8, boolean p9, boolean p10)`
- `protected java.lang.String determineNamespace(java.lang.String p0, com.opensymphony.xwork2.util.ValueStack p1, javax.servlet.http.HttpServletRequest p2)`
- `public boolean end(java.io.Writer p0, java.lang.String p1)`
- `protected boolean end(java.io.Writer p0, java.lang.String p1, boolean p2)`
- `protected org.apache.struts2.StrutsException fieldError(java.lang.String p0, java.lang.String p1, java.lang.Exception p2)`
- `protected org.apache.struts2.components.Component findAncestor(java.lang.Class p0)`
- `protected java.lang.String findString(java.lang.String p0)`
- `protected java.lang.String findString(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `protected java.lang.String findStringIfAltSyntax(java.lang.String p0)`
- `protected java.lang.Object findValue(java.lang.String p0)`
- `protected java.lang.Object findValue(java.lang.String p0, java.lang.Class p1)`
- `protected java.lang.Object findValue(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public java.util.Stack getComponentStack()`
- `public java.util.Map getParameters()`
- `public com.opensymphony.xwork2.util.ValueStack getStack()`
- `protected java.util.Collection getStandardAttributes()`
- `public boolean isValidTagAttribute(java.lang.String p0)`
- `protected void popComponentStack()`
- `protected boolean recursion(java.lang.String p0)`
- `public void setActionMapper(org.apache.struts2.dispatcher.mapper.ActionMapper p0)`
- `public void setDevMode(java.lang.String p0)`
- `public void setThrowExceptionsOnELFailure(java.lang.String p0)`
- `public void setUrlHelper(org.apache.struts2.views.util.UrlHelper p0)`
- `public boolean start(java.io.Writer p0)`
- `protected java.lang.String stripExpressionIfAltSyntax(java.lang.String p0)`
- `protected java.lang.String toString(java.lang.Throwable p0)`
- `public boolean usesBody()`

---

## public class `org.apache.struts2.components.ComponentUrlProvider`
implements `org.apache.struts2.components.UrlProvider`  

**Constructors:**
- `public ComponentUrlProvider(org.apache.struts2.components.Component p0, java.util.Map p1)`

**Fields:**
- `protected java.lang.String action`
- `protected java.lang.String anchor`
- `protected org.apache.struts2.components.Component component`
- `protected boolean encode`
- `protected boolean escapeAmp`
- `protected org.apache.struts2.components.ExtraParameterProvider extraParameterProvider`
- `protected boolean forceAddSchemeHostAndPort`
- `protected javax.servlet.http.HttpServletRequest httpServletRequest`
- `protected javax.servlet.http.HttpServletResponse httpServletResponse`
- `protected boolean includeContext`
- `protected java.lang.String includeParams`
- `protected java.lang.String method`
- `protected java.lang.String namespace`
- `protected java.lang.String portletMode`
- `protected java.lang.String portletUrlType`
- `protected java.lang.String scheme`
- `protected java.lang.String urlIncludeParams`
- `protected org.apache.struts2.components.UrlRenderer urlRenderer`
- `protected java.lang.String value`
- `protected java.lang.String windowState`

**Methods:**
- `public java.lang.String determineActionURL(java.lang.String p0, java.lang.String p1, java.lang.String p2, javax.servlet.http.HttpServletRequest p3, javax.servlet.http.HttpServletResponse p4, java.util.Map p5, java.lang.String p6, boolean p7, boolean p8, boolean p9, boolean p10)`
- `public java.lang.String determineNamespace(java.lang.String p0, com.opensymphony.xwork2.util.ValueStack p1, javax.servlet.http.HttpServletRequest p2)`
- `public java.lang.String findString(java.lang.String p0)`
- `public java.lang.String getAction()`
- `public java.lang.String getAnchor()`
- `public org.apache.struts2.components.ExtraParameterProvider getExtraParameterProvider()`
- `public javax.servlet.http.HttpServletRequest getHttpServletRequest()`
- `public javax.servlet.http.HttpServletResponse getHttpServletResponse()`
- `public java.lang.String getIncludeParams()`
- `public java.lang.String getMethod()`
- `public java.lang.String getNamespace()`
- `public java.util.Map getParameters()`
- `public java.lang.String getPortletMode()`
- `public java.lang.String getPortletUrlType()`
- `public java.lang.String getScheme()`
- `public com.opensymphony.xwork2.util.ValueStack getStack()`
- `public java.lang.String getUrlIncludeParams()`
- `public org.apache.struts2.components.UrlRenderer getUrlRenderer()`
- `public java.lang.String getValue()`
- `public java.lang.String getVar()`
- `public java.lang.String getWindowState()`
- `public boolean isEncode()`
- `public boolean isEscapeAmp()`
- `public boolean isForceAddSchemeHostAndPort()`
- `public boolean isIncludeContext()`
- `public boolean isPutInContext()`
- `public void putInContext(java.lang.String p0)`
- `public void setAction(java.lang.String p0)`
- `public void setAnchor(java.lang.String p0)`
- `public void setEncode(boolean p0)`
- `public void setEscapeAmp(boolean p0)`
- `public void setExtraParameterProvider(org.apache.struts2.components.ExtraParameterProvider p0)`
- `public void setForceAddSchemeHostAndPort(boolean p0)`
- `public void setHttpServletRequest(javax.servlet.http.HttpServletRequest p0)`
- `public void setHttpServletResponse(javax.servlet.http.HttpServletResponse p0)`
- `public void setIncludeContext(boolean p0)`
- `public void setIncludeParams(java.lang.String p0)`
- `public void setMethod(java.lang.String p0)`
- `public void setNamespace(java.lang.String p0)`
- `public void setPortletMode(java.lang.String p0)`
- `public void setPortletUrlType(java.lang.String p0)`
- `public void setScheme(java.lang.String p0)`
- `public void setUrlIncludeParams(java.lang.String p0)`
- `public void setUrlRenderer(org.apache.struts2.components.UrlRenderer p0)`
- `public void setValue(java.lang.String p0)`
- `public void setWindowState(java.lang.String p0)`

---

## public abstract class `org.apache.struts2.components.ContextBean`
extends `org.apache.struts2.components.Component`  

**Constructors:**
- `public ContextBean(com.opensymphony.xwork2.util.ValueStack p0)`

**Fields:**
- `protected java.lang.String var`

**Methods:**
- `protected java.lang.String getVar()`
- `protected void putInContext(java.lang.Object p0)`
- `public void setVar(java.lang.String p0)`

---

## public class `org.apache.struts2.components.Date`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.ContextBean`  

**Constructors:**
- `public Date(com.opensymphony.xwork2.util.ValueStack p0)`

**Fields:**
- `public final static java.lang.String DATETAG_PROPERTY`
- `public final static java.lang.String DATETAG_PROPERTY_DAYS`
- `public final static java.lang.String DATETAG_PROPERTY_FUTURE`
- `public final static java.lang.String DATETAG_PROPERTY_HOURS`
- `public final static java.lang.String DATETAG_PROPERTY_MINUTES`
- `public final static java.lang.String DATETAG_PROPERTY_PAST`
- `public final static java.lang.String DATETAG_PROPERTY_SECONDS`
- `public final static java.lang.String DATETAG_PROPERTY_YEARS`

**Methods:**
- `public boolean end(java.io.Writer p0, java.lang.String p1)`
- `public java.lang.String formatTime(com.opensymphony.xwork2.TextProvider p0, java.util.Date p1)`
- `public java.lang.String getFormat()`
- `public java.lang.String getName()`
- `public java.lang.String getTimezone()`
- `public boolean isNice()`
- `public void setFormat(java.lang.String p0)`
- `public void setName(java.lang.String p0)`
- `public void setNice(boolean p0)`
- `public void setTimezone(java.lang.String p0)`

---

## public class `org.apache.struts2.components.DateTextField`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.UIBean`  

**Constructors:**
- `public DateTextField(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `public final static java.lang.String TEMPLATE`
- `protected java.lang.String format`

**Methods:**
- `protected void evaluateExtraParams()`
- `protected java.lang.String getDefaultTemplate()`
- `protected java.lang.Class getValueClassType()`
- `public void setFormat(java.lang.String p0)`

---

## public class `org.apache.struts2.components.Debug`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.UIBean`  

**Constructors:**
- `public Debug(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `public final static java.lang.String TEMPLATE`
- `protected com.opensymphony.xwork2.util.reflection.ReflectionProvider reflectionProvider`

**Methods:**
- `public boolean end(java.io.Writer p0, java.lang.String p1)`
- `protected java.lang.String getDefaultTemplate()`
- `public void setReflectionProvider(com.opensymphony.xwork2.util.reflection.ReflectionProvider p0)`
- `protected boolean showDebug()`
- `public boolean start(java.io.Writer p0)`

---

## public abstract class `org.apache.struts2.components.DoubleListUIBean`
extends `org.apache.struts2.components.ListUIBean`  

**Constructors:**
- `public DoubleListUIBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `protected java.lang.String doubleAccesskey`
- `protected java.lang.String doubleCssClass`
- `protected java.lang.String doubleCssStyle`
- `protected java.lang.String doubleDisabled`
- `protected java.lang.String doubleEmptyOption`
- `protected java.lang.String doubleHeaderKey`
- `protected java.lang.String doubleHeaderValue`
- `protected java.lang.String doubleId`
- `protected java.lang.String doubleList`
- `protected java.lang.String doubleListCssClass`
- `protected java.lang.String doubleListCssStyle`
- `protected java.lang.String doubleListKey`
- `protected java.lang.String doubleListTitle`
- `protected java.lang.String doubleListValue`
- `protected java.lang.String doubleMultiple`
- `protected java.lang.String doubleName`
- `protected java.lang.String doubleOnblur`
- `protected java.lang.String doubleOnchange`
- `protected java.lang.String doubleOnclick`
- `protected java.lang.String doubleOndblclick`
- `protected java.lang.String doubleOnfocus`
- `protected java.lang.String doubleOnkeydown`
- `protected java.lang.String doubleOnkeypress`
- `protected java.lang.String doubleOnkeyup`
- `protected java.lang.String doubleOnmousedown`
- `protected java.lang.String doubleOnmousemove`
- `protected java.lang.String doubleOnmouseout`
- `protected java.lang.String doubleOnmouseover`
- `protected java.lang.String doubleOnmouseup`
- `protected java.lang.String doubleOnselect`
- `protected java.lang.String doubleSize`
- `protected java.lang.String doubleValue`
- `protected java.lang.String emptyOption`
- `protected java.lang.String formName`
- `protected java.lang.String headerKey`
- `protected java.lang.String headerValue`
- `protected java.lang.String multiple`
- `protected java.lang.String size`

**Methods:**
- `public void evaluateExtraParams()`
- `public java.lang.String getDoubleCssClass()`
- `public java.lang.String getDoubleCssStyle()`
- `public java.lang.String getDoubleDisabled()`
- `public java.lang.String getDoubleEmptyOption()`
- `public java.lang.String getDoubleHeaderKey()`
- `public java.lang.String getDoubleHeaderValue()`
- `public java.lang.String getDoubleId()`
- `public java.lang.String getDoubleList()`
- `public java.lang.String getDoubleListKey()`
- `public java.lang.String getDoubleListValue()`
- `public java.lang.String getDoubleMultiple()`
- `public java.lang.String getDoubleName()`
- `public java.lang.String getDoubleOnblur()`
- `public java.lang.String getDoubleOnchange()`
- `public java.lang.String getDoubleOnclick()`
- `public java.lang.String getDoubleOndblclick()`
- `public java.lang.String getDoubleOnfocus()`
- `public java.lang.String getDoubleOnkeydown()`
- `public java.lang.String getDoubleOnkeypress()`
- `public java.lang.String getDoubleOnkeyup()`
- `public java.lang.String getDoubleOnmousedown()`
- `public java.lang.String getDoubleOnmousemove()`
- `public java.lang.String getDoubleOnmouseout()`
- `public java.lang.String getDoubleOnmouseover()`
- `public java.lang.String getDoubleOnmouseup()`
- `public java.lang.String getDoubleOnselect()`
- `public java.lang.String getDoubleSize()`
- `public java.lang.String getDoubleValue()`
- `public java.lang.String getFormName()`
- `public void setDoubleAccesskey(java.lang.String p0)`
- `public void setDoubleCssClass(java.lang.String p0)`
- `public void setDoubleCssStyle(java.lang.String p0)`
- `public void setDoubleDisabled(java.lang.String p0)`
- `public void setDoubleEmptyOption(java.lang.String p0)`
- `public void setDoubleHeaderKey(java.lang.String p0)`
- `public void setDoubleHeaderValue(java.lang.String p0)`
- `public void setDoubleId(java.lang.String p0)`
- `public void setDoubleList(java.lang.String p0)`
- `public void setDoubleListCssClass(java.lang.String p0)`
- `public void setDoubleListCssStyle(java.lang.String p0)`
- `public void setDoubleListKey(java.lang.String p0)`
- `public void setDoubleListTitle(java.lang.String p0)`
- `public void setDoubleListValue(java.lang.String p0)`
- `public void setDoubleMultiple(java.lang.String p0)`
- `public void setDoubleName(java.lang.String p0)`
- `public void setDoubleOnblur(java.lang.String p0)`
- `public void setDoubleOnchange(java.lang.String p0)`
- `public void setDoubleOnclick(java.lang.String p0)`
- `public void setDoubleOndblclick(java.lang.String p0)`
- `public void setDoubleOnfocus(java.lang.String p0)`
- `public void setDoubleOnkeydown(java.lang.String p0)`
- `public void setDoubleOnkeypress(java.lang.String p0)`
- `public void setDoubleOnkeyup(java.lang.String p0)`
- `public void setDoubleOnmousedown(java.lang.String p0)`
- `public void setDoubleOnmousemove(java.lang.String p0)`
- `public void setDoubleOnmouseout(java.lang.String p0)`
- `public void setDoubleOnmouseover(java.lang.String p0)`
- `public void setDoubleOnmouseup(java.lang.String p0)`
- `public void setDoubleOnselect(java.lang.String p0)`
- `public void setDoubleSize(java.lang.String p0)`
- `public void setDoubleValue(java.lang.String p0)`
- `public void setEmptyOption(java.lang.String p0)`
- `public void setFormName(java.lang.String p0)`
- `public void setHeaderKey(java.lang.String p0)`
- `public void setHeaderValue(java.lang.String p0)`
- `public void setMultiple(java.lang.String p0)`
- `public void setSize(java.lang.String p0)`

---

## public class `org.apache.struts2.components.DoubleSelect`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.DoubleListUIBean`  

**Constructors:**
- `public DoubleSelect(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `public final static java.lang.String TEMPLATE`

**Methods:**
- `public void evaluateExtraParams()`
- `protected java.lang.String getDefaultTemplate()`

---

## public class `org.apache.struts2.components.Else`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.Component`  

**Constructors:**
- `public Else(com.opensymphony.xwork2.util.ValueStack p0)`

**Methods:**
- `public boolean start(java.io.Writer p0)`

---

## public class `org.apache.struts2.components.ElseIf`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.Component`  

**Constructors:**
- `public ElseIf(com.opensymphony.xwork2.util.ValueStack p0)`

**Fields:**
- `protected java.lang.Boolean answer`
- `protected java.lang.String test`

**Methods:**
- `public boolean end(java.io.Writer p0, java.lang.String p1)`
- `public void setTest(java.lang.String p0)`
- `public boolean start(java.io.Writer p0)`

---

## public abstract interface `org.apache.struts2.components.ExtraParameterProvider`

**Methods:**
- `public abstract java.util.Map getExtraParameters()`

---

## public class `org.apache.struts2.components.FieldError`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.UIBean`  
implements `org.apache.struts2.components.Param$UnnamedParametric`  

**Constructors:**
- `public FieldError(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `public void addParameter(java.lang.Object p0)`
- `protected void evaluateExtraParams()`
- `protected java.lang.String getDefaultTemplate()`
- `public java.util.List getFieldErrorFieldNames()`
- `public void setEscape(boolean p0)`
- `public void setFieldName(java.lang.String p0)`

---

## public class `org.apache.struts2.components.File`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.UIBean`  

**Constructors:**
- `public File(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `public final static java.lang.String TEMPLATE`
- `protected java.lang.String accept`
- `protected java.lang.String size`

**Methods:**
- `public void evaluateParams()`
- `protected java.lang.String getDefaultTemplate()`
- `public void setAccept(java.lang.String p0)`
- `public void setSize(java.lang.String p0)`

---

## public class `org.apache.struts2.components.Form`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.ClosingUIBean`  

**Constructors:**
- `public Form(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `public final static java.lang.String OPEN_TEMPLATE`
- `public final static java.lang.String TEMPLATE`
- `protected java.lang.String acceptcharset`
- `protected java.lang.String action`
- `protected com.opensymphony.xwork2.validator.ActionValidatorManager actionValidatorManager`
- `protected com.opensymphony.xwork2.config.Configuration configuration`
- `protected java.lang.String enctype`
- `protected java.lang.String focusElement`
- `protected boolean includeContext`
- `protected java.lang.String method`
- `protected java.lang.String namespace`
- `protected com.opensymphony.xwork2.ObjectFactory objectFactory`
- `protected java.lang.String onreset`
- `protected java.lang.String onsubmit`
- `protected java.lang.String portletMode`
- `protected java.lang.String target`
- `protected org.apache.struts2.components.UrlRenderer urlRenderer`
- `protected java.lang.String validate`
- `protected java.lang.String windowState`

**Methods:**
- `protected void evaluateClientSideJsEnablement(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `protected void evaluateExtraParams()`
- `protected boolean evaluateNameValue()`
- `public java.lang.String getDefaultOpenTemplate()`
- `protected java.lang.String getDefaultTemplate()`
- `protected int getSequence()`
- `public java.util.List getValidators(java.lang.String p0)`
- `protected java.lang.Class getVisitorReturnType(java.lang.Class p0, java.lang.String p1)`
- `protected void populateComponentHtmlId(org.apache.struts2.components.Form p0)`
- `public void setAcceptcharset(java.lang.String p0)`
- `public void setAction(java.lang.String p0)`
- `public void setActionValidatorManager(com.opensymphony.xwork2.validator.ActionValidatorManager p0)`
- `public void setConfiguration(com.opensymphony.xwork2.config.Configuration p0)`
- `public void setEnctype(java.lang.String p0)`
- `public void setFocusElement(java.lang.String p0)`
- `public void setIncludeContext(boolean p0)`
- `public void setMethod(java.lang.String p0)`
- `public void setNamespace(java.lang.String p0)`
- `public void setObjectFactory(com.opensymphony.xwork2.ObjectFactory p0)`
- `public void setOnreset(java.lang.String p0)`
- `public void setOnsubmit(java.lang.String p0)`
- `public void setPortletMode(java.lang.String p0)`
- `public void setTarget(java.lang.String p0)`
- `public void setUrlRenderer(org.apache.struts2.components.UrlRenderer p0)`
- `public void setValidate(java.lang.String p0)`
- `public void setWindowState(java.lang.String p0)`

---

## public static class `org.apache.struts2.components.Form$FieldVisitorValidatorWrapper`
implements `com.opensymphony.xwork2.validator.FieldValidator`  

**Constructors:**
- `public FieldVisitorValidatorWrapper(com.opensymphony.xwork2.validator.FieldValidator p0, java.lang.String p1)`

**Methods:**
- `public java.lang.String getDefaultMessage()`
- `public java.lang.String getFieldName()`
- `public com.opensymphony.xwork2.validator.FieldValidator getFieldValidator()`
- `public java.lang.String getMessage(java.lang.Object p0)`
- `public java.lang.String getMessageKey()`
- `public java.lang.String[] getMessageParameters()`
- `public java.lang.String getNamePrefix()`
- `public com.opensymphony.xwork2.validator.ValidatorContext getValidatorContext()`
- `public java.lang.String getValidatorType()`
- `public void setDefaultMessage(java.lang.String p0)`
- `public void setFieldName(java.lang.String p0)`
- `public void setFieldValidator(com.opensymphony.xwork2.validator.FieldValidator p0)`
- `public void setMessageKey(java.lang.String p0)`
- `public void setMessageParameters(java.lang.String[] p0)`
- `public void setNamePrefix(java.lang.String p0)`
- `public void setValidatorContext(com.opensymphony.xwork2.validator.ValidatorContext p0)`
- `public void setValidatorType(java.lang.String p0)`
- `public void setValueStack(com.opensymphony.xwork2.util.ValueStack p0)`
- `public void validate(java.lang.Object p0) throws com.opensymphony.xwork2.validator.ValidationException`

---

## public abstract class `org.apache.struts2.components.FormButton`
extends `org.apache.struts2.components.ClosingUIBean`  

**Constructors:**
- `public FormButton(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `protected java.lang.String action`
- `protected java.lang.String method`
- `protected java.lang.String type`

**Methods:**
- `public void evaluateExtraParams()`
- `protected void populateComponentHtmlId(org.apache.struts2.components.Form p0)`
- `public void setAction(java.lang.String p0)`
- `public void setActionMapper(org.apache.struts2.dispatcher.mapper.ActionMapper p0)`
- `public void setMethod(java.lang.String p0)`
- `public void setType(java.lang.String p0)`
- `protected abstract boolean supportsImageType()`

---

## public class `org.apache.struts2.components.GenericUIBean`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.UIBean`  

**Constructors:**
- `public GenericUIBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `public boolean contains(java.lang.Object p0, java.lang.Object p1)`
- `protected java.lang.String getDefaultTemplate()`

---

## public class `org.apache.struts2.components.Head`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.UIBean`  

**Constructors:**
- `public Head(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `public final static java.lang.String TEMPLATE`

**Methods:**
- `public void evaluateParams()`
- `protected java.lang.String getDefaultTemplate()`
- `public void setEncoding(java.lang.String p0)`

---

## public class `org.apache.struts2.components.Hidden`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.UIBean`  

**Constructors:**
- `public Hidden(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `public final static java.lang.String TEMPLATE`

**Methods:**
- `protected java.lang.String getDefaultTemplate()`

---

## public class `org.apache.struts2.components.I18n`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.Component`  

**Constructors:**
- `public I18n(com.opensymphony.xwork2.util.ValueStack p0)`

**Fields:**
- `protected java.lang.String name`
- `protected boolean pushed`

**Methods:**
- `public boolean end(java.io.Writer p0, java.lang.String p1) throws org.apache.struts2.StrutsException`
- `public void setLocaleProviderFactory(com.opensymphony.xwork2.LocaleProviderFactory p0)`
- `public void setLocalizedTextProvider(com.opensymphony.xwork2.LocalizedTextProvider p0)`
- `public void setName(java.lang.String p0)`
- `public void setTextProvider(com.opensymphony.xwork2.TextProvider p0)`
- `public void setTextProviderFactory(com.opensymphony.xwork2.TextProviderFactory p0)`
- `public boolean start(java.io.Writer p0)`

---

## public class `org.apache.struts2.components.If`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.Component`  

**Constructors:**
- `public If(com.opensymphony.xwork2.util.ValueStack p0)`

**Fields:**
- `public final static java.lang.String ANSWER`

**Methods:**
- `public boolean end(java.io.Writer p0, java.lang.String p1)`
- `public void setTest(java.lang.String p0)`
- `public boolean start(java.io.Writer p0)`

---

## public class `org.apache.struts2.components.Include`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.Component`  

**Constructors:**
- `public Include(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `protected java.lang.String value`

**Methods:**
- `public void addParameter(java.lang.String p0, java.lang.Object p1)`
- `public boolean end(java.io.Writer p0, java.lang.String p1)`
- `public static java.lang.String getContextRelativePath(javax.servlet.ServletRequest p0, java.lang.String p1)`
- `public static void include(java.lang.String p0, java.io.Writer p1, javax.servlet.ServletRequest p2, javax.servlet.http.HttpServletResponse p3, java.lang.String p4) throws java.io.IOException, javax.servlet.ServletException`
- `public void setDefaultEncoding(java.lang.String p0)`
- `public void setUseResponseEncoding(java.lang.String p0)`
- `public void setValue(java.lang.String p0)`

---

## public class `org.apache.struts2.components.InputTransferSelect`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.ListUIBean`  

**Constructors:**
- `public InputTransferSelect(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `protected java.lang.String addLabel`
- `protected java.lang.String allowRemoveAll`
- `protected java.lang.String allowUpDown`
- `protected java.lang.String buttonCssClass`
- `protected java.lang.String buttonCssStyle`
- `protected java.lang.String downLabel`
- `protected java.lang.String headerKey`
- `protected java.lang.String headerValue`
- `protected java.lang.String leftTitle`
- `protected java.lang.String multiple`
- `protected java.lang.String removeAllLabel`
- `protected java.lang.String removeLabel`
- `protected java.lang.String rightTitle`
- `protected java.lang.String size`
- `protected java.lang.String upLabel`

**Methods:**
- `public void evaluateExtraParams()`
- `public java.lang.String getAddLabel()`
- `public java.lang.String getAllowRemoveAll()`
- `public java.lang.String getAllowUpDown()`
- `public java.lang.String getButtonCssClass()`
- `public java.lang.String getButtonCssStyle()`
- `protected java.lang.String getDefaultTemplate()`
- `public java.lang.String getDownLabel()`
- `public java.lang.String getHeaderKey()`
- `public java.lang.String getHeaderValue()`
- `public java.lang.String getLeftTitle()`
- `public java.lang.String getMultiple()`
- `public java.lang.String getRemoveAllLabel()`
- `public java.lang.String getRemoveLabel()`
- `public java.lang.String getRightTitle()`
- `public java.lang.String getSize()`
- `public java.lang.String getUpLabel()`
- `public void setAddLabel(java.lang.String p0)`
- `public void setAllowRemoveAll(java.lang.String p0)`
- `public void setAllowUpDown(java.lang.String p0)`
- `public void setButtonCssClass(java.lang.String p0)`
- `public void setButtonCssStyle(java.lang.String p0)`
- `public void setDownLabel(java.lang.String p0)`
- `public void setHeaderKey(java.lang.String p0)`
- `public void setHeaderValue(java.lang.String p0)`
- `public void setLeftTitle(java.lang.String p0)`
- `public void setMultiple(java.lang.String p0)`
- `public void setRemoveAllLabel(java.lang.String p0)`
- `public void setRemoveLabel(java.lang.String p0)`
- `public void setRightTitle(java.lang.String p0)`
- `public void setSize(java.lang.String p0)`
- `public void setUpLabel(java.lang.String p0)`

---

## public class `org.apache.struts2.components.IteratorComponent`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.ContextBean`  

**Constructors:**
- `public IteratorComponent(com.opensymphony.xwork2.util.ValueStack p0)`

**Fields:**
- `protected java.lang.Integer begin`
- `protected java.lang.String beginStr`
- `protected java.lang.Integer end`
- `protected java.lang.String endStr`
- `protected java.util.Iterator iterator`
- `protected java.lang.Object oldStatus`
- `protected org.apache.struts2.views.jsp.IteratorStatus status`
- `protected java.lang.String statusAttr`
- `protected org.apache.struts2.views.jsp.IteratorStatus$StatusState statusState`
- `protected java.lang.Integer step`
- `protected java.lang.String stepStr`
- `protected java.lang.String value`

**Methods:**
- `public boolean end(java.io.Writer p0, java.lang.String p1)`
- `public void setBegin(java.lang.String p0)`
- `public void setEnd(java.lang.String p0)`
- `public void setStatus(java.lang.String p0)`
- `public void setStep(java.lang.String p0)`
- `public void setValue(java.lang.String p0)`
- `public boolean start(java.io.Writer p0)`

---

## public class `org.apache.struts2.components.Label`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.UIBean`  

**Constructors:**
- `public Label(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `public final static java.lang.String TEMPLATE`
- `protected java.lang.String forAttr`

**Methods:**
- `protected void evaluateExtraParams()`
- `protected java.lang.String getDefaultTemplate()`
- `public void setFor(java.lang.String p0)`

---

## public abstract class `org.apache.struts2.components.ListUIBean`
extends `org.apache.struts2.components.UIBean`  

**Constructors:**
- `protected ListUIBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `protected java.lang.Object list`
- `protected java.lang.String listCssClass`
- `protected java.lang.String listCssStyle`
- `protected java.lang.String listKey`
- `protected java.lang.String listLabelKey`
- `protected java.lang.String listTitle`
- `protected java.lang.String listValue`
- `protected java.lang.String listValueKey`
- `protected boolean throwExceptionOnNullValueAttribute`

**Methods:**
- `public boolean contains(java.lang.Object p0, java.lang.Object p1)`
- `public void evaluateExtraParams()`
- `protected java.lang.Class getValueClassType()`
- `public void setList(java.lang.Object p0)`
- `public void setListCssClass(java.lang.String p0)`
- `public void setListCssStyle(java.lang.String p0)`
- `public void setListKey(java.lang.String p0)`
- `public void setListLabelKey(java.lang.String p0)`
- `public void setListTitle(java.lang.String p0)`
- `public void setListValue(java.lang.String p0)`
- `public void setListValueKey(java.lang.String p0)`
- `public void setThrowExceptionOnNullValueAttribute(boolean p0)`

---

## public class `org.apache.struts2.components.MergeIterator`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.ContextBean`  
implements `org.apache.struts2.components.Param$UnnamedParametric`  

**Constructors:**
- `public MergeIterator(com.opensymphony.xwork2.util.ValueStack p0)`

**Methods:**
- `public void addParameter(java.lang.Object p0)`
- `public boolean end(java.io.Writer p0, java.lang.String p1)`
- `public void setVar(java.lang.String p0)`
- `public boolean start(java.io.Writer p0)`

---

## public class `org.apache.struts2.components.Number`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.ContextBean`  

**Constructors:**
- `public Number(com.opensymphony.xwork2.util.ValueStack p0)`

**Fields:**
- `public final static java.lang.String NUMBERTAG_PROPERTY`

**Methods:**
- `public boolean end(java.io.Writer p0, java.lang.String p1)`
- `public java.lang.String getCurrency()`
- `public java.lang.Integer getMaximumFractionDigits()`
- `public java.lang.Integer getMaximumIntegerDigits()`
- `public java.lang.Integer getMinimumFractionDigits()`
- `public java.lang.Integer getMinimumIntegerDigits()`
- `public java.lang.String getName()`
- `public java.lang.String getRoundingMode()`
- `public java.lang.String getType()`
- `public java.lang.Boolean isGroupingUsed()`
- `public java.lang.Boolean isParseIntegerOnly()`
- `public void setCurrency(java.lang.String p0)`
- `public void setGroupingUsed(java.lang.Boolean p0)`
- `public void setMaximumFractionDigits(java.lang.Integer p0)`
- `public void setMaximumIntegerDigits(java.lang.Integer p0)`
- `public void setMinimumFractionDigits(java.lang.Integer p0)`
- `public void setMinimumIntegerDigits(java.lang.Integer p0)`
- `public void setName(java.lang.String p0)`
- `public void setParseIntegerOnly(java.lang.Boolean p0)`
- `public void setRoundingMode(java.lang.String p0)`
- `public void setType(java.lang.String p0)`

---

## public class `org.apache.struts2.components.OptGroup`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.Component`  

**Constructors:**
- `public OptGroup(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `public final static java.lang.String INTERNAL_LIST_UI_BEAN_LIST_PARAMETER_KEY`
- `protected org.apache.struts2.components.ListUIBean internalUiBean`
- `protected javax.servlet.http.HttpServletRequest req`
- `protected javax.servlet.http.HttpServletResponse res`

**Methods:**
- `public boolean end(java.io.Writer p0, java.lang.String p1)`
- `public void setContainer(com.opensymphony.xwork2.inject.Container p0)`
- `public void setDisabled(java.lang.String p0)`
- `public void setLabel(java.lang.String p0)`
- `public void setList(java.lang.String p0)`
- `public void setListCssClass(java.lang.String p0)`
- `public void setListCssStyle(java.lang.String p0)`
- `public void setListKey(java.lang.String p0)`
- `public void setListTitle(java.lang.String p0)`
- `public void setListValue(java.lang.String p0)`

---

## public class `org.apache.struts2.components.OptionTransferSelect`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.DoubleListUIBean`  

**Constructors:**
- `public OptionTransferSelect(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `protected java.lang.String addAllToLeftLabel`
- `protected java.lang.String addAllToLeftOnclick`
- `protected java.lang.String addAllToRightLabel`
- `protected java.lang.String addAllToRightOnclick`
- `protected java.lang.String addToLeftLabel`
- `protected java.lang.String addToLeftOnclick`
- `protected java.lang.String addToRightLabel`
- `protected java.lang.String addToRightOnclick`
- `protected java.lang.String allowAddAllToLeft`
- `protected java.lang.String allowAddAllToRight`
- `protected java.lang.String allowAddToLeft`
- `protected java.lang.String allowAddToRight`
- `protected java.lang.String allowSelectAll`
- `protected java.lang.String allowUpDownOnLeft`
- `protected java.lang.String allowUpDownOnRight`
- `protected java.lang.String buttonCssClass`
- `protected java.lang.String buttonCssStyle`
- `protected java.lang.String leftDownlabel`
- `protected java.lang.String leftTitle`
- `protected java.lang.String leftUpLabel`
- `protected java.lang.String rightDownLabel`
- `protected java.lang.String rightTitle`
- `protected java.lang.String rightUpLabel`
- `protected java.lang.String selectAllLabel`
- `protected java.lang.String selectAllOnclick`
- `protected java.lang.String upDownOnLeftOnclick`
- `protected java.lang.String upDownOnRightOnclick`

**Methods:**
- `public void evaluateExtraParams()`
- `public java.lang.String getAddAllToLeftLabel()`
- `public java.lang.String getAddAllToLeftOnclick()`
- `public java.lang.String getAddAllToRightLabel()`
- `public java.lang.String getAddAllToRightOnclick()`
- `public java.lang.String getAddToLeftLabel()`
- `public java.lang.String getAddToLeftOnclick()`
- `public java.lang.String getAddToRightLabel()`
- `public java.lang.String getAddToRightOnclick()`
- `public java.lang.String getAllowAddAllToLeft()`
- `public java.lang.String getAllowAddAllToRight()`
- `public java.lang.String getAllowAddToLeft()`
- `public java.lang.String getAllowAddToRight()`
- `public java.lang.String getAllowSelectAll()`
- `public java.lang.String getAllowUpDownOnLeft()`
- `public java.lang.String getAllowUpDownOnRight()`
- `public java.lang.String getButtonCssClass()`
- `public java.lang.String getButtonCssStyle()`
- `protected java.lang.String getDefaultTemplate()`
- `public java.lang.String getLeftDownLabel()`
- `public java.lang.String getLeftTitle()`
- `public java.lang.String getLeftUpLabel()`
- `public java.lang.String getRightDownLabel()`
- `public java.lang.String getRightTitle()`
- `public java.lang.String getRightUpLabel()`
- `public java.lang.String getSelectAllLabel()`
- `public java.lang.String getSelectAllOnclick()`
- `public java.lang.String getUpDownOnLeftOnclick()`
- `public java.lang.String getUpDownOnRightOnclick()`
- `public void setAddAllToLeftLabel(java.lang.String p0)`
- `public void setAddAllToLeftOnclick(java.lang.String p0)`
- `public void setAddAllToRightLabel(java.lang.String p0)`
- `public void setAddAllToRightOnclick(java.lang.String p0)`
- `public void setAddToLeftLabel(java.lang.String p0)`
- `public void setAddToLeftOnclick(java.lang.String p0)`
- `public void setAddToRightLabel(java.lang.String p0)`
- `public void setAddToRightOnclick(java.lang.String p0)`
- `public void setAllowAddAllToLeft(java.lang.String p0)`
- `public void setAllowAddAllToRight(java.lang.String p0)`
- `public void setAllowAddToLeft(java.lang.String p0)`
- `public void setAllowAddToRight(java.lang.String p0)`
- `public void setAllowSelectAll(java.lang.String p0)`
- `public void setAllowUpDownOnLeft(java.lang.String p0)`
- `public void setAllowUpDownOnRight(java.lang.String p0)`
- `public void setButtonCssClass(java.lang.String p0)`
- `public void setButtonCssStyle(java.lang.String p0)`
- `public void setLeftDownLabel(java.lang.String p0)`
- `public void setLeftTitle(java.lang.String p0)`
- `public void setLeftUpLabel(java.lang.String p0)`
- `public void setRightDownLabel(java.lang.String p0)`
- `public void setRightTitle(java.lang.String p0)`
- `public void setRightUpLabel(java.lang.String p0)`
- `public void setSelectAllLabel(java.lang.String p0)`
- `public void setSelectAllOnclick(java.lang.String p0)`
- `public void setUpDownOnLeftOnclick(java.lang.String p0)`
- `public void setUpDownOnRightOnclick(java.lang.String p0)`

---

## public class `org.apache.struts2.components.Param`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.Component`  

**Constructors:**
- `public Param(com.opensymphony.xwork2.util.ValueStack p0)`

**Fields:**
- `protected java.lang.String name`
- `protected boolean suppressEmptyParameters`
- `protected java.lang.String value`

**Methods:**
- `public boolean end(java.io.Writer p0, java.lang.String p1)`
- `public void setName(java.lang.String p0)`
- `public void setSuppressEmptyParameters(boolean p0)`
- `public void setValue(java.lang.String p0)`
- `public boolean usesBody()`

---

## public abstract static interface `org.apache.struts2.components.Param$UnnamedParametric`

**Methods:**
- `public abstract void addParameter(java.lang.Object p0)`

---

## public class `org.apache.struts2.components.Password`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.TextField`  

**Constructors:**
- `public Password(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `public final static java.lang.String TEMPLATE`
- `protected java.lang.String showPassword`

**Methods:**
- `public void evaluateExtraParams()`
- `protected java.lang.String getDefaultTemplate()`
- `public void setShowPassword(java.lang.String p0)`

---

## public class `org.apache.struts2.components.Property`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.Component`  

**Constructors:**
- `public Property(com.opensymphony.xwork2.util.ValueStack p0)`

**Methods:**
- `public void setDefault(java.lang.String p0)`
- `public void setDefaultValue(java.lang.String p0)`
- `public void setEscapeCsv(boolean p0)`
- `public void setEscapeHtml(boolean p0)`
- `public void setEscapeJavaScript(boolean p0)`
- `public void setEscapeXml(boolean p0)`
- `public void setValue(java.lang.String p0)`
- `public boolean start(java.io.Writer p0)`

---

## public class `org.apache.struts2.components.Push`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.Component`  

**Constructors:**
- `public Push(com.opensymphony.xwork2.util.ValueStack p0)`

**Fields:**
- `protected boolean pushed`
- `protected java.lang.String value`

**Methods:**
- `public boolean end(java.io.Writer p0, java.lang.String p1)`
- `public void setValue(java.lang.String p0)`
- `public boolean start(java.io.Writer p0)`

---

## public class `org.apache.struts2.components.Radio`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.ListUIBean`  

**Constructors:**
- `public Radio(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `public final static java.lang.String TEMPLATE`

**Methods:**
- `public void evaluateExtraParams()`
- `protected java.lang.String getDefaultTemplate()`

---

## public class `org.apache.struts2.components.Reset`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.FormButton`  

**Constructors:**
- `public Reset(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `public final static java.lang.String TEMPLATE`
- `protected java.lang.String src`

**Methods:**
- `public void evaluateExtraParams()`
- `public void evaluateParams()`
- `public java.lang.String getDefaultOpenTemplate()`
- `protected java.lang.String getDefaultTemplate()`
- `public void setLabel(java.lang.String p0)`
- `public void setSrc(java.lang.String p0)`
- `protected boolean supportsImageType()`

---

## public class `org.apache.struts2.components.Select`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.ListUIBean`  

**Constructors:**
- `public Select(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `public final static java.lang.String TEMPLATE`
- `protected java.lang.String emptyOption`
- `protected java.lang.String headerKey`
- `protected java.lang.String headerValue`
- `protected java.lang.String multiple`
- `protected java.lang.String size`

**Methods:**
- `public void evaluateExtraParams()`
- `protected java.lang.String getDefaultTemplate()`
- `public void setEmptyOption(java.lang.String p0)`
- `public void setHeaderKey(java.lang.String p0)`
- `public void setHeaderValue(java.lang.String p0)`
- `public void setMultiple(java.lang.String p0)`
- `public void setSize(java.lang.String p0)`

---

## public class `org.apache.struts2.components.ServletUrlRenderer`
implements `org.apache.struts2.components.UrlRenderer`  

**Constructors:**
- `public ServletUrlRenderer()`

**Methods:**
- `public void beforeRenderUrl(org.apache.struts2.components.UrlProvider p0)`
- `protected void mergeRequestParameters(java.lang.String p0, java.util.Map p1, java.util.Map p2)`
- `public void renderFormUrl(org.apache.struts2.components.Form p0)`
- `public void renderUrl(java.io.Writer p0, org.apache.struts2.components.UrlProvider p1)`
- `public void setActionMapper(org.apache.struts2.dispatcher.mapper.ActionMapper p0)`
- `public void setUrlHelper(org.apache.struts2.views.util.UrlHelper p0)`

---

## public class `org.apache.struts2.components.Set`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.ContextBean`  

**Constructors:**
- `public Set(com.opensymphony.xwork2.util.ValueStack p0)`

**Fields:**
- `protected java.lang.String scope`
- `protected boolean trimBody`
- `protected java.lang.String value`

**Methods:**
- `public boolean end(java.io.Writer p0, java.lang.String p1)`
- `public void setScope(java.lang.String p0)`
- `public void setTrimBody(boolean p0)`
- `public void setValue(java.lang.String p0)`
- `public void setVar(java.lang.String p0)`
- `public boolean usesBody()`

---

## public class `org.apache.struts2.components.Submit`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.FormButton`  

**Constructors:**
- `public Submit(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `public final static java.lang.String OPEN_TEMPLATE`
- `public final static java.lang.String TEMPLATE`
- `protected java.lang.String src`

**Methods:**
- `public boolean end(java.io.Writer p0, java.lang.String p1)`
- `public void evaluateExtraParams()`
- `public void evaluateParams()`
- `public java.lang.String getDefaultOpenTemplate()`
- `protected java.lang.String getDefaultTemplate()`
- `public void setSrc(java.lang.String p0)`
- `protected boolean supportsImageType()`
- `public boolean usesBody()`

---

## public class `org.apache.struts2.components.Text`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.ContextBean`  
implements `org.apache.struts2.components.Param$UnnamedParametric`  

**Constructors:**
- `public Text(com.opensymphony.xwork2.util.ValueStack p0)`

**Fields:**
- `protected java.lang.String actualName`
- `protected java.lang.String name`
- `protected java.lang.String searchStack`
- `protected java.util.List values`

**Methods:**
- `public void addParameter(java.lang.Object p0)`
- `public void addParameter(java.lang.String p0, java.lang.Object p1)`
- `public boolean end(java.io.Writer p0, java.lang.String p1)`
- `public void setEscapeCsv(boolean p0)`
- `public void setEscapeHtml(boolean p0)`
- `public void setEscapeJavaScript(boolean p0)`
- `public void setEscapeXml(boolean p0)`
- `public void setName(java.lang.String p0)`
- `public void setSearchValueStack(java.lang.String p0)`
- `public boolean usesBody()`

---

## public class `org.apache.struts2.components.TextArea`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.UIBean`  

**Constructors:**
- `public TextArea(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `public final static java.lang.String TEMPLATE`
- `protected java.lang.String cols`
- `protected java.lang.String readonly`
- `protected java.lang.String rows`
- `protected java.lang.String wrap`

**Methods:**
- `public void evaluateExtraParams()`
- `protected java.lang.String getDefaultTemplate()`
- `public void setCols(java.lang.String p0)`
- `public void setReadonly(java.lang.String p0)`
- `public void setRows(java.lang.String p0)`
- `public void setWrap(java.lang.String p0)`

---

## public class `org.apache.struts2.components.TextField`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.UIBean`  

**Constructors:**
- `public TextField(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `public final static java.lang.String TEMPLATE`
- `protected java.lang.String maxlength`
- `protected java.lang.String readonly`
- `protected java.lang.String size`
- `protected java.lang.String type`

**Methods:**
- `protected void evaluateExtraParams()`
- `protected java.lang.String getDefaultTemplate()`
- `public void setMaxLength(java.lang.String p0)`
- `public void setMaxlength(java.lang.String p0)`
- `public void setReadonly(java.lang.String p0)`
- `public void setSize(java.lang.String p0)`
- `public void setType(java.lang.String p0)`

---

## public class `org.apache.struts2.components.Token`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.UIBean`  

**Constructors:**
- `public Token(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `public final static java.lang.String TEMPLATE`

**Methods:**
- `protected void evaluateExtraParams()`
- `protected java.lang.String getDefaultTemplate()`

---

## public abstract class `org.apache.struts2.components.UIBean`
extends `org.apache.struts2.components.Component`  

**Constructors:**
- `public UIBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `protected java.lang.String accesskey`
- `protected java.lang.String cssClass`
- `protected java.lang.String cssErrorClass`
- `protected java.lang.String cssErrorStyle`
- `protected java.lang.String cssStyle`
- `protected java.lang.String defaultTemplateDir`
- `protected java.lang.String defaultUITheme`
- `protected java.lang.String disabled`
- `protected java.util.Map dynamicAttributes`
- `protected java.lang.String errorPosition`
- `protected java.lang.String id`
- `protected java.lang.String javascriptTooltip`
- `protected java.lang.String key`
- `protected java.lang.String label`
- `protected java.lang.String labelPosition`
- `protected java.lang.String labelSeparator`
- `protected java.lang.String name`
- `protected java.lang.String onblur`
- `protected java.lang.String onchange`
- `protected java.lang.String onclick`
- `protected java.lang.String ondblclick`
- `protected java.lang.String onfocus`
- `protected java.lang.String onkeydown`
- `protected java.lang.String onkeypress`
- `protected java.lang.String onkeyup`
- `protected java.lang.String onmousedown`
- `protected java.lang.String onmousemove`
- `protected java.lang.String onmouseout`
- `protected java.lang.String onmouseover`
- `protected java.lang.String onmouseup`
- `protected java.lang.String onselect`
- `protected javax.servlet.http.HttpServletRequest request`
- `protected java.lang.String requiredLabel`
- `protected java.lang.String requiredPosition`
- `protected javax.servlet.http.HttpServletResponse response`
- `protected java.lang.String tabindex`
- `protected java.lang.String template`
- `protected java.lang.String templateDir`
- `protected org.apache.struts2.components.template.TemplateEngineManager templateEngineManager`
- `protected java.lang.String templateSuffix`
- `protected java.lang.String theme`
- `protected java.lang.String title`
- `protected java.lang.String tooltip`
- `protected java.lang.String tooltipConfig`
- `protected java.lang.String tooltipCssClass`
- `protected java.lang.String tooltipDelay`
- `protected java.lang.String tooltipIconPath`
- `protected java.lang.String uiThemeExpansionToken`
- `protected java.lang.String value`

**Methods:**
- `public void addFormParameter(java.lang.String p0, java.lang.Object p1)`
- `protected org.apache.struts2.components.template.Template buildTemplateName(java.lang.String p0, java.lang.String p1)`
- `public void copyParams(java.util.Map p0)`
- `protected void enableAncestorFormCustomOnsubmit()`
- `public boolean end(java.io.Writer p0, java.lang.String p1)`
- `protected java.lang.String ensureAttributeSafelyNotEscaped(java.lang.String p0)`
- `protected java.lang.String escape(java.lang.String p0)`
- `protected void evaluateExtraParams()`
- `protected boolean evaluateNameValue()`
- `public void evaluateParams()`
- `protected abstract java.lang.String getDefaultTemplate()`
- `public java.lang.String getId()`
- `public java.lang.String getTemplate()`
- `public java.lang.String getTemplateDir()`
- `public java.lang.String getTheme()`
- `protected java.util.Map getTooltipConfig(org.apache.struts2.components.UIBean p0)`
- `protected java.lang.Class getValueClassType()`
- `protected void mergeTemplate(java.io.Writer p0, org.apache.struts2.components.template.Template p1) throws java.lang.Exception`
- `protected void populateComponentHtmlId(org.apache.struts2.components.Form p0)`
- `public void setAccesskey(java.lang.String p0)`
- `public void setClass(java.lang.String p0)`
- `public void setCssClass(java.lang.String p0)`
- `public void setCssErrorClass(java.lang.String p0)`
- `public void setCssErrorStyle(java.lang.String p0)`
- `public void setCssStyle(java.lang.String p0)`
- `public void setDefaultTemplateDir(java.lang.String p0)`
- `public void setDefaultUITheme(java.lang.String p0)`
- `public void setDisabled(java.lang.String p0)`
- `public void setDynamicAttributes(java.util.Map p0)`
- `public void setErrorPosition(java.lang.String p0)`
- `public void setId(java.lang.String p0)`
- `public void setJavascriptTooltip(java.lang.String p0)`
- `public void setKey(java.lang.String p0)`
- `public void setLabel(java.lang.String p0)`
- `public void setLabelSeparator(java.lang.String p0)`
- `public void setLabelposition(java.lang.String p0)`
- `public void setName(java.lang.String p0)`
- `public void setOnblur(java.lang.String p0)`
- `public void setOnchange(java.lang.String p0)`
- `public void setOnclick(java.lang.String p0)`
- `public void setOndblclick(java.lang.String p0)`
- `public void setOnfocus(java.lang.String p0)`
- `public void setOnkeydown(java.lang.String p0)`
- `public void setOnkeypress(java.lang.String p0)`
- `public void setOnkeyup(java.lang.String p0)`
- `public void setOnmousedown(java.lang.String p0)`
- `public void setOnmousemove(java.lang.String p0)`
- `public void setOnmouseout(java.lang.String p0)`
- `public void setOnmouseover(java.lang.String p0)`
- `public void setOnmouseup(java.lang.String p0)`
- `public void setOnselect(java.lang.String p0)`
- `public void setRequiredLabel(java.lang.String p0)`
- `public void setRequiredPosition(java.lang.String p0)`
- `public void setStyle(java.lang.String p0)`
- `public void setTabindex(java.lang.String p0)`
- `public void setTemplate(java.lang.String p0)`
- `public void setTemplateDir(java.lang.String p0)`
- `public void setTemplateEngineManager(org.apache.struts2.components.template.TemplateEngineManager p0)`
- `public void setTheme(java.lang.String p0)`
- `public void setTitle(java.lang.String p0)`
- `public void setTooltip(java.lang.String p0)`
- `public void setTooltipConfig(java.lang.String p0)`
- `public void setTooltipCssClass(java.lang.String p0)`
- `public void setTooltipDelay(java.lang.String p0)`
- `public void setTooltipIconPath(java.lang.String p0)`
- `public void setUIThemeExpansionToken(java.lang.String p0)`
- `public void setValue(java.lang.String p0)`

---

## public class `org.apache.struts2.components.URL`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.ContextBean`  

**Constructors:**
- `public URL(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `public boolean end(java.io.Writer p0, java.lang.String p1)`
- `public java.lang.String findString(java.lang.String p0)`
- `public org.apache.struts2.components.UrlProvider getUrlProvider()`
- `public void setAction(java.lang.String p0)`
- `public void setAnchor(java.lang.String p0)`
- `public void setEncode(boolean p0)`
- `public void setEscapeAmp(boolean p0)`
- `public void setExtraParameterProvider(org.apache.struts2.components.ExtraParameterProvider p0)`
- `public void setForceAddSchemeHostAndPort(boolean p0)`
- `public void setIncludeContext(boolean p0)`
- `public void setIncludeParams(java.lang.String p0)`
- `public void setMethod(java.lang.String p0)`
- `public void setNamespace(java.lang.String p0)`
- `public void setPortletMode(java.lang.String p0)`
- `public void setPortletUrlType(java.lang.String p0)`
- `public void setScheme(java.lang.String p0)`
- `public void setUrlIncludeParams(java.lang.String p0)`
- `public void setUrlRenderer(org.apache.struts2.components.UrlRenderer p0)`
- `public void setValue(java.lang.String p0)`
- `public void setWindowState(java.lang.String p0)`
- `public boolean start(java.io.Writer p0)`

---

## public class `org.apache.struts2.components.UpDownSelect`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.components.Select`  

**Constructors:**
- `public UpDownSelect(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `public final static java.lang.String TEMPLATE`
- `protected java.lang.String allowMoveDown`
- `protected java.lang.String allowMoveUp`
- `protected java.lang.String allowSelectAll`
- `protected java.lang.String moveDownLabel`
- `protected java.lang.String moveUpLabel`
- `protected java.lang.String selectAllLabel`

**Methods:**
- `public void evaluateParams()`
- `public java.lang.String getAllowMoveDown()`
- `public java.lang.String getAllowMoveUp()`
- `public java.lang.String getAllowSelectAll()`
- `public java.lang.String getDefaultTemplate()`
- `public java.lang.String getMoveDownLabel()`
- `public java.lang.String getMoveUpLabel()`
- `public java.lang.String getSelectAllLabel()`
- `public void setAllowMoveDown(java.lang.String p0)`
- `public void setAllowMoveUp(java.lang.String p0)`
- `public void setAllowSelectAll(java.lang.String p0)`
- `public void setMoveDownLabel(java.lang.String p0)`
- `public void setMoveUpLabel(java.lang.String p0)`
- `public void setSelectAllLabel(java.lang.String p0)`

---

## public abstract interface `org.apache.struts2.components.UrlProvider`

**Fields:**
- `public final static java.lang.String ALL`
- `public final static java.lang.String GET`
- `public final static java.lang.String NONE`

**Methods:**
- `public abstract java.lang.String determineActionURL(java.lang.String p0, java.lang.String p1, java.lang.String p2, javax.servlet.http.HttpServletRequest p3, javax.servlet.http.HttpServletResponse p4, java.util.Map p5, java.lang.String p6, boolean p7, boolean p8, boolean p9, boolean p10)`
- `public abstract java.lang.String determineNamespace(java.lang.String p0, com.opensymphony.xwork2.util.ValueStack p1, javax.servlet.http.HttpServletRequest p2)`
- `public abstract java.lang.String findString(java.lang.String p0)`
- `public abstract java.lang.String getAction()`
- `public abstract java.lang.String getAnchor()`
- `public abstract org.apache.struts2.components.ExtraParameterProvider getExtraParameterProvider()`
- `public abstract javax.servlet.http.HttpServletRequest getHttpServletRequest()`
- `public abstract javax.servlet.http.HttpServletResponse getHttpServletResponse()`
- `public abstract java.lang.String getIncludeParams()`
- `public abstract java.lang.String getMethod()`
- `public abstract java.lang.String getNamespace()`
- `public abstract java.util.Map getParameters()`
- `public abstract java.lang.String getPortletMode()`
- `public abstract java.lang.String getPortletUrlType()`
- `public abstract java.lang.String getScheme()`
- `public abstract com.opensymphony.xwork2.util.ValueStack getStack()`
- `public abstract java.lang.String getUrlIncludeParams()`
- `public abstract java.lang.String getValue()`
- `public abstract java.lang.String getVar()`
- `public abstract java.lang.String getWindowState()`
- `public abstract boolean isEncode()`
- `public abstract boolean isEscapeAmp()`
- `public abstract boolean isForceAddSchemeHostAndPort()`
- `public abstract boolean isIncludeContext()`
- `public abstract boolean isPutInContext()`
- `public abstract void putInContext(java.lang.String p0)`
- `public abstract void setAction(java.lang.String p0)`
- `public abstract void setAnchor(java.lang.String p0)`
- `public abstract void setEncode(boolean p0)`
- `public abstract void setEscapeAmp(boolean p0)`
- `public abstract void setExtraParameterProvider(org.apache.struts2.components.ExtraParameterProvider p0)`
- `public abstract void setForceAddSchemeHostAndPort(boolean p0)`
- `public abstract void setHttpServletRequest(javax.servlet.http.HttpServletRequest p0)`
- `public abstract void setHttpServletResponse(javax.servlet.http.HttpServletResponse p0)`
- `public abstract void setIncludeContext(boolean p0)`
- `public abstract void setIncludeParams(java.lang.String p0)`
- `public abstract void setMethod(java.lang.String p0)`
- `public abstract void setNamespace(java.lang.String p0)`
- `public abstract void setPortletMode(java.lang.String p0)`
- `public abstract void setPortletUrlType(java.lang.String p0)`
- `public abstract void setScheme(java.lang.String p0)`
- `public abstract void setUrlIncludeParams(java.lang.String p0)`
- `public abstract void setUrlRenderer(org.apache.struts2.components.UrlRenderer p0)`
- `public abstract void setValue(java.lang.String p0)`
- `public abstract void setWindowState(java.lang.String p0)`

---

## public abstract interface `org.apache.struts2.components.UrlRenderer`

**Methods:**
- `public abstract void beforeRenderUrl(org.apache.struts2.components.UrlProvider p0)`
- `public abstract void renderFormUrl(org.apache.struts2.components.Form p0)`
- `public abstract void renderUrl(java.io.Writer p0, org.apache.struts2.components.UrlProvider p1)`
- `public abstract void setActionMapper(org.apache.struts2.dispatcher.mapper.ActionMapper p0)`

---

## public abstract class `org.apache.struts2.components.template.BaseTemplateEngine`
implements `org.apache.struts2.components.template.TemplateEngine`  

**Constructors:**
- `public BaseTemplateEngine()`

**Fields:**
- `public final static java.lang.String DEFAULT_THEME_PROPERTIES_FILE_NAME`

**Methods:**
- `protected java.lang.String getFinalTemplateName(org.apache.struts2.components.template.Template p0)`
- `protected abstract java.lang.String getSuffix()`
- `protected java.lang.String getThemePropertiesFileName()`
- `public java.util.Map getThemeProps(org.apache.struts2.components.template.Template p0)`

---

## public class `org.apache.struts2.components.template.FreemarkerTemplateEngine`
extends `org.apache.struts2.components.template.BaseTemplateEngine`  

**Constructors:**
- `public FreemarkerTemplateEngine()`

**Fields:**
- `protected org.apache.struts2.views.freemarker.FreemarkerManager freemarkerManager`

**Methods:**
- `protected java.lang.String getSuffix()`
- `public void renderTemplate(org.apache.struts2.components.template.TemplateRenderingContext p0) throws java.lang.Exception`
- `public void setFreemarkerManager(org.apache.struts2.views.freemarker.FreemarkerManager p0)`

---

## public class `org.apache.struts2.components.template.JspTemplateEngine`
extends `org.apache.struts2.components.template.BaseTemplateEngine`  

**Constructors:**
- `public JspTemplateEngine()`

**Methods:**
- `protected java.lang.String getSuffix()`
- `public void renderTemplate(org.apache.struts2.components.template.TemplateRenderingContext p0) throws java.lang.Exception`
- `public void setEncoding(java.lang.String p0)`

---

## public class `org.apache.struts2.components.template.Template`
implements `java.lang.Cloneable`  

**Constructors:**
- `public Template(java.lang.String p0, java.lang.String p1, java.lang.String p2)`

**Methods:**
- `protected java.lang.Object clone() throws java.lang.CloneNotSupportedException`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getDir()`
- `public java.lang.String getName()`
- `public java.util.List getPossibleTemplates(org.apache.struts2.components.template.TemplateEngine p0)`
- `public java.lang.String getTheme()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public abstract interface `org.apache.struts2.components.template.TemplateEngine`

**Methods:**
- `public abstract java.util.Map getThemeProps(org.apache.struts2.components.template.Template p0)`
- `public abstract void renderTemplate(org.apache.struts2.components.template.TemplateRenderingContext p0) throws java.lang.Exception`

---

## public class `org.apache.struts2.components.template.TemplateEngineManager`

**Constructors:**
- `public TemplateEngineManager()`

**Fields:**
- `public final static java.lang.String DEFAULT_TEMPLATE_TYPE`

**Methods:**
- `public org.apache.struts2.components.template.TemplateEngine getTemplateEngine(org.apache.struts2.components.template.Template p0, java.lang.String p1)`
- `public void registerTemplateEngine(java.lang.String p0, org.apache.struts2.components.template.TemplateEngine p1)`
- `public void setContainer(com.opensymphony.xwork2.inject.Container p0)`
- `public void setDefaultTemplateType(java.lang.String p0)`

---

## public class `org.apache.struts2.components.template.TemplateRenderingContext`

**Constructors:**
- `public TemplateRenderingContext(org.apache.struts2.components.template.Template p0, java.io.Writer p1, com.opensymphony.xwork2.util.ValueStack p2, java.util.Map p3, org.apache.struts2.components.UIBean p4)`

**Methods:**
- `public java.util.Map getParameters()`
- `public com.opensymphony.xwork2.util.ValueStack getStack()`
- `public org.apache.struts2.components.UIBean getTag()`
- `public org.apache.struts2.components.template.Template getTemplate()`
- `public java.io.Writer getWriter()`

---

## public class `org.apache.struts2.components.template.VelocityTemplateEngine`
extends `org.apache.struts2.components.template.BaseTemplateEngine`  

**Constructors:**
- `public VelocityTemplateEngine()`

**Methods:**
- `protected java.lang.String getSuffix()`
- `public void renderTemplate(org.apache.struts2.components.template.TemplateRenderingContext p0) throws java.lang.Exception`
- `public void setVelocityManager(org.apache.struts2.views.velocity.VelocityManager p0)`

---

## public abstract class `org.apache.struts2.config.AbstractBeanSelectionProvider`
implements `com.opensymphony.xwork2.config.BeanSelectionProvider`  

**Constructors:**
- `public AbstractBeanSelectionProvider()`

**Fields:**
- `public final static java.lang.String DEFAULT_BEAN_NAME`

**Methods:**
- `protected void alias(java.lang.Class p0, java.lang.String p1, com.opensymphony.xwork2.inject.ContainerBuilder p2, java.util.Properties p3)`
- `protected void alias(java.lang.Class p0, java.lang.String p1, com.opensymphony.xwork2.inject.ContainerBuilder p2, java.util.Properties p3, com.opensymphony.xwork2.inject.Scope p4)`
- `protected void convertIfExist(com.opensymphony.xwork2.util.location.LocatableProperties p0, java.lang.String p1, java.lang.String p2)`
- `public void destroy()`
- `public void init(com.opensymphony.xwork2.config.Configuration p0) throws com.opensymphony.xwork2.config.ConfigurationException`
- `public void loadPackages() throws com.opensymphony.xwork2.config.ConfigurationException`
- `public boolean needsReload()`

---

## public class `org.apache.struts2.config.DefaultBeanSelectionProvider`
extends `org.apache.struts2.config.AbstractBeanSelectionProvider`  

**Constructors:**
- `public DefaultBeanSelectionProvider()`

**Methods:**
- `public void register(com.opensymphony.xwork2.inject.ContainerBuilder p0, com.opensymphony.xwork2.util.location.LocatableProperties p1)`

---

## public class `org.apache.struts2.config.DefaultPropertiesProvider`
extends `org.apache.struts2.config.PropertiesConfigurationProvider`  

**Constructors:**
- `public DefaultPropertiesProvider()`

**Methods:**
- `public void destroy()`
- `public void init(com.opensymphony.xwork2.config.Configuration p0) throws com.opensymphony.xwork2.config.ConfigurationException`
- `public void register(com.opensymphony.xwork2.inject.ContainerBuilder p0, com.opensymphony.xwork2.util.location.LocatableProperties p1) throws com.opensymphony.xwork2.config.ConfigurationException`

---

## public class `org.apache.struts2.config.DefaultSettings`
implements `org.apache.struts2.config.Settings`  

**Constructors:**
- `public DefaultSettings()`

**Methods:**
- `public java.lang.String get(java.lang.String p0) throws java.lang.IllegalArgumentException`
- `public com.opensymphony.xwork2.util.location.Location getLocation(java.lang.String p0)`
- `public java.util.Iterator list()`

---

## public class `org.apache.struts2.config.NullResult`
implements `com.opensymphony.xwork2.Result`  

**Constructors:**
- `public NullResult()`

**Methods:**
- `public void execute(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`

---

## public class `org.apache.struts2.config.PropertiesConfigurationProvider`
implements `com.opensymphony.xwork2.config.ConfigurationProvider`  

**Constructors:**
- `public PropertiesConfigurationProvider()`

**Methods:**
- `public void destroy()`
- `public void init(com.opensymphony.xwork2.config.Configuration p0) throws com.opensymphony.xwork2.config.ConfigurationException`
- `public void loadPackages() throws com.opensymphony.xwork2.config.ConfigurationException`
- `protected void loadSettings(com.opensymphony.xwork2.util.location.LocatableProperties p0, org.apache.struts2.config.Settings p1)`
- `public boolean needsReload()`
- `public void register(com.opensymphony.xwork2.inject.ContainerBuilder p0, com.opensymphony.xwork2.util.location.LocatableProperties p1) throws com.opensymphony.xwork2.config.ConfigurationException`

---

## public class `org.apache.struts2.config.StrutsXmlConfigurationProvider`
extends `com.opensymphony.xwork2.config.providers.XmlConfigurationProvider`  

**Constructors:**
- `public StrutsXmlConfigurationProvider(boolean p0)`
- `public StrutsXmlConfigurationProvider(java.lang.String p0, boolean p1, javax.servlet.ServletContext p2)`

**Methods:**
- `protected java.net.URL findInFileSystem(java.lang.String p0) throws java.io.IOException`
- `protected java.util.Iterator getConfigurationUrls(java.lang.String p0) throws java.io.IOException`
- `public void loadPackages()`
- `public boolean needsReload()`
- `public void register(com.opensymphony.xwork2.inject.ContainerBuilder p0, com.opensymphony.xwork2.util.location.LocatableProperties p1) throws com.opensymphony.xwork2.config.ConfigurationException`
- `public java.lang.String toString()`

---

## public class `org.apache.struts2.conversion.UploadedFileConverter`
extends `com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter`  

**Constructors:**
- `public UploadedFileConverter()`

**Methods:**
- `public java.lang.Object convertValue(java.util.Map p0, java.lang.Object p1, java.lang.reflect.Member p2, java.lang.String p3, java.lang.Object p4, java.lang.Class p5)`

---

## public class `org.apache.struts2.dispatcher.ApplicationMap`
extends `java.util.AbstractMap`  
implements `java.io.Serializable`  

**Constructors:**
- `public ApplicationMap(javax.servlet.ServletContext p0)`

**Methods:**
- `public void clear()`
- `public java.util.Set entrySet()`
- `public java.lang.Object get(java.lang.Object p0)`
- `public java.lang.Object put(java.lang.Object p0, java.lang.Object p1)`
- `public java.lang.Object remove(java.lang.Object p0)`

---

## public class `org.apache.struts2.dispatcher.DefaultActionSupport`
extends `com.opensymphony.xwork2.ActionSupport`  

**Constructors:**
- `public DefaultActionSupport()`

**Methods:**
- `public java.lang.String execute() throws java.lang.Exception`
- `public java.lang.String getSuccessResultValue()`
- `public void setSuccessResultValue(java.lang.String p0)`

---

## public class `org.apache.struts2.dispatcher.DefaultDispatcherErrorHandler`
implements `org.apache.struts2.dispatcher.DispatcherErrorHandler`  

**Constructors:**
- `public DefaultDispatcherErrorHandler()`

**Methods:**
- `protected java.util.HashMap createReportData(java.lang.Exception p0, java.util.List p1)`
- `public void handleError(javax.servlet.http.HttpServletRequest p0, javax.servlet.http.HttpServletResponse p1, int p2, java.lang.Exception p3)`
- `protected void handleErrorInDevMode(javax.servlet.http.HttpServletResponse p0, int p1, java.lang.Exception p2)`
- `public void init(javax.servlet.ServletContext p0)`
- `protected void sendErrorResponse(javax.servlet.http.HttpServletRequest p0, javax.servlet.http.HttpServletResponse p1, int p2, java.lang.Exception p3)`
- `public void setDevMode(java.lang.String p0)`
- `public void setFreemarkerManager(org.apache.struts2.views.freemarker.FreemarkerManager p0)`

---

## public class `org.apache.struts2.dispatcher.DefaultStaticContentLoader`
implements `org.apache.struts2.dispatcher.StaticContentLoader`  

**Constructors:**
- `public DefaultStaticContentLoader()`

**Fields:**
- `protected boolean devMode`
- `protected java.lang.String encoding`
- `protected final java.util.Calendar lastModifiedCal`
- `protected java.util.List pathPrefixes`
- `protected boolean serveStatic`
- `protected boolean serveStaticBrowserCache`

**Methods:**
- `protected java.lang.String buildPath(java.lang.String p0, java.lang.String p1) throws java.io.UnsupportedEncodingException`
- `public boolean canHandle(java.lang.String p0)`
- `protected java.lang.String cleanupPath(java.lang.String p0)`
- `protected void copy(java.io.InputStream p0, java.io.OutputStream p1) throws java.io.IOException`
- `protected java.net.URL findResource(java.lang.String p0) throws java.io.IOException`
- `public void findStaticResource(java.lang.String p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2) throws java.io.IOException`
- `protected java.lang.String getAdditionalPackages()`
- `protected java.lang.String getContentType(java.lang.String p0)`
- `protected java.util.List parse(java.lang.String p0)`
- `protected void process(java.io.InputStream p0, java.lang.String p1, javax.servlet.http.HttpServletRequest p2, javax.servlet.http.HttpServletResponse p3) throws java.io.IOException`
- `public void setDevMode(java.lang.String p0)`
- `public void setEncoding(java.lang.String p0)`
- `public void setHostConfig(org.apache.struts2.dispatcher.HostConfig p0)`
- `public void setServeStaticBrowserCache(java.lang.String p0)`
- `public void setServeStaticContent(java.lang.String p0)`

---

## public class `org.apache.struts2.dispatcher.Dispatcher`

**Constructors:**
- `public Dispatcher(javax.servlet.ServletContext p0, java.util.Map p1)`

**Fields:**
- `public final static java.lang.String MULTIPART_FORM_DATA_REGEX`
- `public final static java.lang.String REQUEST_POST_METHOD`
- `protected com.opensymphony.xwork2.config.ConfigurationManager configurationManager`
- `protected java.util.Map initParams`
- `protected javax.servlet.ServletContext servletContext`

**Methods:**
- `public static void addDispatcherListener(org.apache.struts2.dispatcher.DispatcherListener p0)`
- `public void cleanUpAfterInit()`
- `public void cleanUpRequest(javax.servlet.http.HttpServletRequest p0)`
- `public void cleanup()`
- `protected com.opensymphony.xwork2.config.ConfigurationManager createConfigurationManager(java.lang.String p0)`
- `public java.util.HashMap createContextMap(java.util.Map p0, org.apache.struts2.dispatcher.HttpParameters p1, java.util.Map p2, java.util.Map p3, javax.servlet.http.HttpServletRequest p4, javax.servlet.http.HttpServletResponse p5)`
- `public java.util.Map createContextMap(javax.servlet.http.HttpServletRequest p0, javax.servlet.http.HttpServletResponse p1, org.apache.struts2.dispatcher.mapper.ActionMapping p2)`
- `protected com.opensymphony.xwork2.config.providers.XmlConfigurationProvider createStrutsXmlConfigurationProvider(java.lang.String p0, boolean p1, javax.servlet.ServletContext p2)`
- `public com.opensymphony.xwork2.config.ConfigurationManager getConfigurationManager()`
- `public com.opensymphony.xwork2.inject.Container getContainer()`
- `public static org.apache.struts2.dispatcher.Dispatcher getInstance()`
- `protected java.util.Locale getLocale(javax.servlet.http.HttpServletRequest p0)`
- `protected org.apache.struts2.dispatcher.multipart.MultiPartRequest getMultiPartRequest()`
- `protected java.lang.String getSaveDir()`
- `public void init()`
- `public boolean isDevMode()`
- `public boolean isHandleException()`
- `protected boolean isMultipartRequest(javax.servlet.http.HttpServletRequest p0)`
- `protected boolean isMultipartSupportEnabled(javax.servlet.http.HttpServletRequest p0)`
- `protected void logConfigurationException(javax.servlet.http.HttpServletRequest p0, com.opensymphony.xwork2.config.ConfigurationException p1)`
- `public void prepare(javax.servlet.http.HttpServletRequest p0, javax.servlet.http.HttpServletResponse p1)`
- `public static void removeDispatcherListener(org.apache.struts2.dispatcher.DispatcherListener p0)`
- `public void sendError(javax.servlet.http.HttpServletRequest p0, javax.servlet.http.HttpServletResponse p1, int p2, java.lang.Exception p3)`
- `public void serviceAction(javax.servlet.http.HttpServletRequest p0, javax.servlet.http.HttpServletResponse p1, org.apache.struts2.dispatcher.mapper.ActionMapping p2) throws javax.servlet.ServletException`
- `public void setDefaultEncoding(java.lang.String p0)`
- `public void setDefaultLocale(java.lang.String p0)`
- `public void setDevMode(java.lang.String p0)`
- `public void setDisableRequestAttributeValueStackLookup(java.lang.String p0)`
- `public void setDispatcherErrorHandler(org.apache.struts2.dispatcher.DispatcherErrorHandler p0)`
- `public void setHandleException(java.lang.String p0)`
- `public static void setInstance(org.apache.struts2.dispatcher.Dispatcher p0)`
- `public void setMultipartHandler(java.lang.String p0)`
- `public void setMultipartSaveDir(java.lang.String p0)`
- `public void setMultipartSupportEnabled(java.lang.String p0)`
- `public void setMultipartValidationRegex(java.lang.String p0)`
- `public void setValueStackFactory(com.opensymphony.xwork2.util.ValueStackFactory p0)`
- `public javax.servlet.http.HttpServletRequest wrapRequest(javax.servlet.http.HttpServletRequest p0) throws java.io.IOException`

---

## public static class `org.apache.struts2.dispatcher.Dispatcher$Locator`

**Constructors:**
- `public Locator()`

**Methods:**
- `public com.opensymphony.xwork2.util.location.Location getLocation(java.lang.Object p0)`

---

## public abstract interface `org.apache.struts2.dispatcher.DispatcherErrorHandler`

**Methods:**
- `public abstract void handleError(javax.servlet.http.HttpServletRequest p0, javax.servlet.http.HttpServletResponse p1, int p2, java.lang.Exception p3)`
- `public abstract void init(javax.servlet.ServletContext p0)`

---

## public abstract interface `org.apache.struts2.dispatcher.DispatcherListener`

**Methods:**
- `public abstract void dispatcherDestroyed(org.apache.struts2.dispatcher.Dispatcher p0)`
- `public abstract void dispatcherInitialized(org.apache.struts2.dispatcher.Dispatcher p0)`

---

## public class `org.apache.struts2.dispatcher.ExecuteOperations`

**Constructors:**
- `public ExecuteOperations(org.apache.struts2.dispatcher.Dispatcher p0)`

**Methods:**
- `public void executeAction(javax.servlet.http.HttpServletRequest p0, javax.servlet.http.HttpServletResponse p1, org.apache.struts2.dispatcher.mapper.ActionMapping p2) throws javax.servlet.ServletException`
- `public boolean executeStaticResourceRequest(javax.servlet.http.HttpServletRequest p0, javax.servlet.http.HttpServletResponse p1) throws java.io.IOException, javax.servlet.ServletException`

---

## public abstract interface `org.apache.struts2.dispatcher.HostConfig`

**Methods:**
- `public abstract java.lang.String getInitParameter(java.lang.String p0)`
- `public abstract java.util.Iterator getInitParameterNames()`
- `public abstract javax.servlet.ServletContext getServletContext()`

---

## public class `org.apache.struts2.dispatcher.HttpParameters`
implements `java.lang.Cloneable`, `java.util.Map<java.lang.String,org.apache.struts2.dispatcher.Parameter>`  

**Methods:**
- `public org.apache.struts2.dispatcher.HttpParameters appendAll(java.util.Map p0)`
- `public void applyParameters(org.apache.struts2.interceptor.ParameterAware p0)`
- `public void clear()`
- `public boolean contains(java.lang.String p0)`
- `public boolean containsKey(java.lang.Object p0)`
- `public boolean containsValue(java.lang.Object p0)`
- `public static org.apache.struts2.dispatcher.HttpParameters$Builder create()`
- `public static org.apache.struts2.dispatcher.HttpParameters$Builder create(java.util.Map p0)`
- `public java.util.Set entrySet()`
- `public org.apache.struts2.dispatcher.Parameter get(java.lang.Object p0)`
- `public boolean isEmpty()`
- `public java.util.Set keySet()`
- `public org.apache.struts2.dispatcher.Parameter put(java.lang.String p0, org.apache.struts2.dispatcher.Parameter p1)`
- `public void putAll(java.util.Map p0)`
- `public org.apache.struts2.dispatcher.Parameter remove(java.lang.Object p0)`
- `public org.apache.struts2.dispatcher.HttpParameters remove(java.lang.String p0)`
- `public org.apache.struts2.dispatcher.HttpParameters remove(java.util.Set p0)`
- `public int size()`
- `public java.util.Map toMap()`
- `public java.lang.String toString()`
- `public java.util.Collection values()`

---

## public static class `org.apache.struts2.dispatcher.HttpParameters$Builder`

**Constructors:**
- `protected Builder(java.util.Map p0)`

**Methods:**
- `public org.apache.struts2.dispatcher.HttpParameters build()`
- `public org.apache.struts2.dispatcher.HttpParameters buildNoNestedWrapping()`
- `public org.apache.struts2.dispatcher.HttpParameters$Builder withComparator(java.util.Comparator p0)`
- `public org.apache.struts2.dispatcher.HttpParameters$Builder withExtraParams(java.util.Map p0)`
- `public org.apache.struts2.dispatcher.HttpParameters$Builder withParent(org.apache.struts2.dispatcher.HttpParameters p0)`

---

## public class `org.apache.struts2.dispatcher.InitOperations`

**Constructors:**
- `public InitOperations()`

**Methods:**
- `public java.util.List buildExcludedPatternsList(org.apache.struts2.dispatcher.Dispatcher p0)`
- `public void cleanup()`
- `protected org.apache.struts2.dispatcher.Dispatcher createDispatcher(org.apache.struts2.dispatcher.HostConfig p0)`
- `public org.apache.struts2.dispatcher.Dispatcher findDispatcherOnThread()`
- `public org.apache.struts2.dispatcher.Dispatcher initDispatcher(org.apache.struts2.dispatcher.HostConfig p0)`
- `public void initLogging(org.apache.struts2.dispatcher.HostConfig p0)`
- `public org.apache.struts2.dispatcher.StaticContentLoader initStaticContentLoader(org.apache.struts2.dispatcher.HostConfig p0, org.apache.struts2.dispatcher.Dispatcher p1)`

---

## public class `org.apache.struts2.dispatcher.LocalizedMessage`

**Constructors:**
- `public LocalizedMessage(java.lang.Class p0, java.lang.String p1, java.lang.String p2, java.lang.Object[] p3)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.Object[] getArgs()`
- `public java.lang.Class getClazz()`
- `public java.lang.String getDefaultMessage()`
- `public java.lang.String getTextKey()`
- `public int hashCode()`

---

## public class `org.apache.struts2.dispatcher.MockDispatcher`
extends `org.apache.struts2.dispatcher.Dispatcher`  

**Constructors:**
- `public MockDispatcher(javax.servlet.ServletContext p0, java.util.Map p1, com.opensymphony.xwork2.config.ConfigurationManager p2)`

**Methods:**
- `public void init()`

---

## public abstract interface `org.apache.struts2.dispatcher.Parameter`

**Methods:**
- `public abstract java.lang.String[] getMultipleValues()`
- `public abstract java.lang.String getName()`
- `public abstract java.lang.Object getObject()`
- `public abstract java.lang.String getValue()`
- `public abstract boolean isDefined()`
- `public abstract boolean isMultiple()`

---

## public static class `org.apache.struts2.dispatcher.Parameter$Empty`
implements `org.apache.struts2.dispatcher.Parameter`  

**Constructors:**
- `public Empty(java.lang.String p0)`

**Methods:**
- `public java.lang.String[] getMultipleValues()`
- `public java.lang.String getName()`
- `public java.lang.Object getObject()`
- `public java.lang.String getValue()`
- `public boolean isDefined()`
- `public boolean isMultiple()`
- `public java.lang.String toString()`

---

## public static class `org.apache.struts2.dispatcher.Parameter$File`
extends `org.apache.struts2.dispatcher.Parameter$Request`  

**Constructors:**
- `public File(java.lang.String p0, java.lang.Object p1)`

**Methods:**
- `public java.lang.String toString()`

---

## public static class `org.apache.struts2.dispatcher.Parameter$Request`
implements `org.apache.struts2.dispatcher.Parameter`  

**Constructors:**
- `public Request(java.lang.String p0, java.lang.Object p1)`

**Methods:**
- `public java.lang.String[] getMultipleValues()`
- `public java.lang.String getName()`
- `public java.lang.Object getObject()`
- `public java.lang.String getValue()`
- `public boolean isDefined()`
- `public boolean isMultiple()`
- `public java.lang.String toString()`

---

## public class `org.apache.struts2.dispatcher.PrepareOperations`

**Constructors:**
- `public PrepareOperations(org.apache.struts2.dispatcher.Dispatcher p0)`

**Fields:**
- `public final static java.lang.String CLEANUP_RECURSION_COUNTER`

**Methods:**
- `public void assignDispatcherToThread()`
- `public void cleanupDispatcher()`
- `public void cleanupRequest(javax.servlet.http.HttpServletRequest p0)`
- `public com.opensymphony.xwork2.ActionContext createActionContext(javax.servlet.http.HttpServletRequest p0, javax.servlet.http.HttpServletResponse p1)`
- `public org.apache.struts2.dispatcher.mapper.ActionMapping findActionMapping(javax.servlet.http.HttpServletRequest p0, javax.servlet.http.HttpServletResponse p1)`
- `public org.apache.struts2.dispatcher.mapper.ActionMapping findActionMapping(javax.servlet.http.HttpServletRequest p0, javax.servlet.http.HttpServletResponse p1, boolean p2)`
- `public static java.lang.Boolean getDevModeOverride()`
- `public boolean isUrlExcluded(javax.servlet.http.HttpServletRequest p0, java.util.List p1)`
- `public static void overrideDevMode(boolean p0)`
- `public void setEncodingAndLocale(javax.servlet.http.HttpServletRequest p0, javax.servlet.http.HttpServletResponse p1)`
- `public javax.servlet.http.HttpServletRequest wrapRequest(javax.servlet.http.HttpServletRequest p0) throws javax.servlet.ServletException`

---

## public class `org.apache.struts2.dispatcher.RequestMap`
extends `java.util.AbstractMap`  
implements `java.io.Serializable`  

**Constructors:**
- `public RequestMap(javax.servlet.http.HttpServletRequest p0)`

**Methods:**
- `public void clear()`
- `public java.util.Set entrySet()`
- `public java.lang.Object get(java.lang.Object p0)`
- `public java.lang.Object put(java.lang.Object p0, java.lang.Object p1)`
- `public java.lang.Object remove(java.lang.Object p0)`

---

## public class `org.apache.struts2.dispatcher.SessionMap`<K extends java.lang.Object, V extends java.lang.Object>
extends `java.util.AbstractMap`  
implements `java.io.Serializable`  

**Constructors:**
- `public SessionMap(javax.servlet.http.HttpServletRequest p0)`

**Fields:**
- `protected java.util.Set entries`
- `protected javax.servlet.http.HttpServletRequest request`
- `protected javax.servlet.http.HttpSession session`

**Methods:**
- `public void clear()`
- `public boolean containsKey(java.lang.Object p0)`
- `public java.util.Set entrySet()`
- `public V get(java.lang.Object p0)`
- `public void invalidate()`
- `public V put(K p0, V p1)`
- `public V remove(java.lang.Object p0)`

---

## public abstract interface `org.apache.struts2.dispatcher.StaticContentLoader`

**Methods:**
- `public abstract boolean canHandle(java.lang.String p0)`
- `public abstract void findStaticResource(java.lang.String p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2) throws java.io.IOException`
- `public abstract void setHostConfig(org.apache.struts2.dispatcher.HostConfig p0)`

---

## public class `org.apache.struts2.dispatcher.StrutsRequestWrapper`
extends `javax.servlet.http.HttpServletRequestWrapper`  

**Constructors:**
- `public StrutsRequestWrapper(javax.servlet.http.HttpServletRequest p0)`
- `public StrutsRequestWrapper(javax.servlet.http.HttpServletRequest p0, boolean p1)`

**Methods:**
- `public java.lang.Object getAttribute(java.lang.String p0)`

---

## public class `org.apache.struts2.dispatcher.filter.FilterHostConfig`
implements `org.apache.struts2.dispatcher.HostConfig`  

**Constructors:**
- `public FilterHostConfig(javax.servlet.FilterConfig p0)`

**Methods:**
- `public java.lang.String getInitParameter(java.lang.String p0)`
- `public java.util.Iterator getInitParameterNames()`
- `public javax.servlet.ServletContext getServletContext()`

---

## public class `org.apache.struts2.dispatcher.filter.StrutsExecuteFilter`
implements `javax.servlet.Filter`, `org.apache.struts2.StrutsStatics`  

**Constructors:**
- `public StrutsExecuteFilter()`

**Fields:**
- `protected org.apache.struts2.dispatcher.ExecuteOperations execute`
- `protected javax.servlet.FilterConfig filterConfig`
- `protected org.apache.struts2.dispatcher.PrepareOperations prepare`

**Methods:**
- `public void destroy()`
- `public void doFilter(javax.servlet.ServletRequest p0, javax.servlet.ServletResponse p1, javax.servlet.FilterChain p2) throws java.io.IOException, javax.servlet.ServletException`
- `public void init(javax.servlet.FilterConfig p0) throws javax.servlet.ServletException`
- `protected synchronized void lazyInit()`

---

## public class `org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter`
implements `javax.servlet.Filter`, `org.apache.struts2.StrutsStatics`  

**Constructors:**
- `public StrutsPrepareAndExecuteFilter()`

**Fields:**
- `protected java.util.List excludedPatterns`
- `protected org.apache.struts2.dispatcher.ExecuteOperations execute`
- `protected org.apache.struts2.dispatcher.PrepareOperations prepare`

**Methods:**
- `protected org.apache.struts2.dispatcher.ExecuteOperations createExecuteOperations(org.apache.struts2.dispatcher.Dispatcher p0)`
- `protected org.apache.struts2.dispatcher.InitOperations createInitOperations()`
- `protected org.apache.struts2.dispatcher.PrepareOperations createPrepareOperations(org.apache.struts2.dispatcher.Dispatcher p0)`
- `public void destroy()`
- `public void doFilter(javax.servlet.ServletRequest p0, javax.servlet.ServletResponse p1, javax.servlet.FilterChain p2) throws java.io.IOException, javax.servlet.ServletException`
- `public void init(javax.servlet.FilterConfig p0) throws javax.servlet.ServletException`
- `protected void postInit(org.apache.struts2.dispatcher.Dispatcher p0, javax.servlet.FilterConfig p1)`

---

## public class `org.apache.struts2.dispatcher.filter.StrutsPrepareFilter`
implements `javax.servlet.Filter`, `org.apache.struts2.StrutsStatics`  

**Constructors:**
- `public StrutsPrepareFilter()`

**Fields:**
- `protected final static java.lang.String REQUEST_EXCLUDED_FROM_ACTION_MAPPING`
- `protected java.util.List excludedPatterns`
- `protected org.apache.struts2.dispatcher.PrepareOperations prepare`

**Methods:**
- `public void destroy()`
- `public void doFilter(javax.servlet.ServletRequest p0, javax.servlet.ServletResponse p1, javax.servlet.FilterChain p2) throws java.io.IOException, javax.servlet.ServletException`
- `public void init(javax.servlet.FilterConfig p0) throws javax.servlet.ServletException`
- `protected void postInit(org.apache.struts2.dispatcher.Dispatcher p0, javax.servlet.FilterConfig p1)`

---

## public class `org.apache.struts2.dispatcher.listener.ListenerHostConfig`
implements `org.apache.struts2.dispatcher.HostConfig`  

**Constructors:**
- `public ListenerHostConfig(javax.servlet.ServletContext p0)`

**Methods:**
- `public java.lang.String getInitParameter(java.lang.String p0)`
- `public java.util.Iterator getInitParameterNames()`
- `public javax.servlet.ServletContext getServletContext()`

---

## public class `org.apache.struts2.dispatcher.listener.StrutsListener`
implements `javax.servlet.ServletContextListener`  

**Constructors:**
- `public StrutsListener()`

**Methods:**
- `public void contextDestroyed(javax.servlet.ServletContextEvent p0)`
- `public void contextInitialized(javax.servlet.ServletContextEvent p0)`

---

## public abstract interface `org.apache.struts2.dispatcher.mapper.ActionMapper`

**Methods:**
- `public abstract org.apache.struts2.dispatcher.mapper.ActionMapping getMapping(javax.servlet.http.HttpServletRequest p0, com.opensymphony.xwork2.config.ConfigurationManager p1)`
- `public abstract org.apache.struts2.dispatcher.mapper.ActionMapping getMappingFromActionName(java.lang.String p0)`
- `public abstract java.lang.String getUriFromActionMapping(org.apache.struts2.dispatcher.mapper.ActionMapping p0)`

---

## public class `org.apache.struts2.dispatcher.mapper.ActionMapping`

**Constructors:**
- `public ActionMapping()`
- `public ActionMapping(com.opensymphony.xwork2.Result p0)`
- `public ActionMapping(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.Map p3)`

**Methods:**
- `public java.lang.String getExtension()`
- `public java.lang.String getMethod()`
- `public java.lang.String getName()`
- `public java.lang.String getNamespace()`
- `public java.util.Map getParams()`
- `public com.opensymphony.xwork2.Result getResult()`
- `public void setExtension(java.lang.String p0)`
- `public void setMethod(java.lang.String p0)`
- `public void setName(java.lang.String p0)`
- `public void setNamespace(java.lang.String p0)`
- `public void setParams(java.util.Map p0)`
- `public void setResult(com.opensymphony.xwork2.Result p0)`
- `public java.lang.String toString()`

---

## public class `org.apache.struts2.dispatcher.mapper.CompositeActionMapper`
implements `org.apache.struts2.dispatcher.mapper.ActionMapper`  

**Constructors:**
- `public CompositeActionMapper(com.opensymphony.xwork2.inject.Container p0, java.lang.String p1)`

**Fields:**
- `protected java.util.List actionMappers`

**Methods:**
- `public org.apache.struts2.dispatcher.mapper.ActionMapping getMapping(javax.servlet.http.HttpServletRequest p0, com.opensymphony.xwork2.config.ConfigurationManager p1)`
- `public org.apache.struts2.dispatcher.mapper.ActionMapping getMappingFromActionName(java.lang.String p0)`
- `public java.lang.String getUriFromActionMapping(org.apache.struts2.dispatcher.mapper.ActionMapping p0)`

---

## public class `org.apache.struts2.dispatcher.mapper.DefaultActionMapper`
implements `org.apache.struts2.dispatcher.mapper.ActionMapper`  

**Constructors:**
- `public DefaultActionMapper()`

**Fields:**
- `protected final static java.lang.String ACTION_PREFIX`
- `protected final static java.lang.String METHOD_PREFIX`
- `protected boolean allowDynamicMethodCalls`
- `protected boolean allowSlashesInActionNames`
- `protected java.util.regex.Pattern allowedActionNames`
- `protected java.util.regex.Pattern allowedMethodNames`
- `protected java.util.regex.Pattern allowedNamespaceNames`
- `protected boolean alwaysSelectFullNamespace`
- `protected com.opensymphony.xwork2.inject.Container container`
- `protected java.lang.String defaultActionName`
- `protected java.lang.String defaultMethodName`
- `protected java.lang.String defaultNamespaceName`
- `protected java.util.List extensions`
- `protected org.apache.struts2.util.PrefixTrie prefixTrie`

**Methods:**
- `protected void addParameterAction(java.lang.String p0, org.apache.struts2.dispatcher.mapper.ParameterAction p1)`
- `protected java.lang.String cleanupActionName(java.lang.String p0)`
- `protected java.lang.String cleanupMethodName(java.lang.String p0)`
- `protected java.lang.String cleanupNamespaceName(java.lang.String p0)`
- `protected java.lang.String dropExtension(java.lang.String p0, org.apache.struts2.dispatcher.mapper.ActionMapping p1)`
- `protected java.lang.String getDefaultExtension()`
- `public org.apache.struts2.dispatcher.mapper.ActionMapping getMapping(javax.servlet.http.HttpServletRequest p0, com.opensymphony.xwork2.config.ConfigurationManager p1)`
- `public org.apache.struts2.dispatcher.mapper.ActionMapping getMappingFromActionName(java.lang.String p0)`
- `public java.lang.String getUriFromActionMapping(org.apache.struts2.dispatcher.mapper.ActionMapping p0)`
- `protected void handleDynamicMethod(org.apache.struts2.dispatcher.mapper.ActionMapping p0, java.lang.StringBuilder p1)`
- `protected void handleExtension(org.apache.struts2.dispatcher.mapper.ActionMapping p0, java.lang.StringBuilder p1)`
- `protected void handleName(org.apache.struts2.dispatcher.mapper.ActionMapping p0, java.lang.StringBuilder p1)`
- `protected void handleNamespace(org.apache.struts2.dispatcher.mapper.ActionMapping p0, java.lang.StringBuilder p1)`
- `protected void handleParams(org.apache.struts2.dispatcher.mapper.ActionMapping p0, java.lang.StringBuilder p1)`
- `public void handleSpecialParameters(javax.servlet.http.HttpServletRequest p0, org.apache.struts2.dispatcher.mapper.ActionMapping p1)`
- `public boolean isSlashesInActionNames()`
- `protected java.lang.String lookupExtension(java.lang.String p0)`
- `protected org.apache.struts2.dispatcher.mapper.ActionMapping parseActionName(org.apache.struts2.dispatcher.mapper.ActionMapping p0)`
- `protected void parseNameAndNamespace(java.lang.String p0, org.apache.struts2.dispatcher.mapper.ActionMapping p1, com.opensymphony.xwork2.config.ConfigurationManager p2)`
- `public void setAllowActionCrossNamespaceAccess(java.lang.String p0)`
- `public void setAllowActionPrefix(java.lang.String p0)`
- `public void setAllowDynamicMethodCalls(java.lang.String p0)`
- `public void setAllowedActionNames(java.lang.String p0)`
- `public void setAllowedMethodNames(java.lang.String p0)`
- `public void setAllowedNamespaceNames(java.lang.String p0)`
- `public void setAlwaysSelectFullNamespace(java.lang.String p0)`
- `public void setContainer(com.opensymphony.xwork2.inject.Container p0)`
- `public void setDefaultActionName(java.lang.String p0)`
- `public void setDefaultMethodName(java.lang.String p0)`
- `public void setDefaultNamespaceName(java.lang.String p0)`
- `public void setExtensions(java.lang.String p0)`
- `public void setSlashesInActionNames(java.lang.String p0)`

---

## public abstract interface `org.apache.struts2.dispatcher.mapper.ParameterAction`

**Methods:**
- `public abstract void execute(java.lang.String p0, org.apache.struts2.dispatcher.mapper.ActionMapping p1)`

---

## public class `org.apache.struts2.dispatcher.mapper.PrefixBasedActionMapper`
extends `org.apache.struts2.dispatcher.mapper.DefaultActionMapper`  
implements `org.apache.struts2.dispatcher.mapper.ActionMapper`  

**Constructors:**
- `public PrefixBasedActionMapper()`

**Fields:**
- `protected java.util.Map actionMappers`
- `protected com.opensymphony.xwork2.inject.Container container`

**Methods:**
- `public org.apache.struts2.dispatcher.mapper.ActionMapping getMapping(javax.servlet.http.HttpServletRequest p0, com.opensymphony.xwork2.config.ConfigurationManager p1)`
- `public java.lang.String getUriFromActionMapping(org.apache.struts2.dispatcher.mapper.ActionMapping p0)`
- `public void setContainer(com.opensymphony.xwork2.inject.Container p0)`
- `public void setPrefixBasedActionMappers(java.lang.String p0)`

---

## public class `org.apache.struts2.dispatcher.mapper.Restful2ActionMapper`
extends `org.apache.struts2.dispatcher.mapper.DefaultActionMapper`  

**Constructors:**
- `public Restful2ActionMapper()`

**Fields:**
- `public final static java.lang.String HTTP_METHOD_PARAM`
- `protected final static org.apache.logging.log4j.Logger LOG`

**Methods:**
- `public java.lang.String getIdParameterName()`
- `public org.apache.struts2.dispatcher.mapper.ActionMapping getMapping(javax.servlet.http.HttpServletRequest p0, com.opensymphony.xwork2.config.ConfigurationManager p1)`
- `protected boolean isDelete(javax.servlet.http.HttpServletRequest p0)`
- `protected boolean isGet(javax.servlet.http.HttpServletRequest p0)`
- `protected boolean isPost(javax.servlet.http.HttpServletRequest p0)`
- `protected boolean isPut(javax.servlet.http.HttpServletRequest p0)`
- `public void setIdParameterName(java.lang.String p0)`

---

## public class `org.apache.struts2.dispatcher.mapper.RestfulActionMapper`
implements `org.apache.struts2.dispatcher.mapper.ActionMapper`  

**Constructors:**
- `public RestfulActionMapper()`

**Fields:**
- `protected final static org.apache.logging.log4j.Logger LOG`

**Methods:**
- `public org.apache.struts2.dispatcher.mapper.ActionMapping getMapping(javax.servlet.http.HttpServletRequest p0, com.opensymphony.xwork2.config.ConfigurationManager p1)`
- `public org.apache.struts2.dispatcher.mapper.ActionMapping getMappingFromActionName(java.lang.String p0)`
- `public java.lang.String getUriFromActionMapping(org.apache.struts2.dispatcher.mapper.ActionMapping p0)`

---

## public abstract class `org.apache.struts2.dispatcher.multipart.AbstractMultiPartRequest`
implements `org.apache.struts2.dispatcher.multipart.MultiPartRequest`  

**Constructors:**
- `public AbstractMultiPartRequest()`

**Fields:**
- `public final static int BUFFER_SIZE`
- `protected int bufferSize`
- `protected java.lang.String defaultEncoding`
- `protected java.util.Locale defaultLocale`
- `protected java.util.List errors`
- `protected long maxSize`
- `protected boolean maxSizeProvided`

**Methods:**
- `protected org.apache.struts2.dispatcher.LocalizedMessage buildErrorMessage(java.lang.Throwable p0, java.lang.Object[] p1)`
- `protected java.lang.String getCanonicalName(java.lang.String p0)`
- `public java.util.List getErrors()`
- `public void setBufferSize(java.lang.String p0)`
- `public void setDefaultEncoding(java.lang.String p0)`
- `protected void setLocale(javax.servlet.http.HttpServletRequest p0)`
- `public void setLocaleProviderFactory(com.opensymphony.xwork2.LocaleProviderFactory p0)`
- `public void setMaxSize(java.lang.String p0)`

---

## public class `org.apache.struts2.dispatcher.multipart.JakartaMultiPartRequest`
extends `org.apache.struts2.dispatcher.multipart.AbstractMultiPartRequest`  

**Constructors:**
- `public JakartaMultiPartRequest()`

**Fields:**
- `protected java.util.Map files`
- `protected java.util.Map params`

**Methods:**
- `public void cleanUp()`
- `protected org.apache.commons.fileupload.disk.DiskFileItemFactory createDiskFileItemFactory(java.lang.String p0)`
- `protected org.apache.commons.fileupload.RequestContext createRequestContext(javax.servlet.http.HttpServletRequest p0)`
- `protected org.apache.commons.fileupload.servlet.ServletFileUpload createServletFileUpload(org.apache.commons.fileupload.disk.DiskFileItemFactory p0)`
- `public java.lang.String[] getContentType(java.lang.String p0)`
- `public org.apache.struts2.dispatcher.multipart.UploadedFile[] getFile(java.lang.String p0)`
- `public java.lang.String[] getFileNames(java.lang.String p0)`
- `public java.util.Enumeration getFileParameterNames()`
- `public java.lang.String[] getFilesystemName(java.lang.String p0)`
- `public java.lang.String getParameter(java.lang.String p0)`
- `public java.util.Enumeration getParameterNames()`
- `public java.lang.String[] getParameterValues(java.lang.String p0)`
- `public void parse(javax.servlet.http.HttpServletRequest p0, java.lang.String p1) throws java.io.IOException`
- `protected java.util.List parseRequest(javax.servlet.http.HttpServletRequest p0, java.lang.String p1) throws org.apache.commons.fileupload.FileUploadException`
- `protected void processFileField(org.apache.commons.fileupload.FileItem p0)`
- `protected void processNormalFormField(org.apache.commons.fileupload.FileItem p0, java.lang.String p1) throws java.io.UnsupportedEncodingException`
- `protected void processUpload(javax.servlet.http.HttpServletRequest p0, java.lang.String p1) throws java.io.UnsupportedEncodingException, org.apache.commons.fileupload.FileUploadException`

---

## public class `org.apache.struts2.dispatcher.multipart.JakartaStreamMultiPartRequest`
extends `org.apache.struts2.dispatcher.multipart.AbstractMultiPartRequest`  

**Constructors:**
- `public JakartaStreamMultiPartRequest()`

**Fields:**
- `protected java.util.Map fileInfos`
- `protected java.util.Map parameters`

**Methods:**
- `protected void addFileSkippedError(java.lang.String p0, javax.servlet.http.HttpServletRequest p1)`
- `public void cleanUp()`
- `protected void createFileInfoFromItemStream(org.apache.commons.fileupload.FileItemStream p0, java.io.File p1)`
- `protected java.io.File createTemporaryFile(java.lang.String p0, java.lang.String p1) throws java.io.IOException`
- `public java.lang.String[] getContentType(java.lang.String p0)`
- `public org.apache.struts2.dispatcher.multipart.UploadedFile[] getFile(java.lang.String p0)`
- `public java.lang.String[] getFileNames(java.lang.String p0)`
- `public java.util.Enumeration getFileParameterNames()`
- `public java.lang.String[] getFilesystemName(java.lang.String p0)`
- `public java.lang.String getParameter(java.lang.String p0)`
- `public java.util.Enumeration getParameterNames()`
- `public java.lang.String[] getParameterValues(java.lang.String p0)`
- `protected long getRequestSize(javax.servlet.http.HttpServletRequest p0)`
- `protected boolean isRequestSizePermitted(javax.servlet.http.HttpServletRequest p0)`
- `public void parse(javax.servlet.http.HttpServletRequest p0, java.lang.String p1) throws java.io.IOException`
- `protected void processFileItemStreamAsFileField(org.apache.commons.fileupload.FileItemStream p0, java.lang.String p1)`
- `protected void processFileItemStreamAsFormField(org.apache.commons.fileupload.FileItemStream p0)`
- `protected void processUpload(javax.servlet.http.HttpServletRequest p0, java.lang.String p1) throws java.lang.Exception`
- `protected boolean streamFileToDisk(org.apache.commons.fileupload.FileItemStream p0, java.io.File p1) throws java.io.IOException`

---

## public static class `org.apache.struts2.dispatcher.multipart.JakartaStreamMultiPartRequest$FileInfo`
implements `java.io.Serializable`  

**Constructors:**
- `public FileInfo(java.io.File p0, java.lang.String p1, java.lang.String p2)`

**Methods:**
- `public java.lang.String getContentType()`
- `public java.io.File getFile()`
- `public java.lang.String getOriginalName()`

---

## public abstract interface `org.apache.struts2.dispatcher.multipart.MultiPartRequest`

**Methods:**
- `public abstract void cleanUp()`
- `public abstract java.lang.String[] getContentType(java.lang.String p0)`
- `public abstract java.util.List getErrors()`
- `public abstract org.apache.struts2.dispatcher.multipart.UploadedFile[] getFile(java.lang.String p0)`
- `public abstract java.lang.String[] getFileNames(java.lang.String p0)`
- `public abstract java.util.Enumeration getFileParameterNames()`
- `public abstract java.lang.String[] getFilesystemName(java.lang.String p0)`
- `public abstract java.lang.String getParameter(java.lang.String p0)`
- `public abstract java.util.Enumeration getParameterNames()`
- `public abstract java.lang.String[] getParameterValues(java.lang.String p0)`
- `public abstract void parse(javax.servlet.http.HttpServletRequest p0, java.lang.String p1) throws java.io.IOException`

---

## public class `org.apache.struts2.dispatcher.multipart.MultiPartRequestWrapper`
extends `org.apache.struts2.dispatcher.StrutsRequestWrapper`  

**Constructors:**
- `public MultiPartRequestWrapper(org.apache.struts2.dispatcher.multipart.MultiPartRequest p0, javax.servlet.http.HttpServletRequest p1, java.lang.String p2, com.opensymphony.xwork2.LocaleProvider p3)`
- `public MultiPartRequestWrapper(org.apache.struts2.dispatcher.multipart.MultiPartRequest p0, javax.servlet.http.HttpServletRequest p1, java.lang.String p2, com.opensymphony.xwork2.LocaleProvider p3, boolean p4)`

**Fields:**
- `protected final static org.apache.logging.log4j.Logger LOG`

**Methods:**
- `protected void addError(org.apache.struts2.dispatcher.LocalizedMessage p0)`
- `protected org.apache.struts2.dispatcher.LocalizedMessage buildErrorMessage(java.lang.Throwable p0, java.lang.Object[] p1)`
- `public void cleanUp()`
- `public java.lang.String[] getContentTypes(java.lang.String p0)`
- `public java.util.Collection getErrors()`
- `public java.lang.String[] getFileNames(java.lang.String p0)`
- `public java.util.Enumeration getFileParameterNames()`
- `public java.lang.String[] getFileSystemNames(java.lang.String p0)`
- `public org.apache.struts2.dispatcher.multipart.UploadedFile[] getFiles(java.lang.String p0)`
- `public java.lang.String getParameter(java.lang.String p0)`
- `public java.util.Map getParameterMap()`
- `public java.util.Enumeration getParameterNames()`
- `public java.lang.String[] getParameterValues(java.lang.String p0)`
- `public boolean hasErrors()`
- `protected java.util.Enumeration mergeParams(java.util.Enumeration p0, java.util.Enumeration p1)`
- `protected void setLocale(javax.servlet.http.HttpServletRequest p0)`

---

## public class `org.apache.struts2.dispatcher.multipart.StrutsUploadedFile`
implements `org.apache.struts2.dispatcher.multipart.UploadedFile`  

**Constructors:**
- `public StrutsUploadedFile(java.io.File p0)`

**Methods:**
- `public boolean delete()`
- `public java.lang.String getAbsolutePath()`
- `public java.io.File getContent()`
- `public java.lang.String getName()`
- `public boolean isFile()`
- `public java.lang.Long length()`

---

## public abstract interface `org.apache.struts2.dispatcher.multipart.UploadedFile`

**Methods:**
- `public abstract boolean delete()`
- `public abstract java.lang.String getAbsolutePath()`
- `public abstract java.lang.Object getContent()`
- `public abstract java.lang.String getName()`
- `public abstract boolean isFile()`
- `public abstract java.lang.Long length()`

---

## public class `org.apache.struts2.dispatcher.servlet.ServletHostConfig`
implements `org.apache.struts2.dispatcher.HostConfig`  

**Constructors:**
- `public ServletHostConfig(javax.servlet.ServletConfig p0)`

**Methods:**
- `public java.lang.String getInitParameter(java.lang.String p0)`
- `public java.util.Iterator getInitParameterNames()`
- `public javax.servlet.ServletContext getServletContext()`

---

## public class `org.apache.struts2.dispatcher.servlet.StrutsServlet`
extends `javax.servlet.http.HttpServlet`  

**Constructors:**
- `public StrutsServlet()`

**Methods:**
- `public void destroy()`
- `public void init(javax.servlet.ServletConfig p0) throws javax.servlet.ServletException`
- `public void service(javax.servlet.http.HttpServletRequest p0, javax.servlet.http.HttpServletResponse p1) throws java.io.IOException, javax.servlet.ServletException`

---

## public class `org.apache.struts2.factory.PrefixBasedActionProxyFactory`
extends `org.apache.struts2.factory.StrutsActionProxyFactory`  
implements `com.opensymphony.xwork2.inject.Initializable`  

**Constructors:**
- `public PrefixBasedActionProxyFactory()`

**Methods:**
- `public com.opensymphony.xwork2.ActionProxy createActionProxy(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.Map p3, boolean p4, boolean p5)`
- `public void init()`
- `public void setContainer(com.opensymphony.xwork2.inject.Container p0)`
- `public void setPrefixBasedActionProxyFactories(java.lang.String p0)`

---

## public class `org.apache.struts2.factory.StrutsActionProxy`
extends `com.opensymphony.xwork2.DefaultActionProxy`  

**Constructors:**
- `public StrutsActionProxy(com.opensymphony.xwork2.ActionInvocation p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4, boolean p5)`

**Methods:**
- `public java.lang.String execute() throws java.lang.Exception`
- `protected java.lang.String getErrorMessage()`
- `protected void prepare()`

---

## public class `org.apache.struts2.factory.StrutsActionProxyFactory`
extends `com.opensymphony.xwork2.DefaultActionProxyFactory`  

**Constructors:**
- `public StrutsActionProxyFactory()`

**Methods:**
- `public com.opensymphony.xwork2.ActionProxy createActionProxy(com.opensymphony.xwork2.ActionInvocation p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4, boolean p5)`

---

## public class `org.apache.struts2.factory.StrutsResultFactory`
implements `com.opensymphony.xwork2.factory.ResultFactory`  

**Constructors:**
- `public StrutsResultFactory()`

**Fields:**
- `protected com.opensymphony.xwork2.ObjectFactory objectFactory`
- `protected com.opensymphony.xwork2.util.reflection.ReflectionProvider reflectionProvider`

**Methods:**
- `public com.opensymphony.xwork2.Result buildResult(com.opensymphony.xwork2.config.entities.ResultConfig p0, java.util.Map p1) throws java.lang.Exception`
- `public void setObjectFactory(com.opensymphony.xwork2.ObjectFactory p0)`
- `protected void setParameter(com.opensymphony.xwork2.Result p0, java.lang.String p1, java.lang.String p2, java.util.Map p3)`
- `protected void setParameters(java.util.Map p0, com.opensymphony.xwork2.Result p1, java.util.Map p2)`
- `public void setReflectionProvider(com.opensymphony.xwork2.util.reflection.ReflectionProvider p0)`

---

## public class `org.apache.struts2.interceptor.ActionMappingParametersInterceptor`
extends `com.opensymphony.xwork2.interceptor.ParametersInterceptor`  

**Constructors:**
- `public ActionMappingParametersInterceptor()`

**Methods:**
- `protected void addParametersToContext(com.opensymphony.xwork2.ActionContext p0, java.util.Map p1)`
- `protected org.apache.struts2.dispatcher.HttpParameters retrieveParameters(com.opensymphony.xwork2.ActionContext p0)`

---

## public abstract interface `org.apache.struts2.interceptor.ApplicationAware`

**Methods:**
- `public abstract void setApplication(java.util.Map p0)`

---

## public class `org.apache.struts2.interceptor.BackgroundProcess`
implements `java.io.Serializable`  

**Constructors:**
- `public BackgroundProcess(java.lang.String p0, com.opensymphony.xwork2.ActionInvocation p1, int p2)`

**Fields:**
- `protected boolean done`
- `protected transient java.lang.Exception exception`
- `protected transient com.opensymphony.xwork2.ActionInvocation invocation`
- `protected java.lang.String result`

**Methods:**
- `protected void afterInvocation() throws java.lang.Exception`
- `protected void beforeInvocation() throws java.lang.Exception`
- `public java.lang.Object getAction()`
- `public java.lang.Exception getException()`
- `public com.opensymphony.xwork2.ActionInvocation getInvocation()`
- `public java.lang.String getResult()`
- `public boolean isDone()`

---

## public class `org.apache.struts2.interceptor.CheckboxInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public CheckboxInterceptor()`

**Methods:**
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `public void setUncheckedValue(java.lang.String p0)`

---

## public class `org.apache.struts2.interceptor.ClearSessionInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public ClearSessionInterceptor()`

**Methods:**
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`

---

## public class `org.apache.struts2.interceptor.CookieInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public CookieInterceptor()`

**Methods:**
- `protected void injectIntoCookiesAwareAction(java.lang.Object p0, java.util.Map p1)`
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `protected boolean isAcceptableName(java.lang.String p0)`
- `protected boolean isAccepted(java.lang.String p0)`
- `protected boolean isExcluded(java.lang.String p0)`
- `protected void populateCookieValueIntoStack(java.lang.String p0, java.lang.String p1, java.util.Map p2, com.opensymphony.xwork2.util.ValueStack p3)`
- `public void setAcceptCookieNames(java.lang.String p0)`
- `public void setAcceptedPatternsChecker(com.opensymphony.xwork2.security.AcceptedPatternsChecker p0)`
- `public void setCookiesName(java.lang.String p0)`
- `public void setCookiesValue(java.lang.String p0)`
- `public void setExcludedPatternsChecker(com.opensymphony.xwork2.security.ExcludedPatternsChecker p0)`

---

## public abstract interface `org.apache.struts2.interceptor.CookieProvider`

**Methods:**
- `public abstract java.util.Set getCookies()`

---

## public class `org.apache.struts2.interceptor.CookieProviderInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  
implements `com.opensymphony.xwork2.interceptor.PreResultListener`  

**Constructors:**
- `public CookieProviderInterceptor()`

**Methods:**
- `protected void addCookiesToResponse(org.apache.struts2.interceptor.CookieProvider p0, javax.servlet.http.HttpServletResponse p1)`
- `public void beforeResult(com.opensymphony.xwork2.ActionInvocation p0, java.lang.String p1)`
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`

---

## public abstract interface `org.apache.struts2.interceptor.CookiesAware`

**Methods:**
- `public abstract void setCookiesMap(java.util.Map p0)`

---

## public class `org.apache.struts2.interceptor.CreateSessionInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public CreateSessionInterceptor()`

**Methods:**
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`

---

## public class `org.apache.struts2.interceptor.DateTextFieldInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public DateTextFieldInterceptor()`

**Methods:**
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`

---

## public final static enum `org.apache.struts2.interceptor.DateTextFieldInterceptor$DateWord`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.apache.struts2.interceptor.DateTextFieldInterceptor$DateWord H`
- `public final static org.apache.struts2.interceptor.DateTextFieldInterceptor$DateWord M`
- `public final static org.apache.struts2.interceptor.DateTextFieldInterceptor$DateWord S`
- `public final static org.apache.struts2.interceptor.DateTextFieldInterceptor$DateWord d`
- `public final static org.apache.struts2.interceptor.DateTextFieldInterceptor$DateWord m`
- `public final static org.apache.struts2.interceptor.DateTextFieldInterceptor$DateWord s`
- `public final static org.apache.struts2.interceptor.DateTextFieldInterceptor$DateWord y`

**Methods:**
- `public static org.apache.struts2.interceptor.DateTextFieldInterceptor$DateWord get(java.lang.Character p0)`
- `public static org.apache.struts2.interceptor.DateTextFieldInterceptor$DateWord[] getAll()`
- `public java.lang.String getDateType()`
- `public java.lang.String getDescription()`
- `public java.lang.Integer getLength()`

---

## public class `org.apache.struts2.interceptor.ExecuteAndWaitInterceptor`
extends `com.opensymphony.xwork2.interceptor.MethodFilterInterceptor`  

**Constructors:**
- `public ExecuteAndWaitInterceptor()`

**Fields:**
- `public final static java.lang.String KEY`
- `public final static java.lang.String WAIT`
- `protected int delay`
- `protected int delaySleepInterval`
- `protected boolean executeAfterValidationPass`

**Methods:**
- `protected java.lang.String doIntercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `protected java.lang.String getBackgroundProcessName(com.opensymphony.xwork2.ActionProxy p0)`
- `protected org.apache.struts2.interceptor.BackgroundProcess getNewBackgroundProcess(java.lang.String p0, com.opensymphony.xwork2.ActionInvocation p1, int p2)`
- `protected void performInitialDelay(org.apache.struts2.interceptor.BackgroundProcess p0) throws java.lang.InterruptedException`
- `public void setContainer(com.opensymphony.xwork2.inject.Container p0)`
- `public void setDelay(int p0)`
- `public void setDelaySleepInterval(int p0)`
- `public void setExecuteAfterValidationPass(boolean p0)`
- `public void setThreadPriority(int p0)`

---

## public class `org.apache.struts2.interceptor.FileUploadInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public FileUploadInterceptor()`

**Fields:**
- `protected final static org.apache.logging.log4j.Logger LOG`
- `protected java.util.Set allowedExtensionsSet`
- `protected java.util.Set allowedTypesSet`
- `protected java.lang.Long maximumSize`

**Methods:**
- `protected boolean acceptFile(java.lang.Object p0, org.apache.struts2.dispatcher.multipart.UploadedFile p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, com.opensymphony.xwork2.interceptor.ValidationAware p5)`
- `protected java.lang.String getTextMessage(java.lang.Object p0, java.lang.String p1, java.lang.String[] p2)`
- `protected java.lang.String getTextMessage(java.lang.String p0, java.lang.String[] p1)`
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `public void setAllowedExtensions(java.lang.String p0)`
- `public void setAllowedTypes(java.lang.String p0)`
- `public void setContainer(com.opensymphony.xwork2.inject.Container p0)`
- `public void setMatcher(org.apache.struts2.util.ContentTypeMatcher p0)`
- `public void setMaximumSize(java.lang.Long p0)`

---

## public abstract interface `org.apache.struts2.interceptor.HttpParametersAware`

**Methods:**
- `public abstract void setParameters(org.apache.struts2.dispatcher.HttpParameters p0)`

---

## public class `org.apache.struts2.interceptor.I18nInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public I18nInterceptor()`

**Fields:**
- `public final static java.lang.String DEFAULT_COOKIE_ATTRIBUTE`
- `public final static java.lang.String DEFAULT_COOKIE_PARAMETER`
- `public final static java.lang.String DEFAULT_PARAMETER`
- `public final static java.lang.String DEFAULT_REQUEST_ONLY_PARAMETER`
- `public final static java.lang.String DEFAULT_SESSION_ATTRIBUTE`
- `protected java.lang.String attributeName`
- `protected com.opensymphony.xwork2.LocaleProviderFactory localeProviderFactory`
- `protected java.lang.String parameterName`
- `protected java.lang.String requestCookieParameterName`
- `protected java.lang.String requestOnlyParameterName`
- `protected org.apache.struts2.interceptor.I18nInterceptor$Storage storage`

**Methods:**
- `protected org.apache.struts2.dispatcher.Parameter findLocaleParameter(com.opensymphony.xwork2.ActionInvocation p0, java.lang.String p1)`
- `protected java.util.Locale getLocaleFromParam(java.lang.Object p0)`
- `protected org.apache.struts2.interceptor.I18nInterceptor$LocaleHandler getLocaleHandler(com.opensymphony.xwork2.ActionInvocation p0)`
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `public void setAttributeName(java.lang.String p0)`
- `public void setLocaleProviderFactory(com.opensymphony.xwork2.LocaleProviderFactory p0)`
- `public void setLocaleStorage(java.lang.String p0)`
- `public void setParameterName(java.lang.String p0)`
- `public void setRequestCookieParameterName(java.lang.String p0)`
- `public void setRequestOnlyParameterName(java.lang.String p0)`
- `protected void useLocale(com.opensymphony.xwork2.ActionInvocation p0, java.util.Locale p1)`

---

## protected class `org.apache.struts2.interceptor.I18nInterceptor$CookieLocaleHandler`
extends `org.apache.struts2.interceptor.I18nInterceptor$RequestOnlyLocaleHandler`  

**Constructors:**
- `protected CookieLocaleHandler(com.opensymphony.xwork2.ActionInvocation p0)`

**Methods:**
- `public java.util.Locale find()`
- `public java.util.Locale read(com.opensymphony.xwork2.ActionInvocation p0)`
- `public java.util.Locale store(com.opensymphony.xwork2.ActionInvocation p0, java.util.Locale p1)`

---

## protected abstract static interface `org.apache.struts2.interceptor.I18nInterceptor$LocaleHandler`

**Methods:**
- `public abstract java.util.Locale find()`
- `public abstract java.util.Locale read(com.opensymphony.xwork2.ActionInvocation p0)`
- `public abstract boolean shouldStore()`
- `public abstract java.util.Locale store(com.opensymphony.xwork2.ActionInvocation p0, java.util.Locale p1)`

---

## protected class `org.apache.struts2.interceptor.I18nInterceptor$RequestOnlyLocaleHandler`
implements `org.apache.struts2.interceptor.I18nInterceptor$LocaleHandler`  

**Constructors:**
- `protected RequestOnlyLocaleHandler(com.opensymphony.xwork2.ActionInvocation p0)`

**Fields:**
- `protected com.opensymphony.xwork2.ActionInvocation actionInvocation`
- `protected boolean shouldStore`

**Methods:**
- `public java.util.Locale find()`
- `public java.util.Locale read(com.opensymphony.xwork2.ActionInvocation p0)`
- `public boolean shouldStore()`
- `public java.util.Locale store(com.opensymphony.xwork2.ActionInvocation p0, java.util.Locale p1)`

---

## protected class `org.apache.struts2.interceptor.I18nInterceptor$SessionLocaleHandler`
extends `org.apache.struts2.interceptor.I18nInterceptor$RequestOnlyLocaleHandler`  

**Constructors:**
- `protected SessionLocaleHandler(com.opensymphony.xwork2.ActionInvocation p0)`

**Methods:**
- `public java.util.Locale find()`
- `public java.util.Locale read(com.opensymphony.xwork2.ActionInvocation p0)`
- `public java.util.Locale store(com.opensymphony.xwork2.ActionInvocation p0, java.util.Locale p1)`

---

## protected final static enum `org.apache.struts2.interceptor.I18nInterceptor$Storage`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.apache.struts2.interceptor.I18nInterceptor$Storage COOKIE`
- `public final static org.apache.struts2.interceptor.I18nInterceptor$Storage NONE`
- `public final static org.apache.struts2.interceptor.I18nInterceptor$Storage SESSION`

---

## public class `org.apache.struts2.interceptor.MessageStoreInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public MessageStoreInterceptor()`

**Fields:**
- `public final static java.lang.String AUTOMATIC_MODE`
- `public final static java.lang.String NONE`
- `public final static java.lang.String RETRIEVE_MODE`
- `public final static java.lang.String STORE_MODE`
- `public final static java.lang.String actionErrorsSessionKey`
- `public final static java.lang.String actionMessagesSessionKey`
- `public final static java.lang.String fieldErrorsSessionKey`

**Methods:**
- `protected void before(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `protected org.apache.struts2.interceptor.MessageStorePreResultListener createPreResultListener(com.opensymphony.xwork2.ActionInvocation p0)`
- `public boolean getAllowRequestParameterSwitch()`
- `public java.lang.String getOperationModel()`
- `protected java.lang.String getRequestOperationMode(com.opensymphony.xwork2.ActionInvocation p0)`
- `public java.lang.String getRequestParameterSwitch()`
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `protected java.util.Collection mergeCollection(java.util.Collection p0, java.util.Collection p1)`
- `protected java.util.Map mergeMap(java.util.Map p0, java.util.Map p1)`
- `public void setAllowRequestParameterSwitch(boolean p0)`
- `public void setOperationMode(java.lang.String p0)`
- `public void setRequestParameterSwitch(java.lang.String p0)`

---

## public class `org.apache.struts2.interceptor.MessageStorePreResultListener`
implements `com.opensymphony.xwork2.interceptor.PreResultListener`  

**Constructors:**
- `public MessageStorePreResultListener()`

**Fields:**
- `protected org.apache.struts2.interceptor.MessageStoreInterceptor interceptor`

**Methods:**
- `public void beforeResult(com.opensymphony.xwork2.ActionInvocation p0, java.lang.String p1)`
- `public void init(org.apache.struts2.interceptor.MessageStoreInterceptor p0)`
- `protected boolean isCommitted()`
- `protected boolean isInvalidated()`
- `protected boolean isRedirect(com.opensymphony.xwork2.ActionInvocation p0, java.lang.String p1)`

---

## public class `org.apache.struts2.interceptor.MultiselectInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public MultiselectInterceptor()`

**Methods:**
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`

---

## public class `org.apache.struts2.interceptor.NoOpInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public NoOpInterceptor()`

**Methods:**
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`

---

## public abstract interface `org.apache.struts2.interceptor.NoParameters`
implements `com.opensymphony.xwork2.interceptor.NoParameters`  

---

## public abstract interface `org.apache.struts2.interceptor.ParameterAware`
annotations: @java.lang.Deprecated  

**Methods:**
- `public abstract void setParameters(java.util.Map p0)`

---

## public abstract interface `org.apache.struts2.interceptor.PrincipalAware`

**Methods:**
- `public abstract void setPrincipalProxy(org.apache.struts2.interceptor.PrincipalProxy p0)`

---

## public abstract interface `org.apache.struts2.interceptor.PrincipalProxy`

**Methods:**
- `public abstract java.lang.String getRemoteUser()`
- `public abstract java.security.Principal getUserPrincipal()`
- `public abstract boolean isRequestSecure()`
- `public abstract boolean isUserInRole(java.lang.String p0)`

---

## public class `org.apache.struts2.interceptor.ProfilingActivationInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public ProfilingActivationInterceptor()`

**Methods:**
- `public java.lang.String getProfilingKey()`
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `public void setDevMode(java.lang.String p0)`
- `public void setProfilingKey(java.lang.String p0)`

---

## public abstract interface `org.apache.struts2.interceptor.RequestAware`

**Methods:**
- `public abstract void setRequest(java.util.Map p0)`

---

## public class `org.apache.struts2.interceptor.RolesInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public RolesInterceptor()`

**Fields:**
- `protected java.util.List allowedRoles`
- `protected java.util.List disallowedRoles`

**Methods:**
- `protected boolean areRolesValid(java.util.List p0)`
- `protected java.lang.String handleRejection(com.opensymphony.xwork2.ActionInvocation p0, javax.servlet.http.HttpServletResponse p1) throws java.lang.Exception`
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `protected boolean isAllowed(javax.servlet.http.HttpServletRequest p0, java.lang.Object p1)`
- `public void setAllowedRoles(java.lang.String p0)`
- `public void setDisallowedRoles(java.lang.String p0)`
- `protected java.util.List stringToList(java.lang.String p0)`

---

## public class `org.apache.struts2.interceptor.ScopeInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  
implements `com.opensymphony.xwork2.interceptor.PreResultListener`  

**Constructors:**
- `public ScopeInterceptor()`

**Methods:**
- `protected void after(com.opensymphony.xwork2.ActionInvocation p0, java.lang.String p1) throws java.lang.Exception`
- `protected void before(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `public void beforeResult(com.opensymphony.xwork2.ActionInvocation p0, java.lang.String p1)`
- `public java.lang.String getSessionReset()`
- `public java.lang.String getType()`
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `public boolean isReset()`
- `public void setApplication(java.lang.String p0)`
- `public void setAutoCreateSession(java.lang.String p0)`
- `public void setKey(java.lang.String p0)`
- `public void setReset(boolean p0)`
- `public void setSession(java.lang.String p0)`
- `public void setSessionReset(java.lang.String p0)`
- `public void setType(java.lang.String p0)`

---

## public class `org.apache.struts2.interceptor.ServletConfigInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  
implements `org.apache.struts2.StrutsStatics`  

**Constructors:**
- `public ServletConfigInterceptor()`

**Methods:**
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`

---

## public abstract interface `org.apache.struts2.interceptor.ServletRequestAware`

**Methods:**
- `public abstract void setServletRequest(javax.servlet.http.HttpServletRequest p0)`

---

## public abstract interface `org.apache.struts2.interceptor.ServletResponseAware`

**Methods:**
- `public abstract void setServletResponse(javax.servlet.http.HttpServletResponse p0)`

---

## public abstract interface `org.apache.struts2.interceptor.SessionAware`

**Methods:**
- `public abstract void setSession(java.util.Map p0)`

---

## public class `org.apache.struts2.interceptor.StrutsConversionErrorInterceptor`
extends `com.opensymphony.xwork2.interceptor.ConversionErrorInterceptor`  

**Constructors:**
- `public StrutsConversionErrorInterceptor()`

**Methods:**
- `protected java.lang.Object getOverrideExpr(com.opensymphony.xwork2.ActionInvocation p0, java.lang.Object p1)`
- `protected boolean shouldAddError(java.lang.String p0, java.lang.Object p1)`

---

## public class `org.apache.struts2.interceptor.TokenInterceptor`
extends `com.opensymphony.xwork2.interceptor.MethodFilterInterceptor`  

**Constructors:**
- `public TokenInterceptor()`

**Fields:**
- `public final static java.lang.String INVALID_TOKEN_CODE`

**Methods:**
- `protected java.lang.String doIntercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `protected java.lang.String getErrorMessage(com.opensymphony.xwork2.ActionInvocation p0)`
- `protected java.lang.String handleInvalidToken(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `protected java.lang.String handleToken(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `protected java.lang.String handleValidToken(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `public void setTextProviderFactory(com.opensymphony.xwork2.TextProviderFactory p0)`

---

## public class `org.apache.struts2.interceptor.TokenSessionStoreInterceptor`
extends `org.apache.struts2.interceptor.TokenInterceptor`  

**Constructors:**
- `public TokenSessionStoreInterceptor()`

**Methods:**
- `protected java.lang.String handleInvalidToken(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `protected java.lang.String handleToken(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `protected java.lang.String handleValidToken(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`

---

## public class `org.apache.struts2.interceptor.debugging.DebuggingInterceptor`
extends `com.opensymphony.xwork2.interceptor.AbstractInterceptor`  

**Constructors:**
- `public DebuggingInterceptor()`

**Methods:**
- `public java.lang.String intercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `protected void printContext()`
- `protected void printContext(org.apache.struts2.interceptor.debugging.PrettyPrintWriter p0)`
- `protected void serializeIt(java.lang.Object p0, java.lang.String p1, org.apache.struts2.interceptor.debugging.PrettyPrintWriter p2, java.util.List p3)`
- `public void setDevMode(java.lang.String p0)`
- `public void setEnableXmlWithConsole(boolean p0)`
- `public void setFreemarkerManager(org.apache.struts2.views.freemarker.FreemarkerManager p0)`
- `public void setReflectionProvider(com.opensymphony.xwork2.util.reflection.ReflectionProvider p0)`

---

## public class `org.apache.struts2.interceptor.debugging.PrettyPrintWriter`

**Constructors:**
- `public PrettyPrintWriter(java.io.Writer p0)`
- `public PrettyPrintWriter(java.io.Writer p0, char[] p1)`
- `public PrettyPrintWriter(java.io.Writer p0, char[] p1, java.lang.String p2)`
- `public PrettyPrintWriter(java.io.Writer p0, java.lang.String p1)`
- `public PrettyPrintWriter(java.io.Writer p0, java.lang.String p1, java.lang.String p2)`

**Methods:**
- `public void addAttribute(java.lang.String p0, java.lang.String p1)`
- `public void close()`
- `public void endNode()`
- `protected void endOfLine()`
- `public void flush()`
- `public boolean isEscape()`
- `public void setEscape(boolean p0)`
- `public void setValue(java.lang.String p0)`
- `public void startNode(java.lang.String p0)`
- `protected void writeAttributeValue(java.io.PrintWriter p0, java.lang.String p1)`
- `protected void writeText(java.io.PrintWriter p0, java.lang.String p1)`

---

## public class `org.apache.struts2.interceptor.servlet.ServletPrincipalProxy`
implements `org.apache.struts2.interceptor.PrincipalProxy`  

**Constructors:**
- `public ServletPrincipalProxy(javax.servlet.http.HttpServletRequest p0)`

**Methods:**
- `public java.lang.String getRemoteUser()`
- `public java.security.Principal getUserPrincipal()`
- `public boolean isRequestSecure()`
- `public boolean isUserInRole(java.lang.String p0)`

---

## public class `org.apache.struts2.interceptor.validation.AnnotationValidationInterceptor`
extends `com.opensymphony.xwork2.validator.ValidationInterceptor`  

**Constructors:**
- `public AnnotationValidationInterceptor()`

**Methods:**
- `protected java.lang.String doIntercept(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `protected java.lang.reflect.Method getActionMethod(java.lang.Class p0, java.lang.String p1)`

---

## public abstract interface `org.apache.struts2.interceptor.validation.SkipValidation`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public class `org.apache.struts2.result.HttpHeaderResult`
implements `com.opensymphony.xwork2.Result`  

**Constructors:**
- `public HttpHeaderResult()`
- `public HttpHeaderResult(int p0)`

**Fields:**
- `public final static java.lang.String DEFAULT_PARAM`

**Methods:**
- `public void addHeader(java.lang.String p0, java.lang.String p1)`
- `public void execute(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `public java.util.Map getHeaders()`
- `public int getStatus()`
- `public void setError(java.lang.String p0)`
- `public void setErrorMessage(java.lang.String p0)`
- `public void setParse(boolean p0)`
- `public void setStatus(int p0)`

---

## public class `org.apache.struts2.result.PlainTextResult`
extends `org.apache.struts2.result.StrutsResultSupport`  

**Constructors:**
- `public PlainTextResult()`
- `public PlainTextResult(java.lang.String p0)`

**Fields:**
- `public final static int BUFFER_SIZE`

**Methods:**
- `protected java.lang.String adjustLocation(java.lang.String p0)`
- `protected void applyAdditionalHeaders(javax.servlet.http.HttpServletResponse p0)`
- `protected void applyCharset(java.nio.charset.Charset p0, javax.servlet.http.HttpServletResponse p1)`
- `protected void doExecute(java.lang.String p0, com.opensymphony.xwork2.ActionInvocation p1) throws java.lang.Exception`
- `public java.lang.String getCharSet()`
- `protected void logWrongStream(java.lang.String p0, java.io.InputStream p1)`
- `protected java.nio.charset.Charset readCharset()`
- `protected java.io.InputStream readStream(com.opensymphony.xwork2.ActionInvocation p0, java.lang.String p1)`
- `protected void sendStream(java.io.PrintWriter p0, java.io.InputStreamReader p1) throws java.io.IOException`
- `public void setCharSet(java.lang.String p0)`

---

## public class `org.apache.struts2.result.PostbackResult`
extends `org.apache.struts2.result.StrutsResultSupport`  

**Constructors:**
- `public PostbackResult()`

**Fields:**
- `protected org.apache.struts2.dispatcher.mapper.ActionMapper actionMapper`

**Methods:**
- `protected void doExecute(java.lang.String p0, com.opensymphony.xwork2.ActionInvocation p1) throws java.lang.Exception`
- `public void execute(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `protected boolean isElementIncluded(java.lang.String p0, java.lang.String[] p1)`
- `protected java.lang.String makePostbackUri(com.opensymphony.xwork2.ActionInvocation p0)`
- `public final void setActionMapper(org.apache.struts2.dispatcher.mapper.ActionMapper p0)`
- `public final void setActionName(java.lang.String p0)`
- `public final void setCache(boolean p0)`
- `public final void setMethod(java.lang.String p0)`
- `public final void setNamespace(java.lang.String p0)`
- `public final void setPrependServletContext(boolean p0)`
- `protected void writeFormElement(java.io.PrintWriter p0, java.lang.String p1, java.lang.String[] p2) throws java.io.UnsupportedEncodingException`
- `protected void writePrologueScript(java.io.PrintWriter p0)`

---

## public abstract interface `org.apache.struts2.result.Redirectable`

---

## public class `org.apache.struts2.result.ServletActionRedirectResult`
extends `org.apache.struts2.result.ServletRedirectResult`  
implements `com.opensymphony.xwork2.util.reflection.ReflectionExceptionHandler`, `org.apache.struts2.result.Redirectable`  

**Constructors:**
- `public ServletActionRedirectResult()`
- `public ServletActionRedirectResult(java.lang.String p0)`
- `public ServletActionRedirectResult(java.lang.String p0, java.lang.String p1)`
- `public ServletActionRedirectResult(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public ServletActionRedirectResult(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3)`

**Fields:**
- `public final static java.lang.String DEFAULT_PARAM`
- `protected java.lang.String actionName`
- `protected java.lang.String method`
- `protected java.lang.String namespace`

**Methods:**
- `public void execute(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `protected java.util.List getProhibitedResultParams()`
- `public void setActionName(java.lang.String p0)`
- `public void setMethod(java.lang.String p0)`
- `public void setNamespace(java.lang.String p0)`

---

## public class `org.apache.struts2.result.ServletDispatcherResult`
extends `org.apache.struts2.result.StrutsResultSupport`  

**Constructors:**
- `public ServletDispatcherResult()`
- `public ServletDispatcherResult(java.lang.String p0)`

**Methods:**
- `public void doExecute(java.lang.String p0, com.opensymphony.xwork2.ActionInvocation p1) throws java.lang.Exception`
- `protected org.apache.struts2.dispatcher.HttpParameters getParameters(com.opensymphony.xwork2.ActionInvocation p0)`
- `public void setUrlHelper(org.apache.struts2.views.util.UrlHelper p0)`

---

## public class `org.apache.struts2.result.ServletRedirectResult`
extends `org.apache.struts2.result.StrutsResultSupport`  
implements `com.opensymphony.xwork2.util.reflection.ReflectionExceptionHandler`, `org.apache.struts2.result.Redirectable`  

**Constructors:**
- `public ServletRedirectResult()`
- `public ServletRedirectResult(java.lang.String p0)`
- `public ServletRedirectResult(java.lang.String p0, java.lang.String p1)`

**Fields:**
- `protected org.apache.struts2.dispatcher.mapper.ActionMapper actionMapper`
- `protected java.lang.String anchor`
- `protected boolean prependServletContext`
- `protected java.util.Map requestParameters`
- `protected int statusCode`
- `protected boolean suppressEmptyParameters`

**Methods:**
- `public org.apache.struts2.result.ServletRedirectResult addParameter(java.lang.String p0, java.lang.Object p1)`
- `protected void doExecute(java.lang.String p0, com.opensymphony.xwork2.ActionInvocation p1) throws java.lang.Exception`
- `public void execute(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `protected java.util.List getProhibitedResultParams()`
- `public void handle(com.opensymphony.xwork2.util.reflection.ReflectionException p0)`
- `protected boolean isPathUrl(java.lang.String p0)`
- `protected void sendRedirect(javax.servlet.http.HttpServletResponse p0, java.lang.String p1) throws java.io.IOException`
- `public void setActionMapper(org.apache.struts2.dispatcher.mapper.ActionMapper p0)`
- `public void setAnchor(java.lang.String p0)`
- `public void setPrependServletContext(boolean p0)`
- `public void setStatusCode(int p0)`
- `public void setSuppressEmptyParameters(boolean p0)`
- `public void setUrlHelper(org.apache.struts2.views.util.UrlHelper p0)`

---

## public class `org.apache.struts2.result.StreamResult`
extends `org.apache.struts2.result.StrutsResultSupport`  

**Constructors:**
- `public StreamResult()`
- `public StreamResult(java.io.InputStream p0)`

**Fields:**
- `public final static java.lang.String DEFAULT_PARAM`
- `protected final static org.apache.logging.log4j.Logger LOG`
- `protected boolean allowCaching`
- `protected int bufferSize`
- `protected java.lang.String contentCharSet`
- `protected java.lang.String contentDisposition`
- `protected java.lang.String contentLength`
- `protected java.lang.String contentType`
- `protected java.lang.String inputName`
- `protected java.io.InputStream inputStream`

**Methods:**
- `protected void doExecute(java.lang.String p0, com.opensymphony.xwork2.ActionInvocation p1) throws java.lang.Exception`
- `public boolean getAllowCaching()`
- `public int getBufferSize()`
- `public java.lang.String getContentCharSet()`
- `public java.lang.String getContentDisposition()`
- `public java.lang.String getContentLength()`
- `public java.lang.String getContentType()`
- `public java.lang.String getInputName()`
- `public void setAllowCaching(boolean p0)`
- `public void setBufferSize(int p0)`
- `public void setContentCharSet(java.lang.String p0)`
- `public void setContentDisposition(java.lang.String p0)`
- `public void setContentLength(java.lang.String p0)`
- `public void setContentType(java.lang.String p0)`
- `public void setInputName(java.lang.String p0)`

---

## public abstract class `org.apache.struts2.result.StrutsResultSupport`
implements `com.opensymphony.xwork2.Result`, `org.apache.struts2.StrutsStatics`  

**Constructors:**
- `public StrutsResultSupport()`
- `public StrutsResultSupport(java.lang.String p0)`
- `public StrutsResultSupport(java.lang.String p0, boolean p1, boolean p2)`

**Fields:**
- `public final static java.lang.String DEFAULT_PARAM`
- `public final static java.lang.String DEFAULT_URL_ENCODING`
- `protected boolean parseLocation`

**Methods:**
- `protected java.lang.String conditionalParse(java.lang.String p0, com.opensymphony.xwork2.ActionInvocation p1)`
- `protected java.util.Collection conditionalParseCollection(java.lang.String p0, com.opensymphony.xwork2.ActionInvocation p1, boolean p2)`
- `protected abstract void doExecute(java.lang.String p0, com.opensymphony.xwork2.ActionInvocation p1) throws java.lang.Exception`
- `public void execute(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `public java.lang.String getLastFinalLocation()`
- `public java.lang.String getLocation()`
- `public void setEncode(boolean p0)`
- `public void setLocation(java.lang.String p0)`
- `public void setParse(boolean p0)`

---

## public class `org.apache.struts2.result.VelocityResult`
extends `org.apache.struts2.result.StrutsResultSupport`  

**Constructors:**
- `public VelocityResult()`
- `public VelocityResult(java.lang.String p0)`

**Methods:**
- `protected org.apache.velocity.context.Context createContext(org.apache.struts2.views.velocity.VelocityManager p0, com.opensymphony.xwork2.util.ValueStack p1, javax.servlet.http.HttpServletRequest p2, javax.servlet.http.HttpServletResponse p3, java.lang.String p4)`
- `public void doExecute(java.lang.String p0, com.opensymphony.xwork2.ActionInvocation p1) throws java.lang.Exception`
- `protected java.lang.String getContentType(java.lang.String p0)`
- `protected java.lang.String getEncoding(java.lang.String p0)`
- `protected org.apache.velocity.Template getTemplate(com.opensymphony.xwork2.util.ValueStack p0, org.apache.velocity.app.VelocityEngine p1, com.opensymphony.xwork2.ActionInvocation p2, java.lang.String p3, java.lang.String p4) throws java.lang.Exception`
- `public void setDefaultEncoding(java.lang.String p0)`
- `public void setVelocityManager(org.apache.struts2.views.velocity.VelocityManager p0)`

---

## public class `org.apache.struts2.util.AppendIteratorFilter`
extends `org.apache.struts2.util.IteratorFilterSupport`  
implements `com.opensymphony.xwork2.Action`, `java.util.Iterator`  

**Constructors:**
- `public AppendIteratorFilter()`

**Methods:**
- `public java.lang.String execute()`
- `public boolean hasNext()`
- `public java.lang.Object next()`
- `public void remove()`
- `public void setSource(java.lang.Object p0)`

---

## public class `org.apache.struts2.util.AttributeMap`
implements `java.util.Map`  

**Constructors:**
- `public AttributeMap(java.util.Map p0)`

**Fields:**
- `protected final static java.lang.String UNSUPPORTED`

**Methods:**
- `public void clear()`
- `public boolean containsKey(java.lang.Object p0)`
- `public boolean containsValue(java.lang.Object p0)`
- `public java.util.Set entrySet()`
- `public java.lang.Object get(java.lang.Object p0)`
- `public boolean isEmpty()`
- `public java.util.Set keySet()`
- `public java.lang.Object put(java.lang.Object p0, java.lang.Object p1)`
- `public void putAll(java.util.Map p0)`
- `public java.lang.Object remove(java.lang.Object p0)`
- `public int size()`
- `public java.lang.String toString()`
- `public java.util.Collection values()`

---

## public class `org.apache.struts2.util.ComponentUtils`

**Constructors:**
- `public ComponentUtils()`

**Methods:**
- `public static boolean altSyntax(com.opensymphony.xwork2.util.ValueStack p0)`
- `public static boolean containsExpression(java.lang.String p0)`
- `public static boolean isExpression(java.lang.String p0)`
- `public static java.lang.String stripExpressionIfAltSyntax(com.opensymphony.xwork2.util.ValueStack p0, java.lang.String p1)`

---

## public class `org.apache.struts2.util.ContainUtil`

**Constructors:**
- `public ContainUtil()`

**Methods:**
- `public static boolean contains(java.lang.Object p0, java.lang.Object p1)`

---

## public abstract interface `org.apache.struts2.util.ContentTypeMatcher`<E extends java.lang.Object>

**Methods:**
- `public abstract E compilePattern(java.lang.String p0)`
- `public abstract boolean match(java.util.Map p0, java.lang.String p1, E p2)`

---

## public class `org.apache.struts2.util.Counter`
implements `java.io.Serializable`, `java.util.Iterator`  

**Constructors:**
- `public Counter()`

**Methods:**
- `public long getCurrent()`
- `public long getFirst()`
- `public long getInterval()`
- `public long getLast()`
- `public long getNext()`
- `public long getPrevious()`
- `public boolean hasNext()`
- `public boolean isWrap()`
- `public java.lang.Object next()`
- `public void remove()`
- `public void setAdd(long p0)`
- `public void setCurrent(long p0)`
- `public void setFirst(long p0)`
- `public void setInterval(long p0)`
- `public void setLast(long p0)`
- `public void setWrap(boolean p0)`

---

## public class `org.apache.struts2.util.DateFormatter`

**Constructors:**
- `public DateFormatter()`

**Methods:**
- `public java.util.Date getDate()`
- `public java.lang.String getFormattedDate()`
- `public void setDate(int p0)`
- `public void setDate(java.lang.String p0)`
- `public void setDate(java.util.Date p0)`
- `public void setFormat(java.lang.String p0)`
- `public void setFormat(java.text.DateFormat p0)`
- `public void setParseFormat(java.lang.String p0)`
- `public void setParser(java.text.DateFormat p0)`
- `public void setTime(long p0)`

---

## public class `org.apache.struts2.util.DefaultContentTypeMatcher`
implements `org.apache.struts2.util.ContentTypeMatcher<int[]>`  

**Constructors:**
- `public DefaultContentTypeMatcher()`

**Methods:**
- `public int[] compilePattern(java.lang.String p0)`
- `public boolean match(java.util.Map p0, java.lang.String p1, int[] p2)`

---

## public class `org.apache.struts2.util.FastByteArrayOutputStream`
extends `java.io.OutputStream`  

**Constructors:**
- `public FastByteArrayOutputStream()`
- `public FastByteArrayOutputStream(int p0)`

**Methods:**
- `protected void addBuffer()`
- `public void close()`
- `public int getSize()`
- `public byte[] toByteArray()`
- `public java.lang.String toString()`
- `public void write(byte[] p0, int p1, int p2) throws java.io.IOException`
- `public void write(int p0) throws java.io.IOException`
- `public void writeTo(java.io.OutputStream p0) throws java.io.IOException`
- `public void writeTo(java.io.RandomAccessFile p0) throws java.io.IOException`
- `public void writeTo(java.io.Writer p0, java.lang.String p1) throws java.io.IOException`
- `public void writeTo(javax.servlet.jsp.JspWriter p0, java.lang.String p1) throws java.io.IOException`

---

## public class `org.apache.struts2.util.InvocationSessionStore`

**Methods:**
- `public static com.opensymphony.xwork2.ActionInvocation loadInvocation(java.lang.String p0, java.lang.String p1)`
- `public static void storeInvocation(java.lang.String p0, java.lang.String p1, com.opensymphony.xwork2.ActionInvocation p2)`

---

## public abstract class `org.apache.struts2.util.IteratorFilterSupport`

**Constructors:**
- `public IteratorFilterSupport()`

**Methods:**
- `protected java.lang.Object getIterator(java.lang.Object p0)`

---

## public static class `org.apache.struts2.util.IteratorFilterSupport$EnumerationIterator`
implements `java.util.Iterator`  

**Constructors:**
- `public EnumerationIterator(java.util.Enumeration p0)`

**Methods:**
- `public boolean hasNext()`
- `public java.lang.Object next()`
- `public void remove()`

---

## public class `org.apache.struts2.util.IteratorGenerator`
implements `com.opensymphony.xwork2.Action`, `java.util.Iterator`  

**Constructors:**
- `public IteratorGenerator()`

**Methods:**
- `public java.lang.String execute()`
- `public boolean getHasNext()`
- `public java.lang.Object getNext()`
- `public boolean hasNext()`
- `public java.lang.Object next()`
- `public void remove()`
- `public void setConverter(org.apache.struts2.util.IteratorGenerator$Converter p0)`
- `public void setCount(int p0)`
- `public void setSeparator(java.lang.String p0)`
- `public void setValues(java.lang.Object p0)`

---

## public abstract static interface `org.apache.struts2.util.IteratorGenerator$Converter`

**Methods:**
- `public abstract java.lang.Object convert(java.lang.String p0) throws java.lang.Exception`

---

## public class `org.apache.struts2.util.ListEntry`

**Constructors:**
- `public ListEntry(java.lang.Object p0, java.lang.Object p1, boolean p2)`

**Methods:**
- `public boolean getIsSelected()`
- `public java.lang.Object getKey()`
- `public java.lang.Object getValue()`

---

## public class `org.apache.struts2.util.MakeIterator`

**Constructors:**
- `public MakeIterator()`

**Methods:**
- `public static java.util.Iterator convert(java.lang.Object p0)`
- `public static boolean isIterable(java.lang.Object p0)`

---

## public class `org.apache.struts2.util.MergeIteratorFilter`
extends `org.apache.struts2.util.IteratorFilterSupport`  
implements `com.opensymphony.xwork2.Action`, `java.util.Iterator`  

**Constructors:**
- `public MergeIteratorFilter()`

**Methods:**
- `public java.lang.String execute()`
- `public boolean hasNext()`
- `public java.lang.Object next()`
- `public void remove()`
- `public void setSource(java.lang.Object p0)`

---

## public abstract interface `org.apache.struts2.util.ObjectFactoryDestroyable`

**Methods:**
- `public abstract void destroy()`

---

## public class `org.apache.struts2.util.PrefixTrie`

**Constructors:**
- `public PrefixTrie()`

**Methods:**
- `public java.lang.Object get(java.lang.String p0)`
- `public void put(java.lang.String p0, java.lang.Object p1)`

---

## public class `org.apache.struts2.util.RegexPatternMatcher`
implements `com.opensymphony.xwork2.util.PatternMatcher<org.apache.struts2.util.RegexPatternMatcherExpression>`  

**Constructors:**
- `public RegexPatternMatcher()`

**Methods:**
- `public org.apache.struts2.util.RegexPatternMatcherExpression compilePattern(java.lang.String p0)`
- `public boolean isLiteral(java.lang.String p0)`
- `public boolean match(java.util.Map p0, java.lang.String p1, org.apache.struts2.util.RegexPatternMatcherExpression p2)`

---

## public class `org.apache.struts2.util.RegexPatternMatcherExpression`

**Constructors:**
- `public RegexPatternMatcherExpression(java.util.regex.Pattern p0, java.util.Map p1)`

**Methods:**
- `public java.util.Map getParams()`
- `public java.util.regex.Pattern getPattern()`

---

## public abstract interface `org.apache.struts2.util.ServletContextAware`

**Methods:**
- `public abstract void setServletContext(javax.servlet.ServletContext p0)`

---

## public class `org.apache.struts2.util.SortIteratorFilter`
extends `org.apache.struts2.util.IteratorFilterSupport`  
implements `com.opensymphony.xwork2.Action`, `java.util.Iterator`  

**Constructors:**
- `public SortIteratorFilter()`

**Methods:**
- `public java.lang.String execute()`
- `public java.util.List getList()`
- `public boolean hasNext()`
- `public java.lang.Object next()`
- `public void remove()`
- `public void setComparator(java.util.Comparator p0)`
- `public void setSource(java.lang.Object p0)`

---

## public class `org.apache.struts2.util.StrutsTestCaseHelper`

**Constructors:**
- `public StrutsTestCaseHelper()`

**Methods:**
- `public static org.apache.struts2.dispatcher.Dispatcher initDispatcher(javax.servlet.ServletContext p0, java.util.Map p1)`
- `public static void tearDown() throws java.lang.Exception`

---

## public abstract class `org.apache.struts2.util.StrutsTypeConverter`
extends `com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter`  

**Constructors:**
- `public StrutsTypeConverter()`

**Methods:**
- `public abstract java.lang.Object convertFromString(java.util.Map p0, java.lang.String[] p1, java.lang.Class p2)`
- `public abstract java.lang.String convertToString(java.util.Map p0, java.lang.Object p1)`
- `public java.lang.Object convertValue(java.util.Map p0, java.lang.Object p1, java.lang.Class p2)`
- `protected java.lang.Object performFallbackConversion(java.util.Map p0, java.lang.Object p1, java.lang.Class p2)`

---

## public class `org.apache.struts2.util.StrutsUtil`

**Constructors:**
- `public StrutsUtil(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `protected final static org.apache.logging.log4j.Logger LOG`
- `protected java.util.Map classes`
- `protected org.apache.struts2.views.jsp.ui.OgnlTool ognl`
- `protected javax.servlet.http.HttpServletRequest request`
- `protected javax.servlet.http.HttpServletResponse response`
- `protected com.opensymphony.xwork2.util.ValueStack stack`

**Methods:**
- `public java.lang.Object bean(java.lang.Object p0) throws java.lang.Exception`
- `public java.lang.String buildUrl(java.lang.String p0)`
- `public java.lang.Object findString(java.lang.String p0)`
- `public java.lang.Object findValue(java.lang.String p0, java.lang.String p1) throws java.lang.ClassNotFoundException`
- `public java.lang.String getContext()`
- `public java.lang.String getText(java.lang.String p0)`
- `public java.lang.String include(java.lang.Object p0) throws java.lang.Exception`
- `public boolean isTrue(java.lang.String p0)`
- `public java.util.List makeSelectList(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3)`
- `public int toInt(long p0)`
- `public long toLong(int p0)`
- `public long toLong(java.lang.String p0)`
- `public java.lang.String toString(int p0)`
- `public java.lang.String toString(long p0)`
- `public java.lang.String toStringSafe(java.lang.Object p0)`
- `public java.lang.String translateVariables(java.lang.String p0)`
- `public java.lang.String urlEncode(java.lang.String p0)`

---

## public class `org.apache.struts2.util.SubsetIteratorFilter`
extends `org.apache.struts2.util.IteratorFilterSupport`  
implements `com.opensymphony.xwork2.Action`, `java.util.Iterator`  

**Constructors:**
- `public SubsetIteratorFilter()`

**Methods:**
- `protected boolean decide(java.lang.Object p0)`
- `public java.lang.String execute()`
- `public boolean hasNext()`
- `public java.lang.Object next()`
- `public void remove()`
- `public void setCount(int p0)`
- `public void setDecider(org.apache.struts2.util.SubsetIteratorFilter$Decider p0)`
- `public void setSource(java.lang.Object p0)`
- `public void setStart(int p0)`

---

## public abstract static interface `org.apache.struts2.util.SubsetIteratorFilter$Decider`

**Methods:**
- `public abstract boolean decide(java.lang.Object p0) throws java.lang.Exception`

---

## public class `org.apache.struts2.util.TabbedPane`

**Constructors:**
- `public TabbedPane(int p0)`

**Fields:**
- `protected java.util.Vector content`
- `protected int selectedIndex`
- `protected java.lang.String tabAlign`

**Methods:**
- `public java.util.Vector getContent()`
- `public int getSelectedIndex()`
- `public java.lang.String getTabAlign()`
- `public void setContent(java.util.Vector p0)`
- `public void setSelectedIndex(int p0)`
- `public void setTabAlign(java.lang.String p0)`

---

## public class `org.apache.struts2.util.TextProviderHelper`

**Constructors:**
- `public TextProviderHelper()`

**Methods:**
- `public static java.lang.String getText(java.lang.String p0, java.lang.String p1, com.opensymphony.xwork2.util.ValueStack p2)`
- `public static java.lang.String getText(java.lang.String p0, java.lang.String p1, java.util.List p2, com.opensymphony.xwork2.util.ValueStack p3)`
- `public static java.lang.String getText(java.lang.String p0, java.lang.String p1, java.util.List p2, com.opensymphony.xwork2.util.ValueStack p3, boolean p4)`

---

## public class `org.apache.struts2.util.Timer`

**Constructors:**
- `public Timer()`

**Methods:**
- `public long getTime()`
- `public long getTotal()`

---

## public class `org.apache.struts2.util.TokenHelper`

**Constructors:**
- `public TokenHelper()`

**Fields:**
- `public final static java.lang.String DEFAULT_TOKEN_NAME`
- `public final static java.lang.String TOKEN_NAMESPACE`
- `public final static java.lang.String TOKEN_NAME_FIELD`

**Methods:**
- `public static java.lang.String buildTokenSessionAttributeName(java.lang.String p0)`
- `public static java.lang.String generateGUID()`
- `public static java.lang.String getToken()`
- `public static java.lang.String getToken(java.lang.String p0)`
- `public static java.lang.String getTokenName()`
- `public static void setSessionToken(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String setToken()`
- `public static java.lang.String setToken(java.lang.String p0)`
- `public static boolean validToken()`

---

## public class `org.apache.struts2.util.URLBean`

**Constructors:**
- `public URLBean()`

**Methods:**
- `public org.apache.struts2.util.URLBean addParameter(java.lang.String p0, java.lang.Object p1)`
- `public java.lang.String getURL()`
- `public org.apache.struts2.util.URLBean setPage(java.lang.String p0)`
- `public void setRequest(javax.servlet.http.HttpServletRequest p0)`
- `public void setResponse(javax.servlet.http.HttpServletResponse p0)`
- `public java.lang.String toString()`

---

## public class `org.apache.struts2.util.URLDecoderUtil`

**Constructors:**
- `public URLDecoderUtil()`

**Methods:**
- `public static java.lang.String decode(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String decode(java.lang.String p0, java.lang.String p1, boolean p2)`

---

## public class `org.apache.struts2.util.VelocityStrutsUtil`
extends `org.apache.struts2.util.StrutsUtil`  

**Constructors:**
- `public VelocityStrutsUtil(org.apache.velocity.app.VelocityEngine p0, org.apache.velocity.context.Context p1, com.opensymphony.xwork2.util.ValueStack p2, javax.servlet.http.HttpServletRequest p3, javax.servlet.http.HttpServletResponse p4)`

**Methods:**
- `public java.lang.String evaluate(java.lang.String p0) throws java.io.IOException, org.apache.velocity.exception.MethodInvocationException, org.apache.velocity.exception.ParseErrorException, org.apache.velocity.exception.ResourceNotFoundException`

---

## public class `org.apache.struts2.util.fs.JBossFileManager`
extends `com.opensymphony.xwork2.util.fs.DefaultFileManager`  

**Constructors:**
- `public JBossFileManager()`

**Methods:**
- `public java.util.Collection getAllPhysicalUrls(java.net.URL p0) throws java.io.IOException`
- `protected java.net.URL getJBossPhysicalUrl(java.net.URL p0) throws java.io.IOException`
- `protected boolean isJBossUrl(java.net.URL p0)`
- `public void monitorFile(java.net.URL p0)`
- `public java.net.URL normalizeToFileProtocol(java.net.URL p0)`
- `public boolean support()`

---

## public final class `org.apache.struts2.util.tomcat.buf.Ascii`

**Constructors:**
- `public Ascii()`

**Methods:**
- `public static boolean isAlpha(int p0)`
- `public static boolean isDigit(int p0)`
- `public static boolean isLower(int p0)`
- `public static boolean isUpper(int p0)`
- `public static boolean isWhite(int p0)`
- `public static int parseInt(byte[] p0, int p1, int p2) throws java.lang.NumberFormatException`
- `public static int parseInt(char[] p0, int p1, int p2) throws java.lang.NumberFormatException`
- `public static long parseLong(byte[] p0, int p1, int p2) throws java.lang.NumberFormatException`
- `public static long parseLong(char[] p0, int p1, int p2) throws java.lang.NumberFormatException`
- `public static int toLower(int p0)`
- `public static int toUpper(int p0)`

---

## public class `org.apache.struts2.util.tomcat.buf.B2CConverter`

**Constructors:**
- `public B2CConverter(java.lang.String p0) throws java.io.IOException`
- `public B2CConverter(java.lang.String p0, boolean p1) throws java.io.IOException`

**Fields:**
- `public final static java.nio.charset.Charset ISO_8859_1`
- `protected final static int LEFTOVER_SIZE`
- `public final static java.nio.charset.Charset UTF_8`

**Methods:**
- `public void convert(org.apache.struts2.util.tomcat.buf.ByteChunk p0, org.apache.struts2.util.tomcat.buf.CharChunk p1, boolean p2) throws java.io.IOException`
- `public static java.nio.charset.Charset getCharset(java.lang.String p0) throws java.io.UnsupportedEncodingException`
- `public static java.nio.charset.Charset getCharsetLower(java.lang.String p0) throws java.io.UnsupportedEncodingException`
- `public void recycle()`

---

## public final class `org.apache.struts2.util.tomcat.buf.ByteChunk`
implements `java.io.Serializable`, `java.lang.Cloneable`  

**Constructors:**
- `public ByteChunk()`
- `public ByteChunk(int p0)`

**Fields:**
- `public final static java.nio.charset.Charset DEFAULT_CHARSET`

**Methods:**
- `public void allocate(int p0, int p1)`
- `public void append(byte p0) throws java.io.IOException`
- `public void append(byte[] p0, int p1, int p2) throws java.io.IOException`
- `public void append(char p0) throws java.io.IOException`
- `public void append(org.apache.struts2.util.tomcat.buf.ByteChunk p0) throws java.io.IOException`
- `public final static byte[] convertToBytes(java.lang.String p0)`
- `public boolean equals(byte[] p0, int p1, int p2)`
- `public boolean equals(char[] p0, int p1, int p2)`
- `public boolean equals(java.lang.String p0)`
- `public boolean equals(org.apache.struts2.util.tomcat.buf.ByteChunk p0)`
- `public boolean equals(org.apache.struts2.util.tomcat.buf.CharChunk p0)`
- `public boolean equalsIgnoreCase(java.lang.String p0)`
- `public static int findByte(byte[] p0, int p1, int p2, byte p3)`
- `public static int findBytes(byte[] p0, int p1, int p2, byte[] p3)`
- `public static int findNotBytes(byte[] p0, int p1, int p2, byte[] p3)`
- `public void flushBuffer() throws java.io.IOException`
- `public byte[] getBuffer()`
- `public byte[] getBytes()`
- `public java.nio.charset.Charset getCharset()`
- `public org.apache.struts2.util.tomcat.buf.ByteChunk getClone()`
- `public int getEnd()`
- `public int getInt()`
- `public int getLength()`
- `public int getLimit()`
- `public long getLong()`
- `public int getOffset()`
- `public int getStart()`
- `public int hash()`
- `public int hashIgnoreCase()`
- `public static int indexOf(byte[] p0, int p1, int p2, char p3)`
- `public int indexOf(char p0, int p1)`
- `public int indexOf(java.lang.String p0, int p1, int p2, int p3)`
- `public boolean isNull()`
- `public void makeSpace(int p0)`
- `public void recycle()`
- `public void reset()`
- `public void setByteInputChannel(org.apache.struts2.util.tomcat.buf.ByteChunk$ByteInputChannel p0)`
- `public void setByteOutputChannel(org.apache.struts2.util.tomcat.buf.ByteChunk$ByteOutputChannel p0)`
- `public void setBytes(byte[] p0, int p1, int p2)`
- `public void setCharset(java.nio.charset.Charset p0)`
- `public void setEnd(int p0)`
- `public void setLimit(int p0)`
- `public void setOffset(int p0)`
- `public void setOptimizedWrite(boolean p0)`
- `public boolean startsWith(byte[] p0)`
- `public boolean startsWith(java.lang.String p0)`
- `public boolean startsWithIgnoreCase(java.lang.String p0, int p1)`
- `public int substract() throws java.io.IOException`
- `public int substract(byte[] p0, int p1, int p2) throws java.io.IOException`
- `public int substract(org.apache.struts2.util.tomcat.buf.ByteChunk p0) throws java.io.IOException`
- `public byte substractB() throws java.io.IOException`
- `public java.lang.String toString()`
- `public java.lang.String toStringInternal()`

---

## public abstract static interface `org.apache.struts2.util.tomcat.buf.ByteChunk$ByteInputChannel`

**Methods:**
- `public abstract int realReadBytes(byte[] p0, int p1, int p2) throws java.io.IOException`

---

## public abstract static interface `org.apache.struts2.util.tomcat.buf.ByteChunk$ByteOutputChannel`

**Methods:**
- `public abstract void realWriteBytes(byte[] p0, int p1, int p2) throws java.io.IOException`

---

## public final class `org.apache.struts2.util.tomcat.buf.CharChunk`
implements `java.io.Serializable`, `java.lang.CharSequence`, `java.lang.Cloneable`  

**Constructors:**
- `public CharChunk()`
- `public CharChunk(int p0)`

**Methods:**
- `public void allocate(int p0, int p1)`
- `public void append(char p0) throws java.io.IOException`
- `public void append(char[] p0, int p1, int p2) throws java.io.IOException`
- `public void append(java.lang.String p0) throws java.io.IOException`
- `public void append(java.lang.String p0, int p1, int p2) throws java.io.IOException`
- `public void append(org.apache.struts2.util.tomcat.buf.CharChunk p0) throws java.io.IOException`
- `public char charAt(int p0)`
- `public boolean endsWith(java.lang.String p0)`
- `public boolean equals(char[] p0, int p1, int p2)`
- `public boolean equals(java.lang.Object p0)`
- `public boolean equals(java.lang.String p0)`
- `public boolean equals(org.apache.struts2.util.tomcat.buf.CharChunk p0)`
- `public boolean equalsIgnoreCase(java.lang.String p0)`
- `public void flushBuffer() throws java.io.IOException`
- `public char[] getBuffer()`
- `public char[] getChars()`
- `public int getEnd()`
- `public int getLength()`
- `public int getLimit()`
- `public int getOffset()`
- `public int getStart()`
- `public int hash()`
- `public int hashCode()`
- `public int indexOf(char p0)`
- `public int indexOf(char p0, int p1)`
- `public static int indexOf(char[] p0, int p1, int p2, char p3)`
- `public int indexOf(java.lang.String p0, int p1, int p2, int p3)`
- `public boolean isNull()`
- `public int length()`
- `public void makeSpace(int p0)`
- `public void recycle()`
- `public void setCharInputChannel(org.apache.struts2.util.tomcat.buf.CharChunk$CharInputChannel p0)`
- `public void setCharOutputChannel(org.apache.struts2.util.tomcat.buf.CharChunk$CharOutputChannel p0)`
- `public void setChars(char[] p0, int p1, int p2)`
- `public void setEnd(int p0)`
- `public void setLimit(int p0)`
- `public void setOffset(int p0)`
- `public void setOptimizedWrite(boolean p0)`
- `public boolean startsWith(java.lang.String p0)`
- `public boolean startsWithIgnoreCase(java.lang.String p0, int p1)`
- `public java.lang.CharSequence subSequence(int p0, int p1)`
- `public int substract() throws java.io.IOException`
- `public int substract(char[] p0, int p1, int p2) throws java.io.IOException`
- `public java.lang.String toString()`
- `public java.lang.String toStringInternal()`

---

## public abstract static interface `org.apache.struts2.util.tomcat.buf.CharChunk$CharInputChannel`

**Methods:**
- `public abstract int realReadChars(char[] p0, int p1, int p2) throws java.io.IOException`

---

## public abstract static interface `org.apache.struts2.util.tomcat.buf.CharChunk$CharOutputChannel`

**Methods:**
- `public abstract void realWriteChars(char[] p0, int p1, int p2) throws java.io.IOException`

---

## public final class `org.apache.struts2.util.tomcat.buf.HexUtils`

**Constructors:**
- `public HexUtils()`

**Methods:**
- `public static byte[] fromHexString(java.lang.String p0)`
- `public static int getDec(int p0)`
- `public static byte getHex(int p0)`
- `public static java.lang.String toHexString(byte[] p0)`

---

## public final class `org.apache.struts2.util.tomcat.buf.MessageBytes`
implements `java.io.Serializable`, `java.lang.Cloneable`  

**Fields:**
- `public final static int T_BYTES`
- `public final static int T_CHARS`
- `public final static int T_NULL`
- `public final static int T_STR`

**Methods:**
- `public void duplicate(org.apache.struts2.util.tomcat.buf.MessageBytes p0) throws java.io.IOException`
- `public boolean equals(java.lang.Object p0)`
- `public boolean equals(java.lang.String p0)`
- `public boolean equals(org.apache.struts2.util.tomcat.buf.MessageBytes p0)`
- `public boolean equalsIgnoreCase(java.lang.String p0)`
- `public org.apache.struts2.util.tomcat.buf.ByteChunk getByteChunk()`
- `public org.apache.struts2.util.tomcat.buf.CharChunk getCharChunk()`
- `public java.nio.charset.Charset getCharset()`
- `public int getLength()`
- `public long getLong()`
- `public java.lang.String getString()`
- `public int getType()`
- `public int hashCode()`
- `public int indexOf(java.lang.String p0)`
- `public int indexOf(java.lang.String p0, int p1)`
- `public int indexOfIgnoreCase(java.lang.String p0, int p1)`
- `public boolean isNull()`
- `public static org.apache.struts2.util.tomcat.buf.MessageBytes newInstance()`
- `public void recycle()`
- `public void setBytes(byte[] p0, int p1, int p2)`
- `public void setChars(char[] p0, int p1, int p2)`
- `public void setCharset(java.nio.charset.Charset p0)`
- `public void setLong(long p0)`
- `public void setString(java.lang.String p0)`
- `public boolean startsWithIgnoreCase(java.lang.String p0, int p1)`
- `public void toBytes()`
- `public void toChars()`
- `public java.lang.String toString()`

---

## public class `org.apache.struts2.util.tomcat.buf.StringCache`

**Constructors:**
- `public StringCache()`

**Fields:**
- `protected static int accessCount`
- `protected static org.apache.struts2.util.tomcat.buf.StringCache$ByteEntry[] bcCache`
- `protected static int bcCount`
- `protected final static java.util.HashMap bcStats`
- `protected static boolean byteEnabled`
- `protected static int cacheSize`
- `protected static org.apache.struts2.util.tomcat.buf.StringCache$CharEntry[] ccCache`
- `protected static int ccCount`
- `protected final static java.util.HashMap ccStats`
- `protected static boolean charEnabled`
- `protected static int hitCount`
- `protected final static int maxStringSize`
- `protected static int trainThreshold`

**Methods:**
- `protected final static int compare(org.apache.struts2.util.tomcat.buf.ByteChunk p0, byte[] p1)`
- `protected final static int compare(org.apache.struts2.util.tomcat.buf.CharChunk p0, char[] p1)`
- `protected final static java.lang.String find(org.apache.struts2.util.tomcat.buf.ByteChunk p0)`
- `protected final static java.lang.String find(org.apache.struts2.util.tomcat.buf.CharChunk p0)`
- `protected final static int findClosest(org.apache.struts2.util.tomcat.buf.ByteChunk p0, org.apache.struts2.util.tomcat.buf.StringCache$ByteEntry[] p1, int p2)`
- `protected final static int findClosest(org.apache.struts2.util.tomcat.buf.CharChunk p0, org.apache.struts2.util.tomcat.buf.StringCache$CharEntry[] p1, int p2)`
- `public int getAccessCount()`
- `public boolean getByteEnabled()`
- `public int getCacheSize()`
- `public boolean getCharEnabled()`
- `public int getHitCount()`
- `public int getTrainThreshold()`
- `public void reset()`
- `public void setByteEnabled(boolean p0)`
- `public void setCacheSize(int p0)`
- `public void setCharEnabled(boolean p0)`
- `public void setTrainThreshold(int p0)`
- `public static java.lang.String toString(org.apache.struts2.util.tomcat.buf.ByteChunk p0)`
- `public static java.lang.String toString(org.apache.struts2.util.tomcat.buf.CharChunk p0)`

---

## public final class `org.apache.struts2.util.tomcat.buf.UDecoder`

**Constructors:**
- `public UDecoder()`

**Fields:**
- `public final static boolean ALLOW_ENCODED_SLASH`

**Methods:**
- `public static java.lang.String URLDecode(byte[] p0, java.lang.String p1, boolean p2)`
- `public static java.lang.String URLDecode(java.lang.String p0)`
- `public static java.lang.String URLDecode(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String URLDecode(java.lang.String p0, java.lang.String p1, boolean p2)`
- `public final java.lang.String convert(java.lang.String p0, boolean p1)`
- `public void convert(org.apache.struts2.util.tomcat.buf.ByteChunk p0, boolean p1) throws java.io.IOException`
- `public void convert(org.apache.struts2.util.tomcat.buf.CharChunk p0, boolean p1) throws java.io.IOException`
- `public void convert(org.apache.struts2.util.tomcat.buf.MessageBytes p0, boolean p1) throws java.io.IOException`

---

## public class `org.apache.struts2.util.tomcat.buf.Utf8Decoder`
extends `java.nio.charset.CharsetDecoder`  

**Constructors:**
- `public Utf8Decoder()`

**Methods:**
- `protected java.nio.charset.CoderResult decodeLoop(java.nio.ByteBuffer p0, java.nio.CharBuffer p1)`

---

## public class `org.apache.struts2.views.DefaultTagLibrary`
implements `org.apache.struts2.views.TagLibraryDirectiveProvider`, `org.apache.struts2.views.TagLibraryModelProvider`  

**Constructors:**
- `public DefaultTagLibrary()`

**Methods:**
- `public java.util.List getDirectiveClasses()`
- `public java.lang.Object getFreemarkerModels(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.Object getModels(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.util.List getVelocityDirectiveClasses()`

---

## public class `org.apache.struts2.views.JspSupportServlet`
extends `javax.servlet.http.HttpServlet`  

**Constructors:**
- `public JspSupportServlet()`

**Fields:**
- `public static org.apache.struts2.views.JspSupportServlet jspSupportServlet`

**Methods:**
- `public void init(javax.servlet.ServletConfig p0) throws javax.servlet.ServletException`

---

## public abstract interface `org.apache.struts2.views.TagLibraryDirectiveProvider`

**Methods:**
- `public abstract java.util.List getDirectiveClasses()`

---

## public abstract interface `org.apache.struts2.views.TagLibraryModelProvider`

**Methods:**
- `public abstract java.lang.Object getModels(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

---

## public abstract interface `org.apache.struts2.views.annotations.StrutsTag`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `org.apache.struts2.views.annotations.StrutsTagAttribute`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public abstract interface `org.apache.struts2.views.annotations.StrutsTagSkipInheritance`
annotations: @java.lang.annotation.Retention, @java.lang.annotation.Target  

---

## public class `org.apache.struts2.views.freemarker.FreemarkerManager`

**Constructors:**
- `public FreemarkerManager()`

**Fields:**
- `public final static java.lang.String ATTR_TEMPLATE_MODEL`
- `public final static java.lang.String CONFIG_SERVLET_CONTEXT_KEY`
- `public final static java.lang.String DEFAULT_CONTENT_TYPE`
- `public final static java.lang.String EXPIRATION_DATE`
- `public final static java.lang.String INITPARAM_CONTENT_TYPE`
- `public final static java.lang.String INITPARAM_DEBUG`
- `public final static java.lang.String INITPARAM_NOCACHE`
- `public final static java.lang.String INITPARAM_TEMPLATE_PATH`
- `public final static java.lang.String KEY_APPLICATION`
- `public final static java.lang.String KEY_APPLICATION_PRIVATE`
- `public final static java.lang.String KEY_EXCEPTION`
- `public final static java.lang.String KEY_HASHMODEL_PRIVATE`
- `public final static java.lang.String KEY_INCLUDE`
- `public final static java.lang.String KEY_JSP_TAGLIBS`
- `public final static java.lang.String KEY_REQUEST`
- `public final static java.lang.String KEY_REQUEST_PARAMETERS`
- `public final static java.lang.String KEY_REQUEST_PARAMETERS_STRUTS`
- `public final static java.lang.String KEY_REQUEST_PRIVATE`
- `public final static java.lang.String KEY_SESSION`
- `protected boolean altMapWrapper`
- `protected boolean cacheBeanWrapper`
- `protected freemarker.template.Configuration config`
- `protected java.lang.String contentType`
- `protected boolean debug`
- `protected java.lang.String encoding`
- `protected int mruMaxStrongSize`
- `protected boolean noCharsetInContentType`
- `protected boolean nocache`
- `protected java.util.Map tagLibraries`
- `protected java.lang.String templatePath`
- `protected java.lang.String templateUpdateDelay`
- `protected freemarker.template.ObjectWrapper wrapper`

**Methods:**
- `public void addSetting(java.lang.String p0, java.lang.String p1) throws freemarker.template.TemplateException`
- `protected org.apache.struts2.views.freemarker.ScopesHashModel buildScopesHashModel(javax.servlet.ServletContext p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2, freemarker.template.ObjectWrapper p3, com.opensymphony.xwork2.util.ValueStack p4)`
- `public org.apache.struts2.views.freemarker.ScopesHashModel buildTemplateModel(com.opensymphony.xwork2.util.ValueStack p0, java.lang.Object p1, javax.servlet.ServletContext p2, javax.servlet.http.HttpServletRequest p3, javax.servlet.http.HttpServletResponse p4, freemarker.template.ObjectWrapper p5)`
- `protected void configureTemplateLoader(freemarker.cache.TemplateLoader p0)`
- `protected freemarker.template.Configuration createConfiguration(javax.servlet.ServletContext p0) throws freemarker.template.TemplateException`
- `protected freemarker.template.ObjectWrapper createObjectWrapper(javax.servlet.ServletContext p0)`
- `protected freemarker.cache.TemplateLoader createTemplateLoader(javax.servlet.ServletContext p0, java.lang.String p1)`
- `public freemarker.template.Configuration getConfig()`
- `public synchronized freemarker.template.Configuration getConfiguration(javax.servlet.ServletContext p0)`
- `public java.lang.String getContentType()`
- `public boolean getDebug()`
- `protected freemarker.template.Version getFreemarkerVersion(javax.servlet.ServletContext p0)`
- `public boolean getNoCharsetInContentType()`
- `public boolean getNocache()`
- `public java.lang.String getTemplatePath()`
- `public freemarker.template.ObjectWrapper getWrapper()`
- `public void init(javax.servlet.ServletContext p0) throws freemarker.template.TemplateException`
- `protected void loadSettings(javax.servlet.ServletContext p0)`
- `protected void populateContext(org.apache.struts2.views.freemarker.ScopesHashModel p0, com.opensymphony.xwork2.util.ValueStack p1, java.lang.Object p2, javax.servlet.http.HttpServletRequest p3, javax.servlet.http.HttpServletResponse p4)`
- `public void setCacheBeanWrapper(java.lang.String p0)`
- `public void setContainer(com.opensymphony.xwork2.inject.Container p0)`
- `public void setEncoding(java.lang.String p0)`
- `public void setFileManagerFactory(com.opensymphony.xwork2.FileManagerFactory p0)`
- `public void setMruMaxStrongSize(java.lang.String p0)`
- `public void setTemplateUpdateDelay(java.lang.String p0)`
- `public void setThemeTemplateLoader(org.apache.struts2.views.freemarker.FreemarkerThemeTemplateLoader p0)`
- `public void setWrapperAltMap(java.lang.String p0)`

---

## public class `org.apache.struts2.views.freemarker.FreemarkerResult`
extends `org.apache.struts2.result.StrutsResultSupport`  

**Constructors:**
- `public FreemarkerResult()`
- `public FreemarkerResult(java.lang.String p0)`

**Fields:**
- `protected freemarker.template.Configuration configuration`
- `protected org.apache.struts2.views.freemarker.FreemarkerManager freemarkerManager`
- `protected com.opensymphony.xwork2.ActionInvocation invocation`
- `protected java.lang.String location`
- `protected freemarker.template.ObjectWrapper wrapper`

**Methods:**
- `protected freemarker.template.TemplateModel createModel() throws freemarker.template.TemplateModelException`
- `protected java.util.Locale deduceLocale()`
- `public void doExecute(java.lang.String p0, com.opensymphony.xwork2.ActionInvocation p1) throws freemarker.template.TemplateException, java.io.IOException`
- `protected freemarker.template.Configuration getConfiguration() throws freemarker.template.TemplateException`
- `public java.lang.String getContentType()`
- `protected freemarker.template.ObjectWrapper getObjectWrapper()`
- `protected java.io.Writer getWriter() throws java.io.IOException`
- `public boolean isWriteIfCompleted()`
- `protected void postTemplateProcess(freemarker.template.Template p0, freemarker.template.TemplateModel p1) throws java.io.IOException`
- `protected boolean preTemplateProcess(freemarker.template.Template p0, freemarker.template.TemplateModel p1) throws java.io.IOException`
- `public void setContentType(java.lang.String p0)`
- `public void setFreemarkerManager(org.apache.struts2.views.freemarker.FreemarkerManager p0)`
- `public void setWriteIfCompleted(java.lang.Boolean p0)`
- `public void setWriter(java.io.Writer p0)`

---

## public class `org.apache.struts2.views.freemarker.FreemarkerThemeTemplateLoader`
implements `freemarker.cache.TemplateLoader`  

**Constructors:**
- `public FreemarkerThemeTemplateLoader()`

**Methods:**
- `public void closeTemplateSource(java.lang.Object p0) throws java.io.IOException`
- `public java.lang.Object findTemplateSource(java.lang.String p0) throws java.io.IOException`
- `public long getLastModified(java.lang.Object p0)`
- `public freemarker.cache.TemplateLoader getParentTemplateLoader()`
- `public java.io.Reader getReader(java.lang.Object p0, java.lang.String p1) throws java.io.IOException`
- `public void init(freemarker.cache.TemplateLoader p0)`
- `public void setTemplateEngine(org.apache.struts2.components.template.TemplateEngine p0)`
- `public void setUIThemeExpansionToken(java.lang.String p0)`

---

## public class `org.apache.struts2.views.freemarker.ScopesHashModel`
extends `freemarker.template.SimpleHash`  
implements `freemarker.template.TemplateModel`  

**Constructors:**
- `public ScopesHashModel(freemarker.template.ObjectWrapper p0, javax.servlet.ServletContext p1, javax.servlet.http.HttpServletRequest p2)`
- `public ScopesHashModel(freemarker.template.ObjectWrapper p0, javax.servlet.ServletContext p1, javax.servlet.http.HttpServletRequest p2, com.opensymphony.xwork2.util.ValueStack p3)`

**Methods:**
- `public freemarker.template.TemplateModel get(java.lang.String p0) throws freemarker.template.TemplateModelException`
- `public void put(java.lang.String p0, boolean p1)`
- `public void put(java.lang.String p0, java.lang.Object p1)`
- `public void putUnlistedModel(java.lang.String p0, freemarker.template.TemplateModel p1)`

---

## public class `org.apache.struts2.views.freemarker.StrutsBeanWrapper`
extends `freemarker.ext.beans.BeansWrapper`  

**Constructors:**
- `public StrutsBeanWrapper(boolean p0, freemarker.template.Version p1)`

**Methods:**
- `protected freemarker.ext.util.ModelFactory getModelFactory(java.lang.Class p0)`

---

## public class `org.apache.struts2.views.freemarker.StrutsClassTemplateLoader`
extends `freemarker.cache.URLTemplateLoader`  

**Constructors:**
- `public StrutsClassTemplateLoader()`

**Methods:**
- `protected java.net.URL getURL(java.lang.String p0)`

---

## public class `org.apache.struts2.views.freemarker.tags.ActionErrorModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public ActionErrorModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.ActionMessageModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public ActionMessageModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.ActionModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public ActionModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.AnchorModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public AnchorModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.BeanModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public BeanModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.CallbackWriter`
extends `java.io.Writer`  
implements `freemarker.template.TransformControl`  

**Constructors:**
- `public CallbackWriter(org.apache.struts2.components.Component p0, java.io.Writer p1)`

**Methods:**
- `public int afterBody() throws freemarker.template.TemplateModelException, java.io.IOException`
- `public void close() throws java.io.IOException`
- `public void flush() throws java.io.IOException`
- `public org.apache.struts2.components.Component getBean()`
- `public void onError(java.lang.Throwable p0) throws java.lang.Throwable`
- `public int onStart() throws freemarker.template.TemplateModelException, java.io.IOException`
- `public void write(char[] p0, int p1, int p2) throws java.io.IOException`

---

## public class `org.apache.struts2.views.freemarker.tags.CheckboxListModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public CheckboxListModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.CheckboxModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public CheckboxModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.ComboBoxModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public ComboBoxModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.ComponentModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public ComponentModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.DateModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public DateModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.DoubleSelectModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public DoubleSelectModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.ElseIfModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public ElseIfModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.ElseModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public ElseModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.FieldErrorModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public FieldErrorModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.FileModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public FileModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.FormModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public FormModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.HeadModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public HeadModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.HiddenModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public HiddenModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.I18nModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public I18nModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.IfModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public IfModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.IncludeModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public IncludeModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.InputTransferSelectModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public InputTransferSelectModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.IteratorModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public IteratorModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.LabelModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public LabelModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.OptGroupModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public OptGroupModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.OptionTransferSelectModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public OptionTransferSelectModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.ParamModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public ParamModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.PasswordModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public PasswordModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.PropertyModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public PropertyModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.PushModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public PushModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.RadioModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public RadioModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.ResetModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public ResetModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.SelectModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public SelectModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.SetModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public SetModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.StrutsModels`

**Constructors:**
- `public StrutsModels(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `protected org.apache.struts2.views.freemarker.tags.AnchorModel a`
- `protected org.apache.struts2.views.freemarker.tags.ActionModel action`
- `protected org.apache.struts2.views.freemarker.tags.ActionErrorModel actionerror`
- `protected org.apache.struts2.views.freemarker.tags.ActionMessageModel actionmessage`
- `protected org.apache.struts2.views.freemarker.tags.BeanModel bean`
- `protected org.apache.struts2.views.freemarker.tags.CheckboxModel checkbox`
- `protected org.apache.struts2.views.freemarker.tags.CheckboxListModel checkboxlist`
- `protected org.apache.struts2.views.freemarker.tags.ComboBoxModel comboBox`
- `protected org.apache.struts2.views.freemarker.tags.ComponentModel component`
- `protected org.apache.struts2.views.freemarker.tags.DateModel date`
- `protected org.apache.struts2.views.freemarker.tags.DoubleSelectModel doubleselect`
- `protected org.apache.struts2.views.freemarker.tags.ElseIfModel elseIfModel`
- `protected org.apache.struts2.views.freemarker.tags.ElseModel elseModel`
- `protected org.apache.struts2.views.freemarker.tags.FieldErrorModel fielderror`
- `protected org.apache.struts2.views.freemarker.tags.FileModel file`
- `protected org.apache.struts2.views.freemarker.tags.FormModel form`
- `protected org.apache.struts2.views.freemarker.tags.HeadModel head`
- `protected org.apache.struts2.views.freemarker.tags.HiddenModel hidden`
- `protected org.apache.struts2.views.freemarker.tags.I18nModel i18n`
- `protected org.apache.struts2.views.freemarker.tags.IfModel ifModel`
- `protected org.apache.struts2.views.freemarker.tags.IncludeModel include`
- `protected org.apache.struts2.views.freemarker.tags.InputTransferSelectModel inputtransferselect`
- `protected org.apache.struts2.views.freemarker.tags.IteratorModel iterator`
- `protected org.apache.struts2.views.freemarker.tags.LabelModel label`
- `protected org.apache.struts2.views.freemarker.tags.OptGroupModel optGroupModel`
- `protected org.apache.struts2.views.freemarker.tags.OptionTransferSelectModel optiontransferselect`
- `protected org.apache.struts2.views.freemarker.tags.ParamModel param`
- `protected org.apache.struts2.views.freemarker.tags.PasswordModel password`
- `protected org.apache.struts2.views.freemarker.tags.PropertyModel property`
- `protected org.apache.struts2.views.freemarker.tags.PushModel push`
- `protected org.apache.struts2.views.freemarker.tags.RadioModel radio`
- `protected javax.servlet.http.HttpServletRequest req`
- `protected javax.servlet.http.HttpServletResponse res`
- `protected org.apache.struts2.views.freemarker.tags.ResetModel reset`
- `protected org.apache.struts2.views.freemarker.tags.SelectModel select`
- `protected org.apache.struts2.views.freemarker.tags.SetModel set`
- `protected com.opensymphony.xwork2.util.ValueStack stack`
- `protected org.apache.struts2.views.freemarker.tags.SubmitModel submit`
- `protected org.apache.struts2.views.freemarker.tags.TextModel text`
- `protected org.apache.struts2.views.freemarker.tags.TextAreaModel textarea`
- `protected org.apache.struts2.views.freemarker.tags.TextFieldModel textfield`
- `protected org.apache.struts2.views.freemarker.tags.TokenModel token`
- `protected org.apache.struts2.views.freemarker.tags.UpDownSelectModel updownselect`
- `protected org.apache.struts2.views.freemarker.tags.URLModel url`

**Methods:**
- `public org.apache.struts2.views.freemarker.tags.AnchorModel getA()`
- `public org.apache.struts2.views.freemarker.tags.ActionModel getAction()`
- `public org.apache.struts2.views.freemarker.tags.ActionErrorModel getActionerror()`
- `public org.apache.struts2.views.freemarker.tags.ActionMessageModel getActionmessage()`
- `public org.apache.struts2.views.freemarker.tags.BeanModel getBean()`
- `public org.apache.struts2.views.freemarker.tags.CheckboxModel getCheckbox()`
- `public org.apache.struts2.views.freemarker.tags.CheckboxListModel getCheckboxlist()`
- `public org.apache.struts2.views.freemarker.tags.ComboBoxModel getCombobox()`
- `public org.apache.struts2.views.freemarker.tags.ComponentModel getComponent()`
- `public org.apache.struts2.views.freemarker.tags.DateModel getDate()`
- `public org.apache.struts2.views.freemarker.tags.DoubleSelectModel getDoubleselect()`
- `public org.apache.struts2.views.freemarker.tags.ElseModel getElse()`
- `public org.apache.struts2.views.freemarker.tags.ElseIfModel getElseif()`
- `public org.apache.struts2.views.freemarker.tags.FieldErrorModel getFielderror()`
- `public org.apache.struts2.views.freemarker.tags.FileModel getFile()`
- `public org.apache.struts2.views.freemarker.tags.FormModel getForm()`
- `public org.apache.struts2.views.freemarker.tags.HeadModel getHead()`
- `public org.apache.struts2.views.freemarker.tags.HiddenModel getHidden()`
- `public org.apache.struts2.views.freemarker.tags.AnchorModel getHref()`
- `public org.apache.struts2.views.freemarker.tags.I18nModel getI18n()`
- `public org.apache.struts2.views.freemarker.tags.IfModel getIf()`
- `public org.apache.struts2.views.freemarker.tags.IncludeModel getInclude()`
- `public org.apache.struts2.views.freemarker.tags.InputTransferSelectModel getInputtransferselect()`
- `public org.apache.struts2.views.freemarker.tags.IteratorModel getIterator()`
- `public org.apache.struts2.views.freemarker.tags.LabelModel getLabel()`
- `public org.apache.struts2.views.freemarker.tags.OptGroupModel getOptgroup()`
- `public org.apache.struts2.views.freemarker.tags.OptionTransferSelectModel getOptiontransferselect()`
- `public org.apache.struts2.views.freemarker.tags.ParamModel getParam()`
- `public org.apache.struts2.views.freemarker.tags.PasswordModel getPassword()`
- `public org.apache.struts2.views.freemarker.tags.PropertyModel getProperty()`
- `public org.apache.struts2.views.freemarker.tags.PushModel getPush()`
- `public org.apache.struts2.views.freemarker.tags.RadioModel getRadio()`
- `public org.apache.struts2.views.freemarker.tags.ResetModel getReset()`
- `public org.apache.struts2.views.freemarker.tags.SelectModel getSelect()`
- `public org.apache.struts2.views.freemarker.tags.SetModel getSet()`
- `public org.apache.struts2.views.freemarker.tags.SubmitModel getSubmit()`
- `public org.apache.struts2.views.freemarker.tags.TextModel getText()`
- `public org.apache.struts2.views.freemarker.tags.TextAreaModel getTextarea()`
- `public org.apache.struts2.views.freemarker.tags.TextFieldModel getTextfield()`
- `public org.apache.struts2.views.freemarker.tags.TokenModel getToken()`
- `public org.apache.struts2.views.freemarker.tags.UpDownSelectModel getUpdownselect()`
- `public org.apache.struts2.views.freemarker.tags.URLModel getUrl()`

---

## public class `org.apache.struts2.views.freemarker.tags.SubmitModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public SubmitModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public abstract class `org.apache.struts2.views.freemarker.tags.TagModel`
implements `freemarker.template.TemplateTransformModel`  

**Constructors:**
- `public TagModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Fields:**
- `protected javax.servlet.http.HttpServletRequest req`
- `protected javax.servlet.http.HttpServletResponse res`
- `protected com.opensymphony.xwork2.util.ValueStack stack`

**Methods:**
- `protected boolean complexType(java.lang.Object p0)`
- `protected java.util.Map convertParams(java.util.Map p0)`
- `protected abstract org.apache.struts2.components.Component getBean()`
- `protected java.util.Map getComplexParams(java.util.Map p0)`
- `public java.io.Writer getWriter(java.io.Writer p0, java.util.Map p1) throws freemarker.template.TemplateModelException, java.io.IOException`
- `protected java.util.Map unwrapParameters(java.util.Map p0)`

---

## public class `org.apache.struts2.views.freemarker.tags.TextAreaModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public TextAreaModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.TextFieldModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public TextFieldModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.TextModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public TextModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.TokenModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public TokenModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.URLModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public URLModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.freemarker.tags.UpDownSelectModel`
extends `org.apache.struts2.views.freemarker.tags.TagModel`  

**Constructors:**
- `public UpDownSelectModel(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

**Methods:**
- `protected org.apache.struts2.components.Component getBean()`

---

## public class `org.apache.struts2.views.jsp.ActionTag`
extends `org.apache.struts2.views.jsp.ContextBeanTag`  

**Constructors:**
- `public ActionTag()`

**Fields:**
- `protected boolean executeResult`
- `protected boolean flush`
- `protected boolean ignoreContextParams`
- `protected java.lang.String name`
- `protected java.lang.String namespace`
- `protected boolean rethrowException`

**Methods:**
- `protected void addParameter(java.lang.String p0, java.lang.Object p1)`
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public boolean getFlush()`
- `protected void populateParams()`
- `public void setExecuteResult(boolean p0)`
- `public void setFlush(boolean p0)`
- `public void setIgnoreContextParams(boolean p0)`
- `public void setName(java.lang.String p0)`
- `public void setNamespace(java.lang.String p0)`
- `public void setRethrowException(boolean p0)`

---

## public class `org.apache.struts2.views.jsp.BeanTag`
extends `org.apache.struts2.views.jsp.ContextBeanTag`  

**Constructors:**
- `public BeanTag()`

**Fields:**
- `protected static org.apache.logging.log4j.Logger LOG`
- `protected java.lang.String name`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setName(java.lang.String p0)`

---

## public abstract class `org.apache.struts2.views.jsp.ComponentTagSupport`
extends `org.apache.struts2.views.jsp.StrutsBodyTagSupport`  

**Constructors:**
- `public ComponentTagSupport()`

**Fields:**
- `protected org.apache.struts2.components.Component component`

**Methods:**
- `public int doEndTag() throws javax.servlet.jsp.JspException`
- `public int doStartTag() throws javax.servlet.jsp.JspException`
- `public abstract org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public org.apache.struts2.components.Component getComponent()`
- `protected void populateParams()`

---

## public abstract class `org.apache.struts2.views.jsp.ContextBeanTag`
extends `org.apache.struts2.views.jsp.ComponentTagSupport`  

**Constructors:**
- `public ContextBeanTag()`

**Methods:**
- `protected void populateParams()`
- `public void setVar(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.DateTag`
extends `org.apache.struts2.views.jsp.ContextBeanTag`  

**Constructors:**
- `public DateTag()`

**Fields:**
- `protected java.lang.String format`
- `protected java.lang.String name`
- `protected boolean nice`
- `protected java.lang.String timezone`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setFormat(java.lang.String p0)`
- `public void setName(java.lang.String p0)`
- `public void setNice(boolean p0)`
- `public void setTimezone(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.ElseIfTag`
extends `org.apache.struts2.views.jsp.ComponentTagSupport`  

**Constructors:**
- `public ElseIfTag()`

**Fields:**
- `protected java.lang.String test`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setTest(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.ElseTag`
extends `org.apache.struts2.views.jsp.ComponentTagSupport`  

**Constructors:**
- `public ElseTag()`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

---

## public class `org.apache.struts2.views.jsp.I18nTag`
extends `org.apache.struts2.views.jsp.ComponentTagSupport`  

**Constructors:**
- `public I18nTag()`

**Fields:**
- `protected java.lang.String name`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setName(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.IfTag`
extends `org.apache.struts2.views.jsp.ComponentTagSupport`  

**Constructors:**
- `public IfTag()`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setTest(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.IncludeTag`
extends `org.apache.struts2.views.jsp.ComponentTagSupport`  

**Constructors:**
- `public IncludeTag()`

**Fields:**
- `protected java.lang.String value`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setValue(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.IteratorStatus`

**Constructors:**
- `public IteratorStatus(org.apache.struts2.views.jsp.IteratorStatus$StatusState p0)`

**Fields:**
- `protected org.apache.struts2.views.jsp.IteratorStatus$StatusState state`

**Methods:**
- `public int getCount()`
- `public int getIndex()`
- `public boolean isEven()`
- `public boolean isFirst()`
- `public boolean isLast()`
- `public boolean isOdd()`
- `public int modulus(int p0)`

---

## public static class `org.apache.struts2.views.jsp.IteratorStatus$StatusState`

**Constructors:**
- `public StatusState()`

**Methods:**
- `public void next()`
- `public void setLast(boolean p0)`

---

## public class `org.apache.struts2.views.jsp.IteratorTag`
extends `org.apache.struts2.views.jsp.ContextBeanTag`  

**Constructors:**
- `public IteratorTag()`

**Fields:**
- `protected java.lang.String begin`
- `protected java.lang.String end`
- `protected java.lang.String statusAttr`
- `protected java.lang.String step`
- `protected java.lang.String value`

**Methods:**
- `public int doAfterBody() throws javax.servlet.jsp.JspException`
- `public int doEndTag() throws javax.servlet.jsp.JspException`
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setBegin(java.lang.String p0)`
- `public void setEnd(java.lang.String p0)`
- `public void setStatus(java.lang.String p0)`
- `public void setStep(java.lang.String p0)`
- `public void setValue(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.NumberTag`
extends `org.apache.struts2.views.jsp.ContextBeanTag`  

**Constructors:**
- `public NumberTag()`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setCurrency(java.lang.String p0)`
- `public void setGroupingUsed(java.lang.Boolean p0)`
- `public void setMaximumFractionDigits(java.lang.Integer p0)`
- `public void setMaximumIntegerDigits(java.lang.Integer p0)`
- `public void setMinimumFractionDigits(java.lang.Integer p0)`
- `public void setMinimumIntegerDigits(java.lang.Integer p0)`
- `public void setName(java.lang.String p0)`
- `public void setParseIntegerOnly(java.lang.Boolean p0)`
- `public void setRoundingMode(java.lang.String p0)`
- `public void setType(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.ParamTag`
extends `org.apache.struts2.views.jsp.ComponentTagSupport`  

**Constructors:**
- `public ParamTag()`

**Fields:**
- `protected java.lang.String name`
- `protected boolean suppressEmptyParameters`
- `protected java.lang.String value`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setName(java.lang.String p0)`
- `public void setSuppressEmptyParameters(boolean p0)`
- `public void setValue(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.PropertyTag`
extends `org.apache.struts2.views.jsp.ComponentTagSupport`  

**Constructors:**
- `public PropertyTag()`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setDefault(java.lang.String p0)`
- `public void setDefaultValue(java.lang.String p0)`
- `public void setEscapeCsv(boolean p0)`
- `public void setEscapeHtml(boolean p0)`
- `public void setEscapeJavaScript(boolean p0)`
- `public void setEscapeXml(boolean p0)`
- `public void setValue(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.PushTag`
extends `org.apache.struts2.views.jsp.ComponentTagSupport`  

**Constructors:**
- `public PushTag()`

**Fields:**
- `protected java.lang.String value`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setValue(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.SetTag`
extends `org.apache.struts2.views.jsp.ContextBeanTag`  

**Constructors:**
- `public SetTag()`

**Fields:**
- `protected java.lang.String scope`
- `protected boolean trimBody`
- `protected java.lang.String value`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected java.lang.String getBody()`
- `protected void populateParams()`
- `public void setName(java.lang.String p0)`
- `public void setScope(java.lang.String p0)`
- `public void setTrimBody(boolean p0)`
- `public void setValue(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.StrutsBodyTagSupport`
extends `javax.servlet.jsp.tagext.BodyTagSupport`  

**Constructors:**
- `public StrutsBodyTagSupport()`

**Methods:**
- `protected java.lang.String findString(java.lang.String p0)`
- `protected java.lang.Object findValue(java.lang.String p0)`
- `protected java.lang.Object findValue(java.lang.String p0, java.lang.Class p1)`
- `protected java.lang.String getBody()`
- `protected com.opensymphony.xwork2.util.ValueStack getStack()`
- `protected java.lang.String toString(java.lang.Throwable p0)`

---

## public class `org.apache.struts2.views.jsp.TagUtils`

**Constructors:**
- `public TagUtils()`

**Methods:**
- `public static java.lang.String buildNamespace(org.apache.struts2.dispatcher.mapper.ActionMapper p0, com.opensymphony.xwork2.util.ValueStack p1, javax.servlet.http.HttpServletRequest p2)`
- `public static com.opensymphony.xwork2.util.ValueStack getStack(javax.servlet.jsp.PageContext p0)`

---

## public class `org.apache.struts2.views.jsp.TextTag`
extends `org.apache.struts2.views.jsp.ContextBeanTag`  

**Constructors:**
- `public TextTag()`

**Fields:**
- `protected java.lang.String name`
- `protected java.lang.String searchValueStack`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setEscapeCsv(boolean p0)`
- `public void setEscapeHtml(boolean p0)`
- `public void setEscapeJavaScript(boolean p0)`
- `public void setEscapeXml(boolean p0)`
- `public void setName(java.lang.String p0)`
- `public void setSearchValueStack(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.URLTag`
extends `org.apache.struts2.views.jsp.ContextBeanTag`  

**Constructors:**
- `public URLTag()`

**Fields:**
- `protected java.lang.String action`
- `protected java.lang.String anchor`
- `protected java.lang.String encode`
- `protected java.lang.String escapeAmp`
- `protected java.lang.String forceAddSchemeHostAndPort`
- `protected java.lang.String includeContext`
- `protected java.lang.String includeParams`
- `protected java.lang.String method`
- `protected java.lang.String namespace`
- `protected java.lang.String portletMode`
- `protected java.lang.String portletUrlType`
- `protected java.lang.String scheme`
- `protected java.lang.String value`
- `protected java.lang.String windowState`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setAction(java.lang.String p0)`
- `public void setAnchor(java.lang.String p0)`
- `public void setEncode(java.lang.String p0)`
- `public void setEscapeAmp(java.lang.String p0)`
- `public void setForceAddSchemeHostAndPort(java.lang.String p0)`
- `public void setIncludeContext(java.lang.String p0)`
- `public void setIncludeParams(java.lang.String p0)`
- `public void setMethod(java.lang.String p0)`
- `public void setNamespace(java.lang.String p0)`
- `public void setPortletMode(java.lang.String p0)`
- `public void setPortletUrlType(java.lang.String p0)`
- `public void setScheme(java.lang.String p0)`
- `public void setValue(java.lang.String p0)`
- `public void setWindowState(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.iterator.AppendIteratorTag`
extends `org.apache.struts2.views.jsp.ContextBeanTag`  

**Constructors:**
- `public AppendIteratorTag()`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

---

## public class `org.apache.struts2.views.jsp.iterator.IteratorGeneratorTag`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.views.jsp.StrutsBodyTagSupport`  

**Constructors:**
- `public IteratorGeneratorTag()`

**Fields:**
- `public final static java.lang.String DEFAULT_SEPARATOR`

**Methods:**
- `public int doEndTag() throws javax.servlet.jsp.JspException`
- `public int doStartTag() throws javax.servlet.jsp.JspException`
- `public void setConverter(java.lang.String p0)`
- `public void setCount(java.lang.String p0)`
- `public void setSeparator(java.lang.String p0)`
- `public void setVal(java.lang.String p0)`
- `public void setVar(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.iterator.MergeIteratorTag`
extends `org.apache.struts2.views.jsp.ContextBeanTag`  

**Constructors:**
- `public MergeIteratorTag()`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

---

## public class `org.apache.struts2.views.jsp.iterator.SortIteratorTag`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.views.jsp.StrutsBodyTagSupport`  

**Constructors:**
- `public SortIteratorTag()`

**Methods:**
- `public int doEndTag() throws javax.servlet.jsp.JspException`
- `public int doStartTag() throws javax.servlet.jsp.JspException`
- `public void setComparator(java.lang.String p0)`
- `public void setSource(java.lang.String p0)`
- `public void setVar(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.iterator.SubsetIteratorTag`
annotations: @org.apache.struts2.views.annotations.StrutsTag  
extends `org.apache.struts2.views.jsp.StrutsBodyTagSupport`  

**Constructors:**
- `public SubsetIteratorTag()`

**Methods:**
- `public int doEndTag() throws javax.servlet.jsp.JspException`
- `public int doStartTag() throws javax.servlet.jsp.JspException`
- `public void setCount(java.lang.String p0)`
- `public void setDecider(java.lang.String p0)`
- `public void setSource(java.lang.String p0)`
- `public void setStart(java.lang.String p0)`
- `public void setVar(java.lang.String p0)`

---

## public abstract class `org.apache.struts2.views.jsp.ui.AbstractClosingTag`
extends `org.apache.struts2.views.jsp.ui.AbstractUITag`  

**Constructors:**
- `public AbstractClosingTag()`

**Fields:**
- `protected java.lang.String openTemplate`

**Methods:**
- `protected void populateParams()`
- `public void setOpenTemplate(java.lang.String p0)`

---

## public abstract class `org.apache.struts2.views.jsp.ui.AbstractDoubleListTag`
extends `org.apache.struts2.views.jsp.ui.AbstractRequiredListTag`  

**Constructors:**
- `public AbstractDoubleListTag()`

**Fields:**
- `protected java.lang.String doubleAccesskey`
- `protected java.lang.String doubleCssClass`
- `protected java.lang.String doubleCssStyle`
- `protected java.lang.String doubleDisabled`
- `protected java.lang.String doubleEmptyOption`
- `protected java.lang.String doubleHeaderKey`
- `protected java.lang.String doubleHeaderValue`
- `protected java.lang.String doubleId`
- `protected java.lang.String doubleList`
- `protected java.lang.String doubleListCssClass`
- `protected java.lang.String doubleListCssStyle`
- `protected java.lang.String doubleListKey`
- `protected java.lang.String doubleListTitle`
- `protected java.lang.String doubleListValue`
- `protected java.lang.String doubleMultiple`
- `protected java.lang.String doubleName`
- `protected java.lang.String doubleOnblur`
- `protected java.lang.String doubleOnchange`
- `protected java.lang.String doubleOnclick`
- `protected java.lang.String doubleOndblclick`
- `protected java.lang.String doubleOnfocus`
- `protected java.lang.String doubleOnkeydown`
- `protected java.lang.String doubleOnkeypress`
- `protected java.lang.String doubleOnkeyup`
- `protected java.lang.String doubleOnmousedown`
- `protected java.lang.String doubleOnmousemove`
- `protected java.lang.String doubleOnmouseout`
- `protected java.lang.String doubleOnmouseover`
- `protected java.lang.String doubleOnmouseup`
- `protected java.lang.String doubleOnselect`
- `protected java.lang.String doubleSize`
- `protected java.lang.String doubleValue`
- `protected java.lang.String emptyOption`
- `protected java.lang.String formName`
- `protected java.lang.String headerKey`
- `protected java.lang.String headerValue`
- `protected java.lang.String multiple`
- `protected java.lang.String size`

**Methods:**
- `public java.lang.String getDoubleCssClass()`
- `public java.lang.String getDoubleCssStyle()`
- `public java.lang.String getDoubleDisabled()`
- `public java.lang.String getDoubleEmptyOption()`
- `public java.lang.String getDoubleHeaderKey()`
- `public java.lang.String getDoubleHeaderValue()`
- `public java.lang.String getDoubleId()`
- `public java.lang.String getDoubleList()`
- `public java.lang.String getDoubleListKey()`
- `public java.lang.String getDoubleListValue()`
- `public java.lang.String getDoubleMultiple()`
- `public java.lang.String getDoubleName()`
- `public java.lang.String getDoubleOnblur()`
- `public java.lang.String getDoubleOnchange()`
- `public java.lang.String getDoubleOnclick()`
- `public java.lang.String getDoubleOndblclick()`
- `public java.lang.String getDoubleOnfocus()`
- `public java.lang.String getDoubleOnkeydown()`
- `public java.lang.String getDoubleOnkeypress()`
- `public java.lang.String getDoubleOnkeyup()`
- `public java.lang.String getDoubleOnmousedown()`
- `public java.lang.String getDoubleOnmousemove()`
- `public java.lang.String getDoubleOnmouseout()`
- `public java.lang.String getDoubleOnmouseover()`
- `public java.lang.String getDoubleOnmouseup()`
- `public java.lang.String getDoubleOnselect()`
- `public java.lang.String getDoubleSize()`
- `public java.lang.String getDoubleValue()`
- `public java.lang.String getFormName()`
- `protected void populateParams()`
- `public void setDoubleAccesskey(java.lang.String p0)`
- `public void setDoubleCssClass(java.lang.String p0)`
- `public void setDoubleCssStyle(java.lang.String p0)`
- `public void setDoubleDisabled(java.lang.String p0)`
- `public void setDoubleEmptyOption(java.lang.String p0)`
- `public void setDoubleHeaderKey(java.lang.String p0)`
- `public void setDoubleHeaderValue(java.lang.String p0)`
- `public void setDoubleId(java.lang.String p0)`
- `public void setDoubleList(java.lang.String p0)`
- `public void setDoubleListCssClass(java.lang.String p0)`
- `public void setDoubleListCssStyle(java.lang.String p0)`
- `public void setDoubleListKey(java.lang.String p0)`
- `public void setDoubleListTitle(java.lang.String p0)`
- `public void setDoubleListValue(java.lang.String p0)`
- `public void setDoubleMultiple(java.lang.String p0)`
- `public void setDoubleName(java.lang.String p0)`
- `public void setDoubleOnblur(java.lang.String p0)`
- `public void setDoubleOnchange(java.lang.String p0)`
- `public void setDoubleOnclick(java.lang.String p0)`
- `public void setDoubleOndblclick(java.lang.String p0)`
- `public void setDoubleOnfocus(java.lang.String p0)`
- `public void setDoubleOnkeydown(java.lang.String p0)`
- `public void setDoubleOnkeypress(java.lang.String p0)`
- `public void setDoubleOnkeyup(java.lang.String p0)`
- `public void setDoubleOnmousedown(java.lang.String p0)`
- `public void setDoubleOnmousemove(java.lang.String p0)`
- `public void setDoubleOnmouseout(java.lang.String p0)`
- `public void setDoubleOnmouseover(java.lang.String p0)`
- `public void setDoubleOnmouseup(java.lang.String p0)`
- `public void setDoubleOnselect(java.lang.String p0)`
- `public void setDoubleSize(java.lang.String p0)`
- `public void setDoubleValue(java.lang.String p0)`
- `public void setEmptyOption(java.lang.String p0)`
- `public void setFormName(java.lang.String p0)`
- `public void setHeaderKey(java.lang.String p0)`
- `public void setHeaderValue(java.lang.String p0)`
- `public void setMultiple(java.lang.String p0)`
- `public void setSize(java.lang.String p0)`

---

## public abstract class `org.apache.struts2.views.jsp.ui.AbstractListTag`
extends `org.apache.struts2.views.jsp.ui.AbstractUITag`  

**Constructors:**
- `public AbstractListTag()`

**Fields:**
- `protected java.lang.String list`
- `protected java.lang.String listCssClass`
- `protected java.lang.String listCssStyle`
- `protected java.lang.String listKey`
- `protected java.lang.String listLabelKey`
- `protected java.lang.String listTitle`
- `protected java.lang.String listValue`
- `protected java.lang.String listValueKey`

**Methods:**
- `protected void populateParams()`
- `public void setList(java.lang.String p0)`
- `public void setListCssClass(java.lang.String p0)`
- `public void setListCssStyle(java.lang.String p0)`
- `public void setListKey(java.lang.String p0)`
- `public void setListLabelKey(java.lang.String p0)`
- `public void setListTitle(java.lang.String p0)`
- `public void setListValue(java.lang.String p0)`
- `public void setListValueKey(java.lang.String p0)`

---

## public abstract class `org.apache.struts2.views.jsp.ui.AbstractRequiredListTag`
extends `org.apache.struts2.views.jsp.ui.AbstractListTag`  

**Constructors:**
- `public AbstractRequiredListTag()`

**Methods:**
- `protected void populateParams()`

---

## public abstract class `org.apache.struts2.views.jsp.ui.AbstractUITag`
extends `org.apache.struts2.views.jsp.ComponentTagSupport`  
implements `javax.servlet.jsp.tagext.DynamicAttributes`  

**Constructors:**
- `public AbstractUITag()`

**Fields:**
- `protected java.lang.String accesskey`
- `protected java.lang.String cssClass`
- `protected java.lang.String cssErrorClass`
- `protected java.lang.String cssErrorStyle`
- `protected java.lang.String cssStyle`
- `protected java.lang.String disabled`
- `protected java.util.Map dynamicAttributes`
- `protected java.lang.String errorPosition`
- `protected java.lang.String id`
- `protected java.lang.String javascriptTooltip`
- `protected java.lang.String key`
- `protected java.lang.String label`
- `protected java.lang.String labelSeparator`
- `protected java.lang.String labelposition`
- `protected java.lang.String name`
- `protected java.lang.String onblur`
- `protected java.lang.String onchange`
- `protected java.lang.String onclick`
- `protected java.lang.String ondblclick`
- `protected java.lang.String onfocus`
- `protected java.lang.String onkeydown`
- `protected java.lang.String onkeypress`
- `protected java.lang.String onkeyup`
- `protected java.lang.String onmousedown`
- `protected java.lang.String onmousemove`
- `protected java.lang.String onmouseout`
- `protected java.lang.String onmouseover`
- `protected java.lang.String onmouseup`
- `protected java.lang.String onselect`
- `protected java.lang.String requiredLabel`
- `protected java.lang.String requiredPosition`
- `protected java.lang.String tabindex`
- `protected java.lang.String template`
- `protected java.lang.String templateDir`
- `protected java.lang.String theme`
- `protected java.lang.String title`
- `protected java.lang.String tooltip`
- `protected java.lang.String tooltipConfig`
- `protected java.lang.String tooltipCssClass`
- `protected java.lang.String tooltipDelay`
- `protected java.lang.String tooltipIconPath`
- `protected java.lang.String value`

**Methods:**
- `protected void populateParams()`
- `public void setAccesskey(java.lang.String p0)`
- `public void setClass(java.lang.String p0)`
- `public void setCssClass(java.lang.String p0)`
- `public void setCssErrorClass(java.lang.String p0)`
- `public void setCssErrorStyle(java.lang.String p0)`
- `public void setCssStyle(java.lang.String p0)`
- `public void setDisabled(java.lang.String p0)`
- `public void setDynamicAttribute(java.lang.String p0, java.lang.String p1, java.lang.Object p2) throws javax.servlet.jsp.JspException`
- `public void setErrorPosition(java.lang.String p0)`
- `public void setId(java.lang.String p0)`
- `public void setJavascriptTooltip(java.lang.String p0)`
- `public void setKey(java.lang.String p0)`
- `public void setLabel(java.lang.String p0)`
- `public void setLabelSeparator(java.lang.String p0)`
- `public void setLabelposition(java.lang.String p0)`
- `public void setName(java.lang.String p0)`
- `public void setOnblur(java.lang.String p0)`
- `public void setOnchange(java.lang.String p0)`
- `public void setOnclick(java.lang.String p0)`
- `public void setOndblclick(java.lang.String p0)`
- `public void setOnfocus(java.lang.String p0)`
- `public void setOnkeydown(java.lang.String p0)`
- `public void setOnkeypress(java.lang.String p0)`
- `public void setOnkeyup(java.lang.String p0)`
- `public void setOnmousedown(java.lang.String p0)`
- `public void setOnmousemove(java.lang.String p0)`
- `public void setOnmouseout(java.lang.String p0)`
- `public void setOnmouseover(java.lang.String p0)`
- `public void setOnmouseup(java.lang.String p0)`
- `public void setOnselect(java.lang.String p0)`
- `public void setRequiredLabel(java.lang.String p0)`
- `public void setRequiredPosition(java.lang.String p0)`
- `public void setStyle(java.lang.String p0)`
- `public void setTabindex(java.lang.String p0)`
- `public void setTemplate(java.lang.String p0)`
- `public void setTemplateDir(java.lang.String p0)`
- `public void setTheme(java.lang.String p0)`
- `public void setTitle(java.lang.String p0)`
- `public void setTooltip(java.lang.String p0)`
- `public void setTooltipConfig(java.lang.String p0)`
- `public void setTooltipCssClass(java.lang.String p0)`
- `public void setTooltipDelay(java.lang.String p0)`
- `public void setTooltipIconPath(java.lang.String p0)`
- `public void setValue(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.ui.AbstractUITagBeanInfo`
extends `java.beans.SimpleBeanInfo`  

**Constructors:**
- `public AbstractUITagBeanInfo()`

**Methods:**
- `public java.beans.PropertyDescriptor[] getPropertyDescriptors()`

---

## public class `org.apache.struts2.views.jsp.ui.ActionErrorTag`
extends `org.apache.struts2.views.jsp.ui.AbstractUITag`  

**Constructors:**
- `public ActionErrorTag()`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setEscape(boolean p0)`

---

## public class `org.apache.struts2.views.jsp.ui.ActionMessageTag`
extends `org.apache.struts2.views.jsp.ui.AbstractUITag`  

**Constructors:**
- `public ActionMessageTag()`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setEscape(boolean p0)`

---

## public class `org.apache.struts2.views.jsp.ui.AnchorTag`
extends `org.apache.struts2.views.jsp.ui.AbstractClosingTag`  

**Constructors:**
- `public AnchorTag()`

**Fields:**
- `protected java.lang.String action`
- `protected java.lang.String anchor`
- `protected java.lang.String encode`
- `protected java.lang.String escapeAmp`
- `protected java.lang.String forceAddSchemeHostAndPort`
- `protected java.lang.String href`
- `protected java.lang.String includeContext`
- `protected java.lang.String includeParams`
- `protected java.lang.String method`
- `protected java.lang.String namespace`
- `protected java.lang.String portletMode`
- `protected java.lang.String portletUrlType`
- `protected java.lang.String scheme`
- `protected java.lang.String windowState`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setAction(java.lang.String p0)`
- `public void setAnchor(java.lang.String p0)`
- `public void setEncode(java.lang.String p0)`
- `public void setEscapeAmp(java.lang.String p0)`
- `public void setForceAddSchemeHostAndPort(java.lang.String p0)`
- `public void setHref(java.lang.String p0)`
- `public void setIncludeContext(java.lang.String p0)`
- `public void setIncludeParams(java.lang.String p0)`
- `public void setMethod(java.lang.String p0)`
- `public void setNamespace(java.lang.String p0)`
- `public void setPortletMode(java.lang.String p0)`
- `public void setPortletUrlType(java.lang.String p0)`
- `public void setScheme(java.lang.String p0)`
- `public void setValue(java.lang.String p0)`
- `public void setWindowState(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.ui.CheckboxListTag`
extends `org.apache.struts2.views.jsp.ui.AbstractRequiredListTag`  

**Constructors:**
- `public CheckboxListTag()`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

---

## public class `org.apache.struts2.views.jsp.ui.CheckboxTag`
extends `org.apache.struts2.views.jsp.ui.AbstractUITag`  

**Constructors:**
- `public CheckboxTag()`

**Fields:**
- `protected java.lang.String fieldValue`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setFieldValue(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.ui.ComboBoxTag`
extends `org.apache.struts2.views.jsp.ui.TextFieldTag`  

**Constructors:**
- `public ComboBoxTag()`

**Fields:**
- `protected java.lang.String emptyOption`
- `protected java.lang.String headerKey`
- `protected java.lang.String headerValue`
- `protected java.lang.String list`
- `protected java.lang.String listKey`
- `protected java.lang.String listValue`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setEmptyOption(java.lang.String p0)`
- `public void setHeaderKey(java.lang.String p0)`
- `public void setHeaderValue(java.lang.String p0)`
- `public void setList(java.lang.String p0)`
- `public void setListKey(java.lang.String p0)`
- `public void setListValue(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.ui.ComponentTag`
extends `org.apache.struts2.views.jsp.ui.AbstractUITag`  

**Constructors:**
- `public ComponentTag()`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

---

## public class `org.apache.struts2.views.jsp.ui.DateTextFieldTag`
extends `org.apache.struts2.views.jsp.ui.AbstractUITag`  

**Constructors:**
- `public DateTextFieldTag()`

**Fields:**
- `protected java.lang.String format`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setFormat(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.ui.DebugTag`
extends `org.apache.struts2.views.jsp.ui.AbstractUITag`  

**Constructors:**
- `public DebugTag()`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

---

## public class `org.apache.struts2.views.jsp.ui.DoubleSelectTag`
extends `org.apache.struts2.views.jsp.ui.AbstractDoubleListTag`  

**Constructors:**
- `public DoubleSelectTag()`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`

---

## public class `org.apache.struts2.views.jsp.ui.FieldErrorTag`
extends `org.apache.struts2.views.jsp.ui.AbstractUITag`  

**Constructors:**
- `public FieldErrorTag()`

**Fields:**
- `protected boolean escape`
- `protected java.lang.String fieldName`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setEscape(boolean p0)`
- `public void setFieldName(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.ui.FileTag`
extends `org.apache.struts2.views.jsp.ui.AbstractUITag`  

**Constructors:**
- `public FileTag()`

**Fields:**
- `protected java.lang.String accept`
- `protected java.lang.String size`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setAccept(java.lang.String p0)`
- `public void setSize(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.ui.FormTag`
extends `org.apache.struts2.views.jsp.ui.AbstractClosingTag`  

**Constructors:**
- `public FormTag()`

**Fields:**
- `protected java.lang.String acceptcharset`
- `protected java.lang.String action`
- `protected java.lang.String enctype`
- `protected java.lang.String focusElement`
- `protected boolean includeContext`
- `protected java.lang.String method`
- `protected java.lang.String namespace`
- `protected java.lang.String onreset`
- `protected java.lang.String onsubmit`
- `protected java.lang.String portletMode`
- `protected java.lang.String target`
- `protected java.lang.String validate`
- `protected java.lang.String windowState`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setAcceptcharset(java.lang.String p0)`
- `public void setAction(java.lang.String p0)`
- `public void setEnctype(java.lang.String p0)`
- `public void setFocusElement(java.lang.String p0)`
- `public void setIncludeContext(boolean p0)`
- `public void setMethod(java.lang.String p0)`
- `public void setNamespace(java.lang.String p0)`
- `public void setOnreset(java.lang.String p0)`
- `public void setOnsubmit(java.lang.String p0)`
- `public void setPortletMode(java.lang.String p0)`
- `public void setTarget(java.lang.String p0)`
- `public void setValidate(java.lang.String p0)`
- `public void setWindowState(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.ui.HeadTag`
extends `org.apache.struts2.views.jsp.ui.AbstractUITag`  

**Constructors:**
- `public HeadTag()`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

---

## public class `org.apache.struts2.views.jsp.ui.HiddenTag`
extends `org.apache.struts2.views.jsp.ui.AbstractUITag`  

**Constructors:**
- `public HiddenTag()`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

---

## public class `org.apache.struts2.views.jsp.ui.InputTransferSelectTag`
extends `org.apache.struts2.views.jsp.ui.AbstractListTag`  

**Constructors:**
- `public InputTransferSelectTag()`

**Fields:**
- `protected java.lang.String addLabel`
- `protected java.lang.String allowRemoveAll`
- `protected java.lang.String allowUpDown`
- `protected java.lang.String buttonCssClass`
- `protected java.lang.String buttonCssStyle`
- `protected java.lang.String downLabel`
- `protected java.lang.String headerKey`
- `protected java.lang.String headerValue`
- `protected java.lang.String leftTitle`
- `protected java.lang.String multiple`
- `protected java.lang.String removeAllLabel`
- `protected java.lang.String removeLabel`
- `protected java.lang.String rightTitle`
- `protected java.lang.String size`
- `protected java.lang.String upLabel`

**Methods:**
- `public java.lang.String getAddLabel()`
- `public java.lang.String getAllowRemoveAll()`
- `public java.lang.String getAllowUpDown()`
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getButtonCssClass()`
- `public java.lang.String getButtonCssStyle()`
- `public java.lang.String getDownLabel()`
- `public java.lang.String getHeaderKey()`
- `public java.lang.String getHeaderValue()`
- `public java.lang.String getLeftTitle()`
- `public java.lang.String getMultiple()`
- `public java.lang.String getRemoveAllLabel()`
- `public java.lang.String getRemoveLabel()`
- `public java.lang.String getRightTitle()`
- `public java.lang.String getSize()`
- `public java.lang.String getUpLabel()`
- `protected void populateParams()`
- `public void setAddLabel(java.lang.String p0)`
- `public void setAllowRemoveAll(java.lang.String p0)`
- `public void setAllowUpDown(java.lang.String p0)`
- `public void setButtonCssClass(java.lang.String p0)`
- `public void setButtonCssStyle(java.lang.String p0)`
- `public void setDownLabel(java.lang.String p0)`
- `public void setHeaderKey(java.lang.String p0)`
- `public void setHeaderValue(java.lang.String p0)`
- `public void setLeftTitle(java.lang.String p0)`
- `public void setMultiple(java.lang.String p0)`
- `public void setRemoveAllLabel(java.lang.String p0)`
- `public void setRemoveLabel(java.lang.String p0)`
- `public void setRightTitle(java.lang.String p0)`
- `public void setSize(java.lang.String p0)`
- `public void setUpLabel(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.ui.LabelTag`
extends `org.apache.struts2.views.jsp.ui.AbstractUITag`  

**Constructors:**
- `public LabelTag()`

**Fields:**
- `protected java.lang.String forAttr`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setFor(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.ui.OgnlTool`

**Constructors:**
- `public OgnlTool()`

**Methods:**
- `public java.lang.Object findValue(java.lang.String p0, java.lang.Object p1)`
- `public void setOgnlUtil(com.opensymphony.xwork2.ognl.OgnlUtil p0)`

---

## public class `org.apache.struts2.views.jsp.ui.OptGroupTag`
extends `org.apache.struts2.views.jsp.ComponentTagSupport`  

**Constructors:**
- `public OptGroupTag()`

**Fields:**
- `protected java.lang.String disabled`
- `protected java.lang.String label`
- `protected java.lang.String list`
- `protected java.lang.String listCssClass`
- `protected java.lang.String listCssStyle`
- `protected java.lang.String listKey`
- `protected java.lang.String listTitle`
- `protected java.lang.String listValue`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setDisabled(java.lang.String p0)`
- `public void setLabel(java.lang.String p0)`
- `public void setList(java.lang.String p0)`
- `public void setListCssClass(java.lang.String p0)`
- `public void setListCssStyle(java.lang.String p0)`
- `public void setListKey(java.lang.String p0)`
- `public void setListTitle(java.lang.String p0)`
- `public void setListValue(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.ui.OptionTransferSelectTag`
extends `org.apache.struts2.views.jsp.ui.AbstractDoubleListTag`  

**Constructors:**
- `public OptionTransferSelectTag()`

**Fields:**
- `protected java.lang.String addAllToLeftLabel`
- `protected java.lang.String addAllToLeftOnclick`
- `protected java.lang.String addAllToRightLabel`
- `protected java.lang.String addAllToRightOnclick`
- `protected java.lang.String addToLeftLabel`
- `protected java.lang.String addToLeftOnclick`
- `protected java.lang.String addToRightLabel`
- `protected java.lang.String addToRightOnclick`
- `protected java.lang.String allowAddAllToLeft`
- `protected java.lang.String allowAddAllToRight`
- `protected java.lang.String allowAddToLeft`
- `protected java.lang.String allowAddToRight`
- `protected java.lang.String allowSelectAll`
- `protected java.lang.String allowUpDownOnLeft`
- `protected java.lang.String allowUpDownOnRight`
- `protected java.lang.String buttonCssClass`
- `protected java.lang.String buttonCssStyle`
- `protected java.lang.String leftDownLabel`
- `protected java.lang.String leftTitle`
- `protected java.lang.String leftUpLabel`
- `protected java.lang.String rightDownLabel`
- `protected java.lang.String rightTitle`
- `protected java.lang.String rightUpLabel`
- `protected java.lang.String selectAllLabel`
- `protected java.lang.String selectAllOnclick`
- `protected java.lang.String upDownOnLeftOnclick`
- `protected java.lang.String upDownOnRightOnclick`

**Methods:**
- `public java.lang.String getAddAllToLeftLabel()`
- `public java.lang.String getAddAllToLeftOnclick()`
- `public java.lang.String getAddAllToRightLabel()`
- `public java.lang.String getAddAllToRightOnclick()`
- `public java.lang.String getAddToLeftLabel()`
- `public java.lang.String getAddToLeftOnclick()`
- `public java.lang.String getAddToRightLabel()`
- `public java.lang.String getAddToRightOnclick()`
- `public java.lang.String getAllowAddAllToLeft()`
- `public java.lang.String getAllowAddAllToRight()`
- `public java.lang.String getAllowAddToLeft()`
- `public java.lang.String getAllowAddToRight()`
- `public java.lang.String getAllowSelectAll()`
- `public java.lang.String getAllowUpDownOnLeft()`
- `public java.lang.String getAllowUpDownOnRight()`
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getButtonCssClass()`
- `public java.lang.String getButtonCssStyle()`
- `public java.lang.String getLeftDownLabel()`
- `public java.lang.String getLeftTitle()`
- `public java.lang.String getLeftUpLabel()`
- `public java.lang.String getRightDownLabel()`
- `public java.lang.String getRightTitle()`
- `public java.lang.String getRightUpLabel()`
- `public java.lang.String getSelectAllLabel()`
- `public java.lang.String getSelectAllOnclick()`
- `public java.lang.String getUpDownOnLeftOnclick()`
- `public java.lang.String getUpDownOnRightOnclick()`
- `protected void populateParams()`
- `public void setAddAllToLeftLabel(java.lang.String p0)`
- `public void setAddAllToLeftOnclick(java.lang.String p0)`
- `public void setAddAllToRightLabel(java.lang.String p0)`
- `public void setAddAllToRightOnclick(java.lang.String p0)`
- `public void setAddToLeftLabel(java.lang.String p0)`
- `public void setAddToLeftOnclick(java.lang.String p0)`
- `public void setAddToRightLabel(java.lang.String p0)`
- `public void setAddToRightOnclick(java.lang.String p0)`
- `public void setAllowAddAllToLeft(java.lang.String p0)`
- `public void setAllowAddAllToRight(java.lang.String p0)`
- `public void setAllowAddToLeft(java.lang.String p0)`
- `public void setAllowAddToRight(java.lang.String p0)`
- `public void setAllowSelectAll(java.lang.String p0)`
- `public void setAllowUpDownOnLeft(java.lang.String p0)`
- `public void setAllowUpDownOnRight(java.lang.String p0)`
- `public void setButtonCssClass(java.lang.String p0)`
- `public void setButtonCssStyle(java.lang.String p0)`
- `public void setLeftDownLabel(java.lang.String p0)`
- `public void setLeftTitle(java.lang.String p0)`
- `public void setLeftUpLabel(java.lang.String p0)`
- `public void setRightDownLabel(java.lang.String p0)`
- `public void setRightTitle(java.lang.String p0)`
- `public void setRightUpLabel(java.lang.String p0)`
- `public void setSelectAllLabel(java.lang.String p0)`
- `public void setSelectAllOnclick(java.lang.String p0)`
- `public void setUpDownOnLeftOnclick(java.lang.String p0)`
- `public void setUpDownOnRightOnclick(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.ui.PasswordTag`
extends `org.apache.struts2.views.jsp.ui.TextFieldTag`  

**Constructors:**
- `public PasswordTag()`

**Fields:**
- `protected java.lang.String showPassword`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setShow(java.lang.String p0)`
- `public void setShowPassword(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.ui.RadioTag`
extends `org.apache.struts2.views.jsp.ui.AbstractRequiredListTag`  

**Constructors:**
- `public RadioTag()`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

---

## public class `org.apache.struts2.views.jsp.ui.ResetTag`
extends `org.apache.struts2.views.jsp.ui.AbstractUITag`  

**Constructors:**
- `public ResetTag()`

**Fields:**
- `protected java.lang.String action`
- `protected java.lang.String method`
- `protected java.lang.String src`
- `protected java.lang.String type`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setAction(java.lang.String p0)`
- `public void setMethod(java.lang.String p0)`
- `public void setSrc(java.lang.String p0)`
- `public void setType(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.ui.SelectTag`
extends `org.apache.struts2.views.jsp.ui.AbstractRequiredListTag`  

**Constructors:**
- `public SelectTag()`

**Fields:**
- `protected java.lang.String emptyOption`
- `protected java.lang.String headerKey`
- `protected java.lang.String headerValue`
- `protected java.lang.String multiple`
- `protected java.lang.String size`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setEmptyOption(java.lang.String p0)`
- `public void setHeaderKey(java.lang.String p0)`
- `public void setHeaderValue(java.lang.String p0)`
- `public void setMultiple(java.lang.String p0)`
- `public void setSize(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.ui.SubmitTag`
extends `org.apache.struts2.views.jsp.ui.AbstractClosingTag`  

**Constructors:**
- `public SubmitTag()`

**Fields:**
- `protected java.lang.String action`
- `protected java.lang.String method`
- `protected java.lang.String src`
- `protected java.lang.String type`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getType()`
- `protected void populateParams()`
- `public void setAction(java.lang.String p0)`
- `public void setMethod(java.lang.String p0)`
- `public void setSrc(java.lang.String p0)`
- `public void setType(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.ui.TextFieldTag`
extends `org.apache.struts2.views.jsp.ui.AbstractUITag`  

**Constructors:**
- `public TextFieldTag()`

**Fields:**
- `protected java.lang.String maxlength`
- `protected java.lang.String readonly`
- `protected java.lang.String size`
- `protected java.lang.String type`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setMaxlength(java.lang.String p0)`
- `public void setReadonly(java.lang.String p0)`
- `public void setSize(java.lang.String p0)`
- `public void setType(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.ui.TextareaTag`
extends `org.apache.struts2.views.jsp.ui.AbstractUITag`  

**Constructors:**
- `public TextareaTag()`

**Fields:**
- `protected java.lang.String cols`
- `protected java.lang.String readonly`
- `protected java.lang.String rows`
- `protected java.lang.String wrap`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `protected void populateParams()`
- `public void setCols(java.lang.String p0)`
- `public void setReadonly(java.lang.String p0)`
- `public void setRows(java.lang.String p0)`
- `public void setWrap(java.lang.String p0)`

---

## public class `org.apache.struts2.views.jsp.ui.TokenTag`
extends `org.apache.struts2.views.jsp.ui.AbstractUITag`  

**Constructors:**
- `public TokenTag()`

**Methods:**
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`

---

## public class `org.apache.struts2.views.jsp.ui.UpDownSelectTag`
extends `org.apache.struts2.views.jsp.ui.SelectTag`  

**Constructors:**
- `public UpDownSelectTag()`

**Fields:**
- `protected java.lang.String allowMoveDown`
- `protected java.lang.String allowMoveUp`
- `protected java.lang.String allowSelectAll`
- `protected java.lang.String moveDownLabel`
- `protected java.lang.String moveUpLabel`
- `protected java.lang.String selectAllLabel`

**Methods:**
- `public java.lang.String getAllowMoveDown()`
- `public java.lang.String getAllowMoveUp()`
- `public java.lang.String getAllowSelectAll()`
- `public org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getMoveDownLabel()`
- `public java.lang.String getMoveUpLabel()`
- `public java.lang.String getSelectAllLabel()`
- `protected void populateParams()`
- `public void setAllowMoveDown(java.lang.String p0)`
- `public void setAllowMoveUp(java.lang.String p0)`
- `public void setAllowSelectAll(java.lang.String p0)`
- `public void setMoveDownLabel(java.lang.String p0)`
- `public void setMoveUpLabel(java.lang.String p0)`
- `public void setSelectAllLabel(java.lang.String p0)`

---

## public class `org.apache.struts2.views.util.ContextUtil`

**Constructors:**
- `public ContextUtil()`

**Fields:**
- `public final static java.lang.String ACTION`
- `public final static java.lang.String BASE`
- `public final static java.lang.String OGNL`
- `public final static java.lang.String REQUEST`
- `public final static java.lang.String REQUEST2`
- `public final static java.lang.String RESPONSE`
- `public final static java.lang.String RESPONSE2`
- `public final static java.lang.String SESSION`
- `public final static java.lang.String STACK`
- `public final static java.lang.String STRUTS`

**Methods:**
- `public static java.util.Map getStandardContext(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public static java.lang.String getTemplateSuffix(java.util.Map p0)`
- `public static boolean isUseAltSyntax(java.util.Map p0)`

---

## public class `org.apache.struts2.views.util.DefaultUrlHelper`
implements `org.apache.struts2.views.util.UrlHelper`  

**Constructors:**
- `public DefaultUrlHelper()`

**Fields:**
- `public final static java.lang.String HTTPS_PROTOCOL`
- `public final static java.lang.String HTTP_PROTOCOL`

**Methods:**
- `public void buildParametersString(java.util.Map p0, java.lang.StringBuilder p1, java.lang.String p2)`
- `public void buildParametersString(java.util.Map p0, java.lang.StringBuilder p1, java.lang.String p2, boolean p3)`
- `public java.lang.String buildUrl(java.lang.String p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2, java.util.Map p3)`
- `public java.lang.String buildUrl(java.lang.String p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2, java.util.Map p3, java.lang.String p4, boolean p5, boolean p6)`
- `public java.lang.String buildUrl(java.lang.String p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2, java.util.Map p3, java.lang.String p4, boolean p5, boolean p6, boolean p7)`
- `public java.lang.String buildUrl(java.lang.String p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2, java.util.Map p3, java.lang.String p4, boolean p5, boolean p6, boolean p7, boolean p8)`
- `public java.lang.String decode(java.lang.String p0)`
- `public java.lang.String decode(java.lang.String p0, boolean p1)`
- `public java.lang.String encode(java.lang.String p0)`
- `protected boolean isValidScheme(java.lang.String p0)`
- `public java.util.Map parseQueryString(java.lang.String p0, boolean p1)`
- `public void setEncoding(java.lang.String p0)`
- `public void setHttpPort(java.lang.String p0)`
- `public void setHttpsPort(java.lang.String p0)`

---

## public class `org.apache.struts2.views.util.ResourceUtil`

**Constructors:**
- `public ResourceUtil()`

**Methods:**
- `public static java.lang.String getResourceBase(javax.servlet.http.HttpServletRequest p0)`

---

## public abstract interface `org.apache.struts2.views.util.UrlHelper`

**Fields:**
- `public final static java.lang.String AMP`
- `public final static int DEFAULT_HTTPS_PORT`
- `public final static int DEFAULT_HTTP_PORT`

**Methods:**
- `public abstract void buildParametersString(java.util.Map p0, java.lang.StringBuilder p1, java.lang.String p2)`
- `public abstract java.lang.String buildUrl(java.lang.String p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2, java.util.Map p3)`
- `public abstract java.lang.String buildUrl(java.lang.String p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2, java.util.Map p3, java.lang.String p4, boolean p5, boolean p6)`
- `public abstract java.lang.String buildUrl(java.lang.String p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2, java.util.Map p3, java.lang.String p4, boolean p5, boolean p6, boolean p7)`
- `public abstract java.lang.String buildUrl(java.lang.String p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2, java.util.Map p3, java.lang.String p4, boolean p5, boolean p6, boolean p7, boolean p8)`
- `public abstract java.util.Map parseQueryString(java.lang.String p0, boolean p1)`

---

## public class `org.apache.struts2.views.velocity.StrutsResourceLoader`
extends `org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader`  

**Constructors:**
- `public StrutsResourceLoader()`

**Methods:**
- `public synchronized java.io.InputStream getResourceStream(java.lang.String p0) throws org.apache.velocity.exception.ResourceNotFoundException`

---

## public class `org.apache.struts2.views.velocity.StrutsVelocityContext`
extends `org.apache.velocity.VelocityContext`  

**Constructors:**
- `public StrutsVelocityContext(com.opensymphony.xwork2.util.ValueStack p0)`
- `public StrutsVelocityContext(org.apache.velocity.VelocityContext[] p0, com.opensymphony.xwork2.util.ValueStack p1)`

**Methods:**
- `public boolean internalContainsKey(java.lang.Object p0)`
- `public java.lang.Object internalGet(java.lang.String p0)`

---

## public class `org.apache.struts2.views.velocity.VelocityManager`

**Constructors:**
- `public VelocityManager()`

**Fields:**
- `public final static java.lang.String KEY_VELOCITY_STRUTS_CONTEXT`
- `public final static java.lang.String PARENT`
- `public final static java.lang.String STRUTS`
- `public final static java.lang.String TAG`
- `protected org.apache.velocity.tools.view.ToolboxManager toolboxManager`

**Methods:**
- `public org.apache.velocity.context.Context createContext(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public org.apache.velocity.tools.view.ToolboxManager getToolboxManager()`
- `public org.apache.velocity.app.VelocityEngine getVelocityEngine()`
- `public java.util.Properties getVelocityProperties()`
- `public synchronized void init(javax.servlet.ServletContext p0)`
- `protected void initToolbox(javax.servlet.ServletContext p0)`
- `public java.util.Properties loadConfiguration(javax.servlet.ServletContext p0)`
- `protected org.apache.velocity.app.VelocityEngine newVelocityEngine(javax.servlet.ServletContext p0)`
- `protected org.apache.velocity.VelocityContext[] prepareChainedContexts(javax.servlet.http.HttpServletRequest p0, javax.servlet.http.HttpServletResponse p1, java.util.Map p2)`
- `public void setChainedContexts(java.lang.String p0)`
- `public void setContainer(com.opensymphony.xwork2.inject.Container p0)`
- `public void setCustomConfigFile(java.lang.String p0)`
- `public void setObjectFactory(com.opensymphony.xwork2.ObjectFactory p0)`
- `public void setToolBoxLocation(java.lang.String p0)`
- `public void setVelocityProperties(java.util.Properties p0)`

---

## public abstract class `org.apache.struts2.views.velocity.components.AbstractDirective`
extends `org.apache.velocity.runtime.directive.Directive`  

**Constructors:**
- `public AbstractDirective()`

**Methods:**
- `protected java.util.Map createPropertyMap(org.apache.velocity.context.InternalContextAdapter p0, org.apache.velocity.runtime.parser.node.Node p1) throws org.apache.velocity.exception.MethodInvocationException, org.apache.velocity.exception.ParseErrorException`
- `protected abstract org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public abstract java.lang.String getBeanName()`
- `public java.lang.String getName()`
- `public int getType()`
- `protected void putProperty(java.util.Map p0, org.apache.velocity.context.InternalContextAdapter p1, org.apache.velocity.runtime.parser.node.Node p2) throws org.apache.velocity.exception.MethodInvocationException, org.apache.velocity.exception.ParseErrorException`
- `public boolean render(org.apache.velocity.context.InternalContextAdapter p0, java.io.Writer p1, org.apache.velocity.runtime.parser.node.Node p2) throws java.io.IOException, org.apache.velocity.exception.MethodInvocationException, org.apache.velocity.exception.ParseErrorException, org.apache.velocity.exception.ResourceNotFoundException`

---

## public class `org.apache.struts2.views.velocity.components.ActionDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public ActionDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.ActionErrorDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public ActionErrorDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.ActionMessageDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public ActionMessageDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.AnchorDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public AnchorDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`
- `public int getType()`

---

## public class `org.apache.struts2.views.velocity.components.BeanDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public BeanDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.CheckBoxDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public CheckBoxDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.CheckBoxListDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public CheckBoxListDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.ComboBoxDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public ComboBoxDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.ComponentDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public ComponentDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`
- `public int getType()`

---

## public class `org.apache.struts2.views.velocity.components.DateDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public DateDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.DoubleSelectDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public DoubleSelectDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.FieldErrorDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public FieldErrorDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.FileDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public FileDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.FormDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public FormDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`
- `public int getType()`

---

## public class `org.apache.struts2.views.velocity.components.HeadDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public HeadDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.HiddenDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public HiddenDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.I18nDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public I18nDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.IncludeDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public IncludeDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.InputTransferSelectDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public InputTransferSelectDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.LabelDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public LabelDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.OptGroupDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public OptGroupDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.OptionTransferSelectDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public OptionTransferSelectDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.ParamDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public ParamDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.PasswordDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public PasswordDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.PropertyDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public PropertyDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.PushDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public PushDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.RadioDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public RadioDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.ResetDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public ResetDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.SelectDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public SelectDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.SetDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public SetDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.SubmitDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public SubmitDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.TextAreaDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public TextAreaDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.TextDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public TextDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.TextFieldDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public TextFieldDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.TokenDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public TokenDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.URLDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public URLDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public class `org.apache.struts2.views.velocity.components.UpDownSelectDirective`
extends `org.apache.struts2.views.velocity.components.AbstractDirective`  

**Constructors:**
- `public UpDownSelectDirective()`

**Methods:**
- `protected org.apache.struts2.components.Component getBean(com.opensymphony.xwork2.util.ValueStack p0, javax.servlet.http.HttpServletRequest p1, javax.servlet.http.HttpServletResponse p2)`
- `public java.lang.String getBeanName()`

---

## public abstract class `org.apache.struts2.views.xslt.AbstractAdapterElement`
extends `org.apache.struts2.views.xslt.AbstractAdapterNode`  
implements `org.w3c.dom.Element`  

**Constructors:**
- `public AbstractAdapterElement()`

**Methods:**
- `protected java.util.Map buildAttributeAdapters()`
- `public java.lang.String getAttribute(java.lang.String p0)`
- `protected java.util.Map getAttributeAdapters()`
- `public java.lang.String getAttributeNS(java.lang.String p0, java.lang.String p1)`
- `public org.w3c.dom.Attr getAttributeNode(java.lang.String p0)`
- `public org.w3c.dom.Attr getAttributeNodeNS(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String getNodeName()`
- `public short getNodeType()`
- `public org.w3c.dom.TypeInfo getSchemaTypeInfo()`
- `public java.lang.String getTagName()`
- `public boolean hasAttribute(java.lang.String p0)`
- `public boolean hasAttributeNS(java.lang.String p0, java.lang.String p1)`
- `public boolean hasChildNodes()`
- `public void removeAttribute(java.lang.String p0) throws org.w3c.dom.DOMException`
- `public void removeAttributeNS(java.lang.String p0, java.lang.String p1) throws org.w3c.dom.DOMException`
- `public org.w3c.dom.Attr removeAttributeNode(org.w3c.dom.Attr p0) throws org.w3c.dom.DOMException`
- `public void setAttribute(java.lang.String p0, java.lang.String p1) throws org.w3c.dom.DOMException`
- `public void setAttributeNS(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws org.w3c.dom.DOMException`
- `public org.w3c.dom.Attr setAttributeNode(org.w3c.dom.Attr p0) throws org.w3c.dom.DOMException`
- `public org.w3c.dom.Attr setAttributeNodeNS(org.w3c.dom.Attr p0) throws org.w3c.dom.DOMException`
- `public void setIdAttribute(java.lang.String p0, boolean p1) throws org.w3c.dom.DOMException`
- `public void setIdAttributeNS(java.lang.String p0, java.lang.String p1, boolean p2) throws org.w3c.dom.DOMException`
- `public void setIdAttributeNode(org.w3c.dom.Attr p0, boolean p1) throws org.w3c.dom.DOMException`

---

## public abstract class `org.apache.struts2.views.xslt.AbstractAdapterNode`
implements `org.apache.struts2.views.xslt.AdapterNode`  

**Constructors:**
- `public AbstractAdapterNode()`

**Methods:**
- `public org.w3c.dom.Node appendChild(org.w3c.dom.Node p0) throws org.w3c.dom.DOMException`
- `protected java.util.List buildChildAdapters()`
- `public org.w3c.dom.Node cloneNode(boolean p0)`
- `public short compareDocumentPosition(org.w3c.dom.Node p0) throws org.w3c.dom.DOMException`
- `public org.apache.struts2.views.xslt.AdapterFactory getAdapterFactory()`
- `public org.w3c.dom.NamedNodeMap getAttributes()`
- `public java.lang.String getBaseURI()`
- `protected java.util.List getChildAdapters()`
- `public org.w3c.dom.Node getChildAfter(org.w3c.dom.Node p0)`
- `public org.w3c.dom.Node getChildBefore(org.w3c.dom.Node p0)`
- `public org.w3c.dom.Node getChildBeforeOrAfter(org.w3c.dom.Node p0, boolean p1)`
- `public org.w3c.dom.NodeList getChildNodes()`
- `public org.w3c.dom.NodeList getElementsByTagName(java.lang.String p0)`
- `public org.w3c.dom.NodeList getElementsByTagNameNS(java.lang.String p0, java.lang.String p1)`
- `public java.lang.Object getFeature(java.lang.String p0, java.lang.String p1)`
- `public org.w3c.dom.Node getFirstChild()`
- `public org.w3c.dom.Node getLastChild()`
- `public java.lang.String getLocalName()`
- `public java.lang.String getNamespaceURI()`
- `public org.w3c.dom.Node getNextSibling()`
- `public java.lang.String getNodeName()`
- `public short getNodeType()`
- `public java.lang.String getNodeValue() throws org.w3c.dom.DOMException`
- `public org.w3c.dom.Document getOwnerDocument()`
- `public org.apache.struts2.views.xslt.AdapterNode getParent()`
- `public org.w3c.dom.Node getParentNode()`
- `public java.lang.String getPrefix()`
- `public org.w3c.dom.Node getPreviousSibling()`
- `public java.lang.String getPropertyName()`
- `public java.lang.Object getPropertyValue()`
- `public java.lang.String getTextContent() throws org.w3c.dom.DOMException`
- `public java.lang.Object getUserData(java.lang.String p0)`
- `public boolean hasAttributes()`
- `public boolean hasChildNodes()`
- `public org.w3c.dom.Node insertBefore(org.w3c.dom.Node p0, org.w3c.dom.Node p1) throws org.w3c.dom.DOMException`
- `public boolean isDefaultNamespace(java.lang.String p0)`
- `public boolean isEqualNode(org.w3c.dom.Node p0)`
- `public boolean isSameNode(org.w3c.dom.Node p0)`
- `public boolean isSupported(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String lookupNamespaceURI(java.lang.String p0)`
- `public java.lang.String lookupPrefix(java.lang.String p0)`
- `public void normalize()`
- `protected org.apache.struts2.StrutsException operationNotSupported()`
- `public org.w3c.dom.Node removeChild(org.w3c.dom.Node p0) throws org.w3c.dom.DOMException`
- `public org.w3c.dom.Node replaceChild(org.w3c.dom.Node p0, org.w3c.dom.Node p1) throws org.w3c.dom.DOMException`
- `public void setAdapterFactory(org.apache.struts2.views.xslt.AdapterFactory p0)`
- `protected void setContext(org.apache.struts2.views.xslt.AdapterFactory p0, org.apache.struts2.views.xslt.AdapterNode p1, java.lang.String p2, java.lang.Object p3)`
- `public void setNodeValue(java.lang.String p0) throws org.w3c.dom.DOMException`
- `public void setParent(org.apache.struts2.views.xslt.AdapterNode p0)`
- `public void setPrefix(java.lang.String p0) throws org.w3c.dom.DOMException`
- `public void setPropertyName(java.lang.String p0)`
- `public void setPropertyValue(java.lang.Object p0)`
- `public void setTextContent(java.lang.String p0) throws org.w3c.dom.DOMException`
- `public java.lang.Object setUserData(java.lang.String p0, java.lang.Object p1, org.w3c.dom.UserDataHandler p2)`
- `public java.lang.String toString()`

---

## public class `org.apache.struts2.views.xslt.AdapterFactory`

**Constructors:**
- `public AdapterFactory()`

**Methods:**
- `public org.w3c.dom.Document adaptDocument(java.lang.String p0, java.lang.Object p1) throws java.lang.IllegalAccessException, java.lang.InstantiationException`
- `public org.w3c.dom.Node adaptNode(org.apache.struts2.views.xslt.AdapterNode p0, java.lang.String p1, java.lang.Object p2)`
- `public org.w3c.dom.Node adaptNullValue(org.apache.struts2.views.xslt.AdapterNode p0, java.lang.String p1)`
- `public java.lang.Class getAdapterForValue(java.lang.Object p0)`
- `public org.w3c.dom.NamedNodeMap proxyNamedNodeMap(org.apache.struts2.views.xslt.AdapterNode p0, org.w3c.dom.NamedNodeMap p1)`
- `public org.w3c.dom.Node proxyNode(org.apache.struts2.views.xslt.AdapterNode p0, org.w3c.dom.Node p1)`
- `public void registerAdapterType(java.lang.Class p0, java.lang.Class p1)`

---

## public abstract interface `org.apache.struts2.views.xslt.AdapterNode`
implements `org.w3c.dom.Node`  

**Methods:**
- `public abstract org.apache.struts2.views.xslt.AdapterFactory getAdapterFactory()`
- `public abstract org.w3c.dom.Node getChildAfter(org.w3c.dom.Node p0)`
- `public abstract org.w3c.dom.Node getChildBefore(org.w3c.dom.Node p0)`
- `public abstract org.apache.struts2.views.xslt.AdapterNode getParent()`
- `public abstract java.lang.String getPropertyName()`
- `public abstract java.lang.Object getPropertyValue()`
- `public abstract void setAdapterFactory(org.apache.struts2.views.xslt.AdapterFactory p0)`
- `public abstract void setParent(org.apache.struts2.views.xslt.AdapterNode p0)`
- `public abstract void setPropertyName(java.lang.String p0)`
- `public abstract void setPropertyValue(java.lang.Object p0)`

---

## public class `org.apache.struts2.views.xslt.ArrayAdapter`
extends `org.apache.struts2.views.xslt.AbstractAdapterElement`  

**Constructors:**
- `public ArrayAdapter()`
- `public ArrayAdapter(org.apache.struts2.views.xslt.AdapterFactory p0, org.apache.struts2.views.xslt.AdapterNode p1, java.lang.String p2, java.lang.Object p3)`

**Methods:**
- `protected java.util.List buildChildAdapters()`

---

## public class `org.apache.struts2.views.xslt.BeanAdapter`
extends `org.apache.struts2.views.xslt.AbstractAdapterElement`  

**Constructors:**
- `public BeanAdapter()`
- `public BeanAdapter(org.apache.struts2.views.xslt.AdapterFactory p0, org.apache.struts2.views.xslt.AdapterNode p1, java.lang.String p2, java.lang.Object p3)`

**Methods:**
- `protected java.util.List buildChildAdapters()`
- `public org.w3c.dom.NodeList getChildNodes()`
- `public java.lang.String getTagName()`

---

## public class `org.apache.struts2.views.xslt.CollectionAdapter`
extends `org.apache.struts2.views.xslt.AbstractAdapterElement`  

**Constructors:**
- `public CollectionAdapter()`
- `public CollectionAdapter(org.apache.struts2.views.xslt.AdapterFactory p0, org.apache.struts2.views.xslt.AdapterNode p1, java.lang.String p2, java.lang.Object p3)`

**Methods:**
- `protected java.util.List buildChildAdapters()`

---

## public class `org.apache.struts2.views.xslt.MapAdapter`
extends `org.apache.struts2.views.xslt.AbstractAdapterElement`  

**Constructors:**
- `public MapAdapter()`
- `public MapAdapter(org.apache.struts2.views.xslt.AdapterFactory p0, org.apache.struts2.views.xslt.AdapterNode p1, java.lang.String p2, java.util.Map p3)`

**Methods:**
- `protected java.util.List buildChildAdapters()`
- `public java.util.Map map()`

---

## public class `org.apache.struts2.views.xslt.ProxyAttrAdapter`
extends `org.apache.struts2.views.xslt.ProxyNodeAdapter`  
implements `org.w3c.dom.Attr`  

**Constructors:**
- `public ProxyAttrAdapter(org.apache.struts2.views.xslt.AdapterFactory p0, org.apache.struts2.views.xslt.AdapterNode p1, org.w3c.dom.Attr p2)`

**Methods:**
- `protected org.w3c.dom.Attr attr()`
- `public java.lang.String getName()`
- `public org.w3c.dom.Element getOwnerElement()`
- `public org.w3c.dom.TypeInfo getSchemaTypeInfo()`
- `public boolean getSpecified()`
- `public java.lang.String getValue()`
- `public boolean isId()`
- `public void setValue(java.lang.String p0) throws org.w3c.dom.DOMException`
- `public java.lang.String toString()`

---

## public class `org.apache.struts2.views.xslt.ProxyElementAdapter`
extends `org.apache.struts2.views.xslt.ProxyNodeAdapter`  
implements `org.w3c.dom.Element`  

**Constructors:**
- `public ProxyElementAdapter(org.apache.struts2.views.xslt.AdapterFactory p0, org.apache.struts2.views.xslt.AdapterNode p1, org.w3c.dom.Element p2)`

**Methods:**
- `protected java.util.List buildChildAdapters()`
- `protected org.w3c.dom.Element element()`
- `public java.lang.String getAttribute(java.lang.String p0)`
- `public java.lang.String getAttributeNS(java.lang.String p0, java.lang.String p1)`
- `public org.w3c.dom.Attr getAttributeNode(java.lang.String p0)`
- `public org.w3c.dom.Attr getAttributeNodeNS(java.lang.String p0, java.lang.String p1)`
- `public org.w3c.dom.NodeList getElementsByTagName(java.lang.String p0)`
- `public org.w3c.dom.NodeList getElementsByTagNameNS(java.lang.String p0, java.lang.String p1)`
- `public org.w3c.dom.TypeInfo getSchemaTypeInfo()`
- `public java.lang.String getTagName()`
- `public boolean hasAttribute(java.lang.String p0)`
- `public boolean hasAttributeNS(java.lang.String p0, java.lang.String p1)`
- `public void removeAttribute(java.lang.String p0) throws org.w3c.dom.DOMException`
- `public void removeAttributeNS(java.lang.String p0, java.lang.String p1) throws org.w3c.dom.DOMException`
- `public org.w3c.dom.Attr removeAttributeNode(org.w3c.dom.Attr p0) throws org.w3c.dom.DOMException`
- `public void setAttribute(java.lang.String p0, java.lang.String p1) throws org.w3c.dom.DOMException`
- `public void setAttributeNS(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws org.w3c.dom.DOMException`
- `public org.w3c.dom.Attr setAttributeNode(org.w3c.dom.Attr p0) throws org.w3c.dom.DOMException`
- `public org.w3c.dom.Attr setAttributeNodeNS(org.w3c.dom.Attr p0) throws org.w3c.dom.DOMException`
- `public void setIdAttribute(java.lang.String p0, boolean p1) throws org.w3c.dom.DOMException`
- `public void setIdAttributeNS(java.lang.String p0, java.lang.String p1, boolean p2) throws org.w3c.dom.DOMException`
- `public void setIdAttributeNode(org.w3c.dom.Attr p0, boolean p1) throws org.w3c.dom.DOMException`
- `public java.lang.String toString()`

---

## public class `org.apache.struts2.views.xslt.ProxyNamedNodeMap`
implements `org.w3c.dom.NamedNodeMap`  

**Constructors:**
- `public ProxyNamedNodeMap(org.apache.struts2.views.xslt.AdapterFactory p0, org.apache.struts2.views.xslt.AdapterNode p1, org.w3c.dom.NamedNodeMap p2)`

**Methods:**
- `public int getLength()`
- `public org.w3c.dom.Node getNamedItem(java.lang.String p0)`
- `public org.w3c.dom.Node getNamedItemNS(java.lang.String p0, java.lang.String p1)`
- `public org.w3c.dom.Node item(int p0)`
- `public org.w3c.dom.Node removeNamedItem(java.lang.String p0) throws org.w3c.dom.DOMException`
- `public org.w3c.dom.Node removeNamedItemNS(java.lang.String p0, java.lang.String p1) throws org.w3c.dom.DOMException`
- `public org.w3c.dom.Node setNamedItem(org.w3c.dom.Node p0) throws org.w3c.dom.DOMException`
- `public org.w3c.dom.Node setNamedItemNS(org.w3c.dom.Node p0) throws org.w3c.dom.DOMException`
- `protected org.w3c.dom.Node wrap(org.w3c.dom.Node p0)`

---

## public abstract class `org.apache.struts2.views.xslt.ProxyNodeAdapter`
extends `org.apache.struts2.views.xslt.AbstractAdapterNode`  

**Constructors:**
- `public ProxyNodeAdapter(org.apache.struts2.views.xslt.AdapterFactory p0, org.apache.struts2.views.xslt.AdapterNode p1, org.w3c.dom.Node p2)`

**Methods:**
- `public org.w3c.dom.NamedNodeMap getAttributes()`
- `public java.lang.String getLocalName()`
- `public java.lang.String getNamespaceURI()`
- `public java.lang.String getNodeName()`
- `public short getNodeType()`
- `public java.lang.String getNodeValue() throws org.w3c.dom.DOMException`
- `public java.lang.String getPrefix()`
- `public boolean hasAttributes()`
- `public boolean hasChildNodes()`
- `public boolean isSupported(java.lang.String p0, java.lang.String p1)`
- `protected org.w3c.dom.Node node()`
- `public java.lang.String toString()`
- `protected org.w3c.dom.NamedNodeMap wrap(org.w3c.dom.NamedNodeMap p0)`
- `protected org.w3c.dom.Node wrap(org.w3c.dom.Node p0)`

---

## public class `org.apache.struts2.views.xslt.ProxyTextNodeAdapter`
extends `org.apache.struts2.views.xslt.ProxyNodeAdapter`  
implements `org.w3c.dom.Text`  

**Constructors:**
- `public ProxyTextNodeAdapter(org.apache.struts2.views.xslt.AdapterFactory p0, org.apache.struts2.views.xslt.AdapterNode p1, org.w3c.dom.Text p2)`

**Methods:**
- `public void appendData(java.lang.String p0) throws org.w3c.dom.DOMException`
- `public void deleteData(int p0, int p1) throws org.w3c.dom.DOMException`
- `public java.lang.String getData() throws org.w3c.dom.DOMException`
- `public int getLength()`
- `public java.lang.String getWholeText()`
- `public void insertData(int p0, java.lang.String p1) throws org.w3c.dom.DOMException`
- `public boolean isElementContentWhitespace()`
- `public void replaceData(int p0, int p1, java.lang.String p2) throws org.w3c.dom.DOMException`
- `public org.w3c.dom.Text replaceWholeText(java.lang.String p0) throws org.w3c.dom.DOMException`
- `public void setData(java.lang.String p0) throws org.w3c.dom.DOMException`
- `public org.w3c.dom.Text splitText(int p0) throws org.w3c.dom.DOMException`
- `public java.lang.String substringData(int p0, int p1) throws org.w3c.dom.DOMException`
- `public java.lang.String toString()`

---

## public class `org.apache.struts2.views.xslt.ServletURIResolver`
implements `javax.xml.transform.URIResolver`  

**Constructors:**
- `public ServletURIResolver(javax.servlet.ServletContext p0)`

**Methods:**
- `public javax.xml.transform.Source resolve(java.lang.String p0, java.lang.String p1) throws javax.xml.transform.TransformerException`

---

## public class `org.apache.struts2.views.xslt.SimpleAdapterDocument`
extends `org.apache.struts2.views.xslt.AbstractAdapterNode`  
implements `org.w3c.dom.Document`  

**Constructors:**
- `public SimpleAdapterDocument(org.apache.struts2.views.xslt.AdapterFactory p0, org.apache.struts2.views.xslt.AdapterNode p1, java.lang.String p2, java.lang.Object p3)`

**Methods:**
- `public org.w3c.dom.Node adoptNode(org.w3c.dom.Node p0) throws org.w3c.dom.DOMException`
- `public org.w3c.dom.Attr createAttribute(java.lang.String p0) throws org.w3c.dom.DOMException`
- `public org.w3c.dom.Attr createAttributeNS(java.lang.String p0, java.lang.String p1) throws org.w3c.dom.DOMException`
- `public org.w3c.dom.CDATASection createCDATASection(java.lang.String p0) throws org.w3c.dom.DOMException`
- `public org.w3c.dom.Comment createComment(java.lang.String p0)`
- `public org.w3c.dom.DocumentFragment createDocumentFragment()`
- `public org.w3c.dom.Element createElement(java.lang.String p0) throws org.w3c.dom.DOMException`
- `public org.w3c.dom.Element createElementNS(java.lang.String p0, java.lang.String p1) throws org.w3c.dom.DOMException`
- `public org.w3c.dom.EntityReference createEntityReference(java.lang.String p0) throws org.w3c.dom.DOMException`
- `public org.w3c.dom.ProcessingInstruction createProcessingInstruction(java.lang.String p0, java.lang.String p1) throws org.w3c.dom.DOMException`
- `public org.w3c.dom.Text createTextNode(java.lang.String p0)`
- `protected java.util.List getChildAdapters()`
- `public org.w3c.dom.Node getChildAfter(org.w3c.dom.Node p0)`
- `public org.w3c.dom.Node getChildBefore(org.w3c.dom.Node p0)`
- `public org.w3c.dom.NodeList getChildNodes()`
- `public org.w3c.dom.DocumentType getDoctype()`
- `public org.w3c.dom.Element getDocumentElement()`
- `public java.lang.String getDocumentURI()`
- `public org.w3c.dom.DOMConfiguration getDomConfig()`
- `public org.w3c.dom.Element getElementById(java.lang.String p0)`
- `public org.w3c.dom.NodeList getElementsByTagName(java.lang.String p0)`
- `public org.w3c.dom.NodeList getElementsByTagNameNS(java.lang.String p0, java.lang.String p1)`
- `public org.w3c.dom.Node getFirstChild()`
- `public org.w3c.dom.DOMImplementation getImplementation()`
- `public java.lang.String getInputEncoding()`
- `public org.w3c.dom.Node getLastChild()`
- `public java.lang.String getNodeName()`
- `public short getNodeType()`
- `public boolean getStrictErrorChecking()`
- `public java.lang.String getXmlEncoding()`
- `public boolean getXmlStandalone()`
- `public java.lang.String getXmlVersion()`
- `public boolean hasChildNodes()`
- `public org.w3c.dom.Node importNode(org.w3c.dom.Node p0, boolean p1) throws org.w3c.dom.DOMException`
- `public void normalizeDocument()`
- `public org.w3c.dom.Node renameNode(org.w3c.dom.Node p0, java.lang.String p1, java.lang.String p2) throws org.w3c.dom.DOMException`
- `public void setDocumentURI(java.lang.String p0)`
- `public void setPropertyValue(java.lang.Object p0)`
- `public void setStrictErrorChecking(boolean p0)`
- `public void setXmlStandalone(boolean p0) throws org.w3c.dom.DOMException`
- `public void setXmlVersion(java.lang.String p0) throws org.w3c.dom.DOMException`

---

## public class `org.apache.struts2.views.xslt.SimpleNodeList`
implements `org.w3c.dom.NodeList`  

**Constructors:**
- `public SimpleNodeList(java.util.List p0)`

**Methods:**
- `public int getLength()`
- `public org.w3c.dom.Node item(int p0)`
- `public java.lang.String toString()`

---

## public class `org.apache.struts2.views.xslt.SimpleTextNode`
extends `org.apache.struts2.views.xslt.AbstractAdapterNode`  
implements `org.w3c.dom.Node`, `org.w3c.dom.Text`  

**Constructors:**
- `public SimpleTextNode(org.apache.struts2.views.xslt.AdapterFactory p0, org.apache.struts2.views.xslt.AdapterNode p1, java.lang.String p2, java.lang.Object p3)`

**Methods:**
- `public void appendData(java.lang.String p0) throws org.w3c.dom.DOMException`
- `public void deleteData(int p0, int p1) throws org.w3c.dom.DOMException`
- `public java.lang.String getData() throws org.w3c.dom.DOMException`
- `public int getLength()`
- `public java.lang.String getNodeName()`
- `public short getNodeType()`
- `public java.lang.String getNodeValue() throws org.w3c.dom.DOMException`
- `protected java.lang.String getStringValue()`
- `public java.lang.String getWholeText()`
- `public void insertData(int p0, java.lang.String p1) throws org.w3c.dom.DOMException`
- `public boolean isElementContentWhitespace()`
- `public void replaceData(int p0, int p1, java.lang.String p2) throws org.w3c.dom.DOMException`
- `public org.w3c.dom.Text replaceWholeText(java.lang.String p0) throws org.w3c.dom.DOMException`
- `public void setData(java.lang.String p0) throws org.w3c.dom.DOMException`
- `public org.w3c.dom.Text splitText(int p0) throws org.w3c.dom.DOMException`
- `public java.lang.String substringData(int p0, int p1) throws org.w3c.dom.DOMException`

---

## public class `org.apache.struts2.views.xslt.StringAdapter`
extends `org.apache.struts2.views.xslt.AbstractAdapterElement`  

**Constructors:**
- `public StringAdapter()`
- `public StringAdapter(org.apache.struts2.views.xslt.AdapterFactory p0, org.apache.struts2.views.xslt.AdapterNode p1, java.lang.String p2, java.lang.String p3)`

**Methods:**
- `protected java.util.List buildChildAdapters()`
- `public boolean getParseStringAsXML()`
- `protected java.lang.String getStringValue()`
- `public void setParseStringAsXML(boolean p0)`

---

## public class `org.apache.struts2.views.xslt.XSLTResult`
implements `com.opensymphony.xwork2.Result`  

**Constructors:**
- `public XSLTResult()`
- `public XSLTResult(java.lang.String p0)`

**Fields:**
- `public final static java.lang.String DEFAULT_PARAM`
- `protected boolean noCache`

**Methods:**
- `protected javax.xml.transform.ErrorListener buildErrorListener()`
- `public void execute(com.opensymphony.xwork2.ActionInvocation p0) throws java.lang.Exception`
- `protected org.apache.struts2.views.xslt.AdapterFactory getAdapterFactory()`
- `protected javax.xml.transform.Source getDOMSourceForStack(java.lang.Object p0) throws java.lang.IllegalAccessException, java.lang.InstantiationException`
- `public java.lang.String getEncoding()`
- `public java.lang.String getExposedValue()`
- `public java.lang.String getStatus()`
- `public java.lang.String getStylesheetLocation()`
- `protected javax.xml.transform.Templates getTemplates(java.lang.String p0) throws java.io.IOException, javax.xml.transform.TransformerException`
- `protected javax.xml.transform.URIResolver getURIResolver()`
- `protected void setAdapterFactory(org.apache.struts2.views.xslt.AdapterFactory p0)`
- `public void setEncoding(java.lang.String p0)`
- `public void setExposedValue(java.lang.String p0)`
- `public void setNoCache(java.lang.String p0)`
- `public void setParse(boolean p0)`
- `public void setStatus(java.lang.String p0)`
- `public void setStylesheetLocation(java.lang.String p0)`

---

