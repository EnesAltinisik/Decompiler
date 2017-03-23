package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzx.zza;
import com.google.android.gms.ads.internal.reward.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzdl;
import com.google.android.gms.internal.zzdx;
import com.google.android.gms.internal.zzga;
import com.google.android.gms.internal.zzgy;
import com.google.android.gms.internal.zzgz;
import com.google.android.gms.internal.zzhi;
import com.google.android.gms.internal.zzhn;
import com.google.android.gms.internal.zzig;
import com.google.firebase.analytics.FirebaseAnalytics.Event;

@zzig
public class zzl {
    private final Object zzpp = new Object();
    private zzx zzvA;
    private final zze zzvB;
    private final zzd zzvC;
    private final zzai zzvD;
    private final zzdx zzvE;
    private final zzf zzvF;
    private final zzhn zzvG;
    private final zzgy zzvH;

    private abstract class a<T> {
        final /* synthetic */ zzl f;

        private a(zzl com_google_android_gms_ads_internal_client_zzl) {
            this.f = com_google_android_gms_ads_internal_client_zzl;
        }

        protected abstract T b();

        protected abstract T b(zzx com_google_android_gms_ads_internal_client_zzx) throws RemoteException;

        protected final T c() {
            T t = null;
            zzx zza = this.f.zzdF();
            if (zza == null) {
                zzb.zzaW("ClientApi class cannot be loaded.");
            } else {
                try {
                    t = b(zza);
                } catch (Throwable e) {
                    zzb.zzd("Cannot invoke local loader using ClientApi class", e);
                }
            }
            return t;
        }
    }

    public zzl(zze com_google_android_gms_ads_internal_client_zze, zzd com_google_android_gms_ads_internal_client_zzd, zzai com_google_android_gms_ads_internal_client_zzai, zzdx com_google_android_gms_internal_zzdx, zzf com_google_android_gms_ads_internal_reward_client_zzf, zzhn com_google_android_gms_internal_zzhn, zzgy com_google_android_gms_internal_zzgy) {
        this.zzvB = com_google_android_gms_ads_internal_client_zze;
        this.zzvC = com_google_android_gms_ads_internal_client_zzd;
        this.zzvD = com_google_android_gms_ads_internal_client_zzai;
        this.zzvE = com_google_android_gms_internal_zzdx;
        this.zzvF = com_google_android_gms_ads_internal_reward_client_zzf;
        this.zzvG = com_google_android_gms_internal_zzhn;
        this.zzvH = com_google_android_gms_internal_zzgy;
    }

    private <T> T zza(Context context, boolean z, a<T> aVar) {
        if (!(z || zzm.zzdQ().zzQ(context))) {
            zzb.zzaU("Google Play Services is not available");
            z = true;
        }
        T c;
        if (z) {
            c = aVar.c();
            return c == null ? aVar.b() : c;
        } else {
            c = aVar.b();
            return c == null ? aVar.c() : c;
        }
    }

    private static boolean zza(Activity activity, String str) {
        Intent intent = activity.getIntent();
        if (intent.hasExtra(str)) {
            return intent.getBooleanExtra(str, false);
        }
        zzb.e("useClientJar flag not found in activity intent extras.");
        return false;
    }

    private void zzc(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzm.zzdQ().zza(context, null, "gmob-apps", bundle, true);
    }

    private static zzx zzdE() {
        try {
            Object newInstance = zzl.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
            if (newInstance instanceof IBinder) {
                return zza.asInterface((IBinder) newInstance);
            }
            zzb.zzaW("ClientApi class is not an instance of IBinder");
            return null;
        } catch (Throwable e) {
            zzb.zzd("Failed to instantiate ClientApi class.", e);
            return null;
        }
    }

    private zzx zzdF() {
        zzx com_google_android_gms_ads_internal_client_zzx;
        synchronized (this.zzpp) {
            if (this.zzvA == null) {
                this.zzvA = zzdE();
            }
            com_google_android_gms_ads_internal_client_zzx = this.zzvA;
        }
        return com_google_android_gms_ads_internal_client_zzx;
    }

