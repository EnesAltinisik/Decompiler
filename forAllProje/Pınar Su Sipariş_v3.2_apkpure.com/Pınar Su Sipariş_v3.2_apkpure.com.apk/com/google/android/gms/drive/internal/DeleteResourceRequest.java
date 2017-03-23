package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class DeleteResourceRequest extends AbstractSafeParcelable {
    public static final Creator<DeleteResourceRequest> CREATOR = new zzq();
    final int mVersionCode;
    final DriveId zzawJ;

    DeleteResourceRequest(int i, DriveId driveId) {
        this.mVersionCode = i;
        this.zzawJ = driveId;
    }

    public DeleteResourceRequest(DriveId driveId) {
        this(1, driveId);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzq.zza(this, parcel, i);
    }
}
