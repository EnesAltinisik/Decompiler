package com.google.android.gms.ads.internal.formats;

import android.os.Bundle;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzdj;
import com.google.android.gms.internal.zzdp.zza;
import com.google.android.gms.internal.zzig;
import java.util.List;

@zzig
public class zze extends zza implements zzh.zza {
    private Bundle mExtras;
    private String zzAC;
    private List<zzc> zzAD;
    private String zzAE;
    private String zzAG;
    private zza zzAK;
    private zzh zzAL;
    private zzdj zzAM;
    private String zzAN;
    private Object zzpp = new Object();

    public zze(String str, List list, String str2, zzdj com_google_android_gms_internal_zzdj, String str3, String str4, zza com_google_android_gms_ads_internal_formats_zza, Bundle bundle) {
        this.zzAC = str;
        this.zzAD = list;
        this.zzAE = str2;
        this.zzAM = com_google_android_gms_internal_zzdj;
        this.zzAG = str3;
        this.zzAN = str4;
        this.zzAK = com_google_android_gms_ads_internal_formats_zza;
        this.mExtras = bundle;
    }

    public void destroy() {
        this.zzAC = null;
        this.zzAD = null;
        this.zzAE = null;
        this.zzAM = null;
        this.zzAG = null;
        this.zzAN = null;
        this.zzAK = null;
        this.mExtras = null;
        this.zzpp = null;
        this.zzAL = null;
    }

    public String getAdvertiser() {
        return this.zzAN;
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

    public void zzb(zzh com_google_android_gms_ads_internal_formats_zzh) {
        synchronized (this.zzpp) {
            this.zzAL = com_google_android_gms_ads_internal_formats_zzh;
        }
    }

    public zzd zzeO() {
        return com.google.android.gms.dynamic.zze.zzD(this.zzAL);
    }

    public String zzeP() {
        return "1";
    }

    public zza zzeQ() {
        return this.zzAK;
    }

    public zzdj zzeR() {
        return this.zzAM;
    }
}
