package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.cast.TextTrackStyle;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* compiled from: ViewCompat */
public final class ah {
    static final m a;

    /* compiled from: ViewCompat */
    interface m {
        ColorStateList A(View view);

        Mode B(View view);

        void C(View view);

        boolean D(View view);

        float E(View view);

        boolean F(View view);

        boolean G(View view);

        int a(int i, int i2);

        int a(int i, int i2, int i3);

        int a(View view);

        bg a(View view, bg bgVar);

        void a(View view, float f);

        void a(View view, int i, int i2);

        void a(View view, int i, int i2, int i3, int i4);

        void a(View view, int i, Paint paint);

        void a(View view, ColorStateList colorStateList);

        void a(View view, Mode mode);

        void a(View view, a aVar);

        void a(View view, ab abVar);

        void a(View view, Runnable runnable);

        void a(View view, Runnable runnable, long j);

        void a(View view, boolean z);

        boolean a(View view, int i);

        bg b(View view, bg bgVar);

        void b(View view, float f);

        void b(View view, boolean z);

        boolean b(View view);

        boolean b(View view, int i);

        void c(View view, float f);

        void c(View view, int i);

        void c(View view, boolean z);

        boolean c(View view);

        void d(View view);

        void d(View view, float f);

        void d(View view, int i);

        int e(View view);

        void e(View view, int i);

        float f(View view);

        void f(View view, int i);

        int g(View view);

        int h(View view);

        ViewParent i(View view);

        int j(View view);

        int k(View view);

        int l(View view);

        int m(View view);

        boolean n(View view);

        float o(View view);

        float p(View view);

        int q(View view);

        int r(View view);

        az s(View view);

        int t(View view);

        void u(View view);

        float v(View view);

        boolean x(View view);

        void y(View view);

        boolean z(View view);
    }

    /* compiled from: ViewCompat */
    static class a implements m {
        WeakHashMap<View, az> a = null;

        a() {
        }

        public boolean a(View view, int i) {
            return (view instanceof ad) && a((ad) view, i);
        }

        public boolean b(View view, int i) {
            return (view instanceof ad) && b((ad) view, i);
        }

        public int a(View view) {
            return 2;
        }

        public void a(View view, a aVar) {
        }

        public boolean b(View view) {
            return false;
        }

        public boolean c(View view) {
            return false;
        }

        public void d(View view) {
            view.invalidate();
        }

        public void a(View view, Runnable runnable) {
            view.postDelayed(runnable, a());
        }

        public void a(View view, Runnable runnable, long j) {
            view.postDelayed(runnable, a() + j);
        }

        long a() {
            return 10;
        }

        public int e(View view) {
            return 0;
        }

        public void c(View view, int i) {
        }

        public float f(View view) {
            return TextTrackStyle.DEFAULT_FONT_SCALE;
        }

        public void a(View view, int i, Paint paint) {
        }

        public int g(View view) {
            return 0;
        }

        public int h(View view) {
            return 0;
        }

        public ViewParent i(View view) {
            return view.getParent();
        }

        public int a(int i, int i2, int i3) {
            return View.resolveSize(i, i2);
        }

        public int j(View view) {
            return view.getMeasuredWidth();
        }

        public int k(View view) {
            return 0;
        }

        public void d(View view, int i) {
        }

        public int l(View view) {
            return view.getPaddingLeft();
        }

        public int m(View view) {
            return view.getPaddingRight();
        }

        public void a(View view, int i, int i2, int i3, int i4) {
            view.setPadding(i, i2, i3, i4);
        }

        public boolean n(View view) {
            return true;
        }

        public float o(View view) {
            return 0.0f;
        }

        public float p(View view) {
            return 0.0f;
        }

        public int q(View view) {
            return ai.d(view);
        }

        public int r(View view) {
            return ai.e(view);
        }

        public az s(View view) {
            return new az(view);
        }

        public void a(View view, float f) {
        }

        public void b(View view, float f) {
        }

        public void c(View view, float f) {
        }

        public int t(View view) {
            return 0;
        }

        public void u(View view) {
        }

        public void d(View view, float f) {
        }

        public float v(View view) {
            return 0.0f;
        }

        public float w(View view) {
            return 0.0f;
        }

