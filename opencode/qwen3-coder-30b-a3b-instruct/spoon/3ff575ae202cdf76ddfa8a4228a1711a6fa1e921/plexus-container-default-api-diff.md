# Breaking Changes: org.codehaus.plexus:plexus-container-default 1.0-alpha-30 → 2.1.1
Total: 515 (binary-breaking: 315, source-breaking: 513)

## org.codehaus.plexus.ComponentLookupManager

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.ComponentLookupManager`

## org.codehaus.plexus.ContainerConfiguration

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.ContainerConfiguration.setContext(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.ContainerConfiguration.getParentContainer()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.ContainerConfiguration.setParentContainer(org.codehaus.plexus.PlexusContainer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.ContainerConfiguration.getContext()`
+ NEW RETURN TYPE: `org.codehaus.plexus.ContainerConfiguration.getContext()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.ContainerConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.ContainerConfiguration.addComponentDiscoveryListener(org.codehaus.plexus.component.discovery.ComponentDiscoveryListener)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.ContainerConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.ContainerConfiguration.addComponentDiscoveryListener(java.lang.Class<? extends java.lang.Object>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.ContainerConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.ContainerConfiguration.setContainerConfigurationURL(java.net.URL)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.ContainerConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.ContainerConfiguration.getComponentFactoryManager()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.ContainerConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.ContainerConfiguration.getContainerConfigurationURL()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.ContainerConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.ContainerConfiguration.getComponentDiscovererManager()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.ContainerConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.ContainerConfiguration.getComponentDiscoverers()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.ContainerConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.ContainerConfiguration.setComponentDiscovererManager(org.codehaus.plexus.component.discovery.ComponentDiscovererManager)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.ContainerConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.ContainerConfiguration.addLifecycleHandler(org.codehaus.plexus.lifecycle.LifecycleHandler)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.ContainerConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.ContainerConfiguration.getComponentRepository()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.ContainerConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.ContainerConfiguration.setConfigurationSource(org.codehaus.plexus.configuration.source.ConfigurationSource)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.ContainerConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.ContainerConfiguration.setComponentRepository(org.codehaus.plexus.component.repository.ComponentRepository)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.ContainerConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.ContainerConfiguration.addComponentDiscoverer(java.lang.Class<? extends java.lang.Object>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.ContainerConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.ContainerConfiguration.setComponentFactoryManager(org.codehaus.plexus.component.factory.ComponentFactoryManager)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.ContainerConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.ContainerConfiguration.getConfigurationSource()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.ContainerConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.ContainerConfiguration.setLifecycleHandlerManager(org.codehaus.plexus.lifecycle.LifecycleHandlerManager)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.ContainerConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.ContainerConfiguration.getInitializationPhases()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.ContainerConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.ContainerConfiguration.getComponentDiscoveryListeners()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.ContainerConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.ContainerConfiguration.addComponentDiscoverer(org.codehaus.plexus.component.discovery.ComponentDiscoverer)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.ContainerConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.ContainerConfiguration.getLifecycleHandlerManager()`

## org.codehaus.plexus.DefaultComponentLookupManager

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.DefaultComponentLookupManager`

## org.codehaus.plexus.DefaultContainerConfiguration

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.DefaultContainerConfiguration.setContext(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultContainerConfiguration.getParentContainer()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultContainerConfiguration.setParentContainer(org.codehaus.plexus.PlexusContainer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.DefaultContainerConfiguration.getContext()`
+ NEW RETURN TYPE: `org.codehaus.plexus.DefaultContainerConfiguration.getContext()`

