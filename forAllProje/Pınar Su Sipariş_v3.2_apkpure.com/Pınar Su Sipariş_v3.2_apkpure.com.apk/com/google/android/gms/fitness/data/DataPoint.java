package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.internal.zzql;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class DataPoint extends AbstractSafeParcelable {
    public static final Creator<DataPoint> CREATOR = new zzd();
    private final int mVersionCode;
    private final DataSource zzaCI;
    private long zzaCX;
    private long zzaCY;
    private final Value[] zzaCZ;
    private DataSource zzaDa;
    private long zzaDb;
    private long zzaDc;

    DataPoint(int i, DataSource dataSource, long j, long j2, Value[] valueArr, DataSource dataSource2, long j3, long j4) {
        this.mVersionCode = i;
        this.zzaCI = dataSource;
        this.zzaDa = dataSource2;
        this.zzaCX = j;
        this.zzaCY = j2;
        this.zzaCZ = valueArr;
        this.zzaDb = j3;
        this.zzaDc = j4;
    }

    private DataPoint(DataSource dataSource) {
        this.mVersionCode = 4;
        this.zzaCI = (DataSource) zzaa.zzb((Object) dataSource, (Object) "Data source cannot be null");
        List<Field> fields = dataSource.getDataType().getFields();
        this.zzaCZ = new Value[fields.size()];
        int i = 0;
        for (Field format : fields) {
            this.zzaCZ[i] = new Value(format.getFormat());
            i++;
        }
    }

    public DataPoint(DataSource dataSource, DataSource dataSource2, RawDataPoint rawDataPoint) {
        this(4, dataSource, zza(Long.valueOf(rawDataPoint.zzaCX), 0), zza(Long.valueOf(rawDataPoint.zzaCY), 0), rawDataPoint.zzaCZ, dataSource2, zza(Long.valueOf(rawDataPoint.zzaDb), 0), zza(Long.valueOf(rawDataPoint.zzaDc), 0));
    }

    DataPoint(List<DataSource> list, RawDataPoint rawDataPoint) {
        this(zza((List) list, rawDataPoint.zzaDU), zza((List) list, rawDataPoint.zzaDV), rawDataPoint);
    }

    public static DataPoint create(DataSource dataSource) {
        return new DataPoint(dataSource);
    }

    public static DataPoint extract(Intent intent) {
        return intent == null ? null : (DataPoint) zzc.zza(intent, "com.google.android.gms.fitness.EXTRA_DATA_POINT", CREATOR);
    }

    private static long zza(Long l, long j) {
        return l != null ? l.longValue() : j;
    }

    private static DataSource zza(List<DataSource> list, int i) {
        return (i < 0 || i >= list.size()) ? null : (DataSource) list.get(i);
    }

    private boolean zza(DataPoint dataPoint) {
        return zzz.equal(this.zzaCI, dataPoint.zzaCI) && this.zzaCX == dataPoint.zzaCX && this.zzaCY == dataPoint.zzaCY && Arrays.equals(this.zzaCZ, dataPoint.zzaCZ) && zzz.equal(getOriginalDataSource(), dataPoint.getOriginalDataSource());
    }

    private void zzfe(int i) {
        zzaa.zzb(i == getDataType().getFields().size(), "Attempting to insert %s values, but needed %s: %s", Integer.valueOf(i), Integer.valueOf(getDataType().getFields().size()), getDataType().getFields());
    }

    private boolean zzxo() {
        return getDataType() == DataType.TYPE_LOCATION_SAMPLE;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DataPoint) && zza((DataPoint) obj));
    }

    public DataSource getDataSource() {
        return this.zzaCI;
    }

    public DataType getDataType() {
        return this.zzaCI.getDataType();
    }

    public long getEndTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzaCX, TimeUnit.NANOSECONDS);
    }

    public DataSource getOriginalDataSource() {
        return this.zzaDa != null ? this.zzaDa : this.zzaCI;
    }

    public long getStartTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzaCY, TimeUnit.NANOSECONDS);
    }

    public long getTimestamp(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzaCX, TimeUnit.NANOSECONDS);
    }

    public long getTimestampNanos() {
        return this.zzaCX;
    }

    public Value getValue(Field field) {
        return this.zzaCZ[getDataType().indexOf(field)];
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaCI, Long.valueOf(this.zzaCX), Long.valueOf(this.zzaCY));
    }

    public DataPoint setFloatValues(float... fArr) {
        zzfe(fArr.length);
        for (int i = 0; i < fArr.length; i++) {
            this.zzaCZ[i].setFloat(fArr[i]);
        }
        return this;
    }

    public DataPoint setIntValues(int... iArr) {
        zzfe(iArr.length);
        for (int i = 0; i < iArr.length; i++) {
            this.zzaCZ[i].setInt(iArr[i]);
        }
        return this;
    }

    public DataPoint setTimeInterval(long j, long j2, TimeUnit timeUnit) {
        this.zzaCY = timeUnit.toNanos(j);
        this.zzaCX = timeUnit.toNanos(j2);
        return this;
    }

    public DataPoint setTimestamp(long j, TimeUnit timeUnit) {
        this.zzaCX = timeUnit.toNanos(j);
        if (zzxo() && zzql.zza(timeUnit)) {
            Log.w("Fitness", "Storing location at more than millisecond granularity is not supported. Extra precision is lost as the value is converted to milliseconds.");
            this.zzaCX = zzql.zza(this.zzaCX, TimeUnit.NANOSECONDS, TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public String toString() {
        String str = "DataPoint{%s@[%s, %s,raw=%s,insert=%s](%s %s)}";
        Object[] objArr = new Object[7];
        objArr[0] = Arrays.toString(this.zzaCZ);
        objArr[1] = Long.valueOf(this.zzaCY);
        objArr[2] = Long.valueOf(this.zzaCX);
        objArr[3] = Long.valueOf(this.zzaDb);
        objArr[4] = Long.valueOf(this.zzaDc);
        objArr[5] = this.zzaCI.toDebugString();
        objArr[6] = this.zzaDa != null ? this.zzaDa.toDebugString() : "N/A";
        return String.format(str, objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzd.zza(this, parcel, i);
    }

    public Value[] zzxp() {
        return this.zzaCZ;
    }

    public long zzxq() {
        return this.zzaDb;
    }

    public long zzxr() {
        return this.zzaDc;
    }

    public void zzxs() {
        zzaa.zzb(getDataType().getName().equals(getDataSource().getDataType().getName()), "Conflicting data types found %s vs %s", getDataType(), getDataType());
        zzaa.zzb(this.zzaCX > 0, "Data point does not have the timestamp set: %s", this);
        zzaa.zzb(this.zzaCY <= this.zzaCX, "Data point with start time greater than end time found: %s", this);
    }

    public long zzxt() {
        return this.zzaCY;
    }
}
