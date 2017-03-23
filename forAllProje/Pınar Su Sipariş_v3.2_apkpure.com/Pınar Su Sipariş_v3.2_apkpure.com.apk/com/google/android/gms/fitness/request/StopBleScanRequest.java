package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.request.zzq.zza;
import com.google.android.gms.internal.zzrp;

public class StopBleScanRequest extends AbstractSafeParcelable {
    public static final Creator<StopBleScanRequest> CREATOR = new zzae();
    private final int mVersionCode;
    private final zzrp zzaHq;
    private final zzq zzaIn;

    StopBleScanRequest(int i, IBinder iBinder, IBinder iBinder2) {
        this.mVersionCode = i;
        this.zzaIn = zza.zzcc(iBinder);
        this.zzaHq = zzrp.zza.zzbZ(iBinder2);
    }

    public StopBleScanRequest(BleScanCallback bleScanCallback, zzrp com_google_android_gms_internal_zzrp) {
        this(zza.zza.zzxT().zzb(bleScanCallback), com_google_android_gms_internal_zzrp);
    }

    public StopBleScanRequest(zzq com_google_android_gms_fitness_request_zzq, zzrp com_google_android_gms_internal_zzrp) {
        this.mVersionCode = 3;
        this.zzaIn = com_google_android_gms_fitness_request_zzq;
        this.zzaHq = com_google_android_gms_internal_zzrp;
    }

    public IBinder getCallbackBinder() {
        return this.zzaHq == null ? null : this.zzaHq.asBinder();
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzae.zza(this, parcel, i);
    }

    public IBinder zzyq() {
        return this.zzaIn.asBinder();
    }
}
