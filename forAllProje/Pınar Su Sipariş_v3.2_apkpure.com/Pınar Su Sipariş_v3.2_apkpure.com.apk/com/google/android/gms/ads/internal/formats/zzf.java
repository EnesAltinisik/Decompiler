package com.google.android.gms.ads.internal.formats;

import android.support.v4.h.j;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzdj;
import com.google.android.gms.internal.zzdr.zza;
import com.google.android.gms.internal.zzig;
import java.util.Arrays;
import java.util.List;

@zzig
public class zzf extends zza implements zzh.zza {
    private final zza zzAK;
    private zzh zzAL;
    private final String zzAO;
    private final j<String, zzc> zzAP;
    private final j<String, String> zzAQ;
    private final Object zzpp = new Object();

    public zzf(String str, j<String, zzc> jVar, j<String, String> jVar2, zza com_google_android_gms_ads_internal_formats_zza) {
        this.zzAO = str;
        this.zzAP = jVar;
        this.zzAQ = jVar2;
        this.zzAK = com_google_android_gms_ads_internal_formats_zza;
    }

    public List<String> getAvailableAssetNames() {
        int i = 0;
        String[] strArr = new String[(this.zzAP.size() + this.zzAQ.size())];
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzAP.size(); i3++) {
            strArr[i2] = (String) this.zzAP.b(i3);
            i2++;
        }
        while (i < this.zzAQ.size()) {
            strArr[i2] = (String) this.zzAQ.b(i);
            i++;
            i2++;
        }
        return Arrays.asList(strArr);
    }

    public String getCustomTemplateId() {
        return this.zzAO;
    }

    public void performClick(String str) {
        synchronized (this.zzpp) {
            if (this.zzAL == null) {
                zzb.e("Attempt to call performClick before ad initialized.");
                return;
            }
            this.zzAL.zza(str, null, null, null);
        }
    }

    public void recordImpression() {
        synchronized (this.zzpp) {
            if (this.zzAL == null) {
                zzb.e("Attempt to perform recordImpression before ad initialized.");
                return;
            }
            this.zzAL.recordImpression();
        }
    }

    public String zzT(String str) {
        return (String) this.zzAQ.get(str);
    }

    public zzdj zzU(String str) {
        return (zzdj) this.zzAP.get(str);
    }

    public void zzb(zzh com_google_android_gms_ads_internal_formats_zzh) {
        synchronized (this.zzpp) {
            this.zzAL = com_google_android_gms_ads_internal_formats_zzh;
        }
    }

    public String zzeP() {
        return "3";
    }

    public zza zzeQ() {
        return this.zzAK;
    }
}
