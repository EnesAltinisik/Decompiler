package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.internal.zzdv.zza;

@zzig
public class zzea extends zza {
    private final OnCustomClickListener zzBF;

    public zzea(OnCustomClickListener onCustomClickListener) {
        this.zzBF = onCustomClickListener;
    }

    public void zza(zzdr com_google_android_gms_internal_zzdr, String str) {
        this.zzBF.onCustomClick(new zzds(com_google_android_gms_internal_zzdr), str);
    }
}
