package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.b.b;
import android.support.v4.widget.ac;
import android.support.v7.a.a.a;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* compiled from: AppCompatCheckBox */
public class i extends CheckBox implements ac {
    private l a;
    private k b;

    public i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.checkboxStyle);
    }

    public i(Context context, AttributeSet attributeSet, int i) {
        super(aw.a(context), attributeSet, i);
        this.a = l.a();
        this.b = new k(this, this.a);
        this.b.a(attributeSet, i);
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.b != null) {
            this.b.c();
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(this.a != null ? this.a.a(getContext(), i) : b.getDrawable(getContext(), i));
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.b != null ? this.b.a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            this.b.a(colorStateList);
        }
    }

    public ColorStateList getSupportButtonTintList() {
        return this.b != null ? this.b.a() : null;
    }

    public void setSupportButtonTintMode(Mode mode) {
        if (this.b != null) {
            this.b.a(mode);
        }
    }

    public Mode getSupportButtonTintMode() {
        return this.b != null ? this.b.b() : null;
    }
}
