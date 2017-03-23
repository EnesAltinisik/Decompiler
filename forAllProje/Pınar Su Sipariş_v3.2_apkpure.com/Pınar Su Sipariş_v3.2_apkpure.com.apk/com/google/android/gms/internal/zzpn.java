package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zznt.zzb;

public final class zzpn implements zzpm {

    private static class a extends zzpk {
        private final zzb<Status> a;

        public a(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status;
        }

        public void zzck(int i) throws RemoteException {
            this.a.setResult(new Status(i));
        }
    }

    public PendingResult<Status> zzf(GoogleApiClient googleApiClient) {
        return googleApiClient.zzd(new a(this, googleApiClient) {
            final /* synthetic */ zzpn a;

            protected void a(zzpp com_google_android_gms_internal_zzpp) throws RemoteException {
                ((zzpr) com_google_android_gms_internal_zzpp.zztm()).zza(new a(this));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzpp) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }
}
