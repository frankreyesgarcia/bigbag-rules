package de.hilling.junit.cdi.jee;
import GenerationType;
import javax.persistence.*;
import org.junit.jupiter.api.Test;
@Entity
@EntityListeners(TestEntityListener.class)
public class UserEntity {
    public long getId() {
        return id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
