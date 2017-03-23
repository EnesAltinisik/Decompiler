package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.appcompat.R;
import android.support.v7.c.a;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

@TargetApi(9)
class x {
    final TextView a;
    private bj b;
    private bj c;
    private bj d;
    private bj e;

    x(TextView textView) {
        this.a = textView;
    }

    protected static bj a(Context context, l lVar, int i) {
        ColorStateList b = lVar.b(context, i);
        if (b == null) {
            return null;
        }
        bj bjVar = new bj();
        bjVar.d = true;
        bjVar.a = b;
        return bjVar;
    }

    static x a(TextView textView) {
        return VERSION.SDK_INT >= 17 ? new y(textView) : new x(textView);
    }

    void a() {
        if (this.b != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
    }

    void a(Context context, int i) {
        bl a = bl.a(context, i, R.styleable.TextAppearance);
        if (a.g(R.styleable.TextAppearance_textAllCaps)) {
            a(a.a(R.styleable.TextAppearance_textAllCaps, false));
        }
        if (VERSION.SDK_INT < 23 && a.g(R.styleable.TextAppearance_android_textColor)) {
            ColorStateList e = a.e(R.styleable.TextAppearance_android_textColor);
            if (e != null) {
                this.a.setTextColor(e);
            }
        }
        a.a();
    }

    final void a(Drawable drawable, bj bjVar) {
        if (drawable != null && bjVar != null) {
            l.a(drawable, bjVar, this.a.getDrawableState());
        }
    }

    void a(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        ColorStateList e;
        ColorStateList colorStateList = null;
        Context context = this.a.getContext();
        l a = l.a();
        bl a2 = bl.a(context, attributeSet, R.styleable.AppCompatTextHelper, i, 0);
        int g = a2.g(R.styleable.AppCompatTextHelper_android_textAppearance, -1);
        if (a2.g(R.styleable.AppCompatTextHelper_android_drawableLeft)) {
            this.b = a(context, a, a2.g(R.styleable.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a2.g(R.styleable.AppCompatTextHelper_android_drawableTop)) {
            this.c = a(context, a, a2.g(R.styleable.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a2.g(R.styleable.AppCompatTextHelper_android_drawableRight)) {
            this.d = a(context, a, a2.g(R.styleable.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a2.g(R.styleable.AppCompatTextHelper_android_drawableBottom)) {
            this.e = a(context, a, a2.g(R.styleable.AppCompatTextHelper_android_drawableBottom, 0));
        }
        a2.a();
        boolean z3 = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (g != -1) {
            bl a3 = bl.a(context, g, R.styleable.TextAppearance);
            if (z3 || !a3.g(R.styleable.TextAppearance_textAllCaps)) {
                z = false;
                z2 = false;
            } else {
                z2 = a3.a(R.styleable.TextAppearance_textAllCaps, false);
                z = true;
            }
            if (VERSION.SDK_INT < 23) {
                e = a3.g(R.styleable.TextAppearance_android_textColor) ? a3.e(R.styleable.TextAppearance_android_textColor) : null;
                if (a3.g(R.styleable.TextAppearance_android_textColorHint)) {
                    colorStateList = a3.e(R.styleable.TextAppearance_android_textColorHint);
                }
            } else {
                e = null;
            }
            a3.a();
        } else {
            e = null;
            z = false;
            z2 = false;
        }
        bl a4 = bl.a(context, attributeSet, R.styleable.TextAppearance, i, 0);
        if (!z3 && a4.g(R.styleable.TextAppearance_textAllCaps)) {
            z2 = a4.a(R.styleable.TextAppearance_textAllCaps, false);
            z = true;
        }
        if (VERSION.SDK_INT < 23) {
            if (a4.g(R.styleable.TextAppearance_android_textColor)) {
                e = a4.e(R.styleable.TextAppearance_android_textColor);
            }
            if (a4.g(R.styleable.TextAppearance_android_textColorHint)) {
                colorStateList = a4.e(R.styleable.TextAppearance_android_textColorHint);
            }
        }
        a4.a();
        if (e != null) {
            this.a.setTextColor(e);
        }
        if (colorStateList != null) {
            this.a.setHintTextColor(colorStateList);
        }
        if (!z3 && r0) {
            a(z2);
        }
    }

    void a(boolean z) {
        this.a.setTransformationMethod(z ? new a(this.a.getContext()) : null);
    }
}
