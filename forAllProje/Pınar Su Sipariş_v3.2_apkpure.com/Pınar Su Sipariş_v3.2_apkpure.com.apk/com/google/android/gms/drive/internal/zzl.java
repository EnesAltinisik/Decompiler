package com.google.android.gms.drive.internal;

import android.content.IntentSender;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;

public class zzl {
    private String zzavG;
    private DriveId zzavJ;
    protected MetadataChangeSet zzawT;
    private Integer zzawU;
    private final int zzawV;

    public zzl(int i) {
        this.zzawV = i;
    }

    public IntentSender build(GoogleApiClient googleApiClient) {
        zzaa.zzb(this.zzawT, (Object) "Must provide initial metadata to CreateFileActivityBuilder.");
        zzaa.zza(googleApiClient.isConnected(), (Object) "Client must be connected");
        zzu com_google_android_gms_drive_internal_zzu = (zzu) googleApiClient.zza(Drive.zzaaz);
        this.zzawT.zzvU().setContext(com_google_android_gms_drive_internal_zzu.getContext());
        try {
            return com_google_android_gms_drive_internal_zzu.zzwn().zza(new CreateFileIntentSenderRequest(this.zzawT.zzvU(), this.zzawU == null ? 0 : this.zzawU.intValue(), this.zzavG, this.zzavJ, this.zzawV));
        } catch (Throwable e) {
            throw new RuntimeException("Unable to connect Drive Play Service", e);
        }
    }

    public void zza(DriveId driveId) {
        this.zzavJ = (DriveId) zzaa.zzz(driveId);
    }

    public void zza(MetadataChangeSet metadataChangeSet) {
        this.zzawT = (MetadataChangeSet) zzaa.zzz(metadataChangeSet);
    }

    public void zzdB(String str) {
        this.zzavG = (String) zzaa.zzz(str);
    }

    public void zzdp(int i) {
        this.zzawU = Integer.valueOf(i);
    }
}
