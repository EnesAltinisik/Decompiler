package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzsu;
import com.google.android.gms.internal.zzsw;
import com.google.android.gms.internal.zzsw.zza;

public class StartScanRequest extends AbstractSafeParcelable {
    public static final zzg CREATOR = new zzg();
    final int versionCode;
    private final zzsu zzbhO;
    private final byte zzbhR;
    private final zzsw zzbhS;

    StartScanRequest(int i, byte b, IBinder iBinder, IBinder iBinder2) {
        this.versionCode = i;
        this.zzbhR = b;
        zzaa.zzz(iBinder);
        this.zzbhS = zza.zzdC(iBinder);
        zzaa.zzz(iBinder2);
        this.zzbhO = zzsu.zza.zzdA(iBinder2);
    }

    public IBinder getCallbackBinder() {
        return this.zzbhO == null ? null : this.zzbhO.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzg com_google_android_gms_nearby_bootstrap_request_zzg = CREATOR;
        zzg.zza(this, parcel, i);
    }

    public byte zzHs() {
        return this.zzbhR;
    }

    public IBinder zzHv() {
        return this.zzbhS == null ? null : this.zzbhS.asBinder();
    }
}
