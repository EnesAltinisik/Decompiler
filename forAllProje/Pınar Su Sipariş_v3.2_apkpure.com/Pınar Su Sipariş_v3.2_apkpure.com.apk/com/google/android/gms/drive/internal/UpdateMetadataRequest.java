package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class UpdateMetadataRequest extends AbstractSafeParcelable {
    public static final Creator<UpdateMetadataRequest> CREATOR = new zzbx();
    final int mVersionCode;
    final DriveId zzawJ;
    final MetadataBundle zzawK;

    UpdateMetadataRequest(int i, DriveId driveId, MetadataBundle metadataBundle) {
        this.mVersionCode = i;
        this.zzawJ = driveId;
        this.zzawK = metadataBundle;
    }

    public UpdateMetadataRequest(DriveId driveId, MetadataBundle metadataBundle) {
        this(1, driveId, metadataBundle);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbx.zza(this, parcel, i);
    }
}
