package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzjn.zza;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@zzig
public class zziy extends zzb implements zzjb {
    private static final zzfz zzOy = new zzfz();
    private boolean zzOA;
    private final Map<String, zzjf> zzOz = new HashMap();

    public zziy(Context context, zzd com_google_android_gms_ads_internal_zzd, AdSizeParcel adSizeParcel, zzga com_google_android_gms_internal_zzga, VersionInfoParcel versionInfoParcel) {
        super(context, adSizeParcel, null, com_google_android_gms_internal_zzga, versionInfoParcel, com_google_android_gms_ads_internal_zzd);
    }

    private zza zze(zza com_google_android_gms_internal_zzjn_zza) {
        zzjw.v("Creating mediation ad response for non-mediated rewarded ad.");
        try {
            String jSONObject = zzij.zzc(com_google_android_gms_internal_zzjn_zza.zzPi).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, com_google_android_gms_internal_zzjn_zza.zzPh.zzsv);
            zzfq com_google_android_gms_internal_zzfq = new zzfq(jSONObject, null, Arrays.asList(new String[]{"com.google.ads.mediation.admob.AdMobAdapter"}), null, null, Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), null, Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList());
            return new zza(com_google_android_gms_internal_zzjn_zza.zzPh, com_google_android_gms_internal_zzjn_zza.zzPi, new zzfr(Arrays.asList(new zzfq[]{com_google_android_gms_internal_zzfq}), -1, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1, 0, 1, null, 0, -1, -1, false), com_google_android_gms_internal_zzjn_zza.zzsB, com_google_android_gms_internal_zzjn_zza.errorCode, com_google_android_gms_internal_zzjn_zza.zzPc, com_google_android_gms_internal_zzjn_zza.zzPd, com_google_android_gms_internal_zzjn_zza.zzOW);
        } catch (Throwable e) {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Unable to generate ad state for non-mediated rewarded video.", e);
            return zzf(com_google_android_gms_internal_zzjn_zza);
        }
    }

    private zza zzf(zza com_google_android_gms_internal_zzjn_zza) {
        return new zza(com_google_android_gms_internal_zzjn_zza.zzPh, com_google_android_gms_internal_zzjn_zza.zzPi, null, com_google_android_gms_internal_zzjn_zza.zzsB, 0, com_google_android_gms_internal_zzjn_zza.zzPc, com_google_android_gms_internal_zzjn_zza.zzPd, com_google_android_gms_internal_zzjn_zza.zzOW);
    }

    public void destroy() {
        zzaa.zzdc("destroy must be called on the main UI thread.");
        for (String str : this.zzOz.keySet()) {
            String str2;
            try {
                zzjf com_google_android_gms_internal_zzjf = (zzjf) this.zzOz.get(str2);
                if (!(com_google_android_gms_internal_zzjf == null || com_google_android_gms_internal_zzjf.zzip() == null)) {
                    com_google_android_gms_internal_zzjf.zzip().destroy();
                }
            } catch (RemoteException e) {
                String str3 = "Fail to destroy adapter: ";
                str2 = String.valueOf(str2);
                com.google.android.gms.ads.internal.util.client.zzb.zzaW(str2.length() != 0 ? str3.concat(str2) : new String(str3));
            }
        }
    }

    public boolean isLoaded() {
        zzaa.zzdc("isLoaded must be called on the main UI thread.");
        return this.zzpV.zzsz == null && this.zzpV.zzsA == null && this.zzpV.zzsC != null && !this.zzOA;
    }

    public void onContextChanged(Context context) {
        for (zzjf zzip : this.zzOz.values()) {
            try {
                zzip.zzip().zzj(zze.zzD(context));
            } catch (Throwable e) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb("Unable to call Adapter.onContextChanged.", e);
            }
        }
    }

    public void onRewardedVideoAdClosed() {
        zzbm();
    }

    public void onRewardedVideoAdLeftApplication() {
        zzbn();
    }

    public void onRewardedVideoAdOpened() {
        zza(this.zzpV.zzsC, false);
        zzbo();
    }

    public void onRewardedVideoStarted() {
        if (!(this.zzpV.zzsC == null || this.zzpV.zzsC.zzFg == null)) {
            zzu.zzcz().zza(this.zzpV.zzov, this.zzpV.zzsx.afmaVersion, this.zzpV.zzsC, this.zzpV.zzsv, false, this.zzpV.zzsC.zzFg.zzEw);
        }
        zzbq();
    }

    public void pause() {
        String valueOf;
        zzaa.zzdc("pause must be called on the main UI thread.");
        for (String valueOf2 : this.zzOz.keySet()) {
            try {
                zzjf com_google_android_gms_internal_zzjf = (zzjf) this.zzOz.get(valueOf2);
                if (!(com_google_android_gms_internal_zzjf == null || com_google_android_gms_internal_zzjf.zzip() == null)) {
                    com_google_android_gms_internal_zzjf.zzip().pause();
                }
            } catch (RemoteException e) {
                String str = "Fail to pause adapter: ";
                valueOf2 = String.valueOf(valueOf2);
                com.google.android.gms.ads.internal.util.client.zzb.zzaW(valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str));
            }
        }
    }

    public void resume() {
        String valueOf;
        zzaa.zzdc("resume must be called on the main UI thread.");
        for (String valueOf2 : this.zzOz.keySet()) {
            try {
                zzjf com_google_android_gms_internal_zzjf = (zzjf) this.zzOz.get(valueOf2);
                if (!(com_google_android_gms_internal_zzjf == null || com_google_android_gms_internal_zzjf.zzip() == null)) {
                    com_google_android_gms_internal_zzjf.zzip().resume();
                }
            } catch (RemoteException e) {
                String str = "Fail to resume adapter: ";
                valueOf2 = String.valueOf(valueOf2);
                com.google.android.gms.ads.internal.util.client.zzb.zzaW(valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str));
            }
        }
    }

    public void zza(RewardedVideoAdRequestParcel rewardedVideoAdRequestParcel) {
        zzaa.zzdc("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(rewardedVideoAdRequestParcel.zzsv)) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaW("Invalid ad unit id. Aborting.");
            return;
        }
        this.zzOA = false;
        this.zzpV.zzsv = rewardedVideoAdRequestParcel.zzsv;
        super.zzb(rewardedVideoAdRequestParcel.zzLi);
    }

    public void zza(final zza com_google_android_gms_internal_zzjn_zza, zzdc com_google_android_gms_internal_zzdc) {
        if (com_google_android_gms_internal_zzjn_zza.errorCode != -2) {
            zzka.zzQu.post(new Runnable(this) {
                final /* synthetic */ zziy b;

                public void run() {
                    this.b.zzb(new zzjn(com_google_android_gms_internal_zzjn_zza, null, null, null, null, null, null, null));
                }
            });
            return;
        }
        this.zzpV.zzsD = com_google_android_gms_internal_zzjn_zza;
        if (com_google_android_gms_internal_zzjn_zza.zzOY == null) {
            this.zzpV.zzsD = zze(com_google_android_gms_internal_zzjn_zza);
        }
        this.zzpV.zzsX = 0;
        this.zzpV.zzsA = zzu.zzcj().zza(this.zzpV.zzov, this.zzpV.zzsD, this);
    }

    protected boolean zza(AdRequestParcel adRequestParcel, zzjn com_google_android_gms_internal_zzjn, boolean z) {
        return false;
    }

    public boolean zza(zzjn com_google_android_gms_internal_zzjn, zzjn com_google_android_gms_internal_zzjn2) {
        return true;
    }

    public zzjf zzaE(String str) {
        Throwable th;
        String str2;
        String valueOf;
        zzjf com_google_android_gms_internal_zzjf = (zzjf) this.zzOz.get(str);
        if (com_google_android_gms_internal_zzjf != null) {
            return com_google_android_gms_internal_zzjf;
        }
        zzjf com_google_android_gms_internal_zzjf2;
        try {
            com_google_android_gms_internal_zzjf2 = new zzjf(("com.google.ads.mediation.admob.AdMobAdapter".equals(str) ? zzOy : this.zzqc).zzal(str), this);
            try {
                this.zzOz.put(str, com_google_android_gms_internal_zzjf2);
                return com_google_android_gms_internal_zzjf2;
            } catch (Throwable e) {
                th = e;
                str2 = "Fail to instantiate adapter ";
                valueOf = String.valueOf(str);
                com.google.android.gms.ads.internal.util.client.zzb.zzd(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf), th);
                return com_google_android_gms_internal_zzjf2;
            }
        } catch (Throwable e2) {
            th = e2;
            com_google_android_gms_internal_zzjf2 = com_google_android_gms_internal_zzjf;
            str2 = "Fail to instantiate adapter ";
            valueOf = String.valueOf(str);
            if (valueOf.length() == 0) {
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzd(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf), th);
            return com_google_android_gms_internal_zzjf2;
        }
    }

    public void zzc(RewardItemParcel rewardItemParcel) {
        if (!(this.zzpV.zzsC == null || this.zzpV.zzsC.zzFg == null)) {
            zzu.zzcz().zza(this.zzpV.zzov, this.zzpV.zzsx.afmaVersion, this.zzpV.zzsC, this.zzpV.zzsv, false, this.zzpV.zzsC.zzFg.zzEx);
        }
        if (!(this.zzpV.zzsC == null || this.zzpV.zzsC.zzOY == null || TextUtils.isEmpty(this.zzpV.zzsC.zzOY.zzEM))) {
            rewardItemParcel = new RewardItemParcel(this.zzpV.zzsC.zzOY.zzEM, this.zzpV.zzsC.zzOY.zzEN);
        }
        zza(rewardItemParcel);
    }

    public void zzil() {
        zzaa.zzdc("showAd must be called on the main UI thread.");
        if (isLoaded()) {
            this.zzOA = true;
            zzjf zzaE = zzaE(this.zzpV.zzsC.zzFi);
            if (zzaE != null && zzaE.zzip() != null) {
                try {
                    zzaE.zzip().showVideo();
                    return;
                } catch (Throwable e) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call showVideo.", e);
                    return;
                }
            }
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaW("The reward video has not loaded.");
    }

    public void zzim() {
        onAdClicked();
    }
}
