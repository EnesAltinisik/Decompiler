package com.google.android.gms.measurement.internal;

abstract class b extends k {
    private boolean zzWh;

    b(zzx com_google_android_gms_measurement_internal_zzx) {
        super(com_google_android_gms_measurement_internal_zzx);
        this.zzbbl.zzb(this);
    }

    public final void initialize() {
        if (this.zzWh) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzkO();
        this.zzbbl.zzGp();
        this.zzWh = true;
    }

    boolean isInitialized() {
        return this.zzWh;
    }

    boolean zzGu() {
        return false;
    }

    protected abstract void zzkO();

    protected void zzma() {
        if (!isInitialized()) {
            throw new IllegalStateException("Not initialized");
        }
    }
}
