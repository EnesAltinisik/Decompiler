package com.google.android.gms.drive;

import android.content.IntentSender;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.drive.internal.zzl;
import com.google.android.gms.drive.internal.zzv;

public class CreateFileActivityBuilder {
    public static final String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
    private final zzl zzavb = new zzl(0);
    private DriveContents zzavc;
    private boolean zzavd;

    public IntentSender build(GoogleApiClient googleApiClient) {
        zzaa.zzb(Boolean.valueOf(this.zzavd), (Object) "Must call setInitialDriveContents to CreateFileActivityBuilder.");
        zzaa.zza(googleApiClient.isConnected(), (Object) "Client must be connected");
        if (this.zzavc != null) {
            this.zzavc.zzvH();
        }
        return this.zzavb.build(googleApiClient);
    }

    public CreateFileActivityBuilder setActivityStartFolder(DriveId driveId) {
        this.zzavb.zza(driveId);
        return this;
    }

    public CreateFileActivityBuilder setActivityTitle(String str) {
        this.zzavb.zzdB(str);
        return this;
    }

    public CreateFileActivityBuilder setInitialDriveContents(DriveContents driveContents) {
        if (driveContents == null) {
            this.zzavb.zzdp(1);
        } else if (!(driveContents instanceof zzv)) {
            throw new IllegalArgumentException("Only DriveContents obtained from the Drive API are accepted.");
        } else if (driveContents.getDriveId() != null) {
            throw new IllegalArgumentException("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
        } else if (driveContents.zzvI()) {
            throw new IllegalArgumentException("DriveContents are already closed.");
        } else {
            this.zzavb.zzdp(driveContents.zzvG().getRequestId());
            this.zzavc = driveContents;
        }
        this.zzavd = true;
        return this;
    }

    public CreateFileActivityBuilder setInitialMetadata(MetadataChangeSet metadataChangeSet) {
        this.zzavb.zza(metadataChangeSet);
        return this;
    }
}
