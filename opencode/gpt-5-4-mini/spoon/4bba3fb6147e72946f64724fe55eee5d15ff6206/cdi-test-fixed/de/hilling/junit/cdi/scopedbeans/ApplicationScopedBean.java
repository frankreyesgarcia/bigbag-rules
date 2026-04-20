package de.hilling.junit.cdi.scopedbeans;
import javax.inject.Inject;
import javax.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class ApplicationScopedBean extends ScopedBean {
    @Inject
    private DependentScopedBean dependentScopedBean;

    public DependentScopedBean getDependentScopedBean() {
        return dependentScopedBean;
    }
}
