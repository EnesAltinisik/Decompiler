package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

public class ah {
    static final l a;

    interface l {
        boolean A(View view);

        ColorStateList B(View view);

        Mode C(View view);

        void D(View view);

        boolean E(View view);

        float F(View view);

        boolean G(View view);

        boolean H(View view);

        Display I(View view);

        int a(int i, int i2);

        int a(int i, int i2, int i3);

        bf a(View view, bf bfVar);

        void a(View view, float f);

        void a(View view, int i, int i2);

        void a(View view, int i, int i2, int i3, int i4);

        void a(View view, int i, Paint paint);

        void a(View view, ColorStateList colorStateList);

        void a(View view, Mode mode);

        void a(View view, Drawable drawable);

        void a(View view, ab abVar);

        void a(View view, b bVar);

        void a(View view, z zVar);

        void a(View view, Runnable runnable);

        void a(View view, Runnable runnable, long j);

        void a(View view, boolean z);

        boolean a(View view);

        boolean a(View view, int i);

        bf b(View view, bf bfVar);

        void b(View view, float f);

        void b(View view, boolean z);

        boolean b(View view);

        boolean b(View view, int i);

        void c(View view);

        void c(View view, float f);

        void c(View view, int i);

        void c(View view, boolean z);

        int d(View view);

        void d(View view, float f);

        void d(View view, int i);

        float e(View view);

        void e(View view, float f);

        void e(View view, int i);

        int f(View view);

        void f(View view, float f);

        int g(View view);

        ViewParent h(View view);

        int i(View view);

        int j(View view);

        int k(View view);

        int l(View view);

        boolean m(View view);

        float n(View view);

        float o(View view);

        Matrix p(View view);

        int q(View view);

        int r(View view);

        ay s(View view);

        String t(View view);

        int u(View view);

        void v(View view);

        float w(View view);

        boolean y(View view);

        void z(View view);
    }

    static class b implements l {
        WeakHashMap<View, ay> a = null;

        b() {
        }

        private boolean a(ad adVar, int i) {
            int computeHorizontalScrollOffset = adVar.computeHorizontalScrollOffset();
            int computeHorizontalScrollRange = adVar.computeHorizontalScrollRange() - adVar.computeHorizontalScrollExtent();
            return computeHorizontalScrollRange == 0 ? false : i < 0 ? computeHorizontalScrollOffset > 0 : computeHorizontalScrollOffset < computeHorizontalScrollRange + -1;
        }

        private boolean b(ad adVar, int i) {
            int computeVerticalScrollOffset = adVar.computeVerticalScrollOffset();
            int computeVerticalScrollRange = adVar.computeVerticalScrollRange() - adVar.computeVerticalScrollExtent();
            return computeVerticalScrollRange == 0 ? false : i < 0 ? computeVerticalScrollOffset > 0 : computeVerticalScrollOffset < computeVerticalScrollRange + -1;
        }

        public boolean A(View view) {
            return false;
        }

        public ColorStateList B(View view) {
            return aj.a(view);
        }

        public Mode C(View view) {
            return aj.b(view);
        }

        public void D(View view) {
            if (view instanceof v) {
                ((v) view).stopNestedScroll();
            }
        }

        public boolean E(View view) {
            return aj.c(view);
        }

        public float F(View view) {
            return x(view) + w(view);
        }

        public boolean G(View view) {
            return aj.f(view);
        }

        public boolean H(View view) {
            return false;
        }

        public Display I(View view) {
            return aj.g(view);
        }

        public int a(int i, int i2) {
            return i | i2;
        }

        public int a(int i, int i2, int i3) {
            return View.resolveSize(i, i2);
        }

        long a() {
            return 10;
        }

        public bf a(View view, bf bfVar) {
            return bfVar;
        }

        public void a(View view, float f) {
        }

        public void a(View view, int i, int i2) {
        }

        public void a(View view, int i, int i2, int i3, int i4) {
            view.setPadding(i, i2, i3, i4);
        }

        public void a(View view, int i, Paint paint) {
        }

        public void a(View view, ColorStateList colorStateList) {
            aj.a(view, colorStateList);
        }

        public void a(View view, Mode mode) {
            aj.a(view, mode);
        }

        public void a(View view, Drawable drawable) {
            view.setBackgroundDrawable(drawable);
        }

        public void a(View view, ab abVar) {
        }

        public void a(View view, b bVar) {
        }

        public void a(View view, z zVar) {
        }

        public void a(View view, Runnable runnable) {
            view.postDelayed(runnable, a());
        }

