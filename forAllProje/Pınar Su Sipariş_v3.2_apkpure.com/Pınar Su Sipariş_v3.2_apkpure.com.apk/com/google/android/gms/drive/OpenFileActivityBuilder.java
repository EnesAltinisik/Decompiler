package com.google.android.gms.drive;

import android.content.IntentSender;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.drive.internal.OpenFileIntentSenderRequest;
import com.google.android.gms.drive.internal.zzu;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.internal.FilterHolder;
import com.google.android.gms.drive.query.internal.zzg;

public class OpenFileActivityBuilder {
    public static final String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
    private String zzavG;
    private String[] zzavH;
    private Filter zzavI;
    private DriveId zzavJ;

    public IntentSender build(GoogleApiClient googleApiClient) {
        zzaa.zza(googleApiClient.isConnected(), (Object) "Client must be connected");
        if (this.zzavH == null) {
            this.zzavH = new String[0];
        }
        if (this.zzavH.length <= 0 || this.zzavI == null) {
            try {
                return ((zzu) googleApiClient.zza(Drive.zzaaz)).zzwn().zza(new OpenFileIntentSenderRequest(this.zzavG, this.zzavH, this.zzavJ, this.zzavI == null ? null : new FilterHolder(this.zzavI)));
            } catch (Throwable e) {
                throw new RuntimeException("Unable to connect Drive Play Service", e);
            }
        }
        throw new IllegalStateException("Cannot use a selection filter and set mimetypes simultaneously");
    }

    public OpenFileActivityBuilder setActivityStartFolder(DriveId driveId) {
        this.zzavJ = (DriveId) zzaa.zzz(driveId);
        return this;
    }

    public OpenFileActivityBuilder setActivityTitle(String str) {
        this.zzavG = (String) zzaa.zzz(str);
        return this;
    }

    public OpenFileActivityBuilder setMimeType(String[] strArr) {
        zzaa.zzb(strArr != null, (Object) "mimeTypes may not be null");
        this.zzavH = strArr;
        return this;
    }

    public OpenFileActivityBuilder setSelectionFilter(Filter filter) {
        boolean z = true;
        zzaa.zzb(filter != null, (Object) "filter may not be null");
        if (zzg.zza(filter)) {
            z = false;
        }
        zzaa.zzb(z, (Object) "FullTextSearchFilter cannot be used as a selection filter");
        this.zzavI = filter;
        return this;
    }
}
