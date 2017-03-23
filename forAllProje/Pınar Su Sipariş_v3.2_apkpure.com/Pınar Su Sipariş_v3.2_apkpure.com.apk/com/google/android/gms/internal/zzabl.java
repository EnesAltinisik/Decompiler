package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;

public final class zzabl extends zzabh<zzabh<?>> {
    public static final zzabl zzbvK = new zzabl("BREAK");
    public static final zzabl zzbvL = new zzabl("CONTINUE");
    public static final zzabl zzbvM = new zzabl("NULL");
    public static final zzabl zzbvN = new zzabl("UNDEFINED");
    private final String mName;
    private final boolean zzbvO;
    private final zzabh<?> zzbvP;

    public zzabl(zzabh<?> com_google_android_gms_internal_zzabh_) {
        zzaa.zzz(com_google_android_gms_internal_zzabh_);
        this.mName = "RETURN";
        this.zzbvO = true;
        this.zzbvP = com_google_android_gms_internal_zzabh_;
    }

    private zzabl(String str) {
        this.mName = str;
        this.zzbvO = false;
        this.zzbvP = null;
    }

    public String toString() {
        return this.mName;
    }

    public /* synthetic */ Object zzMk() {
        return zzMq();
    }

    public zzabh zzMq() {
        return this.zzbvP;
    }

    public boolean zzMr() {
        return this.zzbvO;
    }
}
