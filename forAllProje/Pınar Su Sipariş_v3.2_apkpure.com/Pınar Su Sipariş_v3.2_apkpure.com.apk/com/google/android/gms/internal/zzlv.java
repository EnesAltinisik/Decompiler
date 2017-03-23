package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.zzg;
import com.google.android.gms.plus.PlusShare;
import java.util.HashMap;
import java.util.Map;

public final class zzlv extends zzg<zzlv> {
    public String zzVw;
    public boolean zzVx;

    public String getDescription() {
        return this.zzVw;
    }

    public void setDescription(String str) {
        this.zzVw = str;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, this.zzVw);
        hashMap.put("fatal", Boolean.valueOf(this.zzVx));
        return zzg.zzj(hashMap);
    }

    public void zzM(boolean z) {
        this.zzVx = z;
    }

    public void zza(zzlv com_google_android_gms_internal_zzlv) {
        if (!TextUtils.isEmpty(this.zzVw)) {
            com_google_android_gms_internal_zzlv.setDescription(this.zzVw);
        }
        if (this.zzVx) {
            com_google_android_gms_internal_zzlv.zzM(this.zzVx);
        }
    }

    public /* synthetic */ void zzb(zzg com_google_android_gms_analytics_zzg) {
        zza((zzlv) com_google_android_gms_analytics_zzg);
    }

    public boolean zzlq() {
        return this.zzVx;
    }
}
