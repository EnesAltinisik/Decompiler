package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzsu;
import com.google.android.gms.internal.zzsu.zza;
import com.google.android.gms.nearby.bootstrap.Device;

public class DisconnectRequest extends AbstractSafeParcelable {
    public static final zzd CREATOR = new zzd();
    final int versionCode;
    private final Device zzbhL;
    private final zzsu zzbhO;

    DisconnectRequest(int i, Device device, IBinder iBinder) {
        this.versionCode = i;
        this.zzbhL = (Device) zzaa.zzz(device);
        zzaa.zzz(iBinder);
        this.zzbhO = zza.zzdA(iBinder);
    }

    public IBinder getCallbackBinder() {
        return this.zzbhO.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzd com_google_android_gms_nearby_bootstrap_request_zzd = CREATOR;
        zzd.zza(this, parcel, i);
    }

    public Device zzHp() {
        return this.zzbhL;
    }
}
