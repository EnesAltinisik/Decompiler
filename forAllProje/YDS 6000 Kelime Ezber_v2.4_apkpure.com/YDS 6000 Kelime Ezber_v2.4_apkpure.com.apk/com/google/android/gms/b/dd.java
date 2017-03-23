package com.google.android.gms.b;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.internal.c;

public final class dd {
    private final Handler a = new Handler();
    private final Context b;
    private final a c;

    public interface a {
        Context a();

        boolean a(int i);
    }

    public dd(a aVar) {
        this.b = aVar.a();
        c.a(this.b);
        this.c = aVar;
    }

    public static boolean a(Context context, boolean z) {
        c.a((Object) context);
        return dl.a(context, z ? "com.google.android.gms.measurement.PackageMeasurementService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    private co c() {
        return cv.a(this.b).f();
    }

    public int a(Intent intent, int i, final int i2) {
        final cv a = cv.a(this.b);
        final co f = a.f();
        if (intent == null) {
            f.z().a("AppMeasurementService started with null intent");
        } else {
            String action = intent.getAction();
            a.d().R();
            f.D().a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                a.h().a(new Runnable(this) {
                    final /* synthetic */ dd d;

                    public void run() {
                        a.N();
                        a.L();
                        this.d.a.post(new Runnable(this) {
                            final /* synthetic */ AnonymousClass1 a;

                            {
                                this.a = r1;
                            }

                            public void run() {
                                if (this.a.d.c.a(i2)) {
                                    a.d().R();
                                    f.D().a("Local AppMeasurementService processed last upload request");
                                }
                            }
                        });
                    }
                });
            }
        }
        return 2;
    }

    public IBinder a(Intent intent) {
        if (intent == null) {
            c().x().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new cw(cv.a(this.b));
        }
        c().z().a("onBind received unknown action", action);
        return null;
    }

    public void a() {
        cv a = cv.a(this.b);
        co f = a.f();
        a.d().R();
        f.D().a("Local AppMeasurementService is starting up");
    }

    public void b() {
        cv a = cv.a(this.b);
        co f = a.f();
        a.d().R();
        f.D().a("Local AppMeasurementService is shutting down");
    }

    public boolean b(Intent intent) {
        if (intent == null) {
            c().x().a("onUnbind called with null intent");
        } else {
            c().D().a("onUnbind called for intent. action", intent.getAction());
        }
        return true;
    }

    public void c(Intent intent) {
        if (intent == null) {
            c().x().a("onRebind called with null intent");
            return;
        }
        c().D().a("onRebind called. action", intent.getAction());
    }
}
