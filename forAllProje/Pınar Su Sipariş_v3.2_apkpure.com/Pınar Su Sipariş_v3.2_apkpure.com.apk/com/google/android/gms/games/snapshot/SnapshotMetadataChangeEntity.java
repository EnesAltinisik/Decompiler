package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;

public final class SnapshotMetadataChangeEntity extends AbstractSafeParcelable implements SnapshotMetadataChange {
    public static final SnapshotMetadataChangeCreator CREATOR = new SnapshotMetadataChangeCreator();
    private final int mVersionCode;
    private final String zzVw;
    private final Long zzaRP;
    private final Uri zzaRR;
    private final Long zzaRS;
    private BitmapTeleporter zzaRT;

    SnapshotMetadataChangeEntity() {
        this(5, null, null, null, null, null);
    }

    SnapshotMetadataChangeEntity(int i, String str, Long l, BitmapTeleporter bitmapTeleporter, Uri uri, Long l2) {
        boolean z = true;
        this.mVersionCode = i;
        this.zzVw = str;
        this.zzaRS = l;
        this.zzaRT = bitmapTeleporter;
        this.zzaRR = uri;
        this.zzaRP = l2;
        if (this.zzaRT != null) {
            if (this.zzaRR != null) {
                z = false;
            }
            zzaa.zza(z, (Object) "Cannot set both a URI and an image");
        } else if (this.zzaRR != null) {
            if (this.zzaRT != null) {
                z = false;
            }
            zzaa.zza(z, (Object) "Cannot set both a URI and an image");
        }
    }

    SnapshotMetadataChangeEntity(String str, Long l, BitmapTeleporter bitmapTeleporter, Uri uri, Long l2) {
        this(5, str, l, bitmapTeleporter, uri, l2);
    }

    public Bitmap getCoverImage() {
        return this.zzaRT == null ? null : this.zzaRT.zzsP();
    }

    public Uri getCoverImageUri() {
        return this.zzaRR;
    }

    public String getDescription() {
        return this.zzVw;
    }

    public Long getPlayedTimeMillis() {
        return this.zzaRS;
    }

    public Long getProgressValue() {
        return this.zzaRP;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        SnapshotMetadataChangeCreator.zza(this, parcel, i);
    }

    public BitmapTeleporter zzBy() {
        return this.zzaRT;
    }
}
