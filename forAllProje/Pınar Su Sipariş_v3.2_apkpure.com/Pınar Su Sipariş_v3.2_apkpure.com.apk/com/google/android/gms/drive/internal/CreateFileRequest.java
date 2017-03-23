package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.zzh;

public class CreateFileRequest extends AbstractSafeParcelable {
    public static final Creator<CreateFileRequest> CREATOR = new zzn();
    final int mVersionCode;
    final String zzavv;
    final String zzavy;
    final boolean zzawD;
    final Contents zzawL;
    final MetadataBundle zzawW;
    final Integer zzawX;
    final DriveId zzawY;
    final int zzawZ;
    final int zzaxa;

    CreateFileRequest(int i, DriveId driveId, MetadataBundle metadataBundle, Contents contents, Integer num, boolean z, String str, int i2, int i3, String str2) {
        if (!(contents == null || i3 == 0)) {
            zzaa.zzb(contents.getRequestId() == i3, (Object) "inconsistent contents reference");
        }
        if ((num == null || num.intValue() == 0) && contents == null && i3 == 0) {
            throw new IllegalArgumentException("Need a valid contents");
        }
        this.mVersionCode = i;
        this.zzawY = (DriveId) zzaa.zzz(driveId);
        this.zzawW = (MetadataBundle) zzaa.zzz(metadataBundle);
        this.zzawL = contents;
        this.zzawX = num;
        this.zzavv = str;
        this.zzawZ = i2;
        this.zzawD = z;
        this.zzaxa = i3;
        this.zzavy = str2;
    }

    public CreateFileRequest(DriveId driveId, MetadataBundle metadataBundle, int i, int i2, zzh com_google_android_gms_drive_zzh) {
        this(2, driveId, metadataBundle, null, Integer.valueOf(i2), com_google_android_gms_drive_zzh.zzvL(), com_google_android_gms_drive_zzh.zzvK(), com_google_android_gms_drive_zzh.zzvM(), i, com_google_android_gms_drive_zzh.zzvO());
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzn.zza(this, parcel, i);
    }
}
