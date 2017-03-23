package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource.Builder;
import com.google.android.gms.fitness.data.DataType;

public class DailyTotalResult extends AbstractSafeParcelable implements Result {
    public static final Creator<DailyTotalResult> CREATOR = new zzb();
    private final int mVersionCode;
    private final DataSet zzaEa;
    private final Status zzaaO;

    DailyTotalResult(int i, Status status, DataSet dataSet) {
        this.mVersionCode = i;
        this.zzaaO = status;
        this.zzaEa = dataSet;
    }

    public DailyTotalResult(DataSet dataSet, Status status) {
        this.mVersionCode = 1;
        this.zzaaO = status;
        this.zzaEa = dataSet;
    }

    public static DailyTotalResult zza(Status status, DataType dataType) {
        return new DailyTotalResult(DataSet.create(new Builder().setDataType(dataType).setType(1).build()), status);
    }

    private boolean zzb(DailyTotalResult dailyTotalResult) {
        return this.zzaaO.equals(dailyTotalResult.zzaaO) && zzz.equal(this.zzaEa, dailyTotalResult.zzaEa);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DailyTotalResult) && zzb((DailyTotalResult) obj));
    }

    public Status getStatus() {
        return this.zzaaO;
    }

    public DataSet getTotal() {
        return this.zzaEa;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaaO, this.zzaEa);
    }

    public String toString() {
        return zzz.zzy(this).zzg("status", this.zzaaO).zzg("dataPoint", this.zzaEa).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }
}
