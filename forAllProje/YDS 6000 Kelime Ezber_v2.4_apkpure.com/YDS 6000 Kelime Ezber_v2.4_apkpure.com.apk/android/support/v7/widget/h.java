package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.ah;
import android.support.v7.appcompat.R;
import android.util.AttributeSet;
import android.view.View;

class h {
    private final View a;
    private final l b;
    private int c = -1;
    private bj d;
    private bj e;
    private bj f;

    h(View view) {
        this.a = view;
        this.b = l.a();
    }

    private boolean b(Drawable drawable) {
        if (this.f == null) {
            this.f = new bj();
        }
        bj bjVar = this.f;
        bjVar.a();
        ColorStateList B = ah.B(this.a);
        if (B != null) {
            bjVar.d = true;
            bjVar.a = B;
        }
        Mode C = ah.C(this.a);
        if (C != null) {
            bjVar.c = true;
            bjVar.b = C;
        }
        if (!bjVar.d && !bjVar.c) {
            return false;
        }
        l.a(drawable, bjVar, this.a.getDrawableState());
        return true;
    }

    private boolean d() {
        int i = VERSION.SDK_INT;
        return i < 21 ? false : i == 21 || this.d != null;
    }

    ColorStateList a() {
        return this.e != null ? this.e.a : null;
    }

    void a(int i) {
        this.c = i;
        b(this.b != null ? this.b.b(this.a.getContext(), i) : null);
        c();
    }

    void a(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new bj();
        }
        this.e.a = colorStateList;
        this.e.d = true;
        c();
    }

    void a(Mode mode) {
        if (this.e == null) {
            this.e = new bj();
        }
        this.e.b = mode;
        this.e.c = true;
        c();
    }

    void a(Drawable drawable) {
        this.c = -1;
        b(null);
        c();
    }

    void a(AttributeSet attributeSet, int i) {
        bl a = bl.a(this.a.getContext(), attributeSet, R.styleable.ViewBackgroundHelper, i, 0);
        try {
            if (a.g(R.styleable.ViewBackgroundHelper_android_background)) {
                this.c = a.g(R.styleable.ViewBackgroundHelper_android_background, -1);
                ColorStateList b = this.b.b(this.a.getContext(), this.c);
                if (b != null) {
                    b(b);
                }
            }
            if (a.g(R.styleable.ViewBackgroundHelper_backgroundTint)) {
                ah.a(this.a, a.e(R.styleable.ViewBackgroundHelper_backgroundTint));
            }
            if (a.g(R.styleable.ViewBackgroundHelper_backgroundTintMode)) {
                ah.a(this.a, aj.a(a.a(R.styleable.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
            a.a();
        } catch (Throwable th) {
            a.a();
        }
    }

    Mode b() {
        return this.e != null ? this.e.b : null;
    }

    void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new bj();
            }
            this.d.a = colorStateList;
            this.d.d = true;
        } else {
            this.d = null;
        }
        c();
    }

    void c() {
        Drawable background = this.a.getBackground();
        if (background == null) {
            return;
        }
        if (!d() || !b(background)) {
            if (this.e != null) {
                l.a(background, this.e, this.a.getDrawableState());
            } else if (this.d != null) {
                l.a(background, this.d, this.a.getDrawableState());
            }
        }
    }
}
