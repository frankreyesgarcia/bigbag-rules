# Breaking Changes: com.pubnub:pubnub-gson 4.31.3 → 6.3.2
Total: 388 (binary-breaking: 345, source-breaking: 378)

## com.pubnub.api.PNConfiguration

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.PNConfiguration.<init>()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.PNConfiguration.isDisableTokenManager()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.PNConfiguration.setDisableTokenManager(boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.pubnub.api.PNConfiguration.setUuid(java.lang.String)`
+ NEW RETURN TYPE: `com.pubnub.api.PNConfiguration.setUuid(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.pubnub.api.PNConfiguration.setUuid(java.lang.String)`
+ NEW RETURN TYPE: `com.pubnub.api.PNConfiguration.setUuid(java.lang.String)`

## com.pubnub.api.PubNub

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `com.pubnub.api.PubNub.setToken(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.PubNub.createSpace()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.PubNub.createUser()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.PubNub.deleteSpace()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.PubNub.deleteUser()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.PubNub.getMembers()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.PubNub.getSpace()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.PubNub.getSpaces()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.PubNub.getToken(com.pubnub.api.managers.token_manager.TokenManagerProperties)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.PubNub.getToken(java.lang.String,com.pubnub.api.managers.token_manager.PNResourceType)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.PubNub.getTokens()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.PubNub.getTokensByResource(com.pubnub.api.managers.token_manager.PNResourceType)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.PubNub.getUser()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.PubNub.getUsers()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.PubNub.manageMembers()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.PubNub.setTokens(java.util.List<java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.PubNub.updateSpace()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.PubNub.updateUser()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.pubnub.api.PubNub.grantToken()`
+ NEW RETURN TYPE: `com.pubnub.api.PubNub.grantToken()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.pubnub.api.PubNub.manageMemberships()`
+ NEW RETURN TYPE: `com.pubnub.api.PubNub.manageMemberships()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.pubnub.api.PubNub.grantToken()`
+ NEW RETURN TYPE: `com.pubnub.api.PubNub.grantToken()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.pubnub.api.PubNub.manageMemberships()`
+ NEW RETURN TYPE: `com.pubnub.api.PubNub.manageMemberships()`

## com.pubnub.api.builder.PubNubErrorBuilder

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.pubnub.api.builder.PubNubErrorBuilder.PNERROBJ_SUBSCRIBE_TIMEOUT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.pubnub.api.builder.PubNubErrorBuilder.PNERROBJ_USER_MISSING`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.pubnub.api.builder.PubNubErrorBuilder.PNERR_HTTP_SUBSCRIBE_TIMEOUT`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.pubnub.api.builder.PubNubErrorBuilder.PNERR_USER_MISSING`

## com.pubnub.api.callbacks.SubscribeCallback

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.callbacks.SubscribeCallback.membership(com.pubnub.api.PubNub,com.pubnub.api.models.consumer.pubsub.objects.PNMembershipResult)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.callbacks.SubscribeCallback.space(com.pubnub.api.PubNub,com.pubnub.api.models.consumer.pubsub.objects.PNSpaceResult)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.callbacks.SubscribeCallback.user(com.pubnub.api.PubNub,com.pubnub.api.models.consumer.pubsub.objects.PNUserResult)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.pubnub.api.callbacks.SubscribeCallback`
+ MUST NOW IMPLEMENT: `com.pubnub.api.callbacks.SubscribeCallback.file(com.pubnub.api.PubNub,com.pubnub.api.models.consumer.pubsub.files.PNFileEventResult)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.pubnub.api.callbacks.SubscribeCallback`
+ MUST NOW IMPLEMENT: `com.pubnub.api.callbacks.SubscribeCallback.channel(com.pubnub.api.PubNub,com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadataResult)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.pubnub.api.callbacks.SubscribeCallback`
+ MUST NOW IMPLEMENT: `com.pubnub.api.callbacks.SubscribeCallback.uuid(com.pubnub.api.PubNub,com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadataResult)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.pubnub.api.callbacks.SubscribeCallback`
+ MUST NOW IMPLEMENT: `com.pubnub.api.callbacks.SubscribeCallback.membership(com.pubnub.api.PubNub,com.pubnub.api.models.consumer.objects_api.membership.PNMembershipResult)`

## com.pubnub.api.endpoints.DeleteMessages

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.DeleteMessages.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.Endpoint

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.Endpoint.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.FetchMessages

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.FetchMessages.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.History

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.History.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.MessageCounts

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.MessageCounts.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.Time

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.Time.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.access.Grant

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.access.Grant.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.access.GrantToken

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.access.GrantToken.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.access.GrantToken.spaces(com.pubnub.api.models.consumer.access_manager.v3.Space[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.access.GrantToken.users(com.pubnub.api.models.consumer.access_manager.v3.User[])`

## com.pubnub.api.endpoints.channel_groups.AddChannelChannelGroup

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.channel_groups.AddChannelChannelGroup.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.channel_groups.AllChannelsChannelGroup

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.channel_groups.AllChannelsChannelGroup.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.channel_groups.DeleteChannelGroup

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.channel_groups.DeleteChannelGroup.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.channel_groups.ListAllChannelGroup

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.channel_groups.ListAllChannelGroup.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.channel_groups.RemoveChannelChannelGroup

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.channel_groups.RemoveChannelChannelGroup.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.message_actions.AddMessageAction

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.message_actions.AddMessageAction.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.message_actions.GetMessageActions

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.message_actions.GetMessageActions.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `com.pubnub.api.endpoints.message_actions.GetMessageActions.createResponse(retrofit2.Response<com.google.gson.JsonObject>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.pubnub.api.endpoints.message_actions.GetMessageActions.doWork(java.util.Map<java.lang.String,java.lang.String>)`
+ NEW RETURN TYPE: `com.pubnub.api.endpoints.message_actions.GetMessageActions.doWork(java.util.Map<java.lang.String,java.lang.String>)`

## com.pubnub.api.endpoints.message_actions.RemoveMessageAction

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.message_actions.RemoveMessageAction.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.objects_api.members.GetMembers

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.endpoints.objects_api.members.GetMembers`

## com.pubnub.api.endpoints.objects_api.members.ManageMembers

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.endpoints.objects_api.members.ManageMembers`

## com.pubnub.api.endpoints.objects_api.memberships.GetMemberships

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships.createResponse(retrofit2.Response<com.pubnub.api.models.server.objects_api.EntityArrayEnvelope<com.pubnub.api.models.consumer.objects_api.membership.PNMembership>>)`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships.filter(java.lang.String)`

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships.getOperationType()`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships.createResponse(retrofit2.Response<com.pubnub.api.models.server.objects_api.EntityArrayEnvelope<com.pubnub.api.models.consumer.objects_api.membership.PNMembership>>)`
+ NOW THROWS: `com.pubnub.api.endpoints.Endpoint.createResponse(retrofit2.Response<Input>)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships.doWork(java.util.Map<java.lang.String,java.lang.String>)`
+ NOW THROWS: `com.pubnub.api.endpoints.objects_api.ObjectApiEndpoint.doWork(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships.createResponse(retrofit2.Response<com.pubnub.api.models.server.objects_api.EntityArrayEnvelope<com.pubnub.api.models.consumer.objects_api.membership.PNMembership>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships.end(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships.getTmsProperties()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships.includeFields(com.pubnub.api.enums.PNMembershipFields[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships.limit(java.lang.Integer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships.start(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships.userId(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships.withTotalCount(java.lang.Boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.models.consumer.objects_api.util.InclusionParamsProvider.includeFields(FieldsEnumType[])`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships.createResponse(retrofit2.Response<com.pubnub.api.models.server.objects_api.EntityArrayEnvelope<com.pubnub.api.models.consumer.objects_api.membership.PNMembership>>)`
+ NEW RETURN TYPE: `com.pubnub.api.endpoints.Endpoint.createResponse(retrofit2.Response<Input>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships.doWork(java.util.Map<java.lang.String,java.lang.String>)`
+ NEW RETURN TYPE: `com.pubnub.api.endpoints.objects_api.ObjectApiEndpoint.doWork(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships.filter(java.lang.String)`
+ NEW RETURN TYPE: `com.pubnub.api.endpoints.objects_api.utils.Filter$FilterAware.filter(java.lang.String)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships.createResponse(retrofit2.Response<com.pubnub.api.models.server.objects_api.EntityArrayEnvelope<com.pubnub.api.models.consumer.objects_api.membership.PNMembership>>)`
+ NEW RETURN TYPE: `com.pubnub.api.endpoints.Endpoint.createResponse(retrofit2.Response<Input>)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships.filter(java.lang.String)`
+ NEW RETURN TYPE: `com.pubnub.api.endpoints.objects_api.utils.Filter$FilterAware.filter(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships`
+ MUST NOW IMPLEMENT: `com.pubnub.api.endpoints.objects_api.utils.Pager$PagingAware.page(com.pubnub.api.models.consumer.PNPage)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships`
+ MUST NOW IMPLEMENT: `com.pubnub.api.endpoints.objects_api.utils.Include$CustomIncludeAware.includeCustom(boolean)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships`
+ MUST NOW IMPLEMENT: `com.pubnub.api.endpoints.objects_api.utils.Sorter$SortingAware.sort(com.pubnub.api.endpoints.objects_api.utils.PNSortKey[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships`
+ MUST NOW IMPLEMENT: `com.pubnub.api.endpoints.objects_api.utils.TotalCounter$TotalCountAware.includeTotalCount(boolean)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships`
+ MUST NOW IMPLEMENT: `com.pubnub.api.endpoints.objects_api.utils.Limiter$LimitAware.limit(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships`
+ MUST NOW IMPLEMENT: `com.pubnub.api.endpoints.objects_api.ObjectApiEndpoint.executeCommand(java.util.Map<java.lang.String,java.lang.String>)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships`
+ MUST NOW IMPLEMENT: `com.pubnub.api.endpoints.objects_api.utils.Include$ChannelIncludeAware.includeChannel(com.pubnub.api.endpoints.objects_api.utils.Include$PNChannelDetailsLevel)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships`

## com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.endpoints.Endpoint.async(com.pubnub.api.callbacks.PNCallback<Output>)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.endpoints.Endpoint.queryParam(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.endpoints.Endpoint.retry()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.endpoints.Endpoint.silentCancel()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.endpoints.Endpoint.sync()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.createBaseParams()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.encodeParams(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.getPubnub()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.getRetrofit()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships.add(com.pubnub.api.models.consumer.objects_api.membership.Membership[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships.createResponse(retrofit2.Response<com.pubnub.api.models.server.objects_api.EntityArrayEnvelope<com.pubnub.api.models.consumer.objects_api.membership.PNMembership>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships.doWork(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships.end(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships.getAffectedChannelGroups()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships.getAffectedChannels()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships.getOperationType()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships.getTmsProperties()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships.includeFields(com.pubnub.api.enums.PNMembershipFields[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships.isAuthRequired()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships.limit(java.lang.Integer)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships.remove(com.pubnub.api.models.consumer.objects_api.membership.Membership[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships.start(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships.update(com.pubnub.api.models.consumer.objects_api.membership.Membership[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships.userId(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships.validateParams()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships.withTotalCount(java.lang.Boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.models.consumer.objects_api.util.InclusionParamsProvider.includeFields(FieldsEnumType[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.models.consumer.objects_api.util.MembershipChainProvider.add(PropertyType[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.models.consumer.objects_api.util.MembershipChainProvider.remove(PropertyType[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.models.consumer.objects_api.util.MembershipChainProvider.update(PropertyType[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships`
+ MUST NOW IMPLEMENT: `com.pubnub.api.endpoints.objects_api.utils.Filter$FilterAware.filter(java.lang.String)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships`
+ MUST NOW IMPLEMENT: `com.pubnub.api.endpoints.objects_api.utils.Pager$PagingAware.page(com.pubnub.api.models.consumer.PNPage)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships`
+ MUST NOW IMPLEMENT: `com.pubnub.api.endpoints.objects_api.utils.Include$CustomIncludeAware.includeCustom(boolean)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships`
+ MUST NOW IMPLEMENT: `com.pubnub.api.endpoints.objects_api.utils.Limiter$LimitAware.limit(int)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships`
+ MUST NOW IMPLEMENT: `com.pubnub.api.endpoints.objects_api.utils.Sorter$SortingAware.sort(com.pubnub.api.endpoints.objects_api.utils.PNSortKey[])`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships`
+ MUST NOW IMPLEMENT: `com.pubnub.api.endpoints.objects_api.utils.TotalCounter$TotalCountAware.includeTotalCount(boolean)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships`
+ MUST NOW IMPLEMENT: `com.pubnub.api.endpoints.objects_api.utils.Include$ChannelIncludeAware.includeChannel(com.pubnub.api.endpoints.objects_api.utils.Include$PNChannelDetailsLevel)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships`

## com.pubnub.api.endpoints.objects_api.spaces.CreateSpace

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.endpoints.objects_api.spaces.CreateSpace`

## com.pubnub.api.endpoints.objects_api.spaces.DeleteSpace

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.endpoints.objects_api.spaces.DeleteSpace`

## com.pubnub.api.endpoints.objects_api.spaces.GetSpace

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.endpoints.objects_api.spaces.GetSpace`

## com.pubnub.api.endpoints.objects_api.spaces.GetSpaces

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.endpoints.objects_api.spaces.GetSpaces`

## com.pubnub.api.endpoints.objects_api.spaces.UpdateSpace

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.endpoints.objects_api.spaces.UpdateSpace`

## com.pubnub.api.endpoints.objects_api.users.CreateUser

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.endpoints.objects_api.users.CreateUser`

## com.pubnub.api.endpoints.objects_api.users.DeleteUser

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.endpoints.objects_api.users.DeleteUser`

## com.pubnub.api.endpoints.objects_api.users.GetUser

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.endpoints.objects_api.users.GetUser`

## com.pubnub.api.endpoints.objects_api.users.GetUsers

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.endpoints.objects_api.users.GetUsers`

## com.pubnub.api.endpoints.objects_api.users.UpdateUser

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.endpoints.objects_api.users.UpdateUser`

## com.pubnub.api.endpoints.presence.GetState

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.presence.GetState.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.presence.Heartbeat

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.presence.Heartbeat.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `com.pubnub.api.endpoints.presence.Heartbeat.doWork(java.util.Map<java.lang.String,java.lang.String>)`
+ NOW THROWS: `com.pubnub.api.endpoints.presence.Heartbeat.doWork(java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.presence.HereNow

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.presence.HereNow.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.presence.Leave

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.presence.Leave.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.presence.SetState

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.presence.SetState.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.SubscriptionManager,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.presence.WhereNow

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.presence.WhereNow.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.pubsub.Publish

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.pubsub.Publish.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.PublishSequenceManager,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.pubsub.Signal

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.pubsub.Signal.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.pubsub.Subscribe

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.pubsub.Subscribe.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.RetrofitManager)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `com.pubnub.api.endpoints.Endpoint.async(com.pubnub.api.callbacks.PNCallback<Output>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.push.AddChannelsToPush

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.push.AddChannelsToPush.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.push.ListPushProvisions

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.push.ListPushProvisions.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.push.RemoveAllPushChannelsForDevice

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.push.RemoveAllPushChannelsForDevice.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.endpoints.push.RemoveChannelsFromPush

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.endpoints.push.RemoveChannelsFromPush.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.TelemetryManager,com.pubnub.api.managers.RetrofitManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendInclusionParams(java.util.Map<java.lang.String,java.lang.String>,java.lang.Enum[])`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.endpoints.Endpoint.appendLimitParam(java.util.Map<java.lang.String,java.lang.String>,java.lang.Integer)`

## com.pubnub.api.enums.PNOperationType

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.pubnub.api.enums.PNOperationType.PNCreateSpaceOperation`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.pubnub.api.enums.PNOperationType.PNCreateUserOperation`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.pubnub.api.enums.PNOperationType.PNDeleteSpaceOperation`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.pubnub.api.enums.PNOperationType.PNDeleteUserOperation`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.pubnub.api.enums.PNOperationType.PNGetMembers`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.pubnub.api.enums.PNOperationType.PNGetMemberships`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.pubnub.api.enums.PNOperationType.PNGetSpaceOperation`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.pubnub.api.enums.PNOperationType.PNGetSpacesOperation`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.pubnub.api.enums.PNOperationType.PNGetUserOperation`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.pubnub.api.enums.PNOperationType.PNGetUsersOperation`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.pubnub.api.enums.PNOperationType.PNManageMembers`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.pubnub.api.enums.PNOperationType.PNManageMemberships`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.pubnub.api.enums.PNOperationType.PNUpdateSpaceOperation`

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.pubnub.api.enums.PNOperationType.PNUpdateUserOperation`

## com.pubnub.api.enums.PNStatusCategory

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.pubnub.api.enums.PNStatusCategory.PNReconnectionAttemptsExhausted`

## com.pubnub.api.managers.ListenerManager

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.ListenerManager.announce(com.pubnub.api.models.consumer.pubsub.objects.PNMembershipResult)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.ListenerManager.announce(com.pubnub.api.models.consumer.pubsub.objects.PNSpaceResult)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.ListenerManager.announce(com.pubnub.api.models.consumer.pubsub.objects.PNUserResult)`

## com.pubnub.api.managers.MapperManager

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.MapperManager.isValidJsonObject(java.lang.Object)`

## com.pubnub.api.managers.ReconnectionManager

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.ReconnectionManager.startPolling(com.pubnub.api.PNConfiguration)`

## com.pubnub.api.managers.RetrofitManager

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.RetrofitManager.getMemberService()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.RetrofitManager.getMembershipService()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.RetrofitManager.getSpaceService()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.RetrofitManager.getUserService()`

## com.pubnub.api.managers.StateManager

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.managers.StateManager.<init>()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.StateManager.adaptPresenceBuilder(com.pubnub.api.builder.dto.PresenceOperation)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.StateManager.adaptStateBuilder(com.pubnub.api.builder.dto.StateOperation)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.StateManager.adaptSubscribeBuilder(com.pubnub.api.builder.dto.SubscribeOperation)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.StateManager.adaptUnsubscribeBuilder(com.pubnub.api.builder.dto.UnsubscribeOperation)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.StateManager.createStatePayload()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.StateManager.isEmpty()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.StateManager.prepareChannelGroupList(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.StateManager.prepareChannelList(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.StateManager.prepareHeartbeatChannelGroupList(boolean)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.StateManager.prepareHeartbeatChannelList(boolean)`

## com.pubnub.api.managers.SubscriptionManager

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.managers.SubscriptionManager.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.RetrofitManager,com.pubnub.api.managers.TelemetryManager)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.SubscriptionManager.addListener(com.pubnub.api.callbacks.SubscribeCallback)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.SubscriptionManager.getSubscribedChannelGroups()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.SubscriptionManager.getSubscribedChannels()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.SubscriptionManager.removeListener(com.pubnub.api.callbacks.SubscribeCallback)`

## com.pubnub.api.managers.token_manager.PNMatchType

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.managers.token_manager.PNMatchType`

## com.pubnub.api.managers.token_manager.PNResourceType

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.managers.token_manager.PNResourceType`

## com.pubnub.api.managers.token_manager.TokenManager

### METHOD_NO_LONGER_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD (no longer throws checked exception): `com.pubnub.api.managers.token_manager.TokenManager.setToken(java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.token_manager.TokenManager.getToken(com.pubnub.api.managers.token_manager.TokenManagerProperties)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.token_manager.TokenManager.getTokens()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.token_manager.TokenManager.getTokensByResource(com.pubnub.api.managers.token_manager.PNResourceType)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.managers.token_manager.TokenManager.setTokens(java.util.List<java.lang.String>)`

## com.pubnub.api.managers.token_manager.TokenManagerProperties

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.managers.token_manager.TokenManagerProperties`

## com.pubnub.api.managers.token_manager.TokenManagerProperties$TokenManagerPropertiesBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.managers.token_manager.TokenManagerProperties$TokenManagerPropertiesBuilder`

## com.pubnub.api.managers.token_manager.TokenManagerPropertyProvider

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.managers.token_manager.TokenManagerPropertyProvider`

## com.pubnub.api.models.consumer.PNStatus$PNStatusBuilder

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.models.consumer.PNStatus$PNStatusBuilder.executedEndpoint(com.pubnub.api.endpoints.Endpoint)`

## com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.isDeleteEnabled()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.isManageEnabled()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.isReadEnabled()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.isWriteEnabled()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.setDeleteEnabled(boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.setManageEnabled(boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.setReadEnabled(boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.setWriteEnabled(boolean)`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.toString()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.setDeleteEnabled(boolean)`
+ NEW RETURN TYPE: `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.setDeleteEnabled(boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.setManageEnabled(boolean)`
+ NEW RETURN TYPE: `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.setManageEnabled(boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.setReadEnabled(boolean)`
+ NEW RETURN TYPE: `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.setReadEnabled(boolean)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.setWriteEnabled(boolean)`
+ NEW RETURN TYPE: `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.setWriteEnabled(boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.setDeleteEnabled(boolean)`
+ NEW RETURN TYPE: `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.setDeleteEnabled(boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.setManageEnabled(boolean)`
+ NEW RETURN TYPE: `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.setManageEnabled(boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.setReadEnabled(boolean)`
+ NEW RETURN TYPE: `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.setReadEnabled(boolean)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.setWriteEnabled(boolean)`
+ NEW RETURN TYPE: `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData.setWriteEnabled(boolean)`

## com.pubnub.api.models.consumer.access_manager.v3.Channel

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.access_manager.v3.Channel`

## com.pubnub.api.models.consumer.access_manager.v3.Group

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.access_manager.v3.Group`

## com.pubnub.api.models.consumer.access_manager.v3.PNGrantTokenResult

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.models.consumer.access_manager.v3.PNGrantTokenResult.builder()`

## com.pubnub.api.models.consumer.access_manager.v3.PNGrantTokenResult$PNGrantTokenResultBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.access_manager.v3.PNGrantTokenResult$PNGrantTokenResultBuilder`

## com.pubnub.api.models.consumer.access_manager.v3.Space

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.access_manager.v3.Space`

## com.pubnub.api.models.consumer.access_manager.v3.User

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.access_manager.v3.User`

## com.pubnub.api.models.consumer.history.PNFetchMessageItem

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.models.consumer.history.PNFetchMessageItem.setMessage(com.google.gson.JsonElement)`

## com.pubnub.api.models.consumer.history.PNFetchMessageItem$Action

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.models.consumer.history.PNFetchMessageItem$Action.<init>()`

## com.pubnub.api.models.consumer.objects_api.PNObject

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.pubnub.api.models.consumer.objects_api.PNObject.created`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.models.consumer.objects_api.PNObject.getCreated()`

## com.pubnub.api.models.consumer.objects_api.PNPatchPayload

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.PNPatchPayload`

## com.pubnub.api.models.consumer.objects_api.PropertyEnvelope

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.PropertyEnvelope`

## com.pubnub.api.models.consumer.objects_api.member.Member

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.member.Member`

## com.pubnub.api.models.consumer.objects_api.member.PNGetMembersResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.member.PNGetMembersResult`

## com.pubnub.api.models.consumer.objects_api.member.PNManageMembersResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.member.PNManageMembersResult`

## com.pubnub.api.models.consumer.objects_api.member.PNMember

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.member.PNMember`

## com.pubnub.api.models.consumer.objects_api.membership.Membership

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.membership.Membership`

## com.pubnub.api.models.consumer.objects_api.membership.PNGetMembershipsResult

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.models.consumer.objects_api.membership.PNGetMembershipsResult.create()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.models.consumer.objects_api.membership.PNGetMembershipsResult.create(com.pubnub.api.models.server.objects_api.EntityArrayEnvelope<com.pubnub.api.models.consumer.objects_api.membership.PNMembership>)`

## com.pubnub.api.models.consumer.objects_api.membership.PNManageMembershipsResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.membership.PNManageMembershipsResult`

## com.pubnub.api.models.consumer.objects_api.membership.PNMembership

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.models.consumer.objects_api.PNObject.getCreated()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.models.consumer.objects_api.PNObject.getId()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.models.consumer.objects_api.membership.PNMembership.getSpace()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.pubnub.api.models.consumer.objects_api.PNObject.setCustom(java.lang.Object)`
+ NEW RETURN TYPE: `com.pubnub.api.models.consumer.objects_api.membership.PNMembership.setCustom(java.lang.Object)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.pubnub.api.models.consumer.objects_api.PNObject.setCustom(java.lang.Object)`
+ NEW RETURN TYPE: `com.pubnub.api.models.consumer.objects_api.membership.PNMembership.setCustom(java.lang.Object)`

### TYPE_SUPERTYPE_REMOVED [binary ✗ | source ✗]
- TYPE: `com.pubnub.api.models.consumer.objects_api.membership.PNMembership`

## com.pubnub.api.models.consumer.objects_api.space.PNCreateSpaceResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.space.PNCreateSpaceResult`

## com.pubnub.api.models.consumer.objects_api.space.PNCreateSpaceResult$PNCreateSpaceResultBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.space.PNCreateSpaceResult$PNCreateSpaceResultBuilder`

## com.pubnub.api.models.consumer.objects_api.space.PNDeleteSpaceResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.space.PNDeleteSpaceResult`

## com.pubnub.api.models.consumer.objects_api.space.PNDeleteSpaceResult$PNDeleteSpaceResultBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.space.PNDeleteSpaceResult$PNDeleteSpaceResultBuilder`

## com.pubnub.api.models.consumer.objects_api.space.PNGetSpaceResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.space.PNGetSpaceResult`

## com.pubnub.api.models.consumer.objects_api.space.PNGetSpaceResult$PNGetSpaceResultBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.space.PNGetSpaceResult$PNGetSpaceResultBuilder`

## com.pubnub.api.models.consumer.objects_api.space.PNGetSpacesResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.space.PNGetSpacesResult`

## com.pubnub.api.models.consumer.objects_api.space.PNSpace

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.space.PNSpace`

## com.pubnub.api.models.consumer.objects_api.space.PNUpdateSpaceResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.space.PNUpdateSpaceResult`

## com.pubnub.api.models.consumer.objects_api.space.PNUpdateSpaceResult$PNUpdateSpaceResultBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.space.PNUpdateSpaceResult$PNUpdateSpaceResultBuilder`

## com.pubnub.api.models.consumer.objects_api.user.PNCreateUserResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.user.PNCreateUserResult`

## com.pubnub.api.models.consumer.objects_api.user.PNCreateUserResult$PNCreateUserResultBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.user.PNCreateUserResult$PNCreateUserResultBuilder`

## com.pubnub.api.models.consumer.objects_api.user.PNDeleteUserResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.user.PNDeleteUserResult`

## com.pubnub.api.models.consumer.objects_api.user.PNDeleteUserResult$PNDeleteUserResultBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.user.PNDeleteUserResult$PNDeleteUserResultBuilder`

## com.pubnub.api.models.consumer.objects_api.user.PNGetUserResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.user.PNGetUserResult`

## com.pubnub.api.models.consumer.objects_api.user.PNGetUserResult$PNGetUserResultBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.user.PNGetUserResult$PNGetUserResultBuilder`

## com.pubnub.api.models.consumer.objects_api.user.PNGetUsersResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.user.PNGetUsersResult`

## com.pubnub.api.models.consumer.objects_api.user.PNUpdateUserResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.user.PNUpdateUserResult`

## com.pubnub.api.models.consumer.objects_api.user.PNUpdateUserResult$PNUpdateUserResultBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.user.PNUpdateUserResult$PNUpdateUserResultBuilder`

## com.pubnub.api.models.consumer.objects_api.user.PNUser

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.user.PNUser`

## com.pubnub.api.models.consumer.objects_api.util.FilteringParamsProvider

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.util.FilteringParamsProvider`

## com.pubnub.api.models.consumer.objects_api.util.InclusionParamsProvider

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.util.InclusionParamsProvider`

## com.pubnub.api.models.consumer.objects_api.util.ListingParamsProvider

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.util.ListingParamsProvider`

## com.pubnub.api.models.consumer.objects_api.util.MembershipChainProvider

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.objects_api.util.MembershipChainProvider`

## com.pubnub.api.models.consumer.pubsub.objects.ObjectResult

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `com.pubnub.api.models.consumer.pubsub.objects.ObjectResult`

## com.pubnub.api.models.consumer.pubsub.objects.PNMembershipResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.pubsub.objects.PNMembershipResult`

## com.pubnub.api.models.consumer.pubsub.objects.PNMembershipResult$PNMembershipResultBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.pubsub.objects.PNMembershipResult$PNMembershipResultBuilder`

## com.pubnub.api.models.consumer.pubsub.objects.PNSpaceResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.pubsub.objects.PNSpaceResult`

## com.pubnub.api.models.consumer.pubsub.objects.PNSpaceResult$PNSpaceResultBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.pubsub.objects.PNSpaceResult$PNSpaceResultBuilder`

## com.pubnub.api.models.consumer.pubsub.objects.PNUserResult

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.pubsub.objects.PNUserResult`

## com.pubnub.api.models.consumer.pubsub.objects.PNUserResult$PNUserResultBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.models.consumer.pubsub.objects.PNUserResult$PNUserResultBuilder`

## com.pubnub.api.models.server.SubscribeEnvelope

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.models.server.SubscribeEnvelope.<init>()`

## com.pubnub.api.models.server.SubscribeMessage

### CLASS_NOW_ABSTRACT [binary ✗ | source ✗]
- CLASS (now abstract, was concrete): `com.pubnub.api.models.server.SubscribeMessage`

### CLASS_NOW_FINAL [binary ✗ | source ✗]
- CLASS (now final, cannot be extended): `com.pubnub.api.models.server.SubscribeMessage`

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.models.server.SubscribeMessage.<init>()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.models.server.SubscribeMessage.getChannel()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.models.server.SubscribeMessage.getFlags()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.models.server.SubscribeMessage.getIssuingClientId()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.models.server.SubscribeMessage.getOriginationMetadata()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.models.server.SubscribeMessage.getPayload()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.models.server.SubscribeMessage.getPublishMetaData()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.models.server.SubscribeMessage.getShard()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.models.server.SubscribeMessage.getSubscribeKey()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.models.server.SubscribeMessage.getSubscriptionMatch()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.models.server.SubscribeMessage.getType()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.models.server.SubscribeMessage.getUserMetadata()`

### METHOD_NOW_FINAL [binary ✗ | source ✗]
- METHOD (now final, cannot be overridden): `com.pubnub.api.models.server.SubscribeMessage.supportsEncryption()`

## com.pubnub.api.models.server.SubscribeMetadata

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.models.server.SubscribeMetadata.<init>()`

## com.pubnub.api.models.server.access_manager.v3.GrantTokenRequestBody

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.models.server.access_manager.v3.GrantTokenRequestBody.assemble()`

## com.pubnub.api.models.server.access_manager.v3.GrantTokenRequestBody$GrantTokenRequestBodyBuilder

### METHOD_NOW_THROWS_CHECKED_EXCEPTION [binary ✓ | source ✗]
- METHOD: `com.pubnub.api.models.server.access_manager.v3.GrantTokenRequestBody$GrantTokenRequestBodyBuilder.build()`
+ NOW THROWS: `com.pubnub.api.models.server.access_manager.v3.GrantTokenRequestBody$GrantTokenRequestBodyBuilder.build()`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `com.pubnub.api.models.server.access_manager.v3.GrantTokenRequestBody$GrantTokenRequestBodyBuilder.channels(java.util.List<com.pubnub.api.models.consumer.access_manager.v3.Channel>)`

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `com.pubnub.api.models.server.access_manager.v3.GrantTokenRequestBody$GrantTokenRequestBodyBuilder.groups(java.util.List<com.pubnub.api.models.consumer.access_manager.v3.Group>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.models.server.access_manager.v3.GrantTokenRequestBody$GrantTokenRequestBodyBuilder.pubNub(com.pubnub.api.PubNub)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.models.server.access_manager.v3.GrantTokenRequestBody$GrantTokenRequestBodyBuilder.spaces(java.util.List<com.pubnub.api.models.consumer.access_manager.v3.Space>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.models.server.access_manager.v3.GrantTokenRequestBody$GrantTokenRequestBodyBuilder.users(java.util.List<com.pubnub.api.models.consumer.access_manager.v3.User>)`

## com.pubnub.api.services.AccessManagerService

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.pubnub.api.services.AccessManagerService`
+ MUST NOW IMPLEMENT: `com.pubnub.api.services.AccessManagerService.revokeToken(java.lang.String,java.lang.String,java.util.Map<java.lang.String,java.lang.String>)`

## com.pubnub.api.services.MemberService

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.services.MemberService`

## com.pubnub.api.services.MembershipService

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.services.MembershipService`

## com.pubnub.api.services.MessageActionService

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.pubnub.api.services.MessageActionService.getMessageActions(java.lang.String,java.lang.String,java.util.Map<java.lang.String,java.lang.String>)`
+ NEW RETURN TYPE: `com.pubnub.api.services.MessageActionService.getMessageActions(java.lang.String,java.lang.String,java.util.Map<java.lang.String,java.lang.String>)`

## com.pubnub.api.services.PresenceService

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.services.PresenceService.getState(java.lang.String,java.lang.String,java.lang.String,java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.services.PresenceService.globalHereNow(java.lang.String,java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.services.PresenceService.hereNow(java.lang.String,java.lang.String,java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.services.PresenceService.setState(java.lang.String,java.lang.String,java.lang.String,java.util.Map<java.lang.String,java.lang.String>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.services.PresenceService.whereNow(java.lang.String,java.lang.String,java.util.Map<java.lang.String,java.lang.String>)`

## com.pubnub.api.services.SpaceService

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.services.SpaceService`

## com.pubnub.api.services.UserService

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.pubnub.api.services.UserService`

## com.pubnub.api.vendor.Crypto

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.pubnub.api.vendor.Crypto.initCiphers()`

## com.pubnub.api.workers.SubscribeMessageWorker

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.pubnub.api.workers.SubscribeMessageWorker.<init>(com.pubnub.api.PubNub,com.pubnub.api.managers.ListenerManager,java.util.concurrent.LinkedBlockingQueue<com.pubnub.api.models.server.SubscribeMessage>,com.pubnub.api.managers.DuplicationManager)`

