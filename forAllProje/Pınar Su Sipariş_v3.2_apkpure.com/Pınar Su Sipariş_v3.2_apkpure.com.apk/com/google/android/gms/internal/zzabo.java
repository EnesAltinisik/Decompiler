package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.List;

public class zzabo extends zzabh<String> {
    private final String zzbvW;
    private final List<zzabh<?>> zzbvX;

    public zzabo(String str, List<zzabh<?>> list) {
        zzaa.zzb((Object) str, (Object) "Instruction name must be a string.");
        zzaa.zzz(list);
        this.zzbvW = str;
        this.zzbvX = list;
    }

    public String toString() {
        String str = this.zzbvW;
        String valueOf = String.valueOf(this.zzbvX.toString());
        return new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(valueOf).length()).append("*").append(str).append(": ").append(valueOf).toString();
    }

    public String value() {
        return toString();
    }

    public /* synthetic */ Object zzMk() {
        return value();
    }

    public String zzMw() {
        return this.zzbvW;
    }

    public List<zzabh<?>> zzMx() {
        return this.zzbvX;
    }
}
