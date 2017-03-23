package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.internal.zzdg.zza;

@zzig
public final class zzdh extends zza {
    private final OnCustomRenderedAdLoadedListener zzwj;

    public zzdh(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzwj = onCustomRenderedAdLoadedListener;
    }

    public void zza(zzdf com_google_android_gms_internal_zzdf) {
        this.zzwj.onCustomRenderedAdLoaded(new zzde(com_google_android_gms_internal_zzdf));
    }
}
