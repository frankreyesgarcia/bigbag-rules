package de.hilling.junit.cdi.jpa;
import de.hilling.junit.cdi.CdiTestJunitExtension;
import javax.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
@ExtendWith(CdiTestJunitExtension.class)
public class UserServiceTest {
    @Inject
    private UserService userService;

    @Inject
    private TestUtils testUtils;

    @Test
    public void addUser() {
        userService.addUser(testUtils.createGunnar());
    }
}
