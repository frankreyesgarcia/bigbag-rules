# API Specification: com.google.cloud:google-cloud-pubsublite 0.18.0

This file lists all exported types and their public API surface.
Use it to look up correct method signatures when fixing compilation errors.

---

## public abstract interface `com.google.cloud.pubsublite.AdminClient`
implements `com.google.cloud.pubsublite.internal.ApiBackgroundResource`  

**Methods:**
- `public static com.google.cloud.pubsublite.AdminClient create(com.google.cloud.pubsublite.AdminClientSettings p0) throws com.google.api.gax.rpc.ApiException`
- `public abstract com.google.api.core.ApiFuture createReservation(com.google.cloud.pubsublite.proto.Reservation p0)`
- `public default com.google.api.core.ApiFuture createSubscription(com.google.cloud.pubsublite.proto.Subscription p0)`
- `public abstract com.google.api.core.ApiFuture createSubscription(com.google.cloud.pubsublite.proto.Subscription p0, com.google.cloud.pubsublite.BacklogLocation p1)`
- `public abstract com.google.api.core.ApiFuture createTopic(com.google.cloud.pubsublite.proto.Topic p0)`
- `public abstract com.google.api.core.ApiFuture deleteReservation(com.google.cloud.pubsublite.ReservationPath p0)`
- `public abstract com.google.api.core.ApiFuture deleteSubscription(com.google.cloud.pubsublite.SubscriptionPath p0)`
- `public abstract com.google.api.core.ApiFuture deleteTopic(com.google.cloud.pubsublite.TopicPath p0)`
- `public abstract com.google.api.core.ApiFuture getReservation(com.google.cloud.pubsublite.ReservationPath p0)`
- `public abstract com.google.api.core.ApiFuture getSubscription(com.google.cloud.pubsublite.SubscriptionPath p0)`
- `public abstract com.google.api.core.ApiFuture getTopic(com.google.cloud.pubsublite.TopicPath p0)`
- `public abstract com.google.api.core.ApiFuture getTopicPartitionCount(com.google.cloud.pubsublite.TopicPath p0)`
- `public abstract com.google.api.core.ApiFuture listReservationTopics(com.google.cloud.pubsublite.ReservationPath p0)`
- `public abstract com.google.api.core.ApiFuture listReservations(com.google.cloud.pubsublite.LocationPath p0)`
- `public abstract com.google.api.core.ApiFuture listSubscriptions(com.google.cloud.pubsublite.LocationPath p0)`
- `public abstract com.google.api.core.ApiFuture listTopicSubscriptions(com.google.cloud.pubsublite.TopicPath p0)`
- `public abstract com.google.api.core.ApiFuture listTopics(com.google.cloud.pubsublite.LocationPath p0)`
- `public abstract com.google.cloud.pubsublite.CloudRegion region()`
- `public abstract com.google.api.gax.longrunning.OperationFuture seekSubscription(com.google.cloud.pubsublite.SubscriptionPath p0, com.google.cloud.pubsublite.SeekTarget p1)`
- `public abstract com.google.api.core.ApiFuture updateReservation(com.google.cloud.pubsublite.proto.Reservation p0, com.google.protobuf.FieldMask p1)`
- `public abstract com.google.api.core.ApiFuture updateSubscription(com.google.cloud.pubsublite.proto.Subscription p0, com.google.protobuf.FieldMask p1)`
- `public abstract com.google.api.core.ApiFuture updateTopic(com.google.cloud.pubsublite.proto.Topic p0, com.google.protobuf.FieldMask p1)`

---

## public abstract class `com.google.cloud.pubsublite.AdminClientSettings`
annotations: @com.google.auto.value.AutoValue  

**Constructors:**
- `public AdminClientSettings()`

**Methods:**
- `public static com.google.cloud.pubsublite.AdminClientSettings$Builder newBuilder()`

---

## public abstract static class `com.google.cloud.pubsublite.AdminClientSettings$Builder`
annotations: @com.google.auto.value.AutoValue$Builder  

**Constructors:**
- `public Builder()`

**Methods:**
- `public abstract com.google.cloud.pubsublite.AdminClientSettings build()`
- `public abstract com.google.cloud.pubsublite.AdminClientSettings$Builder setRegion(com.google.cloud.pubsublite.CloudRegion p0)`
- `public abstract com.google.cloud.pubsublite.AdminClientSettings$Builder setRetrySettings(com.google.api.gax.retrying.RetrySettings p0)`
- `public abstract com.google.cloud.pubsublite.AdminClientSettings$Builder setServiceClient(com.google.cloud.pubsublite.v1.AdminServiceClient p0)`

---

## public final enum `com.google.cloud.pubsublite.BacklogLocation`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.google.cloud.pubsublite.BacklogLocation BEGINNING`
- `public final static com.google.cloud.pubsublite.BacklogLocation END`

---

## public abstract class `com.google.cloud.pubsublite.CloudRegion`
annotations: @com.google.auto.value.AutoValue  
implements `java.io.Serializable`  

**Constructors:**
- `public CloudRegion()`

**Methods:**
- `public static com.google.cloud.pubsublite.CloudRegion of(java.lang.String p0) throws com.google.api.gax.rpc.ApiException`
- `public java.lang.String toString()`
- `public abstract java.lang.String value()`

---

## public abstract class `com.google.cloud.pubsublite.CloudRegionOrZone`
annotations: @com.google.auto.value.AutoOneOf  
implements `java.io.Serializable`  

**Constructors:**
- `public CloudRegionOrZone()`

**Methods:**
- `public com.google.cloud.pubsublite.CloudRegion extractRegion()`
- `public abstract com.google.cloud.pubsublite.CloudRegionOrZone$Kind getKind()`
- `public static com.google.cloud.pubsublite.CloudRegionOrZone of(com.google.cloud.pubsublite.CloudRegion p0)`
- `public static com.google.cloud.pubsublite.CloudRegionOrZone of(com.google.cloud.pubsublite.CloudZone p0)`
- `public static com.google.cloud.pubsublite.CloudRegionOrZone parse(java.lang.String p0) throws com.google.api.gax.rpc.ApiException`
- `public abstract com.google.cloud.pubsublite.CloudRegion region()`
- `public java.lang.String toString()`
- `public abstract com.google.cloud.pubsublite.CloudZone zone()`

---

## public final static enum `com.google.cloud.pubsublite.CloudRegionOrZone$Kind`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.google.cloud.pubsublite.CloudRegionOrZone$Kind REGION`
- `public final static com.google.cloud.pubsublite.CloudRegionOrZone$Kind ZONE`

---

## public abstract class `com.google.cloud.pubsublite.CloudZone`
annotations: @com.google.auto.value.AutoValue  
implements `java.io.Serializable`  

**Constructors:**
- `public CloudZone()`

**Methods:**
- `public static com.google.cloud.pubsublite.CloudZone of(com.google.cloud.pubsublite.CloudRegion p0, char p1)`
- `public static com.google.cloud.pubsublite.CloudZone parse(java.lang.String p0) throws com.google.api.gax.rpc.ApiException`
- `public abstract com.google.cloud.pubsublite.CloudRegion region()`
- `public final java.lang.String toString()`
- `public abstract char zoneId()`

---

## public class `com.google.cloud.pubsublite.Constants`

**Fields:**
- `public final static com.google.api.gax.retrying.RetrySettings DEFAULT_RETRY_SETTINGS`
- `public final static long MAX_PUBLISH_BATCH_BYTES`
- `public final static long MAX_PUBLISH_BATCH_COUNT`

---

## public final class `com.google.cloud.pubsublite.Endpoints`

**Methods:**
- `public static java.lang.String regionalEndpoint(com.google.cloud.pubsublite.CloudRegion p0)`

---

## public final class `com.google.cloud.pubsublite.ErrorCodes`

**Fields:**
- `public final static com.google.common.collect.ImmutableSet STREAM_RETRYABLE_CODES`

**Methods:**
- `public static boolean IsRetryableForStreams(com.google.api.gax.rpc.StatusCode$Code p0)`

---

## public abstract class `com.google.cloud.pubsublite.LocationPath`
annotations: @com.google.auto.value.AutoValue  
implements `java.io.Serializable`  

**Constructors:**
- `public LocationPath()`

**Methods:**
- `public abstract com.google.cloud.pubsublite.CloudRegionOrZone location()`
- `public static com.google.cloud.pubsublite.LocationPath$Builder newBuilder()`
- `public static com.google.cloud.pubsublite.LocationPath parse(java.lang.String p0) throws com.google.api.gax.rpc.ApiException`
- `public abstract com.google.cloud.pubsublite.ProjectIdOrNumber project()`
- `public com.google.cloud.pubsublite.ProjectPath projectPath()`
- `public abstract com.google.cloud.pubsublite.LocationPath$Builder toBuilder()`
- `public java.lang.String toString()`

---

## public abstract static class `com.google.cloud.pubsublite.LocationPath$Builder`
annotations: @com.google.auto.value.AutoValue$Builder  
extends `com.google.cloud.pubsublite.ProjectLocationBuilderHelper`  

**Constructors:**
- `public Builder()`

**Methods:**
- `public abstract com.google.cloud.pubsublite.LocationPath build()`

---

## public abstract class `com.google.cloud.pubsublite.Message`
annotations: @com.google.auto.value.AutoValue  

**Constructors:**
- `public Message()`

**Methods:**
- `public abstract com.google.common.collect.ImmutableListMultimap attributes()`
- `public static com.google.cloud.pubsublite.Message$Builder builder()`
- `public abstract com.google.protobuf.ByteString data()`
- `public abstract java.util.Optional eventTime()`
- `public static com.google.cloud.pubsublite.Message fromProto(com.google.cloud.pubsublite.proto.PubSubMessage p0)`
- `public abstract com.google.protobuf.ByteString key()`
- `public abstract com.google.cloud.pubsublite.Message$Builder toBuilder()`
- `public com.google.cloud.pubsublite.proto.PubSubMessage toProto()`

---

## public abstract static class `com.google.cloud.pubsublite.Message$Builder`
annotations: @com.google.auto.value.AutoValue$Builder  

**Constructors:**
- `public Builder()`

**Methods:**
- `public abstract com.google.cloud.pubsublite.Message build()`
- `public abstract com.google.cloud.pubsublite.Message$Builder setAttributes(com.google.common.collect.ImmutableListMultimap p0)`
- `public abstract com.google.cloud.pubsublite.Message$Builder setData(com.google.protobuf.ByteString p0)`
- `public abstract com.google.cloud.pubsublite.Message$Builder setEventTime(com.google.protobuf.Timestamp p0)`
- `public abstract com.google.cloud.pubsublite.Message$Builder setKey(com.google.protobuf.ByteString p0)`

---

## public abstract class `com.google.cloud.pubsublite.MessageMetadata`
annotations: @com.google.auto.value.AutoValue  

**Constructors:**
- `public MessageMetadata()`

**Methods:**
- `public static com.google.cloud.pubsublite.MessageMetadata decode(java.lang.String p0) throws com.google.api.gax.rpc.ApiException`
- `public java.lang.String encode()`
- `public static com.google.cloud.pubsublite.MessageMetadata of(com.google.cloud.pubsublite.Partition p0, com.google.cloud.pubsublite.Offset p1)`
- `public abstract com.google.cloud.pubsublite.Offset offset()`
- `public abstract com.google.cloud.pubsublite.Partition partition()`

---

## public abstract interface `com.google.cloud.pubsublite.MessageTransformer`<FromT extends java.lang.Object, ToT extends java.lang.Object>

**Methods:**
- `public abstract ToT transform(FromT p0) throws com.google.api.gax.rpc.ApiException`

---

## public abstract class `com.google.cloud.pubsublite.Offset`
annotations: @com.google.auto.value.AutoValue  
implements `java.io.Serializable`, `java.lang.Comparable<com.google.cloud.pubsublite.Offset>`  

**Constructors:**
- `public Offset()`

**Methods:**
- `public int compareTo(com.google.cloud.pubsublite.Offset p0)`
- `public static com.google.cloud.pubsublite.Offset of(long p0)`
- `public abstract long value()`

---

## public abstract class `com.google.cloud.pubsublite.Partition`
annotations: @com.google.auto.value.AutoValue  
implements `java.io.Serializable`  

**Constructors:**
- `public Partition()`

**Methods:**
- `public static com.google.cloud.pubsublite.Partition of(long p0) throws com.google.api.gax.rpc.ApiException`
- `public abstract long value()`

---

## public final class `com.google.cloud.pubsublite.PartitionLookupUtils`

**Methods:**
- `public static int numPartitions(com.google.cloud.pubsublite.SubscriptionPath p0) throws com.google.api.gax.rpc.ApiException`
- `public static int numPartitions(com.google.cloud.pubsublite.SubscriptionPath p0, com.google.cloud.pubsublite.AdminClient p1) throws com.google.api.gax.rpc.ApiException`
- `public static int numPartitions(com.google.cloud.pubsublite.TopicPath p0) throws com.google.api.gax.rpc.ApiException`
- `public static int numPartitions(com.google.cloud.pubsublite.TopicPath p0, com.google.cloud.pubsublite.AdminClient p1) throws com.google.api.gax.rpc.ApiException`

---

## public abstract class `com.google.cloud.pubsublite.ProjectId`
annotations: @com.google.auto.value.AutoValue  
implements `java.io.Serializable`  

**Constructors:**
- `public ProjectId()`

**Methods:**
- `public static com.google.cloud.pubsublite.ProjectId of(java.lang.String p0) throws com.google.api.gax.rpc.ApiException`
- `public java.lang.String toString()`
- `public abstract java.lang.String value()`

---

## public abstract class `com.google.cloud.pubsublite.ProjectIdOrNumber`
annotations: @com.google.auto.value.AutoOneOf  
implements `java.io.Serializable`  

**Constructors:**
- `public ProjectIdOrNumber()`

**Methods:**
- `public abstract com.google.cloud.pubsublite.ProjectIdOrNumber$Kind getKind()`
- `public abstract com.google.cloud.pubsublite.ProjectId name()`
- `public abstract com.google.cloud.pubsublite.ProjectNumber number()`
- `public static com.google.cloud.pubsublite.ProjectIdOrNumber of(com.google.cloud.pubsublite.ProjectId p0)`
- `public static com.google.cloud.pubsublite.ProjectIdOrNumber of(com.google.cloud.pubsublite.ProjectNumber p0)`
- `public java.lang.String toString()`

---

## public abstract class `com.google.cloud.pubsublite.ProjectNumber`
annotations: @com.google.auto.value.AutoValue  
implements `java.io.Serializable`  

**Constructors:**
- `public ProjectNumber()`

**Methods:**
- `public static com.google.cloud.pubsublite.ProjectNumber of(long p0) throws com.google.api.gax.rpc.ApiException`
- `public java.lang.String toString()`
- `public abstract long value()`

---

## public abstract class `com.google.cloud.pubsublite.ProjectPath`
annotations: @com.google.auto.value.AutoValue  
implements `java.io.Serializable`  

**Constructors:**
- `public ProjectPath()`

**Methods:**
- `public static com.google.cloud.pubsublite.ProjectPath$Builder newBuilder()`
- `public static com.google.cloud.pubsublite.ProjectPath parse(java.lang.String p0) throws com.google.api.gax.rpc.ApiException`
- `public abstract com.google.cloud.pubsublite.ProjectIdOrNumber project()`
- `public abstract com.google.cloud.pubsublite.ProjectPath$Builder toBuilder()`
- `public java.lang.String toString()`

---

## public abstract static class `com.google.cloud.pubsublite.ProjectPath$Builder`
annotations: @com.google.auto.value.AutoValue$Builder  
extends `com.google.cloud.pubsublite.ProjectBuilderHelper`  

**Constructors:**
- `public Builder()`

**Methods:**
- `public abstract com.google.cloud.pubsublite.ProjectPath build()`

---

## public abstract class `com.google.cloud.pubsublite.ReservationName`
annotations: @com.google.auto.value.AutoValue  
implements `java.io.Serializable`  

**Constructors:**
- `public ReservationName()`

**Methods:**
- `public static com.google.cloud.pubsublite.ReservationName of(java.lang.String p0) throws com.google.api.gax.rpc.ApiException`
- `public java.lang.String toString()`
- `public abstract java.lang.String value()`

---

## public abstract class `com.google.cloud.pubsublite.ReservationPath`
annotations: @com.google.auto.value.AutoValue  
implements `java.io.Serializable`  

**Constructors:**
- `public ReservationPath()`

**Methods:**
- `public abstract com.google.cloud.pubsublite.CloudRegion location()`
- `public com.google.cloud.pubsublite.LocationPath locationPath()`
- `public abstract com.google.cloud.pubsublite.ReservationName name()`
- `public static com.google.cloud.pubsublite.ReservationPath$Builder newBuilder()`
- `public static com.google.cloud.pubsublite.ReservationPath parse(java.lang.String p0) throws com.google.api.gax.rpc.ApiException`
- `public abstract com.google.cloud.pubsublite.ProjectIdOrNumber project()`
- `public abstract com.google.cloud.pubsublite.ReservationPath$Builder toBuilder()`
- `public java.lang.String toString()`

---

## public abstract static class `com.google.cloud.pubsublite.ReservationPath$Builder`
annotations: @com.google.auto.value.AutoValue$Builder  
extends `com.google.cloud.pubsublite.ProjectBuilderHelper`  

**Constructors:**
- `public Builder()`

**Methods:**
- `public abstract com.google.cloud.pubsublite.ReservationPath build()`
- `public abstract com.google.cloud.pubsublite.ReservationPath$Builder setLocation(com.google.cloud.pubsublite.CloudRegion p0)`
- `public abstract com.google.cloud.pubsublite.ReservationPath$Builder setName(com.google.cloud.pubsublite.ReservationName p0)`

---

## public abstract class `com.google.cloud.pubsublite.SeekTarget`
annotations: @com.google.auto.value.AutoOneOf  
implements `java.io.Serializable`  

**Constructors:**
- `public SeekTarget()`

**Methods:**
- `public abstract com.google.cloud.pubsublite.BacklogLocation backlogLocation()`
- `public abstract com.google.protobuf.Timestamp eventTime()`
- `public abstract com.google.cloud.pubsublite.SeekTarget$Kind getKind()`
- `public static com.google.cloud.pubsublite.SeekTarget of(com.google.cloud.pubsublite.BacklogLocation p0)`
- `public static com.google.cloud.pubsublite.SeekTarget ofEventTime(com.google.protobuf.Timestamp p0)`
- `public static com.google.cloud.pubsublite.SeekTarget ofPublishTime(com.google.protobuf.Timestamp p0)`
- `public abstract com.google.protobuf.Timestamp publishTime()`

---

## public final static enum `com.google.cloud.pubsublite.SeekTarget$Kind`
extends `java.lang.Enum`  

**Fields:**
- `public final static com.google.cloud.pubsublite.SeekTarget$Kind BACKLOG_LOCATION`
- `public final static com.google.cloud.pubsublite.SeekTarget$Kind EVENT_TIME`
- `public final static com.google.cloud.pubsublite.SeekTarget$Kind PUBLISH_TIME`

---

## public abstract class `com.google.cloud.pubsublite.SequencedMessage`
annotations: @com.google.auto.value.AutoValue  

**Constructors:**
- `public SequencedMessage()`

**Methods:**
- `public abstract long byteSize()`
- `public static com.google.cloud.pubsublite.SequencedMessage fromProto(com.google.cloud.pubsublite.proto.SequencedMessage p0)`
- `public abstract com.google.cloud.pubsublite.Message message()`
- `public static com.google.cloud.pubsublite.SequencedMessage of(com.google.cloud.pubsublite.Message p0, com.google.protobuf.Timestamp p1, com.google.cloud.pubsublite.Offset p2, long p3)`
- `public abstract com.google.cloud.pubsublite.Offset offset()`
- `public abstract com.google.protobuf.Timestamp publishTime()`
- `public com.google.cloud.pubsublite.proto.SequencedMessage toProto()`

---

## public abstract class `com.google.cloud.pubsublite.SubscriptionName`
annotations: @com.google.auto.value.AutoValue  
implements `java.io.Serializable`  

**Constructors:**
- `public SubscriptionName()`

**Methods:**
- `public static com.google.cloud.pubsublite.SubscriptionName of(java.lang.String p0) throws com.google.api.gax.rpc.ApiException`
- `public java.lang.String toString()`
- `public abstract java.lang.String value()`

---

## public abstract class `com.google.cloud.pubsublite.SubscriptionPath`
annotations: @com.google.auto.value.AutoValue  
implements `java.io.Serializable`  

**Constructors:**
- `public SubscriptionPath()`

**Methods:**
- `public abstract com.google.cloud.pubsublite.CloudRegionOrZone location()`
- `public com.google.cloud.pubsublite.LocationPath locationPath()`
- `public abstract com.google.cloud.pubsublite.SubscriptionName name()`
- `public static com.google.cloud.pubsublite.SubscriptionPath$Builder newBuilder()`
- `public static com.google.cloud.pubsublite.SubscriptionPath parse(java.lang.String p0) throws com.google.api.gax.rpc.ApiException`
- `public abstract com.google.cloud.pubsublite.ProjectIdOrNumber project()`
- `public abstract com.google.cloud.pubsublite.SubscriptionPath$Builder toBuilder()`
- `public java.lang.String toString()`

---

## public abstract static class `com.google.cloud.pubsublite.SubscriptionPath$Builder`
annotations: @com.google.auto.value.AutoValue$Builder  
extends `com.google.cloud.pubsublite.ProjectBuilderHelper`  

**Constructors:**
- `public Builder()`

**Methods:**
- `public abstract com.google.cloud.pubsublite.SubscriptionPath build()`
- `public com.google.cloud.pubsublite.SubscriptionPath$Builder setLocation(com.google.cloud.pubsublite.CloudZone p0)`
- `public abstract com.google.cloud.pubsublite.SubscriptionPath$Builder setName(com.google.cloud.pubsublite.SubscriptionName p0)`

