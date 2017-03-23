package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.dynamite.DynamiteModule;

public class ff {
    private static ff b;
    private DynamiteModule a;

    public static class a extends Exception {
        private a(Throwable th) {
            super(th);
        }
    }

    private ff() {
    }

    public static ff a() {
        ff ffVar;
        synchronized (ff.class) {
            if (b != null) {
                ffVar = b;
            } else {
                b = new ff();
                ffVar = b;
            }
        }
        return ffVar;
    }

    public void a(Context context) {
        synchronized (ff.class) {
            if (this.a != null) {
                return;
            }
            try {
                this.a = DynamiteModule.a(context, DynamiteModule.c, "com.google.android.gms.crash");
            } catch (Throwable e) {
                throw new a(e);
            }
        }
    }

    public fe b() {
        c.a(this.a);
        try {
            return com.google.android.gms.b.fe.a.a(this.a.a("com.google.firebase.crash.internal.api.FirebaseCrashApiImpl"));
        } catch (Throwable e) {
            throw new a(e);
        }
    }
}
