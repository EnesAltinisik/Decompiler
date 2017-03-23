package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import java.util.List;

@KeepName
public final class RawDataSet extends AbstractSafeParcelable {
    public static final Creator<RawDataSet> CREATOR = new zzp();
    final int mVersionCode;
    public final boolean zzaCW;
    public final int zzaDU;
    public final int zzaDW;
    public final List<RawDataPoint> zzaDX;

    public RawDataSet(int i, int i2, int i3, List<RawDataPoint> list, boolean z) {
        this.mVersionCode = i;
        this.zzaDU = i2;
        this.zzaDW = i3;
        this.zzaDX = list;
        this.zzaCW = z;
    }

    public RawDataSet(DataSet dataSet, List<DataSource> list, List<DataType> list2) {
        this.mVersionCode = 3;
        this.zzaDX = dataSet.zzy(list);
        this.zzaCW = dataSet.zzxm();
        this.zzaDU = zzt.zza(dataSet.getDataSource(), list);
        this.zzaDW = zzt.zza(dataSet.getDataType(), list2);
    }

    private boolean zza(RawDataSet rawDataSet) {
        return this.zzaDU == rawDataSet.zzaDU && this.zzaCW == rawDataSet.zzaCW && zzz.equal(this.zzaDX, rawDataSet.zzaDX);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof RawDataSet) && zza((RawDataSet) obj));
    }

    public int hashCode() {
        return zzz.hashCode(Integer.valueOf(this.zzaDU));
    }

    public String toString() {
        return String.format("RawDataSet{%s@[%s]}", new Object[]{Integer.valueOf(this.zzaDU), this.zzaDX});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzp.zza(this, parcel, i);
    }
}
