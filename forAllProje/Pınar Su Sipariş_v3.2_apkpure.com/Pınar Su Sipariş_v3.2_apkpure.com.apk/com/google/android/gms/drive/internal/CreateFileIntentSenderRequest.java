package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class CreateFileIntentSenderRequest extends AbstractSafeParcelable {
    public static final Creator<CreateFileIntentSenderRequest> CREATOR = new zzm();
    final int mVersionCode;
    final int zzauX;
    final String zzavG;
    final DriveId zzavJ;
    final MetadataBundle zzawW;
    final Integer zzawX;

    CreateFileIntentSenderRequest(int i, MetadataBundle metadataBundle, int i2, String str, DriveId driveId, Integer num) {
        this.mVersionCode = i;
        this.zzawW = metadataBundle;
        this.zzauX = i2;
        this.zzavG = str;
        this.zzavJ = driveId;
        this.zzawX = num;
    }

    public CreateFileIntentSenderRequest(MetadataBundle metadataBundle, int i, String str, DriveId driveId, int i2) {
        this(1, metadataBundle, i, str, driveId, Integer.valueOf(i2));
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzm.zza(this, parcel, i);
    }
}
