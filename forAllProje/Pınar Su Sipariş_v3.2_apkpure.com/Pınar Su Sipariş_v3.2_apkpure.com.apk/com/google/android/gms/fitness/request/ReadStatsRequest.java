package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.internal.zzrm;
import com.google.android.gms.internal.zzrm.zza;
import java.util.List;

public class ReadStatsRequest extends AbstractSafeParcelable {
    public static final Creator<ReadStatsRequest> CREATOR = new zzu();
    private final int mVersionCode;
    private final zzrm zzaHT;
    private final List<DataSource> zzaHs;

    ReadStatsRequest(int i, IBinder iBinder, List<DataSource> list) {
        this.mVersionCode = i;
        this.zzaHT = zza.zzbW(iBinder);
        this.zzaHs = list;
    }

    public IBinder getCallbackBinder() {
        return this.zzaHT.asBinder();
    }

    public List<DataSource> getDataSources() {
        return this.zzaHs;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public String toString() {
        return String.format("ReadStatsRequest", new Object[0]);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzu.zza(this, parcel, i);
    }
}
