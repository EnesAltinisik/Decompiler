package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;

public class DataSourceStatsResult extends AbstractSafeParcelable {
    public static final Creator<DataSourceStatsResult> CREATOR = new zzd();
    final int mVersionCode;
    public final DataSource zzaCI;
    public final boolean zzaIv;
    public final long zzaIw;
    public final long zzaIx;
    public final long zzaaQ;

    DataSourceStatsResult(int i, DataSource dataSource, long j, boolean z, long j2, long j3) {
        this.mVersionCode = i;
        this.zzaCI = dataSource;
        this.zzaaQ = j;
        this.zzaIv = z;
        this.zzaIw = j2;
        this.zzaIx = j3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzd.zza(this, parcel, i);
    }
}
