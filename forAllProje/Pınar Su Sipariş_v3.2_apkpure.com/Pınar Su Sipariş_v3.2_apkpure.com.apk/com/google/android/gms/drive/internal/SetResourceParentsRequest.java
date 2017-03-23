package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public class SetResourceParentsRequest extends AbstractSafeParcelable {
    public static final Creator<SetResourceParentsRequest> CREATOR = new zzbq();
    final int mVersionCode;
    final DriveId zzawF;
    final List<DriveId> zzayX;

    SetResourceParentsRequest(int i, DriveId driveId, List<DriveId> list) {
        this.mVersionCode = i;
        this.zzawF = driveId;
        this.zzayX = list;
    }

    public SetResourceParentsRequest(DriveId driveId, List<DriveId> list) {
        this(1, driveId, list);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbq.zza(this, parcel, i);
    }
}
