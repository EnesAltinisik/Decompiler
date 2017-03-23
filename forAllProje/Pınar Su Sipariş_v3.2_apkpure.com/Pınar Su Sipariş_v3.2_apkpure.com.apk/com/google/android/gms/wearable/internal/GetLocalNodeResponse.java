package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetLocalNodeResponse extends AbstractSafeParcelable {
    public static final Creator<GetLocalNodeResponse> CREATOR = new zzat();
    public final int statusCode;
    public final int versionCode;
    public final NodeParcelable zzbDs;

    GetLocalNodeResponse(int i, int i2, NodeParcelable nodeParcelable) {
        this.versionCode = i;
        this.statusCode = i2;
        this.zzbDs = nodeParcelable;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzat.zza(this, parcel, i);
    }
}
