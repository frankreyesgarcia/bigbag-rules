package de.hilling.junit.cdi.lifecycle;
import de.hilling.junit.cdi.annotations.BypassTestInterceptor;
import de.hilling.junit.cdi.scope.TestState;
import de.hilling.junit.cdi.scope.TestSuiteScoped;
import javax.inject.Inject;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Any;
@BypassTestInterceptor
@TestSuiteScoped
public class LifecycleNotifier {
    @Inject
    @Any
    private Event<Object> lifecycleEvent;

    public void notify(final TestState testCaseLifecycle, Object description) {
        final ImmutableTestEvent.Builder anntationBuilder = ImmutableTestEvent.builder();
        lifecycleEvent.select(anntationBuilder.value(testCaseLifecycle).build()).fire(description);
    }
}
