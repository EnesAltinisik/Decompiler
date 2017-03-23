package android.support.v4.view;

import android.os.Build.VERSION;

public class bf {
    private static final d a;
    private final Object b;

    private interface d {
        bf a(Object obj);

        bf a(Object obj, int i, int i2, int i3, int i4);

        int b(Object obj);

        int c(Object obj);

        int d(Object obj);

        int e(Object obj);

        boolean f(Object obj);

        boolean g(Object obj);
    }

    private static class c implements d {
        c() {
        }

        public bf a(Object obj) {
            return null;
        }

        public bf a(Object obj, int i, int i2, int i3, int i4) {
            return null;
        }

        public int b(Object obj) {
            return 0;
        }

        public int c(Object obj) {
            return 0;
        }

        public int d(Object obj) {
            return 0;
        }

        public int e(Object obj) {
            return 0;
        }

        public boolean f(Object obj) {
            return false;
        }

        public boolean g(Object obj) {
            return false;
        }
    }

    private static class a extends c {
        a() {
        }

        public bf a(Object obj) {
            return new bf(bg.a(obj));
        }

        public bf a(Object obj, int i, int i2, int i3, int i4) {
            return new bf(bg.a(obj, i, i2, i3, i4));
        }

        public int b(Object obj) {
            return bg.b(obj);
        }

        public int c(Object obj) {
            return bg.c(obj);
        }

        public int d(Object obj) {
            return bg.d(obj);
        }

        public int e(Object obj) {
            return bg.e(obj);
        }

        public boolean f(Object obj) {
            return bg.f(obj);
        }
    }

    private static class b extends a {
        b() {
        }

        public boolean g(Object obj) {
            return bh.a(obj);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            a = new b();
        } else if (i >= 20) {
            a = new a();
        } else {
            a = new c();
        }
    }

    bf(Object obj) {
        this.b = obj;
    }

    static bf a(Object obj) {
        return obj == null ? null : new bf(obj);
    }

    static Object a(bf bfVar) {
        return bfVar == null ? null : bfVar.b;
    }

    public int a() {
        return a.c(this.b);
    }

    public bf a(int i, int i2, int i3, int i4) {
        return a.a(this.b, i, i2, i3, i4);
    }

    public int b() {
        return a.e(this.b);
    }

    public int c() {
        return a.d(this.b);
    }

    public int d() {
        return a.b(this.b);
    }

    public boolean e() {
        return a.f(this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bf bfVar = (bf) obj;
        return this.b == null ? bfVar.b == null : this.b.equals(bfVar.b);
    }

    public boolean f() {
        return a.g(this.b);
    }

    public bf g() {
        return a.a(this.b);
    }

    public int hashCode() {
        return this.b == null ? 0 : this.b.hashCode();
    }
}
