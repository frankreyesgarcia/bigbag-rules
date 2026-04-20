# API Specification: com.pubnub:pubnub-gson 6.3.2

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public class `com.pubnub.api.PNConfiguration`

**Constructors:**
- `public PNConfiguration(com.pubnub.api.UserId p0) throws com.pubnub.api.PubNubException`
- `public PNConfiguration(java.lang.String p0) throws com.pubnub.api.PubNubException`

**Methods:**
- `public java.lang.String getAuthKey()`
- `public okhttp3.CertificatePinner getCertificatePinner()`
- `public java.lang.String getCipherKey()`
- `public int getConnectTimeout()`
- `public okhttp3.ConnectionSpec getConnectionSpec()`
- `public int getFileMessagePublishRetryLimit()`
- `public java.lang.String getFilterExpression()`
- `public int getHeartbeatInterval()`
- `public com.pubnub.api.enums.PNHeartbeatNotificationOptions getHeartbeatNotificationOptions()`
- `public javax.net.ssl.HostnameVerifier getHostnameVerifier()`
- `public okhttp3.logging.HttpLoggingInterceptor getHttpLoggingInterceptor()`
- `public com.pubnub.api.enums.PNLogVerbosity getLogVerbosity()`
- `public java.lang.Integer getMaximumConnections()`
- `public java.lang.Integer getMaximumMessagesCacheSize()`
- `public int getMaximumReconnectionRetries()`
- `public int getNonSubscribeRequestTimeout()`
- `public java.lang.String getOrigin()`
- `public int getPresenceTimeout()`
- `public java.net.Proxy getProxy()`
- `public okhttp3.Authenticator getProxyAuthenticator()`
- `public java.net.ProxySelector getProxySelector()`
- `public java.lang.String getPublishKey()`
- `public com.pubnub.api.enums.PNReconnectionPolicy getReconnectionPolicy()`
- `public java.lang.Integer getRequestMessageCountThreshold()`
- `public java.lang.String getSecretKey()`
- `public javax.net.ssl.SSLSocketFactory getSslSocketFactory()`
- `public java.lang.String getSubscribeKey()`
- `public int getSubscribeTimeout()`
- `public com.pubnub.api.UserId getUserId()`
- `public java.lang.String getUuid()`
- `public javax.net.ssl.X509ExtendedTrustManager getX509ExtendedTrustManager()`
- `public boolean isCacheBusting()`
- `public boolean isDedupOnSubscribe()`
- `public boolean isGoogleAppEngineNetworking()`
- `public boolean isIncludeInstanceIdentifier()`
- `public boolean isIncludeRequestIdentifier()`
- `public boolean isManagePresenceListManually()`
- `public boolean isSecure()`
- `public boolean isStartSubscriberThread()`
- `public boolean isSuppressLeaveEvents()`
- `public boolean isUseRandomInitializationVector()`
- `public com.pubnub.api.PNConfiguration setAuthKey(java.lang.String p0)`
- `public com.pubnub.api.PNConfiguration setCacheBusting(boolean p0)`
- `public com.pubnub.api.PNConfiguration setCertificatePinner(okhttp3.CertificatePinner p0)`
- `public com.pubnub.api.PNConfiguration setCipherKey(java.lang.String p0)`
- `public com.pubnub.api.PNConfiguration setConnectTimeout(int p0)`
- `public com.pubnub.api.PNConfiguration setConnectionSpec(okhttp3.ConnectionSpec p0)`
- `public com.pubnub.api.PNConfiguration setDedupOnSubscribe(boolean p0)`
- `public com.pubnub.api.PNConfiguration setFileMessagePublishRetryLimit(int p0)`
- `public com.pubnub.api.PNConfiguration setFilterExpression(java.lang.String p0)`
- `public com.pubnub.api.PNConfiguration setGoogleAppEngineNetworking(boolean p0)`
- `public com.pubnub.api.PNConfiguration setHeartbeatNotificationOptions(com.pubnub.api.enums.PNHeartbeatNotificationOptions p0)`
- `public com.pubnub.api.PNConfiguration setHostnameVerifier(javax.net.ssl.HostnameVerifier p0)`
- `public com.pubnub.api.PNConfiguration setHttpLoggingInterceptor(okhttp3.logging.HttpLoggingInterceptor p0)`
- `public com.pubnub.api.PNConfiguration setIncludeInstanceIdentifier(boolean p0)`
- `public com.pubnub.api.PNConfiguration setIncludeRequestIdentifier(boolean p0)`
- `public com.pubnub.api.PNConfiguration setLogVerbosity(com.pubnub.api.enums.PNLogVerbosity p0)`
- `public com.pubnub.api.PNConfiguration setManagePresenceListManually(boolean p0)`
- `public com.pubnub.api.PNConfiguration setMaximumConnections(java.lang.Integer p0)`
- `public com.pubnub.api.PNConfiguration setMaximumMessagesCacheSize(java.lang.Integer p0)`
- `public com.pubnub.api.PNConfiguration setMaximumReconnectionRetries(int p0)`
- `public com.pubnub.api.PNConfiguration setNonSubscribeRequestTimeout(int p0)`
- `public com.pubnub.api.PNConfiguration setOrigin(java.lang.String p0)`
- `public com.pubnub.api.PNConfiguration setPresenceTimeout(int p0)`
- `public com.pubnub.api.PNConfiguration setPresenceTimeoutWithCustomInterval(int p0, int p1)`
- `public com.pubnub.api.PNConfiguration setProxy(java.net.Proxy p0)`
- `public com.pubnub.api.PNConfiguration setProxyAuthenticator(okhttp3.Authenticator p0)`
- `public com.pubnub.api.PNConfiguration setProxySelector(java.net.ProxySelector p0)`
- `public com.pubnub.api.PNConfiguration setPublishKey(java.lang.String p0)`
- `public com.pubnub.api.PNConfiguration setReconnectionPolicy(com.pubnub.api.enums.PNReconnectionPolicy p0)`
- `public com.pubnub.api.PNConfiguration setRequestMessageCountThreshold(java.lang.Integer p0)`
- `public com.pubnub.api.PNConfiguration setSecretKey(java.lang.String p0)`
- `public com.pubnub.api.PNConfiguration setSecure(boolean p0)`
- `public com.pubnub.api.PNConfiguration setSslSocketFactory(javax.net.ssl.SSLSocketFactory p0)`
- `public com.pubnub.api.PNConfiguration setStartSubscriberThread(boolean p0)`
- `public com.pubnub.api.PNConfiguration setSubscribeKey(java.lang.String p0)`
- `public com.pubnub.api.PNConfiguration setSubscribeTimeout(int p0)`
- `public com.pubnub.api.PNConfiguration setSuppressLeaveEvents(boolean p0)`
- `public com.pubnub.api.PNConfiguration setUseRandomInitializationVector(boolean p0)`
- `public void setUserId(com.pubnub.api.UserId p0)`
- `public void setUuid(java.lang.String p0)`
- `public com.pubnub.api.PNConfiguration setX509ExtendedTrustManager(javax.net.ssl.X509ExtendedTrustManager p0)`

---

## public class `com.pubnub.api.PubNub`

**Constructors:**
- `public PubNub(com.pubnub.api.PNConfiguration p0)`

**Methods:**
- `public com.pubnub.api.endpoints.channel_groups.AddChannelChannelGroup addChannelsToChannelGroup()`
- `public void addListener(com.pubnub.api.callbacks.SubscribeCallback p0)`
- `public com.pubnub.api.endpoints.message_actions.AddMessageAction addMessageAction()`
- `public com.pubnub.api.endpoints.push.AddChannelsToPush addPushNotificationsOnChannels()`
- `public com.pubnub.api.endpoints.push.ListPushProvisions auditPushChannelProvisions()`
- `public java.lang.String decrypt(java.lang.String p0) throws com.pubnub.api.PubNubException`
- `public java.lang.String decrypt(java.lang.String p0, java.lang.String p1) throws com.pubnub.api.PubNubException`
- `public java.io.InputStream decryptInputStream(java.io.InputStream p0) throws com.pubnub.api.PubNubException`
- `public java.io.InputStream decryptInputStream(java.io.InputStream p0, java.lang.String p1) throws com.pubnub.api.PubNubException`
- `public com.pubnub.api.endpoints.channel_groups.DeleteChannelGroup deleteChannelGroup()`
- `public com.pubnub.api.endpoints.files.DeleteFile$Builder deleteFile()`
- `public com.pubnub.api.endpoints.DeleteMessages deleteMessages()`
- `public void destroy()`
- `public void disconnect()`
- `public com.pubnub.api.endpoints.files.DownloadFile$Builder downloadFile()`
- `public java.lang.String encrypt(java.lang.String p0) throws com.pubnub.api.PubNubException`
- `public java.lang.String encrypt(java.lang.String p0, java.lang.String p1) throws com.pubnub.api.PubNubException`
- `public java.io.InputStream encryptInputStream(java.io.InputStream p0) throws com.pubnub.api.PubNubException`
- `public java.io.InputStream encryptInputStream(java.io.InputStream p0, java.lang.String p1) throws com.pubnub.api.PubNubException`
- `public com.pubnub.api.endpoints.FetchMessages fetchMessages()`
- `public com.pubnub.api.endpoints.pubsub.Publish fire()`
- `public void forceDestroy()`
- `public static java.lang.String generateUUID()`
- `public com.pubnub.api.endpoints.objects_api.channel.GetAllChannelsMetadata getAllChannelsMetadata()`
- `public com.pubnub.api.endpoints.objects_api.uuid.GetAllUUIDMetadata getAllUUIDMetadata()`
- `public java.lang.String getBaseUrl()`
- `public com.pubnub.api.endpoints.objects_api.members.GetChannelMembers$Builder getChannelMembers()`
- `public com.pubnub.api.endpoints.objects_api.channel.GetChannelMetadata$Builder getChannelMetadata()`
- `public com.pubnub.api.PNConfiguration getConfiguration()`
- `public com.pubnub.api.endpoints.files.GetFileUrl$Builder getFileUrl()`
- `public java.lang.String getInstanceId()`
- `public com.pubnub.api.managers.MapperManager getMapper()`
- `public com.pubnub.api.endpoints.objects_api.memberships.GetMemberships getMemberships()`
- `public com.pubnub.api.endpoints.message_actions.GetMessageActions getMessageActions()`
- `public com.pubnub.api.endpoints.presence.GetState getPresenceState()`
- `public java.lang.String getRequestId()`
- `public java.util.List getSubscribedChannelGroups()`
- `public java.util.List getSubscribedChannels()`
- `public int getTimestamp()`
- `public com.pubnub.api.endpoints.objects_api.uuid.GetUUIDMetadata getUUIDMetadata()`
- `public java.lang.String getVersion()`
- `public com.pubnub.api.endpoints.access.Grant grant()`
- `public com.pubnub.api.endpoints.access.builder.GrantTokenBuilder grantToken()`
- `public com.pubnub.api.endpoints.access.builder.GrantTokenBuilder grantToken(java.lang.Integer p0)`
- `public com.pubnub.api.endpoints.presence.HereNow hereNow()`
- `public com.pubnub.api.endpoints.History history()`
- `public com.pubnub.api.endpoints.channel_groups.ListAllChannelGroup listAllChannelGroups()`
- `public com.pubnub.api.endpoints.channel_groups.AllChannelsChannelGroup listChannelsForChannelGroup()`
- `public com.pubnub.api.endpoints.files.ListFiles$Builder listFiles()`
- `public com.pubnub.api.endpoints.objects_api.members.ManageChannelMembers$Builder manageChannelMembers()`
- `public com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships$Builder manageMemberships()`
- `public com.pubnub.api.endpoints.MessageCounts messageCounts()`
- `public com.pubnub.api.models.consumer.access_manager.v3.PNToken parseToken(java.lang.String p0) throws com.pubnub.api.PubNubException`
- `public com.pubnub.api.builder.PresenceBuilder presence()`
- `public com.pubnub.api.endpoints.pubsub.Publish publish()`
- `public com.pubnub.api.endpoints.files.PublishFileMessage$Builder publishFileMessage()`
- `public void reconnect()`
- `public com.pubnub.api.endpoints.push.RemoveAllPushChannelsForDevice removeAllPushNotificationsFromDeviceWithPushToken()`
- `public com.pubnub.api.endpoints.objects_api.members.RemoveChannelMembers$Builder removeChannelMembers()`
- `public com.pubnub.api.endpoints.objects_api.channel.RemoveChannelMetadata$Builder removeChannelMetadata()`
- `public com.pubnub.api.endpoints.channel_groups.RemoveChannelChannelGroup removeChannelsFromChannelGroup()`
- `public void removeListener(com.pubnub.api.callbacks.SubscribeCallback p0)`
- `public com.pubnub.api.endpoints.objects_api.memberships.RemoveMemberships$Builder removeMemberships()`
- `public com.pubnub.api.endpoints.message_actions.RemoveMessageAction removeMessageAction()`
- `public com.pubnub.api.endpoints.push.RemoveChannelsFromPush removePushNotificationsFromChannels()`
- `public com.pubnub.api.endpoints.objects_api.uuid.RemoveUUIDMetadata removeUUIDMetadata()`
- `public com.pubnub.api.endpoints.access.RevokeToken revokeToken()`
- `public com.pubnub.api.endpoints.files.SendFile$Builder sendFile()`
- `public com.pubnub.api.endpoints.objects_api.members.SetChannelMembers$Builder setChannelMembers()`
- `public com.pubnub.api.endpoints.objects_api.channel.SetChannelMetadata$Builder setChannelMetadata()`
- `public com.pubnub.api.endpoints.objects_api.memberships.SetMemberships$Builder setMemberships()`
- `public com.pubnub.api.endpoints.presence.SetState setPresenceState()`
- `public void setToken(java.lang.String p0)`
- `public com.pubnub.api.endpoints.objects_api.uuid.SetUUIDMetadata setUUIDMetadata()`
- `public com.pubnub.api.endpoints.pubsub.Signal signal()`
- `public void stop()`
- `public com.pubnub.api.builder.SubscribeBuilder subscribe()`
- `public com.pubnub.api.endpoints.Time time()`
- `public com.pubnub.api.builder.UnsubscribeBuilder unsubscribe()`
- `public void unsubscribeAll()`
- `public com.pubnub.api.endpoints.presence.WhereNow whereNow()`

---

## public class `com.pubnub.api.PubNubError`

**Methods:**
- `public static com.pubnub.api.PubNubError$PubNubErrorBuilder builder()`
- `public int getErrorCode()`
- `public int getErrorCodeExtended()`
- `public com.google.gson.JsonElement getErrorObject()`
- `public java.lang.String getErrorString()`
- `public java.lang.String getMessage()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.PubNubError$PubNubErrorBuilder`

**Methods:**
- `public com.pubnub.api.PubNubError build()`
- `public com.pubnub.api.PubNubError$PubNubErrorBuilder errorCode(int p0)`
- `public com.pubnub.api.PubNubError$PubNubErrorBuilder errorCodeExtended(int p0)`
- `public com.pubnub.api.PubNubError$PubNubErrorBuilder errorObject(com.google.gson.JsonElement p0)`
- `public com.pubnub.api.PubNubError$PubNubErrorBuilder errorString(java.lang.String p0)`
- `public com.pubnub.api.PubNubError$PubNubErrorBuilder message(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.PubNubException`
extends `java.lang.Exception`  

**Constructors:**
- `public PubNubException(java.lang.String p0, com.pubnub.api.PubNubError p1, com.google.gson.JsonElement p2, java.lang.String p3, int p4, retrofit2.Call p5, java.lang.Throwable p6)`

**Methods:**
- `public static com.pubnub.api.PubNubException$PubNubExceptionBuilder builder()`
- `public java.lang.Throwable getCause()`
- `public java.lang.String getErrormsg()`
- `public com.google.gson.JsonElement getJso()`
- `public java.lang.String getMessage()`
- `public com.pubnub.api.PubNubError getPubnubError()`
- `public java.lang.String getResponse()`
- `public int getStatusCode()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.PubNubException$PubNubExceptionBuilder`

**Methods:**
- `public com.pubnub.api.PubNubException$PubNubExceptionBuilder affectedCall(retrofit2.Call p0)`
- `public com.pubnub.api.PubNubException build()`
- `public com.pubnub.api.PubNubException$PubNubExceptionBuilder cause(java.lang.Throwable p0)`
- `public com.pubnub.api.PubNubException$PubNubExceptionBuilder errormsg(java.lang.String p0)`
- `public com.pubnub.api.PubNubException$PubNubExceptionBuilder jso(com.google.gson.JsonElement p0)`
- `public com.pubnub.api.PubNubException$PubNubExceptionBuilder pubnubError(com.pubnub.api.PubNubError p0)`
- `public com.pubnub.api.PubNubException$PubNubExceptionBuilder response(java.lang.String p0)`
- `public com.pubnub.api.PubNubException$PubNubExceptionBuilder statusCode(int p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.PubNubRuntimeException`
extends `java.lang.RuntimeException`  

**Constructors:**
- `public PubNubRuntimeException(java.lang.String p0, com.pubnub.api.PubNubError p1, com.google.gson.JsonElement p2, java.lang.String p3, int p4, retrofit2.Call p5, java.lang.Throwable p6)`

**Methods:**
- `public static com.pubnub.api.PubNubRuntimeException$PubNubRuntimeExceptionBuilder builder()`
- `public java.lang.Throwable getCause()`
- `public java.lang.String getErrormsg()`
- `public com.google.gson.JsonElement getJso()`
- `public java.lang.String getMessage()`
- `public com.pubnub.api.PubNubError getPubnubError()`
- `public java.lang.String getResponse()`
- `public int getStatusCode()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.PubNubRuntimeException$PubNubRuntimeExceptionBuilder`

**Methods:**
- `public com.pubnub.api.PubNubRuntimeException$PubNubRuntimeExceptionBuilder affectedCall(retrofit2.Call p0)`
- `public com.pubnub.api.PubNubRuntimeException build()`
- `public com.pubnub.api.PubNubRuntimeException$PubNubRuntimeExceptionBuilder cause(java.lang.Throwable p0)`
- `public com.pubnub.api.PubNubRuntimeException$PubNubRuntimeExceptionBuilder errormsg(java.lang.String p0)`
- `public com.pubnub.api.PubNubRuntimeException$PubNubRuntimeExceptionBuilder jso(com.google.gson.JsonElement p0)`
- `public com.pubnub.api.PubNubRuntimeException$PubNubRuntimeExceptionBuilder pubnubError(com.pubnub.api.PubNubError p0)`
- `public com.pubnub.api.PubNubRuntimeException$PubNubRuntimeExceptionBuilder response(java.lang.String p0)`
- `public com.pubnub.api.PubNubRuntimeException$PubNubRuntimeExceptionBuilder statusCode(int p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.PubNubUtil`

**Fields:**
- `public final static java.lang.String AUTH_QUERY_PARAM_NAME`
- `public final static java.lang.String SIGNATURE_QUERY_PARAM_NAME`
- `public final static java.lang.String TIMESTAMP_QUERY_PARAM_NAME`

**Methods:**
- `public static java.lang.String generateSignature(com.pubnub.api.PNConfiguration p0, java.lang.String p1, java.util.Map p2, java.lang.String p3, java.lang.String p4, int p5)`
- `public static <T extends java.lang.Object> boolean isNullOrEmpty(java.util.Collection p0)`
- `public static java.lang.String joinLong(java.util.List p0, java.lang.String p1)`
- `public static java.lang.String joinString(java.util.List p0, java.lang.String p1)`
- `public static java.lang.String pamEncode(java.lang.String p0)`
- `public static java.lang.String preparePamArguments(java.util.Map p0)`
- `public static byte[] readBytes(java.io.InputStream p0) throws java.io.IOException`
- `public static java.lang.String removeTrailingEqualSigns(java.lang.String p0)`
- `public static java.lang.String replaceLast(java.lang.String p0, java.lang.String p1, java.lang.String p2)`
- `public static void require(boolean p0, com.pubnub.api.PubNubError p1)`
- `public static boolean shouldSignRequest(com.pubnub.api.PNConfiguration p0)`
- `public static okhttp3.Request signRequest(okhttp3.Request p0, com.pubnub.api.PNConfiguration p1, int p2)`
- `public static java.lang.String signSHA256(java.lang.String p0, java.lang.String p1) throws com.pubnub.api.PubNubException, java.io.UnsupportedEncodingException`
- `public static java.lang.String urlDecode(java.lang.String p0)`
- `public static java.lang.String urlEncode(java.lang.String p0)`

---

## public class `com.pubnub.api.SpaceId`

**Constructors:**
- `public SpaceId(java.lang.String p0)`

**Methods:**
- `public java.lang.String getValue()`

---

## public class `com.pubnub.api.UserId`

**Constructors:**
- `public UserId(java.lang.String p0)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getValue()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.builder.PresenceBuilder`
extends `com.pubnub.api.builder.PubSubBuilder`  

**Constructors:**
- `public PresenceBuilder(com.pubnub.api.managers.SubscriptionManager p0)`

**Methods:**
- `public com.pubnub.api.builder.PresenceBuilder channelGroups(java.util.List p0)`
- `public com.pubnub.api.builder.PresenceBuilder channels(java.util.List p0)`
- `public com.pubnub.api.builder.PresenceBuilder connected(boolean p0)`
- `public void execute()`

---

## public final class `com.pubnub.api.builder.PubNubErrorBuilder`

**Fields:**
- `public final static com.pubnub.api.PubNubError PNERROBJ_5023_INTERNAL_ERROR`
- `public final static com.pubnub.api.PubNubError PNERROBJ_5075_NETWORK_ERROR`
- `public final static com.pubnub.api.PubNubError PNERROBJ_AUTH_KEYS_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_BAD_GATEWAY`
- `public final static com.pubnub.api.PubNubError PNERROBJ_BAD_REQUEST`
- `public final static com.pubnub.api.PubNubError PNERROBJ_CHANNELS_TIMETOKEN_MISMATCH`
- `public final static com.pubnub.api.PubNubError PNERROBJ_CHANNEL_AND_GROUP_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_CHANNEL_GROUP_PARSING_ERROR`
- `public final static com.pubnub.api.PubNubError PNERROBJ_CHANNEL_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_CLIENT_TIMEOUT`
- `public final static com.pubnub.api.PubNubError PNERROBJ_CONNECTION_NOT_SET`
- `public final static com.pubnub.api.PubNubError PNERROBJ_CONNECT_EXCEPTION`
- `public final static com.pubnub.api.PubNubError PNERROBJ_CRYPTO_ERROR`
- `public final static com.pubnub.api.PubNubError PNERROBJ_DECRYPTION_ERROR`
- `public final static com.pubnub.api.PubNubError PNERROBJ_DEVICE_ID_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_DISCONNECT`
- `public final static com.pubnub.api.PubNubError PNERROBJ_DISCONN_AND_RESUB`
- `public final static com.pubnub.api.PubNubError PNERROBJ_ENCRYPTION_ERROR`
- `public final static com.pubnub.api.PubNubError PNERROBJ_FORBIDDEN`
- `public final static com.pubnub.api.PubNubError PNERROBJ_GATEWAY_TIMEOUT`
- `public final static com.pubnub.api.PubNubError PNERROBJ_GETINPUTSTREAM`
- `public final static com.pubnub.api.PubNubError PNERROBJ_GROUP_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_HISTORY_MESSAGE_ACTIONS_MULTIPLE_CHANNELS`
- `public final static com.pubnub.api.PubNubError PNERROBJ_HTTP_ERROR`
- `public final static com.pubnub.api.PubNubError PNERROBJ_HTTP_RC_ERROR`
- `public final static com.pubnub.api.PubNubError PNERROBJ_INTERNAL_ERROR`
- `public final static com.pubnub.api.PubNubError PNERROBJ_INVALID_ACCESS_TOKEN`
- `public final static com.pubnub.api.PubNubError PNERROBJ_INVALID_ARGUMENTS`
- `public final static com.pubnub.api.PubNubError PNERROBJ_INVALID_JSON`
- `public final static com.pubnub.api.PubNubError PNERROBJ_INVALID_META`
- `public final static com.pubnub.api.PubNubError PNERROBJ_JSON_ERROR`
- `public final static com.pubnub.api.PubNubError PNERROBJ_MALFORMED_URL`
- `public final static com.pubnub.api.PubNubError PNERROBJ_MESSAGE_ACTION_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_MESSAGE_ACTION_TIMETOKEN_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_MESSAGE_ACTION_TYPE_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_MESSAGE_ACTION_VALUE_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_MESSAGE_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_MESSAGE_TIMETOKEN_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_NOT_FOUND_ERROR`
- `public final static com.pubnub.api.PubNubError PNERROBJ_PAGINATION_NEXT_OUT_OF_BOUNDS`
- `public final static com.pubnub.api.PubNubError PNERROBJ_PAGINATION_PREV_OUT_OF_BOUNDS`
- `public final static com.pubnub.api.PubNubError PNERROBJ_PARSING_ERROR`
- `public final static com.pubnub.api.PubNubError PNERROBJ_PAYLOAD_TOO_LARGE`
- `public final static com.pubnub.api.PubNubError PNERROBJ_PERMISSION_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_PROTOCOL_EXCEPTION`
- `public final static com.pubnub.api.PubNubError PNERROBJ_PUBLISH_KEY_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_PUBNUB_ERROR`
- `public final static com.pubnub.api.PubNubError PNERROBJ_PUBNUB_EXCEPTION`
- `public final static com.pubnub.api.PubNubError PNERROBJ_PUSH_TOPIC_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_PUSH_TYPE_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_READINPUT`
- `public final static com.pubnub.api.PubNubError PNERROBJ_RESOURCES_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_SECRET_KEY_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_SOCKET_TIMEOUT`
- `public final static com.pubnub.api.PubNubError PNERROBJ_SPACEID_NULL_OR_EMPTY`
- `public final static com.pubnub.api.PubNubError PNERROBJ_SPACE_ID_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_SPACE_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_SPACE_NAME_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_STATE_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_SUBSCRIBE_KEY_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_TIMEOUT`
- `public final static com.pubnub.api.PubNubError PNERROBJ_TIMETOKEN_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_TOKEN_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_TTL_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_ULSSIGN_ERROR`
- `public final static com.pubnub.api.PubNubError PNERROBJ_UNAUTHORIZED`
- `public final static com.pubnub.api.PubNubError PNERROBJ_URL_OPEN`
- `public final static com.pubnub.api.PubNubError PNERROBJ_USERID_NULL_OR_EMPTY`
- `public final static com.pubnub.api.PubNubError PNERROBJ_USER_ID_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_USER_NAME_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_UUID_MISSING`
- `public final static com.pubnub.api.PubNubError PNERROBJ_UUID_NULL_OR_EMPTY`
- `public final static int PNERR_AUTH_KEYS_MISSING`
- `public final static int PNERR_BAD_GATEWAY`
- `public final static int PNERR_BAD_REQUEST`
- `public final static int PNERR_CHANNELS_TIMETOKEN_MISMATCH`
- `public final static int PNERR_CHANNEL_AND_GROUP_MISSING`
- `public final static int PNERR_CHANNEL_GROUP_PARSING_ERROR`
- `public final static int PNERR_CHANNEL_MISSING`
- `public final static int PNERR_CLIENT_TIMEOUT`
- `public final static int PNERR_CONNECTION_NOT_SET`
- `public final static int PNERR_CONNECT_EXCEPTION`
- `public final static int PNERR_CRYPTO_ERROR`
- `public final static int PNERR_DECRYPTION_ERROR`
- `public final static int PNERR_DEVICE_ID_MISSING`
- `public final static int PNERR_DISCONNECT`
- `public final static int PNERR_DISCONN_AND_RESUB`
- `public final static int PNERR_ENCRYPTION_ERROR`
- `public final static int PNERR_FORBIDDEN`
- `public final static int PNERR_GATEWAY_TIMEOUT`
- `public final static int PNERR_GETINPUTSTREAM`
- `public final static int PNERR_GROUP_MISSING`
- `public final static int PNERR_HISTORY_MESSAGE_ACTIONS_MULTIPLE_CHANNELS`
- `public final static int PNERR_HTTP_ERROR`
- `public final static int PNERR_HTTP_RC_ERROR`
- `public final static int PNERR_HTTP_SOCKET_TIMEOUT`
- `public final static int PNERR_INTERNAL_ERROR`
- `public final static int PNERR_INVALID_ACCESS_TOKEN`
- `public final static int PNERR_INVALID_ARGUMENTS`
- `public final static int PNERR_INVALID_JSON`
- `public final static int PNERR_INVALID_META`
- `public final static int PNERR_JSON_ERROR`
- `public final static int PNERR_MALFORMED_URL`
- `public final static int PNERR_MESSAGE_ACTION_MISSING`
- `public final static int PNERR_MESSAGE_ACTION_TIMETOKEN_MISSING`
- `public final static int PNERR_MESSAGE_ACTION_TYPE_MISSING`
- `public final static int PNERR_MESSAGE_ACTION_VALUE_MISSING`
- `public final static int PNERR_MESSAGE_MISSING`
- `public final static int PNERR_MESSAGE_TIMETOKEN_MISSING`
- `public final static int PNERR_NETWORK_ERROR`
- `public final static int PNERR_NOT_FOUND`
- `public final static int PNERR_PAGINATION_NEXT_OUT_OF_BOUNDS`
- `public final static int PNERR_PAGINATION_PREV_OUT_OF_BOUNDS`
- `public final static int PNERR_PARSING_ERROR`
- `public final static int PNERR_PAYLOAD_TOO_LARGE`
- `public final static int PNERR_PERMISSION_MISSING`
- `public final static int PNERR_PROTOCOL_EXCEPTION`
- `public final static int PNERR_PUBLISH_KEY_MISSING`
- `public final static int PNERR_PUBNUB_ERROR`
- `public final static int PNERR_PUBNUB_EXCEPTION`
- `public final static int PNERR_PUSH_TOPIC_MISSING`
- `public final static int PNERR_PUSH_TYPE_MISSING`
- `public final static int PNERR_READINPUT`
- `public final static int PNERR_RESOURCES_MISSING`
- `public final static int PNERR_SECRET_KEY_MISSING`
- `public final static int PNERR_SPACEID_NULL_OR_EMPTY`
- `public final static int PNERR_SPACE_ID_MISSING`
- `public final static int PNERR_SPACE_MISSING`
- `public final static int PNERR_SPACE_NAME_MISSING`
- `public final static int PNERR_STATE_MISSING`
- `public final static int PNERR_SUBSCRIBE_KEY_MISSING`
- `public final static int PNERR_TIMEOUT`
- `public final static int PNERR_TIMETOKEN_MISSING`
- `public final static int PNERR_TOKEN_MISSING`
- `public final static int PNERR_TTL_MISSING`
- `public final static int PNERR_ULSSIGN_ERROR`
- `public final static int PNERR_UNAUTHORIZED`
- `public final static int PNERR_URL_OPEN`
- `public final static int PNERR_USERID_NULL_OR_EMPTY`
- `public final static int PNERR_USER_ID_MISSING`
- `public final static int PNERR_USER_NAME_MISSING`
- `public final static int PNERR_UUID_MISSING`
- `public final static int PNERR_UUID_NULL_OR_EMPTY`

