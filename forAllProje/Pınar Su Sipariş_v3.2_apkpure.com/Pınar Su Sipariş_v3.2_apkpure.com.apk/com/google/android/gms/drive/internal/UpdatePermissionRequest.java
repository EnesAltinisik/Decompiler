package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class UpdatePermissionRequest extends AbstractSafeParcelable {
    public static final Creator<UpdatePermissionRequest> CREATOR = new zzby();
    final int mVersionCode;
    final DriveId zzauZ;
    final String zzavK;
    final String zzavv;
    final boolean zzawD;
    final int zzayZ;

    UpdatePermissionRequest(int i, DriveId driveId, String str, int i2, boolean z, String str2) {
        this.mVersionCode = i;
        this.zzauZ = driveId;
        this.zzavK = str;
        this.zzayZ = i2;
        this.zzawD = z;
        this.zzavv = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzby.zza(this, parcel, i);
    }
}
