package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;

public class FitnessUnregistrationRequest extends AbstractSafeParcelable {
    public static final Creator<FitnessUnregistrationRequest> CREATOR = new zzb();
    private final int mVersionCode;
    private final DataSource zzaCI;

    FitnessUnregistrationRequest(int i, DataSource dataSource) {
        this.mVersionCode = i;
        this.zzaCI = dataSource;
    }

    public DataSource getDataSource() {
        return this.zzaCI;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public String toString() {
        return String.format("ApplicationUnregistrationRequest{%s}", new Object[]{this.zzaCI});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }
}
