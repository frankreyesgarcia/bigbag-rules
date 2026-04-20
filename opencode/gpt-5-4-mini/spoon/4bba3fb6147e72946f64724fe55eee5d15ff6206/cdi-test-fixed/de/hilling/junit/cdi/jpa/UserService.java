package de.hilling.junit.cdi.jpa;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ejb.Startup;
import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
@Startup
@Singleton
public class UserService {
    @Inject
    private EntityManager entityManager;

    public long addUser(UserEntity userEntity) {
        entityManager.persist(userEntity);
        return userEntity.getId();
    }
}
