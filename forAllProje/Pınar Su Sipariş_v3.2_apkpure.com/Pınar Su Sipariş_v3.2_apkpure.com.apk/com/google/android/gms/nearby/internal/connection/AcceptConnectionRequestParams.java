package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.internal.connection.zzi.zza;

public final class AcceptConnectionRequestParams extends AbstractSafeParcelable {
    public static final Creator<AcceptConnectionRequestParams> CREATOR = new zzb();
    final int versionCode;
    private final zzi zzbib;
    private final String zzbic;
    private final byte[] zzbid;
    private final long zzbie;

    AcceptConnectionRequestParams(int i, IBinder iBinder, String str, byte[] bArr, long j) {
        this.versionCode = i;
        this.zzbib = zza.zzdE(iBinder);
        this.zzbic = str;
        this.zzbid = bArr;
        this.zzbie = j;
    }

    public byte[] getPayload() {
        return this.zzbid;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }

    public long zzHA() {
        return this.zzbie;
    }

    public IBinder zzHy() {
        return this.zzbib == null ? null : this.zzbib.asBinder();
    }

    public String zzHz() {
        return this.zzbic;
    }
}
