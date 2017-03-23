package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class cb extends k {
    private static final String a = zzad.APP_NAME.toString();
    private final Context b;

    public cb(Context context) {
        super(a, new String[0]);
        this.b = context;
    }

    public boolean zzJf() {
        return true;
    }

    public zza zzV(Map<String, zza> map) {
        try {
            PackageManager packageManager = this.b.getPackageManager();
            return zzdl.zzQ(packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.b.getPackageName(), 0)).toString());
        } catch (Throwable e) {
            zzbn.zzb("App name is not found.", e);
            return zzdl.zzKT();
        }
    }
}
