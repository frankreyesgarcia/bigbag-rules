package com.fluxtion.compiler.builder.stream;
import EventStreamBuilder;
import com.fluxtion.compiler.generation.time.MutableNumber;
import com.fluxtion.compiler.generation.util.MultipleSepTargetInProcessTest;
import com.fluxtion.runtime.stream.helpers.Mappers;
import com.fluxtion.runtime.stream.helpers.Predicates;
import org.junit.Assert;
import org.junit.Test;
import static com.fluxtion.compiler.builder.stream.EventFlow.subscribe;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
public class FilterTest extends MultipleSepTargetInProcessTest {
    public FilterTest(boolean compiledSep) {
        super(compiledSep);
    }

    @Test
    public void filterTest() {
        sep(c -> subscribe(String.class).filter(EventStreamBuildTest::isTrue).notify(new com.fluxtion.compiler.builder.stream.EventStreamBuildTest.NotifyAndPushTarget()));
        NotifyAndPushTarget notifyTarget = getField("notifyTarget");
        assertThat(notifyTarget.getOnEventCount(), is(0));
        onEvent("86");
        assertThat(notifyTarget.getOnEventCount(), is(0));
        onEvent("true");
        assertThat(notifyTarget.getOnEventCount(), is(1));
    }

    @Test
    public void filterByPropertyTest() {
        sep(c -> subscribe(String.class).filterByProperty(String::length, EventStreamBuildTest::gt5).notify(new com.fluxtion.compiler.builder.stream.EventStreamBuildTest.NotifyAndPushTarget()));
        NotifyAndPushTarget notifyTarget = getField("notifyTarget");
        assertThat(notifyTarget.getOnEventCount(), is(0));
        onEvent("short");
        assertThat(notifyTarget.getOnEventCount(), is(0));
        onEvent("loooong");
        assertThat(notifyTarget.getOnEventCount(), is(1));
    }

    @Test
    public void dynamicFilterTest() {
        sep(c -> subscribe(com.fluxtion.compiler.builder.stream.EventStreamBuildTest.MyData.class).filter(EventStreamBuildTest::myDataTooBig, subscribe(com.fluxtion.compiler.builder.stream.EventStreamBuildTest.FilterConfig.class)).map(com.fluxtion.compiler.builder.stream.EventStreamBuildTest.MyData::getValue).push(new com.fluxtion.compiler.builder.stream.EventStreamBuildTest.NotifyAndPushTarget()::setIntPushValue));
        NotifyAndPushTarget notifyTarget = getField("notifyTarget");
        onEvent(new FilterConfig(10));
        onEvent(new MyData(5));
        assertThat(notifyTarget.getIntPushValue(), is(0));
        assertThat(notifyTarget.getOnEventCount(), is(0));
        onEvent(new MyData(50));
        assertThat(notifyTarget.getIntPushValue(), is(50));
        assertThat(notifyTarget.getOnEventCount(), is(1));
    }

    @Test
    public void dynamicFilterByPropertyTest() {
        sep(c -> subscribe(com.fluxtion.compiler.builder.stream.EventStreamBuildTest.MyData.class).filterByProperty(EventStreamBuildTest::myDataIntTooBig, com.fluxtion.compiler.builder.stream.EventStreamBuildTest.MyData::getValue, subscribe(com.fluxtion.compiler.builder.stream.EventStreamBuildTest.FilterConfig.class)).map(com.fluxtion.compiler.builder.stream.EventStreamBuildTest.MyData::getValue).push(new com.fluxtion.compiler.builder.stream.EventStreamBuildTest.NotifyAndPushTarget()::setIntPushValue));
        NotifyAndPushTarget notifyTarget = getField("notifyTarget");
        onEvent(new FilterConfig(10));
        onEvent(new MyData(5));
        assertThat(notifyTarget.getIntPushValue(), is(0));
        assertThat(notifyTarget.getOnEventCount(), is(0));
        onEvent(new MyData(50));
        assertThat(notifyTarget.getIntPushValue(), is(50));
        assertThat(notifyTarget.getOnEventCount(), is(1));
    }

