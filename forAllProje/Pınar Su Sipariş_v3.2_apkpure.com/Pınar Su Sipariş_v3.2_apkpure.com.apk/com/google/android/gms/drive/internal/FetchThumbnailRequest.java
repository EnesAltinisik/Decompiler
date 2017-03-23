package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class FetchThumbnailRequest extends AbstractSafeParcelable {
    public static final Creator<FetchThumbnailRequest> CREATOR = new zzaf();
    final int mVersionCode;
    final DriveId zzawJ;

    FetchThumbnailRequest(int i, DriveId driveId) {
        this.mVersionCode = i;
        this.zzawJ = driveId;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzaf.zza(this, parcel, i);
    }
}
