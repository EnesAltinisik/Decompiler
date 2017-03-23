package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@KeepName
public final class RawBucket extends AbstractSafeParcelable {
    public static final Creator<RawBucket> CREATOR = new zzn();
    final int mVersionCode;
    public final long zzXy;
    public final long zzaCJ;
    public final Session zzaCL;
    public final List<RawDataSet> zzaCU;
    public final int zzaCV;
    public final boolean zzaCW;
    public final int zzaDT;

    public RawBucket(int i, long j, long j2, Session session, int i2, List<RawDataSet> list, int i3, boolean z) {
        this.mVersionCode = i;
        this.zzXy = j;
        this.zzaCJ = j2;
        this.zzaCL = session;
        this.zzaDT = i2;
        this.zzaCU = list;
        this.zzaCV = i3;
        this.zzaCW = z;
    }

    public RawBucket(Bucket bucket, List<DataSource> list, List<DataType> list2) {
        this.mVersionCode = 2;
        this.zzXy = bucket.getStartTime(TimeUnit.MILLISECONDS);
        this.zzaCJ = bucket.getEndTime(TimeUnit.MILLISECONDS);
        this.zzaCL = bucket.getSession();
        this.zzaDT = bucket.zzxl();
        this.zzaCV = bucket.getBucketType();
        this.zzaCW = bucket.zzxm();
        List<DataSet> dataSets = bucket.getDataSets();
        this.zzaCU = new ArrayList(dataSets.size());
        for (DataSet rawDataSet : dataSets) {
            this.zzaCU.add(new RawDataSet(rawDataSet, list, list2));
        }
    }

    private boolean zza(RawBucket rawBucket) {
        return this.zzXy == rawBucket.zzXy && this.zzaCJ == rawBucket.zzaCJ && this.zzaDT == rawBucket.zzaDT && zzz.equal(this.zzaCU, rawBucket.zzaCU) && this.zzaCV == rawBucket.zzaCV && this.zzaCW == rawBucket.zzaCW;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof RawBucket) && zza((RawBucket) obj));
    }

    public int hashCode() {
        return zzz.hashCode(Long.valueOf(this.zzXy), Long.valueOf(this.zzaCJ), Integer.valueOf(this.zzaCV));
    }

    public String toString() {
        return zzz.zzy(this).zzg("startTime", Long.valueOf(this.zzXy)).zzg("endTime", Long.valueOf(this.zzaCJ)).zzg("activity", Integer.valueOf(this.zzaDT)).zzg("dataSets", this.zzaCU).zzg("bucketType", Integer.valueOf(this.zzaCV)).zzg("serverHasMoreData", Boolean.valueOf(this.zzaCW)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzn.zza(this, parcel, i);
    }
}
