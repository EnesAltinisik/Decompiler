package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.internal.zzrp;
import com.google.android.gms.internal.zzrp.zza;

public class ClaimBleDeviceRequest extends AbstractSafeParcelable {
    public static final Creator<ClaimBleDeviceRequest> CREATOR = new zzb();
    private final int mVersionCode;
    private final String zzaHo;
    private final BleDevice zzaHp;
    private final zzrp zzaHq;

    ClaimBleDeviceRequest(int i, String str, BleDevice bleDevice, IBinder iBinder) {
        this.mVersionCode = i;
        this.zzaHo = str;
        this.zzaHp = bleDevice;
        this.zzaHq = zza.zzbZ(iBinder);
    }

    public ClaimBleDeviceRequest(String str, BleDevice bleDevice, zzrp com_google_android_gms_internal_zzrp) {
        this.mVersionCode = 4;
        this.zzaHo = str;
        this.zzaHp = bleDevice;
        this.zzaHq = com_google_android_gms_internal_zzrp;
    }

    public IBinder getCallbackBinder() {
        return this.zzaHq == null ? null : this.zzaHq.asBinder();
    }

    public String getDeviceAddress() {
        return this.zzaHo;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public String toString() {
        return String.format("ClaimBleDeviceRequest{%s %s}", new Object[]{this.zzaHo, this.zzaHp});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }

    public BleDevice zzxU() {
        return this.zzaHp;
    }
}
