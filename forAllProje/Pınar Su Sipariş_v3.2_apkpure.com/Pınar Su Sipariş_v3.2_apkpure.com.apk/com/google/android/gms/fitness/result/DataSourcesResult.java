package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataSourcesResult extends AbstractSafeParcelable implements Result {
    public static final Creator<DataSourcesResult> CREATOR = new zze();
    private final int mVersionCode;
    private final List<DataSource> zzaHs;
    private final Status zzaaO;

    DataSourcesResult(int i, List<DataSource> list, Status status) {
        this.mVersionCode = i;
        this.zzaHs = Collections.unmodifiableList(list);
        this.zzaaO = status;
    }

    public DataSourcesResult(List<DataSource> list, Status status) {
        this.mVersionCode = 3;
        this.zzaHs = Collections.unmodifiableList(list);
        this.zzaaO = status;
    }

    public static DataSourcesResult zzV(Status status) {
        return new DataSourcesResult(Collections.emptyList(), status);
    }

    private boolean zzb(DataSourcesResult dataSourcesResult) {
        return this.zzaaO.equals(dataSourcesResult.zzaaO) && zzz.equal(this.zzaHs, dataSourcesResult.zzaHs);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DataSourcesResult) && zzb((DataSourcesResult) obj));
    }

    public List<DataSource> getDataSources() {
        return this.zzaHs;
    }

    public List<DataSource> getDataSources(DataType dataType) {
        List arrayList = new ArrayList();
        for (DataSource dataSource : this.zzaHs) {
            if (dataSource.getDataType().equals(dataType)) {
                arrayList.add(dataSource);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Status getStatus() {
        return this.zzaaO;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaaO, this.zzaHs);
    }

    public String toString() {
        return zzz.zzy(this).zzg("status", this.zzaaO).zzg("dataSets", this.zzaHs).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zze.zza(this, parcel, i);
    }
}