---

## public abstract class `com.google.cloud.pubsublite.TopicName`
annotations: @com.google.auto.value.AutoValue  
implements `java.io.Serializable`  

**Constructors:**
- `public TopicName()`

**Methods:**
- `public static com.google.cloud.pubsublite.TopicName of(java.lang.String p0) throws com.google.api.gax.rpc.ApiException`
- `public java.lang.String toString()`
- `public abstract java.lang.String value()`

---

## public abstract class `com.google.cloud.pubsublite.TopicPath`
annotations: @com.google.auto.value.AutoValue  
implements `java.io.Serializable`  

**Constructors:**
- `public TopicPath()`

**Methods:**
- `public abstract com.google.cloud.pubsublite.CloudRegionOrZone location()`
- `public com.google.cloud.pubsublite.LocationPath locationPath()`
- `public abstract com.google.cloud.pubsublite.TopicName name()`
- `public static com.google.cloud.pubsublite.TopicPath$Builder newBuilder()`
- `public static com.google.cloud.pubsublite.TopicPath parse(java.lang.String p0) throws com.google.api.gax.rpc.ApiException`
- `public abstract com.google.cloud.pubsublite.ProjectIdOrNumber project()`
- `public abstract com.google.cloud.pubsublite.TopicPath$Builder toBuilder()`
- `public java.lang.String toString()`

---

## public abstract static class `com.google.cloud.pubsublite.TopicPath$Builder`
annotations: @com.google.auto.value.AutoValue$Builder  
extends `com.google.cloud.pubsublite.ProjectBuilderHelper`  

**Constructors:**
- `public Builder()`

**Methods:**
- `public abstract com.google.cloud.pubsublite.TopicPath build()`
- `public com.google.cloud.pubsublite.TopicPath$Builder setLocation(com.google.cloud.pubsublite.CloudZone p0)`
- `public abstract com.google.cloud.pubsublite.TopicPath$Builder setName(com.google.cloud.pubsublite.TopicName p0)`

---

## public abstract class `com.google.cloud.pubsublite.cloudpubsub.FlowControlSettings`
annotations: @com.google.auto.value.AutoValue  
implements `java.io.Serializable`  

**Constructors:**
- `public FlowControlSettings()`

**Methods:**
- `public static com.google.cloud.pubsublite.cloudpubsub.FlowControlSettings$Builder builder()`
- `public abstract long bytesOutstanding()`
- `public abstract long messagesOutstanding()`

---

## public abstract static class `com.google.cloud.pubsublite.cloudpubsub.FlowControlSettings$Builder`
annotations: @com.google.auto.value.AutoValue$Builder  

**Constructors:**
- `public Builder()`

**Methods:**
- `public com.google.cloud.pubsublite.cloudpubsub.FlowControlSettings build() throws com.google.api.gax.rpc.ApiException`
- `public abstract com.google.cloud.pubsublite.cloudpubsub.FlowControlSettings$Builder setBytesOutstanding(long p0)`
- `public abstract com.google.cloud.pubsublite.cloudpubsub.FlowControlSettings$Builder setMessagesOutstanding(long p0)`

---

## public abstract interface `com.google.cloud.pubsublite.cloudpubsub.KeyExtractor`

**Fields:**
- `public final static com.google.cloud.pubsublite.cloudpubsub.KeyExtractor DEFAULT`

**Methods:**
- `public abstract com.google.protobuf.ByteString extractKey(com.google.pubsub.v1.PubsubMessage p0) throws com.google.api.gax.rpc.ApiException`

---

## public class `com.google.cloud.pubsublite.cloudpubsub.MessageTransforms`

**Fields:**
- `public final static java.lang.String PUBSUB_LITE_EVENT_TIME_TIMESTAMP_PROTO`

**Methods:**
- `public static com.google.protobuf.Timestamp decodeAttributeEventTime(java.lang.String p0) throws com.google.api.gax.rpc.ApiException`
- `public static java.lang.String encodeAttributeEventTime(com.google.protobuf.Timestamp p0)`
- `public static com.google.cloud.pubsublite.MessageTransformer fromCpsPublishTransformer(com.google.cloud.pubsublite.cloudpubsub.KeyExtractor p0)`
- `public static com.google.cloud.pubsublite.MessageTransformer toCpsPublishTransformer()`
- `public static com.google.cloud.pubsublite.MessageTransformer toCpsSubscribeTransformer()`

---

## public abstract interface `com.google.cloud.pubsublite.cloudpubsub.NackHandler`

**Methods:**
- `public default com.google.api.core.ApiFuture nack(com.google.pubsub.v1.PubsubMessage p0)`

---

## public abstract interface `com.google.cloud.pubsublite.cloudpubsub.Publisher`
implements `com.google.api.core.ApiService`, `com.google.cloud.pubsub.v1.PublisherInterface`  

**Methods:**
- `public static com.google.cloud.pubsublite.cloudpubsub.Publisher create(com.google.cloud.pubsublite.cloudpubsub.PublisherSettings p0) throws com.google.api.gax.rpc.ApiException`

---

## public abstract class `com.google.cloud.pubsublite.cloudpubsub.PublisherSettings`
annotations: @com.google.auto.value.AutoValue  

**Constructors:**
- `public PublisherSettings()`

**Fields:**
- `public final static com.google.api.gax.batching.BatchingSettings DEFAULT_BATCHING_SETTINGS`

**Methods:**
- `public static com.google.cloud.pubsublite.cloudpubsub.PublisherSettings$Builder newBuilder()`

---

## public abstract static class `com.google.cloud.pubsublite.cloudpubsub.PublisherSettings$Builder`
annotations: @com.google.auto.value.AutoValue$Builder  

**Constructors:**
- `public Builder()`

**Methods:**
- `public abstract com.google.cloud.pubsublite.cloudpubsub.PublisherSettings build()`
- `public abstract com.google.cloud.pubsublite.cloudpubsub.PublisherSettings$Builder setAdminClient(com.google.cloud.pubsublite.AdminClient p0)`
- `public abstract com.google.cloud.pubsublite.cloudpubsub.PublisherSettings$Builder setBatchingSettings(com.google.api.gax.batching.BatchingSettings p0)`
- `public abstract com.google.cloud.pubsublite.cloudpubsub.PublisherSettings$Builder setCredentialsProvider(com.google.api.gax.core.CredentialsProvider p0)`
- `public abstract com.google.cloud.pubsublite.cloudpubsub.PublisherSettings$Builder setFramework(com.google.cloud.pubsublite.internal.wire.PubsubContext$Framework p0)`
- `public abstract com.google.cloud.pubsublite.cloudpubsub.PublisherSettings$Builder setKeyExtractor(com.google.cloud.pubsublite.cloudpubsub.KeyExtractor p0)`
- `public abstract com.google.cloud.pubsublite.cloudpubsub.PublisherSettings$Builder setMessageTransformer(com.google.cloud.pubsublite.MessageTransformer p0)`
- `public abstract com.google.cloud.pubsublite.cloudpubsub.PublisherSettings$Builder setServiceClientSupplier(java.util.function.Supplier p0)`
- `public abstract com.google.cloud.pubsublite.cloudpubsub.PublisherSettings$Builder setTopicPath(com.google.cloud.pubsublite.TopicPath p0)`

---

## public abstract interface `com.google.cloud.pubsublite.cloudpubsub.Subscriber`
implements `com.google.cloud.pubsub.v1.SubscriberInterface`  

**Methods:**
- `public static com.google.cloud.pubsublite.cloudpubsub.Subscriber create(com.google.cloud.pubsublite.cloudpubsub.SubscriberSettings p0) throws com.google.api.gax.rpc.ApiException`

---

## public abstract class `com.google.cloud.pubsublite.cloudpubsub.SubscriberSettings`
annotations: @com.google.auto.value.AutoValue  

**Constructors:**
- `public SubscriberSettings()`

**Methods:**
- `public static com.google.cloud.pubsublite.cloudpubsub.SubscriberSettings$Builder newBuilder()`

---

## public abstract static class `com.google.cloud.pubsublite.cloudpubsub.SubscriberSettings$Builder`
annotations: @com.google.auto.value.AutoValue$Builder  

**Constructors:**
- `public Builder()`

**Methods:**
- `public abstract com.google.cloud.pubsublite.cloudpubsub.SubscriberSettings build()`
- `public abstract com.google.cloud.pubsublite.cloudpubsub.SubscriberSettings$Builder setAssignmentServiceClient(com.google.cloud.pubsublite.v1.PartitionAssignmentServiceClient p0)`
- `public abstract com.google.cloud.pubsublite.cloudpubsub.SubscriberSettings$Builder setCredentialsProvider(com.google.api.gax.core.CredentialsProvider p0)`
- `public abstract com.google.cloud.pubsublite.cloudpubsub.SubscriberSettings$Builder setCursorServiceClientSupplier(java.util.function.Supplier p0)`
- `public abstract com.google.cloud.pubsublite.cloudpubsub.SubscriberSettings$Builder setFramework(com.google.cloud.pubsublite.internal.wire.PubsubContext$Framework p0)`
- `public abstract com.google.cloud.pubsublite.cloudpubsub.SubscriberSettings$Builder setNackHandler(com.google.cloud.pubsublite.cloudpubsub.NackHandler p0)`
- `public abstract com.google.cloud.pubsublite.cloudpubsub.SubscriberSettings$Builder setPartitions(java.util.List p0)`
- `public abstract com.google.cloud.pubsublite.cloudpubsub.SubscriberSettings$Builder setPerPartitionFlowControlSettings(com.google.cloud.pubsublite.cloudpubsub.FlowControlSettings p0)`
- `public abstract com.google.cloud.pubsublite.cloudpubsub.SubscriberSettings$Builder setReceiver(com.google.cloud.pubsub.v1.MessageReceiver p0)`
- `public abstract com.google.cloud.pubsublite.cloudpubsub.SubscriberSettings$Builder setSubscriberServiceClientSupplier(java.util.function.Supplier p0)`
- `public abstract com.google.cloud.pubsublite.cloudpubsub.SubscriberSettings$Builder setSubscriptionPath(com.google.cloud.pubsublite.SubscriptionPath p0)`
- `public abstract com.google.cloud.pubsublite.cloudpubsub.SubscriberSettings$Builder setTransformer(com.google.cloud.pubsublite.MessageTransformer p0)`

---

## public class `com.google.cloud.pubsublite.cloudpubsub.internal.AckSetTrackerImpl`
extends `com.google.cloud.pubsublite.internal.TrivialProxyService`  
implements `com.google.cloud.pubsublite.cloudpubsub.internal.AckSetTracker`  

**Constructors:**
- `public AckSetTrackerImpl(com.google.cloud.pubsublite.internal.wire.Committer p0) throws com.google.api.gax.rpc.ApiException`

**Methods:**
- `public java.lang.Runnable track(com.google.cloud.pubsublite.SequencedMessage p0) throws com.google.cloud.pubsublite.internal.CheckedApiException`
- `public void waitUntilCommitted() throws com.google.cloud.pubsublite.internal.CheckedApiException`

---

## public class `com.google.cloud.pubsublite.cloudpubsub.internal.AssigningSubscriber`
extends `com.google.cloud.pubsublite.internal.ProxyService`  
implements `com.google.cloud.pubsublite.cloudpubsub.Subscriber`  

**Constructors:**
- `public AssigningSubscriber(com.google.cloud.pubsublite.cloudpubsub.internal.PartitionSubscriberFactory p0, com.google.cloud.pubsublite.internal.wire.AssignerFactory p1) throws com.google.api.gax.rpc.ApiException`

**Methods:**
- `protected void handlePermanentError(com.google.cloud.pubsublite.internal.CheckedApiException p0)`
- `protected void start()`
- `protected void stop()`

---

## public class `com.google.cloud.pubsublite.cloudpubsub.internal.MultiPartitionSubscriber`
extends `com.google.cloud.pubsublite.internal.TrivialProxyService`  
implements `com.google.cloud.pubsublite.cloudpubsub.Subscriber`  

**Methods:**
- `public static com.google.cloud.pubsublite.cloudpubsub.Subscriber of(java.util.List p0) throws com.google.api.gax.rpc.ApiException`

---

## public abstract interface `com.google.cloud.pubsublite.cloudpubsub.internal.PartitionSubscriberFactory`

**Methods:**
- `public abstract com.google.cloud.pubsublite.cloudpubsub.Subscriber newSubscriber(com.google.cloud.pubsublite.Partition p0) throws com.google.cloud.pubsublite.internal.CheckedApiException`

---

## public abstract interface `com.google.cloud.pubsublite.cloudpubsub.internal.ResettableSubscriberFactory`
implements `java.io.Serializable`  

**Methods:**
- `public abstract com.google.cloud.pubsublite.internal.wire.Subscriber newSubscriber(java.util.function.Consumer p0, com.google.cloud.pubsublite.internal.wire.SubscriberResetHandler p1) throws com.google.api.gax.rpc.ApiException`

---

## public class `com.google.cloud.pubsublite.cloudpubsub.internal.SinglePartitionSubscriber`
extends `com.google.cloud.pubsublite.internal.ProxyService`  
implements `com.google.cloud.pubsublite.cloudpubsub.Subscriber`  

**Constructors:**
- `public SinglePartitionSubscriber(com.google.cloud.pubsub.v1.MessageReceiver p0, com.google.cloud.pubsublite.MessageTransformer p1, com.google.cloud.pubsublite.cloudpubsub.internal.AckSetTracker p2, com.google.cloud.pubsublite.cloudpubsub.NackHandler p3, com.google.cloud.pubsublite.cloudpubsub.internal.ResettableSubscriberFactory p4, com.google.cloud.pubsublite.cloudpubsub.FlowControlSettings p5) throws com.google.api.gax.rpc.ApiException`

**Methods:**
- `protected void handlePermanentError(com.google.cloud.pubsublite.internal.CheckedApiException p0)`
- `protected void start() throws com.google.cloud.pubsublite.internal.CheckedApiException`
- `protected void stop()`

---

## public class `com.google.cloud.pubsublite.cloudpubsub.internal.WrappingPublisher`
extends `com.google.cloud.pubsublite.internal.TrivialProxyService`  
implements `com.google.cloud.pubsublite.cloudpubsub.Publisher`  

**Constructors:**
- `public WrappingPublisher(com.google.cloud.pubsublite.internal.Publisher p0, com.google.cloud.pubsublite.MessageTransformer p1) throws com.google.api.gax.rpc.ApiException`

**Methods:**
- `public com.google.api.core.ApiFuture publish(com.google.pubsub.v1.PubsubMessage p0)`

---

## public class `com.google.cloud.pubsublite.internal.AdminClientImpl`
extends `com.google.cloud.pubsublite.internal.ApiResourceAggregation`  
implements `com.google.cloud.pubsublite.AdminClient`  

**Constructors:**
- `public AdminClientImpl(com.google.cloud.pubsublite.CloudRegion p0, com.google.cloud.pubsublite.v1.AdminServiceClient p1)`

**Methods:**
- `public com.google.api.core.ApiFuture createReservation(com.google.cloud.pubsublite.proto.Reservation p0)`
- `public com.google.api.core.ApiFuture createSubscription(com.google.cloud.pubsublite.proto.Subscription p0, com.google.cloud.pubsublite.BacklogLocation p1)`
- `public com.google.api.core.ApiFuture createTopic(com.google.cloud.pubsublite.proto.Topic p0)`
- `public com.google.api.core.ApiFuture deleteReservation(com.google.cloud.pubsublite.ReservationPath p0)`
- `public com.google.api.core.ApiFuture deleteSubscription(com.google.cloud.pubsublite.SubscriptionPath p0)`
- `public com.google.api.core.ApiFuture deleteTopic(com.google.cloud.pubsublite.TopicPath p0)`
- `public com.google.api.core.ApiFuture getReservation(com.google.cloud.pubsublite.ReservationPath p0)`
- `public com.google.api.core.ApiFuture getSubscription(com.google.cloud.pubsublite.SubscriptionPath p0)`
- `public com.google.api.core.ApiFuture getTopic(com.google.cloud.pubsublite.TopicPath p0)`
- `public com.google.api.core.ApiFuture getTopicPartitionCount(com.google.cloud.pubsublite.TopicPath p0)`
- `public com.google.api.core.ApiFuture listReservationTopics(com.google.cloud.pubsublite.ReservationPath p0)`
- `public com.google.api.core.ApiFuture listReservations(com.google.cloud.pubsublite.LocationPath p0)`
- `public com.google.api.core.ApiFuture listSubscriptions(com.google.cloud.pubsublite.LocationPath p0)`
- `public com.google.api.core.ApiFuture listTopicSubscriptions(com.google.cloud.pubsublite.TopicPath p0)`
- `public com.google.api.core.ApiFuture listTopics(com.google.cloud.pubsublite.LocationPath p0)`
- `public com.google.cloud.pubsublite.CloudRegion region()`
- `public com.google.api.gax.longrunning.OperationFuture seekSubscription(com.google.cloud.pubsublite.SubscriptionPath p0, com.google.cloud.pubsublite.SeekTarget p1)`
- `public com.google.api.core.ApiFuture updateReservation(com.google.cloud.pubsublite.proto.Reservation p0, com.google.protobuf.FieldMask p1)`
- `public com.google.api.core.ApiFuture updateSubscription(com.google.cloud.pubsublite.proto.Subscription p0, com.google.protobuf.FieldMask p1)`
- `public com.google.api.core.ApiFuture updateTopic(com.google.cloud.pubsublite.proto.Topic p0, com.google.protobuf.FieldMask p1)`

---

## public abstract interface `com.google.cloud.pubsublite.internal.AlarmFactory`

**Methods:**
- `public static com.google.cloud.pubsublite.internal.AlarmFactory create(java.time.Duration p0)`
- `public abstract java.util.concurrent.Future newAlarm(java.lang.Runnable p0)`

---

## public final static class `com.google.cloud.pubsublite.internal.AlarmFactory$Internal`

**Constructors:**
- `public Internal()`

---

## public abstract interface `com.google.cloud.pubsublite.internal.ApiBackgroundResource`
implements `com.google.api.gax.core.BackgroundResource`  

**Methods:**
- `public abstract void close() throws com.google.api.gax.rpc.ApiException`

---

## public class `com.google.cloud.pubsublite.internal.ApiResourceAggregation`
implements `com.google.cloud.pubsublite.internal.ApiBackgroundResource`  

**Methods:**
- `public boolean awaitTermination(long p0, java.util.concurrent.TimeUnit p1) throws java.lang.InterruptedException`
- `public void close() throws com.google.api.gax.rpc.ApiException`
- `public boolean isShutdown()`
- `public boolean isTerminated()`
- `public void shutdown()`
- `public void shutdownNow()`

---

## public abstract interface `com.google.cloud.pubsublite.internal.BlockingPullSubscriber`
annotations: @javax.annotation.concurrent.ThreadSafe  
implements `java.lang.AutoCloseable`  

**Methods:**
- `public abstract void close()`
- `public abstract java.util.Optional messageIfAvailable() throws com.google.cloud.pubsublite.internal.CheckedApiException`
- `public abstract com.google.api.core.ApiFuture onData()`

---

## public class `com.google.cloud.pubsublite.internal.BlockingPullSubscriberImpl`
implements `com.google.cloud.pubsublite.internal.BlockingPullSubscriber`  

**Constructors:**
- `public BlockingPullSubscriberImpl(com.google.cloud.pubsublite.internal.wire.SubscriberFactory p0, com.google.cloud.pubsublite.cloudpubsub.FlowControlSettings p1) throws com.google.cloud.pubsublite.internal.CheckedApiException`

**Methods:**
- `public void close()`
- `public synchronized java.util.Optional messageIfAvailable() throws com.google.cloud.pubsublite.internal.CheckedApiException`
- `public synchronized com.google.api.core.ApiFuture onData()`

---

## public class `com.google.cloud.pubsublite.internal.BufferingPullSubscriber`
implements `com.google.cloud.pubsublite.internal.PullSubscriber<com.google.cloud.pubsublite.SequencedMessage>`  

**Constructors:**
- `public BufferingPullSubscriber(com.google.cloud.pubsublite.internal.wire.SubscriberFactory p0, com.google.cloud.pubsublite.cloudpubsub.FlowControlSettings p1) throws com.google.cloud.pubsublite.internal.CheckedApiException`

**Methods:**
- `public void close()`
- `public synchronized java.util.Optional nextOffset()`
- `public synchronized java.util.List pull() throws com.google.cloud.pubsublite.internal.CheckedApiException`

---

## public class `com.google.cloud.pubsublite.internal.CheckedApiException`
extends `java.lang.Exception`  

**Constructors:**
- `public CheckedApiException(com.google.api.gax.rpc.ApiException p0)`
- `public CheckedApiException(com.google.api.gax.rpc.StatusCode$Code p0)`
- `public CheckedApiException(java.lang.String p0, com.google.api.gax.rpc.StatusCode$Code p1)`
- `public CheckedApiException(java.lang.String p0, java.lang.Throwable p1, com.google.api.gax.rpc.StatusCode$Code p2)`
- `public CheckedApiException(java.lang.Throwable p0, com.google.api.gax.rpc.StatusCode$Code p1)`

**Fields:**
- `public final com.google.api.gax.rpc.ApiException underlying`

**Methods:**
- `public com.google.api.gax.rpc.StatusCode$Code code()`
- `public static com.google.api.gax.rpc.StatusCode fromCode(com.google.api.gax.rpc.StatusCode$Code p0)`

---

## public class `com.google.cloud.pubsublite.internal.CheckedApiPreconditions`

