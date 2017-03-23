package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

@Deprecated
public class GetConfigResponse extends AbstractSafeParcelable {
    public static final Creator<GetConfigResponse> CREATOR = new zzao();
    public final int statusCode;
    public final int versionCode;
    public final ConnectionConfiguration zzbDn;

    GetConfigResponse(int i, int i2, ConnectionConfiguration connectionConfiguration) {
        this.versionCode = i;
        this.statusCode = i2;
        this.zzbDn = connectionConfiguration;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzao.zza(this, parcel, i);
    }
}
