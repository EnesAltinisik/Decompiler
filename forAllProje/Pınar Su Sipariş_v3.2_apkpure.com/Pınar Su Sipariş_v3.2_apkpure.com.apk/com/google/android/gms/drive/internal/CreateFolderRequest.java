package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class CreateFolderRequest extends AbstractSafeParcelable {
    public static final Creator<CreateFolderRequest> CREATOR = new zzo();
    final int mVersionCode;
    final MetadataBundle zzawW;
    final DriveId zzawY;

    CreateFolderRequest(int i, DriveId driveId, MetadataBundle metadataBundle) {
        this.mVersionCode = i;
        this.zzawY = (DriveId) zzaa.zzz(driveId);
        this.zzawW = (MetadataBundle) zzaa.zzz(metadataBundle);
    }

    public CreateFolderRequest(DriveId driveId, MetadataBundle metadataBundle) {
        this(1, driveId, metadataBundle);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzo.zza(this, parcel, i);
    }
}
