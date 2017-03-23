package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetCloudSyncSettingResponse extends AbstractSafeParcelable {
    public static final Creator<GetCloudSyncSettingResponse> CREATOR = new zzan();
    public final boolean enabled;
    public final int statusCode;
    public final int versionCode;

    GetCloudSyncSettingResponse(int i, int i2, boolean z) {
        this.versionCode = i;
        this.statusCode = i2;
        this.enabled = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzan.zza(this, parcel, i);
    }
}
