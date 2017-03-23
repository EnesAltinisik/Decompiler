package com.google.android.gms.b;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.b.ui.a;
import java.util.Map;

@vz
public class uj extends uk implements rq {
    DisplayMetrics a;
    int b = -1;
    int c = -1;
    int d = -1;
    int e = -1;
    int f = -1;
    int g = -1;
    private final aaq h;
    private final Context i;
    private final WindowManager j;
    private final pj k;
    private float l;
    private int m;

    public uj(aaq com_google_android_gms_b_aaq, Context context, pj pjVar) {
        super(com_google_android_gms_b_aaq);
        this.h = com_google_android_gms_b_aaq;
        this.i = context;
        this.k = pjVar;
        this.j = (WindowManager) context.getSystemService("window");
    }

    private void g() {
        this.a = new DisplayMetrics();
        Display defaultDisplay = this.j.getDefaultDisplay();
        defaultDisplay.getMetrics(this.a);
        this.l = this.a.density;
        this.m = defaultDisplay.getRotation();
    }

    private void h() {
        int[] iArr = new int[2];
        this.h.getLocationOnScreen(iArr);
        a(oc.a().b(this.i, iArr[0]), oc.a().b(this.i, iArr[1]));
    }

    private ui i() {
        return new a().b(this.k.a()).a(this.k.b()).c(this.k.e()).d(this.k.c()).e(true).a();
    }

    void a() {
        this.b = oc.a().b(this.a, this.a.widthPixels);
        this.c = oc.a().b(this.a, this.a.heightPixels);
        Activity f = this.h.f();
        if (f == null || f.getWindow() == null) {
            this.d = this.b;
            this.e = this.c;
            return;
        }
        int[] a = v.e().a(f);
        this.d = oc.a().b(this.a, a[0]);
        this.e = oc.a().b(this.a, a[1]);
    }

    public void a(int i, int i2) {
        int i3 = this.i instanceof Activity ? v.e().d((Activity) this.i)[0] : 0;
        if (this.h.k() == null || !this.h.k().e) {
            this.f = oc.a().b(this.i, this.h.getMeasuredWidth());
            this.g = oc.a().b(this.i, this.h.getMeasuredHeight());
        }
        b(i, i2 - i3, this.f, this.g);
        this.h.l().a(i, i2);
    }

    public void a(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
        c();
    }

    void b() {
        if (this.h.k().e) {
            this.f = this.b;
            this.g = this.c;
            return;
        }
        this.h.measure(0, 0);
    }

    public void c() {
        g();
        a();
        b();
        e();
        f();
        h();
        d();
    }

    void d() {
        if (zy.a(2)) {
            zy.d("Dispatching Ready Event.");
        }
        c(this.h.o().b);
    }

    void e() {
        a(this.b, this.c, this.d, this.e, this.l, this.m);
    }

    void f() {
        this.h.b("onDeviceFeaturesReceived", i().a());
    }
}
