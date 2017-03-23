package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzdj.zza;
import java.util.ArrayList;
import java.util.List;

@zzig
public class zzdo extends NativeAppInstallAd {
    private final zzdn zzBx;
    private final List<Image> zzBy = new ArrayList();
    private final zzdk zzBz;

    public zzdo(zzdn com_google_android_gms_internal_zzdn) {
        zzdk com_google_android_gms_internal_zzdk;
        this.zzBx = com_google_android_gms_internal_zzdn;
        try {
            List<Object> images = this.zzBx.getImages();
            if (images != null) {
                for (Object zzd : images) {
                    zzdj zzd2 = zzd(zzd);
                    if (zzd2 != null) {
                        this.zzBy.add(new zzdk(zzd2));
                    }
                }
            }
        } catch (Throwable e) {
            zzb.zzb("Failed to get image.", e);
        }
        try {
            zzdj zzeN = this.zzBx.zzeN();
            if (zzeN != null) {
                com_google_android_gms_internal_zzdk = new zzdk(zzeN);
                this.zzBz = com_google_android_gms_internal_zzdk;
            }
        } catch (Throwable e2) {
            zzb.zzb("Failed to get icon.", e2);
        }
        com_google_android_gms_internal_zzdk = null;
        this.zzBz = com_google_android_gms_internal_zzdk;
    }

    public void destroy() {
        try {
            this.zzBx.destroy();
        } catch (Throwable e) {
            zzb.zzb("Failed to destroy", e);
        }
    }

    public CharSequence getBody() {
        try {
            return this.zzBx.getBody();
        } catch (Throwable e) {
            zzb.zzb("Failed to get body.", e);
            return null;
        }
    }

    public CharSequence getCallToAction() {
        try {
            return this.zzBx.getCallToAction();
        } catch (Throwable e) {
            zzb.zzb("Failed to get call to action.", e);
            return null;
        }
    }

    public Bundle getExtras() {
        try {
            return this.zzBx.getExtras();
        } catch (Throwable e) {
            zzb.zzb("Failed to get extras", e);
            return null;
        }
    }

    public CharSequence getHeadline() {
        try {
            return this.zzBx.getHeadline();
        } catch (Throwable e) {
            zzb.zzb("Failed to get headline.", e);
            return null;
        }
    }

    public Image getIcon() {
        return this.zzBz;
    }

    public List<Image> getImages() {
        return this.zzBy;
    }

    public CharSequence getPrice() {
        try {
            return this.zzBx.getPrice();
        } catch (Throwable e) {
            zzb.zzb("Failed to get price.", e);
            return null;
        }
    }

    public Double getStarRating() {
        Double d = null;
        try {
            double starRating = this.zzBx.getStarRating();
            if (starRating != -1.0d) {
                d = Double.valueOf(starRating);
            }
        } catch (Throwable e) {
            zzb.zzb("Failed to get star rating.", e);
        }
        return d;
    }

    public CharSequence getStore() {
        try {
            return this.zzBx.getStore();
        } catch (Throwable e) {
            zzb.zzb("Failed to get store", e);
            return null;
        }
    }

    protected /* synthetic */ Object zzbb() {
        return zzeO();
    }

    zzdj zzd(Object obj) {
        return obj instanceof IBinder ? zza.zzy((IBinder) obj) : null;
    }

    protected zzd zzeO() {
        try {
            return this.zzBx.zzeO();
        } catch (Throwable e) {
            zzb.zzb("Failed to retrieve native ad engine.", e);
            return null;
        }
    }
}
