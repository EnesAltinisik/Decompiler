package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.HashMap;
import java.util.Map;

public class zzuw {
    private zzuw zzbtl;
    private Map<String, zzabh> zzbtm;

    public zzuw() {
        this(null);
    }

    private zzuw(zzuw com_google_android_gms_internal_zzuw) {
        this.zzbtm = null;
        this.zzbtl = com_google_android_gms_internal_zzuw;
    }

    public boolean has(String str) {
        return (this.zzbtm == null || !this.zzbtm.containsKey(str)) ? this.zzbtl != null ? this.zzbtl.has(str) : false : true;
    }

    public void remove(String str) {
        zzaa.zzai(has(str));
        if (this.zzbtm == null || !this.zzbtm.containsKey(str)) {
            this.zzbtl.remove(str);
        } else {
            this.zzbtm.remove(str);
        }
    }

    public zzuw zzLs() {
        return new zzuw(this);
    }

    public void zza(String str, zzabh<?> com_google_android_gms_internal_zzabh_) {
        if (this.zzbtm == null) {
            this.zzbtm = new HashMap();
        }
        this.zzbtm.put(str, com_google_android_gms_internal_zzabh_);
    }

    public void zzb(String str, zzabh<?> com_google_android_gms_internal_zzabh_) {
        if (this.zzbtm != null && this.zzbtm.containsKey(str)) {
            this.zzbtm.put(str, com_google_android_gms_internal_zzabh_);
        } else if (this.zzbtl == null) {
            String str2 = "Trying to modify a non existent symbol: ";
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else {
            this.zzbtl.zzb(str, com_google_android_gms_internal_zzabh_);
        }
    }

    public zzabh<?> zzhc(String str) {
        if (this.zzbtm != null && this.zzbtm.containsKey(str)) {
            return (zzabh) this.zzbtm.get(str);
        }
        if (this.zzbtl != null) {
            return this.zzbtl.zzhc(str);
        }
        String str2 = "Trying to get a non existent symbol: ";
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
