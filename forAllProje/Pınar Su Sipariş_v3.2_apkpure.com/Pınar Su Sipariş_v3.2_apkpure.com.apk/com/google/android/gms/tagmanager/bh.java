package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzaf.zzj;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class bh implements e {
    private final String a;
    private final Context b;
    private final ScheduledExecutorService c;
    private final a d;
    private ScheduledFuture<?> e;
    private boolean f;
    private ci g;
    private String h;
    private zzbm<zzj> i;

    interface b {
        ScheduledExecutorService a();
    }

    interface a {
        bg a(ci ciVar);
    }

    public bh(Context context, String str, ci ciVar) {
        this(context, str, ciVar, null, null);
    }

    bh(Context context, String str, ci ciVar, b bVar, a aVar) {
        this.g = ciVar;
        this.b = context;
        this.a = str;
        if (bVar == null) {
            bVar = new b(this) {
                final /* synthetic */ bh a;

                {
                    this.a = r1;
                }

                public ScheduledExecutorService a() {
                    return Executors.newSingleThreadScheduledExecutor();
                }
            };
        }
        this.c = bVar.a();
        if (aVar == null) {
            this.d = new a(this) {
                final /* synthetic */ bh a;

                {
                    this.a = r1;
                }

                public bg a(ci ciVar) {
                    return new bg(this.a.b, this.a.a, ciVar);
                }
            };
        } else {
            this.d = aVar;
        }
    }

    private synchronized void a() {
        if (this.f) {
            throw new IllegalStateException("called method after closed");
        }
    }

    private bg b(String str) {
        bg a = this.d.a(this.g);
        a.a(this.i);
        a.a(this.h);
        a.b(str);
        return a;
    }

    public synchronized void a(long j, String str) {
        String str2 = this.a;
        zzbn.v(new StringBuilder(String.valueOf(str2).length() + 55).append("loadAfterDelay: containerId=").append(str2).append(" delay=").append(j).toString());
        a();
        if (this.i == null) {
            throw new IllegalStateException("callback must be set before loadAfterDelay() is called.");
        }
        if (this.e != null) {
            this.e.cancel(false);
        }
        this.e = this.c.schedule(b(str), j, TimeUnit.MILLISECONDS);
    }

    public synchronized void a(zzbm<zzj> com_google_android_gms_tagmanager_zzbm_com_google_android_gms_internal_zzaf_zzj) {
        a();
        this.i = com_google_android_gms_tagmanager_zzbm_com_google_android_gms_internal_zzaf_zzj;
    }

    public synchronized void a(String str) {
        a();
        this.h = str;
    }

    public synchronized void release() {
        a();
        if (this.e != null) {
            this.e.cancel(false);
        }
        this.c.shutdown();
        this.f = true;
    }
}
