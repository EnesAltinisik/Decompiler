package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.b.xq.a;

@vz
public class xn extends a {
    private final Context a;
    private final Object b;
    private final aab c;
    private final xo d;

    public xn(Context context, d dVar, tn tnVar, aab com_google_android_gms_b_aab) {
        this(context, com_google_android_gms_b_aab, new xo(context, dVar, nx.a(), tnVar, com_google_android_gms_b_aab));
    }

    xn(Context context, aab com_google_android_gms_b_aab, xo xoVar) {
        this.b = new Object();
        this.a = context;
        this.c = com_google_android_gms_b_aab;
        this.d = xoVar;
    }

    public void a() {
        synchronized (this.b) {
            this.d.J();
        }
    }

    public void a(com.google.android.gms.a.a aVar) {
        synchronized (this.b) {
            this.d.n();
        }
    }

    public void a(xs xsVar) {
        synchronized (this.b) {
            this.d.a(xsVar);
        }
    }

    public void a(xw xwVar) {
        synchronized (this.b) {
            this.d.a(xwVar);
        }
    }

    public void a(String str) {
        zy.e("RewardedVideoAd.setUserId() is deprecated. Please do not call this method.");
    }

    public void b(com.google.android.gms.a.a aVar) {
        synchronized (this.b) {
            Context context = aVar == null ? null : (Context) b.a(aVar);
            if (context != null) {
                try {
                    this.d.a(context);
                } catch (Throwable e) {
                    zy.c("Unable to extract updated context.", e);
                }
            }
            this.d.o();
        }
    }

    public boolean b() {
        boolean K;
        synchronized (this.b) {
            K = this.d.K();
        }
        return K;
    }

    public void c() {
        a(null);
    }

    public void c(com.google.android.gms.a.a aVar) {
        synchronized (this.b) {
            this.d.i();
        }
    }

    public void d() {
        b(null);
    }

    public void e() {
        c(null);
    }
}
