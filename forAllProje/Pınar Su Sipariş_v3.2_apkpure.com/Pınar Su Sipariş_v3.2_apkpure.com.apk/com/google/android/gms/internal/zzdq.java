package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzdj.zza;
import java.util.ArrayList;
import java.util.List;

@zzig
public class zzdq extends NativeContentAd {
    private final zzdp zzBA;
    private final zzdk zzBB;
    private final List<Image> zzBy = new ArrayList();

    public zzdq(zzdp com_google_android_gms_internal_zzdp) {
        zzdk com_google_android_gms_internal_zzdk;
        this.zzBA = com_google_android_gms_internal_zzdp;
        try {
            List<Object> images = this.zzBA.getImages();
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
            zzdj zzeR = this.zzBA.zzeR();
            if (zzeR != null) {
                com_google_android_gms_internal_zzdk = new zzdk(zzeR);
                this.zzBB = com_google_android_gms_internal_zzdk;
            }
        } catch (Throwable e2) {
            zzb.zzb("Failed to get icon.", e2);
        }
        com_google_android_gms_internal_zzdk = null;
        this.zzBB = com_google_android_gms_internal_zzdk;
    }

    public void destroy() {
        try {
            this.zzBA.destroy();
        } catch (Throwable e) {
            zzb.zzb("Failed to destroy", e);
        }
    }

    public CharSequence getAdvertiser() {
        try {
            return this.zzBA.getAdvertiser();
        } catch (Throwable e) {
            zzb.zzb("Failed to get attribution.", e);
            return null;
        }
    }

    public CharSequence getBody() {
        try {
            return this.zzBA.getBody();
        } catch (Throwable e) {
            zzb.zzb("Failed to get body.", e);
            return null;
        }
    }

    public CharSequence getCallToAction() {
        try {
            return this.zzBA.getCallToAction();
        } catch (Throwable e) {
            zzb.zzb("Failed to get call to action.", e);
            return null;
        }
    }

    public Bundle getExtras() {
        try {
            return this.zzBA.getExtras();
        } catch (Throwable e) {
            zzb.zzd("Failed to get extras", e);
            return null;
        }
    }

    public CharSequence getHeadline() {
        try {
            return this.zzBA.getHeadline();
        } catch (Throwable e) {
            zzb.zzb("Failed to get headline.", e);
            return null;
        }
    }

    public List<Image> getImages() {
        return this.zzBy;
    }

    public Image getLogo() {
        return this.zzBB;
    }

    protected /* synthetic */ Object zzbb() {
        return zzeO();
    }

    zzdj zzd(Object obj) {
        return obj instanceof IBinder ? zza.zzy((IBinder) obj) : null;
    }

    protected zzd zzeO() {
        try {
            return this.zzBA.zzeO();
        } catch (Throwable e) {
            zzb.zzb("Failed to retrieve native ad engine.", e);
            return null;
        }
    }
}
