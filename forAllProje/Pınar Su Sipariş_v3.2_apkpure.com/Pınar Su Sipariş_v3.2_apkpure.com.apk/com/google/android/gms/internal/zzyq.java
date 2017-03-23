package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import org.json.JSONArray;

public class zzyq extends zzvj {
    private final int zzagd;
    private final zzuw zzbtd;

    public zzyq(int i, zzuw com_google_android_gms_internal_zzuw) {
        this.zzagd = i;
        this.zzbtd = com_google_android_gms_internal_zzuw;
    }

    public zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        boolean z = true;
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr != null);
        if (com_google_android_gms_internal_zzabh_Arr.length != 1) {
            z = false;
        }
        zzaa.zzaj(z);
        zzaa.zzaj(com_google_android_gms_internal_zzabh_Arr[0] instanceof zzabp);
        try {
            zzvg zzW = zzaao.zzW(new JSONArray((String) ((zzabp) com_google_android_gms_internal_zzabh_Arr[0]).zzMk()).getJSONArray(0));
            zzW.zza(this.zzbtd);
            return this.zzagd == 0 ? zzabl.zzbvN : zzW.zzb(com_google_android_gms_internal_zzuw, new zzabh[0]);
        } catch (Throwable e) {
            zzun.zzb("Unable to convert Custom Pixie to instruction", e);
            return zzabl.zzbvN;
        }
    }
}