**Methods:**
- `public static void checkArgument(boolean p0) throws com.google.cloud.pubsublite.internal.CheckedApiException`
- `public static void checkArgument(boolean p0, java.lang.String p1) throws com.google.cloud.pubsublite.internal.CheckedApiException`
- `public static void checkState(boolean p0) throws com.google.cloud.pubsublite.internal.CheckedApiException`
- `public static void checkState(boolean p0, java.lang.String p1) throws com.google.cloud.pubsublite.internal.CheckedApiException`

---

## public class `com.google.cloud.pubsublite.internal.CloseableMonitor`

**Constructors:**
- `public CloseableMonitor()`

**Fields:**
- `public final com.google.common.util.concurrent.Monitor monitor`

**Methods:**
- `public com.google.cloud.pubsublite.internal.CloseableMonitor$Hold enter()`
- `public com.google.cloud.pubsublite.internal.CloseableMonitor$Hold enterWhenUninterruptibly(com.google.common.util.concurrent.Monitor$Guard p0)`

---

## public class `com.google.cloud.pubsublite.internal.CloseableMonitor$Hold`
implements `java.lang.AutoCloseable`  

**Methods:**
- `public void close()`

---

## public abstract interface `com.google.cloud.pubsublite.internal.CursorClient`
implements `com.google.cloud.pubsublite.internal.ApiBackgroundResource`  

**Methods:**
- `public abstract com.google.api.core.ApiFuture commitCursor(com.google.cloud.pubsublite.SubscriptionPath p0, com.google.cloud.pubsublite.Partition p1, com.google.cloud.pubsublite.Offset p2)`
- `public static com.google.cloud.pubsublite.internal.CursorClient create(com.google.cloud.pubsublite.internal.CursorClientSettings p0) throws com.google.api.gax.rpc.ApiException`
- `public abstract com.google.api.core.ApiFuture listPartitionCursors(com.google.cloud.pubsublite.SubscriptionPath p0)`
- `public abstract com.google.cloud.pubsublite.CloudRegion region()`

---

## public class `com.google.cloud.pubsublite.internal.CursorClientImpl`
extends `com.google.cloud.pubsublite.internal.ApiResourceAggregation`  
implements `com.google.cloud.pubsublite.internal.CursorClient`  

**Constructors:**
- `public CursorClientImpl(com.google.cloud.pubsublite.CloudRegion p0, com.google.cloud.pubsublite.v1.CursorServiceClient p1)`

**Methods:**
- `public com.google.api.core.ApiFuture commitCursor(com.google.cloud.pubsublite.SubscriptionPath p0, com.google.cloud.pubsublite.Partition p1, com.google.cloud.pubsublite.Offset p2)`
- `public com.google.api.core.ApiFuture listPartitionCursors(com.google.cloud.pubsublite.SubscriptionPath p0)`
- `public com.google.cloud.pubsublite.CloudRegion region()`

---

## public abstract class `com.google.cloud.pubsublite.internal.CursorClientSettings`
annotations: @com.google.auto.value.AutoValue  

**Constructors:**
- `public CursorClientSettings()`

**Methods:**
- `public static com.google.cloud.pubsublite.internal.CursorClientSettings$Builder newBuilder()`

---

## public abstract static class `com.google.cloud.pubsublite.internal.CursorClientSettings$Builder`
annotations: @com.google.auto.value.AutoValue$Builder  

**Constructors:**
- `public Builder()`

**Methods:**
- `public abstract com.google.cloud.pubsublite.internal.CursorClientSettings build()`
- `public abstract com.google.cloud.pubsublite.internal.CursorClientSettings$Builder setRegion(com.google.cloud.pubsublite.CloudRegion p0)`
- `public abstract com.google.cloud.pubsublite.internal.CursorClientSettings$Builder setServiceClient(com.google.cloud.pubsublite.v1.CursorServiceClient p0)`

---

## public class `com.google.cloud.pubsublite.internal.DefaultRoutingPolicy`
implements `com.google.cloud.pubsublite.internal.RoutingPolicy`  

**Constructors:**
- `public DefaultRoutingPolicy(long p0) throws com.google.api.gax.rpc.ApiException`

**Methods:**
- `public com.google.cloud.pubsublite.Partition route(com.google.protobuf.ByteString p0) throws com.google.api.gax.rpc.ApiException`
- `public com.google.cloud.pubsublite.Partition routeWithoutKey() throws com.google.api.gax.rpc.ApiException`

---

## public final class `com.google.cloud.pubsublite.internal.ExtractStatus`

**Methods:**
- `public static void addFailureHandler(com.google.api.core.ApiFuture p0, java.util.function.Consumer p1)`
- `public static java.util.Optional extract(java.lang.Throwable p0)`
- `public static <K extends java.lang.Object, V extends java.lang.Object> java.util.function.BiConsumer rethrowAsRuntime(com.google.cloud.pubsublite.internal.ExtractStatus$StatusBiconsumer p0)`
- `public static <I extends java.lang.Object> java.util.function.Consumer rethrowAsRuntime(com.google.cloud.pubsublite.internal.ExtractStatus$StatusConsumer p0)`
- `public static <I extends java.lang.Object, O extends java.lang.Object> java.util.function.Function rethrowAsRuntime(com.google.cloud.pubsublite.internal.ExtractStatus$StatusFunction p0)`
- `public static com.google.cloud.pubsublite.internal.CheckedApiException toCanonical(java.lang.Throwable p0)`
- `public static <T extends java.lang.Object> com.google.api.core.ApiFuture toClientFuture(com.google.api.core.ApiFuture p0)`

---

## public abstract static interface `com.google.cloud.pubsublite.internal.ExtractStatus$StatusBiconsumer`<K extends java.lang.Object, V extends java.lang.Object>

**Methods:**
- `public abstract void apply(K p0, V p1) throws com.google.cloud.pubsublite.internal.CheckedApiException`

---

## public abstract static interface `com.google.cloud.pubsublite.internal.ExtractStatus$StatusConsumer`<I extends java.lang.Object>

**Methods:**
- `public abstract void apply(I p0) throws com.google.cloud.pubsublite.internal.CheckedApiException`

---

## public abstract static interface `com.google.cloud.pubsublite.internal.ExtractStatus$StatusFunction`<I extends java.lang.Object, O extends java.lang.Object>

**Methods:**
- `public abstract O apply(I p0) throws com.google.cloud.pubsublite.internal.CheckedApiException`

---

## public class `com.google.cloud.pubsublite.internal.Lazy`<T extends java.lang.Object>

**Constructors:**
- `public Lazy(java.util.function.Supplier p0)`

**Methods:**
- `public synchronized T get()`

---

## public abstract class `com.google.cloud.pubsublite.internal.ProxyService`
extends `com.google.api.core.AbstractApiService`  

**Constructors:**
- `protected ProxyService()`

**Methods:**
- `protected final void addServices(com.google.api.core.ApiService... p0) throws com.google.api.gax.rpc.ApiException`
- `protected final <T extends com.google.api.core.ApiService> void addServices(java.util.Collection p0) throws com.google.api.gax.rpc.ApiException`
- `protected final void doStart()`
- `protected final void doStop()`
- `protected abstract void handlePermanentError(com.google.cloud.pubsublite.internal.CheckedApiException p0)`
- `protected final void onPermanentError(com.google.cloud.pubsublite.internal.CheckedApiException p0)`
- `protected abstract void start() throws com.google.cloud.pubsublite.internal.CheckedApiException`
- `protected abstract void stop() throws com.google.cloud.pubsublite.internal.CheckedApiException`

---

## public abstract interface `com.google.cloud.pubsublite.internal.Publisher`<ResponseT extends java.lang.Object>
implements `com.google.api.core.ApiService`, `java.io.Flushable`  

**Methods:**
- `public abstract void cancelOutstandingPublishes()`
- `public abstract com.google.api.core.ApiFuture publish(com.google.cloud.pubsublite.Message p0)`

---

## public abstract interface `com.google.cloud.pubsublite.internal.PullSubscriber`<T extends java.lang.Object>
implements `java.lang.AutoCloseable`  

**Methods:**
- `public abstract java.util.Optional nextOffset()`
- `public abstract java.util.List pull() throws com.google.cloud.pubsublite.internal.CheckedApiException`

---

## public abstract interface `com.google.cloud.pubsublite.internal.RoutingPolicy`

**Methods:**
- `public abstract com.google.cloud.pubsublite.Partition route(com.google.protobuf.ByteString p0) throws com.google.cloud.pubsublite.internal.CheckedApiException`
- `public abstract com.google.cloud.pubsublite.Partition routeWithoutKey() throws com.google.cloud.pubsublite.internal.CheckedApiException`

---

## public abstract static interface `com.google.cloud.pubsublite.internal.RoutingPolicy$Factory`

**Methods:**
- `public abstract com.google.cloud.pubsublite.internal.RoutingPolicy newPolicy(long p0)`

---

## public abstract interface `com.google.cloud.pubsublite.internal.TopicStatsClient`
implements `com.google.cloud.pubsublite.internal.ApiBackgroundResource`  

**Methods:**
- `public abstract com.google.api.core.ApiFuture computeCursorForEventTime(com.google.cloud.pubsublite.TopicPath p0, com.google.cloud.pubsublite.Partition p1, com.google.protobuf.Timestamp p2)`
- `public abstract com.google.api.core.ApiFuture computeCursorForPublishTime(com.google.cloud.pubsublite.TopicPath p0, com.google.cloud.pubsublite.Partition p1, com.google.protobuf.Timestamp p2)`
- `public abstract com.google.api.core.ApiFuture computeHeadCursor(com.google.cloud.pubsublite.TopicPath p0, com.google.cloud.pubsublite.Partition p1)`
- `public abstract com.google.api.core.ApiFuture computeMessageStats(com.google.cloud.pubsublite.TopicPath p0, com.google.cloud.pubsublite.Partition p1, com.google.cloud.pubsublite.Offset p2, com.google.cloud.pubsublite.Offset p3)`
- `public static com.google.cloud.pubsublite.internal.TopicStatsClient create(com.google.cloud.pubsublite.internal.TopicStatsClientSettings p0) throws com.google.api.gax.rpc.ApiException`
- `public abstract com.google.cloud.pubsublite.CloudRegion region()`

---

## public class `com.google.cloud.pubsublite.internal.TopicStatsClientImpl`
extends `com.google.cloud.pubsublite.internal.ApiResourceAggregation`  
implements `com.google.cloud.pubsublite.internal.TopicStatsClient`  

**Constructors:**
- `public TopicStatsClientImpl(com.google.cloud.pubsublite.CloudRegion p0, com.google.cloud.pubsublite.v1.TopicStatsServiceClient p1)`

**Methods:**
- `public com.google.api.core.ApiFuture computeCursorForEventTime(com.google.cloud.pubsublite.TopicPath p0, com.google.cloud.pubsublite.Partition p1, com.google.protobuf.Timestamp p2)`
- `public com.google.api.core.ApiFuture computeCursorForPublishTime(com.google.cloud.pubsublite.TopicPath p0, com.google.cloud.pubsublite.Partition p1, com.google.protobuf.Timestamp p2)`
- `public com.google.api.core.ApiFuture computeHeadCursor(com.google.cloud.pubsublite.TopicPath p0, com.google.cloud.pubsublite.Partition p1)`
- `public com.google.api.core.ApiFuture computeMessageStats(com.google.cloud.pubsublite.TopicPath p0, com.google.cloud.pubsublite.Partition p1, com.google.cloud.pubsublite.Offset p2, com.google.cloud.pubsublite.Offset p3)`
- `public com.google.cloud.pubsublite.CloudRegion region()`

---

## public abstract class `com.google.cloud.pubsublite.internal.TopicStatsClientSettings`
annotations: @com.google.auto.value.AutoValue  

**Constructors:**
- `public TopicStatsClientSettings()`

**Methods:**
- `public static com.google.cloud.pubsublite.internal.TopicStatsClientSettings$Builder newBuilder()`

---

## public abstract static class `com.google.cloud.pubsublite.internal.TopicStatsClientSettings$Builder`
annotations: @com.google.auto.value.AutoValue$Builder  

**Constructors:**
- `public Builder()`

**Methods:**
- `public abstract com.google.cloud.pubsublite.internal.TopicStatsClientSettings build()`
- `public abstract com.google.cloud.pubsublite.internal.TopicStatsClientSettings$Builder setRegion(com.google.cloud.pubsublite.CloudRegion p0)`
- `public abstract com.google.cloud.pubsublite.internal.TopicStatsClientSettings$Builder setServiceClient(com.google.cloud.pubsublite.v1.TopicStatsServiceClient p0)`

---

## public class `com.google.cloud.pubsublite.internal.TrivialProxyService`
extends `com.google.cloud.pubsublite.internal.ProxyService`  

**Constructors:**
- `protected TrivialProxyService(com.google.api.core.ApiService... p0) throws com.google.api.gax.rpc.ApiException`
- `protected TrivialProxyService(java.util.Collection p0) throws com.google.api.gax.rpc.ApiException`

**Methods:**
- `protected final void handlePermanentError(com.google.cloud.pubsublite.internal.CheckedApiException p0)`
- `protected final void start()`
- `protected final void stop()`

---

## public class `com.google.cloud.pubsublite.internal.UncheckedApiPreconditions`

**Methods:**
- `public static void checkArgument(boolean p0) throws com.google.api.gax.rpc.ApiException`
- `public static void checkArgument(boolean p0, java.lang.String p1) throws com.google.api.gax.rpc.ApiException`
- `public static void checkState(boolean p0) throws com.google.api.gax.rpc.ApiException`
- `public static void checkState(boolean p0, java.lang.String p1) throws com.google.api.gax.rpc.ApiException`

---

## public abstract class `com.google.cloud.pubsublite.internal.testing.FakeApiService`
extends `com.google.api.core.AbstractApiService`  

**Constructors:**
- `public FakeApiService()`

**Methods:**
- `protected void doStart()`
- `protected void doStop()`
- `public void fail(java.lang.Throwable p0)`

---

## public final class `com.google.cloud.pubsublite.internal.testing.TestResetSignal`

**Methods:**
- `public static com.google.cloud.pubsublite.internal.CheckedApiException newCheckedException()`

---

## public final class `com.google.cloud.pubsublite.internal.testing.UnitTestExamples`

**Methods:**
- `public static <T extends java.lang.Object> T example(java.lang.Class p0)`
- `public static com.google.cloud.pubsublite.LocationPath exampleLocationPath()`
- `public static com.google.cloud.pubsublite.Offset exampleOffset()`
- `public static com.google.cloud.pubsublite.Partition examplePartition()`
- `public static com.google.cloud.pubsublite.ProjectNumber exampleProjectNumber()`
- `public static com.google.cloud.pubsublite.CloudRegion exampleRegion()`
- `public static com.google.cloud.pubsublite.proto.Reservation exampleReservation()`
- `public static com.google.cloud.pubsublite.ReservationName exampleReservationName()`
- `public static com.google.cloud.pubsublite.ReservationPath exampleReservationPath()`
- `public static com.google.cloud.pubsublite.proto.Subscription exampleSubscription()`
- `public static com.google.cloud.pubsublite.SubscriptionName exampleSubscriptionName()`
- `public static com.google.cloud.pubsublite.SubscriptionPath exampleSubscriptionPath()`
- `public static com.google.cloud.pubsublite.proto.Topic exampleTopic()`
- `public static com.google.cloud.pubsublite.TopicName exampleTopicName()`
- `public static com.google.cloud.pubsublite.TopicPath exampleTopicPath()`
- `public static com.google.cloud.pubsublite.CloudZone exampleZone()`

---

## public class `com.google.cloud.pubsublite.internal.wire.ApiExceptionPublisher`<T extends java.lang.Object>
extends `com.google.cloud.pubsublite.internal.TrivialProxyService`  
implements `com.google.cloud.pubsublite.internal.Publisher<T>`  

**Methods:**
- `public void cancelOutstandingPublishes()`
- `public void flush() throws java.io.IOException`
- `public com.google.api.core.ApiFuture publish(com.google.cloud.pubsublite.Message p0)`

---

## public class `com.google.cloud.pubsublite.internal.wire.ApiServiceUtils`

**Methods:**
- `public static com.google.api.core.ApiService backgroundResourceAsApiService(com.google.api.gax.core.BackgroundResource p0)`
- `public static void blockingShutdown(com.google.api.core.ApiService p0)`
- `public static void blockingShutdown(java.lang.Iterable p0) throws com.google.api.gax.rpc.ApiException`

---

## public abstract interface `com.google.cloud.pubsublite.internal.wire.Assigner`
implements `com.google.api.core.ApiService`  

---

## public abstract interface `com.google.cloud.pubsublite.internal.wire.AssignerFactory`

**Methods:**
- `public abstract com.google.cloud.pubsublite.internal.wire.Assigner New(com.google.cloud.pubsublite.internal.wire.PartitionAssignmentReceiver p0) throws com.google.api.gax.rpc.ApiException`

---

## public class `com.google.cloud.pubsublite.internal.wire.AssignerImpl`
extends `com.google.cloud.pubsublite.internal.TrivialProxyService`  
implements `com.google.cloud.pubsublite.internal.wire.Assigner`, `com.google.cloud.pubsublite.internal.wire.RetryingConnectionObserver<com.google.cloud.pubsublite.proto.PartitionAssignment>`  

**Constructors:**
- `public AssignerImpl(com.google.cloud.pubsublite.v1.PartitionAssignmentServiceClient p0, com.google.cloud.pubsublite.proto.InitialPartitionAssignmentRequest p1, com.google.cloud.pubsublite.internal.wire.PartitionAssignmentReceiver p2) throws com.google.api.gax.rpc.ApiException`

**Methods:**
- `public void onClientResponse(com.google.cloud.pubsublite.proto.PartitionAssignment p0) throws com.google.cloud.pubsublite.internal.CheckedApiException`
- `public void triggerReinitialize(com.google.cloud.pubsublite.internal.CheckedApiException p0)`

---

## public abstract class `com.google.cloud.pubsublite.internal.wire.AssignerSettings`
annotations: @com.google.auto.value.AutoValue  

**Constructors:**
- `public AssignerSettings()`

**Methods:**
- `public com.google.cloud.pubsublite.internal.wire.Assigner instantiate()`
- `public static com.google.cloud.pubsublite.internal.wire.AssignerSettings$Builder newBuilder()`

---

## public abstract static class `com.google.cloud.pubsublite.internal.wire.AssignerSettings$Builder`
annotations: @com.google.auto.value.AutoValue$Builder  

**Constructors:**
- `public Builder()`

**Methods:**
- `public abstract com.google.cloud.pubsublite.internal.wire.AssignerSettings build()`
- `public abstract com.google.cloud.pubsublite.internal.wire.AssignerSettings$Builder setReceiver(com.google.cloud.pubsublite.internal.wire.PartitionAssignmentReceiver p0)`
- `public abstract com.google.cloud.pubsublite.internal.wire.AssignerSettings$Builder setServiceClient(com.google.cloud.pubsublite.v1.PartitionAssignmentServiceClient p0)`
- `public abstract com.google.cloud.pubsublite.internal.wire.AssignerSettings$Builder setSubscriptionPath(com.google.cloud.pubsublite.SubscriptionPath p0)`

---

## public abstract interface `com.google.cloud.pubsublite.internal.wire.Committer`
implements `com.google.api.core.ApiService`  

**Methods:**
- `public abstract com.google.api.core.ApiFuture commitOffset(com.google.cloud.pubsublite.Offset p0)`
- `public abstract void waitUntilEmpty() throws com.google.cloud.pubsublite.internal.CheckedApiException`

---

## public class `com.google.cloud.pubsublite.internal.wire.CommitterImpl`
extends `com.google.cloud.pubsublite.internal.ProxyService`  
implements `com.google.cloud.pubsublite.internal.wire.Committer`, `com.google.cloud.pubsublite.internal.wire.RetryingConnectionObserver<com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse>`  

**Constructors:**
- `public CommitterImpl(com.google.cloud.pubsublite.v1.CursorServiceClient p0, com.google.cloud.pubsublite.proto.InitialCommitCursorRequest p1) throws com.google.api.gax.rpc.ApiException`

**Methods:**
- `public com.google.api.core.ApiFuture commitOffset(com.google.cloud.pubsublite.Offset p0)`
- `protected void handlePermanentError(com.google.cloud.pubsublite.internal.CheckedApiException p0)`
- `public void onClientResponse(com.google.cloud.pubsublite.proto.SequencedCommitCursorResponse p0) throws com.google.cloud.pubsublite.internal.CheckedApiException`
- `protected void start()`
- `protected void stop()`
- `public void triggerReinitialize(com.google.cloud.pubsublite.internal.CheckedApiException p0)`
- `public void waitUntilEmpty() throws com.google.cloud.pubsublite.internal.CheckedApiException`

---

## public abstract class `com.google.cloud.pubsublite.internal.wire.CommitterSettings`
annotations: @com.google.auto.value.AutoValue  

**Constructors:**
- `public CommitterSettings()`

**Methods:**
- `public com.google.cloud.pubsublite.internal.wire.Committer instantiate()`
- `public static com.google.cloud.pubsublite.internal.wire.CommitterSettings$Builder newBuilder()`

---

## public abstract static class `com.google.cloud.pubsublite.internal.wire.CommitterSettings$Builder`
annotations: @com.google.auto.value.AutoValue$Builder  

**Constructors:**
- `public Builder()`

**Methods:**
- `public abstract com.google.cloud.pubsublite.internal.wire.CommitterSettings build()`
- `public abstract com.google.cloud.pubsublite.internal.wire.CommitterSettings$Builder setPartition(com.google.cloud.pubsublite.Partition p0)`
- `public abstract com.google.cloud.pubsublite.internal.wire.CommitterSettings$Builder setServiceClient(com.google.cloud.pubsublite.v1.CursorServiceClient p0)`
- `public abstract com.google.cloud.pubsublite.internal.wire.CommitterSettings$Builder setSubscriptionPath(com.google.cloud.pubsublite.SubscriptionPath p0)`

