package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import java.util.Map;

@zzig
public class zzgs {
    private final zzla zzBb;
    private final boolean zzGl;
    private final String zzGm;

    public zzgs(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
        this.zzBb = com_google_android_gms_internal_zzla;
        this.zzGm = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.zzGl = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        } else {
            this.zzGl = true;
        }
    }

    public void execute() {
        if (this.zzBb == null) {
            zzb.zzaW("AdWebView is null");
            return;
        }
        int zzjf = "portrait".equalsIgnoreCase(this.zzGm) ? zzu.zzcm().zzjf() : "landscape".equalsIgnoreCase(this.zzGm) ? zzu.zzcm().zzje() : this.zzGl ? -1 : zzu.zzcm().zzjg();
        this.zzBb.setRequestedOrientation(zzjf);
    }
}
