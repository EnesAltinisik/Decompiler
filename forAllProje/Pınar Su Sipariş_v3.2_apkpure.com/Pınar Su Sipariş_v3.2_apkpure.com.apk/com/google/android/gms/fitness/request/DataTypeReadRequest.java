package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.internal.zzrc;
import com.google.android.gms.internal.zzrc.zza;

public class DataTypeReadRequest extends AbstractSafeParcelable {
    public static final Creator<DataTypeReadRequest> CREATOR = new zzj();
    private final String mName;
    private final int mVersionCode;
    private final zzrc zzaHN;

    DataTypeReadRequest(int i, String str, IBinder iBinder) {
        this.mVersionCode = i;
        this.mName = str;
        this.zzaHN = zza.zzbM(iBinder);
    }

    public DataTypeReadRequest(String str, zzrc com_google_android_gms_internal_zzrc) {
        this.mVersionCode = 3;
        this.mName = str;
        this.zzaHN = com_google_android_gms_internal_zzrc;
    }

    private boolean zzb(DataTypeReadRequest dataTypeReadRequest) {
        return zzz.equal(this.mName, dataTypeReadRequest.mName);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof DataTypeReadRequest) && zzb((DataTypeReadRequest) obj));
    }

    public IBinder getCallbackBinder() {
        return this.zzaHN.asBinder();
    }

    public String getName() {
        return this.mName;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.mName);
    }

    public String toString() {
        return zzz.zzy(this).zzg("name", this.mName).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzj.zza(this, parcel, i);
    }
}
