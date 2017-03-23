package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;

public class zzvg extends zzvj {
    private final String mName;
    private zzuw zzbtl;
    private final List<String> zzbum;
    private final List<zzabo> zzbun;

    public zzvg(zzuw com_google_android_gms_internal_zzuw, String str, List<String> list, List<zzabo> list2) {
        this.zzbtl = com_google_android_gms_internal_zzuw;
        this.mName = str;
        this.zzbum = list;
        this.zzbun = list2;
    }

    public String getName() {
        return this.mName;
    }

    public String toString() {
        String str = this.mName;
        String valueOf = String.valueOf(this.zzbum.toString());
        String valueOf2 = String.valueOf(this.zzbun.toString());
        return new StringBuilder(((String.valueOf(str).length() + 26) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append(str).append("\n\tparams: ").append(valueOf).append("\n\t: statements: ").append(valueOf2).toString();
    }

    public zzabh<?> zza(zzuw com_google_android_gms_internal_zzuw, zzabh<?>... com_google_android_gms_internal_zzabh_Arr) {
        try {
            zzuw zzLs = this.zzbtl.zzLs();
            for (int i = 0; i < this.zzbum.size(); i++) {
                if (com_google_android_gms_internal_zzabh_Arr.length > i) {
                    zzLs.zza((String) this.zzbum.get(i), com_google_android_gms_internal_zzabh_Arr[i]);
                } else {
                    zzLs.zza((String) this.zzbum.get(i), zzabl.zzbvN);
                }
            }
            zzLs.zza("arguments", new zzabm(Arrays.asList(com_google_android_gms_internal_zzabh_Arr)));
            for (zzabo zza : this.zzbun) {
                zzabh zza2 = zzabq.zza(zzLs, zza);
                if ((zza2 instanceof zzabl) && ((zzabl) zza2).zzMr()) {
                    return (zzabh) ((zzabl) zza2).zzMk();
                }
            }
        } catch (RuntimeException e) {
            String str = this.mName;
            String valueOf = String.valueOf(e.getMessage());
            zzun.e(new StringBuilder((String.valueOf(str).length() + 33) + String.valueOf(valueOf).length()).append("Internal error - Function call: ").append(str).append("\n").append(valueOf).toString());
        }
        return zzabl.zzbvN;
    }

    public void zza(zzuw com_google_android_gms_internal_zzuw) {
        this.zzbtl = com_google_android_gms_internal_zzuw;
    }
}
