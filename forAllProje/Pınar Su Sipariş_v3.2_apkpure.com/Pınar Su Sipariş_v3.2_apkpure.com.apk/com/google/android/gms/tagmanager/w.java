package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class w extends k {
    private static final String a = zzad.INSTALL_REFERRER.toString();
    private static final String b = zzae.COMPONENT.toString();
    private final Context c;

    public w(Context context) {
        super(a, new String[0]);
        this.c = context;
    }

    public boolean zzJf() {
        return true;
    }

    public zza zzV(Map<String, zza> map) {
        String zzs = zzbe.zzs(this.c, ((zza) map.get(b)) != null ? zzdl.zzg((zza) map.get(b)) : null);
        return zzs != null ? zzdl.zzQ(zzs) : zzdl.zzKT();
    }
}
