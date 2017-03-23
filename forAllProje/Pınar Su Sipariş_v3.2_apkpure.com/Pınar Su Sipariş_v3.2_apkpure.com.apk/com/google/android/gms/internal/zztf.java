package com.google.android.gms.internal;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.Account;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.Plus.zza;
import com.google.android.gms.plus.internal.zze;

public final class zztf implements Account {

    private static abstract class a extends zza<Status> {
        private a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public Status a(Status status) {
            return status;
        }

        public /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    public void clearDefaultAccount(GoogleApiClient googleApiClient) {
        zze zzf = Plus.zzf(googleApiClient, false);
        if (zzf != null) {
            zzf.zzIk();
        }
    }

    public String getAccountName(GoogleApiClient googleApiClient) {
        return Plus.zzf(googleApiClient, true).getAccountName();
    }

    @SuppressLint({"MissingRemoteException"})
    public PendingResult<Status> revokeAccessAndDisconnect(GoogleApiClient googleApiClient) {
        return googleApiClient.zzd(new a(this, googleApiClient) {
            final /* synthetic */ zztf a;

            protected void a(zze com_google_android_gms_plus_internal_zze) {
                com_google_android_gms_plus_internal_zze.zzu(this);
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }
}
