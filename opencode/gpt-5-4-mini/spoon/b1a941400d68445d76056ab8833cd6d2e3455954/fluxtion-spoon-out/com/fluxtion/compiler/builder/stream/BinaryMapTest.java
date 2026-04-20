package com.fluxtion.compiler.builder.stream;
import com.fluxtion.compiler.generation.util.MultipleSepTargetInProcessTest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.apache.commons.lang3.mutable.MutableDouble;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableLong;
import com.fluxtion.runtime.stream.helpers.Mappers;
import lombok.Value;
import org.junit.Test;
import static com.fluxtion.compiler.builder.stream.EventFlow.subscribe;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
public class BinaryMapTest extends MultipleSepTargetInProcessTest {
    public BinaryMapTest(boolean compiledSep) {
        super(compiledSep);
    }

    @Test
    public void testIntBinaryFunctionWith() {
        sep(c -> subscribe(com.fluxtion.compiler.builder.stream.Data_1.class).mapToInt(com.fluxtion.compiler.builder.stream.Data_1::getIntValue).mapBiFunction(BinaryMapTest::add, subscribe(com.fluxtion.compiler.builder.stream.Data_2.class).mapToInt(com.fluxtion.compiler.builder.stream.Data_2::getIntValue)).push(new com.fluxtion.compiler.builder.stream.EventStreamBuildTest.NotifyAndPushTarget()::setIntPushValue));
        NotifyAndPushTarget target = getField(NotifyAndPushTarget.DEFAULT_NAME);
        onEvent(new Data_1(10));
        assertThat(target.getIntPushValue(), is(0));
        onEvent(new Data_1(20));
        assertThat(target.getIntPushValue(), is(0));
        onEvent(new Data_2(80));
        assertThat(target.getIntPushValue(), is(100));
    }

    @Test
    public void testDoubleBinaryFunction() {
        sep(c -> subscribe(MutableDouble.class).mapToDouble(MutableDouble::doubleValue).mapBiFunction(BinaryMapTest::multiply, subscribe(MutableInt.class).mapToDouble(MutableInt::doubleValue)).push(new com.fluxtion.compiler.builder.stream.EventStreamBuildTest.NotifyAndPushTarget()::setDoublePushValue));
        NotifyAndPushTarget target = getField(NotifyAndPushTarget.DEFAULT_NAME);
        onEvent(new MutableDouble(10.1));
        assertThat(target.getDoublePushValue(), closeTo(0, 1.0E-4));
        onEvent(new MutableInt(20));
        assertThat(target.getDoublePushValue(), closeTo(202.0, 1.0E-4));
    }

    @Test
    public void testLongBinaryFunction() {
        sep(c -> subscribe(MutableLong.class).mapToLong(MutableLong::longValue).mapBiFunction(BinaryMapTest::addLong, subscribe(MutableInt.class).mapToLong(MutableInt::longValue)).push(new com.fluxtion.compiler.builder.stream.EventStreamBuildTest.NotifyAndPushTarget()::setLongPushValue));
        NotifyAndPushTarget target = getField(NotifyAndPushTarget.DEFAULT_NAME);
        onEvent(new MutableLong(1000));
        assertThat(target.getLongPushValue(), is(0L));
        onEvent(new MutableInt(20000));
        assertThat(target.getLongPushValue(), is(21000L));
    }

    @Test
    public void testIntBinaryFunctionWithDefaultValue() {
        sep(c -> subscribe(com.fluxtion.compiler.builder.stream.Data_1.class).mapToInt(com.fluxtion.compiler.builder.stream.Data_1::getIntValue).mapBiFunction(BinaryMapTest::add, subscribe(com.fluxtion.compiler.builder.stream.Data_2.class).mapToInt(com.fluxtion.compiler.builder.stream.Data_2::getIntValue).defaultValue(50)).push(new com.fluxtion.compiler.builder.stream.EventStreamBuildTest.NotifyAndPushTarget()::setIntPushValue));
        NotifyAndPushTarget target = getField(NotifyAndPushTarget.DEFAULT_NAME);
        onEvent(new Data_1(10));
        assertThat(target.getIntPushValue(), is(60));
        onEvent(new Data_1(20));
        assertThat(target.getIntPushValue(), is(70));
        onEvent(new Data_2(80));
        assertThat(target.getIntPushValue(), is(100));
    }