        public boolean x(View view) {
            return false;
        }

        public void a(View view, boolean z) {
        }

        public void y(View view) {
        }

        public void a(View view, ab abVar) {
        }

        public bg a(View view, bg bgVar) {
            return bgVar;
        }

        public bg b(View view, bg bgVar) {
            return bgVar;
        }

        public void b(View view, boolean z) {
        }

        public void c(View view, boolean z) {
        }

        public boolean z(View view) {
            return false;
        }

        public ColorStateList A(View view) {
            return ai.a(view);
        }

        public void a(View view, ColorStateList colorStateList) {
            ai.a(view, colorStateList);
        }

        public void a(View view, Mode mode) {
            ai.a(view, mode);
        }

        public Mode B(View view) {
            return ai.b(view);
        }

        private boolean a(ad adVar, int i) {
            int computeHorizontalScrollOffset = adVar.computeHorizontalScrollOffset();
            int computeHorizontalScrollRange = adVar.computeHorizontalScrollRange() - adVar.computeHorizontalScrollExtent();
            if (computeHorizontalScrollRange == 0) {
                return false;
            }
            if (i < 0) {
                if (computeHorizontalScrollOffset <= 0) {
                    return false;
                }
                return true;
            } else if (computeHorizontalScrollOffset >= computeHorizontalScrollRange - 1) {
                return false;
            } else {
                return true;
            }
        }

        private boolean b(ad adVar, int i) {
            int computeVerticalScrollOffset = adVar.computeVerticalScrollOffset();
            int computeVerticalScrollRange = adVar.computeVerticalScrollRange() - adVar.computeVerticalScrollExtent();
            if (computeVerticalScrollRange == 0) {
                return false;
            }
            if (i < 0) {
                if (computeVerticalScrollOffset <= 0) {
                    return false;
                }
                return true;
            } else if (computeVerticalScrollOffset >= computeVerticalScrollRange - 1) {
                return false;
            } else {
                return true;
            }
        }

        public void C(View view) {
            if (view instanceof x) {
                ((x) view).stopNestedScroll();
            }
        }

        public boolean D(View view) {
            return ai.c(view);
        }

        public int a(int i, int i2) {
            return i | i2;
        }

        public float E(View view) {
            return w(view) + v(view);
        }

        public boolean F(View view) {
            return ai.f(view);
        }

        public boolean G(View view) {
            return false;
        }

        public void a(View view, int i, int i2) {
        }

        public void e(View view, int i) {
            ai.b(view, i);
        }

        public void f(View view, int i) {
            ai.a(view, i);
        }
    }

    /* compiled from: ViewCompat */
    static class b extends a {
        b() {
        }
    }

    /* compiled from: ViewCompat */
    static class c extends b {
        c() {
        }

        public int a(View view) {
            return aj.a(view);
        }
    }

    /* compiled from: ViewCompat */
    static class d extends c {
        d() {
        }

        long a() {
            return ak.a();
        }

        public float f(View view) {
            return ak.a(view);
        }

        public void a(View view, int i, Paint paint) {
            ak.a(view, i, paint);
        }

        public int g(View view) {
            return ak.b(view);
        }

        public int a(int i, int i2, int i3) {
            return ak.a(i, i2, i3);
        }

        public int j(View view) {
            return ak.c(view);
        }

        public int k(View view) {
            return ak.d(view);
        }

        public float o(View view) {
            return ak.e(view);
        }

        public float p(View view) {
            return ak.f(view);
        }

        public void a(View view, float f) {
            ak.a(view, f);
        }

        public void b(View view, float f) {
            ak.b(view, f);
        }

        public void c(View view, float f) {
            ak.c(view, f);
        }

        public void y(View view) {
            ak.g(view);
        }

        public void b(View view, boolean z) {
            ak.a(view, z);
        }

        public void c(View view, boolean z) {
            ak.b(view, z);
        }

        public int a(int i, int i2) {
            return ak.a(i, i2);
        }

        public void e(View view, int i) {
            ak.b(view, i);
        }

        public void f(View view, int i) {
            ak.a(view, i);
        }
    }

    /* compiled from: ViewCompat */
    static class f extends d {
        static Field b;
        static boolean c = false;

        f() {
        }

        public boolean a(View view, int i) {
            return al.a(view, i);
        }

