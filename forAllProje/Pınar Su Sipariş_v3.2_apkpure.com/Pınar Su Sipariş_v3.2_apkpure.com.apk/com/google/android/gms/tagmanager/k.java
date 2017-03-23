package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class k {
    private final Set<String> zzbpf;
    private final String zzbpg;

    public k(String str, String... strArr) {
        this.zzbpg = str;
        this.zzbpf = new HashSet(strArr.length);
        for (Object add : strArr) {
            this.zzbpf.add(add);
        }
    }

    public String zzJO() {
        return this.zzbpg;
    }

    public Set<String> zzJP() {
        return this.zzbpf;
    }

    public abstract boolean zzJf();

    public abstract zza zzV(Map<String, zza> map);

    boolean zze(Set<String> set) {
        return set.containsAll(this.zzbpf);
    }
}
