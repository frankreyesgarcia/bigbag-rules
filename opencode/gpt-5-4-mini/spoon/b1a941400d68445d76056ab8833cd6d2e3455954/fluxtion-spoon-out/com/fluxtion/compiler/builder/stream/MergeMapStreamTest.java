package com.fluxtion.compiler.builder.stream;
import com.fluxtion.compiler.generation.util.MultipleSepTargetInProcessTest;
import com.fluxtion.runtime.node.NamedNode;
import lombok.Data;
import org.junit.Assert;
import org.junit.Test;
import static com.fluxtion.compiler.builder.stream.EventFlow.subscribe;
public class MergeMapStreamTest extends MultipleSepTargetInProcessTest {
    public MergeMapStreamTest(boolean compiledSep) {
        super(compiledSep);
    }

    @Test
    public void mergeTestBasic() {
        sep(c -> EventFlow.mergeMap(MergeMapStreamBuilder.of(com.fluxtion.compiler.builder.stream.MyData::new).required(subscribe(String.class), com.fluxtion.compiler.builder.stream.MyData::setValue)).push(new com.fluxtion.compiler.builder.stream.ResultsHolder()::setMyData));
        ResultsHolder resultsHolder = getField(ResultsHolder.NAME);
        onEvent("hello world");
        Assert.assertEquals("hello world", resultsHolder.getMyData().getValue());
    }

    @Test
    public void mergeTwoRequiredPropertiesTest() {
        sep(c -> EventFlow.mergeMap(MergeMapStreamBuilder.of(com.fluxtion.compiler.builder.stream.MyData::new).required(subscribe(String.class), com.fluxtion.compiler.builder.stream.MyData::setValue).required(subscribe(Integer.class), com.fluxtion.compiler.builder.stream.MyData::setIntValue)).push(new com.fluxtion.compiler.builder.stream.ResultsHolder()::setMyData));
        onEvent("hello world");
        ResultsHolder resultsHolder = getField(ResultsHolder.NAME);
        Assert.assertNull("no push expected", resultsHolder.getMyData());
        onEvent(1);
        resultsHolder = getField(ResultsHolder.NAME);
        Assert.assertEquals("hello world", resultsHolder.getMyData().getValue());
    }

    @Test
    public void mergeTwoRequiredOneNonTriggeringPropertiesTest() {
        sep(c -> EventFlow.mergeMap(MergeMapStreamBuilder.of(com.fluxtion.compiler.builder.stream.MyData::new).required(subscribe(String.class), com.fluxtion.compiler.builder.stream.MyData::setValue).requiredNoTrigger(subscribe(Integer.class), com.fluxtion.compiler.builder.stream.MyData::setIntValue)).push(new com.fluxtion.compiler.builder.stream.ResultsHolder()::setMyData));
        onEvent("hello world");
        ResultsHolder resultsHolder = getField(ResultsHolder.NAME);
        Assert.assertNull("no push expected", resultsHolder.getMyData());
        onEvent(1);
        resultsHolder = getField(ResultsHolder.NAME);
        Assert.assertNull("no push expected", resultsHolder.getMyData());
        onEvent("hello world");
        resultsHolder = getField(ResultsHolder.NAME);
        Assert.assertEquals("hello world", resultsHolder.getMyData().getValue());
    }

    @Data
    public static class MyData {
        private String value;

        private int intValue;
    }

    @Data
    public static class ResultsHolder implements NamedNode {
        public static final String NAME = "resultsHolderNode";

        MyData myData;

        @Override
        public String getName() {
            return NAME;
        }
    }
}
