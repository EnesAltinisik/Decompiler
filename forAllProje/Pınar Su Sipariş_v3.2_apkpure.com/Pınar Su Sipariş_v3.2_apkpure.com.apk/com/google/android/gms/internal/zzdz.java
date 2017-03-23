package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;
import com.google.android.gms.internal.zzdu.zza;

@zzig
public class zzdz extends zza {
    private final OnContentAdLoadedListener zzBE;

    public zzdz(OnContentAdLoadedListener onContentAdLoadedListener) {
        this.zzBE = onContentAdLoadedListener;
    }

    public void zza(zzdp com_google_android_gms_internal_zzdp) {
        this.zzBE.onContentAdLoaded(zzb(com_google_android_gms_internal_zzdp));
    }

    zzdq zzb(zzdp com_google_android_gms_internal_zzdp) {
        return new zzdq(com_google_android_gms_internal_zzdp);
    }
}
