package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class StorageInfoResponse extends AbstractSafeParcelable {
    public static final Creator<StorageInfoResponse> CREATOR = new zzbl();
    public final int statusCode;
    public final int versionCode;
    public final long zzbDG;
    public final List<PackageStorageInfo> zzbDI;

    StorageInfoResponse(int i, int i2, long j, List<PackageStorageInfo> list) {
        this.versionCode = i;
        this.statusCode = i2;
        this.zzbDG = j;
        this.zzbDI = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbl.zza(this, parcel, i);
    }
}
