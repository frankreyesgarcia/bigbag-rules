package de.hilling.junit.cdi.jee;
import java.util.concurrent.atomic.AtomicInteger;
import javax.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class UpdateCounter {
    private AtomicInteger counter = new AtomicInteger();

    public void inc() {
        counter.incrementAndGet();
    }

    public int get() {
        return counter.get();
    }
}
