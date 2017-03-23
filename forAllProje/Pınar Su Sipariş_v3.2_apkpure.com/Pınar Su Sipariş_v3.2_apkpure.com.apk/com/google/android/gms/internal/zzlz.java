package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzg;
import com.google.android.gms.plus.PlusShare;
import java.util.HashMap;
import java.util.Map;

public final class zzlz extends zzg<zzlz> {
    public String mCategory;
    public String zzVP;
    public long zzVQ;
    public String zzVu;

    public String getLabel() {
        return this.zzVu;
    }

    public long getTimeInMillis() {
        return this.zzVQ;
    }

    public void setTimeInMillis(long j) {
        this.zzVQ = j;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("variableName", this.zzVP);
        hashMap.put("timeInMillis", Long.valueOf(this.zzVQ));
        hashMap.put("category", this.mCategory);
        hashMap.put(PlusShare.KEY_CALL_TO_ACTION_LABEL, this.zzVu);
        return zzg.zzj(hashMap);
    }

    public void zza(zzlz com_google_android_gms_internal_zzlz) {
        if (!TextUtils.isEmpty(this.zzVP)) {
            com_google_android_gms_internal_zzlz.zzbC(this.zzVP);
        }
        if (this.zzVQ != 0) {
            com_google_android_gms_internal_zzlz.setTimeInMillis(this.zzVQ);
        }
        if (!TextUtils.isEmpty(this.mCategory)) {
            com_google_android_gms_internal_zzlz.zzbs(this.mCategory);
        }
        if (!TextUtils.isEmpty(this.zzVu)) {
            com_google_android_gms_internal_zzlz.zzbu(this.zzVu);
        }
    }

    public /* synthetic */ void zzb(zzg com_google_android_gms_analytics_zzg) {
        zza((zzlz) com_google_android_gms_analytics_zzg);
    }

    public void zzbC(String str) {
        this.zzVP = str;
    }

    public void zzbs(String str) {
        this.mCategory = str;
    }

    public void zzbu(String str) {
        this.zzVu = str;
    }

    public String zzlD() {
        return this.zzVP;
    }

    public String zzlp() {
        return this.mCategory;
    }
}
