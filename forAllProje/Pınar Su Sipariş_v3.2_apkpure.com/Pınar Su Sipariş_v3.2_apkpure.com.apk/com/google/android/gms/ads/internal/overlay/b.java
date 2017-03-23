package com.google.android.gms.ads.internal.overlay;

import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzka;

@zzig
class b implements Runnable {
    private zzk a;
    private boolean b = false;

    b(zzk com_google_android_gms_ads_internal_overlay_zzk) {
        this.a = com_google_android_gms_ads_internal_overlay_zzk;
    }

    public void a() {
        this.b = true;
        zzka.zzQu.removeCallbacks(this);
    }

    public void b() {
        zzka.zzQu.postDelayed(this, 250);
    }

    public void run() {
        if (!this.b) {
            this.a.zzgI();
            b();
        }
    }
}
