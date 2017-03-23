package com.google.firebase.database;

import com.google.android.gms.b.gr;
import com.google.android.gms.b.gx;
import com.google.android.gms.b.gz;
import com.google.android.gms.b.ha;
import com.google.android.gms.b.hb;
import com.google.android.gms.b.ks;
import com.google.android.gms.b.kt;
import com.google.firebase.b;
import java.util.HashMap;
import java.util.Map;

public class f {
    private static final Map<String, f> a = new HashMap();
    private final b b;
    private final ha c;
    private final gr d;
    private gz e;

    private f(b bVar, ha haVar, gr grVar) {
        this.b = bVar;
        this.c = haVar;
        this.d = grVar;
    }

    public static f a() {
        return a(b.d());
    }

    public static synchronized f a(b bVar) {
        f fVar;
        synchronized (f.class) {
            if (!a.containsKey(bVar.b())) {
                String c = bVar.c().c();
                if (c == null) {
                    throw new c("Failed to get FirebaseDatabase instance: FirebaseApp object has no DatabaseURL in its FirebaseOptions object.");
                }
                ks a = kt.a(c);
                if (a.b.h()) {
                    gr grVar = new gr();
                    if (!bVar.e()) {
                        grVar.c(bVar.b());
                    }
                    grVar.a(bVar);
                    a.put(bVar.b(), new f(bVar, a.a, grVar));
                } else {
                    String valueOf = String.valueOf(a.b.toString());
                    throw new c(new StringBuilder((String.valueOf(c).length() + 114) + String.valueOf(valueOf).length()).append("Configured Database URL '").append(c).append("' is invalid. It should point to the root of a Firebase Database but it includes a path: ").append(valueOf).toString());
                }
            }
            fVar = (f) a.get(bVar.b());
        }
        return fVar;
    }

    public static String e() {
        return "3.0.0";
    }

    private synchronized void f() {
        if (this.e == null) {
            this.e = hb.a(this.d, this.c, this);
        }
    }

    public d b() {
        f();
        return new d(this.e, gx.a());
    }

    public void c() {
        f();
        hb.b(this.e);
    }

    public void d() {
        f();
        hb.a(this.e);
    }
}
