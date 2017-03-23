package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class bt extends k {
    private static final String a = zzad.TIME.toString();

    public bt() {
        super(a, new String[0]);
    }

    public boolean zzJf() {
        return false;
    }

    public zza zzV(Map<String, zza> map) {
        return zzdl.zzQ(Long.valueOf(System.currentTimeMillis()));
    }
}
