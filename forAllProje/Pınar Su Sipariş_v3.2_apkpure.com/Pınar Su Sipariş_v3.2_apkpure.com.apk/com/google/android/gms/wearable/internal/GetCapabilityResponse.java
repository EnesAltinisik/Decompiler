package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetCapabilityResponse extends AbstractSafeParcelable {
    public static final Creator<GetCapabilityResponse> CREATOR = new zzai();
    public final int statusCode;
    public final int versionCode;
    public final CapabilityInfoParcelable zzbDi;

    GetCapabilityResponse(int i, int i2, CapabilityInfoParcelable capabilityInfoParcelable) {
        this.versionCode = i;
        this.statusCode = i2;
        this.zzbDi = capabilityInfoParcelable;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzai.zza(this, parcel, i);
    }
}
