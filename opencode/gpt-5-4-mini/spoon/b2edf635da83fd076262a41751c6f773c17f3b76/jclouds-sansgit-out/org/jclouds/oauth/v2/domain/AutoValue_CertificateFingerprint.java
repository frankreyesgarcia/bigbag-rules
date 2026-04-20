package org.jclouds.oauth.v2.domain;
import java.security.cert.X509Certificate;
import javax.annotation.Generated;
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CertificateFingerprint extends CertificateFingerprint {
    private final String fingerprint;

    private final X509Certificate certificate;

    AutoValue_CertificateFingerprint(String fingerprint, X509Certificate certificate) {
        if (fingerprint == null) {
            throw new NullPointerException("Null fingerprint");
        }
        this.fingerprint = fingerprint;
        if (certificate == null) {
            throw new NullPointerException("Null certificate");
        }
        this.certificate = certificate;
    }

    @Override
    public String fingerprint() {
        return fingerprint;
    }

    @Override
    public X509Certificate certificate() {
        return certificate;
    }

    @Override
    public String toString() {
        return ((((("CertificateFingerprint{" + "fingerprint=") + fingerprint) + ", ") + "certificate=") + certificate) + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof CertificateFingerprint) {
            CertificateFingerprint that = ((CertificateFingerprint) (o));
            return this.fingerprint.equals(that.fingerprint()) && this.certificate.equals(that.certificate());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h = 1;
        h *= 1000003;
        h ^= this.fingerprint.hashCode();
        h *= 1000003;
        h ^= this.certificate.hashCode();
        return h;
    }
}
