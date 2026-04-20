package org.jclouds.json;
import java.util.List;
import javax.annotation.Generated;
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_JsonTest_NestedSerializedNamesType extends JsonTest.NestedSerializedNamesType {
    private final JsonTest.SerializedNamesType item;

    private final List<JsonTest.SerializedNamesType> items;

    AutoValue_JsonTest_NestedSerializedNamesType(JsonTest.SerializedNamesType item, List<JsonTest.SerializedNamesType> items) {
        if (item == null) {
            throw new NullPointerException("Null item");
        }
        this.item = item;
        if (items == null) {
            throw new NullPointerException("Null items");
        }
        this.items = items;
    }

    @Override
    JsonTest.SerializedNamesType item() {
        return item;
    }

    @Override
    List<JsonTest.SerializedNamesType> items() {
        return items;
    }

    @Override
    public String toString() {
        return ((((("NestedSerializedNamesType{" + "item=") + item) + ", ") + "items=") + items) + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof JsonTest.NestedSerializedNamesType) {
            JsonTest.NestedSerializedNamesType that = ((JsonTest.NestedSerializedNamesType) (o));
            return this.item.equals(that.item()) && this.items.equals(that.items());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h = 1;
        h *= 1000003;
        h ^= this.item.hashCode();
        h *= 1000003;
        h ^= this.items.hashCode();
        return h;
    }
}
