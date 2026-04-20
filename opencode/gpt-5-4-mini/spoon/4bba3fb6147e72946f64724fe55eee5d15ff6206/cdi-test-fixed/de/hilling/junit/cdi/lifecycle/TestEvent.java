package de.hilling.junit.cdi.lifecycle;
import Value.Immutable;
import de.hilling.junit.cdi.scope.TestState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.inject.Qualifier;
import org.immutables.value.Value;
/**
 * Qualifier to mark test events defined in {@link TestState}
 */
@Qualifier
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Value.Immutable
public @interface TestEvent {
    /**
     *
     * @return current {@link TestState}
     */
    TestState value();
}
