package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.zza.zza;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

@zzig
public class zzjc extends zza {
    private zzjd zzOF;
    private zzja zzOM;
    private zzjb zzON;

    public zzjc(zzjb com_google_android_gms_internal_zzjb) {
        this.zzON = com_google_android_gms_internal_zzjb;
    }

    public void zza(zzd com_google_android_gms_dynamic_zzd, RewardItemParcel rewardItemParcel) {
        if (this.zzON != null) {
            this.zzON.zzc(rewardItemParcel);
        }
    }

    public void zza(zzja com_google_android_gms_internal_zzja) {
        this.zzOM = com_google_android_gms_internal_zzja;
    }

    public void zza(zzjd com_google_android_gms_internal_zzjd) {
        this.zzOF = com_google_android_gms_internal_zzjd;
    }

    public void zzb(zzd com_google_android_gms_dynamic_zzd, int i) {
        if (this.zzOM != null) {
            this.zzOM.zzU(i);
        }
    }

    public void zzc(zzd com_google_android_gms_dynamic_zzd, int i) {
        if (this.zzOF != null) {
            this.zzOF.zza(zze.zzx(com_google_android_gms_dynamic_zzd).getClass().getName(), i);
        }
    }

    public void zzo(zzd com_google_android_gms_dynamic_zzd) {
        if (this.zzOM != null) {
            this.zzOM.zzin();
        }
    }

    public void zzp(zzd com_google_android_gms_dynamic_zzd) {
        if (this.zzOF != null) {
            this.zzOF.zzaF(zze.zzx(com_google_android_gms_dynamic_zzd).getClass().getName());
        }
    }

    public void zzq(zzd com_google_android_gms_dynamic_zzd) {
        if (this.zzON != null) {
            this.zzON.onRewardedVideoAdOpened();
        }
    }

    public void zzr(zzd com_google_android_gms_dynamic_zzd) {
        if (this.zzON != null) {
            this.zzON.onRewardedVideoStarted();
        }
    }

    public void zzs(zzd com_google_android_gms_dynamic_zzd) {
        if (this.zzON != null) {
            this.zzON.onRewardedVideoAdClosed();
        }
    }

    public void zzt(zzd com_google_android_gms_dynamic_zzd) {
        if (this.zzON != null) {
            this.zzON.zzim();
        }
    }

    public void zzu(zzd com_google_android_gms_dynamic_zzd) {
        if (this.zzON != null) {
            this.zzON.onRewardedVideoAdLeftApplication();
        }
    }
}
