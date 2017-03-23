package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.zzrp;
import com.google.android.gms.internal.zzrp.zza;

public class UnclaimBleDeviceRequest extends AbstractSafeParcelable {
    public static final Creator<UnclaimBleDeviceRequest> CREATOR = new zzag();
    private final int mVersionCode;
    private final String zzaHo;
    private final zzrp zzaHq;

    UnclaimBleDeviceRequest(int i, String str, IBinder iBinder) {
        this.mVersionCode = i;
        this.zzaHo = str;
        this.zzaHq = zza.zzbZ(iBinder);
    }

    public UnclaimBleDeviceRequest(String str, zzrp com_google_android_gms_internal_zzrp) {
        this.mVersionCode = 5;
        this.zzaHo = str;
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
        return String.format("UnclaimBleDeviceRequest{%s}", new Object[]{this.zzaHo});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzag.zza(this, parcel, i);
    }
}
