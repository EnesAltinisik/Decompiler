package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetCloudSyncOptInStatusResponse extends AbstractSafeParcelable {
    public static final Creator<GetCloudSyncOptInStatusResponse> CREATOR = new zzam();
    public final int statusCode;
    public final int versionCode;
    public final boolean zzbDl;
    public final boolean zzbDm;

    GetCloudSyncOptInStatusResponse(int i, int i2, boolean z, boolean z2) {
        this.versionCode = i;
        this.statusCode = i2;
        this.zzbDl = z;
        this.zzbDm = z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzam.zza(this, parcel, i);
    }
}
