package de.hilling.junit.cdi.scopedbeans;
import javax.inject.Inject;
import javax.enterprise.context.RequestScoped;
@RequestScoped
public class RequestScopedBean extends ScopedBean {
    @Inject
    private DependentScopedBean dependentScopedBean;

    public DependentScopedBean getDependentScopedBean() {
        return dependentScopedBean;
    }
}
