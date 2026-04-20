# Breaking Changes: org.apache.struts:struts2-core 2.3.37 → 2.5.26
Total: 243 (binary-breaking: 148, source-breaking: 228)

## com.opensymphony.xwork2.config.ServletContextAwareConfigurationProvider

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.opensymphony.xwork2.config.ServletContextAwareConfigurationProvider`
+ MUST NOW IMPLEMENT: `com.opensymphony.xwork2.config.PackageProvider.loadPackages()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.opensymphony.xwork2.config.ServletContextAwareConfigurationProvider`
+ MUST NOW IMPLEMENT: `com.opensymphony.xwork2.config.ContainerProvider.register(com.opensymphony.xwork2.inject.ContainerBuilder,com.opensymphony.xwork2.util.location.LocatableProperties)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.opensymphony.xwork2.config.ServletContextAwareConfigurationProvider`
+ MUST NOW IMPLEMENT: `com.opensymphony.xwork2.config.ContainerProvider.needsReload()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.opensymphony.xwork2.config.ServletContextAwareConfigurationProvider`
+ MUST NOW IMPLEMENT: `com.opensymphony.xwork2.config.ContainerProvider.init(com.opensymphony.xwork2.config.Configuration)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.opensymphony.xwork2.config.ServletContextAwareConfigurationProvider`
+ MUST NOW IMPLEMENT: `com.opensymphony.xwork2.config.ContainerProvider.destroy()`

## org.apache.struts2.StrutsConstants

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.struts2.StrutsConstants.STRUTS_FREEMARKER_TEMPLATES_CACHE`

