package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class GetPermissionsRequest extends AbstractSafeParcelable {
    public static final Creator<GetPermissionsRequest> CREATOR = new zzak();
    final int mVersionCode;
    final DriveId zzauZ;

    GetPermissionsRequest(int i, DriveId driveId) {
        this.mVersionCode = i;
        this.zzauZ = driveId;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzak.zza(this, parcel, i);
    }
}
