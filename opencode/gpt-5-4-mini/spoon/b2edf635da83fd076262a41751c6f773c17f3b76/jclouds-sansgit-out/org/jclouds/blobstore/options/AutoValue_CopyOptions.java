package org.jclouds.blobstore.options;
import java.util.Date;
import java.util.Map;
import org.jclouds.io.ContentMetadata;
import org.jclouds.javax.annotation.Nullable;
import javax.annotation.Generated;
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CopyOptions extends CopyOptions {
    private final ContentMetadata contentMetadata;

    private final Map<String, String> userMetadata;

    private final Date ifModifiedSince;

    private final Date ifUnmodifiedSince;

    private final String ifMatch;

    private final String ifNoneMatch;

    private AutoValue_CopyOptions(@Nullable
    ContentMetadata contentMetadata, @Nullable
    Map<String, String> userMetadata, @Nullable
    Date ifModifiedSince, @Nullable
    Date ifUnmodifiedSince, @Nullable
    String ifMatch, @Nullable
    String ifNoneMatch) {
        this.contentMetadata = contentMetadata;
        this.userMetadata = userMetadata;
        this.ifModifiedSince = ifModifiedSince;
        this.ifUnmodifiedSince = ifUnmodifiedSince;
        this.ifMatch = ifMatch;
        this.ifNoneMatch = ifNoneMatch;
    }

    @Nullable
    @Override
    public ContentMetadata contentMetadata() {
        return contentMetadata;
    }

    @Nullable
    @Override
    public Map<String, String> userMetadata() {
        return userMetadata;
    }

    @Nullable
    @Override
    public Date ifModifiedSince() {
        return ifModifiedSince;
    }

    @Nullable
    @Override
    public Date ifUnmodifiedSince() {
        return ifUnmodifiedSince;
    }

    @Nullable
    @Override
    public String ifMatch() {
        return ifMatch;
    }

    @Nullable
    @Override
    public String ifNoneMatch() {
        return ifNoneMatch;
    }

    @Override
    public String toString() {
        return ((((((((((((((((("CopyOptions{" + "contentMetadata=") + contentMetadata) + ", ") + "userMetadata=") + userMetadata) + ", ") + "ifModifiedSince=") + ifModifiedSince) + ", ") + "ifUnmodifiedSince=") + ifUnmodifiedSince) + ", ") + "ifMatch=") + ifMatch) + ", ") + "ifNoneMatch=") + ifNoneMatch) + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof CopyOptions) {
            CopyOptions that = ((CopyOptions) (o));
            return (((((this.contentMetadata == null ? that.contentMetadata() == null : this.contentMetadata.equals(that.contentMetadata())) && (this.userMetadata == null ? that.userMetadata() == null : this.userMetadata.equals(that.userMetadata()))) && (this.ifModifiedSince == null ? that.ifModifiedSince() == null : this.ifModifiedSince.equals(that.ifModifiedSince()))) && (this.ifUnmodifiedSince == null ? that.ifUnmodifiedSince() == null : this.ifUnmodifiedSince.equals(that.ifUnmodifiedSince()))) && (this.ifMatch == null ? that.ifMatch() == null : this.ifMatch.equals(that.ifMatch()))) && (this.ifNoneMatch == null ? that.ifNoneMatch() == null : this.ifNoneMatch.equals(that.ifNoneMatch()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h = 1;
        h *= 1000003;
        h ^= (contentMetadata == null) ? 0 : this.contentMetadata.hashCode();
        h *= 1000003;
        h ^= (userMetadata == null) ? 0 : this.userMetadata.hashCode();
        h *= 1000003;
        h ^= (ifModifiedSince == null) ? 0 : this.ifModifiedSince.hashCode();
        h *= 1000003;
        h ^= (ifUnmodifiedSince == null) ? 0 : this.ifUnmodifiedSince.hashCode();
        h *= 1000003;
        h ^= (ifMatch == null) ? 0 : this.ifMatch.hashCode();
        h *= 1000003;
        h ^= (ifNoneMatch == null) ? 0 : this.ifNoneMatch.hashCode();
        return h;
    }

    static final class Builder extends CopyOptions.Builder {
        private ContentMetadata contentMetadata;

        private Map<String, String> userMetadata;

        private Date ifModifiedSince;

        private Date ifUnmodifiedSince;

        private String ifMatch;

        private String ifNoneMatch;

        Builder() {
        }

        @Override
        public CopyOptions.Builder contentMetadata(@Nullable
        ContentMetadata contentMetadata) {
            this.contentMetadata = contentMetadata;
            return this;
        }

        @Override
        public CopyOptions.Builder userMetadata(@Nullable
        Map<String, String> userMetadata) {
            this.userMetadata = userMetadata;
            return this;
        }

        @Override
        @Nullable
        Map<String, String> userMetadata() {
            return userMetadata;
        }

        @Override
        public CopyOptions.Builder ifModifiedSince(@Nullable
        Date ifModifiedSince) {
            this.ifModifiedSince = ifModifiedSince;
            return this;
        }

        @Override
        public CopyOptions.Builder ifUnmodifiedSince(@Nullable
        Date ifUnmodifiedSince) {
            this.ifUnmodifiedSince = ifUnmodifiedSince;
            return this;
        }

        @Override
        public CopyOptions.Builder ifMatch(@Nullable
        String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        @Override
        public CopyOptions.Builder ifNoneMatch(@Nullable
        String ifNoneMatch) {
            this.ifNoneMatch = ifNoneMatch;
            return this;
        }

        @Override
        CopyOptions autoBuild() {
            return new AutoValue_CopyOptions(this.contentMetadata, this.userMetadata, this.ifModifiedSince, this.ifUnmodifiedSince, this.ifMatch, this.ifNoneMatch);
        }
    }
}