---

## public abstract interface `com.google.cloud.pubsublite.internal.wire.ConnectedAssigner`
implements `java.lang.AutoCloseable`  

**Methods:**
- `public abstract void ack()`

---

## public class `com.google.cloud.pubsublite.internal.wire.ConnectedAssignerImpl`
extends `com.google.cloud.pubsublite.internal.wire.SingleConnection`  
implements `com.google.cloud.pubsublite.internal.wire.ConnectedAssigner`  

**Methods:**
- `public void ack()`

---

## public class `com.google.cloud.pubsublite.internal.wire.ConnectedCommitterImpl`
extends `com.google.cloud.pubsublite.internal.wire.SingleConnection`  
implements `com.google.cloud.pubsublite.internal.wire.ConnectedCommitter`  

**Methods:**
- `public void commit(com.google.cloud.pubsublite.Offset p0)`

---

## public class `com.google.cloud.pubsublite.internal.wire.NextOffsetTracker`

**Constructors:**
- `public NextOffsetTracker()`

---

## public abstract interface `com.google.cloud.pubsublite.internal.wire.PartitionAssignmentReceiver`

**Methods:**
- `public abstract void handleAssignment(java.util.Set p0)`

---

## public abstract interface `com.google.cloud.pubsublite.internal.wire.PartitionCountWatcher`
implements `com.google.api.core.ApiService`  

---

## public abstract static interface `com.google.cloud.pubsublite.internal.wire.PartitionCountWatcher$Factory`

**Methods:**
- `public abstract com.google.cloud.pubsublite.internal.wire.PartitionCountWatcher newWatcher(java.util.function.Consumer p0)`

---

## public class `com.google.cloud.pubsublite.internal.wire.PartitionCountWatcherImpl`
extends `com.google.api.core.AbstractApiService`  
implements `com.google.cloud.pubsublite.internal.wire.PartitionCountWatcher`  

---

## public static class `com.google.cloud.pubsublite.internal.wire.PartitionCountWatcherImpl$Factory`
implements `com.google.cloud.pubsublite.internal.wire.PartitionCountWatcher$Factory`  

**Constructors:**
- `public Factory(com.google.cloud.pubsublite.TopicPath p0, com.google.cloud.pubsublite.AdminClient p1, com.google.cloud.pubsublite.internal.AlarmFactory p2)`

**Methods:**
- `public com.google.cloud.pubsublite.internal.wire.PartitionCountWatcher newWatcher(java.util.function.Consumer p0)`

---

## public class `com.google.cloud.pubsublite.internal.wire.PartitionCountWatchingPublisher`
extends `com.google.cloud.pubsublite.internal.ProxyService`  
implements `com.google.cloud.pubsublite.internal.Publisher<com.google.cloud.pubsublite.MessageMetadata>`  

**Methods:**
- `public void cancelOutstandingPublishes()`
- `public void flush() throws java.io.IOException`
- `protected void handlePermanentError(com.google.cloud.pubsublite.internal.CheckedApiException p0)`
- `public com.google.api.core.ApiFuture publish(com.google.cloud.pubsublite.Message p0)`
- `protected void start()`
- `protected void stop()`

---

## public abstract class `com.google.cloud.pubsublite.internal.wire.PartitionCountWatchingPublisherSettings`
annotations: @com.google.auto.value.AutoValue  

**Constructors:**
- `public PartitionCountWatchingPublisherSettings()`

**Methods:**
- `public com.google.cloud.pubsublite.internal.Publisher instantiate() throws com.google.api.gax.rpc.ApiException`
- `public static com.google.cloud.pubsublite.internal.wire.PartitionCountWatchingPublisherSettings$Builder newBuilder()`

---

## public abstract static class `com.google.cloud.pubsublite.internal.wire.PartitionCountWatchingPublisherSettings$Builder`
annotations: @com.google.auto.value.AutoValue$Builder  

**Constructors:**
- `public Builder()`

**Methods:**
- `public abstract com.google.cloud.pubsublite.internal.wire.PartitionCountWatchingPublisherSettings build()`
- `public abstract com.google.cloud.pubsublite.internal.wire.PartitionCountWatchingPublisherSettings$Builder setAdminClient(com.google.cloud.pubsublite.AdminClient p0)`
- `public abstract com.google.cloud.pubsublite.internal.wire.PartitionCountWatchingPublisherSettings$Builder setConfigPollPeriod(java.time.Duration p0)`
- `public abstract com.google.cloud.pubsublite.internal.wire.PartitionCountWatchingPublisherSettings$Builder setPublisherFactory(com.google.cloud.pubsublite.internal.wire.PartitionPublisherFactory p0)`
- `public abstract com.google.cloud.pubsublite.internal.wire.PartitionCountWatchingPublisherSettings$Builder setTopic(com.google.cloud.pubsublite.TopicPath p0)`

---

## public abstract interface `com.google.cloud.pubsublite.internal.wire.PartitionPublisherFactory`

**Methods:**
- `public abstract com.google.cloud.pubsublite.internal.Publisher newPublisher(com.google.cloud.pubsublite.Partition p0) throws com.google.api.gax.rpc.ApiException`

---

## public final class `com.google.cloud.pubsublite.internal.wire.Predicates`

**Methods:**
- `public static boolean isOrdered(java.lang.Iterable p0)`

---

## public abstract class `com.google.cloud.pubsublite.internal.wire.PublisherBuilder`
annotations: @com.google.auto.value.AutoValue  

**Constructors:**
- `public PublisherBuilder()`

**Fields:**
- `public final static com.google.api.gax.batching.BatchingSettings DISABLED_BATCHING_SETTINGS`

**Methods:**
- `public static com.google.cloud.pubsublite.internal.wire.PublisherBuilder$Builder builder()`

---

## public abstract static class `com.google.cloud.pubsublite.internal.wire.PublisherBuilder$Builder`
annotations: @com.google.auto.value.AutoValue$Builder  

**Constructors:**
- `public Builder()`

**Methods:**
- `public com.google.cloud.pubsublite.internal.Publisher build() throws com.google.api.gax.rpc.ApiException`
- `public abstract com.google.cloud.pubsublite.internal.wire.PublisherBuilder$Builder setBatching(com.google.api.gax.batching.BatchingSettings p0)`
- `public abstract com.google.cloud.pubsublite.internal.wire.PublisherBuilder$Builder setPartition(com.google.cloud.pubsublite.Partition p0)`
- `public abstract com.google.cloud.pubsublite.internal.wire.PublisherBuilder$Builder setServiceClient(com.google.cloud.pubsublite.v1.PublisherServiceClient p0)`
- `public abstract com.google.cloud.pubsublite.internal.wire.PublisherBuilder$Builder setTopic(com.google.cloud.pubsublite.TopicPath p0)`

---

## public final class `com.google.cloud.pubsublite.internal.wire.PublisherImpl`
extends `com.google.cloud.pubsublite.internal.ProxyService`  
implements `com.google.cloud.pubsublite.internal.Publisher<com.google.cloud.pubsublite.Offset>`, `com.google.cloud.pubsublite.internal.wire.RetryingConnectionObserver<com.google.cloud.pubsublite.Offset>`  

**Constructors:**
- `public PublisherImpl(com.google.cloud.pubsublite.v1.PublisherServiceClient p0, com.google.cloud.pubsublite.proto.InitialPublishRequest p1, com.google.api.gax.batching.BatchingSettings p2) throws com.google.api.gax.rpc.ApiException`

**Methods:**
- `public void cancelOutstandingPublishes()`
- `public void flush()`
- `public void onClientResponse(com.google.cloud.pubsublite.Offset p0) throws com.google.cloud.pubsublite.internal.CheckedApiException`
- `public com.google.api.core.ApiFuture publish(com.google.cloud.pubsublite.Message p0)`
- `public void triggerReinitialize(com.google.cloud.pubsublite.internal.CheckedApiException p0)`

---

## public abstract class `com.google.cloud.pubsublite.internal.wire.PubsubContext`
annotations: @com.google.auto.value.AutoValue  

**Constructors:**
- `public PubsubContext()`

**Methods:**
- `public abstract java.util.Optional framework()`
- `public static com.google.cloud.pubsublite.internal.wire.PubsubContext of()`
- `public static com.google.cloud.pubsublite.internal.wire.PubsubContext of(com.google.cloud.pubsublite.internal.wire.PubsubContext$Framework p0)`

---

## public abstract static class `com.google.cloud.pubsublite.internal.wire.PubsubContext$Framework`
annotations: @com.google.auto.value.AutoValue  

**Constructors:**
- `public Framework()`

**Methods:**
- `public static com.google.cloud.pubsublite.internal.wire.PubsubContext$Framework of(java.lang.String p0)`
- `public abstract java.lang.String value()`

---

## public final class `com.google.cloud.pubsublite.internal.wire.ResetSignal`

**Methods:**
- `public static boolean isResetSignal(com.google.cloud.pubsublite.internal.CheckedApiException p0)`

---

## public abstract interface `com.google.cloud.pubsublite.internal.wire.RetryingConnectionObserver`<ClientResponseT extends java.lang.Object>

**Methods:**
- `public abstract void onClientResponse(ClientResponseT p0) throws com.google.cloud.pubsublite.internal.CheckedApiException`
- `public abstract void triggerReinitialize(com.google.cloud.pubsublite.internal.CheckedApiException p0)`

---

## public final class `com.google.cloud.pubsublite.internal.wire.RoutingMetadata`

**Methods:**
- `public java.util.Map getMetadata()`
- `public static com.google.cloud.pubsublite.internal.wire.RoutingMetadata of(com.google.cloud.pubsublite.SubscriptionPath p0, com.google.cloud.pubsublite.Partition p1) throws com.google.api.gax.rpc.ApiException`
- `public static com.google.cloud.pubsublite.internal.wire.RoutingMetadata of(com.google.cloud.pubsublite.TopicPath p0, com.google.cloud.pubsublite.Partition p1) throws com.google.api.gax.rpc.ApiException`

---

## public class `com.google.cloud.pubsublite.internal.wire.RoutingPublisher`
extends `com.google.cloud.pubsublite.internal.TrivialProxyService`  
implements `com.google.cloud.pubsublite.internal.Publisher<com.google.cloud.pubsublite.MessageMetadata>`  

**Methods:**
- `public void cancelOutstandingPublishes()`
- `public void flush() throws java.io.IOException`
- `public com.google.api.core.ApiFuture publish(com.google.cloud.pubsublite.Message p0)`

---

## public abstract class `com.google.cloud.pubsublite.internal.wire.RoutingPublisherBuilder`
annotations: @com.google.auto.value.AutoValue  

**Constructors:**
- `public RoutingPublisherBuilder()`

**Methods:**
- `public static com.google.cloud.pubsublite.internal.wire.RoutingPublisherBuilder$Builder newBuilder()`

---

## public abstract static class `com.google.cloud.pubsublite.internal.wire.RoutingPublisherBuilder$Builder`
annotations: @com.google.auto.value.AutoValue$Builder  

**Constructors:**
- `public Builder()`

**Methods:**
- `public com.google.cloud.pubsublite.internal.Publisher build() throws com.google.api.gax.rpc.ApiException`
- `public abstract com.google.cloud.pubsublite.internal.wire.RoutingPublisherBuilder$Builder setNumPartitions(java.lang.Integer p0)`
- `public abstract com.google.cloud.pubsublite.internal.wire.RoutingPublisherBuilder$Builder setPublisherFactory(com.google.cloud.pubsublite.internal.wire.PartitionPublisherFactory p0)`
- `public abstract com.google.cloud.pubsublite.internal.wire.RoutingPublisherBuilder$Builder setTopic(com.google.cloud.pubsublite.TopicPath p0)`

---

## public final class `com.google.cloud.pubsublite.internal.wire.ServiceClients`

**Methods:**
- `public static <Settings extends com.google.api.gax.rpc.ClientSettings<Settings>, Builder extends com.google.api.gax.rpc.ClientSettings$Builder<Settings, Builder>> Builder addDefaultMetadata(com.google.cloud.pubsublite.internal.wire.PubsubContext p0, com.google.cloud.pubsublite.internal.wire.RoutingMetadata p1, Builder p2)`
- `public static <Settings extends com.google.api.gax.rpc.ClientSettings<Settings>, Builder extends com.google.api.gax.rpc.ClientSettings$Builder<Settings, Builder>> Settings addDefaultSettings(com.google.cloud.pubsublite.CloudRegion p0, Builder p1) throws com.google.api.gax.rpc.ApiException`

---

## public abstract class `com.google.cloud.pubsublite.internal.wire.SingleConnection`<StreamRequestT extends java.lang.Object, StreamResponseT extends java.lang.Object, ClientResponseT extends java.lang.Object>
implements `com.google.api.gax.rpc.ResponseObserver<StreamResponseT>`, `java.lang.AutoCloseable`  

**Constructors:**
- `protected SingleConnection(com.google.cloud.pubsublite.internal.wire.StreamFactory p0, com.google.api.gax.rpc.ResponseObserver p1)`

**Methods:**
- `public void close()`
- `protected abstract void handleInitialResponse(StreamResponseT p0) throws com.google.cloud.pubsublite.internal.CheckedApiException`
- `protected abstract void handleStreamResponse(StreamResponseT p0) throws com.google.cloud.pubsublite.internal.CheckedApiException`
- `protected void initialize(StreamRequestT p0)`
- `protected boolean isCompleted()`
- `public void onComplete()`
- `public void onError(java.lang.Throwable p0)`
- `public void onResponse(StreamResponseT p0)`
- `public void onStart(com.google.api.gax.rpc.StreamController p0)`
- `protected void sendToClient(ClientResponseT p0)`
- `protected void sendToStream(StreamRequestT p0)`
- `protected void setError(com.google.cloud.pubsublite.internal.CheckedApiException p0)`

---

## public abstract interface `com.google.cloud.pubsublite.internal.wire.SingleConnectionFactory`<StreamRequestT extends java.lang.Object, StreamResponseT extends java.lang.Object, ClientResponseT extends java.lang.Object, ConnectionT extends java.lang.AutoCloseable>

**Methods:**
- `public abstract ConnectionT New(com.google.cloud.pubsublite.internal.wire.StreamFactory p0, com.google.api.gax.rpc.ResponseObserver p1, StreamRequestT p2)`

---

## public class `com.google.cloud.pubsublite.internal.wire.SinglePartitionPublisher`
extends `com.google.cloud.pubsublite.internal.TrivialProxyService`  
implements `com.google.cloud.pubsublite.internal.Publisher<com.google.cloud.pubsublite.MessageMetadata>`  

**Methods:**
- `public void cancelOutstandingPublishes()`
- `public void flush() throws java.io.IOException`
- `public com.google.api.core.ApiFuture publish(com.google.cloud.pubsublite.Message p0)`

---

## public abstract class `com.google.cloud.pubsublite.internal.wire.SinglePartitionPublisherBuilder`
annotations: @com.google.auto.value.AutoValue  

**Constructors:**
- `public SinglePartitionPublisherBuilder()`

**Methods:**
- `public static com.google.cloud.pubsublite.internal.wire.SinglePartitionPublisherBuilder$Builder newBuilder()`

---

## public abstract static class `com.google.cloud.pubsublite.internal.wire.SinglePartitionPublisherBuilder$Builder`
annotations: @com.google.auto.value.AutoValue$Builder  

**Constructors:**
- `public Builder()`

**Methods:**
- `public com.google.cloud.pubsublite.internal.Publisher build() throws com.google.api.gax.rpc.ApiException`
- `public abstract com.google.cloud.pubsublite.internal.wire.SinglePartitionPublisherBuilder$Builder setBatchingSettings(com.google.api.gax.batching.BatchingSettings p0)`
- `public abstract com.google.cloud.pubsublite.internal.wire.SinglePartitionPublisherBuilder$Builder setPartition(com.google.cloud.pubsublite.Partition p0)`
- `public abstract com.google.cloud.pubsublite.internal.wire.SinglePartitionPublisherBuilder$Builder setServiceClient(com.google.cloud.pubsublite.v1.PublisherServiceClient p0)`
- `public abstract com.google.cloud.pubsublite.internal.wire.SinglePartitionPublisherBuilder$Builder setTopic(com.google.cloud.pubsublite.TopicPath p0)`

---

## public abstract interface `com.google.cloud.pubsublite.internal.wire.StreamFactory`<RequestT extends java.lang.Object, ResponseT extends java.lang.Object>

**Methods:**
- `public abstract com.google.api.gax.rpc.ClientStream New(com.google.api.gax.rpc.ResponseObserver p0)`

---

## public abstract interface `com.google.cloud.pubsublite.internal.wire.Subscriber`
implements `com.google.api.core.ApiService`  

**Methods:**
- `public abstract void allowFlow(com.google.cloud.pubsublite.proto.FlowControlRequest p0) throws com.google.cloud.pubsublite.internal.CheckedApiException`

---

## public abstract class `com.google.cloud.pubsublite.internal.wire.SubscriberBuilder`
annotations: @com.google.auto.value.AutoValue  

**Constructors:**
- `public SubscriberBuilder()`

**Methods:**
- `public static com.google.cloud.pubsublite.internal.wire.SubscriberBuilder$Builder newBuilder()`

---

## public abstract static class `com.google.cloud.pubsublite.internal.wire.SubscriberBuilder$Builder`
annotations: @com.google.auto.value.AutoValue$Builder  

**Constructors:**
- `public Builder()`

**Methods:**
- `public com.google.cloud.pubsublite.internal.wire.Subscriber build() throws com.google.api.gax.rpc.ApiException`
- `public abstract com.google.cloud.pubsublite.internal.wire.SubscriberBuilder$Builder setInitialLocation(com.google.cloud.pubsublite.proto.SeekRequest p0)`
- `public abstract com.google.cloud.pubsublite.internal.wire.SubscriberBuilder$Builder setMessageConsumer(java.util.function.Consumer p0)`
- `public abstract com.google.cloud.pubsublite.internal.wire.SubscriberBuilder$Builder setPartition(com.google.cloud.pubsublite.Partition p0)`
- `public abstract com.google.cloud.pubsublite.internal.wire.SubscriberBuilder$Builder setResetHandler(com.google.cloud.pubsublite.internal.wire.SubscriberResetHandler p0)`
- `public abstract com.google.cloud.pubsublite.internal.wire.SubscriberBuilder$Builder setServiceClient(com.google.cloud.pubsublite.v1.SubscriberServiceClient p0)`
- `public abstract com.google.cloud.pubsublite.internal.wire.SubscriberBuilder$Builder setSubscriptionPath(com.google.cloud.pubsublite.SubscriptionPath p0)`

---

## public abstract interface `com.google.cloud.pubsublite.internal.wire.SubscriberFactory`
implements `java.io.Serializable`  

**Methods:**
- `public abstract com.google.cloud.pubsublite.internal.wire.Subscriber newSubscriber(java.util.function.Consumer p0) throws com.google.api.gax.rpc.ApiException`

---

## public class `com.google.cloud.pubsublite.internal.wire.SubscriberImpl`
extends `com.google.cloud.pubsublite.internal.ProxyService`  
implements `com.google.cloud.pubsublite.internal.wire.RetryingConnectionObserver<java.util.List<com.google.cloud.pubsublite.SequencedMessage>>`, `com.google.cloud.pubsublite.internal.wire.Subscriber`  

**Constructors:**
- `public SubscriberImpl(com.google.cloud.pubsublite.v1.SubscriberServiceClient p0, com.google.cloud.pubsublite.proto.InitialSubscribeRequest p1, com.google.cloud.pubsublite.proto.SeekRequest p2, java.util.function.Consumer p3, com.google.cloud.pubsublite.internal.wire.SubscriberResetHandler p4) throws com.google.api.gax.rpc.ApiException`

**Methods:**
- `public void allowFlow(com.google.cloud.pubsublite.proto.FlowControlRequest p0) throws com.google.cloud.pubsublite.internal.CheckedApiException`
- `protected void handlePermanentError(com.google.cloud.pubsublite.internal.CheckedApiException p0)`
- `public void onClientResponse(java.util.List p0) throws com.google.cloud.pubsublite.internal.CheckedApiException`
- `public void reset()`
- `protected void start()`
- `protected void stop()`
- `public void triggerReinitialize(com.google.cloud.pubsublite.internal.CheckedApiException p0)`

---

## public abstract interface `com.google.cloud.pubsublite.internal.wire.SubscriberResetHandler`

**Methods:**
- `public abstract boolean handleReset() throws com.google.cloud.pubsublite.internal.CheckedApiException`
- `public static boolean unhandled()`

---

## public class `com.google.cloud.pubsublite.internal.wire.SystemExecutors`

**Methods:**
- `public static java.util.concurrent.ScheduledExecutorService getAlarmExecutor()`
- `public static java.util.concurrent.ScheduledExecutorService getFuturesExecutor()`
- `public static java.util.concurrent.ScheduledExecutorService newDaemonExecutor(java.lang.String p0)`

---

## public class `com.google.cloud.pubsublite.v1.AdminServiceClient`
implements `com.google.api.gax.core.BackgroundResource`  

**Constructors:**
- `protected AdminServiceClient(com.google.cloud.pubsublite.v1.AdminServiceSettings p0) throws java.io.IOException`
- `protected AdminServiceClient(com.google.cloud.pubsublite.v1.stub.AdminServiceStub p0)`

