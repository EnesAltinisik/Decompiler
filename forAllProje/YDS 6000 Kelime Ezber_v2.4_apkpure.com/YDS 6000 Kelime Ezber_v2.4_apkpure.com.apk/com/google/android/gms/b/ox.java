package com.google.android.gms.b;

import android.content.Context;

@vz
public class ox {
    private static ox a;
    private static final Object b = new Object();
    private op c;

    private ox() {
    }

    public static ox a() {
        ox oxVar;
        synchronized (b) {
            if (a == null) {
                a = new ox();
            }
            oxVar = a;
        }
        return oxVar;
    }

    public void a(Context context, String str, oy oyVar) {
        synchronized (b) {
            if (this.c != null) {
            } else if (context == null) {
                throw new IllegalArgumentException("Context cannot be null.");
            } else {
                try {
                    this.c = oc.b().a(context);
                    this.c.b();
                    if (str != null) {
                        this.c.a(str);
                    }
                } catch (Throwable e) {
                    zy.c("Fail to initialize or set applicationCode on mobile ads setting manager", e);
                }
            }
        }
    }
}
