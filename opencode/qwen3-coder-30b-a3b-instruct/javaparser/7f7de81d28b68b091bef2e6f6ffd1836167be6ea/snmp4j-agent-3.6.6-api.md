# API Specification: org.snmp4j:snmp4j-agent 3.6.6

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public class `org.snmp4j.agent.AgentConfigManager`
implements `java.lang.Runnable`, `org.snmp4j.agent.mo.util.VariableProvider`  

**Constructors:**
- `public AgentConfigManager(org.snmp4j.smi.OctetString p0, org.snmp4j.MessageDispatcher p1, org.snmp4j.agent.security.VACM p2, org.snmp4j.agent.MOServer[] p3, org.snmp4j.util.WorkerPool p4, org.snmp4j.agent.io.MOInputFactory p5, org.snmp4j.agent.io.MOPersistenceProvider p6, org.snmp4j.cfg.EngineBootsProvider p7)`
- `public AgentConfigManager(org.snmp4j.smi.OctetString p0, org.snmp4j.MessageDispatcher p1, org.snmp4j.agent.security.VACM p2, org.snmp4j.agent.MOServer[] p3, org.snmp4j.util.WorkerPool p4, org.snmp4j.agent.io.MOInputFactory p5, org.snmp4j.agent.io.MOPersistenceProvider p6, org.snmp4j.cfg.EngineBootsProvider p7, org.snmp4j.agent.mo.MOFactory p8)`
- `public AgentConfigManager(org.snmp4j.smi.OctetString p0, org.snmp4j.MessageDispatcher p1, org.snmp4j.agent.security.VACM p2, org.snmp4j.agent.MOServer[] p3, org.snmp4j.util.WorkerPool p4, org.snmp4j.agent.io.MOInputFactory p5, org.snmp4j.agent.io.MOPersistenceProvider p6, org.snmp4j.cfg.EngineBootsProvider p7, org.snmp4j.agent.mo.MOFactory p8, java.util.Collection p9)`

**Fields:**
- `protected org.snmp4j.agent.CommandProcessor agent`
- `protected java.util.List agentStateListeners`
- `protected org.snmp4j.agent.mo.snmp.SnmpCommunityMIB communityMIB`
- `protected org.snmp4j.agent.io.MOInputFactory configuration`
- `protected org.snmp4j.mp.CounterSupport counterSupport`
- `protected org.snmp4j.smi.OctetString defaultContext`
- `protected java.util.Collection diffieHellmanKickstartParameters`
- `protected org.snmp4j.MessageDispatcher dispatcher`
- `protected org.snmp4j.cfg.EngineBootsProvider engineBootsProvider`
- `protected org.snmp4j.smi.OctetString engineID`
- `protected org.snmp4j.agent.mo.snmp.SnmpFrameworkMIB frameworkMIB`
- `protected org.snmp4j.agent.mo.MOFactory moFactory`
- `protected org.snmp4j.smi.UnsignedInteger32 notificaitonLogGlobalAge`
- `protected org.snmp4j.smi.UnsignedInteger32 notificaitonLogGlobalLimit`
- `protected org.snmp4j.smi.UnsignedInteger32 notificationLogDefaultLimit`
- `protected org.snmp4j.agent.mo.snmp.NotificationLogMib notificationLogMIB`
- `protected org.snmp4j.agent.mo.snmp.SnmpNotificationMIB notificationMIB`
- `protected org.snmp4j.agent.NotificationOriginator notificationOriginator`
- `protected int persistenceImportMode`
- `protected org.snmp4j.agent.io.MOPersistenceProvider persistenceProvider`
- `protected org.snmp4j.agent.ProxyForwarder proxyForwarder`
- `protected org.snmp4j.agent.mo.snmp.SnmpProxyMIB proxyMIB`
- `protected org.snmp4j.agent.AgentState runState`
- `protected org.snmp4j.security.SecurityModels securityModels`
- `protected org.snmp4j.security.SecurityProtocols securityProtocols`
- `protected org.snmp4j.agent.MOServer[] servers`
- `protected org.snmp4j.Session session`
- `protected org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib snmp4jConfigMIB`
- `protected org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib snmp4jLogMIB`
- `protected org.snmp4j.agent.mo.snmp4j.Snmp4jProxyMib snmp4jProxyMIB`
- `protected org.snmp4j.agent.mo.snmp.SnmpMpdMib snmpMpdMib`
- `protected org.snmp4j.agent.mo.snmp.dh.SnmpUsmDhObjectsMib snmpUsmDhObjectsMib`
- `protected org.snmp4j.agent.mo.snmp.SNMPv2MIB snmpv2MIB`
- `protected org.snmp4j.smi.OctetString sysDescr`
- `protected org.snmp4j.smi.OID sysOID`
- `protected org.snmp4j.smi.Integer32 sysServices`
- `protected org.snmp4j.agent.mo.util.MOTableSizeLimit tableSizeLimit`
- `protected org.snmp4j.agent.mo.snmp.SnmpTargetMIB targetMIB`
- `protected org.snmp4j.agent.mo.snmp.SnmpTlsTmMib tlsTmMib`
- `protected org.snmp4j.security.USM usm`
- `protected org.snmp4j.agent.mo.snmp.UsmMIB usmMIB`
- `protected org.snmp4j.agent.security.VACM vacm`
- `protected org.snmp4j.agent.mo.snmp.VacmMIB vacmMIB`
- `protected org.snmp4j.util.WorkerPool workerPool`

**Methods:**
- `public synchronized void addAgentStateListener(org.snmp4j.agent.AgentStateListener p0)`
- `public void configure()`
- `public boolean continueProcessing()`
- `protected org.snmp4j.agent.CommandProcessor createCommandProcessor(org.snmp4j.smi.OctetString p0)`
- `protected org.snmp4j.mp.CounterSupport createCounterSupport()`
- `protected org.snmp4j.agent.NotificationOriginator createNotificationOriginator()`
- `protected org.snmp4j.agent.ProxyForwarder createProxyForwarder(org.snmp4j.agent.CommandProcessor p0)`
- `protected org.snmp4j.Session createSnmpSession(org.snmp4j.MessageDispatcher p0)`
- `protected org.snmp4j.security.TSM createTSM()`
- `protected org.snmp4j.security.USM createUSM()`
- `protected synchronized void fireAgentStateChange()`
- `protected void fireLaunchNotifications()`
- `public org.snmp4j.agent.NotificationOriginator getAgentNotificationOriginator()`
- `public org.snmp4j.agent.io.MOInputFactory getConfigurationFactory()`
- `protected org.snmp4j.smi.OctetString getContext(org.snmp4j.agent.MOGroup p0, org.snmp4j.smi.OctetString p1)`
- `public org.snmp4j.mp.CounterSupport getCounterSupport()`
- `public org.snmp4j.smi.OctetString getDefaultContext()`
- `protected java.util.Collection getDhKickstartParameters()`
- `public org.snmp4j.agent.mo.snmp.NotificationLogMib getNotificationLogMIB()`
- `public org.snmp4j.agent.NotificationOriginator getNotificationOriginator()`
- `public int getPersistenceImportMode()`
- `public org.snmp4j.agent.io.MOPersistenceProvider getPersistenceProvider()`
- `public org.snmp4j.agent.mo.snmp.SNMPv2MIB getSNMPv2MIB()`
- `public org.snmp4j.security.SecurityModels getSecurityModels()`
- `public org.snmp4j.security.SecurityProtocols getSecurityProtocols()`
- `public org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib getSnmp4jConfigMIB()`
- `public org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib getSnmp4jLogMIB()`
- `public org.snmp4j.agent.mo.snmp4j.Snmp4jProxyMib getSnmp4jProxyMIB()`
- `public org.snmp4j.agent.mo.snmp.SnmpCommunityMIB getSnmpCommunityMIB()`
- `public org.snmp4j.agent.mo.snmp.SnmpMpdMib getSnmpMpdMib()`
- `public org.snmp4j.agent.mo.snmp.SnmpNotificationMIB getSnmpNotificationMIB()`
- `public org.snmp4j.agent.mo.snmp.SnmpTargetMIB getSnmpTargetMIB()`
- `public int getState()`
- `protected org.snmp4j.security.SecurityProtocols getSupportedSecurityProtocols()`
- `public org.snmp4j.smi.OctetString getSysDescr()`
- `public org.snmp4j.smi.OID getSysOID()`
- `public org.snmp4j.smi.Integer32 getSysServices()`
- `public org.snmp4j.agent.mo.snmp.SysUpTime getSysUpTime()`
- `public org.snmp4j.security.USM getUsm()`
- `public org.snmp4j.agent.mo.snmp.UsmMIB getUsmMIB()`
- `public org.snmp4j.agent.security.VACM getVACM()`
- `public org.snmp4j.agent.mo.snmp.VacmMIB getVacmMIB()`
- `public org.snmp4j.smi.Variable getVariable(java.lang.String p0)`
- `protected void initMandatoryMIBs()`
- `protected void initMessageDispatcherWithMPs(org.snmp4j.MessageDispatcher p0)`
- `protected void initNotificationLogMIB(org.snmp4j.agent.security.VACM p0, org.snmp4j.agent.mo.snmp.SnmpNotificationMIB p1)`
- `protected void initOptionalMIBs()`
- `protected void initSecurityContext()`
- `protected void initSecurityModels(org.snmp4j.cfg.EngineBootsProvider p0)`
- `public void initSnmp4jConfigMIB(org.snmp4j.agent.io.MOPersistenceProvider[] p0)`
- `public void initSnmp4jLogMIB()`
- `public void initSnmp4jProxyMIB(org.snmp4j.smi.OctetString p0)`
- `protected void initSnmpUsmDhObjectsMib()`
- `public void initialize()`
- `protected void launch()`
- `protected void launchTransportMappings() throws java.io.IOException`
- `protected static void launchTransportMappings(java.util.Collection p0) throws java.io.IOException`
- `protected void linkCounterListener()`
- `protected void registerMIBs(org.snmp4j.smi.OctetString p0) throws org.snmp4j.agent.DuplicateRegistrationException`
- `public void registerShutdownHook()`
- `protected void registerTransportMappings()`
- `public synchronized boolean removeAgentStateListener(org.snmp4j.agent.AgentStateListener p0)`
- `public boolean restoreState()`
- `public void run()`
- `public boolean saveState()`
- `public void setConfigurationFactory(org.snmp4j.agent.io.MOInputFactory p0)`
- `public void setContext(org.snmp4j.security.SecurityModels p0, org.snmp4j.security.SecurityProtocols p1, org.snmp4j.mp.CounterSupport p2)`
- `public void setCounterSupport(org.snmp4j.mp.CounterSupport p0)`
- `public void setNotificationOriginator(org.snmp4j.agent.NotificationOriginator p0)`
- `public void setPersistenceImportMode(int p0)`
- `public void setPersistenceProvider(org.snmp4j.agent.io.MOPersistenceProvider p0)`
- `public void setTableSizeLimit(int p0)`
- `public void setTableSizeLimits(java.util.Properties p0)`
- `public void setupProxyForwarder()`
- `public void setupSnmpUsmDhObjectsMib(java.util.Collection p0)`
- `public void shutdown()`
- `protected static void stopTransportMappings(java.util.Collection p0) throws java.io.IOException`
- `public void suspendProcessing()`
- `protected void unregisterMIBs(org.snmp4j.smi.OctetString p0)`

---

## public class `org.snmp4j.agent.AgentConfigManager$AgentState`
implements `org.snmp4j.agent.AgentState`  

**Constructors:**
- `public AgentState()`

**Methods:**
- `public void addError(org.snmp4j.agent.AgentState$ErrorDescriptor p0)`
- `public void advanceState(int p0)`
- `public java.util.List getErrors()`
- `public int getState()`
- `public void setState(int p0)`

---

## public static class `org.snmp4j.agent.AgentConfigManager$ErrorDescriptor`
implements `org.snmp4j.agent.AgentState$ErrorDescriptor`  

**Methods:**
- `public java.lang.String getDescription()`
- `public java.lang.Exception getException()`
- `public int getSourceState()`
- `public int getTargetState()`

---

## public abstract interface `org.snmp4j.agent.AgentState`

**Fields:**
- `public final static int STATE_CONFIGURED`
- `public final static int STATE_CREATED`
- `public final static int STATE_INITIALIZED`
- `public final static int STATE_RESTORED`
- `public final static int STATE_RUNNING`
- `public final static int STATE_SAVED`
- `public final static int STATE_SHUTDOWN`
- `public final static int STATE_SUSPENDED`

**Methods:**
- `public abstract void addError(org.snmp4j.agent.AgentState$ErrorDescriptor p0)`
- `public abstract void advanceState(int p0)`
- `public abstract java.util.List getErrors()`
- `public abstract int getState()`
- `public abstract void setState(int p0)`

---

## public abstract static interface `org.snmp4j.agent.AgentState$ErrorDescriptor`

**Methods:**
- `public abstract java.lang.String getDescription()`
- `public abstract java.lang.Exception getException()`
- `public abstract int getSourceState()`
- `public abstract int getTargetState()`

---

## public abstract interface `org.snmp4j.agent.AgentStateListener`<ACM extends java.lang.Object>

**Methods:**
- `public abstract void agentStateChanged(ACM p0, org.snmp4j.agent.AgentState p1)`

---

## public abstract class `org.snmp4j.agent.BaseAgent`
annotations: @java.lang.Deprecated  
implements `java.lang.Runnable`  

**Constructors:**
- `protected BaseAgent(java.io.File p0, java.io.File p1, org.snmp4j.agent.CommandProcessor p2)`
- `protected BaseAgent(java.lang.String p0)`

**Fields:**
- `public final static int STATE_CREATED`
- `public final static int STATE_INIT_FINISHED`
- `public final static int STATE_INIT_STARTED`
- `public final static int STATE_RUNNING`
- `public final static int STATE_STOPPED`
- `protected org.snmp4j.agent.CommandProcessor agent`
- `protected int agentState`
- `protected org.snmp4j.cfg.EngineBootsCounterFile bootCounterFile`
- `protected java.lang.String configFileURI`
- `protected org.snmp4j.smi.OctetString defaultContext`
- `protected org.snmp4j.agent.io.DefaultMOPersistenceProvider defaultPersistenceProvider`
- `protected org.snmp4j.agent.ProxyForwarder defaultProxyForwarder`
- `protected org.snmp4j.MessageDispatcherImpl dispatcher`
- `protected org.snmp4j.mp.MPv3 mpv3`
- `protected org.snmp4j.agent.NotificationOriginator notificationOriginator`
- `protected org.snmp4j.agent.DefaultMOServer server`
- `protected org.snmp4j.Snmp session`
- `protected org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib snmp4jConfigMIB`
- `protected org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib snmp4jLogMIB`
- `protected org.snmp4j.agent.mo.snmp.SnmpCommunityMIB snmpCommunityMIB`
- `protected org.snmp4j.agent.mo.snmp.SnmpFrameworkMIB snmpFrameworkMIB`
- `protected org.snmp4j.agent.mo.snmp.SnmpMpdMib snmpMpdMib`
- `protected org.snmp4j.agent.mo.snmp.SnmpNotificationMIB snmpNotificationMIB`
- `protected org.snmp4j.agent.mo.snmp.SnmpProxyMIB snmpProxyMIB`
- `protected org.snmp4j.agent.mo.snmp.SnmpTargetMIB snmpTargetMIB`
- `protected org.snmp4j.agent.mo.snmp.SNMPv2MIB snmpv2MIB`
- `protected org.snmp4j.smi.OctetString sysDescr`
- `protected org.snmp4j.smi.OID sysOID`
- `protected org.snmp4j.smi.Integer32 sysServices`
- `protected org.snmp4j.TransportMapping[] transportMappings`
- `protected org.snmp4j.security.USM usm`
- `protected org.snmp4j.agent.mo.snmp.UsmMIB usmMIB`
- `protected org.snmp4j.agent.mo.snmp.VacmMIB vacmMIB`

**Methods:**
- `protected abstract void addCommunities(org.snmp4j.agent.mo.snmp.SnmpCommunityMIB p0)`
- `protected abstract void addNotificationTargets(org.snmp4j.agent.mo.snmp.SnmpTargetMIB p0, org.snmp4j.agent.mo.snmp.SnmpNotificationMIB p1)`
- `protected void addShutdownHook()`
- `protected abstract void addUsmUser(org.snmp4j.security.USM p0)`
- `protected abstract void addViews(org.snmp4j.agent.mo.snmp.VacmMIB p0)`
- `protected void finishInit()`
- `public org.snmp4j.agent.CommandProcessor getAgent()`
- `public int getAgentState()`
- `public java.io.File getBootCounterFile()`
- `public java.io.File getConfigFile()`
- `protected org.snmp4j.smi.OctetString getContext(org.snmp4j.agent.MOGroup p0)`
- `public org.snmp4j.smi.OctetString getDefaultContext()`
- `public org.snmp4j.agent.ProxyForwarder getDefaultProxyForwarder()`
- `protected int getEngineBoots()`
- `public org.snmp4j.mp.MPv3 getMPv3()`
- `public org.snmp4j.agent.NotificationOriginator getNotificationOriginator()`
- `public org.snmp4j.agent.DefaultMOServer getServer()`
- `public org.snmp4j.Snmp getSession()`
- `public org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib getSnmp4jConfigMIB()`
- `public org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib getSnmp4jLogMIB()`
- `public org.snmp4j.agent.mo.snmp.SnmpCommunityMIB getSnmpCommunityMIB()`
- `public org.snmp4j.agent.mo.snmp.SnmpFrameworkMIB getSnmpFrameworkMIB()`
- `public org.snmp4j.agent.mo.snmp.SnmpMpdMib getSnmpMpdMib()`
- `public org.snmp4j.agent.mo.snmp.SnmpNotificationMIB getSnmpNotificationMIB()`
- `public org.snmp4j.agent.mo.snmp.SnmpProxyMIB getSnmpProxyMIB()`
- `public org.snmp4j.agent.mo.snmp.SnmpTargetMIB getSnmpTargetMIB()`
- `public org.snmp4j.agent.mo.snmp.SNMPv2MIB getSnmpv2MIB()`
- `public org.snmp4j.smi.OctetString getSysDescr()`
- `public org.snmp4j.smi.OID getSysOID()`
- `public org.snmp4j.smi.Integer32 getSysServices()`
- `public org.snmp4j.security.USM getUsm()`
- `public org.snmp4j.agent.mo.snmp.UsmMIB getUsmMIB()`
- `public org.snmp4j.agent.mo.snmp.VacmMIB getVacmMIB()`
- `public void init() throws java.io.IOException`
- `protected void initConfigMIB()`
- `protected void initMessageDispatcher()`
- `protected void initSnmpSession()`
- `protected void initTransportMappings() throws java.io.IOException`
- `public void loadConfig(int p0)`
- `protected abstract void registerManagedObjects()`
- `protected void registerSnmpMIBs()`
- `public void run()`
- `public void saveConfig()`
- `protected void sendColdStartNotification()`
- `public void setAgent(org.snmp4j.agent.CommandProcessor p0)`
- `public void setBootCounterFile(java.io.File p0)`
- `public void setConfigFile(java.io.File p0)`
- `public void setDefaultContext(org.snmp4j.smi.OctetString p0)`
- `public void setDefaultProxyForwarder(org.snmp4j.agent.ProxyForwarder p0)`
- `public void setSysDescr(org.snmp4j.smi.OctetString p0)`
- `public void setSysOID(org.snmp4j.smi.OID p0)`
- `public void setSysServices(org.snmp4j.smi.Integer32 p0)`
- `protected void setupDefaultProxyForwarder()`
- `public void stop()`
- `protected abstract void unregisterManagedObjects()`
- `protected void unregisterSnmpMIBs()`
- `protected int updateEngineBoots()`
- `protected void updateSession(org.snmp4j.Session p0)`

---

## public class `org.snmp4j.agent.CommandProcessor`
implements `org.snmp4j.CommandResponder`, `org.snmp4j.agent.NotificationOriginator`  

**Constructors:**
- `public CommandProcessor(org.snmp4j.smi.OctetString p0)`

**Fields:**
- `protected org.snmp4j.agent.mo.snmp.CoexistenceInfoProvider coexistenceProvider`
- `protected java.util.List moServers`
- `protected org.snmp4j.agent.NotificationOriginator notificationOriginator`
- `protected java.util.List ownContextEngineIDs`
- `protected final java.util.List pduHandler`
- `protected org.snmp4j.agent.ProxyMap proxyForwarder`
- `protected org.snmp4j.agent.request.RequestFactory requestFactory`
- `protected org.snmp4j.agent.util.TemporaryList requestList`
- `protected org.snmp4j.util.WorkerPool threadPool`
- `protected org.snmp4j.agent.security.VACM vacm`

**Methods:**
- `public synchronized void addCounterListener(org.snmp4j.event.CounterListener p0)`
- `public boolean addMOServer(org.snmp4j.agent.MOServer p0)`
- `public void addPduHandler(org.snmp4j.agent.RequestHandler p0)`
- `public org.snmp4j.agent.ProxyForwarder addProxyForwarder(org.snmp4j.agent.ProxyForwarder p0, org.snmp4j.smi.OctetString p1, int p2)`
- `protected <A extends org.snmp4j.smi.Address> void dispatchCommand(org.snmp4j.CommandResponderEvent p0, org.snmp4j.agent.mo.snmp.CoexistenceInfo p1)`
- `protected <A extends org.snmp4j.smi.Address> void finalizeRequest(org.snmp4j.CommandResponderEvent p0, org.snmp4j.agent.request.SnmpRequest p1, org.snmp4j.agent.MOServer p2)`
- `protected void fireIncrementCounter(org.snmp4j.event.CounterEvent p0)`
- `public org.snmp4j.agent.mo.snmp.CoexistenceInfoProvider getCoexistenceProvider()`
- `public org.snmp4j.smi.OctetString getContextEngineID()`
- `protected org.snmp4j.agent.RequestHandler getHandler(int p0)`
- `public int getInternalRequestTimeout()`
- `public org.snmp4j.agent.NotificationOriginator getNotificationOriginator()`
- `public org.snmp4j.agent.ProxyMap getProxyForwarder()`
- `public org.snmp4j.agent.util.TemporaryList getRequestList()`
- `public org.snmp4j.agent.MOServer getServer(org.snmp4j.smi.OctetString p0)`
- `public org.snmp4j.agent.security.VACM getVacm()`
- `protected org.snmp4j.smi.OctetString getViewName(org.snmp4j.CommandResponderEvent p0, org.snmp4j.agent.mo.snmp.CoexistenceInfo p1, int p2)`
- `public java.lang.Object notify(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OID p1, org.snmp4j.smi.TimeTicks p2, org.snmp4j.smi.VariableBinding[] p3)`
- `public java.lang.Object notify(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OID p1, org.snmp4j.smi.VariableBinding[] p2)`
- `protected void processNextSubRequest(org.snmp4j.agent.request.SnmpRequest p0, org.snmp4j.agent.MOServer p1, org.snmp4j.smi.OctetString p2, org.snmp4j.agent.request.SubRequest p3) throws java.util.NoSuchElementException`
- `public <A extends org.snmp4j.smi.Address> void processPdu(org.snmp4j.CommandResponderEvent p0)`
- `protected <A extends org.snmp4j.smi.Address> void processRequest(org.snmp4j.CommandResponderEvent p0, org.snmp4j.agent.mo.snmp.CoexistenceInfo p1, org.snmp4j.agent.RequestHandler p2)`
- `protected <R extends org.snmp4j.agent.request.Request<Source, Response, ? extends org.snmp4j.agent.request.SubRequest<? extends java.lang.Object>>, Source extends java.lang.Object, Response extends java.lang.Object> void processRequest(org.snmp4j.agent.MOServer p0, org.snmp4j.agent.RequestHandler p1, R p2)`
- `protected void release(org.snmp4j.agent.MOServer p0, org.snmp4j.agent.request.SnmpRequest p1)`
- `public synchronized void removeCounterListener(org.snmp4j.event.CounterListener p0)`
- `public boolean removeMOServer(org.snmp4j.agent.MOServer p0)`
- `public void removePduHandler(org.snmp4j.agent.RequestHandler p0)`
- `public org.snmp4j.agent.ProxyForwarder removeProxyForwarder(org.snmp4j.smi.OctetString p0, int p1)`
- `protected void reprocessRequest(org.snmp4j.agent.MOServer p0, org.snmp4j.agent.request.SnmpRequest p1)`
- `protected <A extends org.snmp4j.smi.Address> void sendResponse(org.snmp4j.CommandResponderEvent p0, org.snmp4j.PDU p1)`
- `protected void setAuthorizationError(org.snmp4j.agent.request.Request p0, int p1)`
- `public void setCoexistenceProvider(org.snmp4j.agent.mo.snmp.CoexistenceInfoProvider p0)`
- `public void setContextEngineID(org.snmp4j.smi.OctetString p0)`
- `public void setInternalRequestTimeout(int p0)`
- `public void setNotificationOriginator(org.snmp4j.agent.NotificationOriginator p0)`
- `public void setThreadPool(org.snmp4j.util.WorkerPool p0)`
- `public void setVacm(org.snmp4j.agent.security.VACM p0)`
- `public void setWorkerPool(org.snmp4j.util.WorkerPool p0)`
- `protected void unlockManagedObjectIfLockedByLookup(org.snmp4j.agent.MOServer p0, org.snmp4j.agent.ManagedObject p1, org.snmp4j.agent.mo.lock.LockRequest p2)`

---

## public class `org.snmp4j.agent.ContextEvent`
extends `java.util.EventObject`  

**Constructors:**
- `public ContextEvent(java.lang.Object p0, int p1, org.snmp4j.smi.OctetString p2)`

**Fields:**
- `public final static int CONTEXT_ADDED`
- `public final static int CONTEXT_REMOVED`

**Methods:**
- `public org.snmp4j.smi.OctetString getContext()`
- `public int getType()`

---

## public abstract interface `org.snmp4j.agent.ContextListener`
implements `java.util.EventListener`  

**Methods:**
- `public abstract void contextChanged(org.snmp4j.agent.ContextEvent p0)`

---

## public class `org.snmp4j.agent.DefaultMOContextScope`
extends `org.snmp4j.agent.DefaultMOScope`  
implements `org.snmp4j.agent.MOContextScope`  

**Constructors:**
- `public DefaultMOContextScope(org.snmp4j.agent.MOContextScope p0)`
- `public DefaultMOContextScope(org.snmp4j.smi.OctetString p0, org.snmp4j.agent.MOScope p1)`
- `public DefaultMOContextScope(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OID p1, boolean p2, org.snmp4j.smi.OID p3, boolean p4)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public org.snmp4j.smi.OctetString getContext()`
- `public int hashCode()`
- `public static boolean isContextMatching(org.snmp4j.agent.MOScope p0, org.snmp4j.agent.MOScope p1)`
- `public boolean isCovered(org.snmp4j.agent.MOScope p0)`
- `public boolean isOverlapping(org.snmp4j.agent.MOScope p0)`
- `public void setContext(org.snmp4j.smi.OctetString p0)`
- `public java.lang.String toString()`

---

## public class `org.snmp4j.agent.DefaultMOQuery`
implements `org.snmp4j.agent.MOQuery`  

**Constructors:**
- `public DefaultMOQuery(org.snmp4j.agent.MOContextScope p0)`
- `public DefaultMOQuery(org.snmp4j.agent.MOContextScope p0, boolean p1)`
- `public DefaultMOQuery(org.snmp4j.agent.MOContextScope p0, boolean p1, java.lang.Object p2)`

**Methods:**
- `public boolean covers(org.snmp4j.smi.OID p0)`
- `public org.snmp4j.smi.OctetString getContext()`
- `public org.snmp4j.smi.OID getLowerBound()`
- `public org.snmp4j.agent.MOContextScope getScope()`
- `public java.lang.Object getSource()`
- `public org.snmp4j.smi.OID getUpperBound()`
- `public boolean isCovered(org.snmp4j.agent.MOScope p0)`
- `public boolean isLowerIncluded()`
- `public boolean isOverlapping(org.snmp4j.agent.MOScope p0)`
- `public boolean isUpperIncluded()`
- `public boolean isWriteAccessQuery()`
- `public boolean matchesQuery(org.snmp4j.agent.ManagedObject p0)`
- `public void subtractScope(org.snmp4j.agent.MOScope p0)`
- `public java.lang.String toString()`

---

## public class `org.snmp4j.agent.DefaultMOScope`
implements `org.snmp4j.agent.MOScope`, `org.snmp4j.agent.MutableMOScope`  

**Constructors:**
- `public DefaultMOScope(org.snmp4j.agent.MOScope p0)`
- `public DefaultMOScope(org.snmp4j.smi.OID p0, boolean p1, org.snmp4j.smi.OID p2, boolean p3)`

**Fields:**
- `protected org.snmp4j.smi.OID lowerBound`
- `protected boolean lowerIncluded`
- `protected org.snmp4j.smi.OID upperBound`
- `protected boolean upperIncluded`

**Methods:**
- `public boolean covers(org.snmp4j.agent.MOScope p0)`
- `public static boolean covers(org.snmp4j.agent.MOScope p0, org.snmp4j.agent.MOScope p1)`
- `public boolean covers(org.snmp4j.smi.OID p0)`
- `public boolean equals(java.lang.Object p0)`
- `public org.snmp4j.smi.OID getLowerBound()`
- `public org.snmp4j.smi.OID getUpperBound()`
- `public int hashCode()`
- `public boolean isCovered(org.snmp4j.agent.MOScope p0)`
- `public boolean isEmpty()`
- `public boolean isLowerIncluded()`
- `public boolean isOverlapping(org.snmp4j.agent.MOScope p0)`
- `public boolean isUpperIncluded()`
- `public static boolean overlaps(org.snmp4j.agent.MOScope p0, org.snmp4j.agent.MOScope p1)`
- `public void setLowerBound(org.snmp4j.smi.OID p0)`
- `public void setLowerIncluded(boolean p0)`
- `public void setUpperBound(org.snmp4j.smi.OID p0)`
- `public void setUpperIncluded(boolean p0)`
- `public void subtractScope(org.snmp4j.agent.MOScope p0)`
- `public java.lang.String toString()`

---

## public class `org.snmp4j.agent.DefaultMOServer`
implements `org.snmp4j.agent.MOServer`  

**Constructors:**
- `public DefaultMOServer()`

**Methods:**
- `public void addContext(org.snmp4j.smi.OctetString p0)`
- `public synchronized void addContextListener(org.snmp4j.agent.ContextListener p0)`
- `public synchronized void addLookupListener(org.snmp4j.agent.MOServerLookupListener p0, org.snmp4j.agent.ManagedObject p1)`
- `protected void checkForUpdate(org.snmp4j.agent.UpdatableManagedObject p0, org.snmp4j.agent.MOQuery p1)`
- `protected void fireContextChanged(org.snmp4j.agent.ContextEvent p0)`
- `protected void fireLookupEvent(org.snmp4j.agent.ManagedObject p0, org.snmp4j.agent.MOServerLookupEvent p1)`
- `protected void fireQueryEvent(org.snmp4j.agent.ManagedObject p0, org.snmp4j.agent.MOServerLookupEvent p1)`
- `public org.snmp4j.smi.OctetString[] getContexts()`
- `public org.snmp4j.agent.mo.lock.MOLockStrategy getLockStrategy()`
- `public org.snmp4j.agent.ManagedObject getManagedObject(org.snmp4j.smi.OID p0, org.snmp4j.smi.OctetString p1)`
- `public org.snmp4j.agent.ManagedObject getManagedObject(org.snmp4j.smi.OID p0, org.snmp4j.smi.OctetString p1, boolean p2)`
- `public org.snmp4j.smi.OctetString[] getRegisteredContexts(org.snmp4j.agent.ManagedObject p0)`
- `public java.util.Map getRegisteredScopes(org.snmp4j.agent.ManagedObject p0)`
- `public java.util.SortedMap getRegistry()`
- `public org.snmp4j.agent.UpdateStrategy getUpdateStrategy()`
- `public static org.snmp4j.smi.Variable getValue(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1, org.snmp4j.smi.OID p2)`
- `public boolean isContextSupported(org.snmp4j.smi.OctetString p0)`
- `public java.util.Iterator iterator()`
- `public synchronized java.util.Iterator iterator(java.util.Comparator p0, org.snmp4j.agent.mo.MOFilter p1)`
- `public synchronized boolean lock(java.lang.Object p0, org.snmp4j.agent.ManagedObject p1)`
- `public synchronized boolean lock(java.lang.Object p0, org.snmp4j.agent.ManagedObject p1, long p2)`
- `public org.snmp4j.agent.ManagedObject lookup(org.snmp4j.agent.MOQuery p0)`
- `public <MO extends org.snmp4j.agent.ManagedObject<? extends java.lang.Object>> MO lookup(org.snmp4j.agent.MOQuery p0, org.snmp4j.agent.mo.lock.LockRequest p1, org.snmp4j.agent.MOServerLookupEvent p2, java.lang.Class p3)`
- `public void register(org.snmp4j.agent.ManagedObject p0, org.snmp4j.smi.OctetString p1) throws org.snmp4j.agent.DuplicateRegistrationException`
- `public static void registerChangeListener(org.snmp4j.agent.MOServer p0, org.snmp4j.agent.mo.MOChangeListener p1, org.snmp4j.agent.mo.MOFilter p2)`
- `public static <R extends org.snmp4j.agent.mo.MOTableRow, T extends org.snmp4j.agent.mo.MOTable<R, ? extends org.snmp4j.agent.mo.MOColumn, ? extends org.snmp4j.agent.mo.MOTableModel<R>>> void registerTableRowListener(org.snmp4j.agent.MOServer p0, org.snmp4j.agent.mo.MOTableRowListener p1)`
- `public void removeContext(org.snmp4j.smi.OctetString p0)`
- `public synchronized void removeContextListener(org.snmp4j.agent.ContextListener p0)`
- `public synchronized boolean removeLookupListener(org.snmp4j.agent.MOServerLookupListener p0, org.snmp4j.agent.ManagedObject p1)`
- `public void setLockStrategy(org.snmp4j.agent.mo.lock.MOLockStrategy p0)`
- `public void setUpdateStrategy(org.snmp4j.agent.UpdateStrategy p0)`
- `public static boolean setValue(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1, org.snmp4j.smi.VariableBinding p2)`
- `public java.lang.String toString()`
- `public synchronized boolean unlock(java.lang.Object p0, org.snmp4j.agent.ManagedObject p1)`
- `public org.snmp4j.agent.ManagedObject unregister(org.snmp4j.agent.ManagedObject p0, org.snmp4j.smi.OctetString p1)`
- `public static void unregisterChangeListener(org.snmp4j.agent.MOServer p0, org.snmp4j.agent.mo.MOChangeListener p1, org.snmp4j.agent.mo.MOFilter p2)`
- `public static <R extends org.snmp4j.agent.mo.MOTableRow, T extends org.snmp4j.agent.mo.MOTable<R, ? extends org.snmp4j.agent.mo.MOColumn, ? extends org.snmp4j.agent.mo.MOTableModel<R>>> void unregisterTableRowListener(org.snmp4j.agent.MOServer p0, org.snmp4j.agent.mo.MOTableRowListener p1)`

---

## public class `org.snmp4j.agent.DuplicateRegistrationException`
extends `org.snmp4j.agent.MOException`  

**Constructors:**
- `public DuplicateRegistrationException()`
- `public DuplicateRegistrationException(java.lang.String p0)`
- `public DuplicateRegistrationException(org.snmp4j.agent.MOScope p0)`
- `public DuplicateRegistrationException(org.snmp4j.agent.MOScope p0, org.snmp4j.agent.MOScope p1)`

**Methods:**
- `public org.snmp4j.agent.MOScope getRegisteredScope()`
- `public org.snmp4j.agent.MOScope getRegistrationScope()`

---

## public abstract interface `org.snmp4j.agent.MOAccess`

**Methods:**
- `public abstract boolean isAccessibleForCreate()`
- `public abstract boolean isAccessibleForNotify()`
- `public abstract boolean isAccessibleForRead()`
- `public abstract boolean isAccessibleForWrite()`

---

## public abstract interface `org.snmp4j.agent.MOContextScope`
implements `org.snmp4j.agent.MOScope`  

**Methods:**
- `public abstract org.snmp4j.smi.OctetString getContext()`

---

## public abstract class `org.snmp4j.agent.MOException`
extends `java.lang.Exception`  

**Constructors:**
- `public MOException()`
- `public MOException(java.lang.String p0)`
- `public MOException(java.lang.String p0, java.lang.Exception p1)`

