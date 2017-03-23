package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.Auth.AuthCredentialsOptions;
import com.google.android.gms.auth.api.credentials.internal.zzk.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzk;

public final class zzg extends zzk<zzk> {
    private final AuthCredentialsOptions zzaca;

    public zzg(Context context, Looper looper, com.google.android.gms.common.internal.zzg com_google_android_gms_common_internal_zzg, AuthCredentialsOptions authCredentialsOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 68, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        this.zzaca = authCredentialsOptions;
    }

    protected /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzaz(iBinder);
    }

    protected zzk zzaz(IBinder iBinder) {
        return zza.zzaB(iBinder);
    }

    protected String zzhT() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    protected String zzhU() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    protected Bundle zzoO() {
        return this.zzaca == null ? new Bundle() : this.zzaca.zzoO();
    }

    AuthCredentialsOptions zzpc() {
        return this.zzaca;
    }
}