**Methods:**
- `public static com.pubnub.api.PubNubError createCryptoError(int p0, java.lang.String p1)`

---

## public abstract class `com.pubnub.api.builder.PubSubBuilder`

**Constructors:**
- `public PubSubBuilder(com.pubnub.api.managers.SubscriptionManager p0)`

**Methods:**
- `public com.pubnub.api.builder.PubSubBuilder channelGroups(java.util.List p0)`
- `public com.pubnub.api.builder.PubSubBuilder channels(java.util.List p0)`
- `public abstract void execute()`
- `protected java.util.List getChannelGroupSubscriptions()`
- `protected java.util.List getChannelSubscriptions()`
- `protected com.pubnub.api.managers.SubscriptionManager getSubscriptionManager()`
- `protected void setChannelGroupSubscriptions(java.util.List p0)`
- `protected void setChannelSubscriptions(java.util.List p0)`
- `protected void setSubscriptionManager(com.pubnub.api.managers.SubscriptionManager p0)`

---

## public class `com.pubnub.api.builder.SubscribeBuilder`
extends `com.pubnub.api.builder.PubSubBuilder`  

**Constructors:**
- `public SubscribeBuilder(com.pubnub.api.managers.SubscriptionManager p0)`

**Methods:**
- `public com.pubnub.api.builder.SubscribeBuilder channelGroups(java.util.List p0)`
- `public com.pubnub.api.builder.SubscribeBuilder channels(java.util.List p0)`
- `public void execute()`
- `public com.pubnub.api.builder.SubscribeBuilder withPresence()`
- `public com.pubnub.api.builder.SubscribeBuilder withTimetoken(java.lang.Long p0)`

---

## public class `com.pubnub.api.builder.UnsubscribeBuilder`
extends `com.pubnub.api.builder.PubSubBuilder`  

**Constructors:**
- `public UnsubscribeBuilder(com.pubnub.api.managers.SubscriptionManager p0)`

**Methods:**
- `public void execute()`

---

## public class `com.pubnub.api.builder.dto.ChangeTemporaryUnavailableOperation`
implements `com.pubnub.api.builder.dto.PubSubOperation`  

**Methods:**
- `public static com.pubnub.api.builder.dto.ChangeTemporaryUnavailableOperation$ChangeTemporaryUnavailableOperationBuilder builder()`
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.List getAvailableChannelGroups()`
- `public java.util.List getAvailableChannels()`
- `public java.util.List getUnavailableChannelGroups()`
- `public java.util.List getUnavailableChannels()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.builder.dto.ChangeTemporaryUnavailableOperation$ChangeTemporaryUnavailableOperationBuilder`

**Methods:**
- `public com.pubnub.api.builder.dto.ChangeTemporaryUnavailableOperation$ChangeTemporaryUnavailableOperationBuilder availableChannel(java.lang.String p0)`
- `public com.pubnub.api.builder.dto.ChangeTemporaryUnavailableOperation$ChangeTemporaryUnavailableOperationBuilder availableChannelGroup(java.lang.String p0)`
- `public com.pubnub.api.builder.dto.ChangeTemporaryUnavailableOperation$ChangeTemporaryUnavailableOperationBuilder availableChannelGroups(java.util.Collection p0)`
- `public com.pubnub.api.builder.dto.ChangeTemporaryUnavailableOperation$ChangeTemporaryUnavailableOperationBuilder availableChannels(java.util.Collection p0)`
- `public com.pubnub.api.builder.dto.ChangeTemporaryUnavailableOperation build()`
- `public com.pubnub.api.builder.dto.ChangeTemporaryUnavailableOperation$ChangeTemporaryUnavailableOperationBuilder clearAvailableChannelGroups()`
- `public com.pubnub.api.builder.dto.ChangeTemporaryUnavailableOperation$ChangeTemporaryUnavailableOperationBuilder clearAvailableChannels()`
- `public com.pubnub.api.builder.dto.ChangeTemporaryUnavailableOperation$ChangeTemporaryUnavailableOperationBuilder clearUnavailableChannelGroups()`
- `public com.pubnub.api.builder.dto.ChangeTemporaryUnavailableOperation$ChangeTemporaryUnavailableOperationBuilder clearUnavailableChannels()`
- `public java.lang.String toString()`
- `public com.pubnub.api.builder.dto.ChangeTemporaryUnavailableOperation$ChangeTemporaryUnavailableOperationBuilder unavailableChannel(java.lang.String p0)`
- `public com.pubnub.api.builder.dto.ChangeTemporaryUnavailableOperation$ChangeTemporaryUnavailableOperationBuilder unavailableChannelGroup(java.lang.String p0)`
- `public com.pubnub.api.builder.dto.ChangeTemporaryUnavailableOperation$ChangeTemporaryUnavailableOperationBuilder unavailableChannelGroups(java.util.Collection p0)`
- `public com.pubnub.api.builder.dto.ChangeTemporaryUnavailableOperation$ChangeTemporaryUnavailableOperationBuilder unavailableChannels(java.util.Collection p0)`

---

## public class `com.pubnub.api.builder.dto.PresenceOperation`
implements `com.pubnub.api.builder.dto.PubSubOperation`  

**Methods:**
- `public static com.pubnub.api.builder.dto.PresenceOperation$PresenceOperationBuilder builder()`
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.List getChannelGroups()`
- `public java.util.List getChannels()`
- `public int hashCode()`
- `public boolean isConnected()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.builder.dto.PresenceOperation$PresenceOperationBuilder`

**Methods:**
- `public com.pubnub.api.builder.dto.PresenceOperation build()`
- `public com.pubnub.api.builder.dto.PresenceOperation$PresenceOperationBuilder channelGroups(java.util.List p0)`
- `public com.pubnub.api.builder.dto.PresenceOperation$PresenceOperationBuilder channels(java.util.List p0)`
- `public com.pubnub.api.builder.dto.PresenceOperation$PresenceOperationBuilder connected(boolean p0)`
- `public java.lang.String toString()`

---

## public abstract interface `com.pubnub.api.builder.dto.PubSubOperation`

**Fields:**
- `public final static com.pubnub.api.builder.dto.PubSubOperation DISCONNECT`
- `public final static com.pubnub.api.builder.dto.PubSubOperation NO_OP`
- `public final static com.pubnub.api.builder.dto.PubSubOperation RECONNECT`
- `public final static com.pubnub.api.builder.dto.PubSubOperation STATUS_ANNOUNCED`

---

## public static class `com.pubnub.api.builder.dto.PubSubOperation$ConnectedStatusAnnouncedOperation`
implements `com.pubnub.api.builder.dto.PubSubOperation`  

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.builder.dto.PubSubOperation$DisconnectOperation`
implements `com.pubnub.api.builder.dto.PubSubOperation`  

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.builder.dto.PubSubOperation$NoOpOperation`
implements `com.pubnub.api.builder.dto.PubSubOperation`  

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.builder.dto.PubSubOperation$ReconnectOperation`
implements `com.pubnub.api.builder.dto.PubSubOperation`  

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.builder.dto.StateOperation`
implements `com.pubnub.api.builder.dto.PubSubOperation`  

**Methods:**
- `public static com.pubnub.api.builder.dto.StateOperation$StateOperationBuilder builder()`
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.List getChannelGroups()`
- `public java.util.List getChannels()`
- `public java.lang.Object getState()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.builder.dto.StateOperation$StateOperationBuilder`

**Methods:**
- `public com.pubnub.api.builder.dto.StateOperation build()`
- `public com.pubnub.api.builder.dto.StateOperation$StateOperationBuilder channelGroups(java.util.List p0)`
- `public com.pubnub.api.builder.dto.StateOperation$StateOperationBuilder channels(java.util.List p0)`
- `public com.pubnub.api.builder.dto.StateOperation$StateOperationBuilder state(java.lang.Object p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.builder.dto.SubscribeOperation`
implements `com.pubnub.api.builder.dto.PubSubOperation`  

**Methods:**
- `public static com.pubnub.api.builder.dto.SubscribeOperation$SubscribeOperationBuilder builder()`
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.List getChannelGroups()`
- `public java.util.List getChannels()`
- `public java.lang.Long getTimetoken()`
- `public int hashCode()`
- `public boolean isPresenceEnabled()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.builder.dto.SubscribeOperation$SubscribeOperationBuilder`

**Methods:**
- `public com.pubnub.api.builder.dto.SubscribeOperation build()`
- `public com.pubnub.api.builder.dto.SubscribeOperation$SubscribeOperationBuilder channelGroups(java.util.List p0)`
- `public com.pubnub.api.builder.dto.SubscribeOperation$SubscribeOperationBuilder channels(java.util.List p0)`
- `public com.pubnub.api.builder.dto.SubscribeOperation$SubscribeOperationBuilder presenceEnabled(boolean p0)`
- `public com.pubnub.api.builder.dto.SubscribeOperation$SubscribeOperationBuilder timetoken(java.lang.Long p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.builder.dto.TimetokenAndRegionOperation`
implements `com.pubnub.api.builder.dto.PubSubOperation`  

**Constructors:**
- `public TimetokenAndRegionOperation(long p0, java.lang.String p1)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getRegion()`
- `public long getTimetoken()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.builder.dto.UnsubscribeOperation`
implements `com.pubnub.api.builder.dto.PubSubOperation`  

**Methods:**
- `public static com.pubnub.api.builder.dto.UnsubscribeOperation$UnsubscribeOperationBuilder builder()`
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.List getChannelGroups()`
- `public java.util.List getChannels()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.builder.dto.UnsubscribeOperation$UnsubscribeOperationBuilder`

**Methods:**
- `public com.pubnub.api.builder.dto.UnsubscribeOperation build()`
- `public com.pubnub.api.builder.dto.UnsubscribeOperation$UnsubscribeOperationBuilder channelGroups(java.util.List p0)`
- `public com.pubnub.api.builder.dto.UnsubscribeOperation$UnsubscribeOperationBuilder channels(java.util.List p0)`
- `public java.lang.String toString()`

---

## public abstract interface `com.pubnub.api.callbacks.PNCallback`<X extends java.lang.Object>

**Methods:**
- `public abstract void onResponse(X p0, com.pubnub.api.models.consumer.PNStatus p1)`

---

## public abstract class `com.pubnub.api.callbacks.ReconnectionCallback`

**Constructors:**
- `public ReconnectionCallback()`

**Methods:**
- `public abstract void onMaxReconnectionExhaustion()`
- `public abstract void onReconnection()`

---

## public abstract class `com.pubnub.api.callbacks.SubscribeCallback`

**Constructors:**
- `public SubscribeCallback()`

**Methods:**
- `public abstract void channel(com.pubnub.api.PubNub p0, com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadataResult p1)`
- `public abstract void file(com.pubnub.api.PubNub p0, com.pubnub.api.models.consumer.pubsub.files.PNFileEventResult p1)`
- `public abstract void membership(com.pubnub.api.PubNub p0, com.pubnub.api.models.consumer.objects_api.membership.PNMembershipResult p1)`
- `public abstract void message(com.pubnub.api.PubNub p0, com.pubnub.api.models.consumer.pubsub.PNMessageResult p1)`
- `public abstract void messageAction(com.pubnub.api.PubNub p0, com.pubnub.api.models.consumer.pubsub.message_actions.PNMessageActionResult p1)`
- `public abstract void presence(com.pubnub.api.PubNub p0, com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult p1)`
- `public abstract void signal(com.pubnub.api.PubNub p0, com.pubnub.api.models.consumer.pubsub.PNSignalResult p1)`
- `public abstract void status(com.pubnub.api.PubNub p0, com.pubnub.api.models.consumer.PNStatus p1)`
- `public abstract void uuid(com.pubnub.api.PubNub p0, com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadataResult p1)`

---

## public static class `com.pubnub.api.callbacks.SubscribeCallback$BaseSubscribeCallback`
extends `com.pubnub.api.callbacks.SubscribeCallback`  

**Constructors:**
- `public BaseSubscribeCallback()`

**Methods:**
- `public void channel(com.pubnub.api.PubNub p0, com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadataResult p1)`
- `public void file(com.pubnub.api.PubNub p0, com.pubnub.api.models.consumer.pubsub.files.PNFileEventResult p1)`
- `public void membership(com.pubnub.api.PubNub p0, com.pubnub.api.models.consumer.objects_api.membership.PNMembershipResult p1)`
- `public void message(com.pubnub.api.PubNub p0, com.pubnub.api.models.consumer.pubsub.PNMessageResult p1)`
- `public void messageAction(com.pubnub.api.PubNub p0, com.pubnub.api.models.consumer.pubsub.message_actions.PNMessageActionResult p1)`
- `public void presence(com.pubnub.api.PubNub p0, com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult p1)`
- `public void signal(com.pubnub.api.PubNub p0, com.pubnub.api.models.consumer.pubsub.PNSignalResult p1)`
- `public void status(com.pubnub.api.PubNub p0, com.pubnub.api.models.consumer.PNStatus p1)`
- `public void uuid(com.pubnub.api.PubNub p0, com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadataResult p1)`

---

## public abstract class `com.pubnub.api.callbacks.TimeCallback`
implements `com.pubnub.api.callbacks.PNCallback<com.pubnub.api.models.consumer.PNTimeResult>`  

**Constructors:**
- `public TimeCallback()`

---

## public abstract class `com.pubnub.api.callbacks.WhereNowCallback`
implements `com.pubnub.api.callbacks.PNCallback<com.pubnub.api.models.consumer.presence.PNWhereNowResult>`  

**Constructors:**
- `public WhereNowCallback()`

---

## public abstract interface `com.pubnub.api.endpoints.BuilderSteps`

---

## public abstract static interface `com.pubnub.api.endpoints.BuilderSteps$ChannelStep`<T extends java.lang.Object>

**Methods:**
- `public abstract T channel(java.lang.String p0)`

---

## public class `com.pubnub.api.endpoints.DeleteMessages`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public DeleteMessages(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.DeleteMessages channels(java.util.List p0)`
- `protected com.pubnub.api.models.consumer.history.PNDeleteMessagesResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0) throws com.pubnub.api.PubNubException`
- `public com.pubnub.api.endpoints.DeleteMessages end(java.lang.Long p0)`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `public com.pubnub.api.endpoints.DeleteMessages start(java.lang.Long p0)`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public abstract class `com.pubnub.api.endpoints.Endpoint`<Input extends java.lang.Object, Output extends java.lang.Object>
implements `com.pubnub.api.endpoints.remoteaction.RemoteAction<Output>`  

**Constructors:**
- `public Endpoint(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public void async(com.pubnub.api.callbacks.PNCallback p0)`
- `protected java.util.Map createBaseParams()`
- `protected abstract Output createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected abstract retrofit2.Call doWork(java.util.Map p0) throws com.pubnub.api.PubNubException`
- `protected java.util.Map encodeParams(java.util.Map p0)`
- `protected abstract java.util.List getAffectedChannelGroups()`
- `protected abstract java.util.List getAffectedChannels()`
- `protected abstract com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected com.pubnub.api.PubNub getPubnub()`
- `protected com.pubnub.api.managers.RetrofitManager getRetrofit()`
- `protected abstract boolean isAuthRequired()`
- `protected boolean isError(retrofit2.Response p0)`
- `public com.pubnub.api.endpoints.Endpoint queryParam(java.util.Map p0)`
- `public void retry()`
- `public void silentCancel()`
- `public Output sync() throws com.pubnub.api.PubNubException`
- `protected abstract void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.FetchMessages`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public FetchMessages(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.FetchMessages channels(java.util.List p0)`
- `protected com.pubnub.api.models.consumer.history.PNFetchMessagesResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0) throws com.pubnub.api.PubNubException`
- `public com.pubnub.api.endpoints.FetchMessages end(java.lang.Long p0)`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `public com.pubnub.api.endpoints.FetchMessages includeMessageActions(java.lang.Boolean p0)`
- `public com.pubnub.api.endpoints.FetchMessages includeMessageType(boolean p0)`
- `public com.pubnub.api.endpoints.FetchMessages includeMeta(java.lang.Boolean p0)`
- `public com.pubnub.api.endpoints.FetchMessages includeUUID(boolean p0)`
- `protected boolean isAuthRequired()`
- `public com.pubnub.api.endpoints.FetchMessages maximumPerChannel(java.lang.Integer p0)`
- `public com.pubnub.api.endpoints.FetchMessages start(java.lang.Long p0)`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.History`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public History(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.History channel(java.lang.String p0)`
- `public com.pubnub.api.endpoints.History count(java.lang.Integer p0)`
- `protected com.pubnub.api.models.consumer.history.PNHistoryResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0)`
- `public com.pubnub.api.endpoints.History end(java.lang.Long p0)`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `public com.pubnub.api.endpoints.History includeMeta(java.lang.Boolean p0)`
- `public com.pubnub.api.endpoints.History includeTimetoken(java.lang.Boolean p0)`
- `protected boolean isAuthRequired()`
- `public com.pubnub.api.endpoints.History reverse(java.lang.Boolean p0)`
- `public com.pubnub.api.endpoints.History start(java.lang.Long p0)`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.MessageCounts`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public MessageCounts(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.MessageCounts channels(java.util.List p0)`
- `public com.pubnub.api.endpoints.MessageCounts channelsTimetoken(java.util.List p0)`
- `protected com.pubnub.api.models.consumer.history.PNMessageCountResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0)`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.Time`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public Time(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `protected com.pubnub.api.models.consumer.PNTimeResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0)`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.access.Grant`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public Grant(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.access.Grant authKeys(java.util.List p0)`
- `public com.pubnub.api.endpoints.access.Grant channelGroups(java.util.List p0)`
- `public com.pubnub.api.endpoints.access.Grant channels(java.util.List p0)`
- `protected com.pubnub.api.models.consumer.access_manager.PNAccessManagerGrantResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `public com.pubnub.api.endpoints.access.Grant delete(boolean p0)`
- `protected retrofit2.Call doWork(java.util.Map p0) throws com.pubnub.api.PubNubException`
- `public com.pubnub.api.endpoints.access.Grant get(boolean p0)`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `public com.pubnub.api.endpoints.access.Grant join(boolean p0)`
- `public com.pubnub.api.endpoints.access.Grant manage(boolean p0)`
- `public com.pubnub.api.endpoints.access.Grant read(boolean p0)`
- `public com.pubnub.api.endpoints.access.Grant ttl(java.lang.Integer p0)`
- `public com.pubnub.api.endpoints.access.Grant update(boolean p0)`
- `public com.pubnub.api.endpoints.access.Grant uuids(java.util.List p0)`
- `protected void validateParams() throws com.pubnub.api.PubNubException`
- `public com.pubnub.api.endpoints.access.Grant write(boolean p0)`

---

## public class `com.pubnub.api.endpoints.access.GrantToken`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public GrantToken(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.access.GrantToken authorizedUUID(java.lang.String p0)`
- `public com.pubnub.api.endpoints.access.GrantToken channelGroups(java.util.List p0)`
- `public com.pubnub.api.endpoints.access.GrantToken channels(java.util.List p0)`
- `protected com.pubnub.api.models.consumer.access_manager.v3.PNGrantTokenResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0) throws com.pubnub.api.PubNubException`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `public com.pubnub.api.endpoints.access.GrantToken meta(java.lang.Object p0)`
- `public com.pubnub.api.endpoints.access.GrantToken ttl(java.lang.Integer p0)`
- `public com.pubnub.api.endpoints.access.GrantToken uuids(java.util.List p0)`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.access.RevokeToken`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public RevokeToken(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `protected com.pubnub.api.models.consumer.access_manager.v3.PNRevokeTokenResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0) throws com.pubnub.api.PubNubException`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `public com.pubnub.api.endpoints.access.RevokeToken token(java.lang.String p0)`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public abstract class `com.pubnub.api.endpoints.access.builder.AbstractGrantTokenBuilder`<T extends java.lang.Object>
implements `com.pubnub.api.endpoints.remoteaction.RemoteAction<com.pubnub.api.models.consumer.access_manager.v3.PNGrantTokenResult>`  

**Constructors:**
- `public AbstractGrantTokenBuilder(com.pubnub.api.endpoints.access.GrantToken p0)`

**Fields:**
- `protected final com.pubnub.api.endpoints.access.GrantToken grantToken`

**Methods:**
- `public void async(com.pubnub.api.callbacks.PNCallback p0)`
- `public abstract T queryParam(java.util.Map p0)`
- `public void retry()`
- `public void silentCancel()`
- `public com.pubnub.api.models.consumer.access_manager.v3.PNGrantTokenResult sync() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.access.builder.GrantTokenBuilder`
extends `com.pubnub.api.endpoints.access.builder.AbstractGrantTokenBuilder`  

**Constructors:**
- `public GrantTokenBuilder(com.pubnub.api.endpoints.access.GrantToken p0)`

**Methods:**
- `public com.pubnub.api.endpoints.access.builder.GrantTokenObjectsBuilder authorizedUUID(java.lang.String p0)`
- `public com.pubnub.api.endpoints.access.builder.GrantTokenEntitiesBuilder authorizedUserId(com.pubnub.api.UserId p0)`
- `public com.pubnub.api.endpoints.access.builder.GrantTokenObjectsBuilder channelGroups(java.util.List p0)`
- `public com.pubnub.api.endpoints.access.builder.GrantTokenObjectsBuilder channels(java.util.List p0)`
- `public com.pubnub.api.endpoints.access.builder.GrantTokenBuilder meta(java.lang.Object p0)`
- `public com.pubnub.api.endpoints.access.builder.GrantTokenBuilder queryParam(java.util.Map p0)`
- `public com.pubnub.api.endpoints.access.builder.GrantTokenEntitiesBuilder spacesPermissions(java.util.List p0)`
- `public com.pubnub.api.endpoints.access.builder.GrantTokenBuilder ttl(java.lang.Integer p0)`
- `public com.pubnub.api.endpoints.access.builder.GrantTokenEntitiesBuilder usersPermissions(java.util.List p0)`
- `public com.pubnub.api.endpoints.access.builder.GrantTokenObjectsBuilder uuids(java.util.List p0)`

---

## public class `com.pubnub.api.endpoints.access.builder.GrantTokenEntitiesBuilder`
extends `com.pubnub.api.endpoints.access.builder.AbstractGrantTokenBuilder`  

**Constructors:**
- `public GrantTokenEntitiesBuilder(com.pubnub.api.endpoints.access.GrantToken p0)`

**Methods:**
- `public com.pubnub.api.endpoints.access.builder.GrantTokenEntitiesBuilder authorizedUserId(com.pubnub.api.UserId p0)`
- `public com.pubnub.api.endpoints.access.builder.GrantTokenEntitiesBuilder meta(java.lang.Object p0)`
- `public com.pubnub.api.endpoints.access.builder.GrantTokenEntitiesBuilder queryParam(java.util.Map p0)`
- `public com.pubnub.api.endpoints.access.builder.GrantTokenEntitiesBuilder spacesPermissions(java.util.List p0)`
- `public com.pubnub.api.endpoints.access.builder.GrantTokenEntitiesBuilder usersPermissions(java.util.List p0)`

---

## public class `com.pubnub.api.endpoints.access.builder.GrantTokenObjectsBuilder`
extends `com.pubnub.api.endpoints.access.builder.AbstractGrantTokenBuilder`  

**Constructors:**
- `public GrantTokenObjectsBuilder(com.pubnub.api.endpoints.access.GrantToken p0)`

**Methods:**
- `public com.pubnub.api.endpoints.access.builder.GrantTokenObjectsBuilder authorizedUUID(java.lang.String p0)`
- `public com.pubnub.api.endpoints.access.builder.GrantTokenObjectsBuilder channelGroups(java.util.List p0)`
- `public com.pubnub.api.endpoints.access.builder.GrantTokenObjectsBuilder channels(java.util.List p0)`
- `public com.pubnub.api.endpoints.access.builder.GrantTokenObjectsBuilder meta(java.lang.Object p0)`
- `public com.pubnub.api.endpoints.access.builder.GrantTokenObjectsBuilder queryParam(java.util.Map p0)`
- `public com.pubnub.api.endpoints.access.builder.GrantTokenObjectsBuilder ttl(java.lang.Integer p0)`
- `public com.pubnub.api.endpoints.access.builder.GrantTokenObjectsBuilder uuids(java.util.List p0)`

---

## public class `com.pubnub.api.endpoints.channel_groups.AddChannelChannelGroup`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public AddChannelChannelGroup(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.channel_groups.AddChannelChannelGroup channelGroup(java.lang.String p0)`
- `public com.pubnub.api.endpoints.channel_groups.AddChannelChannelGroup channels(java.util.List p0)`
- `protected com.pubnub.api.models.consumer.channel_group.PNChannelGroupsAddChannelResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0)`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.channel_groups.AllChannelsChannelGroup`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public AllChannelsChannelGroup(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.channel_groups.AllChannelsChannelGroup channelGroup(java.lang.String p0)`
- `protected com.pubnub.api.models.consumer.channel_group.PNChannelGroupsAllChannelsResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0)`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.channel_groups.DeleteChannelGroup`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public DeleteChannelGroup(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.channel_groups.DeleteChannelGroup channelGroup(java.lang.String p0)`
- `protected com.pubnub.api.models.consumer.channel_group.PNChannelGroupsDeleteGroupResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0)`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.channel_groups.ListAllChannelGroup`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public ListAllChannelGroup(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `protected com.pubnub.api.models.consumer.channel_group.PNChannelGroupsListAllResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0)`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.channel_groups.RemoveChannelChannelGroup`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public RemoveChannelChannelGroup(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.channel_groups.RemoveChannelChannelGroup channelGroup(java.lang.String p0)`
- `public com.pubnub.api.endpoints.channel_groups.RemoveChannelChannelGroup channels(java.util.List p0)`
- `protected com.pubnub.api.models.consumer.channel_group.PNChannelGroupsRemoveChannelResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0)`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.files.DeleteFile`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public DeleteFile(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.pubnub.api.PubNub p3, com.pubnub.api.managers.TelemetryManager p4, com.pubnub.api.managers.RetrofitManager p5, com.pubnub.api.managers.token_manager.TokenManager p6)`

**Methods:**
- `public static com.pubnub.api.endpoints.files.DeleteFile$Builder builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`
- `protected com.pubnub.api.models.consumer.files.PNDeleteFileResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0) throws com.pubnub.api.PubNubException`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public static class `com.pubnub.api.endpoints.files.DeleteFile$Builder`
extends `com.pubnub.api.endpoints.files.requiredparambuilder.ChannelFileNameFileIdBuilder`  

---

## public class `com.pubnub.api.endpoints.files.DownloadFile`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public DownloadFile(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.pubnub.api.PubNub p3, com.pubnub.api.managers.TelemetryManager p4, com.pubnub.api.managers.RetrofitManager p5, com.pubnub.api.managers.token_manager.TokenManager p6)`

