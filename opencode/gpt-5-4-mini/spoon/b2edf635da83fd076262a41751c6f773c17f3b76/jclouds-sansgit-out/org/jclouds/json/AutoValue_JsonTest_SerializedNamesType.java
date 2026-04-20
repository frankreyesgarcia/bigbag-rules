package org.jclouds.json;
import java.util.Map;
import org.jclouds.javax.annotation.Nullable;
import javax.annotation.Generated;
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_JsonTest_SerializedNamesType extends JsonTest.SerializedNamesType {
    private final String id;

    private final Map<String, String> volumes;

    AutoValue_JsonTest_SerializedNamesType(String id, @Nullable
    Map<String, String> volumes) {
        if (id == null) {
            throw new NullPointerException("Null id");
        }
        this.id = id;
        this.volumes = volumes;
    }

    @Override
    String id() {
        return id;
    }

    @Nullable
    @Override
    Map<String, String> volumes() {
        return volumes;
    }

    @Override
    public String toString() {
        return ((((("SerializedNamesType{" + "id=") + id) + ", ") + "volumes=") + volumes) + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof JsonTest.SerializedNamesType) {
            JsonTest.SerializedNamesType that = ((JsonTest.SerializedNamesType) (o));
            return this.id.equals(that.id()) && (this.volumes == null ? that.volumes() == null : this.volumes.equals(that.volumes()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h = 1;
        h *= 1000003;
        h ^= this.id.hashCode();
        h *= 1000003;
        h ^= (volumes == null) ? 0 : this.volumes.hashCode();
        return h;
    }
}