        public void a(View view, Runnable runnable, long j) {
            view.postDelayed(runnable, a() + j);
        }

        public void a(View view, boolean z) {
        }

        public boolean a(View view) {
            return false;
        }

        public boolean a(View view, int i) {
            return (view instanceof ad) && a((ad) view, i);
        }

        public bf b(View view, bf bfVar) {
            return bfVar;
        }

        public void b(View view, float f) {
        }

        public void b(View view, boolean z) {
        }

        public boolean b(View view) {
            return false;
        }

        public boolean b(View view, int i) {
            return (view instanceof ad) && b((ad) view, i);
        }

        public void c(View view) {
            view.invalidate();
        }

        public void c(View view, float f) {
        }

        public void c(View view, int i) {
        }

        public void c(View view, boolean z) {
        }

        public int d(View view) {
            return 0;
        }

        public void d(View view, float f) {
        }

        public void d(View view, int i) {
            aj.b(view, i);
        }

        public float e(View view) {
            return 1.0f;
        }

        public void e(View view, float f) {
        }

        public void e(View view, int i) {
            aj.a(view, i);
        }

        public int f(View view) {
            return 0;
        }

        public void f(View view, float f) {
        }

        public int g(View view) {
            return 0;
        }

        public ViewParent h(View view) {
            return view.getParent();
        }

        public int i(View view) {
            return view.getMeasuredWidth();
        }

        public int j(View view) {
            return 0;
        }

        public int k(View view) {
            return view.getPaddingLeft();
        }

        public int l(View view) {
            return view.getPaddingRight();
        }

        public boolean m(View view) {
            return true;
        }

        public float n(View view) {
            return 0.0f;
        }

        public float o(View view) {
            return 0.0f;
        }

        public Matrix p(View view) {
            return null;
        }

        public int q(View view) {
            return aj.d(view);
        }

        public int r(View view) {
            return aj.e(view);
        }

        public ay s(View view) {
            return new ay(view);
        }

        public String t(View view) {
            return null;
        }

        public int u(View view) {
            return 0;
        }

        public void v(View view) {
        }

        public float w(View view) {
            return 0.0f;
        }

        public float x(View view) {
            return 0.0f;
        }

        public boolean y(View view) {
            return false;
        }

        public void z(View view) {
        }
    }

    static class c extends b {
        c() {
        }

        public int a(int i, int i2) {
            return ak.a(i, i2);
        }

        public int a(int i, int i2, int i3) {
            return ak.a(i, i2, i3);
        }

        long a() {
            return ak.a();
        }

        public void a(View view, float f) {
            ak.a(view, f);
        }

        public void a(View view, int i, Paint paint) {
            ak.a(view, i, paint);
        }

        public void b(View view, float f) {
            ak.b(view, f);
        }

        public void b(View view, boolean z) {
            ak.a(view, z);
        }

        public void c(View view, float f) {
            ak.c(view, f);
        }

        public void c(View view, boolean z) {
            ak.b(view, z);
        }

        public void d(View view, float f) {
            ak.d(view, f);
        }

        public void d(View view, int i) {
            ak.b(view, i);
        }

        public float e(View view) {
            return ak.a(view);
        }

        public void e(View view, float f) {
            ak.e(view, f);
        }

        public void e(View view, int i) {
            ak.a(view, i);
        }

        public int f(View view) {
            return ak.b(view);
        }

        public int i(View view) {
            return ak.c(view);
        }

        public int j(View view) {
            return ak.d(view);
        }

        public float n(View view) {
            return ak.e(view);
        }

        public float o(View view) {
            return ak.f(view);
        }

        public Matrix p(View view) {
            return ak.g(view);
        }

        public void z(View view) {
            ak.h(view);
        }
    }

    static class e extends c {
        static Field b;
        static boolean c = false;

        e() {
        }

        public void a(View view, b bVar) {
            al.a(view, bVar == null ? null : bVar.a());
        }

        public void a(View view, boolean z) {
            al.a(view, z);
        }

        public boolean a(View view) {
            boolean z = true;
            if (c) {
                return false;
            }
            if (b == null) {
                try {
                    b = View.class.getDeclaredField("mAccessibilityDelegate");
                    b.setAccessible(true);
                } catch (Throwable th) {
                    c = true;
                    return false;
                }
            }
            try {
                if (b.get(view) == null) {
                    z = false;
                }
                return z;
            } catch (Throwable th2) {
                c = true;
                return false;
            }
        }

        public boolean a(View view, int i) {
            return al.a(view, i);
        }

