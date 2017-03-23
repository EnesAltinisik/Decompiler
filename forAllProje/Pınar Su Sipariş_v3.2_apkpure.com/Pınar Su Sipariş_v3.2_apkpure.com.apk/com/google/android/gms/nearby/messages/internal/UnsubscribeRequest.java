package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.internal.zzf.zza;

public final class UnsubscribeRequest extends AbstractSafeParcelable {
    public static final Creator<UnsubscribeRequest> CREATOR = new zzw();
    final int mVersionCode;
    @Deprecated
    public final String zzbiR;
    @Deprecated
    public final boolean zzbiS;
    @Deprecated
    public final String zzbjE;
    public final zzg zzbjI;
    @Deprecated
    public final ClientAppContext zzbjJ;
    public final zzf zzbko;
    public final PendingIntent zzbkq;
    public final int zzbkr;

    UnsubscribeRequest(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, int i2, String str, String str2, boolean z, ClientAppContext clientAppContext) {
        this.mVersionCode = i;
        this.zzbko = zza.zzdG(iBinder);
        this.zzbjI = zzg.zza.zzdH(iBinder2);
        this.zzbkq = pendingIntent;
        this.zzbkr = i2;
        this.zzbiR = str;
        this.zzbjE = str2;
        this.zzbiS = z;
        this.zzbjJ = ClientAppContext.zza(clientAppContext, str2, str, z);
    }

    public UnsubscribeRequest(IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, int i) {
        this(1, iBinder, iBinder2, pendingIntent, i, null, null, false, null);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzw.zza(this, parcel, i);
    }

    IBinder zzHy() {
        return this.zzbjI.asBinder();
    }

    IBinder zzIa() {
        return this.zzbko == null ? null : this.zzbko.asBinder();
    }
}
