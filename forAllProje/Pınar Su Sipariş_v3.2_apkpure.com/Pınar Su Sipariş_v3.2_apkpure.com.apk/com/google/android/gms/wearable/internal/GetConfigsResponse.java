package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

public class GetConfigsResponse extends AbstractSafeParcelable {
    public static final Creator<GetConfigsResponse> CREATOR = new zzap();
    public final int statusCode;
    public final int versionCode;
    public final ConnectionConfiguration[] zzbDo;

    GetConfigsResponse(int i, int i2, ConnectionConfiguration[] connectionConfigurationArr) {
        this.versionCode = i;
        this.statusCode = i2;
        this.zzbDo = connectionConfigurationArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzap.zza(this, parcel, i);
    }
}
