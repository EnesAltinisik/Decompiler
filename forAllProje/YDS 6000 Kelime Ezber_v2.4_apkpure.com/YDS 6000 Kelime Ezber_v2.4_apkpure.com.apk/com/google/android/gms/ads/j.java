package com.google.android.gms.ads;

import com.google.android.gms.b.or;
import com.google.android.gms.b.pg;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.zy;
import com.google.android.gms.common.internal.c;

@vz
public final class j {
    private final Object a = new Object();
    private or b;
    private a c;

    public static abstract class a {
        public void a() {
        }
    }

    public or a() {
        or orVar;
        synchronized (this.a) {
            orVar = this.b;
        }
        return orVar;
    }

    public void a(a aVar) {
        c.a((Object) aVar, (Object) "VideoLifecycleCallbacks may not be null.");
        synchronized (this.a) {
            this.c = aVar;
            if (this.b == null) {
                return;
            }
            try {
                this.b.a(new pg(aVar));
            } catch (Throwable e) {
                zy.b("Unable to call setVideoLifecycleCallbacks on video controller.", e);
            }
        }
    }

    public void a(or orVar) {
        synchronized (this.a) {
            this.b = orVar;
            if (this.c != null) {
                a(this.c);
            }
        }
    }
}
