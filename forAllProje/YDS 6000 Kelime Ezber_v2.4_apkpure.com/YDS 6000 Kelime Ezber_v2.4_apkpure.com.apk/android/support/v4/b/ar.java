package android.support.v4.b;

import android.os.Build.VERSION;
import android.os.Bundle;

public final class ar extends android.support.v4.b.at.a {
    public static final android.support.v4.b.at.a.a a = new android.support.v4.b.at.a.a() {
    };
    private static final a g;
    private final String b;
    private final CharSequence c;
    private final CharSequence[] d;
    private final boolean e;
    private final Bundle f;

    interface a {
    }

    static class b implements a {
        b() {
        }
    }

    static class c implements a {
        c() {
        }
    }

    static class d implements a {
        d() {
        }
    }

    static {
        if (VERSION.SDK_INT >= 20) {
            g = new b();
        } else if (VERSION.SDK_INT >= 16) {
            g = new d();
        } else {
            g = new c();
        }
    }

    public String a() {
        return this.b;
    }

    public CharSequence b() {
        return this.c;
    }

    public CharSequence[] c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public Bundle e() {
        return this.f;
    }
}
