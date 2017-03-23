package com.google.android.gms.internal;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.ads.internal.overlay.zzk;
import com.google.android.gms.common.internal.zzaa;

@zzig
public class zzkz {
    private final Context mContext;
    private final zzla zzBb;
    private zzk zzIX;
    private final ViewGroup zzSa;

    public zzkz(Context context, ViewGroup viewGroup, zzla com_google_android_gms_internal_zzla) {
        this(context, viewGroup, com_google_android_gms_internal_zzla, null);
    }

    zzkz(Context context, ViewGroup viewGroup, zzla com_google_android_gms_internal_zzla, zzk com_google_android_gms_ads_internal_overlay_zzk) {
        this.mContext = context;
        this.zzSa = viewGroup;
        this.zzBb = com_google_android_gms_internal_zzla;
        this.zzIX = com_google_android_gms_ads_internal_overlay_zzk;
    }

    public void onDestroy() {
        zzaa.zzdc("onDestroy must be called from the UI thread.");
        if (this.zzIX != null) {
            this.zzIX.destroy();
            this.zzSa.removeView(this.zzIX);
            this.zzIX = null;
        }
    }

    public void onPause() {
        zzaa.zzdc("onPause must be called from the UI thread.");
        if (this.zzIX != null) {
            this.zzIX.pause();
        }
    }

    public void zza(int i, int i2, int i3, int i4, int i5, boolean z) {
        if (this.zzIX == null) {
            zzcy.zza(this.zzBb.zzjM().zzez(), this.zzBb.zzjL(), "vpr");
            zzda zzb = zzcy.zzb(this.zzBb.zzjM().zzez());
            this.zzIX = new zzk(this.mContext, this.zzBb, i5, z, this.zzBb.zzjM().zzez(), zzb);
            this.zzSa.addView(this.zzIX, 0, new LayoutParams(-1, -1));
            this.zzIX.zzd(i, i2, i3, i4);
            this.zzBb.zzjD().zzJ(false);
        }
    }

    public void zze(int i, int i2, int i3, int i4) {
        zzaa.zzdc("The underlay may only be modified from the UI thread.");
        if (this.zzIX != null) {
            this.zzIX.zzd(i, i2, i3, i4);
        }
    }

    public zzk zzjv() {
        zzaa.zzdc("getAdVideoUnderlay must be called from the UI thread.");
        return this.zzIX;
    }
}
