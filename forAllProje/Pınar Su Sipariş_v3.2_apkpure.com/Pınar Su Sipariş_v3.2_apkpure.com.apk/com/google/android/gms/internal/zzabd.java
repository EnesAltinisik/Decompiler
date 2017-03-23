package com.google.android.gms.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzabd {
    private final Map<String, zzabg> zzbvr;
    private final zzabg zzbvs;

    public static class zza {
        private final Map<String, zzabg> zzbvr = new HashMap();
        private zzabg zzbvs;

        public zzabd zzLZ() {
            return new zzabd(this.zzbvr, this.zzbvs);
        }

        public zza zza(String str, zzabg com_google_android_gms_internal_zzabg) {
            this.zzbvr.put(str, com_google_android_gms_internal_zzabg);
            return this;
        }

        public zza zzb(zzabg com_google_android_gms_internal_zzabg) {
            this.zzbvs = com_google_android_gms_internal_zzabg;
            return this;
        }
    }

    private zzabd(Map<String, zzabg> map, zzabg com_google_android_gms_internal_zzabg) {
        this.zzbvr = Collections.unmodifiableMap(map);
        this.zzbvs = com_google_android_gms_internal_zzabg;
    }

    public String toString() {
        String valueOf = String.valueOf(zzLY());
        String valueOf2 = String.valueOf(this.zzbvs);
        return new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(valueOf2).length()).append("Properties: ").append(valueOf).append(" pushAfterEvaluate: ").append(valueOf2).toString();
    }

    public Map<String, zzabg> zzLY() {
        return this.zzbvr;
    }
}
