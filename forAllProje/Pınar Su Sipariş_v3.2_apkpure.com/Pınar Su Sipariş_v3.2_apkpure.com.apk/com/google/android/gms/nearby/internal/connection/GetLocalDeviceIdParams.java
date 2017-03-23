package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class GetLocalDeviceIdParams extends AbstractSafeParcelable {
    public static final Creator<GetLocalDeviceIdParams> CREATOR = new zzg();
    final int versionCode;

    public GetLocalDeviceIdParams() {
        this(1);
    }

    GetLocalDeviceIdParams(int i) {
        this.versionCode = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzg.zza(this, parcel, i);
    }
}
