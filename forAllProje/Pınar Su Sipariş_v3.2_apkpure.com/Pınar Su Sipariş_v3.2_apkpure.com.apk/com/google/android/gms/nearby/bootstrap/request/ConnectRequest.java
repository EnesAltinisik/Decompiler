package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzss;
import com.google.android.gms.internal.zzss.zza;
import com.google.android.gms.internal.zzst;
import com.google.android.gms.internal.zzsu;
import com.google.android.gms.nearby.bootstrap.Device;

public class ConnectRequest extends AbstractSafeParcelable {
    public static final zza CREATOR = new zza();
    private final String description;
    private final String name;
    private final long timeoutMillis;
    final int versionCode;
    private final byte zzbhK;
    private final Device zzbhL;
    private final zzss zzbhM;
    private final zzst zzbhN;
    private final zzsu zzbhO;
    private final String zzbhP;
    private final byte zzbhQ;
    private final byte zzbhR;

    ConnectRequest(int i, Device device, String str, String str2, byte b, long j, String str3, byte b2, byte b3, IBinder iBinder, IBinder iBinder2, IBinder iBinder3) {
        this.versionCode = i;
        this.zzbhL = (Device) zzaa.zzz(device);
        this.name = zzaa.zzdl(str);
        this.description = (String) zzaa.zzz(str2);
        this.zzbhK = b;
        this.timeoutMillis = j;
        this.zzbhQ = b2;
        this.zzbhR = b3;
        this.zzbhP = str3;
        zzaa.zzz(iBinder);
        this.zzbhM = zza.zzdy(iBinder);
        zzaa.zzz(iBinder2);
        this.zzbhN = zzst.zza.zzdz(iBinder2);
        zzaa.zzz(iBinder3);
        this.zzbhO = zzsu.zza.zzdA(iBinder3);
    }

    public IBinder getCallbackBinder() {
        return this.zzbhO == null ? null : this.zzbhO.asBinder();
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public String getToken() {
        return this.zzbhP;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza com_google_android_gms_nearby_bootstrap_request_zza = CREATOR;
        zza.zza(this, parcel, i);
    }

    public byte zzHn() {
        return this.zzbhK;
    }

    public Device zzHp() {
        return this.zzbhL;
    }

    public long zzHq() {
        return this.timeoutMillis;
    }

    public byte zzHr() {
        return this.zzbhQ;
    }

    public byte zzHs() {
        return this.zzbhR;
    }

    public IBinder zzHt() {
        return this.zzbhM == null ? null : this.zzbhM.asBinder();
    }

    public IBinder zzHu() {
        return this.zzbhN == null ? null : this.zzbhN.asBinder();
    }
}
