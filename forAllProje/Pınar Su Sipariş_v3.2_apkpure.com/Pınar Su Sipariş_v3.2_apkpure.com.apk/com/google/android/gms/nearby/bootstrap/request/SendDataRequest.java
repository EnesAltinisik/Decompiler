package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzsu;
import com.google.android.gms.internal.zzsu.zza;
import com.google.android.gms.nearby.bootstrap.Device;

public class SendDataRequest extends AbstractSafeParcelable {
    public static final zzf CREATOR = new zzf();
    private final byte[] data;
    final int versionCode;
    private final Device zzbhL;
    private final zzsu zzbhO;

    SendDataRequest(int i, Device device, byte[] bArr, IBinder iBinder) {
        this.versionCode = i;
        this.zzbhL = (Device) zzaa.zzz(device);
        this.data = (byte[]) zzaa.zzz(bArr);
        zzaa.zzz(iBinder);
        this.zzbhO = zza.zzdA(iBinder);
    }

    public IBinder getCallbackBinder() {
        return this.zzbhO == null ? null : this.zzbhO.asBinder();
    }

    public byte[] getData() {
        return this.data;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzf com_google_android_gms_nearby_bootstrap_request_zzf = CREATOR;
        zzf.zza(this, parcel, i);
    }

    public Device zzHp() {
        return this.zzbhL;
    }
}
