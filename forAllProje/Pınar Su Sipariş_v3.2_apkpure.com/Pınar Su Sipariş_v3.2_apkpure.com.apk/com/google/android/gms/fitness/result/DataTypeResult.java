package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.fitness.data.DataType;

public class DataTypeResult extends AbstractSafeParcelable implements Result {
    public static final Creator<DataTypeResult> CREATOR = new zzg();
    private final int mVersionCode;
    private final DataType zzaCH;
    private final Status zzaaO;

    DataTypeResult(int i, Status status, DataType dataType) {
        this.mVersionCode = i;
        this.zzaaO = status;
        this.zzaCH = dataType;
    }

    public DataTypeResult(Status status, DataType dataType) {
        this.mVersionCode = 2;
        this.zzaaO = status;
        this.zzaCH = dataType;
    }

    public static DataTypeResult zzW(Status status) {
        return new DataTypeResult(status, null);
    }

    private boolean zzb(DataTypeResult dataTypeResult) {
        return this.zzaaO.equals(dataTypeResult.zzaaO) && zzz.equal(this.zzaCH, dataTypeResult.zzaCH);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DataTypeResult) && zzb((DataTypeResult) obj));
    }

    public DataType getDataType() {
        return this.zzaCH;
    }

    public Status getStatus() {
        return this.zzaaO;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaaO, this.zzaCH);
    }

    public String toString() {
        return zzz.zzy(this).zzg("status", this.zzaaO).zzg("dataType", this.zzaCH).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzg.zza(this, parcel, i);
    }
}