    public zzu zza(final Context context, final AdSizeParcel adSizeParcel, final String str) {
        return (zzu) zza(context, false, new a<zzu>(this) {
            final /* synthetic */ zzl d;

            public zzu a() {
                zzu zza = this.d.zzvB.zza(context, adSizeParcel, str, null, 3);
                if (zza != null) {
                    return zza;
                }
                this.d.zzc(context, Event.SEARCH);
                return new zzak();
            }

            public zzu a(zzx com_google_android_gms_ads_internal_client_zzx) throws RemoteException {
                return com_google_android_gms_ads_internal_client_zzx.createSearchAdManager(zze.zzD(context), adSizeParcel, str, com.google.android.gms.common.internal.zze.zzaqR);
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(zzx com_google_android_gms_ads_internal_client_zzx) throws RemoteException {
                return a(com_google_android_gms_ads_internal_client_zzx);
            }
        });
    }

    public zzu zza(Context context, AdSizeParcel adSizeParcel, String str, zzga com_google_android_gms_internal_zzga) {
        final Context context2 = context;
        final AdSizeParcel adSizeParcel2 = adSizeParcel;
        final String str2 = str;
        final zzga com_google_android_gms_internal_zzga2 = com_google_android_gms_internal_zzga;
        return (zzu) zza(context, false, new a<zzu>(this) {
            final /* synthetic */ zzl e;

            public zzu a() {
                zzu zza = this.e.zzvB.zza(context2, adSizeParcel2, str2, com_google_android_gms_internal_zzga2, 1);
                if (zza != null) {
                    return zza;
                }
                this.e.zzc(context2, "banner");
                return new zzak();
            }

            public zzu a(zzx com_google_android_gms_ads_internal_client_zzx) throws RemoteException {
                return com_google_android_gms_ads_internal_client_zzx.createBannerAdManager(zze.zzD(context2), adSizeParcel2, str2, com_google_android_gms_internal_zzga2, com.google.android.gms.common.internal.zze.zzaqR);
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(zzx com_google_android_gms_ads_internal_client_zzx) throws RemoteException {
                return a(com_google_android_gms_ads_internal_client_zzx);
            }
        });
    }

    public com.google.android.gms.ads.internal.reward.client.zzb zza(final Context context, final zzga com_google_android_gms_internal_zzga) {
        return (com.google.android.gms.ads.internal.reward.client.zzb) zza(context, false, new a<com.google.android.gms.ads.internal.reward.client.zzb>(this) {
            final /* synthetic */ zzl c;

            public com.google.android.gms.ads.internal.reward.client.zzb a() {
                com.google.android.gms.ads.internal.reward.client.zzb zzb = this.c.zzvF.zzb(context, com_google_android_gms_internal_zzga);
                if (zzb != null) {
                    return zzb;
                }
                this.c.zzc(context, "rewarded_video");
                return new zzan();
            }

            public com.google.android.gms.ads.internal.reward.client.zzb a(zzx com_google_android_gms_ads_internal_client_zzx) throws RemoteException {
                return com_google_android_gms_ads_internal_client_zzx.createRewardedVideoAd(zze.zzD(context), com_google_android_gms_internal_zzga, com.google.android.gms.common.internal.zze.zzaqR);
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(zzx com_google_android_gms_ads_internal_client_zzx) throws RemoteException {
                return a(com_google_android_gms_ads_internal_client_zzx);
            }
        });
    }

    public zzdl zza(final Context context, final FrameLayout frameLayout, final FrameLayout frameLayout2) {
        return (zzdl) zza(context, false, new a<zzdl>(this) {
            final /* synthetic */ zzl d;

            public zzdl a() {
                zzdl zzb = this.d.zzvE.zzb(context, frameLayout, frameLayout2);
                if (zzb != null) {
                    return zzb;
                }
                this.d.zzc(context, "native_ad_view_delegate");
                return new zzam();
            }

            public zzdl a(zzx com_google_android_gms_ads_internal_client_zzx) throws RemoteException {
                return com_google_android_gms_ads_internal_client_zzx.createNativeAdViewDelegate(zze.zzD(frameLayout), zze.zzD(frameLayout2));
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(zzx com_google_android_gms_ads_internal_client_zzx) throws RemoteException {
                return a(com_google_android_gms_ads_internal_client_zzx);
            }
        });
    }

    public zzs zzb(final Context context, final String str, final zzga com_google_android_gms_internal_zzga) {
        return (zzs) zza(context, false, new a<zzs>(this) {
            final /* synthetic */ zzl d;

            public zzs a() {
                zzs zza = this.d.zzvC.zza(context, str, com_google_android_gms_internal_zzga);
                if (zza != null) {
                    return zza;
                }
                this.d.zzc(context, "native_ad");
                return new zzaj();
            }

            public zzs a(zzx com_google_android_gms_ads_internal_client_zzx) throws RemoteException {
                return com_google_android_gms_ads_internal_client_zzx.createAdLoaderBuilder(zze.zzD(context), str, com_google_android_gms_internal_zzga, com.google.android.gms.common.internal.zze.zzaqR);
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(zzx com_google_android_gms_ads_internal_client_zzx) throws RemoteException {
                return a(com_google_android_gms_ads_internal_client_zzx);
            }
        });
    }

    public zzu zzb(Context context, AdSizeParcel adSizeParcel, String str, zzga com_google_android_gms_internal_zzga) {
        final Context context2 = context;
        final AdSizeParcel adSizeParcel2 = adSizeParcel;
        final String str2 = str;
        final zzga com_google_android_gms_internal_zzga2 = com_google_android_gms_internal_zzga;
        return (zzu) zza(context, false, new a<zzu>(this) {
            final /* synthetic */ zzl e;

            public zzu a() {
                zzu zza = this.e.zzvB.zza(context2, adSizeParcel2, str2, com_google_android_gms_internal_zzga2, 2);
                if (zza != null) {
                    return zza;
                }
                this.e.zzc(context2, "interstitial");
                return new zzak();
            }

            public zzu a(zzx com_google_android_gms_ads_internal_client_zzx) throws RemoteException {
                return com_google_android_gms_ads_internal_client_zzx.createInterstitialAdManager(zze.zzD(context2), adSizeParcel2, str2, com_google_android_gms_internal_zzga2, com.google.android.gms.common.internal.zze.zzaqR);
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(zzx com_google_android_gms_ads_internal_client_zzx) throws RemoteException {
                return a(com_google_android_gms_ads_internal_client_zzx);
            }
        });
    }

    public zzhi zzb(final Activity activity) {
        return (zzhi) zza((Context) activity, zza(activity, "com.google.android.gms.ads.internal.purchase.useClientJar"), new a<zzhi>(this) {
            final /* synthetic */ zzl b;

            public zzhi a() {
                zzhi zzg = this.b.zzvG.zzg(activity);
                if (zzg != null) {
                    return zzg;
                }
                this.b.zzc(activity, "iap");
                return null;
            }

            public zzhi a(zzx com_google_android_gms_ads_internal_client_zzx) throws RemoteException {
                return com_google_android_gms_ads_internal_client_zzx.createInAppPurchaseManager(zze.zzD(activity));
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(zzx com_google_android_gms_ads_internal_client_zzx) throws RemoteException {
                return a(com_google_android_gms_ads_internal_client_zzx);
            }
        });
    }

    public zzgz zzc(final Activity activity) {
        return (zzgz) zza((Context) activity, zza(activity, "com.google.android.gms.ads.internal.overlay.useClientJar"), new a<zzgz>(this) {
            final /* synthetic */ zzl b;

            public zzgz a() {
                zzgz zzf = this.b.zzvH.zzf(activity);
                if (zzf != null) {
                    return zzf;
                }
                this.b.zzc(activity, "ad_overlay");
                return null;
            }

            public zzgz a(zzx com_google_android_gms_ads_internal_client_zzx) throws RemoteException {
                return com_google_android_gms_ads_internal_client_zzx.createAdOverlay(zze.zzD(activity));
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(zzx com_google_android_gms_ads_internal_client_zzx) throws RemoteException {
                return a(com_google_android_gms_ads_internal_client_zzx);
            }
        });
    }

    public zzz zzl(final Context context) {
        return (zzz) zza(context, false, new a<zzz>(this) {
            final /* synthetic */ zzl b;

            public zzz a() {
                zzz zzm = this.b.zzvD.zzm(context);
                if (zzm != null) {
                    return zzm;
                }
                this.b.zzc(context, "mobile_ads_settings");
                return new zzal();
            }

            public zzz a(zzx com_google_android_gms_ads_internal_client_zzx) throws RemoteException {
                return com_google_android_gms_ads_internal_client_zzx.getMobileAdsSettingsManagerWithClientJarVersion(zze.zzD(context), com.google.android.gms.common.internal.zze.zzaqR);
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(zzx com_google_android_gms_ads_internal_client_zzx) throws RemoteException {
                return a(com_google_android_gms_ads_internal_client_zzx);
            }
        });
    }
}
