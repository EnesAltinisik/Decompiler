package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.internal.zznt.zza;
import java.util.Collections;

public class zzoe implements zzog {
    private final zzoh zzamB;

    public zzoe(zzoh com_google_android_gms_internal_zzoh) {
        this.zzamB = com_google_android_gms_internal_zzoh;
    }

    public void begin() {
        this.zzamB.zzso();
        this.zzamB.zzamm.zzano = Collections.emptySet();
    }

    public void connect() {
        this.zzamB.zzsm();
    }

    public boolean disconnect() {
        return true;
    }

    public void onConnected(Bundle bundle) {
    }

    public void onConnectionSuspended(int i) {
    }

    public void zza(ConnectionResult connectionResult, Api<?> api, int i) {
    }

    public <A extends zzb, R extends Result, T extends zza<R, A>> T zzc(T t) {
        this.zzamB.zzamm.zzanh.add(t);
        return t;
    }

    public <A extends zzb, T extends zza<? extends Result, A>> T zzd(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
