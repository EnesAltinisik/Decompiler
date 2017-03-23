package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.zzi;

public class CloseContentsAndUpdateMetadataRequest extends AbstractSafeParcelable {
    public static final Creator<CloseContentsAndUpdateMetadataRequest> CREATOR = new zzh();
    final int mVersionCode;
    final boolean zzavA;
    final String zzavv;
    final boolean zzavw;
    final DriveId zzawJ;
    final MetadataBundle zzawK;
    final Contents zzawL;
    final int zzawM;
    final int zzawN;
    final boolean zzawO;

    CloseContentsAndUpdateMetadataRequest(int i, DriveId driveId, MetadataBundle metadataBundle, Contents contents, boolean z, String str, int i2, int i3, boolean z2, boolean z3) {
        this.mVersionCode = i;
        this.zzawJ = driveId;
        this.zzawK = metadataBundle;
        this.zzawL = contents;
        this.zzavw = z;
        this.zzavv = str;
        this.zzawM = i2;
        this.zzawN = i3;
        this.zzawO = z2;
        this.zzavA = z3;
    }

    public CloseContentsAndUpdateMetadataRequest(DriveId driveId, MetadataBundle metadataBundle, int i, boolean z, zzi com_google_android_gms_drive_zzi) {
        this(1, driveId, metadataBundle, null, com_google_android_gms_drive_zzi.zzvL(), com_google_android_gms_drive_zzi.zzvK(), com_google_android_gms_drive_zzi.zzvM(), i, z, com_google_android_gms_drive_zzi.zzvR());
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzh.zza(this, parcel, i);
    }
}
