package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DriveFileRange extends AbstractSafeParcelable {
    public static final Creator<DriveFileRange> CREATOR = new zzc();
    final int mVersionCode;
    final long zzavj;
    final long zzavk;

    DriveFileRange(int i, long j, long j2) {
        this.mVersionCode = i;
        this.zzavj = j;
        this.zzavk = j2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc.zza(this, parcel, i);
    }
}
