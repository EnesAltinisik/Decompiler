package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzz;
import java.util.concurrent.TimeUnit;

public class DataUpdateNotification extends AbstractSafeParcelable {
    public static final String ACTION = "com.google.android.gms.fitness.DATA_UPDATE_NOTIFICATION";
    public static final Creator<DataUpdateNotification> CREATOR = new zzh();
    public static final String EXTRA_DATA_UPDATE_NOTIFICATION = "vnd.google.fitness.data_udpate_notification";
    public static final int OPERATION_DELETE = 2;
    public static final int OPERATION_INSERT = 1;
    public static final int OPERATION_UPDATE = 3;
    final int mVersionCode;
    private final DataType zzaCH;
    private final DataSource zzaCI;
    private final long zzaDt;
    private final long zzaDu;
    private final int zzaDv;

    DataUpdateNotification(int i, long j, long j2, int i2, DataSource dataSource, DataType dataType) {
        this.mVersionCode = i;
        this.zzaDt = j;
        this.zzaDu = j2;
        this.zzaDv = i2;
        this.zzaCI = dataSource;
        this.zzaCH = dataType;
    }

    public static DataUpdateNotification getDataUpdateNotification(Intent intent) {
        return (DataUpdateNotification) zzc.zza(intent, EXTRA_DATA_UPDATE_NOTIFICATION, CREATOR);
    }

    private boolean zza(DataUpdateNotification dataUpdateNotification) {
        return this.zzaDt == dataUpdateNotification.zzaDt && this.zzaDu == dataUpdateNotification.zzaDu && this.zzaDv == dataUpdateNotification.zzaDv && zzz.equal(this.zzaCI, dataUpdateNotification.zzaCI) && zzz.equal(this.zzaCH, dataUpdateNotification.zzaCH);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof DataUpdateNotification) && zza((DataUpdateNotification) obj));
    }

    public DataSource getDataSource() {
        return this.zzaCI;
    }

    public DataType getDataType() {
        return this.zzaCH;
    }

    public int getOperationType() {
        return this.zzaDv;
    }

    public long getUpdateEndTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzaDu, TimeUnit.NANOSECONDS);
    }

    public long getUpdateStartTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzaDt, TimeUnit.NANOSECONDS);
    }

    public int hashCode() {
        return zzz.hashCode(Long.valueOf(this.zzaDt), Long.valueOf(this.zzaDu), Integer.valueOf(this.zzaDv), this.zzaCI, this.zzaCH);
    }

    public String toString() {
        return zzz.zzy(this).zzg("updateStartTimeNanos", Long.valueOf(this.zzaDt)).zzg("updateEndTimeNanos", Long.valueOf(this.zzaDu)).zzg("operationType", Integer.valueOf(this.zzaDv)).zzg("dataSource", this.zzaCI).zzg("dataType", this.zzaCH).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzh.zza(this, parcel, i);
    }

    public long zzxA() {
        return this.zzaDu;
    }

    public long zzxz() {
        return this.zzaDt;
    }
}
