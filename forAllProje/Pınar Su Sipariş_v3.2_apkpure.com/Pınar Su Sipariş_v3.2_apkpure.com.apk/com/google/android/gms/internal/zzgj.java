package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.internal.formats.zzc;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzge.zza;
import java.util.ArrayList;
import java.util.List;

@zzig
public class zzgj extends zza {
    private final NativeAppInstallAdMapper zzFF;

    public zzgj(NativeAppInstallAdMapper nativeAppInstallAdMapper) {
        this.zzFF = nativeAppInstallAdMapper;
    }

    public String getBody() {
        return this.zzFF.getBody();
    }

    public String getCallToAction() {
        return this.zzFF.getCallToAction();
    }

    public Bundle getExtras() {
        return this.zzFF.getExtras();
    }

    public String getHeadline() {
        return this.zzFF.getHeadline();
    }

    public List getImages() {
        List<Image> images = this.zzFF.getImages();
        if (images == null) {
            return null;
        }
        List arrayList = new ArrayList();
        for (Image image : images) {
            arrayList.add(new zzc(image.getDrawable(), image.getUri(), image.getScale()));
        }
        return arrayList;
    }

    public boolean getOverrideClickHandling() {
        return this.zzFF.getOverrideClickHandling();
    }

    public boolean getOverrideImpressionRecording() {
        return this.zzFF.getOverrideImpressionRecording();
    }

    public String getPrice() {
        return this.zzFF.getPrice();
    }

    public double getStarRating() {
        return this.zzFF.getStarRating();
    }

    public String getStore() {
        return this.zzFF.getStore();
    }

    public void recordImpression() {
        this.zzFF.recordImpression();
    }

    public zzdj zzeN() {
        Image icon = this.zzFF.getIcon();
        return icon != null ? new zzc(icon.getDrawable(), icon.getUri(), icon.getScale()) : null;
    }

    public void zzk(zzd com_google_android_gms_dynamic_zzd) {
        this.zzFF.handleClick((View) zze.zzx(com_google_android_gms_dynamic_zzd));
    }

    public void zzl(zzd com_google_android_gms_dynamic_zzd) {
        this.zzFF.trackView((View) zze.zzx(com_google_android_gms_dynamic_zzd));
    }
}
