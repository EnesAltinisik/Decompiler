package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public class ChangeResourceParentsRequest extends AbstractSafeParcelable {
    public static final Creator<ChangeResourceParentsRequest> CREATOR = new zzf();
    final int mVersionCode;
    final DriveId zzawF;
    final List<DriveId> zzawG;
    final List<DriveId> zzawH;

    ChangeResourceParentsRequest(int i, DriveId driveId, List<DriveId> list, List<DriveId> list2) {
        this.mVersionCode = i;
        this.zzawF = driveId;
        this.zzawG = list;
        this.zzawH = list2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzf.zza(this, parcel, i);
    }
}
