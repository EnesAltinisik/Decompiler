package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.zzi;
import com.google.android.gms.common.internal.zzaa;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class zzb extends zzd {
    private final e zzVY;

    public zzb(zzf com_google_android_gms_analytics_internal_zzf, zzg com_google_android_gms_analytics_internal_zzg) {
        super(com_google_android_gms_analytics_internal_zzf);
        zzaa.zzz(com_google_android_gms_analytics_internal_zzg);
        this.zzVY = com_google_android_gms_analytics_internal_zzg.zzj(com_google_android_gms_analytics_internal_zzf);
    }

    void onServiceConnected() {
        zzkN();
        this.zzVY.d();
    }

    public void setLocalDispatchPeriod(final int i) {
        zzma();
        zzb("setLocalDispatchPeriod (sec)", Integer.valueOf(i));
        zzlT().zzf(new Runnable(this) {
            final /* synthetic */ zzb b;

            public void run() {
                this.b.zzVY.a(((long) i) * 1000);
            }
        });
    }

    public void start() {
        this.zzVY.a();
    }

    public void zzR(final boolean z) {
        zza("Network connectivity status changed", Boolean.valueOf(z));
        zzlT().zzf(new Runnable(this) {
            final /* synthetic */ zzb b;

            public void run() {
                this.b.zzVY.a(z);
            }
        });
    }

    public long zza(zzh com_google_android_gms_analytics_internal_zzh) {
        zzma();
        zzaa.zzz(com_google_android_gms_analytics_internal_zzh);
        zzkN();
        long a = this.zzVY.a(com_google_android_gms_analytics_internal_zzh, true);
        if (a == 0) {
            this.zzVY.a(com_google_android_gms_analytics_internal_zzh);
        }
        return a;
    }

    public void zza(final zzab com_google_android_gms_analytics_internal_zzab) {
        zzaa.zzz(com_google_android_gms_analytics_internal_zzab);
        zzma();
        zzb("Hit delivery requested", com_google_android_gms_analytics_internal_zzab);
        zzlT().zzf(new Runnable(this) {
            final /* synthetic */ zzb b;

            public void run() {
                this.b.zzVY.a(com_google_android_gms_analytics_internal_zzab);
            }
        });
    }

    public void zza(final zzw com_google_android_gms_analytics_internal_zzw) {
        zzma();
        zzlT().zzf(new Runnable(this) {
            final /* synthetic */ zzb b;

            public void run() {
                this.b.zzVY.a(com_google_android_gms_analytics_internal_zzw);
            }
        });
    }

    public void zza(final String str, final Runnable runnable) {
        zzaa.zzh(str, "campaign param can't be empty");
        zzlT().zzf(new Runnable(this) {
            final /* synthetic */ zzb c;

            public void run() {
                this.c.zzVY.a(str);
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
    }

    protected void zzkO() {
        this.zzVY.initialize();
    }

    public void zzlI() {
        zzma();
        zzlP();
        zzlT().zzf(new Runnable(this) {
            final /* synthetic */ zzb a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.zzVY.g();
            }
        });
    }

    public void zzlJ() {
        zzma();
        Context context = getContext();
        if (zzaj.zzU(context) && zzak.zzV(context)) {
            Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
            context.startService(intent);
            return;
        }
        zza(null);
    }

    public boolean zzlK() {
        zzma();
        try {
            zzlT().zzc(new Callable<Void>(this) {
                final /* synthetic */ zzb a;

                {
                    this.a = r1;
                }

                public Void a() throws Exception {
                    this.a.zzVY.j();
                    return null;
                }

                public /* synthetic */ Object call() throws Exception {
                    return a();
                }
            }).get(4, TimeUnit.SECONDS);
            return true;
        } catch (InterruptedException e) {
            zzd("syncDispatchLocalHits interrupted", e);
            return false;
        } catch (ExecutionException e2) {
            zze("syncDispatchLocalHits failed", e2);
            return false;
        } catch (TimeoutException e3) {
            zzd("syncDispatchLocalHits timed out", e3);
            return false;
        }
    }

    public void zzlL() {
        zzma();
        zzi.zzkN();
        this.zzVY.e();
    }

    public void zzlM() {
        zzbG("Radio powered up");
        zzlJ();
    }

    void zzlN() {
        zzkN();
        this.zzVY.c();
    }
}
