package com.google.android.gms.drive.events.internal;

import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.drive.events.zzh;
import com.google.android.gms.drive.events.zzj;

public class zza implements zzh {
    private final zzj zzawv;
    private final long zzaww;
    private final long zzawx;

    public zza(TransferProgressData transferProgressData) {
        this.zzawv = new zzb(transferProgressData);
        this.zzaww = transferProgressData.getBytesTransferred();
        this.zzawx = transferProgressData.getTotalBytes();
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zza com_google_android_gms_drive_events_internal_zza = (zza) obj;
        return zzz.equal(this.zzawv, com_google_android_gms_drive_events_internal_zza.zzawv) && this.zzaww == com_google_android_gms_drive_events_internal_zza.zzaww && this.zzawx == com_google_android_gms_drive_events_internal_zza.zzawx;
    }

    public int hashCode() {
        return zzz.hashCode(Long.valueOf(this.zzawx), Long.valueOf(this.zzaww), Long.valueOf(this.zzawx));
    }

    public String toString() {
        return String.format("FileTransferProgress[FileTransferState: %s, BytesTransferred: %d, TotalBytes: %d]", new Object[]{this.zzawv.toString(), Long.valueOf(this.zzaww), Long.valueOf(this.zzawx)});
    }
}
