package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.zzql;
import com.google.android.gms.internal.zzqp;
import com.google.android.gms.internal.zzrp;
import com.google.android.gms.internal.zzrp.zza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SessionInsertRequest extends AbstractSafeParcelable {
    public static final Creator<SessionInsertRequest> CREATOR = new zzx();
    private final int mVersionCode;
    private final Session zzaCL;
    private final List<DataSet> zzaCU;
    private final zzrp zzaHq;
    private final List<DataPoint> zzaIf;

    public static class Builder {
        private Session zzaCL;
        private List<DataSet> zzaCU = new ArrayList();
        private List<DataPoint> zzaIf = new ArrayList();
        private List<DataSource> zzaIg = new ArrayList();

        private void zzf(DataPoint dataPoint) {
            zzh(dataPoint);
            zzg(dataPoint);
        }

        private void zzg(DataPoint dataPoint) {
            long startTime = this.zzaCL.getStartTime(TimeUnit.NANOSECONDS);
            long endTime = this.zzaCL.getEndTime(TimeUnit.NANOSECONDS);
            long startTime2 = dataPoint.getStartTime(TimeUnit.NANOSECONDS);
            long endTime2 = dataPoint.getEndTime(TimeUnit.NANOSECONDS);
            if (startTime2 != 0 && endTime2 != 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (endTime2 > endTime) {
                    endTime2 = zzql.zza(endTime2, TimeUnit.NANOSECONDS, timeUnit);
                }
                boolean z = startTime2 >= startTime && endTime2 <= endTime;
                zzaa.zza(z, "Data point %s has start and end times outside session interval [%d, %d]", dataPoint, Long.valueOf(startTime), Long.valueOf(endTime));
                if (endTime2 != dataPoint.getEndTime(TimeUnit.NANOSECONDS)) {
                    Log.w("Fitness", String.format("Data point end time [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", new Object[]{Long.valueOf(dataPoint.getEndTime(TimeUnit.NANOSECONDS)), Long.valueOf(endTime2), timeUnit}));
                    dataPoint.setTimeInterval(startTime2, endTime2, TimeUnit.NANOSECONDS);
                }
            }
        }

        private void zzh(DataPoint dataPoint) {
            long startTime = this.zzaCL.getStartTime(TimeUnit.NANOSECONDS);
            long endTime = this.zzaCL.getEndTime(TimeUnit.NANOSECONDS);
            long timestamp = dataPoint.getTimestamp(TimeUnit.NANOSECONDS);
            if (timestamp != 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (timestamp < startTime || timestamp > endTime) {
                    timestamp = zzql.zza(timestamp, TimeUnit.NANOSECONDS, timeUnit);
                }
                boolean z = timestamp >= startTime && timestamp <= endTime;
                zzaa.zza(z, "Data point %s has time stamp outside session interval [%d, %d]", dataPoint, Long.valueOf(startTime), Long.valueOf(endTime));
                if (dataPoint.getTimestamp(TimeUnit.NANOSECONDS) != timestamp) {
                    Log.w("Fitness", String.format("Data point timestamp [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", new Object[]{Long.valueOf(dataPoint.getTimestamp(TimeUnit.NANOSECONDS)), Long.valueOf(timestamp), timeUnit}));
                    dataPoint.setTimestamp(timestamp, TimeUnit.NANOSECONDS);
                }
            }
        }

        private void zzyn() {
            for (DataSet dataPoints : this.zzaCU) {
                for (DataPoint zzf : dataPoints.getDataPoints()) {
                    zzf(zzf);
                }
            }
            for (DataPoint zzf2 : this.zzaIf) {
                zzf(zzf2);
            }
        }

        public Builder addAggregateDataPoint(DataPoint dataPoint) {
            zzaa.zzb(dataPoint != null, (Object) "Must specify a valid aggregate data point.");
            DataSource dataSource = dataPoint.getDataSource();
            zzaa.zza(!this.zzaIg.contains(dataSource), "Data set/Aggregate data point for this data source %s is already added.", dataSource);
            zzqp.zze(dataPoint);
            this.zzaIg.add(dataSource);
            this.zzaIf.add(dataPoint);
            return this;
        }

        public Builder addDataSet(DataSet dataSet) {
            boolean z = true;
            zzaa.zzb(dataSet != null, (Object) "Must specify a valid data set.");
            DataSource dataSource = dataSet.getDataSource();
            zzaa.zza(!this.zzaIg.contains(dataSource), "Data set for this data source %s is already added.", dataSource);
            if (dataSet.getDataPoints().isEmpty()) {
                z = false;
            }
            zzaa.zzb(z, (Object) "No data points specified in the input data set.");
            this.zzaIg.add(dataSource);
            this.zzaCU.add(dataSet);
            return this;
        }

        public SessionInsertRequest build() {
            boolean z = true;
            zzaa.zza(this.zzaCL != null, (Object) "Must specify a valid session.");
            if (this.zzaCL.getEndTime(TimeUnit.MILLISECONDS) == 0) {
                z = false;
            }
            zzaa.zza(z, (Object) "Must specify a valid end time, cannot insert a continuing session.");
            zzyn();
            return new SessionInsertRequest();
        }

        public Builder setSession(Session session) {
            this.zzaCL = session;
            return this;
        }
    }

    SessionInsertRequest(int i, Session session, List<DataSet> list, List<DataPoint> list2, IBinder iBinder) {
        this.mVersionCode = i;
        this.zzaCL = session;
        this.zzaCU = Collections.unmodifiableList(list);
        this.zzaIf = Collections.unmodifiableList(list2);
        this.zzaHq = zza.zzbZ(iBinder);
    }

    public SessionInsertRequest(Session session, List<DataSet> list, List<DataPoint> list2, zzrp com_google_android_gms_internal_zzrp) {
        this.mVersionCode = 3;
        this.zzaCL = session;
        this.zzaCU = Collections.unmodifiableList(list);
        this.zzaIf = Collections.unmodifiableList(list2);
        this.zzaHq = com_google_android_gms_internal_zzrp;
    }

    private SessionInsertRequest(Builder builder) {
        this(builder.zzaCL, builder.zzaCU, builder.zzaIf, null);
    }

    public SessionInsertRequest(SessionInsertRequest sessionInsertRequest, zzrp com_google_android_gms_internal_zzrp) {
        this(sessionInsertRequest.zzaCL, sessionInsertRequest.zzaCU, sessionInsertRequest.zzaIf, com_google_android_gms_internal_zzrp);
    }

    private boolean zzb(SessionInsertRequest sessionInsertRequest) {
        return zzz.equal(this.zzaCL, sessionInsertRequest.zzaCL) && zzz.equal(this.zzaCU, sessionInsertRequest.zzaCU) && zzz.equal(this.zzaIf, sessionInsertRequest.zzaIf);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof SessionInsertRequest) && zzb((SessionInsertRequest) obj));
    }

    public List<DataPoint> getAggregateDataPoints() {
        return this.zzaIf;
    }

    public IBinder getCallbackBinder() {
        return this.zzaHq == null ? null : this.zzaHq.asBinder();
    }

    public List<DataSet> getDataSets() {
        return this.zzaCU;
    }

    public Session getSession() {
        return this.zzaCL;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaCL, this.zzaCU, this.zzaIf);
    }

    public String toString() {
        return zzz.zzy(this).zzg("session", this.zzaCL).zzg("dataSets", this.zzaCU).zzg("aggregateDataPoints", this.zzaIf).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzx.zza(this, parcel, i);
    }
}
