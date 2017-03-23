package com.google.android.gms.drive.events.internal;

import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.zzj;

public class zzb implements zzj {
    private final int zzDO;
    private final DriveId zzauZ;
    private final int zzawt;

    public zzb(TransferProgressData transferProgressData) {
        this.zzauZ = transferProgressData.getDriveId();
        this.zzawt = transferProgressData.zzwk();
        this.zzDO = transferProgressData.getStatus();
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzb com_google_android_gms_drive_events_internal_zzb = (zzb) obj;
        return zzz.equal(this.zzauZ, com_google_android_gms_drive_events_internal_zzb.zzauZ) && this.zzawt == com_google_android_gms_drive_events_internal_zzb.zzawt && this.zzDO == com_google_android_gms_drive_events_internal_zzb.zzDO;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzauZ, Integer.valueOf(this.zzawt), Integer.valueOf(this.zzDO));
    }

    public String toString() {
        return String.format("FileTransferState[TransferType: %d, DriveId: %s, status: %d]", new Object[]{Integer.valueOf(this.zzawt), this.zzauZ, Integer.valueOf(this.zzDO)});
    }
}
