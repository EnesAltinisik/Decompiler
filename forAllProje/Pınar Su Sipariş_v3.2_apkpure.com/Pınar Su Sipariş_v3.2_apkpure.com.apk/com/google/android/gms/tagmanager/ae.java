package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class ae extends k {
    private static final String a = zzad.LOWERCASE_STRING.toString();
    private static final String b = zzae.ARG0.toString();

    public ae() {
        super(a, b);
    }

    public boolean zzJf() {
        return true;
    }

    public zza zzV(Map<String, zza> map) {
        return zzdl.zzQ(zzdl.zzg((zza) map.get(b)).toLowerCase());
    }
}
