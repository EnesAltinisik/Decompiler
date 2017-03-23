package com.google.android.gms.b;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.b.aw.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class cf extends br {
    protected static final Object l = new Object();
    protected static volatile eq m = null;
    static boolean n = false;
    private static final String s = cf.class.getSimpleName();
    private static long t = 0;
    protected boolean o = false;
    protected String p;
    protected boolean q = false;
    protected boolean r = false;

    protected cf(Context context, String str) {
        super(context);
        this.p = str;
        this.o = false;
    }

    protected cf(Context context, String str, boolean z) {
        super(context);
        this.p = str;
        this.o = z;
    }

    static er a(eq eqVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        Throwable e;
        Method a = eqVar.a(ei.H(), ei.I());
        if (a == null || motionEvent == null) {
            throw new em();
        }
        try {
            return new er((String) a.invoke(null, new Object[]{motionEvent, displayMetrics}));
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new em(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new em(e);
        }
    }

    protected static synchronized void a(Context context, boolean z) {
        synchronized (cf.class) {
            if (!n) {
                t = es.a().longValue() / 1000;
                m = b(context, z);
                n = true;
            }
        }
    }

    private static void a(eq eqVar) {
        List singletonList = Collections.singletonList(Context.class);
        eqVar.a(ei.n(), ei.o(), singletonList);
        eqVar.a(ei.x(), ei.y(), singletonList);
        eqVar.a(ei.v(), ei.w(), singletonList);
        eqVar.a(ei.h(), ei.i(), singletonList);
        eqVar.a(ei.r(), ei.s(), singletonList);
        eqVar.a(ei.d(), ei.e(), singletonList);
        eqVar.a(ei.J(), ei.K(), singletonList);
        singletonList = Arrays.asList(new Class[]{MotionEvent.class, DisplayMetrics.class});
        eqVar.a(ei.H(), ei.I(), singletonList);
        eqVar.a(ei.F(), ei.G(), singletonList);
        eqVar.a(ei.l(), ei.m(), Collections.emptyList());
        eqVar.a(ei.D(), ei.E(), Collections.emptyList());
        eqVar.a(ei.t(), ei.u(), Collections.emptyList());
        eqVar.a(ei.j(), ei.k(), Collections.emptyList());
        eqVar.a(ei.p(), ei.q(), Collections.emptyList());
        eqVar.a(ei.B(), ei.C(), Collections.emptyList());
        eqVar.a(ei.f(), ei.g(), Arrays.asList(new Class[]{Context.class, Boolean.TYPE, Boolean.TYPE}));
        eqVar.a(ei.z(), ei.A(), Arrays.asList(new Class[]{StackTraceElement[].class}));
        eqVar.a(ei.L(), ei.M(), Arrays.asList(new Class[]{View.class}));
    }

    private void a(eq eqVar, a aVar) {
        er a;
        a.a aVar2;
        int i = 0;
        try {
            a = a(eqVar, this.a, this.k);
            aVar.n = a.a;
            aVar.o = a.b;
            aVar.p = a.c;
            if (this.j) {
                aVar.D = a.d;
                aVar.E = a.e;
            }
            if (((Boolean) pr.bA.c()).booleanValue() || ((Boolean) pr.bv.c()).booleanValue()) {
                aVar2 = new a.a();
                er b = b(this.a);
                aVar2.a = b.a;
                aVar2.b = b.b;
                aVar2.h = b.c;
                if (this.j) {
                    aVar2.c = b.e;
                    aVar2.e = b.d;
                    aVar2.g = Integer.valueOf(b.f.longValue() != 0 ? 1 : 0);
                    if (this.d > 0) {
                        aVar2.d = this.k != null ? Long.valueOf(Math.round(((double) this.i) / ((double) this.d))) : null;
                        aVar2.f = Long.valueOf(Math.round(((double) this.h) / ((double) this.d)));
                    }
                    aVar2.j = b.i;
                    aVar2.i = b.j;
                    aVar2.k = Integer.valueOf(b.k.longValue() != 0 ? 1 : 0);
                    if (this.g > 0) {
                        aVar2.l = Long.valueOf(this.g);
                    }
                }
                aVar.W = aVar2;
            }
        } catch (em e) {
        }
        if (this.c > 0) {
            aVar.I = Long.valueOf(this.c);
        }
        if (this.d > 0) {
            aVar.H = Long.valueOf(this.d);
        }
        if (this.e > 0) {
            aVar.G = Long.valueOf(this.e);
        }
        if (this.f > 0) {
            aVar.J = Long.valueOf(this.f);
        }
        try {
            int size = this.b.size() - 1;
            if (size > 0) {
                aVar.X = new a.a[size];
                while (i < size) {
                    a = a(eqVar, (MotionEvent) this.b.get(i), this.k);
                    aVar2 = new a.a();
                    aVar2.a = a.a;
                    aVar2.b = a.b;
                    aVar.X[i] = aVar2;
                    i++;
                }
            }
        } catch (em e2) {
            aVar.X = null;
        }
    }

    protected static eq b(Context context, boolean z) {
        if (m == null) {
            synchronized (l) {
                if (m == null) {
                    eq a = eq.a(context, ei.a(), ei.c(), z);
                    a(a);
                    m = a;
                }
            }
        }
        return m;
    }

    protected long a(StackTraceElement[] stackTraceElementArr) {
        Throwable e;
        Method a = m.a(ei.z(), ei.A());
        if (a == null || stackTraceElementArr == null) {
            throw new em();
        }
        try {
            return new eo((String) a.invoke(null, new Object[]{stackTraceElementArr})).a.longValue();
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new em(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new em(e);
        }
    }

    protected a a(Context context, View view) {
        a aVar = new a();
        if (!TextUtils.isEmpty(this.p)) {
            aVar.b = this.p;
        }
        eq b = b(context, this.o);
        b.p();
        b(b, aVar, view);
        b.q();
        return aVar;
    }

    protected a a(Context context, au.a aVar) {
        a aVar2 = new a();
        if (!TextUtils.isEmpty(this.p)) {
            aVar2.b = this.p;
        }
        eq b = b(context, this.o);
        b.p();
        a(b, aVar2, aVar);
        b.q();
        return aVar2;
    }

    protected List<Callable<Void>> a(eq eqVar, a aVar, View view) {
        ArrayList arrayList = new ArrayList();
        if (eqVar.c() == null) {
            return arrayList;
        }
        int r = eqVar.r();
        arrayList.add(new ho(eqVar, aVar));
        ArrayList arrayList2 = arrayList;
        arrayList2.add(new kn(eqVar, ei.t(), ei.u(), aVar, r, 1));
        arrayList2 = arrayList;
        arrayList2.add(new fn(eqVar, ei.l(), ei.m(), aVar, t, r, 25));
        arrayList2 = arrayList;
        arrayList2.add(new ez(eqVar, ei.j(), ei.k(), aVar, r, 44));
        arrayList2 = arrayList;
        arrayList2.add(new eu(eqVar, ei.d(), ei.e(), aVar, r, 3));
        arrayList2 = arrayList;
        arrayList2.add(new io(eqVar, ei.p(), ei.q(), aVar, r, 22));
        if (((Boolean) pr.bG.c()).booleanValue() || ((Boolean) pr.bv.c()).booleanValue()) {
            arrayList2 = arrayList;
            arrayList2.add(new ey(eqVar, ei.h(), ei.i(), aVar, r, 5));
        }
        if (((Boolean) pr.bz.c()).booleanValue() || ((Boolean) pr.bv.c()).booleanValue()) {
            arrayList2 = arrayList;
            arrayList2.add(new lt(eqVar, ei.J(), ei.K(), aVar, r, 48));
        }
        if (((Boolean) pr.bE.c()).booleanValue() || ((Boolean) pr.bv.c()).booleanValue()) {
            arrayList2 = arrayList;
            arrayList2.add(new lc(eqVar, ei.B(), ei.C(), aVar, r, 51));
        }
        if (((Boolean) pr.bJ.c()).booleanValue() || ((Boolean) pr.bv.c()).booleanValue()) {
            arrayList2 = arrayList;
            arrayList2.add(new lb(eqVar, ei.z(), ei.A(), aVar, r, 45, new Throwable().getStackTrace()));
        }
        if (((Boolean) pr.bK.c()).booleanValue()) {
            arrayList2 = arrayList;
            arrayList2.add(new lw(eqVar, ei.L(), ei.M(), aVar, r, 57, view));
        }
        return arrayList;
    }

    protected void a(eq eqVar, a aVar, au.a aVar2) {
        if (eqVar.c() != null) {
            a(b(eqVar, aVar, aVar2));
        }
    }

    protected void a(List<Callable<Void>> list) {
        if (m != null) {
            ExecutorService c = m.c();
            if (c != null && !list.isEmpty()) {
                try {
                    c.invokeAll(list, ((Long) pr.bq.c()).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable e) {
                    Log.d(s, String.format("class methods got exception: %s", new Object[]{es.a(e)}));
                }
            }
        }
    }

    protected er b(MotionEvent motionEvent) {
        Throwable e;
        Method a = m.a(ei.F(), ei.G());
        if (a == null || motionEvent == null) {
            throw new em();
        }
        try {
            return new er((String) a.invoke(null, new Object[]{motionEvent, this.k}));
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new em(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new em(e);
        }
    }

    protected List<Callable<Void>> b(eq eqVar, a aVar, au.a aVar2) {
        int r = eqVar.r();
        List arrayList = new ArrayList();
        String f = ei.f();
        String g = ei.g();
        boolean z = ((Boolean) pr.bu.c()).booleanValue() || ((Boolean) pr.bv.c()).booleanValue();
        arrayList.add(new ew(eqVar, f, g, aVar, r, 27, z, aVar2));
        arrayList.add(new fn(eqVar, ei.l(), ei.m(), aVar, t, r, 25));
        arrayList.add(new kn(eqVar, ei.t(), ei.u(), aVar, r, 1));
        arrayList.add(new la(eqVar, ei.v(), ei.w(), aVar, r, 31));
        arrayList.add(new le(eqVar, ei.D(), ei.E(), aVar, r, 33));
        arrayList.add(new ev(eqVar, ei.x(), ei.y(), aVar, r, 29));
        arrayList.add(new ey(eqVar, ei.h(), ei.i(), aVar, r, 5));
        arrayList.add(new jm(eqVar, ei.r(), ei.s(), aVar, r, 12));
        arrayList.add(new eu(eqVar, ei.d(), ei.e(), aVar, r, 3));
        arrayList.add(new ez(eqVar, ei.j(), ei.k(), aVar, r, 44));
        arrayList.add(new io(eqVar, ei.p(), ei.q(), aVar, r, 22));
        if (((Boolean) pr.bx.c()).booleanValue() || ((Boolean) pr.bv.c()).booleanValue()) {
            arrayList.add(new lt(eqVar, ei.J(), ei.K(), aVar, r, 48));
        }
        if (((Boolean) pr.bC.c()).booleanValue() || ((Boolean) pr.bv.c()).booleanValue()) {
            arrayList.add(new lc(eqVar, ei.B(), ei.C(), aVar, r, 51));
        }
        return arrayList;
    }

    protected void b(eq eqVar, a aVar, View view) {
        a(eqVar, aVar);
        a(a(eqVar, aVar, view));
    }
}
