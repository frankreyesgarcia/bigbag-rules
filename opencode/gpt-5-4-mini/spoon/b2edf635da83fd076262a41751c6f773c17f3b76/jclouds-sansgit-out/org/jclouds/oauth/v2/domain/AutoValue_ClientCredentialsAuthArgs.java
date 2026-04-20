package org.jclouds.oauth.v2.domain;
import org.jclouds.javax.annotation.Nullable;
import javax.annotation.Generated;
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ClientCredentialsAuthArgs extends ClientCredentialsAuthArgs {
    private final String clientId;

    private final ClientCredentialsClaims claims;

    private final String resource;

    private final String scope;

    AutoValue_ClientCredentialsAuthArgs(String clientId, ClientCredentialsClaims claims, String resource, @Nullable
    String scope) {
        if (clientId == null) {
            throw new NullPointerException("Null clientId");
        }
        this.clientId = clientId;
        if (claims == null) {
            throw new NullPointerException("Null claims");
        }
        this.claims = claims;
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
    public ClientCredentialsClaims claims() {
        return claims;
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
        return ((((((((((("ClientCredentialsAuthArgs{" + "clientId=") + clientId) + ", ") + "claims=") + claims) + ", ") + "resource=") + resource) + ", ") + "scope=") + scope) + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ClientCredentialsAuthArgs) {
            ClientCredentialsAuthArgs that = ((ClientCredentialsAuthArgs) (o));
            return ((this.clientId.equals(that.clientId()) && this.claims.equals(that.claims())) && this.resource.equals(that.resource())) && (this.scope == null ? that.scope() == null : this.scope.equals(that.scope()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h = 1;
        h *= 1000003;
        h ^= this.clientId.hashCode();
        h *= 1000003;
        h ^= this.claims.hashCode();
        h *= 1000003;
        h ^= this.resource.hashCode();
        h *= 1000003;
        h ^= (scope == null) ? 0 : this.scope.hashCode();
        return h;
    }
}
