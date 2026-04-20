package org.jclouds.oauth.v2.domain;
import org.jclouds.javax.annotation.Nullable;
import javax.annotation.Generated;
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ClientSecret extends ClientSecret {
    private final String clientId;

    private final String clientSecret;

    private final String resource;

    private final String scope;

    AutoValue_ClientSecret(String clientId, String clientSecret, String resource, @Nullable
    String scope) {
        if (clientId == null) {
            throw new NullPointerException("Null clientId");
        }
        this.clientId = clientId;
        if (clientSecret == null) {
            throw new NullPointerException("Null clientSecret");
        }
        this.clientSecret = clientSecret;
        if (resource == null) {
            throw new NullPointerException("Null resource");
        }
        this.resource = resource;
        this.scope = scope;
    }

    @Override
    public String clientId() {
        return clientId;
    }

    @Override
    public String clientSecret() {
        return clientSecret;
    }

    @Override
    public String resource() {
        return resource;
    }

    @Nullable
    @Override
    public String scope() {
        return scope;
    }

    @Override
    public String toString() {
        return ((((((((((("ClientSecret{" + "clientId=") + clientId) + ", ") + "clientSecret=") + clientSecret) + ", ") + "resource=") + resource) + ", ") + "scope=") + scope) + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ClientSecret) {
            ClientSecret that = ((ClientSecret) (o));
            return ((this.clientId.equals(that.clientId()) && this.clientSecret.equals(that.clientSecret())) && this.resource.equals(that.resource())) && (this.scope == null ? that.scope() == null : this.scope.equals(that.scope()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h = 1;
        h *= 1000003;
        h ^= this.clientId.hashCode();
        h *= 1000003;
        h ^= this.clientSecret.hashCode();
        h *= 1000003;
        h ^= this.resource.hashCode();
        h *= 1000003;
        h ^= (scope == null) ? 0 : this.scope.hashCode();
        return h;
    }
}
