package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.internal.zzqp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class DataSet extends AbstractSafeParcelable {
    public static final Creator<DataSet> CREATOR = new zze();
    private final int mVersionCode;
    private final DataType zzaCH;
    private final DataSource zzaCI;
    private boolean zzaCW;
    private final List<DataPoint> zzaDd;
    private final List<DataSource> zzaDe;

    DataSet(int i, DataSource dataSource, DataType dataType, List<RawDataPoint> list, List<DataSource> list2, boolean z) {
        List singletonList;
        this.zzaCW = false;
        this.mVersionCode = i;
        this.zzaCI = dataSource;
        this.zzaCH = dataSource.getDataType();
        this.zzaCW = z;
        this.zzaDd = new ArrayList(list.size());
        if (i < 2) {
            singletonList = Collections.singletonList(dataSource);
        }
        this.zzaDe = singletonList;
        for (RawDataPoint dataPoint : list) {
            this.zzaDd.add(new DataPoint(this.zzaDe, dataPoint));
        }
    }

    public DataSet(DataSource dataSource) {
        this.zzaCW = false;
        this.mVersionCode = 3;
        this.zzaCI = (DataSource) zzaa.zzz(dataSource);
        this.zzaCH = dataSource.getDataType();
        this.zzaDd = new ArrayList();
        this.zzaDe = new ArrayList();
        this.zzaDe.add(this.zzaCI);
    }

    public DataSet(RawDataSet rawDataSet, List<DataSource> list) {
        this.zzaCW = false;
        this.mVersionCode = 3;
        this.zzaCI = (DataSource) zzb(list, rawDataSet.zzaDU);
        this.zzaCH = this.zzaCI.getDataType();
        this.zzaDe = list;
        this.zzaCW = rawDataSet.zzaCW;
        List<RawDataPoint> list2 = rawDataSet.zzaDX;
        this.zzaDd = new ArrayList(list2.size());
        for (RawDataPoint dataPoint : list2) {
            this.zzaDd.add(new DataPoint(this.zzaDe, dataPoint));
        }
    }

    public static DataSet create(DataSource dataSource) {
        zzaa.zzb((Object) dataSource, (Object) "DataSource should be specified");
        return new DataSet(dataSource);
    }

    private boolean zza(DataSet dataSet) {
        return zzz.equal(getDataType(), dataSet.getDataType()) && zzz.equal(this.zzaCI, dataSet.zzaCI) && zzz.equal(this.zzaDd, dataSet.zzaDd) && this.zzaCW == dataSet.zzaCW;
    }

    private static <T> T zzb(List<T> list, int i) {
        return (i < 0 || i >= list.size()) ? null : list.get(i);
    }

    public void add(DataPoint dataPoint) {
        Object[] objArr = new Object[]{dataPoint.getDataSource(), this.zzaCI};
        zzaa.zzb(dataPoint.getDataSource().getStreamIdentifier().equals(this.zzaCI.getStreamIdentifier()), "Conflicting data sources found %s vs %s", objArr);
        dataPoint.zzxs();
        zzqp.zze(dataPoint);
        zzb(dataPoint);
    }

    public void addAll(Iterable<DataPoint> iterable) {
        for (DataPoint add : iterable) {
            add(add);
        }
    }

    public DataPoint createDataPoint() {
        return DataPoint.create(this.zzaCI);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof DataSet) && zza((DataSet) obj));
    }

    public List<DataPoint> getDataPoints() {
        return Collections.unmodifiableList(this.zzaDd);
    }

    public DataSource getDataSource() {
        return this.zzaCI;
    }

    public DataType getDataType() {
        return this.zzaCI.getDataType();
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaCI);
    }

    public boolean isEmpty() {
        return this.zzaDd.isEmpty();
    }

    public String toString() {
        List zzxu = zzxu();
        String str = "DataSet{%s %s}";
        Object[] objArr = new Object[2];
        objArr[0] = this.zzaCI.toDebugString();
        if (this.zzaDd.size() >= 10) {
            zzxu = String.format("%d data points, first 5: %s", new Object[]{Integer.valueOf(this.zzaDd.size()), zzxu.subList(0, 5)});
        }
        objArr[1] = zzxu;
        return String.format(str, objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zze.zza(this, parcel, i);
    }

    public void zzb(DataPoint dataPoint) {
        this.zzaDd.add(dataPoint);
        DataSource originalDataSource = dataPoint.getOriginalDataSource();
        if (originalDataSource != null && !this.zzaDe.contains(originalDataSource)) {
            this.zzaDe.add(originalDataSource);
        }
    }

    public void zzb(Iterable<DataPoint> iterable) {
        for (DataPoint zzb : iterable) {
            zzb(zzb);
        }
    }

    public boolean zzxm() {
        return this.zzaCW;
    }

    List<RawDataPoint> zzxu() {
        return zzy(this.zzaDe);
    }

    List<DataSource> zzxv() {
        return this.zzaDe;
    }

    List<RawDataPoint> zzy(List<DataSource> list) {
        List<RawDataPoint> arrayList = new ArrayList(this.zzaDd.size());
        for (DataPoint rawDataPoint : this.zzaDd) {
            arrayList.add(new RawDataPoint(rawDataPoint, list));
        }
        return arrayList;
    }
}
