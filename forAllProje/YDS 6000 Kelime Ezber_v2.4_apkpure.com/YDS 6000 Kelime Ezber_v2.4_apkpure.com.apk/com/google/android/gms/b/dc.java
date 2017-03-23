package com.google.android.gms.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.o.b;
import com.google.android.gms.common.internal.o.c;
import com.google.android.gms.common.k;
import com.google.android.gms.measurement.AppMeasurement.f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class dc extends cy {
    private final a a;
    private ck b;
    private Boolean c;
    private final ca d;
    private final df e;
    private final List<Runnable> f = new ArrayList();
    private final ca g;

    protected class a implements ServiceConnection, b, c {
        final /* synthetic */ dc a;
        private volatile boolean b;
        private volatile cn c;

        protected a(dc dcVar) {
            this.a = dcVar;
        }

        public void a() {
            this.a.e();
            Context n = this.a.n();
            synchronized (this) {
                if (this.b) {
                    this.a.u().D().a("Connection attempt already in progress");
                } else if (this.c != null) {
                    this.a.u().D().a("Already awaiting connection attempt");
                } else {
                    this.c = new cn(n, Looper.getMainLooper(), this, this);
                    this.a.u().D().a("Connecting to remote service");
                    this.b = true;
                    this.c.n();
                }
            }
        }

        public void a(int i) {
            com.google.android.gms.common.internal.c.b("MeasurementServiceConnection.onConnectionSuspended");
            this.a.u().C().a("Service connection suspended");
            this.a.t().a(new Runnable(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public void run() {
                    dc dcVar = this.a.a;
                    Context n = this.a.a.n();
                    this.a.a.w().R();
                    dcVar.a(new ComponentName(n, "com.google.android.gms.measurement.AppMeasurementService"));
                }
            });
        }

        public void a(Intent intent) {
            this.a.e();
            Context n = this.a.n();
            com.google.android.gms.common.a.a a = com.google.android.gms.common.a.a.a();
            synchronized (this) {
                if (this.b) {
                    this.a.u().D().a("Connection attempt already in progress");
                    return;
                }
                this.b = true;
                a.a(n, intent, this.a.a, 129);
            }
        }

        public void a(Bundle bundle) {
            com.google.android.gms.common.internal.c.b("MeasurementServiceConnection.onConnected");
            synchronized (this) {
                try {
                    final ck ckVar = (ck) this.c.u();
                    this.c = null;
                    this.a.t().a(new Runnable(this) {
                        final /* synthetic */ a b;

                        public void run() {
                            synchronized (this.b) {
                                this.b.b = false;
                                if (!this.b.a.x()) {
                                    this.b.a.u().C().a("Connected to remote service");
                                    this.b.a.a(ckVar);
                                }
                            }
                        }
                    });
                } catch (DeadObjectException e) {
                    this.c = null;
                    this.b = false;
                } catch (IllegalStateException e2) {
                    this.c = null;
                    this.b = false;
                }
            }
        }

        public void a(com.google.android.gms.common.a aVar) {
            com.google.android.gms.common.internal.c.b("MeasurementServiceConnection.onConnectionFailed");
            co g = this.a.n.g();
            if (g != null) {
                g.z().a("Service connection failed", aVar);
            }
            synchronized (this) {
                this.b = false;
                this.c = null;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.google.android.gms.common.internal.c.b("MeasurementServiceConnection.onServiceConnected");
            synchronized (this) {
                if (iBinder == null) {
                    this.b = false;
                    this.a.u().x().a("Service connected with null binder");
                    return;
                }
                ck ckVar = null;
                try {
                    String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                    if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                        ckVar = com.google.android.gms.b.ck.a.a(iBinder);
                        this.a.u().D().a("Bound to IMeasurementService interface");
                    } else {
                        this.a.u().x().a("Got binder with a wrong descriptor", interfaceDescriptor);
                    }
                } catch (RemoteException e) {
                    this.a.u().x().a("Service connect failed to get IMeasurementService");
                }
                if (ckVar == null) {
                    this.b = false;
                    try {
                        com.google.android.gms.common.a.a.a().a(this.a.n(), this.a.a);
                    } catch (IllegalArgumentException e2) {
                    }
                } else {
                    this.a.t().a(new Runnable(this) {
                        final /* synthetic */ a b;

                        public void run() {
                            synchronized (this.b) {
                                this.b.b = false;
                                if (!this.b.a.x()) {
                                    this.b.a.u().D().a("Connected to service");
                                    this.b.a.a(ckVar);
                                }
                            }
                        }
                    });
                }
            }
        }

        public void onServiceDisconnected(final ComponentName componentName) {
            com.google.android.gms.common.internal.c.b("MeasurementServiceConnection.onServiceDisconnected");
            this.a.u().C().a("Service disconnected");
            this.a.t().a(new Runnable(this) {
                final /* synthetic */ a b;

                public void run() {
                    this.b.a.a(componentName);
                }
            });
        }
    }

    protected dc(cv cvVar) {
        super(cvVar);
        this.e = new df(cvVar.t());
        this.a = new a(this);
        this.d = new ca(this, cvVar) {
            final /* synthetic */ dc a;

            public void a() {
                this.a.F();
            }
        };
        this.g = new ca(this, cvVar) {
            final /* synthetic */ dc a;

            public void a() {
                this.a.u().z().a("Tasks have been queued for a long time");
            }
        };
    }

    private void D() {
        e();
        this.e.a();
        this.d.a(w().N());
    }

    private boolean E() {
        w().R();
        List queryIntentServices = n().getPackageManager().queryIntentServices(new Intent().setClassName(n(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        return queryIntentServices != null && queryIntentServices.size() > 0;
    }

    private void F() {
        e();
        if (x()) {
            u().D().a("Inactivity, disconnecting from the service");
            C();
        }
    }

    private void G() {
        e();
        A();
    }

    private void H() {
        e();
        u().D().a("Processing queued up service tasks", Integer.valueOf(this.f.size()));
        for (Runnable a : this.f) {
            t().a(a);
        }
        this.f.clear();
        this.g.c();
    }

    private void a(ComponentName componentName) {
        e();
        if (this.b != null) {
            this.b = null;
            u().D().a("Disconnected from device MeasurementService", componentName);
            G();
        }
    }

    private void a(ck ckVar) {
        e();
        com.google.android.gms.common.internal.c.a((Object) ckVar);
        this.b = ckVar;
        D();
        H();
    }

    private void a(Runnable runnable) {
        e();
        if (x()) {
            runnable.run();
        } else if (((long) this.f.size()) >= w().Z()) {
            u().x().a("Discarding data. Max runnable queue size reached");
        } else {
            this.f.add(runnable);
            this.g.a(60000);
            A();
        }
    }

    void A() {
        e();
        Q();
        if (!x()) {
            if (this.c == null) {
                this.c = v().B();
                if (this.c == null) {
                    u().D().a("State of service unknown");
                    this.c = Boolean.valueOf(B());
                    v().a(this.c.booleanValue());
                }
            }
            if (this.c.booleanValue()) {
                u().D().a("Using measurement service");
                this.a.a();
            } else if (E()) {
                u().D().a("Using local app measurement service");
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context n = n();
                w().R();
                intent.setComponent(new ComponentName(n, "com.google.android.gms.measurement.AppMeasurementService"));
                this.a.a(intent);
            } else {
                u().x().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
        }
    }

    protected boolean B() {
        e();
        Q();
        w().R();
        u().D().a("Checking service availability");
        switch (k.b().a(n())) {
            case 0:
                u().D().a("Service available");
                return true;
            case 1:
                u().D().a("Service missing");
                return false;
            case 2:
                u().C().a("Service container out of date");
                return true;
            case 3:
                u().z().a("Service disabled");
                return false;
            case 9:
                u().z().a("Service invalid");
                return false;
            case 18:
                u().z().a("Service updating");
                return true;
            default:
                return false;
        }
    }

    public void C() {
        e();
        Q();
        try {
            com.google.android.gms.common.a.a.a().a(n(), this.a);
        } catch (IllegalStateException e) {
        } catch (IllegalArgumentException e2) {
        }
        this.b = null;
    }

    protected void a() {
    }

    protected void a(ch chVar, String str) {
        boolean z;
        boolean z2 = true;
        com.google.android.gms.common.internal.c.a((Object) chVar);
        e();
        Q();
        if (VERSION.SDK_INT >= 11) {
            w().R();
            z = true;
        } else {
            z = false;
        }
        if (!(z && o().a(chVar))) {
            z2 = false;
        }
        final ch chVar2 = chVar;
        final String str2 = str;
        a(new Runnable(this) {
            final /* synthetic */ dc e;

            public void run() {
                ck c = this.e.b;
                if (c == null) {
                    this.e.u().x().a("Discarding data. Failed to send event to service");
                    return;
                }
                if (z) {
                    this.e.a(c, z2 ? null : chVar2);
                } else {
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            c.a(chVar2, this.e.i().a(this.e.u().E()));
                        } else {
                            c.a(chVar2, str2, this.e.u().E());
                        }
                    } catch (RemoteException e) {
                        this.e.u().x().a("Failed to send event to the service", e);
                    }
                }
                this.e.D();
            }
        });
    }

    void a(ck ckVar, com.google.android.gms.common.internal.safeparcel.a aVar) {
        Object obj;
        e();
        c();
        Q();
        if (VERSION.SDK_INT >= 11) {
            w().R();
            obj = 1;
        } else {
            obj = null;
        }
        List<com.google.android.gms.common.internal.safeparcel.a> arrayList = new ArrayList();
        w().ad();
        int i = 100;
        for (int i2 = 0; i2 < 1001 && r3 == 100; i2++) {
            if (obj != null) {
                Object a = o().a(100);
                if (a != null) {
                    arrayList.addAll(a);
                    i = a.size();
                    if (aVar != null && r3 < 100) {
                        arrayList.add(aVar);
                    }
                    for (com.google.android.gms.common.internal.safeparcel.a aVar2 : arrayList) {
                        if (aVar2 instanceof ch) {
                            try {
                                ckVar.a((ch) aVar2, i().a(u().E()));
                            } catch (RemoteException e) {
                                u().x().a("Failed to send event to the service", e);
                            }
                        } else if (aVar2 instanceof di) {
                            u().x().a("Discarding data. Unrecognized parcel type.");
                        } else {
                            try {
                                ckVar.a((di) aVar2, i().a(u().E()));
                            } catch (RemoteException e2) {
                                u().x().a("Failed to send attribute to the service", e2);
                            }
                        }
                    }
                }
            }
            i = 0;
            arrayList.add(aVar);
            for (com.google.android.gms.common.internal.safeparcel.a aVar22 : arrayList) {
                if (aVar22 instanceof ch) {
                    ckVar.a((ch) aVar22, i().a(u().E()));
                } else if (aVar22 instanceof di) {
                    u().x().a("Discarding data. Unrecognized parcel type.");
                } else {
                    ckVar.a((di) aVar22, i().a(u().E()));
                }
            }
        }
    }

    protected void a(final di diVar) {
        boolean z;
        boolean z2 = true;
        e();
        Q();
        if (VERSION.SDK_INT >= 11) {
            w().R();
            z = true;
        } else {
            z = false;
        }
        if (!(z && o().a(diVar))) {
            z2 = false;
        }
        a(new Runnable(this) {
            final /* synthetic */ dc c;

            public void run() {
                ck c = this.c.b;
                if (c == null) {
                    this.c.u().x().a("Discarding data. Failed to set user attribute");
                    return;
                }
                this.c.a(c, z2 ? null : diVar);
                this.c.D();
            }
        });
    }

    protected void a(final f fVar) {
        e();
        Q();
        a(new Runnable(this) {
            final /* synthetic */ dc b;

            public void run() {
                ck c = this.b.b;
                if (c == null) {
                    this.b.u().x().a("Failed to send current screen to service");
                    return;
                }
                try {
                    if (fVar == null) {
                        c.a(0, null, null, this.b.n().getPackageName());
                    } else {
                        c.a(fVar.d, fVar.b, fVar.c, this.b.n().getPackageName());
                    }
                    this.b.D();
                } catch (RemoteException e) {
                    this.b.u().x().a("Failed to send current screen to the service", e);
                }
            }
        });
    }

    public void a(final AtomicReference<String> atomicReference) {
        e();
        Q();
        a(new Runnable(this) {
            final /* synthetic */ dc b;

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                r5 = this;
                r1 = r2;
                monitor-enter(r1);
                r0 = r5.b;	 Catch:{ RemoteException -> 0x0044 }
                r0 = r0.b;	 Catch:{ RemoteException -> 0x0044 }
                if (r0 != 0) goto L_0x0021;
            L_0x000b:
                r0 = r5.b;	 Catch:{ RemoteException -> 0x0044 }
                r0 = r0.u();	 Catch:{ RemoteException -> 0x0044 }
                r0 = r0.x();	 Catch:{ RemoteException -> 0x0044 }
                r2 = "Failed to get app instance id";
                r0.a(r2);	 Catch:{ RemoteException -> 0x0044 }
                r0 = r2;	 Catch:{ all -> 0x0041 }
                r0.notify();	 Catch:{ all -> 0x0041 }
                monitor-exit(r1);	 Catch:{ all -> 0x0041 }
            L_0x0020:
                return;
            L_0x0021:
                r2 = r2;	 Catch:{ RemoteException -> 0x0044 }
                r3 = r5.b;	 Catch:{ RemoteException -> 0x0044 }
                r3 = r3.i();	 Catch:{ RemoteException -> 0x0044 }
                r4 = 0;
                r3 = r3.a(r4);	 Catch:{ RemoteException -> 0x0044 }
                r0 = r0.c(r3);	 Catch:{ RemoteException -> 0x0044 }
                r2.set(r0);	 Catch:{ RemoteException -> 0x0044 }
                r0 = r5.b;	 Catch:{ RemoteException -> 0x0044 }
                r0.D();	 Catch:{ RemoteException -> 0x0044 }
                r0 = r2;	 Catch:{ all -> 0x0041 }
                r0.notify();	 Catch:{ all -> 0x0041 }
            L_0x003f:
                monitor-exit(r1);	 Catch:{ all -> 0x0041 }
                goto L_0x0020;
            L_0x0041:
                r0 = move-exception;
                monitor-exit(r1);	 Catch:{ all -> 0x0041 }
                throw r0;
            L_0x0044:
                r0 = move-exception;
                r2 = r5.b;	 Catch:{ all -> 0x005a }
                r2 = r2.u();	 Catch:{ all -> 0x005a }
                r2 = r2.x();	 Catch:{ all -> 0x005a }
                r3 = "Failed to get app instance id";
                r2.a(r3, r0);	 Catch:{ all -> 0x005a }
                r0 = r2;	 Catch:{ all -> 0x0041 }
                r0.notify();	 Catch:{ all -> 0x0041 }
                goto L_0x003f;
            L_0x005a:
                r0 = move-exception;
                r2 = r2;	 Catch:{ all -> 0x0041 }
                r2.notify();	 Catch:{ all -> 0x0041 }
                throw r0;	 Catch:{ all -> 0x0041 }
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.dc.6.run():void");
            }
        });
    }

    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    public /* bridge */ /* synthetic */ bt f() {
        return super.f();
    }

    public /* bridge */ /* synthetic */ bx g() {
        return super.g();
    }

    public /* bridge */ /* synthetic */ da h() {
        return super.h();
    }

    public /* bridge */ /* synthetic */ cl i() {
        return super.i();
    }

    public /* bridge */ /* synthetic */ cb j() {
        return super.j();
    }

    public /* bridge */ /* synthetic */ dc k() {
        return super.k();
    }

    public /* bridge */ /* synthetic */ db l() {
        return super.l();
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.common.util.c m() {
        return super.m();
    }

    public /* bridge */ /* synthetic */ Context n() {
        return super.n();
    }

    public /* bridge */ /* synthetic */ cm o() {
        return super.o();
    }

    public /* bridge */ /* synthetic */ bz p() {
        return super.p();
    }

    public /* bridge */ /* synthetic */ dl q() {
        return super.q();
    }

    public /* bridge */ /* synthetic */ ct r() {
        return super.r();
    }

    public /* bridge */ /* synthetic */ de s() {
        return super.s();
    }

    public /* bridge */ /* synthetic */ cu t() {
        return super.t();
    }

    public /* bridge */ /* synthetic */ co u() {
        return super.u();
    }

    public /* bridge */ /* synthetic */ cr v() {
        return super.v();
    }

    public /* bridge */ /* synthetic */ by w() {
        return super.w();
    }

    public boolean x() {
        e();
        Q();
        return this.b != null;
    }

    protected void y() {
        e();
        Q();
        a(new Runnable(this) {
            final /* synthetic */ dc a;

            {
                this.a = r1;
            }

            public void run() {
                ck c = this.a.b;
                if (c == null) {
                    this.a.u().x().a("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    c.b(this.a.i().a(this.a.u().E()));
                    this.a.D();
                } catch (RemoteException e) {
                    this.a.u().x().a("Failed to send measurementEnabled to the service", e);
                }
            }
        });
    }

    protected void z() {
        e();
        Q();
        a(new Runnable(this) {
            final /* synthetic */ dc a;

            {
                this.a = r1;
            }

            public void run() {
                ck c = this.a.b;
                if (c == null) {
                    this.a.u().x().a("Discarding data. Failed to send app launch");
                    return;
                }
                try {
                    this.a.a(c, null);
                    c.a(this.a.i().a(this.a.u().E()));
                    this.a.D();
                } catch (RemoteException e) {
                    this.a.u().x().a("Failed to send app launch to the service", e);
                }
            }
        });
    }
}
