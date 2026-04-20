# API Specification: org.codehaus.plexus:plexus-container-default 2.1.1

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public class `org.codehaus.plexus.ClassRealmUtil`

**Constructors:**
- `public ClassRealmUtil()`

**Methods:**
- `public static java.util.Set getContextRealms(org.codehaus.plexus.classworlds.ClassWorld p0)`

---

## public abstract interface `org.codehaus.plexus.ComponentRegistry`

**Methods:**
- `public abstract <T extends java.lang.Object> void addComponent(T p0, java.lang.String p1, java.lang.String p2)`
- `public abstract void addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor p0) throws org.codehaus.plexus.component.composition.CycleDetectedInComponentGraphException`
- `public abstract void dispose()`
- `public abstract <T extends java.lang.Object> org.codehaus.plexus.component.repository.ComponentDescriptor getComponentDescriptor(java.lang.Class p0, java.lang.String p1, java.lang.String p2)`
- `public abstract org.codehaus.plexus.component.repository.ComponentDescriptor getComponentDescriptor(java.lang.String p0, java.lang.String p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2)`
- `public abstract <T extends java.lang.Object> java.util.List getComponentDescriptorList(java.lang.Class p0, java.lang.String p1)`
- `public abstract <T extends java.lang.Object> java.util.Map getComponentDescriptorMap(java.lang.Class p0, java.lang.String p1)`
- `public abstract <T extends java.lang.Object> T lookup(java.lang.Class p0, java.lang.String p1, java.lang.String p2) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public abstract <T extends java.lang.Object> T lookup(org.codehaus.plexus.component.repository.ComponentDescriptor p0) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public abstract <T extends java.lang.Object> java.util.List lookupList(java.lang.Class p0, java.lang.String p1, java.util.List p2) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public abstract <T extends java.lang.Object> java.util.Map lookupMap(java.lang.Class p0, java.lang.String p1, java.util.List p2) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public abstract void registerComponentManagerFactory(org.codehaus.plexus.component.manager.ComponentManagerFactory p0)`
- `public abstract void release(java.lang.Object p0) throws org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`
- `public abstract void removeComponentRealm(org.codehaus.plexus.classworlds.realm.ClassRealm p0) throws org.codehaus.plexus.PlexusContainerException`

---

## public abstract interface `org.codehaus.plexus.ContainerConfiguration`

**Methods:**
- `public abstract org.codehaus.plexus.ContainerConfiguration addComponentDiscoverer(java.lang.Class p0)`
- `public abstract org.codehaus.plexus.ContainerConfiguration addComponentDiscoverer(org.codehaus.plexus.component.discovery.ComponentDiscoverer p0)`
- `public abstract org.codehaus.plexus.ContainerConfiguration addComponentDiscoveryListener(java.lang.Class p0)`
- `public abstract org.codehaus.plexus.ContainerConfiguration addComponentDiscoveryListener(org.codehaus.plexus.component.discovery.ComponentDiscoveryListener p0)`
- `public abstract org.codehaus.plexus.ContainerConfiguration addLifecycleHandler(org.codehaus.plexus.lifecycle.LifecycleHandler p0)`
- `public abstract org.codehaus.plexus.classworlds.ClassWorld getClassWorld()`
- `public abstract org.codehaus.plexus.component.discovery.ComponentDiscovererManager getComponentDiscovererManager()`
- `public abstract java.util.List getComponentDiscoverers()`
- `public abstract java.util.List getComponentDiscoveryListeners()`
- `public abstract org.codehaus.plexus.component.factory.ComponentFactoryManager getComponentFactoryManager()`
- `public abstract org.codehaus.plexus.component.repository.ComponentRepository getComponentRepository()`
- `public abstract org.codehaus.plexus.configuration.source.ConfigurationSource getConfigurationSource()`
- `public abstract java.lang.String getContainerConfiguration()`
- `public abstract java.net.URL getContainerConfigurationURL()`
- `public abstract java.util.Map getContext()`
- `public abstract org.codehaus.plexus.container.initialization.ContainerInitializationPhase[] getInitializationPhases()`
- `public abstract org.codehaus.plexus.lifecycle.LifecycleHandlerManager getLifecycleHandlerManager()`
- `public abstract java.lang.String getName()`
- `public abstract org.codehaus.plexus.classworlds.realm.ClassRealm getRealm()`
- `public abstract org.codehaus.plexus.ContainerConfiguration setClassWorld(org.codehaus.plexus.classworlds.ClassWorld p0)`
- `public abstract org.codehaus.plexus.ContainerConfiguration setComponentDiscovererManager(org.codehaus.plexus.component.discovery.ComponentDiscovererManager p0)`
- `public abstract org.codehaus.plexus.ContainerConfiguration setComponentFactoryManager(org.codehaus.plexus.component.factory.ComponentFactoryManager p0)`
- `public abstract org.codehaus.plexus.ContainerConfiguration setComponentRepository(org.codehaus.plexus.component.repository.ComponentRepository p0)`
- `public abstract org.codehaus.plexus.ContainerConfiguration setConfigurationSource(org.codehaus.plexus.configuration.source.ConfigurationSource p0)`
- `public abstract org.codehaus.plexus.ContainerConfiguration setContainerConfiguration(java.lang.String p0)`
- `public abstract org.codehaus.plexus.ContainerConfiguration setContainerConfigurationURL(java.net.URL p0)`
- `public abstract org.codehaus.plexus.ContainerConfiguration setContext(java.util.Map p0)`
- `public abstract org.codehaus.plexus.ContainerConfiguration setLifecycleHandlerManager(org.codehaus.plexus.lifecycle.LifecycleHandlerManager p0)`
- `public abstract org.codehaus.plexus.ContainerConfiguration setName(java.lang.String p0)`
- `public abstract org.codehaus.plexus.ContainerConfiguration setRealm(org.codehaus.plexus.classworlds.realm.ClassRealm p0)`

---

## public class `org.codehaus.plexus.DefaultComponentRegistry`
implements `org.codehaus.plexus.ComponentRegistry`  

**Constructors:**
- `public DefaultComponentRegistry(org.codehaus.plexus.MutablePlexusContainer p0, org.codehaus.plexus.component.repository.ComponentRepository p1, org.codehaus.plexus.lifecycle.LifecycleHandlerManager p2)`

**Methods:**
- `public synchronized <T extends java.lang.Object> void addComponent(T p0, java.lang.String p1, java.lang.String p2)`
- `public void addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor p0) throws org.codehaus.plexus.component.composition.CycleDetectedInComponentGraphException`
- `public void dispose()`
- `public <T extends java.lang.Object> org.codehaus.plexus.component.repository.ComponentDescriptor getComponentDescriptor(java.lang.Class p0, java.lang.String p1, java.lang.String p2)`
- `public org.codehaus.plexus.component.repository.ComponentDescriptor getComponentDescriptor(java.lang.String p0, java.lang.String p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2)`
- `public <T extends java.lang.Object> java.util.List getComponentDescriptorList(java.lang.Class p0, java.lang.String p1)`
- `public <T extends java.lang.Object> java.util.Map getComponentDescriptorMap(java.lang.Class p0, java.lang.String p1)`
- `public <T extends java.lang.Object> T lookup(java.lang.Class p0, java.lang.String p1, java.lang.String p2) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public <T extends java.lang.Object> T lookup(org.codehaus.plexus.component.repository.ComponentDescriptor p0) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public <T extends java.lang.Object> java.util.List lookupList(java.lang.Class p0, java.lang.String p1, java.util.List p2) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public <T extends java.lang.Object> java.util.Map lookupMap(java.lang.Class p0, java.lang.String p1, java.util.List p2) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public void registerComponentManagerFactory(org.codehaus.plexus.component.manager.ComponentManagerFactory p0)`
- `public void release(java.lang.Object p0) throws org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`
- `public void removeComponentRealm(org.codehaus.plexus.classworlds.realm.ClassRealm p0) throws org.codehaus.plexus.PlexusContainerException`

---

## public class `org.codehaus.plexus.DefaultContainerConfiguration`
implements `org.codehaus.plexus.ContainerConfiguration`  

**Constructors:**
- `public DefaultContainerConfiguration()`

**Methods:**
- `public org.codehaus.plexus.ContainerConfiguration addComponentDiscoverer(java.lang.Class p0)`
- `public org.codehaus.plexus.ContainerConfiguration addComponentDiscoverer(org.codehaus.plexus.component.discovery.ComponentDiscoverer p0)`
- `public org.codehaus.plexus.ContainerConfiguration addComponentDiscoveryListener(java.lang.Class p0)`
- `public org.codehaus.plexus.ContainerConfiguration addComponentDiscoveryListener(org.codehaus.plexus.component.discovery.ComponentDiscoveryListener p0)`
- `public org.codehaus.plexus.ContainerConfiguration addLifecycleHandler(org.codehaus.plexus.lifecycle.LifecycleHandler p0)`
- `public org.codehaus.plexus.classworlds.ClassWorld getClassWorld()`
- `public org.codehaus.plexus.component.discovery.ComponentDiscovererManager getComponentDiscovererManager()`
- `public java.util.List getComponentDiscoverers()`
- `public java.util.List getComponentDiscoveryListeners()`
- `public org.codehaus.plexus.component.factory.ComponentFactoryManager getComponentFactoryManager()`
- `public org.codehaus.plexus.component.repository.ComponentRepository getComponentRepository()`
- `public org.codehaus.plexus.configuration.source.ConfigurationSource getConfigurationSource()`
- `public java.lang.String getContainerConfiguration()`
- `public java.net.URL getContainerConfigurationURL()`
- `public java.util.Map getContext()`
- `public org.codehaus.plexus.container.initialization.ContainerInitializationPhase[] getInitializationPhases()`
- `public org.codehaus.plexus.lifecycle.LifecycleHandlerManager getLifecycleHandlerManager()`
- `public java.lang.String getName()`
- `public org.codehaus.plexus.classworlds.realm.ClassRealm getRealm()`
- `public org.codehaus.plexus.ContainerConfiguration setClassWorld(org.codehaus.plexus.classworlds.ClassWorld p0)`
- `public org.codehaus.plexus.ContainerConfiguration setComponentDiscovererManager(org.codehaus.plexus.component.discovery.ComponentDiscovererManager p0)`
- `public org.codehaus.plexus.ContainerConfiguration setComponentFactoryManager(org.codehaus.plexus.component.factory.ComponentFactoryManager p0)`
- `public org.codehaus.plexus.ContainerConfiguration setComponentRepository(org.codehaus.plexus.component.repository.ComponentRepository p0)`
- `public org.codehaus.plexus.ContainerConfiguration setConfigurationSource(org.codehaus.plexus.configuration.source.ConfigurationSource p0)`
- `public org.codehaus.plexus.ContainerConfiguration setContainerConfiguration(java.lang.String p0)`
- `public org.codehaus.plexus.ContainerConfiguration setContainerConfigurationURL(java.net.URL p0)`
- `public org.codehaus.plexus.ContainerConfiguration setContext(java.util.Map p0)`
- `public org.codehaus.plexus.ContainerConfiguration setInitializationPhases(org.codehaus.plexus.container.initialization.ContainerInitializationPhase[] p0)`
- `public org.codehaus.plexus.ContainerConfiguration setLifecycleHandlerManager(org.codehaus.plexus.lifecycle.LifecycleHandlerManager p0)`
- `public org.codehaus.plexus.ContainerConfiguration setName(java.lang.String p0)`
- `public org.codehaus.plexus.ContainerConfiguration setRealm(org.codehaus.plexus.classworlds.realm.ClassRealm p0)`

---

## public class `org.codehaus.plexus.DefaultPlexusContainer`
extends `org.codehaus.plexus.logging.AbstractLogEnabled`  
implements `org.codehaus.plexus.MutablePlexusContainer`  

**Constructors:**
- `public DefaultPlexusContainer() throws org.codehaus.plexus.PlexusContainerException`
- `public DefaultPlexusContainer(org.codehaus.plexus.ContainerConfiguration p0) throws org.codehaus.plexus.PlexusContainerException`

**Fields:**
- `protected final static java.lang.String DEFAULT_CONTAINER_NAME`
- `protected final static java.lang.String DEFAULT_REALM_NAME`
- `protected org.codehaus.plexus.classworlds.ClassWorld classWorld`
- `protected org.codehaus.plexus.component.discovery.ComponentDiscovererManager componentDiscovererManager`
- `protected org.codehaus.plexus.component.factory.ComponentFactoryManager componentFactoryManager`
- `protected org.codehaus.plexus.configuration.PlexusConfiguration configuration`
- `protected java.io.Reader configurationReader`
- `protected org.codehaus.plexus.configuration.source.ConfigurationSource configurationSource`
- `protected org.codehaus.plexus.context.Context containerContext`
- `protected org.codehaus.plexus.classworlds.realm.ClassRealm containerRealm`
- `protected org.codehaus.plexus.logging.LoggerManager loggerManager`

**Methods:**
- `public <T extends java.lang.Object> void addComponent(T p0, java.lang.Class p1, java.lang.String p2)`
- `public void addComponent(java.lang.Object p0, java.lang.String p1)`
- `public void addComponent(java.lang.Object p0, java.lang.String p1, java.lang.String p2)`
- `public void addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor p0) throws org.codehaus.plexus.component.composition.CycleDetectedInComponentGraphException`
- `public void addContextValue(java.lang.Object p0, java.lang.Object p1)`
- `public org.codehaus.plexus.classworlds.realm.ClassRealm createChildRealm(java.lang.String p0)`
- `public java.util.List discoverComponents(org.codehaus.plexus.classworlds.realm.ClassRealm p0) throws org.codehaus.plexus.component.composition.CycleDetectedInComponentGraphException, org.codehaus.plexus.configuration.PlexusConfigurationException`
- `public java.util.List discoverComponents(org.codehaus.plexus.classworlds.realm.ClassRealm p0, java.lang.Object p1) throws org.codehaus.plexus.component.composition.CycleDetectedInComponentGraphException, org.codehaus.plexus.configuration.PlexusConfigurationException`
- `public void dispose()`
- `public org.codehaus.plexus.classworlds.ClassWorld getClassWorld()`
- `public <T extends java.lang.Object> org.codehaus.plexus.component.repository.ComponentDescriptor getComponentDescriptor(java.lang.Class p0, java.lang.String p1, java.lang.String p2)`
- `public org.codehaus.plexus.component.repository.ComponentDescriptor getComponentDescriptor(java.lang.String p0)`
- `public org.codehaus.plexus.component.repository.ComponentDescriptor getComponentDescriptor(java.lang.String p0, java.lang.String p1)`
- `public <T extends java.lang.Object> java.util.List getComponentDescriptorList(java.lang.Class p0, java.lang.String p1)`
- `public java.util.List getComponentDescriptorList(java.lang.String p0)`
- `public <T extends java.lang.Object> java.util.Map getComponentDescriptorMap(java.lang.Class p0, java.lang.String p1)`
- `public java.util.Map getComponentDescriptorMap(java.lang.String p0)`
- `public org.codehaus.plexus.component.discovery.ComponentDiscovererManager getComponentDiscovererManager()`
- `public org.codehaus.plexus.component.factory.ComponentFactoryManager getComponentFactoryManager()`
- `public org.codehaus.plexus.classworlds.realm.ClassRealm getComponentRealm(java.lang.String p0)`
- `public org.codehaus.plexus.ComponentRegistry getComponentRegistry()`
- `public org.codehaus.plexus.configuration.PlexusConfiguration getConfiguration()`
- `public org.codehaus.plexus.configuration.source.ConfigurationSource getConfigurationSource()`
- `public org.codehaus.plexus.classworlds.realm.ClassRealm getContainerRealm()`
- `public org.codehaus.plexus.context.Context getContext()`
- `protected java.io.Reader getInterpolationConfigurationReader(java.io.Reader p0)`
- `public org.codehaus.plexus.logging.Logger getLogger()`
- `public org.codehaus.plexus.logging.LoggerManager getLoggerManager()`
- `public org.codehaus.plexus.classworlds.realm.ClassRealm getLookupRealm()`
- `public org.codehaus.plexus.classworlds.realm.ClassRealm getLookupRealm(java.lang.Object p0)`
- `public boolean hasComponent(java.lang.Class p0)`
- `public boolean hasComponent(java.lang.Class p0, java.lang.String p1)`
- `public boolean hasComponent(java.lang.Class p0, java.lang.String p1, java.lang.String p2)`
- `public boolean hasComponent(java.lang.String p0)`
- `public boolean hasComponent(java.lang.String p0, java.lang.String p1)`
- `protected void initialize(org.codehaus.plexus.ContainerConfiguration p0) throws org.codehaus.plexus.PlexusContainerException`
- `protected void initializeConfiguration(org.codehaus.plexus.ContainerConfiguration p0) throws java.io.IOException, org.codehaus.plexus.configuration.PlexusConfigurationException, org.codehaus.plexus.context.ContextException`
- `protected void initializePhases(org.codehaus.plexus.ContainerConfiguration p0) throws org.codehaus.plexus.PlexusContainerException`
- `public <T extends java.lang.Object> T lookup(java.lang.Class p0) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public <T extends java.lang.Object> T lookup(java.lang.Class p0, java.lang.String p1) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public <T extends java.lang.Object> T lookup(java.lang.Class p0, java.lang.String p1, java.lang.String p2) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public java.lang.Object lookup(java.lang.String p0) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public java.lang.Object lookup(java.lang.String p0, java.lang.String p1) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public <T extends java.lang.Object> T lookup(org.codehaus.plexus.component.repository.ComponentDescriptor p0) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public <T extends java.lang.Object> java.util.List lookupList(java.lang.Class p0) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public <T extends java.lang.Object> java.util.List lookupList(java.lang.Class p0, java.util.List p1) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public java.util.List lookupList(java.lang.String p0) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public java.util.List lookupList(java.lang.String p0, java.util.List p1) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public <T extends java.lang.Object> java.util.Map lookupMap(java.lang.Class p0) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public <T extends java.lang.Object> java.util.Map lookupMap(java.lang.Class p0, java.util.List p1) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public java.util.Map lookupMap(java.lang.String p0) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public java.util.Map lookupMap(java.lang.String p0, java.util.List p1) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public void registerComponentDiscoveryListener(org.codehaus.plexus.component.discovery.ComponentDiscoveryListener p0)`
- `public void release(java.lang.Object p0) throws org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`
- `public void releaseAll(java.util.List p0) throws org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`
- `public void releaseAll(java.util.Map p0) throws org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`
- `public void removeComponentDiscoveryListener(org.codehaus.plexus.component.discovery.ComponentDiscoveryListener p0)`
- `public void removeComponentRealm(org.codehaus.plexus.classworlds.realm.ClassRealm p0) throws org.codehaus.plexus.PlexusContainerException`
- `public void setClassWorld(org.codehaus.plexus.classworlds.ClassWorld p0)`
- `public void setComponentDiscovererManager(org.codehaus.plexus.component.discovery.ComponentDiscovererManager p0)`
- `public void setComponentFactoryManager(org.codehaus.plexus.component.factory.ComponentFactoryManager p0)`
- `public void setComponentRegistry(org.codehaus.plexus.ComponentRegistry p0)`
- `public void setConfiguration(org.codehaus.plexus.configuration.PlexusConfiguration p0)`
- `public void setConfigurationSource(org.codehaus.plexus.configuration.source.ConfigurationSource p0)`
- `public void setContainerRealm(org.codehaus.plexus.classworlds.realm.ClassRealm p0)`
- `public void setLoggerManager(org.codehaus.plexus.logging.LoggerManager p0)`
- `public org.codehaus.plexus.classworlds.realm.ClassRealm setLookupRealm(org.codehaus.plexus.classworlds.realm.ClassRealm p0)`
- `protected void start() throws org.codehaus.plexus.PlexusContainerException`