**Methods:**
- `public boolean awaitTermination(long p0, java.util.concurrent.TimeUnit p1) throws java.lang.InterruptedException`
- `public final void close()`
- `public final static com.google.cloud.pubsublite.v1.AdminServiceClient create() throws java.io.IOException`
- `public final static com.google.cloud.pubsublite.v1.AdminServiceClient create(com.google.cloud.pubsublite.v1.AdminServiceSettings p0) throws java.io.IOException`
- `public final static com.google.cloud.pubsublite.v1.AdminServiceClient create(com.google.cloud.pubsublite.v1.stub.AdminServiceStub p0)`
- `public final com.google.cloud.pubsublite.proto.Reservation createReservation(com.google.cloud.pubsublite.proto.CreateReservationRequest p0)`
- `public final com.google.cloud.pubsublite.proto.Reservation createReservation(com.google.cloud.pubsublite.proto.LocationName p0, com.google.cloud.pubsublite.proto.Reservation p1, java.lang.String p2)`
- `public final com.google.cloud.pubsublite.proto.Reservation createReservation(java.lang.String p0, com.google.cloud.pubsublite.proto.Reservation p1, java.lang.String p2)`
- `public final com.google.api.gax.rpc.UnaryCallable createReservationCallable()`
- `public final com.google.cloud.pubsublite.proto.Subscription createSubscription(com.google.cloud.pubsublite.proto.CreateSubscriptionRequest p0)`
- `public final com.google.cloud.pubsublite.proto.Subscription createSubscription(com.google.cloud.pubsublite.proto.LocationName p0, com.google.cloud.pubsublite.proto.Subscription p1, java.lang.String p2)`
- `public final com.google.cloud.pubsublite.proto.Subscription createSubscription(java.lang.String p0, com.google.cloud.pubsublite.proto.Subscription p1, java.lang.String p2)`
- `public final com.google.api.gax.rpc.UnaryCallable createSubscriptionCallable()`
- `public final com.google.cloud.pubsublite.proto.Topic createTopic(com.google.cloud.pubsublite.proto.CreateTopicRequest p0)`
- `public final com.google.cloud.pubsublite.proto.Topic createTopic(com.google.cloud.pubsublite.proto.LocationName p0, com.google.cloud.pubsublite.proto.Topic p1, java.lang.String p2)`
- `public final com.google.cloud.pubsublite.proto.Topic createTopic(java.lang.String p0, com.google.cloud.pubsublite.proto.Topic p1, java.lang.String p2)`
- `public final com.google.api.gax.rpc.UnaryCallable createTopicCallable()`
- `public final void deleteReservation(com.google.cloud.pubsublite.proto.DeleteReservationRequest p0)`
- `public final void deleteReservation(com.google.cloud.pubsublite.proto.ReservationName p0)`
- `public final void deleteReservation(java.lang.String p0)`
- `public final com.google.api.gax.rpc.UnaryCallable deleteReservationCallable()`
- `public final void deleteSubscription(com.google.cloud.pubsublite.proto.DeleteSubscriptionRequest p0)`
- `public final void deleteSubscription(com.google.cloud.pubsublite.proto.SubscriptionName p0)`
- `public final void deleteSubscription(java.lang.String p0)`
- `public final com.google.api.gax.rpc.UnaryCallable deleteSubscriptionCallable()`
- `public final void deleteTopic(com.google.cloud.pubsublite.proto.DeleteTopicRequest p0)`
- `public final void deleteTopic(com.google.cloud.pubsublite.proto.TopicName p0)`
- `public final void deleteTopic(java.lang.String p0)`
- `public final com.google.api.gax.rpc.UnaryCallable deleteTopicCallable()`
- `public final com.google.longrunning.OperationsClient getOperationsClient()`
- `public final com.google.cloud.pubsublite.proto.Reservation getReservation(com.google.cloud.pubsublite.proto.GetReservationRequest p0)`
- `public final com.google.cloud.pubsublite.proto.Reservation getReservation(com.google.cloud.pubsublite.proto.ReservationName p0)`
- `public final com.google.cloud.pubsublite.proto.Reservation getReservation(java.lang.String p0)`
- `public final com.google.api.gax.rpc.UnaryCallable getReservationCallable()`
- `public final com.google.cloud.pubsublite.v1.AdminServiceSettings getSettings()`
- `public com.google.cloud.pubsublite.v1.stub.AdminServiceStub getStub()`
- `public final com.google.cloud.pubsublite.proto.Subscription getSubscription(com.google.cloud.pubsublite.proto.GetSubscriptionRequest p0)`
- `public final com.google.cloud.pubsublite.proto.Subscription getSubscription(com.google.cloud.pubsublite.proto.SubscriptionName p0)`
- `public final com.google.cloud.pubsublite.proto.Subscription getSubscription(java.lang.String p0)`
- `public final com.google.api.gax.rpc.UnaryCallable getSubscriptionCallable()`
- `public final com.google.cloud.pubsublite.proto.Topic getTopic(com.google.cloud.pubsublite.proto.GetTopicRequest p0)`
- `public final com.google.cloud.pubsublite.proto.Topic getTopic(com.google.cloud.pubsublite.proto.TopicName p0)`
- `public final com.google.cloud.pubsublite.proto.Topic getTopic(java.lang.String p0)`
- `public final com.google.api.gax.rpc.UnaryCallable getTopicCallable()`
- `public final com.google.cloud.pubsublite.proto.TopicPartitions getTopicPartitions(com.google.cloud.pubsublite.proto.GetTopicPartitionsRequest p0)`
- `public final com.google.cloud.pubsublite.proto.TopicPartitions getTopicPartitions(com.google.cloud.pubsublite.proto.TopicName p0)`
- `public final com.google.cloud.pubsublite.proto.TopicPartitions getTopicPartitions(java.lang.String p0)`
- `public final com.google.api.gax.rpc.UnaryCallable getTopicPartitionsCallable()`
- `public boolean isShutdown()`
- `public boolean isTerminated()`
- `public final com.google.cloud.pubsublite.v1.AdminServiceClient$ListReservationTopicsPagedResponse listReservationTopics(com.google.cloud.pubsublite.proto.ListReservationTopicsRequest p0)`
- `public final com.google.cloud.pubsublite.v1.AdminServiceClient$ListReservationTopicsPagedResponse listReservationTopics(com.google.cloud.pubsublite.proto.ReservationName p0)`
- `public final com.google.cloud.pubsublite.v1.AdminServiceClient$ListReservationTopicsPagedResponse listReservationTopics(java.lang.String p0)`
- `public final com.google.api.gax.rpc.UnaryCallable listReservationTopicsCallable()`
- `public final com.google.api.gax.rpc.UnaryCallable listReservationTopicsPagedCallable()`
- `public final com.google.cloud.pubsublite.v1.AdminServiceClient$ListReservationsPagedResponse listReservations(com.google.cloud.pubsublite.proto.ListReservationsRequest p0)`
- `public final com.google.cloud.pubsublite.v1.AdminServiceClient$ListReservationsPagedResponse listReservations(com.google.cloud.pubsublite.proto.LocationName p0)`
- `public final com.google.cloud.pubsublite.v1.AdminServiceClient$ListReservationsPagedResponse listReservations(java.lang.String p0)`
- `public final com.google.api.gax.rpc.UnaryCallable listReservationsCallable()`
- `public final com.google.api.gax.rpc.UnaryCallable listReservationsPagedCallable()`
- `public final com.google.cloud.pubsublite.v1.AdminServiceClient$ListSubscriptionsPagedResponse listSubscriptions(com.google.cloud.pubsublite.proto.ListSubscriptionsRequest p0)`
- `public final com.google.cloud.pubsublite.v1.AdminServiceClient$ListSubscriptionsPagedResponse listSubscriptions(com.google.cloud.pubsublite.proto.LocationName p0)`
- `public final com.google.cloud.pubsublite.v1.AdminServiceClient$ListSubscriptionsPagedResponse listSubscriptions(java.lang.String p0)`
- `public final com.google.api.gax.rpc.UnaryCallable listSubscriptionsCallable()`
- `public final com.google.api.gax.rpc.UnaryCallable listSubscriptionsPagedCallable()`
- `public final com.google.cloud.pubsublite.v1.AdminServiceClient$ListTopicSubscriptionsPagedResponse listTopicSubscriptions(com.google.cloud.pubsublite.proto.ListTopicSubscriptionsRequest p0)`
- `public final com.google.cloud.pubsublite.v1.AdminServiceClient$ListTopicSubscriptionsPagedResponse listTopicSubscriptions(com.google.cloud.pubsublite.proto.TopicName p0)`
- `public final com.google.cloud.pubsublite.v1.AdminServiceClient$ListTopicSubscriptionsPagedResponse listTopicSubscriptions(java.lang.String p0)`
- `public final com.google.api.gax.rpc.UnaryCallable listTopicSubscriptionsCallable()`
- `public final com.google.api.gax.rpc.UnaryCallable listTopicSubscriptionsPagedCallable()`
- `public final com.google.cloud.pubsublite.v1.AdminServiceClient$ListTopicsPagedResponse listTopics(com.google.cloud.pubsublite.proto.ListTopicsRequest p0)`
- `public final com.google.cloud.pubsublite.v1.AdminServiceClient$ListTopicsPagedResponse listTopics(com.google.cloud.pubsublite.proto.LocationName p0)`
- `public final com.google.cloud.pubsublite.v1.AdminServiceClient$ListTopicsPagedResponse listTopics(java.lang.String p0)`
- `public final com.google.api.gax.rpc.UnaryCallable listTopicsCallable()`
- `public final com.google.api.gax.rpc.UnaryCallable listTopicsPagedCallable()`
- `public final com.google.api.gax.longrunning.OperationFuture seekSubscriptionAsync(com.google.cloud.pubsublite.proto.SeekSubscriptionRequest p0)`
- `public final com.google.api.gax.rpc.UnaryCallable seekSubscriptionCallable()`
- `public final com.google.api.gax.rpc.OperationCallable seekSubscriptionOperationCallable()`
- `public void shutdown()`
- `public void shutdownNow()`
- `public final com.google.cloud.pubsublite.proto.Reservation updateReservation(com.google.cloud.pubsublite.proto.Reservation p0, com.google.protobuf.FieldMask p1)`
- `public final com.google.cloud.pubsublite.proto.Reservation updateReservation(com.google.cloud.pubsublite.proto.UpdateReservationRequest p0)`
- `public final com.google.api.gax.rpc.UnaryCallable updateReservationCallable()`
- `public final com.google.cloud.pubsublite.proto.Subscription updateSubscription(com.google.cloud.pubsublite.proto.Subscription p0, com.google.protobuf.FieldMask p1)`
- `public final com.google.cloud.pubsublite.proto.Subscription updateSubscription(com.google.cloud.pubsublite.proto.UpdateSubscriptionRequest p0)`
- `public final com.google.api.gax.rpc.UnaryCallable updateSubscriptionCallable()`
- `public final com.google.cloud.pubsublite.proto.Topic updateTopic(com.google.cloud.pubsublite.proto.Topic p0, com.google.protobuf.FieldMask p1)`
- `public final com.google.cloud.pubsublite.proto.Topic updateTopic(com.google.cloud.pubsublite.proto.UpdateTopicRequest p0)`
- `public final com.google.api.gax.rpc.UnaryCallable updateTopicCallable()`

---

## public static class `com.google.cloud.pubsublite.v1.AdminServiceClient$ListReservationTopicsFixedSizeCollection`
extends `com.google.api.gax.paging.AbstractFixedSizeCollection`  

---

## public static class `com.google.cloud.pubsublite.v1.AdminServiceClient$ListReservationTopicsPage`
extends `com.google.api.gax.paging.AbstractPage`  

**Methods:**
- `public com.google.api.core.ApiFuture createPageAsync(com.google.api.gax.rpc.PageContext p0, com.google.api.core.ApiFuture p1)`

---

## public static class `com.google.cloud.pubsublite.v1.AdminServiceClient$ListReservationTopicsPagedResponse`
extends `com.google.api.gax.paging.AbstractPagedListResponse`  

**Methods:**
- `public static com.google.api.core.ApiFuture createAsync(com.google.api.gax.rpc.PageContext p0, com.google.api.core.ApiFuture p1)`

---

## public static class `com.google.cloud.pubsublite.v1.AdminServiceClient$ListReservationsFixedSizeCollection`
extends `com.google.api.gax.paging.AbstractFixedSizeCollection`  

---

## public static class `com.google.cloud.pubsublite.v1.AdminServiceClient$ListReservationsPage`
extends `com.google.api.gax.paging.AbstractPage`  

**Methods:**
- `public com.google.api.core.ApiFuture createPageAsync(com.google.api.gax.rpc.PageContext p0, com.google.api.core.ApiFuture p1)`

---

## public static class `com.google.cloud.pubsublite.v1.AdminServiceClient$ListReservationsPagedResponse`
extends `com.google.api.gax.paging.AbstractPagedListResponse`  

**Methods:**
- `public static com.google.api.core.ApiFuture createAsync(com.google.api.gax.rpc.PageContext p0, com.google.api.core.ApiFuture p1)`

---

## public static class `com.google.cloud.pubsublite.v1.AdminServiceClient$ListSubscriptionsFixedSizeCollection`
extends `com.google.api.gax.paging.AbstractFixedSizeCollection`  

---

## public static class `com.google.cloud.pubsublite.v1.AdminServiceClient$ListSubscriptionsPage`
extends `com.google.api.gax.paging.AbstractPage`  

**Methods:**
- `public com.google.api.core.ApiFuture createPageAsync(com.google.api.gax.rpc.PageContext p0, com.google.api.core.ApiFuture p1)`

---

## public static class `com.google.cloud.pubsublite.v1.AdminServiceClient$ListSubscriptionsPagedResponse`
extends `com.google.api.gax.paging.AbstractPagedListResponse`  

**Methods:**
- `public static com.google.api.core.ApiFuture createAsync(com.google.api.gax.rpc.PageContext p0, com.google.api.core.ApiFuture p1)`

---

## public static class `com.google.cloud.pubsublite.v1.AdminServiceClient$ListTopicSubscriptionsFixedSizeCollection`
extends `com.google.api.gax.paging.AbstractFixedSizeCollection`  

---

## public static class `com.google.cloud.pubsublite.v1.AdminServiceClient$ListTopicSubscriptionsPage`
extends `com.google.api.gax.paging.AbstractPage`  

**Methods:**
- `public com.google.api.core.ApiFuture createPageAsync(com.google.api.gax.rpc.PageContext p0, com.google.api.core.ApiFuture p1)`

---

## public static class `com.google.cloud.pubsublite.v1.AdminServiceClient$ListTopicSubscriptionsPagedResponse`
extends `com.google.api.gax.paging.AbstractPagedListResponse`  

**Methods:**
- `public static com.google.api.core.ApiFuture createAsync(com.google.api.gax.rpc.PageContext p0, com.google.api.core.ApiFuture p1)`

---

## public static class `com.google.cloud.pubsublite.v1.AdminServiceClient$ListTopicsFixedSizeCollection`
extends `com.google.api.gax.paging.AbstractFixedSizeCollection`  

---

## public static class `com.google.cloud.pubsublite.v1.AdminServiceClient$ListTopicsPage`
extends `com.google.api.gax.paging.AbstractPage`  

**Methods:**
- `public com.google.api.core.ApiFuture createPageAsync(com.google.api.gax.rpc.PageContext p0, com.google.api.core.ApiFuture p1)`

---

## public static class `com.google.cloud.pubsublite.v1.AdminServiceClient$ListTopicsPagedResponse`
extends `com.google.api.gax.paging.AbstractPagedListResponse`  

**Methods:**
- `public static com.google.api.core.ApiFuture createAsync(com.google.api.gax.rpc.PageContext p0, com.google.api.core.ApiFuture p1)`

---

## public class `com.google.cloud.pubsublite.v1.AdminServiceSettings`
extends `com.google.api.gax.rpc.ClientSettings`  

**Constructors:**
- `protected AdminServiceSettings(com.google.cloud.pubsublite.v1.AdminServiceSettings$Builder p0) throws java.io.IOException`

**Methods:**
- `public final static com.google.cloud.pubsublite.v1.AdminServiceSettings create(com.google.cloud.pubsublite.v1.stub.AdminServiceStubSettings p0) throws java.io.IOException`
- `public com.google.api.gax.rpc.UnaryCallSettings createReservationSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings createSubscriptionSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings createTopicSettings()`
- `public static com.google.api.gax.rpc.ApiClientHeaderProvider$Builder defaultApiClientHeaderProviderBuilder()`
- `public static com.google.api.gax.core.GoogleCredentialsProvider$Builder defaultCredentialsProviderBuilder()`
- `public static com.google.api.gax.core.InstantiatingExecutorProvider$Builder defaultExecutorProviderBuilder()`
- `public static com.google.api.gax.grpc.InstantiatingGrpcChannelProvider$Builder defaultGrpcTransportProviderBuilder()`
- `public static com.google.api.gax.rpc.TransportChannelProvider defaultTransportChannelProvider()`
- `public com.google.api.gax.rpc.UnaryCallSettings deleteReservationSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings deleteSubscriptionSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings deleteTopicSettings()`
- `public static java.lang.String getDefaultEndpoint()`
- `public static java.util.List getDefaultServiceScopes()`
- `public com.google.api.gax.rpc.UnaryCallSettings getReservationSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings getSubscriptionSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings getTopicPartitionsSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings getTopicSettings()`
- `public com.google.api.gax.rpc.PagedCallSettings listReservationTopicsSettings()`
- `public com.google.api.gax.rpc.PagedCallSettings listReservationsSettings()`
- `public com.google.api.gax.rpc.PagedCallSettings listSubscriptionsSettings()`
- `public com.google.api.gax.rpc.PagedCallSettings listTopicSubscriptionsSettings()`
- `public com.google.api.gax.rpc.PagedCallSettings listTopicsSettings()`
- `public static com.google.cloud.pubsublite.v1.AdminServiceSettings$Builder newBuilder()`
- `public static com.google.cloud.pubsublite.v1.AdminServiceSettings$Builder newBuilder(com.google.api.gax.rpc.ClientContext p0)`
- `public com.google.api.gax.rpc.OperationCallSettings seekSubscriptionOperationSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings seekSubscriptionSettings()`
- `public com.google.cloud.pubsublite.v1.AdminServiceSettings$Builder toBuilder()`
- `public com.google.api.gax.rpc.UnaryCallSettings updateReservationSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings updateSubscriptionSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings updateTopicSettings()`

---

## public static class `com.google.cloud.pubsublite.v1.AdminServiceSettings$Builder`
extends `com.google.api.gax.rpc.ClientSettings$Builder`  

**Constructors:**
- `protected Builder() throws java.io.IOException`
- `protected Builder(com.google.api.gax.rpc.ClientContext p0)`
- `protected Builder(com.google.cloud.pubsublite.v1.AdminServiceSettings p0)`
- `protected Builder(com.google.cloud.pubsublite.v1.stub.AdminServiceStubSettings$Builder p0)`