---

## public abstract interface `org.snmp4j.agent.MOGroup`

**Methods:**
- `public abstract void registerMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1) throws org.snmp4j.agent.DuplicateRegistrationException`
- `public abstract void unregisterMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1)`

---

## public abstract interface `org.snmp4j.agent.MOQuery`
implements `org.snmp4j.agent.MOContextScope`  

**Methods:**
- `public abstract org.snmp4j.agent.MOContextScope getScope()`
- `public abstract boolean isWriteAccessQuery()`
- `public abstract boolean matchesQuery(org.snmp4j.agent.ManagedObject p0)`
- `public abstract void subtractScope(org.snmp4j.agent.MOScope p0)`

---

## public class `org.snmp4j.agent.MOQueryWithSource`
extends `org.snmp4j.agent.DefaultMOQuery`  

**Constructors:**
- `public MOQueryWithSource(org.snmp4j.agent.MOContextScope p0, boolean p1, java.lang.Object p2)`

**Methods:**
- `public java.lang.Object getSource()`
- `public static boolean isSameSource(org.snmp4j.agent.MOQuery p0, java.lang.Object p1)`

---

## public abstract interface `org.snmp4j.agent.MOScope`

**Methods:**
- `public abstract boolean covers(org.snmp4j.smi.OID p0)`
- `public abstract org.snmp4j.smi.OID getLowerBound()`
- `public abstract org.snmp4j.smi.OID getUpperBound()`
- `public abstract boolean isCovered(org.snmp4j.agent.MOScope p0)`
- `public abstract boolean isLowerIncluded()`
- `public abstract boolean isOverlapping(org.snmp4j.agent.MOScope p0)`
- `public abstract boolean isUpperIncluded()`

---

## public class `org.snmp4j.agent.MOScopeComparator`
implements `java.util.Comparator<org.snmp4j.agent.MOScope>`  

**Constructors:**
- `public MOScopeComparator()`

**Methods:**
- `public int compare(org.snmp4j.agent.MOScope p0, org.snmp4j.agent.MOScope p1)`
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public static boolean isQueryContextMatching(org.snmp4j.agent.MOQuery p0, org.snmp4j.agent.MOScope p1)`

---

## public abstract interface `org.snmp4j.agent.MOServer`

**Methods:**
- `public abstract void addContext(org.snmp4j.smi.OctetString p0)`
- `public abstract void addContextListener(org.snmp4j.agent.ContextListener p0)`
- `public abstract void addLookupListener(org.snmp4j.agent.MOServerLookupListener p0, org.snmp4j.agent.ManagedObject p1)`
- `public abstract org.snmp4j.smi.OctetString[] getContexts()`
- `public abstract org.snmp4j.smi.OctetString[] getRegisteredContexts(org.snmp4j.agent.ManagedObject p0)`
- `public abstract java.util.Map getRegisteredScopes(org.snmp4j.agent.ManagedObject p0)`
- `public abstract boolean isContextSupported(org.snmp4j.smi.OctetString p0)`
- `public abstract java.util.Iterator iterator()`
- `public default java.util.Iterator iterator(java.util.Comparator p0)`
- `public abstract java.util.Iterator iterator(java.util.Comparator p0, org.snmp4j.agent.mo.MOFilter p1)`
- `public abstract boolean lock(java.lang.Object p0, org.snmp4j.agent.ManagedObject p1)`
- `public abstract boolean lock(java.lang.Object p0, org.snmp4j.agent.ManagedObject p1, long p2)`
- `public default org.snmp4j.agent.ManagedObject lookup(org.snmp4j.agent.MOQuery p0)`
- `public default <MO extends org.snmp4j.agent.ManagedObject<? extends java.lang.Object>> MO lookup(org.snmp4j.agent.MOQuery p0, java.lang.Class p1)`
- `public default org.snmp4j.agent.ManagedObject lookup(org.snmp4j.agent.MOQuery p0, org.snmp4j.agent.mo.lock.LockRequest p1)`
- `public default org.snmp4j.agent.ManagedObject lookup(org.snmp4j.agent.MOQuery p0, org.snmp4j.agent.mo.lock.LockRequest p1, org.snmp4j.agent.MOServerLookupEvent p2)`
- `public abstract <MO extends org.snmp4j.agent.ManagedObject<? extends java.lang.Object>> MO lookup(org.snmp4j.agent.MOQuery p0, org.snmp4j.agent.mo.lock.LockRequest p1, org.snmp4j.agent.MOServerLookupEvent p2, java.lang.Class p3)`
- `public abstract void register(org.snmp4j.agent.ManagedObject p0, org.snmp4j.smi.OctetString p1) throws org.snmp4j.agent.DuplicateRegistrationException`
- `public default boolean registerNew(org.snmp4j.agent.ManagedObject p0, org.snmp4j.smi.OctetString p1)`
- `public abstract void removeContext(org.snmp4j.smi.OctetString p0)`
- `public abstract void removeContextListener(org.snmp4j.agent.ContextListener p0)`
- `public abstract boolean removeLookupListener(org.snmp4j.agent.MOServerLookupListener p0, org.snmp4j.agent.ManagedObject p1)`
- `public abstract boolean unlock(java.lang.Object p0, org.snmp4j.agent.ManagedObject p1)`
- `public abstract org.snmp4j.agent.ManagedObject unregister(org.snmp4j.agent.ManagedObject p0, org.snmp4j.smi.OctetString p1)`

---

## public class `org.snmp4j.agent.MOServerLookupEvent`
extends `java.util.EventObject`  

**Constructors:**
- `public MOServerLookupEvent(java.lang.Object p0, org.snmp4j.agent.ManagedObject p1, org.snmp4j.agent.MOQuery p2, org.snmp4j.agent.MOServerLookupEvent$IntendedUse p3)`
- `public MOServerLookupEvent(java.lang.Object p0, org.snmp4j.agent.ManagedObject p1, org.snmp4j.agent.MOQuery p2, org.snmp4j.agent.MOServerLookupEvent$IntendedUse p3, boolean p4)`

**Methods:**
- `public synchronized boolean addCompletionListener(org.snmp4j.agent.MOServerLookupListener p0)`
- `public synchronized void completedUse(java.lang.Object p0)`
- `public org.snmp4j.agent.MOServerLookupEvent$IntendedUse getIntendedUse()`
- `public org.snmp4j.agent.ManagedObject getLookupResult()`
- `public org.snmp4j.agent.MOQuery getQuery()`
- `public boolean isCompletionCallbackAvailable()`
- `public synchronized boolean removeCompletionListener(org.snmp4j.agent.MOServerLookupListener p0)`
- `public void setLookupResult(org.snmp4j.agent.ManagedObject p0)`

---

## public final static enum `org.snmp4j.agent.MOServerLookupEvent$IntendedUse`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.snmp4j.agent.MOServerLookupEvent$IntendedUse cleanUp`
- `public final static org.snmp4j.agent.MOServerLookupEvent$IntendedUse commit`
- `public final static org.snmp4j.agent.MOServerLookupEvent$IntendedUse get`
- `public final static org.snmp4j.agent.MOServerLookupEvent$IntendedUse getNext`
- `public final static org.snmp4j.agent.MOServerLookupEvent$IntendedUse prepare`
- `public final static org.snmp4j.agent.MOServerLookupEvent$IntendedUse register`
- `public final static org.snmp4j.agent.MOServerLookupEvent$IntendedUse undefined`
- `public final static org.snmp4j.agent.MOServerLookupEvent$IntendedUse undo`
- `public final static org.snmp4j.agent.MOServerLookupEvent$IntendedUse unregister`
- `public final static org.snmp4j.agent.MOServerLookupEvent$IntendedUse update`

---

## public abstract interface `org.snmp4j.agent.MOServerLookupListener`
implements `java.util.EventListener`  

**Methods:**
- `public default void completedUse(org.snmp4j.agent.MOServerLookupEvent p0, java.lang.Object p1)`
- `public abstract void lookupEvent(org.snmp4j.agent.MOServerLookupEvent p0)`
- `public abstract void queryEvent(org.snmp4j.agent.MOServerLookupEvent p0)`

---

## public abstract interface `org.snmp4j.agent.ManagedObject`<SR extends org.snmp4j.agent.request.SubRequest<? extends java.lang.Object>>

**Methods:**
- `public abstract void cleanup(SR p0)`
- `public abstract void commit(SR p0)`
- `public abstract org.snmp4j.smi.OID find(org.snmp4j.agent.MOScope p0)`
- `public abstract void get(SR p0)`
- `public abstract org.snmp4j.agent.MOScope getScope()`
- `public abstract boolean next(SR p0)`
- `public abstract void prepare(SR p0)`
- `public abstract void undo(SR p0)`

---

## public abstract interface `org.snmp4j.agent.ManagedObjectValueAccess`<SR extends org.snmp4j.agent.request.SubRequest<? extends java.lang.Object>>
implements `org.snmp4j.agent.ManagedObject<SR>`  

**Methods:**
- `public abstract org.snmp4j.smi.Variable getValue(org.snmp4j.smi.OID p0)`
- `public abstract boolean setValue(org.snmp4j.smi.VariableBinding p0)`

---

## public abstract interface `org.snmp4j.agent.MutableMOScope`
implements `org.snmp4j.agent.MOScope`  

**Methods:**
- `public abstract void setLowerBound(org.snmp4j.smi.OID p0)`
- `public abstract void setLowerIncluded(boolean p0)`
- `public abstract void setUpperBound(org.snmp4j.smi.OID p0)`
- `public abstract void setUpperIncluded(boolean p0)`
- `public abstract void subtractScope(org.snmp4j.agent.MOScope p0)`

---

## public abstract interface `org.snmp4j.agent.NotificationOriginator`

**Methods:**
- `public abstract java.lang.Object notify(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OID p1, org.snmp4j.smi.TimeTicks p2, org.snmp4j.smi.VariableBinding[] p3)`
- `public abstract java.lang.Object notify(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OID p1, org.snmp4j.smi.VariableBinding[] p2)`

---

## public class `org.snmp4j.agent.NotificationTask`
implements `org.snmp4j.util.WorkerTask`  

**Constructors:**
- `public NotificationTask(org.snmp4j.agent.NotificationOriginator p0, org.snmp4j.smi.OctetString p1, org.snmp4j.smi.OID p2, org.snmp4j.smi.TimeTicks p3, org.snmp4j.smi.VariableBinding[] p4)`

**Methods:**
- `public org.snmp4j.smi.OctetString getContext()`
- `public org.snmp4j.smi.OID getNotificationID()`
- `public org.snmp4j.agent.NotificationOriginator getNotificationOriginator()`
- `public org.snmp4j.event.ResponseEvent[] getResponses()`
- `public org.snmp4j.smi.TimeTicks getSysUpTime()`
- `public org.snmp4j.smi.VariableBinding[] getVariableBindings()`
- `public void interrupt()`
- `public void join() throws java.lang.InterruptedException`
- `public synchronized void run()`
- `public void terminate()`

---

## public class `org.snmp4j.agent.ProxyForwardRequest`<A extends org.snmp4j.smi.Address>

**Constructors:**
- `public ProxyForwardRequest(org.snmp4j.CommandResponderEvent p0, org.snmp4j.agent.mo.snmp.CoexistenceInfo p1)`

**Methods:**
- `public org.snmp4j.agent.mo.snmp.CoexistenceInfo getCoexistenceInfo()`
- `public org.snmp4j.CommandResponderEvent getCommandEvent()`
- `public org.snmp4j.smi.OctetString getContext()`
- `public org.snmp4j.smi.OctetString getContextEngineID()`
- `public int getProxyType()`
- `public org.snmp4j.PDU getResponsePDU()`
- `public org.snmp4j.smi.OctetString getSecurityName()`
- `public void setResponsePDU(org.snmp4j.PDU p0)`
- `public java.lang.String toString()`

---

## public abstract interface `org.snmp4j.agent.ProxyForwarder`

**Fields:**
- `public final static int PROXY_TYPE_ALL`
- `public final static int PROXY_TYPE_INFORM`
- `public final static int PROXY_TYPE_NOTIFY`
- `public final static int PROXY_TYPE_READ`
- `public final static int PROXY_TYPE_WRITE`

**Methods:**
- `public abstract <A extends org.snmp4j.smi.Address> boolean forward(org.snmp4j.agent.ProxyForwardRequest p0)`

---

## public class `org.snmp4j.agent.ProxyMap`

**Constructors:**
- `public ProxyMap()`

**Methods:**
- `public org.snmp4j.agent.ProxyForwarder add(org.snmp4j.agent.ProxyForwarder p0, org.snmp4j.smi.OctetString p1, int p2)`
- `public org.snmp4j.agent.ProxyForwarder get(org.snmp4j.smi.OctetString p0, int p1)`
- `public org.snmp4j.agent.ProxyForwarder remove(org.snmp4j.smi.OctetString p0, int p1)`

---

## public abstract interface `org.snmp4j.agent.RandomAccessManagedObject`<SR extends org.snmp4j.agent.request.SubRequest<? extends java.lang.Object>>
implements `org.snmp4j.agent.ManagedObject<SR>`  

**Methods:**
- `public abstract java.util.List exportInstance(org.snmp4j.smi.OID p0)`
- `public default org.snmp4j.smi.OID getInstanceSubID(org.snmp4j.smi.OID p0)`
- `public abstract boolean importInstance(org.snmp4j.smi.OID p0, java.util.List p1, org.snmp4j.agent.io.ImportMode p2)`
- `public abstract int instanceCount()`
- `public abstract java.util.Iterator instanceIterator()`
- `public abstract boolean isVolatile()`
- `public default boolean isVolatile(org.snmp4j.smi.OID p0)`

---

## public abstract interface `org.snmp4j.agent.RegisteredManagedObject`<SR extends org.snmp4j.agent.request.SubRequest<? extends java.lang.Object>>
implements `org.snmp4j.agent.ManagedObject<SR>`  

**Methods:**
- `public abstract org.snmp4j.smi.OID getID()`

---

## public abstract interface `org.snmp4j.agent.RequestHandler`<R extends org.snmp4j.agent.request.Request<? extends java.lang.Object, ? extends java.lang.Object, ? extends java.lang.Object>>

**Methods:**
- `public abstract boolean isSupported(int p0)`
- `public abstract void processPdu(R p0, org.snmp4j.agent.MOServer p1)`

---

## public abstract interface `org.snmp4j.agent.SerializableManagedObject`<SR extends org.snmp4j.agent.request.SubRequest<? extends java.lang.Object>>
implements `org.snmp4j.agent.RegisteredManagedObject<SR>`  

**Methods:**
- `public abstract boolean isVolatile()`
- `public abstract void load(org.snmp4j.agent.io.MOInput p0) throws java.io.IOException`
- `public abstract void save(org.snmp4j.agent.io.MOOutput p0) throws java.io.IOException`

---

## public class `org.snmp4j.agent.UpdatableMOSupport`

**Constructors:**
- `public UpdatableMOSupport()`

**Methods:**
- `public java.util.Date getLastUpdate()`
- `public java.lang.Object getLastUpdateSource()`
- `public void setLastUpdate(java.util.Date p0)`
- `public void setLastUpdateNow()`
- `public void setLastUpdateSource(java.lang.Object p0)`

---

## public abstract interface `org.snmp4j.agent.UpdatableManagedObject`<SR extends org.snmp4j.agent.request.SubRequest<? extends java.lang.Object>>
implements `org.snmp4j.agent.ManagedObject<SR>`  

**Methods:**
- `public abstract java.util.Date getLastUpdate()`
- `public abstract java.lang.Object getLastUpdateSource()`
- `public abstract void update(org.snmp4j.agent.MOQuery p0)`

---

## public abstract interface `org.snmp4j.agent.UpdateStrategy`

**Methods:**
- `public abstract boolean isUpdateNeeded(org.snmp4j.agent.MOServer p0, org.snmp4j.agent.UpdatableManagedObject p1, org.snmp4j.agent.MOQuery p2)`

---

## public class `org.snmp4j.agent.io.Context`
implements `java.io.Serializable`  

**Constructors:**
- `public Context(org.snmp4j.smi.OctetString p0)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public org.snmp4j.smi.OctetString getContext()`
- `public int hashCode()`

---

## public class `org.snmp4j.agent.io.DefaultMOInput`
implements `org.snmp4j.agent.io.MOInput`  

**Constructors:**
- `public DefaultMOInput(java.io.ObjectInputStream p0)`

**Methods:**
- `public void close() throws java.io.IOException`
- `public int getImportMode()`
- `public org.snmp4j.agent.io.Context readContext() throws java.io.IOException`
- `public org.snmp4j.agent.io.IndexedVariables readIndexedVariables() throws java.io.IOException`
- `public org.snmp4j.agent.io.MOInfo readManagedObject() throws java.io.IOException`
- `public org.snmp4j.agent.io.Sequence readSequence() throws java.io.IOException`
- `public org.snmp4j.smi.Variable readVariable() throws java.io.IOException`
- `public void setOverwriteMode(int p0)`
- `public void skipContext(org.snmp4j.agent.io.Context p0) throws java.io.IOException`
- `public void skipManagedObject(org.snmp4j.agent.io.MOInfo p0) throws java.io.IOException`

---

## public class `org.snmp4j.agent.io.DefaultMOOutput`
implements `org.snmp4j.agent.io.MOOutput`  

**Constructors:**
- `public DefaultMOOutput(java.io.ObjectOutputStream p0)`

**Methods:**
- `public void close() throws java.io.IOException`
- `public void writeContextBegin(org.snmp4j.agent.io.Context p0) throws java.io.IOException`
- `public void writeContextEnd(org.snmp4j.agent.io.Context p0) throws java.io.IOException`
- `public void writeIndexedVariables(org.snmp4j.agent.io.IndexedVariables p0) throws java.io.IOException`
- `public void writeManagedObjectBegin(org.snmp4j.agent.io.MOInfo p0) throws java.io.IOException`
- `public void writeManagedObjectEnd(org.snmp4j.agent.io.MOInfo p0) throws java.io.IOException`
- `public void writeSequence(org.snmp4j.agent.io.Sequence p0) throws java.io.IOException`
- `public void writeVariable(org.snmp4j.smi.Variable p0) throws java.io.IOException`

---

## public class `org.snmp4j.agent.io.DefaultMOPersistenceProvider`
implements `org.snmp4j.agent.io.MOPersistenceProvider`  

**Constructors:**
- `public DefaultMOPersistenceProvider(org.snmp4j.agent.MOServer[] p0, java.lang.String p1)`

**Methods:**
- `public java.lang.String getDefaultURI()`
- `public java.lang.String getPersistenceProviderID()`
- `public boolean isValidPersistenceURI(java.lang.String p0)`
- `public void restore(java.lang.String p0, int p1) throws java.io.IOException`
- `public void store(java.lang.String p0) throws java.io.IOException`
- `public void store(java.lang.String p0, org.snmp4j.agent.mo.MOPriorityProvider p1) throws java.io.IOException`

---

## public final enum `org.snmp4j.agent.io.ImportMode`
extends `java.lang.Enum`  

**Fields:**
- `public final static int CREATE`
- `public final static int REPLACE_CREATE`
- `public final static int RESTORE_CHANGES`
- `public final static int UPDATE`
- `public final static int UPDATE_CREATE`
- `public final static org.snmp4j.agent.io.ImportMode create`
- `public final static org.snmp4j.agent.io.ImportMode replaceCreate`
- `public final static org.snmp4j.agent.io.ImportMode restoreChanges`
- `public final static org.snmp4j.agent.io.ImportMode update`
- `public final static org.snmp4j.agent.io.ImportMode updateCreate`

---

## public class `org.snmp4j.agent.io.IndexedVariables`
implements `java.io.Serializable`  

**Constructors:**
- `public IndexedVariables(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`

**Methods:**
- `public org.snmp4j.smi.OID getIndex()`
- `public org.snmp4j.smi.Variable[] getValues()`
- `public java.lang.String toString()`

---

## public class `org.snmp4j.agent.io.MOInfo`
implements `java.io.Serializable`  

