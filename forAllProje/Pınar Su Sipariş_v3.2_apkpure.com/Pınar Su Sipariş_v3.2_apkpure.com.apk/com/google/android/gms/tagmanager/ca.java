package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class ca extends k {
    private static final String a = zzad.APP_ID.toString();
    private final Context b;

    public ca(Context context) {
        super(a, new String[0]);
        this.b = context;
    }

    public boolean zzJf() {
        return true;
    }

    public zza zzV(Map<String, zza> map) {
        return zzdl.zzQ(this.b.getPackageName());
    }
}
