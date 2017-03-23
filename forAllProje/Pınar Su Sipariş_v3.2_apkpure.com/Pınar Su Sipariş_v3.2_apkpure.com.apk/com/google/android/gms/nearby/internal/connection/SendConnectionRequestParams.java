package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.internal.connection.zzi.zza;

public final class SendConnectionRequestParams extends AbstractSafeParcelable {
    public static final Creator<SendConnectionRequestParams> CREATOR = new zzl();
    private final String name;
    final int versionCode;
    private final zzi zzbib;
    private final String zzbic;
    private final byte[] zzbid;
    private final long zzbie;

    SendConnectionRequestParams(int i, IBinder iBinder, String str, String str2, byte[] bArr, long j) {
        this.versionCode = i;
        this.zzbib = zza.zzdE(iBinder);
        this.name = str;
        this.zzbic = str2;
        this.zzbid = bArr;
        this.zzbie = j;
    }

    public String getName() {
        return this.name;
    }

    public byte[] getPayload() {
        return this.zzbid;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzl.zza(this, parcel, i);
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
