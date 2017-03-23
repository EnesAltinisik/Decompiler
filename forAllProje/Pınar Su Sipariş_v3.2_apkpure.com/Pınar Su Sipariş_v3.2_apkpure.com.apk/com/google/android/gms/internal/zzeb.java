package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.google.android.gms.internal.zzdw.zza;

@zzig
public class zzeb extends zza {
    private final OnCustomTemplateAdLoadedListener zzBG;

    public zzeb(OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener) {
        this.zzBG = onCustomTemplateAdLoadedListener;
    }

    public void zza(zzdr com_google_android_gms_internal_zzdr) {
        this.zzBG.onCustomTemplateAdLoaded(new zzds(com_google_android_gms_internal_zzdr));
    }
}
