package com.google.android.gms.b;

import com.google.android.gms.b.au.a;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;

public class ew extends ly {
    private static volatile az i = null;
    private static final Object j = new Object();
    private boolean k = false;
    private a l = null;

    public ew(eq eqVar, String str, String str2, aw.a aVar, int i, int i2, boolean z, a aVar2) {
        super(eqVar, str, str2, aVar, i, i2);
        this.k = z;
        this.l = aVar2;
    }

    public static Boolean a(a aVar) {
        boolean z = false;
        if (!es.b(b(aVar))) {
            return Boolean.valueOf(false);
        }
        if (!(aVar == null || aVar.a == null || aVar.a.a.intValue() != 3)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private void a(int i) {
        boolean z = true;
        Method method = this.f;
        Object[] objArr = new Object[3];
        objArr[0] = this.b.a();
        objArr[1] = Boolean.valueOf(this.k);
        if (i != 2) {
            z = false;
        }
        objArr[2] = Boolean.valueOf(z);
        i = new az((String) method.invoke(null, objArr));
        if (es.b(i.a) || i.a.equals("E")) {
            switch (i) {
                case 3:
                    String f = f();
                    if (!es.b(f)) {
                        i.a = f;
                        return;
                    }
                    return;
                case 4:
                    i.a = this.l.b.a;
                    return;
                default:
                    return;
            }
        }
    }

    public static String b(a aVar) {
        return (aVar == null || aVar.b == null || es.b(aVar.b.a)) ? null : aVar.b.a;
    }

    private boolean c() {
        return i == null || es.b(i.a) || i.a.equals("E");
    }

    private int d() {
        return !es.b(b(this.l)) ? 4 : (a(this.l).booleanValue() && e()) ? 3 : 2;
    }

    private boolean e() {
        return this.b.k() && ((Boolean) pr.bP.c()).booleanValue() && ((Boolean) pr.bQ.c()).booleanValue() && ((Boolean) pr.bN.c()).booleanValue();
    }

    private String f() {
        try {
            if (this.b.m() != null) {
                this.b.m().get();
            }
            aw.a l = this.b.l();
            if (!(l == null || l.w == null)) {
                return l.w;
            }
        } catch (InterruptedException e) {
        } catch (ExecutionException e2) {
        }
        return null;
    }

    protected void a() {
        if (c()) {
            synchronized (j) {
                int d = d();
                if (d == 3) {
                    this.b.n();
                }
                a(d);
            }
        }
        synchronized (this.e) {
            if (i != null) {
                this.e.w = i.a;
                this.e.C = Long.valueOf(i.b);
                this.e.B = i.c;
                if (this.k) {
                    this.e.M = i.d;
                    this.e.N = i.e;
                }
            }
        }
    }
}
