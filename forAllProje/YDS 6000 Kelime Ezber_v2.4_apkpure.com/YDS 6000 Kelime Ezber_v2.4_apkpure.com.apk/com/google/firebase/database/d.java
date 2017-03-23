package com.google.firebase.database;

import com.google.android.gms.b.gx;
import com.google.android.gms.b.gz;
import com.google.android.gms.b.hm;
import com.google.android.gms.b.jr;
import com.google.android.gms.b.js;
import com.google.android.gms.b.jv;
import com.google.android.gms.b.kr;
import com.google.android.gms.b.kt;
import com.google.android.gms.b.ku;
import com.google.android.gms.b.kv;
import java.net.URLEncoder;

public class d extends j {

    public interface a {
        void a(b bVar, d dVar);
    }

    d(gz gzVar, gx gxVar) {
        super(gzVar, gxVar);
    }

    private com.google.android.gms.c.d<Void> a(Object obj, jr jrVar, a aVar) {
        ku.a(c());
        hm.a(c(), obj);
        Object a = kv.a(obj);
        ku.a(a);
        final jr a2 = js.a(a, jrVar);
        final kr a3 = kt.a(aVar);
        this.a.a(new Runnable(this) {
            final /* synthetic */ d c;

            public void run() {
                this.c.a.a(this.c.c(), a2, (a) a3.b());
            }
        });
        return (com.google.android.gms.c.d) a3.a();
    }

    public com.google.android.gms.c.d<Void> a(Object obj) {
        return a(obj, jv.a(null), null);
    }

    public d a() {
        gx f = c().f();
        return f != null ? new d(this.a, f) : null;
    }

    public d a(String str) {
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'pathString' in child()");
        }
        if (c().h()) {
            ku.b(str);
        } else {
            ku.a(str);
        }
        return new d(this.a, c().a(new gx(str)));
    }

    public String b() {
        return c().h() ? null : c().g().d();
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && toString().equals(obj.toString());
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        d a = a();
        if (a == null) {
            return this.a.toString();
        }
        String valueOf;
        try {
            valueOf = String.valueOf(a.toString());
            String valueOf2 = String.valueOf(URLEncoder.encode(b(), "UTF-8").replace("+", "%20"));
            return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("/").append(valueOf2).toString();
        } catch (Throwable e) {
            Throwable th = e;
            String str = "Failed to URLEncode key: ";
            valueOf = String.valueOf(b());
            throw new c(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
        }
    }
}
