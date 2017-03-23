package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.internal.zzrp;
import com.google.android.gms.internal.zzrp.zza;

public class SessionUnregistrationRequest extends AbstractSafeParcelable {
    public static final Creator<SessionUnregistrationRequest> CREATOR = new zzac();
    private final PendingIntent mPendingIntent;
    private final int mVersionCode;
    private final zzrp zzaHq;

    SessionUnregistrationRequest(int i, PendingIntent pendingIntent, IBinder iBinder) {
        this.mVersionCode = i;
        this.mPendingIntent = pendingIntent;
        this.zzaHq = zza.zzbZ(iBinder);
    }

    public SessionUnregistrationRequest(PendingIntent pendingIntent, zzrp com_google_android_gms_internal_zzrp) {
        this.mVersionCode = 5;
        this.mPendingIntent = pendingIntent;
        this.zzaHq = com_google_android_gms_internal_zzrp;
    }

    private boolean zzb(SessionUnregistrationRequest sessionUnregistrationRequest) {
        return zzz.equal(this.mPendingIntent, sessionUnregistrationRequest.mPendingIntent);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SessionUnregistrationRequest) && zzb((SessionUnregistrationRequest) obj));
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
        return zzz.zzy(this).zzg("pendingIntent", this.mPendingIntent).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzac.zza(this, parcel, i);
    }
}