    @Test
    public void testIntAddStandardFunction() {
        sep(c -> {
            IntStreamBuilder int1 = subscribe(com.fluxtion.compiler.builder.stream.Data_1.class).mapToInt(com.fluxtion.compiler.builder.stream.Data_1::getIntValue);
            IntStreamBuilder int2 = subscribe(com.fluxtion.compiler.builder.stream.Data_2.class).mapToInt(com.fluxtion.compiler.builder.stream.Data_2::getIntValue);
            int1.mapBiFunction(Mappers.ADD_INTS, int2).id("add");
            int1.mapBiFunction(Mappers.SUBTRACT_INTS, int2).id("subtract");
            int1.mapBiFunction(Mappers.MULTIPLY_INTS, int2).id("multiply");
        });
        onEvent(new Data_1(10));
        assertThat(getStreamed("add"), is(0));
        assertThat(getStreamed("subtract"), is(0));
        assertThat(getStreamed("multiply"), is(0));
        onEvent(new Data_2(130));
        assertThat(getStreamed("add"), is(140));
        assertThat(getStreamed("subtract"), is(-120));
        assertThat(getStreamed("multiply"), is(1300));
    }

    @Test
    public void testDoubleAddStandardFunction() {
        sep(c -> {
            DoubleStreamBuilder int1 = subscribe(com.fluxtion.compiler.builder.stream.Data_1.class).mapToInt(com.fluxtion.compiler.builder.stream.Data_1::getIntValue).box().mapToDouble(Integer::doubleValue);
            DoubleStreamBuilder int2 = subscribe(com.fluxtion.compiler.builder.stream.Data_2.class).mapToInt(com.fluxtion.compiler.builder.stream.Data_2::getIntValue).box().mapToDouble(Integer::doubleValue);
            int1.mapBiFunction(Mappers.ADD_DOUBLES, int2).id("add");
            int1.mapBiFunction(Mappers.SUBTRACT_DOUBLES, int2).id("subtract");
            int1.mapBiFunction(Mappers.MULTIPLY_DOUBLES, int2).id("multiply");
        });
        onEvent(new Data_1(10));
        assertThat(getStreamed("add"), is(0.0));
        assertThat(getStreamed("subtract"), is(0.0));
        assertThat(getStreamed("multiply"), is(0.0));
        onEvent(new Data_2(130));
        assertThat(getStreamed("add"), is(140.0));
        assertThat(getStreamed("subtract"), is(-120.0));
        assertThat(getStreamed("multiply"), is(1300.0));
    }

    @Test
    public void testLongAddStandardFunction() {
        sep(c -> {
            LongStreamBuilder int1 = subscribe(com.fluxtion.compiler.builder.stream.Data_1.class).mapToInt(com.fluxtion.compiler.builder.stream.Data_1::getIntValue).box().mapToLong(Integer::longValue);
            LongStreamBuilder int2 = subscribe(com.fluxtion.compiler.builder.stream.Data_2.class).mapToInt(com.fluxtion.compiler.builder.stream.Data_2::getIntValue).box().mapToLong(Integer::longValue);
            int1.mapBiFunction(Mappers.ADD_LONGS, int2).id("add");
            int1.mapBiFunction(Mappers.SUBTRACT_LONGS, int2).id("subtract");
            int1.mapBiFunction(Mappers.MULTIPLY_LONGS, int2).id("multiply");
        });
        onEvent(new Data_1(10));
        assertThat(getStreamed("add"), is(0L));
        assertThat(getStreamed("subtract"), is(0L));
        assertThat(getStreamed("multiply"), is(0L));
        onEvent(new Data_2(130));
        assertThat(getStreamed("add"), is(140L));
        assertThat(getStreamed("subtract"), is(-120L));
        assertThat(getStreamed("multiply"), is(1300L));
    }

    @Test
    public void referenceTypesBiFunctionTest() {
        sep(c -> subscribe(String.class).mapBiFunction(BinaryMapTest::dateFormat, subscribe(Date.class)).id("formattedDate"));
        Calendar calendar = Calendar.getInstance(Locale.UK);
        calendar.set(2022, 06, 28);
        onEvent("MMM-YYYY");
        onEvent(calendar.getTime());
        assertThat(getStreamed("formattedDate"), is("Jul-2022"));
        onEvent("MMMM-dd-YYYY");
        assertThat(getStreamed("formattedDate"), is("July-28-2022"));
    }

    @Value
    public static class Data_1 {
        int intValue;
    }

    @Value
    public static class Data_2 {
        int intValue;
    }

    public static int add(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public static double multiply(double arg1, double arg2) {
        return arg1 * arg2;
    }

    public static long addLong(long arg1, long arg2) {
        return arg1 + arg2;
    }

    public static String dateFormat(String format, Date date) {
        date = (date == null) ? new Date() : date;
        String pattern = (format == null) ? "MM-dd-yyyy" : format;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }
}
