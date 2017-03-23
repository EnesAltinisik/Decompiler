package com.google.android.gms.b;

import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class gk {
    private final ScheduledExecutorService a;
    private final jb b;
    private final long c;
    private final long d;
    private final double e;
    private final double f;
    private final Random g;
    private ScheduledFuture<?> h;
    private long i;
    private boolean j;

    public static class a {
        private final ScheduledExecutorService a;
        private long b = 1000;
        private double c = 0.5d;
        private long d = 30000;
        private double e = 1.3d;
        private final jb f;

        public a(ScheduledExecutorService scheduledExecutorService, jc jcVar, String str) {
            this.a = scheduledExecutorService;
            this.f = new jb(jcVar, str);
        }

        public a a(double d) {
            this.e = d;
            return this;
        }

        public a a(long j) {
            this.b = j;
            return this;
        }

        public gk a() {
            return new gk(this.a, this.f, this.b, this.d, this.e, this.c);
        }

        public a b(double d) {
            if (d < 0.0d || d > 1.0d) {
                throw new IllegalArgumentException("Argument out of range: " + d);
            }
            this.c = d;
            return this;
        }

        public a b(long j) {
            this.d = j;
            return this;
        }
    }

    private gk(ScheduledExecutorService scheduledExecutorService, jb jbVar, long j, long j2, double d, double d2) {
        this.g = new Random();
        this.j = true;
        this.a = scheduledExecutorService;
        this.b = jbVar;
        this.c = j;
        this.d = j2;
        this.f = d;
        this.e = d2;
    }

    public void a() {
        this.j = true;
        this.i = 0;
    }

    public void a(final Runnable runnable) {
        long j = 0;
        Runnable anonymousClass1 = new Runnable(this) {
            final /* synthetic */ gk b;

            public void run() {
                this.b.h = null;
                runnable.run();
            }
        };
        if (this.h != null) {
            this.b.a("Cancelling previous scheduled retry", new Object[0]);
            this.h.cancel(false);
            this.h = null;
        }
        if (!this.j) {
            if (this.i == 0) {
                this.i = this.c;
            } else {
                this.i = Math.min((long) (((double) this.i) * this.f), this.d);
            }
            j = (long) (((1.0d - this.e) * ((double) this.i)) + ((this.e * ((double) this.i)) * this.g.nextDouble()));
        }
        this.j = false;
        this.b.a("Scheduling retry in %dms", Long.valueOf(j));
        this.h = this.a.schedule(anonymousClass1, j, TimeUnit.MILLISECONDS);
    }

    public void b() {
        this.i = this.d;
    }

    public void c() {
        if (this.h != null) {
            this.b.a("Cancelling existing retry attempt", new Object[0]);
            this.h.cancel(false);
            this.h = null;
        } else {
            this.b.a("No existing retry attempt to cancel", new Object[0]);
        }
        this.i = 0;
    }
}
