package de.hilling.junit.cdi.scope;
import de.hilling.junit.cdi.CdiTestJunitExtension;
import java.util.UUID;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
@ExtendWith(CdiTestJunitExtension.class)
public abstract class AbstractTestScopesTest {
    protected static final Logger LOG = LoggerFactory.getLogger(AbstractTestScopesTest.class);

    @Inject
    private CaseScopedBean caseScopedBean;

    @Inject
    private SuiteScopedBean suiteScopedBean;

    @BeforeEach
    public void showInfo() {
        UUID identifierCaseScopedBean = caseScopedBean.getIdentifier();
        LOG.info("case: " + identifierCaseScopedBean);
        UUID identifierSuiteScopedBean = suiteScopedBean.getIdentifier();
        LOG.info("suite: " + identifierSuiteScopedBean);
    }
}
