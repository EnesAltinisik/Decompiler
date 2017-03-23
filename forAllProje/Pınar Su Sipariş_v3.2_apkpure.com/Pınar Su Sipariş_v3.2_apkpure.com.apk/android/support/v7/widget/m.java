package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ae;
import android.support.v7.a.a.a;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: AppCompatEditText */
public class m extends EditText implements ae {
    private g mBackgroundTintHelper;
    private l mDrawableManager;
    private y mTextHelper;

    public m(Context context) {
        this(context, null);
    }

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.editTextStyle);
    }

    public m(Context context, AttributeSet attributeSet, int i) {
        super(aw.a(context), attributeSet, i);
        this.mDrawableManager = l.a();
        this.mBackgroundTintHelper = new g(this, this.mDrawableManager);
        this.mBackgroundTintHelper.a(attributeSet, i);
        this.mTextHelper = y.a((TextView) this);
        this.mTextHelper.a(attributeSet, i);
        this.mTextHelper.a();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.a(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.a(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.mBackgroundTintHelper != null ? this.mBackgroundTintHelper.a() : null;
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.a(mode);
        }
    }

    public Mode getSupportBackgroundTintMode() {
        return this.mBackgroundTintHelper != null ? this.mBackgroundTintHelper.b() : null;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.c();
        }
        if (this.mTextHelper != null) {
            this.mTextHelper.a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.mTextHelper != null) {
            this.mTextHelper.a(context, i);
        }
    }
}