**Methods:**
- `public static com.pubnub.api.endpoints.files.DownloadFile$Builder builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`
- `public com.pubnub.api.endpoints.files.DownloadFile cipherKey(java.lang.String p0)`
- `protected com.pubnub.api.models.consumer.files.PNDownloadFileResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0) throws com.pubnub.api.PubNubException`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public static class `com.pubnub.api.endpoints.files.DownloadFile$Builder`
extends `com.pubnub.api.endpoints.files.requiredparambuilder.ChannelFileNameFileIdBuilder`  

---

## public class `com.pubnub.api.endpoints.files.GetFileUrl`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public GetFileUrl(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.pubnub.api.PubNub p3, com.pubnub.api.managers.TelemetryManager p4, com.pubnub.api.managers.RetrofitManager p5, com.pubnub.api.managers.token_manager.TokenManager p6)`

**Methods:**
- `public void async(com.pubnub.api.callbacks.PNCallback p0)`
- `public static com.pubnub.api.endpoints.files.GetFileUrl$Builder builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`
- `protected com.pubnub.api.models.consumer.files.PNFileUrlResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0) throws com.pubnub.api.PubNubException`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `public void retry()`
- `public com.pubnub.api.models.consumer.files.PNFileUrlResult sync() throws com.pubnub.api.PubNubException`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public static class `com.pubnub.api.endpoints.files.GetFileUrl$Builder`
extends `com.pubnub.api.endpoints.files.requiredparambuilder.ChannelFileNameFileIdBuilder`  

---

## public class `com.pubnub.api.endpoints.files.ListFiles`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public ListFiles(java.lang.String p0, com.pubnub.api.PubNub p1, com.pubnub.api.managers.TelemetryManager p2, com.pubnub.api.managers.RetrofitManager p3, com.pubnub.api.managers.token_manager.TokenManager p4)`

**Methods:**
- `protected com.pubnub.api.models.consumer.files.PNListFilesResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0) throws com.pubnub.api.PubNubException`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `public com.pubnub.api.endpoints.files.ListFiles limit(java.lang.Integer p0)`
- `public com.pubnub.api.endpoints.files.ListFiles next(com.pubnub.api.models.consumer.PNPage$Next p0)`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public static class `com.pubnub.api.endpoints.files.ListFiles$Builder`
implements `com.pubnub.api.endpoints.BuilderSteps$ChannelStep<com.pubnub.api.endpoints.files.ListFiles>`  

**Constructors:**
- `public Builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.files.ListFiles channel(java.lang.String p0)`

---

## public class `com.pubnub.api.endpoints.files.PublishFileMessage`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public PublishFileMessage(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.pubnub.api.PubNub p3, com.pubnub.api.managers.TelemetryManager p4, com.pubnub.api.managers.RetrofitManager p5, com.pubnub.api.managers.token_manager.TokenManager p6)`

**Methods:**
- `public static com.pubnub.api.endpoints.files.PublishFileMessage$Builder builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`
- `protected com.pubnub.api.models.consumer.files.PNPublishFileMessageResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0) throws com.pubnub.api.PubNubException`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `public com.pubnub.api.endpoints.files.PublishFileMessage message(java.lang.Object p0)`
- `public com.pubnub.api.endpoints.files.PublishFileMessage meta(java.lang.Object p0)`
- `public com.pubnub.api.endpoints.files.PublishFileMessage shouldStore(java.lang.Boolean p0)`
- `public com.pubnub.api.endpoints.files.PublishFileMessage ttl(java.lang.Integer p0)`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public static class `com.pubnub.api.endpoints.files.PublishFileMessage$Builder`
extends `com.pubnub.api.endpoints.files.requiredparambuilder.ChannelFileNameFileIdBuilder`  

---

## public class `com.pubnub.api.endpoints.files.SendFile`
implements `com.pubnub.api.endpoints.remoteaction.RemoteAction<com.pubnub.api.models.consumer.files.PNFileUploadResult>`  

**Methods:**
- `public void async(com.pubnub.api.callbacks.PNCallback p0)`
- `public static com.pubnub.api.endpoints.files.SendFile$Builder builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`
- `public com.pubnub.api.endpoints.files.SendFile cipherKey(java.lang.String p0)`
- `public com.pubnub.api.endpoints.files.SendFile message(java.lang.Object p0)`
- `public com.pubnub.api.endpoints.files.SendFile meta(java.lang.Object p0)`
- `public void retry()`
- `public com.pubnub.api.endpoints.files.SendFile shouldStore(java.lang.Boolean p0)`
- `public void silentCancel()`
- `public com.pubnub.api.models.consumer.files.PNFileUploadResult sync() throws com.pubnub.api.PubNubException`
- `public com.pubnub.api.endpoints.files.SendFile ttl(java.lang.Integer p0)`

---

## public static class `com.pubnub.api.endpoints.files.SendFile$Builder`
implements `com.pubnub.api.endpoints.BuilderSteps$ChannelStep<com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps$FileNameStep<com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps$InputStreamStep<com.pubnub.api.endpoints.files.SendFile>>>`  

**Methods:**
- `public com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps$FileNameStep channel(java.lang.String p0)`

---

## public static class `com.pubnub.api.endpoints.files.SendFile$Builder$InnerBuilder`
implements `com.pubnub.api.endpoints.BuilderSteps$ChannelStep<com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps$FileNameStep<com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps$InputStreamStep<com.pubnub.api.endpoints.files.SendFile>>>`, `com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps$FileNameStep<com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps$InputStreamStep<com.pubnub.api.endpoints.files.SendFile>>`, `com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps$InputStreamStep<com.pubnub.api.endpoints.files.SendFile>`  

**Methods:**
- `public com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps$FileNameStep channel(java.lang.String p0)`
- `public com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps$InputStreamStep fileName(java.lang.String p0)`
- `public com.pubnub.api.endpoints.files.SendFile inputStream(java.io.InputStream p0)`

---

## public abstract class `com.pubnub.api.endpoints.files.requiredparambuilder.ChannelFileNameFileIdBuilder`<T extends java.lang.Object>
implements `com.pubnub.api.endpoints.BuilderSteps$ChannelStep<com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps$FileNameStep<com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps$FileIdStep<T>>>`  

**Constructors:**
- `public ChannelFileNameFileIdBuilder(com.pubnub.api.endpoints.BuilderSteps$ChannelStep p0)`

**Methods:**
- `public com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps$FileNameStep channel(java.lang.String p0)`
- `public static <T extends java.lang.Object> com.pubnub.api.endpoints.BuilderSteps$ChannelStep create(com.pubnub.api.endpoints.remoteaction.PNFunction3 p0)`

---

## public static class `com.pubnub.api.endpoints.files.requiredparambuilder.ChannelFileNameFileIdBuilder$InnerBuilder`<T extends java.lang.Object>
implements `com.pubnub.api.endpoints.BuilderSteps$ChannelStep<com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps$FileNameStep<com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps$FileIdStep<T>>>`, `com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps$FileIdStep<T>`, `com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps$FileNameStep<com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps$FileIdStep<T>>`  

**Methods:**
- `public com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps$FileNameStep channel(java.lang.String p0)`
- `public T fileId(java.lang.String p0)`
- `public com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps$FileIdStep fileName(java.lang.String p0)`

---

## public abstract interface `com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps`
implements `com.pubnub.api.endpoints.BuilderSteps`  

---

## public abstract static interface `com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps$FileIdStep`<T extends java.lang.Object>

**Methods:**
- `public abstract T fileId(java.lang.String p0)`

---

## public abstract static interface `com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps$FileNameStep`<T extends java.lang.Object>

**Methods:**
- `public abstract T fileName(java.lang.String p0)`

---

## public abstract static interface `com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps$InputStreamStep`<T extends java.lang.Object>

**Methods:**
- `public abstract T inputStream(java.io.InputStream p0) throws java.io.IOException`

---

## public class `com.pubnub.api.endpoints.message_actions.AddMessageAction`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public AddMessageAction(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.message_actions.AddMessageAction channel(java.lang.String p0)`
- `protected com.pubnub.api.models.consumer.message_actions.PNAddMessageActionResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0)`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `public com.pubnub.api.endpoints.message_actions.AddMessageAction messageAction(com.pubnub.api.models.consumer.message_actions.PNMessageAction p0)`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.message_actions.GetMessageActions`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public GetMessageActions(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.message_actions.GetMessageActions channel(java.lang.String p0)`
- `protected com.pubnub.api.models.consumer.message_actions.PNGetMessageActionsResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0)`
- `public com.pubnub.api.endpoints.message_actions.GetMessageActions end(java.lang.Long p0)`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `public com.pubnub.api.endpoints.message_actions.GetMessageActions limit(java.lang.Integer p0)`
- `public com.pubnub.api.endpoints.message_actions.GetMessageActions start(java.lang.Long p0)`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.message_actions.RemoveMessageAction`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public RemoveMessageAction(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.message_actions.RemoveMessageAction actionTimetoken(java.lang.Long p0)`
- `public com.pubnub.api.endpoints.message_actions.RemoveMessageAction channel(java.lang.String p0)`
- `protected com.pubnub.api.models.consumer.message_actions.PNRemoveMessageActionResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0) throws com.pubnub.api.PubNubException`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `public com.pubnub.api.endpoints.message_actions.RemoveMessageAction messageTimetoken(java.lang.Long p0)`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public abstract class `com.pubnub.api.endpoints.objects_api.ChannelEnpoint`<INPUT extends java.lang.Object, OUTPUT extends java.lang.Object>
extends `com.pubnub.api.endpoints.objects_api.ObjectApiEndpoint`  

**Constructors:**
- `protected ChannelEnpoint(java.lang.String p0, com.pubnub.api.PubNub p1, com.pubnub.api.managers.TelemetryManager p2, com.pubnub.api.managers.RetrofitManager p3, com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher p4, com.pubnub.api.managers.token_manager.TokenManager p5)`

**Fields:**
- `protected java.lang.String channel`

**Methods:**
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher`
implements `com.pubnub.api.endpoints.objects_api.utils.ParameterEnricher`  

**Constructors:**
- `public CompositeParameterEnricher(com.pubnub.api.endpoints.objects_api.utils.Include p0, com.pubnub.api.endpoints.objects_api.utils.Sorter p1, com.pubnub.api.endpoints.objects_api.utils.Pager p2, com.pubnub.api.endpoints.objects_api.utils.Filter p3, com.pubnub.api.endpoints.objects_api.utils.TotalCounter p4, com.pubnub.api.endpoints.objects_api.utils.Limiter p5)`

**Methods:**
- `public static com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher createDefault()`
- `public static com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher createDefault(boolean p0, boolean p1)`
- `public java.util.Map enrichParameters(java.util.Map p0)`
- `public com.pubnub.api.endpoints.objects_api.utils.Filter getFilter()`
- `public com.pubnub.api.endpoints.objects_api.utils.Include getInclude()`
- `public com.pubnub.api.endpoints.objects_api.utils.Limiter getLimiter()`
- `public com.pubnub.api.endpoints.objects_api.utils.Pager getPager()`
- `public com.pubnub.api.endpoints.objects_api.utils.Sorter getSorter()`
- `public com.pubnub.api.endpoints.objects_api.utils.TotalCounter getTotalCounter()`
- `public void validateParameters() throws com.pubnub.api.PubNubException`

---

## public abstract class `com.pubnub.api.endpoints.objects_api.ObjectApiEndpoint`<INPUT extends java.lang.Object, OUTPUT extends java.lang.Object>
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `protected ObjectApiEndpoint(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher p3, com.pubnub.api.managers.token_manager.TokenManager p4)`

**Methods:**
- `protected retrofit2.Call doWork(java.util.Map p0) throws com.pubnub.api.PubNubException`
- `protected abstract retrofit2.Call executeCommand(java.util.Map p0) throws com.pubnub.api.PubNubException`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher getCompositeParameterEnricher()`
- `protected boolean isAuthRequired()`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public abstract class `com.pubnub.api.endpoints.objects_api.UUIDEndpoint`<SELF extends com.pubnub.api.endpoints.objects_api.UUIDEndpoint, INPUT extends java.lang.Object, OUTPUT extends java.lang.Object>
extends `com.pubnub.api.endpoints.objects_api.ObjectApiEndpoint`  

**Constructors:**
- `protected UUIDEndpoint(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher p3, com.pubnub.api.managers.token_manager.TokenManager p4)`

**Methods:**
- `protected java.lang.String effectiveUuid()`
- `public SELF uuid(java.lang.String p0)`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public abstract class `com.pubnub.api.endpoints.objects_api.channel.GetAllChannelsMetadata`
extends `com.pubnub.api.endpoints.objects_api.ObjectApiEndpoint`  
implements `com.pubnub.api.endpoints.objects_api.utils.Include$CustomIncludeAware<com.pubnub.api.endpoints.objects_api.channel.GetAllChannelsMetadata>`, `com.pubnub.api.endpoints.objects_api.utils.ListCapabilities$ListCapabilitiesAware<com.pubnub.api.endpoints.objects_api.channel.GetAllChannelsMetadata>`  

**Methods:**
- `public static com.pubnub.api.endpoints.objects_api.channel.GetAllChannelsMetadata create(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

---

## public abstract class `com.pubnub.api.endpoints.objects_api.channel.GetChannelMetadata`
extends `com.pubnub.api.endpoints.objects_api.ChannelEnpoint`  
implements `com.pubnub.api.endpoints.objects_api.utils.Include$CustomIncludeAware<com.pubnub.api.endpoints.objects_api.channel.GetChannelMetadata>`  

**Methods:**
- `public static com.pubnub.api.endpoints.objects_api.channel.GetChannelMetadata$Builder builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

---

## public static class `com.pubnub.api.endpoints.objects_api.channel.GetChannelMetadata$Builder`
implements `com.pubnub.api.endpoints.BuilderSteps$ChannelStep<com.pubnub.api.endpoints.objects_api.channel.GetChannelMetadata>`  

**Constructors:**
- `public Builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.objects_api.channel.GetChannelMetadata channel(java.lang.String p0)`

---

## public class `com.pubnub.api.endpoints.objects_api.channel.RemoveChannelMetadata`
extends `com.pubnub.api.endpoints.objects_api.ChannelEnpoint`  

**Methods:**
- `public static com.pubnub.api.endpoints.objects_api.channel.RemoveChannelMetadata$Builder builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`
- `protected com.pubnub.api.models.consumer.objects_api.channel.PNRemoveChannelMetadataResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call executeCommand(java.util.Map p0) throws com.pubnub.api.PubNubException`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`

---

## public static class `com.pubnub.api.endpoints.objects_api.channel.RemoveChannelMetadata$Builder`
implements `com.pubnub.api.endpoints.BuilderSteps$ChannelStep<com.pubnub.api.endpoints.objects_api.channel.RemoveChannelMetadata>`  

**Constructors:**
- `public Builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.objects_api.channel.RemoveChannelMetadata channel(java.lang.String p0)`

---

## public abstract class `com.pubnub.api.endpoints.objects_api.channel.SetChannelMetadata`
extends `com.pubnub.api.endpoints.objects_api.ChannelEnpoint`  
implements `com.pubnub.api.endpoints.objects_api.utils.Include$CustomIncludeAware<com.pubnub.api.endpoints.objects_api.channel.SetChannelMetadata>`  

**Methods:**
- `public static com.pubnub.api.endpoints.objects_api.channel.SetChannelMetadata$Builder builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`
- `public abstract com.pubnub.api.endpoints.objects_api.channel.SetChannelMetadata custom(java.util.Map p0)`
- `public abstract com.pubnub.api.endpoints.objects_api.channel.SetChannelMetadata description(java.lang.String p0)`
- `public abstract com.pubnub.api.endpoints.objects_api.channel.SetChannelMetadata name(java.lang.String p0)`
- `public abstract com.pubnub.api.endpoints.objects_api.channel.SetChannelMetadata status(java.lang.String p0)`
- `public abstract com.pubnub.api.endpoints.objects_api.channel.SetChannelMetadata type(java.lang.String p0)`

---

## public static class `com.pubnub.api.endpoints.objects_api.channel.SetChannelMetadata$Builder`
implements `com.pubnub.api.endpoints.BuilderSteps$ChannelStep<com.pubnub.api.endpoints.objects_api.channel.SetChannelMetadata>`  

**Constructors:**
- `public Builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher p3, com.pubnub.api.managers.token_manager.TokenManager p4)`

**Methods:**
- `public com.pubnub.api.endpoints.objects_api.channel.SetChannelMetadata channel(java.lang.String p0)`

---

## public abstract class `com.pubnub.api.endpoints.objects_api.members.GetChannelMembers`
extends `com.pubnub.api.endpoints.objects_api.ChannelEnpoint`  
implements `com.pubnub.api.endpoints.objects_api.utils.Include$CustomIncludeAware<com.pubnub.api.endpoints.objects_api.members.GetChannelMembers>`, `com.pubnub.api.endpoints.objects_api.utils.Include$UUIDIncludeAware<com.pubnub.api.endpoints.objects_api.members.GetChannelMembers>`, `com.pubnub.api.endpoints.objects_api.utils.ListCapabilities$ListCapabilitiesAware<com.pubnub.api.endpoints.objects_api.members.GetChannelMembers>`  

**Methods:**
- `public static com.pubnub.api.endpoints.objects_api.members.GetChannelMembers$Builder builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

---

## public static class `com.pubnub.api.endpoints.objects_api.members.GetChannelMembers$Builder`
implements `com.pubnub.api.endpoints.BuilderSteps$ChannelStep<com.pubnub.api.endpoints.objects_api.members.GetChannelMembers>`  

**Constructors:**
- `public Builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher p3, com.pubnub.api.managers.token_manager.TokenManager p4)`

**Methods:**
- `public com.pubnub.api.endpoints.objects_api.members.GetChannelMembers channel(java.lang.String p0)`

---

## public abstract class `com.pubnub.api.endpoints.objects_api.members.ManageChannelMembers`
extends `com.pubnub.api.endpoints.objects_api.ChannelEnpoint`  
implements `com.pubnub.api.endpoints.objects_api.utils.Include$CustomIncludeAware<com.pubnub.api.endpoints.objects_api.members.ManageChannelMembers>`, `com.pubnub.api.endpoints.objects_api.utils.Include$UUIDIncludeAware<com.pubnub.api.endpoints.objects_api.members.ManageChannelMembers>`, `com.pubnub.api.endpoints.objects_api.utils.ListCapabilities$ListCapabilitiesAware<com.pubnub.api.endpoints.objects_api.members.ManageChannelMembers>`  

**Methods:**
- `public static com.pubnub.api.endpoints.objects_api.members.ManageChannelMembers$Builder builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

---

## public static class `com.pubnub.api.endpoints.objects_api.members.ManageChannelMembers$Builder`
implements `com.pubnub.api.endpoints.BuilderSteps$ChannelStep<com.pubnub.api.endpoints.objects_api.utils.ObjectsBuilderSteps$RemoveOrSetStep<com.pubnub.api.endpoints.objects_api.members.ManageChannelMembers,com.pubnub.api.models.consumer.objects_api.member.PNUUID>>`  

**Constructors:**
- `public Builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.objects_api.utils.ObjectsBuilderSteps$RemoveOrSetStep channel(java.lang.String p0)`

---

## public abstract class `com.pubnub.api.endpoints.objects_api.members.RemoveChannelMembers`
extends `com.pubnub.api.endpoints.objects_api.ChannelEnpoint`  
implements `com.pubnub.api.endpoints.objects_api.utils.Include$CustomIncludeAware<com.pubnub.api.endpoints.objects_api.members.RemoveChannelMembers>`, `com.pubnub.api.endpoints.objects_api.utils.Include$UUIDIncludeAware<com.pubnub.api.endpoints.objects_api.members.RemoveChannelMembers>`, `com.pubnub.api.endpoints.objects_api.utils.ListCapabilities$ListCapabilitiesAware<com.pubnub.api.endpoints.objects_api.members.RemoveChannelMembers>`  

**Methods:**
- `public static com.pubnub.api.endpoints.objects_api.members.RemoveChannelMembers$Builder builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

---

## public static class `com.pubnub.api.endpoints.objects_api.members.RemoveChannelMembers$Builder`
implements `com.pubnub.api.endpoints.BuilderSteps$ChannelStep<com.pubnub.api.endpoints.objects_api.utils.ObjectsBuilderSteps$UUIDsStep<com.pubnub.api.endpoints.objects_api.members.RemoveChannelMembers>>`  

**Constructors:**
- `public Builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.objects_api.utils.ObjectsBuilderSteps$UUIDsStep channel(java.lang.String p0)`

---

## public abstract class `com.pubnub.api.endpoints.objects_api.members.SetChannelMembers`
extends `com.pubnub.api.endpoints.objects_api.ChannelEnpoint`  
implements `com.pubnub.api.endpoints.objects_api.utils.Include$CustomIncludeAware<com.pubnub.api.endpoints.objects_api.members.SetChannelMembers>`, `com.pubnub.api.endpoints.objects_api.utils.Include$UUIDIncludeAware<com.pubnub.api.endpoints.objects_api.members.SetChannelMembers>`, `com.pubnub.api.endpoints.objects_api.utils.ListCapabilities$ListCapabilitiesAware<com.pubnub.api.endpoints.objects_api.members.SetChannelMembers>`  

