package org.jclouds.blobstore.domain;
import org.jclouds.blobstore.options.PutOptions;
import org.jclouds.javax.annotation.Nullable;
import javax.annotation.Generated;
@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_MultipartUpload extends MultipartUpload {
    private final String containerName;

    private final String blobName;

    private final String id;

    private final BlobMetadata blobMetadata;

    private final PutOptions putOptions;

    AutoValue_MultipartUpload(String containerName, String blobName, String id, @Nullable
    BlobMetadata blobMetadata, @Nullable
    PutOptions putOptions) {
        if (containerName == null) {
            throw new NullPointerException("Null containerName");
        }
        this.containerName = containerName;
        if (blobName == null) {
            throw new NullPointerException("Null blobName");
        }
        this.blobName = blobName;
        if (id == null) {
            throw new NullPointerException("Null id");
        }
        this.id = id;
        this.blobMetadata = blobMetadata;
        this.putOptions = putOptions;
    }

    @Override
    public String containerName() {
        return containerName;
    }

    @Override
    public String blobName() {
        return blobName;
    }

    @Override
    public String id() {
        return id;
    }

    @Nullable
    @Override
    public BlobMetadata blobMetadata() {
        return blobMetadata;
    }

    @Nullable
    @Override
    public PutOptions putOptions() {
        return putOptions;
    }

    @Override
    public String toString() {
        return (((((((((((((("MultipartUpload{" + "containerName=") + containerName) + ", ") + "blobName=") + blobName) + ", ") + "id=") + id) + ", ") + "blobMetadata=") + blobMetadata) + ", ") + "putOptions=") + putOptions) + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof MultipartUpload) {
            MultipartUpload that = ((MultipartUpload) (o));
            return (((this.containerName.equals(that.containerName()) && this.blobName.equals(that.blobName())) && this.id.equals(that.id())) && (this.blobMetadata == null ? that.blobMetadata() == null : this.blobMetadata.equals(that.blobMetadata()))) && (this.putOptions == null ? that.putOptions() == null : this.putOptions.equals(that.putOptions()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h = 1;
        h *= 1000003;
        h ^= this.containerName.hashCode();
        h *= 1000003;
        h ^= this.blobName.hashCode();
        h *= 1000003;
        h ^= this.id.hashCode();
        h *= 1000003;
        h ^= (blobMetadata == null) ? 0 : this.blobMetadata.hashCode();
        h *= 1000003;
        h ^= (putOptions == null) ? 0 : this.putOptions.hashCode();
        return h;
    }
}
