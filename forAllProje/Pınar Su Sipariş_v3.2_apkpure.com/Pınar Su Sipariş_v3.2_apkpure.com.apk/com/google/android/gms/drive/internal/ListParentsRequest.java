package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class ListParentsRequest extends AbstractSafeParcelable {
    public static final Creator<ListParentsRequest> CREATOR = new zzaq();
    final int mVersionCode;
    final DriveId zzayq;

    ListParentsRequest(int i, DriveId driveId) {
        this.mVersionCode = i;
        this.zzayq = driveId;
    }

    public ListParentsRequest(DriveId driveId) {
        this(1, driveId);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzaq.zza(this, parcel, i);
    }
}
