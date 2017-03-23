package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.b.kw;
import com.google.android.gms.b.kx;
import com.google.android.gms.b.ky;
import com.google.android.gms.c.d;
import com.google.android.gms.c.f;
import com.google.android.gms.common.util.k;
import com.google.android.gms.common.util.l;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class b {
    static final Map<String, b> a = new android.support.v4.i.a();
    private static final List<String> b = Arrays.asList(new String[]{"com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId"});
    private static final List<String> c = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");
    private static final List<String> d = Arrays.asList(new String[]{"com.google.android.gms.measurement.AppMeasurement"});
    private static final List<String> e = Arrays.asList(new String[0]);
    private static final Set<String> f = Collections.emptySet();
    private static final Object g = new Object();
    private final Context h;
    private final String i;
    private final d j;
    private final AtomicBoolean k = new AtomicBoolean(false);
    private final AtomicBoolean l = new AtomicBoolean();
    private final List<a> m = new CopyOnWriteArrayList();
    private final List<b> n = new CopyOnWriteArrayList();
    private final List<Object> o = new CopyOnWriteArrayList();
    private ky p;

    public interface a {
    }

    public interface b {
        void a(boolean z);
    }

    @TargetApi(24)
    private static class c extends BroadcastReceiver {
        private static AtomicReference<c> a = new AtomicReference();
        private final Context b;

        public c(Context context) {
            this.b = context;
        }

        private static void b(Context context) {
            if (a.get() == null) {
                BroadcastReceiver cVar = new c(context);
                if (a.compareAndSet(null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void a() {
            this.b.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (b.g) {
                for (b a : b.a.values()) {
                    a.h();
                }
            }
            a();
        }
    }

    protected b(Context context, String str, d dVar) {
        this.h = (Context) com.google.android.gms.common.internal.c.a((Object) context);
        this.i = com.google.android.gms.common.internal.c.a(str);
        this.j = (d) com.google.android.gms.common.internal.c.a((Object) dVar);
    }

    public static b a(Context context) {
        b d;
        synchronized (g) {
            if (a.containsKey("[DEFAULT]")) {
                d = d();
            } else {
                d a = d.a(context);
                if (a == null) {
                    d = null;
                } else {
                    d = a(context, a);
                }
            }
        }
        return d;
    }

    public static b a(Context context, d dVar) {
        return a(context, dVar, "[DEFAULT]");
    }

    public static b a(Context context, d dVar, String str) {
        Object bVar;
        kx a = kx.a(context);
        b(context);
        String a2 = a(str);
        if (context.getApplicationContext() != null) {
            Object applicationContext = context.getApplicationContext();
        }
        synchronized (g) {
            com.google.android.gms.common.internal.c.a(!a.containsKey(a2), new StringBuilder(String.valueOf(a2).length() + 33).append("FirebaseApp name ").append(a2).append(" already exists!").toString());
            com.google.android.gms.common.internal.c.a(applicationContext, (Object) "Application context cannot be null.");
            bVar = new b(applicationContext, a2, dVar);
            a.put(a2, bVar);
        }
        a.a((b) bVar);
        bVar.a(b.class, bVar, b);
        if (bVar.e()) {
            bVar.a(b.class, bVar, c);
            bVar.a(Context.class, bVar.a(), d);
        }
        return bVar;
    }

    private static String a(String str) {
        return str.trim();
    }

    private <T> void a(Class<T> cls, T t, Iterable<String> iterable) {
        String valueOf;
        boolean a = android.support.v4.c.a.a(this.h);
        if (a) {
            c.b(this.h);
        }
        for (String valueOf2 : iterable) {
            if (a) {
                try {
                    if (!e.contains(valueOf2)) {
                    }
                } catch (ClassNotFoundException e) {
                    if (f.contains(valueOf2)) {
                        throw new IllegalStateException(String.valueOf(valueOf2).concat(" is missing, but is required. Check if it has been removed by Proguard."));
                    }
                    Log.d("FirebaseApp", String.valueOf(valueOf2).concat(" is not linked. Skipping initialization."));
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException(String.valueOf(valueOf2).concat("#getInstance has been removed by Proguard. Add keep rule to prevent it."));
                } catch (Throwable e3) {
                    Log.wtf("FirebaseApp", "Firebase API initialization failure.", e3);
                } catch (Throwable e4) {
                    String str = "FirebaseApp";
                    String str2 = "Failed to initialize ";
                    valueOf2 = String.valueOf(valueOf2);
                    Log.wtf(str, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e4);
                }
            }
            Method method = Class.forName(valueOf2).getMethod("getInstance", new Class[]{cls});
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke(null, new Object[]{t});
            }
        }
    }

    public static void a(boolean z) {
        synchronized (g) {
            Iterator it = new ArrayList(a.values()).iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar.k.get()) {
                    bVar.c(z);
                }
            }
        }
    }

    @TargetApi(14)
    private static void b(Context context) {
        if (k.c() && (context.getApplicationContext() instanceof Application)) {
            kw.a((Application) context.getApplicationContext());
        }
    }

    private void c(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (b a : this.n) {
            a.a(z);
        }
    }

    public static b d() {
        b bVar;
        synchronized (g) {
            bVar = (b) a.get("[DEFAULT]");
            if (bVar == null) {
                String valueOf = String.valueOf(l.a());
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 116).append("Default FirebaseApp is not initialized in this process ").append(valueOf).append(". Make sure to call FirebaseApp.initializeApp(Context) first.").toString());
            }
        }
        return bVar;
    }

    private void g() {
        com.google.android.gms.common.internal.c.a(!this.l.get(), (Object) "FirebaseApp was deleted");
    }

    private void h() {
        a(b.class, (Object) this, b);
        if (e()) {
            a(b.class, (Object) this, c);
            a(Context.class, this.h, d);
        }
    }

    public Context a() {
        g();
        return this.h;
    }

    public void a(a aVar) {
        g();
        com.google.android.gms.common.internal.c.a((Object) aVar);
        this.m.add(aVar);
    }

    public void a(b bVar) {
        g();
        if (this.k.get() && kw.a().b()) {
            bVar.a(true);
        }
        this.n.add(bVar);
    }

    public d<com.google.firebase.b.a> b(boolean z) {
        g();
        return this.p == null ? f.a(new a("firebase-auth is not linked, please fall back to unauthenticated mode.")) : this.p.a(z);
    }

    public String b() {
        g();
        return this.i;
    }

    public d c() {
        g();
        return this.j;
    }

    public boolean e() {
        return "[DEFAULT]".equals(b());
    }

    public boolean equals(Object obj) {
        return !(obj instanceof b) ? false : this.i.equals(((b) obj).b());
    }

    public int hashCode() {
        return this.i.hashCode();
    }

    public String toString() {
        return com.google.android.gms.common.internal.b.a((Object) this).a("name", this.i).a("options", this.j).toString();
    }
}
