package de.hilling.junit.cdi.jee;
import de.hilling.junit.cdi.annotations.GlobalTestImplementation;
import de.hilling.junit.cdi.scope.TestSuiteScoped;
import javax.inject.Inject;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
/**
 * Producer for EntityManagers used in cdi-test unit tests.
 */
@TestSuiteScoped
public class EntityManagerTestProducer {
    @Inject
    private EntityManagerResourcesProvider entityManagerFactory;

    @Produces
    @GlobalTestImplementation
    @RequestScoped
    protected EntityManagerFactory provideTestEntityManagerFactory() {
        return entityManagerFactory.resolveEntityManagerFactory("cdi-test-unit");
    }

    @Produces
    @GlobalTestImplementation
    @RequestScoped
    protected EntityManager provideTestEntityManager() {
        return entityManagerFactory.resolveEntityManager("cdi-test-unit");
    }

    @Produces
    @GlobalTestImplementation
    @RequestScoped
    @SecondEntityManager
    protected EntityManager provideTestEntityManagerB() {
        return entityManagerFactory.resolveEntityManager("cdi-test-unit-b");
    }
}
