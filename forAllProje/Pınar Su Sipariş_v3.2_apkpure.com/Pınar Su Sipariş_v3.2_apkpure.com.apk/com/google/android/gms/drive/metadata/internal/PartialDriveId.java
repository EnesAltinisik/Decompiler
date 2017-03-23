package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class PartialDriveId extends AbstractSafeParcelable {
    public static final Creator<PartialDriveId> CREATOR = new zzn();
    final int mVersionCode;
    final String zzavl;
    final long zzavm;
    final int zzavn;

    PartialDriveId(int i, String str, long j, int i2) {
        this.mVersionCode = i;
        this.zzavl = str;
        this.zzavm = j;
        this.zzavn = i2;
    }

    public PartialDriveId(String str, long j, int i) {
        this(1, str, j, i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzn.zza(this, parcel, i);
    }

    public DriveId zzH(long j) {
        return new DriveId(this.zzavl, this.zzavm, j, this.zzavn);
    }
}
