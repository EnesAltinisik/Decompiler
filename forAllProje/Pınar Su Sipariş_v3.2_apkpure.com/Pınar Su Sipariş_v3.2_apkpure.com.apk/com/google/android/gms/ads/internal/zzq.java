package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.support.v4.h.j;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.zzd;
import com.google.android.gms.ads.internal.formats.zze;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.ads.internal.formats.zzg;
import com.google.android.gms.ads.internal.formats.zzh;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzdc;
import com.google.android.gms.internal.zzdg;
import com.google.android.gms.internal.zzdt;
import com.google.android.gms.internal.zzdu;
import com.google.android.gms.internal.zzdv;
import com.google.android.gms.internal.zzdw;
import com.google.android.gms.internal.zzga;
import com.google.android.gms.internal.zzge;
import com.google.android.gms.internal.zzgf;
import com.google.android.gms.internal.zzhh;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzjn.zza;
import com.google.android.gms.internal.zzka;
import java.util.List;

@zzig
public class zzq extends zzb {
    public zzq(Context context, zzd com_google_android_gms_ads_internal_zzd, AdSizeParcel adSizeParcel, String str, zzga com_google_android_gms_internal_zzga, VersionInfoParcel versionInfoParcel) {
        super(context, adSizeParcel, str, com_google_android_gms_internal_zzga, versionInfoParcel, com_google_android_gms_ads_internal_zzd);
    }

    private static zzd zza(zzge com_google_android_gms_internal_zzge) throws RemoteException {
        return new zzd(com_google_android_gms_internal_zzge.getHeadline(), com_google_android_gms_internal_zzge.getImages(), com_google_android_gms_internal_zzge.getBody(), com_google_android_gms_internal_zzge.zzeN() != null ? com_google_android_gms_internal_zzge.zzeN() : null, com_google_android_gms_internal_zzge.getCallToAction(), com_google_android_gms_internal_zzge.getStarRating(), com_google_android_gms_internal_zzge.getStore(), com_google_android_gms_internal_zzge.getPrice(), null, com_google_android_gms_internal_zzge.getExtras());
    }

    private static zze zza(zzgf com_google_android_gms_internal_zzgf) throws RemoteException {
        return new zze(com_google_android_gms_internal_zzgf.getHeadline(), com_google_android_gms_internal_zzgf.getImages(), com_google_android_gms_internal_zzgf.getBody(), com_google_android_gms_internal_zzgf.zzeR() != null ? com_google_android_gms_internal_zzgf.zzeR() : null, com_google_android_gms_internal_zzgf.getCallToAction(), com_google_android_gms_internal_zzgf.getAdvertiser(), null, com_google_android_gms_internal_zzgf.getExtras());
    }

    private void zza(final zzd com_google_android_gms_ads_internal_formats_zzd) {
        zzka.zzQu.post(new Runnable(this) {
            final /* synthetic */ zzq b;

            public void run() {
                try {
                    if (this.b.zzpV.zzsL != null) {
                        this.b.zzpV.zzsL.zza(com_google_android_gms_ads_internal_formats_zzd);
                    }
                } catch (Throwable e) {
                    zzb.zzd("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", e);
                }
            }
        });
    }

    private void zza(final zze com_google_android_gms_ads_internal_formats_zze) {
        zzka.zzQu.post(new Runnable(this) {
            final /* synthetic */ zzq b;

            public void run() {
                try {
                    if (this.b.zzpV.zzsM != null) {
                        this.b.zzpV.zzsM.zza(com_google_android_gms_ads_internal_formats_zze);
                    }
                } catch (Throwable e) {
                    zzb.zzd("Could not call OnContentAdLoadedListener.onContentAdLoaded().", e);
                }
            }
        });
    }

