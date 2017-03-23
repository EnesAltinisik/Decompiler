package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

@zzig
public class zzek implements zzeh {
    private final zzel zzCl;

    public zzek(zzel com_google_android_gms_internal_zzel) {
        this.zzCl = com_google_android_gms_internal_zzel;
    }

    public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
        float parseFloat;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        try {
            if (map.get("blurRadius") != null) {
                parseFloat = Float.parseFloat((String) map.get("blurRadius"));
                this.zzCl.zzf(equals);
                this.zzCl.zza(equals2, parseFloat);
            }
        } catch (Throwable e) {
            zzb.zzb("Fail to parse float", e);
        }
        parseFloat = 0.0f;
        this.zzCl.zzf(equals);
        this.zzCl.zza(equals2, parseFloat);
    }
}
