package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.List;

public abstract class NativeAppInstallAdMapper extends NativeAdMapper {
    private String zzAC;
    private List<Image> zzAD;
    private String zzAE;
    private String zzAG;
    private double zzAH;
    private String zzAI;
    private String zzAJ;
    private Image zzTg;

    public final String getBody() {
        return this.zzAE;
    }

    public final String getCallToAction() {
        return this.zzAG;
    }

    public final String getHeadline() {
        return this.zzAC;
    }

    public final Image getIcon() {
        return this.zzTg;
    }

    public final List<Image> getImages() {
        return this.zzAD;
    }

    public final String getPrice() {
        return this.zzAJ;
    }

    public final double getStarRating() {
        return this.zzAH;
    }

    public final String getStore() {
        return this.zzAI;
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

    public final void setIcon(Image image) {
        this.zzTg = image;
    }

    public final void setImages(List<Image> list) {
        this.zzAD = list;
    }

    public final void setPrice(String str) {
        this.zzAJ = str;
    }

    public final void setStarRating(double d) {
        this.zzAH = d;
    }

    public final void setStore(String str) {
        this.zzAI = str;
    }
}