        public boolean b(View view, int i) {
            return al.b(view, i);
        }

        public ay s(View view) {
            if (this.a == null) {
                this.a = new WeakHashMap();
            }
            ay ayVar = (ay) this.a.get(view);
            if (ayVar != null) {
                return ayVar;
            }
            ayVar = new ay(view);
            this.a.put(view, ayVar);
            return ayVar;
        }
    }

    static class d extends e {
        d() {
        }

        public boolean H(View view) {
            return am.a(view);
        }
    }

    static class f extends d {
        f() {
        }

        public void a(View view, Drawable drawable) {
            an.a(view, drawable);
        }

        public void a(View view, Runnable runnable) {
            an.a(view, runnable);
        }

        public void a(View view, Runnable runnable, long j) {
            an.a(view, runnable, j);
        }

        public boolean b(View view) {
            return an.a(view);
        }

        public void c(View view) {
            an.b(view);
        }

        public void c(View view, int i) {
            if (i == 4) {
                i = 2;
            }
            an.a(view, i);
        }

        public int d(View view) {
            return an.c(view);
        }

        public ViewParent h(View view) {
            return an.d(view);
        }

        public boolean m(View view) {
            return an.i(view);
        }

        public int q(View view) {
            return an.e(view);
        }

        public int r(View view) {
            return an.f(view);
        }

        public void v(View view) {
            an.g(view);
        }

        public boolean y(View view) {
            return an.h(view);
        }
    }

    static class g extends f {
        g() {
        }

        public boolean A(View view) {
            return ao.e(view);
        }

        public Display I(View view) {
            return ao.f(view);
        }

        public void a(View view, int i, int i2, int i3, int i4) {
            ao.a(view, i, i2, i3, i4);
        }

        public int g(View view) {
            return ao.a(view);
        }

        public int k(View view) {
            return ao.b(view);
        }

        public int l(View view) {
            return ao.c(view);
        }

        public int u(View view) {
            return ao.d(view);
        }
    }

    static class h extends g {
        h() {
        }
    }

    static class i extends h {
        i() {
        }

        public boolean E(View view) {
            return ap.a(view);
        }

        public boolean G(View view) {
            return ap.b(view);
        }

        public void c(View view, int i) {
            an.a(view, i);
        }
    }

    static class j extends i {
        j() {
        }

        public ColorStateList B(View view) {
            return aq.e(view);
        }

        public Mode C(View view) {
            return aq.f(view);
        }

        public void D(View view) {
            aq.g(view);
        }

        public float F(View view) {
            return aq.h(view);
        }

        public bf a(View view, bf bfVar) {
            return bf.a(aq.a(view, bf.a(bfVar)));
        }

        public void a(View view, ColorStateList colorStateList) {
            aq.a(view, colorStateList);
        }

        public void a(View view, Mode mode) {
            aq.a(view, mode);
        }

        public void a(View view, final z zVar) {
            if (zVar == null) {
                aq.a(view, null);
            } else {
                aq.a(view, new android.support.v4.view.aq.a(this) {
                    final /* synthetic */ j b;

                    public Object a(View view, Object obj) {
                        return bf.a(zVar.a(view, bf.a(obj)));
                    }
                });
            }
        }

        public bf b(View view, bf bfVar) {
            return bf.a(aq.b(view, bf.a(bfVar)));
        }

        public void d(View view, int i) {
            aq.b(view, i);
        }

        public void e(View view, int i) {
            aq.a(view, i);
        }

        public void f(View view, float f) {
            aq.a(view, f);
        }

        public String t(View view) {
            return aq.a(view);
        }

        public void v(View view) {
            aq.b(view);
        }

        public float w(View view) {
            return aq.c(view);
        }

        public float x(View view) {
            return aq.d(view);
        }
    }

    static class k extends j {
        k() {
        }

        public void a(View view, int i, int i2) {
            ar.a(view, i, i2);
        }

        public void d(View view, int i) {
            ar.b(view, i);
        }

        public void e(View view, int i) {
            ar.a(view, i);
        }
    }

    static class a extends k {
        a() {
        }

        public void a(View view, ab abVar) {
            ai.a(view, abVar != null ? abVar.a() : null);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (android.support.v4.g.c.a()) {
            a = new a();
        } else if (i >= 23) {
            a = new k();
        } else if (i >= 21) {
            a = new j();
        } else if (i >= 19) {
            a = new i();
        } else if (i >= 18) {
            a = new h();
        } else if (i >= 17) {
            a = new g();
        } else if (i >= 16) {
            a = new f();
        } else if (i >= 15) {
            a = new d();
        } else if (i >= 14) {
            a = new e();
        } else if (i >= 11) {
            a = new c();
        } else {
            a = new b();
        }
    }

