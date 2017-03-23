package com.google.android.gms.b;

import android.os.IBinder;
import com.google.android.gms.ads.b.a.a;
import com.google.android.gms.ads.b.d;
import com.google.android.gms.ads.j;
import java.util.ArrayList;
import java.util.List;

@vz
public class ra extends d {
    private final qz a;
    private final List<a> b = new ArrayList();
    private final qw c;
    private j d = new j();

    public ra(qz qzVar) {
        qw qwVar;
        this.a = qzVar;
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
        return k();
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

    public Double g() {
        Double d = null;
        try {
            double f = this.a.f();
            if (f != -1.0d) {
                d = Double.valueOf(f);
            }
        } catch (Throwable e) {
            zy.b("Failed to get star rating.", e);
        }
        return d;
    }

    public CharSequence h() {
        try {
            return this.a.g();
        } catch (Throwable e) {
            zy.b("Failed to get store", e);
            return null;
        }
    }

    public CharSequence i() {
        try {
            return this.a.h();
        } catch (Throwable e) {
            zy.b("Failed to get price.", e);
            return null;
        }
    }

    public j j() {
        try {
            if (this.a.i() != null) {
                this.d.a(this.a.i());
            }
        } catch (Throwable e) {
            zy.b("Exception occurred while getting video controller", e);
        }
        return this.d;
    }

    protected com.google.android.gms.a.a k() {
        try {
            return this.a.j();
        } catch (Throwable e) {
            zy.b("Failed to retrieve native ad engine.", e);
            return null;
        }
    }
}
