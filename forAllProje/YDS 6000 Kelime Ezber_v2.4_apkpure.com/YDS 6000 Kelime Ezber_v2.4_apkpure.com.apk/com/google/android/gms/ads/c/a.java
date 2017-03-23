package com.google.android.gms.ads.c;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.b.mg;
import com.google.android.gms.common.d;
import com.google.android.gms.common.i;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.k;
import com.google.android.gms.common.m;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class a {
    i a;
    mg b;
    boolean c;
    Object d;
    b e;
    final long f;
    private final Context g;

    public static final class a {
        private final String a;
        private final boolean b;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public String a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }

        public String toString() {
            String str = this.a;
            return new StringBuilder(String.valueOf(str).length() + 7).append("{").append(str).append("}").append(this.b).toString();
        }
    }

    static class b extends Thread {
        CountDownLatch a = new CountDownLatch(1);
        boolean b = false;
        private WeakReference<a> c;
        private long d;

        public b(a aVar, long j) {
            this.c = new WeakReference(aVar);
            this.d = j;
            start();
        }

        private void c() {
            a aVar = (a) this.c.get();
            if (aVar != null) {
                aVar.c();
                this.b = true;
            }
        }

        public void a() {
            this.a.countDown();
        }

        public boolean b() {
            return this.b;
        }

        public void run() {
            try {
                if (!this.a.await(this.d, TimeUnit.MILLISECONDS)) {
                    c();
                }
            } catch (InterruptedException e) {
                c();
            }
        }
    }

    public a(Context context) {
        this(context, 30000, false);
    }

    public a(Context context, long j, boolean z) {
        this.d = new Object();
        c.a((Object) context);
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.g = context;
        } else {
            this.g = context;
        }
        this.c = false;
        this.f = j;
    }

    static mg a(Context context, i iVar) {
        try {
            return com.google.android.gms.b.mg.a.a(iVar.a(10000, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            IOException iOException = new IOException(th);
        }
    }

    static i a(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            switch (k.b().a(context)) {
                case 0:
                case 2:
                    ServiceConnection iVar = new i();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (com.google.android.gms.common.a.a.a().a(context, intent, iVar, 1)) {
                            return iVar;
                        }
                        throw new IOException("Connection failure");
                    } catch (Throwable th) {
                        IOException iOException = new IOException(th);
                    }
                default:
                    throw new IOException("Google Play services not available");
            }
        } catch (NameNotFoundException e) {
            throw new d(9);
        }
    }

    private void a(a aVar, boolean z, float f, Throwable th) {
        if (Math.random() <= ((double) f)) {
            final String uri = a(aVar, z, th).toString();
            new Thread(this) {
                public void run() {
                    new b().a(uri);
                }
            }.start();
        }
    }

    public static a b(Context context) {
        float f = 0.0f;
        boolean z = false;
        try {
            Context g = m.g(context);
            if (g != null) {
                SharedPreferences sharedPreferences = g.getSharedPreferences("google_ads_flags", 1);
                z = sharedPreferences.getBoolean("gads:ad_id_app_context:enabled", false);
                f = sharedPreferences.getFloat("gads:ad_id_app_context:ping_ratio", 0.0f);
            }
        } catch (Throwable e) {
            Log.w("AdvertisingIdClient", "Error while reading from SharedPreferences ", e);
        }
        a aVar = new a(context, -1, z);
        a b;
        try {
            aVar.a(false);
            b = aVar.b();
            aVar.a(b, z, f, null);
            return b;
        } catch (Throwable th) {
            b = th;
            aVar.a(null, z, f, b);
            return null;
        } finally {
            aVar.c();
        }
    }

    public static void b(boolean z) {
    }

    private void d() {
        synchronized (this.d) {
            if (this.e != null) {
                this.e.a();
                try {
                    this.e.join();
                } catch (InterruptedException e) {
                }
            }
            if (this.f > 0) {
                this.e = new b(this, this.f);
            }
        }
    }

    Uri a(a aVar, boolean z, Throwable th) {
        Bundle bundle = new Bundle();
        bundle.putString("app_context", z ? "1" : "0");
        if (aVar != null) {
            bundle.putString("limit_ad_tracking", aVar.b() ? "1" : "0");
        }
        if (!(aVar == null || aVar.a() == null)) {
            bundle.putString("ad_id_size", Integer.toString(aVar.a().length()));
        }
        if (th != null) {
            bundle.putString("error", th.getClass().getName());
        }
        Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : bundle.keySet()) {
            buildUpon.appendQueryParameter(str, bundle.getString(str));
        }
        return buildUpon.build();
    }

    public void a() {
        a(true);
    }

    protected void a(boolean z) {
        c.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.c) {
                c();
            }
            this.a = a(this.g);
            this.b = a(this.g, this.a);
            this.c = true;
            if (z) {
                d();
            }
        }
    }

    public a b() {
        a aVar;
        c.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.c) {
                synchronized (this.d) {
                    if (this.e == null || !this.e.b()) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    a(false);
                    if (!this.c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Throwable e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Throwable e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            c.a(this.a);
            c.a(this.b);
            aVar = new a(this.b.a(), this.b.a(true));
        }
        d();
        return aVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c() {
        /*
        r3 = this;
        r0 = "Calling this from your main thread can lead to deadlock";
        com.google.android.gms.common.internal.c.c(r0);
        monitor-enter(r3);
        r0 = r3.g;	 Catch:{ all -> 0x002a }
        if (r0 == 0) goto L_0x000e;
    L_0x000a:
        r0 = r3.a;	 Catch:{ all -> 0x002a }
        if (r0 != 0) goto L_0x0010;
    L_0x000e:
        monitor-exit(r3);	 Catch:{ all -> 0x002a }
    L_0x000f:
        return;
    L_0x0010:
        r0 = r3.c;	 Catch:{ IllegalArgumentException -> 0x002d, Throwable -> 0x0036 }
        if (r0 == 0) goto L_0x001f;
    L_0x0014:
        r0 = com.google.android.gms.common.a.a.a();	 Catch:{ IllegalArgumentException -> 0x002d, Throwable -> 0x0036 }
        r1 = r3.g;	 Catch:{ IllegalArgumentException -> 0x002d, Throwable -> 0x0036 }
        r2 = r3.a;	 Catch:{ IllegalArgumentException -> 0x002d, Throwable -> 0x0036 }
        r0.a(r1, r2);	 Catch:{ IllegalArgumentException -> 0x002d, Throwable -> 0x0036 }
    L_0x001f:
        r0 = 0;
        r3.c = r0;	 Catch:{ all -> 0x002a }
        r0 = 0;
        r3.b = r0;	 Catch:{ all -> 0x002a }
        r0 = 0;
        r3.a = r0;	 Catch:{ all -> 0x002a }
        monitor-exit(r3);	 Catch:{ all -> 0x002a }
        goto L_0x000f;
    L_0x002a:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x002a }
        throw r0;
    L_0x002d:
        r0 = move-exception;
        r1 = "AdvertisingIdClient";
        r2 = "AdvertisingIdClient unbindService failed.";
        android.util.Log.i(r1, r2, r0);	 Catch:{ all -> 0x002a }
        goto L_0x001f;
    L_0x0036:
        r0 = move-exception;
        r1 = "AdvertisingIdClient";
        r2 = "AdvertisingIdClient unbindService failed.";
        android.util.Log.i(r1, r2, r0);	 Catch:{ all -> 0x002a }
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.c.a.c():void");
    }

    protected void finalize() {
        c();
        super.finalize();
    }
}
