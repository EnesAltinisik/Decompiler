package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.zzg.zza;

public final class PublishRequest extends AbstractSafeParcelable {
    public static final Creator<PublishRequest> CREATOR = new zzs();
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
    public final MessageWrapper zzbki;
    public final Strategy zzbkj;
    @Deprecated
    public final boolean zzbkk;
    public final zzi zzbkl;

    PublishRequest(int i, MessageWrapper messageWrapper, Strategy strategy, IBinder iBinder, String str, String str2, boolean z, IBinder iBinder2, boolean z2, ClientAppContext clientAppContext) {
        this.mVersionCode = i;
        this.zzbki = messageWrapper;
        this.zzbkj = strategy;
        this.zzbjI = zza.zzdH(iBinder);
        this.zzbiR = str;
        this.zzbjE = str2;
        this.zzbkk = z;
        this.zzbkl = iBinder2 == null ? null : zzi.zza.zzdJ(iBinder2);
        this.zzbiS = z2;
        this.zzbjJ = ClientAppContext.zza(clientAppContext, str2, str, z2);
    }

    PublishRequest(MessageWrapper messageWrapper, Strategy strategy, IBinder iBinder, IBinder iBinder2) {
        this(2, messageWrapper, strategy, iBinder, null, null, false, iBinder2, false, null);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzs.zza(this, parcel, i);
    }

    IBinder zzHY() {
        return this.zzbkl == null ? null : this.zzbkl.asBinder();
    }

    IBinder zzHy() {
        return this.zzbjI.asBinder();
    }
}
