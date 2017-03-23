package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DeleteDataItemsResponse extends AbstractSafeParcelable {
    public static final Creator<DeleteDataItemsResponse> CREATOR = new zzag();
    public final int statusCode;
    public final int versionCode;
    public final int zzbDg;

    DeleteDataItemsResponse(int i, int i2, int i3) {
        this.versionCode = i;
        this.statusCode = i2;
        this.zzbDg = i3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzag.zza(this, parcel, i);
    }
}
