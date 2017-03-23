package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.data.SessionDataSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SessionReadResult extends AbstractSafeParcelable implements Result {
    public static final Creator<SessionReadResult> CREATOR = new zzj();
    private final int mVersionCode;
    private final List<Session> zzaHt;
    private final List<SessionDataSet> zzaIB;
    private final Status zzaaO;

    SessionReadResult(int i, List<Session> list, List<SessionDataSet> list2, Status status) {
        this.mVersionCode = i;
        this.zzaHt = list;
        this.zzaIB = Collections.unmodifiableList(list2);
        this.zzaaO = status;
    }

    public SessionReadResult(List<Session> list, List<SessionDataSet> list2, Status status) {
        this.mVersionCode = 3;
        this.zzaHt = list;
        this.zzaIB = Collections.unmodifiableList(list2);
        this.zzaaO = status;
    }

    public static SessionReadResult zzY(Status status) {
        return new SessionReadResult(new ArrayList(), new ArrayList(), status);
    }

    private boolean zzb(SessionReadResult sessionReadResult) {
        return this.zzaaO.equals(sessionReadResult.zzaaO) && zzz.equal(this.zzaHt, sessionReadResult.zzaHt) && zzz.equal(this.zzaIB, sessionReadResult.zzaIB);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SessionReadResult) && zzb((SessionReadResult) obj));
    }

    public List<DataSet> getDataSet(Session session) {
        zzaa.zzb(this.zzaHt.contains(session), "Attempting to read data for session %s which was not returned", session);
        List<DataSet> arrayList = new ArrayList();
        for (SessionDataSet sessionDataSet : this.zzaIB) {
            if (zzz.equal(session, sessionDataSet.getSession())) {
                arrayList.add(sessionDataSet.getDataSet());
            }
        }
        return arrayList;
    }

    public List<DataSet> getDataSet(Session session, DataType dataType) {
        zzaa.zzb(this.zzaHt.contains(session), "Attempting to read data for session %s which was not returned", session);
        List<DataSet> arrayList = new ArrayList();
        for (SessionDataSet sessionDataSet : this.zzaIB) {
            if (zzz.equal(session, sessionDataSet.getSession()) && dataType.equals(sessionDataSet.getDataSet().getDataType())) {
                arrayList.add(sessionDataSet.getDataSet());
            }
        }
        return arrayList;
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
        return zzz.hashCode(this.zzaaO, this.zzaHt, this.zzaIB);
    }

    public String toString() {
        return zzz.zzy(this).zzg("status", this.zzaaO).zzg("sessions", this.zzaHt).zzg("sessionDataSets", this.zzaIB).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzj.zza(this, parcel, i);
    }

    public List<SessionDataSet> zzyz() {
        return this.zzaIB;
    }
}
