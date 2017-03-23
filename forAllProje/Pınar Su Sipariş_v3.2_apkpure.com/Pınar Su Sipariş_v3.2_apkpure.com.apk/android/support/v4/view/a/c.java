package android.support.v4.view.a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import com.google.android.gms.drive.MetadataChangeSet;

/* compiled from: AccessibilityNodeInfoCompat */
public class c {
    private static final e a;
    private final Object b;

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class a {
        public static final a a = new a(1, null);
        public static final a b = new a(2, null);
        public static final a c = new a(4, null);
        public static final a d = new a(8, null);
        public static final a e = new a(16, null);
        public static final a f = new a(32, null);
        public static final a g = new a(64, null);
        public static final a h = new a(128, null);
        public static final a i = new a(256, null);
        public static final a j = new a(512, null);
        public static final a k = new a(1024, null);
        public static final a l = new a(2048, null);
        public static final a m = new a(4096, null);
        public static final a n = new a(8192, null);
        public static final a o = new a(16384, null);
        public static final a p = new a(32768, null);
        public static final a q = new a(65536, null);
        public static final a r = new a(MetadataChangeSet.INDEXABLE_TEXT_SIZE_LIMIT_BYTES, null);
        public static final a s = new a(262144, null);
        public static final a t = new a(524288, null);
        public static final a u = new a(1048576, null);
        public static final a v = new a(2097152, null);
        private final Object w;

        public a(int i, CharSequence charSequence) {
            this(c.a.a(i, charSequence));
        }

        private a(Object obj) {
            this.w = obj;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    interface e {
        Object a(int i, int i2, int i3, int i4, boolean z, boolean z2);

        Object a(int i, int i2, boolean z, int i3);

        Object a(int i, CharSequence charSequence);

        Object a(Object obj);

        void a(Object obj, int i);

        void a(Object obj, Rect rect);

        void a(Object obj, View view);

        void a(Object obj, CharSequence charSequence);

        void a(Object obj, boolean z);

        boolean a(Object obj, Object obj2);

        int b(Object obj);

        void b(Object obj, Rect rect);

        void b(Object obj, View view);

        void b(Object obj, CharSequence charSequence);

        void b(Object obj, Object obj2);

        void b(Object obj, boolean z);

        CharSequence c(Object obj);

        void c(Object obj, Rect rect);

        void c(Object obj, View view);

        void c(Object obj, CharSequence charSequence);

        void c(Object obj, Object obj2);

        void c(Object obj, boolean z);

        CharSequence d(Object obj);

        void d(Object obj, Rect rect);

        void d(Object obj, boolean z);

        CharSequence e(Object obj);

        void e(Object obj, boolean z);

        CharSequence f(Object obj);

        void f(Object obj, boolean z);

        void g(Object obj, boolean z);

        boolean g(Object obj);

        void h(Object obj, boolean z);

        boolean h(Object obj);

        void i(Object obj, boolean z);

        boolean i(Object obj);

        boolean j(Object obj);

        boolean k(Object obj);

        boolean l(Object obj);

        boolean m(Object obj);

        boolean n(Object obj);

        boolean o(Object obj);

        boolean p(Object obj);

        void q(Object obj);

        boolean r(Object obj);

        boolean s(Object obj);

        String t(Object obj);
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    static class j implements e {
        j() {
        }

        public Object a(int i, CharSequence charSequence) {
            return null;
        }

        public Object a(Object obj) {
            return null;
        }

        public void a(Object obj, int i) {
        }

        public boolean a(Object obj, Object obj2) {
            return false;
        }

        public void a(Object obj, View view) {
        }

        public int b(Object obj) {
            return 0;
        }

        public void a(Object obj, Rect rect) {
        }

        public void b(Object obj, Rect rect) {
        }

        public CharSequence c(Object obj) {
            return null;
        }

        public CharSequence d(Object obj) {
            return null;
        }

        public CharSequence e(Object obj) {
            return null;
        }

        public CharSequence f(Object obj) {
            return null;
        }

        public boolean g(Object obj) {
            return false;
        }

        public boolean h(Object obj) {
            return false;
        }

        public boolean i(Object obj) {
            return false;
        }

        public boolean j(Object obj) {
            return false;
        }

        public boolean k(Object obj) {
            return false;
        }

        public boolean l(Object obj) {
            return false;
        }

        public boolean r(Object obj) {
            return false;
        }

        public boolean s(Object obj) {
            return false;
        }

        public boolean m(Object obj) {
            return false;
        }

        public boolean n(Object obj) {
            return false;
        }

        public boolean o(Object obj) {
            return false;
        }

        public boolean p(Object obj) {
            return false;
        }

        public void c(Object obj, Rect rect) {
        }

        public void d(Object obj, Rect rect) {
        }

        public void a(Object obj, CharSequence charSequence) {
        }

        public void a(Object obj, boolean z) {
        }

        public void b(Object obj, CharSequence charSequence) {
        }

        public void b(Object obj, boolean z) {
        }

        public void c(Object obj, boolean z) {
        }

        public void d(Object obj, boolean z) {
        }

        public void h(Object obj, boolean z) {
        }

        public void i(Object obj, boolean z) {
        }

        public void e(Object obj, boolean z) {
        }

        public void c(Object obj, CharSequence charSequence) {
        }

        public void b(Object obj, View view) {
        }

        public void f(Object obj, boolean z) {
        }

        public void g(Object obj, boolean z) {
        }

        public void c(Object obj, View view) {
        }

        public void q(Object obj) {
        }

        public String t(Object obj) {
            return null;
        }

        public void b(Object obj, Object obj2) {
        }

        public void c(Object obj, Object obj2) {
        }

        public Object a(int i, int i2, boolean z, int i3) {
            return null;
        }

        public Object a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return null;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    static class d extends j {
        d() {
        }

        public Object a(Object obj) {
            return e.a(obj);
        }

        public void a(Object obj, int i) {
            e.a(obj, i);
        }

        public void a(Object obj, View view) {
            e.a(obj, view);
        }

        public int b(Object obj) {
            return e.b(obj);
        }

        public void a(Object obj, Rect rect) {
            e.a(obj, rect);
        }

        public void b(Object obj, Rect rect) {
            e.b(obj, rect);
        }

        public CharSequence c(Object obj) {
            return e.c(obj);
        }

        public CharSequence d(Object obj) {
            return e.d(obj);
        }

        public CharSequence e(Object obj) {
            return e.e(obj);
        }

        public CharSequence f(Object obj) {
            return e.f(obj);
        }

        public boolean g(Object obj) {
            return e.g(obj);
        }

        public boolean h(Object obj) {
            return e.h(obj);
        }

        public boolean i(Object obj) {
            return e.i(obj);
        }

        public boolean j(Object obj) {
            return e.j(obj);
        }

        public boolean k(Object obj) {
            return e.k(obj);
        }

        public boolean l(Object obj) {
            return e.l(obj);
        }

        public boolean m(Object obj) {
            return e.m(obj);
        }

        public boolean n(Object obj) {
            return e.n(obj);
        }

        public boolean o(Object obj) {
            return e.o(obj);
        }

        public boolean p(Object obj) {
            return e.p(obj);
        }

        public void c(Object obj, Rect rect) {
            e.c(obj, rect);
        }

        public void d(Object obj, Rect rect) {
            e.d(obj, rect);
        }

        public void a(Object obj, CharSequence charSequence) {
            e.a(obj, charSequence);
        }

        public void a(Object obj, boolean z) {
            e.a(obj, z);
        }

        public void b(Object obj, CharSequence charSequence) {
            e.b(obj, charSequence);
        }

        public void b(Object obj, boolean z) {
            e.b(obj, z);
        }

        public void c(Object obj, boolean z) {
            e.c(obj, z);
        }

        public void d(Object obj, boolean z) {
            e.d(obj, z);
        }

        public void e(Object obj, boolean z) {
            e.e(obj, z);
        }

        public void c(Object obj, CharSequence charSequence) {
            e.c(obj, charSequence);
        }

        public void b(Object obj, View view) {
            e.b(obj, view);
        }

        public void f(Object obj, boolean z) {
            e.f(obj, z);
        }

        public void g(Object obj, boolean z) {
            e.g(obj, z);
        }

        public void c(Object obj, View view) {
            e.c(obj, view);
        }

        public void q(Object obj) {
            e.q(obj);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    static class f extends d {
        f() {
        }

        public boolean r(Object obj) {
            return f.a(obj);
        }

        public void h(Object obj, boolean z) {
            f.a(obj, z);
        }

        public boolean s(Object obj) {
            return f.b(obj);
        }

        public void i(Object obj, boolean z) {
            f.b(obj, z);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    static class g extends f {
        g() {
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    static class h extends g {
        h() {
        }

        public String t(Object obj) {
            return g.a(obj);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    static class i extends h {
        i() {
        }

        public void b(Object obj, Object obj2) {
            h.a(obj, obj2);
        }

        public Object a(int i, int i2, boolean z, int i3) {
            return h.a(i, i2, z, i3);
        }

        public Object a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return h.a(i, i2, i3, i4, z);
        }

        public void c(Object obj, Object obj2) {
            h.b(obj, obj2);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    static class b extends i {
        b() {
        }

        public Object a(int i, CharSequence charSequence) {
            return d.a(i, charSequence);
        }

        public Object a(int i, int i2, boolean z, int i3) {
            return d.a(i, i2, z, i3);
        }

        public boolean a(Object obj, Object obj2) {
            return d.a(obj, obj2);
        }

        public Object a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return d.a(i, i2, i3, i4, z, z2);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    static class c extends b {
        c() {
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class k {
        final Object a;

        public static k a(int i, int i2, boolean z, int i3) {
            return new k(c.a.a(i, i2, z, i3));
        }

        private k(Object obj) {
            this.a = obj;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class l {
        private final Object a;

        public static l a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new l(c.a.a(i, i2, i3, i4, z, z2));
        }

        private l(Object obj) {
            this.a = obj;
        }
    }

    static {
        if (VERSION.SDK_INT >= 22) {
            a = new c();
        } else if (VERSION.SDK_INT >= 21) {
            a = new b();
        } else if (VERSION.SDK_INT >= 19) {
            a = new i();
        } else if (VERSION.SDK_INT >= 18) {
            a = new h();
        } else if (VERSION.SDK_INT >= 17) {
            a = new g();
        } else if (VERSION.SDK_INT >= 16) {
            a = new f();
        } else if (VERSION.SDK_INT >= 14) {
            a = new d();
        } else {
            a = new j();
        }
    }

    static c a(Object obj) {
        if (obj != null) {
            return new c(obj);
        }
        return null;
    }

    public c(Object obj) {
        this.b = obj;
    }

    public Object a() {
        return this.b;
    }

    public static c a(c cVar) {
        return a(a.a(cVar.b));
    }

    public void a(View view) {
        a.c(this.b, view);
    }

    public void b(View view) {
        a.a(this.b, view);
    }

    public int b() {
        return a.b(this.b);
    }

    public void a(int i) {
        a.a(this.b, i);
    }

    public boolean a(a aVar) {
        return a.a(this.b, aVar.w);
    }

    public void c(View view) {
        a.b(this.b, view);
    }

    public void a(Rect rect) {
        a.a(this.b, rect);
    }

    public void b(Rect rect) {
        a.c(this.b, rect);
    }

    public void c(Rect rect) {
        a.b(this.b, rect);
    }

    public void d(Rect rect) {
        a.d(this.b, rect);
    }

    public boolean c() {
        return a.g(this.b);
    }

    public boolean d() {
        return a.h(this.b);
    }

    public boolean e() {
        return a.k(this.b);
    }

    public void a(boolean z) {
        a.c(this.b, z);
    }

    public boolean f() {
        return a.l(this.b);
    }

    public void b(boolean z) {
        a.d(this.b, z);
    }

    public boolean g() {
        return a.r(this.b);
    }

    public void c(boolean z) {
        a.h(this.b, z);
    }

    public boolean h() {
        return a.s(this.b);
    }

    public void d(boolean z) {
        a.i(this.b, z);
    }

    public boolean i() {
        return a.p(this.b);
    }

    public void e(boolean z) {
        a.g(this.b, z);
    }

    public boolean j() {
        return a.i(this.b);
    }

    public void f(boolean z) {
        a.a(this.b, z);
    }

    public boolean k() {
        return a.m(this.b);
    }

    public void g(boolean z) {
        a.e(this.b, z);
    }

    public boolean l() {
        return a.j(this.b);
    }

    public void h(boolean z) {
        a.b(this.b, z);
    }

    public boolean m() {
        return a.n(this.b);
    }

    public boolean n() {
        return a.o(this.b);
    }

    public void i(boolean z) {
        a.f(this.b, z);
    }

    public CharSequence o() {
        return a.e(this.b);
    }

    public void a(CharSequence charSequence) {
        a.c(this.b, charSequence);
    }

    public CharSequence p() {
        return a.c(this.b);
    }

    public void b(CharSequence charSequence) {
        a.a(this.b, charSequence);
    }

    public CharSequence q() {
        return a.f(this.b);
    }

    public CharSequence r() {
        return a.d(this.b);
    }

    public void c(CharSequence charSequence) {
        a.b(this.b, charSequence);
    }

    public void s() {
        a.q(this.b);
    }

    public String t() {
        return a.t(this.b);
    }

    public void b(Object obj) {
        a.b(this.b, ((k) obj).a);
    }

    public void c(Object obj) {
        a.c(this.b, ((l) obj).a);
    }

    public int hashCode() {
        return this.b == null ? 0 : this.b.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.b == null) {
            if (cVar.b != null) {
                return false;
            }
            return true;
        } else if (this.b.equals(cVar.b)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        a(rect);
        stringBuilder.append("; boundsInParent: " + rect);
        c(rect);
        stringBuilder.append("; boundsInScreen: " + rect);
        stringBuilder.append("; packageName: ").append(o());
        stringBuilder.append("; className: ").append(p());
        stringBuilder.append("; text: ").append(q());
        stringBuilder.append("; contentDescription: ").append(r());
        stringBuilder.append("; viewId: ").append(t());
        stringBuilder.append("; checkable: ").append(c());
        stringBuilder.append("; checked: ").append(d());
        stringBuilder.append("; focusable: ").append(e());
        stringBuilder.append("; focused: ").append(f());
        stringBuilder.append("; selected: ").append(i());
        stringBuilder.append("; clickable: ").append(j());
        stringBuilder.append("; longClickable: ").append(k());
        stringBuilder.append("; enabled: ").append(l());
        stringBuilder.append("; password: ").append(m());
        stringBuilder.append("; scrollable: " + n());
        stringBuilder.append("; [");
        int b = b();
        while (b != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(b);
            b &= numberOfTrailingZeros ^ -1;
            stringBuilder.append(b(numberOfTrailingZeros));
            if (b != 0) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private static String b(int i) {
        switch (i) {
            case 1:
                return "ACTION_FOCUS";
            case 2:
                return "ACTION_CLEAR_FOCUS";
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case MetadataChangeSet.INDEXABLE_TEXT_SIZE_LIMIT_BYTES /*131072*/:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }
}
