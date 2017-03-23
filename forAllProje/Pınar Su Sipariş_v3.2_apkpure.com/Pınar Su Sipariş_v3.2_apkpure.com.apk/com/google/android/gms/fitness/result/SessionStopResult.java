package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.fitness.data.Session;
import java.util.Collections;
import java.util.List;

public class SessionStopResult extends AbstractSafeParcelable implements Result {
    public static final Creator<SessionStopResult> CREATOR = new zzk();
    private final int mVersionCode;
    private final List<Session> zzaHt;
    private final Status zzaaO;

    SessionStopResult(int i, Status status, List<Session> list) {
        this.mVersionCode = i;
        this.zzaaO = status;
        this.zzaHt = Collections.unmodifiableList(list);
    }

    public SessionStopResult(Status status, List<Session> list) {
        this.mVersionCode = 3;
        this.zzaaO = status;
        this.zzaHt = Collections.unmodifiableList(list);
    }

    public static SessionStopResult zzZ(Status status) {
        return new SessionStopResult(status, Collections.emptyList());
    }

    private boolean zzb(SessionStopResult sessionStopResult) {
        return this.zzaaO.equals(sessionStopResult.zzaaO) && zzz.equal(this.zzaHt, sessionStopResult.zzaHt);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SessionStopResult) && zzb((SessionStopResult) obj));
    }

    public List<Session> getSessions() {
        return this.zzaHt;
    }

    public Status getStatus() {
        return this.zzaaO;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaaO, this.zzaHt);
    }

    public String toString() {
        return zzz.zzy(this).zzg("status", this.zzaaO).zzg("sessions", this.zzaHt).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzk.zza(this, parcel, i);
    }
}
