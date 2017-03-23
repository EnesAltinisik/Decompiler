package com.google.android.gms.ads.internal;

import android.os.Bundle;
import android.os.Debug;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ThinAdSizeParcel;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.client.zzab;
import com.google.android.gms.ads.internal.client.zzf;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.reward.client.zzd;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.util.zzi;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzby;
import com.google.android.gms.internal.zzcd;
import com.google.android.gms.internal.zzcg;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzda;
import com.google.android.gms.internal.zzdc;
import com.google.android.gms.internal.zzdg;
import com.google.android.gms.internal.zzed;
import com.google.android.gms.internal.zzhh;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zziw;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzjo;
import com.google.android.gms.internal.zzjs;
import com.google.android.gms.internal.zzjt;
import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

@zzig
public abstract class zza extends com.google.android.gms.ads.internal.client.zzu.zza implements com.google.android.gms.ads.internal.client.zza, zzp, com.google.android.gms.ads.internal.request.zza.zza, zzed, com.google.android.gms.internal.zzhv.zza, zzjs {
    protected zzdc zzpQ;
    protected zzda zzpR;
    protected zzda zzpS;
    protected boolean zzpT = false;
    protected final zzr zzpU;
    protected final zzv zzpV;
    protected transient AdRequestParcel zzpW;
    protected final zzby zzpX;
    protected final zzd zzpY;

    zza(zzv com_google_android_gms_ads_internal_zzv, zzr com_google_android_gms_ads_internal_zzr, zzd com_google_android_gms_ads_internal_zzd) {
        this.zzpV = com_google_android_gms_ads_internal_zzv;
        if (com_google_android_gms_ads_internal_zzr == null) {
            com_google_android_gms_ads_internal_zzr = new zzr(this);
        }
        this.zzpU = com_google_android_gms_ads_internal_zzr;
        this.zzpY = com_google_android_gms_ads_internal_zzd;
        zzu.zzck().zzC(this.zzpV.zzov);
        zzu.zzcn().zzb(this.zzpV.zzov, this.zzpV.zzsx);
        this.zzpX = zzu.zzcn().zziP();
        zzbf();
    }

    private AdRequestParcel zza(AdRequestParcel adRequestParcel) {
        return (!zzi.zzaC(this.zzpV.zzov) || adRequestParcel.zzuV == null) ? adRequestParcel : new zzf(adRequestParcel).zza(null).zzdA();
    }

    private TimerTask zza(final Timer timer, final CountDownLatch countDownLatch) {
        return new TimerTask(this) {
            final /* synthetic */ zza c;

            public void run() {
                if (((long) ((Integer) zzcu.zzzi.get()).intValue()) != countDownLatch.getCount()) {
                    zzb.zzaU("Stopping method tracing");
                    Debug.stopMethodTracing();
                    if (countDownLatch.getCount() == 0) {
                        timer.cancel();
                        return;
                    }
                }
                String concat = String.valueOf(this.c.zzpV.zzov.getPackageName()).concat("_adsTrace_");
                try {
                    zzb.zzaU("Starting method tracing");
                    countDownLatch.countDown();
                    Debug.startMethodTracing(new StringBuilder(String.valueOf(concat).length() + 20).append(concat).append(zzu.zzco().currentTimeMillis()).toString(), ((Integer) zzcu.zzzj.get()).intValue());
                } catch (Throwable e) {
                    zzb.zzd("Exception occurred while starting method tracing.", e);
                }
            }
        };
    }

    private void zzbf() {
        if (((Boolean) zzcu.zzzg.get()).booleanValue()) {
            Timer timer = new Timer();
            timer.schedule(zza(timer, new CountDownLatch(((Integer) zzcu.zzzi.get()).intValue())), 0, ((Long) zzcu.zzzh.get()).longValue());
        }
    }

    public void destroy() {
        zzaa.zzdc("destroy must be called on the main UI thread.");
        this.zzpU.cancel();
        this.zzpX.zzj(this.zzpV.zzsC);
        this.zzpV.destroy();
    }

    public boolean isLoading() {
        return this.zzpT;
    }

    public boolean isReady() {
        zzaa.zzdc("isLoaded must be called on the main UI thread.");
        return this.zzpV.zzsz == null && this.zzpV.zzsA == null && this.zzpV.zzsC != null;
    }

