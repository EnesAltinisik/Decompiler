package com.google.android.gms.b;

import com.google.android.gms.common.api.a.a.d;

public final class dw implements d {
    public static final dw a = new a().a();
    private final boolean b;
    private final boolean c;
    private final String d;
    private final boolean e;
    private final String f;
    private final boolean g;
    private final Long h;
    private final Long i;

    public static final class a {
        public dw a() {
            return new dw(false, false, null, false, null, false, null, null);
        }
    }

    private dw(boolean z, boolean z2, String str, boolean z3, String str2, boolean z4, Long l, Long l2) {
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = z3;
        this.g = z4;
        this.f = str2;
        this.h = l;
        this.i = l2;
    }

    public boolean a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public String e() {
        return this.f;
    }

    public boolean f() {
        return this.g;
    }

    public Long g() {
        return this.h;
    }

    public Long h() {
        return this.i;
    }
}
