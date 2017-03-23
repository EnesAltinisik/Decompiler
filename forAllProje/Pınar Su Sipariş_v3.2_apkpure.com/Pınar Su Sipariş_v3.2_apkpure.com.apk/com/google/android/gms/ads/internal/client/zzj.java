package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.internal.client.zzw.zza;
import com.google.android.gms.internal.zzig;

@zzig
public final class zzj extends zza {
    private final AppEventListener zzvy;

    public zzj(AppEventListener appEventListener) {
        this.zzvy = appEventListener;
    }

    public void onAppEvent(String str, String str2) {
        this.zzvy.onAppEvent(str, str2);
    }
}
