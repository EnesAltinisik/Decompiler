package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class cg extends k {
    private static final String a = zzad.CONTAINER_VERSION.toString();
    private final String b;

    public cg(String str) {
        super(a, new String[0]);
        this.b = str;
    }

    public boolean zzJf() {
        return true;
    }

    public zza zzV(Map<String, zza> map) {
        return this.b == null ? zzdl.zzKT() : zzdl.zzQ(this.b);
    }
}
