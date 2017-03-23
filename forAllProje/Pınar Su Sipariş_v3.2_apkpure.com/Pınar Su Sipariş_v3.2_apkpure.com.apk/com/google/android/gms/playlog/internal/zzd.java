package com.google.android.gms.playlog.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzd.zzb;
import com.google.android.gms.common.internal.zzd.zzc;
import com.google.android.gms.internal.zztd.zza;

public class zzd implements zzb, zzc {
    private zzf zzbkM = null;
    private final zza zzbkX;
    private boolean zzbkY = true;

    public zzd(zza com_google_android_gms_internal_zztd_zza) {
        this.zzbkX = com_google_android_gms_internal_zztd_zza;
    }

    public void onConnected(Bundle bundle) {
        this.zzbkM.zzaB(false);
        if (this.zzbkY && this.zzbkX != null) {
            this.zzbkX.zzIe();
        }
        this.zzbkY = false;
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzbkM.zzaB(true);
        if (this.zzbkY && this.zzbkX != null) {
            if (connectionResult.hasResolution()) {
                this.zzbkX.zzc(connectionResult.getResolution());
            } else {
                this.zzbkX.zzIf();
            }
        }
        this.zzbkY = false;
    }

    public void onConnectionSuspended(int i) {
        this.zzbkM.zzaB(true);
    }

    public void zza(zzf com_google_android_gms_playlog_internal_zzf) {
        this.zzbkM = com_google_android_gms_playlog_internal_zzf;
    }

    public void zzaA(boolean z) {
        this.zzbkY = z;
    }
}
