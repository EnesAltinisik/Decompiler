package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

@zzig
public class zzep implements zzeh {
    private final zza zzCr;

    public interface zza {
        void zzb(RewardItemParcel rewardItemParcel);

        void zzbP();
    }

    public zzep(zza com_google_android_gms_internal_zzep_zza) {
        this.zzCr = com_google_android_gms_internal_zzep_zza;
    }

    public static void zza(zzla com_google_android_gms_internal_zzla, zza com_google_android_gms_internal_zzep_zza) {
        com_google_android_gms_internal_zzla.zzjD().zza("/reward", new zzep(com_google_android_gms_internal_zzep_zza));
    }

    private void zze(Map<String, String> map) {
        RewardItemParcel rewardItemParcel;
        try {
            int parseInt = Integer.parseInt((String) map.get("amount"));
            String str = (String) map.get("type");
            if (!TextUtils.isEmpty(str)) {
                rewardItemParcel = new RewardItemParcel(str, parseInt);
                this.zzCr.zzb(rewardItemParcel);
            }
        } catch (Throwable e) {
            zzb.zzd("Unable to parse reward amount.", e);
        }
        rewardItemParcel = null;
        this.zzCr.zzb(rewardItemParcel);
    }

    private void zzf(Map<String, String> map) {
        this.zzCr.zzbP();
    }

    public void zza(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            zze(map);
        } else if ("video_start".equals(str)) {
            zzf(map);
        }
    }
}