        public boolean b(View view, int i) {
            return al.b(view, i);
        }

        public void a(View view, a aVar) {
            al.a(view, aVar == null ? null : aVar.a());
        }

        public boolean b(View view) {
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

        public az s(View view) {
            if (this.a == null) {
                this.a = new WeakHashMap();
            }
            az azVar = (az) this.a.get(view);
            if (azVar != null) {
                return azVar;
            }
            azVar = new az(view);
            this.a.put(view, azVar);
            return azVar;
        }

        public void a(View view, boolean z) {
            al.a(view, z);
        }
    }

    /* compiled from: ViewCompat */
    static class e extends f {
        e() {
        }

        public boolean G(View view) {
            return am.a(view);
        }
    }

    /* compiled from: ViewCompat */
    static class g extends e {
        g() {
        }

        public boolean c(View view) {
            return an.a(view);
        }

        public void d(View view) {
            an.b(view);
        }

        public void a(View view, Runnable runnable) {
            an.a(view, runnable);
        }

        public void a(View view, Runnable runnable, long j) {
            an.a(view, runnable, j);
        }

        public int e(View view) {
            return an.c(view);
        }

        public void c(View view, int i) {
            if (i == 4) {
                i = 2;
            }
            an.a(view, i);
        }

        public ViewParent i(View view) {
            return an.d(view);
        }

        public int q(View view) {
            return an.e(view);
        }

        public int r(View view) {
            return an.f(view);
        }

        public void u(View view) {
            an.g(view);
        }

        public boolean x(View view) {
            return an.h(view);
        }

        public boolean n(View view) {
            return an.i(view);
        }
    }

    /* compiled from: ViewCompat */
    static class h extends g {
        h() {
        }

        public int h(View view) {
            return ao.a(view);
        }

        public int l(View view) {
            return ao.b(view);
        }

        public int m(View view) {
            return ao.c(view);
        }

        public void a(View view, int i, int i2, int i3, int i4) {
            ao.a(view, i, i2, i3, i4);
        }

        public int t(View view) {
            return ao.d(view);
        }

        public boolean z(View view) {
            return ao.e(view);
        }
    }

    /* compiled from: ViewCompat */
    static class i extends h {
        i() {
        }
    }

    /* compiled from: ViewCompat */
    static class j extends i {
        j() {
        }

        public void d(View view, int i) {
            ap.a(view, i);
        }

        public void c(View view, int i) {
            an.a(view, i);
        }

        public boolean D(View view) {
            return ap.a(view);
        }

        public boolean F(View view) {
            return ap.b(view);
        }
    }

    /* compiled from: ViewCompat */
    static class k extends j {
        k() {
        }

        public void u(View view) {
            aq.a(view);
        }

        public void d(View view, float f) {
            aq.a(view, f);
        }

        public float v(View view) {
            return aq.b(view);
        }

        public float w(View view) {
            return aq.c(view);
        }

        public void a(View view, ab abVar) {
            aq.a(view, abVar);
        }

        public void C(View view) {
            aq.f(view);
        }

        public ColorStateList A(View view) {
            return aq.d(view);
        }

        public void a(View view, ColorStateList colorStateList) {
            aq.a(view, colorStateList);
        }

        public void a(View view, Mode mode) {
            aq.a(view, mode);
        }

        public Mode B(View view) {
            return aq.e(view);
        }

        public bg a(View view, bg bgVar) {
            return aq.a(view, bgVar);
        }

        public bg b(View view, bg bgVar) {
            return aq.b(view, bgVar);
        }

        public float E(View view) {
            return aq.g(view);
        }

        public void e(View view, int i) {
            aq.b(view, i);
        }

        public void f(View view, int i) {
            aq.a(view, i);
        }
    }

    /* compiled from: ViewCompat */
    static class l extends k {
        l() {
        }

        public void a(View view, int i, int i2) {
            ar.a(view, i, i2);
        }

        public void e(View view, int i) {
            ar.b(view, i);
        }

