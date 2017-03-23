package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzaa;

public class zznw implements ConnectionCallbacks, OnConnectionFailedListener {
    public final Api<?> zzakT;
    private final int zzamk;
    private zzoh zzaml;

    public zznw(Api<?> api, int i) {
        this.zzakT = api;
        this.zzamk = i;
    }

    private void zzrM() {
        zzaa.zzb(this.zzaml, (Object) "Callbacks must be attached to a GoogleApiClient instance before connecting the client.");
    }

    public void onConnected(Bundle bundle) {
        zzrM();
        this.zzaml.onConnected(bundle);
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        zzrM();
        this.zzaml.zza(connectionResult, this.zzakT, this.zzamk);
    }

    public void onConnectionSuspended(int i) {
        zzrM();
        this.zzaml.onConnectionSuspended(i);
    }

    public void zza(zzoh com_google_android_gms_internal_zzoh) {
        this.zzaml = com_google_android_gms_internal_zzoh;
    }
}
