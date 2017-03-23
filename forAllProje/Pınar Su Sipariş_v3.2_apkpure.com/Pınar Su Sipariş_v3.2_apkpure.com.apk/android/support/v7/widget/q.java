package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ae;
import android.support.v7.a.a.a;
import android.util.AttributeSet;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

/* compiled from: AppCompatMultiAutoCompleteTextView */
public class q extends MultiAutoCompleteTextView implements ae {
    private static final int[] a = new int[]{16843126};
    private l b;
    private g c;
    private y d;

    public q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.autoCompleteTextViewStyle);
    }

    public q(Context context, AttributeSet attributeSet, int i) {
        super(aw.a(context), attributeSet, i);
        this.b = l.a();
        az a = az.a(getContext(), attributeSet, a, i, 0);
        if (a.f(0)) {
            setDropDownBackgroundDrawable(a.a(0));
        }
        a.a();
        this.c = new g(this, this.b);
        this.c.a(attributeSet, i);
        this.d = y.a((TextView) this);
        this.d.a(attributeSet, i);
        this.d.a();
    }

    public void setDropDownBackgroundResource(int i) {
        if (this.b != null) {
            setDropDownBackgroundDrawable(this.b.a(getContext(), i));
        } else {
            super.setDropDownBackgroundResource(i);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.c != null) {
            this.c.a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.c != null) {
            this.c.a(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.c != null) {
            this.c.a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.c != null ? this.c.a() : null;
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.c != null) {
            this.c.a(mode);
        }
    }

    public Mode getSupportBackgroundTintMode() {
        return this.c != null ? this.c.b() : null;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.c != null) {
            this.c.c();
        }
        if (this.d != null) {
            this.d.a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.d != null) {
            this.d.a(context, i);
        }
    }
}
