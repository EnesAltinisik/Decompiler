package com.google.android.gms.tagmanager;

import android.content.Context;
import android.provider.Settings.Secure;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class a extends k {
    private static final String a = zzad.DEVICE_ID.toString();
    private final Context b;

    public a(Context context) {
        super(a, new String[0]);
        this.b = context;
    }

    protected String a(Context context) {
        return Secure.getString(context.getContentResolver(), "android_id");
    }

    public boolean zzJf() {
        return true;
    }

    public zza zzV(Map<String, zza> map) {
        String a = a(this.b);
        return a == null ? zzdl.zzKT() : zzdl.zzQ(a);
    }
}
