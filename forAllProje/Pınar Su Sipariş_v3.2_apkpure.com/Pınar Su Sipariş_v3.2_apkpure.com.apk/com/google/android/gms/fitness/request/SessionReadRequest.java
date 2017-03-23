package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzrn;
import com.google.android.gms.internal.zzrn.zza;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SessionReadRequest extends AbstractSafeParcelable {
    public static final Creator<SessionReadRequest> CREATOR = new zzy();
    private final int mVersionCode;
    private final String zzPE;
    private final long zzXy;
    private final long zzaCJ;
    private final List<DataType> zzaCS;
    private final boolean zzaHD;
    private final List<DataSource> zzaHs;
    private final String zzaIh;
    private boolean zzaIi;
    private final List<String> zzaIj;
    private final zzrn zzaIk;

    public static class Builder {
        private String zzPE;
        private long zzXy = 0;
        private long zzaCJ = 0;
        private List<DataType> zzaCS = new ArrayList();
        private boolean zzaHD = false;
        private List<DataSource> zzaHs = new ArrayList();
        private String zzaIh;
        private boolean zzaIi = false;
        private List<String> zzaIj = new ArrayList();

        public SessionReadRequest build() {
            zzaa.zzb(this.zzXy > 0, "Invalid start time: %s", Long.valueOf(this.zzXy));
            boolean z = this.zzaCJ > 0 && this.zzaCJ > this.zzXy;
            zzaa.zzb(z, "Invalid end time: %s", Long.valueOf(this.zzaCJ));
            return new SessionReadRequest();
        }

        public Builder enableServerQueries() {
            this.zzaHD = true;
            return this;
        }

        public Builder excludePackage(String str) {
            zzaa.zzb((Object) str, (Object) "Attempting to use a null package name");
            if (!this.zzaIj.contains(str)) {
                this.zzaIj.add(str);
            }
            return this;
        }

        public Builder read(DataSource dataSource) {
            zzaa.zzb((Object) dataSource, (Object) "Attempting to add a null data source");
            if (!this.zzaHs.contains(dataSource)) {
                this.zzaHs.add(dataSource);
            }
            return this;
        }

        public Builder read(DataType dataType) {
            zzaa.zzb((Object) dataType, (Object) "Attempting to use a null data type");
            if (!this.zzaCS.contains(dataType)) {
                this.zzaCS.add(dataType);
            }
            return this;
        }

        public Builder readSessionsFromAllApps() {
            this.zzaIi = true;
            return this;
        }

        public Builder setSessionId(String str) {
            this.zzPE = str;
            return this;
        }

        public Builder setSessionName(String str) {
            this.zzaIh = str;
            return this;
        }

        public Builder setTimeInterval(long j, long j2, TimeUnit timeUnit) {
            this.zzXy = timeUnit.toMillis(j);
            this.zzaCJ = timeUnit.toMillis(j2);
            return this;
        }
    }

    SessionReadRequest(int i, String str, String str2, long j, long j2, List<DataType> list, List<DataSource> list2, boolean z, boolean z2, List<String> list3, IBinder iBinder) {
        this.mVersionCode = i;
        this.zzaIh = str;
        this.zzPE = str2;
        this.zzXy = j;
        this.zzaCJ = j2;
        this.zzaCS = list;
        this.zzaHs = list2;
        this.zzaIi = z;
        this.zzaHD = z2;
        this.zzaIj = list3;
        this.zzaIk = zza.zzbX(iBinder);
    }

    private SessionReadRequest(Builder builder) {
        this(builder.zzaIh, builder.zzPE, builder.zzXy, builder.zzaCJ, builder.zzaCS, builder.zzaHs, builder.zzaIi, builder.zzaHD, builder.zzaIj, null);
    }

    public SessionReadRequest(SessionReadRequest sessionReadRequest, zzrn com_google_android_gms_internal_zzrn) {
        this(sessionReadRequest.zzaIh, sessionReadRequest.zzPE, sessionReadRequest.zzXy, sessionReadRequest.zzaCJ, sessionReadRequest.zzaCS, sessionReadRequest.zzaHs, sessionReadRequest.zzaIi, sessionReadRequest.zzaHD, sessionReadRequest.zzaIj, com_google_android_gms_internal_zzrn);
    }

    public SessionReadRequest(String str, String str2, long j, long j2, List<DataType> list, List<DataSource> list2, boolean z, boolean z2, List<String> list3, zzrn com_google_android_gms_internal_zzrn) {
        this(5, str, str2, j, j2, list, list2, z, z2, list3, com_google_android_gms_internal_zzrn == null ? null : com_google_android_gms_internal_zzrn.asBinder());
    }

    private boolean zzb(SessionReadRequest sessionReadRequest) {
        return zzz.equal(this.zzaIh, sessionReadRequest.zzaIh) && this.zzPE.equals(sessionReadRequest.zzPE) && this.zzXy == sessionReadRequest.zzXy && this.zzaCJ == sessionReadRequest.zzaCJ && zzz.equal(this.zzaCS, sessionReadRequest.zzaCS) && zzz.equal(this.zzaHs, sessionReadRequest.zzaHs) && this.zzaIi == sessionReadRequest.zzaIi && this.zzaIj.equals(sessionReadRequest.zzaIj) && this.zzaHD == sessionReadRequest.zzaHD;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SessionReadRequest) && zzb((SessionReadRequest) obj));
    }

    public IBinder getCallbackBinder() {
        return this.zzaIk == null ? null : this.zzaIk.asBinder();
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

    public List<String> getExcludedPackages() {
        return this.zzaIj;
    }

    public String getSessionId() {
        return this.zzPE;
    }

    public String getSessionName() {
        return this.zzaIh;
    }

    public long getStartTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzXy, TimeUnit.MILLISECONDS);
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaIh, this.zzPE, Long.valueOf(this.zzXy), Long.valueOf(this.zzaCJ));
    }

    public boolean includeSessionsFromAllApps() {
        return this.zzaIi;
    }

    public String toString() {
        return zzz.zzy(this).zzg("sessionName", this.zzaIh).zzg("sessionId", this.zzPE).zzg("startTimeMillis", Long.valueOf(this.zzXy)).zzg("endTimeMillis", Long.valueOf(this.zzaCJ)).zzg("dataTypes", this.zzaCS).zzg("dataSources", this.zzaHs).zzg("sessionsFromAllApps", Boolean.valueOf(this.zzaIi)).zzg("excludedPackages", this.zzaIj).zzg("useServer", Boolean.valueOf(this.zzaHD)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzy.zza(this, parcel, i);
    }

    public long zzoq() {
        return this.zzXy;
    }

    public boolean zzxZ() {
        return this.zzaHD;
    }

    public long zzxn() {
        return this.zzaCJ;
    }

    public boolean zzyo() {
        return this.zzaIi;
    }
}
