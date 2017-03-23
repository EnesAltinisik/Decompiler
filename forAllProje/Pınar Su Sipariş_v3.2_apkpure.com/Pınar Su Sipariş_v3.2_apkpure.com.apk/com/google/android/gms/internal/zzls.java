package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzg;
import java.util.HashMap;
import java.util.Map;

public final class zzls extends zzg<zzls> {
    public int zzGy;
    public int zzGz;
    private String zzVp;
    public int zzVq;
    public int zzVr;
    public int zzVs;

    public String getLanguage() {
        return this.zzVp;
    }

    public void setLanguage(String str) {
        this.zzVp = str;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("language", this.zzVp);
        hashMap.put("screenColors", Integer.valueOf(this.zzVq));
        hashMap.put("screenWidth", Integer.valueOf(this.zzGy));
        hashMap.put("screenHeight", Integer.valueOf(this.zzGz));
        hashMap.put("viewportWidth", Integer.valueOf(this.zzVr));
        hashMap.put("viewportHeight", Integer.valueOf(this.zzVs));
        return zzg.zzj(hashMap);
    }

    public void zza(zzls com_google_android_gms_internal_zzls) {
        if (this.zzVq != 0) {
            com_google_android_gms_internal_zzls.zzan(this.zzVq);
        }
        if (this.zzGy != 0) {
            com_google_android_gms_internal_zzls.zzao(this.zzGy);
        }
        if (this.zzGz != 0) {
            com_google_android_gms_internal_zzls.zzap(this.zzGz);
        }
        if (this.zzVr != 0) {
            com_google_android_gms_internal_zzls.zzaq(this.zzVr);
        }
        if (this.zzVs != 0) {
            com_google_android_gms_internal_zzls.zzar(this.zzVs);
        }
        if (!TextUtils.isEmpty(this.zzVp)) {
            com_google_android_gms_internal_zzls.setLanguage(this.zzVp);
        }
    }

    public void zzan(int i) {
        this.zzVq = i;
    }

    public void zzao(int i) {
        this.zzGy = i;
    }

    public void zzap(int i) {
        this.zzGz = i;
    }

    public void zzaq(int i) {
        this.zzVr = i;
    }

    public void zzar(int i) {
        this.zzVs = i;
    }

    public /* synthetic */ void zzb(zzg com_google_android_gms_analytics_zzg) {
        zza((zzls) com_google_android_gms_analytics_zzg);
    }

    public int zzlg() {
        return this.zzVq;
    }

    public int zzlh() {
        return this.zzGy;
    }

    public int zzli() {
        return this.zzGz;
    }

    public int zzlj() {
        return this.zzVr;
    }

    public int zzlk() {
        return this.zzVs;
    }
}
