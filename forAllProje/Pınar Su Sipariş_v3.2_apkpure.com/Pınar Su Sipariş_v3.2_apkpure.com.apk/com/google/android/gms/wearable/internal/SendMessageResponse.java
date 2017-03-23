package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SendMessageResponse extends AbstractSafeParcelable {
    public static final Creator<SendMessageResponse> CREATOR = new zzbi();
    public final int statusCode;
    public final int versionCode;
    public final int zzaUt;

    SendMessageResponse(int i, int i2, int i3) {
        this.versionCode = i;
        this.statusCode = i2;
        this.zzaUt = i3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbi.zza(this, parcel, i);
    }
}
