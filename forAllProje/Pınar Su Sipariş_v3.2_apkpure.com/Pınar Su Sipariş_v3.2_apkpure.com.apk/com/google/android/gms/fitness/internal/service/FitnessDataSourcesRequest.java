package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.fitness.data.DataType;
import java.util.Collections;
import java.util.List;

public class FitnessDataSourcesRequest extends AbstractSafeParcelable {
    public static final Creator<FitnessDataSourcesRequest> CREATOR = new zza();
    private final int mVersionCode;
    private final List<DataType> zzaCS;

    FitnessDataSourcesRequest(int i, List<DataType> list) {
        this.mVersionCode = i;
        this.zzaCS = list;
    }

    public List<DataType> getDataTypes() {
        return Collections.unmodifiableList(this.zzaCS);
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public String toString() {
        return zzz.zzy(this).zzg("dataTypes", this.zzaCS).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }
}
