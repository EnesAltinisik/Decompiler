package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.common.data.BitmapTeleporter;

public interface SnapshotMetadataChange {
    public static final SnapshotMetadataChange EMPTY_CHANGE = new SnapshotMetadataChangeEntity();

    public static final class Builder {
        private String zzVw;
        private Long zzaRO;
        private Long zzaRP;
        private BitmapTeleporter zzaRQ;
        private Uri zzaRR;

        public SnapshotMetadataChange build() {
            return new SnapshotMetadataChangeEntity(this.zzVw, this.zzaRO, this.zzaRQ, this.zzaRR, this.zzaRP);
        }

        public Builder fromMetadata(SnapshotMetadata snapshotMetadata) {
            this.zzVw = snapshotMetadata.getDescription();
            this.zzaRO = Long.valueOf(snapshotMetadata.getPlayedTime());
            this.zzaRP = Long.valueOf(snapshotMetadata.getProgressValue());
            if (this.zzaRO.longValue() == -1) {
                this.zzaRO = null;
            }
            this.zzaRR = snapshotMetadata.getCoverImageUri();
            if (this.zzaRR != null) {
                this.zzaRQ = null;
            }
            return this;
        }

        public Builder setCoverImage(Bitmap bitmap) {
            this.zzaRQ = new BitmapTeleporter(bitmap);
            this.zzaRR = null;
            return this;
        }

        public Builder setDescription(String str) {
            this.zzVw = str;
            return this;
        }

        public Builder setPlayedTimeMillis(long j) {
            this.zzaRO = Long.valueOf(j);
            return this;
        }

        public Builder setProgressValue(long j) {
            this.zzaRP = Long.valueOf(j);
            return this;
        }
    }

    Bitmap getCoverImage();

    String getDescription();

    Long getPlayedTimeMillis();

    Long getProgressValue();

    BitmapTeleporter zzBy();
}
