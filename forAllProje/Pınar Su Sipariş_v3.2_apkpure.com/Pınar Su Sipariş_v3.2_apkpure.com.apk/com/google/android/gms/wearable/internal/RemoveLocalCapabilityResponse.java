package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class RemoveLocalCapabilityResponse extends AbstractSafeParcelable {
    public static final Creator<RemoveLocalCapabilityResponse> CREATOR = new zzbh();
    public final int statusCode;
    public final int versionCode;

    RemoveLocalCapabilityResponse(int i, int i2) {
        this.versionCode = i;
        this.statusCode = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbh.zza(this, parcel, i);
    }
}
