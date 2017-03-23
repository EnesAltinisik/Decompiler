package com.google.android.gms.internal;

import com.google.android.gms.analytics.zzg;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class zzlp extends zzg<zzlp> {
    private Map<Integer, String> zzVn = new HashMap(4);

    public String toString() {
        Map hashMap = new HashMap();
        for (Entry entry : this.zzVn.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            hashMap.put(new StringBuilder(String.valueOf(valueOf).length() + 9).append("dimension").append(valueOf).toString(), entry.getValue());
        }
        return zzg.zzj(hashMap);
    }

    public void zza(zzlp com_google_android_gms_internal_zzlp) {
        com_google_android_gms_internal_zzlp.zzVn.putAll(this.zzVn);
    }

    public /* synthetic */ void zzb(zzg com_google_android_gms_analytics_zzg) {
        zza((zzlp) com_google_android_gms_analytics_zzg);
    }

    public Map<Integer, String> zzld() {
        return Collections.unmodifiableMap(this.zzVn);
    }
}
