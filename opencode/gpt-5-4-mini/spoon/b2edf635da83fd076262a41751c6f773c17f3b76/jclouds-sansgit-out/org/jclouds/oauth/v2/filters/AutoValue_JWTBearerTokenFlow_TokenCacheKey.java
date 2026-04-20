package org.jclouds.oauth.v2.filters;
import org.jclouds.oauth.v2.domain.Claims;
import javax.annotation.Generated;
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_JWTBearerTokenFlow_TokenCacheKey extends JWTBearerTokenFlow.TokenCacheKey {
    private final Claims claims;

    AutoValue_JWTBearerTokenFlow_TokenCacheKey(Claims claims) {
        if (claims == null) {
            throw new NullPointerException("Null claims");
        }
        this.claims = claims;
    }

    @Override
    public Claims claims() {
        return claims;
    }

    @Override
    public String toString() {
        return (("TokenCacheKey{" + "claims=") + claims) + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof JWTBearerTokenFlow.TokenCacheKey) {
            JWTBearerTokenFlow.TokenCacheKey that = ((JWTBearerTokenFlow.TokenCacheKey) (o));
            return this.claims.equals(that.claims());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h = 1;
        h *= 1000003;
        h ^= this.claims.hashCode();
        return h;
    }
}
