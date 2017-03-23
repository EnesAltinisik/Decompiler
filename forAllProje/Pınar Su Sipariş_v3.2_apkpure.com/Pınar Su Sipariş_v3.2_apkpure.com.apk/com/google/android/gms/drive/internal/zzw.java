package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.drive.DriveApi.DriveContentsResult;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFile.DownloadProgressListener;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.internal.zzou;
import com.google.android.gms.internal.zzou.zzb;

public class zzw extends zzab implements DriveFile {

    private static class a implements DownloadProgressListener {
        private final zzou<DownloadProgressListener> a;

        public a(zzou<DownloadProgressListener> com_google_android_gms_internal_zzou_com_google_android_gms_drive_DriveFile_DownloadProgressListener) {
            this.a = com_google_android_gms_internal_zzou_com_google_android_gms_drive_DriveFile_DownloadProgressListener;
        }

        public void onProgress(long j, long j2) {
            final long j3 = j;
            final long j4 = j2;
            this.a.zza(new zzb<DownloadProgressListener>(this) {
                final /* synthetic */ a c;

                public void a(DownloadProgressListener downloadProgressListener) {
                    downloadProgressListener.onProgress(j3, j4);
                }

                public void zzrV() {
                }

                public /* synthetic */ void zzt(Object obj) {
                    a((DownloadProgressListener) obj);
                }
            });
        }
    }

    public zzw(DriveId driveId) {
        super(driveId);
    }

    private static DownloadProgressListener zza(GoogleApiClient googleApiClient, DownloadProgressListener downloadProgressListener) {
        return downloadProgressListener == null ? null : new a(googleApiClient.zzs(downloadProgressListener));
    }

    public PendingResult<DriveContentsResult> open(GoogleApiClient googleApiClient, final int i, DownloadProgressListener downloadProgressListener) {
        if (i == DriveFile.MODE_READ_ONLY || i == DriveFile.MODE_WRITE_ONLY || i == DriveFile.MODE_READ_WRITE) {
            final DownloadProgressListener zza = zza(googleApiClient, downloadProgressListener);
            return googleApiClient.zzc(new c(this, googleApiClient) {
                final /* synthetic */ zzw c;

                protected void a(zzu com_google_android_gms_drive_internal_zzu) throws RemoteException {
                    zza(com_google_android_gms_drive_internal_zzu.zzwn().zza(new OpenContentsRequest(this.c.getDriveId(), i, 0), new a(this, zza)).zzws());
                }

                protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                    a((zzu) com_google_android_gms_common_api_Api_zzb);
                }
            });
        }
        throw new IllegalArgumentException("Invalid mode provided.");
    }
}
