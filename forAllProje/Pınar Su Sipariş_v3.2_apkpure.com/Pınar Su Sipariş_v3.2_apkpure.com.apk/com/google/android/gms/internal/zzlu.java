package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzg;
import com.google.android.gms.plus.PlusShare;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import java.util.HashMap;
import java.util.Map;

public final class zzlu extends zzg<zzlu> {
    private String mCategory;
    private String zzVt;
    private String zzVu;
    private long zzVv;

    public String getAction() {
        return this.zzVt;
    }

    public String getLabel() {
        return this.zzVu;
    }

    public long getValue() {
        return this.zzVv;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("category", this.mCategory);
        hashMap.put("action", this.zzVt);
        hashMap.put(PlusShare.KEY_CALL_TO_ACTION_LABEL, this.zzVu);
        hashMap.put(Param.VALUE, Long.valueOf(this.zzVv));
        return zzg.zzj(hashMap);
    }

    public void zza(zzlu com_google_android_gms_internal_zzlu) {
        if (!TextUtils.isEmpty(this.mCategory)) {
            com_google_android_gms_internal_zzlu.zzbs(this.mCategory);
        }
        if (!TextUtils.isEmpty(this.zzVt)) {
            com_google_android_gms_internal_zzlu.zzbt(this.zzVt);
        }
        if (!TextUtils.isEmpty(this.zzVu)) {
            com_google_android_gms_internal_zzlu.zzbu(this.zzVu);
        }
        if (this.zzVv != 0) {
            com_google_android_gms_internal_zzlu.zzo(this.zzVv);
        }
    }

    public /* synthetic */ void zzb(zzg com_google_android_gms_analytics_zzg) {
        zza((zzlu) com_google_android_gms_analytics_zzg);
    }

    public void zzbs(String str) {
        this.mCategory = str;
    }

    public void zzbt(String str) {
        this.zzVt = str;
    }

    public void zzbu(String str) {
        this.zzVu = str;
    }

    public String zzlp() {
        return this.mCategory;
    }

    public void zzo(long j) {
        this.zzVv = j;
    }
}
