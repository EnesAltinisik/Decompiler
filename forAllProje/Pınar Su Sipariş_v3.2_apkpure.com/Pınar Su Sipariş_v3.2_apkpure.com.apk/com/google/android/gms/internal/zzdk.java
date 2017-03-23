package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

@zzig
public class zzdk extends Image {
    private final Drawable mDrawable;
    private final Uri mUri;
    private final double zzAB;
    private final zzdj zzBw;

    public zzdk(zzdj com_google_android_gms_internal_zzdj) {
        Drawable drawable;
        double d;
        Uri uri = null;
        this.zzBw = com_google_android_gms_internal_zzdj;
        try {
            zzd zzeM = this.zzBw.zzeM();
            if (zzeM != null) {
                drawable = (Drawable) zze.zzx(zzeM);
                this.mDrawable = drawable;
                uri = this.zzBw.getUri();
                this.mUri = uri;
                d = 1.0d;
                d = this.zzBw.getScale();
                this.zzAB = d;
            }
        } catch (Throwable e) {
            zzb.zzb("Failed to get drawable.", e);
        }
        Object obj = uri;
        this.mDrawable = drawable;
        try {
            uri = this.zzBw.getUri();
        } catch (Throwable e2) {
            zzb.zzb("Failed to get uri.", e2);
        }
        this.mUri = uri;
        d = 1.0d;
        try {
            d = this.zzBw.getScale();
        } catch (Throwable e3) {
            zzb.zzb("Failed to get scale.", e3);
        }
        this.zzAB = d;
    }

    public Drawable getDrawable() {
        return this.mDrawable;
    }

    public double getScale() {
        return this.zzAB;
    }

    public Uri getUri() {
        return this.mUri;
    }
}
