package com.google.android.gms.drive.events.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.drive.DriveId;

public class TransferProgressData extends AbstractSafeParcelable {
    public static final Creator<TransferProgressData> CREATOR = new zzc();
    final int mVersionCode;
    final int zzDO;
    final DriveId zzauZ;
    final int zzawt;
    final long zzaww;
    final long zzawx;

    TransferProgressData(int i, int i2, DriveId driveId, int i3, long j, long j2) {
        this.mVersionCode = i;
        this.zzawt = i2;
        this.zzauZ = driveId;
        this.zzDO = i3;
        this.zzaww = j;
        this.zzawx = j2;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        TransferProgressData transferProgressData = (TransferProgressData) obj;
        return this.zzawt == transferProgressData.zzawt && zzz.equal(this.zzauZ, transferProgressData.zzauZ) && this.zzDO == transferProgressData.zzDO && this.zzaww == transferProgressData.zzaww && this.zzawx == transferProgressData.zzawx;
    }

    public long getBytesTransferred() {
        return this.zzaww;
    }

    public DriveId getDriveId() {
        return this.zzauZ;
    }

    public int getStatus() {
        return this.zzDO;
    }

    public long getTotalBytes() {
        return this.zzawx;
    }

    public int hashCode() {
        return zzz.hashCode(Integer.valueOf(this.zzawt), this.zzauZ, Integer.valueOf(this.zzDO), Long.valueOf(this.zzaww), Long.valueOf(this.zzawx));
    }

    public String toString() {
        return String.format("TransferProgressData[TransferType: %d, DriveId: %s, status: %d, bytes transferred: %d, total bytes: %d]", new Object[]{Integer.valueOf(this.zzawt), this.zzauZ, Integer.valueOf(this.zzDO), Long.valueOf(this.zzaww), Long.valueOf(this.zzawx)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc.zza(this, parcel, i);
    }

    public int zzwk() {
        return this.zzawt;
    }
}
