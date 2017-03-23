package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class f extends bs {
    private static final String a = zzad.ENDS_WITH.toString();

    public f() {
        super(a);
    }

    protected boolean zza(String str, String str2, Map<String, zza> map) {
        return str.endsWith(str2);
    }
}
