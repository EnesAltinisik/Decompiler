package com.google.android.gms.internal;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class zzabb {
    private boolean mClosed;
    private final ScheduledExecutorService zzajS;
    private String zzbot;
    private ScheduledFuture<?> zzbqv;

    public zzabb() {
        this(Executors.newSingleThreadScheduledExecutor());
    }

    public zzabb(String str) {
        this(Executors.newSingleThreadScheduledExecutor());
        this.zzbot = str;
    }

    zzabb(ScheduledExecutorService scheduledExecutorService) {
        this.zzbqv = null;
        this.zzbot = null;
        this.zzajS = scheduledExecutorService;
        this.mClosed = false;
    }

    public void zza(Context context, zzaat com_google_android_gms_internal_zzaat, long j, zzaap com_google_android_gms_internal_zzaap) {
        synchronized (this) {
            if (this.zzbqv != null) {
                this.zzbqv.cancel(false);
            }
            this.zzbqv = this.zzajS.schedule(this.zzbot != null ? new zzaba(context, com_google_android_gms_internal_zzaat, com_google_android_gms_internal_zzaap, this.zzbot) : new zzaba(context, com_google_android_gms_internal_zzaat, com_google_android_gms_internal_zzaap), j, TimeUnit.MILLISECONDS);
        }
    }
}
