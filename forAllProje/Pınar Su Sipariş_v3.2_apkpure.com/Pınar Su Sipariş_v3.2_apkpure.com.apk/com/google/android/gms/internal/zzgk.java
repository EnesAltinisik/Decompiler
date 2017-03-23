package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.internal.formats.zzc;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzgf.zza;
import java.util.ArrayList;
import java.util.List;

@zzig
public class zzgk extends zza {
    private final NativeContentAdMapper zzFG;

    public zzgk(NativeContentAdMapper nativeContentAdMapper) {
        this.zzFG = nativeContentAdMapper;
    }

    public String getAdvertiser() {
        return this.zzFG.getAdvertiser();
    }

    public String getBody() {
        return this.zzFG.getBody();
    }

    public String getCallToAction() {
        return this.zzFG.getCallToAction();
    }

    public Bundle getExtras() {
        return this.zzFG.getExtras();
    }

    public String getHeadline() {
        return this.zzFG.getHeadline();
    }

    public List getImages() {
        List<Image> images = this.zzFG.getImages();
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
        return this.zzFG.getOverrideClickHandling();
    }

    public boolean getOverrideImpressionRecording() {
        return this.zzFG.getOverrideImpressionRecording();
    }

    public void recordImpression() {
        this.zzFG.recordImpression();
    }

    public zzdj zzeR() {
        Image logo = this.zzFG.getLogo();
        return logo != null ? new zzc(logo.getDrawable(), logo.getUri(), logo.getScale()) : null;
    }

    public void zzk(zzd com_google_android_gms_dynamic_zzd) {
        this.zzFG.handleClick((View) zze.zzx(com_google_android_gms_dynamic_zzd));
    }

    public void zzl(zzd com_google_android_gms_dynamic_zzd) {
        this.zzFG.trackView((View) zze.zzx(com_google_android_gms_dynamic_zzd));
    }
}
