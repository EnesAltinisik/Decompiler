package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class GetMetadataRequest extends AbstractSafeParcelable {
    public static final Creator<GetMetadataRequest> CREATOR = new zzaj();
    final int mVersionCode;
    final DriveId zzawJ;
    final boolean zzayo;

    GetMetadataRequest(int i, DriveId driveId, boolean z) {
        this.mVersionCode = i;
        this.zzawJ = driveId;
        this.zzayo = z;
    }

    public GetMetadataRequest(DriveId driveId, boolean z) {
        this(1, driveId, z);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzaj.zza(this, parcel, i);
    }
}
