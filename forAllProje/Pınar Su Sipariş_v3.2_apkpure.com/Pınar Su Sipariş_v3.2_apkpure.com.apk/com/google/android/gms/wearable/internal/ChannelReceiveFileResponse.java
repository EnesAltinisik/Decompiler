package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ChannelReceiveFileResponse extends AbstractSafeParcelable {
    public static final Creator<ChannelReceiveFileResponse> CREATOR = new zzr();
    public final int statusCode;
    public final int versionCode;

    ChannelReceiveFileResponse(int i, int i2) {
        this.versionCode = i;
        this.statusCode = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzr.zza(this, parcel, i);
    }
}
