package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.client.zzab;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzu.zza;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzu;

@zzig
public class zzfe extends zza {
    private zzey zzDj;
    private zzl zzDo;
    private t zzDv;
    private zzhl zzDw;
    private String zzDx;
    private String zzqO;

    public zzfe(Context context, String str, zzga com_google_android_gms_internal_zzga, VersionInfoParcel versionInfoParcel, zzd com_google_android_gms_ads_internal_zzd) {
        this(str, new zzey(context, com_google_android_gms_internal_zzga, versionInfoParcel, com_google_android_gms_ads_internal_zzd));
    }

    zzfe(String str, zzey com_google_android_gms_internal_zzey) {
        this.zzqO = str;
        this.zzDj = com_google_android_gms_internal_zzey;
        this.zzDv = new t();
        zzu.zzcv().zza(com_google_android_gms_internal_zzey);
    }

    private void zzfq() {
        if (this.zzDo != null && this.zzDw != null) {
            this.zzDo.zza(this.zzDw, this.zzDx);
        }
    }

    static boolean zzn(AdRequestParcel adRequestParcel) {
        Bundle zzi = zzfb.zzi(adRequestParcel);
        return zzi != null && zzi.containsKey("gw");
    }

    static boolean zzo(AdRequestParcel adRequestParcel) {
        Bundle zzi = zzfb.zzi(adRequestParcel);
        return zzi != null && zzi.containsKey("_ad");
    }

    void abort() {
        if (this.zzDo == null) {
            this.zzDo = this.zzDj.zzab(this.zzqO);
            this.zzDv.a(this.zzDo);
            zzfq();
        }
    }

    public void destroy() throws RemoteException {
        if (this.zzDo != null) {
            this.zzDo.destroy();
        }
    }

    public String getMediationAdapterClassName() throws RemoteException {
        return this.zzDo != null ? this.zzDo.getMediationAdapterClassName() : null;
    }

    public boolean isLoading() throws RemoteException {
        return this.zzDo != null && this.zzDo.isLoading();
    }

    public boolean isReady() throws RemoteException {
        return this.zzDo != null && this.zzDo.isReady();
    }

    public void pause() throws RemoteException {
        if (this.zzDo != null) {
            this.zzDo.pause();
        }
    }

    public void resume() throws RemoteException {
        if (this.zzDo != null) {
            this.zzDo.resume();
        }
    }

    public void setManualImpressionsEnabled(boolean z) throws RemoteException {
        abort();
        if (this.zzDo != null) {
            this.zzDo.setManualImpressionsEnabled(z);
        }
    }

    public void setUserId(String str) {
    }

    public void showInterstitial() throws RemoteException {
        if (this.zzDo != null) {
            this.zzDo.showInterstitial();
        } else {
            zzb.zzaW("Interstitial ad must be loaded before showInterstitial().");
        }
    }

    public void stopLoading() throws RemoteException {
        if (this.zzDo != null) {
            this.zzDo.stopLoading();
        }
    }

    public void zza(AdSizeParcel adSizeParcel) throws RemoteException {
        if (this.zzDo != null) {
            this.zzDo.zza(adSizeParcel);
        }
    }

    public void zza(VideoOptionsParcel videoOptionsParcel) {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    public void zza(zzp com_google_android_gms_ads_internal_client_zzp) throws RemoteException {
        this.zzDv.e = com_google_android_gms_ads_internal_client_zzp;
        if (this.zzDo != null) {
            this.zzDv.a(this.zzDo);
        }
    }

    public void zza(zzq com_google_android_gms_ads_internal_client_zzq) throws RemoteException {
        this.zzDv.a = com_google_android_gms_ads_internal_client_zzq;
        if (this.zzDo != null) {
            this.zzDv.a(this.zzDo);
        }
    }

    public void zza(zzw com_google_android_gms_ads_internal_client_zzw) throws RemoteException {
        this.zzDv.b = com_google_android_gms_ads_internal_client_zzw;
        if (this.zzDo != null) {
            this.zzDv.a(this.zzDo);
        }
    }

    public void zza(zzy com_google_android_gms_ads_internal_client_zzy) throws RemoteException {
        abort();
        if (this.zzDo != null) {
            this.zzDo.zza(com_google_android_gms_ads_internal_client_zzy);
        }
    }

    public void zza(com.google.android.gms.ads.internal.reward.client.zzd com_google_android_gms_ads_internal_reward_client_zzd) {
        this.zzDv.f = com_google_android_gms_ads_internal_reward_client_zzd;
        if (this.zzDo != null) {
            this.zzDv.a(this.zzDo);
        }
    }

    public void zza(zzdg com_google_android_gms_internal_zzdg) throws RemoteException {
        this.zzDv.d = com_google_android_gms_internal_zzdg;
        if (this.zzDo != null) {
            this.zzDv.a(this.zzDo);
        }
    }

    public void zza(zzhh com_google_android_gms_internal_zzhh) throws RemoteException {
        this.zzDv.c = com_google_android_gms_internal_zzhh;
        if (this.zzDo != null) {
            this.zzDv.a(this.zzDo);
        }
    }

    public void zza(zzhl com_google_android_gms_internal_zzhl, String str) throws RemoteException {
        this.zzDw = com_google_android_gms_internal_zzhl;
        this.zzDx = str;
        zzfq();
    }

    public boolean zzb(AdRequestParcel adRequestParcel) throws RemoteException {
        if (!zzn(adRequestParcel)) {
            abort();
        }
        if (zzfb.zzk(adRequestParcel)) {
            abort();
        }
        if (adRequestParcel.zzuU != null) {
            abort();
        }
        if (this.zzDo != null) {
            return this.zzDo.zzb(adRequestParcel);
        }
        zzfb zzcv = zzu.zzcv();
        if (zzo(adRequestParcel)) {
            zzcv.zzb(adRequestParcel, this.zzqO);
        }
        a zza = zzcv.zza(adRequestParcel, this.zzqO);
        if (zza != null) {
            if (!zza.e) {
                zza.a();
            }
            this.zzDo = zza.a;
            zza.c.a(this.zzDv);
            this.zzDv.a(this.zzDo);
            zzfq();
            return zza.f;
        }
        abort();
        return this.zzDo.zzb(adRequestParcel);
    }

    public com.google.android.gms.dynamic.zzd zzbh() throws RemoteException {
        return this.zzDo != null ? this.zzDo.zzbh() : null;
    }

    public AdSizeParcel zzbi() throws RemoteException {
        return this.zzDo != null ? this.zzDo.zzbi() : null;
    }

    public void zzbk() throws RemoteException {
        if (this.zzDo != null) {
            this.zzDo.zzbk();
        } else {
            zzb.zzaW("Interstitial ad must be loaded before pingManualTrackingUrl().");
        }
    }

    public zzab zzbl() {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }
}
