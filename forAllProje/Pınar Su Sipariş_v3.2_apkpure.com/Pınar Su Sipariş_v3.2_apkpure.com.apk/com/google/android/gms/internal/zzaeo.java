package com.google.android.gms.internal;

import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class zzaeo {
    private final ScheduledExecutorService zzbHI;
    private final zzahf zzbHV;
    private final long zzbKJ;
    private final long zzbKK;
    private final double zzbKL;
    private final double zzbKM;
    private final Random zzbKN;
    private ScheduledFuture<?> zzbKO;
    private long zzbKP;
    private boolean zzbKQ;

    public static class zza {
        private final zzahf zzbHV;
        private long zzbKJ = 1000;
        private double zzbKL = 0.5d;
        private double zzbKM = 1.3d;
        private final ScheduledExecutorService zzbKT;
        private long zzbKU = 30000;

        public zza(ScheduledExecutorService scheduledExecutorService, zzahg com_google_android_gms_internal_zzahg, String str) {
            this.zzbKT = scheduledExecutorService;
            this.zzbHV = new zzahf(com_google_android_gms_internal_zzahg, str);
        }

        public zzaeo zzQG() {
            return new zzaeo(this.zzbKT, this.zzbHV, this.zzbKJ, this.zzbKU, this.zzbKM, this.zzbKL);
        }

        public zza zzaB(long j) {
            this.zzbKJ = j;
            return this;
        }

        public zza zzaC(long j) {
            this.zzbKU = j;
            return this;
        }

        public zza zzl(double d) {
            this.zzbKM = d;
            return this;
        }

        public zza zzm(double d) {
            if (d < 0.0d || d > 1.0d) {
                throw new IllegalArgumentException("Argument out of range: " + d);
            }
            this.zzbKL = d;
            return this;
        }
    }

    private zzaeo(ScheduledExecutorService scheduledExecutorService, zzahf com_google_android_gms_internal_zzahf, long j, long j2, double d, double d2) {
        this.zzbKN = new Random();
        this.zzbKQ = true;
        this.zzbHI = scheduledExecutorService;
        this.zzbHV = com_google_android_gms_internal_zzahf;
        this.zzbKJ = j;
        this.zzbKK = j2;
        this.zzbKM = d;
        this.zzbKL = d2;
    }

    public void cancel() {
        if (this.zzbKO != null) {
            this.zzbHV.zzh("Cancelling existing retry attempt", new Object[0]);
            this.zzbKO.cancel(false);
            this.zzbKO = null;
        } else {
            this.zzbHV.zzh("No existing retry attempt to cancel", new Object[0]);
        }
        this.zzbKP = 0;
    }

    public void zzOx() {
        this.zzbKQ = true;
        this.zzbKP = 0;
    }

    public void zzk(final Runnable runnable) {
        long j = 0;
        Runnable anonymousClass1 = new Runnable(this) {
            final /* synthetic */ zzaeo b;

            public void run() {
                this.b.zzbKO = null;
                runnable.run();
            }
        };
        if (this.zzbKO != null) {
            this.zzbHV.zzh("Cancelling previous scheduled retry", new Object[0]);
            this.zzbKO.cancel(false);
            this.zzbKO = null;
        }
        if (!this.zzbKQ) {
            if (this.zzbKP == 0) {
                this.zzbKP = this.zzbKJ;
            } else {
                this.zzbKP = Math.min((long) (((double) this.zzbKP) * this.zzbKM), this.zzbKK);
            }
            j = (long) (((1.0d - this.zzbKL) * ((double) this.zzbKP)) + ((this.zzbKL * ((double) this.zzbKP)) * this.zzbKN.nextDouble()));
        }
        this.zzbKQ = false;
        this.zzbHV.zzh("Scheduling retry in %dms", Long.valueOf(j));
        this.zzbKO = this.zzbHI.schedule(anonymousClass1, j, TimeUnit.MILLISECONDS);
    }
}
