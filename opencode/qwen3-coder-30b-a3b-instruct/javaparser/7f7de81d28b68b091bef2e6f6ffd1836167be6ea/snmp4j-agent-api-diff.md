# Breaking Changes: org.snmp4j:snmp4j-agent 3.0.3 → 3.6.6
Total: 818 (binary-breaking: 98, source-breaking: 802)

## org.snmp4j.agent.AgentConfigManager

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.snmp4j.agent.AgentConfigManager.<init>(org.snmp4j.smi.OctetString,org.snmp4j.MessageDispatcher,org.snmp4j.agent.security.VACM,org.snmp4j.agent.MOServer[],org.snmp4j.util.WorkerPool,org.snmp4j.agent.io.MOInputFactory,org.snmp4j.agent.io.MOPersistenceProvider,org.snmp4j.agent.cfg.EngineBootsProvider)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.snmp4j.agent.AgentConfigManager.<init>(org.snmp4j.smi.OctetString,org.snmp4j.MessageDispatcher,org.snmp4j.agent.security.VACM,org.snmp4j.agent.MOServer[],org.snmp4j.util.WorkerPool,org.snmp4j.agent.io.MOInputFactory,org.snmp4j.agent.io.MOPersistenceProvider,org.snmp4j.agent.cfg.EngineBootsProvider,org.snmp4j.agent.mo.MOFactory)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.snmp4j.agent.AgentConfigManager.<init>(org.snmp4j.smi.OctetString,org.snmp4j.MessageDispatcher,org.snmp4j.agent.security.VACM,org.snmp4j.agent.MOServer[],org.snmp4j.util.WorkerPool,org.snmp4j.agent.io.MOInputFactory,org.snmp4j.agent.io.MOPersistenceProvider,org.snmp4j.agent.cfg.EngineBootsProvider,org.snmp4j.agent.mo.MOFactory,java.util.Collection<org.snmp4j.agent.mo.snmp.dh.DHKickstartParameters>)`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.snmp4j.agent.AgentConfigManager.engineBootsProvider`
+ NEW FIELD: `org.snmp4j.agent.AgentConfigManager.engineBootsProvider`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.snmp4j.agent.AgentConfigManager.engineBootsProvider`
+ NEW FIELD: `org.snmp4j.agent.AgentConfigManager.engineBootsProvider`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.AgentConfigManager.addAgentStateListener(org.snmp4j.agent.AgentStateListener)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.AgentConfigManager.launchTransportMappings(java.util.Collection<? extends org.snmp4j.TransportMapping>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.AgentConfigManager.removeAgentStateListener(org.snmp4j.agent.AgentStateListener)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.AgentConfigManager.stopTransportMappings(java.util.Collection<? extends org.snmp4j.TransportMapping>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.snmp4j.agent.AgentConfigManager.initSecurityModels(org.snmp4j.agent.cfg.EngineBootsProvider)`

