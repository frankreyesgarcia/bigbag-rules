package com.google.pubsub.kafka.source;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import com.google.api.core.ApiFuture;
import com.google.api.gax.core.CredentialsProvider;
import com.google.protobuf.Empty;
import com.google.pubsub.v1.ProjectSubscriptionName;
import com.google.pubsub.v1.ReceivedMessage;
/**
 * A {@link CloudPubSubSubscriber} that distributes a single subscription in round-robin fashion
 * over a set of {@link CloudPubSubGRPCSubscriber}s.
 */
public class CloudPubSubRoundRobinSubscriber implements CloudPubSubSubscriber {
    private final List<CloudPubSubSubscriber> subscribers;

    private int currentSubscriberIndex = 0;

    public CloudPubSubRoundRobinSubscriber(int subscriberCount, CredentialsProvider gcpCredentialsProvider, String endpoint, ProjectSubscriptionName subscriptionName, int cpsMaxBatchSize) {
        subscribers = new ArrayList<>();
        for (int i = 0; i < subscriberCount; ++i) {
            subscribers.add(new CloudPubSubGRPCSubscriber(gcpCredentialsProvider, endpoint, subscriptionName, cpsMaxBatchSize));
        }
    }

    @Override
    public void close() {
        for (CloudPubSubSubscriber subscriber : subscribers) {
            subscriber.close();
        }
    }

    @Override
    public ApiFuture<List<ReceivedMessage>> pull() {
        currentSubscriberIndex = (currentSubscriberIndex + 1) % subscribers.size();
        return subscribers.get(currentSubscriberIndex).pull();
    }

    @Override
    public ApiFuture<Empty> ackMessages(Collection<String> ackIds) {
        currentSubscriberIndex = (currentSubscriberIndex + 1) % subscribers.size();
        return subscribers.get(currentSubscriberIndex).ackMessages(ackIds);
    }
}
