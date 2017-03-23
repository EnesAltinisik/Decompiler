package com.google.android.gms.a;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.m;

public abstract class c<T> {
    private final String a;
    private T b;

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected c(String str) {
        this.a = str;
    }

    protected final T a(Context context) {
        if (this.b == null) {
            com.google.android.gms.common.internal.c.a((Object) context);
            Context g = m.g(context);
            if (g == null) {
                throw new a("Could not get remote context.");
            }
            try {
                this.b = a((IBinder) g.getClassLoader().loadClass(this.a).newInstance());
            } catch (Throwable e) {
                throw new a("Could not load creator class.", e);
            } catch (Throwable e2) {
                throw new a("Could not instantiate creator.", e2);
            } catch (Throwable e22) {
                throw new a("Could not access creator.", e22);
            }
        }
        return this.b;
    }

    protected abstract T a(IBinder iBinder);
}
