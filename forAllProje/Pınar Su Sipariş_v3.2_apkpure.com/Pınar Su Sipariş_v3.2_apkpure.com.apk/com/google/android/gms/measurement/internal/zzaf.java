package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.zze;

public class zzaf extends b {
    private Handler mHandler;
    private long zzbfQ;
    private final Runnable zzbfR = new Runnable(this) {
        final /* synthetic */ zzaf a;

        {
            this.a = r1;
        }

        public void run() {
            this.a.zzFl().zzg(new Runnable(this) {
                final /* synthetic */ AnonymousClass1 a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.a.zzGJ();
                }
            });
        }
    };
    private final g zzbfS = new g(this, this.zzbbl) {
        final /* synthetic */ zzaf a;

        public void a() {
            this.a.zzGK();
        }
    };
    private final g zzbfT = new g(this, this.zzbbl) {
        final /* synthetic */ zzaf a;

        public void a() {
            this.a.zzGL();
        }
    };

    zzaf(zzx com_google_android_gms_measurement_internal_zzx) {
        super(com_google_android_gms_measurement_internal_zzx);
    }

    private void zzGH() {
        synchronized (this) {
            if (this.mHandler == null) {
                this.mHandler = new Handler(Looper.getMainLooper());
            }
        }
    }

    private void zzGK() {
        zzkN();
        zzFm().zzFL().zzj("Session started, time", Long.valueOf(zzlQ().elapsedRealtime()));
        zzFn().j.set(false);
        zzFd().zze("auto", "_s", new Bundle());
    }

    private void zzGL() {
        zzkN();
        long elapsedRealtime = zzlQ().elapsedRealtime();
        if (this.zzbfQ == 0) {
            this.zzbfQ = elapsedRealtime - 3600000;
        }
        long j = zzFn().l.get() + (elapsedRealtime - this.zzbfQ);
        zzFn().l.set(j);
        zzFm().zzFL().zzj("Recording user engagement, ms", Long.valueOf(j));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j);
        zzFd().zze("auto", "_e", bundle);
        zzFn().l.set(0);
        this.zzbfQ = elapsedRealtime;
        this.zzbfT.a(Math.max(0, 3600000 - zzFn().l.get()));
    }

    private void zzaj(long j) {
        zzkN();
        zzGH();
        this.zzbfS.c();
        this.zzbfT.c();
        zzFm().zzFL().zzj("Activity resumed, time", Long.valueOf(j));
        this.zzbfQ = j;
        if (zzlQ().currentTimeMillis() - zzFn().i.get() > zzFn().k.get()) {
            zzFn().j.set(true);
            zzFn().l.set(0);
        }
        if (zzFn().j.get()) {
            this.zzbfS.a(Math.max(0, zzFn().h.get() - zzFn().l.get()));
        } else {
            this.zzbfT.a(Math.max(0, 3600000 - zzFn().l.get()));
        }
    }

    private void zzak(long j) {
        zzkN();
        zzGH();
        this.zzbfS.c();
        this.zzbfT.c();
        zzFm().zzFL().zzj("Activity paused, time", Long.valueOf(j));
        if (this.zzbfQ != 0) {
            zzFn().l.set(zzFn().l.get() + (j - this.zzbfQ));
        }
        zzFn().k.set(zzlQ().currentTimeMillis());
        synchronized (this) {
            if (!zzFn().j.get()) {
                this.mHandler.postDelayed(this.zzbfR, 1000);
            }
        }
    }

    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public /* bridge */ /* synthetic */ void zzFb() {
        super.zzFb();
    }

    public /* bridge */ /* synthetic */ f zzFc() {
        return super.zzFc();
    }

    public /* bridge */ /* synthetic */ zzac zzFd() {
        return super.zzFd();
    }

    public /* bridge */ /* synthetic */ zzn zzFe() {
        return super.zzFe();
    }

    public /* bridge */ /* synthetic */ zzg zzFf() {
        return super.zzFf();
    }

    public /* bridge */ /* synthetic */ zzad zzFg() {
        return super.zzFg();
    }

    public /* bridge */ /* synthetic */ zze zzFh() {
        return super.zzFh();
    }

    public /* bridge */ /* synthetic */ zzal zzFi() {
        return super.zzFi();
    }

    public /* bridge */ /* synthetic */ zzv zzFj() {
        return super.zzFj();
    }

    public /* bridge */ /* synthetic */ zzaf zzFk() {
        return super.zzFk();
    }

    public /* bridge */ /* synthetic */ zzw zzFl() {
        return super.zzFl();
    }

    public /* bridge */ /* synthetic */ zzp zzFm() {
        return super.zzFm();
    }

    public /* bridge */ /* synthetic */ zzt zzFn() {
        return super.zzFn();
    }

    public /* bridge */ /* synthetic */ zzd zzFo() {
        return super.zzFo();
    }

    protected void zzGG() {
        synchronized (this) {
            zzGH();
            this.mHandler.removeCallbacks(this.zzbfR);
        }
        final long elapsedRealtime = zzlQ().elapsedRealtime();
        zzFl().zzg(new Runnable(this) {
            final /* synthetic */ zzaf b;

            public void run() {
                this.b.zzaj(elapsedRealtime);
            }
        });
    }

    protected void zzGI() {
        final long elapsedRealtime = zzlQ().elapsedRealtime();
        zzFl().zzg(new Runnable(this) {
            final /* synthetic */ zzaf b;

            public void run() {
                this.b.zzak(elapsedRealtime);
            }
        });
    }

    public void zzGJ() {
        zzkN();
        zzFm().zzFK().log("Application backgrounded. Logging engagement");
        long j = zzFn().l.get();
        if (j > 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j);
            zzFd().zze("auto", "_e", bundle);
            zzFn().l.set(0);
            return;
        }
        zzFm().zzFG().zzj("Not logging non-positive engagement time", Long.valueOf(j));
    }

    public /* bridge */ /* synthetic */ void zzkN() {
        super.zzkN();
    }

    protected void zzkO() {
    }

    public /* bridge */ /* synthetic */ void zzlP() {
        super.zzlP();
    }

    public /* bridge */ /* synthetic */ zze zzlQ() {
        return super.zzlQ();
    }
}
