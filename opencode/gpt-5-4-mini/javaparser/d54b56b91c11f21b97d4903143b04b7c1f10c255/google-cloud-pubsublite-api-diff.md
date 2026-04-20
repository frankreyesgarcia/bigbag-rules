# Breaking Changes: com.google.cloud:google-cloud-pubsublite 0.6.0 → 0.18.0
Total: 67 (binary-breaking: 33, source-breaking: 63)

## com.google.cloud.pubsublite.AdminClient

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.google.cloud.pubsublite.AdminClient`
+ MUST NOW IMPLEMENT: `com.google.cloud.pubsublite.AdminClient.deleteReservation(com.google.cloud.pubsublite.ReservationPath)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.google.cloud.pubsublite.AdminClient`
+ MUST NOW IMPLEMENT: `com.google.cloud.pubsublite.AdminClient.createReservation(com.google.cloud.pubsublite.proto.Reservation)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.google.cloud.pubsublite.AdminClient`
+ MUST NOW IMPLEMENT: `com.google.cloud.pubsublite.AdminClient.seekSubscription(com.google.cloud.pubsublite.SubscriptionPath,com.google.cloud.pubsublite.SeekTarget)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.google.cloud.pubsublite.AdminClient`
+ MUST NOW IMPLEMENT: `com.google.cloud.pubsublite.AdminClient.listReservations(com.google.cloud.pubsublite.LocationPath)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.google.cloud.pubsublite.AdminClient`
+ MUST NOW IMPLEMENT: `com.google.cloud.pubsublite.AdminClient.listReservationTopics(com.google.cloud.pubsublite.ReservationPath)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.google.cloud.pubsublite.AdminClient`
+ MUST NOW IMPLEMENT: `com.google.cloud.pubsublite.AdminClient.getReservation(com.google.cloud.pubsublite.ReservationPath)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.google.cloud.pubsublite.AdminClient`
+ MUST NOW IMPLEMENT: `com.google.cloud.pubsublite.AdminClient.createSubscription(com.google.cloud.pubsublite.proto.Subscription,com.google.cloud.pubsublite.BacklogLocation)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.google.cloud.pubsublite.AdminClient`
+ MUST NOW IMPLEMENT: `com.google.cloud.pubsublite.AdminClient.updateReservation(com.google.cloud.pubsublite.proto.Reservation,com.google.protobuf.FieldMask)`

## com.google.cloud.pubsublite.Constants

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.google.cloud.pubsublite.Constants.MAX_PUBLISH_MESSAGE_BYTES`

## com.google.cloud.pubsublite.LocationPath

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.google.cloud.pubsublite.LocationPath.location()`
+ NEW RETURN TYPE: `com.google.cloud.pubsublite.LocationPath.location()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.google.cloud.pubsublite.LocationPath.location()`
+ NEW RETURN TYPE: `com.google.cloud.pubsublite.LocationPath.location()`

## com.google.cloud.pubsublite.LocationPath$Builder

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.google.cloud.pubsublite.LocationPath$Builder.setLocation(com.google.cloud.pubsublite.CloudZone)`
+ NEW RETURN TYPE: `com.google.cloud.pubsublite.ProjectLocationBuilderHelper.setLocation(com.google.cloud.pubsublite.CloudZone)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.google.cloud.pubsublite.LocationPath$Builder.setLocation(com.google.cloud.pubsublite.CloudZone)`
+ NEW RETURN TYPE: `com.google.cloud.pubsublite.ProjectLocationBuilderHelper.setLocation(com.google.cloud.pubsublite.CloudZone)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.google.cloud.pubsublite.LocationPath$Builder`
+ MUST NOW IMPLEMENT: `com.google.cloud.pubsublite.ProjectLocationBuilderHelper.setLocation(com.google.cloud.pubsublite.CloudRegionOrZone)`

## com.google.cloud.pubsublite.ProjectLookupUtils

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.google.cloud.pubsublite.ProjectLookupUtils`

## com.google.cloud.pubsublite.PublishMetadata

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.google.cloud.pubsublite.PublishMetadata`

