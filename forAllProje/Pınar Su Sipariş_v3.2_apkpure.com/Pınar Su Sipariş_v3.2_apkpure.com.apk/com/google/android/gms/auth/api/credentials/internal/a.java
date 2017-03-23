package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.internal.zznt.zza;

abstract class a<R extends Result> extends zza<R, zzg> {
    a(GoogleApiClient googleApiClient) {
        super(Auth.CREDENTIALS_API, googleApiClient);
    }

    protected abstract void a(Context context, zzk com_google_android_gms_auth_api_credentials_internal_zzk) throws DeadObjectException, RemoteException;

    protected final void a(zzg com_google_android_gms_auth_api_credentials_internal_zzg) throws DeadObjectException, RemoteException {
        a(com_google_android_gms_auth_api_credentials_internal_zzg.getContext(), (zzk) com_google_android_gms_auth_api_credentials_internal_zzg.zztm());
    }

    protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
        a((zzg) com_google_android_gms_common_api_Api_zzb);
    }
}
