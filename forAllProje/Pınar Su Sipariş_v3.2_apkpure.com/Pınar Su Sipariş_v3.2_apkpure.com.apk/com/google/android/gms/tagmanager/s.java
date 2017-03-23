package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;

class s extends Thread implements r {
    private static s d;
    private final LinkedBlockingQueue<Runnable> a = new LinkedBlockingQueue();
    private volatile boolean b = false;
    private volatile boolean c = false;
    private volatile t e;
    private final Context f;

    private s(Context context) {
        super("GAThread");
        if (context != null) {
            this.f = context.getApplicationContext();
        } else {
            this.f = context;
        }
        start();
    }

    static s a(Context context) {
        if (d == null) {
            d = new s(context);
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

    public void a(String str) {
        a(str, System.currentTimeMillis());
    }

    void a(String str, long j) {
        final s sVar = this;
        final long j2 = j;
        final String str2 = str;
        a(new Runnable(this) {
            final /* synthetic */ s d;

            public void run() {
                if (this.d.e == null) {
                    zzdb a = zzdb.a();
                    a.a(this.d.f, sVar);
                    this.d.e = a.b();
                }
                this.d.e.a(j2, str2);
            }
        });
    }

    public void run() {
        while (!this.c) {
            try {
                Runnable runnable = (Runnable) this.a.take();
                if (!this.b) {
                    runnable.run();
                }
            } catch (InterruptedException e) {
                zzbn.zzaV(e.toString());
            } catch (Throwable th) {
                String str = "Error on Google TagManager Thread: ";
                String valueOf = String.valueOf(a(th));
                zzbn.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                zzbn.e("Google TagManager is shutting down.");
                this.b = true;
            }
        }
    }
}
