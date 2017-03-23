package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.internal.zzrp;
import com.google.android.gms.internal.zzrp.zza;

public class DataInsertRequest extends AbstractSafeParcelable {
    public static final Creator<DataInsertRequest> CREATOR = new zze();
    private final int mVersionCode;
    private final DataSet zzaEa;
    private final zzrp zzaHq;
    private final boolean zzaHw;

    DataInsertRequest(int i, DataSet dataSet, IBinder iBinder, boolean z) {
        this.mVersionCode = i;
        this.zzaEa = dataSet;
        this.zzaHq = zza.zzbZ(iBinder);
        this.zzaHw = z;
    }

    public DataInsertRequest(DataSet dataSet, zzrp com_google_android_gms_internal_zzrp, boolean z) {
        this.mVersionCode = 4;
        this.zzaEa = dataSet;
        this.zzaHq = com_google_android_gms_internal_zzrp;
        this.zzaHw = z;
    }

    private boolean zzc(DataInsertRequest dataInsertRequest) {
        return zzz.equal(this.zzaEa, dataInsertRequest.zzaEa);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof DataInsertRequest) && zzc((DataInsertRequest) obj));
    }

    public IBinder getCallbackBinder() {
        return this.zzaHq == null ? null : this.zzaHq.asBinder();
    }

    public DataSet getDataSet() {
        return this.zzaEa;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaEa);
    }

    public String toString() {
        return zzz.zzy(this).zzg("dataSet", this.zzaEa).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zze.zza(this, parcel, i);
    }

    public boolean zzxY() {
        return this.zzaHw;
    }
}
