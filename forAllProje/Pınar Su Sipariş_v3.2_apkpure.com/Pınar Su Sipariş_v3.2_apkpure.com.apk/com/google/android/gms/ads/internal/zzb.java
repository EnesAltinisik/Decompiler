package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.overlay.zzg;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import com.google.android.gms.ads.internal.purchase.zzc;
import com.google.android.gms.ads.internal.purchase.zzd;
import com.google.android.gms.ads.internal.purchase.zzf;
import com.google.android.gms.ads.internal.purchase.zzj;
import com.google.android.gms.ads.internal.purchase.zzk;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza;
import com.google.android.gms.ads.internal.request.CapabilityParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzdc;
import com.google.android.gms.internal.zzej;
import com.google.android.gms.internal.zzfs;
import com.google.android.gms.internal.zzga;
import com.google.android.gms.internal.zzhe;
import com.google.android.gms.internal.zzhg;
import com.google.android.gms.internal.zzhh;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzjo;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzka;
import com.google.android.gms.internal.zzla;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Future;

@zzig
public abstract class zzb extends zza implements zzg, zzj, zzs, zzej, zzfs {
    private final Messenger mMessenger;
    protected final zzga zzqc;
    protected transient boolean zzqd;

    public zzb(Context context, AdSizeParcel adSizeParcel, String str, zzga com_google_android_gms_internal_zzga, VersionInfoParcel versionInfoParcel, zzd com_google_android_gms_ads_internal_zzd) {
        this(new zzv(context, adSizeParcel, str, versionInfoParcel), com_google_android_gms_internal_zzga, null, com_google_android_gms_ads_internal_zzd);
    }

    protected zzb(zzv com_google_android_gms_ads_internal_zzv, zzga com_google_android_gms_internal_zzga, zzr com_google_android_gms_ads_internal_zzr, zzd com_google_android_gms_ads_internal_zzd) {
        super(com_google_android_gms_ads_internal_zzv, com_google_android_gms_ads_internal_zzr, com_google_android_gms_ads_internal_zzd);
        this.zzqc = com_google_android_gms_internal_zzga;
        this.mMessenger = new Messenger(new zzhe(this.zzpV.zzov));
        this.zzqd = false;
    }

