package org.jclouds.blobstore.domain;
import java.util.Date;
import org.jclouds.javax.annotation.Nullable;
import javax.annotation.Generated;
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_MultipartPart extends MultipartPart {
    private final int partNumber;

    private final long partSize;

    private final String partETag;

    private final Date lastModified;

    AutoValue_MultipartPart(int partNumber, long partSize, @Nullable
    String partETag, @Nullable
    Date lastModified) {
        this.partNumber = partNumber;
        this.partSize = partSize;
        this.partETag = partETag;
        this.lastModified = lastModified;
    }

    @Override
    public int partNumber() {
        return partNumber;
    }

    @Override
    public long partSize() {
        return partSize;
    }

    @Nullable
    @Override
    public String partETag() {
        return partETag;
    }

    @Nullable
    @Override
    public Date lastModified() {
        return lastModified;
    }

    @Override
    public String toString() {
        return ((((((((((("MultipartPart{" + "partNumber=") + partNumber) + ", ") + "partSize=") + partSize) + ", ") + "partETag=") + partETag) + ", ") + "lastModified=") + lastModified) + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof MultipartPart) {
            MultipartPart that = ((MultipartPart) (o));
            return (((this.partNumber == that.partNumber()) && (this.partSize == that.partSize())) && (this.partETag == null ? that.partETag() == null : this.partETag.equals(that.partETag()))) && (this.lastModified == null ? that.lastModified() == null : this.lastModified.equals(that.lastModified()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h = 1;
        h *= 1000003;
        h ^= this.partNumber;
        h *= 1000003;
        h ^= (this.partSize >>> 32) ^ this.partSize;
        h *= 1000003;
        h ^= (partETag == null) ? 0 : this.partETag.hashCode();
        h *= 1000003;
        h ^= (lastModified == null) ? 0 : this.lastModified.hashCode();
        return h;
    }
}
