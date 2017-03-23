package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class ch extends bs {
    private static final String a = zzad.CONTAINS.toString();

    public ch() {
        super(a);
    }

    protected boolean zza(String str, String str2, Map<String, zza> map) {
        return str.contains(str2);
    }
}
