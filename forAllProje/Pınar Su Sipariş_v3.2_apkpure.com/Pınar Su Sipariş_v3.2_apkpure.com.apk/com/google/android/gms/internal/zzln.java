package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzg;
import java.util.HashMap;
import java.util.Map;

public final class zzln extends zzg<zzln> {
    private String zzPx;
    private String zzVd;
    private String zzVe;
    private String zzVf;

    public void setAppId(String str) {
        this.zzPx = str;
    }

    public void setAppInstallerId(String str) {
        this.zzVf = str;
    }

    public void setAppName(String str) {
        this.zzVd = str;
    }

    public void setAppVersion(String str) {
        this.zzVe = str;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("appName", this.zzVd);
        hashMap.put("appVersion", this.zzVe);
        hashMap.put("appId", this.zzPx);
        hashMap.put("appInstallerId", this.zzVf);
        return zzg.zzj(hashMap);
    }

    public void zza(zzln com_google_android_gms_internal_zzln) {
        if (!TextUtils.isEmpty(this.zzVd)) {
            com_google_android_gms_internal_zzln.setAppName(this.zzVd);
        }
        if (!TextUtils.isEmpty(this.zzVe)) {
            com_google_android_gms_internal_zzln.setAppVersion(this.zzVe);
        }
        if (!TextUtils.isEmpty(this.zzPx)) {
            com_google_android_gms_internal_zzln.setAppId(this.zzPx);
        }
        if (!TextUtils.isEmpty(this.zzVf)) {
            com_google_android_gms_internal_zzln.setAppInstallerId(this.zzVf);
        }
    }

    public /* synthetic */ void zzb(zzg com_google_android_gms_analytics_zzg) {
        zza((zzln) com_google_android_gms_analytics_zzg);
    }

    public String zziC() {
        return this.zzPx;
    }

    public String zzkU() {
        return this.zzVd;
    }

    public String zzkV() {
        return this.zzVe;
    }

    public String zzkW() {
        return this.zzVf;
    }
}
