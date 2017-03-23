package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class DataStatsResult extends AbstractSafeParcelable implements Result {
    public static final Creator<DataStatsResult> CREATOR = new zzf();
    private final int mVersionCode;
    private final List<DataSourceStatsResult> zzaIy;
    private final Status zzaaO;

    DataStatsResult(int i, Status status, List<DataSourceStatsResult> list) {
        this.mVersionCode = i;
        this.zzaaO = status;
        this.zzaIy = list;
    }

    public Status getStatus() {
        return this.zzaaO;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzf.zza(this, parcel, i);
    }

    List<DataSourceStatsResult> zzyx() {
        return this.zzaIy;
    }
}
