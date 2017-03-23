package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.c.a.a;
import android.support.v4.widget.b;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* compiled from: AppCompatCompoundButtonHelper */
class k {
    private final CompoundButton a;
    private final l b;
    private ColorStateList c = null;
    private Mode d = null;
    private boolean e = false;
    private boolean f = false;
    private boolean g;

    k(CompoundButton compoundButton, l lVar) {
        this.a = compoundButton;
        this.b = lVar;
    }

    void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, android.support.v7.a.a.k.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(android.support.v7.a.a.k.CompoundButton_android_button)) {
                int resourceId = obtainStyledAttributes.getResourceId(android.support.v7.a.a.k.CompoundButton_android_button, 0);
                if (resourceId != 0) {
                    this.a.setButtonDrawable(this.b.a(this.a.getContext(), resourceId));
                }
            }
            if (obtainStyledAttributes.hasValue(android.support.v7.a.a.k.CompoundButton_buttonTint)) {
                b.a(this.a, obtainStyledAttributes.getColorStateList(android.support.v7.a.a.k.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(android.support.v7.a.a.k.CompoundButton_buttonTintMode)) {
                b.a(this.a, af.a(obtainStyledAttributes.getInt(android.support.v7.a.a.k.CompoundButton_buttonTintMode, -1), null));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    void a(ColorStateList colorStateList) {
        this.c = colorStateList;
        this.e = true;
        d();
    }

    ColorStateList a() {
        return this.c;
    }

    void a(Mode mode) {
        this.d = mode;
        this.f = true;
        d();
    }

    Mode b() {
        return this.d;
    }

    void c() {
        if (this.g) {
            this.g = false;
            return;
        }
        this.g = true;
        d();
    }

    void d() {
        Drawable a = b.a(this.a);
        if (a == null) {
            return;
        }
        if (this.e || this.f) {
            a = a.f(a).mutate();
            if (this.e) {
                a.a(a, this.c);
            }
            if (this.f) {
                a.a(a, this.d);
            }
            if (a.isStateful()) {
                a.setState(this.a.getDrawableState());
            }
            this.a.setButtonDrawable(a);
        }
    }

    int a(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a = b.a(this.a);
        if (a != null) {
            return i + a.getIntrinsicWidth();
        }
        return i;
    }
}
