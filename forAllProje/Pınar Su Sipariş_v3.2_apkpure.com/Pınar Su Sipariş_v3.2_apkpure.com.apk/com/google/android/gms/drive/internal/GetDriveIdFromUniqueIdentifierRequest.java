package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetDriveIdFromUniqueIdentifierRequest extends AbstractSafeParcelable {
    public static final Creator<GetDriveIdFromUniqueIdentifierRequest> CREATOR = new zzai();
    final int mVersionCode;
    final String zzavz;
    final boolean zzayn;

    GetDriveIdFromUniqueIdentifierRequest(int i, String str, boolean z) {
        this.mVersionCode = i;
        this.zzavz = str;
        this.zzayn = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzai.zza(this, parcel, i);
    }
}