**Constructors:**
- `public MOInfo(org.snmp4j.smi.OID p0)`
- `public MOInfo(org.snmp4j.smi.OID p0, java.lang.String p1)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public org.snmp4j.smi.OID getOID()`
- `public java.lang.String getVersion()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public abstract interface `org.snmp4j.agent.io.MOInput`

**Methods:**
- `public abstract void close() throws java.io.IOException`
- `public abstract int getImportMode()`
- `public abstract org.snmp4j.agent.io.Context readContext() throws java.io.IOException`
- `public abstract org.snmp4j.agent.io.IndexedVariables readIndexedVariables() throws java.io.IOException`
- `public abstract org.snmp4j.agent.io.MOInfo readManagedObject() throws java.io.IOException`
- `public abstract org.snmp4j.agent.io.Sequence readSequence() throws java.io.IOException`
- `public abstract org.snmp4j.smi.Variable readVariable() throws java.io.IOException`
- `public abstract void skipContext(org.snmp4j.agent.io.Context p0) throws java.io.IOException`
- `public abstract void skipManagedObject(org.snmp4j.agent.io.MOInfo p0) throws java.io.IOException`

---

## public abstract interface `org.snmp4j.agent.io.MOInputFactory`

**Methods:**
- `public abstract org.snmp4j.agent.io.MOInput createMOInput()`

---

## public abstract interface `org.snmp4j.agent.io.MOOutput`

**Methods:**
- `public abstract void close() throws java.io.IOException`
- `public abstract void writeContextBegin(org.snmp4j.agent.io.Context p0) throws java.io.IOException`
- `public abstract void writeContextEnd(org.snmp4j.agent.io.Context p0) throws java.io.IOException`
- `public abstract void writeIndexedVariables(org.snmp4j.agent.io.IndexedVariables p0) throws java.io.IOException`
- `public abstract void writeManagedObjectBegin(org.snmp4j.agent.io.MOInfo p0) throws java.io.IOException`
- `public abstract void writeManagedObjectEnd(org.snmp4j.agent.io.MOInfo p0) throws java.io.IOException`
- `public abstract void writeSequence(org.snmp4j.agent.io.Sequence p0) throws java.io.IOException`
- `public abstract void writeVariable(org.snmp4j.smi.Variable p0) throws java.io.IOException`

---

## public abstract interface `org.snmp4j.agent.io.MOOutputFactory`

**Methods:**
- `public abstract org.snmp4j.agent.io.MOOutput createMOOutput()`

---

## public abstract interface `org.snmp4j.agent.io.MOPersistenceProvider`

**Methods:**
- `public abstract java.lang.String getDefaultURI()`
- `public abstract java.lang.String getPersistenceProviderID()`
- `public abstract boolean isValidPersistenceURI(java.lang.String p0)`
- `public abstract void restore(java.lang.String p0, int p1) throws java.io.IOException`
- `public default void restore(java.lang.String p0, int p1, org.snmp4j.agent.mo.MOPriorityProvider p2) throws java.io.IOException`
- `public abstract void store(java.lang.String p0) throws java.io.IOException`
- `public abstract void store(java.lang.String p0, org.snmp4j.agent.mo.MOPriorityProvider p1) throws java.io.IOException`

---

## public class `org.snmp4j.agent.io.MOServerPersistence`

**Constructors:**
- `public MOServerPersistence(org.snmp4j.agent.MOServer p0)`
- `public MOServerPersistence(org.snmp4j.agent.MOServer[] p0)`

**Methods:**
- `public synchronized void loadData(org.snmp4j.agent.io.MOInput p0) throws java.io.IOException`
- `public synchronized void saveData(org.snmp4j.agent.io.MOOutput p0) throws java.io.IOException`
- `public void saveData(org.snmp4j.agent.io.MOOutput p0, org.snmp4j.agent.mo.MOPriorityProvider p1) throws java.io.IOException`

---

## public class `org.snmp4j.agent.io.Sequence`
implements `java.io.Serializable`  

**Constructors:**
- `public Sequence(int p0)`

**Methods:**
- `public int getSize()`

---

## public class `org.snmp4j.agent.io.prop.PropertyMOInput`
implements `org.snmp4j.agent.io.MOInput`  

**Constructors:**
- `public PropertyMOInput(java.util.Properties p0)`
- `public PropertyMOInput(java.util.Properties p0, org.snmp4j.agent.mo.util.VariableProvider p1)`
- `public PropertyMOInput(java.util.Properties p0, org.snmp4j.agent.mo.util.VariableProvider p1, org.snmp4j.agent.io.ImportMode p2)`
- `public PropertyMOInput(java.util.Properties p0, org.snmp4j.agent.mo.util.VariableProvider p1, org.snmp4j.util.OIDTextFormat p2)`

**Fields:**
- `public final static java.lang.String CONFIG_PREFIX`
- `public final static java.lang.String CONTEXTS_ID`
- `public final static java.lang.String CTX_ID`
- `public final static java.lang.String INDEX_ID`
- `public final static java.lang.String OID_ID`
- `public final static java.lang.String VALUE_ID`
- `public final static java.lang.String VERSION_ID`

**Methods:**
- `public void close() throws java.io.IOException`
- `public org.snmp4j.smi.Variable createVariableFromString(java.lang.String p0, java.lang.Class p1)`
- `public int getImportMode()`
- `public org.snmp4j.agent.io.Context readContext() throws java.io.IOException`
- `public org.snmp4j.agent.io.IndexedVariables readIndexedVariables() throws java.io.IOException`
- `public org.snmp4j.agent.io.MOInfo readManagedObject() throws java.io.IOException`
- `public org.snmp4j.agent.io.Sequence readSequence() throws java.io.IOException`
- `public org.snmp4j.smi.Variable readVariable() throws java.io.IOException`
- `public void setImportMode(int p0)`
- `public void setOidTextFormat(org.snmp4j.util.OIDTextFormat p0)`
- `public void skipContext(org.snmp4j.agent.io.Context p0) throws java.io.IOException`
- `public void skipManagedObject(org.snmp4j.agent.io.MOInfo p0) throws java.io.IOException`

---

## public abstract interface `org.snmp4j.agent.mo.ChangeableManagedObject`<SR extends org.snmp4j.agent.request.SubRequest<? extends java.lang.Object>>
implements `org.snmp4j.agent.ManagedObject<SR>`  

**Methods:**
- `public abstract void addMOChangeListener(org.snmp4j.agent.mo.MOChangeListener p0)`
- `public abstract void removeMOChangeListener(org.snmp4j.agent.mo.MOChangeListener p0)`

---

## public class `org.snmp4j.agent.mo.DefaultMOFactory`
implements `org.snmp4j.agent.mo.LinkedMOFactory`, `org.snmp4j.agent.mo.MOFactory`, `org.snmp4j.agent.mo.MOTableRowFactory<org.snmp4j.agent.mo.DefaultMOMutableRow2PC>`  

**Constructors:**
- `protected DefaultMOFactory()`

**Methods:**
- `public static void addSNMPv2TCs(org.snmp4j.agent.mo.MOFactory p0)`
- `public synchronized void addTextualConvention(org.snmp4j.agent.mo.snmp.tc.TextualConvention p0)`
- `public org.snmp4j.agent.mo.DefaultMOMutableRow2PC createRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1) throws java.lang.UnsupportedOperationException`
- `public void freeRow(org.snmp4j.agent.mo.DefaultMOMutableRow2PC p0)`
- `public static org.snmp4j.agent.mo.MOFactory getInstance()`
- `public java.lang.Object getLink(org.snmp4j.smi.OID p0)`
- `public synchronized <V extends org.snmp4j.smi.Variable> org.snmp4j.agent.mo.snmp.tc.TextualConvention getTextualConvention(java.lang.String p0, java.lang.String p1)`
- `protected java.util.Map getTextualConventions()`
- `protected synchronized void initLinkMap()`
- `public synchronized void removeTextualConvention(org.snmp4j.agent.mo.snmp.tc.TextualConvention p0)`
- `public static void setInstance(org.snmp4j.agent.mo.MOFactory p0)`
- `public void setLink(org.snmp4j.smi.OID p0, java.lang.Object p1)`

---

## public class `org.snmp4j.agent.mo.DefaultMOMutableRow2PC`
extends `org.snmp4j.agent.mo.DefaultMOTableRow`  
implements `org.snmp4j.agent.mo.MOMutableRow2PC<org.snmp4j.agent.request.SubRequest<? extends java.lang.Object>>`  

**Constructors:**
- `public DefaultMOMutableRow2PC(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`

**Methods:**
- `public void cleanup(org.snmp4j.agent.request.SubRequest p0, int p1)`
- `public void cleanupRow(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.DefaultMOTable$ChangeSet p1)`
- `public void commit(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1, int p2)`
- `public void commitRow(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1)`
- `public org.snmp4j.agent.mo.MOTableRow getBaseRow()`
- `public org.snmp4j.smi.OID getIndex()`
- `public org.snmp4j.smi.Variable getResultingValue(int p0, org.snmp4j.agent.mo.MOTableRow p1)`
- `public java.lang.Object getUserObject()`
- `public org.snmp4j.smi.Variable getValue(int p0)`
- `public void prepare(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1, int p2)`
- `public void prepareRow(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1)`
- `public void setBaseRow(org.snmp4j.agent.mo.MOTableRow p0)`
- `public void setUserObject(java.lang.Object p0)`
- `public void setValue(int p0, org.snmp4j.smi.Variable p1)`
- `public int size()`
- `public java.lang.String toString()`
- `public void undo(org.snmp4j.agent.request.SubRequest p0, int p1)`
- `public void undoRow(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.DefaultMOTable$ChangeSet p1)`

---

## public class `org.snmp4j.agent.mo.DefaultMOMutableRow2PCFactory`
implements `org.snmp4j.agent.mo.MOTableRowFactory<org.snmp4j.agent.mo.DefaultMOMutableRow2PC>`  

**Constructors:**
- `public DefaultMOMutableRow2PCFactory()`

**Methods:**
- `public org.snmp4j.agent.mo.DefaultMOMutableRow2PC createRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1) throws java.lang.UnsupportedOperationException`
- `public void freeRow(org.snmp4j.agent.mo.DefaultMOMutableRow2PC p0)`

---

## public class `org.snmp4j.agent.mo.DefaultMOMutableTableModel`<R extends org.snmp4j.agent.mo.MOTableRow>
extends `org.snmp4j.agent.mo.DefaultMOTableModel`  
implements `org.snmp4j.agent.mo.MOMutableTableModel<R>`  

**Constructors:**
- `public DefaultMOMutableTableModel()`

**Fields:**
- `protected org.snmp4j.agent.mo.MOTableRowFactory rowFactory`

**Methods:**
- `public synchronized void addMOTableModelListener(org.snmp4j.agent.mo.MOTableModelListener p0)`
- `public R addRow(R p0)`
- `public synchronized void clear()`
- `public synchronized java.util.List clear(org.snmp4j.agent.mo.MOTableRowFilter p0)`
- `public R createRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1) throws java.lang.UnsupportedOperationException`
- `protected void fireTableModelChanged(org.snmp4j.agent.mo.MOTableModelEvent p0)`
- `public void freeRow(R p0)`
- `public org.snmp4j.agent.mo.MOTableRowFactory getRowFactory()`
- `public synchronized java.util.List getRows(org.snmp4j.smi.OID p0, org.snmp4j.smi.OID p1)`
- `public synchronized java.util.List getRows(org.snmp4j.smi.OID p0, org.snmp4j.smi.OID p1, org.snmp4j.agent.mo.MOTableRowFilter p2)`
- `public synchronized java.util.Iterator iterator(org.snmp4j.agent.mo.MOTableRowFilter p0)`
- `public synchronized void removeMOTableModelListener(org.snmp4j.agent.mo.MOTableModelListener p0)`
- `public synchronized R removeRow(org.snmp4j.smi.OID p0)`
- `public synchronized void removeRows(org.snmp4j.smi.OID p0, org.snmp4j.smi.OID p1)`
- `public void setColumnCount(int p0)`
- `public void setRowFactory(org.snmp4j.agent.mo.MOTableRowFactory p0)`

---

## public class `org.snmp4j.agent.mo.DefaultMOMutableTableModel$FilteredRowIterator`
implements `java.util.Iterator<R>`  

**Methods:**
- `public boolean hasNext()`
- `public R next()`
- `public void remove()`

---

## public class `org.snmp4j.agent.mo.DefaultMOTable`<R extends org.snmp4j.agent.mo.MOTableRow, C extends org.snmp4j.agent.mo.MOColumn, M extends org.snmp4j.agent.mo.MOTableModel<R>>
implements `org.snmp4j.agent.MOScope`, `org.snmp4j.agent.RandomAccessManagedObject<org.snmp4j.agent.request.SubRequest<? extends java.lang.Object>>`, `org.snmp4j.agent.SerializableManagedObject<org.snmp4j.agent.request.SubRequest<? extends java.lang.Object>>`, `org.snmp4j.agent.mo.MOTable<R,C,M>`  

**Constructors:**
- `public DefaultMOTable(org.snmp4j.smi.OID p0, org.snmp4j.agent.mo.MOTableIndex p1, C[] p2)`
- `public DefaultMOTable(org.snmp4j.smi.OID p0, org.snmp4j.agent.mo.MOTableIndex p1, C[] p2, M p3)`

**Fields:**
- `protected transient java.util.List moChangeListeners`
- `protected transient java.util.List moTableRowListeners`
- `protected M model`
- `protected java.util.WeakHashMap newRows`
- `protected java.util.WeakHashMap pendingChanges`
- `protected transient java.util.List rowModificationControlColumns`

**Methods:**
- `public synchronized void addMOChangeListener(org.snmp4j.agent.mo.MOChangeListener p0)`
- `public synchronized void addMOTableRowListener(org.snmp4j.agent.mo.MOTableRowListener p0)`
- `public R addNewRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`
- `protected synchronized org.snmp4j.agent.mo.DefaultMOTable$ChangeSet addPendingChanges(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1, boolean p2)`
- `public boolean addRow(R p0)`
- `protected boolean addRowInternal(R p0, org.snmp4j.agent.mo.MOTableRowEvent$OriginType p1)`
- `public void cleanup(org.snmp4j.agent.request.SubRequest p0)`
- `public void commit(org.snmp4j.agent.request.SubRequest p0)`
- `public boolean covers(org.snmp4j.smi.OID p0)`
- `public R createRow(org.snmp4j.smi.OID p0)`
- `public R createRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`
- `public R createRowInternal(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1, org.snmp4j.agent.mo.MOTableRowEvent$OriginType p2)`
- `public java.util.List exportInstance(org.snmp4j.smi.OID p0)`
- `public org.snmp4j.smi.OID find(org.snmp4j.agent.MOScope p0)`
- `protected org.snmp4j.agent.mo.MOTableCellInfo findCell(org.snmp4j.agent.MOScope p0, org.snmp4j.agent.request.SubRequest p1)`
- `protected void fireAfterMOChange(org.snmp4j.agent.mo.MOChangeEvent p0)`
- `protected void fireAfterPrepareMOChange(org.snmp4j.agent.mo.MOChangeEvent p0)`
- `protected void fireBeforeMOChange(org.snmp4j.agent.mo.MOChangeEvent p0)`
- `protected void fireBeforePrepareMOChange(org.snmp4j.agent.mo.MOChangeEvent p0)`
- `protected void fireRowChanged(org.snmp4j.agent.mo.MOTableRowEvent p0)`
- `protected void fireRowExistsEvent(org.snmp4j.agent.mo.MOTableRowListener p0)`
- `public void get(org.snmp4j.agent.request.SubRequest p0)`
- `public org.snmp4j.agent.mo.MOTableCellInfo getCellInfo(org.snmp4j.smi.OID p0)`
- `public org.snmp4j.smi.OID getCellOID(org.snmp4j.smi.OID p0, int p1)`
- `protected int getChangesFromRequest(org.snmp4j.smi.OID p0, org.snmp4j.agent.mo.MOTableRow p1, org.snmp4j.agent.request.SubRequest p2, org.snmp4j.smi.Variable[] p3, boolean p4, boolean p5)`
- `public C getColumn(int p0)`
- `public int getColumnCount()`
- `public int getColumnIndex(int p0)`
- `public C[] getColumns()`
- `public org.snmp4j.smi.Variable[] getDefaultValues()`
- `public org.snmp4j.agent.mo.MOTableRow getDependentTableRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.OID p1)`
- `public org.snmp4j.smi.OID getID()`
- `public org.snmp4j.agent.mo.MOTableIndex getIndexDef()`
- `public final org.snmp4j.smi.OID getIndexPart(org.snmp4j.smi.OID p0)`
- `public org.snmp4j.smi.OID getInstanceSubID(org.snmp4j.smi.OID p0)`
- `public org.snmp4j.smi.OID getLowerBound()`
- `public M getModel()`
- `protected java.util.Map getNewRows(org.snmp4j.agent.request.Request p0)`
- `public org.snmp4j.smi.OID getOID()`
- `protected org.snmp4j.agent.mo.DefaultMOTable$ChangeSet getPendingChangeSet(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.smi.OID p1)`
- `protected org.snmp4j.smi.Variable[] getPersistentValues(org.snmp4j.agent.mo.MOTableRow p0)`
- `protected synchronized java.util.List getRowModificationControlColumns()`
- `public org.snmp4j.agent.mo.DefaultMOTable$ChangeSet getRowPreview(org.snmp4j.agent.request.Request p0, org.snmp4j.smi.OID p1)`
- `public org.snmp4j.agent.MOScope getScope()`
- `public org.snmp4j.smi.OID getUpperBound()`
- `protected org.snmp4j.smi.Variable getValue(org.snmp4j.agent.mo.MOTableRow p0, int p1, org.snmp4j.agent.request.SubRequest p2)`
- `public org.snmp4j.smi.Variable getValue(org.snmp4j.smi.OID p0)`
- `public org.snmp4j.smi.Variable getValue(org.snmp4j.smi.OID p0, int p1)`
- `public org.snmp4j.smi.Variable getValue(org.snmp4j.smi.OID p0, int p1, org.snmp4j.agent.request.SubRequest p2)`
- `protected boolean hasNewRows(org.snmp4j.agent.request.Request p0)`
- `public boolean importInstance(org.snmp4j.smi.OID p0, java.util.List p1, org.snmp4j.agent.io.ImportMode p2)`
- `public int instanceCount()`
- `public java.util.Iterator instanceIterator()`
- `protected synchronized boolean isChangeSetComplete(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.smi.OID p1, int p2)`
- `public boolean isCovered(org.snmp4j.agent.MOScope p0)`
- `public boolean isLowerIncluded()`
- `public boolean isOverlapping(org.snmp4j.agent.MOScope p0)`
- `public boolean isUpperIncluded()`
- `public boolean isVolatile()`
- `public boolean isVolatile(org.snmp4j.smi.OID p0)`
- `public void load(org.snmp4j.agent.io.MOInput p0) throws java.io.IOException`
- `protected void loadRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1, int p2)`
- `public boolean next(org.snmp4j.agent.request.SubRequest p0)`
- `public void prepare(org.snmp4j.agent.request.SubRequest p0)`
- `public int removeAll()`
- `public int removeAnyStorageType(java.util.Set p0)`
- `protected int removeAnyStorageType(java.util.Set p0, int p1)`
- `public synchronized void removeMOChangeListener(org.snmp4j.agent.mo.MOChangeListener p0)`
- `public synchronized void removeMOTableRowListener(org.snmp4j.agent.mo.MOTableRowListener p0)`
- `public R removeRow(org.snmp4j.smi.OID p0)`
- `protected org.snmp4j.smi.Variable[] restoreRawDataForHiddenColumns(org.snmp4j.smi.Variable[] p0, int p1)`
- `public void save(org.snmp4j.agent.io.MOOutput p0) throws java.io.IOException`
- `public void setModel(M p0)`
- `public boolean setValue(org.snmp4j.smi.VariableBinding p0)`
- `public void setVolatile(boolean p0)`
- `public java.lang.String toString()`
- `public void undo(org.snmp4j.agent.request.SubRequest p0)`
- `public void update(org.snmp4j.agent.MOScope p0)`
- `protected void update(org.snmp4j.agent.MOScope p0, org.snmp4j.agent.request.SubRequest p1)`

---

## public static class `org.snmp4j.agent.mo.DefaultMOTable$ChangeSet`
implements `org.snmp4j.agent.mo.MOTableRow`  

**Constructors:**
- `public ChangeSet(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`

**Methods:**
- `public org.snmp4j.agent.mo.MOTableRow getBaseRow()`
- `public org.snmp4j.smi.OID getIndex()`
- `public int getLastChangedColumn()`
- `public org.snmp4j.smi.Variable getValue(int p0)`
- `public void setBaseRow(org.snmp4j.agent.mo.MOTableRow p0)`
- `public void setValue(int p0, org.snmp4j.smi.Variable p1)`
- `public int size()`

---

## public class `org.snmp4j.agent.mo.DefaultMOTableModel`<R extends org.snmp4j.agent.mo.MOTableRow>
implements `org.snmp4j.agent.mo.MOTableModel<R>`  

**Constructors:**
- `public DefaultMOTableModel()`

**Fields:**
- `protected int columnCount`
- `protected java.util.SortedMap rows`

**Methods:**
- `public synchronized R addRow(R p0)`
- `public boolean containsRow(org.snmp4j.smi.OID p0)`
- `public synchronized void dump(java.io.OutputStream p0) throws java.io.IOException`
- `public synchronized org.snmp4j.smi.OID firstIndex()`
- `public synchronized R firstRow()`
- `public int getColumnCount()`
- `public synchronized R getRow(org.snmp4j.smi.OID p0)`
- `public int getRowCount()`
- `public boolean isEmpty()`
- `public synchronized java.util.Iterator iterator()`
- `public synchronized org.snmp4j.smi.OID lastIndex()`
- `public synchronized R lastRow()`
- `public synchronized java.util.Iterator tailIterator(org.snmp4j.smi.OID p0)`

---

## public class `org.snmp4j.agent.mo.DefaultMOTableRow`
implements `java.lang.Comparable<org.snmp4j.agent.mo.MOTableRow>`, `org.snmp4j.agent.mo.MOTableRow`  

**Constructors:**
- `public DefaultMOTableRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`

**Fields:**
- `protected org.snmp4j.smi.OID index`
- `protected org.snmp4j.smi.Variable[] values`

**Methods:**
- `public int compareTo(org.snmp4j.agent.mo.MOTableRow p0)`
- `public boolean equals(java.lang.Object p0)`
- `public org.snmp4j.agent.mo.MOTableRow getBaseRow()`
- `public static <V extends org.snmp4j.smi.Variable> V getColumnValue(org.snmp4j.agent.mo.MOTableRow p0, org.snmp4j.agent.mo.MOTable p1, java.lang.Class p2, org.snmp4j.agent.request.SubRequest p3)`
- `public org.snmp4j.smi.OID getIndex()`
- `public org.snmp4j.smi.Variable getValue(int p0)`
- `public int hashCode()`
- `public void setBaseRow(org.snmp4j.agent.mo.MOTableRow p0)`
- `public int size()`
- `public java.lang.String toString()`
- `protected java.lang.String toStringMembers()`

---

## public class `org.snmp4j.agent.mo.DeniableEventObject`
extends `java.util.EventObject`  

**Constructors:**
- `public DeniableEventObject(java.lang.Object p0, boolean p1)`

**Methods:**
- `public int getDenyReason()`
- `public boolean isDeniable()`
- `public void setDenyReason(int p0)`

---

## public abstract interface `org.snmp4j.agent.mo.GenericManagedObject`
implements `org.snmp4j.agent.ManagedObject<org.snmp4j.agent.request.SubRequest<? extends java.lang.Object>>`  

---

## public abstract interface `org.snmp4j.agent.mo.LinkedMOFactory`
implements `org.snmp4j.agent.mo.MOFactory`  

**Methods:**
- `public abstract java.lang.Object getLink(org.snmp4j.smi.OID p0)`
- `public abstract void setLink(org.snmp4j.smi.OID p0, java.lang.Object p1)`

---

## public class `org.snmp4j.agent.mo.MOAccessImpl`
implements `org.snmp4j.agent.MOAccess`  

**Constructors:**
- `public MOAccessImpl(int p0)`

**Fields:**
- `public final static short ACCESSIBLE_FOR_CREATE`
- `public final static short ACCESSIBLE_FOR_NOTIFY`
- `public final static short ACCESSIBLE_FOR_READ`
- `public final static short ACCESSIBLE_FOR_READ_CREATE`
- `public final static short ACCESSIBLE_FOR_READ_ONLY`
- `public final static short ACCESSIBLE_FOR_READ_WRITE`
- `public final static short ACCESSIBLE_FOR_WRITE`
- `public final static org.snmp4j.agent.MOAccess ACCESS_FOR_NOTIFY`
- `public final static org.snmp4j.agent.MOAccess ACCESS_READ_CREATE`
- `public final static org.snmp4j.agent.MOAccess ACCESS_READ_ONLY`
- `public final static org.snmp4j.agent.MOAccess ACCESS_READ_WRITE`
- `public final static org.snmp4j.agent.MOAccess ACCESS_WRITE_ONLY`

**Methods:**
- `public java.lang.String asString()`
- `public final short getAccess()`
- `public static org.snmp4j.agent.MOAccess getInstance(int p0)`
- `public boolean isAccessibleForCreate()`
- `public boolean isAccessibleForNotify()`
- `public boolean isAccessibleForRead()`
- `public boolean isAccessibleForWrite()`
- `public java.lang.String toString()`

---

## public class `org.snmp4j.agent.mo.MOChangeEvent`
extends `org.snmp4j.agent.mo.DeniableEventObject`  

**Constructors:**
- `public MOChangeEvent(java.lang.Object p0, org.snmp4j.agent.ManagedObject p1, org.snmp4j.smi.OID p2, org.snmp4j.agent.mo.MOChangeEvent$Modification p3)`
- `public MOChangeEvent(java.lang.Object p0, org.snmp4j.agent.ManagedObject p1, org.snmp4j.smi.OID p2, org.snmp4j.agent.mo.MOChangeEvent$Modification p3, org.snmp4j.agent.request.SubRequest p4)`
- `public MOChangeEvent(java.lang.Object p0, org.snmp4j.agent.ManagedObject p1, org.snmp4j.smi.OID p2, org.snmp4j.smi.Variable p3, org.snmp4j.smi.Variable p4)`
- `public MOChangeEvent(java.lang.Object p0, org.snmp4j.agent.ManagedObject p1, org.snmp4j.smi.OID p2, org.snmp4j.smi.Variable p3, org.snmp4j.smi.Variable p4, boolean p5)`
- `public MOChangeEvent(java.lang.Object p0, org.snmp4j.agent.ManagedObject p1, org.snmp4j.smi.OID p2, org.snmp4j.smi.Variable p3, org.snmp4j.smi.Variable p4, boolean p5, org.snmp4j.agent.request.SubRequest p6)`

**Methods:**
- `public org.snmp4j.agent.ManagedObject getChangedObject()`
- `public org.snmp4j.agent.mo.MOChangeEvent$Modification getModification()`
- `protected org.snmp4j.agent.mo.MOChangeEvent$Modification getModificationFromValues(org.snmp4j.smi.Variable p0, org.snmp4j.smi.Variable p1)`
- `public org.snmp4j.smi.Variable getNewValue()`
- `public org.snmp4j.smi.OID getOID()`
- `public org.snmp4j.agent.mo.MOChangeEvent$OidType getOidType()`
- `public org.snmp4j.smi.Variable getOldValue()`
- `public org.snmp4j.agent.request.SubRequest getSubRequest()`
- `public java.lang.String toString()`

---

## public final static enum `org.snmp4j.agent.mo.MOChangeEvent$Modification`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.snmp4j.agent.mo.MOChangeEvent$Modification added`
- `public final static org.snmp4j.agent.mo.MOChangeEvent$Modification created`
- `public final static org.snmp4j.agent.mo.MOChangeEvent$Modification removed`
- `public final static org.snmp4j.agent.mo.MOChangeEvent$Modification updated`

---

## public final static enum `org.snmp4j.agent.mo.MOChangeEvent$OidType`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.snmp4j.agent.mo.MOChangeEvent$OidType fullyQualified`
- `public final static org.snmp4j.agent.mo.MOChangeEvent$OidType index`
- `public final static org.snmp4j.agent.mo.MOChangeEvent$OidType instanceSuffix`

---

## public abstract interface `org.snmp4j.agent.mo.MOChangeListener`
implements `java.util.EventListener`  

**Methods:**
- `public abstract void afterMOChange(org.snmp4j.agent.mo.MOChangeEvent p0)`
- `public abstract void afterPrepareMOChange(org.snmp4j.agent.mo.MOChangeEvent p0)`
- `public abstract void beforeMOChange(org.snmp4j.agent.mo.MOChangeEvent p0)`
- `public abstract void beforePrepareMOChange(org.snmp4j.agent.mo.MOChangeEvent p0)`

---

## public class `org.snmp4j.agent.mo.MOColumn`<V extends org.snmp4j.smi.Variable>
implements `java.lang.Comparable<org.snmp4j.agent.mo.MOColumn<V>>`  

**Constructors:**
- `public MOColumn(int p0, int p1)`
- `public MOColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2)`

**Methods:**
- `public int compareTo(org.snmp4j.agent.mo.MOColumn p0)`
- `public void get(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1, int p2)`
- `public org.snmp4j.agent.MOAccess getAccess()`
- `public int getColumnID()`
- `public org.snmp4j.smi.Variable getRestoreValue(org.snmp4j.smi.Variable[] p0, int p1)`
- `public org.snmp4j.smi.Variable getStoreValue(org.snmp4j.agent.mo.MOTableRow p0, int p1)`
- `public int getSyntax()`
- `public org.snmp4j.agent.mo.MOTable getTable()`
- `public V getValue(org.snmp4j.agent.mo.MOTableRow p0, int p1, org.snmp4j.agent.request.SubRequest p2)`
- `public boolean isVolatile(org.snmp4j.agent.mo.MOTableRow p0, int p1)`
- `public void setAccess(org.snmp4j.agent.MOAccess p0)`
- `public void setColumnID(int p0)`
- `public void setSyntax(int p0)`
- `public <R extends org.snmp4j.agent.mo.MOTableRow> void setTable(org.snmp4j.agent.mo.MOTable p0)`
- `public java.lang.String toString()`

---

## public abstract interface `org.snmp4j.agent.mo.MOFactory`

**Methods:**
- `public abstract void addTextualConvention(org.snmp4j.agent.mo.snmp.tc.TextualConvention p0)`
- `public default org.snmp4j.agent.MOAccess createAccess(int p0)`
- `public default <V extends org.snmp4j.smi.Variable> org.snmp4j.agent.mo.MOColumn createColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2)`
- `public default <V extends org.snmp4j.smi.Variable> org.snmp4j.agent.mo.MOColumn createColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2, V p3, boolean p4)`
- `public default <V extends org.snmp4j.smi.Variable> org.snmp4j.agent.mo.MOColumn createColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2, V p3, boolean p4, java.lang.String p5, java.lang.String p6)`
- `public default <V extends org.snmp4j.smi.Variable> org.snmp4j.agent.mo.MOColumn createColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2, java.lang.String p3, java.lang.String p4)`
- `public default org.snmp4j.agent.mo.MOTableIndex createIndex(org.snmp4j.agent.mo.MOTableSubIndex[] p0, boolean p1)`
- `public default org.snmp4j.agent.mo.MOTableIndex createIndex(org.snmp4j.agent.mo.MOTableSubIndex[] p0, boolean p1, org.snmp4j.agent.mo.MOTableIndexValidator p2)`
- `public default <V extends org.snmp4j.smi.Variable> org.snmp4j.agent.mo.MOScalar createScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, V p2)`
- `public default <V extends org.snmp4j.smi.Variable> org.snmp4j.agent.mo.MOScalar createScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, V p2, java.lang.String p3, java.lang.String p4)`
- `public default org.snmp4j.agent.mo.MOTableSubIndex createSubIndex(org.snmp4j.smi.OID p0, int p1)`
- `public default org.snmp4j.agent.mo.MOTableSubIndex createSubIndex(org.snmp4j.smi.OID p0, int p1, int p2, int p3)`
- `public default <R extends org.snmp4j.agent.mo.MOTableRow, M extends org.snmp4j.agent.mo.MOTableModel<R>> org.snmp4j.agent.mo.MOTable createTable(org.snmp4j.smi.OID p0, org.snmp4j.agent.mo.MOTableIndex p1, org.snmp4j.agent.mo.MOColumn[] p2)`
- `public default <R extends org.snmp4j.agent.mo.MOTableRow, M extends org.snmp4j.agent.mo.MOTableModel<R>> org.snmp4j.agent.mo.MOTable createTable(org.snmp4j.smi.OID p0, org.snmp4j.agent.mo.MOTableIndex p1, org.snmp4j.agent.mo.MOColumn[] p2, M p3)`
- `public default <R extends org.snmp4j.agent.mo.MOTableRow, M extends org.snmp4j.agent.mo.MOTableModel<? extends R>> M createTableModel(org.snmp4j.smi.OID p0, org.snmp4j.agent.mo.MOTableIndex p1, org.snmp4j.agent.mo.MOColumn[] p2)`
- `public default <BaseRow extends org.snmp4j.agent.mo.MOTableRow, DependentRow extends org.snmp4j.agent.mo.MOTableRow> org.snmp4j.agent.mo.MOTableRelation createTableRelation(org.snmp4j.agent.mo.MOTable p0, org.snmp4j.agent.mo.MOTable p1)`
- `public default org.snmp4j.agent.mo.snmp.SysUpTime getSysUpTime(org.snmp4j.smi.OctetString p0)`
- `public abstract <V extends org.snmp4j.smi.Variable> org.snmp4j.agent.mo.snmp.tc.TextualConvention getTextualConvention(java.lang.String p0, java.lang.String p1)`
- `public abstract void removeTextualConvention(org.snmp4j.agent.mo.snmp.tc.TextualConvention p0)`

---

## public class `org.snmp4j.agent.mo.MOFactoryAdapter`
implements `org.snmp4j.agent.mo.MOFactory`  

**Constructors:**
- `public MOFactoryAdapter(org.snmp4j.agent.mo.MOFactory p0)`

**Methods:**
- `public void addTextualConvention(org.snmp4j.agent.mo.snmp.tc.TextualConvention p0)`
- `public org.snmp4j.agent.MOAccess createAccess(int p0)`
- `public <V extends org.snmp4j.smi.Variable> org.snmp4j.agent.mo.MOColumn createColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2)`
- `public <V extends org.snmp4j.smi.Variable> org.snmp4j.agent.mo.MOColumn createColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2, V p3, boolean p4)`
- `public <V extends org.snmp4j.smi.Variable> org.snmp4j.agent.mo.MOColumn createColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2, V p3, boolean p4, java.lang.String p5, java.lang.String p6)`
- `public <V extends org.snmp4j.smi.Variable> org.snmp4j.agent.mo.MOColumn createColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2, java.lang.String p3, java.lang.String p4)`
- `public org.snmp4j.agent.mo.MOTableIndex createIndex(org.snmp4j.agent.mo.MOTableSubIndex[] p0, boolean p1)`
- `public org.snmp4j.agent.mo.MOTableIndex createIndex(org.snmp4j.agent.mo.MOTableSubIndex[] p0, boolean p1, org.snmp4j.agent.mo.MOTableIndexValidator p2)`
- `public <V extends org.snmp4j.smi.Variable> org.snmp4j.agent.mo.MOScalar createScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, V p2)`
- `public <V extends org.snmp4j.smi.Variable> org.snmp4j.agent.mo.MOScalar createScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, V p2, java.lang.String p3, java.lang.String p4)`
- `public org.snmp4j.agent.mo.MOTableSubIndex createSubIndex(org.snmp4j.smi.OID p0, int p1)`
- `public org.snmp4j.agent.mo.MOTableSubIndex createSubIndex(org.snmp4j.smi.OID p0, int p1, int p2, int p3)`
- `public <R extends org.snmp4j.agent.mo.MOTableRow, M extends org.snmp4j.agent.mo.MOTableModel<R>> org.snmp4j.agent.mo.MOTable createTable(org.snmp4j.smi.OID p0, org.snmp4j.agent.mo.MOTableIndex p1, org.snmp4j.agent.mo.MOColumn[] p2)`
- `public <R extends org.snmp4j.agent.mo.MOTableRow, M extends org.snmp4j.agent.mo.MOTableModel<R>> org.snmp4j.agent.mo.MOTable createTable(org.snmp4j.smi.OID p0, org.snmp4j.agent.mo.MOTableIndex p1, org.snmp4j.agent.mo.MOColumn[] p2, M p3)`
- `public <R extends org.snmp4j.agent.mo.MOTableRow, M extends org.snmp4j.agent.mo.MOTableModel<? extends R>> M createTableModel(org.snmp4j.smi.OID p0, org.snmp4j.agent.mo.MOTableIndex p1, org.snmp4j.agent.mo.MOColumn[] p2)`
- `public <BaseRow extends org.snmp4j.agent.mo.MOTableRow, DependentRow extends org.snmp4j.agent.mo.MOTableRow> org.snmp4j.agent.mo.MOTableRelation createTableRelation(org.snmp4j.agent.mo.MOTable p0, org.snmp4j.agent.mo.MOTable p1)`
- `public org.snmp4j.agent.mo.snmp.SysUpTime getSysUpTime(org.snmp4j.smi.OctetString p0)`
- `public <V extends org.snmp4j.smi.Variable> org.snmp4j.agent.mo.snmp.tc.TextualConvention getTextualConvention(java.lang.String p0, java.lang.String p1)`
- `public void removeTextualConvention(org.snmp4j.agent.mo.snmp.tc.TextualConvention p0)`

---

## public abstract interface `org.snmp4j.agent.mo.MOFilter`

**Methods:**
- `public abstract boolean passesFilter(org.snmp4j.agent.ManagedObject p0)`

---

## public class `org.snmp4j.agent.mo.MOGroupImpl`
implements `org.snmp4j.agent.MOGroup`  

**Constructors:**
- `public MOGroupImpl()`

**Methods:**
- `public boolean addInstance(org.snmp4j.agent.ManagedObject p0)`
- `public void registerMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1) throws org.snmp4j.agent.DuplicateRegistrationException`
- `public boolean removeInstance(org.snmp4j.agent.ManagedObject p0)`
- `public void unregisterMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1)`

---

## public class `org.snmp4j.agent.mo.MOMutableColumn`<V extends org.snmp4j.smi.Variable>
extends `org.snmp4j.agent.mo.MOColumn`  

**Constructors:**
- `public MOMutableColumn(int p0, int p1)`
- `public MOMutableColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2)`
- `public MOMutableColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2, V p3)`
- `public MOMutableColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2, V p3, boolean p4)`

**Methods:**
- `public synchronized void addMOValueValidationListener(org.snmp4j.agent.mo.MOValueValidationListener p0)`
- `public void cleanup(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1, int p2)`
- `public void commit(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1, org.snmp4j.agent.mo.MOTableRow p2, int p3)`
- `public V getDefaultValue()`
- `public boolean isMandatory()`
- `public boolean isMutableInService()`
- `public void prepare(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1, org.snmp4j.agent.mo.MOTableRow p2, int p3)`
- `public synchronized void removeMOValueValidationListener(org.snmp4j.agent.mo.MOValueValidationListener p0)`
- `public void setDefaultValue(V p0)`
- `public void setMandatory(boolean p0)`
- `public void setMutableInService(boolean p0)`
- `public java.lang.String toString()`
- `public void undo(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1, int p2)`
- `public synchronized int validate(V p0, V p1)`
- `protected boolean validateSetRequest(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1, int p2)`

---

## public abstract interface `org.snmp4j.agent.mo.MOMutableRow2PC`<SR extends org.snmp4j.agent.request.SubRequest<? extends java.lang.Object>>
implements `org.snmp4j.agent.mo.MOMutableTableRow`  

**Methods:**
- `public abstract void cleanup(SR p0, int p1)`
- `public abstract void cleanupRow(SR p0, org.snmp4j.agent.mo.DefaultMOTable$ChangeSet p1)`
- `public abstract void commit(SR p0, org.snmp4j.agent.mo.MOTableRow p1, int p2)`
- `public abstract void commitRow(SR p0, org.snmp4j.agent.mo.MOTableRow p1)`
- `public abstract void prepare(SR p0, org.snmp4j.agent.mo.MOTableRow p1, int p2)`
- `public abstract void prepareRow(SR p0, org.snmp4j.agent.mo.MOTableRow p1)`
- `public abstract void undo(SR p0, int p1)`
- `public abstract void undoRow(SR p0, org.snmp4j.agent.mo.DefaultMOTable$ChangeSet p1)`

---

## public abstract interface `org.snmp4j.agent.mo.MOMutableTableModel`<R extends org.snmp4j.agent.mo.MOTableRow>
implements `org.snmp4j.agent.mo.MOTableModel<R>`, `org.snmp4j.agent.mo.MOTableRowFactory<R>`  

**Methods:**
- `public abstract R addRow(R p0)`
- `public abstract void clear()`
- `public abstract java.util.List clear(org.snmp4j.agent.mo.MOTableRowFilter p0)`
- `public abstract org.snmp4j.agent.mo.MOTableRowFactory getRowFactory()`
- `public abstract R removeRow(org.snmp4j.smi.OID p0)`
- `public abstract void setRowFactory(org.snmp4j.agent.mo.MOTableRowFactory p0)`

---

## public abstract interface `org.snmp4j.agent.mo.MOMutableTableRow`
implements `org.snmp4j.agent.mo.MOTableRow`  

**Methods:**
- `public abstract void setBaseRow(org.snmp4j.agent.mo.MOTableRow p0)`
- `public abstract void setValue(int p0, org.snmp4j.smi.Variable p1)`

---

## public abstract interface `org.snmp4j.agent.mo.MOPriorityProvider`

**Methods:**
- `public abstract org.snmp4j.agent.ManagedObject getBootManagedObject(org.snmp4j.smi.OctetString p0)`
- `public abstract java.util.SortedMap getPriorityMap(org.snmp4j.smi.OctetString p0)`

---

## public class `org.snmp4j.agent.mo.MOScalar`<V extends org.snmp4j.smi.Variable>
implements `org.snmp4j.agent.MOScope`, `org.snmp4j.agent.ManagedObjectValueAccess<org.snmp4j.agent.request.SubRequest<? extends java.lang.Object>>`, `org.snmp4j.agent.RandomAccessManagedObject<org.snmp4j.agent.request.SubRequest<? extends java.lang.Object>>`, `org.snmp4j.agent.SerializableManagedObject<org.snmp4j.agent.request.SubRequest<? extends java.lang.Object>>`, `org.snmp4j.agent.mo.ChangeableManagedObject<org.snmp4j.agent.request.SubRequest<? extends java.lang.Object>>`, `org.snmp4j.agent.mo.GenericManagedObject`  

**Constructors:**
- `protected MOScalar()`
- `public MOScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, V p2)`

**Fields:**
- `protected org.snmp4j.agent.MOAccess access`
- `protected org.snmp4j.smi.OID oid`
- `protected V value`

**Methods:**
- `public synchronized void addMOChangeListener(org.snmp4j.agent.mo.MOChangeListener p0)`
- `public synchronized void addMOValueValidationListener(org.snmp4j.agent.mo.MOValueValidationListener p0)`
- `protected int changeValue(V p0)`
- `protected boolean checkRequestScope(org.snmp4j.agent.request.SubRequest p0)`
- `public void cleanup(org.snmp4j.agent.request.SubRequest p0)`
- `public void commit(org.snmp4j.agent.request.SubRequest p0)`
- `public boolean covers(org.snmp4j.smi.OID p0)`
- `public java.util.List exportInstance(org.snmp4j.smi.OID p0)`
- `public org.snmp4j.smi.OID find(org.snmp4j.agent.MOScope p0)`
- `protected synchronized void fireAfterMOChange(org.snmp4j.agent.mo.MOChangeEvent p0)`
- `protected synchronized void fireAfterPrepareMOChange(org.snmp4j.agent.mo.MOChangeEvent p0)`
- `protected synchronized void fireBeforeMOChange(org.snmp4j.agent.mo.MOChangeEvent p0)`
- `protected synchronized void fireBeforePrepareMOChange(org.snmp4j.agent.mo.MOChangeEvent p0)`
- `protected synchronized void fireValidate(org.snmp4j.agent.mo.MOValueValidationEvent p0)`
- `public void get(org.snmp4j.agent.request.SubRequest p0)`
- `public org.snmp4j.agent.MOAccess getAccess()`
- `public org.snmp4j.smi.OID getID()`
- `public org.snmp4j.smi.OID getLowerBound()`
- `public org.snmp4j.smi.OID getOid()`
- `public org.snmp4j.agent.MOScope getScope()`
- `public org.snmp4j.agent.MOScope getSingleInstanceScope()`
- `protected int getSyntax()`
- `public org.snmp4j.smi.OID getUpperBound()`
- `public V getValue()`
- `public org.snmp4j.smi.Variable getValue(org.snmp4j.smi.OID p0)`
- `public boolean importInstance(org.snmp4j.smi.OID p0, java.util.List p1, org.snmp4j.agent.io.ImportMode p2)`
- `public int instanceCount()`
- `public java.util.Iterator instanceIterator()`
- `public boolean isCovered(org.snmp4j.agent.MOScope p0)`
- `public boolean isLowerIncluded()`
- `public boolean isOverlapping(org.snmp4j.agent.MOScope p0)`
- `public boolean isUpperIncluded()`
- `public int isValueOK(org.snmp4j.agent.request.SubRequest p0)`
- `public boolean isVolatile()`
- `public synchronized void load(org.snmp4j.agent.io.MOInput p0) throws java.io.IOException`
- `public boolean next(org.snmp4j.agent.request.SubRequest p0)`
- `public void prepare(org.snmp4j.agent.request.SubRequest p0)`
- `public synchronized void removeMOChangeListener(org.snmp4j.agent.mo.MOChangeListener p0)`
- `public synchronized void removeMOValueValidationListener(org.snmp4j.agent.mo.MOValueValidationListener p0)`
- `public synchronized void save(org.snmp4j.agent.io.MOOutput p0) throws java.io.IOException`
- `public int setValue(V p0)`
- `public boolean setValue(org.snmp4j.smi.VariableBinding p0)`
- `public void setVolatile(boolean p0)`
- `public java.lang.String toString()`
- `protected java.lang.String toStringDetails()`
- `public void undo(org.snmp4j.agent.request.SubRequest p0)`

---

## public abstract interface `org.snmp4j.agent.mo.MOTable`<R extends org.snmp4j.agent.mo.MOTableRow, C extends org.snmp4j.agent.mo.MOColumn, M extends org.snmp4j.agent.mo.MOTableModel<R>>
implements `org.snmp4j.agent.ManagedObjectValueAccess<org.snmp4j.agent.request.SubRequest<? extends java.lang.Object>>`, `org.snmp4j.agent.mo.ChangeableManagedObject<org.snmp4j.agent.request.SubRequest<? extends java.lang.Object>>`, `org.snmp4j.agent.mo.GenericManagedObject`  

**Methods:**
- `public abstract void addMOTableRowListener(org.snmp4j.agent.mo.MOTableRowListener p0)`
- `public abstract R addNewRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`
- `public abstract boolean addRow(R p0)`
- `public abstract R createRow(org.snmp4j.smi.OID p0)`
- `public abstract R createRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`
- `public abstract org.snmp4j.smi.OID find(org.snmp4j.agent.MOScope p0)`
- `public abstract org.snmp4j.agent.mo.MOTableCellInfo getCellInfo(org.snmp4j.smi.OID p0)`
- `public abstract C getColumn(int p0)`
- `public abstract int getColumnCount()`
- `public abstract int getColumnIndex(int p0)`
- `public abstract C[] getColumns()`
- `public abstract org.snmp4j.smi.Variable[] getDefaultValues()`
- `public abstract org.snmp4j.agent.mo.MOTableIndex getIndexDef()`
- `public abstract org.snmp4j.smi.OID getIndexPart(org.snmp4j.smi.OID p0)`
- `public abstract M getModel()`
- `public abstract org.snmp4j.smi.OID getOID()`
- `public abstract org.snmp4j.smi.Variable getValue(org.snmp4j.smi.OID p0)`
- `public abstract org.snmp4j.smi.Variable getValue(org.snmp4j.smi.OID p0, int p1)`
- `public abstract void removeMOTableRowListener(org.snmp4j.agent.mo.MOTableRowListener p0)`
- `public abstract R removeRow(org.snmp4j.smi.OID p0)`

---

## public abstract interface `org.snmp4j.agent.mo.MOTableCellInfo`

**Methods:**
- `public abstract org.snmp4j.smi.OID getCellOID()`
- `public abstract int getColumn()`
- `public abstract int getColumnID()`
- `public abstract org.snmp4j.smi.OID getIndex()`

---

## public class `org.snmp4j.agent.mo.MOTableIndex`
implements `org.snmp4j.agent.mo.MOTableIndexValidator`  

**Constructors:**
- `public MOTableIndex(org.snmp4j.agent.mo.MOTableSubIndex[] p0)`
- `public MOTableIndex(org.snmp4j.agent.mo.MOTableSubIndex[] p0, boolean p1)`
- `public MOTableIndex(org.snmp4j.agent.mo.MOTableSubIndex[] p0, boolean p1, org.snmp4j.agent.mo.MOTableIndexValidator p2)`

**Fields:**
- `public final static int MAX_INDEX_OID_LENGTH`

**Methods:**
- `public org.snmp4j.agent.mo.MOTableSubIndex getIndex(int p0)`
- `public org.snmp4j.smi.OID getIndexOID(org.snmp4j.smi.Variable[] p0)`
- `public org.snmp4j.smi.OID[] getIndexOIDs(org.snmp4j.smi.OID p0)`
- `public org.snmp4j.smi.Variable[] getIndexValues(org.snmp4j.smi.OID p0)`
- `public org.snmp4j.agent.mo.MOTableIndexValidator getValidator()`
- `public boolean isImpliedLength()`
- `public boolean isValidIndex(org.snmp4j.smi.OID p0)`
- `public void setValidator(org.snmp4j.agent.mo.MOTableIndexValidator p0)`
- `public int size()`
- `public java.lang.String toString()`

---

## public abstract interface `org.snmp4j.agent.mo.MOTableIndexValidator`

**Methods:**
- `public abstract boolean isValidIndex(org.snmp4j.smi.OID p0)`

---

## public abstract interface `org.snmp4j.agent.mo.MOTableModel`<R extends org.snmp4j.agent.mo.MOTableRow>

**Methods:**
- `public abstract boolean containsRow(org.snmp4j.smi.OID p0)`
- `public abstract org.snmp4j.smi.OID firstIndex()`
- `public abstract R firstRow()`
- `public abstract int getColumnCount()`
- `public abstract R getRow(org.snmp4j.smi.OID p0)`
- `public abstract int getRowCount()`
- `public abstract boolean isEmpty()`
- `public abstract java.util.Iterator iterator()`
- `public abstract org.snmp4j.smi.OID lastIndex()`
- `public abstract R lastRow()`
- `public abstract java.util.Iterator tailIterator(org.snmp4j.smi.OID p0)`

---

## public class `org.snmp4j.agent.mo.MOTableModelEvent`
extends `java.util.EventObject`  

**Constructors:**
- `public MOTableModelEvent(java.lang.Object p0, int p1)`
- `public MOTableModelEvent(java.lang.Object p0, int p1, org.snmp4j.agent.mo.MOTableRow p2)`
- `public MOTableModelEvent(java.lang.Object p0, int p1, org.snmp4j.agent.mo.MOTableRow p2, int p3)`

**Fields:**
- `public final static int ROW_ADDED`
- `public final static int ROW_CHANGED`
- `public final static int ROW_REMOVED`
- `public final static int TABLE_CLEAR`

**Methods:**
- `public org.snmp4j.agent.mo.MOTableRow getAffectedRow()`
- `public int getColumnIndex()`
- `public int getType()`
- `public java.lang.String toString()`

---

## public abstract interface `org.snmp4j.agent.mo.MOTableModelListener`
implements `java.util.EventListener`  

**Methods:**
- `public abstract void tableModelChanged(org.snmp4j.agent.mo.MOTableModelEvent p0)`

---

## public class `org.snmp4j.agent.mo.MOTableRelation`<BaseRow extends org.snmp4j.agent.mo.MOTableRow, DependentRow extends org.snmp4j.agent.mo.MOTableRow>

**Constructors:**
- `public MOTableRelation(org.snmp4j.agent.mo.MOTable p0, org.snmp4j.agent.mo.MOTable p1)`

**Methods:**
- `protected void addDependentRows(BaseRow p0)`
- `public void createRelationShip()`
- `protected org.snmp4j.agent.mo.MOTableRowListener createRelationShipListener()`
- `public org.snmp4j.agent.mo.MOTable getBaseTable()`
- `public org.snmp4j.smi.OID[] getDependentIndexes(BaseRow p0)`
- `public org.snmp4j.agent.mo.MOTable getDependentTable()`
- `public org.snmp4j.agent.mo.MOTableRowListener getRelationShipListener()`
- `public boolean hasDependentRow(BaseRow p0)`
- `protected org.snmp4j.agent.mo.MOTableRow[] removeDependentRows(BaseRow p0)`
- `public void removeRelationShip()`
- `protected void updateDependentRows(BaseRow p0)`

---

## protected class `org.snmp4j.agent.mo.MOTableRelation$RelationShipListener`
implements `org.snmp4j.agent.mo.MOTableRowListener<BaseRow>`  

**Constructors:**
- `protected RelationShipListener()`

**Methods:**
- `public org.snmp4j.agent.mo.MOTable getDependentTable()`
- `public void rowChanged(org.snmp4j.agent.mo.MOTableRowEvent p0)`

---

## public abstract interface `org.snmp4j.agent.mo.MOTableRow`

**Methods:**
- `public abstract org.snmp4j.agent.mo.MOTableRow getBaseRow()`
- `public abstract org.snmp4j.smi.OID getIndex()`
- `public abstract org.snmp4j.smi.Variable getValue(int p0)`
- `public abstract void setBaseRow(org.snmp4j.agent.mo.MOTableRow p0)`
- `public abstract int size()`

---

## public class `org.snmp4j.agent.mo.MOTableRowEvent`<R extends org.snmp4j.agent.mo.MOTableRow>
extends `org.snmp4j.agent.mo.DeniableEventObject`  

**Constructors:**
- `public MOTableRowEvent(java.lang.Object p0, org.snmp4j.agent.mo.MOTable p1, R p2, int p3)`
- `public MOTableRowEvent(java.lang.Object p0, org.snmp4j.agent.mo.MOTable p1, R p2, int p3, boolean p4)`
- `public MOTableRowEvent(java.lang.Object p0, org.snmp4j.agent.mo.MOTable p1, R p2, int p3, org.snmp4j.agent.mo.MOTableRowEvent$OriginType p4)`
- `public MOTableRowEvent(java.lang.Object p0, org.snmp4j.agent.mo.MOTable p1, R p2, int p3, org.snmp4j.agent.mo.MOTableRowEvent$OriginType p4, boolean p5)`
- `public MOTableRowEvent(java.lang.Object p0, org.snmp4j.agent.mo.MOTable p1, R p2, org.snmp4j.agent.mo.MOTableRow p3, int p4)`
- `public MOTableRowEvent(java.lang.Object p0, org.snmp4j.agent.mo.MOTable p1, R p2, org.snmp4j.agent.mo.MOTableRow p3, int p4, boolean p5)`
- `public MOTableRowEvent(java.lang.Object p0, org.snmp4j.agent.mo.MOTable p1, R p2, org.snmp4j.agent.mo.MOTableRow p3, int p4, boolean p5, int p6)`

**Fields:**
- `public final static int ADD`
- `public final static int CHANGE`
- `public final static int CREATE`
- `public final static int DELETE`
- `public final static int EXISTS`
- `public final static int UPDATED`

**Methods:**
- `public int getNumberOfConsecutiveEventsOfSameOrigin()`
- `public org.snmp4j.agent.mo.MOTableRowEvent$OriginType getOriginType()`
- `public org.snmp4j.agent.mo.MOTableRow getPreparedChanges()`
- `public R getRow()`
- `public org.snmp4j.agent.mo.MOTable getTable()`
- `public int getType()`
- `public int getVetoColumn()`
- `public int getVetoStatus()`
- `public boolean isSendNextEventsOfSameOrigin()`
- `public void setSendNextEventsOfSameOrigin(boolean p0)`
- `public void setVetoColumn(int p0)`
- `public void setVetoStatus(int p0)`
- `public java.lang.String toString()`

---

## public final static enum `org.snmp4j.agent.mo.MOTableRowEvent$OriginType`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.snmp4j.agent.mo.MOTableRowEvent$OriginType external`
- `public final static org.snmp4j.agent.mo.MOTableRowEvent$OriginType internal`

---

## public abstract interface `org.snmp4j.agent.mo.MOTableRowFactory`<R extends org.snmp4j.agent.mo.MOTableRow>

**Methods:**
- `public abstract R createRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1) throws java.lang.UnsupportedOperationException`
- `public abstract void freeRow(R p0)`

---

## public abstract interface `org.snmp4j.agent.mo.MOTableRowFilter`<R extends org.snmp4j.agent.mo.MOTableRow>

**Methods:**
- `public abstract boolean passesFilter(R p0)`

---

## public abstract interface `org.snmp4j.agent.mo.MOTableRowListener`<R extends org.snmp4j.agent.mo.MOTableRow>
implements `java.util.EventListener`  

**Methods:**
- `public abstract void rowChanged(org.snmp4j.agent.mo.MOTableRowEvent p0)`

---

## public class `org.snmp4j.agent.mo.MOTableSubIndex`

**Constructors:**
- `public MOTableSubIndex(int p0)`
- `public MOTableSubIndex(int p0, int p1, int p2)`
- `public MOTableSubIndex(org.snmp4j.smi.OID p0, int p1)`
- `public MOTableSubIndex(org.snmp4j.smi.OID p0, int p1, int p2, int p3)`

**Methods:**
- `public int getMaxLength()`
- `public int getMinLength()`
- `public org.snmp4j.smi.OID getOid()`
- `public int getSmiSyntax()`
- `public java.lang.String toString()`

---

## public class `org.snmp4j.agent.mo.MOValueValidationEvent`
extends `java.util.EventObject`  

**Constructors:**
- `public MOValueValidationEvent(java.lang.Object p0, org.snmp4j.smi.Variable p1, org.snmp4j.smi.Variable p2)`

**Methods:**
- `public org.snmp4j.smi.Variable getNewValue()`
- `public org.snmp4j.smi.Variable getOldValue()`
- `public int getValidationStatus()`
- `public void setValidationStatus(int p0)`

---

## public abstract interface `org.snmp4j.agent.mo.MOValueValidationListener`
implements `java.util.EventListener`  

**Methods:**
- `public abstract void validate(org.snmp4j.agent.mo.MOValueValidationEvent p0)`

---

## public abstract interface `org.snmp4j.agent.mo.RowModificationControlColumn`

**Methods:**
- `public abstract void prepareRow(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOMutableTableRow p1, org.snmp4j.agent.mo.MOTableRow p2)`

---

## public class `org.snmp4j.agent.mo.ext.AgentppSimulationMib`
implements `org.snmp4j.agent.MOGroup`  

**Constructors:**
- `public AgentppSimulationMib()`

**Fields:**
- `public final static org.snmp4j.smi.OID oidAgentppSimDeleteRow`
- `public final static org.snmp4j.smi.OID oidAgentppSimDeleteTableContents`
- `public final static org.snmp4j.smi.OID oidAgentppSimMode`

**Methods:**
- `public void registerMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1) throws org.snmp4j.agent.DuplicateRegistrationException`
- `public void unregisterMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1)`

---

## public class `org.snmp4j.agent.mo.ext.AgentppSimulationMib$AgentppSimDeleteRow`
extends `org.snmp4j.agent.mo.MOScalar`  

**Methods:**
- `public int isValueOK(org.snmp4j.agent.request.SubRequest p0)`
- `public int setValue(org.snmp4j.smi.OID p0)`

---

## public class `org.snmp4j.agent.mo.ext.AgentppSimulationMib$AgentppSimDeleteTableContents`
extends `org.snmp4j.agent.mo.MOScalar`  

**Methods:**
- `public int isValueOK(org.snmp4j.agent.request.SubRequest p0)`
- `public int setValue(org.snmp4j.smi.OID p0)`

---

## public class `org.snmp4j.agent.mo.ext.AgentppSimulationMib$AgentppSimMode`
extends `org.snmp4j.agent.mo.snmp.EnumeratedScalar`  

**Methods:**
- `public int setValue(org.snmp4j.smi.Integer32 p0)`

---

## public final static class `org.snmp4j.agent.mo.ext.AgentppSimulationMib$AgentppSimModeEnum`

**Constructors:**
- `public AgentppSimModeEnum()`

**Fields:**
- `public final static int config`
- `public final static int oper`

---

## public class `org.snmp4j.agent.mo.ext.SimMOFactory`
extends `org.snmp4j.agent.mo.DefaultMOFactory`  

**Constructors:**
- `protected SimMOFactory()`

**Methods:**
- `public synchronized org.snmp4j.agent.MOAccess createAccess(int p0)`
- `public static synchronized org.snmp4j.agent.mo.MOFactory getInstance()`
- `public static boolean isSimulationModeEnabled()`
- `public static void setSimulationModeEnabled(boolean p0)`

---

## public class `org.snmp4j.agent.mo.ext.SimMOFactory$SimMOAccess`
extends `org.snmp4j.agent.mo.MOAccessImpl`  

**Constructors:**
- `public SimMOAccess(int p0)`

**Methods:**
- `public boolean isAccessibleForCreate()`
- `public boolean isAccessibleForWrite()`

---

## public class `org.snmp4j.agent.mo.ext.StaticMOGroup`
implements `org.snmp4j.agent.MOGroup`, `org.snmp4j.agent.mo.GenericManagedObject`  

**Constructors:**
- `public StaticMOGroup(org.snmp4j.smi.OID p0, org.snmp4j.smi.VariableBinding[] p1)`

**Methods:**
- `public void cleanup(org.snmp4j.agent.request.SubRequest p0)`
- `public void commit(org.snmp4j.agent.request.SubRequest p0)`
- `public org.snmp4j.smi.OID find(org.snmp4j.agent.MOScope p0)`
- `public void get(org.snmp4j.agent.request.SubRequest p0)`
- `public org.snmp4j.agent.MOScope getScope()`
- `public boolean next(org.snmp4j.agent.request.SubRequest p0)`
- `public void prepare(org.snmp4j.agent.request.SubRequest p0)`
- `public void registerMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1) throws org.snmp4j.agent.DuplicateRegistrationException`
- `public java.lang.String toString()`
- `public void undo(org.snmp4j.agent.request.SubRequest p0)`
- `public void unregisterMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1)`

---

## public class `org.snmp4j.agent.mo.lock.DefaultMOLockStrategy`
implements `org.snmp4j.agent.mo.lock.MOLockStrategy`  

**Constructors:**
- `public DefaultMOLockStrategy()`

**Methods:**
- `public boolean isLockNeeded(org.snmp4j.agent.ManagedObject p0, org.snmp4j.agent.MOQuery p1)`

---

## public class `org.snmp4j.agent.mo.lock.LockRequest`

**Constructors:**
- `public LockRequest(java.lang.Object p0, long p1)`

**Methods:**
- `public java.lang.Object getLockOwner()`
- `public org.snmp4j.agent.mo.lock.LockRequest$LockStatus getLockRequestStatus()`
- `public long getTimeoutMillis()`
- `public void setLockRequestStatus(org.snmp4j.agent.mo.lock.LockRequest$LockStatus p0)`

---

## public final static enum `org.snmp4j.agent.mo.lock.LockRequest$LockStatus`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.snmp4j.agent.mo.lock.LockRequest$LockStatus lockTimedOut`
- `public final static org.snmp4j.agent.mo.lock.LockRequest$LockStatus locked`
- `public final static org.snmp4j.agent.mo.lock.LockRequest$LockStatus lockedAfterTimeout`
- `public final static org.snmp4j.agent.mo.lock.LockRequest$LockStatus notRequired`
- `public final static org.snmp4j.agent.mo.lock.LockRequest$LockStatus unlocked`

---

## public abstract interface `org.snmp4j.agent.mo.lock.MOLockStrategy`

**Methods:**
- `public abstract boolean isLockNeeded(org.snmp4j.agent.ManagedObject p0, org.snmp4j.agent.MOQuery p1)`

---

## public abstract interface `org.snmp4j.agent.mo.snmp.AgentCapabilityList`

**Methods:**
- `public abstract org.snmp4j.smi.OID addSysOREntry(org.snmp4j.smi.OID p0, org.snmp4j.smi.OctetString p1)`
- `public abstract org.snmp4j.agent.mo.MOTableRow removeSysOREntry(org.snmp4j.smi.OID p0)`

---

## public class `org.snmp4j.agent.mo.snmp.AutonomousType`
extends `org.snmp4j.agent.mo.MOMutableColumn`  

**Constructors:**
- `public AutonomousType(int p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.OID p2, boolean p3)`

---

## public class `org.snmp4j.agent.mo.snmp.CoexistenceInfo`
implements `java.io.Serializable`, `java.lang.Comparable<org.snmp4j.agent.mo.snmp.CoexistenceInfo>`  

**Constructors:**
- `public CoexistenceInfo(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OctetString p1, org.snmp4j.smi.OctetString p2)`
- `public CoexistenceInfo(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OctetString p1, org.snmp4j.smi.OctetString p2, org.snmp4j.smi.OctetString p3)`

**Methods:**
- `public int compareTo(org.snmp4j.agent.mo.snmp.CoexistenceInfo p0)`
- `public boolean equals(java.lang.Object p0)`
- `public org.snmp4j.smi.OctetString getContextEngineID()`
- `public org.snmp4j.smi.OctetString getContextName()`
- `public int getMaxMessageSize()`
- `public org.snmp4j.smi.OctetString getSecurityName()`
- `public org.snmp4j.smi.OctetString getTransportTag()`
- `public int hashCode()`
- `public void setMaxMessageSize(int p0)`
- `public void setTransportTag(org.snmp4j.smi.OctetString p0)`
- `public java.lang.String toString()`

---

## public abstract interface `org.snmp4j.agent.mo.snmp.CoexistenceInfoProvider`

**Methods:**
- `public abstract org.snmp4j.agent.mo.snmp.CoexistenceInfo[] getCoexistenceInfo(org.snmp4j.smi.OctetString p0)`
- `public abstract org.snmp4j.smi.OctetString getCommunity(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OctetString p1, org.snmp4j.smi.OctetString p2)`
- `public abstract boolean passesFilter(org.snmp4j.smi.Address p0, org.snmp4j.agent.mo.snmp.CoexistenceInfo p1)`

---

## public class `org.snmp4j.agent.mo.snmp.DateAndTime`<T extends org.snmp4j.smi.OctetString>
extends `org.snmp4j.agent.mo.MOMutableColumn`  

**Constructors:**
- `public DateAndTime(int p0, org.snmp4j.agent.MOAccess p1, T p2)`
- `public DateAndTime(int p0, org.snmp4j.agent.MOAccess p1, T p2, boolean p3)`

**Methods:**
- `public static org.snmp4j.agent.mo.MOScalar createMOScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.OctetString p2, boolean p3)`
- `public static java.util.GregorianCalendar makeCalendar(org.snmp4j.smi.OctetString p0)`
- `public static org.snmp4j.smi.OctetString makeDateAndTime(java.util.GregorianCalendar p0)`
- `public static <T extends org.snmp4j.smi.OctetString> T makeDateAndTime(java.util.GregorianCalendar p0, T p1)`
- `public synchronized int validate(T p0, T p1)`
- `public static int validateDateAndTime(org.snmp4j.smi.Variable p0)`

---

## public class `org.snmp4j.agent.mo.snmp.DateAndTimeScalar`<T extends org.snmp4j.smi.OctetString>
extends `org.snmp4j.agent.mo.MOScalar`  

**Constructors:**
- `public DateAndTimeScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, T p2)`
- `public DateAndTimeScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, T p2, boolean p3)`

**Methods:**
- `public java.util.GregorianCalendar getCalendar()`
- `public T getValue()`
- `public int isValueOK(org.snmp4j.agent.request.SubRequest p0)`
- `public void setCalendar(java.util.GregorianCalendar p0)`

---

## public class `org.snmp4j.agent.mo.snmp.DisplayString`<V extends org.snmp4j.smi.OctetString>
extends `org.snmp4j.agent.mo.MOMutableColumn`  

**Constructors:**
- `public DisplayString(int p0, org.snmp4j.agent.MOAccess p1, V p2)`
- `public DisplayString(int p0, org.snmp4j.agent.MOAccess p1, V p2, boolean p3)`
- `public DisplayString(int p0, org.snmp4j.agent.MOAccess p1, V p2, boolean p3, int p4, int p5)`

**Fields:**
- `public final static int MAX_SIZE`
- `public final static int MIN_SIZE`

**Methods:**
- `public synchronized int validate(V p0, V p1)`
- `public static <V extends org.snmp4j.smi.Variable> int validateDisplayString(V p0, org.snmp4j.agent.mo.snmp.smi.ValueConstraint p1)`

---

## public static class `org.snmp4j.agent.mo.snmp.DisplayString$DisplayStringValidation`
extends `org.snmp4j.agent.mo.snmp.smi.ValueConstraintValidator`  

**Constructors:**
- `public DisplayStringValidation(int p0, int p1)`
- `public DisplayStringValidation(org.snmp4j.agent.mo.snmp.smi.Constraints p0)`

**Methods:**
- `public void validate(org.snmp4j.agent.mo.MOValueValidationEvent p0)`

---

## public class `org.snmp4j.agent.mo.snmp.DisplayStringScalar`<V extends org.snmp4j.smi.OctetString>
extends `org.snmp4j.agent.mo.MOScalar`  

**Constructors:**
- `public DisplayStringScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, V p2)`
- `public DisplayStringScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, V p2, int p3, int p4)`

---

## public class `org.snmp4j.agent.mo.snmp.Enumerated`<V extends org.snmp4j.smi.Variable>
extends `org.snmp4j.agent.mo.MOMutableColumn`  

**Constructors:**
- `public Enumerated(int p0, int p1, org.snmp4j.agent.MOAccess p2, V p3)`
- `public Enumerated(int p0, int p1, org.snmp4j.agent.MOAccess p2, V p3, boolean p4)`
- `public Enumerated(int p0, int p1, org.snmp4j.agent.MOAccess p2, V p3, boolean p4, int[] p5)`
- `public Enumerated(int p0, org.snmp4j.agent.MOAccess p1, V p2)`
- `public Enumerated(int p0, org.snmp4j.agent.MOAccess p1, V p2, boolean p3)`
- `public Enumerated(int p0, org.snmp4j.agent.MOAccess p1, V p2, boolean p3, int[] p4)`

**Methods:**
- `protected void setConstraint(org.snmp4j.agent.mo.snmp.smi.EnumerationConstraint p0)`
- `public synchronized int validate(V p0, V p1)`

---

## public class `org.snmp4j.agent.mo.snmp.EnumeratedScalar`<V extends org.snmp4j.smi.Variable>
extends `org.snmp4j.agent.mo.MOScalar`  

**Constructors:**
- `public EnumeratedScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, V p2)`
- `public EnumeratedScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, V p2, int[] p3)`

**Methods:**
- `public int isValueOK(org.snmp4j.agent.request.SubRequest p0)`
- `protected void setConstraint(org.snmp4j.agent.mo.snmp.smi.EnumerationConstraint p0)`

---

## public class `org.snmp4j.agent.mo.snmp.KeyChange`
extends `org.snmp4j.agent.mo.MOMutableColumn`  

**Constructors:**
- `public KeyChange(int p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.OctetString p2, boolean p3)`

**Methods:**
- `public static org.snmp4j.smi.OctetString changeKey(org.snmp4j.security.AuthenticationProtocol p0, org.snmp4j.smi.OctetString p1, org.snmp4j.smi.OctetString p2, int p3)`
- `public void get(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1, int p2)`

---

## public class `org.snmp4j.agent.mo.snmp.NotificationLogEvent`<A extends org.snmp4j.smi.Address>
extends `java.util.EventObject`  

**Constructors:**
- `public NotificationLogEvent(java.lang.Object p0, org.snmp4j.smi.OctetString p1, org.snmp4j.Target p2, org.snmp4j.smi.OctetString p3, org.snmp4j.smi.OctetString p4, org.snmp4j.smi.OID p5, org.snmp4j.smi.TimeTicks p6, org.snmp4j.smi.VariableBinding[] p7, long p8, boolean p9)`

**Methods:**
- `public org.snmp4j.smi.OctetString getContext()`
- `public org.snmp4j.smi.OctetString getContextEngineID()`
- `public long getEventID()`
- `public org.snmp4j.smi.OID getNotificationID()`
- `public org.snmp4j.smi.OctetString getOriginatorEngineID()`
- `public org.snmp4j.Target getOriginatorTarget()`
- `public org.snmp4j.smi.TimeTicks getSysUpTime()`
- `public org.snmp4j.smi.VariableBinding[] getVariables()`
- `public boolean isSubEvent()`

---

## public abstract interface `org.snmp4j.agent.mo.snmp.NotificationLogListener`
implements `java.util.EventListener`  

**Methods:**
- `public abstract <A extends org.snmp4j.smi.Address> void notificationLogEvent(org.snmp4j.agent.mo.snmp.NotificationLogEvent p0)`

---

## public class `org.snmp4j.agent.mo.snmp.NotificationLogMib`
implements `org.snmp4j.agent.MOGroup`, `org.snmp4j.agent.mo.snmp.NotificationLogListener`, `org.snmp4j.agent.mo.snmp.RowStatusListener`  

**Constructors:**
- `protected NotificationLogMib()`
- `public NotificationLogMib(org.snmp4j.agent.mo.MOFactory p0)`
- `public NotificationLogMib(org.snmp4j.agent.mo.MOFactory p0, org.snmp4j.agent.security.VACM p1, org.snmp4j.agent.mo.snmp.SnmpNotificationMIB p2)`

**Fields:**
- `public final static int colNlmConfigLogAdminStatus`
- `public final static int colNlmConfigLogEntryLimit`
- `public final static int colNlmConfigLogEntryStatus`
- `public final static int colNlmConfigLogFilterName`
- `public final static int colNlmConfigLogOperStatus`
- `public final static int colNlmConfigLogStorageType`
- `public final static int colNlmLogContextEngineID`
- `public final static int colNlmLogContextName`
- `public final static int colNlmLogDateAndTime`
- `public final static int colNlmLogEngineID`
- `public final static int colNlmLogEngineTAddress`
- `public final static int colNlmLogEngineTDomain`
- `public final static int colNlmLogNotificationID`
- `public final static int colNlmLogTime`
- `public final static int colNlmLogVariableCounter32Val`
- `public final static int colNlmLogVariableCounter64Val`
- `public final static int colNlmLogVariableID`
- `public final static int colNlmLogVariableInteger32Val`
- `public final static int colNlmLogVariableIpAddressVal`
- `public final static int colNlmLogVariableOctetStringVal`
- `public final static int colNlmLogVariableOidVal`
- `public final static int colNlmLogVariableOpaqueVal`
- `public final static int colNlmLogVariableTimeTicksVal`
- `public final static int colNlmLogVariableUnsigned32Val`
- `public final static int colNlmLogVariableValueType`
- `public final static int colNlmStatsLogNotificationsBumped`
- `public final static int colNlmStatsLogNotificationsLogged`
- `public final static int idxNlmConfigLogAdminStatus`
- `public final static int idxNlmConfigLogEntryLimit`
- `public final static int idxNlmConfigLogEntryStatus`
- `public final static int idxNlmConfigLogFilterName`
- `public final static int idxNlmConfigLogOperStatus`
- `public final static int idxNlmConfigLogStorageType`
- `public final static int idxNlmLogContextEngineID`
- `public final static int idxNlmLogContextName`
- `public final static int idxNlmLogDateAndTime`
- `public final static int idxNlmLogEngineID`
- `public final static int idxNlmLogEngineTAddress`
- `public final static int idxNlmLogEngineTDomain`
- `public final static int idxNlmLogNotificationID`
- `public final static int idxNlmLogTime`
- `public final static int idxNlmLogVariableCounter32Val`
- `public final static int idxNlmLogVariableCounter64Val`
- `public final static int idxNlmLogVariableID`
- `public final static int idxNlmLogVariableInteger32Val`
- `public final static int idxNlmLogVariableIpAddressVal`
- `public final static int idxNlmLogVariableOctetStringVal`
- `public final static int idxNlmLogVariableOidVal`
- `public final static int idxNlmLogVariableOpaqueVal`
- `public final static int idxNlmLogVariableTimeTicksVal`
- `public final static int idxNlmLogVariableUnsigned32Val`
- `public final static int idxNlmLogVariableValueType`
- `public final static int idxNlmStatsLogNotificationsBumped`
- `public final static int idxNlmStatsLogNotificationsLogged`
- `public final static org.snmp4j.smi.OID oidNlmConfigGlobalAgeOut`
- `public final static org.snmp4j.smi.OID oidNlmConfigGlobalEntryLimit`
- `public final static org.snmp4j.smi.OID oidNlmConfigLogEntry`
- `public final static org.snmp4j.smi.OID oidNlmLogEntry`
- `public final static org.snmp4j.smi.OID oidNlmLogIndex`
- `public final static org.snmp4j.smi.OID oidNlmLogName`
- `public final static org.snmp4j.smi.OID oidNlmLogVariableEntry`
- `public final static org.snmp4j.smi.OID oidNlmLogVariableIndex`
- `public final static org.snmp4j.smi.OID oidNlmStatsGlobalNotificationsBumped`
- `public final static org.snmp4j.smi.OID oidNlmStatsGlobalNotificationsLogged`
- `public final static org.snmp4j.smi.OID oidNlmStatsLogEntry`
- `public final static org.snmp4j.smi.OID oidNotificationLogMib`
- `public final static org.snmp4j.smi.OID oidSnmp4jNotificationLogMode`
- `public final static java.lang.String tcDefDateAndTime`
- `public final static java.lang.String tcDefRowStatus`
- `public final static java.lang.String tcDefSnmpAdminString`
- `public final static java.lang.String tcDefSnmpEngineID`
- `public final static java.lang.String tcDefStorageType`
- `public final static java.lang.String tcDefTAddress`
- `public final static java.lang.String tcDefTDomain`
- `public final static java.lang.String tcDefTimeStamp`
- `public final static java.lang.String tcModuleSNMPv2Tc`
- `public final static java.lang.String tcModuleSnmpFrameworkMib`

**Methods:**
- `public void addImportedTCsToFactory(org.snmp4j.agent.mo.MOFactory p0)`
- `protected void addTCsToFactory(org.snmp4j.agent.mo.MOFactory p0)`
- `protected void createMO(org.snmp4j.agent.mo.MOFactory p0)`
- `public int getLogMode()`
- `public org.snmp4j.agent.mo.MOScalar getNlmConfigGlobalAgeOut()`
- `public org.snmp4j.agent.mo.MOScalar getNlmConfigGlobalEntryLimit()`
- `public org.snmp4j.agent.mo.MOTable getNlmConfigLogEntry()`
- `public org.snmp4j.agent.mo.MOTable getNlmLogEntry()`
- `public org.snmp4j.agent.mo.MOTable getNlmLogVariableEntry()`
- `public org.snmp4j.agent.mo.MOScalar getNlmStatsGlobalNotificationsBumped()`
- `public org.snmp4j.agent.mo.MOScalar getNlmStatsGlobalNotificationsLogged()`
- `public org.snmp4j.agent.mo.MOTable getNlmStatsLogEntry()`
- `public <A extends org.snmp4j.smi.Address> void notificationLogEvent(org.snmp4j.agent.mo.snmp.NotificationLogEvent p0)`
- `public void registerMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1) throws org.snmp4j.agent.DuplicateRegistrationException`
- `public void rowStatusChanged(org.snmp4j.agent.mo.snmp.RowStatusEvent p0)`
- `public void setLogMode(int p0)`
- `public void unregisterMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1)`

---

## public class `org.snmp4j.agent.mo.snmp.NotificationLogMib$NlmConfigGlobalAgeOut`
extends `org.snmp4j.agent.mo.MOScalar`  

**Methods:**
- `public org.snmp4j.smi.UnsignedInteger32 getValue()`
- `public int isValueOK(org.snmp4j.agent.request.SubRequest p0)`
- `public int setValue(org.snmp4j.smi.UnsignedInteger32 p0)`

---

## public class `org.snmp4j.agent.mo.snmp.NotificationLogMib$NlmConfigGlobalEntryLimit`
extends `org.snmp4j.agent.mo.MOScalar`  

**Methods:**
- `public void commit(org.snmp4j.agent.request.SubRequest p0)`
- `public org.snmp4j.smi.UnsignedInteger32 getValue()`
- `public int isValueOK(org.snmp4j.agent.request.SubRequest p0)`
- `public int setValue(org.snmp4j.smi.UnsignedInteger32 p0)`

---

## public final static class `org.snmp4j.agent.mo.snmp.NotificationLogMib$NlmConfigLogAdminStatusEnum`

**Constructors:**
- `public NlmConfigLogAdminStatusEnum()`

**Fields:**
- `public final static int disabled`
- `public final static int enabled`

---

## public class `org.snmp4j.agent.mo.snmp.NotificationLogMib$NlmConfigLogEntryRow`
extends `org.snmp4j.agent.mo.DefaultMOMutableRow2PC`  

**Constructors:**
- `public NlmConfigLogEntryRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`

**Methods:**
- `public org.snmp4j.smi.Integer32 getNlmConfigLogAdminStatus()`
- `public org.snmp4j.smi.UnsignedInteger32 getNlmConfigLogEntryLimit()`
- `public org.snmp4j.smi.Integer32 getNlmConfigLogEntryStatus()`
- `public org.snmp4j.smi.OctetString getNlmConfigLogFilterName()`
- `public org.snmp4j.smi.Integer32 getNlmConfigLogOperStatus()`
- `public org.snmp4j.smi.Integer32 getNlmConfigLogStorageType()`
- `public org.snmp4j.smi.Variable getValue(int p0)`
- `public org.snmp4j.smi.OctetString getViewName()`
- `public void setNlmConfigLogAdminStatus(org.snmp4j.smi.Integer32 p0)`
- `public void setNlmConfigLogEntryLimit(org.snmp4j.smi.UnsignedInteger32 p0)`
- `public void setNlmConfigLogEntryStatus(org.snmp4j.smi.Integer32 p0)`
- `public void setNlmConfigLogFilterName(org.snmp4j.smi.OctetString p0)`
- `public void setNlmConfigLogOperStatus(org.snmp4j.smi.Integer32 p0)`
- `public void setNlmConfigLogStorageType(org.snmp4j.smi.Integer32 p0)`
- `public void setValue(int p0, org.snmp4j.smi.Variable p1)`
- `public void setViewName(org.snmp4j.smi.OctetString p0)`

---

## public final static class `org.snmp4j.agent.mo.snmp.NotificationLogMib$NlmConfigLogOperStatusEnum`

**Constructors:**
- `public NlmConfigLogOperStatusEnum()`

**Fields:**
- `public final static int disabled`
- `public final static int noFilter`
- `public final static int operational`

---

## public class `org.snmp4j.agent.mo.snmp.NotificationLogMib$NlmLogEntryRow`
extends `org.snmp4j.agent.mo.DefaultMOMutableRow2PC`  

**Constructors:**
- `public NlmLogEntryRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`

**Methods:**
- `public org.snmp4j.smi.OctetString getNlmLogContextEngineID()`
- `public org.snmp4j.smi.OctetString getNlmLogContextName()`
- `public org.snmp4j.smi.OctetString getNlmLogDateAndTime()`
- `public org.snmp4j.smi.OctetString getNlmLogEngineID()`
- `public org.snmp4j.smi.OctetString getNlmLogEngineTAddress()`
- `public org.snmp4j.smi.OID getNlmLogEngineTDomain()`
- `public org.snmp4j.smi.OID getNlmLogNotificationID()`
- `public org.snmp4j.smi.TimeTicks getNlmLogTime()`
- `public org.snmp4j.smi.Variable getValue(int p0)`
- `public void setNlmLogContextEngineID(org.snmp4j.smi.OctetString p0)`
- `public void setNlmLogContextName(org.snmp4j.smi.OctetString p0)`
- `public void setNlmLogDateAndTime(org.snmp4j.smi.OctetString p0)`
- `public void setNlmLogEngineID(org.snmp4j.smi.OctetString p0)`
- `public void setNlmLogEngineTAddress(org.snmp4j.smi.OctetString p0)`
- `public void setNlmLogEngineTDomain(org.snmp4j.smi.OID p0)`
- `public void setNlmLogNotificationID(org.snmp4j.smi.OID p0)`
- `public void setNlmLogTime(org.snmp4j.smi.TimeTicks p0)`
- `public void setValue(int p0, org.snmp4j.smi.Variable p1)`

---

## public class `org.snmp4j.agent.mo.snmp.NotificationLogMib$NlmLogVariableEntryRow`
extends `org.snmp4j.agent.mo.DefaultMOMutableRow2PC`  

**Constructors:**
- `public NlmLogVariableEntryRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`

**Methods:**
- `public org.snmp4j.smi.Counter32 getNlmLogVariableCounter32Val()`
- `public org.snmp4j.smi.Counter64 getNlmLogVariableCounter64Val()`
- `public org.snmp4j.smi.OID getNlmLogVariableID()`
- `public org.snmp4j.smi.Integer32 getNlmLogVariableInteger32Val()`
- `public org.snmp4j.smi.IpAddress getNlmLogVariableIpAddressVal()`
- `public org.snmp4j.smi.OctetString getNlmLogVariableOctetStringVal()`
- `public org.snmp4j.smi.OID getNlmLogVariableOidVal()`
- `public org.snmp4j.smi.Opaque getNlmLogVariableOpaqueVal()`
- `public org.snmp4j.smi.TimeTicks getNlmLogVariableTimeTicksVal()`
- `public org.snmp4j.smi.UnsignedInteger32 getNlmLogVariableUnsigned32Val()`
- `public org.snmp4j.smi.Integer32 getNlmLogVariableValueType()`
- `public org.snmp4j.smi.Variable getValue(int p0)`
- `public void setNlmLogVariableCounter32Val(org.snmp4j.smi.Counter32 p0)`
- `public void setNlmLogVariableCounter64Val(org.snmp4j.smi.Counter64 p0)`
- `public void setNlmLogVariableID(org.snmp4j.smi.OID p0)`
- `public void setNlmLogVariableInteger32Val(org.snmp4j.smi.Integer32 p0)`
- `public void setNlmLogVariableIpAddressVal(org.snmp4j.smi.IpAddress p0)`
- `public void setNlmLogVariableOctetStringVal(org.snmp4j.smi.OctetString p0)`
- `public void setNlmLogVariableOidVal(org.snmp4j.smi.OID p0)`
- `public void setNlmLogVariableOpaqueVal(org.snmp4j.smi.Opaque p0)`
- `public void setNlmLogVariableTimeTicksVal(org.snmp4j.smi.TimeTicks p0)`
- `public void setNlmLogVariableUnsigned32Val(org.snmp4j.smi.UnsignedInteger32 p0)`
- `public void setNlmLogVariableValueType(org.snmp4j.smi.Integer32 p0)`
- `public void setValue(int p0, org.snmp4j.smi.Variable p1)`

---

## public final static class `org.snmp4j.agent.mo.snmp.NotificationLogMib$NlmLogVariableValueTypeEnum`

**Constructors:**
- `public NlmLogVariableValueTypeEnum()`

**Fields:**
- `public final static int counter32`
- `public final static int counter64`
- `public final static int integer32`
- `public final static int ipAddress`
- `public final static int objectId`
- `public final static int octetString`
- `public final static int opaque`
- `public final static int timeTicks`
- `public final static int unsigned32`

---

## public class `org.snmp4j.agent.mo.snmp.NotificationLogMib$NlmStatsLogEntryRow`
extends `org.snmp4j.agent.mo.DefaultMOMutableRow2PC`  

**Constructors:**
- `public NlmStatsLogEntryRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`

**Methods:**
- `public org.snmp4j.smi.Counter32 getNlmStatsLogNotificationsBumped()`
- `public org.snmp4j.smi.Counter32 getNlmStatsLogNotificationsLogged()`
- `public org.snmp4j.smi.Variable getValue(int p0)`
- `public void setNlmStatsLogNotificationsBumped(org.snmp4j.smi.Counter32 p0)`
- `public void setNlmStatsLogNotificationsLogged(org.snmp4j.smi.Counter32 p0)`
- `public void setValue(int p0, org.snmp4j.smi.Variable p1)`

---

## public final static class `org.snmp4j.agent.mo.snmp.NotificationLogMib$Snmp4jNotificationLogModeEnum`

**Constructors:**
- `public Snmp4jNotificationLogModeEnum()`

**Fields:**
- `public final static int fired`
- `public final static int sent`

---

## public class `org.snmp4j.agent.mo.snmp.NotificationLogMib$SnmpAdminString`
implements `org.snmp4j.agent.mo.snmp.tc.TextualConvention<org.snmp4j.smi.OctetString>`  

**Constructors:**
- `public SnmpAdminString()`

**Methods:**
- `public org.snmp4j.agent.mo.MOColumn createColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2, org.snmp4j.smi.OctetString p3, boolean p4)`
- `public org.snmp4j.smi.OctetString createInitialValue()`
- `public org.snmp4j.agent.mo.MOScalar createScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.OctetString p2)`
- `public java.lang.String getModuleName()`
- `public java.lang.String getName()`

---

## public class `org.snmp4j.agent.mo.snmp.NotificationLogMib$SnmpEngineID`
implements `org.snmp4j.agent.mo.snmp.tc.TextualConvention<org.snmp4j.smi.OctetString>`  

**Constructors:**
- `public SnmpEngineID()`

**Methods:**
- `public org.snmp4j.agent.mo.MOColumn createColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2, org.snmp4j.smi.OctetString p3, boolean p4)`
- `public org.snmp4j.smi.OctetString createInitialValue()`
- `public org.snmp4j.agent.mo.MOScalar createScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.OctetString p2)`
- `public java.lang.String getModuleName()`
- `public java.lang.String getName()`

---

## public class `org.snmp4j.agent.mo.snmp.NotificationLogMib$TAddress`
implements `org.snmp4j.agent.mo.snmp.tc.TextualConvention<org.snmp4j.smi.OctetString>`  

**Constructors:**
- `public TAddress()`

**Methods:**
- `public org.snmp4j.agent.mo.MOColumn createColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2, org.snmp4j.smi.OctetString p3, boolean p4)`
- `public org.snmp4j.smi.OctetString createInitialValue()`
- `public org.snmp4j.agent.mo.MOScalar createScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.OctetString p2)`
- `public java.lang.String getModuleName()`
- `public java.lang.String getName()`

---

## public class `org.snmp4j.agent.mo.snmp.NotificationLogMib$TDomain`
implements `org.snmp4j.agent.mo.snmp.tc.TextualConvention<org.snmp4j.smi.OID>`  

**Constructors:**
- `public TDomain()`

**Methods:**
- `public org.snmp4j.agent.mo.MOColumn createColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2, org.snmp4j.smi.OID p3, boolean p4)`
- `public org.snmp4j.smi.OID createInitialValue()`
- `public org.snmp4j.agent.mo.MOScalar createScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.OID p2)`
- `public java.lang.String getModuleName()`
- `public java.lang.String getName()`

---

## public class `org.snmp4j.agent.mo.snmp.NotificationOriginatorImpl`
implements `org.snmp4j.agent.NotificationOriginator`  

**Constructors:**
- `public NotificationOriginatorImpl(org.snmp4j.Session p0, org.snmp4j.agent.security.VACM p1, org.snmp4j.agent.mo.snmp.SysUpTime p2, org.snmp4j.agent.mo.snmp.SnmpTargetMIB p3, org.snmp4j.agent.mo.snmp.SnmpNotificationMIB p4)`
- `public NotificationOriginatorImpl(org.snmp4j.Session p0, org.snmp4j.agent.security.VACM p1, org.snmp4j.agent.mo.snmp.SysUpTime p2, org.snmp4j.agent.mo.snmp.SnmpTargetMIB p3, org.snmp4j.agent.mo.snmp.SnmpNotificationMIB p4, org.snmp4j.agent.mo.snmp.SnmpCommunityMIB p5)`

**Methods:**
- `public synchronized void addNotificationLogListener(org.snmp4j.agent.mo.snmp.NotificationLogListener p0)`
- `protected synchronized void fireNotificationLogEvent(org.snmp4j.agent.mo.snmp.NotificationLogEvent p0)`
- `public java.lang.Object notify(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OID p1, org.snmp4j.smi.TimeTicks p2, org.snmp4j.smi.VariableBinding[] p3)`
- `public java.lang.Object notify(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OID p1, org.snmp4j.smi.VariableBinding[] p2)`
- `public synchronized void removeNotificationLogListener(org.snmp4j.agent.mo.snmp.NotificationLogListener p0)`
- `protected void setContextEngineID(org.snmp4j.ScopedPDU p0, org.snmp4j.smi.OctetString p1, org.snmp4j.smi.OID p2)`
- `public void setSession(org.snmp4j.Session p0)`

---

## public class `org.snmp4j.agent.mo.snmp.ProxyForwarderImpl`
implements `org.snmp4j.agent.ProxyForwarder`  

**Constructors:**
- `public ProxyForwarderImpl(org.snmp4j.Session p0, org.snmp4j.agent.mo.snmp.SnmpProxyMIB p1, org.snmp4j.agent.mo.snmp.SnmpTargetMIB p2)`

**Methods:**
- `public synchronized void addCounterListener(org.snmp4j.event.CounterListener p0)`
- `protected synchronized void fireIncrementCounter(org.snmp4j.event.CounterEvent p0)`
- `public <A extends org.snmp4j.smi.Address> boolean forward(org.snmp4j.agent.ProxyForwardRequest p0)`
- `protected java.util.List getMatches(org.snmp4j.agent.ProxyForwardRequest p0)`
- `protected boolean matchParameters(org.snmp4j.agent.ProxyForwardRequest p0, org.snmp4j.smi.OctetString p1)`
- `protected <A extends org.snmp4j.smi.Address> boolean multipleForward(org.snmp4j.agent.ProxyForwardRequest p0)`
- `protected boolean proxyBackwardTranslation(org.snmp4j.PDU p0, org.snmp4j.PDU p1, org.snmp4j.event.ResponseEvent p2)`
- `protected void proxyForwardTranslation(org.snmp4j.agent.ProxyForwardRequest p0, org.snmp4j.PDU p1, org.snmp4j.PDU p2) throws java.lang.IllegalArgumentException`
- `public synchronized void removeCounterListener(org.snmp4j.event.CounterListener p0)`
- `public void setSession(org.snmp4j.Session p0)`
- `protected <A extends org.snmp4j.smi.Address> org.snmp4j.event.ResponseEvent singleForward(org.snmp4j.agent.ProxyForwardRequest p0)`

---

## public class `org.snmp4j.agent.mo.snmp.RowCount`
implements `org.snmp4j.smi.Variable`  

**Constructors:**
- `public RowCount()`
- `public RowCount(org.snmp4j.agent.mo.MOTable p0)`

**Methods:**
- `public java.lang.Object clone()`
- `public int compareTo(org.snmp4j.smi.Variable p0)`
- `public void decodeBER(org.snmp4j.asn1.BERInputStream p0) throws java.io.IOException`
- `public void encodeBER(java.io.OutputStream p0) throws java.io.IOException`
- `public void fromSubIndex(org.snmp4j.smi.OID p0, boolean p1)`
- `public int getBERLength()`
- `public int getBERPayloadLength()`
- `public int getSyntax()`
- `public java.lang.String getSyntaxString()`
- `public long getValue()`
- `public boolean isDynamic()`
- `public boolean isException()`
- `public int toInt()`
- `public long toLong()`
- `public org.snmp4j.smi.OID toSubIndex(boolean p0)`

---

## public class `org.snmp4j.agent.mo.snmp.RowPointer`
extends `org.snmp4j.agent.mo.MOMutableColumn`  

**Constructors:**
- `public RowPointer(int p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.OID p2, boolean p3)`
- `public RowPointer(int p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.OID p2, boolean p3, org.snmp4j.agent.mo.MOTable p4)`

**Methods:**
- `public org.snmp4j.agent.mo.MOTable getTargetTable()`
- `protected void illegalRowPointer(org.snmp4j.agent.request.SubRequest p0)`
- `public void prepare(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1, org.snmp4j.agent.mo.MOTableRow p2, int p3)`
- `public void setTargetTable(org.snmp4j.agent.mo.MOTable p0)`

---

## public class `org.snmp4j.agent.mo.snmp.RowStatus`<R extends org.snmp4j.agent.mo.MOTableRow>
extends `org.snmp4j.agent.mo.MOMutableColumn`  
implements `org.snmp4j.agent.mo.MOChangeListener`, `org.snmp4j.agent.mo.MOTableRowListener<R>`  

**Constructors:**
- `public RowStatus(int p0)`
- `public RowStatus(int p0, org.snmp4j.agent.MOAccess p1)`

**Fields:**
- `public final static int active`
- `public final static int createAndGo`
- `public final static int createAndWait`
- `public final static int destroy`
- `public final static int notExistent`
- `public final static int notInService`
- `public final static int notReady`

**Methods:**
- `public synchronized void addRowStatusListener(org.snmp4j.agent.mo.snmp.RowStatusListener p0)`
- `public void afterMOChange(org.snmp4j.agent.mo.MOChangeEvent p0)`
- `public void afterPrepareMOChange(org.snmp4j.agent.mo.MOChangeEvent p0)`
- `protected void assignNewValue(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1, int p2, int p3)`
- `public void beforeMOChange(org.snmp4j.agent.mo.MOChangeEvent p0)`
- `public void beforePrepareMOChange(org.snmp4j.agent.mo.MOChangeEvent p0)`
- `public void commit(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1, org.snmp4j.agent.mo.MOTableRow p2, int p3)`
- `protected void fireRowStatusChanged(org.snmp4j.agent.mo.snmp.RowStatusEvent p0)`
- `public void get(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1, int p2)`
- `public static org.snmp4j.smi.Integer32 getRowStatus(org.snmp4j.agent.mo.MOTableRow p0, org.snmp4j.agent.mo.MOTable p1)`
- `protected boolean isReady(org.snmp4j.agent.mo.MOTableRow p0, int p1)`
- `protected boolean isReady(org.snmp4j.agent.mo.MOTableRow p0, int p1, org.snmp4j.agent.mo.MOTableRow p2)`
- `public static boolean isRowActive(org.snmp4j.agent.mo.MOTableRow p0, int p1)`
- `public boolean isVolatile(org.snmp4j.agent.mo.MOTableRow p0, int p1)`
- `public void prepare(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1, org.snmp4j.agent.mo.MOTableRow p2, int p3)`
- `public synchronized void removeRowStatusListener(org.snmp4j.agent.mo.snmp.RowStatusListener p0)`
- `public void rowChanged(org.snmp4j.agent.mo.MOTableRowEvent p0)`
- `public <R extends org.snmp4j.agent.mo.MOTableRow> void setTable(org.snmp4j.agent.mo.MOTable p0)`
- `public void undo(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1, int p2)`
- `public void unsetTable(org.snmp4j.agent.mo.MOTable p0)`

---

## public static class `org.snmp4j.agent.mo.snmp.RowStatus$ActiveRowsFilter`<R extends org.snmp4j.agent.mo.MOTableRow>
implements `org.snmp4j.agent.mo.MOTableRowFilter<R>`  

**Constructors:**
- `public ActiveRowsFilter(int p0)`

**Methods:**
- `public boolean passesFilter(R p0)`

---

## public final static enum `org.snmp4j.agent.mo.snmp.RowStatus$RowStatusEnum`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.snmp4j.agent.mo.snmp.RowStatus$RowStatusEnum active`
- `public final static org.snmp4j.agent.mo.snmp.RowStatus$RowStatusEnum createAndGo`
- `public final static org.snmp4j.agent.mo.snmp.RowStatus$RowStatusEnum createAndWait`
- `public final static org.snmp4j.agent.mo.snmp.RowStatus$RowStatusEnum destroy`
- `public final static org.snmp4j.agent.mo.snmp.RowStatus$RowStatusEnum notExistent`
- `public final static org.snmp4j.agent.mo.snmp.RowStatus$RowStatusEnum notInService`
- `public final static org.snmp4j.agent.mo.snmp.RowStatus$RowStatusEnum notReady`

**Methods:**
- `public static org.snmp4j.agent.mo.snmp.RowStatus$RowStatusEnum fromValue(int p0)`

---

## public static class `org.snmp4j.agent.mo.snmp.RowStatus$RowStatusFilter`<R extends org.snmp4j.agent.mo.MOTableRow>
implements `org.snmp4j.agent.mo.MOTableRowFilter<R>`  

**Constructors:**
- `public RowStatusFilter(int p0, java.util.Set p1)`

**Methods:**
- `public boolean passesFilter(R p0)`

---

## public class `org.snmp4j.agent.mo.snmp.RowStatusEvent`
extends `org.snmp4j.agent.mo.DeniableEventObject`  

**Constructors:**
- `public RowStatusEvent(java.lang.Object p0, org.snmp4j.agent.mo.MOTable p1, org.snmp4j.agent.mo.MOTableRow p2, org.snmp4j.agent.mo.MOTableRow p3, int p4, int p5)`
- `public RowStatusEvent(java.lang.Object p0, org.snmp4j.agent.mo.MOTable p1, org.snmp4j.agent.mo.MOTableRow p2, org.snmp4j.agent.mo.MOTableRow p3, int p4, int p5, boolean p6)`
- `public RowStatusEvent(java.lang.Object p0, org.snmp4j.agent.mo.MOTable p1, org.snmp4j.agent.mo.MOTableRow p2, org.snmp4j.agent.mo.MOTableRow p3, int p4, int p5, boolean p6, org.snmp4j.agent.request.SubRequest p7)`

**Methods:**
- `public org.snmp4j.agent.mo.MOTableRow getChangeSet()`
- `public int getNewStatus()`
- `public int getOldStatus()`
- `public org.snmp4j.agent.request.SubRequest getRequest()`
- `public org.snmp4j.agent.mo.MOTableRow getRow()`
- `public org.snmp4j.agent.mo.MOTable getTable()`
- `public boolean isRowActivated()`
- `public boolean isRowDeactivated()`

---

## public abstract interface `org.snmp4j.agent.mo.snmp.RowStatusListener`
implements `java.util.EventListener`  

**Methods:**
- `public abstract void rowStatusChanged(org.snmp4j.agent.mo.snmp.RowStatusEvent p0)`

---

## public class `org.snmp4j.agent.mo.snmp.SNMPv2MIB`
implements `org.snmp4j.agent.MOGroup`, `org.snmp4j.agent.mo.snmp.AgentCapabilityList`, `org.snmp4j.event.CounterListener`  

**Constructors:**
- `public SNMPv2MIB(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OID p1, org.snmp4j.smi.Integer32 p2)`
- `protected SNMPv2MIB(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OID p1, org.snmp4j.smi.Integer32 p2, org.snmp4j.agent.mo.snmp.SysUpTime p3)`

**Methods:**
- `public org.snmp4j.smi.OID addSysOREntry(org.snmp4j.smi.OID p0, org.snmp4j.smi.OctetString p1)`
- `public org.snmp4j.smi.OctetString getContact()`
- `public org.snmp4j.smi.OctetString getDescr()`
- `public org.snmp4j.smi.OctetString getLocation()`
- `public org.snmp4j.smi.OctetString getName()`
- `public org.snmp4j.agent.NotificationOriginator getNotificationOriginator()`
- `public org.snmp4j.smi.OID getObjectID()`
- `public org.snmp4j.smi.Integer32 getServices()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpEnableAuthenTraps()`
- `public org.snmp4j.agent.mo.snmp.SysUpTime getSysUpTime()`
- `public static org.snmp4j.agent.mo.snmp.SysUpTime getSysUpTime(org.snmp4j.smi.OctetString p0)`
- `public org.snmp4j.smi.TimeTicks getUpTime()`
- `public void incrementCounter(org.snmp4j.event.CounterEvent p0)`
- `public void registerMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1) throws org.snmp4j.agent.DuplicateRegistrationException`
- `public org.snmp4j.agent.mo.MOTableRow removeSysOREntry(org.snmp4j.smi.OID p0)`
- `public void setContact(org.snmp4j.smi.OctetString p0)`
- `public void setLocation(org.snmp4j.smi.OctetString p0)`
- `public void setName(org.snmp4j.smi.OctetString p0)`
- `public void setNotificationOriginator(org.snmp4j.agent.NotificationOriginator p0)`
- `public void unregisterMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1)`
- `protected void updateSysORLastChange()`

---

## public final static class `org.snmp4j.agent.mo.snmp.SNMPv2MIB$SnmpEnableAuthenTrapsEnum`

**Constructors:**
- `public SnmpEnableAuthenTrapsEnum()`

**Fields:**
- `public final static int disabled`
- `public final static int enabled`

---

## public class `org.snmp4j.agent.mo.snmp.SNMPv2MIB$SysOREntry`
extends `org.snmp4j.agent.mo.DefaultMOTable`  
implements `org.snmp4j.agent.mo.snmp.AgentCapabilityList`  

**Constructors:**
- `public SysOREntry(org.snmp4j.smi.OID p0, org.snmp4j.agent.mo.MOTableIndex p1, org.snmp4j.agent.mo.MOColumn[] p2)`

**Methods:**
- `public org.snmp4j.smi.OID addSysOREntry(org.snmp4j.smi.OID p0, org.snmp4j.smi.OctetString p1)`
- `public org.snmp4j.agent.mo.MOTableRow removeSysOREntry(org.snmp4j.smi.OID p0)`

---

## public static class `org.snmp4j.agent.mo.snmp.SNMPv2MIB$SysUpTimeImpl`
extends `org.snmp4j.agent.mo.MOScalar`  
implements `java.io.Serializable`, `org.snmp4j.agent.mo.snmp.SysUpTime`  

**Constructors:**
- `public SysUpTimeImpl()`

**Methods:**
- `public org.snmp4j.smi.TimeTicks get()`
- `public org.snmp4j.smi.TimeTicks getValue()`

---

## public final class `org.snmp4j.agent.mo.snmp.SNMPv2TC`
implements `org.snmp4j.agent.mo.snmp.tc.TCModule`  

**Constructors:**
- `public SNMPv2TC()`

**Fields:**
- `public final static java.lang.String AUTONOMOUSTYPE`
- `public final static java.lang.String DATEANDTIME`
- `public final static java.lang.String DISPLAYSTRING`
- `public final static java.lang.String MODULE_NAME`
- `public final static java.lang.String ROWSTATUS`
- `public final static java.lang.String STORAGETYPE`
- `public final static java.lang.String TESTANDINCR`
- `public final static java.lang.String TIMESTAMP`
- `public final static java.lang.String TRUTHVALUE`

**Methods:**
- `public final java.lang.String getName()`
- `public org.snmp4j.agent.mo.snmp.tc.TextualConvention getTextualConvention(java.lang.String p0)`
- `public java.util.Collection getTextualConventions()`

---

## public class `org.snmp4j.agent.mo.snmp.SnmpAdminString`
extends `org.snmp4j.agent.mo.MOMutableColumn`  

**Constructors:**
- `public SnmpAdminString(int p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.OctetString p2, boolean p3)`
- `public SnmpAdminString(int p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.OctetString p2, boolean p3, int p4, int p5)`

**Methods:**
- `public int getMaxLength()`
- `public int getMinLength()`
- `public void setMaxLength(int p0)`
- `public void setMinLength(int p0)`
- `public synchronized int validate(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OctetString p1)`

---

## public class `org.snmp4j.agent.mo.snmp.SnmpCommunityMIB`
implements `org.snmp4j.agent.MOGroup`, `org.snmp4j.agent.mo.snmp.CoexistenceInfoProvider`  

**Constructors:**
- `public SnmpCommunityMIB(org.snmp4j.agent.mo.snmp.SnmpTargetMIB p0)`

**Fields:**
- `public final static int colSnmpCommunityContextEngineID`
- `public final static int colSnmpCommunityContextName`
- `public final static int colSnmpCommunityName`
- `public final static int colSnmpCommunitySecurityName`
- `public final static int colSnmpCommunityStatus`
- `public final static int colSnmpCommunityStorageType`
- `public final static int colSnmpCommunityTransportTag`
- `public final static int colSnmpTargetAddrMMS`
- `public final static int colSnmpTargetAddrTMask`
- `public final static int idxSnmpCommunityContextEngineID`
- `public final static int idxSnmpCommunityContextName`
- `public final static int idxSnmpCommunityName`
- `public final static int idxSnmpCommunitySecurityName`
- `public final static int idxSnmpCommunityStatus`
- `public final static int idxSnmpCommunityStorageType`
- `public final static int idxSnmpCommunityTransportTag`
- `public final static int idxSnmpTargetAddrMMS`
- `public final static int idxSnmpTargetAddrTMask`
- `public final static org.snmp4j.smi.OID oidSnmpCommunityEntry`
- `public final static org.snmp4j.smi.OID oidSnmpTargetAddrExtEntry`

**Methods:**
- `public void addSnmpCommunityEntry(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OctetString p1, org.snmp4j.smi.OctetString p2, org.snmp4j.smi.OctetString p3, org.snmp4j.smi.OctetString p4, org.snmp4j.smi.OctetString p5, int p6)`
- `public org.snmp4j.agent.mo.snmp.CoexistenceInfo[] getCoexistenceInfo(org.snmp4j.smi.OctetString p0)`
- `public org.snmp4j.smi.OctetString getCommunity(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OctetString p1, org.snmp4j.smi.OctetString p2)`
- `public org.snmp4j.agent.mo.MOTable getSnmpCommunityEntry()`
- `public org.snmp4j.agent.mo.MOTable getSnmpTargetAddrExtEntry()`
- `public boolean isSourceAddressFiltering()`
- `public boolean passesFilter(org.snmp4j.smi.Address p0, org.snmp4j.agent.mo.snmp.CoexistenceInfo p1)`
- `public void registerMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1) throws org.snmp4j.agent.DuplicateRegistrationException`
- `public boolean removeSnmpCommuntiyEntry(org.snmp4j.smi.OctetString p0)`
- `public void setBaseTableSnmpTargetAddrEntry(org.snmp4j.agent.mo.MOTable p0)`
- `public void setSourceAddressFiltering(boolean p0)`
- `public void unregisterMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1)`

---

## public class `org.snmp4j.agent.mo.snmp.SnmpCommunityMIB$SnmpCommunityEntryRow`
extends `org.snmp4j.agent.mo.DefaultMOMutableRow2PC`  

**Constructors:**
- `public SnmpCommunityEntryRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`

**Methods:**
- `public org.snmp4j.smi.OctetString getSnmpCommunityContextEngineID()`
- `public org.snmp4j.smi.OctetString getSnmpCommunityContextName()`
- `public org.snmp4j.smi.OctetString getSnmpCommunityName()`
- `public org.snmp4j.smi.OctetString getSnmpCommunitySecurityName()`
- `public org.snmp4j.smi.Integer32 getSnmpCommunityStatus()`
- `public org.snmp4j.smi.Integer32 getSnmpCommunityStorageType()`
- `public org.snmp4j.smi.OctetString getSnmpCommunityTransportTag()`
- `public void setSnmpCommunityContextEngineID(org.snmp4j.smi.OctetString p0)`
- `public void setSnmpCommunityContextName(org.snmp4j.smi.OctetString p0)`
- `public void setSnmpCommunityName(org.snmp4j.smi.OctetString p0)`
- `public void setSnmpCommunitySecurityName(org.snmp4j.smi.OctetString p0)`
- `public void setSnmpCommunityStatus(org.snmp4j.smi.Integer32 p0)`
- `public void setSnmpCommunityStorageType(org.snmp4j.smi.Integer32 p0)`
- `public void setSnmpCommunityTransportTag(org.snmp4j.smi.OctetString p0)`
- `public void setValue(int p0, org.snmp4j.smi.Variable p1)`

---

## public class `org.snmp4j.agent.mo.snmp.SnmpCommunityMIB$SnmpTargetAddrExtEntryRow`
extends `org.snmp4j.agent.mo.DefaultMOMutableRow2PC`  

**Constructors:**
- `public SnmpTargetAddrExtEntryRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`

**Methods:**
- `public org.snmp4j.smi.Integer32 getSnmpTargetAddrMMS()`
- `public org.snmp4j.smi.OctetString getSnmpTargetAddrTMask()`
- `public void setSnmpTargetAddrMMS(org.snmp4j.smi.Integer32 p0)`
- `public void setSnmpTargetAddrTMask(org.snmp4j.smi.OctetString p0)`

---

## public class `org.snmp4j.agent.mo.snmp.SnmpCommunityMIB$SnmpTargetAddrExtEntryRowFactory`
implements `org.snmp4j.agent.mo.MOTableRowFactory<org.snmp4j.agent.mo.snmp.SnmpCommunityMIB$SnmpTargetAddrExtEntryRow>`  

**Constructors:**
- `public SnmpTargetAddrExtEntryRowFactory()`

**Methods:**
- `public org.snmp4j.agent.mo.snmp.SnmpCommunityMIB$SnmpTargetAddrExtEntryRow createRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1) throws java.lang.UnsupportedOperationException`
- `public void freeRow(org.snmp4j.agent.mo.snmp.SnmpCommunityMIB$SnmpTargetAddrExtEntryRow p0)`

---

## public class `org.snmp4j.agent.mo.snmp.SnmpFrameworkMIB`
implements `org.snmp4j.agent.MOGroup`, `org.snmp4j.agent.mo.snmp.tc.TCModule`  

**Constructors:**
- `public SnmpFrameworkMIB(org.snmp4j.smi.OctetString p0, org.snmp4j.security.USM p1, java.util.Collection p2)`
- `public SnmpFrameworkMIB(org.snmp4j.smi.OctetString p0, org.snmp4j.security.USM p1, java.util.Collection p2, boolean p3)`

**Fields:**
- `public final static java.lang.String MODULE_NAME`
- `public final static java.lang.String SNMPADMINSTRING`
- `public final static java.lang.String SNMPENGINEID`

**Methods:**
- `public java.lang.String getName()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpEngineBoots()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpEngineID()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpEngineMaxMessageSize()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpEngineTime()`
- `public org.snmp4j.agent.mo.snmp.tc.TextualConvention getTextualConvention(java.lang.String p0)`
- `public java.util.Collection getTextualConventions()`
- `public org.snmp4j.security.USM getUSM()`
- `public boolean isUpdateUsmFromMIB()`
- `public void registerMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1) throws org.snmp4j.agent.DuplicateRegistrationException`
- `public void unregisterMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1)`

---

## public class `org.snmp4j.agent.mo.snmp.SnmpMpdMib`
implements `org.snmp4j.agent.MOGroup`, `org.snmp4j.event.CounterListener`  

**Constructors:**
- `protected SnmpMpdMib()`
- `public SnmpMpdMib(org.snmp4j.agent.mo.MOFactory p0)`

**Fields:**
- `public final static org.snmp4j.smi.OID oidSnmpInvalidMsgs`
- `public final static org.snmp4j.smi.OID oidSnmpMpdMib`
- `public final static org.snmp4j.smi.OID oidSnmpUnknownPDUHandlers`
- `public final static org.snmp4j.smi.OID oidSnmpUnknownSecurityModels`

**Methods:**
- `public void addImportedTCsToFactory(org.snmp4j.agent.mo.MOFactory p0)`
- `protected void addTCsToFactory(org.snmp4j.agent.mo.MOFactory p0)`
- `protected void createMO(org.snmp4j.agent.mo.MOFactory p0)`
- `public org.snmp4j.agent.mo.MOScalar getSnmpInvalidMsgs()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpUnknownPDUHandlers()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpUnknownSecurityModels()`
- `public void incrementCounter(org.snmp4j.event.CounterEvent p0)`
- `public void registerMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1) throws org.snmp4j.agent.DuplicateRegistrationException`
- `public void unregisterMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1)`

---

## public class `org.snmp4j.agent.mo.snmp.SnmpNotificationMIB`
implements `org.snmp4j.agent.MOGroup`  

**Constructors:**
- `public SnmpNotificationMIB()`

**Fields:**
- `public final static int colSnmpNotifyFilterMask`
- `public final static int colSnmpNotifyFilterProfileName`
- `public final static int colSnmpNotifyFilterProfileRowStatus`
- `public final static int colSnmpNotifyFilterProfileStorType`
- `public final static int colSnmpNotifyFilterRowStatus`
- `public final static int colSnmpNotifyFilterStorageType`
- `public final static int colSnmpNotifyFilterType`
- `public final static int colSnmpNotifyRowStatus`
- `public final static int colSnmpNotifyStorageType`
- `public final static int colSnmpNotifyTag`
- `public final static int colSnmpNotifyType`
- `public final static int idxSnmpNotifyFilterMask`
- `public final static int idxSnmpNotifyFilterProfileName`
- `public final static int idxSnmpNotifyFilterProfileRowStatus`
- `public final static int idxSnmpNotifyFilterProfileStorType`
- `public final static int idxSnmpNotifyFilterRowStatus`
- `public final static int idxSnmpNotifyFilterStorageType`
- `public final static int idxSnmpNotifyFilterSubtree`
- `public final static int idxSnmpNotifyFilterType`
- `public final static int idxSnmpNotifyRowStatus`
- `public final static int idxSnmpNotifyStorageType`
- `public final static int idxSnmpNotifyTag`
- `public final static int idxSnmpNotifyType`
- `public final static org.snmp4j.smi.OID oidSnmpNotifyEntry`
- `public final static org.snmp4j.smi.OID oidSnmpNotifyFilterEntry`
- `public final static org.snmp4j.smi.OID oidSnmpNotifyFilterProfileEntry`

**Methods:**
- `public boolean addNotifyEntry(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OctetString p1, int p2, int p3)`
- `public org.snmp4j.agent.mo.DefaultMOTable getNotifyFilterProfileTable()`
- `public org.snmp4j.agent.mo.DefaultMOTable getNotifyFilterTable()`
- `public org.snmp4j.agent.mo.DefaultMOTable getNotifyTable()`
- `public boolean hasFilter(org.snmp4j.smi.OctetString p0)`
- `public boolean passesFilter(org.snmp4j.smi.OID p0, org.snmp4j.smi.OID p1, org.snmp4j.smi.VariableBinding[] p2)`
- `public boolean passesFilter(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OID p1, org.snmp4j.smi.VariableBinding[] p2)`
- `public void registerMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1) throws org.snmp4j.agent.DuplicateRegistrationException`
- `public boolean removeNotifyEntry(org.snmp4j.smi.OctetString p0)`
- `public void unregisterMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1)`

---

## public final static class `org.snmp4j.agent.mo.snmp.SnmpNotificationMIB$SnmpNotifyFilterTypeEnum`

**Constructors:**
- `public SnmpNotifyFilterTypeEnum()`

**Fields:**
- `public final static int excluded`
- `public final static int included`

---

## public final static class `org.snmp4j.agent.mo.snmp.SnmpNotificationMIB$SnmpNotifyTypeEnum`

**Constructors:**
- `public SnmpNotifyTypeEnum()`

**Fields:**
- `public final static int inform`
- `public final static int trap`

---

## public class `org.snmp4j.agent.mo.snmp.SnmpProxyMIB`
implements `org.snmp4j.agent.MOGroup`  

**Constructors:**
- `public SnmpProxyMIB()`

**Fields:**
- `public final static int colSnmpProxyContextEngineID`
- `public final static int colSnmpProxyContextName`
- `public final static int colSnmpProxyMultipleTargetOut`
- `public final static int colSnmpProxyRowStatus`
- `public final static int colSnmpProxySingleTargetOut`
- `public final static int colSnmpProxyStorageType`
- `public final static int colSnmpProxyTargetParamsIn`
- `public final static int colSnmpProxyType`
- `public final static int idxSnmpProxyContextEngineID`
- `public final static int idxSnmpProxyContextName`
- `public final static int idxSnmpProxyMultipleTargetOut`
- `public final static int idxSnmpProxyRowStatus`
- `public final static int idxSnmpProxySingleTargetOut`
- `public final static int idxSnmpProxyStorageType`
- `public final static int idxSnmpProxyTargetParamsIn`
- `public final static int idxSnmpProxyType`
- `public final static org.snmp4j.smi.OID oidSnmpProxyEntry`

**Methods:**
- `public boolean addProxyEntry(org.snmp4j.smi.OctetString p0, int p1, org.snmp4j.smi.OctetString p2, org.snmp4j.smi.OctetString p3, org.snmp4j.smi.OctetString p4, org.snmp4j.smi.OctetString p5, org.snmp4j.smi.OctetString p6, int p7)`
- `public java.util.List getProxyRows(int p0, org.snmp4j.smi.OctetString p1, org.snmp4j.smi.OctetString p2)`
- `public org.snmp4j.agent.mo.MOTable getSnmpProxyEntry()`
- `public void registerMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1) throws org.snmp4j.agent.DuplicateRegistrationException`
- `public org.snmp4j.agent.mo.snmp.SnmpProxyMIB$SnmpProxyRow removeProxyEntry(org.snmp4j.smi.OctetString p0)`
- `public void unregisterMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1)`

---

## public class `org.snmp4j.agent.mo.snmp.SnmpProxyMIB$SnmpProxyRow`
extends `org.snmp4j.agent.mo.DefaultMOMutableRow2PC`  

**Constructors:**
- `public SnmpProxyRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`

**Methods:**
- `public org.snmp4j.smi.OctetString getSnmpProxyContextEngineID()`
- `public org.snmp4j.smi.OctetString getSnmpProxyContextName()`
- `public org.snmp4j.smi.OctetString getSnmpProxyMultipleTargetOut()`
- `public org.snmp4j.smi.Integer32 getSnmpProxyRowStatus()`
- `public org.snmp4j.smi.OctetString getSnmpProxySingleTargetOut()`
- `public org.snmp4j.smi.Integer32 getSnmpProxyStorageType()`
- `public org.snmp4j.smi.OctetString getSnmpProxyTargetParamsIn()`
- `public org.snmp4j.smi.Integer32 getSnmpProxyType()`
- `public void setSnmpProxyContextEngineID(org.snmp4j.smi.OctetString p0)`
- `public void setSnmpProxyContextName(org.snmp4j.smi.OctetString p0)`
- `public void setSnmpProxyMultipleTargetOut(org.snmp4j.smi.OctetString p0)`
- `public void setSnmpProxyRowStatus(org.snmp4j.smi.Integer32 p0)`
- `public void setSnmpProxySingleTargetOut(org.snmp4j.smi.OctetString p0)`
- `public void setSnmpProxyStorageType(org.snmp4j.smi.Integer32 p0)`
- `public void setSnmpProxyTargetParamsIn(org.snmp4j.smi.OctetString p0)`
- `public void setSnmpProxyType(org.snmp4j.smi.Integer32 p0)`

---

## public final static class `org.snmp4j.agent.mo.snmp.SnmpProxyMIB$SnmpProxyTypeEnum`

**Constructors:**
- `public SnmpProxyTypeEnum()`

**Fields:**
- `public final static int inform`
- `public final static int read`
- `public final static int trap`
- `public final static int write`

---

## public class `org.snmp4j.agent.mo.snmp.SnmpTagList`
extends `org.snmp4j.agent.mo.MOMutableColumn`  

**Constructors:**
- `public SnmpTagList(int p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.OctetString p2, boolean p3)`

**Methods:**
- `public static java.util.Set getTags(org.snmp4j.smi.OctetString p0)`
- `public static int isValidTagList(org.snmp4j.smi.Variable p0)`
- `public synchronized int validate(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OctetString p1)`

---

## public class `org.snmp4j.agent.mo.snmp.SnmpTagValue`
extends `org.snmp4j.agent.mo.MOMutableColumn`  

**Constructors:**
- `public SnmpTagValue(int p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.OctetString p2)`
- `public SnmpTagValue(int p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.OctetString p2, boolean p3)`

**Methods:**
- `public static boolean isDelimiter(byte p0)`
- `public static int isValidTagValue(org.snmp4j.smi.Variable p0)`
- `public synchronized int validate(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OctetString p1)`

---

## public class `org.snmp4j.agent.mo.snmp.SnmpTargetMIB`
implements `org.snmp4j.agent.MOGroup`, `org.snmp4j.agent.mo.MOTableRowListener<org.snmp4j.agent.mo.DefaultMOMutableRow2PC>`, `org.snmp4j.event.CounterListener`  

**Constructors:**
- `public SnmpTargetMIB(org.snmp4j.MessageDispatcher p0)`

**Fields:**
- `public final static long ADDRESS_CACHE_TIMEOUT`

**Methods:**
- `public void addDefaultTDomains()`
- `public void addSupportedTDomain(org.snmp4j.smi.OID p0, org.snmp4j.agent.mo.snmp.TDomainAddressFactory p1)`
- `public boolean addTargetAddress(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OID p1, org.snmp4j.smi.OctetString p2, int p3, int p4, org.snmp4j.smi.OctetString p5, org.snmp4j.smi.OctetString p6, int p7)`
- `public boolean addTargetParams(org.snmp4j.smi.OctetString p0, int p1, int p2, org.snmp4j.smi.OctetString p3, int p4, int p5)`
- `public long getAddressCacheTimeoutNanos()`
- `public org.snmp4j.agent.mo.snmp.CoexistenceInfoProvider getCoexistenceProvider()`
- `public byte[] getLocalEngineID()`
- `public org.snmp4j.agent.mo.DefaultMOTable getSnmpTargetAddrEntry()`
- `public org.snmp4j.agent.mo.DefaultMOTable getSnmpTargetParamsEntry()`
- `public org.snmp4j.Target getTarget(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OctetString p1, org.snmp4j.smi.OctetString p2)`
- `public <A extends org.snmp4j.smi.Address> org.snmp4j.Target getTarget(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OctetString p1, org.snmp4j.smi.OctetString p2, A p3)`
- `public java.util.Collection getTargetAddrRowsForTag(org.snmp4j.smi.OctetString p0)`
- `public org.snmp4j.smi.Address getTargetAddress(org.snmp4j.smi.OctetString p0)`
- `public org.snmp4j.agent.mo.MOTableRow getTargetParamsRow(org.snmp4j.smi.OctetString p0)`
- `public org.snmp4j.agent.mo.MOTableRow getTargetParamsRow(org.snmp4j.smi.OctetString p0, boolean p1)`
- `public org.snmp4j.agent.mo.snmp.SnmpTlsTmMib getTlsTmMib()`
- `public void incrementCounter(org.snmp4j.event.CounterEvent p0)`
- `public void registerMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1) throws org.snmp4j.agent.DuplicateRegistrationException`
- `protected void removeRowFromTargetAddrTagIndex(org.snmp4j.agent.mo.MOTableRow p0)`
- `public org.snmp4j.agent.mo.snmp.TDomainAddressFactory removeSupportedTDomain(org.snmp4j.smi.OID p0)`
- `public org.snmp4j.agent.mo.MOTableRow removeTargetAddress(org.snmp4j.smi.OctetString p0)`
- `public org.snmp4j.agent.mo.MOTableRow removeTargetParams(org.snmp4j.smi.OctetString p0)`
- `public void rowChanged(org.snmp4j.agent.mo.MOTableRowEvent p0)`
- `public void setAddressCacheTimeoutNanos(long p0)`
- `public void setCoexistenceProvider(org.snmp4j.agent.mo.snmp.CoexistenceInfoProvider p0)`
- `public void setTlsTmMib(org.snmp4j.agent.mo.snmp.SnmpTlsTmMib p0)`
- `public void unregisterMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1)`

---

## public class `org.snmp4j.agent.mo.snmp.SnmpTargetMIB$SnmpTargetAddrEntryRow`
extends `org.snmp4j.agent.mo.DefaultMOMutableRow2PC`  

**Constructors:**
- `public SnmpTargetAddrEntryRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`

**Methods:**
- `public void commitRow(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1)`
- `public org.snmp4j.smi.Address getAddress()`
- `public org.snmp4j.smi.OctetString getTAddress(org.snmp4j.smi.Address p0)`
- `public <A extends org.snmp4j.smi.Address> org.snmp4j.Target getTarget(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OctetString p1, A p2)`
- `public <A extends org.snmp4j.smi.Address> org.snmp4j.CertifiedTarget getTlsTmTarget(A p0, org.snmp4j.smi.OctetString p1, org.snmp4j.smi.OID p2, org.snmp4j.smi.OID p3, org.snmp4j.agent.mo.snmp.SnmpTlsTmMib p4)`
- `public void prepareRow(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1)`
- `public void setValue(int p0, org.snmp4j.smi.Variable p1)`

---

## public final static class `org.snmp4j.agent.mo.snmp.SnmpTargetMIB$SnmpTargetParamsSecurityLevelEnum`

**Constructors:**
- `public SnmpTargetParamsSecurityLevelEnum()`

**Fields:**
- `public final static int authNoPriv`
- `public final static int authPriv`
- `public final static int noAuthNoPriv`

---

## public class `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib`
implements `org.snmp4j.agent.MOGroup`, `org.snmp4j.transport.tls.TlsTmSecurityCallback<java.security.cert.X509Certificate>`  

**Constructors:**
- `protected SnmpTlsTmMib()`
- `public SnmpTlsTmMib(org.snmp4j.agent.mo.MOFactory p0)`
- `public SnmpTlsTmMib(org.snmp4j.agent.mo.MOFactory p0, org.snmp4j.agent.mo.snmp.SnmpTargetMIB p1)`

**Fields:**
- `public final static int colSnmpTlstmAddrRowStatus`
- `public final static int colSnmpTlstmAddrServerFingerprint`
- `public final static int colSnmpTlstmAddrServerIdentity`
- `public final static int colSnmpTlstmAddrStorageType`
- `public final static int colSnmpTlstmCertToTSNData`
- `public final static int colSnmpTlstmCertToTSNFingerprint`
- `public final static int colSnmpTlstmCertToTSNMapType`
- `public final static int colSnmpTlstmCertToTSNRowStatus`
- `public final static int colSnmpTlstmCertToTSNStorageType`
- `public final static int colSnmpTlstmParamsClientFingerprint`
- `public final static int colSnmpTlstmParamsRowStatus`
- `public final static int colSnmpTlstmParamsStorageType`
- `public final static int idxSnmpTlstmAddrRowStatus`
- `public final static int idxSnmpTlstmAddrServerFingerprint`
- `public final static int idxSnmpTlstmAddrServerIdentity`
- `public final static int idxSnmpTlstmAddrStorageType`
- `public final static int idxSnmpTlstmCertToTSNData`
- `public final static int idxSnmpTlstmCertToTSNFingerprint`
- `public final static int idxSnmpTlstmCertToTSNMapType`
- `public final static int idxSnmpTlstmCertToTSNRowStatus`
- `public final static int idxSnmpTlstmCertToTSNStorageType`
- `public final static int idxSnmpTlstmParamsClientFingerprint`
- `public final static int idxSnmpTlstmParamsRowStatus`
- `public final static int idxSnmpTlstmParamsStorageType`
- `public final static org.snmp4j.smi.OID oidSnmpDTLSUDPDomain`
- `public final static org.snmp4j.smi.OID oidSnmpTLSTCPDomain`
- `public final static org.snmp4j.smi.OID oidSnmpTargetAddrName`
- `public final static org.snmp4j.smi.OID oidSnmpTargetParamsName`
- `public final static org.snmp4j.smi.OID oidSnmpTlsTmMib`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmAddrCount`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmAddrEntry`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmAddrTableLastChanged`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmCertCommonName`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmCertSANAny`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmCertSANDNSName`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmCertSANIpAddress`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmCertSANRFC822Name`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmCertSpecified`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmCertToTSNCount`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmCertToTSNEntry`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmCertToTSNID`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmCertToTSNTableLastChanged`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmParamsCount`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmParamsEntry`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmParamsTableLastChanged`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmServerCertificateUnknown`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmServerInvalidCertificate`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmSessionAccepts`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmSessionClientCloses`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmSessionInvalidCaches`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmSessionInvalidClientCertificates`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmSessionInvalidServerCertificates`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmSessionNoSessions`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmSessionOpenErrors`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmSessionOpens`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmSessionServerCloses`
- `public final static org.snmp4j.smi.OID oidSnmpTlstmSessionUnknownServerCertificate`
- `public final static org.snmp4j.smi.OID oidTrapVarSnmpTlstmAddrServerFingerprint`
- `public final static org.snmp4j.smi.OID oidTrapVarSnmpTlstmSessionInvalidServerCertificates`
- `public final static org.snmp4j.smi.OID oidTrapVarSnmpTlstmSessionUnknownServerCertificate`
- `public final static java.lang.String tcDefAutonomousType`
- `public final static java.lang.String tcDefRowStatus`
- `public final static java.lang.String tcDefSnmpAdminString`
- `public final static java.lang.String tcDefSnmpTLSFingerprint`
- `public final static java.lang.String tcDefStorageType`
- `public final static java.lang.String tcModuleSNMPv2Tc`
- `public final static java.lang.String tcModuleSnmpFrameworkMib`
- `public final static java.lang.String tcModuleSnmpTlsTmMib`

**Methods:**
- `public void addImportedTCsToFactory(org.snmp4j.agent.mo.MOFactory p0)`
- `protected void addTCsToFactory(org.snmp4j.agent.mo.MOFactory p0)`
- `public void addTlsDomainsToSnmpTargetMIB(org.snmp4j.agent.mo.snmp.SnmpTargetMIB p0)`
- `protected void createMO(org.snmp4j.agent.mo.MOFactory p0)`
- `public org.snmp4j.event.CounterListener getCounterListener()`
- `public java.lang.String getLocalCertificateAlias(org.snmp4j.smi.Address p0)`
- `public org.snmp4j.smi.OctetString getSecurityName(java.security.cert.X509Certificate[] p0)`
- `public org.snmp4j.agent.mo.MOScalar getSnmpTlstmAddrCount()`
- `public org.snmp4j.agent.mo.MOTable getSnmpTlstmAddrEntry()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpTlstmAddrTableLastChanged()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpTlstmCertToTSNCount()`
- `public org.snmp4j.agent.mo.MOTable getSnmpTlstmCertToTSNEntry()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpTlstmCertToTSNTableLastChanged()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpTlstmParamsCount()`
- `public org.snmp4j.agent.mo.MOTable getSnmpTlstmParamsEntry()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpTlstmParamsTableLastChanged()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpTlstmSessionAccepts()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpTlstmSessionClientCloses()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpTlstmSessionInvalidCaches()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpTlstmSessionInvalidClientCertificates()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpTlstmSessionInvalidServerCertificates()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpTlstmSessionNoSessions()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpTlstmSessionOpenErrors()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpTlstmSessionOpens()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpTlstmSessionServerCloses()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpTlstmSessionUnknownServerCertificate()`
- `public boolean isAcceptedIssuer(java.security.cert.X509Certificate p0)`
- `public boolean isClientCertificateAccepted(java.security.cert.X509Certificate p0) throws java.security.cert.CertificateException`
- `public boolean isServerCertificateAccepted(java.security.cert.X509Certificate[] p0)`
- `public void registerMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1) throws org.snmp4j.agent.DuplicateRegistrationException`
- `public void removeTlsDomainsFromSnmpTargetMIB(org.snmp4j.agent.mo.snmp.SnmpTargetMIB p0)`
- `public void snmpTlstmServerCertificateUnknown(org.snmp4j.agent.NotificationOriginator p0, org.snmp4j.smi.OctetString p1, org.snmp4j.smi.VariableBinding[] p2)`
- `public void snmpTlstmServerInvalidCertificate(org.snmp4j.agent.NotificationOriginator p0, org.snmp4j.smi.OctetString p1, org.snmp4j.smi.VariableBinding[] p2)`
- `public void unregisterMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1)`

---

## public class `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib$SnmpTLSFingerprint`
implements `org.snmp4j.agent.mo.snmp.tc.TextualConvention<org.snmp4j.smi.OctetString>`  

**Constructors:**
- `public SnmpTLSFingerprint()`

**Methods:**
- `public org.snmp4j.agent.mo.MOColumn createColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2, org.snmp4j.smi.OctetString p3, boolean p4)`
- `public org.snmp4j.smi.OctetString createInitialValue()`
- `public org.snmp4j.agent.mo.MOScalar createScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.OctetString p2)`
- `public java.lang.String getModuleName()`
- `public java.lang.String getName()`

---

## public class `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib$SnmpTlstmAddrEntryRow`
extends `org.snmp4j.agent.mo.DefaultMOMutableRow2PC`  

**Constructors:**
- `public SnmpTlstmAddrEntryRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`

**Methods:**
- `public org.snmp4j.smi.Integer32 getSnmpTlstmAddrRowStatus()`
- `public org.snmp4j.smi.OctetString getSnmpTlstmAddrServerFingerprint()`
- `public org.snmp4j.smi.OctetString getSnmpTlstmAddrServerIdentity()`
- `public org.snmp4j.smi.Integer32 getSnmpTlstmAddrStorageType()`
- `public org.snmp4j.smi.Variable getValue(int p0)`
- `public void prepare(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1, int p2)`
- `public void setSnmpTlstmAddrRowStatus(org.snmp4j.smi.Integer32 p0)`
- `public void setSnmpTlstmAddrServerFingerprint(org.snmp4j.smi.OctetString p0)`
- `public void setSnmpTlstmAddrServerIdentity(org.snmp4j.smi.OctetString p0)`
- `public void setSnmpTlstmAddrStorageType(org.snmp4j.smi.Integer32 p0)`
- `public void setValue(int p0, org.snmp4j.smi.Variable p1)`

---

## public class `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib$SnmpTlstmCertToTSNEntryRow`
extends `org.snmp4j.agent.mo.DefaultMOMutableRow2PC`  

**Constructors:**
- `public SnmpTlstmCertToTSNEntryRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`

**Methods:**
- `public org.snmp4j.smi.OctetString getSnmpTlstmCertToTSNData()`
- `public org.snmp4j.smi.OctetString getSnmpTlstmCertToTSNFingerprint()`
- `public org.snmp4j.smi.OID getSnmpTlstmCertToTSNMapType()`
- `public org.snmp4j.smi.Integer32 getSnmpTlstmCertToTSNRowStatus()`
- `public org.snmp4j.smi.Integer32 getSnmpTlstmCertToTSNStorageType()`
- `public org.snmp4j.smi.Variable getValue(int p0)`
- `public void setSnmpTlstmCertToTSNData(org.snmp4j.smi.OctetString p0)`
- `public void setSnmpTlstmCertToTSNFingerprint(org.snmp4j.smi.OctetString p0)`
- `public void setSnmpTlstmCertToTSNMapType(org.snmp4j.smi.OID p0)`
- `public void setSnmpTlstmCertToTSNRowStatus(org.snmp4j.smi.Integer32 p0)`
- `public void setSnmpTlstmCertToTSNStorageType(org.snmp4j.smi.Integer32 p0)`
- `public void setValue(int p0, org.snmp4j.smi.Variable p1)`

---

## public class `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib$SnmpTlstmParamsEntryRow`
extends `org.snmp4j.agent.mo.DefaultMOMutableRow2PC`  

**Constructors:**
- `public SnmpTlstmParamsEntryRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`

**Methods:**
- `public org.snmp4j.smi.OctetString getSnmpTlstmParamsClientFingerprint()`
- `public org.snmp4j.smi.Integer32 getSnmpTlstmParamsRowStatus()`
- `public org.snmp4j.smi.Integer32 getSnmpTlstmParamsStorageType()`
- `public org.snmp4j.smi.Variable getValue(int p0)`
- `public void setSnmpTlstmParamsClientFingerprint(org.snmp4j.smi.OctetString p0)`
- `public void setSnmpTlstmParamsRowStatus(org.snmp4j.smi.Integer32 p0)`
- `public void setSnmpTlstmParamsStorageType(org.snmp4j.smi.Integer32 p0)`
- `public void setValue(int p0, org.snmp4j.smi.Variable p1)`

---

## public static class `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib$TDomainTLSAddressFactory`
extends `org.snmp4j.agent.mo.snmp.TDomainAddressFactoryImpl`  

**Constructors:**
- `public TDomainTLSAddressFactory()`

**Methods:**
- `public org.snmp4j.smi.Address createAddress(org.snmp4j.smi.OID p0, org.snmp4j.smi.OctetString p1)`

---

## public class `org.snmp4j.agent.mo.snmp.SnmpTsmMib`
implements `org.snmp4j.agent.MOGroup`  

**Constructors:**
- `protected SnmpTsmMib()`
- `public SnmpTsmMib(org.snmp4j.agent.mo.MOFactory p0)`

**Fields:**
- `public final static org.snmp4j.smi.OID oidSnmpTsmConfigurationUsePrefix`
- `public final static org.snmp4j.smi.OID oidSnmpTsmInadequateSecurityLevels`
- `public final static org.snmp4j.smi.OID oidSnmpTsmInvalidCaches`
- `public final static org.snmp4j.smi.OID oidSnmpTsmInvalidPrefixes`
- `public final static org.snmp4j.smi.OID oidSnmpTsmMib`
- `public final static org.snmp4j.smi.OID oidSnmpTsmUnknownPrefixes`

**Methods:**
- `public void addImportedTCsToFactory(org.snmp4j.agent.mo.MOFactory p0)`
- `protected void addTCsToFactory(org.snmp4j.agent.mo.MOFactory p0)`
- `protected void createMO(org.snmp4j.agent.mo.MOFactory p0)`
- `public org.snmp4j.agent.mo.MOScalar getSnmpTsmConfigurationUsePrefix()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpTsmInadequateSecurityLevels()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpTsmInvalidCaches()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpTsmInvalidPrefixes()`
- `public org.snmp4j.agent.mo.MOScalar getSnmpTsmUnknownPrefixes()`
- `public org.snmp4j.security.TSM getTsm()`
- `public void registerMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1) throws org.snmp4j.agent.DuplicateRegistrationException`
- `public void setTsm(org.snmp4j.security.TSM p0)`
- `public void unregisterMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1)`

---

## public class `org.snmp4j.agent.mo.snmp.SnmpTsmMib$SnmpTsmConfigurationUsePrefix`
extends `org.snmp4j.agent.mo.MOScalar`  

**Methods:**
- `public org.snmp4j.smi.Integer32 getValue()`
- `public int isValueOK(org.snmp4j.agent.request.SubRequest p0)`
- `public int setValue(org.snmp4j.smi.Integer32 p0)`

---

## public class `org.snmp4j.agent.mo.snmp.StorageType`
extends `org.snmp4j.agent.mo.MOMutableColumn`  
implements `org.snmp4j.agent.mo.RowModificationControlColumn`  

**Constructors:**
- `public StorageType(int p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.Integer32 p2)`
- `public StorageType(int p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.Integer32 p2, boolean p3)`

**Fields:**
- `public final static int nonVolatile`
- `public final static int other`
- `public final static int permanent`
- `public final static int readOnly`
- `public final static int volatile_`

**Methods:**
- `public static org.snmp4j.smi.Integer32 getStorageType(org.snmp4j.agent.mo.MOTableRow p0, org.snmp4j.agent.mo.MOTable p1)`
- `public boolean isVolatile(org.snmp4j.agent.mo.MOTableRow p0, int p1)`
- `public void prepareRow(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOMutableTableRow p1, org.snmp4j.agent.mo.MOTableRow p2)`
- `public synchronized int validate(org.snmp4j.smi.Integer32 p0, org.snmp4j.smi.Integer32 p1)`

---

## public final static enum `org.snmp4j.agent.mo.snmp.StorageType$StorageTypeEnum`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.snmp4j.agent.mo.snmp.StorageType$StorageTypeEnum nonVolatile`
- `public final static org.snmp4j.agent.mo.snmp.StorageType$StorageTypeEnum other`
- `public final static org.snmp4j.agent.mo.snmp.StorageType$StorageTypeEnum permanent`
- `public final static org.snmp4j.agent.mo.snmp.StorageType$StorageTypeEnum readOnly`
- `public final static org.snmp4j.agent.mo.snmp.StorageType$StorageTypeEnum volatile_`

