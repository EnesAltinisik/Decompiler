package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.fitness.FitnessActivities;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Bucket extends AbstractSafeParcelable {
    public static final Creator<Bucket> CREATOR = new zzc();
    public static final int TYPE_ACTIVITY_SEGMENT = 4;
    public static final int TYPE_ACTIVITY_TYPE = 3;
    public static final int TYPE_SESSION = 2;
    public static final int TYPE_TIME = 1;
    private final int mVersionCode;
    private final long zzXy;
    private final long zzaCJ;
    private final Session zzaCL;
    private final int zzaCT;
    private final List<DataSet> zzaCU;
    private final int zzaCV;
    private boolean zzaCW;

    Bucket(int i, long j, long j2, Session session, int i2, List<DataSet> list, int i3, boolean z) {
        this.zzaCW = false;
        this.mVersionCode = i;
        this.zzXy = j;
        this.zzaCJ = j2;
        this.zzaCL = session;
        this.zzaCT = i2;
        this.zzaCU = list;
        this.zzaCV = i3;
        this.zzaCW = z;
    }

    public Bucket(RawBucket rawBucket, List<DataSource> list) {
        this(2, rawBucket.zzXy, rawBucket.zzaCJ, rawBucket.zzaCL, rawBucket.zzaDT, zza(rawBucket.zzaCU, list), rawBucket.zzaCV, rawBucket.zzaCW);
    }

    private static List<DataSet> zza(Collection<RawDataSet> collection, List<DataSource> list) {
        List<DataSet> arrayList = new ArrayList(collection.size());
        for (RawDataSet dataSet : collection) {
            arrayList.add(new DataSet(dataSet, list));
        }
        return arrayList;
    }

    private boolean zza(Bucket bucket) {
        return this.zzXy == bucket.zzXy && this.zzaCJ == bucket.zzaCJ && this.zzaCT == bucket.zzaCT && zzz.equal(this.zzaCU, bucket.zzaCU) && this.zzaCV == bucket.zzaCV && this.zzaCW == bucket.zzaCW;
    }

    public static String zzfc(int i) {
        switch (i) {
            case 0:
                return FitnessActivities.UNKNOWN;
            case 1:
                return "time";
            case 2:
                return "session";
            case 3:
                return "type";
            case 4:
                return "segment";
            default:
                return "bug";
        }
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Bucket) && zza((Bucket) obj));
    }

    public String getActivity() {
        return FitnessActivities.getName(this.zzaCT);
    }

    public int getBucketType() {
        return this.zzaCV;
    }

    public DataSet getDataSet(DataType dataType) {
        for (DataSet dataSet : this.zzaCU) {
            if (dataSet.getDataType().equals(dataType)) {
                return dataSet;
            }
        }
        return null;
    }

    public List<DataSet> getDataSets() {
        return this.zzaCU;
    }

    public long getEndTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzaCJ, TimeUnit.MILLISECONDS);
    }

    public Session getSession() {
        return this.zzaCL;
    }

    public long getStartTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.zzXy, TimeUnit.MILLISECONDS);
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(Long.valueOf(this.zzXy), Long.valueOf(this.zzaCJ), Integer.valueOf(this.zzaCT), Integer.valueOf(this.zzaCV));
    }

    public String toString() {
        return zzz.zzy(this).zzg("startTime", Long.valueOf(this.zzXy)).zzg("endTime", Long.valueOf(this.zzaCJ)).zzg("activity", Integer.valueOf(this.zzaCT)).zzg("dataSets", this.zzaCU).zzg("bucketType", zzfc(this.zzaCV)).zzg("serverHasMoreData", Boolean.valueOf(this.zzaCW)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc.zza(this, parcel, i);
    }

    public boolean zzb(Bucket bucket) {
        return this.zzXy == bucket.zzXy && this.zzaCJ == bucket.zzaCJ && this.zzaCT == bucket.zzaCT && this.zzaCV == bucket.zzaCV;
    }

    public long zzoq() {
        return this.zzXy;
    }

    public int zzxl() {
        return this.zzaCT;
    }

    public boolean zzxm() {
        if (this.zzaCW) {
            return true;
        }
        for (DataSet zzxm : this.zzaCU) {
            if (zzxm.zzxm()) {
                return true;
            }
        }
        return false;
    }

    public long zzxn() {
        return this.zzaCJ;
    }
}
