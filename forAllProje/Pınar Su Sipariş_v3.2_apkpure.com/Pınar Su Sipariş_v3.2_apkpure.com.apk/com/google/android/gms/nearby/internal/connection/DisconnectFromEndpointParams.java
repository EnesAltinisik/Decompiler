package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class DisconnectFromEndpointParams extends AbstractSafeParcelable {
    public static final Creator<DisconnectFromEndpointParams> CREATOR = new zzf();
    final int versionCode;
    private final String zzbic;
    private final long zzbie;

    DisconnectFromEndpointParams(int i, String str, long j) {
        this.versionCode = i;
        this.zzbic = str;
        this.zzbie = j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzf.zza(this, parcel, i);
    }

    public long zzHA() {
        return this.zzbie;
    }

    public String zzHz() {
        return this.zzbic;
    }
}
