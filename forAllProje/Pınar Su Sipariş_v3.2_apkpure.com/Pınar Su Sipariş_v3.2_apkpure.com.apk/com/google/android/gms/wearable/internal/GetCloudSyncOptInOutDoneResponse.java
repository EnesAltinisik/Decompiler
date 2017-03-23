package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetCloudSyncOptInOutDoneResponse extends AbstractSafeParcelable {
    public static final Creator<GetCloudSyncOptInOutDoneResponse> CREATOR = new zzal();
    public final int statusCode;
    public final int versionCode;
    public final boolean zzbDk;

    GetCloudSyncOptInOutDoneResponse(int i, int i2, boolean z) {
        this.versionCode = i;
        this.statusCode = i2;
        this.zzbDk = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzal.zza(this, parcel, i);
    }
}
