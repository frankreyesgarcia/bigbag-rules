package org.jclouds.json;
import javax.annotation.Generated;
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_JsonTest_SerializedNamesWithBuilder extends JsonTest.SerializedNamesWithBuilder {
    private final String id;

    private final int number;

    private AutoValue_JsonTest_SerializedNamesWithBuilder(String id, int number) {
        this.id = id;
        this.number = number;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return ((((("SerializedNamesWithBuilder{" + "id=") + id) + ", ") + "number=") + number) + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof JsonTest.SerializedNamesWithBuilder) {
            JsonTest.SerializedNamesWithBuilder that = ((JsonTest.SerializedNamesWithBuilder) (o));
            return this.id.equals(that.getId()) && (this.number == that.getNumber());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h = 1;
        h *= 1000003;
        h ^= this.id.hashCode();
        h *= 1000003;
        h ^= this.number;
        return h;
    }

    @Override
    public JsonTest.SerializedNamesWithBuilder.Builder toBuilder() {
        return new Builder(this);
    }

    static final class Builder implements JsonTest.SerializedNamesWithBuilder.Builder {
        private String id;

        private Integer number;

        Builder() {
        }

        private Builder(JsonTest.SerializedNamesWithBuilder source) {
            this.id = source.getId();
            this.number = source.getNumber();
        }

        @Override
        public JsonTest.SerializedNamesWithBuilder.Builder id(String id) {
            if (id == null) {
                throw new NullPointerException("Null id");
            }
            this.id = id;
            return this;
        }

        @Override
        public JsonTest.SerializedNamesWithBuilder.Builder number(int number) {
            this.number = number;
            return this;
        }

        @Override
        public JsonTest.SerializedNamesWithBuilder build() {
            String missing = "";
            if (this.id == null) {
                missing += " id";
            }
            if (this.number == null) {
                missing += " number";
            }
            if (!missing.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + missing);
            }
            return new AutoValue_JsonTest_SerializedNamesWithBuilder(this.id, this.number);
        }
    }
}
