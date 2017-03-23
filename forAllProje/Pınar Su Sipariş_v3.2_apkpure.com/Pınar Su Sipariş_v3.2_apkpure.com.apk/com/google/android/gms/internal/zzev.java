package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import java.util.Map;
import java.util.concurrent.Future;

@zzig
public class zzev implements zzeh {
    public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
        zzet zzcD = zzu.zzcD();
        if (!map.containsKey("abort")) {
            String str = (String) map.get("src");
            if (str == null) {
                zzb.zzaW("Precache video action is missing the src parameter.");
                return;
            }
            int parseInt;
            try {
                parseInt = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException e) {
                parseInt = 0;
            }
            String str2 = map.containsKey("mimetype") ? (String) map.get("mimetype") : "";
            if (zzcD.zze(com_google_android_gms_internal_zzla)) {
                zzb.zzaW("Precache task already running.");
                return;
            }
            com.google.android.gms.common.internal.zzb.zzv(com_google_android_gms_internal_zzla.zzjA());
            Future future = (Future) new zzes(com_google_android_gms_internal_zzla, com_google_android_gms_internal_zzla.zzjA().zzqm.zza(com_google_android_gms_internal_zzla, parseInt, str2), str).zzhs();
        } else if (!zzcD.zzd(com_google_android_gms_internal_zzla)) {
            zzb.zzaW("Precache abort but no preload task running.");
        }
    }
}
