package com.google.android.gms.analytics.internal;

import com.google.android.gms.internal.zzln;

public class zzk extends zzd {
    private final zzln zzUD = new zzln();

    zzk(zzf com_google_android_gms_analytics_internal_zzf) {
        super(com_google_android_gms_analytics_internal_zzf);
    }

    protected void zzkO() {
        zzlT().zzkL().zza(this.zzUD);
        zzks();
    }

    public void zzks() {
        zzap zzkx = zzkx();
        String zzkU = zzkx.zzkU();
        if (zzkU != null) {
            this.zzUD.setAppName(zzkU);
        }
        String zzkV = zzkx.zzkV();
        if (zzkV != null) {
            this.zzUD.setAppVersion(zzkV);
        }
    }

    public zzln zzmx() {
        zzma();
        return this.zzUD;
    }
}
