package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.List;

public abstract class NativeContentAdMapper extends NativeAdMapper {
    private String zzAC;
    private List<Image> zzAD;
    private String zzAE;
    private String zzAG;
    private String zzAN;
    private Image zzTh;

    public final String getAdvertiser() {
        return this.zzAN;
    }

    public final String getBody() {
        return this.zzAE;
    }

    public final String getCallToAction() {
        return this.zzAG;
    }

    public final String getHeadline() {
        return this.zzAC;
    }

    public final List<Image> getImages() {
        return this.zzAD;
    }

    public final Image getLogo() {
        return this.zzTh;
    }

    public final void setAdvertiser(String str) {
        this.zzAN = str;
    }

    public final void setBody(String str) {
        this.zzAE = str;
    }

    public final void setCallToAction(String str) {
        this.zzAG = str;
    }

    public final void setHeadline(String str) {
        this.zzAC = str;
    }

    public final void setImages(List<Image> list) {
        this.zzAD = list;
    }

    public final void setLogo(Image image) {
        this.zzTh = image;
    }
}
