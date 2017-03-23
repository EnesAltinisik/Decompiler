package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzab;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzga;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzjh;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzla;
import com.google.android.gms.internal.zzlb;
import com.google.android.gms.internal.zzlf;
import java.util.List;

@zzig
public class zzf extends zzc implements OnGlobalLayoutListener, OnScrollChangedListener {
    private boolean zzqs;

    public class zza {
        final /* synthetic */ zzf zzqu;

        public zza(zzf com_google_android_gms_ads_internal_zzf) {
            this.zzqu = com_google_android_gms_ads_internal_zzf;
        }

        public void onClick() {
            this.zzqu.onAdClicked();
        }
    }

    public zzf(Context context, AdSizeParcel adSizeParcel, String str, zzga com_google_android_gms_internal_zzga, VersionInfoParcel versionInfoParcel, zzd com_google_android_gms_ads_internal_zzd) {
        super(context, adSizeParcel, str, com_google_android_gms_internal_zzga, versionInfoParcel, com_google_android_gms_ads_internal_zzd);
    }

    private AdSizeParcel zzb(com.google.android.gms.internal.zzjn.zza com_google_android_gms_internal_zzjn_zza) {
        if (com_google_android_gms_internal_zzjn_zza.zzPi.zzvw) {
            return this.zzpV.zzsB;
        }
        AdSize adSize;
        String str = com_google_android_gms_internal_zzjn_zza.zzPi.zzLS;
        if (str != null) {
            String[] split = str.split("[xX]");
            split[0] = split[0].trim();
            split[1] = split[1].trim();
            adSize = new AdSize(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
        } else {
            adSize = this.zzpV.zzsB.zzdD();
        }
        return new AdSizeParcel(this.zzpV.zzov, adSize);
    }

    private boolean zzb(zzjn com_google_android_gms_internal_zzjn, zzjn com_google_android_gms_internal_zzjn2) {
        if (com_google_android_gms_internal_zzjn2.zzLP) {
            View zzf = zzn.zzf(com_google_android_gms_internal_zzjn2);
            if (zzf == null) {
                zzb.zzaW("Could not get mediation view");
                return false;
            }
            View nextView = this.zzpV.zzsy.getNextView();
            if (nextView != null) {
                if (nextView instanceof zzla) {
                    ((zzla) nextView).destroy();
                }
                this.zzpV.zzsy.removeView(nextView);
            }
            if (!zzn.zzg(com_google_android_gms_internal_zzjn2)) {
                try {
                    zzb(zzf);
                } catch (Throwable th) {
                    zzb.zzd("Could not add mediation view to view hierarchy.", th);
                    return false;
                }
            }
        } else if (!(com_google_android_gms_internal_zzjn2.zzPa == null || com_google_android_gms_internal_zzjn2.zzHF == null)) {
            com_google_android_gms_internal_zzjn2.zzHF.zza(com_google_android_gms_internal_zzjn2.zzPa);
            this.zzpV.zzsy.removeAllViews();
            this.zzpV.zzsy.setMinimumWidth(com_google_android_gms_internal_zzjn2.zzPa.widthPixels);
            this.zzpV.zzsy.setMinimumHeight(com_google_android_gms_internal_zzjn2.zzPa.heightPixels);
            zzb(com_google_android_gms_internal_zzjn2.zzHF.getView());
        }
        if (this.zzpV.zzsy.getChildCount() > 1) {
            this.zzpV.zzsy.showNext();
        }
        if (com_google_android_gms_internal_zzjn != null) {
            View nextView2 = this.zzpV.zzsy.getNextView();
            if (nextView2 instanceof zzla) {
                ((zzla) nextView2).zza(this.zzpV.zzov, this.zzpV.zzsB, this.zzpQ);
            } else if (nextView2 != null) {
                this.zzpV.zzsy.removeView(nextView2);
            }
            this.zzpV.zzcI();
        }
        this.zzpV.zzsy.setVisibility(0);
        return true;
    }

    private void zzd(final zzjn com_google_android_gms_internal_zzjn) {
        if (this.zzpV.zzcJ()) {
            if (com_google_android_gms_internal_zzjn.zzHF != null) {
                if (com_google_android_gms_internal_zzjn.zzOW != null) {
                    this.zzpX.zza(this.zzpV.zzsB, com_google_android_gms_internal_zzjn);
                }
                if (com_google_android_gms_internal_zzjn.zzdi()) {
                    this.zzpX.zza(this.zzpV.zzsB, com_google_android_gms_internal_zzjn).zza(com_google_android_gms_internal_zzjn.zzHF);
                } else {
                    com_google_android_gms_internal_zzjn.zzHF.zzjD().zza(new zzlb.zzb(this) {
                        final /* synthetic */ zzf b;

                        public void zzbH() {
                            this.b.zzpX.zza(this.b.zzpV.zzsB, com_google_android_gms_internal_zzjn).zza(com_google_android_gms_internal_zzjn.zzHF);
                        }
                    });
                }
            }
        } else if (this.zzpV.zzsW != null && com_google_android_gms_internal_zzjn.zzOW != null) {
            this.zzpX.zza(this.zzpV.zzsB, com_google_android_gms_internal_zzjn, this.zzpV.zzsW);
        }
    }

    public void onGlobalLayout() {
        zze(this.zzpV.zzsC);
    }

    public void onScrollChanged() {
        zze(this.zzpV.zzsC);
    }

    public void setManualImpressionsEnabled(boolean z) {
        zzaa.zzdc("setManualImpressionsEnabled must be called from the main thread.");
        this.zzqs = z;
    }

    public void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    protected zzla zza(com.google.android.gms.internal.zzjn.zza com_google_android_gms_internal_zzjn_zza, zze com_google_android_gms_ads_internal_zze, zzjh com_google_android_gms_internal_zzjh) {
        if (this.zzpV.zzsB.zzvw) {
            this.zzpV.zzsB = zzb(com_google_android_gms_internal_zzjn_zza);
        }
        return super.zza(com_google_android_gms_internal_zzjn_zza, com_google_android_gms_ads_internal_zze, com_google_android_gms_internal_zzjh);
    }

    protected void zza(zzjn com_google_android_gms_internal_zzjn, boolean z) {
        super.zza(com_google_android_gms_internal_zzjn, z);
        if (zzn.zzg(com_google_android_gms_internal_zzjn)) {
            zzn.zza(com_google_android_gms_internal_zzjn, new zza(this));
        }
    }

    public boolean zza(zzjn com_google_android_gms_internal_zzjn, zzjn com_google_android_gms_internal_zzjn2) {
        if (!super.zza(com_google_android_gms_internal_zzjn, com_google_android_gms_internal_zzjn2)) {
            return false;
        }
        if (!this.zzpV.zzcJ() || zzb(com_google_android_gms_internal_zzjn, com_google_android_gms_internal_zzjn2)) {
            if (com_google_android_gms_internal_zzjn2.zzMi) {
                zze(com_google_android_gms_internal_zzjn2);
                zzu.zzcE().zza(this.zzpV.zzsy, (OnGlobalLayoutListener) this);
                zzu.zzcE().zza(this.zzpV.zzsy, (OnScrollChangedListener) this);
            } else if (!this.zzpV.zzcK() || ((Boolean) zzcu.zzzd.get()).booleanValue()) {
                zza(com_google_android_gms_internal_zzjn2, false);
            }
            zzlf com_google_android_gms_internal_zzlf = null;
            if (com_google_android_gms_internal_zzjn2.zzHF != null) {
                com_google_android_gms_internal_zzlf = com_google_android_gms_internal_zzjn2.zzHF.zzjN();
                zzlb zzjD = com_google_android_gms_internal_zzjn2.zzHF.zzjD();
                if (zzjD != null) {
                    zzjD.zzjU();
                }
            }
            if (!(this.zzpV.zzsQ == null || com_google_android_gms_internal_zzlf == null)) {
                com_google_android_gms_internal_zzlf.zzL(this.zzpV.zzsQ.zzwN);
            }
            zzd(com_google_android_gms_internal_zzjn2);
            return true;
        }
        zzf(0);
        return false;
    }

    public boolean zzb(AdRequestParcel adRequestParcel) {
        return super.zzb(zze(adRequestParcel));
    }

    public zzab zzbl() {
        zzaa.zzdc("getVideoController must be called from the main thread.");
        return (this.zzpV.zzsC == null || this.zzpV.zzsC.zzHF == null) ? null : this.zzpV.zzsC.zzHF.zzjN();
    }

    protected boolean zzbr() {
        boolean z = true;
        if (!zzu.zzck().zza(this.zzpV.zzov.getPackageManager(), this.zzpV.zzov.getPackageName(), "android.permission.INTERNET")) {
            zzm.zzdQ().zza(this.zzpV.zzsy, this.zzpV.zzsB, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        }
        if (!zzu.zzck().zzB(this.zzpV.zzov)) {
            zzm.zzdQ().zza(this.zzpV.zzsy, this.zzpV.zzsB, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!(z || this.zzpV.zzsy == null)) {
            this.zzpV.zzsy.setVisibility(0);
        }
        return z;
    }

    AdRequestParcel zze(AdRequestParcel adRequestParcel) {
        if (adRequestParcel.zzuS == this.zzqs) {
            return adRequestParcel;
        }
        int i = adRequestParcel.versionCode;
        long j = adRequestParcel.zzuN;
        Bundle bundle = adRequestParcel.extras;
        int i2 = adRequestParcel.zzuO;
        List list = adRequestParcel.zzuP;
        boolean z = adRequestParcel.zzuQ;
        int i3 = adRequestParcel.zzuR;
        boolean z2 = adRequestParcel.zzuS || this.zzqs;
        return new AdRequestParcel(i, j, bundle, i2, list, z, i3, z2, adRequestParcel.zzuT, adRequestParcel.zzuU, adRequestParcel.zzuV, adRequestParcel.zzuW, adRequestParcel.zzuX, adRequestParcel.zzuY, adRequestParcel.zzuZ, adRequestParcel.zzva, adRequestParcel.zzvb, adRequestParcel.zzvc);
    }

    void zze(zzjn com_google_android_gms_internal_zzjn) {
        if (com_google_android_gms_internal_zzjn != null && !com_google_android_gms_internal_zzjn.zzOX && this.zzpV.zzsy != null && zzu.zzck().zza(this.zzpV.zzsy, this.zzpV.zzov) && this.zzpV.zzsy.getGlobalVisibleRect(new Rect(), null)) {
            zza(com_google_android_gms_internal_zzjn, false);
            com_google_android_gms_internal_zzjn.zzOX = true;
        }
    }
}
