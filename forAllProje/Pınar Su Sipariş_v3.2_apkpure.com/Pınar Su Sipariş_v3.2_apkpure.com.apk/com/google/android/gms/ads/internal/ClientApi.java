package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.client.zzx.zza;
import com.google.android.gms.ads.internal.client.zzz;
import com.google.android.gms.ads.internal.formats.zzk;
import com.google.android.gms.ads.internal.reward.client.zzb;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzdl;
import com.google.android.gms.internal.zzfe;
import com.google.android.gms.internal.zzga;
import com.google.android.gms.internal.zzgz;
import com.google.android.gms.internal.zzhi;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzix;

@DynamiteApi
@zzig
public class ClientApi extends zza {
    public zzs createAdLoaderBuilder(zzd com_google_android_gms_dynamic_zzd, String str, zzga com_google_android_gms_internal_zzga, int i) {
        Context context = (Context) zze.zzx(com_google_android_gms_dynamic_zzd);
        return new zzk(context, str, com_google_android_gms_internal_zzga, new VersionInfoParcel(com.google.android.gms.common.internal.zze.zzaqR, i, context.getClassLoader() == ClientApi.class.getClassLoader()), zzd.zzbF());
    }

    public zzgz createAdOverlay(zzd com_google_android_gms_dynamic_zzd) {
        return new com.google.android.gms.ads.internal.overlay.zzd((Activity) zze.zzx(com_google_android_gms_dynamic_zzd));
    }

    public zzu createBannerAdManager(zzd com_google_android_gms_dynamic_zzd, AdSizeParcel adSizeParcel, String str, zzga com_google_android_gms_internal_zzga, int i) throws RemoteException {
        Context context = (Context) zze.zzx(com_google_android_gms_dynamic_zzd);
        return new zzf(context, adSizeParcel, str, com_google_android_gms_internal_zzga, new VersionInfoParcel(com.google.android.gms.common.internal.zze.zzaqR, i, context.getClassLoader() == ClientApi.class.getClassLoader()), zzd.zzbF());
    }

    public zzhi createInAppPurchaseManager(zzd com_google_android_gms_dynamic_zzd) {
        return new com.google.android.gms.ads.internal.purchase.zze((Activity) zze.zzx(com_google_android_gms_dynamic_zzd));
    }

    public zzu createInterstitialAdManager(zzd com_google_android_gms_dynamic_zzd, AdSizeParcel adSizeParcel, String str, zzga com_google_android_gms_internal_zzga, int i) throws RemoteException {
        Context context = (Context) zze.zzx(com_google_android_gms_dynamic_zzd);
        zzcu.initialize(context);
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(com.google.android.gms.common.internal.zze.zzaqR, i, context.getClassLoader() == ClientApi.class.getClassLoader());
        boolean equals = "reward_mb".equals(adSizeParcel.zzvs);
        Object obj = ((equals || !((Boolean) zzcu.zzyf.get()).booleanValue()) && !(equals && ((Boolean) zzcu.zzyg.get()).booleanValue())) ? null : 1;
        if (obj != null) {
            return new zzfe(context, str, com_google_android_gms_internal_zzga, versionInfoParcel, zzd.zzbF());
        }
        return new zzl(context, adSizeParcel, str, com_google_android_gms_internal_zzga, versionInfoParcel, zzd.zzbF());
    }

    public zzdl createNativeAdViewDelegate(zzd com_google_android_gms_dynamic_zzd, zzd com_google_android_gms_dynamic_zzd2) {
        return new zzk((FrameLayout) zze.zzx(com_google_android_gms_dynamic_zzd), (FrameLayout) zze.zzx(com_google_android_gms_dynamic_zzd2));
    }

    public zzb createRewardedVideoAd(zzd com_google_android_gms_dynamic_zzd, zzga com_google_android_gms_internal_zzga, int i) {
        Context context = (Context) zze.zzx(com_google_android_gms_dynamic_zzd);
        return new zzix(context, zzd.zzbF(), com_google_android_gms_internal_zzga, new VersionInfoParcel(com.google.android.gms.common.internal.zze.zzaqR, i, context.getClassLoader() == ClientApi.class.getClassLoader()));
    }

    public zzu createSearchAdManager(zzd com_google_android_gms_dynamic_zzd, AdSizeParcel adSizeParcel, String str, int i) throws RemoteException {
        Context context = (Context) zze.zzx(com_google_android_gms_dynamic_zzd);
        return new zzt(context, adSizeParcel, str, new VersionInfoParcel(com.google.android.gms.common.internal.zze.zzaqR, i, context.getClassLoader() == ClientApi.class.getClassLoader()));
    }

    public zzz getMobileAdsSettingsManager(zzd com_google_android_gms_dynamic_zzd) {
        return null;
    }

    public zzz getMobileAdsSettingsManagerWithClientJarVersion(zzd com_google_android_gms_dynamic_zzd, int i) {
        Context context = (Context) zze.zzx(com_google_android_gms_dynamic_zzd);
        return zzo.zza(context, new VersionInfoParcel(com.google.android.gms.common.internal.zze.zzaqR, i, context.getClassLoader() == ClientApi.class.getClassLoader()));
    }
}
