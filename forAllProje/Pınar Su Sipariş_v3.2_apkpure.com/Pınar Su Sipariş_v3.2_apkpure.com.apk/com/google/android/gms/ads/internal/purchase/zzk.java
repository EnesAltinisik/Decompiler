package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.zzig;

@zzig
public class zzk {
    private final String zzwm;

    public zzk(String str) {
        this.zzwm = str;
    }

    public boolean zza(String str, int i, Intent intent) {
        if (str == null || intent == null) {
            return false;
        }
        String zze = zzu.zzcu().zze(intent);
        String zzf = zzu.zzcu().zzf(intent);
        if (zze == null || zzf == null) {
            return false;
        }
        if (!str.equals(zzu.zzcu().zzax(zze))) {
            zzb.zzaW("Developer payload not match.");
            return false;
        } else if (this.zzwm == null || zzl.zzc(this.zzwm, zze, zzf)) {
            return true;
        } else {
            zzb.zzaW("Fail to verify signature.");
            return false;
        }
    }

    public String zzho() {
        return zzu.zzck().zzja();
    }
}
