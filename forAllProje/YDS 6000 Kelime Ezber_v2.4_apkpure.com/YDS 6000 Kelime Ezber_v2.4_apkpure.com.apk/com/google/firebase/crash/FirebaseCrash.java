package com.google.firebase.crash;

import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.android.gms.b.fa;
import com.google.android.gms.b.fb;
import com.google.android.gms.b.fc;
import com.google.android.gms.b.fe;
import com.google.android.gms.b.ff;
import com.google.android.gms.b.fg;
import com.google.android.gms.b.fh;
import com.google.firebase.b;
import com.google.firebase.iid.c;

public class FirebaseCrash {
    private static final String a = FirebaseCrash.class.getSimpleName();
    private static volatile FirebaseCrash e;
    private boolean b;
    private fe c;
    private fa d;

    FirebaseCrash(b bVar, boolean z) {
        this.b = z;
        Object a = bVar.a();
        if (a == null) {
            Log.w(a, "Application context is missing, disabling api");
            this.b = false;
        }
        if (this.b) {
            try {
                fc fcVar = new fc(bVar.c().b(), bVar.c().a());
                ff.a().a(a);
                this.c = ff.a().b();
                this.c.a(com.google.android.gms.a.b.a(a), fcVar);
                this.d = new fa(a);
                f();
                String str = a;
                String str2 = "FirebaseCrash reporting initialized ";
                String valueOf = String.valueOf(ff.a().toString());
                Log.i(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                return;
            } catch (Exception e) {
                str = a;
                str2 = "Failed to initialize crash reporting: ";
                valueOf = String.valueOf(e.getMessage());
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                this.b = false;
                return;
            }
        }
        Log.i(a, "Crash reporting is disabled");
    }

    public static FirebaseCrash a() {
        if (e == null) {
            synchronized (FirebaseCrash.class) {
                if (e == null) {
                    e = getInstance(b.d());
                }
            }
        }
        return e;
    }

    public static void a(String str) {
        try {
            a().b(str);
        } catch (fb e) {
            Log.v(a, e.getMessage());
        }
    }

    public static void a(String str, long j, Bundle bundle) {
        try {
            a().b(str, j, bundle);
        } catch (fb e) {
            Log.v(a, e.getMessage());
        }
    }

    private void b() {
        if (d()) {
            this.d.a();
            return;
        }
        throw new fb("Firebase Crash Reporting is disabled.");
    }

    private fe c() {
        return this.c;
    }

    private boolean d() {
        return this.b;
    }

    private static boolean e() {
        return Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId();
    }

    private void f() {
        if (e()) {
            Thread.setDefaultUncaughtExceptionHandler(new fg(Thread.getDefaultUncaughtExceptionHandler(), this));
            return;
        }
        throw new RuntimeException("FirebaseCrash reporting may only be initialized on the main thread (preferably in your app's Application.onCreate)");
    }

    private String g() {
        return c.a().b();
    }

    @Keep
    @Deprecated
    public static FirebaseCrash getInstance(b bVar) {
        fh.a(bVar.a());
        FirebaseCrash firebaseCrash = new FirebaseCrash(bVar, ((Boolean) fh.a.c()).booleanValue());
        synchronized (FirebaseCrash.class) {
            if (e == null) {
                e = firebaseCrash;
                try {
                    e.b();
                } catch (fb e) {
                    Log.d(a, "Cannot register Firebase Analytics listener since Firebase Crash Reporting is not enabled");
                }
            }
        }
        return firebaseCrash;
    }

    public void a(Throwable th) {
        if (d()) {
            fe c = c();
            if (c != null && th != null) {
                try {
                    this.d.a(true, System.currentTimeMillis());
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    c.b(g());
                    c.b(com.google.android.gms.a.b.a((Object) th));
                    return;
                } catch (Throwable e2) {
                    Log.e(a, "report remoting failed", e2);
                    return;
                }
            }
            return;
        }
        throw new fb("Firebase Crash Reporting is disabled.");
    }

    public void b(String str) {
        if (d()) {
            fe c = c();
            if (c != null && str != null) {
                try {
                    c.a(str);
                    return;
                } catch (Throwable e) {
                    Log.e(a, "log remoting failed", e);
                    return;
                }
            }
            return;
        }
        throw new fb("Firebase Crash Reporting is disabled.");
    }

    public void b(String str, long j, Bundle bundle) {
        if (d()) {
            fe c = c();
            if (c != null && str != null) {
                try {
                    c.a(str, j, bundle);
                    return;
                } catch (Throwable e) {
                    Log.e(a, "log remoting failed", e);
                    return;
                }
            }
            return;
        }
        throw new fb("Firebase Crash Reporting is disabled.");
    }
}
