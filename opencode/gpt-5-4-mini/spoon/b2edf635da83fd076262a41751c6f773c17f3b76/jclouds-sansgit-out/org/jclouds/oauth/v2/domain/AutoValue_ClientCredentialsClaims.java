package org.jclouds.oauth.v2.domain;
import org.jclouds.javax.annotation.Nullable;
import javax.annotation.Generated;
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ClientCredentialsClaims extends ClientCredentialsClaims {
    private final String iss;

    private final String sub;

    private final String aud;

    private final long exp;

    private final long nbf;

    private final String jti;

    AutoValue_ClientCredentialsClaims(String iss, String sub, String aud, long exp, long nbf, @Nullable
    String jti) {
        if (iss == null) {
            throw new NullPointerException("Null iss");
        }
        this.iss = iss;
        if (sub == null) {
            throw new NullPointerException("Null sub");
        }
        this.sub = sub;
        if (aud == null) {
            throw new NullPointerException("Null aud");
        }
        this.aud = aud;
        this.exp = exp;
        this.nbf = nbf;
        this.jti = jti;
    }

    @Override
    public String iss() {
        return iss;
    }

    @Override
    public String sub() {
        return sub;
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
    public long nbf() {
        return nbf;
    }

    @Nullable
    @Override
    public String jti() {
        return jti;
    }

    @Override
    public String toString() {
        return ((((((((((((((((("ClientCredentialsClaims{" + "iss=") + iss) + ", ") + "sub=") + sub) + ", ") + "aud=") + aud) + ", ") + "exp=") + exp) + ", ") + "nbf=") + nbf) + ", ") + "jti=") + jti) + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ClientCredentialsClaims) {
            ClientCredentialsClaims that = ((ClientCredentialsClaims) (o));
            return ((((this.iss.equals(that.iss()) && this.sub.equals(that.sub())) && this.aud.equals(that.aud())) && (this.exp == that.exp())) && (this.nbf == that.nbf())) && (this.jti == null ? that.jti() == null : this.jti.equals(that.jti()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h = 1;
        h *= 1000003;
        h ^= this.iss.hashCode();
        h *= 1000003;
        h ^= this.sub.hashCode();
        h *= 1000003;
        h ^= this.aud.hashCode();
        h *= 1000003;
        h ^= (this.exp >>> 32) ^ this.exp;
        h *= 1000003;
        h ^= (this.nbf >>> 32) ^ this.nbf;
        h *= 1000003;
        h ^= (jti == null) ? 0 : this.jti.hashCode();
        return h;
    }
}
