package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.internal.connection.zzi.zza;

public final class StartCrossAppDiscoveryRestrictedParams extends AbstractSafeParcelable {
    public static final Creator<StartCrossAppDiscoveryRestrictedParams> CREATOR = new zzo();
    private final long durationMillis;
    final int versionCode;
    private final int zzbiI;
    private final zzi zzbib;
    private final long zzbie;

    StartCrossAppDiscoveryRestrictedParams(int i, IBinder iBinder, int i2, long j, long j2) {
        this.versionCode = i;
        this.zzbib = zza.zzdE(iBinder);
        this.zzbiI = i2;
        this.durationMillis = j;
        this.zzbie = j2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzo.zza(this, parcel, i);
    }

    public long zzHA() {
        return this.zzbie;
    }

    public int zzHH() {
        return this.zzbiI;
    }

    public IBinder zzHy() {
        return this.zzbib == null ? null : this.zzbib.asBinder();
    }

    public long zzuD() {
        return this.durationMillis;
    }
}
