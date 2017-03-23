package com.google.android.gms.internal;

import com.google.android.gms.analytics.zzg;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class zzlq extends zzg<zzlq> {
    private Map<Integer, Double> zzVo = new HashMap(4);

    public String toString() {
        Map hashMap = new HashMap();
        for (Entry entry : this.zzVo.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            hashMap.put(new StringBuilder(String.valueOf(valueOf).length() + 6).append("metric").append(valueOf).toString(), entry.getValue());
        }
        return zzg.zzj(hashMap);
    }

    public void zza(zzlq com_google_android_gms_internal_zzlq) {
        com_google_android_gms_internal_zzlq.zzVo.putAll(this.zzVo);
    }

    public /* synthetic */ void zzb(zzg com_google_android_gms_analytics_zzg) {
        zza((zzlq) com_google_android_gms_analytics_zzg);
    }

    public Map<Integer, Double> zzle() {
        return Collections.unmodifiableMap(this.zzVo);
    }
}