## com.google.cloud.pubsublite.SubscriptionPath

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.google.cloud.pubsublite.SubscriptionPath.location()`
+ NEW RETURN TYPE: `com.google.cloud.pubsublite.SubscriptionPath.location()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.google.cloud.pubsublite.SubscriptionPath.location()`
+ NEW RETURN TYPE: `com.google.cloud.pubsublite.SubscriptionPath.location()`

## com.google.cloud.pubsublite.TopicPath

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.google.cloud.pubsublite.TopicPath.location()`
+ NEW RETURN TYPE: `com.google.cloud.pubsublite.TopicPath.location()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `com.google.cloud.pubsublite.TopicPath.location()`
+ NEW RETURN TYPE: `com.google.cloud.pubsublite.TopicPath.location()`

## com.google.cloud.pubsublite.cloudpubsub.PublisherSettings$Builder

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.google.cloud.pubsublite.cloudpubsub.PublisherSettings$Builder`
+ MUST NOW IMPLEMENT: `com.google.cloud.pubsublite.cloudpubsub.PublisherSettings$Builder.setCredentialsProvider(com.google.api.gax.core.CredentialsProvider)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.google.cloud.pubsublite.cloudpubsub.PublisherSettings$Builder`
+ MUST NOW IMPLEMENT: `com.google.cloud.pubsublite.cloudpubsub.PublisherSettings$Builder.setFramework(com.google.cloud.pubsublite.internal.wire.PubsubContext$Framework)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.google.cloud.pubsublite.cloudpubsub.PublisherSettings$Builder`
+ MUST NOW IMPLEMENT: `com.google.cloud.pubsublite.cloudpubsub.PublisherSettings$Builder.setAdminClient(com.google.cloud.pubsublite.AdminClient)`

## com.google.cloud.pubsublite.cloudpubsub.SubscriberSettings$Builder

### METHOD_NOW_ABSTRACT [binary ✗ | source ✗]
- METHOD (now abstract, was concrete): `com.google.cloud.pubsublite.cloudpubsub.SubscriberSettings$Builder.build()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.google.cloud.pubsublite.cloudpubsub.SubscriberSettings$Builder`
+ MUST NOW IMPLEMENT: `com.google.cloud.pubsublite.cloudpubsub.SubscriberSettings$Builder.setCredentialsProvider(com.google.api.gax.core.CredentialsProvider)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.google.cloud.pubsublite.cloudpubsub.SubscriberSettings$Builder`
+ MUST NOW IMPLEMENT: `com.google.cloud.pubsublite.cloudpubsub.SubscriberSettings$Builder.setFramework(com.google.cloud.pubsublite.internal.wire.PubsubContext$Framework)`

## com.google.cloud.pubsublite.cloudpubsub.internal.SinglePartitionSubscriber

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.google.cloud.pubsublite.cloudpubsub.internal.SinglePartitionSubscriber.<init>(com.google.cloud.pubsub.v1.MessageReceiver,com.google.cloud.pubsublite.MessageTransformer<com.google.cloud.pubsublite.SequencedMessage,com.google.pubsub.v1.PubsubMessage>,com.google.cloud.pubsublite.cloudpubsub.internal.AckSetTracker,com.google.cloud.pubsublite.cloudpubsub.NackHandler,com.google.cloud.pubsublite.internal.wire.SubscriberFactory,com.google.cloud.pubsublite.cloudpubsub.FlowControlSettings)`

## com.google.cloud.pubsublite.cloudpubsub.internal.WrappingPublisher

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `com.google.cloud.pubsublite.cloudpubsub.internal.WrappingPublisher.<init>(com.google.cloud.pubsublite.internal.Publisher<com.google.cloud.pubsublite.PublishMetadata>,com.google.cloud.pubsublite.MessageTransformer<com.google.pubsub.v1.PubsubMessage,com.google.cloud.pubsublite.Message>)`

## com.google.cloud.pubsublite.internal.BufferingPullSubscriber

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.google.cloud.pubsublite.internal.BufferingPullSubscriber.<init>(com.google.cloud.pubsublite.internal.wire.SubscriberFactory,com.google.cloud.pubsublite.cloudpubsub.FlowControlSettings,com.google.cloud.pubsublite.proto.SeekRequest)`

## com.google.cloud.pubsublite.internal.DefaultRoutingPolicy

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.google.cloud.pubsublite.internal.DefaultRoutingPolicy.<init>(int)`

## com.google.cloud.pubsublite.internal.Publisher

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.google.cloud.pubsublite.internal.Publisher`
+ MUST NOW IMPLEMENT: `com.google.cloud.pubsublite.internal.Publisher.cancelOutstandingPublishes()`

