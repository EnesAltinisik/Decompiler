package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetDataItemResponse extends AbstractSafeParcelable {
    public static final Creator<GetDataItemResponse> CREATOR = new zzar();
    public final int statusCode;
    public final int versionCode;
    public final DataItemParcelable zzbDq;

    GetDataItemResponse(int i, int i2, DataItemParcelable dataItemParcelable) {
        this.versionCode = i;
        this.statusCode = i2;
        this.zzbDq = dataItemParcelable;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzar.zza(this, parcel, i);
    }
}
