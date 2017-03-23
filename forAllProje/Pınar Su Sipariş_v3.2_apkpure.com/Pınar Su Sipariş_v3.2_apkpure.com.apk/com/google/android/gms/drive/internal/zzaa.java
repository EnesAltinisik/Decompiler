package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DrivePreferencesApi;
import com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult;
import com.google.android.gms.drive.FileUploadPreferences;
import com.google.android.gms.drive.internal.zzt.zza;
import com.google.android.gms.internal.zznt.zzb;

public class zzaa implements DrivePreferencesApi {

    private abstract class c extends zzt<FileUploadPreferencesResult> {
        final /* synthetic */ zzaa b;

        public c(zzaa com_google_android_gms_drive_internal_zzaa, GoogleApiClient googleApiClient) {
            this.b = com_google_android_gms_drive_internal_zzaa;
            super(googleApiClient);
        }

        protected FileUploadPreferencesResult a(Status status) {
            return new b(status, null);
        }

        protected /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    private class a extends zzd {
        final /* synthetic */ zzaa a;
        private final zzb<FileUploadPreferencesResult> b;

        private a(zzaa com_google_android_gms_drive_internal_zzaa, zzb<FileUploadPreferencesResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_drive_DrivePreferencesApi_FileUploadPreferencesResult) {
            this.a = com_google_android_gms_drive_internal_zzaa;
            this.b = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_drive_DrivePreferencesApi_FileUploadPreferencesResult;
        }

        public void onError(Status status) throws RemoteException {
            this.b.setResult(new b(status, null));
        }

        public void zza(OnDeviceUsagePreferenceResponse onDeviceUsagePreferenceResponse) throws RemoteException {
            this.b.setResult(new b(Status.zzalw, onDeviceUsagePreferenceResponse.zzwv()));
        }
    }

    private class b implements FileUploadPreferencesResult {
        final /* synthetic */ zzaa a;
        private final Status b;
        private final FileUploadPreferences c;

        private b(zzaa com_google_android_gms_drive_internal_zzaa, Status status, FileUploadPreferences fileUploadPreferences) {
            this.a = com_google_android_gms_drive_internal_zzaa;
            this.b = status;
            this.c = fileUploadPreferences;
        }

        public FileUploadPreferences getFileUploadPreferences() {
            return this.c;
        }

        public Status getStatus() {
            return this.b;
        }
    }

    public PendingResult<FileUploadPreferencesResult> getFileUploadPreferences(GoogleApiClient googleApiClient) {
        return googleApiClient.zzc(new c(this, googleApiClient) {
            final /* synthetic */ zzaa a;

            protected void a(zzu com_google_android_gms_drive_internal_zzu) throws RemoteException {
                com_google_android_gms_drive_internal_zzu.zzwn().zzd(new a(this));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzu) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<Status> setFileUploadPreferences(GoogleApiClient googleApiClient, FileUploadPreferences fileUploadPreferences) {
        if (fileUploadPreferences instanceof FileUploadPreferencesImpl) {
            final FileUploadPreferencesImpl fileUploadPreferencesImpl = (FileUploadPreferencesImpl) fileUploadPreferences;
            return googleApiClient.zzd(new zza(this, googleApiClient) {
                final /* synthetic */ zzaa b;

                protected void a(zzu com_google_android_gms_drive_internal_zzu) throws RemoteException {
                    com_google_android_gms_drive_internal_zzu.zzwn().zza(new SetFileUploadPreferencesRequest(fileUploadPreferencesImpl), new zzbr(this));
                }

                protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                    a((zzu) com_google_android_gms_common_api_Api_zzb);
                }
            });
        }
        throw new IllegalArgumentException("Invalid preference value");
    }
}
