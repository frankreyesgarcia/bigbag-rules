package com.google.pubsub.kafka.source;
import java.util.Collection;
import java.util.List;
import com.google.api.core.ApiFuture;
import com.google.protobuf.Empty;
import com.google.pubsub.v1.ReceivedMessage;
/**
 * An interface for clients that want to subscribe to messages from to <a
 * href="https://cloud.google.com/pubsub">Google Cloud Pub/Sub</a>.
 */
public interface CloudPubSubSubscriber extends AutoCloseable {
    ApiFuture<List<ReceivedMessage>> pull();

    ApiFuture<Empty> ackMessages(Collection<String> ackIds);

    void close();
}
