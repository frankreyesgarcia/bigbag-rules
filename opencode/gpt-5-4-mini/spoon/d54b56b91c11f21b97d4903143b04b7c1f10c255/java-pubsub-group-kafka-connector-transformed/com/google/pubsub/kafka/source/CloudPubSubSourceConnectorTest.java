package com.google.pubsub.kafka.source;
import com.google.pubsub.kafka.common.ConnectorCredentialsProvider;
import com.google.pubsub.kafka.common.ConnectorUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.kafka.common.config.ConfigException;
import org.apache.kafka.connect.errors.ConnectException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.spy;
/**
 * Tests for {@link CloudPubSubSourceConnector}.
 */
public class CloudPubSubSourceConnectorTest {
    private static final int NUM_TASKS = 10;

    private static final String CPS_PROJECT = "hello";

    private static final String CPS_SUBSCRIPTION = "big";

    private static final String KAFKA_TOPIC = "world";

    private CloudPubSubSourceConnector connector;

    private Map<String, String> props;

    @Before
    public void setup() {
        connector = spy(new CloudPubSubSourceConnector());
        props = new HashMap<>();
        props.put(CloudPubSubSourceConnector.CPS_SUBSCRIPTION_CONFIG, CPS_SUBSCRIPTION);
        props.put(ConnectorUtils.CPS_PROJECT_CONFIG, CPS_PROJECT);
        props.put(CloudPubSubSourceConnector.KAFKA_TOPIC_CONFIG, KAFKA_TOPIC);
    }

    @Test(expected = ConnectException.class)
    public void testStartWhenSubscriptionNonexistant() {
        doThrow(new ConnectException("")).when(connector).verifySubscription(anyString(), anyString(), any(ConnectorCredentialsProvider.class));
        connector.start(props);
    }

    @Test(expected = ConfigException.class)
    public void testStartWhenRequiredConfigMissing() {
        connector.start(new HashMap<String, String>());
    }

    @Test
    public void testTaskConfigs() {
        doNothing().when(connector).verifySubscription(anyString(), anyString(), any(ConnectorCredentialsProvider.class));
        connector.start(props);
        List<Map<String, String>> taskConfigs = connector.taskConfigs(NUM_TASKS);
        assertEquals(taskConfigs.size(), NUM_TASKS);
        for (int i = 0; i < taskConfigs.size(); ++i) {
            assertEquals(taskConfigs.get(i), props);
        }
    }

    @Test
    public void testSourceConnectorTaskClass() {
        assertEquals(CloudPubSubSourceTask.class, connector.taskClass());
    }
}