**Methods:**
- `public com.google.cloud.pubsublite.v1.AdminServiceSettings$Builder applyToAllUnaryMethods(com.google.api.core.ApiFunction p0) throws java.lang.Exception`
- `public com.google.cloud.pubsublite.v1.AdminServiceSettings build() throws java.io.IOException`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder createReservationSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder createSubscriptionSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder createTopicSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder deleteReservationSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder deleteSubscriptionSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder deleteTopicSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder getReservationSettings()`
- `public com.google.cloud.pubsublite.v1.stub.AdminServiceStubSettings$Builder getStubSettingsBuilder()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder getSubscriptionSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder getTopicPartitionsSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder getTopicSettings()`
- `public com.google.api.gax.rpc.PagedCallSettings$Builder listReservationTopicsSettings()`
- `public com.google.api.gax.rpc.PagedCallSettings$Builder listReservationsSettings()`
- `public com.google.api.gax.rpc.PagedCallSettings$Builder listSubscriptionsSettings()`
- `public com.google.api.gax.rpc.PagedCallSettings$Builder listTopicSubscriptionsSettings()`
- `public com.google.api.gax.rpc.PagedCallSettings$Builder listTopicsSettings()`
- `public com.google.api.gax.rpc.OperationCallSettings$Builder seekSubscriptionOperationSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder seekSubscriptionSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder updateReservationSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder updateSubscriptionSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder updateTopicSettings()`

---

## public class `com.google.cloud.pubsublite.v1.CursorServiceClient`
implements `com.google.api.gax.core.BackgroundResource`  

**Constructors:**
- `protected CursorServiceClient(com.google.cloud.pubsublite.v1.CursorServiceSettings p0) throws java.io.IOException`
- `protected CursorServiceClient(com.google.cloud.pubsublite.v1.stub.CursorServiceStub p0)`

**Methods:**
- `public boolean awaitTermination(long p0, java.util.concurrent.TimeUnit p1) throws java.lang.InterruptedException`
- `public final void close()`
- `public final com.google.cloud.pubsublite.proto.CommitCursorResponse commitCursor(com.google.cloud.pubsublite.proto.CommitCursorRequest p0)`
- `public final com.google.api.gax.rpc.UnaryCallable commitCursorCallable()`
- `public final static com.google.cloud.pubsublite.v1.CursorServiceClient create() throws java.io.IOException`
- `public final static com.google.cloud.pubsublite.v1.CursorServiceClient create(com.google.cloud.pubsublite.v1.CursorServiceSettings p0) throws java.io.IOException`
- `public final static com.google.cloud.pubsublite.v1.CursorServiceClient create(com.google.cloud.pubsublite.v1.stub.CursorServiceStub p0)`
- `public final com.google.cloud.pubsublite.v1.CursorServiceSettings getSettings()`
- `public com.google.cloud.pubsublite.v1.stub.CursorServiceStub getStub()`
- `public boolean isShutdown()`
- `public boolean isTerminated()`
- `public final com.google.cloud.pubsublite.v1.CursorServiceClient$ListPartitionCursorsPagedResponse listPartitionCursors(com.google.cloud.pubsublite.proto.ListPartitionCursorsRequest p0)`
- `public final com.google.cloud.pubsublite.v1.CursorServiceClient$ListPartitionCursorsPagedResponse listPartitionCursors(com.google.cloud.pubsublite.proto.SubscriptionName p0)`
- `public final com.google.cloud.pubsublite.v1.CursorServiceClient$ListPartitionCursorsPagedResponse listPartitionCursors(java.lang.String p0)`
- `public final com.google.api.gax.rpc.UnaryCallable listPartitionCursorsCallable()`
- `public final com.google.api.gax.rpc.UnaryCallable listPartitionCursorsPagedCallable()`
- `public void shutdown()`
- `public void shutdownNow()`
- `public final com.google.api.gax.rpc.BidiStreamingCallable streamingCommitCursorCallable()`

---

## public static class `com.google.cloud.pubsublite.v1.CursorServiceClient$ListPartitionCursorsFixedSizeCollection`
extends `com.google.api.gax.paging.AbstractFixedSizeCollection`  

---

## public static class `com.google.cloud.pubsublite.v1.CursorServiceClient$ListPartitionCursorsPage`
extends `com.google.api.gax.paging.AbstractPage`  

**Methods:**
- `public com.google.api.core.ApiFuture createPageAsync(com.google.api.gax.rpc.PageContext p0, com.google.api.core.ApiFuture p1)`

---

## public static class `com.google.cloud.pubsublite.v1.CursorServiceClient$ListPartitionCursorsPagedResponse`
extends `com.google.api.gax.paging.AbstractPagedListResponse`  

**Methods:**
- `public static com.google.api.core.ApiFuture createAsync(com.google.api.gax.rpc.PageContext p0, com.google.api.core.ApiFuture p1)`

---

## public class `com.google.cloud.pubsublite.v1.CursorServiceSettings`
extends `com.google.api.gax.rpc.ClientSettings`  

**Constructors:**
- `protected CursorServiceSettings(com.google.cloud.pubsublite.v1.CursorServiceSettings$Builder p0) throws java.io.IOException`

**Methods:**
- `public com.google.api.gax.rpc.UnaryCallSettings commitCursorSettings()`
- `public final static com.google.cloud.pubsublite.v1.CursorServiceSettings create(com.google.cloud.pubsublite.v1.stub.CursorServiceStubSettings p0) throws java.io.IOException`
- `public static com.google.api.gax.rpc.ApiClientHeaderProvider$Builder defaultApiClientHeaderProviderBuilder()`
- `public static com.google.api.gax.core.GoogleCredentialsProvider$Builder defaultCredentialsProviderBuilder()`
- `public static com.google.api.gax.core.InstantiatingExecutorProvider$Builder defaultExecutorProviderBuilder()`
- `public static com.google.api.gax.grpc.InstantiatingGrpcChannelProvider$Builder defaultGrpcTransportProviderBuilder()`
- `public static com.google.api.gax.rpc.TransportChannelProvider defaultTransportChannelProvider()`
- `public static java.lang.String getDefaultEndpoint()`
- `public static java.util.List getDefaultServiceScopes()`
- `public com.google.api.gax.rpc.PagedCallSettings listPartitionCursorsSettings()`
- `public static com.google.cloud.pubsublite.v1.CursorServiceSettings$Builder newBuilder()`
- `public static com.google.cloud.pubsublite.v1.CursorServiceSettings$Builder newBuilder(com.google.api.gax.rpc.ClientContext p0)`
- `public com.google.api.gax.rpc.StreamingCallSettings streamingCommitCursorSettings()`
- `public com.google.cloud.pubsublite.v1.CursorServiceSettings$Builder toBuilder()`

---

## public static class `com.google.cloud.pubsublite.v1.CursorServiceSettings$Builder`
extends `com.google.api.gax.rpc.ClientSettings$Builder`  

**Constructors:**
- `protected Builder() throws java.io.IOException`
- `protected Builder(com.google.api.gax.rpc.ClientContext p0)`
- `protected Builder(com.google.cloud.pubsublite.v1.CursorServiceSettings p0)`
- `protected Builder(com.google.cloud.pubsublite.v1.stub.CursorServiceStubSettings$Builder p0)`

**Methods:**
- `public com.google.cloud.pubsublite.v1.CursorServiceSettings$Builder applyToAllUnaryMethods(com.google.api.core.ApiFunction p0) throws java.lang.Exception`
- `public com.google.cloud.pubsublite.v1.CursorServiceSettings build() throws java.io.IOException`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder commitCursorSettings()`
- `public com.google.cloud.pubsublite.v1.stub.CursorServiceStubSettings$Builder getStubSettingsBuilder()`
- `public com.google.api.gax.rpc.PagedCallSettings$Builder listPartitionCursorsSettings()`
- `public com.google.api.gax.rpc.StreamingCallSettings$Builder streamingCommitCursorSettings()`

---

## public class `com.google.cloud.pubsublite.v1.PartitionAssignmentServiceClient`
implements `com.google.api.gax.core.BackgroundResource`  

**Constructors:**
- `protected PartitionAssignmentServiceClient(com.google.cloud.pubsublite.v1.PartitionAssignmentServiceSettings p0) throws java.io.IOException`
- `protected PartitionAssignmentServiceClient(com.google.cloud.pubsublite.v1.stub.PartitionAssignmentServiceStub p0)`

**Methods:**
- `public final com.google.api.gax.rpc.BidiStreamingCallable assignPartitionsCallable()`
- `public boolean awaitTermination(long p0, java.util.concurrent.TimeUnit p1) throws java.lang.InterruptedException`
- `public final void close()`
- `public final static com.google.cloud.pubsublite.v1.PartitionAssignmentServiceClient create() throws java.io.IOException`
- `public final static com.google.cloud.pubsublite.v1.PartitionAssignmentServiceClient create(com.google.cloud.pubsublite.v1.PartitionAssignmentServiceSettings p0) throws java.io.IOException`
- `public final static com.google.cloud.pubsublite.v1.PartitionAssignmentServiceClient create(com.google.cloud.pubsublite.v1.stub.PartitionAssignmentServiceStub p0)`
- `public final com.google.cloud.pubsublite.v1.PartitionAssignmentServiceSettings getSettings()`
- `public com.google.cloud.pubsublite.v1.stub.PartitionAssignmentServiceStub getStub()`
- `public boolean isShutdown()`
- `public boolean isTerminated()`
- `public void shutdown()`
- `public void shutdownNow()`

---

## public class `com.google.cloud.pubsublite.v1.PartitionAssignmentServiceSettings`
extends `com.google.api.gax.rpc.ClientSettings`  

**Constructors:**
- `protected PartitionAssignmentServiceSettings(com.google.cloud.pubsublite.v1.PartitionAssignmentServiceSettings$Builder p0) throws java.io.IOException`

**Methods:**
- `public com.google.api.gax.rpc.StreamingCallSettings assignPartitionsSettings()`
- `public final static com.google.cloud.pubsublite.v1.PartitionAssignmentServiceSettings create(com.google.cloud.pubsublite.v1.stub.PartitionAssignmentServiceStubSettings p0) throws java.io.IOException`
- `public static com.google.api.gax.rpc.ApiClientHeaderProvider$Builder defaultApiClientHeaderProviderBuilder()`
- `public static com.google.api.gax.core.GoogleCredentialsProvider$Builder defaultCredentialsProviderBuilder()`
- `public static com.google.api.gax.core.InstantiatingExecutorProvider$Builder defaultExecutorProviderBuilder()`
- `public static com.google.api.gax.grpc.InstantiatingGrpcChannelProvider$Builder defaultGrpcTransportProviderBuilder()`
- `public static com.google.api.gax.rpc.TransportChannelProvider defaultTransportChannelProvider()`
- `public static java.lang.String getDefaultEndpoint()`
- `public static java.util.List getDefaultServiceScopes()`
- `public static com.google.cloud.pubsublite.v1.PartitionAssignmentServiceSettings$Builder newBuilder()`
- `public static com.google.cloud.pubsublite.v1.PartitionAssignmentServiceSettings$Builder newBuilder(com.google.api.gax.rpc.ClientContext p0)`
- `public com.google.cloud.pubsublite.v1.PartitionAssignmentServiceSettings$Builder toBuilder()`

---

## public static class `com.google.cloud.pubsublite.v1.PartitionAssignmentServiceSettings$Builder`
extends `com.google.api.gax.rpc.ClientSettings$Builder`  

**Constructors:**
- `protected Builder() throws java.io.IOException`
- `protected Builder(com.google.api.gax.rpc.ClientContext p0)`
- `protected Builder(com.google.cloud.pubsublite.v1.PartitionAssignmentServiceSettings p0)`
- `protected Builder(com.google.cloud.pubsublite.v1.stub.PartitionAssignmentServiceStubSettings$Builder p0)`

**Methods:**
- `public com.google.cloud.pubsublite.v1.PartitionAssignmentServiceSettings$Builder applyToAllUnaryMethods(com.google.api.core.ApiFunction p0) throws java.lang.Exception`
- `public com.google.api.gax.rpc.StreamingCallSettings$Builder assignPartitionsSettings()`
- `public com.google.cloud.pubsublite.v1.PartitionAssignmentServiceSettings build() throws java.io.IOException`
- `public com.google.cloud.pubsublite.v1.stub.PartitionAssignmentServiceStubSettings$Builder getStubSettingsBuilder()`

---

## public class `com.google.cloud.pubsublite.v1.PublisherServiceClient`
implements `com.google.api.gax.core.BackgroundResource`  

**Constructors:**
- `protected PublisherServiceClient(com.google.cloud.pubsublite.v1.PublisherServiceSettings p0) throws java.io.IOException`
- `protected PublisherServiceClient(com.google.cloud.pubsublite.v1.stub.PublisherServiceStub p0)`

**Methods:**
- `public boolean awaitTermination(long p0, java.util.concurrent.TimeUnit p1) throws java.lang.InterruptedException`
- `public final void close()`
- `public final static com.google.cloud.pubsublite.v1.PublisherServiceClient create() throws java.io.IOException`
- `public final static com.google.cloud.pubsublite.v1.PublisherServiceClient create(com.google.cloud.pubsublite.v1.PublisherServiceSettings p0) throws java.io.IOException`
- `public final static com.google.cloud.pubsublite.v1.PublisherServiceClient create(com.google.cloud.pubsublite.v1.stub.PublisherServiceStub p0)`
- `public final com.google.cloud.pubsublite.v1.PublisherServiceSettings getSettings()`
- `public com.google.cloud.pubsublite.v1.stub.PublisherServiceStub getStub()`
- `public boolean isShutdown()`
- `public boolean isTerminated()`
- `public final com.google.api.gax.rpc.BidiStreamingCallable publishCallable()`
- `public void shutdown()`
- `public void shutdownNow()`

---

## public class `com.google.cloud.pubsublite.v1.PublisherServiceSettings`
extends `com.google.api.gax.rpc.ClientSettings`  

**Constructors:**
- `protected PublisherServiceSettings(com.google.cloud.pubsublite.v1.PublisherServiceSettings$Builder p0) throws java.io.IOException`

**Methods:**
- `public final static com.google.cloud.pubsublite.v1.PublisherServiceSettings create(com.google.cloud.pubsublite.v1.stub.PublisherServiceStubSettings p0) throws java.io.IOException`
- `public static com.google.api.gax.rpc.ApiClientHeaderProvider$Builder defaultApiClientHeaderProviderBuilder()`
- `public static com.google.api.gax.core.GoogleCredentialsProvider$Builder defaultCredentialsProviderBuilder()`
- `public static com.google.api.gax.core.InstantiatingExecutorProvider$Builder defaultExecutorProviderBuilder()`
- `public static com.google.api.gax.grpc.InstantiatingGrpcChannelProvider$Builder defaultGrpcTransportProviderBuilder()`
- `public static com.google.api.gax.rpc.TransportChannelProvider defaultTransportChannelProvider()`
- `public static java.lang.String getDefaultEndpoint()`
- `public static java.util.List getDefaultServiceScopes()`
- `public static com.google.cloud.pubsublite.v1.PublisherServiceSettings$Builder newBuilder()`
- `public static com.google.cloud.pubsublite.v1.PublisherServiceSettings$Builder newBuilder(com.google.api.gax.rpc.ClientContext p0)`
- `public com.google.api.gax.rpc.StreamingCallSettings publishSettings()`
- `public com.google.cloud.pubsublite.v1.PublisherServiceSettings$Builder toBuilder()`

---

## public static class `com.google.cloud.pubsublite.v1.PublisherServiceSettings$Builder`
extends `com.google.api.gax.rpc.ClientSettings$Builder`  

**Constructors:**
- `protected Builder() throws java.io.IOException`
- `protected Builder(com.google.api.gax.rpc.ClientContext p0)`
- `protected Builder(com.google.cloud.pubsublite.v1.PublisherServiceSettings p0)`
- `protected Builder(com.google.cloud.pubsublite.v1.stub.PublisherServiceStubSettings$Builder p0)`

**Methods:**
- `public com.google.cloud.pubsublite.v1.PublisherServiceSettings$Builder applyToAllUnaryMethods(com.google.api.core.ApiFunction p0) throws java.lang.Exception`
- `public com.google.cloud.pubsublite.v1.PublisherServiceSettings build() throws java.io.IOException`
- `public com.google.cloud.pubsublite.v1.stub.PublisherServiceStubSettings$Builder getStubSettingsBuilder()`
- `public com.google.api.gax.rpc.StreamingCallSettings$Builder publishSettings()`

---

## public class `com.google.cloud.pubsublite.v1.SubscriberServiceClient`
implements `com.google.api.gax.core.BackgroundResource`  

**Constructors:**
- `protected SubscriberServiceClient(com.google.cloud.pubsublite.v1.SubscriberServiceSettings p0) throws java.io.IOException`
- `protected SubscriberServiceClient(com.google.cloud.pubsublite.v1.stub.SubscriberServiceStub p0)`

**Methods:**
- `public boolean awaitTermination(long p0, java.util.concurrent.TimeUnit p1) throws java.lang.InterruptedException`
- `public final void close()`
- `public final static com.google.cloud.pubsublite.v1.SubscriberServiceClient create() throws java.io.IOException`
- `public final static com.google.cloud.pubsublite.v1.SubscriberServiceClient create(com.google.cloud.pubsublite.v1.SubscriberServiceSettings p0) throws java.io.IOException`
- `public final static com.google.cloud.pubsublite.v1.SubscriberServiceClient create(com.google.cloud.pubsublite.v1.stub.SubscriberServiceStub p0)`
- `public final com.google.cloud.pubsublite.v1.SubscriberServiceSettings getSettings()`
- `public com.google.cloud.pubsublite.v1.stub.SubscriberServiceStub getStub()`
- `public boolean isShutdown()`
- `public boolean isTerminated()`
- `public void shutdown()`
- `public void shutdownNow()`
- `public final com.google.api.gax.rpc.BidiStreamingCallable subscribeCallable()`

---

## public class `com.google.cloud.pubsublite.v1.SubscriberServiceSettings`
extends `com.google.api.gax.rpc.ClientSettings`  

**Constructors:**
- `protected SubscriberServiceSettings(com.google.cloud.pubsublite.v1.SubscriberServiceSettings$Builder p0) throws java.io.IOException`

**Methods:**
- `public final static com.google.cloud.pubsublite.v1.SubscriberServiceSettings create(com.google.cloud.pubsublite.v1.stub.SubscriberServiceStubSettings p0) throws java.io.IOException`
- `public static com.google.api.gax.rpc.ApiClientHeaderProvider$Builder defaultApiClientHeaderProviderBuilder()`
- `public static com.google.api.gax.core.GoogleCredentialsProvider$Builder defaultCredentialsProviderBuilder()`
- `public static com.google.api.gax.core.InstantiatingExecutorProvider$Builder defaultExecutorProviderBuilder()`
- `public static com.google.api.gax.grpc.InstantiatingGrpcChannelProvider$Builder defaultGrpcTransportProviderBuilder()`
- `public static com.google.api.gax.rpc.TransportChannelProvider defaultTransportChannelProvider()`
- `public static java.lang.String getDefaultEndpoint()`
- `public static java.util.List getDefaultServiceScopes()`
- `public static com.google.cloud.pubsublite.v1.SubscriberServiceSettings$Builder newBuilder()`
- `public static com.google.cloud.pubsublite.v1.SubscriberServiceSettings$Builder newBuilder(com.google.api.gax.rpc.ClientContext p0)`
- `public com.google.api.gax.rpc.StreamingCallSettings subscribeSettings()`
- `public com.google.cloud.pubsublite.v1.SubscriberServiceSettings$Builder toBuilder()`

---

## public static class `com.google.cloud.pubsublite.v1.SubscriberServiceSettings$Builder`
extends `com.google.api.gax.rpc.ClientSettings$Builder`  

**Constructors:**
- `protected Builder() throws java.io.IOException`
- `protected Builder(com.google.api.gax.rpc.ClientContext p0)`
- `protected Builder(com.google.cloud.pubsublite.v1.SubscriberServiceSettings p0)`
- `protected Builder(com.google.cloud.pubsublite.v1.stub.SubscriberServiceStubSettings$Builder p0)`

**Methods:**
- `public com.google.cloud.pubsublite.v1.SubscriberServiceSettings$Builder applyToAllUnaryMethods(com.google.api.core.ApiFunction p0) throws java.lang.Exception`
- `public com.google.cloud.pubsublite.v1.SubscriberServiceSettings build() throws java.io.IOException`
- `public com.google.cloud.pubsublite.v1.stub.SubscriberServiceStubSettings$Builder getStubSettingsBuilder()`
- `public com.google.api.gax.rpc.StreamingCallSettings$Builder subscribeSettings()`

---

## public class `com.google.cloud.pubsublite.v1.TopicStatsServiceClient`
implements `com.google.api.gax.core.BackgroundResource`  

**Constructors:**
- `protected TopicStatsServiceClient(com.google.cloud.pubsublite.v1.TopicStatsServiceSettings p0) throws java.io.IOException`
- `protected TopicStatsServiceClient(com.google.cloud.pubsublite.v1.stub.TopicStatsServiceStub p0)`

**Methods:**
- `public boolean awaitTermination(long p0, java.util.concurrent.TimeUnit p1) throws java.lang.InterruptedException`
- `public final void close()`
- `public final com.google.cloud.pubsublite.proto.ComputeHeadCursorResponse computeHeadCursor(com.google.cloud.pubsublite.proto.ComputeHeadCursorRequest p0)`
- `public final com.google.api.gax.rpc.UnaryCallable computeHeadCursorCallable()`
- `public final com.google.cloud.pubsublite.proto.ComputeMessageStatsResponse computeMessageStats(com.google.cloud.pubsublite.proto.ComputeMessageStatsRequest p0)`
- `public final com.google.api.gax.rpc.UnaryCallable computeMessageStatsCallable()`
- `public final com.google.cloud.pubsublite.proto.ComputeTimeCursorResponse computeTimeCursor(com.google.cloud.pubsublite.proto.ComputeTimeCursorRequest p0)`
- `public final com.google.api.gax.rpc.UnaryCallable computeTimeCursorCallable()`
- `public final static com.google.cloud.pubsublite.v1.TopicStatsServiceClient create() throws java.io.IOException`
- `public final static com.google.cloud.pubsublite.v1.TopicStatsServiceClient create(com.google.cloud.pubsublite.v1.TopicStatsServiceSettings p0) throws java.io.IOException`
- `public final static com.google.cloud.pubsublite.v1.TopicStatsServiceClient create(com.google.cloud.pubsublite.v1.stub.TopicStatsServiceStub p0)`
- `public final com.google.cloud.pubsublite.v1.TopicStatsServiceSettings getSettings()`
- `public com.google.cloud.pubsublite.v1.stub.TopicStatsServiceStub getStub()`
- `public boolean isShutdown()`
- `public boolean isTerminated()`
- `public void shutdown()`
- `public void shutdownNow()`

---

## public class `com.google.cloud.pubsublite.v1.TopicStatsServiceSettings`
extends `com.google.api.gax.rpc.ClientSettings`  

**Constructors:**
- `protected TopicStatsServiceSettings(com.google.cloud.pubsublite.v1.TopicStatsServiceSettings$Builder p0) throws java.io.IOException`

**Methods:**
- `public com.google.api.gax.rpc.UnaryCallSettings computeHeadCursorSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings computeMessageStatsSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings computeTimeCursorSettings()`
- `public final static com.google.cloud.pubsublite.v1.TopicStatsServiceSettings create(com.google.cloud.pubsublite.v1.stub.TopicStatsServiceStubSettings p0) throws java.io.IOException`
- `public static com.google.api.gax.rpc.ApiClientHeaderProvider$Builder defaultApiClientHeaderProviderBuilder()`
- `public static com.google.api.gax.core.GoogleCredentialsProvider$Builder defaultCredentialsProviderBuilder()`
- `public static com.google.api.gax.core.InstantiatingExecutorProvider$Builder defaultExecutorProviderBuilder()`
- `public static com.google.api.gax.grpc.InstantiatingGrpcChannelProvider$Builder defaultGrpcTransportProviderBuilder()`
- `public static com.google.api.gax.rpc.TransportChannelProvider defaultTransportChannelProvider()`
- `public static java.lang.String getDefaultEndpoint()`
- `public static java.util.List getDefaultServiceScopes()`
- `public static com.google.cloud.pubsublite.v1.TopicStatsServiceSettings$Builder newBuilder()`
- `public static com.google.cloud.pubsublite.v1.TopicStatsServiceSettings$Builder newBuilder(com.google.api.gax.rpc.ClientContext p0)`
- `public com.google.cloud.pubsublite.v1.TopicStatsServiceSettings$Builder toBuilder()`

---

## public static class `com.google.cloud.pubsublite.v1.TopicStatsServiceSettings$Builder`
extends `com.google.api.gax.rpc.ClientSettings$Builder`  