    public void onAdClicked() {
        if (this.zzpV.zzsC == null) {
            zzb.zzaW("Ad state was null when trying to ping click URLs.");
            return;
        }
        zzb.zzaU("Pinging click URLs.");
        this.zzpV.zzsE.zziu();
        if (this.zzpV.zzsC.zzEF != null) {
            zzu.zzck().zza(this.zzpV.zzov, this.zzpV.zzsx.afmaVersion, this.zzpV.zzsC.zzEF);
        }
        if (this.zzpV.zzsF != null) {
            try {
                this.zzpV.zzsF.onAdClicked();
            } catch (Throwable e) {
                zzb.zzd("Could not notify onAdClicked event.", e);
            }
        }
    }

    public void onAppEvent(String str, String str2) {
        if (this.zzpV.zzsH != null) {
            try {
                this.zzpV.zzsH.onAppEvent(str, str2);
            } catch (Throwable e) {
                zzb.zzd("Could not call the AppEventListener.", e);
            }
        }
    }

    public void pause() {
        zzaa.zzdc("pause must be called on the main UI thread.");
    }

    public void resume() {
        zzaa.zzdc("resume must be called on the main UI thread.");
    }

    public void setManualImpressionsEnabled(boolean z) {
        throw new UnsupportedOperationException("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    public void setUserId(String str) {
        zzb.zzaW("RewardedVideoAd.setUserId() is deprecated. Please do not call this method.");
    }

    public void stopLoading() {
        zzaa.zzdc("stopLoading must be called on the main UI thread.");
        this.zzpT = false;
        this.zzpV.zzh(true);
    }

    Bundle zza(zzcg com_google_android_gms_internal_zzcg) {
        if (com_google_android_gms_internal_zzcg == null) {
            return null;
        }
        String zzdl;
        String zzdm;
        if (com_google_android_gms_internal_zzcg.zzdx()) {
            com_google_android_gms_internal_zzcg.wakeup();
        }
        zzcd zzdv = com_google_android_gms_internal_zzcg.zzdv();
        if (zzdv != null) {
            zzdl = zzdv.zzdl();
            zzdm = zzdv.zzdm();
            String str = "In AdManager: loadAd, ";
            String valueOf = String.valueOf(zzdv.toString());
            zzb.zzaU(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            if (zzdl != null) {
                zzu.zzcn().zzaL(zzdl);
            }
        } else {
            zzdm = null;
            zzdl = zzu.zzcn().zziK();
        }
        if (zzdl == null) {
            return null;
        }
        Bundle bundle = new Bundle(1);
        bundle.putString("fingerprint", zzdl);
        if (zzdl.equals(zzdm)) {
            return bundle;
        }
        bundle.putString("v_fp", zzdm);
        return bundle;
    }

    public void zza(AdSizeParcel adSizeParcel) {
        zzaa.zzdc("setAdSize must be called on the main UI thread.");
        this.zzpV.zzsB = adSizeParcel;
        if (!(this.zzpV.zzsC == null || this.zzpV.zzsC.zzHF == null || this.zzpV.zzsX != 0)) {
            this.zzpV.zzsC.zzHF.zza(adSizeParcel);
        }
        if (this.zzpV.zzsy != null) {
            if (this.zzpV.zzsy.getChildCount() > 1) {
                this.zzpV.zzsy.removeView(this.zzpV.zzsy.getNextView());
            }
            this.zzpV.zzsy.setMinimumWidth(adSizeParcel.widthPixels);
            this.zzpV.zzsy.setMinimumHeight(adSizeParcel.heightPixels);
            this.zzpV.zzsy.requestLayout();
        }
    }

    public void zza(VideoOptionsParcel videoOptionsParcel) {
        zzaa.zzdc("setVideoOptions must be called on the main UI thread.");
        this.zzpV.zzsQ = videoOptionsParcel;
    }

    public void zza(com.google.android.gms.ads.internal.client.zzp com_google_android_gms_ads_internal_client_zzp) {
        zzaa.zzdc("setAdListener must be called on the main UI thread.");
        this.zzpV.zzsF = com_google_android_gms_ads_internal_client_zzp;
    }

    public void zza(zzq com_google_android_gms_ads_internal_client_zzq) {
        zzaa.zzdc("setAdListener must be called on the main UI thread.");
        this.zzpV.zzsG = com_google_android_gms_ads_internal_client_zzq;
    }

    public void zza(zzw com_google_android_gms_ads_internal_client_zzw) {
        zzaa.zzdc("setAppEventListener must be called on the main UI thread.");
        this.zzpV.zzsH = com_google_android_gms_ads_internal_client_zzw;
    }

    public void zza(zzy com_google_android_gms_ads_internal_client_zzy) {
        zzaa.zzdc("setCorrelationIdProvider must be called on the main UI thread");
        this.zzpV.zzsI = com_google_android_gms_ads_internal_client_zzy;
    }

    public void zza(zzd com_google_android_gms_ads_internal_reward_client_zzd) {
        zzaa.zzdc("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzpV.zzsS = com_google_android_gms_ads_internal_reward_client_zzd;
    }

    protected void zza(RewardItemParcel rewardItemParcel) {
        if (this.zzpV.zzsS != null) {
            try {
                String str = "";
                int i = 0;
                if (rewardItemParcel != null) {
                    str = rewardItemParcel.type;
                    i = rewardItemParcel.zzOV;
                }
                this.zzpV.zzsS.zza(new zziw(str, i));
            } catch (Throwable e) {
                zzb.zzd("Could not call RewardedVideoAdListener.onRewarded().", e);
            }
        }
    }

    public void zza(zzdg com_google_android_gms_internal_zzdg) {
        throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
    }

    public void zza(zzhh com_google_android_gms_internal_zzhh) {
        throw new IllegalStateException("setInAppPurchaseListener is not supported for current ad type");
    }

    public void zza(zzhl com_google_android_gms_internal_zzhl, String str) {
        throw new IllegalStateException("setPlayStorePurchaseParams is not supported for current ad type");
    }

    public void zza(com.google.android.gms.internal.zzjn.zza com_google_android_gms_internal_zzjn_zza) {
        if (!(com_google_android_gms_internal_zzjn_zza.zzPi.zzLT == -1 || TextUtils.isEmpty(com_google_android_gms_internal_zzjn_zza.zzPi.zzMd))) {
            long zzs = zzs(com_google_android_gms_internal_zzjn_zza.zzPi.zzMd);
            if (zzs != -1) {
                zzda zzc = this.zzpQ.zzc(zzs + com_google_android_gms_internal_zzjn_zza.zzPi.zzLT);
                this.zzpQ.zza(zzc, "stc");
            }
        }
        this.zzpQ.zzS(com_google_android_gms_internal_zzjn_zza.zzPi.zzMd);
        this.zzpQ.zza(this.zzpR, "arf");
        this.zzpS = this.zzpQ.zzeA();
        this.zzpQ.zzf("gqi", com_google_android_gms_internal_zzjn_zza.zzPi.zzMe);
        this.zzpV.zzsz = null;
        this.zzpV.zzsD = com_google_android_gms_internal_zzjn_zza;
        zza(com_google_android_gms_internal_zzjn_zza, this.zzpQ);
    }

    protected abstract void zza(com.google.android.gms.internal.zzjn.zza com_google_android_gms_internal_zzjn_zza, zzdc com_google_android_gms_internal_zzdc);

    public void zza(HashSet<zzjo> hashSet) {
        this.zzpV.zza(hashSet);
    }

    protected abstract boolean zza(AdRequestParcel adRequestParcel, zzdc com_google_android_gms_internal_zzdc);

    boolean zza(zzjn com_google_android_gms_internal_zzjn) {
        return false;
    }

    protected abstract boolean zza(zzjn com_google_android_gms_internal_zzjn, zzjn com_google_android_gms_internal_zzjn2);

    protected void zzb(View view) {
        this.zzpV.zzsy.addView(view, zzu.zzcm().zzjh());
    }

    public void zzb(zzjn com_google_android_gms_internal_zzjn) {
        this.zzpQ.zza(this.zzpS, "awr");
        this.zzpV.zzsA = null;
        if (!(com_google_android_gms_internal_zzjn.errorCode == -2 || com_google_android_gms_internal_zzjn.errorCode == 3)) {
            zzu.zzcn().zzb(this.zzpV.zzcF());
        }
        if (com_google_android_gms_internal_zzjn.errorCode == -1) {
            this.zzpT = false;
            return;
        }
        if (zza(com_google_android_gms_internal_zzjn)) {
            zzb.zzaU("Ad refresh scheduled.");
        }
        if (com_google_android_gms_internal_zzjn.errorCode != -2) {
            zzf(com_google_android_gms_internal_zzjn.errorCode);
            return;
        }
        if (this.zzpV.zzsV == null) {
            this.zzpV.zzsV = new zzjt(this.zzpV.zzsv);
        }
        this.zzpX.zzi(this.zzpV.zzsC);
        if (zza(this.zzpV.zzsC, com_google_android_gms_internal_zzjn)) {
            this.zzpV.zzsC = com_google_android_gms_internal_zzjn;
            this.zzpV.zzcO();
            this.zzpQ.zzf("is_mraid", this.zzpV.zzsC.zzdi() ? "1" : "0");
            this.zzpQ.zzf("is_mediation", this.zzpV.zzsC.zzLP ? "1" : "0");
            if (!(this.zzpV.zzsC.zzHF == null || this.zzpV.zzsC.zzHF.zzjD() == null)) {
                this.zzpQ.zzf("is_delay_pl", this.zzpV.zzsC.zzHF.zzjD().zzjS() ? "1" : "0");
            }
            this.zzpQ.zza(this.zzpR, "ttc");
            if (zzu.zzcn().zziG() != null) {
                zzu.zzcn().zziG().zza(this.zzpQ);
            }
            if (this.zzpV.zzcJ()) {
                zzbp();
            }
        }
        if (com_google_android_gms_internal_zzjn.zzEI != null) {
            zzu.zzck().zza(this.zzpV.zzov, com_google_android_gms_internal_zzjn.zzEI);
        }
    }

    public boolean zzb(AdRequestParcel adRequestParcel) {
        zzaa.zzdc("loadAd must be called on the main UI thread.");
        AdRequestParcel zza = zza(adRequestParcel);
        if (this.zzpV.zzsz == null && this.zzpV.zzsA == null) {
            zzb.zzaV("Starting ad request.");
            zzbg();
            this.zzpR = this.zzpQ.zzeA();
            if (!zza.zzuQ) {
                String valueOf = String.valueOf(zzm.zzdQ().zzP(this.zzpV.zzov));
                zzb.zzaV(new StringBuilder(String.valueOf(valueOf).length() + 71).append("Use AdRequest.Builder.addTestDevice(\"").append(valueOf).append("\") to get test ads on this device.").toString());
            }
            this.zzpT = zza(zza, this.zzpQ);
            return this.zzpT;
        }
        if (this.zzpW != null) {
            zzb.zzaW("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
        } else {
            zzb.zzaW("Loading already in progress, saving this object for future refreshes.");
        }
        this.zzpW = zza;
        return false;
    }

    public void zzbg() {
        this.zzpQ = new zzdc(((Boolean) zzcu.zzxF.get()).booleanValue(), "load_ad", this.zzpV.zzsB.zzvs);
        this.zzpR = new zzda(-1, null, null);
        this.zzpS = new zzda(-1, null, null);
    }

    public com.google.android.gms.dynamic.zzd zzbh() {
        zzaa.zzdc("getAdFrame must be called on the main UI thread.");
        return zze.zzD(this.zzpV.zzsy);
    }

    public AdSizeParcel zzbi() {
        zzaa.zzdc("getAdSize must be called on the main UI thread.");
        return this.zzpV.zzsB == null ? null : new ThinAdSizeParcel(this.zzpV.zzsB);
    }

    public void zzbj() {
        zzbn();
    }

    public void zzbk() {
        zzaa.zzdc("recordManualImpression must be called on the main UI thread.");
        if (this.zzpV.zzsC == null) {
            zzb.zzaW("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        zzb.zzaU("Pinging manual tracking URLs.");
        if (this.zzpV.zzsC.zzLR != null && !this.zzpV.zzsC.zzPg) {
            zzu.zzck().zza(this.zzpV.zzov, this.zzpV.zzsx.afmaVersion, this.zzpV.zzsC.zzLR);
            this.zzpV.zzsC.zzPg = true;
        }
    }

    public zzab zzbl() {
        return null;
    }

    protected void zzbm() {
        zzb.zzaV("Ad closing.");
        if (this.zzpV.zzsG != null) {
            try {
                this.zzpV.zzsG.onAdClosed();
            } catch (Throwable e) {
                zzb.zzd("Could not call AdListener.onAdClosed().", e);
            }
        }
        if (this.zzpV.zzsS != null) {
            try {
                this.zzpV.zzsS.onRewardedVideoAdClosed();
            } catch (Throwable e2) {
                zzb.zzd("Could not call RewardedVideoAdListener.onRewardedVideoAdClosed().", e2);
            }
        }
    }

    protected void zzbn() {
        zzb.zzaV("Ad leaving application.");
        if (this.zzpV.zzsG != null) {
            try {
                this.zzpV.zzsG.onAdLeftApplication();
            } catch (Throwable e) {
                zzb.zzd("Could not call AdListener.onAdLeftApplication().", e);
            }
        }
        if (this.zzpV.zzsS != null) {
            try {
                this.zzpV.zzsS.onRewardedVideoAdLeftApplication();
            } catch (Throwable e2) {
                zzb.zzd("Could not call  RewardedVideoAdListener.onRewardedVideoAdLeftApplication().", e2);
            }
        }
    }

    protected void zzbo() {
        zzb.zzaV("Ad opening.");
        if (this.zzpV.zzsG != null) {
            try {
                this.zzpV.zzsG.onAdOpened();
            } catch (Throwable e) {
                zzb.zzd("Could not call AdListener.onAdOpened().", e);
            }
        }
        if (this.zzpV.zzsS != null) {
            try {
                this.zzpV.zzsS.onRewardedVideoAdOpened();
            } catch (Throwable e2) {
                zzb.zzd("Could not call RewardedVideoAdListener.onRewardedVideoAdOpened().", e2);
            }
        }
    }

    protected void zzbp() {
        zzb.zzaV("Ad finished loading.");
        this.zzpT = false;
        if (this.zzpV.zzsG != null) {
            try {
                this.zzpV.zzsG.onAdLoaded();
            } catch (Throwable e) {
                zzb.zzd("Could not call AdListener.onAdLoaded().", e);
            }
        }
        if (this.zzpV.zzsS != null) {
            try {
                this.zzpV.zzsS.onRewardedVideoAdLoaded();
            } catch (Throwable e2) {
                zzb.zzd("Could not call RewardedVideoAdListener.onRewardedVideoAdLoaded().", e2);
            }
        }
    }

    protected void zzbq() {
        if (this.zzpV.zzsS != null) {
            try {
                this.zzpV.zzsS.onRewardedVideoStarted();
            } catch (Throwable e) {
                zzb.zzd("Could not call RewardedVideoAdListener.onVideoStarted().", e);
            }
        }
    }

    protected void zzc(zzjn com_google_android_gms_internal_zzjn) {
        if (com_google_android_gms_internal_zzjn == null) {
            zzb.zzaW("Ad state was null when trying to ping impression URLs.");
            return;
        }
        zzb.zzaU("Pinging Impression URLs.");
        this.zzpV.zzsE.zzit();
        if (com_google_android_gms_internal_zzjn.zzEG != null && !com_google_android_gms_internal_zzjn.zzPf) {
            zzu.zzck().zza(this.zzpV.zzov, this.zzpV.zzsx.afmaVersion, com_google_android_gms_internal_zzjn.zzEG);
            com_google_android_gms_internal_zzjn.zzPf = true;
        }
    }

    protected boolean zzc(AdRequestParcel adRequestParcel) {
        if (this.zzpV.zzsy == null) {
            return false;
        }
        ViewParent parent = this.zzpV.zzsy.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        return zzu.zzck().zza(view, view.getContext());
    }

    public void zzd(AdRequestParcel adRequestParcel) {
        if (zzc(adRequestParcel)) {
            zzb(adRequestParcel);
            return;
        }
        zzb.zzaV("Ad is not visible. Not refreshing ad.");
        this.zzpU.zzg(adRequestParcel);
    }

    protected void zzf(int i) {
        zzb.zzaW("Failed to load ad: " + i);
        this.zzpT = false;
        if (this.zzpV.zzsG != null) {
            try {
                this.zzpV.zzsG.onAdFailedToLoad(i);
            } catch (Throwable e) {
                zzb.zzd("Could not call AdListener.onAdFailedToLoad().", e);
            }
        }
        if (this.zzpV.zzsS != null) {
            try {
                this.zzpV.zzsS.onRewardedVideoAdFailedToLoad(i);
            } catch (Throwable e2) {
                zzb.zzd("Could not call RewardedVideoAdListener.onRewardedVideoAdFailedToLoad().", e2);
            }
        }
    }

    long zzs(String str) {
        int indexOf = str.indexOf("ufe");
        int indexOf2 = str.indexOf(44, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        try {
            return Long.parseLong(str.substring(indexOf + 4, indexOf2));
        } catch (IndexOutOfBoundsException e) {
            zzb.zzaW("Invalid index for Url fetch time in CSI latency info.");
            return -1;
        } catch (NumberFormatException e2) {
            zzb.zzaW("Cannot find valid format of Url fetch time in CSI latency info.");
            return -1;
        }
    }
}