**Methods:**
- `public static org.snmp4j.agent.mo.snmp.StorageType$StorageTypeEnum fromValue(int p0)`
- `public int getValue()`
- `public static org.snmp4j.mp.SnmpConstants$StorageTypeEnum toSnmpConstantsStorageTypeEnum(int p0)`

---

## public abstract interface `org.snmp4j.agent.mo.snmp.SysUpTime`

**Methods:**
- `public abstract org.snmp4j.smi.TimeTicks get()`

---

## public abstract interface `org.snmp4j.agent.mo.snmp.TDomainAddressFactory`

**Methods:**
- `public abstract org.snmp4j.smi.Address createAddress(org.snmp4j.smi.OID p0, org.snmp4j.smi.OctetString p1)`
- `public abstract org.snmp4j.smi.OctetString getAddress(org.snmp4j.smi.Address p0)`
- `public abstract org.snmp4j.smi.OID[] getTransportDomain(org.snmp4j.smi.Address p0)`
- `public abstract boolean isValidAddress(org.snmp4j.smi.OID p0, org.snmp4j.smi.OctetString p1)`

---

## public class `org.snmp4j.agent.mo.snmp.TDomainAddressFactoryImpl`
implements `org.snmp4j.agent.mo.snmp.TDomainAddressFactory`  

