package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.d.a.a;
import android.support.v4.widget.b;
import android.support.v7.appcompat.R;
import android.util.AttributeSet;
import android.widget.CompoundButton;

class k {
    private final CompoundButton a;
    private ColorStateList b = null;
    private Mode c = null;
    private boolean d = false;
    private boolean e = false;
    private boolean f;

    k(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    int a(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a = b.a(this.a);
        return a != null ? i + a.getIntrinsicWidth() : i;
    }

    ColorStateList a() {
        return this.b;
    }

    void a(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        d();
    }

    void a(Mode mode) {
        this.c = mode;
        this.e = true;
        d();
    }

    void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, R.styleable.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(R.styleable.CompoundButton_android_button)) {
                int resourceId = obtainStyledAttributes.getResourceId(R.styleable.CompoundButton_android_button, 0);
                if (resourceId != 0) {
                    this.a.setButtonDrawable(android.support.v7.a.a.b.b(this.a.getContext(), resourceId));
                }
            }
            if (obtainStyledAttributes.hasValue(R.styleable.CompoundButton_buttonTint)) {
                b.a(this.a, obtainStyledAttributes.getColorStateList(R.styleable.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.CompoundButton_buttonTintMode)) {
                b.a(this.a, aj.a(obtainStyledAttributes.getInt(R.styleable.CompoundButton_buttonTintMode, -1), null));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    Mode b() {
        return this.c;
    }

    void c() {
        if (this.f) {
            this.f = false;
            return;
        }
        this.f = true;
        d();
    }

    void d() {
        Drawable a = b.a(this.a);
        if (a == null) {
            return;
        }
        if (this.d || this.e) {
            a = a.f(a).mutate();
            if (this.d) {
                a.a(a, this.b);
            }
            if (this.e) {
                a.a(a, this.c);
            }
            if (a.isStateful()) {
                a.setState(this.a.getDrawableState());
            }
            this.a.setButtonDrawable(a);
        }
    }
}
