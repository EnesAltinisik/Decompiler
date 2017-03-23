package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Device;
import com.google.android.gms.internal.zzra;
import com.google.android.gms.internal.zzra.zza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DataReadRequest extends AbstractSafeParcelable {
    public static final Creator<DataReadRequest> CREATOR = new zzf();
    public static final int NO_LIMIT = 0;
    private final int mVersionCode;
    private final long zzXy;
    private final long zzaCJ;
    private final List<DataType> zzaCS;
    private final int zzaCV;
    private final DataSource zzaHA;
    private final int zzaHB;
    private final boolean zzaHC;
    private final boolean zzaHD;
    private final zzra zzaHE;
    private final List<Device> zzaHF;
    private final List<DataSource> zzaHs;
    private final List<DataType> zzaHx;
    private final List<DataSource> zzaHy;
    private final long zzaHz;

    public static class Builder {
        private long zzXy;
        private long zzaCJ;
        private List<DataType> zzaCS = new ArrayList();
        private int zzaCV = 0;
        private DataSource zzaHA;
        private int zzaHB = 0;
        private boolean zzaHC = false;
        private boolean zzaHD = false;
        private List<Device> zzaHF = new ArrayList();
        private List<DataSource> zzaHs = new ArrayList();
        private List<DataType> zzaHx = new ArrayList();
        private List<DataSource> zzaHy = new ArrayList();
        private long zzaHz = 0;

        public Builder aggregate(DataSource dataSource, DataType dataType) {
            zzaa.zzb((Object) dataSource, (Object) "Attempting to add a null data source");
            zzaa.zza(!this.zzaHs.contains(dataSource), (Object) "Cannot add the same data source for aggregated and detailed");
            DataType dataType2 = dataSource.getDataType();
            zzaa.zzb(DataType.AGGREGATE_INPUT_TYPES.contains(dataType2), "Unsupported input data type specified for aggregation: %s", dataType2);
            zzaa.zzb(DataType.getAggregatesForInput(dataType2).contains(dataType), "Invalid output aggregate data type specified: %s -> %s", dataType2, dataType);
            if (!this.zzaHy.contains(dataSource)) {
                this.zzaHy.add(dataSource);
            }
            return this;
        }

        public Builder aggregate(DataType dataType, DataType dataType2) {
            zzaa.zzb((Object) dataType, (Object) "Attempting to use a null data type");
            zzaa.zza(!this.zzaCS.contains(dataType), (Object) "Cannot add the same data type as aggregated and detailed");
            zzaa.zzb(DataType.AGGREGATE_INPUT_TYPES.contains(dataType), "Unsupported input data type specified for aggregation: %s", dataType);
            zzaa.zzb(DataType.getAggregatesForInput(dataType).contains(dataType2), "Invalid output aggregate data type specified: %s -> %s", dataType, dataType2);
            if (!this.zzaHx.contains(dataType)) {
                this.zzaHx.add(dataType);
            }
            return this;
        }

        public Builder bucketByActivitySegment(int i, TimeUnit timeUnit) {
            zzaa.zzb(this.zzaCV == 0, "Bucketing strategy already set to %s", Integer.valueOf(this.zzaCV));
            zzaa.zzb(i > 0, "Must specify a valid minimum duration for an activity segment: %d", Integer.valueOf(i));
            this.zzaCV = 4;
            this.zzaHz = timeUnit.toMillis((long) i);
            return this;
        }

        public Builder bucketByActivitySegment(int i, TimeUnit timeUnit, DataSource dataSource) {
            zzaa.zzb(this.zzaCV == 0, "Bucketing strategy already set to %s", Integer.valueOf(this.zzaCV));
            zzaa.zzb(i > 0, "Must specify a valid minimum duration for an activity segment: %d", Integer.valueOf(i));
            zzaa.zzb(dataSource != null, (Object) "Invalid activity data source specified");
            zzaa.zzb(dataSource.getDataType().equals(DataType.TYPE_ACTIVITY_SEGMENT), "Invalid activity data source specified: %s", dataSource);
            this.zzaHA = dataSource;
            this.zzaCV = 4;
            this.zzaHz = timeUnit.toMillis((long) i);
            return this;
        }

        public Builder bucketByActivityType(int i, TimeUnit timeUnit) {
            zzaa.zzb(this.zzaCV == 0, "Bucketing strategy already set to %s", Integer.valueOf(this.zzaCV));
            zzaa.zzb(i > 0, "Must specify a valid minimum duration for an activity segment: %d", Integer.valueOf(i));
            this.zzaCV = 3;
            this.zzaHz = timeUnit.toMillis((long) i);
            return this;
        }

        public Builder bucketByActivityType(int i, TimeUnit timeUnit, DataSource dataSource) {
            zzaa.zzb(this.zzaCV == 0, "Bucketing strategy already set to %s", Integer.valueOf(this.zzaCV));
            zzaa.zzb(i > 0, "Must specify a valid minimum duration for an activity segment: %d", Integer.valueOf(i));
            zzaa.zzb(dataSource != null, (Object) "Invalid activity data source specified");
            zzaa.zzb(dataSource.getDataType().equals(DataType.TYPE_ACTIVITY_SEGMENT), "Invalid activity data source specified: %s", dataSource);
            this.zzaHA = dataSource;
            this.zzaCV = 3;
            this.zzaHz = timeUnit.toMillis((long) i);
            return this;
        }

        public Builder bucketBySession(int i, TimeUnit timeUnit) {
            zzaa.zzb(this.zzaCV == 0, "Bucketing strategy already set to %s", Integer.valueOf(this.zzaCV));
            zzaa.zzb(i > 0, "Must specify a valid minimum duration for an activity segment: %d", Integer.valueOf(i));
            this.zzaCV = 2;
            this.zzaHz = timeUnit.toMillis((long) i);
            return this;
        }

        public Builder bucketByTime(int i, TimeUnit timeUnit) {
            zzaa.zzb(this.zzaCV == 0, "Bucketing strategy already set to %s", Integer.valueOf(this.zzaCV));
            zzaa.zzb(i > 0, "Must specify a valid minimum duration for an activity segment: %d", Integer.valueOf(i));
            this.zzaCV = 1;
            this.zzaHz = timeUnit.toMillis((long) i);
            return this;
        }

        public DataReadRequest build() {
            boolean z = true;
            boolean z2 = (this.zzaHs.isEmpty() && this.zzaCS.isEmpty() && this.zzaHy.isEmpty() && this.zzaHx.isEmpty()) ? false : true;
            zzaa.zza(z2, (Object) "Must add at least one data source (aggregated or detailed)");
            zzaa.zza(this.zzXy > 0, "Invalid start time: %s", Long.valueOf(this.zzXy));
            z2 = this.zzaCJ > 0 && this.zzaCJ > this.zzXy;
            zzaa.zza(z2, "Invalid end time: %s", Long.valueOf(this.zzaCJ));
            z2 = this.zzaHy.isEmpty() && this.zzaHx.isEmpty();
            if (!(z2 && this.zzaCV == 0) && (z2 || this.zzaCV == 0)) {
                z = false;
            }
            zzaa.zza(z, (Object) "Must specify a valid bucketing strategy while requesting aggregation");
            return new DataReadRequest();
        }

        public Builder enableServerQueries() {
            this.zzaHD = true;
            return this;
        }

        public Builder read(DataSource dataSource) {
            zzaa.zzb((Object) dataSource, (Object) "Attempting to add a null data source");
            zzaa.zzb(!this.zzaHy.contains(dataSource), (Object) "Cannot add the same data source as aggregated and detailed");
            if (!this.zzaHs.contains(dataSource)) {
                this.zzaHs.add(dataSource);
            }
            return this;
        }

        public Builder read(DataType dataType) {
            zzaa.zzb((Object) dataType, (Object) "Attempting to use a null data type");
            zzaa.zza(!this.zzaHx.contains(dataType), (Object) "Cannot add the same data type as aggregated and detailed");
            if (!this.zzaCS.contains(dataType)) {
                this.zzaCS.add(dataType);
            }
            return this;
        }

        public Builder setLimit(int i) {
            zzaa.zzb(i > 0, "Invalid limit %d is specified", Integer.valueOf(i));
            this.zzaHB = i;
            return this;
        }

        public Builder setTimeRange(long j, long j2, TimeUnit timeUnit) {
            this.zzXy = timeUnit.toMillis(j);
            this.zzaCJ = timeUnit.toMillis(j2);
            return this;
        }
    }

    DataReadRequest(int i, List<DataType> list, List<DataSource> list2, long j, long j2, List<DataType> list3, List<DataSource> list4, int i2, long j3, DataSource dataSource, int i3, boolean z, boolean z2, IBinder iBinder, List<Device> list5) {
        this.mVersionCode = i;
        this.zzaCS = list;
        this.zzaHs = list2;
        this.zzXy = j;
        this.zzaCJ = j2;
        this.zzaHx = list3;
        this.zzaHy = list4;
        this.zzaCV = i2;
        this.zzaHz = j3;
        this.zzaHA = dataSource;
        this.zzaHB = i3;
        this.zzaHC = z;
        this.zzaHD = z2;
        this.zzaHE = iBinder == null ? null : zza.zzbK(iBinder);
        if (list5 == null) {
            list5 = Collections.emptyList();
        }
        this.zzaHF = list5;
    }

    private DataReadRequest(Builder builder) {
        this(builder.zzaCS, builder.zzaHs, builder.zzXy, builder.zzaCJ, builder.zzaHx, builder.zzaHy, builder.zzaCV, builder.zzaHz, builder.zzaHA, builder.zzaHB, false, builder.zzaHD, null, builder.zzaHF);
    }

    public DataReadRequest(DataReadRequest dataReadRequest, zzra com_google_android_gms_internal_zzra) {
        this(dataReadRequest.zzaCS, dataReadRequest.zzaHs, dataReadRequest.zzXy, dataReadRequest.zzaCJ, dataReadRequest.zzaHx, dataReadRequest.zzaHy, dataReadRequest.zzaCV, dataReadRequest.zzaHz, dataReadRequest.zzaHA, dataReadRequest.zzaHB, dataReadRequest.zzaHC, dataReadRequest.zzaHD, com_google_android_gms_internal_zzra, dataReadRequest.zzaHF);
    }

    public DataReadRequest(List<DataType> list, List<DataSource> list2, long j, long j2, List<DataType> list3, List<DataSource> list4, int i, long j3, DataSource dataSource, int i2, boolean z, boolean z2, zzra com_google_android_gms_internal_zzra, List<Device> list5) {
        this(5, list, list2, j, j2, list3, list4, i, j3, dataSource, i2, z, z2, com_google_android_gms_internal_zzra == null ? null : com_google_android_gms_internal_zzra.asBinder(), list5);
    }

    private boolean zzb(DataReadRequest dataReadRequest) {
        return this.zzaCS.equals(dataReadRequest.zzaCS) && this.zzaHs.equals(dataReadRequest.zzaHs) && this.zzXy == dataReadRequest.zzXy && this.zzaCJ == dataReadRequest.zzaCJ && this.zzaCV == dataReadRequest.zzaCV && this.zzaHy.equals(dataReadRequest.zzaHy) && this.zzaHx.equals(dataReadRequest.zzaHx) && zzz.equal(this.zzaHA, dataReadRequest.zzaHA) && this.zzaHz == dataReadRequest.zzaHz && this.zzaHD == dataReadRequest.zzaHD;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DataReadRequest) && zzb((DataReadRequest) obj));
    }

    public DataSource getActivityDataSource() {
        return this.zzaHA;
    }

    public List<DataSource> getAggregatedDataSources() {
        return this.zzaHy;
    }

    public List<DataType> getAggregatedDataTypes() {
        return this.zzaHx;
    }

    public long getBucketDuration(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzaHz, TimeUnit.MILLISECONDS);
    }

    public int getBucketType() {
        return this.zzaCV;
    }

    public IBinder getCallbackBinder() {
        return this.zzaHE == null ? null : this.zzaHE.asBinder();
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

    public int getLimit() {
        return this.zzaHB;
    }

    public long getStartTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzXy, TimeUnit.MILLISECONDS);
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(Integer.valueOf(this.zzaCV), Long.valueOf(this.zzXy), Long.valueOf(this.zzaCJ));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataReadRequest{");
        if (!this.zzaCS.isEmpty()) {
            for (DataType zzxy : this.zzaCS) {
                stringBuilder.append(zzxy.zzxy()).append(" ");
            }
        }
        if (!this.zzaHs.isEmpty()) {
            for (DataSource toDebugString : this.zzaHs) {
                stringBuilder.append(toDebugString.toDebugString()).append(" ");
            }
        }
        if (this.zzaCV != 0) {
            stringBuilder.append("bucket by ").append(Bucket.zzfc(this.zzaCV));
            if (this.zzaHz > 0) {
                stringBuilder.append(" >").append(this.zzaHz).append("ms");
            }
            stringBuilder.append(": ");
        }
        if (!this.zzaHx.isEmpty()) {
            for (DataType zzxy2 : this.zzaHx) {
                stringBuilder.append(zzxy2.zzxy()).append(" ");
            }
        }
        if (!this.zzaHy.isEmpty()) {
            for (DataSource toDebugString2 : this.zzaHy) {
                stringBuilder.append(toDebugString2.toDebugString()).append(" ");
            }
        }
        stringBuilder.append(String.format("(%tF %tT - %tF %tT)", new Object[]{Long.valueOf(this.zzXy), Long.valueOf(this.zzXy), Long.valueOf(this.zzaCJ), Long.valueOf(this.zzaCJ)}));
        if (this.zzaHA != null) {
            stringBuilder.append("activities: ").append(this.zzaHA.toDebugString());
        }
        if (this.zzaHD) {
            stringBuilder.append(" +server");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzf.zza(this, parcel, i);
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

    public boolean zzya() {
        return this.zzaHC;
    }

    public long zzyb() {
        return this.zzaHz;
    }

    public List<Device> zzyc() {
        return this.zzaHF;
    }
}
