package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import java.util.Map;

@zzig
class r implements zzeh {
    r() {
    }

    private int a(Map<String, String> map) throws NullPointerException, NumberFormatException {
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        return (parseInt < 0 || 3 < parseInt) ? 0 : parseInt;
    }

    public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
        Throwable e;
        if (((Boolean) zzcu.zzyC.get()).booleanValue()) {
            zzlf com_google_android_gms_internal_zzlf;
            zzlf zzjN = com_google_android_gms_internal_zzla.zzjN();
            if (zzjN == null) {
                try {
                    zzjN = new zzlf(com_google_android_gms_internal_zzla, Float.parseFloat((String) map.get("duration")));
                    com_google_android_gms_internal_zzla.zza(zzjN);
                    com_google_android_gms_internal_zzlf = zzjN;
                } catch (NullPointerException e2) {
                    e = e2;
                    zzb.zzb("Unable to parse videoMeta message.", e);
                    zzu.zzcn().zzb(e, true);
                    return;
                } catch (NumberFormatException e3) {
                    e = e3;
                    zzb.zzb("Unable to parse videoMeta message.", e);
                    zzu.zzcn().zzb(e, true);
                    return;
                }
            }
            com_google_android_gms_internal_zzlf = zzjN;
            com_google_android_gms_internal_zzlf.zza(Float.parseFloat((String) map.get("currentTime")), a(map), "1".equals(map.get("muted")));
        }
    }
}
