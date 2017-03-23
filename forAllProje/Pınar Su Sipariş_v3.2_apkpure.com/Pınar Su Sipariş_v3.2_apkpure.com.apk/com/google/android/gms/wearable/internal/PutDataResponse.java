package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PutDataResponse extends AbstractSafeParcelable {
    public static final Creator<PutDataResponse> CREATOR = new zzbf();
    public final int statusCode;
    public final int versionCode;
    public final DataItemParcelable zzbDq;

    PutDataResponse(int i, int i2, DataItemParcelable dataItemParcelable) {
        this.versionCode = i;
        this.statusCode = i2;
        this.zzbDq = dataItemParcelable;
    }

    public PutDataResponse(int i, DataItemParcelable dataItemParcelable) {
        this(1, i, dataItemParcelable);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbf.zza(this, parcel, i);
    }
}
