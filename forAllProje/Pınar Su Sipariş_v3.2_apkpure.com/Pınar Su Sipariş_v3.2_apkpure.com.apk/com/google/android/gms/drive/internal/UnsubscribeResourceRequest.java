package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class UnsubscribeResourceRequest extends AbstractSafeParcelable {
    public static final Creator<UnsubscribeResourceRequest> CREATOR = new zzbv();
    final int mVersionCode;
    final DriveId zzawJ;

    UnsubscribeResourceRequest(int i, DriveId driveId) {
        this.mVersionCode = i;
        this.zzawJ = driveId;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbv.zza(this, parcel, i);
    }
}
