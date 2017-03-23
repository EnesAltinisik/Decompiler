package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.internal.zzz.zza;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataSource.Builder;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.RawBucket;
import com.google.android.gms.fitness.data.RawDataSet;
import com.google.android.gms.fitness.request.DataReadRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataReadResult extends AbstractSafeParcelable implements Result {
    public static final Creator<DataReadResult> CREATOR = new zzc();
    private final int mVersionCode;
    private final List<DataSet> zzaCU;
    private final List<DataSource> zzaDe;
    private final List<Bucket> zzaIs;
    private int zzaIt;
    private final List<DataType> zzaIu;
    private final Status zzaaO;

    DataReadResult(int i, List<RawDataSet> list, Status status, List<RawBucket> list2, int i2, List<DataSource> list3, List<DataType> list4) {
        this.mVersionCode = i;
        this.zzaaO = status;
        this.zzaIt = i2;
        this.zzaDe = list3;
        this.zzaIu = list4;
        this.zzaCU = new ArrayList(list.size());
        for (RawDataSet dataSet : list) {
            this.zzaCU.add(new DataSet(dataSet, list3));
        }
        this.zzaIs = new ArrayList(list2.size());
        for (RawBucket bucket : list2) {
            this.zzaIs.add(new Bucket(bucket, list3));
        }
    }

    public DataReadResult(List<DataSet> list, List<Bucket> list2, Status status) {
        this.mVersionCode = 5;
        this.zzaCU = list;
        this.zzaaO = status;
        this.zzaIs = list2;
        this.zzaIt = 1;
        this.zzaDe = new ArrayList();
        this.zzaIu = new ArrayList();
    }

    public static DataReadResult zza(Status status, DataReadRequest dataReadRequest) {
        List arrayList = new ArrayList();
        for (DataSource create : dataReadRequest.getDataSources()) {
            arrayList.add(DataSet.create(create));
        }
        for (DataType dataType : dataReadRequest.getDataTypes()) {
            arrayList.add(DataSet.create(new Builder().setDataType(dataType).setType(1).setName("Default").build()));
        }
        return new DataReadResult(arrayList, Collections.emptyList(), status);
    }

    private void zza(Bucket bucket, List<Bucket> list) {
        for (Bucket bucket2 : list) {
            if (bucket2.zzb(bucket)) {
                for (DataSet zza : bucket.getDataSets()) {
                    zza(zza, bucket2.getDataSets());
                }
                return;
            }
        }
        this.zzaIs.add(bucket);
    }

    private void zza(DataSet dataSet, List<DataSet> list) {
        for (DataSet dataSet2 : list) {
            if (dataSet2.getDataSource().equals(dataSet.getDataSource())) {
                dataSet2.zzb(dataSet.getDataPoints());
                return;
            }
        }
        list.add(dataSet);
    }

    private boolean zzc(DataReadResult dataReadResult) {
        return this.zzaaO.equals(dataReadResult.zzaaO) && zzz.equal(this.zzaCU, dataReadResult.zzaCU) && zzz.equal(this.zzaIs, dataReadResult.zzaIs);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DataReadResult) && zzc((DataReadResult) obj));
    }

    public List<Bucket> getBuckets() {
        return this.zzaIs;
    }

    public DataSet getDataSet(DataSource dataSource) {
        for (DataSet dataSet : this.zzaCU) {
            if (dataSource.equals(dataSet.getDataSource())) {
                return dataSet;
            }
        }
        return DataSet.create(dataSource);
    }

    public DataSet getDataSet(DataType dataType) {
        for (DataSet dataSet : this.zzaCU) {
            if (dataType.equals(dataSet.getDataType())) {
                return dataSet;
            }
        }
        return DataSet.create(new Builder().setDataType(dataType).setType(1).build());
    }

    public List<DataSet> getDataSets() {
        return this.zzaCU;
    }

    public Status getStatus() {
        return this.zzaaO;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaaO, this.zzaCU, this.zzaIs);
    }

    public String toString() {
        Object obj;
        zza zzg = zzz.zzy(this).zzg("status", this.zzaaO);
        String str = "dataSets";
        if (this.zzaCU.size() > 5) {
            obj = this.zzaCU.size() + " data sets";
        } else {
            obj = this.zzaCU;
        }
        zzg = zzg.zzg(str, obj);
        str = "buckets";
        if (this.zzaIs.size() > 5) {
            obj = this.zzaIs.size() + " buckets";
        } else {
            obj = this.zzaIs;
        }
        return zzg.zzg(str, obj).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc.zza(this, parcel, i);
    }

    public void zzb(DataReadResult dataReadResult) {
        for (DataSet zza : dataReadResult.getDataSets()) {
            zza(zza, this.zzaCU);
        }
        for (Bucket zza2 : dataReadResult.getBuckets()) {
            zza(zza2, this.zzaIs);
        }
    }

    List<DataSource> zzxv() {
        return this.zzaDe;
    }

    public int zzyt() {
        return this.zzaIt;
    }

    List<RawBucket> zzyu() {
        List<RawBucket> arrayList = new ArrayList(this.zzaIs.size());
        for (Bucket rawBucket : this.zzaIs) {
            arrayList.add(new RawBucket(rawBucket, this.zzaDe, this.zzaIu));
        }
        return arrayList;
    }

    List<RawDataSet> zzyv() {
        List<RawDataSet> arrayList = new ArrayList(this.zzaCU.size());
        for (DataSet rawDataSet : this.zzaCU) {
            arrayList.add(new RawDataSet(rawDataSet, this.zzaDe, this.zzaIu));
        }
        return arrayList;
    }

    List<DataType> zzyw() {
        return this.zzaIu;
    }
}
