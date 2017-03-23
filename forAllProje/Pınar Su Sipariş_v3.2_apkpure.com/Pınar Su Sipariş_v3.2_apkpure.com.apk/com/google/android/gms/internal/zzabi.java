package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzabi extends zzabh<Boolean> {
    private static final Map<String, zzvh> zzbvH;
    private final Boolean zzbvG;

    static {
        Map hashMap = new HashMap();
        hashMap.put("hasOwnProperty", zzxf.zzbus);
        hashMap.put("toString", new zzyh());
        zzbvH = Collections.unmodifiableMap(hashMap);
    }

    public zzabi(Boolean bool) {
        zzaa.zzz(bool);
        this.zzbvG = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzabi)) {
            return false;
        }
        return ((Boolean) ((zzabi) obj).zzMk()) == this.zzbvG;
    }

    public String toString() {
        return this.zzbvG.toString();
    }

    public /* synthetic */ Object zzMk() {
        return zzMn();
    }

    public Boolean zzMn() {
        return this.zzbvG;
    }

    public boolean zzhv(String str) {
        return zzbvH.containsKey(str);
    }

    public zzvh zzhw(String str) {
        if (zzhv(str)) {
            return (zzvh) zzbvH.get(str);
        }
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 54).append("Native Method ").append(str).append(" is not defined for type BooleanWrapper.").toString());
    }
}
