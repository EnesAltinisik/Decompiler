package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class RemovePermissionRequest extends AbstractSafeParcelable {
    public static final Creator<RemovePermissionRequest> CREATOR = new zzbn();
    final int mVersionCode;
    final DriveId zzauZ;
    final String zzavK;
    final String zzavv;
    final boolean zzawD;

    RemovePermissionRequest(int i, DriveId driveId, String str, boolean z, String str2) {
        this.mVersionCode = i;
        this.zzauZ = driveId;
        this.zzavK = str;
        this.zzawD = z;
        this.zzavv = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbn.zza(this, parcel, i);
    }
}
