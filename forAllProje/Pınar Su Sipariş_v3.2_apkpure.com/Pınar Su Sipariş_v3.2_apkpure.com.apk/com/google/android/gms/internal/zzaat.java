package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;

public class zzaat {
    private zzaam zzbuY;

    public String getId() {
        return this.zzbuY == null ? "" : this.zzbuY.getContainerId();
    }

    public zzaam zzLN() {
        return this.zzbuY;
    }

    public zzaat zza(zzaam com_google_android_gms_internal_zzaam) throws IllegalArgumentException {
        zzaa.zzz(com_google_android_gms_internal_zzaam);
        this.zzbuY = com_google_android_gms_internal_zzaam;
        return this;
    }
}
