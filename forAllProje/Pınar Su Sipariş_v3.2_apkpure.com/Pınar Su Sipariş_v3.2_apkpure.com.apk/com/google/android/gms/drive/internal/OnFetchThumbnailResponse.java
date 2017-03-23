package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class OnFetchThumbnailResponse extends AbstractSafeParcelable {
    public static final Creator<OnFetchThumbnailResponse> CREATOR = new zzay();
    final int mVersionCode;
    final ParcelFileDescriptor zzayM;

    OnFetchThumbnailResponse(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.mVersionCode = i;
        this.zzayM = parcelFileDescriptor;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzay.zza(this, parcel, i | 1);
    }
}
