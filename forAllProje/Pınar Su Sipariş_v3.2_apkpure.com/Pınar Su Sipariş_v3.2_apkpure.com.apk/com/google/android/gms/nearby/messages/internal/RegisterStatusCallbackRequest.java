package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.internal.zzg.zza;

public final class RegisterStatusCallbackRequest extends AbstractSafeParcelable {
    public static final Creator<RegisterStatusCallbackRequest> CREATOR = new zzt();
    final int versionCode;
    @Deprecated
    public String zzbiR;
    public final zzg zzbjI;
    @Deprecated
    public final ClientAppContext zzbjJ;
    public final zzj zzbkm;
    public boolean zzbkn;

    RegisterStatusCallbackRequest(int i, IBinder iBinder, IBinder iBinder2, boolean z, String str, ClientAppContext clientAppContext) {
        this.versionCode = i;
        this.zzbjI = zza.zzdH(iBinder);
        this.zzbkm = zzj.zza.zzdK(iBinder2);
        this.zzbkn = z;
        this.zzbiR = str;
        this.zzbjJ = ClientAppContext.zza(clientAppContext, null, str, false);
    }

    RegisterStatusCallbackRequest(IBinder iBinder, IBinder iBinder2) {
        this(1, iBinder, iBinder2, false, null, null);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzt.zza(this, parcel, i);
    }

    IBinder zzHZ() {
        return this.zzbkm.asBinder();
    }

    IBinder zzHy() {
        return this.zzbjI.asBinder();
    }
}
