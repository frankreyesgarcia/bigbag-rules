package com.google.pubsub.kafka.common;
import java.util.Optional;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.google.protobuf.ByteString;
/**
 * Utility methods and constants that are repeated across one or more classes.
 */
public class ConnectorUtils {
    public static final String SCHEMA_NAME = ByteString.class.getName();

    public static final String CPS_SUBSCRIPTION_FORMAT = "projects/%s/subscriptions/%s";

    public static final String CPS_PROJECT_CONFIG = "cps.project";

    public static final String CPS_TOPIC_CONFIG = "cps.topic";

    public static final String CPS_ENDPOINT = "cps.endpoint";

    public static final String CPS_DEFAULT_ENDPOINT = "pubsub.googleapis.com:443";

    public static final String CPS_MESSAGE_KEY_ATTRIBUTE = "key";

    public static final String CPS_ORDERING_KEY_ATTRIBUTE = "orderingKey";

    public static final String GCP_CREDENTIALS_FILE_PATH_CONFIG = "gcp.credentials.file.path";

    public static final String GCP_CREDENTIALS_JSON_CONFIG = "gcp.credentials.json";

    public static final String KAFKA_MESSAGE_CPS_BODY_FIELD = "message";

    public static final String KAFKA_TOPIC_ATTRIBUTE = "kafka.topic";

    public static final String KAFKA_PARTITION_ATTRIBUTE = "kafka.partition";

    public static final String KAFKA_OFFSET_ATTRIBUTE = "kafka.offset";

    public static final String KAFKA_TIMESTAMP_ATTRIBUTE = "kafka.timestamp";

    private static ScheduledExecutorService newDaemonExecutor(String prefix) {
        return Executors.newScheduledThreadPool(Math.max(4, Runtime.getRuntime().availableProcessors() * 5), new ThreadFactoryBuilder().setDaemon(true).setNameFormat(prefix + "-%d").build());
    }

    // A shared executor for Pub/Sub clients to use.
    private static Optional<ScheduledExecutorService> SYSTEM_EXECUTOR = Optional.empty();

    public static synchronized ScheduledExecutorService getSystemExecutor() {
        if (!SYSTEM_EXECUTOR.isPresent()) {
            SYSTEM_EXECUTOR = Optional.of(newDaemonExecutor("pubsub-connect-system"));
        }
        return SYSTEM_EXECUTOR.get();
    }
}
