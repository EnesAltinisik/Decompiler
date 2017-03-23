package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.Auth.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzk;

public final class zzmr extends zzk<zzmt> {
    private final Bundle zzacb;

    public zzmr(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, zza com_google_android_gms_auth_api_Auth_zza, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 16, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        this.zzacb = com_google_android_gms_auth_api_Auth_zza == null ? new Bundle() : com_google_android_gms_auth_api_Auth_zza.zzoV();
    }

    protected zzmt zzaC(IBinder iBinder) {
        return zzmt.zza.zzaE(iBinder);
    }

    protected /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzaC(iBinder);
    }

    protected String zzhT() {
        return "com.google.android.gms.auth.service.START";
    }

    protected String zzhU() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    protected Bundle zzoO() {
        return this.zzacb;
    }

    public boolean zzpd() {
        zzg zztH = zztH();
        return (TextUtils.isEmpty(zztH.getAccountName()) || zztH.zzb(Auth.PROXY_API).isEmpty()) ? false : true;
    }
}
