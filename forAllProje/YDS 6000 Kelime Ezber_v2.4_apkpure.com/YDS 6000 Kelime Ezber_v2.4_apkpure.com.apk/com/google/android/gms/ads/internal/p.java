package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.a.b;
import com.google.android.gms.b.aab;
import com.google.android.gms.b.op.a;
import com.google.android.gms.b.pr;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.zl;
import com.google.android.gms.b.zy;

@vz
public class p extends a {
    private static final Object b = new Object();
    private static p c;
    private final Context a;
    private final Object d = new Object();
    private boolean e;
    private boolean f;
    private float g = -1.0f;
    private aab h;

    p(Context context, aab com_google_android_gms_b_aab) {
        this.a = context;
        this.h = com_google_android_gms_b_aab;
        this.e = false;
    }

    public static p a() {
        p pVar;
        synchronized (b) {
            pVar = c;
        }
        return pVar;
    }

    public static p a(Context context, aab com_google_android_gms_b_aab) {
        p pVar;
        synchronized (b) {
            if (c == null) {
                c = new p(context.getApplicationContext(), com_google_android_gms_b_aab);
            }
            pVar = c;
        }
        return pVar;
    }

    public void a(float f) {
        synchronized (this.d) {
            this.g = f;
        }
    }

    public void a(com.google.android.gms.a.a aVar, String str) {
        zl b = b(aVar, str);
        if (b == null) {
            zy.c("Context is null. Failed to open debug menu.");
        } else {
            b.a();
        }
    }

    public void a(String str) {
        pr.a(this.a);
        if (!TextUtils.isEmpty(str) && ((Boolean) pr.cz.c()).booleanValue()) {
            v.A().a(this.a, this.h, true, null, str, null);
        }
    }

    public void a(boolean z) {
        synchronized (this.d) {
            this.f = z;
        }
    }

    protected zl b(com.google.android.gms.a.a aVar, String str) {
        if (aVar == null) {
            return null;
        }
        Context context = (Context) b.a(aVar);
        if (context == null) {
            return null;
        }
        zl zlVar = new zl(context);
        zlVar.a(str);
        return zlVar;
    }

    public void b() {
        synchronized (b) {
            if (this.e) {
                zy.e("Mobile ads is initialized already.");
                return;
            }
            this.e = true;
            pr.a(this.a);
            v.i().a(this.a, this.h);
            v.j().a(this.a);
        }
    }

    public float c() {
        float f;
        synchronized (this.d) {
            f = this.g;
        }
        return f;
    }

    public boolean d() {
        boolean z;
        synchronized (this.d) {
            z = this.g >= 0.0f;
        }
        return z;
    }

    public boolean e() {
        boolean z;
        synchronized (this.d) {
            z = this.f;
        }
        return z;
    }
}
