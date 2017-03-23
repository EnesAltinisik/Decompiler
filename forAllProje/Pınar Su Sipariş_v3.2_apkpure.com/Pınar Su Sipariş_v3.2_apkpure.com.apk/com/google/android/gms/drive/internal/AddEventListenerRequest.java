package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import com.google.android.gms.drive.events.TransferProgressOptions;
import com.google.android.gms.drive.events.TransferStateOptions;

public class AddEventListenerRequest extends AbstractSafeParcelable {
    public static final Creator<AddEventListenerRequest> CREATOR = new zza();
    final int mVersionCode;
    final int zzatd;
    final DriveId zzauZ;
    final ChangesAvailableOptions zzavY;
    final TransferStateOptions zzawy;
    final TransferProgressOptions zzawz;

    public AddEventListenerRequest(int i, DriveId driveId) {
        this(1, (DriveId) zzaa.zzz(driveId), i, null, null, null);
    }

    AddEventListenerRequest(int i, DriveId driveId, int i2, ChangesAvailableOptions changesAvailableOptions, TransferStateOptions transferStateOptions, TransferProgressOptions transferProgressOptions) {
        this.mVersionCode = i;
        this.zzauZ = driveId;
        this.zzatd = i2;
        this.zzavY = changesAvailableOptions;
        this.zzawy = transferStateOptions;
        this.zzawz = transferProgressOptions;
    }

    public DriveId getDriveId() {
        return this.zzauZ;
    }

    public int getEventType() {
        return this.zzatd;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }
}
