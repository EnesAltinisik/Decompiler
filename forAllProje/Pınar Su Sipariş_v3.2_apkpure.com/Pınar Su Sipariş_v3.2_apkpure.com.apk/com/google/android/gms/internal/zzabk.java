package com.google.android.gms.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class zzabk extends zzabh<zzvh> {
    private static final Map<String, zzvh> zzbvH;
    private zzvh zzbvJ;

    static {
        Map hashMap = new HashMap();
        hashMap.put("hasOwnProperty", zzxf.zzbus);
        zzbvH = Collections.unmodifiableMap(hashMap);
    }

    public zzabk(zzvh com_google_android_gms_internal_zzvh) {
        this.zzbvJ = com_google_android_gms_internal_zzvh;
    }

    public String toString() {
        return this.zzbvJ.toString();
    }

    public Iterator<zzabh<?>> zzMj() {
        return zzMl();
    }

    public /* synthetic */ Object zzMk() {
        return zzMp();
    }

    public zzvh zzMp() {
        return this.zzbvJ;
    }

    public boolean zzhv(String str) {
        return zzbvH.containsKey(str);
    }

    public zzvh zzhw(String str) {
        if (zzhv(str)) {
            return (zzvh) zzbvH.get(str);
        }
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 60).append("Native Method ").append(str).append(" is not defined for type InstructionReference.").toString());
    }
}
