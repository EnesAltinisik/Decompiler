package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class StreamContentsRequest extends AbstractSafeParcelable {
    public static final Creator<StreamContentsRequest> CREATOR = new zzbs();
    final int mVersionCode;
    final DriveId zzawJ;

    StreamContentsRequest(int i, DriveId driveId) {
        this.mVersionCode = i;
        this.zzawJ = driveId;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbs.zza(this, parcel, i);
    }
}
