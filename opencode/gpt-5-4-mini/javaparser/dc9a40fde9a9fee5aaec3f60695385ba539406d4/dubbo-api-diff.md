# Breaking Changes: org.apache.dubbo:dubbo 2.7.3 → 2.7.21
Total: 1805 (binary-breaking: 1617, source-breaking: 1698)

## com.alibaba.com.caucho.hessian.io.AbstractHessianInput

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.alibaba.com.caucho.hessian.io.AbstractHessianInput`
+ MUST NOW IMPLEMENT: `com.alibaba.com.caucho.hessian.io.AbstractHessianInput.checkAndReadNull()`

## com.alibaba.dubbo.common.Constants

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.constants.CommonConstants.GROUP_CHAR_SEPERATOR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.constants.CommonConstants.HIDE_KEY_PREFIX`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.constants.CommonConstants.PROPERTIES_CHAR_SEPERATOR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.constants.QosConstants.ACCEPT_FOREIGN_IP_COMPATIBLE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.constants.QosConstants.QOS_ENABLE_COMPATIBLE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.constants.QosConstants.QOS_PORT_COMPATIBLE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.config.Constants.CONFIG_APPNAME_KEY`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.config.Constants.CONFIG_TIMEOUT_KEY`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.config.Constants.PROTOCOLS_SUFFIX`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.config.Constants.REGISTRIES_SUFFIX`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.cluster.Constants.REMOTE_TIMESTAMP_KEY`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `com.alibaba.dubbo.common.Constants`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `com.alibaba.dubbo.common.Constants`

## com.alibaba.dubbo.config.ApplicationConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

## com.alibaba.dubbo.config.ConsumerConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkApplication()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMetadataReport()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMonitor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.getMetadataReportService()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadMonitor(org.apache.dubbo.common.URL)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadRegistries(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractMethodConfig.setMock(java.lang.Boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.ConsumerConfig.getDefault()`

## com.alibaba.dubbo.config.MethodConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractMethodConfig.setMock(java.lang.Boolean)`

## com.alibaba.dubbo.config.ModuleConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

## com.alibaba.dubbo.config.MonitorConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

## com.alibaba.dubbo.config.ProtocolConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.ProtocolConfig.destroy()`

## com.alibaba.dubbo.config.ProviderConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkApplication()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMetadataReport()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMonitor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.getMetadataReportService()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadMonitor(org.apache.dubbo.common.URL)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadRegistries(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractMethodConfig.setMock(java.lang.Boolean)`

## com.alibaba.dubbo.config.ReferenceConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkApplication()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMetadataReport()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMonitor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.getMetadataReportService()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadMonitor(org.apache.dubbo.common.URL)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadRegistries(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractMethodConfig.setMock(java.lang.Boolean)`

## com.alibaba.dubbo.config.RegistryConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.RegistryConfig.isZookeeperProtocol()`

## com.alibaba.dubbo.config.ServiceConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkApplication()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMetadataReport()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMonitor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.getMetadataReportService()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadMonitor(org.apache.dubbo.common.URL)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadRegistries(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.ServiceConfig.checkAndUpdateSubConfigs()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.ServiceConfig.setMock(java.lang.Boolean)`

## com.alibaba.dubbo.registry.support.FailbackRegistry

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.alibaba.dubbo.registry.support.FailbackRegistry.removeFailedNotifiedTask(com.alibaba.dubbo.common.URL,com.alibaba.dubbo.registry.NotifyListener)`

## com.alibaba.dubbo.remoting.Transporter

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.remoting.Transporter.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.remoting.Transporter.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.remoting.Transporter.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.remoting.Transporter.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.alibaba.dubbo.remoting.Transporter`
+ MUST NOW IMPLEMENT: `com.alibaba.dubbo.remoting.Transporter.bind(com.alibaba.dubbo.common.URL,com.alibaba.dubbo.remoting.ChannelHandler)`

## com.alibaba.dubbo.rpc.Filter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

## com.alibaba.dubbo.rpc.Invocation

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.alibaba.dubbo.rpc.Invocation`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.Invocation.getProtocolServiceKey()`

