package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.nearby.internal.connection.zzi.zza;

public final class StartDiscoveryParams extends AbstractSafeParcelable {
    public static final Creator<StartDiscoveryParams> CREATOR = new zzp();
    private final long durationMillis;
    final int versionCode;
    private final Strategy zzbhT;
    private final String zzbiJ;
    private final zzi zzbib;
    private final long zzbie;

    StartDiscoveryParams(int i, IBinder iBinder, String str, long j, Strategy strategy, long j2) {
        this.versionCode = i;
        this.zzbib = zza.zzdE(iBinder);
        this.zzbiJ = str;
        this.durationMillis = j;
        this.zzbhT = strategy;
        this.zzbie = j2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzp.zza(this, parcel, i);
    }

    public long zzHA() {
        return this.zzbie;
    }

    public String zzHI() {
        return this.zzbiJ;
    }

    public Strategy zzHw() {
        return this.zzbhT;
    }

    public IBinder zzHy() {
        return this.zzbib == null ? null : this.zzbib.asBinder();
    }

    public long zzuD() {
        return this.durationMillis;
    }
}
