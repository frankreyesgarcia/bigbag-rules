package de.hilling.junit.cdi.scope.context;
import Value.Immutable;
import de.hilling.junit.cdi.annotations.BypassTestInterceptor;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import org.immutables.value.Value;
@BypassTestInterceptor
@Value.Immutable
public interface CustomScopeInstance<T> {
    Bean<T> getBean();

    CreationalContext<T> getCtx();

    T getInstance();
}