## com.google.cloud.pubsublite.internal.ServiceClients

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.google.cloud.pubsublite.internal.ServiceClients`

## com.google.cloud.pubsublite.internal.TopicStatsClient

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.google.cloud.pubsublite.internal.TopicStatsClient`
+ MUST NOW IMPLEMENT: `com.google.cloud.pubsublite.internal.TopicStatsClient.computeCursorForPublishTime(com.google.cloud.pubsublite.TopicPath,com.google.cloud.pubsublite.Partition,com.google.protobuf.Timestamp)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.google.cloud.pubsublite.internal.TopicStatsClient`
+ MUST NOW IMPLEMENT: `com.google.cloud.pubsublite.internal.TopicStatsClient.computeHeadCursor(com.google.cloud.pubsublite.TopicPath,com.google.cloud.pubsublite.Partition)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.google.cloud.pubsublite.internal.TopicStatsClient`
+ MUST NOW IMPLEMENT: `com.google.cloud.pubsublite.internal.TopicStatsClient.computeCursorForEventTime(com.google.cloud.pubsublite.TopicPath,com.google.cloud.pubsublite.Partition,com.google.protobuf.Timestamp)`

## com.google.cloud.pubsublite.internal.wire.ApiExceptionSubscriber

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.google.cloud.pubsublite.internal.wire.ApiExceptionSubscriber`

## com.google.cloud.pubsublite.internal.wire.AssignerBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.google.cloud.pubsublite.internal.wire.AssignerBuilder`

## com.google.cloud.pubsublite.internal.wire.AssignerBuilder$Builder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.google.cloud.pubsublite.internal.wire.AssignerBuilder$Builder`

## com.google.cloud.pubsublite.internal.wire.AssignerImpl

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.google.cloud.pubsublite.internal.wire.AssignerImpl.triggerReinitialize()`

## com.google.cloud.pubsublite.internal.wire.Committer

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.google.cloud.pubsublite.internal.wire.Committer`
+ MUST NOW IMPLEMENT: `com.google.cloud.pubsublite.internal.wire.Committer.waitUntilEmpty()`

## com.google.cloud.pubsublite.internal.wire.CommitterBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.google.cloud.pubsublite.internal.wire.CommitterBuilder`

## com.google.cloud.pubsublite.internal.wire.CommitterBuilder$Builder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `com.google.cloud.pubsublite.internal.wire.CommitterBuilder$Builder`

## com.google.cloud.pubsublite.internal.wire.CommitterImpl

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.google.cloud.pubsublite.internal.wire.CommitterImpl.triggerReinitialize()`

## com.google.cloud.pubsublite.internal.wire.PartitionPublisherFactory

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.google.cloud.pubsublite.internal.wire.PartitionPublisherFactory.newPublisher(com.google.cloud.pubsublite.Partition)`
+ NEW RETURN TYPE: `com.google.cloud.pubsublite.internal.wire.PartitionPublisherFactory.newPublisher(com.google.cloud.pubsublite.Partition)`

## com.google.cloud.pubsublite.internal.wire.Predicates

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.google.cloud.pubsublite.internal.wire.Predicates.isValidSeekRequest(com.google.cloud.pubsublite.proto.SeekRequest)`

## com.google.cloud.pubsublite.internal.wire.PublisherBuilder

### FIELD_REMOVED [binary ✗ | source ✗]
- REMOVED FIELD: `com.google.cloud.pubsublite.internal.wire.PublisherBuilder.DEFAULT_BATCHING_SETTINGS`

## com.google.cloud.pubsublite.internal.wire.PublisherBuilder$Builder

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.google.cloud.pubsublite.internal.wire.PublisherBuilder$Builder.setContext(com.google.cloud.pubsublite.internal.wire.PubsubContext)`

## com.google.cloud.pubsublite.internal.wire.PublisherImpl

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.google.cloud.pubsublite.internal.wire.PublisherImpl.triggerReinitialize()`

## com.google.cloud.pubsublite.internal.wire.RetryingConnectionObserver

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.google.cloud.pubsublite.internal.wire.RetryingConnectionObserver.triggerReinitialize()`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.google.cloud.pubsublite.internal.wire.RetryingConnectionObserver`
+ MUST NOW IMPLEMENT: `com.google.cloud.pubsublite.internal.wire.RetryingConnectionObserver.triggerReinitialize(com.google.cloud.pubsublite.internal.CheckedApiException)`

## com.google.cloud.pubsublite.internal.wire.RoutingPublisher

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.google.cloud.pubsublite.internal.wire.RoutingPublisher.publish(com.google.cloud.pubsublite.Message)`
+ NEW RETURN TYPE: `com.google.cloud.pubsublite.internal.wire.RoutingPublisher.publish(com.google.cloud.pubsublite.Message)`

