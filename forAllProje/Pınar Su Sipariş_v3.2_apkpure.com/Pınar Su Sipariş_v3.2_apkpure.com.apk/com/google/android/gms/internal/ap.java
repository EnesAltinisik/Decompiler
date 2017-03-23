package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.util.zze;
import com.google.android.gms.common.util.zzh;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

class ap extends Thread implements ao {
    private static ap d;
    private final LinkedBlockingQueue<Runnable> a = new LinkedBlockingQueue();
    private volatile boolean b = false;
    private volatile boolean c = false;
    private volatile aq e;
    private final Context f;
    private final zze g = zzh.zzuW();

    private ap(Context context) {
        super("GAThread");
        if (context != null) {
            this.f = context.getApplicationContext();
        } else {
            this.f = context;
        }
        start();
    }

    static ap a(Context context) {
        if (d == null) {
            d = new ap(context);
        }
        return d;
    }

    private String a(Throwable th) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        th.printStackTrace(printStream);
        printStream.flush();
        return new String(byteArrayOutputStream.toByteArray());
    }

    public void a(Runnable runnable) {
        this.a.add(runnable);
    }

    void a(String str, long j, String str2, String str3, Map<String, String> map, String str4) {
        final ap apVar = this;
        final long j2 = j;
        final String str5 = str;
        final String str6 = str2;
        final String str7 = str3;
        final Map<String, String> map2 = map;
        final String str8 = str4;
        a(new Runnable(this) {
            final /* synthetic */ ap h;

            public void run() {
                if (this.h.e == null) {
                    zzuz a = zzuz.a();
                    a.a(this.h.f, apVar);
                    this.h.e = a.b();
                }
                this.h.e.a(j2, str5, str6, str7, map2, str8);
            }
        });
    }

    public void a(String str, String str2, String str3, Map<String, String> map, String str4) {
        a(str, this.g.currentTimeMillis(), str2, str3, map, str4);
    }

    public void run() {
        while (!this.c) {
            try {
                Runnable runnable = (Runnable) this.a.take();
                if (!this.b) {
                    runnable.run();
                }
            } catch (InterruptedException e) {
                zzun.zzaV(e.toString());
            } catch (Throwable th) {
                String str = "Error on Google TagManager Thread: ";
                String valueOf = String.valueOf(a(th));
                zzun.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                zzun.e("Google TagManager is shutting down.");
                this.b = true;
            }
        }
    }
}
