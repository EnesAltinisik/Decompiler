package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.drive.DriveFile;

public class CreateContentsRequest extends AbstractSafeParcelable {
    public static final Creator<CreateContentsRequest> CREATOR = new zzk();
    final int mVersionCode;
    final int zzauY;

    public CreateContentsRequest(int i) {
        this(1, i);
    }

    CreateContentsRequest(int i, int i2) {
        this.mVersionCode = i;
        boolean z = i2 == DriveFile.MODE_WRITE_ONLY || i2 == DriveFile.MODE_READ_WRITE;
        zzaa.zzb(z, (Object) "Cannot create a new read-only contents!");
        this.zzauY = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzk.zza(this, parcel, i);
    }
}
