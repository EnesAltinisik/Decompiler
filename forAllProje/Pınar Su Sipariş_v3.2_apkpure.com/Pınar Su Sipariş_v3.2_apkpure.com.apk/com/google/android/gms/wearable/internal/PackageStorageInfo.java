package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PackageStorageInfo extends AbstractSafeParcelable {
    public static final Creator<PackageStorageInfo> CREATOR = new zzbe();
    public final String label;
    public final String packageName;
    public final int versionCode;
    public final long zzbDG;

    PackageStorageInfo(int i, String str, String str2, long j) {
        this.versionCode = i;
        this.packageName = str;
        this.label = str2;
        this.zzbDG = j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbe.zza(this, parcel, i);
    }
}
