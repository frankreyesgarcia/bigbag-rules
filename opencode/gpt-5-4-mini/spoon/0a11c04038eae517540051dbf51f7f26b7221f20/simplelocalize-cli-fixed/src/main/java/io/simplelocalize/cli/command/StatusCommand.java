package io.simplelocalize.cli.command;
import io.simplelocalize.cli.client.SimpleLocalizeClient;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
public class StatusCommand implements CliCommand {
    private static final Logger log = LoggerFactory.getLogger(StatusCommand.class);

    private final SimpleLocalizeClient client;

    public StatusCommand(SimpleLocalizeClient client) {
        this.client = client;
    }

    public void invoke() throws IOException, InterruptedException {
        String responseData = client.fetchProject();
        DocumentContext json = JsonPath.parse(responseData);
        log.info("Project name: {}", json.read("$.data.name", String.class));
        log.info("Project token: {}", json.read("$.data.projectToken", String.class));
        log.info("Translated: {}", json.read("$.data.translatedPercentage", String.class));
        log.info("Keys: {}", json.read("$.data.keys", String.class));
        log.info("Languages: {}", json.read("$.data.languages[*].key").toString());
        log.info("Namespaces: {}", json.read("$.data.namespaces[*].name").toString());
        log.info("Customers: {}", json.read("$.data.customers[*].key").toString());
        log.info("Last activity: {}", json.read("$.data.lastActivityAt", String.class));
        log.info("Last edit: {}", json.read("$.data.lastEditedAt", String.class));
    }
}
