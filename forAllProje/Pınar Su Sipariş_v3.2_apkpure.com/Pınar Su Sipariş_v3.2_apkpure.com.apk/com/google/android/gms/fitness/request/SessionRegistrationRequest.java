package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.internal.zzrp;
import com.google.android.gms.internal.zzrp.zza;

public class SessionRegistrationRequest extends AbstractSafeParcelable {
    public static final Creator<SessionRegistrationRequest> CREATOR = new zzz();
    private final PendingIntent mPendingIntent;
    private final int mVersionCode;
    private final zzrp zzaHq;
    private final int zzaIl;

    SessionRegistrationRequest(int i, PendingIntent pendingIntent, IBinder iBinder, int i2) {
        this.mVersionCode = i;
        this.mPendingIntent = pendingIntent;
        this.zzaHq = iBinder == null ? null : zza.zzbZ(iBinder);
        this.zzaIl = i2;
    }

    public SessionRegistrationRequest(PendingIntent pendingIntent, zzrp com_google_android_gms_internal_zzrp, int i) {
        this.mVersionCode = 6;
        this.mPendingIntent = pendingIntent;
        this.zzaHq = com_google_android_gms_internal_zzrp;
        this.zzaIl = i;
    }

    private boolean zzb(SessionRegistrationRequest sessionRegistrationRequest) {
        return this.zzaIl == sessionRegistrationRequest.zzaIl && zzz.equal(this.mPendingIntent, sessionRegistrationRequest.mPendingIntent);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SessionRegistrationRequest) && zzb((SessionRegistrationRequest) obj));
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
        return zzz.hashCode(this.mPendingIntent, Integer.valueOf(this.zzaIl));
    }

    public String toString() {
        return zzz.zzy(this).zzg("pendingIntent", this.mPendingIntent).zzg("sessionRegistrationOption", Integer.valueOf(this.zzaIl)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzz.zza(this, parcel, i);
    }

    public int zzyp() {
        return this.zzaIl;
    }
}
