package org.jclouds.oauth.v2.domain;
import javax.annotation.Generated;
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Claims extends Claims {
    private final String iss;

    private final String scope;

    private final String aud;

    private final long exp;

    private final long iat;

    AutoValue_Claims(String iss, String scope, String aud, long exp, long iat) {
        if (iss == null) {
            throw new NullPointerException("Null iss");
        }
        this.iss = iss;
        if (scope == null) {
            throw new NullPointerException("Null scope");
        }
        this.scope = scope;
        if (aud == null) {
            throw new NullPointerException("Null aud");
        }
        this.aud = aud;
        this.exp = exp;
        this.iat = iat;
    }

    @Override
    public String iss() {
        return iss;
    }

    @Override
    public String scope() {
        return scope;
    }

    @Override
    public String aud() {
        return aud;
    }

    @Override
    public long exp() {
        return exp;
    }

    @Override
    public long iat() {
        return iat;
    }

    @Override
    public String toString() {
        return (((((((((((((("Claims{" + "iss=") + iss) + ", ") + "scope=") + scope) + ", ") + "aud=") + aud) + ", ") + "exp=") + exp) + ", ") + "iat=") + iat) + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Claims) {
            Claims that = ((Claims) (o));
            return (((this.iss.equals(that.iss()) && this.scope.equals(that.scope())) && this.aud.equals(that.aud())) && (this.exp == that.exp())) && (this.iat == that.iat());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h = 1;
        h *= 1000003;
        h ^= this.iss.hashCode();
        h *= 1000003;
        h ^= this.scope.hashCode();
        h *= 1000003;
        h ^= this.aud.hashCode();
        h *= 1000003;
        h ^= (this.exp >>> 32) ^ this.exp;
        h *= 1000003;
        h ^= (this.iat >>> 32) ^ this.iat;
        return h;
    }
}
