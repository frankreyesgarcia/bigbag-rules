package com.fluxtion.compiler.generation.implicitnodeadd;
import com.fluxtion.compiler.generation.util.MultipleSepTargetInProcessTest;
import java.util.List;
import com.fluxtion.runtime.annotations.OnEventHandler;
import com.fluxtion.runtime.annotations.OnTrigger;
import lombok.Value;
import org.junit.Assert;
import org.junit.Test;
public class SharedReferenceForEqualNodeTest extends MultipleSepTargetInProcessTest {
    public SharedReferenceForEqualNodeTest(boolean compiledSep) {
        super(compiledSep);
    }

    @Test
    public void equalNodeAddedMultipleTimesTest() {
        sep(c -> {
            c.addNode(new com.fluxtion.compiler.generation.implicitnodeadd.MyHolder(new com.fluxtion.compiler.generation.implicitnodeadd.KeyedStringHandler("A"), new com.fluxtion.compiler.generation.implicitnodeadd.KeyedStringHandler("A")), "holder");
        });
        onEvent("TEST");
        MyHolder holder = getField("holder");
        Assert.assertTrue(holder.handler1 == holder.handler2);
    }

    @Value
    public static class MyHolder {
        KeyedStringHandler handler1;

        KeyedStringHandler handler2;

        @OnTrigger
        public boolean update() {
            return true;
        }
    }

    @Value
    public static class MyListHolder {
        List<KeyedStringHandler> handler;

        @OnTrigger
        public boolean update() {
            return true;
        }
    }

    @Value
    public static class KeyedStringHandler {
        String key;

        @OnEventHandler
        public boolean update(String in) {
            return true;
        }
    }
}
