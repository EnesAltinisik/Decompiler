package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class OnMetadataResponse extends AbstractSafeParcelable {
    public static final Creator<OnMetadataResponse> CREATOR = new zzbb();
    final int mVersionCode;
    final MetadataBundle zzawW;

    OnMetadataResponse(int i, MetadataBundle metadataBundle) {
        this.mVersionCode = i;
        this.zzawW = metadataBundle;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbb.zza(this, parcel, i);
    }

    public MetadataBundle zzwC() {
        return this.zzawW;
    }
}
