package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class StopDiscoveryParams extends AbstractSafeParcelable {
    public static final Creator<StopDiscoveryParams> CREATOR = new zzt();
    final int versionCode;
    private final String zzbiJ;
    private final long zzbie;

    StopDiscoveryParams(int i, String str, long j) {
        this.versionCode = i;
        this.zzbiJ = str;
        this.zzbie = j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzt.zza(this, parcel, i);
    }

    public long zzHA() {
        return this.zzbie;
    }

    public String zzHI() {
        return this.zzbiJ;
    }
}
