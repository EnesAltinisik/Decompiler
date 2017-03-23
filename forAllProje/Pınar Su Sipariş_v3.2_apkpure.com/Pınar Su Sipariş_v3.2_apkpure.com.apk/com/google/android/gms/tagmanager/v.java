package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class v extends k {
    private static final String a = zzad.ADVERTISER_ID.toString();
    private final zza b;

    public v(Context context) {
        this(zza.zzbg(context));
    }

    v(zza com_google_android_gms_tagmanager_zza) {
        super(a, new String[0]);
        this.b = com_google_android_gms_tagmanager_zza;
    }

    public boolean zzJf() {
        return false;
    }

    public zza zzV(Map<String, zza> map) {
        String zzIZ = this.b.zzIZ();
        return zzIZ == null ? zzdl.zzKT() : zzdl.zzQ(zzIZ);
    }
}
