package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.zzk;
import com.google.android.gms.fitness.data.zzk.zza;
import com.google.android.gms.internal.zzrp;

public class SensorUnregistrationRequest extends AbstractSafeParcelable {
    public static final Creator<SensorUnregistrationRequest> CREATOR = new zzw();
    private final PendingIntent mPendingIntent;
    private final int mVersionCode;
    private final zzk zzaHU;
    private final zzrp zzaHq;

    SensorUnregistrationRequest(int i, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2) {
        this.mVersionCode = i;
        this.zzaHU = iBinder == null ? null : zza.zzbB(iBinder);
        this.mPendingIntent = pendingIntent;
        this.zzaHq = zzrp.zza.zzbZ(iBinder2);
    }

    public SensorUnregistrationRequest(zzk com_google_android_gms_fitness_data_zzk, PendingIntent pendingIntent, zzrp com_google_android_gms_internal_zzrp) {
        this.mVersionCode = 4;
        this.zzaHU = com_google_android_gms_fitness_data_zzk;
        this.mPendingIntent = pendingIntent;
        this.zzaHq = com_google_android_gms_internal_zzrp;
    }

    public IBinder getCallbackBinder() {
        return this.zzaHq == null ? null : this.zzaHq.asBinder();
    }

    public PendingIntent getIntent() {
        return this.mPendingIntent;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public String toString() {
        return String.format("SensorUnregistrationRequest{%s}", new Object[]{this.zzaHU});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzw.zza(this, parcel, i);
    }

    IBinder zzyl() {
        return this.zzaHU == null ? null : this.zzaHU.asBinder();
    }
}