    @Test
    public void dynamicFilterWithDefaultValueTest() {
        sep(c -> subscribe(com.fluxtion.compiler.builder.stream.EventStreamBuildTest.MyData.class).filter(EventStreamBuildTest::myDataTooBig, subscribe(com.fluxtion.compiler.builder.stream.EventStreamBuildTest.FilterConfig.class).defaultValue(new com.fluxtion.compiler.builder.stream.EventStreamBuildTest.FilterConfig(4))).map(com.fluxtion.compiler.builder.stream.EventStreamBuildTest.MyData::getValue).push(new com.fluxtion.compiler.builder.stream.EventStreamBuildTest.NotifyAndPushTarget()::setIntPushValue));
        NotifyAndPushTarget notifyTarget = getField("notifyTarget");
        onEvent(new MyData(5));
        assertThat(notifyTarget.getIntPushValue(), is(5));
        assertThat(notifyTarget.getOnEventCount(), is(1));
        onEvent(new FilterConfig(10));
        onEvent(new MyData(5));
        assertThat(notifyTarget.getIntPushValue(), is(5));
        assertThat(notifyTarget.getOnEventCount(), is(1));
        onEvent(new MyData(50));
        assertThat(notifyTarget.getIntPushValue(), is(50));
        assertThat(notifyTarget.getOnEventCount(), is(2));
    }

    @Test
    public void filterDynamicWithPrimitiveIntPropertyTest() {
        sep(c -> {
            EventStreamBuilder<MutableNumber> numberStream = EventFlow.subscribe(MutableNumber.class);
            numberStream.filterByProperty(Predicates::greaterThanInt, MutableNumber::intValue, EventFlow.subscribeToIntSignal("number")).mapToInt(Mappers.count()).id("count");
        });
        publishIntSignal("number", 100);
        onEvent(MutableNumber.fromLong(50));
        onEvent(MutableNumber.fromLong(150));
        onEvent(MutableNumber.fromLong(500));
        onEvent(MutableNumber.fromLong(50));
        Assert.assertEquals(2, ((int) (getStreamed("count"))));
    }

    @Test
    public void filterDynamicWithPrimitiveDoublePropertyTest() {
        sep(c -> {
            EventStreamBuilder<MutableNumber> numberStream = EventFlow.subscribe(MutableNumber.class);
            numberStream.filterByProperty(Predicates::greaterThanDouble, MutableNumber::doubleValue, EventFlow.subscribeToDoubleSignal("number")).mapToInt(Mappers.count()).id("count");
        });
        publishDoubleSignal("number", 100);
        onEvent(MutableNumber.fromLong(50));
        onEvent(MutableNumber.fromLong(150));
        onEvent(MutableNumber.fromLong(500));
        onEvent(MutableNumber.fromLong(50));
        Assert.assertEquals(2, ((int) (getStreamed("count"))));
    }

    @Test
    public void filterDynamicWithPrimitiveLongPropertyTest() {
        sep(c -> {
            EventStreamBuilder<MutableNumber> numberStream = EventFlow.subscribe(MutableNumber.class);
            numberStream.filterByProperty(Predicates::greaterThanLong, MutableNumber::longValue, EventFlow.subscribeToLongSignal("number")).mapToInt(Mappers.count()).id("count");
        });
        publishLongSignal("number", 100);
        onEvent(MutableNumber.fromLong(50));
        onEvent(MutableNumber.fromLong(150));
        onEvent(MutableNumber.fromLong(500));
        onEvent(MutableNumber.fromLong(50));
        Assert.assertEquals(2, ((int) (getStreamed("count"))));
    }

    @Test
    public void filterFunctionWithPrimitiveArgumentTest() {
        sep(c -> {
            EventStreamBuilder<MutableNumber> numberStream = EventFlow.subscribe(MutableNumber.class);
            numberStream.filter(FilterTest::filterMutableNumber, EventFlow.subscribeToIntSignal("number")).mapToInt(Mappers.count()).id("count");
        });
        publishIntSignal("number", 100);
        onEvent(MutableNumber.fromLong(50));
        onEvent(MutableNumber.fromLong(150));
        onEvent(MutableNumber.fromLong(500));
        onEvent(MutableNumber.fromLong(50));
        Assert.assertEquals(2, ((int) (getStreamed("count"))));
    }

    public static boolean filterMutableNumber(MutableNumber number, int check) {
        return number.intValue() > check;
    }
}
