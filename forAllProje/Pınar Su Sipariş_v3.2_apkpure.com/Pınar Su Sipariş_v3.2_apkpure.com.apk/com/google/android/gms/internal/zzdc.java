package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzu;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@zzig
public class zzdc {
    private final List<zzda> zzAc = new LinkedList();
    private final Map<String, String> zzAd = new LinkedHashMap();
    private String zzAe;
    private zzda zzAf;
    private zzdc zzAg;
    private final Object zzpp = new Object();
    boolean zzzL;

    public zzdc(boolean z, String str, String str2) {
        this.zzzL = z;
        this.zzAd.put("action", str);
        this.zzAd.put("ad_format", str2);
    }

    public void zzS(String str) {
        if (this.zzzL) {
            synchronized (this.zzpp) {
                this.zzAe = str;
            }
        }
    }

    public boolean zza(zzda com_google_android_gms_internal_zzda, long j, String... strArr) {
        synchronized (this.zzpp) {
            for (String com_google_android_gms_internal_zzda2 : strArr) {
                this.zzAc.add(new zzda(j, com_google_android_gms_internal_zzda2, com_google_android_gms_internal_zzda));
            }
        }
        return true;
    }

    public boolean zza(zzda com_google_android_gms_internal_zzda, String... strArr) {
        return (!this.zzzL || com_google_android_gms_internal_zzda == null) ? false : zza(com_google_android_gms_internal_zzda, zzu.zzco().elapsedRealtime(), strArr);
    }

    public zzda zzc(long j) {
        return !this.zzzL ? null : new zzda(j, null, null);
    }

    public void zzc(zzdc com_google_android_gms_internal_zzdc) {
        synchronized (this.zzpp) {
            this.zzAg = com_google_android_gms_internal_zzdc;
        }
    }

    public zzda zzeA() {
        return zzc(zzu.zzco().elapsedRealtime());
    }

    public void zzeB() {
        synchronized (this.zzpp) {
            this.zzAf = zzeA();
        }
    }

    public String zzeC() {
        String stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        synchronized (this.zzpp) {
            for (zzda com_google_android_gms_internal_zzda : this.zzAc) {
                long time = com_google_android_gms_internal_zzda.getTime();
                String zzex = com_google_android_gms_internal_zzda.zzex();
                zzda com_google_android_gms_internal_zzda2 = com_google_android_gms_internal_zzda2.zzey();
                if (com_google_android_gms_internal_zzda2 != null && time > 0) {
                    stringBuilder2.append(zzex).append('.').append(time - com_google_android_gms_internal_zzda2.getTime()).append(',');
                }
            }
            this.zzAc.clear();
            if (!TextUtils.isEmpty(this.zzAe)) {
                stringBuilder2.append(this.zzAe);
            } else if (stringBuilder2.length() > 0) {
                stringBuilder2.setLength(stringBuilder2.length() - 1);
            }
            stringBuilder = stringBuilder2.toString();
        }
        return stringBuilder;
    }

    public zzda zzeD() {
        zzda com_google_android_gms_internal_zzda;
        synchronized (this.zzpp) {
            com_google_android_gms_internal_zzda = this.zzAf;
        }
        return com_google_android_gms_internal_zzda;
    }

    public void zzf(String str, String str2) {
        if (this.zzzL && !TextUtils.isEmpty(str2)) {
            zzcw zziG = zzu.zzcn().zziG();
            if (zziG != null) {
                synchronized (this.zzpp) {
                    zziG.zzQ(str).zza(this.zzAd, str, str2);
                }
            }
        }
    }

    Map<String, String> zzm() {
        Map<String, String> map;
        synchronized (this.zzpp) {
            zzcw zziG = zzu.zzcn().zziG();
            if (zziG == null || this.zzAg == null) {
                map = this.zzAd;
            } else {
                map = zziG.zza(this.zzAd, this.zzAg.zzm());
            }
        }
        return map;
    }
}
