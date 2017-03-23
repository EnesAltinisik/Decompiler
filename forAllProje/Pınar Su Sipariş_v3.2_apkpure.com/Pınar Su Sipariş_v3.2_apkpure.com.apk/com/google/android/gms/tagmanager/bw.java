package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class bw extends k {
    private static final String a = zzad.UPPERCASE_STRING.toString();
    private static final String b = zzae.ARG0.toString();

    public bw() {
        super(a, b);
    }

    public boolean zzJf() {
        return true;
    }

    public zza zzV(Map<String, zza> map) {
        return zzdl.zzQ(zzdl.zzg((zza) map.get(b)).toUpperCase());
    }
}
