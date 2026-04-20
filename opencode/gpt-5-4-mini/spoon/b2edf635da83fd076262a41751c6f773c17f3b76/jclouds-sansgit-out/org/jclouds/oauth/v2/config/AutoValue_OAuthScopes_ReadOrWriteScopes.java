package org.jclouds.oauth.v2.config;
import java.util.List;
import javax.annotation.Generated;
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_OAuthScopes_ReadOrWriteScopes extends OAuthScopes.ReadOrWriteScopes {
    private final List<String> readScopes;

    private final List<String> writeScopes;

    AutoValue_OAuthScopes_ReadOrWriteScopes(List<String> readScopes, List<String> writeScopes) {
        if (readScopes == null) {
            throw new NullPointerException("Null readScopes");
        }
        this.readScopes = readScopes;
        if (writeScopes == null) {
            throw new NullPointerException("Null writeScopes");
        }
        this.writeScopes = writeScopes;
    }

    @Override
    List<String> readScopes() {
        return readScopes;
    }

    @Override
    List<String> writeScopes() {
        return writeScopes;
    }

    @Override
    public String toString() {
        return ((((("ReadOrWriteScopes{" + "readScopes=") + readScopes) + ", ") + "writeScopes=") + writeScopes) + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof OAuthScopes.ReadOrWriteScopes) {
            OAuthScopes.ReadOrWriteScopes that = ((OAuthScopes.ReadOrWriteScopes) (o));
            return this.readScopes.equals(that.readScopes()) && this.writeScopes.equals(that.writeScopes());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h = 1;
        h *= 1000003;
        h ^= this.readScopes.hashCode();
        h *= 1000003;
        h ^= this.writeScopes.hashCode();
        return h;
    }
}
