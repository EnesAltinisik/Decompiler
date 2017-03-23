package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SetPinnedDownloadPreferencesRequest extends AbstractSafeParcelable {
    public static final Creator<SetPinnedDownloadPreferencesRequest> CREATOR = new zzbp();
    final int mVersionCode;
    final ParcelableTransferPreferences zzayP;

    SetPinnedDownloadPreferencesRequest(int i, ParcelableTransferPreferences parcelableTransferPreferences) {
        this.mVersionCode = i;
        this.zzayP = parcelableTransferPreferences;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbp.zza(this, parcel, i);
    }
}