## com.alibaba.dubbo.rpc.Result

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `java.util.concurrent.CompletionStage.thenApply(java.util.function.Function<? super T,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.acceptEither(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.acceptEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.acceptEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Consumer<? super T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.applyToEither(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Function<? super T,U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.applyToEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Function<? super T,U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.applyToEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Function<? super T,U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.exceptionally(java.util.function.Function<java.lang.Throwable,? extends T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.exceptionallyAsync(java.util.function.Function<java.lang.Throwable,? extends T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.exceptionallyAsync(java.util.function.Function<java.lang.Throwable,? extends T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.exceptionallyCompose(java.util.function.Function<java.lang.Throwable,? extends java.util.concurrent.CompletionStage<T>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.exceptionallyComposeAsync(java.util.function.Function<java.lang.Throwable,? extends java.util.concurrent.CompletionStage<T>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.exceptionallyComposeAsync(java.util.function.Function<java.lang.Throwable,? extends java.util.concurrent.CompletionStage<T>>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.handle(java.util.function.BiFunction<? super T,java.lang.Throwable,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.handleAsync(java.util.function.BiFunction<? super T,java.lang.Throwable,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.handleAsync(java.util.function.BiFunction<? super T,java.lang.Throwable,? extends U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.runAfterBoth(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.runAfterBothAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.runAfterBothAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.runAfterEither(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.runAfterEitherAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.runAfterEitherAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenAccept(java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenAcceptAsync(java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenAcceptAsync(java.util.function.Consumer<? super T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenAcceptBoth(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiConsumer<? super T,? super U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenAcceptBothAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiConsumer<? super T,? super U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenAcceptBothAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiConsumer<? super T,? super U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenApplyAsync(java.util.function.Function<? super T,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenApplyAsync(java.util.function.Function<? super T,? extends U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenCombine(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiFunction<? super T,? super U,? extends V>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenCombineAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiFunction<? super T,? super U,? extends V>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenCombineAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiFunction<? super T,? super U,? extends V>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenCompose(java.util.function.Function<? super T,? extends java.util.concurrent.CompletionStage<U>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenComposeAsync(java.util.function.Function<? super T,? extends java.util.concurrent.CompletionStage<U>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenComposeAsync(java.util.function.Function<? super T,? extends java.util.concurrent.CompletionStage<U>>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenRun(java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenRunAsync(java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenRunAsync(java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.toCompletableFuture()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.whenComplete(java.util.function.BiConsumer<? super T,? super java.lang.Throwable>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.whenCompleteAsync(java.util.function.BiConsumer<? super T,? super java.lang.Throwable>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.whenCompleteAsync(java.util.function.BiConsumer<? super T,? super java.lang.Throwable>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.Future.cancel(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.Future.exceptionNow()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.Future.isCancelled()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.Future.isDone()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.Future.resultNow()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.Future.state()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Result.completionFuture()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Result.getNow(org.apache.dubbo.rpc.Result)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `java.util.concurrent.CompletionStage.thenApply(java.util.function.Function<? super T,? extends U>)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.Result.thenApply(java.util.function.Function<org.apache.dubbo.rpc.Result,? extends U>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `java.util.concurrent.Future.get()`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.Result.get()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `java.util.concurrent.Future.get(long,java.util.concurrent.TimeUnit)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.Result.get(long,java.util.concurrent.TimeUnit)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `java.util.concurrent.CompletionStage.thenApply(java.util.function.Function<? super T,? extends U>)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.Result.thenApply(java.util.function.Function<org.apache.dubbo.rpc.Result,? extends U>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `java.util.concurrent.Future.get()`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.Result.get()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `java.util.concurrent.Future.get(long,java.util.concurrent.TimeUnit)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.Result.get(long,java.util.concurrent.TimeUnit)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.alibaba.dubbo.rpc.Result`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.Result.setAttachment(java.lang.String,java.lang.Object)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.alibaba.dubbo.rpc.Result`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.Result.setObjectAttachment(java.lang.String,java.lang.Object)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `com.alibaba.dubbo.rpc.Result`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `com.alibaba.dubbo.rpc.Result`

## com.alibaba.dubbo.rpc.Result$AbstractResult

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `java.util.concurrent.CompletableFuture.thenApply(java.util.function.Function<? super T,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.acceptEither(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.acceptEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.acceptEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Consumer<? super T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.allOf(java.util.concurrent.CompletableFuture<? extends java.lang.Object>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.anyOf(java.util.concurrent.CompletableFuture<? extends java.lang.Object>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.applyToEither(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Function<? super T,U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.applyToEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Function<? super T,U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.applyToEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Function<? super T,U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.cancel(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.complete(T)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completeAsync(java.util.function.Supplier<? extends T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completeAsync(java.util.function.Supplier<? extends T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completeExceptionally(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completeOnTimeout(T,long,java.util.concurrent.TimeUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completedFuture(U)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completedStage(U)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.copy()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.defaultExecutor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.delayedExecutor(long,java.util.concurrent.TimeUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.delayedExecutor(long,java.util.concurrent.TimeUnit,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionNow()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionally(java.util.function.Function<java.lang.Throwable,? extends T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionallyAsync(java.util.function.Function<java.lang.Throwable,? extends T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionallyAsync(java.util.function.Function<java.lang.Throwable,? extends T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionallyCompose(java.util.function.Function<java.lang.Throwable,? extends java.util.concurrent.CompletionStage<T>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionallyComposeAsync(java.util.function.Function<java.lang.Throwable,? extends java.util.concurrent.CompletionStage<T>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionallyComposeAsync(java.util.function.Function<java.lang.Throwable,? extends java.util.concurrent.CompletionStage<T>>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.failedFuture(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.failedStage(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.getNow(T)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.getNumberOfDependents()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.handle(java.util.function.BiFunction<? super T,java.lang.Throwable,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.handleAsync(java.util.function.BiFunction<? super T,java.lang.Throwable,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.handleAsync(java.util.function.BiFunction<? super T,java.lang.Throwable,? extends U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.isCancelled()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.isCompletedExceptionally()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.isDone()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.join()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.minimalCompletionStage()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.newIncompleteFuture()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.obtrudeException(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.obtrudeValue(T)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.orTimeout(long,java.util.concurrent.TimeUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.resultNow()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterBoth(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterBothAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterBothAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterEither(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterEitherAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterEitherAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAsync(java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAsync(java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.state()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.supplyAsync(java.util.function.Supplier<U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.supplyAsync(java.util.function.Supplier<U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAccept(java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAcceptAsync(java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAcceptAsync(java.util.function.Consumer<? super T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAcceptBoth(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiConsumer<? super T,? super U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAcceptBothAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiConsumer<? super T,? super U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAcceptBothAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiConsumer<? super T,? super U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenApplyAsync(java.util.function.Function<? super T,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenApplyAsync(java.util.function.Function<? super T,? extends U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenCombine(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiFunction<? super T,? super U,? extends V>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenCombineAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiFunction<? super T,? super U,? extends V>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenCombineAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiFunction<? super T,? super U,? extends V>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenCompose(java.util.function.Function<? super T,? extends java.util.concurrent.CompletionStage<U>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenComposeAsync(java.util.function.Function<? super T,? extends java.util.concurrent.CompletionStage<U>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenComposeAsync(java.util.function.Function<? super T,? extends java.util.concurrent.CompletionStage<U>>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenRun(java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenRunAsync(java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenRunAsync(java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.toCompletableFuture()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.whenComplete(java.util.function.BiConsumer<? super T,? super java.lang.Throwable>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.whenCompleteAsync(java.util.function.BiConsumer<? super T,? super java.lang.Throwable>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.whenCompleteAsync(java.util.function.BiConsumer<? super T,? super java.lang.Throwable>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Result.completionFuture()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Result.getNow(org.apache.dubbo.rpc.Result)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `java.util.concurrent.CompletableFuture.get()`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.Result$AbstractResult.get()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `java.util.concurrent.CompletableFuture.get(long,java.util.concurrent.TimeUnit)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.Result$AbstractResult.get(long,java.util.concurrent.TimeUnit)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `java.util.concurrent.CompletableFuture.get()`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.Result$AbstractResult.get()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `java.util.concurrent.CompletableFuture.get(long,java.util.concurrent.TimeUnit)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.Result$AbstractResult.get(long,java.util.concurrent.TimeUnit)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.alibaba.dubbo.rpc.Result$AbstractResult`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.Result.setAttachment(java.lang.String,java.lang.Object)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.alibaba.dubbo.rpc.Result$AbstractResult`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.Result.setObjectAttachment(java.lang.String,java.lang.Object)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `com.alibaba.dubbo.rpc.Result$AbstractResult`

## com.alibaba.dubbo.rpc.Result$CompatibleResult

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `java.util.concurrent.CompletableFuture.thenApply(java.util.function.Function<? super T,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.acceptEither(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.acceptEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.acceptEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Consumer<? super T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.allOf(java.util.concurrent.CompletableFuture<? extends java.lang.Object>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.anyOf(java.util.concurrent.CompletableFuture<? extends java.lang.Object>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.applyToEither(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Function<? super T,U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.applyToEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Function<? super T,U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.applyToEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Function<? super T,U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.cancel(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.complete(T)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completeAsync(java.util.function.Supplier<? extends T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completeAsync(java.util.function.Supplier<? extends T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completeExceptionally(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completeOnTimeout(T,long,java.util.concurrent.TimeUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completedFuture(U)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completedStage(U)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.copy()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.defaultExecutor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.delayedExecutor(long,java.util.concurrent.TimeUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.delayedExecutor(long,java.util.concurrent.TimeUnit,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionNow()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionally(java.util.function.Function<java.lang.Throwable,? extends T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionallyAsync(java.util.function.Function<java.lang.Throwable,? extends T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionallyAsync(java.util.function.Function<java.lang.Throwable,? extends T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionallyCompose(java.util.function.Function<java.lang.Throwable,? extends java.util.concurrent.CompletionStage<T>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionallyComposeAsync(java.util.function.Function<java.lang.Throwable,? extends java.util.concurrent.CompletionStage<T>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionallyComposeAsync(java.util.function.Function<java.lang.Throwable,? extends java.util.concurrent.CompletionStage<T>>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.failedFuture(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.failedStage(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.getNow(T)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.getNumberOfDependents()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.handle(java.util.function.BiFunction<? super T,java.lang.Throwable,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.handleAsync(java.util.function.BiFunction<? super T,java.lang.Throwable,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.handleAsync(java.util.function.BiFunction<? super T,java.lang.Throwable,? extends U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.isCancelled()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.isCompletedExceptionally()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.isDone()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.join()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.minimalCompletionStage()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.newIncompleteFuture()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.obtrudeException(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.obtrudeValue(T)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.orTimeout(long,java.util.concurrent.TimeUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.resultNow()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterBoth(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterBothAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterBothAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterEither(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterEitherAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterEitherAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAsync(java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAsync(java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.state()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.supplyAsync(java.util.function.Supplier<U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.supplyAsync(java.util.function.Supplier<U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAccept(java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAcceptAsync(java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAcceptAsync(java.util.function.Consumer<? super T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAcceptBoth(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiConsumer<? super T,? super U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAcceptBothAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiConsumer<? super T,? super U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAcceptBothAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiConsumer<? super T,? super U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenApplyAsync(java.util.function.Function<? super T,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenApplyAsync(java.util.function.Function<? super T,? extends U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenCombine(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiFunction<? super T,? super U,? extends V>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenCombineAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiFunction<? super T,? super U,? extends V>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenCombineAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiFunction<? super T,? super U,? extends V>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenCompose(java.util.function.Function<? super T,? extends java.util.concurrent.CompletionStage<U>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenComposeAsync(java.util.function.Function<? super T,? extends java.util.concurrent.CompletionStage<U>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenComposeAsync(java.util.function.Function<? super T,? extends java.util.concurrent.CompletionStage<U>>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenRun(java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenRunAsync(java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenRunAsync(java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.toCompletableFuture()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.whenComplete(java.util.function.BiConsumer<? super T,? super java.lang.Throwable>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.whenCompleteAsync(java.util.function.BiConsumer<? super T,? super java.lang.Throwable>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.whenCompleteAsync(java.util.function.BiConsumer<? super T,? super java.lang.Throwable>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Result.completionFuture()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Result.getNow(org.apache.dubbo.rpc.Result)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `java.util.concurrent.CompletableFuture.get()`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.Result$AbstractResult.get()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `java.util.concurrent.CompletableFuture.get(long,java.util.concurrent.TimeUnit)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.Result$AbstractResult.get(long,java.util.concurrent.TimeUnit)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `java.util.concurrent.CompletableFuture.get()`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.Result$AbstractResult.get()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `java.util.concurrent.CompletableFuture.get(long,java.util.concurrent.TimeUnit)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.Result$AbstractResult.get(long,java.util.concurrent.TimeUnit)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `com.alibaba.dubbo.rpc.Result$CompatibleResult`

## com.alibaba.dubbo.rpc.RpcContext

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.alibaba.dubbo.rpc.RpcContext.<init>()`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.dubbo.rpc.RpcContext.setUrls(java.util.List<org.apache.dubbo.common.URL>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.RpcContext.getAsyncContext()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.RpcContext.getCompletableFuture()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.RpcContext.getInvocation()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.RpcContext.getInvoker()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.RpcContext.getInvokers()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.RpcContext.getRemoteApplicationName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.RpcContext.isAsyncStarted()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.RpcContext.restoreContext(org.apache.dubbo.rpc.RpcContext)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.RpcContext.restoreServerContext(org.apache.dubbo.rpc.RpcContext)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.RpcContext.setAsyncContext(org.apache.dubbo.rpc.AsyncContext)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.RpcContext.setInvocation(org.apache.dubbo.rpc.Invocation)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.RpcContext.setInvoker(org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.RpcContext.setInvokers(java.util.List<org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.RpcContext.setRemoteApplicationName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.RpcContext.setUrl(org.apache.dubbo.common.URL)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.RpcContext.startAsync()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.RpcContext.stopAsync()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.RpcContext.asyncCall(java.util.concurrent.Callable<T>)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.RpcContext.asyncCall(java.util.concurrent.Callable<T>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.RpcContext.getServerContext()`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.RpcContext.getServerContext()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.RpcContext.getUrl()`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.RpcContext.getUrl()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.RpcContext.getUrls()`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.RpcContext.getUrls()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.RpcContext.remove(java.lang.String)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.RpcContext.remove(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.RpcContext.removeAttachment(java.lang.String)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.RpcContext.removeAttachment(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.RpcContext.set(java.lang.String,java.lang.Object)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.RpcContext.set(java.lang.String,java.lang.Object)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.RpcContext.setAttachment(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.RpcContext.setAttachment(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.RpcContext.setAttachments(java.util.Map<java.lang.String,java.lang.String>)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.RpcContext.setAttachments(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.RpcContext.setLocalAddress(java.lang.String,int)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.RpcContext.setLocalAddress(java.lang.String,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.RpcContext.setLocalAddress(java.net.InetSocketAddress)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.RpcContext.setLocalAddress(java.net.InetSocketAddress)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.RpcContext.setRemoteAddress(java.lang.String,int)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.RpcContext.setRemoteAddress(java.lang.String,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.RpcContext.setRemoteAddress(java.net.InetSocketAddress)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.RpcContext.setRemoteAddress(java.net.InetSocketAddress)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.RpcContext.asyncCall(java.util.concurrent.Callable<T>)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.RpcContext.asyncCall(java.util.concurrent.Callable<T>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.RpcContext.getServerContext()`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.RpcContext.getServerContext()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.RpcContext.getUrl()`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.RpcContext.getUrl()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.RpcContext.remove(java.lang.String)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.RpcContext.remove(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.RpcContext.removeAttachment(java.lang.String)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.RpcContext.removeAttachment(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.RpcContext.set(java.lang.String,java.lang.Object)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.RpcContext.set(java.lang.String,java.lang.Object)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.RpcContext.setAttachment(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.RpcContext.setAttachment(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.RpcContext.setAttachments(java.util.Map<java.lang.String,java.lang.String>)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.RpcContext.setAttachments(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.RpcContext.setLocalAddress(java.lang.String,int)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.RpcContext.setLocalAddress(java.lang.String,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.RpcContext.setLocalAddress(java.net.InetSocketAddress)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.RpcContext.setLocalAddress(java.net.InetSocketAddress)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.RpcContext.setRemoteAddress(java.lang.String,int)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.RpcContext.setRemoteAddress(java.lang.String,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.RpcContext.setRemoteAddress(java.net.InetSocketAddress)`
+ NEW RETURN TYPE: `com.alibaba.dubbo.rpc.RpcContext.setRemoteAddress(java.net.InetSocketAddress)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `com.alibaba.dubbo.rpc.RpcContext`

## com.alibaba.dubbo.rpc.RpcException

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.RpcException.isForbidded()`

## com.alibaba.dubbo.rpc.cluster.Directory

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.alibaba.dubbo.rpc.cluster.Directory`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.cluster.Directory.isDestroyed()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.alibaba.dubbo.rpc.cluster.Directory`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.cluster.Directory.getAllInvokers()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.alibaba.dubbo.rpc.cluster.Directory`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.cluster.Directory.getConsumerUrl()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.alibaba.dubbo.rpc.cluster.Directory`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.cluster.Directory.discordAddresses()`

## com.alibaba.dubbo.rpc.cluster.loadbalance.AbstractLoadBalance

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.cluster.loadbalance.AbstractLoadBalance.getWeight(org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

## com.alibaba.dubbo.rpc.protocol.http.HttpRemoteInvocation

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.alibaba.dubbo.rpc.protocol.http.HttpRemoteInvocation`

## com.alibaba.dubbo.rpc.service.GenericException

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `com.alibaba.dubbo.rpc.service.GenericException`

## org.apache.dubbo.cache.filter.CacheFilter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

## org.apache.dubbo.common.config.AbstractPrefixConfiguration

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.common.config.AbstractPrefixConfiguration`

## org.apache.dubbo.common.config.Environment

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.common.config.Environment.getAppExternalConfig(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.common.config.Environment.getConfiguration(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.common.config.Environment.getEnvironmentConfig(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.common.config.Environment.getExternalConfig(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.common.config.Environment.getInstance()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.common.config.Environment.getPropertiesConfig(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.common.config.Environment.getSystemConfig(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.common.config.Environment.setDynamicConfiguration(org.apache.dubbo.common.config.Configuration)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.common.config.Environment.getDynamicConfiguration()`
+ NEW RETURN TYPE: `org.apache.dubbo.common.config.Environment.getDynamicConfiguration()`

## org.apache.dubbo.common.config.EnvironmentConfiguration

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.common.config.EnvironmentConfiguration.<init>(java.lang.String,java.lang.String)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.config.AbstractPrefixConfiguration.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.config.AbstractPrefixConfiguration.prefix`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.common.config.EnvironmentConfiguration`

## org.apache.dubbo.common.config.InmemoryConfiguration

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.common.config.InmemoryConfiguration.<init>(java.lang.String,java.lang.String)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.config.AbstractPrefixConfiguration.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.config.AbstractPrefixConfiguration.prefix`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.common.config.InmemoryConfiguration`

## org.apache.dubbo.common.config.PropertiesConfiguration

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.common.config.PropertiesConfiguration.<init>(java.lang.String,java.lang.String)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.config.AbstractPrefixConfiguration.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.config.AbstractPrefixConfiguration.prefix`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.common.config.PropertiesConfiguration`

## org.apache.dubbo.common.config.SystemConfiguration

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.common.config.SystemConfiguration.<init>(java.lang.String,java.lang.String)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.config.AbstractPrefixConfiguration.id`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.config.AbstractPrefixConfiguration.prefix`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.common.config.SystemConfiguration`

## org.apache.dubbo.common.constants.CommonConstants

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.constants.CommonConstants.GROUP_CHAR_SEPERATOR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.constants.CommonConstants.HIDE_KEY_PREFIX`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.constants.CommonConstants.PROPERTIES_CHAR_SEPERATOR`

## org.apache.dubbo.common.constants.QosConstants

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.constants.QosConstants.ACCEPT_FOREIGN_IP_COMPATIBLE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.constants.QosConstants.QOS_ENABLE_COMPATIBLE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.constants.QosConstants.QOS_PORT_COMPATIBLE`

## org.apache.dubbo.common.extension.support.ActivateComparator

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.dubbo.common.extension.support.ActivateComparator.COMPARATOR`
+ NEW FIELD: `org.apache.dubbo.common.extension.support.ActivateComparator.COMPARATOR`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.apache.dubbo.common.extension.support.ActivateComparator.compare(java.lang.Object,java.lang.Object)`

## org.apache.dubbo.common.serialize.hessian2.Hessian2SerializerFactory

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.serialize.hessian2.Hessian2SerializerFactory.SERIALIZER_FACTORY`

## org.apache.dubbo.common.serialize.kryo.utils.ReflectionUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.common.serialize.kryo.utils.ReflectionUtils`

## org.apache.dubbo.common.serialize.protobuf.support.GenericProtobufObjectInput

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.apache.dubbo.common.serialize.protobuf.support.GenericProtobufObjectInput.readObject()`

## org.apache.dubbo.common.serialize.protobuf.support.GenericProtobufObjectOutput

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.dubbo.common.serialize.protobuf.support.GenericProtobufObjectOutput.flushBuffer()`
+ NOW THROWS: `org.apache.dubbo.common.serialize.protobuf.support.GenericProtobufObjectOutput.flushBuffer()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.dubbo.common.serialize.protobuf.support.GenericProtobufObjectOutput.writeBytes(byte[])`
+ NOW THROWS: `org.apache.dubbo.common.serialize.protobuf.support.GenericProtobufObjectOutput.writeBytes(byte[])`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.dubbo.common.serialize.protobuf.support.GenericProtobufObjectOutput.writeBytes(byte[],int,int)`
+ NOW THROWS: `org.apache.dubbo.common.serialize.protobuf.support.GenericProtobufObjectOutput.writeBytes(byte[],int,int)`

## org.apache.dubbo.common.serialize.support.SerializableClassRegistry

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.dubbo.common.serialize.support.SerializableClassRegistry.registerClass(java.lang.Class)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.common.serialize.support.SerializableClassRegistry.registerClass(java.lang.Class,com.esotericsoftware.kryo.Serializer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.common.serialize.support.SerializableClassRegistry.getRegisteredClasses()`
+ NEW RETURN TYPE: `org.apache.dubbo.common.serialize.support.SerializableClassRegistry.getRegisteredClasses()`

## org.apache.dubbo.common.serialize.support.SerializationOptimizer

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.common.serialize.support.SerializationOptimizer.getSerializableClasses()`
+ NEW RETURN TYPE: `org.apache.dubbo.common.serialize.support.SerializationOptimizer.getSerializableClasses()`

## org.apache.dubbo.common.utils.ClassHelper

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.common.utils.ClassHelper`

## org.apache.dubbo.common.utils.MethodUtils

### TYPE_KIND_CHANGED [binary ✗ | source ✗]
- TYPE (kind changed): `org.apache.dubbo.common.utils.MethodUtils`

## org.apache.dubbo.common.utils.StringUtils

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.utils.StringUtils.EMPTY`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.common.utils.StringUtils.isBlank(java.lang.String)`

## org.apache.dubbo.config.AbstractConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

## org.apache.dubbo.config.AbstractInterfaceConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkApplication()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMetadataReport()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMonitor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.getMetadataReportService()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadMonitor(org.apache.dubbo.common.URL)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadRegistries(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractMethodConfig.setMock(java.lang.Boolean)`

## org.apache.dubbo.config.AbstractMethodConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractMethodConfig.setMock(java.lang.Boolean)`

## org.apache.dubbo.config.AbstractReferenceConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkApplication()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMetadataReport()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMonitor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.getMetadataReportService()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadMonitor(org.apache.dubbo.common.URL)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadRegistries(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractMethodConfig.setMock(java.lang.Boolean)`

## org.apache.dubbo.config.AbstractServiceConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkApplication()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMetadataReport()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMonitor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.getMetadataReportService()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadMonitor(org.apache.dubbo.common.URL)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadRegistries(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractMethodConfig.setMock(java.lang.Boolean)`

## org.apache.dubbo.config.ApplicationConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

## org.apache.dubbo.config.ConfigCenterConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

## org.apache.dubbo.config.Constants

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.config.Constants.CONFIG_APPNAME_KEY`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.config.Constants.CONFIG_TIMEOUT_KEY`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.config.Constants.PROTOCOLS_SUFFIX`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.config.Constants.REGISTRIES_SUFFIX`

## org.apache.dubbo.config.ConsumerConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkApplication()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMetadataReport()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMonitor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.getMetadataReportService()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadMonitor(org.apache.dubbo.common.URL)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadRegistries(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractMethodConfig.setMock(java.lang.Boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.ConsumerConfig.getDefault()`

## org.apache.dubbo.config.MetadataReportConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

## org.apache.dubbo.config.MethodConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractMethodConfig.setMock(java.lang.Boolean)`

## org.apache.dubbo.config.MetricsConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

## org.apache.dubbo.config.ModuleConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

## org.apache.dubbo.config.MonitorConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

## org.apache.dubbo.config.ProtocolConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.ProtocolConfig.destroy()`

## org.apache.dubbo.config.ProviderConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkApplication()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMetadataReport()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMonitor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.getMetadataReportService()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadMonitor(org.apache.dubbo.common.URL)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadRegistries(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractMethodConfig.setMock(java.lang.Boolean)`

## org.apache.dubbo.config.ReferenceConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkApplication()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMetadataReport()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMonitor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.getMetadataReportService()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadMonitor(org.apache.dubbo.common.URL)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadRegistries(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractMethodConfig.setMock(java.lang.Boolean)`

## org.apache.dubbo.config.RegistryConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.RegistryConfig.isZookeeperProtocol()`

## org.apache.dubbo.config.ServiceConfig

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkApplication()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMetadataReport()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMonitor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.getMetadataReportService()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadMonitor(org.apache.dubbo.common.URL)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadRegistries(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.ServiceConfig.checkAndUpdateSubConfigs()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.ServiceConfig.setMock(java.lang.Boolean)`

## org.apache.dubbo.config.builders.AbstractBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.builders.AbstractBuilder`

## org.apache.dubbo.config.builders.AbstractInterfaceBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.builders.AbstractInterfaceBuilder`

## org.apache.dubbo.config.builders.AbstractMethodBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.builders.AbstractMethodBuilder`

## org.apache.dubbo.config.builders.AbstractReferenceBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.builders.AbstractReferenceBuilder`

## org.apache.dubbo.config.builders.AbstractServiceBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.builders.AbstractServiceBuilder`

## org.apache.dubbo.config.builders.ApplicationBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.builders.ApplicationBuilder`

## org.apache.dubbo.config.builders.ArgumentBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.builders.ArgumentBuilder`

## org.apache.dubbo.config.builders.ConfigCenterBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.builders.ConfigCenterBuilder`

## org.apache.dubbo.config.builders.ConsumerBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.builders.ConsumerBuilder`

## org.apache.dubbo.config.builders.DubboBuilders

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.builders.DubboBuilders`

## org.apache.dubbo.config.builders.MetadataReportBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.builders.MetadataReportBuilder`

## org.apache.dubbo.config.builders.MethodBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.builders.MethodBuilder`

## org.apache.dubbo.config.builders.ModuleBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.builders.ModuleBuilder`

## org.apache.dubbo.config.builders.MonitorBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.builders.MonitorBuilder`

## org.apache.dubbo.config.builders.ProtocolBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.builders.ProtocolBuilder`

## org.apache.dubbo.config.builders.ProviderBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.builders.ProviderBuilder`

## org.apache.dubbo.config.builders.ReferenceBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.builders.ReferenceBuilder`

## org.apache.dubbo.config.builders.RegistryBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.builders.RegistryBuilder`

## org.apache.dubbo.config.builders.ServiceBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.builders.ServiceBuilder`

## org.apache.dubbo.config.context.ConfigManager

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.context.ConfigManager.addProtocols(java.util.List<org.apache.dubbo.config.ProtocolConfig>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.context.ConfigManager.addRegistries(java.util.List<org.apache.dubbo.config.RegistryConfig>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.context.ConfigManager.getConfigCenter()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.context.ConfigManager.getInstance()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.context.ConfigManager.setConfigCenter(org.apache.dubbo.config.ConfigCenterConfig)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.config.context.ConfigManager.getConsumers()`
+ NEW RETURN TYPE: `org.apache.dubbo.config.context.ConfigManager.getConsumers()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.config.context.ConfigManager.getDefaultProtocols()`
+ NEW RETURN TYPE: `org.apache.dubbo.config.context.ConfigManager.getDefaultProtocols()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.config.context.ConfigManager.getDefaultRegistries()`
+ NEW RETURN TYPE: `org.apache.dubbo.config.context.ConfigManager.getDefaultRegistries()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.config.context.ConfigManager.getProtocols()`
+ NEW RETURN TYPE: `org.apache.dubbo.config.context.ConfigManager.getProtocols()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.config.context.ConfigManager.getProviders()`
+ NEW RETURN TYPE: `org.apache.dubbo.config.context.ConfigManager.getProviders()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.config.context.ConfigManager.getRegistries()`
+ NEW RETURN TYPE: `org.apache.dubbo.config.context.ConfigManager.getRegistries()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.config.context.ConfigManager.getConsumers()`
+ NEW RETURN TYPE: `org.apache.dubbo.config.context.ConfigManager.getConsumers()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.config.context.ConfigManager.getDefaultProtocols()`
+ NEW RETURN TYPE: `org.apache.dubbo.config.context.ConfigManager.getDefaultProtocols()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.config.context.ConfigManager.getDefaultRegistries()`
+ NEW RETURN TYPE: `org.apache.dubbo.config.context.ConfigManager.getDefaultRegistries()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.config.context.ConfigManager.getProtocols()`
+ NEW RETURN TYPE: `org.apache.dubbo.config.context.ConfigManager.getProtocols()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.config.context.ConfigManager.getProviders()`
+ NEW RETURN TYPE: `org.apache.dubbo.config.context.ConfigManager.getProviders()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.config.context.ConfigManager.getRegistries()`
+ NEW RETURN TYPE: `org.apache.dubbo.config.context.ConfigManager.getRegistries()`

## org.apache.dubbo.config.invoker.DelegateProviderMetaDataInvoker

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.dubbo.config.invoker.DelegateProviderMetaDataInvoker.<init>(org.apache.dubbo.rpc.Invoker<T>,org.apache.dubbo.config.ServiceConfig)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.config.invoker.DelegateProviderMetaDataInvoker.getMetadata()`
+ NEW RETURN TYPE: `org.apache.dubbo.config.invoker.DelegateProviderMetaDataInvoker.getMetadata()`

## org.apache.dubbo.config.spring.ConfigCenterBean

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

## org.apache.dubbo.config.spring.ReferenceBean

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkApplication()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMetadataReport()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMonitor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.getMetadataReportService()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadMonitor(org.apache.dubbo.common.URL)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadRegistries(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractMethodConfig.setMock(java.lang.Boolean)`

## org.apache.dubbo.config.spring.ServiceBean

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkKey(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMethodName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiExtension(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkMultiName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkNameHasSymbol(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkParameterName(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathLength(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkPathName(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.checkProperty(java.lang.String,java.lang.String,int,java.util.regex.Pattern)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractConfig.convertMethodConfig2AyncInfo(org.apache.dubbo.config.MethodConfig)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkApplication()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMetadataReport()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.checkMonitor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.getMetadataReportService()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadMonitor(org.apache.dubbo.common.URL)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.AbstractInterfaceConfig.loadRegistries(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.ServiceConfig.checkAndUpdateSubConfigs()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.ServiceConfig.setMock(java.lang.Boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.spring.ServiceBean.onApplicationEvent(org.springframework.context.event.ContextRefreshedEvent)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.config.spring.ServiceBean`

## org.apache.dubbo.config.spring.beans.factory.annotation.AnnotationInjectedBeanPostProcessor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.spring.beans.factory.annotation.AnnotationInjectedBeanPostProcessor`

## org.apache.dubbo.config.spring.beans.factory.annotation.AnnotationInjectedBeanPostProcessor$AnnotatedFieldElement

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.spring.beans.factory.annotation.AnnotationInjectedBeanPostProcessor$AnnotatedFieldElement`

## org.apache.dubbo.config.spring.beans.factory.annotation.DubboConfigBindingBeanPostProcessor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.spring.beans.factory.annotation.DubboConfigBindingBeanPostProcessor`

## org.apache.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.spring.beans.factory.annotation.AnnotationInjectedBeanPostProcessor.getAnnotationType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.spring.beans.factory.annotation.AnnotationInjectedBeanPostProcessor.getAnnotationTypes()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.spring.beans.factory.annotation.AnnotationInjectedBeanPostProcessor.getBeanFactory()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.spring.beans.factory.annotation.AnnotationInjectedBeanPostProcessor.getClassLoader()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.spring.beans.factory.annotation.AnnotationInjectedBeanPostProcessor.getEnvironment()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.spring.beans.factory.annotation.AnnotationInjectedBeanPostProcessor.getInjectedFieldObjectsMap()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.spring.beans.factory.annotation.AnnotationInjectedBeanPostProcessor.getInjectedMethodObjectsMap()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.spring.beans.factory.annotation.AnnotationInjectedBeanPostProcessor.getInjectedObject(org.springframework.core.annotation.AnnotationAttributes,java.lang.Object,java.lang.String,java.lang.Class<? extends java.lang.Object>,org.springframework.beans.factory.annotation.InjectionMetadata$InjectedElement)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.spring.beans.factory.annotation.AnnotationInjectedBeanPostProcessor.getInjectedObjects()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.spring.beans.factory.annotation.AnnotationInjectedBeanPostProcessor.getOrder()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.spring.beans.factory.annotation.AnnotationInjectedBeanPostProcessor.postProcessMergedBeanDefinition(org.springframework.beans.factory.support.RootBeanDefinition,java.lang.Class<? extends java.lang.Object>,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.spring.beans.factory.annotation.AnnotationInjectedBeanPostProcessor.postProcessPropertyValues(org.springframework.beans.PropertyValues,java.beans.PropertyDescriptor[],java.lang.Object,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.spring.beans.factory.annotation.AnnotationInjectedBeanPostProcessor.setBeanClassLoader(java.lang.ClassLoader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.spring.beans.factory.annotation.AnnotationInjectedBeanPostProcessor.setBeanFactory(org.springframework.beans.factory.BeanFactory)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.spring.beans.factory.annotation.AnnotationInjectedBeanPostProcessor.setEnvironment(org.springframework.core.env.Environment)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.spring.beans.factory.annotation.AnnotationInjectedBeanPostProcessor.setOrder(int)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.config.spring.beans.factory.annotation.ReferenceAnnotationBeanPostProcessor`

## org.apache.dubbo.config.spring.context.annotation.DubboClassPathBeanDefinitionScanner

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.spring.context.annotation.DubboClassPathBeanDefinitionScanner.doScan(java.lang.String[])`

## org.apache.dubbo.config.spring.context.annotation.DubboConfigBindingRegistrar

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.spring.context.annotation.DubboConfigBindingRegistrar`

## org.apache.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.spring.context.annotation.DubboConfigBindingsRegistrar`

## org.apache.dubbo.config.spring.context.annotation.EnableDubboConfigBinding

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.spring.context.annotation.EnableDubboConfigBinding`

## org.apache.dubbo.config.spring.context.annotation.EnableDubboConfigBindings

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.spring.context.annotation.EnableDubboConfigBindings`

## org.apache.dubbo.config.spring.util.AnnotatedBeanDefinitionRegistryUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.spring.util.AnnotatedBeanDefinitionRegistryUtils`

## org.apache.dubbo.config.spring.util.AnnotationUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.spring.util.AnnotationUtils`

## org.apache.dubbo.config.spring.util.BeanFactoryUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.spring.util.BeanFactoryUtils`

## org.apache.dubbo.config.spring.util.BeanRegistrar

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.spring.util.BeanRegistrar`

## org.apache.dubbo.config.spring.util.ClassUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.spring.util.ClassUtils`

## org.apache.dubbo.config.spring.util.ObjectUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.spring.util.ObjectUtils`

## org.apache.dubbo.config.spring.util.PropertySourcesUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.config.spring.util.PropertySourcesUtils`

## org.apache.dubbo.config.utils.ReferenceConfigCache

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.utils.ReferenceConfigCache.destroy(org.apache.dubbo.config.ReferenceConfig<T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.utils.ReferenceConfigCache.get(org.apache.dubbo.config.ReferenceConfig<T>)`

## org.apache.dubbo.config.utils.ReferenceConfigCache$KeyGenerator

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.config.utils.ReferenceConfigCache$KeyGenerator.generateKey(org.apache.dubbo.config.ReferenceConfig<? extends java.lang.Object>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.config.utils.ReferenceConfigCache$KeyGenerator`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.config.utils.ReferenceConfigCache$KeyGenerator.generateKey(org.apache.dubbo.config.ReferenceConfigBase<? extends java.lang.Object>)`

## org.apache.dubbo.configcenter.AbstractDynamicConfigurationFactory

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.configcenter.AbstractDynamicConfigurationFactory`

## org.apache.dubbo.configcenter.ConfigChangeEvent

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.configcenter.ConfigChangeEvent`

## org.apache.dubbo.configcenter.ConfigChangeType

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.configcenter.ConfigChangeType`

## org.apache.dubbo.configcenter.ConfigurationListener

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.configcenter.ConfigurationListener`

## org.apache.dubbo.configcenter.Constants

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.configcenter.Constants`

## org.apache.dubbo.configcenter.DynamicConfiguration

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.configcenter.DynamicConfiguration`

## org.apache.dubbo.configcenter.DynamicConfigurationFactory

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.configcenter.DynamicConfigurationFactory`

## org.apache.dubbo.configcenter.consul.ConsulDynamicConfiguration

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.DynamicConfiguration.addListener(java.lang.String,org.apache.dubbo.configcenter.ConfigurationListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.DynamicConfiguration.getRule(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.DynamicConfiguration.removeListener(java.lang.String,org.apache.dubbo.configcenter.ConfigurationListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.consul.ConsulDynamicConfiguration.addListener(java.lang.String,java.lang.String,org.apache.dubbo.configcenter.ConfigurationListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.consul.ConsulDynamicConfiguration.getRule(java.lang.String,java.lang.String,long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.consul.ConsulDynamicConfiguration.removeListener(java.lang.String,java.lang.String,org.apache.dubbo.configcenter.ConfigurationListener)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.configcenter.DynamicConfiguration.getDynamicConfiguration()`
+ NEW RETURN TYPE: `org.apache.dubbo.common.config.configcenter.DynamicConfiguration.getDynamicConfiguration()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.configcenter.consul.ConsulDynamicConfiguration.getInternalProperty(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.dubbo.configcenter.consul.ConsulDynamicConfiguration.getInternalProperty(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.configcenter.DynamicConfiguration.getDynamicConfiguration()`
+ NEW RETURN TYPE: `org.apache.dubbo.common.config.configcenter.DynamicConfiguration.getDynamicConfiguration()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.configcenter.consul.ConsulDynamicConfiguration.getInternalProperty(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.dubbo.configcenter.consul.ConsulDynamicConfiguration.getInternalProperty(java.lang.String)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.configcenter.consul.ConsulDynamicConfiguration`

## org.apache.dubbo.configcenter.consul.ConsulDynamicConfigurationFactory

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.dubbo.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.common.config.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.configcenter.consul.ConsulDynamicConfigurationFactory.createDynamicConfiguration(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.configcenter.consul.ConsulDynamicConfigurationFactory.createDynamicConfiguration(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.common.config.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.configcenter.consul.ConsulDynamicConfigurationFactory.createDynamicConfiguration(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.configcenter.consul.ConsulDynamicConfigurationFactory.createDynamicConfiguration(org.apache.dubbo.common.URL)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.configcenter.consul.ConsulDynamicConfigurationFactory`

## org.apache.dubbo.configcenter.support.apollo.ApolloDynamicConfiguration

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.DynamicConfiguration.addListener(java.lang.String,org.apache.dubbo.configcenter.ConfigurationListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.DynamicConfiguration.getRule(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.DynamicConfiguration.removeListener(java.lang.String,org.apache.dubbo.configcenter.ConfigurationListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.support.apollo.ApolloDynamicConfiguration.addListener(java.lang.String,java.lang.String,org.apache.dubbo.configcenter.ConfigurationListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.support.apollo.ApolloDynamicConfiguration.getRule(java.lang.String,java.lang.String,long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.support.apollo.ApolloDynamicConfiguration.removeListener(java.lang.String,java.lang.String,org.apache.dubbo.configcenter.ConfigurationListener)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.configcenter.DynamicConfiguration.getDynamicConfiguration()`
+ NEW RETURN TYPE: `org.apache.dubbo.common.config.configcenter.DynamicConfiguration.getDynamicConfiguration()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.configcenter.DynamicConfiguration.getDynamicConfiguration()`
+ NEW RETURN TYPE: `org.apache.dubbo.common.config.configcenter.DynamicConfiguration.getDynamicConfiguration()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.configcenter.support.apollo.ApolloDynamicConfiguration`

## org.apache.dubbo.configcenter.support.apollo.ApolloDynamicConfigurationFactory

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.dubbo.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.common.config.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.configcenter.support.apollo.ApolloDynamicConfigurationFactory.createDynamicConfiguration(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.configcenter.support.apollo.ApolloDynamicConfigurationFactory.createDynamicConfiguration(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.common.config.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.configcenter.support.apollo.ApolloDynamicConfigurationFactory.createDynamicConfiguration(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.configcenter.support.apollo.ApolloDynamicConfigurationFactory.createDynamicConfiguration(org.apache.dubbo.common.URL)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.configcenter.support.apollo.ApolloDynamicConfigurationFactory`

## org.apache.dubbo.configcenter.support.etcd.EtcdDynamicConfiguration

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.DynamicConfiguration.addListener(java.lang.String,org.apache.dubbo.configcenter.ConfigurationListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.DynamicConfiguration.getRule(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.DynamicConfiguration.removeListener(java.lang.String,org.apache.dubbo.configcenter.ConfigurationListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.support.etcd.EtcdDynamicConfiguration.addListener(java.lang.String,java.lang.String,org.apache.dubbo.configcenter.ConfigurationListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.support.etcd.EtcdDynamicConfiguration.getRule(java.lang.String,java.lang.String,long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.support.etcd.EtcdDynamicConfiguration.removeListener(java.lang.String,java.lang.String,org.apache.dubbo.configcenter.ConfigurationListener)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.configcenter.DynamicConfiguration.getDynamicConfiguration()`
+ NEW RETURN TYPE: `org.apache.dubbo.common.config.configcenter.DynamicConfiguration.getDynamicConfiguration()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.configcenter.DynamicConfiguration.getDynamicConfiguration()`
+ NEW RETURN TYPE: `org.apache.dubbo.common.config.configcenter.DynamicConfiguration.getDynamicConfiguration()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.configcenter.support.etcd.EtcdDynamicConfiguration`

## org.apache.dubbo.configcenter.support.etcd.EtcdDynamicConfiguration$EtcdConfigWatcher

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.configcenter.support.etcd.EtcdDynamicConfiguration$EtcdConfigWatcher.<init>(java.lang.String,org.apache.dubbo.configcenter.ConfigurationListener)`

## org.apache.dubbo.configcenter.support.etcd.EtcdDynamicConfigurationFactory

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.dubbo.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.common.config.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.configcenter.support.etcd.EtcdDynamicConfigurationFactory.createDynamicConfiguration(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.configcenter.support.etcd.EtcdDynamicConfigurationFactory.createDynamicConfiguration(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.common.config.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.configcenter.support.etcd.EtcdDynamicConfigurationFactory.createDynamicConfiguration(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.configcenter.support.etcd.EtcdDynamicConfigurationFactory.createDynamicConfiguration(org.apache.dubbo.common.URL)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.configcenter.support.etcd.EtcdDynamicConfigurationFactory`

## org.apache.dubbo.configcenter.support.nacos.NacosDynamicConfiguration

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.DynamicConfiguration.addListener(java.lang.String,org.apache.dubbo.configcenter.ConfigurationListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.DynamicConfiguration.getRule(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.DynamicConfiguration.removeListener(java.lang.String,org.apache.dubbo.configcenter.ConfigurationListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.support.nacos.NacosDynamicConfiguration.addListener(java.lang.String,java.lang.String,org.apache.dubbo.configcenter.ConfigurationListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.support.nacos.NacosDynamicConfiguration.getRule(java.lang.String,java.lang.String,long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.support.nacos.NacosDynamicConfiguration.removeListener(java.lang.String,java.lang.String,org.apache.dubbo.configcenter.ConfigurationListener)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.configcenter.DynamicConfiguration.getDynamicConfiguration()`
+ NEW RETURN TYPE: `org.apache.dubbo.common.config.configcenter.DynamicConfiguration.getDynamicConfiguration()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.configcenter.DynamicConfiguration.getDynamicConfiguration()`
+ NEW RETURN TYPE: `org.apache.dubbo.common.config.configcenter.DynamicConfiguration.getDynamicConfiguration()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.configcenter.support.nacos.NacosDynamicConfiguration`

## org.apache.dubbo.configcenter.support.nacos.NacosDynamicConfigurationFactory

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.dubbo.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.common.config.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.configcenter.support.nacos.NacosDynamicConfigurationFactory.createDynamicConfiguration(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.configcenter.support.nacos.NacosDynamicConfigurationFactory.createDynamicConfiguration(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.common.config.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.configcenter.support.nacos.NacosDynamicConfigurationFactory.createDynamicConfiguration(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.configcenter.support.nacos.NacosDynamicConfigurationFactory.createDynamicConfiguration(org.apache.dubbo.common.URL)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.configcenter.support.nacos.NacosDynamicConfigurationFactory`

## org.apache.dubbo.configcenter.support.nop.NopDynamicConfiguration

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.configcenter.support.nop.NopDynamicConfiguration`

## org.apache.dubbo.configcenter.support.nop.NopDynamicConfigurationFactory

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.configcenter.support.nop.NopDynamicConfigurationFactory`

## org.apache.dubbo.configcenter.support.zookeeper.CacheListener

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.configcenter.support.zookeeper.CacheListener.<init>(java.lang.String,java.util.concurrent.CountDownLatch)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.support.zookeeper.CacheListener.addListener(java.lang.String,org.apache.dubbo.configcenter.ConfigurationListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.support.zookeeper.CacheListener.removeListener(java.lang.String,org.apache.dubbo.configcenter.ConfigurationListener)`

## org.apache.dubbo.configcenter.support.zookeeper.ZookeeperDynamicConfiguration

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.DynamicConfiguration.addListener(java.lang.String,org.apache.dubbo.configcenter.ConfigurationListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.DynamicConfiguration.getRule(java.lang.String,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.DynamicConfiguration.removeListener(java.lang.String,org.apache.dubbo.configcenter.ConfigurationListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.support.zookeeper.ZookeeperDynamicConfiguration.addListener(java.lang.String,java.lang.String,org.apache.dubbo.configcenter.ConfigurationListener)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.support.zookeeper.ZookeeperDynamicConfiguration.getRule(java.lang.String,java.lang.String,long)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.configcenter.support.zookeeper.ZookeeperDynamicConfiguration.removeListener(java.lang.String,java.lang.String,org.apache.dubbo.configcenter.ConfigurationListener)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.configcenter.DynamicConfiguration.getDynamicConfiguration()`
+ NEW RETURN TYPE: `org.apache.dubbo.common.config.configcenter.DynamicConfiguration.getDynamicConfiguration()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.configcenter.DynamicConfiguration.getDynamicConfiguration()`
+ NEW RETURN TYPE: `org.apache.dubbo.common.config.configcenter.DynamicConfiguration.getDynamicConfiguration()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.configcenter.support.zookeeper.ZookeeperDynamicConfiguration.getInternalProperty(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.dubbo.configcenter.support.zookeeper.ZookeeperDynamicConfiguration.getInternalProperty(java.lang.String)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.configcenter.support.zookeeper.ZookeeperDynamicConfiguration`

## org.apache.dubbo.configcenter.support.zookeeper.ZookeeperDynamicConfigurationFactory

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.dubbo.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.common.config.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.configcenter.support.zookeeper.ZookeeperDynamicConfigurationFactory.createDynamicConfiguration(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.configcenter.support.zookeeper.ZookeeperDynamicConfigurationFactory.createDynamicConfiguration(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.common.config.configcenter.AbstractDynamicConfigurationFactory.getDynamicConfiguration(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.configcenter.support.zookeeper.ZookeeperDynamicConfigurationFactory.createDynamicConfiguration(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.configcenter.support.zookeeper.ZookeeperDynamicConfigurationFactory.createDynamicConfiguration(org.apache.dubbo.common.URL)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.configcenter.support.zookeeper.ZookeeperDynamicConfigurationFactory`

## org.apache.dubbo.metadata.definition.builder.ArrayTypeBuilder

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.metadata.definition.builder.ArrayTypeBuilder`
+ MUST NOW IMPLEMENT: `java.lang.Comparable.compareTo(T)`

## org.apache.dubbo.metadata.definition.builder.CollectionTypeBuilder

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.metadata.definition.builder.CollectionTypeBuilder`
+ MUST NOW IMPLEMENT: `java.lang.Comparable.compareTo(T)`

## org.apache.dubbo.metadata.definition.builder.EnumTypeBuilder

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.metadata.definition.builder.EnumTypeBuilder`
+ MUST NOW IMPLEMENT: `java.lang.Comparable.compareTo(T)`

## org.apache.dubbo.metadata.definition.builder.MapTypeBuilder

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.metadata.definition.builder.MapTypeBuilder`
+ MUST NOW IMPLEMENT: `java.lang.Comparable.compareTo(T)`

## org.apache.dubbo.metadata.definition.builder.TypeBuilder

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.metadata.definition.builder.TypeBuilder`
+ MUST NOW IMPLEMENT: `java.lang.Comparable.compareTo(T)`

## org.apache.dubbo.metadata.identifier.MetadataIdentifier

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.metadata.identifier.MetadataIdentifier`

## org.apache.dubbo.metadata.identifier.MetadataIdentifier$KeyTypeEnum

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.metadata.identifier.MetadataIdentifier$KeyTypeEnum`

## org.apache.dubbo.metadata.integration.MetadataReportService

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.metadata.integration.MetadataReportService`

## org.apache.dubbo.metadata.store.MetadataReport

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.metadata.store.MetadataReport`

## org.apache.dubbo.metadata.store.MetadataReportFactory

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.metadata.store.MetadataReportFactory`

## org.apache.dubbo.metadata.store.consul.ConsulMetadataReport

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.dubbo.metadata.support.AbstractMetadataReport.metadataReportRetry`
+ NEW FIELD: `org.apache.dubbo.metadata.report.support.AbstractMetadataReport.metadataReportRetry`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.dubbo.metadata.support.AbstractMetadataReport.metadataReportRetry`
+ NEW FIELD: `org.apache.dubbo.metadata.report.support.AbstractMetadataReport.metadataReportRetry`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.metadata.store.consul.ConsulMetadataReport.doStoreConsumerMetadata(org.apache.dubbo.metadata.identifier.MetadataIdentifier,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.metadata.store.consul.ConsulMetadataReport.doStoreProviderMetadata(org.apache.dubbo.metadata.identifier.MetadataIdentifier,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.metadata.support.AbstractMetadataReport.storeConsumerMetadata(org.apache.dubbo.metadata.identifier.MetadataIdentifier,java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.metadata.support.AbstractMetadataReport.storeConsumerMetadataTask(org.apache.dubbo.metadata.identifier.MetadataIdentifier,java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.metadata.support.AbstractMetadataReport.storeProviderMetadata(org.apache.dubbo.metadata.identifier.MetadataIdentifier,org.apache.dubbo.metadata.definition.model.FullServiceDefinition)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.metadata.store.consul.ConsulMetadataReport`

## org.apache.dubbo.metadata.store.consul.ConsulMetadataReportFactory

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.metadata.store.consul.ConsulMetadataReportFactory.createMetadataReport(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.metadata.store.consul.ConsulMetadataReportFactory.createMetadataReport(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.metadata.support.AbstractMetadataReportFactory.getMetadataReport(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.metadata.report.support.AbstractMetadataReportFactory.getMetadataReport(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.metadata.store.consul.ConsulMetadataReportFactory.createMetadataReport(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.metadata.store.consul.ConsulMetadataReportFactory.createMetadataReport(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.metadata.support.AbstractMetadataReportFactory.getMetadataReport(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.metadata.report.support.AbstractMetadataReportFactory.getMetadataReport(org.apache.dubbo.common.URL)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.metadata.store.consul.ConsulMetadataReportFactory`

## org.apache.dubbo.metadata.store.etcd.EtcdMetadataReport

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.dubbo.metadata.support.AbstractMetadataReport.metadataReportRetry`
+ NEW FIELD: `org.apache.dubbo.metadata.report.support.AbstractMetadataReport.metadataReportRetry`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.dubbo.metadata.support.AbstractMetadataReport.metadataReportRetry`
+ NEW FIELD: `org.apache.dubbo.metadata.report.support.AbstractMetadataReport.metadataReportRetry`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.metadata.store.etcd.EtcdMetadataReport.doStoreConsumerMetadata(org.apache.dubbo.metadata.identifier.MetadataIdentifier,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.metadata.store.etcd.EtcdMetadataReport.doStoreProviderMetadata(org.apache.dubbo.metadata.identifier.MetadataIdentifier,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.metadata.support.AbstractMetadataReport.storeConsumerMetadata(org.apache.dubbo.metadata.identifier.MetadataIdentifier,java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.metadata.support.AbstractMetadataReport.storeConsumerMetadataTask(org.apache.dubbo.metadata.identifier.MetadataIdentifier,java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.metadata.support.AbstractMetadataReport.storeProviderMetadata(org.apache.dubbo.metadata.identifier.MetadataIdentifier,org.apache.dubbo.metadata.definition.model.FullServiceDefinition)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.metadata.store.etcd.EtcdMetadataReport`

## org.apache.dubbo.metadata.store.etcd.EtcdMetadataReportFactory

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.metadata.store.etcd.EtcdMetadataReportFactory.createMetadataReport(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.metadata.store.etcd.EtcdMetadataReportFactory.createMetadataReport(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.metadata.support.AbstractMetadataReportFactory.getMetadataReport(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.metadata.report.support.AbstractMetadataReportFactory.getMetadataReport(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.metadata.store.etcd.EtcdMetadataReportFactory.createMetadataReport(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.metadata.store.etcd.EtcdMetadataReportFactory.createMetadataReport(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.metadata.support.AbstractMetadataReportFactory.getMetadataReport(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.metadata.report.support.AbstractMetadataReportFactory.getMetadataReport(org.apache.dubbo.common.URL)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.metadata.store.etcd.EtcdMetadataReportFactory`

## org.apache.dubbo.metadata.store.nacos.NacosMetadataReport

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.dubbo.metadata.support.AbstractMetadataReport.metadataReportRetry`
+ NEW FIELD: `org.apache.dubbo.metadata.report.support.AbstractMetadataReport.metadataReportRetry`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.dubbo.metadata.support.AbstractMetadataReport.metadataReportRetry`
+ NEW FIELD: `org.apache.dubbo.metadata.report.support.AbstractMetadataReport.metadataReportRetry`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.metadata.store.nacos.NacosMetadataReport.doStoreConsumerMetadata(org.apache.dubbo.metadata.identifier.MetadataIdentifier,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.metadata.store.nacos.NacosMetadataReport.doStoreProviderMetadata(org.apache.dubbo.metadata.identifier.MetadataIdentifier,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.metadata.support.AbstractMetadataReport.storeConsumerMetadata(org.apache.dubbo.metadata.identifier.MetadataIdentifier,java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.metadata.support.AbstractMetadataReport.storeConsumerMetadataTask(org.apache.dubbo.metadata.identifier.MetadataIdentifier,java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.metadata.support.AbstractMetadataReport.storeProviderMetadata(org.apache.dubbo.metadata.identifier.MetadataIdentifier,org.apache.dubbo.metadata.definition.model.FullServiceDefinition)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.metadata.store.nacos.NacosMetadataReport.buildConfigService(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.metadata.store.nacos.NacosMetadataReport.buildConfigService(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.metadata.store.nacos.NacosMetadataReport.buildConfigService(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.metadata.store.nacos.NacosMetadataReport.buildConfigService(org.apache.dubbo.common.URL)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.metadata.store.nacos.NacosMetadataReport`

## org.apache.dubbo.metadata.store.nacos.NacosMetadataReportFactory

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.metadata.store.nacos.NacosMetadataReportFactory.createMetadataReport(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.metadata.store.nacos.NacosMetadataReportFactory.createMetadataReport(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.metadata.support.AbstractMetadataReportFactory.getMetadataReport(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.metadata.report.support.AbstractMetadataReportFactory.getMetadataReport(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.metadata.store.nacos.NacosMetadataReportFactory.createMetadataReport(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.metadata.store.nacos.NacosMetadataReportFactory.createMetadataReport(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.metadata.support.AbstractMetadataReportFactory.getMetadataReport(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.metadata.report.support.AbstractMetadataReportFactory.getMetadataReport(org.apache.dubbo.common.URL)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.metadata.store.nacos.NacosMetadataReportFactory`

## org.apache.dubbo.metadata.store.redis.RedisMetadataReport

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.dubbo.metadata.support.AbstractMetadataReport.metadataReportRetry`
+ NEW FIELD: `org.apache.dubbo.metadata.report.support.AbstractMetadataReport.metadataReportRetry`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.dubbo.metadata.support.AbstractMetadataReport.metadataReportRetry`
+ NEW FIELD: `org.apache.dubbo.metadata.report.support.AbstractMetadataReport.metadataReportRetry`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.metadata.store.redis.RedisMetadataReport.doStoreConsumerMetadata(org.apache.dubbo.metadata.identifier.MetadataIdentifier,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.metadata.store.redis.RedisMetadataReport.doStoreProviderMetadata(org.apache.dubbo.metadata.identifier.MetadataIdentifier,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.metadata.support.AbstractMetadataReport.storeConsumerMetadata(org.apache.dubbo.metadata.identifier.MetadataIdentifier,java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.metadata.support.AbstractMetadataReport.storeConsumerMetadataTask(org.apache.dubbo.metadata.identifier.MetadataIdentifier,java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.metadata.support.AbstractMetadataReport.storeProviderMetadata(org.apache.dubbo.metadata.identifier.MetadataIdentifier,org.apache.dubbo.metadata.definition.model.FullServiceDefinition)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.metadata.store.redis.RedisMetadataReport`

## org.apache.dubbo.metadata.store.redis.RedisMetadataReportFactory

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.metadata.store.redis.RedisMetadataReportFactory.createMetadataReport(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.metadata.store.redis.RedisMetadataReportFactory.createMetadataReport(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.metadata.support.AbstractMetadataReportFactory.getMetadataReport(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.metadata.report.support.AbstractMetadataReportFactory.getMetadataReport(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.metadata.store.redis.RedisMetadataReportFactory.createMetadataReport(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.metadata.store.redis.RedisMetadataReportFactory.createMetadataReport(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.metadata.support.AbstractMetadataReportFactory.getMetadataReport(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.metadata.report.support.AbstractMetadataReportFactory.getMetadataReport(org.apache.dubbo.common.URL)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.metadata.store.redis.RedisMetadataReportFactory`

## org.apache.dubbo.metadata.store.zookeeper.ZookeeperMetadataReport

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.dubbo.metadata.support.AbstractMetadataReport.metadataReportRetry`
+ NEW FIELD: `org.apache.dubbo.metadata.report.support.AbstractMetadataReport.metadataReportRetry`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.dubbo.metadata.support.AbstractMetadataReport.metadataReportRetry`
+ NEW FIELD: `org.apache.dubbo.metadata.report.support.AbstractMetadataReport.metadataReportRetry`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.metadata.store.zookeeper.ZookeeperMetadataReport.doStoreConsumerMetadata(org.apache.dubbo.metadata.identifier.MetadataIdentifier,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.metadata.store.zookeeper.ZookeeperMetadataReport.doStoreProviderMetadata(org.apache.dubbo.metadata.identifier.MetadataIdentifier,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.metadata.support.AbstractMetadataReport.storeConsumerMetadata(org.apache.dubbo.metadata.identifier.MetadataIdentifier,java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.metadata.support.AbstractMetadataReport.storeConsumerMetadataTask(org.apache.dubbo.metadata.identifier.MetadataIdentifier,java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.metadata.support.AbstractMetadataReport.storeProviderMetadata(org.apache.dubbo.metadata.identifier.MetadataIdentifier,org.apache.dubbo.metadata.definition.model.FullServiceDefinition)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.metadata.store.zookeeper.ZookeeperMetadataReport`

## org.apache.dubbo.metadata.store.zookeeper.ZookeeperMetadataReportFactory

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.metadata.store.zookeeper.ZookeeperMetadataReportFactory.createMetadataReport(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.metadata.store.zookeeper.ZookeeperMetadataReportFactory.createMetadataReport(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.metadata.support.AbstractMetadataReportFactory.getMetadataReport(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.metadata.report.support.AbstractMetadataReportFactory.getMetadataReport(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.metadata.store.zookeeper.ZookeeperMetadataReportFactory.createMetadataReport(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.metadata.store.zookeeper.ZookeeperMetadataReportFactory.createMetadataReport(org.apache.dubbo.common.URL)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.metadata.support.AbstractMetadataReportFactory.getMetadataReport(org.apache.dubbo.common.URL)`
+ NEW RETURN TYPE: `org.apache.dubbo.metadata.report.support.AbstractMetadataReportFactory.getMetadataReport(org.apache.dubbo.common.URL)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.metadata.store.zookeeper.ZookeeperMetadataReportFactory`

## org.apache.dubbo.metadata.support.AbstractMetadataReport

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.metadata.support.AbstractMetadataReport`

## org.apache.dubbo.metadata.support.AbstractMetadataReportFactory

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.metadata.support.AbstractMetadataReportFactory`

## org.apache.dubbo.metadata.support.Constants

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.metadata.support.Constants`

## org.apache.dubbo.monitor.Constants

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.monitor.Constants.METRICS_PORT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.monitor.Constants.METRICS_PROTOCOL`

## org.apache.dubbo.monitor.dubbo.MetricsFilter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

## org.apache.dubbo.monitor.support.MonitorFilter

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.ListenableFilter.listener`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.ListenableFilter.listener()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`
+ NEW RETURN TYPE: `org.apache.dubbo.monitor.support.MonitorFilter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`
+ NEW RETURN TYPE: `org.apache.dubbo.monitor.support.MonitorFilter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.monitor.support.MonitorFilter`

## org.apache.dubbo.qos.command.util.CommandHelper

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.apache.dubbo.qos.command.util.CommandHelper`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `org.apache.dubbo.qos.command.util.CommandHelper`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.qos.command.util.CommandHelper.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.dubbo.qos.command.util.CommandHelper.getAllCommandClass()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.dubbo.qos.command.util.CommandHelper.getCommandClass(java.lang.String)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.dubbo.qos.command.util.CommandHelper.hasCommand(java.lang.String)`

## org.apache.dubbo.qos.server.DubboLogo

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.qos.server.DubboLogo.dubbo`

## org.apache.dubbo.qos.server.handler.QosProcessHandler

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.qos.server.handler.QosProcessHandler.prompt`

## org.apache.dubbo.registry.Constants

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.registry.Constants.EXTRA_KEYS_KEY`

## org.apache.dubbo.registry.consul.ConsulRegistry

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.registry.support.FailbackRegistry.removeFailedNotifiedTask(org.apache.dubbo.common.URL,org.apache.dubbo.registry.NotifyListener)`

## org.apache.dubbo.registry.dubbo.DubboRegistry

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.registry.support.FailbackRegistry.removeFailedNotifiedTask(org.apache.dubbo.common.URL,org.apache.dubbo.registry.NotifyListener)`

## org.apache.dubbo.registry.etcd.EtcdRegistry

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.registry.support.FailbackRegistry.removeFailedNotifiedTask(org.apache.dubbo.common.URL,org.apache.dubbo.registry.NotifyListener)`

## org.apache.dubbo.registry.integration.AbstractConfiguratorListener

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.registry.integration.AbstractConfiguratorListener.process(org.apache.dubbo.configcenter.ConfigChangeEvent)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.registry.integration.AbstractConfiguratorListener`

## org.apache.dubbo.registry.integration.RegistryDirectory

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.registry.integration.RegistryDirectory.getUrlInvokerMap()`
+ NEW RETURN TYPE: `org.apache.dubbo.registry.integration.RegistryDirectory.getUrlInvokerMap()`

## org.apache.dubbo.registry.integration.RegistryProtocol

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.registry.integration.RegistryProtocol.getRegisteredConsumerUrl(org.apache.dubbo.common.URL,org.apache.dubbo.common.URL)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.registry.integration.RegistryProtocol.register(org.apache.dubbo.common.URL,org.apache.dubbo.common.URL)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.registry.integration.RegistryProtocol.setCluster(org.apache.dubbo.rpc.cluster.Cluster)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.registry.integration.RegistryProtocol.unregister(org.apache.dubbo.common.URL,org.apache.dubbo.common.URL)`

## org.apache.dubbo.registry.multicast.MulticastRegistry

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.registry.support.FailbackRegistry.removeFailedNotifiedTask(org.apache.dubbo.common.URL,org.apache.dubbo.registry.NotifyListener)`

## org.apache.dubbo.registry.nacos.NacosRegistry

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.registry.nacos.NacosRegistry.<init>(org.apache.dubbo.common.URL,com.alibaba.nacos.api.naming.NamingService)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.registry.support.FailbackRegistry.removeFailedNotifiedTask(org.apache.dubbo.common.URL,org.apache.dubbo.registry.NotifyListener)`

## org.apache.dubbo.registry.redis.RedisRegistry

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.registry.support.FailbackRegistry.removeFailedNotifiedTask(org.apache.dubbo.common.URL,org.apache.dubbo.registry.NotifyListener)`

## org.apache.dubbo.registry.retry.FailedNotifiedTask

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.registry.retry.FailedNotifiedTask`

## org.apache.dubbo.registry.sofa.SofaRegistry

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.registry.support.FailbackRegistry.removeFailedNotifiedTask(org.apache.dubbo.common.URL,org.apache.dubbo.registry.NotifyListener)`

## org.apache.dubbo.registry.support.ConsumerInvokerWrapper

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.registry.support.ConsumerInvokerWrapper`

## org.apache.dubbo.registry.support.FailbackRegistry

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.registry.support.FailbackRegistry.removeFailedNotifiedTask(org.apache.dubbo.common.URL,org.apache.dubbo.registry.NotifyListener)`

## org.apache.dubbo.registry.support.ProviderConsumerRegTable

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.registry.support.ProviderConsumerRegTable`

## org.apache.dubbo.registry.support.ProviderInvokerWrapper

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.registry.support.ProviderInvokerWrapper`

## org.apache.dubbo.registry.zookeeper.ZookeeperRegistry

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.registry.support.FailbackRegistry.removeFailedNotifiedTask(org.apache.dubbo.common.URL,org.apache.dubbo.registry.NotifyListener)`

## org.apache.dubbo.remoting.Constants

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.remoting.Constants.DUBBO_VERSION_KEY`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.remoting.Constants.EXECUTOR_SERVICE_COMPONENT_KEY`

## org.apache.dubbo.remoting.Server

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.remoting.Server`

## org.apache.dubbo.remoting.Transporter

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.remoting.Transporter.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler)`
+ NEW RETURN TYPE: `org.apache.dubbo.remoting.Transporter.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.remoting.Transporter.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler)`
+ NEW RETURN TYPE: `org.apache.dubbo.remoting.Transporter.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler)`

## org.apache.dubbo.remoting.Transporters

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.remoting.Transporters.bind(java.lang.String,org.apache.dubbo.remoting.ChannelHandler[])`
+ NEW RETURN TYPE: `org.apache.dubbo.remoting.Transporters.bind(java.lang.String,org.apache.dubbo.remoting.ChannelHandler[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.remoting.Transporters.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler[])`
+ NEW RETURN TYPE: `org.apache.dubbo.remoting.Transporters.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.remoting.Transporters.bind(java.lang.String,org.apache.dubbo.remoting.ChannelHandler[])`
+ NEW RETURN TYPE: `org.apache.dubbo.remoting.Transporters.bind(java.lang.String,org.apache.dubbo.remoting.ChannelHandler[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.remoting.Transporters.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler[])`
+ NEW RETURN TYPE: `org.apache.dubbo.remoting.Transporters.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler[])`

## org.apache.dubbo.remoting.exchange.ExchangeChannel

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.remoting.exchange.ExchangeChannel`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.remoting.exchange.ExchangeChannel.request(java.lang.Object,java.util.concurrent.ExecutorService)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.remoting.exchange.ExchangeChannel`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.remoting.exchange.ExchangeChannel.request(java.lang.Object,int,java.util.concurrent.ExecutorService)`

## org.apache.dubbo.remoting.exchange.ExchangeClient

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.remoting.exchange.ExchangeClient`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.remoting.exchange.ExchangeChannel.request(java.lang.Object,int,java.util.concurrent.ExecutorService)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.remoting.exchange.ExchangeClient`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.remoting.exchange.ExchangeChannel.request(java.lang.Object,java.util.concurrent.ExecutorService)`

## org.apache.dubbo.remoting.exchange.ExchangeServer

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.remoting.exchange.ExchangeServer`

## org.apache.dubbo.remoting.exchange.Request

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.remoting.exchange.Request.HEARTBEAT_EVENT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.remoting.exchange.Request.READONLY_EVENT`

## org.apache.dubbo.remoting.exchange.Response

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.remoting.exchange.Response.HEARTBEAT_EVENT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.remoting.exchange.Response.READONLY_EVENT`

## org.apache.dubbo.remoting.exchange.codec.ExchangeCodec

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.exchange.codec.ExchangeCodec.decodeEventData(org.apache.dubbo.remoting.Channel,org.apache.dubbo.common.serialize.ObjectInput)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.exchange.codec.ExchangeCodec.decodeHeartbeatData(org.apache.dubbo.common.serialize.ObjectInput)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.exchange.codec.ExchangeCodec.decodeHeartbeatData(org.apache.dubbo.remoting.Channel,org.apache.dubbo.common.serialize.ObjectInput)`

## org.apache.dubbo.remoting.exchange.support.DefaultFuture

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.exchange.support.DefaultFuture.newFuture(org.apache.dubbo.remoting.Channel,org.apache.dubbo.remoting.exchange.Request,int)`

## org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.remoting.exchange.support.ExchangeServerDelegate`

## org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeHandler

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeHandler.KEY_READ_TIMESTAMP`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeHandler.KEY_WRITE_TIMESTAMP`

## org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeServer

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeServer.<init>(org.apache.dubbo.remoting.Server)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeServer.getServer()`
+ NEW RETURN TYPE: `org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeServer.getServer()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeServer.getServer()`
+ NEW RETURN TYPE: `org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeServer.getServer()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.remoting.exchange.support.header.HeaderExchangeServer`

## org.apache.dubbo.remoting.http.HttpServer

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.remoting.http.HttpServer`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.remoting.Endpoint.getChannelHandler()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.remoting.http.HttpServer`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.remoting.Endpoint.send(java.lang.Object,boolean)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.remoting.http.HttpServer`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.remoting.RemotingServer.reset(org.apache.dubbo.common.Parameters)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.remoting.http.HttpServer`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.remoting.RemotingServer.getChannel(java.net.InetSocketAddress)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.remoting.http.HttpServer`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.remoting.RemotingServer.getChannels()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.remoting.http.HttpServer`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.remoting.Endpoint.send(java.lang.Object)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.remoting.http.HttpServer`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.remoting.Endpoint.startClose()`

## org.apache.dubbo.remoting.p2p.Peer

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.remoting.p2p.Peer`

## org.apache.dubbo.remoting.p2p.exchange.ExchangePeer

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.remoting.p2p.exchange.ExchangePeer`

## org.apache.dubbo.remoting.p2p.exchange.support.ExchangeServerPeer

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.remoting.p2p.exchange.support.ExchangeServerPeer`

## org.apache.dubbo.remoting.p2p.support.AbstractGroup

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.dubbo.remoting.p2p.support.AbstractGroup.servers`
+ NEW FIELD: `org.apache.dubbo.remoting.p2p.support.AbstractGroup.servers`

## org.apache.dubbo.remoting.p2p.support.FileGroup

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.dubbo.remoting.p2p.support.AbstractGroup.servers`
+ NEW FIELD: `org.apache.dubbo.remoting.p2p.support.AbstractGroup.servers`

## org.apache.dubbo.remoting.p2p.support.MulticastGroup

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.dubbo.remoting.p2p.support.AbstractGroup.servers`
+ NEW FIELD: `org.apache.dubbo.remoting.p2p.support.AbstractGroup.servers`

## org.apache.dubbo.remoting.p2p.support.ServerPeer

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.remoting.p2p.support.ServerPeer.<init>(org.apache.dubbo.remoting.Server,java.util.Map<org.apache.dubbo.common.URL,org.apache.dubbo.remoting.Client>,org.apache.dubbo.remoting.p2p.Group)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.transport.ServerDelegate.setServer(org.apache.dubbo.remoting.Server)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.remoting.transport.ServerDelegate.getServer()`
+ NEW RETURN TYPE: `org.apache.dubbo.remoting.transport.ServerDelegate.getServer()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.remoting.transport.ServerDelegate.getServer()`
+ NEW RETURN TYPE: `org.apache.dubbo.remoting.transport.ServerDelegate.getServer()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.remoting.p2p.support.ServerPeer`

## org.apache.dubbo.remoting.transport.AbstractClient

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.transport.AbstractEndpoint.getTimeout()`

## org.apache.dubbo.remoting.transport.AbstractEndpoint

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.transport.AbstractEndpoint.getTimeout()`

## org.apache.dubbo.remoting.transport.AbstractServer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.transport.AbstractEndpoint.getTimeout()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.transport.AbstractServer.getIdleTimeout()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.remoting.transport.AbstractServer`

## org.apache.dubbo.remoting.transport.ServerDelegate

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.remoting.transport.ServerDelegate.<init>(org.apache.dubbo.remoting.Server)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.transport.ServerDelegate.setServer(org.apache.dubbo.remoting.Server)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.remoting.transport.ServerDelegate.getServer()`
+ NEW RETURN TYPE: `org.apache.dubbo.remoting.transport.ServerDelegate.getServer()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.remoting.transport.ServerDelegate.getServer()`
+ NEW RETURN TYPE: `org.apache.dubbo.remoting.transport.ServerDelegate.getServer()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.remoting.transport.ServerDelegate`

## org.apache.dubbo.remoting.transport.dispatcher.WrappedChannelHandler

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.remoting.transport.dispatcher.WrappedChannelHandler.SHARED_EXECUTOR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.remoting.transport.dispatcher.WrappedChannelHandler.executor`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.transport.dispatcher.WrappedChannelHandler.getExecutor()`

## org.apache.dubbo.remoting.transport.dispatcher.all.AllChannelHandler

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.remoting.transport.dispatcher.WrappedChannelHandler.SHARED_EXECUTOR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.remoting.transport.dispatcher.WrappedChannelHandler.executor`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.transport.dispatcher.WrappedChannelHandler.getExecutor()`

## org.apache.dubbo.remoting.transport.dispatcher.connection.ConnectionOrderedChannelHandler

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.remoting.transport.dispatcher.WrappedChannelHandler.SHARED_EXECUTOR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.remoting.transport.dispatcher.WrappedChannelHandler.executor`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.transport.dispatcher.WrappedChannelHandler.getExecutor()`

## org.apache.dubbo.remoting.transport.dispatcher.execution.ExecutionChannelHandler

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.remoting.transport.dispatcher.WrappedChannelHandler.SHARED_EXECUTOR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.remoting.transport.dispatcher.WrappedChannelHandler.executor`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.transport.dispatcher.WrappedChannelHandler.getExecutor()`

## org.apache.dubbo.remoting.transport.dispatcher.message.MessageOnlyChannelHandler

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.remoting.transport.dispatcher.WrappedChannelHandler.SHARED_EXECUTOR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.remoting.transport.dispatcher.WrappedChannelHandler.executor`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.transport.dispatcher.WrappedChannelHandler.getExecutor()`

## org.apache.dubbo.remoting.transport.grizzly.GrizzlyClient

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.transport.AbstractEndpoint.getTimeout()`

## org.apache.dubbo.remoting.transport.grizzly.GrizzlyServer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.transport.AbstractEndpoint.getTimeout()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.transport.AbstractServer.getIdleTimeout()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.remoting.transport.grizzly.GrizzlyServer`

## org.apache.dubbo.remoting.transport.grizzly.GrizzlyTransporter

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.remoting.transport.grizzly.GrizzlyTransporter.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler)`
+ NEW RETURN TYPE: `org.apache.dubbo.remoting.transport.grizzly.GrizzlyTransporter.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.remoting.transport.grizzly.GrizzlyTransporter.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler)`
+ NEW RETURN TYPE: `org.apache.dubbo.remoting.transport.grizzly.GrizzlyTransporter.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler)`

## org.apache.dubbo.remoting.transport.mina.MinaClient

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.transport.AbstractEndpoint.getTimeout()`

## org.apache.dubbo.remoting.transport.mina.MinaServer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.transport.AbstractEndpoint.getTimeout()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.transport.AbstractServer.getIdleTimeout()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.remoting.transport.mina.MinaServer`

## org.apache.dubbo.remoting.transport.mina.MinaTransporter

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.remoting.transport.mina.MinaTransporter.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler)`
+ NEW RETURN TYPE: `org.apache.dubbo.remoting.transport.mina.MinaTransporter.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.remoting.transport.mina.MinaTransporter.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler)`
+ NEW RETURN TYPE: `org.apache.dubbo.remoting.transport.mina.MinaTransporter.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler)`

## org.apache.dubbo.remoting.transport.netty.NettyClient

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.transport.AbstractEndpoint.getTimeout()`

## org.apache.dubbo.remoting.transport.netty.NettyServer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.transport.AbstractEndpoint.getTimeout()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.transport.AbstractServer.getIdleTimeout()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.remoting.transport.netty.NettyServer`

## org.apache.dubbo.remoting.transport.netty.NettyTransporter

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.remoting.transport.netty.NettyTransporter.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler)`
+ NEW RETURN TYPE: `org.apache.dubbo.remoting.transport.netty.NettyTransporter.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.remoting.transport.netty.NettyTransporter.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler)`
+ NEW RETURN TYPE: `org.apache.dubbo.remoting.transport.netty.NettyTransporter.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler)`

## org.apache.dubbo.remoting.transport.netty4.NettyClient

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.transport.AbstractEndpoint.getTimeout()`

## org.apache.dubbo.remoting.transport.netty4.NettyServer

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.transport.AbstractEndpoint.getTimeout()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.transport.AbstractServer.getIdleTimeout()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.remoting.transport.netty4.NettyServer`

## org.apache.dubbo.remoting.transport.netty4.NettyTransporter

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.remoting.transport.netty4.NettyTransporter.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler)`
+ NEW RETURN TYPE: `org.apache.dubbo.remoting.transport.netty4.NettyTransporter.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.remoting.transport.netty4.NettyTransporter.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler)`
+ NEW RETURN TYPE: `org.apache.dubbo.remoting.transport.netty4.NettyTransporter.bind(org.apache.dubbo.common.URL,org.apache.dubbo.remoting.ChannelHandler)`

## org.apache.dubbo.remoting.zookeeper.EventType

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.zookeeper.EventType.fromInt(int)`

## org.apache.dubbo.remoting.zookeeper.StateListener

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.remoting.zookeeper.StateListener.DISCONNECTED`

## org.apache.dubbo.remoting.zookeeper.ZookeeperClient

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.remoting.zookeeper.ZookeeperClient`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.remoting.zookeeper.ZookeeperClient.checkExists(java.lang.String)`

## org.apache.dubbo.remoting.zookeeper.curator.CuratorZookeeperClient

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.zookeeper.curator.CuratorZookeeperClient.addTargetDataListener(java.lang.String,org.apache.dubbo.remoting.zookeeper.curator.CuratorZookeeperClient$CuratorWatcherImpl)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.zookeeper.curator.CuratorZookeeperClient.addTargetDataListener(java.lang.String,org.apache.dubbo.remoting.zookeeper.curator.CuratorZookeeperClient$CuratorWatcherImpl,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.zookeeper.curator.CuratorZookeeperClient.removeTargetDataListener(java.lang.String,org.apache.dubbo.remoting.zookeeper.curator.CuratorZookeeperClient$CuratorWatcherImpl)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.remoting.zookeeper.curator.CuratorZookeeperClient.createTargetDataListener(java.lang.String,org.apache.dubbo.remoting.zookeeper.DataListener)`
+ NEW RETURN TYPE: `org.apache.dubbo.remoting.zookeeper.curator.CuratorZookeeperClient.createTargetDataListener(java.lang.String,org.apache.dubbo.remoting.zookeeper.DataListener)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.remoting.zookeeper.curator.CuratorZookeeperClient.createTargetDataListener(java.lang.String,org.apache.dubbo.remoting.zookeeper.DataListener)`
+ NEW RETURN TYPE: `org.apache.dubbo.remoting.zookeeper.curator.CuratorZookeeperClient.createTargetDataListener(java.lang.String,org.apache.dubbo.remoting.zookeeper.DataListener)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.remoting.zookeeper.curator.CuratorZookeeperClient`

## org.apache.dubbo.remoting.zookeeper.curator.CuratorZookeeperTransporter

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.remoting.zookeeper.curator.CuratorZookeeperTransporter`

## org.apache.dubbo.remoting.zookeeper.support.AbstractZookeeperClient

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.remoting.zookeeper.support.AbstractZookeeperClient`

## org.apache.dubbo.remoting.zookeeper.support.AbstractZookeeperTransporter

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.remoting.zookeeper.support.AbstractZookeeperTransporter`

## org.apache.dubbo.rpc.AbstractResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.rpc.AbstractResult`

## org.apache.dubbo.rpc.AppResponse

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `java.util.concurrent.CompletableFuture.thenApply(java.util.function.Function<? super T,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.acceptEither(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.acceptEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.acceptEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Consumer<? super T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.allOf(java.util.concurrent.CompletableFuture<? extends java.lang.Object>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.anyOf(java.util.concurrent.CompletableFuture<? extends java.lang.Object>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.applyToEither(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Function<? super T,U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.applyToEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Function<? super T,U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.applyToEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Function<? super T,U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.cancel(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.complete(T)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completeAsync(java.util.function.Supplier<? extends T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completeAsync(java.util.function.Supplier<? extends T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completeExceptionally(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completeOnTimeout(T,long,java.util.concurrent.TimeUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completedFuture(U)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completedStage(U)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.copy()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.defaultExecutor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.delayedExecutor(long,java.util.concurrent.TimeUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.delayedExecutor(long,java.util.concurrent.TimeUnit,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionNow()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionally(java.util.function.Function<java.lang.Throwable,? extends T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionallyAsync(java.util.function.Function<java.lang.Throwable,? extends T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionallyAsync(java.util.function.Function<java.lang.Throwable,? extends T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionallyCompose(java.util.function.Function<java.lang.Throwable,? extends java.util.concurrent.CompletionStage<T>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionallyComposeAsync(java.util.function.Function<java.lang.Throwable,? extends java.util.concurrent.CompletionStage<T>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionallyComposeAsync(java.util.function.Function<java.lang.Throwable,? extends java.util.concurrent.CompletionStage<T>>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.failedFuture(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.failedStage(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.getNow(T)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.getNumberOfDependents()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.handle(java.util.function.BiFunction<? super T,java.lang.Throwable,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.handleAsync(java.util.function.BiFunction<? super T,java.lang.Throwable,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.handleAsync(java.util.function.BiFunction<? super T,java.lang.Throwable,? extends U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.isCancelled()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.isCompletedExceptionally()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.isDone()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.join()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.minimalCompletionStage()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.newIncompleteFuture()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.obtrudeException(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.obtrudeValue(T)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.orTimeout(long,java.util.concurrent.TimeUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.resultNow()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterBoth(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterBothAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterBothAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterEither(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterEitherAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterEitherAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAsync(java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAsync(java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.state()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.supplyAsync(java.util.function.Supplier<U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.supplyAsync(java.util.function.Supplier<U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAccept(java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAcceptAsync(java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAcceptAsync(java.util.function.Consumer<? super T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAcceptBoth(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiConsumer<? super T,? super U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAcceptBothAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiConsumer<? super T,? super U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAcceptBothAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiConsumer<? super T,? super U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenApplyAsync(java.util.function.Function<? super T,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenApplyAsync(java.util.function.Function<? super T,? extends U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenCombine(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiFunction<? super T,? super U,? extends V>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenCombineAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiFunction<? super T,? super U,? extends V>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenCombineAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiFunction<? super T,? super U,? extends V>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenCompose(java.util.function.Function<? super T,? extends java.util.concurrent.CompletionStage<U>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenComposeAsync(java.util.function.Function<? super T,? extends java.util.concurrent.CompletionStage<U>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenComposeAsync(java.util.function.Function<? super T,? extends java.util.concurrent.CompletionStage<U>>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenRun(java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenRunAsync(java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenRunAsync(java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.toCompletableFuture()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.whenComplete(java.util.function.BiConsumer<? super T,? super java.lang.Throwable>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.whenCompleteAsync(java.util.function.BiConsumer<? super T,? super java.lang.Throwable>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.whenCompleteAsync(java.util.function.BiConsumer<? super T,? super java.lang.Throwable>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Result.completionFuture()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Result.getNow(org.apache.dubbo.rpc.Result)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `java.util.concurrent.CompletableFuture.get()`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.AppResponse.get()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `java.util.concurrent.CompletableFuture.get(long,java.util.concurrent.TimeUnit)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.AppResponse.get(long,java.util.concurrent.TimeUnit)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `java.util.concurrent.CompletableFuture.get()`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.AppResponse.get()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `java.util.concurrent.CompletableFuture.get(long,java.util.concurrent.TimeUnit)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.AppResponse.get(long,java.util.concurrent.TimeUnit)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.rpc.AppResponse`

## org.apache.dubbo.rpc.AsyncRpcResult

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.rpc.AsyncRpcResult.<init>(org.apache.dubbo.rpc.AsyncRpcResult)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.rpc.AsyncRpcResult.<init>(org.apache.dubbo.rpc.Invocation)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `java.util.concurrent.CompletableFuture.thenApply(java.util.function.Function<? super T,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.acceptEither(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.acceptEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.acceptEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Consumer<? super T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.allOf(java.util.concurrent.CompletableFuture<? extends java.lang.Object>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.anyOf(java.util.concurrent.CompletableFuture<? extends java.lang.Object>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.applyToEither(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Function<? super T,U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.applyToEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Function<? super T,U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.applyToEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Function<? super T,U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.cancel(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.complete(T)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completeAsync(java.util.function.Supplier<? extends T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completeAsync(java.util.function.Supplier<? extends T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completeExceptionally(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completeOnTimeout(T,long,java.util.concurrent.TimeUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completedFuture(U)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completedStage(U)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.copy()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.defaultExecutor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.delayedExecutor(long,java.util.concurrent.TimeUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.delayedExecutor(long,java.util.concurrent.TimeUnit,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionNow()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionally(java.util.function.Function<java.lang.Throwable,? extends T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionallyAsync(java.util.function.Function<java.lang.Throwable,? extends T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionallyAsync(java.util.function.Function<java.lang.Throwable,? extends T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionallyCompose(java.util.function.Function<java.lang.Throwable,? extends java.util.concurrent.CompletionStage<T>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionallyComposeAsync(java.util.function.Function<java.lang.Throwable,? extends java.util.concurrent.CompletionStage<T>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionallyComposeAsync(java.util.function.Function<java.lang.Throwable,? extends java.util.concurrent.CompletionStage<T>>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.failedFuture(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.failedStage(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.getNow(T)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.getNumberOfDependents()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.handle(java.util.function.BiFunction<? super T,java.lang.Throwable,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.handleAsync(java.util.function.BiFunction<? super T,java.lang.Throwable,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.handleAsync(java.util.function.BiFunction<? super T,java.lang.Throwable,? extends U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.isCancelled()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.isCompletedExceptionally()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.isDone()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.join()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.minimalCompletionStage()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.newIncompleteFuture()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.obtrudeException(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.obtrudeValue(T)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.orTimeout(long,java.util.concurrent.TimeUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.resultNow()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterBoth(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterBothAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterBothAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterEither(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterEitherAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterEitherAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAsync(java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAsync(java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.state()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.supplyAsync(java.util.function.Supplier<U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.supplyAsync(java.util.function.Supplier<U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAccept(java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAcceptAsync(java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAcceptAsync(java.util.function.Consumer<? super T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAcceptBoth(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiConsumer<? super T,? super U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAcceptBothAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiConsumer<? super T,? super U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAcceptBothAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiConsumer<? super T,? super U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenApplyAsync(java.util.function.Function<? super T,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenApplyAsync(java.util.function.Function<? super T,? extends U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenCombine(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiFunction<? super T,? super U,? extends V>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenCombineAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiFunction<? super T,? super U,? extends V>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenCombineAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiFunction<? super T,? super U,? extends V>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenCompose(java.util.function.Function<? super T,? extends java.util.concurrent.CompletionStage<U>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenComposeAsync(java.util.function.Function<? super T,? extends java.util.concurrent.CompletionStage<U>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenComposeAsync(java.util.function.Function<? super T,? extends java.util.concurrent.CompletionStage<U>>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenRun(java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenRunAsync(java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenRunAsync(java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.toCompletableFuture()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.whenComplete(java.util.function.BiConsumer<? super T,? super java.lang.Throwable>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.whenCompleteAsync(java.util.function.BiConsumer<? super T,? super java.lang.Throwable>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.whenCompleteAsync(java.util.function.BiConsumer<? super T,? super java.lang.Throwable>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.AsyncRpcResult.getInvocation()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.AsyncRpcResult.getStoredContext()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.AsyncRpcResult.getStoredServerContext()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.AsyncRpcResult.subscribeTo(java.util.concurrent.CompletableFuture<? extends java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Result.completionFuture()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Result.getNow(org.apache.dubbo.rpc.Result)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `java.util.concurrent.CompletableFuture.get()`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.AsyncRpcResult.get()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `java.util.concurrent.CompletableFuture.get(long,java.util.concurrent.TimeUnit)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.AsyncRpcResult.get(long,java.util.concurrent.TimeUnit)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `java.util.concurrent.CompletableFuture.get()`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.AsyncRpcResult.get()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `java.util.concurrent.CompletableFuture.get(long,java.util.concurrent.TimeUnit)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.AsyncRpcResult.get(long,java.util.concurrent.TimeUnit)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.rpc.AsyncRpcResult`

## org.apache.dubbo.rpc.Constants

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.Constants.$INVOKE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.Constants.$INVOKE_ASYNC`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.Constants.CALLBACK_INSTANCES_LIMIT_KEY`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.Constants.DEFAULT_CALLBACK_INSTANCES`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.Constants.EXPORTER_LISTENER_KEY`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.Constants.GENERIC_SERIALIZATION_BEAN`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.Constants.GENERIC_SERIALIZATION_DEFAULT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.Constants.GENERIC_SERIALIZATION_NATIVE_JAVA`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.Constants.GENERIC_SERIALIZATION_PROTOBUF`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.Constants.INVOKER_LISTENER_KEY`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.Constants.LAZY_CONNECT_KEY`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.Constants.REFERENCE_FILTER_KEY`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.Constants.SERVICE_FILTER_KEY`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.Constants.STUB_EVENT_KEY`

## org.apache.dubbo.rpc.Filter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

## org.apache.dubbo.rpc.Invocation

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.rpc.Invocation`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.Invocation.setObjectAttachmentIfAbsent(java.lang.String,java.lang.Object)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.rpc.Invocation`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.Invocation.put(java.lang.Object,java.lang.Object)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.rpc.Invocation`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.Invocation.getObjectAttachment(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.rpc.Invocation`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.Invocation.setAttachment(java.lang.String,java.lang.Object)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.rpc.Invocation`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.Invocation.getAttributes()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.rpc.Invocation`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.Invocation.getTargetServiceUniqueName()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.rpc.Invocation`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.Invocation.getObjectAttachments()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.rpc.Invocation`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.Invocation.get(java.lang.Object)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.rpc.Invocation`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.Invocation.setObjectAttachment(java.lang.String,java.lang.Object)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.rpc.Invocation`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.Invocation.getProtocolServiceKey()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.rpc.Invocation`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.Invocation.getServiceName()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.rpc.Invocation`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.Invocation.getObjectAttachment(java.lang.String,java.lang.Object)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.rpc.Invocation`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.Invocation.setAttachmentIfAbsent(java.lang.String,java.lang.Object)`

## org.apache.dubbo.rpc.ListenableFilter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

## org.apache.dubbo.rpc.Result

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `java.util.concurrent.CompletionStage.thenApply(java.util.function.Function<? super T,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.acceptEither(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.acceptEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.acceptEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Consumer<? super T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.applyToEither(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Function<? super T,U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.applyToEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Function<? super T,U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.applyToEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Function<? super T,U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.exceptionally(java.util.function.Function<java.lang.Throwable,? extends T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.exceptionallyAsync(java.util.function.Function<java.lang.Throwable,? extends T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.exceptionallyAsync(java.util.function.Function<java.lang.Throwable,? extends T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.exceptionallyCompose(java.util.function.Function<java.lang.Throwable,? extends java.util.concurrent.CompletionStage<T>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.exceptionallyComposeAsync(java.util.function.Function<java.lang.Throwable,? extends java.util.concurrent.CompletionStage<T>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.exceptionallyComposeAsync(java.util.function.Function<java.lang.Throwable,? extends java.util.concurrent.CompletionStage<T>>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.handle(java.util.function.BiFunction<? super T,java.lang.Throwable,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.handleAsync(java.util.function.BiFunction<? super T,java.lang.Throwable,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.handleAsync(java.util.function.BiFunction<? super T,java.lang.Throwable,? extends U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.runAfterBoth(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.runAfterBothAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.runAfterBothAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.runAfterEither(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.runAfterEitherAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.runAfterEitherAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenAccept(java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenAcceptAsync(java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenAcceptAsync(java.util.function.Consumer<? super T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenAcceptBoth(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiConsumer<? super T,? super U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenAcceptBothAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiConsumer<? super T,? super U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenAcceptBothAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiConsumer<? super T,? super U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenApplyAsync(java.util.function.Function<? super T,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenApplyAsync(java.util.function.Function<? super T,? extends U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenCombine(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiFunction<? super T,? super U,? extends V>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenCombineAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiFunction<? super T,? super U,? extends V>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenCombineAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiFunction<? super T,? super U,? extends V>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenCompose(java.util.function.Function<? super T,? extends java.util.concurrent.CompletionStage<U>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenComposeAsync(java.util.function.Function<? super T,? extends java.util.concurrent.CompletionStage<U>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenComposeAsync(java.util.function.Function<? super T,? extends java.util.concurrent.CompletionStage<U>>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenRun(java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenRunAsync(java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.thenRunAsync(java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.toCompletableFuture()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.whenComplete(java.util.function.BiConsumer<? super T,? super java.lang.Throwable>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.whenCompleteAsync(java.util.function.BiConsumer<? super T,? super java.lang.Throwable>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletionStage.whenCompleteAsync(java.util.function.BiConsumer<? super T,? super java.lang.Throwable>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.Future.cancel(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.Future.exceptionNow()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.Future.isCancelled()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.Future.isDone()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.Future.resultNow()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.Future.state()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Result.completionFuture()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Result.getNow(org.apache.dubbo.rpc.Result)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `java.util.concurrent.CompletionStage.thenApply(java.util.function.Function<? super T,? extends U>)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.Result.thenApply(java.util.function.Function<org.apache.dubbo.rpc.Result,? extends U>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `java.util.concurrent.Future.get()`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.Result.get()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `java.util.concurrent.Future.get(long,java.util.concurrent.TimeUnit)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.Result.get(long,java.util.concurrent.TimeUnit)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `java.util.concurrent.CompletionStage.thenApply(java.util.function.Function<? super T,? extends U>)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.Result.thenApply(java.util.function.Function<org.apache.dubbo.rpc.Result,? extends U>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `java.util.concurrent.Future.get()`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.Result.get()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `java.util.concurrent.Future.get(long,java.util.concurrent.TimeUnit)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.Result.get(long,java.util.concurrent.TimeUnit)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.rpc.Result`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.Result.setObjectAttachments(java.util.Map<java.lang.String,java.lang.Object>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.rpc.Result`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.Result.addObjectAttachments(java.util.Map<java.lang.String,java.lang.Object>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.rpc.Result`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.Result.getObjectAttachments()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.rpc.Result`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.Result.getObjectAttachment(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.rpc.Result`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.Result.setObjectAttachment(java.lang.String,java.lang.Object)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.rpc.Result`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.Result.setAttachment(java.lang.String,java.lang.Object)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.rpc.Result`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.Result.getObjectAttachment(java.lang.String,java.lang.Object)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.rpc.Result`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.rpc.Result`

## org.apache.dubbo.rpc.RpcConstants

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.constants.CommonConstants.GROUP_CHAR_SEPERATOR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.constants.CommonConstants.HIDE_KEY_PREFIX`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.constants.CommonConstants.PROPERTIES_CHAR_SEPERATOR`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.constants.QosConstants.ACCEPT_FOREIGN_IP_COMPATIBLE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.constants.QosConstants.QOS_ENABLE_COMPATIBLE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.common.constants.QosConstants.QOS_PORT_COMPATIBLE`

## org.apache.dubbo.rpc.RpcException

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.RpcException.isForbidded()`

## org.apache.dubbo.rpc.RpcInvocation

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.rpc.RpcInvocation.<init>(java.lang.String,java.lang.Class[],java.lang.Object[])`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.rpc.RpcInvocation.<init>(java.lang.String,java.lang.Class[],java.lang.Object[],java.util.Map<java.lang.String,java.lang.String>)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.rpc.RpcInvocation.<init>(java.lang.String,java.lang.Class[],java.lang.Object[],java.util.Map<java.lang.String,java.lang.String>,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.rpc.RpcInvocation.<init>(java.lang.reflect.Method,java.lang.Object[])`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.rpc.RpcInvocation.<init>(java.lang.reflect.Method,java.lang.Object[],java.util.Map<java.lang.String,java.lang.String>)`

## org.apache.dubbo.rpc.cluster.Constants

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.cluster.Constants.DEFAULT_FAILBACK_TIMES`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.cluster.Constants.DEFAULT_LOADBALANCE`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.cluster.Constants.DEFAULT_RETRIES`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.cluster.Constants.FORKS_KEY`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.cluster.Constants.LOADBALANCE_KEY`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.cluster.Constants.REMOTE_TIMESTAMP_KEY`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.cluster.Constants.RETRIES_KEY`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.cluster.Constants.TAG_KEY`

## org.apache.dubbo.rpc.cluster.Directory

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.rpc.cluster.Directory`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.cluster.Directory.getAllInvokers()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.rpc.cluster.Directory`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.cluster.Directory.isDestroyed()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.rpc.cluster.Directory`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.cluster.Directory.discordAddresses()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.rpc.cluster.Directory`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.cluster.Directory.getConsumerUrl()`

## org.apache.dubbo.rpc.cluster.configurator.parser.ConfigParser

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.dubbo.rpc.cluster.configurator.parser.ConfigParser.parseConfigurators(java.lang.String)`
+ NOW THROWS: `org.apache.dubbo.rpc.cluster.configurator.parser.ConfigParser.parseConfigurators(java.lang.String)`

## org.apache.dubbo.rpc.cluster.directory.AbstractDirectory

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.rpc.cluster.directory.AbstractDirectory.<init>(org.apache.dubbo.common.URL,org.apache.dubbo.common.URL,org.apache.dubbo.rpc.cluster.RouterChain<T>)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.rpc.cluster.directory.AbstractDirectory.<init>(org.apache.dubbo.common.URL,org.apache.dubbo.rpc.cluster.RouterChain<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.apache.dubbo.rpc.cluster.directory.AbstractDirectory`
+ MUST NOW IMPLEMENT: `org.apache.dubbo.rpc.cluster.Directory.getAllInvokers()`

## org.apache.dubbo.rpc.cluster.loadbalance.AbstractLoadBalance

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.cluster.loadbalance.AbstractLoadBalance.getWeight(org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

## org.apache.dubbo.rpc.cluster.loadbalance.ConsistentHashLoadBalance

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.cluster.loadbalance.AbstractLoadBalance.getWeight(org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

## org.apache.dubbo.rpc.cluster.loadbalance.LeastActiveLoadBalance

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.cluster.loadbalance.AbstractLoadBalance.getWeight(org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

## org.apache.dubbo.rpc.cluster.loadbalance.RandomLoadBalance

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.cluster.loadbalance.AbstractLoadBalance.getWeight(org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

## org.apache.dubbo.rpc.cluster.loadbalance.RoundRobinLoadBalance

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.cluster.loadbalance.AbstractLoadBalance.getWeight(org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

## org.apache.dubbo.rpc.cluster.router.AbstractRouter

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.rpc.cluster.router.AbstractRouter.<init>(org.apache.dubbo.configcenter.DynamicConfiguration,org.apache.dubbo.common.URL)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.cluster.router.AbstractRouter.configuration`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.cluster.router.AbstractRouter.setConfiguration(org.apache.dubbo.configcenter.DynamicConfiguration)`

## org.apache.dubbo.rpc.cluster.router.condition.ConditionRouter

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.cluster.router.AbstractRouter.configuration`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.cluster.router.AbstractRouter.setConfiguration(org.apache.dubbo.configcenter.DynamicConfiguration)`

## org.apache.dubbo.rpc.cluster.router.condition.config.AppRouter

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.rpc.cluster.router.condition.config.AppRouter.<init>(org.apache.dubbo.configcenter.DynamicConfiguration,org.apache.dubbo.common.URL)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.cluster.router.AbstractRouter.configuration`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.cluster.router.AbstractRouter.setConfiguration(org.apache.dubbo.configcenter.DynamicConfiguration)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.cluster.router.condition.config.ListenableRouter.process(org.apache.dubbo.configcenter.ConfigChangeEvent)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.rpc.cluster.router.condition.config.AppRouter`

## org.apache.dubbo.rpc.cluster.router.condition.config.ListenableRouter

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.rpc.cluster.router.condition.config.ListenableRouter.<init>(org.apache.dubbo.configcenter.DynamicConfiguration,org.apache.dubbo.common.URL,java.lang.String)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.cluster.router.AbstractRouter.configuration`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.cluster.router.AbstractRouter.setConfiguration(org.apache.dubbo.configcenter.DynamicConfiguration)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.cluster.router.condition.config.ListenableRouter.process(org.apache.dubbo.configcenter.ConfigChangeEvent)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.rpc.cluster.router.condition.config.ListenableRouter`

## org.apache.dubbo.rpc.cluster.router.condition.config.ServiceRouter

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.rpc.cluster.router.condition.config.ServiceRouter.<init>(org.apache.dubbo.configcenter.DynamicConfiguration,org.apache.dubbo.common.URL)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.cluster.router.AbstractRouter.configuration`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.cluster.router.AbstractRouter.setConfiguration(org.apache.dubbo.configcenter.DynamicConfiguration)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.cluster.router.condition.config.ListenableRouter.process(org.apache.dubbo.configcenter.ConfigChangeEvent)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.rpc.cluster.router.condition.config.ServiceRouter`

## org.apache.dubbo.rpc.cluster.router.condition.config.model.ConditionRuleParser

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.dubbo.rpc.cluster.router.condition.config.model.ConditionRuleParser.parse(java.lang.String)`
+ NOW THROWS: `org.apache.dubbo.rpc.cluster.router.condition.config.model.ConditionRuleParser.parse(java.lang.String)`

## org.apache.dubbo.rpc.cluster.router.mock.MockInvokersSelector

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.cluster.router.AbstractRouter.configuration`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.cluster.router.AbstractRouter.setConfiguration(org.apache.dubbo.configcenter.DynamicConfiguration)`

## org.apache.dubbo.rpc.cluster.router.script.ScriptRouter

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.cluster.router.AbstractRouter.configuration`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.cluster.router.AbstractRouter.setConfiguration(org.apache.dubbo.configcenter.DynamicConfiguration)`

## org.apache.dubbo.rpc.cluster.router.tag.TagRouter

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.rpc.cluster.router.tag.TagRouter.<init>(org.apache.dubbo.configcenter.DynamicConfiguration,org.apache.dubbo.common.URL)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.cluster.router.AbstractRouter.configuration`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.cluster.router.AbstractRouter.setConfiguration(org.apache.dubbo.configcenter.DynamicConfiguration)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.cluster.router.tag.TagRouter.process(org.apache.dubbo.configcenter.ConfigChangeEvent)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.rpc.cluster.router.tag.TagRouter`

## org.apache.dubbo.rpc.cluster.router.tag.model.TagRuleParser

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.apache.dubbo.rpc.cluster.router.tag.model.TagRuleParser.parse(java.lang.String)`
+ NOW THROWS: `org.apache.dubbo.rpc.cluster.router.tag.model.TagRuleParser.parse(java.lang.String)`

## org.apache.dubbo.rpc.cluster.support.RegistryAwareCluster

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.rpc.cluster.support.RegistryAwareCluster`

## org.apache.dubbo.rpc.cluster.support.RegistryAwareClusterInvoker

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.rpc.cluster.support.RegistryAwareClusterInvoker`

## org.apache.dubbo.rpc.filter.AccessLogFilter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

## org.apache.dubbo.rpc.filter.ActiveLimitFilter

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.ListenableFilter.listener`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.ListenableFilter.listener()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.filter.ActiveLimitFilter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.filter.ActiveLimitFilter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.rpc.filter.ActiveLimitFilter`

## org.apache.dubbo.rpc.filter.ClassLoaderFilter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

## org.apache.dubbo.rpc.filter.CompatibleFilter

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.ListenableFilter.listener`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.ListenableFilter.listener()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.filter.CompatibleFilter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.filter.CompatibleFilter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.rpc.filter.CompatibleFilter`

## org.apache.dubbo.rpc.filter.ConsumerContextFilter

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.ListenableFilter.listener`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.ListenableFilter.listener()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.rpc.filter.ConsumerContextFilter`

## org.apache.dubbo.rpc.filter.ContextFilter

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.ListenableFilter.listener`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.ListenableFilter.listener()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.filter.ContextFilter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.filter.ContextFilter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.rpc.filter.ContextFilter`

## org.apache.dubbo.rpc.filter.DeprecatedFilter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

## org.apache.dubbo.rpc.filter.EchoFilter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

## org.apache.dubbo.rpc.filter.ExceptionFilter

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.ListenableFilter.listener`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.ListenableFilter.listener()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.filter.ExceptionFilter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.filter.ExceptionFilter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.rpc.filter.ExceptionFilter`

## org.apache.dubbo.rpc.filter.ExecuteLimitFilter

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.ListenableFilter.listener`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.ListenableFilter.listener()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.filter.ExecuteLimitFilter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.filter.ExecuteLimitFilter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.rpc.filter.ExecuteLimitFilter`

## org.apache.dubbo.rpc.filter.GenericFilter

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.ListenableFilter.listener`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.ListenableFilter.listener()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.filter.GenericFilter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.filter.GenericFilter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.rpc.filter.GenericFilter`

## org.apache.dubbo.rpc.filter.GenericImplFilter

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.ListenableFilter.listener`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.ListenableFilter.listener()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.filter.GenericImplFilter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.filter.GenericImplFilter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.rpc.filter.GenericImplFilter`

## org.apache.dubbo.rpc.filter.TimeoutFilter

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.ListenableFilter.listener`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.ListenableFilter.listener()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.filter.TimeoutFilter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.filter.TimeoutFilter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.rpc.filter.TimeoutFilter`

## org.apache.dubbo.rpc.filter.TokenFilter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

## org.apache.dubbo.rpc.filter.TpsLimitFilter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

## org.apache.dubbo.rpc.model.ApplicationModel

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.model.ApplicationModel.initConsumerModel(java.lang.String,org.apache.dubbo.rpc.model.ConsumerModel)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.model.ApplicationModel.initProviderModel(java.lang.String,org.apache.dubbo.rpc.model.ProviderModel)`

## org.apache.dubbo.rpc.model.ConsumerMethodModel

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.rpc.model.ConsumerMethodModel.<init>(java.lang.reflect.Method,java.util.Map<java.lang.String,java.lang.Object>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.model.ConsumerMethodModel.getAsyncInfo()`

## org.apache.dubbo.rpc.model.ConsumerMethodModel$AsyncMethodInfo

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.rpc.model.ConsumerMethodModel$AsyncMethodInfo`

## org.apache.dubbo.rpc.model.ConsumerModel

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.rpc.model.ConsumerModel.<init>(java.lang.String,java.lang.Class<? extends java.lang.Object>,java.lang.Object,java.lang.reflect.Method[],java.util.Map<java.lang.String,java.lang.Object>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.model.ConsumerModel.getAllMethods()`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.model.ConsumerModel.getAllMethods()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.model.ConsumerModel.getAllMethods()`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.model.ConsumerModel.getAllMethods()`

## org.apache.dubbo.rpc.model.ProviderMethodModel

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.rpc.model.ProviderMethodModel.<init>(java.lang.reflect.Method,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.model.ProviderMethodModel.getServiceName()`

## org.apache.dubbo.rpc.model.ProviderModel

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.rpc.model.ProviderModel.<init>(java.lang.String,java.lang.Object,java.lang.Class<? extends java.lang.Object>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.model.ProviderModel.getAllMethods()`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.model.ProviderModel.getAllMethods()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.model.ProviderModel.getAllMethods()`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.model.ProviderModel.getAllMethods()`

## org.apache.dubbo.rpc.protocol.AbstractExporter

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.dubbo.rpc.protocol.AbstractExporter.unexport()`

## org.apache.dubbo.rpc.protocol.AbstractInvoker

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.apache.dubbo.rpc.protocol.AbstractInvoker.<init>(java.lang.Class<T>,org.apache.dubbo.common.URL,java.util.Map<java.lang.String,java.lang.String>)`

## org.apache.dubbo.rpc.protocol.AbstractProtocol

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

## org.apache.dubbo.rpc.protocol.AbstractProxyProtocol

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

## org.apache.dubbo.rpc.protocol.dubbo.DecodeableRpcResult

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `java.util.concurrent.CompletableFuture.thenApply(java.util.function.Function<? super T,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.acceptEither(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.acceptEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.acceptEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Consumer<? super T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.allOf(java.util.concurrent.CompletableFuture<? extends java.lang.Object>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.anyOf(java.util.concurrent.CompletableFuture<? extends java.lang.Object>[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.applyToEither(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Function<? super T,U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.applyToEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Function<? super T,U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.applyToEitherAsync(java.util.concurrent.CompletionStage<? extends T>,java.util.function.Function<? super T,U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.cancel(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.complete(T)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completeAsync(java.util.function.Supplier<? extends T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completeAsync(java.util.function.Supplier<? extends T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completeExceptionally(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completeOnTimeout(T,long,java.util.concurrent.TimeUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completedFuture(U)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.completedStage(U)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.copy()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.defaultExecutor()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.delayedExecutor(long,java.util.concurrent.TimeUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.delayedExecutor(long,java.util.concurrent.TimeUnit,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionNow()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionally(java.util.function.Function<java.lang.Throwable,? extends T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionallyAsync(java.util.function.Function<java.lang.Throwable,? extends T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionallyAsync(java.util.function.Function<java.lang.Throwable,? extends T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionallyCompose(java.util.function.Function<java.lang.Throwable,? extends java.util.concurrent.CompletionStage<T>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionallyComposeAsync(java.util.function.Function<java.lang.Throwable,? extends java.util.concurrent.CompletionStage<T>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.exceptionallyComposeAsync(java.util.function.Function<java.lang.Throwable,? extends java.util.concurrent.CompletionStage<T>>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.failedFuture(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.failedStage(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.getNow(T)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.getNumberOfDependents()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.handle(java.util.function.BiFunction<? super T,java.lang.Throwable,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.handleAsync(java.util.function.BiFunction<? super T,java.lang.Throwable,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.handleAsync(java.util.function.BiFunction<? super T,java.lang.Throwable,? extends U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.isCancelled()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.isCompletedExceptionally()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.isDone()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.join()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.minimalCompletionStage()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.newIncompleteFuture()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.obtrudeException(java.lang.Throwable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.obtrudeValue(T)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.orTimeout(long,java.util.concurrent.TimeUnit)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.resultNow()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterBoth(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterBothAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterBothAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterEither(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterEitherAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAfterEitherAsync(java.util.concurrent.CompletionStage<? extends java.lang.Object>,java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAsync(java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.runAsync(java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.state()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.supplyAsync(java.util.function.Supplier<U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.supplyAsync(java.util.function.Supplier<U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAccept(java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAcceptAsync(java.util.function.Consumer<? super T>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAcceptAsync(java.util.function.Consumer<? super T>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAcceptBoth(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiConsumer<? super T,? super U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAcceptBothAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiConsumer<? super T,? super U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenAcceptBothAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiConsumer<? super T,? super U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenApplyAsync(java.util.function.Function<? super T,? extends U>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenApplyAsync(java.util.function.Function<? super T,? extends U>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenCombine(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiFunction<? super T,? super U,? extends V>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenCombineAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiFunction<? super T,? super U,? extends V>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenCombineAsync(java.util.concurrent.CompletionStage<? extends U>,java.util.function.BiFunction<? super T,? super U,? extends V>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenCompose(java.util.function.Function<? super T,? extends java.util.concurrent.CompletionStage<U>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenComposeAsync(java.util.function.Function<? super T,? extends java.util.concurrent.CompletionStage<U>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenComposeAsync(java.util.function.Function<? super T,? extends java.util.concurrent.CompletionStage<U>>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenRun(java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenRunAsync(java.lang.Runnable)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.thenRunAsync(java.lang.Runnable,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.toCompletableFuture()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.whenComplete(java.util.function.BiConsumer<? super T,? super java.lang.Throwable>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.whenCompleteAsync(java.util.function.BiConsumer<? super T,? super java.lang.Throwable>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `java.util.concurrent.CompletableFuture.whenCompleteAsync(java.util.function.BiConsumer<? super T,? super java.lang.Throwable>,java.util.concurrent.Executor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Result.completionFuture()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Result.getNow(org.apache.dubbo.rpc.Result)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `java.util.concurrent.CompletableFuture.get()`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.AppResponse.get()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `java.util.concurrent.CompletableFuture.get(long,java.util.concurrent.TimeUnit)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.AppResponse.get(long,java.util.concurrent.TimeUnit)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `java.util.concurrent.CompletableFuture.get()`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.AppResponse.get()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `java.util.concurrent.CompletableFuture.get(long,java.util.concurrent.TimeUnit)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.AppResponse.get(long,java.util.concurrent.TimeUnit)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.rpc.protocol.dubbo.DecodeableRpcResult`

## org.apache.dubbo.rpc.protocol.dubbo.DubboCodec

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.exchange.codec.ExchangeCodec.decodeEventData(org.apache.dubbo.remoting.Channel,org.apache.dubbo.common.serialize.ObjectInput)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.exchange.codec.ExchangeCodec.decodeHeartbeatData(org.apache.dubbo.common.serialize.ObjectInput)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.remoting.exchange.codec.ExchangeCodec.decodeHeartbeatData(org.apache.dubbo.remoting.Channel,org.apache.dubbo.common.serialize.ObjectInput)`

## org.apache.dubbo.rpc.protocol.dubbo.DubboExporter

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.apache.dubbo.rpc.protocol.dubbo.DubboExporter.<init>(org.apache.dubbo.rpc.Invoker<T>,java.lang.String,java.util.Map<java.lang.String,org.apache.dubbo.rpc.Exporter<? extends java.lang.Object>>)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `org.apache.dubbo.rpc.protocol.dubbo.DubboExporter.unexport()`

## org.apache.dubbo.rpc.protocol.dubbo.DubboProtocol

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.protocol.dubbo.DubboProtocol.getServers()`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.protocol.AbstractProtocol.getServers()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.protocol.dubbo.DubboProtocol.getServers()`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.protocol.AbstractProtocol.getServers()`

## org.apache.dubbo.rpc.protocol.dubbo.FutureAdapter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.protocol.dubbo.FutureAdapter.getAppResponseFuture()`

## org.apache.dubbo.rpc.protocol.dubbo.filter.FutureFilter

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.ListenableFilter.listener`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.ListenableFilter.listener()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.protocol.dubbo.filter.FutureFilter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.protocol.dubbo.filter.FutureFilter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.apache.dubbo.rpc.protocol.dubbo.filter.FutureFilter`

## org.apache.dubbo.rpc.protocol.dubbo.filter.TraceFilter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

## org.apache.dubbo.rpc.protocol.dubbo.telnet.ChangeTelnetHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.rpc.protocol.dubbo.telnet.ChangeTelnetHandler`

## org.apache.dubbo.rpc.protocol.dubbo.telnet.CountTelnetHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.rpc.protocol.dubbo.telnet.CountTelnetHandler`

## org.apache.dubbo.rpc.protocol.dubbo.telnet.CurrentTelnetHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.rpc.protocol.dubbo.telnet.CurrentTelnetHandler`

## org.apache.dubbo.rpc.protocol.dubbo.telnet.InvokeTelnetHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.rpc.protocol.dubbo.telnet.InvokeTelnetHandler`

## org.apache.dubbo.rpc.protocol.dubbo.telnet.ListTelnetHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.rpc.protocol.dubbo.telnet.ListTelnetHandler`

## org.apache.dubbo.rpc.protocol.dubbo.telnet.LogTelnetHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.rpc.protocol.dubbo.telnet.LogTelnetHandler`

## org.apache.dubbo.rpc.protocol.dubbo.telnet.PortTelnetHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.rpc.protocol.dubbo.telnet.PortTelnetHandler`

## org.apache.dubbo.rpc.protocol.dubbo.telnet.SelectTelnetHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.rpc.protocol.dubbo.telnet.SelectTelnetHandler`

## org.apache.dubbo.rpc.protocol.dubbo.telnet.ShutdownTelnetHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.rpc.protocol.dubbo.telnet.ShutdownTelnetHandler`

## org.apache.dubbo.rpc.protocol.dubbo.telnet.TraceTelnetHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.rpc.protocol.dubbo.telnet.TraceTelnetHandler`

## org.apache.dubbo.rpc.protocol.hessian.HessianProtocol

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

## org.apache.dubbo.rpc.protocol.http.HttpProtocol

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.rpc.protocol.http.HttpProtocol.DEFAULT_PORT`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

## org.apache.dubbo.rpc.protocol.http.HttpRemoteInvocation

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.rpc.protocol.http.HttpRemoteInvocation`

## org.apache.dubbo.rpc.protocol.injvm.InjvmProtocol

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

## org.apache.dubbo.rpc.protocol.jsonrpc.JsonRpcProtocol

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.rpc.protocol.jsonrpc.JsonRpcProtocol`

## org.apache.dubbo.rpc.protocol.memcached.MemcachedProtocol

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

## org.apache.dubbo.rpc.protocol.nativethrift.ThriftProtocol

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

## org.apache.dubbo.rpc.protocol.redis.RedisProtocol

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

## org.apache.dubbo.rpc.protocol.rest.BaseRestServer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.rpc.protocol.rest.BaseRestServer`

## org.apache.dubbo.rpc.protocol.rest.DubboHttpServer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.rpc.protocol.rest.DubboHttpServer`

## org.apache.dubbo.rpc.protocol.rest.NettyServer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.rpc.protocol.rest.NettyServer`

## org.apache.dubbo.rpc.protocol.rest.RestProtocol

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

## org.apache.dubbo.rpc.protocol.rest.RestServer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.rpc.protocol.rest.RestServer`

## org.apache.dubbo.rpc.protocol.rest.RestServerFactory

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.apache.dubbo.rpc.protocol.rest.RestServerFactory.createServer(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.protocol.rest.RestServerFactory.createServer(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.apache.dubbo.rpc.protocol.rest.RestServerFactory.createServer(java.lang.String)`
+ NEW RETURN TYPE: `org.apache.dubbo.rpc.protocol.rest.RestServerFactory.createServer(java.lang.String)`

## org.apache.dubbo.rpc.protocol.rmi.RmiProtocol

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

## org.apache.dubbo.rpc.protocol.thrift.ThriftProtocol

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

## org.apache.dubbo.rpc.protocol.webservice.WebServiceProtocol

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

## org.apache.dubbo.serialize.hessian.Hessian2SerializerFactory

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.apache.dubbo.serialize.hessian.Hessian2SerializerFactory.INSTANCE`

## org.apache.dubbo.serialize.hessian.Java8SerializerFactory

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.apache.dubbo.serialize.hessian.Java8SerializerFactory`

## org.apache.dubbo.validation.filter.ValidationFilter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.apache.dubbo.rpc.Filter.onResponse(org.apache.dubbo.rpc.Result,org.apache.dubbo.rpc.Invoker<? extends java.lang.Object>,org.apache.dubbo.rpc.Invocation)`

## org.apache.dubbo.xml.rpc.protocol.xmlrpc.XmlRpcProtocol

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`
+ NEW FIELD: `org.apache.dubbo.rpc.protocol.AbstractProtocol.exporterMap`

