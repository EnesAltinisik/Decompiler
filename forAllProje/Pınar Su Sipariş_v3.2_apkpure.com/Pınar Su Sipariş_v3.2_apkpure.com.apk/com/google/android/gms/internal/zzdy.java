package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;
import com.google.android.gms.internal.zzdt.zza;

@zzig
public class zzdy extends zza {
    private final OnAppInstallAdLoadedListener zzBD;

    public zzdy(OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
        this.zzBD = onAppInstallAdLoadedListener;
    }

    public void zza(zzdn com_google_android_gms_internal_zzdn) {
        this.zzBD.onAppInstallAdLoaded(zzb(com_google_android_gms_internal_zzdn));
    }

    zzdo zzb(zzdn com_google_android_gms_internal_zzdn) {
        return new zzdo(com_google_android_gms_internal_zzdn);
    }
}
