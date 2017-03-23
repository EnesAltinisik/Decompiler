package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.zzrp;
import com.google.android.gms.internal.zzrp.zza;
import java.util.concurrent.TimeUnit;

public class SessionStartRequest extends AbstractSafeParcelable {
    public static final Creator<SessionStartRequest> CREATOR = new zzaa();
    private final int mVersionCode;
    private final Session zzaCL;
    private final zzrp zzaHq;

    SessionStartRequest(int i, Session session, IBinder iBinder) {
        this.mVersionCode = i;
        this.zzaCL = session;
        this.zzaHq = zza.zzbZ(iBinder);
    }

    public SessionStartRequest(Session session, zzrp com_google_android_gms_internal_zzrp) {
        zzaa.zzb(session.getStartTime(TimeUnit.MILLISECONDS) < System.currentTimeMillis(), (Object) "Cannot start a session in the future");
        zzaa.zzb(session.isOngoing(), (Object) "Cannot start a session which has already ended");
        this.mVersionCode = 3;
        this.zzaCL = session;
        this.zzaHq = com_google_android_gms_internal_zzrp;
    }

    private boolean zzb(SessionStartRequest sessionStartRequest) {
        return zzz.equal(this.zzaCL, sessionStartRequest.zzaCL);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof SessionStartRequest) && zzb((SessionStartRequest) obj));
    }

    public IBinder getCallbackBinder() {
        return this.zzaHq == null ? null : this.zzaHq.asBinder();
    }

    public Session getSession() {
        return this.zzaCL;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaCL);
    }

    public String toString() {
        return zzz.zzy(this).zzg("session", this.zzaCL).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzaa.zza(this, parcel, i);
    }
}
