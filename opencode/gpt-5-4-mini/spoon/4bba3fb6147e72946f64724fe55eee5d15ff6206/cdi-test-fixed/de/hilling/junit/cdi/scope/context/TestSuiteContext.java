package de.hilling.junit.cdi.scope.context;
import de.hilling.junit.cdi.annotations.BypassTestInterceptor;
import de.hilling.junit.cdi.scope.TestSuiteScoped;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import javax.enterprise.context.spi.Context;
@BypassTestInterceptor
public class TestSuiteContext extends AbstractScopeContext implements Context , Serializable {
    private static final long serialVersionUID = 1L;

    private static final CustomScopeContextHolder CONTEXT_HOLDER = new CustomScopeContextHolder();

    @Override
    public Class<? extends Annotation> getScope() {
        return TestSuiteScoped.class;
    }

    @Override
    protected CustomScopeContextHolder getScopeContextHolder() {
        return CONTEXT_HOLDER;
    }
}
