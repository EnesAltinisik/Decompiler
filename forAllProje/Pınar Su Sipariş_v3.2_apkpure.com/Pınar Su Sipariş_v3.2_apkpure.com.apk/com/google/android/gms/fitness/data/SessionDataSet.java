package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;

public class SessionDataSet extends AbstractSafeParcelable {
    public static final Creator<SessionDataSet> CREATOR = new zzr();
    final int mVersionCode;
    private final Session zzaCL;
    private final DataSet zzaEa;

    SessionDataSet(int i, Session session, DataSet dataSet) {
        this.mVersionCode = i;
        this.zzaCL = session;
        this.zzaEa = dataSet;
    }

    private boolean zza(SessionDataSet sessionDataSet) {
        return zzz.equal(this.zzaCL, sessionDataSet.zzaCL) && zzz.equal(this.zzaEa, sessionDataSet.zzaEa);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof SessionDataSet) && zza((SessionDataSet) obj));
    }

    public DataSet getDataSet() {
        return this.zzaEa;
    }

    public Session getSession() {
        return this.zzaCL;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaCL, this.zzaEa);
    }

    public String toString() {
        return zzz.zzy(this).zzg("session", this.zzaCL).zzg("dataSet", this.zzaEa).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzr.zza(this, parcel, i);
    }
}
