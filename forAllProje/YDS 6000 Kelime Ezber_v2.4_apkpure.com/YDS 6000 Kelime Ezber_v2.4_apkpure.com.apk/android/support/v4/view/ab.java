package android.support.v4.view;

import android.content.Context;

public final class ab {
    static final c a;
    private Object b;

    interface c {
        Object a(Context context, int i);
    }

    static class b implements c {
        b() {
        }

        public Object a(Context context, int i) {
            return null;
        }
    }

    static class a extends b {
        a() {
        }

        public Object a(Context context, int i) {
            return ac.a(context, i);
        }
    }

    static {
        if (android.support.v4.g.c.a()) {
            a = new a();
        } else {
            a = new b();
        }
    }

    private ab(Object obj) {
        this.b = obj;
    }

    public static ab a(Context context, int i) {
        return new ab(a.a(context, i));
    }

    public Object a() {
        return this.b;
    }
}
