package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class ao extends k {
    private static final String a = zzad.ADVERTISING_TRACKING_ENABLED.toString();
    private final zza b;

    public ao(Context context) {
        this(zza.zzbg(context));
    }

    ao(zza com_google_android_gms_tagmanager_zza) {
        super(a, new String[0]);
        this.b = com_google_android_gms_tagmanager_zza;
    }

    public boolean zzJf() {
        return false;
    }

    public zza zzV(Map<String, zza> map) {
        return zzdl.zzQ(Boolean.valueOf(!this.b.isLimitAdTrackingEnabled()));
    }
}
