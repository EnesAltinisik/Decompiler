package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveApi.DriveContentsResult;
import com.google.android.gms.drive.DriveFile.DownloadProgressListener;
import com.google.android.gms.internal.zznt.zzb;

class a extends zzd {
    private final zzb<DriveContentsResult> a;
    private final DownloadProgressListener b;

    a(zzb<DriveContentsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_drive_DriveApi_DriveContentsResult, DownloadProgressListener downloadProgressListener) {
        this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_drive_DriveApi_DriveContentsResult;
        this.b = downloadProgressListener;
    }

    public void onError(Status status) throws RemoteException {
        this.a.setResult(new b(status, null));
    }

    public void zza(OnContentsResponse onContentsResponse) throws RemoteException {
        this.a.setResult(new b(onContentsResponse.zzwu() ? new Status(-1) : Status.zzalw, new zzv(onContentsResponse.zzwt())));
    }

    public void zza(OnDownloadProgressResponse onDownloadProgressResponse) throws RemoteException {
        if (this.b != null) {
            this.b.onProgress(onDownloadProgressResponse.zzww(), onDownloadProgressResponse.zzwx());
        }
    }
}
