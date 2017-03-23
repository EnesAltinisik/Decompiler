package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class GetAllCapabilitiesResponse extends AbstractSafeParcelable {
    public static final Creator<GetAllCapabilitiesResponse> CREATOR = new zzah();
    public final int statusCode;
    public final int versionCode;
    public final List<CapabilityInfoParcelable> zzbDh;

    GetAllCapabilitiesResponse(int i, int i2, List<CapabilityInfoParcelable> list) {
        this.versionCode = i;
        this.statusCode = i2;
        this.zzbDh = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzah.zza(this, parcel, i);
    }
}
