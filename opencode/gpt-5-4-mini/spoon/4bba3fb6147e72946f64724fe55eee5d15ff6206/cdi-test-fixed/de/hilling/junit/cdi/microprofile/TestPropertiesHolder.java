package de.hilling.junit.cdi.microprofile;
import de.hilling.junit.cdi.lifecycle.TestEvent;
import de.hilling.junit.cdi.scope.TestState;
import de.hilling.junit.cdi.scope.TestSuiteScoped;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.enterprise.event.Observes;
import org.junit.jupiter.api.extension.ExtensionContext;
@TestSuiteScoped
public class TestPropertiesHolder {
    private HashMap<String, String> properties = new HashMap<>();

    Map<String, String> getProperties() {
        return Collections.unmodifiableMap(properties);
    }

    void clear(@Observes
    @TestEvent(TestState.FINISHING)
    ExtensionContext testEvent) {
        properties.clear();
    }

    void put(String name, String value) {
        properties.put(name, value);
    }
}
