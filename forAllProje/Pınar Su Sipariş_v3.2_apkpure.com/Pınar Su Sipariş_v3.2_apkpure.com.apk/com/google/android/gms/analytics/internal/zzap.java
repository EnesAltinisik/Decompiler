package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

public class zzap extends zzd {
    protected boolean zzUa;
    protected String zzVd;
    protected String zzVe;
    protected int zzXw;
    protected int zzYy;
    protected boolean zzZp;
    protected boolean zzZq;

    public zzap(zzf com_google_android_gms_analytics_internal_zzf) {
        super(com_google_android_gms_analytics_internal_zzf);
    }

    private static int zzcc(String str) {
        String toLowerCase = str.toLowerCase();
        return "verbose".equals(toLowerCase) ? 0 : "info".equals(toLowerCase) ? 1 : "warning".equals(toLowerCase) ? 2 : "error".equals(toLowerCase) ? 3 : -1;
    }

    public int getLogLevel() {
        zzma();
        return this.zzXw;
    }

    void zza(zzaa com_google_android_gms_analytics_internal_zzaa) {
        int zzcc;
        zzbG("Loading global XML config values");
        if (com_google_android_gms_analytics_internal_zzaa.zznJ()) {
            String zzkU = com_google_android_gms_analytics_internal_zzaa.zzkU();
            this.zzVd = zzkU;
            zzb("XML config - app name", zzkU);
        }
        if (com_google_android_gms_analytics_internal_zzaa.zznK()) {
            zzkU = com_google_android_gms_analytics_internal_zzaa.zzkV();
            this.zzVe = zzkU;
            zzb("XML config - app version", zzkU);
        }
        if (com_google_android_gms_analytics_internal_zzaa.zznL()) {
            zzcc = zzcc(com_google_android_gms_analytics_internal_zzaa.zznM());
            if (zzcc >= 0) {
                this.zzXw = zzcc;
                zza("XML config - log level", Integer.valueOf(zzcc));
            }
        }
        if (com_google_android_gms_analytics_internal_zzaa.zznN()) {
            zzcc = com_google_android_gms_analytics_internal_zzaa.zznO();
            this.zzYy = zzcc;
            this.zzZp = true;
            zzb("XML config - dispatch period (sec)", Integer.valueOf(zzcc));
        }
        if (com_google_android_gms_analytics_internal_zzaa.zznP()) {
            boolean zznQ = com_google_android_gms_analytics_internal_zzaa.zznQ();
            this.zzUa = zznQ;
            this.zzZq = true;
            zzb("XML config - dry run", Boolean.valueOf(zznQ));
        }
    }

    protected void zzkO() {
        zzoF();
    }

    public String zzkU() {
        zzma();
        return this.zzVd;
    }

    public String zzkV() {
        zzma();
        return this.zzVe;
    }

    public boolean zznL() {
        zzma();
        return false;
    }

    public boolean zznN() {
        zzma();
        return this.zzZp;
    }

    public boolean zznP() {
        zzma();
        return this.zzZq;
    }

    public boolean zznQ() {
        zzma();
        return this.zzUa;
    }

    public int zzoE() {
        zzma();
        return this.zzYy;
    }

    protected void zzoF() {
        ApplicationInfo applicationInfo;
        Context context = getContext();
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 129);
        } catch (NameNotFoundException e) {
            zzd("PackageManager doesn't know about the app package", e);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            zzbJ("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null) {
            int i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource");
            if (i > 0) {
                zzaa com_google_android_gms_analytics_internal_zzaa = (zzaa) new zzz(zzlO()).zzav(i);
                if (com_google_android_gms_analytics_internal_zzaa != null) {
                    zza(com_google_android_gms_analytics_internal_zzaa);
                }
            }
        }
    }
}
