package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzsu;
import com.google.android.gms.internal.zzsu.zza;

public class ContinueConnectRequest extends AbstractSafeParcelable {
    public static final zzb CREATOR = new zzb();
    final int versionCode;
    private final zzsu zzbhO;
    private final String zzbhP;

    ContinueConnectRequest(int i, String str, IBinder iBinder) {
        this.versionCode = i;
        this.zzbhP = (String) zzaa.zzz(str);
        this.zzbhO = zza.zzdA(iBinder);
    }

    public IBinder getCallbackBinder() {
        return this.zzbhO == null ? null : this.zzbhO.asBinder();
    }

    public String getToken() {
        return this.zzbhP;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb com_google_android_gms_nearby_bootstrap_request_zzb = CREATOR;
        zzb.zza(this, parcel, i);
    }
}
