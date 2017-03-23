package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class TrashResourceRequest extends AbstractSafeParcelable {
    public static final Creator<TrashResourceRequest> CREATOR = new zzbu();
    final int mVersionCode;
    final DriveId zzawJ;

    TrashResourceRequest(int i, DriveId driveId) {
        this.mVersionCode = i;
        this.zzawJ = driveId;
    }

    public TrashResourceRequest(DriveId driveId) {
        this(1, driveId);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbu.zza(this, parcel, i);
    }
}
