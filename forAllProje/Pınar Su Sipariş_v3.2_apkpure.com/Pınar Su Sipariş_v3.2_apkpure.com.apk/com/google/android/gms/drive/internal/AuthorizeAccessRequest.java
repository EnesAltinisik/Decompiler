package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class AuthorizeAccessRequest extends AbstractSafeParcelable {
    public static final Creator<AuthorizeAccessRequest> CREATOR = new zzc();
    final int mVersionCode;
    final DriveId zzauZ;
    final long zzawE;

    AuthorizeAccessRequest(int i, long j, DriveId driveId) {
        this.mVersionCode = i;
        this.zzawE = j;
        this.zzauZ = driveId;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc.zza(this, parcel, i);
    }
}
