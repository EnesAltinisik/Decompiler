package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.zzrp;
import com.google.android.gms.internal.zzrp.zza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DataDeleteRequest extends AbstractSafeParcelable {
    public static final Creator<DataDeleteRequest> CREATOR = new zzd();
    private final int mVersionCode;
    private final long zzXy;
    private final long zzaCJ;
    private final List<DataType> zzaCS;
    private final zzrp zzaHq;
    private final List<DataSource> zzaHs;
    private final List<Session> zzaHt;
    private final boolean zzaHu;
    private final boolean zzaHv;

    public static class Builder {
        private long zzXy;
        private long zzaCJ;
        private List<DataType> zzaCS = new ArrayList();
        private List<DataSource> zzaHs = new ArrayList();
        private List<Session> zzaHt = new ArrayList();
        private boolean zzaHu = false;
        private boolean zzaHv = false;

        private void zzxX() {
            if (!this.zzaHt.isEmpty()) {
                for (Session session : this.zzaHt) {
                    boolean z = session.getStartTime(TimeUnit.MILLISECONDS) >= this.zzXy && session.getEndTime(TimeUnit.MILLISECONDS) <= this.zzaCJ;
                    zzaa.zza(z, "Session %s is outside the time interval [%d, %d]", session, Long.valueOf(this.zzXy), Long.valueOf(this.zzaCJ));
                }
            }
        }

        public Builder addDataSource(DataSource dataSource) {
            boolean z = true;
            zzaa.zzb(!this.zzaHu, (Object) "All data is already marked for deletion.  addDataSource() cannot be combined with deleteAllData()");
            if (dataSource == null) {
                z = false;
            }
            zzaa.zzb(z, (Object) "Must specify a valid data source");
            if (!this.zzaHs.contains(dataSource)) {
                this.zzaHs.add(dataSource);
            }
            return this;
        }

        public Builder addDataType(DataType dataType) {
            boolean z = true;
            zzaa.zzb(!this.zzaHu, (Object) "All data is already marked for deletion.  addDataType() cannot be combined with deleteAllData()");
            if (dataType == null) {
                z = false;
            }
            zzaa.zzb(z, (Object) "Must specify a valid data type");
            if (!this.zzaCS.contains(dataType)) {
                this.zzaCS.add(dataType);
            }
            return this;
        }

        public Builder addSession(Session session) {
            boolean z = true;
            zzaa.zzb(!this.zzaHv, (Object) "All sessions already marked for deletion.  addSession() cannot be combined with deleteAllSessions()");
            zzaa.zzb(session != null, (Object) "Must specify a valid session");
            if (session.getEndTime(TimeUnit.MILLISECONDS) <= 0) {
                z = false;
            }
            zzaa.zzb(z, (Object) "Cannot delete an ongoing session. Please stop the session prior to deleting it");
            this.zzaHt.add(session);
            return this;
        }

        public DataDeleteRequest build() {
            boolean z = false;
            boolean z2 = this.zzXy > 0 && this.zzaCJ > this.zzXy;
            zzaa.zza(z2, (Object) "Must specify a valid time interval");
            z2 = (!this.zzaHu && this.zzaHs.isEmpty() && this.zzaCS.isEmpty()) ? false : true;
            boolean z3 = this.zzaHv || !this.zzaHt.isEmpty();
            if (z2 || z3) {
                z = true;
            }
            zzaa.zza(z, (Object) "No data or session marked for deletion");
            zzxX();
            return new DataDeleteRequest();
        }

        public Builder deleteAllData() {
            zzaa.zzb(this.zzaCS.isEmpty(), (Object) "Specific data type already added for deletion. deleteAllData() will delete all data types and cannot be combined with addDataType()");
            zzaa.zzb(this.zzaHs.isEmpty(), (Object) "Specific data source already added for deletion. deleteAllData() will delete all data sources and cannot be combined with addDataSource()");
            this.zzaHu = true;
            return this;
        }

        public Builder deleteAllSessions() {
            zzaa.zzb(this.zzaHt.isEmpty(), (Object) "Specific session already added for deletion. deleteAllData() will delete all sessions and cannot be combined with addSession()");
            this.zzaHv = true;
            return this;
        }

        public Builder setTimeInterval(long j, long j2, TimeUnit timeUnit) {
            zzaa.zzb(j > 0, "Invalid start time :%d", Long.valueOf(j));
            zzaa.zzb(j2 > j, "Invalid end time :%d", Long.valueOf(j2));
            this.zzXy = timeUnit.toMillis(j);
            this.zzaCJ = timeUnit.toMillis(j2);
            return this;
        }
    }

    DataDeleteRequest(int i, long j, long j2, List<DataSource> list, List<DataType> list2, List<Session> list3, boolean z, boolean z2, IBinder iBinder) {
        this.mVersionCode = i;
        this.zzXy = j;
        this.zzaCJ = j2;
        this.zzaHs = Collections.unmodifiableList(list);
        this.zzaCS = Collections.unmodifiableList(list2);
        this.zzaHt = list3;
        this.zzaHu = z;
        this.zzaHv = z2;
        this.zzaHq = zza.zzbZ(iBinder);
    }

    public DataDeleteRequest(long j, long j2, List<DataSource> list, List<DataType> list2, List<Session> list3, boolean z, boolean z2, zzrp com_google_android_gms_internal_zzrp) {
        this.mVersionCode = 3;
        this.zzXy = j;
        this.zzaCJ = j2;
        this.zzaHs = Collections.unmodifiableList(list);
        this.zzaCS = Collections.unmodifiableList(list2);
        this.zzaHt = list3;
        this.zzaHu = z;
        this.zzaHv = z2;
        this.zzaHq = com_google_android_gms_internal_zzrp;
    }

    private DataDeleteRequest(Builder builder) {
        this(builder.zzXy, builder.zzaCJ, builder.zzaHs, builder.zzaCS, builder.zzaHt, builder.zzaHu, builder.zzaHv, null);
    }

    public DataDeleteRequest(DataDeleteRequest dataDeleteRequest, zzrp com_google_android_gms_internal_zzrp) {
        this(dataDeleteRequest.zzXy, dataDeleteRequest.zzaCJ, dataDeleteRequest.zzaHs, dataDeleteRequest.zzaCS, dataDeleteRequest.zzaHt, dataDeleteRequest.zzaHu, dataDeleteRequest.zzaHv, com_google_android_gms_internal_zzrp);
    }

    private boolean zzb(DataDeleteRequest dataDeleteRequest) {
        return this.zzXy == dataDeleteRequest.zzXy && this.zzaCJ == dataDeleteRequest.zzaCJ && zzz.equal(this.zzaHs, dataDeleteRequest.zzaHs) && zzz.equal(this.zzaCS, dataDeleteRequest.zzaCS) && zzz.equal(this.zzaHt, dataDeleteRequest.zzaHt) && this.zzaHu == dataDeleteRequest.zzaHu && this.zzaHv == dataDeleteRequest.zzaHv;
    }

    public boolean deleteAllData() {
        return this.zzaHu;
    }

    public boolean deleteAllSessions() {
        return this.zzaHv;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof DataDeleteRequest) && zzb((DataDeleteRequest) obj));
    }

    public IBinder getCallbackBinder() {
        return this.zzaHq == null ? null : this.zzaHq.asBinder();
    }

    public List<DataSource> getDataSources() {
        return this.zzaHs;
    }

    public List<DataType> getDataTypes() {
        return this.zzaCS;
    }

    public long getEndTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzaCJ, TimeUnit.MILLISECONDS);
    }

    public List<Session> getSessions() {
        return this.zzaHt;
    }

    public long getStartTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzXy, TimeUnit.MILLISECONDS);
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(Long.valueOf(this.zzXy), Long.valueOf(this.zzaCJ));
    }

    public String toString() {
        return zzz.zzy(this).zzg("startTimeMillis", Long.valueOf(this.zzXy)).zzg("endTimeMillis", Long.valueOf(this.zzaCJ)).zzg("dataSources", this.zzaHs).zzg("dateTypes", this.zzaCS).zzg("sessions", this.zzaHt).zzg("deleteAllData", Boolean.valueOf(this.zzaHu)).zzg("deleteAllSessions", Boolean.valueOf(this.zzaHv)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzd.zza(this, parcel, i);
    }

    public long zzoq() {
        return this.zzXy;
    }

    public boolean zzxV() {
        return this.zzaHu;
    }

    public boolean zzxW() {
        return this.zzaHv;
    }

    public long zzxn() {
        return this.zzaCJ;
    }
}
