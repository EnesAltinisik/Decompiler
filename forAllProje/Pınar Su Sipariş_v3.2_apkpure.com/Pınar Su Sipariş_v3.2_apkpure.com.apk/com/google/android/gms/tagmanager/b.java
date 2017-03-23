package com.google.android.gms.tagmanager;

import android.os.Build;
import com.google.android.gms.fitness.FitnessActivities;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class b extends k {
    private static final String a = zzad.DEVICE_NAME.toString();

    public b() {
        super(a, new String[0]);
    }

    public boolean zzJf() {
        return true;
    }

    public zza zzV(Map<String, zza> map) {
        String str = Build.MANUFACTURER;
        Object obj = Build.MODEL;
        if (!(obj.startsWith(str) || str.equals(FitnessActivities.UNKNOWN))) {
            obj = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(obj).length()).append(str).append(" ").append(obj).toString();
        }
        return zzdl.zzQ(obj);
    }
}