**Constructors:**
- `public TDomainAddressFactoryImpl()`

**Methods:**
- `public org.snmp4j.smi.Address createAddress(org.snmp4j.smi.OID p0, org.snmp4j.smi.OctetString p1)`
- `public org.snmp4j.smi.OctetString getAddress(org.snmp4j.smi.Address p0)`
- `public org.snmp4j.smi.OID[] getTransportDomain(org.snmp4j.smi.Address p0)`
- `public boolean isValidAddress(org.snmp4j.smi.OID p0, org.snmp4j.smi.OctetString p1)`

---

## public class `org.snmp4j.agent.mo.snmp.TestAndIncr`
extends `org.snmp4j.agent.mo.MOScalar`  

**Constructors:**
- `public TestAndIncr(org.snmp4j.smi.OID p0)`

**Methods:**
- `public void commit(org.snmp4j.agent.request.SubRequest p0)`
- `public int isValueOK(org.snmp4j.agent.request.SubRequest p0)`
- `public void prepare(org.snmp4j.agent.request.SubRequest p0)`

---

## public class `org.snmp4j.agent.mo.snmp.TimeStamp`
extends `org.snmp4j.agent.mo.MOColumn`  

**Constructors:**
- `public TimeStamp(int p0, org.snmp4j.agent.MOAccess p1)`
- `public TimeStamp(int p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.agent.mo.snmp.SysUpTime p2)`