---

## public class `org.codehaus.plexus.DuplicateChildContainerException`
extends `org.codehaus.plexus.PlexusContainerException`  

**Constructors:**
- `public DuplicateChildContainerException(java.lang.String p0, java.lang.String p1)`

**Methods:**
- `public java.lang.String getChild()`
- `public java.lang.String getParent()`

---

## public abstract interface `org.codehaus.plexus.MutablePlexusContainer`
implements `org.codehaus.plexus.PlexusContainer`  

**Methods:**
- `public abstract org.codehaus.plexus.classworlds.ClassWorld getClassWorld()`
- `public abstract org.codehaus.plexus.component.discovery.ComponentDiscovererManager getComponentDiscovererManager()`
- `public abstract org.codehaus.plexus.component.factory.ComponentFactoryManager getComponentFactoryManager()`
- `public abstract org.codehaus.plexus.classworlds.realm.ClassRealm getComponentRealm(java.lang.String p0)`
- `public abstract org.codehaus.plexus.ComponentRegistry getComponentRegistry()`
- `public abstract org.codehaus.plexus.configuration.PlexusConfiguration getConfiguration()`
- `public abstract org.codehaus.plexus.configuration.source.ConfigurationSource getConfigurationSource()`
- `public abstract org.codehaus.plexus.logging.Logger getLogger()`
- `public abstract org.codehaus.plexus.logging.LoggerManager getLoggerManager()`
- `public abstract void setComponentDiscovererManager(org.codehaus.plexus.component.discovery.ComponentDiscovererManager p0)`
- `public abstract void setComponentFactoryManager(org.codehaus.plexus.component.factory.ComponentFactoryManager p0)`
- `public abstract void setComponentRegistry(org.codehaus.plexus.ComponentRegistry p0)`
- `public abstract void setConfiguration(org.codehaus.plexus.configuration.PlexusConfiguration p0)`
- `public abstract void setConfigurationSource(org.codehaus.plexus.configuration.source.ConfigurationSource p0)`
- `public abstract void setLoggerManager(org.codehaus.plexus.logging.LoggerManager p0)`

---

## public abstract class `org.codehaus.plexus.PlexusConstants`

**Constructors:**
- `public PlexusConstants()`

**Fields:**
- `public final static java.lang.String PLEXUS_DEFAULT_HINT`
- `public final static java.lang.String PLEXUS_KEY`

---

## public abstract interface `org.codehaus.plexus.PlexusContainer`

**Fields:**
- `public final static java.lang.String ROLE`

**Methods:**
- `public abstract <T extends java.lang.Object> void addComponent(T p0, java.lang.Class p1, java.lang.String p2)`
- `public abstract void addComponent(java.lang.Object p0, java.lang.String p1) throws org.codehaus.plexus.component.composition.CycleDetectedInComponentGraphException`
- `public abstract void addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor p0) throws org.codehaus.plexus.component.composition.CycleDetectedInComponentGraphException`
- `public abstract void addContextValue(java.lang.Object p0, java.lang.Object p1)`
- `public abstract org.codehaus.plexus.classworlds.realm.ClassRealm createChildRealm(java.lang.String p0)`
- `public abstract java.util.List discoverComponents(org.codehaus.plexus.classworlds.realm.ClassRealm p0) throws org.codehaus.plexus.component.composition.CycleDetectedInComponentGraphException, org.codehaus.plexus.configuration.PlexusConfigurationException`
- `public abstract java.util.List discoverComponents(org.codehaus.plexus.classworlds.realm.ClassRealm p0, java.lang.Object p1) throws org.codehaus.plexus.component.composition.CycleDetectedInComponentGraphException, org.codehaus.plexus.configuration.PlexusConfigurationException`
- `public abstract void dispose()`
- `public abstract <T extends java.lang.Object> org.codehaus.plexus.component.repository.ComponentDescriptor getComponentDescriptor(java.lang.Class p0, java.lang.String p1, java.lang.String p2)`
- `public abstract org.codehaus.plexus.component.repository.ComponentDescriptor getComponentDescriptor(java.lang.String p0)`
- `public abstract org.codehaus.plexus.component.repository.ComponentDescriptor getComponentDescriptor(java.lang.String p0, java.lang.String p1)`
- `public abstract <T extends java.lang.Object> java.util.List getComponentDescriptorList(java.lang.Class p0, java.lang.String p1)`
- `public abstract java.util.List getComponentDescriptorList(java.lang.String p0)`
- `public abstract <T extends java.lang.Object> java.util.Map getComponentDescriptorMap(java.lang.Class p0, java.lang.String p1)`
- `public abstract java.util.Map getComponentDescriptorMap(java.lang.String p0)`
- `public abstract org.codehaus.plexus.classworlds.realm.ClassRealm getComponentRealm(java.lang.String p0)`
- `public abstract org.codehaus.plexus.classworlds.realm.ClassRealm getContainerRealm()`
- `public abstract org.codehaus.plexus.context.Context getContext()`
- `public abstract org.codehaus.plexus.classworlds.realm.ClassRealm getLookupRealm()`
- `public abstract org.codehaus.plexus.classworlds.realm.ClassRealm getLookupRealm(java.lang.Object p0)`
- `public abstract boolean hasComponent(java.lang.Class p0)`
- `public abstract boolean hasComponent(java.lang.Class p0, java.lang.String p1)`
- `public abstract boolean hasComponent(java.lang.Class p0, java.lang.String p1, java.lang.String p2)`
- `public abstract boolean hasComponent(java.lang.String p0)`
- `public abstract boolean hasComponent(java.lang.String p0, java.lang.String p1)`
- `public abstract <T extends java.lang.Object> T lookup(java.lang.Class p0) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public abstract <T extends java.lang.Object> T lookup(java.lang.Class p0, java.lang.String p1) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public abstract <T extends java.lang.Object> T lookup(java.lang.Class p0, java.lang.String p1, java.lang.String p2) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public abstract java.lang.Object lookup(java.lang.String p0) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public abstract java.lang.Object lookup(java.lang.String p0, java.lang.String p1) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public abstract <T extends java.lang.Object> T lookup(org.codehaus.plexus.component.repository.ComponentDescriptor p0) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public abstract <T extends java.lang.Object> java.util.List lookupList(java.lang.Class p0) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public abstract <T extends java.lang.Object> java.util.List lookupList(java.lang.Class p0, java.util.List p1) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public abstract java.util.List lookupList(java.lang.String p0) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public abstract java.util.List lookupList(java.lang.String p0, java.util.List p1) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public abstract <T extends java.lang.Object> java.util.Map lookupMap(java.lang.Class p0) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public abstract <T extends java.lang.Object> java.util.Map lookupMap(java.lang.Class p0, java.util.List p1) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public abstract java.util.Map lookupMap(java.lang.String p0) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public abstract java.util.Map lookupMap(java.lang.String p0, java.util.List p1) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public abstract void registerComponentDiscoveryListener(org.codehaus.plexus.component.discovery.ComponentDiscoveryListener p0)`
- `public abstract void release(java.lang.Object p0) throws org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`
- `public abstract void releaseAll(java.util.List p0) throws org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`
- `public abstract void releaseAll(java.util.Map p0) throws org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`
- `public abstract void removeComponentDiscoveryListener(org.codehaus.plexus.component.discovery.ComponentDiscoveryListener p0)`
- `public abstract void removeComponentRealm(org.codehaus.plexus.classworlds.realm.ClassRealm p0) throws org.codehaus.plexus.PlexusContainerException`
- `public abstract org.codehaus.plexus.classworlds.realm.ClassRealm setLookupRealm(org.codehaus.plexus.classworlds.realm.ClassRealm p0)`

---

## public class `org.codehaus.plexus.PlexusContainerException`
extends `java.lang.Exception`  

**Constructors:**
- `public PlexusContainerException(java.lang.String p0)`
- `public PlexusContainerException(java.lang.String p0, java.lang.Throwable p1)`

---

## public abstract class `org.codehaus.plexus.PlexusJUnit4TestCase`

**Constructors:**
- `public PlexusJUnit4TestCase()`

**Methods:**
- `public void afterTest() throws java.lang.Exception`
- `public void beforeTest() throws java.lang.Exception`
- `protected org.codehaus.plexus.configuration.PlexusConfiguration customizeComponentConfiguration()`
- `protected void customizeContainerConfiguration(org.codehaus.plexus.ContainerConfiguration p0)`
- `protected void customizeContext(org.codehaus.plexus.context.Context p0)`
- `public static java.lang.String getBasedir()`
- `protected java.lang.ClassLoader getClassLoader()`
- `protected java.io.InputStream getConfiguration()`
- `protected java.io.InputStream getConfiguration(java.lang.String p0)`
- `protected java.lang.String getConfigurationName(java.lang.String p0)`
- `protected org.codehaus.plexus.PlexusContainer getContainer()`
- `protected java.lang.String getCustomConfigurationName()`
- `protected java.io.InputStream getResourceAsStream(java.lang.String p0)`
- `public java.lang.String getTestConfiguration()`
- `public static java.lang.String getTestConfiguration(java.lang.Class p0)`
- `public static java.io.File getTestFile(java.lang.String p0)`
- `public static java.io.File getTestFile(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String getTestPath(java.lang.String p0)`
- `public static java.lang.String getTestPath(java.lang.String p0, java.lang.String p1)`
- `protected <T extends java.lang.Object> T lookup(java.lang.Class p0) throws org.codehaus.plexus.component.repository.exception.ComponentLookupRuntimeException`
- `protected <T extends java.lang.Object> T lookup(java.lang.Class p0, java.lang.String p1) throws org.codehaus.plexus.component.repository.exception.ComponentLookupRuntimeException`
- `protected java.lang.Object lookup(java.lang.String p0)`
- `protected java.lang.Object lookup(java.lang.String p0, java.lang.String p1) throws org.codehaus.plexus.component.repository.exception.ComponentLookupRuntimeException`
- `protected void release(java.lang.Object p0) throws java.lang.Exception`
- `protected void setupContainer()`

---

## public abstract class `org.codehaus.plexus.PlexusTestCase`
extends `junit.framework.TestCase`  

**Constructors:**
- `public PlexusTestCase()`

**Methods:**
- `protected org.codehaus.plexus.configuration.PlexusConfiguration customizeComponentConfiguration()`
- `protected void customizeContainerConfiguration(org.codehaus.plexus.ContainerConfiguration p0)`
- `protected void customizeContext(org.codehaus.plexus.context.Context p0)`
- `public static java.lang.String getBasedir()`
- `protected java.lang.ClassLoader getClassLoader()`
- `protected java.io.InputStream getConfiguration() throws java.lang.Exception`
- `protected java.io.InputStream getConfiguration(java.lang.String p0) throws java.lang.Exception`
- `protected java.lang.String getConfigurationName(java.lang.String p0)`
- `protected org.codehaus.plexus.PlexusContainer getContainer()`
- `protected java.lang.String getCustomConfigurationName()`
- `protected java.io.InputStream getResourceAsStream(java.lang.String p0)`
- `public java.lang.String getTestConfiguration()`
- `public static java.lang.String getTestConfiguration(java.lang.Class p0)`
- `public static java.io.File getTestFile(java.lang.String p0)`
- `public static java.io.File getTestFile(java.lang.String p0, java.lang.String p1)`
- `public static java.lang.String getTestPath(java.lang.String p0)`
- `public static java.lang.String getTestPath(java.lang.String p0, java.lang.String p1)`
- `protected <T extends java.lang.Object> T lookup(java.lang.Class p0) throws java.lang.Exception`
- `protected <T extends java.lang.Object> T lookup(java.lang.Class p0, java.lang.String p1) throws java.lang.Exception`
- `protected <T extends java.lang.Object> T lookup(java.lang.String p0) throws java.lang.Exception`
- `protected <T extends java.lang.Object> T lookup(java.lang.String p0, java.lang.String p1) throws java.lang.Exception`
- `protected void release(java.lang.Object p0) throws java.lang.Exception`
- `protected void setUp() throws java.lang.Exception`
- `protected void setupContainer()`
- `protected void tearDown() throws java.lang.Exception`

---

## public final class `org.codehaus.plexus.component.CastUtils`

**Methods:**
- `public static <T extends java.lang.Object> java.util.Collection cast(java.util.Collection p0)`
- `public static <T extends java.lang.Object> java.util.Collection cast(java.util.Collection p0, java.lang.Class p1)`
- `public static <T extends java.lang.Object> java.util.Iterator cast(java.util.Iterator p0)`
- `public static <T extends java.lang.Object> java.util.Iterator cast(java.util.Iterator p0, java.lang.Class p1)`
- `public static <T extends java.lang.Object> java.util.List cast(java.util.List p0)`
- `public static <T extends java.lang.Object> java.util.List cast(java.util.List p0, java.lang.Class p1)`
- `public static <T extends java.lang.Object, U extends java.lang.Object> java.util.Map$Entry cast(java.util.Map$Entry p0)`
- `public static <T extends java.lang.Object, U extends java.lang.Object> java.util.Map$Entry cast(java.util.Map$Entry p0, java.lang.Class p1, java.lang.Class p2)`
- `public static <T extends java.lang.Object, U extends java.lang.Object> java.util.Map cast(java.util.Map p0)`
- `public static <T extends java.lang.Object, U extends java.lang.Object> java.util.Map cast(java.util.Map p0, java.lang.Class p1, java.lang.Class p2)`
- `public static <T extends java.lang.Object> java.util.Set cast(java.util.Set p0)`
- `public static <T extends java.lang.Object> java.util.Set cast(java.util.Set p0, java.lang.Class p1)`
- `public static boolean isAssignableFrom(java.lang.Class p0, java.lang.Class p1)`

