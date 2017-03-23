package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class zzabn extends zzabh<Map<String, zzabh<?>>> {
    private static final Map<String, zzvh> zzbvH;
    private boolean zzbvV = false;

    static {
        Map hashMap = new HashMap();
        hashMap.put("hasOwnProperty", zzxf.zzbus);
        zzbvH = Collections.unmodifiableMap(hashMap);
    }

    public zzabn(Map<String, zzabh<?>> map) {
        this.zzbvD = (Map) zzaa.zzz(map);
    }

    public boolean equals(Object obj) {
        return this == obj ? true : obj instanceof zzabn ? this.zzbvD.entrySet().equals(((Map) ((zzabn) obj).zzMk()).entrySet()) : false;
    }

    public String toString() {
        return this.zzbvD.toString();
    }

    public Iterator<zzabh<?>> zzMj() {
        return zzMl();
    }

    public /* synthetic */ Object zzMk() {
        return zzMt();
    }

    public Map<String, zzabh<?>> zzMt() {
        return this.zzbvD;
    }

    public void zzMu() {
        this.zzbvV = true;
    }

    public boolean zzMv() {
        return this.zzbvV;
    }

    public zzabh<?> zzhu(String str) {
        zzabh<?> zzhu = super.zzhu(str);
        return zzhu == null ? zzabl.zzbvN : zzhu;
    }

    public boolean zzhv(String str) {
        return zzbvH.containsKey(str);
    }

    public zzvh zzhw(String str) {
        if (zzhv(str)) {
            return (zzvh) zzbvH.get(str);
        }
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 51).append("Native Method ").append(str).append(" is not defined for type ListWrapper.").toString());
    }
}
