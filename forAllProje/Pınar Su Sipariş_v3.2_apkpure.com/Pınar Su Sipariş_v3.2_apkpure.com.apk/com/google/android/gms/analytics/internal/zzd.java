package com.google.android.gms.analytics.internal;

public abstract class zzd extends zzc {
    private boolean zzWh;

    protected zzd(zzf com_google_android_gms_analytics_internal_zzf) {
        super(com_google_android_gms_analytics_internal_zzf);
    }

    public void initialize() {
        zzkO();
        this.zzWh = true;
    }

    public boolean isInitialized() {
        return this.zzWh;
    }

    protected abstract void zzkO();

    protected void zzma() {
        if (!isInitialized()) {
            throw new IllegalStateException("Not initialized");
        }
    }
}