---

## public abstract interface `org.codehaus.plexus.component.MapOrientedComponent`

**Methods:**
- `public abstract void addComponentRequirement(org.codehaus.plexus.component.repository.ComponentRequirement p0, java.lang.Object p1) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`
- `public abstract void setComponentConfiguration(java.util.Map p0) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`

---

## public abstract class `org.codehaus.plexus.component.builder.AbstractComponentBuildListener`
implements `org.codehaus.plexus.component.builder.ComponentBuildListener`  

**Constructors:**
- `public AbstractComponentBuildListener()`

**Methods:**
- `public void beforeComponentCreate(org.codehaus.plexus.component.repository.ComponentDescriptor p0, org.codehaus.plexus.classworlds.realm.ClassRealm p1)`
- `public void componentConfigured(org.codehaus.plexus.component.repository.ComponentDescriptor p0, java.lang.Object p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2)`
- `public void componentCreated(org.codehaus.plexus.component.repository.ComponentDescriptor p0, java.lang.Object p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2)`

---

## public abstract interface `org.codehaus.plexus.component.builder.ComponentBuildListener`

**Methods:**
- `public abstract void beforeComponentCreate(org.codehaus.plexus.component.repository.ComponentDescriptor p0, org.codehaus.plexus.classworlds.realm.ClassRealm p1)`
- `public abstract void componentConfigured(org.codehaus.plexus.component.repository.ComponentDescriptor p0, java.lang.Object p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2)`
- `public abstract void componentCreated(org.codehaus.plexus.component.repository.ComponentDescriptor p0, java.lang.Object p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2)`

---

## public abstract interface `org.codehaus.plexus.component.builder.ComponentBuilder`<T extends java.lang.Object>

**Methods:**
- `public abstract T build(org.codehaus.plexus.component.repository.ComponentDescriptor p0, org.codehaus.plexus.classworlds.realm.ClassRealm p1, org.codehaus.plexus.component.builder.ComponentBuildListener p2) throws org.codehaus.plexus.component.factory.ComponentInstantiationException, org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`

---

## public class `org.codehaus.plexus.component.builder.XBeanComponentBuilder`<T extends java.lang.Object>
implements `org.codehaus.plexus.component.builder.ComponentBuilder<T>`  

**Constructors:**
- `public XBeanComponentBuilder()`
- `public XBeanComponentBuilder(org.codehaus.plexus.component.manager.ComponentManager p0)`

**Methods:**
- `public T build(org.codehaus.plexus.component.repository.ComponentDescriptor p0, org.codehaus.plexus.classworlds.realm.ClassRealm p1, org.codehaus.plexus.component.builder.ComponentBuildListener p2) throws org.codehaus.plexus.component.factory.ComponentInstantiationException, org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`
- `protected T createComponentInstance(org.codehaus.plexus.component.repository.ComponentDescriptor p0, org.codehaus.plexus.classworlds.realm.ClassRealm p1) throws org.codehaus.plexus.component.factory.ComponentInstantiationException, org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`
- `public org.apache.xbean.recipe.ObjectRecipe createObjectRecipe(T p0, org.codehaus.plexus.component.repository.ComponentDescriptor p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2) throws org.codehaus.plexus.component.factory.ComponentInstantiationException, org.codehaus.plexus.configuration.PlexusConfigurationException`
- `protected java.lang.String fromXML(java.lang.String p0)`
- `public org.codehaus.plexus.component.manager.ComponentManager getComponentManager()`
- `protected org.codehaus.plexus.MutablePlexusContainer getContainer()`
- `public void setComponentManager(org.codehaus.plexus.component.manager.ComponentManager p0)`
- `protected boolean shouldConfigure(org.codehaus.plexus.component.repository.ComponentDescriptor p0)`
- `protected void startComponentLifecycle(java.lang.Object p0, org.codehaus.plexus.classworlds.realm.ClassRealm p1) throws org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`

---

## public static class `org.codehaus.plexus.component.builder.XBeanComponentBuilder$RequirementRecipe`<T extends java.lang.Object>
extends `org.apache.xbean.recipe.AbstractRecipe`  

**Constructors:**
- `public RequirementRecipe(org.codehaus.plexus.component.repository.ComponentDescriptor p0, org.codehaus.plexus.component.repository.ComponentRequirement p1, org.codehaus.plexus.MutablePlexusContainer p2, boolean p3)`

**Methods:**
- `public boolean canCreate(java.lang.reflect.Type p0)`
- `protected java.lang.Object internalCreate(java.lang.reflect.Type p0, boolean p1) throws org.apache.xbean.recipe.ConstructionException`
- `public java.lang.String toString()`

---

## public abstract class `org.codehaus.plexus.component.collections.AbstractComponentCollection`<T extends java.lang.Object>

**Constructors:**
- `public AbstractComponentCollection(org.codehaus.plexus.MutablePlexusContainer p0, java.lang.Class p1, java.lang.String p2, java.util.List p3, java.lang.String p4)`

**Fields:**
- `protected final java.lang.Class componentType`
- `protected org.codehaus.plexus.MutablePlexusContainer container`
- `protected java.lang.String hostComponent`
- `protected org.codehaus.plexus.logging.Logger logger`
- `protected java.lang.String role`
- `protected java.util.List roleHints`

**Methods:**
- `protected boolean checkUpdate()`
- `public synchronized void clear()`
- `protected synchronized java.util.Map getComponentDescriptorMap()`
- `protected T lookup(org.codehaus.plexus.component.repository.ComponentDescriptor p0)`
- `protected abstract void releaseAllCallback()`

---

## public class `org.codehaus.plexus.component.collections.ComponentList`<T extends java.lang.Object>
extends `org.codehaus.plexus.component.collections.AbstractComponentCollection`  
implements `java.util.List<T>`  

**Constructors:**
- `public ComponentList(org.codehaus.plexus.MutablePlexusContainer p0, java.lang.Class p1, java.lang.String p2, java.util.List p3, java.lang.String p4)`

**Methods:**
- `public synchronized boolean add(T p0)`
- `public void add(int p0, T p1)`
- `public boolean addAll(int p0, java.util.Collection p1)`
- `public boolean addAll(java.util.Collection p0)`
- `protected boolean checkUpdate()`
- `public boolean contains(java.lang.Object p0)`
- `public boolean containsAll(java.util.Collection p0)`
- `public boolean equals(java.lang.Object p0)`
- `public T get(int p0)`
- `public int hashCode()`
- `public int indexOf(java.lang.Object p0)`
- `public boolean isEmpty()`
- `public java.util.Iterator iterator()`
- `public int lastIndexOf(java.lang.Object p0)`
- `public java.util.ListIterator listIterator()`
- `public java.util.ListIterator listIterator(int p0)`
- `protected void releaseAllCallback()`
- `public T remove(int p0)`
- `public boolean remove(java.lang.Object p0)`
- `public synchronized boolean removeAll(java.util.Collection p0)`
- `public synchronized boolean retainAll(java.util.Collection p0)`
- `public T set(int p0, T p1)`
- `public int size()`
- `public java.util.List subList(int p0, int p1)`
- `public java.lang.Object[] toArray()`
- `public <X extends java.lang.Object> X[] toArray(X[] p0)`

---

## public class `org.codehaus.plexus.component.collections.ComponentMap`<T extends java.lang.Object>
extends `org.codehaus.plexus.component.collections.AbstractComponentCollection`  
implements `java.util.Map<java.lang.String,T>`  

**Constructors:**
- `public ComponentMap(org.codehaus.plexus.MutablePlexusContainer p0, java.lang.Class p1, java.lang.String p2, java.util.List p3, java.lang.String p4)`

**Methods:**
- `protected boolean checkUpdate()`
- `public boolean containsKey(java.lang.Object p0)`
- `public boolean containsValue(java.lang.Object p0)`
- `public java.util.Set entrySet()`
- `public boolean equals(java.lang.Object p0)`
- `public T get(java.lang.Object p0)`
- `public int hashCode()`
- `public boolean isEmpty()`
- `public java.util.Set keySet()`
- `public synchronized T put(java.lang.String p0, T p1)`
- `public synchronized void putAll(java.util.Map p0)`
- `protected void releaseAllCallback()`
- `public synchronized T remove(java.lang.Object p0)`
- `public int size()`
- `public java.util.Collection values()`

---

## public abstract interface `org.codehaus.plexus.component.composition.CompositionResolver`

**Fields:**
- `public final static char SEPARATOR_CHAR`

**Methods:**
- `public abstract void addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor p0) throws org.codehaus.plexus.component.composition.CycleDetectedInComponentGraphException`
- `public abstract java.util.List findRequirements(java.lang.String p0, java.lang.String p1)`
- `public abstract java.util.List getRequirements(java.lang.String p0, java.lang.String p1)`

---

## public class `org.codehaus.plexus.component.composition.CycleDetectedInComponentGraphException`
extends `java.lang.Exception`  

