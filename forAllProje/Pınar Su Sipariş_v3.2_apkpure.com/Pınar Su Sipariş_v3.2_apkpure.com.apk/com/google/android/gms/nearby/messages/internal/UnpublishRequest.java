package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.internal.zzg.zza;

public final class UnpublishRequest extends AbstractSafeParcelable {
    public static final Creator<UnpublishRequest> CREATOR = new zzv();
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

    UnpublishRequest(int i, MessageWrapper messageWrapper, IBinder iBinder, String str, String str2, boolean z, ClientAppContext clientAppContext) {
        this.mVersionCode = i;
        this.zzbki = messageWrapper;
        this.zzbjI = zza.zzdH(iBinder);
        this.zzbiR = str;
        this.zzbjE = str2;
        this.zzbiS = z;
        this.zzbjJ = ClientAppContext.zza(clientAppContext, str2, str, z);
    }

    UnpublishRequest(MessageWrapper messageWrapper, IBinder iBinder, ClientAppContext clientAppContext) {
        this(1, messageWrapper, iBinder, null, null, false, clientAppContext);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzv.zza(this, parcel, i);
    }

    IBinder zzHy() {
        return this.zzbjI.asBinder();
    }
}
