package com.fluxtion.compiler.generation.util;
import Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import org.junit.runners.Parameterized;
public abstract class InMemoryOnlySepTest extends MultipleSepTargetInProcessTest {
    public InMemoryOnlySepTest(boolean compiledSep) {
        super(compiledSep);
    }

    @Parameterized.Parameters
    public static Collection<?> compiledSepStrategy() {
        return Arrays.asList(false);
    }
}