**Constructors:**
- `protected Builder() throws java.io.IOException`
- `protected Builder(com.google.api.gax.rpc.ClientContext p0)`
- `protected Builder(com.google.cloud.pubsublite.v1.TopicStatsServiceSettings p0)`
- `protected Builder(com.google.cloud.pubsublite.v1.stub.TopicStatsServiceStubSettings$Builder p0)`

**Methods:**
- `public com.google.cloud.pubsublite.v1.TopicStatsServiceSettings$Builder applyToAllUnaryMethods(com.google.api.core.ApiFunction p0) throws java.lang.Exception`
- `public com.google.cloud.pubsublite.v1.TopicStatsServiceSettings build() throws java.io.IOException`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder computeHeadCursorSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder computeMessageStatsSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder computeTimeCursorSettings()`
- `public com.google.cloud.pubsublite.v1.stub.TopicStatsServiceStubSettings$Builder getStubSettingsBuilder()`

---

## public abstract class `com.google.cloud.pubsublite.v1.stub.AdminServiceStub`
implements `com.google.api.gax.core.BackgroundResource`  

**Constructors:**
- `public AdminServiceStub()`

**Methods:**
- `public abstract void close()`
- `public com.google.api.gax.rpc.UnaryCallable createReservationCallable()`
- `public com.google.api.gax.rpc.UnaryCallable createSubscriptionCallable()`
- `public com.google.api.gax.rpc.UnaryCallable createTopicCallable()`
- `public com.google.api.gax.rpc.UnaryCallable deleteReservationCallable()`
- `public com.google.api.gax.rpc.UnaryCallable deleteSubscriptionCallable()`
- `public com.google.api.gax.rpc.UnaryCallable deleteTopicCallable()`
- `public com.google.longrunning.stub.OperationsStub getOperationsStub()`
- `public com.google.api.gax.rpc.UnaryCallable getReservationCallable()`
- `public com.google.api.gax.rpc.UnaryCallable getSubscriptionCallable()`
- `public com.google.api.gax.rpc.UnaryCallable getTopicCallable()`
- `public com.google.api.gax.rpc.UnaryCallable getTopicPartitionsCallable()`
- `public com.google.api.gax.rpc.UnaryCallable listReservationTopicsCallable()`
- `public com.google.api.gax.rpc.UnaryCallable listReservationTopicsPagedCallable()`
- `public com.google.api.gax.rpc.UnaryCallable listReservationsCallable()`
- `public com.google.api.gax.rpc.UnaryCallable listReservationsPagedCallable()`
- `public com.google.api.gax.rpc.UnaryCallable listSubscriptionsCallable()`
- `public com.google.api.gax.rpc.UnaryCallable listSubscriptionsPagedCallable()`
- `public com.google.api.gax.rpc.UnaryCallable listTopicSubscriptionsCallable()`
- `public com.google.api.gax.rpc.UnaryCallable listTopicSubscriptionsPagedCallable()`
- `public com.google.api.gax.rpc.UnaryCallable listTopicsCallable()`
- `public com.google.api.gax.rpc.UnaryCallable listTopicsPagedCallable()`
- `public com.google.api.gax.rpc.UnaryCallable seekSubscriptionCallable()`
- `public com.google.api.gax.rpc.OperationCallable seekSubscriptionOperationCallable()`
- `public com.google.api.gax.rpc.UnaryCallable updateReservationCallable()`
- `public com.google.api.gax.rpc.UnaryCallable updateSubscriptionCallable()`
- `public com.google.api.gax.rpc.UnaryCallable updateTopicCallable()`

---

## public class `com.google.cloud.pubsublite.v1.stub.AdminServiceStubSettings`
extends `com.google.api.gax.rpc.StubSettings`  

**Constructors:**
- `protected AdminServiceStubSettings(com.google.cloud.pubsublite.v1.stub.AdminServiceStubSettings$Builder p0) throws java.io.IOException`

**Methods:**
- `public com.google.api.gax.rpc.UnaryCallSettings createReservationSettings()`
- `public com.google.cloud.pubsublite.v1.stub.AdminServiceStub createStub() throws java.io.IOException`
- `public com.google.api.gax.rpc.UnaryCallSettings createSubscriptionSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings createTopicSettings()`
- `public static com.google.api.gax.rpc.ApiClientHeaderProvider$Builder defaultApiClientHeaderProviderBuilder()`
- `public static com.google.api.gax.core.GoogleCredentialsProvider$Builder defaultCredentialsProviderBuilder()`
- `public static com.google.api.gax.core.InstantiatingExecutorProvider$Builder defaultExecutorProviderBuilder()`
- `public static com.google.api.gax.grpc.InstantiatingGrpcChannelProvider$Builder defaultGrpcTransportProviderBuilder()`
- `public static com.google.api.gax.rpc.TransportChannelProvider defaultTransportChannelProvider()`
- `public com.google.api.gax.rpc.UnaryCallSettings deleteReservationSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings deleteSubscriptionSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings deleteTopicSettings()`
- `public static java.lang.String getDefaultEndpoint()`
- `public static java.lang.String getDefaultMtlsEndpoint()`
- `public static java.util.List getDefaultServiceScopes()`
- `public com.google.api.gax.rpc.UnaryCallSettings getReservationSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings getSubscriptionSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings getTopicPartitionsSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings getTopicSettings()`
- `public com.google.api.gax.rpc.PagedCallSettings listReservationTopicsSettings()`
- `public com.google.api.gax.rpc.PagedCallSettings listReservationsSettings()`
- `public com.google.api.gax.rpc.PagedCallSettings listSubscriptionsSettings()`
- `public com.google.api.gax.rpc.PagedCallSettings listTopicSubscriptionsSettings()`
- `public com.google.api.gax.rpc.PagedCallSettings listTopicsSettings()`
- `public static com.google.cloud.pubsublite.v1.stub.AdminServiceStubSettings$Builder newBuilder()`
- `public static com.google.cloud.pubsublite.v1.stub.AdminServiceStubSettings$Builder newBuilder(com.google.api.gax.rpc.ClientContext p0)`
- `public com.google.api.gax.rpc.OperationCallSettings seekSubscriptionOperationSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings seekSubscriptionSettings()`
- `public com.google.cloud.pubsublite.v1.stub.AdminServiceStubSettings$Builder toBuilder()`
- `public com.google.api.gax.rpc.UnaryCallSettings updateReservationSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings updateSubscriptionSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings updateTopicSettings()`

---

## public static class `com.google.cloud.pubsublite.v1.stub.AdminServiceStubSettings$Builder`
extends `com.google.api.gax.rpc.StubSettings$Builder`  

**Constructors:**
- `protected Builder()`
- `protected Builder(com.google.api.gax.rpc.ClientContext p0)`
- `protected Builder(com.google.cloud.pubsublite.v1.stub.AdminServiceStubSettings p0)`

**Methods:**
- `public com.google.cloud.pubsublite.v1.stub.AdminServiceStubSettings$Builder applyToAllUnaryMethods(com.google.api.core.ApiFunction p0) throws java.lang.Exception`
- `public com.google.cloud.pubsublite.v1.stub.AdminServiceStubSettings build() throws java.io.IOException`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder createReservationSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder createSubscriptionSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder createTopicSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder deleteReservationSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder deleteSubscriptionSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder deleteTopicSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder getReservationSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder getSubscriptionSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder getTopicPartitionsSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder getTopicSettings()`
- `public com.google.api.gax.rpc.PagedCallSettings$Builder listReservationTopicsSettings()`
- `public com.google.api.gax.rpc.PagedCallSettings$Builder listReservationsSettings()`
- `public com.google.api.gax.rpc.PagedCallSettings$Builder listSubscriptionsSettings()`
- `public com.google.api.gax.rpc.PagedCallSettings$Builder listTopicSubscriptionsSettings()`
- `public com.google.api.gax.rpc.PagedCallSettings$Builder listTopicsSettings()`
- `public com.google.api.gax.rpc.OperationCallSettings$Builder seekSubscriptionOperationSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder seekSubscriptionSettings()`
- `public com.google.common.collect.ImmutableList unaryMethodSettingsBuilders()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder updateReservationSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder updateSubscriptionSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder updateTopicSettings()`

---

## public abstract class `com.google.cloud.pubsublite.v1.stub.CursorServiceStub`
implements `com.google.api.gax.core.BackgroundResource`  

**Constructors:**
- `public CursorServiceStub()`

**Methods:**
- `public abstract void close()`
- `public com.google.api.gax.rpc.UnaryCallable commitCursorCallable()`
- `public com.google.api.gax.rpc.UnaryCallable listPartitionCursorsCallable()`
- `public com.google.api.gax.rpc.UnaryCallable listPartitionCursorsPagedCallable()`
- `public com.google.api.gax.rpc.BidiStreamingCallable streamingCommitCursorCallable()`

---

## public class `com.google.cloud.pubsublite.v1.stub.CursorServiceStubSettings`
extends `com.google.api.gax.rpc.StubSettings`  

**Constructors:**
- `protected CursorServiceStubSettings(com.google.cloud.pubsublite.v1.stub.CursorServiceStubSettings$Builder p0) throws java.io.IOException`

**Methods:**
- `public com.google.api.gax.rpc.UnaryCallSettings commitCursorSettings()`
- `public com.google.cloud.pubsublite.v1.stub.CursorServiceStub createStub() throws java.io.IOException`
- `public static com.google.api.gax.rpc.ApiClientHeaderProvider$Builder defaultApiClientHeaderProviderBuilder()`
- `public static com.google.api.gax.core.GoogleCredentialsProvider$Builder defaultCredentialsProviderBuilder()`
- `public static com.google.api.gax.core.InstantiatingExecutorProvider$Builder defaultExecutorProviderBuilder()`
- `public static com.google.api.gax.grpc.InstantiatingGrpcChannelProvider$Builder defaultGrpcTransportProviderBuilder()`
- `public static com.google.api.gax.rpc.TransportChannelProvider defaultTransportChannelProvider()`
- `public static java.lang.String getDefaultEndpoint()`
- `public static java.lang.String getDefaultMtlsEndpoint()`
- `public static java.util.List getDefaultServiceScopes()`
- `public com.google.api.gax.rpc.PagedCallSettings listPartitionCursorsSettings()`
- `public static com.google.cloud.pubsublite.v1.stub.CursorServiceStubSettings$Builder newBuilder()`
- `public static com.google.cloud.pubsublite.v1.stub.CursorServiceStubSettings$Builder newBuilder(com.google.api.gax.rpc.ClientContext p0)`
- `public com.google.api.gax.rpc.StreamingCallSettings streamingCommitCursorSettings()`
- `public com.google.cloud.pubsublite.v1.stub.CursorServiceStubSettings$Builder toBuilder()`

---

## public static class `com.google.cloud.pubsublite.v1.stub.CursorServiceStubSettings$Builder`
extends `com.google.api.gax.rpc.StubSettings$Builder`  

**Constructors:**
- `protected Builder()`
- `protected Builder(com.google.api.gax.rpc.ClientContext p0)`
- `protected Builder(com.google.cloud.pubsublite.v1.stub.CursorServiceStubSettings p0)`

**Methods:**
- `public com.google.cloud.pubsublite.v1.stub.CursorServiceStubSettings$Builder applyToAllUnaryMethods(com.google.api.core.ApiFunction p0) throws java.lang.Exception`
- `public com.google.cloud.pubsublite.v1.stub.CursorServiceStubSettings build() throws java.io.IOException`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder commitCursorSettings()`
- `public com.google.api.gax.rpc.PagedCallSettings$Builder listPartitionCursorsSettings()`
- `public com.google.api.gax.rpc.StreamingCallSettings$Builder streamingCommitCursorSettings()`
- `public com.google.common.collect.ImmutableList unaryMethodSettingsBuilders()`

---

## public class `com.google.cloud.pubsublite.v1.stub.GrpcAdminServiceCallableFactory`
implements `com.google.api.gax.grpc.GrpcStubCallableFactory`  

**Constructors:**
- `public GrpcAdminServiceCallableFactory()`

**Methods:**
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.UnaryCallable createBatchingCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.BatchingCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.BidiStreamingCallable createBidiStreamingCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.StreamingCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.ClientStreamingCallable createClientStreamingCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.StreamingCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object, MetadataT extends java.lang.Object> com.google.api.gax.rpc.OperationCallable createOperationCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.OperationCallSettings p1, com.google.api.gax.rpc.ClientContext p2, com.google.longrunning.stub.OperationsStub p3)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object, PagedListResponseT extends java.lang.Object> com.google.api.gax.rpc.UnaryCallable createPagedCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.PagedCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.ServerStreamingCallable createServerStreamingCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.ServerStreamingCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.UnaryCallable createUnaryCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.UnaryCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`

---

## public class `com.google.cloud.pubsublite.v1.stub.GrpcAdminServiceStub`
extends `com.google.cloud.pubsublite.v1.stub.AdminServiceStub`  

**Constructors:**
- `protected GrpcAdminServiceStub(com.google.cloud.pubsublite.v1.stub.AdminServiceStubSettings p0, com.google.api.gax.rpc.ClientContext p1) throws java.io.IOException`
- `protected GrpcAdminServiceStub(com.google.cloud.pubsublite.v1.stub.AdminServiceStubSettings p0, com.google.api.gax.rpc.ClientContext p1, com.google.api.gax.grpc.GrpcStubCallableFactory p2) throws java.io.IOException`

**Methods:**
- `public boolean awaitTermination(long p0, java.util.concurrent.TimeUnit p1) throws java.lang.InterruptedException`
- `public final void close()`
- `public final static com.google.cloud.pubsublite.v1.stub.GrpcAdminServiceStub create(com.google.api.gax.rpc.ClientContext p0) throws java.io.IOException`
- `public final static com.google.cloud.pubsublite.v1.stub.GrpcAdminServiceStub create(com.google.api.gax.rpc.ClientContext p0, com.google.api.gax.grpc.GrpcStubCallableFactory p1) throws java.io.IOException`
- `public final static com.google.cloud.pubsublite.v1.stub.GrpcAdminServiceStub create(com.google.cloud.pubsublite.v1.stub.AdminServiceStubSettings p0) throws java.io.IOException`
- `public com.google.api.gax.rpc.UnaryCallable createReservationCallable()`
- `public com.google.api.gax.rpc.UnaryCallable createSubscriptionCallable()`
- `public com.google.api.gax.rpc.UnaryCallable createTopicCallable()`
- `public com.google.api.gax.rpc.UnaryCallable deleteReservationCallable()`
- `public com.google.api.gax.rpc.UnaryCallable deleteSubscriptionCallable()`
- `public com.google.api.gax.rpc.UnaryCallable deleteTopicCallable()`
- `public com.google.longrunning.stub.GrpcOperationsStub getOperationsStub()`
- `public com.google.api.gax.rpc.UnaryCallable getReservationCallable()`
- `public com.google.api.gax.rpc.UnaryCallable getSubscriptionCallable()`
- `public com.google.api.gax.rpc.UnaryCallable getTopicCallable()`
- `public com.google.api.gax.rpc.UnaryCallable getTopicPartitionsCallable()`
- `public boolean isShutdown()`
- `public boolean isTerminated()`
- `public com.google.api.gax.rpc.UnaryCallable listReservationTopicsCallable()`
- `public com.google.api.gax.rpc.UnaryCallable listReservationTopicsPagedCallable()`
- `public com.google.api.gax.rpc.UnaryCallable listReservationsCallable()`
- `public com.google.api.gax.rpc.UnaryCallable listReservationsPagedCallable()`
- `public com.google.api.gax.rpc.UnaryCallable listSubscriptionsCallable()`
- `public com.google.api.gax.rpc.UnaryCallable listSubscriptionsPagedCallable()`
- `public com.google.api.gax.rpc.UnaryCallable listTopicSubscriptionsCallable()`
- `public com.google.api.gax.rpc.UnaryCallable listTopicSubscriptionsPagedCallable()`
- `public com.google.api.gax.rpc.UnaryCallable listTopicsCallable()`
- `public com.google.api.gax.rpc.UnaryCallable listTopicsPagedCallable()`
- `public com.google.api.gax.rpc.UnaryCallable seekSubscriptionCallable()`
- `public com.google.api.gax.rpc.OperationCallable seekSubscriptionOperationCallable()`
- `public void shutdown()`
- `public void shutdownNow()`
- `public com.google.api.gax.rpc.UnaryCallable updateReservationCallable()`
- `public com.google.api.gax.rpc.UnaryCallable updateSubscriptionCallable()`
- `public com.google.api.gax.rpc.UnaryCallable updateTopicCallable()`

---

## public class `com.google.cloud.pubsublite.v1.stub.GrpcCursorServiceCallableFactory`
implements `com.google.api.gax.grpc.GrpcStubCallableFactory`  

**Constructors:**
- `public GrpcCursorServiceCallableFactory()`

**Methods:**
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.UnaryCallable createBatchingCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.BatchingCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.BidiStreamingCallable createBidiStreamingCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.StreamingCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.ClientStreamingCallable createClientStreamingCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.StreamingCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object, MetadataT extends java.lang.Object> com.google.api.gax.rpc.OperationCallable createOperationCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.OperationCallSettings p1, com.google.api.gax.rpc.ClientContext p2, com.google.longrunning.stub.OperationsStub p3)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object, PagedListResponseT extends java.lang.Object> com.google.api.gax.rpc.UnaryCallable createPagedCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.PagedCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.ServerStreamingCallable createServerStreamingCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.ServerStreamingCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.UnaryCallable createUnaryCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.UnaryCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`

---

## public class `com.google.cloud.pubsublite.v1.stub.GrpcCursorServiceStub`
extends `com.google.cloud.pubsublite.v1.stub.CursorServiceStub`  

**Constructors:**
- `protected GrpcCursorServiceStub(com.google.cloud.pubsublite.v1.stub.CursorServiceStubSettings p0, com.google.api.gax.rpc.ClientContext p1) throws java.io.IOException`
- `protected GrpcCursorServiceStub(com.google.cloud.pubsublite.v1.stub.CursorServiceStubSettings p0, com.google.api.gax.rpc.ClientContext p1, com.google.api.gax.grpc.GrpcStubCallableFactory p2) throws java.io.IOException`

**Methods:**
- `public boolean awaitTermination(long p0, java.util.concurrent.TimeUnit p1) throws java.lang.InterruptedException`
- `public final void close()`
- `public com.google.api.gax.rpc.UnaryCallable commitCursorCallable()`
- `public final static com.google.cloud.pubsublite.v1.stub.GrpcCursorServiceStub create(com.google.api.gax.rpc.ClientContext p0) throws java.io.IOException`
- `public final static com.google.cloud.pubsublite.v1.stub.GrpcCursorServiceStub create(com.google.api.gax.rpc.ClientContext p0, com.google.api.gax.grpc.GrpcStubCallableFactory p1) throws java.io.IOException`
- `public final static com.google.cloud.pubsublite.v1.stub.GrpcCursorServiceStub create(com.google.cloud.pubsublite.v1.stub.CursorServiceStubSettings p0) throws java.io.IOException`
- `public com.google.longrunning.stub.GrpcOperationsStub getOperationsStub()`
- `public boolean isShutdown()`
- `public boolean isTerminated()`
- `public com.google.api.gax.rpc.UnaryCallable listPartitionCursorsCallable()`
- `public com.google.api.gax.rpc.UnaryCallable listPartitionCursorsPagedCallable()`
- `public void shutdown()`
- `public void shutdownNow()`
- `public com.google.api.gax.rpc.BidiStreamingCallable streamingCommitCursorCallable()`

---

## public class `com.google.cloud.pubsublite.v1.stub.GrpcPartitionAssignmentServiceCallableFactory`
implements `com.google.api.gax.grpc.GrpcStubCallableFactory`  

**Constructors:**
- `public GrpcPartitionAssignmentServiceCallableFactory()`

**Methods:**
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.UnaryCallable createBatchingCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.BatchingCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.BidiStreamingCallable createBidiStreamingCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.StreamingCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.ClientStreamingCallable createClientStreamingCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.StreamingCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object, MetadataT extends java.lang.Object> com.google.api.gax.rpc.OperationCallable createOperationCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.OperationCallSettings p1, com.google.api.gax.rpc.ClientContext p2, com.google.longrunning.stub.OperationsStub p3)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object, PagedListResponseT extends java.lang.Object> com.google.api.gax.rpc.UnaryCallable createPagedCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.PagedCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.ServerStreamingCallable createServerStreamingCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.ServerStreamingCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.UnaryCallable createUnaryCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.UnaryCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`

---

## public class `com.google.cloud.pubsublite.v1.stub.GrpcPartitionAssignmentServiceStub`
extends `com.google.cloud.pubsublite.v1.stub.PartitionAssignmentServiceStub`  

**Constructors:**
- `protected GrpcPartitionAssignmentServiceStub(com.google.cloud.pubsublite.v1.stub.PartitionAssignmentServiceStubSettings p0, com.google.api.gax.rpc.ClientContext p1) throws java.io.IOException`
- `protected GrpcPartitionAssignmentServiceStub(com.google.cloud.pubsublite.v1.stub.PartitionAssignmentServiceStubSettings p0, com.google.api.gax.rpc.ClientContext p1, com.google.api.gax.grpc.GrpcStubCallableFactory p2) throws java.io.IOException`

**Methods:**
- `public com.google.api.gax.rpc.BidiStreamingCallable assignPartitionsCallable()`
- `public boolean awaitTermination(long p0, java.util.concurrent.TimeUnit p1) throws java.lang.InterruptedException`
- `public final void close()`
- `public final static com.google.cloud.pubsublite.v1.stub.GrpcPartitionAssignmentServiceStub create(com.google.api.gax.rpc.ClientContext p0) throws java.io.IOException`
- `public final static com.google.cloud.pubsublite.v1.stub.GrpcPartitionAssignmentServiceStub create(com.google.api.gax.rpc.ClientContext p0, com.google.api.gax.grpc.GrpcStubCallableFactory p1) throws java.io.IOException`
- `public final static com.google.cloud.pubsublite.v1.stub.GrpcPartitionAssignmentServiceStub create(com.google.cloud.pubsublite.v1.stub.PartitionAssignmentServiceStubSettings p0) throws java.io.IOException`
- `public com.google.longrunning.stub.GrpcOperationsStub getOperationsStub()`
- `public boolean isShutdown()`
- `public boolean isTerminated()`
- `public void shutdown()`
- `public void shutdownNow()`

