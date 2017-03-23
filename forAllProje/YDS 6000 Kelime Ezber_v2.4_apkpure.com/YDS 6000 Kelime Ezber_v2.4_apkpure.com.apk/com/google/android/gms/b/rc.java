package com.google.android.gms.b;

import android.os.IBinder;
import com.google.android.gms.ads.b.a.a;
import com.google.android.gms.ads.b.e;
import java.util.ArrayList;
import java.util.List;

@vz
public class rc extends e {
    private final rb a;
    private final List<a> b = new ArrayList();
    private final qw c;

    public rc(rb rbVar) {
        qw qwVar;
        this.a = rbVar;
        try {
            List<Object> b = this.a.b();
            if (b != null) {
                for (Object a : b) {
                    qu a2 = a(a);
                    if (a2 != null) {
                        this.b.add(new qw(a2));
                    }
                }
            }
        } catch (Throwable e) {
            zy.b("Failed to get image.", e);
        }
        try {
            qu d = this.a.d();
            if (d != null) {
                qwVar = new qw(d);
                this.c = qwVar;
            }
        } catch (Throwable e2) {
            zy.b("Failed to get icon.", e2);
        }
        qwVar = null;
        this.c = qwVar;
    }

    qu a(Object obj) {
        return obj instanceof IBinder ? qu.a.a((IBinder) obj) : null;
    }

    protected /* synthetic */ Object a() {
        return h();
    }

    public CharSequence b() {
        try {
            return this.a.a();
        } catch (Throwable e) {
            zy.b("Failed to get headline.", e);
            return null;
        }
    }

    public List<a> c() {
        return this.b;
    }

    public CharSequence d() {
        try {
            return this.a.c();
        } catch (Throwable e) {
            zy.b("Failed to get body.", e);
            return null;
        }
    }

    public a e() {
        return this.c;
    }

    public CharSequence f() {
        try {
            return this.a.e();
        } catch (Throwable e) {
            zy.b("Failed to get call to action.", e);
            return null;
        }
    }

    public CharSequence g() {
        try {
            return this.a.f();
        } catch (Throwable e) {
            zy.b("Failed to get attribution.", e);
            return null;
        }
    }

    protected com.google.android.gms.a.a h() {
        try {
            return this.a.g();
        } catch (Throwable e) {
            zy.b("Failed to retrieve native ad engine.", e);
            return null;
        }
    }
}