**Methods:**
- `public org.snmp4j.agent.mo.snmp.SysUpTime getSysUpTime()`
- `public void setSysUpTime(org.snmp4j.agent.mo.snmp.SysUpTime p0)`
- `public void update(org.snmp4j.agent.mo.MOMutableTableRow p0, int p1)`

---

## public class `org.snmp4j.agent.mo.snmp.TimeStampScalar`
extends `org.snmp4j.agent.mo.MOScalar`  

**Constructors:**
- `public TimeStampScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.agent.mo.snmp.SysUpTime p2)`
- `public TimeStampScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.TimeTicks p2, org.snmp4j.agent.mo.snmp.SysUpTime p3)`

**Methods:**
- `public org.snmp4j.agent.mo.snmp.SysUpTime getSysUpTime()`
- `public void setSysUpTime(org.snmp4j.agent.mo.snmp.SysUpTime p0)`
- `public void update()`

---

## public final class `org.snmp4j.agent.mo.snmp.TransportDomains`

**Constructors:**
- `public TransportDomains()`

**Fields:**
- `public final static org.snmp4j.smi.OID snmpTLSTCPDomain`
- `public final static org.snmp4j.smi.OID snmpTLSUDPDomain`
- `public final static org.snmp4j.smi.OID snmpUDPDomain`
- `public final static org.snmp4j.smi.OID transportDomainLocal`
- `public final static org.snmp4j.smi.OID transportDomainTcpDns`
- `public final static org.snmp4j.smi.OID transportDomainTcpIpv4`
- `public final static org.snmp4j.smi.OID transportDomainTcpIpv4z`
- `public final static org.snmp4j.smi.OID transportDomainTcpIpv6`
- `public final static org.snmp4j.smi.OID transportDomainTcpIpv6z`
- `public final static org.snmp4j.smi.OID transportDomainUdpDns`
- `public final static org.snmp4j.smi.OID transportDomainUdpIpv4`
- `public final static org.snmp4j.smi.OID transportDomainUdpIpv4z`
- `public final static org.snmp4j.smi.OID transportDomainUdpIpv6`
- `public final static org.snmp4j.smi.OID transportDomainUdpIpv6z`

---

## public class `org.snmp4j.agent.mo.snmp.UsmKeyChange`
extends `org.snmp4j.agent.mo.snmp.KeyChange`  

**Constructors:**
- `public UsmKeyChange(int p0, org.snmp4j.agent.MOAccess p1, int p2)`

**Fields:**
- `public final static int AUTH_KEY_CHANGE`
- `public final static int PRIV_KEY_CHANGE`

**Methods:**
- `public void commit(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1, org.snmp4j.agent.mo.MOTableRow p2, int p3)`
- `protected int getDigestLength(org.snmp4j.agent.mo.snmp.UsmMIB$UsmTableRow p0, org.snmp4j.agent.mo.MOTableRow p1)`
- `public void prepare(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1, org.snmp4j.agent.mo.MOTableRow p2, int p3)`

---

## public class `org.snmp4j.agent.mo.snmp.UsmMIB`
implements `org.snmp4j.agent.MOGroup`, `org.snmp4j.agent.mo.MOTableRowListener<org.snmp4j.agent.mo.snmp.UsmMIB$UsmTableRow>`, `org.snmp4j.agent.mo.MOValueValidationListener`, `org.snmp4j.event.CounterListener`, `org.snmp4j.event.UsmUserListener`  

**Constructors:**
- `public UsmMIB(org.snmp4j.security.USM p0, org.snmp4j.security.SecurityProtocols p1)`

**Fields:**
- `public final static int colUsmUserAuthKey`
- `public final static int colUsmUserAuthKeyChange`
- `public final static int colUsmUserAuthPassword`
- `public final static int colUsmUserAuthProtocol`
- `public final static int colUsmUserCloneFrom`
- `public final static int colUsmUserLocalizationEngineID`
- `public final static int colUsmUserOwnAuthKeyChange`
- `public final static int colUsmUserOwnPrivKeyChange`
- `public final static int colUsmUserPrivKey`
- `public final static int colUsmUserPrivKeyChange`
- `public final static int colUsmUserPrivPassword`
- `public final static int colUsmUserPrivProtocol`
- `public final static int colUsmUserPublic`
- `public final static int colUsmUserSecurityName`
- `public final static int colUsmUserStatus`
- `public final static int colUsmUserStorageType`
- `public final static org.snmp4j.smi.OID noAuthProtocol`
- `public final static org.snmp4j.smi.OID noPrivProtocol`
- `public final static org.snmp4j.smi.OID usmUserEntryOID`
- `public final static org.snmp4j.smi.OID usmUserSpinLockOID`

**Methods:**
- `public org.snmp4j.smi.OID getProtocolForKeyChange(org.snmp4j.agent.request.Request p0, org.snmp4j.smi.OID p1, org.snmp4j.security.dh.DHOperations$KeyType p2)`
- `public org.snmp4j.security.SecurityProtocols getSecurityProtocols()`
- `public org.snmp4j.agent.mo.DefaultMOTable getUsmUserEntry()`
- `public void incrementCounter(org.snmp4j.event.CounterEvent p0)`
- `public static org.snmp4j.security.UsmUserEntry localizeUser(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OctetString p1, org.snmp4j.smi.OID p2, org.snmp4j.smi.OctetString p3, org.snmp4j.smi.OID p4, org.snmp4j.smi.OctetString p5, org.snmp4j.security.SecurityProtocols p6)`
- `public void registerMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1) throws org.snmp4j.agent.DuplicateRegistrationException`
- `public synchronized void rowChanged(org.snmp4j.agent.mo.MOTableRowEvent p0)`
- `public void unregisterMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1)`
- `public synchronized void usmUserChange(org.snmp4j.event.UsmUserEvent p0)`
- `public void validate(org.snmp4j.agent.mo.MOValueValidationEvent p0)`

---

## public class `org.snmp4j.agent.mo.snmp.UsmMIB$UsmTableModel`
extends `org.snmp4j.agent.mo.DefaultMOMutableTableModel`  

**Constructors:**
- `public UsmTableModel(org.snmp4j.agent.mo.MOTableIndex p0)`

**Methods:**
- `public org.snmp4j.agent.mo.snmp.UsmMIB$UsmTableRow createRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`
- `public org.snmp4j.agent.mo.MOTableIndex getIndexDef()`

---

## public class `org.snmp4j.agent.mo.snmp.UsmMIB$UsmTableRow`
extends `org.snmp4j.agent.mo.DefaultMOMutableRow2PC`  

**Constructors:**
- `public UsmTableRow(org.snmp4j.agent.mo.snmp.UsmMIB$UsmTableModel p0, org.snmp4j.smi.OID p1, org.snmp4j.smi.Variable[] p2)`

**Methods:**
- `public void cleanupRow(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.DefaultMOTable$ChangeSet p1)`
- `public void clearKeyChangeObjects()`
- `public synchronized void commitRow(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1)`
- `public boolean containsHiddenValues()`
- `public org.snmp4j.security.AuthenticationProtocol getAuthProtocol(org.snmp4j.agent.mo.MOTableRow p0)`
- `public org.snmp4j.smi.OID getAuthProtocolOID(org.snmp4j.agent.mo.MOTableRow p0)`
- `public org.snmp4j.agent.mo.MOTableIndex getIndexDef()`
- `public org.snmp4j.security.PrivacyProtocol getPrivProtocol(org.snmp4j.agent.mo.MOTableRow p0)`
- `public org.snmp4j.smi.OID getPrivProtocolOID(org.snmp4j.agent.mo.MOTableRow p0)`
- `public org.snmp4j.smi.Variable getValue(int p0)`
- `public boolean isCloned()`
- `public void prepare(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1, int p2)`
- `public void setCloned(boolean p0)`
- `public void undoRow(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.DefaultMOTable$ChangeSet p1)`

---

## public class `org.snmp4j.agent.mo.snmp.UsmOwnKeyChange`
extends `org.snmp4j.agent.mo.snmp.UsmKeyChange`  

**Constructors:**
- `public UsmOwnKeyChange(int p0, org.snmp4j.agent.MOAccess p1, int p2)`

**Methods:**
- `public void prepare(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1, org.snmp4j.agent.mo.MOTableRow p2, int p3)`

---

## public class `org.snmp4j.agent.mo.snmp.VacmMIB`
implements `org.snmp4j.agent.MOGroup`, `org.snmp4j.agent.security.MutableVACM`  

**Constructors:**
- `public VacmMIB(org.snmp4j.agent.MOServer[] p0)`
- `public VacmMIB(org.snmp4j.agent.MOServer[] p0, org.snmp4j.security.SecurityModels p1)`

**Fields:**
- `public final static int colVacmAccessContextMatch`
- `public final static int colVacmAccessNotifyViewName`
- `public final static int colVacmAccessReadViewName`
- `public final static int colVacmAccessRowStatus`
- `public final static int colVacmAccessStorageType`
- `public final static int colVacmAccessWriteViewName`
- `public final static int colVacmGroupName`
- `public final static int colVacmSecurityToGroupRowStatus`
- `public final static int colVacmSecurityToGroupStorageType`
- `public final static int colVacmViewTreeFamilyMask`
- `public final static int colVacmViewTreeFamilyRowStatus`
- `public final static int colVacmViewTreeFamilyStorageType`
- `public final static int colVacmViewTreeFamilyType`
- `public final static int idxVacmAccessContextMatch`
- `public final static int idxVacmAccessContextPrefix`
- `public final static int idxVacmAccessNotifyViewName`
- `public final static int idxVacmAccessReadViewName`
- `public final static int idxVacmAccessRowStatus`
- `public final static int idxVacmAccessSecurityLevel`
- `public final static int idxVacmAccessSecurityModel`
- `public final static int idxVacmAccessStorageType`
- `public final static int idxVacmAccessWriteViewName`
- `public final static int idxVacmGroupName`
- `public final static int idxVacmSecurityToGroupRowStatus`
- `public final static int idxVacmSecurityToGroupStorageType`
- `public final static int idxVacmViewTreeFamilyMask`
- `public final static int idxVacmViewTreeFamilyRowStatus`
- `public final static int idxVacmViewTreeFamilyStorageType`
- `public final static int idxVacmViewTreeFamilyType`
- `public final static int idxVacmViewTreeSubtree`
- `public final static org.snmp4j.smi.OID vacmAccessEntryOID`
- `public final static org.snmp4j.smi.OID vacmContextEntryOID`
- `public final static int vacmExactMatch`
- `public final static int vacmPrefixMatch`
- `public final static org.snmp4j.smi.OID vacmSecurityToGroupEntryOID`
- `public final static int vacmViewExcluded`
- `public final static int vacmViewIncluded`
- `public final static org.snmp4j.smi.OID vacmViewSpinLockOID`
- `public final static org.snmp4j.smi.OID vacmViewTreeFamilyEntryOID`

**Methods:**
- `public int accessEntryCount(org.snmp4j.smi.OctetString p0)`
- `public void addAccess(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OctetString p1, int p2, int p3, int p4, org.snmp4j.smi.OctetString p5, org.snmp4j.smi.OctetString p6, org.snmp4j.smi.OctetString p7, int p8)`
- `public void addGroup(int p0, org.snmp4j.smi.OctetString p1, org.snmp4j.smi.OctetString p2, int p3)`
- `public void addViewTreeFamily(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OID p1, org.snmp4j.smi.OctetString p2, int p3, int p4)`
- `public org.snmp4j.agent.mo.DefaultMOTable getVacmSecurityToGroupTable()`
- `public org.snmp4j.smi.OctetString getViewName(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OctetString p1, int p2, int p3, int p4)`
- `protected java.util.List getViews(org.snmp4j.smi.OctetString p0)`
- `public boolean hasSecurityToGroupMapping(int p0, org.snmp4j.smi.OctetString p1)`
- `public int isAccessAllowed(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OID p1)`
- `public int isAccessAllowed(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OctetString p1, int p2, int p3, int p4, org.snmp4j.smi.OID p5)`
- `public static boolean isBitSet(int p0, org.snmp4j.smi.OctetString p1)`
- `public void registerMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1) throws org.snmp4j.agent.DuplicateRegistrationException`
- `public boolean removeAccess(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OctetString p1, int p2, int p3)`
- `public boolean removeGroup(int p0, org.snmp4j.smi.OctetString p1)`
- `public boolean removeViewTreeFamily(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OID p1)`
- `public void unregisterMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1)`
- `public int viewTreeFamilyEntryCount(org.snmp4j.smi.OctetString p0)`

---

## public static class `org.snmp4j.agent.mo.snmp.VacmMIB$VacmContextIterator`
implements `java.util.Iterator<org.snmp4j.agent.mo.MOTableRow>`  

**Methods:**
- `public boolean hasNext()`
- `public org.snmp4j.agent.mo.MOTableRow next()`
- `public void remove()`

---

## public class `org.snmp4j.agent.mo.snmp.dh.DHKeyChangeImpl`
extends `org.snmp4j.agent.mo.snmp.KeyChange`  

**Constructors:**
- `public DHKeyChangeImpl(int p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.OctetString p2, org.snmp4j.security.dh.DHParameters p3, org.snmp4j.agent.mo.snmp.UsmMIB p4, org.snmp4j.security.dh.DHOperations$KeyType p5)`

**Methods:**
- `public void commit(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1, org.snmp4j.agent.mo.MOTableRow p2, int p3)`
- `public void get(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1, int p2)`
- `public void prepare(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1, org.snmp4j.agent.mo.MOTableRow p2, int p3)`
- `public void undo(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1, int p2)`

---

## public class `org.snmp4j.agent.mo.snmp.dh.DHKeyInfo`

**Methods:**
- `public void clearUsmKey()`
- `public java.security.KeyPair generatePublicKey(org.snmp4j.security.dh.DHParameters p0) throws java.security.InvalidAlgorithmParameterException, java.security.NoSuchAlgorithmException`
- `public javax.crypto.KeyAgreement getInitializedKeyAgreement()`
- `public byte[] getSharedKey()`
- `public byte[] getUsmKey()`
- `public boolean isKeyChangePending()`
- `public void setUsmKey(byte[] p0)`

---

## public abstract interface `org.snmp4j.agent.mo.snmp.dh.DHKickstartParameters`

**Methods:**
- `public abstract org.snmp4j.smi.OID getAuthenticationProtocol()`
- `public abstract org.snmp4j.smi.OID getPrivacyProtocol()`
- `public abstract org.snmp4j.smi.OctetString getPublicKey()`
- `public abstract org.snmp4j.smi.OctetString getSecurityName()`
- `public abstract java.lang.String getVacmRole()`
- `public abstract boolean isResetRequested()`

---

## public class `org.snmp4j.agent.mo.snmp.dh.DHKickstartParametersImpl`
implements `org.snmp4j.agent.mo.snmp.dh.DHKickstartParameters`  