## org.snmp4j.agent.BaseAgent

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.snmp4j.agent.BaseAgent.bootCounterFile`
+ NEW FIELD: `org.snmp4j.agent.BaseAgent.bootCounterFile`

### FIELD_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD FIELD (type erasure changed): `org.snmp4j.agent.BaseAgent.bootCounterFile`
+ NEW FIELD: `org.snmp4j.agent.BaseAgent.bootCounterFile`

## org.snmp4j.agent.CommandProcessor

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.snmp4j.agent.CommandProcessor.requestFactory`
+ NEW FIELD: `org.snmp4j.agent.CommandProcessor.requestFactory`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.snmp4j.agent.CommandProcessor.requestList`
+ NEW FIELD: `org.snmp4j.agent.CommandProcessor.requestList`

### FORMAL_TYPE_PARAMETER_CHANGED [binary ✓ | source ✗]
- FORMAL TYPE PARAMETER CHANGED: `org.snmp4j.agent.CommandProcessor.processRequest(org.snmp4j.agent.MOServer,org.snmp4j.agent.RequestHandler<R>,R)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.CommandProcessor.dispatchCommand(org.snmp4j.CommandResponderEvent,org.snmp4j.agent.mo.snmp.CoexistenceInfo)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.CommandProcessor.finalizeRequest(org.snmp4j.CommandResponderEvent,org.snmp4j.agent.request.SnmpRequest,org.snmp4j.agent.MOServer)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.CommandProcessor.getViewName(org.snmp4j.CommandResponderEvent,org.snmp4j.agent.mo.snmp.CoexistenceInfo,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.CommandProcessor.processNextSubRequest(org.snmp4j.agent.request.SnmpRequest,org.snmp4j.agent.MOServer,org.snmp4j.smi.OctetString,org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.CommandProcessor.processPdu(org.snmp4j.CommandResponderEvent)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.CommandProcessor.processRequest(org.snmp4j.CommandResponderEvent,org.snmp4j.agent.mo.snmp.CoexistenceInfo,org.snmp4j.agent.RequestHandler<org.snmp4j.agent.request.SnmpRequest>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.CommandProcessor.removePduHandler(org.snmp4j.agent.RequestHandler)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.CommandProcessor.sendResponse(org.snmp4j.CommandResponderEvent,org.snmp4j.PDU)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.CommandProcessor.setAuthorizationError(org.snmp4j.agent.request.Request,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.CommandProcessor.unlockManagedObjectIfLockedByLookup(org.snmp4j.agent.MOServer,org.snmp4j.agent.ManagedObject,org.snmp4j.agent.mo.lock.LockRequest)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.CommandProcessor.addMOServer(org.snmp4j.agent.MOServer)`
+ NEW RETURN TYPE: `org.snmp4j.agent.CommandProcessor.addMOServer(org.snmp4j.agent.MOServer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.CommandProcessor.getRequestList()`
+ NEW RETURN TYPE: `org.snmp4j.agent.CommandProcessor.getRequestList()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.CommandProcessor.removeMOServer(org.snmp4j.agent.MOServer)`
+ NEW RETURN TYPE: `org.snmp4j.agent.CommandProcessor.removeMOServer(org.snmp4j.agent.MOServer)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.snmp4j.agent.CommandProcessor.addMOServer(org.snmp4j.agent.MOServer)`
+ NEW RETURN TYPE: `org.snmp4j.agent.CommandProcessor.addMOServer(org.snmp4j.agent.MOServer)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.snmp4j.agent.CommandProcessor.removeMOServer(org.snmp4j.agent.MOServer)`
+ NEW RETURN TYPE: `org.snmp4j.agent.CommandProcessor.removeMOServer(org.snmp4j.agent.MOServer)`

## org.snmp4j.agent.DefaultMOContextScope

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.snmp4j.agent.DefaultMOScope.substractScope(org.snmp4j.agent.MOScope)`

## org.snmp4j.agent.DefaultMOQuery

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.DefaultMOQuery.matchesQuery(org.snmp4j.agent.ManagedObject)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.snmp4j.agent.DefaultMOQuery.substractScope(org.snmp4j.agent.MOScope)`

## org.snmp4j.agent.DefaultMOScope

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.snmp4j.agent.DefaultMOScope.substractScope(org.snmp4j.agent.MOScope)`

## org.snmp4j.agent.DefaultMOServer

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.DefaultMOServer.addLookupListener(org.snmp4j.agent.MOServerLookupListener,org.snmp4j.agent.ManagedObject)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.DefaultMOServer.checkForUpdate(org.snmp4j.agent.UpdatableManagedObject,org.snmp4j.agent.MOQuery)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.DefaultMOServer.fireLookupEvent(org.snmp4j.agent.ManagedObject,org.snmp4j.agent.MOServerLookupEvent)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.DefaultMOServer.fireQueryEvent(org.snmp4j.agent.ManagedObject,org.snmp4j.agent.MOServerLookupEvent)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.DefaultMOServer.getRegisteredContexts(org.snmp4j.agent.ManagedObject)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.DefaultMOServer.lock(java.lang.Object,org.snmp4j.agent.ManagedObject)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.DefaultMOServer.lock(java.lang.Object,org.snmp4j.agent.ManagedObject,long)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.DefaultMOServer.register(org.snmp4j.agent.ManagedObject,org.snmp4j.smi.OctetString)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.DefaultMOServer.removeLookupListener(org.snmp4j.agent.MOServerLookupListener,org.snmp4j.agent.ManagedObject)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.DefaultMOServer.unlock(java.lang.Object,org.snmp4j.agent.ManagedObject)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.DefaultMOServer.unregister(org.snmp4j.agent.ManagedObject,org.snmp4j.smi.OctetString)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.MOServer.registerNew(org.snmp4j.agent.ManagedObject,org.snmp4j.smi.OctetString)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.DefaultMOServer.getManagedObject(org.snmp4j.smi.OID,org.snmp4j.smi.OctetString)`
+ NEW RETURN TYPE: `org.snmp4j.agent.DefaultMOServer.getManagedObject(org.snmp4j.smi.OID,org.snmp4j.smi.OctetString)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.DefaultMOServer.getManagedObject(org.snmp4j.smi.OID,org.snmp4j.smi.OctetString,boolean)`
+ NEW RETURN TYPE: `org.snmp4j.agent.DefaultMOServer.getManagedObject(org.snmp4j.smi.OID,org.snmp4j.smi.OctetString,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.DefaultMOServer.getRegistry()`
+ NEW RETURN TYPE: `org.snmp4j.agent.DefaultMOServer.getRegistry()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.DefaultMOServer.iterator()`
+ NEW RETURN TYPE: `org.snmp4j.agent.DefaultMOServer.iterator()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.DefaultMOServer.lookup(org.snmp4j.agent.MOQuery,org.snmp4j.agent.mo.lock.LockRequest,org.snmp4j.agent.MOServerLookupEvent)`
+ NEW RETURN TYPE: `org.snmp4j.agent.MOServer.lookup(org.snmp4j.agent.MOQuery,org.snmp4j.agent.mo.lock.LockRequest,org.snmp4j.agent.MOServerLookupEvent)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.DefaultMOServer.unregister(org.snmp4j.agent.ManagedObject,org.snmp4j.smi.OctetString)`
+ NEW RETURN TYPE: `org.snmp4j.agent.DefaultMOServer.unregister(org.snmp4j.agent.ManagedObject<? extends java.lang.Object>,org.snmp4j.smi.OctetString)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.MOServer.lookup(org.snmp4j.agent.MOQuery,org.snmp4j.agent.mo.lock.LockRequest)`
+ NEW RETURN TYPE: `org.snmp4j.agent.MOServer.lookup(org.snmp4j.agent.MOQuery,org.snmp4j.agent.mo.lock.LockRequest)`

## org.snmp4j.agent.MOQuery

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.MOQuery.matchesQuery(org.snmp4j.agent.ManagedObject)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.snmp4j.agent.MOQuery.substractScope(org.snmp4j.agent.MOScope)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.MOQuery`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.MOQuery.subtractScope(org.snmp4j.agent.MOScope)`

## org.snmp4j.agent.MOQueryWithSource

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.DefaultMOQuery.matchesQuery(org.snmp4j.agent.ManagedObject)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.snmp4j.agent.DefaultMOQuery.substractScope(org.snmp4j.agent.MOScope)`

## org.snmp4j.agent.MOServer

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.MOServer.addLookupListener(org.snmp4j.agent.MOServerLookupListener,org.snmp4j.agent.ManagedObject)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.MOServer.getRegisteredContexts(org.snmp4j.agent.ManagedObject)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.MOServer.lock(java.lang.Object,org.snmp4j.agent.ManagedObject)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.MOServer.lock(java.lang.Object,org.snmp4j.agent.ManagedObject,long)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.MOServer.register(org.snmp4j.agent.ManagedObject,org.snmp4j.smi.OctetString)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.MOServer.registerNew(org.snmp4j.agent.ManagedObject,org.snmp4j.smi.OctetString)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.MOServer.removeLookupListener(org.snmp4j.agent.MOServerLookupListener,org.snmp4j.agent.ManagedObject)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.MOServer.unlock(java.lang.Object,org.snmp4j.agent.ManagedObject)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.MOServer.unregister(org.snmp4j.agent.ManagedObject,org.snmp4j.smi.OctetString)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.MOServer.iterator()`
+ NEW RETURN TYPE: `org.snmp4j.agent.MOServer.iterator()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.MOServer.lookup(org.snmp4j.agent.MOQuery)`
+ NEW RETURN TYPE: `org.snmp4j.agent.MOServer.lookup(org.snmp4j.agent.MOQuery)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.MOServer.lookup(org.snmp4j.agent.MOQuery,org.snmp4j.agent.mo.lock.LockRequest)`
+ NEW RETURN TYPE: `org.snmp4j.agent.MOServer.lookup(org.snmp4j.agent.MOQuery,org.snmp4j.agent.mo.lock.LockRequest)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.MOServer.lookup(org.snmp4j.agent.MOQuery,org.snmp4j.agent.mo.lock.LockRequest,org.snmp4j.agent.MOServerLookupEvent)`
+ NEW RETURN TYPE: `org.snmp4j.agent.MOServer.lookup(org.snmp4j.agent.MOQuery,org.snmp4j.agent.mo.lock.LockRequest,org.snmp4j.agent.MOServerLookupEvent)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.MOServer.unregister(org.snmp4j.agent.ManagedObject,org.snmp4j.smi.OctetString)`
+ NEW RETURN TYPE: `org.snmp4j.agent.MOServer.unregister(org.snmp4j.agent.ManagedObject<? extends java.lang.Object>,org.snmp4j.smi.OctetString)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.MOServer`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.MOServer.lookup(org.snmp4j.agent.MOQuery,org.snmp4j.agent.mo.lock.LockRequest,org.snmp4j.agent.MOServerLookupEvent,java.lang.Class<MO>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.MOServer`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.MOServer.getRegisteredScopes(org.snmp4j.agent.ManagedObject<? extends java.lang.Object>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.MOServer`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.MOServer.iterator(java.util.Comparator<org.snmp4j.agent.MOScope>,org.snmp4j.agent.mo.MOFilter)`

## org.snmp4j.agent.MOServerLookupEvent

### FORMAL_TYPE_PARAMETER_REMOVED [binary ✓ | source ✗]
- FORMAL TYPE PARAMETER REMOVED: `org.snmp4j.agent.MOServerLookupEvent`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.MOServerLookupEvent.<init>(java.lang.Object,org.snmp4j.agent.ManagedObject,org.snmp4j.agent.MOQuery,org.snmp4j.agent.MOServerLookupEvent$IntendedUse)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.MOServerLookupEvent.<init>(java.lang.Object,org.snmp4j.agent.ManagedObject,org.snmp4j.agent.MOQuery,org.snmp4j.agent.MOServerLookupEvent$IntendedUse,boolean)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.MOServerLookupEvent.addCompletionListener(org.snmp4j.agent.MOServerLookupListener<R>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.MOServerLookupEvent.removeCompletionListener(org.snmp4j.agent.MOServerLookupListener<R>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.MOServerLookupEvent.setLookupResult(org.snmp4j.agent.ManagedObject)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.MOServerLookupEvent.getLookupResult()`
+ NEW RETURN TYPE: `org.snmp4j.agent.MOServerLookupEvent.getLookupResult()`

## org.snmp4j.agent.MOServerLookupListener

### FORMAL_TYPE_PARAMETER_REMOVED [binary ✓ | source ✗]
- FORMAL TYPE PARAMETER REMOVED: `org.snmp4j.agent.MOServerLookupListener`

## org.snmp4j.agent.ManagedObject

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.ManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.next(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.ManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.commit(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.ManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.get(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.ManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.cleanup(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.ManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.undo(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.ManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.prepare(SR)`

## org.snmp4j.agent.ManagedObjectValueAccess

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.ManagedObjectValueAccess`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.cleanup(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.ManagedObjectValueAccess`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.commit(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.ManagedObjectValueAccess`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.get(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.ManagedObjectValueAccess`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.undo(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.ManagedObjectValueAccess`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.prepare(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.ManagedObjectValueAccess`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.next(SR)`

## org.snmp4j.agent.MutableMOScope

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.snmp4j.agent.MutableMOScope.substractScope(org.snmp4j.agent.MOScope)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.MutableMOScope`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.MutableMOScope.subtractScope(org.snmp4j.agent.MOScope)`

## org.snmp4j.agent.NotificationTask

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.NotificationTask.getResponses()`
+ NEW RETURN TYPE: `org.snmp4j.agent.NotificationTask.getResponses()`

## org.snmp4j.agent.ProxyForwardRequest

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.ProxyForwardRequest.<init>(org.snmp4j.CommandResponderEvent,org.snmp4j.agent.mo.snmp.CoexistenceInfo)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.ProxyForwardRequest.getCommandEvent()`
+ NEW RETURN TYPE: `org.snmp4j.agent.ProxyForwardRequest.getCommandEvent()`

## org.snmp4j.agent.ProxyForwarder

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.ProxyForwarder.forward(org.snmp4j.agent.ProxyForwardRequest)`

## org.snmp4j.agent.RandomAccessManagedObject

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.RandomAccessManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.commit(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.RandomAccessManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.undo(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.RandomAccessManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.cleanup(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.RandomAccessManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.next(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.RandomAccessManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.prepare(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.RandomAccessManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.get(SR)`

## org.snmp4j.agent.RegisteredManagedObject

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.RegisteredManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.prepare(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.RegisteredManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.next(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.RegisteredManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.undo(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.RegisteredManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.cleanup(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.RegisteredManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.commit(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.RegisteredManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.get(SR)`

## org.snmp4j.agent.RequestHandler

### FORMAL_TYPE_PARAMETER_CHANGED [binary ✓ | source ✗]
- FORMAL TYPE PARAMETER CHANGED: `org.snmp4j.agent.RequestHandler`

## org.snmp4j.agent.SerializableManagedObject

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.SerializableManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.get(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.SerializableManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.commit(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.SerializableManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.cleanup(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.SerializableManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.undo(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.SerializableManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.prepare(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.SerializableManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.next(SR)`

## org.snmp4j.agent.UpdatableManagedObject

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.UpdatableManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.get(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.UpdatableManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.commit(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.UpdatableManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.undo(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.UpdatableManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.cleanup(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.UpdatableManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.next(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.UpdatableManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.prepare(SR)`

## org.snmp4j.agent.UpdateStrategy

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.UpdateStrategy.isUpdateNeeded(org.snmp4j.agent.MOServer,org.snmp4j.agent.UpdatableManagedObject,org.snmp4j.agent.MOQuery)`

## org.snmp4j.agent.cfg.EngineBootsCounterFile

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.snmp4j.agent.cfg.EngineBootsCounterFile`

## org.snmp4j.agent.cfg.EngineBootsProvider

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.snmp4j.agent.cfg.EngineBootsProvider`

## org.snmp4j.agent.cfg.EngineIdProvider

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.snmp4j.agent.cfg.EngineIdProvider`

## org.snmp4j.agent.io.MOPersistenceProvider

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.io.MOPersistenceProvider`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.io.MOPersistenceProvider.store(java.lang.String,org.snmp4j.agent.mo.MOPriorityProvider)`

## org.snmp4j.agent.mo.ChangeableManagedObject

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.mo.ChangeableManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.get(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.mo.ChangeableManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.commit(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.mo.ChangeableManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.next(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.mo.ChangeableManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.prepare(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.mo.ChangeableManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.undo(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.mo.ChangeableManagedObject`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.cleanup(SR)`

## org.snmp4j.agent.mo.DefaultMOFactory

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOFactory.addTextualConvention(org.snmp4j.agent.mo.snmp.tc.TextualConvention)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOFactory.removeTextualConvention(org.snmp4j.agent.mo.snmp.tc.TextualConvention)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.DefaultMOFactory.getTextualConventions()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.DefaultMOFactory.getTextualConventions()`

## org.snmp4j.agent.mo.DefaultMOMutableRow2PC

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.DefaultMOTableRow.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanup(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanupRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commitRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepareRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undo(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undoRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

## org.snmp4j.agent.mo.DefaultMOTable

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.snmp4j.agent.mo.DefaultMOTable.newRows`
+ NEW FIELD: `org.snmp4j.agent.mo.DefaultMOTable.newRows`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.snmp4j.agent.mo.DefaultMOTable.pendingChanges`
+ NEW FIELD: `org.snmp4j.agent.mo.DefaultMOTable.pendingChanges`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.addPendingChanges(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,boolean)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.cleanup(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.commit(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.findCell(org.snmp4j.agent.MOScope,org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.get(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.getChangesFromRequest(org.snmp4j.smi.OID,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.request.SubRequest,org.snmp4j.smi.Variable[],boolean,boolean)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.getNewRows(org.snmp4j.agent.request.Request)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.getPendingChangeSet(org.snmp4j.agent.request.SubRequest,org.snmp4j.smi.OID)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.getRowPreview(org.snmp4j.agent.request.Request,org.snmp4j.smi.OID)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.getValue(org.snmp4j.agent.mo.MOTableRow,int,org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.getValue(org.snmp4j.smi.OID,int,org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.hasNewRows(org.snmp4j.agent.request.Request)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.isChangeSetComplete(org.snmp4j.agent.request.SubRequest,org.snmp4j.smi.OID,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.next(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.prepare(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.undo(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.update(org.snmp4j.agent.MOScope,org.snmp4j.agent.request.SubRequest)`

## org.snmp4j.agent.mo.DefaultMOTableRow

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.DefaultMOTableRow.compareTo(java.lang.Object)`

## org.snmp4j.agent.mo.LinkedMOFactory

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOFactory.addTextualConvention(org.snmp4j.agent.mo.snmp.tc.TextualConvention)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOFactory.removeTextualConvention(org.snmp4j.agent.mo.snmp.tc.TextualConvention)`

## org.snmp4j.agent.mo.MOChangeEvent

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOChangeEvent.<init>(java.lang.Object,org.snmp4j.agent.ManagedObject,org.snmp4j.smi.OID,org.snmp4j.agent.mo.MOChangeEvent$Modification)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOChangeEvent.<init>(java.lang.Object,org.snmp4j.agent.ManagedObject,org.snmp4j.smi.OID,org.snmp4j.smi.Variable,org.snmp4j.smi.Variable)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOChangeEvent.<init>(java.lang.Object,org.snmp4j.agent.ManagedObject,org.snmp4j.smi.OID,org.snmp4j.smi.Variable,org.snmp4j.smi.Variable,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.MOChangeEvent.getChangedObject()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.MOChangeEvent.getChangedObject()`

## org.snmp4j.agent.mo.MOColumn

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.MOColumn.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.get(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.getValue(org.snmp4j.agent.mo.MOTableRow,int,org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.isVolatile(org.snmp4j.agent.mo.MOTableRow<V>,int)`

## org.snmp4j.agent.mo.MOFactory

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOFactory.addTextualConvention(org.snmp4j.agent.mo.snmp.tc.TextualConvention)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOFactory.removeTextualConvention(org.snmp4j.agent.mo.snmp.tc.TextualConvention)`

## org.snmp4j.agent.mo.MOFactoryAdapter

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOFactoryAdapter.addTextualConvention(org.snmp4j.agent.mo.snmp.tc.TextualConvention)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOFactoryAdapter.removeTextualConvention(org.snmp4j.agent.mo.snmp.tc.TextualConvention)`

## org.snmp4j.agent.mo.MOFilter

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOFilter.passesFilter(org.snmp4j.agent.ManagedObject)`

## org.snmp4j.agent.mo.MOGroupImpl

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOGroupImpl.addInstance(org.snmp4j.agent.ManagedObject)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOGroupImpl.removeInstance(org.snmp4j.agent.ManagedObject)`

## org.snmp4j.agent.mo.MOMutableColumn

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.MOColumn.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.get(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.getValue(org.snmp4j.agent.mo.MOTableRow,int,org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.isVolatile(org.snmp4j.agent.mo.MOTableRow<V>,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.cleanup(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.undo(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.validateSetRequest(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`

## org.snmp4j.agent.mo.MOMutableRow2PC

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.MOTableRow.getValue(int)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.MOTableRow.getValue(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.mo.MOMutableRow2PC`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.mo.MOMutableRow2PC.commitRow(SR,org.snmp4j.agent.mo.MOTableRow)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.mo.MOMutableRow2PC`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.mo.MOMutableRow2PC.commit(SR,org.snmp4j.agent.mo.MOTableRow,int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.mo.MOMutableRow2PC`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.mo.MOMutableRow2PC.undo(SR,int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.mo.MOMutableRow2PC`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.mo.MOMutableRow2PC.prepareRow(SR,org.snmp4j.agent.mo.MOTableRow)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.mo.MOMutableRow2PC`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.mo.MOMutableRow2PC.undoRow(SR,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.mo.MOMutableRow2PC`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.mo.MOMutableRow2PC.prepare(SR,org.snmp4j.agent.mo.MOTableRow,int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.mo.MOMutableRow2PC`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.mo.MOMutableRow2PC.cleanupRow(SR,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.mo.MOMutableRow2PC`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.mo.MOMutableRow2PC.cleanup(SR,int)`

## org.snmp4j.agent.mo.MOMutableTableRow

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.MOTableRow.getValue(int)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.MOTableRow.getValue(int)`

## org.snmp4j.agent.mo.MOScalar

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.checkRequestScope(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.cleanup(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.commit(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.get(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.isValueOK(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.next(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.prepare(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.undo(org.snmp4j.agent.request.SubRequest)`

## org.snmp4j.agent.mo.MOTable

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.mo.MOTable`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.undo(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.mo.MOTable`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.get(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.mo.MOTable`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.commit(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.mo.MOTable`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.prepare(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.mo.MOTable`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.next(SR)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `org.snmp4j.agent.mo.MOTable`
+ MUST NOW IMPLEMENT: `org.snmp4j.agent.ManagedObject.cleanup(SR)`

## org.snmp4j.agent.mo.MOTableRow

### FORMAL_TYPE_PARAMETER_REMOVED [binary ✓ | source ✗]
- FORMAL TYPE PARAMETER REMOVED: `org.snmp4j.agent.mo.MOTableRow`

## org.snmp4j.agent.mo.RowModificationControlColumn

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.RowModificationControlColumn.prepareRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOMutableTableRow,org.snmp4j.agent.mo.MOTableRow)`

## org.snmp4j.agent.mo.ext.AgentppSimulationMib$AgentppSimDeleteRow

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.cleanup(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.commit(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.get(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.next(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.prepare(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.undo(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.ext.AgentppSimulationMib$AgentppSimDeleteRow.isValueOK(org.snmp4j.agent.request.SubRequest)`

## org.snmp4j.agent.mo.ext.AgentppSimulationMib$AgentppSimDeleteTableContents

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.cleanup(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.commit(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.get(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.next(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.prepare(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.undo(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.ext.AgentppSimulationMib$AgentppSimDeleteTableContents.isValueOK(org.snmp4j.agent.request.SubRequest)`

## org.snmp4j.agent.mo.ext.AgentppSimulationMib$AgentppSimMode

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.cleanup(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.commit(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.get(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.next(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.prepare(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.undo(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.EnumeratedScalar.isValueOK(org.snmp4j.agent.request.SubRequest)`

## org.snmp4j.agent.mo.ext.SimMOFactory

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOFactory.addTextualConvention(org.snmp4j.agent.mo.snmp.tc.TextualConvention)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOFactory.removeTextualConvention(org.snmp4j.agent.mo.snmp.tc.TextualConvention)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.DefaultMOFactory.getTextualConventions()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.DefaultMOFactory.getTextualConventions()`

## org.snmp4j.agent.mo.ext.StaticMOGroup

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.ext.StaticMOGroup.cleanup(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.ext.StaticMOGroup.commit(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.ext.StaticMOGroup.get(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.ext.StaticMOGroup.next(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.ext.StaticMOGroup.prepare(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.ext.StaticMOGroup.undo(org.snmp4j.agent.request.SubRequest)`

## org.snmp4j.agent.mo.lock.DefaultMOLockStrategy

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.lock.DefaultMOLockStrategy.isLockNeeded(org.snmp4j.agent.ManagedObject,org.snmp4j.agent.MOQuery)`

## org.snmp4j.agent.mo.lock.MOLockStrategy

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.lock.MOLockStrategy.isLockNeeded(org.snmp4j.agent.ManagedObject,org.snmp4j.agent.MOQuery)`

## org.snmp4j.agent.mo.snmp.AutonomousType

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.MOColumn.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.get(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.getValue(org.snmp4j.agent.mo.MOTableRow,int,org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.isVolatile(org.snmp4j.agent.mo.MOTableRow<V>,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.cleanup(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.undo(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.validateSetRequest(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`

## org.snmp4j.agent.mo.snmp.CoexistenceInfo

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.snmp.CoexistenceInfo.compareTo(java.lang.Object)`

## org.snmp4j.agent.mo.snmp.DateAndTime

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.MOColumn.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.get(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.getValue(org.snmp4j.agent.mo.MOTableRow,int,org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.isVolatile(org.snmp4j.agent.mo.MOTableRow<V>,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.cleanup(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.undo(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.validateSetRequest(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`

## org.snmp4j.agent.mo.snmp.DateAndTimeScalar

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.checkRequestScope(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.cleanup(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.commit(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.get(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.next(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.prepare(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.undo(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.DateAndTimeScalar.isValueOK(org.snmp4j.agent.request.SubRequest)`

## org.snmp4j.agent.mo.snmp.DisplayString

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `org.snmp4j.agent.mo.snmp.DisplayString.MIB_SIZE`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.MOColumn.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.get(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.getValue(org.snmp4j.agent.mo.MOTableRow,int,org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.isVolatile(org.snmp4j.agent.mo.MOTableRow<V>,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.cleanup(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.undo(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.validateSetRequest(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`

## org.snmp4j.agent.mo.snmp.DisplayStringScalar

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.checkRequestScope(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.cleanup(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.commit(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.get(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.isValueOK(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.next(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.prepare(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.undo(org.snmp4j.agent.request.SubRequest)`

## org.snmp4j.agent.mo.snmp.Enumerated

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.MOColumn.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.get(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.getValue(org.snmp4j.agent.mo.MOTableRow,int,org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.isVolatile(org.snmp4j.agent.mo.MOTableRow<V>,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.cleanup(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.undo(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.validateSetRequest(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`

## org.snmp4j.agent.mo.snmp.EnumeratedScalar

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.checkRequestScope(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.cleanup(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.commit(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.get(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.next(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.prepare(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.undo(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.EnumeratedScalar.isValueOK(org.snmp4j.agent.request.SubRequest)`

## org.snmp4j.agent.mo.snmp.KeyChange

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.MOColumn.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.getValue(org.snmp4j.agent.mo.MOTableRow,int,org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.isVolatile(org.snmp4j.agent.mo.MOTableRow<V>,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.cleanup(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.undo(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.validateSetRequest(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.KeyChange.get(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`

## org.snmp4j.agent.mo.snmp.NotificationLogEvent

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.NotificationLogEvent.<init>(java.lang.Object,org.snmp4j.smi.OctetString,org.snmp4j.Target,org.snmp4j.smi.OctetString,org.snmp4j.smi.OctetString,org.snmp4j.smi.OID,org.snmp4j.smi.TimeTicks,org.snmp4j.smi.VariableBinding[],long,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.NotificationLogEvent.getOriginatorTarget()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.NotificationLogEvent.getOriginatorTarget()`

## org.snmp4j.agent.mo.snmp.NotificationLogListener

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.NotificationLogListener.notificationLogEvent(org.snmp4j.agent.mo.snmp.NotificationLogEvent)`

## org.snmp4j.agent.mo.snmp.NotificationLogMib

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.NotificationLogMib.notificationLogEvent(org.snmp4j.agent.mo.snmp.NotificationLogEvent)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.NotificationLogMib.getNlmLogEntry()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.NotificationLogMib.getNlmLogEntry()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.NotificationLogMib.getNlmLogVariableEntry()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.NotificationLogMib.getNlmLogVariableEntry()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.NotificationLogMib.getNlmStatsLogEntry()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.NotificationLogMib.getNlmStatsLogEntry()`

## org.snmp4j.agent.mo.snmp.NotificationLogMib$NlmConfigGlobalAgeOut

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.cleanup(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.commit(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.get(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.next(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.prepare(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.undo(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.NotificationLogMib$NlmConfigGlobalAgeOut.isValueOK(org.snmp4j.agent.request.SubRequest)`

## org.snmp4j.agent.mo.snmp.NotificationLogMib$NlmConfigGlobalEntryLimit

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.cleanup(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.get(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.next(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.prepare(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.undo(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.NotificationLogMib$NlmConfigGlobalEntryLimit.commit(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.NotificationLogMib$NlmConfigGlobalEntryLimit.isValueOK(org.snmp4j.agent.request.SubRequest)`

## org.snmp4j.agent.mo.snmp.NotificationLogMib$NlmConfigLogEntryRow

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.DefaultMOTableRow.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanup(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanupRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commitRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepareRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undo(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undoRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

## org.snmp4j.agent.mo.snmp.NotificationLogMib$NlmLogEntryRow

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.DefaultMOTableRow.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanup(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanupRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commitRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepareRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undo(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undoRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

## org.snmp4j.agent.mo.snmp.NotificationLogMib$NlmLogVariableEntryRow

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.DefaultMOTableRow.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanup(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanupRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commitRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepareRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undo(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undoRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

## org.snmp4j.agent.mo.snmp.NotificationLogMib$NlmStatsLogEntryRow

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.DefaultMOTableRow.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanup(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanupRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commitRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepareRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undo(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undoRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

## org.snmp4j.agent.mo.snmp.NotificationLogMib$SnmpAdminString

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.snmp.NotificationLogMib$SnmpAdminString.createColumn(int,int,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable,boolean)`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.snmp.NotificationLogMib$SnmpAdminString.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.NotificationLogMib$SnmpAdminString.createColumn(int,int,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable,boolean)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TextualConvention.createColumn(int,int,org.snmp4j.agent.MOAccess,V,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.NotificationLogMib$SnmpAdminString.createInitialValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.NotificationLogMib$SnmpAdminString.createInitialValue()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.NotificationLogMib$SnmpAdminString.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TextualConvention.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,V)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.snmp4j.agent.mo.snmp.NotificationLogMib$SnmpAdminString.createInitialValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.NotificationLogMib$SnmpAdminString.createInitialValue()`

## org.snmp4j.agent.mo.snmp.NotificationLogMib$SnmpEngineID

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.snmp.NotificationLogMib$SnmpEngineID.createColumn(int,int,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable,boolean)`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.snmp.NotificationLogMib$SnmpEngineID.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.NotificationLogMib$SnmpEngineID.createColumn(int,int,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable,boolean)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TextualConvention.createColumn(int,int,org.snmp4j.agent.MOAccess,V,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.NotificationLogMib$SnmpEngineID.createInitialValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.NotificationLogMib$SnmpEngineID.createInitialValue()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.NotificationLogMib$SnmpEngineID.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TextualConvention.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,V)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.snmp4j.agent.mo.snmp.NotificationLogMib$SnmpEngineID.createInitialValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.NotificationLogMib$SnmpEngineID.createInitialValue()`

## org.snmp4j.agent.mo.snmp.NotificationLogMib$TAddress

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.snmp.NotificationLogMib$TAddress.createColumn(int,int,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable,boolean)`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.snmp.NotificationLogMib$TAddress.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.NotificationLogMib$TAddress.createColumn(int,int,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable,boolean)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TextualConvention.createColumn(int,int,org.snmp4j.agent.MOAccess,V,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.NotificationLogMib$TAddress.createInitialValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.NotificationLogMib$TAddress.createInitialValue()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.NotificationLogMib$TAddress.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TextualConvention.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,V)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.snmp4j.agent.mo.snmp.NotificationLogMib$TAddress.createInitialValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.NotificationLogMib$TAddress.createInitialValue()`

## org.snmp4j.agent.mo.snmp.NotificationLogMib$TDomain

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.snmp.NotificationLogMib$TDomain.createColumn(int,int,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable,boolean)`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.snmp.NotificationLogMib$TDomain.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.NotificationLogMib$TDomain.createColumn(int,int,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable,boolean)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TextualConvention.createColumn(int,int,org.snmp4j.agent.MOAccess,V,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.NotificationLogMib$TDomain.createInitialValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.NotificationLogMib$TDomain.createInitialValue()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.NotificationLogMib$TDomain.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TextualConvention.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,V)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.snmp4j.agent.mo.snmp.NotificationLogMib$TDomain.createInitialValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.NotificationLogMib$TDomain.createInitialValue()`

## org.snmp4j.agent.mo.snmp.NotificationOriginatorImpl

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.NotificationOriginatorImpl.fireNotificationLogEvent(org.snmp4j.agent.mo.snmp.NotificationLogEvent)`

## org.snmp4j.agent.mo.snmp.ProxyForwarderImpl

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.ProxyForwarderImpl.forward(org.snmp4j.agent.ProxyForwardRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.ProxyForwarderImpl.getMatches(org.snmp4j.agent.ProxyForwardRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.ProxyForwarderImpl.matchParameters(org.snmp4j.agent.ProxyForwardRequest,org.snmp4j.smi.OctetString)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.ProxyForwarderImpl.multipleForward(org.snmp4j.agent.ProxyForwardRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.ProxyForwarderImpl.proxyBackwardTranslation(org.snmp4j.PDU,org.snmp4j.PDU,org.snmp4j.event.ResponseEvent)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.ProxyForwarderImpl.proxyForwardTranslation(org.snmp4j.agent.ProxyForwardRequest,org.snmp4j.PDU,org.snmp4j.PDU)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.ProxyForwarderImpl.singleForward(org.snmp4j.agent.ProxyForwardRequest)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.ProxyForwarderImpl.getMatches(org.snmp4j.agent.ProxyForwardRequest)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.ProxyForwarderImpl.getMatches(org.snmp4j.agent.ProxyForwardRequest<? extends java.lang.Object>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.ProxyForwarderImpl.singleForward(org.snmp4j.agent.ProxyForwardRequest)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.ProxyForwarderImpl.singleForward(org.snmp4j.agent.ProxyForwardRequest<A>)`

## org.snmp4j.agent.mo.snmp.RowPointer

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.MOColumn.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.get(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.getValue(org.snmp4j.agent.mo.MOTableRow,int,org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.isVolatile(org.snmp4j.agent.mo.MOTableRow<V>,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.cleanup(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.undo(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.validateSetRequest(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.RowPointer.illegalRowPointer(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.RowPointer.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`

## org.snmp4j.agent.mo.snmp.RowStatus

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.MOColumn.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.getValue(org.snmp4j.agent.mo.MOTableRow,int,org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.cleanup(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.validateSetRequest(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.RowStatus.assignNewValue(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.RowStatus.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.RowStatus.get(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.RowStatus.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.RowStatus.rowChanged(org.snmp4j.agent.mo.MOTableRowEvent)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.RowStatus.undo(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`

## org.snmp4j.agent.mo.snmp.RowStatusEvent

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.RowStatusEvent.<init>(java.lang.Object,org.snmp4j.agent.mo.MOTable,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.RowStatusEvent.<init>(java.lang.Object,org.snmp4j.agent.mo.MOTable,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int,int,boolean)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.RowStatusEvent.<init>(java.lang.Object,org.snmp4j.agent.mo.MOTable,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int,int,boolean,org.snmp4j.agent.request.SubRequest)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.RowStatusEvent.getRequest()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.RowStatusEvent.getRequest()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.RowStatusEvent.getTable()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.RowStatusEvent.getTable()`

## org.snmp4j.agent.mo.snmp.SNMPv2MIB$SysOREntry

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.snmp4j.agent.mo.DefaultMOTable.newRows`
+ NEW FIELD: `org.snmp4j.agent.mo.DefaultMOTable.newRows`

### FIELD_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD FIELD (type incompatible): `org.snmp4j.agent.mo.DefaultMOTable.pendingChanges`
+ NEW FIELD: `org.snmp4j.agent.mo.DefaultMOTable.pendingChanges`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.addPendingChanges(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,boolean)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.cleanup(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.commit(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.findCell(org.snmp4j.agent.MOScope,org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.get(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.getChangesFromRequest(org.snmp4j.smi.OID,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.request.SubRequest,org.snmp4j.smi.Variable[],boolean,boolean)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.getNewRows(org.snmp4j.agent.request.Request)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.getPendingChangeSet(org.snmp4j.agent.request.SubRequest,org.snmp4j.smi.OID)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.getRowPreview(org.snmp4j.agent.request.Request,org.snmp4j.smi.OID)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.getValue(org.snmp4j.agent.mo.MOTableRow,int,org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.getValue(org.snmp4j.smi.OID,int,org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.hasNewRows(org.snmp4j.agent.request.Request)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.isChangeSetComplete(org.snmp4j.agent.request.SubRequest,org.snmp4j.smi.OID,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.next(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.prepare(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.undo(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOTable.update(org.snmp4j.agent.MOScope,org.snmp4j.agent.request.SubRequest)`

## org.snmp4j.agent.mo.snmp.SNMPv2MIB$SysUpTimeImpl

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.checkRequestScope(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.cleanup(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.commit(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.get(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.isValueOK(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.next(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.prepare(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.undo(org.snmp4j.agent.request.SubRequest)`

## org.snmp4j.agent.mo.snmp.SNMPv2TC

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SNMPv2TC.getTextualConventions()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SNMPv2TC.getTextualConventions()`

## org.snmp4j.agent.mo.snmp.SnmpAdminString

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.snmp4j.agent.mo.snmp.SnmpAdminString.<init>(int,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable,boolean)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.snmp4j.agent.mo.snmp.SnmpAdminString.<init>(int,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable,boolean,int,int)`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.MOColumn.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.get(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.getValue(org.snmp4j.agent.mo.MOTableRow,int,org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.isVolatile(org.snmp4j.agent.mo.MOTableRow<V>,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.cleanup(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.undo(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.validateSetRequest(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`

## org.snmp4j.agent.mo.snmp.SnmpCommunityMIB$SnmpCommunityEntryRow

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.DefaultMOTableRow.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanup(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanupRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commitRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepareRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undo(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undoRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

## org.snmp4j.agent.mo.snmp.SnmpFrameworkMIB

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.snmp4j.agent.mo.snmp.SnmpFrameworkMIB.<init>(org.snmp4j.security.USM,java.util.Collection<org.snmp4j.TransportMapping<? extends org.snmp4j.smi.Address>>)`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.snmp4j.agent.mo.snmp.SnmpFrameworkMIB.<init>(org.snmp4j.security.USM,java.util.Collection<org.snmp4j.TransportMapping<? extends org.snmp4j.smi.Address>>,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpFrameworkMIB.getSnmpEngineBoots()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpFrameworkMIB.getSnmpEngineBoots()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpFrameworkMIB.getSnmpEngineID()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpFrameworkMIB.getSnmpEngineID()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpFrameworkMIB.getSnmpEngineMaxMessageSize()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpFrameworkMIB.getSnmpEngineMaxMessageSize()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpFrameworkMIB.getSnmpEngineTime()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpFrameworkMIB.getSnmpEngineTime()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpFrameworkMIB.getTextualConvention(java.lang.String)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpFrameworkMIB.getTextualConvention(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpFrameworkMIB.getTextualConventions()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpFrameworkMIB.getTextualConventions()`

## org.snmp4j.agent.mo.snmp.SnmpProxyMIB

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpProxyMIB.getSnmpProxyEntry()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpProxyMIB.getSnmpProxyEntry()`

## org.snmp4j.agent.mo.snmp.SnmpProxyMIB$SnmpProxyRow

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.DefaultMOTableRow.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanup(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanupRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commitRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepareRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undo(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undoRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

## org.snmp4j.agent.mo.snmp.SnmpSshTmMib

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.snmp4j.agent.mo.snmp.SnmpSshTmMib`

## org.snmp4j.agent.mo.snmp.SnmpTagList

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.snmp4j.agent.mo.snmp.SnmpTagList.<init>(int,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable,boolean)`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.MOColumn.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.get(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.getValue(org.snmp4j.agent.mo.MOTableRow,int,org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.isVolatile(org.snmp4j.agent.mo.MOTableRow<V>,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.cleanup(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.undo(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.validateSetRequest(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`

## org.snmp4j.agent.mo.snmp.SnmpTagValue

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.MOColumn.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.get(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.getValue(org.snmp4j.agent.mo.MOTableRow,int,org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.isVolatile(org.snmp4j.agent.mo.MOTableRow<V>,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.cleanup(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.undo(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.validateSetRequest(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`

## org.snmp4j.agent.mo.snmp.SnmpTargetMIB

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.SnmpTargetMIB.rowChanged(org.snmp4j.agent.mo.MOTableRowEvent)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpTargetMIB.getTarget(org.snmp4j.smi.OctetString,org.snmp4j.smi.OctetString,org.snmp4j.smi.OctetString)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpTargetMIB.getTarget(org.snmp4j.smi.OctetString,org.snmp4j.smi.OctetString,org.snmp4j.smi.OctetString)`

## org.snmp4j.agent.mo.snmp.SnmpTargetMIB$SnmpTargetAddrEntryRow

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.DefaultMOTableRow.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanup(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanupRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undo(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undoRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.SnmpTargetMIB$SnmpTargetAddrEntryRow.commitRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.SnmpTargetMIB$SnmpTargetAddrEntryRow.prepareRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `org.snmp4j.agent.mo.snmp.SnmpTargetMIB$SnmpTargetAddrEntryRow.getTarget(org.snmp4j.smi.OctetString,org.snmp4j.smi.OctetString)`

## org.snmp4j.agent.mo.snmp.SnmpTlsTmMib

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.isClientCertificateAccepted(java.security.cert.X509Certificate)`
+ NOW THROWS: `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.isClientCertificateAccepted(java.security.cert.X509Certificate)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmAddrCount()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmAddrCount()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmAddrEntry()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmAddrEntry()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmAddrTableLastChanged()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmAddrTableLastChanged()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmCertToTSNCount()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmCertToTSNCount()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmCertToTSNEntry()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmCertToTSNEntry()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmCertToTSNTableLastChanged()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmCertToTSNTableLastChanged()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmParamsCount()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmParamsCount()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmParamsEntry()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmParamsEntry()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmParamsTableLastChanged()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmParamsTableLastChanged()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmSessionAccepts()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmSessionAccepts()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmSessionClientCloses()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmSessionClientCloses()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmSessionInvalidCaches()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmSessionInvalidCaches()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmSessionInvalidClientCertificates()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmSessionInvalidClientCertificates()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmSessionInvalidServerCertificates()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmSessionInvalidServerCertificates()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmSessionNoSessions()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmSessionNoSessions()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmSessionOpenErrors()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmSessionOpenErrors()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmSessionOpens()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmSessionOpens()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmSessionServerCloses()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmSessionServerCloses()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmSessionUnknownServerCertificate()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib.getSnmpTlstmSessionUnknownServerCertificate()`

## org.snmp4j.agent.mo.snmp.SnmpTlsTmMib$SnmpAdminString

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib$SnmpAdminString`

## org.snmp4j.agent.mo.snmp.SnmpTlsTmMib$SnmpTLSFingerprint

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib$SnmpTLSFingerprint.createColumn(int,int,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable,boolean)`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib$SnmpTLSFingerprint.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib$SnmpTLSFingerprint.createColumn(int,int,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable,boolean)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TextualConvention.createColumn(int,int,org.snmp4j.agent.MOAccess,V,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib$SnmpTLSFingerprint.createInitialValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib$SnmpTLSFingerprint.createInitialValue()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib$SnmpTLSFingerprint.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TextualConvention.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,V)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib$SnmpTLSFingerprint.createInitialValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.SnmpTlsTmMib$SnmpTLSFingerprint.createInitialValue()`

## org.snmp4j.agent.mo.snmp.SnmpTlsTmMib$SnmpTlstmAddrEntryRow

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.DefaultMOTableRow.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanup(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanupRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commitRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepareRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undo(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undoRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

## org.snmp4j.agent.mo.snmp.SnmpTlsTmMib$SnmpTlstmCertToTSNEntryRow

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.DefaultMOTableRow.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanup(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanupRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commitRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepareRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undo(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undoRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

## org.snmp4j.agent.mo.snmp.SnmpTlsTmMib$SnmpTlstmParamsEntryRow

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.DefaultMOTableRow.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanup(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanupRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commitRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepareRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undo(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undoRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

## org.snmp4j.agent.mo.snmp.SnmpTsmMib$SnmpTsmConfigurationUsePrefix

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.cleanup(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.commit(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.get(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.next(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.prepare(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.undo(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.SnmpTsmMib$SnmpTsmConfigurationUsePrefix.isValueOK(org.snmp4j.agent.request.SubRequest)`

## org.snmp4j.agent.mo.snmp.StorageType

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.MOColumn.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.get(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.getValue(org.snmp4j.agent.mo.MOTableRow,int,org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.cleanup(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.undo(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.validateSetRequest(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.StorageType.prepareRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOMutableTableRow,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`

## org.snmp4j.agent.mo.snmp.TestAndIncr

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.checkRequestScope(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.cleanup(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.get(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.next(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.undo(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.TestAndIncr.commit(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.TestAndIncr.isValueOK(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.TestAndIncr.prepare(org.snmp4j.agent.request.SubRequest)`

## org.snmp4j.agent.mo.snmp.TimeStamp

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.MOColumn.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.get(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.getValue(org.snmp4j.agent.mo.MOTableRow,int,org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.isVolatile(org.snmp4j.agent.mo.MOTableRow<V>,int)`

## org.snmp4j.agent.mo.snmp.TimeStampScalar

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.checkRequestScope(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.cleanup(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.commit(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.get(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.isValueOK(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.next(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.prepare(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.undo(org.snmp4j.agent.request.SubRequest)`

## org.snmp4j.agent.mo.snmp.UsmKeyChange

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.MOColumn.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.getValue(org.snmp4j.agent.mo.MOTableRow,int,org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.isVolatile(org.snmp4j.agent.mo.MOTableRow<V>,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.cleanup(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.undo(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.validateSetRequest(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.KeyChange.get(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.UsmKeyChange.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.UsmKeyChange.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`

## org.snmp4j.agent.mo.snmp.UsmMIB

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.UsmMIB.getProtocolForKeyChange(org.snmp4j.agent.request.Request,org.snmp4j.smi.OID,org.snmp4j.security.dh.DHOperations$KeyType)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.UsmMIB.rowChanged(org.snmp4j.agent.mo.MOTableRowEvent)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.UsmMIB.getUsmUserEntry()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.UsmMIB.getUsmUserEntry()`

## org.snmp4j.agent.mo.snmp.UsmMIB$UsmTableModel

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.UsmMIB$UsmTableModel.createRow(org.snmp4j.smi.OID,org.snmp4j.smi.Variable[])`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.UsmMIB$UsmTableModel.createRow(org.snmp4j.smi.OID,org.snmp4j.smi.Variable[])`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.snmp4j.agent.mo.snmp.UsmMIB$UsmTableModel.createRow(org.snmp4j.smi.OID,org.snmp4j.smi.Variable[])`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.UsmMIB$UsmTableModel.createRow(org.snmp4j.smi.OID,org.snmp4j.smi.Variable[])`

## org.snmp4j.agent.mo.snmp.UsmMIB$UsmTableRow

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.DefaultMOTableRow.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanup(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepareRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undo(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.UsmMIB$UsmTableRow.cleanupRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.UsmMIB$UsmTableRow.commitRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.UsmMIB$UsmTableRow.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.UsmMIB$UsmTableRow.undoRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

## org.snmp4j.agent.mo.snmp.UsmOwnKeyChange

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.MOColumn.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.getValue(org.snmp4j.agent.mo.MOTableRow,int,org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.isVolatile(org.snmp4j.agent.mo.MOTableRow<V>,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.cleanup(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.undo(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.validateSetRequest(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.KeyChange.get(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.UsmKeyChange.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.UsmOwnKeyChange.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`

## org.snmp4j.agent.mo.snmp.VacmMIB

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.VacmMIB.getVacmSecurityToGroupTable()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.VacmMIB.getVacmSecurityToGroupTable()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.VacmMIB.getViews(org.snmp4j.smi.OctetString)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.VacmMIB.getViews(org.snmp4j.smi.OctetString)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.snmp4j.agent.mo.snmp.VacmMIB.getVacmSecurityToGroupTable()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.VacmMIB.getVacmSecurityToGroupTable()`

## org.snmp4j.agent.mo.snmp.dh.DHGroups

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.snmp4j.agent.mo.snmp.dh.DHGroups`

## org.snmp4j.agent.mo.snmp.dh.DHKeyChangeImpl

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.MOColumn.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.getValue(org.snmp4j.agent.mo.MOTableRow,int,org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOColumn.isVolatile(org.snmp4j.agent.mo.MOTableRow<V>,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.cleanup(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOMutableColumn.validateSetRequest(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.dh.DHKeyChangeImpl.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.dh.DHKeyChangeImpl.get(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.dh.DHKeyChangeImpl.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.dh.DHKeyChangeImpl.undo(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.MOMutableColumn.getDefaultValue()`

## org.snmp4j.agent.mo.snmp.dh.SnmpUsmDhObjectsMib

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.dh.SnmpUsmDhObjectsMib.setBaseTableUsmDHUserKeyEntry(org.snmp4j.agent.mo.DefaultMOTable<org.snmp4j.agent.mo.MOMutableRow2PC,org.snmp4j.agent.mo.MOColumn,org.snmp4j.agent.mo.DefaultMOMutableTableModel<org.snmp4j.agent.mo.MOMutableRow2PC>>)`

## org.snmp4j.agent.mo.snmp.dh.SnmpUsmDhObjectsMib$DHKeyChange

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.snmp.dh.SnmpUsmDhObjectsMib$DHKeyChange.createColumn(int,int,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable,boolean)`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.snmp.dh.SnmpUsmDhObjectsMib$DHKeyChange.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.dh.SnmpUsmDhObjectsMib$DHKeyChange.createColumn(int,int,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable,boolean)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TextualConvention.createColumn(int,int,org.snmp4j.agent.MOAccess,V,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.dh.SnmpUsmDhObjectsMib$DHKeyChange.createInitialValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.dh.SnmpUsmDhObjectsMib$DHKeyChange.createInitialValue()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.dh.SnmpUsmDhObjectsMib$DHKeyChange.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TextualConvention.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,V)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.snmp4j.agent.mo.snmp.dh.SnmpUsmDhObjectsMib$DHKeyChange.createInitialValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.dh.SnmpUsmDhObjectsMib$DHKeyChange.createInitialValue()`

## org.snmp4j.agent.mo.snmp.dh.SnmpUsmDhObjectsMib$SnmpAdminString

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.snmp4j.agent.mo.snmp.dh.SnmpUsmDhObjectsMib$SnmpAdminString`

## org.snmp4j.agent.mo.snmp.dh.SnmpUsmDhObjectsMib$UsmDHKickstartEntryRow

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.DefaultMOTableRow.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanup(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanupRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commitRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepareRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undo(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undoRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

## org.snmp4j.agent.mo.snmp.dh.SnmpUsmDhObjectsMib$UsmDHParameters

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.cleanup(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.commit(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.get(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.next(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.prepare(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.undo(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.dh.SnmpUsmDhObjectsMib$UsmDHParameters.isValueOK(org.snmp4j.agent.request.SubRequest)`

## org.snmp4j.agent.mo.snmp.dh.SnmpUsmDhObjectsMib$UsmDHUserKeyEntryRow

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.DefaultMOTableRow.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanup(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanupRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepareRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undo(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undoRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp.dh.SnmpUsmDhObjectsMib$UsmDHUserKeyEntryRow.commitRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

## org.snmp4j.agent.mo.snmp.dh.UsmDHParametersImpl

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.checkRequestScope(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.cleanup(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.commit(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.get(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.isValueOK(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.next(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.prepare(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.undo(org.snmp4j.agent.request.SubRequest)`

## org.snmp4j.agent.mo.snmp.tc.RowStatusTC

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.snmp.tc.RowStatusTC.createColumn(int,int,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable,boolean)`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.snmp.tc.RowStatusTC.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.tc.RowStatusTC.createColumn(int,int,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable,boolean)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TextualConvention.createColumn(int,int,org.snmp4j.agent.MOAccess,V,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.tc.RowStatusTC.createInitialValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.RowStatusTC.createInitialValue()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.tc.RowStatusTC.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TextualConvention.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,V)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.snmp4j.agent.mo.snmp.tc.RowStatusTC.createInitialValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.RowStatusTC.createInitialValue()`

## org.snmp4j.agent.mo.snmp.tc.StorageTypeTC

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.snmp.tc.StorageTypeTC.createColumn(int,int,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable,boolean)`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.snmp.tc.StorageTypeTC.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.tc.StorageTypeTC.createColumn(int,int,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable,boolean)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TextualConvention.createColumn(int,int,org.snmp4j.agent.MOAccess,V,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.tc.StorageTypeTC.createInitialValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.StorageTypeTC.createInitialValue()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.tc.StorageTypeTC.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TextualConvention.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,V)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.snmp4j.agent.mo.snmp.tc.StorageTypeTC.createInitialValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.StorageTypeTC.createInitialValue()`

## org.snmp4j.agent.mo.snmp.tc.TCModule

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.tc.TCModule.getTextualConvention(java.lang.String)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TCModule.getTextualConvention(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.tc.TCModule.getTextualConventions()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TCModule.getTextualConventions()`

## org.snmp4j.agent.mo.snmp.tc.TestAndIncrTC

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.snmp.tc.TestAndIncrTC.createColumn(int,int,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable,boolean)`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.snmp.tc.TestAndIncrTC.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.tc.TestAndIncrTC.createColumn(int,int,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable,boolean)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TextualConvention.createColumn(int,int,org.snmp4j.agent.MOAccess,V,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.tc.TestAndIncrTC.createInitialValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TestAndIncrTC.createInitialValue()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.tc.TestAndIncrTC.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TextualConvention.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,V)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.snmp4j.agent.mo.snmp.tc.TestAndIncrTC.createInitialValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TestAndIncrTC.createInitialValue()`

## org.snmp4j.agent.mo.snmp.tc.TimeStampTC

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.snmp.tc.TimeStampTC.createColumn(int,int,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable,boolean)`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.snmp.tc.TimeStampTC.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.tc.TimeStampTC.createColumn(int,int,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable,boolean)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TextualConvention.createColumn(int,int,org.snmp4j.agent.MOAccess,V,boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.tc.TimeStampTC.createInitialValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TimeStampTC.createInitialValue()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp.tc.TimeStampTC.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,org.snmp4j.smi.Variable)`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TextualConvention.createScalar(org.snmp4j.smi.OID,org.snmp4j.agent.MOAccess,V)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `org.snmp4j.agent.mo.snmp.tc.TimeStampTC.createInitialValue()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp.tc.TimeStampTC.createInitialValue()`

## org.snmp4j.agent.mo.snmp4j.MOSubtreeProxy

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp4j.MOSubtreeProxy.cleanup(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp4j.MOSubtreeProxy.commit(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp4j.MOSubtreeProxy.get(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp4j.MOSubtreeProxy.next(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp4j.MOSubtreeProxy.prepare(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp4j.MOSubtreeProxy.undo(org.snmp4j.agent.request.SubRequest)`

## org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib.getSnmp4jCfgStorageEntry()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib.getSnmp4jCfgStorageEntry()`

## org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib$Snmp4jCfgSecSrcAddrValidation

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.get(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.next(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.prepare(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.MOScalar.undo(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib$Snmp4jCfgSecSrcAddrValidation.cleanup(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib$Snmp4jCfgSecSrcAddrValidation.commit(org.snmp4j.agent.request.SubRequest)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp4j.Snmp4jConfigMib$Snmp4jCfgSecSrcAddrValidation.isValueOK(org.snmp4j.agent.request.SubRequest)`

## org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib.rowChanged(org.snmp4j.agent.mo.MOTableRowEvent)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib.getSnmp4jLogConsoleHandlerEntry()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib.getSnmp4jLogConsoleHandlerEntry()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib.getSnmp4jLogFileHandlerEntry()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib.getSnmp4jLogFileHandlerEntry()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib.getSnmp4jLogHandlerEntry()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib.getSnmp4jLogHandlerEntry()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib.getSnmp4jLogLoggerEntry()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib.getSnmp4jLogLoggerEntry()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib.getSnmp4jLogLoggerToHandlerEntry()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib.getSnmp4jLogLoggerToHandlerEntry()`

## org.snmp4j.agent.mo.snmp4j.Snmp4jLogMib$Snmp4jLogLoggerRow

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.DefaultMOTableRow.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanup(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanupRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commitRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepareRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undo(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undoRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

## org.snmp4j.agent.mo.snmp4j.Snmp4jProxyMib

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.snmp4j.Snmp4jProxyMib.rowChanged(org.snmp4j.agent.mo.MOTableRowEvent)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.mo.snmp4j.Snmp4jProxyMib.getSnmp4jProxyEntry()`
+ NEW RETURN TYPE: `org.snmp4j.agent.mo.snmp4j.Snmp4jProxyMib.getSnmp4jProxyEntry()`

## org.snmp4j.agent.mo.snmp4j.Snmp4jProxyMib$Snmp4jProxyEntryRow

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `org.snmp4j.agent.mo.DefaultMOTableRow.compareTo(java.lang.Object)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanup(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.cleanupRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commit(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.commitRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepare(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.prepareRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.MOTableRow)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undo(org.snmp4j.agent.request.SubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.mo.DefaultMOMutableRow2PC.undoRow(org.snmp4j.agent.request.SubRequest,org.snmp4j.agent.mo.DefaultMOTable$ChangeSet)`

## org.snmp4j.agent.mo.snmp4j.Snmp4jProxyMib$SnmpAdminString

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.snmp4j.agent.mo.snmp4j.Snmp4jProxyMib$SnmpAdminString`

## org.snmp4j.agent.mo.snmp4j.Snmp4jProxyMib$SnmpEngineID

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `org.snmp4j.agent.mo.snmp4j.Snmp4jProxyMib$SnmpEngineID`

## org.snmp4j.agent.request.AbstractRequest

### FORMAL_TYPE_PARAMETER_CHANGED [binary ✓ | source ✗]
- FORMAL TYPE PARAMETER CHANGED: `org.snmp4j.agent.request.AbstractRequest`

## org.snmp4j.agent.request.Request

### FORMAL_TYPE_PARAMETER_CHANGED [binary ✓ | source ✗]
- FORMAL TYPE PARAMETER CHANGED: `org.snmp4j.agent.request.Request`

## org.snmp4j.agent.request.SnmpRequest

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.request.SnmpRequest.<init>(org.snmp4j.CommandResponderEvent,org.snmp4j.agent.mo.snmp.CoexistenceInfo)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.request.SnmpRequest.setRequestEvent(org.snmp4j.CommandResponderEvent)`

## org.snmp4j.agent.request.SnmpRequest$SnmpSubRequest

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `org.snmp4j.agent.request.SnmpRequest$SnmpSubRequest.<init>(org.snmp4j.agent.request.SnmpRequest$SnmpSubRequest,int)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.request.SnmpRequest$SnmpSubRequest.setLookupEvent(org.snmp4j.agent.MOServerLookupEvent<org.snmp4j.agent.request.SnmpRequest$SnmpSubRequest>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.request.SnmpRequest$SnmpSubRequest.setTargetMO(org.snmp4j.agent.ManagedObject)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.request.SnmpRequest$SnmpSubRequest.getTargetMO()`
+ NEW RETURN TYPE: `org.snmp4j.agent.request.SnmpRequest$SnmpSubRequest.getTargetMO()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.request.SnmpRequest$SnmpSubRequest.repetitions()`
+ NEW RETURN TYPE: `org.snmp4j.agent.request.SnmpRequest$SnmpSubRequest.repetitions()`

## org.snmp4j.agent.request.SnmpSubRequest

### FORMAL_TYPE_PARAMETER_CHANGED [binary ✓ | source ✗]
- FORMAL TYPE PARAMETER CHANGED: `org.snmp4j.agent.request.SnmpSubRequest`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.request.SnmpSubRequest.setLookupEvent(org.snmp4j.agent.MOServerLookupEvent<R>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.request.SubRequest.setTargetMO(org.snmp4j.agent.ManagedObject)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.request.SubRequest.getRequest()`
+ NEW RETURN TYPE: `org.snmp4j.agent.request.SubRequest.getRequest()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.request.SubRequest.getTargetMO()`
+ NEW RETURN TYPE: `org.snmp4j.agent.request.SubRequest.getTargetMO()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.request.SubRequest.repetitions()`
+ NEW RETURN TYPE: `org.snmp4j.agent.request.SubRequest.repetitions()`

## org.snmp4j.agent.request.SubRequest

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.request.SubRequest.setTargetMO(org.snmp4j.agent.ManagedObject)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.request.SubRequest.getRequest()`
+ NEW RETURN TYPE: `org.snmp4j.agent.request.SubRequest.getRequest()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.request.SubRequest.getTargetMO()`
+ NEW RETURN TYPE: `org.snmp4j.agent.request.SubRequest.getTargetMO()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `org.snmp4j.agent.request.SubRequest.repetitions()`
+ NEW RETURN TYPE: `org.snmp4j.agent.request.SubRequest.repetitions()`

## org.snmp4j.agent.request.SubRequestIteratorSupport

### FORMAL_TYPE_PARAMETER_CHANGED [binary ✓ | source ✗]
- FORMAL TYPE PARAMETER CHANGED: `org.snmp4j.agent.request.SubRequestIteratorSupport`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `org.snmp4j.agent.request.SubRequestIteratorSupport.<init>(java.util.Iterator)`

