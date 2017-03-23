package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zznt.zzb;
import com.google.android.gms.internal.zzou;

final class b<T> extends e<Status> {
    private T a;
    private zzou<T> b;
    private a<T> c;

    interface a<T> {
        void a(zzbp com_google_android_gms_wearable_internal_zzbp, zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, T t, zzou<T> com_google_android_gms_internal_zzou_T) throws RemoteException;
    }

    private b(GoogleApiClient googleApiClient, T t, zzou<T> com_google_android_gms_internal_zzou_T, a<T> aVar) {
        super(googleApiClient);
        this.a = zzaa.zzz(t);
        this.b = (zzou) zzaa.zzz(com_google_android_gms_internal_zzou_T);
        this.c = (a) zzaa.zzz(aVar);
    }

    static <T> PendingResult<Status> a(GoogleApiClient googleApiClient, a<T> aVar, T t) {
        return googleApiClient.zzc(new b(googleApiClient, t, googleApiClient.zzs(t), aVar));
    }

    protected Status a(Status status) {
        this.a = null;
        this.b = null;
        return status;
    }

    protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
        this.c.a(com_google_android_gms_wearable_internal_zzbp, this, this.a, this.b);
        this.a = null;
        this.b = null;
    }

    protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
        a((zzbp) com_google_android_gms_common_api_Api_zzb);
    }

    protected /* synthetic */ Result zzc(Status status) {
        return a(status);
    }
}
