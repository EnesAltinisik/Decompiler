package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class OnPinnedDownloadPreferencesResponse extends AbstractSafeParcelable {
    public static final Creator<OnPinnedDownloadPreferencesResponse> CREATOR = new zzbc();
    final int mVersionCode;
    final ParcelableTransferPreferences zzayP;

    OnPinnedDownloadPreferencesResponse(int i, ParcelableTransferPreferences parcelableTransferPreferences) {
        this.mVersionCode = i;
        this.zzayP = parcelableTransferPreferences;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbc.zza(this, parcel, i);
    }
}
