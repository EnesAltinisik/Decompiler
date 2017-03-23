package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

@zzig
public final class zzec implements zzeh {
    private final zzed zzBH;

    public zzec(zzed com_google_android_gms_internal_zzed) {
        this.zzBH = com_google_android_gms_internal_zzed;
    }

    public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
        String str = (String) map.get("name");
        if (str == null) {
            zzb.zzaW("App event with no name parameter.");
        } else {
            this.zzBH.onAppEvent(str, (String) map.get("info"));
        }
    }
}
