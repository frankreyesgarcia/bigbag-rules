package org.jclouds.oauth.v2.config;
import java.util.List;
import org.jclouds.javax.annotation.Nullable;
import javax.annotation.Generated;
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_OAuthConfigFactory_OAuthConfig extends OAuthConfigFactory.OAuthConfig {
    private final List<String> scopes;

    private final String audience;

    private final String resource;

    AutoValue_OAuthConfigFactory_OAuthConfig(List<String> scopes, @Nullable
    String audience, @Nullable
    String resource) {
        if (scopes == null) {
            throw new NullPointerException("Null scopes");
        }
        this.scopes = scopes;
        this.audience = audience;
        this.resource = resource;
    }

    @Override
    public List<String> scopes() {
        return scopes;
    }

    @Nullable
    @Override
    public String audience() {
        return audience;
    }

    @Nullable
    @Override
    public String resource() {
        return resource;
    }

    @Override
    public String toString() {
        return (((((((("OAuthConfig{" + "scopes=") + scopes) + ", ") + "audience=") + audience) + ", ") + "resource=") + resource) + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof OAuthConfigFactory.OAuthConfig) {
            OAuthConfigFactory.OAuthConfig that = ((OAuthConfigFactory.OAuthConfig) (o));
            return (this.scopes.equals(that.scopes()) && (this.audience == null ? that.audience() == null : this.audience.equals(that.audience()))) && (this.resource == null ? that.resource() == null : this.resource.equals(that.resource()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h = 1;
        h *= 1000003;
        h ^= this.scopes.hashCode();
        h *= 1000003;
        h ^= (audience == null) ? 0 : this.audience.hashCode();
        h *= 1000003;
        h ^= (resource == null) ? 0 : this.resource.hashCode();
        return h;
    }
}