**Methods:**
- `public static com.pubnub.api.endpoints.objects_api.members.SetChannelMembers$Builder builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

---

## public static class `com.pubnub.api.endpoints.objects_api.members.SetChannelMembers$Builder`
implements `com.pubnub.api.endpoints.BuilderSteps$ChannelStep<com.pubnub.api.endpoints.objects_api.utils.ObjectsBuilderSteps$UUIDsStep<com.pubnub.api.endpoints.objects_api.members.SetChannelMembers>>`  

**Constructors:**
- `public Builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.objects_api.utils.ObjectsBuilderSteps$UUIDsStep channel(java.lang.String p0)`

---

## public abstract class `com.pubnub.api.endpoints.objects_api.memberships.GetMemberships`
extends `com.pubnub.api.endpoints.objects_api.UUIDEndpoint`  
implements `com.pubnub.api.endpoints.objects_api.utils.Include$ChannelIncludeAware<com.pubnub.api.endpoints.objects_api.memberships.GetMemberships>`, `com.pubnub.api.endpoints.objects_api.utils.Include$CustomIncludeAware<com.pubnub.api.endpoints.objects_api.memberships.GetMemberships>`, `com.pubnub.api.endpoints.objects_api.utils.ListCapabilities$ListCapabilitiesAware<com.pubnub.api.endpoints.objects_api.memberships.GetMemberships>`  

**Constructors:**
- `public GetMemberships(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher p3, com.pubnub.api.managers.token_manager.TokenManager p4)`

**Methods:**
- `public static com.pubnub.api.endpoints.objects_api.memberships.GetMemberships create(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

---

## public abstract class `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships`
extends `com.pubnub.api.endpoints.objects_api.UUIDEndpoint`  
implements `com.pubnub.api.endpoints.objects_api.utils.Include$ChannelIncludeAware<com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships>`, `com.pubnub.api.endpoints.objects_api.utils.Include$CustomIncludeAware<com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships>`, `com.pubnub.api.endpoints.objects_api.utils.ListCapabilities$ListCapabilitiesAware<com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships>`  

**Methods:**
- `public static com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships$Builder builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

---

## public static class `com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships$Builder`
implements `com.pubnub.api.endpoints.objects_api.utils.ObjectsBuilderSteps$RemoveOrSetStep<com.pubnub.api.endpoints.objects_api.memberships.ManageMemberships,com.pubnub.api.models.consumer.objects_api.membership.PNChannelMembership>`  

**Constructors:**
- `public Builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.objects_api.utils.ObjectsBuilderSteps$RemoveOrSetStep$SetStep remove(java.util.Collection p0)`
- `public com.pubnub.api.endpoints.objects_api.utils.ObjectsBuilderSteps$RemoveOrSetStep$RemoveStep set(java.util.Collection p0)`

---

## public abstract class `com.pubnub.api.endpoints.objects_api.memberships.RemoveMemberships`
extends `com.pubnub.api.endpoints.objects_api.UUIDEndpoint`  
implements `com.pubnub.api.endpoints.objects_api.utils.Include$ChannelIncludeAware<com.pubnub.api.endpoints.objects_api.memberships.RemoveMemberships>`, `com.pubnub.api.endpoints.objects_api.utils.Include$CustomIncludeAware<com.pubnub.api.endpoints.objects_api.memberships.RemoveMemberships>`, `com.pubnub.api.endpoints.objects_api.utils.ListCapabilities$ListCapabilitiesAware<com.pubnub.api.endpoints.objects_api.memberships.RemoveMemberships>`  

**Methods:**
- `public static com.pubnub.api.endpoints.objects_api.memberships.RemoveMemberships$Builder builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

---

## public static class `com.pubnub.api.endpoints.objects_api.memberships.RemoveMemberships$Builder`
implements `com.pubnub.api.endpoints.objects_api.utils.ObjectsBuilderSteps$ChannelMembershipsStep<com.pubnub.api.endpoints.objects_api.memberships.RemoveMemberships>`  

**Constructors:**
- `public Builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.objects_api.memberships.RemoveMemberships channelMemberships(java.util.Collection p0)`

---

## public abstract class `com.pubnub.api.endpoints.objects_api.memberships.SetMemberships`
extends `com.pubnub.api.endpoints.objects_api.UUIDEndpoint`  
implements `com.pubnub.api.endpoints.objects_api.utils.Include$ChannelIncludeAware<com.pubnub.api.endpoints.objects_api.memberships.SetMemberships>`, `com.pubnub.api.endpoints.objects_api.utils.Include$CustomIncludeAware<com.pubnub.api.endpoints.objects_api.memberships.SetMemberships>`, `com.pubnub.api.endpoints.objects_api.utils.ListCapabilities$ListCapabilitiesAware<com.pubnub.api.endpoints.objects_api.memberships.SetMemberships>`  

**Methods:**
- `public static com.pubnub.api.endpoints.objects_api.memberships.SetMemberships$Builder builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

---

## public static class `com.pubnub.api.endpoints.objects_api.memberships.SetMemberships$Builder`
implements `com.pubnub.api.endpoints.objects_api.utils.ObjectsBuilderSteps$ChannelMembershipsStep<com.pubnub.api.endpoints.objects_api.memberships.SetMemberships>`  

**Constructors:**
- `public Builder(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.objects_api.memberships.SetMemberships channelMemberships(java.util.Collection p0)`

---

## public class `com.pubnub.api.endpoints.objects_api.utils.Filter`
implements `com.pubnub.api.endpoints.objects_api.utils.ParameterEnricher`  

**Constructors:**
- `public Filter()`

**Methods:**
- `public java.util.Map enrichParameters(java.util.Map p0)`
- `public void setFilter(java.lang.String p0)`

---

## public abstract static interface `com.pubnub.api.endpoints.objects_api.utils.Filter$FilterAware`<T extends com.pubnub.api.endpoints.Endpoint<? extends java.lang.Object, ? extends java.lang.Object>>

**Methods:**
- `public abstract T filter(java.lang.String p0)`

---

## public abstract static interface `com.pubnub.api.endpoints.objects_api.utils.Filter$HavingFilter`<T extends com.pubnub.api.endpoints.Endpoint<? extends java.lang.Object, ? extends java.lang.Object>>
implements `com.pubnub.api.endpoints.objects_api.utils.Filter$FilterAware<T>`, `com.pubnub.api.endpoints.objects_api.utils.HavingCompositeParameterEnricher`  

**Methods:**
- `public default T filter(java.lang.String p0)`

---

## public abstract interface `com.pubnub.api.endpoints.objects_api.utils.HavingCompositeParameterEnricher`

**Methods:**
- `public abstract com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher getCompositeParameterEnricher()`

---

## public class `com.pubnub.api.endpoints.objects_api.utils.Include`
implements `com.pubnub.api.endpoints.objects_api.utils.ParameterEnricher`  

**Constructors:**
- `public Include()`

**Fields:**
- `public final static java.lang.String INCLUDE_PARAM_NAME`

**Methods:**
- `public void addInclusionFlag(java.lang.String p0)`
- `public java.util.Map enrichParameters(java.util.Map p0)`

---

## public abstract static interface `com.pubnub.api.endpoints.objects_api.utils.Include$ChannelIncludeAware`<T extends com.pubnub.api.endpoints.Endpoint<? extends java.lang.Object, ? extends java.lang.Object>>

**Methods:**
- `public abstract T includeChannel(com.pubnub.api.endpoints.objects_api.utils.Include$PNChannelDetailsLevel p0)`

---

## public abstract static interface `com.pubnub.api.endpoints.objects_api.utils.Include$CustomIncludeAware`<T extends com.pubnub.api.endpoints.Endpoint<? extends java.lang.Object, ? extends java.lang.Object>>

**Methods:**
- `public abstract T includeCustom(boolean p0)`

---

## public abstract static interface `com.pubnub.api.endpoints.objects_api.utils.Include$HavingChannelInclude`<T extends com.pubnub.api.endpoints.Endpoint<? extends java.lang.Object, ? extends java.lang.Object>>
implements `com.pubnub.api.endpoints.objects_api.utils.HavingCompositeParameterEnricher`, `com.pubnub.api.endpoints.objects_api.utils.Include$ChannelIncludeAware<T>`  

**Methods:**
- `public default T includeChannel(com.pubnub.api.endpoints.objects_api.utils.Include$PNChannelDetailsLevel p0)`

---

## public abstract static interface `com.pubnub.api.endpoints.objects_api.utils.Include$HavingCustomInclude`<T extends com.pubnub.api.endpoints.Endpoint<? extends java.lang.Object, ? extends java.lang.Object>>
implements `com.pubnub.api.endpoints.objects_api.utils.HavingCompositeParameterEnricher`, `com.pubnub.api.endpoints.objects_api.utils.Include$CustomIncludeAware<T>`  

**Methods:**
- `public default T includeCustom(boolean p0)`

---

## public abstract static interface `com.pubnub.api.endpoints.objects_api.utils.Include$HavingUUIDInclude`<T extends com.pubnub.api.endpoints.Endpoint<? extends java.lang.Object, ? extends java.lang.Object>>
implements `com.pubnub.api.endpoints.objects_api.utils.HavingCompositeParameterEnricher`, `com.pubnub.api.endpoints.objects_api.utils.Include$UUIDIncludeAware<T>`  

**Methods:**
- `public default T includeUUID(com.pubnub.api.endpoints.objects_api.utils.Include$PNUUIDDetailsLevel p0)`

---

## public final static enum `com.pubnub.api.endpoints.objects_api.utils.Include$PNChannelDetailsLevel`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.pubnub.api.endpoints.objects_api.utils.Include$PNChannelDetailsLevel CHANNEL`
- `public final static com.pubnub.api.endpoints.objects_api.utils.Include$PNChannelDetailsLevel CHANNEL_WITH_CUSTOM`

---

## public final static enum `com.pubnub.api.endpoints.objects_api.utils.Include$PNUUIDDetailsLevel`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.pubnub.api.endpoints.objects_api.utils.Include$PNUUIDDetailsLevel UUID`
- `public final static com.pubnub.api.endpoints.objects_api.utils.Include$PNUUIDDetailsLevel UUID_WITH_CUSTOM`

---

## public abstract static interface `com.pubnub.api.endpoints.objects_api.utils.Include$UUIDIncludeAware`<T extends com.pubnub.api.endpoints.Endpoint<? extends java.lang.Object, ? extends java.lang.Object>>

**Methods:**
- `public abstract T includeUUID(com.pubnub.api.endpoints.objects_api.utils.Include$PNUUIDDetailsLevel p0)`

---

## public class `com.pubnub.api.endpoints.objects_api.utils.Limiter`
implements `com.pubnub.api.endpoints.objects_api.utils.ParameterEnricher`  

**Constructors:**
- `public Limiter()`

**Methods:**
- `public java.util.Map enrichParameters(java.util.Map p0)`
- `public void setLimit(int p0)`

---

## public abstract static interface `com.pubnub.api.endpoints.objects_api.utils.Limiter$HavingLimiter`<T extends com.pubnub.api.endpoints.Endpoint<? extends java.lang.Object, ? extends java.lang.Object>>
implements `com.pubnub.api.endpoints.objects_api.utils.HavingCompositeParameterEnricher`, `com.pubnub.api.endpoints.objects_api.utils.Limiter$LimitAware<T>`  

**Methods:**
- `public default T limit(int p0)`

---

## public abstract static interface `com.pubnub.api.endpoints.objects_api.utils.Limiter$LimitAware`<T extends com.pubnub.api.endpoints.Endpoint<? extends java.lang.Object, ? extends java.lang.Object>>

**Methods:**
- `public abstract T limit(int p0)`

---

## public abstract interface `com.pubnub.api.endpoints.objects_api.utils.ListCapabilities`

---

## public abstract static interface `com.pubnub.api.endpoints.objects_api.utils.ListCapabilities$HavingListCapabilites`<T extends com.pubnub.api.endpoints.Endpoint<? extends java.lang.Object, ? extends java.lang.Object>>
implements `com.pubnub.api.endpoints.objects_api.utils.Filter$HavingFilter<T>`, `com.pubnub.api.endpoints.objects_api.utils.Limiter$HavingLimiter<T>`, `com.pubnub.api.endpoints.objects_api.utils.Pager$HavingPager<T>`, `com.pubnub.api.endpoints.objects_api.utils.Sorter$HavingSorter<T>`, `com.pubnub.api.endpoints.objects_api.utils.TotalCounter$HavingTotalCounter<T>`  

---

## public abstract static interface `com.pubnub.api.endpoints.objects_api.utils.ListCapabilities$ListCapabilitiesAware`<T extends com.pubnub.api.endpoints.Endpoint<? extends java.lang.Object, ? extends java.lang.Object>>
implements `com.pubnub.api.endpoints.objects_api.utils.Filter$FilterAware<T>`, `com.pubnub.api.endpoints.objects_api.utils.Limiter$LimitAware<T>`, `com.pubnub.api.endpoints.objects_api.utils.Pager$PagingAware<T>`, `com.pubnub.api.endpoints.objects_api.utils.Sorter$SortingAware<T>`, `com.pubnub.api.endpoints.objects_api.utils.TotalCounter$TotalCountAware<T>`  

---

## public abstract interface `com.pubnub.api.endpoints.objects_api.utils.ObjectsBuilderSteps`
implements `com.pubnub.api.endpoints.BuilderSteps`  

---

## public abstract static interface `com.pubnub.api.endpoints.objects_api.utils.ObjectsBuilderSteps$ChannelMembershipsStep`<T extends java.lang.Object>

**Methods:**
- `public abstract T channelMemberships(java.util.Collection p0)`

---

## public abstract static interface `com.pubnub.api.endpoints.objects_api.utils.ObjectsBuilderSteps$RemoveOrSetStep`<T extends java.lang.Object, E extends java.lang.Object>

**Methods:**
- `public abstract com.pubnub.api.endpoints.objects_api.utils.ObjectsBuilderSteps$RemoveOrSetStep$SetStep remove(java.util.Collection p0)`
- `public abstract com.pubnub.api.endpoints.objects_api.utils.ObjectsBuilderSteps$RemoveOrSetStep$RemoveStep set(java.util.Collection p0)`

---

## public abstract static interface `com.pubnub.api.endpoints.objects_api.utils.ObjectsBuilderSteps$RemoveOrSetStep$RemoveStep`<T extends java.lang.Object, E extends java.lang.Object>

**Methods:**
- `public abstract T remove(java.util.Collection p0)`

---

## public abstract static interface `com.pubnub.api.endpoints.objects_api.utils.ObjectsBuilderSteps$RemoveOrSetStep$SetStep`<T extends java.lang.Object, E extends java.lang.Object>

**Methods:**
- `public abstract T set(java.util.Collection p0)`

---

## public abstract static interface `com.pubnub.api.endpoints.objects_api.utils.ObjectsBuilderSteps$UUIDsStep`<T extends java.lang.Object>

**Methods:**
- `public abstract T uuids(java.util.Collection p0)`

---

## public class `com.pubnub.api.endpoints.objects_api.utils.PNSortKey`

**Methods:**
- `public static com.pubnub.api.endpoints.objects_api.utils.PNSortKey asc(com.pubnub.api.endpoints.objects_api.utils.PNSortKey$Key p0)`
- `public static com.pubnub.api.endpoints.objects_api.utils.PNSortKey desc(com.pubnub.api.endpoints.objects_api.utils.PNSortKey$Key p0)`
- `public static com.pubnub.api.endpoints.objects_api.utils.PNSortKey of(com.pubnub.api.endpoints.objects_api.utils.PNSortKey$Key p0)`
- `public static com.pubnub.api.endpoints.objects_api.utils.PNSortKey of(com.pubnub.api.endpoints.objects_api.utils.PNSortKey$Key p0, com.pubnub.api.endpoints.objects_api.utils.PNSortKey$Dir p1)`
- `public java.lang.String toSortParameter()`

---

## public final static enum `com.pubnub.api.endpoints.objects_api.utils.PNSortKey$Dir`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.pubnub.api.endpoints.objects_api.utils.PNSortKey$Dir ASC`
- `public final static com.pubnub.api.endpoints.objects_api.utils.PNSortKey$Dir DESC`

---

## public final static enum `com.pubnub.api.endpoints.objects_api.utils.PNSortKey$Key`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.pubnub.api.endpoints.objects_api.utils.PNSortKey$Key ID`
- `public final static com.pubnub.api.endpoints.objects_api.utils.PNSortKey$Key NAME`
- `public final static com.pubnub.api.endpoints.objects_api.utils.PNSortKey$Key UPDATED`

---

## public class `com.pubnub.api.endpoints.objects_api.utils.Pager`
implements `com.pubnub.api.endpoints.objects_api.utils.ParameterEnricher`  

**Constructors:**
- `public Pager()`

**Methods:**
- `public java.util.Map enrichParameters(java.util.Map p0)`
- `public void setPage(com.pubnub.api.models.consumer.PNPage p0)`
- `public void validateParameters() throws com.pubnub.api.PubNubException`

---

## public abstract static interface `com.pubnub.api.endpoints.objects_api.utils.Pager$HavingPager`<T extends com.pubnub.api.endpoints.Endpoint<? extends java.lang.Object, ? extends java.lang.Object>>
implements `com.pubnub.api.endpoints.objects_api.utils.HavingCompositeParameterEnricher`, `com.pubnub.api.endpoints.objects_api.utils.Pager$PagingAware<T>`  

**Methods:**
- `public default T page(com.pubnub.api.models.consumer.PNPage p0)`

---

## public abstract static interface `com.pubnub.api.endpoints.objects_api.utils.Pager$PagingAware`<T extends com.pubnub.api.endpoints.Endpoint<? extends java.lang.Object, ? extends java.lang.Object>>

**Methods:**
- `public abstract T page(com.pubnub.api.models.consumer.PNPage p0)`

---

## public abstract interface `com.pubnub.api.endpoints.objects_api.utils.ParameterEnricher`

**Methods:**
- `public abstract java.util.Map enrichParameters(java.util.Map p0)`
- `public default void validateParameters() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.objects_api.utils.Sorter`
implements `com.pubnub.api.endpoints.objects_api.utils.ParameterEnricher`  

**Constructors:**
- `public Sorter()`

**Methods:**
- `public void addSortKeys(java.util.List p0)`
- `public java.util.Map enrichParameters(java.util.Map p0)`

---

## public abstract static interface `com.pubnub.api.endpoints.objects_api.utils.Sorter$HavingSorter`<T extends com.pubnub.api.endpoints.Endpoint<? extends java.lang.Object, ? extends java.lang.Object>>
implements `com.pubnub.api.endpoints.objects_api.utils.HavingCompositeParameterEnricher`, `com.pubnub.api.endpoints.objects_api.utils.Sorter$SortingAware<T>`  

**Methods:**
- `public default T sort(com.pubnub.api.endpoints.objects_api.utils.PNSortKey... p0)`

---

## public abstract static interface `com.pubnub.api.endpoints.objects_api.utils.Sorter$SortingAware`<T extends com.pubnub.api.endpoints.Endpoint<? extends java.lang.Object, ? extends java.lang.Object>>

**Methods:**
- `public abstract T sort(com.pubnub.api.endpoints.objects_api.utils.PNSortKey... p0)`

---

## public class `com.pubnub.api.endpoints.objects_api.utils.TotalCounter`
implements `com.pubnub.api.endpoints.objects_api.utils.ParameterEnricher`  

**Constructors:**
- `public TotalCounter()`

**Methods:**
- `public java.util.Map enrichParameters(java.util.Map p0)`
- `public void setIncludeTotalCount(boolean p0)`

---

## public abstract static interface `com.pubnub.api.endpoints.objects_api.utils.TotalCounter$HavingTotalCounter`<T extends com.pubnub.api.endpoints.Endpoint<? extends java.lang.Object, ? extends java.lang.Object>>
implements `com.pubnub.api.endpoints.objects_api.utils.HavingCompositeParameterEnricher`, `com.pubnub.api.endpoints.objects_api.utils.TotalCounter$TotalCountAware<T>`  

**Methods:**
- `public default T includeTotalCount(boolean p0)`

---

## public abstract static interface `com.pubnub.api.endpoints.objects_api.utils.TotalCounter$TotalCountAware`<T extends com.pubnub.api.endpoints.Endpoint<? extends java.lang.Object, ? extends java.lang.Object>>

**Methods:**
- `public abstract T includeTotalCount(boolean p0)`

---

## public abstract class `com.pubnub.api.endpoints.objects_api.uuid.GetAllUUIDMetadata`
extends `com.pubnub.api.endpoints.objects_api.ObjectApiEndpoint`  
implements `com.pubnub.api.endpoints.objects_api.utils.Include$CustomIncludeAware<com.pubnub.api.endpoints.objects_api.uuid.GetAllUUIDMetadata>`, `com.pubnub.api.endpoints.objects_api.utils.ListCapabilities$ListCapabilitiesAware<com.pubnub.api.endpoints.objects_api.uuid.GetAllUUIDMetadata>`  

**Constructors:**
- `public GetAllUUIDMetadata(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher p3, com.pubnub.api.managers.token_manager.TokenManager p4)`

**Methods:**
- `public static com.pubnub.api.endpoints.objects_api.uuid.GetAllUUIDMetadata create(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

---

## public abstract class `com.pubnub.api.endpoints.objects_api.uuid.GetUUIDMetadata`
extends `com.pubnub.api.endpoints.objects_api.UUIDEndpoint`  
implements `com.pubnub.api.endpoints.objects_api.utils.Include$CustomIncludeAware<com.pubnub.api.endpoints.objects_api.uuid.GetUUIDMetadata>`  

**Constructors:**
- `public GetUUIDMetadata(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher p3, com.pubnub.api.managers.token_manager.TokenManager p4)`

**Methods:**
- `public static com.pubnub.api.endpoints.objects_api.uuid.GetUUIDMetadata create(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

---

## public class `com.pubnub.api.endpoints.objects_api.uuid.RemoveUUIDMetadata`
extends `com.pubnub.api.endpoints.objects_api.UUIDEndpoint`  

**Constructors:**
- `public RemoveUUIDMetadata(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `protected com.pubnub.api.models.consumer.objects_api.uuid.PNRemoveUUIDMetadataResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call executeCommand(java.util.Map p0) throws com.pubnub.api.PubNubException`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`

---

## public abstract class `com.pubnub.api.endpoints.objects_api.uuid.SetUUIDMetadata`
extends `com.pubnub.api.endpoints.objects_api.UUIDEndpoint`  
implements `com.pubnub.api.endpoints.objects_api.utils.Include$CustomIncludeAware<com.pubnub.api.endpoints.objects_api.uuid.SetUUIDMetadata>`  

**Methods:**
- `public static com.pubnub.api.endpoints.objects_api.uuid.SetUUIDMetadata create(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`
- `public abstract com.pubnub.api.endpoints.objects_api.uuid.SetUUIDMetadata custom(java.util.Map p0)`
- `public abstract com.pubnub.api.endpoints.objects_api.uuid.SetUUIDMetadata email(java.lang.String p0)`
- `public abstract com.pubnub.api.endpoints.objects_api.uuid.SetUUIDMetadata externalId(java.lang.String p0)`
- `public abstract com.pubnub.api.endpoints.objects_api.uuid.SetUUIDMetadata name(java.lang.String p0)`
- `public abstract com.pubnub.api.endpoints.objects_api.uuid.SetUUIDMetadata profileUrl(java.lang.String p0)`
- `public abstract com.pubnub.api.endpoints.objects_api.uuid.SetUUIDMetadata status(java.lang.String p0)`
- `public abstract com.pubnub.api.endpoints.objects_api.uuid.SetUUIDMetadata type(java.lang.String p0)`

---

## public class `com.pubnub.api.endpoints.presence.GetState`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public GetState(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.presence.GetState channelGroups(java.util.List p0)`
- `public com.pubnub.api.endpoints.presence.GetState channels(java.util.List p0)`
- `protected com.pubnub.api.models.consumer.presence.PNGetStateResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0)`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `public com.pubnub.api.endpoints.presence.GetState uuid(java.lang.String p0)`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.presence.Heartbeat`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public Heartbeat(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.presence.Heartbeat channelGroups(java.util.List p0)`
- `public com.pubnub.api.endpoints.presence.Heartbeat channels(java.util.List p0)`
- `protected java.lang.Boolean createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0) throws com.pubnub.api.PubNubException`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `public com.pubnub.api.endpoints.presence.Heartbeat state(java.lang.Object p0)`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.presence.HereNow`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public HereNow(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.presence.HereNow channelGroups(java.util.List p0)`
- `public com.pubnub.api.endpoints.presence.HereNow channels(java.util.List p0)`
- `protected com.pubnub.api.models.consumer.presence.PNHereNowResult createResponse(retrofit2.Response p0)`
- `protected retrofit2.Call doWork(java.util.Map p0)`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `public com.pubnub.api.endpoints.presence.HereNow includeState(java.lang.Boolean p0)`
- `public com.pubnub.api.endpoints.presence.HereNow includeUUIDs(java.lang.Boolean p0)`
- `protected boolean isAuthRequired()`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.presence.Leave`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public Leave(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.presence.Leave channelGroups(java.util.List p0)`
- `public com.pubnub.api.endpoints.presence.Leave channels(java.util.List p0)`
- `protected java.lang.Boolean createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0)`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.presence.SetState`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public SetState(com.pubnub.api.PubNub p0, com.pubnub.api.managers.SubscriptionManager p1, com.pubnub.api.managers.TelemetryManager p2, com.pubnub.api.managers.RetrofitManager p3, com.pubnub.api.managers.token_manager.TokenManager p4)`

**Methods:**
- `public com.pubnub.api.endpoints.presence.SetState channelGroups(java.util.List p0)`
- `public com.pubnub.api.endpoints.presence.SetState channels(java.util.List p0)`
- `protected com.pubnub.api.models.consumer.presence.PNSetStateResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0) throws com.pubnub.api.PubNubException`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `public com.pubnub.api.endpoints.presence.SetState state(java.lang.Object p0)`
- `public com.pubnub.api.endpoints.presence.SetState uuid(java.lang.String p0)`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.presence.WhereNow`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public WhereNow(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `protected com.pubnub.api.models.consumer.presence.PNWhereNowResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0)`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `public com.pubnub.api.endpoints.presence.WhereNow uuid(java.lang.String p0)`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.pubsub.Publish`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public Publish(com.pubnub.api.PubNub p0, com.pubnub.api.managers.PublishSequenceManager p1, com.pubnub.api.managers.TelemetryManager p2, com.pubnub.api.managers.RetrofitManager p3, com.pubnub.api.managers.token_manager.TokenManager p4)`

**Methods:**
- `public com.pubnub.api.endpoints.pubsub.Publish channel(java.lang.String p0)`
- `protected com.pubnub.api.models.consumer.PNPublishResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0) throws com.pubnub.api.PubNubException`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `public com.pubnub.api.endpoints.pubsub.Publish message(java.lang.Object p0)`
- `public com.pubnub.api.endpoints.pubsub.Publish meta(java.lang.Object p0)`
- `public com.pubnub.api.endpoints.pubsub.Publish replicate(java.lang.Boolean p0)`
- `public com.pubnub.api.endpoints.pubsub.Publish shouldStore(java.lang.Boolean p0)`
- `public com.pubnub.api.endpoints.pubsub.Publish ttl(java.lang.Integer p0)`
- `public com.pubnub.api.endpoints.pubsub.Publish usePOST(java.lang.Boolean p0)`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.pubsub.Signal`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public Signal(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.pubsub.Signal channel(java.lang.String p0)`
- `protected com.pubnub.api.models.consumer.PNPublishResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0) throws com.pubnub.api.PubNubException`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `public com.pubnub.api.endpoints.pubsub.Signal message(java.lang.Object p0)`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.pubsub.Subscribe`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public Subscribe(com.pubnub.api.PubNub p0, com.pubnub.api.managers.RetrofitManager p1, com.pubnub.api.managers.token_manager.TokenManager p2)`

**Methods:**
- `public void async(com.pubnub.api.callbacks.PNCallback p0)`
- `public com.pubnub.api.endpoints.pubsub.Subscribe channelGroups(java.util.List p0)`
- `public com.pubnub.api.endpoints.pubsub.Subscribe channels(java.util.List p0)`
- `protected com.pubnub.api.models.server.SubscribeEnvelope createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `protected retrofit2.Call doWork(java.util.Map p0) throws com.pubnub.api.PubNubException`
- `public com.pubnub.api.endpoints.pubsub.Subscribe filterExpression(java.lang.String p0)`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `public com.pubnub.api.endpoints.pubsub.Subscribe region(java.lang.String p0)`
- `public com.pubnub.api.endpoints.pubsub.Subscribe state(java.lang.Object p0)`
- `public com.pubnub.api.endpoints.pubsub.Subscribe timetoken(java.lang.Long p0)`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.push.AddChannelsToPush`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public AddChannelsToPush(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.push.AddChannelsToPush channels(java.util.List p0)`
- `protected com.pubnub.api.models.consumer.push.PNPushAddChannelResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `public com.pubnub.api.endpoints.push.AddChannelsToPush deviceId(java.lang.String p0)`
- `protected retrofit2.Call doWork(java.util.Map p0) throws com.pubnub.api.PubNubException`
- `public com.pubnub.api.endpoints.push.AddChannelsToPush environment(com.pubnub.api.enums.PNPushEnvironment p0)`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `public com.pubnub.api.endpoints.push.AddChannelsToPush pushType(com.pubnub.api.enums.PNPushType p0)`
- `public com.pubnub.api.endpoints.push.AddChannelsToPush topic(java.lang.String p0)`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.push.ListPushProvisions`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public ListPushProvisions(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `protected com.pubnub.api.models.consumer.push.PNPushListProvisionsResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `public com.pubnub.api.endpoints.push.ListPushProvisions deviceId(java.lang.String p0)`
- `protected retrofit2.Call doWork(java.util.Map p0) throws com.pubnub.api.PubNubException`
- `public com.pubnub.api.endpoints.push.ListPushProvisions environment(com.pubnub.api.enums.PNPushEnvironment p0)`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `public com.pubnub.api.endpoints.push.ListPushProvisions pushType(com.pubnub.api.enums.PNPushType p0)`
- `public com.pubnub.api.endpoints.push.ListPushProvisions topic(java.lang.String p0)`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.push.RemoveAllPushChannelsForDevice`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public RemoveAllPushChannelsForDevice(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `protected com.pubnub.api.models.consumer.push.PNPushRemoveAllChannelsResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `public com.pubnub.api.endpoints.push.RemoveAllPushChannelsForDevice deviceId(java.lang.String p0)`
- `protected retrofit2.Call doWork(java.util.Map p0) throws com.pubnub.api.PubNubException`
- `public com.pubnub.api.endpoints.push.RemoveAllPushChannelsForDevice environment(com.pubnub.api.enums.PNPushEnvironment p0)`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `public com.pubnub.api.endpoints.push.RemoveAllPushChannelsForDevice pushType(com.pubnub.api.enums.PNPushType p0)`
- `public com.pubnub.api.endpoints.push.RemoveAllPushChannelsForDevice topic(java.lang.String p0)`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.push.RemoveChannelsFromPush`
extends `com.pubnub.api.endpoints.Endpoint`  

**Constructors:**
- `public RemoveChannelsFromPush(com.pubnub.api.PubNub p0, com.pubnub.api.managers.TelemetryManager p1, com.pubnub.api.managers.RetrofitManager p2, com.pubnub.api.managers.token_manager.TokenManager p3)`

**Methods:**
- `public com.pubnub.api.endpoints.push.RemoveChannelsFromPush channels(java.util.List p0)`
- `protected com.pubnub.api.models.consumer.push.PNPushRemoveChannelResult createResponse(retrofit2.Response p0) throws com.pubnub.api.PubNubException`
- `public com.pubnub.api.endpoints.push.RemoveChannelsFromPush deviceId(java.lang.String p0)`
- `protected retrofit2.Call doWork(java.util.Map p0) throws com.pubnub.api.PubNubException`
- `public com.pubnub.api.endpoints.push.RemoveChannelsFromPush environment(com.pubnub.api.enums.PNPushEnvironment p0)`
- `protected java.util.List getAffectedChannelGroups()`
- `protected java.util.List getAffectedChannels()`
- `protected com.pubnub.api.enums.PNOperationType getOperationType()`
- `protected boolean isAuthRequired()`
- `public com.pubnub.api.endpoints.push.RemoveChannelsFromPush pushType(com.pubnub.api.enums.PNPushType p0)`
- `public com.pubnub.api.endpoints.push.RemoveChannelsFromPush topic(java.lang.String p0)`
- `protected void validateParams() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.remoteaction.ComposableRemoteAction`<T extends java.lang.Object, U extends java.lang.Object>
implements `com.pubnub.api.endpoints.remoteaction.RemoteAction<U>`  

**Constructors:**
- `public ComposableRemoteAction(com.pubnub.api.endpoints.remoteaction.RemoteAction p0, com.pubnub.api.endpoints.remoteaction.RemoteActionFactory p1, java.lang.Boolean p2)`

**Methods:**
- `public void async(com.pubnub.api.callbacks.PNCallback p0)`
- `public synchronized com.pubnub.api.endpoints.remoteaction.ComposableRemoteAction checkpoint()`
- `public static <T extends java.lang.Object> com.pubnub.api.endpoints.remoteaction.ComposableRemoteAction$ComposableBuilder firstDo(com.pubnub.api.endpoints.remoteaction.RemoteAction p0)`
- `public synchronized void retry()`
- `public synchronized void silentCancel()`
- `public U sync() throws com.pubnub.api.PubNubException`
- `public <Y extends java.lang.Object> com.pubnub.api.endpoints.remoteaction.ComposableRemoteAction then(com.pubnub.api.endpoints.remoteaction.RemoteActionFactory p0)`

---

## public static class `com.pubnub.api.endpoints.remoteaction.ComposableRemoteAction$ComposableBuilder`<T extends java.lang.Object>

**Constructors:**
- `public ComposableBuilder(com.pubnub.api.endpoints.remoteaction.RemoteAction p0)`

**Methods:**
- `public com.pubnub.api.endpoints.remoteaction.ComposableRemoteAction$ComposableBuilder checkpoint()`
- `public <U extends java.lang.Object> com.pubnub.api.endpoints.remoteaction.ComposableRemoteAction then(com.pubnub.api.endpoints.remoteaction.RemoteActionFactory p0)`

---

## public class `com.pubnub.api.endpoints.remoteaction.MappingRemoteAction`<T extends java.lang.Object, U extends java.lang.Object>
implements `com.pubnub.api.endpoints.remoteaction.RemoteAction<U>`  

**Methods:**
- `public void async(com.pubnub.api.callbacks.PNCallback p0)`
- `public static <T extends java.lang.Object, U extends java.lang.Object> com.pubnub.api.endpoints.remoteaction.RemoteAction map(T p0, com.pubnub.api.endpoints.remoteaction.PNFunction p1)`
- `public void retry()`
- `public void silentCancel()`
- `public U sync() throws com.pubnub.api.PubNubException`

---

## public abstract interface `com.pubnub.api.endpoints.remoteaction.PNFunction`<INPUT extends java.lang.Object, OUTPUT extends java.lang.Object>

**Methods:**
- `public abstract OUTPUT invoke(INPUT p0)`

---

## public abstract interface `com.pubnub.api.endpoints.remoteaction.PNFunction3`<INPUT1 extends java.lang.Object, INPUT2 extends java.lang.Object, INPUT3 extends java.lang.Object, OUTPUT extends java.lang.Object>

**Methods:**
- `public abstract OUTPUT invoke(INPUT1 p0, INPUT2 p1, INPUT3 p2)`

---

## public abstract interface `com.pubnub.api.endpoints.remoteaction.RemoteAction`<Output extends java.lang.Object>

**Methods:**
- `public abstract void async(com.pubnub.api.callbacks.PNCallback p0)`
- `public abstract void retry()`
- `public abstract void silentCancel()`
- `public abstract Output sync() throws com.pubnub.api.PubNubException`

---

## public abstract interface `com.pubnub.api.endpoints.remoteaction.RemoteActionFactory`<T extends java.lang.Object, U extends java.lang.Object>

**Methods:**
- `public abstract com.pubnub.api.endpoints.remoteaction.RemoteAction create(T p0) throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.remoteaction.RetryingRemoteAction`<T extends java.lang.Object>
implements `com.pubnub.api.endpoints.remoteaction.RemoteAction<T>`  

**Constructors:**
- `public RetryingRemoteAction(com.pubnub.api.endpoints.remoteaction.RemoteAction p0, int p1, com.pubnub.api.enums.PNOperationType p2, java.util.concurrent.ExecutorService p3)`

**Methods:**
- `public void async(com.pubnub.api.callbacks.PNCallback p0)`
- `public static <T extends java.lang.Object> com.pubnub.api.endpoints.remoteaction.RetryingRemoteAction autoRetry(com.pubnub.api.endpoints.remoteaction.RemoteAction p0, int p1, com.pubnub.api.enums.PNOperationType p2, java.util.concurrent.ExecutorService p3)`
- `public void retry()`
- `public void silentCancel()`
- `public T sync() throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.endpoints.vendor.AppEngineFactory`
implements `okhttp3.Call`  

**Methods:**
- `public void cancel()`
- `public okhttp3.Call clone()`
- `public void enqueue(okhttp3.Callback p0)`
- `public okhttp3.Response execute() throws java.io.IOException`
- `public boolean isCanceled()`
- `public boolean isExecuted()`
- `public okhttp3.Request request()`
- `public okio.Timeout timeout()`

---

## public static class `com.pubnub.api.endpoints.vendor.AppEngineFactory$Factory`
implements `okhttp3.Call$Factory`  

**Constructors:**
- `public Factory(com.pubnub.api.PubNub p0)`

**Methods:**
- `public okhttp3.Call newCall(okhttp3.Request p0)`

---

## public final enum `com.pubnub.api.enums.PNHeartbeatNotificationOptions`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.pubnub.api.enums.PNHeartbeatNotificationOptions ALL`
- `public final static com.pubnub.api.enums.PNHeartbeatNotificationOptions FAILURES`
- `public final static com.pubnub.api.enums.PNHeartbeatNotificationOptions NONE`

---

## public final enum `com.pubnub.api.enums.PNLogVerbosity`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.pubnub.api.enums.PNLogVerbosity BODY`
- `public final static com.pubnub.api.enums.PNLogVerbosity NONE`

---

## public final enum `com.pubnub.api.enums.PNMemberFields`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.pubnub.api.enums.PNMemberFields CUSTOM`
- `public final static com.pubnub.api.enums.PNMemberFields USER`
- `public final static com.pubnub.api.enums.PNMemberFields USER_CUSTOM`

**Methods:**
- `public java.lang.String toString()`

---

## public final enum `com.pubnub.api.enums.PNMembershipFields`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.pubnub.api.enums.PNMembershipFields CUSTOM`
- `public final static com.pubnub.api.enums.PNMembershipFields SPACE`
- `public final static com.pubnub.api.enums.PNMembershipFields SPACE_CUSTOM`

**Methods:**
- `public java.lang.String toString()`

---

## public final enum `com.pubnub.api.enums.PNOperationType`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.pubnub.api.enums.PNOperationType PNAccessManagerAudit`
- `public final static com.pubnub.api.enums.PNOperationType PNAccessManagerGrant`
- `public final static com.pubnub.api.enums.PNOperationType PNAccessManagerGrantToken`
- `public final static com.pubnub.api.enums.PNOperationType PNAccessManagerRevokeToken`
- `public final static com.pubnub.api.enums.PNOperationType PNAddChannelsToGroupOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNAddMessageAction`
- `public final static com.pubnub.api.enums.PNOperationType PNAddPushNotificationsOnChannelsOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNChannelGroupsOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNChannelsForGroupOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNDeleteMessageAction`
- `public final static com.pubnub.api.enums.PNOperationType PNDeleteMessagesOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNFetchMessagesOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNFileAction`
- `public final static com.pubnub.api.enums.PNOperationType PNGetAllChannelsMetadataOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNGetAllUuidMetadataOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNGetChannelMembersOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNGetChannelMetadataOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNGetMembershipsOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNGetMessageActions`
- `public final static com.pubnub.api.enums.PNOperationType PNGetState`
- `public final static com.pubnub.api.enums.PNOperationType PNGetUuidMetadataOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNHeartbeatOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNHereNowOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNHistoryOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNManageChannelMembersOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNManageMembershipsOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNMessageCountOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNPublishOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNPushNotificationEnabledChannelsOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNRemoveAllPushNotificationsOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNRemoveChannelMembersOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNRemoveChannelMetadataOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNRemoveChannelsFromGroupOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNRemoveGroupOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNRemoveMembershipsOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNRemovePushNotificationsFromChannelsOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNRemoveUuidMetadataOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNSetChannelMembersOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNSetChannelMetadataOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNSetMembershipsOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNSetStateOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNSetUuidMetadataOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNSignalOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNSubscribeOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNTimeOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNUnsubscribeOperation`
- `public final static com.pubnub.api.enums.PNOperationType PNWhereNowOperation`

---

## public final enum `com.pubnub.api.enums.PNPushEnvironment`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.pubnub.api.enums.PNPushEnvironment DEVELOPMENT`
- `public final static com.pubnub.api.enums.PNPushEnvironment PRODUCTION`

---

## public final enum `com.pubnub.api.enums.PNPushType`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.pubnub.api.enums.PNPushType APNS`
- `public final static com.pubnub.api.enums.PNPushType APNS2`
- `public final static com.pubnub.api.enums.PNPushType FCM`
- `public final static com.pubnub.api.enums.PNPushType GCM`
- `public final static com.pubnub.api.enums.PNPushType MPNS`

**Methods:**
- `public java.lang.String toString()`

---

## public final enum `com.pubnub.api.enums.PNReconnectionPolicy`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.pubnub.api.enums.PNReconnectionPolicy EXPONENTIAL`
- `public final static com.pubnub.api.enums.PNReconnectionPolicy LINEAR`
- `public final static com.pubnub.api.enums.PNReconnectionPolicy NONE`

---

## public final enum `com.pubnub.api.enums.PNSpaceFields`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.pubnub.api.enums.PNSpaceFields CUSTOM`

**Methods:**
- `public java.lang.String toString()`

---

## public final enum `com.pubnub.api.enums.PNStatusCategory`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.pubnub.api.enums.PNStatusCategory PNAccessDeniedCategory`
- `public final static com.pubnub.api.enums.PNStatusCategory PNAcknowledgmentCategory`
- `public final static com.pubnub.api.enums.PNStatusCategory PNBadRequestCategory`
- `public final static com.pubnub.api.enums.PNStatusCategory PNCancelledCategory`
- `public final static com.pubnub.api.enums.PNStatusCategory PNConnectedCategory`
- `public final static com.pubnub.api.enums.PNStatusCategory PNDecryptionErrorCategory`
- `public final static com.pubnub.api.enums.PNStatusCategory PNDisconnectedCategory`
- `public final static com.pubnub.api.enums.PNStatusCategory PNMalformedFilterExpressionCategory`
- `public final static com.pubnub.api.enums.PNStatusCategory PNMalformedResponseCategory`
- `public final static com.pubnub.api.enums.PNStatusCategory PNNetworkIssuesCategory`
- `public final static com.pubnub.api.enums.PNStatusCategory PNRateLimitExceededCategory`
- `public final static com.pubnub.api.enums.PNStatusCategory PNReconnectedCategory`
- `public final static com.pubnub.api.enums.PNStatusCategory PNReconnectionAttemptsExhaustedCategory`
- `public final static com.pubnub.api.enums.PNStatusCategory PNRequestMessageCountExceededCategory`
- `public final static com.pubnub.api.enums.PNStatusCategory PNTLSConnectionFailedCategory`
- `public final static com.pubnub.api.enums.PNStatusCategory PNTLSUntrustedCertificateCategory`
- `public final static com.pubnub.api.enums.PNStatusCategory PNTimeoutCategory`
- `public final static com.pubnub.api.enums.PNStatusCategory PNURITooLongCategory`
- `public final static com.pubnub.api.enums.PNStatusCategory PNUnexpectedDisconnectCategory`
- `public final static com.pubnub.api.enums.PNStatusCategory PNUnknownCategory`

---

## public final enum `com.pubnub.api.enums.PNUserFields`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.pubnub.api.enums.PNUserFields CUSTOM`

**Methods:**
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.interceptors.SignatureInterceptor`
implements `okhttp3.Interceptor`  

**Constructors:**
- `public SignatureInterceptor(com.pubnub.api.PubNub p0)`

**Methods:**
- `public okhttp3.Response intercept(okhttp3.Interceptor$Chain p0) throws java.io.IOException`

---

## public class `com.pubnub.api.managers.BasePathManager`

**Constructors:**
- `public BasePathManager(com.pubnub.api.PNConfiguration p0)`

**Methods:**
- `public java.lang.String getBasePath()`

---

## public class `com.pubnub.api.managers.DelayedReconnectionManager`

**Constructors:**
- `public DelayedReconnectionManager(com.pubnub.api.PubNub p0)`

**Methods:**
- `public void scheduleDelayedReconnection()`
- `public void setReconnectionListener(com.pubnub.api.callbacks.ReconnectionCallback p0)`

---

## public class `com.pubnub.api.managers.DuplicationManager`

**Constructors:**
- `public DuplicationManager(com.pubnub.api.PNConfiguration p0)`

**Methods:**
- `public void addEntry(com.pubnub.api.models.server.SubscribeMessage p0)`
- `public void clearHistory()`
- `public boolean isDuplicate(com.pubnub.api.models.server.SubscribeMessage p0)`

---

## public class `com.pubnub.api.managers.ListenerManager`

**Constructors:**
- `public ListenerManager(com.pubnub.api.PubNub p0)`

**Methods:**
- `public void addListener(com.pubnub.api.callbacks.SubscribeCallback p0)`
- `public void announce(com.pubnub.api.models.consumer.PNStatus p0)`
- `public void announce(com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadataResult p0)`
- `public void announce(com.pubnub.api.models.consumer.objects_api.membership.PNMembershipResult p0)`
- `public void announce(com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadataResult p0)`
- `public void announce(com.pubnub.api.models.consumer.pubsub.PNMessageResult p0)`
- `public void announce(com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult p0)`
- `public void announce(com.pubnub.api.models.consumer.pubsub.PNSignalResult p0)`
- `public void announce(com.pubnub.api.models.consumer.pubsub.files.PNFileEventResult p0)`
- `public void announce(com.pubnub.api.models.consumer.pubsub.message_actions.PNMessageActionResult p0)`
- `public void removeListener(com.pubnub.api.callbacks.SubscribeCallback p0)`

---

## public class `com.pubnub.api.managers.MapperManager`

**Constructors:**
- `public MapperManager()`

**Methods:**
- `public <T extends java.lang.Object> T convertValue(com.google.gson.JsonElement p0, java.lang.Class p1)`
- `public <T extends java.lang.Object> T convertValue(java.lang.Object p0, java.lang.Class p1) throws com.pubnub.api.PubNubException`
- `public int elementToInt(com.google.gson.JsonElement p0, java.lang.String p1)`
- `public java.lang.Long elementToLong(com.google.gson.JsonElement p0)`
- `public java.lang.Long elementToLong(com.google.gson.JsonElement p0, java.lang.String p1)`
- `public java.lang.String elementToString(com.google.gson.JsonElement p0)`
- `public java.lang.String elementToString(com.google.gson.JsonElement p0, java.lang.String p1)`
- `public <T extends java.lang.Object> T fromJson(java.lang.String p0, java.lang.Class p1) throws com.pubnub.api.PubNubException`
- `public com.google.gson.JsonElement getArrayElement(com.google.gson.JsonElement p0, int p1)`
- `public java.util.Iterator getArrayIterator(com.google.gson.JsonElement p0)`
- `public java.util.Iterator getArrayIterator(com.google.gson.JsonElement p0, java.lang.String p1)`
- `public com.google.gson.JsonArray getAsArray(com.google.gson.JsonElement p0)`
- `public boolean getAsBoolean(com.google.gson.JsonElement p0, java.lang.String p1)`
- `public com.google.gson.JsonObject getAsObject(com.google.gson.JsonElement p0)`
- `public retrofit2.Converter$Factory getConverterFactory()`
- `public com.google.gson.JsonElement getField(com.google.gson.JsonElement p0, java.lang.String p1)`
- `public java.util.Iterator getObjectIterator(com.google.gson.JsonElement p0)`
- `public java.util.Iterator getObjectIterator(com.google.gson.JsonElement p0, java.lang.String p1)`
- `public com.google.gson.Gson getObjectMapper()`
- `public boolean hasField(com.google.gson.JsonElement p0, java.lang.String p1)`
- `public boolean isJsonObject(com.google.gson.JsonElement p0)`
- `public void putOnObject(com.google.gson.JsonObject p0, java.lang.String p1, com.google.gson.JsonElement p2)`
- `public java.lang.String toJson(java.lang.Object p0) throws com.pubnub.api.PubNubException`
- `public com.google.gson.JsonElement toJsonTree(java.lang.Object p0)`
- `public java.lang.String toJsonUsinJackson(java.lang.Object p0) throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.managers.PublishSequenceManager`

**Constructors:**
- `public PublishSequenceManager(int p0)`

**Methods:**
- `public synchronized int getNextSequence()`

---

## public class `com.pubnub.api.managers.ReconnectionManager`

**Constructors:**
- `public ReconnectionManager(com.pubnub.api.PubNub p0)`

**Methods:**
- `public void setReconnectionListener(com.pubnub.api.callbacks.ReconnectionCallback p0)`
- `public void startPolling()`

---

## public class `com.pubnub.api.managers.RetrofitManager`

**Constructors:**
- `public RetrofitManager(com.pubnub.api.PubNub p0)`

**Methods:**
- `public void destroy(boolean p0)`
- `public com.pubnub.api.services.AccessManagerService getAccessManagerService()`
- `public com.pubnub.api.services.ChannelGroupService getChannelGroupService()`
- `public com.pubnub.api.services.ChannelMetadataService getChannelMetadataService()`
- `public com.pubnub.api.services.ExtendedPresenceService getExtendedPresenceService()`
- `public com.pubnub.api.services.FilesService getFilesService()`
- `public com.pubnub.api.services.HistoryService getHistoryService()`
- `public com.pubnub.api.services.MessageActionService getMessageActionService()`
- `public retrofit2.Retrofit getNoSignatureInstance()`
- `public retrofit2.Retrofit getPresenceInstance()`
- `public com.pubnub.api.services.PresenceService getPresenceService()`
- `public com.pubnub.api.services.PublishService getPublishService()`
- `public com.pubnub.api.services.PushService getPushService()`
- `public com.pubnub.api.services.S3Service getS3Service()`
- `public com.pubnub.api.services.SignalService getSignalService()`
- `public com.pubnub.api.services.SubscribeService getSubscribeService()`
- `public retrofit2.Retrofit getSubscriptionInstance()`
- `public com.pubnub.api.services.TimeService getTimeService()`
- `public java.util.concurrent.ExecutorService getTransactionClientExecutorService()`
- `public retrofit2.Retrofit getTransactionInstance()`
- `public com.pubnub.api.services.UUIDMetadataService getUuidMetadataService()`

---

## public class `com.pubnub.api.managers.StateManager`

**Constructors:**
- `public StateManager(com.pubnub.api.PNConfiguration p0)`

**Methods:**
- `public synchronized boolean handleOperation(com.pubnub.api.builder.dto.PubSubOperation... p0)`
- `public synchronized com.pubnub.api.managers.StateManager$HeartbeatStateData heartbeatStateData()`
- `public synchronized com.pubnub.api.managers.StateManager$SubscriptionStateData subscriptionStateData(java.lang.Boolean p0)`
- `public synchronized com.pubnub.api.managers.StateManager$SubscriptionStateData subscriptionStateData(java.lang.Boolean p0, com.pubnub.api.managers.StateManager$ChannelFilter p1)`

---

## public static class `com.pubnub.api.managers.StateManager$HeartbeatStateData`

**Constructors:**
- `public HeartbeatStateData(java.util.Map p0, java.util.List p1, java.util.List p2)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.List getHeartbeatChannelGroups()`
- `public java.util.List getHeartbeatChannels()`
- `public java.util.Map getStatePayload()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.managers.StateManager$SubscriptionStateData`

**Constructors:**
- `public SubscriptionStateData(java.util.Map p0, java.util.List p1, java.util.List p2, java.lang.Long p3, java.lang.String p4, boolean p5, boolean p6, com.pubnub.api.enums.PNStatusCategory p7)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public com.pubnub.api.enums.PNStatusCategory getAnnounceStatus()`
- `public java.util.List getChannelGroups()`
- `public java.util.List getChannels()`
- `public java.lang.String getRegion()`
- `public java.util.Map getStatePayload()`
- `public java.lang.Long getTimetoken()`
- `public int hashCode()`
- `public boolean isAnythingToSubscribe()`
- `public boolean isShouldAnnounce()`
- `public boolean isSubscribedToOnlyTemporaryUnavailable()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.managers.SubscriptionManager`

**Constructors:**
- `public SubscriptionManager(com.pubnub.api.PubNub p0, com.pubnub.api.managers.RetrofitManager p1, com.pubnub.api.managers.TelemetryManager p2, com.pubnub.api.managers.StateManager p3, com.pubnub.api.managers.ListenerManager p4, com.pubnub.api.managers.ReconnectionManager p5, com.pubnub.api.managers.DelayedReconnectionManager p6, com.pubnub.api.managers.DuplicationManager p7, com.pubnub.api.managers.token_manager.TokenManager p8)`

**Methods:**
- `public void adaptPresenceBuilder(com.pubnub.api.builder.dto.PresenceOperation p0)`
- `public void adaptStateBuilder(com.pubnub.api.builder.dto.StateOperation p0)`
- `public void adaptSubscribeBuilder(com.pubnub.api.builder.dto.SubscribeOperation p0)`
- `public void adaptUnsubscribeBuilder(com.pubnub.api.builder.dto.UnsubscribeOperation p0)`
- `public synchronized void destroy(boolean p0)`
- `public synchronized void disconnect()`
- `public void reconnect()`
- `public synchronized void stop()`
- `public void unsubscribeAll()`

---

## public class `com.pubnub.api.managers.TelemetryManager`

**Constructors:**
- `public TelemetryManager()`

**Methods:**
- `public synchronized java.util.Map operationsLatency()`
- `public void stopCleanUpTimer()`
- `public synchronized void storeLatency(long p0, com.pubnub.api.enums.PNOperationType p1)`

---

## public class `com.pubnub.api.managers.token_manager.TokenManager`

**Constructors:**
- `public TokenManager()`

**Methods:**
- `public java.lang.String getToken()`
- `public void setToken(java.lang.String p0)`

---

## public class `com.pubnub.api.managers.token_manager.TokenParser`

**Constructors:**
- `public TokenParser()`

**Methods:**
- `public com.pubnub.api.models.consumer.access_manager.v3.PNToken unwrapToken(java.lang.String p0) throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.models.SubscriptionItem`

**Constructors:**
- `public SubscriptionItem()`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getName()`
- `public java.lang.Object getState()`
- `public int hashCode()`
- `public com.pubnub.api.models.SubscriptionItem setName(java.lang.String p0)`
- `public com.pubnub.api.models.SubscriptionItem setState(java.lang.Object p0)`

---

## public class `com.pubnub.api.models.TokenBitmask`

**Fields:**
- `public final static int CREATE`
- `public final static int DELETE`
- `public final static int GET`
- `public final static int JOIN`
- `public final static int MANAGE`
- `public final static int READ`
- `public final static int UPDATE`
- `public final static int WRITE`

---

## public class `com.pubnub.api.models.consumer.PNBoundedPage`

**Constructors:**
- `public PNBoundedPage(java.lang.Long p0, java.lang.Long p1, java.lang.Integer p2)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.Long getEnd()`
- `public java.lang.Integer getLimit()`
- `public java.lang.Long getStart()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.PNErrorData`

**Constructors:**
- `public PNErrorData(java.lang.String p0, java.lang.Exception p1)`

**Methods:**
- `public java.lang.String getInformation()`
- `public java.lang.Exception getThrowable()`
- `public java.lang.String toString()`

---

## public abstract class `com.pubnub.api.models.consumer.PNPage`

**Constructors:**
- `public PNPage(java.lang.String p0)`

**Fields:**
- `protected final java.lang.String hash`

**Methods:**
- `public java.lang.String getHash()`
- `public static com.pubnub.api.models.consumer.PNPage$Next next(java.lang.String p0)`
- `public static com.pubnub.api.models.consumer.PNPage$Previous previous(java.lang.String p0)`

---

## public static class `com.pubnub.api.models.consumer.PNPage$Next`
extends `com.pubnub.api.models.consumer.PNPage`  

---

## public static class `com.pubnub.api.models.consumer.PNPage$Previous`
extends `com.pubnub.api.models.consumer.PNPage`  

---

## public class `com.pubnub.api.models.consumer.PNPublishResult`

**Methods:**
- `public static com.pubnub.api.models.consumer.PNPublishResult$PNPublishResultBuilder builder()`
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.Long getTimetoken()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.PNPublishResult$PNPublishResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.PNPublishResult build()`
- `public com.pubnub.api.models.consumer.PNPublishResult$PNPublishResultBuilder timetoken(java.lang.Long p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.PNStatus`

**Methods:**
- `public static com.pubnub.api.models.consumer.PNStatus$PNStatusBuilder builder()`
- `public java.util.List getAffectedChannelGroups()`
- `public java.util.List getAffectedChannels()`
- `public java.lang.String getAuthKey()`
- `public com.pubnub.api.enums.PNStatusCategory getCategory()`
- `public java.lang.Object getClientRequest()`
- `public com.pubnub.api.models.consumer.PNErrorData getErrorData()`
- `public com.pubnub.api.enums.PNOperationType getOperation()`
- `public java.lang.String getOrigin()`
- `public int getStatusCode()`
- `public java.lang.String getUuid()`
- `public boolean isError()`
- `public boolean isTlsEnabled()`
- `public void retry()`
- `public com.pubnub.api.models.consumer.PNStatus$PNStatusBuilder toBuilder()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.PNStatus$PNStatusBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.PNStatus$PNStatusBuilder affectedChannelGroups(java.util.List p0)`
- `public com.pubnub.api.models.consumer.PNStatus$PNStatusBuilder affectedChannels(java.util.List p0)`
- `public com.pubnub.api.models.consumer.PNStatus$PNStatusBuilder authKey(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.PNStatus build()`
- `public com.pubnub.api.models.consumer.PNStatus$PNStatusBuilder category(com.pubnub.api.enums.PNStatusCategory p0)`
- `public com.pubnub.api.models.consumer.PNStatus$PNStatusBuilder clientRequest(java.lang.Object p0)`
- `public com.pubnub.api.models.consumer.PNStatus$PNStatusBuilder error(boolean p0)`
- `public com.pubnub.api.models.consumer.PNStatus$PNStatusBuilder errorData(com.pubnub.api.models.consumer.PNErrorData p0)`
- `public com.pubnub.api.models.consumer.PNStatus$PNStatusBuilder executedEndpoint(com.pubnub.api.endpoints.remoteaction.RemoteAction p0)`
- `public com.pubnub.api.models.consumer.PNStatus$PNStatusBuilder operation(com.pubnub.api.enums.PNOperationType p0)`
- `public com.pubnub.api.models.consumer.PNStatus$PNStatusBuilder origin(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.PNStatus$PNStatusBuilder statusCode(int p0)`
- `public com.pubnub.api.models.consumer.PNStatus$PNStatusBuilder tlsEnabled(boolean p0)`
- `public java.lang.String toString()`
- `public com.pubnub.api.models.consumer.PNStatus$PNStatusBuilder uuid(java.lang.String p0)`

---

## public class `com.pubnub.api.models.consumer.PNTimeResult`

**Methods:**
- `public static com.pubnub.api.models.consumer.PNTimeResult$PNTimeResultBuilder builder()`
- `public java.lang.Long getTimetoken()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.PNTimeResult$PNTimeResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.PNTimeResult build()`
- `public com.pubnub.api.models.consumer.PNTimeResult$PNTimeResultBuilder timetoken(java.lang.Long p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.access_manager.PNAccessManagerGrantResult`

**Methods:**
- `public static com.pubnub.api.models.consumer.access_manager.PNAccessManagerGrantResult$PNAccessManagerGrantResultBuilder builder()`
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.Map getChannelGroups()`
- `public java.util.Map getChannels()`
- `public java.lang.String getLevel()`
- `public java.lang.String getSubscribeKey()`
- `public int getTtl()`
- `public java.util.Map getUuids()`
- `public int hashCode()`
- `public void setChannelGroups(java.util.Map p0)`
- `public void setChannels(java.util.Map p0)`
- `public void setLevel(java.lang.String p0)`
- `public void setSubscribeKey(java.lang.String p0)`
- `public void setTtl(int p0)`
- `public void setUuids(java.util.Map p0)`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.access_manager.PNAccessManagerGrantResult$PNAccessManagerGrantResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.access_manager.PNAccessManagerGrantResult build()`
- `public com.pubnub.api.models.consumer.access_manager.PNAccessManagerGrantResult$PNAccessManagerGrantResultBuilder channelGroups(java.util.Map p0)`
- `public com.pubnub.api.models.consumer.access_manager.PNAccessManagerGrantResult$PNAccessManagerGrantResultBuilder channels(java.util.Map p0)`
- `public com.pubnub.api.models.consumer.access_manager.PNAccessManagerGrantResult$PNAccessManagerGrantResultBuilder level(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.access_manager.PNAccessManagerGrantResult$PNAccessManagerGrantResultBuilder subscribeKey(java.lang.String p0)`
- `public java.lang.String toString()`
- `public com.pubnub.api.models.consumer.access_manager.PNAccessManagerGrantResult$PNAccessManagerGrantResultBuilder ttl(int p0)`
- `public com.pubnub.api.models.consumer.access_manager.PNAccessManagerGrantResult$PNAccessManagerGrantResultBuilder uuids(java.util.Map p0)`

---

## public class `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData`

**Methods:**
- `public static com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData$PNAccessManagerKeyDataBuilder builder()`
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public boolean isDeleteEnabled()`
- `public boolean isGetEnabled()`
- `public boolean isJoinEnabled()`
- `public boolean isManageEnabled()`
- `public boolean isReadEnabled()`
- `public boolean isUpdateEnabled()`
- `public boolean isWriteEnabled()`
- `public void setDeleteEnabled(boolean p0)`
- `public void setGetEnabled(boolean p0)`
- `public void setJoinEnabled(boolean p0)`
- `public void setManageEnabled(boolean p0)`
- `public void setReadEnabled(boolean p0)`
- `public void setUpdateEnabled(boolean p0)`
- `public void setWriteEnabled(boolean p0)`
- `public com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData$PNAccessManagerKeyDataBuilder toBuilder()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData$PNAccessManagerKeyDataBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData build()`
- `public com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData$PNAccessManagerKeyDataBuilder deleteEnabled(boolean p0)`
- `public com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData$PNAccessManagerKeyDataBuilder getEnabled(boolean p0)`
- `public com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData$PNAccessManagerKeyDataBuilder joinEnabled(boolean p0)`
- `public com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData$PNAccessManagerKeyDataBuilder manageEnabled(boolean p0)`
- `public com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData$PNAccessManagerKeyDataBuilder readEnabled(boolean p0)`
- `public java.lang.String toString()`
- `public com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData$PNAccessManagerKeyDataBuilder updateEnabled(boolean p0)`
- `public com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData$PNAccessManagerKeyDataBuilder writeEnabled(boolean p0)`

---

## public class `com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeysData`

**Constructors:**
- `public PNAccessManagerKeysData()`

**Methods:**
- `public java.util.Map getAuthKeys()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.access_manager.sum.SpacePermissions`
extends `com.pubnub.api.models.consumer.access_manager.v3.PNResource`  

**Methods:**
- `public com.pubnub.api.models.consumer.access_manager.sum.SpacePermissions delete()`
- `public com.pubnub.api.models.consumer.access_manager.sum.SpacePermissions get()`
- `public static com.pubnub.api.models.consumer.access_manager.sum.SpacePermissions id(com.pubnub.api.SpaceId p0)`
- `public com.pubnub.api.models.consumer.access_manager.sum.SpacePermissions join()`
- `public com.pubnub.api.models.consumer.access_manager.sum.SpacePermissions manage()`
- `public static com.pubnub.api.models.consumer.access_manager.sum.SpacePermissions pattern(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.access_manager.sum.SpacePermissions read()`
- `public com.pubnub.api.models.consumer.access_manager.sum.SpacePermissions update()`
- `public com.pubnub.api.models.consumer.access_manager.sum.SpacePermissions write()`

---

## public class `com.pubnub.api.models.consumer.access_manager.sum.UserPermissions`
extends `com.pubnub.api.models.consumer.access_manager.v3.PNResource`  

**Methods:**
- `public com.pubnub.api.models.consumer.access_manager.sum.UserPermissions delete()`
- `public com.pubnub.api.models.consumer.access_manager.sum.UserPermissions get()`
- `public static com.pubnub.api.models.consumer.access_manager.sum.UserPermissions id(com.pubnub.api.UserId p0)`
- `public static com.pubnub.api.models.consumer.access_manager.sum.UserPermissions pattern(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.access_manager.sum.UserPermissions update()`

---

## public class `com.pubnub.api.models.consumer.access_manager.v3.ChannelGrant`
extends `com.pubnub.api.models.consumer.access_manager.v3.PNResource`  

**Methods:**
- `public com.pubnub.api.models.consumer.access_manager.v3.ChannelGrant delete()`
- `public com.pubnub.api.models.consumer.access_manager.v3.ChannelGrant get()`
- `public com.pubnub.api.models.consumer.access_manager.v3.ChannelGrant join()`
- `public com.pubnub.api.models.consumer.access_manager.v3.ChannelGrant manage()`
- `public static com.pubnub.api.models.consumer.access_manager.v3.ChannelGrant name(java.lang.String p0)`
- `public static com.pubnub.api.models.consumer.access_manager.v3.ChannelGrant pattern(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.access_manager.v3.ChannelGrant read()`
- `public com.pubnub.api.models.consumer.access_manager.v3.ChannelGrant update()`
- `public com.pubnub.api.models.consumer.access_manager.v3.ChannelGrant write()`

---

## public class `com.pubnub.api.models.consumer.access_manager.v3.ChannelGroupGrant`
extends `com.pubnub.api.models.consumer.access_manager.v3.PNResource`  

**Methods:**
- `public static com.pubnub.api.models.consumer.access_manager.v3.ChannelGroupGrant id(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.access_manager.v3.ChannelGroupGrant manage()`
- `public static com.pubnub.api.models.consumer.access_manager.v3.ChannelGroupGrant pattern(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.access_manager.v3.ChannelGroupGrant read()`

---

## public class `com.pubnub.api.models.consumer.access_manager.v3.PNGrantTokenResult`

**Constructors:**
- `public PNGrantTokenResult(java.lang.String p0)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getToken()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public abstract class `com.pubnub.api.models.consumer.access_manager.v3.PNResource`<T extends java.lang.Object>

**Constructors:**
- `public PNResource()`

**Fields:**
- `protected boolean create`
- `protected boolean delete`
- `protected boolean get`
- `protected boolean join`
- `protected boolean manage`
- `protected boolean read`
- `protected java.lang.String resourceName`
- `protected java.lang.String resourcePattern`
- `protected boolean update`
- `protected boolean write`

**Methods:**
- `protected T create()`
- `protected T delete()`
- `protected T get()`
- `public java.lang.String getId()`
- `public boolean isCreate()`
- `public boolean isDelete()`
- `public boolean isGet()`
- `public boolean isJoin()`
- `public boolean isManage()`
- `public boolean isPatternResource()`
- `public boolean isRead()`
- `public boolean isUpdate()`
- `public boolean isWrite()`
- `protected T join()`
- `protected T manage()`
- `protected T read()`
- `protected T update()`
- `protected T write()`

---

## public class `com.pubnub.api.models.consumer.access_manager.v3.PNRevokeTokenResult`

**Constructors:**
- `public PNRevokeTokenResult()`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.access_manager.v3.PNToken`
annotations: @com.fasterxml.jackson.annotation.JsonIgnoreProperties  

**Constructors:**
- `public PNToken(int p0, long p1, long p2, java.lang.String p3, java.lang.Object p4, com.pubnub.api.models.consumer.access_manager.v3.PNToken$PNTokenResources p5, com.pubnub.api.models.consumer.access_manager.v3.PNToken$PNTokenResources p6)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getAuthorizedUUID()`
- `public java.lang.Object getMeta()`
- `public com.pubnub.api.models.consumer.access_manager.v3.PNToken$PNTokenResources getPatterns()`
- `public com.pubnub.api.models.consumer.access_manager.v3.PNToken$PNTokenResources getResources()`
- `public long getTimestamp()`
- `public long getTtl()`
- `public int getVersion()`
- `public int hashCode()`
- `public static com.pubnub.api.models.consumer.access_manager.v3.PNToken of(int p0, long p1, long p2, com.pubnub.api.models.consumer.access_manager.v3.PNToken$PNTokenResources p3, com.pubnub.api.models.consumer.access_manager.v3.PNToken$PNTokenResources p4, java.lang.String p5, java.lang.Object p6)`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.access_manager.v3.PNToken$PNResourcePermissions`

**Constructors:**
- `public PNResourcePermissions(boolean p0, boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`
- `public boolean isDelete()`
- `public boolean isGet()`
- `public boolean isJoin()`
- `public boolean isManage()`
- `public boolean isRead()`
- `public boolean isUpdate()`
- `public boolean isWrite()`
- `public static com.pubnub.api.models.consumer.access_manager.v3.PNToken$PNResourcePermissions of(int p0)`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.access_manager.v3.PNToken$PNTokenResources`
annotations: @com.fasterxml.jackson.annotation.JsonIgnoreProperties  

**Constructors:**
- `public PNTokenResources(java.util.Map p0, java.util.Map p1, java.util.Map p2)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.Map getChannelGroups()`
- `public java.util.Map getChannels()`
- `public java.util.Map getUuids()`
- `public int hashCode()`
- `public static com.pubnub.api.models.consumer.access_manager.v3.PNToken$PNTokenResources of(java.util.Map p0, java.util.Map p1, java.util.Map p2)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.access_manager.v3.UUIDGrant`
extends `com.pubnub.api.models.consumer.access_manager.v3.PNResource`  

**Methods:**
- `public com.pubnub.api.models.consumer.access_manager.v3.UUIDGrant delete()`
- `public com.pubnub.api.models.consumer.access_manager.v3.UUIDGrant get()`
- `public static com.pubnub.api.models.consumer.access_manager.v3.UUIDGrant id(java.lang.String p0)`
- `public static com.pubnub.api.models.consumer.access_manager.v3.UUIDGrant pattern(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.access_manager.v3.UUIDGrant update()`

---

## public class `com.pubnub.api.models.consumer.channel_group.PNChannelGroupsAddChannelResult`

**Methods:**
- `public static com.pubnub.api.models.consumer.channel_group.PNChannelGroupsAddChannelResult$PNChannelGroupsAddChannelResultBuilder builder()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.channel_group.PNChannelGroupsAddChannelResult$PNChannelGroupsAddChannelResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.channel_group.PNChannelGroupsAddChannelResult build()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.channel_group.PNChannelGroupsAllChannelsResult`

**Methods:**
- `public static com.pubnub.api.models.consumer.channel_group.PNChannelGroupsAllChannelsResult$PNChannelGroupsAllChannelsResultBuilder builder()`
- `public java.util.List getChannels()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.channel_group.PNChannelGroupsAllChannelsResult$PNChannelGroupsAllChannelsResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.channel_group.PNChannelGroupsAllChannelsResult build()`
- `public com.pubnub.api.models.consumer.channel_group.PNChannelGroupsAllChannelsResult$PNChannelGroupsAllChannelsResultBuilder channels(java.util.List p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.channel_group.PNChannelGroupsDeleteGroupResult`

**Methods:**
- `public static com.pubnub.api.models.consumer.channel_group.PNChannelGroupsDeleteGroupResult$PNChannelGroupsDeleteGroupResultBuilder builder()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.channel_group.PNChannelGroupsDeleteGroupResult$PNChannelGroupsDeleteGroupResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.channel_group.PNChannelGroupsDeleteGroupResult build()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.channel_group.PNChannelGroupsListAllResult`

**Methods:**
- `public static com.pubnub.api.models.consumer.channel_group.PNChannelGroupsListAllResult$PNChannelGroupsListAllResultBuilder builder()`
- `public java.util.List getGroups()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.channel_group.PNChannelGroupsListAllResult$PNChannelGroupsListAllResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.channel_group.PNChannelGroupsListAllResult build()`
- `public com.pubnub.api.models.consumer.channel_group.PNChannelGroupsListAllResult$PNChannelGroupsListAllResultBuilder groups(java.util.List p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.channel_group.PNChannelGroupsRemoveChannelResult`

**Methods:**
- `public static com.pubnub.api.models.consumer.channel_group.PNChannelGroupsRemoveChannelResult$PNChannelGroupsRemoveChannelResultBuilder builder()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.channel_group.PNChannelGroupsRemoveChannelResult$PNChannelGroupsRemoveChannelResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.channel_group.PNChannelGroupsRemoveChannelResult build()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.files.PNBaseFile`
implements `com.pubnub.api.models.consumer.files.PNFile`  

**Constructors:**
- `public PNBaseFile(java.lang.String p0, java.lang.String p1)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getId()`
- `public java.lang.String getName()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.files.PNDeleteFileResult`

**Constructors:**
- `public PNDeleteFileResult(int p0)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public int getStatus()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.files.PNDownloadFileResult`

**Constructors:**
- `public PNDownloadFileResult(java.lang.String p0, java.io.InputStream p1)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.io.InputStream getByteStream()`
- `public java.lang.String getFileName()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.files.PNDownloadableFile`
implements `com.pubnub.api.models.consumer.files.PNFile`  

**Constructors:**
- `public PNDownloadableFile(java.lang.String p0, java.lang.String p1, java.lang.String p2)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getId()`
- `public java.lang.String getName()`
- `public java.lang.String getUrl()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public abstract interface `com.pubnub.api.models.consumer.files.PNFile`

**Methods:**
- `public abstract java.lang.String getId()`
- `public abstract java.lang.String getName()`

---

## public class `com.pubnub.api.models.consumer.files.PNFileUploadResult`

**Constructors:**
- `public PNFileUploadResult(long p0, int p1, com.pubnub.api.models.consumer.files.PNBaseFile p2)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public com.pubnub.api.models.consumer.files.PNBaseFile getFile()`
- `public int getStatus()`
- `public long getTimetoken()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.files.PNFileUrlResult`

**Constructors:**
- `public PNFileUrlResult(java.lang.String p0)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getUrl()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.files.PNListFilesResult`

**Constructors:**
- `public PNListFilesResult(int p0, com.pubnub.api.models.consumer.PNPage$Next p1, int p2, java.util.Collection p3)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public int getCount()`
- `public java.util.Collection getData()`
- `public com.pubnub.api.models.consumer.PNPage$Next getNext()`
- `public int getStatus()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.files.PNPublishFileMessageResult`

**Constructors:**
- `public PNPublishFileMessageResult(long p0)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public long getTimetoken()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.files.PNUploadedFile`
implements `com.pubnub.api.models.consumer.files.PNFile`  

**Constructors:**
- `public PNUploadedFile(java.lang.String p0, java.lang.String p1, java.lang.Integer p2, java.lang.String p3)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getCreated()`
- `public java.lang.String getId()`
- `public java.lang.String getName()`
- `public java.lang.Integer getSize()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.history.PNDeleteMessagesResult`

**Methods:**
- `public static com.pubnub.api.models.consumer.history.PNDeleteMessagesResult$PNDeleteMessagesResultBuilder builder()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.history.PNDeleteMessagesResult$PNDeleteMessagesResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.history.PNDeleteMessagesResult build()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.history.PNFetchMessageItem`

**Methods:**
- `public static com.pubnub.api.models.consumer.history.PNFetchMessageItem$PNFetchMessageItemBuilder builder()`
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.HashMap getActions()`
- `public com.google.gson.JsonElement getMessage()`
- `public com.google.gson.JsonElement getMeta()`
- `public java.lang.Long getTimetoken()`
- `public java.lang.String getUuid()`
- `public int hashCode()`
- `public com.pubnub.api.models.consumer.history.PNFetchMessageItem$PNFetchMessageItemBuilder toBuilder()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.history.PNFetchMessageItem$Action`

**Constructors:**
- `public Action(java.lang.String p0, java.lang.String p1)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getActionTimetoken()`
- `public java.lang.String getUuid()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.history.PNFetchMessageItem$PNFetchMessageItemBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.history.PNFetchMessageItem$PNFetchMessageItemBuilder actions(java.util.HashMap p0)`
- `public com.pubnub.api.models.consumer.history.PNFetchMessageItem build()`
- `public com.pubnub.api.models.consumer.history.PNFetchMessageItem$PNFetchMessageItemBuilder message(com.google.gson.JsonElement p0)`
- `public com.pubnub.api.models.consumer.history.PNFetchMessageItem$PNFetchMessageItemBuilder messageType(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.history.PNFetchMessageItem$PNFetchMessageItemBuilder meta(com.google.gson.JsonElement p0)`
- `public com.pubnub.api.models.consumer.history.PNFetchMessageItem$PNFetchMessageItemBuilder timetoken(java.lang.Long p0)`
- `public java.lang.String toString()`
- `public com.pubnub.api.models.consumer.history.PNFetchMessageItem$PNFetchMessageItemBuilder uuid(java.lang.String p0)`

---

## public class `com.pubnub.api.models.consumer.history.PNFetchMessagesResult`

**Methods:**
- `public static com.pubnub.api.models.consumer.history.PNFetchMessagesResult$PNFetchMessagesResultBuilder builder()`
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.Map getChannels()`
- `public com.pubnub.api.models.consumer.PNBoundedPage getPage()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.history.PNFetchMessagesResult$PNFetchMessagesResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.history.PNFetchMessagesResult build()`
- `public com.pubnub.api.models.consumer.history.PNFetchMessagesResult$PNFetchMessagesResultBuilder channels(java.util.Map p0)`
- `public com.pubnub.api.models.consumer.history.PNFetchMessagesResult$PNFetchMessagesResultBuilder page(com.pubnub.api.models.consumer.PNBoundedPage p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.history.PNHistoryItemResult`

**Methods:**
- `public static com.pubnub.api.models.consumer.history.PNHistoryItemResult$PNHistoryItemResultBuilder builder()`
- `public com.google.gson.JsonElement getEntry()`
- `public com.google.gson.JsonElement getMeta()`
- `public java.lang.Long getTimetoken()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.history.PNHistoryItemResult$PNHistoryItemResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.history.PNHistoryItemResult build()`
- `public com.pubnub.api.models.consumer.history.PNHistoryItemResult$PNHistoryItemResultBuilder entry(com.google.gson.JsonElement p0)`
- `public com.pubnub.api.models.consumer.history.PNHistoryItemResult$PNHistoryItemResultBuilder meta(com.google.gson.JsonElement p0)`
- `public com.pubnub.api.models.consumer.history.PNHistoryItemResult$PNHistoryItemResultBuilder timetoken(java.lang.Long p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.history.PNHistoryResult`

**Methods:**
- `public static com.pubnub.api.models.consumer.history.PNHistoryResult$PNHistoryResultBuilder builder()`
- `public java.lang.Long getEndTimetoken()`
- `public java.util.List getMessages()`
- `public java.lang.Long getStartTimetoken()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.history.PNHistoryResult$PNHistoryResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.history.PNHistoryResult build()`
- `public com.pubnub.api.models.consumer.history.PNHistoryResult$PNHistoryResultBuilder endTimetoken(java.lang.Long p0)`
- `public com.pubnub.api.models.consumer.history.PNHistoryResult$PNHistoryResultBuilder messages(java.util.List p0)`
- `public com.pubnub.api.models.consumer.history.PNHistoryResult$PNHistoryResultBuilder startTimetoken(java.lang.Long p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.history.PNMessageCountResult`

**Methods:**
- `public static com.pubnub.api.models.consumer.history.PNMessageCountResult$PNMessageCountResultBuilder builder()`
- `public java.util.Map getChannels()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.history.PNMessageCountResult$PNMessageCountResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.history.PNMessageCountResult build()`
- `public com.pubnub.api.models.consumer.history.PNMessageCountResult$PNMessageCountResultBuilder channels(java.util.Map p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.message_actions.PNAddMessageActionResult`
extends `com.pubnub.api.models.consumer.message_actions.PNMessageAction`  

**Methods:**
- `public static com.pubnub.api.models.consumer.message_actions.PNAddMessageActionResult$PNAddMessageActionResultBuilder builder()`

---

## public static class `com.pubnub.api.models.consumer.message_actions.PNAddMessageActionResult$PNAddMessageActionResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.message_actions.PNAddMessageActionResult build()`
- `public com.pubnub.api.models.consumer.message_actions.PNAddMessageActionResult$PNAddMessageActionResultBuilder pnMessageAction(com.pubnub.api.models.consumer.message_actions.PNMessageAction p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.message_actions.PNGetMessageActionsResult`

**Methods:**
- `public static com.pubnub.api.models.consumer.message_actions.PNGetMessageActionsResult$PNGetMessageActionsResultBuilder builder()`
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.List getActions()`
- `public com.pubnub.api.models.consumer.PNBoundedPage getPage()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.message_actions.PNGetMessageActionsResult$PNGetMessageActionsResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.message_actions.PNGetMessageActionsResult$PNGetMessageActionsResultBuilder actions(java.util.List p0)`
- `public com.pubnub.api.models.consumer.message_actions.PNGetMessageActionsResult build()`
- `public com.pubnub.api.models.consumer.message_actions.PNGetMessageActionsResult$PNGetMessageActionsResultBuilder page(com.pubnub.api.models.consumer.PNBoundedPage p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.message_actions.PNMessageAction`

**Constructors:**
- `public PNMessageAction()`

**Methods:**
- `public java.lang.Long getActionTimetoken()`
- `public java.lang.Long getMessageTimetoken()`
- `public java.lang.String getType()`
- `public java.lang.String getUuid()`
- `public java.lang.String getValue()`
- `public com.pubnub.api.models.consumer.message_actions.PNMessageAction setMessageTimetoken(java.lang.Long p0)`
- `public com.pubnub.api.models.consumer.message_actions.PNMessageAction setType(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.message_actions.PNMessageAction setValue(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.message_actions.PNRemoveMessageActionResult`

**Constructors:**
- `public PNRemoveMessageActionResult()`

---

## public class `com.pubnub.api.models.consumer.objects_api.PNObject`

**Constructors:**
- `protected PNObject()`
- `protected PNObject(java.lang.String p0)`

**Fields:**
- `protected java.lang.Object custom`
- `protected java.lang.String eTag`
- `protected java.lang.String id`
- `protected java.lang.String updated`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.Object getCustom()`
- `public java.lang.String getETag()`
- `public java.lang.String getId()`
- `public java.lang.String getUpdated()`
- `public int hashCode()`
- `public com.pubnub.api.models.consumer.objects_api.PNObject setCustom(java.lang.Object p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadata`
extends `com.pubnub.api.models.consumer.objects_api.PNObject`  

**Constructors:**
- `public PNChannelMetadata(java.lang.String p0, java.lang.String p1)`
- `public PNChannelMetadata(java.lang.String p0, java.lang.String p1, java.lang.String p2)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getDescription()`
- `public java.lang.String getName()`
- `public java.lang.String getStatus()`
- `public java.lang.String getType()`
- `public int hashCode()`
- `public com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadata setCustom(java.lang.Object p0)`
- `public com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadata setDescription(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadata setName(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadata setStatus(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadata setType(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadataResult`
extends `com.pubnub.api.models.consumer.pubsub.objects.ObjectResult`  

**Constructors:**
- `public PNChannelMetadataResult(com.pubnub.api.models.consumer.pubsub.BasePubSubResult p0, java.lang.String p1, com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadata p2)`

**Methods:**
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.objects_api.channel.PNGetAllChannelsMetadataResult`
extends `com.pubnub.api.models.server.objects_api.EntityArrayEnvelope`  

**Constructors:**
- `public PNGetAllChannelsMetadataResult()`
- `public PNGetAllChannelsMetadataResult(com.pubnub.api.models.server.objects_api.EntityArrayEnvelope p0)`

**Methods:**
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.objects_api.channel.PNGetChannelMetadataResult`
extends `com.pubnub.api.models.server.objects_api.EntityEnvelope`  

**Constructors:**
- `public PNGetChannelMetadataResult()`
- `public PNGetChannelMetadataResult(com.pubnub.api.models.server.objects_api.EntityEnvelope p0)`

**Methods:**
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.objects_api.channel.PNRemoveChannelMetadataResult`
extends `com.pubnub.api.models.server.objects_api.EntityEnvelope`  

**Constructors:**
- `public PNRemoveChannelMetadataResult(com.pubnub.api.models.server.objects_api.EntityEnvelope p0)`

**Methods:**
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.objects_api.channel.PNSetChannelMetadataResult`
extends `com.pubnub.api.models.server.objects_api.EntityEnvelope`  

**Constructors:**
- `public PNSetChannelMetadataResult()`
- `public PNSetChannelMetadataResult(com.pubnub.api.models.server.objects_api.EntityEnvelope p0)`

**Methods:**
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.objects_api.member.PNGetChannelMembersResult`
extends `com.pubnub.api.models.server.objects_api.EntityArrayEnvelope`  

**Constructors:**
- `public PNGetChannelMembersResult()`
- `public PNGetChannelMembersResult(com.pubnub.api.models.server.objects_api.EntityArrayEnvelope p0)`

**Methods:**
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.objects_api.member.PNManageChannelMembersResult`
extends `com.pubnub.api.models.server.objects_api.EntityArrayEnvelope`  

**Constructors:**
- `public PNManageChannelMembersResult()`
- `public PNManageChannelMembersResult(com.pubnub.api.models.server.objects_api.EntityArrayEnvelope p0)`

**Methods:**
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.objects_api.member.PNMembers`

**Constructors:**
- `public PNMembers()`

**Fields:**
- `protected java.lang.Object custom`
- `protected java.lang.String eTag`
- `protected java.lang.String status`
- `protected java.lang.String updated`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.Object getCustom()`
- `public java.lang.String getETag()`
- `public java.lang.String getStatus()`
- `public java.lang.String getUpdated()`
- `public com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadata getUuid()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.objects_api.member.PNRemoveChannelMembersResult`
extends `com.pubnub.api.models.server.objects_api.EntityArrayEnvelope`  

**Constructors:**
- `public PNRemoveChannelMembersResult()`
- `public PNRemoveChannelMembersResult(com.pubnub.api.models.server.objects_api.EntityArrayEnvelope p0)`

**Methods:**
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.objects_api.member.PNSetChannelMembersResult`
extends `com.pubnub.api.models.server.objects_api.EntityArrayEnvelope`  

**Constructors:**
- `public PNSetChannelMembersResult()`
- `public PNSetChannelMembersResult(com.pubnub.api.models.server.objects_api.EntityArrayEnvelope p0)`

**Methods:**
- `public java.lang.String toString()`

---

## public abstract class `com.pubnub.api.models.consumer.objects_api.member.PNUUID`

**Constructors:**
- `public PNUUID(com.pubnub.api.models.consumer.objects_api.member.PNUUID$UUIDId p0, java.lang.String p1)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getStatus()`
- `public com.pubnub.api.models.consumer.objects_api.member.PNUUID$UUIDId getUuid()`
- `public int hashCode()`
- `public java.lang.String toString()`
- `public static com.pubnub.api.models.consumer.objects_api.member.PNUUID uuid(java.lang.String p0)`
- `public static com.pubnub.api.models.consumer.objects_api.member.PNUUID uuid(java.lang.String p0, java.lang.String p1)`
- `public static com.pubnub.api.models.consumer.objects_api.member.PNUUID uuidWithCustom(java.lang.String p0, java.util.Map p1)`
- `public static com.pubnub.api.models.consumer.objects_api.member.PNUUID uuidWithCustom(java.lang.String p0, java.util.Map p1, java.lang.String p2)`

---

## public static class `com.pubnub.api.models.consumer.objects_api.member.PNUUID$UUIDId`

**Constructors:**
- `public UUIDId(java.lang.String p0)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getId()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.objects_api.member.PNUUID$UUIDWithCustom`
extends `com.pubnub.api.models.consumer.objects_api.member.PNUUID`  

**Methods:**
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.Object getCustom()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public abstract class `com.pubnub.api.models.consumer.objects_api.membership.PNChannelMembership`

**Constructors:**
- `public PNChannelMembership(com.pubnub.api.models.consumer.objects_api.membership.PNChannelMembership$ChannelId p0)`

**Methods:**
- `public static com.pubnub.api.models.consumer.objects_api.membership.PNChannelMembership channel(java.lang.String p0)`
- `public static com.pubnub.api.models.consumer.objects_api.membership.PNChannelMembership channelWithCustom(java.lang.String p0, java.util.Map p1)`
- `public com.pubnub.api.models.consumer.objects_api.membership.PNChannelMembership$ChannelId getChannel()`

---

## public static class `com.pubnub.api.models.consumer.objects_api.membership.PNChannelMembership$ChannelId`

**Constructors:**
- `public ChannelId(java.lang.String p0)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getId()`
- `public int hashCode()`

---

## public static class `com.pubnub.api.models.consumer.objects_api.membership.PNChannelMembership$ChannelWithCustom`
extends `com.pubnub.api.models.consumer.objects_api.membership.PNChannelMembership`  

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.Object getCustom()`
- `public int hashCode()`

---

## public static class `com.pubnub.api.models.consumer.objects_api.membership.PNChannelMembership$JustChannel`
extends `com.pubnub.api.models.consumer.objects_api.membership.PNChannelMembership`  

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public int hashCode()`

---

## public class `com.pubnub.api.models.consumer.objects_api.membership.PNGetMemberships`
extends `com.pubnub.api.models.consumer.objects_api.PNObject`  

**Constructors:**
- `public PNGetMemberships()`

---

## public class `com.pubnub.api.models.consumer.objects_api.membership.PNGetMembershipsResult`
extends `com.pubnub.api.models.server.objects_api.EntityArrayEnvelope`  

**Constructors:**
- `public PNGetMembershipsResult()`
- `public PNGetMembershipsResult(com.pubnub.api.models.server.objects_api.EntityArrayEnvelope p0)`

**Methods:**
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.objects_api.membership.PNManageMembershipResult`
extends `com.pubnub.api.models.server.objects_api.EntityArrayEnvelope`  

**Constructors:**
- `public PNManageMembershipResult()`
- `public PNManageMembershipResult(com.pubnub.api.models.server.objects_api.EntityArrayEnvelope p0)`

**Methods:**
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.objects_api.membership.PNMembership`

**Constructors:**
- `public PNMembership(com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadata p0)`

**Fields:**
- `protected java.lang.Object custom`
- `protected java.lang.String eTag`
- `protected java.lang.String status`
- `protected java.lang.String updated`
- `protected java.lang.String uuid`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadata getChannel()`
- `public java.lang.Object getCustom()`
- `public java.lang.String getETag()`
- `public java.lang.String getStatus()`
- `public java.lang.String getUpdated()`
- `public java.lang.String getUuid()`
- `public int hashCode()`
- `public com.pubnub.api.models.consumer.objects_api.membership.PNMembership setChannel(com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadata p0)`
- `public com.pubnub.api.models.consumer.objects_api.membership.PNMembership setCustom(java.lang.Object p0)`
- `public com.pubnub.api.models.consumer.objects_api.membership.PNMembership setETag(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.objects_api.membership.PNMembership setStatus(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.objects_api.membership.PNMembership setUpdated(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.objects_api.membership.PNMembership setUuid(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.objects_api.membership.PNMembershipResult`
extends `com.pubnub.api.models.consumer.pubsub.objects.ObjectResult`  

**Constructors:**
- `public PNMembershipResult(com.pubnub.api.models.consumer.pubsub.BasePubSubResult p0, java.lang.String p1, com.pubnub.api.models.consumer.objects_api.membership.PNMembership p2)`

**Methods:**
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.objects_api.membership.PNRemoveMembershipResult`
extends `com.pubnub.api.models.server.objects_api.EntityArrayEnvelope`  

**Constructors:**
- `public PNRemoveMembershipResult()`
- `public PNRemoveMembershipResult(com.pubnub.api.models.server.objects_api.EntityArrayEnvelope p0)`

**Methods:**
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.objects_api.membership.PNSetMembershipResult`
extends `com.pubnub.api.models.server.objects_api.EntityArrayEnvelope`  

**Constructors:**
- `public PNSetMembershipResult()`
- `public PNSetMembershipResult(com.pubnub.api.models.server.objects_api.EntityArrayEnvelope p0)`

**Methods:**
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.objects_api.util.CustomPayloadJsonInterceptor`
implements `com.google.gson.JsonDeserializer<java.lang.Object>`, `com.google.gson.JsonSerializer<java.lang.Object>`  

**Constructors:**
- `public CustomPayloadJsonInterceptor()`

**Methods:**
- `public java.lang.Object deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException`
- `public com.google.gson.JsonElement serialize(java.lang.Object p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2)`

---

## public class `com.pubnub.api.models.consumer.objects_api.uuid.PNGetAllUUIDMetadataResult`
extends `com.pubnub.api.models.server.objects_api.EntityArrayEnvelope`  

**Constructors:**
- `public PNGetAllUUIDMetadataResult()`
- `public PNGetAllUUIDMetadataResult(com.pubnub.api.models.server.objects_api.EntityArrayEnvelope p0)`

**Methods:**
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.objects_api.uuid.PNGetUUIDMetadataResult`
extends `com.pubnub.api.models.server.objects_api.EntityEnvelope`  

**Constructors:**
- `public PNGetUUIDMetadataResult()`
- `public PNGetUUIDMetadataResult(com.pubnub.api.models.server.objects_api.EntityEnvelope p0)`

**Methods:**
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.objects_api.uuid.PNRemoveUUIDMetadataResult`
extends `com.pubnub.api.models.server.objects_api.EntityEnvelope`  

**Constructors:**
- `public PNRemoveUUIDMetadataResult(com.pubnub.api.models.server.objects_api.EntityEnvelope p0)`

**Methods:**
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.objects_api.uuid.PNSetUUIDMetadataResult`
extends `com.pubnub.api.models.server.objects_api.EntityEnvelope`  

**Constructors:**
- `public PNSetUUIDMetadataResult()`
- `public PNSetUUIDMetadataResult(com.pubnub.api.models.server.objects_api.EntityEnvelope p0)`

**Methods:**
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadata`
extends `com.pubnub.api.models.consumer.objects_api.PNObject`  

**Constructors:**
- `public PNUUIDMetadata()`
- `public PNUUIDMetadata(java.lang.String p0, java.lang.String p1)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getEmail()`
- `public java.lang.String getExternalId()`
- `public java.lang.String getName()`
- `public java.lang.String getProfileUrl()`
- `public java.lang.String getStatus()`
- `public java.lang.String getType()`
- `public int hashCode()`
- `public com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadata setCustom(java.lang.Object p0)`
- `public com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadata setEmail(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadata setExternalId(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadata setName(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadata setProfileUrl(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadata setStatus(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadata setType(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadataResult`
extends `com.pubnub.api.models.consumer.pubsub.objects.ObjectResult`  

**Constructors:**
- `public PNUUIDMetadataResult(com.pubnub.api.models.consumer.pubsub.BasePubSubResult p0, java.lang.String p1, com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadata p2)`

**Methods:**
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.presence.PNGetStateResult`

**Methods:**
- `public static com.pubnub.api.models.consumer.presence.PNGetStateResult$PNGetStateResultBuilder builder()`
- `public java.util.Map getStateByUUID()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.presence.PNGetStateResult$PNGetStateResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.presence.PNGetStateResult build()`
- `public com.pubnub.api.models.consumer.presence.PNGetStateResult$PNGetStateResultBuilder stateByUUID(java.util.Map p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.presence.PNHereNowChannelData`

**Methods:**
- `public static com.pubnub.api.models.consumer.presence.PNHereNowChannelData$PNHereNowChannelDataBuilder builder()`
- `public java.lang.String getChannelName()`
- `public int getOccupancy()`
- `public java.util.List getOccupants()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.presence.PNHereNowChannelData$PNHereNowChannelDataBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.presence.PNHereNowChannelData build()`
- `public com.pubnub.api.models.consumer.presence.PNHereNowChannelData$PNHereNowChannelDataBuilder channelName(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.presence.PNHereNowChannelData$PNHereNowChannelDataBuilder occupancy(int p0)`
- `public com.pubnub.api.models.consumer.presence.PNHereNowChannelData$PNHereNowChannelDataBuilder occupants(java.util.List p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.presence.PNHereNowOccupantData`

**Methods:**
- `public static com.pubnub.api.models.consumer.presence.PNHereNowOccupantData$PNHereNowOccupantDataBuilder builder()`
- `public com.google.gson.JsonElement getState()`
- `public java.lang.String getUuid()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.presence.PNHereNowOccupantData$PNHereNowOccupantDataBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.presence.PNHereNowOccupantData build()`
- `public com.pubnub.api.models.consumer.presence.PNHereNowOccupantData$PNHereNowOccupantDataBuilder state(com.google.gson.JsonElement p0)`
- `public java.lang.String toString()`
- `public com.pubnub.api.models.consumer.presence.PNHereNowOccupantData$PNHereNowOccupantDataBuilder uuid(java.lang.String p0)`

---

## public class `com.pubnub.api.models.consumer.presence.PNHereNowResult`

**Methods:**
- `public static com.pubnub.api.models.consumer.presence.PNHereNowResult$PNHereNowResultBuilder builder()`
- `public java.util.Map getChannels()`
- `public int getTotalChannels()`
- `public int getTotalOccupancy()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.presence.PNHereNowResult$PNHereNowResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.presence.PNHereNowResult build()`
- `public com.pubnub.api.models.consumer.presence.PNHereNowResult$PNHereNowResultBuilder channels(java.util.Map p0)`
- `public java.lang.String toString()`
- `public com.pubnub.api.models.consumer.presence.PNHereNowResult$PNHereNowResultBuilder totalChannels(int p0)`
- `public com.pubnub.api.models.consumer.presence.PNHereNowResult$PNHereNowResultBuilder totalOccupancy(int p0)`

---

## public class `com.pubnub.api.models.consumer.presence.PNSetStateResult`

**Methods:**
- `public static com.pubnub.api.models.consumer.presence.PNSetStateResult$PNSetStateResultBuilder builder()`
- `public com.google.gson.JsonElement getState()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.presence.PNSetStateResult$PNSetStateResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.presence.PNSetStateResult build()`
- `public com.pubnub.api.models.consumer.presence.PNSetStateResult$PNSetStateResultBuilder state(com.google.gson.JsonElement p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.presence.PNWhereNowResult`

**Methods:**
- `public static com.pubnub.api.models.consumer.presence.PNWhereNowResult$PNWhereNowResultBuilder builder()`
- `public java.util.List getChannels()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.presence.PNWhereNowResult$PNWhereNowResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.presence.PNWhereNowResult build()`
- `public com.pubnub.api.models.consumer.presence.PNWhereNowResult$PNWhereNowResultBuilder channels(java.util.List p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.pubsub.BasePubSubResult`
implements `com.pubnub.api.models.consumer.pubsub.PNEvent`  

**Constructors:**
- `protected BasePubSubResult(com.pubnub.api.models.consumer.pubsub.BasePubSubResult p0)`
- `public BasePubSubResult(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.Long p4, com.google.gson.JsonElement p5, java.lang.String p6)`

**Methods:**
- `public static com.pubnub.api.models.consumer.pubsub.BasePubSubResult$BasePubSubResultBuilder builder()`
- `public java.lang.String getActualChannel()`
- `public java.lang.String getChannel()`
- `public java.lang.String getPublisher()`
- `public java.lang.String getSubscribedChannel()`
- `public java.lang.String getSubscription()`
- `public java.lang.Long getTimetoken()`
- `public com.google.gson.JsonElement getUserMetadata()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.pubsub.BasePubSubResult$BasePubSubResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.pubsub.BasePubSubResult$BasePubSubResultBuilder actualChannel(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.pubsub.BasePubSubResult build()`
- `public com.pubnub.api.models.consumer.pubsub.BasePubSubResult$BasePubSubResultBuilder channel(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.pubsub.BasePubSubResult$BasePubSubResultBuilder publisher(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.pubsub.BasePubSubResult$BasePubSubResultBuilder subscribedChannel(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.pubsub.BasePubSubResult$BasePubSubResultBuilder subscription(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.pubsub.BasePubSubResult$BasePubSubResultBuilder timetoken(java.lang.Long p0)`
- `public java.lang.String toString()`
- `public com.pubnub.api.models.consumer.pubsub.BasePubSubResult$BasePubSubResultBuilder userMetadata(com.google.gson.JsonElement p0)`

---

## public class `com.pubnub.api.models.consumer.pubsub.MessageResult`
extends `com.pubnub.api.models.consumer.pubsub.BasePubSubResult`  

**Constructors:**
- `public MessageResult(com.pubnub.api.models.consumer.pubsub.BasePubSubResult p0, com.google.gson.JsonElement p1)`

**Methods:**
- `public com.google.gson.JsonElement getMessage()`
- `public java.lang.String toString()`

---

## public abstract interface `com.pubnub.api.models.consumer.pubsub.PNEvent`

---

## public class `com.pubnub.api.models.consumer.pubsub.PNMessageResult`
extends `com.pubnub.api.models.consumer.pubsub.MessageResult`  

**Constructors:**
- `public PNMessageResult(com.pubnub.api.models.consumer.pubsub.BasePubSubResult p0, com.google.gson.JsonElement p1)`

**Methods:**
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult`
implements `com.pubnub.api.models.consumer.pubsub.PNEvent`  

**Methods:**
- `public static com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder builder()`
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getActualChannel()`
- `public java.lang.String getChannel()`
- `public java.lang.String getEvent()`
- `public java.lang.Boolean getHereNowRefresh()`
- `public java.util.List getJoin()`
- `public java.util.List getLeave()`
- `public java.lang.Integer getOccupancy()`
- `public com.google.gson.JsonElement getState()`
- `public java.lang.String getSubscribedChannel()`
- `public java.lang.String getSubscription()`
- `public java.util.List getTimeout()`
- `public java.lang.Long getTimestamp()`
- `public java.lang.Long getTimetoken()`
- `public java.lang.Object getUserMetadata()`
- `public java.lang.String getUuid()`
- `public int hashCode()`
- `public void setActualChannel(java.lang.String p0)`
- `public void setChannel(java.lang.String p0)`
- `public void setEvent(java.lang.String p0)`
- `public void setHereNowRefresh(java.lang.Boolean p0)`
- `public void setJoin(java.util.List p0)`
- `public void setLeave(java.util.List p0)`
- `public void setOccupancy(java.lang.Integer p0)`
- `public void setState(com.google.gson.JsonElement p0)`
- `public void setSubscribedChannel(java.lang.String p0)`
- `public void setSubscription(java.lang.String p0)`
- `public void setTimeout(java.util.List p0)`
- `public void setTimestamp(java.lang.Long p0)`
- `public void setTimetoken(java.lang.Long p0)`
- `public void setUserMetadata(java.lang.Object p0)`
- `public void setUuid(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder actualChannel(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult build()`
- `public com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder channel(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder event(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder hereNowRefresh(java.lang.Boolean p0)`
- `public com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder join(java.util.List p0)`
- `public com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder leave(java.util.List p0)`
- `public com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder occupancy(java.lang.Integer p0)`
- `public com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder state(com.google.gson.JsonElement p0)`
- `public com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder subscribedChannel(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder subscription(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder timeout(java.util.List p0)`
- `public com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder timestamp(java.lang.Long p0)`
- `public com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder timetoken(java.lang.Long p0)`
- `public java.lang.String toString()`
- `public com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder userMetadata(java.lang.Object p0)`
- `public com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult$PNPresenceEventResultBuilder uuid(java.lang.String p0)`

---

## public class `com.pubnub.api.models.consumer.pubsub.PNSignalResult`
extends `com.pubnub.api.models.consumer.pubsub.MessageResult`  

**Constructors:**
- `public PNSignalResult(com.pubnub.api.models.consumer.pubsub.BasePubSubResult p0, com.google.gson.JsonElement p1)`

**Methods:**
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.pubsub.files.PNFileEventResult`
implements `com.pubnub.api.models.consumer.pubsub.PNEvent`  

**Methods:**
- `public static com.pubnub.api.models.consumer.pubsub.files.PNFileEventResult$PNFileEventResultBuilder builder()`
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getChannel()`
- `public com.pubnub.api.models.consumer.files.PNDownloadableFile getFile()`
- `public com.google.gson.JsonElement getJsonMessage()`
- `public java.lang.Object getMessage()`
- `public java.lang.String getPublisher()`
- `public java.lang.Long getTimetoken()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.pubsub.files.PNFileEventResult$PNFileEventResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.pubsub.files.PNFileEventResult build()`
- `public com.pubnub.api.models.consumer.pubsub.files.PNFileEventResult$PNFileEventResultBuilder channel(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.pubsub.files.PNFileEventResult$PNFileEventResultBuilder file(com.pubnub.api.models.consumer.files.PNDownloadableFile p0)`
- `public com.pubnub.api.models.consumer.pubsub.files.PNFileEventResult$PNFileEventResultBuilder jsonMessage(com.google.gson.JsonElement p0)`
- `public com.pubnub.api.models.consumer.pubsub.files.PNFileEventResult$PNFileEventResultBuilder message(java.lang.Object p0)`
- `public com.pubnub.api.models.consumer.pubsub.files.PNFileEventResult$PNFileEventResultBuilder publisher(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.pubsub.files.PNFileEventResult$PNFileEventResultBuilder timetoken(java.lang.Long p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.pubsub.message_actions.PNMessageActionResult`
extends `com.pubnub.api.models.consumer.pubsub.objects.ObjectResult`  

**Methods:**
- `public static com.pubnub.api.models.consumer.pubsub.message_actions.PNMessageActionResult$PNMessageActionResultBuilder actionBuilder()`
- `public com.pubnub.api.models.consumer.message_actions.PNMessageAction getMessageAction()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.pubsub.message_actions.PNMessageActionResult$PNMessageActionResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.pubsub.message_actions.PNMessageActionResult build()`
- `public com.pubnub.api.models.consumer.pubsub.message_actions.PNMessageActionResult$PNMessageActionResultBuilder data(com.pubnub.api.models.consumer.message_actions.PNMessageAction p0)`
- `public com.pubnub.api.models.consumer.pubsub.message_actions.PNMessageActionResult$PNMessageActionResultBuilder event(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.pubsub.message_actions.PNMessageActionResult$PNMessageActionResultBuilder result(com.pubnub.api.models.consumer.pubsub.BasePubSubResult p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.pubsub.objects.ObjectPayload`

**Constructors:**
- `public ObjectPayload()`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public com.google.gson.JsonElement getData()`
- `public java.lang.String getEvent()`
- `public java.lang.String getSource()`
- `public java.lang.String getType()`
- `public java.lang.String getVersion()`
- `public int hashCode()`
- `public void setData(com.google.gson.JsonElement p0)`
- `public void setEvent(java.lang.String p0)`
- `public void setSource(java.lang.String p0)`
- `public void setType(java.lang.String p0)`
- `public void setVersion(java.lang.String p0)`
- `public java.lang.String toString()`

---

## public abstract class `com.pubnub.api.models.consumer.pubsub.objects.ObjectResult`<T extends java.lang.Object>
extends `com.pubnub.api.models.consumer.pubsub.BasePubSubResult`  

**Constructors:**
- `public ObjectResult(com.pubnub.api.models.consumer.pubsub.BasePubSubResult p0, java.lang.String p1, T p2)`

**Fields:**
- `protected T data`
- `protected java.lang.String event`

**Methods:**
- `public T getData()`
- `public java.lang.String getEvent()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.push.PNPushAddChannelResult`

**Methods:**
- `public static com.pubnub.api.models.consumer.push.PNPushAddChannelResult$PNPushAddChannelResultBuilder builder()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.push.PNPushAddChannelResult$PNPushAddChannelResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.push.PNPushAddChannelResult build()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.push.PNPushListProvisionsResult`

**Methods:**
- `public static com.pubnub.api.models.consumer.push.PNPushListProvisionsResult$PNPushListProvisionsResultBuilder builder()`
- `public java.util.List getChannels()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.push.PNPushListProvisionsResult$PNPushListProvisionsResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.push.PNPushListProvisionsResult build()`
- `public com.pubnub.api.models.consumer.push.PNPushListProvisionsResult$PNPushListProvisionsResultBuilder channels(java.util.List p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.push.PNPushRemoveAllChannelsResult`

**Methods:**
- `public static com.pubnub.api.models.consumer.push.PNPushRemoveAllChannelsResult$PNPushRemoveAllChannelsResultBuilder builder()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.push.PNPushRemoveAllChannelsResult$PNPushRemoveAllChannelsResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.push.PNPushRemoveAllChannelsResult build()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.push.PNPushRemoveChannelResult`

**Methods:**
- `public static com.pubnub.api.models.consumer.push.PNPushRemoveChannelResult$PNPushRemoveChannelResultBuilder builder()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.consumer.push.PNPushRemoveChannelResult$PNPushRemoveChannelResultBuilder`

**Methods:**
- `public com.pubnub.api.models.consumer.push.PNPushRemoveChannelResult build()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.consumer.push.payload.PushPayloadHelper`

**Constructors:**
- `public PushPayloadHelper()`

**Methods:**
- `public java.util.Map build()`
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper setApnsPayload(com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$APNSPayload p0)`
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper setCommonPayload(java.util.Map p0)`
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper setFcmPayload(com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$FCMPayload p0)`
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper setMpnsPayload(com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$MPNSPayload p0)`

---

## public static class `com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$APNSPayload`
implements `com.pubnub.api.models.consumer.push.payload.PushPayloadSerializer`  

**Constructors:**
- `public APNSPayload()`

**Methods:**
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$APNSPayload setApns2Configurations(java.util.List p0)`
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$APNSPayload setAps(com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$APNSPayload$APS p0)`
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$APNSPayload setCustom(java.util.Map p0)`
- `public java.util.Map toMap()`

---

## public static class `com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$APNSPayload$APNS2Configuration`
implements `com.pubnub.api.models.consumer.push.payload.PushPayloadSerializer`  

**Constructors:**
- `public APNS2Configuration()`

**Methods:**
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$APNSPayload$APNS2Configuration setCollapseId(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$APNSPayload$APNS2Configuration setExpiration(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$APNSPayload$APNS2Configuration setTargets(java.util.List p0)`
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$APNSPayload$APNS2Configuration setVersion(java.lang.String p0)`
- `public java.util.Map toMap()`

---

## public static class `com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$APNSPayload$APNS2Configuration$Target`
implements `com.pubnub.api.models.consumer.push.payload.PushPayloadSerializer`  

**Constructors:**
- `public Target()`

**Methods:**
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$APNSPayload$APNS2Configuration$Target setEnvironment(com.pubnub.api.enums.PNPushEnvironment p0)`
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$APNSPayload$APNS2Configuration$Target setExcludeDevices(java.util.List p0)`
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$APNSPayload$APNS2Configuration$Target setTopic(java.lang.String p0)`
- `public java.util.Map toMap()`

---

## public static class `com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$APNSPayload$APS`
implements `com.pubnub.api.models.consumer.push.payload.PushPayloadSerializer`  

**Constructors:**
- `public APS()`

**Methods:**
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$APNSPayload$APS setAlert(java.lang.Object p0)`
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$APNSPayload$APS setBadge(java.lang.Integer p0)`
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$APNSPayload$APS setSound(java.lang.String p0)`
- `public java.util.Map toMap()`

---

## public static class `com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$FCMPayload`
implements `com.pubnub.api.models.consumer.push.payload.PushPayloadSerializer`  

**Constructors:**
- `public FCMPayload()`

**Methods:**
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$FCMPayload setCustom(java.util.Map p0)`
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$FCMPayload setData(java.util.Map p0)`
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$FCMPayload setNotification(com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$FCMPayload$Notification p0)`
- `public java.util.Map toMap()`

---

## public static class `com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$FCMPayload$Notification`
implements `com.pubnub.api.models.consumer.push.payload.PushPayloadSerializer`  

**Constructors:**
- `public Notification()`

**Methods:**
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$FCMPayload$Notification set(java.lang.String p0, java.lang.Object p1)`
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$FCMPayload$Notification setBody(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$FCMPayload$Notification setClickAction(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$FCMPayload$Notification setImage(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$FCMPayload$Notification setParametersMap(java.util.Map p0)`
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$FCMPayload$Notification setTitle(java.lang.String p0)`
- `public java.util.Map toMap()`

---

## public static class `com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$MPNSPayload`
implements `com.pubnub.api.models.consumer.push.payload.PushPayloadSerializer`  

**Constructors:**
- `public MPNSPayload()`

**Methods:**
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$MPNSPayload setBackContent(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$MPNSPayload setBackTitle(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$MPNSPayload setCount(java.lang.Integer p0)`
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$MPNSPayload setCustom(java.util.Map p0)`
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$MPNSPayload setTitle(java.lang.String p0)`
- `public com.pubnub.api.models.consumer.push.payload.PushPayloadHelper$MPNSPayload setType(java.lang.String p0)`
- `public java.util.Map toMap()`

---

## public class `com.pubnub.api.models.server.DeleteMessagesEnvelope`

**Constructors:**
- `public DeleteMessagesEnvelope()`

**Methods:**
- `public java.lang.String getErrorMessage()`
- `public java.lang.Integer getStatus()`
- `public boolean isError()`
- `public void setError(boolean p0)`
- `public void setErrorMessage(java.lang.String p0)`
- `public void setStatus(java.lang.Integer p0)`

---

## public class `com.pubnub.api.models.server.Envelope`<T extends java.lang.Object>

**Constructors:**
- `public Envelope()`

**Methods:**
- `public java.lang.String getAction()`
- `public java.lang.String getMessage()`
- `public int getOccupancy()`
- `public T getPayload()`
- `public java.lang.String getService()`
- `public int getStatus()`
- `public com.google.gson.JsonElement getUuids()`
- `public boolean isError()`
- `public void setAction(java.lang.String p0)`
- `public void setError(boolean p0)`
- `public void setMessage(java.lang.String p0)`
- `public void setOccupancy(int p0)`
- `public void setPayload(T p0)`
- `public void setService(java.lang.String p0)`
- `public void setStatus(int p0)`
- `public void setUuids(com.google.gson.JsonElement p0)`

---

## public class `com.pubnub.api.models.server.FetchMessagesEnvelope`

**Constructors:**
- `public FetchMessagesEnvelope()`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.Map getChannels()`
- `public com.pubnub.api.models.server.FetchMessagesEnvelope$FetchMessagesPage getMore()`
- `public int hashCode()`
- `public void setChannels(java.util.Map p0)`
- `public void setMore(com.pubnub.api.models.server.FetchMessagesEnvelope$FetchMessagesPage p0)`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.server.FetchMessagesEnvelope$FetchMessagesPage`

**Constructors:**
- `public FetchMessagesPage()`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.Long getEnd()`
- `public java.lang.Integer getMax()`
- `public java.lang.Long getStart()`
- `public int hashCode()`
- `public void setEnd(java.lang.Long p0)`
- `public void setMax(java.lang.Integer p0)`
- `public void setStart(java.lang.Long p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.server.OriginationMetaData`

**Constructors:**
- `public OriginationMetaData()`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.Integer getRegion()`
- `public java.lang.Long getTimetoken()`
- `public int hashCode()`
- `public void setRegion(java.lang.Integer p0)`
- `public void setTimetoken(java.lang.Long p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.server.PresenceEnvelope`

**Constructors:**
- `public PresenceEnvelope()`

**Methods:**
- `public java.lang.String getAction()`
- `public com.google.gson.JsonElement getData()`
- `public java.lang.Integer getOccupancy()`
- `public java.lang.Long getTimestamp()`
- `public java.lang.String getUuid()`

---

## public class `com.pubnub.api.models.server.PublishMetaData`

**Constructors:**
- `public PublishMetaData()`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.Long getPublishTimetoken()`
- `public java.lang.Integer getRegion()`
- `public int hashCode()`
- `public void setPublishTimetoken(java.lang.Long p0)`
- `public void setRegion(java.lang.Integer p0)`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.server.SubscribeEnvelope`

**Constructors:**
- `public SubscribeEnvelope(java.util.List p0, com.pubnub.api.models.server.SubscribeMetadata p1)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.List getMessages()`
- `public com.pubnub.api.models.server.SubscribeMetadata getMetadata()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.server.SubscribeMessage`

**Methods:**
- `public static com.pubnub.api.models.server.SubscribeMessage$SubscribeMessageBuilder builder()`
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getChannel()`
- `public java.lang.String getFlags()`
- `public java.lang.String getIssuingClientId()`
- `public com.pubnub.api.models.server.OriginationMetaData getOriginationMetadata()`
- `public com.google.gson.JsonElement getPayload()`
- `public com.pubnub.api.models.server.PublishMetaData getPublishMetaData()`
- `public java.lang.String getShard()`
- `public java.lang.String getSubscribeKey()`
- `public java.lang.String getSubscriptionMatch()`
- `public java.lang.Integer getType()`
- `public com.google.gson.JsonElement getUserMetadata()`
- `public int hashCode()`
- `public void setChannel(java.lang.String p0)`
- `public void setFlags(java.lang.String p0)`
- `public void setIssuingClientId(java.lang.String p0)`
- `public void setOriginationMetadata(com.pubnub.api.models.server.OriginationMetaData p0)`
- `public void setPayload(com.google.gson.JsonElement p0)`
- `public void setPublishMetaData(com.pubnub.api.models.server.PublishMetaData p0)`
- `public void setShard(java.lang.String p0)`
- `public void setSubscribeKey(java.lang.String p0)`
- `public void setSubscriptionMatch(java.lang.String p0)`
- `public void setType(java.lang.Integer p0)`
- `public void setUserMetadata(com.google.gson.JsonElement p0)`
- `public boolean supportsEncryption()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.server.SubscribeMessage$SubscribeMessageBuilder`

**Methods:**
- `public com.pubnub.api.models.server.SubscribeMessage build()`
- `public com.pubnub.api.models.server.SubscribeMessage$SubscribeMessageBuilder channel(java.lang.String p0)`
- `public com.pubnub.api.models.server.SubscribeMessage$SubscribeMessageBuilder flags(java.lang.String p0)`
- `public com.pubnub.api.models.server.SubscribeMessage$SubscribeMessageBuilder issuingClientId(java.lang.String p0)`
- `public com.pubnub.api.models.server.SubscribeMessage$SubscribeMessageBuilder originationMetadata(com.pubnub.api.models.server.OriginationMetaData p0)`
- `public com.pubnub.api.models.server.SubscribeMessage$SubscribeMessageBuilder payload(com.google.gson.JsonElement p0)`
- `public com.pubnub.api.models.server.SubscribeMessage$SubscribeMessageBuilder publishMetaData(com.pubnub.api.models.server.PublishMetaData p0)`
- `public com.pubnub.api.models.server.SubscribeMessage$SubscribeMessageBuilder shard(java.lang.String p0)`
- `public com.pubnub.api.models.server.SubscribeMessage$SubscribeMessageBuilder subscribeKey(java.lang.String p0)`
- `public com.pubnub.api.models.server.SubscribeMessage$SubscribeMessageBuilder subscriptionMatch(java.lang.String p0)`
- `public java.lang.String toString()`
- `public com.pubnub.api.models.server.SubscribeMessage$SubscribeMessageBuilder type(java.lang.Integer p0)`
- `public com.pubnub.api.models.server.SubscribeMessage$SubscribeMessageBuilder userMetadata(com.google.gson.JsonElement p0)`

---

## public class `com.pubnub.api.models.server.SubscribeMetadata`

**Constructors:**
- `public SubscribeMetadata(java.lang.Long p0, java.lang.String p1)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getRegion()`
- `public java.lang.Long getTimetoken()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.server.access_manager.AccessManagerGrantPayload`

**Constructors:**
- `public AccessManagerGrantPayload()`

**Methods:**
- `public java.util.Map getAuthKeys()`
- `public java.lang.String getChannel()`
- `public com.google.gson.JsonElement getChannelGroups()`
- `public java.util.Map getChannels()`
- `public java.lang.String getLevel()`
- `public java.lang.String getSubscribeKey()`
- `public int getTtl()`
- `public java.util.Map getUuids()`

---

## public class `com.pubnub.api.models.server.access_manager.v3.GrantTokenRequestBody`

**Constructors:**
- `public GrantTokenRequestBody(java.lang.Integer p0, com.pubnub.api.models.server.access_manager.v3.GrantTokenRequestBody$GrantTokenPermissions p1)`

**Methods:**
- `public static com.pubnub.api.models.server.access_manager.v3.GrantTokenRequestBody$GrantTokenRequestBodyBuilder builder()`
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public com.pubnub.api.models.server.access_manager.v3.GrantTokenRequestBody$GrantTokenPermissions getPermissions()`
- `public java.lang.Integer getTtl()`
- `public int hashCode()`
- `public static com.pubnub.api.models.server.access_manager.v3.GrantTokenRequestBody of(java.lang.Integer p0, java.util.List p1, java.util.List p2, java.util.List p3, java.lang.Object p4, java.lang.String p5) throws com.pubnub.api.PubNubException`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.server.access_manager.v3.GrantTokenRequestBody$GrantTokenPermission`

**Constructors:**
- `public GrantTokenPermission(java.util.Map p0, java.util.Map p1, java.util.Map p2)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.Map getChannels()`
- `public java.util.Map getGroups()`
- `public java.util.Map getSpaces()`
- `public java.util.Map getUsers()`
- `public java.util.Map getUuids()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.server.access_manager.v3.GrantTokenRequestBody$GrantTokenRequestBodyBuilder`

**Methods:**
- `public com.pubnub.api.models.server.access_manager.v3.GrantTokenRequestBody build() throws com.pubnub.api.PubNubException`
- `public com.pubnub.api.models.server.access_manager.v3.GrantTokenRequestBody$GrantTokenRequestBodyBuilder channels(java.util.List p0)`
- `public com.pubnub.api.models.server.access_manager.v3.GrantTokenRequestBody$GrantTokenRequestBodyBuilder groups(java.util.List p0)`
- `public com.pubnub.api.models.server.access_manager.v3.GrantTokenRequestBody$GrantTokenRequestBodyBuilder meta(java.lang.Object p0)`
- `public java.lang.String toString()`
- `public com.pubnub.api.models.server.access_manager.v3.GrantTokenRequestBody$GrantTokenRequestBodyBuilder ttl(java.lang.Integer p0)`
- `public com.pubnub.api.models.server.access_manager.v3.GrantTokenRequestBody$GrantTokenRequestBodyBuilder uuid(java.lang.String p0)`
- `public com.pubnub.api.models.server.access_manager.v3.GrantTokenRequestBody$GrantTokenRequestBodyBuilder uuids(java.util.List p0)`

---

## public class `com.pubnub.api.models.server.access_manager.v3.RevokeTokenResponse`

**Constructors:**
- `public RevokeTokenResponse(int p0, com.pubnub.api.models.server.access_manager.v3.RevokeTokenResponse$RevokeTokenData p1, java.lang.String p2)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public com.pubnub.api.models.server.access_manager.v3.RevokeTokenResponse$RevokeTokenData getData()`
- `public java.lang.String getService()`
- `public int getStatus()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.server.access_manager.v3.RevokeTokenResponse$RevokeTokenData`

**Constructors:**
- `public RevokeTokenData(java.lang.String p0, java.lang.String p1)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getMessage()`
- `public java.lang.String getToken()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.server.files.FileUploadNotification`

**Constructors:**
- `public FileUploadNotification(java.lang.Object p0, com.pubnub.api.models.consumer.files.PNBaseFile p1)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public com.pubnub.api.models.consumer.files.PNBaseFile getFile()`
- `public java.lang.Object getMessage()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.server.files.FileUploadRequestDetails`

**Constructors:**
- `public FileUploadRequestDetails(java.lang.Integer p0, com.pubnub.api.models.consumer.files.PNFile p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, com.pubnub.api.models.server.files.FormField p5, java.util.List p6)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public com.pubnub.api.models.consumer.files.PNFile getData()`
- `public java.lang.String getExpirationDate()`
- `public java.util.List getFormFields()`
- `public com.pubnub.api.models.server.files.FormField getKeyFormField()`
- `public java.lang.String getMethod()`
- `public java.lang.Integer getStatus()`
- `public java.lang.String getUrl()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.server.files.FormField`

**Constructors:**
- `public FormField(java.lang.String p0, java.lang.String p1)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getKey()`
- `public java.lang.String getValue()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.server.files.GenerateUploadUrlPayload`

**Constructors:**
- `public GenerateUploadUrlPayload(java.lang.String p0)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getName()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.server.files.GeneratedUploadUrlResponse`

**Constructors:**
- `public GeneratedUploadUrlResponse(java.lang.Integer p0, com.pubnub.api.models.consumer.files.PNUploadedFile p1, com.pubnub.api.models.server.files.GeneratedUploadUrlResponse$FileUploadRequest p2)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public com.pubnub.api.models.consumer.files.PNUploadedFile getData()`
- `public com.pubnub.api.models.server.files.GeneratedUploadUrlResponse$FileUploadRequest getFileUploadRequest()`
- `public java.lang.Integer getStatus()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public static class `com.pubnub.api.models.server.files.GeneratedUploadUrlResponse$FileUploadRequest`

**Constructors:**
- `public FileUploadRequest(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.List p3)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.lang.String getExpirationDate()`
- `public java.util.List getFormFields()`
- `public java.lang.String getMethod()`
- `public java.lang.String getUrl()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.server.files.ListFilesResult`

**Constructors:**
- `public ListFilesResult(int p0, java.lang.String p1, int p2, java.util.Collection p3)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public int getCount()`
- `public java.util.Collection getData()`
- `public java.lang.String getNext()`
- `public int getStatus()`
- `public int hashCode()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.server.objects_api.EntityArrayEnvelope`<T extends java.lang.Object>
extends `com.pubnub.api.models.server.objects_api.EntityEnvelope`  

**Constructors:**
- `public EntityArrayEnvelope()`

**Fields:**
- `protected java.lang.String next`
- `protected java.lang.String prev`
- `protected java.lang.Integer totalCount`

**Methods:**
- `public java.lang.String getNext()`
- `public java.lang.String getPrev()`
- `public java.lang.Integer getTotalCount()`
- `public com.pubnub.api.models.consumer.PNPage nextPage()`
- `public com.pubnub.api.models.consumer.PNPage previousPage()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.server.objects_api.EntityEnvelope`<T extends java.lang.Object>

**Constructors:**
- `public EntityEnvelope()`

**Fields:**
- `protected T data`
- `protected int status`

**Methods:**
- `public T getData()`
- `public int getStatus()`

---

## public class `com.pubnub.api.models.server.objects_api.PatchMemberPayload`

**Constructors:**
- `public PatchMemberPayload(java.util.Collection p0, java.util.Collection p1)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.Collection getDelete()`
- `public java.util.Collection getSet()`
- `public int hashCode()`

---

## public class `com.pubnub.api.models.server.objects_api.PatchMembershipPayload`

**Constructors:**
- `public PatchMembershipPayload(java.util.Collection p0, java.util.Collection p1)`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.Collection getDelete()`
- `public java.util.Collection getSet()`
- `public int hashCode()`

---

## public class `com.pubnub.api.models.server.objects_api.SetChannelMetadataPayload`

**Constructors:**
- `public SetChannelMetadataPayload(java.lang.String p0, java.lang.String p1, java.lang.Object p2, java.lang.String p3, java.lang.String p4)`

**Methods:**
- `public java.lang.Object getCustom()`
- `public java.lang.String getDescription()`
- `public java.lang.String getName()`
- `public java.lang.String getStatus()`
- `public java.lang.String getType()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.server.objects_api.SetUUIDMetadataPayload`

**Constructors:**
- `public SetUUIDMetadataPayload(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.Object p4, java.lang.String p5, java.lang.String p6)`

**Methods:**
- `public java.lang.Object getCustom()`
- `public java.lang.String getEmail()`
- `public java.lang.String getExternalId()`
- `public java.lang.String getName()`
- `public java.lang.String getProfileUrl()`
- `public java.lang.String getStatus()`
- `public java.lang.String getType()`
- `public java.lang.String toString()`

---

## public class `com.pubnub.api.models.server.presence.WhereNowPayload`

**Constructors:**
- `public WhereNowPayload()`

**Methods:**
- `protected boolean canEqual(java.lang.Object p0)`
- `public boolean equals(java.lang.Object p0)`
- `public java.util.List getChannels()`
- `public int hashCode()`
- `public void setChannels(java.util.List p0)`
- `public java.lang.String toString()`

---

## public abstract interface `com.pubnub.api.services.AccessManagerService`

**Methods:**
- `public abstract retrofit2.Call grant(java.lang.String p0, java.util.Map p1)`
- `public abstract retrofit2.Call grantToken(java.lang.String p0, java.lang.Object p1, java.util.Map p2)`
- `public abstract retrofit2.Call revokeToken(java.lang.String p0, java.lang.String p1, java.util.Map p2)`

---

## public abstract interface `com.pubnub.api.services.ChannelGroupService`

**Methods:**
- `public abstract retrofit2.Call addChannelChannelGroup(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public abstract retrofit2.Call allChannelsChannelGroup(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public abstract retrofit2.Call deleteChannelGroup(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public abstract retrofit2.Call listAllChannelGroup(java.lang.String p0, java.util.Map p1)`
- `public abstract retrofit2.Call removeChannel(java.lang.String p0, java.lang.String p1, java.util.Map p2)`

---

## public abstract interface `com.pubnub.api.services.ChannelMetadataService`

**Methods:**
- `public abstract retrofit2.Call deleteChannelMetadata(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public abstract retrofit2.Call getChannelMetadata(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public abstract retrofit2.Call getChannelMetadata(java.lang.String p0, java.util.Map p1)`
- `public abstract retrofit2.Call getMembers(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public abstract retrofit2.Call patchMembers(java.lang.String p0, java.lang.String p1, com.pubnub.api.models.server.objects_api.PatchMemberPayload p2, java.util.Map p3)`
- `public abstract retrofit2.Call setChannelsMetadata(java.lang.String p0, java.lang.String p1, com.pubnub.api.models.server.objects_api.SetChannelMetadataPayload p2, java.util.Map p3)`

---

## public abstract interface `com.pubnub.api.services.ExtendedPresenceService`

**Methods:**
- `public abstract retrofit2.Call getState(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.Map p3)`
- `public abstract retrofit2.Call globalHereNow(java.lang.String p0, java.util.Map p1)`
- `public abstract retrofit2.Call hereNow(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public abstract retrofit2.Call setState(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.Map p3)`
- `public abstract retrofit2.Call whereNow(java.lang.String p0, java.lang.String p1, java.util.Map p2)`

---

## public abstract interface `com.pubnub.api.services.FilesService`

**Fields:**
- `public final static java.lang.String GET_FILE_URL`

**Methods:**
- `public abstract retrofit2.Call deleteFile(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.util.Map p4)`
- `public abstract retrofit2.Call downloadFile(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.util.Map p4)`
- `public abstract retrofit2.Call generateUploadUrl(java.lang.String p0, java.lang.String p1, com.pubnub.api.models.server.files.GenerateUploadUrlPayload p2, java.util.Map p3)`
- `public abstract retrofit2.Call listFiles(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public abstract retrofit2.Call notifyAboutFileUpload(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.util.Map p4)`

---

## public abstract interface `com.pubnub.api.services.HistoryService`

**Methods:**
- `public abstract retrofit2.Call deleteMessages(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public abstract retrofit2.Call fetchCount(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public abstract retrofit2.Call fetchHistory(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public abstract retrofit2.Call fetchMessages(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public abstract retrofit2.Call fetchMessagesWithActions(java.lang.String p0, java.lang.String p1, java.util.Map p2)`

---

## public abstract interface `com.pubnub.api.services.MessageActionService`

**Methods:**
- `public abstract retrofit2.Call addMessageAction(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.Object p3, java.util.Map p4)`
- `public abstract retrofit2.Call deleteMessageAction(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.util.Map p4)`
- `public abstract retrofit2.Call getMessageActions(java.lang.String p0, java.lang.String p1, java.util.Map p2)`

---

## public abstract interface `com.pubnub.api.services.PresenceService`

**Methods:**
- `public abstract retrofit2.Call heartbeat(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public abstract retrofit2.Call leave(java.lang.String p0, java.lang.String p1, java.util.Map p2)`

---

## public abstract interface `com.pubnub.api.services.PublishService`

**Methods:**
- `public abstract retrofit2.Call publish(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.util.Map p4)`
- `public abstract retrofit2.Call publishWithPost(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.Object p3, java.util.Map p4)`

---

## public abstract interface `com.pubnub.api.services.PushService`

**Methods:**
- `public abstract retrofit2.Call listChannelsForDevice(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public abstract retrofit2.Call listChannelsForDeviceApns2(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public abstract retrofit2.Call modifyChannelsForDevice(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public abstract retrofit2.Call modifyChannelsForDeviceApns2(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public abstract retrofit2.Call removeAllChannelsForDevice(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public abstract retrofit2.Call removeAllChannelsForDeviceApns2(java.lang.String p0, java.lang.String p1, java.util.Map p2)`

---

## public abstract interface `com.pubnub.api.services.S3Service`

**Methods:**
- `public abstract retrofit2.Call upload(java.lang.String p0, okhttp3.MultipartBody p1)`

---

## public abstract interface `com.pubnub.api.services.SignalService`

**Methods:**
- `public abstract retrofit2.Call signal(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.util.Map p4)`

---

## public abstract interface `com.pubnub.api.services.SubscribeService`

**Methods:**
- `public abstract retrofit2.Call subscribe(java.lang.String p0, java.lang.String p1, java.util.Map p2)`

---

## public abstract interface `com.pubnub.api.services.TimeService`

**Methods:**
- `public abstract retrofit2.Call fetchTime(java.util.Map p0)`

---

## public abstract interface `com.pubnub.api.services.UUIDMetadataService`

**Methods:**
- `public abstract retrofit2.Call deleteUUIDMetadata(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public abstract retrofit2.Call getMemberships(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public abstract retrofit2.Call getUUIDMetadata(java.lang.String p0, java.lang.String p1, java.util.Map p2)`
- `public abstract retrofit2.Call getUUIDMetadata(java.lang.String p0, java.util.Map p1)`
- `public abstract retrofit2.Call patchMembership(java.lang.String p0, java.lang.String p1, com.pubnub.api.models.server.objects_api.PatchMembershipPayload p2, java.util.Map p3)`
- `public abstract retrofit2.Call setUUIDsMetadata(java.lang.String p0, java.lang.String p1, com.pubnub.api.models.server.objects_api.SetUUIDMetadataPayload p2, java.util.Map p3)`

---

## public class `com.pubnub.api.utils.UnwrapSingleField`<T extends java.lang.Object>
implements `com.google.gson.JsonDeserializer<T>`  

**Constructors:**
- `public UnwrapSingleField()`

**Methods:**
- `public T deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException`

---

## public class `com.pubnub.api.vendor.Base64`

**Fields:**
- `public final static int CRLF`
- `public final static int DEFAULT`
- `public final static int NO_CLOSE`
- `public final static int NO_PADDING`
- `public final static int NO_WRAP`
- `public final static int URL_SAFE`

**Methods:**
- `public static byte[] decode(byte[] p0, int p1)`
- `public static byte[] decode(byte[] p0, int p1, int p2, int p3)`
- `public static byte[] decode(java.lang.String p0, int p1)`
- `public static byte[] encode(byte[] p0, int p1)`
- `public static byte[] encode(byte[] p0, int p1, int p2, int p3)`
- `public static java.lang.String encodeToString(byte[] p0, int p1)`
- `public static java.lang.String encodeToString(byte[] p0, int p1, int p2, int p3)`

---

## public class `com.pubnub.api.vendor.Crypto`

**Constructors:**
- `public Crypto(java.lang.String p0)`
- `public Crypto(java.lang.String p0, boolean p1)`
- `public Crypto(java.lang.String p0, java.lang.String p1)`

**Methods:**
- `public java.lang.String decrypt(java.lang.String p0) throws com.pubnub.api.PubNubException`
- `public java.lang.String encrypt(java.lang.String p0) throws com.pubnub.api.PubNubException`
- `public static byte[] hexEncode(byte[] p0) throws com.pubnub.api.PubNubException`
- `public static byte[] hexStringToByteArray(java.lang.String p0)`
- `public static byte[] md5(java.lang.String p0) throws com.pubnub.api.PubNubException`
- `public static byte[] sha256(byte[] p0) throws com.pubnub.api.PubNubException`

---

## public final class `com.pubnub.api.vendor.FileEncryptionUtil`

**Fields:**
- `public final static int BUFFER_SIZE_BYTES`

**Methods:**
- `public static java.io.InputStream decrypt(java.lang.String p0, java.io.InputStream p1) throws com.pubnub.api.PubNubException`
- `public static java.lang.String effectiveCipherKey(com.pubnub.api.PubNub p0, java.lang.String p1)`
- `public static java.io.InputStream encrypt(java.lang.String p0, java.io.InputStream p1) throws com.pubnub.api.PubNubException`
- `public static byte[] encryptToBytes(java.lang.String p0, byte[] p1) throws com.pubnub.api.PubNubException`

---

## public class `com.pubnub.api.workers.SubscribeMessageProcessor`

**Constructors:**
- `public SubscribeMessageProcessor(com.pubnub.api.PubNub p0, com.pubnub.api.managers.DuplicationManager p1)`

**Fields:**
- `public final static int TYPE_FILES`
- `public final static int TYPE_MESSAGE`

---

## public class `com.pubnub.api.workers.SubscribeMessageWorker`
implements `java.lang.Runnable`  

**Constructors:**
- `public SubscribeMessageWorker(com.pubnub.api.managers.ListenerManager p0, java.util.concurrent.LinkedBlockingQueue p1, com.pubnub.api.workers.SubscribeMessageProcessor p2)`

**Methods:**
- `public void run()`

---

