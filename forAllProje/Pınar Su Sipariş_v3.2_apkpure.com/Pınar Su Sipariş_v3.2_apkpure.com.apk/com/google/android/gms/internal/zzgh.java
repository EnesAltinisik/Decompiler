package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzgb.zza;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@zzig
public final class zzgh extends zza {
    private final MediationAdapter zzFB;
    private zzgi zzFC;

    public zzgh(MediationAdapter mediationAdapter) {
        this.zzFB = mediationAdapter;
    }

    private Bundle zza(String str, int i, String str2) throws RemoteException {
        String str3 = "Server parameters: ";
        String valueOf = String.valueOf(str);
        zzb.zzaW(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    valueOf = (String) keys.next();
                    bundle2.putString(valueOf, jSONObject.getString(valueOf));
                }
                bundle = bundle2;
            }
            if (this.zzFB instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                bundle.putInt("tagForChildDirectedTreatment", i);
            }
            return bundle;
        } catch (Throwable th) {
            zzb.zzd("Could not get Server Parameters Bundle.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public void destroy() throws RemoteException {
        try {
            this.zzFB.onDestroy();
        } catch (Throwable th) {
            zzb.zzd("Could not destroy adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public Bundle getInterstitialAdapterInfo() {
        if (this.zzFB instanceof zzlm) {
            return ((zzlm) this.zzFB).getInterstitialAdapterInfo();
        }
        String str = "MediationAdapter is not a v2 MediationInterstitialAdapter: ";
        String valueOf = String.valueOf(this.zzFB.getClass().getCanonicalName());
        zzb.zzaW(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        return new Bundle();
    }

    public zzd getView() throws RemoteException {
        if (this.zzFB instanceof MediationBannerAdapter) {
            try {
                return zze.zzD(((MediationBannerAdapter) this.zzFB).getBannerView());
            } catch (Throwable th) {
                zzb.zzd("Could not get banner view from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.zzFB.getClass().getCanonicalName());
            zzb.zzaW(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public boolean isInitialized() throws RemoteException {
        if (this.zzFB instanceof MediationRewardedVideoAdAdapter) {
            zzb.zzaU("Check if adapter is initialized.");
            try {
                return ((MediationRewardedVideoAdAdapter) this.zzFB).isInitialized();
            } catch (Throwable th) {
                zzb.zzd("Could not check if adapter is initialized.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.zzFB.getClass().getCanonicalName());
            zzb.zzaW(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public void pause() throws RemoteException {
        try {
            this.zzFB.onPause();
        } catch (Throwable th) {
            zzb.zzd("Could not pause adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public void resume() throws RemoteException {
        try {
            this.zzFB.onResume();
        } catch (Throwable th) {
            zzb.zzd("Could not resume adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public void showInterstitial() throws RemoteException {
        if (this.zzFB instanceof MediationInterstitialAdapter) {
            zzb.zzaU("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.zzFB).showInterstitial();
            } catch (Throwable th) {
                zzb.zzd("Could not show interstitial from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.zzFB.getClass().getCanonicalName());
            zzb.zzaW(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public void showVideo() throws RemoteException {
        if (this.zzFB instanceof MediationRewardedVideoAdAdapter) {
            zzb.zzaU("Show rewarded video ad from adapter.");
            try {
                ((MediationRewardedVideoAdAdapter) this.zzFB).showVideo();
            } catch (Throwable th) {
                zzb.zzd("Could not show rewarded video ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.zzFB.getClass().getCanonicalName());
            zzb.zzaW(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public void zza(AdRequestParcel adRequestParcel, String str, String str2) throws RemoteException {
        if (this.zzFB instanceof MediationRewardedVideoAdAdapter) {
            zzb.zzaU("Requesting rewarded video ad from adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.zzFB;
                mediationRewardedVideoAdAdapter.loadAd(new zzgg(adRequestParcel.zzuN == -1 ? null : new Date(adRequestParcel.zzuN), adRequestParcel.zzuO, adRequestParcel.zzuP != null ? new HashSet(adRequestParcel.zzuP) : null, adRequestParcel.zzuV, adRequestParcel.zzuQ, adRequestParcel.zzuR, adRequestParcel.zzvc), zza(str, adRequestParcel.zzuR, str2), adRequestParcel.zzuX != null ? adRequestParcel.zzuX.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null);
            } catch (Throwable th) {
                zzb.zzd("Could not load rewarded video ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.zzFB.getClass().getCanonicalName());
            zzb.zzaW(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public void zza(zzd com_google_android_gms_dynamic_zzd, AdRequestParcel adRequestParcel, String str, com.google.android.gms.ads.internal.reward.mediation.client.zza com_google_android_gms_ads_internal_reward_mediation_client_zza, String str2) throws RemoteException {
        if (this.zzFB instanceof MediationRewardedVideoAdAdapter) {
            zzb.zzaU("Initialize rewarded video adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.zzFB;
                mediationRewardedVideoAdAdapter.initialize((Context) zze.zzx(com_google_android_gms_dynamic_zzd), new zzgg(adRequestParcel.zzuN == -1 ? null : new Date(adRequestParcel.zzuN), adRequestParcel.zzuO, adRequestParcel.zzuP != null ? new HashSet(adRequestParcel.zzuP) : null, adRequestParcel.zzuV, adRequestParcel.zzuQ, adRequestParcel.zzuR, adRequestParcel.zzvc), str, new com.google.android.gms.ads.internal.reward.mediation.client.zzb(com_google_android_gms_ads_internal_reward_mediation_client_zza), zza(str2, adRequestParcel.zzuR, null), adRequestParcel.zzuX != null ? adRequestParcel.zzuX.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null);
            } catch (Throwable th) {
                zzb.zzd("Could not initialize rewarded video adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.zzFB.getClass().getCanonicalName());
            zzb.zzaW(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public void zza(zzd com_google_android_gms_dynamic_zzd, AdRequestParcel adRequestParcel, String str, zzgc com_google_android_gms_internal_zzgc) throws RemoteException {
        zza(com_google_android_gms_dynamic_zzd, adRequestParcel, str, null, com_google_android_gms_internal_zzgc);
    }

    public void zza(zzd com_google_android_gms_dynamic_zzd, AdRequestParcel adRequestParcel, String str, String str2, zzgc com_google_android_gms_internal_zzgc) throws RemoteException {
        if (this.zzFB instanceof MediationInterstitialAdapter) {
            zzb.zzaU("Requesting interstitial ad from adapter.");
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.zzFB;
                mediationInterstitialAdapter.requestInterstitialAd((Context) zze.zzx(com_google_android_gms_dynamic_zzd), new zzgi(com_google_android_gms_internal_zzgc), zza(str, adRequestParcel.zzuR, str2), new zzgg(adRequestParcel.zzuN == -1 ? null : new Date(adRequestParcel.zzuN), adRequestParcel.zzuO, adRequestParcel.zzuP != null ? new HashSet(adRequestParcel.zzuP) : null, adRequestParcel.zzuV, adRequestParcel.zzuQ, adRequestParcel.zzuR, adRequestParcel.zzvc), adRequestParcel.zzuX != null ? adRequestParcel.zzuX.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
            } catch (Throwable th) {
                zzb.zzd("Could not request interstitial ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.zzFB.getClass().getCanonicalName());
            zzb.zzaW(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public void zza(zzd com_google_android_gms_dynamic_zzd, AdRequestParcel adRequestParcel, String str, String str2, zzgc com_google_android_gms_internal_zzgc, NativeAdOptionsParcel nativeAdOptionsParcel, List<String> list) throws RemoteException {
        if (this.zzFB instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) this.zzFB;
                zzgl com_google_android_gms_internal_zzgl = new zzgl(adRequestParcel.zzuN == -1 ? null : new Date(adRequestParcel.zzuN), adRequestParcel.zzuO, adRequestParcel.zzuP != null ? new HashSet(adRequestParcel.zzuP) : null, adRequestParcel.zzuV, adRequestParcel.zzuQ, adRequestParcel.zzuR, nativeAdOptionsParcel, list, adRequestParcel.zzvc);
                Bundle bundle = adRequestParcel.zzuX != null ? adRequestParcel.zzuX.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.zzFC = new zzgi(com_google_android_gms_internal_zzgc);
                mediationNativeAdapter.requestNativeAd((Context) zze.zzx(com_google_android_gms_dynamic_zzd), this.zzFC, zza(str, adRequestParcel.zzuR, str2), com_google_android_gms_internal_zzgl, bundle);
            } catch (Throwable th) {
                zzb.zzd("Could not request native ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationNativeAdapter: ";
            String valueOf = String.valueOf(this.zzFB.getClass().getCanonicalName());
            zzb.zzaW(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public void zza(zzd com_google_android_gms_dynamic_zzd, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, zzgc com_google_android_gms_internal_zzgc) throws RemoteException {
        zza(com_google_android_gms_dynamic_zzd, adSizeParcel, adRequestParcel, str, null, com_google_android_gms_internal_zzgc);
    }

    public void zza(zzd com_google_android_gms_dynamic_zzd, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, String str2, zzgc com_google_android_gms_internal_zzgc) throws RemoteException {
        if (this.zzFB instanceof MediationBannerAdapter) {
            zzb.zzaU("Requesting banner ad from adapter.");
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.zzFB;
                mediationBannerAdapter.requestBannerAd((Context) zze.zzx(com_google_android_gms_dynamic_zzd), new zzgi(com_google_android_gms_internal_zzgc), zza(str, adRequestParcel.zzuR, str2), com.google.android.gms.ads.zza.zza(adSizeParcel.width, adSizeParcel.height, adSizeParcel.zzvs), new zzgg(adRequestParcel.zzuN == -1 ? null : new Date(adRequestParcel.zzuN), adRequestParcel.zzuO, adRequestParcel.zzuP != null ? new HashSet(adRequestParcel.zzuP) : null, adRequestParcel.zzuV, adRequestParcel.zzuQ, adRequestParcel.zzuR, adRequestParcel.zzvc), adRequestParcel.zzuX != null ? adRequestParcel.zzuX.getBundle(mediationBannerAdapter.getClass().getName()) : null);
            } catch (Throwable th) {
                zzb.zzd("Could not request banner ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.zzFB.getClass().getCanonicalName());
            zzb.zzaW(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public void zzc(AdRequestParcel adRequestParcel, String str) throws RemoteException {
        zza(adRequestParcel, str, null);
    }

    public zzge zzfI() {
        NativeAdMapper zzfM = this.zzFC.zzfM();
        return zzfM instanceof NativeAppInstallAdMapper ? new zzgj((NativeAppInstallAdMapper) zzfM) : null;
    }

    public zzgf zzfJ() {
        NativeAdMapper zzfM = this.zzFC.zzfM();
        return zzfM instanceof NativeContentAdMapper ? new zzgk((NativeContentAdMapper) zzfM) : null;
    }

    public Bundle zzfK() {
        if (this.zzFB instanceof zzll) {
            return ((zzll) this.zzFB).zzfK();
        }
        String str = "MediationAdapter is not a v2 MediationBannerAdapter: ";
        String valueOf = String.valueOf(this.zzFB.getClass().getCanonicalName());
        zzb.zzaW(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        return new Bundle();
    }

    public Bundle zzfL() {
        return new Bundle();
    }

    public void zzj(zzd com_google_android_gms_dynamic_zzd) throws RemoteException {
        try {
            ((OnContextChangedListener) this.zzFB).onContextChanged((Context) zze.zzx(com_google_android_gms_dynamic_zzd));
        } catch (Throwable th) {
            zzb.zza("Could not inform adapter of changed context", th);
        }
    }
}
