package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class OnDriveIdResponse extends AbstractSafeParcelable {
    public static final Creator<OnDriveIdResponse> CREATOR = new zzaw();
    final int mVersionCode;
    DriveId zzawJ;

    OnDriveIdResponse(int i, DriveId driveId) {
        this.mVersionCode = i;
        this.zzawJ = driveId;
    }

    public DriveId getDriveId() {
        return this.zzawJ;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzaw.zza(this, parcel, i);
    }
}
