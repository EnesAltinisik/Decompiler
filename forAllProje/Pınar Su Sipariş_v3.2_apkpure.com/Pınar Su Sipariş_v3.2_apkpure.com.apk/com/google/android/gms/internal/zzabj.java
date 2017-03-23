package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzabj extends zzabh<Double> {
    private static final Map<String, zzvh> zzbvH;
    private Double zzbvI;

    static {
        Map hashMap = new HashMap();
        hashMap.put("hasOwnProperty", zzxf.zzbus);
        hashMap.put("toString", new zzyh());
        zzbvH = Collections.unmodifiableMap(hashMap);
    }

    public zzabj(Double d) {
        zzaa.zzz(d);
        this.zzbvI = d;
    }

    public boolean equals(Object obj) {
        return this == obj ? true : obj instanceof zzabj ? this.zzbvI.equals((Double) ((zzabj) obj).zzMk()) : false;
    }

    public String toString() {
        return this.zzbvI.toString();
    }

    public /* synthetic */ Object zzMk() {
        return zzMo();
    }

    public Double zzMo() {
        return this.zzbvI;
    }

    public boolean zzhv(String str) {
        return zzbvH.containsKey(str);
    }

    public zzvh zzhw(String str) {
        if (zzhv(str)) {
            return (zzvh) zzbvH.get(str);
        }
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 53).append("Native Method ").append(str).append(" is not defined for type DoubleWrapper.").toString());
    }
}
