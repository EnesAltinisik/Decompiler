package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetFdForAssetResponse extends AbstractSafeParcelable {
    public static final Creator<GetFdForAssetResponse> CREATOR = new zzas();
    public final int statusCode;
    public final int versionCode;
    public final ParcelFileDescriptor zzbDr;

    GetFdForAssetResponse(int i, int i2, ParcelFileDescriptor parcelFileDescriptor) {
        this.versionCode = i;
        this.statusCode = i2;
        this.zzbDr = parcelFileDescriptor;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzas.zza(this, parcel, i | 1);
    }
}
