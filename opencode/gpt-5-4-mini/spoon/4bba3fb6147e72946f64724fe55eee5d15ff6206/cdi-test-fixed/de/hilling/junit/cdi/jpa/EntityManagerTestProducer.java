package de.hilling.junit.cdi.jpa;
import de.hilling.junit.cdi.annotations.GlobalTestImplementation;
import de.hilling.junit.cdi.jee.EntityManagerResourcesProvider;
import de.hilling.junit.cdi.scope.TestSuiteScoped;
import javax.inject.Inject;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
/**
 * Producer for EntityManagers used in jpa unit tests.
 */
@TestSuiteScoped
public class EntityManagerTestProducer {
    @Inject
    private EntityManagerResourcesProvider resourcesProvider;

    @Produces
    @GlobalTestImplementation
    @RequestScoped
    protected EntityManager provideTestEntityManager() {
        return resourcesProvider.resolveEntityManager("cdi-test-unit");
    }
}
