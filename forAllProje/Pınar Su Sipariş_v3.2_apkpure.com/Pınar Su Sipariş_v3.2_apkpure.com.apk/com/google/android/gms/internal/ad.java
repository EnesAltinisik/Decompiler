package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zznt.zza;

abstract class ad extends zza<ProxyResult, zzmr> {
    public ad(GoogleApiClient googleApiClient) {
        super(Auth.PROXY_API, googleApiClient);
    }

    protected ProxyResult a(Status status) {
        return new ae(status);
    }

    protected abstract void a(Context context, zzmt com_google_android_gms_internal_zzmt) throws RemoteException;

    protected final void a(zzmr com_google_android_gms_internal_zzmr) throws RemoteException {
        a(com_google_android_gms_internal_zzmr.getContext(), (zzmt) com_google_android_gms_internal_zzmr.zztm());
    }

    protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
        a((zzmr) com_google_android_gms_common_api_Api_zzb);
    }

    protected /* synthetic */ Result zzc(Status status) {
        return a(status);
    }
}
