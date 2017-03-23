package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class OpenContentsRequest extends AbstractSafeParcelable {
    public static final Creator<OpenContentsRequest> CREATOR = new zzbh();
    final int mVersionCode;
    final int zzauY;
    final DriveId zzawJ;
    final int zzayS;

    OpenContentsRequest(int i, DriveId driveId, int i2, int i3) {
        this.mVersionCode = i;
        this.zzawJ = driveId;
        this.zzauY = i2;
        this.zzayS = i3;
    }

    public OpenContentsRequest(DriveId driveId, int i, int i2) {
        this(1, driveId, i, i2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbh.zza(this, parcel, i);
    }
}
