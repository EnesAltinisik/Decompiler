package com.google.android.gms.tagmanager;

import android.os.Build.VERSION;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class bm extends k {
    private static final String a = zzad.SDK_VERSION.toString();

    public bm() {
        super(a, new String[0]);
    }

    public boolean zzJf() {
        return true;
    }

    public zza zzV(Map<String, zza> map) {
        return zzdl.zzQ(Integer.valueOf(VERSION.SDK_INT));
    }
}
