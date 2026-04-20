package org.jclouds.oauth.v2.domain;
import javax.annotation.Generated;
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Token extends Token {
    private final String accessToken;

    private final String tokenType;

    private final long expiresIn;

    AutoValue_Token(String accessToken, String tokenType, long expiresIn) {
        if (accessToken == null) {
            throw new NullPointerException("Null accessToken");
        }
        this.accessToken = accessToken;
        if (tokenType == null) {
            throw new NullPointerException("Null tokenType");
        }
        this.tokenType = tokenType;
        this.expiresIn = expiresIn;
    }

    @Override
    public String accessToken() {
        return accessToken;
    }

    @Override
    public String tokenType() {
        return tokenType;
    }

    @Override
    public long expiresIn() {
        return expiresIn;
    }

    @Override
    public String toString() {
        return (((((((("Token{" + "accessToken=") + accessToken) + ", ") + "tokenType=") + tokenType) + ", ") + "expiresIn=") + expiresIn) + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Token) {
            Token that = ((Token) (o));
            return (this.accessToken.equals(that.accessToken()) && this.tokenType.equals(that.tokenType())) && (this.expiresIn == that.expiresIn());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h = 1;
        h *= 1000003;
        h ^= this.accessToken.hashCode();
        h *= 1000003;
        h ^= this.tokenType.hashCode();
        h *= 1000003;
        h ^= (this.expiresIn >>> 32) ^ this.expiresIn;
        return h;
    }
}
