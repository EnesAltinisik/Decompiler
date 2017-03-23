package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.Window;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzdc;
import com.google.android.gms.internal.zzel;
import com.google.android.gms.internal.zzep;
import com.google.android.gms.internal.zzep.zza;
import com.google.android.gms.internal.zzfk;
import com.google.android.gms.internal.zzfq;
import com.google.android.gms.internal.zzfr;
import com.google.android.gms.internal.zzga;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzij;
import com.google.android.gms.internal.zzjh;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzjv;
import com.google.android.gms.internal.zzka;
import com.google.android.gms.internal.zzla;
import com.google.android.gms.internal.zzlb;
import java.util.Collections;
import java.util.concurrent.Future;
import org.json.JSONObject;

@zzig
public class zzl extends zzc implements zzel, zza {
    protected transient boolean zzqX = false;
    private int zzqY = -1;
    private boolean zzqZ;
    private float zzra;

    @zzig
    private class a extends zzjv {
        final /* synthetic */ zzl a;
        private final int b;

        public a(zzl com_google_android_gms_ads_internal_zzl, int i) {
            this.a = com_google_android_gms_ads_internal_zzl;
            this.b = i;
        }

        public void onStop() {
        }

        public void zzbQ() {
            InterstitialAdParameterParcel interstitialAdParameterParcel = new InterstitialAdParameterParcel(this.a.zzpV.zzrf, this.a.zzbN(), this.a.zzqZ, this.a.zzra, this.a.zzpV.zzrf ? this.b : -1);
            int requestedOrientation = this.a.zzpV.zzsC.zzHF.getRequestedOrientation();
            final AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this.a, this.a, this.a, this.a.zzpV.zzsC.zzHF, requestedOrientation == -1 ? this.a.zzpV.zzsC.orientation : requestedOrientation, this.a.zzpV.zzsx, this.a.zzpV.zzsC.zzLU, interstitialAdParameterParcel);
            zzka.zzQu.post(new Runnable(this) {
                final /* synthetic */ a b;

                public void run() {
                    zzu.zzci().zza(this.b.a.zzpV.zzov, adOverlayInfoParcel);
                }
            });
        }
    }

    public zzl(Context context, AdSizeParcel adSizeParcel, String str, zzga com_google_android_gms_internal_zzga, VersionInfoParcel versionInfoParcel, zzd com_google_android_gms_ads_internal_zzd) {
        super(context, adSizeParcel, str, com_google_android_gms_internal_zzga, versionInfoParcel, com_google_android_gms_ads_internal_zzd);
    }

    private void zzb(Bundle bundle) {
        zzu.zzck().zzb(this.zzpV.zzov, this.zzpV.zzsx.afmaVersion, "gmob-apps", bundle, false);
    }

    private zzjn.zza zzc(zzjn.zza com_google_android_gms_internal_zzjn_zza) {
        try {
            String jSONObject = zzij.zzc(com_google_android_gms_internal_zzjn_zza.zzPi).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, com_google_android_gms_internal_zzjn_zza.zzPh.zzsv);
            zzfr com_google_android_gms_internal_zzfr = new zzfr(Collections.singletonList(new zzfq(jSONObject, null, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), null, Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList())), -1, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1, 0, 1, null, 0, -1, -1, false);
            AdResponseParcel adResponseParcel = com_google_android_gms_internal_zzjn_zza.zzPi;
            return new zzjn.zza(com_google_android_gms_internal_zzjn_zza.zzPh, new AdResponseParcel(com_google_android_gms_internal_zzjn_zza.zzPh, adResponseParcel.zzHH, adResponseParcel.body, adResponseParcel.zzEF, adResponseParcel.zzEG, adResponseParcel.zzLO, true, adResponseParcel.zzLQ, adResponseParcel.zzLR, adResponseParcel.zzEL, adResponseParcel.orientation, adResponseParcel.zzLS, adResponseParcel.zzLT, adResponseParcel.zzLU, adResponseParcel.zzLV, adResponseParcel.zzLW, adResponseParcel.zzLX, adResponseParcel.zzLY, adResponseParcel.zzvv, adResponseParcel.zzLq, adResponseParcel.zzLZ, adResponseParcel.zzMa, adResponseParcel.zzMb, adResponseParcel.zzMe, adResponseParcel.zzvw, adResponseParcel.zzvx, adResponseParcel.zzMf, adResponseParcel.zzMg, adResponseParcel.zzMh, adResponseParcel.zzMi, adResponseParcel.zzMj, adResponseParcel.zzLH, adResponseParcel.zzLI, adResponseParcel.zzEI, adResponseParcel.zzMk, adResponseParcel.zzEJ), com_google_android_gms_internal_zzfr, com_google_android_gms_internal_zzjn_zza.zzsB, com_google_android_gms_internal_zzjn_zza.errorCode, com_google_android_gms_internal_zzjn_zza.zzPc, com_google_android_gms_internal_zzjn_zza.zzPd, com_google_android_gms_internal_zzjn_zza.zzOW);
        } catch (Throwable e) {
            zzb.zzb("Unable to generate ad state for an interstitial ad with pooling.", e);
            return com_google_android_gms_internal_zzjn_zza;
        }
    }

    public void showInterstitial() {
        zzaa.zzdc("showInterstitial must be called on the main UI thread.");
        if (this.zzpV.zzsC == null) {
            zzb.zzaW("The interstitial has not loaded.");
            return;
        }
        if (((Boolean) zzcu.zzyv.get()).booleanValue()) {
            Bundle bundle;
            String packageName = this.zzpV.zzov.getApplicationContext() != null ? this.zzpV.zzov.getApplicationContext().getPackageName() : this.zzpV.zzov.getPackageName();
            if (!this.zzqX) {
                zzb.zzaW("It is not recommended to show an interstitial before onAdLoaded completes.");
                bundle = new Bundle();
                bundle.putString("appid", packageName);
                bundle.putString("action", "show_interstitial_before_load_finish");
                zzb(bundle);
            }
            if (!zzu.zzck().zzH(this.zzpV.zzov)) {
                zzb.zzaW("It is not recommended to show an interstitial when app is not in foreground.");
                bundle = new Bundle();
                bundle.putString("appid", packageName);
                bundle.putString("action", "show_interstitial_app_not_in_foreground");
                zzb(bundle);
            }
        }
        if (!this.zzpV.zzcK()) {
            if (this.zzpV.zzsC.zzLP && this.zzpV.zzsC.zzFh != null) {
                try {
                    this.zzpV.zzsC.zzFh.showInterstitial();
                } catch (Throwable e) {
                    zzb.zzd("Could not show interstitial.", e);
                    zzbO();
                }
            } else if (this.zzpV.zzsC.zzHF == null) {
                zzb.zzaW("The interstitial failed to load.");
            } else if (this.zzpV.zzsC.zzHF.zzjH()) {
                zzb.zzaW("The interstitial is already showing.");
            } else {
                this.zzpV.zzsC.zzHF.zzG(true);
                if (this.zzpV.zzsC.zzOW != null) {
                    this.zzpX.zza(this.zzpV.zzsB, this.zzpV.zzsC);
                }
                Bitmap zzI = this.zzpV.zzrf ? zzu.zzck().zzI(this.zzpV.zzov) : null;
                this.zzqY = zzu.zzcB().zzb(zzI);
                if (!((Boolean) zzcu.zzyZ.get()).booleanValue() || zzI == null) {
                    InterstitialAdParameterParcel interstitialAdParameterParcel = new InterstitialAdParameterParcel(this.zzpV.zzrf, zzbN(), false, 0.0f, -1);
                    int requestedOrientation = this.zzpV.zzsC.zzHF.getRequestedOrientation();
                    if (requestedOrientation == -1) {
                        requestedOrientation = this.zzpV.zzsC.orientation;
                    }
                    zzu.zzci().zza(this.zzpV.zzov, new AdOverlayInfoParcel(this, this, this, this.zzpV.zzsC.zzHF, requestedOrientation, this.zzpV.zzsx, this.zzpV.zzsC.zzLU, interstitialAdParameterParcel));
                    return;
                }
                Future future = (Future) new a(this, this.zzqY).zzhs();
            }
        }
    }

    protected zzla zza(zzjn.zza com_google_android_gms_internal_zzjn_zza, zze com_google_android_gms_ads_internal_zze, zzjh com_google_android_gms_internal_zzjh) {
        zzla zza = zzu.zzcl().zza(this.zzpV.zzov, this.zzpV.zzsB, false, false, this.zzpV.zzsw, this.zzpV.zzsx, this.zzpQ, this, this.zzpY);
        zza.zzjD().zza(this, null, this, this, ((Boolean) zzcu.zzxU.get()).booleanValue(), this, this, com_google_android_gms_ads_internal_zze, null, com_google_android_gms_internal_zzjh);
        zza((zzfk) zza);
        zza.zzaY(com_google_android_gms_internal_zzjn_zza.zzPh.zzLx);
        zzep.zza(zza, (zza) this);
        return zza;
    }

    public void zza(zzjn.zza com_google_android_gms_internal_zzjn_zza, zzdc com_google_android_gms_internal_zzdc) {
        Object obj = 1;
        if (!((Boolean) zzcu.zzyf.get()).booleanValue()) {
            super.zza(com_google_android_gms_internal_zzjn_zza, com_google_android_gms_internal_zzdc);
        } else if (com_google_android_gms_internal_zzjn_zza.errorCode != -2) {
            super.zza(com_google_android_gms_internal_zzjn_zza, com_google_android_gms_internal_zzdc);
        } else {
            Bundle bundle = com_google_android_gms_internal_zzjn_zza.zzPh.zzLi.zzuX.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
            Object obj2 = (bundle == null || !bundle.containsKey("gw")) ? 1 : null;
            if (com_google_android_gms_internal_zzjn_zza.zzPi.zzLP) {
                obj = null;
            }
            if (!(obj2 == null || r2 == null)) {
                this.zzpV.zzsD = zzc(com_google_android_gms_internal_zzjn_zza);
            }
            super.zza(this.zzpV.zzsD, com_google_android_gms_internal_zzdc);
        }
    }

    public void zza(boolean z, float f) {
        this.zzqZ = z;
        this.zzra = f;
    }

    public boolean zza(AdRequestParcel adRequestParcel, zzdc com_google_android_gms_internal_zzdc) {
        if (this.zzpV.zzsC == null) {
            return super.zza(adRequestParcel, com_google_android_gms_internal_zzdc);
        }
        zzb.zzaW("An interstitial is already loading. Aborting.");
        return false;
    }

    protected boolean zza(AdRequestParcel adRequestParcel, zzjn com_google_android_gms_internal_zzjn, boolean z) {
        if (this.zzpV.zzcJ() && com_google_android_gms_internal_zzjn.zzHF != null) {
            zzu.zzcm().zzi(com_google_android_gms_internal_zzjn.zzHF);
        }
        return this.zzpU.zzbW();
    }

    public boolean zza(zzjn com_google_android_gms_internal_zzjn, zzjn com_google_android_gms_internal_zzjn2) {
        if (!super.zza(com_google_android_gms_internal_zzjn, com_google_android_gms_internal_zzjn2)) {
            return false;
        }
        if (!(this.zzpV.zzcJ() || this.zzpV.zzsW == null || com_google_android_gms_internal_zzjn2.zzOW == null)) {
            this.zzpX.zza(this.zzpV.zzsB, com_google_android_gms_internal_zzjn2, this.zzpV.zzsW);
        }
        return true;
    }

    public void zzb(RewardItemParcel rewardItemParcel) {
        if (this.zzpV.zzsC != null) {
            if (this.zzpV.zzsC.zzMh != null) {
                zzu.zzck().zza(this.zzpV.zzov, this.zzpV.zzsx.afmaVersion, this.zzpV.zzsC.zzMh);
            }
            if (this.zzpV.zzsC.zzMf != null) {
                rewardItemParcel = this.zzpV.zzsC.zzMf;
            }
        }
        zza(rewardItemParcel);
    }

    protected boolean zzbN() {
        if (!(this.zzpV.zzov instanceof Activity)) {
            return false;
        }
        Window window = ((Activity) this.zzpV.zzov).getWindow();
        if (window == null || window.getDecorView() == null) {
            return false;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        window.getDecorView().getGlobalVisibleRect(rect, null);
        window.getDecorView().getWindowVisibleDisplayFrame(rect2);
        boolean z = (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) ? false : true;
        return z;
    }

    public void zzbO() {
        zzu.zzcB().zzb(Integer.valueOf(this.zzqY));
        if (this.zzpV.zzcJ()) {
            this.zzpV.zzcG();
            this.zzpV.zzsC = null;
            this.zzpV.zzrf = false;
            this.zzqX = false;
        }
    }

    public void zzbP() {
        if (!(this.zzpV.zzsC == null || this.zzpV.zzsC.zzPb == null)) {
            zzu.zzck().zza(this.zzpV.zzov, this.zzpV.zzsx.afmaVersion, this.zzpV.zzsC.zzPb);
        }
        zzbq();
    }

    protected void zzbm() {
        zzbO();
        super.zzbm();
    }

    protected void zzbp() {
        super.zzbp();
        this.zzqX = true;
    }

    public void zzbt() {
        recordImpression();
        super.zzbt();
        if (this.zzpV.zzsC != null && this.zzpV.zzsC.zzHF != null) {
            zzlb zzjD = this.zzpV.zzsC.zzHF.zzjD();
            if (zzjD != null) {
                zzjD.zzjU();
            }
        }
    }

    public void zzf(boolean z) {
        this.zzpV.zzrf = z;
    }
}
