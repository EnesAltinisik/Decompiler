package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;

public class DataSourceQueryParams extends AbstractSafeParcelable {
    public static final Creator<DataSourceQueryParams> CREATOR = new zzg();
    final int mVersionCode;
    public final DataSource zzaCI;
    public final long zzaCY;
    public final int zzaHB;
    public final long zzaHG;
    public final int zzaHH;
    public final long zzaaQ;

    DataSourceQueryParams(int i, DataSource dataSource, long j, long j2, long j3, int i2, int i3) {
        this.mVersionCode = i;
        this.zzaCI = dataSource;
        this.zzaaQ = j;
        this.zzaCY = j2;
        this.zzaHG = j3;
        this.zzaHB = i2;
        this.zzaHH = i3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzg.zza(this, parcel, i);
    }
}