## org.apache.struts2.components.ActionComponent

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.components.ContextBean.setId(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.struts2.components.ActionComponent.createParametersForContext()`
+ NEW RETURN TYPE: `org.apache.struts2.components.ActionComponent.createParametersForContext()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.struts2.components.ActionComponent.createParametersForContext()`
+ NEW RETURN TYPE: `org.apache.struts2.components.ActionComponent.createParametersForContext()`

## org.apache.struts2.components.ActionError

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

## org.apache.struts2.components.ActionMessage

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

## org.apache.struts2.components.Anchor

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

## org.apache.struts2.components.AppendIterator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.components.ContextBean.setId(java.lang.String)`

## org.apache.struts2.components.Bean

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.components.Bean.LOG`
+ NEW FIELD: `org.apache.struts2.components.Bean.LOG`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.struts2.components.Bean.LOG`
+ NEW FIELD: `org.apache.struts2.components.Bean.LOG`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.components.ContextBean.setId(java.lang.String)`

## org.apache.struts2.components.Checkbox

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.struts2.components.Checkbox.readonly`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.components.Checkbox.setReadonly(java.lang.String)`

## org.apache.struts2.components.CheckboxList

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.struts2.components.CheckboxList.readonly`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.components.CheckboxList.setReadonly(java.lang.String)`

## org.apache.struts2.components.ClosingUIBean

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

## org.apache.struts2.components.ComboBox

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

## org.apache.struts2.components.ContextBean

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.components.ContextBean.setId(java.lang.String)`

## org.apache.struts2.components.Date

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.components.ContextBean.setId(java.lang.String)`

## org.apache.struts2.components.DateTextField

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

## org.apache.struts2.components.Debug

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

## org.apache.struts2.components.Div

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.components.Div`

## org.apache.struts2.components.DoubleListUIBean

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

## org.apache.struts2.components.DoubleSelect

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

## org.apache.struts2.components.FieldError

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

## org.apache.struts2.components.File

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

## org.apache.struts2.components.Form

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

## org.apache.struts2.components.Form$FieldVisitorValidatorWrapper

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.struts2.components.Form$FieldVisitorValidatorWrapper.validate(java.lang.Object)`
+ NOW THROWS: `org.apache.struts2.components.Form$FieldVisitorValidatorWrapper.validate(java.lang.Object)`

## org.apache.struts2.components.FormButton

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.struts2.components.FormButton.align`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.components.FormButton.setAlign(java.lang.String)`

## org.apache.struts2.components.GenericUIBean

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

## org.apache.struts2.components.Head

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

## org.apache.struts2.components.Hidden

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

## org.apache.struts2.components.I18n

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.struts2.components.I18n.container`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.components.I18n.setContainer(com.opensymphony.xwork2.inject.Container)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.components.I18n.setLocaleProvider(com.opensymphony.xwork2.LocaleProvider)`

## org.apache.struts2.components.Include

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.components.Include.include(java.lang.String,java.io.Writer,javax.servlet.ServletRequest,javax.servlet.http.HttpServletResponse)`

## org.apache.struts2.components.InputTransferSelect

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

## org.apache.struts2.components.IteratorComponent

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.components.ContextBean.setId(java.lang.String)`

## org.apache.struts2.components.Label

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

## org.apache.struts2.components.ListUIBean

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

## org.apache.struts2.components.MergeIterator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.components.ContextBean.setId(java.lang.String)`

## org.apache.struts2.components.Number

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.components.ContextBean.setId(java.lang.String)`

## org.apache.struts2.components.OptionTransferSelect

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

## org.apache.struts2.components.Password

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

## org.apache.struts2.components.Property

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.components.Property.setEscape(boolean)`

## org.apache.struts2.components.Radio

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.struts2.components.Radio.readonly`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.components.Radio.setReadonly(java.lang.String)`

## org.apache.struts2.components.Reset

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.struts2.components.FormButton.align`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.components.FormButton.setAlign(java.lang.String)`

## org.apache.struts2.components.Select

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

## org.apache.struts2.components.Set

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.components.ContextBean.setId(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.components.Set.setName(java.lang.String)`

## org.apache.struts2.components.Submit

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.struts2.components.FormButton.align`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.components.FormButton.setAlign(java.lang.String)`

## org.apache.struts2.components.Text

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.components.ContextBean.setId(java.lang.String)`

## org.apache.struts2.components.TextArea

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

## org.apache.struts2.components.TextField

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

## org.apache.struts2.components.Token

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.components.Token.getTokenNameField()`

## org.apache.struts2.components.UIBean

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

## org.apache.struts2.components.URL

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.components.ContextBean.setId(java.lang.String)`

## org.apache.struts2.components.UpDownSelect

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.components.UIBean.setDynamicAttributes(java.util.Map<java.lang.String,java.lang.Object>)`

## org.apache.struts2.config.AbstractBeanSelectionProvider

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.struts2.config.AbstractBeanSelectionProvider`
+ MUST NOW IMPLEMENT: `com.opensymphony.xwork2.config.ContainerProvider.register(com.opensymphony.xwork2.inject.ContainerBuilder,com.opensymphony.xwork2.util.location.LocatableProperties)`

## org.apache.struts2.config.ServletContextSingleton

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.config.ServletContextSingleton`

## org.apache.struts2.dispatcher.ActionContextCleanUp

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.dispatcher.ActionContextCleanUp`

## org.apache.struts2.dispatcher.DefaultStaticContentLoader

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.dispatcher.DefaultStaticContentLoader.setHostConfig(org.apache.struts2.dispatcher.ng.HostConfig)`

## org.apache.struts2.dispatcher.Dispatcher

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.dispatcher.Dispatcher.createContextMap(java.util.Map,java.util.Map,java.util.Map,java.util.Map,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.dispatcher.Dispatcher.createContextMap(java.util.Map,java.util.Map,java.util.Map,java.util.Map,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse,javax.servlet.ServletContext)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.dispatcher.Dispatcher.createContextMap(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse,org.apache.struts2.dispatcher.mapper.ActionMapping,javax.servlet.ServletContext)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.dispatcher.Dispatcher.createXmlConfigurationProvider(java.lang.String,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.dispatcher.Dispatcher.sendError(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse,javax.servlet.ServletContext,int,java.lang.Exception)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.dispatcher.Dispatcher.serviceAction(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse,javax.servlet.ServletContext,org.apache.struts2.dispatcher.mapper.ActionMapping)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.dispatcher.Dispatcher.setConfigurationManager(com.opensymphony.xwork2.config.ConfigurationManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.dispatcher.Dispatcher.wrapRequest(javax.servlet.http.HttpServletRequest,javax.servlet.ServletContext)`

## org.apache.struts2.dispatcher.FilterDispatcher

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.dispatcher.FilterDispatcher`

## org.apache.struts2.dispatcher.FilterDispatcherCompatWeblogic61

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.dispatcher.FilterDispatcherCompatWeblogic61`

## org.apache.struts2.dispatcher.HttpHeaderResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.dispatcher.HttpHeaderResult`

## org.apache.struts2.dispatcher.PlainTextResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.dispatcher.PlainTextResult`

## org.apache.struts2.dispatcher.PostbackResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.dispatcher.PostbackResult`

## org.apache.struts2.dispatcher.ServletActionRedirectResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.dispatcher.ServletActionRedirectResult`

## org.apache.struts2.dispatcher.ServletDispatcherResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.dispatcher.ServletDispatcherResult`

## org.apache.struts2.dispatcher.ServletRedirectResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.dispatcher.ServletRedirectResult`

## org.apache.struts2.dispatcher.StaticContentLoader

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.dispatcher.StaticContentLoader.setHostConfig(org.apache.struts2.dispatcher.ng.HostConfig)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.struts2.dispatcher.StaticContentLoader`
+ MUST NOW IMPLEMENT: `org.apache.struts2.dispatcher.StaticContentLoader.setHostConfig(org.apache.struts2.dispatcher.HostConfig)`

## org.apache.struts2.dispatcher.StreamResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.dispatcher.StreamResult`

## org.apache.struts2.dispatcher.StrutsResultSupport

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.dispatcher.StrutsResultSupport`

## org.apache.struts2.dispatcher.VelocityResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.dispatcher.VelocityResult`

## org.apache.struts2.dispatcher.mapper.DefaultActionMapper

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.dispatcher.mapper.DefaultActionMapper.dropExtension(java.lang.String)`

## org.apache.struts2.dispatcher.mapper.PrefixBasedActionMapper

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.dispatcher.mapper.DefaultActionMapper.dropExtension(java.lang.String)`

## org.apache.struts2.dispatcher.mapper.Restful2ActionMapper

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.dispatcher.mapper.Restful2ActionMapper.LOG`
+ NEW FIELD: `org.apache.struts2.dispatcher.mapper.Restful2ActionMapper.LOG`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.struts2.dispatcher.mapper.Restful2ActionMapper.LOG`
+ NEW FIELD: `org.apache.struts2.dispatcher.mapper.Restful2ActionMapper.LOG`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.dispatcher.mapper.DefaultActionMapper.dropExtension(java.lang.String)`

## org.apache.struts2.dispatcher.mapper.RestfulActionMapper

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.dispatcher.mapper.RestfulActionMapper.LOG`
+ NEW FIELD: `org.apache.struts2.dispatcher.mapper.RestfulActionMapper.LOG`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.struts2.dispatcher.mapper.RestfulActionMapper.LOG`
+ NEW FIELD: `org.apache.struts2.dispatcher.mapper.RestfulActionMapper.LOG`

## org.apache.struts2.dispatcher.multipart.JakartaMultiPartRequest

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.dispatcher.multipart.JakartaMultiPartRequest.errors`
+ NEW FIELD: `org.apache.struts2.dispatcher.multipart.AbstractMultiPartRequest.errors`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.dispatcher.multipart.JakartaMultiPartRequest.setLocaleProvider(com.opensymphony.xwork2.LocaleProvider)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.struts2.dispatcher.multipart.JakartaMultiPartRequest.buildErrorMessage(java.lang.Throwable,java.lang.Object[])`
+ NEW RETURN TYPE: `org.apache.struts2.dispatcher.multipart.AbstractMultiPartRequest.buildErrorMessage(java.lang.Throwable,java.lang.Object[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.struts2.dispatcher.multipart.JakartaMultiPartRequest.getErrors()`
+ NEW RETURN TYPE: `org.apache.struts2.dispatcher.multipart.AbstractMultiPartRequest.getErrors()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.struts2.dispatcher.multipart.JakartaMultiPartRequest.getFile(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.struts2.dispatcher.multipart.JakartaMultiPartRequest.getFile(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.struts2.dispatcher.multipart.JakartaMultiPartRequest.buildErrorMessage(java.lang.Throwable,java.lang.Object[])`
+ NEW RETURN TYPE: `org.apache.struts2.dispatcher.multipart.AbstractMultiPartRequest.buildErrorMessage(java.lang.Throwable,java.lang.Object[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.struts2.dispatcher.multipart.JakartaMultiPartRequest.getFile(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.struts2.dispatcher.multipart.JakartaMultiPartRequest.getFile(java.lang.String)`

## org.apache.struts2.dispatcher.multipart.JakartaStreamMultiPartRequest

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.dispatcher.multipart.JakartaStreamMultiPartRequest.getMesssages()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.dispatcher.multipart.JakartaStreamMultiPartRequest.setLocaleProvider(com.opensymphony.xwork2.LocaleProvider)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.struts2.dispatcher.multipart.JakartaStreamMultiPartRequest.getErrors()`
+ NEW RETURN TYPE: `org.apache.struts2.dispatcher.multipart.AbstractMultiPartRequest.getErrors()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.struts2.dispatcher.multipart.JakartaStreamMultiPartRequest.getFile(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.struts2.dispatcher.multipart.JakartaStreamMultiPartRequest.getFile(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.struts2.dispatcher.multipart.JakartaStreamMultiPartRequest.getFile(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.struts2.dispatcher.multipart.JakartaStreamMultiPartRequest.getFile(java.lang.String)`

## org.apache.struts2.dispatcher.multipart.MultiPartRequest

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.struts2.dispatcher.multipart.MultiPartRequest.getErrors()`
+ NEW RETURN TYPE: `org.apache.struts2.dispatcher.multipart.MultiPartRequest.getErrors()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.struts2.dispatcher.multipart.MultiPartRequest.getFile(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.struts2.dispatcher.multipart.MultiPartRequest.getFile(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.struts2.dispatcher.multipart.MultiPartRequest.getFile(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.struts2.dispatcher.multipart.MultiPartRequest.getFile(java.lang.String)`

## org.apache.struts2.dispatcher.multipart.MultiPartRequestWrapper

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.dispatcher.multipart.MultiPartRequestWrapper.LOG`
+ NEW FIELD: `org.apache.struts2.dispatcher.multipart.MultiPartRequestWrapper.LOG`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.struts2.dispatcher.multipart.MultiPartRequestWrapper.LOG`
+ NEW FIELD: `org.apache.struts2.dispatcher.multipart.MultiPartRequestWrapper.LOG`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.dispatcher.multipart.MultiPartRequestWrapper.addError(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.struts2.dispatcher.multipart.MultiPartRequestWrapper.buildErrorMessage(java.lang.Throwable,java.lang.Object[])`
+ NEW RETURN TYPE: `org.apache.struts2.dispatcher.multipart.MultiPartRequestWrapper.buildErrorMessage(java.lang.Throwable,java.lang.Object[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.struts2.dispatcher.multipart.MultiPartRequestWrapper.getErrors()`
+ NEW RETURN TYPE: `org.apache.struts2.dispatcher.multipart.MultiPartRequestWrapper.getErrors()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.struts2.dispatcher.multipart.MultiPartRequestWrapper.getFiles(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.struts2.dispatcher.multipart.MultiPartRequestWrapper.getFiles(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.struts2.dispatcher.multipart.MultiPartRequestWrapper.buildErrorMessage(java.lang.Throwable,java.lang.Object[])`
+ NEW RETURN TYPE: `org.apache.struts2.dispatcher.multipart.MultiPartRequestWrapper.buildErrorMessage(java.lang.Throwable,java.lang.Object[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.struts2.dispatcher.multipart.MultiPartRequestWrapper.getFiles(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.struts2.dispatcher.multipart.MultiPartRequestWrapper.getFiles(java.lang.String)`

## org.apache.struts2.dispatcher.ng.ExecuteOperations

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.dispatcher.ng.ExecuteOperations`

## org.apache.struts2.dispatcher.ng.HostConfig

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.dispatcher.ng.HostConfig`

## org.apache.struts2.dispatcher.ng.InitOperations

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.dispatcher.ng.InitOperations`

## org.apache.struts2.dispatcher.ng.PrepareOperations

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.dispatcher.ng.PrepareOperations`

## org.apache.struts2.dispatcher.ng.filter.FilterHostConfig

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.dispatcher.ng.filter.FilterHostConfig`

## org.apache.struts2.dispatcher.ng.filter.StrutsExecuteFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.dispatcher.ng.filter.StrutsExecuteFilter`

## org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter`

## org.apache.struts2.dispatcher.ng.filter.StrutsPrepareFilter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.dispatcher.ng.filter.StrutsPrepareFilter`

## org.apache.struts2.dispatcher.ng.listener.ListenerHostConfig

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.dispatcher.ng.listener.ListenerHostConfig`

## org.apache.struts2.dispatcher.ng.listener.StrutsListener

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.dispatcher.ng.listener.StrutsListener`

## org.apache.struts2.dispatcher.ng.servlet.ServletHostConfig

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.dispatcher.ng.servlet.ServletHostConfig`

## org.apache.struts2.dispatcher.ng.servlet.StrutsServlet

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.dispatcher.ng.servlet.StrutsServlet`

## org.apache.struts2.impl.PrefixBasedActionProxyFactory

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.impl.PrefixBasedActionProxyFactory`

## org.apache.struts2.impl.StrutsActionProxy

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.impl.StrutsActionProxy`

## org.apache.struts2.impl.StrutsActionProxyFactory

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.impl.StrutsActionProxyFactory`

## org.apache.struts2.impl.StrutsObjectFactory

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.impl.StrutsObjectFactory`

## org.apache.struts2.interceptor.ActionMappingParametersInteceptor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.interceptor.ActionMappingParametersInteceptor`

## org.apache.struts2.interceptor.BackgroundProcess

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.struts2.interceptor.BackgroundProcess.action`

## org.apache.struts2.interceptor.DeprecationInterceptor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.interceptor.DeprecationInterceptor`

## org.apache.struts2.interceptor.FileUploadInterceptor

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.interceptor.FileUploadInterceptor.LOG`
+ NEW FIELD: `org.apache.struts2.interceptor.FileUploadInterceptor.LOG`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.struts2.interceptor.FileUploadInterceptor.LOG`
+ NEW FIELD: `org.apache.struts2.interceptor.FileUploadInterceptor.LOG`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.interceptor.FileUploadInterceptor.acceptFile(java.lang.Object,java.io.File,java.lang.String,java.lang.String,java.lang.String,com.opensymphony.xwork2.ValidationAware)`

## org.apache.struts2.interceptor.I18nInterceptor

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.struts2.interceptor.I18nInterceptor.COOKIE_STORAGE`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.interceptor.I18nInterceptor.readStoredLocale(com.opensymphony.xwork2.ActionInvocation,java.util.Map<java.lang.String,java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.interceptor.I18nInterceptor.storeLocale(com.opensymphony.xwork2.ActionInvocation,java.util.Locale,java.lang.String)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.struts2.interceptor.I18nInterceptor`

## org.apache.struts2.interceptor.I18nInterceptor$CookieLocaleFinder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.interceptor.I18nInterceptor$CookieLocaleFinder`

## org.apache.struts2.interceptor.PrincipalProxy

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.interceptor.PrincipalProxy.getRequest()`

## org.apache.struts2.interceptor.TokenInterceptor

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.interceptor.TokenInterceptor.setTextProvider(com.opensymphony.xwork2.TextProvider)`

## org.apache.struts2.interceptor.TokenSessionStoreInterceptor

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.interceptor.TokenInterceptor.setTextProvider(com.opensymphony.xwork2.TextProvider)`

## org.apache.struts2.interceptor.validation.AnnotationValidationInterceptor

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.apache.struts2.interceptor.validation.AnnotationValidationInterceptor.getActionMethod(java.lang.Class,java.lang.String)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.struts2.interceptor.validation.AnnotationValidationInterceptor.getActionMethod(java.lang.Class,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.interceptor.validation.AnnotationValidationInterceptor.setDevMode(java.lang.String)`

## org.apache.struts2.servlet.interceptor.ServletPrincipalProxy

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.servlet.interceptor.ServletPrincipalProxy`

## org.apache.struts2.util.RegexPatternMatcher

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.struts2.util.RegexPatternMatcher`
+ MUST NOW IMPLEMENT: `com.opensymphony.xwork2.util.PatternMatcher.match(java.util.Map<java.lang.String,java.lang.String>,java.lang.String,E)`

## org.apache.struts2.util.StrutsTestCaseHelper

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.util.StrutsTestCaseHelper.setUp()`

## org.apache.struts2.util.StrutsUtil

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.util.StrutsUtil.LOG`
+ NEW FIELD: `org.apache.struts2.util.StrutsUtil.LOG`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.struts2.util.StrutsUtil.LOG`
+ NEW FIELD: `org.apache.struts2.util.StrutsUtil.LOG`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.util.StrutsUtil.include(java.lang.Object,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

## org.apache.struts2.util.VelocityStrutsUtil

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.util.StrutsUtil.LOG`
+ NEW FIELD: `org.apache.struts2.util.StrutsUtil.LOG`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.struts2.util.StrutsUtil.LOG`
+ NEW FIELD: `org.apache.struts2.util.StrutsUtil.LOG`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.util.StrutsUtil.include(java.lang.Object,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

## org.apache.struts2.views.DefaultTagLibrary

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.struts2.views.DefaultTagLibrary`

## org.apache.struts2.views.TagLibrary

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.views.TagLibrary`

## org.apache.struts2.views.freemarker.FreemarkerManager

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.struts2.views.freemarker.FreemarkerManager.oldTagLibraries`

## org.apache.struts2.views.freemarker.FreemarkerResult

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.freemarker.FreemarkerResult.setWriteIfCompleted(boolean)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.struts2.views.freemarker.FreemarkerResult`

## org.apache.struts2.views.freemarker.StrutsBeanWrapper

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.struts2.views.freemarker.StrutsBeanWrapper.<init>(boolean)`

## org.apache.struts2.views.freemarker.tags.DivModel

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.views.freemarker.tags.DivModel`

## org.apache.struts2.views.freemarker.tags.StrutsModels

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.struts2.views.freemarker.tags.StrutsModels.div`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.freemarker.tags.StrutsModels.getDiv()`

## org.apache.struts2.views.jsp.ActionTag

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.jsp.ContextBeanTag.setId(java.lang.String)`

## org.apache.struts2.views.jsp.BeanTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.BeanTag.LOG`
+ NEW FIELD: `org.apache.struts2.views.jsp.BeanTag.LOG`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.struts2.views.jsp.BeanTag.LOG`
+ NEW FIELD: `org.apache.struts2.views.jsp.BeanTag.LOG`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.jsp.ContextBeanTag.setId(java.lang.String)`

## org.apache.struts2.views.jsp.ContextBeanTag

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.jsp.ContextBeanTag.setId(java.lang.String)`

## org.apache.struts2.views.jsp.DateTag

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.jsp.ContextBeanTag.setId(java.lang.String)`

## org.apache.struts2.views.jsp.IteratorTag

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.jsp.ContextBeanTag.setId(java.lang.String)`

## org.apache.struts2.views.jsp.NumberTag

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.jsp.ContextBeanTag.setId(java.lang.String)`

## org.apache.struts2.views.jsp.PropertyTag

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.jsp.PropertyTag.setEscape(boolean)`

## org.apache.struts2.views.jsp.SetTag

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.jsp.ContextBeanTag.setId(java.lang.String)`

## org.apache.struts2.views.jsp.TextTag

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.jsp.ContextBeanTag.setId(java.lang.String)`

## org.apache.struts2.views.jsp.URLTag

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.jsp.ContextBeanTag.setId(java.lang.String)`

## org.apache.struts2.views.jsp.iterator.AppendIteratorTag

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.jsp.ContextBeanTag.setId(java.lang.String)`

## org.apache.struts2.views.jsp.iterator.IteratorGeneratorTag

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.jsp.iterator.IteratorGeneratorTag.setId(java.lang.String)`

## org.apache.struts2.views.jsp.iterator.MergeIteratorTag

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.jsp.ContextBeanTag.setId(java.lang.String)`

## org.apache.struts2.views.jsp.iterator.SortIteratorTag

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.jsp.iterator.SortIteratorTag.setId(java.lang.String)`

## org.apache.struts2.views.jsp.iterator.SubsetIteratorTag

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.jsp.iterator.SubsetIteratorTag.setId(java.lang.String)`

## org.apache.struts2.views.jsp.ui.AbstractClosingTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.AbstractDoubleListTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.AbstractListTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.AbstractRequiredListTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.AbstractUITag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.ActionErrorTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.ActionMessageTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.AnchorTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.CheckboxListTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.CheckboxTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.ComboBoxTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.jsp.ui.TextFieldTag.setMaxLength(java.lang.String)`

## org.apache.struts2.views.jsp.ui.ComponentTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.DateTextFieldTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.DebugTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.DivTag

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.views.jsp.ui.DivTag`

## org.apache.struts2.views.jsp.ui.DoubleSelectTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.FieldErrorTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.FileTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.FormTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.HeadTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.HiddenTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.InputTransferSelectTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.LabelTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.OptionTransferSelectTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.PasswordTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.jsp.ui.TextFieldTag.setMaxLength(java.lang.String)`

## org.apache.struts2.views.jsp.ui.RadioTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.ResetTag

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.struts2.views.jsp.ui.ResetTag.align`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.jsp.ui.ResetTag.setAlign(java.lang.String)`

## org.apache.struts2.views.jsp.ui.SelectTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.SubmitTag

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.struts2.views.jsp.ui.SubmitTag.align`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.jsp.ui.SubmitTag.setAlign(java.lang.String)`

## org.apache.struts2.views.jsp.ui.TextFieldTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.jsp.ui.TextFieldTag.setMaxLength(java.lang.String)`

## org.apache.struts2.views.jsp.ui.TextareaTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.TokenTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.jsp.ui.UpDownSelectTag

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`
+ NEW FIELD: `org.apache.struts2.views.jsp.ui.AbstractUITag.dynamicAttributes`

## org.apache.struts2.views.velocity.components.DivDirective

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.struts2.views.velocity.components.DivDirective`

## org.apache.struts2.views.xslt.XSLTResult

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.xslt.XSLTResult.getExcludingPattern()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.xslt.XSLTResult.getMatchingPattern()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.xslt.XSLTResult.setExcludingPattern(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.xslt.XSLTResult.setLocation(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.struts2.views.xslt.XSLTResult.setMatchingPattern(java.lang.String)`

