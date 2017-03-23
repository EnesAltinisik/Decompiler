package com.google.android.gms.b;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.v;

@vz
public final class zw {
    private final View a;
    private Activity b;
    private boolean c;
    private boolean d;
    private boolean e;
    private OnGlobalLayoutListener f;
    private OnScrollChangedListener g;

    public zw(Activity activity, View view, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        this.b = activity;
        this.a = view;
        this.f = onGlobalLayoutListener;
        this.g = onScrollChangedListener;
    }

    private void e() {
        if (!this.c) {
            if (this.f != null) {
                if (this.b != null) {
                    v.e().a(this.b, this.f);
                }
                v.C().a(this.a, this.f);
            }
            if (this.g != null) {
                if (this.b != null) {
                    v.e().a(this.b, this.g);
                }
                v.C().a(this.a, this.g);
            }
            this.c = true;
        }
    }

    private void f() {
        if (this.b != null && this.c) {
            if (!(this.f == null || this.b == null)) {
                v.g().a(this.b, this.f);
            }
            if (!(this.g == null || this.b == null)) {
                v.e().b(this.b, this.g);
            }
            this.c = false;
        }
    }

    public void a() {
        this.e = true;
        if (this.d) {
            e();
        }
    }

    public void a(Activity activity) {
        this.b = activity;
    }

    public void b() {
        this.e = false;
        f();
    }

    public void c() {
        this.d = true;
        if (this.e) {
            e();
        }
    }

    public void d() {
        this.d = false;
        f();
    }
}
