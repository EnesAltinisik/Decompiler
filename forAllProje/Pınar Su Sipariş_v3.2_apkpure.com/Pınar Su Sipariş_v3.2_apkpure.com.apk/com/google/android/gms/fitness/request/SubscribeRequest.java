package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.internal.zzrp;
import com.google.android.gms.internal.zzrp.zza;

public class SubscribeRequest extends AbstractSafeParcelable {
    public static final Creator<SubscribeRequest> CREATOR = new zzaf();
    private final int mVersionCode;
    private final zzrp zzaHq;
    private Subscription zzaIp;
    private final boolean zzaIq;

    SubscribeRequest(int i, Subscription subscription, boolean z, IBinder iBinder) {
        this.mVersionCode = i;
        this.zzaIp = subscription;
        this.zzaIq = z;
        this.zzaHq = zza.zzbZ(iBinder);
    }

    public SubscribeRequest(Subscription subscription, boolean z, zzrp com_google_android_gms_internal_zzrp) {
        this.mVersionCode = 3;
        this.zzaIp = subscription;
        this.zzaIq = z;
        this.zzaHq = com_google_android_gms_internal_zzrp;
    }

    public IBinder getCallbackBinder() {
        return this.zzaHq == null ? null : this.zzaHq.asBinder();
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public String toString() {
        return zzz.zzy(this).zzg("subscription", this.zzaIp).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzaf.zza(this, parcel, i);
    }

    public Subscription zzyr() {
        return this.zzaIp;
    }

    public boolean zzys() {
        return this.zzaIq;
    }
}
