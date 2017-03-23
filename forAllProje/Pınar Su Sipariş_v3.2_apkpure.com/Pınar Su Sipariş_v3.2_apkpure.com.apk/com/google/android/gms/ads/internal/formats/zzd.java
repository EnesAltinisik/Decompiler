package com.google.android.gms.ads.internal.formats;

import android.os.Bundle;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzdj;
import com.google.android.gms.internal.zzdn.zza;
import com.google.android.gms.internal.zzig;
import java.util.List;

@zzig
public class zzd extends zza implements zzh.zza {
    private Bundle mExtras;
    private String zzAC;
    private List<zzc> zzAD;
    private String zzAE;
    private zzdj zzAF;
    private String zzAG;
    private double zzAH;
    private String zzAI;
    private String zzAJ;
    private zza zzAK;
    private zzh zzAL;
    private Object zzpp = new Object();

    public zzd(String str, List list, String str2, zzdj com_google_android_gms_internal_zzdj, String str3, double d, String str4, String str5, zza com_google_android_gms_ads_internal_formats_zza, Bundle bundle) {
        this.zzAC = str;
        this.zzAD = list;
        this.zzAE = str2;
        this.zzAF = com_google_android_gms_internal_zzdj;
        this.zzAG = str3;
        this.zzAH = d;
        this.zzAI = str4;
        this.zzAJ = str5;
        this.zzAK = com_google_android_gms_ads_internal_formats_zza;
        this.mExtras = bundle;
    }

    public void destroy() {
        this.zzAC = null;
        this.zzAD = null;
        this.zzAE = null;
        this.zzAF = null;
        this.zzAG = null;
        this.zzAH = 0.0d;
        this.zzAI = null;
        this.zzAJ = null;
        this.zzAK = null;
        this.mExtras = null;
        this.zzpp = null;
        this.zzAL = null;
    }

    public String getBody() {
        return this.zzAE;
    }

    public String getCallToAction() {
        return this.zzAG;
    }

    public String getCustomTemplateId() {
        return "";
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public String getHeadline() {
        return this.zzAC;
    }

    public List getImages() {
        return this.zzAD;
    }

    public String getPrice() {
        return this.zzAJ;
    }

    public double getStarRating() {
        return this.zzAH;
    }

    public String getStore() {
        return this.zzAI;
    }

    public void zzb(zzh com_google_android_gms_ads_internal_formats_zzh) {
        synchronized (this.zzpp) {
            this.zzAL = com_google_android_gms_ads_internal_formats_zzh;
        }
    }

    public zzdj zzeN() {
        return this.zzAF;
    }

    public com.google.android.gms.dynamic.zzd zzeO() {
        return zze.zzD(this.zzAL);
    }

    public String zzeP() {
        return "2";
    }

    public zza zzeQ() {
        return this.zzAK;
    }
}
