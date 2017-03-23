package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.TransferProgressOptions;

public class RemoveEventListenerRequest extends AbstractSafeParcelable {
    public static final Creator<RemoveEventListenerRequest> CREATOR = new zzbm();
    final int mVersionCode;
    final int zzatd;
    final DriveId zzauZ;
    final TransferProgressOptions zzawz;

    RemoveEventListenerRequest(int i, DriveId driveId, int i2, TransferProgressOptions transferProgressOptions) {
        this.mVersionCode = i;
        this.zzauZ = driveId;
        this.zzatd = i2;
        this.zzawz = transferProgressOptions;
    }

    public RemoveEventListenerRequest(DriveId driveId, int i) {
        this(driveId, i, null);
    }

    RemoveEventListenerRequest(DriveId driveId, int i, TransferProgressOptions transferProgressOptions) {
        this(1, driveId, i, transferProgressOptions);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbm.zza(this, parcel, i);
    }
}
