package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.util.zzb;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzrb;
import com.google.android.gms.internal.zzrb.zza;
import java.util.Arrays;
import java.util.List;

public class DataSourcesRequest extends AbstractSafeParcelable {
    public static final Creator<DataSourcesRequest> CREATOR = new zzh();
    private final int mVersionCode;
    private final List<DataType> zzaCS;
    private final List<Integer> zzaHI;
    private final boolean zzaHJ;
    private final zzrb zzaHK;

    public static class Builder {
        private boolean zzaHJ = false;
        private DataType[] zzaHL = new DataType[0];
        private int[] zzaHM = new int[]{0, 1};

        public DataSourcesRequest build() {
            boolean z = true;
            zzaa.zza(this.zzaHL.length > 0, (Object) "Must add at least one data type");
            if (this.zzaHM.length <= 0) {
                z = false;
            }
            zzaa.zza(z, (Object) "Must add at least one data source type");
            return new DataSourcesRequest();
        }

        public Builder setDataSourceTypes(int... iArr) {
            this.zzaHM = iArr;
            return this;
        }

        public Builder setDataTypes(DataType... dataTypeArr) {
            this.zzaHL = dataTypeArr;
            return this;
        }
    }

    DataSourcesRequest(int i, List<DataType> list, List<Integer> list2, boolean z, IBinder iBinder) {
        this.mVersionCode = i;
        this.zzaCS = list;
        this.zzaHI = list2;
        this.zzaHJ = z;
        this.zzaHK = zza.zzbL(iBinder);
    }

    private DataSourcesRequest(Builder builder) {
        this(zzb.zzb(builder.zzaHL), Arrays.asList(zzb.zza(builder.zzaHM)), false, null);
    }

    public DataSourcesRequest(DataSourcesRequest dataSourcesRequest, zzrb com_google_android_gms_internal_zzrb) {
        this(dataSourcesRequest.zzaCS, dataSourcesRequest.zzaHI, dataSourcesRequest.zzaHJ, com_google_android_gms_internal_zzrb);
    }

    public DataSourcesRequest(List<DataType> list, List<Integer> list2, boolean z, zzrb com_google_android_gms_internal_zzrb) {
        this.mVersionCode = 4;
        this.zzaCS = list;
        this.zzaHI = list2;
        this.zzaHJ = z;
        this.zzaHK = com_google_android_gms_internal_zzrb;
    }

    public IBinder getCallbackBinder() {
        return this.zzaHK == null ? null : this.zzaHK.asBinder();
    }

    public List<DataType> getDataTypes() {
        return this.zzaCS;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public String toString() {
        zzz.zza zzg = zzz.zzy(this).zzg("dataTypes", this.zzaCS).zzg("sourceTypes", this.zzaHI);
        if (this.zzaHJ) {
            zzg.zzg("includeDbOnlySources", "true");
        }
        return zzg.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzh.zza(this, parcel, i);
    }

    public List<Integer> zzyd() {
        return this.zzaHI;
    }

    public boolean zzye() {
        return this.zzaHJ;
    }
}
