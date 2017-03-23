package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.internal.zzrp;
import com.google.android.gms.internal.zzrp.zza;

public class DataUpdateListenerUnregistrationRequest extends AbstractSafeParcelable {
    public static final Creator<DataUpdateListenerUnregistrationRequest> CREATOR = new zzl();
    private final PendingIntent mPendingIntent;
    private final int mVersionCode;
    private final zzrp zzaHq;

    DataUpdateListenerUnregistrationRequest(int i, PendingIntent pendingIntent, IBinder iBinder) {
        this.mVersionCode = i;
        this.mPendingIntent = pendingIntent;
        this.zzaHq = zza.zzbZ(iBinder);
    }

    private boolean zzb(DataUpdateListenerUnregistrationRequest dataUpdateListenerUnregistrationRequest) {
        return zzz.equal(this.mPendingIntent, dataUpdateListenerUnregistrationRequest.mPendingIntent);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof DataUpdateListenerUnregistrationRequest) && zzb((DataUpdateListenerUnregistrationRequest) obj));
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

    public int hashCode() {
        return zzz.hashCode(this.mPendingIntent);
    }

    public String toString() {
        return "DataUpdateListenerUnregistrationRequest";
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzl.zza(this, parcel, i);
    }
}
