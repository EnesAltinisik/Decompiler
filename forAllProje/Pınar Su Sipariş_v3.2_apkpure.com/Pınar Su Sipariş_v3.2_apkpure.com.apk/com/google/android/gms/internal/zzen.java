package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zze;
import com.google.android.gms.common.util.zzf;
import java.util.Map;

@zzig
public class zzen implements zzeh {
    static final Map<String, Integer> zzCp = zzf.zza("resize", Integer.valueOf(1), "playVideo", Integer.valueOf(2), "storePicture", Integer.valueOf(3), "createCalendarEvent", Integer.valueOf(4), "setOrientationProperties", Integer.valueOf(5), "closeResizedAd", Integer.valueOf(6));
    private final zze zzCn;
    private final zzgr zzCo;

    public zzen(zze com_google_android_gms_ads_internal_zze, zzgr com_google_android_gms_internal_zzgr) {
        this.zzCn = com_google_android_gms_ads_internal_zze;
        this.zzCo = com_google_android_gms_internal_zzgr;
    }

    public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
        int intValue = ((Integer) zzCp.get((String) map.get("a"))).intValue();
        if (intValue == 5 || this.zzCn == null || this.zzCn.zzbG()) {
            switch (intValue) {
                case 1:
                    this.zzCo.execute(map);
                    return;
                case 3:
                    new zzgt(com_google_android_gms_internal_zzla, map).execute();
                    return;
                case 4:
                    new zzgq(com_google_android_gms_internal_zzla, map).execute();
                    return;
                case 5:
                    new zzgs(com_google_android_gms_internal_zzla, map).execute();
                    return;
                case 6:
                    this.zzCo.zzr(true);
                    return;
                default:
                    zzb.zzaV("Unknown MRAID command called.");
                    return;
            }
        }
        this.zzCn.zzt(null);
    }
}
