package de.hilling.junit.cdi.testing;
import javax.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class RequestScopePlainTest extends BaseTest {
    private static final String SAMPLE = "sample";

    @Inject
    private ApplicationBean applicationBean;

    @Inject
    private RequestBean requestBean;

    @Test
    public void setAttributeTransitive() {
        Assertions.assertNull(applicationBean.getAttribute());
        requestBean.setAttribute(SAMPLE);
        assertEquals(SAMPLE, applicationBean.getAttribute());
    }
}
