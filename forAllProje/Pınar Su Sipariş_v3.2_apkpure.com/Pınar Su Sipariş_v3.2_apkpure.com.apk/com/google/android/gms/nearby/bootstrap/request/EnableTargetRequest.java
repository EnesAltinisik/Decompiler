package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzss;
import com.google.android.gms.internal.zzss.zza;
import com.google.android.gms.internal.zzst;
import com.google.android.gms.internal.zzsu;

public class EnableTargetRequest extends AbstractSafeParcelable {
    public static final zze CREATOR = new zze();
    private final String description;
    private final String name;
    final int versionCode;
    private final byte zzbhK;
    private final zzss zzbhM;
    private final zzst zzbhN;
    private final zzsu zzbhO;
    private final byte zzbhR;

    EnableTargetRequest(int i, String str, String str2, byte b, byte b2, IBinder iBinder, IBinder iBinder2, IBinder iBinder3) {
        this.versionCode = i;
        this.name = zzaa.zzdl(str);
        this.description = (String) zzaa.zzz(str2);
        this.zzbhK = b;
        this.zzbhR = b2;
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

    public void writeToParcel(Parcel parcel, int i) {
        zze com_google_android_gms_nearby_bootstrap_request_zze = CREATOR;
        zze.zza(this, parcel, i);
    }

    public byte zzHn() {
        return this.zzbhK;
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
