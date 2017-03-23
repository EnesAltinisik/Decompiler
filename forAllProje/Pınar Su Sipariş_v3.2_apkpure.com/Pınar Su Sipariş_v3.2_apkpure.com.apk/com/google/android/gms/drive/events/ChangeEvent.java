package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.Locale;

public final class ChangeEvent extends AbstractSafeParcelable implements ResourceEvent {
    public static final Creator<ChangeEvent> CREATOR = new zza();
    final int mVersionCode;
    final DriveId zzauZ;
    final int zzavX;

    ChangeEvent(int i, DriveId driveId, int i2) {
        this.mVersionCode = i;
        this.zzauZ = driveId;
        this.zzavX = i2;
    }

    public DriveId getDriveId() {
        return this.zzauZ;
    }

    public int getType() {
        return 1;
    }

    public boolean hasBeenDeleted() {
        return (this.zzavX & 4) != 0;
    }

    public boolean hasContentChanged() {
        return (this.zzavX & 2) != 0;
    }

    public boolean hasMetadataChanged() {
        return (this.zzavX & 1) != 0;
    }

    public String toString() {
        return String.format(Locale.US, "ChangeEvent [id=%s,changeFlags=%x]", new Object[]{this.zzauZ, Integer.valueOf(this.zzavX)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }
}