    public static boolean A(View view) {
        return a.A(view);
    }

    public static ColorStateList B(View view) {
        return a.B(view);
    }

    public static Mode C(View view) {
        return a.C(view);
    }

    public static void D(View view) {
        a.D(view);
    }

    public static boolean E(View view) {
        return a.E(view);
    }

    public static float F(View view) {
        return a.F(view);
    }

    public static boolean G(View view) {
        return a.G(view);
    }

    public static boolean H(View view) {
        return a.H(view);
    }

    public static Display I(View view) {
        return a.I(view);
    }

    public static int a(int i, int i2) {
        return a.a(i, i2);
    }

    public static int a(int i, int i2, int i3) {
        return a.a(i, i2, i3);
    }

    @Deprecated
    public static int a(View view) {
        return view.getOverScrollMode();
    }

    public static bf a(View view, bf bfVar) {
        return a.a(view, bfVar);
    }

    public static void a(View view, float f) {
        a.a(view, f);
    }

    public static void a(View view, int i, int i2) {
        a.a(view, i, i2);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.a(view, i, i2, i3, i4);
    }

    public static void a(View view, int i, Paint paint) {
        a.a(view, i, paint);
    }

    public static void a(View view, ColorStateList colorStateList) {
        a.a(view, colorStateList);
    }

    public static void a(View view, Mode mode) {
        a.a(view, mode);
    }

    public static void a(View view, Drawable drawable) {
        a.a(view, drawable);
    }

    public static void a(View view, ab abVar) {
        a.a(view, abVar);
    }

    public static void a(View view, b bVar) {
        a.a(view, bVar);
    }

    public static void a(View view, z zVar) {
        a.a(view, zVar);
    }

    public static void a(View view, Runnable runnable) {
        a.a(view, runnable);
    }

    public static void a(View view, Runnable runnable, long j) {
        a.a(view, runnable, j);
    }

    public static void a(View view, boolean z) {
        a.a(view, z);
    }

    public static boolean a(View view, int i) {
        return a.a(view, i);
    }

    public static bf b(View view, bf bfVar) {
        return a.b(view, bfVar);
    }

    public static void b(View view, float f) {
        a.b(view, f);
    }

    public static void b(View view, boolean z) {
        a.b(view, z);
    }

    public static boolean b(View view) {
        return a.a(view);
    }

    public static boolean b(View view, int i) {
        return a.b(view, i);
    }

    public static void c(View view, float f) {
        a.c(view, f);
    }

    public static void c(View view, int i) {
        a.c(view, i);
    }

    public static void c(View view, boolean z) {
        a.c(view, z);
    }

    public static boolean c(View view) {
        return a.b(view);
    }

    public static void d(View view) {
        a.c(view);
    }

    public static void d(View view, float f) {
        a.d(view, f);
    }

    public static void d(View view, int i) {
        a.e(view, i);
    }

    public static int e(View view) {
        return a.d(view);
    }

    public static void e(View view, float f) {
        a.e(view, f);
    }

    public static void e(View view, int i) {
        a.d(view, i);
    }

    public static float f(View view) {
        return a.e(view);
    }

    public static void f(View view, float f) {
        a.f(view, f);
    }

    public static int g(View view) {
        return a.f(view);
    }

    public static int h(View view) {
        return a.g(view);
    }

    public static ViewParent i(View view) {
        return a.h(view);
    }

    public static int j(View view) {
        return a.i(view);
    }

    public static int k(View view) {
        return a.j(view);
    }

    public static int l(View view) {
        return a.k(view);
    }

    public static int m(View view) {
        return a.l(view);
    }

    public static float n(View view) {
        return a.n(view);
    }

    public static float o(View view) {
        return a.o(view);
    }

    public static Matrix p(View view) {
        return a.p(view);
    }

    public static int q(View view) {
        return a.q(view);
    }

    public static int r(View view) {
        return a.r(view);
    }

    public static ay s(View view) {
        return a.s(view);
    }

    public static float t(View view) {
        return a.w(view);
    }

    public static String u(View view) {
        return a.t(view);
    }

    public static int v(View view) {
        return a.u(view);
    }

    public static void w(View view) {
        a.v(view);
    }

    public static boolean x(View view) {
        return a.y(view);
    }

    public static void y(View view) {
        a.z(view);
    }

    public static boolean z(View view) {
        return a.m(view);
    }
}
