package com.fluxtion.compiler.generation.newinstance;
import com.fluxtion.compiler.generation.util.CompiledOnlySepTest;
import java.util.concurrent.atomic.LongAdder;
import com.fluxtion.runtime.EventProcessor;
import com.fluxtion.runtime.annotations.OnEventHandler;
import org.junit.Assert;
import org.junit.Test;
public class NewInstanceTest extends CompiledOnlySepTest {
    public NewInstanceTest(boolean compile) {
        super(compile);
    }

    @Test
    public void newInstanceTest() {
        sep(c -> c.addNode(new com.fluxtion.compiler.generation.newinstance.MyHandler()));
        EventProcessor<?> sep2 = ((EventProcessor<?>) (sep)).newInstance();
        Assert.assertNotEquals(sep, sep2);
        sep2.init();
        LongAdder longAdder = new LongAdder();
        onEvent(longAdder);
        sep2.onEvent(longAdder);
        Assert.assertEquals(2, longAdder.longValue());
    }

    public static class MyHandler {
        @OnEventHandler
        public boolean incrementLongAdder(LongAdder longAdder) {
            longAdder.increment();
            return true;
        }
    }
}
