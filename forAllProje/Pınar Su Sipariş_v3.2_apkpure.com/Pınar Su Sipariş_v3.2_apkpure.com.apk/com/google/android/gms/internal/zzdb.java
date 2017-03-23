package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

@zzig
public class zzdb {
    private final Map<String, zzda> zzAb = new HashMap();
    private final zzdc zzpQ;

    public zzdb(zzdc com_google_android_gms_internal_zzdc) {
        this.zzpQ = com_google_android_gms_internal_zzdc;
    }

    public void zza(String str, zzda com_google_android_gms_internal_zzda) {
        this.zzAb.put(str, com_google_android_gms_internal_zzda);
    }

    public void zza(String str, String str2, long j) {
        zzcy.zza(this.zzpQ, (zzda) this.zzAb.get(str2), j, str);
        this.zzAb.put(str, zzcy.zza(this.zzpQ, j));
    }

    public zzdc zzez() {
        return this.zzpQ;
    }
}
