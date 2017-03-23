package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

@KeepName
public final class RawDataPoint extends AbstractSafeParcelable {
    public static final Creator<RawDataPoint> CREATOR = new zzo();
    final int mVersionCode;
    public final long zzaCX;
    public final long zzaCY;
    public final Value[] zzaCZ;
    public final int zzaDU;
    public final int zzaDV;
    public final long zzaDb;
    public final long zzaDc;

    public RawDataPoint(int i, long j, long j2, Value[] valueArr, int i2, int i3, long j3, long j4) {
        this.mVersionCode = i;
        this.zzaCX = j;
        this.zzaCY = j2;
        this.zzaDU = i2;
        this.zzaDV = i3;
        this.zzaDb = j3;
        this.zzaDc = j4;
        this.zzaCZ = valueArr;
    }

    RawDataPoint(DataPoint dataPoint, List<DataSource> list) {
        this.mVersionCode = 4;
        this.zzaCX = dataPoint.getTimestamp(TimeUnit.NANOSECONDS);
        this.zzaCY = dataPoint.getStartTime(TimeUnit.NANOSECONDS);
        this.zzaCZ = dataPoint.zzxp();
        this.zzaDU = zzt.zza(dataPoint.getDataSource(), list);
        this.zzaDV = zzt.zza(dataPoint.getOriginalDataSource(), list);
        this.zzaDb = dataPoint.zzxq();
        this.zzaDc = dataPoint.zzxr();
    }

    private boolean zza(RawDataPoint rawDataPoint) {
        return this.zzaCX == rawDataPoint.zzaCX && this.zzaCY == rawDataPoint.zzaCY && Arrays.equals(this.zzaCZ, rawDataPoint.zzaCZ) && this.zzaDU == rawDataPoint.zzaDU && this.zzaDV == rawDataPoint.zzaDV && this.zzaDb == rawDataPoint.zzaDb;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof RawDataPoint) && zza((RawDataPoint) obj));
    }

    public int hashCode() {
        return zzz.hashCode(Long.valueOf(this.zzaCX), Long.valueOf(this.zzaCY));
    }

    public String toString() {
        return String.format("RawDataPoint{%s@[%s, %s](%d,%d)}", new Object[]{Arrays.toString(this.zzaCZ), Long.valueOf(this.zzaCY), Long.valueOf(this.zzaCX), Integer.valueOf(this.zzaDU), Integer.valueOf(this.zzaDV)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzo.zza(this, parcel, i);
    }
}
