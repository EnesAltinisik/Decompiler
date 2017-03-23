package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class CloseChannelResponse extends AbstractSafeParcelable {
    public static final Creator<CloseChannelResponse> CREATOR = new zzv();
    public final int statusCode;
    public final int versionCode;

    CloseChannelResponse(int i, int i2) {
        this.versionCode = i;
        this.statusCode = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzv.zza(this, parcel, i);
    }
}