        public void f(View view, int i) {
            ar.a(view, i);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            a = new l();
        } else if (i >= 21) {
            a = new k();
        } else if (i >= 19) {
            a = new j();
        } else if (i >= 17) {
            a = new h();
        } else if (i >= 16) {
            a = new g();
        } else if (i >= 15) {
            a = new e();
        } else if (i >= 14) {
            a = new f();
        } else if (i >= 11) {
            a = new d();
        } else if (i >= 9) {
            a = new c();
        } else if (i >= 7) {
            a = new b();
        } else {
            a = new a();
        }
    }

    public static boolean a(View view, int i) {
        return a.a(view, i);
    }

    public static boolean b(View view, int i) {
        return a.b(view, i);
    }

    public static int a(View view) {
        return a.a(view);
    }

    public static void a(View view, a aVar) {
        a.a(view, aVar);
    }

    public static boolean b(View view) {
        return a.b(view);
    }

    public static boolean c(View view) {
        return a.c(view);
    }

    public static void d(View view) {
        a.d(view);
    }

    public static void a(View view, Runnable runnable) {
        a.a(view, runnable);
    }

    public static void a(View view, Runnable runnable, long j) {
        a.a(view, runnable, j);
    }

    public static int e(View view) {
        return a.e(view);
    }

    public static void c(View view, int i) {
        a.c(view, i);
    }

    public static float f(View view) {
        return a.f(view);
    }

    public static void a(View view, int i, Paint paint) {
        a.a(view, i, paint);
    }

    public static int g(View view) {
        return a.g(view);
    }

    public static int h(View view) {
        return a.h(view);
    }

    public static ViewParent i(View view) {
        return a.i(view);
    }

    public static int a(int i, int i2, int i3) {
        return a.a(i, i2, i3);
    }

    public static int j(View view) {
        return a.j(view);
    }

    public static int k(View view) {
        return a.k(view);
    }

    public static int a(int i, int i2) {
        return a.a(i, i2);
    }

    public static void d(View view, int i) {
        a.d(view, i);
    }

    public static int l(View view) {
        return a.l(view);
    }

    public static int m(View view) {
        return a.m(view);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.a(view, i, i2, i3, i4);
    }

    public static float n(View view) {
        return a.o(view);
    }

    public static float o(View view) {
        return a.p(view);
    }

    public static int p(View view) {
        return a.q(view);
    }

    public static int q(View view) {
        return a.r(view);
    }

    public static az r(View view) {
        return a.s(view);
    }

    public static void a(View view, float f) {
        a.a(view, f);
    }

    public static void b(View view, float f) {
        a.b(view, f);
    }

    public static void c(View view, float f) {
        a.c(view, f);
    }

    public static void d(View view, float f) {
        a.d(view, f);
    }

    public static float s(View view) {
        return a.v(view);
    }

    public static int t(View view) {
        return a.t(view);
    }

    public static void u(View view) {
        a.u(view);
    }

    public static boolean v(View view) {
        return a.x(view);
    }

    public static void a(View view, boolean z) {
        a.a(view, z);
    }

    public static void w(View view) {
        a.y(view);
    }

    public static void a(View view, ab abVar) {
        a.a(view, abVar);
    }

    public static bg a(View view, bg bgVar) {
        return a.a(view, bgVar);
    }

    public static bg b(View view, bg bgVar) {
        return a.b(view, bgVar);
    }

    public static void b(View view, boolean z) {
        a.b(view, z);
    }

    public static void c(View view, boolean z) {
        a.c(view, z);
    }

    public static boolean x(View view) {
        return a.n(view);
    }

    public static boolean y(View view) {
        return a.z(view);
    }

    public static ColorStateList z(View view) {
        return a.A(view);
    }

    public static void a(View view, ColorStateList colorStateList) {
        a.a(view, colorStateList);
    }

    public static Mode A(View view) {
        return a.B(view);
    }

    public static void a(View view, Mode mode) {
        a.a(view, mode);
    }

    public static void B(View view) {
        a.C(view);
    }

    public static boolean C(View view) {
        return a.D(view);
    }

    public static float D(View view) {
        return a.E(view);
    }

    public static void e(View view, int i) {
        a.f(view, i);
    }

    public static void f(View view, int i) {
        a.e(view, i);
    }

    public static boolean E(View view) {
        return a.F(view);
    }

    public static boolean F(View view) {
        return a.G(view);
    }

    public static void a(View view, int i, int i2) {
        a.a(view, i, i2);
    }
}