**Constructors:**
- `public DHKickstartParametersImpl(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OctetString p1)`
- `public DHKickstartParametersImpl(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OctetString p1, org.snmp4j.smi.OID p2, org.snmp4j.smi.OID p3, java.lang.String p4, boolean p5)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public org.snmp4j.smi.OID getAuthenticationProtocol()`
- `public org.snmp4j.smi.OID getPrivacyProtocol()`
- `public org.snmp4j.smi.OctetString getPublicKey()`
- `public org.snmp4j.smi.OctetString getSecurityName()`
- `public java.lang.String getVacmRole()`
- `public int hashCode()`
- `public boolean isResetRequested()`
- `public static java.util.List readFromProperties(java.lang.String p0, java.util.Properties p1)`
- `public java.lang.String toString()`

---

## public class `org.snmp4j.agent.mo.snmp.dh.SnmpUsmDhObjectsMib`
implements `org.snmp4j.agent.MOGroup`  

**Constructors:**
- `protected SnmpUsmDhObjectsMib()`
- `protected SnmpUsmDhObjectsMib(org.snmp4j.agent.mo.MOFactory p0)`
- `public SnmpUsmDhObjectsMib(org.snmp4j.agent.mo.MOFactory p0, org.snmp4j.security.USM p1, org.snmp4j.agent.mo.snmp.UsmMIB p2, org.snmp4j.agent.mo.snmp.VacmMIB p3, java.util.Collection p4)`

**Fields:**
- `public final static int colUsmDHKickstartMgrPublic`
- `public final static int colUsmDHKickstartMyPublic`
- `public final static int colUsmDHKickstartSecurityName`
- `public final static int colUsmDHUserAuthKeyChange`
- `public final static int colUsmDHUserOwnAuthKeyChange`
- `public final static int colUsmDHUserOwnPrivKeyChange`
- `public final static int colUsmDHUserPrivKeyChange`
- `protected java.util.Collection dhKickstartParameters`
- `protected org.snmp4j.security.dh.DHOperations dhOperations`
- `public final static int idxUsmDHKickstartMgrPublic`
- `public final static int idxUsmDHKickstartMyPublic`
- `public final static int idxUsmDHKickstartSecurityName`
- `public final static int idxUsmDHUserAuthKeyChange`
- `public final static int idxUsmDHUserOwnAuthKeyChange`
- `public final static int idxUsmDHUserOwnPrivKeyChange`
- `public final static int idxUsmDHUserPrivKeyChange`
- `public final static org.snmp4j.smi.OID oidSnmpUsmDhObjectsMib`
- `public final static org.snmp4j.smi.OID oidUsmDHKickstartEntry`
- `public final static org.snmp4j.smi.OID oidUsmDHKickstartIndex`
- `public final static org.snmp4j.smi.OID oidUsmDHParameters`
- `public final static org.snmp4j.smi.OID oidUsmDHUserKeyEntry`
- `public final static org.snmp4j.smi.OID oidUsmUserEngineID`
- `public final static org.snmp4j.smi.OID oidUsmUserName`
- `public final static java.lang.String tcDefDHKeyChange`
- `public final static java.lang.String tcDefSnmpAdminString`
- `public final static java.lang.String tcModuleSnmpFrameworkMib`
- `public final static java.lang.String tcModuleSnmpUsmDhObjectsMib`
- `protected org.snmp4j.security.USM usm`
- `protected org.snmp4j.agent.mo.snmp.UsmMIB usmMIB`
- `protected org.snmp4j.agent.mo.snmp.VacmMIB vacmMIB`

**Methods:**
- `public void addImportedTCsToFactory(org.snmp4j.agent.mo.MOFactory p0)`
- `protected void addTCsToFactory(org.snmp4j.agent.mo.MOFactory p0)`
- `protected void createMO(org.snmp4j.agent.mo.MOFactory p0)`
- `public org.snmp4j.security.dh.DHParameters getDHParameters()`
- `protected org.snmp4j.smi.OctetString getGroupNameForVacmRole(java.lang.String p0)`
- `public org.snmp4j.agent.mo.MOTable getUsmDHKickstartEntry()`
- `public org.snmp4j.agent.mo.snmp.dh.UsmDHParametersImpl getUsmDHParameters()`
- `public org.snmp4j.agent.mo.MOTable getUsmDHUserKeyEntry()`
- `protected void initDHKickstart(java.util.Collection p0)`
- `public void registerMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1) throws org.snmp4j.agent.DuplicateRegistrationException`
- `public void setBaseTableUsmDHUserKeyEntry(org.snmp4j.agent.mo.DefaultMOTable p0)`
- `public void unregisterMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1)`

---

## public class `org.snmp4j.agent.mo.snmp.dh.SnmpUsmDhObjectsMib$DHKeyChange`
implements `org.snmp4j.agent.mo.snmp.tc.TextualConvention<org.snmp4j.smi.OctetString>`  

**Constructors:**
- `public DHKeyChange()`

**Methods:**
- `public org.snmp4j.agent.mo.MOColumn createColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2, org.snmp4j.smi.OctetString p3, boolean p4)`
- `public org.snmp4j.smi.OctetString createInitialValue()`
- `public org.snmp4j.agent.mo.MOScalar createScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.OctetString p2)`
- `public java.lang.String getModuleName()`
- `public java.lang.String getName()`

---

## public class `org.snmp4j.agent.mo.snmp.dh.SnmpUsmDhObjectsMib$UsmDHKickstartEntryRow`
extends `org.snmp4j.agent.mo.DefaultMOMutableRow2PC`  

**Constructors:**
- `public UsmDHKickstartEntryRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`

**Methods:**
- `public org.snmp4j.smi.OctetString getUsmDHKickstartMgrPublic()`
- `public org.snmp4j.smi.OctetString getUsmDHKickstartMyPublic()`
- `public org.snmp4j.smi.OctetString getUsmDHKickstartSecurityName()`
- `public org.snmp4j.smi.Variable getValue(int p0)`
- `public void setUsmDHKickstartMgrPublic(org.snmp4j.smi.OctetString p0)`
- `public void setUsmDHKickstartMyPublic(org.snmp4j.smi.OctetString p0)`
- `public void setUsmDHKickstartSecurityName(org.snmp4j.smi.OctetString p0)`
- `public void setValue(int p0, org.snmp4j.smi.Variable p1)`

---

## public class `org.snmp4j.agent.mo.snmp.dh.SnmpUsmDhObjectsMib$UsmDHParameters`
extends `org.snmp4j.agent.mo.snmp.dh.UsmDHParametersImpl`  

**Methods:**
- `public org.snmp4j.smi.OctetString getValue()`
- `public int isValueOK(org.snmp4j.agent.request.SubRequest p0)`
- `public int setValue(org.snmp4j.smi.OctetString p0)`

---

## public class `org.snmp4j.agent.mo.snmp.dh.SnmpUsmDhObjectsMib$UsmDHUserKeyEntryRow`
extends `org.snmp4j.agent.mo.DefaultMOMutableRow2PC`  

**Constructors:**
- `public UsmDHUserKeyEntryRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`

**Methods:**
- `public void clearDHKeyChange()`
- `public void commitRow(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1)`
- `public org.snmp4j.agent.mo.snmp.dh.DHKeyInfo getAuthKeyChange()`
- `public org.snmp4j.security.AuthenticationProtocol getAuthProtocol(org.snmp4j.agent.mo.MOTableRow p0)`
- `public org.snmp4j.agent.mo.MOTableIndex getIndexDef()`
- `public byte[] getNewAuthKey()`
- `public byte[] getNewPrivKey()`
- `public org.snmp4j.agent.mo.snmp.dh.DHKeyInfo getOwnAuthKeyChange()`
- `public org.snmp4j.agent.mo.snmp.dh.DHKeyInfo getOwnPrivKeyChange()`
- `public org.snmp4j.agent.mo.snmp.dh.DHKeyInfo getPrivKeyChange()`
- `public org.snmp4j.security.PrivacyProtocol getPrivProtocol(org.snmp4j.agent.mo.MOTableRow p0)`
- `public org.snmp4j.smi.OctetString getUsmDHUserAuthKeyChange()`
- `public org.snmp4j.smi.OctetString getUsmDHUserOwnAuthKeyChange()`
- `public org.snmp4j.smi.OctetString getUsmDHUserOwnPrivKeyChange()`
- `public org.snmp4j.smi.OctetString getUsmDHUserPrivKeyChange()`
- `public org.snmp4j.smi.Variable getValue(int p0)`
- `public boolean isKeyChangePending()`
- `public void setUsmDHUserAuthKeyChange(org.snmp4j.smi.OctetString p0)`
- `public void setUsmDHUserOwnAuthKeyChange(org.snmp4j.smi.OctetString p0)`
- `public void setUsmDHUserOwnPrivKeyChange(org.snmp4j.smi.OctetString p0)`
- `public void setUsmDHUserPrivKeyChange(org.snmp4j.smi.OctetString p0)`
- `public void setValue(int p0, org.snmp4j.smi.Variable p1)`

---

## public class `org.snmp4j.agent.mo.snmp.dh.UsmDHParametersImpl`
extends `org.snmp4j.agent.mo.MOScalar`  

**Constructors:**
- `public UsmDHParametersImpl(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.OctetString p2)`

**Methods:**
- `public void decodeBER(org.snmp4j.smi.OctetString p0) throws java.io.IOException`
- `public org.snmp4j.smi.OctetString encodeBER()`
- `public org.snmp4j.security.dh.DHParameters getDHParamters()`
- `public org.snmp4j.smi.OctetString getValue()`
- `public java.lang.String toString()`

---

## public class `org.snmp4j.agent.mo.snmp.smi.Constraint`

**Constructors:**
- `public Constraint(long p0, long p1)`

**Methods:**
- `public long getLowerBound()`
- `public long getUpperBound()`

---

## public abstract interface `org.snmp4j.agent.mo.snmp.smi.Constraints`
implements `org.snmp4j.agent.mo.snmp.smi.ValueConstraint`  

**Methods:**
- `public abstract void add(org.snmp4j.agent.mo.snmp.smi.Constraint p0)`
- `public abstract org.snmp4j.agent.mo.snmp.smi.Constraint[] getConstraints()`
- `public abstract boolean isValidSize(long p0)`
- `public abstract void remove(org.snmp4j.agent.mo.snmp.smi.Constraint p0)`

---

## public class `org.snmp4j.agent.mo.snmp.smi.ConstraintsImpl`
implements `org.snmp4j.agent.mo.snmp.smi.Constraints`  

**Constructors:**
- `public ConstraintsImpl()`

**Methods:**
- `public void add(org.snmp4j.agent.mo.snmp.smi.Constraint p0)`
- `public org.snmp4j.agent.mo.snmp.smi.Constraint[] getConstraints()`
- `public boolean isValidSize(long p0)`
- `public void remove(org.snmp4j.agent.mo.snmp.smi.Constraint p0)`
- `public int validate(org.snmp4j.smi.Variable p0)`

---

## public class `org.snmp4j.agent.mo.snmp.smi.EnumerationConstraint`
implements `org.snmp4j.agent.mo.snmp.smi.ValueConstraint`  

**Constructors:**
- `public EnumerationConstraint(int[] p0)`

**Methods:**
- `public int validate(org.snmp4j.smi.Variable p0)`

---

## public abstract interface `org.snmp4j.agent.mo.snmp.smi.ValueConstraint`

**Methods:**
- `public abstract int validate(org.snmp4j.smi.Variable p0)`

---

## public class `org.snmp4j.agent.mo.snmp.smi.ValueConstraintValidator`
implements `org.snmp4j.agent.mo.MOValueValidationListener`  

**Constructors:**
- `public ValueConstraintValidator(org.snmp4j.agent.mo.snmp.smi.ValueConstraint p0)`

**Methods:**
- `public org.snmp4j.agent.mo.snmp.smi.ValueConstraint getValueConstraint()`
- `public void validate(org.snmp4j.agent.mo.MOValueValidationEvent p0)`

---

## public class `org.snmp4j.agent.mo.snmp.tc.AutonomousTypeTC`
implements `org.snmp4j.agent.mo.snmp.tc.TextualConvention<org.snmp4j.smi.OID>`  

**Constructors:**
- `public AutonomousTypeTC()`

**Methods:**
- `public org.snmp4j.agent.mo.MOColumn createColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2, org.snmp4j.smi.OID p3, boolean p4)`
- `public org.snmp4j.smi.OID createInitialValue()`
- `public org.snmp4j.agent.mo.MOScalar createScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.OID p2)`
- `public java.lang.String getModuleName()`
- `public java.lang.String getName()`

---

## public class `org.snmp4j.agent.mo.snmp.tc.DateAndTimeTC`
implements `org.snmp4j.agent.mo.snmp.tc.TextualConvention<org.snmp4j.smi.OctetString>`  

**Constructors:**
- `public DateAndTimeTC()`

**Methods:**
- `public org.snmp4j.agent.mo.MOColumn createColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2, org.snmp4j.smi.OctetString p3, boolean p4)`
- `public org.snmp4j.smi.OctetString createInitialValue()`
- `public org.snmp4j.agent.mo.MOScalar createScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.OctetString p2)`
- `public java.lang.String getModuleName()`
- `public java.lang.String getName()`

---

## public class `org.snmp4j.agent.mo.snmp.tc.DisplayStringTC`
implements `org.snmp4j.agent.mo.snmp.tc.TextualConvention<org.snmp4j.smi.OctetString>`  

**Constructors:**
- `public DisplayStringTC()`

**Methods:**
- `public org.snmp4j.agent.mo.MOColumn createColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2, org.snmp4j.smi.OctetString p3, boolean p4)`
- `public org.snmp4j.smi.OctetString createInitialValue()`
- `public org.snmp4j.agent.mo.MOScalar createScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.OctetString p2)`
- `public java.lang.String getModuleName()`
- `public java.lang.String getName()`

---

## public class `org.snmp4j.agent.mo.snmp.tc.RowStatusTC`<R extends org.snmp4j.agent.mo.MOTableRow>
implements `org.snmp4j.agent.mo.snmp.tc.TextualConvention<org.snmp4j.smi.Integer32>`  

**Constructors:**
- `public RowStatusTC()`

**Methods:**
- `public org.snmp4j.agent.mo.MOColumn createColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2, org.snmp4j.smi.Integer32 p3, boolean p4)`
- `public org.snmp4j.smi.Integer32 createInitialValue()`
- `public org.snmp4j.agent.mo.MOScalar createScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.Integer32 p2)`
- `public java.lang.String getModuleName()`
- `public java.lang.String getName()`

---

## public class `org.snmp4j.agent.mo.snmp.tc.SnmpAdminStringTC`
implements `org.snmp4j.agent.mo.snmp.tc.TextualConvention<org.snmp4j.smi.OctetString>`  

**Constructors:**
- `public SnmpAdminStringTC()`

**Methods:**
- `public org.snmp4j.agent.mo.MOColumn createColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2, org.snmp4j.smi.OctetString p3, boolean p4)`
- `public org.snmp4j.smi.OctetString createInitialValue()`
- `public org.snmp4j.agent.mo.MOScalar createScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.OctetString p2)`
- `public java.lang.String getModuleName()`
- `public java.lang.String getName()`

---

## public class `org.snmp4j.agent.mo.snmp.tc.SnmpEngineIDTC`
implements `org.snmp4j.agent.mo.snmp.tc.TextualConvention<org.snmp4j.smi.OctetString>`  

**Constructors:**
- `public SnmpEngineIDTC(org.snmp4j.smi.OctetString p0)`

**Methods:**
- `public org.snmp4j.agent.mo.MOColumn createColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2, org.snmp4j.smi.OctetString p3, boolean p4)`
- `public org.snmp4j.smi.OctetString createInitialValue()`
- `public org.snmp4j.agent.mo.MOScalar createScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.OctetString p2)`
- `public java.lang.String getModuleName()`
- `public java.lang.String getName()`

---

## public class `org.snmp4j.agent.mo.snmp.tc.StorageTypeTC`
implements `org.snmp4j.agent.mo.snmp.tc.TextualConvention<org.snmp4j.smi.Integer32>`  

**Constructors:**
- `public StorageTypeTC()`

**Methods:**
- `public org.snmp4j.agent.mo.MOColumn createColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2, org.snmp4j.smi.Integer32 p3, boolean p4)`
- `public org.snmp4j.smi.Integer32 createInitialValue()`
- `public org.snmp4j.agent.mo.MOScalar createScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.Integer32 p2)`
- `public java.lang.String getModuleName()`
- `public java.lang.String getName()`

---

## public abstract interface `org.snmp4j.agent.mo.snmp.tc.TCModule`

**Methods:**
- `public abstract java.lang.String getName()`
- `public abstract org.snmp4j.agent.mo.snmp.tc.TextualConvention getTextualConvention(java.lang.String p0)`
- `public abstract java.util.Collection getTextualConventions()`

---

## public class `org.snmp4j.agent.mo.snmp.tc.TestAndIncrTC`
implements `org.snmp4j.agent.mo.snmp.tc.TextualConvention<org.snmp4j.smi.Integer32>`  

**Constructors:**
- `public TestAndIncrTC()`

**Methods:**
- `public org.snmp4j.agent.mo.MOColumn createColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2, org.snmp4j.smi.Integer32 p3, boolean p4)`
- `public org.snmp4j.smi.Integer32 createInitialValue()`
- `public org.snmp4j.agent.mo.MOScalar createScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.Integer32 p2)`
- `public java.lang.String getModuleName()`
- `public java.lang.String getName()`

---

## public abstract interface `org.snmp4j.agent.mo.snmp.tc.TextualConvention`<V extends org.snmp4j.smi.Variable>

**Methods:**
- `public abstract org.snmp4j.agent.mo.MOColumn createColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2, V p3, boolean p4)`
- `public abstract V createInitialValue()`
- `public abstract org.snmp4j.agent.mo.MOScalar createScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, V p2)`
- `public abstract java.lang.String getModuleName()`
- `public abstract java.lang.String getName()`

---

## public class `org.snmp4j.agent.mo.snmp.tc.TimeStampTC`
implements `org.snmp4j.agent.mo.snmp.tc.TextualConvention<org.snmp4j.smi.TimeTicks>`  

**Constructors:**
- `public TimeStampTC()`
- `public TimeStampTC(org.snmp4j.smi.OctetString p0)`

**Methods:**
- `public org.snmp4j.agent.mo.MOColumn createColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2, org.snmp4j.smi.TimeTicks p3, boolean p4)`
- `public org.snmp4j.smi.TimeTicks createInitialValue()`
- `public org.snmp4j.agent.mo.MOScalar createScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.TimeTicks p2)`
- `public java.lang.String getModuleName()`
- `public java.lang.String getName()`

---

## public class `org.snmp4j.agent.mo.snmp.tc.TruthValueTC`
implements `org.snmp4j.agent.mo.snmp.tc.TextualConvention<org.snmp4j.smi.Integer32>`  

**Constructors:**
- `public TruthValueTC()`

**Fields:**
- `public final static int FALSE`
- `public final static int TRUE`

**Methods:**
- `public org.snmp4j.agent.mo.MOColumn createColumn(int p0, int p1, org.snmp4j.agent.MOAccess p2, org.snmp4j.smi.Integer32 p3, boolean p4)`
- `public org.snmp4j.smi.Integer32 createInitialValue()`
- `public org.snmp4j.agent.mo.MOScalar createScalar(org.snmp4j.smi.OID p0, org.snmp4j.agent.MOAccess p1, org.snmp4j.smi.Integer32 p2)`
- `public static boolean getBooleanValue(org.snmp4j.smi.Integer32 p0)`
- `public java.lang.String getModuleName()`
- `public java.lang.String getName()`
- `public static org.snmp4j.smi.Integer32 getValue(boolean p0)`

---

## public class `org.snmp4j.agent.mo.snmp4j.MOSubtreeProxy`
implements `org.snmp4j.agent.mo.GenericManagedObject`  

**Constructors:**
- `public MOSubtreeProxy(org.snmp4j.Session p0, org.snmp4j.agent.mo.snmp.SnmpTargetMIB p1, org.snmp4j.smi.OctetString p2, org.snmp4j.smi.OID p3, org.snmp4j.smi.OctetString p4, org.snmp4j.smi.OctetString p5, org.snmp4j.smi.OctetString p6)`

**Methods:**
- `public void cleanup(org.snmp4j.agent.request.SubRequest p0)`
- `public void commit(org.snmp4j.agent.request.SubRequest p0)`
- `public org.snmp4j.smi.OID find(org.snmp4j.agent.MOScope p0)`
- `public void get(org.snmp4j.agent.request.SubRequest p0)`
- `public org.snmp4j.agent.MOAccess getAccess()`
- `public org.snmp4j.smi.OctetString getProxyName()`
- `public org.snmp4j.agent.MOScope getScope()`
- `public org.snmp4j.agent.util.OIDTranslation getTranslation()`
- `public boolean isUndoEnabled()`
- `public boolean next(org.snmp4j.agent.request.SubRequest p0)`
- `public void prepare(org.snmp4j.agent.request.SubRequest p0)`
- `public void setAccess(org.snmp4j.agent.MOAccess p0)`
- `public void setTargetSubtree(org.snmp4j.smi.OID p0)`
- `public void setTranslation(org.snmp4j.agent.util.OIDTranslation p0)`
- `public void setUndoEnabled(boolean p0)`
- `public java.lang.String toString()`
- `public void undo(org.snmp4j.agent.request.SubRequest p0)`

---

## public class `org.snmp4j.agent.mo.snmp4j.MOSubtreeProxy$OIDTranslator`
implements `org.snmp4j.agent.util.OIDTranslation`  

**Constructors:**
- `public OIDTranslator(org.snmp4j.smi.OID p0)`

**Methods:**
- `public org.snmp4j.smi.OID backwardTranslate(org.snmp4j.smi.OID p0)`
- `public org.snmp4j.smi.OID forwardTranslate(org.snmp4j.smi.OID p0)`
- `public java.lang.String toString()`

---

## public class `org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib`
implements `org.snmp4j.agent.MOGroup`, `org.snmp4j.agent.mo.MOPriorityProvider`  

**Constructors:**
- `public Snmp4jConfigMib(org.snmp4j.agent.mo.snmp.SysUpTime p0)`
- `public Snmp4jConfigMib(org.snmp4j.agent.mo.snmp.SysUpTime p0, org.snmp4j.agent.AgentConfigManager p1)`

**Fields:**
- `public final static org.snmp4j.smi.OID PRIMARY_INDEX`
- `public final static int colSnmp4jCfgStorageID`
- `public final static int colSnmp4jCfgStorageLastRestore`
- `public final static int colSnmp4jCfgStorageLastStore`
- `public final static int colSnmp4jCfgStorageOperation`
- `public final static int colSnmp4jCfgStoragePath`
- `public final static int colSnmp4jCfgStorageRestoreMode`
- `public final static int colSnmp4jCfgStorageSeqRowStatus`
- `public final static int colSnmp4jCfgStorageSeqStorageType`
- `public final static int colSnmp4jCfgStorageSeqSubtree`
- `public final static int colSnmp4jCfgStorageStatus`
- `public final static int colSnmp4jCfgStorageStorageType`
- `public final static int idxSnmp4jCfgStorageID`
- `public final static int idxSnmp4jCfgStorageLastRestore`
- `public final static int idxSnmp4jCfgStorageLastStore`
- `public final static int idxSnmp4jCfgStorageOperation`
- `public final static int idxSnmp4jCfgStoragePath`
- `public final static int idxSnmp4jCfgStorageRestoreMode`
- `public final static int idxSnmp4jCfgStorageSeqRowStatus`
- `public final static int idxSnmp4jCfgStorageSeqStorageType`
- `public final static int idxSnmp4jCfgStorageSeqSubtree`
- `public final static int idxSnmp4jCfgStorageStatus`
- `public final static int idxSnmp4jCfgStorageStorageType`
- `public final static org.snmp4j.smi.OID oidSnmp4jCfgReset`
- `public final static org.snmp4j.smi.OID oidSnmp4jCfgSecSrcAddrValidation`
- `public final static org.snmp4j.smi.OID oidSnmp4jCfgStorageEntry`
- `public final static org.snmp4j.smi.OID oidSnmp4jCfgStorageSeqEntry`
- `public final static org.snmp4j.smi.OID oidSnmp4jCfgStorageSeqIndex`
- `protected java.util.Map persistenceProvider`
- `protected org.snmp4j.agent.io.MOPersistenceProvider primaryPersistence`
- `protected org.snmp4j.agent.mo.snmp.SnmpCommunityMIB snmpCommunityMIB`
- `protected org.snmp4j.agent.mo.snmp.SysUpTime sysUpTime`

**Methods:**
- `public void addPersistenceProvider(org.snmp4j.agent.io.MOPersistenceProvider p0)`
- `public synchronized void freeRow(org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib$Snmp4jCfgStorageEntryRow p0)`
- `public org.snmp4j.agent.ManagedObject getBootManagedObject(org.snmp4j.smi.OctetString p0)`
- `public org.snmp4j.agent.mo.snmp.SnmpCommunityMIB getCoexistenceInfoProvider()`
- `public org.snmp4j.agent.io.MOPersistenceProvider getPersistenceProvider(java.lang.String p0)`
- `public org.snmp4j.agent.io.MOPersistenceProvider getPrimaryPersistence()`
- `public java.util.SortedMap getPriorityMap(org.snmp4j.smi.OctetString p0)`
- `public org.snmp4j.agent.mo.MOTable getSnmp4jCfgStorageEntry()`
- `public org.snmp4j.agent.mo.MOTable getSnmp4jCfgStorageSeqEntry()`
- `public void registerMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1) throws org.snmp4j.agent.DuplicateRegistrationException`
- `public void setPrimaryProvider(org.snmp4j.agent.io.MOPersistenceProvider p0)`
- `public void setSnmpCommunityMIB(org.snmp4j.agent.mo.snmp.SnmpCommunityMIB p0)`
- `public void unregisterMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1)`

---

## public class `org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib$Snmp4jCfgReset`
extends `org.snmp4j.agent.mo.snmp.EnumeratedScalar`  

**Methods:**
- `public void cleanup(org.snmp4j.agent.request.SubRequest p0)`
- `public void commit(org.snmp4j.agent.request.SubRequest p0)`
- `public int isValueOK(org.snmp4j.agent.request.SubRequest p0)`

---

## public final static class `org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib$Snmp4jCfgResetEnum`

**Constructors:**
- `public Snmp4jCfgResetEnum()`

**Fields:**
- `public final static int done`
- `public final static int factoryReset`
- `public final static int idle`
- `public final static int resetFailed`
- `public final static int resetting`

---

## public class `org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib$Snmp4jCfgSecSrcAddrValidation`
extends `org.snmp4j.agent.mo.snmp.EnumeratedScalar`  

**Methods:**
- `public void cleanup(org.snmp4j.agent.request.SubRequest p0)`
- `public void commit(org.snmp4j.agent.request.SubRequest p0)`
- `public org.snmp4j.smi.Integer32 getValue()`
- `public int isValueOK(org.snmp4j.agent.request.SubRequest p0)`

---

## public final static class `org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib$Snmp4jCfgSecSrcAddrValidationEnum`

**Constructors:**
- `public Snmp4jCfgSecSrcAddrValidationEnum()`

**Fields:**
- `public final static int disabled`
- `public final static int enabled`
- `public final static int notAvailable`

---

## public class `org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib$Snmp4jCfgStorageEntryRow`
extends `org.snmp4j.agent.mo.DefaultMOMutableRow2PC`  

**Constructors:**
- `public Snmp4jCfgStorageEntryRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`

**Methods:**
- `public void commitRow(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1)`
- `public org.snmp4j.smi.OctetString getSnmp4jCfgStorageID()`
- `public org.snmp4j.smi.TimeTicks getSnmp4jCfgStorageLastRestore()`
- `public org.snmp4j.smi.TimeTicks getSnmp4jCfgStorageLastStore()`
- `public org.snmp4j.smi.Integer32 getSnmp4jCfgStorageOperation()`
- `public org.snmp4j.smi.OctetString getSnmp4jCfgStoragePath()`
- `public org.snmp4j.smi.Integer32 getSnmp4jCfgStorageRestoreMode()`
- `public org.snmp4j.smi.Integer32 getSnmp4jCfgStorageStatus()`
- `public org.snmp4j.smi.Integer32 getSnmp4jCfgStorageStorageType()`
- `public void prepareRow(org.snmp4j.agent.request.SubRequest p0, org.snmp4j.agent.mo.MOTableRow p1)`
- `public void setSnmp4jCfgStorageID(org.snmp4j.smi.OctetString p0)`
- `public void setSnmp4jCfgStorageLastRestore(org.snmp4j.smi.TimeTicks p0)`
- `public void setSnmp4jCfgStorageLastStore(org.snmp4j.smi.TimeTicks p0)`
- `public void setSnmp4jCfgStorageOperation(org.snmp4j.smi.Integer32 p0)`
- `public void setSnmp4jCfgStoragePath(org.snmp4j.smi.OctetString p0)`
- `public void setSnmp4jCfgStorageRestoreMode(org.snmp4j.smi.Integer32 p0)`
- `public void setSnmp4jCfgStorageStatus(org.snmp4j.smi.Integer32 p0)`
- `public void setSnmp4jCfgStorageStorageType(org.snmp4j.smi.Integer32 p0)`

---

## public final static class `org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib$Snmp4jCfgStorageFormatEnum`

**Constructors:**
- `public Snmp4jCfgStorageFormatEnum()`

**Fields:**
- `public final static int binary`
- `public final static int xml`

---

## public final static class `org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib$Snmp4jCfgStorageOperationEnum`

**Constructors:**
- `public Snmp4jCfgStorageOperationEnum()`

**Fields:**
- `public final static int idle`
- `public final static int inProgress`
- `public final static int restore`
- `public final static int store`

---

## public final static class `org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib$Snmp4jCfgStorageRestoreModeEnum`

**Constructors:**
- `public Snmp4jCfgStorageRestoreModeEnum()`

**Fields:**
- `public final static int createOnly`
- `public final static int replaceAndCreate`
- `public final static int updateAndCreate`
- `public final static int updateOnly`

---

## public class `org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib$Snmp4jCfgStorageSeqEntryRow`
extends `org.snmp4j.agent.mo.DefaultMOMutableRow2PC`  

**Constructors:**
- `public Snmp4jCfgStorageSeqEntryRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`

**Methods:**
- `public org.snmp4j.smi.Integer32 getSnmp4jCfgStorageSeqRowStatus()`
- `public org.snmp4j.smi.Integer32 getSnmp4jCfgStorageSeqStorageType()`
- `public org.snmp4j.smi.OID getSnmp4jCfgStorageSeqSubtree()`
- `public org.snmp4j.smi.Variable getValue(int p0)`
- `public void setSnmp4jCfgStorageSeqRowStatus(org.snmp4j.smi.Integer32 p0)`
- `public void setSnmp4jCfgStorageSeqStorageType(org.snmp4j.smi.Integer32 p0)`
- `public void setSnmp4jCfgStorageSeqSubtree(org.snmp4j.smi.OID p0)`
- `public void setValue(int p0, org.snmp4j.smi.Variable p1)`

---

## public class `org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib$Snmp4jCfgStorageSeqEntryRowFactory`
implements `org.snmp4j.agent.mo.MOTableRowFactory<org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib$Snmp4jCfgStorageSeqEntryRow>`  

**Constructors:**
- `public Snmp4jCfgStorageSeqEntryRowFactory()`

**Methods:**
- `public synchronized org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib$Snmp4jCfgStorageSeqEntryRow createRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1) throws java.lang.UnsupportedOperationException`
- `public synchronized void freeRow(org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib$Snmp4jCfgStorageSeqEntryRow p0)`

---

## public class `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib`
implements `org.snmp4j.agent.MOGroup`, `org.snmp4j.agent.MOServerLookupListener`, `org.snmp4j.agent.mo.MOTableRowListener<org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib$Snmp4jLogLoggerEntryRow>`, `org.snmp4j.agent.mo.snmp.RowStatusListener`  

**Constructors:**
- `public Snmp4jLogMib()`

**Fields:**
- `public final static int colSnmp4jLogConsoleHandlerTarget`
- `public final static int colSnmp4jLogFileHandlerAppend`
- `public final static int colSnmp4jLogFileHandlerBufferSize`
- `public final static int colSnmp4jLogFileHandlerBufferedIO`
- `public final static int colSnmp4jLogFileHandlerPath`
- `public final static int colSnmp4jLogHandlerRowStatus`
- `public final static int colSnmp4jLogHandlerStorageType`
- `public final static int colSnmp4jLogHandlerType`
- `public final static int colSnmp4jLogLoggerEffectiveLevel`
- `public final static int colSnmp4jLogLoggerIndex`
- `public final static int colSnmp4jLogLoggerLevel`
- `public final static int colSnmp4jLogLoggerRowStatus`
- `public final static int colSnmp4jLogLoggerStorageType`
- `public final static int colSnmp4jLogLoggerToHandlerRowStatus`
- `public final static int colSnmp4jLogLoggerToHandlerStorageType`
- `public final static int colSnmp4jLogLoggerToHandlerThreshold`
- `public final static int idxSnmp4jLogConsoleHandlerTarget`
- `public final static int idxSnmp4jLogFileHandlerAppend`
- `public final static int idxSnmp4jLogFileHandlerBufferSize`
- `public final static int idxSnmp4jLogFileHandlerBufferedIO`
- `public final static int idxSnmp4jLogFileHandlerPath`
- `public final static int idxSnmp4jLogHandlerRowStatus`
- `public final static int idxSnmp4jLogHandlerStorageType`
- `public final static int idxSnmp4jLogHandlerType`
- `public final static int idxSnmp4jLogLoggerEffectiveLevel`
- `public final static int idxSnmp4jLogLoggerIndex`
- `public final static int idxSnmp4jLogLoggerLevel`
- `public final static int idxSnmp4jLogLoggerRowStatus`
- `public final static int idxSnmp4jLogLoggerStorageType`
- `public final static int idxSnmp4jLogLoggerToHandlerRowStatus`
- `public final static int idxSnmp4jLogLoggerToHandlerStorageType`
- `public final static int idxSnmp4jLogLoggerToHandlerThreshold`
- `public final static org.snmp4j.smi.OID oidSnmp4jLogConsoleHandlerEntry`
- `public final static org.snmp4j.smi.OID oidSnmp4jLogFactory`
- `public final static org.snmp4j.smi.OID oidSnmp4jLogFileHandlerEntry`
- `public final static org.snmp4j.smi.OID oidSnmp4jLogHandlerEntry`
- `public final static org.snmp4j.smi.OID oidSnmp4jLogLoggerEntry`
- `public final static org.snmp4j.smi.OID oidSnmp4jLogLoggerToHandlerEntry`
- `public final static org.snmp4j.smi.OID oidSnmp4jLogRootLevel`
- `public final static org.snmp4j.smi.OID oidSnmp4jLogSysDescr`

**Methods:**
- `public org.snmp4j.agent.mo.MOTable getSnmp4jLogConsoleHandlerEntry()`
- `public org.snmp4j.agent.mo.MOTable getSnmp4jLogFileHandlerEntry()`
- `public org.snmp4j.agent.mo.MOTable getSnmp4jLogHandlerEntry()`
- `public org.snmp4j.agent.mo.MOTable getSnmp4jLogLoggerEntry()`
- `public org.snmp4j.agent.mo.MOTable getSnmp4jLogLoggerToHandlerEntry()`
- `public void lookupEvent(org.snmp4j.agent.MOServerLookupEvent p0)`
- `public void queryEvent(org.snmp4j.agent.MOServerLookupEvent p0)`
- `public void registerMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1) throws org.snmp4j.agent.DuplicateRegistrationException`
- `public void rowChanged(org.snmp4j.agent.mo.MOTableRowEvent p0)`
- `public void rowStatusChanged(org.snmp4j.agent.mo.snmp.RowStatusEvent p0)`
- `public void unregisterMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1)`
- `public synchronized void updateLoggerTable()`

---

## public class `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib$Snmp4jLogConsoleHandlerEntryRow`
extends `org.snmp4j.agent.mo.DefaultMOMutableRow2PC`  

**Constructors:**
- `public Snmp4jLogConsoleHandlerEntryRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`

**Methods:**
- `public org.snmp4j.smi.Integer32 getSnmp4jLogConsoleHandlerTarget()`
- `public void setSnmp4jLogConsoleHandlerTarget(org.snmp4j.smi.Integer32 p0)`

---

## public class `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib$Snmp4jLogConsoleHandlerEntryRowFactory`
implements `org.snmp4j.agent.mo.MOTableRowFactory<org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib$Snmp4jLogConsoleHandlerEntryRow>`  