**Constructors:**
- `public CycleDetectedInComponentGraphException(java.lang.String p0)`
- `public CycleDetectedInComponentGraphException(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `org.codehaus.plexus.component.composition.DefaultCompositionResolver`
implements `org.codehaus.plexus.component.composition.CompositionResolver`  

**Constructors:**
- `public DefaultCompositionResolver()`

**Methods:**
- `public void addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor p0) throws org.codehaus.plexus.component.composition.CycleDetectedInComponentGraphException`
- `public java.util.List findRequirements(java.lang.String p0, java.lang.String p1)`
- `public java.util.List getRequirements(java.lang.String p0, java.lang.String p1)`

---

## public class `org.codehaus.plexus.component.composition.UndefinedComponentComposerException`
extends `java.lang.Exception`  

**Constructors:**
- `public UndefinedComponentComposerException(java.lang.String p0)`
- `public UndefinedComponentComposerException(java.lang.String p0, java.lang.Throwable p1)`
- `public UndefinedComponentComposerException(java.lang.Throwable p0)`

---

## public abstract class `org.codehaus.plexus.component.configurator.AbstractComponentConfigurator`
implements `org.codehaus.plexus.component.configurator.ComponentConfigurator`  

**Constructors:**
- `public AbstractComponentConfigurator()`

**Fields:**
- `protected org.codehaus.plexus.component.configurator.converters.lookup.ConverterLookup converterLookup`

**Methods:**
- `public void configureComponent(java.lang.Object p0, org.codehaus.plexus.configuration.PlexusConfiguration p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`
- `public void configureComponent(java.lang.Object p0, org.codehaus.plexus.configuration.PlexusConfiguration p1, org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator p2, org.codehaus.plexus.classworlds.realm.ClassRealm p3) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`
- `public void configureComponent(java.lang.Object p0, org.codehaus.plexus.configuration.PlexusConfiguration p1, org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator p2, org.codehaus.plexus.classworlds.realm.ClassRealm p3, org.codehaus.plexus.component.configurator.ConfigurationListener p4) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`

---

## public class `org.codehaus.plexus.component.configurator.BasicComponentConfigurator`
extends `org.codehaus.plexus.component.configurator.AbstractComponentConfigurator`  

**Constructors:**
- `public BasicComponentConfigurator()`

**Methods:**
- `public void configureComponent(java.lang.Object p0, org.codehaus.plexus.configuration.PlexusConfiguration p1, org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator p2, org.codehaus.plexus.classworlds.realm.ClassRealm p3, org.codehaus.plexus.component.configurator.ConfigurationListener p4) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`

---

## public class `org.codehaus.plexus.component.configurator.ComponentConfigurationException`
extends `java.lang.Exception`  

**Constructors:**
- `public ComponentConfigurationException(java.lang.String p0)`
- `public ComponentConfigurationException(java.lang.String p0, java.lang.Throwable p1)`
- `public ComponentConfigurationException(java.lang.Throwable p0)`
- `public ComponentConfigurationException(org.codehaus.plexus.configuration.PlexusConfiguration p0, java.lang.String p1)`
- `public ComponentConfigurationException(org.codehaus.plexus.configuration.PlexusConfiguration p0, java.lang.String p1, java.lang.Throwable p2)`
- `public ComponentConfigurationException(org.codehaus.plexus.configuration.PlexusConfiguration p0, java.lang.Throwable p1)`

**Methods:**
- `public org.codehaus.plexus.configuration.PlexusConfiguration getFailedConfiguration()`
- `public void setFailedConfiguration(org.codehaus.plexus.configuration.PlexusConfiguration p0)`

---

## public abstract interface `org.codehaus.plexus.component.configurator.ComponentConfigurator`

**Fields:**
- `public final static java.lang.String ROLE`

**Methods:**
- `public abstract void configureComponent(java.lang.Object p0, org.codehaus.plexus.configuration.PlexusConfiguration p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`
- `public abstract void configureComponent(java.lang.Object p0, org.codehaus.plexus.configuration.PlexusConfiguration p1, org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator p2, org.codehaus.plexus.classworlds.realm.ClassRealm p3) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`
- `public abstract void configureComponent(java.lang.Object p0, org.codehaus.plexus.configuration.PlexusConfiguration p1, org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator p2, org.codehaus.plexus.classworlds.realm.ClassRealm p3, org.codehaus.plexus.component.configurator.ConfigurationListener p4) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`

---

## public abstract interface `org.codehaus.plexus.component.configurator.ConfigurationListener`

**Methods:**
- `public abstract void notifyFieldChangeUsingReflection(java.lang.String p0, java.lang.Object p1, java.lang.Object p2)`
- `public abstract void notifyFieldChangeUsingSetter(java.lang.String p0, java.lang.Object p1, java.lang.Object p2)`

---

## public class `org.codehaus.plexus.component.configurator.MapOrientedComponentConfigurator`
extends `org.codehaus.plexus.component.configurator.AbstractComponentConfigurator`  

**Constructors:**
- `public MapOrientedComponentConfigurator()`

**Methods:**
- `public void configureComponent(java.lang.Object p0, org.codehaus.plexus.configuration.PlexusConfiguration p1, org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator p2, org.codehaus.plexus.classworlds.realm.ClassRealm p3, org.codehaus.plexus.component.configurator.ConfigurationListener p4) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`

---

## public abstract class `org.codehaus.plexus.component.configurator.converters.AbstractConfigurationConverter`
implements `org.codehaus.plexus.component.configurator.converters.ConfigurationConverter`  

**Constructors:**
- `public AbstractConfigurationConverter()`

**Methods:**
- `public java.lang.Object fromConfiguration(org.codehaus.plexus.component.configurator.converters.lookup.ConverterLookup p0, org.codehaus.plexus.configuration.PlexusConfiguration p1, java.lang.Class p2, java.lang.Class p3, java.lang.ClassLoader p4, org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator p5) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`
- `protected java.lang.Object fromExpression(org.codehaus.plexus.configuration.PlexusConfiguration p0, org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator p1) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`
- `protected java.lang.Object fromExpression(org.codehaus.plexus.configuration.PlexusConfiguration p0, org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator p1, java.lang.Class p2) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`
- `protected java.lang.String fromXML(java.lang.String p0)`
- `protected java.lang.Class getClassForImplementationHint(java.lang.Class p0, org.codehaus.plexus.configuration.PlexusConfiguration p1, java.lang.ClassLoader p2) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`
- `protected java.lang.Object instantiateObject(java.lang.Class p0) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`
- `protected java.lang.Object instantiateObject(java.lang.String p0, java.lang.ClassLoader p1) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`
- `protected java.lang.Class loadClass(java.lang.String p0, java.lang.ClassLoader p1) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`
- `protected java.lang.String toXML(java.lang.String p0)`

---

## public class `org.codehaus.plexus.component.configurator.converters.ComponentValueSetter`

**Constructors:**
- `public ComponentValueSetter(java.lang.String p0, java.lang.Object p1, org.codehaus.plexus.component.configurator.converters.lookup.ConverterLookup p2) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`
- `public ComponentValueSetter(java.lang.String p0, java.lang.Object p1, org.codehaus.plexus.component.configurator.converters.lookup.ConverterLookup p2, org.codehaus.plexus.component.configurator.ConfigurationListener p3) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`

**Methods:**
- `public void configure(org.codehaus.plexus.configuration.PlexusConfiguration p0, java.lang.ClassLoader p1, org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator p2) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`

---

## public abstract interface `org.codehaus.plexus.component.configurator.converters.ConfigurationConverter`

**Methods:**
- `public abstract boolean canConvert(java.lang.Class p0)`
- `public abstract java.lang.Object fromConfiguration(org.codehaus.plexus.component.configurator.converters.lookup.ConverterLookup p0, org.codehaus.plexus.configuration.PlexusConfiguration p1, java.lang.Class p2, java.lang.Class p3, java.lang.ClassLoader p4, org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator p5) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`
- `public abstract java.lang.Object fromConfiguration(org.codehaus.plexus.component.configurator.converters.lookup.ConverterLookup p0, org.codehaus.plexus.configuration.PlexusConfiguration p1, java.lang.Class p2, java.lang.Class p3, java.lang.ClassLoader p4, org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator p5, org.codehaus.plexus.component.configurator.ConfigurationListener p6) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`

---

## public abstract class `org.codehaus.plexus.component.configurator.converters.basic.AbstractBasicConverter`
extends `org.codehaus.plexus.component.configurator.converters.AbstractConfigurationConverter`  

**Constructors:**
- `public AbstractBasicConverter()`

**Methods:**
- `public java.lang.Object fromConfiguration(org.codehaus.plexus.component.configurator.converters.lookup.ConverterLookup p0, org.codehaus.plexus.configuration.PlexusConfiguration p1, java.lang.Class p2, java.lang.Class p3, java.lang.ClassLoader p4, org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator p5, org.codehaus.plexus.component.configurator.ConfigurationListener p6) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`
- `protected java.lang.Object fromExpression(org.codehaus.plexus.configuration.PlexusConfiguration p0, org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator p1, java.lang.Class p2) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`
- `protected abstract java.lang.Object fromString(java.lang.String p0) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`

---

## public class `org.codehaus.plexus.component.configurator.converters.basic.BooleanConverter`
extends `org.codehaus.plexus.component.configurator.converters.basic.AbstractBasicConverter`  

**Constructors:**
- `public BooleanConverter()`

**Methods:**
- `public boolean canConvert(java.lang.Class p0)`
- `public java.lang.Object fromString(java.lang.String p0)`

---

## public class `org.codehaus.plexus.component.configurator.converters.basic.ByteConverter`
extends `org.codehaus.plexus.component.configurator.converters.basic.AbstractBasicConverter`  

**Constructors:**
- `public ByteConverter()`

**Methods:**
- `public boolean canConvert(java.lang.Class p0)`
- `public java.lang.Object fromString(java.lang.String p0)`

---

## public class `org.codehaus.plexus.component.configurator.converters.basic.CharConverter`
extends `org.codehaus.plexus.component.configurator.converters.basic.AbstractBasicConverter`  

**Constructors:**
- `public CharConverter()`

**Methods:**
- `public boolean canConvert(java.lang.Class p0)`
- `public java.lang.Object fromString(java.lang.String p0)`

---

## public class `org.codehaus.plexus.component.configurator.converters.basic.ClassConverter`
extends `org.codehaus.plexus.component.configurator.converters.basic.AbstractBasicConverter`  

**Constructors:**
- `public ClassConverter()`

**Methods:**
- `public boolean canConvert(java.lang.Class p0)`
- `public java.lang.Object fromString(java.lang.String p0) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`

---

## public abstract interface `org.codehaus.plexus.component.configurator.converters.basic.Converter`

**Methods:**
- `public abstract boolean canConvert(java.lang.Class p0)`
- `public abstract java.lang.Object fromString(java.lang.String p0)`
- `public abstract java.lang.String toString(java.lang.Object p0)`

---

## public class `org.codehaus.plexus.component.configurator.converters.basic.DateConverter`
extends `org.codehaus.plexus.component.configurator.converters.basic.AbstractBasicConverter`  

**Constructors:**
- `public DateConverter()`

**Methods:**
- `public boolean canConvert(java.lang.Class p0)`
- `public java.lang.Object fromString(java.lang.String p0)`
- `public java.lang.String toString(java.lang.Object p0)`

---

## public class `org.codehaus.plexus.component.configurator.converters.basic.DoubleConverter`
extends `org.codehaus.plexus.component.configurator.converters.basic.AbstractBasicConverter`  

**Constructors:**
- `public DoubleConverter()`

**Methods:**
- `public boolean canConvert(java.lang.Class p0)`
- `public java.lang.Object fromString(java.lang.String p0)`

---

## public class `org.codehaus.plexus.component.configurator.converters.basic.EnumConverter`
extends `org.codehaus.plexus.component.configurator.converters.AbstractConfigurationConverter`  

**Constructors:**
- `public EnumConverter()`

**Methods:**
- `public boolean canConvert(java.lang.Class p0)`
- `public java.lang.Object fromConfiguration(org.codehaus.plexus.component.configurator.converters.lookup.ConverterLookup p0, org.codehaus.plexus.configuration.PlexusConfiguration p1, java.lang.Class p2, java.lang.Class p3, java.lang.ClassLoader p4, org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator p5, org.codehaus.plexus.component.configurator.ConfigurationListener p6) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`

---

## public class `org.codehaus.plexus.component.configurator.converters.basic.FileConverter`
extends `org.codehaus.plexus.component.configurator.converters.basic.AbstractBasicConverter`  

**Constructors:**
- `public FileConverter()`

**Methods:**
- `public boolean canConvert(java.lang.Class p0)`
- `public java.lang.Object fromConfiguration(org.codehaus.plexus.component.configurator.converters.lookup.ConverterLookup p0, org.codehaus.plexus.configuration.PlexusConfiguration p1, java.lang.Class p2, java.lang.Class p3, java.lang.ClassLoader p4, org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator p5, org.codehaus.plexus.component.configurator.ConfigurationListener p6) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`
- `public java.lang.Object fromString(java.lang.String p0)`

---

## public class `org.codehaus.plexus.component.configurator.converters.basic.FloatConverter`
extends `org.codehaus.plexus.component.configurator.converters.basic.AbstractBasicConverter`  

**Constructors:**
- `public FloatConverter()`

**Methods:**
- `public boolean canConvert(java.lang.Class p0)`
- `public java.lang.Object fromString(java.lang.String p0)`

---

## public class `org.codehaus.plexus.component.configurator.converters.basic.IntConverter`
extends `org.codehaus.plexus.component.configurator.converters.basic.AbstractBasicConverter`  

**Constructors:**
- `public IntConverter()`

**Methods:**
- `public boolean canConvert(java.lang.Class p0)`
- `public java.lang.Object fromString(java.lang.String p0) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`

---

## public class `org.codehaus.plexus.component.configurator.converters.basic.LongConverter`
extends `org.codehaus.plexus.component.configurator.converters.basic.AbstractBasicConverter`  

**Constructors:**
- `public LongConverter()`

**Methods:**
- `public boolean canConvert(java.lang.Class p0)`
- `public java.lang.Object fromString(java.lang.String p0)`

---

## public class `org.codehaus.plexus.component.configurator.converters.basic.ShortConverter`
extends `org.codehaus.plexus.component.configurator.converters.basic.AbstractBasicConverter`  

**Constructors:**
- `public ShortConverter()`

**Methods:**
- `public boolean canConvert(java.lang.Class p0)`
- `public java.lang.Object fromString(java.lang.String p0)`

---

## public class `org.codehaus.plexus.component.configurator.converters.basic.StringBufferConverter`
extends `org.codehaus.plexus.component.configurator.converters.basic.AbstractBasicConverter`  

**Constructors:**
- `public StringBufferConverter()`

**Methods:**
- `public boolean canConvert(java.lang.Class p0)`
- `public java.lang.Object fromString(java.lang.String p0)`

---

## public class `org.codehaus.plexus.component.configurator.converters.basic.StringConverter`
extends `org.codehaus.plexus.component.configurator.converters.basic.AbstractBasicConverter`  

**Constructors:**
- `public StringConverter()`

**Methods:**
- `public boolean canConvert(java.lang.Class p0)`
- `public java.lang.Object fromString(java.lang.String p0)`

---

## public class `org.codehaus.plexus.component.configurator.converters.basic.UriConverter`
extends `org.codehaus.plexus.component.configurator.converters.basic.AbstractBasicConverter`  

**Constructors:**
- `public UriConverter()`

**Methods:**
- `public boolean canConvert(java.lang.Class p0)`
- `public java.lang.Object fromString(java.lang.String p0) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`

---

## public class `org.codehaus.plexus.component.configurator.converters.basic.UrlConverter`
extends `org.codehaus.plexus.component.configurator.converters.basic.AbstractBasicConverter`  

**Constructors:**
- `public UrlConverter()`

**Methods:**
- `public boolean canConvert(java.lang.Class p0)`
- `public java.lang.Object fromString(java.lang.String p0) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`

---

## public class `org.codehaus.plexus.component.configurator.converters.composite.ArrayConverter`
extends `org.codehaus.plexus.component.configurator.converters.AbstractConfigurationConverter`  

**Constructors:**
- `public ArrayConverter()`

**Methods:**
- `public boolean canConvert(java.lang.Class p0)`
- `public java.lang.Object fromConfiguration(org.codehaus.plexus.component.configurator.converters.lookup.ConverterLookup p0, org.codehaus.plexus.configuration.PlexusConfiguration p1, java.lang.Class p2, java.lang.Class p3, java.lang.ClassLoader p4, org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator p5, org.codehaus.plexus.component.configurator.ConfigurationListener p6) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`

---

## public class `org.codehaus.plexus.component.configurator.converters.composite.CollectionConverter`
extends `org.codehaus.plexus.component.configurator.converters.AbstractConfigurationConverter`  

**Constructors:**
- `public CollectionConverter()`

**Methods:**
- `public boolean canConvert(java.lang.Class p0)`
- `public java.lang.Object fromConfiguration(org.codehaus.plexus.component.configurator.converters.lookup.ConverterLookup p0, org.codehaus.plexus.configuration.PlexusConfiguration p1, java.lang.Class p2, java.lang.Class p3, java.lang.ClassLoader p4, org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator p5, org.codehaus.plexus.component.configurator.ConfigurationListener p6) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`
- `protected java.util.Collection getDefaultCollection(java.lang.Class p0)`

---

## public class `org.codehaus.plexus.component.configurator.converters.composite.MapConverter`
extends `org.codehaus.plexus.component.configurator.converters.AbstractConfigurationConverter`  

**Constructors:**
- `public MapConverter()`

**Methods:**
- `public boolean canConvert(java.lang.Class p0)`
- `public java.lang.Object fromConfiguration(org.codehaus.plexus.component.configurator.converters.lookup.ConverterLookup p0, org.codehaus.plexus.configuration.PlexusConfiguration p1, java.lang.Class p2, java.lang.Class p3, java.lang.ClassLoader p4, org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator p5, org.codehaus.plexus.component.configurator.ConfigurationListener p6) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`

---

## public class `org.codehaus.plexus.component.configurator.converters.composite.ObjectWithFieldsConverter`
extends `org.codehaus.plexus.component.configurator.converters.AbstractConfigurationConverter`  

**Constructors:**
- `public ObjectWithFieldsConverter()`

**Methods:**
- `public boolean canConvert(java.lang.Class p0)`
- `public java.lang.Object fromConfiguration(org.codehaus.plexus.component.configurator.converters.lookup.ConverterLookup p0, org.codehaus.plexus.configuration.PlexusConfiguration p1, java.lang.Class p2, java.lang.Class p3, java.lang.ClassLoader p4, org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator p5, org.codehaus.plexus.component.configurator.ConfigurationListener p6) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`
- `public void processConfiguration(org.codehaus.plexus.component.configurator.converters.lookup.ConverterLookup p0, java.lang.Object p1, java.lang.ClassLoader p2, org.codehaus.plexus.configuration.PlexusConfiguration p3) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`
- `public void processConfiguration(org.codehaus.plexus.component.configurator.converters.lookup.ConverterLookup p0, java.lang.Object p1, java.lang.ClassLoader p2, org.codehaus.plexus.configuration.PlexusConfiguration p3, org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator p4) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`
- `public void processConfiguration(org.codehaus.plexus.component.configurator.converters.lookup.ConverterLookup p0, java.lang.Object p1, java.lang.ClassLoader p2, org.codehaus.plexus.configuration.PlexusConfiguration p3, org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator p4, org.codehaus.plexus.component.configurator.ConfigurationListener p5) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`

---

## public class `org.codehaus.plexus.component.configurator.converters.composite.PlexusConfigurationConverter`
extends `org.codehaus.plexus.component.configurator.converters.AbstractConfigurationConverter`  

**Constructors:**
- `public PlexusConfigurationConverter()`

**Methods:**
- `public boolean canConvert(java.lang.Class p0)`
- `public java.lang.Object fromConfiguration(org.codehaus.plexus.component.configurator.converters.lookup.ConverterLookup p0, org.codehaus.plexus.configuration.PlexusConfiguration p1, java.lang.Class p2, java.lang.Class p3, java.lang.ClassLoader p4, org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator p5, org.codehaus.plexus.component.configurator.ConfigurationListener p6) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`

---

## public class `org.codehaus.plexus.component.configurator.converters.composite.PropertiesConverter`
extends `org.codehaus.plexus.component.configurator.converters.AbstractConfigurationConverter`  

**Constructors:**
- `public PropertiesConverter()`

**Methods:**
- `public boolean canConvert(java.lang.Class p0)`
- `public java.lang.Object fromConfiguration(org.codehaus.plexus.component.configurator.converters.lookup.ConverterLookup p0, org.codehaus.plexus.configuration.PlexusConfiguration p1, java.lang.Class p2, java.lang.Class p3, java.lang.ClassLoader p4, org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator p5, org.codehaus.plexus.component.configurator.ConfigurationListener p6) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`

---

## public abstract interface `org.codehaus.plexus.component.configurator.converters.lookup.ConverterLookup`

**Methods:**
- `public abstract org.codehaus.plexus.component.configurator.converters.ConfigurationConverter lookupConverterForType(java.lang.Class p0) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`
- `public abstract void registerConverter(org.codehaus.plexus.component.configurator.converters.ConfigurationConverter p0)`

---

## public class `org.codehaus.plexus.component.configurator.converters.lookup.DefaultConverterLookup`
implements `org.codehaus.plexus.component.configurator.converters.lookup.ConverterLookup`  

**Constructors:**
- `public DefaultConverterLookup()`

**Methods:**
- `public org.codehaus.plexus.component.configurator.converters.ConfigurationConverter lookupConverterForType(java.lang.Class p0) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`
- `public synchronized void registerConverter(org.codehaus.plexus.component.configurator.converters.ConfigurationConverter p0)`
- `protected void registerDefaultConverter(org.codehaus.plexus.component.configurator.converters.ConfigurationConverter p0)`

---

## public class `org.codehaus.plexus.component.configurator.converters.special.ClassRealmConverter`
extends `org.codehaus.plexus.component.configurator.converters.AbstractConfigurationConverter`  

**Constructors:**
- `public ClassRealmConverter(org.codehaus.classworlds.ClassRealm p0)`
- `public ClassRealmConverter(org.codehaus.plexus.classworlds.realm.ClassRealm p0)`

**Fields:**
- `public final static java.lang.String ROLE`

**Methods:**
- `public boolean canConvert(java.lang.Class p0)`
- `public java.lang.Object fromConfiguration(org.codehaus.plexus.component.configurator.converters.lookup.ConverterLookup p0, org.codehaus.plexus.configuration.PlexusConfiguration p1, java.lang.Class p2, java.lang.Class p3, java.lang.ClassLoader p4, org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator p5, org.codehaus.plexus.component.configurator.ConfigurationListener p6) throws org.codehaus.plexus.component.configurator.ComponentConfigurationException`
- `public void setClassRealm(org.codehaus.classworlds.ClassRealm p0)`
- `public void setClassRealm(org.codehaus.plexus.classworlds.realm.ClassRealm p0)`

---

## public class `org.codehaus.plexus.component.configurator.expression.DefaultExpressionEvaluator`
implements `org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator`  

**Constructors:**
- `public DefaultExpressionEvaluator()`

**Methods:**
- `public java.io.File alignToBaseDirectory(java.io.File p0)`
- `public java.lang.Object evaluate(java.lang.String p0)`

---

## public class `org.codehaus.plexus.component.configurator.expression.ExpressionEvaluationException`
extends `java.lang.Exception`  

**Constructors:**
- `public ExpressionEvaluationException(java.lang.String p0)`
- `public ExpressionEvaluationException(java.lang.String p0, java.lang.Throwable p1)`

---

## public abstract interface `org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator`

**Fields:**
- `public final static java.lang.String ROLE`

**Methods:**
- `public abstract java.io.File alignToBaseDirectory(java.io.File p0)`
- `public abstract java.lang.Object evaluate(java.lang.String p0) throws org.codehaus.plexus.component.configurator.expression.ExpressionEvaluationException`

---

## public abstract interface `org.codehaus.plexus.component.configurator.expression.TypeAwareExpressionEvaluator`
implements `org.codehaus.plexus.component.configurator.expression.ExpressionEvaluator`  

**Methods:**
- `public abstract java.lang.Object evaluate(java.lang.String p0, java.lang.Class p1) throws org.codehaus.plexus.component.configurator.expression.ExpressionEvaluationException`

---

## public abstract class `org.codehaus.plexus.component.discovery.AbstractResourceBasedComponentDiscoverer`
implements `org.codehaus.plexus.component.discovery.ComponentDiscoverer`  

**Constructors:**
- `public AbstractResourceBasedComponentDiscoverer()`

**Methods:**
- `protected abstract org.codehaus.plexus.component.repository.ComponentSetDescriptor createComponentDescriptors(java.io.Reader p0, java.lang.String p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2) throws org.codehaus.plexus.configuration.PlexusConfigurationException`
- `public java.util.List findComponents(org.codehaus.plexus.context.Context p0, org.codehaus.plexus.classworlds.realm.ClassRealm p1) throws org.codehaus.plexus.configuration.PlexusConfigurationException`
- `protected abstract java.lang.String getComponentDescriptorLocation()`

---

## public abstract interface `org.codehaus.plexus.component.discovery.AnnotationBasedComponentDiscoverer`
implements `org.codehaus.plexus.component.discovery.ComponentDiscoverer`  

---

## public abstract interface `org.codehaus.plexus.component.discovery.ComponentDiscoverer`

**Methods:**
- `public abstract java.util.List findComponents(org.codehaus.plexus.context.Context p0, org.codehaus.plexus.classworlds.realm.ClassRealm p1) throws org.codehaus.plexus.configuration.PlexusConfigurationException`

---

## public abstract interface `org.codehaus.plexus.component.discovery.ComponentDiscovererManager`

**Methods:**
- `public abstract void addComponentDiscoverer(org.codehaus.plexus.component.discovery.ComponentDiscoverer p0)`
- `public abstract void fireComponentDiscoveryEvent(org.codehaus.plexus.component.discovery.ComponentDiscoveryEvent p0)`
- `public abstract java.util.List getComponentDiscoverers()`
- `public abstract java.util.Map getComponentDiscoveryListeners()`
- `public abstract void registerComponentDiscoveryListener(org.codehaus.plexus.component.discovery.ComponentDiscoveryListener p0)`
- `public abstract void removeComponentDiscoveryListener(org.codehaus.plexus.component.discovery.ComponentDiscoveryListener p0)`

---

## public class `org.codehaus.plexus.component.discovery.ComponentDiscoveryEvent`

**Constructors:**
- `public ComponentDiscoveryEvent(org.codehaus.plexus.component.repository.ComponentSetDescriptor p0)`
- `public ComponentDiscoveryEvent(org.codehaus.plexus.component.repository.ComponentSetDescriptor p0, java.lang.Object p1)`

**Methods:**
- `public org.codehaus.plexus.component.repository.ComponentSetDescriptor getComponentSetDescriptor()`
- `public java.lang.Object getData()`

---

## public abstract interface `org.codehaus.plexus.component.discovery.ComponentDiscoveryListener`

**Methods:**
- `public abstract void componentDiscovered(org.codehaus.plexus.component.discovery.ComponentDiscoveryEvent p0)`

---

## public class `org.codehaus.plexus.component.discovery.DefaultComponentDiscoverer`
extends `org.codehaus.plexus.component.discovery.AbstractResourceBasedComponentDiscoverer`  

**Constructors:**
- `public DefaultComponentDiscoverer()`

**Methods:**
- `public org.codehaus.plexus.component.repository.ComponentSetDescriptor createComponentDescriptors(java.io.Reader p0, java.lang.String p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2) throws org.codehaus.plexus.configuration.PlexusConfigurationException`
- `public java.lang.String getComponentDescriptorLocation()`

---

## public class `org.codehaus.plexus.component.discovery.DefaultComponentDiscovererManager`
implements `org.codehaus.plexus.component.discovery.ComponentDiscovererManager`  

**Constructors:**
- `public DefaultComponentDiscovererManager()`

**Methods:**
- `public synchronized void addComponentDiscoverer(org.codehaus.plexus.component.discovery.ComponentDiscoverer p0)`
- `public void fireComponentDiscoveryEvent(org.codehaus.plexus.component.discovery.ComponentDiscoveryEvent p0)`
- `public synchronized java.util.List getComponentDiscoverers()`
- `public synchronized java.util.Map getComponentDiscoveryListeners()`
- `public synchronized void registerComponentDiscoveryListener(org.codehaus.plexus.component.discovery.ComponentDiscoveryListener p0)`
- `public synchronized void removeComponentDiscoveryListener(org.codehaus.plexus.component.discovery.ComponentDiscoveryListener p0)`

---

## public class `org.codehaus.plexus.component.discovery.DiscoveryListenerDescriptor`

**Constructors:**
- `public DiscoveryListenerDescriptor()`

**Methods:**
- `public java.lang.String getRole()`
- `public java.lang.String getRoleHint()`

---

## public class `org.codehaus.plexus.component.discovery.PlexusXmlComponentDiscoverer`
extends `org.codehaus.plexus.component.discovery.AbstractResourceBasedComponentDiscoverer`  

**Constructors:**
- `public PlexusXmlComponentDiscoverer()`

**Methods:**
- `protected org.codehaus.plexus.component.repository.ComponentSetDescriptor createComponentDescriptors(java.io.Reader p0, java.lang.String p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2) throws org.codehaus.plexus.configuration.PlexusConfigurationException`
- `public java.lang.String getComponentDescriptorLocation()`

---

## public abstract interface `org.codehaus.plexus.component.discovery.ResourceBasedComponentDiscoverer`
implements `org.codehaus.plexus.component.discovery.ComponentDiscoverer`  

**Methods:**
- `public abstract java.lang.String getComponentDescriptorLocation()`

---

## public abstract class `org.codehaus.plexus.component.factory.AbstractComponentFactory`
implements `org.codehaus.plexus.component.factory.ComponentFactory`  

**Constructors:**
- `public AbstractComponentFactory()`

**Methods:**
- `protected java.lang.Object newInstance(org.codehaus.plexus.component.repository.ComponentDescriptor p0, org.codehaus.classworlds.ClassRealm p1, org.codehaus.plexus.PlexusContainer p2) throws org.codehaus.plexus.component.factory.ComponentInstantiationException`
- `public java.lang.Object newInstance(org.codehaus.plexus.component.repository.ComponentDescriptor p0, org.codehaus.plexus.classworlds.realm.ClassRealm p1, org.codehaus.plexus.PlexusContainer p2) throws org.codehaus.plexus.component.factory.ComponentInstantiationException`

---

## public abstract interface `org.codehaus.plexus.component.factory.ComponentFactory`

**Fields:**
- `public final static java.lang.String ROLE`

**Methods:**
- `public abstract java.lang.String getId()`
- `public abstract java.lang.Object newInstance(org.codehaus.plexus.component.repository.ComponentDescriptor p0, org.codehaus.plexus.classworlds.realm.ClassRealm p1, org.codehaus.plexus.PlexusContainer p2) throws org.codehaus.plexus.component.factory.ComponentInstantiationException`

---

## public abstract interface `org.codehaus.plexus.component.factory.ComponentFactoryManager`

**Methods:**
- `public abstract org.codehaus.plexus.component.factory.ComponentFactory findComponentFactory(java.lang.String p0) throws org.codehaus.plexus.component.factory.UndefinedComponentFactoryException`

---

## public class `org.codehaus.plexus.component.factory.ComponentInstantiationException`
extends `java.lang.Exception`  

**Constructors:**
- `public ComponentInstantiationException(java.lang.String p0)`
- `public ComponentInstantiationException(java.lang.String p0, java.lang.Throwable p1)`
- `public ComponentInstantiationException(java.lang.Throwable p0)`

---

## public class `org.codehaus.plexus.component.factory.DefaultComponentFactoryManager`
implements `org.codehaus.plexus.component.factory.ComponentFactoryManager`, `org.codehaus.plexus.personality.plexus.lifecycle.phase.Contextualizable`  

**Constructors:**
- `public DefaultComponentFactoryManager()`

**Methods:**
- `public void contextualize(org.codehaus.plexus.context.Context p0) throws org.codehaus.plexus.context.ContextException`
- `public org.codehaus.plexus.component.factory.ComponentFactory findComponentFactory(java.lang.String p0) throws org.codehaus.plexus.component.factory.UndefinedComponentFactoryException`

---

## public class `org.codehaus.plexus.component.factory.UndefinedComponentFactoryException`
extends `java.lang.Exception`  

**Constructors:**
- `public UndefinedComponentFactoryException(java.lang.String p0)`
- `public UndefinedComponentFactoryException(java.lang.String p0, java.lang.Throwable p1)`
- `public UndefinedComponentFactoryException(java.lang.Throwable p0)`

---

## public class `org.codehaus.plexus.component.factory.java.JavaComponentFactory`
extends `org.codehaus.plexus.component.factory.AbstractComponentFactory`  

**Constructors:**
- `public JavaComponentFactory()`

**Methods:**
- `public java.lang.String getId()`
- `public java.lang.Object newInstance(org.codehaus.plexus.component.repository.ComponentDescriptor p0, org.codehaus.plexus.classworlds.realm.ClassRealm p1, org.codehaus.plexus.PlexusContainer p2) throws org.codehaus.plexus.component.factory.ComponentInstantiationException`

---

## public abstract class `org.codehaus.plexus.component.manager.AbstractComponentManager`<T extends java.lang.Object>
implements `org.codehaus.plexus.component.manager.ComponentManager<T>`  

**Constructors:**
- `public AbstractComponentManager(org.codehaus.plexus.MutablePlexusContainer p0, org.codehaus.plexus.lifecycle.LifecycleHandler p1, org.codehaus.plexus.component.repository.ComponentDescriptor p2, java.lang.String p3, java.lang.String p4)`

**Fields:**
- `protected final org.codehaus.plexus.component.builder.ComponentBuilder builder`
- `protected final java.util.Map componentContextRealms`
- `protected final org.codehaus.plexus.component.repository.ComponentDescriptor componentDescriptor`
- `protected final org.codehaus.plexus.MutablePlexusContainer container`

**Methods:**
- `protected boolean connected()`
- `protected T createComponentInstance() throws org.codehaus.plexus.component.factory.ComponentInstantiationException, org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`
- `protected void decrementConnectionCount()`
- `public void dissociateComponentRealm(org.codehaus.plexus.classworlds.realm.ClassRealm p0) throws org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`
- `protected void endComponentLifecycle(java.lang.Object p0) throws org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`
- `public org.codehaus.plexus.component.repository.ComponentDescriptor getComponentDescriptor()`
- `public int getConnections()`
- `public org.codehaus.plexus.MutablePlexusContainer getContainer()`
- `public org.codehaus.plexus.lifecycle.LifecycleHandler getLifecycleHandler()`
- `public org.codehaus.plexus.logging.Logger getLogger()`
- `public org.codehaus.plexus.classworlds.realm.ClassRealm getRealm()`
- `public java.lang.String getRole()`
- `public java.lang.String getRoleHint()`
- `public long getStartId()`
- `public java.lang.Class getType()`
- `protected void incrementConnectionCount()`
- `public void start(java.lang.Object p0) throws org.codehaus.plexus.personality.plexus.lifecycle.phase.PhaseExecutionException`

---

## public abstract interface `org.codehaus.plexus.component.manager.ComponentManager`<T extends java.lang.Object>

**Fields:**
- `public final static java.util.concurrent.atomic.AtomicLong NEXT_START_ID`
- `public final static java.lang.String ROLE`

**Methods:**
- `public abstract void dispose() throws org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`
- `public abstract void dissociateComponentRealm(org.codehaus.plexus.classworlds.realm.ClassRealm p0) throws org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`
- `public abstract T getComponent() throws org.codehaus.plexus.component.factory.ComponentInstantiationException, org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`
- `public abstract org.codehaus.plexus.component.repository.ComponentDescriptor getComponentDescriptor()`
- `public abstract int getConnections()`
- `public abstract org.codehaus.plexus.MutablePlexusContainer getContainer()`
- `public abstract org.codehaus.plexus.lifecycle.LifecycleHandler getLifecycleHandler()`
- `public abstract org.codehaus.plexus.classworlds.realm.ClassRealm getRealm()`
- `public abstract java.lang.String getRole()`
- `public abstract java.lang.String getRoleHint()`
- `public abstract long getStartId()`
- `public abstract java.lang.Class getType()`
- `public abstract void release(java.lang.Object p0) throws org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`
- `public abstract void start(java.lang.Object p0) throws org.codehaus.plexus.personality.plexus.lifecycle.phase.PhaseExecutionException`

---

## public abstract interface `org.codehaus.plexus.component.manager.ComponentManagerFactory`

**Methods:**
- `public abstract <T extends java.lang.Object> org.codehaus.plexus.component.manager.ComponentManager createComponentManager(org.codehaus.plexus.MutablePlexusContainer p0, org.codehaus.plexus.lifecycle.LifecycleHandler p1, org.codehaus.plexus.component.repository.ComponentDescriptor p2, java.lang.String p3, java.lang.String p4)`
- `public abstract java.lang.String getId()`

---

## public class `org.codehaus.plexus.component.manager.PerLookupComponentManager`<T extends java.lang.Object>
extends `org.codehaus.plexus.component.manager.AbstractComponentManager`  

**Constructors:**
- `public PerLookupComponentManager(org.codehaus.plexus.MutablePlexusContainer p0, org.codehaus.plexus.lifecycle.LifecycleHandler p1, org.codehaus.plexus.component.repository.ComponentDescriptor p2, java.lang.String p3, java.lang.String p4)`

**Methods:**
- `public void dispose()`
- `public T getComponent() throws org.codehaus.plexus.component.factory.ComponentInstantiationException, org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`
- `public void release(java.lang.Object p0) throws org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`

---

## public class `org.codehaus.plexus.component.manager.PerLookupComponentManagerFactory`
implements `org.codehaus.plexus.component.manager.ComponentManagerFactory`  

**Constructors:**
- `public PerLookupComponentManagerFactory()`

**Methods:**
- `public org.codehaus.plexus.component.manager.ComponentManager createComponentManager(org.codehaus.plexus.MutablePlexusContainer p0, org.codehaus.plexus.lifecycle.LifecycleHandler p1, org.codehaus.plexus.component.repository.ComponentDescriptor p2, java.lang.String p3, java.lang.String p4)`
- `public java.lang.String getId()`

---

## public class `org.codehaus.plexus.component.manager.SingletonComponentManager`<T extends java.lang.Object>
extends `org.codehaus.plexus.component.manager.AbstractComponentManager`  

**Constructors:**
- `public SingletonComponentManager(org.codehaus.plexus.MutablePlexusContainer p0, org.codehaus.plexus.lifecycle.LifecycleHandler p1, org.codehaus.plexus.component.repository.ComponentDescriptor p2, java.lang.String p3, java.lang.String p4)`

**Methods:**
- `public synchronized void dispose() throws org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`
- `public synchronized T getComponent() throws org.codehaus.plexus.component.factory.ComponentInstantiationException, org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`
- `public synchronized void release(java.lang.Object p0) throws org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`

---

## public class `org.codehaus.plexus.component.manager.SingletonComponentManagerFactory`
implements `org.codehaus.plexus.component.manager.ComponentManagerFactory`  

**Constructors:**
- `public SingletonComponentManagerFactory()`

**Methods:**
- `public org.codehaus.plexus.component.manager.ComponentManager createComponentManager(org.codehaus.plexus.MutablePlexusContainer p0, org.codehaus.plexus.lifecycle.LifecycleHandler p1, org.codehaus.plexus.component.repository.ComponentDescriptor p2, java.lang.String p3, java.lang.String p4)`
- `public java.lang.String getId()`

---

## public class `org.codehaus.plexus.component.manager.UndefinedComponentManagerException`
extends `java.lang.Exception`  

**Constructors:**
- `public UndefinedComponentManagerException(java.lang.String p0)`

---

## public class `org.codehaus.plexus.component.repository.ComponentDependency`

**Constructors:**
- `public ComponentDependency()`

**Methods:**
- `public java.lang.String getArtifactId()`
- `public java.lang.String getGroupId()`
- `public java.lang.String getType()`
- `public java.lang.String getVersion()`
- `public void setArtifactId(java.lang.String p0)`
- `public void setGroupId(java.lang.String p0)`
- `public void setType(java.lang.String p0)`
- `public void setVersion(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public class `org.codehaus.plexus.component.repository.ComponentDescriptor`<T extends java.lang.Object>

**Constructors:**
- `public ComponentDescriptor()`
- `public ComponentDescriptor(java.lang.Class p0, org.codehaus.plexus.classworlds.realm.ClassRealm p1)`

**Methods:**
- `public void addRequirement(org.codehaus.plexus.component.repository.ComponentRequirement p0)`
- `public void addRequirement(org.codehaus.plexus.component.repository.ComponentRequirement... p0)`
- `public void addRequirements(java.util.List p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getAlias()`
- `public java.lang.String getComponentComposer()`
- `public java.lang.String getComponentConfigurator()`
- `public java.lang.String getComponentFactory()`
- `public java.lang.String getComponentProfile()`
- `public org.codehaus.plexus.component.repository.ComponentSetDescriptor getComponentSetDescriptor()`
- `public java.lang.String getComponentType()`
- `public org.codehaus.plexus.configuration.PlexusConfiguration getConfiguration()`
- `public java.lang.String getDescription()`
- `public java.lang.String getHumanReadableKey()`
- `public java.lang.String getImplementation()`
- `public java.lang.Class getImplementationClass()`
- `public java.lang.String getInstantiationStrategy()`
- `public java.lang.String getLifecycleHandler()`
- `public org.codehaus.plexus.classworlds.realm.ClassRealm getRealm()`
- `public java.util.List getRequirements()`
- `public java.lang.String getRole()`
- `public java.lang.Class getRoleClass()`
- `public java.lang.String getRoleHint()`
- `public java.lang.String getSource()`
- `public java.lang.String getVersion()`
- `public boolean hasConfiguration()`
- `public int hashCode()`
- `public boolean isIsolatedRealm()`
- `public void removeRequirement(org.codehaus.plexus.component.repository.ComponentRequirement... p0)`
- `public void removeRequirements(java.util.List p0)`
- `public void setAlias(java.lang.String p0)`
- `public void setComponentComposer(java.lang.String p0)`
- `public void setComponentConfigurator(java.lang.String p0)`
- `public void setComponentFactory(java.lang.String p0)`
- `public void setComponentProfile(java.lang.String p0)`
- `public void setComponentSetDescriptor(org.codehaus.plexus.component.repository.ComponentSetDescriptor p0)`
- `public void setComponentType(java.lang.String p0)`
- `public void setConfiguration(org.codehaus.plexus.configuration.PlexusConfiguration p0)`
- `public void setDescription(java.lang.String p0)`
- `public void setImplementation(java.lang.String p0)`
- `public void setImplementationClass(java.lang.Class p0)`
- `public void setInstantiationStrategy(java.lang.String p0)`
- `public void setIsolatedRealm(boolean p0)`
- `public void setLifecycleHandler(java.lang.String p0)`
- `public void setRealm(org.codehaus.plexus.classworlds.realm.ClassRealm p0)`
- `public void setRole(java.lang.String p0)`
- `public void setRoleClass(java.lang.Class p0)`
- `public void setRoleHint(java.lang.String p0)`
- `public void setSource(java.lang.String p0)`
- `public void setVersion(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public abstract interface `org.codehaus.plexus.component.repository.ComponentRepository`

**Methods:**
- `public abstract void addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor p0) throws org.codehaus.plexus.component.composition.CycleDetectedInComponentGraphException`
- `public abstract <T extends java.lang.Object> org.codehaus.plexus.component.repository.ComponentDescriptor getComponentDescriptor(java.lang.Class p0, java.lang.String p1, java.lang.String p2)`
- `public abstract org.codehaus.plexus.component.repository.ComponentDescriptor getComponentDescriptor(java.lang.String p0, java.lang.String p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2)`
- `public abstract <T extends java.lang.Object> java.util.List getComponentDescriptorList(java.lang.Class p0, java.lang.String p1)`
- `public abstract <T extends java.lang.Object> java.util.Map getComponentDescriptorMap(java.lang.Class p0, java.lang.String p1)`
- `public abstract void removeComponentRealm(org.codehaus.plexus.classworlds.realm.ClassRealm p0)`

---

## public class `org.codehaus.plexus.component.repository.ComponentRequirement`

**Constructors:**
- `public ComponentRequirement()`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getFieldMappingType()`
- `public java.lang.String getFieldName()`
- `public java.lang.String getHumanReadableKey()`
- `public java.lang.String getRole()`
- `public java.lang.String getRoleHint()`
- `public int hashCode()`
- `public boolean isOptional()`
- `public void setFieldMappingType(java.lang.String p0)`
- `public void setFieldName(java.lang.String p0)`
- `public void setOptional(boolean p0)`
- `public void setRole(java.lang.String p0)`
- `public void setRoleHint(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public class `org.codehaus.plexus.component.repository.ComponentRequirementList`
extends `org.codehaus.plexus.component.repository.ComponentRequirement`  

**Constructors:**
- `public ComponentRequirementList()`

**Methods:**
- `public java.lang.String getRoleHint()`
- `public java.util.List getRoleHints()`
- `public void setRoleHints(java.util.List p0)`

---

## public class `org.codehaus.plexus.component.repository.ComponentSetDescriptor`

**Constructors:**
- `public ComponentSetDescriptor()`

**Methods:**
- `public void addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor p0)`
- `public void addDependency(org.codehaus.plexus.component.repository.ComponentDependency p0)`
- `public java.util.List getComponents()`
- `public java.util.List getDependencies()`
- `public java.lang.String getId()`
- `public java.lang.String getSource()`
- `public boolean isIsolatedRealm()`
- `public void setComponents(java.util.List p0)`
- `public void setDependencies(java.util.List p0)`
- `public void setId(java.lang.String p0)`
- `public void setIsolatedRealm(boolean p0)`
- `public void setSource(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public class `org.codehaus.plexus.component.repository.DefaultComponentRepository`
extends `org.codehaus.plexus.logging.AbstractLogEnabled`  
implements `org.codehaus.plexus.component.repository.ComponentRepository`  

**Constructors:**
- `public DefaultComponentRepository()`

**Methods:**
- `public void addComponentDescriptor(org.codehaus.plexus.component.repository.ComponentDescriptor p0) throws org.codehaus.plexus.component.composition.CycleDetectedInComponentGraphException`
- `public <T extends java.lang.Object> org.codehaus.plexus.component.repository.ComponentDescriptor getComponentDescriptor(java.lang.Class p0, java.lang.String p1, java.lang.String p2)`
- `public org.codehaus.plexus.component.repository.ComponentDescriptor getComponentDescriptor(java.lang.String p0, java.lang.String p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2)`
- `public <T extends java.lang.Object> java.util.List getComponentDescriptorList(java.lang.Class p0, java.lang.String p1)`
- `public <T extends java.lang.Object> java.util.Map getComponentDescriptorMap(java.lang.Class p0, java.lang.String p1)`
- `public void removeComponentRealm(org.codehaus.plexus.classworlds.realm.ClassRealm p0)`

---

## public class `org.codehaus.plexus.component.repository.exception.ComponentConfigurationException`
extends `java.lang.Exception`  

**Constructors:**
- `public ComponentConfigurationException(java.lang.String p0)`
- `public ComponentConfigurationException(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `org.codehaus.plexus.component.repository.exception.ComponentDescriptorUnmarshallingException`
extends `java.lang.Exception`  

**Constructors:**
- `public ComponentDescriptorUnmarshallingException(java.lang.String p0)`
- `public ComponentDescriptorUnmarshallingException(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `org.codehaus.plexus.component.repository.exception.ComponentImplementationNotFoundException`
extends `java.lang.Exception`  

**Constructors:**
- `public ComponentImplementationNotFoundException(java.lang.String p0)`
- `public ComponentImplementationNotFoundException(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`
extends `java.lang.Exception`  

**Constructors:**
- `public ComponentLifecycleException(java.lang.String p0)`
- `public ComponentLifecycleException(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `org.codehaus.plexus.component.repository.exception.ComponentLookupException`
extends `java.lang.Exception`  

**Constructors:**
- `public ComponentLookupException(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public ComponentLookupException(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.Throwable p3)`
- `public ComponentLookupException(java.lang.String p0, java.lang.String p1, java.lang.String p2, org.codehaus.plexus.classworlds.realm.ClassRealm p3)`
- `public ComponentLookupException(java.lang.String p0, java.lang.String p1, java.lang.String p2, org.codehaus.plexus.classworlds.realm.ClassRealm p3, java.lang.Throwable p4)`

**Methods:**
- `public java.lang.String getMessage()`

---

## public class `org.codehaus.plexus.component.repository.exception.ComponentLookupRuntimeException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public ComponentLookupRuntimeException(org.codehaus.plexus.component.repository.exception.ComponentLookupException p0)`

**Methods:**
- `public java.lang.String getMessage()`

---

## public class `org.codehaus.plexus.component.repository.exception.ComponentManagerImplementationNotFoundException`
extends `java.lang.Exception`  

**Constructors:**
- `public ComponentManagerImplementationNotFoundException(java.lang.String p0)`
- `public ComponentManagerImplementationNotFoundException(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `org.codehaus.plexus.component.repository.exception.ComponentProfileException`
extends `java.lang.Exception`  

**Constructors:**
- `public ComponentProfileException(java.lang.String p0)`
- `public ComponentProfileException(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `org.codehaus.plexus.component.repository.exception.ComponentRepositoryException`
extends `java.lang.Exception`  

**Constructors:**
- `public ComponentRepositoryException(java.lang.String p0)`
- `public ComponentRepositoryException(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `org.codehaus.plexus.component.repository.io.PlexusTools`

**Constructors:**
- `public PlexusTools()`

**Methods:**
- `public static org.codehaus.plexus.component.repository.ComponentDescriptor buildComponentDescriptor(java.lang.String p0, org.codehaus.plexus.classworlds.realm.ClassRealm p1) throws org.codehaus.plexus.configuration.PlexusConfigurationException`
- `public static org.codehaus.plexus.component.repository.ComponentDescriptor buildComponentDescriptor(org.codehaus.plexus.configuration.PlexusConfiguration p0) throws org.codehaus.plexus.configuration.PlexusConfigurationException`
- `public static org.codehaus.plexus.component.repository.ComponentDescriptor buildComponentDescriptor(org.codehaus.plexus.configuration.PlexusConfiguration p0, org.codehaus.plexus.classworlds.realm.ClassRealm p1) throws org.codehaus.plexus.configuration.PlexusConfigurationException`
- `public static org.codehaus.plexus.component.repository.ComponentSetDescriptor buildComponentSet(org.codehaus.plexus.configuration.PlexusConfiguration p0) throws org.codehaus.plexus.configuration.PlexusConfigurationException`
- `public static org.codehaus.plexus.component.repository.ComponentSetDescriptor buildComponentSet(org.codehaus.plexus.configuration.PlexusConfiguration p0, org.codehaus.plexus.classworlds.realm.ClassRealm p1) throws org.codehaus.plexus.configuration.PlexusConfigurationException`
- `public static org.codehaus.plexus.configuration.PlexusConfiguration buildConfiguration(java.lang.String p0) throws org.codehaus.plexus.configuration.PlexusConfigurationException`
- `public static org.codehaus.plexus.configuration.PlexusConfiguration buildConfiguration(java.lang.String p0, java.io.Reader p1) throws org.codehaus.plexus.configuration.PlexusConfigurationException`
- `public static void writeConfiguration(java.io.PrintStream p0, org.codehaus.plexus.configuration.PlexusConfiguration p1) throws org.codehaus.plexus.configuration.PlexusConfigurationException`

---

## public class `org.codehaus.plexus.configuration.DefaultPlexusConfiguration`
implements `org.codehaus.plexus.configuration.PlexusConfiguration`  

**Constructors:**
- `protected DefaultPlexusConfiguration()`
- `protected DefaultPlexusConfiguration(java.lang.String p0)`
- `protected DefaultPlexusConfiguration(java.lang.String p0, java.lang.String p1)`

**Methods:**
- `public org.codehaus.plexus.configuration.PlexusConfiguration addChild(java.lang.String p0)`
- `public org.codehaus.plexus.configuration.PlexusConfiguration addChild(java.lang.String p0, java.lang.String p1)`
- `public void addChild(org.codehaus.plexus.configuration.PlexusConfiguration p0)`
- `public java.lang.String getAttribute(java.lang.String p0)`
- `public java.lang.String getAttribute(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String[] getAttributeNames()`
- `public org.codehaus.plexus.configuration.PlexusConfiguration getChild(int p0)`
- `public org.codehaus.plexus.configuration.PlexusConfiguration getChild(java.lang.String p0)`
- `public org.codehaus.plexus.configuration.PlexusConfiguration getChild(java.lang.String p0, boolean p1)`
- `public int getChildCount()`
- `public org.codehaus.plexus.configuration.PlexusConfiguration[] getChildren()`
- `public org.codehaus.plexus.configuration.PlexusConfiguration[] getChildren(java.lang.String p0)`
- `public java.lang.String getName()`
- `public java.lang.String getValue()`
- `public java.lang.String getValue(java.lang.String p0)`
- `public void setAttribute(java.lang.String p0, java.lang.String p1)`
- `public void setName(java.lang.String p0)`
- `public void setValue(java.lang.String p0)`
- `public org.codehaus.plexus.configuration.PlexusConfiguration setValueAndGetSelf(java.lang.String p0)`

---

## public class `org.codehaus.plexus.configuration.PlexusComponentDescriptorMerger`

**Constructors:**
- `public PlexusComponentDescriptorMerger()`

**Methods:**
- `public static void merge(org.codehaus.plexus.component.repository.ComponentDescriptor p0, org.codehaus.plexus.component.repository.ComponentDescriptor p1)`

---

## public abstract interface `org.codehaus.plexus.configuration.PlexusConfiguration`

**Methods:**
- `public abstract org.codehaus.plexus.configuration.PlexusConfiguration addChild(java.lang.String p0)`
- `public abstract org.codehaus.plexus.configuration.PlexusConfiguration addChild(java.lang.String p0, java.lang.String p1)`
- `public abstract void addChild(org.codehaus.plexus.configuration.PlexusConfiguration p0)`
- `public abstract java.lang.String getAttribute(java.lang.String p0) throws org.codehaus.plexus.configuration.PlexusConfigurationException`
- `public abstract java.lang.String getAttribute(java.lang.String p0, java.lang.String p1)`
- `public abstract java.lang.String[] getAttributeNames()`
- `public abstract org.codehaus.plexus.configuration.PlexusConfiguration getChild(int p0)`
- `public abstract org.codehaus.plexus.configuration.PlexusConfiguration getChild(java.lang.String p0)`
- `public abstract org.codehaus.plexus.configuration.PlexusConfiguration getChild(java.lang.String p0, boolean p1)`
- `public abstract int getChildCount()`
- `public abstract org.codehaus.plexus.configuration.PlexusConfiguration[] getChildren()`
- `public abstract org.codehaus.plexus.configuration.PlexusConfiguration[] getChildren(java.lang.String p0)`
- `public abstract java.lang.String getName()`
- `public abstract java.lang.String getValue() throws org.codehaus.plexus.configuration.PlexusConfigurationException`
- `public abstract java.lang.String getValue(java.lang.String p0)`
- `public abstract void setAttribute(java.lang.String p0, java.lang.String p1)`
- `public abstract void setName(java.lang.String p0)`
- `public abstract void setValue(java.lang.String p0)`
- `public abstract org.codehaus.plexus.configuration.PlexusConfiguration setValueAndGetSelf(java.lang.String p0)`

---

## public class `org.codehaus.plexus.configuration.PlexusConfigurationException`
extends `java.lang.Exception`  

**Constructors:**
- `public PlexusConfigurationException(java.lang.String p0)`
- `public PlexusConfigurationException(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `org.codehaus.plexus.configuration.PlexusConfigurationMerger`

**Constructors:**
- `public PlexusConfigurationMerger()`

**Methods:**
- `public static org.codehaus.plexus.configuration.PlexusConfiguration merge(org.codehaus.plexus.configuration.PlexusConfiguration p0, org.codehaus.plexus.configuration.PlexusConfiguration p1)`

---

## public class `org.codehaus.plexus.configuration.PlexusConfigurationResourceException`
extends `java.lang.Exception`  

**Constructors:**
- `public PlexusConfigurationResourceException(java.lang.String p0)`

---

## public abstract interface `org.codehaus.plexus.configuration.io.PlexusConfigurationReader`

**Methods:**
- `public abstract org.codehaus.plexus.configuration.PlexusConfiguration read(java.io.InputStream p0) throws java.io.IOException, org.codehaus.plexus.configuration.PlexusConfigurationException`
- `public abstract org.codehaus.plexus.configuration.PlexusConfiguration read(java.io.Reader p0) throws java.io.IOException, org.codehaus.plexus.configuration.PlexusConfigurationException`

---

## public abstract interface `org.codehaus.plexus.configuration.io.PlexusConfigurationWriter`

**Methods:**
- `public abstract void write(java.io.OutputStream p0, org.codehaus.plexus.configuration.PlexusConfiguration p1) throws java.io.IOException`
- `public abstract void write(java.io.Writer p0, org.codehaus.plexus.configuration.PlexusConfiguration p1) throws java.io.IOException`

---

## public class `org.codehaus.plexus.configuration.io.XmlPlexusConfigurationReader`
implements `org.codehaus.plexus.configuration.io.PlexusConfigurationReader`  

**Constructors:**
- `public XmlPlexusConfigurationReader()`

**Methods:**
- `public org.codehaus.plexus.configuration.PlexusConfiguration read(java.io.InputStream p0) throws java.io.IOException, org.codehaus.plexus.configuration.PlexusConfigurationException`
- `public org.codehaus.plexus.configuration.PlexusConfiguration read(java.io.Reader p0) throws java.io.IOException, org.codehaus.plexus.configuration.PlexusConfigurationException`

---

## public class `org.codehaus.plexus.configuration.io.XmlPlexusConfigurationWriter`
implements `org.codehaus.plexus.configuration.io.PlexusConfigurationWriter`  

**Constructors:**
- `public XmlPlexusConfigurationWriter()`

**Methods:**
- `public void write(java.io.OutputStream p0, org.codehaus.plexus.configuration.PlexusConfiguration p1) throws java.io.IOException`
- `public void write(java.io.Writer p0, org.codehaus.plexus.configuration.PlexusConfiguration p1) throws java.io.IOException`

---

## public class `org.codehaus.plexus.configuration.source.ChainedConfigurationSource`
implements `org.codehaus.plexus.configuration.source.ConfigurationSource`  

**Constructors:**
- `public ChainedConfigurationSource(java.util.List p0)`

**Methods:**
- `public org.codehaus.plexus.configuration.PlexusConfiguration getConfiguration(org.codehaus.plexus.component.repository.ComponentDescriptor p0)`
- `public java.util.List getConfigurationSources()`

---

## public abstract interface `org.codehaus.plexus.configuration.source.ConfigurationSource`

**Fields:**
- `public final static java.lang.String ROLE`

**Methods:**
- `public abstract org.codehaus.plexus.configuration.PlexusConfiguration getConfiguration(org.codehaus.plexus.component.repository.ComponentDescriptor p0)`

---

## public class `org.codehaus.plexus.configuration.source.ContainerConfigurationSource`
implements `org.codehaus.plexus.configuration.source.ConfigurationSource`  

**Constructors:**
- `public ContainerConfigurationSource()`

**Methods:**
- `public org.codehaus.plexus.configuration.PlexusConfiguration getConfiguration(org.codehaus.plexus.component.repository.ComponentDescriptor p0)`

---

## public class `org.codehaus.plexus.configuration.xml.XmlPlexusConfiguration`
extends `org.codehaus.plexus.configuration.DefaultPlexusConfiguration`  

**Constructors:**
- `public XmlPlexusConfiguration()`
- `public XmlPlexusConfiguration(java.lang.String p0)`
- `public XmlPlexusConfiguration(java.lang.String p0, java.lang.String p1)`
- `public XmlPlexusConfiguration(org.codehaus.plexus.util.xml.Xpp3Dom p0)`

**Methods:**
- `public java.lang.String toString()`

---

## public abstract class `org.codehaus.plexus.container.initialization.AbstractContainerInitializationPhase`
implements `org.codehaus.plexus.container.initialization.ContainerInitializationPhase`  

**Constructors:**
- `public AbstractContainerInitializationPhase()`

---

## public abstract class `org.codehaus.plexus.container.initialization.AbstractCoreComponentInitializationPhase`
extends `org.codehaus.plexus.container.initialization.AbstractContainerInitializationPhase`  

**Constructors:**
- `public AbstractCoreComponentInitializationPhase()`

**Methods:**
- `public void execute(org.codehaus.plexus.container.initialization.ContainerInitializationContext p0) throws org.codehaus.plexus.container.initialization.ContainerInitializationException`
- `protected abstract void initializeCoreComponent(org.codehaus.plexus.container.initialization.ContainerInitializationContext p0) throws org.codehaus.plexus.container.initialization.ContainerInitializationException`

---

## public class `org.codehaus.plexus.container.initialization.ContainerInitializationContext`

**Constructors:**
- `public ContainerInitializationContext(org.codehaus.plexus.DefaultPlexusContainer p0, org.codehaus.plexus.classworlds.ClassWorld p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2, org.codehaus.plexus.configuration.PlexusConfiguration p3, org.codehaus.plexus.ContainerConfiguration p4)`

**Methods:**
- `public org.codehaus.plexus.classworlds.ClassWorld getClassWorld()`
- `public org.codehaus.plexus.DefaultPlexusContainer getContainer()`
- `public org.codehaus.plexus.ContainerConfiguration getContainerConfiguration()`
- `public org.codehaus.plexus.classworlds.realm.ClassRealm getContainerRealm()`
- `public org.codehaus.plexus.configuration.PlexusConfiguration getContainerXmlConfiguration()`

---

## public class `org.codehaus.plexus.container.initialization.ContainerInitializationException`
extends `java.lang.Exception`  

**Constructors:**
- `public ContainerInitializationException(java.lang.String p0)`
- `public ContainerInitializationException(java.lang.String p0, java.lang.Throwable p1)`
- `public ContainerInitializationException(java.lang.Throwable p0)`

---

## public abstract interface `org.codehaus.plexus.container.initialization.ContainerInitializationPhase`

**Fields:**
- `public final static java.lang.String ROLE`

**Methods:**
- `public abstract void execute(org.codehaus.plexus.container.initialization.ContainerInitializationContext p0) throws org.codehaus.plexus.container.initialization.ContainerInitializationException`

---

## public class `org.codehaus.plexus.container.initialization.InitializeComponentDiscovererManagerPhase`
extends `org.codehaus.plexus.container.initialization.AbstractCoreComponentInitializationPhase`  

**Constructors:**
- `public InitializeComponentDiscovererManagerPhase()`

**Methods:**
- `public void initializeCoreComponent(org.codehaus.plexus.container.initialization.ContainerInitializationContext p0) throws org.codehaus.plexus.container.initialization.ContainerInitializationException`

---

## public class `org.codehaus.plexus.container.initialization.InitializeComponentFactoryManagerPhase`
extends `org.codehaus.plexus.container.initialization.AbstractCoreComponentInitializationPhase`  

**Constructors:**
- `public InitializeComponentFactoryManagerPhase()`

**Methods:**
- `public void initializeCoreComponent(org.codehaus.plexus.container.initialization.ContainerInitializationContext p0) throws org.codehaus.plexus.container.initialization.ContainerInitializationException`

---

## public class `org.codehaus.plexus.container.initialization.InitializeComponentRegistryPhase`
implements `org.codehaus.plexus.container.initialization.ContainerInitializationPhase`  

**Constructors:**
- `public InitializeComponentRegistryPhase()`

**Methods:**
- `public void execute(org.codehaus.plexus.container.initialization.ContainerInitializationContext p0) throws org.codehaus.plexus.container.initialization.ContainerInitializationException`

---

## public class `org.codehaus.plexus.container.initialization.InitializeContainerConfigurationSourcePhase`
extends `org.codehaus.plexus.container.initialization.AbstractCoreComponentInitializationPhase`  

**Constructors:**
- `public InitializeContainerConfigurationSourcePhase()`

**Methods:**
- `public void initializeCoreComponent(org.codehaus.plexus.container.initialization.ContainerInitializationContext p0) throws org.codehaus.plexus.container.initialization.ContainerInitializationException`

---

## public class `org.codehaus.plexus.container.initialization.InitializeLoggerManagerPhase`
extends `org.codehaus.plexus.container.initialization.AbstractCoreComponentInitializationPhase`  

**Constructors:**
- `public InitializeLoggerManagerPhase()`

**Methods:**
- `public void initializeCoreComponent(org.codehaus.plexus.container.initialization.ContainerInitializationContext p0) throws org.codehaus.plexus.container.initialization.ContainerInitializationException`

---

## public class `org.codehaus.plexus.container.initialization.InitializeSystemPropertiesPhase`
extends `org.codehaus.plexus.container.initialization.AbstractContainerInitializationPhase`  

**Constructors:**
- `public InitializeSystemPropertiesPhase()`

**Methods:**
- `public void execute(org.codehaus.plexus.container.initialization.ContainerInitializationContext p0) throws org.codehaus.plexus.container.initialization.ContainerInitializationException`

---

## public class `org.codehaus.plexus.container.initialization.InitializeUserConfigurationSourcePhase`
extends `org.codehaus.plexus.container.initialization.AbstractCoreComponentInitializationPhase`  

**Constructors:**
- `public InitializeUserConfigurationSourcePhase()`

**Methods:**
- `public void initializeCoreComponent(org.codehaus.plexus.container.initialization.ContainerInitializationContext p0) throws org.codehaus.plexus.container.initialization.ContainerInitializationException`

---

## public abstract interface `org.codehaus.plexus.context.Context`

**Methods:**
- `public abstract boolean contains(java.lang.Object p0)`
- `public abstract java.lang.Object get(java.lang.Object p0) throws org.codehaus.plexus.context.ContextException`
- `public abstract java.util.Map getContextData()`
- `public abstract void hide(java.lang.Object p0) throws java.lang.IllegalStateException`
- `public abstract void makeReadOnly()`
- `public abstract void put(java.lang.Object p0, java.lang.Object p1) throws java.lang.IllegalStateException`

---

## public class `org.codehaus.plexus.context.ContextException`
extends `java.lang.Exception`  

**Constructors:**
- `public ContextException(java.lang.String p0)`
- `public ContextException(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `org.codehaus.plexus.context.ContextMapAdapter`
extends `java.util.HashMap`  

**Constructors:**
- `public ContextMapAdapter(org.codehaus.plexus.context.Context p0)`

**Methods:**
- `public java.lang.Object get(java.lang.Object p0)`

---

## public class `org.codehaus.plexus.context.DefaultContext`
implements `org.codehaus.plexus.context.Context`  

**Constructors:**
- `public DefaultContext()`
- `public DefaultContext(java.util.Map p0)`

**Methods:**
- `protected void checkWriteable() throws java.lang.IllegalStateException`
- `public boolean contains(java.lang.Object p0)`
- `public java.lang.Object get(java.lang.Object p0) throws org.codehaus.plexus.context.ContextException`
- `public java.util.Map getContextData()`
- `public void hide(java.lang.Object p0) throws java.lang.IllegalStateException`
- `public void makeReadOnly()`
- `public void put(java.lang.Object p0, java.lang.Object p1) throws java.lang.IllegalStateException`
- `public java.lang.String toString()`

---

## public abstract class `org.codehaus.plexus.lifecycle.AbstractLifecycleHandler`
implements `org.codehaus.plexus.lifecycle.LifecycleHandler`  

**Constructors:**
- `public AbstractLifecycleHandler()`

**Methods:**
- `public void addBeginSegment(org.codehaus.plexus.lifecycle.phase.Phase p0)`
- `public void addEndSegment(org.codehaus.plexus.lifecycle.phase.Phase p0)`
- `public void end(java.lang.Object p0, org.codehaus.plexus.component.manager.ComponentManager p1) throws org.codehaus.plexus.personality.plexus.lifecycle.phase.PhaseExecutionException`
- `public void end(java.lang.Object p0, org.codehaus.plexus.component.manager.ComponentManager p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2) throws org.codehaus.plexus.personality.plexus.lifecycle.phase.PhaseExecutionException`
- `public java.util.List getBeginSegment()`
- `public java.util.List getEndSegment()`
- `public void start(java.lang.Object p0, org.codehaus.plexus.component.manager.ComponentManager p1) throws org.codehaus.plexus.personality.plexus.lifecycle.phase.PhaseExecutionException`
- `public void start(java.lang.Object p0, org.codehaus.plexus.component.manager.ComponentManager p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2) throws org.codehaus.plexus.personality.plexus.lifecycle.phase.PhaseExecutionException`

---

## public class `org.codehaus.plexus.lifecycle.BasicLifecycleHandler`
extends `org.codehaus.plexus.lifecycle.AbstractLifecycleHandler`  

**Constructors:**
- `public BasicLifecycleHandler(java.lang.String p0)`

**Fields:**
- `protected java.lang.String id`

**Methods:**
- `public java.lang.String getId()`
- `public void initialize()`

---

## public class `org.codehaus.plexus.lifecycle.DefaultLifecycleHandlerManager`
implements `org.codehaus.plexus.lifecycle.LifecycleHandlerManager`  

**Constructors:**
- `public DefaultLifecycleHandlerManager()`

**Methods:**
- `public void addLifecycleHandler(org.codehaus.plexus.lifecycle.LifecycleHandler p0)`
- `public org.codehaus.plexus.lifecycle.LifecycleHandler getLifecycleHandler(java.lang.String p0) throws org.codehaus.plexus.lifecycle.UndefinedLifecycleHandlerException`
- `public void initialize()`

---

## public abstract interface `org.codehaus.plexus.lifecycle.LifecycleHandler`

**Methods:**
- `public abstract void addBeginSegment(org.codehaus.plexus.lifecycle.phase.Phase p0)`
- `public abstract void addEndSegment(org.codehaus.plexus.lifecycle.phase.Phase p0)`
- `public abstract void end(java.lang.Object p0, org.codehaus.plexus.component.manager.ComponentManager p1) throws org.codehaus.plexus.personality.plexus.lifecycle.phase.PhaseExecutionException`
- `public abstract void end(java.lang.Object p0, org.codehaus.plexus.component.manager.ComponentManager p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2) throws org.codehaus.plexus.personality.plexus.lifecycle.phase.PhaseExecutionException`
- `public abstract java.lang.String getId()`
- `public abstract void initialize()`
- `public abstract void start(java.lang.Object p0, org.codehaus.plexus.component.manager.ComponentManager p1) throws org.codehaus.plexus.personality.plexus.lifecycle.phase.PhaseExecutionException`
- `public abstract void start(java.lang.Object p0, org.codehaus.plexus.component.manager.ComponentManager p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2) throws org.codehaus.plexus.personality.plexus.lifecycle.phase.PhaseExecutionException`

---

## public abstract interface `org.codehaus.plexus.lifecycle.LifecycleHandlerManager`

**Methods:**
- `public abstract void addLifecycleHandler(org.codehaus.plexus.lifecycle.LifecycleHandler p0)`
- `public abstract org.codehaus.plexus.lifecycle.LifecycleHandler getLifecycleHandler(java.lang.String p0) throws org.codehaus.plexus.lifecycle.UndefinedLifecycleHandlerException`
- `public abstract void initialize()`

---

## public class `org.codehaus.plexus.lifecycle.UndefinedLifecycleHandlerException`
extends `java.lang.Exception`  

**Constructors:**
- `public UndefinedLifecycleHandlerException(java.lang.String p0)`

---

## public abstract class `org.codehaus.plexus.lifecycle.phase.AbstractPhase`
implements `org.codehaus.plexus.lifecycle.phase.Phase`  

**Constructors:**
- `public AbstractPhase()`

**Methods:**
- `public final void execute(java.lang.Object p0, org.codehaus.plexus.component.manager.ComponentManager p1) throws org.codehaus.plexus.personality.plexus.lifecycle.phase.PhaseExecutionException`
- `public abstract void execute(java.lang.Object p0, org.codehaus.plexus.component.manager.ComponentManager p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2) throws org.codehaus.plexus.personality.plexus.lifecycle.phase.PhaseExecutionException`

---

## public abstract interface `org.codehaus.plexus.lifecycle.phase.Phase`

**Methods:**
- `public abstract void execute(java.lang.Object p0, org.codehaus.plexus.component.manager.ComponentManager p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2) throws org.codehaus.plexus.personality.plexus.lifecycle.phase.PhaseExecutionException`

---

## public abstract class `org.codehaus.plexus.logging.AbstractLogEnabled`
implements `org.codehaus.plexus.logging.LogEnabled`  

**Constructors:**
- `public AbstractLogEnabled()`

**Methods:**
- `public void enableLogging(org.codehaus.plexus.logging.Logger p0)`
- `protected org.codehaus.plexus.logging.Logger getLogger()`
- `protected void setupLogger(java.lang.Object p0)`
- `protected void setupLogger(java.lang.Object p0, java.lang.String p1)`
- `protected void setupLogger(java.lang.Object p0, org.codehaus.plexus.logging.Logger p1)`

---

## public abstract class `org.codehaus.plexus.logging.AbstractLogger`
implements `org.codehaus.plexus.logging.Logger`  

**Constructors:**
- `public AbstractLogger(int p0, java.lang.String p1)`

**Methods:**
- `public void debug(java.lang.String p0)`
- `public void error(java.lang.String p0)`
- `public void fatalError(java.lang.String p0)`
- `public java.lang.String getName()`
- `public int getThreshold()`
- `public void info(java.lang.String p0)`
- `public boolean isDebugEnabled()`
- `public boolean isErrorEnabled()`
- `public boolean isFatalErrorEnabled()`
- `public boolean isInfoEnabled()`
- `protected boolean isValidThreshold(int p0)`
- `public boolean isWarnEnabled()`
- `public void setThreshold(int p0)`
- `public void warn(java.lang.String p0)`

---

## public abstract class `org.codehaus.plexus.logging.AbstractLoggerManager`
implements `org.codehaus.plexus.logging.LoggerManager`  

**Constructors:**
- `public AbstractLoggerManager()`

**Methods:**
- `public org.codehaus.plexus.logging.Logger getLoggerForComponent(java.lang.String p0)`
- `public int getThreshold(java.lang.String p0)`
- `public void returnComponentLogger(java.lang.String p0)`
- `public void setThreshold(java.lang.String p0, int p1)`
- `protected java.lang.String toMapKey(java.lang.String p0, java.lang.String p1)`

---

## public abstract class `org.codehaus.plexus.logging.BaseLoggerManager`
extends `org.codehaus.plexus.logging.AbstractLoggerManager`  
implements `org.codehaus.plexus.personality.plexus.lifecycle.phase.Initializable`  

**Constructors:**
- `public BaseLoggerManager()`

**Methods:**
- `protected abstract org.codehaus.plexus.logging.Logger createLogger(java.lang.String p0)`
- `public int getActiveLoggerCount()`
- `public org.codehaus.plexus.logging.Logger getLoggerForComponent(java.lang.String p0, java.lang.String p1)`
- `public int getThreshold()`
- `public int getThreshold(java.lang.String p0, java.lang.String p1)`
- `public java.lang.String getThresholdAsString()`
- `public void initialize()`
- `protected int parseThreshold(java.lang.String p0)`
- `public void returnComponentLogger(java.lang.String p0, java.lang.String p1)`
- `public void setThreshold(int p0)`
- `public void setThreshold(java.lang.String p0, java.lang.String p1, int p2)`
- `public void setThresholds(int p0)`

---

## public abstract interface `org.codehaus.plexus.logging.LogEnabled`

**Methods:**
- `public abstract void enableLogging(org.codehaus.plexus.logging.Logger p0)`

---

## public abstract interface `org.codehaus.plexus.logging.Logger`

**Fields:**
- `public final static int LEVEL_DEBUG`
- `public final static int LEVEL_DISABLED`
- `public final static int LEVEL_ERROR`
- `public final static int LEVEL_FATAL`
- `public final static int LEVEL_INFO`
- `public final static int LEVEL_WARN`

**Methods:**
- `public abstract void debug(java.lang.String p0)`
- `public abstract void debug(java.lang.String p0, java.lang.Throwable p1)`
- `public abstract void error(java.lang.String p0)`
- `public abstract void error(java.lang.String p0, java.lang.Throwable p1)`
- `public abstract void fatalError(java.lang.String p0)`
- `public abstract void fatalError(java.lang.String p0, java.lang.Throwable p1)`
- `public abstract org.codehaus.plexus.logging.Logger getChildLogger(java.lang.String p0)`
- `public abstract java.lang.String getName()`
- `public abstract int getThreshold()`
- `public abstract void info(java.lang.String p0)`
- `public abstract void info(java.lang.String p0, java.lang.Throwable p1)`
- `public abstract boolean isDebugEnabled()`
- `public abstract boolean isErrorEnabled()`
- `public abstract boolean isFatalErrorEnabled()`
- `public abstract boolean isInfoEnabled()`
- `public abstract boolean isWarnEnabled()`
- `public abstract void setThreshold(int p0)`
- `public abstract void warn(java.lang.String p0)`
- `public abstract void warn(java.lang.String p0, java.lang.Throwable p1)`

---

## public abstract interface `org.codehaus.plexus.logging.LoggerManager`

**Fields:**
- `public final static java.lang.String ROLE`

**Methods:**
- `public abstract int getActiveLoggerCount()`
- `public abstract org.codehaus.plexus.logging.Logger getLoggerForComponent(java.lang.String p0)`
- `public abstract org.codehaus.plexus.logging.Logger getLoggerForComponent(java.lang.String p0, java.lang.String p1)`
- `public abstract int getThreshold()`
- `public abstract int getThreshold(java.lang.String p0)`
- `public abstract int getThreshold(java.lang.String p0, java.lang.String p1)`
- `public abstract void returnComponentLogger(java.lang.String p0)`
- `public abstract void returnComponentLogger(java.lang.String p0, java.lang.String p1)`
- `public abstract void setThreshold(int p0)`
- `public abstract void setThreshold(java.lang.String p0, int p1)`
- `public abstract void setThreshold(java.lang.String p0, java.lang.String p1, int p2)`
- `public abstract void setThresholds(int p0)`

---

## public final class `org.codehaus.plexus.logging.console.ConsoleLogger`
extends `org.codehaus.plexus.logging.AbstractLogger`  

**Constructors:**
- `public ConsoleLogger(int p0, java.lang.String p1)`

**Methods:**
- `public void debug(java.lang.String p0, java.lang.Throwable p1)`
- `public void error(java.lang.String p0, java.lang.Throwable p1)`
- `public void fatalError(java.lang.String p0, java.lang.Throwable p1)`
- `public org.codehaus.plexus.logging.Logger getChildLogger(java.lang.String p0)`
- `public void info(java.lang.String p0, java.lang.Throwable p1)`
- `public void warn(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `org.codehaus.plexus.logging.console.ConsoleLoggerManager`
extends `org.codehaus.plexus.logging.AbstractLoggerManager`  
implements `org.codehaus.plexus.logging.LoggerManager`, `org.codehaus.plexus.personality.plexus.lifecycle.phase.Initializable`  

**Constructors:**
- `public ConsoleLoggerManager()`
- `public ConsoleLoggerManager(java.lang.String p0)`

**Methods:**
- `public org.codehaus.plexus.logging.Logger createLogger(int p0, java.lang.String p1)`
- `public int getActiveLoggerCount()`
- `public org.codehaus.plexus.logging.Logger getLoggerForComponent(java.lang.String p0, java.lang.String p1)`
- `public int getThreshold()`
- `public int getThreshold(java.lang.String p0, java.lang.String p1)`
- `public void initialize()`
- `public void returnComponentLogger(java.lang.String p0, java.lang.String p1)`
- `public void setThreshold(int p0)`
- `public void setThreshold(java.lang.String p0, java.lang.String p1, int p2)`
- `public void setThresholds(int p0)`

---

## public class `org.codehaus.plexus.personality.plexus.lifecycle.phase.AutoConfigurePhase`
extends `org.codehaus.plexus.lifecycle.phase.AbstractPhase`  

**Constructors:**
- `public AutoConfigurePhase()`

**Fields:**
- `public final static java.lang.String DEFAULT_CONFIGURATOR_ID`

**Methods:**
- `public void execute(java.lang.Object p0, org.codehaus.plexus.component.manager.ComponentManager p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2) throws org.codehaus.plexus.personality.plexus.lifecycle.phase.PhaseExecutionException`

---

## public abstract interface `org.codehaus.plexus.personality.plexus.lifecycle.phase.Configurable`

**Methods:**
- `public abstract void configure(org.codehaus.plexus.configuration.PlexusConfiguration p0) throws org.codehaus.plexus.configuration.PlexusConfigurationException`

---

## public class `org.codehaus.plexus.personality.plexus.lifecycle.phase.ConfigurablePhase`
extends `org.codehaus.plexus.lifecycle.phase.AbstractPhase`  

**Constructors:**
- `public ConfigurablePhase()`

**Methods:**
- `public void execute(java.lang.Object p0, org.codehaus.plexus.component.manager.ComponentManager p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2) throws org.codehaus.plexus.personality.plexus.lifecycle.phase.PhaseExecutionException`

---

## public abstract interface `org.codehaus.plexus.personality.plexus.lifecycle.phase.Contextualizable`

**Methods:**
- `public abstract void contextualize(org.codehaus.plexus.context.Context p0) throws org.codehaus.plexus.context.ContextException`

---

## public class `org.codehaus.plexus.personality.plexus.lifecycle.phase.ContextualizePhase`
extends `org.codehaus.plexus.lifecycle.phase.AbstractPhase`  

**Constructors:**
- `public ContextualizePhase()`

**Methods:**
- `public void execute(java.lang.Object p0, org.codehaus.plexus.component.manager.ComponentManager p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2) throws org.codehaus.plexus.personality.plexus.lifecycle.phase.PhaseExecutionException`

---

## public abstract interface `org.codehaus.plexus.personality.plexus.lifecycle.phase.Disposable`

**Methods:**
- `public abstract void dispose()`

---

## public class `org.codehaus.plexus.personality.plexus.lifecycle.phase.DisposePhase`
extends `org.codehaus.plexus.lifecycle.phase.AbstractPhase`  

**Constructors:**
- `public DisposePhase()`

**Methods:**
- `public void execute(java.lang.Object p0, org.codehaus.plexus.component.manager.ComponentManager p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2)`

---

## public abstract interface `org.codehaus.plexus.personality.plexus.lifecycle.phase.Initializable`

**Methods:**
- `public abstract void initialize() throws org.codehaus.plexus.personality.plexus.lifecycle.phase.InitializationException`

---

## public class `org.codehaus.plexus.personality.plexus.lifecycle.phase.InitializationException`
extends `java.lang.Exception`  

**Constructors:**
- `public InitializationException(java.lang.String p0)`
- `public InitializationException(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `org.codehaus.plexus.personality.plexus.lifecycle.phase.InitializePhase`
extends `org.codehaus.plexus.lifecycle.phase.AbstractPhase`  

**Constructors:**
- `public InitializePhase()`

**Methods:**
- `public void execute(java.lang.Object p0, org.codehaus.plexus.component.manager.ComponentManager p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2) throws org.codehaus.plexus.personality.plexus.lifecycle.phase.PhaseExecutionException`

---

## public class `org.codehaus.plexus.personality.plexus.lifecycle.phase.LogDisablePhase`
extends `org.codehaus.plexus.lifecycle.phase.AbstractPhase`  

**Constructors:**
- `public LogDisablePhase()`

**Methods:**
- `public void execute(java.lang.Object p0, org.codehaus.plexus.component.manager.ComponentManager p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2) throws org.codehaus.plexus.personality.plexus.lifecycle.phase.PhaseExecutionException`

---

## public class `org.codehaus.plexus.personality.plexus.lifecycle.phase.LogEnablePhase`
extends `org.codehaus.plexus.lifecycle.phase.AbstractPhase`  

**Constructors:**
- `public LogEnablePhase()`

**Methods:**
- `public void execute(java.lang.Object p0, org.codehaus.plexus.component.manager.ComponentManager p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2) throws org.codehaus.plexus.personality.plexus.lifecycle.phase.PhaseExecutionException`

---

## public class `org.codehaus.plexus.personality.plexus.lifecycle.phase.PhaseExecutionException`
extends `java.lang.Exception`  

**Constructors:**
- `public PhaseExecutionException(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `org.codehaus.plexus.personality.plexus.lifecycle.phase.PlexusContainerLocator`
implements `org.codehaus.plexus.personality.plexus.lifecycle.phase.ServiceLocator`  

**Constructors:**
- `public PlexusContainerLocator(org.codehaus.plexus.PlexusContainer p0)`

**Methods:**
- `public boolean hasComponent(java.lang.String p0)`
- `public boolean hasComponent(java.lang.String p0, java.lang.String p1)`
- `public java.lang.Object lookup(java.lang.String p0) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public java.lang.Object lookup(java.lang.String p0, java.lang.String p1) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public java.util.List lookupList(java.lang.String p0) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public java.util.Map lookupMap(java.lang.String p0) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public void release(java.lang.Object p0) throws org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`
- `public void releaseAll(java.util.List p0) throws org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`
- `public void releaseAll(java.util.Map p0) throws org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`

---

## public class `org.codehaus.plexus.personality.plexus.lifecycle.phase.ResumePhase`
extends `org.codehaus.plexus.lifecycle.phase.AbstractPhase`  

**Constructors:**
- `public ResumePhase()`

**Methods:**
- `public void execute(java.lang.Object p0, org.codehaus.plexus.component.manager.ComponentManager p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2)`

---

## public abstract interface `org.codehaus.plexus.personality.plexus.lifecycle.phase.ServiceLocator`

**Methods:**
- `public abstract boolean hasComponent(java.lang.String p0)`
- `public abstract boolean hasComponent(java.lang.String p0, java.lang.String p1)`
- `public abstract java.lang.Object lookup(java.lang.String p0) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public abstract java.lang.Object lookup(java.lang.String p0, java.lang.String p1) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public abstract java.util.List lookupList(java.lang.String p0) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public abstract java.util.Map lookupMap(java.lang.String p0) throws org.codehaus.plexus.component.repository.exception.ComponentLookupException`
- `public abstract void release(java.lang.Object p0) throws org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`
- `public abstract void releaseAll(java.util.List p0) throws org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`
- `public abstract void releaseAll(java.util.Map p0) throws org.codehaus.plexus.component.repository.exception.ComponentLifecycleException`

---

## public abstract interface `org.codehaus.plexus.personality.plexus.lifecycle.phase.Serviceable`

**Methods:**
- `public abstract void service(org.codehaus.plexus.personality.plexus.lifecycle.phase.ServiceLocator p0)`

---

## public class `org.codehaus.plexus.personality.plexus.lifecycle.phase.ServiceablePhase`
extends `org.codehaus.plexus.lifecycle.phase.AbstractPhase`  

**Constructors:**
- `public ServiceablePhase()`

**Methods:**
- `public void execute(java.lang.Object p0, org.codehaus.plexus.component.manager.ComponentManager p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2)`

---

## public class `org.codehaus.plexus.personality.plexus.lifecycle.phase.StartPhase`
extends `org.codehaus.plexus.lifecycle.phase.AbstractPhase`  

**Constructors:**
- `public StartPhase()`

**Methods:**
- `public void execute(java.lang.Object p0, org.codehaus.plexus.component.manager.ComponentManager p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2) throws org.codehaus.plexus.personality.plexus.lifecycle.phase.PhaseExecutionException`

---

## public abstract interface `org.codehaus.plexus.personality.plexus.lifecycle.phase.Startable`

**Methods:**
- `public abstract void start() throws org.codehaus.plexus.personality.plexus.lifecycle.phase.StartingException`
- `public abstract void stop() throws org.codehaus.plexus.personality.plexus.lifecycle.phase.StoppingException`

---

## public class `org.codehaus.plexus.personality.plexus.lifecycle.phase.StartingException`
extends `java.lang.Exception`  

**Constructors:**
- `public StartingException(java.lang.String p0)`
- `public StartingException(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `org.codehaus.plexus.personality.plexus.lifecycle.phase.StopPhase`
extends `org.codehaus.plexus.lifecycle.phase.AbstractPhase`  

**Constructors:**
- `public StopPhase()`

**Methods:**
- `public void execute(java.lang.Object p0, org.codehaus.plexus.component.manager.ComponentManager p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2) throws org.codehaus.plexus.personality.plexus.lifecycle.phase.PhaseExecutionException`

---

## public class `org.codehaus.plexus.personality.plexus.lifecycle.phase.StoppingException`
extends `java.lang.Exception`  

**Constructors:**
- `public StoppingException(java.lang.String p0)`
- `public StoppingException(java.lang.String p0, java.lang.Throwable p1)`

---

## public class `org.codehaus.plexus.personality.plexus.lifecycle.phase.SuspendPhase`
extends `org.codehaus.plexus.lifecycle.phase.AbstractPhase`  

**Constructors:**
- `public SuspendPhase()`

**Methods:**
- `public void execute(java.lang.Object p0, org.codehaus.plexus.component.manager.ComponentManager p1, org.codehaus.plexus.classworlds.realm.ClassRealm p2)`

---

## public abstract interface `org.codehaus.plexus.personality.plexus.lifecycle.phase.Suspendable`

**Methods:**
- `public abstract void resume()`
- `public abstract void suspend()`

---