    private void zza(final zzjn com_google_android_gms_internal_zzjn, final String str) {
        zzka.zzQu.post(new Runnable(this) {
            final /* synthetic */ zzq c;

            public void run() {
                try {
                    ((zzdw) this.c.zzpV.zzsO.get(str)).zza((zzf) com_google_android_gms_internal_zzjn.zzPe);
                } catch (Throwable e) {
                    zzb.zzd("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
                }
            }
        });
    }

    public void pause() {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    public void resume() {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    public void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    public void zza(j<String, zzdw> jVar) {
        zzaa.zzdc("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        this.zzpV.zzsO = jVar;
    }

    public void zza(zzh com_google_android_gms_ads_internal_formats_zzh) {
        if (this.zzpV.zzsC.zzOW != null) {
            zzu.zzcn().zziP().zza(this.zzpV.zzsB, this.zzpV.zzsC, com_google_android_gms_ads_internal_formats_zzh);
        }
    }

    public void zza(zzdg com_google_android_gms_internal_zzdg) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    public void zza(zzhh com_google_android_gms_internal_zzhh) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    public void zza(final zza com_google_android_gms_internal_zzjn_zza, zzdc com_google_android_gms_internal_zzdc) {
        if (com_google_android_gms_internal_zzjn_zza.zzsB != null) {
            this.zzpV.zzsB = com_google_android_gms_internal_zzjn_zza.zzsB;
        }
        if (com_google_android_gms_internal_zzjn_zza.errorCode != -2) {
            zzka.zzQu.post(new Runnable(this) {
                final /* synthetic */ zzq b;

                public void run() {
                    this.b.zzb(new zzjn(com_google_android_gms_internal_zzjn_zza, null, null, null, null, null, null, null));
                }
            });
            return;
        }
        this.zzpV.zzsX = 0;
        this.zzpV.zzsA = zzu.zzcj().zza(this.zzpV.zzov, this, com_google_android_gms_internal_zzjn_zza, this.zzpV.zzsw, null, this.zzqc, this, com_google_android_gms_internal_zzdc);
        String str = "AdRenderer: ";
        String valueOf = String.valueOf(this.zzpV.zzsA.getClass().getName());
        zzb.zzaU(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    protected boolean zza(AdRequestParcel adRequestParcel, zzjn com_google_android_gms_internal_zzjn, boolean z) {
        return this.zzpU.zzbW();
    }

    protected boolean zza(zzjn com_google_android_gms_internal_zzjn, zzjn com_google_android_gms_internal_zzjn2) {
        zzgf com_google_android_gms_internal_zzgf = null;
        zzb(null);
        if (this.zzpV.zzcJ()) {
            if (com_google_android_gms_internal_zzjn2.zzLP) {
                try {
                    zzge zzfI = com_google_android_gms_internal_zzjn2.zzFh != null ? com_google_android_gms_internal_zzjn2.zzFh.zzfI() : null;
                    if (com_google_android_gms_internal_zzjn2.zzFh != null) {
                        com_google_android_gms_internal_zzgf = com_google_android_gms_internal_zzjn2.zzFh.zzfJ();
                    }
                    if (zzfI == null || this.zzpV.zzsL == null) {
                        if (com_google_android_gms_internal_zzgf != null) {
                            if (this.zzpV.zzsM != null) {
                                zze zza = zza(com_google_android_gms_internal_zzgf);
                                zza.zzb(new zzg(this.zzpV.zzov, this, this.zzpV.zzsw, com_google_android_gms_internal_zzgf));
                                zza(zza);
                            }
                        }
                        zzb.zzaW("No matching mapper/listener for retrieved native ad template.");
                        zzf(0);
                        return false;
                    }
                    zzd zza2 = zza(zzfI);
                    zza2.zzb(new zzg(this.zzpV.zzov, this, this.zzpV.zzsw, zzfI));
                    zza(zza2);
                } catch (Throwable e) {
                    zzb.zzd("Failed to get native ad mapper", e);
                }
            } else {
                zzh.zza com_google_android_gms_ads_internal_formats_zzh_zza = com_google_android_gms_internal_zzjn2.zzPe;
                if ((com_google_android_gms_ads_internal_formats_zzh_zza instanceof zze) && this.zzpV.zzsM != null) {
                    zza((zze) com_google_android_gms_internal_zzjn2.zzPe);
                } else if ((com_google_android_gms_ads_internal_formats_zzh_zza instanceof zzd) && this.zzpV.zzsL != null) {
                    zza((zzd) com_google_android_gms_internal_zzjn2.zzPe);
                } else if (!(com_google_android_gms_ads_internal_formats_zzh_zza instanceof zzf) || this.zzpV.zzsO == null || this.zzpV.zzsO.get(((zzf) com_google_android_gms_ads_internal_formats_zzh_zza).getCustomTemplateId()) == null) {
                    zzb.zzaW("No matching listener for retrieved native ad template.");
                    zzf(0);
                    return false;
                } else {
                    zza(com_google_android_gms_internal_zzjn2, ((zzf) com_google_android_gms_ads_internal_formats_zzh_zza).getCustomTemplateId());
                }
            }
            return super.zza(com_google_android_gms_internal_zzjn, com_google_android_gms_internal_zzjn2);
        }
        throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
    }

    public void zzb(j<String, zzdv> jVar) {
        zzaa.zzdc("setOnCustomClickListener must be called on the main UI thread.");
        this.zzpV.zzsN = jVar;
    }

    public void zzb(NativeAdOptionsParcel nativeAdOptionsParcel) {
        zzaa.zzdc("setNativeAdOptions must be called on the main UI thread.");
        this.zzpV.zzsP = nativeAdOptionsParcel;
    }

    public void zzb(zzdt com_google_android_gms_internal_zzdt) {
        zzaa.zzdc("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        this.zzpV.zzsL = com_google_android_gms_internal_zzdt;
    }

    public void zzb(zzdu com_google_android_gms_internal_zzdu) {
        zzaa.zzdc("setOnContentAdLoadedListener must be called on the main UI thread.");
        this.zzpV.zzsM = com_google_android_gms_internal_zzdu;
    }

    public void zzb(List<String> list) {
        zzaa.zzdc("setNativeTemplates must be called on the main UI thread.");
        this.zzpV.zzsT = list;
    }

    public j<String, zzdw> zzbV() {
        zzaa.zzdc("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.zzpV.zzsO;
    }

    public zzdv zzv(String str) {
        zzaa.zzdc("getOnCustomClickListener must be called on the main UI thread.");
        return (zzdv) this.zzpV.zzsN.get(str);
    }
}
