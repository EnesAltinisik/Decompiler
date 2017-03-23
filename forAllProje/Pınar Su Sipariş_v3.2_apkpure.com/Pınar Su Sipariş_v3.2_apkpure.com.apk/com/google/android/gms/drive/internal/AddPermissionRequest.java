package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.Permission;

public class AddPermissionRequest extends AbstractSafeParcelable {
    public static final Creator<AddPermissionRequest> CREATOR = new zzb();
    final int mVersionCode;
    final DriveId zzauZ;
    final String zzavv;
    final Permission zzawA;
    final boolean zzawB;
    final String zzawC;
    final boolean zzawD;

    AddPermissionRequest(int i, DriveId driveId, Permission permission, boolean z, String str, boolean z2, String str2) {
        this.mVersionCode = i;
        this.zzauZ = driveId;
        this.zzawA = permission;
        this.zzawB = z;
        this.zzawC = str;
        this.zzawD = z2;
        this.zzavv = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }
}