---

## public class `com.google.cloud.pubsublite.v1.stub.GrpcPublisherServiceCallableFactory`
implements `com.google.api.gax.grpc.GrpcStubCallableFactory`  

**Constructors:**
- `public GrpcPublisherServiceCallableFactory()`

**Methods:**
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.UnaryCallable createBatchingCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.BatchingCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.BidiStreamingCallable createBidiStreamingCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.StreamingCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.ClientStreamingCallable createClientStreamingCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.StreamingCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object, MetadataT extends java.lang.Object> com.google.api.gax.rpc.OperationCallable createOperationCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.OperationCallSettings p1, com.google.api.gax.rpc.ClientContext p2, com.google.longrunning.stub.OperationsStub p3)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object, PagedListResponseT extends java.lang.Object> com.google.api.gax.rpc.UnaryCallable createPagedCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.PagedCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.ServerStreamingCallable createServerStreamingCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.ServerStreamingCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.UnaryCallable createUnaryCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.UnaryCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`

---

## public class `com.google.cloud.pubsublite.v1.stub.GrpcPublisherServiceStub`
extends `com.google.cloud.pubsublite.v1.stub.PublisherServiceStub`  

**Constructors:**
- `protected GrpcPublisherServiceStub(com.google.cloud.pubsublite.v1.stub.PublisherServiceStubSettings p0, com.google.api.gax.rpc.ClientContext p1) throws java.io.IOException`
- `protected GrpcPublisherServiceStub(com.google.cloud.pubsublite.v1.stub.PublisherServiceStubSettings p0, com.google.api.gax.rpc.ClientContext p1, com.google.api.gax.grpc.GrpcStubCallableFactory p2) throws java.io.IOException`

**Methods:**
- `public boolean awaitTermination(long p0, java.util.concurrent.TimeUnit p1) throws java.lang.InterruptedException`
- `public final void close()`
- `public final static com.google.cloud.pubsublite.v1.stub.GrpcPublisherServiceStub create(com.google.api.gax.rpc.ClientContext p0) throws java.io.IOException`
- `public final static com.google.cloud.pubsublite.v1.stub.GrpcPublisherServiceStub create(com.google.api.gax.rpc.ClientContext p0, com.google.api.gax.grpc.GrpcStubCallableFactory p1) throws java.io.IOException`
- `public final static com.google.cloud.pubsublite.v1.stub.GrpcPublisherServiceStub create(com.google.cloud.pubsublite.v1.stub.PublisherServiceStubSettings p0) throws java.io.IOException`
- `public com.google.longrunning.stub.GrpcOperationsStub getOperationsStub()`
- `public boolean isShutdown()`
- `public boolean isTerminated()`
- `public com.google.api.gax.rpc.BidiStreamingCallable publishCallable()`
- `public void shutdown()`
- `public void shutdownNow()`

---

## public class `com.google.cloud.pubsublite.v1.stub.GrpcSubscriberServiceCallableFactory`
implements `com.google.api.gax.grpc.GrpcStubCallableFactory`  

**Constructors:**
- `public GrpcSubscriberServiceCallableFactory()`

**Methods:**
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.UnaryCallable createBatchingCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.BatchingCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.BidiStreamingCallable createBidiStreamingCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.StreamingCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.ClientStreamingCallable createClientStreamingCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.StreamingCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object, MetadataT extends java.lang.Object> com.google.api.gax.rpc.OperationCallable createOperationCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.OperationCallSettings p1, com.google.api.gax.rpc.ClientContext p2, com.google.longrunning.stub.OperationsStub p3)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object, PagedListResponseT extends java.lang.Object> com.google.api.gax.rpc.UnaryCallable createPagedCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.PagedCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.ServerStreamingCallable createServerStreamingCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.ServerStreamingCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.UnaryCallable createUnaryCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.UnaryCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`

---

## public class `com.google.cloud.pubsublite.v1.stub.GrpcSubscriberServiceStub`
extends `com.google.cloud.pubsublite.v1.stub.SubscriberServiceStub`  

**Constructors:**
- `protected GrpcSubscriberServiceStub(com.google.cloud.pubsublite.v1.stub.SubscriberServiceStubSettings p0, com.google.api.gax.rpc.ClientContext p1) throws java.io.IOException`
- `protected GrpcSubscriberServiceStub(com.google.cloud.pubsublite.v1.stub.SubscriberServiceStubSettings p0, com.google.api.gax.rpc.ClientContext p1, com.google.api.gax.grpc.GrpcStubCallableFactory p2) throws java.io.IOException`

**Methods:**
- `public boolean awaitTermination(long p0, java.util.concurrent.TimeUnit p1) throws java.lang.InterruptedException`
- `public final void close()`
- `public final static com.google.cloud.pubsublite.v1.stub.GrpcSubscriberServiceStub create(com.google.api.gax.rpc.ClientContext p0) throws java.io.IOException`
- `public final static com.google.cloud.pubsublite.v1.stub.GrpcSubscriberServiceStub create(com.google.api.gax.rpc.ClientContext p0, com.google.api.gax.grpc.GrpcStubCallableFactory p1) throws java.io.IOException`
- `public final static com.google.cloud.pubsublite.v1.stub.GrpcSubscriberServiceStub create(com.google.cloud.pubsublite.v1.stub.SubscriberServiceStubSettings p0) throws java.io.IOException`
- `public com.google.longrunning.stub.GrpcOperationsStub getOperationsStub()`
- `public boolean isShutdown()`
- `public boolean isTerminated()`
- `public void shutdown()`
- `public void shutdownNow()`
- `public com.google.api.gax.rpc.BidiStreamingCallable subscribeCallable()`

---

## public class `com.google.cloud.pubsublite.v1.stub.GrpcTopicStatsServiceCallableFactory`
implements `com.google.api.gax.grpc.GrpcStubCallableFactory`  

**Constructors:**
- `public GrpcTopicStatsServiceCallableFactory()`

**Methods:**
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.UnaryCallable createBatchingCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.BatchingCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.BidiStreamingCallable createBidiStreamingCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.StreamingCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.ClientStreamingCallable createClientStreamingCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.StreamingCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object, MetadataT extends java.lang.Object> com.google.api.gax.rpc.OperationCallable createOperationCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.OperationCallSettings p1, com.google.api.gax.rpc.ClientContext p2, com.google.longrunning.stub.OperationsStub p3)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object, PagedListResponseT extends java.lang.Object> com.google.api.gax.rpc.UnaryCallable createPagedCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.PagedCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.ServerStreamingCallable createServerStreamingCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.ServerStreamingCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`
- `public <RequestT extends java.lang.Object, ResponseT extends java.lang.Object> com.google.api.gax.rpc.UnaryCallable createUnaryCallable(com.google.api.gax.grpc.GrpcCallSettings p0, com.google.api.gax.rpc.UnaryCallSettings p1, com.google.api.gax.rpc.ClientContext p2)`

---

## public class `com.google.cloud.pubsublite.v1.stub.GrpcTopicStatsServiceStub`
extends `com.google.cloud.pubsublite.v1.stub.TopicStatsServiceStub`  

**Constructors:**
- `protected GrpcTopicStatsServiceStub(com.google.cloud.pubsublite.v1.stub.TopicStatsServiceStubSettings p0, com.google.api.gax.rpc.ClientContext p1) throws java.io.IOException`
- `protected GrpcTopicStatsServiceStub(com.google.cloud.pubsublite.v1.stub.TopicStatsServiceStubSettings p0, com.google.api.gax.rpc.ClientContext p1, com.google.api.gax.grpc.GrpcStubCallableFactory p2) throws java.io.IOException`

**Methods:**
- `public boolean awaitTermination(long p0, java.util.concurrent.TimeUnit p1) throws java.lang.InterruptedException`
- `public final void close()`
- `public com.google.api.gax.rpc.UnaryCallable computeHeadCursorCallable()`
- `public com.google.api.gax.rpc.UnaryCallable computeMessageStatsCallable()`
- `public com.google.api.gax.rpc.UnaryCallable computeTimeCursorCallable()`
- `public final static com.google.cloud.pubsublite.v1.stub.GrpcTopicStatsServiceStub create(com.google.api.gax.rpc.ClientContext p0) throws java.io.IOException`
- `public final static com.google.cloud.pubsublite.v1.stub.GrpcTopicStatsServiceStub create(com.google.api.gax.rpc.ClientContext p0, com.google.api.gax.grpc.GrpcStubCallableFactory p1) throws java.io.IOException`
- `public final static com.google.cloud.pubsublite.v1.stub.GrpcTopicStatsServiceStub create(com.google.cloud.pubsublite.v1.stub.TopicStatsServiceStubSettings p0) throws java.io.IOException`
- `public com.google.longrunning.stub.GrpcOperationsStub getOperationsStub()`
- `public boolean isShutdown()`
- `public boolean isTerminated()`
- `public void shutdown()`
- `public void shutdownNow()`

---

## public abstract class `com.google.cloud.pubsublite.v1.stub.PartitionAssignmentServiceStub`
implements `com.google.api.gax.core.BackgroundResource`  

**Constructors:**
- `public PartitionAssignmentServiceStub()`

**Methods:**
- `public com.google.api.gax.rpc.BidiStreamingCallable assignPartitionsCallable()`
- `public abstract void close()`

---

## public class `com.google.cloud.pubsublite.v1.stub.PartitionAssignmentServiceStubSettings`
extends `com.google.api.gax.rpc.StubSettings`  

**Constructors:**
- `protected PartitionAssignmentServiceStubSettings(com.google.cloud.pubsublite.v1.stub.PartitionAssignmentServiceStubSettings$Builder p0) throws java.io.IOException`

**Methods:**
- `public com.google.api.gax.rpc.StreamingCallSettings assignPartitionsSettings()`
- `public com.google.cloud.pubsublite.v1.stub.PartitionAssignmentServiceStub createStub() throws java.io.IOException`
- `public static com.google.api.gax.rpc.ApiClientHeaderProvider$Builder defaultApiClientHeaderProviderBuilder()`
- `public static com.google.api.gax.core.GoogleCredentialsProvider$Builder defaultCredentialsProviderBuilder()`
- `public static com.google.api.gax.core.InstantiatingExecutorProvider$Builder defaultExecutorProviderBuilder()`
- `public static com.google.api.gax.grpc.InstantiatingGrpcChannelProvider$Builder defaultGrpcTransportProviderBuilder()`
- `public static com.google.api.gax.rpc.TransportChannelProvider defaultTransportChannelProvider()`
- `public static java.lang.String getDefaultEndpoint()`
- `public static java.lang.String getDefaultMtlsEndpoint()`
- `public static java.util.List getDefaultServiceScopes()`
- `public static com.google.cloud.pubsublite.v1.stub.PartitionAssignmentServiceStubSettings$Builder newBuilder()`
- `public static com.google.cloud.pubsublite.v1.stub.PartitionAssignmentServiceStubSettings$Builder newBuilder(com.google.api.gax.rpc.ClientContext p0)`
- `public com.google.cloud.pubsublite.v1.stub.PartitionAssignmentServiceStubSettings$Builder toBuilder()`

---

## public static class `com.google.cloud.pubsublite.v1.stub.PartitionAssignmentServiceStubSettings$Builder`
extends `com.google.api.gax.rpc.StubSettings$Builder`  

**Constructors:**
- `protected Builder()`
- `protected Builder(com.google.api.gax.rpc.ClientContext p0)`
- `protected Builder(com.google.cloud.pubsublite.v1.stub.PartitionAssignmentServiceStubSettings p0)`

**Methods:**
- `public com.google.cloud.pubsublite.v1.stub.PartitionAssignmentServiceStubSettings$Builder applyToAllUnaryMethods(com.google.api.core.ApiFunction p0) throws java.lang.Exception`
- `public com.google.api.gax.rpc.StreamingCallSettings$Builder assignPartitionsSettings()`
- `public com.google.cloud.pubsublite.v1.stub.PartitionAssignmentServiceStubSettings build() throws java.io.IOException`
- `public com.google.common.collect.ImmutableList unaryMethodSettingsBuilders()`

---

## public abstract class `com.google.cloud.pubsublite.v1.stub.PublisherServiceStub`
implements `com.google.api.gax.core.BackgroundResource`  

**Constructors:**
- `public PublisherServiceStub()`

**Methods:**
- `public abstract void close()`
- `public com.google.api.gax.rpc.BidiStreamingCallable publishCallable()`

---

## public class `com.google.cloud.pubsublite.v1.stub.PublisherServiceStubSettings`
extends `com.google.api.gax.rpc.StubSettings`  

**Constructors:**
- `protected PublisherServiceStubSettings(com.google.cloud.pubsublite.v1.stub.PublisherServiceStubSettings$Builder p0) throws java.io.IOException`

**Methods:**
- `public com.google.cloud.pubsublite.v1.stub.PublisherServiceStub createStub() throws java.io.IOException`
- `public static com.google.api.gax.rpc.ApiClientHeaderProvider$Builder defaultApiClientHeaderProviderBuilder()`
- `public static com.google.api.gax.core.GoogleCredentialsProvider$Builder defaultCredentialsProviderBuilder()`
- `public static com.google.api.gax.core.InstantiatingExecutorProvider$Builder defaultExecutorProviderBuilder()`
- `public static com.google.api.gax.grpc.InstantiatingGrpcChannelProvider$Builder defaultGrpcTransportProviderBuilder()`
- `public static com.google.api.gax.rpc.TransportChannelProvider defaultTransportChannelProvider()`
- `public static java.lang.String getDefaultEndpoint()`
- `public static java.lang.String getDefaultMtlsEndpoint()`
- `public static java.util.List getDefaultServiceScopes()`
- `public static com.google.cloud.pubsublite.v1.stub.PublisherServiceStubSettings$Builder newBuilder()`
- `public static com.google.cloud.pubsublite.v1.stub.PublisherServiceStubSettings$Builder newBuilder(com.google.api.gax.rpc.ClientContext p0)`
- `public com.google.api.gax.rpc.StreamingCallSettings publishSettings()`
- `public com.google.cloud.pubsublite.v1.stub.PublisherServiceStubSettings$Builder toBuilder()`

---

## public static class `com.google.cloud.pubsublite.v1.stub.PublisherServiceStubSettings$Builder`
extends `com.google.api.gax.rpc.StubSettings$Builder`  

**Constructors:**
- `protected Builder()`
- `protected Builder(com.google.api.gax.rpc.ClientContext p0)`
- `protected Builder(com.google.cloud.pubsublite.v1.stub.PublisherServiceStubSettings p0)`

**Methods:**
- `public com.google.cloud.pubsublite.v1.stub.PublisherServiceStubSettings$Builder applyToAllUnaryMethods(com.google.api.core.ApiFunction p0) throws java.lang.Exception`
- `public com.google.cloud.pubsublite.v1.stub.PublisherServiceStubSettings build() throws java.io.IOException`
- `public com.google.api.gax.rpc.StreamingCallSettings$Builder publishSettings()`
- `public com.google.common.collect.ImmutableList unaryMethodSettingsBuilders()`

---

## public abstract class `com.google.cloud.pubsublite.v1.stub.SubscriberServiceStub`
implements `com.google.api.gax.core.BackgroundResource`  

**Constructors:**
- `public SubscriberServiceStub()`

**Methods:**
- `public abstract void close()`
- `public com.google.api.gax.rpc.BidiStreamingCallable subscribeCallable()`

---

## public class `com.google.cloud.pubsublite.v1.stub.SubscriberServiceStubSettings`
extends `com.google.api.gax.rpc.StubSettings`  

**Constructors:**
- `protected SubscriberServiceStubSettings(com.google.cloud.pubsublite.v1.stub.SubscriberServiceStubSettings$Builder p0) throws java.io.IOException`

**Methods:**
- `public com.google.cloud.pubsublite.v1.stub.SubscriberServiceStub createStub() throws java.io.IOException`
- `public static com.google.api.gax.rpc.ApiClientHeaderProvider$Builder defaultApiClientHeaderProviderBuilder()`
- `public static com.google.api.gax.core.GoogleCredentialsProvider$Builder defaultCredentialsProviderBuilder()`
- `public static com.google.api.gax.core.InstantiatingExecutorProvider$Builder defaultExecutorProviderBuilder()`
- `public static com.google.api.gax.grpc.InstantiatingGrpcChannelProvider$Builder defaultGrpcTransportProviderBuilder()`
- `public static com.google.api.gax.rpc.TransportChannelProvider defaultTransportChannelProvider()`
- `public static java.lang.String getDefaultEndpoint()`
- `public static java.lang.String getDefaultMtlsEndpoint()`
- `public static java.util.List getDefaultServiceScopes()`
- `public static com.google.cloud.pubsublite.v1.stub.SubscriberServiceStubSettings$Builder newBuilder()`
- `public static com.google.cloud.pubsublite.v1.stub.SubscriberServiceStubSettings$Builder newBuilder(com.google.api.gax.rpc.ClientContext p0)`
- `public com.google.api.gax.rpc.StreamingCallSettings subscribeSettings()`
- `public com.google.cloud.pubsublite.v1.stub.SubscriberServiceStubSettings$Builder toBuilder()`

---

## public static class `com.google.cloud.pubsublite.v1.stub.SubscriberServiceStubSettings$Builder`
extends `com.google.api.gax.rpc.StubSettings$Builder`  

**Constructors:**
- `protected Builder()`
- `protected Builder(com.google.api.gax.rpc.ClientContext p0)`
- `protected Builder(com.google.cloud.pubsublite.v1.stub.SubscriberServiceStubSettings p0)`

**Methods:**
- `public com.google.cloud.pubsublite.v1.stub.SubscriberServiceStubSettings$Builder applyToAllUnaryMethods(com.google.api.core.ApiFunction p0) throws java.lang.Exception`
- `public com.google.cloud.pubsublite.v1.stub.SubscriberServiceStubSettings build() throws java.io.IOException`
- `public com.google.api.gax.rpc.StreamingCallSettings$Builder subscribeSettings()`
- `public com.google.common.collect.ImmutableList unaryMethodSettingsBuilders()`

---

## public abstract class `com.google.cloud.pubsublite.v1.stub.TopicStatsServiceStub`
implements `com.google.api.gax.core.BackgroundResource`  

**Constructors:**
- `public TopicStatsServiceStub()`

**Methods:**
- `public abstract void close()`
- `public com.google.api.gax.rpc.UnaryCallable computeHeadCursorCallable()`
- `public com.google.api.gax.rpc.UnaryCallable computeMessageStatsCallable()`
- `public com.google.api.gax.rpc.UnaryCallable computeTimeCursorCallable()`

---

## public class `com.google.cloud.pubsublite.v1.stub.TopicStatsServiceStubSettings`
extends `com.google.api.gax.rpc.StubSettings`  

**Constructors:**
- `protected TopicStatsServiceStubSettings(com.google.cloud.pubsublite.v1.stub.TopicStatsServiceStubSettings$Builder p0) throws java.io.IOException`

**Methods:**
- `public com.google.api.gax.rpc.UnaryCallSettings computeHeadCursorSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings computeMessageStatsSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings computeTimeCursorSettings()`
- `public com.google.cloud.pubsublite.v1.stub.TopicStatsServiceStub createStub() throws java.io.IOException`
- `public static com.google.api.gax.rpc.ApiClientHeaderProvider$Builder defaultApiClientHeaderProviderBuilder()`
- `public static com.google.api.gax.core.GoogleCredentialsProvider$Builder defaultCredentialsProviderBuilder()`
- `public static com.google.api.gax.core.InstantiatingExecutorProvider$Builder defaultExecutorProviderBuilder()`
- `public static com.google.api.gax.grpc.InstantiatingGrpcChannelProvider$Builder defaultGrpcTransportProviderBuilder()`
- `public static com.google.api.gax.rpc.TransportChannelProvider defaultTransportChannelProvider()`
- `public static java.lang.String getDefaultEndpoint()`
- `public static java.lang.String getDefaultMtlsEndpoint()`
- `public static java.util.List getDefaultServiceScopes()`
- `public static com.google.cloud.pubsublite.v1.stub.TopicStatsServiceStubSettings$Builder newBuilder()`
- `public static com.google.cloud.pubsublite.v1.stub.TopicStatsServiceStubSettings$Builder newBuilder(com.google.api.gax.rpc.ClientContext p0)`
- `public com.google.cloud.pubsublite.v1.stub.TopicStatsServiceStubSettings$Builder toBuilder()`

---

## public static class `com.google.cloud.pubsublite.v1.stub.TopicStatsServiceStubSettings$Builder`
extends `com.google.api.gax.rpc.StubSettings$Builder`  

**Constructors:**
- `protected Builder()`
- `protected Builder(com.google.api.gax.rpc.ClientContext p0)`
- `protected Builder(com.google.cloud.pubsublite.v1.stub.TopicStatsServiceStubSettings p0)`

**Methods:**
- `public com.google.cloud.pubsublite.v1.stub.TopicStatsServiceStubSettings$Builder applyToAllUnaryMethods(com.google.api.core.ApiFunction p0) throws java.lang.Exception`
- `public com.google.cloud.pubsublite.v1.stub.TopicStatsServiceStubSettings build() throws java.io.IOException`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder computeHeadCursorSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder computeMessageStatsSettings()`
- `public com.google.api.gax.rpc.UnaryCallSettings$Builder computeTimeCursorSettings()`
- `public com.google.common.collect.ImmutableList unaryMethodSettingsBuilders()`

---

