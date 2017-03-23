package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.internal.zzrp;
import com.google.android.gms.internal.zzrp.zza;
import java.util.concurrent.TimeUnit;

public class DataUpdateRequest extends AbstractSafeParcelable {
    public static final Creator<DataUpdateRequest> CREATOR = new zzm();
    private final int mVersionCode;
    private final long zzXy;
    private final long zzaCJ;
    private final DataSet zzaEa;
    private final zzrp zzaHq;

    public static class Builder {
        private long zzXy;
        private long zzaCJ;
        private DataSet zzaEa;

        private void zzyf() {
            zzaa.zza(this.zzXy, (Object) "Must set a non-zero value for startTimeMillis/startTime");
            zzaa.zza(this.zzaCJ, (Object) "Must set a non-zero value for endTimeMillis/endTime");
            zzaa.zzb(this.zzaEa, (Object) "Must set the data set");
            for (DataPoint dataPoint : this.zzaEa.getDataPoints()) {
                long startTime = dataPoint.getStartTime(TimeUnit.MILLISECONDS);
                long endTime = dataPoint.getEndTime(TimeUnit.MILLISECONDS);
                int i = (startTime > endTime || ((startTime != 0 && startTime < this.zzXy) || ((startTime != 0 && startTime > this.zzaCJ) || endTime > this.zzaCJ || endTime < this.zzXy))) ? 1 : 0;
                zzaa.zza(i == 0, "Data Point's startTimeMillis %d, endTimeMillis %d should lie between timeRange provided in the request. StartTimeMillis %d, EndTimeMillis: %d", Long.valueOf(startTime), Long.valueOf(endTime), Long.valueOf(this.zzXy), Long.valueOf(this.zzaCJ));
            }
        }

        public DataUpdateRequest build() {
            zzyf();
            return new DataUpdateRequest();
        }

        public Builder setDataSet(DataSet dataSet) {
            zzaa.zzb((Object) dataSet, (Object) "Must set the data set");
            this.zzaEa = dataSet;
            return this;
        }

        public Builder setTimeInterval(long j, long j2, TimeUnit timeUnit) {
            zzaa.zzb(j > 0, "Invalid start time :%d", Long.valueOf(j));
            zzaa.zzb(j2 >= j, "Invalid end time :%d", Long.valueOf(j2));
            this.zzXy = timeUnit.toMillis(j);
            this.zzaCJ = timeUnit.toMillis(j2);
            return this;
        }
    }

    DataUpdateRequest(int i, long j, long j2, DataSet dataSet, IBinder iBinder) {
        this.mVersionCode = i;
        this.zzXy = j;
        this.zzaCJ = j2;
        this.zzaEa = dataSet;
        this.zzaHq = zza.zzbZ(iBinder);
    }

    public DataUpdateRequest(long j, long j2, DataSet dataSet, IBinder iBinder) {
        this.mVersionCode = 1;
        this.zzXy = j;
        this.zzaCJ = j2;
        this.zzaEa = dataSet;
        this.zzaHq = zza.zzbZ(iBinder);
    }

    private DataUpdateRequest(Builder builder) {
        this(builder.zzXy, builder.zzaCJ, builder.zzaEa, null);
    }

    public DataUpdateRequest(DataUpdateRequest dataUpdateRequest, IBinder iBinder) {
        this(dataUpdateRequest.zzoq(), dataUpdateRequest.zzxn(), dataUpdateRequest.getDataSet(), iBinder);
    }

    private boolean zzb(DataUpdateRequest dataUpdateRequest) {
        return this.zzXy == dataUpdateRequest.zzXy && this.zzaCJ == dataUpdateRequest.zzaCJ && zzz.equal(this.zzaEa, dataUpdateRequest.zzaEa);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof DataUpdateRequest) && zzb((DataUpdateRequest) obj));
    }

    public IBinder getCallbackBinder() {
        return this.zzaHq == null ? null : this.zzaHq.asBinder();
    }

    public DataSet getDataSet() {
        return this.zzaEa;
    }

    public long getEndTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzaCJ, TimeUnit.MILLISECONDS);
    }

    public long getStartTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzXy, TimeUnit.MILLISECONDS);
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(Long.valueOf(this.zzXy), Long.valueOf(this.zzaCJ), this.zzaEa);
    }

    public String toString() {
        return zzz.zzy(this).zzg("startTimeMillis", Long.valueOf(this.zzXy)).zzg("endTimeMillis", Long.valueOf(this.zzaCJ)).zzg("dataSet", this.zzaEa).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzm.zza(this, parcel, i);
    }

    public long zzoq() {
        return this.zzXy;
    }

    public long zzxn() {
        return this.zzaCJ;
    }
}
