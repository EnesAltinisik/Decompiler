package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.internal.connection.zzi.zza;

public final class RejectConnectionRequestParams extends AbstractSafeParcelable {
    public static final Creator<RejectConnectionRequestParams> CREATOR = new zzk();
    final int versionCode;
    private final zzi zzbib;
    private final String zzbic;
    private final long zzbie;

    RejectConnectionRequestParams(int i, IBinder iBinder, String str, long j) {
        this.versionCode = i;
        this.zzbib = zza.zzdE(iBinder);
        this.zzbic = str;
        this.zzbie = j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzk.zza(this, parcel, i);
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
