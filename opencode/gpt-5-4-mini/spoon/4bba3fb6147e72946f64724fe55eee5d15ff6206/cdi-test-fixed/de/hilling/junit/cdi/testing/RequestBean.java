package de.hilling.junit.cdi.testing;
import javax.inject.Inject;
import javax.enterprise.context.RequestScoped;
@RequestScoped
public class RequestBean extends BaseBean {
    @Inject
    private ApplicationBean applicationBean;

    @Override
    public void setAttribute(String attribute) {
        applicationBean.setAttribute(attribute);
        super.setAttribute(attribute);
    }
}
