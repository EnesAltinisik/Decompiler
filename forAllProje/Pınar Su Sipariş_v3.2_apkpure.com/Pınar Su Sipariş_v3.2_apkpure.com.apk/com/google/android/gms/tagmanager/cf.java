package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class cf extends k {
    private static final String a = zzad.CONSTANT.toString();
    private static final String b = zzae.VALUE.toString();

    public cf() {
        super(a, b);
    }

    public static String a() {
        return a;
    }

    public static String b() {
        return b;
    }

    public boolean zzJf() {
        return true;
    }

    public zza zzV(Map<String, zza> map) {
        return (zza) map.get(b);
    }
}
