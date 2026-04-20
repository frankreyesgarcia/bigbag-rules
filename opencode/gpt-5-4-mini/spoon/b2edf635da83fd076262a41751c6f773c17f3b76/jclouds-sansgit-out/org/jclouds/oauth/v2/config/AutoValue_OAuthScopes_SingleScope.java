package org.jclouds.oauth.v2.config;
import java.util.List;
import javax.annotation.Generated;
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_OAuthScopes_SingleScope extends OAuthScopes.SingleScope {
    private final List<String> scopes;

    AutoValue_OAuthScopes_SingleScope(List<String> scopes) {
        if (scopes == null) {
            throw new NullPointerException("Null scopes");
        }
        this.scopes = scopes;
    }

    @Override
    List<String> scopes() {
        return scopes;
    }

    @Override
    public String toString() {
        return (("SingleScope{" + "scopes=") + scopes) + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof OAuthScopes.SingleScope) {
            OAuthScopes.SingleScope that = ((OAuthScopes.SingleScope) (o));
            return this.scopes.equals(that.scopes());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h = 1;
        h *= 1000003;
        h ^= this.scopes.hashCode();
        return h;
    }
}
