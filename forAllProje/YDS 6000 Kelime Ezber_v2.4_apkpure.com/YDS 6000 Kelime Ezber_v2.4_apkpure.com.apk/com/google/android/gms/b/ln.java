package com.google.android.gms.b;

import java.io.IOException;

public abstract class ln {
    protected volatile int ah = -1;

    public static final <T extends ln> T a(T t, byte[] bArr) {
        return b(t, bArr, 0, bArr.length);
    }

    public static final void a(ln lnVar, byte[] bArr, int i, int i2) {
        try {
            lg a = lg.a(bArr, i, i2);
            lnVar.a(a);
            a.b();
        } catch (Throwable e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public static final byte[] a(ln lnVar) {
        byte[] bArr = new byte[lnVar.f()];
        a(lnVar, bArr, 0, bArr.length);
        return bArr;
    }

    public static final <T extends ln> T b(T t, byte[] bArr, int i, int i2) {
        try {
            lf a = lf.a(bArr, i, i2);
            t.b(a);
            a.a(0);
            return t;
        } catch (lm e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public void a(lg lgVar) {
    }

    protected int b() {
        return 0;
    }

    public abstract ln b(lf lfVar);

    public /* synthetic */ Object clone() {
        return d();
    }

    public ln d() {
        return (ln) super.clone();
    }

    public int e() {
        if (this.ah < 0) {
            f();
        }
        return this.ah;
    }

    public int f() {
        int b = b();
        this.ah = b;
        return b;
    }

    public String toString() {
        return lo.a(this);
    }
}