## org.codehaus.plexus.DefaultPlexusContainer

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.codehaus.plexus.DefaultPlexusContainer.<init>(java.lang.String,java.util.Map,org.codehaus.plexus.PlexusContainer,java.util.List)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.codehaus.plexus.DefaultPlexusContainer.childContainers`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.codehaus.plexus.DefaultPlexusContainer.componentComposerManager`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.codehaus.plexus.DefaultPlexusContainer.componentLookupManager`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.codehaus.plexus.DefaultPlexusContainer.componentManagerManager`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.codehaus.plexus.DefaultPlexusContainer.componentRepository`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.codehaus.plexus.DefaultPlexusContainer.creationDate`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.codehaus.plexus.DefaultPlexusContainer.initializationPhases`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.codehaus.plexus.DefaultPlexusContainer.lifecycleHandlerManager`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.codehaus.plexus.DefaultPlexusContainer.name`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.codehaus.plexus.DefaultPlexusContainer.parentContainer`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.codehaus.plexus.DefaultPlexusContainer.reloadingEnabled`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.codehaus.plexus.DefaultPlexusContainer.containerContext`
+ NEW FIELD: `org.codehaus.plexus.DefaultPlexusContainer.containerContext`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.codehaus.plexus.DefaultPlexusContainer.containerContext`
+ NEW FIELD: `org.codehaus.plexus.DefaultPlexusContainer.containerContext`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.codehaus.plexus.DefaultPlexusContainer.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor)`
+ NOW THROWS: `org.codehaus.plexus.DefaultPlexusContainer.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor<? extends java.lang.Object>)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.codehaus.plexus.DefaultPlexusContainer.discoverComponents(org.codehaus.plexus.classworlds.realm.ClassRealm)`
+ NOW THROWS: `org.codehaus.plexus.DefaultPlexusContainer.discoverComponents(org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.codehaus.plexus.DefaultPlexusContainer.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.codehaus.plexus.DefaultPlexusContainer.discoverComponents(org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.DefaultPlexusContainer.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.DefaultPlexusContainer.lookup(java.lang.Class)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.DefaultPlexusContainer.lookup(java.lang.Class,java.lang.String)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.DefaultPlexusContainer.lookupList(java.lang.Class)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.DefaultPlexusContainer.lookupMap(java.lang.Class)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.DefaultPlexusContainer.releaseAll(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.DefaultPlexusContainer.releaseAll(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.addJarRepository(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.addJarResource(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.autowire(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.createAndAutowire(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.createChildContainer(java.lang.String,java.lang.ClassLoader)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.createChildContainer(java.lang.String,java.util.List,java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.createChildContainer(java.lang.String,java.util.List,java.util.Map,java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.createComponentRealm(java.lang.String,java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.discoverComponents(org.codehaus.plexus.classworlds.realm.ClassRealm,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.disposeAllComponents()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.getChildContainer(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.getComponentComposerManager()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.getComponentDescriptor(java.lang.String,java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.getComponentDescriptor(java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.getComponentDescriptorList(java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.getComponentDescriptorMap(java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.getComponentLookupManager()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.getComponentManagerManager()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.getComponentRepository()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.getCreationDate()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.getLifecycleHandlerManager()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.getName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.getParentContainer()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.hasChildContainer(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.hasComponent(java.lang.String,java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.hasComponent(java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.initialize()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.initializeConfiguration()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.initializePhases()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.isReloadingEnabled()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.lookup(java.lang.Class,java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.lookup(java.lang.Class,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.lookup(java.lang.String,java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.lookup(java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.lookupList(java.lang.Class,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.lookupList(java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.lookupMap(java.lang.Class,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.lookupMap(java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.removeChildContainer(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.resume(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.setComponentComposerManager(org.codehaus.plexus.component.composition.ComponentComposerManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.setComponentLookupManager(org.codehaus.plexus.ComponentLookupManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.setComponentManagerManager(org.codehaus.plexus.component.manager.ComponentManagerManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.setComponentRepository(org.codehaus.plexus.component.repository.ComponentRepository)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.setLifecycleHandlerManager(org.codehaus.plexus.lifecycle.LifecycleHandlerManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.setName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.setParentPlexusContainer(org.codehaus.plexus.PlexusContainer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.setReloadingEnabled(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.DefaultPlexusContainer.suspend(java.lang.Object)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.DefaultPlexusContainer.discoverComponents(org.codehaus.plexus.classworlds.realm.ClassRealm)`
+ NEW RETURN TYPE: `org.codehaus.plexus.DefaultPlexusContainer.discoverComponents(org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.DefaultPlexusContainer.getComponentDescriptor(java.lang.String)`
+ NEW RETURN TYPE: `org.codehaus.plexus.DefaultPlexusContainer.getComponentDescriptor(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.DefaultPlexusContainer.getComponentDescriptor(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `org.codehaus.plexus.DefaultPlexusContainer.getComponentDescriptor(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.DefaultPlexusContainer.getComponentDescriptorList(java.lang.String)`
+ NEW RETURN TYPE: `org.codehaus.plexus.DefaultPlexusContainer.getComponentDescriptorList(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.DefaultPlexusContainer.getComponentDescriptorMap(java.lang.String)`
+ NEW RETURN TYPE: `org.codehaus.plexus.DefaultPlexusContainer.getComponentDescriptorMap(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.DefaultPlexusContainer.lookupList(java.lang.Class)`
+ NEW RETURN TYPE: `org.codehaus.plexus.DefaultPlexusContainer.lookupList(java.lang.Class<T>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.DefaultPlexusContainer.lookupList(java.lang.String)`
+ NEW RETURN TYPE: `org.codehaus.plexus.DefaultPlexusContainer.lookupList(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.DefaultPlexusContainer.lookupMap(java.lang.Class)`
+ NEW RETURN TYPE: `org.codehaus.plexus.DefaultPlexusContainer.lookupMap(java.lang.Class<T>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.DefaultPlexusContainer.lookupMap(java.lang.String)`
+ NEW RETURN TYPE: `org.codehaus.plexus.DefaultPlexusContainer.lookupMap(java.lang.String)`

## org.codehaus.plexus.MutableComponentLookupManager

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.MutableComponentLookupManager`

## org.codehaus.plexus.MutablePlexusContainer

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.codehaus.plexus.PlexusContainer.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor)`
+ NOW THROWS: `org.codehaus.plexus.PlexusContainer.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor<? extends java.lang.Object>)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.codehaus.plexus.PlexusContainer.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.PlexusContainer.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.PlexusContainer.lookup(java.lang.Class)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.PlexusContainer.lookup(java.lang.Class,java.lang.String)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.PlexusContainer.lookupList(java.lang.Class)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.PlexusContainer.lookupMap(java.lang.Class)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.PlexusContainer.releaseAll(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.PlexusContainer.releaseAll(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.MutablePlexusContainer.discoverComponents(org.codehaus.plexus.classworlds.realm.ClassRealm,boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.MutablePlexusContainer.getComponentComposerManager()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.MutablePlexusContainer.getComponentLookupManager()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.MutablePlexusContainer.getComponentManagerManager()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.MutablePlexusContainer.getComponentRepository()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.MutablePlexusContainer.getLifecycleHandlerManager()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.MutablePlexusContainer.getParentContainer()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.MutablePlexusContainer.lookup(java.lang.String,java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.MutablePlexusContainer.lookup(java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.MutablePlexusContainer.setComponentComposerManager(org.codehaus.plexus.component.composition.ComponentComposerManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.MutablePlexusContainer.setComponentLookupManager(org.codehaus.plexus.ComponentLookupManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.MutablePlexusContainer.setComponentManagerManager(org.codehaus.plexus.component.manager.ComponentManagerManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.MutablePlexusContainer.setComponentRepository(org.codehaus.plexus.component.repository.ComponentRepository)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.MutablePlexusContainer.setLifecycleHandlerManager(org.codehaus.plexus.lifecycle.LifecycleHandlerManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.addJarRepository(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.addJarResource(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.autowire(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.createAndAutowire(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.createChildContainer(java.lang.String,java.util.List,java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.createChildContainer(java.lang.String,java.util.List,java.util.Map,java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.createComponentRealm(java.lang.String,java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.getChildContainer(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.getComponentDescriptor(java.lang.String,java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.getComponentDescriptor(java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.getComponentDescriptorList(java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.getComponentDescriptorMap(java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.getCreationDate()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.getName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.hasChildContainer(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.isReloadingEnabled()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.lookup(java.lang.Class,java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.lookup(java.lang.Class,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.lookupList(java.lang.Class,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.lookupList(java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.lookupMap(java.lang.Class,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.lookupMap(java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.removeChildContainer(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.resume(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.setName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.setParentPlexusContainer(org.codehaus.plexus.PlexusContainer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.setReloadingEnabled(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.suspend(java.lang.Object)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.PlexusContainer.getComponentDescriptor(java.lang.String)`
+ NEW RETURN TYPE: `org.codehaus.plexus.PlexusContainer.getComponentDescriptor(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.PlexusContainer.getComponentDescriptor(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `org.codehaus.plexus.PlexusContainer.getComponentDescriptor(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.PlexusContainer.getComponentDescriptorList(java.lang.String)`
+ NEW RETURN TYPE: `org.codehaus.plexus.PlexusContainer.getComponentDescriptorList(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.PlexusContainer.getComponentDescriptorMap(java.lang.String)`
+ NEW RETURN TYPE: `org.codehaus.plexus.PlexusContainer.getComponentDescriptorMap(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.PlexusContainer.lookupList(java.lang.Class)`
+ NEW RETURN TYPE: `org.codehaus.plexus.PlexusContainer.lookupList(java.lang.Class<T>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.PlexusContainer.lookupList(java.lang.String)`
+ NEW RETURN TYPE: `org.codehaus.plexus.PlexusContainer.lookupList(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.PlexusContainer.lookupMap(java.lang.Class)`
+ NEW RETURN TYPE: `org.codehaus.plexus.PlexusContainer.lookupMap(java.lang.Class<T>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.PlexusContainer.lookupMap(java.lang.String)`
+ NEW RETURN TYPE: `org.codehaus.plexus.PlexusContainer.lookupMap(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.MutablePlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.getComponentDescriptorMap(java.lang.Class<T>,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.MutablePlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.MutablePlexusContainer.setConfigurationSource(org.codehaus.plexus.configuration.source.ConfigurationSource)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.MutablePlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.MutablePlexusContainer.setComponentRegistry(org.codehaus.plexus.ComponentRegistry)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.MutablePlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.lookupList(java.lang.String,java.util.List<java.lang.String>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.MutablePlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.lookupMap(java.lang.String,java.util.List<java.lang.String>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.MutablePlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.discoverComponents(org.codehaus.plexus.classworlds.realm.ClassRealm,java.lang.Object)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.MutablePlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.addComponent(java.lang.Object,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.MutablePlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.hasComponent(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.MutablePlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.hasComponent(java.lang.Class<? extends java.lang.Object>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.MutablePlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.discoverComponents(org.codehaus.plexus.classworlds.realm.ClassRealm)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.MutablePlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.createChildRealm(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.MutablePlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.MutablePlexusContainer.getConfigurationSource()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.MutablePlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.addComponent(T,java.lang.Class<? extends java.lang.Object>,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.MutablePlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.lookup(org.codehaus.plexus.component.repository.ComponentDescriptor<T>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.MutablePlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.getComponentDescriptor(java.lang.Class<T>,java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.MutablePlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.lookup(java.lang.Class<T>,java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.MutablePlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.hasComponent(java.lang.Class<? extends java.lang.Object>,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.MutablePlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.getComponentDescriptorList(java.lang.Class<T>,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.MutablePlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.lookupMap(java.lang.Class<T>,java.util.List<java.lang.String>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.MutablePlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.removeComponentRealm(org.codehaus.plexus.classworlds.realm.ClassRealm)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.MutablePlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.lookupList(java.lang.Class<T>,java.util.List<java.lang.String>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.MutablePlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.MutablePlexusContainer.getComponentRegistry()`

## org.codehaus.plexus.PlexusConstants

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.codehaus.plexus.PlexusConstants.BOOTSTRAP_CONFIGURATION`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.codehaus.plexus.PlexusConstants.IGNORE_CONTAINER_CONFIGURATION`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.codehaus.plexus.PlexusConstants.PLEXUS_CORE_REALM`

## org.codehaus.plexus.PlexusContainer

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.codehaus.plexus.PlexusContainer.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor)`
+ NOW THROWS: `org.codehaus.plexus.PlexusContainer.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor<? extends java.lang.Object>)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.codehaus.plexus.PlexusContainer.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.PlexusContainer.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.PlexusContainer.lookup(java.lang.Class)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.PlexusContainer.lookup(java.lang.Class,java.lang.String)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.PlexusContainer.lookupList(java.lang.Class)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.PlexusContainer.lookupMap(java.lang.Class)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.PlexusContainer.releaseAll(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.PlexusContainer.releaseAll(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.addJarRepository(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.addJarResource(java.io.File)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.autowire(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.createAndAutowire(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.createChildContainer(java.lang.String,java.util.List,java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.createChildContainer(java.lang.String,java.util.List,java.util.Map,java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.createComponentRealm(java.lang.String,java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.getChildContainer(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.getComponentDescriptor(java.lang.String,java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.getComponentDescriptor(java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.getComponentDescriptorList(java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.getComponentDescriptorMap(java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.getCreationDate()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.getLogger()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.getLoggerManager()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.getName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.hasChildContainer(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.isReloadingEnabled()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.lookup(java.lang.Class,java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.lookup(java.lang.Class,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.lookup(java.lang.String,java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.lookup(java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.lookupList(java.lang.Class,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.lookupList(java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.lookupMap(java.lang.Class,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.lookupMap(java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.removeChildContainer(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.resume(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.setLoggerManager(org.codehaus.plexus.logging.LoggerManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.setName(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.setParentPlexusContainer(org.codehaus.plexus.PlexusContainer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.setReloadingEnabled(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.PlexusContainer.suspend(java.lang.Object)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.PlexusContainer.getComponentDescriptor(java.lang.String)`
+ NEW RETURN TYPE: `org.codehaus.plexus.PlexusContainer.getComponentDescriptor(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.PlexusContainer.getComponentDescriptor(java.lang.String,java.lang.String)`
+ NEW RETURN TYPE: `org.codehaus.plexus.PlexusContainer.getComponentDescriptor(java.lang.String,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.PlexusContainer.getComponentDescriptorList(java.lang.String)`
+ NEW RETURN TYPE: `org.codehaus.plexus.PlexusContainer.getComponentDescriptorList(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.PlexusContainer.getComponentDescriptorMap(java.lang.String)`
+ NEW RETURN TYPE: `org.codehaus.plexus.PlexusContainer.getComponentDescriptorMap(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.PlexusContainer.lookupList(java.lang.Class)`
+ NEW RETURN TYPE: `org.codehaus.plexus.PlexusContainer.lookupList(java.lang.Class<T>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.PlexusContainer.lookupList(java.lang.String)`
+ NEW RETURN TYPE: `org.codehaus.plexus.PlexusContainer.lookupList(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.PlexusContainer.lookupMap(java.lang.Class)`
+ NEW RETURN TYPE: `org.codehaus.plexus.PlexusContainer.lookupMap(java.lang.Class<T>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.PlexusContainer.lookupMap(java.lang.String)`
+ NEW RETURN TYPE: `org.codehaus.plexus.PlexusContainer.lookupMap(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.PlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.addComponent(T,java.lang.Class<? extends java.lang.Object>,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.PlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.createChildRealm(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.PlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.hasComponent(java.lang.Class<? extends java.lang.Object>,java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.PlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.hasComponent(java.lang.Class<? extends java.lang.Object>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.PlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.lookupList(java.lang.Class<T>,java.util.List<java.lang.String>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.PlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.getComponentDescriptorList(java.lang.Class<T>,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.PlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.addComponent(java.lang.Object,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.PlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.lookup(java.lang.Class<T>,java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.PlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.removeComponentRealm(org.codehaus.plexus.classworlds.realm.ClassRealm)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.PlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.getComponentDescriptorMap(java.lang.Class<T>,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.PlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.lookupMap(java.lang.String,java.util.List<java.lang.String>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.PlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.discoverComponents(org.codehaus.plexus.classworlds.realm.ClassRealm,java.lang.Object)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.PlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.lookupMap(java.lang.Class<T>,java.util.List<java.lang.String>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.PlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.discoverComponents(org.codehaus.plexus.classworlds.realm.ClassRealm)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.PlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.getComponentDescriptor(java.lang.Class<T>,java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.PlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.hasComponent(java.lang.Class<? extends java.lang.Object>,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.PlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.lookupList(java.lang.String,java.util.List<java.lang.String>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.PlexusContainer`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.PlexusContainer.lookup(org.codehaus.plexus.component.repository.ComponentDescriptor<T>)`

## org.codehaus.plexus.PlexusTestCase

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.codehaus.plexus.PlexusTestCase.container`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.codehaus.plexus.PlexusTestCase.context`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.codehaus.plexus.PlexusTestCase.customizeContext(org.codehaus.plexus.context.Context)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.codehaus.plexus.PlexusTestCase.getConfigurationName(java.lang.String)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.PlexusTestCase.getTestConfiguration(java.lang.Class)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.PlexusTestCase.lookup(java.lang.Class)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.PlexusTestCase.lookup(java.lang.Class,java.lang.String)`

## org.codehaus.plexus.component.collections.AbstractComponentCollection

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `org.codehaus.plexus.component.collections.AbstractComponentCollection`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.codehaus.plexus.component.collections.AbstractComponentCollection.<init>(java.lang.String)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.codehaus.plexus.component.collections.AbstractComponentCollection.<init>(java.lang.String,java.lang.String)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.codehaus.plexus.component.collections.AbstractComponentCollection.roleHint`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.component.collections.AbstractComponentCollection`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.component.collections.AbstractComponentCollection.releaseAllCallback()`

## org.codehaus.plexus.component.collections.ComponentList

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.codehaus.plexus.component.collections.ComponentList.<init>(java.lang.String,java.util.List)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.codehaus.plexus.component.collections.AbstractComponentCollection.roleHint`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.component.collections.ComponentList.addAll(int,java.util.Collection)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.component.collections.ComponentList.addAll(java.util.Collection)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.component.collections.ComponentList.containsAll(java.util.Collection)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.component.collections.ComponentList.removeAll(java.util.Collection)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.component.collections.ComponentList.retainAll(java.util.Collection)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.component.collections.ComponentList.iterator()`
+ NEW RETURN TYPE: `org.codehaus.plexus.component.collections.ComponentList.iterator()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.component.collections.ComponentList.listIterator()`
+ NEW RETURN TYPE: `org.codehaus.plexus.component.collections.ComponentList.listIterator()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.component.collections.ComponentList.listIterator(int)`
+ NEW RETURN TYPE: `org.codehaus.plexus.component.collections.ComponentList.listIterator(int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.component.collections.ComponentList.subList(int,int)`
+ NEW RETURN TYPE: `org.codehaus.plexus.component.collections.ComponentList.subList(int,int)`

## org.codehaus.plexus.component.collections.ComponentMap

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.codehaus.plexus.component.collections.ComponentMap.<init>(java.lang.String,java.util.Map)`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.codehaus.plexus.component.collections.AbstractComponentCollection.roleHint`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.codehaus.plexus.component.collections.ComponentMap.put(java.lang.Object,java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.component.collections.ComponentMap.putAll(java.util.Map)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.component.collections.ComponentMap.entrySet()`
+ NEW RETURN TYPE: `org.codehaus.plexus.component.collections.ComponentMap.entrySet()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.component.collections.ComponentMap.keySet()`
+ NEW RETURN TYPE: `org.codehaus.plexus.component.collections.ComponentMap.keySet()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.component.collections.ComponentMap.put(java.lang.Object,java.lang.Object)`
+ NEW RETURN TYPE: `java.util.Map.put(K,V)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.component.collections.ComponentMap.values()`
+ NEW RETURN TYPE: `org.codehaus.plexus.component.collections.ComponentMap.values()`

## org.codehaus.plexus.component.composition.AbstractComponentComposer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.component.composition.AbstractComponentComposer`

## org.codehaus.plexus.component.composition.ComponentComposer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.component.composition.ComponentComposer`

## org.codehaus.plexus.component.composition.ComponentComposerManager

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.component.composition.ComponentComposerManager`

## org.codehaus.plexus.component.composition.CompositionException

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.component.composition.CompositionException`

## org.codehaus.plexus.component.composition.CompositionResolver

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.codehaus.plexus.component.composition.CompositionResolver.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor)`
+ NOW THROWS: `org.codehaus.plexus.component.composition.CompositionResolver.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor<? extends java.lang.Object>)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.codehaus.plexus.component.composition.CompositionResolver.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.component.composition.CompositionResolver.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor)`

## org.codehaus.plexus.component.composition.ConstructorComponentComposer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.component.composition.ConstructorComponentComposer`

## org.codehaus.plexus.component.composition.DefaultComponentComposerManager

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.component.composition.DefaultComponentComposerManager`

## org.codehaus.plexus.component.composition.DefaultCompositionResolver

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.codehaus.plexus.component.composition.DefaultCompositionResolver.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor)`
+ NOW THROWS: `org.codehaus.plexus.component.composition.DefaultCompositionResolver.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor<? extends java.lang.Object>)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.codehaus.plexus.component.composition.DefaultCompositionResolver.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.component.composition.DefaultCompositionResolver.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor)`

## org.codehaus.plexus.component.composition.FieldComponentComposer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.component.composition.FieldComponentComposer`

## org.codehaus.plexus.component.composition.MapOrientedComponentComposer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.component.composition.MapOrientedComponentComposer`

## org.codehaus.plexus.component.composition.NoOpComponentComposer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.component.composition.NoOpComponentComposer`

## org.codehaus.plexus.component.composition.Requirement

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.component.composition.Requirement`

## org.codehaus.plexus.component.composition.setter.SetterComponentComposer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.component.composition.setter.SetterComponentComposer`

## org.codehaus.plexus.component.configurator.converters.composite.ArrayConverter

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.configurator.converters.composite.ArrayConverter.getDefaultCollection(java.lang.Class)`

## org.codehaus.plexus.component.configurator.converters.lookup.ConverterLookup

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.component.configurator.converters.lookup.ConverterLookup.lookupConverterForType(java.lang.Class)`

## org.codehaus.plexus.component.configurator.converters.lookup.DefaultConverterLookup

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.component.configurator.converters.lookup.DefaultConverterLookup.lookupConverterForType(java.lang.Class)`

## org.codehaus.plexus.component.discovery.AbstractComponentDiscoverer

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.component.discovery.AbstractComponentDiscoverer`

## org.codehaus.plexus.component.discovery.ComponentDiscoverer

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.codehaus.plexus.component.discovery.ComponentDiscoverer.ROLE`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.discovery.ComponentDiscoverer.setManager(org.codehaus.plexus.component.discovery.ComponentDiscovererManager)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.component.discovery.ComponentDiscoverer.findComponents(org.codehaus.plexus.context.Context,org.codehaus.plexus.classworlds.realm.ClassRealm)`
+ NEW RETURN TYPE: `org.codehaus.plexus.component.discovery.ComponentDiscoverer.findComponents(org.codehaus.plexus.context.Context,org.codehaus.plexus.classworlds.realm.ClassRealm)`

## org.codehaus.plexus.component.discovery.ComponentDiscovererManager

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.discovery.ComponentDiscovererManager.getListeners()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.discovery.ComponentDiscovererManager.initialize()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.component.discovery.ComponentDiscovererManager.getComponentDiscoverers()`
+ NEW RETURN TYPE: `org.codehaus.plexus.component.discovery.ComponentDiscovererManager.getComponentDiscoverers()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.component.discovery.ComponentDiscovererManager.getComponentDiscoveryListeners()`
+ NEW RETURN TYPE: `org.codehaus.plexus.component.discovery.ComponentDiscovererManager.getComponentDiscoveryListeners()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.component.discovery.ComponentDiscovererManager`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.component.discovery.ComponentDiscovererManager.addComponentDiscoverer(org.codehaus.plexus.component.discovery.ComponentDiscoverer)`

## org.codehaus.plexus.component.discovery.ComponentDiscoveryListener

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.discovery.ComponentDiscoveryListener.getId()`

## org.codehaus.plexus.component.discovery.DefaultComponentDiscoverer

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.codehaus.plexus.component.discovery.ComponentDiscoverer.ROLE`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.discovery.AbstractComponentDiscoverer.setManager(org.codehaus.plexus.component.discovery.ComponentDiscovererManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.discovery.DefaultComponentDiscoverer.createComponentDescriptors(java.io.Reader,java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.component.discovery.AbstractComponentDiscoverer.findComponents(org.codehaus.plexus.context.Context,org.codehaus.plexus.classworlds.realm.ClassRealm)`
+ NEW RETURN TYPE: `org.codehaus.plexus.component.discovery.AbstractResourceBasedComponentDiscoverer.findComponents(org.codehaus.plexus.context.Context,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.codehaus.plexus.component.discovery.DefaultComponentDiscoverer`

## org.codehaus.plexus.component.discovery.DefaultComponentDiscovererManager

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.discovery.DefaultComponentDiscovererManager.getListeners()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.discovery.DefaultComponentDiscovererManager.initialize()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.component.discovery.DefaultComponentDiscovererManager.getComponentDiscoverers()`
+ NEW RETURN TYPE: `org.codehaus.plexus.component.discovery.DefaultComponentDiscovererManager.getComponentDiscoverers()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.component.discovery.DefaultComponentDiscovererManager.getComponentDiscoveryListeners()`
+ NEW RETURN TYPE: `org.codehaus.plexus.component.discovery.DefaultComponentDiscovererManager.getComponentDiscoveryListeners()`

## org.codehaus.plexus.component.discovery.PlexusXmlComponentDiscoverer

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.codehaus.plexus.component.discovery.ComponentDiscoverer.ROLE`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.discovery.PlexusXmlComponentDiscoverer.discoverConfiguration(org.codehaus.plexus.context.Context,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.discovery.PlexusXmlComponentDiscoverer.setManager(org.codehaus.plexus.component.discovery.ComponentDiscovererManager)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.component.discovery.PlexusXmlComponentDiscoverer.findComponents(org.codehaus.plexus.context.Context,org.codehaus.plexus.classworlds.realm.ClassRealm)`
+ NEW RETURN TYPE: `org.codehaus.plexus.component.discovery.AbstractResourceBasedComponentDiscoverer.findComponents(org.codehaus.plexus.context.Context,org.codehaus.plexus.classworlds.realm.ClassRealm)`

## org.codehaus.plexus.component.factory.AbstractComponentFactory

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.codehaus.plexus.component.factory.AbstractComponentFactory.id`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.codehaus.plexus.component.factory.AbstractComponentFactory.getId()`

## org.codehaus.plexus.component.factory.ComponentFactoryManager

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.factory.ComponentFactoryManager.getDefaultComponentFactory()`

## org.codehaus.plexus.component.factory.DefaultComponentFactoryManager

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.factory.DefaultComponentFactoryManager.getDefaultComponentFactory()`

## org.codehaus.plexus.component.factory.java.JavaComponentFactory

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.codehaus.plexus.component.factory.AbstractComponentFactory.id`

## org.codehaus.plexus.component.manager.AbstractComponentManager

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.codehaus.plexus.component.manager.AbstractComponentManager.<init>()`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.codehaus.plexus.component.manager.AbstractComponentManager.componentContextRealms`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.codehaus.plexus.component.manager.AbstractComponentManager.componentDescriptor`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.codehaus.plexus.component.manager.AbstractComponentManager.container`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.codehaus.plexus.component.manager.AbstractComponentManager.getComponent()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.AbstractComponentManager.copy()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.AbstractComponentManager.createComponentInstance(org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.AbstractComponentManager.createComponentInstance(org.codehaus.plexus.component.repository.ComponentDescriptor,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.AbstractComponentManager.getId()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.AbstractComponentManager.initialize()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.AbstractComponentManager.resume(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.AbstractComponentManager.setup(org.codehaus.plexus.MutablePlexusContainer,org.codehaus.plexus.lifecycle.LifecycleHandler,org.codehaus.plexus.component.repository.ComponentDescriptor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.AbstractComponentManager.startComponentLifecycle(java.lang.Object,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.AbstractComponentManager.suspend(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.ComponentManager.getComponent(org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.component.manager.AbstractComponentManager.getComponentDescriptor()`
+ NEW RETURN TYPE: `org.codehaus.plexus.component.manager.AbstractComponentManager.getComponentDescriptor()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.codehaus.plexus.component.manager.AbstractComponentManager`

## org.codehaus.plexus.component.manager.ClassicSingletonComponentManager

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.component.manager.ClassicSingletonComponentManager`

## org.codehaus.plexus.component.manager.ComponentLookupManagerComponentManager

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.component.manager.ComponentLookupManagerComponentManager`

## org.codehaus.plexus.component.manager.ComponentManager

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.ComponentManager.copy()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.ComponentManager.getComponent(org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.ComponentManager.getId()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.ComponentManager.initialize()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.ComponentManager.resume(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.ComponentManager.setup(org.codehaus.plexus.MutablePlexusContainer,org.codehaus.plexus.lifecycle.LifecycleHandler,org.codehaus.plexus.component.repository.ComponentDescriptor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.ComponentManager.suspend(java.lang.Object)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.component.manager.ComponentManager.getComponentDescriptor()`
+ NEW RETURN TYPE: `org.codehaus.plexus.component.manager.ComponentManager.getComponentDescriptor()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.component.manager.ComponentManager`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.component.manager.ComponentManager.getStartId()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.component.manager.ComponentManager`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.component.manager.ComponentManager.getRealm()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.component.manager.ComponentManager`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.component.manager.ComponentManager.getRole()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.component.manager.ComponentManager`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.component.manager.ComponentManager.start(java.lang.Object)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.component.manager.ComponentManager`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.component.manager.ComponentManager.getType()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.component.manager.ComponentManager`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.component.manager.ComponentManager.dissociateComponentRealm(org.codehaus.plexus.classworlds.realm.ClassRealm)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.component.manager.ComponentManager`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.component.manager.ComponentManager.getRoleHint()`

## org.codehaus.plexus.component.manager.ComponentManagerManager

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.component.manager.ComponentManagerManager`

## org.codehaus.plexus.component.manager.ContainerComponentManager

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.component.manager.ContainerComponentManager`

## org.codehaus.plexus.component.manager.DefaultComponentManagerManager

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.component.manager.DefaultComponentManagerManager`

## org.codehaus.plexus.component.manager.KeepAliveSingletonComponentManager

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.component.manager.KeepAliveSingletonComponentManager`

## org.codehaus.plexus.component.manager.PerLookupComponentManager

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.codehaus.plexus.component.manager.PerLookupComponentManager.<init>()`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.codehaus.plexus.component.manager.AbstractComponentManager.componentContextRealms`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.codehaus.plexus.component.manager.AbstractComponentManager.componentDescriptor`

### FIELD_NOW_FINAL [binary ✗ | source ✗]
- FIELD (now final): `org.codehaus.plexus.component.manager.AbstractComponentManager.container`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.AbstractComponentManager.copy()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.AbstractComponentManager.createComponentInstance(org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.AbstractComponentManager.createComponentInstance(org.codehaus.plexus.component.repository.ComponentDescriptor,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.AbstractComponentManager.getId()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.AbstractComponentManager.initialize()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.AbstractComponentManager.resume(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.AbstractComponentManager.setup(org.codehaus.plexus.MutablePlexusContainer,org.codehaus.plexus.lifecycle.LifecycleHandler,org.codehaus.plexus.component.repository.ComponentDescriptor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.AbstractComponentManager.startComponentLifecycle(java.lang.Object,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.AbstractComponentManager.suspend(java.lang.Object)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.manager.PerLookupComponentManager.getComponent(org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.component.manager.AbstractComponentManager.getComponentDescriptor()`
+ NEW RETURN TYPE: `org.codehaus.plexus.component.manager.AbstractComponentManager.getComponentDescriptor()`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `org.codehaus.plexus.component.manager.PerLookupComponentManager`

## org.codehaus.plexus.component.reloading.ComponentReloadingException

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.component.reloading.ComponentReloadingException`

## org.codehaus.plexus.component.reloading.ComponentReloadingStrategy

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.component.reloading.ComponentReloadingStrategy`

## org.codehaus.plexus.component.repository.ComponentDescriptor

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.component.repository.ComponentDescriptor.addRequirements(java.util.List)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.ComponentDescriptor.getDependencies()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.ComponentDescriptor.getRealmId()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.ComponentDescriptor.setRealmId(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.component.repository.ComponentDescriptor.getRequirements()`
+ NEW RETURN TYPE: `org.codehaus.plexus.component.repository.ComponentDescriptor.getRequirements()`

## org.codehaus.plexus.component.repository.ComponentProfile

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.component.repository.ComponentProfile`

## org.codehaus.plexus.component.repository.ComponentProfileDescriptor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.component.repository.ComponentProfileDescriptor`

## org.codehaus.plexus.component.repository.ComponentRepository

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.codehaus.plexus.component.repository.ComponentRepository.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor)`
+ NOW THROWS: `org.codehaus.plexus.component.repository.ComponentRepository.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor<? extends java.lang.Object>)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.codehaus.plexus.component.repository.ComponentRepository.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.component.repository.ComponentRepository.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.ComponentRepository.addComponentDescriptor(org.codehaus.plexus.configuration.PlexusConfiguration)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.ComponentRepository.configure(org.codehaus.plexus.configuration.PlexusConfiguration)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.ComponentRepository.getComponentDependencies(org.codehaus.plexus.component.repository.ComponentDescriptor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.ComponentRepository.getComponentDescriptor(java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.ComponentRepository.getComponentDescriptorMap(java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.ComponentRepository.hasComponent(java.lang.String,java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.ComponentRepository.hasComponent(java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.ComponentRepository.initialize()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.ComponentRepository.setClassRealm(org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.ComponentRepository.validateComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.component.repository.ComponentRepository.getComponentDescriptor(java.lang.String,java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`
+ NEW RETURN TYPE: `org.codehaus.plexus.component.repository.ComponentRepository.getComponentDescriptor(java.lang.String,java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.component.repository.ComponentRepository`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.component.repository.ComponentRepository.getComponentDescriptorList(java.lang.Class<T>,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.component.repository.ComponentRepository`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.component.repository.ComponentRepository.getComponentDescriptor(java.lang.Class<T>,java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.component.repository.ComponentRepository`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.component.repository.ComponentRepository.getComponentDescriptorMap(java.lang.Class<T>,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.component.repository.ComponentRepository`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.component.repository.ComponentRepository.removeComponentRealm(org.codehaus.plexus.classworlds.realm.ClassRealm)`

## org.codehaus.plexus.component.repository.ComponentSetDescriptor

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.component.repository.ComponentSetDescriptor.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.component.repository.ComponentSetDescriptor.setComponents(java.util.List)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.component.repository.ComponentSetDescriptor.setDependencies(java.util.List)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.component.repository.ComponentSetDescriptor.getComponents()`
+ NEW RETURN TYPE: `org.codehaus.plexus.component.repository.ComponentSetDescriptor.getComponents()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.component.repository.ComponentSetDescriptor.getDependencies()`
+ NEW RETURN TYPE: `org.codehaus.plexus.component.repository.ComponentSetDescriptor.getDependencies()`

## org.codehaus.plexus.component.repository.DefaultComponentRepository

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.codehaus.plexus.component.repository.DefaultComponentRepository.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor)`
+ NOW THROWS: `org.codehaus.plexus.component.repository.DefaultComponentRepository.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor<? extends java.lang.Object>)`

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `org.codehaus.plexus.component.repository.DefaultComponentRepository.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.component.repository.DefaultComponentRepository.addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.DefaultComponentRepository.addComponentDescriptor(org.codehaus.plexus.configuration.PlexusConfiguration)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.DefaultComponentRepository.configure(org.codehaus.plexus.configuration.PlexusConfiguration)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.DefaultComponentRepository.getComponentDependencies(org.codehaus.plexus.component.repository.ComponentDescriptor)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.DefaultComponentRepository.getComponentDescriptor(java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.DefaultComponentRepository.getComponentDescriptorMap(java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.DefaultComponentRepository.getConfiguration()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.DefaultComponentRepository.hasComponent(java.lang.String,java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.DefaultComponentRepository.hasComponent(java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.DefaultComponentRepository.initialize()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.DefaultComponentRepository.initializeComponentDescriptors()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.DefaultComponentRepository.setClassRealm(org.codehaus.plexus.classworlds.realm.ClassRealm)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.DefaultComponentRepository.validateComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.component.repository.DefaultComponentRepository.getComponentDescriptor(java.lang.String,java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`
+ NEW RETURN TYPE: `org.codehaus.plexus.component.repository.DefaultComponentRepository.getComponentDescriptor(java.lang.String,java.lang.String,org.codehaus.plexus.classworlds.realm.ClassRealm)`

## org.codehaus.plexus.component.repository.exception.ComponentLookupException

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.codehaus.plexus.component.repository.exception.ComponentLookupException.<init>(java.lang.String)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.codehaus.plexus.component.repository.exception.ComponentLookupException.<init>(java.lang.String,java.lang.Throwable)`

## org.codehaus.plexus.component.repository.io.PlexusTools

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.component.repository.io.PlexusTools.buildComponentDescriptor(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.component.repository.io.PlexusTools.buildComponentDescriptor(org.codehaus.plexus.configuration.PlexusConfiguration)`
+ NEW RETURN TYPE: `org.codehaus.plexus.component.repository.io.PlexusTools.buildComponentDescriptor(org.codehaus.plexus.configuration.PlexusConfiguration)`

## org.codehaus.plexus.configuration.PlexusComponentDescriptorMerger

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.configuration.PlexusComponentDescriptorMerger.merge(org.codehaus.plexus.component.repository.ComponentDescriptor,org.codehaus.plexus.component.repository.ComponentDescriptor)`

## org.codehaus.plexus.configuration.PlexusConfiguration

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.configuration.PlexusConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.configuration.PlexusConfiguration.addChild(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.configuration.PlexusConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.configuration.PlexusConfiguration.setAttribute(java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.configuration.PlexusConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.configuration.PlexusConfiguration.setValue(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.configuration.PlexusConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.configuration.PlexusConfiguration.setName(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.configuration.PlexusConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.configuration.PlexusConfiguration.addChild(java.lang.String,java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.configuration.PlexusConfiguration`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.configuration.PlexusConfiguration.setValueAndGetSelf(java.lang.String)`

## org.codehaus.plexus.configuration.processor.AbstractConfigurationResourceHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.configuration.processor.AbstractConfigurationResourceHandler`

## org.codehaus.plexus.configuration.processor.ConfigurationProcessingException

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.configuration.processor.ConfigurationProcessingException`

## org.codehaus.plexus.configuration.processor.ConfigurationProcessor

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.configuration.processor.ConfigurationProcessor`

## org.codehaus.plexus.configuration.processor.ConfigurationResourceHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.configuration.processor.ConfigurationResourceHandler`

## org.codehaus.plexus.configuration.processor.ConfigurationResourceNotFoundException

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.configuration.processor.ConfigurationResourceNotFoundException`

## org.codehaus.plexus.configuration.processor.DirectoryConfigurationResourceHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.configuration.processor.DirectoryConfigurationResourceHandler`

## org.codehaus.plexus.configuration.processor.FileConfigurationResourceHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.configuration.processor.FileConfigurationResourceHandler`

## org.codehaus.plexus.configuration.processor.ResourceBundleConfigurationResourceHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.configuration.processor.ResourceBundleConfigurationResourceHandler`

## org.codehaus.plexus.configuration.source.ConfigurationSource

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.configuration.source.ConfigurationSource`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.configuration.source.ConfigurationSource.getConfiguration(org.codehaus.plexus.component.repository.ComponentDescriptor)`

## org.codehaus.plexus.configuration.xml.XmlPlexusConfiguration

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.configuration.xml.XmlPlexusConfiguration.addAllChildren(org.codehaus.plexus.configuration.PlexusConfiguration)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.configuration.xml.XmlPlexusConfiguration.getXpp3Dom()`

## org.codehaus.plexus.container.initialization.AbstractCoreComponentInitializationPhase

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.container.initialization.AbstractCoreComponentInitializationPhase.setupCoreComponent(java.lang.String,org.codehaus.plexus.component.configurator.BasicComponentConfigurator,org.codehaus.plexus.configuration.PlexusConfiguration,org.codehaus.plexus.PlexusContainer)`

## org.codehaus.plexus.container.initialization.ComponentDiscoveryPhase

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.container.initialization.ComponentDiscoveryPhase`

## org.codehaus.plexus.container.initialization.ContainerInitializationContext

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.codehaus.plexus.container.initialization.ContainerInitializationContext.<init>(org.codehaus.plexus.DefaultPlexusContainer,org.codehaus.plexus.classworlds.ClassWorld,org.codehaus.plexus.classworlds.realm.ClassRealm,org.codehaus.plexus.configuration.PlexusConfiguration)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.container.initialization.ContainerInitializationContext.getContainerConfiguration()`
+ NEW RETURN TYPE: `org.codehaus.plexus.container.initialization.ContainerInitializationContext.getContainerConfiguration()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.codehaus.plexus.container.initialization.ContainerInitializationContext.getContainerConfiguration()`
+ NEW RETURN TYPE: `org.codehaus.plexus.container.initialization.ContainerInitializationContext.getContainerConfiguration()`

## org.codehaus.plexus.container.initialization.InitializeComponentComposerPhase

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.container.initialization.InitializeComponentComposerPhase`

## org.codehaus.plexus.container.initialization.InitializeComponentDiscovererManagerPhase

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.container.initialization.AbstractCoreComponentInitializationPhase.setupCoreComponent(java.lang.String,org.codehaus.plexus.component.configurator.BasicComponentConfigurator,org.codehaus.plexus.configuration.PlexusConfiguration,org.codehaus.plexus.PlexusContainer)`

## org.codehaus.plexus.container.initialization.InitializeComponentFactoryManagerPhase

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.container.initialization.AbstractCoreComponentInitializationPhase.setupCoreComponent(java.lang.String,org.codehaus.plexus.component.configurator.BasicComponentConfigurator,org.codehaus.plexus.configuration.PlexusConfiguration,org.codehaus.plexus.PlexusContainer)`

## org.codehaus.plexus.container.initialization.InitializeComponentLookupManagerPhase

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.container.initialization.InitializeComponentLookupManagerPhase`

## org.codehaus.plexus.container.initialization.InitializeComponentManagerManagerPhase

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.container.initialization.InitializeComponentManagerManagerPhase`

## org.codehaus.plexus.container.initialization.InitializeComponentRepositoryPhase

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.container.initialization.InitializeComponentRepositoryPhase`

## org.codehaus.plexus.container.initialization.InitializeContextPhase

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.container.initialization.InitializeContextPhase`

## org.codehaus.plexus.container.initialization.InitializeLifecycleHandlerManagerPhase

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.container.initialization.InitializeLifecycleHandlerManagerPhase`

## org.codehaus.plexus.container.initialization.InitializeLoggerManagerPhase

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.container.initialization.AbstractCoreComponentInitializationPhase.setupCoreComponent(java.lang.String,org.codehaus.plexus.component.configurator.BasicComponentConfigurator,org.codehaus.plexus.configuration.PlexusConfiguration,org.codehaus.plexus.PlexusContainer)`

## org.codehaus.plexus.container.initialization.InitializeResourcesPhase

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.container.initialization.InitializeResourcesPhase`

## org.codehaus.plexus.container.initialization.RegisterComponentDiscoveryListenersPhase

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.container.initialization.RegisterComponentDiscoveryListenersPhase`

## org.codehaus.plexus.container.initialization.StartLoadOnStartComponentsPhase

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.container.initialization.StartLoadOnStartComponentsPhase`

## org.codehaus.plexus.context.Context

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.context.Context.getContextData()`
+ NEW RETURN TYPE: `org.codehaus.plexus.context.Context.getContextData()`

## org.codehaus.plexus.context.DefaultContext

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.codehaus.plexus.context.DefaultContext.<init>(java.util.Map,org.codehaus.plexus.context.Context)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.codehaus.plexus.context.DefaultContext.<init>(org.codehaus.plexus.context.Context)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.codehaus.plexus.context.DefaultContext.<init>(java.util.Map)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.context.DefaultContext.getParent()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.codehaus.plexus.context.DefaultContext.getContextData()`
+ NEW RETURN TYPE: `org.codehaus.plexus.context.DefaultContext.getContextData()`

## org.codehaus.plexus.lifecycle.AbstractLifecycleHandler

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.codehaus.plexus.lifecycle.AbstractLifecycleHandler.getId()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.lifecycle.AbstractLifecycleHandler.getName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.lifecycle.AbstractLifecycleHandler.getResumeSegment()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.lifecycle.AbstractLifecycleHandler.getSuspendSegment()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.lifecycle.AbstractLifecycleHandler.resume(java.lang.Object,org.codehaus.plexus.component.manager.ComponentManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.lifecycle.AbstractLifecycleHandler.suspend(java.lang.Object,org.codehaus.plexus.component.manager.ComponentManager)`

## org.codehaus.plexus.lifecycle.BasicLifecycleHandler

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.codehaus.plexus.lifecycle.BasicLifecycleHandler.<init>()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.lifecycle.AbstractLifecycleHandler.getName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.lifecycle.AbstractLifecycleHandler.getResumeSegment()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.lifecycle.AbstractLifecycleHandler.getSuspendSegment()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.lifecycle.AbstractLifecycleHandler.resume(java.lang.Object,org.codehaus.plexus.component.manager.ComponentManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.lifecycle.AbstractLifecycleHandler.suspend(java.lang.Object,org.codehaus.plexus.component.manager.ComponentManager)`

## org.codehaus.plexus.lifecycle.BootstrapLifecycleHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.lifecycle.BootstrapLifecycleHandler`

## org.codehaus.plexus.lifecycle.DefaultLifecycleHandlerManager

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.lifecycle.DefaultLifecycleHandlerManager.getDefaultLifecycleHandler()`

## org.codehaus.plexus.lifecycle.LifecycleHandler

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.lifecycle.LifecycleHandler.resume(java.lang.Object,org.codehaus.plexus.component.manager.ComponentManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.lifecycle.LifecycleHandler.suspend(java.lang.Object,org.codehaus.plexus.component.manager.ComponentManager)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.lifecycle.LifecycleHandler`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.lifecycle.LifecycleHandler.addEndSegment(org.codehaus.plexus.lifecycle.phase.Phase)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.lifecycle.LifecycleHandler`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.lifecycle.LifecycleHandler.addBeginSegment(org.codehaus.plexus.lifecycle.phase.Phase)`

## org.codehaus.plexus.lifecycle.LifecycleHandlerManager

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.codehaus.plexus.lifecycle.LifecycleHandlerManager.getDefaultLifecycleHandler()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.codehaus.plexus.lifecycle.LifecycleHandlerManager`
+ MUST NOW IMPLEMENT: `org.codehaus.plexus.lifecycle.LifecycleHandlerManager.addLifecycleHandler(org.codehaus.plexus.lifecycle.LifecycleHandler)`

## org.codehaus.plexus.lifecycle.PassiveLifecycleHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.lifecycle.PassiveLifecycleHandler`

## org.codehaus.plexus.personality.plexus.PlexusLifecycleHandler

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.personality.plexus.PlexusLifecycleHandler`

## org.codehaus.plexus.personality.plexus.lifecycle.phase.CompositionPhase

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.codehaus.plexus.personality.plexus.lifecycle.phase.CompositionPhase`

