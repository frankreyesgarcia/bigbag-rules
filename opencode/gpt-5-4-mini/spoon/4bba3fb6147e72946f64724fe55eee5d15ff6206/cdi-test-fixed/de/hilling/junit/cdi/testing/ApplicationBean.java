package de.hilling.junit.cdi.testing;
import javax.inject.Inject;
import javax.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class ApplicationBean extends BaseBean {
    @Inject
    private OtherApplicationBean otherApplicationBean;
}
