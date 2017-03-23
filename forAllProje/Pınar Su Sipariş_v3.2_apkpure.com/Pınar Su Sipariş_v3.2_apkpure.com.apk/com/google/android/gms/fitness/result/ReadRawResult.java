package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

public class ReadRawResult extends AbstractSafeParcelable implements Result {
    public static final Creator<ReadRawResult> CREATOR = new zzi();
    private final int mVersionCode;
    private final List<DataHolder> zzaIA;
    private final DataHolder zzamz;

    ReadRawResult(int i, DataHolder dataHolder, List<DataHolder> list) {
        List singletonList;
        this.mVersionCode = i;
        this.zzamz = dataHolder;
        if (list == null) {
            singletonList = Collections.singletonList(dataHolder);
        }
        this.zzaIA = singletonList;
    }

    public Status getStatus() {
        return new Status(this.zzamz.getStatusCode());
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzi.zza(this, parcel, i);
    }

    DataHolder zzwg() {
        return this.zzamz;
    }

    public List<DataHolder> zzyy() {
        return this.zzaIA;
    }
}
