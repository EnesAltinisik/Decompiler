package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetChannelInputStreamResponse extends AbstractSafeParcelable {
    public static final Creator<GetChannelInputStreamResponse> CREATOR = new zzaj();
    public final int statusCode;
    public final int versionCode;
    public final ParcelFileDescriptor zzbDj;

    GetChannelInputStreamResponse(int i, int i2, ParcelFileDescriptor parcelFileDescriptor) {
        this.versionCode = i;
        this.statusCode = i2;
        this.zzbDj = parcelFileDescriptor;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzaj.zza(this, parcel, i);
    }
}
