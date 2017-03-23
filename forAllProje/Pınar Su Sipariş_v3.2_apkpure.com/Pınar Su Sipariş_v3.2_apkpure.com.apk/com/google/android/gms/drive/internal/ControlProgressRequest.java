package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class ControlProgressRequest extends AbstractSafeParcelable {
    public static final Creator<ControlProgressRequest> CREATOR = new zzj();
    final int mVersionCode;
    final DriveId zzauZ;
    final int zzawQ;
    final int zzawR;
    final ParcelableTransferPreferences zzawS;

    ControlProgressRequest(int i, int i2, int i3, DriveId driveId, ParcelableTransferPreferences parcelableTransferPreferences) {
        this.mVersionCode = i;
        this.zzawQ = i2;
        this.zzawR = i3;
        this.zzauZ = driveId;
        this.zzawS = parcelableTransferPreferences;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzj.zza(this, parcel, i);
    }
}
