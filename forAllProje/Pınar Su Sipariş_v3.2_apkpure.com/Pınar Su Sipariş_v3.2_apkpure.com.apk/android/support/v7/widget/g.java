package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.ah;
import android.support.v7.a.a.k;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: AppCompatBackgroundHelper */
class g {
    private final View a;
    private final l b;
    private ax c;
    private ax d;
    private ax e;

    g(View view, l lVar) {
        this.a = view;
        this.b = lVar;
    }

    void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, k.ViewBackgroundHelper, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(k.ViewBackgroundHelper_android_background)) {
                ColorStateList b = this.b.b(this.a.getContext(), obtainStyledAttributes.getResourceId(k.ViewBackgroundHelper_android_background, -1));
                if (b != null) {
                    b(b);
                }
            }
            if (obtainStyledAttributes.hasValue(k.ViewBackgroundHelper_backgroundTint)) {
                ah.a(this.a, obtainStyledAttributes.getColorStateList(k.ViewBackgroundHelper_backgroundTint));
            }
            if (obtainStyledAttributes.hasValue(k.ViewBackgroundHelper_backgroundTintMode)) {
                ah.a(this.a, af.a(obtainStyledAttributes.getInt(k.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    void a(int i) {
        b(this.b != null ? this.b.b(this.a.getContext(), i) : null);
    }

    void a(Drawable drawable) {
        b(null);
    }

    void a(ColorStateList colorStateList) {
        if (this.d == null) {
            this.d = new ax();
        }
        this.d.a = colorStateList;
        this.d.d = true;
        c();
    }

    ColorStateList a() {
        return this.d != null ? this.d.a : null;
    }

    void a(Mode mode) {
        if (this.d == null) {
            this.d = new ax();
        }
        this.d.b = mode;
        this.d.c = true;
        c();
    }

    Mode b() {
        return this.d != null ? this.d.b : null;
    }

    void c() {
        Drawable background = this.a.getBackground();
        if (background == null) {
            return;
        }
        if (VERSION.SDK_INT != 21 || !b(background)) {
            if (this.d != null) {
                l.a(background, this.d, this.a.getDrawableState());
            } else if (this.c != null) {
                l.a(background, this.c, this.a.getDrawableState());
            }
        }
    }

    void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.c == null) {
                this.c = new ax();
            }
            this.c.a = colorStateList;
            this.c.d = true;
        } else {
            this.c = null;
        }
        c();
    }

    private boolean b(Drawable drawable) {
        if (this.e == null) {
            this.e = new ax();
        }
        ax axVar = this.e;
        axVar.a();
        ColorStateList z = ah.z(this.a);
        if (z != null) {
            axVar.d = true;
            axVar.a = z;
        }
        Mode A = ah.A(this.a);
        if (A != null) {
            axVar.c = true;
            axVar.b = A;
        }
        if (!axVar.d && !axVar.c) {
            return false;
        }
        l.a(drawable, axVar, this.a.getDrawableState());
        return true;
    }
}