## com.google.cloud.pubsublite.internal.wire.RoutingPublisherBuilder$Builder

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.google.cloud.pubsublite.internal.wire.RoutingPublisherBuilder$Builder.build()`
+ NEW RETURN TYPE: `com.google.cloud.pubsublite.internal.wire.RoutingPublisherBuilder$Builder.build()`

## com.google.cloud.pubsublite.internal.wire.SinglePartitionPublisher

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.google.cloud.pubsublite.internal.wire.SinglePartitionPublisher.publish(com.google.cloud.pubsublite.Message)`
+ NEW RETURN TYPE: `com.google.cloud.pubsublite.internal.wire.SinglePartitionPublisher.publish(com.google.cloud.pubsublite.Message)`

## com.google.cloud.pubsublite.internal.wire.SinglePartitionPublisherBuilder$Builder

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.google.cloud.pubsublite.internal.wire.SinglePartitionPublisherBuilder$Builder.setContext(com.google.cloud.pubsublite.internal.wire.PubsubContext)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `com.google.cloud.pubsublite.internal.wire.SinglePartitionPublisherBuilder$Builder.build()`
+ NEW RETURN TYPE: `com.google.cloud.pubsublite.internal.wire.SinglePartitionPublisherBuilder$Builder.build()`

## com.google.cloud.pubsublite.internal.wire.Subscriber

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.google.cloud.pubsublite.internal.wire.Subscriber.seek(com.google.cloud.pubsublite.proto.SeekRequest)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.google.cloud.pubsublite.internal.wire.Subscriber.seekInFlight()`

## com.google.cloud.pubsublite.internal.wire.SubscriberBuilder$Builder

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `com.google.cloud.pubsublite.internal.wire.SubscriberBuilder$Builder.setMessageConsumer(java.util.function.Consumer<com.google.common.collect.ImmutableList<com.google.cloud.pubsublite.SequencedMessage>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.google.cloud.pubsublite.internal.wire.SubscriberBuilder$Builder.setContext(com.google.cloud.pubsublite.internal.wire.PubsubContext)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.google.cloud.pubsublite.internal.wire.SubscriberBuilder$Builder`
+ MUST NOW IMPLEMENT: `com.google.cloud.pubsublite.internal.wire.SubscriberBuilder$Builder.setResetHandler(com.google.cloud.pubsublite.internal.wire.SubscriberResetHandler)`

### TYPE_NEW_ABSTRACT_METHOD [binary ✓ | source ✗]
- TYPE: `com.google.cloud.pubsublite.internal.wire.SubscriberBuilder$Builder`
+ MUST NOW IMPLEMENT: `com.google.cloud.pubsublite.internal.wire.SubscriberBuilder$Builder.setInitialLocation(com.google.cloud.pubsublite.proto.SeekRequest)`

## com.google.cloud.pubsublite.internal.wire.SubscriberFactory

### METHOD_PARAMETER_GENERICS_CHANGED [binary ✓ | source ✗]
- METHOD (parameter generics changed): `com.google.cloud.pubsublite.internal.wire.SubscriberFactory.newSubscriber(java.util.function.Consumer<com.google.common.collect.ImmutableList<com.google.cloud.pubsublite.SequencedMessage>>)`

## com.google.cloud.pubsublite.internal.wire.SubscriberImpl

### CONSTRUCTOR_REMOVED [binary ✗ | source ✗]
- REMOVED CONSTRUCTOR: `com.google.cloud.pubsublite.internal.wire.SubscriberImpl.<init>(com.google.cloud.pubsublite.v1.SubscriberServiceClient,com.google.cloud.pubsublite.proto.InitialSubscribeRequest,java.util.function.Consumer<com.google.common.collect.ImmutableList<com.google.cloud.pubsublite.SequencedMessage>>)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.google.cloud.pubsublite.internal.wire.SubscriberImpl.onClientResponse(com.google.cloud.pubsublite.internal.wire.ConnectedSubscriber$Response)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.google.cloud.pubsublite.internal.wire.SubscriberImpl.seek(com.google.cloud.pubsublite.proto.SeekRequest)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.google.cloud.pubsublite.internal.wire.SubscriberImpl.seekInFlight()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `com.google.cloud.pubsublite.internal.wire.SubscriberImpl.triggerReinitialize()`

