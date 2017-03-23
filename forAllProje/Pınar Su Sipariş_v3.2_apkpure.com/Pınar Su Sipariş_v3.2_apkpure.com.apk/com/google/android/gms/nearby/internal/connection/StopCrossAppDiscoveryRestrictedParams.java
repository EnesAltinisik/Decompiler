package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class StopCrossAppDiscoveryRestrictedParams extends AbstractSafeParcelable {
    public static final Creator<StopCrossAppDiscoveryRestrictedParams> CREATOR = new zzs();
    final int versionCode;
    private final long zzbie;

    StopCrossAppDiscoveryRestrictedParams(int i, long j) {
        this.versionCode = i;
        this.zzbie = j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzs.zza(this, parcel, i);
    }

    public long zzHA() {
        return this.zzbie;
    }
}
