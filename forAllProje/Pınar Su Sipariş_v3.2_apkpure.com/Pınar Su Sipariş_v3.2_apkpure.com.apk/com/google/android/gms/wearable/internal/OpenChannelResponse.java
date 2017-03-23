package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class OpenChannelResponse extends AbstractSafeParcelable {
    public static final Creator<OpenChannelResponse> CREATOR = new zzbd();
    public final int statusCode;
    public final int versionCode;
    public final ChannelImpl zzbCJ;

    OpenChannelResponse(int i, int i2, ChannelImpl channelImpl) {
        this.versionCode = i;
        this.statusCode = i2;
        this.zzbCJ = channelImpl;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbd.zza(this, parcel, i);
    }
}
