package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzg;
import java.util.HashMap;
import java.util.Map;

public final class zzly extends zzg<zzly> {
    public String zzVN;
    public String zzVO;
    public String zzVt;

    public String getAction() {
        return this.zzVt;
    }

    public String getTarget() {
        return this.zzVO;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("network", this.zzVN);
        hashMap.put("action", this.zzVt);
        hashMap.put("target", this.zzVO);
        return zzg.zzj(hashMap);
    }

    public void zza(zzly com_google_android_gms_internal_zzly) {
        if (!TextUtils.isEmpty(this.zzVN)) {
            com_google_android_gms_internal_zzly.zzbA(this.zzVN);
        }
        if (!TextUtils.isEmpty(this.zzVt)) {
            com_google_android_gms_internal_zzly.zzbt(this.zzVt);
        }
        if (!TextUtils.isEmpty(this.zzVO)) {
            com_google_android_gms_internal_zzly.zzbB(this.zzVO);
        }
    }

    public /* synthetic */ void zzb(zzg com_google_android_gms_analytics_zzg) {
        zza((zzly) com_google_android_gms_analytics_zzg);
    }

    public void zzbA(String str) {
        this.zzVN = str;
    }

    public void zzbB(String str) {
        this.zzVO = str;
    }

    public void zzbt(String str) {
        this.zzVt = str;
    }

    public String zzlC() {
        return this.zzVN;
    }
}
