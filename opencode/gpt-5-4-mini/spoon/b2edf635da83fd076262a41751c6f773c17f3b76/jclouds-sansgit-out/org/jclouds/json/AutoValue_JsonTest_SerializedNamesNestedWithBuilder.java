package org.jclouds.json;
import java.util.List;
import org.jclouds.javax.annotation.Nullable;
import javax.annotation.Generated;
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_JsonTest_SerializedNamesNestedWithBuilder extends JsonTest.SerializedNamesNestedWithBuilder {
    private final String id;

    private final List<JsonTest.SerializedNamesWithBuilder> snwb;

    private AutoValue_JsonTest_SerializedNamesNestedWithBuilder(String id, @Nullable
    List<JsonTest.SerializedNamesWithBuilder> snwb) {
        this.id = id;
        this.snwb = snwb;
    }

    @Override
    public String getId() {
        return id;
    }

    @Nullable
    @Override
    public List<JsonTest.SerializedNamesWithBuilder> getSnwb() {
        return snwb;
    }

    @Override
    public String toString() {
        return ((((("SerializedNamesNestedWithBuilder{" + "id=") + id) + ", ") + "snwb=") + snwb) + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof JsonTest.SerializedNamesNestedWithBuilder) {
            JsonTest.SerializedNamesNestedWithBuilder that = ((JsonTest.SerializedNamesNestedWithBuilder) (o));
            return this.id.equals(that.getId()) && (this.snwb == null ? that.getSnwb() == null : this.snwb.equals(that.getSnwb()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h = 1;
        h *= 1000003;
        h ^= this.id.hashCode();
        h *= 1000003;
        h ^= (snwb == null) ? 0 : this.snwb.hashCode();
        return h;
    }

    @Override
    public JsonTest.SerializedNamesNestedWithBuilder.Builder toBuilder() {
        return new Builder(this);
    }

    static final class Builder implements JsonTest.SerializedNamesNestedWithBuilder.Builder {
        private String id;

        private List<JsonTest.SerializedNamesWithBuilder> snwb;

        Builder() {
        }

        private Builder(JsonTest.SerializedNamesNestedWithBuilder source) {
            this.id = source.getId();
            this.snwb = source.getSnwb();
        }

        @Override
        public JsonTest.SerializedNamesNestedWithBuilder.Builder id(String id) {
            if (id == null) {
                throw new NullPointerException("Null id");
            }
            this.id = id;
            return this;
        }

        @Override
        public JsonTest.SerializedNamesNestedWithBuilder.Builder snwb(@Nullable
        List<JsonTest.SerializedNamesWithBuilder> snwb) {
            this.snwb = snwb;
            return this;
        }

        @Override
        public JsonTest.SerializedNamesNestedWithBuilder build() {
            String missing = "";
            if (this.id == null) {
                missing += " id";
            }
            if (!missing.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + missing);
            }
            return new AutoValue_JsonTest_SerializedNamesNestedWithBuilder(this.id, this.snwb);
        }
    }
}
