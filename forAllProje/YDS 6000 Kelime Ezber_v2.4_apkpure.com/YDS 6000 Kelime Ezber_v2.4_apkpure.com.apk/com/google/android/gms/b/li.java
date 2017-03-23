package com.google.android.gms.b;

import java.lang.reflect.Array;

public class li<M extends lh<M>, T> {
    protected final int a;
    protected final Class<T> b;
    public final int c;
    protected final boolean d;

    int a(Object obj) {
        return this.d ? b(obj) : c(obj);
    }

    void a(Object obj, lg lgVar) {
        if (this.d) {
            c(obj, lgVar);
        } else {
            b(obj, lgVar);
        }
    }

    protected int b(Object obj) {
        int i = 0;
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            if (Array.get(obj, i2) != null) {
                i += c(Array.get(obj, i2));
            }
        }
        return i;
    }

    protected void b(Object obj, lg lgVar) {
        try {
            lgVar.e(this.c);
            switch (this.a) {
                case 10:
                    ln lnVar = (ln) obj;
                    int b = lq.b(this.c);
                    lgVar.a(lnVar);
                    lgVar.c(b, 4);
                    return;
                case 11:
                    lgVar.b((ln) obj);
                    return;
                default:
                    throw new IllegalArgumentException("Unknown type " + this.a);
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
        throw new IllegalStateException(e);
    }

    protected int c(Object obj) {
        int b = lq.b(this.c);
        switch (this.a) {
            case 10:
                return lg.b(b, (ln) obj);
            case 11:
                return lg.c(b, (ln) obj);
            default:
                throw new IllegalArgumentException("Unknown type " + this.a);
        }
    }

    protected void c(Object obj, lg lgVar) {
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                b(obj2, lgVar);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li)) {
            return false;
        }
        li liVar = (li) obj;
        return this.a == liVar.a && this.b == liVar.b && this.c == liVar.c && this.d == liVar.d;
    }

    public int hashCode() {
        return (this.d ? 1 : 0) + ((((((this.a + 1147) * 31) + this.b.hashCode()) * 31) + this.c) * 31);
    }
}
