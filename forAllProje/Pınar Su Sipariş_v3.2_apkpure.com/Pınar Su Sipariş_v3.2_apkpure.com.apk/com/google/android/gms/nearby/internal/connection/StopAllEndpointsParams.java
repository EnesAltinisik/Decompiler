package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class StopAllEndpointsParams extends AbstractSafeParcelable {
    public static final Creator<StopAllEndpointsParams> CREATOR = new zzr();
    final int versionCode;
    private final long zzbie;

    StopAllEndpointsParams(int i, long j) {
        this.versionCode = i;
        this.zzbie = j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzr.zza(this, parcel, i);
    }

    public long zzHA() {
        return this.zzbie;
    }
}
