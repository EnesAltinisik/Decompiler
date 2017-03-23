package com.google.android.gms.b;

import com.google.firebase.database.f;
import java.util.HashMap;
import java.util.Map;

public class hb {
    private static final hb a = new hb();
    private final Map<gq, Map<String, gz>> b = new HashMap();

    class AnonymousClass1 implements Runnable {
        final /* synthetic */ gz a;

        AnonymousClass1(gz gzVar) {
            this.a = gzVar;
        }

        public void run() {
            this.a.c();
        }
    }

    class AnonymousClass2 implements Runnable {
        final /* synthetic */ gz a;

        AnonymousClass2(gz gzVar) {
            this.a = gzVar;
        }

        public void run() {
            this.a.d();
        }
    }

    public static gz a(gq gqVar, ha haVar, f fVar) {
        return a.b(gqVar, haVar, fVar);
    }

    public static void a(gz gzVar) {
        gzVar.a(new AnonymousClass1(gzVar));
    }

    private gz b(gq gqVar, ha haVar, f fVar) {
        gz gzVar;
        gqVar.b();
        String str = haVar.a;
        String str2 = haVar.c;
        str2 = new StringBuilder((String.valueOf(str).length() + 9) + String.valueOf(str2).length()).append("https://").append(str).append("/").append(str2).toString();
        synchronized (this.b) {
            if (!this.b.containsKey(gqVar)) {
                this.b.put(gqVar, new HashMap());
            }
            Map map = (Map) this.b.get(gqVar);
            if (map.containsKey(str2)) {
                throw new IllegalStateException("createLocalRepo() called for existing repo.");
            }
            gzVar = new gz(haVar, gqVar, fVar);
            map.put(str2, gzVar);
        }
        return gzVar;
    }

    public static void b(gz gzVar) {
        gzVar.a(new AnonymousClass2(gzVar));
    }
}