    private zza zza(AdRequestParcel adRequestParcel, Bundle bundle, zzjp com_google_android_gms_internal_zzjp) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo = this.zzpV.zzov.getApplicationInfo();
        try {
            packageInfo = this.zzpV.zzov.getPackageManager().getPackageInfo(applicationInfo.packageName, 0);
        } catch (NameNotFoundException e) {
            packageInfo = null;
        }
        DisplayMetrics displayMetrics = this.zzpV.zzov.getResources().getDisplayMetrics();
        Bundle bundle2 = null;
        if (!(this.zzpV.zzsy == null || this.zzpV.zzsy.getParent() == null)) {
            int[] iArr = new int[2];
            this.zzpV.zzsy.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            int width = this.zzpV.zzsy.getWidth();
            int height = this.zzpV.zzsy.getHeight();
            int i3 = 0;
            if (this.zzpV.zzsy.isShown() && i + width > 0 && i2 + height > 0 && i <= displayMetrics.widthPixels && i2 <= displayMetrics.heightPixels) {
                i3 = 1;
            }
            bundle2 = new Bundle(5);
            bundle2.putInt("x", i);
            bundle2.putInt("y", i2);
            bundle2.putInt("width", width);
            bundle2.putInt("height", height);
            bundle2.putInt("visible", i3);
        }
        String zziE = zzu.zzcn().zziE();
        this.zzpV.zzsE = new zzjo(zziE, this.zzpV.zzsv);
        this.zzpV.zzsE.zzq(adRequestParcel);
        String zza = zzu.zzck().zza(this.zzpV.zzov, this.zzpV.zzsy, this.zzpV.zzsB);
        long j = 0;
        if (this.zzpV.zzsI != null) {
            try {
                j = this.zzpV.zzsI.getValue();
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaW("Cannot get correlation id, default to 0.");
            }
        }
        String uuid = UUID.randomUUID().toString();
        Bundle zza2 = zzu.zzcn().zza(this.zzpV.zzov, this, zziE);
        List arrayList = new ArrayList();
        for (i = 0; i < this.zzpV.zzsO.size(); i++) {
            arrayList.add((String) this.zzpV.zzsO.b(i));
        }
        boolean z = this.zzpV.zzsJ != null;
        boolean z2 = this.zzpV.zzsK != null && zzu.zzcn().zziQ();
        boolean zzgP = this.zzpY.zzqo.zzgP();
        String str = "";
        if (((Boolean) zzcu.zzzK.get()).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaU("Getting webview cookie from CookieManager.");
            CookieManager zzN = zzu.zzcm().zzN(this.zzpV.zzov);
            if (zzN != null) {
                str = zzN.getCookie("googleads.g.doubleclick.net");
            }
        }
        String str2 = null;
        if (com_google_android_gms_internal_zzjp != null) {
            str2 = com_google_android_gms_internal_zzjp.zziB();
        }
        return new zza(bundle2, adRequestParcel, this.zzpV.zzsB, this.zzpV.zzsv, applicationInfo, packageInfo, zziE, zzu.zzcn().getSessionId(), this.zzpV.zzsx, zza2, this.zzpV.zzsT, arrayList, bundle, zzu.zzcn().zziI(), this.mMessenger, displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.density, zza, j, uuid, zzcu.zzer(), this.zzpV.zzsu, this.zzpV.zzsP, new CapabilityParcel(z, z2, zzgP), this.zzpV.zzcN(), zzu.zzck().zzbS(), zzu.zzck().zzbU(), zzu.zzck().zzL(this.zzpV.zzov), zzu.zzck().zzo(this.zzpV.zzsy), this.zzpV.zzov instanceof Activity, zzu.zzcn().zziM(), str, str2, zzu.zzcn().zziN(), zzu.zzcD().zzfe(), zzu.zzck().zzjd());
    }

    public String getMediationAdapterClassName() {
        return this.zzpV.zzsC == null ? null : this.zzpV.zzsC.zzFi;
    }

    public void onAdClicked() {
        if (this.zzpV.zzsC == null) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaW("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (!(this.zzpV.zzsC.zzOY == null || this.zzpV.zzsC.zzOY.zzEF == null)) {
            zzu.zzcz().zza(this.zzpV.zzov, this.zzpV.zzsx.afmaVersion, this.zzpV.zzsC, this.zzpV.zzsv, false, this.zzpV.zzsC.zzOY.zzEF);
        }
        if (!(this.zzpV.zzsC.zzFg == null || this.zzpV.zzsC.zzFg.zzEs == null)) {
            zzu.zzcz().zza(this.zzpV.zzov, this.zzpV.zzsx.afmaVersion, this.zzpV.zzsC, this.zzpV.zzsv, false, this.zzpV.zzsC.zzFg.zzEs);
        }
        super.onAdClicked();
    }

    public void onPause() {
        this.zzpX.zzk(this.zzpV.zzsC);
    }

    public void onResume() {
        this.zzpX.zzl(this.zzpV.zzsC);
    }

    public void pause() {
        zzaa.zzdc("pause must be called on the main UI thread.");
        if (!(this.zzpV.zzsC == null || this.zzpV.zzsC.zzHF == null || !this.zzpV.zzcJ())) {
            zzu.zzcm().zzi(this.zzpV.zzsC.zzHF);
        }
        if (!(this.zzpV.zzsC == null || this.zzpV.zzsC.zzFh == null)) {
            try {
                this.zzpV.zzsC.zzFh.pause();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaW("Could not pause mediation adapter.");
            }
        }
        this.zzpX.zzk(this.zzpV.zzsC);
        this.zzpU.pause();
    }

    public void recordImpression() {
        zza(this.zzpV.zzsC, false);
    }

    public void resume() {
        zzaa.zzdc("resume must be called on the main UI thread.");
        zzla com_google_android_gms_internal_zzla = null;
        if (!(this.zzpV.zzsC == null || this.zzpV.zzsC.zzHF == null)) {
            com_google_android_gms_internal_zzla = this.zzpV.zzsC.zzHF;
        }
        if (com_google_android_gms_internal_zzla != null && this.zzpV.zzcJ()) {
            zzu.zzcm().zzj(this.zzpV.zzsC.zzHF);
        }
        if (!(this.zzpV.zzsC == null || this.zzpV.zzsC.zzFh == null)) {
            try {
                this.zzpV.zzsC.zzFh.resume();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaW("Could not resume mediation adapter.");
            }
        }
        if (com_google_android_gms_internal_zzla == null || !com_google_android_gms_internal_zzla.zzjJ()) {
            this.zzpU.resume();
        }
        this.zzpX.zzl(this.zzpV.zzsC);
    }

    public void showInterstitial() {
        throw new IllegalStateException("showInterstitial is not supported for current ad type");
    }

    public void zza(zzhh com_google_android_gms_internal_zzhh) {
        zzaa.zzdc("setInAppPurchaseListener must be called on the main UI thread.");
        this.zzpV.zzsJ = com_google_android_gms_internal_zzhh;
    }

    public void zza(zzhl com_google_android_gms_internal_zzhl, String str) {
        zzaa.zzdc("setPlayStorePurchaseParams must be called on the main UI thread.");
        this.zzpV.zzsU = new zzk(str);
        this.zzpV.zzsK = com_google_android_gms_internal_zzhl;
        if (!zzu.zzcn().zziH() && com_google_android_gms_internal_zzhl != null) {
            Future future = (Future) new zzc(this.zzpV.zzov, this.zzpV.zzsK, this.zzpV.zzsU).zzhs();
        }
    }

    protected void zza(zzjn com_google_android_gms_internal_zzjn, boolean z) {
        if (com_google_android_gms_internal_zzjn == null) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaW("Ad state was null when trying to ping impression URLs.");
            return;
        }
        super.zzc(com_google_android_gms_internal_zzjn);
        if (!(com_google_android_gms_internal_zzjn.zzOY == null || com_google_android_gms_internal_zzjn.zzOY.zzEG == null)) {
            zzu.zzcz().zza(this.zzpV.zzov, this.zzpV.zzsx.afmaVersion, com_google_android_gms_internal_zzjn, this.zzpV.zzsv, z, com_google_android_gms_internal_zzjn.zzOY.zzEG);
        }
        if (com_google_android_gms_internal_zzjn.zzFg != null && com_google_android_gms_internal_zzjn.zzFg.zzEt != null) {
            zzu.zzcz().zza(this.zzpV.zzov, this.zzpV.zzsx.afmaVersion, com_google_android_gms_internal_zzjn, this.zzpV.zzsv, z, com_google_android_gms_internal_zzjn.zzFg.zzEt);
        }
    }

    public void zza(String str, ArrayList<String> arrayList) {
        zzhg com_google_android_gms_ads_internal_purchase_zzd = new zzd(str, arrayList, this.zzpV.zzov, this.zzpV.zzsx.afmaVersion);
        if (this.zzpV.zzsJ == null) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaW("InAppPurchaseListener is not set. Try to launch default purchase flow.");
            if (!zzm.zzdQ().zzQ(this.zzpV.zzov)) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaW("Google Play Service unavailable, cannot launch default purchase flow.");
                return;
            } else if (this.zzpV.zzsK == null) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaW("PlayStorePurchaseListener is not set.");
                return;
            } else if (this.zzpV.zzsU == null) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaW("PlayStorePurchaseVerifier is not initialized.");
                return;
            } else if (this.zzpV.zzsY) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaW("An in-app purchase request is already in progress, abort");
                return;
            } else {
                this.zzpV.zzsY = true;
                try {
                    if (this.zzpV.zzsK.isValidPurchase(str)) {
                        zzu.zzcu().zza(this.zzpV.zzov, this.zzpV.zzsx.zzRE, new GInAppPurchaseManagerInfoParcel(this.zzpV.zzov, this.zzpV.zzsU, com_google_android_gms_ads_internal_purchase_zzd, this));
                        return;
                    } else {
                        this.zzpV.zzsY = false;
                        return;
                    }
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaW("Could not start In-App purchase.");
                    this.zzpV.zzsY = false;
                    return;
                }
            }
        }
        try {
            this.zzpV.zzsJ.zza(com_google_android_gms_ads_internal_purchase_zzd);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaW("Could not start In-App purchase.");
        }
    }

    public void zza(String str, boolean z, int i, final Intent intent, zzf com_google_android_gms_ads_internal_purchase_zzf) {
        try {
            if (this.zzpV.zzsK != null) {
                this.zzpV.zzsK.zza(new com.google.android.gms.ads.internal.purchase.zzg(this.zzpV.zzov, str, z, i, intent, com_google_android_gms_ads_internal_purchase_zzf));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaW("Fail to invoke PlayStorePurchaseListener.");
        }
        zzka.zzQu.postDelayed(new Runnable(this) {
            final /* synthetic */ zzb b;

            public void run() {
                int zzd = zzu.zzcu().zzd(intent);
                zzu.zzcu();
                if (!(zzd != 0 || this.b.zzpV.zzsC == null || this.b.zzpV.zzsC.zzHF == null || this.b.zzpV.zzsC.zzHF.zzjB() == null)) {
                    this.b.zzpV.zzsC.zzHF.zzjB().close();
                }
                this.b.zzpV.zzsY = false;
            }
        }, 500);
    }

    public boolean zza(AdRequestParcel adRequestParcel, zzdc com_google_android_gms_internal_zzdc) {
        String str = null;
        if (!zzbr()) {
            return false;
        }
        zzjp zziO;
        Bundle zza = zza(zzu.zzcn().zzz(this.zzpV.zzov));
        this.zzpU.cancel();
        this.zzpV.zzsX = 0;
        if (((Boolean) zzcu.zzzq.get()).booleanValue()) {
            zziO = zzu.zzcn().zziO();
            zzg zzcC = zzu.zzcC();
            Context context = this.zzpV.zzov;
            VersionInfoParcel versionInfoParcel = this.zzpV.zzsx;
            if (zziO != null) {
                str = zziO.zziC();
            }
            zzcC.zza(context, versionInfoParcel, false, zziO, str, this.zzpV.zzsv);
        } else {
            zziO = null;
        }
        zza zza2 = zza(adRequestParcel, zza, zziO);
        com_google_android_gms_internal_zzdc.zzf("seq_num", zza2.zzLl);
        com_google_android_gms_internal_zzdc.zzf("request_id", zza2.zzLx);
        com_google_android_gms_internal_zzdc.zzf("session_id", zza2.zzLm);
        if (zza2.zzLj != null) {
            com_google_android_gms_internal_zzdc.zzf("app_version", String.valueOf(zza2.zzLj.versionCode));
        }
        this.zzpV.zzsz = zzu.zzcg().zza(this.zzpV.zzov, zza2, this.zzpV.zzsw, this);
        return true;
    }

    protected boolean zza(AdRequestParcel adRequestParcel, zzjn com_google_android_gms_internal_zzjn, boolean z) {
        if (!z && this.zzpV.zzcJ()) {
            if (com_google_android_gms_internal_zzjn.zzEL > 0) {
                this.zzpU.zza(adRequestParcel, com_google_android_gms_internal_zzjn.zzEL);
            } else if (com_google_android_gms_internal_zzjn.zzOY != null && com_google_android_gms_internal_zzjn.zzOY.zzEL > 0) {
                this.zzpU.zza(adRequestParcel, com_google_android_gms_internal_zzjn.zzOY.zzEL);
            } else if (!com_google_android_gms_internal_zzjn.zzLP && com_google_android_gms_internal_zzjn.errorCode == 2) {
                this.zzpU.zzg(adRequestParcel);
            }
        }
        return this.zzpU.zzbW();
    }

    boolean zza(zzjn com_google_android_gms_internal_zzjn) {
        AdRequestParcel adRequestParcel;
        boolean z = false;
        if (this.zzpW != null) {
            adRequestParcel = this.zzpW;
            this.zzpW = null;
        } else {
            adRequestParcel = com_google_android_gms_internal_zzjn.zzLi;
            if (adRequestParcel.extras != null) {
                z = adRequestParcel.extras.getBoolean("_noRefresh", false);
            }
        }
        return zza(adRequestParcel, com_google_android_gms_internal_zzjn, z);
    }

    protected boolean zza(zzjn com_google_android_gms_internal_zzjn, zzjn com_google_android_gms_internal_zzjn2) {
        int i;
        int i2 = 0;
        if (!(com_google_android_gms_internal_zzjn == null || com_google_android_gms_internal_zzjn.zzFj == null)) {
            com_google_android_gms_internal_zzjn.zzFj.zza(null);
        }
        if (com_google_android_gms_internal_zzjn2.zzFj != null) {
            com_google_android_gms_internal_zzjn2.zzFj.zza((zzfs) this);
        }
        if (com_google_android_gms_internal_zzjn2.zzOY != null) {
            i = com_google_android_gms_internal_zzjn2.zzOY.zzER;
            i2 = com_google_android_gms_internal_zzjn2.zzOY.zzES;
        } else {
            i = 0;
        }
        this.zzpV.zzsV.zzh(i, i2);
        return true;
    }

    public void zzb(zzjn com_google_android_gms_internal_zzjn) {
        super.zzb(com_google_android_gms_internal_zzjn);
        if (com_google_android_gms_internal_zzjn.zzFg != null) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaU("Pinging network fill URLs.");
            zzu.zzcz().zza(this.zzpV.zzov, this.zzpV.zzsx.afmaVersion, com_google_android_gms_internal_zzjn, this.zzpV.zzsv, false, com_google_android_gms_internal_zzjn.zzFg.zzEu);
            if (com_google_android_gms_internal_zzjn.zzOY.zzEI != null && com_google_android_gms_internal_zzjn.zzOY.zzEI.size() > 0) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaU("Pinging urls remotely");
                zzu.zzck().zza(this.zzpV.zzov, com_google_android_gms_internal_zzjn.zzOY.zzEI);
            }
        }
        if (com_google_android_gms_internal_zzjn.errorCode == 3 && com_google_android_gms_internal_zzjn.zzOY != null && com_google_android_gms_internal_zzjn.zzOY.zzEH != null) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaU("Pinging no fill URLs.");
            zzu.zzcz().zza(this.zzpV.zzov, this.zzpV.zzsx.afmaVersion, com_google_android_gms_internal_zzjn, this.zzpV.zzsv, false, com_google_android_gms_internal_zzjn.zzOY.zzEH);
        }
    }

    public void zzbA() {
        zzu.zzck().runOnUiThread(new Runnable(this) {
            final /* synthetic */ zzb a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.zzpU.pause();
            }
        });
    }

    public void zzbB() {
        zzu.zzck().runOnUiThread(new Runnable(this) {
            final /* synthetic */ zzb a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.zzpU.resume();
            }
        });
    }

    protected boolean zzbr() {
        return zzu.zzck().zza(this.zzpV.zzov.getPackageManager(), this.zzpV.zzov.getPackageName(), "android.permission.INTERNET") && zzu.zzck().zzB(this.zzpV.zzov);
    }

    public void zzbs() {
        this.zzpX.zzi(this.zzpV.zzsC);
        this.zzqd = false;
        zzbm();
        this.zzpV.zzsE.zziv();
    }

    public void zzbt() {
        this.zzqd = true;
        zzbo();
    }

    public void zzbu() {
        onAdClicked();
    }

    public void zzbv() {
        zzbs();
    }

    public void zzbw() {
        zzbj();
    }

    public void zzbx() {
        zzbt();
    }

    public void zzby() {
        if (this.zzpV.zzsC != null) {
            String str = this.zzpV.zzsC.zzFi;
            com.google.android.gms.ads.internal.util.client.zzb.zzaW(new StringBuilder(String.valueOf(str).length() + 74).append("Mediation adapter ").append(str).append(" refreshed, but mediation adapters should never refresh.").toString());
        }
        zza(this.zzpV.zzsC, true);
        zzbp();
    }

    public void zzbz() {
        recordImpression();
    }

    protected boolean zzc(AdRequestParcel adRequestParcel) {
        return super.zzc(adRequestParcel) && !this.zzqd;
    }
}
