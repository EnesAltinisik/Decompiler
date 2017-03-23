package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionApi;

public class zza implements ActivityRecognitionApi {

    private static abstract class a extends com.google.android.gms.location.ActivityRecognition.zza<Status> {
        public a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public Status a(Status status) {
            return status;
        }

        public /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    public PendingResult<Status> removeActivityUpdates(GoogleApiClient googleApiClient, final PendingIntent pendingIntent) {
        return googleApiClient.zzd(new a(this, googleApiClient) {
            final /* synthetic */ zza b;

            protected void a(zzl com_google_android_gms_location_internal_zzl) throws RemoteException {
                com_google_android_gms_location_internal_zzl.zza(pendingIntent);
                zzb(Status.zzalw);
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<Status> requestActivityUpdates(GoogleApiClient googleApiClient, long j, PendingIntent pendingIntent) {
        final long j2 = j;
        final PendingIntent pendingIntent2 = pendingIntent;
        return googleApiClient.zzd(new a(this, googleApiClient) {
            final /* synthetic */ zza c;

            protected void a(zzl com_google_android_gms_location_internal_zzl) throws RemoteException {
                com_google_android_gms_location_internal_zzl.zza(j2, pendingIntent2);
                zzb(Status.zzalw);
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }
}