**Constructors:**
- `public Snmp4jLogConsoleHandlerEntryRowFactory()`

**Methods:**
- `public org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib$Snmp4jLogConsoleHandlerEntryRow createRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1) throws java.lang.UnsupportedOperationException`
- `public void freeRow(org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib$Snmp4jLogConsoleHandlerEntryRow p0)`

---

## public final static class `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib$Snmp4jLogConsoleHandlerTargetEnum`

**Constructors:**
- `public Snmp4jLogConsoleHandlerTargetEnum()`

**Fields:**
- `public final static int systemErr`
- `public final static int systemOut`

---

## public final static class `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib$Snmp4jLogFileHandlerAppendEnum`

**Constructors:**
- `public Snmp4jLogFileHandlerAppendEnum()`

**Fields:**
- `public final static int _false`
- `public final static int _true`

---

## public final static class `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib$Snmp4jLogFileHandlerBufferedIOEnum`

**Constructors:**
- `public Snmp4jLogFileHandlerBufferedIOEnum()`

**Fields:**
- `public final static int _false`
- `public final static int _true`

---

## public class `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib$Snmp4jLogFileHandlerEntryRow`
extends `org.snmp4j.agent.mo.DefaultMOMutableRow2PC`  

**Constructors:**
- `public Snmp4jLogFileHandlerEntryRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`

**Methods:**
- `public org.snmp4j.smi.Integer32 getSnmp4jLogFileHandlerAppend()`
- `public org.snmp4j.smi.UnsignedInteger32 getSnmp4jLogFileHandlerBufferSize()`
- `public org.snmp4j.smi.Integer32 getSnmp4jLogFileHandlerBufferedIO()`
- `public org.snmp4j.smi.OctetString getSnmp4jLogFileHandlerPath()`
- `public void setSnmp4jLogFileHandlerAppend(org.snmp4j.smi.Integer32 p0)`
- `public void setSnmp4jLogFileHandlerBufferSize(org.snmp4j.smi.UnsignedInteger32 p0)`
- `public void setSnmp4jLogFileHandlerBufferedIO(org.snmp4j.smi.Integer32 p0)`
- `public void setSnmp4jLogFileHandlerPath(org.snmp4j.smi.OctetString p0)`

---

## public class `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib$Snmp4jLogFileHandlerEntryRowFactory`
implements `org.snmp4j.agent.mo.MOTableRowFactory<org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib$Snmp4jLogFileHandlerEntryRow>`  

**Constructors:**
- `public Snmp4jLogFileHandlerEntryRowFactory()`

**Methods:**
- `public org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib$Snmp4jLogFileHandlerEntryRow createRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1) throws java.lang.UnsupportedOperationException`
- `public void freeRow(org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib$Snmp4jLogFileHandlerEntryRow p0)`

---

## public class `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib$Snmp4jLogHandlerEntryRow`
extends `org.snmp4j.agent.mo.DefaultMOMutableRow2PC`  

**Constructors:**
- `public Snmp4jLogHandlerEntryRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`

**Methods:**
- `public org.snmp4j.smi.Integer32 getSnmp4jLogHandlerRowStatus()`
- `public org.snmp4j.smi.Integer32 getSnmp4jLogHandlerStorageType()`
- `public org.snmp4j.smi.OID getSnmp4jLogHandlerType()`
- `public void setSnmp4jLogHandlerRowStatus(org.snmp4j.smi.Integer32 p0)`
- `public void setSnmp4jLogHandlerStorageType(org.snmp4j.smi.Integer32 p0)`
- `public void setSnmp4jLogHandlerType(org.snmp4j.smi.OID p0)`

---

## public class `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib$Snmp4jLogHandlerEntryRowFactory`
implements `org.snmp4j.agent.mo.MOTableRowFactory<org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib$Snmp4jLogHandlerEntryRow>`  

**Constructors:**
- `public Snmp4jLogHandlerEntryRowFactory()`

**Methods:**
- `public org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib$Snmp4jLogHandlerEntryRow createRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1) throws java.lang.UnsupportedOperationException`
- `public void freeRow(org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib$Snmp4jLogHandlerEntryRow p0)`

---

## public class `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib$Snmp4jLogLoggerEntryRow`
extends `org.snmp4j.agent.mo.DefaultMOMutableRow2PC`  

**Constructors:**
- `public Snmp4jLogLoggerEntryRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`

**Methods:**
- `public org.snmp4j.smi.Integer32 getSnmp4jLogLoggerEffectiveLevel()`
- `public org.snmp4j.smi.Integer32 getSnmp4jLogLoggerIndex()`
- `public org.snmp4j.smi.Integer32 getSnmp4jLogLoggerLevel()`
- `public org.snmp4j.smi.Integer32 getSnmp4jLogLoggerRowStatus()`
- `public org.snmp4j.smi.Integer32 getSnmp4jLogLoggerStorageType()`
- `public org.snmp4j.smi.Variable getValue(int p0)`
- `public void setSnmp4jLogLoggerEffectiveLevel(org.snmp4j.smi.Integer32 p0)`
- `public void setSnmp4jLogLoggerIndex(org.snmp4j.smi.Integer32 p0)`
- `public void setSnmp4jLogLoggerLevel(org.snmp4j.smi.Integer32 p0)`
- `public void setSnmp4jLogLoggerRowStatus(org.snmp4j.smi.Integer32 p0)`
- `public void setSnmp4jLogLoggerStorageType(org.snmp4j.smi.Integer32 p0)`

---

## public class `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib$Snmp4jLogLoggerRow`
extends `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib$Snmp4jLogLoggerEntryRow`  

**Constructors:**
- `protected Snmp4jLogLoggerRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1, int p2, org.snmp4j.log.LogAdapter p3)`

**Methods:**
- `public org.snmp4j.log.LogAdapter getLogAdapter()`
- `public void setLogAdapter(org.snmp4j.log.LogAdapter p0)`

---

## public class `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib$Snmp4jLogLoggerToHandlerEntryRow`
extends `org.snmp4j.agent.mo.DefaultMOMutableRow2PC`  

**Constructors:**
- `public Snmp4jLogLoggerToHandlerEntryRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`

**Methods:**
- `public org.snmp4j.smi.Integer32 getSnmp4jLogLoggerToHandlerRowStatus()`
- `public org.snmp4j.smi.Integer32 getSnmp4jLogLoggerToHandlerStorageType()`
- `public org.snmp4j.smi.Integer32 getSnmp4jLogLoggerToHandlerThreshold()`
- `public void setSnmp4jLogLoggerToHandlerRowStatus(org.snmp4j.smi.Integer32 p0)`
- `public void setSnmp4jLogLoggerToHandlerStorageType(org.snmp4j.smi.Integer32 p0)`
- `public void setSnmp4jLogLoggerToHandlerThreshold(org.snmp4j.smi.Integer32 p0)`

---

## public final static class `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib$Snmp4jLogLoggerToHandlerThresholdEnum`

**Constructors:**
- `public Snmp4jLogLoggerToHandlerThresholdEnum()`

**Fields:**
- `public final static int all`
- `public final static int debug`
- `public final static int error`
- `public final static int fatal`
- `public final static int info`
- `public final static int notSpecified`
- `public final static int off`
- `public final static int trace`
- `public final static int warn`

---

## public class `org.snmp4j.agent.mo.snmp4j.Snmp4jProxyMib`
implements `org.snmp4j.agent.MOGroup`, `org.snmp4j.agent.mo.MOTableRowListener<org.snmp4j.agent.mo.snmp4j.Snmp4jProxyMib$Snmp4jProxyEntryRow>`, `org.snmp4j.agent.mo.snmp.RowStatusListener`  

**Constructors:**
- `protected Snmp4jProxyMib()`
- `protected Snmp4jProxyMib(org.snmp4j.agent.mo.MOFactory p0)`
- `public Snmp4jProxyMib(org.snmp4j.agent.mo.MOFactory p0, org.snmp4j.Session p1, org.snmp4j.agent.MOServer p2, org.snmp4j.agent.mo.snmp.SnmpTargetMIB p3)`

**Fields:**
- `public final static int colSnmp4jProxyContextEngineID`
- `public final static int colSnmp4jProxyContextName`
- `public final static int colSnmp4jProxyRowStatus`
- `public final static int colSnmp4jProxyStorageType`
- `public final static int colSnmp4jProxySubtree`
- `public final static int colSnmp4jProxyTarget`
- `public final static int colSnmp4jProxyTargetSubtree`
- `public final static int colSnmp4jProxyType`
- `public final static int idxSnmp4jProxyContextEngineID`
- `public final static int idxSnmp4jProxyContextName`
- `public final static int idxSnmp4jProxyRowStatus`
- `public final static int idxSnmp4jProxyStorageType`
- `public final static int idxSnmp4jProxySubtree`
- `public final static int idxSnmp4jProxyTarget`
- `public final static int idxSnmp4jProxyTargetSubtree`
- `public final static int idxSnmp4jProxyType`
- `public final static org.snmp4j.smi.OID oidSnmp4jProxyEntry`
- `public final static org.snmp4j.smi.OID oidSnmp4jProxyMib`
- `public final static org.snmp4j.smi.OID oidSnmp4jProxyName`
- `public final static java.lang.String tcDefRowStatus`
- `public final static java.lang.String tcDefSnmpAdminString`
- `public final static java.lang.String tcDefSnmpEngineID`
- `public final static java.lang.String tcDefStorageType`
- `public final static java.lang.String tcModuleSNMPv2Tc`
- `public final static java.lang.String tcModuleSnmpFrameworkMib`

**Methods:**
- `public void addImportedTCsToFactory(org.snmp4j.agent.mo.MOFactory p0)`
- `protected void addTCsToFactory(org.snmp4j.agent.mo.MOFactory p0)`
- `protected void createMO(org.snmp4j.agent.mo.MOFactory p0)`
- `public org.snmp4j.agent.mo.MOTable getSnmp4jProxyEntry()`
- `public void registerMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1) throws org.snmp4j.agent.DuplicateRegistrationException`
- `public synchronized void rowChanged(org.snmp4j.agent.mo.MOTableRowEvent p0)`
- `public void rowStatusChanged(org.snmp4j.agent.mo.snmp.RowStatusEvent p0)`
- `public void unregisterMOs(org.snmp4j.agent.MOServer p0, org.snmp4j.smi.OctetString p1)`

---

## public class `org.snmp4j.agent.mo.snmp4j.Snmp4jProxyMib$Snmp4jProxyEntryRow`
extends `org.snmp4j.agent.mo.DefaultMOMutableRow2PC`  

**Constructors:**
- `public Snmp4jProxyEntryRow(org.snmp4j.smi.OID p0, org.snmp4j.smi.Variable[] p1)`

**Methods:**
- `public org.snmp4j.smi.OctetString getSnmp4jProxyContextEngineID()`
- `public org.snmp4j.smi.OctetString getSnmp4jProxyContextName()`
- `public org.snmp4j.smi.Integer32 getSnmp4jProxyRowStatus()`
- `public org.snmp4j.smi.Integer32 getSnmp4jProxyStorageType()`
- `public org.snmp4j.smi.OID getSnmp4jProxySubtree()`
- `public org.snmp4j.smi.OctetString getSnmp4jProxyTarget()`
- `public org.snmp4j.smi.OID getSnmp4jProxyTargetSubtree()`
- `public org.snmp4j.smi.Integer32 getSnmp4jProxyType()`
- `public org.snmp4j.smi.Variable getValue(int p0)`
- `public void setSnmp4jProxyContextEngineID(org.snmp4j.smi.OctetString p0)`
- `public void setSnmp4jProxyContextName(org.snmp4j.smi.OctetString p0)`
- `public void setSnmp4jProxyRowStatus(org.snmp4j.smi.Integer32 p0)`
- `public void setSnmp4jProxyStorageType(org.snmp4j.smi.Integer32 p0)`
- `public void setSnmp4jProxySubtree(org.snmp4j.smi.OID p0)`
- `public void setSnmp4jProxyTarget(org.snmp4j.smi.OctetString p0)`
- `public void setSnmp4jProxyTargetSubtree(org.snmp4j.smi.OID p0)`
- `public void setSnmp4jProxyType(org.snmp4j.smi.Integer32 p0)`
- `public void setValue(int p0, org.snmp4j.smi.Variable p1)`

---

## public final static class `org.snmp4j.agent.mo.snmp4j.Snmp4jProxyMib$Snmp4jProxyTypeEnum`

**Constructors:**
- `public Snmp4jProxyTypeEnum()`

**Fields:**
- `public final static int invalid`
- `public final static int noProxy`
- `public final static int readAndWrite`
- `public final static int readOnly`

---

## public class `org.snmp4j.agent.mo.util.LexicographicOctetStringComparator`
implements `java.util.Comparator<org.snmp4j.smi.OctetString>`  

**Constructors:**
- `public LexicographicOctetStringComparator()`
- `public LexicographicOctetStringComparator(boolean p0)`

**Methods:**
- `public int compare(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OctetString p1)`

---

## public class `org.snmp4j.agent.mo.util.LogMOTableSizeLimit`<R extends org.snmp4j.agent.mo.MOTableRow>
extends `org.snmp4j.agent.mo.util.MOTableSizeLimit`  

**Constructors:**
- `public LogMOTableSizeLimit(int p0)`
- `public LogMOTableSizeLimit(java.util.Properties p0)`

**Methods:**
- `protected boolean removeEldest(org.snmp4j.agent.mo.MOTableRowEvent p0, int p1)`

---

## public class `org.snmp4j.agent.mo.util.MOTableSizeLimit`<R extends org.snmp4j.agent.mo.MOTableRow>
implements `org.snmp4j.agent.mo.MOTableRowListener<R>`  

**Constructors:**
- `public MOTableSizeLimit(int p0)`
- `public MOTableSizeLimit(java.util.Properties p0)`

**Fields:**
- `public final static java.lang.String PROPERTY_PREFIX`

**Methods:**
- `public java.util.SortedMap getLimits()`
- `public int getMaxNumRows()`
- `protected boolean removeEldest(org.snmp4j.agent.mo.MOTableRowEvent p0, int p1)`
- `public void rowChanged(org.snmp4j.agent.mo.MOTableRowEvent p0)`
- `public void setLimits(java.util.Properties p0)`
- `public void setMaxNumRows(int p0)`

---

## public class `org.snmp4j.agent.mo.util.RowIndexComparator`
implements `java.util.Comparator<org.snmp4j.agent.mo.MOTableRow>`  

**Constructors:**
- `public RowIndexComparator()`

**Methods:**
- `public int compare(org.snmp4j.agent.mo.MOTableRow p0, org.snmp4j.agent.mo.MOTableRow p1)`

---

## public abstract interface `org.snmp4j.agent.mo.util.VariableProvider`

**Methods:**
- `public abstract org.snmp4j.smi.Variable getVariable(java.lang.String p0)`

---

## public abstract class `org.snmp4j.agent.request.AbstractRequest`<U extends org.snmp4j.agent.request.SubRequest<U>, S extends java.lang.Object, R extends java.lang.Object>
implements `org.snmp4j.agent.request.Request<S,R,U>`  

**Constructors:**
- `public AbstractRequest(S p0)`

**Fields:**
- `protected int errorStatus`
- `protected int phase`
- `protected int repeaterRowSize`
- `protected int repeaterStartIndex`
- `protected int reprocessCounter`
- `protected R response`
- `protected S source`
- `protected java.util.List subrequests`
- `protected int transactionID`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public U find(org.snmp4j.smi.OID p0)`
- `public U get(int p0)`
- `public int getErrorIndex()`
- `public int getErrorStatus()`
- `protected abstract int getMaxPhase()`
- `public int getPhase()`
- `public int getReprocessCounter()`
- `public R getResponse()`
- `public S getSource()`
- `public int getTransactionID()`
- `public int hashCode()`
- `public void incReprocessCounter()`
- `protected synchronized void initSubRequests()`
- `public abstract boolean isBulkRequest()`
- `public boolean isComplete()`
- `public int nextPhase()`
- `protected void resetCompletionStatus()`
- `public synchronized void resetProcessedStatus()`
- `public void setErrorStatus(int p0)`
- `public void setPhase(int p0) throws java.util.NoSuchElementException`
- `protected abstract void setupSubRequests()`
- `public java.lang.String toString()`

---

## public abstract interface `org.snmp4j.agent.request.Request`<S extends java.lang.Object, R extends java.lang.Object, U extends org.snmp4j.agent.request.SubRequest<U>>

**Fields:**
- `public final static int PHASE_1PC`
- `public final static int PHASE_2PC_CLEANUP`
- `public final static int PHASE_2PC_COMMIT`
- `public final static int PHASE_2PC_PREPARE`
- `public final static int PHASE_2PC_UNDO`
- `public final static int PHASE_INIT`

**Methods:**
- `public abstract U find(org.snmp4j.smi.OID p0)`
- `public abstract U get(int p0)`
- `public abstract org.snmp4j.smi.OctetString getContext()`
- `public abstract int getErrorIndex()`
- `public abstract int getErrorStatus()`
- `public abstract int getMessageProcessingModel()`
- `public abstract int getPhase()`
- `public abstract java.lang.Object getProcessingUserObject(java.lang.Object p0)`
- `public abstract int getReprocessCounter()`
- `public abstract R getResponse()`
- `public abstract int getSecurityLevel()`
- `public abstract int getSecurityModel()`
- `public abstract org.snmp4j.smi.OctetString getSecurityName()`
- `public abstract S getSource()`
- `public abstract int getTransactionID()`
- `public abstract org.snmp4j.smi.OctetString getViewName()`
- `public abstract int getViewType()`
- `public abstract void incReprocessCounter()`
- `public abstract boolean isComplete()`
- `public abstract boolean isPhaseComplete()`
- `public abstract java.util.Iterator iterator()`
- `public abstract int nextPhase() throws java.util.NoSuchElementException`
- `public abstract void resetProcessedStatus()`
- `public abstract void setErrorStatus(int p0)`
- `public abstract void setPhase(int p0) throws java.util.NoSuchElementException`
- `public abstract java.lang.Object setProcessingUserObject(java.lang.Object p0, java.lang.Object p1)`
- `public abstract void setViewName(org.snmp4j.smi.OctetString p0)`
- `public abstract int size()`

---

## public abstract interface `org.snmp4j.agent.request.RequestFactory`<S extends java.util.EventObject, R extends java.lang.Object, REQ extends org.snmp4j.agent.request.Request<S, R, ? extends org.snmp4j.agent.request.SubRequest>>

**Methods:**
- `public abstract REQ createRequest(S p0, org.snmp4j.agent.mo.snmp.CoexistenceInfo p1)`

---

## public class `org.snmp4j.agent.request.RequestStatus`

**Constructors:**
- `public RequestStatus()`

**Methods:**
- `public synchronized void addRequestStatusListener(org.snmp4j.agent.request.RequestStatusListener p0)`
- `protected void fireRequestStatusChanged(org.snmp4j.agent.request.RequestStatusEvent p0)`
- `public int getErrorStatus()`
- `public boolean isPhaseComplete()`
- `public boolean isProcessed()`
- `public synchronized void removeRequestStatusListener(org.snmp4j.agent.request.RequestStatusListener p0)`
- `public void setErrorStatus(int p0)`
- `public void setPhaseComplete(boolean p0)`
- `public void setProcessed(boolean p0)`
- `public java.lang.String toString()`

---

## public class `org.snmp4j.agent.request.RequestStatusEvent`
extends `java.util.EventObject`  

**Constructors:**
- `public RequestStatusEvent(java.lang.Object p0, org.snmp4j.agent.request.RequestStatus p1)`

**Methods:**
- `public org.snmp4j.agent.request.RequestStatus getStatus()`

---

## public abstract interface `org.snmp4j.agent.request.RequestStatusListener`
implements `java.util.EventListener`  

**Methods:**
- `public abstract void requestStatusChanged(org.snmp4j.agent.request.RequestStatusEvent p0)`

---

## public class `org.snmp4j.agent.request.SnmpRequest`
extends `org.snmp4j.agent.request.AbstractRequest`  
implements `java.io.Serializable`  

**Constructors:**
- `public SnmpRequest(org.snmp4j.CommandResponderEvent p0, org.snmp4j.agent.mo.snmp.CoexistenceInfo p1)`

**Fields:**
- `public final static org.snmp4j.smi.OctetString DEFAULT_CONTEXT`
- `protected static int maxRepetitionsLimit`
- `protected int maxRepetitionsWithLimit`
- `protected java.util.Map processingUserObjects`

**Methods:**
- `protected synchronized void addRepeaterSubRequest()`
- `protected void assignErrorStatus2Response()`
- `public org.snmp4j.agent.mo.snmp.CoexistenceInfo getCoexistenceInfo()`
- `public synchronized int getCompleteRepetitions()`
- `public org.snmp4j.smi.OctetString getContext()`
- `public int getErrorIndex()`
- `protected int getMaxPhase()`
- `public int getMaxRepetitions()`
- `public static int getMaxRepetitionsLimit()`
- `public int getMessageProcessingModel()`
- `public int getNonRepeaters()`
- `public synchronized java.lang.Object getProcessingUserObject(java.lang.Object p0)`
- `public int getRepeaterCount()`
- `public org.snmp4j.PDU getResponse()`
- `public int getSecurityLevel()`
- `public int getSecurityModel()`
- `public org.snmp4j.smi.OctetString getSecurityName()`
- `public int getTransactionID()`
- `public org.snmp4j.smi.OctetString getViewName()`
- `public int getViewType()`
- `public static int getViewType(int p0)`
- `protected boolean is2PC()`
- `public boolean isBulkRequest()`
- `public boolean isPhaseComplete()`
- `public java.util.Iterator iterator()`
- `public static synchronized int nextTransactionID()`
- `public static void setMaxRepetitionsLimit(int p0)`
- `public synchronized java.lang.Object setProcessingUserObject(java.lang.Object p0, java.lang.Object p1)`
- `public void setRequestEvent(org.snmp4j.CommandResponderEvent p0)`
- `public void setViewName(org.snmp4j.smi.OctetString p0)`
- `protected synchronized void setupSubRequests()`
- `public int size()`

---

## public class `org.snmp4j.agent.request.SnmpRequest$SnmpSubRequest`
implements `org.snmp4j.agent.request.RequestStatusListener`, `org.snmp4j.agent.request.SnmpSubRequest<org.snmp4j.agent.request.SnmpRequest$SnmpSubRequest>`  

**Constructors:**
- `protected SnmpSubRequest(org.snmp4j.agent.request.SnmpSubRequest p0, int p1)`
- `protected SnmpSubRequest(org.snmp4j.smi.VariableBinding p0, int p1)`

**Methods:**
- `public void completed()`
- `public final int getErrorStatus()`
- `public int getIndex()`
- `public org.snmp4j.agent.MOServerLookupEvent getLookupEvent()`
- `protected org.snmp4j.agent.MOScope getNextScope(org.snmp4j.smi.OID p0)`
- `public org.snmp4j.agent.MOQuery getQuery()`
- `public org.snmp4j.agent.request.SnmpRequest getRequest()`
- `public org.snmp4j.agent.MOScope getScope()`
- `public org.snmp4j.agent.request.SnmpRequest getSnmpRequest()`
- `public org.snmp4j.agent.request.RequestStatus getStatus()`
- `public org.snmp4j.agent.ManagedObject getTargetMO()`
- `public java.lang.Object getUndoValue()`
- `public java.lang.Object getUserObject()`
- `public org.snmp4j.smi.VariableBinding getVariableBinding()`
- `public boolean hasError()`
- `public boolean isComplete()`
- `public org.snmp4j.agent.request.SubRequestIterator repetitions()`
- `public void requestStatusChanged(org.snmp4j.agent.request.RequestStatusEvent p0)`
- `public void setErrorStatus(int p0)`
- `public void setLookupEvent(org.snmp4j.agent.MOServerLookupEvent p0)`
- `public void setQuery(org.snmp4j.agent.MOQuery p0)`
- `public void setStatus(org.snmp4j.agent.request.RequestStatus p0)`
- `public void setTargetMO(org.snmp4j.agent.ManagedObject p0)`
- `public void setUndoValue(java.lang.Object p0)`
- `public void setUserObject(java.lang.Object p0)`
- `public java.lang.String toString()`
- `public void updateNextRepetition()`

---

## public class `org.snmp4j.agent.request.SnmpRequest$SnmpSubRequestIterator`
implements `org.snmp4j.agent.request.SubRequestIterator<org.snmp4j.agent.request.SnmpRequest$SnmpSubRequest>`  

**Constructors:**
- `protected SnmpSubRequestIterator()`
- `protected SnmpSubRequestIterator(int p0, int p1)`

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public boolean hasNext()`
- `public int hashCode()`
- `public org.snmp4j.agent.request.SnmpRequest$SnmpSubRequest next()`
- `public void remove()`
- `protected void setNoAppending(boolean p0)`

---

## public abstract interface `org.snmp4j.agent.request.SnmpSubRequest`<S extends org.snmp4j.agent.request.SnmpSubRequest<S>>
implements `org.snmp4j.agent.request.SubRequest<S>`  

**Methods:**
- `public abstract org.snmp4j.agent.MOServerLookupEvent getLookupEvent()`
- `public abstract org.snmp4j.agent.request.SnmpRequest getSnmpRequest()`
- `public abstract void setLookupEvent(org.snmp4j.agent.MOServerLookupEvent p0)`
- `public abstract void setStatus(org.snmp4j.agent.request.RequestStatus p0)`

---

## public abstract interface `org.snmp4j.agent.request.SubRequest`<N extends org.snmp4j.agent.request.SubRequest<N>>

**Methods:**
- `public abstract void completed()`
- `public abstract int getErrorStatus()`
- `public abstract int getIndex()`
- `public abstract org.snmp4j.agent.MOQuery getQuery()`
- `public abstract org.snmp4j.agent.request.Request getRequest()`
- `public abstract org.snmp4j.agent.MOScope getScope()`
- `public abstract org.snmp4j.agent.request.RequestStatus getStatus()`
- `public abstract org.snmp4j.agent.ManagedObject getTargetMO()`
- `public abstract java.lang.Object getUndoValue()`
- `public abstract java.lang.Object getUserObject()`
- `public abstract org.snmp4j.smi.VariableBinding getVariableBinding()`
- `public abstract boolean hasError()`
- `public abstract boolean isComplete()`
- `public abstract org.snmp4j.agent.request.SubRequestIterator repetitions()`
- `public abstract void setErrorStatus(int p0)`
- `public abstract void setQuery(org.snmp4j.agent.MOQuery p0)`
- `public abstract void setTargetMO(org.snmp4j.agent.ManagedObject p0)`
- `public abstract void setUndoValue(java.lang.Object p0)`
- `public abstract void setUserObject(java.lang.Object p0)`
- `public abstract void updateNextRepetition()`

---

## public abstract interface `org.snmp4j.agent.request.SubRequestIterator`<S extends java.lang.Object>
implements `java.util.Iterator<S>`  

**Methods:**
- `public abstract boolean hasNext()`
- `public abstract S next() throws java.util.NoSuchElementException`

---

## public class `org.snmp4j.agent.request.SubRequestIteratorSupport`<S extends org.snmp4j.agent.request.SubRequest<? extends java.lang.Object>>
implements `org.snmp4j.agent.request.SubRequestIterator<S>`  

**Constructors:**
- `public SubRequestIteratorSupport(java.util.Iterator p0)`

**Methods:**
- `public boolean hasNext()`
- `protected S mapToSubRequest(java.lang.Object p0)`
- `public S next()`
- `public void remove()`

---

## public class `org.snmp4j.agent.security.BasicVacmConfigurator`
implements `org.snmp4j.agent.security.VacmConfigurator`  

**Constructors:**
- `public BasicVacmConfigurator()`

**Fields:**
- `protected int contextMatch`
- `protected org.snmp4j.smi.OctetString contextPrefix`
- `protected org.snmp4j.smi.OID rootOID`
- `protected org.snmp4j.smi.OctetString rootViewName`
- `protected org.snmp4j.security.SecurityLevel securityLevel`
- `protected org.snmp4j.security.SecurityModel securityModel`

**Methods:**
- `public org.snmp4j.agent.security.VacmConfigurator$VacmConfigResult addUser(org.snmp4j.agent.security.MutableVACM p0, org.snmp4j.smi.OctetString p1, java.lang.String p2)`
- `public java.lang.String[] getSupportedRoles()`
- `protected boolean isRoleSupported(java.lang.String p0)`
- `public org.snmp4j.agent.security.VacmConfigurator$VacmConfigResult removeRole(org.snmp4j.agent.security.MutableVACM p0, java.lang.String p1)`
- `public org.snmp4j.agent.security.VacmConfigurator$VacmConfigResult removeUser(org.snmp4j.agent.security.MutableVACM p0, org.snmp4j.smi.OctetString p1, java.lang.String p2)`

---

## public final static enum `org.snmp4j.agent.security.BasicVacmConfigurator$Roles`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.snmp4j.agent.security.BasicVacmConfigurator$Roles admin`
- `public final static org.snmp4j.agent.security.BasicVacmConfigurator$Roles monitor`

**Methods:**
- `public java.lang.String getRoleName()`

---

## public abstract interface `org.snmp4j.agent.security.MutableVACM`
implements `org.snmp4j.agent.security.VACM`  

**Fields:**
- `public final static int VACM_MATCH_EXACT`
- `public final static int VACM_MATCH_PREFIX`
- `public final static int VACM_VIEW_EXCLUDED`
- `public final static int VACM_VIEW_INCLUDED`

**Methods:**
- `public abstract int accessEntryCount(org.snmp4j.smi.OctetString p0)`
- `public abstract void addAccess(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OctetString p1, int p2, int p3, int p4, org.snmp4j.smi.OctetString p5, org.snmp4j.smi.OctetString p6, org.snmp4j.smi.OctetString p7, int p8)`
- `public abstract void addGroup(int p0, org.snmp4j.smi.OctetString p1, org.snmp4j.smi.OctetString p2, int p3)`
- `public abstract void addViewTreeFamily(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OID p1, org.snmp4j.smi.OctetString p2, int p3, int p4)`
- `public abstract boolean hasSecurityToGroupMapping(int p0, org.snmp4j.smi.OctetString p1)`
- `public abstract boolean removeAccess(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OctetString p1, int p2, int p3)`
- `public abstract boolean removeGroup(int p0, org.snmp4j.smi.OctetString p1)`
- `public abstract boolean removeViewTreeFamily(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OID p1)`
- `public abstract int viewTreeFamilyEntryCount(org.snmp4j.smi.OctetString p0)`

---

## public abstract interface `org.snmp4j.agent.security.VACM`

**Fields:**
- `public final static int VACM_NOT_IN_VIEW`
- `public final static int VACM_NO_ACCESS_ENTRY`
- `public final static int VACM_NO_GROUP_NAME`
- `public final static int VACM_NO_SUCH_CONTEXT`
- `public final static int VACM_NO_SUCH_VIEW`
- `public final static int VACM_OK`
- `public final static int VACM_OTHER_ERROR`
- `public final static int VIEW_NOTIFY`
- `public final static int VIEW_READ`
- `public final static int VIEW_WRITE`

**Methods:**
- `public abstract org.snmp4j.smi.OctetString getViewName(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OctetString p1, int p2, int p3, int p4)`
- `public abstract int isAccessAllowed(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OID p1)`
- `public abstract int isAccessAllowed(org.snmp4j.smi.OctetString p0, org.snmp4j.smi.OctetString p1, int p2, int p3, int p4, org.snmp4j.smi.OID p5)`

---

## public abstract interface `org.snmp4j.agent.security.VacmConfigurator`

**Methods:**
- `public abstract org.snmp4j.agent.security.VacmConfigurator$VacmConfigResult addUser(org.snmp4j.agent.security.MutableVACM p0, org.snmp4j.smi.OctetString p1, java.lang.String p2)`
- `public abstract java.lang.String[] getSupportedRoles()`
- `public abstract org.snmp4j.agent.security.VacmConfigurator$VacmConfigResult removeRole(org.snmp4j.agent.security.MutableVACM p0, java.lang.String p1)`
- `public abstract org.snmp4j.agent.security.VacmConfigurator$VacmConfigResult removeUser(org.snmp4j.agent.security.MutableVACM p0, org.snmp4j.smi.OctetString p1, java.lang.String p2)`

---

## public final static enum `org.snmp4j.agent.security.VacmConfigurator$VacmConfigResult`
extends `java.lang.Enum`  

**Fields:**
- `public final static org.snmp4j.agent.security.VacmConfigurator$VacmConfigResult groupExists`
- `public final static org.snmp4j.agent.security.VacmConfigurator$VacmConfigResult roleDoesNotExist`
- `public final static org.snmp4j.agent.security.VacmConfigurator$VacmConfigResult roleNotSupported`
- `public final static org.snmp4j.agent.security.VacmConfigurator$VacmConfigResult roleRemoved`
- `public final static org.snmp4j.agent.security.VacmConfigurator$VacmConfigResult unknownError`
- `public final static org.snmp4j.agent.security.VacmConfigurator$VacmConfigResult userAddedToRole`
- `public final static org.snmp4j.agent.security.VacmConfigurator$VacmConfigResult userAndRoleAdded`
- `public final static org.snmp4j.agent.security.VacmConfigurator$VacmConfigResult userDoesNotExist`
- `public final static org.snmp4j.agent.security.VacmConfigurator$VacmConfigResult userExists`
- `public final static org.snmp4j.agent.security.VacmConfigurator$VacmConfigResult userRemovedFromRole`
- `public final static org.snmp4j.agent.security.VacmConfigurator$VacmConfigResult viewExists`

---

## public class `org.snmp4j.agent.util.IndexGenerator`

**Constructors:**
- `public IndexGenerator(org.snmp4j.smi.Variable p0)`
- `public IndexGenerator(org.snmp4j.smi.Variable p0, boolean p1)`

**Methods:**
- `public synchronized org.snmp4j.smi.OID getNextSubIndex()`

---

## public class `org.snmp4j.agent.util.MOScopePriorityComparator`
extends `org.snmp4j.agent.MOScopeComparator`  

**Constructors:**
- `public MOScopePriorityComparator(java.util.SortedMap p0)`

**Methods:**
- `public int compare(org.snmp4j.agent.MOScope p0, org.snmp4j.agent.MOScope p1)`

---

## public class `org.snmp4j.agent.util.OIDScope`
implements `org.snmp4j.agent.MOScope`  

**Constructors:**
- `public OIDScope(org.snmp4j.smi.OID p0)`

**Methods:**
- `public boolean covers(org.snmp4j.smi.OID p0)`
- `public org.snmp4j.smi.OID getLowerBound()`
- `public org.snmp4j.smi.OID getUpperBound()`
- `public boolean isCovered(org.snmp4j.agent.MOScope p0)`
- `public boolean isLowerIncluded()`
- `public boolean isOverlapping(org.snmp4j.agent.MOScope p0)`
- `public boolean isUpperIncluded()`

---

## public abstract interface `org.snmp4j.agent.util.OIDTranslation`

**Methods:**
- `public abstract org.snmp4j.smi.OID backwardTranslate(org.snmp4j.smi.OID p0)`
- `public abstract org.snmp4j.smi.OID forwardTranslate(org.snmp4j.smi.OID p0)`

---

## public class `org.snmp4j.agent.util.TemporaryList`<T extends java.lang.Object>

**Constructors:**
- `public TemporaryList()`
- `public TemporaryList(int p0)`

**Fields:**
- `public final static int DEFAULT_ITEM_TIMEOUT`

**Methods:**
- `public synchronized void add(T p0)`
- `public synchronized void clear()`
- `public synchronized boolean contains(T p0)`
- `public int getTimeout()`
- `public java.util.Iterator iterator()`
- `public synchronized boolean remove(T p0)`
- `public void setTimeout(int p0)`
- `public int size()`

---

## public class `org.snmp4j.agent.version.VersionInfo`

**Fields:**
- `public final static int DEPENDENCY_SNMP4J_MAJOR`
- `public final static int DEPENDENCY_SNMP4J_MINOR`
- `public final static java.lang.String DEPENDENCY_SNMP4J_PATCH`
- `public final static int DEPENDENCY_SNMP4J_UPDATE`
- `public final static int MAJOR`
- `public final static int MINOR`
- `public final static java.lang.String PATCH`
- `public final static int UPDATE`
- `public final static java.lang.String VERSION`

**Methods:**
- `public static boolean checkMinVersionOfDependencies()`
- `public static java.lang.String getVersion()`

---

