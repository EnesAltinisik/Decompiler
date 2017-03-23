package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class i extends k {
    private static final String a = zzad.EVENT.toString();
    private final bk b;

    public i(bk bkVar) {
        super(a, new String[0]);
        this.b = bkVar;
    }

    public boolean zzJf() {
        return false;
    }

    public zza zzV(Map<String, zza> map) {
        String a = this.b.a();
        return a == null ? zzdl.zzKT() : zzdl.zzQ(a);
    }
}
