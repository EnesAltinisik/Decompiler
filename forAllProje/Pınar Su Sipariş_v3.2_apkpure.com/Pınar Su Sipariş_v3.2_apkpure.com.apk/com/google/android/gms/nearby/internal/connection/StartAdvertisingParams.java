package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.AppMetadata;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.nearby.internal.connection.zzi.zza;

public final class StartAdvertisingParams extends AbstractSafeParcelable {
    public static final Creator<StartAdvertisingParams> CREATOR = new zzn();
    private final long durationMillis;
    private final String name;
    final int versionCode;
    private final Strategy zzbhT;
    private final AppMetadata zzbiH;
    private final zzi zzbib;
    private final long zzbie;

    StartAdvertisingParams(int i, IBinder iBinder, String str, AppMetadata appMetadata, long j, Strategy strategy, long j2) {
        this.versionCode = i;
        this.zzbib = zza.zzdE(iBinder);
        this.name = str;
        this.zzbiH = appMetadata;
        this.durationMillis = j;
        this.zzbhT = strategy;
        this.zzbie = j2;
    }

    public String getName() {
        return this.name;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzn.zza(this, parcel, i);
    }

    public long zzHA() {
        return this.zzbie;
    }

    public AppMetadata zzHG() {
        return this.zzbiH;
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
