package com.fluxtion.compiler.builder.factory;
import com.fluxtion.compiler.generation.util.MultipleSepTargetInProcessTest;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.DoubleSupplier;
import java.util.function.ToDoubleFunction;
import org.yaml.snakeyaml.LoaderOptions;
import com.fluxtion.runtime.annotations.OnEventHandler;
import com.fluxtion.runtime.annotations.OnParentUpdate;
import com.fluxtion.runtime.annotations.OnTrigger;
import com.fluxtion.runtime.annotations.builder.ExcludeNode;
import com.fluxtion.runtime.node.NamedNode;
import lombok.Data;
import org.junit.Test;
import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
public class GraphOfInstancesTest extends MultipleSepTargetInProcessTest {
    public GraphOfInstancesTest(boolean compiledSep) {
        super(compiledSep);
    }

    @Test(expected = NoSuchFieldException.class)
    public void buildWithoutYaml() {
        sep(c -> {
            com.fluxtion.compiler.builder.factory.StringHandler stringHandlerA = new com.fluxtion.compiler.builder.factory.StringHandler("A");
            com.fluxtion.compiler.builder.factory.StringHandler stringHandlerB = new com.fluxtion.compiler.builder.factory.StringHandler("B");
            com.fluxtion.compiler.builder.factory.StringHandler stringHandlerC = new com.fluxtion.compiler.builder.factory.StringHandler("C");
            com.fluxtion.compiler.builder.factory.StringHandler stringHandlerADuplicate = new com.fluxtion.compiler.builder.factory.StringHandler("A");
            com.fluxtion.compiler.builder.factory.StringHandler stringHandlerN = new com.fluxtion.compiler.builder.factory.StringHandler("N");
            com.fluxtion.compiler.builder.factory.DoubleSum aggregator = new com.fluxtion.compiler.builder.factory.DoubleSum();
            aggregator.getDoubleSuppliers().add(stringHandlerA);
            aggregator.getDoubleSuppliers().add(stringHandlerB);
            com.fluxtion.compiler.builder.factory.InstanceHolder instanceHolder = new com.fluxtion.compiler.builder.factory.InstanceHolder();
            instanceHolder.getNodeList().add(aggregator);
            c.addNode(instanceHolder);
            c.addNode(stringHandlerC);
            c.addNode(stringHandlerN);
        });
        DoubleSum aggregator = getField("aggregator");
        StringHandler handlerC = getField("stringHandler_C");
        onEvent("A");
        assertThat(aggregator.sum, is(1.0));
        assertThat(handlerC.value, is(0));
        onEvent("A");
        assertThat(aggregator.sum, is(2.0));
        assertThat(handlerC.value, is(0));
        onEvent("B");
        assertThat(aggregator.sum, is(3.0));
        assertThat(handlerC.value, is(0));
        onEvent("C");
        assertThat(aggregator.sum, is(3.0));
        assertThat(handlerC.value, is(1));
        getField("instanceHolder");
    }

    @Test(expected = NoSuchFieldException.class)
    public void driveFromYaml() {
        String config = ((((((("nodeList:\n" + "- !doubleSum\n") + "  doubleSuppliers:\n") + "  - !stringHandler\n") + "    id: A\n") + "  - !stringHandler\n") + "    id: B\n") + "- !stringHandler\n") + "  id: C";
        sep(c -> {
            Constructor constructor = new Constructor(new LoaderOptions());
            constructor.addTypeDescription(new TypeDescription(com.fluxtion.compiler.builder.factory.DoubleSum.class, "!doubleSum"));
            constructor.addTypeDescription(new TypeDescription(com.fluxtion.compiler.builder.factory.StringHandler.class, "!stringHandler"));
            Yaml yaml = new Yaml(constructor);
            c.addNode(yaml.loadAs(config, com.fluxtion.compiler.builder.factory.InstanceHolder.class));
        });
        DoubleSum aggregator = getField("aggregator");
        StringHandler handlerC = getField("stringHandler_C");
        onEvent("A");
        assertThat(aggregator.sum, is(1.0));
        assertThat(handlerC.value, is(0));
        onEvent("A");
        assertThat(aggregator.sum, is(2.0));
        assertThat(handlerC.value, is(0));
        onEvent("B");
        assertThat(aggregator.sum, is(3.0));
        assertThat(handlerC.value, is(0));
        onEvent("C");
        assertThat(aggregator.sum, is(3.0));
        assertThat(handlerC.value, is(1));
        getField("instanceHolder");
    }

    @Test(expected = NoSuchFieldException.class)
    public void driveAsListFromYaml() {
        String config = ((((((("" + "- !doubleSum\n") + "  doubleSuppliers:\n") + "  - !stringHandler\n") + "    id: A\n") + "  - !stringHandler\n") + "    id: B\n") + "- !stringHandler\n") + "  id: C";
        sep(c -> {
            Constructor constructor = new Constructor(new LoaderOptions());
            constructor.addTypeDescription(new TypeDescription(com.fluxtion.compiler.builder.factory.DoubleSum.class, "!doubleSum"));
            constructor.addTypeDescription(new TypeDescription(com.fluxtion.compiler.builder.factory.StringHandler.class, "!stringHandler"));
            Yaml yaml = new Yaml(constructor);
            yaml.loadAs("nodeList:\n" + config, com.fluxtion.compiler.builder.factory.InstanceHolder.class).getNodeList().forEach(c::addNode);
        });
        DoubleSum aggregator = getField("aggregator");
        StringHandler handlerC = getField("stringHandler_C");
        onEvent("A");
        assertThat(aggregator.sum, is(1.0));
        assertThat(handlerC.value, is(0));
        onEvent("A");
        assertThat(aggregator.sum, is(2.0));
        assertThat(handlerC.value, is(0));
        onEvent("B");
        assertThat(aggregator.sum, is(3.0));
        assertThat(handlerC.value, is(0));
        onEvent("C");
        assertThat(aggregator.sum, is(3.0));
        assertThat(handlerC.value, is(1));
        getField("instanceHolder");
    }

    @Test
    public void buildWithYaml() {
    }

    @Data
    @ExcludeNode
    public static class InstanceHolder implements NamedNode {
        private List<Object> nodeList = new ArrayList<>();

        @Override
        public String getName() {
            return "instanceHolder";
        }
    }

    public static class StringHandler implements DoubleSupplier , NamedNode {
        private String id;

        transient int value;

        public StringHandler(String id) {
            this.id = id;
        }

        public StringHandler() {
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        @OnEventHandler
        public boolean myStringHandler(String s) {
            value += (Objects.equals(s, id)) ? 1 : 0;
            return true;
        }

        @Override
        public double getAsDouble() {
            return value;
        }

        public int getValue() {
            return value;
        }

        @Override
        public String toString() {
            return ((((("StringHandler{" + "id='") + id) + '\'') + ", value=") + value) + '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;

            if ((o == null) || (getClass() != o.getClass()))
                return false;

            StringHandler that = ((StringHandler) (o));
            return id.equals(that.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String getName() {
            return "stringHandler_" + id;
        }
    }

    @Data
    public static class DoubleSum implements NamedNode {
        private List<DoubleSupplier> doubleSuppliers = new ArrayList<>();

        double sum;

        @OnParentUpdate
        public void doubleSupplierUpdated(DoubleSupplier doubleSupplier) {
        }

        @OnTrigger
        public boolean sumSuppliers() {
            sum = doubleSuppliers.stream().mapToDouble(DoubleSupplier::getAsDouble).sum();
            return true;
        }

        @Override
        public String getName() {
            return "aggregator";
        }
    }
}
