package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzsu;
import com.google.android.gms.internal.zzsu.zza;

public class DisableTargetRequest extends AbstractSafeParcelable {
    public static final zzc CREATOR = new zzc();
    final int versionCode;
    private final zzsu zzbhO;

    DisableTargetRequest(int i, IBinder iBinder) {
        this.versionCode = i;
        zzaa.zzz(iBinder);
        this.zzbhO = zza.zzdA(iBinder);
    }

    public IBinder getCallbackBinder() {
        return this.zzbhO == null ? null : this.zzbhO.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc com_google_android_gms_nearby_bootstrap_request_zzc = CREATOR;
        zzc.zza(this, parcel, i);
    }
}
