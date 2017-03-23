package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class UntrashResourceRequest extends AbstractSafeParcelable {
    public static final Creator<UntrashResourceRequest> CREATOR = new zzbw();
    final int mVersionCode;
    final DriveId zzawJ;

    UntrashResourceRequest(int i, DriveId driveId) {
        this.mVersionCode = i;
        this.zzawJ = driveId;
    }

    public UntrashResourceRequest(DriveId driveId) {
        this(1, driveId);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbw.zza(this, parcel, i);
    }
}
