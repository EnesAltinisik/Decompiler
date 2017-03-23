package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ChannelSendFileResponse extends AbstractSafeParcelable {
    public static final Creator<ChannelSendFileResponse> CREATOR = new zzs();
    public final int statusCode;
    public final int versionCode;

    ChannelSendFileResponse(int i, int i2) {
        this.versionCode = i;
        this.statusCode = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzs.zza(this, parcel, i);
    }
}
